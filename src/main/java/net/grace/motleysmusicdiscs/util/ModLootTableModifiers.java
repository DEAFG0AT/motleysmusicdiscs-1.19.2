package net.grace.motleysmusicdiscs.util;


import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.grace.motleysmusicdiscs.item.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {

    private static final Identifier BURIED_TREASURE_STRUCTURE_ID
            = new Identifier("minecraft", "chests/buried_treasure");
    private static final Identifier SHIPWRECK_TREASURE_STRUCTURE_ID
            = new Identifier("minecraft", "chests/shipwreck_treasure");
    private static final Identifier END_CITY_TREASURE_STRUCTURE_ID
            = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier DESERT_PYRAMID_STRUCTURE_ID
            = new Identifier("minecraft", "chests/desert_pyramid");
    private static final Identifier BASTION_TREASURE_STRUCTURE_ID
            = new Identifier("minecraft", "chests/bastion_treasure");
    private static final Identifier VILLAGE_FLETCHER_STRUCTURE_ID
            = new Identifier("minecraft", "chests/village_fletcher");
    private static final Identifier SIMPLE_DUNGEON_STRUCTURE_ID
            = new Identifier("minecraft", "chests/simple_dungeon");
    private static final Identifier BASTION_BRIDGE_STRUCTURE_ID
            = new Identifier("minecraft", "chests/bastion_bridge");
    private static final Identifier WOODLAND_MANSION_STRUCTURE_ID
            = new Identifier("minecraft", "chests/woodland_mansion");
    private static final Identifier STRONGHOLD_CROSSING_STRUCTURE_ID
            = new Identifier("minecraft", "chests/stronghold_crossing");
    private static final Identifier NETHER_BRIDGE_STRUCTURE_ID
            = new Identifier("minecraft", "chests/nether_bridge");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {

            if(BURIED_TREASURE_STRUCTURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.KOKOMO_MUSICDISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(SHIPWRECK_TREASURE_STRUCTURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.BREAKMYSTRIDE_MUSICDISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(END_CITY_TREASURE_STRUCTURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.FORTHEDAMAGEDCODA_MUSICDISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build())
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.COMEANDGETYOURLOVE_MUSICDISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(DESERT_PYRAMID_STRUCTURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.ANOTHERONEBITESTHEDUST_MUSICDISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build())
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.ROXANNE_MUSICDISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(BASTION_TREASURE_STRUCTURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.BODIES_MUSICDISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build())
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.KILLERQUEEN_MUSICDISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(BASTION_BRIDGE_STRUCTURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.UNDERPRESSURE_MUSICDISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build())
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.WAP_MUSICDISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(VILLAGE_FLETCHER_STRUCTURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.ARTHUR_MUSICDISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(SIMPLE_DUNGEON_STRUCTURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.1f)) // Drops 10% of the time
                        .with(ItemEntry.builder(ModItems.HEARTOFGLASS_MUSICDISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build())
                        .conditionally(RandomChanceLootCondition.builder(.1f)) // Drops 10% of the time
                        .with(ItemEntry.builder(ModItems.ALLEYESONME_MUSICDISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build())
                        .conditionally(RandomChanceLootCondition.builder(.1f)) // Drops 10% of the time
                        .with(ItemEntry.builder(ModItems.DANCINGQUEEN_MUSICDISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build())
                        .conditionally(RandomChanceLootCondition.builder(.1f)) // Drops 10% of the time
                        .with(ItemEntry.builder(ModItems.BEZOSI_MUSICDISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build())
                        .conditionally(RandomChanceLootCondition.builder(.1f)) // Drops 10% of the time
                        .with(ItemEntry.builder(ModItems.BEZOSII_MUSICDISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build())
                        .conditionally(RandomChanceLootCondition.builder(.1f)) // Drops 10% of the time
                        .with(ItemEntry.builder(ModItems.RASPUTIN_MUSICDISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(WOODLAND_MANSION_STRUCTURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.EVERYBODY_MUSICDISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(STRONGHOLD_CROSSING_STRUCTURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.ALLSTAR_MUSICDISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(NETHER_BRIDGE_STRUCTURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.NANANA_MUSICDISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}