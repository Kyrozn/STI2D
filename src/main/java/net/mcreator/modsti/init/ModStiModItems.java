
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modsti.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.modsti.item.TestArmorItem;
import net.mcreator.modsti.item.LingotCharbonChaudItem;
import net.mcreator.modsti.item.LameSpeedItem;
import net.mcreator.modsti.item.LameResistanceItem;
import net.mcreator.modsti.item.LameRegenerationItem;
import net.mcreator.modsti.item.LameOriginelItem;
import net.mcreator.modsti.item.LameHealthBoostItem;
import net.mcreator.modsti.item.LameForceItem;
import net.mcreator.modsti.item.HuhItem;
import net.mcreator.modsti.item.HammerSupremeItem;
import net.mcreator.modsti.item.ArcCharbonChaudTiersIIItem;
import net.mcreator.modsti.item.ArcCharbonChaudItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModStiModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item CHARBONCHAUD = register(ModStiModBlocks.CHARBONCHAUD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item LINGOT_CHARBON_CHAUD = register(new LingotCharbonChaudItem());
	public static final Item ARC_CHARBON_CHAUD = register(new ArcCharbonChaudItem());
	public static final Item LAME_SPEED = register(new LameSpeedItem());
	public static final Item LAME_REGENERATION = register(new LameRegenerationItem());
	public static final Item LAME_HEALTH_BOOST = register(new LameHealthBoostItem());
	public static final Item LAME_RESISTANCE = register(new LameResistanceItem());
	public static final Item LAME_FORCE = register(new LameForceItem());
	public static final Item LAME_ORIGINEL = register(new LameOriginelItem());
	public static final Item HAMMER_SUPREME = register(new HammerSupremeItem());
	public static final Item HUH = register(new HuhItem());
	public static final Item TEST_ARMOR_HELMET = register(new TestArmorItem.Helmet());
	public static final Item TEST_ARMOR_CHESTPLATE = register(new TestArmorItem.Chestplate());
	public static final Item TEST_ARMOR_LEGGINGS = register(new TestArmorItem.Leggings());
	public static final Item TEST_ARMOR_BOOTS = register(new TestArmorItem.Boots());
	public static final Item ARC_CHARBON_CHAUD_TIERS_II = register(new ArcCharbonChaudTiersIIItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
