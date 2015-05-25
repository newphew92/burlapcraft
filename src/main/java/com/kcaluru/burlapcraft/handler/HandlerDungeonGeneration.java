package com.kcaluru.burlapcraft.handler;

import java.util.Random;

import com.kcaluru.burlapcraft.BurlapCraft;
import com.kcaluru.burlapcraft.dungeongenerator.DungeonGeneratorBridge;
import com.kcaluru.burlapcraft.dungeongenerator.DungeonGeneratorFinder;
import com.kcaluru.burlapcraft.helper.HelperActions;
import com.kcaluru.burlapcraft.helper.HelperPos;
import com.kcaluru.burlapcraft.item.ItemFinderWand;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.client.settings.KeyBinding;

public class HandlerDungeonGeneration implements IWorldGenerator {
	
	public static int finderX;
	public static int finderY;
	public static int finderZ;
	public static int bridgeX;
	public static int bridgeY;
	public static int bridgeZ;
	public static HelperPos playerSpawnPos;

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		// TODO Auto-generated method stub

		switch (world.provider.dimensionId) {

		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);

		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);

		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);

		}

	}

	private void generateEnd(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub

	}

	private void generateNether(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub

	}

	private void generateSurface(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		
		if(!BurlapCraft.structCreated && HelperActions.getMinecraft().thePlayer != null) {
			
			playerSpawnPos = HelperActions.getPlayerPosition();
			
			finderX = playerSpawnPos.x;
			finderY = playerSpawnPos.y + 40;
			finderZ = playerSpawnPos.z;
			bridgeX = playerSpawnPos.x + 40;
			bridgeY = playerSpawnPos.y + 40;
			bridgeZ = playerSpawnPos.z;
			
			new DungeonGeneratorFinder().generate(world, random, finderX, finderY, finderZ);
			new DungeonGeneratorBridge().generate(world, random, bridgeX, bridgeY, bridgeZ);

			BurlapCraft.structCreated = true;
			
		}
		
	}

}
