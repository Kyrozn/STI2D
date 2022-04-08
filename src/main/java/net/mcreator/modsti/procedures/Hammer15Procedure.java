package net.mcreator.modsti.procedures;

import net.minecraftforge.eventbus.api.Event;

public class Hammer15Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getBlock() == Blocks.BEDROCK)
				&& (world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z)))
						.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z))).getBlock() == Blocks.BEDROCK)) {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z)), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x + 2), (int) y, (int) z), false);
			}
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z)), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x - 2), (int) y, (int) z), false);
			}
		}
		if ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 2), (int) z)))
				.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 2), (int) z))).getBlock() == Blocks.BEDROCK)
				&& (world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) z)))
						.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) z))).getBlock() == Blocks.BEDROCK)) {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 2), (int) z)), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x + 2), (int) (y + 2), (int) z), false);
			}
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) z)), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x + 2), (int) (y - 2), (int) z), false);
			}
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock() == Blocks.BEDROCK)
				&& (world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z)))
						.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock() == Blocks.BEDROCK)) {
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
		if ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 2), (int) z)))
				.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 2), (int) z))).getBlock() == Blocks.BEDROCK)
				&& (world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) z)))
						.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) z))).getBlock() == Blocks.BEDROCK)) {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 2), (int) z)), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x - 2), (int) (y + 2), (int) z), false);
			}
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) z)), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x - 2), (int) (y - 2), (int) z), false);
			}
		}
		if ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 1), (int) z)))
				.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK)
				&& (world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) z)))
						.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK)) {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 1), (int) z)), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x - 2), (int) (y + 1), (int) z), false);
			}
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) z)), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x - 2), (int) (y - 1), (int) z), false);
			}
		}
		if ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) z)))
				.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK)
				&& (world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) z)))
						.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK)) {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) z)), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x + 2), (int) (y + 1), (int) z), false);
			}
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) z)), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x + 2), (int) (y - 1), (int) z), false);
			}
		}
		if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) z)))
				.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) z))).getBlock() == Blocks.BEDROCK)
				&& (world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) z)))
						.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) z))).getBlock() == Blocks.BEDROCK)) {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) z)), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 2), (int) z), false);
			}
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) z)), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x + 1), (int) (y - 2), (int) z), false);
			}
		}
		if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 2), (int) z)))
				.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 2), (int) z))).getBlock() == Blocks.BEDROCK)
				&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) z)))
						.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) z))).getBlock() == Blocks.BEDROCK)) {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 2), (int) z)), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x - 1), (int) (y + 2), (int) z), false);
			}
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) z)), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x - 1), (int) (y - 2), (int) z), false);
			}
		}
	}
}
