/* Class592 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class592
{
    static Class62 aClass62_7815;
    public static Class592 aClass592_7816;
    static Class592 aClass592_7817 = new Class592(0);
    static Class592 aClass592_7818 = new Class592(1);
    protected static Class518 aClass518_7819;
    
    static {
	aClass592_7816 = new Class592(2);
    }
    
    Class592(int i) {
	/* empty */
    }
    
    public static void method9884(float[] fs, int[] is, int i, int i_0_,
				  int i_1_) {
	if (i < i_0_) {
	    int i_2_ = (i + i_0_) / 2;
	    int i_3_ = i;
	    float f = fs[i_2_];
	    fs[i_2_] = fs[i_0_];
	    fs[i_0_] = f;
	    int i_4_ = is[i_2_];
	    is[i_2_] = is[i_0_];
	    is[i_0_] = i_4_;
	    for (int i_5_ = i; i_5_ < i_0_; i_5_++) {
		if (fs[i_5_] > f) {
		    float f_6_ = fs[i_5_];
		    fs[i_5_] = fs[i_3_];
		    fs[i_3_] = f_6_;
		    int i_7_ = is[i_5_];
		    is[i_5_] = is[i_3_];
		    is[i_3_++] = i_7_;
		}
	    }
	    fs[i_0_] = fs[i_3_];
	    fs[i_3_] = f;
	    is[i_0_] = is[i_3_];
	    is[i_3_] = i_4_;
	    method9884(fs, is, i, i_3_ - 1, 783707527);
	    method9884(fs, is, i_3_ + 1, i_0_, 280229225);
	}
    }
    
    static void method9885(Class669 class669, int i) {
	class669.anIntArray8595[2088438307 * class669.anInt8600 - 1]
	    = ((Class273)
	       Class223.aClass53_Sub2_2316.method91((class669.anIntArray8595
						     [(class669.anInt8600
						       * 2088438307) - 1]),
						    -521033510))
		  .method5076(Class78.aClass103_825, (byte) 81) ? 1 : 0;
    }
    
    static final void method9886(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class536.method8907(class247, class243, class669, (short) -256);
    }
    
    static final void method9887(Class247 class247, Class669 class669,
				 byte i) {
	Class16 class16
	    = class247.method4518(Class351.aClass406_3620,
				  client.anInterface52_11081, 1778006083);
	int i_8_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	int i_9_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	int i_10_
	    = class16.method752(class247.aString2533,
				-881188269 * class247.anInt2468,
				class247.anInt2528 * -1959194819, i_9_, i_8_,
				Class658.aClass163Array8541, (byte) -84);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_10_;
    }
    
    static final void method9888(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class519.method8647(class247, class669, -313970242);
    }
    
    static final void method9889(long l) {
	Class438 class438
	    = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method10807()
	       .aClass438_4885);
	int i = (int) class438.aFloat4864 + client.anInt11042 * 268721155;
	int i_11_ = (int) class438.aFloat4865 + client.anInt11125 * 674672233;
	if (1490134939 * Class588.anInt7808 - i < -2000
	    || 1490134939 * Class588.anInt7808 - i > 2000
	    || -1293868227 * Class453.anInt4958 - i_11_ < -2000
	    || Class453.anInt4958 * -1293868227 - i_11_ > 2000) {
	    Class588.anInt7808 = i * 441411219;
	    Class453.anInt4958 = i_11_ * -1703261163;
	}
	if (i != Class588.anInt7808 * 1490134939) {
	    int i_12_ = i - 1490134939 * Class588.anInt7808;
	    int i_13_ = (int) (l * (long) i_12_ / 320L);
	    if (i_12_ > 0) {
		if (i_13_ == 0)
		    i_13_ = 1;
		else if (i_13_ > i_12_)
		    i_13_ = i_12_;
	    } else if (i_13_ == 0)
		i_13_ = -1;
	    else if (i_13_ < i_12_)
		i_13_ = i_12_;
	    Class588.anInt7808 += 441411219 * i_13_;
	}
	if (i_11_ != -1293868227 * Class453.anInt4958) {
	    int i_14_ = i_11_ - Class453.anInt4958 * -1293868227;
	    int i_15_ = (int) (l * (long) i_14_ / 320L);
	    if (i_14_ > 0) {
		if (0 == i_15_)
		    i_15_ = 1;
		else if (i_15_ > i_14_)
		    i_15_ = i_14_;
	    } else if (0 == i_15_)
		i_15_ = -1;
	    else if (i_15_ < i_14_)
		i_15_ = i_14_;
	    Class453.anInt4958 += -1703261163 * i_15_;
	}
	client.aFloat11140 += client.aFloat11141 * (float) l / 6.0F;
	client.aFloat11302 += (float) l * client.aFloat11330 / 6.0F;
	Class326.method5819(29181971);
    }
}
