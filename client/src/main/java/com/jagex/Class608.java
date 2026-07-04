/* Class608 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import com.jagex.twitchtv.TwitchWebcamDevice;

public class Class608 implements Interface76
{
    static Class608 aClass608_7996;
    static Class608 aClass608_7997;
    static Class608 aClass608_7998;
    static Class608 aClass608_7999 = new Class608(0);
    static Class608 aClass608_8000;
    static Class608 aClass608_8001;
    int anInt8002;
    
    public int method53() {
	return anInt8002 * -1643387535;
    }
    
    public int method93() {
	return anInt8002 * -1643387535;
    }
    
    static {
	aClass608_7997 = new Class608(1);
	aClass608_7998 = new Class608(2);
	aClass608_7996 = new Class608(3);
	aClass608_8000 = new Class608(4);
	aClass608_8001 = new Class608(5);
    }
    
    public int method22() {
	return anInt8002 * -1643387535;
    }
    
    Class608(int i) {
	anInt8002 = i * -628999279;
    }
    
    public static Class608[] method10064() {
	return (new Class608[]
		{ aClass608_7998, aClass608_8000, aClass608_7999,
		  aClass608_8001, aClass608_7997, aClass608_7996 });
    }
    
    public static Class608[] method10065() {
	return (new Class608[]
		{ aClass608_7998, aClass608_8000, aClass608_7999,
		  aClass608_8001, aClass608_7997, aClass608_7996 });
    }
    
    static final void method10066(Class669 class669, int i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class570 class570
	    = ((Class570)
	       Class200_Sub23.aClass44_Sub14_10041.method91(i_0_, 950856824));
	if (null != class570.anIntArray7621
	    && class570.anIntArray7621.length > 0) {
	    int i_1_ = 0;
	    int i_2_ = class570.anIntArray7622[0];
	    for (int i_3_ = 1; i_3_ < class570.anIntArray7621.length; i_3_++) {
		if (class570.anIntArray7622[i_3_] > i_2_) {
		    i_1_ = i_3_;
		    i_2_ = class570.anIntArray7622[i_3_];
		}
	    }
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= class570.anIntArray7621[i_1_];
	} else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 1103529081 * class570.anInt7650;
    }
    
    static final void method10067(Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	String string_4_
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	Class534_Sub19 class534_sub19
	    = Class346.method6128(Class404.aClass404_4163,
				  client.aClass100_11094.aClass13_1183,
				  1341391005);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16507
	    ((Class668.method11029(string, (byte) 0)
	      + Class668.method11029(string_4_, (byte) 0)),
	     1517543055);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16713(string,
							      -791530043);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16713(string_4_,
							      -260677683);
	client.aClass100_11094.method1863(class534_sub19, (byte) 47);
    }
    
    static final void method10068(Class669 class669, int i) {
	/* empty */
    }
    
    static void method10069(Class669 class669, int i) {
	int i_5_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	TwitchWebcamDevice twitchwebcamdevice
	    = Class562.method9468(i_5_, -1462724692);
	if (twitchwebcamdevice == null) {
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
}
