package net.mcreator.modsti.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.modsti.network.ModStiModVariables;

public class HammerSupremeQuandLeBlocEstDetruitAvecLoutilProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ModStiModVariables.Hammer_supremeX = x - 2;
		ModStiModVariables.Hammer_supremeX = y - 2;
		ModStiModVariables.Hammer_supremeX = z - 2;
		for (int index0 = 0; index0 < (int) (2); index0++) {
			if ((world.getBlockState(new BlockPos((int) ModStiModVariables.Hammer_supremeX, (int) ModStiModVariables.Hammer_supremeY,
					(int) ModStiModVariables.MapVariables.get(world).Hammer_supremeZ)))
							.getMaterial() == net.minecraft.world.level.material.Material.STONE) {
				if (world instanceof Level) {
					Block.dropResources(
							world.getBlockState(
									new BlockPos((int) (ModStiModVariables.Hammer_supremeX + 1), (int) (ModStiModVariables.Hammer_supremeY + 1),
											(int) (ModStiModVariables.MapVariables.get(world).Hammer_supremeZ + 1))),
							(Level) world, new BlockPos((int) ModStiModVariables.Hammer_supremeX, (int) ModStiModVariables.Hammer_supremeY,
									(int) ModStiModVariables.MapVariables.get(world).Hammer_supremeZ));
					world.destroyBlock(new BlockPos((int) (ModStiModVariables.Hammer_supremeX + 1), (int) (ModStiModVariables.Hammer_supremeY + 1),
							(int) (ModStiModVariables.MapVariables.get(world).Hammer_supremeZ + 1)), false);
				}
				if (world instanceof Level) {
					Block.dropResources(
							world.getBlockState(
									new BlockPos((int) (ModStiModVariables.Hammer_supremeX - 1), (int) (ModStiModVariables.Hammer_supremeY - 1),
											(int) (ModStiModVariables.MapVariables.get(world).Hammer_supremeZ - 1))),
							(Level) world, new BlockPos((int) ModStiModVariables.Hammer_supremeX, (int) ModStiModVariables.Hammer_supremeY,
									(int) ModStiModVariables.MapVariables.get(world).Hammer_supremeZ));
					world.destroyBlock(new BlockPos((int) (ModStiModVariables.Hammer_supremeX - 1), (int) (ModStiModVariables.Hammer_supremeY - 1),
							(int) (ModStiModVariables.MapVariables.get(world).Hammer_supremeZ - 1)), false);
				}
			}
		}
	}
}
