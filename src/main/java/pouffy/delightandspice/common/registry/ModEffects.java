package pouffy.delightandspice.common.registry;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import pouffy.delightandspice.DelightAndSpice;
import pouffy.delightandspice.common.effect.SpicyEffect;

public class ModEffects {
    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, DelightAndSpice.MODID);
    public static final RegistryObject<MobEffect> SPICY = EFFECTS.register("spicy",
            () -> new SpicyEffect(MobEffectCategory.HARMFUL, 943602));
}
