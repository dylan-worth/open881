/* Class507 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class507
{
    public static Class507 aClass507_5664;
    public static Class507 aClass507_5665;
    static Class507 aClass507_5666 = new Class507();
    static Class507 aClass507_5667;
    
    Class507() {
	/* empty */
    }
    
    static {
	aClass507_5664 = new Class507();
	aClass507_5665 = new Class507();
	aClass507_5667 = new Class507();
    }
    
    static final void method8365(Class669 class669, int i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_0_, -528517140);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_0_ >> 16];
	Class470.method7645(class247, class243, class669, (byte) -12);
    }
    
    static final void method8366(Class669 class669, byte i) {
	if (9 == -1850530127 * client.anInt11039)
	    Class5.aBool51
		= (class669.anIntArray8595
		   [(class669.anInt8600 -= 308999563) * 2088438307]) == 1;
    }
    
    static final void method8367(Class669 class669, short i) {
	class669.anInt8600 -= 308999563;
    }
    
    static final void method8368(Class669 class669, int i) {
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub40_10789,
	     (class669.anIntArray8595
	      [(class669.anInt8600 -= 308999563) * 2088438307]) == 1 ? 1 : 0,
	     854913401);
	Class672.method11096((byte) 1);
	client.aBool11048 = false;
    }
}
