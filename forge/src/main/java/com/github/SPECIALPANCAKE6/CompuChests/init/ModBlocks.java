package com.github.SPECIALPANCAKE6.CompuChests.init;

import com.github.SPECIALPANCAKE6.CompuChests.help.RegisterHelper;
import net.minecraft.block.Block;

public class ModBlocks
{
	public static Block chestMonitor = new BlockChestMonitor();
	
	public static void init()
    {
		RegisterHelper.registerBlock(chestMonitor);
    }
}
