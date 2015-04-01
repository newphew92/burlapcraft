package com.kcaluru.burlapbot;

import com.kcaluru.burlapbot.blocks.BlockBurlapStone;
import com.kcaluru.burlapbot.items.ItemBridgeWand;
import com.kcaluru.burlapbot.items.ItemFinderWand;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = BurlapMod.MODID, version = BurlapMod.VERSION)
public class BurlapMod {
	
	// mod information
    public static final String MODID = "burlapmod";
    public static final String VERSION = "1.0";
    
    // dungeon generation variable
    public static boolean structCreated = false;
    
    // items
    public static Item finderWand;
    public static Item bridgeWand;
    
    // blocks
    public static Block burlapStone;
    
    // event handlers
    BurlapWorldGenHandler genHandler = new BurlapWorldGenHandler();
    BurlapEventHandler eventHandler = new BurlapEventHandler();
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
    	finderWand = new ItemFinderWand();
    	bridgeWand = new ItemBridgeWand();
    	burlapStone = new BlockBurlapStone();
    	
    	// make sure minecraft knows
    	GameRegistry.registerItem(finderWand, "finderwand");
    	GameRegistry.registerItem(bridgeWand, "bridgewand");
    	GameRegistry.registerBlock(burlapStone, "BurlapStone");
    	GameRegistry.registerWorldGenerator(genHandler, 0);
    	MinecraftForge.EVENT_BUS.register(eventHandler);
    	
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    }
    
}
