package net.mcreator.modsti.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;

import net.mcreator.modsti.init.ModStiModEnchantments;

public class ArcCharbonChaudLorsqueLeProjectileToucheUnBlocProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if (EnchantmentHelper.getItemEnchantmentLevel(ModStiModEnchantments.ENCHANT_ARC_CHARBON_CHAUD, itemstack) == 0) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x + 1), (y + 1), (z + 1), 1, Explosion.BlockInteraction.BREAK);
		}
	}
}