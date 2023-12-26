package com.github.hellocrossy.wondersoftheworld.client.render.entity;
import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.model.EmuModel;
import com.github.hellocrossy.wondersoftheworld.entity.EmuEntity;
import com.github.hellocrossy.wondersoftheworld.entity.MargayEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.resources.EntityStatsManager;

public class EmuRenderer extends ZawaMobRenderer<EmuEntity, EmuModel> {
    public EmuRenderer(EntityRendererManager manager) {
        super(manager, new EmuModel.Adult(), new EmuModel.Child(), 0.65F);
    }

    @Override
    protected void scale(EmuEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
    @Override
    protected boolean hasBabyVariants(EmuEntity entity) {
        return false;
    }
}

