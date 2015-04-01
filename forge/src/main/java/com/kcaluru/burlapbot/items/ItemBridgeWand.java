package com.kcaluru.burlapbot.items;

import com.kcaluru.burlapbot.BurlapMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;

public class ItemBridgeWand extends Item {

	// name of item
	private String name = "bridgewand";
//	public static int actualDestX;
//	public static int actualDestZ;
	
	
	public ItemBridgeWand() {
		// give the item a name
		setUnlocalizedName(BurlapMod.MODID + "_" + name);
		
		// add the item to misc tab
		setCreativeTab(CreativeTabs.tabCombat);
		
		// set texture
		setTextureName(BurlapMod.MODID + ":" + name);
	}
	
	@Override
	public boolean onItemUseFirst(ItemStack itemstack, EntityPlayer player, World world, 
			 int x, int y, int z, int side, float px, float py, float pz) {
		
		int posX = (int) player.posX;
		int posY = (int) player.posY;
		int posZ = (int) player.posZ;
		
		Chunk curChunk = world.getChunkFromBlockCoords(posX, posZ);
		
		System.out.println(curChunk.xPosition);
		System.out.println(curChunk.zPosition);
		
		System.out.println(player.chunkCoordX);
		System.out.println(player.chunkCoordY);
		System.out.println(player.chunkCoordZ);
		
		return true;
	}
	
}
