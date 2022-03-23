
package net.mcreator.modsti.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class LameOriginelItem extends SwordItem {
	public LameOriginelItem() {
		super(new Tier() {
			public int getUses() {
				return 1000;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		},

				3, -3f,

				new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());

		setRegistryName("lame_originel");
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Lame permettant de craft les Lame a effet"));
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

}
