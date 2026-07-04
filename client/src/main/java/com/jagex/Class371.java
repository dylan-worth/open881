/* Class371 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class371
{
    Class353 aClass353_3875 = Class353.aClass353_3654;
    int anInt3876 = 128;
    Class353 aClass353_3877;
    Class349 aClass349_3878;
    int anInt3879 = 0;
    float[] aFloatArray3880 = new float[anInt3876 * 16];
    Interface38[] anInterface38Array3881 = new Interface38[anInt3876];
    int[] anIntArray3882 = new int[anInt3876];
    int anInt3883;
    Interface37 anInterface37_3884;
    Interface39 anInterface39_3885;
    Class185_Sub1 aClass185_Sub1_3886;
    int[] anIntArray3887 = new int[4];
    
    void method6381() {
	if (anInt3879 == anInt3876) {
	    anInt3876 *= 2;
	    float[] fs = new float[anInt3876 * 16];
	    for (int i = 0; i < anInt3879 * 16; i++)
		fs[i] = aFloatArray3880[i];
	    aFloatArray3880 = fs;
	    Interface38[] interface38s = new Interface38[anInt3876];
	    int[] is = new int[anInt3876];
	    for (int i = 0; i < anInt3879; i++) {
		interface38s[i] = anInterface38Array3881[i];
		is[i] = anIntArray3882[i];
	    }
	    anInterface38Array3881 = interface38s;
	    anIntArray3882 = is;
	}
    }
    
    void method6382() {
	anInterface37_3884.method142();
	anInterface39_3885.method142();
	anInterface37_3884 = null;
	anInterface39_3885 = null;
	aClass349_3878 = null;
	anInt3879 = 0;
    }
    
    void method6383() {
	if (anInt3879 != 0) {
	    aClass185_Sub1_3886.method14711();
	    aClass185_Sub1_3886.method14687(1);
	    aClass185_Sub1_3886.method14701(anInterface39_3885);
	    aClass185_Sub1_3886.method14733(0, anInterface37_3884);
	    aClass185_Sub1_3886.method14700(aClass349_3878);
	    Class314 class314 = aClass185_Sub1_3886.aClass314_9233;
	    Unsafe unsafe = aClass185_Sub1_3886.anUnsafe9127;
	    ByteBuffer bytebuffer = aClass185_Sub1_3886.aByteBuffer9266;
	    bytebuffer.clear();
	    aClass185_Sub1_3886.method14679()
		.method6842(Class433.aClass433_4854);
	    aClass185_Sub1_3886.method14871(Class364.aClass364_3724);
	    int i = (anInt3879 + anInt3883 - 1) / anInt3883;
	    int i_0_ = 0;
	    int i_1_ = 0;
	    for (int i_2_ = 0; i_2_ < i; i_2_++) {
		int i_3_ = Math.min(anInt3883, anInt3879 - i_0_);
		long l = anInterface37_3884.method227(0, i_3_ * 96);
		int i_4_ = i_2_ * anInt3883 + i_3_;
		for (int i_5_ = i_0_; i_5_ < i_4_; i_5_++) {
		    for (int i_6_ = 0; i_6_ < 4; i_6_++) {
			unsafe.putFloat(l, aFloatArray3880[i_1_++]);
			l += 4L;
			unsafe.putFloat(l, aFloatArray3880[i_1_++]);
			l += 4L;
			unsafe.putFloat(l, 0.0F);
			l += 4L;
			unsafe.putFloat(l, aFloatArray3880[i_1_++]);
			l += 4L;
			unsafe.putFloat(l, aFloatArray3880[i_1_++]);
			l += 4L;
			unsafe.putInt(l, anIntArray3882[i_5_]);
			l += 4L;
		    }
		}
		anInterface37_3884.method228();
		Interface38 interface38 = anInterface38Array3881[i_0_];
		int i_7_ = 1;
		int i_8_ = 0;
		for (int i_9_ = i_0_ + 1; i_9_ < i_4_; i_9_++) {
		    if (interface38 == anInterface38Array3881[i_9_])
			i_7_++;
		    else {
			class314.anInterface38_3375 = interface38;
			class314.method5693();
			aClass185_Sub1_3886.method14709(anInterface39_3885,
							(Class374
							 .aClass374_3898),
							i_8_ * 4, i_7_ * 4,
							i_8_ * 6, i_7_ * 2);
			interface38 = anInterface38Array3881[i_9_];
			i_7_ = 1;
			i_8_ = i_9_ - i_0_;
		    }
		}
		class314.anInterface38_3375 = interface38;
		class314.method5693();
		aClass185_Sub1_3886.method14709(anInterface39_3885,
						Class374.aClass374_3898,
						i_8_ * 4, i_7_ * 4, i_8_ * 6,
						i_7_ * 2);
		i_0_ += anInt3883;
	    }
	    anInt3879 = 0;
	}
    }
    
    void method6384(float f, float f_10_, float f_11_, float f_12_,
		    float f_13_, float f_14_, float f_15_, float f_16_,
		    Interface38 interface38, int i) {
	if ((i & ~0xffffff) != 0) {
	    aClass185_Sub1_3886.method3360(anIntArray3887);
	    int i_17_ = anIntArray3887[0];
	    int i_18_ = anIntArray3887[1];
	    int i_19_ = anIntArray3887[2];
	    int i_20_ = anIntArray3887[3];
	    if (!(f > (float) i_19_) && !(f_10_ > (float) i_20_)
		&& !(f_11_ < (float) i_17_) && !(f_12_ < (float) i_18_)) {
		float f_21_ = f_11_ - f;
		float f_22_ = f_12_ - f_10_;
		float f_23_ = f_15_ - f_13_;
		float f_24_ = f_16_ - f_14_;
		if (f < (float) i_17_) {
		    f_13_ += ((float) i_17_ - f) / f_21_ * f_23_;
		    f = (float) i_17_;
		}
		if (f_10_ < (float) i_18_) {
		    f_14_ += ((float) i_18_ - f_10_) / f_22_ * f_24_;
		    f_10_ = (float) i_18_;
		}
		if (f_11_ > (float) i_19_) {
		    f_15_ -= (f_11_ - (float) i_19_) / f_21_ * f_23_;
		    f_11_ = (float) i_19_;
		}
		if (f_12_ > (float) i_20_) {
		    f_16_ -= (f_12_ - (float) i_20_) / f_22_ * f_24_;
		    f_12_ = (float) i_20_;
		}
		method6386();
		f = method6385(f);
		f_10_ = method6388(f_10_);
		f_11_ = method6385(f_11_);
		f_12_ = method6388(f_12_);
		aFloatArray3880[anInt3879 * 16 + 0] = f;
		aFloatArray3880[anInt3879 * 16 + 1] = f_10_;
		aFloatArray3880[anInt3879 * 16 + 2] = f_13_;
		aFloatArray3880[anInt3879 * 16 + 3] = f_14_;
		aFloatArray3880[anInt3879 * 16 + 4] = f_11_;
		aFloatArray3880[anInt3879 * 16 + 5] = f_10_;
		aFloatArray3880[anInt3879 * 16 + 6] = f_15_;
		aFloatArray3880[anInt3879 * 16 + 7] = f_14_;
		aFloatArray3880[anInt3879 * 16 + 8] = f;
		aFloatArray3880[anInt3879 * 16 + 9] = f_12_;
		aFloatArray3880[anInt3879 * 16 + 10] = f_13_;
		aFloatArray3880[anInt3879 * 16 + 11] = f_16_;
		aFloatArray3880[anInt3879 * 16 + 12] = f_11_;
		aFloatArray3880[anInt3879 * 16 + 13] = f_12_;
		aFloatArray3880[anInt3879 * 16 + 14] = f_15_;
		aFloatArray3880[anInt3879 * 16 + 15] = f_16_;
		anInterface38Array3881[anInt3879] = interface38;
		if (aClass185_Sub1_3886.anInt9268 == 1)
		    anIntArray3882[anInt3879]
			= ~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff;
		else
		    anIntArray3882[anInt3879] = i;
		anInt3879++;
		if (aClass353_3875 == Class353.aClass353_3656)
		    method6383();
	    }
	}
    }
    
    float method6385(float f) {
	int i = aClass185_Sub1_3886.method3253(-2052728469).method2910();
	float f_25_
	    = ((f + aClass185_Sub1_3886.method14715()) / (float) i * 2.0F
	       - 1.0F);
	return f_25_;
    }
    
    void method6386() {
	if (anInt3879 == anInt3876) {
	    anInt3876 *= 2;
	    float[] fs = new float[anInt3876 * 16];
	    for (int i = 0; i < anInt3879 * 16; i++)
		fs[i] = aFloatArray3880[i];
	    aFloatArray3880 = fs;
	    Interface38[] interface38s = new Interface38[anInt3876];
	    int[] is = new int[anInt3876];
	    for (int i = 0; i < anInt3879; i++) {
		interface38s[i] = anInterface38Array3881[i];
		is[i] = anIntArray3882[i];
	    }
	    anInterface38Array3881 = interface38s;
	    anIntArray3882 = is;
	}
    }
    
    void method6387() {
	aClass353_3877 = aClass353_3875;
	aClass353_3875 = Class353.aClass353_3655;
    }
    
    float method6388(float f) {
	int i = aClass185_Sub1_3886.method3253(-1019070477).method2911();
	float f_26_
	    = (((1.0F - (f + aClass185_Sub1_3886.method14715()) / (float) i)
		* 2.0F)
	       - 1.0F);
	return f_26_;
    }
    
    void method6389() {
	if (anInt3879 != 0) {
	    aClass185_Sub1_3886.method14711();
	    aClass185_Sub1_3886.method14687(1);
	    aClass185_Sub1_3886.method14701(anInterface39_3885);
	    aClass185_Sub1_3886.method14733(0, anInterface37_3884);
	    aClass185_Sub1_3886.method14700(aClass349_3878);
	    Class314 class314 = aClass185_Sub1_3886.aClass314_9233;
	    Unsafe unsafe = aClass185_Sub1_3886.anUnsafe9127;
	    ByteBuffer bytebuffer = aClass185_Sub1_3886.aByteBuffer9266;
	    bytebuffer.clear();
	    aClass185_Sub1_3886.method14679()
		.method6842(Class433.aClass433_4854);
	    aClass185_Sub1_3886.method14871(Class364.aClass364_3724);
	    int i = (anInt3879 + anInt3883 - 1) / anInt3883;
	    int i_27_ = 0;
	    int i_28_ = 0;
	    for (int i_29_ = 0; i_29_ < i; i_29_++) {
		int i_30_ = Math.min(anInt3883, anInt3879 - i_27_);
		long l = anInterface37_3884.method227(0, i_30_ * 96);
		int i_31_ = i_29_ * anInt3883 + i_30_;
		for (int i_32_ = i_27_; i_32_ < i_31_; i_32_++) {
		    for (int i_33_ = 0; i_33_ < 4; i_33_++) {
			unsafe.putFloat(l, aFloatArray3880[i_28_++]);
			l += 4L;
			unsafe.putFloat(l, aFloatArray3880[i_28_++]);
			l += 4L;
			unsafe.putFloat(l, 0.0F);
			l += 4L;
			unsafe.putFloat(l, aFloatArray3880[i_28_++]);
			l += 4L;
			unsafe.putFloat(l, aFloatArray3880[i_28_++]);
			l += 4L;
			unsafe.putInt(l, anIntArray3882[i_32_]);
			l += 4L;
		    }
		}
		anInterface37_3884.method228();
		Interface38 interface38 = anInterface38Array3881[i_27_];
		int i_34_ = 1;
		int i_35_ = 0;
		for (int i_36_ = i_27_ + 1; i_36_ < i_31_; i_36_++) {
		    if (interface38 == anInterface38Array3881[i_36_])
			i_34_++;
		    else {
			class314.anInterface38_3375 = interface38;
			class314.method5693();
			aClass185_Sub1_3886.method14709(anInterface39_3885,
							(Class374
							 .aClass374_3898),
							i_35_ * 4, i_34_ * 4,
							i_35_ * 6, i_34_ * 2);
			interface38 = anInterface38Array3881[i_36_];
			i_34_ = 1;
			i_35_ = i_36_ - i_27_;
		    }
		}
		class314.anInterface38_3375 = interface38;
		class314.method5693();
		aClass185_Sub1_3886.method14709(anInterface39_3885,
						Class374.aClass374_3898,
						i_35_ * 4, i_34_ * 4,
						i_35_ * 6, i_34_ * 2);
		i_27_ += anInt3883;
	    }
	    anInt3879 = 0;
	}
    }
    
    void method6390() {
	if (aClass353_3877 != null) {
	    aClass353_3875 = aClass353_3877;
	    aClass353_3877 = null;
	}
    }
    
    void method6391() {
	aClass353_3877 = aClass353_3875;
	aClass353_3875 = Class353.aClass353_3655;
    }
    
    void method6392() {
	anInterface37_3884.method142();
	anInterface39_3885.method142();
	anInterface37_3884 = null;
	anInterface39_3885 = null;
	aClass349_3878 = null;
	anInt3879 = 0;
    }
    
    void method6393() {
	if (anInt3879 == anInt3876) {
	    anInt3876 *= 2;
	    float[] fs = new float[anInt3876 * 16];
	    for (int i = 0; i < anInt3879 * 16; i++)
		fs[i] = aFloatArray3880[i];
	    aFloatArray3880 = fs;
	    Interface38[] interface38s = new Interface38[anInt3876];
	    int[] is = new int[anInt3876];
	    for (int i = 0; i < anInt3879; i++) {
		interface38s[i] = anInterface38Array3881[i];
		is[i] = anIntArray3882[i];
	    }
	    anInterface38Array3881 = interface38s;
	    anIntArray3882 = is;
	}
    }
    
    void method6394() {
	if (aClass353_3877 != null) {
	    aClass353_3875 = aClass353_3877;
	    aClass353_3877 = null;
	}
    }
    
    void method6395(float f, float f_37_, float f_38_, float f_39_,
		    float f_40_, float f_41_, float f_42_, float f_43_,
		    Interface38 interface38, int i) {
	if ((i & ~0xffffff) != 0) {
	    aClass185_Sub1_3886.method3360(anIntArray3887);
	    int i_44_ = anIntArray3887[0];
	    int i_45_ = anIntArray3887[1];
	    int i_46_ = anIntArray3887[2];
	    int i_47_ = anIntArray3887[3];
	    if (!(f > (float) i_46_) && !(f_37_ > (float) i_47_)
		&& !(f_38_ < (float) i_44_) && !(f_39_ < (float) i_45_)) {
		float f_48_ = f_38_ - f;
		float f_49_ = f_39_ - f_37_;
		float f_50_ = f_42_ - f_40_;
		float f_51_ = f_43_ - f_41_;
		if (f < (float) i_44_) {
		    f_40_ += ((float) i_44_ - f) / f_48_ * f_50_;
		    f = (float) i_44_;
		}
		if (f_37_ < (float) i_45_) {
		    f_41_ += ((float) i_45_ - f_37_) / f_49_ * f_51_;
		    f_37_ = (float) i_45_;
		}
		if (f_38_ > (float) i_46_) {
		    f_42_ -= (f_38_ - (float) i_46_) / f_48_ * f_50_;
		    f_38_ = (float) i_46_;
		}
		if (f_39_ > (float) i_47_) {
		    f_43_ -= (f_39_ - (float) i_47_) / f_49_ * f_51_;
		    f_39_ = (float) i_47_;
		}
		method6386();
		f = method6385(f);
		f_37_ = method6388(f_37_);
		f_38_ = method6385(f_38_);
		f_39_ = method6388(f_39_);
		aFloatArray3880[anInt3879 * 16 + 0] = f;
		aFloatArray3880[anInt3879 * 16 + 1] = f_37_;
		aFloatArray3880[anInt3879 * 16 + 2] = f_40_;
		aFloatArray3880[anInt3879 * 16 + 3] = f_41_;
		aFloatArray3880[anInt3879 * 16 + 4] = f_38_;
		aFloatArray3880[anInt3879 * 16 + 5] = f_37_;
		aFloatArray3880[anInt3879 * 16 + 6] = f_42_;
		aFloatArray3880[anInt3879 * 16 + 7] = f_41_;
		aFloatArray3880[anInt3879 * 16 + 8] = f;
		aFloatArray3880[anInt3879 * 16 + 9] = f_39_;
		aFloatArray3880[anInt3879 * 16 + 10] = f_40_;
		aFloatArray3880[anInt3879 * 16 + 11] = f_43_;
		aFloatArray3880[anInt3879 * 16 + 12] = f_38_;
		aFloatArray3880[anInt3879 * 16 + 13] = f_39_;
		aFloatArray3880[anInt3879 * 16 + 14] = f_42_;
		aFloatArray3880[anInt3879 * 16 + 15] = f_43_;
		anInterface38Array3881[anInt3879] = interface38;
		if (aClass185_Sub1_3886.anInt9268 == 1)
		    anIntArray3882[anInt3879]
			= ~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff;
		else
		    anIntArray3882[anInt3879] = i;
		anInt3879++;
		if (aClass353_3875 == Class353.aClass353_3656)
		    method6383();
	    }
	}
    }
    
    void method6396(float f, float f_52_, float f_53_, float f_54_,
		    float f_55_, float f_56_, float f_57_, float f_58_,
		    float f_59_, float f_60_, float f_61_, float f_62_,
		    float f_63_, float f_64_, float f_65_, float f_66_,
		    Interface38 interface38, int i) {
	if ((i & ~0xffffff) != 0) {
	    aClass185_Sub1_3886.method3360(anIntArray3887);
	    int i_67_ = anIntArray3887[0];
	    int i_68_ = anIntArray3887[1];
	    int i_69_ = anIntArray3887[2];
	    int i_70_ = anIntArray3887[3];
	    int i_71_ = 0;
	    int i_72_ = ((f < (float) i_67_ ? 1 : 0)
			 + (f_53_ < (float) i_67_ ? 1 : 0)
			 + (f_55_ < (float) i_67_ ? 1 : 0)
			 + (f_57_ < (float) i_67_ ? 1 : 0));
	    if (i_72_ != 4) {
		i_71_ |= i_72_;
		i_72_ = ((f > (float) i_69_ ? 1 : 0)
			 + (f_53_ > (float) i_69_ ? 1 : 0)
			 + (f_55_ > (float) i_69_ ? 1 : 0)
			 + (f_57_ > (float) i_69_ ? 1 : 0));
		if (i_72_ != 4) {
		    i_71_ |= i_72_;
		    i_72_ = ((f_52_ < (float) i_68_ ? 1 : 0)
			     + (f_54_ < (float) i_68_ ? 1 : 0)
			     + (f_56_ < (float) i_68_ ? 1 : 0)
			     + (f_58_ < (float) i_68_ ? 1 : 0));
		    if (i_72_ != 4) {
			i_71_ |= i_72_;
			i_72_ = ((f_52_ > (float) i_70_ ? 1 : 0)
				 + (f_54_ > (float) i_70_ ? 1 : 0)
				 + (f_56_ > (float) i_70_ ? 1 : 0)
				 + (f_58_ > (float) i_70_ ? 1 : 0));
			if (i_72_ != 4) {
			    i_71_ |= i_72_;
			    if (i_71_ != 0) {
				method6383();
				aClass185_Sub1_3886.method3237(true);
				aClass185_Sub1_3886.method3373(i_67_, i_68_,
							       i_69_, i_70_);
			    }
			    method6386();
			    f = method6385(f);
			    f_52_ = method6388(f_52_);
			    f_53_ = method6385(f_53_);
			    f_54_ = method6388(f_54_);
			    f_55_ = method6385(f_55_);
			    f_56_ = method6388(f_56_);
			    f_57_ = method6385(f_57_);
			    f_58_ = method6388(f_58_);
			    aFloatArray3880[anInt3879 * 16 + 0] = f;
			    aFloatArray3880[anInt3879 * 16 + 1] = f_52_;
			    aFloatArray3880[anInt3879 * 16 + 2] = f_59_;
			    aFloatArray3880[anInt3879 * 16 + 3] = f_60_;
			    aFloatArray3880[anInt3879 * 16 + 4] = f_53_;
			    aFloatArray3880[anInt3879 * 16 + 5] = f_54_;
			    aFloatArray3880[anInt3879 * 16 + 6] = f_61_;
			    aFloatArray3880[anInt3879 * 16 + 7] = f_62_;
			    aFloatArray3880[anInt3879 * 16 + 8] = f_55_;
			    aFloatArray3880[anInt3879 * 16 + 9] = f_56_;
			    aFloatArray3880[anInt3879 * 16 + 10] = f_63_;
			    aFloatArray3880[anInt3879 * 16 + 11] = f_64_;
			    aFloatArray3880[anInt3879 * 16 + 12] = f_57_;
			    aFloatArray3880[anInt3879 * 16 + 13] = f_58_;
			    aFloatArray3880[anInt3879 * 16 + 14] = f_65_;
			    aFloatArray3880[anInt3879 * 16 + 15] = f_66_;
			    anInterface38Array3881[anInt3879] = interface38;
			    if (aClass185_Sub1_3886.anInt9268 == 1)
				anIntArray3882[anInt3879]
				    = (~0xff00ff & i | (i & 0xff) << 16
				       | i >> 16 & 0xff);
			    else
				anIntArray3882[anInt3879] = i;
			    anInt3879++;
			    if (aClass353_3875 == Class353.aClass353_3656
				|| i_71_ > 0)
				method6383();
			    if (i_71_ != 0) {
				aClass185_Sub1_3886.method3237(false);
				aClass185_Sub1_3886.method3537();
				aClass185_Sub1_3886.method3373(i_67_, i_68_,
							       i_69_, i_70_);
			    }
			}
		    }
		}
	    }
	}
    }
    
    void method6397(float f, float f_73_, float f_74_, float f_75_,
		    float f_76_, float f_77_, float f_78_, float f_79_,
		    float f_80_, float f_81_, float f_82_, float f_83_,
		    float f_84_, float f_85_, float f_86_, float f_87_,
		    Interface38 interface38, int i) {
	if ((i & ~0xffffff) != 0) {
	    aClass185_Sub1_3886.method3360(anIntArray3887);
	    int i_88_ = anIntArray3887[0];
	    int i_89_ = anIntArray3887[1];
	    int i_90_ = anIntArray3887[2];
	    int i_91_ = anIntArray3887[3];
	    int i_92_ = 0;
	    int i_93_ = ((f < (float) i_88_ ? 1 : 0)
			 + (f_74_ < (float) i_88_ ? 1 : 0)
			 + (f_76_ < (float) i_88_ ? 1 : 0)
			 + (f_78_ < (float) i_88_ ? 1 : 0));
	    if (i_93_ != 4) {
		i_92_ |= i_93_;
		i_93_ = ((f > (float) i_90_ ? 1 : 0)
			 + (f_74_ > (float) i_90_ ? 1 : 0)
			 + (f_76_ > (float) i_90_ ? 1 : 0)
			 + (f_78_ > (float) i_90_ ? 1 : 0));
		if (i_93_ != 4) {
		    i_92_ |= i_93_;
		    i_93_ = ((f_73_ < (float) i_89_ ? 1 : 0)
			     + (f_75_ < (float) i_89_ ? 1 : 0)
			     + (f_77_ < (float) i_89_ ? 1 : 0)
			     + (f_79_ < (float) i_89_ ? 1 : 0));
		    if (i_93_ != 4) {
			i_92_ |= i_93_;
			i_93_ = ((f_73_ > (float) i_91_ ? 1 : 0)
				 + (f_75_ > (float) i_91_ ? 1 : 0)
				 + (f_77_ > (float) i_91_ ? 1 : 0)
				 + (f_79_ > (float) i_91_ ? 1 : 0));
			if (i_93_ != 4) {
			    i_92_ |= i_93_;
			    if (i_92_ != 0) {
				method6383();
				aClass185_Sub1_3886.method3237(true);
				aClass185_Sub1_3886.method3373(i_88_, i_89_,
							       i_90_, i_91_);
			    }
			    method6386();
			    f = method6385(f);
			    f_73_ = method6388(f_73_);
			    f_74_ = method6385(f_74_);
			    f_75_ = method6388(f_75_);
			    f_76_ = method6385(f_76_);
			    f_77_ = method6388(f_77_);
			    f_78_ = method6385(f_78_);
			    f_79_ = method6388(f_79_);
			    aFloatArray3880[anInt3879 * 16 + 0] = f;
			    aFloatArray3880[anInt3879 * 16 + 1] = f_73_;
			    aFloatArray3880[anInt3879 * 16 + 2] = f_80_;
			    aFloatArray3880[anInt3879 * 16 + 3] = f_81_;
			    aFloatArray3880[anInt3879 * 16 + 4] = f_74_;
			    aFloatArray3880[anInt3879 * 16 + 5] = f_75_;
			    aFloatArray3880[anInt3879 * 16 + 6] = f_82_;
			    aFloatArray3880[anInt3879 * 16 + 7] = f_83_;
			    aFloatArray3880[anInt3879 * 16 + 8] = f_76_;
			    aFloatArray3880[anInt3879 * 16 + 9] = f_77_;
			    aFloatArray3880[anInt3879 * 16 + 10] = f_84_;
			    aFloatArray3880[anInt3879 * 16 + 11] = f_85_;
			    aFloatArray3880[anInt3879 * 16 + 12] = f_78_;
			    aFloatArray3880[anInt3879 * 16 + 13] = f_79_;
			    aFloatArray3880[anInt3879 * 16 + 14] = f_86_;
			    aFloatArray3880[anInt3879 * 16 + 15] = f_87_;
			    anInterface38Array3881[anInt3879] = interface38;
			    if (aClass185_Sub1_3886.anInt9268 == 1)
				anIntArray3882[anInt3879]
				    = (~0xff00ff & i | (i & 0xff) << 16
				       | i >> 16 & 0xff);
			    else
				anIntArray3882[anInt3879] = i;
			    anInt3879++;
			    if (aClass353_3875 == Class353.aClass353_3656
				|| i_92_ > 0)
				method6383();
			    if (i_92_ != 0) {
				aClass185_Sub1_3886.method3237(false);
				aClass185_Sub1_3886.method3537();
				aClass185_Sub1_3886.method3373(i_88_, i_89_,
							       i_90_, i_91_);
			    }
			}
		    }
		}
	    }
	}
    }
    
    void method6398(float f, float f_94_, float f_95_, float f_96_,
		    float f_97_, float f_98_, float f_99_, float f_100_,
		    float f_101_, float f_102_, float f_103_, float f_104_,
		    float f_105_, float f_106_, float f_107_, float f_108_,
		    Interface38 interface38, int i) {
	if ((i & ~0xffffff) != 0) {
	    aClass185_Sub1_3886.method3360(anIntArray3887);
	    int i_109_ = anIntArray3887[0];
	    int i_110_ = anIntArray3887[1];
	    int i_111_ = anIntArray3887[2];
	    int i_112_ = anIntArray3887[3];
	    int i_113_ = 0;
	    int i_114_ = ((f < (float) i_109_ ? 1 : 0)
			  + (f_95_ < (float) i_109_ ? 1 : 0)
			  + (f_97_ < (float) i_109_ ? 1 : 0)
			  + (f_99_ < (float) i_109_ ? 1 : 0));
	    if (i_114_ != 4) {
		i_113_ |= i_114_;
		i_114_ = ((f > (float) i_111_ ? 1 : 0)
			  + (f_95_ > (float) i_111_ ? 1 : 0)
			  + (f_97_ > (float) i_111_ ? 1 : 0)
			  + (f_99_ > (float) i_111_ ? 1 : 0));
		if (i_114_ != 4) {
		    i_113_ |= i_114_;
		    i_114_ = ((f_94_ < (float) i_110_ ? 1 : 0)
			      + (f_96_ < (float) i_110_ ? 1 : 0)
			      + (f_98_ < (float) i_110_ ? 1 : 0)
			      + (f_100_ < (float) i_110_ ? 1 : 0));
		    if (i_114_ != 4) {
			i_113_ |= i_114_;
			i_114_ = ((f_94_ > (float) i_112_ ? 1 : 0)
				  + (f_96_ > (float) i_112_ ? 1 : 0)
				  + (f_98_ > (float) i_112_ ? 1 : 0)
				  + (f_100_ > (float) i_112_ ? 1 : 0));
			if (i_114_ != 4) {
			    i_113_ |= i_114_;
			    if (i_113_ != 0) {
				method6383();
				aClass185_Sub1_3886.method3237(true);
				aClass185_Sub1_3886.method3373(i_109_, i_110_,
							       i_111_, i_112_);
			    }
			    method6386();
			    f = method6385(f);
			    f_94_ = method6388(f_94_);
			    f_95_ = method6385(f_95_);
			    f_96_ = method6388(f_96_);
			    f_97_ = method6385(f_97_);
			    f_98_ = method6388(f_98_);
			    f_99_ = method6385(f_99_);
			    f_100_ = method6388(f_100_);
			    aFloatArray3880[anInt3879 * 16 + 0] = f;
			    aFloatArray3880[anInt3879 * 16 + 1] = f_94_;
			    aFloatArray3880[anInt3879 * 16 + 2] = f_101_;
			    aFloatArray3880[anInt3879 * 16 + 3] = f_102_;
			    aFloatArray3880[anInt3879 * 16 + 4] = f_95_;
			    aFloatArray3880[anInt3879 * 16 + 5] = f_96_;
			    aFloatArray3880[anInt3879 * 16 + 6] = f_103_;
			    aFloatArray3880[anInt3879 * 16 + 7] = f_104_;
			    aFloatArray3880[anInt3879 * 16 + 8] = f_97_;
			    aFloatArray3880[anInt3879 * 16 + 9] = f_98_;
			    aFloatArray3880[anInt3879 * 16 + 10] = f_105_;
			    aFloatArray3880[anInt3879 * 16 + 11] = f_106_;
			    aFloatArray3880[anInt3879 * 16 + 12] = f_99_;
			    aFloatArray3880[anInt3879 * 16 + 13] = f_100_;
			    aFloatArray3880[anInt3879 * 16 + 14] = f_107_;
			    aFloatArray3880[anInt3879 * 16 + 15] = f_108_;
			    anInterface38Array3881[anInt3879] = interface38;
			    if (aClass185_Sub1_3886.anInt9268 == 1)
				anIntArray3882[anInt3879]
				    = (~0xff00ff & i | (i & 0xff) << 16
				       | i >> 16 & 0xff);
			    else
				anIntArray3882[anInt3879] = i;
			    anInt3879++;
			    if (aClass353_3875 == Class353.aClass353_3656
				|| i_113_ > 0)
				method6383();
			    if (i_113_ != 0) {
				aClass185_Sub1_3886.method3237(false);
				aClass185_Sub1_3886.method3537();
				aClass185_Sub1_3886.method3373(i_109_, i_110_,
							       i_111_, i_112_);
			    }
			}
		    }
		}
	    }
	}
    }
    
    Class353 method6399() {
	return aClass353_3875;
    }
    
    float method6400(float f) {
	int i = aClass185_Sub1_3886.method3253(-1742189116).method2910();
	float f_115_
	    = ((f + aClass185_Sub1_3886.method14715()) / (float) i * 2.0F
	       - 1.0F);
	return f_115_;
    }
    
    float method6401(float f) {
	int i = aClass185_Sub1_3886.method3253(-2127096316).method2911();
	float f_116_
	    = (((1.0F - (f + aClass185_Sub1_3886.method14715()) / (float) i)
		* 2.0F)
	       - 1.0F);
	return f_116_;
    }
    
    float method6402(float f) {
	int i = aClass185_Sub1_3886.method3253(-1055577485).method2911();
	float f_117_
	    = (((1.0F - (f + aClass185_Sub1_3886.method14715()) / (float) i)
		* 2.0F)
	       - 1.0F);
	return f_117_;
    }
    
    void method6403() {
	if (anInt3879 != 0) {
	    aClass185_Sub1_3886.method14711();
	    aClass185_Sub1_3886.method14687(1);
	    aClass185_Sub1_3886.method14701(anInterface39_3885);
	    aClass185_Sub1_3886.method14733(0, anInterface37_3884);
	    aClass185_Sub1_3886.method14700(aClass349_3878);
	    Class314 class314 = aClass185_Sub1_3886.aClass314_9233;
	    Unsafe unsafe = aClass185_Sub1_3886.anUnsafe9127;
	    ByteBuffer bytebuffer = aClass185_Sub1_3886.aByteBuffer9266;
	    bytebuffer.clear();
	    aClass185_Sub1_3886.method14679()
		.method6842(Class433.aClass433_4854);
	    aClass185_Sub1_3886.method14871(Class364.aClass364_3724);
	    int i = (anInt3879 + anInt3883 - 1) / anInt3883;
	    int i_118_ = 0;
	    int i_119_ = 0;
	    for (int i_120_ = 0; i_120_ < i; i_120_++) {
		int i_121_ = Math.min(anInt3883, anInt3879 - i_118_);
		long l = anInterface37_3884.method227(0, i_121_ * 96);
		int i_122_ = i_120_ * anInt3883 + i_121_;
		for (int i_123_ = i_118_; i_123_ < i_122_; i_123_++) {
		    for (int i_124_ = 0; i_124_ < 4; i_124_++) {
			unsafe.putFloat(l, aFloatArray3880[i_119_++]);
			l += 4L;
			unsafe.putFloat(l, aFloatArray3880[i_119_++]);
			l += 4L;
			unsafe.putFloat(l, 0.0F);
			l += 4L;
			unsafe.putFloat(l, aFloatArray3880[i_119_++]);
			l += 4L;
			unsafe.putFloat(l, aFloatArray3880[i_119_++]);
			l += 4L;
			unsafe.putInt(l, anIntArray3882[i_123_]);
			l += 4L;
		    }
		}
		anInterface37_3884.method228();
		Interface38 interface38 = anInterface38Array3881[i_118_];
		int i_125_ = 1;
		int i_126_ = 0;
		for (int i_127_ = i_118_ + 1; i_127_ < i_122_; i_127_++) {
		    if (interface38 == anInterface38Array3881[i_127_])
			i_125_++;
		    else {
			class314.anInterface38_3375 = interface38;
			class314.method5693();
			aClass185_Sub1_3886.method14709(anInterface39_3885,
							(Class374
							 .aClass374_3898),
							i_126_ * 4, i_125_ * 4,
							i_126_ * 6,
							i_125_ * 2);
			interface38 = anInterface38Array3881[i_127_];
			i_125_ = 1;
			i_126_ = i_127_ - i_118_;
		    }
		}
		class314.anInterface38_3375 = interface38;
		class314.method5693();
		aClass185_Sub1_3886.method14709(anInterface39_3885,
						Class374.aClass374_3898,
						i_126_ * 4, i_125_ * 4,
						i_126_ * 6, i_125_ * 2);
		i_118_ += anInt3883;
	    }
	    anInt3879 = 0;
	}
    }
    
    float method6404(float f) {
	int i = aClass185_Sub1_3886.method3253(-218611451).method2910();
	float f_128_
	    = ((f + aClass185_Sub1_3886.method14715()) / (float) i * 2.0F
	       - 1.0F);
	return f_128_;
    }
    
    void method6405() {
	if (aClass353_3877 != null) {
	    aClass353_3875 = aClass353_3877;
	    aClass353_3877 = null;
	}
    }
    
    void method6406() {
	if (aClass353_3877 != null) {
	    aClass353_3875 = aClass353_3877;
	    aClass353_3877 = null;
	}
    }
    
    void method6407() {
	if (aClass353_3877 != null) {
	    aClass353_3875 = aClass353_3877;
	    aClass353_3877 = null;
	}
    }
    
    Class371(Class185_Sub1 class185_sub1, int i) {
	aClass185_Sub1_3886 = class185_sub1;
	anInterface37_3884 = aClass185_Sub1_3886.method14698(true);
	anInterface37_3884.method236(i * 96, 24);
	aClass349_3878
	    = (aClass185_Sub1_3886.method14699
	       (new Class381[]
		{ new Class381(new Class350[] { Class350.aClass350_3610,
						Class350.aClass350_3597,
						Class350.aClass350_3595 }) }));
	anInterface39_3885 = aClass185_Sub1_3886.method14971(false);
	int i_129_ = i * 6;
	anInterface39_3885.method277(i_129_);
	int i_130_
	    = i_129_ * (anInterface39_3885.method276().anInt1825 * 1899960707);
	ByteBuffer bytebuffer = aClass185_Sub1_3886.aByteBuffer9266;
	aClass185_Sub1_3886.method14586(i_130_);
	bytebuffer.clear();
	for (int i_131_ = 0; i_131_ < i; i_131_++) {
	    bytebuffer.putShort((short) (i_131_ * 4));
	    bytebuffer.putShort((short) (i_131_ * 4 + 2));
	    bytebuffer.putShort((short) (i_131_ * 4 + 1));
	    bytebuffer.putShort((short) (i_131_ * 4 + 2));
	    bytebuffer.putShort((short) (i_131_ * 4 + 3));
	    bytebuffer.putShort((short) (i_131_ * 4 + 1));
	}
	anInterface39_3885.method235(0,
				     i_129_ * ((anInterface39_3885.method276()
						.anInt1825)
					       * 1899960707),
				     aClass185_Sub1_3886.aLong9139);
	anInt3883 = i;
	anInt3879 = 0;
    }
    
    void method6408() {
	if (aClass353_3877 != null) {
	    aClass353_3875 = aClass353_3877;
	    aClass353_3877 = null;
	}
    }
    
    Class353 method6409() {
	return aClass353_3875;
    }
    
    Class353 method6410() {
	return aClass353_3875;
    }
}
