package chalkboardmods.floralflair.core.init;

import chalkboardmods.floralflair.common.FloralProperties;
import chalkboardmods.floralflair.common.blocks.*;
import chalkboardmods.floralflair.core.FloralFlair;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.ToIntFunction;

public class FloralBlocks {

    // Foxnip
    public static final Block FOXNIP = new FlowerBlock(StatusEffects.SLOWNESS, 8, FabricBlockSettings.copyOf(Blocks.POPPY).strength(0.0F).nonOpaque());
    public static final Block POTTED_FOXNIP = new FlowerPotBlock(FOXNIP,FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());

    // Frosted Foxnip
    public static final Block FROSTED_FOXNIP = new FlowerBlock(StatusEffects.SLOWNESS, 5,FabricBlockSettings.copyOf(Blocks.POPPY).strength(0.0F).nonOpaque());
    public static final Block POTTED_FROSTED_FOXNIP = new FlowerPotBlock(FROSTED_FOXNIP,FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());

    // Rose
    public static final Block ROSE = new FlowerBlock(StatusEffects.REGENERATION, 9,FabricBlockSettings.copyOf(Blocks.POPPY).strength(0.0F).nonOpaque());
    public static final Block POTTED_ROSE = new FlowerPotBlock(ROSE,FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());

    // Sunset Poppy
    public static final Block SUNSET_POPPY = new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 11,FabricBlockSettings.copyOf(Blocks.POPPY).strength(0.0F).nonOpaque());
    public static final Block POTTED_SUNSET_POPPY = new FlowerPotBlock(SUNSET_POPPY,FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());

    // Jungle Gem
    public static final Block JUNGLE_GEM = new FlowerBlock(StatusEffects.GLOWING, 10,FabricBlockSettings.copyOf(Blocks.DANDELION).strength(0.0F).nonOpaque());
    public static final Block POTTED_JUNGLE_GEM = new FlowerPotBlock(JUNGLE_GEM,FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());

    // Pulse Petal
    public static final Block PULSE_PETAL = new FlowerBlock(StatusEffects.HEALTH_BOOST, 8,FabricBlockSettings.copyOf(Blocks.POPPY).strength(0.0F).nonOpaque());
    public static final Block POTTED_PULSE_PETAL = new FlowerPotBlock(PULSE_PETAL,FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());

    // Fairy Blossom
    public static final Block FAIRY_BLOSSOM = new TallFlowerBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().strength(0.0f).sounds(BlockSoundGroup.GRASS).strength(0.0F).nonOpaque());

    // Muscari
    public static final Block MUSCARI = new TallFlowerBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().strength(0.0f).sounds(BlockSoundGroup.GRASS).strength(0.0F).nonOpaque());

    // Purpureum
    public static final Block PURPUREUM = new TallFlowerBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().strength(0.0f).sounds(BlockSoundGroup.GRASS).strength(0.0F).nonOpaque());

    // Midnight Orchid
    public static final Block MIDNIGHT_ORCHID = new FlowerBlock(StatusEffects.RESISTANCE, 8, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().strength(0.0f));
    public static final Block POTTED_MIDNIGHT_ORCHID = new FlowerPotBlock(MIDNIGHT_ORCHID, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());
    // Hyacinth
    public static final Block HYACINTH = new FlowerBlock(StatusEffects.RESISTANCE, 8, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().strength(0.0f));
    public static final Block POTTED_HYACINTH = new FlowerPotBlock(HYACINTH, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());
    // Anthurium
    public static final Block ANTHURIUM = new AnthuriumBlock(StatusEffects.RESISTANCE, 8, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().strength(0.0f));
    public static final Block POTTED_ANTHURIUM = new FlowerPotBlock(ANTHURIUM, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());
    // Snow Fall Flower
    public static final Block SNOW_FALL_FLOWER = new FlowerBlock(StatusEffects.RESISTANCE, 8, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().strength(0.0f));
    public static final Block POTTED_SNOW_FALL_FLOWER = new FlowerPotBlock(SNOW_FALL_FLOWER, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());
    // Spiked Tulip
    public static final Block SPIKED_TULIP = new SpikedTulipBlock(StatusEffects.RESISTANCE, 8, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().strength(0.0f));
    public static final Block POTTED_SPIKED_TULIP = new FlowerPotBlock(SPIKED_TULIP, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());
    // Stonette
    public static final Block STONNETE = new StonetteBlock(StatusEffects.RESISTANCE, 8, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().strength(0.0f));
    public static final Block POTTED_STONNETE = new FlowerPotBlock(STONNETE, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());

    // Lunala
    public static final Block LUNULA = new LunulaBlock(StatusEffects.RESISTANCE, 8, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().strength(0.0f).luminance(createLightLevelFromTimeBlockState(5)));
    public static final Block POTTED_LUNULA = new PottedLunulaBlock(LUNULA, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).nonOpaque().strength(0.0f).luminance(createLightLevelFromTimeBlockState(5)));

    //Light Property Method
    private static ToIntFunction<BlockState> createLightLevelFromTimeBlockState(int litLevel) {
        return (state) -> state.get(FloralProperties.TIME) == 3 ? litLevel : 0;
    }

    public static void init() {
        // Foxnip
        Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "foxnip"), FOXNIP);
        Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "foxnip"), new BlockItem(FOXNIP, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "potted_foxnip"),POTTED_FOXNIP);

        // Frosted Foxnip
        Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "frosted_foxnip"), FROSTED_FOXNIP);
        Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "frosted_foxnip"), new BlockItem(FROSTED_FOXNIP, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "potted_frosted_foxnip"),POTTED_FROSTED_FOXNIP);

        // Rose
        Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "rose"), ROSE);
        Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "rose"), new BlockItem(ROSE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "potted_rose"),POTTED_ROSE);

        // Sunset Poppy
        Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "sunset_poppy"), SUNSET_POPPY);
        Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "sunset_poppy"), new BlockItem(SUNSET_POPPY, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "potted_sunset_poppy"),POTTED_SUNSET_POPPY);

        // Jungle Gem
        Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "gem_of_the_jungle"), JUNGLE_GEM);
        Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "gem_of_the_jungle"), new BlockItem(JUNGLE_GEM, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "potted_gem_of_the_jungle"),POTTED_JUNGLE_GEM);

        // Pulse Petal
        Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "pulse_petal"), PULSE_PETAL);
        Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "pulse_petal"), new BlockItem(PULSE_PETAL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "potted_pulse_petal"),POTTED_PULSE_PETAL);

        // Fairy Blossom
        Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "fairy_blossom"), FAIRY_BLOSSOM);
        Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "fairy_blossom"), new BlockItem(FAIRY_BLOSSOM, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

        // Muscari
        Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "muscari"), MUSCARI);
        Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "muscari"), new BlockItem(MUSCARI, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

        // Purpureum
        Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "purpureum"), PURPUREUM);
        Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "purpureum"), new BlockItem(PURPUREUM, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

        
        // Midnight Orchid
        Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "midnight_orchid"), MIDNIGHT_ORCHID);
        Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "midnight_orchid"), new BlockItem(MIDNIGHT_ORCHID, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        CompostingChanceRegistry.INSTANCE.add(MIDNIGHT_ORCHID, 0.65F);
        FlammableBlockRegistry.getDefaultInstance().add(MIDNIGHT_ORCHID, 100, 60);

        // Hyacinth
        Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "hyacinth"), HYACINTH);
        Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "hyacinth"), new BlockItem(HYACINTH, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        CompostingChanceRegistry.INSTANCE.add(HYACINTH, 0.65F);
        FlammableBlockRegistry.getDefaultInstance().add(HYACINTH, 100, 60);
        
        // Anthurium
        Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "anthurium"), ANTHURIUM);
        Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "anthurium"), new BlockItem(ANTHURIUM, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        CompostingChanceRegistry.INSTANCE.add(ANTHURIUM, 0.65F);
        FlammableBlockRegistry.getDefaultInstance().add(ANTHURIUM, 100, 60);
        
        // Snow_fall_flower
        Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "snow_fall_flower"), SNOW_FALL_FLOWER);
        Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "snow_fall_flower"), new BlockItem(SNOW_FALL_FLOWER, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        CompostingChanceRegistry.INSTANCE.add(SNOW_FALL_FLOWER, 0.65F);
        FlammableBlockRegistry.getDefaultInstance().add(SNOW_FALL_FLOWER, 100, 60);
        
        // Spiked_tulip
        Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "spiked_tulip"), SPIKED_TULIP);
        Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "spiked_tulip"), new BlockItem(SPIKED_TULIP, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

        // Stonnete
        Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "stonnete"), STONNETE);
        Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "stonnete"), new BlockItem(STONNETE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

        // Lunula
        Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "lunula"), LUNULA);
        Registry.register(Registry.ITEM ,new Identifier(FloralFlair.MOD_ID, "lunula"), new BlockItem(LUNULA, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "potted_lunula"),POTTED_LUNULA);
    }
}
