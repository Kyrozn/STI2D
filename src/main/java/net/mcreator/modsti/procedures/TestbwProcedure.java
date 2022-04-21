package net.mcreator.modsti.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class TestbwProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos((int) x, (int) y, (int) (z + 1)), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), 3);
	}
}
