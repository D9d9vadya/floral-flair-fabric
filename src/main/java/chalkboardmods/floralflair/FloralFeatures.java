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

    //Placed
    public static PlacedFeature FOXNIP_PF;
    public static PlacedFeature FROSTED_FOXNIP_PF;
    public static PlacedFeature PULSE_PETAL_PF;
    public static PlacedFeature FAIRY_BLOSSOM_PF;
    public static PlacedFeature JUNGLE_GEM_PF;
    public static PlacedFeature ROSE_PF;
    public static PlacedFeature SUNSET_POPPY_PF;
    public static PlacedFeature MUSCARI_PF;

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
    }
}
