/* Class302 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class302
{
    static Class302 aClass302_3239;
    static Class302 aClass302_3240;
    public int anInt3241;
    static Class302 aClass302_3242;
    static Class302 aClass302_3243;
    public int anInt3244;
    static Class302 aClass302_3245;
    public static Class302 aClass302_3246 = new Class302(0, 104);
    
    static {
	aClass302_3240 = new Class302(1, 120);
	aClass302_3239 = new Class302(2, 136);
	aClass302_3242 = new Class302(3, 168);
	aClass302_3243 = new Class302(4, 72);
	aClass302_3245 = new Class302(5, 256);
    }
    
    public static Class302 method5562(int i) {
	Class302[] class302s = Class352.method6261(1772426054);
	for (int i_0_ = 0; i_0_ < class302s.length; i_0_++) {
	    Class302 class302 = class302s[i_0_];
	    if (1453209707 * class302.anInt3244 == i)
		return class302;
	}
	return null;
    }
    
    static Class302[] method5563() {
	return (new Class302[]
		{ aClass302_3245, aClass302_3240, aClass302_3243,
		  aClass302_3242, aClass302_3246, aClass302_3239 });
    }
    
    public static Class302 method5564(int i) {
	Class302[] class302s = Class352.method6261(453633698);
	for (int i_1_ = 0; i_1_ < class302s.length; i_1_++) {
	    Class302 class302 = class302s[i_1_];
	    if (1453209707 * class302.anInt3244 == i)
		return class302;
	}
	return null;
    }
    
    Class302(int i, int i_2_) {
	anInt3244 = 1774498883 * i;
	anInt3241 = i_2_ * -254532387;
    }
    
    static Class8 method5565(Class534_Sub40 class534_sub40,
			     Class110_Sub1 class110_sub1, byte i) {
	Class8 class8 = new Class8(class110_sub1);
	for (;;) {
	    int i_3_ = class534_sub40.method16527(1934548778);
	    if (255 == i_3_)
		break;
	    Class483 class483
		= (Class483) Class376.method6419(com.jagex.Class483.class,
						 i_3_, -1203029005);
	    for (;;) {
		int i_4_ = class534_sub40.method16527(-749131313);
		if (255 == i_4_)
		    break;
		class534_sub40.anInt10811 -= -1387468933;
		Class429 class429
		    = class110_sub1.method14492(class534_sub40, class483,
						-1893632091);
		if (null != class429)
		    class8.method29(class429.anInt4820 * -608978823,
				    class429.anObject4819, (short) -25688);
	    }
	}
	return class8;
    }
    
    public static void method5566(int i, byte i_5_) {
	synchronized (Class631.aClass203_8220) {
	    Class631.aClass203_8220.method3876(i, (byte) 0);
	}
	synchronized (Class631.aClass203_8221) {
	    Class631.aClass203_8221.method3876(i, (byte) 0);
	}
    }
    
    static final void method5567(Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	Class186.method3700(string, -1437119182);
    }
    
    static final void method5568(Class669 class669, byte i) {
	class669.anInt8600 -= 926998689;
	int i_6_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_7_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	int i_8_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 2];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class193.method3794(i_6_, i_7_, i_8_, 382156635);
    }
    
    static final void method5569(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class601.method9976(class247, class243, class669, (byte) 8);
    }
    
    public static boolean method5570(byte i) {
	return Class574.aBool7681;
    }
}
