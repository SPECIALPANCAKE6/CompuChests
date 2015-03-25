package com.github.specialpancake6.compuchests.blocks;

import com.github.specialpancake6.compuchests.help.Reference;
import com.github.specialpancake6.compuchests.tabs.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCopperOre extends Block
{
	public BlockCopperOre()
    {
            super(Material.iron);
            setBlockName("copperOre");
            setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
            setCreativeTab(ModTabs.tabCompuChests);
            setStepSound(soundTypeStone);
  		  	setHardness(2.5F);
  		  	setResistance(10.0F);
  		  	setHarvestLevel("pickaxe", 2);
    }
}
