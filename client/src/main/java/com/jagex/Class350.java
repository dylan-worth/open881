/* Class350 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class350
{
    int anInt3593;
    public static Class350 aClass350_3594;
    public static Class350 aClass350_3595;
    public static Class350 aClass350_3596;
    public static Class350 aClass350_3597;
    int anInt3598;
    public static Class350 aClass350_3599;
    static Class350 aClass350_3600;
    static Class350 aClass350_3601;
    static Class350 aClass350_3602;
    static Class350 aClass350_3603;
    public static Class350 aClass350_3604;
    public int anInt3605;
    static final int anInt3606 = 16;
    static int anInt3607;
    public int anInt3608;
    static Class350 aClass350_3609;
    public static Class350 aClass350_3610
	= new Class350(6, 0, 3, Class173.aClass173_1826);
    Class173 aClass173_3611;
    
    static Class350 method6176(int i) {
	switch (i) {
	case 1:
	    return aClass350_3594;
	case 2:
	    return aClass350_3595;
	case 4:
	    return aClass350_3597;
	case 3:
	    return aClass350_3596;
	case 5:
	    return aClass350_3604;
	case 0:
	    return aClass350_3610;
	case 6:
	    return aClass350_3599;
	default:
	    return null;
	}
    }
    
    Class350(int i, int i_0_, int i_1_, Class173 class173) {
	anInt3605 = i;
	anInt3593 = i_0_;
	anInt3598 = i_1_;
	aClass173_3611 = class173;
	anInt3608 = anInt3598 * (aClass173_3611.anInt1825 * 1899960707);
	if (anInt3593 >= 16)
	    throw new RuntimeException();
    }
    
    static {
	aClass350_3594 = new Class350(1, 1, 3, Class173.aClass173_1826);
	aClass350_3595 = new Class350(3, 2, 4, Class173.aClass173_1830);
	aClass350_3596 = new Class350(0, 3, 1, Class173.aClass173_1826);
	aClass350_3597 = new Class350(8, 4, 2, Class173.aClass173_1826);
	aClass350_3604 = new Class350(2, 5, 3, Class173.aClass173_1826);
	aClass350_3599 = new Class350(11, 6, 4, Class173.aClass173_1826);
	aClass350_3600 = new Class350(10, 7, 4, Class173.aClass173_1826);
	aClass350_3609 = new Class350(5, 8, 4, Class173.aClass173_1826);
	aClass350_3602 = new Class350(7, 9, 4, Class173.aClass173_1826);
	aClass350_3603 = new Class350(4, 10, 3, Class173.aClass173_1826);
	aClass350_3601 = new Class350(9, 11, 3, Class173.aClass173_1826);
	anInt3607 = Class695.method14072(16, (byte) -59);
    }
    
    static Class350 method6177(int i) {
	switch (i) {
	case 1:
	    return aClass350_3594;
	case 2:
	    return aClass350_3595;
	case 4:
	    return aClass350_3597;
	case 3:
	    return aClass350_3596;
	case 5:
	    return aClass350_3604;
	case 0:
	    return aClass350_3610;
	case 6:
	    return aClass350_3599;
	default:
	    return null;
	}
    }
}
