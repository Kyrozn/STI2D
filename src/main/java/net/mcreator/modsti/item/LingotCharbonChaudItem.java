
package net.mcreator.modsti.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.Entity;

import net.mcreator.modsti.procedures.LingotCharbonChaudQuandLitemEstDansLinventaireParTickProcedure;

public class LingotCharbonChaudItem extends Item {
	public LingotCharbonChaudItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64).fireResistant().rarity(Rarity.RARE));
		setRegistryName("lingot_charbon_chaud");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		LingotCharbonChaudQuandLitemEstDansLinventaireParTickProcedure.execute(entity);
	}
}
