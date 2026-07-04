/* Class183 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class183
{
    public boolean aBool1971;
    static final float aFloat1972 = 3.1415927F;
    protected boolean aBool1973 = false;
    
    public abstract int method3004();
    
    static void method3005(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			   int i_4_, float[] fs, int i_5_, float f,
			   float[] fs_6_) {
	i -= i_2_;
	i_0_ -= i_3_;
	i_1_ -= i_4_;
	float f_7_
	    = (float) i * fs[0] + (float) i_0_ * fs[1] + (float) i_1_ * fs[2];
	float f_8_
	    = (float) i * fs[3] + (float) i_0_ * fs[4] + (float) i_1_ * fs[5];
	float f_9_
	    = (float) i * fs[6] + (float) i_0_ * fs[7] + (float) i_1_ * fs[8];
	float f_10_ = (float) Math.sqrt((double) (f_7_ * f_7_ + f_8_ * f_8_
						  + f_9_ * f_9_));
	float f_11_
	    = ((float) Math.atan2((double) f_7_, (double) f_9_) / 6.2831855F
	       + 0.5F);
	float f_12_ = ((float) Math.asin((double) (f_8_ / f_10_)) / 3.1415927F
		       + 0.5F + f);
	if (i_5_ == 1) {
	    float f_13_ = f_11_;
	    f_11_ = -f_12_;
	    f_12_ = f_13_;
	} else if (i_5_ == 2) {
	    f_11_ = -f_11_;
	    f_12_ = -f_12_;
	} else if (i_5_ == 3) {
	    float f_14_ = f_11_;
	    f_11_ = f_12_;
	    f_12_ = -f_14_;
	}
	fs_6_[0] = f_11_;
	fs_6_[1] = f_12_;
    }
    
    static void method3006(int i, int i_15_, int i_16_, int i_17_, int i_18_,
			   int i_19_, float[] fs, float f, int i_20_,
			   float f_21_, float[] fs_22_) {
	i -= i_17_;
	i_15_ -= i_18_;
	i_16_ -= i_19_;
	float f_23_ = ((float) i * fs[0] + (float) i_15_ * fs[1]
		       + (float) i_16_ * fs[2]);
	float f_24_ = ((float) i * fs[3] + (float) i_15_ * fs[4]
		       + (float) i_16_ * fs[5]);
	float f_25_ = ((float) i * fs[6] + (float) i_15_ * fs[7]
		       + (float) i_16_ * fs[8]);
	float f_26_
	    = ((float) Math.atan2((double) f_23_, (double) f_25_) / 6.2831855F
	       + 0.5F);
	if (f != 1.0F)
	    f_26_ *= f;
	float f_27_ = f_24_ + 0.5F + f_21_;
	if (i_20_ == 1) {
	    float f_28_ = f_26_;
	    f_26_ = -f_27_;
	    f_27_ = f_28_;
	} else if (i_20_ == 2) {
	    f_26_ = -f_26_;
	    f_27_ = -f_27_;
	} else if (i_20_ == 3) {
	    float f_29_ = f_26_;
	    f_26_ = f_27_;
	    f_27_ = -f_29_;
	}
	fs_22_[0] = f_26_;
	fs_22_[1] = f_27_;
    }
    
    public final void method3007(Class534_Sub18_Sub17 class534_sub18_sub17,
				 int i) {
	if (i != -1) {
	    method3202();
	    if (!method3032())
		method3109();
	    else {
		Class167 class167
		    = class534_sub18_sub17.aClass167Array11875[i];
		Class534_Sub24 class534_sub24 = class167.aClass534_Sub24_1774;
		for (int i_30_ = 0; i_30_ < class167.anInt1772; i_30_++) {
		    short i_31_ = class167.aShortArray1776[i_30_];
		    if (class534_sub24.aBoolArray10555[i_31_]) {
			if (class167.aShortArray1780[i_30_] != -1)
			    method3137(0, 0, 0, 0);
			method3137(class534_sub24.anIntArray10561[i_31_],
				   class167.aShortArray1777[i_30_],
				   class167.aShortArray1778[i_30_],
				   class167.aShortArray1779[i_30_]);
		    }
		}
		method3107();
		method3109();
	    }
	}
    }
    
    static void method3008(int i, int i_32_, int i_33_, int i_34_, int i_35_,
			   int i_36_, int i_37_, float[] fs, int i_38_,
			   float f, float f_39_, float f_40_, float[] fs_41_) {
	i -= i_34_;
	i_32_ -= i_35_;
	i_33_ -= i_36_;
	float f_42_ = ((float) i * fs[0] + (float) i_32_ * fs[1]
		       + (float) i_33_ * fs[2]);
	float f_43_ = ((float) i * fs[3] + (float) i_32_ * fs[4]
		       + (float) i_33_ * fs[5]);
	float f_44_ = ((float) i * fs[6] + (float) i_32_ * fs[7]
		       + (float) i_33_ * fs[8]);
	float f_45_;
	float f_46_;
	if (i_37_ == 0) {
	    f_45_ = f_42_ + f + 0.5F;
	    f_46_ = -f_44_ + f_40_ + 0.5F;
	} else if (i_37_ == 1) {
	    f_45_ = f_42_ + f + 0.5F;
	    f_46_ = f_44_ + f_40_ + 0.5F;
	} else if (i_37_ == 2) {
	    f_45_ = -f_42_ + f + 0.5F;
	    f_46_ = -f_43_ + f_39_ + 0.5F;
	} else if (i_37_ == 3) {
	    f_45_ = f_42_ + f + 0.5F;
	    f_46_ = -f_43_ + f_39_ + 0.5F;
	} else if (i_37_ == 4) {
	    f_45_ = f_44_ + f_40_ + 0.5F;
	    f_46_ = -f_43_ + f_39_ + 0.5F;
	} else {
	    f_45_ = -f_44_ + f_40_ + 0.5F;
	    f_46_ = -f_43_ + f_39_ + 0.5F;
	}
	if (i_38_ == 1) {
	    float f_47_ = f_45_;
	    f_45_ = -f_46_;
	    f_46_ = f_47_;
	} else if (i_38_ == 2) {
	    f_45_ = -f_45_;
	    f_46_ = -f_46_;
	} else if (i_38_ == 3) {
	    float f_48_ = f_45_;
	    f_45_ = f_46_;
	    f_46_ = -f_48_;
	}
	fs_41_[0] = f_45_;
	fs_41_[1] = f_46_;
    }
    
    Class196 method3009(Class187 class187, int[] is, int i) {
	int[] is_49_ = null;
	int[] is_50_ = null;
	int[] is_51_ = null;
	float[][] fs = null;
	if (class187.aShortArray2102 != null) {
	    int i_52_ = class187.anInt2110;
	    int[] is_53_ = new int[i_52_];
	    int[] is_54_ = new int[i_52_];
	    int[] is_55_ = new int[i_52_];
	    int[] is_56_ = new int[i_52_];
	    int[] is_57_ = new int[i_52_];
	    int[] is_58_ = new int[i_52_];
	    for (int i_59_ = 0; i_59_ < i_52_; i_59_++) {
		is_53_[i_59_] = 2147483647;
		is_54_[i_59_] = -2147483647;
		is_55_[i_59_] = 2147483647;
		is_56_[i_59_] = -2147483647;
		is_57_[i_59_] = 2147483647;
		is_58_[i_59_] = -2147483647;
	    }
	    for (int i_60_ = 0; i_60_ < i; i_60_++) {
		int i_61_ = is[i_60_];
		short i_62_ = class187.aShortArray2102[i_61_];
		if (i_62_ > -1 && i_62_ < 32766) {
		    for (int i_63_ = 0; i_63_ < 3; i_63_++) {
			short i_64_;
			if (i_63_ == 0)
			    i_64_ = class187.aShortArray2093[i_61_];
			else if (i_63_ == 1)
			    i_64_ = class187.aShortArray2077[i_61_];
			else
			    i_64_ = class187.aShortArray2095[i_61_];
			int i_65_ = class187.anIntArray2083[i_64_];
			int i_66_ = class187.anIntArray2080[i_64_];
			int i_67_ = class187.anIntArray2113[i_64_];
			if (i_65_ < is_53_[i_62_])
			    is_53_[i_62_] = i_65_;
			if (i_65_ > is_54_[i_62_])
			    is_54_[i_62_] = i_65_;
			if (i_66_ < is_55_[i_62_])
			    is_55_[i_62_] = i_66_;
			if (i_66_ > is_56_[i_62_])
			    is_56_[i_62_] = i_66_;
			if (i_67_ < is_57_[i_62_])
			    is_57_[i_62_] = i_67_;
			if (i_67_ > is_58_[i_62_])
			    is_58_[i_62_] = i_67_;
		    }
		}
	    }
	    is_49_ = new int[i_52_];
	    is_50_ = new int[i_52_];
	    is_51_ = new int[i_52_];
	    fs = new float[i_52_][];
	    for (int i_68_ = 0; i_68_ < i_52_; i_68_++) {
		byte i_69_ = class187.aByteArray2086[i_68_];
		if (i_69_ > 0) {
		    is_49_[i_68_] = (is_53_[i_68_] + is_54_[i_68_]) / 2;
		    is_50_[i_68_] = (is_55_[i_68_] + is_56_[i_68_]) / 2;
		    is_51_[i_68_] = (is_57_[i_68_] + is_58_[i_68_]) / 2;
		    float f;
		    float f_70_;
		    float f_71_;
		    if (i_69_ == 1) {
			int i_72_ = class187.anIntArray2115[i_68_];
			if (i_72_ == 0) {
			    f = 1.0F;
			    f_71_ = 1.0F;
			} else if (i_72_ > 0) {
			    f = 1.0F;
			    f_71_ = (float) i_72_ / 1024.0F;
			} else {
			    f_71_ = 1.0F;
			    f = (float) -i_72_ / 1024.0F;
			}
			f_70_ = 64.0F / (float) class187.anIntArray2116[i_68_];
		    } else if (i_69_ == 2) {
			f = 64.0F / (float) class187.anIntArray2115[i_68_];
			f_70_ = 64.0F / (float) class187.anIntArray2116[i_68_];
			f_71_ = 64.0F / (float) class187.anIntArray2117[i_68_];
		    } else {
			f = (float) class187.anIntArray2115[i_68_] / 1024.0F;
			f_70_
			    = (float) class187.anIntArray2116[i_68_] / 1024.0F;
			f_71_
			    = (float) class187.anIntArray2117[i_68_] / 1024.0F;
		    }
		    fs[i_68_]
			= method3010(class187.aShortArray2108[i_68_],
				     class187.aShortArray2085[i_68_],
				     class187.aShortArray2114[i_68_],
				     class187.aByteArray2121[i_68_] & 0xff, f,
				     f_70_, f_71_);
		}
	    }
	}
	return new Class196(this, is_49_, is_50_, is_51_, fs);
    }
    
    static float[] method3010(int i, int i_73_, int i_74_, int i_75_, float f,
			      float f_76_, float f_77_) {
	float[] fs = new float[9];
	float[] fs_78_ = new float[9];
	float f_79_
	    = (float) Math.cos((double) ((float) i_75_ * 0.024543693F));
	float f_80_
	    = (float) Math.sin((double) ((float) i_75_ * 0.024543693F));
	float f_81_ = 1.0F - f_79_;
	fs[0] = f_79_;
	fs[1] = 0.0F;
	fs[2] = f_80_;
	fs[3] = 0.0F;
	fs[4] = 1.0F;
	fs[5] = 0.0F;
	fs[6] = -f_80_;
	fs[7] = 0.0F;
	fs[8] = f_79_;
	float[] fs_82_ = new float[9];
	float f_83_ = 1.0F;
	float f_84_ = 0.0F;
	f_79_ = (float) i_73_ / 32767.0F;
	f_80_ = -(float) Math.sqrt((double) (1.0F - f_79_ * f_79_));
	f_81_ = 1.0F - f_79_;
	float f_85_ = (float) Math.sqrt((double) (i * i + i_74_ * i_74_));
	if (f_85_ == 0.0F && f_79_ == 0.0F)
	    fs_78_ = fs;
	else {
	    if (f_85_ != 0.0F) {
		f_83_ = (float) -i_74_ / f_85_;
		f_84_ = (float) i / f_85_;
	    }
	    fs_82_[0] = f_79_ + f_83_ * f_83_ * f_81_;
	    fs_82_[1] = f_84_ * f_80_;
	    fs_82_[2] = f_84_ * f_83_ * f_81_;
	    fs_82_[3] = -f_84_ * f_80_;
	    fs_82_[4] = f_79_;
	    fs_82_[5] = f_83_ * f_80_;
	    fs_82_[6] = f_83_ * f_84_ * f_81_;
	    fs_82_[7] = -f_83_ * f_80_;
	    fs_82_[8] = f_79_ + f_84_ * f_84_ * f_81_;
	    fs_78_[0]
		= fs[0] * fs_82_[0] + fs[1] * fs_82_[3] + fs[2] * fs_82_[6];
	    fs_78_[1]
		= fs[0] * fs_82_[1] + fs[1] * fs_82_[4] + fs[2] * fs_82_[7];
	    fs_78_[2]
		= fs[0] * fs_82_[2] + fs[1] * fs_82_[5] + fs[2] * fs_82_[8];
	    fs_78_[3]
		= fs[3] * fs_82_[0] + fs[4] * fs_82_[3] + fs[5] * fs_82_[6];
	    fs_78_[4]
		= fs[3] * fs_82_[1] + fs[4] * fs_82_[4] + fs[5] * fs_82_[7];
	    fs_78_[5]
		= fs[3] * fs_82_[2] + fs[4] * fs_82_[5] + fs[5] * fs_82_[8];
	    fs_78_[6]
		= fs[6] * fs_82_[0] + fs[7] * fs_82_[3] + fs[8] * fs_82_[6];
	    fs_78_[7]
		= fs[6] * fs_82_[1] + fs[7] * fs_82_[4] + fs[8] * fs_82_[7];
	    fs_78_[8]
		= fs[6] * fs_82_[2] + fs[7] * fs_82_[5] + fs[8] * fs_82_[8];
	}
	fs_78_[0] *= f;
	fs_78_[1] *= f;
	fs_78_[2] *= f;
	fs_78_[3] *= f_76_;
	fs_78_[4] *= f_76_;
	fs_78_[5] *= f_76_;
	fs_78_[6] *= f_77_;
	fs_78_[7] *= f_77_;
	fs_78_[8] *= f_77_;
	return fs_78_;
    }
    
    public abstract Class183 method3011(byte i, int i_86_, boolean bool);
    
    public abstract void method3012(int i);
    
    static float[] method3013(int i, int i_87_, int i_88_, int i_89_, float f,
			      float f_90_, float f_91_) {
	float[] fs = new float[9];
	float[] fs_92_ = new float[9];
	float f_93_
	    = (float) Math.cos((double) ((float) i_89_ * 0.024543693F));
	float f_94_
	    = (float) Math.sin((double) ((float) i_89_ * 0.024543693F));
	float f_95_ = 1.0F - f_93_;
	fs[0] = f_93_;
	fs[1] = 0.0F;
	fs[2] = f_94_;
	fs[3] = 0.0F;
	fs[4] = 1.0F;
	fs[5] = 0.0F;
	fs[6] = -f_94_;
	fs[7] = 0.0F;
	fs[8] = f_93_;
	float[] fs_96_ = new float[9];
	float f_97_ = 1.0F;
	float f_98_ = 0.0F;
	f_93_ = (float) i_87_ / 32767.0F;
	f_94_ = -(float) Math.sqrt((double) (1.0F - f_93_ * f_93_));
	f_95_ = 1.0F - f_93_;
	float f_99_ = (float) Math.sqrt((double) (i * i + i_88_ * i_88_));
	if (f_99_ == 0.0F && f_93_ == 0.0F)
	    fs_92_ = fs;
	else {
	    if (f_99_ != 0.0F) {
		f_97_ = (float) -i_88_ / f_99_;
		f_98_ = (float) i / f_99_;
	    }
	    fs_96_[0] = f_93_ + f_97_ * f_97_ * f_95_;
	    fs_96_[1] = f_98_ * f_94_;
	    fs_96_[2] = f_98_ * f_97_ * f_95_;
	    fs_96_[3] = -f_98_ * f_94_;
	    fs_96_[4] = f_93_;
	    fs_96_[5] = f_97_ * f_94_;
	    fs_96_[6] = f_97_ * f_98_ * f_95_;
	    fs_96_[7] = -f_97_ * f_94_;
	    fs_96_[8] = f_93_ + f_98_ * f_98_ * f_95_;
	    fs_92_[0]
		= fs[0] * fs_96_[0] + fs[1] * fs_96_[3] + fs[2] * fs_96_[6];
	    fs_92_[1]
		= fs[0] * fs_96_[1] + fs[1] * fs_96_[4] + fs[2] * fs_96_[7];
	    fs_92_[2]
		= fs[0] * fs_96_[2] + fs[1] * fs_96_[5] + fs[2] * fs_96_[8];
	    fs_92_[3]
		= fs[3] * fs_96_[0] + fs[4] * fs_96_[3] + fs[5] * fs_96_[6];
	    fs_92_[4]
		= fs[3] * fs_96_[1] + fs[4] * fs_96_[4] + fs[5] * fs_96_[7];
	    fs_92_[5]
		= fs[3] * fs_96_[2] + fs[4] * fs_96_[5] + fs[5] * fs_96_[8];
	    fs_92_[6]
		= fs[6] * fs_96_[0] + fs[7] * fs_96_[3] + fs[8] * fs_96_[6];
	    fs_92_[7]
		= fs[6] * fs_96_[1] + fs[7] * fs_96_[4] + fs[8] * fs_96_[7];
	    fs_92_[8]
		= fs[6] * fs_96_[2] + fs[7] * fs_96_[5] + fs[8] * fs_96_[8];
	}
	fs_92_[0] *= f;
	fs_92_[1] *= f;
	fs_92_[2] *= f;
	fs_92_[3] *= f_90_;
	fs_92_[4] *= f_90_;
	fs_92_[5] *= f_90_;
	fs_92_[6] *= f_91_;
	fs_92_[7] *= f_91_;
	fs_92_[8] *= f_91_;
	return fs_92_;
    }
    
    public abstract void method3014();
    
    public abstract void method3015(int i);
    
    public abstract void method3016(int i);
    
    public abstract void method3017(int i);
    
    public abstract void method3018(int i);
    
    public abstract int method3019();
    
    public abstract void method3020();
    
    public abstract void method3021(int i, int i_100_, int i_101_);
    
    public abstract void method3022(int i, int i_102_, Class151 class151,
				    Class151 class151_103_, int i_104_,
				    int i_105_, int i_106_);
    
    public abstract void method3023(int i, int i_107_, int i_108_);
    
    public abstract Class158[] method3024();
    
    public abstract void method3025(int i, int i_109_, int i_110_);
    
    public abstract int method3026();
    
    public abstract boolean method3027();
    
    public final void method3028
	(Class534_Sub18_Sub17 class534_sub18_sub17, int i,
	 Class534_Sub18_Sub17 class534_sub18_sub17_111_, int i_112_,
	 int i_113_, int i_114_,
	 Class534_Sub18_Sub17 class534_sub18_sub17_115_, int i_116_,
	 Class534_Sub18_Sub17 class534_sub18_sub17_117_, int i_118_,
	 int i_119_, int i_120_, boolean[] bools, boolean bool) {
	if (i != -1) {
	    if (bools == null || i_116_ == -1)
		method3061(class534_sub18_sub17, i, class534_sub18_sub17_111_,
			   i_112_, i_113_, i_114_, 0, bool);
	    else {
		method3202();
		if (!method3032())
		    method3109();
		else {
		    Class167 class167
			= class534_sub18_sub17.aClass167Array11875[i];
		    Class534_Sub24 class534_sub24
			= class167.aClass534_Sub24_1774;
		    Class167 class167_121_ = null;
		    if (class534_sub18_sub17_111_ != null) {
			class167_121_ = (class534_sub18_sub17_111_
					 .aClass167Array11875[i_112_]);
			if (class167_121_.aClass534_Sub24_1774
			    != class534_sub24)
			    class167_121_ = null;
		    }
		    method3030(class534_sub24, class167, class167_121_, i_113_,
			       i_114_, 0, bools, false, bool, 65535, null);
		    Class167 class167_122_ = (class534_sub18_sub17_115_
					      .aClass167Array11875[i_116_]);
		    Class167 class167_123_ = null;
		    if (class534_sub18_sub17_117_ != null) {
			class167_123_ = (class534_sub18_sub17_117_
					 .aClass167Array11875[i_118_]);
			if (class167_123_.aClass534_Sub24_1774
			    != class534_sub24)
			    class167_123_ = null;
		    }
		    method3033(0, new int[0], 0, 0, 0, 0, bool);
		    method3030(class167_122_.aClass534_Sub24_1774,
			       class167_122_, class167_123_, i_119_, i_120_, 0,
			       bools, true, bool, 65535, null);
		    method3107();
		    method3109();
		}
	    }
	}
    }
    
    public final void method3029(Class534_Sub18_Sub17 class534_sub18_sub17,
				 int i) {
	if (i != -1) {
	    method3202();
	    if (!method3032())
		method3109();
	    else {
		Class167 class167
		    = class534_sub18_sub17.aClass167Array11875[i];
		Class534_Sub24 class534_sub24 = class167.aClass534_Sub24_1774;
		for (int i_124_ = 0; i_124_ < class167.anInt1772; i_124_++) {
		    short i_125_ = class167.aShortArray1776[i_124_];
		    if (class534_sub24.aBoolArray10555[i_125_]) {
			if (class167.aShortArray1780[i_124_] != -1)
			    method3137(0, 0, 0, 0);
			method3137(class534_sub24.anIntArray10561[i_125_],
				   class167.aShortArray1777[i_124_],
				   class167.aShortArray1778[i_124_],
				   class167.aShortArray1779[i_124_]);
		    }
		}
		method3107();
		method3109();
	    }
	}
    }
    
    void method3030(Class534_Sub24 class534_sub24, Class167 class167,
		    Class167 class167_126_, int i, int i_127_, int i_128_,
		    boolean[] bools, boolean bool, boolean bool_129_,
		    int i_130_, int[] is) {
	if (class167_126_ == null || i == 0) {
	    for (int i_131_ = 0; i_131_ < class167.anInt1772; i_131_++) {
		short i_132_ = class167.aShortArray1776[i_131_];
		if (bools == null || bools[i_132_] == bool
		    || class534_sub24.anIntArray10561[i_132_] == 0) {
		    short i_133_ = class167.aShortArray1780[i_131_];
		    if (i_133_ != -1)
			method3135(0,
				   class534_sub24.anIntArrayArray10559[i_133_],
				   0, 0, 0, i_128_, bool_129_,
				   (i_130_
				    & class534_sub24.anIntArray10553[i_133_]),
				   is);
		    method3135(class534_sub24.anIntArray10561[i_132_],
			       class534_sub24.anIntArrayArray10559[i_132_],
			       class167.aShortArray1777[i_131_],
			       class167.aShortArray1778[i_131_],
			       class167.aShortArray1779[i_131_], i_128_,
			       bool_129_,
			       i_130_ & class534_sub24.anIntArray10553[i_132_],
			       is);
		}
	    }
	} else {
	    int i_134_ = 0;
	    int i_135_ = 0;
	    for (int i_136_ = 0;
		 i_136_ < class534_sub24.anInt10560 * -782210841; i_136_++) {
		boolean bool_137_ = false;
		if (i_134_ < class167.anInt1772
		    && class167.aShortArray1776[i_134_] == i_136_)
		    bool_137_ = true;
		boolean bool_138_ = false;
		if (i_135_ < class167_126_.anInt1772
		    && class167_126_.aShortArray1776[i_135_] == i_136_)
		    bool_138_ = true;
		if (bool_137_ || bool_138_) {
		    if (bools != null && bools[i_136_] != bool
			&& class534_sub24.anIntArray10561[i_136_] != 0) {
			if (bool_137_)
			    i_134_++;
			if (bool_138_)
			    i_135_++;
		    } else {
			int i_139_ = 0;
			int i_140_ = class534_sub24.anIntArray10561[i_136_];
			if (i_140_ == 3 || i_140_ == 10)
			    i_139_ = 128;
			int i_141_;
			int i_142_;
			int i_143_;
			short i_144_;
			byte i_145_;
			if (bool_137_) {
			    i_141_ = class167.aShortArray1777[i_134_];
			    i_142_ = class167.aShortArray1778[i_134_];
			    i_143_ = class167.aShortArray1779[i_134_];
			    i_144_ = class167.aShortArray1780[i_134_];
			    i_145_ = class167.aByteArray1787[i_134_];
			    i_134_++;
			} else {
			    i_141_ = i_139_;
			    i_142_ = i_139_;
			    i_143_ = i_139_;
			    i_144_ = (short) -1;
			    i_145_ = (byte) 0;
			}
			int i_146_;
			int i_147_;
			int i_148_;
			short i_149_;
			byte i_150_;
			if (bool_138_) {
			    i_146_ = class167_126_.aShortArray1777[i_135_];
			    i_147_ = class167_126_.aShortArray1778[i_135_];
			    i_148_ = class167_126_.aShortArray1779[i_135_];
			    i_149_ = class167_126_.aShortArray1780[i_135_];
			    i_150_ = class167_126_.aByteArray1787[i_135_];
			    i_135_++;
			} else {
			    i_146_ = i_139_;
			    i_147_ = i_139_;
			    i_148_ = i_139_;
			    i_149_ = (short) -1;
			    i_150_ = (byte) 0;
			}
			int i_151_;
			int i_152_;
			int i_153_;
			if ((i_145_ & 0x2) != 0 || (i_150_ & 0x1) != 0) {
			    i_151_ = i_141_;
			    i_152_ = i_142_;
			    i_153_ = i_143_;
			} else if (i_140_ == 2) {
			    int i_154_ = i_146_ - i_141_ & 0x3fff;
			    int i_155_ = i_147_ - i_142_ & 0x3fff;
			    int i_156_ = i_148_ - i_143_ & 0x3fff;
			    if (i_154_ >= 8192)
				i_154_ -= 16384;
			    if (i_155_ >= 8192)
				i_155_ -= 16384;
			    if (i_156_ >= 8192)
				i_156_ -= 16384;
			    i_151_ = i_141_ + i_154_ * i / i_127_ & 0x3fff;
			    i_152_ = i_142_ + i_155_ * i / i_127_ & 0x3fff;
			    i_153_ = i_143_ + i_156_ * i / i_127_ & 0x3fff;
			} else if (i_140_ == 9) {
			    int i_157_ = i_146_ - i_141_ & 0x3fff;
			    if (i_157_ >= 8192)
				i_157_ -= 16384;
			    i_151_ = i_141_ + i_157_ * i / i_127_ & 0x3fff;
			    i_153_ = 0;
			    i_152_ = 0;
			} else if (i_140_ == 7) {
			    int i_158_ = i_146_ - i_141_ & 0x3f;
			    if (i_158_ >= 32)
				i_158_ -= 64;
			    i_151_ = i_141_ + i_158_ * i / i_127_ & 0x3f;
			    i_152_ = i_142_ + (i_147_ - i_142_) * i / i_127_;
			    i_153_ = i_143_ + (i_148_ - i_143_) * i / i_127_;
			} else {
			    i_151_ = i_141_ + (i_146_ - i_141_) * i / i_127_;
			    i_152_ = i_142_ + (i_147_ - i_142_) * i / i_127_;
			    i_153_ = i_143_ + (i_148_ - i_143_) * i / i_127_;
			}
			if (i_144_ != -1)
			    method3135(0,
				       (class534_sub24.anIntArrayArray10559
					[i_144_]),
				       0, 0, 0, i_128_, bool_129_,
				       i_130_ & (class534_sub24.anIntArray10553
						 [i_144_]),
				       is);
			else if (i_149_ != -1)
			    method3135(0,
				       (class534_sub24.anIntArrayArray10559
					[i_149_]),
				       0, 0, 0, i_128_, bool_129_,
				       i_130_ & (class534_sub24.anIntArray10553
						 [i_149_]),
				       is);
			method3135(i_140_,
				   class534_sub24.anIntArrayArray10559[i_136_],
				   i_151_, i_152_, i_153_, i_128_, bool_129_,
				   (i_130_
				    & class534_sub24.anIntArray10553[i_136_]),
				   is);
		    }
		}
	    }
	}
    }
    
    abstract void method3031(int i, int[] is, int i_159_, int i_160_,
			     int i_161_, int i_162_, boolean bool);
    
    abstract boolean method3032();
    
    abstract void method3033(int i, int[] is, int i_163_, int i_164_,
			     int i_165_, int i_166_, boolean bool);
    
    public abstract void method3034(Class446 class446, Class194 class194,
				    int i);
    
    public abstract void method3035(Class446 class446, Class194 class194,
				    int i);
    
    abstract void method3036();
    
    public abstract void method3037(Class446 class446, int i, boolean bool);
    
    public abstract int method3038();
    
    public abstract boolean method3039(int i, int i_167_, Class446 class446,
				       boolean bool, int i_168_);
    
    public abstract Class534_Sub18_Sub16 method3040
	(Class534_Sub18_Sub16 class534_sub18_sub16);
    
    public abstract int method3041();
    
    public abstract int method3042();
    
    public abstract int method3043();
    
    public abstract void method3044();
    
    public abstract int method3045();
    
    public abstract int method3046();
    
    public abstract int method3047();
    
    public abstract int method3048();
    
    public abstract int method3049();
    
    public abstract void method3050();
    
    public abstract void method3051(int i);
    
    public abstract int method3052();
    
    public abstract int method3053();
    
    public abstract int method3054();
    
    public abstract byte[] method3055();
    
    public abstract void method3056(short i, short i_169_);
    
    abstract void method3057();
    
    public abstract void method3058(int i, int i_170_, int i_171_, int i_172_);
    
    public abstract boolean method3059();
    
    public abstract boolean method3060();
    
    public final void method3061
	(Class534_Sub18_Sub17 class534_sub18_sub17, int i,
	 Class534_Sub18_Sub17 class534_sub18_sub17_173_, int i_174_,
	 int i_175_, int i_176_, int i_177_, boolean bool) {
	if (i != -1) {
	    method3202();
	    if (!method3032())
		method3109();
	    else {
		Class167 class167
		    = class534_sub18_sub17.aClass167Array11875[i];
		Class534_Sub24 class534_sub24 = class167.aClass534_Sub24_1774;
		Class167 class167_178_ = null;
		if (class534_sub18_sub17_173_ != null) {
		    class167_178_ = (class534_sub18_sub17_173_
				     .aClass167Array11875[i_174_]);
		    if (class167_178_.aClass534_Sub24_1774 != class534_sub24)
			class167_178_ = null;
		}
		method3030(class534_sub24, class167, class167_178_, i_175_,
			   i_176_, i_177_, null, false, bool, 65535, null);
		method3107();
		method3109();
	    }
	}
    }
    
    public abstract boolean method3062();
    
    public abstract void method3063(Class183 class183_179_, int i, int i_180_,
				    int i_181_, boolean bool);
    
    public abstract int method3064();
    
    public abstract Class158[] method3065();
    
    abstract boolean method3066();
    
    public abstract void method3067(Class183 class183_182_, int i, int i_183_,
				    int i_184_, boolean bool);
    
    abstract void method3068(int i, int[] is, int i_185_, int i_186_,
			     int i_187_, boolean bool, int i_188_,
			     int[] is_189_);
    
    public abstract void method3069(Class183 class183_190_, int i, int i_191_,
				    int i_192_, boolean bool);
    
    public abstract Class183 method3070(byte i, int i_193_, boolean bool);
    
    public abstract Class183 method3071(byte i, int i_194_, boolean bool);
    
    public abstract int method3072();
    
    public abstract void method3073(Class446 class446);
    
    public abstract void method3074(int i);
    
    public abstract void method3075(int i);
    
    public abstract void method3076();
    
    public abstract void method3077(Class183 class183_195_, int i, int i_196_,
				    int i_197_, boolean bool);
    
    public abstract int method3078();
    
    public abstract void method3079(int i);
    
    public abstract void method3080(int i);
    
    public abstract void method3081(int i);
    
    static void method3082(int i, int i_198_, int i_199_, int i_200_,
			   int i_201_, int i_202_, int i_203_, float[] fs,
			   int i_204_, float f, float f_205_, float f_206_,
			   float[] fs_207_) {
	i -= i_200_;
	i_198_ -= i_201_;
	i_199_ -= i_202_;
	float f_208_ = ((float) i * fs[0] + (float) i_198_ * fs[1]
			+ (float) i_199_ * fs[2]);
	float f_209_ = ((float) i * fs[3] + (float) i_198_ * fs[4]
			+ (float) i_199_ * fs[5]);
	float f_210_ = ((float) i * fs[6] + (float) i_198_ * fs[7]
			+ (float) i_199_ * fs[8]);
	float f_211_;
	float f_212_;
	if (i_203_ == 0) {
	    f_211_ = f_208_ + f + 0.5F;
	    f_212_ = -f_210_ + f_206_ + 0.5F;
	} else if (i_203_ == 1) {
	    f_211_ = f_208_ + f + 0.5F;
	    f_212_ = f_210_ + f_206_ + 0.5F;
	} else if (i_203_ == 2) {
	    f_211_ = -f_208_ + f + 0.5F;
	    f_212_ = -f_209_ + f_205_ + 0.5F;
	} else if (i_203_ == 3) {
	    f_211_ = f_208_ + f + 0.5F;
	    f_212_ = -f_209_ + f_205_ + 0.5F;
	} else if (i_203_ == 4) {
	    f_211_ = f_210_ + f_206_ + 0.5F;
	    f_212_ = -f_209_ + f_205_ + 0.5F;
	} else {
	    f_211_ = -f_210_ + f_206_ + 0.5F;
	    f_212_ = -f_209_ + f_205_ + 0.5F;
	}
	if (i_204_ == 1) {
	    float f_213_ = f_211_;
	    f_211_ = -f_212_;
	    f_212_ = f_213_;
	} else if (i_204_ == 2) {
	    f_211_ = -f_211_;
	    f_212_ = -f_212_;
	} else if (i_204_ == 3) {
	    float f_214_ = f_211_;
	    f_211_ = f_212_;
	    f_212_ = -f_214_;
	}
	fs_207_[0] = f_211_;
	fs_207_[1] = f_212_;
    }
    
    public abstract void method3083(int i);
    
    public abstract void method3084(int i);
    
    public abstract int method3085();
    
    public abstract void method3086();
    
    public abstract int method3087();
    
    public abstract void method3088(byte i, byte[] is);
    
    static float[] method3089(int i, int i_215_, int i_216_, int i_217_,
			      float f, float f_218_, float f_219_) {
	float[] fs = new float[9];
	float[] fs_220_ = new float[9];
	float f_221_
	    = (float) Math.cos((double) ((float) i_217_ * 0.024543693F));
	float f_222_
	    = (float) Math.sin((double) ((float) i_217_ * 0.024543693F));
	float f_223_ = 1.0F - f_221_;
	fs[0] = f_221_;
	fs[1] = 0.0F;
	fs[2] = f_222_;
	fs[3] = 0.0F;
	fs[4] = 1.0F;
	fs[5] = 0.0F;
	fs[6] = -f_222_;
	fs[7] = 0.0F;
	fs[8] = f_221_;
	float[] fs_224_ = new float[9];
	float f_225_ = 1.0F;
	float f_226_ = 0.0F;
	f_221_ = (float) i_215_ / 32767.0F;
	f_222_ = -(float) Math.sqrt((double) (1.0F - f_221_ * f_221_));
	f_223_ = 1.0F - f_221_;
	float f_227_ = (float) Math.sqrt((double) (i * i + i_216_ * i_216_));
	if (f_227_ == 0.0F && f_221_ == 0.0F)
	    fs_220_ = fs;
	else {
	    if (f_227_ != 0.0F) {
		f_225_ = (float) -i_216_ / f_227_;
		f_226_ = (float) i / f_227_;
	    }
	    fs_224_[0] = f_221_ + f_225_ * f_225_ * f_223_;
	    fs_224_[1] = f_226_ * f_222_;
	    fs_224_[2] = f_226_ * f_225_ * f_223_;
	    fs_224_[3] = -f_226_ * f_222_;
	    fs_224_[4] = f_221_;
	    fs_224_[5] = f_225_ * f_222_;
	    fs_224_[6] = f_225_ * f_226_ * f_223_;
	    fs_224_[7] = -f_225_ * f_222_;
	    fs_224_[8] = f_221_ + f_226_ * f_226_ * f_223_;
	    fs_220_[0]
		= fs[0] * fs_224_[0] + fs[1] * fs_224_[3] + fs[2] * fs_224_[6];
	    fs_220_[1]
		= fs[0] * fs_224_[1] + fs[1] * fs_224_[4] + fs[2] * fs_224_[7];
	    fs_220_[2]
		= fs[0] * fs_224_[2] + fs[1] * fs_224_[5] + fs[2] * fs_224_[8];
	    fs_220_[3]
		= fs[3] * fs_224_[0] + fs[4] * fs_224_[3] + fs[5] * fs_224_[6];
	    fs_220_[4]
		= fs[3] * fs_224_[1] + fs[4] * fs_224_[4] + fs[5] * fs_224_[7];
	    fs_220_[5]
		= fs[3] * fs_224_[2] + fs[4] * fs_224_[5] + fs[5] * fs_224_[8];
	    fs_220_[6]
		= fs[6] * fs_224_[0] + fs[7] * fs_224_[3] + fs[8] * fs_224_[6];
	    fs_220_[7]
		= fs[6] * fs_224_[1] + fs[7] * fs_224_[4] + fs[8] * fs_224_[7];
	    fs_220_[8]
		= fs[6] * fs_224_[2] + fs[7] * fs_224_[5] + fs[8] * fs_224_[8];
	}
	fs_220_[0] *= f;
	fs_220_[1] *= f;
	fs_220_[2] *= f;
	fs_220_[3] *= f_218_;
	fs_220_[4] *= f_218_;
	fs_220_[5] *= f_218_;
	fs_220_[6] *= f_219_;
	fs_220_[7] *= f_219_;
	fs_220_[8] *= f_219_;
	return fs_220_;
    }
    
    public abstract boolean method3090();
    
    public abstract void method3091(int i, int i_228_, Class151 class151,
				    Class151 class151_229_, int i_230_,
				    int i_231_, int i_232_);
    
    void method3092(Class534_Sub24 class534_sub24, Class167 class167,
		    Class167 class167_233_, int i, int i_234_, int i_235_,
		    boolean[] bools, boolean bool, boolean bool_236_,
		    int i_237_, int[] is) {
	if (class167_233_ == null || i == 0) {
	    for (int i_238_ = 0; i_238_ < class167.anInt1772; i_238_++) {
		short i_239_ = class167.aShortArray1776[i_238_];
		if (bools == null || bools[i_239_] == bool
		    || class534_sub24.anIntArray10561[i_239_] == 0) {
		    short i_240_ = class167.aShortArray1780[i_238_];
		    if (i_240_ != -1)
			method3135(0,
				   class534_sub24.anIntArrayArray10559[i_240_],
				   0, 0, 0, i_235_, bool_236_,
				   (i_237_
				    & class534_sub24.anIntArray10553[i_240_]),
				   is);
		    method3135(class534_sub24.anIntArray10561[i_239_],
			       class534_sub24.anIntArrayArray10559[i_239_],
			       class167.aShortArray1777[i_238_],
			       class167.aShortArray1778[i_238_],
			       class167.aShortArray1779[i_238_], i_235_,
			       bool_236_,
			       i_237_ & class534_sub24.anIntArray10553[i_239_],
			       is);
		}
	    }
	} else {
	    int i_241_ = 0;
	    int i_242_ = 0;
	    for (int i_243_ = 0;
		 i_243_ < class534_sub24.anInt10560 * -782210841; i_243_++) {
		boolean bool_244_ = false;
		if (i_241_ < class167.anInt1772
		    && class167.aShortArray1776[i_241_] == i_243_)
		    bool_244_ = true;
		boolean bool_245_ = false;
		if (i_242_ < class167_233_.anInt1772
		    && class167_233_.aShortArray1776[i_242_] == i_243_)
		    bool_245_ = true;
		if (bool_244_ || bool_245_) {
		    if (bools != null && bools[i_243_] != bool
			&& class534_sub24.anIntArray10561[i_243_] != 0) {
			if (bool_244_)
			    i_241_++;
			if (bool_245_)
			    i_242_++;
		    } else {
			int i_246_ = 0;
			int i_247_ = class534_sub24.anIntArray10561[i_243_];
			if (i_247_ == 3 || i_247_ == 10)
			    i_246_ = 128;
			int i_248_;
			int i_249_;
			int i_250_;
			short i_251_;
			byte i_252_;
			if (bool_244_) {
			    i_248_ = class167.aShortArray1777[i_241_];
			    i_249_ = class167.aShortArray1778[i_241_];
			    i_250_ = class167.aShortArray1779[i_241_];
			    i_251_ = class167.aShortArray1780[i_241_];
			    i_252_ = class167.aByteArray1787[i_241_];
			    i_241_++;
			} else {
			    i_248_ = i_246_;
			    i_249_ = i_246_;
			    i_250_ = i_246_;
			    i_251_ = (short) -1;
			    i_252_ = (byte) 0;
			}
			int i_253_;
			int i_254_;
			int i_255_;
			short i_256_;
			byte i_257_;
			if (bool_245_) {
			    i_253_ = class167_233_.aShortArray1777[i_242_];
			    i_254_ = class167_233_.aShortArray1778[i_242_];
			    i_255_ = class167_233_.aShortArray1779[i_242_];
			    i_256_ = class167_233_.aShortArray1780[i_242_];
			    i_257_ = class167_233_.aByteArray1787[i_242_];
			    i_242_++;
			} else {
			    i_253_ = i_246_;
			    i_254_ = i_246_;
			    i_255_ = i_246_;
			    i_256_ = (short) -1;
			    i_257_ = (byte) 0;
			}
			int i_258_;
			int i_259_;
			int i_260_;
			if ((i_252_ & 0x2) != 0 || (i_257_ & 0x1) != 0) {
			    i_258_ = i_248_;
			    i_259_ = i_249_;
			    i_260_ = i_250_;
			} else if (i_247_ == 2) {
			    int i_261_ = i_253_ - i_248_ & 0x3fff;
			    int i_262_ = i_254_ - i_249_ & 0x3fff;
			    int i_263_ = i_255_ - i_250_ & 0x3fff;
			    if (i_261_ >= 8192)
				i_261_ -= 16384;
			    if (i_262_ >= 8192)
				i_262_ -= 16384;
			    if (i_263_ >= 8192)
				i_263_ -= 16384;
			    i_258_ = i_248_ + i_261_ * i / i_234_ & 0x3fff;
			    i_259_ = i_249_ + i_262_ * i / i_234_ & 0x3fff;
			    i_260_ = i_250_ + i_263_ * i / i_234_ & 0x3fff;
			} else if (i_247_ == 9) {
			    int i_264_ = i_253_ - i_248_ & 0x3fff;
			    if (i_264_ >= 8192)
				i_264_ -= 16384;
			    i_258_ = i_248_ + i_264_ * i / i_234_ & 0x3fff;
			    i_260_ = 0;
			    i_259_ = 0;
			} else if (i_247_ == 7) {
			    int i_265_ = i_253_ - i_248_ & 0x3f;
			    if (i_265_ >= 32)
				i_265_ -= 64;
			    i_258_ = i_248_ + i_265_ * i / i_234_ & 0x3f;
			    i_259_ = i_249_ + (i_254_ - i_249_) * i / i_234_;
			    i_260_ = i_250_ + (i_255_ - i_250_) * i / i_234_;
			} else {
			    i_258_ = i_248_ + (i_253_ - i_248_) * i / i_234_;
			    i_259_ = i_249_ + (i_254_ - i_249_) * i / i_234_;
			    i_260_ = i_250_ + (i_255_ - i_250_) * i / i_234_;
			}
			if (i_251_ != -1)
			    method3135(0,
				       (class534_sub24.anIntArrayArray10559
					[i_251_]),
				       0, 0, 0, i_235_, bool_236_,
				       i_237_ & (class534_sub24.anIntArray10553
						 [i_251_]),
				       is);
			else if (i_256_ != -1)
			    method3135(0,
				       (class534_sub24.anIntArrayArray10559
					[i_256_]),
				       0, 0, 0, i_235_, bool_236_,
				       i_237_ & (class534_sub24.anIntArray10553
						 [i_256_]),
				       is);
			method3135(i_247_,
				   class534_sub24.anIntArrayArray10559[i_243_],
				   i_258_, i_259_, i_260_, i_235_, bool_236_,
				   (i_237_
				    & class534_sub24.anIntArray10553[i_243_]),
				   is);
		    }
		}
	    }
	}
    }
    
    public abstract void method3093(int i, int i_266_, Class151 class151,
				    Class151 class151_267_, int i_268_,
				    int i_269_, int i_270_);
    
    public abstract void method3094();
    
    abstract void method3095(int i, int[] is, int i_271_, int i_272_,
			     int i_273_, boolean bool, int i_274_,
			     int[] is_275_);
    
    Class196 method3096(Class187 class187, int[] is, int i) {
	int[] is_276_ = null;
	int[] is_277_ = null;
	int[] is_278_ = null;
	float[][] fs = null;
	if (class187.aShortArray2102 != null) {
	    int i_279_ = class187.anInt2110;
	    int[] is_280_ = new int[i_279_];
	    int[] is_281_ = new int[i_279_];
	    int[] is_282_ = new int[i_279_];
	    int[] is_283_ = new int[i_279_];
	    int[] is_284_ = new int[i_279_];
	    int[] is_285_ = new int[i_279_];
	    for (int i_286_ = 0; i_286_ < i_279_; i_286_++) {
		is_280_[i_286_] = 2147483647;
		is_281_[i_286_] = -2147483647;
		is_282_[i_286_] = 2147483647;
		is_283_[i_286_] = -2147483647;
		is_284_[i_286_] = 2147483647;
		is_285_[i_286_] = -2147483647;
	    }
	    for (int i_287_ = 0; i_287_ < i; i_287_++) {
		int i_288_ = is[i_287_];
		short i_289_ = class187.aShortArray2102[i_288_];
		if (i_289_ > -1 && i_289_ < 32766) {
		    for (int i_290_ = 0; i_290_ < 3; i_290_++) {
			short i_291_;
			if (i_290_ == 0)
			    i_291_ = class187.aShortArray2093[i_288_];
			else if (i_290_ == 1)
			    i_291_ = class187.aShortArray2077[i_288_];
			else
			    i_291_ = class187.aShortArray2095[i_288_];
			int i_292_ = class187.anIntArray2083[i_291_];
			int i_293_ = class187.anIntArray2080[i_291_];
			int i_294_ = class187.anIntArray2113[i_291_];
			if (i_292_ < is_280_[i_289_])
			    is_280_[i_289_] = i_292_;
			if (i_292_ > is_281_[i_289_])
			    is_281_[i_289_] = i_292_;
			if (i_293_ < is_282_[i_289_])
			    is_282_[i_289_] = i_293_;
			if (i_293_ > is_283_[i_289_])
			    is_283_[i_289_] = i_293_;
			if (i_294_ < is_284_[i_289_])
			    is_284_[i_289_] = i_294_;
			if (i_294_ > is_285_[i_289_])
			    is_285_[i_289_] = i_294_;
		    }
		}
	    }
	    is_276_ = new int[i_279_];
	    is_277_ = new int[i_279_];
	    is_278_ = new int[i_279_];
	    fs = new float[i_279_][];
	    for (int i_295_ = 0; i_295_ < i_279_; i_295_++) {
		byte i_296_ = class187.aByteArray2086[i_295_];
		if (i_296_ > 0) {
		    is_276_[i_295_] = (is_280_[i_295_] + is_281_[i_295_]) / 2;
		    is_277_[i_295_] = (is_282_[i_295_] + is_283_[i_295_]) / 2;
		    is_278_[i_295_] = (is_284_[i_295_] + is_285_[i_295_]) / 2;
		    float f;
		    float f_297_;
		    float f_298_;
		    if (i_296_ == 1) {
			int i_299_ = class187.anIntArray2115[i_295_];
			if (i_299_ == 0) {
			    f = 1.0F;
			    f_298_ = 1.0F;
			} else if (i_299_ > 0) {
			    f = 1.0F;
			    f_298_ = (float) i_299_ / 1024.0F;
			} else {
			    f_298_ = 1.0F;
			    f = (float) -i_299_ / 1024.0F;
			}
			f_297_
			    = 64.0F / (float) class187.anIntArray2116[i_295_];
		    } else if (i_296_ == 2) {
			f = 64.0F / (float) class187.anIntArray2115[i_295_];
			f_297_
			    = 64.0F / (float) class187.anIntArray2116[i_295_];
			f_298_
			    = 64.0F / (float) class187.anIntArray2117[i_295_];
		    } else {
			f = (float) class187.anIntArray2115[i_295_] / 1024.0F;
			f_297_ = ((float) class187.anIntArray2116[i_295_]
				  / 1024.0F);
			f_298_ = ((float) class187.anIntArray2117[i_295_]
				  / 1024.0F);
		    }
		    fs[i_295_]
			= method3010(class187.aShortArray2108[i_295_],
				     class187.aShortArray2085[i_295_],
				     class187.aShortArray2114[i_295_],
				     class187.aByteArray2121[i_295_] & 0xff, f,
				     f_297_, f_298_);
		}
	    }
	}
	return new Class196(this, is_276_, is_277_, is_278_, fs);
    }
    
    public abstract Class534_Sub18_Sub16 method3097
	(Class534_Sub18_Sub16 class534_sub18_sub16);
    
    public abstract void method3098(int i, int i_300_, int i_301_);
    
    abstract void method3099(int i, int[] is, int i_302_, int i_303_,
			     int i_304_, int i_305_, boolean bool);
    
    abstract void method3100(int i, int[] is, int i_306_, int i_307_,
			     int i_308_, int i_309_, boolean bool);
    
    public abstract int method3101();
    
    abstract void method3102(int i, int[] is, int i_310_, int i_311_,
			     int i_312_, boolean bool, int i_313_,
			     int[] is_314_);
    
    public abstract void method3103(int i);
    
    abstract void method3104(int i, int i_315_, int i_316_, int i_317_);
    
    public abstract void method3105(Class446 class446, int i, boolean bool);
    
    abstract void method3106();
    
    Class183() {
	aBool1971 = true;
    }
    
    abstract void method3107();
    
    public abstract boolean method3108(int i, int i_318_, Class446 class446,
				       boolean bool, int i_319_);
    
    abstract void method3109();
    
    public abstract boolean method3110(int i, int i_320_, Class446 class446,
				       boolean bool, int i_321_);
    
    public abstract boolean method3111(int i, int i_322_, Class446 class446,
				       boolean bool, int i_323_);
    
    public abstract void method3112(int i);
    
    public abstract void method3113(Class446 class446);
    
    public final void method3114
	(Class534_Sub18_Sub17 class534_sub18_sub17, int i,
	 Class534_Sub18_Sub17 class534_sub18_sub17_324_, int i_325_,
	 int i_326_, int i_327_,
	 Class534_Sub18_Sub17 class534_sub18_sub17_328_, int i_329_,
	 Class534_Sub18_Sub17 class534_sub18_sub17_330_, int i_331_,
	 int i_332_, int i_333_, boolean[] bools, boolean bool) {
	if (i != -1) {
	    if (bools == null || i_329_ == -1)
		method3061(class534_sub18_sub17, i, class534_sub18_sub17_324_,
			   i_325_, i_326_, i_327_, 0, bool);
	    else {
		method3202();
		if (!method3032())
		    method3109();
		else {
		    Class167 class167
			= class534_sub18_sub17.aClass167Array11875[i];
		    Class534_Sub24 class534_sub24
			= class167.aClass534_Sub24_1774;
		    Class167 class167_334_ = null;
		    if (class534_sub18_sub17_324_ != null) {
			class167_334_ = (class534_sub18_sub17_324_
					 .aClass167Array11875[i_325_]);
			if (class167_334_.aClass534_Sub24_1774
			    != class534_sub24)
			    class167_334_ = null;
		    }
		    method3030(class534_sub24, class167, class167_334_, i_326_,
			       i_327_, 0, bools, false, bool, 65535, null);
		    Class167 class167_335_ = (class534_sub18_sub17_328_
					      .aClass167Array11875[i_329_]);
		    Class167 class167_336_ = null;
		    if (class534_sub18_sub17_330_ != null) {
			class167_336_ = (class534_sub18_sub17_330_
					 .aClass167Array11875[i_331_]);
			if (class167_336_.aClass534_Sub24_1774
			    != class534_sub24)
			    class167_336_ = null;
		    }
		    method3033(0, new int[0], 0, 0, 0, 0, bool);
		    method3030(class167_335_.aClass534_Sub24_1774,
			       class167_335_, class167_336_, i_332_, i_333_, 0,
			       bools, true, bool, 65535, null);
		    method3107();
		    method3109();
		}
	    }
	}
    }
    
    void method3115(Class151 class151, int i, int i_337_, int i_338_,
		    int i_339_, int i_340_, int i_341_, int i_342_) {
	boolean bool = false;
	boolean bool_343_ = false;
	boolean bool_344_ = false;
	int i_345_ = -i_339_ / 2;
	int i_346_ = -i_340_ / 2;
	int i_347_
	    = class151.method2521(i + i_345_, i_338_ + i_346_, -1338198686);
	int i_348_ = i_339_ / 2;
	int i_349_ = -i_340_ / 2;
	int i_350_
	    = class151.method2521(i + i_348_, i_338_ + i_349_, -1605266274);
	int i_351_ = -i_339_ / 2;
	int i_352_ = i_340_ / 2;
	int i_353_
	    = class151.method2521(i + i_351_, i_338_ + i_352_, -1765126314);
	int i_354_ = i_339_ / 2;
	int i_355_ = i_340_ / 2;
	int i_356_
	    = class151.method2521(i + i_354_, i_338_ + i_355_, -610221591);
	int i_357_ = i_347_ < i_350_ ? i_347_ : i_350_;
	int i_358_ = i_353_ < i_356_ ? i_353_ : i_356_;
	int i_359_ = i_350_ < i_356_ ? i_350_ : i_356_;
	int i_360_ = i_347_ < i_353_ ? i_347_ : i_353_;
	if (i_340_ != 0) {
	    int i_361_ = ((int) (Math.atan2((double) (i_357_ - i_358_),
					    (double) i_340_)
				 * 2607.5945876176133)
			  & 0x3fff);
	    if (i_361_ != 0) {
		if (i_341_ != 0) {
		    if (i_361_ > 8192) {
			int i_362_ = 16384 - i_341_;
			if (i_361_ < i_362_)
			    i_361_ = i_362_;
		    } else if (i_361_ > i_341_)
			i_361_ = i_341_;
		}
		method3017(i_361_);
	    }
	}
	if (i_339_ != 0) {
	    int i_363_ = ((int) (Math.atan2((double) (i_360_ - i_359_),
					    (double) i_339_)
				 * 2607.5945876176133)
			  & 0x3fff);
	    if (i_363_ != 0) {
		if (i_342_ != 0) {
		    if (i_363_ > 8192) {
			int i_364_ = 16384 - i_342_;
			if (i_363_ < i_364_)
			    i_363_ = i_364_;
		    } else if (i_363_ > i_342_)
			i_363_ = i_342_;
		}
		method3018(i_363_);
	    }
	}
	int i_365_ = i_347_ + i_356_;
	if (i_350_ + i_353_ < i_365_)
	    i_365_ = i_350_ + i_353_;
	i_365_ = (i_365_ >> 1) - i_337_;
	if (i_365_ != 0)
	    method3098(0, i_365_, 0);
    }
    
    public abstract Class534_Sub18_Sub16 method3116
	(Class534_Sub18_Sub16 class534_sub18_sub16);
    
    public abstract Class534_Sub18_Sub16 method3117
	(Class534_Sub18_Sub16 class534_sub18_sub16);
    
    public abstract void method3118(short i, short i_366_);
    
    public abstract void method3119();
    
    public abstract void method3120(int i);
    
    abstract void method3121(int i, int[] is, int i_367_, int i_368_,
			     int i_369_, boolean bool, int i_370_,
			     int[] is_371_);
    
    public abstract int method3122();
    
    public abstract int method3123();
    
    public abstract int method3124();
    
    public abstract int method3125();
    
    public abstract int method3126();
    
    public abstract void method3127();
    
    public abstract int method3128();
    
    public abstract int method3129();
    
    public abstract int method3130();
    
    public abstract int method3131();
    
    public abstract void method3132(int i, int i_372_, Class151 class151,
				    Class151 class151_373_, int i_374_,
				    int i_375_, int i_376_);
    
    public abstract void method3133(Class446 class446, int i, boolean bool);
    
    public abstract int method3134();
    
    void method3135(int i, int[] is, int i_377_, int i_378_, int i_379_,
		    int i_380_, boolean bool, int i_381_, int[] is_382_) {
	if (i_380_ == 1) {
	    if (i == 0 || i == 1) {
		int i_383_ = -i_377_;
		i_377_ = i_379_;
		i_379_ = i_383_;
	    } else if (i == 3) {
		int i_384_ = i_377_;
		i_377_ = i_379_;
		i_379_ = i_384_;
	    } else if (i == 2) {
		int i_385_ = i_377_;
		i_377_ = -i_379_ & 0x3fff;
		i_379_ = i_385_ & 0x3fff;
	    }
	} else if (i_380_ == 2) {
	    if (i == 0 || i == 1) {
		i_377_ = -i_377_;
		i_379_ = -i_379_;
	    } else if (i == 2) {
		i_377_ = -i_377_ & 0x3fff;
		i_379_ = -i_379_ & 0x3fff;
	    }
	} else if (i_380_ == 3) {
	    if (i == 0 || i == 1) {
		int i_386_ = i_377_;
		i_377_ = -i_379_;
		i_379_ = i_386_;
	    } else if (i == 3) {
		int i_387_ = i_377_;
		i_377_ = i_379_;
		i_379_ = i_387_;
	    } else if (i == 2) {
		int i_388_ = i_377_;
		i_377_ = i_379_ & 0x3fff;
		i_379_ = -i_388_ & 0x3fff;
	    }
	}
	if (i_381_ != 65535)
	    method3068(i, is, i_377_, i_378_, i_379_, bool, i_381_, is_382_);
	else
	    method3033(i, is, i_377_, i_378_, i_379_, i_380_, bool);
    }
    
    public abstract int method3136();
    
    abstract void method3137(int i, int i_389_, int i_390_, int i_391_);
    
    public abstract int method3138();
    
    public abstract int method3139();
    
    public abstract int method3140();
    
    public abstract void method3141(int i, int i_392_, int i_393_, int i_394_);
    
    public abstract int method3142();
    
    public abstract int method3143();
    
    public abstract int method3144();
    
    public abstract void method3145(int i);
    
    public abstract void method3146(int i);
    
    public abstract void method3147(int i);
    
    public final void method3148
	(Class534_Sub18_Sub17 class534_sub18_sub17, int i,
	 Class534_Sub18_Sub17 class534_sub18_sub17_395_, int i_396_,
	 int i_397_, int i_398_, int i_399_, int i_400_, boolean bool,
	 int[] is) {
	if (i != -1) {
	    method3202();
	    if (!method3032())
		method3109();
	    else {
		Class167 class167
		    = class534_sub18_sub17.aClass167Array11875[i];
		Class534_Sub24 class534_sub24 = class167.aClass534_Sub24_1774;
		Class167 class167_401_ = null;
		if (class534_sub18_sub17_395_ != null) {
		    class167_401_ = (class534_sub18_sub17_395_
				     .aClass167Array11875[i_396_]);
		    if (class167_401_.aClass534_Sub24_1774 != class534_sub24)
			class167_401_ = null;
		}
		method3030(class534_sub24, class167, class167_401_, i_397_,
			   i_398_, i_399_, null, false, bool, i_400_, is);
		method3107();
		method3109();
	    }
	}
    }
    
    public abstract void method3149(int i);
    
    public abstract void method3150(byte i, byte[] is);
    
    public abstract int method3151();
    
    public abstract byte[] method3152();
    
    public abstract void method3153(int i, int i_402_, int i_403_);
    
    public abstract void method3154(short i, short i_404_);
    
    public abstract void method3155(byte i, byte[] is);
    
    public abstract int method3156();
    
    public abstract void method3157(byte i, byte[] is);
    
    public abstract void method3158(short i, short i_405_);
    
    public abstract void method3159(short i, short i_406_);
    
    public abstract void method3160(short i, short i_407_);
    
    public abstract void method3161(int i, int i_408_, int i_409_, int i_410_);
    
    abstract void method3162();
    
    public abstract Class172[] method3163();
    
    public abstract Class172[] method3164();
    
    public abstract Class172[] method3165();
    
    public abstract Class158[] method3166();
    
    public abstract boolean method3167(int i, int i_411_, Class446 class446,
				       boolean bool, int i_412_);
    
    public abstract Class172[] method3168();
    
    public abstract void method3169(Class446 class446, Class194 class194,
				    int i);
    
    public abstract boolean method3170();
    
    public abstract boolean method3171();
    
    public abstract boolean method3172();
    
    public abstract boolean method3173();
    
    public abstract boolean method3174();
    
    public abstract Class534_Sub18_Sub16 method3175
	(Class534_Sub18_Sub16 class534_sub18_sub16);
    
    public abstract int method3176();
    
    public abstract void method3177(int i);
    
    public abstract void method3178(int i, int i_413_, int i_414_);
    
    static int method3179(float f, float f_415_, float f_416_) {
	float f_417_ = f < 0.0F ? -f : f;
	float f_418_ = f_415_ < 0.0F ? -f_415_ : f_415_;
	float f_419_ = f_416_ < 0.0F ? -f_416_ : f_416_;
	if (f_418_ > f_417_ && f_418_ > f_419_) {
	    if (f_415_ > 0.0F)
		return 0;
	    return 1;
	}
	if (f_419_ > f_417_ && f_419_ > f_418_) {
	    if (f_416_ > 0.0F)
		return 2;
	    return 3;
	}
	if (f > 0.0F)
	    return 4;
	return 5;
    }
    
    public abstract void method3180(int i);
    
    abstract void method3181();
    
    abstract void method3182();
    
    public abstract boolean method3183(int i, int i_420_, Class446 class446,
				       boolean bool, int i_421_);
    
    abstract void method3184();
    
    abstract void method3185();
    
    static void method3186(int i, int i_422_, int i_423_, int i_424_,
			   int i_425_, int i_426_, float[] fs, int i_427_,
			   float f, float[] fs_428_) {
	i -= i_424_;
	i_422_ -= i_425_;
	i_423_ -= i_426_;
	float f_429_ = ((float) i * fs[0] + (float) i_422_ * fs[1]
			+ (float) i_423_ * fs[2]);
	float f_430_ = ((float) i * fs[3] + (float) i_422_ * fs[4]
			+ (float) i_423_ * fs[5]);
	float f_431_ = ((float) i * fs[6] + (float) i_422_ * fs[7]
			+ (float) i_423_ * fs[8]);
	float f_432_
	    = (float) Math.sqrt((double) (f_429_ * f_429_ + f_430_ * f_430_
					  + f_431_ * f_431_));
	float f_433_ = (((float) Math.atan2((double) f_429_, (double) f_431_)
			 / 6.2831855F)
			+ 0.5F);
	float f_434_
	    = ((float) Math.asin((double) (f_430_ / f_432_)) / 3.1415927F
	       + 0.5F + f);
	if (i_427_ == 1) {
	    float f_435_ = f_433_;
	    f_433_ = -f_434_;
	    f_434_ = f_435_;
	} else if (i_427_ == 2) {
	    f_433_ = -f_433_;
	    f_434_ = -f_434_;
	} else if (i_427_ == 3) {
	    float f_436_ = f_433_;
	    f_433_ = f_434_;
	    f_434_ = -f_436_;
	}
	fs_428_[0] = f_433_;
	fs_428_[1] = f_434_;
    }
    
    static void method3187(int i, int i_437_, int i_438_, int i_439_,
			   int i_440_, int i_441_, float[] fs, int i_442_,
			   float f, float[] fs_443_) {
	i -= i_439_;
	i_437_ -= i_440_;
	i_438_ -= i_441_;
	float f_444_ = ((float) i * fs[0] + (float) i_437_ * fs[1]
			+ (float) i_438_ * fs[2]);
	float f_445_ = ((float) i * fs[3] + (float) i_437_ * fs[4]
			+ (float) i_438_ * fs[5]);
	float f_446_ = ((float) i * fs[6] + (float) i_437_ * fs[7]
			+ (float) i_438_ * fs[8]);
	float f_447_
	    = (float) Math.sqrt((double) (f_444_ * f_444_ + f_445_ * f_445_
					  + f_446_ * f_446_));
	float f_448_ = (((float) Math.atan2((double) f_444_, (double) f_446_)
			 / 6.2831855F)
			+ 0.5F);
	float f_449_
	    = ((float) Math.asin((double) (f_445_ / f_447_)) / 3.1415927F
	       + 0.5F + f);
	if (i_442_ == 1) {
	    float f_450_ = f_448_;
	    f_448_ = -f_449_;
	    f_449_ = f_450_;
	} else if (i_442_ == 2) {
	    f_448_ = -f_448_;
	    f_449_ = -f_449_;
	} else if (i_442_ == 3) {
	    float f_451_ = f_448_;
	    f_448_ = f_449_;
	    f_449_ = -f_451_;
	}
	fs_443_[0] = f_448_;
	fs_443_[1] = f_449_;
    }
    
    static void method3188(int i, int i_452_, int i_453_, int i_454_,
			   int i_455_, int i_456_, float[] fs, float f,
			   int i_457_, float f_458_, float[] fs_459_) {
	i -= i_454_;
	i_452_ -= i_455_;
	i_453_ -= i_456_;
	float f_460_ = ((float) i * fs[0] + (float) i_452_ * fs[1]
			+ (float) i_453_ * fs[2]);
	float f_461_ = ((float) i * fs[3] + (float) i_452_ * fs[4]
			+ (float) i_453_ * fs[5]);
	float f_462_ = ((float) i * fs[6] + (float) i_452_ * fs[7]
			+ (float) i_453_ * fs[8]);
	float f_463_ = (((float) Math.atan2((double) f_460_, (double) f_462_)
			 / 6.2831855F)
			+ 0.5F);
	if (f != 1.0F)
	    f_463_ *= f;
	float f_464_ = f_461_ + 0.5F + f_458_;
	if (i_457_ == 1) {
	    float f_465_ = f_463_;
	    f_463_ = -f_464_;
	    f_464_ = f_465_;
	} else if (i_457_ == 2) {
	    f_463_ = -f_463_;
	    f_464_ = -f_464_;
	} else if (i_457_ == 3) {
	    float f_466_ = f_463_;
	    f_463_ = f_464_;
	    f_464_ = -f_466_;
	}
	fs_459_[0] = f_463_;
	fs_459_[1] = f_464_;
    }
    
    static void method3189(int i, int i_467_, int i_468_, int i_469_,
			   int i_470_, int i_471_, float[] fs, float f,
			   int i_472_, float f_473_, float[] fs_474_) {
	i -= i_469_;
	i_467_ -= i_470_;
	i_468_ -= i_471_;
	float f_475_ = ((float) i * fs[0] + (float) i_467_ * fs[1]
			+ (float) i_468_ * fs[2]);
	float f_476_ = ((float) i * fs[3] + (float) i_467_ * fs[4]
			+ (float) i_468_ * fs[5]);
	float f_477_ = ((float) i * fs[6] + (float) i_467_ * fs[7]
			+ (float) i_468_ * fs[8]);
	float f_478_ = (((float) Math.atan2((double) f_475_, (double) f_477_)
			 / 6.2831855F)
			+ 0.5F);
	if (f != 1.0F)
	    f_478_ *= f;
	float f_479_ = f_476_ + 0.5F + f_473_;
	if (i_472_ == 1) {
	    float f_480_ = f_478_;
	    f_478_ = -f_479_;
	    f_479_ = f_480_;
	} else if (i_472_ == 2) {
	    f_478_ = -f_478_;
	    f_479_ = -f_479_;
	} else if (i_472_ == 3) {
	    float f_481_ = f_478_;
	    f_478_ = f_479_;
	    f_479_ = -f_481_;
	}
	fs_474_[0] = f_478_;
	fs_474_[1] = f_479_;
    }
    
    static int method3190(float f, float f_482_, float f_483_) {
	float f_484_ = f < 0.0F ? -f : f;
	float f_485_ = f_482_ < 0.0F ? -f_482_ : f_482_;
	float f_486_ = f_483_ < 0.0F ? -f_483_ : f_483_;
	if (f_485_ > f_484_ && f_485_ > f_486_) {
	    if (f_482_ > 0.0F)
		return 0;
	    return 1;
	}
	if (f_486_ > f_484_ && f_486_ > f_485_) {
	    if (f_483_ > 0.0F)
		return 2;
	    return 3;
	}
	if (f > 0.0F)
	    return 4;
	return 5;
    }
    
    static int method3191(float f, float f_487_, float f_488_) {
	float f_489_ = f < 0.0F ? -f : f;
	float f_490_ = f_487_ < 0.0F ? -f_487_ : f_487_;
	float f_491_ = f_488_ < 0.0F ? -f_488_ : f_488_;
	if (f_490_ > f_489_ && f_490_ > f_491_) {
	    if (f_487_ > 0.0F)
		return 0;
	    return 1;
	}
	if (f_491_ > f_489_ && f_491_ > f_490_) {
	    if (f_488_ > 0.0F)
		return 2;
	    return 3;
	}
	if (f > 0.0F)
	    return 4;
	return 5;
    }
    
    static int method3192(float f, float f_492_, float f_493_) {
	float f_494_ = f < 0.0F ? -f : f;
	float f_495_ = f_492_ < 0.0F ? -f_492_ : f_492_;
	float f_496_ = f_493_ < 0.0F ? -f_493_ : f_493_;
	if (f_495_ > f_494_ && f_495_ > f_496_) {
	    if (f_492_ > 0.0F)
		return 0;
	    return 1;
	}
	if (f_496_ > f_494_ && f_496_ > f_495_) {
	    if (f_493_ > 0.0F)
		return 2;
	    return 3;
	}
	if (f > 0.0F)
	    return 4;
	return 5;
    }
    
    static int method3193(float f, float f_497_, float f_498_) {
	float f_499_ = f < 0.0F ? -f : f;
	float f_500_ = f_497_ < 0.0F ? -f_497_ : f_497_;
	float f_501_ = f_498_ < 0.0F ? -f_498_ : f_498_;
	if (f_500_ > f_499_ && f_500_ > f_501_) {
	    if (f_497_ > 0.0F)
		return 0;
	    return 1;
	}
	if (f_501_ > f_499_ && f_501_ > f_500_) {
	    if (f_498_ > 0.0F)
		return 2;
	    return 3;
	}
	if (f > 0.0F)
	    return 4;
	return 5;
    }
    
    static int method3194(float f, float f_502_, float f_503_) {
	float f_504_ = f < 0.0F ? -f : f;
	float f_505_ = f_502_ < 0.0F ? -f_502_ : f_502_;
	float f_506_ = f_503_ < 0.0F ? -f_503_ : f_503_;
	if (f_505_ > f_504_ && f_505_ > f_506_) {
	    if (f_502_ > 0.0F)
		return 0;
	    return 1;
	}
	if (f_506_ > f_504_ && f_506_ > f_505_) {
	    if (f_503_ > 0.0F)
		return 2;
	    return 3;
	}
	if (f > 0.0F)
	    return 4;
	return 5;
    }
    
    public abstract void method3195();
    
    public final void method3196
	(Class534_Sub18_Sub17 class534_sub18_sub17, int i,
	 Class534_Sub18_Sub17 class534_sub18_sub17_507_, int i_508_,
	 int i_509_, int i_510_, int i_511_, int i_512_, boolean bool,
	 int[] is) {
	if (i != -1) {
	    method3202();
	    if (!method3032())
		method3109();
	    else {
		Class167 class167
		    = class534_sub18_sub17.aClass167Array11875[i];
		Class534_Sub24 class534_sub24 = class167.aClass534_Sub24_1774;
		Class167 class167_513_ = null;
		if (class534_sub18_sub17_507_ != null) {
		    class167_513_ = (class534_sub18_sub17_507_
				     .aClass167Array11875[i_508_]);
		    if (class167_513_.aClass534_Sub24_1774 != class534_sub24)
			class167_513_ = null;
		}
		method3030(class534_sub24, class167, class167_513_, i_509_,
			   i_510_, i_511_, null, false, bool, i_512_, is);
		method3107();
		method3109();
	    }
	}
    }
    
    Class196 method3197(Class187 class187, int[] is, int i) {
	int[] is_514_ = null;
	int[] is_515_ = null;
	int[] is_516_ = null;
	float[][] fs = null;
	if (class187.aShortArray2102 != null) {
	    int i_517_ = class187.anInt2110;
	    int[] is_518_ = new int[i_517_];
	    int[] is_519_ = new int[i_517_];
	    int[] is_520_ = new int[i_517_];
	    int[] is_521_ = new int[i_517_];
	    int[] is_522_ = new int[i_517_];
	    int[] is_523_ = new int[i_517_];
	    for (int i_524_ = 0; i_524_ < i_517_; i_524_++) {
		is_518_[i_524_] = 2147483647;
		is_519_[i_524_] = -2147483647;
		is_520_[i_524_] = 2147483647;
		is_521_[i_524_] = -2147483647;
		is_522_[i_524_] = 2147483647;
		is_523_[i_524_] = -2147483647;
	    }
	    for (int i_525_ = 0; i_525_ < i; i_525_++) {
		int i_526_ = is[i_525_];
		short i_527_ = class187.aShortArray2102[i_526_];
		if (i_527_ > -1 && i_527_ < 32766) {
		    for (int i_528_ = 0; i_528_ < 3; i_528_++) {
			short i_529_;
			if (i_528_ == 0)
			    i_529_ = class187.aShortArray2093[i_526_];
			else if (i_528_ == 1)
			    i_529_ = class187.aShortArray2077[i_526_];
			else
			    i_529_ = class187.aShortArray2095[i_526_];
			int i_530_ = class187.anIntArray2083[i_529_];
			int i_531_ = class187.anIntArray2080[i_529_];
			int i_532_ = class187.anIntArray2113[i_529_];
			if (i_530_ < is_518_[i_527_])
			    is_518_[i_527_] = i_530_;
			if (i_530_ > is_519_[i_527_])
			    is_519_[i_527_] = i_530_;
			if (i_531_ < is_520_[i_527_])
			    is_520_[i_527_] = i_531_;
			if (i_531_ > is_521_[i_527_])
			    is_521_[i_527_] = i_531_;
			if (i_532_ < is_522_[i_527_])
			    is_522_[i_527_] = i_532_;
			if (i_532_ > is_523_[i_527_])
			    is_523_[i_527_] = i_532_;
		    }
		}
	    }
	    is_514_ = new int[i_517_];
	    is_515_ = new int[i_517_];
	    is_516_ = new int[i_517_];
	    fs = new float[i_517_][];
	    for (int i_533_ = 0; i_533_ < i_517_; i_533_++) {
		byte i_534_ = class187.aByteArray2086[i_533_];
		if (i_534_ > 0) {
		    is_514_[i_533_] = (is_518_[i_533_] + is_519_[i_533_]) / 2;
		    is_515_[i_533_] = (is_520_[i_533_] + is_521_[i_533_]) / 2;
		    is_516_[i_533_] = (is_522_[i_533_] + is_523_[i_533_]) / 2;
		    float f;
		    float f_535_;
		    float f_536_;
		    if (i_534_ == 1) {
			int i_537_ = class187.anIntArray2115[i_533_];
			if (i_537_ == 0) {
			    f = 1.0F;
			    f_536_ = 1.0F;
			} else if (i_537_ > 0) {
			    f = 1.0F;
			    f_536_ = (float) i_537_ / 1024.0F;
			} else {
			    f_536_ = 1.0F;
			    f = (float) -i_537_ / 1024.0F;
			}
			f_535_
			    = 64.0F / (float) class187.anIntArray2116[i_533_];
		    } else if (i_534_ == 2) {
			f = 64.0F / (float) class187.anIntArray2115[i_533_];
			f_535_
			    = 64.0F / (float) class187.anIntArray2116[i_533_];
			f_536_
			    = 64.0F / (float) class187.anIntArray2117[i_533_];
		    } else {
			f = (float) class187.anIntArray2115[i_533_] / 1024.0F;
			f_535_ = ((float) class187.anIntArray2116[i_533_]
				  / 1024.0F);
			f_536_ = ((float) class187.anIntArray2117[i_533_]
				  / 1024.0F);
		    }
		    fs[i_533_]
			= method3010(class187.aShortArray2108[i_533_],
				     class187.aShortArray2085[i_533_],
				     class187.aShortArray2114[i_533_],
				     class187.aByteArray2121[i_533_] & 0xff, f,
				     f_535_, f_536_);
		}
	    }
	}
	return new Class196(this, is_514_, is_515_, is_516_, fs);
    }
    
    static float[] method3198(int i, int i_538_, int i_539_, int i_540_,
			      float f, float f_541_, float f_542_) {
	float[] fs = new float[9];
	float[] fs_543_ = new float[9];
	float f_544_
	    = (float) Math.cos((double) ((float) i_540_ * 0.024543693F));
	float f_545_
	    = (float) Math.sin((double) ((float) i_540_ * 0.024543693F));
	float f_546_ = 1.0F - f_544_;
	fs[0] = f_544_;
	fs[1] = 0.0F;
	fs[2] = f_545_;
	fs[3] = 0.0F;
	fs[4] = 1.0F;
	fs[5] = 0.0F;
	fs[6] = -f_545_;
	fs[7] = 0.0F;
	fs[8] = f_544_;
	float[] fs_547_ = new float[9];
	float f_548_ = 1.0F;
	float f_549_ = 0.0F;
	f_544_ = (float) i_538_ / 32767.0F;
	f_545_ = -(float) Math.sqrt((double) (1.0F - f_544_ * f_544_));
	f_546_ = 1.0F - f_544_;
	float f_550_ = (float) Math.sqrt((double) (i * i + i_539_ * i_539_));
	if (f_550_ == 0.0F && f_544_ == 0.0F)
	    fs_543_ = fs;
	else {
	    if (f_550_ != 0.0F) {
		f_548_ = (float) -i_539_ / f_550_;
		f_549_ = (float) i / f_550_;
	    }
	    fs_547_[0] = f_544_ + f_548_ * f_548_ * f_546_;
	    fs_547_[1] = f_549_ * f_545_;
	    fs_547_[2] = f_549_ * f_548_ * f_546_;
	    fs_547_[3] = -f_549_ * f_545_;
	    fs_547_[4] = f_544_;
	    fs_547_[5] = f_548_ * f_545_;
	    fs_547_[6] = f_548_ * f_549_ * f_546_;
	    fs_547_[7] = -f_548_ * f_545_;
	    fs_547_[8] = f_544_ + f_549_ * f_549_ * f_546_;
	    fs_543_[0]
		= fs[0] * fs_547_[0] + fs[1] * fs_547_[3] + fs[2] * fs_547_[6];
	    fs_543_[1]
		= fs[0] * fs_547_[1] + fs[1] * fs_547_[4] + fs[2] * fs_547_[7];
	    fs_543_[2]
		= fs[0] * fs_547_[2] + fs[1] * fs_547_[5] + fs[2] * fs_547_[8];
	    fs_543_[3]
		= fs[3] * fs_547_[0] + fs[4] * fs_547_[3] + fs[5] * fs_547_[6];
	    fs_543_[4]
		= fs[3] * fs_547_[1] + fs[4] * fs_547_[4] + fs[5] * fs_547_[7];
	    fs_543_[5]
		= fs[3] * fs_547_[2] + fs[4] * fs_547_[5] + fs[5] * fs_547_[8];
	    fs_543_[6]
		= fs[6] * fs_547_[0] + fs[7] * fs_547_[3] + fs[8] * fs_547_[6];
	    fs_543_[7]
		= fs[6] * fs_547_[1] + fs[7] * fs_547_[4] + fs[8] * fs_547_[7];
	    fs_543_[8]
		= fs[6] * fs_547_[2] + fs[7] * fs_547_[5] + fs[8] * fs_547_[8];
	}
	fs_543_[0] *= f;
	fs_543_[1] *= f;
	fs_543_[2] *= f;
	fs_543_[3] *= f_541_;
	fs_543_[4] *= f_541_;
	fs_543_[5] *= f_541_;
	fs_543_[6] *= f_542_;
	fs_543_[7] *= f_542_;
	fs_543_[8] *= f_542_;
	return fs_543_;
    }
    
    public abstract void method3199(short i, short i_551_);
    
    public abstract void method3200();
    
    void method3201(Class151 class151, int i, int i_552_, int i_553_,
		    int i_554_, int i_555_, int i_556_, int i_557_) {
	boolean bool = false;
	boolean bool_558_ = false;
	boolean bool_559_ = false;
	int i_560_ = -i_554_ / 2;
	int i_561_ = -i_555_ / 2;
	int i_562_
	    = class151.method2521(i + i_560_, i_553_ + i_561_, -954945143);
	int i_563_ = i_554_ / 2;
	int i_564_ = -i_555_ / 2;
	int i_565_
	    = class151.method2521(i + i_563_, i_553_ + i_564_, -570066513);
	int i_566_ = -i_554_ / 2;
	int i_567_ = i_555_ / 2;
	int i_568_
	    = class151.method2521(i + i_566_, i_553_ + i_567_, -1331144759);
	int i_569_ = i_554_ / 2;
	int i_570_ = i_555_ / 2;
	int i_571_
	    = class151.method2521(i + i_569_, i_553_ + i_570_, -1757133502);
	int i_572_ = i_562_ < i_565_ ? i_562_ : i_565_;
	int i_573_ = i_568_ < i_571_ ? i_568_ : i_571_;
	int i_574_ = i_565_ < i_571_ ? i_565_ : i_571_;
	int i_575_ = i_562_ < i_568_ ? i_562_ : i_568_;
	if (i_555_ != 0) {
	    int i_576_ = ((int) (Math.atan2((double) (i_572_ - i_573_),
					    (double) i_555_)
				 * 2607.5945876176133)
			  & 0x3fff);
	    if (i_576_ != 0) {
		if (i_556_ != 0) {
		    if (i_576_ > 8192) {
			int i_577_ = 16384 - i_556_;
			if (i_576_ < i_577_)
			    i_576_ = i_577_;
		    } else if (i_576_ > i_556_)
			i_576_ = i_556_;
		}
		method3017(i_576_);
	    }
	}
	if (i_554_ != 0) {
	    int i_578_ = ((int) (Math.atan2((double) (i_575_ - i_574_),
					    (double) i_554_)
				 * 2607.5945876176133)
			  & 0x3fff);
	    if (i_578_ != 0) {
		if (i_557_ != 0) {
		    if (i_578_ > 8192) {
			int i_579_ = 16384 - i_557_;
			if (i_578_ < i_579_)
			    i_578_ = i_579_;
		    } else if (i_578_ > i_557_)
			i_578_ = i_557_;
		}
		method3018(i_578_);
	    }
	}
	int i_580_ = i_562_ + i_571_;
	if (i_565_ + i_568_ < i_580_)
	    i_580_ = i_565_ + i_568_;
	i_580_ = (i_580_ >> 1) - i_552_;
	if (i_580_ != 0)
	    method3098(0, i_580_, 0);
    }
    
    abstract void method3202();
    
    void method3203(Class151 class151, int i, int i_581_, int i_582_,
		    int i_583_, int i_584_, int i_585_, int i_586_) {
	boolean bool = false;
	boolean bool_587_ = false;
	boolean bool_588_ = false;
	int i_589_ = -i_583_ / 2;
	int i_590_ = -i_584_ / 2;
	int i_591_
	    = class151.method2521(i + i_589_, i_582_ + i_590_, -1843354719);
	int i_592_ = i_583_ / 2;
	int i_593_ = -i_584_ / 2;
	int i_594_
	    = class151.method2521(i + i_592_, i_582_ + i_593_, -1559238273);
	int i_595_ = -i_583_ / 2;
	int i_596_ = i_584_ / 2;
	int i_597_
	    = class151.method2521(i + i_595_, i_582_ + i_596_, -1261101312);
	int i_598_ = i_583_ / 2;
	int i_599_ = i_584_ / 2;
	int i_600_
	    = class151.method2521(i + i_598_, i_582_ + i_599_, -1532809644);
	int i_601_ = i_591_ < i_594_ ? i_591_ : i_594_;
	int i_602_ = i_597_ < i_600_ ? i_597_ : i_600_;
	int i_603_ = i_594_ < i_600_ ? i_594_ : i_600_;
	int i_604_ = i_591_ < i_597_ ? i_591_ : i_597_;
	if (i_584_ != 0) {
	    int i_605_ = ((int) (Math.atan2((double) (i_601_ - i_602_),
					    (double) i_584_)
				 * 2607.5945876176133)
			  & 0x3fff);
	    if (i_605_ != 0) {
		if (i_585_ != 0) {
		    if (i_605_ > 8192) {
			int i_606_ = 16384 - i_585_;
			if (i_605_ < i_606_)
			    i_605_ = i_606_;
		    } else if (i_605_ > i_585_)
			i_605_ = i_585_;
		}
		method3017(i_605_);
	    }
	}
	if (i_583_ != 0) {
	    int i_607_ = ((int) (Math.atan2((double) (i_604_ - i_603_),
					    (double) i_583_)
				 * 2607.5945876176133)
			  & 0x3fff);
	    if (i_607_ != 0) {
		if (i_586_ != 0) {
		    if (i_607_ > 8192) {
			int i_608_ = 16384 - i_586_;
			if (i_607_ < i_608_)
			    i_607_ = i_608_;
		    } else if (i_607_ > i_586_)
			i_607_ = i_586_;
		}
		method3018(i_607_);
	    }
	}
	int i_609_ = i_591_ + i_600_;
	if (i_594_ + i_597_ < i_609_)
	    i_609_ = i_594_ + i_597_;
	i_609_ = (i_609_ >> 1) - i_581_;
	if (i_609_ != 0)
	    method3098(0, i_609_, 0);
    }
    
    public final void method3204
	(Class534_Sub18_Sub17 class534_sub18_sub17, int i,
	 Class534_Sub18_Sub17 class534_sub18_sub17_610_, int i_611_,
	 int i_612_, int i_613_, int i_614_, boolean bool) {
	if (i != -1) {
	    method3202();
	    if (!method3032())
		method3109();
	    else {
		Class167 class167
		    = class534_sub18_sub17.aClass167Array11875[i];
		Class534_Sub24 class534_sub24 = class167.aClass534_Sub24_1774;
		Class167 class167_615_ = null;
		if (class534_sub18_sub17_610_ != null) {
		    class167_615_ = (class534_sub18_sub17_610_
				     .aClass167Array11875[i_611_]);
		    if (class167_615_.aClass534_Sub24_1774 != class534_sub24)
			class167_615_ = null;
		}
		method3030(class534_sub24, class167, class167_615_, i_612_,
			   i_613_, i_614_, null, false, bool, 65535, null);
		method3107();
		method3109();
	    }
	}
    }
    
    public final void method3205
	(Class534_Sub18_Sub17 class534_sub18_sub17, int i,
	 Class534_Sub18_Sub17 class534_sub18_sub17_616_, int i_617_,
	 int i_618_, int i_619_, int i_620_, boolean bool) {
	if (i != -1) {
	    method3202();
	    if (!method3032())
		method3109();
	    else {
		Class167 class167
		    = class534_sub18_sub17.aClass167Array11875[i];
		Class534_Sub24 class534_sub24 = class167.aClass534_Sub24_1774;
		Class167 class167_621_ = null;
		if (class534_sub18_sub17_616_ != null) {
		    class167_621_ = (class534_sub18_sub17_616_
				     .aClass167Array11875[i_617_]);
		    if (class167_621_.aClass534_Sub24_1774 != class534_sub24)
			class167_621_ = null;
		}
		method3030(class534_sub24, class167, class167_621_, i_618_,
			   i_619_, i_620_, null, false, bool, 65535, null);
		method3107();
		method3109();
	    }
	}
    }
    
    public final void method3206
	(Class534_Sub18_Sub17 class534_sub18_sub17, int i,
	 Class534_Sub18_Sub17 class534_sub18_sub17_622_, int i_623_,
	 int i_624_, int i_625_, int i_626_, boolean bool) {
	if (i != -1) {
	    method3202();
	    if (!method3032())
		method3109();
	    else {
		Class167 class167
		    = class534_sub18_sub17.aClass167Array11875[i];
		Class534_Sub24 class534_sub24 = class167.aClass534_Sub24_1774;
		Class167 class167_627_ = null;
		if (class534_sub18_sub17_622_ != null) {
		    class167_627_ = (class534_sub18_sub17_622_
				     .aClass167Array11875[i_623_]);
		    if (class167_627_.aClass534_Sub24_1774 != class534_sub24)
			class167_627_ = null;
		}
		method3030(class534_sub24, class167, class167_627_, i_624_,
			   i_625_, i_626_, null, false, bool, 65535, null);
		method3107();
		method3109();
	    }
	}
    }
    
    public final void method3207
	(Class534_Sub18_Sub17 class534_sub18_sub17, int i,
	 Class534_Sub18_Sub17 class534_sub18_sub17_628_, int i_629_,
	 int i_630_, int i_631_, int i_632_, int i_633_, boolean bool,
	 int[] is) {
	if (i != -1) {
	    method3202();
	    if (!method3032())
		method3109();
	    else {
		Class167 class167
		    = class534_sub18_sub17.aClass167Array11875[i];
		Class534_Sub24 class534_sub24 = class167.aClass534_Sub24_1774;
		Class167 class167_634_ = null;
		if (class534_sub18_sub17_628_ != null) {
		    class167_634_ = (class534_sub18_sub17_628_
				     .aClass167Array11875[i_629_]);
		    if (class167_634_.aClass534_Sub24_1774 != class534_sub24)
			class167_634_ = null;
		}
		method3030(class534_sub24, class167, class167_634_, i_630_,
			   i_631_, i_632_, null, false, bool, i_633_, is);
		method3107();
		method3109();
	    }
	}
    }
    
    public abstract void method3208();
    
    public final void method3209
	(Class534_Sub18_Sub17 class534_sub18_sub17, int i,
	 Class534_Sub18_Sub17 class534_sub18_sub17_635_, int i_636_,
	 int i_637_, int i_638_,
	 Class534_Sub18_Sub17 class534_sub18_sub17_639_, int i_640_,
	 Class534_Sub18_Sub17 class534_sub18_sub17_641_, int i_642_,
	 int i_643_, int i_644_, boolean[] bools, boolean bool) {
	if (i != -1) {
	    if (bools == null || i_640_ == -1)
		method3061(class534_sub18_sub17, i, class534_sub18_sub17_635_,
			   i_636_, i_637_, i_638_, 0, bool);
	    else {
		method3202();
		if (!method3032())
		    method3109();
		else {
		    Class167 class167
			= class534_sub18_sub17.aClass167Array11875[i];
		    Class534_Sub24 class534_sub24
			= class167.aClass534_Sub24_1774;
		    Class167 class167_645_ = null;
		    if (class534_sub18_sub17_635_ != null) {
			class167_645_ = (class534_sub18_sub17_635_
					 .aClass167Array11875[i_636_]);
			if (class167_645_.aClass534_Sub24_1774
			    != class534_sub24)
			    class167_645_ = null;
		    }
		    method3030(class534_sub24, class167, class167_645_, i_637_,
			       i_638_, 0, bools, false, bool, 65535, null);
		    Class167 class167_646_ = (class534_sub18_sub17_639_
					      .aClass167Array11875[i_640_]);
		    Class167 class167_647_ = null;
		    if (class534_sub18_sub17_641_ != null) {
			class167_647_ = (class534_sub18_sub17_641_
					 .aClass167Array11875[i_642_]);
			if (class167_647_.aClass534_Sub24_1774
			    != class534_sub24)
			    class167_647_ = null;
		    }
		    method3033(0, new int[0], 0, 0, 0, 0, bool);
		    method3030(class167_646_.aClass534_Sub24_1774,
			       class167_646_, class167_647_, i_643_, i_644_, 0,
			       bools, true, bool, 65535, null);
		    method3107();
		    method3109();
		}
	    }
	}
    }
    
    public abstract int method3210();
    
    public final void method3211
	(Class534_Sub18_Sub17 class534_sub18_sub17, int i,
	 Class534_Sub18_Sub17 class534_sub18_sub17_648_, int i_649_,
	 int i_650_, int i_651_,
	 Class534_Sub18_Sub17 class534_sub18_sub17_652_, int i_653_,
	 Class534_Sub18_Sub17 class534_sub18_sub17_654_, int i_655_,
	 int i_656_, int i_657_, boolean[] bools, boolean bool) {
	if (i != -1) {
	    if (bools == null || i_653_ == -1)
		method3061(class534_sub18_sub17, i, class534_sub18_sub17_648_,
			   i_649_, i_650_, i_651_, 0, bool);
	    else {
		method3202();
		if (!method3032())
		    method3109();
		else {
		    Class167 class167
			= class534_sub18_sub17.aClass167Array11875[i];
		    Class534_Sub24 class534_sub24
			= class167.aClass534_Sub24_1774;
		    Class167 class167_658_ = null;
		    if (class534_sub18_sub17_648_ != null) {
			class167_658_ = (class534_sub18_sub17_648_
					 .aClass167Array11875[i_649_]);
			if (class167_658_.aClass534_Sub24_1774
			    != class534_sub24)
			    class167_658_ = null;
		    }
		    method3030(class534_sub24, class167, class167_658_, i_650_,
			       i_651_, 0, bools, false, bool, 65535, null);
		    Class167 class167_659_ = (class534_sub18_sub17_652_
					      .aClass167Array11875[i_653_]);
		    Class167 class167_660_ = null;
		    if (class534_sub18_sub17_654_ != null) {
			class167_660_ = (class534_sub18_sub17_654_
					 .aClass167Array11875[i_655_]);
			if (class167_660_.aClass534_Sub24_1774
			    != class534_sub24)
			    class167_660_ = null;
		    }
		    method3033(0, new int[0], 0, 0, 0, 0, bool);
		    method3030(class167_659_.aClass534_Sub24_1774,
			       class167_659_, class167_660_, i_656_, i_657_, 0,
			       bools, true, bool, 65535, null);
		    method3107();
		    method3109();
		}
	    }
	}
    }
    
    void method3212(Class151 class151, int i, int i_661_, int i_662_,
		    int i_663_, int i_664_, int i_665_, int i_666_) {
	boolean bool = false;
	boolean bool_667_ = false;
	boolean bool_668_ = false;
	int i_669_ = -i_663_ / 2;
	int i_670_ = -i_664_ / 2;
	int i_671_
	    = class151.method2521(i + i_669_, i_662_ + i_670_, -756199614);
	int i_672_ = i_663_ / 2;
	int i_673_ = -i_664_ / 2;
	int i_674_
	    = class151.method2521(i + i_672_, i_662_ + i_673_, -1289685852);
	int i_675_ = -i_663_ / 2;
	int i_676_ = i_664_ / 2;
	int i_677_
	    = class151.method2521(i + i_675_, i_662_ + i_676_, -953017826);
	int i_678_ = i_663_ / 2;
	int i_679_ = i_664_ / 2;
	int i_680_
	    = class151.method2521(i + i_678_, i_662_ + i_679_, -1734457210);
	int i_681_ = i_671_ < i_674_ ? i_671_ : i_674_;
	int i_682_ = i_677_ < i_680_ ? i_677_ : i_680_;
	int i_683_ = i_674_ < i_680_ ? i_674_ : i_680_;
	int i_684_ = i_671_ < i_677_ ? i_671_ : i_677_;
	if (i_664_ != 0) {
	    int i_685_ = ((int) (Math.atan2((double) (i_681_ - i_682_),
					    (double) i_664_)
				 * 2607.5945876176133)
			  & 0x3fff);
	    if (i_685_ != 0) {
		if (i_665_ != 0) {
		    if (i_685_ > 8192) {
			int i_686_ = 16384 - i_665_;
			if (i_685_ < i_686_)
			    i_685_ = i_686_;
		    } else if (i_685_ > i_665_)
			i_685_ = i_665_;
		}
		method3017(i_685_);
	    }
	}
	if (i_663_ != 0) {
	    int i_687_ = ((int) (Math.atan2((double) (i_684_ - i_683_),
					    (double) i_663_)
				 * 2607.5945876176133)
			  & 0x3fff);
	    if (i_687_ != 0) {
		if (i_666_ != 0) {
		    if (i_687_ > 8192) {
			int i_688_ = 16384 - i_666_;
			if (i_687_ < i_688_)
			    i_687_ = i_688_;
		    } else if (i_687_ > i_666_)
			i_687_ = i_666_;
		}
		method3018(i_687_);
	    }
	}
	int i_689_ = i_671_ + i_680_;
	if (i_674_ + i_677_ < i_689_)
	    i_689_ = i_674_ + i_677_;
	i_689_ = (i_689_ >> 1) - i_661_;
	if (i_689_ != 0)
	    method3098(0, i_689_, 0);
    }
    
    void method3213(Class534_Sub24 class534_sub24, Class167 class167,
		    Class167 class167_690_, int i, int i_691_, int i_692_,
		    boolean[] bools, boolean bool, boolean bool_693_,
		    int i_694_, int[] is) {
	if (class167_690_ == null || i == 0) {
	    for (int i_695_ = 0; i_695_ < class167.anInt1772; i_695_++) {
		short i_696_ = class167.aShortArray1776[i_695_];
		if (bools == null || bools[i_696_] == bool
		    || class534_sub24.anIntArray10561[i_696_] == 0) {
		    short i_697_ = class167.aShortArray1780[i_695_];
		    if (i_697_ != -1)
			method3135(0,
				   class534_sub24.anIntArrayArray10559[i_697_],
				   0, 0, 0, i_692_, bool_693_,
				   (i_694_
				    & class534_sub24.anIntArray10553[i_697_]),
				   is);
		    method3135(class534_sub24.anIntArray10561[i_696_],
			       class534_sub24.anIntArrayArray10559[i_696_],
			       class167.aShortArray1777[i_695_],
			       class167.aShortArray1778[i_695_],
			       class167.aShortArray1779[i_695_], i_692_,
			       bool_693_,
			       i_694_ & class534_sub24.anIntArray10553[i_696_],
			       is);
		}
	    }
	} else {
	    int i_698_ = 0;
	    int i_699_ = 0;
	    for (int i_700_ = 0;
		 i_700_ < class534_sub24.anInt10560 * -782210841; i_700_++) {
		boolean bool_701_ = false;
		if (i_698_ < class167.anInt1772
		    && class167.aShortArray1776[i_698_] == i_700_)
		    bool_701_ = true;
		boolean bool_702_ = false;
		if (i_699_ < class167_690_.anInt1772
		    && class167_690_.aShortArray1776[i_699_] == i_700_)
		    bool_702_ = true;
		if (bool_701_ || bool_702_) {
		    if (bools != null && bools[i_700_] != bool
			&& class534_sub24.anIntArray10561[i_700_] != 0) {
			if (bool_701_)
			    i_698_++;
			if (bool_702_)
			    i_699_++;
		    } else {
			int i_703_ = 0;
			int i_704_ = class534_sub24.anIntArray10561[i_700_];
			if (i_704_ == 3 || i_704_ == 10)
			    i_703_ = 128;
			int i_705_;
			int i_706_;
			int i_707_;
			short i_708_;
			byte i_709_;
			if (bool_701_) {
			    i_705_ = class167.aShortArray1777[i_698_];
			    i_706_ = class167.aShortArray1778[i_698_];
			    i_707_ = class167.aShortArray1779[i_698_];
			    i_708_ = class167.aShortArray1780[i_698_];
			    i_709_ = class167.aByteArray1787[i_698_];
			    i_698_++;
			} else {
			    i_705_ = i_703_;
			    i_706_ = i_703_;
			    i_707_ = i_703_;
			    i_708_ = (short) -1;
			    i_709_ = (byte) 0;
			}
			int i_710_;
			int i_711_;
			int i_712_;
			short i_713_;
			byte i_714_;
			if (bool_702_) {
			    i_710_ = class167_690_.aShortArray1777[i_699_];
			    i_711_ = class167_690_.aShortArray1778[i_699_];
			    i_712_ = class167_690_.aShortArray1779[i_699_];
			    i_713_ = class167_690_.aShortArray1780[i_699_];
			    i_714_ = class167_690_.aByteArray1787[i_699_];
			    i_699_++;
			} else {
			    i_710_ = i_703_;
			    i_711_ = i_703_;
			    i_712_ = i_703_;
			    i_713_ = (short) -1;
			    i_714_ = (byte) 0;
			}
			int i_715_;
			int i_716_;
			int i_717_;
			if ((i_709_ & 0x2) != 0 || (i_714_ & 0x1) != 0) {
			    i_715_ = i_705_;
			    i_716_ = i_706_;
			    i_717_ = i_707_;
			} else if (i_704_ == 2) {
			    int i_718_ = i_710_ - i_705_ & 0x3fff;
			    int i_719_ = i_711_ - i_706_ & 0x3fff;
			    int i_720_ = i_712_ - i_707_ & 0x3fff;
			    if (i_718_ >= 8192)
				i_718_ -= 16384;
			    if (i_719_ >= 8192)
				i_719_ -= 16384;
			    if (i_720_ >= 8192)
				i_720_ -= 16384;
			    i_715_ = i_705_ + i_718_ * i / i_691_ & 0x3fff;
			    i_716_ = i_706_ + i_719_ * i / i_691_ & 0x3fff;
			    i_717_ = i_707_ + i_720_ * i / i_691_ & 0x3fff;
			} else if (i_704_ == 9) {
			    int i_721_ = i_710_ - i_705_ & 0x3fff;
			    if (i_721_ >= 8192)
				i_721_ -= 16384;
			    i_715_ = i_705_ + i_721_ * i / i_691_ & 0x3fff;
			    i_717_ = 0;
			    i_716_ = 0;
			} else if (i_704_ == 7) {
			    int i_722_ = i_710_ - i_705_ & 0x3f;
			    if (i_722_ >= 32)
				i_722_ -= 64;
			    i_715_ = i_705_ + i_722_ * i / i_691_ & 0x3f;
			    i_716_ = i_706_ + (i_711_ - i_706_) * i / i_691_;
			    i_717_ = i_707_ + (i_712_ - i_707_) * i / i_691_;
			} else {
			    i_715_ = i_705_ + (i_710_ - i_705_) * i / i_691_;
			    i_716_ = i_706_ + (i_711_ - i_706_) * i / i_691_;
			    i_717_ = i_707_ + (i_712_ - i_707_) * i / i_691_;
			}
			if (i_708_ != -1)
			    method3135(0,
				       (class534_sub24.anIntArrayArray10559
					[i_708_]),
				       0, 0, 0, i_692_, bool_693_,
				       i_694_ & (class534_sub24.anIntArray10553
						 [i_708_]),
				       is);
			else if (i_713_ != -1)
			    method3135(0,
				       (class534_sub24.anIntArrayArray10559
					[i_713_]),
				       0, 0, 0, i_692_, bool_693_,
				       i_694_ & (class534_sub24.anIntArray10553
						 [i_713_]),
				       is);
			method3135(i_704_,
				   class534_sub24.anIntArrayArray10559[i_700_],
				   i_715_, i_716_, i_717_, i_692_, bool_693_,
				   (i_694_
				    & class534_sub24.anIntArray10553[i_700_]),
				   is);
		    }
		}
	    }
	}
    }
    
    void method3214(Class534_Sub24 class534_sub24, Class167 class167,
		    Class167 class167_723_, int i, int i_724_, int i_725_,
		    boolean[] bools, boolean bool, boolean bool_726_,
		    int i_727_, int[] is) {
	if (class167_723_ == null || i == 0) {
	    for (int i_728_ = 0; i_728_ < class167.anInt1772; i_728_++) {
		short i_729_ = class167.aShortArray1776[i_728_];
		if (bools == null || bools[i_729_] == bool
		    || class534_sub24.anIntArray10561[i_729_] == 0) {
		    short i_730_ = class167.aShortArray1780[i_728_];
		    if (i_730_ != -1)
			method3135(0,
				   class534_sub24.anIntArrayArray10559[i_730_],
				   0, 0, 0, i_725_, bool_726_,
				   (i_727_
				    & class534_sub24.anIntArray10553[i_730_]),
				   is);
		    method3135(class534_sub24.anIntArray10561[i_729_],
			       class534_sub24.anIntArrayArray10559[i_729_],
			       class167.aShortArray1777[i_728_],
			       class167.aShortArray1778[i_728_],
			       class167.aShortArray1779[i_728_], i_725_,
			       bool_726_,
			       i_727_ & class534_sub24.anIntArray10553[i_729_],
			       is);
		}
	    }
	} else {
	    int i_731_ = 0;
	    int i_732_ = 0;
	    for (int i_733_ = 0;
		 i_733_ < class534_sub24.anInt10560 * -782210841; i_733_++) {
		boolean bool_734_ = false;
		if (i_731_ < class167.anInt1772
		    && class167.aShortArray1776[i_731_] == i_733_)
		    bool_734_ = true;
		boolean bool_735_ = false;
		if (i_732_ < class167_723_.anInt1772
		    && class167_723_.aShortArray1776[i_732_] == i_733_)
		    bool_735_ = true;
		if (bool_734_ || bool_735_) {
		    if (bools != null && bools[i_733_] != bool
			&& class534_sub24.anIntArray10561[i_733_] != 0) {
			if (bool_734_)
			    i_731_++;
			if (bool_735_)
			    i_732_++;
		    } else {
			int i_736_ = 0;
			int i_737_ = class534_sub24.anIntArray10561[i_733_];
			if (i_737_ == 3 || i_737_ == 10)
			    i_736_ = 128;
			int i_738_;
			int i_739_;
			int i_740_;
			short i_741_;
			byte i_742_;
			if (bool_734_) {
			    i_738_ = class167.aShortArray1777[i_731_];
			    i_739_ = class167.aShortArray1778[i_731_];
			    i_740_ = class167.aShortArray1779[i_731_];
			    i_741_ = class167.aShortArray1780[i_731_];
			    i_742_ = class167.aByteArray1787[i_731_];
			    i_731_++;
			} else {
			    i_738_ = i_736_;
			    i_739_ = i_736_;
			    i_740_ = i_736_;
			    i_741_ = (short) -1;
			    i_742_ = (byte) 0;
			}
			int i_743_;
			int i_744_;
			int i_745_;
			short i_746_;
			byte i_747_;
			if (bool_735_) {
			    i_743_ = class167_723_.aShortArray1777[i_732_];
			    i_744_ = class167_723_.aShortArray1778[i_732_];
			    i_745_ = class167_723_.aShortArray1779[i_732_];
			    i_746_ = class167_723_.aShortArray1780[i_732_];
			    i_747_ = class167_723_.aByteArray1787[i_732_];
			    i_732_++;
			} else {
			    i_743_ = i_736_;
			    i_744_ = i_736_;
			    i_745_ = i_736_;
			    i_746_ = (short) -1;
			    i_747_ = (byte) 0;
			}
			int i_748_;
			int i_749_;
			int i_750_;
			if ((i_742_ & 0x2) != 0 || (i_747_ & 0x1) != 0) {
			    i_748_ = i_738_;
			    i_749_ = i_739_;
			    i_750_ = i_740_;
			} else if (i_737_ == 2) {
			    int i_751_ = i_743_ - i_738_ & 0x3fff;
			    int i_752_ = i_744_ - i_739_ & 0x3fff;
			    int i_753_ = i_745_ - i_740_ & 0x3fff;
			    if (i_751_ >= 8192)
				i_751_ -= 16384;
			    if (i_752_ >= 8192)
				i_752_ -= 16384;
			    if (i_753_ >= 8192)
				i_753_ -= 16384;
			    i_748_ = i_738_ + i_751_ * i / i_724_ & 0x3fff;
			    i_749_ = i_739_ + i_752_ * i / i_724_ & 0x3fff;
			    i_750_ = i_740_ + i_753_ * i / i_724_ & 0x3fff;
			} else if (i_737_ == 9) {
			    int i_754_ = i_743_ - i_738_ & 0x3fff;
			    if (i_754_ >= 8192)
				i_754_ -= 16384;
			    i_748_ = i_738_ + i_754_ * i / i_724_ & 0x3fff;
			    i_750_ = 0;
			    i_749_ = 0;
			} else if (i_737_ == 7) {
			    int i_755_ = i_743_ - i_738_ & 0x3f;
			    if (i_755_ >= 32)
				i_755_ -= 64;
			    i_748_ = i_738_ + i_755_ * i / i_724_ & 0x3f;
			    i_749_ = i_739_ + (i_744_ - i_739_) * i / i_724_;
			    i_750_ = i_740_ + (i_745_ - i_740_) * i / i_724_;
			} else {
			    i_748_ = i_738_ + (i_743_ - i_738_) * i / i_724_;
			    i_749_ = i_739_ + (i_744_ - i_739_) * i / i_724_;
			    i_750_ = i_740_ + (i_745_ - i_740_) * i / i_724_;
			}
			if (i_741_ != -1)
			    method3135(0,
				       (class534_sub24.anIntArrayArray10559
					[i_741_]),
				       0, 0, 0, i_725_, bool_726_,
				       i_727_ & (class534_sub24.anIntArray10553
						 [i_741_]),
				       is);
			else if (i_746_ != -1)
			    method3135(0,
				       (class534_sub24.anIntArrayArray10559
					[i_746_]),
				       0, 0, 0, i_725_, bool_726_,
				       i_727_ & (class534_sub24.anIntArray10553
						 [i_746_]),
				       is);
			method3135(i_737_,
				   class534_sub24.anIntArrayArray10559[i_733_],
				   i_748_, i_749_, i_750_, i_725_, bool_726_,
				   (i_727_
				    & class534_sub24.anIntArray10553[i_733_]),
				   is);
		    }
		}
	    }
	}
    }
    
    public abstract void method3215(Class446 class446);
    
    void method3216(int i, int[] is, int i_756_, int i_757_, int i_758_,
		    int i_759_, boolean bool, int i_760_, int[] is_761_) {
	if (i_759_ == 1) {
	    if (i == 0 || i == 1) {
		int i_762_ = -i_756_;
		i_756_ = i_758_;
		i_758_ = i_762_;
	    } else if (i == 3) {
		int i_763_ = i_756_;
		i_756_ = i_758_;
		i_758_ = i_763_;
	    } else if (i == 2) {
		int i_764_ = i_756_;
		i_756_ = -i_758_ & 0x3fff;
		i_758_ = i_764_ & 0x3fff;
	    }
	} else if (i_759_ == 2) {
	    if (i == 0 || i == 1) {
		i_756_ = -i_756_;
		i_758_ = -i_758_;
	    } else if (i == 2) {
		i_756_ = -i_756_ & 0x3fff;
		i_758_ = -i_758_ & 0x3fff;
	    }
	} else if (i_759_ == 3) {
	    if (i == 0 || i == 1) {
		int i_765_ = i_756_;
		i_756_ = -i_758_;
		i_758_ = i_765_;
	    } else if (i == 3) {
		int i_766_ = i_756_;
		i_756_ = i_758_;
		i_758_ = i_766_;
	    } else if (i == 2) {
		int i_767_ = i_756_;
		i_756_ = i_758_ & 0x3fff;
		i_758_ = -i_767_ & 0x3fff;
	    }
	}
	if (i_760_ != 65535)
	    method3068(i, is, i_756_, i_757_, i_758_, bool, i_760_, is_761_);
	else
	    method3033(i, is, i_756_, i_757_, i_758_, i_759_, bool);
    }
    
    void method3217(int i, int[] is, int i_768_, int i_769_, int i_770_,
		    int i_771_, boolean bool, int i_772_, int[] is_773_) {
	if (i_771_ == 1) {
	    if (i == 0 || i == 1) {
		int i_774_ = -i_768_;
		i_768_ = i_770_;
		i_770_ = i_774_;
	    } else if (i == 3) {
		int i_775_ = i_768_;
		i_768_ = i_770_;
		i_770_ = i_775_;
	    } else if (i == 2) {
		int i_776_ = i_768_;
		i_768_ = -i_770_ & 0x3fff;
		i_770_ = i_776_ & 0x3fff;
	    }
	} else if (i_771_ == 2) {
	    if (i == 0 || i == 1) {
		i_768_ = -i_768_;
		i_770_ = -i_770_;
	    } else if (i == 2) {
		i_768_ = -i_768_ & 0x3fff;
		i_770_ = -i_770_ & 0x3fff;
	    }
	} else if (i_771_ == 3) {
	    if (i == 0 || i == 1) {
		int i_777_ = i_768_;
		i_768_ = -i_770_;
		i_770_ = i_777_;
	    } else if (i == 3) {
		int i_778_ = i_768_;
		i_768_ = i_770_;
		i_770_ = i_778_;
	    } else if (i == 2) {
		int i_779_ = i_768_;
		i_768_ = i_770_ & 0x3fff;
		i_770_ = -i_779_ & 0x3fff;
	    }
	}
	if (i_772_ != 65535)
	    method3068(i, is, i_768_, i_769_, i_770_, bool, i_772_, is_773_);
	else
	    method3033(i, is, i_768_, i_769_, i_770_, i_771_, bool);
    }
    
    void method3218(int i, int[] is, int i_780_, int i_781_, int i_782_,
		    int i_783_, boolean bool, int i_784_, int[] is_785_) {
	if (i_783_ == 1) {
	    if (i == 0 || i == 1) {
		int i_786_ = -i_780_;
		i_780_ = i_782_;
		i_782_ = i_786_;
	    } else if (i == 3) {
		int i_787_ = i_780_;
		i_780_ = i_782_;
		i_782_ = i_787_;
	    } else if (i == 2) {
		int i_788_ = i_780_;
		i_780_ = -i_782_ & 0x3fff;
		i_782_ = i_788_ & 0x3fff;
	    }
	} else if (i_783_ == 2) {
	    if (i == 0 || i == 1) {
		i_780_ = -i_780_;
		i_782_ = -i_782_;
	    } else if (i == 2) {
		i_780_ = -i_780_ & 0x3fff;
		i_782_ = -i_782_ & 0x3fff;
	    }
	} else if (i_783_ == 3) {
	    if (i == 0 || i == 1) {
		int i_789_ = i_780_;
		i_780_ = -i_782_;
		i_782_ = i_789_;
	    } else if (i == 3) {
		int i_790_ = i_780_;
		i_780_ = i_782_;
		i_782_ = i_790_;
	    } else if (i == 2) {
		int i_791_ = i_780_;
		i_780_ = i_782_ & 0x3fff;
		i_782_ = -i_791_ & 0x3fff;
	    }
	}
	if (i_784_ != 65535)
	    method3068(i, is, i_780_, i_781_, i_782_, bool, i_784_, is_785_);
	else
	    method3033(i, is, i_780_, i_781_, i_782_, i_783_, bool);
    }
    
    void method3219(int i, int[] is, int i_792_, int i_793_, int i_794_,
		    int i_795_, boolean bool, int i_796_, int[] is_797_) {
	if (i_795_ == 1) {
	    if (i == 0 || i == 1) {
		int i_798_ = -i_792_;
		i_792_ = i_794_;
		i_794_ = i_798_;
	    } else if (i == 3) {
		int i_799_ = i_792_;
		i_792_ = i_794_;
		i_794_ = i_799_;
	    } else if (i == 2) {
		int i_800_ = i_792_;
		i_792_ = -i_794_ & 0x3fff;
		i_794_ = i_800_ & 0x3fff;
	    }
	} else if (i_795_ == 2) {
	    if (i == 0 || i == 1) {
		i_792_ = -i_792_;
		i_794_ = -i_794_;
	    } else if (i == 2) {
		i_792_ = -i_792_ & 0x3fff;
		i_794_ = -i_794_ & 0x3fff;
	    }
	} else if (i_795_ == 3) {
	    if (i == 0 || i == 1) {
		int i_801_ = i_792_;
		i_792_ = -i_794_;
		i_794_ = i_801_;
	    } else if (i == 3) {
		int i_802_ = i_792_;
		i_792_ = i_794_;
		i_794_ = i_802_;
	    } else if (i == 2) {
		int i_803_ = i_792_;
		i_792_ = i_794_ & 0x3fff;
		i_794_ = -i_803_ & 0x3fff;
	    }
	}
	if (i_796_ != 65535)
	    method3068(i, is, i_792_, i_793_, i_794_, bool, i_796_, is_797_);
	else
	    method3033(i, is, i_792_, i_793_, i_794_, i_795_, bool);
    }
}
