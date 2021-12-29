package chalkboardmods.floralflair;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.BiomePlacementModifier;
import net.minecraft.world.gen.decorator.RarityFilterPlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;

public class FloralFeatures {
    //Configured
    public static ConfiguredFeature<?, ?> FOXNIP_CF;
    public static ConfiguredFeature<?, ?> FROSTED_FOXNIP_CF;
    public static ConfiguredFeature<?, ?> PULSE_PETAL_CF;
    public static ConfiguredFeature<?, ?> FAIRY_BLOSSOM_CF;
    public static ConfiguredFeature<?, ?> JUNGLE_GEM_CF;
    public static ConfiguredFeature<?, ?> ROSE_CF;
    public static ConfiguredFeature<?, ?> SUNSET_POPPY_CF;
    public static ConfiguredFeature<?, ?> MUSCARI_CF;
    public static ConfiguredFeature<?, ?> PURPUREUM_CF;

    //Placed
    public static PlacedFeature FOXNIP_PF;
    public static PlacedFeature FROSTED_FOXNIP_PF;
    public static PlacedFeature PULSE_PETAL_PF;
    public static PlacedFeature FAIRY_BLOSSOM_PF;
    public static PlacedFeature JUNGLE_GEM_PF;
    public static PlacedFeature ROSE_PF;
    public static PlacedFeature SUNSET_POPPY_PF;
    public static PlacedFeature MUSCARI_PF;
    public static PlacedFeature PURPUREUM_PF;

