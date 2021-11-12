package chalkboardmods.floralflair;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class FloralFlairClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.FOXNIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.POTTED_FOXNIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.FROSTED_FOXNIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.POTTED_FROSTED_FOXNIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.PULSE_PETAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.POTTED_PULSE_PETAL, RenderLayer.getCutout());
    }
}
