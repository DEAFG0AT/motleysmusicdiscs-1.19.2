package net.grace.motleysmusicdiscs.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.grace.motleysmusicdiscs.MotleysMusicDiscs;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItemGroup {
    public static final ItemGroup DISC_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MotleysMusicDiscs.MOD_ID, "disc_group"), () -> new ItemStack(ModItems.ALLEYESONME_MUSICDISC));





    public static void registerItemGroups() {
        MotleysMusicDiscs.LOGGER.info("Registering Item Groups for " + MotleysMusicDiscs.MOD_ID);
    }
}
