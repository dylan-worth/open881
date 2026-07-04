/* Class386 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Date;

public class Class386
{
    public static Class386 aClass386_4046;
    public static Class386 aClass386_4047 = new Class386();
    
    static {
	aClass386_4046 = new Class386();
    }
    
    Class386() {
	/* empty */
    }
    
    static final void method6492(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class247.anInt2606 * 403396513;
    }
    
    static final void method6493(Class669 class669, short i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10764
		  .method16933((byte) -1) ? 1 : 0;
    }
    
    static final void method6494(Class247 class247, Class669 class669, int i) {
	if (class669.anInt8588 * 768284605 >= 10)
	    throw new RuntimeException();
	if (null != class247.anObjectArray2450) {
	    Class534_Sub41 class534_sub41 = new Class534_Sub41();
	    class534_sub41.aClass247_10818 = class247;
	    class534_sub41.anObjectArray10819 = class247.anObjectArray2450;
	    class534_sub41.anInt10826
		= class669.anInt8588 * 1447923541 + 1478140793;
	    client.aClass700_11351.method14131(class534_sub41, (short) 789);
	}
    }
    
    static void method6495(long l) {
	Class84.aCalendar837.setTime(new Date(l));
    }
    
    public static void method6496(int i, int i_0_, int i_1_, int i_2_,
				  int i_3_, int i_4_, String string,
				  int i_5_) {
	Class536_Sub6 class536_sub6 = new Class536_Sub6();
	class536_sub6.anInt10370 = i * -1138244179;
	class536_sub6.anInt10369 = i_0_ * -1571693737;
	class536_sub6.anInt10373 = i_1_ * 1927397951;
	class536_sub6.anInt10371 = (client.anInt11101 + i_3_) * 462225497;
	class536_sub6.anInt10372 = i_2_ * -459030883;
	class536_sub6.aString10375 = string;
	class536_sub6.anInt10374 = 86082617 * i_4_;
	client.aClass709_11212.method14287(class536_sub6, 1655630265);
    }
    
    static final int method6497(int i, int i_6_) {
	return i >> 11 & 0x7f;
    }
    
    static final void method6498(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class298_Sub1.aBool10063 ? 1 : 0;
    }
}
