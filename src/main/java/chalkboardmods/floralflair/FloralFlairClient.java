package chalkboardmods.floralflair;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class FloralFlairClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // Foxnip
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.FOXNIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.POTTED_FOXNIP, RenderLayer.getCutout());
        // Frosted Foxnip
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.FROSTED_FOXNIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.POTTED_FROSTED_FOXNIP, RenderLayer.getCutout());
        // Rose
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.POTTED_ROSE, RenderLayer.getCutout());
        // Jungle Gem
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.JUNGLE_GEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.POTTED_JUNGLE_GEM, RenderLayer.getCutout());
        // Sunset Poppy
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.SUNSET_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.POTTED_SUNSET_POPPY, RenderLayer.getCutout());
        // Pulse Petal
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.PULSE_PETAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.POTTED_PULSE_PETAL, RenderLayer.getCutout());
        // Fairy Blossom
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.FAIRY_BLOSSOM, RenderLayer.getCutout());
        // Muscari
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.MUSCARI, RenderLayer.getCutout());
        // Purpureum
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.PURPUREUM, RenderLayer.getCutout());
        // Midnight_orchid
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.MIDNIGHT_ORCHID, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.POTTED_MIDNIGHT_ORCHID, RenderLayer.getCutout());
        // Hyacinth
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.HYACINTH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.POTTED_HYACINTH, RenderLayer.getCutout());
        // Anthurium
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.ANTHURIUM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.POTTED_ANTHURIUM, RenderLayer.getCutout());
        // Snow_fall_flower
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.SNOW_FALL_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.POTTED_SNOW_FALL_FLOWER, RenderLayer.getCutout());
        // Spiked_tulip
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.SPIKED_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.POTTED_SPIKED_TULIP, RenderLayer.getCutout());
        // Stonnete
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.STONNETE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.POTTED_STONNETE, RenderLayer.getCutout());
    }
}
