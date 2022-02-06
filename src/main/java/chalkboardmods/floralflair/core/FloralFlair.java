package chalkboardmods.floralflair.core;

import chalkboardmods.floralflair.common.FloralProperties;
import chalkboardmods.floralflair.common.blocks.AnthuriumBlock;
import chalkboardmods.floralflair.common.blocks.LunulaBlock;
import chalkboardmods.floralflair.common.blocks.PottedLunulaBlock;
import chalkboardmods.floralflair.common.blocks.StonetteBlock;
import chalkboardmods.floralflair.core.init.FloralBlocks;
import chalkboardmods.floralflair.core.init.FloralFeatures;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.sound.BlockSoundGroup;

import java.util.function.ToIntFunction;

import static chalkboardmods.floralflair.core.init.FloralBlocks.*;

public class FloralFlair implements ModInitializer {

	public static final String MOD_ID = "floral_flair";
//	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		//Blocks
		FloralBlocks.init();

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
