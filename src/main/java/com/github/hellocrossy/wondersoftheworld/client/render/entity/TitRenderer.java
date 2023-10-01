package com.github.hellocrossy.wondersoftheworld.client.render.entity;
import com.github.hellocrossy.wondersoftheworld.client.model.TitModel;
import com.github.hellocrossy.wondersoftheworld.entity.TitEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TitRenderer extends ZawaMobRenderer<TitEntity, TitModel> {
    public TitRenderer(EntityRendererManager manager) {
        super(manager, new TitModel.Adult(), new TitModel.Flying(), new TitModel.Child(), 0.25F);
    }

    @Override
    protected void scale(TitEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.3F : 0.7F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}