/* Class36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Component;

public class Class36
{
    static final int anInt286 = 7;
    static final int anInt287 = 127;
    static long aLong288;
    
    static void method932(Class185 class185, int i, int i_0_,
			  Class247 class247) {
	int i_1_ = 127;
	int i_2_ = 7;
	for (int i_3_ = 63; i_3_ >= 0; i_3_--) {
	    int i_4_ = (i_3_ & 0x3f) << 10 | (i_2_ & 0x7) << 7 | i_1_ & 0x7f;
	    Class456.method7426(false, true, 1739452007);
	    int i_5_ = Class415.anIntArray4666[i_4_];
	    Class54.method1212(false, true, -1594051043);
	    class185.method3298(i,
				i_0_ + ((63 - i_3_) * (-1279656873
						       * class247.anInt2469)
					>> 6),
				-881188269 * class247.anInt2468,
				(class247.anInt2469 * -1279656873 >> 6) + 1,
				~0xffffff | i_5_, 0);
	}
    }
    
    static void method933(Class185 class185, int i, int i_6_,
			  Class247 class247) {
	int i_7_ = 127;
	int i_8_ = 7;
	for (int i_9_ = 63; i_9_ >= 0; i_9_--) {
	    int i_10_ = (i_9_ & 0x3f) << 10 | (i_8_ & 0x7) << 7 | i_7_ & 0x7f;
	    Class456.method7426(false, true, 1739452007);
	    int i_11_ = Class415.anIntArray4666[i_10_];
	    Class54.method1212(false, true, -1912036622);
	    class185.method3298(i,
				i_6_ + ((63 - i_9_) * (-1279656873
						       * class247.anInt2469)
					>> 6),
				-881188269 * class247.anInt2468,
				(class247.anInt2469 * -1279656873 >> 6) + 1,
				~0xffffff | i_11_, 0);
	}
    }
    
    Class36() throws Throwable {
	throw new Error();
    }
    
    public static Class563 method934(Component component, boolean bool,
				     int i) {
	return new Class563_Sub1(component, bool);
    }
    
    static long method935(short i) {
	return Class498.aClass502_5556.method8297(-189842678);
    }
    
    static final void method936(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	int i_12_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_13_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aClass219_11338.method4120(i_12_, (byte) 120)
		  .method4355(i_13_, -1648141436) ? 1 : 0;
    }
    
    static final void method937(Class247 class247, Class243 class243,
				Class669 class669, short i) {
	class247.aString2483
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
    }
    
    static final void method938(Class669 class669, byte i)
	throws Exception_Sub2 {
	Class599.aClass298_Sub1_7871.method5357(((float) (class669
							  .anIntArray8595
							  [((class669.anInt8600
							     -= 308999563)
							    * 2088438307)])
						 / 1000.0F),
						1447807243);
    }
}
