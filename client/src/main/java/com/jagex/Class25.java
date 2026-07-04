/* Class25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class25
{
    int anInt231;
    int anInt232;
    
    Class25() {
	/* empty */
    }
    
    static final void method855(Class669 class669, byte i) {
	class669.anInt8600 -= 926998689;
	int i_0_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_1_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	int i_2_
	    = class669.anIntArray8595[2 + class669.anInt8600 * 2088438307];
	Class285 class285 = Class54.method1209(i_0_, 206500080);
	float f = (float) i_1_;
	if (Class285.aClass285_3077 == class285
	    || class285 == Class285.aClass285_3078
	    || Class285.aClass285_3079 == class285)
	    f = Class427.method6799(i_1_);
	Class534_Sub18_Sub13_Sub2 class534_sub18_sub13_sub2
	    = new Class534_Sub18_Sub13_Sub2(Class599.aClass298_Sub1_7871
						.method15678(-1037550780),
					    class285, f,
					    (float) i_2_ / 1000.0F);
	Class599.aClass298_Sub1_7871.method5373(class534_sub18_sub13_sub2,
						356365251);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = -997430305 * class534_sub18_sub13_sub2.anInt11802;
    }
    
    static final void method856(Class669 class669, int i) {
	class669.anInt8600 -= 926998689;
	int i_3_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_4_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	int i_5_
	    = class669.anIntArray8595[2 + 2088438307 * class669.anInt8600];
	long l = Class706_Sub3.method17290(0, 0, 12, i_3_, i_4_, i_5_,
					   -1411385943);
	int i_6_ = Class631.method10468(l);
	if (i_5_ < 1970)
	    i_6_--;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_6_;
    }
    
    static final void method857(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_7_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_8_
	    = class669.anIntArray8595[1 + 2088438307 * class669.anInt8600];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_7_ % i_8_;
    }
}
