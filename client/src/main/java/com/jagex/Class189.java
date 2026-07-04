/* Class189 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class189 implements Interface58
{
    Class232 this$0;
    
    public void method380(Object object, float[] fs, Object[] objects) {
	Class491 class491 = (Class491) object;
	Class438 class438 = class491.method8029((byte) -93);
	float f = class491.method8020((short) -15312);
	float f_0_ = class491.method8031(2140162320);
	Class438 class438_1_ = this$0.method4245(419901809);
	Class438 class438_2_ = Class438.method7055(class438, class438_1_);
	float f_3_ = 0.0F;
	float f_4_ = class438_2_.method7012();
	if (f_4_ >= f_0_)
	    f_3_ = 0.0F;
	else {
	    float f_5_ = ((Float) objects[0]).floatValue();
	    float f_6_ = ((Float) objects[1]).floatValue();
	    if (class438_1_.aFloat4864 > class438.aFloat4864 - f_5_ / 2.0F
		&& class438_1_.aFloat4864 < f_5_ / 2.0F + class438.aFloat4864
		&& class438_1_.aFloat4865 > class438.aFloat4865 - f_6_ / 2.0F
		&& (class438_1_.aFloat4865
		    < f_6_ / 2.0F + class438.aFloat4865)) {
		float f_7_ = Math.abs(class438_1_.aFloat4864
				      - (f_5_ / 2.0F + class438.aFloat4864));
		float f_8_
		    = Math.abs(class438_1_.aFloat4864 - (class438.aFloat4864
							 - f_5_ / 2.0F));
		float f_9_
		    = Math.abs(class438_1_.aFloat4865 - (class438.aFloat4864
							 + f_6_ / 2.0F));
		float f_10_
		    = Math.abs(class438_1_.aFloat4865 - (class438.aFloat4864
							 - f_6_ / 2.0F));
		float f_11_ = f_0_ - f;
		float f_12_ = Math.min(f_7_, f_8_);
		float f_13_ = Math.min(f_9_, f_10_);
		float f_14_ = 1.0F / f_11_ * f_12_;
		float f_15_ = 1.0F / f_11_ * f_13_;
		f_14_ = Math.min(Math.max(f_14_, 0.0F), 1.0F);
		f_15_ = Math.min(Math.max(f_15_, 0.0F), 1.0F);
		f_3_ = Math.min(f_14_, f_15_);
	    }
	}
	fs[0] = f_3_;
	fs[1] = f_3_;
    }
    
    Class189(Class232 class232) {
	this$0 = class232;
    }
    
    public void method379(Object object, float[] fs, Object[] objects, int i) {
	Class491 class491 = (Class491) object;
	Class438 class438 = class491.method8029((byte) -68);
	float f = class491.method8020((short) -7111);
	float f_16_ = class491.method8031(2039716243);
	Class438 class438_17_ = this$0.method4245(1947361091);
	Class438 class438_18_ = Class438.method7055(class438, class438_17_);
	float f_19_ = 0.0F;
	float f_20_ = class438_18_.method7012();
	if (f_20_ >= f_16_)
	    f_19_ = 0.0F;
	else {
	    float f_21_ = ((Float) objects[0]).floatValue();
	    float f_22_ = ((Float) objects[1]).floatValue();
	    if (class438_17_.aFloat4864 > class438.aFloat4864 - f_21_ / 2.0F
		&& class438_17_.aFloat4864 < f_21_ / 2.0F + class438.aFloat4864
		&& class438_17_.aFloat4865 > class438.aFloat4865 - f_22_ / 2.0F
		&& (class438_17_.aFloat4865
		    < f_22_ / 2.0F + class438.aFloat4865)) {
		float f_23_ = Math.abs(class438_17_.aFloat4864
				       - (f_21_ / 2.0F + class438.aFloat4864));
		float f_24_
		    = Math.abs(class438_17_.aFloat4864 - (class438.aFloat4864
							  - f_21_ / 2.0F));
		float f_25_
		    = Math.abs(class438_17_.aFloat4865 - (class438.aFloat4864
							  + f_22_ / 2.0F));
		float f_26_
		    = Math.abs(class438_17_.aFloat4865 - (class438.aFloat4864
							  - f_22_ / 2.0F));
		float f_27_ = f_16_ - f;
		float f_28_ = Math.min(f_23_, f_24_);
		float f_29_ = Math.min(f_25_, f_26_);
		float f_30_ = 1.0F / f_27_ * f_28_;
		float f_31_ = 1.0F / f_27_ * f_29_;
		f_30_ = Math.min(Math.max(f_30_, 0.0F), 1.0F);
		f_31_ = Math.min(Math.max(f_31_, 0.0F), 1.0F);
		f_19_ = Math.min(f_30_, f_31_);
	    }
	}
	fs[0] = f_19_;
	fs[1] = f_19_;
    }
    
    public void method381(Object object, float[] fs, Object[] objects) {
	Class491 class491 = (Class491) object;
	Class438 class438 = class491.method8029((byte) -43);
	float f = class491.method8020((short) -8353);
	float f_32_ = class491.method8031(2084548481);
	Class438 class438_33_ = this$0.method4245(1453339775);
	Class438 class438_34_ = Class438.method7055(class438, class438_33_);
	float f_35_ = 0.0F;
	float f_36_ = class438_34_.method7012();
	if (f_36_ >= f_32_)
	    f_35_ = 0.0F;
	else {
	    float f_37_ = ((Float) objects[0]).floatValue();
	    float f_38_ = ((Float) objects[1]).floatValue();
	    if (class438_33_.aFloat4864 > class438.aFloat4864 - f_37_ / 2.0F
		&& class438_33_.aFloat4864 < f_37_ / 2.0F + class438.aFloat4864
		&& class438_33_.aFloat4865 > class438.aFloat4865 - f_38_ / 2.0F
		&& (class438_33_.aFloat4865
		    < f_38_ / 2.0F + class438.aFloat4865)) {
		float f_39_ = Math.abs(class438_33_.aFloat4864
				       - (f_37_ / 2.0F + class438.aFloat4864));
		float f_40_
		    = Math.abs(class438_33_.aFloat4864 - (class438.aFloat4864
							  - f_37_ / 2.0F));
		float f_41_
		    = Math.abs(class438_33_.aFloat4865 - (class438.aFloat4864
							  + f_38_ / 2.0F));
		float f_42_
		    = Math.abs(class438_33_.aFloat4865 - (class438.aFloat4864
							  - f_38_ / 2.0F));
		float f_43_ = f_32_ - f;
		float f_44_ = Math.min(f_39_, f_40_);
		float f_45_ = Math.min(f_41_, f_42_);
		float f_46_ = 1.0F / f_43_ * f_44_;
		float f_47_ = 1.0F / f_43_ * f_45_;
		f_46_ = Math.min(Math.max(f_46_, 0.0F), 1.0F);
		f_47_ = Math.min(Math.max(f_47_, 0.0F), 1.0F);
		f_35_ = Math.min(f_46_, f_47_);
	    }
	}
	fs[0] = f_35_;
	fs[1] = f_35_;
    }
    
    static final void method3758(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class247.anInt2531 * 1843164247;
    }
    
    static final void method3759(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
    }
    
    static final void method3760(Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	Class655.method10856(string, 31200788);
    }
    
    public static final void method3761(int i) {
	if (!client.aBool11143) {
	    client.aFloat11330 += (-12.0F - client.aFloat11330) / 2.0F;
	    client.aBool11147 = true;
	    client.aBool11143 = true;
	}
    }
    
    static final void method3762(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class331.method5857(class247, class243, class669, -1058497567);
    }
}
