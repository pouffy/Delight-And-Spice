package pouffy.delightandspice.common.world;

import net.minecraft.core.Holder;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.placement.*;

import pouffy.delightandspice.DelightAndSpice;
import pouffy.delightandspice.common.Configuration;
import pouffy.delightandspice.common.registry.ModBlocks;

import vectorwing.farmersdelight.common.world.WildCropGeneration;

import java.util.List;

public class ExtraWildCropGeneration extends WildCropGeneration {

    static Holder<PlacedFeature> registerPlacement(ResourceLocation id, Holder<? extends ConfiguredFeature<?, ?>> feature, PlacementModifier... modifiers) {
        return BuiltinRegistries.register(BuiltinRegistries.PLACED_FEATURE, id, new PlacedFeature(Holder.hackyErase(feature), List.of(modifiers)));
    }
    public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FEATURE_PATCH_WILD_JALAPENOS;
    public static Holder<PlacedFeature> PATCH_WILD_JALAPENOS;

    public static void registerWildCropGeneration() {
        FEATURE_PATCH_WILD_JALAPENOS = register(new ResourceLocation(DelightAndSpice.MODID, "patch_wild_jalapenos"),
                Feature.RANDOM_PATCH, getWildCropConfiguration(ModBlocks.WILD_JALAPENOS.get(), 64, 4, BlockPredicate.matchesBlocks(List.of(Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.COARSE_DIRT), BLOCK_BELOW)));
        PATCH_WILD_JALAPENOS = registerPlacement(new ResourceLocation("patch_wild_jalapenos"),
                FEATURE_PATCH_WILD_JALAPENOS, RarityFilter.onAverageOnceEvery(Configuration.CHANCE_WILD_JALAPENOS.get()), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    }
}
