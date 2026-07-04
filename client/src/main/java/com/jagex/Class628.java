/* Class628 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class628
{
    public Interface65 anInterface65_8176;
    
    void method10378(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(704102338);
	    if (i == 0)
		break;
	    if (1 == i)
		anInterface65_8176
		    = Class1.method509(class534_sub40, (byte) 1);
	}
    }
    
    void method10379(Class534_Sub40 class534_sub40, int i) {
	for (;;) {
	    int i_0_ = class534_sub40.method16527(-707527862);
	    if (i_0_ == 0)
		break;
	    if (1 == i_0_)
		anInterface65_8176
		    = Class1.method509(class534_sub40, (byte) 1);
	}
    }
    
    public Class628(Class472 class472) {
	byte[] is = class472.method7738((-448671533
					 * Class617.aClass617_8087.anInt8096),
					(byte) -42);
	if (null != is)
	    method10379(new Class534_Sub40(is), 1290123069);
    }
    
    static final void method10380(Class669 class669, int i) {
	int i_1_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_1_, -467571395);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_1_ >> 16];
	Class534_Sub20.method16195(class247, class243, false, 0, class669,
				   863001122);
    }
    
    static final void method10381(Class669 class669, int i) {
	int i_2_ = 0;
	int i_3_ = 0;
	for (int i_4_ = 0; i_4_ < Class57.aClass451_Sub1Array459.length;
	     i_4_++) {
	    if (null != Class57.aClass451_Sub1Array459[i_4_]
		&& Class57.aClass451_Sub1Array459[i_4_]
		       .method15892((byte) 5)) {
		i_2_ += Class57.aClass451_Sub1Array459[i_4_]
			    .method15901((byte) 123);
		i_3_ += Class57.aClass451_Sub1Array459[i_4_]
			    .method15907((byte) 25);
	    }
	}
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 0 == i_2_ ? 0 : 100 * i_3_ / i_2_;
    }
    
    static final void method10382(Class669 class669, byte i) {
	int i_5_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class15 class15
	    = ((Class15)
	       Class531.aClass44_Sub7_7135.method91(i_5_, -1767954805));
	if (-1 == -667959667 * class15.anInt163
	    && class15.anInt162 * 344178797 >= 0)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= class15.anInt162 * 344178797;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= i_5_;
    }
    
    static final boolean method10383(int[][] is, int[][] is_6_, int i,
				     int i_7_, int i_8_, int i_9_, int i_10_,
				     int i_11_) {
	for (int i_12_ = i_7_; i_12_ <= i_9_; i_12_++) {
	    for (int i_13_ = i_8_; i_13_ <= i_10_; i_13_++) {
		if (i == is[i_12_][i_13_] && is_6_[i_12_][i_13_] <= 1)
		    return true;
	    }
	}
	return false;
    }
}
