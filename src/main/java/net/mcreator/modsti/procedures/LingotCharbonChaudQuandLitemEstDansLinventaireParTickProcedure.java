package net.mcreator.modsti.procedures;

import net.minecraft.world.entity.Entity;

public class LingotCharbonChaudQuandLitemEstDansLinventaireParTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire((int) 1.5);
	}
}
