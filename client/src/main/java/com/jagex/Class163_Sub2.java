/* Class163_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class163_Sub2 extends Class163
{
    int anInt9099;
    int anInt9100;
    int anInt9101;
    int anInt9102;
    int anInt9103;
    Interface22 anInterface22_9104;
    Class185_Sub1 aClass185_Sub1_9105;
    boolean aBool9106;
    int anInt9107;
    boolean aBool9108 = false;
    boolean aBool9109;
    boolean aBool9110;
    boolean aBool9111;
    Interface38 anInterface38_9112;
    
    Class163_Sub2(Class185_Sub1 class185_sub1, Interface38 interface38, int i,
		  int i_0_) {
	anInt9101 = 0;
	anInt9099 = 0;
	anInt9107 = 0;
	anInt9100 = 0;
	aClass185_Sub1_9105 = class185_sub1;
	anInt9102 = i;
	anInt9103 = i_0_;
	anInterface38_9112 = interface38;
	anInterface22_9104 = null;
	aBool9109 = anInterface38_9112.method1() != i;
	aBool9110 = anInterface38_9112.method93() != i_0_;
	aBool9106 = !aBool9109 && anInterface38_9112.method204();
	aBool9111 = !aBool9110 && anInterface38_9112.method204();
    }
    
    void method2702(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_,
		    int i_6_, int i_7_) {
	if (aClass185_Sub1_9105.method14703() != Class353.aClass353_3655) {
	    if (aBool9108) {
		i_2_ = i_2_ * anInt9102 / method22();
		i_3_ = i_3_ * anInt9103 / method2692();
		i += anInt9099 * i_2_ / anInt9102;
		i_1_ += anInt9101 * i_3_ / anInt9103;
	    }
	    aClass185_Sub1_9105.aClass371_9147.method6384
		((float) i, (float) i_1_, (float) (i + i_2_),
		 (float) (i_1_ + i_3_), anInterface38_9112.method241(0.0F),
		 anInterface38_9112.method245(0.0F),
		 anInterface38_9112.method241((float) anInt9102),
		 anInterface38_9112.method245((float) anInt9103),
		 anInterface38_9112, i_5_);
	} else {
	    aClass185_Sub1_9105.method14593();
	    aClass185_Sub1_9105.method14687(i_6_);
	    Class320 class320 = aClass185_Sub1_9105.aClass320_9232;
	    class320.anInterface38_3403 = anInterface38_9112;
	    class320.method5765(i_4_, i_5_);
	    if (aBool9108) {
		i_2_ = i_2_ * anInt9102 / method22();
		i_3_ = i_3_ * anInt9103 / method2692();
		i += anInt9099 * i_2_ / anInt9102;
		i_1_ += anInt9101 * i_3_ / anInt9103;
	    }
	    float f = (float) aClass185_Sub1_9105.method3253(-7085088)
				  .method2910();
	    float f_8_ = (float) aClass185_Sub1_9105.method3253
				     (-2019486811).method2911();
	    class320.aClass433_3409.method6952((float) i_2_ * 2.0F / f,
					       (float) i_3_ * 2.0F / f_8_,
					       1.0F, 1.0F);
	    class320.aClass433_3409.aFloatArray4853[12]
		= (((float) i + aClass185_Sub1_9105.method14715()) * 2.0F / f
		   - 1.0F);
	    class320.aClass433_3409.aFloatArray4853[13]
		= (((float) i_1_ + aClass185_Sub1_9105.method14715()) * 2.0F
		   / f_8_) - 1.0F;
	    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
	    class320.aClass433_3406.method6952
		(anInterface38_9112.method241((float) anInt9102),
		 anInterface38_9112.method245((float) anInt9103), 1.0F, 1.0F);
	    class320.anInterface37_3410
		= aClass185_Sub1_9105.anInterface37_9226;
	    class320.anInt3404 = 0;
	    class320.aClass349_3411 = aClass185_Sub1_9105.aClass349_9143;
	    class320.method5767();
	}
    }
    
    public int method2692() {
	return anInt9103 + anInt9101 + anInt9107;
    }
    
    public void method2645(int i, int i_9_, int i_10_, int i_11_) {
	anInt9099 = i;
	anInt9101 = i_9_;
	anInt9100 = i_10_;
	anInt9107 = i_11_;
	aBool9108 = (anInt9099 != 0 || anInt9101 != 0 || anInt9100 != 0
		     || anInt9107 != 0);
    }
    
    public void method2717(int i, int i_12_, int i_13_, int i_14_, int i_15_,
			   int i_16_) {
	anInterface38_9112.method247(i, i_12_, i_13_, i_14_, i_15_, i_16_);
    }
    
    public void method2655(int i, int i_17_, int i_18_) {
	int[] is
	    = aClass185_Sub1_9105.method3267(i, i_17_, anInt9102, anInt9103);
	int[] is_19_ = new int[anInt9102 * anInt9103];
	anInterface38_9112.method246(0, 0, anInt9102, anInt9103, is_19_, 0);
	if (i_18_ == 0) {
	    for (int i_20_ = 0; i_20_ < anInt9103; i_20_++) {
		int i_21_ = i_20_ * anInt9102;
		for (int i_22_ = 0; i_22_ < anInt9102; i_22_++)
		    is_19_[i_21_ + i_22_]
			= (is_19_[i_21_ + i_22_] & 0xffffff
			   | is[i_21_ + i_22_] << 8 & ~0xffffff);
	    }
	} else if (i_18_ == 1) {
	    for (int i_23_ = 0; i_23_ < anInt9103; i_23_++) {
		int i_24_ = i_23_ * anInt9102;
		for (int i_25_ = 0; i_25_ < anInt9102; i_25_++)
		    is_19_[i_24_ + i_25_]
			= (is_19_[i_24_ + i_25_] & 0xffffff
			   | is[i_24_ + i_25_] << 16 & ~0xffffff);
	    }
	} else if (i_18_ == 2) {
	    for (int i_26_ = 0; i_26_ < anInt9103; i_26_++) {
		int i_27_ = i_26_ * anInt9102;
		for (int i_28_ = 0; i_28_ < anInt9102; i_28_++)
		    is_19_[i_27_ + i_28_]
			= (is_19_[i_27_ + i_28_] & 0xffffff
			   | is[i_27_ + i_28_] << 24 & ~0xffffff);
	    }
	} else if (i_18_ == 3) {
	    for (int i_29_ = 0; i_29_ < anInt9103; i_29_++) {
		int i_30_ = i_29_ * anInt9102;
		for (int i_31_ = 0; i_31_ < anInt9102; i_31_++)
		    is_19_[i_30_ + i_31_]
			= (is_19_[i_30_ + i_31_] & 0xffffff
			   | (is[i_30_ + i_31_] != 0 ? -16777216 : 0));
	    }
	}
	method2652(0, 0, anInt9102, anInt9103, is_19_, 0, anInt9102);
    }
    
    public int method23() {
	return anInt9102 + anInt9099 + anInt9100;
    }
    
    public Interface22 method2683() {
	return anInterface22_9104;
    }
    
    public void method2691(int i, int i_32_, Class145 class145, int i_33_,
			   int i_34_) {
	aClass185_Sub1_9105.method14593();
	Class320 class320 = aClass185_Sub1_9105.aClass320_9232;
	class320.anInterface38_3403 = anInterface38_9112;
	class320.method5765(1, -1);
	i += anInt9099;
	i_32_ += anInt9101;
	float f
	    = (float) aClass185_Sub1_9105.method3253(-1597227307).method2910();
	float f_35_
	    = (float) aClass185_Sub1_9105.method3253(-1375349225).method2911();
	class320.aClass433_3409.method6952((float) anInt9102 * 2.0F / f,
					   (float) anInt9103 * 2.0F / f_35_,
					   1.0F, 1.0F);
	class320.aClass433_3409.aFloatArray4853[12]
	    = (((float) i + aClass185_Sub1_9105.method14715()) * 2.0F / f
	       - 1.0F);
	class320.aClass433_3409.aFloatArray4853[13]
	    = (((float) i_32_ + aClass185_Sub1_9105.method14715()) * 2.0F
	       / f_35_) - 1.0F;
	class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
	class320.aClass433_3406.method6952(anInterface38_9112
					       .method241((float) anInt9102),
					   anInterface38_9112
					       .method245((float) anInt9103),
					   1.0F, 1.0F);
	class320.anInterface37_3410 = aClass185_Sub1_9105.anInterface37_9226;
	class320.anInt3404 = 0;
	class320.aClass349_3411 = aClass185_Sub1_9105.aClass349_9143;
	Interface38 interface38
	    = ((Class145_Sub1) class145).anInterface38_9425;
	class320.anInterface38_3405 = interface38;
	class320.aClass433_3408.method6952(interface38
					       .method241((float) anInt9102),
					   interface38
					       .method245((float) anInt9103),
					   1.0F, 1.0F);
	class320.aClass433_3408.aFloatArray4853[12]
	    = interface38.method241((float) (i - i_33_));
	class320.aClass433_3408.aFloatArray4853[13]
	    = interface38.method245((float) (i_32_ - i_34_));
	class320.method5770();
    }
    
    public int method22() {
	return anInt9102 + anInt9099 + anInt9100;
    }
    
    public int method2649() {
	return anInt9103;
    }
    
    public void method2663(int i, int i_36_, int i_37_, int i_38_, int i_39_,
			   int i_40_, int i_41_) {
	if (aClass185_Sub1_9105.method14703() != Class353.aClass353_3655) {
	    int i_42_ = i_36_ + i_38_;
	    int i_43_ = i + i_37_;
	    int i_44_ = method22();
	    int i_45_ = method2692();
	    int i_46_ = i_36_ + anInt9101;
	    for (int i_47_ = i_46_ + anInt9103; i_47_ <= i_42_;
		 i_47_ += i_45_) {
		int i_48_ = i + anInt9099;
		for (int i_49_ = i_48_ + anInt9102; i_49_ <= i_43_;
		     i_49_ += i_44_) {
		    aClass185_Sub1_9105.aClass371_9147.method6384
			((float) i_48_, (float) i_46_,
			 (float) (i_48_ + anInt9102),
			 (float) (i_46_ + anInt9103), 0.0F, 0.0F,
			 anInterface38_9112.method250(),
			 anInterface38_9112.method249(), anInterface38_9112,
			 i_40_);
		    i_48_ += i_44_;
		}
		if (i_48_ < i_43_) {
		    int i_50_ = i_43_ - i_48_;
		    aClass185_Sub1_9105.aClass371_9147.method6384
			((float) i_48_, (float) i_46_, (float) (i_48_ + i_50_),
			 (float) (i_46_ + anInt9103), 0.0F, 0.0F,
			 ((float) i_50_ / (float) anInt9102
			  * anInterface38_9112.method250()),
			 anInterface38_9112.method249(), anInterface38_9112,
			 i_40_);
		}
		i_46_ += i_45_;
	    }
	    if (i_46_ < i_42_) {
		int i_51_ = i_42_ - i_46_;
		float f = ((float) i_51_ / (float) anInt9103
			   * anInterface38_9112.method249());
		int i_52_ = i + anInt9099;
		for (int i_53_ = i_52_ + anInt9102; i_53_ <= i_43_;
		     i_53_ += i_44_) {
		    aClass185_Sub1_9105.aClass371_9147.method6384
			((float) i_52_, (float) i_46_,
			 (float) (i_52_ + anInt9102), (float) (i_46_ + i_51_),
			 0.0F, 0.0F, anInterface38_9112.method250(), f,
			 anInterface38_9112, i_40_);
		    i_52_ += i_44_;
		}
		if (i_52_ < i_43_) {
		    int i_54_ = i_43_ - i_52_;
		    aClass185_Sub1_9105.aClass371_9147.method6384
			((float) i_52_, (float) i_46_, (float) (i_52_ + i_54_),
			 (float) (i_46_ + i_51_), 0.0F, 0.0F,
			 ((float) i_54_ / (float) anInt9102
			  * anInterface38_9112.method250()),
			 f, anInterface38_9112, i_40_);
		}
	    }
	} else {
	    aClass185_Sub1_9105.method14593();
	    aClass185_Sub1_9105.method14687(i_41_);
	    Class320 class320 = aClass185_Sub1_9105.aClass320_9232;
	    class320.anInterface38_3403 = anInterface38_9112;
	    class320.method5765(i_39_, i_40_);
	    float f = (float) aClass185_Sub1_9105.method3253(-180055444)
				  .method2910();
	    float f_55_ = (float) aClass185_Sub1_9105.method3253
				      (-1398921386).method2911();
	    class320.anInterface37_3410
		= aClass185_Sub1_9105.anInterface37_9226;
	    class320.anInt3404 = 0;
	    class320.aClass349_3411 = aClass185_Sub1_9105.aClass349_9143;
	    boolean bool = aBool9111 && anInt9101 == 0 && anInt9107 == 0;
	    boolean bool_56_ = aBool9106 && anInt9099 == 0 && anInt9100 == 0;
	    if (bool_56_ & bool) {
		class320.aClass433_3409.method6952((float) i_37_ * 2.0F / f,
						   ((float) i_38_ * 2.0F
						    / f_55_),
						   1.0F, 1.0F);
		class320.aClass433_3409.aFloatArray4853[12]
		    = (((float) i + aClass185_Sub1_9105.method14715()) * 2.0F
		       / f) - 1.0F;
		class320.aClass433_3409.aFloatArray4853[13]
		    = (((float) i_36_ + aClass185_Sub1_9105.method14715())
		       * 2.0F / f_55_) - 1.0F;
		class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
		class320.aClass433_3406.method6952
		    (anInterface38_9112.method241((float) i_37_),
		     anInterface38_9112.method245((float) i_38_), 1.0F, 1.0F);
		class320.method5767();
	    } else if (bool_56_) {
		int i_57_ = i_36_ + i_38_;
		int i_58_ = method2692();
		class320.aClass433_3406.method6952
		    (anInterface38_9112.method241((float) i_37_),
		     anInterface38_9112.method245((float) anInt9103), 1.0F,
		     1.0F);
		int i_59_ = i_36_ + anInt9101;
		for (int i_60_ = i_59_ + anInt9103; i_60_ <= i_57_;
		     i_60_ += i_58_) {
		    class320.aClass433_3409.method6952(((float) i_37_ * 2.0F
							/ f),
						       ((float) anInt9103
							* 2.0F / f_55_),
						       1.0F, 1.0F);
		    class320.aClass433_3409.aFloatArray4853[12]
			= (((float) i + aClass185_Sub1_9105.method14715())
			   * 2.0F / f) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[13]
			= (((float) i_59_ + aClass185_Sub1_9105.method14715())
			   * 2.0F / f_55_) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
		    class320.method5767();
		    i_59_ += i_58_;
		}
		if (i_59_ < i_57_) {
		    int i_61_ = i_57_ - i_59_;
		    class320.aClass433_3406.method6952
			(anInterface38_9112.method241((float) i_37_),
			 anInterface38_9112.method245((float) i_61_), 1.0F,
			 1.0F);
		    class320.aClass433_3409.method6952(((float) i_37_ * 2.0F
							/ f),
						       ((float) i_61_ * 2.0F
							/ f_55_),
						       1.0F, 1.0F);
		    class320.aClass433_3409.aFloatArray4853[12]
			= (((float) i + aClass185_Sub1_9105.method14715())
			   * 2.0F / f) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[13]
			= (((float) i_59_ + aClass185_Sub1_9105.method14715())
			   * 2.0F / f_55_) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
		    class320.method5767();
		}
	    } else if (bool) {
		int i_62_ = i + i_37_;
		int i_63_ = method22();
		class320.aClass433_3406.method6952
		    (anInterface38_9112.method241((float) anInt9102),
		     anInterface38_9112.method245((float) i_38_), 1.0F, 1.0F);
		int i_64_ = i + anInt9099;
		for (int i_65_ = i_64_ + anInt9102; i_65_ <= i_62_;
		     i_65_ += i_63_) {
		    class320.aClass433_3409.method6952(((float) anInt9102
							* 2.0F / f),
						       ((float) i_38_ * 2.0F
							/ f_55_),
						       1.0F, 1.0F);
		    class320.aClass433_3409.aFloatArray4853[12]
			= (((float) i_64_ + aClass185_Sub1_9105.method14715())
			   * 2.0F / f) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[13]
			= (((float) i_36_ + aClass185_Sub1_9105.method14715())
			   * 2.0F / f_55_) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
		    class320.method5767();
		    i_64_ += i_63_;
		}
		if (i_64_ < i_62_) {
		    int i_66_ = i_62_ - i_64_;
		    class320.aClass433_3406.method6952
			(anInterface38_9112.method241((float) i_66_),
			 anInterface38_9112.method245((float) i_38_), 1.0F,
			 1.0F);
		    class320.aClass433_3409.method6952(((float) i_66_ * 2.0F
							/ f),
						       ((float) i_38_ * 2.0F
							/ f_55_),
						       1.0F, 1.0F);
		    class320.aClass433_3409.aFloatArray4853[12]
			= (((float) i_64_ + aClass185_Sub1_9105.method14715())
			   * 2.0F / f) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[13]
			= (((float) i_36_ + aClass185_Sub1_9105.method14715())
			   * 2.0F / f_55_) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
		    class320.method5767();
		}
	    } else {
		int i_67_ = i_36_ + i_38_;
		int i_68_ = i + i_37_;
		int i_69_ = method22();
		int i_70_ = method2692();
		int i_71_ = i_36_ + anInt9101;
		for (int i_72_ = i_71_ + anInt9103; i_72_ <= i_67_;
		     i_72_ += i_70_) {
		    class320.aClass433_3406.method6952
			(anInterface38_9112.method241((float) anInt9102),
			 anInterface38_9112.method245((float) anInt9103), 1.0F,
			 1.0F);
		    int i_73_ = i + anInt9099;
		    for (int i_74_ = i_73_ + anInt9102; i_74_ <= i_68_;
			 i_74_ += i_69_) {
			class320.aClass433_3409.method6952(((float) anInt9102
							    * 2.0F / f),
							   ((float) anInt9103
							    * 2.0F / f_55_),
							   1.0F, 1.0F);
			class320.aClass433_3409.aFloatArray4853[12]
			    = (((float) i_73_
				+ aClass185_Sub1_9105.method14715()) * 2.0F / f
			       - 1.0F);
			class320.aClass433_3409.aFloatArray4853[13]
			    = (((float) i_71_
				+ aClass185_Sub1_9105.method14715())
			       * 2.0F / f_55_) - 1.0F;
			class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
			class320.method5767();
			i_73_ += i_69_;
		    }
		    if (i_73_ < i_68_) {
			int i_75_ = i_68_ - i_73_;
			class320.aClass433_3406.method6952
			    (anInterface38_9112.method241((float) i_75_),
			     anInterface38_9112.method245((float) anInt9103),
			     1.0F, 1.0F);
			class320.aClass433_3409.method6952(((float) i_75_
							    * 2.0F / f),
							   ((float) anInt9103
							    * 2.0F / f_55_),
							   1.0F, 1.0F);
			class320.aClass433_3409.aFloatArray4853[12]
			    = (((float) i_73_
				+ aClass185_Sub1_9105.method14715()) * 2.0F / f
			       - 1.0F);
			class320.aClass433_3409.aFloatArray4853[13]
			    = (((float) i_71_
				+ aClass185_Sub1_9105.method14715())
			       * 2.0F / f_55_) - 1.0F;
			class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
			class320.method5767();
		    }
		    i_71_ += i_70_;
		}
		if (i_71_ < i_67_) {
		    int i_76_ = i_67_ - i_71_;
		    class320.aClass433_3406.method6952
			(anInterface38_9112.method241((float) anInt9102),
			 anInterface38_9112.method245((float) i_76_), 1.0F,
			 1.0F);
		    int i_77_ = i + anInt9099;
		    for (int i_78_ = i_77_ + anInt9102; i_78_ <= i_68_;
			 i_78_ += i_69_) {
			class320.aClass433_3409.method6952(((float) anInt9102
							    * 2.0F / f),
							   ((float) i_76_
							    * 2.0F / f_55_),
							   1.0F, 1.0F);
			class320.aClass433_3409.aFloatArray4853[12]
			    = (((float) i_77_
				+ aClass185_Sub1_9105.method14715()) * 2.0F / f
			       - 1.0F);
			class320.aClass433_3409.aFloatArray4853[13]
			    = (((float) i_71_
				+ aClass185_Sub1_9105.method14715())
			       * 2.0F / f_55_) - 1.0F;
			class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
			class320.method5767();
			i_77_ += i_69_;
		    }
		    if (i_77_ < i_68_) {
			int i_79_ = i_68_ - i_77_;
			class320.aClass433_3406.method6952
			    (anInterface38_9112.method241((float) i_79_),
			     anInterface38_9112.method245((float) i_76_), 1.0F,
			     1.0F);
			class320.aClass433_3409.method6952(((float) i_79_
							    * 2.0F / f),
							   ((float) i_76_
							    * 2.0F / f_55_),
							   1.0F, 1.0F);
			class320.aClass433_3409.aFloatArray4853[12]
			    = (((float) i_77_
				+ aClass185_Sub1_9105.method14715()) * 2.0F / f
			       - 1.0F);
			class320.aClass433_3409.aFloatArray4853[13]
			    = (((float) i_71_
				+ aClass185_Sub1_9105.method14715())
			       * 2.0F / f_55_) - 1.0F;
			class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
			class320.method5767();
		    }
		}
	    }
	}
    }
    
    public Interface22 method2651() {
	return anInterface22_9104;
    }
    
    public void method2652(int i, int i_80_, int i_81_, int i_82_, int[] is,
			   int i_83_, int i_84_) {
	anInterface38_9112.method269(i, i_80_, i_81_, i_82_, is, i_83_, i_84_);
    }
    
    public void method2653(int i, int i_85_, int i_86_, int i_87_, int[] is,
			   int[] is_88_, int i_89_, int i_90_) {
	anInterface38_9112.method262(i, i_85_, i_86_, i_87_, is, is_88_,
				     i_89_);
    }
    
    void method2719(float f, float f_91_, float f_92_, float f_93_,
		    float f_94_, float f_95_, int i, int i_96_, int i_97_,
		    int i_98_) {
	if (aClass185_Sub1_9105.method14703() != Class353.aClass353_3655)
	    aClass185_Sub1_9105.aClass371_9147.method6398
		(f, f_91_, f_92_, f_93_, f_94_, f_95_, f_92_ + f_94_ - f,
		 f_93_ + f_95_ - f_91_, 0.0F, 0.0F,
		 anInterface38_9112.method250(), 0.0F, 0.0F,
		 anInterface38_9112.method249(),
		 anInterface38_9112.method250(),
		 anInterface38_9112.method249(), anInterface38_9112, i_96_);
	else {
	    aClass185_Sub1_9105.method14593();
	    aClass185_Sub1_9105.method14687(i_97_);
	    if (aBool9108) {
		float f_99_ = (float) method22();
		float f_100_ = (float) method2692();
		float f_101_ = (f_92_ - f) / f_99_;
		float f_102_ = (f_93_ - f_91_) / f_99_;
		float f_103_ = (f_94_ - f) / f_100_;
		float f_104_ = (f_95_ - f_91_) / f_100_;
		float f_105_ = f_103_ * (float) anInt9101;
		float f_106_ = f_104_ * (float) anInt9101;
		float f_107_ = f_101_ * (float) anInt9099;
		float f_108_ = f_102_ * (float) anInt9099;
		float f_109_ = -f_101_ * (float) anInt9100;
		float f_110_ = -f_102_ * (float) anInt9100;
		float f_111_ = -f_103_ * (float) anInt9107;
		float f_112_ = -f_104_ * (float) anInt9107;
		f = f + f_107_ + f_105_;
		f_91_ = f_91_ + f_108_ + f_106_;
		f_92_ = f_92_ + f_109_ + f_105_;
		f_93_ = f_93_ + f_110_ + f_106_;
		f_94_ = f_94_ + f_107_ + f_111_;
		f_95_ = f_95_ + f_108_ + f_112_;
	    }
	    Class320 class320 = aClass185_Sub1_9105.aClass320_9232;
	    class320.anInterface38_3403 = anInterface38_9112;
	    class320.method5765(i, i_96_);
	    float f_113_ = (float) aClass185_Sub1_9105.method3253
				       (-1508901875).method2910();
	    float f_114_ = (float) aClass185_Sub1_9105.method3253
				       (-1669845134).method2911();
	    class320.aClass433_3409.method6840();
	    class320.aClass433_3409.aFloatArray4853[0]
		= (f_92_ - f) * 2.0F / f_113_;
	    class320.aClass433_3409.aFloatArray4853[1]
		= (f_93_ - f_91_) * 2.0F / f_114_;
	    class320.aClass433_3409.aFloatArray4853[4]
		= (f_94_ - f) * 2.0F / f_113_;
	    class320.aClass433_3409.aFloatArray4853[5]
		= (f_95_ - f_91_) * 2.0F / f_114_;
	    class320.aClass433_3409.aFloatArray4853[12]
		= ((f + aClass185_Sub1_9105.method14715()) * 2.0F / f_113_
		   - 1.0F);
	    class320.aClass433_3409.aFloatArray4853[13]
		= ((f_91_ + aClass185_Sub1_9105.method14715()) * 2.0F / f_114_
		   - 1.0F);
	    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
	    class320.aClass433_3406.method6952
		(anInterface38_9112.method241((float) anInt9102),
		 anInterface38_9112.method245((float) anInt9103), 1.0F, 1.0F);
	    class320.anInterface37_3410
		= aClass185_Sub1_9105.anInterface37_9226;
	    class320.anInt3404 = 0;
	    class320.aClass349_3411 = aClass185_Sub1_9105.aClass349_9143;
	    class320.method5767();
	}
    }
    
    public void method2676(int i, int i_115_, int i_116_, int i_117_, int[] is,
			   int[] is_118_, int i_119_, int i_120_) {
	anInterface38_9112.method262(i, i_115_, i_116_, i_117_, is, is_118_,
				     i_119_);
    }
    
    void method2661(int i, int i_121_, int i_122_, int i_123_, int i_124_,
		    int i_125_, int i_126_, int i_127_) {
	if (aClass185_Sub1_9105.method14703() != Class353.aClass353_3655) {
	    if (aBool9108) {
		i_122_ = i_122_ * anInt9102 / method22();
		i_123_ = i_123_ * anInt9103 / method2692();
		i += anInt9099 * i_122_ / anInt9102;
		i_121_ += anInt9101 * i_123_ / anInt9103;
	    }
	    aClass185_Sub1_9105.aClass371_9147.method6384
		((float) i, (float) i_121_, (float) (i + i_122_),
		 (float) (i_121_ + i_123_), anInterface38_9112.method241(0.0F),
		 anInterface38_9112.method245(0.0F),
		 anInterface38_9112.method241((float) anInt9102),
		 anInterface38_9112.method245((float) anInt9103),
		 anInterface38_9112, i_125_);
	} else {
	    aClass185_Sub1_9105.method14593();
	    aClass185_Sub1_9105.method14687(i_126_);
	    Class320 class320 = aClass185_Sub1_9105.aClass320_9232;
	    class320.anInterface38_3403 = anInterface38_9112;
	    class320.method5765(i_124_, i_125_);
	    if (aBool9108) {
		i_122_ = i_122_ * anInt9102 / method22();
		i_123_ = i_123_ * anInt9103 / method2692();
		i += anInt9099 * i_122_ / anInt9102;
		i_121_ += anInt9101 * i_123_ / anInt9103;
	    }
	    float f = (float) aClass185_Sub1_9105.method3253(-318046021)
				  .method2910();
	    float f_128_ = (float) aClass185_Sub1_9105.method3253
				       (-2076691998).method2911();
	    class320.aClass433_3409.method6952((float) i_122_ * 2.0F / f,
					       (float) i_123_ * 2.0F / f_128_,
					       1.0F, 1.0F);
	    class320.aClass433_3409.aFloatArray4853[12]
		= (((float) i + aClass185_Sub1_9105.method14715()) * 2.0F / f
		   - 1.0F);
	    class320.aClass433_3409.aFloatArray4853[13]
		= (((float) i_121_ + aClass185_Sub1_9105.method14715()) * 2.0F
		   / f_128_) - 1.0F;
	    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
	    class320.aClass433_3406.method6952
		(anInterface38_9112.method241((float) anInt9102),
		 anInterface38_9112.method245((float) anInt9103), 1.0F, 1.0F);
	    class320.anInterface37_3410
		= aClass185_Sub1_9105.anInterface37_9226;
	    class320.anInt3404 = 0;
	    class320.aClass349_3411 = aClass185_Sub1_9105.aClass349_9143;
	    class320.method5767();
	}
    }
    
    public void method2737(int i, int i_129_, int i_130_, int i_131_, int[] is,
			   int i_132_, int i_133_) {
	anInterface38_9112.method269(i, i_129_, i_130_, i_131_, is, i_132_,
				     i_133_);
    }
    
    void method2671(float f, float f_134_, float f_135_, float f_136_,
		    float f_137_, float f_138_, int i, int i_139_, int i_140_,
		    int i_141_) {
	if (aClass185_Sub1_9105.method14703() != Class353.aClass353_3655)
	    aClass185_Sub1_9105.aClass371_9147.method6398
		(f, f_134_, f_135_, f_136_, f_137_, f_138_,
		 f_135_ + f_137_ - f, f_136_ + f_138_ - f_134_, 0.0F, 0.0F,
		 anInterface38_9112.method250(), 0.0F, 0.0F,
		 anInterface38_9112.method249(),
		 anInterface38_9112.method250(),
		 anInterface38_9112.method249(), anInterface38_9112, i_139_);
	else {
	    aClass185_Sub1_9105.method14593();
	    aClass185_Sub1_9105.method14687(i_140_);
	    if (aBool9108) {
		float f_142_ = (float) method22();
		float f_143_ = (float) method2692();
		float f_144_ = (f_135_ - f) / f_142_;
		float f_145_ = (f_136_ - f_134_) / f_142_;
		float f_146_ = (f_137_ - f) / f_143_;
		float f_147_ = (f_138_ - f_134_) / f_143_;
		float f_148_ = f_146_ * (float) anInt9101;
		float f_149_ = f_147_ * (float) anInt9101;
		float f_150_ = f_144_ * (float) anInt9099;
		float f_151_ = f_145_ * (float) anInt9099;
		float f_152_ = -f_144_ * (float) anInt9100;
		float f_153_ = -f_145_ * (float) anInt9100;
		float f_154_ = -f_146_ * (float) anInt9107;
		float f_155_ = -f_147_ * (float) anInt9107;
		f = f + f_150_ + f_148_;
		f_134_ = f_134_ + f_151_ + f_149_;
		f_135_ = f_135_ + f_152_ + f_148_;
		f_136_ = f_136_ + f_153_ + f_149_;
		f_137_ = f_137_ + f_150_ + f_154_;
		f_138_ = f_138_ + f_151_ + f_155_;
	    }
	    Class320 class320 = aClass185_Sub1_9105.aClass320_9232;
	    class320.anInterface38_3403 = anInterface38_9112;
	    class320.method5765(i, i_139_);
	    float f_156_ = (float) aClass185_Sub1_9105.method3253
				       (-2058071113).method2910();
	    float f_157_ = (float) aClass185_Sub1_9105.method3253
				       (-61209773).method2911();
	    class320.aClass433_3409.method6840();
	    class320.aClass433_3409.aFloatArray4853[0]
		= (f_135_ - f) * 2.0F / f_156_;
	    class320.aClass433_3409.aFloatArray4853[1]
		= (f_136_ - f_134_) * 2.0F / f_157_;
	    class320.aClass433_3409.aFloatArray4853[4]
		= (f_137_ - f) * 2.0F / f_156_;
	    class320.aClass433_3409.aFloatArray4853[5]
		= (f_138_ - f_134_) * 2.0F / f_157_;
	    class320.aClass433_3409.aFloatArray4853[12]
		= ((f + aClass185_Sub1_9105.method14715()) * 2.0F / f_156_
		   - 1.0F);
	    class320.aClass433_3409.aFloatArray4853[13]
		= ((f_134_ + aClass185_Sub1_9105.method14715()) * 2.0F / f_157_
		   - 1.0F);
	    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
	    class320.aClass433_3406.method6952
		(anInterface38_9112.method241((float) anInt9102),
		 anInterface38_9112.method245((float) anInt9103), 1.0F, 1.0F);
	    class320.anInterface37_3410
		= aClass185_Sub1_9105.anInterface37_9226;
	    class320.anInt3404 = 0;
	    class320.aClass349_3411 = aClass185_Sub1_9105.aClass349_9143;
	    class320.method5767();
	}
    }
    
    void method2673(float f, float f_158_, float f_159_, float f_160_,
		    float f_161_, float f_162_, int i, Class145 class145,
		    int i_163_, int i_164_) {
	aClass185_Sub1_9105.method14593();
	Class320 class320 = aClass185_Sub1_9105.aClass320_9232;
	class320.anInterface38_3403 = anInterface38_9112;
	class320.method5765(1, -1);
	float f_165_
	    = (float) aClass185_Sub1_9105.method3253(-1210158539).method2910();
	float f_166_
	    = (float) aClass185_Sub1_9105.method3253(-1727618462).method2911();
	class320.aClass433_3409.method6840();
	if (aBool9108) {
	    float f_167_ = (float) anInt9102 / (float) method22();
	    float f_168_ = (float) anInt9103 / (float) method2692();
	    class320.aClass433_3409.aFloatArray4853[0] = (f_159_ - f) * f_167_;
	    class320.aClass433_3409.aFloatArray4853[1]
		= (f_160_ - f_158_) * f_167_;
	    class320.aClass433_3409.aFloatArray4853[4] = (f_161_ - f) * f_168_;
	    class320.aClass433_3409.aFloatArray4853[5]
		= (f_162_ - f_158_) * f_168_;
	    class320.aClass433_3409.aFloatArray4853[12]
		= ((f + (float) anInt9099) * f_167_
		   + aClass185_Sub1_9105.method14715());
	    class320.aClass433_3409.aFloatArray4853[13]
		= ((f_158_ + (float) anInt9101) * f_168_
		   + aClass185_Sub1_9105.method14715());
	} else {
	    class320.aClass433_3409.aFloatArray4853[0] = f_159_ - f;
	    class320.aClass433_3409.aFloatArray4853[1] = f_160_ - f_158_;
	    class320.aClass433_3409.aFloatArray4853[4] = f_161_ - f;
	    class320.aClass433_3409.aFloatArray4853[5] = f_162_ - f_158_;
	    class320.aClass433_3409.aFloatArray4853[12]
		= f + aClass185_Sub1_9105.method14715();
	    class320.aClass433_3409.aFloatArray4853[13]
		= f_158_ + aClass185_Sub1_9105.method14715();
	}
	Class433 class433 = aClass185_Sub1_9105.aClass433_9194;
	class433.method6840();
	class433.aFloatArray4853[0] = 2.0F / f_165_;
	class433.aFloatArray4853[5] = 2.0F / f_166_;
	class433.aFloatArray4853[12] = -1.0F;
	class433.aFloatArray4853[13] = -1.0F;
	class433.aFloatArray4853[14] = -1.0F;
	class320.aClass433_3409.method6839(class433);
	class320.aClass433_3406.method6952(anInterface38_9112
					       .method241((float) anInt9102),
					   anInterface38_9112
					       .method245((float) anInt9103),
					   1.0F, 1.0F);
	class320.anInterface37_3410 = aClass185_Sub1_9105.anInterface37_9226;
	class320.anInt3404 = 0;
	class320.aClass349_3411 = aClass185_Sub1_9105.aClass349_9143;
	Interface38 interface38
	    = ((Class145_Sub1) class145).anInterface38_9425;
	class320.anInterface38_3405 = interface38;
	class320.aClass433_3408.method6840();
	class320.aClass433_3408.aFloatArray4853[0]
	    = (f_159_ - f) * interface38.method241(1.0F);
	class320.aClass433_3408.aFloatArray4853[1]
	    = (f_160_ - f_158_) * interface38.method241(1.0F);
	class320.aClass433_3408.aFloatArray4853[4]
	    = (f_161_ - f) * interface38.method245(1.0F);
	class320.aClass433_3408.aFloatArray4853[5]
	    = (f_162_ - f_158_) * interface38.method245(1.0F);
	class320.aClass433_3408.aFloatArray4853[12]
	    = (f - (float) i_163_) * interface38.method241(1.0F);
	class320.aClass433_3408.aFloatArray4853[13]
	    = (f_158_ - (float) i_164_) * interface38.method245(1.0F);
	class320.method5770();
    }
    
    public Interface22 method2682() {
	return anInterface22_9104;
    }
    
    public void method2648(int i, int i_169_, int i_170_, int i_171_, int[] is,
			   int[] is_172_, int i_173_, int i_174_) {
	anInterface38_9112.method262(i, i_169_, i_170_, i_171_, is, is_172_,
				     i_173_);
    }
    
    Class163_Sub2(Class185_Sub1 class185_sub1, int i, int i_175_, int[] is,
		  int i_176_, int i_177_) {
	anInt9101 = 0;
	anInt9099 = 0;
	anInt9107 = 0;
	anInt9100 = 0;
	aClass185_Sub1_9105 = class185_sub1;
	anInt9102 = i;
	anInt9103 = i_175_;
	anInterface22_9104 = null;
	anInterface38_9112
	    = class185_sub1.method14772(i, i_175_, false, is, i_176_, i_177_);
	anInterface38_9112.method257(true, true);
	aBool9109 = anInterface38_9112.method1() != i;
	aBool9110 = anInterface38_9112.method93() != i_175_;
	aBool9106 = !aBool9109 && anInterface38_9112.method204();
	aBool9111 = !aBool9110 && anInterface38_9112.method204();
    }
    
    public void method2693(int i, int i_178_, int i_179_, int i_180_, int[] is,
			   int[] is_181_, int i_182_, int i_183_) {
	anInterface38_9112.method262(i, i_178_, i_179_, i_180_, is, is_181_,
				     i_182_);
    }
    
    public void method2678(int i, int i_184_, int i_185_, int i_186_,
			   int i_187_, int i_188_) {
	anInterface38_9112.method247(i, i_184_, i_185_, i_186_, i_187_,
				     i_188_);
    }
    
    public Interface22 method2650() {
	return anInterface22_9104;
    }
    
    public Interface22 method2688() {
	return anInterface22_9104;
    }
    
    public Interface22 method2681() {
	return anInterface22_9104;
    }
    
    public void method2646(int[] is) {
	is[0] = anInt9099;
	is[1] = anInt9101;
	is[2] = anInt9100;
	is[3] = anInt9107;
    }
    
    public int method2709() {
	return anInt9102;
    }
    
    public void method2684(int i, int i_189_, int i_190_, int i_191_,
			   int i_192_) {
	if (aClass185_Sub1_9105.method14703() != Class353.aClass353_3655) {
	    i += anInt9099;
	    i_189_ += anInt9101;
	    aClass185_Sub1_9105.aClass371_9147.method6384
		((float) i, (float) i_189_, (float) (i + anInt9102),
		 (float) (i_189_ + anInt9103), 0.0F, 0.0F,
		 anInterface38_9112.method250(),
		 anInterface38_9112.method249(), anInterface38_9112, i_191_);
	} else {
	    aClass185_Sub1_9105.method14593();
	    aClass185_Sub1_9105.method14687(i_192_);
	    Class320 class320 = aClass185_Sub1_9105.aClass320_9232;
	    class320.anInterface38_3403 = anInterface38_9112;
	    class320.method5765(i_190_, i_191_);
	    i += anInt9099;
	    i_189_ += anInt9101;
	    float f = (float) aClass185_Sub1_9105.method3253(-1369995896)
				  .method2910();
	    float f_193_ = (float) aClass185_Sub1_9105.method3253
				       (-119679623).method2911();
	    class320.aClass433_3409.method6952((float) anInt9102 * 2.0F / f,
					       ((float) anInt9103 * 2.0F
						/ f_193_),
					       1.0F, 1.0F);
	    class320.aClass433_3409.aFloatArray4853[12]
		= (((float) i + aClass185_Sub1_9105.method14715()) * 2.0F / f
		   - 1.0F);
	    class320.aClass433_3409.aFloatArray4853[13]
		= (((float) i_189_ + aClass185_Sub1_9105.method14715()) * 2.0F
		   / f_193_) - 1.0F;
	    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
	    class320.aClass433_3406.method6952
		(anInterface38_9112.method241((float) anInt9102),
		 anInterface38_9112.method245((float) anInt9103), 1.0F, 1.0F);
	    class320.anInterface37_3410
		= aClass185_Sub1_9105.anInterface37_9226;
	    class320.anInt3404 = 0;
	    class320.aClass349_3411 = aClass185_Sub1_9105.aClass349_9143;
	    class320.method5767();
	}
    }
    
    public void method2685(int i, int i_194_, Class145 class145, int i_195_,
			   int i_196_) {
	aClass185_Sub1_9105.method14593();
	Class320 class320 = aClass185_Sub1_9105.aClass320_9232;
	class320.anInterface38_3403 = anInterface38_9112;
	class320.method5765(1, -1);
	i += anInt9099;
	i_194_ += anInt9101;
	float f
	    = (float) aClass185_Sub1_9105.method3253(-1190534992).method2910();
	float f_197_
	    = (float) aClass185_Sub1_9105.method3253(-372080812).method2911();
	class320.aClass433_3409.method6952((float) anInt9102 * 2.0F / f,
					   (float) anInt9103 * 2.0F / f_197_,
					   1.0F, 1.0F);
	class320.aClass433_3409.aFloatArray4853[12]
	    = (((float) i + aClass185_Sub1_9105.method14715()) * 2.0F / f
	       - 1.0F);
	class320.aClass433_3409.aFloatArray4853[13]
	    = (((float) i_194_ + aClass185_Sub1_9105.method14715()) * 2.0F
	       / f_197_) - 1.0F;
	class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
	class320.aClass433_3406.method6952(anInterface38_9112
					       .method241((float) anInt9102),
					   anInterface38_9112
					       .method245((float) anInt9103),
					   1.0F, 1.0F);
	class320.anInterface37_3410 = aClass185_Sub1_9105.anInterface37_9226;
	class320.anInt3404 = 0;
	class320.aClass349_3411 = aClass185_Sub1_9105.aClass349_9143;
	Interface38 interface38
	    = ((Class145_Sub1) class145).anInterface38_9425;
	class320.anInterface38_3405 = interface38;
	class320.aClass433_3408.method6952(interface38
					       .method241((float) anInt9102),
					   interface38
					       .method245((float) anInt9103),
					   1.0F, 1.0F);
	class320.aClass433_3408.aFloatArray4853[12]
	    = interface38.method241((float) (i - i_195_));
	class320.aClass433_3408.aFloatArray4853[13]
	    = interface38.method245((float) (i_194_ - i_196_));
	class320.method5770();
    }
    
    void method2686(int i, int i_198_, int i_199_, int i_200_, int i_201_,
		    int i_202_, int i_203_, int i_204_) {
	if (aClass185_Sub1_9105.method14703() != Class353.aClass353_3655) {
	    if (aBool9108) {
		i_199_ = i_199_ * anInt9102 / method22();
		i_200_ = i_200_ * anInt9103 / method2692();
		i += anInt9099 * i_199_ / anInt9102;
		i_198_ += anInt9101 * i_200_ / anInt9103;
	    }
	    aClass185_Sub1_9105.aClass371_9147.method6384
		((float) i, (float) i_198_, (float) (i + i_199_),
		 (float) (i_198_ + i_200_), anInterface38_9112.method241(0.0F),
		 anInterface38_9112.method245(0.0F),
		 anInterface38_9112.method241((float) anInt9102),
		 anInterface38_9112.method245((float) anInt9103),
		 anInterface38_9112, i_202_);
	} else {
	    aClass185_Sub1_9105.method14593();
	    aClass185_Sub1_9105.method14687(i_203_);
	    Class320 class320 = aClass185_Sub1_9105.aClass320_9232;
	    class320.anInterface38_3403 = anInterface38_9112;
	    class320.method5765(i_201_, i_202_);
	    if (aBool9108) {
		i_199_ = i_199_ * anInt9102 / method22();
		i_200_ = i_200_ * anInt9103 / method2692();
		i += anInt9099 * i_199_ / anInt9102;
		i_198_ += anInt9101 * i_200_ / anInt9103;
	    }
	    float f = (float) aClass185_Sub1_9105.method3253(-947324725)
				  .method2910();
	    float f_205_ = (float) aClass185_Sub1_9105.method3253
				       (-604120162).method2911();
	    class320.aClass433_3409.method6952((float) i_199_ * 2.0F / f,
					       (float) i_200_ * 2.0F / f_205_,
					       1.0F, 1.0F);
	    class320.aClass433_3409.aFloatArray4853[12]
		= (((float) i + aClass185_Sub1_9105.method14715()) * 2.0F / f
		   - 1.0F);
	    class320.aClass433_3409.aFloatArray4853[13]
		= (((float) i_198_ + aClass185_Sub1_9105.method14715()) * 2.0F
		   / f_205_) - 1.0F;
	    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
	    class320.aClass433_3406.method6952
		(anInterface38_9112.method241((float) anInt9102),
		 anInterface38_9112.method245((float) anInt9103), 1.0F, 1.0F);
	    class320.anInterface37_3410
		= aClass185_Sub1_9105.anInterface37_9226;
	    class320.anInt3404 = 0;
	    class320.aClass349_3411 = aClass185_Sub1_9105.aClass349_9143;
	    class320.method5767();
	}
    }
    
    Class163_Sub2(Class185_Sub1 class185_sub1, int i, int i_206_, boolean bool,
		  boolean bool_207_) {
	anInt9101 = 0;
	anInt9099 = 0;
	anInt9107 = 0;
	anInt9100 = 0;
	aClass185_Sub1_9105 = class185_sub1;
	anInt9102 = i;
	anInt9103 = i_206_;
	if (bool_207_) {
	    Interface44 interface44
		= class185_sub1.method14666((bool ? Class181.aClass181_1952
					     : Class181.aClass181_1959),
					    Class173.aClass173_1830, i,
					    i_206_);
	    anInterface22_9104 = interface44.method342(0);
	    anInterface38_9112 = interface44;
	} else {
	    anInterface38_9112
		= class185_sub1.method14661((bool ? Class181.aClass181_1952
					     : Class181.aClass181_1959),
					    Class173.aClass173_1830, i,
					    i_206_);
	    anInterface22_9104 = null;
	}
	anInterface38_9112.method257(true, true);
	aBool9109 = anInterface38_9112.method1() != i;
	aBool9110 = anInterface38_9112.method93() != i_206_;
	aBool9106 = !aBool9109 && anInterface38_9112.method204();
	aBool9111 = !aBool9110 && anInterface38_9112.method204();
    }
    
    void method2710(float f, float f_208_, float f_209_, float f_210_,
		    float f_211_, float f_212_, int i, int i_213_, int i_214_,
		    int i_215_) {
	if (aClass185_Sub1_9105.method14703() != Class353.aClass353_3655)
	    aClass185_Sub1_9105.aClass371_9147.method6398
		(f, f_208_, f_209_, f_210_, f_211_, f_212_,
		 f_209_ + f_211_ - f, f_210_ + f_212_ - f_208_, 0.0F, 0.0F,
		 anInterface38_9112.method250(), 0.0F, 0.0F,
		 anInterface38_9112.method249(),
		 anInterface38_9112.method250(),
		 anInterface38_9112.method249(), anInterface38_9112, i_213_);
	else {
	    aClass185_Sub1_9105.method14593();
	    aClass185_Sub1_9105.method14687(i_214_);
	    if (aBool9108) {
		float f_216_ = (float) method22();
		float f_217_ = (float) method2692();
		float f_218_ = (f_209_ - f) / f_216_;
		float f_219_ = (f_210_ - f_208_) / f_216_;
		float f_220_ = (f_211_ - f) / f_217_;
		float f_221_ = (f_212_ - f_208_) / f_217_;
		float f_222_ = f_220_ * (float) anInt9101;
		float f_223_ = f_221_ * (float) anInt9101;
		float f_224_ = f_218_ * (float) anInt9099;
		float f_225_ = f_219_ * (float) anInt9099;
		float f_226_ = -f_218_ * (float) anInt9100;
		float f_227_ = -f_219_ * (float) anInt9100;
		float f_228_ = -f_220_ * (float) anInt9107;
		float f_229_ = -f_221_ * (float) anInt9107;
		f = f + f_224_ + f_222_;
		f_208_ = f_208_ + f_225_ + f_223_;
		f_209_ = f_209_ + f_226_ + f_222_;
		f_210_ = f_210_ + f_227_ + f_223_;
		f_211_ = f_211_ + f_224_ + f_228_;
		f_212_ = f_212_ + f_225_ + f_229_;
	    }
	    Class320 class320 = aClass185_Sub1_9105.aClass320_9232;
	    class320.anInterface38_3403 = anInterface38_9112;
	    class320.method5765(i, i_213_);
	    float f_230_ = (float) aClass185_Sub1_9105.method3253
				       (-1604203484).method2910();
	    float f_231_ = (float) aClass185_Sub1_9105.method3253
				       (-1360025711).method2911();
	    class320.aClass433_3409.method6840();
	    class320.aClass433_3409.aFloatArray4853[0]
		= (f_209_ - f) * 2.0F / f_230_;
	    class320.aClass433_3409.aFloatArray4853[1]
		= (f_210_ - f_208_) * 2.0F / f_231_;
	    class320.aClass433_3409.aFloatArray4853[4]
		= (f_211_ - f) * 2.0F / f_230_;
	    class320.aClass433_3409.aFloatArray4853[5]
		= (f_212_ - f_208_) * 2.0F / f_231_;
	    class320.aClass433_3409.aFloatArray4853[12]
		= ((f + aClass185_Sub1_9105.method14715()) * 2.0F / f_230_
		   - 1.0F);
	    class320.aClass433_3409.aFloatArray4853[13]
		= ((f_208_ + aClass185_Sub1_9105.method14715()) * 2.0F / f_231_
		   - 1.0F);
	    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
	    class320.aClass433_3406.method6952
		(anInterface38_9112.method241((float) anInt9102),
		 anInterface38_9112.method245((float) anInt9103), 1.0F, 1.0F);
	    class320.anInterface37_3410
		= aClass185_Sub1_9105.anInterface37_9226;
	    class320.anInt3404 = 0;
	    class320.aClass349_3411 = aClass185_Sub1_9105.aClass349_9143;
	    class320.method5767();
	}
    }
    
    void method2718(int i, int i_232_, int i_233_, int i_234_, int i_235_,
		    int i_236_, int i_237_, int i_238_) {
	if (aClass185_Sub1_9105.method14703() != Class353.aClass353_3655) {
	    if (aBool9108) {
		i_233_ = i_233_ * anInt9102 / method22();
		i_234_ = i_234_ * anInt9103 / method2692();
		i += anInt9099 * i_233_ / anInt9102;
		i_232_ += anInt9101 * i_234_ / anInt9103;
	    }
	    aClass185_Sub1_9105.aClass371_9147.method6384
		((float) i, (float) i_232_, (float) (i + i_233_),
		 (float) (i_232_ + i_234_), anInterface38_9112.method241(0.0F),
		 anInterface38_9112.method245(0.0F),
		 anInterface38_9112.method241((float) anInt9102),
		 anInterface38_9112.method245((float) anInt9103),
		 anInterface38_9112, i_236_);
	} else {
	    aClass185_Sub1_9105.method14593();
	    aClass185_Sub1_9105.method14687(i_237_);
	    Class320 class320 = aClass185_Sub1_9105.aClass320_9232;
	    class320.anInterface38_3403 = anInterface38_9112;
	    class320.method5765(i_235_, i_236_);
	    if (aBool9108) {
		i_233_ = i_233_ * anInt9102 / method22();
		i_234_ = i_234_ * anInt9103 / method2692();
		i += anInt9099 * i_233_ / anInt9102;
		i_232_ += anInt9101 * i_234_ / anInt9103;
	    }
	    float f = (float) aClass185_Sub1_9105.method3253(-414126731)
				  .method2910();
	    float f_239_ = (float) aClass185_Sub1_9105.method3253
				       (-527844606).method2911();
	    class320.aClass433_3409.method6952((float) i_233_ * 2.0F / f,
					       (float) i_234_ * 2.0F / f_239_,
					       1.0F, 1.0F);
	    class320.aClass433_3409.aFloatArray4853[12]
		= (((float) i + aClass185_Sub1_9105.method14715()) * 2.0F / f
		   - 1.0F);
	    class320.aClass433_3409.aFloatArray4853[13]
		= (((float) i_232_ + aClass185_Sub1_9105.method14715()) * 2.0F
		   / f_239_) - 1.0F;
	    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
	    class320.aClass433_3406.method6952
		(anInterface38_9112.method241((float) anInt9102),
		 anInterface38_9112.method245((float) anInt9103), 1.0F, 1.0F);
	    class320.anInterface37_3410
		= aClass185_Sub1_9105.anInterface37_9226;
	    class320.anInt3404 = 0;
	    class320.aClass349_3411 = aClass185_Sub1_9105.aClass349_9143;
	    class320.method5767();
	}
    }
    
    public int method2647() {
	return anInt9102;
    }
    
    public void method2729(int i, int i_240_, int i_241_) {
	int[] is
	    = aClass185_Sub1_9105.method3267(i, i_240_, anInt9102, anInt9103);
	int[] is_242_ = new int[anInt9102 * anInt9103];
	anInterface38_9112.method246(0, 0, anInt9102, anInt9103, is_242_, 0);
	if (i_241_ == 0) {
	    for (int i_243_ = 0; i_243_ < anInt9103; i_243_++) {
		int i_244_ = i_243_ * anInt9102;
		for (int i_245_ = 0; i_245_ < anInt9102; i_245_++)
		    is_242_[i_244_ + i_245_]
			= (is_242_[i_244_ + i_245_] & 0xffffff
			   | is[i_244_ + i_245_] << 8 & ~0xffffff);
	    }
	} else if (i_241_ == 1) {
	    for (int i_246_ = 0; i_246_ < anInt9103; i_246_++) {
		int i_247_ = i_246_ * anInt9102;
		for (int i_248_ = 0; i_248_ < anInt9102; i_248_++)
		    is_242_[i_247_ + i_248_]
			= (is_242_[i_247_ + i_248_] & 0xffffff
			   | is[i_247_ + i_248_] << 16 & ~0xffffff);
	    }
	} else if (i_241_ == 2) {
	    for (int i_249_ = 0; i_249_ < anInt9103; i_249_++) {
		int i_250_ = i_249_ * anInt9102;
		for (int i_251_ = 0; i_251_ < anInt9102; i_251_++)
		    is_242_[i_250_ + i_251_]
			= (is_242_[i_250_ + i_251_] & 0xffffff
			   | is[i_250_ + i_251_] << 24 & ~0xffffff);
	    }
	} else if (i_241_ == 3) {
	    for (int i_252_ = 0; i_252_ < anInt9103; i_252_++) {
		int i_253_ = i_252_ * anInt9102;
		for (int i_254_ = 0; i_254_ < anInt9102; i_254_++)
		    is_242_[i_253_ + i_254_]
			= (is_242_[i_253_ + i_254_] & 0xffffff
			   | (is[i_253_ + i_254_] != 0 ? -16777216 : 0));
	    }
	}
	method2652(0, 0, anInt9102, anInt9103, is_242_, 0, anInt9102);
    }
    
    public void method2699(int i, int i_255_, int i_256_) {
	int[] is
	    = aClass185_Sub1_9105.method3267(i, i_255_, anInt9102, anInt9103);
	int[] is_257_ = new int[anInt9102 * anInt9103];
	anInterface38_9112.method246(0, 0, anInt9102, anInt9103, is_257_, 0);
	if (i_256_ == 0) {
	    for (int i_258_ = 0; i_258_ < anInt9103; i_258_++) {
		int i_259_ = i_258_ * anInt9102;
		for (int i_260_ = 0; i_260_ < anInt9102; i_260_++)
		    is_257_[i_259_ + i_260_]
			= (is_257_[i_259_ + i_260_] & 0xffffff
			   | is[i_259_ + i_260_] << 8 & ~0xffffff);
	    }
	} else if (i_256_ == 1) {
	    for (int i_261_ = 0; i_261_ < anInt9103; i_261_++) {
		int i_262_ = i_261_ * anInt9102;
		for (int i_263_ = 0; i_263_ < anInt9102; i_263_++)
		    is_257_[i_262_ + i_263_]
			= (is_257_[i_262_ + i_263_] & 0xffffff
			   | is[i_262_ + i_263_] << 16 & ~0xffffff);
	    }
	} else if (i_256_ == 2) {
	    for (int i_264_ = 0; i_264_ < anInt9103; i_264_++) {
		int i_265_ = i_264_ * anInt9102;
		for (int i_266_ = 0; i_266_ < anInt9102; i_266_++)
		    is_257_[i_265_ + i_266_]
			= (is_257_[i_265_ + i_266_] & 0xffffff
			   | is[i_265_ + i_266_] << 24 & ~0xffffff);
	    }
	} else if (i_256_ == 3) {
	    for (int i_267_ = 0; i_267_ < anInt9103; i_267_++) {
		int i_268_ = i_267_ * anInt9102;
		for (int i_269_ = 0; i_269_ < anInt9102; i_269_++)
		    is_257_[i_268_ + i_269_]
			= (is_257_[i_268_ + i_269_] & 0xffffff
			   | (is[i_268_ + i_269_] != 0 ? -16777216 : 0));
	    }
	}
	method2652(0, 0, anInt9102, anInt9103, is_257_, 0, anInt9102);
    }
    
    public void method2672(int i, int i_270_, int i_271_) {
	int[] is
	    = aClass185_Sub1_9105.method3267(i, i_270_, anInt9102, anInt9103);
	int[] is_272_ = new int[anInt9102 * anInt9103];
	anInterface38_9112.method246(0, 0, anInt9102, anInt9103, is_272_, 0);
	if (i_271_ == 0) {
	    for (int i_273_ = 0; i_273_ < anInt9103; i_273_++) {
		int i_274_ = i_273_ * anInt9102;
		for (int i_275_ = 0; i_275_ < anInt9102; i_275_++)
		    is_272_[i_274_ + i_275_]
			= (is_272_[i_274_ + i_275_] & 0xffffff
			   | is[i_274_ + i_275_] << 8 & ~0xffffff);
	    }
	} else if (i_271_ == 1) {
	    for (int i_276_ = 0; i_276_ < anInt9103; i_276_++) {
		int i_277_ = i_276_ * anInt9102;
		for (int i_278_ = 0; i_278_ < anInt9102; i_278_++)
		    is_272_[i_277_ + i_278_]
			= (is_272_[i_277_ + i_278_] & 0xffffff
			   | is[i_277_ + i_278_] << 16 & ~0xffffff);
	    }
	} else if (i_271_ == 2) {
	    for (int i_279_ = 0; i_279_ < anInt9103; i_279_++) {
		int i_280_ = i_279_ * anInt9102;
		for (int i_281_ = 0; i_281_ < anInt9102; i_281_++)
		    is_272_[i_280_ + i_281_]
			= (is_272_[i_280_ + i_281_] & 0xffffff
			   | is[i_280_ + i_281_] << 24 & ~0xffffff);
	    }
	} else if (i_271_ == 3) {
	    for (int i_282_ = 0; i_282_ < anInt9103; i_282_++) {
		int i_283_ = i_282_ * anInt9102;
		for (int i_284_ = 0; i_284_ < anInt9102; i_284_++)
		    is_272_[i_283_ + i_284_]
			= (is_272_[i_283_ + i_284_] & 0xffffff
			   | (is[i_283_ + i_284_] != 0 ? -16777216 : 0));
	    }
	}
	method2652(0, 0, anInt9102, anInt9103, is_272_, 0, anInt9102);
    }
    
    public void method2679(int i, int i_285_, int i_286_, int i_287_) {
	anInt9099 = i;
	anInt9101 = i_285_;
	anInt9100 = i_286_;
	anInt9107 = i_287_;
	aBool9108 = (anInt9099 != 0 || anInt9101 != 0 || anInt9100 != 0
		     || anInt9107 != 0);
    }
    
    public void method2695(int[] is) {
	is[0] = anInt9099;
	is[1] = anInt9101;
	is[2] = anInt9100;
	is[3] = anInt9107;
    }
    
    public void method2741(int[] is) {
	is[0] = anInt9099;
	is[1] = anInt9101;
	is[2] = anInt9100;
	is[3] = anInt9107;
    }
    
    public void method2733(int[] is) {
	is[0] = anInt9099;
	is[1] = anInt9101;
	is[2] = anInt9100;
	is[3] = anInt9107;
    }
    
    public int method2698() {
	return anInt9102;
    }
    
    public void method2657(int i, int i_288_, int i_289_, int i_290_,
			   int i_291_) {
	if (aClass185_Sub1_9105.method14703() != Class353.aClass353_3655) {
	    i += anInt9099;
	    i_288_ += anInt9101;
	    aClass185_Sub1_9105.aClass371_9147.method6384
		((float) i, (float) i_288_, (float) (i + anInt9102),
		 (float) (i_288_ + anInt9103), 0.0F, 0.0F,
		 anInterface38_9112.method250(),
		 anInterface38_9112.method249(), anInterface38_9112, i_290_);
	} else {
	    aClass185_Sub1_9105.method14593();
	    aClass185_Sub1_9105.method14687(i_291_);
	    Class320 class320 = aClass185_Sub1_9105.aClass320_9232;
	    class320.anInterface38_3403 = anInterface38_9112;
	    class320.method5765(i_289_, i_290_);
	    i += anInt9099;
	    i_288_ += anInt9101;
	    float f = (float) aClass185_Sub1_9105.method3253(-675064934)
				  .method2910();
	    float f_292_ = (float) aClass185_Sub1_9105.method3253
				       (-1676935804).method2911();
	    class320.aClass433_3409.method6952((float) anInt9102 * 2.0F / f,
					       ((float) anInt9103 * 2.0F
						/ f_292_),
					       1.0F, 1.0F);
	    class320.aClass433_3409.aFloatArray4853[12]
		= (((float) i + aClass185_Sub1_9105.method14715()) * 2.0F / f
		   - 1.0F);
	    class320.aClass433_3409.aFloatArray4853[13]
		= (((float) i_288_ + aClass185_Sub1_9105.method14715()) * 2.0F
		   / f_292_) - 1.0F;
	    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
	    class320.aClass433_3406.method6952
		(anInterface38_9112.method241((float) anInt9102),
		 anInterface38_9112.method245((float) anInt9103), 1.0F, 1.0F);
	    class320.anInterface37_3410
		= aClass185_Sub1_9105.anInterface37_9226;
	    class320.anInt3404 = 0;
	    class320.aClass349_3411 = aClass185_Sub1_9105.aClass349_9143;
	    class320.method5767();
	}
    }
    
    public int method2700() {
	return anInt9102;
    }
    
    public int method2701() {
	return anInt9103;
    }
    
    public void method2674(int i, int i_293_, int i_294_, int i_295_, int[] is,
			   int[] is_296_, int i_297_, int i_298_) {
	anInterface38_9112.method262(i, i_293_, i_294_, i_295_, is, is_296_,
				     i_297_);
    }
    
    public int method20() {
	return anInt9102 + anInt9099 + anInt9100;
    }
    
    public void method2720(int i, int i_299_, int i_300_, int i_301_,
			   int i_302_, int i_303_, int i_304_) {
	if (aClass185_Sub1_9105.method14703() != Class353.aClass353_3655) {
	    int i_305_ = i_299_ + i_301_;
	    int i_306_ = i + i_300_;
	    int i_307_ = method22();
	    int i_308_ = method2692();
	    int i_309_ = i_299_ + anInt9101;
	    for (int i_310_ = i_309_ + anInt9103; i_310_ <= i_305_;
		 i_310_ += i_308_) {
		int i_311_ = i + anInt9099;
		for (int i_312_ = i_311_ + anInt9102; i_312_ <= i_306_;
		     i_312_ += i_307_) {
		    aClass185_Sub1_9105.aClass371_9147.method6384
			((float) i_311_, (float) i_309_,
			 (float) (i_311_ + anInt9102),
			 (float) (i_309_ + anInt9103), 0.0F, 0.0F,
			 anInterface38_9112.method250(),
			 anInterface38_9112.method249(), anInterface38_9112,
			 i_303_);
		    i_311_ += i_307_;
		}
		if (i_311_ < i_306_) {
		    int i_313_ = i_306_ - i_311_;
		    aClass185_Sub1_9105.aClass371_9147.method6384
			((float) i_311_, (float) i_309_,
			 (float) (i_311_ + i_313_),
			 (float) (i_309_ + anInt9103), 0.0F, 0.0F,
			 ((float) i_313_ / (float) anInt9102
			  * anInterface38_9112.method250()),
			 anInterface38_9112.method249(), anInterface38_9112,
			 i_303_);
		}
		i_309_ += i_308_;
	    }
	    if (i_309_ < i_305_) {
		int i_314_ = i_305_ - i_309_;
		float f = ((float) i_314_ / (float) anInt9103
			   * anInterface38_9112.method249());
		int i_315_ = i + anInt9099;
		for (int i_316_ = i_315_ + anInt9102; i_316_ <= i_306_;
		     i_316_ += i_307_) {
		    aClass185_Sub1_9105.aClass371_9147.method6384
			((float) i_315_, (float) i_309_,
			 (float) (i_315_ + anInt9102),
			 (float) (i_309_ + i_314_), 0.0F, 0.0F,
			 anInterface38_9112.method250(), f, anInterface38_9112,
			 i_303_);
		    i_315_ += i_307_;
		}
		if (i_315_ < i_306_) {
		    int i_317_ = i_306_ - i_315_;
		    aClass185_Sub1_9105.aClass371_9147.method6384
			((float) i_315_, (float) i_309_,
			 (float) (i_315_ + i_317_), (float) (i_309_ + i_314_),
			 0.0F, 0.0F,
			 ((float) i_317_ / (float) anInt9102
			  * anInterface38_9112.method250()),
			 f, anInterface38_9112, i_303_);
		}
	    }
	} else {
	    aClass185_Sub1_9105.method14593();
	    aClass185_Sub1_9105.method14687(i_304_);
	    Class320 class320 = aClass185_Sub1_9105.aClass320_9232;
	    class320.anInterface38_3403 = anInterface38_9112;
	    class320.method5765(i_302_, i_303_);
	    float f = (float) aClass185_Sub1_9105.method3253(-92817635)
				  .method2910();
	    float f_318_ = (float) aClass185_Sub1_9105.method3253
				       (-1779870691).method2911();
	    class320.anInterface37_3410
		= aClass185_Sub1_9105.anInterface37_9226;
	    class320.anInt3404 = 0;
	    class320.aClass349_3411 = aClass185_Sub1_9105.aClass349_9143;
	    boolean bool = aBool9111 && anInt9101 == 0 && anInt9107 == 0;
	    boolean bool_319_ = aBool9106 && anInt9099 == 0 && anInt9100 == 0;
	    if (bool_319_ & bool) {
		class320.aClass433_3409.method6952((float) i_300_ * 2.0F / f,
						   ((float) i_301_ * 2.0F
						    / f_318_),
						   1.0F, 1.0F);
		class320.aClass433_3409.aFloatArray4853[12]
		    = (((float) i + aClass185_Sub1_9105.method14715()) * 2.0F
		       / f) - 1.0F;
		class320.aClass433_3409.aFloatArray4853[13]
		    = (((float) i_299_ + aClass185_Sub1_9105.method14715())
		       * 2.0F / f_318_) - 1.0F;
		class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
		class320.aClass433_3406.method6952
		    (anInterface38_9112.method241((float) i_300_),
		     anInterface38_9112.method245((float) i_301_), 1.0F, 1.0F);
		class320.method5767();
	    } else if (bool_319_) {
		int i_320_ = i_299_ + i_301_;
		int i_321_ = method2692();
		class320.aClass433_3406.method6952
		    (anInterface38_9112.method241((float) i_300_),
		     anInterface38_9112.method245((float) anInt9103), 1.0F,
		     1.0F);
		int i_322_ = i_299_ + anInt9101;
		for (int i_323_ = i_322_ + anInt9103; i_323_ <= i_320_;
		     i_323_ += i_321_) {
		    class320.aClass433_3409.method6952(((float) i_300_ * 2.0F
							/ f),
						       ((float) anInt9103
							* 2.0F / f_318_),
						       1.0F, 1.0F);
		    class320.aClass433_3409.aFloatArray4853[12]
			= (((float) i + aClass185_Sub1_9105.method14715())
			   * 2.0F / f) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[13]
			= (((float) i_322_ + aClass185_Sub1_9105.method14715())
			   * 2.0F / f_318_) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
		    class320.method5767();
		    i_322_ += i_321_;
		}
		if (i_322_ < i_320_) {
		    int i_324_ = i_320_ - i_322_;
		    class320.aClass433_3406.method6952
			(anInterface38_9112.method241((float) i_300_),
			 anInterface38_9112.method245((float) i_324_), 1.0F,
			 1.0F);
		    class320.aClass433_3409.method6952(((float) i_300_ * 2.0F
							/ f),
						       ((float) i_324_ * 2.0F
							/ f_318_),
						       1.0F, 1.0F);
		    class320.aClass433_3409.aFloatArray4853[12]
			= (((float) i + aClass185_Sub1_9105.method14715())
			   * 2.0F / f) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[13]
			= (((float) i_322_ + aClass185_Sub1_9105.method14715())
			   * 2.0F / f_318_) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
		    class320.method5767();
		}
	    } else if (bool) {
		int i_325_ = i + i_300_;
		int i_326_ = method22();
		class320.aClass433_3406.method6952
		    (anInterface38_9112.method241((float) anInt9102),
		     anInterface38_9112.method245((float) i_301_), 1.0F, 1.0F);
		int i_327_ = i + anInt9099;
		for (int i_328_ = i_327_ + anInt9102; i_328_ <= i_325_;
		     i_328_ += i_326_) {
		    class320.aClass433_3409.method6952(((float) anInt9102
							* 2.0F / f),
						       ((float) i_301_ * 2.0F
							/ f_318_),
						       1.0F, 1.0F);
		    class320.aClass433_3409.aFloatArray4853[12]
			= (((float) i_327_ + aClass185_Sub1_9105.method14715())
			   * 2.0F / f) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[13]
			= (((float) i_299_ + aClass185_Sub1_9105.method14715())
			   * 2.0F / f_318_) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
		    class320.method5767();
		    i_327_ += i_326_;
		}
		if (i_327_ < i_325_) {
		    int i_329_ = i_325_ - i_327_;
		    class320.aClass433_3406.method6952
			(anInterface38_9112.method241((float) i_329_),
			 anInterface38_9112.method245((float) i_301_), 1.0F,
			 1.0F);
		    class320.aClass433_3409.method6952(((float) i_329_ * 2.0F
							/ f),
						       ((float) i_301_ * 2.0F
							/ f_318_),
						       1.0F, 1.0F);
		    class320.aClass433_3409.aFloatArray4853[12]
			= (((float) i_327_ + aClass185_Sub1_9105.method14715())
			   * 2.0F / f) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[13]
			= (((float) i_299_ + aClass185_Sub1_9105.method14715())
			   * 2.0F / f_318_) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
		    class320.method5767();
		}
	    } else {
		int i_330_ = i_299_ + i_301_;
		int i_331_ = i + i_300_;
		int i_332_ = method22();
		int i_333_ = method2692();
		int i_334_ = i_299_ + anInt9101;
		for (int i_335_ = i_334_ + anInt9103; i_335_ <= i_330_;
		     i_335_ += i_333_) {
		    class320.aClass433_3406.method6952
			(anInterface38_9112.method241((float) anInt9102),
			 anInterface38_9112.method245((float) anInt9103), 1.0F,
			 1.0F);
		    int i_336_ = i + anInt9099;
		    for (int i_337_ = i_336_ + anInt9102; i_337_ <= i_331_;
			 i_337_ += i_332_) {
			class320.aClass433_3409.method6952(((float) anInt9102
							    * 2.0F / f),
							   ((float) anInt9103
							    * 2.0F / f_318_),
							   1.0F, 1.0F);
			class320.aClass433_3409.aFloatArray4853[12]
			    = (((float) i_336_
				+ aClass185_Sub1_9105.method14715()) * 2.0F / f
			       - 1.0F);
			class320.aClass433_3409.aFloatArray4853[13]
			    = (((float) i_334_
				+ aClass185_Sub1_9105.method14715())
			       * 2.0F / f_318_) - 1.0F;
			class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
			class320.method5767();
			i_336_ += i_332_;
		    }
		    if (i_336_ < i_331_) {
			int i_338_ = i_331_ - i_336_;
			class320.aClass433_3406.method6952
			    (anInterface38_9112.method241((float) i_338_),
			     anInterface38_9112.method245((float) anInt9103),
			     1.0F, 1.0F);
			class320.aClass433_3409.method6952(((float) i_338_
							    * 2.0F / f),
							   ((float) anInt9103
							    * 2.0F / f_318_),
							   1.0F, 1.0F);
			class320.aClass433_3409.aFloatArray4853[12]
			    = (((float) i_336_
				+ aClass185_Sub1_9105.method14715()) * 2.0F / f
			       - 1.0F);
			class320.aClass433_3409.aFloatArray4853[13]
			    = (((float) i_334_
				+ aClass185_Sub1_9105.method14715())
			       * 2.0F / f_318_) - 1.0F;
			class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
			class320.method5767();
		    }
		    i_334_ += i_333_;
		}
		if (i_334_ < i_330_) {
		    int i_339_ = i_330_ - i_334_;
		    class320.aClass433_3406.method6952
			(anInterface38_9112.method241((float) anInt9102),
			 anInterface38_9112.method245((float) i_339_), 1.0F,
			 1.0F);
		    int i_340_ = i + anInt9099;
		    for (int i_341_ = i_340_ + anInt9102; i_341_ <= i_331_;
			 i_341_ += i_332_) {
			class320.aClass433_3409.method6952(((float) anInt9102
							    * 2.0F / f),
							   ((float) i_339_
							    * 2.0F / f_318_),
							   1.0F, 1.0F);
			class320.aClass433_3409.aFloatArray4853[12]
			    = (((float) i_340_
				+ aClass185_Sub1_9105.method14715()) * 2.0F / f
			       - 1.0F);
			class320.aClass433_3409.aFloatArray4853[13]
			    = (((float) i_334_
				+ aClass185_Sub1_9105.method14715())
			       * 2.0F / f_318_) - 1.0F;
			class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
			class320.method5767();
			i_340_ += i_332_;
		    }
		    if (i_340_ < i_331_) {
			int i_342_ = i_331_ - i_340_;
			class320.aClass433_3406.method6952
			    (anInterface38_9112.method241((float) i_342_),
			     anInterface38_9112.method245((float) i_339_),
			     1.0F, 1.0F);
			class320.aClass433_3409.method6952(((float) i_342_
							    * 2.0F / f),
							   ((float) i_339_
							    * 2.0F / f_318_),
							   1.0F, 1.0F);
			class320.aClass433_3409.aFloatArray4853[12]
			    = (((float) i_340_
				+ aClass185_Sub1_9105.method14715()) * 2.0F / f
			       - 1.0F);
			class320.aClass433_3409.aFloatArray4853[13]
			    = (((float) i_334_
				+ aClass185_Sub1_9105.method14715())
			       * 2.0F / f_318_) - 1.0F;
			class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
			class320.method5767();
		    }
		}
	    }
	}
    }
    
    public int method2669() {
	return anInt9103 + anInt9101 + anInt9107;
    }
    
    void method2687(int i, int i_343_, int i_344_, int i_345_, int i_346_,
		    int i_347_, int i_348_, int i_349_) {
	if (aClass185_Sub1_9105.method14703() != Class353.aClass353_3655) {
	    if (aBool9108) {
		i_344_ = i_344_ * anInt9102 / method22();
		i_345_ = i_345_ * anInt9103 / method2692();
		i += anInt9099 * i_344_ / anInt9102;
		i_343_ += anInt9101 * i_345_ / anInt9103;
	    }
	    aClass185_Sub1_9105.aClass371_9147.method6384
		((float) i, (float) i_343_, (float) (i + i_344_),
		 (float) (i_343_ + i_345_), anInterface38_9112.method241(0.0F),
		 anInterface38_9112.method245(0.0F),
		 anInterface38_9112.method241((float) anInt9102),
		 anInterface38_9112.method245((float) anInt9103),
		 anInterface38_9112, i_347_);
	} else {
	    aClass185_Sub1_9105.method14593();
	    aClass185_Sub1_9105.method14687(i_348_);
	    Class320 class320 = aClass185_Sub1_9105.aClass320_9232;
	    class320.anInterface38_3403 = anInterface38_9112;
	    class320.method5765(i_346_, i_347_);
	    if (aBool9108) {
		i_344_ = i_344_ * anInt9102 / method22();
		i_345_ = i_345_ * anInt9103 / method2692();
		i += anInt9099 * i_344_ / anInt9102;
		i_343_ += anInt9101 * i_345_ / anInt9103;
	    }
	    float f = (float) aClass185_Sub1_9105.method3253(-1900905756)
				  .method2910();
	    float f_350_ = (float) aClass185_Sub1_9105.method3253
				       (-1604038748).method2911();
	    class320.aClass433_3409.method6952((float) i_344_ * 2.0F / f,
					       (float) i_345_ * 2.0F / f_350_,
					       1.0F, 1.0F);
	    class320.aClass433_3409.aFloatArray4853[12]
		= (((float) i + aClass185_Sub1_9105.method14715()) * 2.0F / f
		   - 1.0F);
	    class320.aClass433_3409.aFloatArray4853[13]
		= (((float) i_343_ + aClass185_Sub1_9105.method14715()) * 2.0F
		   / f_350_) - 1.0F;
	    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
	    class320.aClass433_3406.method6952
		(anInterface38_9112.method241((float) anInt9102),
		 anInterface38_9112.method245((float) anInt9103), 1.0F, 1.0F);
	    class320.anInterface37_3410
		= aClass185_Sub1_9105.anInterface37_9226;
	    class320.anInt3404 = 0;
	    class320.aClass349_3411 = aClass185_Sub1_9105.aClass349_9143;
	    class320.method5767();
	}
    }
    
    Class163_Sub2(Class185_Sub1 class185_sub1, Interface38 interface38) {
	this(class185_sub1, interface38, interface38.method1(),
	     interface38.method93());
    }
    
    public void method2706(int i, int i_351_, int i_352_, int i_353_,
			   int i_354_, int i_355_, int i_356_) {
	if (aClass185_Sub1_9105.method14703() != Class353.aClass353_3655) {
	    int i_357_ = i_351_ + i_353_;
	    int i_358_ = i + i_352_;
	    int i_359_ = method22();
	    int i_360_ = method2692();
	    int i_361_ = i_351_ + anInt9101;
	    for (int i_362_ = i_361_ + anInt9103; i_362_ <= i_357_;
		 i_362_ += i_360_) {
		int i_363_ = i + anInt9099;
		for (int i_364_ = i_363_ + anInt9102; i_364_ <= i_358_;
		     i_364_ += i_359_) {
		    aClass185_Sub1_9105.aClass371_9147.method6384
			((float) i_363_, (float) i_361_,
			 (float) (i_363_ + anInt9102),
			 (float) (i_361_ + anInt9103), 0.0F, 0.0F,
			 anInterface38_9112.method250(),
			 anInterface38_9112.method249(), anInterface38_9112,
			 i_355_);
		    i_363_ += i_359_;
		}
		if (i_363_ < i_358_) {
		    int i_365_ = i_358_ - i_363_;
		    aClass185_Sub1_9105.aClass371_9147.method6384
			((float) i_363_, (float) i_361_,
			 (float) (i_363_ + i_365_),
			 (float) (i_361_ + anInt9103), 0.0F, 0.0F,
			 ((float) i_365_ / (float) anInt9102
			  * anInterface38_9112.method250()),
			 anInterface38_9112.method249(), anInterface38_9112,
			 i_355_);
		}
		i_361_ += i_360_;
	    }
	    if (i_361_ < i_357_) {
		int i_366_ = i_357_ - i_361_;
		float f = ((float) i_366_ / (float) anInt9103
			   * anInterface38_9112.method249());
		int i_367_ = i + anInt9099;
		for (int i_368_ = i_367_ + anInt9102; i_368_ <= i_358_;
		     i_368_ += i_359_) {
		    aClass185_Sub1_9105.aClass371_9147.method6384
			((float) i_367_, (float) i_361_,
			 (float) (i_367_ + anInt9102),
			 (float) (i_361_ + i_366_), 0.0F, 0.0F,
			 anInterface38_9112.method250(), f, anInterface38_9112,
			 i_355_);
		    i_367_ += i_359_;
		}
		if (i_367_ < i_358_) {
		    int i_369_ = i_358_ - i_367_;
		    aClass185_Sub1_9105.aClass371_9147.method6384
			((float) i_367_, (float) i_361_,
			 (float) (i_367_ + i_369_), (float) (i_361_ + i_366_),
			 0.0F, 0.0F,
			 ((float) i_369_ / (float) anInt9102
			  * anInterface38_9112.method250()),
			 f, anInterface38_9112, i_355_);
		}
	    }
	} else {
	    aClass185_Sub1_9105.method14593();
	    aClass185_Sub1_9105.method14687(i_356_);
	    Class320 class320 = aClass185_Sub1_9105.aClass320_9232;
	    class320.anInterface38_3403 = anInterface38_9112;
	    class320.method5765(i_354_, i_355_);
	    float f = (float) aClass185_Sub1_9105.method3253(-1518507050)
				  .method2910();
	    float f_370_ = (float) aClass185_Sub1_9105.method3253
				       (-214025420).method2911();
	    class320.anInterface37_3410
		= aClass185_Sub1_9105.anInterface37_9226;
	    class320.anInt3404 = 0;
	    class320.aClass349_3411 = aClass185_Sub1_9105.aClass349_9143;
	    boolean bool = aBool9111 && anInt9101 == 0 && anInt9107 == 0;
	    boolean bool_371_ = aBool9106 && anInt9099 == 0 && anInt9100 == 0;
	    if (bool_371_ & bool) {
		class320.aClass433_3409.method6952((float) i_352_ * 2.0F / f,
						   ((float) i_353_ * 2.0F
						    / f_370_),
						   1.0F, 1.0F);
		class320.aClass433_3409.aFloatArray4853[12]
		    = (((float) i + aClass185_Sub1_9105.method14715()) * 2.0F
		       / f) - 1.0F;
		class320.aClass433_3409.aFloatArray4853[13]
		    = (((float) i_351_ + aClass185_Sub1_9105.method14715())
		       * 2.0F / f_370_) - 1.0F;
		class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
		class320.aClass433_3406.method6952
		    (anInterface38_9112.method241((float) i_352_),
		     anInterface38_9112.method245((float) i_353_), 1.0F, 1.0F);
		class320.method5767();
	    } else if (bool_371_) {
		int i_372_ = i_351_ + i_353_;
		int i_373_ = method2692();
		class320.aClass433_3406.method6952
		    (anInterface38_9112.method241((float) i_352_),
		     anInterface38_9112.method245((float) anInt9103), 1.0F,
		     1.0F);
		int i_374_ = i_351_ + anInt9101;
		for (int i_375_ = i_374_ + anInt9103; i_375_ <= i_372_;
		     i_375_ += i_373_) {
		    class320.aClass433_3409.method6952(((float) i_352_ * 2.0F
							/ f),
						       ((float) anInt9103
							* 2.0F / f_370_),
						       1.0F, 1.0F);
		    class320.aClass433_3409.aFloatArray4853[12]
			= (((float) i + aClass185_Sub1_9105.method14715())
			   * 2.0F / f) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[13]
			= (((float) i_374_ + aClass185_Sub1_9105.method14715())
			   * 2.0F / f_370_) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
		    class320.method5767();
		    i_374_ += i_373_;
		}
		if (i_374_ < i_372_) {
		    int i_376_ = i_372_ - i_374_;
		    class320.aClass433_3406.method6952
			(anInterface38_9112.method241((float) i_352_),
			 anInterface38_9112.method245((float) i_376_), 1.0F,
			 1.0F);
		    class320.aClass433_3409.method6952(((float) i_352_ * 2.0F
							/ f),
						       ((float) i_376_ * 2.0F
							/ f_370_),
						       1.0F, 1.0F);
		    class320.aClass433_3409.aFloatArray4853[12]
			= (((float) i + aClass185_Sub1_9105.method14715())
			   * 2.0F / f) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[13]
			= (((float) i_374_ + aClass185_Sub1_9105.method14715())
			   * 2.0F / f_370_) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
		    class320.method5767();
		}
	    } else if (bool) {
		int i_377_ = i + i_352_;
		int i_378_ = method22();
		class320.aClass433_3406.method6952
		    (anInterface38_9112.method241((float) anInt9102),
		     anInterface38_9112.method245((float) i_353_), 1.0F, 1.0F);
		int i_379_ = i + anInt9099;
		for (int i_380_ = i_379_ + anInt9102; i_380_ <= i_377_;
		     i_380_ += i_378_) {
		    class320.aClass433_3409.method6952(((float) anInt9102
							* 2.0F / f),
						       ((float) i_353_ * 2.0F
							/ f_370_),
						       1.0F, 1.0F);
		    class320.aClass433_3409.aFloatArray4853[12]
			= (((float) i_379_ + aClass185_Sub1_9105.method14715())
			   * 2.0F / f) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[13]
			= (((float) i_351_ + aClass185_Sub1_9105.method14715())
			   * 2.0F / f_370_) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
		    class320.method5767();
		    i_379_ += i_378_;
		}
		if (i_379_ < i_377_) {
		    int i_381_ = i_377_ - i_379_;
		    class320.aClass433_3406.method6952
			(anInterface38_9112.method241((float) i_381_),
			 anInterface38_9112.method245((float) i_353_), 1.0F,
			 1.0F);
		    class320.aClass433_3409.method6952(((float) i_381_ * 2.0F
							/ f),
						       ((float) i_353_ * 2.0F
							/ f_370_),
						       1.0F, 1.0F);
		    class320.aClass433_3409.aFloatArray4853[12]
			= (((float) i_379_ + aClass185_Sub1_9105.method14715())
			   * 2.0F / f) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[13]
			= (((float) i_351_ + aClass185_Sub1_9105.method14715())
			   * 2.0F / f_370_) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
		    class320.method5767();
		}
	    } else {
		int i_382_ = i_351_ + i_353_;
		int i_383_ = i + i_352_;
		int i_384_ = method22();
		int i_385_ = method2692();
		int i_386_ = i_351_ + anInt9101;
		for (int i_387_ = i_386_ + anInt9103; i_387_ <= i_382_;
		     i_387_ += i_385_) {
		    class320.aClass433_3406.method6952
			(anInterface38_9112.method241((float) anInt9102),
			 anInterface38_9112.method245((float) anInt9103), 1.0F,
			 1.0F);
		    int i_388_ = i + anInt9099;
		    for (int i_389_ = i_388_ + anInt9102; i_389_ <= i_383_;
			 i_389_ += i_384_) {
			class320.aClass433_3409.method6952(((float) anInt9102
							    * 2.0F / f),
							   ((float) anInt9103
							    * 2.0F / f_370_),
							   1.0F, 1.0F);
			class320.aClass433_3409.aFloatArray4853[12]
			    = (((float) i_388_
				+ aClass185_Sub1_9105.method14715()) * 2.0F / f
			       - 1.0F);
			class320.aClass433_3409.aFloatArray4853[13]
			    = (((float) i_386_
				+ aClass185_Sub1_9105.method14715())
			       * 2.0F / f_370_) - 1.0F;
			class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
			class320.method5767();
			i_388_ += i_384_;
		    }
		    if (i_388_ < i_383_) {
			int i_390_ = i_383_ - i_388_;
			class320.aClass433_3406.method6952
			    (anInterface38_9112.method241((float) i_390_),
			     anInterface38_9112.method245((float) anInt9103),
			     1.0F, 1.0F);
			class320.aClass433_3409.method6952(((float) i_390_
							    * 2.0F / f),
							   ((float) anInt9103
							    * 2.0F / f_370_),
							   1.0F, 1.0F);
			class320.aClass433_3409.aFloatArray4853[12]
			    = (((float) i_388_
				+ aClass185_Sub1_9105.method14715()) * 2.0F / f
			       - 1.0F);
			class320.aClass433_3409.aFloatArray4853[13]
			    = (((float) i_386_
				+ aClass185_Sub1_9105.method14715())
			       * 2.0F / f_370_) - 1.0F;
			class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
			class320.method5767();
		    }
		    i_386_ += i_385_;
		}
		if (i_386_ < i_382_) {
		    int i_391_ = i_382_ - i_386_;
		    class320.aClass433_3406.method6952
			(anInterface38_9112.method241((float) anInt9102),
			 anInterface38_9112.method245((float) i_391_), 1.0F,
			 1.0F);
		    int i_392_ = i + anInt9099;
		    for (int i_393_ = i_392_ + anInt9102; i_393_ <= i_383_;
			 i_393_ += i_384_) {
			class320.aClass433_3409.method6952(((float) anInt9102
							    * 2.0F / f),
							   ((float) i_391_
							    * 2.0F / f_370_),
							   1.0F, 1.0F);
			class320.aClass433_3409.aFloatArray4853[12]
			    = (((float) i_392_
				+ aClass185_Sub1_9105.method14715()) * 2.0F / f
			       - 1.0F);
			class320.aClass433_3409.aFloatArray4853[13]
			    = (((float) i_386_
				+ aClass185_Sub1_9105.method14715())
			       * 2.0F / f_370_) - 1.0F;
			class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
			class320.method5767();
			i_392_ += i_384_;
		    }
		    if (i_392_ < i_383_) {
			int i_394_ = i_383_ - i_392_;
			class320.aClass433_3406.method6952
			    (anInterface38_9112.method241((float) i_394_),
			     anInterface38_9112.method245((float) i_391_),
			     1.0F, 1.0F);
			class320.aClass433_3409.method6952(((float) i_394_
							    * 2.0F / f),
							   ((float) i_391_
							    * 2.0F / f_370_),
							   1.0F, 1.0F);
			class320.aClass433_3409.aFloatArray4853[12]
			    = (((float) i_392_
				+ aClass185_Sub1_9105.method14715()) * 2.0F / f
			       - 1.0F);
			class320.aClass433_3409.aFloatArray4853[13]
			    = (((float) i_386_
				+ aClass185_Sub1_9105.method14715())
			       * 2.0F / f_370_) - 1.0F;
			class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
			class320.method5767();
		    }
		}
	    }
	}
    }
    
    void method2707(float f, float f_395_, float f_396_, float f_397_,
		    float f_398_, float f_399_, int i, Class145 class145,
		    int i_400_, int i_401_) {
	aClass185_Sub1_9105.method14593();
	Class320 class320 = aClass185_Sub1_9105.aClass320_9232;
	class320.anInterface38_3403 = anInterface38_9112;
	class320.method5765(1, -1);
	float f_402_
	    = (float) aClass185_Sub1_9105.method3253(-1228996008).method2910();
	float f_403_
	    = (float) aClass185_Sub1_9105.method3253(-1614673580).method2911();
	class320.aClass433_3409.method6840();
	if (aBool9108) {
	    float f_404_ = (float) anInt9102 / (float) method22();
	    float f_405_ = (float) anInt9103 / (float) method2692();
	    class320.aClass433_3409.aFloatArray4853[0] = (f_396_ - f) * f_404_;
	    class320.aClass433_3409.aFloatArray4853[1]
		= (f_397_ - f_395_) * f_404_;
	    class320.aClass433_3409.aFloatArray4853[4] = (f_398_ - f) * f_405_;
	    class320.aClass433_3409.aFloatArray4853[5]
		= (f_399_ - f_395_) * f_405_;
	    class320.aClass433_3409.aFloatArray4853[12]
		= ((f + (float) anInt9099) * f_404_
		   + aClass185_Sub1_9105.method14715());
	    class320.aClass433_3409.aFloatArray4853[13]
		= ((f_395_ + (float) anInt9101) * f_405_
		   + aClass185_Sub1_9105.method14715());
	} else {
	    class320.aClass433_3409.aFloatArray4853[0] = f_396_ - f;
	    class320.aClass433_3409.aFloatArray4853[1] = f_397_ - f_395_;
	    class320.aClass433_3409.aFloatArray4853[4] = f_398_ - f;
	    class320.aClass433_3409.aFloatArray4853[5] = f_399_ - f_395_;
	    class320.aClass433_3409.aFloatArray4853[12]
		= f + aClass185_Sub1_9105.method14715();
	    class320.aClass433_3409.aFloatArray4853[13]
		= f_395_ + aClass185_Sub1_9105.method14715();
	}
	Class433 class433 = aClass185_Sub1_9105.aClass433_9194;
	class433.method6840();
	class433.aFloatArray4853[0] = 2.0F / f_402_;
	class433.aFloatArray4853[5] = 2.0F / f_403_;
	class433.aFloatArray4853[12] = -1.0F;
	class433.aFloatArray4853[13] = -1.0F;
	class433.aFloatArray4853[14] = -1.0F;
	class320.aClass433_3409.method6839(class433);
	class320.aClass433_3406.method6952(anInterface38_9112
					       .method241((float) anInt9102),
					   anInterface38_9112
					       .method245((float) anInt9103),
					   1.0F, 1.0F);
	class320.anInterface37_3410 = aClass185_Sub1_9105.anInterface37_9226;
	class320.anInt3404 = 0;
	class320.aClass349_3411 = aClass185_Sub1_9105.aClass349_9143;
	Interface38 interface38
	    = ((Class145_Sub1) class145).anInterface38_9425;
	class320.anInterface38_3405 = interface38;
	class320.aClass433_3408.method6840();
	class320.aClass433_3408.aFloatArray4853[0]
	    = (f_396_ - f) * interface38.method241(1.0F);
	class320.aClass433_3408.aFloatArray4853[1]
	    = (f_397_ - f_395_) * interface38.method241(1.0F);
	class320.aClass433_3408.aFloatArray4853[4]
	    = (f_398_ - f) * interface38.method245(1.0F);
	class320.aClass433_3408.aFloatArray4853[5]
	    = (f_399_ - f_395_) * interface38.method245(1.0F);
	class320.aClass433_3408.aFloatArray4853[12]
	    = (f - (float) i_400_) * interface38.method241(1.0F);
	class320.aClass433_3408.aFloatArray4853[13]
	    = (f_395_ - (float) i_401_) * interface38.method245(1.0F);
	class320.method5770();
    }
    
    void method2708(float f, float f_406_, float f_407_, float f_408_,
		    float f_409_, float f_410_, int i, Class145 class145,
		    int i_411_, int i_412_) {
	aClass185_Sub1_9105.method14593();
	Class320 class320 = aClass185_Sub1_9105.aClass320_9232;
	class320.anInterface38_3403 = anInterface38_9112;
	class320.method5765(1, -1);
	float f_413_
	    = (float) aClass185_Sub1_9105.method3253(-457678755).method2910();
	float f_414_
	    = (float) aClass185_Sub1_9105.method3253(-1402381351).method2911();
	class320.aClass433_3409.method6840();
	if (aBool9108) {
	    float f_415_ = (float) anInt9102 / (float) method22();
	    float f_416_ = (float) anInt9103 / (float) method2692();
	    class320.aClass433_3409.aFloatArray4853[0] = (f_407_ - f) * f_415_;
	    class320.aClass433_3409.aFloatArray4853[1]
		= (f_408_ - f_406_) * f_415_;
	    class320.aClass433_3409.aFloatArray4853[4] = (f_409_ - f) * f_416_;
	    class320.aClass433_3409.aFloatArray4853[5]
		= (f_410_ - f_406_) * f_416_;
	    class320.aClass433_3409.aFloatArray4853[12]
		= ((f + (float) anInt9099) * f_415_
		   + aClass185_Sub1_9105.method14715());
	    class320.aClass433_3409.aFloatArray4853[13]
		= ((f_406_ + (float) anInt9101) * f_416_
		   + aClass185_Sub1_9105.method14715());
	} else {
	    class320.aClass433_3409.aFloatArray4853[0] = f_407_ - f;
	    class320.aClass433_3409.aFloatArray4853[1] = f_408_ - f_406_;
	    class320.aClass433_3409.aFloatArray4853[4] = f_409_ - f;
	    class320.aClass433_3409.aFloatArray4853[5] = f_410_ - f_406_;
	    class320.aClass433_3409.aFloatArray4853[12]
		= f + aClass185_Sub1_9105.method14715();
	    class320.aClass433_3409.aFloatArray4853[13]
		= f_406_ + aClass185_Sub1_9105.method14715();
	}
	Class433 class433 = aClass185_Sub1_9105.aClass433_9194;
	class433.method6840();
	class433.aFloatArray4853[0] = 2.0F / f_413_;
	class433.aFloatArray4853[5] = 2.0F / f_414_;
	class433.aFloatArray4853[12] = -1.0F;
	class433.aFloatArray4853[13] = -1.0F;
	class433.aFloatArray4853[14] = -1.0F;
	class320.aClass433_3409.method6839(class433);
	class320.aClass433_3406.method6952(anInterface38_9112
					       .method241((float) anInt9102),
					   anInterface38_9112
					       .method245((float) anInt9103),
					   1.0F, 1.0F);
	class320.anInterface37_3410 = aClass185_Sub1_9105.anInterface37_9226;
	class320.anInt3404 = 0;
	class320.aClass349_3411 = aClass185_Sub1_9105.aClass349_9143;
	Interface38 interface38
	    = ((Class145_Sub1) class145).anInterface38_9425;
	class320.anInterface38_3405 = interface38;
	class320.aClass433_3408.method6840();
	class320.aClass433_3408.aFloatArray4853[0]
	    = (f_407_ - f) * interface38.method241(1.0F);
	class320.aClass433_3408.aFloatArray4853[1]
	    = (f_408_ - f_406_) * interface38.method241(1.0F);
	class320.aClass433_3408.aFloatArray4853[4]
	    = (f_409_ - f) * interface38.method245(1.0F);
	class320.aClass433_3408.aFloatArray4853[5]
	    = (f_410_ - f_406_) * interface38.method245(1.0F);
	class320.aClass433_3408.aFloatArray4853[12]
	    = (f - (float) i_411_) * interface38.method241(1.0F);
	class320.aClass433_3408.aFloatArray4853[13]
	    = (f_406_ - (float) i_412_) * interface38.method245(1.0F);
	class320.method5770();
    }
    
    public int method21() {
	return anInt9102 + anInt9099 + anInt9100;
    }
    
    public void method2705(int i, int i_417_, int i_418_, int i_419_,
			   int i_420_, int i_421_, int i_422_) {
	if (aClass185_Sub1_9105.method14703() != Class353.aClass353_3655) {
	    int i_423_ = i_417_ + i_419_;
	    int i_424_ = i + i_418_;
	    int i_425_ = method22();
	    int i_426_ = method2692();
	    int i_427_ = i_417_ + anInt9101;
	    for (int i_428_ = i_427_ + anInt9103; i_428_ <= i_423_;
		 i_428_ += i_426_) {
		int i_429_ = i + anInt9099;
		for (int i_430_ = i_429_ + anInt9102; i_430_ <= i_424_;
		     i_430_ += i_425_) {
		    aClass185_Sub1_9105.aClass371_9147.method6384
			((float) i_429_, (float) i_427_,
			 (float) (i_429_ + anInt9102),
			 (float) (i_427_ + anInt9103), 0.0F, 0.0F,
			 anInterface38_9112.method250(),
			 anInterface38_9112.method249(), anInterface38_9112,
			 i_421_);
		    i_429_ += i_425_;
		}
		if (i_429_ < i_424_) {
		    int i_431_ = i_424_ - i_429_;
		    aClass185_Sub1_9105.aClass371_9147.method6384
			((float) i_429_, (float) i_427_,
			 (float) (i_429_ + i_431_),
			 (float) (i_427_ + anInt9103), 0.0F, 0.0F,
			 ((float) i_431_ / (float) anInt9102
			  * anInterface38_9112.method250()),
			 anInterface38_9112.method249(), anInterface38_9112,
			 i_421_);
		}
		i_427_ += i_426_;
	    }
	    if (i_427_ < i_423_) {
		int i_432_ = i_423_ - i_427_;
		float f = ((float) i_432_ / (float) anInt9103
			   * anInterface38_9112.method249());
		int i_433_ = i + anInt9099;
		for (int i_434_ = i_433_ + anInt9102; i_434_ <= i_424_;
		     i_434_ += i_425_) {
		    aClass185_Sub1_9105.aClass371_9147.method6384
			((float) i_433_, (float) i_427_,
			 (float) (i_433_ + anInt9102),
			 (float) (i_427_ + i_432_), 0.0F, 0.0F,
			 anInterface38_9112.method250(), f, anInterface38_9112,
			 i_421_);
		    i_433_ += i_425_;
		}
		if (i_433_ < i_424_) {
		    int i_435_ = i_424_ - i_433_;
		    aClass185_Sub1_9105.aClass371_9147.method6384
			((float) i_433_, (float) i_427_,
			 (float) (i_433_ + i_435_), (float) (i_427_ + i_432_),
			 0.0F, 0.0F,
			 ((float) i_435_ / (float) anInt9102
			  * anInterface38_9112.method250()),
			 f, anInterface38_9112, i_421_);
		}
	    }
	} else {
	    aClass185_Sub1_9105.method14593();
	    aClass185_Sub1_9105.method14687(i_422_);
	    Class320 class320 = aClass185_Sub1_9105.aClass320_9232;
	    class320.anInterface38_3403 = anInterface38_9112;
	    class320.method5765(i_420_, i_421_);
	    float f = (float) aClass185_Sub1_9105.method3253(-1919697633)
				  .method2910();
	    float f_436_ = (float) aClass185_Sub1_9105.method3253
				       (-1118249964).method2911();
	    class320.anInterface37_3410
		= aClass185_Sub1_9105.anInterface37_9226;
	    class320.anInt3404 = 0;
	    class320.aClass349_3411 = aClass185_Sub1_9105.aClass349_9143;
	    boolean bool = aBool9111 && anInt9101 == 0 && anInt9107 == 0;
	    boolean bool_437_ = aBool9106 && anInt9099 == 0 && anInt9100 == 0;
	    if (bool_437_ & bool) {
		class320.aClass433_3409.method6952((float) i_418_ * 2.0F / f,
						   ((float) i_419_ * 2.0F
						    / f_436_),
						   1.0F, 1.0F);
		class320.aClass433_3409.aFloatArray4853[12]
		    = (((float) i + aClass185_Sub1_9105.method14715()) * 2.0F
		       / f) - 1.0F;
		class320.aClass433_3409.aFloatArray4853[13]
		    = (((float) i_417_ + aClass185_Sub1_9105.method14715())
		       * 2.0F / f_436_) - 1.0F;
		class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
		class320.aClass433_3406.method6952
		    (anInterface38_9112.method241((float) i_418_),
		     anInterface38_9112.method245((float) i_419_), 1.0F, 1.0F);
		class320.method5767();
	    } else if (bool_437_) {
		int i_438_ = i_417_ + i_419_;
		int i_439_ = method2692();
		class320.aClass433_3406.method6952
		    (anInterface38_9112.method241((float) i_418_),
		     anInterface38_9112.method245((float) anInt9103), 1.0F,
		     1.0F);
		int i_440_ = i_417_ + anInt9101;
		for (int i_441_ = i_440_ + anInt9103; i_441_ <= i_438_;
		     i_441_ += i_439_) {
		    class320.aClass433_3409.method6952(((float) i_418_ * 2.0F
							/ f),
						       ((float) anInt9103
							* 2.0F / f_436_),
						       1.0F, 1.0F);
		    class320.aClass433_3409.aFloatArray4853[12]
			= (((float) i + aClass185_Sub1_9105.method14715())
			   * 2.0F / f) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[13]
			= (((float) i_440_ + aClass185_Sub1_9105.method14715())
			   * 2.0F / f_436_) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
		    class320.method5767();
		    i_440_ += i_439_;
		}
		if (i_440_ < i_438_) {
		    int i_442_ = i_438_ - i_440_;
		    class320.aClass433_3406.method6952
			(anInterface38_9112.method241((float) i_418_),
			 anInterface38_9112.method245((float) i_442_), 1.0F,
			 1.0F);
		    class320.aClass433_3409.method6952(((float) i_418_ * 2.0F
							/ f),
						       ((float) i_442_ * 2.0F
							/ f_436_),
						       1.0F, 1.0F);
		    class320.aClass433_3409.aFloatArray4853[12]
			= (((float) i + aClass185_Sub1_9105.method14715())
			   * 2.0F / f) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[13]
			= (((float) i_440_ + aClass185_Sub1_9105.method14715())
			   * 2.0F / f_436_) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
		    class320.method5767();
		}
	    } else if (bool) {
		int i_443_ = i + i_418_;
		int i_444_ = method22();
		class320.aClass433_3406.method6952
		    (anInterface38_9112.method241((float) anInt9102),
		     anInterface38_9112.method245((float) i_419_), 1.0F, 1.0F);
		int i_445_ = i + anInt9099;
		for (int i_446_ = i_445_ + anInt9102; i_446_ <= i_443_;
		     i_446_ += i_444_) {
		    class320.aClass433_3409.method6952(((float) anInt9102
							* 2.0F / f),
						       ((float) i_419_ * 2.0F
							/ f_436_),
						       1.0F, 1.0F);
		    class320.aClass433_3409.aFloatArray4853[12]
			= (((float) i_445_ + aClass185_Sub1_9105.method14715())
			   * 2.0F / f) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[13]
			= (((float) i_417_ + aClass185_Sub1_9105.method14715())
			   * 2.0F / f_436_) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
		    class320.method5767();
		    i_445_ += i_444_;
		}
		if (i_445_ < i_443_) {
		    int i_447_ = i_443_ - i_445_;
		    class320.aClass433_3406.method6952
			(anInterface38_9112.method241((float) i_447_),
			 anInterface38_9112.method245((float) i_419_), 1.0F,
			 1.0F);
		    class320.aClass433_3409.method6952(((float) i_447_ * 2.0F
							/ f),
						       ((float) i_419_ * 2.0F
							/ f_436_),
						       1.0F, 1.0F);
		    class320.aClass433_3409.aFloatArray4853[12]
			= (((float) i_445_ + aClass185_Sub1_9105.method14715())
			   * 2.0F / f) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[13]
			= (((float) i_417_ + aClass185_Sub1_9105.method14715())
			   * 2.0F / f_436_) - 1.0F;
		    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
		    class320.method5767();
		}
	    } else {
		int i_448_ = i_417_ + i_419_;
		int i_449_ = i + i_418_;
		int i_450_ = method22();
		int i_451_ = method2692();
		int i_452_ = i_417_ + anInt9101;
		for (int i_453_ = i_452_ + anInt9103; i_453_ <= i_448_;
		     i_453_ += i_451_) {
		    class320.aClass433_3406.method6952
			(anInterface38_9112.method241((float) anInt9102),
			 anInterface38_9112.method245((float) anInt9103), 1.0F,
			 1.0F);
		    int i_454_ = i + anInt9099;
		    for (int i_455_ = i_454_ + anInt9102; i_455_ <= i_449_;
			 i_455_ += i_450_) {
			class320.aClass433_3409.method6952(((float) anInt9102
							    * 2.0F / f),
							   ((float) anInt9103
							    * 2.0F / f_436_),
							   1.0F, 1.0F);
			class320.aClass433_3409.aFloatArray4853[12]
			    = (((float) i_454_
				+ aClass185_Sub1_9105.method14715()) * 2.0F / f
			       - 1.0F);
			class320.aClass433_3409.aFloatArray4853[13]
			    = (((float) i_452_
				+ aClass185_Sub1_9105.method14715())
			       * 2.0F / f_436_) - 1.0F;
			class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
			class320.method5767();
			i_454_ += i_450_;
		    }
		    if (i_454_ < i_449_) {
			int i_456_ = i_449_ - i_454_;
			class320.aClass433_3406.method6952
			    (anInterface38_9112.method241((float) i_456_),
			     anInterface38_9112.method245((float) anInt9103),
			     1.0F, 1.0F);
			class320.aClass433_3409.method6952(((float) i_456_
							    * 2.0F / f),
							   ((float) anInt9103
							    * 2.0F / f_436_),
							   1.0F, 1.0F);
			class320.aClass433_3409.aFloatArray4853[12]
			    = (((float) i_454_
				+ aClass185_Sub1_9105.method14715()) * 2.0F / f
			       - 1.0F);
			class320.aClass433_3409.aFloatArray4853[13]
			    = (((float) i_452_
				+ aClass185_Sub1_9105.method14715())
			       * 2.0F / f_436_) - 1.0F;
			class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
			class320.method5767();
		    }
		    i_452_ += i_451_;
		}
		if (i_452_ < i_448_) {
		    int i_457_ = i_448_ - i_452_;
		    class320.aClass433_3406.method6952
			(anInterface38_9112.method241((float) anInt9102),
			 anInterface38_9112.method245((float) i_457_), 1.0F,
			 1.0F);
		    int i_458_ = i + anInt9099;
		    for (int i_459_ = i_458_ + anInt9102; i_459_ <= i_449_;
			 i_459_ += i_450_) {
			class320.aClass433_3409.method6952(((float) anInt9102
							    * 2.0F / f),
							   ((float) i_457_
							    * 2.0F / f_436_),
							   1.0F, 1.0F);
			class320.aClass433_3409.aFloatArray4853[12]
			    = (((float) i_458_
				+ aClass185_Sub1_9105.method14715()) * 2.0F / f
			       - 1.0F);
			class320.aClass433_3409.aFloatArray4853[13]
			    = (((float) i_452_
				+ aClass185_Sub1_9105.method14715())
			       * 2.0F / f_436_) - 1.0F;
			class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
			class320.method5767();
			i_458_ += i_450_;
		    }
		    if (i_458_ < i_449_) {
			int i_460_ = i_449_ - i_458_;
			class320.aClass433_3406.method6952
			    (anInterface38_9112.method241((float) i_460_),
			     anInterface38_9112.method245((float) i_457_),
			     1.0F, 1.0F);
			class320.aClass433_3409.method6952(((float) i_460_
							    * 2.0F / f),
							   ((float) i_457_
							    * 2.0F / f_436_),
							   1.0F, 1.0F);
			class320.aClass433_3409.aFloatArray4853[12]
			    = (((float) i_458_
				+ aClass185_Sub1_9105.method14715()) * 2.0F / f
			       - 1.0F);
			class320.aClass433_3409.aFloatArray4853[13]
			    = (((float) i_452_
				+ aClass185_Sub1_9105.method14715())
			       * 2.0F / f_436_) - 1.0F;
			class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
			class320.method5767();
		    }
		}
	    }
	}
    }
    
    void method2711(float f, float f_461_, float f_462_, float f_463_,
		    float f_464_, float f_465_, int i, int i_466_, int i_467_,
		    int i_468_) {
	if (aClass185_Sub1_9105.method14703() != Class353.aClass353_3655)
	    aClass185_Sub1_9105.aClass371_9147.method6398
		(f, f_461_, f_462_, f_463_, f_464_, f_465_,
		 f_462_ + f_464_ - f, f_463_ + f_465_ - f_461_, 0.0F, 0.0F,
		 anInterface38_9112.method250(), 0.0F, 0.0F,
		 anInterface38_9112.method249(),
		 anInterface38_9112.method250(),
		 anInterface38_9112.method249(), anInterface38_9112, i_466_);
	else {
	    aClass185_Sub1_9105.method14593();
	    aClass185_Sub1_9105.method14687(i_467_);
	    if (aBool9108) {
		float f_469_ = (float) method22();
		float f_470_ = (float) method2692();
		float f_471_ = (f_462_ - f) / f_469_;
		float f_472_ = (f_463_ - f_461_) / f_469_;
		float f_473_ = (f_464_ - f) / f_470_;
		float f_474_ = (f_465_ - f_461_) / f_470_;
		float f_475_ = f_473_ * (float) anInt9101;
		float f_476_ = f_474_ * (float) anInt9101;
		float f_477_ = f_471_ * (float) anInt9099;
		float f_478_ = f_472_ * (float) anInt9099;
		float f_479_ = -f_471_ * (float) anInt9100;
		float f_480_ = -f_472_ * (float) anInt9100;
		float f_481_ = -f_473_ * (float) anInt9107;
		float f_482_ = -f_474_ * (float) anInt9107;
		f = f + f_477_ + f_475_;
		f_461_ = f_461_ + f_478_ + f_476_;
		f_462_ = f_462_ + f_479_ + f_475_;
		f_463_ = f_463_ + f_480_ + f_476_;
		f_464_ = f_464_ + f_477_ + f_481_;
		f_465_ = f_465_ + f_478_ + f_482_;
	    }
	    Class320 class320 = aClass185_Sub1_9105.aClass320_9232;
	    class320.anInterface38_3403 = anInterface38_9112;
	    class320.method5765(i, i_466_);
	    float f_483_ = (float) aClass185_Sub1_9105.method3253
				       (-1802405562).method2910();
	    float f_484_ = (float) aClass185_Sub1_9105.method3253
				       (-1799338459).method2911();
	    class320.aClass433_3409.method6840();
	    class320.aClass433_3409.aFloatArray4853[0]
		= (f_462_ - f) * 2.0F / f_483_;
	    class320.aClass433_3409.aFloatArray4853[1]
		= (f_463_ - f_461_) * 2.0F / f_484_;
	    class320.aClass433_3409.aFloatArray4853[4]
		= (f_464_ - f) * 2.0F / f_483_;
	    class320.aClass433_3409.aFloatArray4853[5]
		= (f_465_ - f_461_) * 2.0F / f_484_;
	    class320.aClass433_3409.aFloatArray4853[12]
		= ((f + aClass185_Sub1_9105.method14715()) * 2.0F / f_483_
		   - 1.0F);
	    class320.aClass433_3409.aFloatArray4853[13]
		= ((f_461_ + aClass185_Sub1_9105.method14715()) * 2.0F / f_484_
		   - 1.0F);
	    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
	    class320.aClass433_3406.method6952
		(anInterface38_9112.method241((float) anInt9102),
		 anInterface38_9112.method245((float) anInt9103), 1.0F, 1.0F);
	    class320.anInterface37_3410
		= aClass185_Sub1_9105.anInterface37_9226;
	    class320.anInt3404 = 0;
	    class320.aClass349_3411 = aClass185_Sub1_9105.aClass349_9143;
	    class320.method5767();
	}
    }
    
    void method2677(float f, float f_485_, float f_486_, float f_487_,
		    float f_488_, float f_489_, int i, int i_490_, int i_491_,
		    int i_492_) {
	if (aClass185_Sub1_9105.method14703() != Class353.aClass353_3655)
	    aClass185_Sub1_9105.aClass371_9147.method6398
		(f, f_485_, f_486_, f_487_, f_488_, f_489_,
		 f_486_ + f_488_ - f, f_487_ + f_489_ - f_485_, 0.0F, 0.0F,
		 anInterface38_9112.method250(), 0.0F, 0.0F,
		 anInterface38_9112.method249(),
		 anInterface38_9112.method250(),
		 anInterface38_9112.method249(), anInterface38_9112, i_490_);
	else {
	    aClass185_Sub1_9105.method14593();
	    aClass185_Sub1_9105.method14687(i_491_);
	    if (aBool9108) {
		float f_493_ = (float) method22();
		float f_494_ = (float) method2692();
		float f_495_ = (f_486_ - f) / f_493_;
		float f_496_ = (f_487_ - f_485_) / f_493_;
		float f_497_ = (f_488_ - f) / f_494_;
		float f_498_ = (f_489_ - f_485_) / f_494_;
		float f_499_ = f_497_ * (float) anInt9101;
		float f_500_ = f_498_ * (float) anInt9101;
		float f_501_ = f_495_ * (float) anInt9099;
		float f_502_ = f_496_ * (float) anInt9099;
		float f_503_ = -f_495_ * (float) anInt9100;
		float f_504_ = -f_496_ * (float) anInt9100;
		float f_505_ = -f_497_ * (float) anInt9107;
		float f_506_ = -f_498_ * (float) anInt9107;
		f = f + f_501_ + f_499_;
		f_485_ = f_485_ + f_502_ + f_500_;
		f_486_ = f_486_ + f_503_ + f_499_;
		f_487_ = f_487_ + f_504_ + f_500_;
		f_488_ = f_488_ + f_501_ + f_505_;
		f_489_ = f_489_ + f_502_ + f_506_;
	    }
	    Class320 class320 = aClass185_Sub1_9105.aClass320_9232;
	    class320.anInterface38_3403 = anInterface38_9112;
	    class320.method5765(i, i_490_);
	    float f_507_ = (float) aClass185_Sub1_9105.method3253
				       (-952742694).method2910();
	    float f_508_ = (float) aClass185_Sub1_9105.method3253
				       (-112531222).method2911();
	    class320.aClass433_3409.method6840();
	    class320.aClass433_3409.aFloatArray4853[0]
		= (f_486_ - f) * 2.0F / f_507_;
	    class320.aClass433_3409.aFloatArray4853[1]
		= (f_487_ - f_485_) * 2.0F / f_508_;
	    class320.aClass433_3409.aFloatArray4853[4]
		= (f_488_ - f) * 2.0F / f_507_;
	    class320.aClass433_3409.aFloatArray4853[5]
		= (f_489_ - f_485_) * 2.0F / f_508_;
	    class320.aClass433_3409.aFloatArray4853[12]
		= ((f + aClass185_Sub1_9105.method14715()) * 2.0F / f_507_
		   - 1.0F);
	    class320.aClass433_3409.aFloatArray4853[13]
		= ((f_485_ + aClass185_Sub1_9105.method14715()) * 2.0F / f_508_
		   - 1.0F);
	    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
	    class320.aClass433_3406.method6952
		(anInterface38_9112.method241((float) anInt9102),
		 anInterface38_9112.method245((float) anInt9103), 1.0F, 1.0F);
	    class320.anInterface37_3410
		= aClass185_Sub1_9105.anInterface37_9226;
	    class320.anInt3404 = 0;
	    class320.aClass349_3411 = aClass185_Sub1_9105.aClass349_9143;
	    class320.method5767();
	}
    }
}
