package chalkboardmods.floralflair.core;

import chalkboardmods.floralflair.core.init.*;
import net.fabricmc.api.ModInitializer;

public class FloralFlair implements ModInitializer {

	public static final String MOD_ID = "floral_flair";
//	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Blocks
		FloralBlocks.init();
		// Config
		FloralConfig.init();
		// Features
		FloralFeatures.configuredRegister();
		FloralFeatures.placedRegister();
		//Generation
		FloralGeneration.init();
		// Composting
		FloralComposting.init();
		// Flammability
		FloralFlammability.init();
	}
}
