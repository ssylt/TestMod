package com.botgob.testmod.init;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		GameRegistry.addSmelting(ModItems.OBSIDIAN_DUST, new ItemStack(ModItems.OBSIDIAN_INGOT, 1), 100f);
		GameRegistry.addSmelting(ModBlocks.OBSIDIAN_INGOT_BLOCK, new ItemStack(Items.DIAMOND, 2),  100f);
		GameRegistry.addSmelting(ModBlocks.TIN_ORE, new ItemStack(ModItems.TIN_INGOT, 1), 1.0f);
		GameRegistry.addSmelting(ModBlocks.COPPER_ORE, new ItemStack(ModItems.COPPER_INGOT, 1), 1.0f);
		
	}
}
