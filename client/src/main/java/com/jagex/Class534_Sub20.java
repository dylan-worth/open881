/* Class534_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class534_Sub20 extends Class534
{
    int anInt10517;
    int anInt10518;
    int anInt10519;
    int anInt10520 = -1373916441;
    int anInt10521;
    int anInt10522 = -2147483648;
    int anInt10523;
    int anInt10524;
    Class534_Sub29 aClass534_Sub29_10525;
    
    Class534_Sub20(Class534_Sub29 class534_sub29) {
	anInt10519 = -956623339;
	anInt10518 = -2147483648;
	anInt10521 = 1277578821;
	anInt10517 = -2147483648;
	anInt10523 = -78427811;
	anInt10524 = -2147483648;
	aClass534_Sub29_10525 = class534_sub29;
    }
    
    boolean method16192(int i, int i_0_, byte i_1_) {
	if (i >= anInt10520 * -1485127895 && i <= -43310397 * anInt10522
	    && i_0_ >= -1594951997 * anInt10519
	    && i_0_ <= -873067821 * anInt10518)
	    return true;
	if (i >= anInt10521 * 1124363123 && i <= -673751099 * anInt10517
	    && i_0_ >= 1891151115 * anInt10523
	    && i_0_ <= -540011139 * anInt10524)
	    return true;
	return false;
    }
    
    static final void method16193(Class669 class669, byte i) {
	int i_2_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_2_, 1675806476);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_2_ >> 16];
	Class118.method2131(class247, class243, class669, 1225863589);
    }
    
    public static void method16194(int i, byte i_3_) {
	Class534_Sub18_Sub6 class534_sub18_sub6
	    = Class447.method7308(6, (long) i);
	class534_sub18_sub6.method18182(-1052637456);
    }
    
    static final void method16195(Class247 class247, Class243 class243,
				  boolean bool, int i, Class669 class669,
				  int i_4_) {
	class669.anInt8600 -= 617999126;
	int i_5_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_6_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	if (class247.anInt2580 * 1365669833 == -1 && !class243.aBool2413) {
	    Class44_Sub4.method17266(class247.anInt2454 * -1278450723,
				     733840574);
	    Class551.method9052(-1278450723 * class247.anInt2454, -1784853389);
	    Class653.method10806(class247.anInt2454 * -1278450723, 296936355);
	}
	if (-1 == i_5_) {
	    class247.anInt2496 = -214166091;
	    class247.anInt2497 = -931070365;
	    class247.anInt2606 = 407876511;
	} else {
	    class247.anInt2606 = -407876511 * i_5_;
	    class247.anInt2602 = i_6_ * -681314511;
	    class247.aBool2610 = bool;
	    Class15 class15
		= ((Class15)
		   Class531.aClass44_Sub7_7135.method91(i_5_, 1227418488));
	    class247.anInt2502 = -1631892637 * class15.anInt124;
	    class247.anInt2503 = 1489888717 * class15.anInt125;
	    class247.anInt2624 = class15.anInt126 * -596442839;
	    class247.anInt2500 = -489359023 * class15.anInt139;
	    class247.anInt2598 = class15.anInt128 * -997351333;
	    class247.anInt2508 = class15.anInt123 * -639324193;
	    class247.anInt2513 = 406000645 * i;
	    if (-1843491229 * class247.anInt2594 > 0)
		class247.anInt2508
		    = (class247.anInt2508 * -720602720
		       / (class247.anInt2594 * -1843491229) * -2116337403);
	    else if (-1855456835 * class247.anInt2456 > 0)
		class247.anInt2508
		    = (class247.anInt2508 * -720602720
		       / (-1855456835 * class247.anInt2456) * -2116337403);
	}
    }
}
