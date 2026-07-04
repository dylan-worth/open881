/* Class558 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class558
{
    static final int anInt7487 = 2;
    static final int anInt7488 = 8;
    static final int anInt7489 = 39424;
    static final int anInt7490 = 1;
    Class552 aClass552_7491;
    static final int anInt7492 = 12;
    int anInt7493;
    int anInt7494 = 0;
    static final int anInt7495 = 2014;
    static final int anInt7496 = -2014;
    
    final boolean method9412(int[] is, int i, int i_0_, int i_1_, int i_2_,
			     int i_3_, int i_4_, int i_5_) {
	if (i_2_ > i_5_)
	    i_2_ = i_5_;
	if (i_1_ < 0)
	    i_1_ = 0;
	if (i_1_ >= i_2_)
	    return true;
	i += i_1_ - 1;
	i_0_ = i_2_ - i_1_ >> 2;
	i_3_ += i_4_ * i_1_;
	if (anInt7493 == 1) {
	    anInt7494 += i_0_;
	    while (--i_0_ >= 0) {
		if (i_3_ < is[++i])
		    is[i] = i_3_;
		i_3_ += i_4_;
		if (i_3_ < is[++i])
		    is[i] = i_3_;
		i_3_ += i_4_;
		if (i_3_ < is[++i])
		    is[i] = i_3_;
		i_3_ += i_4_;
		if (i_3_ < is[++i])
		    is[i] = i_3_;
		i_3_ += i_4_;
	    }
	    i_0_ = i_2_ - i_1_ & 0x3;
	    while (--i_0_ >= 0) {
		if (i_3_ < is[++i])
		    is[i] = i_3_;
		i_3_ += i_4_;
	    }
	} else {
	    i_3_ -= 39424;
	    while (--i_0_ >= 0) {
		if (i_3_ < is[++i])
		    return false;
		i_3_ += i_4_;
		if (i_3_ < is[++i])
		    return false;
		i_3_ += i_4_;
		if (i_3_ < is[++i])
		    return false;
		i_3_ += i_4_;
		if (i_3_ < is[++i])
		    return false;
		i_3_ += i_4_;
	    }
	    i_0_ = i_2_ - i_1_ & 0x3;
	    while (--i_0_ >= 0) {
		if (i_3_ < is[++i])
		    return false;
		i_3_ += i_4_;
	    }
	}
	return true;
    }
    
    final boolean method9413(int i, int i_6_, int i_7_, int i_8_, int i_9_,
			     int i_10_, int i_11_, int i_12_, int i_13_) {
	if (i > 2014 || i_6_ > 2014 || i_7_ > 2014 || i_8_ > 2014
	    || i_9_ > 2014 || i_10_ > 2014)
	    return false;
	if (i < -2014 || i_6_ < -2014 || i_7_ < -2014 || i_8_ < -2014
	    || i_9_ < -2014 || i_10_ < -2014)
	    return false;
	if (anInt7493 == 2) {
	    int i_14_ = i_8_ + i * aClass552_7491.anInt7337;
	    if (i_14_ >= 0 && i_14_ < aClass552_7491.anIntArray7333.length
		&& (i_11_ << 8) - 39424 < aClass552_7491.anIntArray7333[i_14_])
		return false;
	    i_14_ = i_9_ + i_6_ * aClass552_7491.anInt7337;
	    if (i_14_ >= 0 && i_14_ < aClass552_7491.anIntArray7333.length
		&& (i_12_ << 8) - 39424 < aClass552_7491.anIntArray7333[i_14_])
		return false;
	    i_14_ = i_10_ + i_7_ * aClass552_7491.anInt7337;
	    if (i_14_ >= 0 && i_14_ < aClass552_7491.anIntArray7333.length
		&& (i_13_ << 8) - 39424 < aClass552_7491.anIntArray7333[i_14_])
		return false;
	}
	int i_15_ = i_9_ - i_8_;
	int i_16_ = i_6_ - i;
	int i_17_ = i_10_ - i_8_;
	int i_18_ = i_7_ - i;
	int i_19_ = i_12_ - i_11_;
	int i_20_ = i_13_ - i_11_;
	if (i < i_6_ && i < i_7_) {
	    i--;
	    if (i_6_ > i_7_)
		i_6_++;
	    else
		i_7_++;
	} else if (i_6_ < i_7_) {
	    i_6_--;
	    if (i > i_7_)
		i++;
	    else
		i_7_++;
	} else {
	    i_7_--;
	    if (i > i_6_)
		i++;
	    else
		i_6_++;
	}
	int i_21_ = 0;
	if (i_6_ != i)
	    i_21_ = (i_9_ - i_8_ << 12) / (i_6_ - i);
	int i_22_ = 0;
	if (i_7_ != i_6_)
	    i_22_ = (i_10_ - i_9_ << 12) / (i_7_ - i_6_);
	int i_23_ = 0;
	if (i_7_ != i)
	    i_23_ = (i_8_ - i_10_ << 12) / (i - i_7_);
	int i_24_ = i_15_ * i_18_ - i_17_ * i_16_;
	if (i_24_ == 0)
	    return false;
	int i_25_ = (i_19_ * i_18_ - i_20_ * i_16_ << 8) / i_24_;
	int i_26_ = (i_20_ * i_15_ - i_19_ * i_17_ << 8) / i_24_;
	if (i <= i_6_ && i <= i_7_) {
	    if (i >= aClass552_7491.anInt7309)
		return true;
	    if (i_6_ > aClass552_7491.anInt7309)
		i_6_ = aClass552_7491.anInt7309;
	    if (i_7_ > aClass552_7491.anInt7309)
		i_7_ = aClass552_7491.anInt7309;
	    i_11_ = (i_11_ << 8) - i_25_ * i_8_ + i_25_;
	    if (i_6_ < i_7_) {
		i_10_ = i_8_ <<= 12;
		if (i < 0) {
		    i_10_ -= i_23_ * i;
		    i_8_ -= i_21_ * i;
		    i_11_ -= i_26_ * i;
		    i = 0;
		}
		i_9_ <<= 12;
		if (i_6_ < 0) {
		    i_9_ -= i_22_ * i_6_;
		    i_6_ = 0;
		}
		if (i != i_6_ && i_23_ < i_21_ || i == i_6_ && i_23_ > i_22_) {
		    i_7_ -= i_6_;
		    i_6_ -= i;
		    i *= aClass552_7491.anInt7337;
		    while (--i_6_ >= 0) {
			if (!method9414(aClass552_7491.anIntArray7333, i, 0,
					(i_10_ >> 12) - 1, (i_8_ >> 12) + 1,
					i_11_, i_25_,
					aClass552_7491.anInt7337))
			    return false;
			i_10_ += i_23_;
			i_8_ += i_21_;
			i_11_ += i_26_;
			i += aClass552_7491.anInt7337;
		    }
		    while (--i_7_ >= 0) {
			if (!method9414(aClass552_7491.anIntArray7333, i, 0,
					(i_10_ >> 12) - 1, (i_9_ >> 12) + 1,
					i_11_, i_25_,
					aClass552_7491.anInt7337))
			    return false;
			i_10_ += i_23_;
			i_9_ += i_22_;
			i_11_ += i_26_;
			i += aClass552_7491.anInt7337;
		    }
		    return true;
		}
		i_7_ -= i_6_;
		i_6_ -= i;
		i *= aClass552_7491.anInt7337;
		while (--i_6_ >= 0) {
		    if (!method9414(aClass552_7491.anIntArray7333, i, 0,
				    (i_8_ >> 12) - 1, (i_10_ >> 12) + 1, i_11_,
				    i_25_, aClass552_7491.anInt7337))
			return false;
		    i_10_ += i_23_;
		    i_8_ += i_21_;
		    i_11_ += i_26_;
		    i += aClass552_7491.anInt7337;
		}
		while (--i_7_ >= 0) {
		    if (!method9414(aClass552_7491.anIntArray7333, i, 0,
				    (i_9_ >> 12) - 1, (i_10_ >> 12) + 1, i_11_,
				    i_25_, aClass552_7491.anInt7337))
			return false;
		    i_10_ += i_23_;
		    i_9_ += i_22_;
		    i_11_ += i_26_;
		    i += aClass552_7491.anInt7337;
		}
		return true;
	    }
	    i_9_ = i_8_ <<= 12;
	    if (i < 0) {
		i_9_ -= i_23_ * i;
		i_8_ -= i_21_ * i;
		i_11_ -= i_26_ * i;
		i = 0;
	    }
	    i_10_ <<= 12;
	    if (i_7_ < 0) {
		i_10_ -= i_22_ * i_7_;
		i_7_ = 0;
	    }
	    if (i != i_7_ && i_23_ < i_21_ || i == i_7_ && i_22_ > i_21_) {
		i_6_ -= i_7_;
		i_7_ -= i;
		i *= aClass552_7491.anInt7337;
		while (--i_7_ >= 0) {
		    if (!method9414(aClass552_7491.anIntArray7333, i, 0,
				    (i_9_ >> 12) - 1, (i_8_ >> 12) + 1, i_11_,
				    i_25_, aClass552_7491.anInt7337))
			return false;
		    i_9_ += i_23_;
		    i_8_ += i_21_;
		    i_11_ += i_26_;
		    i += aClass552_7491.anInt7337;
		}
		while (--i_6_ >= 0) {
		    if (!method9414(aClass552_7491.anIntArray7333, i, 0,
				    (i_10_ >> 12) - 1, (i_8_ >> 12) + 1, i_11_,
				    i_25_, aClass552_7491.anInt7337))
			return false;
		    i_10_ += i_22_;
		    i_8_ += i_21_;
		    i_11_ += i_26_;
		    i += aClass552_7491.anInt7337;
		}
		return true;
	    }
	    i_6_ -= i_7_;
	    i_7_ -= i;
	    i *= aClass552_7491.anInt7337;
	    while (--i_7_ >= 0) {
		if (!method9414(aClass552_7491.anIntArray7333, i, 0,
				(i_8_ >> 12) - 1, (i_9_ >> 12) + 1, i_11_,
				i_25_, aClass552_7491.anInt7337))
		    return false;
		i_9_ += i_23_;
		i_8_ += i_21_;
		i_11_ += i_26_;
		i += aClass552_7491.anInt7337;
	    }
	    while (--i_6_ >= 0) {
		if (!method9414(aClass552_7491.anIntArray7333, i, 0,
				(i_8_ >> 12) - 1, (i_10_ >> 12) + 1, i_11_,
				i_25_, aClass552_7491.anInt7337))
		    return false;
		i_10_ += i_22_;
		i_8_ += i_21_;
		i_11_ += i_26_;
		i += aClass552_7491.anInt7337;
	    }
	    return true;
	}
	if (i_6_ <= i_7_) {
	    if (i_6_ >= aClass552_7491.anInt7309)
		return true;
	    if (i_7_ > aClass552_7491.anInt7309)
		i_7_ = aClass552_7491.anInt7309;
	    if (i > aClass552_7491.anInt7309)
		i = aClass552_7491.anInt7309;
	    i_12_ = (i_12_ << 8) - i_25_ * i_9_ + i_25_;
	    if (i_7_ < i) {
		i_8_ = i_9_ <<= 12;
		if (i_6_ < 0) {
		    i_8_ -= i_21_ * i_6_;
		    i_9_ -= i_22_ * i_6_;
		    i_12_ -= i_26_ * i_6_;
		    i_6_ = 0;
		}
		i_10_ <<= 12;
		if (i_7_ < 0) {
		    i_10_ -= i_23_ * i_7_;
		    i_7_ = 0;
		}
		if (i_6_ != i_7_ && i_21_ < i_22_
		    || i_6_ == i_7_ && i_21_ > i_23_) {
		    i -= i_7_;
		    i_7_ -= i_6_;
		    i_6_ *= aClass552_7491.anInt7337;
		    while (--i_7_ >= 0) {
			if (!method9414(aClass552_7491.anIntArray7333, i_6_, 0,
					(i_8_ >> 12) - 1, (i_9_ >> 12) + 1,
					i_12_, i_25_,
					aClass552_7491.anInt7337))
			    return false;
			i_8_ += i_21_;
			i_9_ += i_22_;
			i_12_ += i_26_;
			i_6_ += aClass552_7491.anInt7337;
		    }
		    while (--i >= 0) {
			if (!method9414(aClass552_7491.anIntArray7333, i_6_, 0,
					(i_8_ >> 12) - 1, (i_10_ >> 12) + 1,
					i_12_, i_25_,
					aClass552_7491.anInt7337))
			    return false;
			i_8_ += i_21_;
			i_10_ += i_23_;
			i_12_ += i_26_;
			i_6_ += aClass552_7491.anInt7337;
		    }
		    return true;
		}
		i -= i_7_;
		i_7_ -= i_6_;
		i_6_ *= aClass552_7491.anInt7337;
		while (--i_7_ >= 0) {
		    if (!method9414(aClass552_7491.anIntArray7333, i_6_, 0,
				    (i_9_ >> 12) - 1, (i_8_ >> 12) + 1, i_12_,
				    i_25_, aClass552_7491.anInt7337))
			return false;
		    i_8_ += i_21_;
		    i_9_ += i_22_;
		    i_12_ += i_26_;
		    i_6_ += aClass552_7491.anInt7337;
		}
		while (--i >= 0) {
		    if (!method9414(aClass552_7491.anIntArray7333, i_6_, 0,
				    (i_10_ >> 12) - 1, (i_8_ >> 12) + 1, i_12_,
				    i_25_, aClass552_7491.anInt7337))
			return false;
		    i_8_ += i_21_;
		    i_10_ += i_23_;
		    i_12_ += i_26_;
		    i_6_ += aClass552_7491.anInt7337;
		}
		return true;
	    }
	    i_10_ = i_9_ <<= 12;
	    if (i_6_ < 0) {
		i_10_ -= i_21_ * i_6_;
		i_9_ -= i_22_ * i_6_;
		i_12_ -= i_26_ * i_6_;
		i_6_ = 0;
	    }
	    i_8_ <<= 12;
	    if (i < 0) {
		i_8_ -= i_23_ * i;
		i = 0;
	    }
	    if (i_21_ < i_22_) {
		i_7_ -= i;
		i -= i_6_;
		i_6_ *= aClass552_7491.anInt7337;
		while (--i >= 0) {
		    if (!method9414(aClass552_7491.anIntArray7333, i_6_, 0,
				    (i_10_ >> 12) - 1, (i_9_ >> 12) + 1, i_12_,
				    i_25_, aClass552_7491.anInt7337))
			return false;
		    i_10_ += i_21_;
		    i_9_ += i_22_;
		    i_12_ += i_26_;
		    i_6_ += aClass552_7491.anInt7337;
		}
		while (--i_7_ >= 0) {
		    if (!method9414(aClass552_7491.anIntArray7333, i_6_, 0,
				    (i_8_ >> 12) - 1, (i_9_ >> 12) + 1, i_12_,
				    i_25_, aClass552_7491.anInt7337))
			return false;
		    i_8_ += i_23_;
		    i_9_ += i_22_;
		    i_12_ += i_26_;
		    i_6_ += aClass552_7491.anInt7337;
		}
		return true;
	    }
	    i_7_ -= i;
	    i -= i_6_;
	    i_6_ *= aClass552_7491.anInt7337;
	    while (--i >= 0) {
		if (!method9414(aClass552_7491.anIntArray7333, i_6_, 0,
				(i_9_ >> 12) - 1, (i_10_ >> 12) + 1, i_12_,
				i_25_, aClass552_7491.anInt7337))
		    return false;
		i_10_ += i_21_;
		i_9_ += i_22_;
		i_12_ += i_26_;
		i_6_ += aClass552_7491.anInt7337;
	    }
	    while (--i_7_ >= 0) {
		if (!method9414(aClass552_7491.anIntArray7333, i_6_, 0,
				(i_9_ >> 12) - 1, (i_8_ >> 12) + 1, i_12_,
				i_25_, aClass552_7491.anInt7337))
		    return false;
		i_8_ += i_23_;
		i_9_ += i_22_;
		i_12_ += i_26_;
		i_6_ += aClass552_7491.anInt7337;
	    }
	    return true;
	}
	if (i_7_ >= aClass552_7491.anInt7309)
	    return true;
	if (i > aClass552_7491.anInt7309)
	    i = aClass552_7491.anInt7309;
	if (i_6_ > aClass552_7491.anInt7309)
	    i_6_ = aClass552_7491.anInt7309;
	i_13_ = (i_13_ << 8) - i_25_ * i_10_ + i_25_;
	if (i < i_6_) {
	    i_9_ = i_10_ <<= 12;
	    if (i_7_ < 0) {
		i_9_ -= i_22_ * i_7_;
		i_10_ -= i_23_ * i_7_;
		i_13_ -= i_26_ * i_7_;
		i_7_ = 0;
	    }
	    i_8_ <<= 12;
	    if (i < 0) {
		i_8_ -= i_21_ * i;
		i = 0;
	    }
	    if (i_22_ < i_23_) {
		i_6_ -= i;
		i -= i_7_;
		i_7_ *= aClass552_7491.anInt7337;
		while (--i >= 0) {
		    if (!method9414(aClass552_7491.anIntArray7333, i_7_, 0,
				    (i_9_ >> 12) - 1, (i_10_ >> 12) + 1, i_13_,
				    i_25_, aClass552_7491.anInt7337))
			return false;
		    i_9_ += i_22_;
		    i_10_ += i_23_;
		    i_13_ += i_26_;
		    i_7_ += aClass552_7491.anInt7337;
		}
		while (--i_6_ >= 0) {
		    if (!method9414(aClass552_7491.anIntArray7333, i_7_, 0,
				    (i_9_ >> 12) - 1, (i_8_ >> 12) + 1, i_13_,
				    i_25_, aClass552_7491.anInt7337))
			return false;
		    i_9_ += i_22_;
		    i_8_ += i_21_;
		    i_13_ += i_26_;
		    i_7_ += aClass552_7491.anInt7337;
		}
		return true;
	    }
	    i_6_ -= i;
	    i -= i_7_;
	    i_7_ *= aClass552_7491.anInt7337;
	    while (--i >= 0) {
		if (!method9414(aClass552_7491.anIntArray7333, i_7_, 0,
				(i_10_ >> 12) - 1, (i_9_ >> 12) + 1, i_13_,
				i_25_, aClass552_7491.anInt7337))
		    return false;
		i_9_ += i_22_;
		i_10_ += i_23_;
		i_13_ += i_26_;
		i_7_ += aClass552_7491.anInt7337;
	    }
	    while (--i_6_ >= 0) {
		if (!method9414(aClass552_7491.anIntArray7333, i_7_, 0,
				(i_8_ >> 12) - 1, (i_9_ >> 12) + 1, i_13_,
				i_25_, aClass552_7491.anInt7337))
		    return false;
		i_9_ += i_22_;
		i_8_ += i_21_;
		i_13_ += i_26_;
		i_7_ += aClass552_7491.anInt7337;
	    }
	    return true;
	}
	i_8_ = i_10_ <<= 12;
	if (i_7_ < 0) {
	    i_8_ -= i_22_ * i_7_;
	    i_10_ -= i_23_ * i_7_;
	    i_13_ -= i_26_ * i_7_;
	    i_7_ = 0;
	}
	i_9_ <<= 12;
	if (i_6_ < 0) {
	    i_9_ -= i_21_ * i_6_;
	    i_6_ = 0;
	}
	if (i_22_ < i_23_) {
	    i -= i_6_;
	    i_6_ -= i_7_;
	    i_7_ *= aClass552_7491.anInt7337;
	    while (--i_6_ >= 0) {
		if (!method9414(aClass552_7491.anIntArray7333, i_7_, 0,
				(i_8_ >> 12) - 1, (i_10_ >> 12) + 1, i_13_,
				i_25_, aClass552_7491.anInt7337))
		    return false;
		i_8_ += i_22_;
		i_10_ += i_23_;
		i_13_ += i_26_;
		i_7_ += aClass552_7491.anInt7337;
	    }
	    while (--i >= 0) {
		if (!method9414(aClass552_7491.anIntArray7333, i_7_, 0,
				(i_9_ >> 12) - 1, (i_10_ >> 12) + 1, i_13_,
				i_25_, aClass552_7491.anInt7337))
		    return false;
		i_9_ += i_21_;
		i_10_ += i_23_;
		i_13_ += i_26_;
		i_7_ += aClass552_7491.anInt7337;
	    }
	    return true;
	}
	i -= i_6_;
	i_6_ -= i_7_;
	i_7_ *= aClass552_7491.anInt7337;
	while (--i_6_ >= 0) {
	    if (!method9414(aClass552_7491.anIntArray7333, i_7_, 0,
			    (i_10_ >> 12) - 1, (i_8_ >> 12) + 1, i_13_, i_25_,
			    aClass552_7491.anInt7337))
		return false;
	    i_8_ += i_22_;
	    i_10_ += i_23_;
	    i_13_ += i_26_;
	    i_7_ += aClass552_7491.anInt7337;
	}
	while (--i >= 0) {
	    if (!method9414(aClass552_7491.anIntArray7333, i_7_, 0,
			    (i_10_ >> 12) - 1, (i_9_ >> 12) + 1, i_13_, i_25_,
			    aClass552_7491.anInt7337))
		return false;
	    i_9_ += i_21_;
	    i_10_ += i_23_;
	    i_13_ += i_26_;
	    i_7_ += aClass552_7491.anInt7337;
	}
	return true;
    }
    
    final boolean method9414(int[] is, int i, int i_27_, int i_28_, int i_29_,
			     int i_30_, int i_31_, int i_32_) {
	if (i_29_ > i_32_)
	    i_29_ = i_32_;
	if (i_28_ < 0)
	    i_28_ = 0;
	if (i_28_ >= i_29_)
	    return true;
	i += i_28_ - 1;
	i_27_ = i_29_ - i_28_ >> 2;
	i_30_ += i_31_ * i_28_;
	if (anInt7493 == 1) {
	    anInt7494 += i_27_;
	    while (--i_27_ >= 0) {
		if (i_30_ < is[++i])
		    is[i] = i_30_;
		i_30_ += i_31_;
		if (i_30_ < is[++i])
		    is[i] = i_30_;
		i_30_ += i_31_;
		if (i_30_ < is[++i])
		    is[i] = i_30_;
		i_30_ += i_31_;
		if (i_30_ < is[++i])
		    is[i] = i_30_;
		i_30_ += i_31_;
	    }
	    i_27_ = i_29_ - i_28_ & 0x3;
	    while (--i_27_ >= 0) {
		if (i_30_ < is[++i])
		    is[i] = i_30_;
		i_30_ += i_31_;
	    }
	} else {
	    i_30_ -= 39424;
	    while (--i_27_ >= 0) {
		if (i_30_ < is[++i])
		    return false;
		i_30_ += i_31_;
		if (i_30_ < is[++i])
		    return false;
		i_30_ += i_31_;
		if (i_30_ < is[++i])
		    return false;
		i_30_ += i_31_;
		if (i_30_ < is[++i])
		    return false;
		i_30_ += i_31_;
	    }
	    i_27_ = i_29_ - i_28_ & 0x3;
	    while (--i_27_ >= 0) {
		if (i_30_ < is[++i])
		    return false;
		i_30_ += i_31_;
	    }
	}
	return true;
    }
    
    final boolean method9415(int[] is, int i, int i_33_, int i_34_, int i_35_,
			     int i_36_, int i_37_, int i_38_) {
	if (i_35_ > i_38_)
	    i_35_ = i_38_;
	if (i_34_ < 0)
	    i_34_ = 0;
	if (i_34_ >= i_35_)
	    return true;
	i += i_34_ - 1;
	i_33_ = i_35_ - i_34_ >> 2;
	i_36_ += i_37_ * i_34_;
	if (anInt7493 == 1) {
	    anInt7494 += i_33_;
	    while (--i_33_ >= 0) {
		if (i_36_ < is[++i])
		    is[i] = i_36_;
		i_36_ += i_37_;
		if (i_36_ < is[++i])
		    is[i] = i_36_;
		i_36_ += i_37_;
		if (i_36_ < is[++i])
		    is[i] = i_36_;
		i_36_ += i_37_;
		if (i_36_ < is[++i])
		    is[i] = i_36_;
		i_36_ += i_37_;
	    }
	    i_33_ = i_35_ - i_34_ & 0x3;
	    while (--i_33_ >= 0) {
		if (i_36_ < is[++i])
		    is[i] = i_36_;
		i_36_ += i_37_;
	    }
	} else {
	    i_36_ -= 39424;
	    while (--i_33_ >= 0) {
		if (i_36_ < is[++i])
		    return false;
		i_36_ += i_37_;
		if (i_36_ < is[++i])
		    return false;
		i_36_ += i_37_;
		if (i_36_ < is[++i])
		    return false;
		i_36_ += i_37_;
		if (i_36_ < is[++i])
		    return false;
		i_36_ += i_37_;
	    }
	    i_33_ = i_35_ - i_34_ & 0x3;
	    while (--i_33_ >= 0) {
		if (i_36_ < is[++i])
		    return false;
		i_36_ += i_37_;
	    }
	}
	return true;
    }
    
    final boolean method9416(int[] is, int i, int i_39_, int i_40_, int i_41_,
			     int i_42_, int i_43_, int i_44_) {
	if (i_41_ > i_44_)
	    i_41_ = i_44_;
	if (i_40_ < 0)
	    i_40_ = 0;
	if (i_40_ >= i_41_)
	    return true;
	i += i_40_ - 1;
	i_39_ = i_41_ - i_40_ >> 2;
	i_42_ += i_43_ * i_40_;
	if (anInt7493 == 1) {
	    anInt7494 += i_39_;
	    while (--i_39_ >= 0) {
		if (i_42_ < is[++i])
		    is[i] = i_42_;
		i_42_ += i_43_;
		if (i_42_ < is[++i])
		    is[i] = i_42_;
		i_42_ += i_43_;
		if (i_42_ < is[++i])
		    is[i] = i_42_;
		i_42_ += i_43_;
		if (i_42_ < is[++i])
		    is[i] = i_42_;
		i_42_ += i_43_;
	    }
	    i_39_ = i_41_ - i_40_ & 0x3;
	    while (--i_39_ >= 0) {
		if (i_42_ < is[++i])
		    is[i] = i_42_;
		i_42_ += i_43_;
	    }
	} else {
	    i_42_ -= 39424;
	    while (--i_39_ >= 0) {
		if (i_42_ < is[++i])
		    return false;
		i_42_ += i_43_;
		if (i_42_ < is[++i])
		    return false;
		i_42_ += i_43_;
		if (i_42_ < is[++i])
		    return false;
		i_42_ += i_43_;
		if (i_42_ < is[++i])
		    return false;
		i_42_ += i_43_;
	    }
	    i_39_ = i_41_ - i_40_ & 0x3;
	    while (--i_39_ >= 0) {
		if (i_42_ < is[++i])
		    return false;
		i_42_ += i_43_;
	    }
	}
	return true;
    }
    
    final boolean method9417(int[] is, int i, int i_45_, int i_46_, int i_47_,
			     int i_48_, int i_49_, int i_50_) {
	if (i_47_ > i_50_)
	    i_47_ = i_50_;
	if (i_46_ < 0)
	    i_46_ = 0;
	if (i_46_ >= i_47_)
	    return true;
	i += i_46_ - 1;
	i_45_ = i_47_ - i_46_ >> 2;
	i_48_ += i_49_ * i_46_;
	if (anInt7493 == 1) {
	    anInt7494 += i_45_;
	    while (--i_45_ >= 0) {
		if (i_48_ < is[++i])
		    is[i] = i_48_;
		i_48_ += i_49_;
		if (i_48_ < is[++i])
		    is[i] = i_48_;
		i_48_ += i_49_;
		if (i_48_ < is[++i])
		    is[i] = i_48_;
		i_48_ += i_49_;
		if (i_48_ < is[++i])
		    is[i] = i_48_;
		i_48_ += i_49_;
	    }
	    i_45_ = i_47_ - i_46_ & 0x3;
	    while (--i_45_ >= 0) {
		if (i_48_ < is[++i])
		    is[i] = i_48_;
		i_48_ += i_49_;
	    }
	} else {
	    i_48_ -= 39424;
	    while (--i_45_ >= 0) {
		if (i_48_ < is[++i])
		    return false;
		i_48_ += i_49_;
		if (i_48_ < is[++i])
		    return false;
		i_48_ += i_49_;
		if (i_48_ < is[++i])
		    return false;
		i_48_ += i_49_;
		if (i_48_ < is[++i])
		    return false;
		i_48_ += i_49_;
	    }
	    i_45_ = i_47_ - i_46_ & 0x3;
	    while (--i_45_ >= 0) {
		if (i_48_ < is[++i])
		    return false;
		i_48_ += i_49_;
	    }
	}
	return true;
    }
    
    Class558(Class552 class552) {
	aClass552_7491 = class552;
    }
}
