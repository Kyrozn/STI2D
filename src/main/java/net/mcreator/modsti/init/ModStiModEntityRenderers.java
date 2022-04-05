
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modsti.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModStiModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ModStiModEntities.ARC_CHARBON_CHAUD, ThrownItemRenderer::new);
		event.registerEntityRenderer(ModStiModEntities.ARC_CHARBON_CHAUD_TIERS_II, ThrownItemRenderer::new);
	}
}
