package com.github.specialpancake6.compuchests;

import com.github.specialpancake6.compuchests.crafting.ModRecipes;
import com.github.specialpancake6.compuchests.generation.CompuChestsWorldGeneration;
import com.github.specialpancake6.compuchests.help.Reference;
import com.github.specialpancake6.compuchests.init.ModBlocks;
import com.github.specialpancake6.compuchests.init.ModItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class CompuChests
{
	CompuChestsWorldGeneration eventWorldGen = new CompuChestsWorldGeneration();
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
           ModItems.init();
           ModBlocks.init();
           GameRegistry.registerWorldGenerator(this.eventWorldGen, 0);
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		ModRecipes.init();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
