package com.github.SPECIALPANCAKE6.CompuChests;

import com.github.SPECIALPANCAKE6.CompuChests.help.Reference;
import com.github.SPECIALPANCAKE6.CompuChests.init.ModBlocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class CompuChests
{
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModBlocks.init();
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{

	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}

}
