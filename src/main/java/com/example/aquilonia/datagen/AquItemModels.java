package com.example.aquilonia.datagen;


import com.example.aquilonia.Aquilonia;
import com.example.aquilonia.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class AquItemModels extends ItemModelProvider {

    public AquItemModels(DataGenerator gen, ExistingFileHelper helper){super (gen, Aquilonia.MODID, helper);}

    @Override
    protected void registerModels(){
        withExistingParent(Registration.TIN_ORE_ITEM.get().getRegistryName().getPath(),modLoc("block/tin_ore"));

        singleTexture(Registration.TIN_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/tin_ingot"));
    }
}
