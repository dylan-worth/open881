/* Class534_Sub18_Sub16_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class534_Sub18_Sub16_Sub2 extends Class534_Sub18_Sub16
{
    byte[] aByteArray12120;
    int anInt12121;
    int anInt12122;
    int anInt12123;
    static final int anInt12124 = 16;
    int anInt12125;
    
    void method18751(int i, int i_0_, int i_1_, int i_2_) {
	anInt12123 = i;
	anInt12121 = i_0_;
	anInt12125 = i_1_ - i;
	anInt12122 = i_2_ - i_0_;
    }
    
    void method18752() {
	int i = -1;
	int i_3_ = aByteArray12120.length - 8;
	while (i < i_3_) {
	    aByteArray12120[++i] = (byte) 0;
	    aByteArray12120[++i] = (byte) 0;
	    aByteArray12120[++i] = (byte) 0;
	    aByteArray12120[++i] = (byte) 0;
	    aByteArray12120[++i] = (byte) 0;
	    aByteArray12120[++i] = (byte) 0;
	    aByteArray12120[++i] = (byte) 0;
	    aByteArray12120[++i] = (byte) 0;
	}
	while (i < aByteArray12120.length - 1)
	    aByteArray12120[++i] = (byte) 0;
    }
    
    boolean method18753(int i, int i_4_) {
	return aByteArray12120.length >= i * i_4_;
    }
    
    void method18754() {
	int i = -1;
	int i_5_ = aByteArray12120.length - 8;
	while (i < i_5_) {
	    aByteArray12120[++i] = (byte) 0;
	    aByteArray12120[++i] = (byte) 0;
	    aByteArray12120[++i] = (byte) 0;
	    aByteArray12120[++i] = (byte) 0;
	    aByteArray12120[++i] = (byte) 0;
	    aByteArray12120[++i] = (byte) 0;
	    aByteArray12120[++i] = (byte) 0;
	    aByteArray12120[++i] = (byte) 0;
	}
	while (i < aByteArray12120.length - 1)
	    aByteArray12120[++i] = (byte) 0;
    }
    
    void method18755(int i, int i_6_, int i_7_, int i_8_, int i_9_,
		     int i_10_) {
	int i_11_ = 0;
	if (i_6_ != i)
	    i_11_ = (i_9_ - i_8_ << 16) / (i_6_ - i);
	int i_12_ = 0;
	if (i_7_ != i_6_)
	    i_12_ = (i_10_ - i_9_ << 16) / (i_7_ - i_6_);
	int i_13_ = 0;
	if (i_7_ != i)
	    i_13_ = (i_8_ - i_10_ << 16) / (i - i_7_);
	if (i <= i_6_ && i <= i_7_) {
	    if (i_6_ < i_7_) {
		i_10_ = i_8_ <<= 16;
		if (i < 0) {
		    i_10_ -= i_13_ * i;
		    i_8_ -= i_11_ * i;
		    i = 0;
		}
		i_9_ <<= 16;
		if (i_6_ < 0) {
		    i_9_ -= i_12_ * i_6_;
		    i_6_ = 0;
		}
		if (i != i_6_ && i_13_ < i_11_ || i == i_6_ && i_13_ > i_12_) {
		    i_7_ -= i_6_;
		    i_6_ -= i;
		    i *= anInt12125;
		    while (--i_6_ >= 0) {
			method18760(aByteArray12120, i, 0, i_10_ >> 16,
				    i_8_ >> 16);
			i_10_ += i_13_;
			i_8_ += i_11_;
			i += anInt12125;
		    }
		    while (--i_7_ >= 0) {
			method18760(aByteArray12120, i, 0, i_10_ >> 16,
				    i_9_ >> 16);
			i_10_ += i_13_;
			i_9_ += i_12_;
			i += anInt12125;
		    }
		} else {
		    i_7_ -= i_6_;
		    i_6_ -= i;
		    i *= anInt12125;
		    while (--i_6_ >= 0) {
			method18760(aByteArray12120, i, 0, i_8_ >> 16,
				    i_10_ >> 16);
			i_10_ += i_13_;
			i_8_ += i_11_;
			i += anInt12125;
		    }
		    while (--i_7_ >= 0) {
			method18760(aByteArray12120, i, 0, i_9_ >> 16,
				    i_10_ >> 16);
			i_10_ += i_13_;
			i_9_ += i_12_;
			i += anInt12125;
		    }
		}
	    } else {
		i_9_ = i_8_ <<= 16;
		if (i < 0) {
		    i_9_ -= i_13_ * i;
		    i_8_ -= i_11_ * i;
		    i = 0;
		}
		i_10_ <<= 16;
		if (i_7_ < 0) {
		    i_10_ -= i_12_ * i_7_;
		    i_7_ = 0;
		}
		if (i != i_7_ && i_13_ < i_11_ || i == i_7_ && i_12_ > i_11_) {
		    i_6_ -= i_7_;
		    i_7_ -= i;
		    i *= anInt12125;
		    while (--i_7_ >= 0) {
			method18760(aByteArray12120, i, 0, i_9_ >> 16,
				    i_8_ >> 16);
			i_9_ += i_13_;
			i_8_ += i_11_;
			i += anInt12125;
		    }
		    while (--i_6_ >= 0) {
			method18760(aByteArray12120, i, 0, i_10_ >> 16,
				    i_8_ >> 16);
			i_10_ += i_12_;
			i_8_ += i_11_;
			i += anInt12125;
		    }
		} else {
		    i_6_ -= i_7_;
		    i_7_ -= i;
		    i *= anInt12125;
		    while (--i_7_ >= 0) {
			method18760(aByteArray12120, i, 0, i_8_ >> 16,
				    i_9_ >> 16);
			i_9_ += i_13_;
			i_8_ += i_11_;
			i += anInt12125;
		    }
		    while (--i_6_ >= 0) {
			method18760(aByteArray12120, i, 0, i_8_ >> 16,
				    i_10_ >> 16);
			i_10_ += i_12_;
			i_8_ += i_11_;
			i += anInt12125;
		    }
		}
	    }
	} else if (i_6_ <= i_7_) {
	    if (i_7_ < i) {
		i_8_ = i_9_ <<= 16;
		if (i_6_ < 0) {
		    i_8_ -= i_11_ * i_6_;
		    i_9_ -= i_12_ * i_6_;
		    i_6_ = 0;
		}
		i_10_ <<= 16;
		if (i_7_ < 0) {
		    i_10_ -= i_13_ * i_7_;
		    i_7_ = 0;
		}
		if (i_6_ != i_7_ && i_11_ < i_12_
		    || i_6_ == i_7_ && i_11_ > i_13_) {
		    i -= i_7_;
		    i_7_ -= i_6_;
		    i_6_ *= anInt12125;
		    while (--i_7_ >= 0) {
			method18760(aByteArray12120, i_6_, 0, i_8_ >> 16,
				    i_9_ >> 16);
			i_8_ += i_11_;
			i_9_ += i_12_;
			i_6_ += anInt12125;
		    }
		    while (--i >= 0) {
			method18760(aByteArray12120, i_6_, 0, i_8_ >> 16,
				    i_10_ >> 16);
			i_8_ += i_11_;
			i_10_ += i_13_;
			i_6_ += anInt12125;
		    }
		} else {
		    i -= i_7_;
		    i_7_ -= i_6_;
		    i_6_ *= anInt12125;
		    while (--i_7_ >= 0) {
			method18760(aByteArray12120, i_6_, 0, i_9_ >> 16,
				    i_8_ >> 16);
			i_8_ += i_11_;
			i_9_ += i_12_;
			i_6_ += anInt12125;
		    }
		    while (--i >= 0) {
			method18760(aByteArray12120, i_6_, 0, i_10_ >> 16,
				    i_8_ >> 16);
			i_8_ += i_11_;
			i_10_ += i_13_;
			i_6_ += anInt12125;
		    }
		}
	    } else {
		i_10_ = i_9_ <<= 16;
		if (i_6_ < 0) {
		    i_10_ -= i_11_ * i_6_;
		    i_9_ -= i_12_ * i_6_;
		    i_6_ = 0;
		}
		i_8_ <<= 16;
		if (i < 0) {
		    i_8_ -= i_13_ * i;
		    i = 0;
		}
		if (i_11_ < i_12_) {
		    i_7_ -= i;
		    i -= i_6_;
		    i_6_ *= anInt12125;
		    while (--i >= 0) {
			method18760(aByteArray12120, i_6_, 0, i_10_ >> 16,
				    i_9_ >> 16);
			i_10_ += i_11_;
			i_9_ += i_12_;
			i_6_ += anInt12125;
		    }
		    while (--i_7_ >= 0) {
			method18760(aByteArray12120, i_6_, 0, i_8_ >> 16,
				    i_9_ >> 16);
			i_8_ += i_13_;
			i_9_ += i_12_;
			i_6_ += anInt12125;
		    }
		} else {
		    i_7_ -= i;
		    i -= i_6_;
		    i_6_ *= anInt12125;
		    while (--i >= 0) {
			method18760(aByteArray12120, i_6_, 0, i_9_ >> 16,
				    i_10_ >> 16);
			i_10_ += i_11_;
			i_9_ += i_12_;
			i_6_ += anInt12125;
		    }
		    while (--i_7_ >= 0) {
			method18760(aByteArray12120, i_6_, 0, i_9_ >> 16,
				    i_8_ >> 16);
			i_8_ += i_13_;
			i_9_ += i_12_;
			i_6_ += anInt12125;
		    }
		}
	    }
	} else if (i < i_6_) {
	    i_9_ = i_10_ <<= 16;
	    if (i_7_ < 0) {
		i_9_ -= i_12_ * i_7_;
		i_10_ -= i_13_ * i_7_;
		i_7_ = 0;
	    }
	    i_8_ <<= 16;
	    if (i < 0) {
		i_8_ -= i_11_ * i;
		i = 0;
	    }
	    if (i_12_ < i_13_) {
		i_6_ -= i;
		i -= i_7_;
		i_7_ *= anInt12125;
		while (--i >= 0) {
		    method18760(aByteArray12120, i_7_, 0, i_9_ >> 16,
				i_10_ >> 16);
		    i_9_ += i_12_;
		    i_10_ += i_13_;
		    i_7_ += anInt12125;
		}
		while (--i_6_ >= 0) {
		    method18760(aByteArray12120, i_7_, 0, i_9_ >> 16,
				i_8_ >> 16);
		    i_9_ += i_12_;
		    i_8_ += i_11_;
		    i_7_ += anInt12125;
		}
	    } else {
		i_6_ -= i;
		i -= i_7_;
		i_7_ *= anInt12125;
		while (--i >= 0) {
		    method18760(aByteArray12120, i_7_, 0, i_10_ >> 16,
				i_9_ >> 16);
		    i_9_ += i_12_;
		    i_10_ += i_13_;
		    i_7_ += anInt12125;
		}
		while (--i_6_ >= 0) {
		    method18760(aByteArray12120, i_7_, 0, i_8_ >> 16,
				i_9_ >> 16);
		    i_9_ += i_12_;
		    i_8_ += i_11_;
		    i_7_ += anInt12125;
		}
	    }
	} else {
	    i_8_ = i_10_ <<= 16;
	    if (i_7_ < 0) {
		i_8_ -= i_12_ * i_7_;
		i_10_ -= i_13_ * i_7_;
		i_7_ = 0;
	    }
	    i_9_ <<= 16;
	    if (i_6_ < 0) {
		i_9_ -= i_11_ * i_6_;
		i_6_ = 0;
	    }
	    if (i_12_ < i_13_) {
		i -= i_6_;
		i_6_ -= i_7_;
		i_7_ *= anInt12125;
		while (--i_6_ >= 0) {
		    method18760(aByteArray12120, i_7_, 0, i_8_ >> 16,
				i_10_ >> 16);
		    i_8_ += i_12_;
		    i_10_ += i_13_;
		    i_7_ += anInt12125;
		}
		while (--i >= 0) {
		    method18760(aByteArray12120, i_7_, 0, i_9_ >> 16,
				i_10_ >> 16);
		    i_9_ += i_11_;
		    i_10_ += i_13_;
		    i_7_ += anInt12125;
		}
	    } else {
		i -= i_6_;
		i_6_ -= i_7_;
		i_7_ *= anInt12125;
		while (--i_6_ >= 0) {
		    method18760(aByteArray12120, i_7_, 0, i_10_ >> 16,
				i_8_ >> 16);
		    i_8_ += i_12_;
		    i_10_ += i_13_;
		    i_7_ += anInt12125;
		}
		while (--i >= 0) {
		    method18760(aByteArray12120, i_7_, 0, i_10_ >> 16,
				i_9_ >> 16);
		    i_9_ += i_11_;
		    i_10_ += i_13_;
		    i_7_ += anInt12125;
		}
	    }
	}
    }
    
    void method18756(int i, int i_14_, int i_15_, int i_16_) {
	anInt12123 = i;
	anInt12121 = i_14_;
	anInt12125 = i_15_ - i;
	anInt12122 = i_16_ - i_14_;
    }
    
    void method18757(int i, int i_17_, int i_18_, int i_19_) {
	anInt12123 = i;
	anInt12121 = i_17_;
	anInt12125 = i_18_ - i;
	anInt12122 = i_19_ - i_17_;
    }
    
    Class534_Sub18_Sub16_Sub2(Class185_Sub1 class185_sub1, int i, int i_20_) {
	aByteArray12120 = new byte[i * i_20_];
    }
    
    boolean method18758(int i, int i_21_) {
	return aByteArray12120.length >= i * i_21_;
    }
    
    void method18759() {
	int i = -1;
	int i_22_ = aByteArray12120.length - 8;
	while (i < i_22_) {
	    aByteArray12120[++i] = (byte) 0;
	    aByteArray12120[++i] = (byte) 0;
	    aByteArray12120[++i] = (byte) 0;
	    aByteArray12120[++i] = (byte) 0;
	    aByteArray12120[++i] = (byte) 0;
	    aByteArray12120[++i] = (byte) 0;
	    aByteArray12120[++i] = (byte) 0;
	    aByteArray12120[++i] = (byte) 0;
	}
	while (i < aByteArray12120.length - 1)
	    aByteArray12120[++i] = (byte) 0;
    }
    
    static final void method18760(byte[] is, int i, int i_23_, int i_24_,
				  int i_25_) {
	if (i_24_ < i_25_) {
	    i += i_24_;
	    i_23_ = i_25_ - i_24_ >> 2;
	    while (--i_23_ >= 0) {
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
	    }
	    i_23_ = i_25_ - i_24_ & 0x3;
	    while (--i_23_ >= 0)
		is[i++] = (byte) 1;
	}
    }
    
    void method18761(int i, int i_26_, int i_27_, int i_28_, int i_29_,
		     int i_30_) {
	int i_31_ = 0;
	if (i_26_ != i)
	    i_31_ = (i_29_ - i_28_ << 16) / (i_26_ - i);
	int i_32_ = 0;
	if (i_27_ != i_26_)
	    i_32_ = (i_30_ - i_29_ << 16) / (i_27_ - i_26_);
	int i_33_ = 0;
	if (i_27_ != i)
	    i_33_ = (i_28_ - i_30_ << 16) / (i - i_27_);
	if (i <= i_26_ && i <= i_27_) {
	    if (i_26_ < i_27_) {
		i_30_ = i_28_ <<= 16;
		if (i < 0) {
		    i_30_ -= i_33_ * i;
		    i_28_ -= i_31_ * i;
		    i = 0;
		}
		i_29_ <<= 16;
		if (i_26_ < 0) {
		    i_29_ -= i_32_ * i_26_;
		    i_26_ = 0;
		}
		if (i != i_26_ && i_33_ < i_31_
		    || i == i_26_ && i_33_ > i_32_) {
		    i_27_ -= i_26_;
		    i_26_ -= i;
		    i *= anInt12125;
		    while (--i_26_ >= 0) {
			method18760(aByteArray12120, i, 0, i_30_ >> 16,
				    i_28_ >> 16);
			i_30_ += i_33_;
			i_28_ += i_31_;
			i += anInt12125;
		    }
		    while (--i_27_ >= 0) {
			method18760(aByteArray12120, i, 0, i_30_ >> 16,
				    i_29_ >> 16);
			i_30_ += i_33_;
			i_29_ += i_32_;
			i += anInt12125;
		    }
		} else {
		    i_27_ -= i_26_;
		    i_26_ -= i;
		    i *= anInt12125;
		    while (--i_26_ >= 0) {
			method18760(aByteArray12120, i, 0, i_28_ >> 16,
				    i_30_ >> 16);
			i_30_ += i_33_;
			i_28_ += i_31_;
			i += anInt12125;
		    }
		    while (--i_27_ >= 0) {
			method18760(aByteArray12120, i, 0, i_29_ >> 16,
				    i_30_ >> 16);
			i_30_ += i_33_;
			i_29_ += i_32_;
			i += anInt12125;
		    }
		}
	    } else {
		i_29_ = i_28_ <<= 16;
		if (i < 0) {
		    i_29_ -= i_33_ * i;
		    i_28_ -= i_31_ * i;
		    i = 0;
		}
		i_30_ <<= 16;
		if (i_27_ < 0) {
		    i_30_ -= i_32_ * i_27_;
		    i_27_ = 0;
		}
		if (i != i_27_ && i_33_ < i_31_
		    || i == i_27_ && i_32_ > i_31_) {
		    i_26_ -= i_27_;
		    i_27_ -= i;
		    i *= anInt12125;
		    while (--i_27_ >= 0) {
			method18760(aByteArray12120, i, 0, i_29_ >> 16,
				    i_28_ >> 16);
			i_29_ += i_33_;
			i_28_ += i_31_;
			i += anInt12125;
		    }
		    while (--i_26_ >= 0) {
			method18760(aByteArray12120, i, 0, i_30_ >> 16,
				    i_28_ >> 16);
			i_30_ += i_32_;
			i_28_ += i_31_;
			i += anInt12125;
		    }
		} else {
		    i_26_ -= i_27_;
		    i_27_ -= i;
		    i *= anInt12125;
		    while (--i_27_ >= 0) {
			method18760(aByteArray12120, i, 0, i_28_ >> 16,
				    i_29_ >> 16);
			i_29_ += i_33_;
			i_28_ += i_31_;
			i += anInt12125;
		    }
		    while (--i_26_ >= 0) {
			method18760(aByteArray12120, i, 0, i_28_ >> 16,
				    i_30_ >> 16);
			i_30_ += i_32_;
			i_28_ += i_31_;
			i += anInt12125;
		    }
		}
	    }
	} else if (i_26_ <= i_27_) {
	    if (i_27_ < i) {
		i_28_ = i_29_ <<= 16;
		if (i_26_ < 0) {
		    i_28_ -= i_31_ * i_26_;
		    i_29_ -= i_32_ * i_26_;
		    i_26_ = 0;
		}
		i_30_ <<= 16;
		if (i_27_ < 0) {
		    i_30_ -= i_33_ * i_27_;
		    i_27_ = 0;
		}
		if (i_26_ != i_27_ && i_31_ < i_32_
		    || i_26_ == i_27_ && i_31_ > i_33_) {
		    i -= i_27_;
		    i_27_ -= i_26_;
		    i_26_ *= anInt12125;
		    while (--i_27_ >= 0) {
			method18760(aByteArray12120, i_26_, 0, i_28_ >> 16,
				    i_29_ >> 16);
			i_28_ += i_31_;
			i_29_ += i_32_;
			i_26_ += anInt12125;
		    }
		    while (--i >= 0) {
			method18760(aByteArray12120, i_26_, 0, i_28_ >> 16,
				    i_30_ >> 16);
			i_28_ += i_31_;
			i_30_ += i_33_;
			i_26_ += anInt12125;
		    }
		} else {
		    i -= i_27_;
		    i_27_ -= i_26_;
		    i_26_ *= anInt12125;
		    while (--i_27_ >= 0) {
			method18760(aByteArray12120, i_26_, 0, i_29_ >> 16,
				    i_28_ >> 16);
			i_28_ += i_31_;
			i_29_ += i_32_;
			i_26_ += anInt12125;
		    }
		    while (--i >= 0) {
			method18760(aByteArray12120, i_26_, 0, i_30_ >> 16,
				    i_28_ >> 16);
			i_28_ += i_31_;
			i_30_ += i_33_;
			i_26_ += anInt12125;
		    }
		}
	    } else {
		i_30_ = i_29_ <<= 16;
		if (i_26_ < 0) {
		    i_30_ -= i_31_ * i_26_;
		    i_29_ -= i_32_ * i_26_;
		    i_26_ = 0;
		}
		i_28_ <<= 16;
		if (i < 0) {
		    i_28_ -= i_33_ * i;
		    i = 0;
		}
		if (i_31_ < i_32_) {
		    i_27_ -= i;
		    i -= i_26_;
		    i_26_ *= anInt12125;
		    while (--i >= 0) {
			method18760(aByteArray12120, i_26_, 0, i_30_ >> 16,
				    i_29_ >> 16);
			i_30_ += i_31_;
			i_29_ += i_32_;
			i_26_ += anInt12125;
		    }
		    while (--i_27_ >= 0) {
			method18760(aByteArray12120, i_26_, 0, i_28_ >> 16,
				    i_29_ >> 16);
			i_28_ += i_33_;
			i_29_ += i_32_;
			i_26_ += anInt12125;
		    }
		} else {
		    i_27_ -= i;
		    i -= i_26_;
		    i_26_ *= anInt12125;
		    while (--i >= 0) {
			method18760(aByteArray12120, i_26_, 0, i_29_ >> 16,
				    i_30_ >> 16);
			i_30_ += i_31_;
			i_29_ += i_32_;
			i_26_ += anInt12125;
		    }
		    while (--i_27_ >= 0) {
			method18760(aByteArray12120, i_26_, 0, i_29_ >> 16,
				    i_28_ >> 16);
			i_28_ += i_33_;
			i_29_ += i_32_;
			i_26_ += anInt12125;
		    }
		}
	    }
	} else if (i < i_26_) {
	    i_29_ = i_30_ <<= 16;
	    if (i_27_ < 0) {
		i_29_ -= i_32_ * i_27_;
		i_30_ -= i_33_ * i_27_;
		i_27_ = 0;
	    }
	    i_28_ <<= 16;
	    if (i < 0) {
		i_28_ -= i_31_ * i;
		i = 0;
	    }
	    if (i_32_ < i_33_) {
		i_26_ -= i;
		i -= i_27_;
		i_27_ *= anInt12125;
		while (--i >= 0) {
		    method18760(aByteArray12120, i_27_, 0, i_29_ >> 16,
				i_30_ >> 16);
		    i_29_ += i_32_;
		    i_30_ += i_33_;
		    i_27_ += anInt12125;
		}
		while (--i_26_ >= 0) {
		    method18760(aByteArray12120, i_27_, 0, i_29_ >> 16,
				i_28_ >> 16);
		    i_29_ += i_32_;
		    i_28_ += i_31_;
		    i_27_ += anInt12125;
		}
	    } else {
		i_26_ -= i;
		i -= i_27_;
		i_27_ *= anInt12125;
		while (--i >= 0) {
		    method18760(aByteArray12120, i_27_, 0, i_30_ >> 16,
				i_29_ >> 16);
		    i_29_ += i_32_;
		    i_30_ += i_33_;
		    i_27_ += anInt12125;
		}
		while (--i_26_ >= 0) {
		    method18760(aByteArray12120, i_27_, 0, i_28_ >> 16,
				i_29_ >> 16);
		    i_29_ += i_32_;
		    i_28_ += i_31_;
		    i_27_ += anInt12125;
		}
	    }
	} else {
	    i_28_ = i_30_ <<= 16;
	    if (i_27_ < 0) {
		i_28_ -= i_32_ * i_27_;
		i_30_ -= i_33_ * i_27_;
		i_27_ = 0;
	    }
	    i_29_ <<= 16;
	    if (i_26_ < 0) {
		i_29_ -= i_31_ * i_26_;
		i_26_ = 0;
	    }
	    if (i_32_ < i_33_) {
		i -= i_26_;
		i_26_ -= i_27_;
		i_27_ *= anInt12125;
		while (--i_26_ >= 0) {
		    method18760(aByteArray12120, i_27_, 0, i_28_ >> 16,
				i_30_ >> 16);
		    i_28_ += i_32_;
		    i_30_ += i_33_;
		    i_27_ += anInt12125;
		}
		while (--i >= 0) {
		    method18760(aByteArray12120, i_27_, 0, i_29_ >> 16,
				i_30_ >> 16);
		    i_29_ += i_31_;
		    i_30_ += i_33_;
		    i_27_ += anInt12125;
		}
	    } else {
		i -= i_26_;
		i_26_ -= i_27_;
		i_27_ *= anInt12125;
		while (--i_26_ >= 0) {
		    method18760(aByteArray12120, i_27_, 0, i_30_ >> 16,
				i_28_ >> 16);
		    i_28_ += i_32_;
		    i_30_ += i_33_;
		    i_27_ += anInt12125;
		}
		while (--i >= 0) {
		    method18760(aByteArray12120, i_27_, 0, i_30_ >> 16,
				i_29_ >> 16);
		    i_29_ += i_31_;
		    i_30_ += i_33_;
		    i_27_ += anInt12125;
		}
	    }
	}
    }
}
