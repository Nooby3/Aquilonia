package net.nooby.testmod.item;

import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.nooby.testmod.TestMod;
import net.nooby.testmod.item.custom.Flint_And_Steel_Boosted;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

//New Materials :

    public static  final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
            () -> new Item(new Item.Properties().group(ModItemGroup.AQUILONIA_GROUP)));

    public static  final RegistryObject<Item> FIRESTONE = ITEMS.register("firestone",
            () -> new Item(new Item.Properties().group(ModItemGroup.AQUILONIA_GROUP)));

    public static  final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties().group(ModItemGroup.AQUILONIA_GROUP)));

//Strange Items :

    public static  final RegistryObject<Item> FLINT_AND_STEEL_BOOSTED = ITEMS.register("flint_and_steel_boosted",
            () -> new Flint_And_Steel_Boosted(new Item.Properties().group(ModItemGroup.AQUILONIA_GROUP)
                    .maxDamage(8)));

//Amethyst Stuff

    public static  final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
            () -> new SwordItem(ModItemTier.AMETHYST,
                    2,
                    3f,
                    new Item.Properties().group(ModItemGroup.AQUILONIA_GROUP)
                    ));

    public static  final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
            () -> new PickaxeItem(ModItemTier.AMETHYST,
                    0,
                    -1f,
                    new Item.Properties().group(ModItemGroup.AQUILONIA_GROUP)
            ));

    public static  final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe",
            () -> new AxeItem(ModItemTier.AMETHYST,
                    5,
                    -2.3f,
                    new Item.Properties().group(ModItemGroup.AQUILONIA_GROUP)
            ));

    public static  final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe",
            () -> new HoeItem(ModItemTier.AMETHYST,
                    -12,
                    -2f,
                    new Item.Properties().group(ModItemGroup.AQUILONIA_GROUP)
            ));

    public static  final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel",
            () -> new ShovelItem(ModItemTier.AMETHYST,
                    -12,
                    -2f,
                    new Item.Properties().group(ModItemGroup.AQUILONIA_GROUP)
            ));

//Firestone Stuff

    public static  final RegistryObject<Item> FIRESTONE_SWORD = ITEMS.register("firestone_sword",
            () -> new SwordItem(ModItemTier.FIRESTONE,
                    2,
                    3f,
                    new Item.Properties().group(ModItemGroup.AQUILONIA_GROUP)
            ));

    public static  final RegistryObject<Item> FIRESONTE_PICKAXE = ITEMS.register("firestone_pickaxe",
            () -> new PickaxeItem(ModItemTier.FIRESTONE,
                    0,
                    -1f,
                    new Item.Properties().group(ModItemGroup.AQUILONIA_GROUP)
            ));

    public static  final RegistryObject<Item> FIRESTONE_AXE = ITEMS.register("firestone_axe",
            () -> new AxeItem(ModItemTier.FIRESTONE,
                    5,
                    -2.3f,
                    new Item.Properties().group(ModItemGroup.AQUILONIA_GROUP)
            ));

    public static  final RegistryObject<Item> FIRESTONE_HOE = ITEMS.register("firestone_hoe",
            () -> new HoeItem(ModItemTier.FIRESTONE,
                    -12,
                    -2f,
                    new Item.Properties().group(ModItemGroup.AQUILONIA_GROUP)
            ));

    public static  final RegistryObject<Item> FIRESTONE_SHOVEL = ITEMS.register("firestone_shovel",
            () -> new ShovelItem(ModItemTier.FIRESTONE,
                    -12,
                    -2f,
                    new Item.Properties().group(ModItemGroup.AQUILONIA_GROUP)
            ));
    
//Saphire stuff

    public static  final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(ModItemTier.SAPPHIRE,
                    2,
                    3f,
                    new Item.Properties().group(ModItemGroup.AQUILONIA_GROUP)
            ));

    public static  final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModItemTier.SAPPHIRE,
                    0,
                    -1f,
                    new Item.Properties().group(ModItemGroup.AQUILONIA_GROUP)
            ));

    public static  final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModItemTier.SAPPHIRE,
                    5,
                    2.3f,
                    new Item.Properties().group(ModItemGroup.AQUILONIA_GROUP)
            ));

    public static  final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModItemTier.SAPPHIRE,
                    -12,
                    -2f,
                    new Item.Properties().group(ModItemGroup.AQUILONIA_GROUP)
            ));

    public static  final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModItemTier.SAPPHIRE,
                    -12,
                    -2f,
                    new Item.Properties().group(ModItemGroup.AQUILONIA_GROUP)
            ));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
