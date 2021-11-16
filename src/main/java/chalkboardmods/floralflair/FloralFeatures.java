package chalkboardmods.floralflair;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.RandomPatchFeatureConfig;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;

public class FloralFeatures {

    public static final ConfiguredFeature<?,?> FOXNIP_PATCH = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(FloralFlair.FOXNIP.getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(FloralConfig.get().foxnipDensity).build());
    public static final ConfiguredFeature<?,?> FROSTED_FOXNIP_PATCH = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(FloralFlair.FROSTED_FOXNIP.getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(FloralConfig.get().frostedFoxnipDensity).build());
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
    }
}
