package com.example.aquilonia.datagen;


import com.example.aquilonia.Aquilonia;
import com.example.aquilonia.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.LanguageProvider;

import static com.example.aquilonia.setup.ModSetup.TAB_NAME;

public class AquLanguageProvider extends LanguageProvider {

    public AquLanguageProvider(DataGenerator generator, String locale){super (generator, Aquilonia.MODID, locale);}

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "Aquilonia");

        add(Registration.TIN_ORE.get(), "Tin Ore");

        add(Registration.TIN_INGOT.get(), "Tin Ingot");
    }
}
