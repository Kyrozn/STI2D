package net.mcreator.modsti.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.modsti.init.ModStiModItems;
import net.mcreator.modsti.init.ModStiModEnchantments;

public class ArcCharbonChaudLorsqueLeProjectileToucheUnBlocProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (EnchantmentHelper.getItemEnchantmentLevel(ModStiModEnchantments.ENCHANT_ARC_CHARBON_CHAUD,
				new ItemStack(ModStiModItems.ARC_CHARBON_CHAUD)) == 1) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 1, Explosion.BlockInteraction.BREAK);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 5, 3, 3, 3, 1);
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(ModStiModEnchantments.ENCHANT_ARC_CHARBON_CHAUD,
				new ItemStack(ModStiModItems.ARC_CHARBON_CHAUD)) == 2) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 2, Explosion.BlockInteraction.BREAK);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 5, 3, 3, 3, 1);
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(ModStiModEnchantments.ENCHANT_ARC_CHARBON_CHAUD,
				new ItemStack(ModStiModItems.ARC_CHARBON_CHAUD)) == 3) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 3, Explosion.BlockInteraction.BREAK);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 5, 3, 3, 3, 1);
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(ModStiModEnchantments.ENCHANT_ARC_CHARBON_CHAUD,
				new ItemStack(ModStiModItems.ARC_CHARBON_CHAUD)) == 4) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.BREAK);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 5, 3, 3, 3, 1);
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(ModStiModEnchantments.ENCHANT_ARC_CHARBON_CHAUD,
				new ItemStack(ModStiModItems.ARC_CHARBON_CHAUD)) == 5) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 5, Explosion.BlockInteraction.BREAK);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 5, 3, 3, 3, 1);
		}
	}
}
