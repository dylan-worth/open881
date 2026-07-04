/* Class185 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class Class185
{
    protected Class175 aClass175_1989;
    public static final int anInt1990 = 1;
    public static final int anInt1991 = 2;
    static final int anInt1992 = 4;
    public static final int anInt1993 = 5;
    public static final int anInt1994 = 3;
    static boolean[] aBoolArray1995 = new boolean[8];
    public static final int anInt1996 = 0;
    public Interface25 anInterface25_1997;
    protected static final int anInt1998 = 32;
    public Interface45 anInterface45_1999;
    public Interface48 anInterface48_2000;
    public int anInt2001;
    public static final int anInt2002 = 1;
    protected static final int anInt2003 = 4;
    protected static final int anInt2004 = 1;
    protected static final int anInt2005 = 2;
    protected static final int anInt2006 = 16;
    protected static final int anInt2007 = 8;
    static final int anInt2008 = 8;
    Class175_Sub1[] aClass175_Sub1Array2009;
    public float aFloat2010;
    int anInt2011 = -1400030897;
    public Class177 aClass177_2012;
    protected Class175_Sub2 aClass175_Sub2_2013;
    protected Hashtable aHashtable2014 = new Hashtable();
    public static final int anInt2015 = 2;
    protected int anInt2016;
    protected int anInt2017;
    public int anInt2018;
    public int anInt2019;
    protected int anInt2020;
    protected int anInt2021;
    public static final int anInt2022 = 0;
    static int anInt2023;
    
    public abstract void method3230();
    
    public abstract void method3231(int i, Class166 class166);
    
    public abstract Class176 method3232();
    
    public final void method3233(Canvas canvas) {
	if (aHashtable2014.containsKey(canvas)) {
	    Class175_Sub2 class175_sub2
		= (Class175_Sub2) aHashtable2014.get(canvas);
	    class175_sub2.method142();
	    aHashtable2014.remove(canvas);
	}
    }
    
    abstract void method3234(int i, int i_0_) throws Exception_Sub7;
    
    public abstract void method3235(boolean bool);
    
    public void method3236(int i) {
	aBoolArray1995[anInt2001 * 2098753835] = false;
	Enumeration enumeration = aHashtable2014.keys();
	while (enumeration.hasMoreElements()) {
	    Canvas canvas = (Canvas) enumeration.nextElement();
	    Class175_Sub2 class175_sub2
		= (Class175_Sub2) aHashtable2014.get(canvas);
	    class175_sub2.method142();
	}
	method3327();
    }
    
    public void method3237(boolean bool) {
	/* empty */
    }
    
    public final void method3238() throws Exception_Sub7 {
	method3234(0, 0);
    }
    
    public abstract int method3239();
    
    public void finalize() {
	method3236(-568376843);
    }
    
    public abstract boolean method3240();
    
    public abstract boolean method3241();
    
    public abstract boolean method3242();
    
    public final void method3243(Canvas canvas, int i, int i_1_, short i_2_) {
	if (!aHashtable2014.containsKey(canvas)) {
	    Class481.method7927(canvas, -1181268133);
	    method3256(canvas, method3262(canvas, i, i_1_), (byte) 4);
	}
    }
    
    abstract Class175_Sub2 method3244(Canvas canvas, int i, int i_3_);
    
    public abstract void method3245();
    
    public abstract boolean method3246();
    
    public abstract boolean method3247();
    
    abstract void method3248(int i, int i_4_, int i_5_, int i_6_, int i_7_);
    
    public abstract boolean method3249();
    
    public abstract String method3250();
    
    public abstract int[] method3251();
    
    public void method3252(int[] is) {
	if (aClass175_Sub2_2013 != null) {
	    is[0] = aClass175_Sub2_2013.method2910();
	    is[1] = aClass175_Sub2_2013.method2911();
	} else {
	    int[] is_8_ = is;
	    is[1] = 0;
	    is_8_[0] = 0;
	}
    }
    
    public final Class175 method3253(int i) {
	return aClass175_1989;
    }
    
    public final Class175_Sub2 method3254(int i) {
	return aClass175_Sub2_2013;
    }
    
    public static boolean method3255(int i) {
	return i == 0 || 2 == i;
    }
    
    final void method3256(Canvas canvas, Class175_Sub2 class175_sub2, byte i) {
	if (null == class175_sub2)
	    throw new RuntimeException("");
	aHashtable2014.put(canvas, class175_sub2);
    }
    
    public abstract Class446 method3257();
    
    public final void method3258(Canvas canvas, int i) {
	Class175_Sub2 class175_sub2
	    = (Class175_Sub2) aHashtable2014.get(canvas);
	if (null == class175_sub2)
	    throw new RuntimeException();
	if (anInt2011 * 19776081 > 0 || aClass175_Sub2_2013 != aClass175_1989)
	    throw new RuntimeException();
	if (aClass175_1989 != null)
	    aClass175_1989.method2912();
	if (19776081 * anInt2011 < 0)
	    aClass175_1989 = class175_sub2;
	aClass175_Sub2_2013 = class175_sub2;
	class175_sub2.method358();
    }
    
    public final void method3259(Canvas canvas, int i, int i_9_, int i_10_) {
	Class175_Sub2 class175_sub2
	    = (Class175_Sub2) aHashtable2014.get(canvas);
	if (null == class175_sub2)
	    throw new RuntimeException("");
	class175_sub2.method15477(i, i_9_);
    }
    
    public final void method3260(Class175_Sub1 class175_sub1, int i) {
	if (anInt2011 * 19776081 >= 3)
	    throw new RuntimeException();
	if (anInt2011 * 19776081 >= 0)
	    aClass175_Sub1Array2009[anInt2011 * 19776081].method2912();
	else
	    aClass175_Sub2_2013.method2912();
	aClass175_1989
	    = aClass175_Sub1Array2009[(anInt2011 += 1400030897) * 19776081]
	    = class175_sub1;
	class175_sub1.method358();
    }
    
    public final void method3261(Class175_Sub1 class175_sub1, int i) {
	if (19776081 * anInt2011 < 0
	    || class175_sub1 != aClass175_Sub1Array2009[anInt2011 * 19776081])
	    throw new RuntimeException();
	aClass175_Sub1Array2009[(anInt2011 -= 1400030897) * 19776081 + 1]
	    = null;
	class175_sub1.method2912();
	if (19776081 * anInt2011 >= 0) {
	    aClass175_1989 = aClass175_Sub1Array2009[anInt2011 * 19776081];
	    aClass175_Sub1Array2009[anInt2011 * 19776081].method358();
	} else {
	    aClass175_1989 = aClass175_Sub2_2013;
	    aClass175_Sub2_2013.method358();
	}
    }
    
    abstract Class175_Sub2 method3262(Canvas canvas, int i, int i_11_);
    
    public abstract Class175_Sub1 method3263();
    
    public Class163 method3264(int[] is, int i, int i_12_, int i_13_,
			       int i_14_) {
	return method3316(is, i, i_12_, i_13_, i_14_, true);
    }
    
    public abstract Interface21 method3265(int i, int i_15_);
    
    public abstract Interface21 method3266(int i, int i_16_, int i_17_);
    
    public abstract int[] method3267(int i, int i_18_, int i_19_, int i_20_);
    
    public abstract void method3268();
    
    public abstract boolean method3269();
    
    public abstract boolean method3270();
    
    public final void method3271(int i, int i_21_, int i_22_, int i_23_) {
	method3300(i, i_21_, i_22_, i_23_, 1);
    }
    
    public Class534_Sub21 method3272(int i, int i_24_, int i_25_, int i_26_,
				     int i_27_, float f) {
	return new Class534_Sub21(i, i_24_, i_25_, i_26_, i_27_, f);
    }
    
    public abstract int method3273();
    
    public abstract Class163 method3274(Class169 class169, boolean bool);
    
    public abstract void method3275(int i, int i_28_, int i_29_);
    
    public abstract Interface22 method3276(int i, int i_30_, Class181 class181,
					   Class173 class173, int i_31_);
    
    public abstract void method3277(long l);
    
    public abstract void method3278(int i, int i_32_, int[] is, int[] is_33_);
    
    public abstract Class163 method3279(Class169 class169, boolean bool);
    
    public abstract void method3280();
    
    public abstract void method3281();
    
    public abstract void method3282(int i, int i_34_, int i_35_, int i_36_);
    
    public abstract void method3283(int[] is);
    
    public abstract void method3284(float f, float f_37_);
    
    public abstract void method3285(int i, int i_38_);
    
    public abstract boolean method3286();
    
    public final void method3287(Canvas canvas) {
	Class175_Sub2 class175_sub2
	    = (Class175_Sub2) aHashtable2014.get(canvas);
	if (null == class175_sub2)
	    throw new RuntimeException();
	if (anInt2011 * 19776081 > 0 || aClass175_Sub2_2013 != aClass175_1989)
	    throw new RuntimeException();
	if (aClass175_1989 != null)
	    aClass175_1989.method2912();
	if (19776081 * anInt2011 < 0)
	    aClass175_1989 = class175_sub2;
	aClass175_Sub2_2013 = class175_sub2;
	class175_sub2.method358();
    }
    
    public abstract Class176 method3288();
    
    public final void method3289(int i) throws Exception_Sub7 {
	method3234(0, 0);
    }
    
    public abstract void method3290(int i, int i_39_, int i_40_, int i_41_);
    
    public abstract void method3291(int i, int i_42_, int i_43_, int i_44_,
				    int i_45_, int i_46_);
    
    public final void method3292(int i, int i_47_, int i_48_, int i_49_,
				 int i_50_, int i_51_) {
	method3298(i, i_47_, i_48_, i_49_, i_50_, 1);
    }
    
    public final void method3293(int i, int i_52_, int i_53_, int i_54_,
				 byte i_55_) {
	method3300(i, i_52_, i_53_, i_54_, 1);
    }
    
    public final void method3294(int i, int i_56_, int i_57_, int i_58_,
				 int i_59_) {
	method3248(i, i_56_, i_57_, i_58_, 1);
    }
    
    public final void method3295(Canvas canvas) {
	Class175_Sub2 class175_sub2
	    = (Class175_Sub2) aHashtable2014.get(canvas);
	if (null == class175_sub2)
	    throw new RuntimeException();
	if (anInt2011 * 19776081 > 0 || aClass175_Sub2_2013 != aClass175_1989)
	    throw new RuntimeException();
	if (aClass175_1989 != null)
	    aClass175_1989.method2912();
	if (19776081 * anInt2011 < 0)
	    aClass175_1989 = class175_sub2;
	aClass175_Sub2_2013 = class175_sub2;
	class175_sub2.method358();
    }
    
    public final void method3296(int i, int i_60_, int i_61_, int i_62_) {
	method3300(i, i_60_, i_61_, i_62_, 1);
    }
    
    public abstract void method3297(int i, int i_63_, int i_64_, int i_65_,
				    int i_66_, int i_67_);
    
    public abstract void method3298(int i, int i_68_, int i_69_, int i_70_,
				    int i_71_, int i_72_);
    
    public abstract void method3299(int i, int i_73_, float f, int i_74_,
				    int i_75_, float f_76_, int i_77_,
				    int i_78_, float f_79_, int i_80_,
				    int i_81_, int i_82_, int i_83_);
    
    abstract void method3300(int i, int i_84_, int i_85_, int i_86_,
			     int i_87_);
    
    public abstract void method3301(int i, int i_88_, int i_89_);
    
    public final void method3302(int i, int i_90_, int i_91_, int i_92_,
				 int i_93_) {
	method3680(i, i_90_, i_91_, i_92_, 1);
    }
    
    public abstract void method3303(int i, int i_94_, int i_95_, int i_96_,
				    int i_97_, int i_98_);
    
    public abstract boolean method3304();
    
    public abstract void method3305(int i, int i_99_, int i_100_, int i_101_,
				    int i_102_, int i_103_, int i_104_,
				    int i_105_, int i_106_);
    
    public abstract void method3306(int i, int i_107_, int i_108_, int i_109_,
				    int i_110_, int i_111_, Class145 class145,
				    int i_112_, int i_113_, int i_114_,
				    int i_115_, int i_116_);
    
    public abstract void method3307(int i, int i_117_, int i_118_, int i_119_,
				    int i_120_, int i_121_, int i_122_);
    
    public abstract int method3308(int i, int i_123_, int i_124_, int i_125_,
				   int i_126_, int i_127_);
    
    public boolean method3309(int i, int i_128_, Class446 class446,
			      Class432 class432, int i_129_) {
	return method3310(i, i_128_, 0, 0, class446, class432);
    }
    
    abstract boolean method3310(int i, int i_130_, int i_131_, int i_132_,
				Class446 class446, Class432 class432);
    
    public abstract void method3311(Class446 class446, Class194 class194,
				    Class432 class432);
    
    public abstract Class534_Sub2 method3312(int i);
    
    public abstract void method3313(int[] is);
    
    public Class163 method3314(int i, int i_133_, boolean bool, byte i_134_) {
	return method3315(i, i_133_, bool, false);
    }
    
    public abstract Class163 method3315(int i, int i_135_, boolean bool,
					boolean bool_136_);
    
    public abstract Class163 method3316(int[] is, int i, int i_137_,
					int i_138_, int i_139_, boolean bool);
    
    public Class163 method3317(int[] is, int i, int i_140_, int i_141_,
			       int i_142_, byte i_143_) {
	return method3316(is, i, i_140_, i_141_, i_142_, true);
    }
    
    public abstract void method3318(int i, int i_144_, int i_145_, int i_146_);
    
    public abstract Class163 method3319(int i, int i_147_, int i_148_,
					int i_149_, boolean bool);
    
    public abstract void method3320(int i, int i_150_, int i_151_, int i_152_);
    
    public abstract void method3321(float f, float f_153_, float f_154_,
				    float f_155_, float f_156_);
    
    public abstract void method3322(int i);
    
    public abstract int method3323();
    
    public abstract void method3324(int i, Class145 class145, int i_157_,
				    int i_158_);
    
    public abstract Class171 method3325(Class16 class16, Class169[] class169s,
					boolean bool);
    
    public abstract boolean method3326();
    
    abstract void method3327();
    
    public abstract void method3328(int i);
    
    public abstract Class183 method3329(Class187 class187, int i, int i_159_,
					int i_160_, int i_161_);
    
    public abstract int method3330(int i, int i_162_);
    
    public abstract int method3331(int i, int i_163_);
    
    public abstract Class151 method3332(int i, int i_164_, int[][] is,
					int[][] is_165_, int i_166_,
					int i_167_, int i_168_);
    
    public abstract boolean method3333();
    
    public abstract void method3334(Class174 class174);
    
    public abstract void method3335(Class446 class446);
    
    public abstract Class433 method3336();
    
    public static void method3337(Canvas canvas) {
	try {
	    Class var_class = Class.forName("java.awt.Canvas");
	    Method method = var_class.getMethod("setIgnoreRepaint",
						new Class[] { Boolean.TYPE });
	    method.invoke(canvas, new Object[] { Boolean.TRUE });
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public abstract void method3338(Class433 class433);
    
    public abstract Class433 method3339();
    
    public abstract void method3340(int i, int i_169_);
    
    public abstract void method3341(int i, float f, float f_170_, float f_171_,
				    float f_172_, float f_173_);
    
    public abstract void method3342(int i);
    
    public abstract Class163 method3343(int[] is, int i, int i_174_,
					int i_175_, int i_176_, boolean bool);
    
    public abstract int method3344();
    
    public Class534_Sub21 method3345(int i, int i_177_, int i_178_, int i_179_,
				     int i_180_, float f) {
	return new Class534_Sub21(i, i_177_, i_178_, i_179_, i_180_, f);
    }
    
    public abstract void method3346();
    
    public abstract void method3347(int i, float f, float f_181_, float f_182_,
				    float f_183_, float f_184_);
    
    public abstract void method3348(int i, int i_185_, int i_186_, int i_187_,
				    int i_188_, int i_189_, int i_190_);
    
    public abstract void method3349(Class165 class165);
    
    public abstract void method3350(int i, int i_191_, int i_192_, int i_193_);
    
    public abstract void method3351(int i, int i_194_);
    
    public abstract boolean method3352();
    
    public abstract void method3353(int i, int i_195_, int i_196_);
    
    public final void method3354(int i, int i_197_, int i_198_, int i_199_,
				 int i_200_) {
	method3303(i, i_197_, i_198_, i_199_, i_200_, 1);
    }
    
    public abstract long method3355(int i, int i_201_);
    
    public boolean method3356() {
	return true;
    }
    
    public abstract void method3357(Class170 class170, float f,
				    Class170 class170_202_, float f_203_,
				    Class170 class170_204_, float f_205_);
    
    public abstract boolean method3358();
    
    public abstract void method3359();
    
    public abstract void method3360(int[] is);
    
    public abstract void method3361(float f, float f_206_, float f_207_,
				    float[] fs);
    
    abstract void method3362(float f, float f_208_, float f_209_, float f_210_,
			     float f_211_, float f_212_);
    
    public abstract void method3363(int i, Class166 class166);
    
    public abstract void method3364(int i, Class166 class166);
    
    public void method3365(float f, float f_213_, float f_214_) {
	method3362(f, f_213_, f_214_, 0.0F, 1.0F, 1.0F);
    }
    
    public abstract void method3366(float f, float f_215_, float f_216_,
				    float[] fs);
    
    public abstract void method3367(float f, float f_217_, float f_218_,
				    float[] fs);
    
    public int[] method3368(int i, int i_219_, int i_220_, int i_221_,
			    int[] is, int i_222_, int i_223_, byte i_224_) {
	int[] is_225_ = new int[i_221_ * i_220_];
	if (0 == i_223_)
	    i_223_ = i;
	for (int i_226_ = 0; i_226_ < i_221_; i_226_++) {
	    if (i_226_ < i_219_) {
		int i_227_ = i_222_ + i_226_ * i_223_;
		for (int i_228_ = 0; i_228_ < i; i_228_++)
		    is_225_[i_220_ * i_226_ + i_228_] = is[i_228_ + i_227_];
		int i_229_ = is[i_227_ + (i - 1)];
		for (int i_230_ = i; i_230_ < i_220_; i_230_++)
		    is_225_[i_226_ * i_220_ + i_230_] = i_229_;
	    } else {
		int i_231_ = i_220_ * (i_219_ - 1);
		for (int i_232_ = 0; i_232_ < i_220_; i_232_++)
		    is_225_[i_232_ + i_220_ * i_226_]
			= is_225_[i_232_ + i_231_];
	    }
	}
	return is_225_;
    }
    
    public float[] method3369(int i, int i_233_, int i_234_, int i_235_,
			      float[] fs, int i_236_, int i_237_, int i_238_,
			      int i_239_) {
	float[] fs_240_ = new float[i_235_ * i_234_ * i_238_];
	if (i_237_ == 0)
	    i_237_ = i * i_238_;
	for (int i_241_ = 0; i_241_ < i_235_; i_241_++) {
	    if (i_241_ < i_233_) {
		int i_242_ = i_237_ * i_241_ + i_236_;
		for (int i_243_ = 0; i_243_ < i; i_243_++) {
		    for (int i_244_ = 0; i_244_ < i_238_; i_244_++)
			fs_240_[(i_238_ * i_243_ + i_241_ * i_234_ * i_238_
				 + i_244_)]
			    = fs[i_242_ + i_238_ * i_243_ + i_244_];
		}
		float[] fs_245_ = new float[i_238_];
		for (int i_246_ = 0; i_246_ < i_238_; i_246_++)
		    fs_245_[i_246_] = fs[i_242_ + (i - 1) * i_238_ + i_246_];
		for (int i_247_ = i; i_247_ < i_234_; i_247_++) {
		    for (int i_248_ = 0; i_248_ < i_238_; i_248_++)
			fs_240_[i_248_ + (i_234_ * i_241_ * i_238_
					  + i_238_ * i_247_)]
			    = fs_245_[i_248_];
		}
	    } else {
		int i_249_ = i_234_ * (i_233_ - 1) * i_238_;
		for (int i_250_ = 0; i_250_ < i_234_; i_250_++) {
		    for (int i_251_ = 0; i_251_ < i_238_; i_251_++)
			fs_240_[i_251_ + (i_234_ * i_241_ * i_238_
					  + i_250_ * i_238_)]
			    = fs_240_[i_251_ + (i_249_ + i_250_ * i_238_)];
		}
	    }
	}
	return fs_240_;
    }
    
    public byte[] method3370(int i, int i_252_, int i_253_, int i_254_,
			     byte[] is, int i_255_, int i_256_, int i_257_,
			     byte i_258_) {
	byte[] is_259_ = new byte[i_254_ * i_253_ * i_257_];
	if (0 == i_256_)
	    i_256_ = i_257_ * i;
	for (int i_260_ = 0; i_260_ < i_254_; i_260_++) {
	    if (i_260_ < i_252_) {
		int i_261_ = i_260_ * i_256_ + i_255_;
		for (int i_262_ = 0; i_262_ < i; i_262_++) {
		    for (int i_263_ = 0; i_263_ < i_257_; i_263_++)
			is_259_[(i_257_ * i_262_ + i_257_ * (i_253_ * i_260_)
				 + i_263_)]
			    = is[i_263_ + (i_262_ * i_257_ + i_261_)];
		}
		byte[] is_264_ = new byte[i_257_];
		for (int i_265_ = 0; i_265_ < i_257_; i_265_++)
		    is_264_[i_265_] = is[i_261_ + i_257_ * (i - 1) + i_265_];
		for (int i_266_ = i; i_266_ < i_253_; i_266_++) {
		    for (int i_267_ = 0; i_267_ < i_257_; i_267_++)
			is_259_[(i_266_ * i_257_ + i_257_ * (i_253_ * i_260_)
				 + i_267_)]
			    = is_264_[i_267_];
		}
	    } else {
		int i_268_ = i_253_ * (i_252_ - 1) * i_257_;
		for (int i_269_ = 0; i_269_ < i_253_; i_269_++) {
		    for (int i_270_ = 0; i_270_ < i_257_; i_270_++)
			is_259_[i_270_ + (i_257_ * (i_260_ * i_253_)
					  + i_269_ * i_257_)]
			    = is_259_[i_270_ + (i_269_ * i_257_ + i_268_)];
		}
	    }
	}
	return is_259_;
    }
    
    public abstract void method3371(boolean bool);
    
    public abstract void method3372(int i, int i_271_, int[] is,
				    int[] is_272_);
    
    public abstract void method3373(int i, int i_273_, int i_274_, int i_275_);
    
    public final Class175_Sub2 method3374() {
	return aClass175_Sub2_2013;
    }
    
    abstract void method3375(int i, int i_276_) throws Exception_Sub7;
    
    abstract void method3376(int i, int i_277_) throws Exception_Sub7;
    
    public abstract void method3377();
    
    abstract void method3378(int i, int i_278_, int i_279_, int i_280_,
			     int i_281_);
    
    public abstract int method3379(int i, int i_282_);
    
    public abstract void method3380(int i, int i_283_);
    
    public abstract void method3381(int i);
    
    public abstract void method3382(int[] is);
    
    public final void method3383(int i, int i_284_, int i_285_, int i_286_,
				 int i_287_) {
	method3297(i, i_284_, i_285_, i_286_, i_287_, 1);
    }
    
    public abstract void method3384(int i, int i_288_, int i_289_, int i_290_,
				    int i_291_, int i_292_, Class145 class145,
				    int i_293_, int i_294_);
    
    public abstract boolean method3385();
    
    public abstract boolean method3386();
    
    public abstract void method3387(Class433 class433);
    
    public abstract boolean method3388();
    
    public abstract void method3389(int i);
    
    public abstract boolean method3390();
    
    public abstract boolean method3391();
    
    public abstract boolean method3392();
    
    public abstract boolean method3393();
    
    public abstract boolean method3394();
    
    public abstract boolean method3395();
    
    public abstract boolean method3396();
    
    public abstract boolean method3397();
    
    public abstract boolean method3398();
    
    public final void method3399(int i, int i_295_, int i_296_, int i_297_) {
	method3680(i, i_295_, i_296_, i_297_, 1);
    }
    
    public abstract boolean method3400();
    
    public abstract String method3401();
    
    public abstract String method3402();
    
    public final void method3403(Class175_Sub1 class175_sub1) {
	if (anInt2011 * 19776081 >= 3)
	    throw new RuntimeException();
	if (anInt2011 * 19776081 >= 0)
	    aClass175_Sub1Array2009[anInt2011 * 19776081].method2912();
	else
	    aClass175_Sub2_2013.method2912();
	aClass175_1989
	    = aClass175_Sub1Array2009[(anInt2011 += 1400030897) * 19776081]
	    = class175_sub1;
	class175_sub1.method358();
    }
    
    public abstract boolean method3404();
    
    public abstract int[] method3405();
    
    public abstract void method3406(boolean bool);
    
    public abstract Class163 method3407(int i, int i_298_, boolean bool,
					boolean bool_299_);
    
    abstract Class175_Sub2 method3408(Canvas canvas, int i, int i_300_);
    
    public abstract boolean method3409();
    
    public abstract int[] method3410(int i, int i_301_, int i_302_,
				     int i_303_);
    
    public abstract int method3411();
    
    public abstract void method3412();
    
    public abstract void method3413();
    
    public abstract void method3414();
    
    public abstract void method3415();
    
    public abstract void method3416(int i, int i_304_, int i_305_, int i_306_);
    
    public abstract boolean method3417();
    
    public abstract boolean method3418();
    
    public abstract boolean method3419();
    
    abstract boolean method3420(int i, int i_307_, int i_308_, int i_309_,
				Class446 class446, Class432 class432);
    
    public abstract boolean method3421();
    
    public abstract Class170 method3422(int[] is);
    
    public Class163 method3423(int[] is, int i, int i_310_, int i_311_,
			       int i_312_) {
	return method3316(is, i, i_310_, i_311_, i_312_, true);
    }
    
    public abstract void method3424(int i, int i_313_, int i_314_);
    
    public final void method3425(int i, int i_315_, int i_316_, int i_317_,
				 int i_318_, int i_319_) {
	method3297(i, i_315_, i_316_, i_317_, i_318_, 1);
    }
    
    public abstract void method3426();
    
    public abstract void method3427();
    
    public abstract void method3428();
    
    public void method3429() {
	/* empty */
    }
    
    public abstract void method3430(long l);
    
    public abstract void method3431(int i, int i_320_, int[] is,
				    int[] is_321_);
    
    public abstract void method3432(int i, int i_322_, int[] is,
				    int[] is_323_);
    
    public abstract void method3433(int i, int i_324_, int[] is,
				    int[] is_325_);
    
    public static boolean method3434(int i) {
	return i == 0 || 2 == i;
    }
    
    public abstract void method3435(int i, int i_326_, int i_327_, int i_328_,
				    int i_329_, int i_330_, Class145 class145,
				    int i_331_, int i_332_);
    
    public abstract boolean method3436();
    
    public abstract void method3437();
    
    public abstract void method3438();
    
    public abstract void method3439();
    
    public abstract void method3440(int i, int i_333_, int i_334_, int i_335_);
    
    public abstract void method3441(float f, float f_336_);
    
    public abstract void method3442();
    
    public abstract boolean method3443();
    
    public abstract void method3444();
    
    public abstract void method3445(int i, int i_337_, int i_338_, int i_339_);
    
    public void method3446() {
	/* empty */
    }
    
    public abstract void method3447(int i, int i_340_, int i_341_, int i_342_);
    
    public abstract void method3448(int i, int i_343_, int i_344_, int i_345_);
    
    public abstract void method3449(int i, int i_346_, int i_347_, int i_348_);
    
    public abstract void method3450(int i, int i_349_, int i_350_, int i_351_);
    
    public abstract Class165 method3451(Class165 class165,
					Class165 class165_352_, float f,
					Class165 class165_353_);
    
    Class185(Class177 class177, Interface25 interface25,
	     Interface45 interface45, Interface48 interface48,
	     Interface46 interface46) {
	aClass175_Sub1Array2009 = new Class175_Sub1[4];
	anInt2021 = 0;
	aFloat2010 = 0.0F;
	aClass177_2012 = class177;
	anInterface25_1997 = interface25;
	anInterface45_1999 = interface45;
	anInterface48_2000 = interface48;
	int i = -1;
	for (int i_354_ = 0; i_354_ < 8; i_354_++) {
	    if (!aBoolArray1995[i_354_]) {
		aBoolArray1995[i_354_] = true;
		i = i_354_;
		break;
	    }
	}
	if (-1 == i)
	    throw new IllegalStateException("");
	anInt2001 = 1144571267 * i;
    }
    
    public abstract void method3452(int[] is);
    
    public abstract void method3453(int[] is);
    
    public abstract void method3454();
    
    public abstract boolean method3455();
    
    public abstract void method3456(int i, Class166 class166);
    
    public abstract void method3457(int i, int i_355_);
    
    public abstract void method3458(int i, int i_356_);
    
    public abstract void method3459(int i, int i_357_);
    
    public abstract void method3460(int i, int i_358_, int i_359_, int i_360_,
				    int i_361_, int i_362_);
    
    public abstract void method3461(boolean bool);
    
    public abstract void method3462(int i, int i_363_, int i_364_, int i_365_,
				    int i_366_, int i_367_);
    
    public abstract void method3463(int i, int i_368_, int i_369_);
    
    public void method3464(float f, float f_370_, float f_371_) {
	method3362(f, f_370_, f_371_, 0.0F, 1.0F, 1.0F);
    }
    
    abstract void method3465(int i, int i_372_, int i_373_, int i_374_,
			     int i_375_);
    
    public abstract void method3466(int[] is);
    
    public abstract int method3467(int i, int i_376_);
    
    public abstract void method3468(int i, int i_377_, int i_378_, int i_379_,
				    int i_380_, int i_381_);
    
    public abstract void method3469(int i, int i_382_, int i_383_, int i_384_,
				    int i_385_, int i_386_, int i_387_,
				    int i_388_, int i_389_);
    
    public final void method3470(int i, int i_390_, int i_391_, int i_392_) {
	method3248(i, i_390_, i_391_, i_392_, 1);
    }
    
    public abstract void method3471(int i, int i_393_, int i_394_, int i_395_,
				    int i_396_, int i_397_, Class145 class145,
				    int i_398_, int i_399_, int i_400_,
				    int i_401_, int i_402_);
    
    public abstract void method3472(int i, int i_403_, int i_404_, int i_405_,
				    int i_406_, int i_407_, int i_408_);
    
    public abstract boolean method3473();
    
    public abstract boolean method3474();
    
    public abstract int method3475(int i, int i_409_, int i_410_, int i_411_,
				   int i_412_, int i_413_);
    
    public static void method3476(Canvas canvas) {
	try {
	    Class var_class = Class.forName("java.awt.Canvas");
	    Method method = var_class.getMethod("setIgnoreRepaint",
						new Class[] { Boolean.TYPE });
	    method.invoke(canvas, new Object[] { Boolean.TRUE });
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    abstract boolean method3477(int i, int i_414_, int i_415_, int i_416_,
				Class446 class446, Class432 class432);
    
    abstract boolean method3478(int i, int i_417_, int i_418_, int i_419_,
				Class446 class446, Class432 class432);
    
    public abstract void method3479(Class446 class446, Class194 class194,
				    Class432 class432);
    
    public abstract Class145 method3480(int i, int i_420_, int[] is,
					int[] is_421_);
    
    public abstract Class534_Sub2 method3481(int i);
    
    public abstract void method3482(Class534_Sub2 class534_sub2);
    
    public abstract void method3483(Class534_Sub2 class534_sub2);
    
    public abstract int[] method3484();
    
    public abstract Class165 method3485(int i);
    
    public abstract Class165 method3486(Class165 class165,
					Class165 class165_422_, float f,
					Class165 class165_423_);
    
    public abstract Class163 method3487(int i, int i_424_, int i_425_,
					int i_426_, boolean bool);
    
    public abstract Class163 method3488(int i, int i_427_, int i_428_,
					int i_429_, boolean bool);
    
    public abstract void method3489(float f);
    
    public final void method3490(Canvas canvas) {
	Class175_Sub2 class175_sub2
	    = (Class175_Sub2) aHashtable2014.get(canvas);
	if (null == class175_sub2)
	    throw new RuntimeException();
	if (anInt2011 * 19776081 > 0 || aClass175_Sub2_2013 != aClass175_1989)
	    throw new RuntimeException();
	if (aClass175_1989 != null)
	    aClass175_1989.method2912();
	if (19776081 * anInt2011 < 0)
	    aClass175_1989 = class175_sub2;
	aClass175_Sub2_2013 = class175_sub2;
	class175_sub2.method358();
    }
    
    public abstract Class171 method3491(Class16 class16, Class169[] class169s,
					boolean bool);
    
    public abstract void method3492(int i);
    
    public abstract Class183 method3493(Class187 class187, int i, int i_430_,
					int i_431_, int i_432_);
    
    public final void method3494(int i, int i_433_, int i_434_, int i_435_) {
	method3300(i, i_433_, i_434_, i_435_, 1);
    }
    
    public abstract int method3495(int i, int i_436_);
    
    public abstract boolean method3496();
    
    public abstract Class446 method3497();
    
    public abstract int method3498();
    
    public abstract int method3499();
    
    public abstract int method3500();
    
    public abstract int method3501();
    
    public abstract int method3502();
    
    public abstract Class171 method3503(Class16 class16, Class169[] class169s,
					boolean bool);
    
    public abstract void method3504(int i, Class534_Sub21[] class534_sub21s);
    
    public abstract void method3505(Class174 class174);
    
    public abstract void method3506(Class446 class446);
    
    public abstract void method3507(Class446 class446);
    
    public abstract void method3508(Class446 class446);
    
    public abstract Class151 method3509(int i, int i_437_, int[][] is,
					int[][] is_438_, int i_439_,
					int i_440_, int i_441_);
    
    public abstract void method3510(Class433 class433);
    
    public abstract Class433 method3511();
    
    public abstract Class433 method3512();
    
    public abstract Class433 method3513();
    
    public abstract Class433 method3514();
    
    public abstract Class433 method3515();
    
    public abstract void method3516(float f);
    
    public abstract void method3517(float f);
    
    public abstract Class433 method3518();
    
    public abstract void method3519(int i);
    
    public abstract void method3520(int i);
    
    public abstract void method3521(int i, int i_442_, int i_443_);
    
    public abstract void method3522();
    
    public abstract void method3523();
    
    public abstract int method3524();
    
    public final void method3525(Class175_Sub1 class175_sub1) {
	if (anInt2011 * 19776081 >= 3)
	    throw new RuntimeException();
	if (anInt2011 * 19776081 >= 0)
	    aClass175_Sub1Array2009[anInt2011 * 19776081].method2912();
	else
	    aClass175_Sub2_2013.method2912();
	aClass175_1989
	    = aClass175_Sub1Array2009[(anInt2011 += 1400030897) * 19776081]
	    = class175_sub1;
	class175_sub1.method358();
    }
    
    public final void method3526(Canvas canvas, int i, int i_444_) {
	Class175_Sub2 class175_sub2
	    = (Class175_Sub2) aHashtable2014.get(canvas);
	if (null == class175_sub2)
	    throw new RuntimeException("");
	class175_sub2.method15477(i, i_444_);
    }
    
    public abstract void method3527(Class165 class165);
    
    public abstract void method3528(int i, int i_445_, int i_446_, int i_447_);
    
    public abstract void method3529();
    
    public abstract void method3530(int i, int i_448_, int i_449_, int i_450_);
    
    public abstract void method3531(int i, int i_451_, int i_452_, int i_453_);
    
    public abstract Class446 method3532();
    
    public abstract void method3533(int i, int i_454_);
    
    public abstract boolean method3534();
    
    public abstract Class165 method3535(int i);
    
    public abstract boolean method3536();
    
    public abstract void method3537();
    
    public abstract void method3538(Class534_Sub2 class534_sub2);
    
    public int[] method3539(int i, int i_455_, int i_456_, int i_457_,
			    int[] is, int i_458_, int i_459_) {
	int[] is_460_ = new int[i_457_ * i_456_];
	if (0 == i_459_)
	    i_459_ = i;
	for (int i_461_ = 0; i_461_ < i_457_; i_461_++) {
	    if (i_461_ < i_455_) {
		int i_462_ = i_458_ + i_461_ * i_459_;
		for (int i_463_ = 0; i_463_ < i; i_463_++)
		    is_460_[i_456_ * i_461_ + i_463_] = is[i_463_ + i_462_];
		int i_464_ = is[i_462_ + (i - 1)];
		for (int i_465_ = i; i_465_ < i_456_; i_465_++)
		    is_460_[i_461_ * i_456_ + i_465_] = i_464_;
	    } else {
		int i_466_ = i_456_ * (i_455_ - 1);
		for (int i_467_ = 0; i_467_ < i_456_; i_467_++)
		    is_460_[i_467_ + i_456_ * i_461_]
			= is_460_[i_467_ + i_466_];
	    }
	}
	return is_460_;
    }
    
    public abstract boolean method3540();
    
    public abstract boolean method3541();
    
    public abstract void method3542();
    
    public abstract void method3543(float f, float f_468_, float f_469_,
				    float f_470_, float f_471_);
    
    public abstract void method3544(float f, float f_472_, float f_473_,
				    float f_474_, float f_475_);
    
    public abstract void method3545(float f, float f_476_, float f_477_,
				    float f_478_, float f_479_);
    
    public abstract Class170 method3546(int[] is);
    
    static synchronized Class185 method3547
	(int i, Canvas canvas, Class177 class177, Interface25 interface25,
	 Interface45 interface45, Interface48 interface48,
	 Interface46 interface46, Class472 class472, int i_480_, int i_481_,
	 int i_482_, int i_483_) {
	if (0 == i)
	    return Class481.method7928(canvas, class177, interface25,
				       interface45, interface48, interface46,
				       i_481_, i_482_, 1614333999);
	if (i == 1)
	    return Class157.method2586(canvas, class177, interface25,
				       interface45, interface48, interface46,
				       i_480_);
	if (i == 5)
	    return Class500.method8274(canvas, class177, interface25,
				       interface45, interface48, interface46,
				       class472, i_480_);
	if (3 == i)
	    return Class425.method6794(canvas, class177, interface25,
				       interface45, interface48, interface46,
				       class472, i_480_);
	throw new IllegalArgumentException("");
    }
    
    public abstract Class170 method3548(int[] is);
    
    public abstract void method3549(Class170 class170, float f,
				    Class170 class170_484_, float f_485_,
				    Class170 class170_486_, float f_487_);
    
    public abstract void method3550();
    
    final void method3551(Canvas canvas, Class175_Sub2 class175_sub2) {
	if (null == class175_sub2)
	    throw new RuntimeException("");
	aHashtable2014.put(canvas, class175_sub2);
    }
    
    public abstract void method3552();
    
    public final void method3553(int i, int i_488_, int i_489_, int i_490_,
				 int i_491_) {
	method3303(i, i_488_, i_489_, i_490_, i_491_, 1);
    }
    
    public abstract boolean method3554();
    
    abstract void method3555(float f, float f_492_, float f_493_, float f_494_,
			     float f_495_, float f_496_);
    
    public abstract void method3556(int i, Class166 class166);
    
    abstract void method3557();
    
    public abstract void method3558(int i, Class166 class166);
    
    public void method3559() {
	/* empty */
    }
    
    public abstract void method3560(int i, Class166 class166);
    
    public abstract void method3561(int i, Class166 class166);
    
    public abstract void method3562(int[] is);
    
    public abstract void method3563();
    
    public abstract void method3564();
    
    public abstract void method3565(int i, int i_497_, float f, int i_498_,
				    int i_499_, float f_500_, int i_501_,
				    int i_502_, float f_503_, int i_504_,
				    int i_505_, int i_506_, int i_507_);
    
    public abstract void method3566(float f, float f_508_, float f_509_,
				    float[] fs);
    
    public final void method3567(int i, int i_510_, int i_511_, int i_512_,
				 int i_513_, int i_514_) {
	method3303(i, i_510_, i_511_, i_512_, i_513_, 1);
    }
    
    public abstract void method3568(float f, float f_515_, float f_516_,
				    float[] fs);
    
    public abstract Class175_Sub1 method3569();
    
    public abstract Class175_Sub1 method3570();
    
    public abstract Interface22 method3571
	(int i, int i_517_, Class181 class181, Class173 class173, int i_518_);
    
    public abstract Interface21 method3572(int i, int i_519_);
    
    public abstract Interface21 method3573(int i, int i_520_);
    
    public abstract void method3574(int i, float f, float f_521_, float f_522_,
				    float f_523_, float f_524_);
    
    public abstract void method3575();
    
    public final void method3576(int i, int i_525_, int i_526_, int i_527_,
				 int i_528_) {
	method3297(i, i_525_, i_526_, i_527_, i_528_, 1);
    }
    
    void method3577() {
	method3236(-568376843);
    }
    
    void method3578() {
	method3236(-568376843);
    }
    
    void method3579() {
	method3236(-568376843);
    }
    
    abstract void method3580();
    
    public void method3581() {
	/* empty */
    }
    
    abstract void method3582();
    
    public abstract boolean method3583();
    
    public abstract void method3584(int i, Class166 class166);
    
    public abstract boolean method3585();
    
    public abstract long method3586(int i, int i_529_);
    
    void method3587(int i, int i_530_) {
	anInt2016 = i * 1544217531;
	anInt2017 = -364792963 * i_530_;
	float f = ((float) aClass175_1989.method2910()
		   / (float) aClass175_1989.method2911());
	float f_531_ = ((float) (anInt2016 * 1104963955)
			/ (float) (1827315157 * anInt2017));
	if (f < f_531_) {
	    anInt2020
		= (int) (f * (float) (anInt2017 * 1827315157)) * 419429821;
	    anInt2021 = 125683701 * anInt2017;
	} else {
	    anInt2020 = anInt2016 * 1165852903;
	    anInt2021
		= (int) ((float) (1104963955 * anInt2016) / f) * 1383068065;
	}
	aFloat2010 = ((float) (1769547157 * anInt2020)
		      / (float) aClass175_1989.method2910());
	anInt2018
	    = 2123342803 * ((anInt2016 * 1104963955 - anInt2020 * 1769547157)
			    / 2);
	anInt2019 = ((anInt2017 * 1827315157 - -740019615 * anInt2021) / 2
		     * -150741303);
    }
    
    public abstract void method3588(int i, Class145 class145, int i_532_,
				    int i_533_);
    
    public abstract void method3589(int i, Class145 class145, int i_534_,
				    int i_535_);
    
    public abstract void method3590(float f, float f_536_, float f_537_,
				    float f_538_, float f_539_);
    
    public abstract Class433 method3591();
    
    public abstract boolean method3592();
    
    public abstract void method3593(int[] is);
    
    public abstract void method3594(int[] is);
    
    abstract void method3595(int i, int i_540_, int i_541_, int i_542_,
			     int i_543_);
    
    public abstract void method3596(boolean bool);
    
    public abstract int[] method3597(int i, int i_544_, int i_545_,
				     int i_546_);
    
    public abstract void method3598(int i, int i_547_, int i_548_, int i_549_,
				    int i_550_, int i_551_, int i_552_);
    
    public abstract boolean method3599();
    
    public static Class185 method3600
	(int i, Canvas canvas, Class177 class177, Interface25 interface25,
	 Interface45 interface45, Interface48 interface48,
	 Interface46 interface46, Class472 class472, int i_553_) {
	int i_554_ = 0;
	int i_555_ = 0;
	if (canvas != null) {
	    Dimension dimension = canvas.getSize();
	    i_554_ = dimension.width;
	    i_555_ = dimension.height;
	}
	return method3547(i, canvas, class177, interface25, interface45,
			  interface48, interface46, class472, i_553_, i_554_,
			  i_555_, 781716330);
    }
    
    public static Class185 method3601
	(int i, Canvas canvas, Class177 class177, Interface25 interface25,
	 Interface45 interface45, Interface48 interface48,
	 Interface46 interface46, Class472 class472, int i_556_) {
	int i_557_ = 0;
	int i_558_ = 0;
	if (canvas != null) {
	    Dimension dimension = canvas.getSize();
	    i_557_ = dimension.width;
	    i_558_ = dimension.height;
	}
	return method3547(i, canvas, class177, interface25, interface45,
			  interface48, interface46, class472, i_556_, i_557_,
			  i_558_, 781716330);
    }
    
    public abstract Class163 method3602(int i, int i_559_, boolean bool,
					boolean bool_560_);
    
    static synchronized Class185 method3603
	(int i, Canvas canvas, Class177 class177, Interface25 interface25,
	 Interface45 interface45, Interface48 interface48,
	 Interface46 interface46, Class472 class472, int i_561_, int i_562_,
	 int i_563_) {
	if (0 == i)
	    return Class481.method7928(canvas, class177, interface25,
				       interface45, interface48, interface46,
				       i_562_, i_563_, -754633628);
	if (i == 1)
	    return Class157.method2586(canvas, class177, interface25,
				       interface45, interface48, interface46,
				       i_561_);
	if (i == 5)
	    return Class500.method8274(canvas, class177, interface25,
				       interface45, interface48, interface46,
				       class472, i_561_);
	if (3 == i)
	    return Class425.method6794(canvas, class177, interface25,
				       interface45, interface48, interface46,
				       class472, i_561_);
	throw new IllegalArgumentException("");
    }
    
    public void method3604() {
	/* empty */
    }
    
    public abstract Class170 method3605(int[] is);
    
    public final void method3606() throws Exception_Sub7 {
	method3234(0, 0);
    }
    
    public abstract void method3607(int i, int i_564_, int i_565_);
    
    public abstract boolean method3608();
    
    public void method3609() {
	aBoolArray1995[anInt2001 * 2098753835] = false;
	Enumeration enumeration = aHashtable2014.keys();
	while (enumeration.hasMoreElements()) {
	    Canvas canvas = (Canvas) enumeration.nextElement();
	    Class175_Sub2 class175_sub2
		= (Class175_Sub2) aHashtable2014.get(canvas);
	    class175_sub2.method142();
	}
	method3327();
    }
    
    public void method3610() {
	aBoolArray1995[anInt2001 * 2098753835] = false;
	Enumeration enumeration = aHashtable2014.keys();
	while (enumeration.hasMoreElements()) {
	    Canvas canvas = (Canvas) enumeration.nextElement();
	    Class175_Sub2 class175_sub2
		= (Class175_Sub2) aHashtable2014.get(canvas);
	    class175_sub2.method142();
	}
	method3327();
    }
    
    public abstract boolean method3611();
    
    public static void method3612(Canvas canvas) {
	try {
	    Class var_class = Class.forName("java.awt.Canvas");
	    Method method = var_class.getMethod("setIgnoreRepaint",
						new Class[] { Boolean.TYPE });
	    method.invoke(canvas, new Object[] { Boolean.TRUE });
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public void method3613(float f, float f_566_, float f_567_, int i) {
	method3362(f, f_566_, f_567_, 0.0F, 1.0F, 1.0F);
    }
    
    public abstract Class534_Sub2 method3614(int i);
    
    public final Class175 method3615() {
	return aClass175_1989;
    }
    
    void method3616(int i, int i_568_, int i_569_) {
	anInt2016 = i * 1544217531;
	anInt2017 = -364792963 * i_568_;
	float f = ((float) aClass175_1989.method2910()
		   / (float) aClass175_1989.method2911());
	float f_570_ = ((float) (anInt2016 * 1104963955)
			/ (float) (1827315157 * anInt2017));
	if (f < f_570_) {
	    anInt2020
		= (int) (f * (float) (anInt2017 * 1827315157)) * 419429821;
	    anInt2021 = 125683701 * anInt2017;
	} else {
	    anInt2020 = anInt2016 * 1165852903;
	    anInt2021
		= (int) ((float) (1104963955 * anInt2016) / f) * 1383068065;
	}
	aFloat2010 = ((float) (1769547157 * anInt2020)
		      / (float) aClass175_1989.method2910());
	anInt2018
	    = 2123342803 * ((anInt2016 * 1104963955 - anInt2020 * 1769547157)
			    / 2);
	anInt2019 = ((anInt2017 * 1827315157 - -740019615 * anInt2021) / 2
		     * -150741303);
    }
    
    public final Class175_Sub2 method3617() {
	return aClass175_Sub2_2013;
    }
    
    public final Class175_Sub2 method3618() {
	return aClass175_Sub2_2013;
    }
    
    final void method3619(Canvas canvas, Class175_Sub2 class175_sub2) {
	if (null == class175_sub2)
	    throw new RuntimeException("");
	aHashtable2014.put(canvas, class175_sub2);
    }
    
    public final Class175_Sub2 method3620() {
	return aClass175_Sub2_2013;
    }
    
    public final void method3621(Canvas canvas, int i, int i_571_) {
	if (!aHashtable2014.containsKey(canvas)) {
	    Class481.method7927(canvas, -1933721456);
	    method3256(canvas, method3262(canvas, i, i_571_), (byte) 4);
	}
    }
    
    public final void method3622(Canvas canvas, int i, int i_572_) {
	if (!aHashtable2014.containsKey(canvas)) {
	    Class481.method7927(canvas, -1761411191);
	    method3256(canvas, method3262(canvas, i, i_572_), (byte) 4);
	}
    }
    
    final void method3623(Canvas canvas, Class175_Sub2 class175_sub2) {
	if (null == class175_sub2)
	    throw new RuntimeException("");
	aHashtable2014.put(canvas, class175_sub2);
    }
    
    public abstract Interface21 method3624(int i, int i_573_);
    
    final void method3625(Canvas canvas, Class175_Sub2 class175_sub2) {
	if (null == class175_sub2)
	    throw new RuntimeException("");
	aHashtable2014.put(canvas, class175_sub2);
    }
    
    public Class534_Sub21 method3626(int i, int i_574_, int i_575_, int i_576_,
				     int i_577_, float f) {
	return new Class534_Sub21(i, i_574_, i_575_, i_576_, i_577_, f);
    }
    
    public abstract Interface21 method3627(int i, int i_578_, int i_579_);
    
    public abstract boolean method3628();
    
    public final void method3629(Canvas canvas) {
	Class175_Sub2 class175_sub2
	    = (Class175_Sub2) aHashtable2014.get(canvas);
	if (null == class175_sub2)
	    throw new RuntimeException();
	if (anInt2011 * 19776081 > 0 || aClass175_Sub2_2013 != aClass175_1989)
	    throw new RuntimeException();
	if (aClass175_1989 != null)
	    aClass175_1989.method2912();
	if (19776081 * anInt2011 < 0)
	    aClass175_1989 = class175_sub2;
	aClass175_Sub2_2013 = class175_sub2;
	class175_sub2.method358();
    }
    
    public abstract boolean method3630();
    
    public final void method3631(Canvas canvas) {
	Class175_Sub2 class175_sub2
	    = (Class175_Sub2) aHashtable2014.get(canvas);
	if (null == class175_sub2)
	    throw new RuntimeException();
	if (anInt2011 * 19776081 > 0 || aClass175_Sub2_2013 != aClass175_1989)
	    throw new RuntimeException();
	if (aClass175_1989 != null)
	    aClass175_1989.method2912();
	if (19776081 * anInt2011 < 0)
	    aClass175_1989 = class175_sub2;
	aClass175_Sub2_2013 = class175_sub2;
	class175_sub2.method358();
    }
    
    public abstract void method3632(int i, int i_580_, int i_581_, int i_582_,
				    int i_583_, int i_584_);
    
    public final void method3633(Canvas canvas, int i) {
	if (aHashtable2014.containsKey(canvas)) {
	    Class175_Sub2 class175_sub2
		= (Class175_Sub2) aHashtable2014.get(canvas);
	    class175_sub2.method142();
	    aHashtable2014.remove(canvas);
	}
    }
    
    abstract void method3634(int i, int i_585_, int i_586_, int i_587_,
			     int i_588_);
    
    public final void method3635(Canvas canvas, int i, int i_589_) {
	Class175_Sub2 class175_sub2
	    = (Class175_Sub2) aHashtable2014.get(canvas);
	if (null == class175_sub2)
	    throw new RuntimeException("");
	class175_sub2.method15477(i, i_589_);
    }
    
    public final void method3636() throws Exception_Sub7 {
	method3234(0, 0);
    }
    
    public final void method3637(Canvas canvas) {
	if (aHashtable2014.containsKey(canvas)) {
	    Class175_Sub2 class175_sub2
		= (Class175_Sub2) aHashtable2014.get(canvas);
	    class175_sub2.method142();
	    aHashtable2014.remove(canvas);
	}
    }
    
    public final void method3638(Class175_Sub1 class175_sub1) {
	if (anInt2011 * 19776081 >= 3)
	    throw new RuntimeException();
	if (anInt2011 * 19776081 >= 0)
	    aClass175_Sub1Array2009[anInt2011 * 19776081].method2912();
	else
	    aClass175_Sub2_2013.method2912();
	aClass175_1989
	    = aClass175_Sub1Array2009[(anInt2011 += 1400030897) * 19776081]
	    = class175_sub1;
	class175_sub1.method358();
    }
    
    public final void method3639(Class175_Sub1 class175_sub1) {
	if (19776081 * anInt2011 < 0
	    || class175_sub1 != aClass175_Sub1Array2009[anInt2011 * 19776081])
	    throw new RuntimeException();
	aClass175_Sub1Array2009[(anInt2011 -= 1400030897) * 19776081 + 1]
	    = null;
	class175_sub1.method2912();
	if (19776081 * anInt2011 >= 0) {
	    aClass175_1989 = aClass175_Sub1Array2009[anInt2011 * 19776081];
	    aClass175_Sub1Array2009[anInt2011 * 19776081].method358();
	} else {
	    aClass175_1989 = aClass175_Sub2_2013;
	    aClass175_Sub2_2013.method358();
	}
    }
    
    public final void method3640(Class175_Sub1 class175_sub1) {
	if (19776081 * anInt2011 < 0
	    || class175_sub1 != aClass175_Sub1Array2009[anInt2011 * 19776081])
	    throw new RuntimeException();
	aClass175_Sub1Array2009[(anInt2011 -= 1400030897) * 19776081 + 1]
	    = null;
	class175_sub1.method2912();
	if (19776081 * anInt2011 >= 0) {
	    aClass175_1989 = aClass175_Sub1Array2009[anInt2011 * 19776081];
	    aClass175_Sub1Array2009[anInt2011 * 19776081].method358();
	} else {
	    aClass175_1989 = aClass175_Sub2_2013;
	    aClass175_Sub2_2013.method358();
	}
    }
    
    void method3641(int i, int i_590_) {
	anInt2016 = i * 1544217531;
	anInt2017 = -364792963 * i_590_;
	float f = ((float) aClass175_1989.method2910()
		   / (float) aClass175_1989.method2911());
	float f_591_ = ((float) (anInt2016 * 1104963955)
			/ (float) (1827315157 * anInt2017));
	if (f < f_591_) {
	    anInt2020
		= (int) (f * (float) (anInt2017 * 1827315157)) * 419429821;
	    anInt2021 = 125683701 * anInt2017;
	} else {
	    anInt2020 = anInt2016 * 1165852903;
	    anInt2021
		= (int) ((float) (1104963955 * anInt2016) / f) * 1383068065;
	}
	aFloat2010 = ((float) (1769547157 * anInt2020)
		      / (float) aClass175_1989.method2910());
	anInt2018
	    = 2123342803 * ((anInt2016 * 1104963955 - anInt2020 * 1769547157)
			    / 2);
	anInt2019 = ((anInt2017 * 1827315157 - -740019615 * anInt2021) / 2
		     * -150741303);
    }
    
    void method3642(int i, int i_592_) {
	anInt2016 = i * 1544217531;
	anInt2017 = -364792963 * i_592_;
	float f = ((float) aClass175_1989.method2910()
		   / (float) aClass175_1989.method2911());
	float f_593_ = ((float) (anInt2016 * 1104963955)
			/ (float) (1827315157 * anInt2017));
	if (f < f_593_) {
	    anInt2020
		= (int) (f * (float) (anInt2017 * 1827315157)) * 419429821;
	    anInt2021 = 125683701 * anInt2017;
	} else {
	    anInt2020 = anInt2016 * 1165852903;
	    anInt2021
		= (int) ((float) (1104963955 * anInt2016) / f) * 1383068065;
	}
	aFloat2010 = ((float) (1769547157 * anInt2020)
		      / (float) aClass175_1989.method2910());
	anInt2018
	    = 2123342803 * ((anInt2016 * 1104963955 - anInt2020 * 1769547157)
			    / 2);
	anInt2019 = ((anInt2017 * 1827315157 - -740019615 * anInt2021) / 2
		     * -150741303);
    }
    
    public abstract Class145 method3643(int i, int i_594_, int[] is,
					int[] is_595_);
    
    public void method3644(boolean bool) {
	/* empty */
    }
    
    public abstract Interface21 method3645(int i, int i_596_, int i_597_);
    
    public final void method3646(int i, int i_598_, int i_599_, int i_600_,
				 int i_601_) {
	method3297(i, i_598_, i_599_, i_600_, i_601_, 1);
    }
    
    public final void method3647(int i, int i_602_, int i_603_, int i_604_,
				 int i_605_) {
	method3297(i, i_602_, i_603_, i_604_, i_605_, 1);
    }
    
    public abstract void method3648();
    
    public final void method3649(int i, int i_606_, int i_607_, int i_608_,
				 int i_609_) {
	method3298(i, i_606_, i_607_, i_608_, i_609_, 1);
    }
    
    public final void method3650(int i, int i_610_, int i_611_, int i_612_,
				 int i_613_) {
	method3298(i, i_610_, i_611_, i_612_, i_613_, 1);
    }
    
    public final void method3651(int i, int i_614_, int i_615_, int i_616_,
				 int i_617_) {
	method3298(i, i_614_, i_615_, i_616_, i_617_, 1);
    }
    
    public static boolean method3652(int i) {
	return i == 0 || 2 == i;
    }
    
    public void method3653() {
	/* empty */
    }
    
    public abstract void method3654(int i, Class534_Sub21[] class534_sub21s);
    
    public final void method3655(int i, int i_618_, int i_619_, int i_620_) {
	method3248(i, i_618_, i_619_, i_620_, 1);
    }
    
    public abstract void method3656();
    
    public final void method3657(int i, int i_621_, int i_622_, int i_623_) {
	method3248(i, i_621_, i_622_, i_623_, 1);
    }
    
    public final void method3658(int i, int i_624_, int i_625_, int i_626_) {
	method3680(i, i_624_, i_625_, i_626_, 1);
    }
    
    public abstract void method3659(int i, Class534_Sub21[] class534_sub21s);
    
    public final void method3660(int i, int i_627_, int i_628_, int i_629_) {
	method3680(i, i_627_, i_628_, i_629_, 1);
    }
    
    public abstract void method3661(int i);
    
    public final void method3662(int i, int i_630_, int i_631_, int i_632_,
				 int i_633_) {
	method3303(i, i_630_, i_631_, i_632_, i_633_, 1);
    }
    
    public abstract int[] method3663();
    
    public Class163 method3664(int i, int i_634_, boolean bool) {
	return method3315(i, i_634_, bool, false);
    }
    
    public abstract Class446 method3665();
    
    public abstract boolean method3666();
    
    public void method3667() {
	/* empty */
    }
    
    public void method3668() {
	/* empty */
    }
    
    public boolean method3669(int i) {
	return true;
    }
    
    public abstract Class176 method3670();
    
    public abstract int method3671();
    
    public boolean method3672() {
	return true;
    }
    
    public boolean method3673() {
	return true;
    }
    
    public abstract void method3674(int i, int i_635_);
    
    public boolean method3675() {
	return true;
    }
    
    public abstract Class446 method3676();
    
    public final Class175 method3677() {
	return aClass175_1989;
    }
    
    public abstract Interface22 method3678
	(int i, int i_636_, Class181 class181, Class173 class173, int i_637_);
    
    public Class534_Sub21 method3679(int i, int i_638_, int i_639_, int i_640_,
				     int i_641_, float f) {
	return new Class534_Sub21(i, i_638_, i_639_, i_640_, i_641_, f);
    }
    
    abstract void method3680(int i, int i_642_, int i_643_, int i_644_,
			     int i_645_);
    
    public abstract void method3681(float f);
    
    public abstract boolean method3682();
    
    public void method3683(int[] is) {
	if (aClass175_Sub2_2013 != null) {
	    is[0] = aClass175_Sub2_2013.method2910();
	    is[1] = aClass175_Sub2_2013.method2911();
	} else {
	    int[] is_646_ = is;
	    is[1] = 0;
	    is_646_[0] = 0;
	}
    }
    
    public abstract int method3684();
    
    public int[] method3685(int i, int i_647_, int i_648_, int i_649_,
			    int[] is, int i_650_, int i_651_) {
	int[] is_652_ = new int[i_649_ * i_648_];
	if (0 == i_651_)
	    i_651_ = i;
	for (int i_653_ = 0; i_653_ < i_649_; i_653_++) {
	    if (i_653_ < i_647_) {
		int i_654_ = i_650_ + i_653_ * i_651_;
		for (int i_655_ = 0; i_655_ < i; i_655_++)
		    is_652_[i_648_ * i_653_ + i_655_] = is[i_655_ + i_654_];
		int i_656_ = is[i_654_ + (i - 1)];
		for (int i_657_ = i; i_657_ < i_648_; i_657_++)
		    is_652_[i_653_ * i_648_ + i_657_] = i_656_;
	    } else {
		int i_658_ = i_648_ * (i_647_ - 1);
		for (int i_659_ = 0; i_659_ < i_648_; i_659_++)
		    is_652_[i_659_ + i_648_ * i_653_]
			= is_652_[i_659_ + i_658_];
	    }
	}
	return is_652_;
    }
    
    public abstract void method3686(int i);
    
    public float[] method3687(int i, int i_660_, int i_661_, int i_662_,
			      float[] fs, int i_663_, int i_664_, int i_665_) {
	float[] fs_666_ = new float[i_662_ * i_661_ * i_665_];
	if (i_664_ == 0)
	    i_664_ = i * i_665_;
	for (int i_667_ = 0; i_667_ < i_662_; i_667_++) {
	    if (i_667_ < i_660_) {
		int i_668_ = i_664_ * i_667_ + i_663_;
		for (int i_669_ = 0; i_669_ < i; i_669_++) {
		    for (int i_670_ = 0; i_670_ < i_665_; i_670_++)
			fs_666_[(i_665_ * i_669_ + i_667_ * i_661_ * i_665_
				 + i_670_)]
			    = fs[i_668_ + i_665_ * i_669_ + i_670_];
		}
		float[] fs_671_ = new float[i_665_];
		for (int i_672_ = 0; i_672_ < i_665_; i_672_++)
		    fs_671_[i_672_] = fs[i_668_ + (i - 1) * i_665_ + i_672_];
		for (int i_673_ = i; i_673_ < i_661_; i_673_++) {
		    for (int i_674_ = 0; i_674_ < i_665_; i_674_++)
			fs_666_[i_674_ + (i_661_ * i_667_ * i_665_
					  + i_665_ * i_673_)]
			    = fs_671_[i_674_];
		}
	    } else {
		int i_675_ = i_661_ * (i_660_ - 1) * i_665_;
		for (int i_676_ = 0; i_676_ < i_661_; i_676_++) {
		    for (int i_677_ = 0; i_677_ < i_665_; i_677_++)
			fs_666_[i_677_ + (i_661_ * i_667_ * i_665_
					  + i_676_ * i_665_)]
			    = fs_666_[i_677_ + (i_675_ + i_676_ * i_665_)];
		}
	    }
	}
	return fs_666_;
    }
    
    public float[] method3688(int i, int i_678_, int i_679_, int i_680_,
			      float[] fs, int i_681_, int i_682_, int i_683_) {
	float[] fs_684_ = new float[i_680_ * i_679_ * i_683_];
	if (i_682_ == 0)
	    i_682_ = i * i_683_;
	for (int i_685_ = 0; i_685_ < i_680_; i_685_++) {
	    if (i_685_ < i_678_) {
		int i_686_ = i_682_ * i_685_ + i_681_;
		for (int i_687_ = 0; i_687_ < i; i_687_++) {
		    for (int i_688_ = 0; i_688_ < i_683_; i_688_++)
			fs_684_[(i_683_ * i_687_ + i_685_ * i_679_ * i_683_
				 + i_688_)]
			    = fs[i_686_ + i_683_ * i_687_ + i_688_];
		}
		float[] fs_689_ = new float[i_683_];
		for (int i_690_ = 0; i_690_ < i_683_; i_690_++)
		    fs_689_[i_690_] = fs[i_686_ + (i - 1) * i_683_ + i_690_];
		for (int i_691_ = i; i_691_ < i_679_; i_691_++) {
		    for (int i_692_ = 0; i_692_ < i_683_; i_692_++)
			fs_684_[i_692_ + (i_679_ * i_685_ * i_683_
					  + i_683_ * i_691_)]
			    = fs_689_[i_692_];
		}
	    } else {
		int i_693_ = i_679_ * (i_678_ - 1) * i_683_;
		for (int i_694_ = 0; i_694_ < i_679_; i_694_++) {
		    for (int i_695_ = 0; i_695_ < i_683_; i_695_++)
			fs_684_[i_695_ + (i_679_ * i_685_ * i_683_
					  + i_694_ * i_683_)]
			    = fs_684_[i_695_ + (i_693_ + i_694_ * i_683_)];
		}
	    }
	}
	return fs_684_;
    }
    
    public float[] method3689(int i, int i_696_, int i_697_, int i_698_,
			      float[] fs, int i_699_, int i_700_, int i_701_) {
	float[] fs_702_ = new float[i_698_ * i_697_ * i_701_];
	if (i_700_ == 0)
	    i_700_ = i * i_701_;
	for (int i_703_ = 0; i_703_ < i_698_; i_703_++) {
	    if (i_703_ < i_696_) {
		int i_704_ = i_700_ * i_703_ + i_699_;
		for (int i_705_ = 0; i_705_ < i; i_705_++) {
		    for (int i_706_ = 0; i_706_ < i_701_; i_706_++)
			fs_702_[(i_701_ * i_705_ + i_703_ * i_697_ * i_701_
				 + i_706_)]
			    = fs[i_704_ + i_701_ * i_705_ + i_706_];
		}
		float[] fs_707_ = new float[i_701_];
		for (int i_708_ = 0; i_708_ < i_701_; i_708_++)
		    fs_707_[i_708_] = fs[i_704_ + (i - 1) * i_701_ + i_708_];
		for (int i_709_ = i; i_709_ < i_697_; i_709_++) {
		    for (int i_710_ = 0; i_710_ < i_701_; i_710_++)
			fs_702_[i_710_ + (i_697_ * i_703_ * i_701_
					  + i_701_ * i_709_)]
			    = fs_707_[i_710_];
		}
	    } else {
		int i_711_ = i_697_ * (i_696_ - 1) * i_701_;
		for (int i_712_ = 0; i_712_ < i_697_; i_712_++) {
		    for (int i_713_ = 0; i_713_ < i_701_; i_713_++)
			fs_702_[i_713_ + (i_697_ * i_703_ * i_701_
					  + i_712_ * i_701_)]
			    = fs_702_[i_713_ + (i_711_ + i_712_ * i_701_)];
		}
	    }
	}
	return fs_702_;
    }
    
    public byte[] method3690(int i, int i_714_, int i_715_, int i_716_,
			     byte[] is, int i_717_, int i_718_, int i_719_) {
	byte[] is_720_ = new byte[i_716_ * i_715_ * i_719_];
	if (0 == i_718_)
	    i_718_ = i_719_ * i;
	for (int i_721_ = 0; i_721_ < i_716_; i_721_++) {
	    if (i_721_ < i_714_) {
		int i_722_ = i_721_ * i_718_ + i_717_;
		for (int i_723_ = 0; i_723_ < i; i_723_++) {
		    for (int i_724_ = 0; i_724_ < i_719_; i_724_++)
			is_720_[(i_719_ * i_723_ + i_719_ * (i_715_ * i_721_)
				 + i_724_)]
			    = is[i_724_ + (i_723_ * i_719_ + i_722_)];
		}
		byte[] is_725_ = new byte[i_719_];
		for (int i_726_ = 0; i_726_ < i_719_; i_726_++)
		    is_725_[i_726_] = is[i_722_ + i_719_ * (i - 1) + i_726_];
		for (int i_727_ = i; i_727_ < i_715_; i_727_++) {
		    for (int i_728_ = 0; i_728_ < i_719_; i_728_++)
			is_720_[(i_727_ * i_719_ + i_719_ * (i_715_ * i_721_)
				 + i_728_)]
			    = is_725_[i_728_];
		}
	    } else {
		int i_729_ = i_715_ * (i_714_ - 1) * i_719_;
		for (int i_730_ = 0; i_730_ < i_715_; i_730_++) {
		    for (int i_731_ = 0; i_731_ < i_719_; i_731_++)
			is_720_[i_731_ + (i_719_ * (i_721_ * i_715_)
					  + i_730_ * i_719_)]
			    = is_720_[i_731_ + (i_730_ * i_719_ + i_729_)];
		}
	    }
	}
	return is_720_;
    }
    
    public byte[] method3691(int i, int i_732_, int i_733_, int i_734_,
			     byte[] is, int i_735_, int i_736_, int i_737_) {
	byte[] is_738_ = new byte[i_734_ * i_733_ * i_737_];
	if (0 == i_736_)
	    i_736_ = i_737_ * i;
	for (int i_739_ = 0; i_739_ < i_734_; i_739_++) {
	    if (i_739_ < i_732_) {
		int i_740_ = i_739_ * i_736_ + i_735_;
		for (int i_741_ = 0; i_741_ < i; i_741_++) {
		    for (int i_742_ = 0; i_742_ < i_737_; i_742_++)
			is_738_[(i_737_ * i_741_ + i_737_ * (i_733_ * i_739_)
				 + i_742_)]
			    = is[i_742_ + (i_741_ * i_737_ + i_740_)];
		}
		byte[] is_743_ = new byte[i_737_];
		for (int i_744_ = 0; i_744_ < i_737_; i_744_++)
		    is_743_[i_744_] = is[i_740_ + i_737_ * (i - 1) + i_744_];
		for (int i_745_ = i; i_745_ < i_733_; i_745_++) {
		    for (int i_746_ = 0; i_746_ < i_737_; i_746_++)
			is_738_[(i_745_ * i_737_ + i_737_ * (i_733_ * i_739_)
				 + i_746_)]
			    = is_743_[i_746_];
		}
	    } else {
		int i_747_ = i_733_ * (i_732_ - 1) * i_737_;
		for (int i_748_ = 0; i_748_ < i_733_; i_748_++) {
		    for (int i_749_ = 0; i_749_ < i_737_; i_749_++)
			is_738_[i_749_ + (i_737_ * (i_739_ * i_733_)
					  + i_748_ * i_737_)]
			    = is_738_[i_749_ + (i_748_ * i_737_ + i_747_)];
		}
	    }
	}
	return is_738_;
    }
    
    public byte[] method3692(int i, int i_750_, int i_751_, int i_752_,
			     byte[] is, int i_753_, int i_754_, int i_755_) {
	byte[] is_756_ = new byte[i_752_ * i_751_ * i_755_];
	if (0 == i_754_)
	    i_754_ = i_755_ * i;
	for (int i_757_ = 0; i_757_ < i_752_; i_757_++) {
	    if (i_757_ < i_750_) {
		int i_758_ = i_757_ * i_754_ + i_753_;
		for (int i_759_ = 0; i_759_ < i; i_759_++) {
		    for (int i_760_ = 0; i_760_ < i_755_; i_760_++)
			is_756_[(i_755_ * i_759_ + i_755_ * (i_751_ * i_757_)
				 + i_760_)]
			    = is[i_760_ + (i_759_ * i_755_ + i_758_)];
		}
		byte[] is_761_ = new byte[i_755_];
		for (int i_762_ = 0; i_762_ < i_755_; i_762_++)
		    is_761_[i_762_] = is[i_758_ + i_755_ * (i - 1) + i_762_];
		for (int i_763_ = i; i_763_ < i_751_; i_763_++) {
		    for (int i_764_ = 0; i_764_ < i_755_; i_764_++)
			is_756_[(i_763_ * i_755_ + i_755_ * (i_751_ * i_757_)
				 + i_764_)]
			    = is_761_[i_764_];
		}
	    } else {
		int i_765_ = i_751_ * (i_750_ - 1) * i_755_;
		for (int i_766_ = 0; i_766_ < i_751_; i_766_++) {
		    for (int i_767_ = 0; i_767_ < i_755_; i_767_++)
			is_756_[i_767_ + (i_755_ * (i_757_ * i_751_)
					  + i_766_ * i_755_)]
			    = is_756_[i_767_ + (i_766_ * i_755_ + i_765_)];
		}
	    }
	}
	return is_756_;
    }
    
    public byte[] method3693(int i, int i_768_, int i_769_, int i_770_,
			     byte[] is, int i_771_, int i_772_, int i_773_) {
	byte[] is_774_ = new byte[i_770_ * i_769_ * i_773_];
	if (0 == i_772_)
	    i_772_ = i_773_ * i;
	for (int i_775_ = 0; i_775_ < i_770_; i_775_++) {
	    if (i_775_ < i_768_) {
		int i_776_ = i_775_ * i_772_ + i_771_;
		for (int i_777_ = 0; i_777_ < i; i_777_++) {
		    for (int i_778_ = 0; i_778_ < i_773_; i_778_++)
			is_774_[(i_773_ * i_777_ + i_773_ * (i_769_ * i_775_)
				 + i_778_)]
			    = is[i_778_ + (i_777_ * i_773_ + i_776_)];
		}
		byte[] is_779_ = new byte[i_773_];
		for (int i_780_ = 0; i_780_ < i_773_; i_780_++)
		    is_779_[i_780_] = is[i_776_ + i_773_ * (i - 1) + i_780_];
		for (int i_781_ = i; i_781_ < i_769_; i_781_++) {
		    for (int i_782_ = 0; i_782_ < i_773_; i_782_++)
			is_774_[(i_781_ * i_773_ + i_773_ * (i_769_ * i_775_)
				 + i_782_)]
			    = is_779_[i_782_];
		}
	    } else {
		int i_783_ = i_769_ * (i_768_ - 1) * i_773_;
		for (int i_784_ = 0; i_784_ < i_769_; i_784_++) {
		    for (int i_785_ = 0; i_785_ < i_773_; i_785_++)
			is_774_[i_785_ + (i_773_ * (i_775_ * i_769_)
					  + i_784_ * i_773_)]
			    = is_774_[i_785_ + (i_784_ * i_773_ + i_783_)];
		}
	    }
	}
	return is_774_;
    }
    
    static void method3694(Interface68 interface68, int i) {
	while (Class575.aLinkedList7711.size() > 10)
	    Class575.aLinkedList7711.remove();
	Class575.aLinkedList7711.add(interface68);
    }
    
    static int method3695(byte[][] is, byte[][] is_786_, int[] is_787_,
			  byte[] is_788_, int[] is_789_, int i, int i_790_,
			  byte i_791_) {
	int i_792_ = is_787_[i];
	int i_793_ = is_789_[i] + i_792_;
	int i_794_ = is_787_[i_790_];
	int i_795_ = i_794_ + is_789_[i_790_];
	int i_796_ = i_792_;
	if (i_794_ > i_792_)
	    i_796_ = i_794_;
	int i_797_ = i_793_;
	if (i_795_ < i_793_)
	    i_797_ = i_795_;
	int i_798_ = is_788_[i] & 0xff;
	if ((is_788_[i_790_] & 0xff) < i_798_)
	    i_798_ = is_788_[i_790_] & 0xff;
	byte[] is_799_ = is_786_[i];
	byte[] is_800_ = is[i_790_];
	int i_801_ = i_796_ - i_792_;
	int i_802_ = i_796_ - i_794_;
	for (int i_803_ = i_796_; i_803_ < i_797_; i_803_++) {
	    int i_804_ = is_799_[i_801_++] + is_800_[i_802_++];
	    if (i_804_ < i_798_)
		i_798_ = i_804_;
	}
	return -i_798_;
    }
}
