package chalkboardmods.floralflair.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.Direction;

import java.util.Random;

import static net.minecraft.state.property.Properties.FACING;

public class PottedAnthuriumBlock extends FlowerPotBlock {


    public PottedAnthuriumBlock(Block content, Settings settings) {
        super(content, settings);
        setDefaultState(getStateManager().getDefaultState().with(FACING, getRandomDirection()));

    }

    public Direction getRandomDirection() {
        Random random = new Random();
        Direction[] d = {Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};
        int e = random.nextInt(d.length);
        return d[e];
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
    }
//    @Override
//    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
//        Vec3d vec3d = state.getModelOffset(world, pos);
//        VoxelShape SHAPE = makeShape();
//        return SHAPE.offset(vec3d.x, vec3d.y, vec3d.z);
//    }
}
