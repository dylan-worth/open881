/* Class591 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class591
{
    Class591() throws Throwable {
	throw new Error();
    }
    
    public static void method9881(float f, Class438 class438,
				  Class443 class443, Class438 class438_0_,
				  Class438 class438_1_, Class438 class438_2_,
				  float f_3_, float f_4_, float f_5_) {
	if (!class438_0_.method7056(class438)) {
	    Class438 class438_6_ = Class438.method6996(0.0F, 0.0F, 0.0F);
	    Class438 class438_7_
		= Class438.method6994(Class438.method7055(class438_0_,
							  class438));
	    class438_7_.method7021(class443);
	    Class438 class438_8_
		= Class438.method7055(class438_7_, class438_6_);
	    float f_9_ = class438_8_.method7012();
	    if (class438_2_.aFloat4864 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class438.aFloat4864) || f_9_ > f_4_
		|| f_9_ < f_5_) {
		class438.method6992(class438_0_);
		class438_1_.method6999();
	    } else {
		class443.method7182();
		Class438 class438_10_ = Class438.method6996(1.0F, 0.0F, 0.0F);
		Class438 class438_11_ = Class438.method6996(0.0F, 1.0F, 0.0F);
		Class438 class438_12_ = Class438.method6996(0.0F, 0.0F, 1.0F);
		class438_10_.method7021(class443);
		class438_11_.method7021(class443);
		class438_12_.method7021(class443);
		Class438 class438_13_
		    = Class438.method6996(Class438.method7027(class438_10_,
							      class438_1_),
					  Class438.method7027(class438_11_,
							      class438_1_),
					  Class438.method7027(class438_12_,
							      class438_1_));
		Class438 class438_14_ = Class438.method6994(class438_13_);
		Class438 class438_15_
		    = (Class438.method6996
		       (class438_2_.aFloat4864 * class438_8_.aFloat4864,
			class438_2_.aFloat4863 * class438_8_.aFloat4863,
			class438_2_.aFloat4865 * class438_8_.aFloat4865));
		class438_14_.method7086(class438_15_, f);
		class438_14_.method7042(f_3_);
		Class438 class438_16_
		    = Class438.method7020(class438_10_,
					  class438_14_.aFloat4864);
		class438_16_.method7086(class438_11_, class438_14_.aFloat4863);
		class438_16_.method7086(class438_12_, class438_14_.aFloat4865);
		class438_1_.method6992(class438_16_);
		class438.method7026(Class438.method7020(class438_1_, f));
	    }
	}
    }
    
    static final void method9882(Class669 class669, int i) {
	int i_17_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub30_10739
		  .method14026(i_17_, -2024064741);
    }
    
    static boolean method9883(int i, byte i_18_) {
	return 57 == i || i == 58 || i == 1007 || i == 25 || 30 == i;
    }
}
