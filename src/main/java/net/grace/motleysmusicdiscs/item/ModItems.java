package net.grace.motleysmusicdiscs.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.grace.motleysmusicdiscs.MotleysMusicDiscs;
import net.grace.motleysmusicdiscs.sound.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item ALLEYESONME_MUSICDISC = registerItem("alleyesonme_musicdisc",
            new MusicDiscItem(9, ModSounds.ALLEYESONME, new FabricItemSettings().group(ModItemGroup.DISC_GROUP).maxCount(1).rarity(Rarity.RARE), 217));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MotleysMusicDiscs.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MotleysMusicDiscs.LOGGER.debug("Registering Mod Items for " + MotleysMusicDiscs.MOD_ID);
    }
}
