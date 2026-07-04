/* Class130 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamDeviceCapability;

public class Class130 implements Interface21
{
    float[] aFloatArray1520;
    int anInt1521;
    int anInt1522;
    static int anInt1523;
    public static Class472 aClass472_1524;
    static int anInt1525;
    
    public void method141() {
	/* empty */
    }
    
    Class130(int i, int i_0_) {
	anInt1521 = i * -828002397;
	anInt1522 = 1704609127 * i_0_;
	aFloatArray1520
	    = new float[339609175 * anInt1522 * (1306524683 * anInt1521)];
    }
    
    public int method93() {
	return anInt1522 * 339609175;
    }
    
    public void method143() {
	/* empty */
    }
    
    public int method22() {
	return 1306524683 * anInt1521;
    }
    
    public int method53() {
	return 1306524683 * anInt1521;
    }
    
    public int method85() {
	return anInt1522 * 339609175;
    }
    
    public int method88() {
	return anInt1522 * 339609175;
    }
    
    public int method8() {
	return anInt1522 * 339609175;
    }
    
    public int method1() {
	return 1306524683 * anInt1521;
    }
    
    public int method9() {
	return anInt1522 * 339609175;
    }
    
    public void method142() {
	/* empty */
    }
    
    public int method145() {
	return anInt1522 * 339609175;
    }
    
    public void method144() {
	/* empty */
    }
    
    static void method2301(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	int i_1_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_2_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	TwitchWebcamDevice twitchwebcamdevice
	    = Class562.method9468(i_1_, -1219343554);
	TwitchWebcamDeviceCapability twitchwebcamdevicecapability = null;
	if (twitchwebcamdevice != null)
	    twitchwebcamdevicecapability = twitchwebcamdevice.method1794(i_2_);
	if (null == twitchwebcamdevicecapability) {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	} else {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1656448669 * twitchwebcamdevicecapability.anInt1150;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= twitchwebcamdevicecapability.anInt1151 * -1356474957;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1260779495 * twitchwebcamdevicecapability.anInt1152;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1646869335 * twitchwebcamdevicecapability.anInt1153;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -2026063923 * twitchwebcamdevicecapability.anInt1154;
	}
    }
    
    static final void method2302(Class669 class669, byte i) {
	int i_3_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (-1 == i_3_)
	    throw new RuntimeException();
	Class41 class41
	    = ((Class41)
	       Class667.aClass44_Sub21_8582.method91(i_3_, -823016857));
	if (class41.aClass493_314 != Class493.aClass493_5496)
	    throw new RuntimeException();
	int[] is = class41.method1042(string, (short) -31125);
	int i_4_ = 0;
	if (is != null)
	    i_4_ = is.length;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_4_;
    }
    
    static final void method2303(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (476125061 * client.anInt11204
	       == class669.aClass654_Sub1_Sub5_Sub1_8604
		      .method18549((byte) 5)) ? 1 : 0;
    }
    
    static final void method2304(Class669 class669, short i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 0;
    }
    
    static final void method2305(Class247 class247, Class243 class243,
				 Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	int i_5_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_6_
	    = class669.anIntArray8595[1 + 2088438307 * class669.anInt8600];
	Class90 class90 = (Class90) Class534_Sub11_Sub13
					.aClass44_Sub22_11730
					.method91(i_5_, 1257004916);
	if (i_6_ != class90.anInt888 * 263946597)
	    class247.method4567(i_5_, i_6_, (byte) -56);
	else
	    class247.method4549(i_5_, -1369024568);
    }
    
    static Class712[] method2306(int i) {
	return (new Class712[]
		{ Class712.aClass712_8876, Class712.aClass712_8880,
		  Class712.aClass712_8882, Class712.aClass712_8881,
		  Class712.aClass712_8879 });
    }
}
