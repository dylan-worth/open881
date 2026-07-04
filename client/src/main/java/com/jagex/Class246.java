/* Class246 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class246
{
    public int anInt2419;
    public int anInt2420;
    public int[] anIntArray2421;
    public int[] anIntArray2422;
    public Class145 aClass145_2423;
    int anInt2424;
    public static Class155 aClass155_2425;
    
    public boolean method4503(int i, int i_0_) {
	if (i_0_ >= 0 && i_0_ < anIntArray2422.length) {
	    int i_1_ = anIntArray2422[i_0_];
	    if (i >= i_1_ && i <= i_1_ + anIntArray2421[i_0_])
		return true;
	}
	return false;
    }
    
    public boolean method4504(int i, int i_2_, int i_3_) {
	if (i_2_ >= 0 && i_2_ < anIntArray2422.length) {
	    int i_4_ = anIntArray2422[i_2_];
	    if (i >= i_4_ && i <= i_4_ + anIntArray2421[i_2_])
		return true;
	}
	return false;
    }
    
    Class246(int i, int i_5_, int[] is, int[] is_6_, Class145 class145,
	     int i_7_) {
	anInt2420 = 1660606455 * i;
	anInt2419 = i_5_ * 739591823;
	anIntArray2421 = is;
	anIntArray2422 = is_6_;
	aClass145_2423 = class145;
	anInt2424 = i_7_ * 45959763;
    }
    
    static final void method4505(Class247 class247, Class243 class243,
				 Class669 class669, byte i) {
	class247.anInt2508
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) * -2116337403;
	Class454.method7416(class247, -1192496131);
	if (-1 == class247.anInt2580 * 1365669833 && !class243.aBool2413)
	    Class551.method9052(class247.anInt2454 * -1278450723, 1271298051);
    }
    
    static final void method4506(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class253.method4632(class247, class243, class669, 982354628);
    }
    
    public static void method4507(Class534_Sub18 class534_sub18,
				  Class534_Sub18 class534_sub18_8_, int i) {
	if (class534_sub18.aClass534_Sub18_10508 != null)
	    class534_sub18.method16180(-421776830);
	class534_sub18.aClass534_Sub18_10508
	    = class534_sub18_8_.aClass534_Sub18_10508;
	class534_sub18.aClass534_Sub18_10510 = class534_sub18_8_;
	class534_sub18.aClass534_Sub18_10508.aClass534_Sub18_10510
	    = class534_sub18;
	class534_sub18.aClass534_Sub18_10510.aClass534_Sub18_10508
	    = class534_sub18;
    }
    
    static final void method4508(Class669 class669, byte i) {
	int i_9_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aClass214_11359.method4044(i_9_, 1481307617).method3968
		  (-445528533).method93();
    }
    
    static void method4509(Class247 class247, Class145 class145, int i,
			   int i_10_, int i_11_, int i_12_, Class163 class163,
			   int i_13_) {
	Class30.method879(class247, class145, i, i_10_, i_11_, i_12_, class163,
			  100.0, Class284.aClass284_3072,
			  Class280.aClass280_3056, -365943584);
    }
    
    static final void method4510(Class669 class669, byte i) {
	Class267.method4870((byte) -54);
    }
    
    static final void method4511(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class81.aClass563_834.method9493(-1748831458);
    }
}
