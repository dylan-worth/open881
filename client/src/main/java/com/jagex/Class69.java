/* Class69 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.File;
import java.io.IOException;

import com.jagex.twitchtv.TwitchWebcamDevice;

public class Class69
{
    static Class106 aClass106_726;
    static String aString727
	= new StringBuilder().append(Class226.method4178((byte) 69)).append
	      ("\\RuneScape-Setup.exe").toString();
    public static Class630 aClass630_728;
    static int anInt729;
    
    static boolean method1389() {
	if (Class228.aProcess2321 == null)
	    return false;
	boolean bool;
	try {
	    Class228.aProcess2321.exitValue();
	    bool = true;
	} catch (IllegalThreadStateException illegalthreadstateexception) {
	    return false;
	}
	return bool;
    }
    
    static {
	aClass106_726 = Class106.aClass106_1306;
    }
    
    public static int method1390() {
	Class409.method6709(1768982251);
	return aClass106_726.anInt1307 * 756058023;
    }
    
    public static void method1391() throws RuntimeException {
	if (Class503.aString5626.startsWith("win")) {
	    Class409.method6709(1768982251);
	    Object object = null;
	    String string = aString727;
	    File file = new File(string);
	    if (!file.isFile())
		throw new RuntimeException();
	    if (!file.canRead())
		throw new RuntimeException();
	    if (Class106.aClass106_1310 == aClass106_726)
		throw new RuntimeException();
	    try {
		Class228.aProcess2321
		    = new ProcessBuilder(new String[] { string }).start();
		aClass106_726 = Class106.aClass106_1310;
	    } catch (IOException ioexception) {
		throw new RuntimeException();
	    }
	}
    }
    
    Class69() throws Throwable {
	throw new Error();
    }
    
    public static int method1392() {
	Class409.method6709(1768982251);
	return aClass106_726.anInt1307 * 756058023;
    }
    
    static void method1393() {
	if (Class158.method2594(-1458061389)) {
	    aClass106_726
		= (Class228.aProcess2321.exitValue() == 0
		   ? Class106.aClass106_1308 : Class106.aClass106_1309);
	    Class228.aProcess2321 = null;
	}
    }
    
    static void method1394() {
	if (Class158.method2594(-1567298232)) {
	    aClass106_726
		= (Class228.aProcess2321.exitValue() == 0
		   ? Class106.aClass106_1308 : Class106.aClass106_1309);
	    Class228.aProcess2321 = null;
	}
    }
    
    public static void method1395() throws RuntimeException {
	if (Class503.aString5626.startsWith("win")) {
	    Class409.method6709(1768982251);
	    Object object = null;
	    String string = aString727;
	    File file = new File(string);
	    if (!file.isFile())
		throw new RuntimeException();
	    if (!file.canRead())
		throw new RuntimeException();
	    if (Class106.aClass106_1310 == aClass106_726)
		throw new RuntimeException();
	    try {
		Class228.aProcess2321
		    = new ProcessBuilder(new String[] { string }).start();
		aClass106_726 = Class106.aClass106_1310;
	    } catch (IOException ioexception) {
		throw new RuntimeException();
	    }
	}
    }
    
    public static int method1396(int i, int i_0_, float f, byte i_1_) {
	return Class197.method3817(i, i_0_, (int) f, -1057151992);
    }
    
    static void method1397(Class669 class669, byte i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	TwitchWebcamDevice twitchwebcamdevice
	    = Class633.method10498(string, 345214151);
	if (null == twitchwebcamdevice) {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	} else {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1989490985 * twitchwebcamdevice.anInt1141;
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= twitchwebcamdevice.aString1139;
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= twitchwebcamdevice.aString1140;
	}
    }
    
    static final void method1398(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class263.method4831(class247, class243, class669,
			    Class253.aClass253_2664, (byte) 60);
    }
    
    static final void method1399(Class669 class669, byte i)
	throws Exception_Sub2 {
	class669.anInt8600 -= 1235998252;
	float f
	    = (float) class669.anIntArray8595[2088438307 * class669.anInt8600];
	float f_2_ = (float) (class669.anIntArray8595
			      [1 + 2088438307 * class669.anInt8600]);
	float f_3_ = (float) (class669.anIntArray8595
			      [2088438307 * class669.anInt8600 + 2]);
	float f_4_ = ((float) (class669.anIntArray8595
			       [2088438307 * class669.anInt8600 + 3])
		      / 1000.0F);
	Class599.aClass298_Sub1_7871
	    .method5366(Class438.method6996(f, f_2_, f_3_), f_4_, (byte) -22);
    }
    
    static int method1400(Interface20 interface20, Interface14 interface14,
			  byte i) {
	int i_5_ = 0;
	for (int i_6_ = 0; i_6_ < interface14.method90((byte) 98); i_6_++) {
	    Class273 class273
		= (Class273) interface14.method91(i_6_, 53766116);
	    if (class273.method5075(interface20, (byte) 26))
		i_5_ += -1628667329 * class273.anInt3020;
	}
	return i_5_;
    }
    
    static final void method1401(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = -891094135 * Class10.anInt75 == 3 ? 1 : 0;
    }
}
