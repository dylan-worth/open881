/* Class309 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class309
{
    static Class309 aClass309_3353;
    static Class309 aClass309_3354 = new Class309(0);
    
    Class309(int i) {
	/* empty */
    }
    
    static {
	aClass309_3353 = new Class309(1);
    }
    
    public static Class508 method5657(byte i) {
	return Class498.aClass508_5585;
    }
    
    static void method5658(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	class669.anIntArray8595[class669.anInt8600 * 2088438307]
	    = Class451.method7387((class669.anIntArray8595
				   [class669.anInt8600 * 2088438307]),
				  (class669.anIntArray8595
				   [2088438307 * class669.anInt8600 + 1]),
				  1500288881);
	class669.anInt8600 += 308999563;
    }
    
    static final void method5659(Class669 class669, int i) {
	Class625.method10330(class669,
			     Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419,
			     1319794006);
    }
    
    static final void method5660(Class669 class669, short i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_0_, 566844066);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class247.anInt2480 * 1500908359;
    }
}
