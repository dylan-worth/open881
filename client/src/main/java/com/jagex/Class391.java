/* Class391 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class391
{
    static Class391 aClass391_4073;
    static Class391 aClass391_4074;
    static Class391 aClass391_4075 = new Class391();
    protected static int anInt4076;
    
    public static Class391[] method6542() {
	return (new Class391[]
		{ aClass391_4075, aClass391_4074, aClass391_4073 });
    }
    
    Class391() {
	/* empty */
    }
    
    static {
	aClass391_4074 = new Class391();
	aClass391_4073 = new Class391();
    }
    
    public int method6543(int i, int i_0_) {
	int i_1_ = (-1091172141 * Class18.anInt205 > i_0_
		    ? Class18.anInt205 * -1091172141 : i_0_);
	if (this == aClass391_4075)
	    return 0;
	if (this == aClass391_4073)
	    return i_1_ - i;
	if (aClass391_4074 == this)
	    return (i_1_ - i) / 2;
	return 0;
    }
    
    public int method6544(int i, int i_2_, byte i_3_) {
	int i_4_ = (-1091172141 * Class18.anInt205 > i_2_
		    ? Class18.anInt205 * -1091172141 : i_2_);
	if (this == aClass391_4075)
	    return 0;
	if (this == aClass391_4073)
	    return i_4_ - i;
	if (aClass391_4074 == this)
	    return (i_4_ - i) / 2;
	return 0;
    }
    
    public int method6545(int i, int i_5_) {
	int i_6_ = (-1091172141 * Class18.anInt205 > i_5_
		    ? Class18.anInt205 * -1091172141 : i_5_);
	if (this == aClass391_4075)
	    return 0;
	if (this == aClass391_4073)
	    return i_6_ - i;
	if (aClass391_4074 == this)
	    return (i_6_ - i) / 2;
	return 0;
    }
    
    public static void method6546(byte i) {
	Class489.aClass163_5313 = null;
	Class274.aClass163_3040 = null;
	Class47.aClass163_354 = null;
	Class579.aClass163_7758 = null;
	Class245.aClass163_2418 = null;
	Class43.aClass163_324 = null;
	Class495.aClass163_5536 = null;
	Class573.aClass163_7673 = null;
	Class57.aClass171_458 = null;
	Class287.aClass16_3084 = null;
    }
    
    static final void method6547(Class669 class669, byte i) {
	if (Class599.aClass298_Sub1_7871.method5425(1982060774)
	    != Class293.aClass293_3124)
	    throw new RuntimeException();
	((Class706_Sub3) Class599.aClass298_Sub1_7871.method5381(1416386892))
	    .method17269
	    ((class669.anIntArray8595
	      [(class669.anInt8600 -= 308999563) * 2088438307]),
	     -1704198862);
    }
}
