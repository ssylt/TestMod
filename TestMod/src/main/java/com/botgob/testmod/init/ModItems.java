package com.botgob.testmod.init;

import java.util.ArrayList;
import java.util.List;

import com.botgob.testmod.items.ItemBase;
import com.botgob.testmod.items.armor.ArmorBase;
import com.botgob.testmod.items.tools.ToolAxe;
import com.botgob.testmod.items.tools.ToolHoe;
import com.botgob.testmod.items.tools.ToolPickaxe;
import com.botgob.testmod.items.tools.ToolSpade;
import com.botgob.testmod.items.tools.ToolSword;
import com.botgob.testmod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material
	public static final ToolMaterial MATERIAL_OBSIDIAN = EnumHelper.addToolMaterial("material_obsidian", 3, 3000, 8.0f, 3.0f, 5);
	public static final ArmorMaterial ARMOR_MATERIAL_OBSIDIAN = EnumHelper.addArmorMaterial("armor_material_obsidian",
			Reference.MOD_ID + ":obsidian", 15, new int[] {3, 6, 8, 3},10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f);
	public static final ToolMaterial MATERIAL_COPPER = EnumHelper.addToolMaterial("material_copper", 2, 200, 6.0F, 2.0F, 14);
	public static final ToolMaterial MATERIAL_TIN = EnumHelper.addToolMaterial("material_tin", 2, 200, 6.0f, 2.0f, 14);
	public static final ToolMaterial MATERIAL_SUPERDIAMOND = EnumHelper.addToolMaterial("material_superdiamond",3 , 1561 * 3, 16.0F, 3.0F, 10);
	//Items
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item OBSIDIAN_DUST = new ItemBase("obsidian_dust");
	public static final Item TIN_INGOT = new ItemBase("tin_ingot");
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	//Tools
	//Obsidian
	public static final ItemSword OBSIDIAN_SWORD = new ToolSword("obsidian_sword", MATERIAL_OBSIDIAN);
	public static final ItemSpade OBSIDIAN_SHOVEL = new ToolSpade("obsidian_shovel", MATERIAL_OBSIDIAN);
	public static final ItemPickaxe OBSIDIAN_PICKAXE = new ToolPickaxe("obsidian_pickaxe", MATERIAL_OBSIDIAN);
	public static final ItemAxe OBSIDIAN_AXE = new ToolAxe("obsidian_axe", MATERIAL_OBSIDIAN);
	public static final ItemHoe OBSIDIAN_HOE = new ToolHoe("obsidian_hoe", MATERIAL_OBSIDIAN);
	//Copper and Tin
	public static final ItemSword TIN_SWORD = new ToolSword("tin_sword", MATERIAL_TIN);
	public static final ItemSpade TIN_SHOVEL = new ToolSpade("tin_shovel", MATERIAL_TIN);
	public static final ItemPickaxe TIN_PICKAXE = new ToolPickaxe("tin_pickaxe", MATERIAL_TIN);
	public static final ItemAxe TIN_AXE = new ToolAxe("tin_axe", MATERIAL_TIN);
	public static final ItemHoe TIN_HOE = new ToolHoe("tin_hoe", MATERIAL_TIN);
	public static final ItemSword COPPER_SWORD = new ToolSword("copper_sword", MATERIAL_COPPER);
	public static final ItemSpade COPPER_SHOVEL = new ToolSpade("copper_shovel", MATERIAL_COPPER);
	public static final ItemPickaxe COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", MATERIAL_COPPER);
	public static final ItemAxe COPPER_AXE = new ToolAxe("copper_axe", MATERIAL_COPPER);
	public static final ItemHoe COPPER_HOE = new ToolHoe("copper_hoe", MATERIAL_COPPER);
	//SuperDiamond
	public static final ItemPickaxe SUPERDIAMOND_PICKAXE = new ToolPickaxe("superdiamond_pickaxe", MATERIAL_SUPERDIAMOND);
	//Armor
	public static final Item OBSIDIAN_HELMET = new ArmorBase("obsidian_helmet", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.HEAD);
	public static final Item OBSIDIAN_CHESTPLATE = new ArmorBase("obsidian_chestplate", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.CHEST);
	public static final Item OBSIDIAN_LEGGINGS = new ArmorBase("obsidian_leggings", ARMOR_MATERIAL_OBSIDIAN, 2, EntityEquipmentSlot.LEGS);
	public static final Item OBSIDIAN_BOOTS = new ArmorBase("obsidian_boots", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.FEET);
	
	
}
