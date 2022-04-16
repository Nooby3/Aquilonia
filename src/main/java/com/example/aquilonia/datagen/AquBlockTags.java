package com.example.aquilonia.datagen;


import com.example.aquilonia.Aquilonia;
import com.example.aquilonia.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class AquBlockTags extends BlockTagsProvider {

    public AquBlockTags(DataGenerator generator, ExistingFileHelper helper){super (generator, Aquilonia.MODID, helper);}

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.TIN_ORE.get());
        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(Registration.TIN_ORE.get());
        tag(Tags.Blocks.ORES)
                .add(Registration.TIN_ORE.get());
    }

    @Override
    public String getName() {return "Aquilonia Tags";}
}
