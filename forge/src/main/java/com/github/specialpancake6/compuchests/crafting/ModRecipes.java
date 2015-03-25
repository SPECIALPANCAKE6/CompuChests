package com.github.specialpancake6.compuchests.crafting;

import net.minecraft.item.ItemStack;

import com.github.specialpancake6.compuchests.init.ModBlocks;
import com.github.specialpancake6.compuchests.init.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes
{
	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.copperOre, new ItemStack(ModItems.copperIngot), 0.8F);
	}
}
