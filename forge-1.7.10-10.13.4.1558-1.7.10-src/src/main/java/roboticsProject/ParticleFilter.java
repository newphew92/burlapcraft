package roboticsProject;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import burlap.oomdp.core.Domain;
import burlap.oomdp.core.states.State;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import edu.brown.cs.h2r.burlapcraft.BurlapCraft;
import edu.brown.cs.h2r.burlapcraft.dungeongenerator.Dungeon;
import edu.brown.cs.h2r.burlapcraft.helper.HelperActions;
import edu.brown.cs.h2r.burlapcraft.helper.HelperPos;
import edu.brown.cs.h2r.burlapcraft.stategenerator.StateGenerator;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import scala.actors.threadpool.Arrays;
import net.minecraft.server.*;
import net.minecraft.block.Block;
import java.util.Random;

public class ParticleFilter {
	Particle [] particles;
	Domain domain;
	State state;
	Dungeon dungeon;
	int [][][] map;
	HelperPos curPos;
	HelperActions helper;
	int numParticles;
	World world;
	Random rng;
	int beliefX;
	int beliefZ;
	int observedBlockId;
	double spreadDeviation;
	int  Direction [];
	public ParticleFilter( Domain domain, Dungeon dungeon, int [][][] map){
		this.numParticles = 10;
		this.domain = domain;
		this.dungeon = dungeon;
		this.state = StateGenerator.getCurrentState(domain, BurlapCraft.currentDungeon);
		this.map = map;
		this.curPos = HelperActions.getPlayerPosition(); 
		this.helper = new HelperActions();
//		this.world = FMLCommonHandler.instance().getMinecraftServerInstance().worldServerForDimension(0);
		this.world = Minecraft.getMinecraft().theWorld;
		this.rng = new Random();
		this.beliefX = this.curPos.x;
		this.beliefZ = this.curPos.z;
		this.spreadDeviation = 3;
		this.Direction =new int [] { -90, 180, 90, 0 };
		this.observedBlockId = Block.getIdFromBlock(world.getBlock(this.curPos.x, this.curPos.y, this.curPos.z));
		particles = new Particle [numParticles];
		for (int i = 0; i<numParticles; i++){
//			System.out.println(this.state);
			particles[i] = new Particle (state);
			particles[i].x = this.curPos.x;
			particles[i].y = this.curPos.y;
			particles[i].z = this.curPos.z;
			particles[i].weight = 1;
//			System.out.println(particles[i]);
		}
	}
	public void printPos(){
		System.out.println("You are at "+ this.curPos.x + "," + this.curPos.y + "," + this.curPos.z);
	}
	@SideOnly(Side.CLIENT)
	public void spawnParticle(int x, int z){
//		System.out.println("Spawning particles at"+x+","+curPos.y+0.5F+","+z);
		world.spawnParticle("flame", x, curPos.y + 0.5F, z, 0.0D, 0.0D, 0.0D);
	}
	public void updateObservation(int speedX, int speedZ){
		for (int i =0; i<numParticles; i++){
//			System.out.println("Particle at x"+particles[i].x);
//			System.out.println(particles[i]);
			int x = particles[i].x;
			int y = particles[i].y;
			int z = particles[i].z;
			Block blockAtParticle = world.getBlock(x,y,z);
			int blockAtParticleType = Block.getIdFromBlock(blockAtParticle);
			Block blockAtCur = world.getBlock(this.curPos.x, this.curPos.y, this.curPos.z);
			int blockAtCurType = Block.getIdFromBlock(blockAtCur);
			particles[i].weight=compareID(blockAtCurType, blockAtParticleType)+1/(compareDistance(x,y,z)+1);
//			System.out.println("Particle weight is" + particles[i].weight );
		}
	}
	public int compareID(int a, int b){
		if (a == b){
			return 1;
		}
		return 0;
	}
	public double compareDistance(int x, int y, int z){
		double temp = Math.pow(this.curPos.x-x,2)+Math.pow(this.curPos.y-y,2)+Math.pow(this.curPos.z,2);
		return Math.sqrt(temp);
	}
	
