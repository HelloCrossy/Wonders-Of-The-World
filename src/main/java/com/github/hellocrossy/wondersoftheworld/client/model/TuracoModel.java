package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.TuracoEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class TuracoModel extends ZawaBaseModel<TuracoEntity> {

    public ModelRenderer Body;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends TuracoModel {

        public ModelRenderer Chest;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer WingFolded1Left;
        public ModelRenderer WingFolded1Right;
        public ModelRenderer Tail1;
        public ModelRenderer Neck;
        public ModelRenderer NeckBase;
        public ModelRenderer Head;
        public ModelRenderer Beak1;
        public ModelRenderer Beak3;
        public ModelRenderer Crest1;
        public ModelRenderer Crest2;
        public ModelRenderer Crest3;
        public ModelRenderer Crest4;
        public ModelRenderer Crest5;
        public ModelRenderer Beak2;
        public ModelRenderer Beak4;
        public ModelRenderer Crest6;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer Toe1Left;
        public ModelRenderer Toe2Left;
        public ModelRenderer Toe3Left;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Toe1Right;
        public ModelRenderer Toe2Right;
        public ModelRenderer Toe3Right;
        public ModelRenderer WingFolded2Left;
        public ModelRenderer WingFolded2Right;
        public ModelRenderer TailCenter;
        public ModelRenderer TailFeather1Left;
        public ModelRenderer TailFeather1Right;
        public ModelRenderer TailFeather2Left;
        public ModelRenderer TailFeather2Right;

        public Adult() {
            texWidth = 64;
            texHeight = 64;
            this.Toe2Left = new ModelRenderer(this, 10, 10);
            this.Toe2Left.setPos(0.1F, 0.2F, 0.8F);
            this.Toe2Left.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Left, -0.4363323129985824F, 0.17453292519943295F, 0.08726646259971647F);
            this.Crest2 = new ModelRenderer(this, 12, 37);
            this.Crest2.setPos(0.0F, -1.1F, 0.5F);
            this.Crest2.addBox(-0.4F, -1.0F, 0.0F, 0.8F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest2, -0.4363323129985824F, 0.0F, 0.0F);
            this.Beak3 = new ModelRenderer(this, 0, 39);
            this.Beak3.setPos(0.0F, -0.5F, -1.3F);
            this.Beak3.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Beak3, -0.2617993877991494F, 0.0F, 0.0F);
            this.WingFolded2Left = new ModelRenderer(this, 0, 0);
            this.WingFolded2Left.setPos(-0.1F, 0.0F, 5.0F);
            this.WingFolded2Left.addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFolded2Left, 0.2617993877991494F, 0.0F, 0.0F);
            this.Toe3Right = new ModelRenderer(this, 14, 0);
            this.Toe3Right.setPos(0.2F, 0.1F, 0.9F);
            this.Toe3Right.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe3Right, -0.5235987755982988F, 0.3490658503988659F, -0.15707963267948966F);
            this.Toe1Right = new ModelRenderer(this, 18, 1);
            this.Toe1Right.setPos(-0.2F, 0.1F, 0.3F);
            this.Toe1Right.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Right, 0.0F, 0.5235987755982988F, -0.12217304763960307F);
            this.TailFeather1Right = new ModelRenderer(this, 20, 15);
            this.TailFeather1Right.setPos(-0.3F, 0.1F, -0.2F);
            this.TailFeather1Right.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeather1Right, 0.0F, -0.15707963267948966F, 0.0F);
            this.Crest4 = new ModelRenderer(this, 27, 23);
            this.Crest4.setPos(0.0F, -1.3F, 0.5F);
            this.Crest4.addBox(-0.4F, -2.0F, 0.0F, 0.8F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest4, -0.2617993877991494F, 0.0F, 0.0F);
            this.Beak2 = new ModelRenderer(this, 9, 22);
            this.Beak2.setPos(0.0F, -0.5F, 0.0F);
            this.Beak2.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Beak2, 0.31939523979915685F, 0.0F, 0.0F);
            this.WingFolded2Right = new ModelRenderer(this, 0, 0);
            this.WingFolded2Right.setPos(0.1F, 0.0F, 5.0F);
            this.WingFolded2Right.addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFolded2Right, 0.2617993877991494F, 0.0F, 0.0F);
            this.TailFeather2Right = new ModelRenderer(this, 23, 7);
            this.TailFeather2Right.setPos(0.0F, 0.1F, -0.2F);
            this.TailFeather2Right.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeather2Right, 0.0F, -0.12217304763960307F, 0.0F);
            this.WingFolded1Left = new ModelRenderer(this, 0, 10);
            this.WingFolded1Left.setPos(2.0F, -0.1F, -2.5F);
            this.WingFolded1Left.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFolded1Left, 0.08726646259971647F, 0.0F, 0.0F);
            this.NeckBase = new ModelRenderer(this, 0, 1);
            this.NeckBase.setPos(0.0F, 0.2F, -1.8F);
            this.NeckBase.addBox(-0.5F, -2.5F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBase, -0.03490658503988659F, 0.0F, 0.0F);
            this.Crest5 = new ModelRenderer(this, 0, 10);
            this.Crest5.setPos(0.0F, -1.9F, -1.2F);
            this.Crest5.addBox(-0.5F, -1.5F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.3F);
            this.setRotateAngle(Crest5, -0.04363323129985824F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 10, 30);
            this.Neck.setPos(0.0F, -0.5F, 0.0F);
            this.Neck.addBox(-1.0F, -2.5F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 1.1344640137963142F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 20, 18);
            this.FootRight.setPos(0.1F, 2.5F, -1.1F);
            this.FootRight.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.5235987755982988F, -0.2617993877991494F, 0.0F);
            this.Head = new ModelRenderer(this, 18, 23);
            this.Head.setPos(0.0F, -2.3F, -1.5F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.3141592653589793F, 0.0F, 0.0F);
            this.Beak1 = new ModelRenderer(this, 0, 20);
            this.Beak1.setPos(0.0F, 0.0F, -1.5F);
            this.Beak1.addBox(-0.6F, 0.0F, -1.5F, 1.2F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Beak1, 0.2574360646691636F, 0.0F, 0.0F);
            this.Toe3Left = new ModelRenderer(this, 10, 12);
            this.Toe3Left.setPos(-0.2F, 0.1F, 0.9F);
            this.Toe3Left.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe3Left, -0.5235987755982988F, -0.3490658503988659F, 0.15707963267948966F);
            this.WingFolded1Right = new ModelRenderer(this, 0, 10);
            this.WingFolded1Right.setPos(-2.0F, -0.1F, -2.5F);
            this.WingFolded1Right.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFolded1Right, 0.08726646259971647F, 0.0F, 0.0F);
            this.Beak4 = new ModelRenderer(this, 0, 33);
            this.Beak4.setPos(0.0F, 0.0F, -1.5F);
            this.Beak4.addBox(-0.6F, 0.0F, 0.0F, 1.2F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Beak4, 0.7199483164476609F, 0.0F, 0.0F);
            this.TailFeather1Left = new ModelRenderer(this, 20, 15);
            this.TailFeather1Left.setPos(0.3F, 0.1F, -0.2F);
            this.TailFeather1Left.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeather1Left, 0.0F, 0.15707963267948966F, 0.0F);
            this.Toe1Left = new ModelRenderer(this, 14, 3);
            this.Toe1Left.setPos(0.2F, 0.1F, 0.3F);
            this.Toe1Left.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Left, 0.0F, -0.5235987755982988F, 0.12217304763960307F);
            this.TailCenter = new ModelRenderer(this, 9, 14);
            this.TailCenter.setPos(0.0F, 0.3F, 1.5F);
            this.TailCenter.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailCenter, -0.08726646259971647F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 20, 15);
            this.FootLeft.setPos(-0.1F, 2.5F, -1.1F);
            this.FootLeft.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.5235987755982988F, 0.2617993877991494F, 0.0F);
            this.Toe2Right = new ModelRenderer(this, 0, 14);
            this.Toe2Right.setPos(-0.1F, 0.2F, 0.8F);
            this.Toe2Right.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Right, -0.4363323129985824F, -0.17453292519943295F, -0.08726646259971647F);
            this.ThighRight = new ModelRenderer(this, 30, 32);
            this.ThighRight.setPos(-1.2F, 0.6F, -0.5F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.7853981633974483F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 30, 32);
            this.ThighLeft.setPos(1.2F, 0.6F, -0.5F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.7853981633974483F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 0, 23);
            this.LegLeft.setPos(0.0F, 2.6F, 1.0F);
            this.LegLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -0.7853981633974483F, 0.0F, 0.0F);
            this.Crest3 = new ModelRenderer(this, 15, 40);
            this.Crest3.setPos(0.0F, -1.7F, -0.9F);
            this.Crest3.addBox(-0.5F, -1.5F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest3, 0.04363323129985824F, 0.0F, 0.0F);
            this.Crest6 = new ModelRenderer(this, 18, 31);
            this.Crest6.setPos(0.0F, -1.5F, -0.3F);
            this.Crest6.addBox(0.0F, -0.5F, -0.5F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest6, 0.0781907508222411F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 0, 23);
            this.LegRight.setPos(0.0F, 2.6F, 1.0F);
            this.LegRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.7853981633974483F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 18.5F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.296705972839036F, 0.0F, 0.0F);
            this.TailFeather2Left = new ModelRenderer(this, 23, 7);
            this.TailFeather2Left.setPos(0.0F, 0.1F, -0.2F);
            this.TailFeather2Left.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeather2Left, 0.0F, 0.12217304763960307F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 28);
            this.Chest.setPos(0.0F, -1.7F, -3.0F);
            this.Chest.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.5235987755982988F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 24, 0);
            this.Tail1.setPos(0.0F, -1.6F, 3.0F);
            this.Tail1.addBox(-1.5F, 0.0F, -1.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.2617993877991494F, 0.0F, 0.0F);
            this.Crest1 = new ModelRenderer(this, 6, 36);
            this.Crest1.setPos(0.0F, -1.3F, -1.0F);
            this.Crest1.addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest1, 0.04363323129985824F, 0.0F, 0.0F);
            this.FootLeft.addChild(this.Toe2Left);
            this.Head.addChild(this.Crest2);
            this.Head.addChild(this.Beak3);
            this.WingFolded1Left.addChild(this.WingFolded2Left);
            this.FootRight.addChild(this.Toe3Right);
            this.FootRight.addChild(this.Toe1Right);
            this.TailCenter.addChild(this.TailFeather1Right);
            this.Head.addChild(this.Crest4);
            this.Beak1.addChild(this.Beak2);
            this.WingFolded1Right.addChild(this.WingFolded2Right);
            this.TailFeather1Right.addChild(this.TailFeather2Right);
            this.Body.addChild(this.WingFolded1Left);
            this.Neck.addChild(this.NeckBase);
            this.Head.addChild(this.Crest5);
            this.Chest.addChild(this.Neck);
            this.LegRight.addChild(this.FootRight);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.Beak1);
            this.FootLeft.addChild(this.Toe3Left);
            this.Body.addChild(this.WingFolded1Right);
            this.Beak3.addChild(this.Beak4);
            this.TailCenter.addChild(this.TailFeather1Left);
            this.FootLeft.addChild(this.Toe1Left);
            this.Tail1.addChild(this.TailCenter);
            this.LegLeft.addChild(this.FootLeft);
            this.FootRight.addChild(this.Toe2Right);
            this.Body.addChild(this.ThighRight);
            this.Body.addChild(this.ThighLeft);
            this.ThighLeft.addChild(this.LegLeft);
            this.Head.addChild(this.Crest3);
            this.Crest5.addChild(this.Crest6);
            this.ThighRight.addChild(this.LegRight);
            this.TailFeather1Left.addChild(this.TailFeather2Left);
            this.Body.addChild(this.Chest);
            this.Body.addChild(this.Tail1);
            this.Head.addChild(this.Crest1);
            this.saveBase();
        }

        @Override
        public void setupAnim(TuracoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }

    public static class Flying extends TuracoModel {

        public ModelRenderer Chest;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail1;
        public ModelRenderer Wing1Left;
        public ModelRenderer Wing1Right;
        public ModelRenderer Neck;
        public ModelRenderer NeckBase;
        public ModelRenderer Head;
        public ModelRenderer Beak1;
        public ModelRenderer Beak3;
        public ModelRenderer Crest1;
        public ModelRenderer Crest2;
        public ModelRenderer Crest3;
        public ModelRenderer Crest4;
        public ModelRenderer Crest5;
        public ModelRenderer Beak2;
        public ModelRenderer Beak4;
        public ModelRenderer Crest6;
        public ModelRenderer LeftLeg;
        public ModelRenderer LeftFoot;
        public ModelRenderer Toe1Left;
        public ModelRenderer Toe2Left;
        public ModelRenderer Toe3Left;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Toe1Right;
        public ModelRenderer Toe2Right;
        public ModelRenderer Toe3Right;
        public ModelRenderer TailCenter;
        public ModelRenderer TailFeather1Left;
        public ModelRenderer TailFeather1Right;
        public ModelRenderer TailFeather2Left;
        public ModelRenderer TailFeather2Right;
        public ModelRenderer Wing2Left;
        public ModelRenderer Wing3Left;
        public ModelRenderer WingTip5Left;
        public ModelRenderer WingTip4Left;
        public ModelRenderer WingTip3Left;
        public ModelRenderer WingTip2Left;
        public ModelRenderer WingTip1Left;
        public ModelRenderer Wing2Right;
        public ModelRenderer Wing3Right;
        public ModelRenderer WingTip5Right;
        public ModelRenderer WingTip4Right;
        public ModelRenderer WingTip3Right;
        public ModelRenderer WingTip2Right;
        public ModelRenderer WingTip1Right;

        public Flying() {
            texWidth = 64;
            texHeight = 64;
            this.Neck = new ModelRenderer(this, 10, 30);
            this.Neck.setPos(0.0F, -0.5F, 0.0F);
            this.Neck.addBox(-1.0F, -2.5F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 1.3962634015954636F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 30, 32);
            this.ThighLeft.setPos(1.2F, 0.6F, -0.5F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 1.2217304763960306F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 24, 0);
            this.Tail1.setPos(0.0F, -1.6F, 3.0F);
            this.Tail1.addBox(-1.5F, 0.0F, -1.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.2617993877991494F, 0.0F, 0.0F);
            this.WingTip4Right = new ModelRenderer(this, 54, 15);
            this.WingTip4Right.setPos(-1.5F, 0.01F, 0.2F);
            this.WingTip4Right.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTip4Right, 0.0F, -0.47123889803846897F, 0.0F);
            this.Crest6 = new ModelRenderer(this, 18, 31);
            this.Crest6.setPos(0.0F, -1.5F, -0.3F);
            this.Crest6.addBox(0.0F, -0.7F, -0.8F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest6, 0.0781907508222411F, 0.0F, 0.0F);
            this.Toe2Right = new ModelRenderer(this, 0, 14);
            this.Toe2Right.setPos(-0.1F, 0.2F, 0.8F);
            this.Toe2Right.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Right, -0.4363323129985824F, -0.17453292519943295F, -0.08726646259971647F);
            this.TailFeather1Right = new ModelRenderer(this, 20, 15);
            this.TailFeather1Right.setPos(-0.3F, 0.1F, -0.2F);
            this.TailFeather1Right.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeather1Right, 0.0F, -0.15707963267948966F, 0.0F);
            this.TailFeather2Left = new ModelRenderer(this, 23, 7);
            this.TailFeather2Left.setPos(0.0F, 0.1F, -0.2F);
            this.TailFeather2Left.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeather2Left, 0.0F, 0.12217304763960307F, 0.0F);
            this.NeckBase = new ModelRenderer(this, 0, 1);
            this.NeckBase.setPos(0.0F, 0.2F, -1.8F);
            this.NeckBase.addBox(-0.5F, -2.5F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBase, -0.03490658503988659F, 0.0F, 0.0F);
            this.TailCenter = new ModelRenderer(this, 9, 14);
            this.TailCenter.setPos(0.0F, 0.3F, 1.5F);
            this.TailCenter.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailCenter, -0.08726646259971647F, 0.0F, 0.0F);
            this.Beak1 = new ModelRenderer(this, 0, 20);
            this.Beak1.setPos(0.0F, 0.0F, -1.5F);
            this.Beak1.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Beak1, 0.17453292519943295F, 0.0F, 0.0F);
            this.Crest2 = new ModelRenderer(this, 12, 37);
            this.Crest2.setPos(0.0F, -1.1F, 0.5F);
            this.Crest2.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Crest2, -0.4363323129985824F, 0.0F, 0.0F);
            this.Beak2 = new ModelRenderer(this, 9, 22);
            this.Beak2.setPos(0.0F, -0.5F, 0.0F);
            this.Beak2.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Beak2, 0.31939523979915685F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 18, 23);
            this.Head.setPos(0.0F, -2.3F, -1.5F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.8726646259971648F, 0.0F, 0.0F);
            this.Beak4 = new ModelRenderer(this, 0, 33);
            this.Beak4.setPos(0.0F, 0.0F, -1.5F);
            this.Beak4.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Beak4, 0.6981317007977318F, 0.0F, 0.0F);
            this.WingTip4Left = new ModelRenderer(this, 54, 15);
            this.WingTip4Left.setPos(1.5F, 0.01F, 0.2F);
            this.WingTip4Left.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTip4Left, 0.0F, 0.47123889803846897F, 0.0F);
            this.Wing1Left = new ModelRenderer(this, 50, 0);
            this.Wing1Left.mirror = true;
            this.Wing1Left.setPos(1.8F, -1.3F, -2.5F);
            this.Wing1Left.addBox(0.0F, -0.5F, 0.0F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.Wing2Right = new ModelRenderer(this, 52, 5);
            this.Wing2Right.setPos(-3.0F, 0.01F, 4.0F);
            this.Wing2Right.addBox(-2.0F, -0.5F, -4.0F, 2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing2Right, 0.0F, -0.17453292519943295F, 0.0F);
            this.WingTip1Left = new ModelRenderer(this, 54, 15);
            this.WingTip1Left.setPos(1.7F, 0.01F, 0.5F);
            this.WingTip1Left.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTip1Left, 0.0F, 1.2042771838760875F, 0.0F);
            this.Wing3Left = new ModelRenderer(this, 52, 10);
            this.Wing3Left.setPos(2.0F, 0.01F, -4.0F);
            this.Wing3Left.addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing3Left, 0.0F, -0.2792526803190927F, 0.0F);
            this.Toe3Left = new ModelRenderer(this, 10, 12);
            this.Toe3Left.setPos(-0.2F, 0.1F, 0.9F);
            this.Toe3Left.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe3Left, -0.5235987755982988F, -0.3490658503988659F, 0.15707963267948966F);
            this.TailFeather1Left = new ModelRenderer(this, 20, 15);
            this.TailFeather1Left.setPos(0.3F, 0.1F, -0.2F);
            this.TailFeather1Left.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeather1Left, 0.0F, 0.15707963267948966F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 30, 32);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.2F, 0.6F, -0.5F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 1.2217304763960306F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 18.5F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.296705972839036F, 0.0F, 0.0F);
            this.Toe1Right = new ModelRenderer(this, 18, 1);
            this.Toe1Right.setPos(-0.2F, 0.1F, 0.3F);
            this.Toe1Right.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Right, 0.0F, 0.5235987755982988F, -0.12217304763960307F);
            this.Crest3 = new ModelRenderer(this, 15, 40);
            this.Crest3.setPos(0.0F, -1.7F, -0.9F);
            this.Crest3.addBox(-0.5F, -1.5F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest3, 0.04363323129985824F, 0.0F, 0.0F);
            this.Toe2Left = new ModelRenderer(this, 10, 10);
            this.Toe2Left.setPos(0.1F, 0.2F, 0.8F);
            this.Toe2Left.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Left, -0.4363323129985824F, 0.17453292519943295F, 0.08726646259971647F);
            this.WingTip5Left = new ModelRenderer(this, 54, 15);
            this.WingTip5Left.setPos(1.5F, 0.01F, 0.1F);
            this.WingTip5Left.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTip5Left, 0.0F, 0.22689280275926282F, 0.0F);
            this.Crest1 = new ModelRenderer(this, 6, 36);
            this.Crest1.setPos(0.0F, -1.3F, -1.0F);
            this.Crest1.addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest1, 0.04363323129985824F, 0.0F, 0.0F);
            this.Crest4 = new ModelRenderer(this, 27, 23);
            this.Crest4.setPos(0.0F, -1.3F, 0.5F);
            this.Crest4.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Crest4, -0.2617993877991494F, 0.0F, 0.0F);
            this.Crest5 = new ModelRenderer(this, 0, 10);
            this.Crest5.setPos(0.0F, -1.9F, -1.2F);
            this.Crest5.addBox(-0.5F, -1.5F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.3F);
            this.setRotateAngle(Crest5, -0.04363323129985824F, 0.0F, 0.0F);
            this.WingTip5Right = new ModelRenderer(this, 54, 15);
            this.WingTip5Right.setPos(-1.5F, 0.01F, 0.1F);
            this.WingTip5Right.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTip5Right, 0.0F, -0.22689280275926282F, 0.0F);
            this.WingTip2Right = new ModelRenderer(this, 54, 15);
            this.WingTip2Right.setPos(-1.6F, 0.01F, 0.4F);
            this.WingTip2Right.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTip2Right, 0.0F, -0.9424777960769379F, 0.0F);
            this.Wing1Right = new ModelRenderer(this, 50, 0);
            this.Wing1Right.setPos(-1.8F, -1.3F, -2.5F);
            this.Wing1Right.addBox(-3.0F, -0.5F, 0.0F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.WingTip2Left = new ModelRenderer(this, 54, 15);
            this.WingTip2Left.setPos(1.6F, 0.01F, 0.4F);
            this.WingTip2Left.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTip2Left, 0.0F, 0.9424777960769379F, 0.0F);
            this.WingTip3Left = new ModelRenderer(this, 54, 15);
            this.WingTip3Left.setPos(1.5F, 0.01F, 0.3F);
            this.WingTip3Left.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTip3Left, 0.0F, 0.7330382858376184F, 0.0F);
            this.Toe3Right = new ModelRenderer(this, 14, 0);
            this.Toe3Right.setPos(0.2F, 0.1F, 0.9F);
            this.Toe3Right.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe3Right, -0.5235987755982988F, 0.3490658503988659F, -0.15707963267948966F);
            this.WingTip1Right = new ModelRenderer(this, 54, 15);
            this.WingTip1Right.setPos(-1.7F, 0.01F, 0.5F);
            this.WingTip1Right.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTip1Right, 0.0F, -1.2042771838760875F, 0.0F);
            this.Wing3Right = new ModelRenderer(this, 52, 10);
            this.Wing3Right.mirror = true;
            this.Wing3Right.setPos(-2.0F, 0.01F, -4.0F);
            this.Wing3Right.addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing3Right, 0.0F, 0.2792526803190927F, 0.0F);
            this.LeftFoot = new ModelRenderer(this, 20, 15);
            this.LeftFoot.setPos(-0.1F, 2.5F, -1.1F);
            this.LeftFoot.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFoot, 0.5235987755982988F, 0.2617993877991494F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 28);
            this.Chest.setPos(0.0F, -1.7F, -3.0F);
            this.Chest.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.20943951023931953F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 14, 3);
            this.FootRight.setPos(0.1F, 2.5F, -1.1F);
            this.FootRight.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.5235987755982988F, -0.2617993877991494F, 0.0F);
            this.LegRight = new ModelRenderer(this, 0, 23);
            this.LegRight.setPos(0.0F, 2.6F, 1.0F);
            this.LegRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.3490658503988659F, 0.0F, 0.0F);
            this.Beak3 = new ModelRenderer(this, 0, 39);
            this.Beak3.setPos(0.0F, -0.6F, -1.3F);
            this.Beak3.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Beak3, -0.2617993877991494F, 0.0F, 0.0F);
            this.Wing2Left = new ModelRenderer(this, 52, 5);
            this.Wing2Left.mirror = true;
            this.Wing2Left.setPos(3.0F, 0.01F, 4.0F);
            this.Wing2Left.addBox(0.0F, -0.5F, -4.0F, 2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing2Left, 0.0F, 0.17453292519943295F, 0.0F);
            this.Toe1Left = new ModelRenderer(this, 14, 3);
            this.Toe1Left.setPos(0.2F, 0.1F, 0.3F);
            this.Toe1Left.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Left, 0.0F, -0.5235987755982988F, 0.12217304763960307F);
            this.TailFeather2Right = new ModelRenderer(this, 23, 7);
            this.TailFeather2Right.setPos(0.0F, 0.1F, -0.2F);
            this.TailFeather2Right.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeather2Right, 0.0F, -0.12217304763960307F, 0.0F);
            this.LeftLeg = new ModelRenderer(this, 0, 23);
            this.LeftLeg.setPos(0.0F, 2.6F, 1.0F);
            this.LeftLeg.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftLeg, -0.3490658503988659F, 0.0F, 0.0F);
            this.WingTip3Right = new ModelRenderer(this, 54, 15);
            this.WingTip3Right.setPos(-1.5F, 0.01F, 0.3F);
            this.WingTip3Right.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTip3Right, 0.0F, -0.7330382858376184F, 0.0F);
            this.Chest.addChild(this.Neck);
            this.Body.addChild(this.ThighLeft);
            this.Body.addChild(this.Tail1);
            this.Wing3Right.addChild(this.WingTip4Right);
            this.Crest5.addChild(this.Crest6);
            this.FootRight.addChild(this.Toe2Right);
            this.TailCenter.addChild(this.TailFeather1Right);
            this.TailFeather1Left.addChild(this.TailFeather2Left);
            this.Neck.addChild(this.NeckBase);
            this.Tail1.addChild(this.TailCenter);
            this.Head.addChild(this.Beak1);
            this.Head.addChild(this.Crest2);
            this.Beak1.addChild(this.Beak2);
            this.Neck.addChild(this.Head);
            this.Beak3.addChild(this.Beak4);
            this.Wing3Left.addChild(this.WingTip4Left);
            this.Body.addChild(this.Wing1Left);
            this.Wing1Right.addChild(this.Wing2Right);
            this.Wing3Left.addChild(this.WingTip1Left);
            this.Wing2Left.addChild(this.Wing3Left);
            this.LeftFoot.addChild(this.Toe3Left);
            this.TailCenter.addChild(this.TailFeather1Left);
            this.Body.addChild(this.ThighRight);
            this.FootRight.addChild(this.Toe1Right);
            this.Head.addChild(this.Crest3);
            this.LeftFoot.addChild(this.Toe2Left);
            this.Wing3Left.addChild(this.WingTip5Left);
            this.Head.addChild(this.Crest1);
            this.Head.addChild(this.Crest4);
            this.Head.addChild(this.Crest5);
            this.Wing3Right.addChild(this.WingTip5Right);
            this.Wing3Right.addChild(this.WingTip2Right);
            this.Body.addChild(this.Wing1Right);
            this.Wing3Left.addChild(this.WingTip2Left);
            this.Wing3Left.addChild(this.WingTip3Left);
            this.FootRight.addChild(this.Toe3Right);
            this.Wing3Right.addChild(this.WingTip1Right);
            this.Wing2Right.addChild(this.Wing3Right);
            this.LeftLeg.addChild(this.LeftFoot);
            this.Body.addChild(this.Chest);
            this.LegRight.addChild(this.FootRight);
            this.ThighRight.addChild(this.LegRight);
            this.Head.addChild(this.Beak3);
            this.Wing1Left.addChild(this.Wing2Left);
            this.LeftFoot.addChild(this.Toe1Left);
            this.TailFeather1Right.addChild(this.TailFeather2Right);
            this.ThighLeft.addChild(this.LeftLeg);
            this.Wing3Right.addChild(this.WingTip3Right);
            this.saveBase();
        }

        @Override
        public void setupAnim(TuracoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }

        public static class Child extends TuracoModel {
        
            public ModelRenderer Chest;
            public ModelRenderer Hips;
            public ModelRenderer WingFoldedLeft;
            public ModelRenderer WingFoldedRight;
            public ModelRenderer ThighLeft;
            public ModelRenderer ThighRight;
            public ModelRenderer NeckBase;
            public ModelRenderer Neck;
            public ModelRenderer Head;
            public ModelRenderer Beak1;
            public ModelRenderer Beak2;
            public ModelRenderer LegLeft;
            public ModelRenderer FootLeft;
            public ModelRenderer Toe1L;
            public ModelRenderer Toe2L;
            public ModelRenderer Toe3L;
            public ModelRenderer LegRight;
            public ModelRenderer FootRight;
            public ModelRenderer Toe1R;
            public ModelRenderer Toe2R;
            public ModelRenderer Toe3R;

            public Child() {
                texWidth = 32;
                texHeight = 32;
                this.Toe2R = new ModelRenderer(this, 0, 0);
                this.Toe2R.setPos(-0.1F, 0.2F, 0.8F);
                this.Toe2R.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Toe2R, -0.4363323129985824F, -0.17453292519943295F, -0.08726646259971647F);
                this.ThighRight = new ModelRenderer(this, 10, 17);
                this.ThighRight.setPos(-1.3F, 0.0F, 0.0F);
                this.ThighRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(ThighRight, -0.4363323129985824F, 0.0F, 0.0F);
                this.Neck = new ModelRenderer(this, 18, 2);
                this.Neck.setPos(0.0F, -0.5F, -0.6F);
                this.Neck.addBox(-0.5F, -1.0F, -0.8F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.LegLeft = new ModelRenderer(this, 0, 0);
                this.LegLeft.setPos(0.0F, 0.9F, 1.4F);
                this.LegLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(LegLeft, -0.296705972839036F, 0.0F, 0.0F);
                this.WingFoldedRight = new ModelRenderer(this, 12, 4);
                this.WingFoldedRight.setPos(-1.9F, -1.7F, -1.8F);
                this.WingFoldedRight.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(WingFoldedRight, 0.05235987755982988F, 0.0F, 0.0F);
                this.NeckBase = new ModelRenderer(this, 19, 29);
                this.NeckBase.setPos(0.0F, -1.0F, -0.2F);
                this.NeckBase.addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(NeckBase, -0.2617993877991494F, 0.0F, 0.0F);
                this.Toe3L = new ModelRenderer(this, 6, 20);
                this.Toe3L.setPos(-0.2F, 0.1F, 0.9F);
                this.Toe3L.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Toe3L, -0.5235987755982988F, -0.3490658503988659F, 0.15707963267948966F);
                this.Chest = new ModelRenderer(this, 0, 23);
                this.Chest.setPos(0.0F, -0.1F, -1.3F);
                this.Chest.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Chest, 0.7853981633974483F, 0.0F, 0.0F);
                this.Toe3R = new ModelRenderer(this, 0, 20);
                this.Toe3R.setPos(0.2F, 0.1F, 0.9F);
                this.Toe3R.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Toe3R, -0.5235987755982988F, 0.3490658503988659F, -0.15707963267948966F);
                this.Beak1 = new ModelRenderer(this, 18, 17);
                this.Beak1.setPos(0.0F, 0.3F, -1.0F);
                this.Beak1.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.1F, 0.0F, 0.0F);
                this.setRotateAngle(Beak1, 0.12217304763960307F, 0.0F, 0.0F);
                this.Beak2 = new ModelRenderer(this, 18, 11);
                this.Beak2.setPos(0.0F, 0.9F, -1.0F);
                this.Beak2.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Beak2, 0.4363323129985824F, 0.0F, 0.0F);
                this.Toe1L = new ModelRenderer(this, 6, 20);
                this.Toe1L.setPos(0.2F, 0.1F, 0.3F);
                this.Toe1L.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Toe1L, 0.0F, -0.5235987755982988F, 0.12217304763960307F);
                this.Toe2L = new ModelRenderer(this, 16, 17);
                this.Toe2L.setPos(0.1F, 0.2F, 0.8F);
                this.Toe2L.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Toe2L, -0.4363323129985824F, 0.17453292519943295F, 0.08726646259971647F);
                this.LegRight = new ModelRenderer(this, 0, 0);
                this.LegRight.setPos(0.0F, 0.9F, 1.4F);
                this.LegRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(LegRight, -0.296705972839036F, 0.0F, 0.0F);
                this.FootRight = new ModelRenderer(this, 16, 20);
                this.FootRight.setPos(-0.1F, 2.3F, -0.5F);
                this.FootRight.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(FootRight, 1.3089969389957472F, 0.0F, 0.0F);
                this.WingFoldedLeft = new ModelRenderer(this, 12, 4);
                this.WingFoldedLeft.mirror = true;
                this.WingFoldedLeft.setPos(1.9F, -1.7F, -1.8F);
                this.WingFoldedLeft.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(WingFoldedLeft, 0.05235987755982988F, 0.0F, 0.0F);
                this.Hips = new ModelRenderer(this, 0, 8);
                this.Hips.setPos(0.0F, -1.9F, 2.0F);
                this.Hips.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Hips, -0.6108652381980153F, 0.0F, 0.0F);
                this.Body = new ModelRenderer(this, 0, 0);
                this.Body.setPos(0.0F, 20.5F, 0.0F);
                this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Body, -0.3752457891787809F, 0.0F, 0.0F);
                this.ThighLeft = new ModelRenderer(this, 12, 0);
                this.ThighLeft.setPos(1.3F, 0.0F, 0.0F);
                this.ThighLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(ThighLeft, -0.4363323129985824F, 0.0F, 0.0F);
                this.FootLeft = new ModelRenderer(this, 0, 20);
                this.FootLeft.setPos(0.1F, 2.3F, -0.5F);
                this.FootLeft.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(FootLeft, 1.3089969389957472F, 0.0F, 0.0F);
                this.Head = new ModelRenderer(this, 9, 11);
                this.Head.setPos(0.0F, -2.0F, -0.3F);
                this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Head, -0.15707963267948966F, 0.0F, 0.0F);
                this.Toe1R = new ModelRenderer(this, 0, 20);
                this.Toe1R.setPos(-0.2F, 0.1F, 0.3F);
                this.Toe1R.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Toe1R, 0.0F, 0.5235987755982988F, -0.12217304763960307F);
                this.FootRight.addChild(this.Toe2R);
                this.Body.addChild(this.ThighRight);
                this.NeckBase.addChild(this.Neck);
                this.ThighLeft.addChild(this.LegLeft);
                this.Body.addChild(this.WingFoldedRight);
                this.Chest.addChild(this.NeckBase);
                this.FootLeft.addChild(this.Toe3L);
                this.Body.addChild(this.Chest);
                this.FootRight.addChild(this.Toe3R);
                this.Head.addChild(this.Beak1);
                this.Beak1.addChild(this.Beak2);
                this.FootLeft.addChild(this.Toe1L);
                this.FootLeft.addChild(this.Toe2L);
                this.ThighRight.addChild(this.LegRight);
                this.LegRight.addChild(this.FootRight);
                this.Body.addChild(this.WingFoldedLeft);
                this.Body.addChild(this.Hips);
                this.Body.addChild(this.ThighLeft);
                this.LegLeft.addChild(this.FootLeft);
                this.NeckBase.addChild(this.Head);
                this.FootRight.addChild(this.Toe1R);
                this.saveBase();
            }

            @Override
            public void setupAnim(TuracoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            }

            @Override
            public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

            }

            @Override
            public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            }
        }
    }

