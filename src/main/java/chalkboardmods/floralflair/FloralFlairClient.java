package chalkboardmods.floralflair;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.client.item.UnclampedModelPredicateProvider;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

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
        // Lunula
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.LUNULA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralFlair.POTTED_LUNULA, RenderLayer.getCutout());

//        FabricModelPredicateProviderRegistry.register(Item.fromBlock(FloralFlair.LUNULA), new Identifier("time"), new UnclampedModelPredicateProvider(){
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
