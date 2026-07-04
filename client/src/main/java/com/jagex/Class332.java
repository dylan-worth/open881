/* Class332 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class332
{
    public Class332(int i) {
	/* empty */
    }
    
    static final void method5860(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class329.method5833(class247, class243, class669, -1483291954);
    }
    
    static final void method5861(Class247 class247, Class243 class243,
				 Class669 class669, byte i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (Class546.method8989(string, class669, -219410121) != null)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2589
	    = Class99.method1859(string, class669, 1439125375);
	class247.aBool2561 = true;
    }
    
    static final void method5862(Class669 class669, int i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_0_, -90895206);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_0_ >> 16];
	Class589.method9872(class247, class243, class669, -1813351112);
    }
    
    static final void method5863(String string, byte i) {
	System.out.println(new StringBuilder().append("Error: ").append
			       (Class468.method7628(string, "%0a", "\n",
						    (byte) 34))
			       .toString());
    }
}
