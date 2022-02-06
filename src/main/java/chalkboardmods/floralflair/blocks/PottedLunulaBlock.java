package chalkboardmods.floralflair.blocks;

import chalkboardmods.floralflair.FloralProperties;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class PottedLunulaBlock extends FlowerPotBlock {
    public static final IntProperty TIME = FloralProperties.TIME;

    public PottedLunulaBlock(Block content, Settings settings) {
        super(content, settings);
        setDefaultState(getStateManager().getDefaultState().with(TIME, 0));
    }


    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        super.appendProperties(stateManager);
        stateManager.add(TIME);
    }
    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        world.setBlockState(pos, state.with(TIME, getLunulaState(world)));
    }
    @Override
    public boolean hasRandomTicks(BlockState state) {
        return true;
    }
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        world.setBlockState(pos, state.with(TIME, getLunulaState(world)));
    }
    private int getLunulaState(World world) {
        long i = world.getTimeOfDay();
        int state = 0;
        if (i > 24000L) {
            i = i % 24000L;
        }
        System.out.println(i);
        if (i > 0L && i < 8200L){
            state = 0;
        }
        else if (i > 8200L && i < 12786L) {
            state = 1;
        }
        else if (i > 12786L && i < 13670L){
            state = 2;
        }
        else if (i > 13670L && i < 22331L){
            state = 3;
        }
        else if (i > 22331L && i < 23300L){
            state = 2;
        }
        else if (i > 23300L && i < 23900L){
            state = 1;
        }
        else if (i > 23900L && i < 24000L){
            state = 0;
        }
        return state;
    }

}
