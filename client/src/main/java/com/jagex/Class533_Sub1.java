/* Class533_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Random;

public class Class533_Sub1 extends Class533
{
    static float[][] aFloatArrayArray10801
	= { { -0.333333F, -0.333333F, -0.333333F },
	    { 0.333333F, -0.333333F, -0.333333F },
	    { -0.333333F, 0.333333F, -0.333333F },
	    { 0.333333F, 0.333333F, -0.333333F },
	    { -0.333333F, -0.333333F, 0.333333F },
	    { 0.333333F, -0.333333F, 0.333333F },
	    { -0.333333F, 0.333333F, 0.333333F },
	    { 0.333333F, 0.333333F, 0.333333F } };
    int[] anIntArray10802 = new int[512];
    
    void method8886(int i, int i_0_, int i_1_, int i_2_, float f, float f_3_,
		    float f_4_, float f_5_, float[] fs, int i_6_) {
	int i_7_ = (int) ((float) i_0_ * f - 1.0F);
	i_7_ &= 0xff;
	int i_8_ = (int) ((float) i_1_ * f_3_ - 1.0F);
	i_8_ &= 0xff;
	int i_9_ = (int) ((float) i_2_ * f_4_ - 1.0F);
	i_9_ &= 0xff;
	float f_10_ = (float) i * f_4_;
	int i_11_ = (int) f_10_;
	int i_12_ = i_11_ + 1;
	float f_13_ = f_10_ - (float) i_11_;
	float f_14_ = 1.0F - f_13_;
	float f_15_ = method16493(f_13_);
	i_11_ &= i_9_;
	i_12_ &= i_9_;
	int i_16_ = anIntArray10802[i_11_];
	int i_17_ = anIntArray10802[i_12_];
	for (int i_18_ = 0; i_18_ < i_1_; i_18_++) {
	    float f_19_ = (float) i_18_ * f_3_;
	    int i_20_ = (int) f_19_;
	    int i_21_ = i_20_ + 1;
	    float f_22_ = f_19_ - (float) i_20_;
	    float f_23_ = 1.0F - f_22_;
	    float f_24_ = method16493(f_22_);
	    i_20_ &= i_8_;
	    i_21_ &= i_8_;
	    int i_25_ = anIntArray10802[i_20_ + i_16_];
	    int i_26_ = anIntArray10802[i_21_ + i_16_];
	    int i_27_ = anIntArray10802[i_20_ + i_17_];
	    int i_28_ = anIntArray10802[i_21_ + i_17_];
	    for (int i_29_ = 0; i_29_ < i_0_; i_29_++) {
		float f_30_ = (float) i_29_ * f;
		int i_31_ = (int) f_30_;
		int i_32_ = i_31_ + 1;
		float f_33_ = f_30_ - (float) i_31_;
		float f_34_ = 1.0F - f_33_;
		float f_35_ = method16493(f_33_);
		i_31_ &= i_7_;
		i_32_ &= i_7_;
		fs[i_6_++]
		    = (f_5_
		       * (method16491
			  ((method16491
			    (method16491(method16497((anIntArray10802
						      [i_31_ + i_25_]) & 0x7,
						     f_34_, f_23_, f_14_),
					 method16497((anIntArray10802
						      [i_32_ + i_25_]) & 0x7,
						     f_33_, f_23_, f_14_),
					 f_35_),
			     method16491(method16497((anIntArray10802
						      [i_31_ + i_26_]) & 0x7,
						     f_34_, f_22_, f_14_),
					 method16497((anIntArray10802
						      [i_32_ + i_26_]) & 0x7,
						     f_33_, f_22_, f_14_),
					 f_35_),
			     f_24_)),
			   (method16491
			    (method16491(method16497((anIntArray10802
						      [i_31_ + i_27_]) & 0x7,
						     f_34_, f_23_, f_13_),
					 method16497((anIntArray10802
						      [i_32_ + i_27_]) & 0x7,
						     f_33_, f_23_, f_13_),
					 f_35_),
			     method16491(method16497((anIntArray10802
						      [i_31_ + i_28_]) & 0x7,
						     f_34_, f_22_, f_13_),
					 method16497((anIntArray10802
						      [i_32_ + i_28_]) & 0x7,
						     f_33_, f_22_, f_13_),
					 f_35_),
			     f_24_)),
			   f_15_)));
	    }
	}
    }
    
    static final float method16491(float f, float f_36_, float f_37_) {
	return f + (f_36_ - f) * f_37_;
    }
    
    void method8883(int i, int i_38_, int i_39_, int i_40_, float f,
		    float f_41_, float f_42_, float f_43_, float[] fs,
		    int i_44_) {
	int i_45_ = (int) ((float) i_38_ * f - 1.0F);
	i_45_ &= 0xff;
	int i_46_ = (int) ((float) i_39_ * f_41_ - 1.0F);
	i_46_ &= 0xff;
	int i_47_ = (int) ((float) i_40_ * f_42_ - 1.0F);
	i_47_ &= 0xff;
	float f_48_ = (float) i * f_42_;
	int i_49_ = (int) f_48_;
	int i_50_ = i_49_ + 1;
	float f_51_ = f_48_ - (float) i_49_;
	float f_52_ = 1.0F - f_51_;
	float f_53_ = method16493(f_51_);
	i_49_ &= i_47_;
	i_50_ &= i_47_;
	int i_54_ = anIntArray10802[i_49_];
	int i_55_ = anIntArray10802[i_50_];
	for (int i_56_ = 0; i_56_ < i_39_; i_56_++) {
	    float f_57_ = (float) i_56_ * f_41_;
	    int i_58_ = (int) f_57_;
	    int i_59_ = i_58_ + 1;
	    float f_60_ = f_57_ - (float) i_58_;
	    float f_61_ = 1.0F - f_60_;
	    float f_62_ = method16493(f_60_);
	    i_58_ &= i_46_;
	    i_59_ &= i_46_;
	    int i_63_ = anIntArray10802[i_58_ + i_54_];
	    int i_64_ = anIntArray10802[i_59_ + i_54_];
	    int i_65_ = anIntArray10802[i_58_ + i_55_];
	    int i_66_ = anIntArray10802[i_59_ + i_55_];
	    for (int i_67_ = 0; i_67_ < i_38_; i_67_++) {
		float f_68_ = (float) i_67_ * f;
		int i_69_ = (int) f_68_;
		int i_70_ = i_69_ + 1;
		float f_71_ = f_68_ - (float) i_69_;
		float f_72_ = 1.0F - f_71_;
		float f_73_ = method16493(f_71_);
		i_69_ &= i_45_;
		i_70_ &= i_45_;
		fs[i_44_++]
		    = (f_43_
		       * (method16491
			  ((method16491
			    (method16491(method16497((anIntArray10802
						      [i_69_ + i_63_]) & 0x7,
						     f_72_, f_61_, f_52_),
					 method16497((anIntArray10802
						      [i_70_ + i_63_]) & 0x7,
						     f_71_, f_61_, f_52_),
					 f_73_),
			     method16491(method16497((anIntArray10802
						      [i_69_ + i_64_]) & 0x7,
						     f_72_, f_60_, f_52_),
					 method16497((anIntArray10802
						      [i_70_ + i_64_]) & 0x7,
						     f_71_, f_60_, f_52_),
					 f_73_),
			     f_62_)),
			   (method16491
			    (method16491(method16497((anIntArray10802
						      [i_69_ + i_65_]) & 0x7,
						     f_72_, f_61_, f_51_),
					 method16497((anIntArray10802
						      [i_70_ + i_65_]) & 0x7,
						     f_71_, f_61_, f_51_),
					 f_73_),
			     method16491(method16497((anIntArray10802
						      [i_69_ + i_66_]) & 0x7,
						     f_72_, f_60_, f_51_),
					 method16497((anIntArray10802
						      [i_70_ + i_66_]) & 0x7,
						     f_71_, f_60_, f_51_),
					 f_73_),
			     f_62_)),
			   f_53_)));
	    }
	}
    }
    
    public Class533_Sub1(int i) {
	Random random = new Random((long) i);
	for (int i_74_ = 0; i_74_ < 256; i_74_++)
	    anIntArray10802[i_74_] = anIntArray10802[i_74_ + 256] = i_74_;
	for (int i_75_ = 0; i_75_ < 256; i_75_++) {
	    int i_76_ = random.nextInt() & 0xff;
	    int i_77_ = anIntArray10802[i_76_];
	    anIntArray10802[i_76_] = anIntArray10802[i_76_ + 256]
		= anIntArray10802[i_75_];
	    anIntArray10802[i_75_] = anIntArray10802[i_75_ + 256] = i_77_;
	}
    }
    
    void method8882(int i, int i_78_, int i_79_, int i_80_, float f,
		    float f_81_, float f_82_, float f_83_, float[] fs,
		    int i_84_) {
	int i_85_ = (int) ((float) i_78_ * f - 1.0F);
	i_85_ &= 0xff;
	int i_86_ = (int) ((float) i_79_ * f_81_ - 1.0F);
	i_86_ &= 0xff;
	int i_87_ = (int) ((float) i_80_ * f_82_ - 1.0F);
	i_87_ &= 0xff;
	float f_88_ = (float) i * f_82_;
	int i_89_ = (int) f_88_;
	int i_90_ = i_89_ + 1;
	float f_91_ = f_88_ - (float) i_89_;
	float f_92_ = 1.0F - f_91_;
	float f_93_ = method16493(f_91_);
	i_89_ &= i_87_;
	i_90_ &= i_87_;
	int i_94_ = anIntArray10802[i_89_];
	int i_95_ = anIntArray10802[i_90_];
	for (int i_96_ = 0; i_96_ < i_79_; i_96_++) {
	    float f_97_ = (float) i_96_ * f_81_;
	    int i_98_ = (int) f_97_;
	    int i_99_ = i_98_ + 1;
	    float f_100_ = f_97_ - (float) i_98_;
	    float f_101_ = 1.0F - f_100_;
	    float f_102_ = method16493(f_100_);
	    i_98_ &= i_86_;
	    i_99_ &= i_86_;
	    int i_103_ = anIntArray10802[i_98_ + i_94_];
	    int i_104_ = anIntArray10802[i_99_ + i_94_];
	    int i_105_ = anIntArray10802[i_98_ + i_95_];
	    int i_106_ = anIntArray10802[i_99_ + i_95_];
	    for (int i_107_ = 0; i_107_ < i_78_; i_107_++) {
		float f_108_ = (float) i_107_ * f;
		int i_109_ = (int) f_108_;
		int i_110_ = i_109_ + 1;
		float f_111_ = f_108_ - (float) i_109_;
		float f_112_ = 1.0F - f_111_;
		float f_113_ = method16493(f_111_);
		i_109_ &= i_85_;
		i_110_ &= i_85_;
		fs[i_84_++]
		    = (f_83_
		       * (method16491
			  ((method16491
			    (method16491(method16497((anIntArray10802
						      [i_109_ + i_103_]) & 0x7,
						     f_112_, f_101_, f_92_),
					 method16497((anIntArray10802
						      [i_110_ + i_103_]) & 0x7,
						     f_111_, f_101_, f_92_),
					 f_113_),
			     method16491(method16497((anIntArray10802
						      [i_109_ + i_104_]) & 0x7,
						     f_112_, f_100_, f_92_),
					 method16497((anIntArray10802
						      [i_110_ + i_104_]) & 0x7,
						     f_111_, f_100_, f_92_),
					 f_113_),
			     f_102_)),
			   (method16491
			    (method16491(method16497((anIntArray10802
						      [i_109_ + i_105_]) & 0x7,
						     f_112_, f_101_, f_91_),
					 method16497((anIntArray10802
						      [i_110_ + i_105_]) & 0x7,
						     f_111_, f_101_, f_91_),
					 f_113_),
			     method16491(method16497((anIntArray10802
						      [i_109_ + i_106_]) & 0x7,
						     f_112_, f_100_, f_91_),
					 method16497((anIntArray10802
						      [i_110_ + i_106_]) & 0x7,
						     f_111_, f_100_, f_91_),
					 f_113_),
			     f_102_)),
			   f_93_)));
	    }
	}
    }
    
    static final float method16492(float f, float f_114_, float f_115_) {
	return f + (f_114_ - f) * f_115_;
    }
    
    static final float method16493(float f) {
	return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
    }
    
    static final float method16494(float f) {
	return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
    }
    
    static final float method16495(float f, float f_116_, float f_117_) {
	return f + (f_116_ - f) * f_117_;
    }
    
    static final float method16496(float f) {
	return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
    }
    
    static final float method16497(int i, float f, float f_118_,
				   float f_119_) {
	float[] fs = aFloatArrayArray10801[i];
	return fs[0] * f + fs[1] * f_118_ + fs[2] * f_119_;
    }
    
    void method8884(int i, int i_120_, int i_121_, int i_122_, float f,
		    float f_123_, float f_124_, float f_125_, float[] fs,
		    int i_126_) {
	int i_127_ = (int) ((float) i_120_ * f - 1.0F);
	i_127_ &= 0xff;
	int i_128_ = (int) ((float) i_121_ * f_123_ - 1.0F);
	i_128_ &= 0xff;
	int i_129_ = (int) ((float) i_122_ * f_124_ - 1.0F);
	i_129_ &= 0xff;
	float f_130_ = (float) i * f_124_;
	int i_131_ = (int) f_130_;
	int i_132_ = i_131_ + 1;
	float f_133_ = f_130_ - (float) i_131_;
	float f_134_ = 1.0F - f_133_;
	float f_135_ = method16493(f_133_);
	i_131_ &= i_129_;
	i_132_ &= i_129_;
	int i_136_ = anIntArray10802[i_131_];
	int i_137_ = anIntArray10802[i_132_];
	for (int i_138_ = 0; i_138_ < i_121_; i_138_++) {
	    float f_139_ = (float) i_138_ * f_123_;
	    int i_140_ = (int) f_139_;
	    int i_141_ = i_140_ + 1;
	    float f_142_ = f_139_ - (float) i_140_;
	    float f_143_ = 1.0F - f_142_;
	    float f_144_ = method16493(f_142_);
	    i_140_ &= i_128_;
	    i_141_ &= i_128_;
	    int i_145_ = anIntArray10802[i_140_ + i_136_];
	    int i_146_ = anIntArray10802[i_141_ + i_136_];
	    int i_147_ = anIntArray10802[i_140_ + i_137_];
	    int i_148_ = anIntArray10802[i_141_ + i_137_];
	    for (int i_149_ = 0; i_149_ < i_120_; i_149_++) {
		float f_150_ = (float) i_149_ * f;
		int i_151_ = (int) f_150_;
		int i_152_ = i_151_ + 1;
		float f_153_ = f_150_ - (float) i_151_;
		float f_154_ = 1.0F - f_153_;
		float f_155_ = method16493(f_153_);
		i_151_ &= i_127_;
		i_152_ &= i_127_;
		fs[i_126_++]
		    = (f_125_
		       * (method16491
			  ((method16491
			    (method16491(method16497((anIntArray10802
						      [i_151_ + i_145_]) & 0x7,
						     f_154_, f_143_, f_134_),
					 method16497((anIntArray10802
						      [i_152_ + i_145_]) & 0x7,
						     f_153_, f_143_, f_134_),
					 f_155_),
			     method16491(method16497((anIntArray10802
						      [i_151_ + i_146_]) & 0x7,
						     f_154_, f_142_, f_134_),
					 method16497((anIntArray10802
						      [i_152_ + i_146_]) & 0x7,
						     f_153_, f_142_, f_134_),
					 f_155_),
			     f_144_)),
			   (method16491
			    (method16491(method16497((anIntArray10802
						      [i_151_ + i_147_]) & 0x7,
						     f_154_, f_143_, f_133_),
					 method16497((anIntArray10802
						      [i_152_ + i_147_]) & 0x7,
						     f_153_, f_143_, f_133_),
					 f_155_),
			     method16491(method16497((anIntArray10802
						      [i_151_ + i_148_]) & 0x7,
						     f_154_, f_142_, f_133_),
					 method16497((anIntArray10802
						      [i_152_ + i_148_]) & 0x7,
						     f_153_, f_142_, f_133_),
					 f_155_),
			     f_144_)),
			   f_135_)));
	    }
	}
    }
    
    static final float method16498(float f) {
	return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
    }
    
    void method8885(int i, int i_156_, int i_157_, int i_158_, float f,
		    float f_159_, float f_160_, float f_161_, float[] fs,
		    int i_162_) {
	int i_163_ = (int) ((float) i_156_ * f - 1.0F);
	i_163_ &= 0xff;
	int i_164_ = (int) ((float) i_157_ * f_159_ - 1.0F);
	i_164_ &= 0xff;
	int i_165_ = (int) ((float) i_158_ * f_160_ - 1.0F);
	i_165_ &= 0xff;
	float f_166_ = (float) i * f_160_;
	int i_167_ = (int) f_166_;
	int i_168_ = i_167_ + 1;
	float f_169_ = f_166_ - (float) i_167_;
	float f_170_ = 1.0F - f_169_;
	float f_171_ = method16493(f_169_);
	i_167_ &= i_165_;
	i_168_ &= i_165_;
	int i_172_ = anIntArray10802[i_167_];
	int i_173_ = anIntArray10802[i_168_];
	for (int i_174_ = 0; i_174_ < i_157_; i_174_++) {
	    float f_175_ = (float) i_174_ * f_159_;
	    int i_176_ = (int) f_175_;
	    int i_177_ = i_176_ + 1;
	    float f_178_ = f_175_ - (float) i_176_;
	    float f_179_ = 1.0F - f_178_;
	    float f_180_ = method16493(f_178_);
	    i_176_ &= i_164_;
	    i_177_ &= i_164_;
	    int i_181_ = anIntArray10802[i_176_ + i_172_];
	    int i_182_ = anIntArray10802[i_177_ + i_172_];
	    int i_183_ = anIntArray10802[i_176_ + i_173_];
	    int i_184_ = anIntArray10802[i_177_ + i_173_];
	    for (int i_185_ = 0; i_185_ < i_156_; i_185_++) {
		float f_186_ = (float) i_185_ * f;
		int i_187_ = (int) f_186_;
		int i_188_ = i_187_ + 1;
		float f_189_ = f_186_ - (float) i_187_;
		float f_190_ = 1.0F - f_189_;
		float f_191_ = method16493(f_189_);
		i_187_ &= i_163_;
		i_188_ &= i_163_;
		fs[i_162_++]
		    = (f_161_
		       * (method16491
			  ((method16491
			    (method16491(method16497((anIntArray10802
						      [i_187_ + i_181_]) & 0x7,
						     f_190_, f_179_, f_170_),
					 method16497((anIntArray10802
						      [i_188_ + i_181_]) & 0x7,
						     f_189_, f_179_, f_170_),
					 f_191_),
			     method16491(method16497((anIntArray10802
						      [i_187_ + i_182_]) & 0x7,
						     f_190_, f_178_, f_170_),
					 method16497((anIntArray10802
						      [i_188_ + i_182_]) & 0x7,
						     f_189_, f_178_, f_170_),
					 f_191_),
			     f_180_)),
			   (method16491
			    (method16491(method16497((anIntArray10802
						      [i_187_ + i_183_]) & 0x7,
						     f_190_, f_179_, f_169_),
					 method16497((anIntArray10802
						      [i_188_ + i_183_]) & 0x7,
						     f_189_, f_179_, f_169_),
					 f_191_),
			     method16491(method16497((anIntArray10802
						      [i_187_ + i_184_]) & 0x7,
						     f_190_, f_178_, f_169_),
					 method16497((anIntArray10802
						      [i_188_ + i_184_]) & 0x7,
						     f_189_, f_178_, f_169_),
					 f_191_),
			     f_180_)),
			   f_171_)));
	    }
	}
    }
    
    void method8881(int i, int i_192_, int i_193_, int i_194_, float f,
		    float f_195_, float f_196_, float f_197_, float[] fs,
		    int i_198_) {
	int i_199_ = (int) ((float) i_192_ * f - 1.0F);
	i_199_ &= 0xff;
	int i_200_ = (int) ((float) i_193_ * f_195_ - 1.0F);
	i_200_ &= 0xff;
	int i_201_ = (int) ((float) i_194_ * f_196_ - 1.0F);
	i_201_ &= 0xff;
	float f_202_ = (float) i * f_196_;
	int i_203_ = (int) f_202_;
	int i_204_ = i_203_ + 1;
	float f_205_ = f_202_ - (float) i_203_;
	float f_206_ = 1.0F - f_205_;
	float f_207_ = method16493(f_205_);
	i_203_ &= i_201_;
	i_204_ &= i_201_;
	int i_208_ = anIntArray10802[i_203_];
	int i_209_ = anIntArray10802[i_204_];
	for (int i_210_ = 0; i_210_ < i_193_; i_210_++) {
	    float f_211_ = (float) i_210_ * f_195_;
	    int i_212_ = (int) f_211_;
	    int i_213_ = i_212_ + 1;
	    float f_214_ = f_211_ - (float) i_212_;
	    float f_215_ = 1.0F - f_214_;
	    float f_216_ = method16493(f_214_);
	    i_212_ &= i_200_;
	    i_213_ &= i_200_;
	    int i_217_ = anIntArray10802[i_212_ + i_208_];
	    int i_218_ = anIntArray10802[i_213_ + i_208_];
	    int i_219_ = anIntArray10802[i_212_ + i_209_];
	    int i_220_ = anIntArray10802[i_213_ + i_209_];
	    for (int i_221_ = 0; i_221_ < i_192_; i_221_++) {
		float f_222_ = (float) i_221_ * f;
		int i_223_ = (int) f_222_;
		int i_224_ = i_223_ + 1;
		float f_225_ = f_222_ - (float) i_223_;
		float f_226_ = 1.0F - f_225_;
		float f_227_ = method16493(f_225_);
		i_223_ &= i_199_;
		i_224_ &= i_199_;
		fs[i_198_++]
		    = (f_197_
		       * (method16491
			  ((method16491
			    (method16491(method16497((anIntArray10802
						      [i_223_ + i_217_]) & 0x7,
						     f_226_, f_215_, f_206_),
					 method16497((anIntArray10802
						      [i_224_ + i_217_]) & 0x7,
						     f_225_, f_215_, f_206_),
					 f_227_),
			     method16491(method16497((anIntArray10802
						      [i_223_ + i_218_]) & 0x7,
						     f_226_, f_214_, f_206_),
					 method16497((anIntArray10802
						      [i_224_ + i_218_]) & 0x7,
						     f_225_, f_214_, f_206_),
					 f_227_),
			     f_216_)),
			   (method16491
			    (method16491(method16497((anIntArray10802
						      [i_223_ + i_219_]) & 0x7,
						     f_226_, f_215_, f_205_),
					 method16497((anIntArray10802
						      [i_224_ + i_219_]) & 0x7,
						     f_225_, f_215_, f_205_),
					 f_227_),
			     method16491(method16497((anIntArray10802
						      [i_223_ + i_220_]) & 0x7,
						     f_226_, f_214_, f_205_),
					 method16497((anIntArray10802
						      [i_224_ + i_220_]) & 0x7,
						     f_225_, f_214_, f_205_),
					 f_227_),
			     f_216_)),
			   f_207_)));
	    }
	}
    }
}
