/* Class162 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;
import java.util.Iterator;

class Class162 implements Runnable
{
    Class367_Sub2 this$0;
    public static Class352 aClass352_1758;
    
    public void method2636() {
	try {
	    while (!this$0.aBool10282) {
		HashMap hashmap = this$0.method15873((byte) 63);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class496 class496 = (Class496) iterator.next();
		    if (!class496.aBool5547) {
			Class479[] class479s
			    = (Class479[]) hashmap.get(class496);
			for (int i = 0; i < class479s.length; i++)
			    class479s[i].method7821(-663055179);
		    }
		}
		Class251.method4622(25L);
	    }
	} catch (Exception exception) {
	    Class262.method4824(null, exception, (byte) 8);
	}
    }
    
    public void run() {
	try {
	    while (!this$0.aBool10282) {
		HashMap hashmap = this$0.method15873((byte) 37);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class496 class496 = (Class496) iterator.next();
		    if (!class496.aBool5547) {
			Class479[] class479s
			    = (Class479[]) hashmap.get(class496);
			for (int i = 0; i < class479s.length; i++)
			    class479s[i].method7821(-663055179);
		    }
		}
		Class251.method4622(25L);
	    }
	} catch (Exception exception) {
	    Class262.method4824(null, exception, (byte) 86);
	}
    }
    
    public void method2637() {
	try {
	    while (!this$0.aBool10282) {
		HashMap hashmap = this$0.method15873((byte) 102);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class496 class496 = (Class496) iterator.next();
		    if (!class496.aBool5547) {
			Class479[] class479s
			    = (Class479[]) hashmap.get(class496);
			for (int i = 0; i < class479s.length; i++)
			    class479s[i].method7821(-663055179);
		    }
		}
		Class251.method4622(25L);
	    }
	} catch (Exception exception) {
	    Class262.method4824(null, exception, (byte) -34);
	}
    }
    
    Class162(Class367_Sub2 class367_sub2) {
	this$0 = class367_sub2;
    }
    
    static final void method2638(Class669 class669, byte i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class15 class15
	    = (Class15) Class531.aClass44_Sub7_7135.method91(i_0_, -855669958);
	if (368739509 * class15.anInt158 >= 0
	    && class15.anInt159 * 615907051 >= 0)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= class15.anInt159 * 615907051;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= i_0_;
    }
    
    static final void method2639(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.anInt11185 * -993629849;
    }
    
    public static int method2640(int i, byte i_1_) {
	i = --i | i >>> 1;
	i |= i >>> 2;
	i |= i >>> 4;
	i |= i >>> 8;
	i |= i >>> 16;
	return i + 1;
    }
    
    static void method2641(Class247 class247, int i, int i_2_, int i_3_) {
	Class246 class246
	    = class247.method4525(Class254.aClass185_2683, 447549967);
	if (null != class246) {
	    Class254.aClass185_2683.method3373
		(i, i_2_, i + -881188269 * class247.anInt2468,
		 class247.anInt2469 * -1279656873 + i_2_);
	    if (1265431623 * Class113.anInt1365 < 3) {
		int i_4_;
		if (Class10.anInt75 * -891094135 == 3)
		    i_4_ = (int) -((double) Class599.aClass298_Sub1_7871
						.method5389(-494333729)
				   * 2607.5945876176133);
		else
		    i_4_ = (int) -client.aFloat11140;
		i_4_ = i_4_ + 204292618 * client.anInt11189 & 0x3fff;
		i_4_ <<= 2;
		Class581_Sub1.aClass163_10593.method2675
		    (((float) (-881188269 * class247.anInt2468) / 2.0F
		      + (float) i),
		     ((float) (class247.anInt2469 * -1279656873) / 2.0F
		      + (float) i_2_),
		     4165, i_4_, class246.aClass145_2423, i, i_2_);
	    } else
		Class254.aClass185_2683
		    .method3324(-16777216, class246.aClass145_2423, i, i_2_);
	}
    }
    
    static final void method2642(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	class669.anInt8600 -= 926998689;
	int i_5_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	short i_6_ = (short) (class669.anIntArray8595
			      [1 + class669.anInt8600 * 2088438307]);
	short i_7_ = (short) (class669.anIntArray8595
			      [2 + 2088438307 * class669.anInt8600]);
	if (i_5_ >= 0 && i_5_ < 5) {
	    class247.method4530(i_5_, i_6_, i_7_, 271450354);
	    Class454.method7416(class247, -1793328674);
	    if (class247.anInt2580 * 1365669833 == -1 && !class243.aBool2413)
		Class534_Sub18_Sub4.method18115((class247.anInt2454
						 * -1278450723),
						i_5_, (byte) -6);
	}
    }
    
    public static Class302 method2643(int i, int i_8_) {
	Class302[] class302s = Class352.method6261(-260246624);
	for (int i_9_ = 0; i_9_ < class302s.length; i_9_++) {
	    Class302 class302 = class302s[i_9_];
	    if (1453209707 * class302.anInt3244 == i)
		return class302;
	}
	return null;
    }
}
