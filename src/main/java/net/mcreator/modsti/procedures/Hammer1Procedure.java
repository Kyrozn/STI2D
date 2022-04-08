package net.mcreator.modsti.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class Hammer1Procedure {
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
		if ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 1))))
				.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK)
				&& (world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 1))))
						.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK)) {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 1))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x + 2), (int) y, (int) (z + 1)), false);
			}
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 1))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x + 2), (int) y, (int) (z - 1)), false);
			}
		}
		if ((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z - 1))))
				.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK)
				&& (world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z + 1))))
						.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK)) {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z - 1))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x - 2), (int) y, (int) (z - 1)), false);
			}
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z + 1))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x - 2), (int) y, (int) (z + 1)), false);
			}
		}
		if ((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z - 2))))
				.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z - 2)))).getBlock() == Blocks.BEDROCK)
				&& (world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z + 2))))
						.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z + 2)))).getBlock() == Blocks.BEDROCK)) {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z - 2))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x - 2), (int) y, (int) (z - 2)), false);
			}
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z + 2))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x - 2), (int) y, (int) (z + 2)), false);
			}
		}
		if ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 2))))
				.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 2)))).getBlock() == Blocks.BEDROCK)
				&& (world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 2))))
						.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z + 2)))).getBlock() == Blocks.BEDROCK)) {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 2))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x + 2), (int) y, (int) (z - 2)), false);
			}
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 2))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x + 2), (int) y, (int) (z + 2)), false);
			}
		}
		if ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 2))))
				.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 2)))).getBlock() == Blocks.BEDROCK)
				&& (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 2))))
						.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 2)))).getBlock() == Blocks.BEDROCK)) {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 2))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) (z - 2)), false);
			}
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 2))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) (z + 2)), false);
			}
		}
		if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 2))))
				.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 2)))).getBlock() == Blocks.BEDROCK)
				&& (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 2))))
						.getMaterial() == net.minecraft.world.level.material.Material.STONE
				&& !((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 2)))).getBlock() == Blocks.BEDROCK)) {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 2))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) (z - 2)), false);
			}
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 2))), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) (z + 2)), false);
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
	}
}
