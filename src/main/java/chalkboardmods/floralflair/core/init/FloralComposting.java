package chalkboardmods.floralflair.core.init;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;

import static chalkboardmods.floralflair.core.init.FloralBlocks.*;

public class FloralComposting {
    public static void init() {
        CompostingChanceRegistry.INSTANCE.add(FOXNIP, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(FROSTED_FOXNIP, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(PULSE_PETAL, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(JUNGLE_GEM, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(ROSE, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(SUNSET_POPPY, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(FAIRY_BLOSSOM, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(MUSCARI, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(PURPUREUM, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(MIDNIGHT_ORCHID, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(HYACINTH, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(ANTHURIUM, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(SNOW_FALL_FLOWER, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(SPIKED_TULIP, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(STONNETE, 0.65F);
        CompostingChanceRegistry.INSTANCE.add(LUNULA, 0.65F);
    }
}
