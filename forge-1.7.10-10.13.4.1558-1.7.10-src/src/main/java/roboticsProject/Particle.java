package roboticsProject;
import burlap.oomdp.core.states.State;

import edu.brown.cs.h2r.burlapcraft.helper.HelperGeometry;
import edu.brown.cs.h2r.burlapcraft.helper.HelperNameSpace;

import java.util.Comparator;

import burlap.oomdp.core.objects.ObjectInstance;

public class Particle implements Comparable<Particle> {
	int x;
	int y;
	int z;
	int theta;
	double weight;
	State s;
	HelperGeometry.Pose agentPose;
	public Particle (State s){
		this.s = s;
		ObjectInstance agent = s.getFirstObjectOfClass(HelperNameSpace.CLASSAGENT);
		this.x = agent.getIntValForAttribute(HelperNameSpace.ATX);
		this.y = agent.getIntValForAttribute(HelperNameSpace.ATY);
		this.z = agent.getIntValForAttribute(HelperNameSpace.ATZ);
		this.agentPose = HelperGeometry.Pose.fromXyz(x, y, z);
		this.theta = agent.getIntValForAttribute(HelperNameSpace.ATROTDIR);
		this.weight =1;
	}
	
	public static Comparator<Particle> ParticleComparator = new Comparator <Particle>(){
		public int compare(Particle a, Particle b){
			return (int)a.compareTo(b);
		}
	};
	
	@Override
	public int compareTo(Particle p){
		if (this.weight == p.weight){
			return 0;
		}
		else if (this.weight > p.weight){
			return -1;
		}
		return 1;
	}
	
	
}
