package com.github.specialpancake6.compuchests.init;

import com.github.specialpancake6.compuchests.help.RegisterHelper;
import com.github.specialpancake6.compuchests.items.CompuChestsItem;

import net.minecraft.item.Item;

public class ModItems
{
	public static Item copperIngot = new CompuChestsItem().setUnlocalizedName("copperIngot");
	
	public static void init()
    {
		RegisterHelper.registerItem(copperIngot);
    }
}
