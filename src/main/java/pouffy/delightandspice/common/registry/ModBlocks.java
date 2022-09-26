package pouffy.delightandspice.common.registry;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import pouffy.delightandspice.DelightAndSpice;
import pouffy.delightandspice.common.block.JalapenoBlock;
import pouffy.delightandspice.common.block.LambTajineBlock;
import pouffy.delightandspice.common.block.PlankBlock;
import pouffy.delightandspice.common.world.feature.tree.OliveTreeGrower;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.block.CabinetBlock;
import vectorwing.farmersdelight.common.block.WildCropBlock;

import java.util.function.ToIntFunction;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DelightAndSpice.MODID);

    private static ToIntFunction<BlockState> litBlockEmission(int lightValue) {
        return (state) -> state.getValue(BlockStateProperties.LIT) ? lightValue : 0;
    }
    //WILD CROPS
    public static final RegistryObject<Block> WILD_JALAPENOS = BLOCKS.register("wild_jalapenos",
            () -> new WildCropBlock(MobEffects.FIRE_RESISTANCE, 10, Block.Properties.copy(Blocks.TALL_GRASS)));
    //CROPS
    public static final RegistryObject<Block> JALAPENO_CROP = BLOCKS.register("jalapenos",
            () -> new JalapenoBlock(Block.Properties.copy(Blocks.WHEAT)));
    //FEASTS
    public static final RegistryObject<Block> LAMB_TAJINE_BLOCK = BLOCKS.register("lamb_tajine_block",
            () -> new LambTajineBlock(Block.Properties.copy(Blocks.WHITE_WOOL), ModItems.LAMB_TAJINE, true));
    //DECORATIONAL
    public static final RegistryObject<Block> OLIVE_PLANKS = BLOCKS.register("olive_planks",
            () -> new PlankBlock(Block.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OLIVE_LEAVES = BLOCKS.register("olive_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> OLIVE_SAPLING = BLOCKS.register("olive_sapling",
            () -> new SaplingBlock(new OliveTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> OLIVE_LOG = BLOCKS.register("olive_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> OLIVE_CABINET = BLOCKS.register("olive_cabinet",
            () -> new CabinetBlock(Block.Properties.copy(Blocks.BARREL)));
}
