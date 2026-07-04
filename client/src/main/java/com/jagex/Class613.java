/* Class613 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class613
{
    public static Class613 aClass613_8022 = new Class613(0);
    public static Class613 aClass613_8023 = new Class613(1);
    public static Class613 aClass613_8024 = new Class613(2);
    static Class163 aClass163_8025;
    
    Class613(int i) {
	/* empty */
    }
    
    static final void method10109(Class669 class669, int i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (0 != client.anInt11171 * -1050164879
	    && i_0_ < 2103713403 * client.anInt11329)
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= client.aClass33Array11299[i_0_].aString274;
	else
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
    }
    
    static final void method10110(Class669 class669, int i) {
	int i_1_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_1_, 1902991569);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.method17394(class247) ? 1 : 0;
    }
    
    public static final void method10111(boolean bool, int i, int i_2_) {
	Class534_Sub26 class534_sub26 = (bool ? Class574.aClass534_Sub26_7710
					 : Class489.aClass534_Sub26_5312);
	if (class534_sub26 != null && i >= 0
	    && i < class534_sub26.anInt10580 * -1406046755) {
	    Class337 class337 = class534_sub26.aClass337Array10579[i];
	    if (-1 == class337.aByte3521) {
		String string = class337.aString3523;
		Class100 class100 = Class201.method3864(2095398292);
		Class534_Sub19 class534_sub19
		    = Class346.method6128(Class404.aClass404_4192,
					  class100.aClass13_1183, 1341391005);
		class534_sub19.aClass534_Sub40_Sub1_10513.method16506
		    (3 + Class668.method11029(string, (byte) 0), 337813758);
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16506(bool ? 1 : 0, 1426807432);
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16507(i, 1035657283);
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16713(string, -348199614);
		class100.method1863(class534_sub19, (byte) 85);
	    }
	}
    }
    
    static final void method10112(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class247.aBool2473 ? 1 : 0;
    }
}
