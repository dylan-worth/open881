/* Class443 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class443
{
    static int anInt4878;
    public float aFloat4879;
    static int anInt4880;
    public float aFloat4881;
    static Class443[] aClass443Array4882 = new Class443[0];
    public float aFloat4883;
    public float aFloat4884;
    
    static final float method7136(Class443 class443) {
	return (float) Math.sqrt((double) method7156(class443, class443));
    }
    
    public static Class443 method7137() {
	synchronized (aClass443Array4882) {
	    if (anInt4878 == 0) {
		Class443 class443 = new Class443();
		return class443;
	    }
	    aClass443Array4882[--anInt4878].method7149();
	    Class443 class443 = aClass443Array4882[anInt4878];
	    return class443;
	}
    }
    
    static Class443 method7138(float f, float f_0_, float f_1_, float f_2_) {
	synchronized (aClass443Array4882) {
	    if (anInt4878 == 0) {
		Class443 class443 = new Class443(f, f_0_, f_1_, f_2_);
		return class443;
	    }
	    aClass443Array4882[--anInt4878].method7216(f, f_0_, f_1_, f_2_);
	    Class443 class443 = aClass443Array4882[anInt4878];
	    return class443;
	}
    }
    
    public final void method7139(Class443 class443_3_) {
	method7216((class443_3_.aFloat4879 * aFloat4881
		    + class443_3_.aFloat4881 * aFloat4879
		    + class443_3_.aFloat4884 * aFloat4883
		    - class443_3_.aFloat4883 * aFloat4884),
		   (class443_3_.aFloat4879 * aFloat4884
		    - class443_3_.aFloat4881 * aFloat4883
		    + class443_3_.aFloat4884 * aFloat4879
		    + class443_3_.aFloat4883 * aFloat4881),
		   (class443_3_.aFloat4879 * aFloat4883
		    + class443_3_.aFloat4881 * aFloat4884
		    - class443_3_.aFloat4884 * aFloat4881
		    + class443_3_.aFloat4883 * aFloat4879),
		   (class443_3_.aFloat4879 * aFloat4879
		    - class443_3_.aFloat4881 * aFloat4881
		    - class443_3_.aFloat4884 * aFloat4884
		    - class443_3_.aFloat4883 * aFloat4883));
    }
    
    public void method7140() {
	synchronized (aClass443Array4882) {
	    if (anInt4878 < anInt4880 - 1)
		aClass443Array4882[anInt4878++] = this;
	}
    }
    
    static final Class443 method7141(Class443 class443, Class443 class443_4_) {
	Class443 class443_5_ = method7197(class443);
	class443_5_.method7158(class443_4_);
	return class443_5_;
    }
    
    public Class443(float f, float f_6_, float f_7_, float f_8_) {
	method7216(f, f_6_, f_7_, f_8_);
    }
    
    public Class443(Class443 class443_9_) {
	method7145(class443_9_);
    }
    
    public final void method7142() {
	float f = 1.0F / method7189(this);
	aFloat4881 *= f;
	aFloat4884 *= f;
	aFloat4883 *= f;
	aFloat4879 *= f;
    }
    
    public void method7143(Class534_Sub40 class534_sub40) {
	aFloat4881 = class534_sub40.method16539(-1346405813);
	aFloat4884 = class534_sub40.method16539(-1934618554);
	aFloat4883 = class534_sub40.method16539(-1692995552);
	aFloat4879 = class534_sub40.method16539(-1746526403);
    }
    
    public void method7144(float f, float f_10_, float f_11_) {
	method7147(0.0F, 1.0F, 0.0F, f);
	Class443 class443_12_ = method7137();
	class443_12_.method7147(1.0F, 0.0F, 0.0F, f_10_);
	method7158(class443_12_);
	class443_12_.method7147(0.0F, 0.0F, 1.0F, f_11_);
	method7158(class443_12_);
	class443_12_.method7140();
    }
    
    public void method7145(Class443 class443_13_) {
	aFloat4881 = class443_13_.aFloat4881;
	aFloat4884 = class443_13_.aFloat4884;
	aFloat4883 = class443_13_.aFloat4883;
	aFloat4879 = class443_13_.aFloat4879;
    }
    
    public void method7146(Class438 class438, float f) {
	method7147(class438.aFloat4864, class438.aFloat4863,
		   class438.aFloat4865, f);
    }
    
    public void method7147(float f, float f_14_, float f_15_, float f_16_) {
	float f_17_ = (float) Math.sin((double) (f_16_ * 0.5F));
	float f_18_ = (float) Math.cos((double) (f_16_ * 0.5F));
	aFloat4881 = f * f_17_;
	aFloat4884 = f_14_ * f_17_;
	aFloat4883 = f_15_ * f_17_;
	aFloat4879 = f_18_;
    }
    
    public void method7148(float f, float f_19_, float f_20_) {
	method7147(0.0F, 1.0F, 0.0F, f);
	Class443 class443_21_ = method7137();
	class443_21_.method7147(1.0F, 0.0F, 0.0F, f_19_);
	method7158(class443_21_);
	class443_21_.method7147(0.0F, 0.0F, 1.0F, f_20_);
	method7158(class443_21_);
	class443_21_.method7140();
    }
    
    final void method7149() {
	aFloat4883 = 0.0F;
	aFloat4884 = 0.0F;
	aFloat4881 = 0.0F;
	aFloat4879 = 1.0F;
    }
    
    final void method7150() {
	aFloat4881 = -aFloat4881;
	aFloat4884 = -aFloat4884;
	aFloat4883 = -aFloat4883;
	aFloat4879 = -aFloat4879;
    }
    
    public final void method7151() {
	aFloat4881 = -aFloat4881;
	aFloat4884 = -aFloat4884;
	aFloat4883 = -aFloat4883;
    }
    
    public static final Class443 method7152(Class443 class443) {
	Class443 class443_22_ = method7197(class443);
	class443_22_.method7182();
	return class443_22_;
    }
    
    public final void method7153() {
	float f = 1.0F / method7189(this);
	aFloat4881 *= f;
	aFloat4884 *= f;
	aFloat4883 *= f;
	aFloat4879 *= f;
    }
    
    final void method7154(Class443 class443_23_) {
	aFloat4881 += class443_23_.aFloat4881;
	aFloat4884 += class443_23_.aFloat4884;
	aFloat4883 += class443_23_.aFloat4883;
	aFloat4879 += class443_23_.aFloat4879;
    }
    
    final float method7155(Class443 class443_24_) {
	return (aFloat4881 * class443_24_.aFloat4881
		+ aFloat4884 * class443_24_.aFloat4884
		+ aFloat4883 * class443_24_.aFloat4883
		+ aFloat4879 * class443_24_.aFloat4879);
    }
    
    static final float method7156(Class443 class443, Class443 class443_25_) {
	return class443.method7155(class443_25_);
    }
    
    public static void method7157(int i) {
	anInt4880 = i;
	aClass443Array4882 = new Class443[i];
	anInt4878 = 0;
    }
    
    public final void method7158(Class443 class443_26_) {
	method7216((class443_26_.aFloat4879 * aFloat4881
		    + class443_26_.aFloat4881 * aFloat4879
		    + class443_26_.aFloat4884 * aFloat4883
		    - class443_26_.aFloat4883 * aFloat4884),
		   (class443_26_.aFloat4879 * aFloat4884
		    - class443_26_.aFloat4881 * aFloat4883
		    + class443_26_.aFloat4884 * aFloat4879
		    + class443_26_.aFloat4883 * aFloat4881),
		   (class443_26_.aFloat4879 * aFloat4883
		    + class443_26_.aFloat4881 * aFloat4884
		    - class443_26_.aFloat4884 * aFloat4881
		    + class443_26_.aFloat4883 * aFloat4879),
		   (class443_26_.aFloat4879 * aFloat4879
		    - class443_26_.aFloat4881 * aFloat4881
		    - class443_26_.aFloat4884 * aFloat4884
		    - class443_26_.aFloat4883 * aFloat4883));
    }
    
    public void method7159(Class534_Sub40 class534_sub40) {
	aFloat4881 = class534_sub40.method16539(-1418658464);
	aFloat4884 = class534_sub40.method16539(-1732448742);
	aFloat4883 = class534_sub40.method16539(-1852460603);
	aFloat4879 = class534_sub40.method16539(-1930027708);
    }
    
    final void method7160() {
	aFloat4883 = 0.0F;
	aFloat4884 = 0.0F;
	aFloat4881 = 0.0F;
	aFloat4879 = 1.0F;
    }
    
    static final Class443 method7161(Class443 class443, float f) {
	Class443 class443_27_ = method7197(class443);
	class443_27_.method7188(f);
	return class443_27_;
    }
    
    public final void method7162(Class443 class443_28_, float f) {
	if (method7155(class443_28_) < 0.0F)
	    method7150();
	method7188(1.0F - f);
	Class443 class443_29_ = method7161(class443_28_, f);
	method7154(class443_29_);
	class443_29_.method7140();
	method7153();
    }
    
    public String toString() {
	return new StringBuilder().append(aFloat4881).append(",").append
		   (aFloat4884).append
		   (",").append
		   (aFloat4883).append
		   (",").append
		   (aFloat4879).toString();
    }
    
    static {
	new Class443();
    }
    
    public String method7163() {
	return new StringBuilder().append(aFloat4881).append(",").append
		   (aFloat4884).append
		   (",").append
		   (aFloat4883).append
		   (",").append
		   (aFloat4879).toString();
    }
    
    public String method7164() {
	return new StringBuilder().append(aFloat4881).append(",").append
		   (aFloat4884).append
		   (",").append
		   (aFloat4883).append
		   (",").append
		   (aFloat4879).toString();
    }
    
    public static void method7165(int i) {
	anInt4880 = i;
	aClass443Array4882 = new Class443[i];
	anInt4878 = 0;
    }
    
    public static void method7166(int i) {
	anInt4880 = i;
	aClass443Array4882 = new Class443[i];
	anInt4878 = 0;
    }
    
    public static Class443 method7167() {
	synchronized (aClass443Array4882) {
	    if (anInt4878 == 0) {
		Class443 class443 = new Class443();
		return class443;
	    }
	    aClass443Array4882[--anInt4878].method7149();
	    Class443 class443 = aClass443Array4882[anInt4878];
	    return class443;
	}
    }
    
    final void method7168(float f) {
	aFloat4881 *= f;
	aFloat4884 *= f;
	aFloat4883 *= f;
	aFloat4879 *= f;
    }
    
    static Class443 method7169(float f, float f_30_, float f_31_,
			       float f_32_) {
	synchronized (aClass443Array4882) {
	    if (anInt4878 == 0) {
		Class443 class443 = new Class443(f, f_30_, f_31_, f_32_);
		return class443;
	    }
	    aClass443Array4882[--anInt4878].method7216(f, f_30_, f_31_, f_32_);
	    Class443 class443 = aClass443Array4882[anInt4878];
	    return class443;
	}
    }
    
    public static Class443 method7170(Class443 class443) {
	synchronized (aClass443Array4882) {
	    if (anInt4878 == 0) {
		Class443 class443_33_ = new Class443(class443);
		return class443_33_;
	    }
	    aClass443Array4882[--anInt4878].method7145(class443);
	    Class443 class443_34_ = aClass443Array4882[anInt4878];
	    return class443_34_;
	}
    }
    
    public static Class443 method7171(Class443 class443) {
	synchronized (aClass443Array4882) {
	    if (anInt4878 == 0) {
		Class443 class443_35_ = new Class443(class443);
		return class443_35_;
	    }
	    aClass443Array4882[--anInt4878].method7145(class443);
	    Class443 class443_36_ = aClass443Array4882[anInt4878];
	    return class443_36_;
	}
    }
    
    public void method7172() {
	synchronized (aClass443Array4882) {
	    if (anInt4878 < anInt4880 - 1)
		aClass443Array4882[anInt4878++] = this;
	}
    }
    
    public void method7173() {
	synchronized (aClass443Array4882) {
	    if (anInt4878 < anInt4880 - 1)
		aClass443Array4882[anInt4878++] = this;
	}
    }
    
    public Class443(float f, float f_37_, float f_38_) {
	method7148(f, f_37_, f_38_);
    }
    
    public void method7174(Class534_Sub40 class534_sub40) {
	aFloat4881 = class534_sub40.method16539(-1470004871);
	aFloat4884 = class534_sub40.method16539(-1244022297);
	aFloat4883 = class534_sub40.method16539(-1136366717);
	aFloat4879 = class534_sub40.method16539(-1068358653);
    }
    
    void method7175(float f, float f_39_, float f_40_, float f_41_) {
	aFloat4881 = f;
	aFloat4884 = f_39_;
	aFloat4883 = f_40_;
	aFloat4879 = f_41_;
    }
    
    void method7176(float f, float f_42_, float f_43_, float f_44_) {
	aFloat4881 = f;
	aFloat4884 = f_42_;
	aFloat4883 = f_43_;
	aFloat4879 = f_44_;
    }
    
    public void method7177(Class443 class443_45_) {
	aFloat4881 = class443_45_.aFloat4881;
	aFloat4884 = class443_45_.aFloat4884;
	aFloat4883 = class443_45_.aFloat4883;
	aFloat4879 = class443_45_.aFloat4879;
    }
    
    static Class443 method7178(float f, float f_46_, float f_47_,
			       float f_48_) {
	synchronized (aClass443Array4882) {
	    if (anInt4878 == 0) {
		Class443 class443 = new Class443(f, f_46_, f_47_, f_48_);
		return class443;
	    }
	    aClass443Array4882[--anInt4878].method7216(f, f_46_, f_47_, f_48_);
	    Class443 class443 = aClass443Array4882[anInt4878];
	    return class443;
	}
    }
    
    public final void method7179(Class443 class443_49_) {
	method7216((class443_49_.aFloat4879 * aFloat4881
		    + class443_49_.aFloat4881 * aFloat4879
		    + class443_49_.aFloat4884 * aFloat4883
		    - class443_49_.aFloat4883 * aFloat4884),
		   (class443_49_.aFloat4879 * aFloat4884
		    - class443_49_.aFloat4881 * aFloat4883
		    + class443_49_.aFloat4884 * aFloat4879
		    + class443_49_.aFloat4883 * aFloat4881),
		   (class443_49_.aFloat4879 * aFloat4883
		    + class443_49_.aFloat4881 * aFloat4884
		    - class443_49_.aFloat4884 * aFloat4881
		    + class443_49_.aFloat4883 * aFloat4879),
		   (class443_49_.aFloat4879 * aFloat4879
		    - class443_49_.aFloat4881 * aFloat4881
		    - class443_49_.aFloat4884 * aFloat4884
		    - class443_49_.aFloat4883 * aFloat4883));
    }
    
    public void method7180(Class438 class438, float f) {
	method7147(class438.aFloat4864, class438.aFloat4863,
		   class438.aFloat4865, f);
    }
    
    public void method7181(float f, float f_50_, float f_51_, float f_52_) {
	float f_53_ = (float) Math.sin((double) (f_52_ * 0.5F));
	float f_54_ = (float) Math.cos((double) (f_52_ * 0.5F));
	aFloat4881 = f * f_53_;
	aFloat4884 = f_50_ * f_53_;
	aFloat4883 = f_51_ * f_53_;
	aFloat4879 = f_54_;
    }
    
    public final void method7182() {
	aFloat4881 = -aFloat4881;
	aFloat4884 = -aFloat4884;
	aFloat4883 = -aFloat4883;
    }
    
    public void method7183(float f, float f_55_, float f_56_) {
	method7147(0.0F, 1.0F, 0.0F, f);
	Class443 class443_57_ = method7137();
	class443_57_.method7147(1.0F, 0.0F, 0.0F, f_55_);
	method7158(class443_57_);
	class443_57_.method7147(0.0F, 0.0F, 1.0F, f_56_);
	method7158(class443_57_);
	class443_57_.method7140();
    }
    
    final float method7184(Class443 class443_58_) {
	return (aFloat4881 * class443_58_.aFloat4881
		+ aFloat4884 * class443_58_.aFloat4884
		+ aFloat4883 * class443_58_.aFloat4883
		+ aFloat4879 * class443_58_.aFloat4879);
    }
    
    final void method7185(Class443 class443_59_) {
	aFloat4881 += class443_59_.aFloat4881;
	aFloat4884 += class443_59_.aFloat4884;
	aFloat4883 += class443_59_.aFloat4883;
	aFloat4879 += class443_59_.aFloat4879;
    }
    
    final void method7186() {
	aFloat4883 = 0.0F;
	aFloat4884 = 0.0F;
	aFloat4881 = 0.0F;
	aFloat4879 = 1.0F;
    }
    
    public void method7187(Class443 class443_60_) {
	aFloat4881 = class443_60_.aFloat4881;
	aFloat4884 = class443_60_.aFloat4884;
	aFloat4883 = class443_60_.aFloat4883;
	aFloat4879 = class443_60_.aFloat4879;
    }
    
    final void method7188(float f) {
	aFloat4881 *= f;
	aFloat4884 *= f;
	aFloat4883 *= f;
	aFloat4879 *= f;
    }
    
    static final float method7189(Class443 class443) {
	return (float) Math.sqrt((double) method7156(class443, class443));
    }
    
    final void method7190() {
	aFloat4881 = -aFloat4881;
	aFloat4884 = -aFloat4884;
	aFloat4883 = -aFloat4883;
	aFloat4879 = -aFloat4879;
    }
    
    public final void method7191() {
	aFloat4881 = -aFloat4881;
	aFloat4884 = -aFloat4884;
	aFloat4883 = -aFloat4883;
    }
    
    public final void method7192() {
	aFloat4881 = -aFloat4881;
	aFloat4884 = -aFloat4884;
	aFloat4883 = -aFloat4883;
    }
    
    public final void method7193() {
	aFloat4881 = -aFloat4881;
	aFloat4884 = -aFloat4884;
	aFloat4883 = -aFloat4883;
    }
    
    public void method7194(Class443 class443_61_) {
	aFloat4881 = class443_61_.aFloat4881;
	aFloat4884 = class443_61_.aFloat4884;
	aFloat4883 = class443_61_.aFloat4883;
	aFloat4879 = class443_61_.aFloat4879;
    }
    
    public final void method7195(Class443 class443_62_, float f) {
	if (method7155(class443_62_) < 0.0F)
	    method7150();
	method7188(1.0F - f);
	Class443 class443_63_ = method7161(class443_62_, f);
	method7154(class443_63_);
	class443_63_.method7140();
	method7153();
    }
    
    public static final Class443 method7196(Class443 class443) {
	Class443 class443_64_ = method7197(class443);
	class443_64_.method7182();
	return class443_64_;
    }
    
    public static Class443 method7197(Class443 class443) {
	synchronized (aClass443Array4882) {
	    if (anInt4878 == 0) {
		Class443 class443_65_ = new Class443(class443);
		return class443_65_;
	    }
	    aClass443Array4882[--anInt4878].method7145(class443);
	    Class443 class443_66_ = aClass443Array4882[anInt4878];
	    return class443_66_;
	}
    }
    
    public final void method7198() {
	float f = 1.0F / method7189(this);
	aFloat4881 *= f;
	aFloat4884 *= f;
	aFloat4883 *= f;
	aFloat4879 *= f;
    }
    
    public final void method7199() {
	float f = 1.0F / method7189(this);
	aFloat4881 *= f;
	aFloat4884 *= f;
	aFloat4883 *= f;
	aFloat4879 *= f;
    }
    
    public static final Class443 method7200(Class443 class443) {
	Class443 class443_67_ = method7197(class443);
	class443_67_.method7182();
	return class443_67_;
    }
    
    final void method7201(Class443 class443_68_) {
	aFloat4881 += class443_68_.aFloat4881;
	aFloat4884 += class443_68_.aFloat4884;
	aFloat4883 += class443_68_.aFloat4883;
	aFloat4879 += class443_68_.aFloat4879;
    }
    
    final float method7202(Class443 class443_69_) {
	return (aFloat4881 * class443_69_.aFloat4881
		+ aFloat4884 * class443_69_.aFloat4884
		+ aFloat4883 * class443_69_.aFloat4883
		+ aFloat4879 * class443_69_.aFloat4879);
    }
    
    final void method7203() {
	aFloat4883 = 0.0F;
	aFloat4884 = 0.0F;
	aFloat4881 = 0.0F;
	aFloat4879 = 1.0F;
    }
    
    static final float method7204(Class443 class443, Class443 class443_70_) {
	return class443.method7155(class443_70_);
    }
    
    final void method7205() {
	aFloat4881 = -aFloat4881;
	aFloat4884 = -aFloat4884;
	aFloat4883 = -aFloat4883;
	aFloat4879 = -aFloat4879;
    }
    
    public Class443() {
	method7149();
    }
    
    public final void method7206(Class443 class443_71_) {
	method7216((class443_71_.aFloat4879 * aFloat4881
		    + class443_71_.aFloat4881 * aFloat4879
		    + class443_71_.aFloat4884 * aFloat4883
		    - class443_71_.aFloat4883 * aFloat4884),
		   (class443_71_.aFloat4879 * aFloat4884
		    - class443_71_.aFloat4881 * aFloat4883
		    + class443_71_.aFloat4884 * aFloat4879
		    + class443_71_.aFloat4883 * aFloat4881),
		   (class443_71_.aFloat4879 * aFloat4883
		    + class443_71_.aFloat4881 * aFloat4884
		    - class443_71_.aFloat4884 * aFloat4881
		    + class443_71_.aFloat4883 * aFloat4879),
		   (class443_71_.aFloat4879 * aFloat4879
		    - class443_71_.aFloat4881 * aFloat4881
		    - class443_71_.aFloat4884 * aFloat4884
		    - class443_71_.aFloat4883 * aFloat4883));
    }
    
    final void method7207() {
	aFloat4883 = 0.0F;
	aFloat4884 = 0.0F;
	aFloat4881 = 0.0F;
	aFloat4879 = 1.0F;
    }
    
    final void method7208() {
	aFloat4881 = -aFloat4881;
	aFloat4884 = -aFloat4884;
	aFloat4883 = -aFloat4883;
	aFloat4879 = -aFloat4879;
    }
    
    public final void method7209(Class443 class443_72_) {
	method7216((class443_72_.aFloat4879 * aFloat4881
		    + class443_72_.aFloat4881 * aFloat4879
		    + class443_72_.aFloat4884 * aFloat4883
		    - class443_72_.aFloat4883 * aFloat4884),
		   (class443_72_.aFloat4879 * aFloat4884
		    - class443_72_.aFloat4881 * aFloat4883
		    + class443_72_.aFloat4884 * aFloat4879
		    + class443_72_.aFloat4883 * aFloat4881),
		   (class443_72_.aFloat4879 * aFloat4883
		    + class443_72_.aFloat4881 * aFloat4884
		    - class443_72_.aFloat4884 * aFloat4881
		    + class443_72_.aFloat4883 * aFloat4879),
		   (class443_72_.aFloat4879 * aFloat4879
		    - class443_72_.aFloat4881 * aFloat4881
		    - class443_72_.aFloat4884 * aFloat4884
		    - class443_72_.aFloat4883 * aFloat4883));
    }
    
    static final Class443 method7210(Class443 class443,
				     Class443 class443_73_) {
	Class443 class443_74_ = method7197(class443);
	class443_74_.method7158(class443_73_);
	return class443_74_;
    }
    
    static final float method7211(Class443 class443) {
	return (float) Math.sqrt((double) method7156(class443, class443));
    }
    
    final void method7212(float f) {
	aFloat4881 *= f;
	aFloat4884 *= f;
	aFloat4883 *= f;
	aFloat4879 *= f;
    }
    
    static final Class443 method7213(Class443 class443, float f) {
	Class443 class443_75_ = method7197(class443);
	class443_75_.method7188(f);
	return class443_75_;
    }
    
    static final Class443 method7214(Class443 class443, float f) {
	Class443 class443_76_ = method7197(class443);
	class443_76_.method7188(f);
	return class443_76_;
    }
    
    public final void method7215(Class443 class443_77_, float f) {
	if (method7155(class443_77_) < 0.0F)
	    method7150();
	method7188(1.0F - f);
	Class443 class443_78_ = method7161(class443_77_, f);
	method7154(class443_78_);
	class443_78_.method7140();
	method7153();
    }
    
    void method7216(float f, float f_79_, float f_80_, float f_81_) {
	aFloat4881 = f;
	aFloat4884 = f_79_;
	aFloat4883 = f_80_;
	aFloat4879 = f_81_;
    }
    
    public final void method7217(Class443 class443_82_, float f) {
	if (method7155(class443_82_) < 0.0F)
	    method7150();
	method7188(1.0F - f);
	Class443 class443_83_ = method7161(class443_82_, f);
	method7154(class443_83_);
	class443_83_.method7140();
	method7153();
    }
}
