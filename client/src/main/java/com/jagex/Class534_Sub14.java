/* Class534_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class534_Sub14 extends Class534
{
    int anInt10460;
    int anInt10461;
    int anInt10462;
    boolean aBool10463;
    int[] anIntArray10464;
    static int[] anIntArray10465;
    
    Class534_Sub14(int i, int i_0_, int[] is, boolean bool) {
	anInt10460 = i;
	anInt10461 = i_0_;
	anIntArray10464 = is;
	if (bool) {
	    int[] is_1_ = new int[anInt10461];
	    int[] is_2_ = new int[anInt10461];
	    int[] is_3_ = new int[anInt10461];
	    int[] is_4_ = new int[anInt10461];
	    if (anIntArray10465 == null
		|| anIntArray10465.length != anIntArray10464.length)
		anIntArray10465 = new int[anIntArray10464.length];
	    int i_5_ = anInt10461;
	    int i_6_ = anInt10461;
	    int i_7_ = i_5_ - 1;
	    int i_8_ = i_6_ - 1;
	    int i_9_ = i_5_ * i_6_;
	    int i_11_;
	    int i_10_ = i_11_ = 1 * i_5_;
	    for (int i_12_ = 2; i_12_ >= 0; i_12_--) {
		for (int i_13_ = i_7_; i_13_ >= 0; i_13_--) {
		    int i_14_ = anIntArray10464[--i_11_];
		    is_1_[i_13_] += i_14_ >> 24 & 0xff;
		    is_2_[i_13_] += i_14_ >> 16 & 0xff;
		    is_3_[i_13_] += i_14_ >> 8 & 0xff;
		    is_4_[i_13_] += i_14_ & 0xff;
		}
		if (i_11_ == 0)
		    i_11_ = i_9_;
	    }
	    int i_15_ = i_9_;
	    for (int i_16_ = i_8_; i_16_ >= 0; i_16_--) {
		int i_17_ = 1;
		int i_18_ = 1;
		int i_19_ = 0;
		int i_20_ = 0;
		int i_21_ = 0;
		int i_22_ = 0;
		for (int i_23_ = 2; i_23_ >= 0; i_23_--) {
		    i_18_--;
		    i_22_ += is_1_[i_18_];
		    i_21_ += is_2_[i_18_];
		    i_19_ += is_3_[i_18_];
		    i_20_ += is_4_[i_18_];
		    if (i_18_ == 0)
			i_18_ = i_5_;
		}
		for (int i_24_ = i_7_; i_24_ >= 0; i_24_--) {
		    i_18_--;
		    i_17_--;
		    int i_25_ = i_22_ / 9;
		    int i_26_ = i_21_ / 9;
		    int i_27_ = i_19_ / 9;
		    int i_28_ = i_20_ / 9;
		    anIntArray10465[--i_15_]
			= i_25_ << 24 | i_26_ << 16 | i_27_ << 8 | i_28_;
		    i_22_ += is_1_[i_18_] - is_1_[i_17_];
		    i_21_ += is_2_[i_18_] - is_2_[i_17_];
		    i_20_ += is_4_[i_18_] - is_4_[i_17_];
		    i_19_ += is_3_[i_18_] - is_3_[i_17_];
		    if (i_18_ == 0)
			i_18_ = i_5_;
		    if (i_17_ == 0)
			i_17_ = i_5_;
		}
		for (int i_29_ = i_7_; i_29_ >= 0; i_29_--) {
		    int i_30_ = anIntArray10464[--i_11_];
		    int i_31_ = anIntArray10464[--i_10_];
		    is_1_[i_29_]
			+= (i_30_ >> 24 & 0xff) - (i_31_ >> 24 & 0xff);
		    is_2_[i_29_]
			+= (i_30_ >> 16 & 0xff) - (i_31_ >> 16 & 0xff);
		    is_3_[i_29_] += (i_30_ >> 8 & 0xff) - (i_31_ >> 8 & 0xff);
		    is_4_[i_29_] += (i_30_ & 0xff) - (i_31_ & 0xff);
		}
		if (i_11_ == 0)
		    i_11_ = i_9_;
		if (i_10_ == 0)
		    i_10_ = i_9_;
	    }
	    int[] is_32_ = anIntArray10464;
	    anIntArray10464 = anIntArray10465;
	    anIntArray10465 = is_32_;
	}
    }
    
    int[] method16144() {
	return anIntArray10464;
    }
    
    int[] method16145() {
	return anIntArray10464;
    }
    
    int[] method16146() {
	return anIntArray10464;
    }
    
    void method16147(int i, int i_33_) {
	if (i != 0 || i_33_ != 0) {
	    if (anIntArray10465 == null
		|| anIntArray10465.length != anIntArray10464.length)
		anIntArray10465 = new int[anIntArray10464.length];
	    int i_34_ = anIntArray10464.length;
	    int i_35_ = i;
	    int i_36_ = anInt10461 - 1;
	    int i_37_ = anInt10461 * i_33_;
	    int i_38_ = i_34_ - 1;
	    for (int i_39_ = 0; i_39_ < i_34_; i_39_ += anInt10461) {
		int i_40_ = i_39_ + i_37_ & i_38_;
		for (int i_41_ = 0; i_41_ < anInt10461; i_41_++) {
		    int i_42_ = i_39_ + i_41_;
		    int i_43_ = i_40_ + (i_41_ + i_35_ & i_36_);
		    anIntArray10465[i_42_] = anIntArray10464[i_43_];
		}
	    }
	    int[] is = anIntArray10464;
	    anIntArray10464 = anIntArray10465;
	    anIntArray10465 = is;
	}
    }
    
    int[] method16148() {
	return anIntArray10464;
    }
    
    void method16149(int i, int i_44_) {
	if (i != 0 || i_44_ != 0) {
	    if (anIntArray10465 == null
		|| anIntArray10465.length != anIntArray10464.length)
		anIntArray10465 = new int[anIntArray10464.length];
	    int i_45_ = anIntArray10464.length;
	    int i_46_ = i;
	    int i_47_ = anInt10461 - 1;
	    int i_48_ = anInt10461 * i_44_;
	    int i_49_ = i_45_ - 1;
	    for (int i_50_ = 0; i_50_ < i_45_; i_50_ += anInt10461) {
		int i_51_ = i_50_ + i_48_ & i_49_;
		for (int i_52_ = 0; i_52_ < anInt10461; i_52_++) {
		    int i_53_ = i_50_ + i_52_;
		    int i_54_ = i_51_ + (i_52_ + i_46_ & i_47_);
		    anIntArray10465[i_53_] = anIntArray10464[i_54_];
		}
	    }
	    int[] is = anIntArray10464;
	    anIntArray10464 = anIntArray10465;
	    anIntArray10465 = is;
	}
    }
}