    public static void init() {
        //Foxnip
        RegistryKey<ConfiguredFeature<?, ?>> foxnipConfig = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "foxnip_config"));
        RegistryKey<PlacedFeature> foxnipPlacement = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "foxnip_placed"));
        FOXNIP_CF = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, foxnipConfig.getValue(), Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, FloralConfig.get().foxnipDensity, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralFlair.FOXNIP))).withInAirFilter())));
        FOXNIP_PF = Registry.register(BuiltinRegistries.PLACED_FEATURE, foxnipPlacement.getValue(), FOXNIP_CF.withPlacement(RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA, BiomeKeys.OLD_GROWTH_PINE_TAIGA, BiomeKeys.TAIGA), GenerationStep.Feature.VEGETAL_DECORATION, foxnipPlacement);

        //Frosted Foxnip
        RegistryKey<ConfiguredFeature<?, ?>> frostedFoxnipConfig = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "frosted_foxnip_config"));
        RegistryKey<PlacedFeature> frostedFoxnipPlacement = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "frosted_foxnip_placed"));
        FROSTED_FOXNIP_CF = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, frostedFoxnipConfig.getValue(), Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, FloralConfig.get().frostedFoxnipDensity, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralFlair.FROSTED_FOXNIP))).withInAirFilter())));
        FROSTED_FOXNIP_PF = Registry.register(BuiltinRegistries.PLACED_FEATURE, frostedFoxnipPlacement.getValue(), FROSTED_FOXNIP_CF.withPlacement(RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_TAIGA), GenerationStep.Feature.VEGETAL_DECORATION, frostedFoxnipPlacement);

        //Pulse Petal
        RegistryKey<ConfiguredFeature<?, ?>> pulsePetalConfig = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "pulse_petal_config"));
        RegistryKey<PlacedFeature> pulsePetalPlacement = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "pulse_petal_placed"));
        PULSE_PETAL_CF = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, pulsePetalConfig.getValue(), Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, FloralConfig.get().pulsePetalDensity, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralFlair.PULSE_PETAL))).withInAirFilter())));
        PULSE_PETAL_PF = Registry.register(BuiltinRegistries.PLACED_FEATURE, pulsePetalPlacement.getValue(), PULSE_PETAL_CF.withPlacement(RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.FOREST), GenerationStep.Feature.VEGETAL_DECORATION, pulsePetalPlacement);

        //Jungle Gem
        RegistryKey<ConfiguredFeature<?, ?>> jungleGemConfig = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "jungle_gem_config"));
        RegistryKey<PlacedFeature> jungleGemPlacement = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "jungle_gem_placed"));
        JUNGLE_GEM_CF = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, jungleGemConfig.getValue(), Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, FloralConfig.get().jungleGemDensity, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralFlair.JUNGLE_GEM))).withInAirFilter())));
        JUNGLE_GEM_PF = Registry.register(BuiltinRegistries.PLACED_FEATURE, jungleGemPlacement.getValue(), JUNGLE_GEM_CF.withPlacement(RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.JUNGLE), GenerationStep.Feature.VEGETAL_DECORATION, jungleGemPlacement);

        //Rose
        RegistryKey<ConfiguredFeature<?, ?>> roseConfig = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "rose_config"));
        RegistryKey<PlacedFeature> rosePlacement = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "rose_placed"));
        ROSE_CF = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, roseConfig.getValue(), Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, FloralConfig.get().roseDensity, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralFlair.ROSE))).withInAirFilter())));
        ROSE_PF = Registry.register(BuiltinRegistries.PLACED_FEATURE, rosePlacement.getValue(), ROSE_CF.withPlacement(RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW), GenerationStep.Feature.VEGETAL_DECORATION, rosePlacement);

        //Sunset Poppy
        RegistryKey<ConfiguredFeature<?, ?>> sunsetPoppyConfig = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "sunset_poppy_config"));
        RegistryKey<PlacedFeature> sunsetPoppyPlacement = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "sunset_poppy_placed"));
        SUNSET_POPPY_CF = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, sunsetPoppyConfig.getValue(), Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, FloralConfig.get().sunsetPoppyDensity, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralFlair.SUNSET_POPPY))).withInAirFilter())));
        SUNSET_POPPY_PF = Registry.register(BuiltinRegistries.PLACED_FEATURE, sunsetPoppyPlacement.getValue(), SUNSET_POPPY_CF.withPlacement(RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.SAVANNA), GenerationStep.Feature.VEGETAL_DECORATION, sunsetPoppyPlacement);

        //Fairy Blossom
        RegistryKey<ConfiguredFeature<?, ?>> fairyBlossomConfig = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "fairy_blossom_config"));
        RegistryKey<PlacedFeature> fairyBlossomPlacement = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "fairy_blossom_placed"));
        FAIRY_BLOSSOM_CF = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, fairyBlossomConfig.getValue(), Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, FloralConfig.get().fairyBlossomDensity, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralFlair.FAIRY_BLOSSOM))).withInAirFilter())));
        FAIRY_BLOSSOM_PF = Registry.register(BuiltinRegistries.PLACED_FEATURE, fairyBlossomPlacement.getValue(), FAIRY_BLOSSOM_CF.withPlacement(RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, fairyBlossomPlacement);

        //Muscari
        RegistryKey<ConfiguredFeature<?, ?>> muscariConfig = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "muscari_config"));
        RegistryKey<PlacedFeature> muscariPlacement = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "muscari_placed"));
        MUSCARI_CF = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, muscariConfig.getValue(), Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, FloralConfig.get().muscariDensity, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralFlair.MUSCARI))).withInAirFilter())));
        MUSCARI_PF = Registry.register(BuiltinRegistries.PLACED_FEATURE, muscariPlacement.getValue(), MUSCARI_CF.withPlacement(RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_PLAINS, BiomeKeys.SNOWY_SLOPES), GenerationStep.Feature.VEGETAL_DECORATION, muscariPlacement);

        //Purpureum
        RegistryKey<ConfiguredFeature<?, ?>> purpureumConfig = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "purpureum_config"));
        RegistryKey<PlacedFeature> purpureumPlacement = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "purpureum_placed"));
        PURPUREUM_CF = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, purpureumConfig.getValue(), Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, FloralConfig.get().purpureumDensity, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralFlair.PURPUREUM))).withInAirFilter())));
        PURPUREUM_PF = Registry.register(BuiltinRegistries.PLACED_FEATURE, purpureumPlacement.getValue(), PURPUREUM_CF.withPlacement(RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.SWAMP), GenerationStep.Feature.VEGETAL_DECORATION, purpureumPlacement);
    }
}
