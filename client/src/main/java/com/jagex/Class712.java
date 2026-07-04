/* Class712 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class712
{
    public static Class712 aClass712_8876;
    public int anInt8877;
    public String aString8878;
    public static Class712 aClass712_8879;
    static Class712 aClass712_8880;
    public static Class712 aClass712_8881;
    public static Class712 aClass712_8882 = new Class712("LIVE", 0);
    public static Class534_Sub40 aClass534_Sub40_8883;
    
    static Class712[] method14419() {
	return new Class712[] { aClass712_8876, aClass712_8880, aClass712_8882,
				aClass712_8881, aClass712_8879 };
    }
    
    static {
	aClass712_8881 = new Class712("BUILDLIVE", 3);
	aClass712_8876 = new Class712("RC", 1);
	aClass712_8879 = new Class712("WIP", 2);
	aClass712_8880 = new Class712("INTBETA", 4);
    }
    
    public static Class712 method14420(int i) {
	Class712[] class712s = Class130.method2306(866946278);
	for (int i_0_ = 0; i_0_ < class712s.length; i_0_++) {
	    Class712 class712 = class712s[i_0_];
	    if (class712.anInt8877 * -1439134429 == i)
		return class712;
	}
	return null;
    }
    
    static Class712[] method14421() {
	return new Class712[] { aClass712_8876, aClass712_8880, aClass712_8882,
				aClass712_8881, aClass712_8879 };
    }
    
    public static Class712 method14422(int i) {
	Class712[] class712s = Class130.method2306(331825006);
	for (int i_1_ = 0; i_1_ < class712s.length; i_1_++) {
	    Class712 class712 = class712s[i_1_];
	    if (class712.anInt8877 * -1439134429 == i)
		return class712;
	}
	return null;
    }
    
    Class712(String string, int i) {
	aString8878 = string;
	anInt8877 = i * -1147663733;
    }
    
    static final void method14423(int i) {
	int i_2_ = 0;
	Class556 class556 = client.aClass512_11100.method8424((byte) 83);
	for (int i_3_ = 0;
	     i_3_ < client.aClass512_11100.method8417(-271837550); i_3_++) {
	    for (int i_4_ = 0;
		 i_4_ < client.aClass512_11100.method8418(-1533611049);
		 i_4_++) {
		if (Class537.method8911(class556.aClass568ArrayArrayArray7431,
					i_2_, i_3_, i_4_, true, (byte) 77))
		    i_2_++;
		if (i_2_ >= 512)
		    return;
	    }
	}
    }
    
    static final void method14424(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_5_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_6_
	    = class669.anIntArray8595[1 + 2088438307 * class669.anInt8600];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class440.method7100(i_5_, i_6_, true, (byte) -18);
    }
}
