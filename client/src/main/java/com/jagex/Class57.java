/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class57
{
    int anInt456;
    public int anInt457;
    static Class171 aClass171_458;
    public static Class451_Sub1[] aClass451_Sub1Array459;
    
    public int method1228() {
	return anInt457 * 949937137 & 0x3fff;
    }
    
    public boolean method1229(int i, int i_0_, int i_1_, int i_2_) {
	int i_3_ = -129276299 * anInt456;
	if (949937137 * anInt457 == i && -129276299 * anInt456 == 0)
	    return false;
	boolean bool;
	if (0 == -129276299 * anInt456) {
	    if (i > anInt457 * 949937137 && i <= anInt457 * 949937137 + i_0_
		|| (i < 949937137 * anInt457
		    && i >= anInt457 * 949937137 - i_0_)) {
		anInt457 = -1460032239 * i;
		return false;
	    }
	    bool = true;
	} else if (-129276299 * anInt456 > 0 && i > 949937137 * anInt457) {
	    int i_4_
		= anInt456 * -129276299 * (anInt456 * -129276299) / (i_0_ * 2);
	    int i_5_ = i_4_ + 949937137 * anInt457;
	    if (i_5_ >= i || i_5_ < anInt457 * 949937137)
		bool = false;
	    else
		bool = true;
	} else if (anInt456 * -129276299 < 0 && i < anInt457 * 949937137) {
	    int i_6_
		= -129276299 * anInt456 * (-129276299 * anInt456) / (2 * i_0_);
	    int i_7_ = anInt457 * 949937137 - i_6_;
	    if (i_7_ <= i || i_7_ > 949937137 * anInt457)
		bool = false;
	    else
		bool = true;
	} else
	    bool = false;
	if (bool) {
	    if (i > anInt457 * 949937137) {
		anInt456 += i_0_ * -1834567203;
		if (0 != i_1_ && -129276299 * anInt456 > i_1_)
		    anInt456 = -1834567203 * i_1_;
	    } else {
		anInt456 -= -1834567203 * i_0_;
		if (0 != i_1_ && anInt456 * -129276299 < -i_1_)
		    anInt456 = -1834567203 * -i_1_;
	    }
	    if (i_3_ != -129276299 * anInt456) {
		int i_8_ = (anInt456 * -129276299 * (-129276299 * anInt456)
			    / (i_0_ * 2));
		if (i > anInt457 * 949937137) {
		    if (anInt457 * 949937137 + i_8_ > i)
			anInt456 = -1834567203 * i_3_;
		} else if (i < anInt457 * 949937137
			   && anInt457 * 949937137 - i_8_ < i)
		    anInt456 = i_3_ * -1834567203;
	    }
	} else if (anInt456 * -129276299 > 0) {
	    anInt456 -= i_0_ * -1834567203;
	    if (anInt456 * -129276299 < 0)
		anInt456 = 0;
	} else {
	    anInt456 += -1834567203 * i_0_;
	    if (-129276299 * anInt456 > 0)
		anInt456 = 0;
	}
	anInt457 += (anInt456 * -129276299 + i_3_ >> 1) * -1460032239;
	return bool;
    }
    
    public boolean method1230(int i, int i_9_, int i_10_) {
	int i_11_ = -129276299 * anInt456;
	if (949937137 * anInt457 == i && -129276299 * anInt456 == 0)
	    return false;
	boolean bool;
	if (0 == -129276299 * anInt456) {
	    if (i > anInt457 * 949937137 && i <= anInt457 * 949937137 + i_9_
		|| (i < 949937137 * anInt457
		    && i >= anInt457 * 949937137 - i_9_)) {
		anInt457 = -1460032239 * i;
		return false;
	    }
	    bool = true;
	} else if (-129276299 * anInt456 > 0 && i > 949937137 * anInt457) {
	    int i_12_
		= anInt456 * -129276299 * (anInt456 * -129276299) / (i_9_ * 2);
	    int i_13_ = i_12_ + 949937137 * anInt457;
	    if (i_13_ >= i || i_13_ < anInt457 * 949937137)
		bool = false;
	    else
		bool = true;
	} else if (anInt456 * -129276299 < 0 && i < anInt457 * 949937137) {
	    int i_14_
		= -129276299 * anInt456 * (-129276299 * anInt456) / (2 * i_9_);
	    int i_15_ = anInt457 * 949937137 - i_14_;
	    if (i_15_ <= i || i_15_ > 949937137 * anInt457)
		bool = false;
	    else
		bool = true;
	} else
	    bool = false;
	if (bool) {
	    if (i > anInt457 * 949937137) {
		anInt456 += i_9_ * -1834567203;
		if (0 != i_10_ && -129276299 * anInt456 > i_10_)
		    anInt456 = -1834567203 * i_10_;
	    } else {
		anInt456 -= -1834567203 * i_9_;
		if (0 != i_10_ && anInt456 * -129276299 < -i_10_)
		    anInt456 = -1834567203 * -i_10_;
	    }
	    if (i_11_ != -129276299 * anInt456) {
		int i_16_ = (anInt456 * -129276299 * (-129276299 * anInt456)
			     / (i_9_ * 2));
		if (i > anInt457 * 949937137) {
		    if (anInt457 * 949937137 + i_16_ > i)
			anInt456 = -1834567203 * i_11_;
		} else if (i < anInt457 * 949937137
			   && anInt457 * 949937137 - i_16_ < i)
		    anInt456 = i_11_ * -1834567203;
	    }
	} else if (anInt456 * -129276299 > 0) {
	    anInt456 -= i_9_ * -1834567203;
	    if (anInt456 * -129276299 < 0)
		anInt456 = 0;
	} else {
	    anInt456 += -1834567203 * i_9_;
	    if (-129276299 * anInt456 > 0)
		anInt456 = 0;
	}
	anInt457 += (anInt456 * -129276299 + i_11_ >> 1) * -1460032239;
	return bool;
    }
    
    public int method1231(int i) {
	return anInt457 * 949937137 & 0x3fff;
    }
    
    public void method1232(byte i) {
	anInt457 = (anInt457 * 949937137 & 0x3fff) * -1460032239;
    }
    
    public boolean method1233(int i, int i_17_, int i_18_) {
	int i_19_ = -129276299 * anInt456;
	if (949937137 * anInt457 == i && -129276299 * anInt456 == 0)
	    return false;
	boolean bool;
	if (0 == -129276299 * anInt456) {
	    if (i > anInt457 * 949937137 && i <= anInt457 * 949937137 + i_17_
		|| (i < 949937137 * anInt457
		    && i >= anInt457 * 949937137 - i_17_)) {
		anInt457 = -1460032239 * i;
		return false;
	    }
	    bool = true;
	} else if (-129276299 * anInt456 > 0 && i > 949937137 * anInt457) {
	    int i_20_ = (anInt456 * -129276299 * (anInt456 * -129276299)
			 / (i_17_ * 2));
	    int i_21_ = i_20_ + 949937137 * anInt457;
	    if (i_21_ >= i || i_21_ < anInt457 * 949937137)
		bool = false;
	    else
		bool = true;
	} else if (anInt456 * -129276299 < 0 && i < anInt457 * 949937137) {
	    int i_22_ = (-129276299 * anInt456 * (-129276299 * anInt456)
			 / (2 * i_17_));
	    int i_23_ = anInt457 * 949937137 - i_22_;
	    if (i_23_ <= i || i_23_ > 949937137 * anInt457)
		bool = false;
	    else
		bool = true;
	} else
	    bool = false;
	if (bool) {
	    if (i > anInt457 * 949937137) {
		anInt456 += i_17_ * -1834567203;
		if (0 != i_18_ && -129276299 * anInt456 > i_18_)
		    anInt456 = -1834567203 * i_18_;
	    } else {
		anInt456 -= -1834567203 * i_17_;
		if (0 != i_18_ && anInt456 * -129276299 < -i_18_)
		    anInt456 = -1834567203 * -i_18_;
	    }
	    if (i_19_ != -129276299 * anInt456) {
		int i_24_ = (anInt456 * -129276299 * (-129276299 * anInt456)
			     / (i_17_ * 2));
		if (i > anInt457 * 949937137) {
		    if (anInt457 * 949937137 + i_24_ > i)
			anInt456 = -1834567203 * i_19_;
		} else if (i < anInt457 * 949937137
			   && anInt457 * 949937137 - i_24_ < i)
		    anInt456 = i_19_ * -1834567203;
	    }
	} else if (anInt456 * -129276299 > 0) {
	    anInt456 -= i_17_ * -1834567203;
	    if (anInt456 * -129276299 < 0)
		anInt456 = 0;
	} else {
	    anInt456 += -1834567203 * i_17_;
	    if (-129276299 * anInt456 > 0)
		anInt456 = 0;
	}
	anInt457 += (anInt456 * -129276299 + i_19_ >> 1) * -1460032239;
	return bool;
    }
    
    public int method1234() {
	return anInt457 * 949937137 & 0x3fff;
    }
    
    public boolean method1235(int i, int i_25_, int i_26_) {
	int i_27_ = -129276299 * anInt456;
	if (949937137 * anInt457 == i && -129276299 * anInt456 == 0)
	    return false;
	boolean bool;
	if (0 == -129276299 * anInt456) {
	    if (i > anInt457 * 949937137 && i <= anInt457 * 949937137 + i_25_
		|| (i < 949937137 * anInt457
		    && i >= anInt457 * 949937137 - i_25_)) {
		anInt457 = -1460032239 * i;
		return false;
	    }
	    bool = true;
	} else if (-129276299 * anInt456 > 0 && i > 949937137 * anInt457) {
	    int i_28_ = (anInt456 * -129276299 * (anInt456 * -129276299)
			 / (i_25_ * 2));
	    int i_29_ = i_28_ + 949937137 * anInt457;
	    if (i_29_ >= i || i_29_ < anInt457 * 949937137)
		bool = false;
	    else
		bool = true;
	} else if (anInt456 * -129276299 < 0 && i < anInt457 * 949937137) {
	    int i_30_ = (-129276299 * anInt456 * (-129276299 * anInt456)
			 / (2 * i_25_));
	    int i_31_ = anInt457 * 949937137 - i_30_;
	    if (i_31_ <= i || i_31_ > 949937137 * anInt457)
		bool = false;
	    else
		bool = true;
	} else
	    bool = false;
	if (bool) {
	    if (i > anInt457 * 949937137) {
		anInt456 += i_25_ * -1834567203;
		if (0 != i_26_ && -129276299 * anInt456 > i_26_)
		    anInt456 = -1834567203 * i_26_;
	    } else {
		anInt456 -= -1834567203 * i_25_;
		if (0 != i_26_ && anInt456 * -129276299 < -i_26_)
		    anInt456 = -1834567203 * -i_26_;
	    }
	    if (i_27_ != -129276299 * anInt456) {
		int i_32_ = (anInt456 * -129276299 * (-129276299 * anInt456)
			     / (i_25_ * 2));
		if (i > anInt457 * 949937137) {
		    if (anInt457 * 949937137 + i_32_ > i)
			anInt456 = -1834567203 * i_27_;
		} else if (i < anInt457 * 949937137
			   && anInt457 * 949937137 - i_32_ < i)
		    anInt456 = i_27_ * -1834567203;
	    }
	} else if (anInt456 * -129276299 > 0) {
	    anInt456 -= i_25_ * -1834567203;
	    if (anInt456 * -129276299 < 0)
		anInt456 = 0;
	} else {
	    anInt456 += -1834567203 * i_25_;
	    if (-129276299 * anInt456 > 0)
		anInt456 = 0;
	}
	anInt457 += (anInt456 * -129276299 + i_27_ >> 1) * -1460032239;
	return bool;
    }
    
    public boolean method1236(int i, int i_33_, int i_34_) {
	int i_35_ = -129276299 * anInt456;
	if (949937137 * anInt457 == i && -129276299 * anInt456 == 0)
	    return false;
	boolean bool;
	if (0 == -129276299 * anInt456) {
	    if (i > anInt457 * 949937137 && i <= anInt457 * 949937137 + i_33_
		|| (i < 949937137 * anInt457
		    && i >= anInt457 * 949937137 - i_33_)) {
		anInt457 = -1460032239 * i;
		return false;
	    }
	    bool = true;
	} else if (-129276299 * anInt456 > 0 && i > 949937137 * anInt457) {
	    int i_36_ = (anInt456 * -129276299 * (anInt456 * -129276299)
			 / (i_33_ * 2));
	    int i_37_ = i_36_ + 949937137 * anInt457;
	    if (i_37_ >= i || i_37_ < anInt457 * 949937137)
		bool = false;
	    else
		bool = true;
	} else if (anInt456 * -129276299 < 0 && i < anInt457 * 949937137) {
	    int i_38_ = (-129276299 * anInt456 * (-129276299 * anInt456)
			 / (2 * i_33_));
	    int i_39_ = anInt457 * 949937137 - i_38_;
	    if (i_39_ <= i || i_39_ > 949937137 * anInt457)
		bool = false;
	    else
		bool = true;
	} else
	    bool = false;
	if (bool) {
	    if (i > anInt457 * 949937137) {
		anInt456 += i_33_ * -1834567203;
		if (0 != i_34_ && -129276299 * anInt456 > i_34_)
		    anInt456 = -1834567203 * i_34_;
	    } else {
		anInt456 -= -1834567203 * i_33_;
		if (0 != i_34_ && anInt456 * -129276299 < -i_34_)
		    anInt456 = -1834567203 * -i_34_;
	    }
	    if (i_35_ != -129276299 * anInt456) {
		int i_40_ = (anInt456 * -129276299 * (-129276299 * anInt456)
			     / (i_33_ * 2));
		if (i > anInt457 * 949937137) {
		    if (anInt457 * 949937137 + i_40_ > i)
			anInt456 = -1834567203 * i_35_;
		} else if (i < anInt457 * 949937137
			   && anInt457 * 949937137 - i_40_ < i)
		    anInt456 = i_35_ * -1834567203;
	    }
	} else if (anInt456 * -129276299 > 0) {
	    anInt456 -= i_33_ * -1834567203;
	    if (anInt456 * -129276299 < 0)
		anInt456 = 0;
	} else {
	    anInt456 += -1834567203 * i_33_;
	    if (-129276299 * anInt456 > 0)
		anInt456 = 0;
	}
	anInt457 += (anInt456 * -129276299 + i_35_ >> 1) * -1460032239;
	return bool;
    }
    
    public void method1237(int i) {
	anInt457 = i * -1460032239;
	anInt456 = 0;
    }
    
    public void method1238() {
	anInt457 = (anInt457 * 949937137 & 0x3fff) * -1460032239;
    }
    
    public void method1239() {
	anInt457 = (anInt457 * 949937137 & 0x3fff) * -1460032239;
    }
    
    public int method1240() {
	return anInt457 * 949937137 & 0x3fff;
    }
    
    public void method1241(int i, int i_41_) {
	anInt457 = i * -1460032239;
	anInt456 = 0;
    }
    
    static final void method1242(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class12_Sub1.method17321(class247, class669, 1095081581);
    }
    
    static final void method1243(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	int i_42_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_43_
	    = class669.anIntArray8595[1 + 2088438307 * class669.anInt8600];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 0 != (i_42_ & 1 << i_43_) ? 1 : 0;
    }
    
    static final void method1244(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 100;
    }
}
