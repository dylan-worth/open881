/* Class440 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class440
{
    public static final int anInt4868 = 0;
    public static final int anInt4869 = 2;
    public static final int anInt4870 = 4;
    public static final int anInt4871 = 3;
    public static final int anInt4872 = 1;
    
    Class440() throws Throwable {
	throw new Error();
    }
    
    static final void method7096(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aBool11076 ? 1 : 0;
    }
    
    static final void method7097(Class669 class669, int i) {
	class669.anInt8594 -= 1460193483;
	class669.anInt8600 -= 926998689;
	String string
	    = ((String)
	       class669.anObjectArray8593[1485266147 * class669.anInt8594]);
	boolean bool
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307] == 1;
	boolean bool_0_
	    = (class669.anIntArray8595[2088438307 * class669.anInt8600 + 1]
	       == 1);
	boolean bool_1_ = 1 == (class669.anIntArray8595
				[2 + 2088438307 * class669.anInt8600]);
	Class534_Sub19 class534_sub19
	    = Class346.method6128(Class404.aClass404_4252,
				  client.aClass100_11094.aClass13_1183,
				  1341391005);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16507
	    (Class668.method11029(string, (byte) 0) + 1, 1405125966);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16713(string,
							      1965185133);
	int i_2_ = 0;
	if (bool)
	    i_2_ |= 0x1;
	if (bool_0_)
	    i_2_ |= 0x2;
	if (bool_1_)
	    i_2_ |= 0x4;
	class534_sub19.aClass534_Sub40_Sub1_10513.method16506(i_2_, 448116734);
	client.aClass100_11094.method1863(class534_sub19, (byte) 113);
    }
    
    static final void method7098(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	client.anInt11055
	    = (class669.anIntArray8595[class669.anInt8600 * 2088438307]
	       * 1990883323);
	client.anInt11216
	    = (186586621
	       * class669.anIntArray8595[1 + 2088438307 * class669.anInt8600]);
    }
    
    static final void method7099(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 0;
    }
    
    public static int method7100(int i, int i_3_, boolean bool, byte i_4_) {
	Class534_Sub5 class534_sub5 = Class269.method5023(i, bool, (byte) 44);
	if (null == class534_sub5)
	    return -1;
	if (i_3_ < 0 || i_3_ >= class534_sub5.anIntArray10414.length)
	    return -1;
	return class534_sub5.anIntArray10414[i_3_];
    }
    
    public static final void method7101(int i) {
	Class65.anInt692 = 850224666;
	Class65.anInt701 = 1524080378;
	Class65.anInt671 = 1659880394;
    }
    
    public static void method7102(int i, int i_5_) {
	Class534_Sub18_Sub6 class534_sub18_sub6
	    = Class447.method7308(7, (long) i);
	class534_sub18_sub6.method18182(-1052637456);
    }
    
    static void method7103(Class185 class185, Class247 class247, byte i) {
	boolean bool
	    = ((Class531.aClass44_Sub7_7135.method17306
		(class185, class247.anInt2606 * 403396513,
		 class247.anInt2602 * -148110895,
		 973326593 * class247.anInt2490,
		 ~0xffffff | class247.anInt2587 * 2071487835,
		 class247.anInt2513 * 1245616333,
		 (class247.aBool2610
		  ? Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aClass631_12226
		  : null),
		 -878424575))
	       == null);
	if (bool) {
	    Class104.aClass700_1298.method14131
		(new Class534_Sub8(class247.anInt2606 * 403396513,
				   class247.anInt2602 * -148110895,
				   class247.anInt2490 * 973326593,
				   ~0xffffff | class247.anInt2587 * 2071487835,
				   class247.anInt2513 * 1245616333,
				   class247.aBool2610),
		 (short) 789);
	    Class454.method7416(class247, -563104655);
	}
    }
}
