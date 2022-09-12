package com.pouffy.delightandspice;

import com.pouffy.delightandspice.init.BlockInit;
import com.pouffy.delightandspice.init.ItemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("delightandspice")



public class DelightAndSpice {
	
	public static final String MOD_ID = "delightandspice";
	
	public static final CreativeModeTab Spice_TAB = new CreativeModeTab(MOD_ID) {
		@Override
		@OnlyIn(Dist.CLIENT) 
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.RED_JALAPENO.get());
		}
	};
	
public DelightAndSpice() {
	
	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
	
	ItemInit.ITEMS.register(bus);
	
	BlockInit.BLOCKS.register(bus);
	
	MinecraftForge.EVENT_BUS.register(this);
}
}