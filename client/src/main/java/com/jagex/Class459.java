/* Class459 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Calendar;

public class Class459
{
    int anInt4976;
    int anInt4977;
    int anInt4978;
    byte[] aByteArray4979;
    static Class472 aClass472_4980;
    
    Class459(int i, int i_0_, int i_1_, int i_2_, byte[] is) {
	anInt4977 = i * 776443663;
	anInt4976 = i_0_ * -2001319615;
	anInt4978 = i_1_ * 1507583945;
	aByteArray4979 = is;
    }
    
    static boolean method7439(int i, byte i_3_) {
	return (i >= Class595.aClass595_7834.anInt7852 * 847393323
		&& i <= 847393323 * Class595.aClass595_7838.anInt7852);
    }
    
    static final void method7440(Class669 class669, int i) {
	int i_4_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_4_, 402757395);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_4_ >> 16];
	Class675.method11126(class247, class243, class669, -1614624954);
    }
    
    static final void method7441(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	int i_5_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_6_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	Class273.method5102(9, i_5_, i_6_, "", (byte) -36);
    }
    
    static String method7442(long l, int i, boolean bool, byte i_7_) {
	Calendar calendar;
	if (bool) {
	    Class386.method6495(l);
	    calendar = Class84.aCalendar837;
	} else {
	    Class699.method14128(l);
	    calendar = Class84.aCalendar838;
	}
	int i_8_ = calendar.get(5);
	int i_9_ = calendar.get(2) + 1;
	int i_10_ = calendar.get(1);
	int i_11_ = calendar.get(11);
	int i_12_ = calendar.get(12);
	return new StringBuilder().append(Integer.toString(i_8_ / 10)).append
		   (i_8_ % 10).append
		   ("/").append
		   (i_9_ / 10).append
		   (i_9_ % 10).append
		   ("/").append
		   (i_10_ % 100 / 10).append
		   (i_10_ % 10).append
		   (" ").append
		   (i_11_ / 10).append
		   (i_11_ % 10).append
		   (":").append
		   (i_12_ / 10).append
		   (i_12_ % 10).toString();
    }
    
    static void method7443(Class185 class185, int i) {
	if ((Class113.anInt1381 * 1936210931
	     != Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aByte10854)
	    && client.aClass512_11100.method8424((byte) 34) != null) {
	    Class250.method4604((byte) -107);
	    if (Class396.method6570(class185,
				    (Class322
				     .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				     .aByte10854),
				    (byte) -28))
		Class113.anInt1381
		    = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aByte10854
		       * -1312565957);
	}
    }
    
    public static void method7444(int i, int i_13_) {
	Class247.aClass203_2552.method3876(i, (byte) 0);
	Class247.aClass203_2504.method3876(i, (byte) 0);
	Class247.aClass203_2523.method3876(i, (byte) 0);
	Class247.aClass203_2449.method3876(i, (byte) 0);
    }
}
