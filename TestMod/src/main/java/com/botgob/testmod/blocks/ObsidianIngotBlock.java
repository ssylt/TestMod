package com.botgob.testmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ObsidianIngotBlock extends BlockBase{

	public ObsidianIngotBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(6000.0f);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(0f);
		setLightOpacity(0);
		
	}
	
}
