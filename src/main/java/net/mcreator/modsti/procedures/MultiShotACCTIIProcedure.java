package net.mcreator.modsti.procedures;

import net.minecraft.world.entity.projectile.Arrow;

public class MultiShotACCTIIProcedure {
	public static void execute() {
	}
}
if (!worldIn.isRemote) {
            ArrowEntity arrowentity = new arrowEntity(worldIn, playerIn);
            arrowentity.setItem(itemstack);
            arrowentity.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw + 20, 0.0F, 1.75F, 1.0F);
            worldIn.addEntity(arrowentity);
            ArrowEntity arrowentity2 = new ArrowEntity(worldIn, playerIn);
            arrowentity2.setItem(itemstack);
            arrowentity2.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw + 10, 0.0F, 1.75F, 1.0F);
            worldIn.addEntity(arrowentity2);
            ArrowEntity arrowentity3 = new KunaiEntity(worldIn, playerIn);
            arrowentity3.setItem(itemstack);
            arrowentity3.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.75F, 1.0F);
            worldIn.addEntity(arrowentity3);
            ArrowEntity arrowentity4 = new ArrowEntity(worldIn, playerIn);
            arrowentity4.setItem(itemstack);
            arrowentity4.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw - 10, 0.0F, 1.75F, 1.0F);
            worldIn.addEntity(arrowentity4);
            ArrowEntity arrowentity5 = new ArrowEntity(worldIn, playerIn);
            arrowentity5.setItem(itemstack);
            arrowentity5.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw - 20, 0.0F, 1.75F, 1.0F);
            worldIn.addEntity(arrowentity5);
}