/* Class430 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class430
{
    float aFloat4821;
    float[] aFloatArray4822;
    Class438[] aClass438Array4823 = new Class438[4];
    
    void method6814(int i, Class438 class438) {
	aClass438Array4823[i].method6992(class438);
	method6815();
    }
    
    void method6815() {
	aFloat4821 = -1.0F;
	aFloatArray4822 = null;
    }
    
    double[] method6816(float f) {
	double[] ds = new double[3];
	float f_0_ = f * f;
	float f_1_ = f_0_ * f;
	double d = (double) (3.0F * (aClass438Array4823[1].aFloat4864
				     - aClass438Array4823[0].aFloat4864));
	double d_2_ = ((double) (3.0F * (aClass438Array4823[2].aFloat4864
					 - aClass438Array4823[1].aFloat4864))
		       - d);
	double d_3_ = ((double) (aClass438Array4823[3].aFloat4864
				 - aClass438Array4823[0].aFloat4864)
		       - d - d_2_);
	ds[0] = (d_3_ * (double) f_1_ + d_2_ * (double) f_0_ + d * (double) f
		 + (double) aClass438Array4823[0].aFloat4864);
	d = (double) (3.0F * (aClass438Array4823[1].aFloat4863
			      - aClass438Array4823[0].aFloat4863));
	d_2_ = (double) (3.0F * (aClass438Array4823[2].aFloat4863
				 - aClass438Array4823[1].aFloat4863)) - d;
	d_3_ = (double) (aClass438Array4823[3].aFloat4863
			 - aClass438Array4823[0].aFloat4863) - d - d_2_;
	ds[1] = (d_3_ * (double) f_1_ + d_2_ * (double) f_0_ + d * (double) f
		 + (double) aClass438Array4823[0].aFloat4863);
	d = (double) (3.0F * (aClass438Array4823[1].aFloat4865
			      - aClass438Array4823[0].aFloat4865));
	d_2_ = (double) (3.0F * (aClass438Array4823[2].aFloat4865
				 - aClass438Array4823[1].aFloat4865)) - d;
	d_3_ = (double) (aClass438Array4823[3].aFloat4865
			 - aClass438Array4823[0].aFloat4865) - d - d_2_;
	ds[2] = (d_3_ * (double) f_1_ + d_2_ * (double) f_0_ + d * (double) f
		 + (double) aClass438Array4823[0].aFloat4865);
	return ds;
    }
    
    Class438 method6817(int i) {
	return aClass438Array4823[i];
    }
    
    Class438 method6818(int i) {
	return aClass438Array4823[i];
    }
    
    float method6819() {
	if (aFloat4821 == -1.0F)
	    method6821();
	return aFloat4821;
    }
    
    float method6820(float f) {
	if (aFloat4821 == -1.0F)
	    method6821();
	if (f <= 0.0F)
	    return 0.0F;
	if (f >= aFloat4821)
	    return 1.0F;
	float f_4_ = 0.0F;
	float f_5_ = aFloatArray4822[0];
	for (int i = 1; i < aFloatArray4822.length; i++) {
	    if (f < f_5_) {
		float f_6_ = (f - f_4_) / (f_5_ - f_4_);
		float f_7_ = (float) (i - 1) / (float) aFloatArray4822.length;
		float f_8_ = (float) i / (float) aFloatArray4822.length;
		return f_7_ + (f_8_ - f_7_) * f_6_;
	    }
	    f_4_ = f_5_;
	    f_5_ += aFloatArray4822[i];
	}
	float f_9_ = (f - f_4_) / (f_5_ - f_4_);
	float f_10_ = ((float) (aFloatArray4822.length - 1)
		       / (float) aFloatArray4822.length);
	return f_10_ + (1.0F - f_10_) * f_9_;
    }
    
    void method6821() {
	int i = 20;
	double[] ds = method6816(0.0F);
	float f = 0.0F;
	Class438 class438 = Class438.method7061();
	for (int i_11_ = 1; i_11_ <= i; i_11_++) {
	    double[] ds_12_ = method6816((float) i_11_ / (float) i);
	    class438.aFloat4864 = (float) (ds_12_[0] - ds[0]);
	    class438.aFloat4863 = (float) (ds_12_[1] - ds[1]);
	    class438.aFloat4865 = (float) (ds_12_[2] - ds[2]);
	    f += class438.method7012();
	    ds = ds_12_;
	}
	int i_13_ = (int) (f / 20.0F);
	if (i_13_ < i)
	    i_13_ = i;
	aFloatArray4822 = new float[i_13_];
	ds = method6816(0.0F);
	float f_14_ = 0.0F;
	for (int i_15_ = 1; i_15_ <= i_13_; i_15_++) {
	    double[] ds_16_ = method6816((float) i_15_ / (float) i_13_);
	    class438.aFloat4864 = (float) (ds_16_[0] - ds[0]);
	    class438.aFloat4863 = (float) (ds_16_[1] - ds[1]);
	    class438.aFloat4865 = (float) (ds_16_[2] - ds[2]);
	    float f_17_ = class438.method7012();
	    f_14_ += f_17_;
	    aFloatArray4822[i_15_ - 1] = f_17_;
	    ds = ds_16_;
	}
	aFloat4821 = f_14_;
    }
    
    void method6822() {
	aFloat4821 = -1.0F;
	aFloatArray4822 = null;
    }
    
    void method6823() {
	aFloat4821 = -1.0F;
	aFloatArray4822 = null;
    }
    
    void method6824(int i, Class438 class438) {
	aClass438Array4823[i].method6992(class438);
	method6815();
    }
    
    Class430() {
	for (int i = 0; i < 4; i++)
	    aClass438Array4823[i] = new Class438();
	method6815();
    }
    
    void method6825(int i, Class438 class438) {
	aClass438Array4823[i].method6992(class438);
	method6815();
    }
    
    void method6826() {
	int i = 20;
	double[] ds = method6816(0.0F);
	float f = 0.0F;
	Class438 class438 = Class438.method7061();
	for (int i_18_ = 1; i_18_ <= i; i_18_++) {
	    double[] ds_19_ = method6816((float) i_18_ / (float) i);
	    class438.aFloat4864 = (float) (ds_19_[0] - ds[0]);
	    class438.aFloat4863 = (float) (ds_19_[1] - ds[1]);
	    class438.aFloat4865 = (float) (ds_19_[2] - ds[2]);
	    f += class438.method7012();
	    ds = ds_19_;
	}
	int i_20_ = (int) (f / 20.0F);
	if (i_20_ < i)
	    i_20_ = i;
	aFloatArray4822 = new float[i_20_];
	ds = method6816(0.0F);
	float f_21_ = 0.0F;
	for (int i_22_ = 1; i_22_ <= i_20_; i_22_++) {
	    double[] ds_23_ = method6816((float) i_22_ / (float) i_20_);
	    class438.aFloat4864 = (float) (ds_23_[0] - ds[0]);
	    class438.aFloat4863 = (float) (ds_23_[1] - ds[1]);
	    class438.aFloat4865 = (float) (ds_23_[2] - ds[2]);
	    float f_24_ = class438.method7012();
	    f_21_ += f_24_;
	    aFloatArray4822[i_22_ - 1] = f_24_;
	    ds = ds_23_;
	}
	aFloat4821 = f_21_;
    }
    
    double[] method6827(float f) {
	double[] ds = new double[3];
	float f_25_ = f * f;
	float f_26_ = f_25_ * f;
	double d = (double) (3.0F * (aClass438Array4823[1].aFloat4864
				     - aClass438Array4823[0].aFloat4864));
	double d_27_ = ((double) (3.0F * (aClass438Array4823[2].aFloat4864
					  - aClass438Array4823[1].aFloat4864))
			- d);
	double d_28_ = ((double) (aClass438Array4823[3].aFloat4864
				  - aClass438Array4823[0].aFloat4864)
			- d - d_27_);
	ds[0] = (d_28_ * (double) f_26_ + d_27_ * (double) f_25_
		 + d * (double) f + (double) aClass438Array4823[0].aFloat4864);
	d = (double) (3.0F * (aClass438Array4823[1].aFloat4863
			      - aClass438Array4823[0].aFloat4863));
	d_27_ = (double) (3.0F * (aClass438Array4823[2].aFloat4863
				  - aClass438Array4823[1].aFloat4863)) - d;
	d_28_ = (double) (aClass438Array4823[3].aFloat4863
			  - aClass438Array4823[0].aFloat4863) - d - d_27_;
	ds[1] = (d_28_ * (double) f_26_ + d_27_ * (double) f_25_
		 + d * (double) f + (double) aClass438Array4823[0].aFloat4863);
	d = (double) (3.0F * (aClass438Array4823[1].aFloat4865
			      - aClass438Array4823[0].aFloat4865));
	d_27_ = (double) (3.0F * (aClass438Array4823[2].aFloat4865
				  - aClass438Array4823[1].aFloat4865)) - d;
	d_28_ = (double) (aClass438Array4823[3].aFloat4865
			  - aClass438Array4823[0].aFloat4865) - d - d_27_;
	ds[2] = (d_28_ * (double) f_26_ + d_27_ * (double) f_25_
		 + d * (double) f + (double) aClass438Array4823[0].aFloat4865);
	return ds;
    }
    
    double[] method6828(float f) {
	double[] ds = new double[3];
	float f_29_ = f * f;
	float f_30_ = f_29_ * f;
	double d = (double) (3.0F * (aClass438Array4823[1].aFloat4864
				     - aClass438Array4823[0].aFloat4864));
	double d_31_ = ((double) (3.0F * (aClass438Array4823[2].aFloat4864
					  - aClass438Array4823[1].aFloat4864))
			- d);
	double d_32_ = ((double) (aClass438Array4823[3].aFloat4864
				  - aClass438Array4823[0].aFloat4864)
			- d - d_31_);
	ds[0] = (d_32_ * (double) f_30_ + d_31_ * (double) f_29_
		 + d * (double) f + (double) aClass438Array4823[0].aFloat4864);
	d = (double) (3.0F * (aClass438Array4823[1].aFloat4863
			      - aClass438Array4823[0].aFloat4863));
	d_31_ = (double) (3.0F * (aClass438Array4823[2].aFloat4863
				  - aClass438Array4823[1].aFloat4863)) - d;
	d_32_ = (double) (aClass438Array4823[3].aFloat4863
			  - aClass438Array4823[0].aFloat4863) - d - d_31_;
	ds[1] = (d_32_ * (double) f_30_ + d_31_ * (double) f_29_
		 + d * (double) f + (double) aClass438Array4823[0].aFloat4863);
	d = (double) (3.0F * (aClass438Array4823[1].aFloat4865
			      - aClass438Array4823[0].aFloat4865));
	d_31_ = (double) (3.0F * (aClass438Array4823[2].aFloat4865
				  - aClass438Array4823[1].aFloat4865)) - d;
	d_32_ = (double) (aClass438Array4823[3].aFloat4865
			  - aClass438Array4823[0].aFloat4865) - d - d_31_;
	ds[2] = (d_32_ * (double) f_30_ + d_31_ * (double) f_29_
		 + d * (double) f + (double) aClass438Array4823[0].aFloat4865);
	return ds;
    }
    
    double[] method6829(float f) {
	double[] ds = new double[3];
	float f_33_ = f * f;
	float f_34_ = f_33_ * f;
	double d = (double) (3.0F * (aClass438Array4823[1].aFloat4864
				     - aClass438Array4823[0].aFloat4864));
	double d_35_ = ((double) (3.0F * (aClass438Array4823[2].aFloat4864
					  - aClass438Array4823[1].aFloat4864))
			- d);
	double d_36_ = ((double) (aClass438Array4823[3].aFloat4864
				  - aClass438Array4823[0].aFloat4864)
			- d - d_35_);
	ds[0] = (d_36_ * (double) f_34_ + d_35_ * (double) f_33_
		 + d * (double) f + (double) aClass438Array4823[0].aFloat4864);
	d = (double) (3.0F * (aClass438Array4823[1].aFloat4863
			      - aClass438Array4823[0].aFloat4863));
	d_35_ = (double) (3.0F * (aClass438Array4823[2].aFloat4863
				  - aClass438Array4823[1].aFloat4863)) - d;
	d_36_ = (double) (aClass438Array4823[3].aFloat4863
			  - aClass438Array4823[0].aFloat4863) - d - d_35_;
	ds[1] = (d_36_ * (double) f_34_ + d_35_ * (double) f_33_
		 + d * (double) f + (double) aClass438Array4823[0].aFloat4863);
	d = (double) (3.0F * (aClass438Array4823[1].aFloat4865
			      - aClass438Array4823[0].aFloat4865));
	d_35_ = (double) (3.0F * (aClass438Array4823[2].aFloat4865
				  - aClass438Array4823[1].aFloat4865)) - d;
	d_36_ = (double) (aClass438Array4823[3].aFloat4865
			  - aClass438Array4823[0].aFloat4865) - d - d_35_;
	ds[2] = (d_36_ * (double) f_34_ + d_35_ * (double) f_33_
		 + d * (double) f + (double) aClass438Array4823[0].aFloat4865);
	return ds;
    }
    
    void method6830() {
	int i = 20;
	double[] ds = method6816(0.0F);
	float f = 0.0F;
	Class438 class438 = Class438.method7061();
	for (int i_37_ = 1; i_37_ <= i; i_37_++) {
	    double[] ds_38_ = method6816((float) i_37_ / (float) i);
	    class438.aFloat4864 = (float) (ds_38_[0] - ds[0]);
	    class438.aFloat4863 = (float) (ds_38_[1] - ds[1]);
	    class438.aFloat4865 = (float) (ds_38_[2] - ds[2]);
	    f += class438.method7012();
	    ds = ds_38_;
	}
	int i_39_ = (int) (f / 20.0F);
	if (i_39_ < i)
	    i_39_ = i;
	aFloatArray4822 = new float[i_39_];
	ds = method6816(0.0F);
	float f_40_ = 0.0F;
	for (int i_41_ = 1; i_41_ <= i_39_; i_41_++) {
	    double[] ds_42_ = method6816((float) i_41_ / (float) i_39_);
	    class438.aFloat4864 = (float) (ds_42_[0] - ds[0]);
	    class438.aFloat4863 = (float) (ds_42_[1] - ds[1]);
	    class438.aFloat4865 = (float) (ds_42_[2] - ds[2]);
	    float f_43_ = class438.method7012();
	    f_40_ += f_43_;
	    aFloatArray4822[i_41_ - 1] = f_43_;
	    ds = ds_42_;
	}
	aFloat4821 = f_40_;
    }
    
    void method6831() {
	int i = 20;
	double[] ds = method6816(0.0F);
	float f = 0.0F;
	Class438 class438 = Class438.method7061();
	for (int i_44_ = 1; i_44_ <= i; i_44_++) {
	    double[] ds_45_ = method6816((float) i_44_ / (float) i);
	    class438.aFloat4864 = (float) (ds_45_[0] - ds[0]);
	    class438.aFloat4863 = (float) (ds_45_[1] - ds[1]);
	    class438.aFloat4865 = (float) (ds_45_[2] - ds[2]);
	    f += class438.method7012();
	    ds = ds_45_;
	}
	int i_46_ = (int) (f / 20.0F);
	if (i_46_ < i)
	    i_46_ = i;
	aFloatArray4822 = new float[i_46_];
	ds = method6816(0.0F);
	float f_47_ = 0.0F;
	for (int i_48_ = 1; i_48_ <= i_46_; i_48_++) {
	    double[] ds_49_ = method6816((float) i_48_ / (float) i_46_);
	    class438.aFloat4864 = (float) (ds_49_[0] - ds[0]);
	    class438.aFloat4863 = (float) (ds_49_[1] - ds[1]);
	    class438.aFloat4865 = (float) (ds_49_[2] - ds[2]);
	    float f_50_ = class438.method7012();
	    f_47_ += f_50_;
	    aFloatArray4822[i_48_ - 1] = f_50_;
	    ds = ds_49_;
	}
	aFloat4821 = f_47_;
    }
    
    void method6832() {
	aFloat4821 = -1.0F;
	aFloatArray4822 = null;
    }
    
    void method6833() {
	int i = 20;
	double[] ds = method6816(0.0F);
	float f = 0.0F;
	Class438 class438 = Class438.method7061();
	for (int i_51_ = 1; i_51_ <= i; i_51_++) {
	    double[] ds_52_ = method6816((float) i_51_ / (float) i);
	    class438.aFloat4864 = (float) (ds_52_[0] - ds[0]);
	    class438.aFloat4863 = (float) (ds_52_[1] - ds[1]);
	    class438.aFloat4865 = (float) (ds_52_[2] - ds[2]);
	    f += class438.method7012();
	    ds = ds_52_;
	}
	int i_53_ = (int) (f / 20.0F);
	if (i_53_ < i)
	    i_53_ = i;
	aFloatArray4822 = new float[i_53_];
	ds = method6816(0.0F);
	float f_54_ = 0.0F;
	for (int i_55_ = 1; i_55_ <= i_53_; i_55_++) {
	    double[] ds_56_ = method6816((float) i_55_ / (float) i_53_);
	    class438.aFloat4864 = (float) (ds_56_[0] - ds[0]);
	    class438.aFloat4863 = (float) (ds_56_[1] - ds[1]);
	    class438.aFloat4865 = (float) (ds_56_[2] - ds[2]);
	    float f_57_ = class438.method7012();
	    f_54_ += f_57_;
	    aFloatArray4822[i_55_ - 1] = f_57_;
	    ds = ds_56_;
	}
	aFloat4821 = f_54_;
    }
}
