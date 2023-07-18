package net.grace.motleysmusicdiscs;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MotleysMusicDiscs.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MotleysMusicDiscs.LOGGER.debug("Registering Mod Items for " + MotleysMusicDiscs.MOD_ID);
    }

}
