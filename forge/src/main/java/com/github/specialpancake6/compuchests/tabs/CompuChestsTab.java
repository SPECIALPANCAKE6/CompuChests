package com.github.specialpancake6.compuchests.tabs;

import com.github.specialpancake6.compuchests.init.ModItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CompuChestsTab extends CreativeTabs
{
	String name;
	
	public CompuChestsTab(int par1, String par2Str)
	{
		super(par1, par2Str);
		this.name = par2Str;
	}
	
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
		if (this.name == "tabCompuChests") 
		{
			return ModItems.copperIngot;
		} 
		else 
		return null;
	}
}

