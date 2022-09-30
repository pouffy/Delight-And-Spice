package pouffy.delightandspice.common.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import pouffy.delightandspice.common.registry.ModEffects;
import vectorwing.farmersdelight.common.FoodValues;

public class ExtraFoodValues extends FoodValues {
    public static final FoodProperties CARROT_JUICE = (new FoodProperties.Builder()).effect(() -> {
        return new MobEffectInstance(MobEffects.NIGHT_VISION, 1200, 0);
    }, 1.0F).build();
    public static final FoodProperties JALAPENO = (new FoodProperties.Builder()).effect(() -> {
        return new MobEffectInstance(ModEffects.SPICY.get(), 200, 0);
    }, 1.0F).nutrition(2).build();
    public static final FoodProperties FAIRY_CHILLI = (new FoodProperties.Builder()).effect(() -> {
        return new MobEffectInstance(ModEffects.SPICY.get(), 600, 0);
    }, 1.0F).nutrition(2).build();
    public static final FoodProperties CHERMOULA = (new FoodProperties.Builder()).effect(() -> {
        return new MobEffectInstance(vectorwing.farmersdelight.common.registry.ModEffects.COMFORT.get(), 3600, 0);
    }, 1.0F).nutrition(2).build();
    public static final FoodProperties OLIVES = (new FoodProperties.Builder()).effect(() -> {
        return new MobEffectInstance(MobEffects.REGENERATION, 100, 0);
    }, 0.3F).build();
    public static final FoodProperties GINGER = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).build();
    public static final FoodProperties GARLIC = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.4F).build();
    public static final FoodProperties LEMON_JUICE = (new FoodProperties.Builder()).effect(() -> {
        return new MobEffectInstance(MobEffects.CONFUSION, 600, 0);
    }, 1.0F).build();
    public static final FoodProperties OLIVE_OIL = (new FoodProperties.Builder()).effect(() -> {
        return new MobEffectInstance(MobEffects.REGENERATION, 200, 0);
    }, 1.0F).build();
    public static final FoodProperties LAMB_TAJINE = (new FoodProperties.Builder()).effect(() -> {
        return new MobEffectInstance(vectorwing.farmersdelight.common.registry.ModEffects.NOURISHMENT.get(), 6000, 0);
    }, 1.0F).nutrition(12).saturationMod(6).build();
}
