package chalkboardmods.floralflair.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;

public class StonetteBlock extends FlowerBlock {

    public StonetteBlock(StatusEffect suspiciousStewEffect, int effectDuration, Settings settings) {
        super(suspiciousStewEffect, effectDuration, settings);
    }
    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.down();
        BlockState blockState = world.getBlockState(blockPos);
        return blockState.isOf(Blocks.STONE);
    }
}
