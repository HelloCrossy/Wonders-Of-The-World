package com.github.hellocrossy.wondersoftheworld.entity;

import com.github.hellocrossy.wondersoftheworld.sounds.WOTWSounds;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.NonTamedTargetGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;
import org.zawamod.zawa.world.entity.animal.ZawaLandEntity;

import javax.annotation.Nullable;

public class HamsterEntity extends ZawaLandEntity {
    public HamsterEntity(EntityType<? extends ZawaLandEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute registerAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.15F).add(Attributes.MAX_HEALTH, 3.0).add(Attributes.ATTACK_DAMAGE, 0.5);
    }
    @Override
    protected void registerGoals() {
        super.registerGoals();
         this.goalSelector.addGoal(1, new PanicGoal(this, 1.33));
        this.goalSelector.addGoal(4, new AvoidEntityGoal<>(this, PlayerEntity.class, 16.0F, 0.8, 1.33, (entity) -> AVOID_PLAYERS.test(entity) && !this.isTame()));
    }
    protected float getStandingEyeHeight(Pose pose, EntitySize size) {
        return size.height * 0.85F;
    }
    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return WOTWEntities.HAMSTER.get().create(world);
    }
}
