/* Class438 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class438
{
    static int anInt4861;
    static int anInt4862;
    public float aFloat4863;
    public float aFloat4864;
    public float aFloat4865;
    static Class438[] aClass438Array4866;
    
    public final void method6991(Class438 class438_0_, float f) {
	aFloat4864 += class438_0_.aFloat4864 * f;
	aFloat4863 += class438_0_.aFloat4863 * f;
	aFloat4865 += class438_0_.aFloat4865 * f;
    }
    
    public void method6992(Class438 class438_1_) {
	method6997(class438_1_.aFloat4864, class438_1_.aFloat4863,
		   class438_1_.aFloat4865);
    }
    
    public final void method6993(Class438 class438_2_, float f) {
	method7016(1.0F - f);
	method7026(method7020(class438_2_, f));
    }
    
    public static Class438 method6994(Class438 class438) {
	synchronized (aClass438Array4866) {
	    if (anInt4862 == 0) {
		Class438 class438_3_ = new Class438(class438);
		return class438_3_;
	    }
	    aClass438Array4866[--anInt4862].method6992(class438);
	    Class438 class438_4_ = aClass438Array4866[anInt4862];
	    return class438_4_;
	}
    }
    
    public static final Class438 method6995(Class438 class438,
					    Class438 class438_5_) {
	Class438 class438_6_ = method6994(class438);
	class438_6_.method7006(class438_5_);
	return class438_6_;
    }
    
    public static Class438 method6996(float f, float f_7_, float f_8_) {
	synchronized (aClass438Array4866) {
	    if (anInt4862 == 0) {
		Class438 class438 = new Class438(f, f_7_, f_8_);
		return class438;
	    }
	    aClass438Array4866[--anInt4862].method6997(f, f_7_, f_8_);
	    Class438 class438 = aClass438Array4866[anInt4862];
	    return class438;
	}
    }
    
    public Class438() {
	/* empty */
    }
    
    public Class438(float f, float f_9_, float f_10_) {
	aFloat4864 = f;
	aFloat4863 = f_9_;
	aFloat4865 = f_10_;
    }
    
    public Class438(Class438 class438_11_) {
	aFloat4864 = class438_11_.aFloat4864;
	aFloat4863 = class438_11_.aFloat4863;
	aFloat4865 = class438_11_.aFloat4865;
    }
    
    Class438(Class534_Sub40 class534_sub40) {
	aFloat4864 = class534_sub40.method16539(-1473777668);
	aFloat4863 = class534_sub40.method16539(-1744636014);
	aFloat4865 = class534_sub40.method16539(-1212914892);
    }
    
    public String toString() {
	return new StringBuilder().append(aFloat4864).append(", ").append
		   (aFloat4863).append
		   (", ").append
		   (aFloat4865).toString();
    }
    
    public void method6997(float f, float f_12_, float f_13_) {
	aFloat4864 = f;
	aFloat4863 = f_12_;
	aFloat4865 = f_13_;
    }
    
    public final void method6998(Class443 class443) {
	Class443 class443_14_
	    = Class443.method7138(aFloat4864, aFloat4863, aFloat4865, 0.0F);
	Class443 class443_15_ = Class443.method7200(class443);
	Class443 class443_16_
	    = Class443.method7141(class443_15_, class443_14_);
	class443_16_.method7158(class443);
	method6997(class443_16_.aFloat4881, class443_16_.aFloat4884,
		   class443_16_.aFloat4883);
	class443_14_.method7140();
	class443_15_.method7140();
	class443_16_.method7140();
    }
    
    public final void method6999() {
	aFloat4865 = 0.0F;
	aFloat4863 = 0.0F;
	aFloat4864 = 0.0F;
    }
    
    public final void method7000(Class446 class446) {
	float f = aFloat4864;
	float f_17_ = aFloat4863;
	aFloat4864
	    = (class446.aFloat4894 * f + class446.aFloat4897 * f_17_
	       + class446.aFloat4900 * aFloat4865 + class446.aFloat4903);
	aFloat4863
	    = (class446.aFloat4893 * f + class446.aFloat4904 * f_17_
	       + class446.aFloat4895 * aFloat4865 + class446.aFloat4901);
	aFloat4865
	    = (class446.aFloat4896 * f + class446.aFloat4899 * f_17_
	       + class446.aFloat4902 * aFloat4865 + class446.aFloat4898);
    }
    
    public String method7001() {
	return new StringBuilder().append(aFloat4864).append(", ").append
		   (aFloat4863).append
		   (", ").append
		   (aFloat4865).toString();
    }
    
    public final void method7002() {
	float f = 1.0F / method7012();
	aFloat4864 *= f;
	aFloat4863 *= f;
	aFloat4865 *= f;
    }
    
    public static final float method7003(Class438 class438,
					 Class438 class438_18_) {
	return class438.method7008(class438_18_);
    }
    
    public static final Class438 method7004(Class438 class438, float f) {
	Class438 class438_19_ = method6994(class438);
	class438_19_.method7016(f);
	return class438_19_;
    }
    
    public static final Class438 method7005(Class438 class438,
					    Class438 class438_20_) {
	Class438 class438_21_ = method6994(class438);
	class438_21_.method7026(class438_20_);
	return class438_21_;
    }
    
    public final void method7006(Class438 class438_22_) {
	aFloat4864 -= class438_22_.aFloat4864;
	aFloat4863 -= class438_22_.aFloat4863;
	aFloat4865 -= class438_22_.aFloat4865;
    }
    
    public final void method7007(Class443 class443) {
	Class443 class443_23_
	    = Class443.method7138(aFloat4864, aFloat4863, aFloat4865, 0.0F);
	Class443 class443_24_ = Class443.method7200(class443);
	Class443 class443_25_
	    = Class443.method7141(class443_24_, class443_23_);
	class443_25_.method7158(class443);
	method6997(class443_25_.aFloat4881, class443_25_.aFloat4884,
		   class443_25_.aFloat4883);
	class443_23_.method7140();
	class443_24_.method7140();
	class443_25_.method7140();
    }
    
    public final float method7008(Class438 class438_26_) {
	return (aFloat4864 * class438_26_.aFloat4864
		+ aFloat4863 * class438_26_.aFloat4863
		+ aFloat4865 * class438_26_.aFloat4865);
    }
    
    public final void method7009(Class446 class446) {
	float f = aFloat4864;
	float f_27_ = aFloat4863;
	aFloat4864
	    = (class446.aFloat4894 * f + class446.aFloat4897 * f_27_
	       + class446.aFloat4900 * aFloat4865 + class446.aFloat4903);
	aFloat4863
	    = (class446.aFloat4893 * f + class446.aFloat4904 * f_27_
	       + class446.aFloat4895 * aFloat4865 + class446.aFloat4901);
	aFloat4865
	    = (class446.aFloat4896 * f + class446.aFloat4899 * f_27_
	       + class446.aFloat4902 * aFloat4865 + class446.aFloat4898);
    }
    
    final void method7010(Class438 class438_28_) {
	method6997((aFloat4863 * class438_28_.aFloat4865
		    - aFloat4865 * class438_28_.aFloat4863),
		   (aFloat4865 * class438_28_.aFloat4864
		    - aFloat4864 * class438_28_.aFloat4865),
		   (aFloat4864 * class438_28_.aFloat4863
		    - aFloat4863 * class438_28_.aFloat4864));
    }
    
    public final void method7011(float f) {
	aFloat4864 *= f;
	aFloat4863 *= f;
	aFloat4865 *= f;
    }
    
    public final float method7012() {
	return (float) Math.sqrt((double) (aFloat4864 * aFloat4864
					   + aFloat4863 * aFloat4863
					   + aFloat4865 * aFloat4865));
    }
    
    public final void method7013() {
	if (aFloat4864 < 0.0F)
	    aFloat4864 *= -1.0F;
	if (aFloat4863 < 0.0F)
	    aFloat4863 *= -1.0F;
	if (aFloat4865 < 0.0F)
	    aFloat4865 *= -1.0F;
    }
    
    final void method7014(Class438 class438_29_) {
	aFloat4864 *= class438_29_.aFloat4864;
	aFloat4863 *= class438_29_.aFloat4863;
	aFloat4865 *= class438_29_.aFloat4865;
    }
    
    public static final Class438 method7015(Class438 class438,
					    Class438 class438_30_) {
	Class438 class438_31_ = method6994(class438);
	class438_31_.method7014(class438_30_);
	return class438_31_;
    }
    
    public final void method7016(float f) {
	aFloat4864 *= f;
	aFloat4863 *= f;
	aFloat4865 *= f;
    }
    
    public static void method7017(int i) {
	anInt4861 = i;
	aClass438Array4866 = new Class438[i];
	anInt4862 = 0;
    }
    
    public static final Class438 method7018(Class438 class438,
					    Class438 class438_32_) {
	Class438 class438_33_ = method6994(class438);
	class438_33_.method7067(class438_32_);
	return class438_33_;
    }
    
    public static final Class438 method7019(Class438 class438,
					    Class438 class438_34_) {
	Class438 class438_35_ = method6994(class438);
	class438_35_.method7010(class438_34_);
	return class438_35_;
    }
    
    public static final Class438 method7020(Class438 class438, float f) {
	Class438 class438_36_ = method6994(class438);
	class438_36_.method7016(f);
	return class438_36_;
    }
    
    public final void method7021(Class443 class443) {
	Class443 class443_37_
	    = Class443.method7138(aFloat4864, aFloat4863, aFloat4865, 0.0F);
	Class443 class443_38_ = Class443.method7200(class443);
	Class443 class443_39_
	    = Class443.method7141(class443_38_, class443_37_);
	class443_39_.method7158(class443);
	method6997(class443_39_.aFloat4881, class443_39_.aFloat4884,
		   class443_39_.aFloat4883);
	class443_37_.method7140();
	class443_38_.method7140();
	class443_39_.method7140();
    }
    
    public final void method7022(Class446 class446) {
	float f = aFloat4864;
	float f_40_ = aFloat4863;
	aFloat4864
	    = (class446.aFloat4894 * f + class446.aFloat4897 * f_40_
	       + class446.aFloat4900 * aFloat4865 + class446.aFloat4903);
	aFloat4863
	    = (class446.aFloat4893 * f + class446.aFloat4904 * f_40_
	       + class446.aFloat4895 * aFloat4865 + class446.aFloat4901);
	aFloat4865
	    = (class446.aFloat4896 * f + class446.aFloat4899 * f_40_
	       + class446.aFloat4902 * aFloat4865 + class446.aFloat4898);
    }
    
    final void method7023(Class438 class438_41_) {
	aFloat4864 /= class438_41_.aFloat4864;
	aFloat4863 /= class438_41_.aFloat4863;
	aFloat4865 /= class438_41_.aFloat4865;
    }
    
    public final void method7024(Class438 class438_42_, float f) {
	method7016(1.0F - f);
	method7026(method7020(class438_42_, f));
    }
    
    public static Class438 method7025(Class534_Sub40 class534_sub40) {
	synchronized (aClass438Array4866) {
	    if (anInt4862 == 0) {
		Class438 class438 = new Class438(class534_sub40);
		return class438;
	    }
	    aClass438Array4866[--anInt4862].method7080(class534_sub40);
	    Class438 class438 = aClass438Array4866[anInt4862];
	    return class438;
	}
    }
    
    public final void method7026(Class438 class438_43_) {
	aFloat4864 += class438_43_.aFloat4864;
	aFloat4863 += class438_43_.aFloat4863;
	aFloat4865 += class438_43_.aFloat4865;
    }
    
    public static final float method7027(Class438 class438,
					 Class438 class438_44_) {
	return class438.method7008(class438_44_);
    }
    
    public String method7028() {
	return new StringBuilder().append(aFloat4864).append(", ").append
		   (aFloat4863).append
		   (", ").append
		   (aFloat4865).toString();
    }
    
    public static void method7029(int i) {
	anInt4861 = i;
	aClass438Array4866 = new Class438[i];
	anInt4862 = 0;
    }
    
    public boolean method7030(Class438 class438_45_) {
	if (aFloat4864 != class438_45_.aFloat4864
	    || aFloat4863 != class438_45_.aFloat4863
	    || aFloat4865 != class438_45_.aFloat4865)
	    return false;
	return true;
    }
    
    public static void method7031(int i) {
	anInt4861 = i;
	aClass438Array4866 = new Class438[i];
	anInt4862 = 0;
    }
    
    public static Class438 method7032() {
	synchronized (aClass438Array4866) {
	    if (anInt4862 == 0) {
		Class438 class438 = new Class438();
		return class438;
	    }
	    aClass438Array4866[--anInt4862].method6999();
	    Class438 class438 = aClass438Array4866[anInt4862];
	    return class438;
	}
    }
    
    public static Class438 method7033() {
	synchronized (aClass438Array4866) {
	    if (anInt4862 == 0) {
		Class438 class438 = new Class438();
		return class438;
	    }
	    aClass438Array4866[--anInt4862].method6999();
	    Class438 class438 = aClass438Array4866[anInt4862];
	    return class438;
	}
    }
    
    public static Class438 method7034() {
	synchronized (aClass438Array4866) {
	    if (anInt4862 == 0) {
		Class438 class438 = new Class438();
		return class438;
	    }
	    aClass438Array4866[--anInt4862].method6999();
	    Class438 class438 = aClass438Array4866[anInt4862];
	    return class438;
	}
    }
    
    public static Class438 method7035(float f, float f_46_, float f_47_) {
	synchronized (aClass438Array4866) {
	    if (anInt4862 == 0) {
		Class438 class438 = new Class438(f, f_46_, f_47_);
		return class438;
	    }
	    aClass438Array4866[--anInt4862].method6997(f, f_46_, f_47_);
	    Class438 class438 = aClass438Array4866[anInt4862];
	    return class438;
	}
    }
    
    public static Class438 method7036(float f, float f_48_, float f_49_) {
	synchronized (aClass438Array4866) {
	    if (anInt4862 == 0) {
		Class438 class438 = new Class438(f, f_48_, f_49_);
		return class438;
	    }
	    aClass438Array4866[--anInt4862].method6997(f, f_48_, f_49_);
	    Class438 class438 = aClass438Array4866[anInt4862];
	    return class438;
	}
    }
    
    public static Class438 method7037(float f, float f_50_, float f_51_) {
	synchronized (aClass438Array4866) {
	    if (anInt4862 == 0) {
		Class438 class438 = new Class438(f, f_50_, f_51_);
		return class438;
	    }
	    aClass438Array4866[--anInt4862].method6997(f, f_50_, f_51_);
	    Class438 class438 = aClass438Array4866[anInt4862];
	    return class438;
	}
    }
    
    public static Class438 method7038(Class438 class438) {
	synchronized (aClass438Array4866) {
	    if (anInt4862 == 0) {
		Class438 class438_52_ = new Class438(class438);
		return class438_52_;
	    }
	    aClass438Array4866[--anInt4862].method6992(class438);
	    Class438 class438_53_ = aClass438Array4866[anInt4862];
	    return class438_53_;
	}
    }
    
    public static Class438 method7039(Class438 class438) {
	synchronized (aClass438Array4866) {
	    if (anInt4862 == 0) {
		Class438 class438_54_ = new Class438(class438);
		return class438_54_;
	    }
	    aClass438Array4866[--anInt4862].method6992(class438);
	    Class438 class438_55_ = aClass438Array4866[anInt4862];
	    return class438_55_;
	}
    }
    
    public static Class438 method7040(Class534_Sub40 class534_sub40) {
	synchronized (aClass438Array4866) {
	    if (anInt4862 == 0) {
		Class438 class438 = new Class438(class534_sub40);
		return class438;
	    }
	    aClass438Array4866[--anInt4862].method7080(class534_sub40);
	    Class438 class438 = aClass438Array4866[anInt4862];
	    return class438;
	}
    }
    
    public void method7041() {
	synchronized (aClass438Array4866) {
	    if (anInt4862 < anInt4861 - 1)
		aClass438Array4866[anInt4862++] = this;
	}
    }
    
    public final void method7042(float f) {
	aFloat4864 /= f;
	aFloat4863 /= f;
	aFloat4865 /= f;
    }
    
    public final void method7043(Class443 class443) {
	Class443 class443_56_
	    = Class443.method7138(aFloat4864, aFloat4863, aFloat4865, 0.0F);
	Class443 class443_57_ = Class443.method7200(class443);
	Class443 class443_58_
	    = Class443.method7141(class443_57_, class443_56_);
	class443_58_.method7158(class443);
	method6997(class443_58_.aFloat4881, class443_58_.aFloat4884,
		   class443_58_.aFloat4883);
	class443_56_.method7140();
	class443_57_.method7140();
	class443_58_.method7140();
    }
    
    public void method7044(float f, float f_59_, float f_60_) {
	aFloat4864 = f;
	aFloat4863 = f_59_;
	aFloat4865 = f_60_;
    }
    
    public final void method7045() {
	aFloat4865 = 0.0F;
	aFloat4863 = 0.0F;
	aFloat4864 = 0.0F;
    }
    
    final void method7046(Class438 class438_61_) {
	method6997((aFloat4863 * class438_61_.aFloat4865
		    - aFloat4865 * class438_61_.aFloat4863),
		   (aFloat4865 * class438_61_.aFloat4864
		    - aFloat4864 * class438_61_.aFloat4865),
		   (aFloat4864 * class438_61_.aFloat4863
		    - aFloat4863 * class438_61_.aFloat4864));
    }
    
    public boolean method7047(Class438 class438_62_) {
	if (aFloat4864 != class438_62_.aFloat4864
	    || aFloat4863 != class438_62_.aFloat4863
	    || aFloat4865 != class438_62_.aFloat4865)
	    return false;
	return true;
    }
    
    public boolean method7048(Class438 class438_63_) {
	if (aFloat4864 != class438_63_.aFloat4864
	    || aFloat4863 != class438_63_.aFloat4863
	    || aFloat4865 != class438_63_.aFloat4865)
	    return false;
	return true;
    }
    
    public static final Class438 method7049(Class438 class438,
					    Class438 class438_64_) {
	Class438 class438_65_ = method6994(class438);
	class438_65_.method7014(class438_64_);
	return class438_65_;
    }
    
    public final void method7050(Class438 class438_66_) {
	aFloat4864 += class438_66_.aFloat4864;
	aFloat4863 += class438_66_.aFloat4863;
	aFloat4865 += class438_66_.aFloat4865;
    }
    
    public final void method7051(Class438 class438_67_) {
	aFloat4864 += class438_67_.aFloat4864;
	aFloat4863 += class438_67_.aFloat4863;
	aFloat4865 += class438_67_.aFloat4865;
    }
    
    final void method7052(Class438 class438_68_) {
	aFloat4864 /= class438_68_.aFloat4864;
	aFloat4863 /= class438_68_.aFloat4863;
	aFloat4865 /= class438_68_.aFloat4865;
    }
    
    final void method7053(Class438 class438_69_) {
	aFloat4864 *= class438_69_.aFloat4864;
	aFloat4863 *= class438_69_.aFloat4863;
	aFloat4865 *= class438_69_.aFloat4865;
    }
    
    public final void method7054(Class438 class438_70_, float f) {
	aFloat4864 += class438_70_.aFloat4864 * f;
	aFloat4863 += class438_70_.aFloat4863 * f;
	aFloat4865 += class438_70_.aFloat4865 * f;
    }
    
    public static final Class438 method7055(Class438 class438,
					    Class438 class438_71_) {
	Class438 class438_72_ = method6994(class438);
	class438_72_.method7006(class438_71_);
	return class438_72_;
    }
    
    public boolean method7056(Class438 class438_73_) {
	if (aFloat4864 != class438_73_.aFloat4864
	    || aFloat4863 != class438_73_.aFloat4863
	    || aFloat4865 != class438_73_.aFloat4865)
	    return false;
	return true;
    }
    
    static {
	new Class438(0.0F, 0.0F, 0.0F);
	aClass438Array4866 = new Class438[0];
    }
    
    public final void method7057(Class438 class438_74_) {
	aFloat4864 -= class438_74_.aFloat4864;
	aFloat4863 -= class438_74_.aFloat4863;
	aFloat4865 -= class438_74_.aFloat4865;
    }
    
    public static final Class438 method7058(Class438 class438,
					    Class438 class438_75_) {
	Class438 class438_76_ = method6994(class438);
	class438_76_.method7006(class438_75_);
	return class438_76_;
    }
    
    public final void method7059(Class446 class446) {
	float f = aFloat4864;
	float f_77_ = aFloat4863;
	aFloat4864 = (class446.aFloat4894 * f + class446.aFloat4897 * f_77_
		      + class446.aFloat4900 * aFloat4865);
	aFloat4863 = (class446.aFloat4893 * f + class446.aFloat4904 * f_77_
		      + class446.aFloat4895 * aFloat4865);
	aFloat4865 = (class446.aFloat4896 * f + class446.aFloat4899 * f_77_
		      + class446.aFloat4902 * aFloat4865);
    }
    
    public final float method7060(Class438 class438_78_) {
	return (aFloat4864 * class438_78_.aFloat4864
		+ aFloat4863 * class438_78_.aFloat4863
		+ aFloat4865 * class438_78_.aFloat4865);
    }
    
    public static Class438 method7061() {
	synchronized (aClass438Array4866) {
	    if (anInt4862 == 0) {
		Class438 class438 = new Class438();
		return class438;
	    }
	    aClass438Array4866[--anInt4862].method6999();
	    Class438 class438 = aClass438Array4866[anInt4862];
	    return class438;
	}
    }
    
    public final void method7062(Class438 class438_79_) {
	aFloat4864 += class438_79_.aFloat4864;
	aFloat4863 += class438_79_.aFloat4863;
	aFloat4865 += class438_79_.aFloat4865;
    }
    
    public static final Class438 method7063(Class438 class438,
					    Class438 class438_80_) {
	Class438 class438_81_ = method6994(class438);
	class438_81_.method7010(class438_80_);
	return class438_81_;
    }
    
    public final float method7064() {
	return (float) Math.sqrt((double) (aFloat4864 * aFloat4864
					   + aFloat4863 * aFloat4863
					   + aFloat4865 * aFloat4865));
    }
    
    public final void method7065() {
	if (aFloat4864 < 0.0F)
	    aFloat4864 *= -1.0F;
	if (aFloat4863 < 0.0F)
	    aFloat4863 *= -1.0F;
	if (aFloat4865 < 0.0F)
	    aFloat4865 *= -1.0F;
    }
    
    public final void method7066() {
	if (aFloat4864 < 0.0F)
	    aFloat4864 *= -1.0F;
	if (aFloat4863 < 0.0F)
	    aFloat4863 *= -1.0F;
	if (aFloat4865 < 0.0F)
	    aFloat4865 *= -1.0F;
    }
    
    final void method7067(Class438 class438_82_) {
	aFloat4864 /= class438_82_.aFloat4864;
	aFloat4863 /= class438_82_.aFloat4863;
	aFloat4865 /= class438_82_.aFloat4865;
    }
    
    final void method7068(Class438 class438_83_) {
	aFloat4864 *= class438_83_.aFloat4864;
	aFloat4863 *= class438_83_.aFloat4863;
	aFloat4865 *= class438_83_.aFloat4865;
    }
    
    public static final Class438 method7069(Class438 class438,
					    Class438 class438_84_) {
	Class438 class438_85_ = method6994(class438);
	class438_85_.method7014(class438_84_);
	return class438_85_;
    }
    
    public void method7070(float f, float f_86_, float f_87_) {
	aFloat4864 = f;
	aFloat4863 = f_86_;
	aFloat4865 = f_87_;
    }
    
    public static final Class438 method7071(Class438 class438,
					    Class438 class438_88_) {
	Class438 class438_89_ = method6994(class438);
	class438_89_.method7014(class438_88_);
	return class438_89_;
    }
    
    public static void method7072(int i) {
	anInt4861 = i;
	aClass438Array4866 = new Class438[i];
	anInt4862 = 0;
    }
    
    public final void method7073(Class446 class446) {
	float f = aFloat4864;
	float f_90_ = aFloat4863;
	aFloat4864
	    = (class446.aFloat4894 * f + class446.aFloat4897 * f_90_
	       + class446.aFloat4900 * aFloat4865 + class446.aFloat4903);
	aFloat4863
	    = (class446.aFloat4893 * f + class446.aFloat4904 * f_90_
	       + class446.aFloat4895 * aFloat4865 + class446.aFloat4901);
	aFloat4865
	    = (class446.aFloat4896 * f + class446.aFloat4899 * f_90_
	       + class446.aFloat4902 * aFloat4865 + class446.aFloat4898);
    }
    
    public void method7074() {
	synchronized (aClass438Array4866) {
	    if (anInt4862 < anInt4861 - 1)
		aClass438Array4866[anInt4862++] = this;
	}
    }
    
    public final void method7075(Class438 class438_91_) {
	aFloat4864 -= class438_91_.aFloat4864;
	aFloat4863 -= class438_91_.aFloat4863;
	aFloat4865 -= class438_91_.aFloat4865;
    }
    
    public static final Class438 method7076(Class438 class438,
					    Class438 class438_92_) {
	Class438 class438_93_ = method6994(class438);
	class438_93_.method7067(class438_92_);
	return class438_93_;
    }
    
    public static final Class438 method7077(Class438 class438,
					    Class438 class438_94_) {
	Class438 class438_95_ = method6994(class438);
	class438_95_.method7067(class438_94_);
	return class438_95_;
    }
    
    public final void method7078(float f) {
	aFloat4864 /= f;
	aFloat4863 /= f;
	aFloat4865 /= f;
    }
    
    public static final Class438 method7079(Class438 class438, float f) {
	Class438 class438_96_ = method6994(class438);
	class438_96_.method7016(f);
	return class438_96_;
    }
    
    public void method7080(Class534_Sub40 class534_sub40) {
	aFloat4864 = class534_sub40.method16539(-1870207569);
	aFloat4863 = class534_sub40.method16539(-1643746649);
	aFloat4865 = class534_sub40.method16539(-1207212958);
    }
    
    public final void method7081(Class443 class443) {
	Class443 class443_97_
	    = Class443.method7138(aFloat4864, aFloat4863, aFloat4865, 0.0F);
	Class443 class443_98_ = Class443.method7200(class443);
	Class443 class443_99_
	    = Class443.method7141(class443_98_, class443_97_);
	class443_99_.method7158(class443);
	method6997(class443_99_.aFloat4881, class443_99_.aFloat4884,
		   class443_99_.aFloat4883);
	class443_97_.method7140();
	class443_98_.method7140();
	class443_99_.method7140();
    }
    
    public static final Class438 method7082(Class438 class438,
					    Class438 class438_100_) {
	Class438 class438_101_ = method6994(class438);
	class438_101_.method7026(class438_100_);
	return class438_101_;
    }
    
    public void method7083(Class534_Sub40 class534_sub40) {
	aFloat4864 = class534_sub40.method16539(-1870743942);
	aFloat4863 = class534_sub40.method16539(-1698098376);
	aFloat4865 = class534_sub40.method16539(-1595492502);
    }
    
    public final void method7084(Class443 class443) {
	Class443 class443_102_
	    = Class443.method7138(aFloat4864, aFloat4863, aFloat4865, 0.0F);
	Class443 class443_103_ = Class443.method7200(class443);
	Class443 class443_104_
	    = Class443.method7141(class443_103_, class443_102_);
	class443_104_.method7158(class443);
	method6997(class443_104_.aFloat4881, class443_104_.aFloat4884,
		   class443_104_.aFloat4883);
	class443_102_.method7140();
	class443_103_.method7140();
	class443_104_.method7140();
    }
    
    public final void method7085() {
	aFloat4865 = 0.0F;
	aFloat4863 = 0.0F;
	aFloat4864 = 0.0F;
    }
    
    public final void method7086(Class438 class438_105_, float f) {
	aFloat4864 += class438_105_.aFloat4864 * f;
	aFloat4863 += class438_105_.aFloat4863 * f;
	aFloat4865 += class438_105_.aFloat4865 * f;
    }
    
    public final void method7087(Class446 class446) {
	float f = aFloat4864;
	float f_106_ = aFloat4863;
	aFloat4864
	    = (class446.aFloat4894 * f + class446.aFloat4897 * f_106_
	       + class446.aFloat4900 * aFloat4865 + class446.aFloat4903);
	aFloat4863
	    = (class446.aFloat4893 * f + class446.aFloat4904 * f_106_
	       + class446.aFloat4895 * aFloat4865 + class446.aFloat4901);
	aFloat4865
	    = (class446.aFloat4896 * f + class446.aFloat4899 * f_106_
	       + class446.aFloat4902 * aFloat4865 + class446.aFloat4898);
    }
    
    public final void method7088() {
	aFloat4864 = -aFloat4864;
	aFloat4863 = -aFloat4863;
	aFloat4865 = -aFloat4865;
    }
    
    public final void method7089(Class446 class446) {
	float f = aFloat4864;
	float f_107_ = aFloat4863;
	aFloat4864
	    = (class446.aFloat4894 * f + class446.aFloat4897 * f_107_
	       + class446.aFloat4900 * aFloat4865 + class446.aFloat4903);
	aFloat4863
	    = (class446.aFloat4893 * f + class446.aFloat4904 * f_107_
	       + class446.aFloat4895 * aFloat4865 + class446.aFloat4901);
	aFloat4865
	    = (class446.aFloat4896 * f + class446.aFloat4899 * f_107_
	       + class446.aFloat4902 * aFloat4865 + class446.aFloat4898);
    }
    
    public final void method7090(Class446 class446) {
	float f = aFloat4864;
	float f_108_ = aFloat4863;
	aFloat4864
	    = (class446.aFloat4894 * f + class446.aFloat4897 * f_108_
	       + class446.aFloat4900 * aFloat4865 + class446.aFloat4903);
	aFloat4863
	    = (class446.aFloat4893 * f + class446.aFloat4904 * f_108_
	       + class446.aFloat4895 * aFloat4865 + class446.aFloat4901);
	aFloat4865
	    = (class446.aFloat4896 * f + class446.aFloat4899 * f_108_
	       + class446.aFloat4902 * aFloat4865 + class446.aFloat4898);
    }
    
    public final void method7091(Class438 class438_109_, float f) {
	aFloat4864 += class438_109_.aFloat4864 * f;
	aFloat4863 += class438_109_.aFloat4863 * f;
	aFloat4865 += class438_109_.aFloat4865 * f;
    }
    
    public final void method7092(float f) {
	aFloat4864 *= f;
	aFloat4863 *= f;
	aFloat4865 *= f;
    }
    
    public final void method7093(Class438 class438_110_, float f) {
	method7016(1.0F - f);
	method7026(method7020(class438_110_, f));
    }
    
    public final void method7094(Class438 class438_111_, float f) {
	method7016(1.0F - f);
	method7026(method7020(class438_111_, f));
    }
}
