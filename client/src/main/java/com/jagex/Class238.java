/* Class238 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class238 implements Interface28
{
    Class213 this$0;
    int anInt2378;
    int anInt2379;
    public static int anInt2380;
    
    public void method174(Class214 class214) {
	class214.method4043(-1737899215 * anInt2379, 2061552709 * anInt2378,
			    1710165454);
	class214.method4044(-1737899215 * anInt2379, 1481307617)
	    .method3998((byte) -127);
    }
    
    public void method173(Class214 class214, int i) {
	class214.method4043(-1737899215 * anInt2379, 2061552709 * anInt2378,
			    1710165454);
	class214.method4044(-1737899215 * anInt2379, 1481307617)
	    .method3998((byte) -85);
    }
    
    Class238(Class213 class213, Class534_Sub40 class534_sub40) {
	this$0 = class213;
	anInt2379 = class534_sub40.method16529((byte) 1) * -813255215;
	anInt2378 = class534_sub40.method16529((byte) 1) * 2019321485;
    }
    
    public void method172(Class214 class214) {
	class214.method4043(-1737899215 * anInt2379, 2061552709 * anInt2378,
			    1710165454);
	class214.method4044(-1737899215 * anInt2379, 1481307617)
	    .method3998((byte) -121);
    }
    
    static final void method4424(Class669 class669, byte i) {
	class669.anInt8600 -= 926998689;
	int i_0_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_1_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	int i_2_
	    = class669.anIntArray8595[2 + class669.anInt8600 * 2088438307];
	Class247 class247 = Class112.method2017(i_2_, 615225742);
	Class690_Sub38.method17206(class247, i_0_, i_1_, 897896591);
    }
    
    static final void method4425(Class669 class669, byte i)
	throws Exception_Sub2 {
	class669.anInt8600 -= 617999126;
	int i_3_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_4_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	Class599.aClass298_Sub1_7871.method5370((float) (3.141592653589793
							 * (double) i_3_ * 2.0
							 / 16384.0),
						(float) (2.0
							 * (3.141592653589793
							    * (double) i_4_)
							 / 16384.0),
						(byte) -30);
    }
    
    public static float method4426(Class443 class443, int i) {
	Class438 class438 = Class438.method6996(0.0F, 0.0F, 1.0F);
	class438.method7021(class443);
	double d
	    = 1.5707963267948966 - Math.acos((double) class438.aFloat4863);
	class438.method7074();
	return (float) d;
    }
    
    static final void method4427(Class669 class669, int i) {
	int i_5_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (i_5_ == -1)
	    throw new RuntimeException();
	Class41 class41
	    = ((Class41)
	       Class667.aClass44_Sub21_8582.method91(i_5_, -1773313487));
	if (Class493.aClass493_5496 != class41.aClass493_314)
	    throw new RuntimeException();
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class41.method1050(string, (byte) 1) ? 1 : 0;
    }
    
    static Class255[] method4428(int i) {
	return (new Class255[]
		{ Class255.aClass255_2695, Class255.aClass255_2692,
		  Class255.aClass255_2699, Class255.aClass255_2700,
		  Class255.aClass255_2691, Class255.aClass255_2690,
		  Class255.aClass255_2694, Class255.aClass255_2686,
		  Class255.aClass255_2685, Class255.aClass255_2687,
		  Class255.aClass255_2696, Class255.aClass255_2698,
		  Class255.aClass255_2693, Class255.aClass255_2703,
		  Class255.aClass255_2701, Class255.aClass255_2697,
		  Class255.aClass255_2702, Class255.aClass255_2688 });
    }
    
    static final void method4429(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	client.aShort11311
	    = (short) class669.anIntArray8595[class669.anInt8600 * 2088438307];
	if (client.aShort11311 <= 0)
	    client.aShort11311 = (short) 256;
	client.aShort11312 = (short) (class669.anIntArray8595
				      [2088438307 * class669.anInt8600 + 1]);
	if (client.aShort11312 <= 0)
	    client.aShort11312 = (short) 205;
    }
}