	public void resample(double x, double z){
		Particle[] old;
		double angleDeviation = 0.5;
		
//		ArrayList<Particle> listToSort = new ArrayList <Particle> ( Arrays.asList(particles));
//		Collections.sort(listToSort, new Comparator<Particle>(){
//			@Override
//			public int compare (Particle a, Particle b){
//				return a.compareTo(b);
//			}
//		});
		Arrays.sort(particles, new Comparator<Particle>(){
			@Override
			public int compare (Particle a, Particle b){
				return a.compareTo(b);
			}
		});

//		old = (Particle[]) listToSort.toArray(new Particle [listToSort.size()]);
		old = (Particle[]) Arrays.copyOf(particles, particles.length);
//		for (int i=0;i<numParticles;i++){
//			System.out.println("particles and particles weights"+particles[i]+"\n"+particles[i].weight);
//		}
//		for (int i=0;i<numParticles;i++){
//			System.out.println("old and old weights"+old[i]+"\n"+old[i].weight);
//		}
		for (int i =0; i<numParticles; i++){
			int index = (int) getNextExp(5, this.rng);
			particles[i] = new Particle (old[index].s);
			int veloZ =0;
			int veloX = 0;
			int tempy =Math.abs(HelperActions.getYawDirection());
			if (tempy==0){
				veloZ = -1;
				veloX = 0;
			}
			else if (tempy==1){
				veloZ = 0;
				veloX = -1;
			}
			else if (tempy ==3){
				veloZ = 0;
				veloX = 1;
			}
			else if (tempy ==2){
				veloZ = 1;
				veloX = 0;
			}
			double t = rng.nextGaussian();
			if (t>1){t=1;} else if (t<-1){t=-1;}
			particles[i].x = (int) (old[index].x + t + x*veloX);
//			System.out.println("new x: "+ particles[i].x+"dist: "+t+"x direction: "+ z*(int)Math.cos(Math.toRadians(getCurrentDirection())));
//			t = rng.nextGaussian();
			if (t>1){t=1;} else if (t<-1){t=-1;}
			
//			(int)Math.sin(Math.toRadians(getCurrentDirection()))
			particles[i].z = (int) (old[index].z - t - z*veloZ);
//			System.out.println("new z: "+ particles[i].z+"dist: "+t*0.5+"y direction: -"+ z*why);
			particles[i].weight = 1;
			particles[i].theta = (int) (rng.nextGaussian()*angleDeviation);
			spawnParticle (particles[i].x,particles[i].z);
//			System.out.println(index);
		}
//		for (int i=0;i<numParticles;i++){
//			System.out.println("remade and remade weights"+particles[i]+particles[i].weight);
//		}
	}
	public void belief (){
		int count = 1;
		int inc = particles[0].x;
		for (int i = 1; i<count; i++){
			inc += particles[i].x;
		}
		beliefX = inc/count;
		inc = particles[0].z;
		for (int i = 1; i<count; i++){
			inc += particles[i].y;
		}
		beliefZ = inc/count;
		world.spawnParticle("explode", beliefX, curPos.y, beliefZ, 0.0, 0.0, 0.0);
		if (spreadDeviation > 1){
			spreadDeviation = spreadDeviation - 1-1/particles[0].weight; 
		}
		else {
			spreadDeviation = 1;
		}
	}
	
	public void localize(){
//		for (int i=0; i<4;i++){
//			System.out.println(particles[i]);
//		}
//		updateObservation(1,1);
//		resample(1,1);
//		updateObservation(1,1);
		beliefX = curPos.x;
		beliefZ = curPos.z;
		for (int i=0;i<100;i++){
		updateObservation(1,1);
			resample(2,1.5);
			belief();
			try {
				Thread.sleep(500);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}
	}
	public double getNextExp(double lambda, Random rand) {
	    return  Math.log(1-rand.nextDouble())/(-lambda);
	}
	public int getCurrentDirection() {
    	int yaw = Math.abs(HelperActions.getYawDirection());
    	System.out.println("raw yaw is:"+yaw);
    	System.out.println("processed yaw is: "+Direction [yaw]);
    	return Direction [yaw];
	}
}
