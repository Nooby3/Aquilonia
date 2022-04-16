package com.example.aquilonia.datagen;


import com.example.aquilonia.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class AquRecipes extends RecipeProvider {

    public AquRecipes(DataGenerator generator){super (generator);}

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.TIN_ORE_ITEM.get()),
                        Registration.TIN_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.TIN_ORE_ITEM.get()))
                .save(consumer, "tin_ingot1");
    }
}
