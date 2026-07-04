/* Class559 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class559
{
    public Class559 aClass559_7497;
    static Class559 aClass559_7498;
    static int anInt7499 = 0;
    public Class654_Sub1_Sub5 aClass654_Sub1_Sub5_7500;
    static int anInt7501;
    
    void method9418(int i) {
	if (1950158771 * anInt7499 < 500) {
	    aClass654_Sub1_Sub5_7500 = null;
	    aClass559_7497 = aClass559_7498;
	    aClass559_7498 = this;
	    anInt7499 += -510773381;
	}
    }
    
    Class559() {
	/* empty */
    }
    
    static Class559 method9419(Class654_Sub1_Sub5 class654_sub1_sub5) {
	Class559 class559;
	if (aClass559_7498 == null)
	    class559 = new Class559();
	else {
	    class559 = aClass559_7498;
	    aClass559_7498 = aClass559_7498.aClass559_7497;
	    class559.aClass559_7497 = null;
	    anInt7499 -= -510773381;
	}
	class559.aClass654_Sub1_Sub5_7500 = class654_sub1_sub5;
	return class559;
    }
    
    void method9420() {
	if (1950158771 * anInt7499 < 500) {
	    aClass654_Sub1_Sub5_7500 = null;
	    aClass559_7497 = aClass559_7498;
	    aClass559_7498 = this;
	    anInt7499 += -510773381;
	}
    }
    
    void method9421() {
	if (1950158771 * anInt7499 < 500) {
	    aClass654_Sub1_Sub5_7500 = null;
	    aClass559_7497 = aClass559_7498;
	    aClass559_7498 = this;
	    anInt7499 += -510773381;
	}
    }
    
    void method9422() {
	if (1950158771 * anInt7499 < 500) {
	    aClass654_Sub1_Sub5_7500 = null;
	    aClass559_7497 = aClass559_7498;
	    aClass559_7498 = this;
	    anInt7499 += -510773381;
	}
    }
    
    static void method9423(Class669 class669, int i) {
	class669.anIntArray8595[2088438307 * class669.anInt8600 - 1]
	    = (((Class273)
		Class223.aClass53_Sub2_2316.method91((class669.anIntArray8595
						      [(class669.anInt8600
							* 2088438307) - 1]),
						     -1525807707)).anInt3018
	       * -610952925);
    }
    
    static final void method9424(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class159.method2608(class247, class243, class669, 1352560900);
    }
    
    static final void method9425(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class247.anInt2466 * -1196182029;
    }
    
    static final void method9426(Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	Class82.method1648(string, -1660827629);
    }
    
    static final void method9427(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (Class554.aClass534_Sub18_Sub9_7354 != null
	       ? Class554.aClass534_Sub18_Sub9_7354.anInt11766 * 848546455
	       : -1);
    }
    
    static final void method9428(Class669 class669, int i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class534_Sub18_Sub12 class534_sub18_sub12
	    = RuntimeException_Sub4.aClass56_12127.method1218(i_0_,
							      -1581069180);
	if (class534_sub18_sub12.anIntArray11800 == null)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= class534_sub18_sub12.anIntArray11800.length;
    }
}
