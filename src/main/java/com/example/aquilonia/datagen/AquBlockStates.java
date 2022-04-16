package com.example.aquilonia.datagen;


import com.example.aquilonia.Aquilonia;
import com.example.aquilonia.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class AquBlockStates extends BlockStateProvider {

    public AquBlockStates(DataGenerator gen, ExistingFileHelper helper){super (gen, Aquilonia.MODID, helper);}

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registration.TIN_ORE.get());
    }
}
