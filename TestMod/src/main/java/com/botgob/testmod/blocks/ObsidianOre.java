package com.botgob.testmod.blocks;

import java.util.Random;

import com.botgob.testmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class ObsidianOre extends BlockBase{

	public ObsidianOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(5.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe",3);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.OBSIDIAN_DUST;
	}
	@Override
	public int quantityDropped(Random rand) {
		int min = 1, max = 4;
		return rand.nextInt(max) + min;
	}
}
