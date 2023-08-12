package net.grace.motleysmusicdiscs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.grace.motleysmusicdiscs.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.ALLEYESONME_MUSICDISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.KOKOMO_MUSICDISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.UNDERPRESSURE_MUSICDISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUTTERCUP_MUSICDISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.WAP_MUSICDISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BODIES_MUSICDISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.HEARTOFGLASS_MUSICDISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.EVERYBODY_MUSICDISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALLSTAR_MUSICDISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.DANCINGQUEEN_MUSICDISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.FORTHEDAMAGEDCODA_MUSICDISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ABOUTDAMNTIME_MUSICDISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.COMEANDGETYOURLOVE_MUSICDISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROXANNE_MUSICDISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BREAKMYSTRIDE_MUSICDISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANOTHERONEBITESTHEDUST_MUSICDISC, Models.GENERATED);


    }
}
