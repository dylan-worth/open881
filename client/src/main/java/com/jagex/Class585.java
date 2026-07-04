/* Class585 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class585
{
    static Class6[] aClass6Array7799;
    
    Class585() throws Throwable {
	throw new Error();
    }
    
    public static void method9843
	(float f, Class438 class438, Class438 class438_0_,
	 Class438 class438_1_, Class438 class438_2_, Class438 class438_3_,
	 float f_4_, float f_5_, float f_6_, float f_7_) {
	if (!class438_0_.method7056(class438)) {
	    Class438 class438_8_ = Class438.method7055(class438_0_, class438);
	    float f_9_ = class438_8_.method7012();
	    if (f_4_ > 0.0F) {
		class438_2_ = Class438.method6994(class438_2_);
		class438_2_.method7016(f_5_ * (f_9_ / f_4_));
	    }
	    if (class438_2_.aFloat4864 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class438.aFloat4864) || f_9_ > f_6_) {
		class438.method6992(class438_0_);
		class438_1_.method6999();
	    } else {
		Class438 class438_10_ = Class438.method6994(class438_1_);
		class438_10_.method7013();
		Class438 class438_11_
		    = Class438.method7018(class438_10_, class438_2_);
		Class438 class438_12_
		    = Class438.method7015(class438_10_, class438_11_);
		class438_12_.method7016(0.5F);
		Class438 class438_13_ = Class438.method6994(class438_1_);
		Class438 class438_14_ = Class438.method6994(class438_8_);
		class438_14_.method7013();
		if (class438_12_.aFloat4864 > class438_14_.aFloat4864) {
		    if (class438_8_.aFloat4864 < 0.0F) {
			class438_13_.aFloat4864 += class438_2_.aFloat4864 * f;
			if (class438_13_.aFloat4864 > 0.0F)
			    class438_13_.aFloat4864 = 0.0F;
		    } else {
			class438_13_.aFloat4864 -= class438_2_.aFloat4864 * f;
			if (class438_13_.aFloat4864 < 0.0F)
			    class438_13_.aFloat4864 = 0.0F;
		    }
		} else if (class438_10_.aFloat4864 < class438_3_.aFloat4864) {
		    if (class438_8_.aFloat4864 < 0.0F) {
			class438_13_.aFloat4864 -= f * class438_2_.aFloat4864;
			if (class438_13_.aFloat4864 < -class438_3_.aFloat4864)
			    class438_13_.aFloat4864 = -class438_3_.aFloat4864;
		    } else {
			class438_13_.aFloat4864 += f * class438_2_.aFloat4864;
			if (class438_13_.aFloat4864 > class438_3_.aFloat4864)
			    class438_13_.aFloat4864 = class438_3_.aFloat4864;
		    }
		}
		if (class438_12_.aFloat4863 > class438_14_.aFloat4863) {
		    if (class438_8_.aFloat4863 < 0.0F) {
			class438_13_.aFloat4863 += class438_2_.aFloat4863 * f;
			if (class438_13_.aFloat4863 > 0.0F)
			    class438_13_.aFloat4863 = 0.0F;
		    } else {
			class438_13_.aFloat4863 -= class438_2_.aFloat4863 * f;
			if (class438_13_.aFloat4863 < 0.0F)
			    class438_13_.aFloat4863 = 0.0F;
		    }
		} else if (class438_10_.aFloat4863 < class438_3_.aFloat4863) {
		    if (class438_8_.aFloat4863 < 0.0F) {
			class438_13_.aFloat4863 -= f * class438_2_.aFloat4863;
			if (class438_13_.aFloat4863 < -class438_3_.aFloat4863)
			    class438_13_.aFloat4863 = -class438_3_.aFloat4863;
		    } else {
			class438_13_.aFloat4863 += f * class438_2_.aFloat4863;
			if (class438_13_.aFloat4863 > class438_3_.aFloat4863)
			    class438_13_.aFloat4863 = class438_3_.aFloat4863;
		    }
		}
		if (class438_12_.aFloat4865 > class438_14_.aFloat4865) {
		    if (class438_8_.aFloat4865 < 0.0F) {
			class438_13_.aFloat4865 += class438_2_.aFloat4865 * f;
			if (class438_13_.aFloat4865 > 0.0F)
			    class438_13_.aFloat4865 = 0.0F;
		    } else {
			class438_13_.aFloat4865 -= f * class438_2_.aFloat4865;
			if (class438_13_.aFloat4865 < 0.0F)
			    class438_13_.aFloat4865 = 0.0F;
		    }
		} else if (class438_10_.aFloat4865 < class438_3_.aFloat4865) {
		    if (class438_8_.aFloat4865 < 0.0F) {
			class438_13_.aFloat4865 -= class438_2_.aFloat4865 * f;
			if (class438_13_.aFloat4865 < -class438_3_.aFloat4865)
			    class438_13_.aFloat4865 = -class438_3_.aFloat4865;
		    } else {
			class438_13_.aFloat4865 += f * class438_2_.aFloat4865;
			if (class438_13_.aFloat4865 > class438_3_.aFloat4865)
			    class438_13_.aFloat4865 = class438_3_.aFloat4865;
		    }
		}
		class438_1_.method7024(class438_13_, 0.8F);
		if (f_9_ < f_7_ && class438_1_.method7012() < f_7_) {
		    class438.method6992(class438_0_);
		    class438_1_.method6999();
		} else
		    class438.method7026(Class438.method7020(class438_1_, f));
		class438_10_.method7074();
		class438_13_.method7074();
		class438_14_.method7074();
	    }
	}
    }
    
    public static void method9844
	(float f, Class438 class438, Class438 class438_15_,
	 Class438 class438_16_, Class438 class438_17_, Class438 class438_18_,
	 float f_19_, float f_20_, float f_21_, float f_22_) {
	if (!class438_15_.method7056(class438)) {
	    Class438 class438_23_
		= Class438.method7055(class438_15_, class438);
	    float f_24_ = class438_23_.method7012();
	    if (f_19_ > 0.0F) {
		class438_17_ = Class438.method6994(class438_17_);
		class438_17_.method7016(f_20_ * (f_24_ / f_19_));
	    }
	    if (class438_17_.aFloat4864 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class438.aFloat4864) || f_24_ > f_21_) {
		class438.method6992(class438_15_);
		class438_16_.method6999();
	    } else {
		Class438 class438_25_ = Class438.method6994(class438_16_);
		class438_25_.method7013();
		Class438 class438_26_
		    = Class438.method7018(class438_25_, class438_17_);
		Class438 class438_27_
		    = Class438.method7015(class438_25_, class438_26_);
		class438_27_.method7016(0.5F);
		Class438 class438_28_ = Class438.method6994(class438_16_);
		Class438 class438_29_ = Class438.method6994(class438_23_);
		class438_29_.method7013();
		if (class438_27_.aFloat4864 > class438_29_.aFloat4864) {
		    if (class438_23_.aFloat4864 < 0.0F) {
			class438_28_.aFloat4864 += class438_17_.aFloat4864 * f;
			if (class438_28_.aFloat4864 > 0.0F)
			    class438_28_.aFloat4864 = 0.0F;
		    } else {
			class438_28_.aFloat4864 -= class438_17_.aFloat4864 * f;
			if (class438_28_.aFloat4864 < 0.0F)
			    class438_28_.aFloat4864 = 0.0F;
		    }
		} else if (class438_25_.aFloat4864 < class438_18_.aFloat4864) {
		    if (class438_23_.aFloat4864 < 0.0F) {
			class438_28_.aFloat4864 -= f * class438_17_.aFloat4864;
			if (class438_28_.aFloat4864 < -class438_18_.aFloat4864)
			    class438_28_.aFloat4864 = -class438_18_.aFloat4864;
		    } else {
			class438_28_.aFloat4864 += f * class438_17_.aFloat4864;
			if (class438_28_.aFloat4864 > class438_18_.aFloat4864)
			    class438_28_.aFloat4864 = class438_18_.aFloat4864;
		    }
		}
		if (class438_27_.aFloat4863 > class438_29_.aFloat4863) {
		    if (class438_23_.aFloat4863 < 0.0F) {
			class438_28_.aFloat4863 += class438_17_.aFloat4863 * f;
			if (class438_28_.aFloat4863 > 0.0F)
			    class438_28_.aFloat4863 = 0.0F;
		    } else {
			class438_28_.aFloat4863 -= class438_17_.aFloat4863 * f;
			if (class438_28_.aFloat4863 < 0.0F)
			    class438_28_.aFloat4863 = 0.0F;
		    }
		} else if (class438_25_.aFloat4863 < class438_18_.aFloat4863) {
		    if (class438_23_.aFloat4863 < 0.0F) {
			class438_28_.aFloat4863 -= f * class438_17_.aFloat4863;
			if (class438_28_.aFloat4863 < -class438_18_.aFloat4863)
			    class438_28_.aFloat4863 = -class438_18_.aFloat4863;
		    } else {
			class438_28_.aFloat4863 += f * class438_17_.aFloat4863;
			if (class438_28_.aFloat4863 > class438_18_.aFloat4863)
			    class438_28_.aFloat4863 = class438_18_.aFloat4863;
		    }
		}
		if (class438_27_.aFloat4865 > class438_29_.aFloat4865) {
		    if (class438_23_.aFloat4865 < 0.0F) {
			class438_28_.aFloat4865 += class438_17_.aFloat4865 * f;
			if (class438_28_.aFloat4865 > 0.0F)
			    class438_28_.aFloat4865 = 0.0F;
		    } else {
			class438_28_.aFloat4865 -= f * class438_17_.aFloat4865;
			if (class438_28_.aFloat4865 < 0.0F)
			    class438_28_.aFloat4865 = 0.0F;
		    }
		} else if (class438_25_.aFloat4865 < class438_18_.aFloat4865) {
		    if (class438_23_.aFloat4865 < 0.0F) {
			class438_28_.aFloat4865 -= class438_17_.aFloat4865 * f;
			if (class438_28_.aFloat4865 < -class438_18_.aFloat4865)
			    class438_28_.aFloat4865 = -class438_18_.aFloat4865;
		    } else {
			class438_28_.aFloat4865 += f * class438_17_.aFloat4865;
			if (class438_28_.aFloat4865 > class438_18_.aFloat4865)
			    class438_28_.aFloat4865 = class438_18_.aFloat4865;
		    }
		}
		class438_16_.method7024(class438_28_, 0.8F);
		if (f_24_ < f_22_ && class438_16_.method7012() < f_22_) {
		    class438.method6992(class438_15_);
		    class438_16_.method6999();
		} else
		    class438.method7026(Class438.method7020(class438_16_, f));
		class438_25_.method7074();
		class438_28_.method7074();
		class438_29_.method7074();
	    }
	}
    }
    
    public static void method9845
	(float f, Class438 class438, Class438 class438_30_,
	 Class438 class438_31_, Class438 class438_32_, Class438 class438_33_,
	 float f_34_, float f_35_, float f_36_, float f_37_) {
	if (!class438_30_.method7056(class438)) {
	    Class438 class438_38_
		= Class438.method7055(class438_30_, class438);
	    float f_39_ = class438_38_.method7012();
	    if (f_34_ > 0.0F) {
		class438_32_ = Class438.method6994(class438_32_);
		class438_32_.method7016(f_35_ * (f_39_ / f_34_));
	    }
	    if (class438_32_.aFloat4864 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class438.aFloat4864) || f_39_ > f_36_) {
		class438.method6992(class438_30_);
		class438_31_.method6999();
	    } else {
		Class438 class438_40_ = Class438.method6994(class438_31_);
		class438_40_.method7013();
		Class438 class438_41_
		    = Class438.method7018(class438_40_, class438_32_);
		Class438 class438_42_
		    = Class438.method7015(class438_40_, class438_41_);
		class438_42_.method7016(0.5F);
		Class438 class438_43_ = Class438.method6994(class438_31_);
		Class438 class438_44_ = Class438.method6994(class438_38_);
		class438_44_.method7013();
		if (class438_42_.aFloat4864 > class438_44_.aFloat4864) {
		    if (class438_38_.aFloat4864 < 0.0F) {
			class438_43_.aFloat4864 += class438_32_.aFloat4864 * f;
			if (class438_43_.aFloat4864 > 0.0F)
			    class438_43_.aFloat4864 = 0.0F;
		    } else {
			class438_43_.aFloat4864 -= class438_32_.aFloat4864 * f;
			if (class438_43_.aFloat4864 < 0.0F)
			    class438_43_.aFloat4864 = 0.0F;
		    }
		} else if (class438_40_.aFloat4864 < class438_33_.aFloat4864) {
		    if (class438_38_.aFloat4864 < 0.0F) {
			class438_43_.aFloat4864 -= f * class438_32_.aFloat4864;
			if (class438_43_.aFloat4864 < -class438_33_.aFloat4864)
			    class438_43_.aFloat4864 = -class438_33_.aFloat4864;
		    } else {
			class438_43_.aFloat4864 += f * class438_32_.aFloat4864;
			if (class438_43_.aFloat4864 > class438_33_.aFloat4864)
			    class438_43_.aFloat4864 = class438_33_.aFloat4864;
		    }
		}
		if (class438_42_.aFloat4863 > class438_44_.aFloat4863) {
		    if (class438_38_.aFloat4863 < 0.0F) {
			class438_43_.aFloat4863 += class438_32_.aFloat4863 * f;
			if (class438_43_.aFloat4863 > 0.0F)
			    class438_43_.aFloat4863 = 0.0F;
		    } else {
			class438_43_.aFloat4863 -= class438_32_.aFloat4863 * f;
			if (class438_43_.aFloat4863 < 0.0F)
			    class438_43_.aFloat4863 = 0.0F;
		    }
		} else if (class438_40_.aFloat4863 < class438_33_.aFloat4863) {
		    if (class438_38_.aFloat4863 < 0.0F) {
			class438_43_.aFloat4863 -= f * class438_32_.aFloat4863;
			if (class438_43_.aFloat4863 < -class438_33_.aFloat4863)
			    class438_43_.aFloat4863 = -class438_33_.aFloat4863;
		    } else {
			class438_43_.aFloat4863 += f * class438_32_.aFloat4863;
			if (class438_43_.aFloat4863 > class438_33_.aFloat4863)
			    class438_43_.aFloat4863 = class438_33_.aFloat4863;
		    }
		}
		if (class438_42_.aFloat4865 > class438_44_.aFloat4865) {
		    if (class438_38_.aFloat4865 < 0.0F) {
			class438_43_.aFloat4865 += class438_32_.aFloat4865 * f;
			if (class438_43_.aFloat4865 > 0.0F)
			    class438_43_.aFloat4865 = 0.0F;
		    } else {
			class438_43_.aFloat4865 -= f * class438_32_.aFloat4865;
			if (class438_43_.aFloat4865 < 0.0F)
			    class438_43_.aFloat4865 = 0.0F;
		    }
		} else if (class438_40_.aFloat4865 < class438_33_.aFloat4865) {
		    if (class438_38_.aFloat4865 < 0.0F) {
			class438_43_.aFloat4865 -= class438_32_.aFloat4865 * f;
			if (class438_43_.aFloat4865 < -class438_33_.aFloat4865)
			    class438_43_.aFloat4865 = -class438_33_.aFloat4865;
		    } else {
			class438_43_.aFloat4865 += f * class438_32_.aFloat4865;
			if (class438_43_.aFloat4865 > class438_33_.aFloat4865)
			    class438_43_.aFloat4865 = class438_33_.aFloat4865;
		    }
		}
		class438_31_.method7024(class438_43_, 0.8F);
		if (f_39_ < f_37_ && class438_31_.method7012() < f_37_) {
		    class438.method6992(class438_30_);
		    class438_31_.method6999();
		} else
		    class438.method7026(Class438.method7020(class438_31_, f));
		class438_40_.method7074();
		class438_43_.method7074();
		class438_44_.method7074();
	    }
	}
    }
    
    public static void method9846
	(float f, Class438 class438, Class438 class438_45_,
	 Class438 class438_46_, Class438 class438_47_, Class438 class438_48_,
	 float f_49_, float f_50_, float f_51_, float f_52_) {
	if (!class438_45_.method7056(class438)) {
	    Class438 class438_53_
		= Class438.method7055(class438_45_, class438);
	    float f_54_ = class438_53_.method7012();
	    if (f_49_ > 0.0F) {
		class438_47_ = Class438.method6994(class438_47_);
		class438_47_.method7016(f_50_ * (f_54_ / f_49_));
	    }
	    if (class438_47_.aFloat4864 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class438.aFloat4864) || f_54_ > f_51_) {
		class438.method6992(class438_45_);
		class438_46_.method6999();
	    } else {
		Class438 class438_55_ = Class438.method6994(class438_46_);
		class438_55_.method7013();
		Class438 class438_56_
		    = Class438.method7018(class438_55_, class438_47_);
		Class438 class438_57_
		    = Class438.method7015(class438_55_, class438_56_);
		class438_57_.method7016(0.5F);
		Class438 class438_58_ = Class438.method6994(class438_46_);
		Class438 class438_59_ = Class438.method6994(class438_53_);
		class438_59_.method7013();
		if (class438_57_.aFloat4864 > class438_59_.aFloat4864) {
		    if (class438_53_.aFloat4864 < 0.0F) {
			class438_58_.aFloat4864 += class438_47_.aFloat4864 * f;
			if (class438_58_.aFloat4864 > 0.0F)
			    class438_58_.aFloat4864 = 0.0F;
		    } else {
			class438_58_.aFloat4864 -= class438_47_.aFloat4864 * f;
			if (class438_58_.aFloat4864 < 0.0F)
			    class438_58_.aFloat4864 = 0.0F;
		    }
		} else if (class438_55_.aFloat4864 < class438_48_.aFloat4864) {
		    if (class438_53_.aFloat4864 < 0.0F) {
			class438_58_.aFloat4864 -= f * class438_47_.aFloat4864;
			if (class438_58_.aFloat4864 < -class438_48_.aFloat4864)
			    class438_58_.aFloat4864 = -class438_48_.aFloat4864;
		    } else {
			class438_58_.aFloat4864 += f * class438_47_.aFloat4864;
			if (class438_58_.aFloat4864 > class438_48_.aFloat4864)
			    class438_58_.aFloat4864 = class438_48_.aFloat4864;
		    }
		}
		if (class438_57_.aFloat4863 > class438_59_.aFloat4863) {
		    if (class438_53_.aFloat4863 < 0.0F) {
			class438_58_.aFloat4863 += class438_47_.aFloat4863 * f;
			if (class438_58_.aFloat4863 > 0.0F)
			    class438_58_.aFloat4863 = 0.0F;
		    } else {
			class438_58_.aFloat4863 -= class438_47_.aFloat4863 * f;
			if (class438_58_.aFloat4863 < 0.0F)
			    class438_58_.aFloat4863 = 0.0F;
		    }
		} else if (class438_55_.aFloat4863 < class438_48_.aFloat4863) {
		    if (class438_53_.aFloat4863 < 0.0F) {
			class438_58_.aFloat4863 -= f * class438_47_.aFloat4863;
			if (class438_58_.aFloat4863 < -class438_48_.aFloat4863)
			    class438_58_.aFloat4863 = -class438_48_.aFloat4863;
		    } else {
			class438_58_.aFloat4863 += f * class438_47_.aFloat4863;
			if (class438_58_.aFloat4863 > class438_48_.aFloat4863)
			    class438_58_.aFloat4863 = class438_48_.aFloat4863;
		    }
		}
		if (class438_57_.aFloat4865 > class438_59_.aFloat4865) {
		    if (class438_53_.aFloat4865 < 0.0F) {
			class438_58_.aFloat4865 += class438_47_.aFloat4865 * f;
			if (class438_58_.aFloat4865 > 0.0F)
			    class438_58_.aFloat4865 = 0.0F;
		    } else {
			class438_58_.aFloat4865 -= f * class438_47_.aFloat4865;
			if (class438_58_.aFloat4865 < 0.0F)
			    class438_58_.aFloat4865 = 0.0F;
		    }
		} else if (class438_55_.aFloat4865 < class438_48_.aFloat4865) {
		    if (class438_53_.aFloat4865 < 0.0F) {
			class438_58_.aFloat4865 -= class438_47_.aFloat4865 * f;
			if (class438_58_.aFloat4865 < -class438_48_.aFloat4865)
			    class438_58_.aFloat4865 = -class438_48_.aFloat4865;
		    } else {
			class438_58_.aFloat4865 += f * class438_47_.aFloat4865;
			if (class438_58_.aFloat4865 > class438_48_.aFloat4865)
			    class438_58_.aFloat4865 = class438_48_.aFloat4865;
		    }
		}
		class438_46_.method7024(class438_58_, 0.8F);
		if (f_54_ < f_52_ && class438_46_.method7012() < f_52_) {
		    class438.method6992(class438_45_);
		    class438_46_.method6999();
		} else
		    class438.method7026(Class438.method7020(class438_46_, f));
		class438_55_.method7074();
		class438_58_.method7074();
		class438_59_.method7074();
	    }
	}
    }
    
    static final void method9847(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_60_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_61_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	Class90 class90 = (Class90) Class534_Sub11_Sub13
					.aClass44_Sub22_11730
					.method91(i_61_, -196864958);
	if (class90.method1718(-1400187601))
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= ((Class534_Sub18_Sub3)
		   Class684.aClass53_Sub1_8696.method91(i_60_, 156703337))
		      .method17873(i_61_, class90.aString889, 1036317225);
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= (((Class534_Sub18_Sub3)
		    Class684.aClass53_Sub1_8696.method91(i_60_, -14788325))
		       .method17874
		   (i_61_, class90.anInt888 * 263946597, (byte) 113));
    }
}
