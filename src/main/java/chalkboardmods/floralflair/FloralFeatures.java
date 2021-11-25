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
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.RandomPatchFeatureConfig;
import net.minecraft.world.gen.placer.DoublePlantPlacer;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;

public class FloralFeatures {

    public static final ConfiguredFeature<?,?> FOXNIP_PATCH = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(FloralFlair.FOXNIP.getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(FloralConfig.get().foxnipDensity).spreadX(4).spreadZ(3).spreadY(1).build());
    public static final ConfiguredFeature<?,?> FROSTED_FOXNIP_PATCH = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(FloralFlair.FROSTED_FOXNIP.getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(FloralConfig.get().frostedFoxnipDensity).spreadX(4).spreadZ(3).spreadY(1).build());
    public static final ConfiguredFeature<?,?> ROSE_PATCH = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(FloralFlair.ROSE.getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(FloralConfig.get().roseDensity).spreadX(4).spreadZ(3).spreadY(1).build());
    public static final ConfiguredFeature<?,?> SUNSET_POPPY_PATCH = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(FloralFlair.SUNSET_POPPY.getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(FloralConfig.get().sunsetPoppyDensity).spreadX(4).spreadZ(3).spreadY(1).build());
    public static final ConfiguredFeature<?,?> JUNGLE_GEM_PATCH = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(FloralFlair.JUNGLE_GEM.getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(FloralConfig.get().jungleGemDensity).spreadX(4).spreadZ(3).spreadY(1).build());
    public static final ConfiguredFeature<?,?> PULSE_PATCH = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(FloralFlair.PULSE_PETAL.getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(FloralConfig.get().pulsePetalDensity).spreadX(4).spreadZ(3).spreadY(1).build());
    public static final ConfiguredFeature<?,?> MUSCARI_PATCH = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(FloralFlair.MUSCARI.getDefaultState()), DoublePlantPlacer.INSTANCE)).tries(FloralConfig.get().muscariDensity).spreadX(3).spreadZ(3).spreadY(1).build());
    public static final ConfiguredFeature<?,?> FAIRY_BLOSSOM_PATCH = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(FloralFlair.FAIRY_BLOSSOM.getDefaultState()), DoublePlantPlacer.INSTANCE)).tries(FloralConfig.get().fairyBlossomDensity).spreadX(3).spreadZ(3).spreadY(1).build());
    public static void init(){
        // Foxnip
        RegistryKey<ConfiguredFeature<?, ?>> foxnipPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(FloralFlair.MOD_ID, "foxnip_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, foxnipPatch.getValue(), FOXNIP_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA, BiomeKeys.TAIGA_HILLS), GenerationStep.Feature.VEGETAL_DECORATION, foxnipPatch);
        // Pulse Petal
        RegistryKey<ConfiguredFeature<?, ?>> pulsePetalPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(FloralFlair.MOD_ID, "pulse_petal_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, pulsePetalPatch.getValue(), PULSE_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.FOREST), GenerationStep.Feature.VEGETAL_DECORATION, pulsePetalPatch);
        // Frosted Foxnip
        RegistryKey<ConfiguredFeature<?, ?>> frostedFoxnipPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "frosted_foxnip_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, frostedFoxnipPatch.getValue(), FROSTED_FOXNIP_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_TAIGA_MOUNTAINS, BiomeKeys.SNOWY_TAIGA_HILLS, BiomeKeys.SNOWY_TAIGA,BiomeKeys.SNOWY_MOUNTAINS, BiomeKeys.SNOWY_TUNDRA),GenerationStep.Feature.VEGETAL_DECORATION, frostedFoxnipPatch);
        // Muscari
        RegistryKey<ConfiguredFeature<?, ?>> muscariPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "muscari_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, muscariPatch.getValue(), MUSCARI_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_TAIGA_MOUNTAINS, BiomeKeys.SNOWY_TAIGA_HILLS, BiomeKeys.SNOWY_TAIGA,BiomeKeys.SNOWY_MOUNTAINS, BiomeKeys.SNOWY_TUNDRA),GenerationStep.Feature.VEGETAL_DECORATION, muscariPatch);
        // Fairy Blossom
        RegistryKey<ConfiguredFeature<?, ?>> fairyBlossomPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "fairy_blossom_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, fairyBlossomPatch.getValue(), FAIRY_BLOSSOM_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.FOREST),GenerationStep.Feature.VEGETAL_DECORATION, fairyBlossomPatch);
        // Rose
        RegistryKey<ConfiguredFeature<?, ?>> rosePatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "rose_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, rosePatch.getValue(), ROSE_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS, Biome.Category.FOREST),GenerationStep.Feature.VEGETAL_DECORATION, rosePatch);
        // Jungle Gem
        RegistryKey<ConfiguredFeature<?, ?>> jungleGemPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "jungle_gem_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, jungleGemPatch.getValue(), JUNGLE_GEM_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.JUNGLE),GenerationStep.Feature.VEGETAL_DECORATION, jungleGemPatch);
        // Sunset Poppy
        RegistryKey<ConfiguredFeature<?, ?>> sunsetPoppyPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "sunset_poppy_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, sunsetPoppyPatch.getValue(), SUNSET_POPPY_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SUNFLOWER_PLAINS, BiomeKeys.FLOWER_FOREST),GenerationStep.Feature.VEGETAL_DECORATION, sunsetPoppyPatch);
    }
}
