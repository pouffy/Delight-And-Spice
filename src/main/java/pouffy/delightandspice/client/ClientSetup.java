package pouffy.delightandspice.client;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import pouffy.delightandspice.common.registry.ModBlocks;


public class ClientSetup {
    public static void init(final FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WILD_JALAPENOS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JALAPENO_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OLIVE_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OLIVE_SAPLING.get(), RenderType.cutout());
    }
}
