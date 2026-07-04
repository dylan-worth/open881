/* Class163_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class163_Sub1 extends Class163
{
    static final int anInt8984 = 8;
    int anInt8985;
    static final int anInt8986 = 4;
    int anInt8987;
    static int anInt8988;
    int anInt8989;
    int anInt8990;
    int[] anIntArray8991;
    int anInt8992;
    static int anInt8993;
    static final int anInt8994 = 12;
    static int anInt8995;
    static int anInt8996;
    static int anInt8997;
    static int anInt8998;
    static int anInt8999;
    static int anInt9000;
    static int anInt9001;
    int anInt9002;
    static int anInt9003;
    static int anInt9004;
    static int anInt9005;
    static int anInt9006;
    static int anInt9007;
    static int anInt9008;
    static int anInt9009;
    static int anInt9010;
    static int anInt9011;
    static int anInt9012 = 0;
    static int anInt9013 = 0;
    static int anInt9014 = 0;
    static int anInt9015 = 0;
    Class185_Sub2 aClass185_Sub2_9016;
    static int anInt9017;
    static int anInt9018 = 0;
    static int anInt9019;
    
    abstract void method14508(boolean bool, boolean bool_0_, boolean bool_1_,
			      int i, int i_2_, float f, int i_3_, int i_4_,
			      int i_5_, int i_6_, int i_7_, int i_8_,
			      boolean bool_9_);
    
    public void method2645(int i, int i_10_, int i_11_, int i_12_) {
	anInt8987 = i;
	anInt8989 = i_10_;
	anInt8992 = i_11_;
	anInt8990 = i_12_;
    }
    
    public void method2646(int[] is) {
	is[0] = anInt8987;
	is[1] = anInt8989;
	is[2] = anInt8992;
	is[3] = anInt8990;
    }
    
    public int method2647() {
	return anInt8985;
    }
    
    Class163_Sub1(Class185_Sub2 class185_sub2, int i, int i_13_) {
	aClass185_Sub2_9016 = class185_sub2;
	anInt8985 = i;
	anInt9002 = i_13_;
    }
    
    abstract void method2702(int i, int i_14_, int i_15_, int i_16_, int i_17_,
			     int i_18_, int i_19_, int i_20_);
    
    abstract void method14509(int i, int i_21_);
    
    public abstract void method2652(int i, int i_22_, int i_23_, int i_24_,
				    int[] is, int i_25_, int i_26_);
    
    public abstract void method2657(int i, int i_27_, int i_28_, int i_29_,
				    int i_30_);
    
    public abstract void method2691(int i, int i_31_, Class145 class145,
				    int i_32_, int i_33_);
    
    abstract void method2661(int i, int i_34_, int i_35_, int i_36_, int i_37_,
			     int i_38_, int i_39_, int i_40_);
    
    public void method2695(int[] is) {
	is[0] = anInt8987;
	is[1] = anInt8989;
	is[2] = anInt8992;
	is[3] = anInt8990;
    }
    
    public void method2663(int i, int i_41_, int i_42_, int i_43_, int i_44_,
			   int i_45_, int i_46_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (anIntArray8991 == null)
	    anIntArray8991 = new int[4];
	aClass185_Sub2_9016.method3360(anIntArray8991);
	aClass185_Sub2_9016.method3282((aClass185_Sub2_9016.anInt9365
					* 1709859847),
				       aClass185_Sub2_9016.anInt9344 * 9823353,
				       i + i_42_, i_41_ + i_43_);
	int i_47_ = method22();
	int i_48_ = method2692();
	int i_49_ = (i_42_ + i_47_ - 1) / i_47_;
	int i_50_ = (i_43_ + i_48_ - 1) / i_48_;
	for (int i_51_ = 0; i_51_ < i_50_; i_51_++) {
	    int i_52_ = i_51_ * i_48_;
	    for (int i_53_ = 0; i_53_ < i_49_; i_53_++)
		method2657(i + i_53_ * i_47_, i_41_ + i_52_, i_44_, i_45_,
			   i_46_);
	}
	aClass185_Sub2_9016.method3373(anIntArray8991[0], anIntArray8991[1],
				       anIntArray8991[2], anIntArray8991[3]);
    }
    
    boolean method14510(float f, float f_54_, float f_55_, float f_56_,
			float f_57_, float f_58_) {
	int i = anInt8987 + anInt8985 + anInt8992;
	int i_59_ = anInt8989 + anInt9002 + anInt8990;
	if (i != anInt8985 || i_59_ != anInt9002) {
	    float f_60_ = (f_55_ - f) / (float) i;
	    float f_61_ = (f_56_ - f_54_) / (float) i;
	    float f_62_ = (f_57_ - f) / (float) i_59_;
	    float f_63_ = (f_58_ - f_54_) / (float) i_59_;
	    float f_64_ = f_62_ * (float) anInt8989;
	    float f_65_ = f_63_ * (float) anInt8989;
	    float f_66_ = f_60_ * (float) anInt8987;
	    float f_67_ = f_61_ * (float) anInt8987;
	    float f_68_ = -f_60_ * (float) anInt8992;
	    float f_69_ = -f_61_ * (float) anInt8992;
	    float f_70_ = -f_62_ * (float) anInt8990;
	    float f_71_ = -f_63_ * (float) anInt8990;
	    f += f_66_ + f_64_;
	    f_54_ += f_67_ + f_65_;
	    f_55_ += f_68_ + f_64_;
	    f_56_ += f_69_ + f_65_;
	    f_57_ += f_66_ + f_70_;
	    f_58_ += f_67_ + f_71_;
	}
	float f_72_ = f_57_ + (f_55_ - f);
	float f_73_ = f_56_ + (f_58_ - f_54_);
	float f_74_;
	float f_75_;
	if (f < f_55_) {
	    f_74_ = f;
	    f_75_ = f_55_;
	} else {
	    f_74_ = f_55_;
	    f_75_ = f;
	}
	if (f_57_ < f_74_)
	    f_74_ = f_57_;
	if (f_72_ < f_74_)
	    f_74_ = f_72_;
	if (f_57_ > f_75_)
	    f_75_ = f_57_;
	if (f_72_ > f_75_)
	    f_75_ = f_72_;
	float f_76_;
	float f_77_;
	if (f_54_ < f_56_) {
	    f_76_ = f_54_;
	    f_77_ = f_56_;
	} else {
	    f_76_ = f_56_;
	    f_77_ = f_54_;
	}
	if (f_58_ < f_76_)
	    f_76_ = f_58_;
	if (f_73_ < f_76_)
	    f_76_ = f_73_;
	if (f_58_ > f_77_)
	    f_77_ = f_58_;
	if (f_73_ > f_77_)
	    f_77_ = f_73_;
	if (f_74_ < (float) (aClass185_Sub2_9016.anInt9365 * 1709859847))
	    f_74_ = (float) (aClass185_Sub2_9016.anInt9365 * 1709859847);
	if (f_75_ > (float) (aClass185_Sub2_9016.anInt9343 * -1807368365))
	    f_75_ = (float) (aClass185_Sub2_9016.anInt9343 * -1807368365);
	if (f_76_ < (float) (aClass185_Sub2_9016.anInt9344 * 9823353))
	    f_76_ = (float) (aClass185_Sub2_9016.anInt9344 * 9823353);
	if (f_77_ > (float) (aClass185_Sub2_9016.anInt9345 * 639238427))
	    f_77_ = (float) (aClass185_Sub2_9016.anInt9345 * 639238427);
	f_75_ = f_74_ - f_75_;
	if (f_75_ >= 0.0F)
	    return false;
	f_77_ = f_76_ - f_77_;
	if (f_77_ >= 0.0F)
	    return false;
	anInt8993 = aClass185_Sub2_9016.anInt9356 * 356365251;
	anInt8988 = (int) ((float) ((int) f_76_ * anInt8993) + f_74_);
	float f_78_
	    = (f_55_ - f) * (f_58_ - f_54_) - (f_56_ - f_54_) * (f_57_ - f);
	float f_79_
	    = (f_57_ - f) * (f_56_ - f_54_) - (f_58_ - f_54_) * (f_55_ - f);
	anInt9001
	    = (int) ((f_58_ - f_54_) * 4096.0F * (float) anInt8985 / f_78_);
	anInt9000
	    = (int) ((f_56_ - f_54_) * 4096.0F * (float) anInt9002 / f_79_);
	anInt9008 = (int) ((f_57_ - f) * 4096.0F * (float) anInt8985 / f_79_);
	anInt9004 = (int) ((f_55_ - f) * 4096.0F * (float) anInt9002 / f_78_);
	anInt9005 = (int) (f_74_ * 16.0F + 8.0F
			   - (f + f_55_ + f_57_ + f_72_) / 4.0F * 16.0F);
	anInt9006 = (int) (f_76_ * 16.0F + 8.0F
			   - (f_54_ + f_56_ + f_58_ + f_73_) / 4.0F * 16.0F);
	anInt9007 = (anInt8985 >> 1 << 12) + (anInt9006 * anInt9008 >> 4);
	anInt9003 = (anInt9002 >> 1 << 12) + (anInt9006 * anInt9004 >> 4);
	anInt9009 = anInt9005 * anInt9001 >> 4;
	anInt9010 = anInt9005 * anInt9000 >> 4;
	anInt8995 = (int) f_74_;
	anInt8999 = (int) f_75_;
	anInt8997 = (int) f_76_;
	anInt8998 = (int) f_77_;
	return true;
    }
    
    abstract void method14511(int[] is, int[] is_80_, int i, int i_81_);
    
    abstract void method14512(int i, int i_82_);
    
    void method2673(float f, float f_83_, float f_84_, float f_85_,
		    float f_86_, float f_87_, int i, Class145 class145,
		    int i_88_, int i_89_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (method14510(f, f_83_, f_84_, f_85_, f_86_, f_87_)) {
	    Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
	    method14514(class145_sub2.anIntArray9797,
			class145_sub2.anIntArray9798, anInt8995 - i_88_,
			-i_89_ - (anInt8998 - anInt8997));
	}
    }
    
    abstract void method14513(boolean bool, boolean bool_90_, boolean bool_91_,
			      int i, int i_92_, float f, int i_93_, int i_94_,
			      int i_95_, int i_96_, int i_97_, int i_98_,
			      boolean bool_99_);
    
    static {
	anInt9017 = 0;
	anInt8996 = 0;
	anInt9019 = 0;
    }
    
    public abstract void method2684(int i, int i_100_, int i_101_, int i_102_,
				    int i_103_);
    
    public abstract void method2685(int i, int i_104_, Class145 class145,
				    int i_105_, int i_106_);
    
    abstract void method2686(int i, int i_107_, int i_108_, int i_109_,
			     int i_110_, int i_111_, int i_112_, int i_113_);
    
    public void method2705(int i, int i_114_, int i_115_, int i_116_,
			   int i_117_, int i_118_, int i_119_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (anIntArray8991 == null)
	    anIntArray8991 = new int[4];
	aClass185_Sub2_9016.method3360(anIntArray8991);
	aClass185_Sub2_9016.method3282((aClass185_Sub2_9016.anInt9365
					* 1709859847),
				       aClass185_Sub2_9016.anInt9344 * 9823353,
				       i + i_115_, i_114_ + i_116_);
	int i_120_ = method22();
	int i_121_ = method2692();
	int i_122_ = (i_115_ + i_120_ - 1) / i_120_;
	int i_123_ = (i_116_ + i_121_ - 1) / i_121_;
	for (int i_124_ = 0; i_124_ < i_123_; i_124_++) {
	    int i_125_ = i_124_ * i_121_;
	    for (int i_126_ = 0; i_126_ < i_122_; i_126_++)
		method2657(i + i_126_ * i_120_, i_114_ + i_125_, i_117_,
			   i_118_, i_119_);
	}
	aClass185_Sub2_9016.method3373(anIntArray8991[0], anIntArray8991[1],
				       anIntArray8991[2], anIntArray8991[3]);
    }
    
    public int method2692() {
	return anInt8989 + anInt9002 + anInt8990;
    }
    
    abstract void method2718(int i, int i_127_, int i_128_, int i_129_,
			     int i_130_, int i_131_, int i_132_, int i_133_);
    
    abstract void method2687(int i, int i_134_, int i_135_, int i_136_,
			     int i_137_, int i_138_, int i_139_, int i_140_);
    
    public int method2698() {
	return anInt8985;
    }
    
    abstract void method14514(int[] is, int[] is_141_, int i, int i_142_);
    
    abstract void method14515(int i, int i_143_);
    
    abstract void method14516(int i, int i_144_);
    
    abstract void method14517(int[] is, int[] is_145_, int i, int i_146_);
    
    void method2671(float f, float f_147_, float f_148_, float f_149_,
		    float f_150_, float f_151_, int i, int i_152_, int i_153_,
		    int i_154_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (method14510(f, f_147_, f_148_, f_149_, f_150_, f_151_)) {
	    anInt9011 = i_152_;
	    if (i != 1) {
		anInt9012 = i_152_ >>> 24;
		anInt9013 = 256 - anInt9012;
		if (i == 0) {
		    anInt9014 = (i_152_ & 0xff0000) >> 16;
		    anInt9015 = (i_152_ & 0xff00) >> 8;
		    anInt9018 = i_152_ & 0xff;
		} else if (i == 2) {
		    anInt9017 = i_152_ >>> 24;
		    anInt8996 = 256 - anInt9017;
		    int i_155_ = (i_152_ & 0xff00ff) * anInt8996 & ~0xff00ff;
		    int i_156_ = (i_152_ & 0xff00) * anInt8996 & 0xff0000;
		    anInt9019 = (i_155_ | i_156_) >>> 8;
		}
	    }
	    method14512(i, i_153_);
	}
    }
    
    public abstract void method2737(int i, int i_157_, int i_158_, int i_159_,
				    int[] is, int i_160_, int i_161_);
    
    public void method2679(int i, int i_162_, int i_163_, int i_164_) {
	anInt8987 = i;
	anInt8989 = i_162_;
	anInt8992 = i_163_;
	anInt8990 = i_164_;
    }
    
    public void method2733(int[] is) {
	is[0] = anInt8987;
	is[1] = anInt8989;
	is[2] = anInt8992;
	is[3] = anInt8990;
    }
    
    public void method2741(int[] is) {
	is[0] = anInt8987;
	is[1] = anInt8989;
	is[2] = anInt8992;
	is[3] = anInt8990;
    }
    
    public int method2669() {
	return anInt8989 + anInt9002 + anInt8990;
    }
    
    public int method22() {
	return anInt8987 + anInt8985 + anInt8992;
    }
    
    void method2711(float f, float f_165_, float f_166_, float f_167_,
		    float f_168_, float f_169_, int i, int i_170_, int i_171_,
		    int i_172_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (method14510(f, f_165_, f_166_, f_167_, f_168_, f_169_)) {
	    anInt9011 = i_170_;
	    if (i != 1) {
		anInt9012 = i_170_ >>> 24;
		anInt9013 = 256 - anInt9012;
		if (i == 0) {
		    anInt9014 = (i_170_ & 0xff0000) >> 16;
		    anInt9015 = (i_170_ & 0xff00) >> 8;
		    anInt9018 = i_170_ & 0xff;
		} else if (i == 2) {
		    anInt9017 = i_170_ >>> 24;
		    anInt8996 = 256 - anInt9017;
		    int i_173_ = (i_170_ & 0xff00ff) * anInt8996 & ~0xff00ff;
		    int i_174_ = (i_170_ & 0xff00) * anInt8996 & 0xff0000;
		    anInt9019 = (i_173_ | i_174_) >>> 8;
		}
	    }
	    method14512(i, i_171_);
	}
    }
    
    public int method2700() {
	return anInt8985;
    }
    
    public int method2701() {
	return anInt9002;
    }
    
    public int method21() {
	return anInt8987 + anInt8985 + anInt8992;
    }
    
    public int method20() {
	return anInt8987 + anInt8985 + anInt8992;
    }
    
    public int method23() {
	return anInt8987 + anInt8985 + anInt8992;
    }
    
    public void method2706(int i, int i_175_, int i_176_, int i_177_,
			   int i_178_, int i_179_, int i_180_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (anIntArray8991 == null)
	    anIntArray8991 = new int[4];
	aClass185_Sub2_9016.method3360(anIntArray8991);
	aClass185_Sub2_9016.method3282((aClass185_Sub2_9016.anInt9365
					* 1709859847),
				       aClass185_Sub2_9016.anInt9344 * 9823353,
				       i + i_176_, i_175_ + i_177_);
	int i_181_ = method22();
	int i_182_ = method2692();
	int i_183_ = (i_176_ + i_181_ - 1) / i_181_;
	int i_184_ = (i_177_ + i_182_ - 1) / i_182_;
	for (int i_185_ = 0; i_185_ < i_184_; i_185_++) {
	    int i_186_ = i_185_ * i_182_;
	    for (int i_187_ = 0; i_187_ < i_183_; i_187_++)
		method2657(i + i_187_ * i_181_, i_175_ + i_186_, i_178_,
			   i_179_, i_180_);
	}
	aClass185_Sub2_9016.method3373(anIntArray8991[0], anIntArray8991[1],
				       anIntArray8991[2], anIntArray8991[3]);
    }
    
    public void method2720(int i, int i_188_, int i_189_, int i_190_,
			   int i_191_, int i_192_, int i_193_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (anIntArray8991 == null)
	    anIntArray8991 = new int[4];
	aClass185_Sub2_9016.method3360(anIntArray8991);
	aClass185_Sub2_9016.method3282((aClass185_Sub2_9016.anInt9365
					* 1709859847),
				       aClass185_Sub2_9016.anInt9344 * 9823353,
				       i + i_189_, i_188_ + i_190_);
	int i_194_ = method22();
	int i_195_ = method2692();
	int i_196_ = (i_189_ + i_194_ - 1) / i_194_;
	int i_197_ = (i_190_ + i_195_ - 1) / i_195_;
	for (int i_198_ = 0; i_198_ < i_197_; i_198_++) {
	    int i_199_ = i_198_ * i_195_;
	    for (int i_200_ = 0; i_200_ < i_196_; i_200_++)
		method2657(i + i_200_ * i_194_, i_188_ + i_199_, i_191_,
			   i_192_, i_193_);
	}
	aClass185_Sub2_9016.method3373(anIntArray8991[0], anIntArray8991[1],
				       anIntArray8991[2], anIntArray8991[3]);
    }
    
    public int method2709() {
	return anInt8985;
    }
    
    boolean method14518(float f, float f_201_, float f_202_, float f_203_,
			float f_204_, float f_205_) {
	int i = anInt8987 + anInt8985 + anInt8992;
	int i_206_ = anInt8989 + anInt9002 + anInt8990;
	if (i != anInt8985 || i_206_ != anInt9002) {
	    float f_207_ = (f_202_ - f) / (float) i;
	    float f_208_ = (f_203_ - f_201_) / (float) i;
	    float f_209_ = (f_204_ - f) / (float) i_206_;
	    float f_210_ = (f_205_ - f_201_) / (float) i_206_;
	    float f_211_ = f_209_ * (float) anInt8989;
	    float f_212_ = f_210_ * (float) anInt8989;
	    float f_213_ = f_207_ * (float) anInt8987;
	    float f_214_ = f_208_ * (float) anInt8987;
	    float f_215_ = -f_207_ * (float) anInt8992;
	    float f_216_ = -f_208_ * (float) anInt8992;
	    float f_217_ = -f_209_ * (float) anInt8990;
	    float f_218_ = -f_210_ * (float) anInt8990;
	    f += f_213_ + f_211_;
	    f_201_ += f_214_ + f_212_;
	    f_202_ += f_215_ + f_211_;
	    f_203_ += f_216_ + f_212_;
	    f_204_ += f_213_ + f_217_;
	    f_205_ += f_214_ + f_218_;
	}
	float f_219_ = f_204_ + (f_202_ - f);
	float f_220_ = f_203_ + (f_205_ - f_201_);
	float f_221_;
	float f_222_;
	if (f < f_202_) {
	    f_221_ = f;
	    f_222_ = f_202_;
	} else {
	    f_221_ = f_202_;
	    f_222_ = f;
	}
	if (f_204_ < f_221_)
	    f_221_ = f_204_;
	if (f_219_ < f_221_)
	    f_221_ = f_219_;
	if (f_204_ > f_222_)
	    f_222_ = f_204_;
	if (f_219_ > f_222_)
	    f_222_ = f_219_;
	float f_223_;
	float f_224_;
	if (f_201_ < f_203_) {
	    f_223_ = f_201_;
	    f_224_ = f_203_;
	} else {
	    f_223_ = f_203_;
	    f_224_ = f_201_;
	}
	if (f_205_ < f_223_)
	    f_223_ = f_205_;
	if (f_220_ < f_223_)
	    f_223_ = f_220_;
	if (f_205_ > f_224_)
	    f_224_ = f_205_;
	if (f_220_ > f_224_)
	    f_224_ = f_220_;
	if (f_221_ < (float) (aClass185_Sub2_9016.anInt9365 * 1709859847))
	    f_221_ = (float) (aClass185_Sub2_9016.anInt9365 * 1709859847);
	if (f_222_ > (float) (aClass185_Sub2_9016.anInt9343 * -1807368365))
	    f_222_ = (float) (aClass185_Sub2_9016.anInt9343 * -1807368365);
	if (f_223_ < (float) (aClass185_Sub2_9016.anInt9344 * 9823353))
	    f_223_ = (float) (aClass185_Sub2_9016.anInt9344 * 9823353);
	if (f_224_ > (float) (aClass185_Sub2_9016.anInt9345 * 639238427))
	    f_224_ = (float) (aClass185_Sub2_9016.anInt9345 * 639238427);
	f_222_ = f_221_ - f_222_;
	if (f_222_ >= 0.0F)
	    return false;
	f_224_ = f_223_ - f_224_;
	if (f_224_ >= 0.0F)
	    return false;
	anInt8993 = aClass185_Sub2_9016.anInt9356 * 356365251;
	anInt8988 = (int) ((float) ((int) f_223_ * anInt8993) + f_221_);
	float f_225_ = ((f_202_ - f) * (f_205_ - f_201_)
			- (f_203_ - f_201_) * (f_204_ - f));
	float f_226_ = ((f_204_ - f) * (f_203_ - f_201_)
			- (f_205_ - f_201_) * (f_202_ - f));
	anInt9001
	    = (int) ((f_205_ - f_201_) * 4096.0F * (float) anInt8985 / f_225_);
	anInt9000
	    = (int) ((f_203_ - f_201_) * 4096.0F * (float) anInt9002 / f_226_);
	anInt9008
	    = (int) ((f_204_ - f) * 4096.0F * (float) anInt8985 / f_226_);
	anInt9004
	    = (int) ((f_202_ - f) * 4096.0F * (float) anInt9002 / f_225_);
	anInt9005 = (int) (f_221_ * 16.0F + 8.0F
			   - (f + f_202_ + f_204_ + f_219_) / 4.0F * 16.0F);
	anInt9006
	    = (int) (f_223_ * 16.0F + 8.0F
		     - (f_201_ + f_203_ + f_205_ + f_220_) / 4.0F * 16.0F);
	anInt9007 = (anInt8985 >> 1 << 12) + (anInt9006 * anInt9008 >> 4);
	anInt9003 = (anInt9002 >> 1 << 12) + (anInt9006 * anInt9004 >> 4);
	anInt9009 = anInt9005 * anInt9001 >> 4;
	anInt9010 = anInt9005 * anInt9000 >> 4;
	anInt8995 = (int) f_221_;
	anInt8999 = (int) f_222_;
	anInt8997 = (int) f_223_;
	anInt8998 = (int) f_224_;
	return true;
    }
    
    abstract void method14519(int i, int i_227_);
    
    void method2707(float f, float f_228_, float f_229_, float f_230_,
		    float f_231_, float f_232_, int i, Class145 class145,
		    int i_233_, int i_234_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (method14510(f, f_228_, f_229_, f_230_, f_231_, f_232_)) {
	    Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
	    method14514(class145_sub2.anIntArray9797,
			class145_sub2.anIntArray9798, anInt8995 - i_233_,
			-i_234_ - (anInt8998 - anInt8997));
	}
    }
    
    void method2708(float f, float f_235_, float f_236_, float f_237_,
		    float f_238_, float f_239_, int i, Class145 class145,
		    int i_240_, int i_241_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (method14510(f, f_235_, f_236_, f_237_, f_238_, f_239_)) {
	    Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
	    method14514(class145_sub2.anIntArray9797,
			class145_sub2.anIntArray9798, anInt8995 - i_240_,
			-i_241_ - (anInt8998 - anInt8997));
	}
    }
    
    void method2719(float f, float f_242_, float f_243_, float f_244_,
		    float f_245_, float f_246_, int i, int i_247_, int i_248_,
		    int i_249_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (method14510(f, f_242_, f_243_, f_244_, f_245_, f_246_)) {
	    anInt9011 = i_247_;
	    if (i != 1) {
		anInt9012 = i_247_ >>> 24;
		anInt9013 = 256 - anInt9012;
		if (i == 0) {
		    anInt9014 = (i_247_ & 0xff0000) >> 16;
		    anInt9015 = (i_247_ & 0xff00) >> 8;
		    anInt9018 = i_247_ & 0xff;
		} else if (i == 2) {
		    anInt9017 = i_247_ >>> 24;
		    anInt8996 = 256 - anInt9017;
		    int i_250_ = (i_247_ & 0xff00ff) * anInt8996 & ~0xff00ff;
		    int i_251_ = (i_247_ & 0xff00) * anInt8996 & 0xff0000;
		    anInt9019 = (i_250_ | i_251_) >>> 8;
		}
	    }
	    method14512(i, i_248_);
	}
    }
    
    void method2710(float f, float f_252_, float f_253_, float f_254_,
		    float f_255_, float f_256_, int i, int i_257_, int i_258_,
		    int i_259_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (method14510(f, f_252_, f_253_, f_254_, f_255_, f_256_)) {
	    anInt9011 = i_257_;
	    if (i != 1) {
		anInt9012 = i_257_ >>> 24;
		anInt9013 = 256 - anInt9012;
		if (i == 0) {
		    anInt9014 = (i_257_ & 0xff0000) >> 16;
		    anInt9015 = (i_257_ & 0xff00) >> 8;
		    anInt9018 = i_257_ & 0xff;
		} else if (i == 2) {
		    anInt9017 = i_257_ >>> 24;
		    anInt8996 = 256 - anInt9017;
		    int i_260_ = (i_257_ & 0xff00ff) * anInt8996 & ~0xff00ff;
		    int i_261_ = (i_257_ & 0xff00) * anInt8996 & 0xff0000;
		    anInt9019 = (i_260_ | i_261_) >>> 8;
		}
	    }
	    method14512(i, i_258_);
	}
    }
    
    public int method2649() {
	return anInt9002;
    }
    
    void method2677(float f, float f_262_, float f_263_, float f_264_,
		    float f_265_, float f_266_, int i, int i_267_, int i_268_,
		    int i_269_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (method14510(f, f_262_, f_263_, f_264_, f_265_, f_266_)) {
	    anInt9011 = i_267_;
	    if (i != 1) {
		anInt9012 = i_267_ >>> 24;
		anInt9013 = 256 - anInt9012;
		if (i == 0) {
		    anInt9014 = (i_267_ & 0xff0000) >> 16;
		    anInt9015 = (i_267_ & 0xff00) >> 8;
		    anInt9018 = i_267_ & 0xff;
		} else if (i == 2) {
		    anInt9017 = i_267_ >>> 24;
		    anInt8996 = 256 - anInt9017;
		    int i_270_ = (i_267_ & 0xff00ff) * anInt8996 & ~0xff00ff;
		    int i_271_ = (i_267_ & 0xff00) * anInt8996 & 0xff0000;
		    anInt9019 = (i_270_ | i_271_) >>> 8;
		}
	    }
	    method14512(i, i_268_);
	}
    }
}
