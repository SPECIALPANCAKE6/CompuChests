package com.github.specialpancake6.compuchests.init;

import com.github.specialpancake6.compuchests.blocks.BlockCopperOre;
import com.github.specialpancake6.compuchests.help.RegisterHelper;

import net.minecraft.block.Block;

public class ModBlocks
{
	public static Block copperOre = new BlockCopperOre();
	
	public static void init()
    {
		RegisterHelper.registerBlock(copperOre);
    }
}
