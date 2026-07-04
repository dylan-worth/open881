/* Class454 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class454
{
    Class454() throws Throwable {
	throw new Error();
    }
    
    public static int method7408(int i, int i_0_, int i_1_) {
	i_1_ &= 0x3;
	if (0 == i_1_)
	    return i_0_;
	if (1 == i_1_)
	    return 7 - i;
	if (i_1_ == 2)
	    return 7 - i_0_;
	return i;
    }
    
    public static int method7409(int i, int i_2_, int i_3_) {
	i_3_ &= 0x3;
	if (0 == i_3_)
	    return i_2_;
	if (1 == i_3_)
	    return 7 - i;
	if (i_3_ == 2)
	    return 7 - i_2_;
	return i;
    }
    
    public static int method7410(int i, int i_4_, int i_5_, int i_6_, int i_7_,
				 int i_8_) {
	if (1 == (i_8_ & 0x1)) {
	    int i_9_ = i_6_;
	    i_6_ = i_7_;
	    i_7_ = i_9_;
	}
	i_5_ &= 0x3;
	if (0 == i_5_)
	    return i;
	if (1 == i_5_)
	    return i_4_;
	if (2 == i_5_)
	    return 7 - i - (i_6_ - 1);
	return 7 - i_4_ - (i_7_ - 1);
    }
    
    public static int method7411(int i, int i_10_, int i_11_, int i_12_,
				 int i_13_, int i_14_) {
	if (1 == (i_14_ & 0x1)) {
	    int i_15_ = i_12_;
	    i_12_ = i_13_;
	    i_13_ = i_15_;
	}
	i_11_ &= 0x3;
	if (0 == i_11_)
	    return i;
	if (1 == i_11_)
	    return i_10_;
	if (2 == i_11_)
	    return 7 - i - (i_12_ - 1);
	return 7 - i_10_ - (i_13_ - 1);
    }
    
    public static int method7412(int i, int i_16_, int i_17_, int i_18_,
				 int i_19_, int i_20_) {
	if (1 == (i_20_ & 0x1)) {
	    int i_21_ = i_18_;
	    i_18_ = i_19_;
	    i_19_ = i_21_;
	}
	i_17_ &= 0x3;
	if (0 == i_17_)
	    return i_16_;
	if (i_17_ == 1)
	    return 7 - i - (i_18_ - 1);
	if (i_17_ == 2)
	    return 7 - i_16_ - (i_19_ - 1);
	return i;
    }
    
    public static int method7413(int i, int i_22_, int i_23_, int i_24_,
				 int i_25_, int i_26_) {
	if (1 == (i_26_ & 0x1)) {
	    int i_27_ = i_24_;
	    i_24_ = i_25_;
	    i_25_ = i_27_;
	}
	i_23_ &= 0x3;
	if (0 == i_23_)
	    return i_22_;
	if (i_23_ == 1)
	    return 7 - i - (i_24_ - 1);
	if (i_23_ == 2)
	    return 7 - i_22_ - (i_25_ - 1);
	return i;
    }
    
    public static Class608[] method7414(int i) {
	return (new Class608[]
		{ Class608.aClass608_7998, Class608.aClass608_8000,
		  Class608.aClass608_7999, Class608.aClass608_8001,
		  Class608.aClass608_7997, Class608.aClass608_7996 });
    }
    
    static final void method7415(Class669 class669, int i) {
	int i_28_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_28_, 444430268);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_28_ >> 16];
	Class181.method2980(class247, class243, class669, (byte) -30);
    }
    
    public static void method7416(Class247 class247, int i) {
	if (-632246533 * class247.anInt2632 == client.anInt11282 * -1394087091)
	    client.aBoolArray11180[class247.anInt2631 * -360382511] = true;
    }
}
