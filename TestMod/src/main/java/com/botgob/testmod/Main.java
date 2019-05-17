package com.botgob.testmod;

import com.botgob.testmod.blocks.NukeBlock;
import com.botgob.testmod.init.EntityInit;
import com.botgob.testmod.init.ModBlocks;
import com.botgob.testmod.init.ModRecipes;
import com.botgob.testmod.misc.entity.EntityDrop;
import com.botgob.testmod.misc.explosions.Explosions;
import com.botgob.testmod.proxy.CommonProxy;
import com.botgob.testmod.util.Reference;
import com.botgob.testmod.util.handlers.RenderHandler;
import com.botgob.testmod.world.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
		EntityInit.registerEntities();
		RenderHandler.RegisterEntityRenders();
	}
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		ModRecipes.init();
	}
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new EntityDrop());
	}
	
	public static CreativeTabs tabTestmod = new CreativeTabs("tab_testmod") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModBlocks.OBSIDIAN_INGOT_BLOCK);
		}
	};
	
}
