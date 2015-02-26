package com.github.specialpancake6.compuchests.blocks;

import com.github.specialpancake6.compuchests.help.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCopperOre extends Block
{
	public BlockCopperOre()
    {
            super(Material.iron);
            setBlockName("copperOre");
            setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
            setCreativeTab(CreativeTabs.tabBlock);
    }
}
