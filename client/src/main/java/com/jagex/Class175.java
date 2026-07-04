/* Class175 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class175
{
    public abstract int method2910();
    
    abstract boolean method206();
    
    public abstract int method2911();
    
    abstract boolean method360();
    
    abstract boolean method357();
    
    abstract boolean method2912();
    
    public abstract int method2913();
    
    public abstract int method2914();
    
    public abstract int method2915();
    
    abstract boolean method207();
    
    Class175() {
	/* empty */
    }
    
    public abstract void method364();
    
    public abstract void method361();
    
    abstract boolean method2916();
    
    abstract boolean method2917();
    
    abstract boolean method2918();
    
    public abstract void method142();
    
    public abstract void method362();
    
    abstract boolean method358();
    
    public static void method2919(Class267 class267, byte i) {
	Class283.aClass267_3067 = class267;
    }
    
    static Class310 method2920(int i, int i_0_) {
	if (i == Class310.aClass310_3356.anInt3355 * 1876983303)
	    return Class310.aClass310_3356;
	if (Class310.aClass310_3358.anInt3355 * 1876983303 == i)
	    return Class310.aClass310_3358;
	if (1876983303 * Class310.aClass310_3357.anInt3355 == i)
	    return Class310.aClass310_3357;
	return null;
    }
    
    static final void method2921(Class247 class247, Class243 class243,
				 Class669 class669, byte i) {
	class247.anInt2475
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) * 36724065;
	class247.anInt2549
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) * -727149769;
    }
    
    static final void method2922(Class669 class669, byte i) {
	class669.anInt8600 -= 1235998252;
	int i_1_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_2_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	int i_3_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 2];
	int i_4_
	    = class669.anIntArray8595[3 + class669.anInt8600 * 2088438307];
	i_1_ += i_2_ << 14;
	i_1_ += i_3_ << 28;
	i_1_ += i_4_;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_1_;
    }
    
    static final void method2923(Class669 class669, int i) {
	int i_5_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_5_, 1806675904);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_5_ >> 16];
	Class455.method7419(class247, class243, class669, -2058719284);
    }
    
    static Interface19 method2924(Class352 class352, int i) {
	return new Class680(class352);
    }
    
    static void method2925(int i, int i_6_) {
	Class155.anInt1743 = 1517932627 * i;
	Class534_Sub42_Sub2.aClass534_Sub42_Sub2Array11877
	    = new Class534_Sub42_Sub2[i];
	Class534_Sub18_Sub3.anInt11375 = 0;
    }
}
