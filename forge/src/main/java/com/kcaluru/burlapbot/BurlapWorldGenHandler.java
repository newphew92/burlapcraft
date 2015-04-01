package com.kcaluru.burlapbot;

import java.util.Random;

import com.kcaluru.burlapbot.helpers.BurlapAIHelper;
import com.kcaluru.burlapbot.items.ItemFinderWand;
import com.kcaluru.burlapbot.worldgen.WorldGenBurlapDungeon;

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

public class BurlapWorldGenHandler implements IWorldGenerator {

	private static Minecraft mc = Minecraft.getMinecraft();

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
		
		if(!BurlapMod.structCreated && mc.thePlayer != null) {
			
			int posX = (int) mc.thePlayer.posX;
			int posY = (int) mc.thePlayer.posY;
			int posZ = (int) mc.thePlayer.posZ;
			
			new WorldGenBurlapDungeon().generate(world, random, posX, posY + 10, posZ);

			BurlapMod.structCreated = true;
		}
		
	}

}
