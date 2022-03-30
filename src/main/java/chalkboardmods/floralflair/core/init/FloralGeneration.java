package chalkboardmods.floralflair.core.init;

import chalkboardmods.floralflair.core.FloralFlair;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.minecraft.tag.BiomeTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.BuiltinBiomes;
import net.minecraft.world.gen.GenerationStep;

public class FloralGeneration {
    public static void init() {
        //Foxnip
        BiomeModifications.addFeature((context) -> {
            String biomeName = context.getBiomeKey().toString();
            return !biomeName.contains("snowy") && context.getBiomeRegistryEntry().isIn(BiomeTags.IS_TAIGA);
        }, GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "flower_foxnip")));

        //Frosted Foxnip
        BiomeModifications.addFeature((context) -> {
            String biomeName = context.getBiomeKey().toString();
            return biomeName.contains("snowy") && context.getBiomeRegistryEntry().isIn(BiomeTags.IS_TAIGA);
        }, GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "flower_frosted_foxnip")));

        //Pulse Petal
        BiomeModifications.addFeature((context) -> {
            return context.getBiomeRegistryEntry().isIn(BiomeTags.IS_FOREST);
        }, GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "flower_pulse_petal")));

        //Fairy Blossom
        BiomeModifications.addFeature((context) -> {
            return context.getBiomeKey().equals(BiomeKeys.FLOWER_FOREST);
        }, GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "flower_fairy_blossom")));

        //Jungle Gem
        BiomeModifications.addFeature((context) -> {
            return context.getBiomeRegistryEntry().isIn(BiomeTags.IS_JUNGLE);
        }, GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "flower_jungle_gem")));

        //Rose
        BiomeModifications.addFeature((context) -> {
            return context.getBiomeKey().equals(BiomeKeys.MEADOW);
        }, GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "flower_rose")));

        //Sunset Poppy
        BiomeModifications.addFeature((context) -> {
            String biomeName = context.getBiomeKey().toString();
            return biomeName.contains("savanna");
        }, GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "flower_sunset_poppy")));

        //Muscari
        BiomeModifications.addFeature((context) -> {
            String biomeName = context.getBiomeKey().toString();
            return biomeName.contains("snowy");
        }, GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "flower_muscari")));

        //Purpureum
        BiomeModifications.addFeature((context) -> {
            String biomeName = context.getBiomeKey().toString();
            return biomeName.contains("swamp");
        }, GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "flower_purpureum")));

        //Midnight Orchid
        BiomeModifications.addFeature((context) -> {
            return context.getBiomeRegistryEntry().isIn(BiomeTags.IS_JUNGLE);
        }, GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "flower_midnight_orchid")));

        //Hyacinth
        BiomeModifications.addFeature((context) -> {
            return context.getBiomeKey().equals(BiomeKeys.FLOWER_FOREST);
        }, GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "flower_hyacinth")));

        //Snowfall Flower
        BiomeModifications.addFeature((context) -> {
            return context.getBiomeKey().equals(BiomeKeys.DRIPSTONE_CAVES);
        }, GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "flower_snowfall")));

        //Spiked Tulip
        BiomeModifications.addFeature((context) -> {
            return context.getBiomeKey().equals(BiomeKeys.DRIPSTONE_CAVES);
        }, GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "flower_spiked_tulip")));

        //Stonnete
        BiomeModifications.addFeature((context) -> {
            return true;
        }, GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "flower_stonnete")));

        //Lunula
        BiomeModifications.addFeature((context) -> {
            return context.getBiomeKey().equals(BiomeKeys.DARK_FOREST);
        }, GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "flower_lunula")));

        //Anthurium
        BiomeModifications.addFeature((context) -> {
            String biomeName = context.getBiomeKey().toString();
            return biomeName.contains("plains");
        }, GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "flower_anthurium")));
    }
}
