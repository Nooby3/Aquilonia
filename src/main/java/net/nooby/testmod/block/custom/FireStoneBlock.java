package net.nooby.testmod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.nooby.testmod.item.custom.Flint_And_Steel_Boosted;

public class FireStoneBlock extends Block {
    public FireStoneBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
    }

    @SuppressWarnings("deprecation")
    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
                                             Hand handIn, BlockRayTraceResult hit) {
        /*if(!worldIn.isRemote()){
            if(handIn == Hand.MAIN_HAND){
                System.out.println("I right clicked a FireStone Block. Called for the Main Hand!");
            }
            if(handIn == Hand.OFF_HAND){
                System.out.println("I right clicked a FireStone Block. Called for the Off Hand!");
            }
        }*/
        return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
    }
    @SuppressWarnings("deprecation")
    @Override
    public void onBlockClicked(BlockState state, World worldIn, BlockPos pos, PlayerEntity player) {
        if(!worldIn.isRemote()){
            System.out.println("I left clicked a FireStone Block!");
        }
        super.onBlockClicked(state, worldIn, pos, player);
    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        Flint_And_Steel_Boosted.lightEntityOnFire(entityIn, 3);
        super.onEntityWalk(worldIn, pos, entityIn);
    }
}

