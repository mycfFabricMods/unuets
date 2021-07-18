package mycf.unnuets.item;

import mycf.unnuets.unnuets;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RubyItem extends Item {

    public RubyItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        if (world.getBlockState(pos) == Blocks.MAGMA_BLOCK.getDefaultState()) {
            world.setBlockState(pos, unnuets.RUBY_CLUSTER.getDefaultState());
            world.addBlockBreakParticles(pos, Blocks.MAGMA_BLOCK.getDefaultState());
        }
        return super.useOnBlock(context);
    }
}
