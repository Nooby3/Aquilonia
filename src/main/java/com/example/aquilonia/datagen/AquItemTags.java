package com.example.aquilonia.datagen;


import com.example.aquilonia.Aquilonia;
import com.example.aquilonia.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class AquItemTags extends ItemTagsProvider {

    public AquItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {super (generator, blockTags, Aquilonia.MODID, helper);}

    @Override
    protected void addTags() {
        tag(Tags.Items.ORES)
                .add(Registration.TIN_ORE_ITEM.get());

        tag(Tags.Items.INGOTS)
                .add(Registration.TIN_INGOT.get());

    }

    @Override
    public String getName() {return "Aquilonia Tags";}

}
