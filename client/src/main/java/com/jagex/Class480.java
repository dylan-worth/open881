/* Class480 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class480
{
    public static Class480 aClass480_5251;
    static Class480 aClass480_5252 = new Class480(0);
    public static Class480 aClass480_5253;
    public static Class480 aClass480_5254;
    public static Class480 aClass480_5255;
    public static Class480 aClass480_5256 = new Class480(1);
    public static Class480 aClass480_5257;
    public static Class480 aClass480_5258;
    static Class480 aClass480_5259;
    public static Class480 aClass480_5260;
    int anInt5261;
    public static int anInt5262;
    static Class63 aClass63_5263;
    
    Class480(int i) {
	anInt5261 = 1422197795 * i;
    }
    
    static {
	aClass480_5251 = new Class480(2);
	aClass480_5254 = new Class480(3);
	aClass480_5255 = new Class480(4);
	aClass480_5258 = new Class480(5);
	aClass480_5257 = new Class480(6);
	aClass480_5253 = new Class480(7);
	aClass480_5259 = new Class480(8);
	aClass480_5260 = new Class480(9);
    }
    
    static final void method7920(Class534_Sub40_Sub1 class534_sub40_sub1,
				 int i) {
	for (int i_0_ = 0; i_0_ < Class108.anInt1326 * -1852482743; i_0_++) {
	    class534_sub40_sub1.method16529((byte) 1);
	    int i_1_ = Class108.anIntArray1327[i_0_];
	    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		= client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i_1_];
	    int i_2_ = class534_sub40_sub1.method16527(-1293018491);
	    if ((i_2_ & 0x20) != 0)
		i_2_ += class534_sub40_sub1.method16527(-719796776) << 8;
	    if (0 != (i_2_ & 0x800))
		i_2_ += class534_sub40_sub1.method16527(-1553071546) << 16;
	    Class47.method1115(class534_sub40_sub1, i_1_,
			       class654_sub1_sub5_sub1_sub2, i_2_, -916013214);
	}
    }
    
    static final void method7921(Class669 class669, byte i) {
	class669.anInt8596 -= 1091885681;
    }
    
    static final void method7922(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 2142374941 * class247.anInt2479;
    }
    
    static final void method7923(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_3_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_4_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	if (0 == i_3_)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= (int) Math.pow((double) i_3_, (double) i_4_);
    }
    
    static void method7924(int i) {
	if (Class498.anInt5576 * 1644564029 > 1)
	    Class44_Sub6.aClass534_Sub35_10989.method16438
		(Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub31_10785, 4,
		 -2036777509);
	else
	    Class44_Sub6.aClass534_Sub35_10989.method16438
		(Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub31_10785, 2,
		 -1743816305);
    }
}
