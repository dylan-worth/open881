/* Class12_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class12_Sub1 extends Class12
{
    public Interface13 method63(int i, Interface14 interface14) {
	return new Class15(i, interface14, this);
    }
    
    public Interface13 method60(int i, Interface14 interface14) {
	return new Class15(i, interface14, this);
    }
    
    public Class method59(short i) {
	return com.jagex.Class15.class;
    }
    
    public Interface13 method64(int i, Interface14 interface14) {
	return new Class15(i, interface14, this);
    }
    
    Class12_Sub1(Class675 class675, Class672 class672, boolean bool,
		 Class472 class472, Interface14 interface14) {
	super(class675, class672, bool, class472, interface14);
    }
    
    public Interface13 method62(int i, Interface14 interface14) {
	return new Class15(i, interface14, this);
    }
    
    public Interface13 method58(int i, Interface14 interface14, byte i_0_) {
	return new Class15(i, interface14, this);
    }
    
    public Class method61() {
	return com.jagex.Class15.class;
    }
    
    static final void method17321(Class247 class247, Class669 class669,
				  int i) {
	class669.anInt8600 -= 926998689;
	int i_1_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600] - 1;
	int i_2_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	int i_3_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 2];
	if (i_1_ < 0 || i_1_ > 9)
	    throw new RuntimeException();
	Class453.method7405(class247, i_1_, i_2_, i_3_, class669, (byte) -71);
    }
}
