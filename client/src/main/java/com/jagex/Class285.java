/* Class285 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class285
{
    static Class285 aClass285_3074 = new Class285(0);
    static Class285 aClass285_3075 = new Class285(1);
    static Class285 aClass285_3076 = new Class285(2);
    public static Class285 aClass285_3077 = new Class285(3);
    public static Class285 aClass285_3078 = new Class285(4);
    public static Class285 aClass285_3079 = new Class285(5);
    int anInt3080;
    
    public static Class285 method5256(int i) {
	if (i == aClass285_3074.anInt3080 * -1821981511)
	    return aClass285_3074;
	if (-1821981511 * aClass285_3075.anInt3080 == i)
	    return aClass285_3075;
	if (i == -1821981511 * aClass285_3076.anInt3080)
	    return aClass285_3076;
	if (i == aClass285_3077.anInt3080 * -1821981511)
	    return aClass285_3077;
	if (aClass285_3078.anInt3080 * -1821981511 == i)
	    return aClass285_3078;
	if (-1821981511 * aClass285_3079.anInt3080 == i)
	    return aClass285_3079;
	return null;
    }
    
    Class285(int i) {
	anInt3080 = i * 1260126601;
    }
    
    public static Class285 method5257(int i) {
	if (i == aClass285_3074.anInt3080 * -1821981511)
	    return aClass285_3074;
	if (-1821981511 * aClass285_3075.anInt3080 == i)
	    return aClass285_3075;
	if (i == -1821981511 * aClass285_3076.anInt3080)
	    return aClass285_3076;
	if (i == aClass285_3077.anInt3080 * -1821981511)
	    return aClass285_3077;
	if (aClass285_3078.anInt3080 * -1821981511 == i)
	    return aClass285_3078;
	if (-1821981511 * aClass285_3079.anInt3080 == i)
	    return aClass285_3079;
	return null;
    }
    
    static boolean method5258(String string, String string_0_, byte i) {
	Class680.anInt8668 = 268768563;
	Class65.aClass100_658 = client.aClass100_11094;
	return Class593.method9900(false, false, string, string_0_, -1L);
    }
    
    static final void method5259(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	Class171_Sub4.aClass232_9944.method4244((class669.anIntArray8595
						 [(2088438307
						   * class669.anInt8600)]),
						255, (byte) 38);
    }
    
    public static Class394 method5260(Class534_Sub40 class534_sub40, int i) {
	Class394 class394
	    = Class44_Sub19.method17364(class534_sub40, 454264632);
	int i_1_ = class534_sub40.method16533(-258848859);
	int i_2_ = class534_sub40.method16533(-258848859);
	return new Class394_Sub3(class394.aClass401_4096,
				 class394.aClass391_4095,
				 class394.anInt4101 * -2127596367,
				 -1055236307 * class394.anInt4093,
				 -1607607997 * class394.anInt4097,
				 -228886179 * class394.anInt4098,
				 class394.anInt4099 * -81046249,
				 class394.anInt4100 * -120853723,
				 1210620409 * class394.anInt4094, i_1_, i_2_);
    }
    
    static final void method5261(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.anInt11217 * 851750459;
    }
    
    public static int method5262(int i, int i_3_, int i_4_, int i_5_) {
	if (Class554_Sub1.anInt10671 * -1857977261 < 100)
	    return -2;
	int i_6_ = -2;
	int i_7_ = 2147483647;
	int i_8_ = i_3_ - Class554_Sub1.anInt7368;
	int i_9_ = i_4_ - Class554_Sub1.anInt7369;
	for (Class534_Sub29 class534_sub29
		 = ((Class534_Sub29)
		    Class554_Sub1.aClass700_7413.method14135((byte) -1));
	     null != class534_sub29;
	     class534_sub29 = (Class534_Sub29) Class554_Sub1.aClass700_7413
						   .method14139(1572303047)) {
	    if (1592054281 * class534_sub29.anInt10652 == i) {
		int i_10_ = 1412374331 * class534_sub29.anInt10655;
		int i_11_ = -958626707 * class534_sub29.anInt10653;
		int i_12_ = (Class554_Sub1.anInt7368 + i_10_ << 14
			     | i_11_ + Class554_Sub1.anInt7369);
		int i_13_ = ((i_9_ - i_11_) * (i_9_ - i_11_)
			     + (i_8_ - i_10_) * (i_8_ - i_10_));
		if (i_6_ < 0 || i_13_ < i_7_) {
		    i_6_ = i_12_;
		    i_7_ = i_13_;
		}
	    }
	}
	return i_6_;
    }
    
    static final void method5263(Class669 class669, byte i) {
	class669.anInt8600 -= 308999563;
	int i_14_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class534_Sub37_Sub1.method18458(i_14_, 106127505);
    }
}
