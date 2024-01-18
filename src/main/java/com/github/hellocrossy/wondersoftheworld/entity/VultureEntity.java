package com.github.hellocrossy.wondersoftheworld.entity;

import com.github.hellocrossy.wondersoftheworld.item.WOTWItems;
import com.github.hellocrossy.wondersoftheworld.sounds.WOTWSounds;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.NonTamedTargetGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.zawamod.zawa.world.entity.OviparousEntity;
import org.zawamod.zawa.world.entity.SpeciesVariantsEntity;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;
import org.zawamod.zawa.world.entity.animal.ZawaFlyingEntity;

import javax.annotation.Nullable;

public class VultureEntity extends ZawaFlyingEntity implements OviparousEntity, SpeciesVariantsEntity {
    public VultureEntity(EntityType<? extends ZawaFlyingEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute registerAttributes() {
        return createMobAttributes().add(Attributes.FLYING_SPEED, 0.6F).add(Attributes.MOVEMENT_SPEED, 0.225F).add(Attributes.MAX_HEALTH, 3.0).add(Attributes.ATTACK_DAMAGE, 1.0);
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return WOTWEntities.VULTURE.get().create(world);
    }
    @Override
    public ItemStack getBreedEggItem() {
        return WOTWItems.VULTURE_EGG.get().getDefaultInstance();
    }

    @Override
    public int getVariantByBiome(IWorld iWorld) {
        return random.nextInt(getWildVariants());
    }

    @Override
    protected void registerGoals() {
       // super.registerGoals();
       // this.goalSelector.addGoal(5, new ZawaMeleeAttackGoal(this, 1.5D, 1.33D, true));
       // this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
       // this.targetSelector.addGoal(3, new NonTamedTargetGoal<>(this, PlayerEntity.class, true, (entity) -> !this.isBaby()));
    }
    @Override
    public float getMaleRatio() {
        return 0.5F;
    }
    @Override
    protected SoundEvent getAmbientSound() {
        return WOTWSounds.VULTURE_AMBIENT.get();
    }
    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return WOTWSounds.VULTURE_HURT.get();
    }
    @Override
    public boolean doHurtTarget(Entity entity) {
        boolean didHurtTarget = super.doHurtTarget(entity);
        if (didHurtTarget) playSound(WOTWSounds.VULTURE_ATTACK.get(), 1.0F, 1.0F);
        return didHurtTarget;
    }
}
