package chalkboardmods.floralflair;

import chalkboardmods.floralflair.blocks.AnthuriumBlock;
import chalkboardmods.floralflair.blocks.LunulaBlock;
import chalkboardmods.floralflair.blocks.PottedLunulaBlock;
import chalkboardmods.floralflair.blocks.StonetteBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.ToIntFunction;

public class FloralFlair implements ModInitializer {

	public static final String MOD_ID = "floral_flair";
//	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);


	// Foxnip
	public static final Block FOXNIP = new FlowerBlock(StatusEffects.SLOWNESS, 8,FabricBlockSettings.copyOf(Blocks.POPPY).strength(0.0F).nonOpaque());
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

	// MIDNIGHT_ORCHID
	public static final Block MIDNIGHT_ORCHID = new FlowerBlock(StatusEffects.RESISTANCE, 8, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().strength(0.0f));
	public static final Block POTTED_MIDNIGHT_ORCHID = new FlowerPotBlock(MIDNIGHT_ORCHID, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());
	// HYACINTH
	public static final Block HYACINTH = new FlowerBlock(StatusEffects.RESISTANCE, 8, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().strength(0.0f));
	public static final Block POTTED_HYACINTH = new FlowerPotBlock(HYACINTH, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());
	// ANTHURIUM
	public static final Block ANTHURIUM = new AnthuriumBlock(StatusEffects.RESISTANCE, 8, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().strength(0.0f));
	public static final Block POTTED_ANTHURIUM = new FlowerPotBlock(ANTHURIUM, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());
	// SNOW_FALL_FLOWER
	public static final Block SNOW_FALL_FLOWER = new FlowerBlock(StatusEffects.RESISTANCE, 8, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().strength(0.0f));
	public static final Block POTTED_SNOW_FALL_FLOWER = new FlowerPotBlock(SNOW_FALL_FLOWER, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());
	// SPIKED_TULIP
	public static final Block SPIKED_TULIP = new FlowerBlock(StatusEffects.RESISTANCE, 8, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().strength(0.0f));
	public static final Block POTTED_SPIKED_TULIP = new FlowerPotBlock(SPIKED_TULIP, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());
	// STONNETE
	public static final Block STONNETE = new StonetteBlock(StatusEffects.RESISTANCE, 8, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().strength(0.0f));
	public static final Block POTTED_STONNETE = new FlowerPotBlock(STONNETE, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());

