package pouffy.delightandspice.common.registry;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import pouffy.delightandspice.DelightAndSpice;
import pouffy.delightandspice.common.item.ExtraFoodValues;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.DrinkableItem;
import vectorwing.farmersdelight.common.item.FuelBlockItem;
@SuppressWarnings("unused")
public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DelightAndSpice.MODID);
    public static Item.Properties basicItem() {
        return new Item.Properties().tab(DelightAndSpice.CREATIVE_TAB);
    }

    public static Item.Properties foodItem(FoodProperties food) {
        return new Item.Properties().food(food).tab(DelightAndSpice.CREATIVE_TAB);
    }

    public static Item.Properties bowlFoodItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.BOWL).stacksTo(16).tab(DelightAndSpice.CREATIVE_TAB);
    }

    public static Item.Properties drinkItem() {
        return new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).stacksTo(16).tab(DelightAndSpice.CREATIVE_TAB);
    }
    //WILD CROPS
    public static final RegistryObject<Item> WILD_JALAPENOS = ITEMS.register("wild_jalapenos",
            () -> new BlockItem(ModBlocks.WILD_JALAPENOS.get(), new Item.Properties().tab(DelightAndSpice.CREATIVE_TAB)));
    //BLOCK ITEMS
    public static final RegistryObject<Item> OLIVE_PLANKS = ITEMS.register("olive_planks",
            () -> new BlockItem(ModBlocks.OLIVE_PLANKS.get(), new Item.Properties().tab(DelightAndSpice.CREATIVE_TAB)));
    public static final RegistryObject<Item> OLIVE_LEAVES = ITEMS.register("olive_leaves",
            () -> new BlockItem(ModBlocks.OLIVE_LEAVES.get(), new Item.Properties().tab(DelightAndSpice.CREATIVE_TAB)));
    public static final RegistryObject<Item> OLIVE_LOG = ITEMS.register("olive_log",
            () -> new BlockItem(ModBlocks.OLIVE_LOG.get(), new Item.Properties().tab(DelightAndSpice.CREATIVE_TAB)));
    public static final RegistryObject<Item> STRIPPED_OLIVE_LOG = ITEMS.register("stripped_olive_log",
            () -> new BlockItem(ModBlocks.STRIPPED_OLIVE_LOG.get(), new Item.Properties().tab(DelightAndSpice.CREATIVE_TAB)));
    public static final RegistryObject<Item> OLIVE_WOOD = ITEMS.register("olive_wood",
            () -> new BlockItem(ModBlocks.OLIVE_WOOD.get(), new Item.Properties().tab(DelightAndSpice.CREATIVE_TAB)));
    public static final RegistryObject<Item> STRIPPED_OLIVE_WOOD = ITEMS.register("stripped_olive_wood",
            () -> new BlockItem(ModBlocks.STRIPPED_OLIVE_WOOD.get(), new Item.Properties().tab(DelightAndSpice.CREATIVE_TAB)));
    public static final RegistryObject<Item> OLIVE_SAPLING = ITEMS.register("olive_sapling",
            () -> new BlockItem(ModBlocks.OLIVE_SAPLING.get(), new Item.Properties().tab(DelightAndSpice.CREATIVE_TAB)));
    public static final RegistryObject<Item> OLIVE_CABINET = ITEMS.register("olive_cabinet",
            () -> new FuelBlockItem(ModBlocks.OLIVE_CABINET.get(), new Item.Properties().tab(DelightAndSpice.CREATIVE_TAB), 300));
    public static final RegistryObject<Item> JALAPENO_POWDER_BAG = ITEMS.register("jalapeno_powder_bag",
            () -> new BlockItem(ModBlocks.JALAPENO_POWDER_BAG.get(), basicItem()));
    //NORMAL ITEMS
    public static final RegistryObject<Item> TAJINE_BASE = ITEMS.register("tajine_base",
            () -> new Item(new Item.Properties().stacksTo(16).tab(DelightAndSpice.CREATIVE_TAB)));
    public static final RegistryObject<Item> JALAPENO_POWDER = ITEMS.register("jalapeno_powder",
            () -> new Item(basicItem()));
    public static final RegistryObject<Item> DIABLO_GRANDE_POWDER = ITEMS.register("diablo_grande_powder",
            () -> new Item(basicItem()));
    public static final RegistryObject<Item> CHOPPED_CARROTS = ITEMS.register("chopped_carrots",
            () -> new Item(basicItem()));
    //SEEDS
    public static final RegistryObject<Item> JALAPENO_SEEDS = ITEMS.register("jalapeno_seeds",
            () -> new ItemNameBlockItem(ModBlocks.JALAPENO_CROP.get(), new Item.Properties().tab(DelightAndSpice.CREATIVE_TAB)));
    //DRINKS
    public static final RegistryObject<Item> CARROT_JUICE = ITEMS.register("carrot_juice",
            () -> new DrinkableItem(drinkItem().food(ExtraFoodValues.CARROT_JUICE)));
    public static final RegistryObject<Item> LEMON_JUICE = ITEMS.register("lemon_juice",
            () -> new DrinkableItem(drinkItem().food(ExtraFoodValues.LEMON_JUICE)));
    public static final RegistryObject<Item> OLIVE_OIL = ITEMS.register("olive_oil",
            () -> new DrinkableItem(drinkItem().food(ExtraFoodValues.OLIVE_OIL)));
