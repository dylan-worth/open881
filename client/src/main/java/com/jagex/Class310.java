/* Class310 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class310
{
    int anInt3355;
    static Class310 aClass310_3356 = new Class310(0);
    static Class310 aClass310_3357;
    static Class310 aClass310_3358 = new Class310(1);
    static Class163[] aClass163Array3359;
    
    static Class310 method5661(int i) {
	if (i == aClass310_3356.anInt3355 * 1876983303)
	    return aClass310_3356;
	if (aClass310_3358.anInt3355 * 1876983303 == i)
	    return aClass310_3358;
	if (1876983303 * aClass310_3357.anInt3355 == i)
	    return aClass310_3357;
	return null;
    }
    
    static {
	aClass310_3357 = new Class310(2);
    }
    
    Class310(int i) {
	anInt3355 = i * 1457557431;
    }
    
    static Class310 method5662(int i) {
	if (i == aClass310_3356.anInt3355 * 1876983303)
	    return aClass310_3356;
	if (aClass310_3358.anInt3355 * 1876983303 == i)
	    return aClass310_3358;
	if (1876983303 * aClass310_3357.anInt3355 == i)
	    return aClass310_3357;
	return null;
    }
    
    static final void method5663(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_0_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_1_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	Class273.method5102(6, i_0_, i_1_, "", (byte) 4);
    }
    
    public static int method5664(CharSequence charsequence,
				 CharSequence charsequence_2_,
				 Class672 class672, int i) {
	int i_3_ = charsequence.length();
	int i_4_ = charsequence_2_.length();
	int i_5_ = 0;
	int i_6_ = 0;
	char c = '\0';
	char c_7_ = '\0';
	while (i_5_ - c < i_3_ || i_6_ - c_7_ < i_4_) {
	    if (i_5_ - c >= i_3_)
		return -1;
	    if (i_6_ - c_7_ >= i_4_)
		return 1;
	    char c_8_;
	    if (0 != c) {
		c_8_ = c;
		boolean bool = false;
	    } else
		c_8_ = charsequence.charAt(i_5_++);
	    char c_9_;
	    if (0 != c_7_) {
		c_9_ = c_7_;
		boolean bool = false;
	    } else
		c_9_ = charsequence_2_.charAt(i_6_++);
	    c = Class287.method5269(c_8_, -1288678191);
	    c_7_ = Class287.method5269(c_9_, 1604370946);
	    c_8_ = Class631.method10469(c_8_, class672, -1701910830);
	    c_9_ = Class631.method10469(c_9_, class672, -1612120351);
	    if (c_8_ != c_9_ && (Character.toUpperCase(c_8_)
				 != Character.toUpperCase(c_9_))) {
		c_8_ = Character.toLowerCase(c_8_);
		c_9_ = Character.toLowerCase(c_9_);
		if (c_8_ != c_9_)
		    return (Class471.method7657(c_8_, class672, 1263013045)
			    - Class471.method7657(c_9_, class672, 1653202259));
	    }
	}
	int i_10_ = Math.min(i_3_, i_4_);
	for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
	    if (Class672.aClass672_8631 == class672) {
		i_5_ = i_3_ - 1 - i_11_;
		i_6_ = i_4_ - 1 - i_11_;
	    } else
		i_5_ = i_6_ = i_11_;
	    char c_12_ = charsequence.charAt(i_5_);
	    char c_13_ = charsequence_2_.charAt(i_6_);
	    if (c_12_ != c_13_ && (Character.toUpperCase(c_12_)
				   != Character.toUpperCase(c_13_))) {
		c_12_ = Character.toLowerCase(c_12_);
		c_13_ = Character.toLowerCase(c_13_);
		if (c_12_ != c_13_)
		    return (Class471.method7657(c_12_, class672, 2083449464)
			    - Class471.method7657(c_13_, class672,
						  1405212716));
	    }
	}
	int i_14_ = i_3_ - i_4_;
	if (i_14_ != 0)
	    return i_14_;
	for (int i_15_ = 0; i_15_ < i_10_; i_15_++) {
	    char c_16_ = charsequence.charAt(i_15_);
	    char c_17_ = charsequence_2_.charAt(i_15_);
	    if (c_17_ != c_16_)
		return (Class471.method7657(c_16_, class672, 1962535022)
			- Class471.method7657(c_17_, class672, 1648775400));
	}
	return 0;
    }
    
    static final void method5665(Class669 class669, int i) {
	int i_18_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub11_10749
		  .method14026(i_18_, -2024064741);
    }
}