	public static final Block LUNULA = new LunulaBlock(StatusEffects.RESISTANCE, 8, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().strength(0.0f).luminance(createLightLevelFromTimeBlockState(5)));
	public static final Block POTTED_LUNULA = new PottedLunulaBlock(LUNULA, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).nonOpaque().strength(0.0f).luminance(createLightLevelFromTimeBlockState(5)));

	private static ToIntFunction<BlockState> createLightLevelFromTimeBlockState(int litLevel) {
		return (state) -> state.get(FloralProperties.TIME) == 3 ? litLevel : 0;
	}

	@Override
	public void onInitialize() {

		// Foxnip
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "foxnip"), FOXNIP);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "foxnip"), new BlockItem(FOXNIP, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "potted_foxnip"),POTTED_FOXNIP);
		// Frosted Foxnip
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "frosted_foxnip"), FROSTED_FOXNIP);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "frosted_foxnip"), new BlockItem(FROSTED_FOXNIP, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "potted_frosted_foxnip"),POTTED_FROSTED_FOXNIP);
		// Rose
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "rose"), ROSE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rose"), new BlockItem(ROSE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "potted_rose"),POTTED_ROSE);
		// Sunset Poppy
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "sunset_poppy"), SUNSET_POPPY);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sunset_poppy"), new BlockItem(SUNSET_POPPY, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "potted_sunset_poppy"),POTTED_SUNSET_POPPY);
		// Jungle Gem
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "gem_of_the_jungle"), JUNGLE_GEM);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "gem_of_the_jungle"), new BlockItem(JUNGLE_GEM, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "potted_gem_of_the_jungle"),POTTED_JUNGLE_GEM);
		// Pulse Petal
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "pulse_petal"), PULSE_PETAL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pulse_petal"), new BlockItem(PULSE_PETAL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "potted_pulse_petal"),POTTED_PULSE_PETAL);
		// Fairy Blossom
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fairy_blossom"), FAIRY_BLOSSOM);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fairy_blossom"), new BlockItem(FAIRY_BLOSSOM, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		// Muscari
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "muscari"), MUSCARI);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "muscari"), new BlockItem(MUSCARI, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		// Purpureum
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "purpureum"), PURPUREUM);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "purpureum"), new BlockItem(PURPUREUM, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		// Midnight_orchid
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "midnight_orchid"), MIDNIGHT_ORCHID);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "midnight_orchid"), new BlockItem(MIDNIGHT_ORCHID, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		CompostingChanceRegistry.INSTANCE.add(MIDNIGHT_ORCHID, 0.65F);
		FlammableBlockRegistry.getDefaultInstance().add(MIDNIGHT_ORCHID, 100, 60);
		// Hyacinth
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "hyacinth"), HYACINTH);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hyacinth"), new BlockItem(HYACINTH, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		CompostingChanceRegistry.INSTANCE.add(HYACINTH, 0.65F);
		FlammableBlockRegistry.getDefaultInstance().add(HYACINTH, 100, 60);
		// Anthurium
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "anthurium"), ANTHURIUM);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "anthurium"), new BlockItem(ANTHURIUM, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		CompostingChanceRegistry.INSTANCE.add(ANTHURIUM, 0.65F);
		FlammableBlockRegistry.getDefaultInstance().add(ANTHURIUM, 100, 60);
		// Snow_fall_flower
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "snow_fall_flower"), SNOW_FALL_FLOWER);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "snow_fall_flower"), new BlockItem(SNOW_FALL_FLOWER, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		CompostingChanceRegistry.INSTANCE.add(SNOW_FALL_FLOWER, 0.65F);
		FlammableBlockRegistry.getDefaultInstance().add(SNOW_FALL_FLOWER, 100, 60);
		// Spiked_tulip
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "spiked_tulip"), SPIKED_TULIP);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spiked_tulip"), new BlockItem(SPIKED_TULIP, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

		// Stonnete
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stonnete"), STONNETE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stonnete"), new BlockItem(STONNETE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

		// Lunula
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "lunula"), LUNULA);
		Registry.register(Registry.ITEM ,new Identifier(MOD_ID, "lunula"), new BlockItem(LUNULA, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "potted_lunula"),POTTED_LUNULA);
		// Config
		FloralConfig.init();
		// Features
		FloralFeatures.init();
		// Composting
		CompostingChanceRegistry.INSTANCE.add(FOXNIP, 0.65F);
		CompostingChanceRegistry.INSTANCE.add(FROSTED_FOXNIP, 0.65F);
		CompostingChanceRegistry.INSTANCE.add(PULSE_PETAL, 0.65F);
		CompostingChanceRegistry.INSTANCE.add(JUNGLE_GEM, 0.65F);
		CompostingChanceRegistry.INSTANCE.add(ROSE, 0.65F);
		CompostingChanceRegistry.INSTANCE.add(SUNSET_POPPY, 0.65F);
		CompostingChanceRegistry.INSTANCE.add(FAIRY_BLOSSOM, 0.65F);
		CompostingChanceRegistry.INSTANCE.add(MUSCARI, 0.65F);
		CompostingChanceRegistry.INSTANCE.add(PURPUREUM, 0.65F);
		// Flammability
		FlammableBlockRegistry.getDefaultInstance().add(FOXNIP, 100, 60);
		FlammableBlockRegistry.getDefaultInstance().add(FROSTED_FOXNIP, 100, 60);
		FlammableBlockRegistry.getDefaultInstance().add(PULSE_PETAL, 100, 60);
		FlammableBlockRegistry.getDefaultInstance().add(JUNGLE_GEM, 100, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ROSE, 100, 60);
		FlammableBlockRegistry.getDefaultInstance().add(SUNSET_POPPY, 100, 60);
		FlammableBlockRegistry.getDefaultInstance().add(FAIRY_BLOSSOM, 100, 60);
		FlammableBlockRegistry.getDefaultInstance().add(MUSCARI, 100, 60);
		FlammableBlockRegistry.getDefaultInstance().add(PURPUREUM, 100, 60);




	}
}
