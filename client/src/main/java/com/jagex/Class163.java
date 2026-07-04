/* Class163 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class163 implements Interface3
{
    public final void method2644(float f, float f_0_, int i, int i_1_,
				 int i_2_, int i_3_, int i_4_) {
	method2668(f, f_0_, (float) method22() / 2.0F,
		   (float) method2692() / 2.0F, i, i_1_, i_2_, i_3_, i_4_);
    }
    
    public abstract void method2645(int i, int i_5_, int i_6_, int i_7_);
    
    public abstract void method2646(int[] is);
    
    public abstract int method2647();
    
    public abstract void method2648(int i, int i_8_, int i_9_, int i_10_,
				    int[] is, int[] is_11_, int i_12_,
				    int i_13_);
    
    public abstract int method2649();
    
    public abstract Interface22 method2650();
    
    public abstract Interface22 method2651();
    
    public abstract void method2652(int i, int i_14_, int i_15_, int i_16_,
				    int[] is, int i_17_, int i_18_);
    
    public abstract void method2653(int i, int i_19_, int i_20_, int i_21_,
				    int[] is, int[] is_22_, int i_23_,
				    int i_24_);
    
    public final void method2654(int i, int i_25_, int i_26_, int i_27_,
				 int i_28_, int i_29_, int i_30_) {
	method2661(i, i_25_, i_26_, i_27_, i_28_, i_29_, i_30_, 1);
    }
    
    public abstract void method2655(int i, int i_31_, int i_32_);
    
    public final void method2656(int i, int i_33_) {
	method2657(i, i_33_, 1, -1, 1);
    }
    
    public abstract void method2657(int i, int i_34_, int i_35_, int i_36_,
				    int i_37_);
    
    public final void method2658(float f, float f_38_, int i, int i_39_,
				 Class145 class145, int i_40_, int i_41_) {
	method2704(f, f_38_, (float) method22() / 2.0F,
		   (float) method2692() / 2.0F, i, i_39_, class145, i_40_,
		   i_41_);
    }
    
    public final void method2659(int i, int i_42_, int i_43_, int i_44_) {
	method2661(i, i_42_, i_43_, i_44_, 1, -1, 1, 1);
    }
    
    public final void method2660(int i, int i_45_, int i_46_, int i_47_,
				 int i_48_, int i_49_, int i_50_) {
	method2661(i, i_45_, i_46_, i_47_, i_48_, i_49_, i_50_, 1);
    }
    
    abstract void method2661(int i, int i_51_, int i_52_, int i_53_, int i_54_,
			     int i_55_, int i_56_, int i_57_);
    
    public final void method2662(int i, int i_58_, int i_59_, int i_60_) {
	method2663(i, i_58_, i_59_, i_60_, 1, -1, 1);
    }
    
    public abstract void method2663(int i, int i_61_, int i_62_, int i_63_,
				    int i_64_, int i_65_, int i_66_);
    
    public final void method2664(float f, float f_67_, float f_68_,
				 float f_69_, int i, int i_70_) {
	method2668(f, f_67_, f_68_, f_69_, i, i_70_, 1, -1, 1);
    }
    
    public final void method2665(float f, float f_71_, int i, int i_72_) {
	method2668(f, f_71_, (float) method22() / 2.0F,
		   (float) method2692() / 2.0F, i, i_72_, 1, -1, 1);
    }
    
    public final void method2666(float f, float f_73_, int i, int i_74_,
				 int i_75_, int i_76_, int i_77_) {
	method2668(f, f_73_, (float) method22() / 2.0F,
		   (float) method2692() / 2.0F, i, i_74_, i_75_, i_76_, i_77_);
    }
    
    public final void method2667(float f, float f_78_, float f_79_,
				 float f_80_, int i, int i_81_, int i_82_,
				 int i_83_, int i_84_, int i_85_) {
	if (i != 0 && i_81_ != 0) {
	    double d = (double) (i_82_ & 0xffff) * 9.587379924285257E-5;
	    float f_86_ = (float) Math.sin(d) * (float) i_81_;
	    float f_87_ = (float) Math.cos(d) * (float) i_81_;
	    float f_88_ = (float) Math.sin(d) * (float) i;
	    float f_89_ = (float) Math.cos(d) * (float) i;
	    float f_90_ = (-f_79_ * f_89_ + -f_80_ * f_86_) / 4096.0F + f;
	    float f_91_ = (--f_79_ * f_88_ + -f_80_ * f_87_) / 4096.0F + f_78_;
	    float f_92_ = ((((float) method22() - f_79_) * f_89_
			    + -f_80_ * f_86_) / 4096.0F
			   + f);
	    float f_93_ = ((-((float) method22() - f_79_) * f_88_
			    + -f_80_ * f_87_) / 4096.0F
			   + f_78_);
	    float f_94_ = ((-f_79_ * f_89_
			    + ((float) method2692() - f_80_) * f_86_) / 4096.0F
			   + f);
	    float f_95_ = ((--f_79_ * f_88_
			    + ((float) method2692() - f_80_) * f_87_) / 4096.0F
			   + f_78_);
	    method2703(f_90_, f_91_, f_92_, f_93_, f_94_, f_95_, i_83_, i_84_,
		       i_85_);
	}
    }
    
    public final void method2668(float f, float f_96_, float f_97_,
				 float f_98_, int i, int i_99_, int i_100_,
				 int i_101_, int i_102_) {
	if (i != 0) {
	    double d = (double) (i_99_ & 0xffff) * 9.587379924285257E-5;
	    float f_103_ = (float) Math.sin(d) * (float) i;
	    float f_104_ = (float) Math.cos(d) * (float) i;
	    float f_105_ = (-f_97_ * f_104_ + -f_98_ * f_103_) / 4096.0F + f;
	    float f_106_
		= (--f_97_ * f_103_ + -f_98_ * f_104_) / 4096.0F + f_96_;
	    float f_107_ = ((((float) method22() - f_97_) * f_104_
			     + -f_98_ * f_103_) / 4096.0F
			    + f);
	    float f_108_ = ((-((float) method22() - f_97_) * f_103_
			     + -f_98_ * f_104_) / 4096.0F
			    + f_96_);
	    float f_109_
		= (((-f_97_ * f_104_ + ((float) method2692() - f_98_) * f_103_)
		    / 4096.0F)
		   + f);
	    float f_110_
		= ((--f_97_ * f_103_
		    + ((float) method2692() - f_98_) * f_104_) / 4096.0F
		   + f_96_);
	    method2703(f_105_, f_106_, f_107_, f_108_, f_109_, f_110_, i_100_,
		       i_101_, i_102_);
	}
    }
    
    public abstract int method2669();
    
    Class163() {
	/* empty */
    }
    
    public final void method2670(float f, float f_111_, int i, int i_112_,
				 Class145 class145, int i_113_, int i_114_) {
	method2704(f, f_111_, (float) method22() / 2.0F,
		   (float) method2692() / 2.0F, i, i_112_, class145, i_113_,
		   i_114_);
    }
    
    abstract void method2671(float f, float f_115_, float f_116_, float f_117_,
			     float f_118_, float f_119_, int i, int i_120_,
			     int i_121_, int i_122_);
    
    public abstract void method2672(int i, int i_123_, int i_124_);
    
    abstract void method2673(float f, float f_125_, float f_126_, float f_127_,
			     float f_128_, float f_129_, int i,
			     Class145 class145, int i_130_, int i_131_);
    
    public abstract void method2674(int i, int i_132_, int i_133_, int i_134_,
				    int[] is, int[] is_135_, int i_136_,
				    int i_137_);
    
    public final void method2675(float f, float f_138_, int i, int i_139_,
				 Class145 class145, int i_140_, int i_141_) {
	method2704(f, f_138_, (float) method22() / 2.0F,
		   (float) method2692() / 2.0F, i, i_139_, class145, i_140_,
		   i_141_);
    }
    
    public abstract void method2676(int i, int i_142_, int i_143_, int i_144_,
				    int[] is, int[] is_145_, int i_146_,
				    int i_147_);
    
    abstract void method2677(float f, float f_148_, float f_149_, float f_150_,
			     float f_151_, float f_152_, int i, int i_153_,
			     int i_154_, int i_155_);
    
    public abstract void method2678(int i, int i_156_, int i_157_, int i_158_,
				    int i_159_, int i_160_);
    
    public abstract void method2679(int i, int i_161_, int i_162_, int i_163_);
    
    public final void method2680(int i, int i_164_, int i_165_, int i_166_,
				 int i_167_, int i_168_, int i_169_) {
	method2661(i, i_164_, i_165_, i_166_, i_167_, i_168_, i_169_, 1);
    }
    
    public abstract Interface22 method2681();
    
    public abstract Interface22 method2682();
    
    public abstract Interface22 method2683();
    
    public abstract void method2684(int i, int i_170_, int i_171_, int i_172_,
				    int i_173_);
    
    public abstract void method2685(int i, int i_174_, Class145 class145,
				    int i_175_, int i_176_);
    
    abstract void method2686(int i, int i_177_, int i_178_, int i_179_,
			     int i_180_, int i_181_, int i_182_, int i_183_);
    
    abstract void method2687(int i, int i_184_, int i_185_, int i_186_,
			     int i_187_, int i_188_, int i_189_, int i_190_);
    
    public abstract Interface22 method2688();
    
    public final void method2689(float f, float f_191_, float f_192_,
				 float f_193_, float f_194_, float f_195_,
				 int i, int i_196_, int i_197_) {
	method2671(f, f_191_, f_192_, f_193_, f_194_, f_195_, i, i_196_,
		   i_197_, 1);
    }
    
    public final void method2690(float f, float f_198_, float f_199_,
				 float f_200_, int i, int i_201_, int i_202_,
				 int i_203_, int i_204_, int i_205_) {
	if (i != 0 && i_201_ != 0) {
	    double d = (double) (i_202_ & 0xffff) * 9.587379924285257E-5;
	    float f_206_ = (float) Math.sin(d) * (float) i_201_;
	    float f_207_ = (float) Math.cos(d) * (float) i_201_;
	    float f_208_ = (float) Math.sin(d) * (float) i;
	    float f_209_ = (float) Math.cos(d) * (float) i;
	    float f_210_ = (-f_199_ * f_209_ + -f_200_ * f_206_) / 4096.0F + f;
	    float f_211_
		= (--f_199_ * f_208_ + -f_200_ * f_207_) / 4096.0F + f_198_;
	    float f_212_ = ((((float) method22() - f_199_) * f_209_
			     + -f_200_ * f_206_) / 4096.0F
			    + f);
	    float f_213_ = ((-((float) method22() - f_199_) * f_208_
			     + -f_200_ * f_207_) / 4096.0F
			    + f_198_);
	    float f_214_
		= ((-f_199_ * f_209_
		    + ((float) method2692() - f_200_) * f_206_) / 4096.0F
		   + f);
	    float f_215_
		= ((--f_199_ * f_208_
		    + ((float) method2692() - f_200_) * f_207_) / 4096.0F
		   + f_198_);
	    method2703(f_210_, f_211_, f_212_, f_213_, f_214_, f_215_, i_203_,
		       i_204_, i_205_);
	}
    }
    
    public abstract void method2691(int i, int i_216_, Class145 class145,
				    int i_217_, int i_218_);
    
    public abstract int method2692();
    
    public abstract void method2693(int i, int i_219_, int i_220_, int i_221_,
				    int[] is, int[] is_222_, int i_223_,
				    int i_224_);
    
    public final void method2694(float f, float f_225_, int i, int i_226_) {
	method2668(f, f_225_, (float) method22() / 2.0F,
		   (float) method2692() / 2.0F, i, i_226_, 1, -1, 1);
    }
    
    public abstract void method2695(int[] is);
    
    public final void method2696(float f, float f_227_, float f_228_,
				 float f_229_, float f_230_, float f_231_,
				 int i, int i_232_, int i_233_) {
	method2671(f, f_227_, f_228_, f_229_, f_230_, f_231_, i, i_232_,
		   i_233_, 1);
    }
    
    public final void method2697(int i, int i_234_, int i_235_, int i_236_,
				 int i_237_, int i_238_, int i_239_) {
	method2661(i, i_234_, i_235_, i_236_, i_237_, i_238_, i_239_, 1);
    }
    
    public abstract int method2698();
    
    public abstract void method2699(int i, int i_240_, int i_241_);
    
    public abstract int method2700();
    
    public abstract int method2701();
    
    public abstract int method21();
    
    abstract void method2702(int i, int i_242_, int i_243_, int i_244_,
			     int i_245_, int i_246_, int i_247_, int i_248_);
    
    public abstract int method23();
    
    public final void method2703(float f, float f_249_, float f_250_,
				 float f_251_, float f_252_, float f_253_,
				 int i, int i_254_, int i_255_) {
	method2671(f, f_249_, f_250_, f_251_, f_252_, f_253_, i, i_254_,
		   i_255_, 1);
    }
    
    public final void method2704(float f, float f_256_, float f_257_,
				 float f_258_, int i, int i_259_,
				 Class145 class145, int i_260_, int i_261_) {
	if (i != 0) {
	    double d = (double) (i_259_ & 0xffff) * 9.587379924285257E-5;
	    float f_262_ = (float) Math.sin(d) * (float) i;
	    float f_263_ = (float) Math.cos(d) * (float) i;
	    float f_264_ = (-f_257_ * f_263_ + -f_258_ * f_262_) / 4096.0F + f;
	    float f_265_
		= (--f_257_ * f_262_ + -f_258_ * f_263_) / 4096.0F + f_256_;
	    float f_266_ = ((((float) method22() - f_257_) * f_263_
			     + -f_258_ * f_262_) / 4096.0F
			    + f);
	    float f_267_ = ((-((float) method22() - f_257_) * f_262_
			     + -f_258_ * f_263_) / 4096.0F
			    + f_256_);
	    float f_268_
		= ((-f_257_ * f_263_
		    + ((float) method2692() - f_258_) * f_262_) / 4096.0F
		   + f);
	    float f_269_
		= ((--f_257_ * f_262_
		    + ((float) method2692() - f_258_) * f_263_) / 4096.0F
		   + f_256_);
	    method2731(f_264_, f_265_, f_266_, f_267_, f_268_, f_269_,
		       class145, i_260_, i_261_);
	}
    }
    
    public abstract void method2705(int i, int i_270_, int i_271_, int i_272_,
				    int i_273_, int i_274_, int i_275_);
    
    public abstract void method2706(int i, int i_276_, int i_277_, int i_278_,
				    int i_279_, int i_280_, int i_281_);
    
    abstract void method2707(float f, float f_282_, float f_283_, float f_284_,
			     float f_285_, float f_286_, int i,
			     Class145 class145, int i_287_, int i_288_);
    
    abstract void method2708(float f, float f_289_, float f_290_, float f_291_,
			     float f_292_, float f_293_, int i,
			     Class145 class145, int i_294_, int i_295_);
    
    public abstract int method2709();
    
    abstract void method2710(float f, float f_296_, float f_297_, float f_298_,
			     float f_299_, float f_300_, int i, int i_301_,
			     int i_302_, int i_303_);
    
    abstract void method2711(float f, float f_304_, float f_305_, float f_306_,
			     float f_307_, float f_308_, int i, int i_309_,
			     int i_310_, int i_311_);
    
    public final void method2712(float f, float f_312_, int i, int i_313_,
				 int i_314_, int i_315_, int i_316_) {
	method2668(f, f_312_, (float) method22() / 2.0F,
		   (float) method2692() / 2.0F, i, i_313_, i_314_, i_315_,
		   i_316_);
    }
    
    public final void method2713(int i, int i_317_) {
	method2657(i, i_317_, 1, -1, 1);
    }
    
    public final void method2714(int i, int i_318_, int i_319_, int i_320_) {
	method2661(i, i_318_, i_319_, i_320_, 1, -1, 1, 1);
    }
    
    public final void method2715(int i, int i_321_, int i_322_, int i_323_) {
	method2661(i, i_321_, i_322_, i_323_, 1, -1, 1, 1);
    }
    
    public final void method2716(int i, int i_324_, int i_325_, int i_326_,
				 int i_327_, int i_328_, int i_329_) {
	method2661(i, i_324_, i_325_, i_326_, i_327_, i_328_, i_329_, 1);
    }
    
    public abstract void method2717(int i, int i_330_, int i_331_, int i_332_,
				    int i_333_, int i_334_);
    
    abstract void method2718(int i, int i_335_, int i_336_, int i_337_,
			     int i_338_, int i_339_, int i_340_, int i_341_);
    
    abstract void method2719(float f, float f_342_, float f_343_, float f_344_,
			     float f_345_, float f_346_, int i, int i_347_,
			     int i_348_, int i_349_);
    
    public abstract void method2720(int i, int i_350_, int i_351_, int i_352_,
				    int i_353_, int i_354_, int i_355_);
    
    public final void method2721(int i, int i_356_, int i_357_, int i_358_) {
	method2663(i, i_356_, i_357_, i_358_, 1, -1, 1);
    }
    
    public final void method2722(int i, int i_359_, int i_360_, int i_361_) {
	method2663(i, i_359_, i_360_, i_361_, 1, -1, 1);
    }
    
    public abstract int method22();
    
    public final void method2723(float f, float f_362_, float f_363_,
				 float f_364_, int i, int i_365_) {
	method2668(f, f_362_, f_363_, f_364_, i, i_365_, 1, -1, 1);
    }
    
    public final void method2724(float f, float f_366_, float f_367_,
				 float f_368_, int i, int i_369_) {
	method2668(f, f_366_, f_367_, f_368_, i, i_369_, 1, -1, 1);
    }
    
    public final void method2725(float f, float f_370_, float f_371_,
				 float f_372_, int i, int i_373_) {
	method2668(f, f_370_, f_371_, f_372_, i, i_373_, 1, -1, 1);
    }
    
    public final void method2726(float f, float f_374_, int i, int i_375_) {
	method2668(f, f_374_, (float) method22() / 2.0F,
		   (float) method2692() / 2.0F, i, i_375_, 1, -1, 1);
    }
    
    public final void method2727(float f, float f_376_, int i, int i_377_) {
	method2668(f, f_376_, (float) method22() / 2.0F,
		   (float) method2692() / 2.0F, i, i_377_, 1, -1, 1);
    }
    
    public final void method2728(int i, int i_378_, int i_379_, int i_380_) {
	method2663(i, i_378_, i_379_, i_380_, 1, -1, 1);
    }
    
    public abstract void method2729(int i, int i_381_, int i_382_);
    
    public final void method2730(float f, float f_383_, int i, int i_384_,
				 int i_385_, int i_386_, int i_387_) {
	method2668(f, f_383_, (float) method22() / 2.0F,
		   (float) method2692() / 2.0F, i, i_384_, i_385_, i_386_,
		   i_387_);
    }
    
    final void method2731(float f, float f_388_, float f_389_, float f_390_,
			  float f_391_, float f_392_, Class145 class145, int i,
			  int i_393_) {
	method2673(f, f_388_, f_389_, f_390_, f_391_, f_392_, 1, class145, i,
		   i_393_);
    }
    
    public final void method2732(float f, float f_394_, float f_395_,
				 float f_396_, int i, int i_397_, int i_398_,
				 int i_399_, int i_400_, int i_401_) {
	if (i != 0 && i_397_ != 0) {
	    double d = (double) (i_398_ & 0xffff) * 9.587379924285257E-5;
	    float f_402_ = (float) Math.sin(d) * (float) i_397_;
	    float f_403_ = (float) Math.cos(d) * (float) i_397_;
	    float f_404_ = (float) Math.sin(d) * (float) i;
	    float f_405_ = (float) Math.cos(d) * (float) i;
	    float f_406_ = (-f_395_ * f_405_ + -f_396_ * f_402_) / 4096.0F + f;
	    float f_407_
		= (--f_395_ * f_404_ + -f_396_ * f_403_) / 4096.0F + f_394_;
	    float f_408_ = ((((float) method22() - f_395_) * f_405_
			     + -f_396_ * f_402_) / 4096.0F
			    + f);
	    float f_409_ = ((-((float) method22() - f_395_) * f_404_
			     + -f_396_ * f_403_) / 4096.0F
			    + f_394_);
	    float f_410_
		= ((-f_395_ * f_405_
		    + ((float) method2692() - f_396_) * f_402_) / 4096.0F
		   + f);
	    float f_411_
		= ((--f_395_ * f_404_
		    + ((float) method2692() - f_396_) * f_403_) / 4096.0F
		   + f_394_);
	    method2703(f_406_, f_407_, f_408_, f_409_, f_410_, f_411_, i_399_,
		       i_400_, i_401_);
	}
    }
    
    public abstract void method2733(int[] is);
    
    public final void method2734(float f, float f_412_, float f_413_,
				 float f_414_, int i, int i_415_, int i_416_,
				 int i_417_, int i_418_) {
	if (i != 0) {
	    double d = (double) (i_415_ & 0xffff) * 9.587379924285257E-5;
	    float f_419_ = (float) Math.sin(d) * (float) i;
	    float f_420_ = (float) Math.cos(d) * (float) i;
	    float f_421_ = (-f_413_ * f_420_ + -f_414_ * f_419_) / 4096.0F + f;
	    float f_422_
		= (--f_413_ * f_419_ + -f_414_ * f_420_) / 4096.0F + f_412_;
	    float f_423_ = ((((float) method22() - f_413_) * f_420_
			     + -f_414_ * f_419_) / 4096.0F
			    + f);
	    float f_424_ = ((-((float) method22() - f_413_) * f_419_
			     + -f_414_ * f_420_) / 4096.0F
			    + f_412_);
	    float f_425_
		= ((-f_413_ * f_420_
		    + ((float) method2692() - f_414_) * f_419_) / 4096.0F
		   + f);
	    float f_426_
		= ((--f_413_ * f_419_
		    + ((float) method2692() - f_414_) * f_420_) / 4096.0F
		   + f_412_);
	    method2703(f_421_, f_422_, f_423_, f_424_, f_425_, f_426_, i_416_,
		       i_417_, i_418_);
	}
    }
    
    public final void method2735(float f, float f_427_, float f_428_,
				 float f_429_, int i, int i_430_, int i_431_,
				 int i_432_, int i_433_) {
	if (i != 0) {
	    double d = (double) (i_430_ & 0xffff) * 9.587379924285257E-5;
	    float f_434_ = (float) Math.sin(d) * (float) i;
	    float f_435_ = (float) Math.cos(d) * (float) i;
	    float f_436_ = (-f_428_ * f_435_ + -f_429_ * f_434_) / 4096.0F + f;
	    float f_437_
		= (--f_428_ * f_434_ + -f_429_ * f_435_) / 4096.0F + f_427_;
	    float f_438_ = ((((float) method22() - f_428_) * f_435_
			     + -f_429_ * f_434_) / 4096.0F
			    + f);
	    float f_439_ = ((-((float) method22() - f_428_) * f_434_
			     + -f_429_ * f_435_) / 4096.0F
			    + f_427_);
	    float f_440_
		= ((-f_428_ * f_435_
		    + ((float) method2692() - f_429_) * f_434_) / 4096.0F
		   + f);
	    float f_441_
		= ((--f_428_ * f_434_
		    + ((float) method2692() - f_429_) * f_435_) / 4096.0F
		   + f_427_);
	    method2703(f_436_, f_437_, f_438_, f_439_, f_440_, f_441_, i_431_,
		       i_432_, i_433_);
	}
    }
    
    public final void method2736(int i, int i_442_, int i_443_, int i_444_) {
	method2663(i, i_442_, i_443_, i_444_, 1, -1, 1);
    }
    
    public abstract void method2737(int i, int i_445_, int i_446_, int i_447_,
				    int[] is, int i_448_, int i_449_);
    
    public final void method2738(float f, float f_450_, float f_451_,
				 float f_452_, int i, int i_453_,
				 Class145 class145, int i_454_, int i_455_) {
	if (i != 0) {
	    double d = (double) (i_453_ & 0xffff) * 9.587379924285257E-5;
	    float f_456_ = (float) Math.sin(d) * (float) i;
	    float f_457_ = (float) Math.cos(d) * (float) i;
	    float f_458_ = (-f_451_ * f_457_ + -f_452_ * f_456_) / 4096.0F + f;
	    float f_459_
		= (--f_451_ * f_456_ + -f_452_ * f_457_) / 4096.0F + f_450_;
	    float f_460_ = ((((float) method22() - f_451_) * f_457_
			     + -f_452_ * f_456_) / 4096.0F
			    + f);
	    float f_461_ = ((-((float) method22() - f_451_) * f_456_
			     + -f_452_ * f_457_) / 4096.0F
			    + f_450_);
	    float f_462_
		= ((-f_451_ * f_457_
		    + ((float) method2692() - f_452_) * f_456_) / 4096.0F
		   + f);
	    float f_463_
		= ((--f_451_ * f_456_
		    + ((float) method2692() - f_452_) * f_457_) / 4096.0F
		   + f_450_);
	    method2731(f_458_, f_459_, f_460_, f_461_, f_462_, f_463_,
		       class145, i_454_, i_455_);
	}
    }
    
    public final void method2739(float f, float f_464_, float f_465_,
				 float f_466_, int i, int i_467_,
				 Class145 class145, int i_468_, int i_469_) {
	if (i != 0) {
	    double d = (double) (i_467_ & 0xffff) * 9.587379924285257E-5;
	    float f_470_ = (float) Math.sin(d) * (float) i;
	    float f_471_ = (float) Math.cos(d) * (float) i;
	    float f_472_ = (-f_465_ * f_471_ + -f_466_ * f_470_) / 4096.0F + f;
	    float f_473_
		= (--f_465_ * f_470_ + -f_466_ * f_471_) / 4096.0F + f_464_;
	    float f_474_ = ((((float) method22() - f_465_) * f_471_
			     + -f_466_ * f_470_) / 4096.0F
			    + f);
	    float f_475_ = ((-((float) method22() - f_465_) * f_470_
			     + -f_466_ * f_471_) / 4096.0F
			    + f_464_);
	    float f_476_
		= ((-f_465_ * f_471_
		    + ((float) method2692() - f_466_) * f_470_) / 4096.0F
		   + f);
	    float f_477_
		= ((--f_465_ * f_470_
		    + ((float) method2692() - f_466_) * f_471_) / 4096.0F
		   + f_464_);
	    method2731(f_472_, f_473_, f_474_, f_475_, f_476_, f_477_,
		       class145, i_468_, i_469_);
	}
    }
    
    public final void method2740(float f, float f_478_, float f_479_,
				 float f_480_, int i, int i_481_,
				 Class145 class145, int i_482_, int i_483_) {
	if (i != 0) {
	    double d = (double) (i_481_ & 0xffff) * 9.587379924285257E-5;
	    float f_484_ = (float) Math.sin(d) * (float) i;
	    float f_485_ = (float) Math.cos(d) * (float) i;
	    float f_486_ = (-f_479_ * f_485_ + -f_480_ * f_484_) / 4096.0F + f;
	    float f_487_
		= (--f_479_ * f_484_ + -f_480_ * f_485_) / 4096.0F + f_478_;
	    float f_488_ = ((((float) method22() - f_479_) * f_485_
			     + -f_480_ * f_484_) / 4096.0F
			    + f);
	    float f_489_ = ((-((float) method22() - f_479_) * f_484_
			     + -f_480_ * f_485_) / 4096.0F
			    + f_478_);
	    float f_490_
		= ((-f_479_ * f_485_
		    + ((float) method2692() - f_480_) * f_484_) / 4096.0F
		   + f);
	    float f_491_
		= ((--f_479_ * f_484_
		    + ((float) method2692() - f_480_) * f_485_) / 4096.0F
		   + f_478_);
	    method2731(f_486_, f_487_, f_488_, f_489_, f_490_, f_491_,
		       class145, i_482_, i_483_);
	}
    }
    
    public abstract void method2741(int[] is);
    
    public abstract int method20();
}
