package com.pouffy.delightandspice.init;

import com.google.common.base.Supplier;
import com.pouffy.delightandspice.DelightAndSpice;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,DelightAndSpice.MOD_ID);
	
	public static final RegistryObject<Item> RED_JALAPENO = register("red_jalapeno", () -> new Item(new Item.Properties().tab(DelightAndSpice.Spice_TAB)) );
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name, item);
}
}