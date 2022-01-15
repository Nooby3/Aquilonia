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



    public static  final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
            () -> new Item(new Item.Properties().group(ModItemGroup.AQUILONIA_GROUP)));


    public static  final RegistryObject<Item> FLINT_AND_STEEL_BOOSTED = ITEMS.register("flint_and_steel_boosted",
            () -> new Flint_And_Steel_Boosted(new Item.Properties().group(ModItemGroup.AQUILONIA_GROUP)
                    .maxDamage(8)));


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


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
