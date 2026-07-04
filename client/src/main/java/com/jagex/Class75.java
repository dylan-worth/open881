/* Class75 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import com.jagex.twitchtv.TwitchTV;

public abstract class Class75 implements Interface6
{
    Class203 aClass203_801;
    Class472 aClass472_802;
    
    void method1574(int i) {
	aClass203_801 = new Class203(i);
    }
    
    Class75(Class472 class472, int i) {
	aClass472_802 = class472;
	aClass203_801 = new Class203(i);
    }
    
    void method1575(int i, byte i_0_) {
	aClass203_801 = new Class203(i);
    }
    
    void method1576(int i, int i_1_) {
	synchronized (aClass203_801) {
	    aClass203_801.method3876(i, (byte) 0);
	}
    }
    
    void method1577() {
	synchronized (aClass203_801) {
	    aClass203_801.method3884((byte) -9);
	}
    }
    
    void method1578(int i) {
	aClass203_801 = new Class203(i);
    }
    
    void method1579(int i) {
	synchronized (aClass203_801) {
	    aClass203_801.method3877(-492084821);
	}
    }
    
    void method1580() {
	synchronized (aClass203_801) {
	    aClass203_801.method3877(-1987075643);
	}
    }
    
    void method1581() {
	synchronized (aClass203_801) {
	    aClass203_801.method3877(382747188);
	}
    }
    
    void method1582() {
	synchronized (aClass203_801) {
	    aClass203_801.method3877(-260010690);
	}
    }
    
    void method1583(byte i) {
	synchronized (aClass203_801) {
	    aClass203_801.method3884((byte) -116);
	}
    }
    
    void method1584(int i) {
	synchronized (aClass203_801) {
	    aClass203_801.method3876(i, (byte) 0);
	}
    }
    
    void method1585() {
	synchronized (aClass203_801) {
	    aClass203_801.method3884((byte) -52);
	}
    }
    
    void method1586() {
	synchronized (aClass203_801) {
	    aClass203_801.method3877(1747726225);
	}
    }
    
    static int method1587(int i) {
	try {
	    for (int i_2_ = 0; i_2_ < Class574.aStringArray7690.length;
		 i_2_++) {
		if (Class574.aStringArray7690[i_2_] != null
		    && Class574.aBoolArray7689[i_2_])
		    Class112.method2018(-1327590673).method400
			(Class574.aStringArray7690[i_2_], -984519344);
	    }
	} catch (Exception_Sub3 exception_sub3) {
	    return 3;
	}
	Class523.aTwitchTV7088 = new TwitchTV();
	int i_3_ = Class523.aTwitchTV7088
		       .InitialiseTTV(Class650.method10722(-1282201971));
	if (i_3_ == 0)
	    Class574.aBool7696 = true;
	else
	    Class262.method4824(new StringBuilder().append(10).append
				    (Class29.aString260).append
				    (i_3_).toString(),
				new RuntimeException(), (byte) -78);
	return 2;
    }
    
    static final void method1588(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	int i_4_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class491.method8082(i_4_, class247, class669, (byte) 52);
    }
}
