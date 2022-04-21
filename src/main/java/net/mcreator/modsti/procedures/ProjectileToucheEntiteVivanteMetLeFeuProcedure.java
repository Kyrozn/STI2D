package net.mcreator.modsti.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class ProjectileToucheEntiteVivanteMetLeFeuProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.IN_FIRE, (float) 0.5);
	}
}
