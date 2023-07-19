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
    public static final Item KOKOMO_MUSICDISC = registerItem("kokomo_musicdisc",
            new MusicDiscItem(9, ModSounds.KOKOMO, new FabricItemSettings().group(ModItemGroup.DISC_GROUP).maxCount(1).rarity(Rarity.RARE), 214));
    public static final Item UNDERPRESSURE_MUSICDISC = registerItem("underpressure_musicdisc",
            new MusicDiscItem(9, ModSounds.UNDERPRESSURE, new FabricItemSettings().group(ModItemGroup.DISC_GROUP).maxCount(1).rarity(Rarity.RARE), 243));
    public static final Item BUTTERCUP_MUSICDISC = registerItem("buttercup_musicdisc",
            new MusicDiscItem(9, ModSounds.BUTTERCUP, new FabricItemSettings().group(ModItemGroup.DISC_GROUP).maxCount(1).rarity(Rarity.RARE), 201));
    public static final Item WAP_MUSICDISC = registerItem("wap_musicdisc",
            new MusicDiscItem(9, ModSounds.WAP, new FabricItemSettings().group(ModItemGroup.DISC_GROUP).maxCount(1).rarity(Rarity.RARE), 188));
    public static final Item BODIES_MUSICDISC = registerItem("bodies_musicdisc",
            new MusicDiscItem(9, ModSounds.BODIES, new FabricItemSettings().group(ModItemGroup.DISC_GROUP).maxCount(1).rarity(Rarity.RARE), 200));
    public static final Item HEARTOFGLASS_MUSICDISC = registerItem("heartofglass_musicdisc",
            new MusicDiscItem(9, ModSounds.HEARTOFGLASS, new FabricItemSettings().group(ModItemGroup.DISC_GROUP).maxCount(1).rarity(Rarity.RARE), 202));
    public static final Item EVERYBODY_MUSICDISC = registerItem("everybody_musicdisc",
            new MusicDiscItem(9, ModSounds.EVERYBODY, new FabricItemSettings().group(ModItemGroup.DISC_GROUP).maxCount(1).rarity(Rarity.RARE), 223));
    public static final Item ALLSTAR_MUSICDISC = registerItem("allstar_musicdisc",
            new MusicDiscItem(9, ModSounds.ALLSTAR, new FabricItemSettings().group(ModItemGroup.DISC_GROUP).maxCount(1).rarity(Rarity.RARE), 223));
    public static final Item DANCINGQUEEN_MUSICDISC = registerItem("dancingqueen_musicdisc",
            new MusicDiscItem(9, ModSounds.DANCINGQUEEN, new FabricItemSettings().group(ModItemGroup.DISC_GROUP).maxCount(1).rarity(Rarity.RARE), 223));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MotleysMusicDiscs.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MotleysMusicDiscs.LOGGER.debug("Registering Mod Items for " + MotleysMusicDiscs.MOD_ID);
    }
}
