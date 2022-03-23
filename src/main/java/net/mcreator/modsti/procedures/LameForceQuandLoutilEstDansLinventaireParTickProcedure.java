package net.mcreator.modsti.procedures;

import net.minecraftforge.eventbus.api.Event;

public class LameForceQuandLoutilEstDansLinventaireParTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100, 1, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 100, 1, (false), (false)));
	}
}
