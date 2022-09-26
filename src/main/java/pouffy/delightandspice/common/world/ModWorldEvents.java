package pouffy.delightandspice.common.world;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import pouffy.delightandspice.DelightAndSpice;
import pouffy.delightandspice.common.world.gen.ModTreeGeneration;

@Mod.EventBusSubscriber(modid = DelightAndSpice.MODID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModTreeGeneration.generateTrees(event);
    }
}
