/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class71
{
    protected int anInt744;
    protected int anInt745;
    protected boolean aBool746;
    protected int anInt747;
    protected int anInt748;
    protected int anInt749;
    protected boolean aBool750;
    protected int anInt751;
    protected int anInt752;
    
    Class71(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_,
	    boolean bool, boolean bool_5_, int i_6_) {
	anInt748 = 1513206777 * i;
	anInt745 = 666889901 * i_0_;
	anInt747 = (i_1_ > 65535 ? 65535 : i_1_) * -1968095099;
	anInt744 = i_2_ * -2065840169;
	anInt751 = (i_3_ > 255 ? 255 : i_3_) * -105881611;
	anInt749 = i_4_ * -1344899373;
	aBool750 = bool;
	aBool746 = bool_5_;
	anInt752 = i_6_ * -405560541;
    }
    
    static void method1414(Class669 class669, byte i) {
	class669.anIntArray8595[class669.anInt8600 * 2088438307 - 2]
	    = (((Class273)
		Class223.aClass53_Sub2_2316.method91((class669.anIntArray8595
						      [(class669.anInt8600
							* 2088438307) - 2]),
						     112936353))
		   .method5078
	       (Class78.aClass103_825,
		class669.anIntArray8595[2088438307 * class669.anInt8600 - 1],
		(byte) -55)) ? 1 : 0;
	class669.anInt8600 -= 308999563;
    }
    
    static final void method1415(Class669 class669, byte i) {
	class669.anInt8600 -= 926998689;
	int i_7_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_8_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	int i_9_
	    = class669.anIntArray8595[2 + 2088438307 * class669.anInt8600];
	Class112.method2017(i_7_, 418526321);
	Class200_Sub4.method15571((Class44_Sub11.aClass243Array11006
				   [i_7_ >>> 16]),
				  i_7_ & 0xffff, i_8_, i_9_,
				  class669.aBool8615, class669, -1776563563);
    }
}
