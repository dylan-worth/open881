/* Class325 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class325
{
    static final int anInt3451 = 11;
    static final int anInt3452 = 2048;
    static final int anInt3453 = 2;
    static final int anInt3454 = 6;
    static int[] anIntArray3455 = new int[512];
    
    static {
	int i = 9;
	for (int i_0_ = i - 1; i_0_ >= 0; i_0_--) {
	    int i_1_ = 1 << i - i_0_ - 1;
	    int i_2_ = 1 << i - i_0_;
	    for (int i_3_ = i_1_; i_3_ < i_2_; i_3_++)
		anIntArray3455[i_3_]
		    = (i_0_ << 6) + (i_2_ - i_3_ << 6 >>> i - i_0_ - 1);
	}
    }
    
    static final void method5816(Class669 class669, short i) {
	int i_4_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_4_, 1547469817);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_4_ >> 16];
	Class567.method9560(class247, class243, class669, (byte) 1);
    }
    
    static final void method5817(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	class669.anInt8600 -= 1235998252;
	class247.anInt2518 = 41070409 * (class669.anIntArray8595
					 [2088438307 * class669.anInt8600]);
	class247.anInt2573
	    = (class669.anIntArray8595[1 + class669.anInt8600 * 2088438307]
	       * -2102679829);
	class247.anInt2520
	    = (class669.anIntArray8595[class669.anInt8600 * 2088438307 + 2]
	       * -1553197639);
	class247.anInt2521
	    = (-782514323
	       * class669.anIntArray8595[class669.anInt8600 * 2088438307 + 3]);
	Class454.method7416(class247, -977200702);
    }
    
    public static void method5818(Class26 class26, byte i) {
	Class185.method3694(new Class572(class26), -1600474947);
    }
}
