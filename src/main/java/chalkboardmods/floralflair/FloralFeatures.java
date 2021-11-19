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
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;

public class FloralFeatures {

    public static final ConfiguredFeature<?,?> FOXNIP_PATCH = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(FloralFlair.FOXNIP.getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(32).build());
    public static final ConfiguredFeature<?,?> FROSTED_FOXNIP_PATCH = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(FloralFlair.FROSTED_FOXNIP.getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(32).build());
    public static final ConfiguredFeature<?,?> ROSE_PATCH = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(FloralFlair.ROSE.getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(32).build());
    public static final ConfiguredFeature<?,?> SUNSET_POPPY_PATCH = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(FloralFlair.SUNSET_POPPY.getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(32).build());
    public static final ConfiguredFeature<?,?> MUSCARI_PATCH = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(FloralFlair.MUSCARI.getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(32).build());
    public static void init(){
        // Foxnip
        RegistryKey<ConfiguredFeature<?, ?>> foxnipPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(FloralFlair.MOD_ID, "foxnip_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, foxnipPatch.getValue(), FOXNIP_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA, BiomeKeys.TAIGA_HILLS), GenerationStep.Feature.VEGETAL_DECORATION, foxnipPatch);
        // Frosted Foxnip
        RegistryKey<ConfiguredFeature<?, ?>> frostedFoxnipPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "frosted_foxnip_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, frostedFoxnipPatch.getValue(), FROSTED_FOXNIP_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_TAIGA_MOUNTAINS, BiomeKeys.SNOWY_TAIGA_HILLS, BiomeKeys.SNOWY_TAIGA,BiomeKeys.SNOWY_MOUNTAINS, BiomeKeys.SNOWY_TUNDRA),GenerationStep.Feature.VEGETAL_DECORATION, frostedFoxnipPatch);
        // Muscari
        RegistryKey<ConfiguredFeature<?, ?>> muscariPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "muscari_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, muscariPatch.getValue(), MUSCARI_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_TAIGA_MOUNTAINS, BiomeKeys.SNOWY_TAIGA_HILLS, BiomeKeys.SNOWY_TAIGA,BiomeKeys.SNOWY_MOUNTAINS, BiomeKeys.SNOWY_TUNDRA),GenerationStep.Feature.VEGETAL_DECORATION, muscariPatch);
        // Rose
        RegistryKey<ConfiguredFeature<?, ?>> rosePatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "rose_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, rosePatch.getValue(), ROSE_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS, Biome.Category.FOREST),GenerationStep.Feature.VEGETAL_DECORATION, rosePatch);
        // Sunset Poppy
        RegistryKey<ConfiguredFeature<?, ?>> sunsetPoppyPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(FloralFlair.MOD_ID, "sunset_poppy_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, sunsetPoppyPatch.getValue(), SUNSET_POPPY_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SUNFLOWER_PLAINS, BiomeKeys.FLOWER_FOREST),GenerationStep.Feature.VEGETAL_DECORATION, sunsetPoppyPatch);
    }
}
