package com.botgob.testmod.util.handlers;

import com.botgob.testmod.entity.EntityNukePrimed;
import com.botgob.testmod.entity.render.RenderNukePrimed;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	public static void RegisterEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityNukePrimed.class, new IRenderFactory<EntityNukePrimed>() {
			@Override
			public Render<? super EntityNukePrimed> createRenderFor(RenderManager manager) {
				// TODO Auto-generated method stub
				return new RenderNukePrimed(manager);
			}
		});
	}
}
