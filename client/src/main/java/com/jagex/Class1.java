/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class1 implements Interface13, Interface7
{
    int anInt9 = 0;
    public int anInt10 = 14511443;
    public int anInt11;
    public boolean aBool12;
    public boolean aBool13;
    public int anInt14;
    public int anInt15 = 650527232;
    public int anInt16;
    public int anInt17;
    static long aLong18;
    
    public void method67(int i, int i_0_) {
	/* empty */
    }
    
    public void method79(Class534_Sub40 class534_sub40, byte i) {
	for (;;) {
	    int i_1_ = class534_sub40.method16527(-1147587035);
	    if (i_1_ == 0)
		break;
	    method500(class534_sub40, i_1_, -2002068378);
	}
    }
    
    void method500(Class534_Sub40 class534_sub40, int i, int i_2_) {
	if (1 == i) {
	    anInt9 = class534_sub40.method16531(1933988354) * 433662529;
	    method501(anInt9 * -1547967039, 13828096);
	} else if (i == 2) {
	    anInt10 = class534_sub40.method16529((byte) 1) * -14511443;
	    if (65535 == 587899173 * anInt10)
		anInt10 = 14511443;
	} else if (3 == i)
	    anInt15 = (class534_sub40.method16529((byte) 1) << 2) * 546530081;
	else if (4 == i)
	    aBool12 = false;
	else if (5 == i)
	    aBool13 = false;
    }
    
    void method501(int i, int i_3_) {
	double d = (double) (i >> 16 & 0xff) / 256.0;
	double d_4_ = (double) (i >> 8 & 0xff) / 256.0;
	double d_5_ = (double) (i & 0xff) / 256.0;
	double d_6_ = d;
	if (d_4_ < d_6_)
	    d_6_ = d_4_;
	if (d_5_ < d_6_)
	    d_6_ = d_5_;
	double d_7_ = d;
	if (d_4_ > d_7_)
	    d_7_ = d_4_;
	if (d_5_ > d_7_)
	    d_7_ = d_5_;
	double d_8_ = 0.0;
	double d_9_ = 0.0;
	double d_10_ = (d_7_ + d_6_) / 2.0;
	if (d_7_ != d_6_) {
	    if (d_10_ < 0.5)
		d_9_ = (d_7_ - d_6_) / (d_6_ + d_7_);
	    if (d_10_ >= 0.5)
		d_9_ = (d_7_ - d_6_) / (2.0 - d_7_ - d_6_);
	    if (d == d_7_)
		d_8_ = (d_4_ - d_5_) / (d_7_ - d_6_);
	    else if (d_4_ == d_7_)
		d_8_ = 2.0 + (d_5_ - d) / (d_7_ - d_6_);
	    else if (d_5_ == d_7_)
		d_8_ = (d - d_4_) / (d_7_ - d_6_) + 4.0;
	}
	d_8_ /= 6.0;
	anInt14 = -460664459 * (int) (256.0 * d_9_);
	anInt16 = -1195531791 * (int) (256.0 * d_10_);
	if (anInt14 * 1312863965 < 0)
	    anInt14 = 0;
	else if (1312863965 * anInt14 > 255)
	    anInt14 = -1505320053;
	if (anInt16 * 1484599057 < 0)
	    anInt16 = 0;
	else if (anInt16 * 1484599057 > 255)
	    anInt16 = 82071311;
	if (d_10_ > 0.5)
	    anInt17 = (int) (512.0 * ((1.0 - d_10_) * d_9_)) * -1294595001;
	else
	    anInt17 = -1294595001 * (int) (512.0 * (d_9_ * d_10_));
	if (-1721639561 * anInt17 < 1)
	    anInt17 = -1294595001;
	anInt11
	    = (int) ((double) (anInt17 * -1721639561) * d_8_) * -1023186795;
    }
    
    public void method82(int i) {
	/* empty */
    }
    
    void method502(int i) {
	double d = (double) (i >> 16 & 0xff) / 256.0;
	double d_11_ = (double) (i >> 8 & 0xff) / 256.0;
	double d_12_ = (double) (i & 0xff) / 256.0;
	double d_13_ = d;
	if (d_11_ < d_13_)
	    d_13_ = d_11_;
	if (d_12_ < d_13_)
	    d_13_ = d_12_;
	double d_14_ = d;
	if (d_11_ > d_14_)
	    d_14_ = d_11_;
	if (d_12_ > d_14_)
	    d_14_ = d_12_;
	double d_15_ = 0.0;
	double d_16_ = 0.0;
	double d_17_ = (d_14_ + d_13_) / 2.0;
	if (d_14_ != d_13_) {
	    if (d_17_ < 0.5)
		d_16_ = (d_14_ - d_13_) / (d_13_ + d_14_);
	    if (d_17_ >= 0.5)
		d_16_ = (d_14_ - d_13_) / (2.0 - d_14_ - d_13_);
	    if (d == d_14_)
		d_15_ = (d_11_ - d_12_) / (d_14_ - d_13_);
	    else if (d_11_ == d_14_)
		d_15_ = 2.0 + (d_12_ - d) / (d_14_ - d_13_);
	    else if (d_12_ == d_14_)
		d_15_ = (d - d_11_) / (d_14_ - d_13_) + 4.0;
	}
	d_15_ /= 6.0;
	anInt14 = -460664459 * (int) (256.0 * d_16_);
	anInt16 = -1195531791 * (int) (256.0 * d_17_);
	if (anInt14 * 1312863965 < 0)
	    anInt14 = 0;
	else if (1312863965 * anInt14 > 255)
	    anInt14 = -1505320053;
	if (anInt16 * 1484599057 < 0)
	    anInt16 = 0;
	else if (anInt16 * 1484599057 > 255)
	    anInt16 = 82071311;
	if (d_17_ > 0.5)
	    anInt17 = (int) (512.0 * ((1.0 - d_17_) * d_16_)) * -1294595001;
	else
	    anInt17 = -1294595001 * (int) (512.0 * (d_16_ * d_17_));
	if (-1721639561 * anInt17 < 1)
	    anInt17 = -1294595001;
	anInt11
	    = (int) ((double) (anInt17 * -1721639561) * d_15_) * -1023186795;
    }
    
    Class1() {
	aBool12 = true;
	aBool13 = true;
    }
    
    public void method78(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(47611574);
	    if (i == 0)
		break;
	    method500(class534_sub40, i, 399214290);
	}
    }
    
    public void method81(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(368008589);
	    if (i == 0)
		break;
	    method500(class534_sub40, i, 1162670512);
	}
    }
    
    public void method83() {
	/* empty */
    }
    
    public void method84() {
	/* empty */
    }
    
    public void method66(int i) {
	/* empty */
    }
    
    public void method65(int i) {
	/* empty */
    }
    
    void method503(Class534_Sub40 class534_sub40, int i) {
	if (1 == i) {
	    anInt9 = class534_sub40.method16531(900749027) * 433662529;
	    method501(anInt9 * -1547967039, 13828096);
	} else if (i == 2) {
	    anInt10 = class534_sub40.method16529((byte) 1) * -14511443;
	    if (65535 == 587899173 * anInt10)
		anInt10 = 14511443;
	} else if (3 == i)
	    anInt15 = (class534_sub40.method16529((byte) 1) << 2) * 546530081;
	else if (4 == i)
	    aBool12 = false;
	else if (5 == i)
	    aBool13 = false;
    }
    
    void method504(Class534_Sub40 class534_sub40, int i) {
	if (1 == i) {
	    anInt9 = class534_sub40.method16531(792037153) * 433662529;
	    method501(anInt9 * -1547967039, 13828096);
	} else if (i == 2) {
	    anInt10 = class534_sub40.method16529((byte) 1) * -14511443;
	    if (65535 == 587899173 * anInt10)
		anInt10 = 14511443;
	} else if (3 == i)
	    anInt15 = (class534_sub40.method16529((byte) 1) << 2) * 546530081;
	else if (4 == i)
	    aBool12 = false;
	else if (5 == i)
	    aBool13 = false;
    }
    
    void method505(Class534_Sub40 class534_sub40, int i) {
	if (1 == i) {
	    anInt9 = class534_sub40.method16531(162999642) * 433662529;
	    method501(anInt9 * -1547967039, 13828096);
	} else if (i == 2) {
	    anInt10 = class534_sub40.method16529((byte) 1) * -14511443;
	    if (65535 == 587899173 * anInt10)
		anInt10 = 14511443;
	} else if (3 == i)
	    anInt15 = (class534_sub40.method16529((byte) 1) << 2) * 546530081;
	else if (4 == i)
	    aBool12 = false;
	else if (5 == i)
	    aBool13 = false;
    }
    
    void method506(int i) {
	double d = (double) (i >> 16 & 0xff) / 256.0;
	double d_18_ = (double) (i >> 8 & 0xff) / 256.0;
	double d_19_ = (double) (i & 0xff) / 256.0;
	double d_20_ = d;
	if (d_18_ < d_20_)
	    d_20_ = d_18_;
	if (d_19_ < d_20_)
	    d_20_ = d_19_;
	double d_21_ = d;
	if (d_18_ > d_21_)
	    d_21_ = d_18_;
	if (d_19_ > d_21_)
	    d_21_ = d_19_;
	double d_22_ = 0.0;
	double d_23_ = 0.0;
	double d_24_ = (d_21_ + d_20_) / 2.0;
	if (d_21_ != d_20_) {
	    if (d_24_ < 0.5)
		d_23_ = (d_21_ - d_20_) / (d_20_ + d_21_);
	    if (d_24_ >= 0.5)
		d_23_ = (d_21_ - d_20_) / (2.0 - d_21_ - d_20_);
	    if (d == d_21_)
		d_22_ = (d_18_ - d_19_) / (d_21_ - d_20_);
	    else if (d_18_ == d_21_)
		d_22_ = 2.0 + (d_19_ - d) / (d_21_ - d_20_);
	    else if (d_19_ == d_21_)
		d_22_ = (d - d_18_) / (d_21_ - d_20_) + 4.0;
	}
	d_22_ /= 6.0;
	anInt14 = -460664459 * (int) (256.0 * d_23_);
	anInt16 = -1195531791 * (int) (256.0 * d_24_);
	if (anInt14 * 1312863965 < 0)
	    anInt14 = 0;
	else if (1312863965 * anInt14 > 255)
	    anInt14 = -1505320053;
	if (anInt16 * 1484599057 < 0)
	    anInt16 = 0;
	else if (anInt16 * 1484599057 > 255)
	    anInt16 = 82071311;
	if (d_24_ > 0.5)
	    anInt17 = (int) (512.0 * ((1.0 - d_24_) * d_23_)) * -1294595001;
	else
	    anInt17 = -1294595001 * (int) (512.0 * (d_23_ * d_24_));
	if (-1721639561 * anInt17 < 1)
	    anInt17 = -1294595001;
	anInt11
	    = (int) ((double) (anInt17 * -1721639561) * d_22_) * -1023186795;
    }
    
    public void method80(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(534829598);
	    if (i == 0)
		break;
	    method500(class534_sub40, i, -1266407086);
	}
    }
    
    void method507(int i) {
	double d = (double) (i >> 16 & 0xff) / 256.0;
	double d_25_ = (double) (i >> 8 & 0xff) / 256.0;
	double d_26_ = (double) (i & 0xff) / 256.0;
	double d_27_ = d;
	if (d_25_ < d_27_)
	    d_27_ = d_25_;
	if (d_26_ < d_27_)
	    d_27_ = d_26_;
	double d_28_ = d;
	if (d_25_ > d_28_)
	    d_28_ = d_25_;
	if (d_26_ > d_28_)
	    d_28_ = d_26_;
	double d_29_ = 0.0;
	double d_30_ = 0.0;
	double d_31_ = (d_28_ + d_27_) / 2.0;
	if (d_28_ != d_27_) {
	    if (d_31_ < 0.5)
		d_30_ = (d_28_ - d_27_) / (d_27_ + d_28_);
	    if (d_31_ >= 0.5)
		d_30_ = (d_28_ - d_27_) / (2.0 - d_28_ - d_27_);
	    if (d == d_28_)
		d_29_ = (d_25_ - d_26_) / (d_28_ - d_27_);
	    else if (d_25_ == d_28_)
		d_29_ = 2.0 + (d_26_ - d) / (d_28_ - d_27_);
	    else if (d_26_ == d_28_)
		d_29_ = (d - d_25_) / (d_28_ - d_27_) + 4.0;
	}
	d_29_ /= 6.0;
	anInt14 = -460664459 * (int) (256.0 * d_30_);
	anInt16 = -1195531791 * (int) (256.0 * d_31_);
	if (anInt14 * 1312863965 < 0)
	    anInt14 = 0;
	else if (1312863965 * anInt14 > 255)
	    anInt14 = -1505320053;
	if (anInt16 * 1484599057 < 0)
	    anInt16 = 0;
	else if (anInt16 * 1484599057 > 255)
	    anInt16 = 82071311;
	if (d_31_ > 0.5)
	    anInt17 = (int) (512.0 * ((1.0 - d_31_) * d_30_)) * -1294595001;
	else
	    anInt17 = -1294595001 * (int) (512.0 * (d_30_ * d_31_));
	if (-1721639561 * anInt17 < 1)
	    anInt17 = -1294595001;
	anInt11
	    = (int) ((double) (anInt17 * -1721639561) * d_29_) * -1023186795;
    }
    
    void method508(int i) {
	double d = (double) (i >> 16 & 0xff) / 256.0;
	double d_32_ = (double) (i >> 8 & 0xff) / 256.0;
	double d_33_ = (double) (i & 0xff) / 256.0;
	double d_34_ = d;
	if (d_32_ < d_34_)
	    d_34_ = d_32_;
	if (d_33_ < d_34_)
	    d_34_ = d_33_;
	double d_35_ = d;
	if (d_32_ > d_35_)
	    d_35_ = d_32_;
	if (d_33_ > d_35_)
	    d_35_ = d_33_;
	double d_36_ = 0.0;
	double d_37_ = 0.0;
	double d_38_ = (d_35_ + d_34_) / 2.0;
	if (d_35_ != d_34_) {
	    if (d_38_ < 0.5)
		d_37_ = (d_35_ - d_34_) / (d_34_ + d_35_);
	    if (d_38_ >= 0.5)
		d_37_ = (d_35_ - d_34_) / (2.0 - d_35_ - d_34_);
	    if (d == d_35_)
		d_36_ = (d_32_ - d_33_) / (d_35_ - d_34_);
	    else if (d_32_ == d_35_)
		d_36_ = 2.0 + (d_33_ - d) / (d_35_ - d_34_);
	    else if (d_33_ == d_35_)
		d_36_ = (d - d_32_) / (d_35_ - d_34_) + 4.0;
	}
	d_36_ /= 6.0;
	anInt14 = -460664459 * (int) (256.0 * d_37_);
	anInt16 = -1195531791 * (int) (256.0 * d_38_);
	if (anInt14 * 1312863965 < 0)
	    anInt14 = 0;
	else if (1312863965 * anInt14 > 255)
	    anInt14 = -1505320053;
	if (anInt16 * 1484599057 < 0)
	    anInt16 = 0;
	else if (anInt16 * 1484599057 > 255)
	    anInt16 = 82071311;
	if (d_38_ > 0.5)
	    anInt17 = (int) (512.0 * ((1.0 - d_38_) * d_37_)) * -1294595001;
	else
	    anInt17 = -1294595001 * (int) (512.0 * (d_37_ * d_38_));
	if (-1721639561 * anInt17 < 1)
	    anInt17 = -1294595001;
	anInt11
	    = (int) ((double) (anInt17 * -1721639561) * d_36_) * -1023186795;
    }
    
    public static Interface65 method509(Class534_Sub40 class534_sub40,
					byte i) {
	Class594 class594
	    = Class300.method5556(class534_sub40.method16527(-1478338388),
				  -1705370882);
	if (class594 == Class594.aClass594_7826)
	    return Class44_Sub16.method17358(class534_sub40, 1853810497);
	if (Class594.aClass594_7825 == class594)
	    return Class534.method8893(class534_sub40, 641347875);
	if (class594 == Class594.aClass594_7824)
	    return Class550.method9030(class534_sub40, 1295090747);
	return null;
    }
    
    static final void method510(Class669 class669, int i)
	throws Exception_Sub2 {
	class669.anInt8600 -= 1235998252;
	int i_39_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_40_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	int i_41_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 2];
	int i_42_
	    = class669.anIntArray8595[3 + 2088438307 * class669.anInt8600];
	Class438 class438
	    = Class438.method6996((float) i_39_, (float) i_40_, (float) i_41_);
	if (-1.0F == class438.aFloat4864)
	    class438.aFloat4864 = Float.POSITIVE_INFINITY;
	if (class438.aFloat4863 == -1.0F)
	    class438.aFloat4863 = Float.POSITIVE_INFINITY;
	if (-1.0F == class438.aFloat4865)
	    class438.aFloat4865 = Float.POSITIVE_INFINITY;
	Class599.aClass298_Sub1_7871.method5470(class438, 316905596);
	Class599.aClass298_Sub1_7871.method5357((float) i_42_ / 1000.0F,
						209999428);
	class438.method7074();
    }
}
