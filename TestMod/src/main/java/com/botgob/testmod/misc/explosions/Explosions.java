package com.botgob.testmod.misc.explosions;

import com.botgob.testmod.init.ModBlocks;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.item.ItemExpireEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Explosions {
	@SubscribeEvent
	public void explode(ItemExpireEvent event) {
		if(event.getEntityItem().getItem().getItem() != Item.getItemFromBlock(ModBlocks.NUKE_BLOCK)) {return;}
		
		EntityItem exp = event.getEntityItem();
		event.getEntity().getEntityWorld().createExplosion(exp, exp.posX, exp.posY, exp.posZ, 4, true);
	}
}
