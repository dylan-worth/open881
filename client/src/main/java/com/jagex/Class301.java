/* Class301 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class301
{
    public short[] aShortArray3232;
    public int[] anIntArray3233;
    float[] aFloatArray3234;
    int[][] anIntArrayArray3235;
    int[][] anIntArrayArray3236;
    public short[] aShortArray3237;
    public long aLong3238;
    
    public Class301(long l, int[] is, float[] fs, int[][] is_0_, int[][] is_1_,
		    short[] is_2_, short[] is_3_) {
	aLong3238 = l * 8855449811293583851L;
	anIntArray3233 = is;
	aFloatArray3234 = fs;
	anIntArrayArray3235 = is_0_;
	anIntArrayArray3236 = is_1_;
	aShortArray3232 = is_2_;
	aShortArray3237 = is_3_;
    }
    
    public Class301(Class307 class307, boolean bool) {
	if (bool) {
	    anIntArray3233 = new int[class307.anIntArray3282.length];
	    aFloatArray3234 = new float[class307.anIntArray3282.length];
	    anIntArrayArray3235 = new int[class307.anIntArray3282.length][3];
	    anIntArrayArray3236 = new int[class307.anIntArray3282.length][3];
	    System.arraycopy(class307.anIntArray3282, 0, anIntArray3233, 0,
			     anIntArray3233.length);
	} else {
	    anIntArray3233 = new int[class307.anIntArray3283.length];
	    aFloatArray3234 = new float[class307.anIntArray3283.length];
	    anIntArrayArray3235 = new int[class307.anIntArray3283.length][3];
	    anIntArrayArray3236 = new int[class307.anIntArray3283.length][3];
	    System.arraycopy(class307.anIntArray3283, 0, anIntArray3233, 0,
			     anIntArray3233.length);
	}
	if (class307.aShortArray3287 != null) {
	    aShortArray3232 = new short[class307.aShortArray3287.length];
	    System.arraycopy(class307.aShortArray3287, 0, aShortArray3232, 0,
			     aShortArray3232.length);
	}
	if (class307.aShortArray3290 != null) {
	    aShortArray3237 = new short[class307.aShortArray3290.length];
	    System.arraycopy(class307.aShortArray3290, 0, aShortArray3237, 0,
			     aShortArray3237.length);
	}
    }
    
    static final void method5558(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class325.method5817(class247, class243, class669, -1319673912);
    }
    
    static final void method5559(Class669 class669, int i) {
	class669.anInt8594 -= -1374580330;
	String string
	    = ((String)
	       class669.anObjectArray8593[class669.anInt8594 * 1485266147]);
	String string_4_ = (String) (class669.anObjectArray8593
				     [1485266147 * class669.anInt8594 + 1]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class685.method13960(string, string_4_, 1566655344);
    }
    
    static final void method5560(Class669 class669, int i) {
	int i_5_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_5_, 1304474121);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_5_ >> 16];
	Class263.method4831(class247, class243, class669,
			    Class253.aClass253_2662, (byte) -57);
    }
    
    static final void method5561(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class181.method2981(class247, class243, class669, (short) 12030);
    }
}
