/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class32 implements Interface27
{
    public Class110_Sub1 method164() {
	return Class562.aClass110_Sub1_Sub1_7560;
    }
    
    public Class44_Sub11 method167() {
	return Class84.aClass44_Sub11_840;
    }
    
    public Class44_Sub11 method166(byte i) {
	return Class84.aClass44_Sub11_840;
    }
    
    public Class623 method161(int i) {
	return Class542.aClass623_7184;
    }
    
    public Class44_Sub11 method169() {
	return Class84.aClass44_Sub11_840;
    }
    
    public Class110_Sub1 method165() {
	return Class522.aClass110_Sub1_Sub2_7083;
    }
    
    public Class110_Sub1 method163() {
	return Class522.aClass110_Sub1_Sub2_7083;
    }
    
    public Class110_Sub1 method171(int i) {
	return Class562.aClass110_Sub1_Sub1_7560;
    }
    
    public Class44_Sub11 method168() {
	return Class84.aClass44_Sub11_840;
    }
    
    public Class110_Sub1 method160(int i) {
	return Class522.aClass110_Sub1_Sub2_7083;
    }
    
    public Class623 method170() {
	return Class542.aClass623_7184;
    }
    
    public Class623 method162() {
	return Class542.aClass623_7184;
    }
    
    static final void method897(Class669 class669, int i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	boolean bool = true;
	if (i_0_ < 0)
	    bool = 0 == (1 + i_0_) % 4;
	else if (i_0_ < 1582)
	    bool = i_0_ % 4 == 0;
	else if (0 != i_0_ % 4)
	    bool = false;
	else if (0 != i_0_ % 100)
	    bool = true;
	else if (i_0_ % 400 != 0)
	    bool = false;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = bool ? 1 : 0;
    }
    
    static void method898(int i, int i_1_, int i_2_) {
	if (1 == -1488345619 * Class72.anInt757)
	    Class101.method1901(Class513.aClass534_Sub18_Sub7_5727, i, i_1_,
				false, -1006545497);
	else if (2 == Class72.anInt757 * -1488345619)
	    Class43.method1073(i, i_1_, 1543773986);
	Class72.anInt757 = 0;
	Class513.aClass534_Sub18_Sub7_5727 = null;
    }
}
