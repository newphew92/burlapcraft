package edu.brown.cs.h2r.burlapcraft.dungeongenerator;

import edu.brown.cs.h2r.burlapcraft.BurlapCraft;
import edu.brown.cs.h2r.burlapcraft.helper.HelperGeometry.Pose;
import net.minecraft.block.Block;
import net.minecraft.world.World;

public class DungeonLocalizer extends Dungeon {

	public DungeonLocalizer(Pose _pose) {
		super("localizer", _pose, 11, 12, 4, Pose.fromXyz(1.5, 5, 3));
	}

	@Override
	protected void generate(World world, int x, int y, int z) {

		System.out.println("Making cleanup localizer at " + x + "," + y + "," + z);

		world.setBlock(x+0, y+0, z+0, Block.getBlockById(7));
		world.setBlock(x+1, y+0, z+0, Block.getBlockById(7));
		world.setBlock(x+2, y+0, z+0, Block.getBlockById(7));
		world.setBlock(x+3, y+0, z+0, Block.getBlockById(7));
		world.setBlock(x+4, y+0, z+0, Block.getBlockById(7));
		world.setBlock(x+5, y+0, z+0, Block.getBlockById(7));
		world.setBlock(x+6, y+0, z+0, Block.getBlockById(7));
		world.setBlock(x+7, y+0, z+0, Block.getBlockById(7));
		world.setBlock(x+8, y+0, z+0, Block.getBlockById(7));
		world.setBlock(x+9, y+0, z+0, Block.getBlockById(7));
		world.setBlock(x+10, y+0, z+0, Block.getBlockById(7));
		world.setBlock(x+11, y+0, z+0, Block.getBlockById(7));
		world.setBlock(x+12, y+0, z+0, Block.getBlockById(7));
		world.setBlock(x+13, y+0, z+0, Block.getBlockById(7));
		world.setBlock(x+14, y+0, z+0, Block.getBlockById(7));
		world.setBlock(x+15, y+0, z+0, Block.getBlockById(7));
		world.setBlock(x+0, y+0, z+1, Block.getBlockById(7));
		world.setBlock(x+1, y+0, z+1, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+1, y+0, z+1, 1, 1);
		world.setBlock(x+2, y+0, z+1, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+2, y+0, z+1, 1, 1);
		world.setBlock(x+3, y+0, z+1, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+3, y+0, z+1, 5, 5);
		world.setBlock(x+4, y+0, z+1, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+4, y+0, z+1, 1, 1);
		world.setBlock(x+5, y+0, z+1, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+5, y+0, z+1, 1, 1);
		world.setBlock(x+6, y+0, z+1, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+6, y+0, z+1, 4, 4);
		world.setBlock(x+7, y+0, z+1, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+7, y+0, z+1, 5, 5);
		world.setBlock(x+8, y+0, z+1, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+8, y+0, z+1, 5, 5);
		world.setBlock(x+9, y+0, z+1, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+9, y+0, z+1, 2, 2);
		world.setBlock(x+10, y+0, z+1, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+10, y+0, z+1, 1, 1);
		world.setBlock(x+11, y+0, z+1, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+11, y+0, z+1, 4, 4);
		world.setBlock(x+12, y+0, z+1, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+12, y+0, z+1, 7, 7);
		world.setBlock(x+13, y+0, z+1, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+13, y+0, z+1, 2, 2);
		world.setBlock(x+14, y+0, z+1, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+14, y+0, z+1, 4, 4);
		world.setBlock(x+15, y+0, z+1, Block.getBlockById(7));
		world.setBlock(x+0, y+0, z+2, Block.getBlockById(7));
		world.setBlock(x+1, y+0, z+2, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+1, y+0, z+2, 1, 1);
		world.setBlock(x+2, y+0, z+2, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+2, y+0, z+2, 2, 2);
		world.setBlock(x+3, y+0, z+2, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+3, y+0, z+2, 7, 7);
		world.setBlock(x+4, y+0, z+2, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+4, y+0, z+2, 2, 2);
		world.setBlock(x+5, y+0, z+2, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+5, y+0, z+2, 2, 2);
		world.setBlock(x+6, y+0, z+2, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+6, y+0, z+2, 5, 5);
		world.setBlock(x+7, y+0, z+2, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+7, y+0, z+2, 4, 4);
		world.setBlock(x+8, y+0, z+2, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+8, y+0, z+2, 7, 7);
		world.setBlock(x+9, y+0, z+2, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+9, y+0, z+2, 7, 7);
		world.setBlock(x+10, y+0, z+2, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+10, y+0, z+2, 7, 7);
		world.setBlock(x+11, y+0, z+2, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+11, y+0, z+2, 2, 2);
		world.setBlock(x+12, y+0, z+2, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+12, y+0, z+2, 5, 5);
		world.setBlock(x+13, y+0, z+2, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+13, y+0, z+2, 7, 7);
		world.setBlock(x+14, y+0, z+2, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+14, y+0, z+2, 2, 2);
		world.setBlock(x+15, y+0, z+2, Block.getBlockById(7));
		world.setBlock(x+0, y+0, z+3, Block.getBlockById(7));
		world.setBlock(x+1, y+0, z+3, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+1, y+0, z+3, 4, 4);
		world.setBlock(x+2, y+0, z+3, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+2, y+0, z+3, 5, 5);
		world.setBlock(x+3, y+0, z+3, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+3, y+0, z+3, 5, 5);
		world.setBlock(x+4, y+0, z+3, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+4, y+0, z+3, 1, 1);
		world.setBlock(x+5, y+0, z+3, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+5, y+0, z+3, 2, 2);
		world.setBlock(x+6, y+0, z+3, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+6, y+0, z+3, 1, 1);
		world.setBlock(x+7, y+0, z+3, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+7, y+0, z+3, 5, 5);
		world.setBlock(x+8, y+0, z+3, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+8, y+0, z+3, 4, 4);
		world.setBlock(x+9, y+0, z+3, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+9, y+0, z+3, 7, 7);
		world.setBlock(x+10, y+0, z+3, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+10, y+0, z+3, 1, 1);
		world.setBlock(x+11, y+0, z+3, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+11, y+0, z+3, 5, 5);
		world.setBlock(x+12, y+0, z+3, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+12, y+0, z+3, 2, 2);
		world.setBlock(x+13, y+0, z+3, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+13, y+0, z+3, 4, 4);
		world.setBlock(x+14, y+0, z+3, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+14, y+0, z+3, 2, 2);
		world.setBlock(x+15, y+0, z+3, Block.getBlockById(7));
		world.setBlock(x+0, y+0, z+4, Block.getBlockById(7));
		world.setBlock(x+1, y+0, z+4, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+1, y+0, z+4, 5, 5);
		world.setBlock(x+2, y+0, z+4, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+2, y+0, z+4, 2, 2);
		world.setBlock(x+3, y+0, z+4, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+3, y+0, z+4, 7, 7);
		world.setBlock(x+4, y+0, z+4, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+4, y+0, z+4, 4, 4);
		world.setBlock(x+5, y+0, z+4, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+5, y+0, z+4, 5, 5);
		world.setBlock(x+6, y+0, z+4, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+6, y+0, z+4, 1, 1);
		world.setBlock(x+7, y+0, z+4, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+7, y+0, z+4, 7, 7);
		world.setBlock(x+8, y+0, z+4, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+8, y+0, z+4, 4, 4);
		world.setBlock(x+9, y+0, z+4, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+9, y+0, z+4, 7, 7);
		world.setBlock(x+10, y+0, z+4, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+10, y+0, z+4, 2, 2);
		world.setBlock(x+11, y+0, z+4, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+11, y+0, z+4, 4, 4);
		world.setBlock(x+12, y+0, z+4, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+12, y+0, z+4, 7, 7);
		world.setBlock(x+13, y+0, z+4, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+13, y+0, z+4, 5, 5);
		world.setBlock(x+14, y+0, z+4, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+14, y+0, z+4, 1, 1);
		world.setBlock(x+15, y+0, z+4, Block.getBlockById(7));
		world.setBlock(x+0, y+0, z+5, Block.getBlockById(7));
		world.setBlock(x+1, y+0, z+5, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+1, y+0, z+5, 4, 4);
		world.setBlock(x+2, y+0, z+5, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+2, y+0, z+5, 2, 2);
		world.setBlock(x+3, y+0, z+5, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+3, y+0, z+5, 1, 1);
		world.setBlock(x+4, y+0, z+5, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+4, y+0, z+5, 2, 2);
		world.setBlock(x+5, y+0, z+5, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+5, y+0, z+5, 4, 4);
		world.setBlock(x+6, y+0, z+5, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+6, y+0, z+5, 5, 5);
		world.setBlock(x+7, y+0, z+5, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+7, y+0, z+5, 1, 1);
		world.setBlock(x+8, y+0, z+5, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+8, y+0, z+5, 2, 2);
		world.setBlock(x+9, y+0, z+5, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+9, y+0, z+5, 5, 5);
		world.setBlock(x+10, y+0, z+5, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+10, y+0, z+5, 5, 5);
		world.setBlock(x+11, y+0, z+5, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+11, y+0, z+5, 1, 1);
		world.setBlock(x+12, y+0, z+5, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+12, y+0, z+5, 1, 1);
		world.setBlock(x+13, y+0, z+5, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+13, y+0, z+5, 5, 5);
		world.setBlock(x+14, y+0, z+5, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+14, y+0, z+5, 7, 7);
		world.setBlock(x+15, y+0, z+5, Block.getBlockById(7));
		world.setBlock(x+0, y+0, z+6, Block.getBlockById(7));
		world.setBlock(x+1, y+0, z+6, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+1, y+0, z+6, 4, 4);
		world.setBlock(x+2, y+0, z+6, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+2, y+0, z+6, 1, 1);
		world.setBlock(x+3, y+0, z+6, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+3, y+0, z+6, 5, 5);
		world.setBlock(x+4, y+0, z+6, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+4, y+0, z+6, 4, 4);
		world.setBlock(x+5, y+0, z+6, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+5, y+0, z+6, 7, 7);
		world.setBlock(x+6, y+0, z+6, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+6, y+0, z+6, 4, 4);
		world.setBlock(x+7, y+0, z+6, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+7, y+0, z+6, 2, 2);
		world.setBlock(x+8, y+0, z+6, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+8, y+0, z+6, 4, 4);
		world.setBlock(x+9, y+0, z+6, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+9, y+0, z+6, 1, 1);
		world.setBlock(x+10, y+0, z+6, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+10, y+0, z+6, 7, 7);
		world.setBlock(x+11, y+0, z+6, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+11, y+0, z+6, 1, 1);
		world.setBlock(x+12, y+0, z+6, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+12, y+0, z+6, 1, 1);
		world.setBlock(x+13, y+0, z+6, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+13, y+0, z+6, 2, 2);
		world.setBlock(x+14, y+0, z+6, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+14, y+0, z+6, 7, 7);
		world.setBlock(x+15, y+0, z+6, Block.getBlockById(7));
		world.setBlock(x+0, y+0, z+7, Block.getBlockById(7));
		world.setBlock(x+1, y+0, z+7, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+1, y+0, z+7, 2, 2);
		world.setBlock(x+2, y+0, z+7, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+2, y+0, z+7, 5, 5);
		world.setBlock(x+3, y+0, z+7, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+3, y+0, z+7, 7, 7);
		world.setBlock(x+4, y+0, z+7, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+4, y+0, z+7, 7, 7);
		world.setBlock(x+5, y+0, z+7, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+5, y+0, z+7, 1, 1);
		world.setBlock(x+6, y+0, z+7, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+6, y+0, z+7, 5, 5);
		world.setBlock(x+7, y+0, z+7, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+7, y+0, z+7, 7, 7);
		world.setBlock(x+8, y+0, z+7, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+8, y+0, z+7, 2, 2);
		world.setBlock(x+9, y+0, z+7, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+9, y+0, z+7, 4, 4);
		world.setBlock(x+10, y+0, z+7, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+10, y+0, z+7, 4, 4);
		world.setBlock(x+11, y+0, z+7, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+11, y+0, z+7, 5, 5);
		world.setBlock(x+12, y+0, z+7, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+12, y+0, z+7, 5, 5);
		world.setBlock(x+13, y+0, z+7, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+13, y+0, z+7, 2, 2);
		world.setBlock(x+14, y+0, z+7, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+14, y+0, z+7, 1, 1);
		world.setBlock(x+15, y+0, z+7, Block.getBlockById(7));
		world.setBlock(x+0, y+0, z+8, Block.getBlockById(7));
		world.setBlock(x+1, y+0, z+8, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+1, y+0, z+8, 5, 5);
		world.setBlock(x+2, y+0, z+8, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+2, y+0, z+8, 7, 7);
		world.setBlock(x+3, y+0, z+8, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+3, y+0, z+8, 4, 4);
		world.setBlock(x+4, y+0, z+8, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+4, y+0, z+8, 1, 1);
		world.setBlock(x+5, y+0, z+8, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+5, y+0, z+8, 2, 2);
		world.setBlock(x+6, y+0, z+8, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+6, y+0, z+8, 5, 5);
		world.setBlock(x+7, y+0, z+8, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+7, y+0, z+8, 1, 1);
		world.setBlock(x+8, y+0, z+8, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+8, y+0, z+8, 5, 5);
		world.setBlock(x+9, y+0, z+8, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+9, y+0, z+8, 7, 7);
		world.setBlock(x+10, y+0, z+8, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+10, y+0, z+8, 4, 4);
		world.setBlock(x+11, y+0, z+8, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+11, y+0, z+8, 4, 4);
		world.setBlock(x+12, y+0, z+8, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+12, y+0, z+8, 7, 7);
		world.setBlock(x+13, y+0, z+8, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+13, y+0, z+8, 5, 5);
		world.setBlock(x+14, y+0, z+8, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+14, y+0, z+8, 4, 4);
		world.setBlock(x+15, y+0, z+8, Block.getBlockById(7));
		world.setBlock(x+0, y+0, z+9, Block.getBlockById(7));
		world.setBlock(x+1, y+0, z+9, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+1, y+0, z+9, 4, 4);
		world.setBlock(x+2, y+0, z+9, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+2, y+0, z+9, 4, 4);
		world.setBlock(x+3, y+0, z+9, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+3, y+0, z+9, 7, 7);
		world.setBlock(x+4, y+0, z+9, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+4, y+0, z+9, 2, 2);
		world.setBlock(x+5, y+0, z+9, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+5, y+0, z+9, 4, 4);
		world.setBlock(x+6, y+0, z+9, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+6, y+0, z+9, 4, 4);
		world.setBlock(x+7, y+0, z+9, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+7, y+0, z+9, 5, 5);
		world.setBlock(x+8, y+0, z+9, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+8, y+0, z+9, 7, 7);
		world.setBlock(x+9, y+0, z+9, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+9, y+0, z+9, 2, 2);
		world.setBlock(x+10, y+0, z+9, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+10, y+0, z+9, 7, 7);
		world.setBlock(x+11, y+0, z+9, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+11, y+0, z+9, 4, 4);
		world.setBlock(x+12, y+0, z+9, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+12, y+0, z+9, 5, 5);
		world.setBlock(x+13, y+0, z+9, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+13, y+0, z+9, 7, 7);
		world.setBlock(x+14, y+0, z+9, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+14, y+0, z+9, 4, 4);
		world.setBlock(x+15, y+0, z+9, Block.getBlockById(7));
		world.setBlock(x+0, y+0, z+10, Block.getBlockById(7));
		world.setBlock(x+1, y+0, z+10, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+1, y+0, z+10, 7, 7);
		world.setBlock(x+2, y+0, z+10, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+2, y+0, z+10, 2, 2);
		world.setBlock(x+3, y+0, z+10, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+3, y+0, z+10, 4, 4);
		world.setBlock(x+4, y+0, z+10, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+4, y+0, z+10, 5, 5);
		world.setBlock(x+5, y+0, z+10, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+5, y+0, z+10, 1, 1);
		world.setBlock(x+6, y+0, z+10, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+6, y+0, z+10, 1, 1);
		world.setBlock(x+7, y+0, z+10, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+7, y+0, z+10, 4, 4);
		world.setBlock(x+8, y+0, z+10, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+8, y+0, z+10, 5, 5);
		world.setBlock(x+9, y+0, z+10, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+9, y+0, z+10, 2, 2);
		world.setBlock(x+10, y+0, z+10, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+10, y+0, z+10, 1, 1);
		world.setBlock(x+11, y+0, z+10, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+11, y+0, z+10, 4, 4);
		world.setBlock(x+12, y+0, z+10, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+12, y+0, z+10, 7, 7);
		world.setBlock(x+13, y+0, z+10, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+13, y+0, z+10, 5, 5);
		world.setBlock(x+14, y+0, z+10, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+14, y+0, z+10, 1, 1);
		world.setBlock(x+15, y+0, z+10, Block.getBlockById(7));
		world.setBlock(x+0, y+0, z+11, Block.getBlockById(7));
		world.setBlock(x+1, y+0, z+11, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+1, y+0, z+11, 7, 7);
		world.setBlock(x+2, y+0, z+11, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+2, y+0, z+11, 7, 7);
		world.setBlock(x+3, y+0, z+11, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+3, y+0, z+11, 1, 1);
		world.setBlock(x+4, y+0, z+11, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+4, y+0, z+11, 7, 7);
		world.setBlock(x+5, y+0, z+11, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+5, y+0, z+11, 4, 4);
		world.setBlock(x+6, y+0, z+11, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+6, y+0, z+11, 4, 4);
		world.setBlock(x+7, y+0, z+11, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+7, y+0, z+11, 5, 5);
		world.setBlock(x+8, y+0, z+11, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+8, y+0, z+11, 7, 7);
		world.setBlock(x+9, y+0, z+11, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+9, y+0, z+11, 1, 1);
		world.setBlock(x+10, y+0, z+11, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+10, y+0, z+11, 2, 2);
		world.setBlock(x+11, y+0, z+11, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+11, y+0, z+11, 2, 2);
		world.setBlock(x+12, y+0, z+11, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+12, y+0, z+11, 4, 4);
		world.setBlock(x+13, y+0, z+11, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+13, y+0, z+11, 1, 1);
		world.setBlock(x+14, y+0, z+11, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+14, y+0, z+11, 5, 5);
		world.setBlock(x+15, y+0, z+11, Block.getBlockById(7));
		world.setBlock(x+0, y+0, z+12, Block.getBlockById(7));
		world.setBlock(x+1, y+0, z+12, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+1, y+0, z+12, 5, 5);
		world.setBlock(x+2, y+0, z+12, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+2, y+0, z+12, 4, 4);
		world.setBlock(x+3, y+0, z+12, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+3, y+0, z+12, 2, 2);
		world.setBlock(x+4, y+0, z+12, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+4, y+0, z+12, 5, 5);
		world.setBlock(x+5, y+0, z+12, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+5, y+0, z+12, 5, 5);
		world.setBlock(x+6, y+0, z+12, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+6, y+0, z+12, 1, 1);
		world.setBlock(x+7, y+0, z+12, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+7, y+0, z+12, 2, 2);
		world.setBlock(x+8, y+0, z+12, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+8, y+0, z+12, 2, 2);
		world.setBlock(x+9, y+0, z+12, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+9, y+0, z+12, 2, 2);
		world.setBlock(x+10, y+0, z+12, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+10, y+0, z+12, 1, 1);
		world.setBlock(x+11, y+0, z+12, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+11, y+0, z+12, 2, 2);
		world.setBlock(x+12, y+0, z+12, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+12, y+0, z+12, 5, 5);
		world.setBlock(x+13, y+0, z+12, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+13, y+0, z+12, 1, 1);
		world.setBlock(x+14, y+0, z+12, Block.getBlockById(35));
		world.setBlockMetadataWithNotify(x+14, y+0, z+12, 4, 4);
		world.setBlock(x+15, y+0, z+12, Block.getBlockById(7));
		world.setBlock(x+0, y+0, z+13, Block.getBlockById(7));
		world.setBlock(x+1, y+0, z+13, Block.getBlockById(7));
		world.setBlock(x+2, y+0, z+13, Block.getBlockById(7));
		world.setBlock(x+3, y+0, z+13, Block.getBlockById(7));
		world.setBlock(x+4, y+0, z+13, Block.getBlockById(7));
		world.setBlock(x+5, y+0, z+13, Block.getBlockById(7));
		world.setBlock(x+6, y+0, z+13, Block.getBlockById(7));
		world.setBlock(x+7, y+0, z+13, Block.getBlockById(7));
		world.setBlock(x+8, y+0, z+13, Block.getBlockById(7));
		world.setBlock(x+9, y+0, z+13, Block.getBlockById(7));
		world.setBlock(x+10, y+0, z+13, Block.getBlockById(7));
		world.setBlock(x+11, y+0, z+13, Block.getBlockById(7));
		world.setBlock(x+12, y+0, z+13, Block.getBlockById(7));
		world.setBlock(x+13, y+0, z+13, Block.getBlockById(7));
		world.setBlock(x+14, y+0, z+13, Block.getBlockById(7));
		world.setBlock(x+15, y+0, z+13, Block.getBlockById(7));
		world.setBlock(x+0, y+1, z+0, Block.getBlockById(7));
		world.setBlock(x+1, y+1, z+0, Block.getBlockById(7));
		world.setBlock(x+2, y+1, z+0, Block.getBlockById(7));
		world.setBlock(x+3, y+1, z+0, Block.getBlockById(7));
		world.setBlock(x+4, y+1, z+0, Block.getBlockById(7));
		world.setBlock(x+5, y+1, z+0, Block.getBlockById(7));
		world.setBlock(x+6, y+1, z+0, Block.getBlockById(7));
		world.setBlock(x+7, y+1, z+0, Block.getBlockById(7));
		world.setBlock(x+8, y+1, z+0, Block.getBlockById(7));
		world.setBlock(x+9, y+1, z+0, Block.getBlockById(7));
		world.setBlock(x+10, y+1, z+0, Block.getBlockById(7));
		world.setBlock(x+11, y+1, z+0, Block.getBlockById(7));
		world.setBlock(x+12, y+1, z+0, Block.getBlockById(7));
		world.setBlock(x+13, y+1, z+0, Block.getBlockById(7));
		world.setBlock(x+14, y+1, z+0, Block.getBlockById(7));
		world.setBlock(x+15, y+1, z+0, Block.getBlockById(7));
		world.setBlock(x+0, y+1, z+1, Block.getBlockById(7));
		world.setBlock(x+1, y+1, z+1, Block.getBlockById(0));
		world.setBlock(x+2, y+1, z+1, Block.getBlockById(0));
		world.setBlock(x+3, y+1, z+1, Block.getBlockById(0));
		world.setBlock(x+4, y+1, z+1, Block.getBlockById(0));
		world.setBlock(x+5, y+1, z+1, Block.getBlockById(0));
		world.setBlock(x+6, y+1, z+1, Block.getBlockById(0));
		world.setBlock(x+7, y+1, z+1, Block.getBlockById(0));
		world.setBlock(x+8, y+1, z+1, Block.getBlockById(0));
		world.setBlock(x+9, y+1, z+1, Block.getBlockById(0));
		world.setBlock(x+10, y+1, z+1, Block.getBlockById(0));
		world.setBlock(x+11, y+1, z+1, Block.getBlockById(0));
		world.setBlock(x+12, y+1, z+1, Block.getBlockById(0));
		world.setBlock(x+13, y+1, z+1, Block.getBlockById(0));
		world.setBlock(x+14, y+1, z+1, Block.getBlockById(0));
		world.setBlock(x+15, y+1, z+1, Block.getBlockById(7));
		world.setBlock(x+0, y+1, z+2, Block.getBlockById(7));
		world.setBlock(x+1, y+1, z+2, Block.getBlockById(0));
		world.setBlock(x+2, y+1, z+2, Block.getBlockById(0));
		world.setBlock(x+3, y+1, z+2, Block.getBlockById(0));
		world.setBlock(x+4, y+1, z+2, Block.getBlockById(0));
		world.setBlock(x+5, y+1, z+2, Block.getBlockById(0));
		world.setBlock(x+6, y+1, z+2, Block.getBlockById(0));
		world.setBlock(x+7, y+1, z+2, Block.getBlockById(0));
		world.setBlock(x+8, y+1, z+2, Block.getBlockById(0));
		world.setBlock(x+9, y+1, z+2, Block.getBlockById(0));
		world.setBlock(x+10, y+1, z+2, Block.getBlockById(0));
		world.setBlock(x+11, y+1, z+2, Block.getBlockById(0));
		world.setBlock(x+12, y+1, z+2, Block.getBlockById(0));
		world.setBlock(x+13, y+1, z+2, Block.getBlockById(0));
		world.setBlock(x+14, y+1, z+2, Block.getBlockById(0));
		world.setBlock(x+15, y+1, z+2, Block.getBlockById(7));
		world.setBlock(x+0, y+1, z+3, Block.getBlockById(7));
		world.setBlock(x+1, y+1, z+3, Block.getBlockById(0));
		world.setBlock(x+2, y+1, z+3, Block.getBlockById(0));
		world.setBlock(x+3, y+1, z+3, Block.getBlockById(0));
		world.setBlock(x+4, y+1, z+3, Block.getBlockById(0));
		world.setBlock(x+5, y+1, z+3, Block.getBlockById(0));
		world.setBlock(x+6, y+1, z+3, Block.getBlockById(0));
		world.setBlock(x+7, y+1, z+3, Block.getBlockById(0));
		world.setBlock(x+8, y+1, z+3, Block.getBlockById(0));
		world.setBlock(x+9, y+1, z+3, Block.getBlockById(0));
		world.setBlock(x+10, y+1, z+3, Block.getBlockById(0));
		world.setBlock(x+11, y+1, z+3, Block.getBlockById(0));
		world.setBlock(x+12, y+1, z+3, Block.getBlockById(0));
		world.setBlock(x+13, y+1, z+3, Block.getBlockById(0));
		world.setBlock(x+14, y+1, z+3, Block.getBlockById(0));
		world.setBlock(x+15, y+1, z+3, Block.getBlockById(7));
		world.setBlock(x+0, y+1, z+4, Block.getBlockById(7));
		world.setBlock(x+1, y+1, z+4, Block.getBlockById(0));
		world.setBlock(x+2, y+1, z+4, Block.getBlockById(0));
		world.setBlock(x+3, y+1, z+4, Block.getBlockById(0));
		world.setBlock(x+4, y+1, z+4, Block.getBlockById(0));
		world.setBlock(x+5, y+1, z+4, Block.getBlockById(0));
		world.setBlock(x+6, y+1, z+4, Block.getBlockById(0));
		world.setBlock(x+7, y+1, z+4, Block.getBlockById(0));
		world.setBlock(x+8, y+1, z+4, Block.getBlockById(0));
		world.setBlock(x+9, y+1, z+4, Block.getBlockById(0));
		world.setBlock(x+10, y+1, z+4, Block.getBlockById(0));
		world.setBlock(x+11, y+1, z+4, Block.getBlockById(0));
		world.setBlock(x+12, y+1, z+4, Block.getBlockById(0));
		world.setBlock(x+13, y+1, z+4, Block.getBlockById(0));
		world.setBlock(x+14, y+1, z+4, Block.getBlockById(0));
		world.setBlock(x+15, y+1, z+4, Block.getBlockById(7));
		world.setBlock(x+0, y+1, z+5, Block.getBlockById(7));
		world.setBlock(x+1, y+1, z+5, Block.getBlockById(0));
		world.setBlock(x+2, y+1, z+5, Block.getBlockById(0));
		world.setBlock(x+3, y+1, z+5, Block.getBlockById(0));
		world.setBlock(x+4, y+1, z+5, Block.getBlockById(0));
		world.setBlock(x+5, y+1, z+5, Block.getBlockById(0));
		world.setBlock(x+6, y+1, z+5, Block.getBlockById(0));
		world.setBlock(x+7, y+1, z+5, Block.getBlockById(0));
		world.setBlock(x+8, y+1, z+5, Block.getBlockById(0));
		world.setBlock(x+9, y+1, z+5, Block.getBlockById(0));
		world.setBlock(x+10, y+1, z+5, Block.getBlockById(0));
		world.setBlock(x+11, y+1, z+5, Block.getBlockById(0));
		world.setBlock(x+12, y+1, z+5, Block.getBlockById(0));
		world.setBlock(x+13, y+1, z+5, Block.getBlockById(0));
		world.setBlock(x+14, y+1, z+5, Block.getBlockById(0));
		world.setBlock(x+15, y+1, z+5, Block.getBlockById(7));
		world.setBlock(x+0, y+1, z+6, Block.getBlockById(7));
		world.setBlock(x+1, y+1, z+6, Block.getBlockById(0));
		world.setBlock(x+2, y+1, z+6, Block.getBlockById(0));
		world.setBlock(x+3, y+1, z+6, Block.getBlockById(0));
		world.setBlock(x+4, y+1, z+6, Block.getBlockById(0));
		world.setBlock(x+5, y+1, z+6, Block.getBlockById(0));
		world.setBlock(x+6, y+1, z+6, Block.getBlockById(0));
		world.setBlock(x+7, y+1, z+6, Block.getBlockById(0));
		world.setBlock(x+8, y+1, z+6, Block.getBlockById(0));
		world.setBlock(x+9, y+1, z+6, Block.getBlockById(0));
		world.setBlock(x+10, y+1, z+6, Block.getBlockById(0));
		world.setBlock(x+11, y+1, z+6, Block.getBlockById(0));
		world.setBlock(x+12, y+1, z+6, Block.getBlockById(0));
		world.setBlock(x+13, y+1, z+6, Block.getBlockById(0));
		world.setBlock(x+14, y+1, z+6, Block.getBlockById(0));
		world.setBlock(x+15, y+1, z+6, Block.getBlockById(7));
		world.setBlock(x+0, y+1, z+7, Block.getBlockById(7));
		world.setBlock(x+1, y+1, z+7, Block.getBlockById(0));
		world.setBlock(x+2, y+1, z+7, Block.getBlockById(0));
		world.setBlock(x+3, y+1, z+7, Block.getBlockById(0));
		world.setBlock(x+4, y+1, z+7, Block.getBlockById(0));
		world.setBlock(x+5, y+1, z+7, Block.getBlockById(0));
		world.setBlock(x+6, y+1, z+7, Block.getBlockById(0));
		world.setBlock(x+7, y+1, z+7, Block.getBlockById(0));
		world.setBlock(x+8, y+1, z+7, Block.getBlockById(0));
		world.setBlock(x+9, y+1, z+7, Block.getBlockById(0));
		world.setBlock(x+10, y+1, z+7, Block.getBlockById(0));
		world.setBlock(x+11, y+1, z+7, Block.getBlockById(0));
		world.setBlock(x+12, y+1, z+7, Block.getBlockById(0));
		world.setBlock(x+13, y+1, z+7, Block.getBlockById(0));
		world.setBlock(x+14, y+1, z+7, Block.getBlockById(0));
		world.setBlock(x+15, y+1, z+7, Block.getBlockById(7));
		world.setBlock(x+0, y+1, z+8, Block.getBlockById(7));
		world.setBlock(x+1, y+1, z+8, Block.getBlockById(0));
		world.setBlock(x+2, y+1, z+8, Block.getBlockById(0));
		world.setBlock(x+3, y+1, z+8, Block.getBlockById(0));
		world.setBlock(x+4, y+1, z+8, Block.getBlockById(0));
		world.setBlock(x+5, y+1, z+8, Block.getBlockById(0));
		world.setBlock(x+6, y+1, z+8, Block.getBlockById(0));
		world.setBlock(x+7, y+1, z+8, Block.getBlockById(0));
		world.setBlock(x+8, y+1, z+8, Block.getBlockById(0));
		world.setBlock(x+9, y+1, z+8, Block.getBlockById(0));
		world.setBlock(x+10, y+1, z+8, Block.getBlockById(0));
		world.setBlock(x+11, y+1, z+8, Block.getBlockById(0));
		world.setBlock(x+12, y+1, z+8, Block.getBlockById(0));
		world.setBlock(x+13, y+1, z+8, Block.getBlockById(0));
		world.setBlock(x+14, y+1, z+8, Block.getBlockById(0));
		world.setBlock(x+15, y+1, z+8, Block.getBlockById(7));
		world.setBlock(x+0, y+1, z+9, Block.getBlockById(7));
		world.setBlock(x+1, y+1, z+9, Block.getBlockById(0));
		world.setBlock(x+2, y+1, z+9, Block.getBlockById(0));
		world.setBlock(x+3, y+1, z+9, Block.getBlockById(0));
		world.setBlock(x+4, y+1, z+9, Block.getBlockById(0));
		world.setBlock(x+5, y+1, z+9, Block.getBlockById(0));
		world.setBlock(x+6, y+1, z+9, Block.getBlockById(0));
		world.setBlock(x+7, y+1, z+9, Block.getBlockById(0));
		world.setBlock(x+8, y+1, z+9, Block.getBlockById(0));
		world.setBlock(x+9, y+1, z+9, Block.getBlockById(0));
		world.setBlock(x+10, y+1, z+9, Block.getBlockById(0));
		world.setBlock(x+11, y+1, z+9, Block.getBlockById(0));
		world.setBlock(x+12, y+1, z+9, Block.getBlockById(0));
		world.setBlock(x+13, y+1, z+9, Block.getBlockById(0));
		world.setBlock(x+14, y+1, z+9, Block.getBlockById(0));
		world.setBlock(x+15, y+1, z+9, Block.getBlockById(7));
		world.setBlock(x+0, y+1, z+10, Block.getBlockById(7));
		world.setBlock(x+1, y+1, z+10, Block.getBlockById(0));
		world.setBlock(x+2, y+1, z+10, Block.getBlockById(0));
		world.setBlock(x+3, y+1, z+10, Block.getBlockById(0));
		world.setBlock(x+4, y+1, z+10, Block.getBlockById(0));
		world.setBlock(x+5, y+1, z+10, Block.getBlockById(0));
		world.setBlock(x+6, y+1, z+10, Block.getBlockById(0));
		world.setBlock(x+7, y+1, z+10, Block.getBlockById(0));
		world.setBlock(x+8, y+1, z+10, Block.getBlockById(0));
		world.setBlock(x+9, y+1, z+10, Block.getBlockById(0));
		world.setBlock(x+10, y+1, z+10, Block.getBlockById(0));
		world.setBlock(x+11, y+1, z+10, Block.getBlockById(0));
		world.setBlock(x+12, y+1, z+10, Block.getBlockById(0));
		world.setBlock(x+13, y+1, z+10, Block.getBlockById(0));
		world.setBlock(x+14, y+1, z+10, Block.getBlockById(0));
		world.setBlock(x+15, y+1, z+10, Block.getBlockById(7));
		world.setBlock(x+0, y+1, z+11, Block.getBlockById(7));
		world.setBlock(x+1, y+1, z+11, Block.getBlockById(0));
		world.setBlock(x+2, y+1, z+11, Block.getBlockById(0));
		world.setBlock(x+3, y+1, z+11, Block.getBlockById(0));
		world.setBlock(x+4, y+1, z+11, Block.getBlockById(0));
		world.setBlock(x+5, y+1, z+11, Block.getBlockById(0));
		world.setBlock(x+6, y+1, z+11, Block.getBlockById(0));
		world.setBlock(x+7, y+1, z+11, Block.getBlockById(0));
		world.setBlock(x+8, y+1, z+11, Block.getBlockById(0));
		world.setBlock(x+9, y+1, z+11, Block.getBlockById(0));
		world.setBlock(x+10, y+1, z+11, Block.getBlockById(0));
		world.setBlock(x+11, y+1, z+11, Block.getBlockById(0));
		world.setBlock(x+12, y+1, z+11, Block.getBlockById(0));
		world.setBlock(x+13, y+1, z+11, Block.getBlockById(0));
		world.setBlock(x+14, y+1, z+11, Block.getBlockById(0));
		world.setBlock(x+15, y+1, z+11, Block.getBlockById(7));
		world.setBlock(x+0, y+1, z+12, Block.getBlockById(7));
		world.setBlock(x+1, y+1, z+12, Block.getBlockById(0));
		world.setBlock(x+2, y+1, z+12, Block.getBlockById(0));
		world.setBlock(x+3, y+1, z+12, Block.getBlockById(0));
		world.setBlock(x+4, y+1, z+12, Block.getBlockById(0));
		world.setBlock(x+5, y+1, z+12, Block.getBlockById(0));
		world.setBlock(x+6, y+1, z+12, Block.getBlockById(0));
		world.setBlock(x+7, y+1, z+12, Block.getBlockById(0));
		world.setBlock(x+8, y+1, z+12, Block.getBlockById(0));
		world.setBlock(x+9, y+1, z+12, Block.getBlockById(0));
		world.setBlock(x+10, y+1, z+12, Block.getBlockById(0));
		world.setBlock(x+11, y+1, z+12, Block.getBlockById(0));
		world.setBlock(x+12, y+1, z+12, Block.getBlockById(0));
		world.setBlock(x+13, y+1, z+12, Block.getBlockById(0));
		world.setBlock(x+14, y+1, z+12, Block.getBlockById(0));
		world.setBlock(x+15, y+1, z+12, Block.getBlockById(7));
		world.setBlock(x+0, y+1, z+13, Block.getBlockById(7));
		world.setBlock(x+1, y+1, z+13, Block.getBlockById(7));
		world.setBlock(x+2, y+1, z+13, Block.getBlockById(7));
		world.setBlock(x+3, y+1, z+13, Block.getBlockById(7));
		world.setBlock(x+4, y+1, z+13, Block.getBlockById(7));
		world.setBlock(x+5, y+1, z+13, Block.getBlockById(7));
		world.setBlock(x+6, y+1, z+13, Block.getBlockById(7));
		world.setBlock(x+7, y+1, z+13, Block.getBlockById(7));
		world.setBlock(x+8, y+1, z+13, Block.getBlockById(7));
		world.setBlock(x+9, y+1, z+13, Block.getBlockById(7));
		world.setBlock(x+10, y+1, z+13, Block.getBlockById(7));
		world.setBlock(x+11, y+1, z+13, Block.getBlockById(7));
		world.setBlock(x+12, y+1, z+13, Block.getBlockById(7));
		world.setBlock(x+13, y+1, z+13, Block.getBlockById(7));
		world.setBlock(x+14, y+1, z+13, Block.getBlockById(7));
		world.setBlock(x+15, y+1, z+13, Block.getBlockById(7));
	}

}
