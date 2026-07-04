/* Class434 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class434
{
    Class430[] aClass430Array4855 = new Class430[1];
    float[] aFloatArray4856 = new float[2];
    
    public double[] method6956(float f) {
	int i = (int) f;
	if (i < aClass430Array4855.length)
	    return aClass430Array4855[i].method6816(f - (float) i);
	return aClass430Array4855[aClass430Array4855.length - 1]
		   .method6816(1.0F);
    }
    
    public int method6957() {
	return aClass430Array4855.length;
    }
    
    public float method6958() {
	float f = 0.0F;
	for (int i = 0; i < aClass430Array4855.length; i++)
	    f += aClass430Array4855[i].method6819();
	return f;
    }
    
    public double[] method6959(float f) {
	float f_0_ = 0.0F;
	float f_1_ = 0.0F;
	for (int i = 0; i < aClass430Array4855.length; i++) {
	    f_1_ += aClass430Array4855[i].method6819();
	    if (f < f_1_) {
		float f_2_ = aClass430Array4855[i].method6820(f - f_0_);
		return aClass430Array4855[i].method6816(f_2_);
	    }
	    f_0_ = f_1_;
	}
	return aClass430Array4855[aClass430Array4855.length - 1]
		   .method6816(1.0F);
    }
    
    public float method6960(float f) {
	float f_3_ = 0.0F;
	float f_4_ = 0.0F;
	for (int i = 0; i < aClass430Array4855.length; i++) {
	    f_4_ += aClass430Array4855[i].method6819();
	    if (f < f_4_)
		return aClass430Array4855[i].method6820(f - f_3_) + (float) i;
	    f_3_ = f_4_;
	}
	return (float) aClass430Array4855.length;
    }
    
    public int method6961() {
	return aClass430Array4855.length;
    }
    
    public float method6962(float f) {
	return method6963(method6960(f));
    }
    
    public float method6963(float f) {
	int i = (int) f;
	if (i + 1 < aFloatArray4856.length) {
	    float f_5_ = aFloatArray4856[i];
	    float f_6_ = aFloatArray4856[i + 1];
	    float f_7_ = f - (float) i;
	    return (1.0F - f_7_) * f_5_ + f_7_ * f_6_;
	}
	return aFloatArray4856[aFloatArray4856.length - 1];
    }
    
    public Class434(Class534_Sub40 class534_sub40) {
	int i = class534_sub40.method16546(-1706829710);
	aClass430Array4855[0] = new Class430();
	aClass430Array4855[0].method6814(0,
					 Class438.method7025(class534_sub40));
	aClass430Array4855[0].method6814(1,
					 Class438.method7025(class534_sub40));
	aFloatArray4856[0] = class534_sub40.method16539(-1930489096);
	Class438 class438 = Class438.method7025(class534_sub40);
	Class438 class438_8_ = Class438.method7025(class534_sub40);
	Class438 class438_9_ = Class438.method7055(class438, class438_8_);
	class438_8_.method7074();
	class438_8_ = class438_9_;
	class438_8_.method7026(class438);
	aClass430Array4855[0].method6814(3, class438);
	aClass430Array4855[0].method6814(2, class438_8_);
	aFloatArray4856[1] = class534_sub40.method16539(-1250249877);
	for (int i_10_ = 2; i_10_ < i; i_10_++) {
	    Class438 class438_11_ = Class438.method7025(class534_sub40);
	    Class438 class438_12_ = Class438.method7025(class534_sub40);
	    Class438 class438_13_
		= Class438.method7055(class438_11_, class438_12_);
	    class438_12_.method7074();
	    class438_12_ = class438_13_;
	    class438_12_.method7026(class438_11_);
	    method6967(class438_11_, class438_12_,
		       class534_sub40.method16539(-1263609156));
	}
    }
    
    void method6964(Class438 class438, Class438 class438_14_, float f) {
	Class430[] class430s = new Class430[aClass430Array4855.length + 1];
	System.arraycopy(aClass430Array4855, 0, class430s, 0,
			 aClass430Array4855.length);
	Class430 class430 = new Class430();
	Class430 class430_15_
	    = aClass430Array4855[aClass430Array4855.length - 1];
	class430.method6814(0, class430_15_.method6818(3));
	Class438 class438_16_
	    = Class438.method7055(class430_15_.method6818(3),
				  class430_15_.method6818(2));
	class430.method6814(1, Class438.method7005(class430_15_.method6818(3),
						   class438_16_));
	class430.method6814(3, class438);
	class430.method6814(2, class438_14_);
	class430s[class430s.length - 1] = class430;
	aClass430Array4855 = class430s;
	float[] fs = new float[aFloatArray4856.length + 1];
	System.arraycopy(aFloatArray4856, 0, fs, 0, aFloatArray4856.length);
	fs[fs.length - 1] = f;
	aFloatArray4856 = fs;
    }
    
    public float method6965(float f) {
	int i = (int) f;
	if (i + 1 < aFloatArray4856.length) {
	    float f_17_ = aFloatArray4856[i];
	    float f_18_ = aFloatArray4856[i + 1];
	    float f_19_ = f - (float) i;
	    return (1.0F - f_19_) * f_17_ + f_19_ * f_18_;
	}
	return aFloatArray4856[aFloatArray4856.length - 1];
    }
    
    public int method6966() {
	return aClass430Array4855.length;
    }
    
    void method6967(Class438 class438, Class438 class438_20_, float f) {
	Class430[] class430s = new Class430[aClass430Array4855.length + 1];
	System.arraycopy(aClass430Array4855, 0, class430s, 0,
			 aClass430Array4855.length);
	Class430 class430 = new Class430();
	Class430 class430_21_
	    = aClass430Array4855[aClass430Array4855.length - 1];
	class430.method6814(0, class430_21_.method6818(3));
	Class438 class438_22_
	    = Class438.method7055(class430_21_.method6818(3),
				  class430_21_.method6818(2));
	class430.method6814(1, Class438.method7005(class430_21_.method6818(3),
						   class438_22_));
	class430.method6814(3, class438);
	class430.method6814(2, class438_20_);
	class430s[class430s.length - 1] = class430;
	aClass430Array4855 = class430s;
	float[] fs = new float[aFloatArray4856.length + 1];
	System.arraycopy(aFloatArray4856, 0, fs, 0, aFloatArray4856.length);
	fs[fs.length - 1] = f;
	aFloatArray4856 = fs;
    }
    
    public int method6968() {
	return aClass430Array4855.length;
    }
    
    public double[] method6969(float f) {
	float f_23_ = 0.0F;
	float f_24_ = 0.0F;
	for (int i = 0; i < aClass430Array4855.length; i++) {
	    f_24_ += aClass430Array4855[i].method6819();
	    if (f < f_24_) {
		float f_25_ = aClass430Array4855[i].method6820(f - f_23_);
		return aClass430Array4855[i].method6816(f_25_);
	    }
	    f_23_ = f_24_;
	}
	return aClass430Array4855[aClass430Array4855.length - 1]
		   .method6816(1.0F);
    }
    
    public float method6970(float f) {
	float f_26_ = 0.0F;
	float f_27_ = 0.0F;
	for (int i = 0; i < aClass430Array4855.length; i++) {
	    f_27_ += aClass430Array4855[i].method6819();
	    if (f < f_27_)
		return aClass430Array4855[i].method6820(f - f_26_) + (float) i;
	    f_26_ = f_27_;
	}
	return (float) aClass430Array4855.length;
    }
    
    public double[] method6971(float f) {
	int i = (int) f;
	if (i < aClass430Array4855.length)
	    return aClass430Array4855[i].method6816(f - (float) i);
	return aClass430Array4855[aClass430Array4855.length - 1]
		   .method6816(1.0F);
    }
    
    public double[] method6972(float f) {
	int i = (int) f;
	if (i < aClass430Array4855.length)
	    return aClass430Array4855[i].method6816(f - (float) i);
	return aClass430Array4855[aClass430Array4855.length - 1]
		   .method6816(1.0F);
    }
    
    public float method6973(float f) {
	float f_28_ = 0.0F;
	float f_29_ = 0.0F;
	for (int i = 0; i < aClass430Array4855.length; i++) {
	    f_29_ += aClass430Array4855[i].method6819();
	    if (f < f_29_)
		return aClass430Array4855[i].method6820(f - f_28_) + (float) i;
	    f_28_ = f_29_;
	}
	return (float) aClass430Array4855.length;
    }
    
    public double[] method6974(float f) {
	int i = (int) f;
	if (i < aClass430Array4855.length)
	    return aClass430Array4855[i].method6816(f - (float) i);
	return aClass430Array4855[aClass430Array4855.length - 1]
		   .method6816(1.0F);
    }
    
    public float method6975(float f) {
	return method6963(method6960(f));
    }
    
    public float method6976(float f) {
	return method6963(method6960(f));
    }
    
    public float method6977(float f) {
	return method6963(method6960(f));
    }
    
    public int method6978() {
	return aClass430Array4855.length;
    }
    
    public float method6979(float f) {
	int i = (int) f;
	if (i + 1 < aFloatArray4856.length) {
	    float f_30_ = aFloatArray4856[i];
	    float f_31_ = aFloatArray4856[i + 1];
	    float f_32_ = f - (float) i;
	    return (1.0F - f_32_) * f_30_ + f_32_ * f_31_;
	}
	return aFloatArray4856[aFloatArray4856.length - 1];
    }
    
    public float method6980(float f) {
	int i = (int) f;
	if (i + 1 < aFloatArray4856.length) {
	    float f_33_ = aFloatArray4856[i];
	    float f_34_ = aFloatArray4856[i + 1];
	    float f_35_ = f - (float) i;
	    return (1.0F - f_35_) * f_33_ + f_35_ * f_34_;
	}
	return aFloatArray4856[aFloatArray4856.length - 1];
    }
    
    public float method6981(float f) {
	int i = (int) f;
	if (i + 1 < aFloatArray4856.length) {
	    float f_36_ = aFloatArray4856[i];
	    float f_37_ = aFloatArray4856[i + 1];
	    float f_38_ = f - (float) i;
	    return (1.0F - f_38_) * f_36_ + f_38_ * f_37_;
	}
	return aFloatArray4856[aFloatArray4856.length - 1];
    }
}
