package net.mcreator.modsti.procedures;

import net.minecraftforge.eventbus.api.Event;

public class Hammersupremme1515Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getXRot() > 40 || entity.getXRot() < -40) {
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK)
					&& (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))
							.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) z), false);
				}
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) z), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK)
					&& (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))))
							.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1))), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)), false);
				}
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK)
					&& (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1))))
							.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1))), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)), false);
				}
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1))), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK)
					&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
							.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z + 1)), false);
				}
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), false);
				}
			}
			Hammer1Procedure.execute(world, x, y, z);
		} else if ((entity.getDirection()) == Direction.NORTH || (entity.getDirection()) == Direction.SOUTH) {
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK)
					&& (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))
							.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) z), false);
				}
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) z), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK)
					&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))
							.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), false);
				}
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) (y - 1), (int) z), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK)
					&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)))
							.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) (y - 1), (int) z), false);
				}
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK)
					&& (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
							.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
				}
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
				}
			}
			Hammer15Procedure.execute(world, x, y, z);
		} else if ((entity.getDirection()) == Direction.WEST || (entity.getDirection()) == Direction.EAST) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK)
					&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
							.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z + 1)), false);
				}
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), false);
				}
			}
			if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.BEDROCK)) == ((world
							.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))
									.getMaterial() == net.minecraft.world.level.material.Material.STONE
							&& !((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.BEDROCK))) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), false);
				}
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)), false);
				}
			}
			if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.BEDROCK)) == ((world
							.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))
									.getMaterial() == net.minecraft.world.level.material.Material.STONE
							&& !((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.BEDROCK))) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), false);
				}
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), false);
				}
			}
			if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK)) == ((world
							.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
									.getMaterial() == net.minecraft.world.level.material.Material.STONE
							&& !((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK))) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
				}
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
				}
			}
			Hammer19Procedure.execute(world, x, y, z);
		}
	}
}
