package com.botgob.testmod.init;

import com.botgob.testmod.Main;
import com.botgob.testmod.entity.EntityNukePrimed;
import com.botgob.testmod.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {
	public static void registerEntities() {
		registerEntity("PrimedNuke", EntityNukePrimed.class, Reference.ENTITY_ENT, 50, 3143213, 000000);
	}
	private static void  registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
