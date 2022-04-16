package com.example.aquilonia.datagen;


import com.example.aquilonia.Aquilonia;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Aquilonia.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new AquRecipes(generator));
            //generator.addProvider(new AquLootTables(generator));
            AquBlockTags blockTags = new AquBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new AquItemTags(generator, blockTags,event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(new AquBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new AquItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new AquLanguageProvider(generator, "en_us"));
        }
    }
}
