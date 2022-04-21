package net.mcreator.modsti.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class Builderwand3par3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getXRot() > 40 || entity.getXRot() < -40) {
			if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))
					.getMaterial() == net.minecraft.world.level.material.Material.DIRT
					|| (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))
							.getMaterial() == net.minecraft.world.level.material.Material.STONE
					|| (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))
							.getMaterial() == net.minecraft.world.level.material.Material.METAL)
					&& !((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK)) {
				world.setBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) z),
						(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))), 3);
			}
			if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					|| (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))
							.getMaterial() == net.minecraft.world.level.material.Material.DIRT
					|| (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))
							.getMaterial() == net.minecraft.world.level.material.Material.METAL)
					&& !((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK)) {
				world.setBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) z),
						(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))), 3);
			}
			if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					|| (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1))))
							.getMaterial() == net.minecraft.world.level.material.Material.DIRT
					|| (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1))))
							.getMaterial() == net.minecraft.world.level.material.Material.METAL)
					&& !((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK)) {
				world.setBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)),
						(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))), 3);
			}
			if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					|| (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))))
							.getMaterial() == net.minecraft.world.level.material.Material.DIRT
					|| (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))))
							.getMaterial() == net.minecraft.world.level.material.Material.METAL)
					&& !((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK)) {
				world.setBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)),
						(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))), 3);
			}
			if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					|| (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1))))
							.getMaterial() == net.minecraft.world.level.material.Material.DIRT
					|| (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1))))
							.getMaterial() == net.minecraft.world.level.material.Material.METAL)
					&& !((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK)) {
				world.setBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)),
						(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))), 3);
			}
			if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					|| (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1))))
							.getMaterial() == net.minecraft.world.level.material.Material.DIRT
					|| (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1))))
							.getMaterial() == net.minecraft.world.level.material.Material.METAL)
					&& !((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK)) {
				world.setBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)),
						(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)))), 3);
			}
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))
							.getMaterial() == net.minecraft.world.level.material.Material.DIRT
					|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))
							.getMaterial() == net.minecraft.world.level.material.Material.METAL)
					&& !((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK)) {
				world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)),
						(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))), 3);
			}
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
							.getMaterial() == net.minecraft.world.level.material.Material.DIRT
					|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
							.getMaterial() == net.minecraft.world.level.material.Material.METAL)
					&& !((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK)) {
				world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)),
						(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))), 3);
			}
		}
	}
}
