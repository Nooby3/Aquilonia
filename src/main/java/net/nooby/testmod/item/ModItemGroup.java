package net.nooby.testmod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup AQUILONIA_GROUP = new ItemGroup("testmodtab") {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.AMETHYST.get());
        }
    };

}
