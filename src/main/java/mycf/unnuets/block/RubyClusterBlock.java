package mycf.unnuets.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RubyClusterBlock extends Block {
    public RubyClusterBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        entity.damage(DamageSource.HOT_FLOOR, 4);
        super.onSteppedOn(world, pos, state, entity);
    }
}
