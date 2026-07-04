/* Class204 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class204
{
    int[] anIntArray2198;
    int[] anIntArray2199;
    int[] anIntArray2200;
    int[] anIntArray2201;
    int[] anIntArray2202;
    int[] anIntArray2203;
    int[] anIntArray2204;
    static Class163 aClass163_2205;
    
    Class204(Class534_Sub40 class534_sub40) {
	int i = class534_sub40.method16546(-1706829710);
	anIntArray2198 = new int[i];
	anIntArray2199 = new int[i];
	anIntArray2201 = new int[i];
	anIntArray2200 = new int[i];
	anIntArray2202 = new int[i];
	anIntArray2203 = new int[i];
	anIntArray2204 = new int[i];
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    anIntArray2198[i_0_] = class534_sub40.method16529((byte) 1) - 5120;
	    anIntArray2201[i_0_] = class534_sub40.method16529((byte) 1) - 5120;
	    anIntArray2199[i_0_] = class534_sub40.method16530((byte) -68);
	    anIntArray2202[i_0_] = class534_sub40.method16529((byte) 1) - 5120;
	    anIntArray2204[i_0_] = class534_sub40.method16529((byte) 1) - 5120;
	    anIntArray2203[i_0_] = class534_sub40.method16530((byte) -87);
	    anIntArray2200[i_0_] = class534_sub40.method16530((byte) -42);
	}
    }
    
    void method3906(int i, int i_1_) {
	int[][] is = new int[anIntArray2198.length << 1][4];
	for (int i_2_ = 0; i_2_ < anIntArray2198.length; i_2_++) {
	    is[i_2_ * 2][0] = anIntArray2198[i_2_];
	    is[2 * i_2_][1] = anIntArray2199[i_2_];
	    is[2 * i_2_][2] = anIntArray2201[i_2_];
	    is[2 * i_2_][3] = anIntArray2200[i_2_];
	    is[i_2_ * 2 + 1][0] = anIntArray2202[i_2_];
	    is[1 + i_2_ * 2][1] = anIntArray2203[i_2_];
	    is[i_2_ * 2 + 1][2] = anIntArray2204[i_2_];
	    is[2 * i_2_ + 1][3] = anIntArray2200[i_2_];
	}
	client.anIntArrayArrayArray11151[i] = is;
    }
    
    static final void method3907(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	class247.aBool2525
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) == 1;
	Class454.method7416(class247, -1183807842);
    }
    
    static final void method3908(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class130.method2305(class247, class243, class669, (byte) -34);
    }
    
    static final void method3909(Class669 class669, int i) {
	Class530.method8847(class669, 1888374901);
    }
    
    static final void method3910(Class669 class669, short i) {
	class669.anInt8600 -= 617999126;
	int i_3_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_4_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	Class534_Sub18_Sub14 class534_sub18_sub14
	    = Class450.method7370(i_3_, i_4_, -1387468933);
	if (null != class534_sub18_sub14) {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= class534_sub18_sub14.anInt11808 * -759944081;
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= Class690_Sub7.method16946((class534_sub18_sub14.aLong11813
					     * -1208012376043926345L),
					    (Class539.aClass672_7171.anInt8630
					     * -473969159),
					    -1936794233);
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 1988131041 * class534_sub18_sub14.anInt11806;
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= (null != class534_sub18_sub14.aString11807
		   ? class534_sub18_sub14.aString11807 : "");
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= (class534_sub18_sub14.aString11804 != null
		   ? class534_sub18_sub14.aString11804 : "");
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= (class534_sub18_sub14.aString11809 != null
		   ? class534_sub18_sub14.aString11809 : "");
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= (null != class534_sub18_sub14.aString11803
		   ? class534_sub18_sub14.aString11803 : "");
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= class534_sub18_sub14.anInt11811 * 1232973141;
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= (class534_sub18_sub14.aString11812 != null
		   ? class534_sub18_sub14.aString11812 : "");
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= (class534_sub18_sub14.aClass407_11810 != null
		   ? class534_sub18_sub14.aClass407_11810.method93() : -1);
	} else {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	}
    }
    
    static final void method3911(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class247.anInt2624 * -1513459333;
    }
}
