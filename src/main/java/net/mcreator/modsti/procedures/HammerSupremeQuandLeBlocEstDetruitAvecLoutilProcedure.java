package net.mcreator.modsti.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.modsti.network.ModStiModVariables;

public class HammerSupremeQuandLeBlocEstDetruitAvecLoutilProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ModStiModVariables.Hammer_supremeX = x - 2;
		ModStiModVariables.Hammer_supremeY = y - 2;
		ModStiModVariables.MapVariables.get(world).Hammer_supremeZ = z - 2;
		ModStiModVariables.MapVariables.get(world).syncData(world);
		for (int index0 = 0; index0 < (int) (5); index0++) {
			for (int index1 = 0; index1 < (int) (5); index1++) {
				for (int index2 = 0; index2 < (int) (5); index2++) {
					if ((world.getBlockState(new BlockPos((int) ModStiModVariables.Hammer_supremeX,
							(int) ModStiModVariables.MapVariables.get(world).Hammer_supremeZ, (int) ModStiModVariables.Hammer_supremeY)))
									.getMaterial() == net.minecraft.world.level.material.Material.STONE) {
						if (world instanceof Level) {
							Block.dropResources(
									world.getBlockState(
											new BlockPos((int) ModStiModVariables.Hammer_supremeX, (int) ModStiModVariables.Hammer_supremeY,
													(int) ModStiModVariables.MapVariables.get(world).Hammer_supremeZ)),
									(Level) world, new BlockPos((int) ModStiModVariables.Hammer_supremeX, (int) ModStiModVariables.Hammer_supremeY,
											(int) ModStiModVariables.MapVariables.get(world).Hammer_supremeZ));
							world.destroyBlock(new BlockPos((int) ModStiModVariables.Hammer_supremeX, (int) ModStiModVariables.Hammer_supremeY,
									(int) ModStiModVariables.MapVariables.get(world).Hammer_supremeZ), false);
						}
					}
					ModStiModVariables.Hammer_supremeY = ModStiModVariables.Hammer_supremeY + 1;
				}
				ModStiModVariables.Hammer_supremeX = ModStiModVariables.Hammer_supremeX + 1;
				ModStiModVariables.Hammer_supremeY = ModStiModVariables.Hammer_supremeY - 5;
			}
			ModStiModVariables.MapVariables.get(world).Hammer_supremeZ = ModStiModVariables.MapVariables.get(world).Hammer_supremeZ + 1;
			ModStiModVariables.MapVariables.get(world).syncData(world);
			ModStiModVariables.Hammer_supremeX = ModStiModVariables.Hammer_supremeX - 5;
		}
	}
}
