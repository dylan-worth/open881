/* Class252 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class252 implements Interface76
{
    int anInt2654;
    public static Class252 aClass252_2655;
    public static Class252 aClass252_2656;
    int anInt2657;
    public static Class252 aClass252_2658 = new Class252(0, 0);
    
    public static Class252[] method4623() {
	return (new Class252[]
		{ aClass252_2658, aClass252_2655, aClass252_2656 });
    }
    
    public static Class252[] method4624(int i) {
	return (new Class252[]
		{ aClass252_2658, aClass252_2655, aClass252_2656 });
    }
    
    public int method93() {
	return anInt2654 * 1616233377;
    }
    
    static {
	aClass252_2655 = new Class252(1, 1);
	aClass252_2656 = new Class252(2, 2);
    }
    
    public int method22() {
	return anInt2654 * 1616233377;
    }
    
    Class252(int i, int i_0_) {
	anInt2657 = i * 893126787;
	anInt2654 = -1814765471 * i_0_;
    }
    
    public static Class252[] method4625() {
	return (new Class252[]
		{ aClass252_2658, aClass252_2655, aClass252_2656 });
    }
    
    public int method53() {
	return anInt2654 * 1616233377;
    }
    
    public static void method4626(boolean bool, int i) {
	/* empty */
    }
    
    static final void method4627(Class669 class669, int i) {
	int i_1_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_1_, 2099539619);
	Class660.method10948(class247, class669, (byte) -76);
    }
    
    static void method4628(Class669 class669, byte i) {
	class669.anIntArray8595[class669.anInt8600 * 2088438307 - 1]
	    = (((Class273)
		Class223.aClass53_Sub2_2316.method91((class669.anIntArray8595
						      [((2088438307
							 * class669.anInt8600)
							- 1)]),
						     -1524468458)).aBool3019
	       ? 1 : 0);
    }
    
    static Class571[] method4629(byte i) {
	return (new Class571[]
		{ Class571.aClass571_7664, Class571.aClass571_7666 });
    }
    
    static final void method4630(Class669 class669, int i) {
	int i_2_ = class669.anIntArray8591[662605117 * class669.anInt8613];
	Class534_Sub18_Sub8 class534_sub18_sub8
	    = Class228.method4190(i_2_, 1714038062);
	if (null == class534_sub18_sub8)
	    throw new RuntimeException();
	int[] is = new int[class534_sub18_sub8.anInt11754 * -39710947];
	Object[] objects
	    = new Object[1127446605 * class534_sub18_sub8.anInt11755];
	long[] ls = new long[class534_sub18_sub8.anInt11757 * -2103375343];
	for (int i_3_ = 0; i_3_ < class534_sub18_sub8.anInt11756 * 1952656637;
	     i_3_++)
	    is[i_3_]
		= (class669.anIntArray8595
		   [(class669.anInt8600 * 2088438307
		     - 1952656637 * class534_sub18_sub8.anInt11756 + i_3_)]);
	for (int i_4_ = 0; i_4_ < -64543921 * class534_sub18_sub8.anInt11758;
	     i_4_++)
	    objects[i_4_]
		= (class669.anObjectArray8593
		   [i_4_ + (1485266147 * class669.anInt8594
			    - class534_sub18_sub8.anInt11758 * -64543921)]);
	for (int i_5_ = 0; i_5_ < class534_sub18_sub8.anInt11749 * 590462703;
	     i_5_++)
	    ls[i_5_]
		= (class669.aLongArray8587
		   [i_5_ + (1572578961 * class669.anInt8596
			    - class534_sub18_sub8.anInt11749 * 590462703)]);
	class669.anInt8600 -= -2035708321 * class534_sub18_sub8.anInt11756;
	class669.anInt8594 -= 2048309157 * class534_sub18_sub8.anInt11758;
	class669.anInt8596 -= 2134429055 * class534_sub18_sub8.anInt11749;
	Class659 class659 = new Class659();
	class659.aClass534_Sub18_Sub8_8542
	    = class669.aClass534_Sub18_Sub8_8614;
	class659.anInt8543 = -299918763 * class669.anInt8613;
	class659.anIntArray8545 = class669.anIntArray8605;
	class659.anObjectArray8544 = class669.anObjectArray8611;
	class659.aLongArray8546 = class669.aLongArray8586;
	if (-1712769137 * class669.anInt8597
	    >= class669.aClass659Array8598.length)
	    throw new RuntimeException();
	class669.aClass659Array8598
	    [(class669.anInt8597 += 417597295) * -1712769137 - 1]
	    = class659;
	class669.aClass534_Sub18_Sub8_8614 = class534_sub18_sub8;
	class669.aClass515Array8612
	    = class669.aClass534_Sub18_Sub8_8614.aClass515Array11760;
	class669.anIntArray8591
	    = class669.aClass534_Sub18_Sub8_8614.anIntArray11752;
	class669.anInt8613 = 793595371;
	class669.anIntArray8605 = is;
	class669.anObjectArray8611 = objects;
	class669.aLongArray8586 = ls;
    }
}
