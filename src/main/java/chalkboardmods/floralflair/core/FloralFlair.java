package chalkboardmods.floralflair.core;

import chalkboardmods.floralflair.core.init.FloralBlocks;
import chalkboardmods.floralflair.core.init.FloralComposting;
import chalkboardmods.floralflair.core.init.FloralFeatures;
import chalkboardmods.floralflair.core.init.FloralFlammability;
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
		FloralFeatures.init();
		// Composting
		FloralComposting.init();
		// Flammability
		FloralFlammability.init();
	}
}
