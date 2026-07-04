/* Class446 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class446
{
    float aFloat4893;
    float aFloat4894;
    float aFloat4895;
    float aFloat4896;
    float aFloat4897;
    float aFloat4898;
    float aFloat4899;
    float aFloat4900;
    float aFloat4901;
    float aFloat4902;
    float aFloat4903;
    float aFloat4904;
    public static Class446 aClass446_4905 = new Class446();
    
    public void method7235(Class446 class446_0_, Class446 class446_1_) {
	aFloat4894 = (class446_0_.aFloat4894 * class446_1_.aFloat4894
		      + class446_0_.aFloat4893 * class446_1_.aFloat4897
		      + class446_0_.aFloat4896 * class446_1_.aFloat4900);
	aFloat4893 = (class446_0_.aFloat4894 * class446_1_.aFloat4893
		      + class446_0_.aFloat4893 * class446_1_.aFloat4904
		      + class446_0_.aFloat4896 * class446_1_.aFloat4895);
	aFloat4896 = (class446_0_.aFloat4894 * class446_1_.aFloat4896
		      + class446_0_.aFloat4893 * class446_1_.aFloat4899
		      + class446_0_.aFloat4896 * class446_1_.aFloat4902);
	aFloat4897 = (class446_0_.aFloat4897 * class446_1_.aFloat4894
		      + class446_0_.aFloat4904 * class446_1_.aFloat4897
		      + class446_0_.aFloat4899 * class446_1_.aFloat4900);
	aFloat4904 = (class446_0_.aFloat4897 * class446_1_.aFloat4893
		      + class446_0_.aFloat4904 * class446_1_.aFloat4904
		      + class446_0_.aFloat4899 * class446_1_.aFloat4895);
	aFloat4899 = (class446_0_.aFloat4897 * class446_1_.aFloat4896
		      + class446_0_.aFloat4904 * class446_1_.aFloat4899
		      + class446_0_.aFloat4899 * class446_1_.aFloat4902);
	aFloat4900 = (class446_0_.aFloat4900 * class446_1_.aFloat4894
		      + class446_0_.aFloat4895 * class446_1_.aFloat4897
		      + class446_0_.aFloat4902 * class446_1_.aFloat4900);
	aFloat4895 = (class446_0_.aFloat4900 * class446_1_.aFloat4893
		      + class446_0_.aFloat4895 * class446_1_.aFloat4904
		      + class446_0_.aFloat4902 * class446_1_.aFloat4895);
	aFloat4902 = (class446_0_.aFloat4900 * class446_1_.aFloat4896
		      + class446_0_.aFloat4895 * class446_1_.aFloat4899
		      + class446_0_.aFloat4902 * class446_1_.aFloat4902);
	aFloat4903 = (class446_0_.aFloat4903 * class446_1_.aFloat4894
		      + class446_0_.aFloat4901 * class446_1_.aFloat4897
		      + class446_0_.aFloat4898 * class446_1_.aFloat4900
		      + class446_1_.aFloat4903);
	aFloat4901 = (class446_0_.aFloat4903 * class446_1_.aFloat4893
		      + class446_0_.aFloat4901 * class446_1_.aFloat4904
		      + class446_0_.aFloat4898 * class446_1_.aFloat4895
		      + class446_1_.aFloat4901);
	aFloat4898 = (class446_0_.aFloat4903 * class446_1_.aFloat4896
		      + class446_0_.aFloat4901 * class446_1_.aFloat4899
		      + class446_0_.aFloat4898 * class446_1_.aFloat4902
		      + class446_1_.aFloat4898);
    }
    
    public Class446(Class446 class446_2_) {
	method7236(class446_2_);
    }
    
    public void method7236(Class446 class446_3_) {
	aFloat4894 = class446_3_.aFloat4894;
	aFloat4897 = class446_3_.aFloat4897;
	aFloat4900 = class446_3_.aFloat4900;
	aFloat4903 = class446_3_.aFloat4903;
	aFloat4893 = class446_3_.aFloat4893;
	aFloat4904 = class446_3_.aFloat4904;
	aFloat4895 = class446_3_.aFloat4895;
	aFloat4901 = class446_3_.aFloat4901;
	aFloat4896 = class446_3_.aFloat4896;
	aFloat4899 = class446_3_.aFloat4899;
	aFloat4902 = class446_3_.aFloat4902;
	aFloat4898 = class446_3_.aFloat4898;
    }
    
    public void method7237(Class444 class444) {
	method7262(class444.aClass443_4886);
	method7251(class444.aClass438_4885);
    }
    
    public void method7238(Class444 class444) {
	float f = (class444.aClass443_4886.aFloat4879
		   * class444.aClass443_4886.aFloat4879);
	float f_4_ = (class444.aClass443_4886.aFloat4879
		      * class444.aClass443_4886.aFloat4881);
	float f_5_ = (class444.aClass443_4886.aFloat4879
		      * class444.aClass443_4886.aFloat4884);
	float f_6_ = (class444.aClass443_4886.aFloat4879
		      * class444.aClass443_4886.aFloat4883);
	float f_7_ = (class444.aClass443_4886.aFloat4881
		      * class444.aClass443_4886.aFloat4881);
	float f_8_ = (class444.aClass443_4886.aFloat4881
		      * class444.aClass443_4886.aFloat4884);
	float f_9_ = (class444.aClass443_4886.aFloat4881
		      * class444.aClass443_4886.aFloat4883);
	float f_10_ = (class444.aClass443_4886.aFloat4884
		       * class444.aClass443_4886.aFloat4884);
	float f_11_ = (class444.aClass443_4886.aFloat4884
		       * class444.aClass443_4886.aFloat4883);
	float f_12_ = (class444.aClass443_4886.aFloat4883
		       * class444.aClass443_4886.aFloat4883);
	aFloat4894 = f_7_ + f - f_12_ - f_10_;
	aFloat4893 = f_8_ + f_6_ + f_8_ + f_6_;
	aFloat4896 = f_9_ - f_5_ - f_5_ + f_9_;
	aFloat4897 = f_8_ - f_6_ - f_6_ + f_8_;
	aFloat4904 = f_10_ + f - f_7_ - f_12_;
	aFloat4899 = f_11_ + f_4_ + f_11_ + f_4_;
	aFloat4900 = f_9_ + f_5_ + f_9_ + f_5_;
	aFloat4895 = f_11_ - f_4_ - f_4_ + f_11_;
	aFloat4902 = f_12_ + f - f_10_ - f_7_;
	aFloat4903 = class444.aClass438_4885.aFloat4864;
	aFloat4901 = class444.aClass438_4885.aFloat4863;
	aFloat4898 = class444.aClass438_4885.aFloat4865;
    }
    
    public float[] method7239(float[] fs) {
	fs[0] = aFloat4894;
	fs[1] = aFloat4893;
	fs[2] = aFloat4896;
	fs[3] = aFloat4897;
	fs[4] = aFloat4904;
	fs[5] = aFloat4899;
	fs[6] = aFloat4900;
	fs[7] = aFloat4895;
	fs[8] = aFloat4902;
	return fs;
    }
    
    public Class446() {
	method7254();
    }
    
    public void method7240(int i, int i_13_, int i_14_, float f, float f_15_,
			   float f_16_) {
	if (i != 0) {
	    float f_17_ = Class428.aFloatArray4818[i & 0x3fff];
	    float f_18_ = Class428.aFloatArray4817[i & 0x3fff];
	    aFloat4902 = 1.0F;
	    aFloat4895 = 0.0F;
	    aFloat4900 = 0.0F;
	    aFloat4899 = 0.0F;
	    aFloat4896 = 0.0F;
	    aFloat4894 = 2.0F * f_17_ * (float) i_13_;
	    aFloat4904 = 2.0F * f_17_ * (float) i_14_;
	    aFloat4893 = 2.0F * f_18_ * (float) i_13_;
	    aFloat4897 = -2.0F * f_18_ * (float) i_14_;
	    aFloat4903
		= (float) (2 * i_13_) * (0.5F * f_18_ - 0.5F * f_17_) + f;
	    aFloat4901
		= (float) (2 * i_14_) * (-0.5F * f_18_ - 0.5F * f_17_) + f_15_;
	    aFloat4898 = f_16_;
	} else {
	    aFloat4895 = 0.0F;
	    aFloat4900 = 0.0F;
	    aFloat4899 = 0.0F;
	    aFloat4897 = 0.0F;
	    aFloat4896 = 0.0F;
	    aFloat4893 = 0.0F;
	    aFloat4894 = (float) (2 * i_13_);
	    aFloat4904 = (float) (2 * i_14_);
	    aFloat4902 = 1.0F;
	    aFloat4903 = f - (float) i_13_;
	    aFloat4901 = f_15_ - (float) i_14_;
	    aFloat4898 = f_16_;
	}
    }
    
    public void method7241(double d, double d_19_, double d_20_, double d_21_,
			   double d_22_, double d_23_, float f, float f_24_,
			   float f_25_) {
	float f_26_ = (float) (d_21_ - d);
	float f_27_ = (float) (d_22_ - d_19_);
	float f_28_ = (float) (d_23_ - d_20_);
	float f_29_ = f_24_ * f_28_ - f_25_ * f_27_;
	float f_30_ = f_25_ * f_26_ - f * f_28_;
	float f_31_ = f * f_27_ - f_24_ * f_26_;
	float f_32_
	    = (float) (1.0 / Math.sqrt((double) (f_29_ * f_29_ + f_30_ * f_30_
						 + f_31_ * f_31_)));
	float f_33_
	    = (float) (1.0 / Math.sqrt((double) (f_26_ * f_26_ + f_27_ * f_27_
						 + f_28_ * f_28_)));
	aFloat4894 = f_29_ * f_32_;
	aFloat4897 = f_30_ * f_32_;
	aFloat4900 = f_31_ * f_32_;
	aFloat4896 = f_26_ * f_33_;
	aFloat4899 = f_27_ * f_33_;
	aFloat4902 = f_28_ * f_33_;
	aFloat4893 = aFloat4899 * aFloat4900 - aFloat4902 * aFloat4897;
	aFloat4904 = aFloat4902 * aFloat4894 - aFloat4896 * aFloat4900;
	aFloat4895 = aFloat4896 * aFloat4897 - aFloat4899 * aFloat4894;
	aFloat4903
	    = -(float) (d * (double) aFloat4894 + d_19_ * (double) aFloat4897
			+ d_20_ * (double) aFloat4900);
	aFloat4901
	    = -(float) (d * (double) aFloat4893 + d_19_ * (double) aFloat4904
			+ d_20_ * (double) aFloat4895);
	aFloat4898
	    = -(float) (d * (double) aFloat4896 + d_19_ * (double) aFloat4899
			+ d_20_ * (double) aFloat4902);
    }
    
    public void method7242(Class446 class446_34_) {
	if (class446_34_ == this)
	    method7243();
	else {
	    aFloat4894 = class446_34_.aFloat4894;
	    aFloat4897 = class446_34_.aFloat4893;
	    aFloat4900 = class446_34_.aFloat4896;
	    aFloat4893 = class446_34_.aFloat4897;
	    aFloat4904 = class446_34_.aFloat4904;
	    aFloat4895 = class446_34_.aFloat4899;
	    aFloat4896 = class446_34_.aFloat4900;
	    aFloat4899 = class446_34_.aFloat4895;
	    aFloat4902 = class446_34_.aFloat4902;
	    aFloat4903 = -(class446_34_.aFloat4903 * aFloat4894
			   + class446_34_.aFloat4901 * aFloat4897
			   + class446_34_.aFloat4898 * aFloat4900);
	    aFloat4901 = -(class446_34_.aFloat4903 * aFloat4893
			   + class446_34_.aFloat4901 * aFloat4904
			   + class446_34_.aFloat4898 * aFloat4895);
	    aFloat4898 = -(class446_34_.aFloat4903 * aFloat4896
			   + class446_34_.aFloat4901 * aFloat4899
			   + class446_34_.aFloat4898 * aFloat4902);
	}
    }
    
    public void method7243() {
	float f = aFloat4903;
	float f_35_ = aFloat4901;
	float f_36_ = aFloat4897;
	aFloat4897 = aFloat4893;
	aFloat4893 = f_36_;
	float f_37_ = aFloat4900;
	aFloat4900 = aFloat4896;
	aFloat4896 = f_37_;
	float f_38_ = aFloat4895;
	aFloat4895 = aFloat4899;
	aFloat4899 = f_38_;
	aFloat4903
	    = -(f * aFloat4894 + f_35_ * aFloat4897 + aFloat4898 * aFloat4900);
	aFloat4901
	    = -(f * aFloat4893 + f_35_ * aFloat4904 + aFloat4898 * aFloat4895);
	aFloat4898
	    = -(f * aFloat4896 + f_35_ * aFloat4899 + aFloat4898 * aFloat4902);
    }
    
    public void method7244(float f, float f_39_, float f_40_, float f_41_) {
	float f_42_ = (float) Math.cos((double) f_41_);
	float f_43_ = (float) Math.sin((double) f_41_);
	aFloat4894 = f_42_ + f * f * (1.0F - f_42_);
	aFloat4893 = f_40_ * f_43_ + f_39_ * f * (1.0F - f_42_);
	aFloat4896 = -f_39_ * f_43_ + f_40_ * f * (1.0F - f_42_);
	aFloat4897 = -f_40_ * f_43_ + f * f_39_ * (1.0F - f_42_);
	aFloat4904 = f_42_ + f_39_ * f_39_ * (1.0F - f_42_);
	aFloat4899 = f * f_43_ + f_40_ * f_39_ * (1.0F - f_42_);
	aFloat4900 = f_39_ * f_43_ + f * f_40_ * (1.0F - f_42_);
	aFloat4895 = -f * f_43_ + f_39_ * f_40_ * (1.0F - f_42_);
	aFloat4902 = f_42_ + f_40_ * f_40_ * (1.0F - f_42_);
	aFloat4898 = 0.0F;
	aFloat4901 = 0.0F;
	aFloat4903 = 0.0F;
    }
    
    public void method7245(float f, float f_44_, float f_45_, float f_46_) {
	float f_47_ = (float) Math.cos((double) f_46_);
	float f_48_ = (float) Math.sin((double) f_46_);
	float f_49_ = f_47_ + f * f * (1.0F - f_47_);
	float f_50_ = f_45_ * f_48_ + f_44_ * f * (1.0F - f_47_);
	float f_51_ = -f_44_ * f_48_ + f_45_ * f * (1.0F - f_47_);
	float f_52_ = -f_45_ * f_48_ + f * f_44_ * (1.0F - f_47_);
	float f_53_ = f_47_ + f_44_ * f_44_ * (1.0F - f_47_);
	float f_54_ = f * f_48_ + f_45_ * f_44_ * (1.0F - f_47_);
	float f_55_ = f_44_ * f_48_ + f * f_45_ * (1.0F - f_47_);
	float f_56_ = -f * f_48_ + f_44_ * f_45_ * (1.0F - f_47_);
	float f_57_ = f_47_ + f_45_ * f_45_ * (1.0F - f_47_);
	float f_58_ = aFloat4894;
	float f_59_ = aFloat4893;
	float f_60_ = aFloat4897;
	float f_61_ = aFloat4904;
	float f_62_ = aFloat4900;
	float f_63_ = aFloat4895;
	float f_64_ = aFloat4903;
	float f_65_ = aFloat4901;
	aFloat4894 = f_58_ * f_49_ + f_59_ * f_52_ + aFloat4896 * f_55_;
	aFloat4893 = f_58_ * f_50_ + f_59_ * f_53_ + aFloat4896 * f_56_;
	aFloat4896 = f_58_ * f_51_ + f_59_ * f_54_ + aFloat4896 * f_57_;
	aFloat4897 = f_60_ * f_49_ + f_61_ * f_52_ + aFloat4899 * f_55_;
	aFloat4904 = f_60_ * f_50_ + f_61_ * f_53_ + aFloat4899 * f_56_;
	aFloat4899 = f_60_ * f_51_ + f_61_ * f_54_ + aFloat4899 * f_57_;
	aFloat4900 = f_62_ * f_49_ + f_63_ * f_52_ + aFloat4902 * f_55_;
	aFloat4895 = f_62_ * f_50_ + f_63_ * f_53_ + aFloat4902 * f_56_;
	aFloat4902 = f_62_ * f_51_ + f_63_ * f_54_ + aFloat4902 * f_57_;
	aFloat4903 = f_64_ * f_49_ + f_65_ * f_52_ + aFloat4898 * f_55_;
	aFloat4901 = f_64_ * f_50_ + f_65_ * f_53_ + aFloat4898 * f_56_;
	aFloat4898 = f_64_ * f_51_ + f_65_ * f_54_ + aFloat4898 * f_57_;
    }
    
    void method7246(float f, float f_66_, float f_67_, float f_68_) {
	float f_69_ = f * f;
	float f_70_ = f * f_66_;
	float f_71_ = f * f_67_;
	float f_72_ = f * f_68_;
	float f_73_ = f_66_ * f_66_;
	float f_74_ = f_66_ * f_67_;
	float f_75_ = f_66_ * f_68_;
	float f_76_ = f_67_ * f_67_;
	float f_77_ = f_67_ * f_68_;
	aFloat4894 = 1.0F - 2.0F * (f_73_ + f_76_);
	aFloat4897 = 2.0F * (f_70_ - f_77_);
	aFloat4900 = 2.0F * (f_71_ + f_75_);
	aFloat4893 = 2.0F * (f_70_ + f_77_);
	aFloat4904 = 1.0F - 2.0F * (f_69_ + f_76_);
	aFloat4895 = 2.0F * (f_74_ - f_72_);
	aFloat4896 = 2.0F * (f_71_ - f_75_);
	aFloat4899 = 2.0F * (f_74_ + f_72_);
	aFloat4902 = 1.0F - 2.0F * (f_69_ + f_73_);
	aFloat4898 = 0.0F;
	aFloat4901 = 0.0F;
	aFloat4903 = 0.0F;
    }
    
    public void method7247(float f, float f_78_, float f_79_) {
	aFloat4895 = 0.0F;
	aFloat4900 = 0.0F;
	aFloat4899 = 0.0F;
	aFloat4897 = 0.0F;
	aFloat4896 = 0.0F;
	aFloat4893 = 0.0F;
	aFloat4902 = 1.0F;
	aFloat4904 = 1.0F;
	aFloat4894 = 1.0F;
	aFloat4903 = f;
	aFloat4901 = f_78_;
	aFloat4898 = f_79_;
    }
    
    public void method7248(float f, float f_80_, float f_81_) {
	aFloat4894 = f;
	aFloat4897 = 0.0F;
	aFloat4900 = 0.0F;
	aFloat4903 = 0.0F;
	aFloat4893 = 0.0F;
	aFloat4904 = f_80_;
	aFloat4895 = 0.0F;
	aFloat4901 = 0.0F;
	aFloat4896 = 0.0F;
	aFloat4899 = 0.0F;
	aFloat4902 = f_81_;
	aFloat4898 = 0.0F;
    }
    
    public void method7249(float f, float f_82_, float f_83_) {
	aFloat4894 *= f;
	aFloat4897 *= f;
	aFloat4900 *= f;
	aFloat4903 *= f;
	aFloat4893 *= f_82_;
	aFloat4904 *= f_82_;
	aFloat4895 *= f_82_;
	aFloat4901 *= f_82_;
	aFloat4896 *= f_83_;
	aFloat4899 *= f_83_;
	aFloat4902 *= f_83_;
	aFloat4898 *= f_83_;
    }
    
    public void method7250(float f, float f_84_, float f_85_) {
	aFloat4895 = 0.0F;
	aFloat4900 = 0.0F;
	aFloat4899 = 0.0F;
	aFloat4897 = 0.0F;
	aFloat4896 = 0.0F;
	aFloat4893 = 0.0F;
	aFloat4902 = 1.0F;
	aFloat4904 = 1.0F;
	aFloat4894 = 1.0F;
	aFloat4903 = f;
	aFloat4901 = f_84_;
	aFloat4898 = f_85_;
    }
    
    public void method7251(Class438 class438) {
	method7287(class438.aFloat4864, class438.aFloat4863,
		   class438.aFloat4865);
    }
    
    public void method7252(float f, float f_86_, float f_87_, float[] fs) {
	f -= aFloat4903;
	f_86_ -= aFloat4901;
	f_87_ -= aFloat4898;
	fs[0] = (float) (int) (aFloat4894 * f + aFloat4893 * f_86_
			       + aFloat4896 * f_87_);
	fs[1] = (float) (int) (aFloat4897 * f + aFloat4904 * f_86_
			       + aFloat4899 * f_87_);
	fs[2] = (float) (int) (aFloat4900 * f + aFloat4895 * f_86_
			       + aFloat4902 * f_87_);
    }
    
    public void method7253(Class446 class446_88_) {
	float f = aFloat4894;
	float f_89_ = aFloat4893;
	float f_90_ = aFloat4897;
	float f_91_ = aFloat4904;
	float f_92_ = aFloat4900;
	float f_93_ = aFloat4895;
	float f_94_ = aFloat4903;
	float f_95_ = aFloat4901;
	float f_96_ = aFloat4896;
	float f_97_ = aFloat4899;
	float f_98_ = aFloat4902;
	float f_99_ = aFloat4898;
	aFloat4894
	    = (f * class446_88_.aFloat4894 + f_89_ * class446_88_.aFloat4897
	       + f_96_ * class446_88_.aFloat4900);
	aFloat4893
	    = (f * class446_88_.aFloat4893 + f_89_ * class446_88_.aFloat4904
	       + f_96_ * class446_88_.aFloat4895);
	aFloat4896
	    = (f * class446_88_.aFloat4896 + f_89_ * class446_88_.aFloat4899
	       + f_96_ * class446_88_.aFloat4902);
	aFloat4897 = (f_90_ * class446_88_.aFloat4894
		      + f_91_ * class446_88_.aFloat4897
		      + f_97_ * class446_88_.aFloat4900);
	aFloat4904 = (f_90_ * class446_88_.aFloat4893
		      + f_91_ * class446_88_.aFloat4904
		      + f_97_ * class446_88_.aFloat4895);
	aFloat4899 = (f_90_ * class446_88_.aFloat4896
		      + f_91_ * class446_88_.aFloat4899
		      + f_97_ * class446_88_.aFloat4902);
	aFloat4900 = (f_92_ * class446_88_.aFloat4894
		      + f_93_ * class446_88_.aFloat4897
		      + f_98_ * class446_88_.aFloat4900);
	aFloat4895 = (f_92_ * class446_88_.aFloat4893
		      + f_93_ * class446_88_.aFloat4904
		      + f_98_ * class446_88_.aFloat4895);
	aFloat4902 = (f_92_ * class446_88_.aFloat4896
		      + f_93_ * class446_88_.aFloat4899
		      + f_98_ * class446_88_.aFloat4902);
	aFloat4903
	    = (f_94_ * class446_88_.aFloat4894
	       + f_95_ * class446_88_.aFloat4897
	       + f_99_ * class446_88_.aFloat4900 + class446_88_.aFloat4903);
	aFloat4901
	    = (f_94_ * class446_88_.aFloat4893
	       + f_95_ * class446_88_.aFloat4904
	       + f_99_ * class446_88_.aFloat4895 + class446_88_.aFloat4901);
	aFloat4898
	    = (f_94_ * class446_88_.aFloat4896
	       + f_95_ * class446_88_.aFloat4899
	       + f_99_ * class446_88_.aFloat4902 + class446_88_.aFloat4898);
    }
    
    public void method7254() {
	aFloat4898 = 0.0F;
	aFloat4901 = 0.0F;
	aFloat4903 = 0.0F;
	aFloat4895 = 0.0F;
	aFloat4900 = 0.0F;
	aFloat4899 = 0.0F;
	aFloat4897 = 0.0F;
	aFloat4896 = 0.0F;
	aFloat4893 = 0.0F;
	aFloat4902 = 1.0F;
	aFloat4904 = 1.0F;
	aFloat4894 = 1.0F;
    }
    
    public void method7255(float f, float f_100_, float f_101_, float[] fs) {
	fs[0] = (aFloat4894 * f + aFloat4897 * f_100_ + aFloat4900 * f_101_
		 + aFloat4903);
	fs[1] = (aFloat4893 * f + aFloat4904 * f_100_ + aFloat4895 * f_101_
		 + aFloat4901);
	fs[2] = (aFloat4896 * f + aFloat4899 * f_100_ + aFloat4902 * f_101_
		 + aFloat4898);
    }
    
    public void method7256(float f, float f_102_, float f_103_, float[] fs) {
	f -= aFloat4903;
	f_102_ -= aFloat4901;
	f_103_ -= aFloat4898;
	fs[0] = (float) (int) (aFloat4894 * f + aFloat4893 * f_102_
			       + aFloat4896 * f_103_);
	fs[1] = (float) (int) (aFloat4897 * f + aFloat4904 * f_102_
			       + aFloat4899 * f_103_);
	fs[2] = (float) (int) (aFloat4900 * f + aFloat4895 * f_102_
			       + aFloat4902 * f_103_);
    }
    
    public void method7257(float[] fs) {
	float f = fs[0] - aFloat4903;
	float f_104_ = fs[1] - aFloat4901;
	float f_105_ = fs[2] - aFloat4898;
	fs[0] = (float) (int) (aFloat4894 * f + aFloat4893 * f_104_
			       + aFloat4896 * f_105_);
	fs[1] = (float) (int) (aFloat4897 * f + aFloat4904 * f_104_
			       + aFloat4899 * f_105_);
	fs[2] = (float) (int) (aFloat4900 * f + aFloat4895 * f_104_
			       + aFloat4902 * f_105_);
    }
    
    public void method7258(Class446 class446_106_) {
	aFloat4894 = class446_106_.aFloat4894;
	aFloat4897 = class446_106_.aFloat4897;
	aFloat4900 = class446_106_.aFloat4900;
	aFloat4903 = class446_106_.aFloat4903;
	aFloat4893 = class446_106_.aFloat4893;
	aFloat4904 = class446_106_.aFloat4904;
	aFloat4895 = class446_106_.aFloat4895;
	aFloat4901 = class446_106_.aFloat4901;
	aFloat4896 = class446_106_.aFloat4896;
	aFloat4899 = class446_106_.aFloat4899;
	aFloat4902 = class446_106_.aFloat4902;
	aFloat4898 = class446_106_.aFloat4898;
    }
    
    public float[] method7259(float[] fs) {
	fs[0] = aFloat4903;
	fs[1] = aFloat4901;
	fs[2] = aFloat4898;
	return fs;
    }
    
    public float[] method7260(float[] fs) {
	fs[0] = aFloat4894;
	fs[1] = aFloat4893;
	fs[2] = aFloat4896;
	fs[3] = aFloat4897;
	fs[4] = aFloat4904;
	fs[5] = aFloat4899;
	fs[6] = aFloat4900;
	fs[7] = aFloat4895;
	fs[8] = aFloat4902;
	return fs;
    }
    
    public void method7261(float f, float f_107_, float f_108_) {
	aFloat4894 *= f;
	aFloat4897 *= f;
	aFloat4900 *= f;
	aFloat4903 *= f;
	aFloat4893 *= f_107_;
	aFloat4904 *= f_107_;
	aFloat4895 *= f_107_;
	aFloat4901 *= f_107_;
	aFloat4896 *= f_108_;
	aFloat4899 *= f_108_;
	aFloat4902 *= f_108_;
	aFloat4898 *= f_108_;
    }
    
    public void method7262(Class443 class443) {
	method7246(class443.aFloat4881, class443.aFloat4884,
		   class443.aFloat4883, class443.aFloat4879);
    }
    
    public void method7263(float f, float f_109_, float f_110_, float[] fs) {
	f -= aFloat4903;
	f_109_ -= aFloat4901;
	f_110_ -= aFloat4898;
	fs[0] = (float) (int) (aFloat4894 * f + aFloat4893 * f_109_
			       + aFloat4896 * f_110_);
	fs[1] = (float) (int) (aFloat4897 * f + aFloat4904 * f_109_
			       + aFloat4899 * f_110_);
	fs[2] = (float) (int) (aFloat4900 * f + aFloat4895 * f_109_
			       + aFloat4902 * f_110_);
    }
    
    public void method7264(Class446 class446_111_) {
	aFloat4894 = class446_111_.aFloat4894;
	aFloat4897 = class446_111_.aFloat4897;
	aFloat4900 = class446_111_.aFloat4900;
	aFloat4903 = class446_111_.aFloat4903;
	aFloat4893 = class446_111_.aFloat4893;
	aFloat4904 = class446_111_.aFloat4904;
	aFloat4895 = class446_111_.aFloat4895;
	aFloat4901 = class446_111_.aFloat4901;
	aFloat4896 = class446_111_.aFloat4896;
	aFloat4899 = class446_111_.aFloat4899;
	aFloat4902 = class446_111_.aFloat4902;
	aFloat4898 = class446_111_.aFloat4898;
    }
    
    public String toString() {
	return new StringBuilder().append(aFloat4894).append(",").append
		   (aFloat4897).append
		   (",").append
		   (aFloat4900).append
		   (",").append
		   (aFloat4903).append
		   (" - ").append
		   (aFloat4893).append
		   (",").append
		   (aFloat4904).append
		   (",").append
		   (aFloat4895).append
		   (",").append
		   (aFloat4901).append
		   (" - ").append
		   (aFloat4896).append
		   (",").append
		   (aFloat4899).append
		   (",").append
		   (aFloat4902).append
		   (",").append
		   (aFloat4898).toString();
    }
    
    public void method7265(Class446 class446_112_) {
	aFloat4894 = class446_112_.aFloat4894;
	aFloat4897 = class446_112_.aFloat4897;
	aFloat4900 = class446_112_.aFloat4900;
	aFloat4903 = class446_112_.aFloat4903;
	aFloat4893 = class446_112_.aFloat4893;
	aFloat4904 = class446_112_.aFloat4904;
	aFloat4895 = class446_112_.aFloat4895;
	aFloat4901 = class446_112_.aFloat4901;
	aFloat4896 = class446_112_.aFloat4896;
	aFloat4899 = class446_112_.aFloat4899;
	aFloat4902 = class446_112_.aFloat4902;
	aFloat4898 = class446_112_.aFloat4898;
    }
    
    public void method7266(Class444 class444) {
	float f = (class444.aClass443_4886.aFloat4879
		   * class444.aClass443_4886.aFloat4879);
	float f_113_ = (class444.aClass443_4886.aFloat4879
			* class444.aClass443_4886.aFloat4881);
	float f_114_ = (class444.aClass443_4886.aFloat4879
			* class444.aClass443_4886.aFloat4884);
	float f_115_ = (class444.aClass443_4886.aFloat4879
			* class444.aClass443_4886.aFloat4883);
	float f_116_ = (class444.aClass443_4886.aFloat4881
			* class444.aClass443_4886.aFloat4881);
	float f_117_ = (class444.aClass443_4886.aFloat4881
			* class444.aClass443_4886.aFloat4884);
	float f_118_ = (class444.aClass443_4886.aFloat4881
			* class444.aClass443_4886.aFloat4883);
	float f_119_ = (class444.aClass443_4886.aFloat4884
			* class444.aClass443_4886.aFloat4884);
	float f_120_ = (class444.aClass443_4886.aFloat4884
			* class444.aClass443_4886.aFloat4883);
	float f_121_ = (class444.aClass443_4886.aFloat4883
			* class444.aClass443_4886.aFloat4883);
	aFloat4894 = f_116_ + f - f_121_ - f_119_;
	aFloat4893 = f_117_ + f_115_ + f_117_ + f_115_;
	aFloat4896 = f_118_ - f_114_ - f_114_ + f_118_;
	aFloat4897 = f_117_ - f_115_ - f_115_ + f_117_;
	aFloat4904 = f_119_ + f - f_116_ - f_121_;
	aFloat4899 = f_120_ + f_113_ + f_120_ + f_113_;
	aFloat4900 = f_118_ + f_114_ + f_118_ + f_114_;
	aFloat4895 = f_120_ - f_113_ - f_113_ + f_120_;
	aFloat4902 = f_121_ + f - f_119_ - f_116_;
	aFloat4903 = class444.aClass438_4885.aFloat4864;
	aFloat4901 = class444.aClass438_4885.aFloat4863;
	aFloat4898 = class444.aClass438_4885.aFloat4865;
    }
    
    public void method7267() {
	aFloat4898 = 0.0F;
	aFloat4901 = 0.0F;
	aFloat4903 = 0.0F;
	aFloat4895 = 0.0F;
	aFloat4900 = 0.0F;
	aFloat4899 = 0.0F;
	aFloat4897 = 0.0F;
	aFloat4896 = 0.0F;
	aFloat4893 = 0.0F;
	aFloat4902 = 1.0F;
	aFloat4904 = 1.0F;
	aFloat4894 = 1.0F;
    }
    
    public void method7268(float[] fs) {
	float f = fs[0];
	float f_122_ = fs[1];
	float f_123_ = fs[2];
	fs[0] = aFloat4894 * f + aFloat4893 * f_122_ + aFloat4896 * f_123_;
	fs[1] = aFloat4897 * f + aFloat4904 * f_122_ + aFloat4899 * f_123_;
	fs[2] = aFloat4900 * f + aFloat4895 * f_122_ + aFloat4902 * f_123_;
    }
    
    public void method7269(double d, double d_124_, double d_125_,
			   double d_126_, double d_127_, double d_128_,
			   float f, float f_129_, float f_130_) {
	float f_131_ = (float) (d_126_ - d);
	float f_132_ = (float) (d_127_ - d_124_);
	float f_133_ = (float) (d_128_ - d_125_);
	float f_134_ = f_129_ * f_133_ - f_130_ * f_132_;
	float f_135_ = f_130_ * f_131_ - f * f_133_;
	float f_136_ = f * f_132_ - f_129_ * f_131_;
	float f_137_ = (float) (1.0 / Math.sqrt((double) (f_134_ * f_134_
							  + f_135_ * f_135_
							  + f_136_ * f_136_)));
	float f_138_ = (float) (1.0 / Math.sqrt((double) (f_131_ * f_131_
							  + f_132_ * f_132_
							  + f_133_ * f_133_)));
	aFloat4894 = f_134_ * f_137_;
	aFloat4897 = f_135_ * f_137_;
	aFloat4900 = f_136_ * f_137_;
	aFloat4896 = f_131_ * f_138_;
	aFloat4899 = f_132_ * f_138_;
	aFloat4902 = f_133_ * f_138_;
	aFloat4893 = aFloat4899 * aFloat4900 - aFloat4902 * aFloat4897;
	aFloat4904 = aFloat4902 * aFloat4894 - aFloat4896 * aFloat4900;
	aFloat4895 = aFloat4896 * aFloat4897 - aFloat4899 * aFloat4894;
	aFloat4903
	    = -(float) (d * (double) aFloat4894 + d_124_ * (double) aFloat4897
			+ d_125_ * (double) aFloat4900);
	aFloat4901
	    = -(float) (d * (double) aFloat4893 + d_124_ * (double) aFloat4904
			+ d_125_ * (double) aFloat4895);
	aFloat4898
	    = -(float) (d * (double) aFloat4896 + d_124_ * (double) aFloat4899
			+ d_125_ * (double) aFloat4902);
    }
    
    public void method7270(int i, int i_139_, int i_140_, float f,
			   float f_141_, float f_142_) {
	if (i != 0) {
	    float f_143_ = Class428.aFloatArray4818[i & 0x3fff];
	    float f_144_ = Class428.aFloatArray4817[i & 0x3fff];
	    aFloat4902 = 1.0F;
	    aFloat4895 = 0.0F;
	    aFloat4900 = 0.0F;
	    aFloat4899 = 0.0F;
	    aFloat4896 = 0.0F;
	    aFloat4894 = 2.0F * f_143_ * (float) i_139_;
	    aFloat4904 = 2.0F * f_143_ * (float) i_140_;
	    aFloat4893 = 2.0F * f_144_ * (float) i_139_;
	    aFloat4897 = -2.0F * f_144_ * (float) i_140_;
	    aFloat4903
		= (float) (2 * i_139_) * (0.5F * f_144_ - 0.5F * f_143_) + f;
	    aFloat4901 = (float) (2 * i_140_) * (-0.5F * f_144_
						 - 0.5F * f_143_) + f_141_;
	    aFloat4898 = f_142_;
	} else {
	    aFloat4895 = 0.0F;
	    aFloat4900 = 0.0F;
	    aFloat4899 = 0.0F;
	    aFloat4897 = 0.0F;
	    aFloat4896 = 0.0F;
	    aFloat4893 = 0.0F;
	    aFloat4894 = (float) (2 * i_139_);
	    aFloat4904 = (float) (2 * i_140_);
	    aFloat4902 = 1.0F;
	    aFloat4903 = f - (float) i_139_;
	    aFloat4901 = f_141_ - (float) i_140_;
	    aFloat4898 = f_142_;
	}
    }
    
    public void method7271(int i, int i_145_, int i_146_, float f,
			   float f_147_, float f_148_) {
	if (i != 0) {
	    float f_149_ = Class428.aFloatArray4818[i & 0x3fff];
	    float f_150_ = Class428.aFloatArray4817[i & 0x3fff];
	    aFloat4902 = 1.0F;
	    aFloat4895 = 0.0F;
	    aFloat4900 = 0.0F;
	    aFloat4899 = 0.0F;
	    aFloat4896 = 0.0F;
	    aFloat4894 = 2.0F * f_149_ * (float) i_145_;
	    aFloat4904 = 2.0F * f_149_ * (float) i_146_;
	    aFloat4893 = 2.0F * f_150_ * (float) i_145_;
	    aFloat4897 = -2.0F * f_150_ * (float) i_146_;
	    aFloat4903
		= (float) (2 * i_145_) * (0.5F * f_150_ - 0.5F * f_149_) + f;
	    aFloat4901 = (float) (2 * i_146_) * (-0.5F * f_150_
						 - 0.5F * f_149_) + f_147_;
	    aFloat4898 = f_148_;
	} else {
	    aFloat4895 = 0.0F;
	    aFloat4900 = 0.0F;
	    aFloat4899 = 0.0F;
	    aFloat4897 = 0.0F;
	    aFloat4896 = 0.0F;
	    aFloat4893 = 0.0F;
	    aFloat4894 = (float) (2 * i_145_);
	    aFloat4904 = (float) (2 * i_146_);
	    aFloat4902 = 1.0F;
	    aFloat4903 = f - (float) i_145_;
	    aFloat4901 = f_147_ - (float) i_146_;
	    aFloat4898 = f_148_;
	}
    }
    
    public void method7272(float f, float f_151_, float f_152_, float f_153_,
			   float f_154_, float f_155_, float f_156_,
			   float f_157_, float f_158_) {
	aFloat4894 = f;
	aFloat4897 = f_153_;
	aFloat4900 = f_156_;
	aFloat4903 = 0.0F;
	aFloat4893 = f_151_;
	aFloat4904 = f_154_;
	aFloat4895 = f_157_;
	aFloat4901 = 0.0F;
	aFloat4896 = f_152_;
	aFloat4899 = f_155_;
	aFloat4902 = f_158_;
	aFloat4898 = 0.0F;
    }
    
    public void method7273(float f, float f_159_, float f_160_, float f_161_,
			   float f_162_, float f_163_, float f_164_,
			   float f_165_, float f_166_) {
	aFloat4894 = f;
	aFloat4897 = f_161_;
	aFloat4900 = f_164_;
	aFloat4903 = 0.0F;
	aFloat4893 = f_159_;
	aFloat4904 = f_162_;
	aFloat4895 = f_165_;
	aFloat4901 = 0.0F;
	aFloat4896 = f_160_;
	aFloat4899 = f_163_;
	aFloat4902 = f_166_;
	aFloat4898 = 0.0F;
    }
    
    public void method7274(Class446 class446_167_) {
	if (class446_167_ == this)
	    method7243();
	else {
	    aFloat4894 = class446_167_.aFloat4894;
	    aFloat4897 = class446_167_.aFloat4893;
	    aFloat4900 = class446_167_.aFloat4896;
	    aFloat4893 = class446_167_.aFloat4897;
	    aFloat4904 = class446_167_.aFloat4904;
	    aFloat4895 = class446_167_.aFloat4899;
	    aFloat4896 = class446_167_.aFloat4900;
	    aFloat4899 = class446_167_.aFloat4895;
	    aFloat4902 = class446_167_.aFloat4902;
	    aFloat4903 = -(class446_167_.aFloat4903 * aFloat4894
			   + class446_167_.aFloat4901 * aFloat4897
			   + class446_167_.aFloat4898 * aFloat4900);
	    aFloat4901 = -(class446_167_.aFloat4903 * aFloat4893
			   + class446_167_.aFloat4901 * aFloat4904
			   + class446_167_.aFloat4898 * aFloat4895);
	    aFloat4898 = -(class446_167_.aFloat4903 * aFloat4896
			   + class446_167_.aFloat4901 * aFloat4899
			   + class446_167_.aFloat4898 * aFloat4902);
	}
    }
    
    void method7275(float f, float f_168_, float f_169_, float f_170_) {
	float f_171_ = f * f;
	float f_172_ = f * f_168_;
	float f_173_ = f * f_169_;
	float f_174_ = f * f_170_;
	float f_175_ = f_168_ * f_168_;
	float f_176_ = f_168_ * f_169_;
	float f_177_ = f_168_ * f_170_;
	float f_178_ = f_169_ * f_169_;
	float f_179_ = f_169_ * f_170_;
	aFloat4894 = 1.0F - 2.0F * (f_175_ + f_178_);
	aFloat4897 = 2.0F * (f_172_ - f_179_);
	aFloat4900 = 2.0F * (f_173_ + f_177_);
	aFloat4893 = 2.0F * (f_172_ + f_179_);
	aFloat4904 = 1.0F - 2.0F * (f_171_ + f_178_);
	aFloat4895 = 2.0F * (f_176_ - f_174_);
	aFloat4896 = 2.0F * (f_173_ - f_177_);
	aFloat4899 = 2.0F * (f_176_ + f_174_);
	aFloat4902 = 1.0F - 2.0F * (f_171_ + f_175_);
	aFloat4898 = 0.0F;
	aFloat4901 = 0.0F;
	aFloat4903 = 0.0F;
    }
    
    public void method7276(Class446 class446_180_) {
	if (class446_180_ == this)
	    method7243();
	else {
	    aFloat4894 = class446_180_.aFloat4894;
	    aFloat4897 = class446_180_.aFloat4893;
	    aFloat4900 = class446_180_.aFloat4896;
	    aFloat4893 = class446_180_.aFloat4897;
	    aFloat4904 = class446_180_.aFloat4904;
	    aFloat4895 = class446_180_.aFloat4899;
	    aFloat4896 = class446_180_.aFloat4900;
	    aFloat4899 = class446_180_.aFloat4895;
	    aFloat4902 = class446_180_.aFloat4902;
	    aFloat4903 = -(class446_180_.aFloat4903 * aFloat4894
			   + class446_180_.aFloat4901 * aFloat4897
			   + class446_180_.aFloat4898 * aFloat4900);
	    aFloat4901 = -(class446_180_.aFloat4903 * aFloat4893
			   + class446_180_.aFloat4901 * aFloat4904
			   + class446_180_.aFloat4898 * aFloat4895);
	    aFloat4898 = -(class446_180_.aFloat4903 * aFloat4896
			   + class446_180_.aFloat4901 * aFloat4899
			   + class446_180_.aFloat4898 * aFloat4902);
	}
    }
    
    public void method7277() {
	float f = aFloat4903;
	float f_181_ = aFloat4901;
	float f_182_ = aFloat4897;
	aFloat4897 = aFloat4893;
	aFloat4893 = f_182_;
	float f_183_ = aFloat4900;
	aFloat4900 = aFloat4896;
	aFloat4896 = f_183_;
	float f_184_ = aFloat4895;
	aFloat4895 = aFloat4899;
	aFloat4899 = f_184_;
	aFloat4903 = -(f * aFloat4894 + f_181_ * aFloat4897
		       + aFloat4898 * aFloat4900);
	aFloat4901 = -(f * aFloat4893 + f_181_ * aFloat4904
		       + aFloat4898 * aFloat4895);
	aFloat4898 = -(f * aFloat4896 + f_181_ * aFloat4899
		       + aFloat4898 * aFloat4902);
    }
    
    public void method7278(float f, float f_185_, float f_186_, float f_187_) {
	float f_188_ = (float) Math.cos((double) f_187_);
	float f_189_ = (float) Math.sin((double) f_187_);
	aFloat4894 = f_188_ + f * f * (1.0F - f_188_);
	aFloat4893 = f_186_ * f_189_ + f_185_ * f * (1.0F - f_188_);
	aFloat4896 = -f_185_ * f_189_ + f_186_ * f * (1.0F - f_188_);
	aFloat4897 = -f_186_ * f_189_ + f * f_185_ * (1.0F - f_188_);
	aFloat4904 = f_188_ + f_185_ * f_185_ * (1.0F - f_188_);
	aFloat4899 = f * f_189_ + f_186_ * f_185_ * (1.0F - f_188_);
	aFloat4900 = f_185_ * f_189_ + f * f_186_ * (1.0F - f_188_);
	aFloat4895 = -f * f_189_ + f_185_ * f_186_ * (1.0F - f_188_);
	aFloat4902 = f_188_ + f_186_ * f_186_ * (1.0F - f_188_);
	aFloat4898 = 0.0F;
	aFloat4901 = 0.0F;
	aFloat4903 = 0.0F;
    }
    
    public void method7279(float f, float f_190_, float f_191_) {
	aFloat4895 = 0.0F;
	aFloat4900 = 0.0F;
	aFloat4899 = 0.0F;
	aFloat4897 = 0.0F;
	aFloat4896 = 0.0F;
	aFloat4893 = 0.0F;
	aFloat4902 = 1.0F;
	aFloat4904 = 1.0F;
	aFloat4894 = 1.0F;
	aFloat4903 = f;
	aFloat4901 = f_190_;
	aFloat4898 = f_191_;
    }
    
    public void method7280(Class443 class443) {
	method7246(class443.aFloat4881, class443.aFloat4884,
		   class443.aFloat4883, class443.aFloat4879);
    }
    
    void method7281(float f, float f_192_, float f_193_, float f_194_) {
	float f_195_ = f * f;
	float f_196_ = f * f_192_;
	float f_197_ = f * f_193_;
	float f_198_ = f * f_194_;
	float f_199_ = f_192_ * f_192_;
	float f_200_ = f_192_ * f_193_;
	float f_201_ = f_192_ * f_194_;
	float f_202_ = f_193_ * f_193_;
	float f_203_ = f_193_ * f_194_;
	aFloat4894 = 1.0F - 2.0F * (f_199_ + f_202_);
	aFloat4897 = 2.0F * (f_196_ - f_203_);
	aFloat4900 = 2.0F * (f_197_ + f_201_);
	aFloat4893 = 2.0F * (f_196_ + f_203_);
	aFloat4904 = 1.0F - 2.0F * (f_195_ + f_202_);
	aFloat4895 = 2.0F * (f_200_ - f_198_);
	aFloat4896 = 2.0F * (f_197_ - f_201_);
	aFloat4899 = 2.0F * (f_200_ + f_198_);
	aFloat4902 = 1.0F - 2.0F * (f_195_ + f_199_);
	aFloat4898 = 0.0F;
	aFloat4901 = 0.0F;
	aFloat4903 = 0.0F;
    }
    
    public float[] method7282(float[] fs) {
	fs[0] = aFloat4894;
	fs[1] = aFloat4893;
	fs[2] = aFloat4896;
	fs[3] = aFloat4897;
	fs[4] = aFloat4904;
	fs[5] = aFloat4899;
	fs[6] = aFloat4900;
	fs[7] = aFloat4895;
	fs[8] = aFloat4902;
	return fs;
    }
    
    void method7283(float f, float f_204_, float f_205_, float f_206_) {
	float f_207_ = f * f;
	float f_208_ = f * f_204_;
	float f_209_ = f * f_205_;
	float f_210_ = f * f_206_;
	float f_211_ = f_204_ * f_204_;
	float f_212_ = f_204_ * f_205_;
	float f_213_ = f_204_ * f_206_;
	float f_214_ = f_205_ * f_205_;
	float f_215_ = f_205_ * f_206_;
	aFloat4894 = 1.0F - 2.0F * (f_211_ + f_214_);
	aFloat4897 = 2.0F * (f_208_ - f_215_);
	aFloat4900 = 2.0F * (f_209_ + f_213_);
	aFloat4893 = 2.0F * (f_208_ + f_215_);
	aFloat4904 = 1.0F - 2.0F * (f_207_ + f_214_);
	aFloat4895 = 2.0F * (f_212_ - f_210_);
	aFloat4896 = 2.0F * (f_209_ - f_213_);
	aFloat4899 = 2.0F * (f_212_ + f_210_);
	aFloat4902 = 1.0F - 2.0F * (f_207_ + f_211_);
	aFloat4898 = 0.0F;
	aFloat4901 = 0.0F;
	aFloat4903 = 0.0F;
    }
    
    public void method7284(float f, float f_216_, float f_217_, float f_218_) {
	float f_219_ = (float) Math.cos((double) f_218_);
	float f_220_ = (float) Math.sin((double) f_218_);
	float f_221_ = f_219_ + f * f * (1.0F - f_219_);
	float f_222_ = f_217_ * f_220_ + f_216_ * f * (1.0F - f_219_);
	float f_223_ = -f_216_ * f_220_ + f_217_ * f * (1.0F - f_219_);
	float f_224_ = -f_217_ * f_220_ + f * f_216_ * (1.0F - f_219_);
	float f_225_ = f_219_ + f_216_ * f_216_ * (1.0F - f_219_);
	float f_226_ = f * f_220_ + f_217_ * f_216_ * (1.0F - f_219_);
	float f_227_ = f_216_ * f_220_ + f * f_217_ * (1.0F - f_219_);
	float f_228_ = -f * f_220_ + f_216_ * f_217_ * (1.0F - f_219_);
	float f_229_ = f_219_ + f_217_ * f_217_ * (1.0F - f_219_);
	float f_230_ = aFloat4894;
	float f_231_ = aFloat4893;
	float f_232_ = aFloat4897;
	float f_233_ = aFloat4904;
	float f_234_ = aFloat4900;
	float f_235_ = aFloat4895;
	float f_236_ = aFloat4903;
	float f_237_ = aFloat4901;
	aFloat4894 = f_230_ * f_221_ + f_231_ * f_224_ + aFloat4896 * f_227_;
	aFloat4893 = f_230_ * f_222_ + f_231_ * f_225_ + aFloat4896 * f_228_;
	aFloat4896 = f_230_ * f_223_ + f_231_ * f_226_ + aFloat4896 * f_229_;
	aFloat4897 = f_232_ * f_221_ + f_233_ * f_224_ + aFloat4899 * f_227_;
	aFloat4904 = f_232_ * f_222_ + f_233_ * f_225_ + aFloat4899 * f_228_;
	aFloat4899 = f_232_ * f_223_ + f_233_ * f_226_ + aFloat4899 * f_229_;
	aFloat4900 = f_234_ * f_221_ + f_235_ * f_224_ + aFloat4902 * f_227_;
	aFloat4895 = f_234_ * f_222_ + f_235_ * f_225_ + aFloat4902 * f_228_;
	aFloat4902 = f_234_ * f_223_ + f_235_ * f_226_ + aFloat4902 * f_229_;
	aFloat4903 = f_236_ * f_221_ + f_237_ * f_224_ + aFloat4898 * f_227_;
	aFloat4901 = f_236_ * f_222_ + f_237_ * f_225_ + aFloat4898 * f_228_;
	aFloat4898 = f_236_ * f_223_ + f_237_ * f_226_ + aFloat4898 * f_229_;
    }
    
    public void method7285(Class446 class446_238_) {
	if (class446_238_ == this)
	    method7243();
	else {
	    aFloat4894 = class446_238_.aFloat4894;
	    aFloat4897 = class446_238_.aFloat4893;
	    aFloat4900 = class446_238_.aFloat4896;
	    aFloat4893 = class446_238_.aFloat4897;
	    aFloat4904 = class446_238_.aFloat4904;
	    aFloat4895 = class446_238_.aFloat4899;
	    aFloat4896 = class446_238_.aFloat4900;
	    aFloat4899 = class446_238_.aFloat4895;
	    aFloat4902 = class446_238_.aFloat4902;
	    aFloat4903 = -(class446_238_.aFloat4903 * aFloat4894
			   + class446_238_.aFloat4901 * aFloat4897
			   + class446_238_.aFloat4898 * aFloat4900);
	    aFloat4901 = -(class446_238_.aFloat4903 * aFloat4893
			   + class446_238_.aFloat4901 * aFloat4904
			   + class446_238_.aFloat4898 * aFloat4895);
	    aFloat4898 = -(class446_238_.aFloat4903 * aFloat4896
			   + class446_238_.aFloat4901 * aFloat4899
			   + class446_238_.aFloat4898 * aFloat4902);
	}
    }
    
    public void method7286(float f, float f_239_, float f_240_) {
	aFloat4894 *= f;
	aFloat4897 *= f;
	aFloat4900 *= f;
	aFloat4903 *= f;
	aFloat4893 *= f_239_;
	aFloat4904 *= f_239_;
	aFloat4895 *= f_239_;
	aFloat4901 *= f_239_;
	aFloat4896 *= f_240_;
	aFloat4899 *= f_240_;
	aFloat4902 *= f_240_;
	aFloat4898 *= f_240_;
    }
    
    public void method7287(float f, float f_241_, float f_242_) {
	aFloat4903 += f;
	aFloat4901 += f_241_;
	aFloat4898 += f_242_;
    }
    
    public void method7288(float f, float f_243_, float f_244_, float f_245_) {
	float f_246_ = (float) Math.cos((double) f_245_);
	float f_247_ = (float) Math.sin((double) f_245_);
	aFloat4894 = f_246_ + f * f * (1.0F - f_246_);
	aFloat4893 = f_244_ * f_247_ + f_243_ * f * (1.0F - f_246_);
	aFloat4896 = -f_243_ * f_247_ + f_244_ * f * (1.0F - f_246_);
	aFloat4897 = -f_244_ * f_247_ + f * f_243_ * (1.0F - f_246_);
	aFloat4904 = f_246_ + f_243_ * f_243_ * (1.0F - f_246_);
	aFloat4899 = f * f_247_ + f_244_ * f_243_ * (1.0F - f_246_);
	aFloat4900 = f_243_ * f_247_ + f * f_244_ * (1.0F - f_246_);
	aFloat4895 = -f * f_247_ + f_243_ * f_244_ * (1.0F - f_246_);
	aFloat4902 = f_246_ + f_244_ * f_244_ * (1.0F - f_246_);
	aFloat4898 = 0.0F;
	aFloat4901 = 0.0F;
	aFloat4903 = 0.0F;
    }
    
    public void method7289(float f, float f_248_, float f_249_) {
	aFloat4895 = 0.0F;
	aFloat4900 = 0.0F;
	aFloat4899 = 0.0F;
	aFloat4897 = 0.0F;
	aFloat4896 = 0.0F;
	aFloat4893 = 0.0F;
	aFloat4902 = 1.0F;
	aFloat4904 = 1.0F;
	aFloat4894 = 1.0F;
	aFloat4903 = f;
	aFloat4901 = f_248_;
	aFloat4898 = f_249_;
    }
    
    public String method7290() {
	return new StringBuilder().append(aFloat4894).append(",").append
		   (aFloat4897).append
		   (",").append
		   (aFloat4900).append
		   (",").append
		   (aFloat4903).append
		   (" - ").append
		   (aFloat4893).append
		   (",").append
		   (aFloat4904).append
		   (",").append
		   (aFloat4895).append
		   (",").append
		   (aFloat4901).append
		   (" - ").append
		   (aFloat4896).append
		   (",").append
		   (aFloat4899).append
		   (",").append
		   (aFloat4902).append
		   (",").append
		   (aFloat4898).toString();
    }
    
    public void method7291(float f, float f_250_, float f_251_) {
	aFloat4895 = 0.0F;
	aFloat4900 = 0.0F;
	aFloat4899 = 0.0F;
	aFloat4897 = 0.0F;
	aFloat4896 = 0.0F;
	aFloat4893 = 0.0F;
	aFloat4902 = 1.0F;
	aFloat4904 = 1.0F;
	aFloat4894 = 1.0F;
	aFloat4903 = f;
	aFloat4901 = f_250_;
	aFloat4898 = f_251_;
    }
    
    public void method7292(Class438 class438) {
	method7287(class438.aFloat4864, class438.aFloat4863,
		   class438.aFloat4865);
    }
    
    public String method7293() {
	return new StringBuilder().append(aFloat4894).append(",").append
		   (aFloat4897).append
		   (",").append
		   (aFloat4900).append
		   (",").append
		   (aFloat4903).append
		   (" - ").append
		   (aFloat4893).append
		   (",").append
		   (aFloat4904).append
		   (",").append
		   (aFloat4895).append
		   (",").append
		   (aFloat4901).append
		   (" - ").append
		   (aFloat4896).append
		   (",").append
		   (aFloat4899).append
		   (",").append
		   (aFloat4902).append
		   (",").append
		   (aFloat4898).toString();
    }
    
    public void method7294(Class438 class438) {
	method7287(class438.aFloat4864, class438.aFloat4863,
		   class438.aFloat4865);
    }
    
    public void method7295(float f, float f_252_, float f_253_) {
	aFloat4903 += f;
	aFloat4901 += f_252_;
	aFloat4898 += f_253_;
    }
    
    public void method7296(Class446 class446_254_) {
	float f = aFloat4894;
	float f_255_ = aFloat4893;
	float f_256_ = aFloat4897;
	float f_257_ = aFloat4904;
	float f_258_ = aFloat4900;
	float f_259_ = aFloat4895;
	float f_260_ = aFloat4903;
	float f_261_ = aFloat4901;
	float f_262_ = aFloat4896;
	float f_263_ = aFloat4899;
	float f_264_ = aFloat4902;
	float f_265_ = aFloat4898;
	aFloat4894
	    = (f * class446_254_.aFloat4894 + f_255_ * class446_254_.aFloat4897
	       + f_262_ * class446_254_.aFloat4900);
	aFloat4893
	    = (f * class446_254_.aFloat4893 + f_255_ * class446_254_.aFloat4904
	       + f_262_ * class446_254_.aFloat4895);
	aFloat4896
	    = (f * class446_254_.aFloat4896 + f_255_ * class446_254_.aFloat4899
	       + f_262_ * class446_254_.aFloat4902);
	aFloat4897 = (f_256_ * class446_254_.aFloat4894
		      + f_257_ * class446_254_.aFloat4897
		      + f_263_ * class446_254_.aFloat4900);
	aFloat4904 = (f_256_ * class446_254_.aFloat4893
		      + f_257_ * class446_254_.aFloat4904
		      + f_263_ * class446_254_.aFloat4895);
	aFloat4899 = (f_256_ * class446_254_.aFloat4896
		      + f_257_ * class446_254_.aFloat4899
		      + f_263_ * class446_254_.aFloat4902);
	aFloat4900 = (f_258_ * class446_254_.aFloat4894
		      + f_259_ * class446_254_.aFloat4897
		      + f_264_ * class446_254_.aFloat4900);
	aFloat4895 = (f_258_ * class446_254_.aFloat4893
		      + f_259_ * class446_254_.aFloat4904
		      + f_264_ * class446_254_.aFloat4895);
	aFloat4902 = (f_258_ * class446_254_.aFloat4896
		      + f_259_ * class446_254_.aFloat4899
		      + f_264_ * class446_254_.aFloat4902);
	aFloat4903
	    = (f_260_ * class446_254_.aFloat4894
	       + f_261_ * class446_254_.aFloat4897
	       + f_265_ * class446_254_.aFloat4900 + class446_254_.aFloat4903);
	aFloat4901
	    = (f_260_ * class446_254_.aFloat4893
	       + f_261_ * class446_254_.aFloat4904
	       + f_265_ * class446_254_.aFloat4895 + class446_254_.aFloat4901);
	aFloat4898
	    = (f_260_ * class446_254_.aFloat4896
	       + f_261_ * class446_254_.aFloat4899
	       + f_265_ * class446_254_.aFloat4902 + class446_254_.aFloat4898);
    }
    
    public void method7297(Class446 class446_266_) {
	float f = aFloat4894;
	float f_267_ = aFloat4893;
	float f_268_ = aFloat4897;
	float f_269_ = aFloat4904;
	float f_270_ = aFloat4900;
	float f_271_ = aFloat4895;
	float f_272_ = aFloat4903;
	float f_273_ = aFloat4901;
	float f_274_ = aFloat4896;
	float f_275_ = aFloat4899;
	float f_276_ = aFloat4902;
	float f_277_ = aFloat4898;
	aFloat4894
	    = (f * class446_266_.aFloat4894 + f_267_ * class446_266_.aFloat4897
	       + f_274_ * class446_266_.aFloat4900);
	aFloat4893
	    = (f * class446_266_.aFloat4893 + f_267_ * class446_266_.aFloat4904
	       + f_274_ * class446_266_.aFloat4895);
	aFloat4896
	    = (f * class446_266_.aFloat4896 + f_267_ * class446_266_.aFloat4899
	       + f_274_ * class446_266_.aFloat4902);
	aFloat4897 = (f_268_ * class446_266_.aFloat4894
		      + f_269_ * class446_266_.aFloat4897
		      + f_275_ * class446_266_.aFloat4900);
	aFloat4904 = (f_268_ * class446_266_.aFloat4893
		      + f_269_ * class446_266_.aFloat4904
		      + f_275_ * class446_266_.aFloat4895);
	aFloat4899 = (f_268_ * class446_266_.aFloat4896
		      + f_269_ * class446_266_.aFloat4899
		      + f_275_ * class446_266_.aFloat4902);
	aFloat4900 = (f_270_ * class446_266_.aFloat4894
		      + f_271_ * class446_266_.aFloat4897
		      + f_276_ * class446_266_.aFloat4900);
	aFloat4895 = (f_270_ * class446_266_.aFloat4893
		      + f_271_ * class446_266_.aFloat4904
		      + f_276_ * class446_266_.aFloat4895);
	aFloat4902 = (f_270_ * class446_266_.aFloat4896
		      + f_271_ * class446_266_.aFloat4899
		      + f_276_ * class446_266_.aFloat4902);
	aFloat4903
	    = (f_272_ * class446_266_.aFloat4894
	       + f_273_ * class446_266_.aFloat4897
	       + f_277_ * class446_266_.aFloat4900 + class446_266_.aFloat4903);
	aFloat4901
	    = (f_272_ * class446_266_.aFloat4893
	       + f_273_ * class446_266_.aFloat4904
	       + f_277_ * class446_266_.aFloat4895 + class446_266_.aFloat4901);
	aFloat4898
	    = (f_272_ * class446_266_.aFloat4896
	       + f_273_ * class446_266_.aFloat4899
	       + f_277_ * class446_266_.aFloat4902 + class446_266_.aFloat4898);
    }
    
    public void method7298(double d, double d_278_, double d_279_,
			   double d_280_, double d_281_, double d_282_,
			   float f, float f_283_, float f_284_) {
	float f_285_ = (float) (d_280_ - d);
	float f_286_ = (float) (d_281_ - d_278_);
	float f_287_ = (float) (d_282_ - d_279_);
	float f_288_ = f_283_ * f_287_ - f_284_ * f_286_;
	float f_289_ = f_284_ * f_285_ - f * f_287_;
	float f_290_ = f * f_286_ - f_283_ * f_285_;
	float f_291_ = (float) (1.0 / Math.sqrt((double) (f_288_ * f_288_
							  + f_289_ * f_289_
							  + f_290_ * f_290_)));
	float f_292_ = (float) (1.0 / Math.sqrt((double) (f_285_ * f_285_
							  + f_286_ * f_286_
							  + f_287_ * f_287_)));
	aFloat4894 = f_288_ * f_291_;
	aFloat4897 = f_289_ * f_291_;
	aFloat4900 = f_290_ * f_291_;
	aFloat4896 = f_285_ * f_292_;
	aFloat4899 = f_286_ * f_292_;
	aFloat4902 = f_287_ * f_292_;
	aFloat4893 = aFloat4899 * aFloat4900 - aFloat4902 * aFloat4897;
	aFloat4904 = aFloat4902 * aFloat4894 - aFloat4896 * aFloat4900;
	aFloat4895 = aFloat4896 * aFloat4897 - aFloat4899 * aFloat4894;
	aFloat4903
	    = -(float) (d * (double) aFloat4894 + d_278_ * (double) aFloat4897
			+ d_279_ * (double) aFloat4900);
	aFloat4901
	    = -(float) (d * (double) aFloat4893 + d_278_ * (double) aFloat4904
			+ d_279_ * (double) aFloat4895);
	aFloat4898
	    = -(float) (d * (double) aFloat4896 + d_278_ * (double) aFloat4899
			+ d_279_ * (double) aFloat4902);
    }
    
    public void method7299(float f, float f_293_, float f_294_, float[] fs) {
	f -= aFloat4903;
	f_293_ -= aFloat4901;
	f_294_ -= aFloat4898;
	fs[0] = (float) (int) (aFloat4894 * f + aFloat4893 * f_293_
			       + aFloat4896 * f_294_);
	fs[1] = (float) (int) (aFloat4897 * f + aFloat4904 * f_293_
			       + aFloat4899 * f_294_);
	fs[2] = (float) (int) (aFloat4900 * f + aFloat4895 * f_293_
			       + aFloat4902 * f_294_);
    }
    
    public void method7300(float f, float f_295_, float f_296_, float[] fs) {
	fs[0] = (aFloat4894 * f + aFloat4897 * f_295_ + aFloat4900 * f_296_
		 + aFloat4903);
	fs[1] = (aFloat4893 * f + aFloat4904 * f_295_ + aFloat4895 * f_296_
		 + aFloat4901);
	fs[2] = (aFloat4896 * f + aFloat4899 * f_295_ + aFloat4902 * f_296_
		 + aFloat4898);
    }
    
    public void method7301(float f, float f_297_, float f_298_, float[] fs) {
	f -= aFloat4903;
	f_297_ -= aFloat4901;
	f_298_ -= aFloat4898;
	fs[0] = (float) (int) (aFloat4894 * f + aFloat4893 * f_297_
			       + aFloat4896 * f_298_);
	fs[1] = (float) (int) (aFloat4897 * f + aFloat4904 * f_297_
			       + aFloat4899 * f_298_);
	fs[2] = (float) (int) (aFloat4900 * f + aFloat4895 * f_297_
			       + aFloat4902 * f_298_);
    }
    
    public void method7302(Class438 class438) {
	method7287(class438.aFloat4864, class438.aFloat4863,
		   class438.aFloat4865);
    }
    
    public void method7303(float f, float f_299_, float f_300_, float f_301_) {
	float f_302_ = (float) Math.cos((double) f_301_);
	float f_303_ = (float) Math.sin((double) f_301_);
	float f_304_ = f_302_ + f * f * (1.0F - f_302_);
	float f_305_ = f_300_ * f_303_ + f_299_ * f * (1.0F - f_302_);
	float f_306_ = -f_299_ * f_303_ + f_300_ * f * (1.0F - f_302_);
	float f_307_ = -f_300_ * f_303_ + f * f_299_ * (1.0F - f_302_);
	float f_308_ = f_302_ + f_299_ * f_299_ * (1.0F - f_302_);
	float f_309_ = f * f_303_ + f_300_ * f_299_ * (1.0F - f_302_);
	float f_310_ = f_299_ * f_303_ + f * f_300_ * (1.0F - f_302_);
	float f_311_ = -f * f_303_ + f_299_ * f_300_ * (1.0F - f_302_);
	float f_312_ = f_302_ + f_300_ * f_300_ * (1.0F - f_302_);
	float f_313_ = aFloat4894;
	float f_314_ = aFloat4893;
	float f_315_ = aFloat4897;
	float f_316_ = aFloat4904;
	float f_317_ = aFloat4900;
	float f_318_ = aFloat4895;
	float f_319_ = aFloat4903;
	float f_320_ = aFloat4901;
	aFloat4894 = f_313_ * f_304_ + f_314_ * f_307_ + aFloat4896 * f_310_;
	aFloat4893 = f_313_ * f_305_ + f_314_ * f_308_ + aFloat4896 * f_311_;
	aFloat4896 = f_313_ * f_306_ + f_314_ * f_309_ + aFloat4896 * f_312_;
	aFloat4897 = f_315_ * f_304_ + f_316_ * f_307_ + aFloat4899 * f_310_;
	aFloat4904 = f_315_ * f_305_ + f_316_ * f_308_ + aFloat4899 * f_311_;
	aFloat4899 = f_315_ * f_306_ + f_316_ * f_309_ + aFloat4899 * f_312_;
	aFloat4900 = f_317_ * f_304_ + f_318_ * f_307_ + aFloat4902 * f_310_;
	aFloat4895 = f_317_ * f_305_ + f_318_ * f_308_ + aFloat4902 * f_311_;
	aFloat4902 = f_317_ * f_306_ + f_318_ * f_309_ + aFloat4902 * f_312_;
	aFloat4903 = f_319_ * f_304_ + f_320_ * f_307_ + aFloat4898 * f_310_;
	aFloat4901 = f_319_ * f_305_ + f_320_ * f_308_ + aFloat4898 * f_311_;
	aFloat4898 = f_319_ * f_306_ + f_320_ * f_309_ + aFloat4898 * f_312_;
    }
    
    public void method7304(float[] fs) {
	float f = fs[0] - aFloat4903;
	float f_321_ = fs[1] - aFloat4901;
	float f_322_ = fs[2] - aFloat4898;
	fs[0] = (float) (int) (aFloat4894 * f + aFloat4893 * f_321_
			       + aFloat4896 * f_322_);
	fs[1] = (float) (int) (aFloat4897 * f + aFloat4904 * f_321_
			       + aFloat4899 * f_322_);
	fs[2] = (float) (int) (aFloat4900 * f + aFloat4895 * f_321_
			       + aFloat4902 * f_322_);
    }
    
    public float[] method7305(float[] fs) {
	fs[0] = aFloat4903;
	fs[1] = aFloat4901;
	fs[2] = aFloat4898;
	return fs;
    }
    
    public void method7306(float f, float f_323_, float f_324_, float f_325_,
			   float f_326_, float f_327_, float f_328_,
			   float f_329_, float f_330_) {
	aFloat4894 = f;
	aFloat4897 = f_325_;
	aFloat4900 = f_328_;
	aFloat4903 = 0.0F;
	aFloat4893 = f_323_;
	aFloat4904 = f_326_;
	aFloat4895 = f_329_;
	aFloat4901 = 0.0F;
	aFloat4896 = f_324_;
	aFloat4899 = f_327_;
	aFloat4902 = f_330_;
	aFloat4898 = 0.0F;
    }
    
    public void method7307(float f, float f_331_, float f_332_, float[] fs) {
	f -= aFloat4903;
	f_331_ -= aFloat4901;
	f_332_ -= aFloat4898;
	fs[0] = (float) (int) (aFloat4894 * f + aFloat4893 * f_331_
			       + aFloat4896 * f_332_);
	fs[1] = (float) (int) (aFloat4897 * f + aFloat4904 * f_331_
			       + aFloat4899 * f_332_);
	fs[2] = (float) (int) (aFloat4900 * f + aFloat4895 * f_331_
			       + aFloat4902 * f_332_);
    }
}
