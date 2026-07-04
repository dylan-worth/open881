/* Class170_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class170_Sub2 extends Class170
{
    Class185_Sub3 aClass185_Sub3_9333;
    Class141 aClass141_9334;
    
    byte[] method14983(int[] is) {
	byte[] is_0_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_1_ = 0; i_1_ < 16; i_1_++) {
		for (int i_2_ = 0; i_2_ < 16; i_2_++) {
		    int i_3_ = is[256 * i_1_ + 16 * i_2_ + i];
		    int i_4_ = (i_2_ * 256 + i_1_ * 16 + i) * 4;
		    is_0_[i_4_ + 0] = (byte) (i_3_ >> 16 & 0xff);
		    is_0_[i_4_ + 1] = (byte) (i_3_ >> 8 & 0xff);
		    is_0_[i_4_ + 2] = (byte) (i_3_ & 0xff);
		    is_0_[i_4_ + 3] = (byte) -1;
		}
	    }
	}
	return is_0_;
    }
    
    Class141 method14984() {
	return aClass141_9334;
    }
    
    byte[] method14985(int[] is) {
	byte[] is_5_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_6_ = 0; i_6_ < 16; i_6_++) {
		for (int i_7_ = 0; i_7_ < 16; i_7_++) {
		    int i_8_ = is[256 * i_6_ + 16 * i_7_ + i];
		    int i_9_ = (i_7_ * 256 + i_6_ * 16 + i) * 4;
		    is_5_[i_9_ + 0] = (byte) (i_8_ >> 16 & 0xff);
		    is_5_[i_9_ + 1] = (byte) (i_8_ >> 8 & 0xff);
		    is_5_[i_9_ + 2] = (byte) (i_8_ & 0xff);
		    is_5_[i_9_ + 3] = (byte) -1;
		}
	    }
	}
	return is_5_;
    }
    
    Class141 method14986() {
	return aClass141_9334;
    }
    
    Class141 method14987() {
	return aClass141_9334;
    }
    
    Class141 method14988() {
	return aClass141_9334;
    }
    
    Class170_Sub2(Class185_Sub3 class185_sub3, int[] is) {
	aClass185_Sub3_9333 = class185_sub3;
	if (aClass185_Sub3_9333.aBool9693) {
	    byte[] is_10_ = method14985(is);
	    aClass141_9334
		= new Class141_Sub4(aClass185_Sub3_9333,
				    Class181.aClass181_1952,
				    Class173.aClass173_1830, 16, 16, 16,
				    is_10_, Class181.aClass181_1952);
	} else
	    aClass141_9334 = new Class141_Sub2(aClass185_Sub3_9333, 3553, 256,
					       16, false, is, 256, 0, false);
    }
    
    byte[] method14989(int[] is) {
	byte[] is_11_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_12_ = 0; i_12_ < 16; i_12_++) {
		for (int i_13_ = 0; i_13_ < 16; i_13_++) {
		    int i_14_ = is[256 * i_12_ + 16 * i_13_ + i];
		    int i_15_ = (i_13_ * 256 + i_12_ * 16 + i) * 4;
		    is_11_[i_15_ + 0] = (byte) (i_14_ >> 16 & 0xff);
		    is_11_[i_15_ + 1] = (byte) (i_14_ >> 8 & 0xff);
		    is_11_[i_15_ + 2] = (byte) (i_14_ & 0xff);
		    is_11_[i_15_ + 3] = (byte) -1;
		}
	    }
	}
	return is_11_;
    }
    
    Class141 method14990() {
	return aClass141_9334;
    }
    
    byte[] method14991(int[] is) {
	byte[] is_16_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_17_ = 0; i_17_ < 16; i_17_++) {
		for (int i_18_ = 0; i_18_ < 16; i_18_++) {
		    int i_19_ = is[256 * i_17_ + 16 * i_18_ + i];
		    int i_20_ = (i_18_ * 256 + i_17_ * 16 + i) * 4;
		    is_16_[i_20_ + 0] = (byte) (i_19_ >> 16 & 0xff);
		    is_16_[i_20_ + 1] = (byte) (i_19_ >> 8 & 0xff);
		    is_16_[i_20_ + 2] = (byte) (i_19_ & 0xff);
		    is_16_[i_20_ + 3] = (byte) -1;
		}
	    }
	}
	return is_16_;
    }
    
    byte[] method14992(int[] is) {
	byte[] is_21_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_22_ = 0; i_22_ < 16; i_22_++) {
		for (int i_23_ = 0; i_23_ < 16; i_23_++) {
		    int i_24_ = is[256 * i_22_ + 16 * i_23_ + i];
		    int i_25_ = (i_23_ * 256 + i_22_ * 16 + i) * 4;
		    is_21_[i_25_ + 0] = (byte) (i_24_ >> 16 & 0xff);
		    is_21_[i_25_ + 1] = (byte) (i_24_ >> 8 & 0xff);
		    is_21_[i_25_ + 2] = (byte) (i_24_ & 0xff);
		    is_21_[i_25_ + 3] = (byte) -1;
		}
	    }
	}
	return is_21_;
    }
}
