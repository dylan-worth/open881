/* Class410 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class410
{
    public static final int anInt4562 = 11;
    public static final int anInt4563 = 13;
    public static final int anInt4564 = 27;
    public static final int anInt4565 = 14;
    public static final int anInt4566 = 16;
    public static final int anInt4567 = 4;
    public static final int anInt4568 = 3;
    public static final int anInt4569 = 24;
    public static final int anInt4570 = 22;
    public static final int anInt4571 = 2;
    public static final int anInt4572 = 10;
    public static final int anInt4573 = 9;
    public static final int anInt4574 = 15;
    public static final int anInt4575 = 1;
    public static final int anInt4576 = 19;
    public static final int anInt4577 = 29;
    public static final int anInt4578 = 25;
    public static final int anInt4579 = 26;
    public static final int anInt4580 = 6;
    public static final int anInt4581 = 20;
    public static final int anInt4582 = 21;
    public static final int anInt4583 = 8;
    public static final int anInt4584 = 17;
    public static final int anInt4585 = 7;
    public static final int anInt4586 = 28;
    public static final int anInt4587 = 23;
    
    Class410() throws Throwable {
	throw new Error();
    }
    
    static final void method6710(Class669 class669, int i) {
	class669.anIntArray8605[(class669.anIntArray8591
				 [class669.anInt8613 * 662605117])]
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]);
    }
    
    static final void method6711(Class247 class247, Class243 class243,
				 Class669 class669, byte i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (Class546.method8989(string, class669, -219410121) != null)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2571
	    = Class99.method1859(string, class669, 1830801495);
	class247.aBool2561 = true;
    }
    
    static final void method6712(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_0_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_1_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	if (i_1_ == -1)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= Class618.aClass458_8101.method7433(i_0_, -1203343574)
		      .method18470((char) i_1_, (short) 15325);
    }
    
    static boolean method6713(int i, byte i_2_) {
	return 7 == i || i == 6;
    }
    
    public static boolean method6714(int i, int i_3_) {
	for (Class534_Sub18_Sub7 class534_sub18_sub7
		 = ((Class534_Sub18_Sub7)
		    Class72.aClass700_771.method14135((byte) -1));
	     class534_sub18_sub7 != null;
	     class534_sub18_sub7
		 = ((Class534_Sub18_Sub7)
		    Class72.aClass700_771.method14139(1549101489))) {
	    if (Class534_Sub4.method16039((class534_sub18_sub7.anInt11706
					   * -1986934021),
					  -1259896165)
		&& ((long) i
		    == class534_sub18_sub7.aLong11702 * -7225575275964615095L))
		return true;
	}
	return false;
    }
    
    static void method6715(int i, String string, String string_4_, int i_5_) {
	if (client.aClass100_11264 != null) {
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4176,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16507
		((1 + Class422.method6786(string, -1054460691)
		  + Class422.method6786(string_4_, -667644735)),
		 1770663894);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16635(i,
								  1015522896);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16517(string_4_,
								  (byte) 4);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16517(string,
								  (byte) 4);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 118);
	}
    }
}
