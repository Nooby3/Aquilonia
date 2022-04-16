package com.example.aquilonia.setup;

import com.example.aquilonia.Aquilonia;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.example.aquilonia.Aquilonia.MODID;

public class Registration {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);



    public static void init() {

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);

    }
    //Properties
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);

    //Ores
    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength((2f))));
    public static final RegistryObject<Item> TIN_ORE_ITEM = fromBlock(TIN_ORE);
    //Powder
    public static final RegistryObject<Item> TIN_POWDER = ITEMS.register("tin_powder",()-> new Item(ITEM_PROPERTIES));
    //Ingot
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",()-> new Item(ITEM_PROPERTIES));
    //Tags
    //public static final Tags.IOptionalNamedTag<Block> TIN_ORE = BlockTags.createOptional(new ResourceLocation(Aquilonia.MODID, "tin_ore"));

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block){
        return ITEMS.register(block.getId().getPath(), ()-> new BlockItem(block.get(), ITEM_PROPERTIES));
    }



}
