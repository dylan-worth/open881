/* Class158 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class158
{
    public Class433 aClass433_1747;
    public Class158 aClass158_1748;
    public int anInt1749;
    public int anInt1750;
    public int anInt1751;
    public int anInt1752;
    public int anInt1753;
    
    Class158 method2588(int i, int i_0_) {
	return new Class158(1218140867 * anInt1752, i);
    }
    
    Class158(int i, int i_1_) {
	anInt1752 = 1112319467 * i;
	anInt1753 = i_1_ * -1254290551;
    }
    
    public Class384 method2589(Interface46 interface46) {
	return interface46.method345(1218140867 * anInt1752, -404064168);
    }
    
    public Class384 method2590(Interface46 interface46, byte i) {
	return interface46.method345(1218140867 * anInt1752, -404064168);
    }
    
    Class158 method2591(int i) {
	return new Class158(1218140867 * anInt1752, i);
    }
    
    static final void method2592(Class669 class669, int i) {
	int i_2_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (class669.aClass534_Sub26_8606.aClass337Array10579[i_2_]
	       .aByte3521);
    }
    
    static final void method2593(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub1_10762
		  .method16822(-995682680) ? 1 : 0;
    }
    
    static boolean method2594(int i) {
	if (Class228.aProcess2321 == null)
	    return false;
	boolean bool;
	try {
	    Class228.aProcess2321.exitValue();
	    bool = true;
	} catch (IllegalThreadStateException illegalthreadstateexception) {
	    return false;
	}
	return bool;
    }
    
    static final void method2595(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class534_Sub20.method16195(class247, class243, false, 1, class669,
				   -1824804511);
    }
}
