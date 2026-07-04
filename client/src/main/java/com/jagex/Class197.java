/* Class197 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class197 implements Interface42
{
    Class232 this$0;
    
    Class197(Class232 class232) {
	this$0 = class232;
    }
    
    public float method330(short i) {
	return ((float) Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub28_10784.method17131(804299191)
		/ 255.0F);
    }
    
    public float method331() {
	return ((float) Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub28_10784.method17131(1035516817)
		/ 255.0F);
    }
    
    public static int method3817(int i, int i_0_, int i_1_, int i_2_) {
	int i_3_ = 255 - i_1_;
	i_0_ = (i_1_ * (i_0_ & 0xff00ff) & ~0xff00ff
		| (i_0_ & 0xff00) * i_1_ & 0xff0000) >>> 8;
	return i_0_ + ((i_3_ * (i & 0xff00ff) & ~0xff00ff
			| (i & 0xff00) * i_3_ & 0xff0000)
		       >>> 8);
    }
    
    static final void method3818(Class669 class669, int i) {
	if (class669.anInt8597 * -1712769137 != 0) {
	    Class659 class659
		= (class669.aClass659Array8598
		   [(class669.anInt8597 -= 417597295) * -1712769137]);
	    class669.aClass534_Sub18_Sub8_8614
		= class659.aClass534_Sub18_Sub8_8542;
	    class669.aClass515Array8612
		= class669.aClass534_Sub18_Sub8_8614.aClass515Array11760;
	    class669.anIntArray8591
		= class669.aClass534_Sub18_Sub8_8614.anIntArray11752;
	    class669.anInt8613 = class659.anInt8543 * 1371575037;
	    class669.anIntArray8605 = class659.anIntArray8545;
	    class669.anObjectArray8611 = class659.anObjectArray8544;
	    class669.aLongArray8586 = class659.aLongArray8546;
	}
    }
    
    static final void method3819(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class394.method6560(class247, class243, class669, 777451662);
    }
    
    static final void method3820(Class669 class669, byte i) {
	class669.anInt8600 -= 1235998252;
	int i_4_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_5_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	int i_6_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 2];
	int i_7_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 3];
	int i_8_ = Class211.method3958(1 + (i_7_ - i_6_), (byte) 2);
	if (i_5_ > i_8_)
	    i_5_ = i_8_;
	i_4_ = Class193.method3794(i_4_, i_6_, i_7_, 382156635);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_4_ |= i_5_ <<= i_6_;
    }
    
    public static long method3821(CharSequence charsequence, int i) {
	int i_9_ = charsequence.length();
	long l = 0L;
	for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
	    l = (l << 5) - l + (long) charsequence.charAt(i_10_);
	return l;
    }
    
    static Class559 method3822(Class654_Sub1_Sub5 class654_sub1_sub5, int i) {
	Class559 class559;
	if (Class559.aClass559_7498 == null)
	    class559 = new Class559();
	else {
	    class559 = Class559.aClass559_7498;
	    Class559.aClass559_7498 = Class559.aClass559_7498.aClass559_7497;
	    class559.aClass559_7497 = null;
	    Class559.anInt7499 -= -510773381;
	}
	class559.aClass654_Sub1_Sub5_7500 = class654_sub1_sub5;
	return class559;
    }
    
    static final void method3823(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class534_Sub36.aBool10800 ? 1 : 0;
    }
}
