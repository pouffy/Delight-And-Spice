package pouffy.delightandspice.common;

import net.minecraftforge.common.ForgeConfigSpec;

public class Configuration {
    public static ForgeConfigSpec COMMON_CONFIG;
    public static ForgeConfigSpec CLIENT_CONFIG;


    public static final String CATEGORY_WORLD = "world";
    public static ForgeConfigSpec.BooleanValue GENERATE_WILD_JALAPENOS;
    public static ForgeConfigSpec.IntValue CHANCE_WILD_JALAPENOS;

    static{
        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
        COMMON_BUILDER.comment("World generation").push(CATEGORY_WORLD);
        COMMON_BUILDER.comment("Tomato Vines generation").push("wild_tomatoes");
        GENERATE_WILD_JALAPENOS = COMMON_BUILDER.comment("Generate wild jalapenos on arid biomes (temperature 1.0 or higher)")
                .define("genWildTomatoes", true);
        CHANCE_WILD_JALAPENOS = COMMON_BUILDER.comment("Chance of generating clusters. Smaller value = more frequent.")
                .defineInRange("chance", 100, 0, Integer.MAX_VALUE);
        COMMON_BUILDER.pop();
    }
}
