/* Class344 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;

public class Class344
{
    byte[] aByteArray3557;
    static final int anInt3558 = 128;
    Class185_Sub1 aClass185_Sub1_3559;
    Class338 aClass338_3560;
    int anInt3561;
    int anInt3562;
    boolean aBool3563 = true;
    int anInt3564 = -1;
    int anInt3565;
    Interface39 anInterface39_3566;
    static final int anInt3567 = 7;
    int anInt3568;
    Interface38 anInterface38_3569;
    int anInt3570;
    int[] anIntArray3571;
    
    void method6109() {
	if (aBool3563) {
	    aBool3563 = false;
	    byte[] is = aClass338_3560.aByteArray3529;
	    int i = 0;
	    int i_0_ = aClass338_3560.anInt3525;
	    int i_1_ = anInt3561 + anInt3562 * aClass338_3560.anInt3525;
	    for (int i_2_ = -128; i_2_ < 0; i_2_++) {
		i = (i << 8) - i;
		for (int i_3_ = -128; i_3_ < 0; i_3_++) {
		    if (is[i_1_++] != 0)
			i++;
		}
		i_1_ += i_0_ - 128;
	    }
	    if (anInterface38_3569 != null && anInt3564 == i)
		aBool3563 = false;
	    else {
		anInt3564 = i;
		int i_4_ = 0;
		i_1_ = anInt3561 + anInt3562 * i_0_;
		if (aClass185_Sub1_3559.method14741(Class181.aClass181_1951,
						    Class173.aClass173_1830)) {
		    if (aByteArray3557 == null)
			aByteArray3557 = new byte[16384];
		    byte[] is_5_ = aByteArray3557;
		    for (int i_6_ = -128; i_6_ < 0; i_6_++) {
			for (int i_7_ = -128; i_7_ < 0; i_7_++) {
			    if (is[i_1_] != 0)
				is_5_[i_4_++] = (byte) 68;
			    else {
				int i_8_ = 0;
				if (is[i_1_ - 1] != 0)
				    i_8_++;
				if (is[i_1_ + 1] != 0)
				    i_8_++;
				if (is[i_1_ - i_0_] != 0)
				    i_8_++;
				if (is[i_1_ + i_0_] != 0)
				    i_8_++;
				is_5_[i_4_++] = (byte) (17 * i_8_);
			    }
			    i_1_++;
			}
			i_1_ += aClass338_3560.anInt3525 - 128;
		    }
		    if (anInterface38_3569 == null) {
			anInterface38_3569 = (aClass185_Sub1_3559.method14659
					      (Class181.aClass181_1951, 128,
					       128, false, aByteArray3557));
			anInterface38_3569.method257(false, false);
		    } else
			anInterface38_3569.method244(0, 0, 128, 128,
						     aByteArray3557,
						     Class181.aClass181_1951,
						     0, 128);
		} else {
		    if (anIntArray3571 == null)
			anIntArray3571 = new int[16384];
		    int[] is_9_ = anIntArray3571;
		    for (int i_10_ = -128; i_10_ < 0; i_10_++) {
			for (int i_11_ = -128; i_11_ < 0; i_11_++) {
			    if (is[i_1_] != 0)
				is_9_[i_4_++] = 1140850688;
			    else {
				int i_12_ = 0;
				if (is[i_1_ - 1] != 0)
				    i_12_++;
				if (is[i_1_ + 1] != 0)
				    i_12_++;
				if (is[i_1_ - i_0_] != 0)
				    i_12_++;
				if (is[i_1_ + i_0_] != 0)
				    i_12_++;
				is_9_[i_4_++] = 17 * i_12_ << 24;
			    }
			    i_1_++;
			}
			i_1_ += aClass338_3560.anInt3525 - 128;
		    }
		    if (anInterface38_3569 == null) {
			anInterface38_3569
			    = aClass185_Sub1_3559.method14658(128, 128, false,
							      anIntArray3571);
			anInterface38_3569.method257(false, false);
		    } else
			anInterface38_3569.method269(0, 0, 128, 128,
						     anIntArray3571, 0, 128);
		}
	    }
	}
    }
    
    Class344(Class185_Sub1 class185_sub1, Class338 class338,
	     Class151_Sub2 class151_sub2, int i, int i_13_, int i_14_,
	     int i_15_, int i_16_) {
	aClass185_Sub1_3559 = class185_sub1;
	aClass338_3560 = class338;
	anInt3561 = i_15_;
	anInt3562 = i_16_;
	int i_17_ = 1 << i_14_;
	int i_18_ = 0;
	int i_19_ = i << i_14_;
	int i_20_ = i_13_ << i_14_;
	for (int i_21_ = 0; i_21_ < i_17_; i_21_++) {
	    int i_22_
		= ((i_20_ + i_21_) * (class151_sub2.anInt1701 * -1924295585)
		   + i_19_);
	    for (int i_23_ = 0; i_23_ < i_17_; i_23_++) {
		short[] is = class151_sub2.aShortArrayArray9409[i_22_++];
		if (is != null)
		    i_18_ += is.length;
	    }
	}
	if (i_18_ > 0) {
	    anInt3570 = -2147483648;
	    anInt3568 = 2147483647;
	    anInterface39_3566 = aClass185_Sub1_3559.method14971(false);
	    anInterface39_3566.method277(i_18_);
	    ByteBuffer bytebuffer = aClass185_Sub1_3559.aByteBuffer9266;
	    bytebuffer.clear();
	    for (int i_24_ = 0; i_24_ < i_17_; i_24_++) {
		int i_25_ = ((i_20_ + i_24_) * (class151_sub2.anInt1701
						* -1924295585)
			     + i_19_);
		for (int i_26_ = 0; i_26_ < i_17_; i_26_++) {
		    short[] is = class151_sub2.aShortArrayArray9409[i_25_++];
		    if (is != null) {
			for (int i_27_ = 0; i_27_ < is.length; i_27_++) {
			    int i_28_ = is[i_27_] & 0xffff;
			    if (i_28_ < anInt3568)
				anInt3568 = i_28_;
			    if (i_28_ > anInt3570)
				anInt3570 = i_28_;
			    bytebuffer.putShort((short) i_28_);
			}
		    }
		}
	    }
	    anInterface39_3566.method235(0, bytebuffer.position(),
					 aClass185_Sub1_3559.aLong9139);
	    anInt3565 = i_18_ / 3;
	} else {
	    anInt3565 = 0;
	    anInterface38_3569 = null;
	}
    }
    
    void method6110(Class324 class324, Interface39 interface39, int i,
		    int i_29_) {
	if (i_29_ > 0) {
	    method6109();
	    aClass185_Sub1_3559.method14701(interface39);
	    class324.anInterface38_3432 = anInterface38_3569;
	    class324.anInt3447 = anInt3568;
	    class324.anInt3428 = anInt3570 - anInt3568 + 1;
	    class324.anInt3449 = i;
	    class324.anInt3450 = i_29_;
	    class324.method5812(false);
	}
    }
    
    void method6111(Class324 class324) {
	method6110(class324, anInterface39_3566, 0, anInt3565);
    }
    
    void method6112(Class324 class324) {
	method6110(class324, anInterface39_3566, 0, anInt3565);
    }
    
    void method6113(Class324 class324) {
	method6110(class324, anInterface39_3566, 0, anInt3565);
    }
    
    void method6114(Class324 class324, Interface39 interface39, int i,
		    int i_30_) {
	if (i_30_ > 0) {
	    method6109();
	    aClass185_Sub1_3559.method14701(interface39);
	    class324.anInterface38_3432 = anInterface38_3569;
	    class324.anInt3447 = anInt3568;
	    class324.anInt3428 = anInt3570 - anInt3568 + 1;
	    class324.anInt3449 = i;
	    class324.anInt3450 = i_30_;
	    class324.method5812(false);
	}
    }
    
    void method6115(Class324 class324, Interface39 interface39, int i,
		    int i_31_) {
	if (i_31_ > 0) {
	    method6109();
	    aClass185_Sub1_3559.method14701(interface39);
	    class324.anInterface38_3432 = anInterface38_3569;
	    class324.anInt3447 = anInt3568;
	    class324.anInt3428 = anInt3570 - anInt3568 + 1;
	    class324.anInt3449 = i;
	    class324.anInt3450 = i_31_;
	    class324.method5812(false);
	}
    }
    
    void method6116(Class324 class324, Interface39 interface39, int i,
		    int i_32_) {
	if (i_32_ > 0) {
	    method6109();
	    aClass185_Sub1_3559.method14701(interface39);
	    class324.anInterface38_3432 = anInterface38_3569;
	    class324.anInt3447 = anInt3568;
	    class324.anInt3428 = anInt3570 - anInt3568 + 1;
	    class324.anInt3449 = i;
	    class324.anInt3450 = i_32_;
	    class324.method5812(false);
	}
    }
    
    void method6117() {
	if (aBool3563) {
	    aBool3563 = false;
	    byte[] is = aClass338_3560.aByteArray3529;
	    int i = 0;
	    int i_33_ = aClass338_3560.anInt3525;
	    int i_34_ = anInt3561 + anInt3562 * aClass338_3560.anInt3525;
	    for (int i_35_ = -128; i_35_ < 0; i_35_++) {
		i = (i << 8) - i;
		for (int i_36_ = -128; i_36_ < 0; i_36_++) {
		    if (is[i_34_++] != 0)
			i++;
		}
		i_34_ += i_33_ - 128;
	    }
	    if (anInterface38_3569 != null && anInt3564 == i)
		aBool3563 = false;
	    else {
		anInt3564 = i;
		int i_37_ = 0;
		i_34_ = anInt3561 + anInt3562 * i_33_;
		if (aClass185_Sub1_3559.method14741(Class181.aClass181_1951,
						    Class173.aClass173_1830)) {
		    if (aByteArray3557 == null)
			aByteArray3557 = new byte[16384];
		    byte[] is_38_ = aByteArray3557;
		    for (int i_39_ = -128; i_39_ < 0; i_39_++) {
			for (int i_40_ = -128; i_40_ < 0; i_40_++) {
			    if (is[i_34_] != 0)
				is_38_[i_37_++] = (byte) 68;
			    else {
				int i_41_ = 0;
				if (is[i_34_ - 1] != 0)
				    i_41_++;
				if (is[i_34_ + 1] != 0)
				    i_41_++;
				if (is[i_34_ - i_33_] != 0)
				    i_41_++;
				if (is[i_34_ + i_33_] != 0)
				    i_41_++;
				is_38_[i_37_++] = (byte) (17 * i_41_);
			    }
			    i_34_++;
			}
			i_34_ += aClass338_3560.anInt3525 - 128;
		    }
		    if (anInterface38_3569 == null) {
			anInterface38_3569 = (aClass185_Sub1_3559.method14659
					      (Class181.aClass181_1951, 128,
					       128, false, aByteArray3557));
			anInterface38_3569.method257(false, false);
		    } else
			anInterface38_3569.method244(0, 0, 128, 128,
						     aByteArray3557,
						     Class181.aClass181_1951,
						     0, 128);
		} else {
		    if (anIntArray3571 == null)
			anIntArray3571 = new int[16384];
		    int[] is_42_ = anIntArray3571;
		    for (int i_43_ = -128; i_43_ < 0; i_43_++) {
			for (int i_44_ = -128; i_44_ < 0; i_44_++) {
			    if (is[i_34_] != 0)
				is_42_[i_37_++] = 1140850688;
			    else {
				int i_45_ = 0;
				if (is[i_34_ - 1] != 0)
				    i_45_++;
				if (is[i_34_ + 1] != 0)
				    i_45_++;
				if (is[i_34_ - i_33_] != 0)
				    i_45_++;
				if (is[i_34_ + i_33_] != 0)
				    i_45_++;
				is_42_[i_37_++] = 17 * i_45_ << 24;
			    }
			    i_34_++;
			}
			i_34_ += aClass338_3560.anInt3525 - 128;
		    }
		    if (anInterface38_3569 == null) {
			anInterface38_3569
			    = aClass185_Sub1_3559.method14658(128, 128, false,
							      anIntArray3571);
			anInterface38_3569.method257(false, false);
		    } else
			anInterface38_3569.method269(0, 0, 128, 128,
						     anIntArray3571, 0, 128);
		}
	    }
	}
    }
    
    void method6118() {
	if (aBool3563) {
	    aBool3563 = false;
	    byte[] is = aClass338_3560.aByteArray3529;
	    int i = 0;
	    int i_46_ = aClass338_3560.anInt3525;
	    int i_47_ = anInt3561 + anInt3562 * aClass338_3560.anInt3525;
	    for (int i_48_ = -128; i_48_ < 0; i_48_++) {
		i = (i << 8) - i;
		for (int i_49_ = -128; i_49_ < 0; i_49_++) {
		    if (is[i_47_++] != 0)
			i++;
		}
		i_47_ += i_46_ - 128;
	    }
	    if (anInterface38_3569 != null && anInt3564 == i)
		aBool3563 = false;
	    else {
		anInt3564 = i;
		int i_50_ = 0;
		i_47_ = anInt3561 + anInt3562 * i_46_;
		if (aClass185_Sub1_3559.method14741(Class181.aClass181_1951,
						    Class173.aClass173_1830)) {
		    if (aByteArray3557 == null)
			aByteArray3557 = new byte[16384];
		    byte[] is_51_ = aByteArray3557;
		    for (int i_52_ = -128; i_52_ < 0; i_52_++) {
			for (int i_53_ = -128; i_53_ < 0; i_53_++) {
			    if (is[i_47_] != 0)
				is_51_[i_50_++] = (byte) 68;
			    else {
				int i_54_ = 0;
				if (is[i_47_ - 1] != 0)
				    i_54_++;
				if (is[i_47_ + 1] != 0)
				    i_54_++;
				if (is[i_47_ - i_46_] != 0)
				    i_54_++;
				if (is[i_47_ + i_46_] != 0)
				    i_54_++;
				is_51_[i_50_++] = (byte) (17 * i_54_);
			    }
			    i_47_++;
			}
			i_47_ += aClass338_3560.anInt3525 - 128;
		    }
		    if (anInterface38_3569 == null) {
			anInterface38_3569 = (aClass185_Sub1_3559.method14659
					      (Class181.aClass181_1951, 128,
					       128, false, aByteArray3557));
			anInterface38_3569.method257(false, false);
		    } else
			anInterface38_3569.method244(0, 0, 128, 128,
						     aByteArray3557,
						     Class181.aClass181_1951,
						     0, 128);
		} else {
		    if (anIntArray3571 == null)
			anIntArray3571 = new int[16384];
		    int[] is_55_ = anIntArray3571;
		    for (int i_56_ = -128; i_56_ < 0; i_56_++) {
			for (int i_57_ = -128; i_57_ < 0; i_57_++) {
			    if (is[i_47_] != 0)
				is_55_[i_50_++] = 1140850688;
			    else {
				int i_58_ = 0;
				if (is[i_47_ - 1] != 0)
				    i_58_++;
				if (is[i_47_ + 1] != 0)
				    i_58_++;
				if (is[i_47_ - i_46_] != 0)
				    i_58_++;
				if (is[i_47_ + i_46_] != 0)
				    i_58_++;
				is_55_[i_50_++] = 17 * i_58_ << 24;
			    }
			    i_47_++;
			}
			i_47_ += aClass338_3560.anInt3525 - 128;
		    }
		    if (anInterface38_3569 == null) {
			anInterface38_3569
			    = aClass185_Sub1_3559.method14658(128, 128, false,
							      anIntArray3571);
			anInterface38_3569.method257(false, false);
		    } else
			anInterface38_3569.method269(0, 0, 128, 128,
						     anIntArray3571, 0, 128);
		}
	    }
	}
    }
}
