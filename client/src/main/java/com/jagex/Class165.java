/* Class165 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class165
{
    Class165() {
	/* empty */
    }
    
    static final void method2742(Class669 class669, int i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class170.method2824(i_0_ >> 14 & 0x3fff, i_0_ & 0x3fff, 1724435883);
    }
    
    static void method2743(Class247 class247, int i, int i_1_, boolean bool,
			   int i_2_) {
	int i_3_ = class247.anInt2468 * -881188269;
	int i_4_ = -1279656873 * class247.anInt2469;
	if (class247.aByte2460 == 0)
	    class247.anInt2468 = 846270895 * class247.anInt2456;
	else if (class247.aByte2460 == 1)
	    class247.anInt2468
		= 359297499 * (i - -1855456835 * class247.anInt2456);
	else if (2 == class247.aByte2460)
	    class247.anInt2468
		= (-1855456835 * class247.anInt2456 * i >> 14) * 359297499;
	if (class247.aByte2448 == 0)
	    class247.anInt2469 = 601914875 * class247.anInt2465;
	else if (1 == class247.aByte2448)
	    class247.anInt2469
		= (i_1_ - class247.anInt2465 * -1196366771) * 758427495;
	else if (class247.aByte2448 == 2)
	    class247.anInt2469
		= (-1196366771 * class247.anInt2465 * i_1_ >> 14) * 758427495;
	if (class247.aByte2460 == 4)
	    class247.anInt2468
		= (class247.anInt2469 * -1279656873
		   * (1020405839 * class247.anInt2498)
		   / (class247.anInt2464 * 121297385) * 359297499);
	if (class247.aByte2448 == 4)
	    class247.anInt2469
		= 758427495 * (121297385 * class247.anInt2464
			       * (-881188269 * class247.anInt2468)
			       / (class247.anInt2498 * 1020405839));
	if (client.aBool11087
	    && (client.method17392(class247).anInt10574 * 1837782131 != 0
		|| 0 == -1960530827 * class247.anInt2438)) {
	    if (-1279656873 * class247.anInt2469 < 5
		&& -881188269 * class247.anInt2468 < 5) {
		class247.anInt2469 = -502829821;
		class247.anInt2468 = 1796487495;
	    } else {
		if (class247.anInt2469 * -1279656873 <= 0)
		    class247.anInt2469 = -502829821;
		if (-881188269 * class247.anInt2468 <= 0)
		    class247.anInt2468 = 1796487495;
	    }
	}
	if (1231845787 * class247.anInt2457 == Class247.anInt2599 * -24082201)
	    client.aClass247_11226 = class247;
	if (bool && null != class247.anObjectArray2450
	    && (-881188269 * class247.anInt2468 != i_3_
		|| i_4_ != -1279656873 * class247.anInt2469)) {
	    Class534_Sub41 class534_sub41 = new Class534_Sub41();
	    class534_sub41.aClass247_10818 = class247;
	    class534_sub41.anObjectArray10819 = class247.anObjectArray2450;
	    client.aClass700_11351.method14131(class534_sub41, (short) 789);
	}
    }
}
