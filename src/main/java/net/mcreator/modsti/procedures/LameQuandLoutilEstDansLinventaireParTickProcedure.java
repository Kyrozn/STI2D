package net.mcreator.modsti.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class LameQuandLoutilEstDansLinventaireParTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double baseRate = 0;
		double rateWithAmplifier = 0;
		double generator_distance = 0;
		if (0.25 > Math.random()) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 1));
		} else if (0.25 > Math.random()) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100, 1));
		} else if (0.25 > Math.random()) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 100, 0));
		} else if (0.25 > Math.random()) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1));
		} else if (0.25 > Math.random()) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 1));
		} else if (0.25 <= Math.random()) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 100, 1));
		}
	}
}
