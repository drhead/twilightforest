package twilightforest.block;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import twilightforest.item.TFItems;
import net.minecraft.init.Blocks;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;

public class BlockTFGiantLeaves extends BlockTFGiantBlock {

	public BlockTFGiantLeaves() {
		super(Blocks.LEAVES.getDefaultState());
        this.setHardness(0.2F * 64F);
        this.setLightOpacity(1);
		this.setCreativeTab(TFItems.creativeTab);
	}

    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public boolean shouldSideBeRendered(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side) {
        switch (side) {
        case 0:
        	return (y & 3) == 3; 
        case 1:
        	return (y & 3) == 0; 
        case 2:
        	return (z & 3) == 3; 
        case 3:
        	return (z & 3) == 0; 
        case 4:
        	return (x & 3) == 3; 
        case 5:
        	return (x & 3) == 0; 
        }
        
        return super.shouldSideBeRendered(state, world, pos, side);
    }
}
