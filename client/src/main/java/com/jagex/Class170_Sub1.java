/* Class170_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class170_Sub1 extends Class170
{
    Class185_Sub1 aClass185_Sub1_9020;
    Interface43 anInterface43_9021;
    
    Class170_Sub1(Class185_Sub1 class185_sub1, int[] is) {
	aClass185_Sub1_9020 = class185_sub1;
	if (aClass185_Sub1_9020.aBool9276) {
	    byte[] is_0_ = method14525(is);
	    anInterface43_9021
		= aClass185_Sub1_9020.method14963(Class181.aClass181_1952, 16,
						  16, 16, false, is_0_);
	} else
	    anInterface43_9021
		= aClass185_Sub1_9020.method14658(256, 16, false, is);
    }
    
    public Interface43 method14520() {
	return anInterface43_9021;
    }
    
    byte[] method14521(int[] is) {
	byte[] is_1_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_2_ = 0; i_2_ < 16; i_2_++) {
		for (int i_3_ = 0; i_3_ < 16; i_3_++) {
		    int i_4_ = is[256 * i_2_ + 16 * i_3_ + i];
		    int i_5_ = (i_3_ * 256 + i_2_ * 16 + i) * 4;
		    if (aClass185_Sub1_9020.anInt9268 == 0) {
			is_1_[i_5_ + 0] = (byte) (i_4_ & 0xff);
			is_1_[i_5_ + 1] = (byte) (i_4_ >> 8 & 0xff);
			is_1_[i_5_ + 2] = (byte) (i_4_ >> 16 & 0xff);
			is_1_[i_5_ + 3] = (byte) -1;
		    } else {
			is_1_[i_5_ + 0] = (byte) (i_4_ >> 16 & 0xff);
			is_1_[i_5_ + 1] = (byte) (i_4_ >> 8 & 0xff);
			is_1_[i_5_ + 2] = (byte) (i_4_ & 0xff);
			is_1_[i_5_ + 3] = (byte) -1;
		    }
		}
	    }
	}
	return is_1_;
    }
    
    public Interface43 method14522() {
	return anInterface43_9021;
    }
    
    public Interface43 method14523() {
	return anInterface43_9021;
    }
    
    public Interface43 method14524() {
	return anInterface43_9021;
    }
    
    byte[] method14525(int[] is) {
	byte[] is_6_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_7_ = 0; i_7_ < 16; i_7_++) {
		for (int i_8_ = 0; i_8_ < 16; i_8_++) {
		    int i_9_ = is[256 * i_7_ + 16 * i_8_ + i];
		    int i_10_ = (i_8_ * 256 + i_7_ * 16 + i) * 4;
		    if (aClass185_Sub1_9020.anInt9268 == 0) {
			is_6_[i_10_ + 0] = (byte) (i_9_ & 0xff);
			is_6_[i_10_ + 1] = (byte) (i_9_ >> 8 & 0xff);
			is_6_[i_10_ + 2] = (byte) (i_9_ >> 16 & 0xff);
			is_6_[i_10_ + 3] = (byte) -1;
		    } else {
			is_6_[i_10_ + 0] = (byte) (i_9_ >> 16 & 0xff);
			is_6_[i_10_ + 1] = (byte) (i_9_ >> 8 & 0xff);
			is_6_[i_10_ + 2] = (byte) (i_9_ & 0xff);
			is_6_[i_10_ + 3] = (byte) -1;
		    }
		}
	    }
	}
	return is_6_;
    }
    
    public Interface43 method14526() {
	return anInterface43_9021;
    }
    
    public Interface43 method14527() {
	return anInterface43_9021;
    }
    
    byte[] method14528(int[] is) {
	byte[] is_11_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_12_ = 0; i_12_ < 16; i_12_++) {
		for (int i_13_ = 0; i_13_ < 16; i_13_++) {
		    int i_14_ = is[256 * i_12_ + 16 * i_13_ + i];
		    int i_15_ = (i_13_ * 256 + i_12_ * 16 + i) * 4;
		    if (aClass185_Sub1_9020.anInt9268 == 0) {
			is_11_[i_15_ + 0] = (byte) (i_14_ & 0xff);
			is_11_[i_15_ + 1] = (byte) (i_14_ >> 8 & 0xff);
			is_11_[i_15_ + 2] = (byte) (i_14_ >> 16 & 0xff);
			is_11_[i_15_ + 3] = (byte) -1;
		    } else {
			is_11_[i_15_ + 0] = (byte) (i_14_ >> 16 & 0xff);
			is_11_[i_15_ + 1] = (byte) (i_14_ >> 8 & 0xff);
			is_11_[i_15_ + 2] = (byte) (i_14_ & 0xff);
			is_11_[i_15_ + 3] = (byte) -1;
		    }
		}
	    }
	}
	return is_11_;
    }
}
