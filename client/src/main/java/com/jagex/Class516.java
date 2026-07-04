/* Class516 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class516
{
    int anInt7014;
    static final int anInt7015 = 0;
    static final int anInt7016 = 1;
    static final int anInt7017 = 2;
    int anInt7018;
    int anInt7019;
    static int[] anIntArray7020 = new int[4];
    int anInt7021;
    int anInt7022;
    static Class163 aClass163_7023;
    static final int anInt7024 = 512;
    int anInt7025;
    static final int anInt7026 = 128;
    int anInt7027;
    int anInt7028;
    int anInt7029;
    int anInt7030;
    int anInt7031;
    int anInt7032;
    int anInt7033;
    int anInt7034;
    static final int anInt7035 = 24;
    static final int anInt7036 = 24;
    static final int anInt7037 = 192;
    static Class163 aClass163_7038;
    static final int anInt7039 = 13;
    static final int anInt7040 = 16;
    static Class183 aClass183_7041;
    Class163 aClass163_7042;
    int anInt7043;
    boolean aBool7044;
    
    void method8591(Class185 class185, Class516 class516_0_) {
	method8598(class185);
	method8599(class185);
	class185.method3360(anIntArray7020);
	class185.method3373(0, 0, anInt7029, anInt7029);
	class185.method3340(2, 0);
	class185.method3298(0, 0, anInt7029, anInt7029, ~0xffffff | anInt7025,
			    0);
	int i = 0;
	int i_1_ = 0;
	int i_2_ = 256;
	if (class516_0_ != null) {
	    if (class516_0_.aBool7044) {
		i = -class516_0_.anInt7043;
		i_1_ = -class516_0_.anInt7021;
		i_2_ = -class516_0_.anInt7022;
	    } else {
		i = class516_0_.anInt7043 - anInt7043;
		i_1_ = class516_0_.anInt7021 - anInt7021;
		i_2_ = class516_0_.anInt7022 - anInt7022;
	    }
	}
	if (anInt7027 != 0) {
	    int i_3_ = Class427.anIntArray4806[anInt7027];
	    int i_4_ = Class427.anIntArray4805[anInt7027];
	    int i_5_ = i_1_ * i_4_ - i_2_ * i_3_ >> 14;
	    i_2_ = i_1_ * i_3_ + i_2_ * i_4_ >> 14;
	    i_1_ = i_5_;
	}
	if (anInt7014 != 0) {
	    int i_6_ = Class427.anIntArray4806[anInt7014];
	    int i_7_ = Class427.anIntArray4805[anInt7014];
	    int i_8_ = i_2_ * i_6_ + i * i_7_ >> 14;
	    i_2_ = i_2_ * i_7_ - i * i_6_ >> 14;
	    i = i_8_;
	}
	Class183 class183 = aClass183_7041.method3011((byte) 0, 51200, true);
	class183.method3118((short) 0, (short) anInt7031);
	class185.method3489(1.0F);
	class185.method3341(16777215, 1.0F, 1.0F, (float) i, (float) i_1_,
			    (float) i_2_);
	int i_9_ = (1024 * anInt7029
		    / (class183.method3043() - class183.method3134()));
	if (anInt7025 != 0)
	    i_9_ = i_9_ * 13 / 16;
	Class433 class433 = class185.method3339();
	Class433 class433_10_ = class185.method3518();
	class433_10_.method6951
	    ((float) (anInt7029 / 2), (float) (anInt7029 / 2), (float) i_9_,
	     (float) i_9_, 50.0F, 50000.0F,
	     (float) class185.method3253(-861081489).method2910(),
	     (float) class185.method3253(-1087521600).method2911(), 1024.0F);
	class185.method3338(class433_10_);
	class185.method3335(new Class446());
	Class446 class446 = new Class446();
	class446.method7250(0.0F, 0.0F, (float) (50 - class183.method3047()));
	class183.method3034(class446, null, 1);
	int i_11_ = anInt7029 * 13 / 16;
	int i_12_ = (anInt7029 - i_11_) / 2;
	aClass163_7038.method2660(i_12_, i_12_, i_11_, i_11_, 0,
				  ~0xffffff | anInt7025, 1);
	aClass163_7042 = class185.method3319(0, 0, anInt7029, anInt7029, true);
	class185.method3340(2, 0);
	class185.method3298(0, 0, anInt7029, anInt7029, 0, 0);
	aClass163_7023.method2660(0, 0, anInt7029, anInt7029, 1, 0, 0);
	aClass163_7042.method2655(0, 0, 3);
	class185.method3338(class433);
	class185.method3373(anIntArray7020[0], anIntArray7020[1],
			    anIntArray7020[2], anIntArray7020[3]);
    }
    
    static void method8592() {
	aClass183_7041 = null;
	aClass163_7023 = null;
    }
    
    public Class516(int i, int i_13_, int i_14_, int i_15_, int i_16_,
		    int i_17_, int i_18_, boolean bool, int i_19_, int i_20_,
		    int i_21_) {
	anInt7043 = i_14_;
	anInt7021 = i_15_;
	anInt7022 = i_16_;
	aBool7044 = bool;
	anInt7031 = i_13_;
	anInt7025 = i_18_;
	anInt7019 = i_17_;
	anInt7018 = i;
	anInt7032 = i_19_;
	anInt7033 = i_20_;
	anInt7034 = i_21_;
    }
    
    boolean method8593(Class185 class185, Class516 class516_22_) {
	return aClass163_7042 != null || method8595(class185, class516_22_);
    }
    
    static void method8594() {
	aClass183_7041 = null;
	aClass163_7023 = null;
    }
    
    boolean method8595(Class185 class185, Class516 class516_23_) {
	if (aClass163_7042 == null) {
	    if (anInt7018 == 0) {
		if (Class304.anInterface25_3263.method155
		    (Class598.aClass598_7865, anInt7031,
		     Class613.aClass613_8023, 0.7F, anInt7029, anInt7029,
		     false, -618218007)) {
		    int[] is = (Class304.anInterface25_3263.method150
				(Class598.aClass598_7865, anInt7031, 0.7F,
				 anInt7029, anInt7029, false, 638667428));
		    aClass163_7042
			= class185.method3317(is, 0, anInt7029, anInt7029,
					      anInt7029, (byte) -25);
		}
	    } else if (anInt7018 == 2)
		method8596(class185, class516_23_);
	    else if (anInt7018 == 1)
		method8597(class185, class516_23_);
	}
	return aClass163_7042 != null;
    }
    
    void method8596(Class185 class185, Class516 class516_24_) {
	Class187 class187
	    = Class187.method3709(Class459.aClass472_4980, anInt7031, 0);
	if (class187 != null) {
	    class185.method3360(anIntArray7020);
	    class185.method3373(0, 0, anInt7029, anInt7029);
	    class185.method3340(2, 0);
	    class185.method3298(0, 0, anInt7029, anInt7029, 0, 0);
	    int i = 0;
	    int i_25_ = 0;
	    int i_26_ = 256;
	    if (class516_24_ != null) {
		if (class516_24_.aBool7044) {
		    i = -class516_24_.anInt7043;
		    i_25_ = -class516_24_.anInt7021;
		    i_26_ = -class516_24_.anInt7022;
		} else {
		    i = anInt7043 - class516_24_.anInt7043;
		    i_25_ = anInt7021 - class516_24_.anInt7021;
		    i_26_ = anInt7022 - class516_24_.anInt7022;
		}
	    }
	    if (anInt7027 != 0) {
		int i_27_ = -anInt7027 & 0x3fff;
		int i_28_ = Class427.anIntArray4806[i_27_];
		int i_29_ = Class427.anIntArray4805[i_27_];
		int i_30_ = i_25_ * i_29_ - i_26_ * i_28_ >> 14;
		i_26_ = i_25_ * i_28_ + i_26_ * i_29_ >> 14;
		i_25_ = i_30_;
	    }
	    if (anInt7014 != 0) {
		int i_31_ = -anInt7014 & 0x3fff;
		int i_32_ = Class427.anIntArray4806[i_31_];
		int i_33_ = Class427.anIntArray4805[i_31_];
		int i_34_ = i_26_ * i_32_ + i * i_33_ >> 14;
		i_26_ = i_26_ * i_33_ - i * i_32_ >> 14;
		i = i_34_;
	    }
	    class185.method3489(1.0F);
	    class185.method3341(anInt7025, 1.0F, 1.0F, (float) i,
				(float) i_25_, (float) i_26_);
	    class187.method3724(anInt7032 & 0x3fff, anInt7033 & 0x3fff,
				anInt7034 & 0x3fff);
	    Class183 class183
		= class185.method3329(class187, 2048, 0, 64, 768);
	    int i_35_ = class183.method3043() - class183.method3134();
	    int i_36_ = class183.method3046() - class183.method3045();
	    int i_37_ = i_35_ > i_36_ ? i_35_ : i_36_;
	    int i_38_ = 1024 * anInt7029 / i_37_;
	    Class433 class433 = class185.method3339();
	    Class433 class433_39_ = class185.method3518();
	    class433_39_.method6951((float) (anInt7029 / 2),
				    (float) (anInt7029 / 2), (float) i_38_,
				    (float) i_38_, 50.0F, 50000.0F,
				    (float) class185.method3253
						(-2002045097).method2910(),
				    (float) class185.method3253(-475682041)
						.method2911(),
				    1024.0F);
	    class185.method3338(class433_39_);
	    Class446 class446 = new Class446();
	    class185.method3335(class446);
	    Class446 class446_40_ = class185.method3665();
	    class446_40_.method7250(0.0F, 0.0F,
				    (float) (50 - class183.method3047()));
	    class183.method3034(class446_40_, null, 1);
	    aClass163_7042
		= class185.method3319(0, 0, anInt7029, anInt7029, true);
	    aClass163_7042.method2655(0, 0, 3);
	    class185.method3338(class433);
	    class185.method3373(anIntArray7020[0], anIntArray7020[1],
				anIntArray7020[2], anIntArray7020[3]);
	}
    }
    
    void method8597(Class185 class185, Class516 class516_41_) {
	method8598(class185);
	method8599(class185);
	class185.method3360(anIntArray7020);
	class185.method3373(0, 0, anInt7029, anInt7029);
	class185.method3340(2, 0);
	class185.method3298(0, 0, anInt7029, anInt7029, ~0xffffff | anInt7025,
			    0);
	int i = 0;
	int i_42_ = 0;
	int i_43_ = 256;
	if (class516_41_ != null) {
	    if (class516_41_.aBool7044) {
		i = -class516_41_.anInt7043;
		i_42_ = -class516_41_.anInt7021;
		i_43_ = -class516_41_.anInt7022;
	    } else {
		i = class516_41_.anInt7043 - anInt7043;
		i_42_ = class516_41_.anInt7021 - anInt7021;
		i_43_ = class516_41_.anInt7022 - anInt7022;
	    }
	}
	if (anInt7027 != 0) {
	    int i_44_ = Class427.anIntArray4806[anInt7027];
	    int i_45_ = Class427.anIntArray4805[anInt7027];
	    int i_46_ = i_42_ * i_45_ - i_43_ * i_44_ >> 14;
	    i_43_ = i_42_ * i_44_ + i_43_ * i_45_ >> 14;
	    i_42_ = i_46_;
	}
	if (anInt7014 != 0) {
	    int i_47_ = Class427.anIntArray4806[anInt7014];
	    int i_48_ = Class427.anIntArray4805[anInt7014];
	    int i_49_ = i_43_ * i_47_ + i * i_48_ >> 14;
	    i_43_ = i_43_ * i_48_ - i * i_47_ >> 14;
	    i = i_49_;
	}
	Class183 class183 = aClass183_7041.method3011((byte) 0, 51200, true);
	class183.method3118((short) 0, (short) anInt7031);
	class185.method3489(1.0F);
	class185.method3341(16777215, 1.0F, 1.0F, (float) i, (float) i_42_,
			    (float) i_43_);
	int i_50_ = (1024 * anInt7029
		     / (class183.method3043() - class183.method3134()));
	if (anInt7025 != 0)
	    i_50_ = i_50_ * 13 / 16;
	Class433 class433 = class185.method3339();
	Class433 class433_51_ = class185.method3518();
	class433_51_.method6951
	    ((float) (anInt7029 / 2), (float) (anInt7029 / 2), (float) i_50_,
	     (float) i_50_, 50.0F, 50000.0F,
	     (float) class185.method3253(-1415555956).method2910(),
	     (float) class185.method3253(-140173061).method2911(), 1024.0F);
	class185.method3338(class433_51_);
	class185.method3335(new Class446());
	Class446 class446 = new Class446();
	class446.method7250(0.0F, 0.0F, (float) (50 - class183.method3047()));
	class183.method3034(class446, null, 1);
	int i_52_ = anInt7029 * 13 / 16;
	int i_53_ = (anInt7029 - i_52_) / 2;
	aClass163_7038.method2660(i_53_, i_53_, i_52_, i_52_, 0,
				  ~0xffffff | anInt7025, 1);
	aClass163_7042 = class185.method3319(0, 0, anInt7029, anInt7029, true);
	class185.method3340(2, 0);
	class185.method3298(0, 0, anInt7029, anInt7029, 0, 0);
	aClass163_7023.method2660(0, 0, anInt7029, anInt7029, 1, 0, 0);
	aClass163_7042.method2655(0, 0, 3);
	class185.method3338(class433);
	class185.method3373(anIntArray7020[0], anIntArray7020[1],
			    anIntArray7020[2], anIntArray7020[3]);
    }
    
    static void method8598(Class185 class185) {
	if (aClass183_7041 == null) {
	    Class187 class187 = new Class187(580, 1104, 1);
	    class187.method3725((short) 0, (short) 32767, (short) 0,
				(short) 1024, (short) 1024, (short) 1024,
				(byte) 0, (byte) 0, (byte) 0);
	    class187.method3712(0, 128, 0);
	    class187.method3712(0, -128, 0);
	    for (int i = 0; i <= 24; i++) {
		int i_54_ = i * 8192 / 24;
		int i_55_ = Class427.anIntArray4806[i_54_];
		int i_56_ = Class427.anIntArray4805[i_54_];
		for (int i_57_ = 1; i_57_ < 24; i_57_++) {
		    int i_58_ = i_57_ * 8192 / 24;
		    int i_59_ = Class427.anIntArray4805[i_58_] >> 7;
		    int i_60_ = Class427.anIntArray4806[i_58_] * i_55_ >> 21;
		    int i_61_ = Class427.anIntArray4806[i_58_] * i_56_ >> 21;
		    class187.method3712(i_61_, i_59_, -i_60_);
		}
		if (i > 0) {
		    int i_62_ = i * 23 + 2;
		    int i_63_ = i_62_ - 23;
		    class187.method3713(0, i_63_, i_62_, (byte) 0, (byte) 0,
					(short) 127, (byte) 0, (short) 0);
		    for (int i_64_ = 1; i_64_ < 23; i_64_++) {
			int i_65_ = i_63_ + 1;
			int i_66_ = i_62_ + 1;
			class187.method3713(i_63_, i_65_, i_62_, (byte) 0,
					    (byte) 0, (short) 127, (byte) 0,
					    (short) 0);
			class187.method3713(i_65_, i_66_, i_62_, (byte) 0,
					    (byte) 0, (short) 127, (byte) 0,
					    (short) 0);
			i_63_ = i_65_;
			i_62_ = i_66_;
		    }
		    class187.method3713(i_62_, i_63_, 1, (byte) 0, (byte) 0,
					(short) 127, (byte) 0, (short) 0);
		}
	    }
	    class187.anInt2106 = class187.anInt2081;
	    class187.anIntArray2090 = null;
	    class187.anIntArray2087 = null;
	    class187.aByteArray2100 = null;
	    aClass183_7041 = class185.method3329(class187, 51200, 33, 64, 768);
	}
    }
    
    static void method8599(Class185 class185) {
	if (aClass163_7023 == null) {
	    int[] is = new int[16384];
	    int[] is_67_ = new int[16384];
	    for (int i = 0; i < 64; i++) {
		int i_68_ = 64 - i;
		i_68_ *= i_68_;
		int i_69_ = 128 - i - 1;
		int i_70_ = i * 128;
		int i_71_ = i_69_ * 128;
		for (int i_72_ = 0; i_72_ < 64; i_72_++) {
		    int i_73_ = 64 - i_72_;
		    i_73_ *= i_73_;
		    int i_74_ = 128 - i_72_ - 1;
		    int i_75_ = 256 - (i_73_ + i_68_ << 8) / 4096;
		    i_75_ = i_75_ * 3072 / 1536;
		    if (i_75_ < 0)
			i_75_ = 0;
		    else if (i_75_ > 255)
			i_75_ = 255;
		    int i_76_ = i_75_ / 2;
		    is_67_[i_70_ + i_72_] = is_67_[i_70_ + i_74_]
			= is_67_[i_71_ + i_72_] = is_67_[i_71_ + i_74_]
			= ~0xffffff | i_75_ << 16;
		    is[i_70_ + i_72_] = is[i_70_ + i_74_]
			= is[i_71_ + i_72_] = is[i_71_ + i_74_]
			= 127 - i_76_ << 24 | 0xffffff;
		}
	    }
	    aClass163_7023
		= class185.method3317(is_67_, 0, 128, 128, 128, (byte) -10);
	    aClass163_7038
		= class185.method3317(is, 0, 128, 128, 128, (byte) -18);
	}
    }
    
    void method8600(Class185 class185, int i, int i_77_, int i_78_, int i_79_,
		    int i_80_, int i_81_, int i_82_, int i_83_, int i_84_,
		    int i_85_) {
	if (aClass163_7042 != null) {
	    float[] fs = new float[3];
	    float f = (float) -(anInt7043 - i_82_ << 16);
	    float f_86_ = (float) (anInt7021 - i_83_ << 15);
	    float f_87_ = (float) -(anInt7022 - i_84_ << 16);
	    float[] fs_88_ = new float[3];
	    class185.method3532().method7259(fs_88_);
	    f += fs_88_[0];
	    f_86_ += fs_88_[1];
	    f_87_ += fs_88_[2];
	    class185.method3367(f, f_86_, f_87_, fs);
	    if (!(fs[2] < 0.0F)) {
		int i_89_ = (int) (fs[0] - (float) (anInt7030 / 2));
		int i_90_ = (int) (fs[1] - (float) (anInt7030 / 2));
		if (i_90_ < i_79_ && i_90_ + anInt7030 > 0 && i_89_ < i_78_
		    && i_89_ + anInt7030 > 0)
		    aClass163_7042.method2660(i_89_, i_90_, anInt7030,
					      anInt7030, 0,
					      i_85_ << 24 | 0xffffff, 1);
	    }
	}
    }
    
    static void method8601() {
	aClass183_7041 = null;
	aClass163_7023 = null;
    }
    
    void method8602(Class185 class185, int i, int i_91_, int i_92_, int i_93_,
		    int i_94_, int i_95_, int i_96_, int i_97_, int i_98_,
		    int i_99_) {
	if (aClass163_7042 != null) {
	    float[] fs = new float[3];
	    float f = (float) -(anInt7043 - i_96_ << 16);
	    float f_100_ = (float) (anInt7021 - i_97_ << 15);
	    float f_101_ = (float) -(anInt7022 - i_98_ << 16);
	    float[] fs_102_ = new float[3];
	    class185.method3532().method7259(fs_102_);
	    f += fs_102_[0];
	    f_100_ += fs_102_[1];
	    f_101_ += fs_102_[2];
	    class185.method3367(f, f_100_, f_101_, fs);
	    if (!(fs[2] < 0.0F)) {
		int i_103_ = (int) (fs[0] - (float) (anInt7030 / 2));
		int i_104_ = (int) (fs[1] - (float) (anInt7030 / 2));
		if (i_104_ < i_93_ && i_104_ + anInt7030 > 0 && i_103_ < i_92_
		    && i_103_ + anInt7030 > 0)
		    aClass163_7042.method2660(i_103_, i_104_, anInt7030,
					      anInt7030, 0,
					      i_99_ << 24 | 0xffffff, 1);
	    }
	}
    }
    
    boolean method8603(int i, int i_105_, int i_106_, int i_107_) {
	int i_108_;
	int i_109_;
	int i_110_;
	if (!aBool7044) {
	    i_108_ = anInt7043 - i;
	    i_109_ = anInt7021 - i_105_;
	    i_110_ = anInt7022 - i_106_;
	    anInt7028
		= (int) Math.sqrt((double) (i_108_ * i_108_ + i_109_ * i_109_
					    + i_110_ * i_110_));
	    if (anInt7028 == 0)
		anInt7028 = 1;
	    i_108_ = (i_108_ << 8) / anInt7028;
	    i_109_ = (i_109_ << 8) / anInt7028;
	    i_110_ = (i_110_ << 8) / anInt7028;
	} else {
	    anInt7028 = 1073741823;
	    i_108_ = anInt7043;
	    i_109_ = anInt7021;
	    i_110_ = anInt7022;
	}
	int i_111_
	    = (int) (Math.sqrt((double) (i_108_ * i_108_ + i_109_ * i_109_
					 + i_110_ * i_110_))
		     * 256.0);
	if (i_111_ > 128) {
	    i_108_ = (i_108_ << 16) / i_111_;
	    i_109_ = (i_109_ << 16) / i_111_;
	    i_110_ = (i_110_ << 16) / i_111_;
	    anInt7030 = anInt7019 * i_107_ / (aBool7044 ? 1024 : anInt7028);
	} else
	    anInt7030 = 0;
	if (anInt7030 < 8) {
	    aClass163_7042 = null;
	    return false;
	}
	int i_112_ = Class162.method2640(anInt7030, (byte) 91);
	if (i_112_ > i_107_)
	    i_112_ = Class455.method7422(i_107_, -366627995);
	if (i_112_ > 512)
	    i_112_ = 512;
	if (i_112_ != anInt7029)
	    anInt7029 = i_112_;
	anInt7027 = (int) (Math.asin((double) ((float) i_109_ / 256.0F))
			   * 2607.5945876176133) & 0x3fff;
	anInt7014 = (int) (Math.atan2((double) i_108_, (double) -i_110_)
			   * 2607.5945876176133) & 0x3fff;
	aClass163_7042 = null;
	return true;
    }
    
    boolean method8604(int i, int i_113_, int i_114_, int i_115_) {
	int i_116_;
	int i_117_;
	int i_118_;
	if (!aBool7044) {
	    i_116_ = anInt7043 - i;
	    i_117_ = anInt7021 - i_113_;
	    i_118_ = anInt7022 - i_114_;
	    anInt7028
		= (int) Math.sqrt((double) (i_116_ * i_116_ + i_117_ * i_117_
					    + i_118_ * i_118_));
	    if (anInt7028 == 0)
		anInt7028 = 1;
	    i_116_ = (i_116_ << 8) / anInt7028;
	    i_117_ = (i_117_ << 8) / anInt7028;
	    i_118_ = (i_118_ << 8) / anInt7028;
	} else {
	    anInt7028 = 1073741823;
	    i_116_ = anInt7043;
	    i_117_ = anInt7021;
	    i_118_ = anInt7022;
	}
	int i_119_
	    = (int) (Math.sqrt((double) (i_116_ * i_116_ + i_117_ * i_117_
					 + i_118_ * i_118_))
		     * 256.0);
	if (i_119_ > 128) {
	    i_116_ = (i_116_ << 16) / i_119_;
	    i_117_ = (i_117_ << 16) / i_119_;
	    i_118_ = (i_118_ << 16) / i_119_;
	    anInt7030 = anInt7019 * i_115_ / (aBool7044 ? 1024 : anInt7028);
	} else
	    anInt7030 = 0;
	if (anInt7030 < 8) {
	    aClass163_7042 = null;
	    return false;
	}
	int i_120_ = Class162.method2640(anInt7030, (byte) 103);
	if (i_120_ > i_115_)
	    i_120_ = Class455.method7422(i_115_, 239036189);
	if (i_120_ > 512)
	    i_120_ = 512;
	if (i_120_ != anInt7029)
	    anInt7029 = i_120_;
	anInt7027 = (int) (Math.asin((double) ((float) i_117_ / 256.0F))
			   * 2607.5945876176133) & 0x3fff;
	anInt7014 = (int) (Math.atan2((double) i_116_, (double) -i_118_)
			   * 2607.5945876176133) & 0x3fff;
	aClass163_7042 = null;
	return true;
    }
    
    boolean method8605(Class185 class185, Class516 class516_121_) {
	return aClass163_7042 != null || method8595(class185, class516_121_);
    }
    
    void method8606(Class185 class185, int i, int i_122_, int i_123_,
		    int i_124_, int i_125_, int i_126_, int i_127_, int i_128_,
		    int i_129_, int i_130_) {
	if (aClass163_7042 != null) {
	    float[] fs = new float[3];
	    float f = (float) -(anInt7043 - i_127_ << 16);
	    float f_131_ = (float) (anInt7021 - i_128_ << 15);
	    float f_132_ = (float) -(anInt7022 - i_129_ << 16);
	    float[] fs_133_ = new float[3];
	    class185.method3532().method7259(fs_133_);
	    f += fs_133_[0];
	    f_131_ += fs_133_[1];
	    f_132_ += fs_133_[2];
	    class185.method3367(f, f_131_, f_132_, fs);
	    if (!(fs[2] < 0.0F)) {
		int i_134_ = (int) (fs[0] - (float) (anInt7030 / 2));
		int i_135_ = (int) (fs[1] - (float) (anInt7030 / 2));
		if (i_135_ < i_124_ && i_135_ + anInt7030 > 0
		    && i_134_ < i_123_ && i_134_ + anInt7030 > 0)
		    aClass163_7042.method2660(i_134_, i_135_, anInt7030,
					      anInt7030, 0,
					      i_130_ << 24 | 0xffffff, 1);
	    }
	}
    }
    
    void method8607(Class185 class185, int i, int i_136_, int i_137_,
		    int i_138_, int i_139_, int i_140_, int i_141_, int i_142_,
		    int i_143_, int i_144_) {
	if (aClass163_7042 != null) {
	    float[] fs = new float[3];
	    float f = (float) -(anInt7043 - i_141_ << 16);
	    float f_145_ = (float) (anInt7021 - i_142_ << 15);
	    float f_146_ = (float) -(anInt7022 - i_143_ << 16);
	    float[] fs_147_ = new float[3];
	    class185.method3532().method7259(fs_147_);
	    f += fs_147_[0];
	    f_145_ += fs_147_[1];
	    f_146_ += fs_147_[2];
	    class185.method3367(f, f_145_, f_146_, fs);
	    if (!(fs[2] < 0.0F)) {
		int i_148_ = (int) (fs[0] - (float) (anInt7030 / 2));
		int i_149_ = (int) (fs[1] - (float) (anInt7030 / 2));
		if (i_149_ < i_138_ && i_149_ + anInt7030 > 0
		    && i_148_ < i_137_ && i_148_ + anInt7030 > 0)
		    aClass163_7042.method2660(i_148_, i_149_, anInt7030,
					      anInt7030, 0,
					      i_144_ << 24 | 0xffffff, 1);
	    }
	}
    }
    
    void method8608(Class185 class185, Class516 class516_150_) {
	method8598(class185);
	method8599(class185);
	class185.method3360(anIntArray7020);
	class185.method3373(0, 0, anInt7029, anInt7029);
	class185.method3340(2, 0);
	class185.method3298(0, 0, anInt7029, anInt7029, ~0xffffff | anInt7025,
			    0);
	int i = 0;
	int i_151_ = 0;
	int i_152_ = 256;
	if (class516_150_ != null) {
	    if (class516_150_.aBool7044) {
		i = -class516_150_.anInt7043;
		i_151_ = -class516_150_.anInt7021;
		i_152_ = -class516_150_.anInt7022;
	    } else {
		i = class516_150_.anInt7043 - anInt7043;
		i_151_ = class516_150_.anInt7021 - anInt7021;
		i_152_ = class516_150_.anInt7022 - anInt7022;
	    }
	}
	if (anInt7027 != 0) {
	    int i_153_ = Class427.anIntArray4806[anInt7027];
	    int i_154_ = Class427.anIntArray4805[anInt7027];
	    int i_155_ = i_151_ * i_154_ - i_152_ * i_153_ >> 14;
	    i_152_ = i_151_ * i_153_ + i_152_ * i_154_ >> 14;
	    i_151_ = i_155_;
	}
	if (anInt7014 != 0) {
	    int i_156_ = Class427.anIntArray4806[anInt7014];
	    int i_157_ = Class427.anIntArray4805[anInt7014];
	    int i_158_ = i_152_ * i_156_ + i * i_157_ >> 14;
	    i_152_ = i_152_ * i_157_ - i * i_156_ >> 14;
	    i = i_158_;
	}
	Class183 class183 = aClass183_7041.method3011((byte) 0, 51200, true);
	class183.method3118((short) 0, (short) anInt7031);
	class185.method3489(1.0F);
	class185.method3341(16777215, 1.0F, 1.0F, (float) i, (float) i_151_,
			    (float) i_152_);
	int i_159_ = (1024 * anInt7029
		      / (class183.method3043() - class183.method3134()));
	if (anInt7025 != 0)
	    i_159_ = i_159_ * 13 / 16;
	Class433 class433 = class185.method3339();
	Class433 class433_160_ = class185.method3518();
	class433_160_.method6951
	    ((float) (anInt7029 / 2), (float) (anInt7029 / 2), (float) i_159_,
	     (float) i_159_, 50.0F, 50000.0F,
	     (float) class185.method3253(-2026765767).method2910(),
	     (float) class185.method3253(-2127287707).method2911(), 1024.0F);
	class185.method3338(class433_160_);
	class185.method3335(new Class446());
	Class446 class446 = new Class446();
	class446.method7250(0.0F, 0.0F, (float) (50 - class183.method3047()));
	class183.method3034(class446, null, 1);
	int i_161_ = anInt7029 * 13 / 16;
	int i_162_ = (anInt7029 - i_161_) / 2;
	aClass163_7038.method2660(i_162_, i_162_, i_161_, i_161_, 0,
				  ~0xffffff | anInt7025, 1);
	aClass163_7042 = class185.method3319(0, 0, anInt7029, anInt7029, true);
	class185.method3340(2, 0);
	class185.method3298(0, 0, anInt7029, anInt7029, 0, 0);
	aClass163_7023.method2660(0, 0, anInt7029, anInt7029, 1, 0, 0);
	aClass163_7042.method2655(0, 0, 3);
	class185.method3338(class433);
	class185.method3373(anIntArray7020[0], anIntArray7020[1],
			    anIntArray7020[2], anIntArray7020[3]);
    }
    
    boolean method8609(Class185 class185, Class516 class516_163_) {
	if (aClass163_7042 == null) {
	    if (anInt7018 == 0) {
		if (Class304.anInterface25_3263.method155
		    (Class598.aClass598_7865, anInt7031,
		     Class613.aClass613_8023, 0.7F, anInt7029, anInt7029,
		     false, -618218007)) {
		    int[] is = (Class304.anInterface25_3263.method150
				(Class598.aClass598_7865, anInt7031, 0.7F,
				 anInt7029, anInt7029, false, -883337776));
		    aClass163_7042
			= class185.method3317(is, 0, anInt7029, anInt7029,
					      anInt7029, (byte) -15);
		}
	    } else if (anInt7018 == 2)
		method8596(class185, class516_163_);
	    else if (anInt7018 == 1)
		method8597(class185, class516_163_);
	}
	return aClass163_7042 != null;
    }
    
    void method8610(Class185 class185, Class516 class516_164_) {
	Class187 class187
	    = Class187.method3709(Class459.aClass472_4980, anInt7031, 0);
	if (class187 != null) {
	    class185.method3360(anIntArray7020);
	    class185.method3373(0, 0, anInt7029, anInt7029);
	    class185.method3340(2, 0);
	    class185.method3298(0, 0, anInt7029, anInt7029, 0, 0);
	    int i = 0;
	    int i_165_ = 0;
	    int i_166_ = 256;
	    if (class516_164_ != null) {
		if (class516_164_.aBool7044) {
		    i = -class516_164_.anInt7043;
		    i_165_ = -class516_164_.anInt7021;
		    i_166_ = -class516_164_.anInt7022;
		} else {
		    i = anInt7043 - class516_164_.anInt7043;
		    i_165_ = anInt7021 - class516_164_.anInt7021;
		    i_166_ = anInt7022 - class516_164_.anInt7022;
		}
	    }
	    if (anInt7027 != 0) {
		int i_167_ = -anInt7027 & 0x3fff;
		int i_168_ = Class427.anIntArray4806[i_167_];
		int i_169_ = Class427.anIntArray4805[i_167_];
		int i_170_ = i_165_ * i_169_ - i_166_ * i_168_ >> 14;
		i_166_ = i_165_ * i_168_ + i_166_ * i_169_ >> 14;
		i_165_ = i_170_;
	    }
	    if (anInt7014 != 0) {
		int i_171_ = -anInt7014 & 0x3fff;
		int i_172_ = Class427.anIntArray4806[i_171_];
		int i_173_ = Class427.anIntArray4805[i_171_];
		int i_174_ = i_166_ * i_172_ + i * i_173_ >> 14;
		i_166_ = i_166_ * i_173_ - i * i_172_ >> 14;
		i = i_174_;
	    }
	    class185.method3489(1.0F);
	    class185.method3341(anInt7025, 1.0F, 1.0F, (float) i,
				(float) i_165_, (float) i_166_);
	    class187.method3724(anInt7032 & 0x3fff, anInt7033 & 0x3fff,
				anInt7034 & 0x3fff);
	    Class183 class183
		= class185.method3329(class187, 2048, 0, 64, 768);
	    int i_175_ = class183.method3043() - class183.method3134();
	    int i_176_ = class183.method3046() - class183.method3045();
	    int i_177_ = i_175_ > i_176_ ? i_175_ : i_176_;
	    int i_178_ = 1024 * anInt7029 / i_177_;
	    Class433 class433 = class185.method3339();
	    Class433 class433_179_ = class185.method3518();
	    class433_179_.method6951((float) (anInt7029 / 2),
				     (float) (anInt7029 / 2), (float) i_178_,
				     (float) i_178_, 50.0F, 50000.0F,
				     (float) class185.method3253(-179157)
						 .method2910(),
				     (float) class185.method3253
						 (-667439862).method2911(),
				     1024.0F);
	    class185.method3338(class433_179_);
	    Class446 class446 = new Class446();
	    class185.method3335(class446);
	    Class446 class446_180_ = class185.method3665();
	    class446_180_.method7250(0.0F, 0.0F,
				     (float) (50 - class183.method3047()));
	    class183.method3034(class446_180_, null, 1);
	    aClass163_7042
		= class185.method3319(0, 0, anInt7029, anInt7029, true);
	    aClass163_7042.method2655(0, 0, 3);
	    class185.method3338(class433);
	    class185.method3373(anIntArray7020[0], anIntArray7020[1],
				anIntArray7020[2], anIntArray7020[3]);
	}
    }
    
    boolean method8611(int i, int i_181_, int i_182_, int i_183_) {
	int i_184_;
	int i_185_;
	int i_186_;
	if (!aBool7044) {
	    i_184_ = anInt7043 - i;
	    i_185_ = anInt7021 - i_181_;
	    i_186_ = anInt7022 - i_182_;
	    anInt7028
		= (int) Math.sqrt((double) (i_184_ * i_184_ + i_185_ * i_185_
					    + i_186_ * i_186_));
	    if (anInt7028 == 0)
		anInt7028 = 1;
	    i_184_ = (i_184_ << 8) / anInt7028;
	    i_185_ = (i_185_ << 8) / anInt7028;
	    i_186_ = (i_186_ << 8) / anInt7028;
	} else {
	    anInt7028 = 1073741823;
	    i_184_ = anInt7043;
	    i_185_ = anInt7021;
	    i_186_ = anInt7022;
	}
	int i_187_
	    = (int) (Math.sqrt((double) (i_184_ * i_184_ + i_185_ * i_185_
					 + i_186_ * i_186_))
		     * 256.0);
	if (i_187_ > 128) {
	    i_184_ = (i_184_ << 16) / i_187_;
	    i_185_ = (i_185_ << 16) / i_187_;
	    i_186_ = (i_186_ << 16) / i_187_;
	    anInt7030 = anInt7019 * i_183_ / (aBool7044 ? 1024 : anInt7028);
	} else
	    anInt7030 = 0;
	if (anInt7030 < 8) {
	    aClass163_7042 = null;
	    return false;
	}
	int i_188_ = Class162.method2640(anInt7030, (byte) 35);
	if (i_188_ > i_183_)
	    i_188_ = Class455.method7422(i_183_, -1310810144);
	if (i_188_ > 512)
	    i_188_ = 512;
	if (i_188_ != anInt7029)
	    anInt7029 = i_188_;
	anInt7027 = (int) (Math.asin((double) ((float) i_185_ / 256.0F))
			   * 2607.5945876176133) & 0x3fff;
	anInt7014 = (int) (Math.atan2((double) i_184_, (double) -i_186_)
			   * 2607.5945876176133) & 0x3fff;
	aClass163_7042 = null;
	return true;
    }
    
    static void method8612(Class185 class185) {
	if (aClass183_7041 == null) {
	    Class187 class187 = new Class187(580, 1104, 1);
	    class187.method3725((short) 0, (short) 32767, (short) 0,
				(short) 1024, (short) 1024, (short) 1024,
				(byte) 0, (byte) 0, (byte) 0);
	    class187.method3712(0, 128, 0);
	    class187.method3712(0, -128, 0);
	    for (int i = 0; i <= 24; i++) {
		int i_189_ = i * 8192 / 24;
		int i_190_ = Class427.anIntArray4806[i_189_];
		int i_191_ = Class427.anIntArray4805[i_189_];
		for (int i_192_ = 1; i_192_ < 24; i_192_++) {
		    int i_193_ = i_192_ * 8192 / 24;
		    int i_194_ = Class427.anIntArray4805[i_193_] >> 7;
		    int i_195_
			= Class427.anIntArray4806[i_193_] * i_190_ >> 21;
		    int i_196_
			= Class427.anIntArray4806[i_193_] * i_191_ >> 21;
		    class187.method3712(i_196_, i_194_, -i_195_);
		}
		if (i > 0) {
		    int i_197_ = i * 23 + 2;
		    int i_198_ = i_197_ - 23;
		    class187.method3713(0, i_198_, i_197_, (byte) 0, (byte) 0,
					(short) 127, (byte) 0, (short) 0);
		    for (int i_199_ = 1; i_199_ < 23; i_199_++) {
			int i_200_ = i_198_ + 1;
			int i_201_ = i_197_ + 1;
			class187.method3713(i_198_, i_200_, i_197_, (byte) 0,
					    (byte) 0, (short) 127, (byte) 0,
					    (short) 0);
			class187.method3713(i_200_, i_201_, i_197_, (byte) 0,
					    (byte) 0, (short) 127, (byte) 0,
					    (short) 0);
			i_198_ = i_200_;
			i_197_ = i_201_;
		    }
		    class187.method3713(i_197_, i_198_, 1, (byte) 0, (byte) 0,
					(short) 127, (byte) 0, (short) 0);
		}
	    }
	    class187.anInt2106 = class187.anInt2081;
	    class187.anIntArray2090 = null;
	    class187.anIntArray2087 = null;
	    class187.aByteArray2100 = null;
	    aClass183_7041 = class185.method3329(class187, 51200, 33, 64, 768);
	}
    }
    
    void method8613(Class185 class185, Class516 class516_202_) {
	Class187 class187
	    = Class187.method3709(Class459.aClass472_4980, anInt7031, 0);
	if (class187 != null) {
	    class185.method3360(anIntArray7020);
	    class185.method3373(0, 0, anInt7029, anInt7029);
	    class185.method3340(2, 0);
	    class185.method3298(0, 0, anInt7029, anInt7029, 0, 0);
	    int i = 0;
	    int i_203_ = 0;
	    int i_204_ = 256;
	    if (class516_202_ != null) {
		if (class516_202_.aBool7044) {
		    i = -class516_202_.anInt7043;
		    i_203_ = -class516_202_.anInt7021;
		    i_204_ = -class516_202_.anInt7022;
		} else {
		    i = anInt7043 - class516_202_.anInt7043;
		    i_203_ = anInt7021 - class516_202_.anInt7021;
		    i_204_ = anInt7022 - class516_202_.anInt7022;
		}
	    }
	    if (anInt7027 != 0) {
		int i_205_ = -anInt7027 & 0x3fff;
		int i_206_ = Class427.anIntArray4806[i_205_];
		int i_207_ = Class427.anIntArray4805[i_205_];
		int i_208_ = i_203_ * i_207_ - i_204_ * i_206_ >> 14;
		i_204_ = i_203_ * i_206_ + i_204_ * i_207_ >> 14;
		i_203_ = i_208_;
	    }
	    if (anInt7014 != 0) {
		int i_209_ = -anInt7014 & 0x3fff;
		int i_210_ = Class427.anIntArray4806[i_209_];
		int i_211_ = Class427.anIntArray4805[i_209_];
		int i_212_ = i_204_ * i_210_ + i * i_211_ >> 14;
		i_204_ = i_204_ * i_211_ - i * i_210_ >> 14;
		i = i_212_;
	    }
	    class185.method3489(1.0F);
	    class185.method3341(anInt7025, 1.0F, 1.0F, (float) i,
				(float) i_203_, (float) i_204_);
	    class187.method3724(anInt7032 & 0x3fff, anInt7033 & 0x3fff,
				anInt7034 & 0x3fff);
	    Class183 class183
		= class185.method3329(class187, 2048, 0, 64, 768);
	    int i_213_ = class183.method3043() - class183.method3134();
	    int i_214_ = class183.method3046() - class183.method3045();
	    int i_215_ = i_213_ > i_214_ ? i_213_ : i_214_;
	    int i_216_ = 1024 * anInt7029 / i_215_;
	    Class433 class433 = class185.method3339();
	    Class433 class433_217_ = class185.method3518();
	    class433_217_.method6951((float) (anInt7029 / 2),
				     (float) (anInt7029 / 2), (float) i_216_,
				     (float) i_216_, 50.0F, 50000.0F,
				     (float) class185.method3253
						 (-1790916916).method2910(),
				     (float) class185.method3253
						 (-872701758).method2911(),
				     1024.0F);
	    class185.method3338(class433_217_);
	    Class446 class446 = new Class446();
	    class185.method3335(class446);
	    Class446 class446_218_ = class185.method3665();
	    class446_218_.method7250(0.0F, 0.0F,
				     (float) (50 - class183.method3047()));
	    class183.method3034(class446_218_, null, 1);
	    aClass163_7042
		= class185.method3319(0, 0, anInt7029, anInt7029, true);
	    aClass163_7042.method2655(0, 0, 3);
	    class185.method3338(class433);
	    class185.method3373(anIntArray7020[0], anIntArray7020[1],
				anIntArray7020[2], anIntArray7020[3]);
	}
    }
    
    static void method8614(Class185 class185) {
	if (aClass183_7041 == null) {
	    Class187 class187 = new Class187(580, 1104, 1);
	    class187.method3725((short) 0, (short) 32767, (short) 0,
				(short) 1024, (short) 1024, (short) 1024,
				(byte) 0, (byte) 0, (byte) 0);
	    class187.method3712(0, 128, 0);
	    class187.method3712(0, -128, 0);
	    for (int i = 0; i <= 24; i++) {
		int i_219_ = i * 8192 / 24;
		int i_220_ = Class427.anIntArray4806[i_219_];
		int i_221_ = Class427.anIntArray4805[i_219_];
		for (int i_222_ = 1; i_222_ < 24; i_222_++) {
		    int i_223_ = i_222_ * 8192 / 24;
		    int i_224_ = Class427.anIntArray4805[i_223_] >> 7;
		    int i_225_
			= Class427.anIntArray4806[i_223_] * i_220_ >> 21;
		    int i_226_
			= Class427.anIntArray4806[i_223_] * i_221_ >> 21;
		    class187.method3712(i_226_, i_224_, -i_225_);
		}
		if (i > 0) {
		    int i_227_ = i * 23 + 2;
		    int i_228_ = i_227_ - 23;
		    class187.method3713(0, i_228_, i_227_, (byte) 0, (byte) 0,
					(short) 127, (byte) 0, (short) 0);
		    for (int i_229_ = 1; i_229_ < 23; i_229_++) {
			int i_230_ = i_228_ + 1;
			int i_231_ = i_227_ + 1;
			class187.method3713(i_228_, i_230_, i_227_, (byte) 0,
					    (byte) 0, (short) 127, (byte) 0,
					    (short) 0);
			class187.method3713(i_230_, i_231_, i_227_, (byte) 0,
					    (byte) 0, (short) 127, (byte) 0,
					    (short) 0);
			i_228_ = i_230_;
			i_227_ = i_231_;
		    }
		    class187.method3713(i_227_, i_228_, 1, (byte) 0, (byte) 0,
					(short) 127, (byte) 0, (short) 0);
		}
	    }
	    class187.anInt2106 = class187.anInt2081;
	    class187.anIntArray2090 = null;
	    class187.anIntArray2087 = null;
	    class187.aByteArray2100 = null;
	    aClass183_7041 = class185.method3329(class187, 51200, 33, 64, 768);
	}
    }
    
    static void method8615(Class185 class185) {
	if (aClass163_7023 == null) {
	    int[] is = new int[16384];
	    int[] is_232_ = new int[16384];
	    for (int i = 0; i < 64; i++) {
		int i_233_ = 64 - i;
		i_233_ *= i_233_;
		int i_234_ = 128 - i - 1;
		int i_235_ = i * 128;
		int i_236_ = i_234_ * 128;
		for (int i_237_ = 0; i_237_ < 64; i_237_++) {
		    int i_238_ = 64 - i_237_;
		    i_238_ *= i_238_;
		    int i_239_ = 128 - i_237_ - 1;
		    int i_240_ = 256 - (i_238_ + i_233_ << 8) / 4096;
		    i_240_ = i_240_ * 3072 / 1536;
		    if (i_240_ < 0)
			i_240_ = 0;
		    else if (i_240_ > 255)
			i_240_ = 255;
		    int i_241_ = i_240_ / 2;
		    is_232_[i_235_ + i_237_] = is_232_[i_235_ + i_239_]
			= is_232_[i_236_ + i_237_] = is_232_[i_236_ + i_239_]
			= ~0xffffff | i_240_ << 16;
		    is[i_235_ + i_237_] = is[i_235_ + i_239_]
			= is[i_236_ + i_237_] = is[i_236_ + i_239_]
			= 127 - i_241_ << 24 | 0xffffff;
		}
	    }
	    aClass163_7023
		= class185.method3317(is_232_, 0, 128, 128, 128, (byte) 84);
	    aClass163_7038
		= class185.method3317(is, 0, 128, 128, 128, (byte) -43);
	}
    }
}
