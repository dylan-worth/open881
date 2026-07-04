/* Class534_Sub18_Sub16_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class534_Sub18_Sub16_Sub1 extends Class534_Sub18_Sub16
{
    int anInt12068;
    static final int anInt12069 = 16;
    int anInt12070;
    int anInt12071;
    int anInt12072;
    byte[] aByteArray12073;
    
    void method18672() {
	int i = -1;
	int i_0_ = aByteArray12073.length - 8;
	while (i < i_0_) {
	    aByteArray12073[++i] = (byte) 0;
	    aByteArray12073[++i] = (byte) 0;
	    aByteArray12073[++i] = (byte) 0;
	    aByteArray12073[++i] = (byte) 0;
	    aByteArray12073[++i] = (byte) 0;
	    aByteArray12073[++i] = (byte) 0;
	    aByteArray12073[++i] = (byte) 0;
	    aByteArray12073[++i] = (byte) 0;
	}
	while (i < aByteArray12073.length - 1)
	    aByteArray12073[++i] = (byte) 0;
    }
    
    void method18673(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
	int i_6_ = 0;
	if (i_1_ != i)
	    i_6_ = (i_4_ - i_3_ << 16) / (i_1_ - i);
	int i_7_ = 0;
	if (i_2_ != i_1_)
	    i_7_ = (i_5_ - i_4_ << 16) / (i_2_ - i_1_);
	int i_8_ = 0;
	if (i_2_ != i)
	    i_8_ = (i_3_ - i_5_ << 16) / (i - i_2_);
	if (i <= i_1_ && i <= i_2_) {
	    if (i_1_ < i_2_) {
		i_5_ = i_3_ <<= 16;
		if (i < 0) {
		    i_5_ -= i_8_ * i;
		    i_3_ -= i_6_ * i;
		    i = 0;
		}
		i_4_ <<= 16;
		if (i_1_ < 0) {
		    i_4_ -= i_7_ * i_1_;
		    i_1_ = 0;
		}
		if (i != i_1_ && i_8_ < i_6_ || i == i_1_ && i_8_ > i_7_) {
		    i_2_ -= i_1_;
		    i_1_ -= i;
		    i *= anInt12068;
		    while (--i_1_ >= 0) {
			method18676(aByteArray12073, i, 0, i_5_ >> 16,
				    i_3_ >> 16);
			i_5_ += i_8_;
			i_3_ += i_6_;
			i += anInt12068;
		    }
		    while (--i_2_ >= 0) {
			method18676(aByteArray12073, i, 0, i_5_ >> 16,
				    i_4_ >> 16);
			i_5_ += i_8_;
			i_4_ += i_7_;
			i += anInt12068;
		    }
		} else {
		    i_2_ -= i_1_;
		    i_1_ -= i;
		    i *= anInt12068;
		    while (--i_1_ >= 0) {
			method18676(aByteArray12073, i, 0, i_3_ >> 16,
				    i_5_ >> 16);
			i_5_ += i_8_;
			i_3_ += i_6_;
			i += anInt12068;
		    }
		    while (--i_2_ >= 0) {
			method18676(aByteArray12073, i, 0, i_4_ >> 16,
				    i_5_ >> 16);
			i_5_ += i_8_;
			i_4_ += i_7_;
			i += anInt12068;
		    }
		}
	    } else {
		i_4_ = i_3_ <<= 16;
		if (i < 0) {
		    i_4_ -= i_8_ * i;
		    i_3_ -= i_6_ * i;
		    i = 0;
		}
		i_5_ <<= 16;
		if (i_2_ < 0) {
		    i_5_ -= i_7_ * i_2_;
		    i_2_ = 0;
		}
		if (i != i_2_ && i_8_ < i_6_ || i == i_2_ && i_7_ > i_6_) {
		    i_1_ -= i_2_;
		    i_2_ -= i;
		    i *= anInt12068;
		    while (--i_2_ >= 0) {
			method18676(aByteArray12073, i, 0, i_4_ >> 16,
				    i_3_ >> 16);
			i_4_ += i_8_;
			i_3_ += i_6_;
			i += anInt12068;
		    }
		    while (--i_1_ >= 0) {
			method18676(aByteArray12073, i, 0, i_5_ >> 16,
				    i_3_ >> 16);
			i_5_ += i_7_;
			i_3_ += i_6_;
			i += anInt12068;
		    }
		} else {
		    i_1_ -= i_2_;
		    i_2_ -= i;
		    i *= anInt12068;
		    while (--i_2_ >= 0) {
			method18676(aByteArray12073, i, 0, i_3_ >> 16,
				    i_4_ >> 16);
			i_4_ += i_8_;
			i_3_ += i_6_;
			i += anInt12068;
		    }
		    while (--i_1_ >= 0) {
			method18676(aByteArray12073, i, 0, i_3_ >> 16,
				    i_5_ >> 16);
			i_5_ += i_7_;
			i_3_ += i_6_;
			i += anInt12068;
		    }
		}
	    }
	} else if (i_1_ <= i_2_) {
	    if (i_2_ < i) {
		i_3_ = i_4_ <<= 16;
		if (i_1_ < 0) {
		    i_3_ -= i_6_ * i_1_;
		    i_4_ -= i_7_ * i_1_;
		    i_1_ = 0;
		}
		i_5_ <<= 16;
		if (i_2_ < 0) {
		    i_5_ -= i_8_ * i_2_;
		    i_2_ = 0;
		}
		if (i_1_ != i_2_ && i_6_ < i_7_
		    || i_1_ == i_2_ && i_6_ > i_8_) {
		    i -= i_2_;
		    i_2_ -= i_1_;
		    i_1_ *= anInt12068;
		    while (--i_2_ >= 0) {
			method18676(aByteArray12073, i_1_, 0, i_3_ >> 16,
				    i_4_ >> 16);
			i_3_ += i_6_;
			i_4_ += i_7_;
			i_1_ += anInt12068;
		    }
		    while (--i >= 0) {
			method18676(aByteArray12073, i_1_, 0, i_3_ >> 16,
				    i_5_ >> 16);
			i_3_ += i_6_;
			i_5_ += i_8_;
			i_1_ += anInt12068;
		    }
		} else {
		    i -= i_2_;
		    i_2_ -= i_1_;
		    i_1_ *= anInt12068;
		    while (--i_2_ >= 0) {
			method18676(aByteArray12073, i_1_, 0, i_4_ >> 16,
				    i_3_ >> 16);
			i_3_ += i_6_;
			i_4_ += i_7_;
			i_1_ += anInt12068;
		    }
		    while (--i >= 0) {
			method18676(aByteArray12073, i_1_, 0, i_5_ >> 16,
				    i_3_ >> 16);
			i_3_ += i_6_;
			i_5_ += i_8_;
			i_1_ += anInt12068;
		    }
		}
	    } else {
		i_5_ = i_4_ <<= 16;
		if (i_1_ < 0) {
		    i_5_ -= i_6_ * i_1_;
		    i_4_ -= i_7_ * i_1_;
		    i_1_ = 0;
		}
		i_3_ <<= 16;
		if (i < 0) {
		    i_3_ -= i_8_ * i;
		    i = 0;
		}
		if (i_6_ < i_7_) {
		    i_2_ -= i;
		    i -= i_1_;
		    i_1_ *= anInt12068;
		    while (--i >= 0) {
			method18676(aByteArray12073, i_1_, 0, i_5_ >> 16,
				    i_4_ >> 16);
			i_5_ += i_6_;
			i_4_ += i_7_;
			i_1_ += anInt12068;
		    }
		    while (--i_2_ >= 0) {
			method18676(aByteArray12073, i_1_, 0, i_3_ >> 16,
				    i_4_ >> 16);
			i_3_ += i_8_;
			i_4_ += i_7_;
			i_1_ += anInt12068;
		    }
		} else {
		    i_2_ -= i;
		    i -= i_1_;
		    i_1_ *= anInt12068;
		    while (--i >= 0) {
			method18676(aByteArray12073, i_1_, 0, i_4_ >> 16,
				    i_5_ >> 16);
			i_5_ += i_6_;
			i_4_ += i_7_;
			i_1_ += anInt12068;
		    }
		    while (--i_2_ >= 0) {
			method18676(aByteArray12073, i_1_, 0, i_4_ >> 16,
				    i_3_ >> 16);
			i_3_ += i_8_;
			i_4_ += i_7_;
			i_1_ += anInt12068;
		    }
		}
	    }
	} else if (i < i_1_) {
	    i_4_ = i_5_ <<= 16;
	    if (i_2_ < 0) {
		i_4_ -= i_7_ * i_2_;
		i_5_ -= i_8_ * i_2_;
		i_2_ = 0;
	    }
	    i_3_ <<= 16;
	    if (i < 0) {
		i_3_ -= i_6_ * i;
		i = 0;
	    }
	    if (i_7_ < i_8_) {
		i_1_ -= i;
		i -= i_2_;
		i_2_ *= anInt12068;
		while (--i >= 0) {
		    method18676(aByteArray12073, i_2_, 0, i_4_ >> 16,
				i_5_ >> 16);
		    i_4_ += i_7_;
		    i_5_ += i_8_;
		    i_2_ += anInt12068;
		}
		while (--i_1_ >= 0) {
		    method18676(aByteArray12073, i_2_, 0, i_4_ >> 16,
				i_3_ >> 16);
		    i_4_ += i_7_;
		    i_3_ += i_6_;
		    i_2_ += anInt12068;
		}
	    } else {
		i_1_ -= i;
		i -= i_2_;
		i_2_ *= anInt12068;
		while (--i >= 0) {
		    method18676(aByteArray12073, i_2_, 0, i_5_ >> 16,
				i_4_ >> 16);
		    i_4_ += i_7_;
		    i_5_ += i_8_;
		    i_2_ += anInt12068;
		}
		while (--i_1_ >= 0) {
		    method18676(aByteArray12073, i_2_, 0, i_3_ >> 16,
				i_4_ >> 16);
		    i_4_ += i_7_;
		    i_3_ += i_6_;
		    i_2_ += anInt12068;
		}
	    }
	} else {
	    i_3_ = i_5_ <<= 16;
	    if (i_2_ < 0) {
		i_3_ -= i_7_ * i_2_;
		i_5_ -= i_8_ * i_2_;
		i_2_ = 0;
	    }
	    i_4_ <<= 16;
	    if (i_1_ < 0) {
		i_4_ -= i_6_ * i_1_;
		i_1_ = 0;
	    }
	    if (i_7_ < i_8_) {
		i -= i_1_;
		i_1_ -= i_2_;
		i_2_ *= anInt12068;
		while (--i_1_ >= 0) {
		    method18676(aByteArray12073, i_2_, 0, i_3_ >> 16,
				i_5_ >> 16);
		    i_3_ += i_7_;
		    i_5_ += i_8_;
		    i_2_ += anInt12068;
		}
		while (--i >= 0) {
		    method18676(aByteArray12073, i_2_, 0, i_4_ >> 16,
				i_5_ >> 16);
		    i_4_ += i_6_;
		    i_5_ += i_8_;
		    i_2_ += anInt12068;
		}
	    } else {
		i -= i_1_;
		i_1_ -= i_2_;
		i_2_ *= anInt12068;
		while (--i_1_ >= 0) {
		    method18676(aByteArray12073, i_2_, 0, i_5_ >> 16,
				i_3_ >> 16);
		    i_3_ += i_7_;
		    i_5_ += i_8_;
		    i_2_ += anInt12068;
		}
		while (--i >= 0) {
		    method18676(aByteArray12073, i_2_, 0, i_5_ >> 16,
				i_4_ >> 16);
		    i_4_ += i_6_;
		    i_5_ += i_8_;
		    i_2_ += anInt12068;
		}
	    }
	}
    }
    
    void method18674() {
	int i = -1;
	int i_9_ = aByteArray12073.length - 8;
	while (i < i_9_) {
	    aByteArray12073[++i] = (byte) 0;
	    aByteArray12073[++i] = (byte) 0;
	    aByteArray12073[++i] = (byte) 0;
	    aByteArray12073[++i] = (byte) 0;
	    aByteArray12073[++i] = (byte) 0;
	    aByteArray12073[++i] = (byte) 0;
	    aByteArray12073[++i] = (byte) 0;
	    aByteArray12073[++i] = (byte) 0;
	}
	while (i < aByteArray12073.length - 1)
	    aByteArray12073[++i] = (byte) 0;
    }
    
    Class534_Sub18_Sub16_Sub1(Class185_Sub3 class185_sub3, int i, int i_10_) {
	aByteArray12073 = new byte[i * i_10_];
    }
    
    void method18675(int i, int i_11_, int i_12_, int i_13_, int i_14_,
		     int i_15_) {
	int i_16_ = 0;
	if (i_11_ != i)
	    i_16_ = (i_14_ - i_13_ << 16) / (i_11_ - i);
	int i_17_ = 0;
	if (i_12_ != i_11_)
	    i_17_ = (i_15_ - i_14_ << 16) / (i_12_ - i_11_);
	int i_18_ = 0;
	if (i_12_ != i)
	    i_18_ = (i_13_ - i_15_ << 16) / (i - i_12_);
	if (i <= i_11_ && i <= i_12_) {
	    if (i_11_ < i_12_) {
		i_15_ = i_13_ <<= 16;
		if (i < 0) {
		    i_15_ -= i_18_ * i;
		    i_13_ -= i_16_ * i;
		    i = 0;
		}
		i_14_ <<= 16;
		if (i_11_ < 0) {
		    i_14_ -= i_17_ * i_11_;
		    i_11_ = 0;
		}
		if (i != i_11_ && i_18_ < i_16_
		    || i == i_11_ && i_18_ > i_17_) {
		    i_12_ -= i_11_;
		    i_11_ -= i;
		    i *= anInt12068;
		    while (--i_11_ >= 0) {
			method18676(aByteArray12073, i, 0, i_15_ >> 16,
				    i_13_ >> 16);
			i_15_ += i_18_;
			i_13_ += i_16_;
			i += anInt12068;
		    }
		    while (--i_12_ >= 0) {
			method18676(aByteArray12073, i, 0, i_15_ >> 16,
				    i_14_ >> 16);
			i_15_ += i_18_;
			i_14_ += i_17_;
			i += anInt12068;
		    }
		} else {
		    i_12_ -= i_11_;
		    i_11_ -= i;
		    i *= anInt12068;
		    while (--i_11_ >= 0) {
			method18676(aByteArray12073, i, 0, i_13_ >> 16,
				    i_15_ >> 16);
			i_15_ += i_18_;
			i_13_ += i_16_;
			i += anInt12068;
		    }
		    while (--i_12_ >= 0) {
			method18676(aByteArray12073, i, 0, i_14_ >> 16,
				    i_15_ >> 16);
			i_15_ += i_18_;
			i_14_ += i_17_;
			i += anInt12068;
		    }
		}
	    } else {
		i_14_ = i_13_ <<= 16;
		if (i < 0) {
		    i_14_ -= i_18_ * i;
		    i_13_ -= i_16_ * i;
		    i = 0;
		}
		i_15_ <<= 16;
		if (i_12_ < 0) {
		    i_15_ -= i_17_ * i_12_;
		    i_12_ = 0;
		}
		if (i != i_12_ && i_18_ < i_16_
		    || i == i_12_ && i_17_ > i_16_) {
		    i_11_ -= i_12_;
		    i_12_ -= i;
		    i *= anInt12068;
		    while (--i_12_ >= 0) {
			method18676(aByteArray12073, i, 0, i_14_ >> 16,
				    i_13_ >> 16);
			i_14_ += i_18_;
			i_13_ += i_16_;
			i += anInt12068;
		    }
		    while (--i_11_ >= 0) {
			method18676(aByteArray12073, i, 0, i_15_ >> 16,
				    i_13_ >> 16);
			i_15_ += i_17_;
			i_13_ += i_16_;
			i += anInt12068;
		    }
		} else {
		    i_11_ -= i_12_;
		    i_12_ -= i;
		    i *= anInt12068;
		    while (--i_12_ >= 0) {
			method18676(aByteArray12073, i, 0, i_13_ >> 16,
				    i_14_ >> 16);
			i_14_ += i_18_;
			i_13_ += i_16_;
			i += anInt12068;
		    }
		    while (--i_11_ >= 0) {
			method18676(aByteArray12073, i, 0, i_13_ >> 16,
				    i_15_ >> 16);
			i_15_ += i_17_;
			i_13_ += i_16_;
			i += anInt12068;
		    }
		}
	    }
	} else if (i_11_ <= i_12_) {
	    if (i_12_ < i) {
		i_13_ = i_14_ <<= 16;
		if (i_11_ < 0) {
		    i_13_ -= i_16_ * i_11_;
		    i_14_ -= i_17_ * i_11_;
		    i_11_ = 0;
		}
		i_15_ <<= 16;
		if (i_12_ < 0) {
		    i_15_ -= i_18_ * i_12_;
		    i_12_ = 0;
		}
		if (i_11_ != i_12_ && i_16_ < i_17_
		    || i_11_ == i_12_ && i_16_ > i_18_) {
		    i -= i_12_;
		    i_12_ -= i_11_;
		    i_11_ *= anInt12068;
		    while (--i_12_ >= 0) {
			method18676(aByteArray12073, i_11_, 0, i_13_ >> 16,
				    i_14_ >> 16);
			i_13_ += i_16_;
			i_14_ += i_17_;
			i_11_ += anInt12068;
		    }
		    while (--i >= 0) {
			method18676(aByteArray12073, i_11_, 0, i_13_ >> 16,
				    i_15_ >> 16);
			i_13_ += i_16_;
			i_15_ += i_18_;
			i_11_ += anInt12068;
		    }
		} else {
		    i -= i_12_;
		    i_12_ -= i_11_;
		    i_11_ *= anInt12068;
		    while (--i_12_ >= 0) {
			method18676(aByteArray12073, i_11_, 0, i_14_ >> 16,
				    i_13_ >> 16);
			i_13_ += i_16_;
			i_14_ += i_17_;
			i_11_ += anInt12068;
		    }
		    while (--i >= 0) {
			method18676(aByteArray12073, i_11_, 0, i_15_ >> 16,
				    i_13_ >> 16);
			i_13_ += i_16_;
			i_15_ += i_18_;
			i_11_ += anInt12068;
		    }
		}
	    } else {
		i_15_ = i_14_ <<= 16;
		if (i_11_ < 0) {
		    i_15_ -= i_16_ * i_11_;
		    i_14_ -= i_17_ * i_11_;
		    i_11_ = 0;
		}
		i_13_ <<= 16;
		if (i < 0) {
		    i_13_ -= i_18_ * i;
		    i = 0;
		}
		if (i_16_ < i_17_) {
		    i_12_ -= i;
		    i -= i_11_;
		    i_11_ *= anInt12068;
		    while (--i >= 0) {
			method18676(aByteArray12073, i_11_, 0, i_15_ >> 16,
				    i_14_ >> 16);
			i_15_ += i_16_;
			i_14_ += i_17_;
			i_11_ += anInt12068;
		    }
		    while (--i_12_ >= 0) {
			method18676(aByteArray12073, i_11_, 0, i_13_ >> 16,
				    i_14_ >> 16);
			i_13_ += i_18_;
			i_14_ += i_17_;
			i_11_ += anInt12068;
		    }
		} else {
		    i_12_ -= i;
		    i -= i_11_;
		    i_11_ *= anInt12068;
		    while (--i >= 0) {
			method18676(aByteArray12073, i_11_, 0, i_14_ >> 16,
				    i_15_ >> 16);
			i_15_ += i_16_;
			i_14_ += i_17_;
			i_11_ += anInt12068;
		    }
		    while (--i_12_ >= 0) {
			method18676(aByteArray12073, i_11_, 0, i_14_ >> 16,
				    i_13_ >> 16);
			i_13_ += i_18_;
			i_14_ += i_17_;
			i_11_ += anInt12068;
		    }
		}
	    }
	} else if (i < i_11_) {
	    i_14_ = i_15_ <<= 16;
	    if (i_12_ < 0) {
		i_14_ -= i_17_ * i_12_;
		i_15_ -= i_18_ * i_12_;
		i_12_ = 0;
	    }
	    i_13_ <<= 16;
	    if (i < 0) {
		i_13_ -= i_16_ * i;
		i = 0;
	    }
	    if (i_17_ < i_18_) {
		i_11_ -= i;
		i -= i_12_;
		i_12_ *= anInt12068;
		while (--i >= 0) {
		    method18676(aByteArray12073, i_12_, 0, i_14_ >> 16,
				i_15_ >> 16);
		    i_14_ += i_17_;
		    i_15_ += i_18_;
		    i_12_ += anInt12068;
		}
		while (--i_11_ >= 0) {
		    method18676(aByteArray12073, i_12_, 0, i_14_ >> 16,
				i_13_ >> 16);
		    i_14_ += i_17_;
		    i_13_ += i_16_;
		    i_12_ += anInt12068;
		}
	    } else {
		i_11_ -= i;
		i -= i_12_;
		i_12_ *= anInt12068;
		while (--i >= 0) {
		    method18676(aByteArray12073, i_12_, 0, i_15_ >> 16,
				i_14_ >> 16);
		    i_14_ += i_17_;
		    i_15_ += i_18_;
		    i_12_ += anInt12068;
		}
		while (--i_11_ >= 0) {
		    method18676(aByteArray12073, i_12_, 0, i_13_ >> 16,
				i_14_ >> 16);
		    i_14_ += i_17_;
		    i_13_ += i_16_;
		    i_12_ += anInt12068;
		}
	    }
	} else {
	    i_13_ = i_15_ <<= 16;
	    if (i_12_ < 0) {
		i_13_ -= i_17_ * i_12_;
		i_15_ -= i_18_ * i_12_;
		i_12_ = 0;
	    }
	    i_14_ <<= 16;
	    if (i_11_ < 0) {
		i_14_ -= i_16_ * i_11_;
		i_11_ = 0;
	    }
	    if (i_17_ < i_18_) {
		i -= i_11_;
		i_11_ -= i_12_;
		i_12_ *= anInt12068;
		while (--i_11_ >= 0) {
		    method18676(aByteArray12073, i_12_, 0, i_13_ >> 16,
				i_15_ >> 16);
		    i_13_ += i_17_;
		    i_15_ += i_18_;
		    i_12_ += anInt12068;
		}
		while (--i >= 0) {
		    method18676(aByteArray12073, i_12_, 0, i_14_ >> 16,
				i_15_ >> 16);
		    i_14_ += i_16_;
		    i_15_ += i_18_;
		    i_12_ += anInt12068;
		}
	    } else {
		i -= i_11_;
		i_11_ -= i_12_;
		i_12_ *= anInt12068;
		while (--i_11_ >= 0) {
		    method18676(aByteArray12073, i_12_, 0, i_15_ >> 16,
				i_13_ >> 16);
		    i_13_ += i_17_;
		    i_15_ += i_18_;
		    i_12_ += anInt12068;
		}
		while (--i >= 0) {
		    method18676(aByteArray12073, i_12_, 0, i_15_ >> 16,
				i_14_ >> 16);
		    i_14_ += i_16_;
		    i_15_ += i_18_;
		    i_12_ += anInt12068;
		}
	    }
	}
    }
    
    static final void method18676(byte[] is, int i, int i_19_, int i_20_,
				  int i_21_) {
	if (i_20_ < i_21_) {
	    i += i_20_;
	    i_19_ = i_21_ - i_20_ >> 2;
	    while (--i_19_ >= 0) {
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
	    }
	    i_19_ = i_21_ - i_20_ & 0x3;
	    while (--i_19_ >= 0)
		is[i++] = (byte) 1;
	}
    }
    
    void method18677(int i, int i_22_, int i_23_, int i_24_) {
	anInt12071 = i;
	anInt12070 = i_22_;
	anInt12068 = i_23_ - i;
	anInt12072 = i_24_ - i_22_;
    }
    
    void method18678(int i, int i_25_, int i_26_, int i_27_) {
	anInt12071 = i;
	anInt12070 = i_25_;
	anInt12068 = i_26_ - i;
	anInt12072 = i_27_ - i_25_;
    }
    
    boolean method18679(int i, int i_28_) {
	return aByteArray12073.length >= i * i_28_;
    }
    
    void method18680() {
	int i = -1;
	int i_29_ = aByteArray12073.length - 8;
	while (i < i_29_) {
	    aByteArray12073[++i] = (byte) 0;
	    aByteArray12073[++i] = (byte) 0;
	    aByteArray12073[++i] = (byte) 0;
	    aByteArray12073[++i] = (byte) 0;
	    aByteArray12073[++i] = (byte) 0;
	    aByteArray12073[++i] = (byte) 0;
	    aByteArray12073[++i] = (byte) 0;
	    aByteArray12073[++i] = (byte) 0;
	}
	while (i < aByteArray12073.length - 1)
	    aByteArray12073[++i] = (byte) 0;
    }
    
    boolean method18681(int i, int i_30_) {
	return aByteArray12073.length >= i * i_30_;
    }
    
    void method18682(int i, int i_31_, int i_32_, int i_33_) {
	anInt12071 = i;
	anInt12070 = i_31_;
	anInt12068 = i_32_ - i;
	anInt12072 = i_33_ - i_31_;
    }
    
    void method18683(int i, int i_34_, int i_35_, int i_36_, int i_37_,
		     int i_38_) {
	int i_39_ = 0;
	if (i_34_ != i)
	    i_39_ = (i_37_ - i_36_ << 16) / (i_34_ - i);
	int i_40_ = 0;
	if (i_35_ != i_34_)
	    i_40_ = (i_38_ - i_37_ << 16) / (i_35_ - i_34_);
	int i_41_ = 0;
	if (i_35_ != i)
	    i_41_ = (i_36_ - i_38_ << 16) / (i - i_35_);
	if (i <= i_34_ && i <= i_35_) {
	    if (i_34_ < i_35_) {
		i_38_ = i_36_ <<= 16;
		if (i < 0) {
		    i_38_ -= i_41_ * i;
		    i_36_ -= i_39_ * i;
		    i = 0;
		}
		i_37_ <<= 16;
		if (i_34_ < 0) {
		    i_37_ -= i_40_ * i_34_;
		    i_34_ = 0;
		}
		if (i != i_34_ && i_41_ < i_39_
		    || i == i_34_ && i_41_ > i_40_) {
		    i_35_ -= i_34_;
		    i_34_ -= i;
		    i *= anInt12068;
		    while (--i_34_ >= 0) {
			method18676(aByteArray12073, i, 0, i_38_ >> 16,
				    i_36_ >> 16);
			i_38_ += i_41_;
			i_36_ += i_39_;
			i += anInt12068;
		    }
		    while (--i_35_ >= 0) {
			method18676(aByteArray12073, i, 0, i_38_ >> 16,
				    i_37_ >> 16);
			i_38_ += i_41_;
			i_37_ += i_40_;
			i += anInt12068;
		    }
		} else {
		    i_35_ -= i_34_;
		    i_34_ -= i;
		    i *= anInt12068;
		    while (--i_34_ >= 0) {
			method18676(aByteArray12073, i, 0, i_36_ >> 16,
				    i_38_ >> 16);
			i_38_ += i_41_;
			i_36_ += i_39_;
			i += anInt12068;
		    }
		    while (--i_35_ >= 0) {
			method18676(aByteArray12073, i, 0, i_37_ >> 16,
				    i_38_ >> 16);
			i_38_ += i_41_;
			i_37_ += i_40_;
			i += anInt12068;
		    }
		}
	    } else {
		i_37_ = i_36_ <<= 16;
		if (i < 0) {
		    i_37_ -= i_41_ * i;
		    i_36_ -= i_39_ * i;
		    i = 0;
		}
		i_38_ <<= 16;
		if (i_35_ < 0) {
		    i_38_ -= i_40_ * i_35_;
		    i_35_ = 0;
		}
		if (i != i_35_ && i_41_ < i_39_
		    || i == i_35_ && i_40_ > i_39_) {
		    i_34_ -= i_35_;
		    i_35_ -= i;
		    i *= anInt12068;
		    while (--i_35_ >= 0) {
			method18676(aByteArray12073, i, 0, i_37_ >> 16,
				    i_36_ >> 16);
			i_37_ += i_41_;
			i_36_ += i_39_;
			i += anInt12068;
		    }
		    while (--i_34_ >= 0) {
			method18676(aByteArray12073, i, 0, i_38_ >> 16,
				    i_36_ >> 16);
			i_38_ += i_40_;
			i_36_ += i_39_;
			i += anInt12068;
		    }
		} else {
		    i_34_ -= i_35_;
		    i_35_ -= i;
		    i *= anInt12068;
		    while (--i_35_ >= 0) {
			method18676(aByteArray12073, i, 0, i_36_ >> 16,
				    i_37_ >> 16);
			i_37_ += i_41_;
			i_36_ += i_39_;
			i += anInt12068;
		    }
		    while (--i_34_ >= 0) {
			method18676(aByteArray12073, i, 0, i_36_ >> 16,
				    i_38_ >> 16);
			i_38_ += i_40_;
			i_36_ += i_39_;
			i += anInt12068;
		    }
		}
	    }
	} else if (i_34_ <= i_35_) {
	    if (i_35_ < i) {
		i_36_ = i_37_ <<= 16;
		if (i_34_ < 0) {
		    i_36_ -= i_39_ * i_34_;
		    i_37_ -= i_40_ * i_34_;
		    i_34_ = 0;
		}
		i_38_ <<= 16;
		if (i_35_ < 0) {
		    i_38_ -= i_41_ * i_35_;
		    i_35_ = 0;
		}
		if (i_34_ != i_35_ && i_39_ < i_40_
		    || i_34_ == i_35_ && i_39_ > i_41_) {
		    i -= i_35_;
		    i_35_ -= i_34_;
		    i_34_ *= anInt12068;
		    while (--i_35_ >= 0) {
			method18676(aByteArray12073, i_34_, 0, i_36_ >> 16,
				    i_37_ >> 16);
			i_36_ += i_39_;
			i_37_ += i_40_;
			i_34_ += anInt12068;
		    }
		    while (--i >= 0) {
			method18676(aByteArray12073, i_34_, 0, i_36_ >> 16,
				    i_38_ >> 16);
			i_36_ += i_39_;
			i_38_ += i_41_;
			i_34_ += anInt12068;
		    }
		} else {
		    i -= i_35_;
		    i_35_ -= i_34_;
		    i_34_ *= anInt12068;
		    while (--i_35_ >= 0) {
			method18676(aByteArray12073, i_34_, 0, i_37_ >> 16,
				    i_36_ >> 16);
			i_36_ += i_39_;
			i_37_ += i_40_;
			i_34_ += anInt12068;
		    }
		    while (--i >= 0) {
			method18676(aByteArray12073, i_34_, 0, i_38_ >> 16,
				    i_36_ >> 16);
			i_36_ += i_39_;
			i_38_ += i_41_;
			i_34_ += anInt12068;
		    }
		}
	    } else {
		i_38_ = i_37_ <<= 16;
		if (i_34_ < 0) {
		    i_38_ -= i_39_ * i_34_;
		    i_37_ -= i_40_ * i_34_;
		    i_34_ = 0;
		}
		i_36_ <<= 16;
		if (i < 0) {
		    i_36_ -= i_41_ * i;
		    i = 0;
		}
		if (i_39_ < i_40_) {
		    i_35_ -= i;
		    i -= i_34_;
		    i_34_ *= anInt12068;
		    while (--i >= 0) {
			method18676(aByteArray12073, i_34_, 0, i_38_ >> 16,
				    i_37_ >> 16);
			i_38_ += i_39_;
			i_37_ += i_40_;
			i_34_ += anInt12068;
		    }
		    while (--i_35_ >= 0) {
			method18676(aByteArray12073, i_34_, 0, i_36_ >> 16,
				    i_37_ >> 16);
			i_36_ += i_41_;
			i_37_ += i_40_;
			i_34_ += anInt12068;
		    }
		} else {
		    i_35_ -= i;
		    i -= i_34_;
		    i_34_ *= anInt12068;
		    while (--i >= 0) {
			method18676(aByteArray12073, i_34_, 0, i_37_ >> 16,
				    i_38_ >> 16);
			i_38_ += i_39_;
			i_37_ += i_40_;
			i_34_ += anInt12068;
		    }
		    while (--i_35_ >= 0) {
			method18676(aByteArray12073, i_34_, 0, i_37_ >> 16,
				    i_36_ >> 16);
			i_36_ += i_41_;
			i_37_ += i_40_;
			i_34_ += anInt12068;
		    }
		}
	    }
	} else if (i < i_34_) {
	    i_37_ = i_38_ <<= 16;
	    if (i_35_ < 0) {
		i_37_ -= i_40_ * i_35_;
		i_38_ -= i_41_ * i_35_;
		i_35_ = 0;
	    }
	    i_36_ <<= 16;
	    if (i < 0) {
		i_36_ -= i_39_ * i;
		i = 0;
	    }
	    if (i_40_ < i_41_) {
		i_34_ -= i;
		i -= i_35_;
		i_35_ *= anInt12068;
		while (--i >= 0) {
		    method18676(aByteArray12073, i_35_, 0, i_37_ >> 16,
				i_38_ >> 16);
		    i_37_ += i_40_;
		    i_38_ += i_41_;
		    i_35_ += anInt12068;
		}
		while (--i_34_ >= 0) {
		    method18676(aByteArray12073, i_35_, 0, i_37_ >> 16,
				i_36_ >> 16);
		    i_37_ += i_40_;
		    i_36_ += i_39_;
		    i_35_ += anInt12068;
		}
	    } else {
		i_34_ -= i;
		i -= i_35_;
		i_35_ *= anInt12068;
		while (--i >= 0) {
		    method18676(aByteArray12073, i_35_, 0, i_38_ >> 16,
				i_37_ >> 16);
		    i_37_ += i_40_;
		    i_38_ += i_41_;
		    i_35_ += anInt12068;
		}
		while (--i_34_ >= 0) {
		    method18676(aByteArray12073, i_35_, 0, i_36_ >> 16,
				i_37_ >> 16);
		    i_37_ += i_40_;
		    i_36_ += i_39_;
		    i_35_ += anInt12068;
		}
	    }
	} else {
	    i_36_ = i_38_ <<= 16;
	    if (i_35_ < 0) {
		i_36_ -= i_40_ * i_35_;
		i_38_ -= i_41_ * i_35_;
		i_35_ = 0;
	    }
	    i_37_ <<= 16;
	    if (i_34_ < 0) {
		i_37_ -= i_39_ * i_34_;
		i_34_ = 0;
	    }
	    if (i_40_ < i_41_) {
		i -= i_34_;
		i_34_ -= i_35_;
		i_35_ *= anInt12068;
		while (--i_34_ >= 0) {
		    method18676(aByteArray12073, i_35_, 0, i_36_ >> 16,
				i_38_ >> 16);
		    i_36_ += i_40_;
		    i_38_ += i_41_;
		    i_35_ += anInt12068;
		}
		while (--i >= 0) {
		    method18676(aByteArray12073, i_35_, 0, i_37_ >> 16,
				i_38_ >> 16);
		    i_37_ += i_39_;
		    i_38_ += i_41_;
		    i_35_ += anInt12068;
		}
	    } else {
		i -= i_34_;
		i_34_ -= i_35_;
		i_35_ *= anInt12068;
		while (--i_34_ >= 0) {
		    method18676(aByteArray12073, i_35_, 0, i_38_ >> 16,
				i_36_ >> 16);
		    i_36_ += i_40_;
		    i_38_ += i_41_;
		    i_35_ += anInt12068;
		}
		while (--i >= 0) {
		    method18676(aByteArray12073, i_35_, 0, i_38_ >> 16,
				i_37_ >> 16);
		    i_37_ += i_39_;
		    i_38_ += i_41_;
		    i_35_ += anInt12068;
		}
	    }
	}
    }
    
    static final void method18684(byte[] is, int i, int i_42_, int i_43_,
				  int i_44_) {
	if (i_43_ < i_44_) {
	    i += i_43_;
	    i_42_ = i_44_ - i_43_ >> 2;
	    while (--i_42_ >= 0) {
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
	    }
	    i_42_ = i_44_ - i_43_ & 0x3;
	    while (--i_42_ >= 0)
		is[i++] = (byte) 1;
	}
    }
}
