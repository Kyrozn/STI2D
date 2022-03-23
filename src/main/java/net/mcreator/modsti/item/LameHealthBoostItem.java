
package net.mcreator.modsti.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class LameHealthBoostItem extends SwordItem {
	public LameHealthBoostItem() {
		super(new Tier() {
			public int getUses() {
				return 1000;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.NETHER_STAR));
			}
		},

				3, -2f,

				new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());

		setRegistryName("lame_health_boost");
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Donne un effet de de Boost de Vie quand elle est dans l'inventaire"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		LameHealthBoostQuandLoutilEstDansLinventaireParTickProcedure.execute(entity);
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

}
