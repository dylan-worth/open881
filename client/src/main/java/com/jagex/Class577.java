/* Class577 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class577
{
    public static void method9764
	(float f, Class438 class438, Class443 class443, Class438 class438_0_,
	 Class438 class438_1_, Class438 class438_2_, Class438 class438_3_,
	 float f_4_, float f_5_, float f_6_, float f_7_) {
	if (!class438_0_.method7056(class438)) {
	    Class438 class438_8_ = Class438.method6996(0.0F, 0.0F, 0.0F);
	    Class438 class438_9_
		= Class438.method6994(Class438.method7055(class438_0_,
							  class438));
	    class438_9_.method7021(class443);
	    Class438 class438_10_
		= Class438.method7055(class438_9_, class438_8_);
	    float f_11_ = class438_10_.method7012();
	    if (f_4_ > 0.0F) {
		class438_2_ = Class438.method6994(class438_2_);
		class438_2_.method7016(f_5_ * (f_11_ / f_4_));
	    }
	    if (class438_2_.aFloat4864 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class438.aFloat4864) || f_11_ > f_6_
		|| f_11_ < f_7_) {
		class438.method6992(class438_0_);
		class438_1_.method6999();
	    } else {
		class443.method7182();
		Class438 class438_12_ = Class438.method6996(1.0F, 0.0F, 0.0F);
		Class438 class438_13_ = Class438.method6996(0.0F, 1.0F, 0.0F);
		Class438 class438_14_ = Class438.method6996(0.0F, 0.0F, 1.0F);
		class438_12_.method7021(class443);
		class438_13_.method7021(class443);
		class438_14_.method7021(class443);
		Class438 class438_15_
		    = Class438.method6996(Class438.method7027(class438_12_,
							      class438_1_),
					  Class438.method7027(class438_13_,
							      class438_1_),
					  Class438.method7027(class438_14_,
							      class438_1_));
		Class438 class438_16_ = Class438.method6994(class438_15_);
		class438_16_.method7013();
		Class438 class438_17_
		    = Class438.method7018(Class438.method7015(class438_16_,
							      class438_16_),
					  Class438.method7020(class438_2_,
							      2.0F));
		Class438 class438_18_ = Class438.method6994(class438_10_);
		class438_18_.method7013();
		Class438 class438_19_ = Class438.method6994(class438_15_);
		if (class438_17_.aFloat4864 > class438_18_.aFloat4864) {
		    if (class438_10_.aFloat4864 < 0.0F) {
			class438_19_.aFloat4864 += f * class438_2_.aFloat4864;
			if (class438_19_.aFloat4864 > 0.0F)
			    class438_19_.aFloat4864 = 0.0F;
		    } else {
			class438_19_.aFloat4864 -= f * class438_2_.aFloat4864;
			if (class438_19_.aFloat4864 < 0.0F)
			    class438_19_.aFloat4864 = 0.0F;
		    }
		} else if (class438_16_.aFloat4864 < class438_3_.aFloat4864) {
		    if (class438_10_.aFloat4864 < 0.0F) {
			class438_19_.aFloat4864 -= class438_2_.aFloat4864 * f;
			if (class438_19_.aFloat4864 < -class438_3_.aFloat4864)
			    class438_19_.aFloat4864 = -class438_3_.aFloat4864;
		    } else {
			class438_19_.aFloat4864 += class438_2_.aFloat4864 * f;
			if (class438_19_.aFloat4864 > class438_3_.aFloat4864)
			    class438_19_.aFloat4864 = class438_3_.aFloat4864;
		    }
		}
		if (class438_17_.aFloat4863 > class438_18_.aFloat4863) {
		    if (class438_10_.aFloat4863 < 0.0F) {
			class438_19_.aFloat4863 += class438_2_.aFloat4863 * f;
			if (class438_19_.aFloat4863 > 0.0F)
			    class438_19_.aFloat4863 = 0.0F;
		    } else {
			class438_19_.aFloat4863 -= class438_2_.aFloat4863 * f;
			if (class438_19_.aFloat4863 < 0.0F)
			    class438_19_.aFloat4863 = 0.0F;
		    }
		} else if (class438_16_.aFloat4863 < class438_3_.aFloat4863) {
		    if (class438_10_.aFloat4863 < 0.0F) {
			class438_19_.aFloat4863 -= f * class438_2_.aFloat4863;
			if (class438_19_.aFloat4863 < -class438_3_.aFloat4863)
			    class438_19_.aFloat4863 = -class438_3_.aFloat4863;
		    } else {
			class438_19_.aFloat4863 += class438_2_.aFloat4863 * f;
			if (class438_19_.aFloat4863 > class438_3_.aFloat4863)
			    class438_19_.aFloat4863 = class438_3_.aFloat4863;
		    }
		}
		if (class438_17_.aFloat4865 > class438_18_.aFloat4865) {
		    if (class438_10_.aFloat4865 < 0.0F) {
			class438_19_.aFloat4865 += class438_2_.aFloat4865 * f;
			if (class438_19_.aFloat4865 > 0.0F)
			    class438_19_.aFloat4865 = 0.0F;
		    } else {
			class438_19_.aFloat4865 -= class438_2_.aFloat4865 * f;
			if (class438_19_.aFloat4865 < 0.0F)
			    class438_19_.aFloat4865 = 0.0F;
		    }
		} else if (class438_16_.aFloat4865 < class438_3_.aFloat4865) {
		    if (class438_10_.aFloat4865 < 0.0F) {
			class438_19_.aFloat4865 -= class438_2_.aFloat4865 * f;
			if (class438_19_.aFloat4865 < -class438_3_.aFloat4865)
			    class438_19_.aFloat4865 = -class438_3_.aFloat4865;
		    } else {
			class438_19_.aFloat4865 += class438_2_.aFloat4865 * f;
			if (class438_19_.aFloat4865 > class438_3_.aFloat4865)
			    class438_19_.aFloat4865 = class438_3_.aFloat4865;
		    }
		}
		Class438 class438_20_
		    = Class438.method7020(class438_12_,
					  class438_19_.aFloat4864);
		class438_20_.method7086(class438_13_, class438_19_.aFloat4863);
		class438_20_.method7086(class438_14_, class438_19_.aFloat4865);
		class438_1_.method7024(class438_20_, 0.8F);
		class438.method7026(Class438.method7020(class438_1_, f));
		class438_16_.method7074();
		class438_19_.method7074();
		class438_18_.method7074();
	    }
	}
    }
    
    public static void method9765
	(float f, Class438 class438, Class443 class443, Class438 class438_21_,
	 Class438 class438_22_, Class438 class438_23_, Class438 class438_24_,
	 float f_25_, float f_26_, float f_27_, float f_28_) {
	if (!class438_21_.method7056(class438)) {
	    Class438 class438_29_ = Class438.method6996(0.0F, 0.0F, 0.0F);
	    Class438 class438_30_
		= Class438.method6994(Class438.method7055(class438_21_,
							  class438));
	    class438_30_.method7021(class443);
	    Class438 class438_31_
		= Class438.method7055(class438_30_, class438_29_);
	    float f_32_ = class438_31_.method7012();
	    if (f_25_ > 0.0F) {
		class438_23_ = Class438.method6994(class438_23_);
		class438_23_.method7016(f_26_ * (f_32_ / f_25_));
	    }
	    if (class438_23_.aFloat4864 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class438.aFloat4864) || f_32_ > f_27_
		|| f_32_ < f_28_) {
		class438.method6992(class438_21_);
		class438_22_.method6999();
	    } else {
		class443.method7182();
		Class438 class438_33_ = Class438.method6996(1.0F, 0.0F, 0.0F);
		Class438 class438_34_ = Class438.method6996(0.0F, 1.0F, 0.0F);
		Class438 class438_35_ = Class438.method6996(0.0F, 0.0F, 1.0F);
		class438_33_.method7021(class443);
		class438_34_.method7021(class443);
		class438_35_.method7021(class443);
		Class438 class438_36_
		    = Class438.method6996(Class438.method7027(class438_33_,
							      class438_22_),
					  Class438.method7027(class438_34_,
							      class438_22_),
					  Class438.method7027(class438_35_,
							      class438_22_));
		Class438 class438_37_ = Class438.method6994(class438_36_);
		class438_37_.method7013();
		Class438 class438_38_
		    = Class438.method7018(Class438.method7015(class438_37_,
							      class438_37_),
					  Class438.method7020(class438_23_,
							      2.0F));
		Class438 class438_39_ = Class438.method6994(class438_31_);
		class438_39_.method7013();
		Class438 class438_40_ = Class438.method6994(class438_36_);
		if (class438_38_.aFloat4864 > class438_39_.aFloat4864) {
		    if (class438_31_.aFloat4864 < 0.0F) {
			class438_40_.aFloat4864 += f * class438_23_.aFloat4864;
			if (class438_40_.aFloat4864 > 0.0F)
			    class438_40_.aFloat4864 = 0.0F;
		    } else {
			class438_40_.aFloat4864 -= f * class438_23_.aFloat4864;
			if (class438_40_.aFloat4864 < 0.0F)
			    class438_40_.aFloat4864 = 0.0F;
		    }
		} else if (class438_37_.aFloat4864 < class438_24_.aFloat4864) {
		    if (class438_31_.aFloat4864 < 0.0F) {
			class438_40_.aFloat4864 -= class438_23_.aFloat4864 * f;
			if (class438_40_.aFloat4864 < -class438_24_.aFloat4864)
			    class438_40_.aFloat4864 = -class438_24_.aFloat4864;
		    } else {
			class438_40_.aFloat4864 += class438_23_.aFloat4864 * f;
			if (class438_40_.aFloat4864 > class438_24_.aFloat4864)
			    class438_40_.aFloat4864 = class438_24_.aFloat4864;
		    }
		}
		if (class438_38_.aFloat4863 > class438_39_.aFloat4863) {
		    if (class438_31_.aFloat4863 < 0.0F) {
			class438_40_.aFloat4863 += class438_23_.aFloat4863 * f;
			if (class438_40_.aFloat4863 > 0.0F)
			    class438_40_.aFloat4863 = 0.0F;
		    } else {
			class438_40_.aFloat4863 -= class438_23_.aFloat4863 * f;
			if (class438_40_.aFloat4863 < 0.0F)
			    class438_40_.aFloat4863 = 0.0F;
		    }
		} else if (class438_37_.aFloat4863 < class438_24_.aFloat4863) {
		    if (class438_31_.aFloat4863 < 0.0F) {
			class438_40_.aFloat4863 -= f * class438_23_.aFloat4863;
			if (class438_40_.aFloat4863 < -class438_24_.aFloat4863)
			    class438_40_.aFloat4863 = -class438_24_.aFloat4863;
		    } else {
			class438_40_.aFloat4863 += class438_23_.aFloat4863 * f;
			if (class438_40_.aFloat4863 > class438_24_.aFloat4863)
			    class438_40_.aFloat4863 = class438_24_.aFloat4863;
		    }
		}
		if (class438_38_.aFloat4865 > class438_39_.aFloat4865) {
		    if (class438_31_.aFloat4865 < 0.0F) {
			class438_40_.aFloat4865 += class438_23_.aFloat4865 * f;
			if (class438_40_.aFloat4865 > 0.0F)
			    class438_40_.aFloat4865 = 0.0F;
		    } else {
			class438_40_.aFloat4865 -= class438_23_.aFloat4865 * f;
			if (class438_40_.aFloat4865 < 0.0F)
			    class438_40_.aFloat4865 = 0.0F;
		    }
		} else if (class438_37_.aFloat4865 < class438_24_.aFloat4865) {
		    if (class438_31_.aFloat4865 < 0.0F) {
			class438_40_.aFloat4865 -= class438_23_.aFloat4865 * f;
			if (class438_40_.aFloat4865 < -class438_24_.aFloat4865)
			    class438_40_.aFloat4865 = -class438_24_.aFloat4865;
		    } else {
			class438_40_.aFloat4865 += class438_23_.aFloat4865 * f;
			if (class438_40_.aFloat4865 > class438_24_.aFloat4865)
			    class438_40_.aFloat4865 = class438_24_.aFloat4865;
		    }
		}
		Class438 class438_41_
		    = Class438.method7020(class438_33_,
					  class438_40_.aFloat4864);
		class438_41_.method7086(class438_34_, class438_40_.aFloat4863);
		class438_41_.method7086(class438_35_, class438_40_.aFloat4865);
		class438_22_.method7024(class438_41_, 0.8F);
		class438.method7026(Class438.method7020(class438_22_, f));
		class438_37_.method7074();
		class438_40_.method7074();
		class438_39_.method7074();
	    }
	}
    }
    
    public static void method9766
	(float f, Class438 class438, Class443 class443, Class438 class438_42_,
	 Class438 class438_43_, Class438 class438_44_, Class438 class438_45_,
	 float f_46_, float f_47_, float f_48_, float f_49_) {
	if (!class438_42_.method7056(class438)) {
	    Class438 class438_50_ = Class438.method6996(0.0F, 0.0F, 0.0F);
	    Class438 class438_51_
		= Class438.method6994(Class438.method7055(class438_42_,
							  class438));
	    class438_51_.method7021(class443);
	    Class438 class438_52_
		= Class438.method7055(class438_51_, class438_50_);
	    float f_53_ = class438_52_.method7012();
	    if (f_46_ > 0.0F) {
		class438_44_ = Class438.method6994(class438_44_);
		class438_44_.method7016(f_47_ * (f_53_ / f_46_));
	    }
	    if (class438_44_.aFloat4864 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class438.aFloat4864) || f_53_ > f_48_
		|| f_53_ < f_49_) {
		class438.method6992(class438_42_);
		class438_43_.method6999();
	    } else {
		class443.method7182();
		Class438 class438_54_ = Class438.method6996(1.0F, 0.0F, 0.0F);
		Class438 class438_55_ = Class438.method6996(0.0F, 1.0F, 0.0F);
		Class438 class438_56_ = Class438.method6996(0.0F, 0.0F, 1.0F);
		class438_54_.method7021(class443);
		class438_55_.method7021(class443);
		class438_56_.method7021(class443);
		Class438 class438_57_
		    = Class438.method6996(Class438.method7027(class438_54_,
							      class438_43_),
					  Class438.method7027(class438_55_,
							      class438_43_),
					  Class438.method7027(class438_56_,
							      class438_43_));
		Class438 class438_58_ = Class438.method6994(class438_57_);
		class438_58_.method7013();
		Class438 class438_59_
		    = Class438.method7018(Class438.method7015(class438_58_,
							      class438_58_),
					  Class438.method7020(class438_44_,
							      2.0F));
		Class438 class438_60_ = Class438.method6994(class438_52_);
		class438_60_.method7013();
		Class438 class438_61_ = Class438.method6994(class438_57_);
		if (class438_59_.aFloat4864 > class438_60_.aFloat4864) {
		    if (class438_52_.aFloat4864 < 0.0F) {
			class438_61_.aFloat4864 += f * class438_44_.aFloat4864;
			if (class438_61_.aFloat4864 > 0.0F)
			    class438_61_.aFloat4864 = 0.0F;
		    } else {
			class438_61_.aFloat4864 -= f * class438_44_.aFloat4864;
			if (class438_61_.aFloat4864 < 0.0F)
			    class438_61_.aFloat4864 = 0.0F;
		    }
		} else if (class438_58_.aFloat4864 < class438_45_.aFloat4864) {
		    if (class438_52_.aFloat4864 < 0.0F) {
			class438_61_.aFloat4864 -= class438_44_.aFloat4864 * f;
			if (class438_61_.aFloat4864 < -class438_45_.aFloat4864)
			    class438_61_.aFloat4864 = -class438_45_.aFloat4864;
		    } else {
			class438_61_.aFloat4864 += class438_44_.aFloat4864 * f;
			if (class438_61_.aFloat4864 > class438_45_.aFloat4864)
			    class438_61_.aFloat4864 = class438_45_.aFloat4864;
		    }
		}
		if (class438_59_.aFloat4863 > class438_60_.aFloat4863) {
		    if (class438_52_.aFloat4863 < 0.0F) {
			class438_61_.aFloat4863 += class438_44_.aFloat4863 * f;
			if (class438_61_.aFloat4863 > 0.0F)
			    class438_61_.aFloat4863 = 0.0F;
		    } else {
			class438_61_.aFloat4863 -= class438_44_.aFloat4863 * f;
			if (class438_61_.aFloat4863 < 0.0F)
			    class438_61_.aFloat4863 = 0.0F;
		    }
		} else if (class438_58_.aFloat4863 < class438_45_.aFloat4863) {
		    if (class438_52_.aFloat4863 < 0.0F) {
			class438_61_.aFloat4863 -= f * class438_44_.aFloat4863;
			if (class438_61_.aFloat4863 < -class438_45_.aFloat4863)
			    class438_61_.aFloat4863 = -class438_45_.aFloat4863;
		    } else {
			class438_61_.aFloat4863 += class438_44_.aFloat4863 * f;
			if (class438_61_.aFloat4863 > class438_45_.aFloat4863)
			    class438_61_.aFloat4863 = class438_45_.aFloat4863;
		    }
		}
		if (class438_59_.aFloat4865 > class438_60_.aFloat4865) {
		    if (class438_52_.aFloat4865 < 0.0F) {
			class438_61_.aFloat4865 += class438_44_.aFloat4865 * f;
			if (class438_61_.aFloat4865 > 0.0F)
			    class438_61_.aFloat4865 = 0.0F;
		    } else {
			class438_61_.aFloat4865 -= class438_44_.aFloat4865 * f;
			if (class438_61_.aFloat4865 < 0.0F)
			    class438_61_.aFloat4865 = 0.0F;
		    }
		} else if (class438_58_.aFloat4865 < class438_45_.aFloat4865) {
		    if (class438_52_.aFloat4865 < 0.0F) {
			class438_61_.aFloat4865 -= class438_44_.aFloat4865 * f;
			if (class438_61_.aFloat4865 < -class438_45_.aFloat4865)
			    class438_61_.aFloat4865 = -class438_45_.aFloat4865;
		    } else {
			class438_61_.aFloat4865 += class438_44_.aFloat4865 * f;
			if (class438_61_.aFloat4865 > class438_45_.aFloat4865)
			    class438_61_.aFloat4865 = class438_45_.aFloat4865;
		    }
		}
		Class438 class438_62_
		    = Class438.method7020(class438_54_,
					  class438_61_.aFloat4864);
		class438_62_.method7086(class438_55_, class438_61_.aFloat4863);
		class438_62_.method7086(class438_56_, class438_61_.aFloat4865);
		class438_43_.method7024(class438_62_, 0.8F);
		class438.method7026(Class438.method7020(class438_43_, f));
		class438_58_.method7074();
		class438_61_.method7074();
		class438_60_.method7074();
	    }
	}
    }
    
    Class577() throws Throwable {
	throw new Error();
    }
    
    public static void method9767
	(float f, Class438 class438, Class443 class443, Class438 class438_63_,
	 Class438 class438_64_, Class438 class438_65_, Class438 class438_66_,
	 float f_67_, float f_68_, float f_69_, float f_70_) {
	if (!class438_63_.method7056(class438)) {
	    Class438 class438_71_ = Class438.method6996(0.0F, 0.0F, 0.0F);
	    Class438 class438_72_
		= Class438.method6994(Class438.method7055(class438_63_,
							  class438));
	    class438_72_.method7021(class443);
	    Class438 class438_73_
		= Class438.method7055(class438_72_, class438_71_);
	    float f_74_ = class438_73_.method7012();
	    if (f_67_ > 0.0F) {
		class438_65_ = Class438.method6994(class438_65_);
		class438_65_.method7016(f_68_ * (f_74_ / f_67_));
	    }
	    if (class438_65_.aFloat4864 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class438.aFloat4864) || f_74_ > f_69_
		|| f_74_ < f_70_) {
		class438.method6992(class438_63_);
		class438_64_.method6999();
	    } else {
		class443.method7182();
		Class438 class438_75_ = Class438.method6996(1.0F, 0.0F, 0.0F);
		Class438 class438_76_ = Class438.method6996(0.0F, 1.0F, 0.0F);
		Class438 class438_77_ = Class438.method6996(0.0F, 0.0F, 1.0F);
		class438_75_.method7021(class443);
		class438_76_.method7021(class443);
		class438_77_.method7021(class443);
		Class438 class438_78_
		    = Class438.method6996(Class438.method7027(class438_75_,
							      class438_64_),
					  Class438.method7027(class438_76_,
							      class438_64_),
					  Class438.method7027(class438_77_,
							      class438_64_));
		Class438 class438_79_ = Class438.method6994(class438_78_);
		class438_79_.method7013();
		Class438 class438_80_
		    = Class438.method7018(Class438.method7015(class438_79_,
							      class438_79_),
					  Class438.method7020(class438_65_,
							      2.0F));
		Class438 class438_81_ = Class438.method6994(class438_73_);
		class438_81_.method7013();
		Class438 class438_82_ = Class438.method6994(class438_78_);
		if (class438_80_.aFloat4864 > class438_81_.aFloat4864) {
		    if (class438_73_.aFloat4864 < 0.0F) {
			class438_82_.aFloat4864 += f * class438_65_.aFloat4864;
			if (class438_82_.aFloat4864 > 0.0F)
			    class438_82_.aFloat4864 = 0.0F;
		    } else {
			class438_82_.aFloat4864 -= f * class438_65_.aFloat4864;
			if (class438_82_.aFloat4864 < 0.0F)
			    class438_82_.aFloat4864 = 0.0F;
		    }
		} else if (class438_79_.aFloat4864 < class438_66_.aFloat4864) {
		    if (class438_73_.aFloat4864 < 0.0F) {
			class438_82_.aFloat4864 -= class438_65_.aFloat4864 * f;
			if (class438_82_.aFloat4864 < -class438_66_.aFloat4864)
			    class438_82_.aFloat4864 = -class438_66_.aFloat4864;
		    } else {
			class438_82_.aFloat4864 += class438_65_.aFloat4864 * f;
			if (class438_82_.aFloat4864 > class438_66_.aFloat4864)
			    class438_82_.aFloat4864 = class438_66_.aFloat4864;
		    }
		}
		if (class438_80_.aFloat4863 > class438_81_.aFloat4863) {
		    if (class438_73_.aFloat4863 < 0.0F) {
			class438_82_.aFloat4863 += class438_65_.aFloat4863 * f;
			if (class438_82_.aFloat4863 > 0.0F)
			    class438_82_.aFloat4863 = 0.0F;
		    } else {
			class438_82_.aFloat4863 -= class438_65_.aFloat4863 * f;
			if (class438_82_.aFloat4863 < 0.0F)
			    class438_82_.aFloat4863 = 0.0F;
		    }
		} else if (class438_79_.aFloat4863 < class438_66_.aFloat4863) {
		    if (class438_73_.aFloat4863 < 0.0F) {
			class438_82_.aFloat4863 -= f * class438_65_.aFloat4863;
			if (class438_82_.aFloat4863 < -class438_66_.aFloat4863)
			    class438_82_.aFloat4863 = -class438_66_.aFloat4863;
		    } else {
			class438_82_.aFloat4863 += class438_65_.aFloat4863 * f;
			if (class438_82_.aFloat4863 > class438_66_.aFloat4863)
			    class438_82_.aFloat4863 = class438_66_.aFloat4863;
		    }
		}
		if (class438_80_.aFloat4865 > class438_81_.aFloat4865) {
		    if (class438_73_.aFloat4865 < 0.0F) {
			class438_82_.aFloat4865 += class438_65_.aFloat4865 * f;
			if (class438_82_.aFloat4865 > 0.0F)
			    class438_82_.aFloat4865 = 0.0F;
		    } else {
			class438_82_.aFloat4865 -= class438_65_.aFloat4865 * f;
			if (class438_82_.aFloat4865 < 0.0F)
			    class438_82_.aFloat4865 = 0.0F;
		    }
		} else if (class438_79_.aFloat4865 < class438_66_.aFloat4865) {
		    if (class438_73_.aFloat4865 < 0.0F) {
			class438_82_.aFloat4865 -= class438_65_.aFloat4865 * f;
			if (class438_82_.aFloat4865 < -class438_66_.aFloat4865)
			    class438_82_.aFloat4865 = -class438_66_.aFloat4865;
		    } else {
			class438_82_.aFloat4865 += class438_65_.aFloat4865 * f;
			if (class438_82_.aFloat4865 > class438_66_.aFloat4865)
			    class438_82_.aFloat4865 = class438_66_.aFloat4865;
		    }
		}
		Class438 class438_83_
		    = Class438.method7020(class438_75_,
					  class438_82_.aFloat4864);
		class438_83_.method7086(class438_76_, class438_82_.aFloat4863);
		class438_83_.method7086(class438_77_, class438_82_.aFloat4865);
		class438_64_.method7024(class438_83_, 0.8F);
		class438.method7026(Class438.method7020(class438_64_, f));
		class438_79_.method7074();
		class438_82_.method7074();
		class438_81_.method7074();
	    }
	}
    }
    
    static final void method9768(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class580.method9816(class247, class243, class669, 16711680);
    }
    
    static final void method9769(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class66.aByte714;
    }
    
    static final void method9770(Class669 class669, byte i) {
	int i_84_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (i_84_ >= 1 && i_84_ <= 2)
	    Class159.method2611(i_84_, -1, -1, false, -1978716528);
    }
    
    static final void method9771(Class669 class669, int i) {
	if (!Class202.method3865((byte) 0))
	    Class440.method7101(1327637973);
    }
    
    static final void method9772(Class669 class669, int i) {
	if (Class666.aClass547_8577.method8995(86, (byte) -65))
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 1;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
    
    static final void method9773(Class669 class669, short i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class540.method8936(class247, class243, class669, -132514782);
    }
}
