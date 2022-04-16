package com.example.aquilonia.datagen;


import com.example.aquilonia.setup.Registration;
import net.minecraft.data.DataGenerator;

public class AquLootTables extends BaseLootTableProvider {

    public AquLootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
        lootTables.put(Registration.TIN_ORE.get(), createSilkTouchTable("tin_ore", Registration.TIN_ORE.get(), Registration.TIN_ORE_ITEM.get(), 1, 3));

    }
}

