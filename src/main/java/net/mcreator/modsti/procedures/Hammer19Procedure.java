package net.mcreator.modsti.procedures;

import net.minecraftforge.eventbus.api.Event;

public class Hammer19Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock() == Blocks.BEDROCK)
				&& (world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) z)))
						.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) z))).getBlock() == Blocks.BEDROCK)) {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z)), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y + 2), (int) z), false);
			}
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) z)), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y - 2), (int) z), false);
			}
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 2))))
				.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1)))).getBlock() == Blocks.BEDROCK)
				&& (world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 2))))
						.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 1)))).getBlock() == Blocks.BEDROCK)) {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 2))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y + 2), (int) (z + 2)), false);
			}
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 2))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y - 2), (int) (z + 2)), false);
			}
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 2))))
				.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 2)))).getBlock() == Blocks.BEDROCK)
				&& (world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 2))))
						.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1)))).getBlock() == Blocks.BEDROCK)) {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 2))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y - 2), (int) (z - 2)), false);
			}
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 2))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y + 2), (int) (z - 2)), false);
			}
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1))))
				.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1)))).getBlock() == Blocks.BEDROCK)
				&& (world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1))))
						.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1)))).getBlock() == Blocks.BEDROCK)) {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y + 2), (int) (z + 1)), false);
			}
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y + 2), (int) (z - 1)), false);
			}
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 1))))
				.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 1)))).getBlock() == Blocks.BEDROCK)
				&& (world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 1))))
						.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 1)))).getBlock() == Blocks.BEDROCK)) {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 1))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y - 2), (int) (z + 1)), false);
			}
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 1))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y - 2), (int) (z - 1)), false);
			}
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)))).getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)))).getBlock() == Blocks.BEDROCK)
				&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2))))
						.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getBlock() == Blocks.BEDROCK)) {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z + 2)), false);
			}
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z - 2)), false);
			}
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 2))))
				.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 2)))).getBlock() == Blocks.BEDROCK)
				&& (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 2))))
						.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 2)))).getBlock() == Blocks.BEDROCK)) {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 2))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) (z + 2)), false);
			}
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 2))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z - 2)), false);
			}
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 2))))
				.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 2)))).getBlock() == Blocks.BEDROCK)
				&& (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 2))))
						.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 2)))).getBlock() == Blocks.BEDROCK)) {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 2))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z + 2)), false);
			}
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 2))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) (z - 2)), false);
			}
		}
	}
}
