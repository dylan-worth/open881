/* Class598 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class598
{
    public static Class598 aClass598_7864 = new Class598(0);
    public static Class598 aClass598_7865 = new Class598(1);
    public static Class598 aClass598_7866 = new Class598(4);
    
    Class598(int i) {
	/* empty */
    }
    
    static void method9938(Class247 class247, Class247 class247_0_, int i) {
	Class534_Sub19 class534_sub19
	    = Class346.method6128(Class404.aClass404_4159,
				  client.aClass100_11264.aClass13_1183,
				  1341391005);
	class534_sub19.aClass534_Sub40_Sub1_10513
	    .method16617(class247.anInt2454 * -1278450723, 888575456);
	class534_sub19.aClass534_Sub40_Sub1_10513
	    .method16510(-1278450723 * class247_0_.anInt2454, -1348793913);
	class534_sub19.aClass534_Sub40_Sub1_10513
	    .method16569(class247.anInt2580 * 1365669833, -898068298);
	class534_sub19.aClass534_Sub40_Sub1_10513
	    .method16687(class247_0_.anInt2606 * 403396513, 2081786424);
	class534_sub19.aClass534_Sub40_Sub1_10513
	    .method16568(1365669833 * class247_0_.anInt2580, 761579752);
	class534_sub19.aClass534_Sub40_Sub1_10513
	    .method16687(403396513 * class247.anInt2606, 2064945278);
	client.aClass100_11264.method1863(class534_sub19, (byte) 72);
    }
    
    static String method9939(Class247 class247, int i) {
	if (client.method17392(class247).method16271((byte) 76) == 0)
	    return null;
	if (class247.aString2560 == null
	    || class247.aString2560.trim().length() == 0) {
	    if (client.aBool11087)
		return "Hidden-use";
	    return null;
	}
	return class247.aString2560;
    }
    
    static final void method9940(Class669 class669, int i) {
	client.aClass247_11044 = null;
	client.aClass247_11342 = null;
    }
    
    static final void method9941(Class669 class669, byte i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = string.toLowerCase();
    }
    
    static final void method9942(Class669 class669, int i) {
	int i_1_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class534_Sub18_Sub9 class534_sub18_sub9
	    = Class232.method4339(-1369241741);
	if (null != class534_sub18_sub9) {
	    boolean bool
		= class534_sub18_sub9.method18260(i_1_ >> 28 & 0x3,
						  i_1_ >> 14 & 0x3fff,
						  i_1_ & 0x3fff,
						  Class679.anIntArray8659,
						  366961690);
	    if (bool) {
		class669.anIntArray8595
		    [(class669.anInt8600 += 308999563) * 2088438307 - 1]
		    = Class679.anIntArray8659[1];
		class669.anIntArray8595
		    [(class669.anInt8600 += 308999563) * 2088438307 - 1]
		    = Class679.anIntArray8659[2];
	    } else {
		class669.anIntArray8595
		    [(class669.anInt8600 += 308999563) * 2088438307 - 1]
		    = -1;
		class669.anIntArray8595
		    [(class669.anInt8600 += 308999563) * 2088438307 - 1]
		    = -1;
	    }
	} else {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	}
    }
}
