
package net.mcreator.modsti.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fmllegacy.network.NetworkHooks;
import net.minecraftforge.fmllegacy.network.FMLPlayMessages;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.modsti.procedures.ProjectileToucheEntiteVivanteMetLeFeuProcedure;
import net.mcreator.modsti.procedures.ArcCharbonChaudLorsqueLeProjectileToucheUnBlocProcedure;
import net.mcreator.modsti.init.ModStiModEntities;

import java.util.Random;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class ArcCharbonChaudEntity extends AbstractArrow implements ItemSupplier {
	public ArcCharbonChaudEntity(FMLPlayMessages.SpawnEntity packet, Level world) {
		super(ModStiModEntities.ARC_CHARBON_CHAUD, world);
	}

	public ArcCharbonChaudEntity(EntityType<? extends ArcCharbonChaudEntity> type, Level world) {
		super(type, world);
	}

	public ArcCharbonChaudEntity(EntityType<? extends ArcCharbonChaudEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public ArcCharbonChaudEntity(EntityType<? extends ArcCharbonChaudEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Items.ARROW);
	}

	@Override
	protected ItemStack getPickupItem() {
		return null;
	}

	@Override
	public void playerTouch(Player entity) {
		super.playerTouch(entity);
		Entity sourceentity = this.getOwner();
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level;
		Entity imediatesourceentity = this;

		ProjectileToucheEntiteVivanteMetLeFeuProcedure.execute(entity);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
		Entity sourceentity = this.getOwner();
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level;
		Entity imediatesourceentity = this;

		ProjectileToucheEntiteVivanteMetLeFeuProcedure.execute(entity);
	}

	@Override
	public void tick() {
		super.tick();
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level;
		Entity entity = this.getOwner();
		Entity imediatesourceentity = this;
		if (this.inGround) {

			ArcCharbonChaudLorsqueLeProjectileToucheUnBlocProcedure.execute(world, x, y, z);
			this.discard();
		}
	}

	public static ArcCharbonChaudEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		ArcCharbonChaudEntity entityarrow = new ArcCharbonChaudEntity(ModStiModEntities.ARC_CHARBON_CHAUD, entity, world);
		entityarrow.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(true);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		entityarrow.setSecondsOnFire(100);
		world.addFreshEntity(entityarrow);
		world.playSound((Player) null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static ArcCharbonChaudEntity shoot(LivingEntity entity, LivingEntity target) {
		ArcCharbonChaudEntity entityarrow = new ArcCharbonChaudEntity(ModStiModEntities.ARC_CHARBON_CHAUD, entity, entity.level);
		double d0 = target.getY() + (double) target.getEyeHeight() - 1.1;
		double d1 = target.getX() - entity.getX();
		double d3 = target.getZ() - entity.getZ();
		entityarrow.shoot(d1, d0 - entityarrow.getY() + Math.sqrt(d1 * d1 + d3 * d3) * 0.2F, d3, 3.9999999999999996f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(2);
		entityarrow.setKnockback(2);
		entityarrow.setCritArrow(true);
		entityarrow.setSecondsOnFire(100);
		entity.level.addFreshEntity(entityarrow);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		entity.level.playSound((Player) null, (double) x, (double) y, (double) z,
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (new Random().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
