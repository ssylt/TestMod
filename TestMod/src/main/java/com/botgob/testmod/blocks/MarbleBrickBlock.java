package com.botgob.testmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MarbleBrickBlock extends BlockBase{

	public MarbleBrickBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(3.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe",1);
	}
	
}
