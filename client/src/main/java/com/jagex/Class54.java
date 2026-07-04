/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.net.InetAddress;
import java.net.UnknownHostException;

import jaclib.ping.Ping;

public class Class54 implements Runnable
{
    volatile boolean aBool443;
    String aString444;
    InetAddress anInetAddress445;
    volatile long aLong446 = 7672106161660382005L;
    
    void method1194(int i) {
	if (null != anInetAddress445) {
	    try {
		byte[] is = anInetAddress445.getAddress();
		aLong446
		    = (long) Ping.method603(is[0], is[1], is[2], is[3],
					    10000L) * -7672106161660382005L;
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	Class251.method4622(1000L);
    }
    
    void method1195(String string, byte i) {
	aString444 = string;
	anInetAddress445 = null;
	aLong446 = 7672106161660382005L;
	if (aString444 != null) {
	    try {
		anInetAddress445 = InetAddress.getByName(aString444);
	    } catch (UnknownHostException unknownhostexception) {
		/* empty */
	    }
	}
    }
    
    long method1196(byte i) {
	return -2314207964387602205L * aLong446;
    }
    
    void method1197() {
	if (null != anInetAddress445) {
	    try {
		byte[] is = anInetAddress445.getAddress();
		aLong446
		    = (long) Ping.method603(is[0], is[1], is[2], is[3],
					    10000L) * -7672106161660382005L;
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	Class251.method4622(1000L);
    }
    
    public void run() {
	while (aBool443)
	    method1194(-1684663225);
    }
    
    Class54() {
	aBool443 = true;
    }
    
    public void method1198() {
	while (aBool443)
	    method1194(-1677205719);
    }
    
    void method1199(String string) {
	aString444 = string;
	anInetAddress445 = null;
	aLong446 = 7672106161660382005L;
	if (aString444 != null) {
	    try {
		anInetAddress445 = InetAddress.getByName(aString444);
	    } catch (UnknownHostException unknownhostexception) {
		/* empty */
	    }
	}
    }
    
    long method1200() {
	return -2314207964387602205L * aLong446;
    }
    
    long method1201() {
	return -2314207964387602205L * aLong446;
    }
    
    long method1202() {
	return -2314207964387602205L * aLong446;
    }
    
    void method1203() {
	aBool443 = false;
    }
    
    void method1204() {
	aBool443 = false;
    }
    
    public void method1205() {
	while (aBool443)
	    method1194(-2009580965);
    }
    
    void method1206(int i) {
	aBool443 = false;
    }
    
    void method1207() {
	if (null != anInetAddress445) {
	    try {
		byte[] is = anInetAddress445.getAddress();
		aLong446
		    = (long) Ping.method603(is[0], is[1], is[2], is[3],
					    10000L) * -7672106161660382005L;
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	Class251.method4622(1000L);
    }
    
    void method1208(String string) {
	aString444 = string;
	anInetAddress445 = null;
	aLong446 = 7672106161660382005L;
	if (aString444 != null) {
	    try {
		anInetAddress445 = InetAddress.getByName(aString444);
	    } catch (UnknownHostException unknownhostexception) {
		/* empty */
	    }
	}
    }
    
    public static Class285 method1209(int i, int i_0_) {
	if (i == Class285.aClass285_3074.anInt3080 * -1821981511)
	    return Class285.aClass285_3074;
	if (-1821981511 * Class285.aClass285_3075.anInt3080 == i)
	    return Class285.aClass285_3075;
	if (i == -1821981511 * Class285.aClass285_3076.anInt3080)
	    return Class285.aClass285_3076;
	if (i == Class285.aClass285_3077.anInt3080 * -1821981511)
	    return Class285.aClass285_3077;
	if (Class285.aClass285_3078.anInt3080 * -1821981511 == i)
	    return Class285.aClass285_3078;
	if (-1821981511 * Class285.aClass285_3079.anInt3080 == i)
	    return Class285.aClass285_3079;
	return null;
    }
    
    static final void method1210(Class669 class669, byte i) {
	int i_1_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_1_, 805704233);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_1_ >> 16];
	RSSocket.method826(class247, class243, class669, (byte) -55);
    }
    
    static final void method1211(Class669 class669, byte i) {
	Class526 class526
	    = class669.aClass654_Sub1_Sub5_Sub1_8604.method18544(1889078841);
	if (class526 == null)
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	else
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= class526.method8743((byte) 77);
    }
    
    public static void method1212(boolean bool, boolean bool_2_, int i) {
	if (bool) {
	    Class661.anInt8547 -= 194044063;
	    if (0 == -477611169 * Class661.anInt8547)
		Class415.anIntArray4666 = null;
	}
	if (bool_2_) {
	    Class661.anInt8550 -= 555410307;
	    if (0 == Class661.anInt8550 * -68828373)
		Class661.anIntArray8549 = null;
	}
    }
}
