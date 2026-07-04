/* Class483 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class483 implements Interface76
{
    public static Class483 aClass483_5271
	= new Class483(4, 0, java.lang.Integer.class, new Class477());
    public static Class483 aClass483_5272
	= new Class483(3, 1, java.lang.Long.class, new Class489());
    Interface11 anInterface11_5273;
    static Class483 aClass483_5274;
    static Class483 aClass483_5275;
    public int anInt5276;
    int anInt5277;
    public Class aClass5278;
    public static Class483 aClass483_5279
	= new Class483(0, 2, java.lang.String.class, new Class487());
    public static int anInt5280;
    
    public static Class483[] method7934() {
	return new Class483[] { aClass483_5279, aClass483_5272, aClass483_5274,
				aClass483_5275, aClass483_5271 };
    }
    
    public static Interface11 method7935(Class var_class) {
	Class483 class483 = method7936(var_class, (byte) 3);
	if (null == class483)
	    throw new IllegalArgumentException();
	return class483.anInterface11_5273;
    }
    
    static Class483 method7936(Class var_class, byte i) {
	Class483[] class483s = method7942(-88965010);
	for (int i_0_ = 0; i_0_ < class483s.length; i_0_++) {
	    Class483 class483 = class483s[i_0_];
	    if (var_class == class483.aClass5278)
		return class483;
	}
	return null;
    }
    
    public static Interface11 method7937(Class var_class, int i) {
	Class483 class483 = method7936(var_class, (byte) 3);
	if (null == class483)
	    throw new IllegalArgumentException();
	return class483.anInterface11_5273;
    }
    
    public int method93() {
	return -419180315 * anInt5277;
    }
    
    static Class483 method7938(Class var_class) {
	Class483[] class483s = method7942(-88965010);
	for (int i = 0; i < class483s.length; i++) {
	    Class483 class483 = class483s[i];
	    if (var_class == class483.aClass5278)
		return class483;
	}
	return null;
    }
    
    static {
	aClass483_5274 = new Class483(1, 3, com.jagex.Class534_Sub36.class,
				      new Class482());
	aClass483_5275
	    = new Class483(2, 4, com.jagex.Class257.class, new Class494());
    }
    
    public int method22() {
	return -419180315 * anInt5277;
    }
    
    public int method53() {
	return -419180315 * anInt5277;
    }
    
    public static Class483[] method7939() {
	return new Class483[] { aClass483_5279, aClass483_5272, aClass483_5274,
				aClass483_5275, aClass483_5271 };
    }
    
    public static Class483[] method7940() {
	return new Class483[] { aClass483_5279, aClass483_5272, aClass483_5274,
				aClass483_5275, aClass483_5271 };
    }
    
    public static Class483[] method7941() {
	return new Class483[] { aClass483_5279, aClass483_5272, aClass483_5274,
				aClass483_5275, aClass483_5271 };
    }
    
    public static Class483[] method7942(int i) {
	return new Class483[] { aClass483_5279, aClass483_5272, aClass483_5274,
				aClass483_5275, aClass483_5271 };
    }
    
    static void method7943(int i, int i_1_) {
	Class99.aClass203_1168.method3876(i, (byte) 0);
    }
    
    static Class483 method7944(Class var_class) {
	Class483[] class483s = method7942(-88965010);
	for (int i = 0; i < class483s.length; i++) {
	    Class483 class483 = class483s[i];
	    if (var_class == class483.aClass5278)
		return class483;
	}
	return null;
    }
    
    static Class483 method7945(Class var_class) {
	Class483[] class483s = method7942(-88965010);
	for (int i = 0; i < class483s.length; i++) {
	    Class483 class483 = class483s[i];
	    if (var_class == class483.aClass5278)
		return class483;
	}
	return null;
    }
    
    Class483(int i, int i_2_, Class var_class, Interface11 interface11) {
	anInt5276 = i * 1634014943;
	anInt5277 = 629894381 * i_2_;
	aClass5278 = var_class;
	anInterface11_5273 = interface11;
    }
    
    public Object method7946(Class534_Sub40 class534_sub40) {
	return anInterface11_5273.method75(class534_sub40, 754449697);
    }
    
    public Object method7947(Class534_Sub40 class534_sub40, int i) {
	return anInterface11_5273.method75(class534_sub40, -628847967);
    }
    
    public Object method7948(Class534_Sub40 class534_sub40) {
	return anInterface11_5273.method75(class534_sub40, -64588451);
    }
    
    static final void method7949(Class669 class669, short i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aClass214_11359.method4074(-225173386).size();
    }
    
    static void method7950(Class669 class669, int i) {
	int i_3_ = Class709.method14305(2018424041);
	if (i_3_ < 0) {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	} else {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= (Class534_Sub25.aTwitchEventLiveStreams10576.viewerCounts
		   [i_3_]);
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= (Class534_Sub25.aTwitchEventLiveStreams10576.channelUrls
		   [i_3_]);
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= (Class534_Sub25.aTwitchEventLiveStreams10576
		   .previewUrlTemplates[i_3_]);
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= (Class534_Sub25.aTwitchEventLiveStreams10576.streamTitles
		   [i_3_]);
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= (Class534_Sub25.aTwitchEventLiveStreams10576
		   .channelDisplayNames[i_3_]);
	}
    }
    
    static final void method7951(Class669 class669, int i) {
	int i_4_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_4_, 710203017);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_4_ >> 16];
	Class246.method4505(class247, class243, class669, (byte) 34);
    }
    
    static final void method7952(Class669 class669, int i)
	throws Exception_Sub2 {
	class669.anInt8600 -= 617999126;
	boolean bool
	    = 1 == class669.anIntArray8595[2088438307 * class669.anInt8600];
	boolean bool_5_
	    = (class669.anIntArray8595[2088438307 * class669.anInt8600 + 1]
	       == 1);
	Class599.aClass298_Sub1_7871.method5371(bool, bool_5_, -1210972402);
    }
}
