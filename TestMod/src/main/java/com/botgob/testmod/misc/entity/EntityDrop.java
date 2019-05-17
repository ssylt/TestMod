package com.botgob.testmod.misc.entity;

import java.util.Random;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EntityDrop {
	@SubscribeEvent
	public void dropFeather(LivingDeathEvent event) {
		if(!(event.getEntity() instanceof EntityZombie)) {
			return;
		}
		
		Random rand = new Random();
		
		if(!event.getEntity().world.isRemote) {
			event.getEntity().dropItem(Items.FEATHER, rand.nextInt(2));
		}
	}
}
