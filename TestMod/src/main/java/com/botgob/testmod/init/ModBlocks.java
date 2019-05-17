package com.botgob.testmod.init;

import java.util.ArrayList;
import java.util.List;

import com.botgob.testmod.blocks.BlockBase;
import com.botgob.testmod.blocks.CopperOre;
import com.botgob.testmod.blocks.MarbleBlock;
import com.botgob.testmod.blocks.MarbleBrickBlock;
import com.botgob.testmod.blocks.NukeBlock;
import com.botgob.testmod.blocks.ObsidianIngotBlock;
import com.botgob.testmod.blocks.ObsidianOre;
import com.botgob.testmod.blocks.RubyBlock;
import com.botgob.testmod.blocks.TinOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block OBSIDIAN_INGOT_BLOCK = new ObsidianIngotBlock("obsidian_ingot_block", Material.IRON);
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block OBSIDIAN_ORE = new ObsidianOre("obsidian_ore", Material.ROCK);
	public static final Block TIN_ORE = new TinOre("tin_ore", Material.ROCK);
	public static final Block COPPER_ORE = new CopperOre("copper_ore", Material.ROCK);
	public static final Block NUKE_BLOCK = new NukeBlock("nuke_block", Material.TNT);
	public static final Block MARBLE_BLOCK = new MarbleBlock("marble_block", Material.ROCK);
	public static final Block MARBLE_BRICK_BLOCK = new MarbleBrickBlock("marble_brick_block", Material.ROCK);
}
