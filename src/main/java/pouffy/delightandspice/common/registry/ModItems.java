package pouffy.delightandspice.common.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import pouffy.delightandspice.DelightAndSpice;
import pouffy.delightandspice.common.item.ExtraFoodValues;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.DrinkableItem;
import vectorwing.farmersdelight.common.item.FuelBlockItem;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DelightAndSpice.MODID);
//FOOD ITEMS
    public static final RegistryObject<Item> JALAPENO = ITEMS.register("jalapeno",
            () -> new ConsumableItem(new Item.Properties().food(ExtraFoodValues.JALAPENO).tab(DelightAndSpice.CREATIVE_TAB), true, false));
    public static final RegistryObject<Item> FAIRY_CHILLI = ITEMS.register("fairy_chilli",
            () -> new ConsumableItem(new Item.Properties().food(ExtraFoodValues.FAIRY_CHILLI).tab(DelightAndSpice.CREATIVE_TAB), true, false));
    public static final RegistryObject<Item> CARROT_JUICE = ITEMS.register("carrot_juice",
            () -> new DrinkableItem(new Item.Properties().food(ExtraFoodValues.CARROT_JUICE).craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(16).tab(DelightAndSpice.CREATIVE_TAB), true, false));
    public static final RegistryObject<Item> WILD_JALAPENOS = ITEMS.register("wild_jalapenos",
            () -> new BlockItem(ModBlocks.WILD_JALAPENOS.get(), new Item.Properties().tab(DelightAndSpice.CREATIVE_TAB)));
    public static final RegistryObject<Item> CHERMOULA = ITEMS.register("chermoula",
            () -> new DrinkableItem(new Item.Properties().food(ExtraFoodValues.CHERMOULA).craftRemainder(Items.BOWL).stacksTo(16).tab(DelightAndSpice.CREATIVE_TAB), true, false));
    public static final RegistryObject<Item> GINGER_ROOTS = ITEMS.register("ginger_roots",
            () -> new Item(new Item.Properties().food(ExtraFoodValues.GINGER).tab(DelightAndSpice.CREATIVE_TAB)));
    public static final RegistryObject<Item> GARLIC = ITEMS.register("garlic",
            () -> new Item(new Item.Properties().food(ExtraFoodValues.GARLIC).tab(DelightAndSpice.CREATIVE_TAB)));
    public static final RegistryObject<Item> LEMON_JUICE = ITEMS.register("lemon_juice",
            () -> new DrinkableItem(new Item.Properties().food(ExtraFoodValues.LEMON_JUICE).craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(16).tab(DelightAndSpice.CREATIVE_TAB), true, false));
    public static final RegistryObject<Item> OLIVE_OIL = ITEMS.register("olive_oil",
            () -> new DrinkableItem(new Item.Properties().food(ExtraFoodValues.OLIVE_OIL).craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(16).tab(DelightAndSpice.CREATIVE_TAB), true, false));
    public static final RegistryObject<Item> LAMB_TAJINE_BLOCK = ITEMS.register("lamb_tajine_block",
            () -> new BlockItem(ModBlocks.LAMB_TAJINE_BLOCK.get(), new Item.Properties().stacksTo(1).tab(DelightAndSpice.CREATIVE_TAB)));
    public static final RegistryObject<Item> OLIVES = ITEMS.register("olives",
            () -> new ConsumableItem(new Item.Properties().food(ExtraFoodValues.OLIVES).tab(DelightAndSpice.CREATIVE_TAB), true, false));

    public static final RegistryObject<Item> LAMB_TAJINE = ITEMS.register("lamb_tajine",
            () -> new ConsumableItem(new Item.Properties().food(ExtraFoodValues.LAMB_TAJINE).craftRemainder(Items.BOWL).stacksTo(16).tab(DelightAndSpice.CREATIVE_TAB), true));
    //NORMAL ITEMS
    public static final RegistryObject<Item> TAJINE_BASE = ITEMS.register("tajine_base",
            () -> new Item(new Item.Properties().stacksTo(16).tab(DelightAndSpice.CREATIVE_TAB)));
    public static final RegistryObject<Item> JALAPENO_POWDER = ITEMS.register("jalapeno_powder",
            () -> new Item(new Item.Properties().tab(DelightAndSpice.CREATIVE_TAB)));
    public static final RegistryObject<Item> CHOPPED_CARROTS = ITEMS.register("chopped_carrots",
            () -> new Item(new Item.Properties().tab(DelightAndSpice.CREATIVE_TAB)));
    //SEEDS
    public static final RegistryObject<Item> JALAPENO_SEEDS = ITEMS.register("jalapeno_seeds", () -> new ItemNameBlockItem(ModBlocks.JALAPENO_CROP.get(), new Item.Properties().tab(DelightAndSpice.CREATIVE_TAB)));
    //BLOCK ITEMS
    public static final RegistryObject<Item> OLIVE_PLANKS = ITEMS.register("olive_planks",
            () -> new BlockItem(ModBlocks.OLIVE_PLANKS.get(), new Item.Properties().tab(DelightAndSpice.CREATIVE_TAB)));
    public static final RegistryObject<Item> OLIVE_LEAVES = ITEMS.register("olive_leaves",
            () -> new BlockItem(ModBlocks.OLIVE_LEAVES.get(), new Item.Properties().tab(DelightAndSpice.CREATIVE_TAB)));
    public static final RegistryObject<Item> OLIVE_LOG = ITEMS.register("olive_log",
            () -> new BlockItem(ModBlocks.OLIVE_LOG.get(), new Item.Properties().tab(DelightAndSpice.CREATIVE_TAB)));
    public static final RegistryObject<Item> OLIVE_SAPLING = ITEMS.register("olive_sapling",
            () -> new BlockItem(ModBlocks.OLIVE_SAPLING.get(), new Item.Properties().tab(DelightAndSpice.CREATIVE_TAB)));
    public static final RegistryObject<Item> OLIVE_CABINET = ITEMS.register("olive_cabinet",
            () -> new FuelBlockItem(ModBlocks.OLIVE_CABINET.get(), new Item.Properties().tab(DelightAndSpice.CREATIVE_TAB), 300));
}
