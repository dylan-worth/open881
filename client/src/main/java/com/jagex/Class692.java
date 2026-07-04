/* Class692 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class692
{
    static Class692 aClass692_8760;
    public static Class692 aClass692_8761;
    static Class692 aClass692_8762 = new Class692(0);
    public int anInt8763;
    
    static Class692[] method14043() {
	return (new Class692[]
		{ aClass692_8760, aClass692_8762, aClass692_8761 });
    }
    
    static {
	aClass692_8761 = new Class692(1);
	aClass692_8760 = new Class692(2);
    }
    
    Class692(int i) {
	anInt8763 = 1321132793 * i;
    }
    
    static Class692[] method14044() {
	return (new Class692[]
		{ aClass692_8760, aClass692_8762, aClass692_8761 });
    }
    
    static Class692[] method14045() {
	return (new Class692[]
		{ aClass692_8760, aClass692_8762, aClass692_8761 });
    }
    
    static final void method14046(Class669 class669, byte i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	int i_1_ = Class118.method2133(i_0_, -644556520);
	if (i_1_ < 0)
	    throw new RuntimeException();
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_1_;
    }
}
