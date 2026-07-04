/* Class200_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class200_Sub22 extends Class200
{
    int anInt10002;
    int anInt10003;
    int anInt10004;
    int anInt10005;
    Class491 aClass491_10006;
    
    void method3850() {
	if (aClass491_10006 != null) {
	    aClass491_10006.method8014(50, 1962988118);
	    Class171_Sub4.aClass232_9944.method4234(aClass491_10006,
						    131217949);
	    aClass491_10006 = null;
	}
    }
    
    public void method3847() {
	if (aClass491_10006 != null)
	    aClass491_10006.method8069(1963216733);
    }
    
    void method3843(byte i) {
	if (aClass491_10006 != null) {
	    aClass491_10006.method8014(50, 1962988118);
	    Class171_Sub4.aClass232_9944.method4234(aClass491_10006,
						    443308918);
	    aClass491_10006 = null;
	}
    }
    
    public void method3846() {
	if (aClass491_10006 != null)
	    aClass491_10006.method8069(2013162408);
    }
    
    Class200_Sub22(Class534_Sub40 class534_sub40) {
	super(class534_sub40);
	anInt10004 = class534_sub40.method16529((byte) 1) * -111950207;
	anInt10003 = class534_sub40.method16527(701405756) * 664955521;
	anInt10005 = class534_sub40.method16527(-477813626) * 1948837843;
	anInt10002 = class534_sub40.method16527(1517278404) * 846474071;
	aClass491_10006
	    = (Class171_Sub4.aClass232_9944.method4229
	       (Class211.aClass211_2255, this, 83261825 * anInt10004,
		1992814695 * anInt10002, anInt10003 * -787753599,
		Class190.aClass190_2134.method3763(-523239570),
		Class207.aClass207_2235, 0.0F, 0.0F, null, 0,
		anInt10005 * -443742117, false, -808839230));
	if (null != aClass491_10006)
	    aClass491_10006.method8012(-1720662844);
    }
    
    public void method3845(int i) {
	if (aClass491_10006 != null)
	    aClass491_10006.method8069(2076760053);
    }
    
    static final void method15647(Class669 class669, int i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = (((Class15)
		Class531.aClass44_Sub7_7135.method91(i_0_, -210478479))
	       .aString122);
    }
    
    static final void method15648(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_1_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_2_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	if (0 == i_1_)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	else if (0 == i_2_)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 2147483647;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= (int) Math.pow((double) i_1_, 1.0 / (double) i_2_);
    }
}