//GENERIC FOOD ITEMS
    public static final RegistryObject<Item> GINGER_ROOTS = ITEMS.register("ginger_roots",
            () -> new Item(new Item.Properties().food(ExtraFoodValues.GINGER).tab(DelightAndSpice.CREATIVE_TAB)));
    public static final RegistryObject<Item> GARLIC = ITEMS.register("garlic",
            () -> new Item(new Item.Properties().food(ExtraFoodValues.GARLIC).tab(DelightAndSpice.CREATIVE_TAB)));

    public static final RegistryObject<Item> OLIVES = ITEMS.register("olives",
            () -> new ConsumableItem(new Item.Properties().food(ExtraFoodValues.OLIVES).tab(DelightAndSpice.CREATIVE_TAB), true, false));
    //SPECIAL FOODS
    public static final RegistryObject<Item> CHERMOULA = ITEMS.register("chermoula",
            () -> new DrinkableItem(new Item.Properties().food(ExtraFoodValues.CHERMOULA).craftRemainder(Items.BOWL).stacksTo(16).tab(DelightAndSpice.CREATIVE_TAB), true, false));
    public static final RegistryObject<Item> GOLDEN_CHILLI = ITEMS.register("golden_chilli",
            () -> new ConsumableItem(new Item.Properties().food(ExtraFoodValues.GOLDEN_CHILLI).tab(DelightAndSpice.CREATIVE_TAB), true, false));
//CHILLIS
public static final RegistryObject<Item> JALAPENO = ITEMS.register("jalapeno",
        () -> new ConsumableItem(new Item.Properties().food(ExtraFoodValues.JALAPENO).tab(DelightAndSpice.CREATIVE_TAB), true, false));
    public static final RegistryObject<Item> SMOKED_JALAPENO = ITEMS.register("smoked_jalapeno",
            () -> new ConsumableItem(new Item.Properties().food(ExtraFoodValues.SMOKED_JALAPENO).tab(DelightAndSpice.CREATIVE_TAB), true, false));
    public static final RegistryObject<Item> DIABLO_GRANDE = ITEMS.register("diablo_grande",
            () -> new ConsumableItem(new Item.Properties().food(ExtraFoodValues.DIABLO_GRANDE).tab(DelightAndSpice.CREATIVE_TAB), true, false));
    public static final RegistryObject<Item> SMOKED_DIABLO_GRANDE = ITEMS.register("smoked_diablo_grande",
            () -> new ConsumableItem(new Item.Properties().food(ExtraFoodValues.SMOKED_DIABLO_GRANDE).tab(DelightAndSpice.CREATIVE_TAB), true, false));
    public static final RegistryObject<Item> FAIRY_CHILLI = ITEMS.register("fairy_chilli",
            () -> new ConsumableItem(new Item.Properties().food(ExtraFoodValues.FAIRY_CHILLI).tab(DelightAndSpice.CREATIVE_TAB), true, false));

//FEASTS
public static final RegistryObject<Item> LAMB_TAJINE_BLOCK = ITEMS.register("lamb_tajine_block",
        () -> new BlockItem(ModBlocks.LAMB_TAJINE_BLOCK.get(), new Item.Properties().stacksTo(1).tab(DelightAndSpice.CREATIVE_TAB)));
    public static final RegistryObject<Item> LAMB_TAJINE = ITEMS.register("lamb_tajine",
            () -> new ConsumableItem(bowlFoodItem(ExtraFoodValues.LAMB_TAJINE), true));
}
