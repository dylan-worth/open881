/* Class340 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class340
{
    public Interface35 anInterface35_3540;
    public Interface35 anInterface35_3541;
    public static final int anInt3542 = 16;
    Class185_Sub1 aClass185_Sub1_3543;
    public boolean aBool3544;
    Interface38[] anInterface38Array3545 = null;
    Interface35 anInterface35_3546 = null;
    static final int anInt3547 = 128;
    static Object anObject3548;
    public Interface38[] anInterface38Array3549 = null;
    static final int anInt3550 = 128;
    static Object anObject3551;
    static Object anObject3552;
    
    public boolean method5937() {
	if (!aClass185_Sub1_3543.aBool9276)
	    return false;
	if (anInterface35_3541 == null) {
	    if (anObject3552 == null) {
		byte[] is = Class525.method8737(128, 128, 16, 8,
						new Class533_Sub1(419684),
						4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
		anObject3552 = Class30.method882(is, false, 1111281270);
	    }
	    byte[] is = Class20.method803(anObject3552, false, (byte) 3);
	    byte[] is_0_ = new byte[is.length * 4];
	    int i = 0;
	    for (int i_1_ = 0; i_1_ < 16; i_1_++) {
		int i_2_ = i_1_ * 16384;
		int i_3_ = i_2_;
		for (int i_4_ = 0; i_4_ < 128; i_4_++) {
		    int i_5_ = i_3_ + i_4_ * 128;
		    int i_6_ = i_3_ + (i_4_ - 1 & 0x7f) * 128;
		    int i_7_ = i_3_ + (i_4_ + 1 & 0x7f) * 128;
		    for (int i_8_ = 0; i_8_ < 128; i_8_++) {
			float f = (float) ((is[i_6_ + i_8_] & 0xff)
					   - (is[i_7_ + i_8_] & 0xff));
			float f_9_
			    = (float) ((is[i_5_ + (i_8_ - 1 & 0x7f)] & 0xff)
				       - (is[i_5_ + (i_8_ + 1 & 0x7f)]
					  & 0xff));
			float f_10_
			    = (float) (128.0 / Math.sqrt((double) (f_9_ * f_9_
								   + 16384.0F
								   + f * f)));
			is_0_[i++] = (byte) (int) (f_9_ * f_10_ + 127.0F);
			is_0_[i++] = (byte) (int) (128.0F * f_10_ + 127.0F);
			is_0_[i++] = (byte) (int) (f * f_10_ + 127.0F);
			is_0_[i++] = is[i_2_++];
		    }
		}
	    }
	    anInterface35_3541
		= aClass185_Sub1_3543.method14963(Class181.aClass181_1952, 128,
						  128, 16, true, is_0_);
	}
	return anInterface35_3541 != null;
    }
    
    Class340(Class185_Sub1 class185_sub1) {
	anInterface35_3540 = null;
	anInterface35_3541 = null;
	aClass185_Sub1_3543 = class185_sub1;
	aBool3544 = aClass185_Sub1_3543.aBool9276;
	if (aBool3544 && !aClass185_Sub1_3543.aBool9277)
	    aBool3544 = false;
	if (aBool3544
	    && !aClass185_Sub1_3543.method14770(Class181.aClass181_1961,
						Class173.aClass173_1830))
	    aBool3544 = false;
	if (aBool3544
	    || aClass185_Sub1_3543.method14741(Class181.aClass181_1961,
					       Class173.aClass173_1830)) {
	    method5939();
	    if (!aBool3544) {
		anInterface38Array3545 = new Interface38[16];
		for (int i = 0; i < 16; i++) {
		    byte[] is = Class586.method9862(anObject3548, i * 32768,
						    32768, 1856703763);
		    anInterface38Array3545[i]
			= aClass185_Sub1_3543.method14659((Class181
							   .aClass181_1961),
							  128, 128, true, is);
		}
		anInterface38Array3549 = new Interface38[16];
		for (int i = 0; i < 16; i++) {
		    byte[] is = Class586.method9862(anObject3551, i * 32768,
						    32768, 1628916341);
		    anInterface38Array3549[i]
			= aClass185_Sub1_3543.method14659((Class181
							   .aClass181_1961),
							  128, 128, true, is);
		}
	    } else {
		byte[] is = Class20.method803(anObject3548, false, (byte) 3);
		anInterface35_3546
		    = aClass185_Sub1_3543.method14963(Class181.aClass181_1961,
						      128, 128, 16, true, is);
		is = Class20.method803(anObject3551, false, (byte) 3);
		anInterface35_3540
		    = aClass185_Sub1_3543.method14963(Class181.aClass181_1961,
						      128, 128, 16, true, is);
	    }
	}
    }
    
    public boolean method5938() {
	return (aBool3544 ? anInterface35_3546 != null
		: anInterface38Array3545 != null);
    }
    
    static void method5939() {
	if (anObject3548 == null) {
	    Class405_Sub1_Sub2 class405_sub1_sub2 = new Class405_Sub1_Sub2();
	    byte[] is = class405_sub1_sub2.method18109(128, 128, 16);
	    anObject3548 = Class30.method882(is, false, 1111281270);
	}
	if (anObject3551 == null) {
	    Class405_Sub2_Sub2 class405_sub2_sub2 = new Class405_Sub2_Sub2();
	    byte[] is = class405_sub2_sub2.method17981(128, 128, 16);
	    anObject3551 = Class30.method882(is, false, 1111281270);
	}
    }
    
    static void method5940() {
	if (anObject3548 == null) {
	    Class405_Sub1_Sub2 class405_sub1_sub2 = new Class405_Sub1_Sub2();
	    byte[] is = class405_sub1_sub2.method18109(128, 128, 16);
	    anObject3548 = Class30.method882(is, false, 1111281270);
	}
	if (anObject3551 == null) {
	    Class405_Sub2_Sub2 class405_sub2_sub2 = new Class405_Sub2_Sub2();
	    byte[] is = class405_sub2_sub2.method17981(128, 128, 16);
	    anObject3551 = Class30.method882(is, false, 1111281270);
	}
    }
    
    public boolean method5941() {
	if (!aClass185_Sub1_3543.aBool9276)
	    return false;
	if (anInterface35_3541 == null) {
	    if (anObject3552 == null) {
		byte[] is = Class525.method8737(128, 128, 16, 8,
						new Class533_Sub1(419684),
						4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
		anObject3552 = Class30.method882(is, false, 1111281270);
	    }
	    byte[] is = Class20.method803(anObject3552, false, (byte) 3);
	    byte[] is_11_ = new byte[is.length * 4];
	    int i = 0;
	    for (int i_12_ = 0; i_12_ < 16; i_12_++) {
		int i_13_ = i_12_ * 16384;
		int i_14_ = i_13_;
		for (int i_15_ = 0; i_15_ < 128; i_15_++) {
		    int i_16_ = i_14_ + i_15_ * 128;
		    int i_17_ = i_14_ + (i_15_ - 1 & 0x7f) * 128;
		    int i_18_ = i_14_ + (i_15_ + 1 & 0x7f) * 128;
		    for (int i_19_ = 0; i_19_ < 128; i_19_++) {
			float f = (float) ((is[i_17_ + i_19_] & 0xff)
					   - (is[i_18_ + i_19_] & 0xff));
			float f_20_
			    = (float) ((is[i_16_ + (i_19_ - 1 & 0x7f)] & 0xff)
				       - (is[i_16_ + (i_19_ + 1 & 0x7f)]
					  & 0xff));
			float f_21_
			    = (float) (128.0
				       / Math.sqrt((double) (f_20_ * f_20_
							     + 16384.0F
							     + f * f)));
			is_11_[i++] = (byte) (int) (f_20_ * f_21_ + 127.0F);
			is_11_[i++] = (byte) (int) (128.0F * f_21_ + 127.0F);
			is_11_[i++] = (byte) (int) (f * f_21_ + 127.0F);
			is_11_[i++] = is[i_13_++];
		    }
		}
	    }
	    anInterface35_3541
		= aClass185_Sub1_3543.method14963(Class181.aClass181_1952, 128,
						  128, 16, true, is_11_);
	}
	return anInterface35_3541 != null;
    }
    
    public boolean method5942() {
	if (!aClass185_Sub1_3543.aBool9276)
	    return false;
	if (anInterface35_3541 == null) {
	    if (anObject3552 == null) {
		byte[] is = Class525.method8737(128, 128, 16, 8,
						new Class533_Sub1(419684),
						4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
		anObject3552 = Class30.method882(is, false, 1111281270);
	    }
	    byte[] is = Class20.method803(anObject3552, false, (byte) 3);
	    byte[] is_22_ = new byte[is.length * 4];
	    int i = 0;
	    for (int i_23_ = 0; i_23_ < 16; i_23_++) {
		int i_24_ = i_23_ * 16384;
		int i_25_ = i_24_;
		for (int i_26_ = 0; i_26_ < 128; i_26_++) {
		    int i_27_ = i_25_ + i_26_ * 128;
		    int i_28_ = i_25_ + (i_26_ - 1 & 0x7f) * 128;
		    int i_29_ = i_25_ + (i_26_ + 1 & 0x7f) * 128;
		    for (int i_30_ = 0; i_30_ < 128; i_30_++) {
			float f = (float) ((is[i_28_ + i_30_] & 0xff)
					   - (is[i_29_ + i_30_] & 0xff));
			float f_31_
			    = (float) ((is[i_27_ + (i_30_ - 1 & 0x7f)] & 0xff)
				       - (is[i_27_ + (i_30_ + 1 & 0x7f)]
					  & 0xff));
			float f_32_
			    = (float) (128.0
				       / Math.sqrt((double) (f_31_ * f_31_
							     + 16384.0F
							     + f * f)));
			is_22_[i++] = (byte) (int) (f_31_ * f_32_ + 127.0F);
			is_22_[i++] = (byte) (int) (128.0F * f_32_ + 127.0F);
			is_22_[i++] = (byte) (int) (f * f_32_ + 127.0F);
			is_22_[i++] = is[i_24_++];
		    }
		}
	    }
	    anInterface35_3541
		= aClass185_Sub1_3543.method14963(Class181.aClass181_1952, 128,
						  128, 16, true, is_22_);
	}
	return anInterface35_3541 != null;
    }
    
    public boolean method5943() {
	if (!aClass185_Sub1_3543.aBool9276)
	    return false;
	if (anInterface35_3541 == null) {
	    if (anObject3552 == null) {
		byte[] is = Class525.method8737(128, 128, 16, 8,
						new Class533_Sub1(419684),
						4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
		anObject3552 = Class30.method882(is, false, 1111281270);
	    }
	    byte[] is = Class20.method803(anObject3552, false, (byte) 3);
	    byte[] is_33_ = new byte[is.length * 4];
	    int i = 0;
	    for (int i_34_ = 0; i_34_ < 16; i_34_++) {
		int i_35_ = i_34_ * 16384;
		int i_36_ = i_35_;
		for (int i_37_ = 0; i_37_ < 128; i_37_++) {
		    int i_38_ = i_36_ + i_37_ * 128;
		    int i_39_ = i_36_ + (i_37_ - 1 & 0x7f) * 128;
		    int i_40_ = i_36_ + (i_37_ + 1 & 0x7f) * 128;
		    for (int i_41_ = 0; i_41_ < 128; i_41_++) {
			float f = (float) ((is[i_39_ + i_41_] & 0xff)
					   - (is[i_40_ + i_41_] & 0xff));
			float f_42_
			    = (float) ((is[i_38_ + (i_41_ - 1 & 0x7f)] & 0xff)
				       - (is[i_38_ + (i_41_ + 1 & 0x7f)]
					  & 0xff));
			float f_43_
			    = (float) (128.0
				       / Math.sqrt((double) (f_42_ * f_42_
							     + 16384.0F
							     + f * f)));
			is_33_[i++] = (byte) (int) (f_42_ * f_43_ + 127.0F);
			is_33_[i++] = (byte) (int) (128.0F * f_43_ + 127.0F);
			is_33_[i++] = (byte) (int) (f * f_43_ + 127.0F);
			is_33_[i++] = is[i_35_++];
		    }
		}
	    }
	    anInterface35_3541
		= aClass185_Sub1_3543.method14963(Class181.aClass181_1952, 128,
						  128, 16, true, is_33_);
	}
	return anInterface35_3541 != null;
    }
}
