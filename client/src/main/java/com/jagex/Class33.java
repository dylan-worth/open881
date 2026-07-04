/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class33
{
    public boolean aBool272;
    public String aString273;
    public String aString274;
    public String aString275;
    
    Class33() {
	/* empty */
    }
    
    public static int method899(String string, int i) {
	return Class523.aTwitchTV7088.ChatSendMessage(string);
    }
    
    static float method900(float f, float f_0_, float f_1_, float f_2_,
			   float f_3_, float f_4_, int i, int i_5_) {
	float f_6_ = 0.0F;
	float f_7_ = f_2_ - f;
	float f_8_ = f_3_ - f_0_;
	float f_9_ = f_4_ - f_1_;
	float f_10_ = 0.0F;
	float f_11_ = 0.0F;
	float f_12_ = 0.0F;
	Class556 class556 = client.aClass512_11100.method8424((byte) 30);
	for (/**/; f_6_ < 1.1F; f_6_ += 0.1F) {
	    float f_13_ = f + f_7_ * f_6_;
	    float f_14_ = f_0_ + f_8_ * f_6_;
	    float f_15_ = f_1_ + f_6_ * f_9_;
	    int i_16_ = (int) f_13_ >> 9;
	    int i_17_ = (int) f_15_ >> 9;
	    if (i_16_ > 0 && i_17_ > 0
		&& i_16_ < client.aClass512_11100.method8417(1746517369)
		&& i_17_ < client.aClass512_11100.method8418(-1533611049)) {
		int i_18_
		    = Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aByte10854;
		if (i_18_ < 3 && ((client.aClass512_11100.method8552((byte) 0)
				   .aByteArrayArrayArray5145[1][i_16_][i_17_])
				  & 0x2) != 0)
		    i_18_++;
		int i_19_
		    = class556.aClass151Array7434[i_18_]
			  .method2498((int) f_13_, (int) f_15_, -1529903592);
		if ((float) i_19_ < f_14_) {
		    if (i >= 2)
			return (f_6_ - 0.1F
				+ method900(f_10_, f_11_, f_12_, f_13_, f_14_,
					    f_15_, i - 1, 286284420) * 0.1F);
		    return f_6_;
		}
	    }
	    f_10_ = f_13_;
	    f_11_ = f_14_;
	    f_12_ = f_15_;
	}
	return -1.0F;
    }
    
    public static void method901(int[] is, float[] fs, float[] fs_20_, int i) {
	Class453_Sub5.method16009(is, fs, fs_20_, 0, is.length - 1,
				  -1882703331);
    }
    
    static final void method902(Class669 class669, int i) {
	int i_21_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = (Class618.aClass458_8101.method7433(i_21_, -1203343574)
	       .aString11891);
    }
    
    static final void method903(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 1;
    }
    
    static final void method904(Class669 class669, int i) {
	int i_22_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub3_10767
		  .method14026(i_22_, -2024064741);
    }
}
