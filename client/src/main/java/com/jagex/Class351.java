/* Class351 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class351
{
    static final int anInt3612 = 1;
    long aLong3613 = 1978959866441963323L;
    Class700 aClass700_3614 = new Class700();
    static final int anInt3615 = 5;
    static final int anInt3616 = 2;
    long aLong3617;
    static final int anInt3618 = 4;
    static final int anInt3619 = 3;
    public static Class406 aClass406_3620;
    static int anInt3621;
    
    void method6178(Class534_Sub40 class534_sub40) {
	aLong3617
	    = class534_sub40.method16537(1359621443) * 1459222115322203709L;
	aLong3613
	    = class534_sub40.method16537(1359621443) * -1978959866441963323L;
	for (int i = class534_sub40.method16527(-1229174270); i != 0;
	     i = class534_sub40.method16527(389641632)) {
	    Class534_Sub1 class534_sub1;
	    if (i == 1)
		class534_sub1 = new Class534_Sub1_Sub4(this);
	    else if (i == 4)
		class534_sub1 = new Class534_Sub1_Sub2(this);
	    else if (i == 3)
		class534_sub1 = new Class534_Sub1_Sub3(this);
	    else if (2 == i)
		class534_sub1 = new Class534_Sub1_Sub5(this);
	    else if (5 == i)
		class534_sub1 = new Class534_Sub1_Sub1(this);
	    else
		throw new RuntimeException("");
	    class534_sub1.method16012(class534_sub40, 2006527092);
	    aClass700_3614.method14131(class534_sub1, (short) 789);
	}
    }
    
    public Class351(Class534_Sub40 class534_sub40) {
	method6181(class534_sub40, 455910536);
    }
    
    public void method6179(Class534_Sub26 class534_sub26, int i) {
	if ((8258869577519436579L * class534_sub26.aLong7158
	     != -2812197886301046507L * aLong3617)
	    || (-1463586551359373421L * class534_sub26.aLong10584
		!= aLong3613 * 2592347801994286605L))
	    throw new RuntimeException("");
	for (Class534_Sub1 class534_sub1
		 = (Class534_Sub1) aClass700_3614.method14135((byte) -1);
	     class534_sub1 != null;
	     class534_sub1
		 = (Class534_Sub1) aClass700_3614.method14139(1882896283))
	    class534_sub1.method16011(class534_sub26, -1041729382);
	class534_sub26.aLong10584 += 2175811687201928859L;
    }
    
    void method6180(Class534_Sub40 class534_sub40) {
	aLong3617
	    = class534_sub40.method16537(1359621443) * 1459222115322203709L;
	aLong3613
	    = class534_sub40.method16537(1359621443) * -1978959866441963323L;
	for (int i = class534_sub40.method16527(-313721051); i != 0;
	     i = class534_sub40.method16527(-807838375)) {
	    Class534_Sub1 class534_sub1;
	    if (i == 1)
		class534_sub1 = new Class534_Sub1_Sub4(this);
	    else if (i == 4)
		class534_sub1 = new Class534_Sub1_Sub2(this);
	    else if (i == 3)
		class534_sub1 = new Class534_Sub1_Sub3(this);
	    else if (2 == i)
		class534_sub1 = new Class534_Sub1_Sub5(this);
	    else if (5 == i)
		class534_sub1 = new Class534_Sub1_Sub1(this);
	    else
		throw new RuntimeException("");
	    class534_sub1.method16012(class534_sub40, 932528835);
	    aClass700_3614.method14131(class534_sub1, (short) 789);
	}
    }
    
    void method6181(Class534_Sub40 class534_sub40, int i) {
	aLong3617
	    = class534_sub40.method16537(1359621443) * 1459222115322203709L;
	aLong3613
	    = class534_sub40.method16537(1359621443) * -1978959866441963323L;
	for (int i_0_ = class534_sub40.method16527(-1166583017); i_0_ != 0;
	     i_0_ = class534_sub40.method16527(-1270698001)) {
	    Class534_Sub1 class534_sub1;
	    if (i_0_ == 1)
		class534_sub1 = new Class534_Sub1_Sub4(this);
	    else if (i_0_ == 4)
		class534_sub1 = new Class534_Sub1_Sub2(this);
	    else if (i_0_ == 3)
		class534_sub1 = new Class534_Sub1_Sub3(this);
	    else if (2 == i_0_)
		class534_sub1 = new Class534_Sub1_Sub5(this);
	    else if (5 == i_0_)
		class534_sub1 = new Class534_Sub1_Sub1(this);
	    else
		throw new RuntimeException("");
	    class534_sub1.method16012(class534_sub40, -128152218);
	    aClass700_3614.method14131(class534_sub1, (short) 789);
	}
    }
    
    static final void method6182(Class669 class669, byte i) {
	int i_1_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_1_, 1933647141);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_1_ >> 16];
	Class43.method1075(class247, class243, class669, (byte) 12);
    }
    
    static final void method6183(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class20.method801(class247, class243, class669, (short) 16720);
    }
    
    static final void method6184(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	boolean bool
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307] == 1;
	int i_2_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	Class247 class247 = Class112.method2017(i_2_, -146503536);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_2_ >> 16];
	Class263.method4831(class247, class243, class669,
			    (bool ? Class253.aClass253_2660
			     : Class253.aClass253_2661),
			    (byte) 24);
    }
    
    static final void method6185(Class669 class669, int i) {
	int i_3_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_3_, 1078426926);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_3_ >> 16];
	Class70.method1411(class247, class243, class669, 16711935);
    }
    
    static void method6186(byte i) {
	Class540.anIntArray7174
	    = Class200_Sub1.method15567(2048, 35, 8, 8, 4, 0.4F, true,
					-507461926);
    }
    
    public static void method6187(int i, int i_4_) {
	int i_5_ = client.aList11233.indexOf(Integer.valueOf(i));
	if (i_5_ == -1)
	    client.aList11233.add(Integer.valueOf(i));
    }
    
    static void method6188(Class534_Sub40 class534_sub40, byte i) {
	for (;;) {
	    int i_6_ = class534_sub40.method16527(526514911);
	    switch (i_6_) {
	    case 0:
		Class201.anInt2182
		    = class534_sub40.method16529((byte) 1) * -118291573;
		Class201.anInt2179
		    = class534_sub40.method16529((byte) 1) * 156456701;
		break;
	    case 255:
		return;
	    }
	}
    }
}
