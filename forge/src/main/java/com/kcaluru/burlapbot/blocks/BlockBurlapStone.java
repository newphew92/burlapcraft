package com.kcaluru.burlapbot.blocks;

import java.util.Random;

import com.kcaluru.burlapbot.BurlapMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class BlockBurlapStone extends Block {
	
	// name of block
	private String name = "burlapstone";
	private Item drop;

	public BlockBurlapStone() {
		
		super(Material.rock);
		setBlockName(BurlapMod.MODID + "_" + name);
		setBlockTextureName(BurlapMod.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabBlock);
		
		this.setHardness(0.5f);
		
		setStepSound(soundTypeStone);
		
	}
	
	@Override
	public Item getItemDropped(int meta, Random random, int fortune) {
	    return Item.getItemFromBlock(this);
	}

	@Override
	public int damageDropped(int metadata) {
	    return 0;
	}

	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
	    return 1;
	}

}
