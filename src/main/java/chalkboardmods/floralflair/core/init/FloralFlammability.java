package chalkboardmods.floralflair.core.init;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

import static chalkboardmods.floralflair.core.init.FloralBlocks.*;

public class FloralFlammability {
    public static void init() {
        FlammableBlockRegistry.getDefaultInstance().add(FOXNIP, 100, 60);
        FlammableBlockRegistry.getDefaultInstance().add(FROSTED_FOXNIP, 100, 60);
        FlammableBlockRegistry.getDefaultInstance().add(PULSE_PETAL, 100, 60);
        FlammableBlockRegistry.getDefaultInstance().add(JUNGLE_GEM, 100, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ROSE, 100, 60);
        FlammableBlockRegistry.getDefaultInstance().add(SUNSET_POPPY, 100, 60);
        FlammableBlockRegistry.getDefaultInstance().add(FAIRY_BLOSSOM, 100, 60);
        FlammableBlockRegistry.getDefaultInstance().add(MUSCARI, 100, 60);
        FlammableBlockRegistry.getDefaultInstance().add(PURPUREUM, 100, 60);
        FlammableBlockRegistry.getDefaultInstance().add(MIDNIGHT_ORCHID, 100, 60);
        FlammableBlockRegistry.getDefaultInstance().add(HYACINTH, 100, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ANTHURIUM, 100, 60);
        FlammableBlockRegistry.getDefaultInstance().add(SNOW_FALL_FLOWER, 100, 60);
        FlammableBlockRegistry.getDefaultInstance().add(LUNULA, 100, 60);
        FlammableBlockRegistry.getDefaultInstance().add(SCILLA, 100, 60);

    }
}
