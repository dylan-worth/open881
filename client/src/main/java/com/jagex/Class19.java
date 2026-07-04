/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class19
{
    static Class163[] aClass163Array209;
    public static final int anInt210 = 5;
    public static Class352 aClass352_211;
    
    Class19() throws Throwable {
	throw new Error();
    }
    
    static final void method797(Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (string.startsWith(Class108.method1965(0, 951856819))
	    || string.startsWith(Class108.method1965(1, 483629153)))
	    string = string.substring(7);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class18.method796(string, 1935461687) ? 1 : 0;
    }
    
    public static int method798(int i, int i_0_, boolean bool, byte i_1_) {
	Class534_Sub5 class534_sub5 = Class269.method5023(i, bool, (byte) 13);
	if (null == class534_sub5)
	    return 0;
	if (i_0_ < 0 || i_0_ >= class534_sub5.anIntArray10415.length)
	    return 0;
	return class534_sub5.anIntArray10415[i_0_];
    }
    
    static final void method799(Class669 class669, int i) {
	class669.anInt8600 -= 308999563;
	int i_2_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	Class534_Sub37 class534_sub37
	    = (Class534_Sub37) client.aClass9_11224.method579((long) i_2_);
	if (null != class534_sub37 && 3 == 410447 * class534_sub37.anInt10804)
	    Class534_Sub41.method16766(class534_sub37, true, true, -501970604);
    }
    
    static final void method800(Class669 class669, int i) {
	int i_3_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class272 class272
	    = ((Class272)
	       Class222.aClass44_Sub9_2313.method91(i_3_, -2019604052));
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class272.anInt2985 * 638004337;
    }
}
