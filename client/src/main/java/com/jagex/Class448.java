/* Class448 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class448 implements Interface5
{
    String aString4908;
    boolean aBool4909;
    boolean aBool4910;
    
    void method7309(int i) {
	aBool4910 = true;
    }
    
    Class448(String string) {
	this(string, false);
    }
    
    public int method56(int i) {
	if (aBool4910)
	    return 100;
	int i_0_;
	try {
	    i_0_ = Class632.aClass538_8269.method8915(aString4908, aBool4909,
						      1072660200);
	} catch (Exception_Sub1 exception_sub1) {
	    Class530.method8852(Class68.aClass68_723,
				exception_sub1.aString11396,
				exception_sub1.anInt11395 * -299853035,
				exception_sub1.getCause(), (byte) 73);
	    aBool4910 = true;
	    return 100;
	}
	return i_0_;
    }
    
    boolean method7310(int i) {
	return aBool4910;
    }
    
    boolean method7311() {
	return aBool4910;
    }
    
    void method7312() {
	aBool4910 = true;
    }
    
    public Class30 method51(int i) {
	return Class30.aClass30_271;
    }
    
    public int method22() {
	if (aBool4910)
	    return 100;
	int i;
	try {
	    i = Class632.aClass538_8269.method8915(aString4908, aBool4909,
						   -1654795754);
	} catch (Exception_Sub1 exception_sub1) {
	    Class530.method8852(Class68.aClass68_723,
				exception_sub1.aString11396,
				exception_sub1.anInt11395 * -299853035,
				exception_sub1.getCause(), (byte) -8);
	    aBool4910 = true;
	    return 100;
	}
	return i;
    }
    
    public int method53() {
	if (aBool4910)
	    return 100;
	int i;
	try {
	    i = Class632.aClass538_8269.method8915(aString4908, aBool4909,
						   1133156397);
	} catch (Exception_Sub1 exception_sub1) {
	    Class530.method8852(Class68.aClass68_723,
				exception_sub1.aString11396,
				exception_sub1.anInt11395 * -299853035,
				exception_sub1.getCause(), (byte) 75);
	    aBool4910 = true;
	    return 100;
	}
	return i;
    }
    
    public Class30 method55() {
	return Class30.aClass30_271;
    }
    
    public Class30 method50() {
	return Class30.aClass30_271;
    }
    
    public int method52() {
	if (aBool4910)
	    return 100;
	int i;
	try {
	    i = Class632.aClass538_8269.method8915(aString4908, aBool4909,
						   304805899);
	} catch (Exception_Sub1 exception_sub1) {
	    Class530.method8852(Class68.aClass68_723,
				exception_sub1.aString11396,
				exception_sub1.anInt11395 * -299853035,
				exception_sub1.getCause(), (byte) -44);
	    aBool4910 = true;
	    return 100;
	}
	return i;
    }
    
    boolean method7313() {
	return aBool4910;
    }
    
    boolean method7314() {
	return aBool4910;
    }
    
    public Class30 method57() {
	return Class30.aClass30_271;
    }
    
    void method7315() {
	aBool4910 = true;
    }
    
    boolean method7316() {
	return aBool4910;
    }
    
    public Class30 method54() {
	return Class30.aClass30_271;
    }
    
    Class448(String string, boolean bool) {
	aString4908 = string;
	aBool4909 = bool;
    }
    
    public static void method7317(int i) {
	Class70.method1412(-124740322);
    }
    
    static final void method7318(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub11_10749
		  .method16974((byte) -91) ? 1 : 0;
    }
    
    public static Interface76 method7319(Interface76[] interface76s, int i,
					 int i_1_) {
	Interface76[] interface76s_2_ = interface76s;
	for (int i_3_ = 0; i_3_ < interface76s_2_.length; i_3_++) {
	    Interface76 interface76 = interface76s_2_[i_3_];
	    if (i == interface76.method93())
		return interface76;
	}
	return null;
    }
    
    static final void method7320(Class669 class669, short i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class162.method2642(class247, class243, class669, -545987275);
    }
}
