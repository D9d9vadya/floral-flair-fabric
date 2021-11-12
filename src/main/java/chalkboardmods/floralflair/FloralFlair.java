package chalkboardmods.floralflair;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerBlock;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraft.util.registry.*;

public class FloralFlair implements ModInitializer {
	public static final String MOD_ID = "floral_flair";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
	public static final Block FOXNIP = new FlowerBlock(StatusEffects.SLOWNESS, 8,FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque());
	public static final Block PULSE_PETAL = new FlowerBlock(StatusEffects.HEALTH_BOOST, 8,FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque());
	public static final Block FROSTED_FOXNIP = new FlowerBlock(StatusEffects.SLOWNESS, 5,FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque());
	public static final Block POTTED_FOXNIP = new FlowerPotBlock(FOXNIP,FabricBlockSettings.copyOf(Blocks.FLOWER_POT).nonOpaque());
	public static final Block POTTED_PULSE_PETAL = new FlowerPotBlock(PULSE_PETAL,FabricBlockSettings.copyOf(Blocks.FLOWER_POT).nonOpaque());
	public static final Block POTTED_FROSTED_FOXNIP = new FlowerPotBlock(FROSTED_FOXNIP,FabricBlockSettings.copyOf(Blocks.FLOWER_POT).nonOpaque());
	public static final Block FAIRY_BLOSSOM = new TallFlowerBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().strength(0.0f).sounds(BlockSoundGroup.GRASS).nonOpaque());
	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fairy_blossom"), FAIRY_BLOSSOM);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fairy_blossom"), new BlockItem(FAIRY_BLOSSOM, new FabricItemSettings()));
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "foxnip"), FOXNIP);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "foxnip"), new BlockItem(FOXNIP, new FabricItemSettings()));
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "potted_foxnip"),POTTED_FOXNIP);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "frosted_foxnip"), FROSTED_FOXNIP);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "frosted_foxnip"), new BlockItem(FROSTED_FOXNIP, new FabricItemSettings()));
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "potted_frosted_foxnip"),POTTED_FROSTED_FOXNIP);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "pulse_petal"), PULSE_PETAL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pulse_petal"), new BlockItem(PULSE_PETAL, new FabricItemSettings()));
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "potted_pulse_petal"),POTTED_PULSE_PETAL);
		LOGGER.info("Hello Fabric world!");
	}
}
