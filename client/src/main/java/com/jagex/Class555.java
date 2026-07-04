/* Class555 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;
import java.util.Iterator;

class Class555 implements Runnable
{
    Class367_Sub1 this$0;
    public static Class44_Sub16 aClass44_Sub16_7417;
    
    Class555(Class367_Sub1 class367_sub1) {
	this$0 = class367_sub1;
    }
    
    public void method9217() {
	try {
	    while (!this$0.aBool10149) {
		Iterator iterator = this$0.aList10155.iterator();
		while (iterator.hasNext()) {
		    Class569 class569 = (Class569) iterator.next();
		    class569.method9582(2021946034);
		}
		HashMap hashmap = this$0.method15778(-650296415);
		Iterator iterator_0_ = hashmap.keySet().iterator();
		while (iterator_0_.hasNext()) {
		    Class496 class496 = (Class496) iterator_0_.next();
		    if (!class496.aBool5547) {
			Class479[] class479s
			    = (Class479[]) hashmap.get(class496);
			for (int i = 0; i < class479s.length; i++)
			    class479s[i].method7833((byte) -64);
		    }
		}
		iterator_0_ = this$0.aList10155.iterator();
		while (iterator_0_.hasNext()) {
		    Class569 class569 = (Class569) iterator_0_.next();
		    class569.method9576((short) 256);
		}
		Class251.method4622(6L);
	    }
	} catch (Exception exception) {
	    Class262.method4824(null, exception, (byte) 30);
	    exception.printStackTrace();
	}
    }
    
    public void method9218() {
	try {
	    while (!this$0.aBool10149) {
		Iterator iterator = this$0.aList10155.iterator();
		while (iterator.hasNext()) {
		    Class569 class569 = (Class569) iterator.next();
		    class569.method9582(1295940833);
		}
		HashMap hashmap = this$0.method15778(-650296415);
		Iterator iterator_1_ = hashmap.keySet().iterator();
		while (iterator_1_.hasNext()) {
		    Class496 class496 = (Class496) iterator_1_.next();
		    if (!class496.aBool5547) {
			Class479[] class479s
			    = (Class479[]) hashmap.get(class496);
			for (int i = 0; i < class479s.length; i++)
			    class479s[i].method7833((byte) -12);
		    }
		}
		iterator_1_ = this$0.aList10155.iterator();
		while (iterator_1_.hasNext()) {
		    Class569 class569 = (Class569) iterator_1_.next();
		    class569.method9576((short) 256);
		}
		Class251.method4622(6L);
	    }
	} catch (Exception exception) {
	    Class262.method4824(null, exception, (byte) 50);
	    exception.printStackTrace();
	}
    }
    
    public void run() {
	try {
	    while (!this$0.aBool10149) {
		Iterator iterator = this$0.aList10155.iterator();
		while (iterator.hasNext()) {
		    Class569 class569 = (Class569) iterator.next();
		    class569.method9582(1579198641);
		}
		HashMap hashmap = this$0.method15778(-650296415);
		Iterator iterator_2_ = hashmap.keySet().iterator();
		while (iterator_2_.hasNext()) {
		    Class496 class496 = (Class496) iterator_2_.next();
		    if (!class496.aBool5547) {
			Class479[] class479s
			    = (Class479[]) hashmap.get(class496);
			for (int i = 0; i < class479s.length; i++)
			    class479s[i].method7833((byte) -38);
		    }
		}
		iterator_2_ = this$0.aList10155.iterator();
		while (iterator_2_.hasNext()) {
		    Class569 class569 = (Class569) iterator_2_.next();
		    class569.method9576((short) 256);
		}
		Class251.method4622(6L);
	    }
	} catch (Exception exception) {
	    Class262.method4824(null, exception, (byte) 21);
	    exception.printStackTrace();
	}
    }
    
    static final int method9219(int i, int i_3_, int i_4_) {
	int i_5_ = i_3_ * 57 + i;
	i_5_ = i_5_ << 13 ^ i_5_;
	int i_6_
	    = 1376312589 + i_5_ * (i_5_ * i_5_ * 15731 + 789221) & 0x7fffffff;
	return i_6_ >> 19 & 0xff;
    }
    
    public static void method9220(int i) {
	if (null != Class334.anInterface33Array3502) {
	    Interface33[] interface33s = Class334.anInterface33Array3502;
	    for (int i_7_ = 0; i_7_ < interface33s.length; i_7_++) {
		Interface33 interface33 = interface33s[i_7_];
		interface33.method210((byte) 1);
	    }
	}
    }
    
    static final void method9221(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class675.method11129(class247, class243, class669, 2022719733);
    }
    
    static final void method9222(Class669 class669, int i) {
	class669.anInt8600 -= 1853997378;
	int i_8_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_9_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	int i_10_
	    = class669.anIntArray8595[2 + 2088438307 * class669.anInt8600];
	int i_11_
	    = class669.anIntArray8595[3 + class669.anInt8600 * 2088438307];
	int i_12_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 4];
	int i_13_
	    = class669.anIntArray8595[5 + 2088438307 * class669.anInt8600];
	Class491 class491
	    = (Class171_Sub4.aClass232_9944.method4229
	       (Class211.aClass211_2256, Class171_Sub4.aClass232_9944, i_8_,
		i_9_, i_11_, Class190.aClass190_2134.method3763(-2109734853),
		Class207.aClass207_2235, 0.0F, 0.0F, null, 0, i_12_, false,
		484400750));
	if (null != class491)
	    Class171_Sub4.aClass232_9944.method4220(class491, i_13_, i_10_,
						    1715898787);
    }
    
    static final void method9223(Class669 class669, int i) {
	class669.anInt8600 -= 308999563;
    }
    
    static final void method9224(Class669 class669, int i) {
	int i_14_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_14_, 1908309973);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_14_ >> 16];
	Class637.method10554(class247, class243, class669, -2025550813);
    }
}
