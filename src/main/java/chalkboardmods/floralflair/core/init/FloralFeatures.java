package chalkboardmods.floralflair.core.init;

import chalkboardmods.floralflair.common.FloralProperties;
import chalkboardmods.floralflair.common.blocks.AnthuriumBlock;
import chalkboardmods.floralflair.core.FloralConfig;
import chalkboardmods.floralflair.core.FloralFlair;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FloralFeatures {
    private static final WeightedBlockStateProvider ANTHURIUM_WEIGHTS = new WeightedBlockStateProvider(new DataPool.Builder<BlockState>().add(FloralBlocks.ANTHURIUM.getDefaultState().with(Properties.FACING, Direction.NORTH), 4).add(FloralBlocks.ANTHURIUM.getDefaultState().with(Properties.FACING, Direction.EAST), 4).add(FloralBlocks.ANTHURIUM.getDefaultState().with(Properties.FACING, Direction.SOUTH), 4).add(FloralBlocks.ANTHURIUM.getDefaultState().with(Properties.FACING, Direction.WEST), 4));
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
    public static ConfiguredFeature<?, ?> MIDNIGHT_ORCHID_CF;
    public static ConfiguredFeature<?, ?> HYACINTH_CF;
    public static ConfiguredFeature<?, ?> SNOW_FALL_FLOWER_CF;
    public static ConfiguredFeature<?, ?> SPIKED_TULIP_CF;
    public static ConfiguredFeature<?, ?> STONNETE_CF;
    public static ConfiguredFeature<?, ?> LUNULA_CF;
    public static ConfiguredFeature<?, ?> ANTHURIUM_CF;

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
    public static PlacedFeature MIDNIGHT_ORCHID_PF;
    public static PlacedFeature HYACINTH_PF;
    public static PlacedFeature SNOW_FALL_FLOWER_PF;
    public static PlacedFeature SPIKED_TULIP_PF;
    public static PlacedFeature STONNETE_PF;
    public static PlacedFeature LUNULA_PF;
    public static PlacedFeature ANTHURIUM_PF;

    public static void init() {

        //Foxnip
        RegistryKey<ConfiguredFeature<?, ?>> foxnipConfig = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "foxnip_config"));
        RegistryKey<PlacedFeature> foxnipPlacement = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "foxnip_placed"));
        FOXNIP_CF = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, foxnipConfig.getValue(), Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, FloralConfig.get().foxnipDensity, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.FOXNIP))).withInAirFilter())));
        FOXNIP_PF = Registry.register(BuiltinRegistries.PLACED_FEATURE, foxnipPlacement.getValue(), FOXNIP_CF.withPlacement(RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA, BiomeKeys.OLD_GROWTH_PINE_TAIGA, BiomeKeys.TAIGA), GenerationStep.Feature.VEGETAL_DECORATION, foxnipPlacement);

        //Frosted Foxnip
        RegistryKey<ConfiguredFeature<?, ?>> frostedFoxnipConfig = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "frosted_foxnip_config"));
        RegistryKey<PlacedFeature> frostedFoxnipPlacement = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "frosted_foxnip_placed"));
        FROSTED_FOXNIP_CF = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, frostedFoxnipConfig.getValue(), Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, FloralConfig.get().frostedFoxnipDensity, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.FROSTED_FOXNIP))).withInAirFilter())));
        FROSTED_FOXNIP_PF = Registry.register(BuiltinRegistries.PLACED_FEATURE, frostedFoxnipPlacement.getValue(), FROSTED_FOXNIP_CF.withPlacement(RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_TAIGA), GenerationStep.Feature.VEGETAL_DECORATION, frostedFoxnipPlacement);

        //Pulse Petal
        RegistryKey<ConfiguredFeature<?, ?>> pulsePetalConfig = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "pulse_petal_config"));
        RegistryKey<PlacedFeature> pulsePetalPlacement = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "pulse_petal_placed"));
        PULSE_PETAL_CF = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, pulsePetalConfig.getValue(), Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, FloralConfig.get().pulsePetalDensity, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.PULSE_PETAL))).withInAirFilter())));
        PULSE_PETAL_PF = Registry.register(BuiltinRegistries.PLACED_FEATURE, pulsePetalPlacement.getValue(), PULSE_PETAL_CF.withPlacement(RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.FOREST), GenerationStep.Feature.VEGETAL_DECORATION, pulsePetalPlacement);

        //Jungle Gem
        RegistryKey<ConfiguredFeature<?, ?>> jungleGemConfig = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "jungle_gem_config"));
        RegistryKey<PlacedFeature> jungleGemPlacement = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "jungle_gem_placed"));
        JUNGLE_GEM_CF = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, jungleGemConfig.getValue(), Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, FloralConfig.get().jungleGemDensity, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.JUNGLE_GEM))).withInAirFilter())));
        JUNGLE_GEM_PF = Registry.register(BuiltinRegistries.PLACED_FEATURE, jungleGemPlacement.getValue(), JUNGLE_GEM_CF.withPlacement(RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.JUNGLE), GenerationStep.Feature.VEGETAL_DECORATION, jungleGemPlacement);

        //Rose
        RegistryKey<ConfiguredFeature<?, ?>> roseConfig = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "rose_config"));
        RegistryKey<PlacedFeature> rosePlacement = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "rose_placed"));
        ROSE_CF = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, roseConfig.getValue(), Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, FloralConfig.get().roseDensity, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.ROSE))).withInAirFilter())));
        ROSE_PF = Registry.register(BuiltinRegistries.PLACED_FEATURE, rosePlacement.getValue(), ROSE_CF.withPlacement(RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW), GenerationStep.Feature.VEGETAL_DECORATION, rosePlacement);

        //Sunset Poppy
        RegistryKey<ConfiguredFeature<?, ?>> sunsetPoppyConfig = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "sunset_poppy_config"));
        RegistryKey<PlacedFeature> sunsetPoppyPlacement = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "sunset_poppy_placed"));
        SUNSET_POPPY_CF = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, sunsetPoppyConfig.getValue(), Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, FloralConfig.get().sunsetPoppyDensity, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.SUNSET_POPPY))).withInAirFilter())));
        SUNSET_POPPY_PF = Registry.register(BuiltinRegistries.PLACED_FEATURE, sunsetPoppyPlacement.getValue(), SUNSET_POPPY_CF.withPlacement(RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.SAVANNA), GenerationStep.Feature.VEGETAL_DECORATION, sunsetPoppyPlacement);

        //Fairy Blossom
        RegistryKey<ConfiguredFeature<?, ?>> fairyBlossomConfig = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "fairy_blossom_config"));
        RegistryKey<PlacedFeature> fairyBlossomPlacement = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "fairy_blossom_placed"));
        FAIRY_BLOSSOM_CF = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, fairyBlossomConfig.getValue(), Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, FloralConfig.get().fairyBlossomDensity, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.FAIRY_BLOSSOM))).withInAirFilter())));
        FAIRY_BLOSSOM_PF = Registry.register(BuiltinRegistries.PLACED_FEATURE, fairyBlossomPlacement.getValue(), FAIRY_BLOSSOM_CF.withPlacement(RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, fairyBlossomPlacement);

        //Muscari
        RegistryKey<ConfiguredFeature<?, ?>> muscariConfig = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "muscari_config"));
        RegistryKey<PlacedFeature> muscariPlacement = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "muscari_placed"));
        MUSCARI_CF = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, muscariConfig.getValue(), Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, FloralConfig.get().muscariDensity, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.MUSCARI))).withInAirFilter())));
        MUSCARI_PF = Registry.register(BuiltinRegistries.PLACED_FEATURE, muscariPlacement.getValue(), MUSCARI_CF.withPlacement(RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_PLAINS, BiomeKeys.SNOWY_SLOPES), GenerationStep.Feature.VEGETAL_DECORATION, muscariPlacement);

        //Purpureum
        RegistryKey<ConfiguredFeature<?, ?>> purpureumConfig = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "purpureum_config"));
        RegistryKey<PlacedFeature> purpureumPlacement = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "purpureum_placed"));
        PURPUREUM_CF = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, purpureumConfig.getValue(), Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, FloralConfig.get().purpureumDensity, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.PURPUREUM))).withInAirFilter())));
        PURPUREUM_PF = Registry.register(BuiltinRegistries.PLACED_FEATURE, purpureumPlacement.getValue(), PURPUREUM_CF.withPlacement(RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.SWAMP), GenerationStep.Feature.VEGETAL_DECORATION, purpureumPlacement);

        // Midnight_orchid
        RegistryKey<ConfiguredFeature<?, ?>> midnight_orchidConfig = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "midnight_orchid_config"));
        RegistryKey<PlacedFeature> midnight_orchidPlacement = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "midnight_orchid_placed"));
        MIDNIGHT_ORCHID_CF = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, midnight_orchidConfig.getValue(), Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, FloralConfig.get().purpureumDensity, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.MIDNIGHT_ORCHID))).withInAirFilter())));
        MIDNIGHT_ORCHID_PF = Registry.register(BuiltinRegistries.PLACED_FEATURE, midnight_orchidPlacement.getValue(), MIDNIGHT_ORCHID_CF.withPlacement(RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.SWAMP), GenerationStep.Feature.VEGETAL_DECORATION, midnight_orchidPlacement);

        // NEW STUFF

        // Hyacinth
        RegistryKey<ConfiguredFeature<?, ?>> hyacinthConfig = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "hyacinth_config"));
        RegistryKey<PlacedFeature> hyacinthPlacement = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "hyacinth_placed"));
        HYACINTH_CF = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, hyacinthConfig.getValue(), Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, FloralConfig.get().purpureumDensity, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.HYACINTH))).withInAirFilter())));
        HYACINTH_PF = Registry.register(BuiltinRegistries.PLACED_FEATURE, hyacinthPlacement.getValue(), HYACINTH_CF.withPlacement(RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, hyacinthPlacement);
        // Snow_fall_flower
        RegistryKey<ConfiguredFeature<?, ?>> snow_fall_flowerConfig = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "snow_fall_flower_config"));
        RegistryKey<PlacedFeature> snow_fall_flowerPlacement = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "snow_fall_flower_placed"));
        SNOW_FALL_FLOWER_CF = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, snow_fall_flowerConfig.getValue(), Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, FloralConfig.get().purpureumDensity, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.SNOW_FALL_FLOWER))).withInAirFilter())));
        SNOW_FALL_FLOWER_PF = Registry.register(BuiltinRegistries.PLACED_FEATURE, snow_fall_flowerPlacement.getValue(), SNOW_FALL_FLOWER_CF.withPlacement(RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.ICY), GenerationStep.Feature.VEGETAL_DECORATION, snow_fall_flowerPlacement);
        // Spiked_tulip
        RegistryKey<ConfiguredFeature<?, ?>> spiked_tulipConfig = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "spiked_tulip_config"));
        RegistryKey<PlacedFeature> spiked_tulipPlacement = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "spiked_tulip_placed"));
        SPIKED_TULIP_CF = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, spiked_tulipConfig.getValue(), Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, FloralConfig.get().spiked_tulipDensity, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.SPIKED_TULIP))).withInAirFilter())));
        SPIKED_TULIP_PF = Registry.register(BuiltinRegistries.PLACED_FEATURE, spiked_tulipPlacement.getValue(), SPIKED_TULIP_CF.withPlacement(RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(),PlacedFeatures.BOTTOM_TO_TOP_RANGE, BiomePlacementModifier.of()));
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DRIPSTONE_CAVES), GenerationStep.Feature.UNDERGROUND_DECORATION, spiked_tulipPlacement);
        // Stonnete
        RegistryKey<ConfiguredFeature<?, ?>> stonneteConfig = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "stonnete_config"));
        RegistryKey<PlacedFeature> stonnetePlacement = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "stonnete_placed"));
        STONNETE_CF = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, stonneteConfig.getValue(), Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, FloralConfig.get().stonneteDensity, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.STONNETE))).withInAirFilter())));
        STONNETE_PF = Registry.register(BuiltinRegistries.PLACED_FEATURE, stonnetePlacement.getValue(), STONNETE_CF.withPlacement(RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(),PlacedFeatures.BOTTOM_TO_TOP_RANGE, BiomePlacementModifier.of()));
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.UNDERGROUND), GenerationStep.Feature.UNDERGROUND_DECORATION, stonnetePlacement);
        // Lunula
        RegistryKey<ConfiguredFeature<?, ?>> lunulaConfig = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "lunula_config"));RegistryKey<PlacedFeature> lunulaPlacement = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "lunula_placed"));
        LUNULA_CF = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, lunulaConfig.getValue(), Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, FloralConfig.get().purpureumDensity, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.LUNULA))).withInAirFilter())));
        LUNULA_PF = Registry.register(BuiltinRegistries.PLACED_FEATURE, lunulaPlacement.getValue(), LUNULA_CF.withPlacement(RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.SWAMP), GenerationStep.Feature.VEGETAL_DECORATION, lunulaPlacement);
        // Anthurium

        RegistryKey<ConfiguredFeature<?, ?>> anthuriumConfig = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "anthurium_config"));
        RegistryKey<PlacedFeature> anthuriumPlacement = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "anthurium_placed"));
        ANTHURIUM_CF = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, anthuriumConfig.getValue(), Feature.FLOWER.configure(new RandomPatchFeatureConfig(64, FloralConfig.get().anthuriumDensity, 3, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(ANTHURIUM_WEIGHTS)).withInAirFilter())));
        ANTHURIUM_PF = Registry.register(BuiltinRegistries.PLACED_FEATURE, anthuriumPlacement.getValue(), ANTHURIUM_CF.withPlacement(RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.FOREST), GenerationStep.Feature.VEGETAL_DECORATION, anthuriumPlacement);
    }
}
