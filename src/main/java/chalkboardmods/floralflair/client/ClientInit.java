package chalkboardmods.floralflair.client;

import chalkboardmods.floralflair.core.init.FloralBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ClientInit implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // Foxnip
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.FOXNIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_FOXNIP, RenderLayer.getCutout());

        // Frosted Foxnip
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.FROSTED_FOXNIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_FROSTED_FOXNIP, RenderLayer.getCutout());

        // Rose
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_ROSE, RenderLayer.getCutout());

        // Jungle Gem
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.JUNGLE_GEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_JUNGLE_GEM, RenderLayer.getCutout());

        // Sunset Poppy
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.SUNSET_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_SUNSET_POPPY, RenderLayer.getCutout());

        // Pulse Petal
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.PULSE_PETAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_PULSE_PETAL, RenderLayer.getCutout());

        // Fairy Blossom
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.FAIRY_BLOSSOM, RenderLayer.getCutout());

        // Muscari
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.MUSCARI, RenderLayer.getCutout());

        // Purpureum
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.PURPUREUM, RenderLayer.getCutout());

        // Midnight_orchid
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.MIDNIGHT_ORCHID, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_MIDNIGHT_ORCHID, RenderLayer.getCutout());

        // Hyacinth
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.HYACINTH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_HYACINTH, RenderLayer.getCutout());

        // Anthurium
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.ANTHURIUM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_ANTHURIUM, RenderLayer.getCutout());

        // Snow_fall_flower
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.SNOW_FALL_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_SNOW_FALL_FLOWER, RenderLayer.getCutout());

        // Spiked_tulip
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.SPIKED_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_SPIKED_TULIP, RenderLayer.getCutout());

        // Stonnete
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.STONNETE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_STONNETE, RenderLayer.getCutout());

        // Lunula
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.LUNULA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_LUNULA, RenderLayer.getCutout());

//        FabricModelPredicateProviderRegistry.register(Item.fromBlock(FloralBlocks.LUNULA), new Identifier("time"), new UnclampedModelPredicateProvider(){
//            private double time;
//            private double step;
//            private long lastTick;
//
//            @Override
//            public float unclampedCall(ItemStack itemStack, @Nullable ClientWorld clientWorld, @Nullable LivingEntity livingEntity, int i) {
//                Entity entity;
//                Entity entity2 = entity = livingEntity != null ? livingEntity : itemStack.getHolder();
//                if (entity == null) {
//                    return 0.0f;
//                }
//                if (clientWorld == null && entity.world instanceof ClientWorld) {
//                    clientWorld = (ClientWorld)entity.world;
//                }
//                if (clientWorld == null) {
//                    return 0.0f;
//                }
//                double d = clientWorld.getDimension().isNatural() ? (double)clientWorld.getSkyAngle(1.0f) : Math.random();
//                d = this.getTime(clientWorld, d);
//                return (float)d;
//            }
//            private double getTime(World world, double skyAngle) {
//                if (world.getTime() != this.lastTick) {
//                    this.lastTick = world.getTime();
//                    double d = skyAngle - this.time;
//                    d = MathHelper.floorMod(d + 0.5, 1.0) - 0.5;
//                    this.step += d * 0.1;
//                    this.step *= 0.9;
//                    this.time = MathHelper.floorMod(this.time + this.step, 1.0);
//                }
//                return this.time;
//            }
//        });
    }
}
