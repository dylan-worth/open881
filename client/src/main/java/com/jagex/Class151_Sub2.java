/* Class151_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;
import java.util.Iterator;

public class Class151_Sub2 extends Class151
{
    Class534[] aClass534Array9375;
    Class338 aClass338_9376;
    Class185_Sub1 aClass185_Sub1_9377;
    int anInt9378;
    int anInt9379;
    int anInt9380;
    int anInt9381;
    int anInt9382;
    int anInt9383;
    int[][][] anIntArrayArrayArray9384;
    Class9 aClass9_9385;
    float aFloat9386;
    Class534_Sub10[][][] aClass534_Sub10ArrayArrayArray9387;
    int[][][] anIntArrayArrayArray9388;
    static final int anInt9389 = 74;
    int anInt9390;
    int[][][] anIntArrayArrayArray9391;
    int[][][] anIntArrayArrayArray9392;
    float[][] aFloatArrayArray9393;
    byte[][] aByteArrayArray9394;
    Class349 aClass349_9395;
    int[][][] anIntArrayArrayArray9396;
    float[][] aFloatArrayArray9397;
    Interface37 anInterface37_9398;
    Interface37 anInterface37_9399;
    ByteBuffer aByteBuffer9400;
    int anInt9401;
    int anInt9402;
    byte[][] aByteArrayArray9403;
    float[][] aFloatArrayArray9404;
    static final int anInt9405 = 1;
    int[] anIntArray9406;
    int anInt9407;
    Class534[] aClass534Array9408;
    short[][] aShortArrayArray9409;
    ByteBuffer aByteBuffer9410;
    Class700 aClass700_9411;
    float aFloat9412 = 3.4028235E38F;
    int[] anIntArray9413;
    int[] anIntArray9414;
    int anInt9415;
    int[][][] anIntArrayArrayArray9416;
    
    public void method2518(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			   int i_0_, int i_1_, int i_2_, boolean bool) {
	if (aClass338_9376 != null && class534_sub18_sub16 != null) {
	    int i_3_ = (i - (i_0_ * aClass185_Sub1_9377.anInt9213 >> 8)
			>> aClass185_Sub1_9377.anInt9212);
	    int i_4_ = (i_1_ - (i_0_ * aClass185_Sub1_9377.anInt9287 >> 8)
			>> aClass185_Sub1_9377.anInt9212);
	    aClass338_9376.method5910(class534_sub18_sub16, i_3_, i_4_);
	}
    }
    
    public void method2492(int i, int i_5_, int i_6_) {
	i = Math.min(aByteArrayArray9403.length - 1, Math.max(0, i));
	i_5_ = Math.min(aByteArrayArray9403[i].length - 1, Math.max(0, i_5_));
	if ((aByteArrayArray9403[i][i_5_] & 0xff) < i_6_)
	    aByteArrayArray9403[i][i_5_] = (byte) i_6_;
    }
    
    public void method2531(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			   int i_7_, int i_8_, int i_9_, boolean bool) {
	if (aClass338_9376 != null && class534_sub18_sub16 != null) {
	    int i_10_ = (i - (i_7_ * aClass185_Sub1_9377.anInt9213 >> 8)
			 >> aClass185_Sub1_9377.anInt9212);
	    int i_11_ = (i_8_ - (i_7_ * aClass185_Sub1_9377.anInt9287 >> 8)
			 >> aClass185_Sub1_9377.anInt9212);
	    aClass338_9376.method5930(class534_sub18_sub16, i_10_, i_11_);
	}
    }
    
    void method15056(int i, int i_12_, byte[][] is,
		     Class534_Sub10[] class534_sub10s, Class9 class9,
		     Class534_Sub10[] class534_sub10s_13_) {
	if (anIntArrayArrayArray9388[i][i_12_] != null) {
	    Class534_Sub10[] class534_sub10s_14_
		= aClass534_Sub10ArrayArrayArray9387[i][i_12_];
	    int[] is_15_ = anIntArrayArrayArray9384[i][i_12_];
	    int[] is_16_ = anIntArrayArrayArray9391[i][i_12_];
	    int[] is_17_ = anIntArrayArrayArray9416[i][i_12_];
	    int[] is_18_ = anIntArrayArrayArray9388[i][i_12_];
	    int[] is_19_ = (anIntArrayArrayArray9392 != null
			    ? anIntArrayArrayArray9392[i][i_12_] : null);
	    int[] is_20_ = (anIntArrayArrayArray9396 != null
			    ? anIntArrayArrayArray9396[i][i_12_] : null);
	    if (is_17_ == null)
		is_17_ = is_18_;
	    float f = aFloatArrayArray9404[i][i_12_];
	    float f_21_ = aFloatArrayArray9397[i][i_12_];
	    float f_22_ = aFloatArrayArray9393[i][i_12_];
	    float f_23_ = aFloatArrayArray9404[i][i_12_ + 1];
	    float f_24_ = aFloatArrayArray9397[i][i_12_ + 1];
	    float f_25_ = aFloatArrayArray9393[i][i_12_ + 1];
	    float f_26_ = aFloatArrayArray9404[i + 1][i_12_ + 1];
	    float f_27_ = aFloatArrayArray9397[i + 1][i_12_ + 1];
	    float f_28_ = aFloatArrayArray9393[i + 1][i_12_ + 1];
	    float f_29_ = aFloatArrayArray9404[i + 1][i_12_];
	    float f_30_ = aFloatArrayArray9397[i + 1][i_12_];
	    float f_31_ = aFloatArrayArray9393[i + 1][i_12_];
	    int i_32_ = is[i][i_12_] & 0xff;
	    int i_33_ = is[i][i_12_ + 1] & 0xff;
	    int i_34_ = is[i + 1][i_12_ + 1] & 0xff;
	    int i_35_ = is[i + 1][i_12_] & 0xff;
	    int i_36_ = 0;
	while_18_:
	    for (int i_37_ = 0; i_37_ < is_18_.length; i_37_++) {
		Class534_Sub10 class534_sub10 = class534_sub10s_14_[i_37_];
		for (int i_38_ = 0; i_38_ < i_36_; i_38_++) {
		    if (class534_sub10s[i_38_] == class534_sub10)
			continue while_18_;
		}
		class534_sub10s[i_36_++] = class534_sub10;
	    }
	    short[] is_39_
		= (aShortArrayArray9409[i_12_ * (anInt1701 * -1924295585) + i]
		   = new short[is_18_.length]);
	    for (int i_40_ = 0; i_40_ < is_18_.length; i_40_++) {
		int i_41_ = (i << anInt1703 * -1495101509) + is_15_[i_40_];
		int i_42_ = (i_12_ << anInt1703 * -1495101509) + is_16_[i_40_];
		int i_43_ = i_41_ >> anInt9378;
		int i_44_ = i_42_ >> anInt9378;
		int i_45_ = is_18_[i_40_];
		int i_46_ = is_17_[i_40_];
		int i_47_ = is_19_ != null ? is_19_[i_40_] : 0;
		long l = ((long) i_46_ << 48 | (long) i_45_ << 32
			  | (long) (i_43_ << 16) | (long) i_44_);
		int i_48_ = is_15_[i_40_];
		int i_49_ = is_16_[i_40_];
		int i_50_ = 74;
		int i_51_ = 0;
		float f_52_ = 1.0F;
		float f_53_;
		float f_54_;
		float f_55_;
		if (i_48_ == 0 && i_49_ == 0) {
		    f_53_ = f;
		    f_54_ = f_21_;
		    f_55_ = f_22_;
		    i_50_ -= i_32_;
		} else if (i_48_ == 0 && i_49_ == anInt1702 * 127780559) {
		    f_53_ = f_23_;
		    f_54_ = f_24_;
		    f_55_ = f_25_;
		    i_50_ -= i_33_;
		} else if (i_48_ == anInt1702 * 127780559
			   && i_49_ == anInt1702 * 127780559) {
		    f_53_ = f_26_;
		    f_54_ = f_27_;
		    f_55_ = f_28_;
		    i_50_ -= i_34_;
		} else if (i_48_ == anInt1702 * 127780559 && i_49_ == 0) {
		    f_53_ = f_29_;
		    f_54_ = f_30_;
		    f_55_ = f_31_;
		    i_50_ -= i_35_;
		} else {
		    float f_56_
			= (float) i_48_ / (float) (anInt1702 * 127780559);
		    float f_57_
			= (float) i_49_ / (float) (anInt1702 * 127780559);
		    float f_58_ = f + (f_29_ - f) * f_56_;
		    float f_59_ = f_21_ + (f_30_ - f_21_) * f_56_;
		    float f_60_ = f_22_ + (f_31_ - f_22_) * f_56_;
		    float f_61_ = f_23_ + (f_26_ - f_23_) * f_56_;
		    float f_62_ = f_24_ + (f_27_ - f_24_) * f_56_;
		    float f_63_ = f_25_ + (f_28_ - f_25_) * f_56_;
		    f_53_ = f_58_ + (f_61_ - f_58_) * f_57_;
		    f_54_ = f_59_ + (f_62_ - f_59_) * f_57_;
		    f_55_ = f_60_ + (f_63_ - f_60_) * f_57_;
		    int i_64_ = i_32_ + ((i_35_ - i_32_) * i_48_
					 >> anInt1703 * -1495101509);
		    int i_65_ = i_33_ + ((i_34_ - i_33_) * i_48_
					 >> anInt1703 * -1495101509);
		    i_50_ -= i_64_ + ((i_65_ - i_64_) * i_49_
				      >> anInt1703 * -1495101509);
		}
		if (i_45_ != -1) {
		    int i_66_ = (i_45_ & 0x7f) * i_50_ >> 7;
		    if (i_66_ < 2)
			i_66_ = 2;
		    else if (i_66_ > 126)
			i_66_ = 126;
		    i_51_ = Class661.anIntArray8548[i_45_ & 0xff80 | i_66_];
		    if ((anInt9381 & 0x7) == 0) {
			f_52_
			    = (aClass185_Sub1_9377.aFloatArray9197[0] * f_53_
			       + aClass185_Sub1_9377.aFloatArray9197[1] * f_54_
			       + (aClass185_Sub1_9377.aFloatArray9197[2]
				  * f_55_));
			f_52_ = (aClass185_Sub1_9377.aFloat9205
				 + f_52_ * (f_52_ > 0.0F
					    ? aClass185_Sub1_9377.aFloat9206
					    : aClass185_Sub1_9377.aFloat9267));
		    }
		}
		Class534 class534 = null;
		if ((i_41_ & anInt9379 - 1) == 0
		    && (i_42_ & anInt9379 - 1) == 0)
		    class534 = class9.method579(l);
		int i_67_;
		if (class534 == null) {
		    int i_68_;
		    if (i_46_ != i_45_) {
			int i_69_ = (i_46_ & 0x7f) * i_50_ >> 7;
			if (i_69_ < 2)
			    i_69_ = 2;
			else if (i_69_ > 126)
			    i_69_ = 126;
			i_68_
			    = Class661.anIntArray8548[i_46_ & 0xff80 | i_69_];
			if ((anInt9381 & 0x7) == 0) {
			    float f_70_
				= ((aClass185_Sub1_9377.aFloatArray9197[0]
				    * f_53_)
				   + (aClass185_Sub1_9377.aFloatArray9197[1]
				      * f_54_)
				   + (aClass185_Sub1_9377.aFloatArray9197[2]
				      * f_55_));
			    f_70_ = (aClass185_Sub1_9377.aFloat9205
				     + (f_52_
					* (f_52_ > 0.0F
					   ? aClass185_Sub1_9377.aFloat9206
					   : aClass185_Sub1_9377.aFloat9267)));
			    int i_71_ = i_68_ >> 16 & 0xff;
			    int i_72_ = i_68_ >> 8 & 0xff;
			    int i_73_ = i_68_ & 0xff;
			    i_71_ *= f_70_;
			    if (i_71_ < 0)
				i_71_ = 0;
			    else if (i_71_ > 255)
				i_71_ = 255;
			    i_72_ *= f_70_;
			    if (i_72_ < 0)
				i_72_ = 0;
			    else if (i_72_ > 255)
				i_72_ = 255;
			    i_73_ *= f_70_;
			    if (i_73_ < 0)
				i_73_ = 0;
			    else if (i_73_ > 255)
				i_73_ = 255;
			    i_68_ = i_71_ << 16 | i_72_ << 8 | i_73_;
			}
		    } else
			i_68_ = i_51_;
		    aByteBuffer9400.putFloat((float) i_41_);
		    aByteBuffer9400.putFloat((float) (method2498(i_41_, i_42_,
								 1087247982)
						      + i_47_));
		    aByteBuffer9400.putFloat((float) i_42_);
		    aByteBuffer9400.putFloat((float) i_41_);
		    aByteBuffer9400.putFloat((float) i_42_);
		    if (anIntArrayArrayArray9396 != null)
			aByteBuffer9400.putFloat(is_20_ != null
						 ? (float) (is_20_[i_40_] - 1)
						 : 0.0F);
		    if ((anInt9381 & 0x7) != 0) {
			aByteBuffer9400.putFloat(f_53_);
			aByteBuffer9400.putFloat(f_54_);
			aByteBuffer9400.putFloat(f_55_);
		    }
		    if (aClass185_Sub1_9377.anInt9268 == 0) {
			int i_74_ = i_68_ & ~0xff00ff;
			i_74_ |= (i_68_ & 0xff0000) >> 16;
			i_74_ |= (i_68_ & 0xff) << 16;
			i_68_ = i_74_;
		    }
		    aByteBuffer9410.putInt(~0xffffff | i_68_);
		    i_67_ = anInt9382++;
		    is_39_[i_40_] = (short) i_67_;
		    if (i_45_ != -1)
			class534_sub10s_13_[i_67_]
			    = class534_sub10s_14_[i_40_];
		    class9.method581(new Class534_Sub15(is_39_[i_40_]), l);
		} else {
		    is_39_[i_40_] = ((Class534_Sub15) class534).aShort10466;
		    i_67_ = is_39_[i_40_] & 0xffff;
		    if (i_45_ != -1 && ((class534_sub10s_14_[i_40_].aLong7158
					 * 8258869577519436579L)
					< (class534_sub10s_13_[i_67_].aLong7158
					   * 8258869577519436579L)))
			class534_sub10s_13_[i_67_]
			    = class534_sub10s_14_[i_40_];
		}
		for (int i_75_ = 0; i_75_ < i_36_; i_75_++)
		    class534_sub10s[i_75_].method16119(i_67_, i_51_, i_50_,
						       f_52_);
		anInt9383++;
	    }
	}
    }
    
    public void method2495() {
	if (anInt9401 <= 0) {
	    aClass338_9376 = null;
	    method15057();
	} else {
	    byte[][] is = (new byte[anInt1701 * -1924295585 + 1]
			   [anInt1700 * -1466328823 + 1]);
	    for (int i = 1; i < anInt1701 * -1924295585; i++) {
		for (int i_76_ = 1; i_76_ < anInt1700 * -1466328823; i_76_++)
		    is[i][i_76_]
			= (byte) ((aByteArrayArray9403[i - 1][i_76_] >> 2)
				  + (aByteArrayArray9403[i + 1][i_76_] >> 3)
				  + (aByteArrayArray9403[i][i_76_ - 1] >> 2)
				  + (aByteArrayArray9403[i][i_76_ + 1] >> 3)
				  + (aByteArrayArray9403[i][i_76_] >> 1));
	    }
	    aClass534Array9408
		= new Class534[aClass9_9385.method600(599032069)];
	    aClass9_9385.method580(aClass534Array9408, (byte) -14);
	    for (int i = 0; i < aClass534Array9408.length; i++)
		((Class534_Sub10) aClass534Array9408[i])
		    .method16116(anInt9401);
	    anInt9390 = 20;
	    if (anIntArrayArrayArray9396 != null)
		anInt9390 += 4;
	    if ((anInt9381 & 0x7) != 0)
		anInt9390 += 12;
	    aByteBuffer9410 = aClass185_Sub1_9377.method14587(anInt9401 * 4);
	    aByteBuffer9400
		= aClass185_Sub1_9377.method14587(anInt9401 * anInt9390);
	    Class534_Sub10[] class534_sub10s = new Class534_Sub10[anInt9401];
	    int i = Class455.method7422(anInt9401 / 4, -639579056);
	    if (i < 1)
		i = 1;
	    Class9 class9 = new Class9(i);
	    Class534_Sub10[] class534_sub10s_77_
		= new Class534_Sub10[anInt9402];
	    for (int i_78_ = 0; i_78_ < anInt1701 * -1924295585; i_78_++) {
		for (int i_79_ = 0; i_79_ < anInt1700 * -1466328823; i_79_++)
		    method15056(i_78_, i_79_, is, class534_sub10s_77_, class9,
				class534_sub10s);
	    }
	    for (int i_80_ = 0; i_80_ < anInt9382; i_80_++) {
		Class534_Sub10 class534_sub10 = class534_sub10s[i_80_];
		if (class534_sub10 != null)
		    class534_sub10.method16117(i_80_);
	    }
	    for (int i_81_ = 0; i_81_ < anInt1701 * -1924295585; i_81_++) {
		for (int i_82_ = 0; i_82_ < anInt1700 * -1466328823; i_82_++) {
		    short[] is_83_
			= (aShortArrayArray9409
			   [i_82_ * (anInt1701 * -1924295585) + i_81_]);
		    if (is_83_ != null) {
			int i_84_ = 0;
			int i_85_ = 0;
			while (i_85_ < is_83_.length) {
			    int i_86_ = is_83_[i_85_++] & 0xffff;
			    int i_87_ = is_83_[i_85_++] & 0xffff;
			    int i_88_ = is_83_[i_85_++] & 0xffff;
			    Class534_Sub10 class534_sub10
				= class534_sub10s[i_86_];
			    Class534_Sub10 class534_sub10_89_
				= class534_sub10s[i_87_];
			    Class534_Sub10 class534_sub10_90_
				= class534_sub10s[i_88_];
			    Class534_Sub10 class534_sub10_91_ = null;
			    if (class534_sub10 != null) {
				class534_sub10.method16123(i_81_, i_82_,
							   i_84_);
				class534_sub10_91_ = class534_sub10;
			    }
			    if (class534_sub10_89_ != null) {
				class534_sub10_89_.method16123(i_81_, i_82_,
							       i_84_);
				if (class534_sub10_91_ == null
				    || ((class534_sub10_89_.aLong7158
					 * 8258869577519436579L)
					< (class534_sub10_91_.aLong7158
					   * 8258869577519436579L)))
				    class534_sub10_91_ = class534_sub10_89_;
			    }
			    if (class534_sub10_90_ != null) {
				class534_sub10_90_.method16123(i_81_, i_82_,
							       i_84_);
				if (class534_sub10_91_ == null
				    || ((class534_sub10_90_.aLong7158
					 * 8258869577519436579L)
					< (class534_sub10_91_.aLong7158
					   * 8258869577519436579L)))
				    class534_sub10_91_ = class534_sub10_90_;
			    }
			    if (class534_sub10_91_ != null) {
				if (class534_sub10 != null)
				    class534_sub10_91_.method16117(i_86_);
				if (class534_sub10_89_ != null)
				    class534_sub10_91_.method16117(i_87_);
				if (class534_sub10_90_ != null)
				    class534_sub10_91_.method16117(i_88_);
				class534_sub10_91_.method16123(i_81_, i_82_,
							       i_84_);
			    }
			    i_84_++;
			}
		    }
		}
	    }
	    anInt9407 = 0;
	    for (int i_92_ = 0; i_92_ < aClass534Array9408.length; i_92_++) {
		Class534_Sub10 class534_sub10
		    = (Class534_Sub10) aClass534Array9408[i_92_];
		if (class534_sub10.anInt10434 > 0)
		    aClass534Array9408[anInt9407++] = class534_sub10;
	    }
	    aClass534Array9375 = new Class534[anInt9407];
	    long[] ls = new long[anInt9407];
	    for (int i_93_ = 0; i_93_ < anInt9407; i_93_++) {
		Class534_Sub10 class534_sub10
		    = (Class534_Sub10) aClass534Array9408[i_93_];
		ls[i_93_] = class534_sub10.aLong7158 * 8258869577519436579L;
		aClass534Array9375[i_93_] = class534_sub10;
	    }
	    Class411.method6716(ls, aClass534Array9375, 1088474197);
	    method15060();
	}
    }
    
    public void method2516(int i, int i_94_, int i_95_, boolean[][] bools,
			   boolean bool, int i_96_) {
	if (aClass534Array9375 != null) {
	    int i_97_ = i_95_ + i_95_ + 1;
	    i_97_ *= i_97_;
	    if (anIntArray9406.length < i_97_)
		anIntArray9406 = new int[i_97_];
	    int i_98_ = i - i_95_;
	    int i_99_ = i_98_;
	    if (i_98_ < 0)
		i_98_ = 0;
	    int i_100_ = i_94_ - i_95_;
	    int i_101_ = i_100_;
	    if (i_100_ < 0)
		i_100_ = 0;
	    int i_102_ = i + i_95_;
	    if (i_102_ > anInt1701 * -1924295585 - 1)
		i_102_ = anInt1701 * -1924295585 - 1;
	    int i_103_ = i_94_ + i_95_;
	    if (i_103_ > anInt1700 * -1466328823 - 1)
		i_103_ = anInt1700 * -1466328823 - 1;
	    anInt9415 = 0;
	    for (int i_104_ = i_98_; i_104_ <= i_102_; i_104_++) {
		boolean[] bools_105_ = bools[i_104_ - i_99_];
		for (int i_106_ = i_100_; i_106_ <= i_103_; i_106_++) {
		    if (bools_105_[i_106_ - i_101_])
			anIntArray9406[anInt9415++]
			    = i_106_ * (anInt1701 * -1924295585) + i_104_;
		}
	    }
	    ByteBuffer bytebuffer = aClass185_Sub1_9377.aByteBuffer9266;
	    bytebuffer.clear();
	    for (int i_107_ = 0; i_107_ < aClass534Array9375.length;
		 i_107_++) {
		Class534_Sub10 class534_sub10
		    = (Class534_Sub10) aClass534Array9375[i_107_];
		class534_sub10.method16125(anIntArray9406, anInt9415);
	    }
	    int i_108_ = bytebuffer.position();
	    Class324 class324 = aClass185_Sub1_9377.aClass324_9158;
	    aClass185_Sub1_9377.method14712();
	    if (aClass185_Sub1_9377.anInt9252 > 0) {
		class324.aClass438_3435.method6997
		    (((float) (aClass185_Sub1_9377.anInt9251 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (aClass185_Sub1_9377.anInt9251 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (aClass185_Sub1_9377.anInt9251 >> 0 & 0xff)
		      / 255.0F));
		class324.aClass441_3440.method7105(0.0F, 0.0F, 1.0F,
						   -(aClass185_Sub1_9377
						     .aFloat9254));
		class324.aClass441_3440
		    .method7111(aClass185_Sub1_9377.aClass433_9144);
		class324.aClass441_3440.method7110
		    (1.0F / (aClass185_Sub1_9377.aFloat9255
			     - aClass185_Sub1_9377.aFloat9254));
	    } else {
		class324.aClass441_3440.method7105(0.0F, 0.0F, 0.0F, 0.0F);
		class324.aClass438_3435.method6997(0.0F, 0.0F, 0.0F);
	    }
	    if (i_108_ != 0) {
		Interface39 interface39
		    = aClass185_Sub1_9377.method14725(i_108_ / 2);
		interface39.method235(0, i_108_,
				      aClass185_Sub1_9377.aLong9139);
		aClass185_Sub1_9377.method14733(0, anInterface37_9398);
		aClass185_Sub1_9377.method14701(interface39);
		class324.method5794(Class433.aClass433_4854);
		if ((anInt9381 & 0x7) == 0) {
		    int i_109_ = 0;
		    for (int i_110_ = 0; i_110_ < aClass534Array9375.length;
			 i_110_++) {
			Class534_Sub10 class534_sub10
			    = (Class534_Sub10) aClass534Array9375[i_110_];
			if (class534_sub10.anInt10436 != 0) {
			    if (aClass185_Sub1_9377.aBool9231) {
				aClass185_Sub1_9377.method3364
				    (0, class534_sub10.aClass166_10430);
				class324.aClass441_3438.method7105
				    (0.0F, 1.0F, 0.0F,
				     ((float) aClass185_Sub1_9377.anInt9247
				      + ((float) ((class534_sub10
						   .aClass166_10430.anInt1764)
						  * 1446227271)
					 / 255.0F
					 * (float) ((class534_sub10
						     .aClass166_10430
						     .anInt1762)
						    * -1095140607))));
				class324.aClass441_3438.method7110
				    (1.0F / (float) ((class534_sub10
						      .aClass166_10430
						      .anInt1762)
						     * -1095140607));
				class324.aClass438_3431.method6997
				    ((float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 16
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 8
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 0
					      & 0xff) / 255.0F);
			    } else {
				class324.aClass441_3438.method7105(0.0F, 0.0F,
								   0.0F, 0.0F);
				class324.aClass438_3431.method6997(0.0F, 0.0F,
								   0.0F);
			    }
			    boolean bool_111_ = false;
			    if (class534_sub10.anInt10428 != -1) {
				Class186 class186
				    = (aClass185_Sub1_9377.aClass177_2012
					   .method2931
				       (class534_sub10.anInt10428, (byte) 1));
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.aClass354_9211
					  .method6267(class186);
				bool_111_
				    = !Class72.method1559(class186.aByte2067,
							  -1966682456);
			    } else
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.anInterface38_9204;
			    aClass185_Sub1_9377.method14733
				(1, class534_sub10.anInterface37_10433);
			    aClass185_Sub1_9377.method14700(aClass349_9395);
			    class324.aClass433_3430.method6952
				(1.0F / class534_sub10.aFloat10432,
				 1.0F / class534_sub10.aFloat10432, 1.0F,
				 1.0F);
			    class324.anInt3447 = class534_sub10.anInt10437;
			    class324.anInt3428
				= (class534_sub10.anInt10438
				   - class534_sub10.anInt10437 + 1);
			    class324.anInt3449 = i_109_;
			    class324.anInt3450 = class534_sub10.anInt10436 / 3;
			    class324.method5812(bool_111_);
			    i_109_ += class534_sub10.anInt10436;
			}
		    }
		} else {
		    class324.aClass438_3442.method6997
			(aClass185_Sub1_9377.aFloatArray9197[0],
			 aClass185_Sub1_9377.aFloatArray9197[1],
			 aClass185_Sub1_9377.aFloatArray9197[2]);
		    class324.aClass438_3443.method6997
			((aClass185_Sub1_9377.aFloat9206
			  * aClass185_Sub1_9377.aFloat9159),
			 (aClass185_Sub1_9377.aFloat9206
			  * aClass185_Sub1_9377.aFloat9292),
			 (aClass185_Sub1_9377.aFloat9206
			  * aClass185_Sub1_9377.aFloat9163));
		    class324.aClass438_3444.method6997
			((-aClass185_Sub1_9377.aFloat9267
			  * aClass185_Sub1_9377.aFloat9159),
			 (-aClass185_Sub1_9377.aFloat9267
			  * aClass185_Sub1_9377.aFloat9292),
			 (-aClass185_Sub1_9377.aFloat9267
			  * aClass185_Sub1_9377.aFloat9163));
		    class324.aClass438_3445.method6997
			((aClass185_Sub1_9377.aFloat9205
			  * aClass185_Sub1_9377.aFloat9159),
			 (aClass185_Sub1_9377.aFloat9205
			  * aClass185_Sub1_9377.aFloat9292),
			 (aClass185_Sub1_9377.aFloat9205
			  * aClass185_Sub1_9377.aFloat9163));
		    int i_112_ = 0;
		    for (int i_113_ = 0; i_113_ < aClass534Array9375.length;
			 i_113_++) {
			Class534_Sub10 class534_sub10
			    = (Class534_Sub10) aClass534Array9375[i_113_];
			if (class534_sub10.anInt10436 > 0) {
			    if (aClass185_Sub1_9377.aBool9231) {
				aClass185_Sub1_9377.method3364
				    (0, class534_sub10.aClass166_10430);
				float f = 0.15F;
				class324.aClass441_3438.method7105
				    (0.0F,
				     1.0F / ((float) ((class534_sub10
						       .aClass166_10430
						       .anInt1762)
						      * -1095140607)
					     * f),
				     0.0F,
				     256.0F / ((float) ((class534_sub10
							 .aClass166_10430
							 .anInt1762)
							* -1095140607)
					       * f));
				class324.aClass438_3431.method6997
				    ((float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 16
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 8
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 0
					      & 0xff) / 255.0F);
			    } else {
				class324.aClass441_3438.method7105(0.0F, 0.0F,
								   0.0F, 0.0F);
				class324.aClass438_3431.method6997(0.0F, 0.0F,
								   0.0F);
			    }
			    byte i_114_ = 11;
			    if (class534_sub10.anInt10428 != -1) {
				Class186 class186
				    = (aClass185_Sub1_9377.aClass177_2012
					   .method2931
				       (class534_sub10.anInt10428, (byte) 1));
				i_114_ = class186.aByte2067;
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.aClass354_9211
					  .method6267(class186);
				class324.method5793(class186.aByte2068);
			    } else
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.anInterface38_9204;
			    aClass185_Sub1_9377.method14733
				(1, class534_sub10.anInterface37_10433);
			    aClass185_Sub1_9377.method14700(aClass349_9395);
			    class324.aClass433_3430.method6952
				(1.0F / class534_sub10.aFloat10432,
				 1.0F / class534_sub10.aFloat10432, 1.0F,
				 1.0F);
			    class324.anInt3447 = class534_sub10.anInt10437;
			    class324.anInt3428
				= (class534_sub10.anInt10438
				   - class534_sub10.anInt10437 + 1);
			    class324.anInt3449 = i_112_;
			    class324.anInt3450 = class534_sub10.anInt10436 / 3;
			    switch (i_114_) {
			    case 6:
				class324.method5812
				    (!Class72.method1559(i_114_, -2089975425));
				break;
			    case 2:
			    case 4:
			    case 8:
			    case 9:
				if (!aClass185_Sub1_9377.aBool9125
				    && (anInt9381 & 0x8) != 0
				    && aClass185_Sub1_9377
					   .aClass348_Sub1_Sub2_9236
					   .method17986((byte) 16)) {
				    Class348_Sub1_Sub2 class348_sub1_sub2
					= (aClass185_Sub1_9377
					   .aClass348_Sub1_Sub2_9236);
				    if (i_114_ == 2)
					class348_sub1_sub2
					    = (aClass185_Sub1_9377
					       .aClass348_Sub1_Sub2_9235);
				    class348_sub1_sub2.aClass433_11464
					.method6842
					(aClass185_Sub1_9377.aClass433_9164);
				    class348_sub1_sub2.aClass433_11466
					.method6952
					(1.0F / (class534_sub10.aFloat10432
						 * (float) ((class534_sub10
							     .aClass166_10430
							     .anInt1765)
							    * -108174347)),
					 1.0F / (class534_sub10.aFloat10432
						 * (float) ((class534_sub10
							     .aClass166_10430
							     .anInt1765)
							    * -108174347)),
					 1.0F, 1.0F);
				    class348_sub1_sub2.aClass438_11468
					.method6997
					((aClass185_Sub1_9377.aClass433_9118
					  .aFloatArray4853[12]),
					 (aClass185_Sub1_9377.aClass433_9118
					  .aFloatArray4853[13]),
					 (aClass185_Sub1_9377.aClass433_9118
					  .aFloatArray4853[14]));
				    Class186 class186
					= (aClass185_Sub1_9377
					       .aClass177_2012.method2931
					   (class534_sub10.anInt10428,
					    (byte) 1));
				    class348_sub1_sub2.anInt11461
					= class186.aByte2068 * 837530247;
				    class348_sub1_sub2.anInt11484
					= (class534_sub10.anInt10437
					   * 2134526643);
				    class348_sub1_sub2.anInt11483
					= ((class534_sub10.anInt10438
					    - class534_sub10.anInt10437 + 1)
					   * 257007611);
				    class348_sub1_sub2.anInt11473
					= i_112_ * 1042457319;
				    class348_sub1_sub2.anInt11487
					= (class534_sub10.anInt10436 / 3
					   * -1394271287);
				    class348_sub1_sub2.aClass441_11477
					.method7106(class324.aClass441_3438);
				    class348_sub1_sub2.aClass438_11459
					.method6992(class324.aClass438_3431);
				    class348_sub1_sub2.aClass441_11480
					.method7106(class324.aClass441_3440);
				    class348_sub1_sub2.aClass438_11465
					.method6992(class324.aClass438_3435);
				    class348_sub1_sub2.method17984(-253126171);
				} else
				    class324.method5796(0);
				break;
			    case 1:
				class324.aClass438_3433.method6997
				    ((aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[12]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[13]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[14]));
				if (aClass185_Sub1_9377.aBool9231)
				    class324.method5800();
				else
				    class324.method5810(0);
				break;
			    default:
				if (aClass185_Sub1_9377.aBool9231)
				    class324.method5799();
				else
				    class324.method5796(0);
				break;
			    case 7:
				class324.aClass438_3433.method6997
				    ((aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[12]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[13]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[14]));
				class324.aClass433_3446.method6840();
				class324.anInterface41_3434
				    = aClass185_Sub1_9377.method14616();
				class324.method5805(0);
			    }
			    i_112_ += class534_sub10.anInt10436;
			}
		    }
		}
	    }
	    if (!aClass700_9411.method14142(249268078)) {
		aClass185_Sub1_9377.method14687(128);
		aClass185_Sub1_9377.method14603(false);
		Class438 class438 = new Class438(class324.aClass438_3435);
		class324.aClass438_3435.method6997(0.0F, 0.0F, 0.0F);
		Iterator iterator = aClass700_9411.iterator();
		while (iterator.hasNext()) {
		    Class534_Sub13 class534_sub13
			= (Class534_Sub13) iterator.next();
		    class534_sub13.method16136(class324, i, i_94_, i_95_,
					       bools, bool);
		}
		class324.aClass438_3435.method6992(class438);
	    }
	    if (aClass338_9376 != null) {
		aClass185_Sub1_9377.method14687(1);
		aClass185_Sub1_9377.method14733(0, anInterface37_9398);
		aClass185_Sub1_9377.method14733(1, anInterface37_9399);
		aClass185_Sub1_9377.method14700(aClass349_9395);
		Class433 class433 = aClass185_Sub1_9377.aClass433_9194;
		class433.method6840();
		class433.aFloatArray4853[13] = -1.0F;
		class324.method5794(class433);
		aClass338_9376.method5909(class324, i, i_94_, i_95_, bools,
					  bool);
	    }
	}
    }
    
    public void method2510(int i, int i_115_, int[] is, int[] is_116_,
			   int[] is_117_, int[] is_118_, int[] is_119_,
			   int[] is_120_, int[] is_121_, int[] is_122_,
			   int[] is_123_, int[] is_124_, int[] is_125_,
			   Class166 class166, boolean bool) {
	int i_126_ = is_122_.length;
	int[] is_127_ = new int[i_126_ * 3];
	int[] is_128_ = new int[i_126_ * 3];
	int[] is_129_ = new int[i_126_ * 3];
	int[] is_130_ = new int[i_126_ * 3];
	int[] is_131_ = new int[i_126_ * 3];
	int[] is_132_ = new int[i_126_ * 3];
	int[] is_133_ = is_116_ != null ? new int[i_126_ * 3] : null;
	int[] is_134_ = is_118_ != null ? new int[i_126_ * 3] : null;
	int i_135_ = 0;
	for (int i_136_ = 0; i_136_ < i_126_; i_136_++) {
	    int i_137_ = is_119_[i_136_];
	    int i_138_ = is_120_[i_136_];
	    int i_139_ = is_121_[i_136_];
	    is_127_[i_135_] = is[i_137_];
	    is_128_[i_135_] = is_117_[i_137_];
	    is_129_[i_135_] = is_122_[i_136_];
	    is_131_[i_135_] = is_124_[i_136_];
	    is_132_[i_135_] = is_125_[i_136_];
	    is_130_[i_135_]
		= is_123_ != null ? is_123_[i_136_] : is_122_[i_136_];
	    if (is_116_ != null)
		is_133_[i_135_] = is_116_[i_137_];
	    if (is_118_ != null)
		is_134_[i_135_] = is_118_[i_137_];
	    i_135_++;
	    is_127_[i_135_] = is[i_138_];
	    is_128_[i_135_] = is_117_[i_138_];
	    is_129_[i_135_] = is_122_[i_136_];
	    is_131_[i_135_] = is_124_[i_136_];
	    is_132_[i_135_] = is_125_[i_136_];
	    is_130_[i_135_]
		= is_123_ != null ? is_123_[i_136_] : is_122_[i_136_];
	    if (is_116_ != null)
		is_133_[i_135_] = is_116_[i_138_];
	    if (is_118_ != null)
		is_134_[i_135_] = is_118_[i_138_];
	    i_135_++;
	    is_127_[i_135_] = is[i_139_];
	    is_128_[i_135_] = is_117_[i_139_];
	    is_129_[i_135_] = is_122_[i_136_];
	    is_131_[i_135_] = is_124_[i_136_];
	    is_132_[i_135_] = is_125_[i_136_];
	    is_130_[i_135_]
		= is_123_ != null ? is_123_[i_136_] : is_122_[i_136_];
	    if (is_116_ != null)
		is_133_[i_135_] = is_116_[i_139_];
	    if (is_118_ != null)
		is_134_[i_135_] = is_118_[i_139_];
	    i_135_++;
	}
	method2493(i, i_115_, is_127_, is_133_, is_128_, is_134_, is_129_,
		   is_130_, is_131_, is_132_, class166, bool);
    }
    
    void method15057() {
	if ((anInt9380 & 0x2) == 0) {
	    anIntArrayArrayArray9391 = null;
	    anIntArrayArrayArray9384 = null;
	    anIntArrayArrayArray9388 = null;
	}
	anIntArrayArrayArray9396 = null;
	anIntArrayArrayArray9416 = null;
	anIntArrayArrayArray9392 = null;
	aClass534_Sub10ArrayArrayArray9387 = null;
	aByteArrayArray9403 = null;
	aClass9_9385 = null;
	aClass534Array9408 = null;
	aFloatArrayArray9393 = null;
	aFloatArrayArray9397 = null;
	aFloatArrayArray9404 = null;
    }
    
    public void method2506(int i, int i_140_, int i_141_, boolean[][] bools,
			   boolean bool, int i_142_) {
	if (aClass534Array9375 != null) {
	    int i_143_ = i_141_ + i_141_ + 1;
	    i_143_ *= i_143_;
	    if (anIntArray9406.length < i_143_)
		anIntArray9406 = new int[i_143_];
	    int i_144_ = i - i_141_;
	    int i_145_ = i_144_;
	    if (i_144_ < 0)
		i_144_ = 0;
	    int i_146_ = i_140_ - i_141_;
	    int i_147_ = i_146_;
	    if (i_146_ < 0)
		i_146_ = 0;
	    int i_148_ = i + i_141_;
	    if (i_148_ > anInt1701 * -1924295585 - 1)
		i_148_ = anInt1701 * -1924295585 - 1;
	    int i_149_ = i_140_ + i_141_;
	    if (i_149_ > anInt1700 * -1466328823 - 1)
		i_149_ = anInt1700 * -1466328823 - 1;
	    anInt9415 = 0;
	    for (int i_150_ = i_144_; i_150_ <= i_148_; i_150_++) {
		boolean[] bools_151_ = bools[i_150_ - i_145_];
		for (int i_152_ = i_146_; i_152_ <= i_149_; i_152_++) {
		    if (bools_151_[i_152_ - i_147_])
			anIntArray9406[anInt9415++]
			    = i_152_ * (anInt1701 * -1924295585) + i_150_;
		}
	    }
	    ByteBuffer bytebuffer = aClass185_Sub1_9377.aByteBuffer9266;
	    bytebuffer.clear();
	    for (int i_153_ = 0; i_153_ < aClass534Array9375.length;
		 i_153_++) {
		Class534_Sub10 class534_sub10
		    = (Class534_Sub10) aClass534Array9375[i_153_];
		class534_sub10.method16125(anIntArray9406, anInt9415);
	    }
	    int i_154_ = bytebuffer.position();
	    Class324 class324 = aClass185_Sub1_9377.aClass324_9158;
	    aClass185_Sub1_9377.method14712();
	    if (aClass185_Sub1_9377.anInt9252 > 0) {
		class324.aClass438_3435.method6997
		    (((float) (aClass185_Sub1_9377.anInt9251 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (aClass185_Sub1_9377.anInt9251 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (aClass185_Sub1_9377.anInt9251 >> 0 & 0xff)
		      / 255.0F));
		class324.aClass441_3440.method7105(0.0F, 0.0F, 1.0F,
						   -(aClass185_Sub1_9377
						     .aFloat9254));
		class324.aClass441_3440
		    .method7111(aClass185_Sub1_9377.aClass433_9144);
		class324.aClass441_3440.method7110
		    (1.0F / (aClass185_Sub1_9377.aFloat9255
			     - aClass185_Sub1_9377.aFloat9254));
	    } else {
		class324.aClass441_3440.method7105(0.0F, 0.0F, 0.0F, 0.0F);
		class324.aClass438_3435.method6997(0.0F, 0.0F, 0.0F);
	    }
	    if (i_154_ != 0) {
		Interface39 interface39
		    = aClass185_Sub1_9377.method14725(i_154_ / 2);
		interface39.method235(0, i_154_,
				      aClass185_Sub1_9377.aLong9139);
		aClass185_Sub1_9377.method14733(0, anInterface37_9398);
		aClass185_Sub1_9377.method14701(interface39);
		class324.method5794(Class433.aClass433_4854);
		if ((anInt9381 & 0x7) == 0) {
		    int i_155_ = 0;
		    for (int i_156_ = 0; i_156_ < aClass534Array9375.length;
			 i_156_++) {
			Class534_Sub10 class534_sub10
			    = (Class534_Sub10) aClass534Array9375[i_156_];
			if (class534_sub10.anInt10436 != 0) {
			    if (aClass185_Sub1_9377.aBool9231) {
				aClass185_Sub1_9377.method3364
				    (0, class534_sub10.aClass166_10430);
				class324.aClass441_3438.method7105
				    (0.0F, 1.0F, 0.0F,
				     ((float) aClass185_Sub1_9377.anInt9247
				      + ((float) ((class534_sub10
						   .aClass166_10430.anInt1764)
						  * 1446227271)
					 / 255.0F
					 * (float) ((class534_sub10
						     .aClass166_10430
						     .anInt1762)
						    * -1095140607))));
				class324.aClass441_3438.method7110
				    (1.0F / (float) ((class534_sub10
						      .aClass166_10430
						      .anInt1762)
						     * -1095140607));
				class324.aClass438_3431.method6997
				    ((float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 16
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 8
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 0
					      & 0xff) / 255.0F);
			    } else {
				class324.aClass441_3438.method7105(0.0F, 0.0F,
								   0.0F, 0.0F);
				class324.aClass438_3431.method6997(0.0F, 0.0F,
								   0.0F);
			    }
			    boolean bool_157_ = false;
			    if (class534_sub10.anInt10428 != -1) {
				Class186 class186
				    = (aClass185_Sub1_9377.aClass177_2012
					   .method2931
				       (class534_sub10.anInt10428, (byte) 1));
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.aClass354_9211
					  .method6267(class186);
				bool_157_
				    = !Class72.method1559(class186.aByte2067,
							  -2056180739);
			    } else
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.anInterface38_9204;
			    aClass185_Sub1_9377.method14733
				(1, class534_sub10.anInterface37_10433);
			    aClass185_Sub1_9377.method14700(aClass349_9395);
			    class324.aClass433_3430.method6952
				(1.0F / class534_sub10.aFloat10432,
				 1.0F / class534_sub10.aFloat10432, 1.0F,
				 1.0F);
			    class324.anInt3447 = class534_sub10.anInt10437;
			    class324.anInt3428
				= (class534_sub10.anInt10438
				   - class534_sub10.anInt10437 + 1);
			    class324.anInt3449 = i_155_;
			    class324.anInt3450 = class534_sub10.anInt10436 / 3;
			    class324.method5812(bool_157_);
			    i_155_ += class534_sub10.anInt10436;
			}
		    }
		} else {
		    class324.aClass438_3442.method6997
			(aClass185_Sub1_9377.aFloatArray9197[0],
			 aClass185_Sub1_9377.aFloatArray9197[1],
			 aClass185_Sub1_9377.aFloatArray9197[2]);
		    class324.aClass438_3443.method6997
			((aClass185_Sub1_9377.aFloat9206
			  * aClass185_Sub1_9377.aFloat9159),
			 (aClass185_Sub1_9377.aFloat9206
			  * aClass185_Sub1_9377.aFloat9292),
			 (aClass185_Sub1_9377.aFloat9206
			  * aClass185_Sub1_9377.aFloat9163));
		    class324.aClass438_3444.method6997
			((-aClass185_Sub1_9377.aFloat9267
			  * aClass185_Sub1_9377.aFloat9159),
			 (-aClass185_Sub1_9377.aFloat9267
			  * aClass185_Sub1_9377.aFloat9292),
			 (-aClass185_Sub1_9377.aFloat9267
			  * aClass185_Sub1_9377.aFloat9163));
		    class324.aClass438_3445.method6997
			((aClass185_Sub1_9377.aFloat9205
			  * aClass185_Sub1_9377.aFloat9159),
			 (aClass185_Sub1_9377.aFloat9205
			  * aClass185_Sub1_9377.aFloat9292),
			 (aClass185_Sub1_9377.aFloat9205
			  * aClass185_Sub1_9377.aFloat9163));
		    int i_158_ = 0;
		    for (int i_159_ = 0; i_159_ < aClass534Array9375.length;
			 i_159_++) {
			Class534_Sub10 class534_sub10
			    = (Class534_Sub10) aClass534Array9375[i_159_];
			if (class534_sub10.anInt10436 > 0) {
			    if (aClass185_Sub1_9377.aBool9231) {
				aClass185_Sub1_9377.method3364
				    (0, class534_sub10.aClass166_10430);
				float f = 0.15F;
				class324.aClass441_3438.method7105
				    (0.0F,
				     1.0F / ((float) ((class534_sub10
						       .aClass166_10430
						       .anInt1762)
						      * -1095140607)
					     * f),
				     0.0F,
				     256.0F / ((float) ((class534_sub10
							 .aClass166_10430
							 .anInt1762)
							* -1095140607)
					       * f));
				class324.aClass438_3431.method6997
				    ((float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 16
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 8
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 0
					      & 0xff) / 255.0F);
			    } else {
				class324.aClass441_3438.method7105(0.0F, 0.0F,
								   0.0F, 0.0F);
				class324.aClass438_3431.method6997(0.0F, 0.0F,
								   0.0F);
			    }
			    byte i_160_ = 11;
			    if (class534_sub10.anInt10428 != -1) {
				Class186 class186
				    = (aClass185_Sub1_9377.aClass177_2012
					   .method2931
				       (class534_sub10.anInt10428, (byte) 1));
				i_160_ = class186.aByte2067;
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.aClass354_9211
					  .method6267(class186);
				class324.method5793(class186.aByte2068);
			    } else
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.anInterface38_9204;
			    aClass185_Sub1_9377.method14733
				(1, class534_sub10.anInterface37_10433);
			    aClass185_Sub1_9377.method14700(aClass349_9395);
			    class324.aClass433_3430.method6952
				(1.0F / class534_sub10.aFloat10432,
				 1.0F / class534_sub10.aFloat10432, 1.0F,
				 1.0F);
			    class324.anInt3447 = class534_sub10.anInt10437;
			    class324.anInt3428
				= (class534_sub10.anInt10438
				   - class534_sub10.anInt10437 + 1);
			    class324.anInt3449 = i_158_;
			    class324.anInt3450 = class534_sub10.anInt10436 / 3;
			    switch (i_160_) {
			    case 6:
				class324.method5812
				    (!Class72.method1559(i_160_, -2087819060));
				break;
			    case 2:
			    case 4:
			    case 8:
			    case 9:
				if (!aClass185_Sub1_9377.aBool9125
				    && (anInt9381 & 0x8) != 0
				    && aClass185_Sub1_9377
					   .aClass348_Sub1_Sub2_9236
					   .method17986((byte) 16)) {
				    Class348_Sub1_Sub2 class348_sub1_sub2
					= (aClass185_Sub1_9377
					   .aClass348_Sub1_Sub2_9236);
				    if (i_160_ == 2)
					class348_sub1_sub2
					    = (aClass185_Sub1_9377
					       .aClass348_Sub1_Sub2_9235);
				    class348_sub1_sub2.aClass433_11464
					.method6842
					(aClass185_Sub1_9377.aClass433_9164);
				    class348_sub1_sub2.aClass433_11466
					.method6952
					(1.0F / (class534_sub10.aFloat10432
						 * (float) ((class534_sub10
							     .aClass166_10430
							     .anInt1765)
							    * -108174347)),
					 1.0F / (class534_sub10.aFloat10432
						 * (float) ((class534_sub10
							     .aClass166_10430
							     .anInt1765)
							    * -108174347)),
					 1.0F, 1.0F);
				    class348_sub1_sub2.aClass438_11468
					.method6997
					((aClass185_Sub1_9377.aClass433_9118
					  .aFloatArray4853[12]),
					 (aClass185_Sub1_9377.aClass433_9118
					  .aFloatArray4853[13]),
					 (aClass185_Sub1_9377.aClass433_9118
					  .aFloatArray4853[14]));
				    Class186 class186
					= (aClass185_Sub1_9377
					       .aClass177_2012.method2931
					   (class534_sub10.anInt10428,
					    (byte) 1));
				    class348_sub1_sub2.anInt11461
					= class186.aByte2068 * 837530247;
				    class348_sub1_sub2.anInt11484
					= (class534_sub10.anInt10437
					   * 2134526643);
				    class348_sub1_sub2.anInt11483
					= ((class534_sub10.anInt10438
					    - class534_sub10.anInt10437 + 1)
					   * 257007611);
				    class348_sub1_sub2.anInt11473
					= i_158_ * 1042457319;
				    class348_sub1_sub2.anInt11487
					= (class534_sub10.anInt10436 / 3
					   * -1394271287);
				    class348_sub1_sub2.aClass441_11477
					.method7106(class324.aClass441_3438);
				    class348_sub1_sub2.aClass438_11459
					.method6992(class324.aClass438_3431);
				    class348_sub1_sub2.aClass441_11480
					.method7106(class324.aClass441_3440);
				    class348_sub1_sub2.aClass438_11465
					.method6992(class324.aClass438_3435);
				    class348_sub1_sub2.method17984(227764031);
				} else
				    class324.method5796(0);
				break;
			    case 1:
				class324.aClass438_3433.method6997
				    ((aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[12]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[13]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[14]));
				if (aClass185_Sub1_9377.aBool9231)
				    class324.method5800();
				else
				    class324.method5810(0);
				break;
			    default:
				if (aClass185_Sub1_9377.aBool9231)
				    class324.method5799();
				else
				    class324.method5796(0);
				break;
			    case 7:
				class324.aClass438_3433.method6997
				    ((aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[12]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[13]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[14]));
				class324.aClass433_3446.method6840();
				class324.anInterface41_3434
				    = aClass185_Sub1_9377.method14616();
				class324.method5805(0);
			    }
			    i_158_ += class534_sub10.anInt10436;
			}
		    }
		}
	    }
	    if (!aClass700_9411.method14142(1724713028)) {
		aClass185_Sub1_9377.method14687(128);
		aClass185_Sub1_9377.method14603(false);
		Class438 class438 = new Class438(class324.aClass438_3435);
		class324.aClass438_3435.method6997(0.0F, 0.0F, 0.0F);
		Iterator iterator = aClass700_9411.iterator();
		while (iterator.hasNext()) {
		    Class534_Sub13 class534_sub13
			= (Class534_Sub13) iterator.next();
		    class534_sub13.method16136(class324, i, i_140_, i_141_,
					       bools, bool);
		}
		class324.aClass438_3435.method6992(class438);
	    }
	    if (aClass338_9376 != null) {
		aClass185_Sub1_9377.method14687(1);
		aClass185_Sub1_9377.method14733(0, anInterface37_9398);
		aClass185_Sub1_9377.method14733(1, anInterface37_9399);
		aClass185_Sub1_9377.method14700(aClass349_9395);
		Class433 class433 = aClass185_Sub1_9377.aClass433_9194;
		class433.method6840();
		class433.aFloatArray4853[13] = -1.0F;
		class324.method5794(class433);
		aClass338_9376.method5909(class324, i, i_140_, i_141_, bools,
					  bool);
	    }
	}
    }
    
    public void method2527(int i, int i_161_, int i_162_, int i_163_,
			   int i_164_, int i_165_, int i_166_,
			   boolean[][] bools) {
	if (anInt9401 > 0) {
	    Interface39 interface39
		= aClass185_Sub1_9377.method14725(anInt9383);
	    int i_167_ = 0;
	    int i_168_ = 32767;
	    int i_169_ = -32768;
	    ByteBuffer bytebuffer = aClass185_Sub1_9377.aByteBuffer9266;
	    bytebuffer.clear();
	    for (int i_170_ = i_164_; i_170_ < i_166_; i_170_++) {
		int i_171_ = i_170_ * (anInt1701 * -1924295585) + i_163_;
		for (int i_172_ = i_163_; i_172_ < i_165_; i_172_++) {
		    if (bools[i_172_ - i_163_][i_170_ - i_164_]) {
			short[] is = aShortArrayArray9409[i_171_];
			if (is != null) {
			    for (int i_173_ = 0; i_173_ < is.length;
				 i_173_++) {
				int i_174_ = is[i_173_] & 0xffff;
				if (i_174_ > i_169_)
				    i_169_ = i_174_;
				if (i_174_ < i_168_)
				    i_168_ = i_174_;
				bytebuffer.putShort((short) i_174_);
				i_167_++;
			    }
			}
		    }
		    i_171_++;
		}
	    }
	    interface39.method235(0, bytebuffer.position(),
				  aClass185_Sub1_9377.aLong9139);
	    if (i_167_ > 0) {
		aClass185_Sub1_9377.method14712();
		Class324 class324 = aClass185_Sub1_9377.aClass324_9158;
		aClass185_Sub1_9377.method14733(0, anInterface37_9398);
		aClass185_Sub1_9377.method14733(1, anInterface37_9399);
		aClass185_Sub1_9377.method14700(aClass349_9395);
		aClass185_Sub1_9377.method14701(interface39);
		aClass185_Sub1_9377.method3335(Class446.aClass446_4905);
		float f = (float) aClass185_Sub1_9377.method3253
				      (-1657295195).method2910();
		float f_175_ = (float) aClass185_Sub1_9377.method3253
					   (-863324007).method2911();
		Class446 class446 = new Class446();
		Class446 class446_176_ = new Class446();
		class446.method7306(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F,
				    1.0F, 0.0F);
		class446_176_.method7248(((float) i_162_
					  / (256.0F * (float) (anInt1702
							       * 127780559))),
					 ((float) -i_162_
					  / (256.0F * (float) (anInt1702
							       * 127780559))),
					 1.0F / (aFloat9386 - aFloat9412));
		class446_176_.method7287
		    ((float) i - (float) (i_163_ * i_162_) / 256.0F,
		     (float) i_161_ + (float) (i_166_ * i_162_) / 256.0F,
		     -aFloat9412 / (aFloat9386 - aFloat9412));
		class446_176_.method7249(2.0F / f, 2.0F / f_175_, 1.0F);
		class446_176_.method7287(-1.0F, -1.0F, 0.0F);
		aClass185_Sub1_9377.aClass446_9166.method7235(class446,
							      class446_176_);
		aClass185_Sub1_9377.aClass433_9194
		    .method6916(aClass185_Sub1_9377.aClass446_9166);
		aClass185_Sub1_9377
		    .method3338(aClass185_Sub1_9377.aClass433_9194);
		class324.method5794(Class433.aClass433_4854);
		class324.aClass441_3440.method7105(0.0F, 0.0F, 0.0F, 0.0F);
		class324.aClass438_3435.method6997(0.0F, 0.0F, 0.0F);
		class324.aClass441_3438.method7105(0.0F, 0.0F, 0.0F, 0.0F);
		class324.aClass438_3431.method6997(0.0F, 0.0F, 0.0F);
		class324.anInterface38_3432
		    = aClass185_Sub1_9377.anInterface38_9204;
		class324.aClass433_3430.method6840();
		class324.anInt3447 = i_168_;
		class324.anInt3428 = i_169_ - i_168_ + 1;
		class324.anInt3449 = 0;
		class324.anInt3450 = i_167_ / 3;
		if (aClass185_Sub1_9377.aBool9190) {
		    aClass185_Sub1_9377.method3461(false);
		    class324.method5812(false);
		    aClass185_Sub1_9377.method3461(true);
		} else
		    class324.method5812(false);
	    }
	}
    }
    
    public Class534_Sub18_Sub16 method2526
	(int i, int i_177_, Class534_Sub18_Sub16 class534_sub18_sub16) {
	if ((aByteArrayArray9394[i][i_177_] & 0x1) == 0)
	    return null;
	int i_178_ = anInt1702 * 127780559 >> aClass185_Sub1_9377.anInt9212;
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2
	    = (Class534_Sub18_Sub16_Sub2) class534_sub18_sub16;
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2_179_;
	if (class534_sub18_sub16_sub2 != null
	    && class534_sub18_sub16_sub2.method18753(i_178_, i_178_)) {
	    class534_sub18_sub16_sub2_179_ = class534_sub18_sub16_sub2;
	    class534_sub18_sub16_sub2_179_.method18752();
	} else
	    class534_sub18_sub16_sub2_179_
		= new Class534_Sub18_Sub16_Sub2(aClass185_Sub1_9377, i_178_,
						i_178_);
	class534_sub18_sub16_sub2_179_.method18756(0, 0, i_178_, i_178_);
	method15058(class534_sub18_sub16_sub2_179_, i, i_177_);
	return class534_sub18_sub16_sub2_179_;
    }
    
    void method15058(Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2,
		     int i, int i_180_) {
	int[] is = anIntArrayArrayArray9384[i][i_180_];
	int[] is_181_ = anIntArrayArrayArray9391[i][i_180_];
	int i_182_ = is.length;
	if (anIntArray9413.length < i_182_) {
	    anIntArray9413 = new int[i_182_];
	    anIntArray9414 = new int[i_182_];
	}
	for (int i_183_ = 0; i_183_ < i_182_; i_183_++) {
	    anIntArray9413[i_183_]
		= is[i_183_] >> aClass185_Sub1_9377.anInt9212;
	    anIntArray9414[i_183_]
		= is_181_[i_183_] >> aClass185_Sub1_9377.anInt9212;
	}
	int i_184_ = 0;
	while (i_184_ < i_182_) {
	    int i_185_ = anIntArray9413[i_184_];
	    int i_186_ = anIntArray9414[i_184_++];
	    int i_187_ = anIntArray9413[i_184_];
	    int i_188_ = anIntArray9414[i_184_++];
	    int i_189_ = anIntArray9413[i_184_];
	    int i_190_ = anIntArray9414[i_184_++];
	    if (((i_185_ - i_187_) * (i_188_ - i_190_)
		 - (i_188_ - i_186_) * (i_189_ - i_187_))
		> 0)
		class534_sub18_sub16_sub2.method18755(i_186_, i_188_, i_190_,
						      i_185_, i_187_, i_189_);
	}
    }
    
    void method15059(int i, int i_191_, byte[][] is,
		     Class534_Sub10[] class534_sub10s, Class9 class9,
		     Class534_Sub10[] class534_sub10s_192_) {
	if (anIntArrayArrayArray9388[i][i_191_] != null) {
	    Class534_Sub10[] class534_sub10s_193_
		= aClass534_Sub10ArrayArrayArray9387[i][i_191_];
	    int[] is_194_ = anIntArrayArrayArray9384[i][i_191_];
	    int[] is_195_ = anIntArrayArrayArray9391[i][i_191_];
	    int[] is_196_ = anIntArrayArrayArray9416[i][i_191_];
	    int[] is_197_ = anIntArrayArrayArray9388[i][i_191_];
	    int[] is_198_ = (anIntArrayArrayArray9392 != null
			     ? anIntArrayArrayArray9392[i][i_191_] : null);
	    int[] is_199_ = (anIntArrayArrayArray9396 != null
			     ? anIntArrayArrayArray9396[i][i_191_] : null);
	    if (is_196_ == null)
		is_196_ = is_197_;
	    float f = aFloatArrayArray9404[i][i_191_];
	    float f_200_ = aFloatArrayArray9397[i][i_191_];
	    float f_201_ = aFloatArrayArray9393[i][i_191_];
	    float f_202_ = aFloatArrayArray9404[i][i_191_ + 1];
	    float f_203_ = aFloatArrayArray9397[i][i_191_ + 1];
	    float f_204_ = aFloatArrayArray9393[i][i_191_ + 1];
	    float f_205_ = aFloatArrayArray9404[i + 1][i_191_ + 1];
	    float f_206_ = aFloatArrayArray9397[i + 1][i_191_ + 1];
	    float f_207_ = aFloatArrayArray9393[i + 1][i_191_ + 1];
	    float f_208_ = aFloatArrayArray9404[i + 1][i_191_];
	    float f_209_ = aFloatArrayArray9397[i + 1][i_191_];
	    float f_210_ = aFloatArrayArray9393[i + 1][i_191_];
	    int i_211_ = is[i][i_191_] & 0xff;
	    int i_212_ = is[i][i_191_ + 1] & 0xff;
	    int i_213_ = is[i + 1][i_191_ + 1] & 0xff;
	    int i_214_ = is[i + 1][i_191_] & 0xff;
	    int i_215_ = 0;
	while_20_:
	    for (int i_216_ = 0; i_216_ < is_197_.length; i_216_++) {
		Class534_Sub10 class534_sub10 = class534_sub10s_193_[i_216_];
		for (int i_217_ = 0; i_217_ < i_215_; i_217_++) {
		    if (class534_sub10s[i_217_] == class534_sub10)
			continue while_20_;
		}
		class534_sub10s[i_215_++] = class534_sub10;
	    }
	    short[] is_218_
		= (aShortArrayArray9409[i_191_ * (anInt1701 * -1924295585) + i]
		   = new short[is_197_.length]);
	    for (int i_219_ = 0; i_219_ < is_197_.length; i_219_++) {
		int i_220_ = (i << anInt1703 * -1495101509) + is_194_[i_219_];
		int i_221_
		    = (i_191_ << anInt1703 * -1495101509) + is_195_[i_219_];
		int i_222_ = i_220_ >> anInt9378;
		int i_223_ = i_221_ >> anInt9378;
		int i_224_ = is_197_[i_219_];
		int i_225_ = is_196_[i_219_];
		int i_226_ = is_198_ != null ? is_198_[i_219_] : 0;
		long l = ((long) i_225_ << 48 | (long) i_224_ << 32
			  | (long) (i_222_ << 16) | (long) i_223_);
		int i_227_ = is_194_[i_219_];
		int i_228_ = is_195_[i_219_];
		int i_229_ = 74;
		int i_230_ = 0;
		float f_231_ = 1.0F;
		float f_232_;
		float f_233_;
		float f_234_;
		if (i_227_ == 0 && i_228_ == 0) {
		    f_232_ = f;
		    f_233_ = f_200_;
		    f_234_ = f_201_;
		    i_229_ -= i_211_;
		} else if (i_227_ == 0 && i_228_ == anInt1702 * 127780559) {
		    f_232_ = f_202_;
		    f_233_ = f_203_;
		    f_234_ = f_204_;
		    i_229_ -= i_212_;
		} else if (i_227_ == anInt1702 * 127780559
			   && i_228_ == anInt1702 * 127780559) {
		    f_232_ = f_205_;
		    f_233_ = f_206_;
		    f_234_ = f_207_;
		    i_229_ -= i_213_;
		} else if (i_227_ == anInt1702 * 127780559 && i_228_ == 0) {
		    f_232_ = f_208_;
		    f_233_ = f_209_;
		    f_234_ = f_210_;
		    i_229_ -= i_214_;
		} else {
		    float f_235_
			= (float) i_227_ / (float) (anInt1702 * 127780559);
		    float f_236_
			= (float) i_228_ / (float) (anInt1702 * 127780559);
		    float f_237_ = f + (f_208_ - f) * f_235_;
		    float f_238_ = f_200_ + (f_209_ - f_200_) * f_235_;
		    float f_239_ = f_201_ + (f_210_ - f_201_) * f_235_;
		    float f_240_ = f_202_ + (f_205_ - f_202_) * f_235_;
		    float f_241_ = f_203_ + (f_206_ - f_203_) * f_235_;
		    float f_242_ = f_204_ + (f_207_ - f_204_) * f_235_;
		    f_232_ = f_237_ + (f_240_ - f_237_) * f_236_;
		    f_233_ = f_238_ + (f_241_ - f_238_) * f_236_;
		    f_234_ = f_239_ + (f_242_ - f_239_) * f_236_;
		    int i_243_ = i_211_ + ((i_214_ - i_211_) * i_227_
					   >> anInt1703 * -1495101509);
		    int i_244_ = i_212_ + ((i_213_ - i_212_) * i_227_
					   >> anInt1703 * -1495101509);
		    i_229_ -= i_243_ + ((i_244_ - i_243_) * i_228_
					>> anInt1703 * -1495101509);
		}
		if (i_224_ != -1) {
		    int i_245_ = (i_224_ & 0x7f) * i_229_ >> 7;
		    if (i_245_ < 2)
			i_245_ = 2;
		    else if (i_245_ > 126)
			i_245_ = 126;
		    i_230_ = Class661.anIntArray8548[i_224_ & 0xff80 | i_245_];
		    if ((anInt9381 & 0x7) == 0) {
			f_231_
			    = (aClass185_Sub1_9377.aFloatArray9197[0] * f_232_
			       + (aClass185_Sub1_9377.aFloatArray9197[1]
				  * f_233_)
			       + (aClass185_Sub1_9377.aFloatArray9197[2]
				  * f_234_));
			f_231_
			    = (aClass185_Sub1_9377.aFloat9205
			       + f_231_ * (f_231_ > 0.0F
					   ? aClass185_Sub1_9377.aFloat9206
					   : aClass185_Sub1_9377.aFloat9267));
		    }
		}
		Class534 class534 = null;
		if ((i_220_ & anInt9379 - 1) == 0
		    && (i_221_ & anInt9379 - 1) == 0)
		    class534 = class9.method579(l);
		int i_246_;
		if (class534 == null) {
		    int i_247_;
		    if (i_225_ != i_224_) {
			int i_248_ = (i_225_ & 0x7f) * i_229_ >> 7;
			if (i_248_ < 2)
			    i_248_ = 2;
			else if (i_248_ > 126)
			    i_248_ = 126;
			i_247_ = (Class661.anIntArray8548
				  [i_225_ & 0xff80 | i_248_]);
			if ((anInt9381 & 0x7) == 0) {
			    float f_249_
				= ((aClass185_Sub1_9377.aFloatArray9197[0]
				    * f_232_)
				   + (aClass185_Sub1_9377.aFloatArray9197[1]
				      * f_233_)
				   + (aClass185_Sub1_9377.aFloatArray9197[2]
				      * f_234_));
			    f_249_
				= (aClass185_Sub1_9377.aFloat9205
				   + (f_231_
				      * (f_231_ > 0.0F
					 ? aClass185_Sub1_9377.aFloat9206
					 : aClass185_Sub1_9377.aFloat9267)));
			    int i_250_ = i_247_ >> 16 & 0xff;
			    int i_251_ = i_247_ >> 8 & 0xff;
			    int i_252_ = i_247_ & 0xff;
			    i_250_ *= f_249_;
			    if (i_250_ < 0)
				i_250_ = 0;
			    else if (i_250_ > 255)
				i_250_ = 255;
			    i_251_ *= f_249_;
			    if (i_251_ < 0)
				i_251_ = 0;
			    else if (i_251_ > 255)
				i_251_ = 255;
			    i_252_ *= f_249_;
			    if (i_252_ < 0)
				i_252_ = 0;
			    else if (i_252_ > 255)
				i_252_ = 255;
			    i_247_ = i_250_ << 16 | i_251_ << 8 | i_252_;
			}
		    } else
			i_247_ = i_230_;
		    aByteBuffer9400.putFloat((float) i_220_);
		    aByteBuffer9400.putFloat((float) (method2498(i_220_,
								 i_221_,
								 19677129)
						      + i_226_));
		    aByteBuffer9400.putFloat((float) i_221_);
		    aByteBuffer9400.putFloat((float) i_220_);
		    aByteBuffer9400.putFloat((float) i_221_);
		    if (anIntArrayArrayArray9396 != null)
			aByteBuffer9400.putFloat(is_199_ != null
						 ? (float) (is_199_[i_219_]
							    - 1)
						 : 0.0F);
		    if ((anInt9381 & 0x7) != 0) {
			aByteBuffer9400.putFloat(f_232_);
			aByteBuffer9400.putFloat(f_233_);
			aByteBuffer9400.putFloat(f_234_);
		    }
		    if (aClass185_Sub1_9377.anInt9268 == 0) {
			int i_253_ = i_247_ & ~0xff00ff;
			i_253_ |= (i_247_ & 0xff0000) >> 16;
			i_253_ |= (i_247_ & 0xff) << 16;
			i_247_ = i_253_;
		    }
		    aByteBuffer9410.putInt(~0xffffff | i_247_);
		    i_246_ = anInt9382++;
		    is_218_[i_219_] = (short) i_246_;
		    if (i_224_ != -1)
			class534_sub10s_192_[i_246_]
			    = class534_sub10s_193_[i_219_];
		    class9.method581(new Class534_Sub15(is_218_[i_219_]), l);
		} else {
		    is_218_[i_219_] = ((Class534_Sub15) class534).aShort10466;
		    i_246_ = is_218_[i_219_] & 0xffff;
		    if (i_224_ != -1
			&& ((class534_sub10s_193_[i_219_].aLong7158
			     * 8258869577519436579L)
			    < (class534_sub10s_192_[i_246_].aLong7158
			       * 8258869577519436579L)))
			class534_sub10s_192_[i_246_]
			    = class534_sub10s_193_[i_219_];
		}
		for (int i_254_ = 0; i_254_ < i_215_; i_254_++)
		    class534_sub10s[i_254_].method16119(i_246_, i_230_, i_229_,
							f_231_);
		anInt9383++;
	    }
	}
    }
    
    void method15060() {
	anInterface37_9399 = aClass185_Sub1_9377.method14698(false);
	anInterface37_9399.method236(anInt9382 * 4, 4);
	anInterface37_9399.method235(0, anInt9382 * 4,
				     aClass185_Sub1_9377
					 .method14588(aByteBuffer9410));
	anInterface37_9398 = aClass185_Sub1_9377.method14698(false);
	anInterface37_9398.method236(anInt9382 * anInt9390, anInt9390);
	anInterface37_9398.method235(0, anInt9382 * anInt9390,
				     aClass185_Sub1_9377
					 .method14588(aByteBuffer9400));
	aByteBuffer9410.clear();
	aByteBuffer9410 = null;
	aByteBuffer9400.clear();
	aByteBuffer9400 = null;
	if ((anInt9381 & 0x7) != 0) {
	    if (anIntArrayArrayArray9396 != null)
		aClass349_9395 = (aClass185_Sub1_9377.method14699
				  (new Class381[]
				   { new Class381(new Class350[]
						  { Class350.aClass350_3610,
						    Class350.aClass350_3597,
						    Class350.aClass350_3596,
						    Class350.aClass350_3594 }),
				     new Class381(Class350.aClass350_3595) }));
	    else
		aClass349_9395 = (aClass185_Sub1_9377.method14699
				  (new Class381[]
				   { new Class381(new Class350[]
						  { Class350.aClass350_3610,
						    Class350.aClass350_3597,
						    Class350.aClass350_3594 }),
				     new Class381(Class350.aClass350_3595) }));
	} else if (anIntArrayArrayArray9396 != null)
	    aClass349_9395
		= (aClass185_Sub1_9377.method14699
		   (new Class381[]
		    { new Class381(new Class350[] { Class350.aClass350_3610,
						    Class350.aClass350_3597,
						    Class350.aClass350_3596 }),
		      new Class381(Class350.aClass350_3595) }));
	else
	    aClass349_9395
		= (aClass185_Sub1_9377.method14699
		   (new Class381[]
		    { new Class381(new Class350[] { Class350.aClass350_3610,
						    Class350.aClass350_3597 }),
		      new Class381(Class350.aClass350_3595) }));
	for (int i = 0; i < anInt9407; i++) {
	    Class534_Sub10 class534_sub10
		= (Class534_Sub10) aClass534Array9408[i];
	    class534_sub10.method16120(anInt9382);
	}
	if (aClass338_9376 != null)
	    aClass338_9376.method5908();
	method15057();
    }
    
    public void method2503(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			   int i_255_, int i_256_, int i_257_, boolean bool) {
	if (aClass338_9376 != null && class534_sub18_sub16 != null) {
	    int i_258_ = (i - (i_255_ * aClass185_Sub1_9377.anInt9213 >> 8)
			  >> aClass185_Sub1_9377.anInt9212);
	    int i_259_
		= (i_256_ - (i_255_ * aClass185_Sub1_9377.anInt9287 >> 8)
		   >> aClass185_Sub1_9377.anInt9212);
	    aClass338_9376.method5930(class534_sub18_sub16, i_258_, i_259_);
	}
    }
    
    public void method2530(Class534_Sub21 class534_sub21, int[] is) {
	aClass700_9411.method14131(new Class534_Sub13(aClass185_Sub1_9377,
						      this, class534_sub21,
						      is),
				   (short) 789);
    }
    
    public void method2511(int i, int i_260_, int i_261_) {
	i = Math.min(aByteArrayArray9403.length - 1, Math.max(0, i));
	i_260_
	    = Math.min(aByteArrayArray9403[i].length - 1, Math.max(0, i_260_));
	if ((aByteArrayArray9403[i][i_260_] & 0xff) < i_261_)
	    aByteArrayArray9403[i][i_260_] = (byte) i_261_;
    }
    
    public void method2507(int i, int i_262_, int i_263_) {
	i = Math.min(aByteArrayArray9403.length - 1, Math.max(0, i));
	i_262_
	    = Math.min(aByteArrayArray9403[i].length - 1, Math.max(0, i_262_));
	if ((aByteArrayArray9403[i][i_262_] & 0xff) < i_263_)
	    aByteArrayArray9403[i][i_262_] = (byte) i_263_;
    }
    
    public void method2508(int i, int i_264_, int i_265_) {
	i = Math.min(aByteArrayArray9403.length - 1, Math.max(0, i));
	i_264_
	    = Math.min(aByteArrayArray9403[i].length - 1, Math.max(0, i_264_));
	if ((aByteArrayArray9403[i][i_264_] & 0xff) < i_265_)
	    aByteArrayArray9403[i][i_264_] = (byte) i_265_;
    }
    
    public void method2509(int i, int i_266_, int i_267_) {
	i = Math.min(aByteArrayArray9403.length - 1, Math.max(0, i));
	i_266_
	    = Math.min(aByteArrayArray9403[i].length - 1, Math.max(0, i_266_));
	if ((aByteArrayArray9403[i][i_266_] & 0xff) < i_267_)
	    aByteArrayArray9403[i][i_266_] = (byte) i_267_;
    }
    
    public void method2512() {
	if (anInt9401 <= 0) {
	    aClass338_9376 = null;
	    method15057();
	} else {
	    byte[][] is = (new byte[anInt1701 * -1924295585 + 1]
			   [anInt1700 * -1466328823 + 1]);
	    for (int i = 1; i < anInt1701 * -1924295585; i++) {
		for (int i_268_ = 1; i_268_ < anInt1700 * -1466328823;
		     i_268_++)
		    is[i][i_268_]
			= (byte) ((aByteArrayArray9403[i - 1][i_268_] >> 2)
				  + (aByteArrayArray9403[i + 1][i_268_] >> 3)
				  + (aByteArrayArray9403[i][i_268_ - 1] >> 2)
				  + (aByteArrayArray9403[i][i_268_ + 1] >> 3)
				  + (aByteArrayArray9403[i][i_268_] >> 1));
	    }
	    aClass534Array9408
		= new Class534[aClass9_9385.method600(1014614261)];
	    aClass9_9385.method580(aClass534Array9408, (byte) -7);
	    for (int i = 0; i < aClass534Array9408.length; i++)
		((Class534_Sub10) aClass534Array9408[i])
		    .method16116(anInt9401);
	    anInt9390 = 20;
	    if (anIntArrayArrayArray9396 != null)
		anInt9390 += 4;
	    if ((anInt9381 & 0x7) != 0)
		anInt9390 += 12;
	    aByteBuffer9410 = aClass185_Sub1_9377.method14587(anInt9401 * 4);
	    aByteBuffer9400
		= aClass185_Sub1_9377.method14587(anInt9401 * anInt9390);
	    Class534_Sub10[] class534_sub10s = new Class534_Sub10[anInt9401];
	    int i = Class455.method7422(anInt9401 / 4, -2075375894);
	    if (i < 1)
		i = 1;
	    Class9 class9 = new Class9(i);
	    Class534_Sub10[] class534_sub10s_269_
		= new Class534_Sub10[anInt9402];
	    for (int i_270_ = 0; i_270_ < anInt1701 * -1924295585; i_270_++) {
		for (int i_271_ = 0; i_271_ < anInt1700 * -1466328823;
		     i_271_++)
		    method15056(i_270_, i_271_, is, class534_sub10s_269_,
				class9, class534_sub10s);
	    }
	    for (int i_272_ = 0; i_272_ < anInt9382; i_272_++) {
		Class534_Sub10 class534_sub10 = class534_sub10s[i_272_];
		if (class534_sub10 != null)
		    class534_sub10.method16117(i_272_);
	    }
	    for (int i_273_ = 0; i_273_ < anInt1701 * -1924295585; i_273_++) {
		for (int i_274_ = 0; i_274_ < anInt1700 * -1466328823;
		     i_274_++) {
		    short[] is_275_
			= (aShortArrayArray9409
			   [i_274_ * (anInt1701 * -1924295585) + i_273_]);
		    if (is_275_ != null) {
			int i_276_ = 0;
			int i_277_ = 0;
			while (i_277_ < is_275_.length) {
			    int i_278_ = is_275_[i_277_++] & 0xffff;
			    int i_279_ = is_275_[i_277_++] & 0xffff;
			    int i_280_ = is_275_[i_277_++] & 0xffff;
			    Class534_Sub10 class534_sub10
				= class534_sub10s[i_278_];
			    Class534_Sub10 class534_sub10_281_
				= class534_sub10s[i_279_];
			    Class534_Sub10 class534_sub10_282_
				= class534_sub10s[i_280_];
			    Class534_Sub10 class534_sub10_283_ = null;
			    if (class534_sub10 != null) {
				class534_sub10.method16123(i_273_, i_274_,
							   i_276_);
				class534_sub10_283_ = class534_sub10;
			    }
			    if (class534_sub10_281_ != null) {
				class534_sub10_281_.method16123(i_273_, i_274_,
								i_276_);
				if (class534_sub10_283_ == null
				    || ((class534_sub10_281_.aLong7158
					 * 8258869577519436579L)
					< (class534_sub10_283_.aLong7158
					   * 8258869577519436579L)))
				    class534_sub10_283_ = class534_sub10_281_;
			    }
			    if (class534_sub10_282_ != null) {
				class534_sub10_282_.method16123(i_273_, i_274_,
								i_276_);
				if (class534_sub10_283_ == null
				    || ((class534_sub10_282_.aLong7158
					 * 8258869577519436579L)
					< (class534_sub10_283_.aLong7158
					   * 8258869577519436579L)))
				    class534_sub10_283_ = class534_sub10_282_;
			    }
			    if (class534_sub10_283_ != null) {
				if (class534_sub10 != null)
				    class534_sub10_283_.method16117(i_278_);
				if (class534_sub10_281_ != null)
				    class534_sub10_283_.method16117(i_279_);
				if (class534_sub10_282_ != null)
				    class534_sub10_283_.method16117(i_280_);
				class534_sub10_283_.method16123(i_273_, i_274_,
								i_276_);
			    }
			    i_276_++;
			}
		    }
		}
	    }
	    anInt9407 = 0;
	    for (int i_284_ = 0; i_284_ < aClass534Array9408.length;
		 i_284_++) {
		Class534_Sub10 class534_sub10
		    = (Class534_Sub10) aClass534Array9408[i_284_];
		if (class534_sub10.anInt10434 > 0)
		    aClass534Array9408[anInt9407++] = class534_sub10;
	    }
	    aClass534Array9375 = new Class534[anInt9407];
	    long[] ls = new long[anInt9407];
	    for (int i_285_ = 0; i_285_ < anInt9407; i_285_++) {
		Class534_Sub10 class534_sub10
		    = (Class534_Sub10) aClass534Array9408[i_285_];
		ls[i_285_] = class534_sub10.aLong7158 * 8258869577519436579L;
		aClass534Array9375[i_285_] = class534_sub10;
	    }
	    Class411.method6716(ls, aClass534Array9375, 1097269460);
	    method15060();
	}
    }
    
    public Class534_Sub18_Sub16 method2528
	(int i, int i_286_, Class534_Sub18_Sub16 class534_sub18_sub16) {
	if ((aByteArrayArray9394[i][i_286_] & 0x1) == 0)
	    return null;
	int i_287_ = anInt1702 * 127780559 >> aClass185_Sub1_9377.anInt9212;
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2
	    = (Class534_Sub18_Sub16_Sub2) class534_sub18_sub16;
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2_288_;
	if (class534_sub18_sub16_sub2 != null
	    && class534_sub18_sub16_sub2.method18753(i_287_, i_287_)) {
	    class534_sub18_sub16_sub2_288_ = class534_sub18_sub16_sub2;
	    class534_sub18_sub16_sub2_288_.method18752();
	} else
	    class534_sub18_sub16_sub2_288_
		= new Class534_Sub18_Sub16_Sub2(aClass185_Sub1_9377, i_287_,
						i_287_);
	class534_sub18_sub16_sub2_288_.method18756(0, 0, i_287_, i_287_);
	method15058(class534_sub18_sub16_sub2_288_, i, i_286_);
	return class534_sub18_sub16_sub2_288_;
    }
    
    public void method2494(int i, int i_289_, int[] is, int[] is_290_,
			   int[] is_291_, int[] is_292_, int[] is_293_,
			   int[] is_294_, int[] is_295_, int[] is_296_,
			   int[] is_297_, int[] is_298_, int[] is_299_,
			   Class166 class166, boolean bool) {
	int i_300_ = is_296_.length;
	int[] is_301_ = new int[i_300_ * 3];
	int[] is_302_ = new int[i_300_ * 3];
	int[] is_303_ = new int[i_300_ * 3];
	int[] is_304_ = new int[i_300_ * 3];
	int[] is_305_ = new int[i_300_ * 3];
	int[] is_306_ = new int[i_300_ * 3];
	int[] is_307_ = is_290_ != null ? new int[i_300_ * 3] : null;
	int[] is_308_ = is_292_ != null ? new int[i_300_ * 3] : null;
	int i_309_ = 0;
	for (int i_310_ = 0; i_310_ < i_300_; i_310_++) {
	    int i_311_ = is_293_[i_310_];
	    int i_312_ = is_294_[i_310_];
	    int i_313_ = is_295_[i_310_];
	    is_301_[i_309_] = is[i_311_];
	    is_302_[i_309_] = is_291_[i_311_];
	    is_303_[i_309_] = is_296_[i_310_];
	    is_305_[i_309_] = is_298_[i_310_];
	    is_306_[i_309_] = is_299_[i_310_];
	    is_304_[i_309_]
		= is_297_ != null ? is_297_[i_310_] : is_296_[i_310_];
	    if (is_290_ != null)
		is_307_[i_309_] = is_290_[i_311_];
	    if (is_292_ != null)
		is_308_[i_309_] = is_292_[i_311_];
	    i_309_++;
	    is_301_[i_309_] = is[i_312_];
	    is_302_[i_309_] = is_291_[i_312_];
	    is_303_[i_309_] = is_296_[i_310_];
	    is_305_[i_309_] = is_298_[i_310_];
	    is_306_[i_309_] = is_299_[i_310_];
	    is_304_[i_309_]
		= is_297_ != null ? is_297_[i_310_] : is_296_[i_310_];
	    if (is_290_ != null)
		is_307_[i_309_] = is_290_[i_312_];
	    if (is_292_ != null)
		is_308_[i_309_] = is_292_[i_312_];
	    i_309_++;
	    is_301_[i_309_] = is[i_313_];
	    is_302_[i_309_] = is_291_[i_313_];
	    is_303_[i_309_] = is_296_[i_310_];
	    is_305_[i_309_] = is_298_[i_310_];
	    is_306_[i_309_] = is_299_[i_310_];
	    is_304_[i_309_]
		= is_297_ != null ? is_297_[i_310_] : is_296_[i_310_];
	    if (is_290_ != null)
		is_307_[i_309_] = is_290_[i_313_];
	    if (is_292_ != null)
		is_308_[i_309_] = is_292_[i_313_];
	    i_309_++;
	}
	method2493(i, i_289_, is_301_, is_307_, is_302_, is_308_, is_303_,
		   is_304_, is_305_, is_306_, class166, bool);
    }
    
    public void method2500(int i, int i_314_, int i_315_, boolean[][] bools,
			   boolean bool, int i_316_) {
	if (aClass534Array9375 != null) {
	    int i_317_ = i_315_ + i_315_ + 1;
	    i_317_ *= i_317_;
	    if (anIntArray9406.length < i_317_)
		anIntArray9406 = new int[i_317_];
	    int i_318_ = i - i_315_;
	    int i_319_ = i_318_;
	    if (i_318_ < 0)
		i_318_ = 0;
	    int i_320_ = i_314_ - i_315_;
	    int i_321_ = i_320_;
	    if (i_320_ < 0)
		i_320_ = 0;
	    int i_322_ = i + i_315_;
	    if (i_322_ > anInt1701 * -1924295585 - 1)
		i_322_ = anInt1701 * -1924295585 - 1;
	    int i_323_ = i_314_ + i_315_;
	    if (i_323_ > anInt1700 * -1466328823 - 1)
		i_323_ = anInt1700 * -1466328823 - 1;
	    anInt9415 = 0;
	    for (int i_324_ = i_318_; i_324_ <= i_322_; i_324_++) {
		boolean[] bools_325_ = bools[i_324_ - i_319_];
		for (int i_326_ = i_320_; i_326_ <= i_323_; i_326_++) {
		    if (bools_325_[i_326_ - i_321_])
			anIntArray9406[anInt9415++]
			    = i_326_ * (anInt1701 * -1924295585) + i_324_;
		}
	    }
	    ByteBuffer bytebuffer = aClass185_Sub1_9377.aByteBuffer9266;
	    bytebuffer.clear();
	    for (int i_327_ = 0; i_327_ < aClass534Array9375.length;
		 i_327_++) {
		Class534_Sub10 class534_sub10
		    = (Class534_Sub10) aClass534Array9375[i_327_];
		class534_sub10.method16125(anIntArray9406, anInt9415);
	    }
	    int i_328_ = bytebuffer.position();
	    Class324 class324 = aClass185_Sub1_9377.aClass324_9158;
	    aClass185_Sub1_9377.method14712();
	    if (aClass185_Sub1_9377.anInt9252 > 0) {
		class324.aClass438_3435.method6997
		    (((float) (aClass185_Sub1_9377.anInt9251 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (aClass185_Sub1_9377.anInt9251 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (aClass185_Sub1_9377.anInt9251 >> 0 & 0xff)
		      / 255.0F));
		class324.aClass441_3440.method7105(0.0F, 0.0F, 1.0F,
						   -(aClass185_Sub1_9377
						     .aFloat9254));
		class324.aClass441_3440
		    .method7111(aClass185_Sub1_9377.aClass433_9144);
		class324.aClass441_3440.method7110
		    (1.0F / (aClass185_Sub1_9377.aFloat9255
			     - aClass185_Sub1_9377.aFloat9254));
	    } else {
		class324.aClass441_3440.method7105(0.0F, 0.0F, 0.0F, 0.0F);
		class324.aClass438_3435.method6997(0.0F, 0.0F, 0.0F);
	    }
	    if (i_328_ != 0) {
		Interface39 interface39
		    = aClass185_Sub1_9377.method14725(i_328_ / 2);
		interface39.method235(0, i_328_,
				      aClass185_Sub1_9377.aLong9139);
		aClass185_Sub1_9377.method14733(0, anInterface37_9398);
		aClass185_Sub1_9377.method14701(interface39);
		class324.method5794(Class433.aClass433_4854);
		if ((anInt9381 & 0x7) == 0) {
		    int i_329_ = 0;
		    for (int i_330_ = 0; i_330_ < aClass534Array9375.length;
			 i_330_++) {
			Class534_Sub10 class534_sub10
			    = (Class534_Sub10) aClass534Array9375[i_330_];
			if (class534_sub10.anInt10436 != 0) {
			    if (aClass185_Sub1_9377.aBool9231) {
				aClass185_Sub1_9377.method3364
				    (0, class534_sub10.aClass166_10430);
				class324.aClass441_3438.method7105
				    (0.0F, 1.0F, 0.0F,
				     ((float) aClass185_Sub1_9377.anInt9247
				      + ((float) ((class534_sub10
						   .aClass166_10430.anInt1764)
						  * 1446227271)
					 / 255.0F
					 * (float) ((class534_sub10
						     .aClass166_10430
						     .anInt1762)
						    * -1095140607))));
				class324.aClass441_3438.method7110
				    (1.0F / (float) ((class534_sub10
						      .aClass166_10430
						      .anInt1762)
						     * -1095140607));
				class324.aClass438_3431.method6997
				    ((float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 16
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 8
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 0
					      & 0xff) / 255.0F);
			    } else {
				class324.aClass441_3438.method7105(0.0F, 0.0F,
								   0.0F, 0.0F);
				class324.aClass438_3431.method6997(0.0F, 0.0F,
								   0.0F);
			    }
			    boolean bool_331_ = false;
			    if (class534_sub10.anInt10428 != -1) {
				Class186 class186
				    = (aClass185_Sub1_9377.aClass177_2012
					   .method2931
				       (class534_sub10.anInt10428, (byte) 1));
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.aClass354_9211
					  .method6267(class186);
				bool_331_
				    = !Class72.method1559(class186.aByte2067,
							  -1710392121);
			    } else
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.anInterface38_9204;
			    aClass185_Sub1_9377.method14733
				(1, class534_sub10.anInterface37_10433);
			    aClass185_Sub1_9377.method14700(aClass349_9395);
			    class324.aClass433_3430.method6952
				(1.0F / class534_sub10.aFloat10432,
				 1.0F / class534_sub10.aFloat10432, 1.0F,
				 1.0F);
			    class324.anInt3447 = class534_sub10.anInt10437;
			    class324.anInt3428
				= (class534_sub10.anInt10438
				   - class534_sub10.anInt10437 + 1);
			    class324.anInt3449 = i_329_;
			    class324.anInt3450 = class534_sub10.anInt10436 / 3;
			    class324.method5812(bool_331_);
			    i_329_ += class534_sub10.anInt10436;
			}
		    }
		} else {
		    class324.aClass438_3442.method6997
			(aClass185_Sub1_9377.aFloatArray9197[0],
			 aClass185_Sub1_9377.aFloatArray9197[1],
			 aClass185_Sub1_9377.aFloatArray9197[2]);
		    class324.aClass438_3443.method6997
			((aClass185_Sub1_9377.aFloat9206
			  * aClass185_Sub1_9377.aFloat9159),
			 (aClass185_Sub1_9377.aFloat9206
			  * aClass185_Sub1_9377.aFloat9292),
			 (aClass185_Sub1_9377.aFloat9206
			  * aClass185_Sub1_9377.aFloat9163));
		    class324.aClass438_3444.method6997
			((-aClass185_Sub1_9377.aFloat9267
			  * aClass185_Sub1_9377.aFloat9159),
			 (-aClass185_Sub1_9377.aFloat9267
			  * aClass185_Sub1_9377.aFloat9292),
			 (-aClass185_Sub1_9377.aFloat9267
			  * aClass185_Sub1_9377.aFloat9163));
		    class324.aClass438_3445.method6997
			((aClass185_Sub1_9377.aFloat9205
			  * aClass185_Sub1_9377.aFloat9159),
			 (aClass185_Sub1_9377.aFloat9205
			  * aClass185_Sub1_9377.aFloat9292),
			 (aClass185_Sub1_9377.aFloat9205
			  * aClass185_Sub1_9377.aFloat9163));
		    int i_332_ = 0;
		    for (int i_333_ = 0; i_333_ < aClass534Array9375.length;
			 i_333_++) {
			Class534_Sub10 class534_sub10
			    = (Class534_Sub10) aClass534Array9375[i_333_];
			if (class534_sub10.anInt10436 > 0) {
			    if (aClass185_Sub1_9377.aBool9231) {
				aClass185_Sub1_9377.method3364
				    (0, class534_sub10.aClass166_10430);
				float f = 0.15F;
				class324.aClass441_3438.method7105
				    (0.0F,
				     1.0F / ((float) ((class534_sub10
						       .aClass166_10430
						       .anInt1762)
						      * -1095140607)
					     * f),
				     0.0F,
				     256.0F / ((float) ((class534_sub10
							 .aClass166_10430
							 .anInt1762)
							* -1095140607)
					       * f));
				class324.aClass438_3431.method6997
				    ((float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 16
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 8
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 0
					      & 0xff) / 255.0F);
			    } else {
				class324.aClass441_3438.method7105(0.0F, 0.0F,
								   0.0F, 0.0F);
				class324.aClass438_3431.method6997(0.0F, 0.0F,
								   0.0F);
			    }
			    byte i_334_ = 11;
			    if (class534_sub10.anInt10428 != -1) {
				Class186 class186
				    = (aClass185_Sub1_9377.aClass177_2012
					   .method2931
				       (class534_sub10.anInt10428, (byte) 1));
				i_334_ = class186.aByte2067;
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.aClass354_9211
					  .method6267(class186);
				class324.method5793(class186.aByte2068);
			    } else
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.anInterface38_9204;
			    aClass185_Sub1_9377.method14733
				(1, class534_sub10.anInterface37_10433);
			    aClass185_Sub1_9377.method14700(aClass349_9395);
			    class324.aClass433_3430.method6952
				(1.0F / class534_sub10.aFloat10432,
				 1.0F / class534_sub10.aFloat10432, 1.0F,
				 1.0F);
			    class324.anInt3447 = class534_sub10.anInt10437;
			    class324.anInt3428
				= (class534_sub10.anInt10438
				   - class534_sub10.anInt10437 + 1);
			    class324.anInt3449 = i_332_;
			    class324.anInt3450 = class534_sub10.anInt10436 / 3;
			    switch (i_334_) {
			    case 6:
				class324.method5812
				    (!Class72.method1559(i_334_, -1906728790));
				break;
			    case 2:
			    case 4:
			    case 8:
			    case 9:
				if (!aClass185_Sub1_9377.aBool9125
				    && (anInt9381 & 0x8) != 0
				    && aClass185_Sub1_9377
					   .aClass348_Sub1_Sub2_9236
					   .method17986((byte) 16)) {
				    Class348_Sub1_Sub2 class348_sub1_sub2
					= (aClass185_Sub1_9377
					   .aClass348_Sub1_Sub2_9236);
				    if (i_334_ == 2)
					class348_sub1_sub2
					    = (aClass185_Sub1_9377
					       .aClass348_Sub1_Sub2_9235);
				    class348_sub1_sub2.aClass433_11464
					.method6842
					(aClass185_Sub1_9377.aClass433_9164);
				    class348_sub1_sub2.aClass433_11466
					.method6952
					(1.0F / (class534_sub10.aFloat10432
						 * (float) ((class534_sub10
							     .aClass166_10430
							     .anInt1765)
							    * -108174347)),
					 1.0F / (class534_sub10.aFloat10432
						 * (float) ((class534_sub10
							     .aClass166_10430
							     .anInt1765)
							    * -108174347)),
					 1.0F, 1.0F);
				    class348_sub1_sub2.aClass438_11468
					.method6997
					((aClass185_Sub1_9377.aClass433_9118
					  .aFloatArray4853[12]),
					 (aClass185_Sub1_9377.aClass433_9118
					  .aFloatArray4853[13]),
					 (aClass185_Sub1_9377.aClass433_9118
					  .aFloatArray4853[14]));
				    Class186 class186
					= (aClass185_Sub1_9377
					       .aClass177_2012.method2931
					   (class534_sub10.anInt10428,
					    (byte) 1));
				    class348_sub1_sub2.anInt11461
					= class186.aByte2068 * 837530247;
				    class348_sub1_sub2.anInt11484
					= (class534_sub10.anInt10437
					   * 2134526643);
				    class348_sub1_sub2.anInt11483
					= ((class534_sub10.anInt10438
					    - class534_sub10.anInt10437 + 1)
					   * 257007611);
				    class348_sub1_sub2.anInt11473
					= i_332_ * 1042457319;
				    class348_sub1_sub2.anInt11487
					= (class534_sub10.anInt10436 / 3
					   * -1394271287);
				    class348_sub1_sub2.aClass441_11477
					.method7106(class324.aClass441_3438);
				    class348_sub1_sub2.aClass438_11459
					.method6992(class324.aClass438_3431);
				    class348_sub1_sub2.aClass441_11480
					.method7106(class324.aClass441_3440);
				    class348_sub1_sub2.aClass438_11465
					.method6992(class324.aClass438_3435);
				    class348_sub1_sub2.method17984(-841879490);
				} else
				    class324.method5796(0);
				break;
			    case 1:
				class324.aClass438_3433.method6997
				    ((aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[12]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[13]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[14]));
				if (aClass185_Sub1_9377.aBool9231)
				    class324.method5800();
				else
				    class324.method5810(0);
				break;
			    default:
				if (aClass185_Sub1_9377.aBool9231)
				    class324.method5799();
				else
				    class324.method5796(0);
				break;
			    case 7:
				class324.aClass438_3433.method6997
				    ((aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[12]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[13]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[14]));
				class324.aClass433_3446.method6840();
				class324.anInterface41_3434
				    = aClass185_Sub1_9377.method14616();
				class324.method5805(0);
			    }
			    i_332_ += class534_sub10.anInt10436;
			}
		    }
		}
	    }
	    if (!aClass700_9411.method14142(502024034)) {
		aClass185_Sub1_9377.method14687(128);
		aClass185_Sub1_9377.method14603(false);
		Class438 class438 = new Class438(class324.aClass438_3435);
		class324.aClass438_3435.method6997(0.0F, 0.0F, 0.0F);
		Iterator iterator = aClass700_9411.iterator();
		while (iterator.hasNext()) {
		    Class534_Sub13 class534_sub13
			= (Class534_Sub13) iterator.next();
		    class534_sub13.method16136(class324, i, i_314_, i_315_,
					       bools, bool);
		}
		class324.aClass438_3435.method6992(class438);
	    }
	    if (aClass338_9376 != null) {
		aClass185_Sub1_9377.method14687(1);
		aClass185_Sub1_9377.method14733(0, anInterface37_9398);
		aClass185_Sub1_9377.method14733(1, anInterface37_9399);
		aClass185_Sub1_9377.method14700(aClass349_9395);
		Class433 class433 = aClass185_Sub1_9377.aClass433_9194;
		class433.method6840();
		class433.aFloatArray4853[13] = -1.0F;
		class324.method5794(class433);
		aClass338_9376.method5909(class324, i, i_314_, i_315_, bools,
					  bool);
	    }
	}
    }
    
    public void method2514(int i, int i_335_, int i_336_, boolean[][] bools,
			   boolean bool, int i_337_) {
	if (aClass534Array9375 != null) {
	    int i_338_ = i_336_ + i_336_ + 1;
	    i_338_ *= i_338_;
	    if (anIntArray9406.length < i_338_)
		anIntArray9406 = new int[i_338_];
	    int i_339_ = i - i_336_;
	    int i_340_ = i_339_;
	    if (i_339_ < 0)
		i_339_ = 0;
	    int i_341_ = i_335_ - i_336_;
	    int i_342_ = i_341_;
	    if (i_341_ < 0)
		i_341_ = 0;
	    int i_343_ = i + i_336_;
	    if (i_343_ > anInt1701 * -1924295585 - 1)
		i_343_ = anInt1701 * -1924295585 - 1;
	    int i_344_ = i_335_ + i_336_;
	    if (i_344_ > anInt1700 * -1466328823 - 1)
		i_344_ = anInt1700 * -1466328823 - 1;
	    anInt9415 = 0;
	    for (int i_345_ = i_339_; i_345_ <= i_343_; i_345_++) {
		boolean[] bools_346_ = bools[i_345_ - i_340_];
		for (int i_347_ = i_341_; i_347_ <= i_344_; i_347_++) {
		    if (bools_346_[i_347_ - i_342_])
			anIntArray9406[anInt9415++]
			    = i_347_ * (anInt1701 * -1924295585) + i_345_;
		}
	    }
	    ByteBuffer bytebuffer = aClass185_Sub1_9377.aByteBuffer9266;
	    bytebuffer.clear();
	    for (int i_348_ = 0; i_348_ < aClass534Array9375.length;
		 i_348_++) {
		Class534_Sub10 class534_sub10
		    = (Class534_Sub10) aClass534Array9375[i_348_];
		class534_sub10.method16125(anIntArray9406, anInt9415);
	    }
	    int i_349_ = bytebuffer.position();
	    Class324 class324 = aClass185_Sub1_9377.aClass324_9158;
	    aClass185_Sub1_9377.method14712();
	    if (aClass185_Sub1_9377.anInt9252 > 0) {
		class324.aClass438_3435.method6997
		    (((float) (aClass185_Sub1_9377.anInt9251 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (aClass185_Sub1_9377.anInt9251 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (aClass185_Sub1_9377.anInt9251 >> 0 & 0xff)
		      / 255.0F));
		class324.aClass441_3440.method7105(0.0F, 0.0F, 1.0F,
						   -(aClass185_Sub1_9377
						     .aFloat9254));
		class324.aClass441_3440
		    .method7111(aClass185_Sub1_9377.aClass433_9144);
		class324.aClass441_3440.method7110
		    (1.0F / (aClass185_Sub1_9377.aFloat9255
			     - aClass185_Sub1_9377.aFloat9254));
	    } else {
		class324.aClass441_3440.method7105(0.0F, 0.0F, 0.0F, 0.0F);
		class324.aClass438_3435.method6997(0.0F, 0.0F, 0.0F);
	    }
	    if (i_349_ != 0) {
		Interface39 interface39
		    = aClass185_Sub1_9377.method14725(i_349_ / 2);
		interface39.method235(0, i_349_,
				      aClass185_Sub1_9377.aLong9139);
		aClass185_Sub1_9377.method14733(0, anInterface37_9398);
		aClass185_Sub1_9377.method14701(interface39);
		class324.method5794(Class433.aClass433_4854);
		if ((anInt9381 & 0x7) == 0) {
		    int i_350_ = 0;
		    for (int i_351_ = 0; i_351_ < aClass534Array9375.length;
			 i_351_++) {
			Class534_Sub10 class534_sub10
			    = (Class534_Sub10) aClass534Array9375[i_351_];
			if (class534_sub10.anInt10436 != 0) {
			    if (aClass185_Sub1_9377.aBool9231) {
				aClass185_Sub1_9377.method3364
				    (0, class534_sub10.aClass166_10430);
				class324.aClass441_3438.method7105
				    (0.0F, 1.0F, 0.0F,
				     ((float) aClass185_Sub1_9377.anInt9247
				      + ((float) ((class534_sub10
						   .aClass166_10430.anInt1764)
						  * 1446227271)
					 / 255.0F
					 * (float) ((class534_sub10
						     .aClass166_10430
						     .anInt1762)
						    * -1095140607))));
				class324.aClass441_3438.method7110
				    (1.0F / (float) ((class534_sub10
						      .aClass166_10430
						      .anInt1762)
						     * -1095140607));
				class324.aClass438_3431.method6997
				    ((float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 16
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 8
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 0
					      & 0xff) / 255.0F);
			    } else {
				class324.aClass441_3438.method7105(0.0F, 0.0F,
								   0.0F, 0.0F);
				class324.aClass438_3431.method6997(0.0F, 0.0F,
								   0.0F);
			    }
			    boolean bool_352_ = false;
			    if (class534_sub10.anInt10428 != -1) {
				Class186 class186
				    = (aClass185_Sub1_9377.aClass177_2012
					   .method2931
				       (class534_sub10.anInt10428, (byte) 1));
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.aClass354_9211
					  .method6267(class186);
				bool_352_
				    = !Class72.method1559(class186.aByte2067,
							  -2018419101);
			    } else
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.anInterface38_9204;
			    aClass185_Sub1_9377.method14733
				(1, class534_sub10.anInterface37_10433);
			    aClass185_Sub1_9377.method14700(aClass349_9395);
			    class324.aClass433_3430.method6952
				(1.0F / class534_sub10.aFloat10432,
				 1.0F / class534_sub10.aFloat10432, 1.0F,
				 1.0F);
			    class324.anInt3447 = class534_sub10.anInt10437;
			    class324.anInt3428
				= (class534_sub10.anInt10438
				   - class534_sub10.anInt10437 + 1);
			    class324.anInt3449 = i_350_;
			    class324.anInt3450 = class534_sub10.anInt10436 / 3;
			    class324.method5812(bool_352_);
			    i_350_ += class534_sub10.anInt10436;
			}
		    }
		} else {
		    class324.aClass438_3442.method6997
			(aClass185_Sub1_9377.aFloatArray9197[0],
			 aClass185_Sub1_9377.aFloatArray9197[1],
			 aClass185_Sub1_9377.aFloatArray9197[2]);
		    class324.aClass438_3443.method6997
			((aClass185_Sub1_9377.aFloat9206
			  * aClass185_Sub1_9377.aFloat9159),
			 (aClass185_Sub1_9377.aFloat9206
			  * aClass185_Sub1_9377.aFloat9292),
			 (aClass185_Sub1_9377.aFloat9206
			  * aClass185_Sub1_9377.aFloat9163));
		    class324.aClass438_3444.method6997
			((-aClass185_Sub1_9377.aFloat9267
			  * aClass185_Sub1_9377.aFloat9159),
			 (-aClass185_Sub1_9377.aFloat9267
			  * aClass185_Sub1_9377.aFloat9292),
			 (-aClass185_Sub1_9377.aFloat9267
			  * aClass185_Sub1_9377.aFloat9163));
		    class324.aClass438_3445.method6997
			((aClass185_Sub1_9377.aFloat9205
			  * aClass185_Sub1_9377.aFloat9159),
			 (aClass185_Sub1_9377.aFloat9205
			  * aClass185_Sub1_9377.aFloat9292),
			 (aClass185_Sub1_9377.aFloat9205
			  * aClass185_Sub1_9377.aFloat9163));
		    int i_353_ = 0;
		    for (int i_354_ = 0; i_354_ < aClass534Array9375.length;
			 i_354_++) {
			Class534_Sub10 class534_sub10
			    = (Class534_Sub10) aClass534Array9375[i_354_];
			if (class534_sub10.anInt10436 > 0) {
			    if (aClass185_Sub1_9377.aBool9231) {
				aClass185_Sub1_9377.method3364
				    (0, class534_sub10.aClass166_10430);
				float f = 0.15F;
				class324.aClass441_3438.method7105
				    (0.0F,
				     1.0F / ((float) ((class534_sub10
						       .aClass166_10430
						       .anInt1762)
						      * -1095140607)
					     * f),
				     0.0F,
				     256.0F / ((float) ((class534_sub10
							 .aClass166_10430
							 .anInt1762)
							* -1095140607)
					       * f));
				class324.aClass438_3431.method6997
				    ((float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 16
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 8
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 0
					      & 0xff) / 255.0F);
			    } else {
				class324.aClass441_3438.method7105(0.0F, 0.0F,
								   0.0F, 0.0F);
				class324.aClass438_3431.method6997(0.0F, 0.0F,
								   0.0F);
			    }
			    byte i_355_ = 11;
			    if (class534_sub10.anInt10428 != -1) {
				Class186 class186
				    = (aClass185_Sub1_9377.aClass177_2012
					   .method2931
				       (class534_sub10.anInt10428, (byte) 1));
				i_355_ = class186.aByte2067;
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.aClass354_9211
					  .method6267(class186);
				class324.method5793(class186.aByte2068);
			    } else
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.anInterface38_9204;
			    aClass185_Sub1_9377.method14733
				(1, class534_sub10.anInterface37_10433);
			    aClass185_Sub1_9377.method14700(aClass349_9395);
			    class324.aClass433_3430.method6952
				(1.0F / class534_sub10.aFloat10432,
				 1.0F / class534_sub10.aFloat10432, 1.0F,
				 1.0F);
			    class324.anInt3447 = class534_sub10.anInt10437;
			    class324.anInt3428
				= (class534_sub10.anInt10438
				   - class534_sub10.anInt10437 + 1);
			    class324.anInt3449 = i_353_;
			    class324.anInt3450 = class534_sub10.anInt10436 / 3;
			    switch (i_355_) {
			    case 6:
				class324.method5812
				    (!Class72.method1559(i_355_, -2099370291));
				break;
			    case 2:
			    case 4:
			    case 8:
			    case 9:
				if (!aClass185_Sub1_9377.aBool9125
				    && (anInt9381 & 0x8) != 0
				    && aClass185_Sub1_9377
					   .aClass348_Sub1_Sub2_9236
					   .method17986((byte) 16)) {
				    Class348_Sub1_Sub2 class348_sub1_sub2
					= (aClass185_Sub1_9377
					   .aClass348_Sub1_Sub2_9236);
				    if (i_355_ == 2)
					class348_sub1_sub2
					    = (aClass185_Sub1_9377
					       .aClass348_Sub1_Sub2_9235);
				    class348_sub1_sub2.aClass433_11464
					.method6842
					(aClass185_Sub1_9377.aClass433_9164);
				    class348_sub1_sub2.aClass433_11466
					.method6952
					(1.0F / (class534_sub10.aFloat10432
						 * (float) ((class534_sub10
							     .aClass166_10430
							     .anInt1765)
							    * -108174347)),
					 1.0F / (class534_sub10.aFloat10432
						 * (float) ((class534_sub10
							     .aClass166_10430
							     .anInt1765)
							    * -108174347)),
					 1.0F, 1.0F);
				    class348_sub1_sub2.aClass438_11468
					.method6997
					((aClass185_Sub1_9377.aClass433_9118
					  .aFloatArray4853[12]),
					 (aClass185_Sub1_9377.aClass433_9118
					  .aFloatArray4853[13]),
					 (aClass185_Sub1_9377.aClass433_9118
					  .aFloatArray4853[14]));
				    Class186 class186
					= (aClass185_Sub1_9377
					       .aClass177_2012.method2931
					   (class534_sub10.anInt10428,
					    (byte) 1));
				    class348_sub1_sub2.anInt11461
					= class186.aByte2068 * 837530247;
				    class348_sub1_sub2.anInt11484
					= (class534_sub10.anInt10437
					   * 2134526643);
				    class348_sub1_sub2.anInt11483
					= ((class534_sub10.anInt10438
					    - class534_sub10.anInt10437 + 1)
					   * 257007611);
				    class348_sub1_sub2.anInt11473
					= i_353_ * 1042457319;
				    class348_sub1_sub2.anInt11487
					= (class534_sub10.anInt10436 / 3
					   * -1394271287);
				    class348_sub1_sub2.aClass441_11477
					.method7106(class324.aClass441_3438);
				    class348_sub1_sub2.aClass438_11459
					.method6992(class324.aClass438_3431);
				    class348_sub1_sub2.aClass441_11480
					.method7106(class324.aClass441_3440);
				    class348_sub1_sub2.aClass438_11465
					.method6992(class324.aClass438_3435);
				    class348_sub1_sub2
					.method17984(-1064685473);
				} else
				    class324.method5796(0);
				break;
			    case 1:
				class324.aClass438_3433.method6997
				    ((aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[12]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[13]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[14]));
				if (aClass185_Sub1_9377.aBool9231)
				    class324.method5800();
				else
				    class324.method5810(0);
				break;
			    default:
				if (aClass185_Sub1_9377.aBool9231)
				    class324.method5799();
				else
				    class324.method5796(0);
				break;
			    case 7:
				class324.aClass438_3433.method6997
				    ((aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[12]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[13]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[14]));
				class324.aClass433_3446.method6840();
				class324.anInterface41_3434
				    = aClass185_Sub1_9377.method14616();
				class324.method5805(0);
			    }
			    i_353_ += class534_sub10.anInt10436;
			}
		    }
		}
	    }
	    if (!aClass700_9411.method14142(1545203130)) {
		aClass185_Sub1_9377.method14687(128);
		aClass185_Sub1_9377.method14603(false);
		Class438 class438 = new Class438(class324.aClass438_3435);
		class324.aClass438_3435.method6997(0.0F, 0.0F, 0.0F);
		Iterator iterator = aClass700_9411.iterator();
		while (iterator.hasNext()) {
		    Class534_Sub13 class534_sub13
			= (Class534_Sub13) iterator.next();
		    class534_sub13.method16136(class324, i, i_335_, i_336_,
					       bools, bool);
		}
		class324.aClass438_3435.method6992(class438);
	    }
	    if (aClass338_9376 != null) {
		aClass185_Sub1_9377.method14687(1);
		aClass185_Sub1_9377.method14733(0, anInterface37_9398);
		aClass185_Sub1_9377.method14733(1, anInterface37_9399);
		aClass185_Sub1_9377.method14700(aClass349_9395);
		Class433 class433 = aClass185_Sub1_9377.aClass433_9194;
		class433.method6840();
		class433.aFloatArray4853[13] = -1.0F;
		class324.method5794(class433);
		aClass338_9376.method5909(class324, i, i_335_, i_336_, bools,
					  bool);
	    }
	}
    }
    
    public void method2515(int i, int i_356_, int i_357_, boolean[][] bools,
			   boolean bool, int i_358_) {
	if (aClass534Array9375 != null) {
	    int i_359_ = i_357_ + i_357_ + 1;
	    i_359_ *= i_359_;
	    if (anIntArray9406.length < i_359_)
		anIntArray9406 = new int[i_359_];
	    int i_360_ = i - i_357_;
	    int i_361_ = i_360_;
	    if (i_360_ < 0)
		i_360_ = 0;
	    int i_362_ = i_356_ - i_357_;
	    int i_363_ = i_362_;
	    if (i_362_ < 0)
		i_362_ = 0;
	    int i_364_ = i + i_357_;
	    if (i_364_ > anInt1701 * -1924295585 - 1)
		i_364_ = anInt1701 * -1924295585 - 1;
	    int i_365_ = i_356_ + i_357_;
	    if (i_365_ > anInt1700 * -1466328823 - 1)
		i_365_ = anInt1700 * -1466328823 - 1;
	    anInt9415 = 0;
	    for (int i_366_ = i_360_; i_366_ <= i_364_; i_366_++) {
		boolean[] bools_367_ = bools[i_366_ - i_361_];
		for (int i_368_ = i_362_; i_368_ <= i_365_; i_368_++) {
		    if (bools_367_[i_368_ - i_363_])
			anIntArray9406[anInt9415++]
			    = i_368_ * (anInt1701 * -1924295585) + i_366_;
		}
	    }
	    ByteBuffer bytebuffer = aClass185_Sub1_9377.aByteBuffer9266;
	    bytebuffer.clear();
	    for (int i_369_ = 0; i_369_ < aClass534Array9375.length;
		 i_369_++) {
		Class534_Sub10 class534_sub10
		    = (Class534_Sub10) aClass534Array9375[i_369_];
		class534_sub10.method16125(anIntArray9406, anInt9415);
	    }
	    int i_370_ = bytebuffer.position();
	    Class324 class324 = aClass185_Sub1_9377.aClass324_9158;
	    aClass185_Sub1_9377.method14712();
	    if (aClass185_Sub1_9377.anInt9252 > 0) {
		class324.aClass438_3435.method6997
		    (((float) (aClass185_Sub1_9377.anInt9251 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (aClass185_Sub1_9377.anInt9251 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (aClass185_Sub1_9377.anInt9251 >> 0 & 0xff)
		      / 255.0F));
		class324.aClass441_3440.method7105(0.0F, 0.0F, 1.0F,
						   -(aClass185_Sub1_9377
						     .aFloat9254));
		class324.aClass441_3440
		    .method7111(aClass185_Sub1_9377.aClass433_9144);
		class324.aClass441_3440.method7110
		    (1.0F / (aClass185_Sub1_9377.aFloat9255
			     - aClass185_Sub1_9377.aFloat9254));
	    } else {
		class324.aClass441_3440.method7105(0.0F, 0.0F, 0.0F, 0.0F);
		class324.aClass438_3435.method6997(0.0F, 0.0F, 0.0F);
	    }
	    if (i_370_ != 0) {
		Interface39 interface39
		    = aClass185_Sub1_9377.method14725(i_370_ / 2);
		interface39.method235(0, i_370_,
				      aClass185_Sub1_9377.aLong9139);
		aClass185_Sub1_9377.method14733(0, anInterface37_9398);
		aClass185_Sub1_9377.method14701(interface39);
		class324.method5794(Class433.aClass433_4854);
		if ((anInt9381 & 0x7) == 0) {
		    int i_371_ = 0;
		    for (int i_372_ = 0; i_372_ < aClass534Array9375.length;
			 i_372_++) {
			Class534_Sub10 class534_sub10
			    = (Class534_Sub10) aClass534Array9375[i_372_];
			if (class534_sub10.anInt10436 != 0) {
			    if (aClass185_Sub1_9377.aBool9231) {
				aClass185_Sub1_9377.method3364
				    (0, class534_sub10.aClass166_10430);
				class324.aClass441_3438.method7105
				    (0.0F, 1.0F, 0.0F,
				     ((float) aClass185_Sub1_9377.anInt9247
				      + ((float) ((class534_sub10
						   .aClass166_10430.anInt1764)
						  * 1446227271)
					 / 255.0F
					 * (float) ((class534_sub10
						     .aClass166_10430
						     .anInt1762)
						    * -1095140607))));
				class324.aClass441_3438.method7110
				    (1.0F / (float) ((class534_sub10
						      .aClass166_10430
						      .anInt1762)
						     * -1095140607));
				class324.aClass438_3431.method6997
				    ((float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 16
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 8
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 0
					      & 0xff) / 255.0F);
			    } else {
				class324.aClass441_3438.method7105(0.0F, 0.0F,
								   0.0F, 0.0F);
				class324.aClass438_3431.method6997(0.0F, 0.0F,
								   0.0F);
			    }
			    boolean bool_373_ = false;
			    if (class534_sub10.anInt10428 != -1) {
				Class186 class186
				    = (aClass185_Sub1_9377.aClass177_2012
					   .method2931
				       (class534_sub10.anInt10428, (byte) 1));
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.aClass354_9211
					  .method6267(class186);
				bool_373_
				    = !Class72.method1559(class186.aByte2067,
							  -1926117814);
			    } else
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.anInterface38_9204;
			    aClass185_Sub1_9377.method14733
				(1, class534_sub10.anInterface37_10433);
			    aClass185_Sub1_9377.method14700(aClass349_9395);
			    class324.aClass433_3430.method6952
				(1.0F / class534_sub10.aFloat10432,
				 1.0F / class534_sub10.aFloat10432, 1.0F,
				 1.0F);
			    class324.anInt3447 = class534_sub10.anInt10437;
			    class324.anInt3428
				= (class534_sub10.anInt10438
				   - class534_sub10.anInt10437 + 1);
			    class324.anInt3449 = i_371_;
			    class324.anInt3450 = class534_sub10.anInt10436 / 3;
			    class324.method5812(bool_373_);
			    i_371_ += class534_sub10.anInt10436;
			}
		    }
		} else {
		    class324.aClass438_3442.method6997
			(aClass185_Sub1_9377.aFloatArray9197[0],
			 aClass185_Sub1_9377.aFloatArray9197[1],
			 aClass185_Sub1_9377.aFloatArray9197[2]);
		    class324.aClass438_3443.method6997
			((aClass185_Sub1_9377.aFloat9206
			  * aClass185_Sub1_9377.aFloat9159),
			 (aClass185_Sub1_9377.aFloat9206
			  * aClass185_Sub1_9377.aFloat9292),
			 (aClass185_Sub1_9377.aFloat9206
			  * aClass185_Sub1_9377.aFloat9163));
		    class324.aClass438_3444.method6997
			((-aClass185_Sub1_9377.aFloat9267
			  * aClass185_Sub1_9377.aFloat9159),
			 (-aClass185_Sub1_9377.aFloat9267
			  * aClass185_Sub1_9377.aFloat9292),
			 (-aClass185_Sub1_9377.aFloat9267
			  * aClass185_Sub1_9377.aFloat9163));
		    class324.aClass438_3445.method6997
			((aClass185_Sub1_9377.aFloat9205
			  * aClass185_Sub1_9377.aFloat9159),
			 (aClass185_Sub1_9377.aFloat9205
			  * aClass185_Sub1_9377.aFloat9292),
			 (aClass185_Sub1_9377.aFloat9205
			  * aClass185_Sub1_9377.aFloat9163));
		    int i_374_ = 0;
		    for (int i_375_ = 0; i_375_ < aClass534Array9375.length;
			 i_375_++) {
			Class534_Sub10 class534_sub10
			    = (Class534_Sub10) aClass534Array9375[i_375_];
			if (class534_sub10.anInt10436 > 0) {
			    if (aClass185_Sub1_9377.aBool9231) {
				aClass185_Sub1_9377.method3364
				    (0, class534_sub10.aClass166_10430);
				float f = 0.15F;
				class324.aClass441_3438.method7105
				    (0.0F,
				     1.0F / ((float) ((class534_sub10
						       .aClass166_10430
						       .anInt1762)
						      * -1095140607)
					     * f),
				     0.0F,
				     256.0F / ((float) ((class534_sub10
							 .aClass166_10430
							 .anInt1762)
							* -1095140607)
					       * f));
				class324.aClass438_3431.method6997
				    ((float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 16
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 8
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 0
					      & 0xff) / 255.0F);
			    } else {
				class324.aClass441_3438.method7105(0.0F, 0.0F,
								   0.0F, 0.0F);
				class324.aClass438_3431.method6997(0.0F, 0.0F,
								   0.0F);
			    }
			    byte i_376_ = 11;
			    if (class534_sub10.anInt10428 != -1) {
				Class186 class186
				    = (aClass185_Sub1_9377.aClass177_2012
					   .method2931
				       (class534_sub10.anInt10428, (byte) 1));
				i_376_ = class186.aByte2067;
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.aClass354_9211
					  .method6267(class186);
				class324.method5793(class186.aByte2068);
			    } else
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.anInterface38_9204;
			    aClass185_Sub1_9377.method14733
				(1, class534_sub10.anInterface37_10433);
			    aClass185_Sub1_9377.method14700(aClass349_9395);
			    class324.aClass433_3430.method6952
				(1.0F / class534_sub10.aFloat10432,
				 1.0F / class534_sub10.aFloat10432, 1.0F,
				 1.0F);
			    class324.anInt3447 = class534_sub10.anInt10437;
			    class324.anInt3428
				= (class534_sub10.anInt10438
				   - class534_sub10.anInt10437 + 1);
			    class324.anInt3449 = i_374_;
			    class324.anInt3450 = class534_sub10.anInt10436 / 3;
			    switch (i_376_) {
			    case 6:
				class324.method5812
				    (!Class72.method1559(i_376_, -1855764723));
				break;
			    case 2:
			    case 4:
			    case 8:
			    case 9:
				if (!aClass185_Sub1_9377.aBool9125
				    && (anInt9381 & 0x8) != 0
				    && aClass185_Sub1_9377
					   .aClass348_Sub1_Sub2_9236
					   .method17986((byte) 16)) {
				    Class348_Sub1_Sub2 class348_sub1_sub2
					= (aClass185_Sub1_9377
					   .aClass348_Sub1_Sub2_9236);
				    if (i_376_ == 2)
					class348_sub1_sub2
					    = (aClass185_Sub1_9377
					       .aClass348_Sub1_Sub2_9235);
				    class348_sub1_sub2.aClass433_11464
					.method6842
					(aClass185_Sub1_9377.aClass433_9164);
				    class348_sub1_sub2.aClass433_11466
					.method6952
					(1.0F / (class534_sub10.aFloat10432
						 * (float) ((class534_sub10
							     .aClass166_10430
							     .anInt1765)
							    * -108174347)),
					 1.0F / (class534_sub10.aFloat10432
						 * (float) ((class534_sub10
							     .aClass166_10430
							     .anInt1765)
							    * -108174347)),
					 1.0F, 1.0F);
				    class348_sub1_sub2.aClass438_11468
					.method6997
					((aClass185_Sub1_9377.aClass433_9118
					  .aFloatArray4853[12]),
					 (aClass185_Sub1_9377.aClass433_9118
					  .aFloatArray4853[13]),
					 (aClass185_Sub1_9377.aClass433_9118
					  .aFloatArray4853[14]));
				    Class186 class186
					= (aClass185_Sub1_9377
					       .aClass177_2012.method2931
					   (class534_sub10.anInt10428,
					    (byte) 1));
				    class348_sub1_sub2.anInt11461
					= class186.aByte2068 * 837530247;
				    class348_sub1_sub2.anInt11484
					= (class534_sub10.anInt10437
					   * 2134526643);
				    class348_sub1_sub2.anInt11483
					= ((class534_sub10.anInt10438
					    - class534_sub10.anInt10437 + 1)
					   * 257007611);
				    class348_sub1_sub2.anInt11473
					= i_374_ * 1042457319;
				    class348_sub1_sub2.anInt11487
					= (class534_sub10.anInt10436 / 3
					   * -1394271287);
				    class348_sub1_sub2.aClass441_11477
					.method7106(class324.aClass441_3438);
				    class348_sub1_sub2.aClass438_11459
					.method6992(class324.aClass438_3431);
				    class348_sub1_sub2.aClass441_11480
					.method7106(class324.aClass441_3440);
				    class348_sub1_sub2.aClass438_11465
					.method6992(class324.aClass438_3435);
				    class348_sub1_sub2
					.method17984(-1995551627);
				} else
				    class324.method5796(0);
				break;
			    case 1:
				class324.aClass438_3433.method6997
				    ((aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[12]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[13]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[14]));
				if (aClass185_Sub1_9377.aBool9231)
				    class324.method5800();
				else
				    class324.method5810(0);
				break;
			    default:
				if (aClass185_Sub1_9377.aBool9231)
				    class324.method5799();
				else
				    class324.method5796(0);
				break;
			    case 7:
				class324.aClass438_3433.method6997
				    ((aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[12]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[13]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[14]));
				class324.aClass433_3446.method6840();
				class324.anInterface41_3434
				    = aClass185_Sub1_9377.method14616();
				class324.method5805(0);
			    }
			    i_374_ += class534_sub10.anInt10436;
			}
		    }
		}
	    }
	    if (!aClass700_9411.method14142(-1548862149)) {
		aClass185_Sub1_9377.method14687(128);
		aClass185_Sub1_9377.method14603(false);
		Class438 class438 = new Class438(class324.aClass438_3435);
		class324.aClass438_3435.method6997(0.0F, 0.0F, 0.0F);
		Iterator iterator = aClass700_9411.iterator();
		while (iterator.hasNext()) {
		    Class534_Sub13 class534_sub13
			= (Class534_Sub13) iterator.next();
		    class534_sub13.method16136(class324, i, i_356_, i_357_,
					       bools, bool);
		}
		class324.aClass438_3435.method6992(class438);
	    }
	    if (aClass338_9376 != null) {
		aClass185_Sub1_9377.method14687(1);
		aClass185_Sub1_9377.method14733(0, anInterface37_9398);
		aClass185_Sub1_9377.method14733(1, anInterface37_9399);
		aClass185_Sub1_9377.method14700(aClass349_9395);
		Class433 class433 = aClass185_Sub1_9377.aClass433_9194;
		class433.method6840();
		class433.aFloatArray4853[13] = -1.0F;
		class324.method5794(class433);
		aClass338_9376.method5909(class324, i, i_356_, i_357_, bools,
					  bool);
	    }
	}
    }
    
    public void method2493(int i, int i_377_, int[] is, int[] is_378_,
			   int[] is_379_, int[] is_380_, int[] is_381_,
			   int[] is_382_, int[] is_383_, int[] is_384_,
			   Class166 class166, boolean bool) {
	Class177 class177 = aClass185_Sub1_9377.aClass177_2012;
	if (is_380_ != null && anIntArrayArrayArray9396 == null)
	    anIntArrayArrayArray9396
		= new int[anInt1701 * -1924295585][anInt1700 * -1466328823][];
	if (is_378_ != null && anIntArrayArrayArray9392 == null)
	    anIntArrayArrayArray9392
		= new int[anInt1701 * -1924295585][anInt1700 * -1466328823][];
	anIntArrayArrayArray9384[i][i_377_] = is;
	anIntArrayArrayArray9391[i][i_377_] = is_379_;
	anIntArrayArrayArray9388[i][i_377_] = is_381_;
	anIntArrayArrayArray9416[i][i_377_] = is_382_;
	if (anIntArrayArrayArray9396 != null)
	    anIntArrayArrayArray9396[i][i_377_] = is_380_;
	if (anIntArrayArrayArray9392 != null)
	    anIntArrayArrayArray9392[i][i_377_] = is_378_;
	Class534_Sub10[] class534_sub10s
	    = (aClass534_Sub10ArrayArrayArray9387[i][i_377_]
	       = new Class534_Sub10[is_381_.length]);
	for (int i_385_ = 0; i_385_ < is_381_.length; i_385_++) {
	    int i_386_ = is_383_[i_385_];
	    int i_387_ = is_384_[i_385_];
	    if ((anInt9381 & 0x20) != 0 && i_386_ != -1
		&& class177.method2931(i_386_, (byte) 1).aBool2072) {
		i_387_ = 128;
		i_386_ = -1;
	    }
	    long l = ((long) (class166.anInt1764 * 1446227271) << 48
		      | (long) (class166.anInt1762 * -1095140607) << 42
		      | (long) (class166.anInt1763 * 2113275141) << 28
		      | (long) (i_387_ << 14) | (long) i_386_);
	    Class534 class534;
	    for (class534 = aClass9_9385.method579(l); class534 != null;
		 class534 = aClass9_9385.method582(648803564)) {
		Class534_Sub10 class534_sub10 = (Class534_Sub10) class534;
		if (class534_sub10.anInt10428 == i_386_
		    && class534_sub10.aFloat10432 == (float) i_387_
		    && class534_sub10.aClass166_10430.method2745(class166,
								 (byte) -123))
		    break;
	    }
	    if (class534 == null) {
		class534_sub10s[i_385_]
		    = new Class534_Sub10(this, i_386_, i_387_, class166);
		aClass9_9385.method581(class534_sub10s[i_385_], l);
	    } else
		class534_sub10s[i_385_] = (Class534_Sub10) class534;
	}
	if (bool)
	    aByteArrayArray9394[i][i_377_] |= 0x1;
	if (is_381_.length > anInt9402)
	    anInt9402 = is_381_.length;
	anInt9401 += is_381_.length;
    }
    
    void method15061() {
	anInterface37_9399 = aClass185_Sub1_9377.method14698(false);
	anInterface37_9399.method236(anInt9382 * 4, 4);
	anInterface37_9399.method235(0, anInt9382 * 4,
				     aClass185_Sub1_9377
					 .method14588(aByteBuffer9410));
	anInterface37_9398 = aClass185_Sub1_9377.method14698(false);
	anInterface37_9398.method236(anInt9382 * anInt9390, anInt9390);
	anInterface37_9398.method235(0, anInt9382 * anInt9390,
				     aClass185_Sub1_9377
					 .method14588(aByteBuffer9400));
	aByteBuffer9410.clear();
	aByteBuffer9410 = null;
	aByteBuffer9400.clear();
	aByteBuffer9400 = null;
	if ((anInt9381 & 0x7) != 0) {
	    if (anIntArrayArrayArray9396 != null)
		aClass349_9395 = (aClass185_Sub1_9377.method14699
				  (new Class381[]
				   { new Class381(new Class350[]
						  { Class350.aClass350_3610,
						    Class350.aClass350_3597,
						    Class350.aClass350_3596,
						    Class350.aClass350_3594 }),
				     new Class381(Class350.aClass350_3595) }));
	    else
		aClass349_9395 = (aClass185_Sub1_9377.method14699
				  (new Class381[]
				   { new Class381(new Class350[]
						  { Class350.aClass350_3610,
						    Class350.aClass350_3597,
						    Class350.aClass350_3594 }),
				     new Class381(Class350.aClass350_3595) }));
	} else if (anIntArrayArrayArray9396 != null)
	    aClass349_9395
		= (aClass185_Sub1_9377.method14699
		   (new Class381[]
		    { new Class381(new Class350[] { Class350.aClass350_3610,
						    Class350.aClass350_3597,
						    Class350.aClass350_3596 }),
		      new Class381(Class350.aClass350_3595) }));
	else
	    aClass349_9395
		= (aClass185_Sub1_9377.method14699
		   (new Class381[]
		    { new Class381(new Class350[] { Class350.aClass350_3610,
						    Class350.aClass350_3597 }),
		      new Class381(Class350.aClass350_3595) }));
	for (int i = 0; i < anInt9407; i++) {
	    Class534_Sub10 class534_sub10
		= (Class534_Sub10) aClass534Array9408[i];
	    class534_sub10.method16120(anInt9382);
	}
	if (aClass338_9376 != null)
	    aClass338_9376.method5908();
	method15057();
    }
    
    public void method2533(int i, int i_388_, int i_389_, boolean[][] bools,
			   boolean bool, int i_390_) {
	if (aClass534Array9375 != null) {
	    int i_391_ = i_389_ + i_389_ + 1;
	    i_391_ *= i_391_;
	    if (anIntArray9406.length < i_391_)
		anIntArray9406 = new int[i_391_];
	    int i_392_ = i - i_389_;
	    int i_393_ = i_392_;
	    if (i_392_ < 0)
		i_392_ = 0;
	    int i_394_ = i_388_ - i_389_;
	    int i_395_ = i_394_;
	    if (i_394_ < 0)
		i_394_ = 0;
	    int i_396_ = i + i_389_;
	    if (i_396_ > anInt1701 * -1924295585 - 1)
		i_396_ = anInt1701 * -1924295585 - 1;
	    int i_397_ = i_388_ + i_389_;
	    if (i_397_ > anInt1700 * -1466328823 - 1)
		i_397_ = anInt1700 * -1466328823 - 1;
	    anInt9415 = 0;
	    for (int i_398_ = i_392_; i_398_ <= i_396_; i_398_++) {
		boolean[] bools_399_ = bools[i_398_ - i_393_];
		for (int i_400_ = i_394_; i_400_ <= i_397_; i_400_++) {
		    if (bools_399_[i_400_ - i_395_])
			anIntArray9406[anInt9415++]
			    = i_400_ * (anInt1701 * -1924295585) + i_398_;
		}
	    }
	    ByteBuffer bytebuffer = aClass185_Sub1_9377.aByteBuffer9266;
	    bytebuffer.clear();
	    for (int i_401_ = 0; i_401_ < aClass534Array9375.length;
		 i_401_++) {
		Class534_Sub10 class534_sub10
		    = (Class534_Sub10) aClass534Array9375[i_401_];
		class534_sub10.method16125(anIntArray9406, anInt9415);
	    }
	    int i_402_ = bytebuffer.position();
	    Class324 class324 = aClass185_Sub1_9377.aClass324_9158;
	    aClass185_Sub1_9377.method14712();
	    if (aClass185_Sub1_9377.anInt9252 > 0) {
		class324.aClass438_3435.method6997
		    (((float) (aClass185_Sub1_9377.anInt9251 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (aClass185_Sub1_9377.anInt9251 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (aClass185_Sub1_9377.anInt9251 >> 0 & 0xff)
		      / 255.0F));
		class324.aClass441_3440.method7105(0.0F, 0.0F, 1.0F,
						   -(aClass185_Sub1_9377
						     .aFloat9254));
		class324.aClass441_3440
		    .method7111(aClass185_Sub1_9377.aClass433_9144);
		class324.aClass441_3440.method7110
		    (1.0F / (aClass185_Sub1_9377.aFloat9255
			     - aClass185_Sub1_9377.aFloat9254));
	    } else {
		class324.aClass441_3440.method7105(0.0F, 0.0F, 0.0F, 0.0F);
		class324.aClass438_3435.method6997(0.0F, 0.0F, 0.0F);
	    }
	    if (i_402_ != 0) {
		Interface39 interface39
		    = aClass185_Sub1_9377.method14725(i_402_ / 2);
		interface39.method235(0, i_402_,
				      aClass185_Sub1_9377.aLong9139);
		aClass185_Sub1_9377.method14733(0, anInterface37_9398);
		aClass185_Sub1_9377.method14701(interface39);
		class324.method5794(Class433.aClass433_4854);
		if ((anInt9381 & 0x7) == 0) {
		    int i_403_ = 0;
		    for (int i_404_ = 0; i_404_ < aClass534Array9375.length;
			 i_404_++) {
			Class534_Sub10 class534_sub10
			    = (Class534_Sub10) aClass534Array9375[i_404_];
			if (class534_sub10.anInt10436 != 0) {
			    if (aClass185_Sub1_9377.aBool9231) {
				aClass185_Sub1_9377.method3364
				    (0, class534_sub10.aClass166_10430);
				class324.aClass441_3438.method7105
				    (0.0F, 1.0F, 0.0F,
				     ((float) aClass185_Sub1_9377.anInt9247
				      + ((float) ((class534_sub10
						   .aClass166_10430.anInt1764)
						  * 1446227271)
					 / 255.0F
					 * (float) ((class534_sub10
						     .aClass166_10430
						     .anInt1762)
						    * -1095140607))));
				class324.aClass441_3438.method7110
				    (1.0F / (float) ((class534_sub10
						      .aClass166_10430
						      .anInt1762)
						     * -1095140607));
				class324.aClass438_3431.method6997
				    ((float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 16
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 8
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 0
					      & 0xff) / 255.0F);
			    } else {
				class324.aClass441_3438.method7105(0.0F, 0.0F,
								   0.0F, 0.0F);
				class324.aClass438_3431.method6997(0.0F, 0.0F,
								   0.0F);
			    }
			    boolean bool_405_ = false;
			    if (class534_sub10.anInt10428 != -1) {
				Class186 class186
				    = (aClass185_Sub1_9377.aClass177_2012
					   .method2931
				       (class534_sub10.anInt10428, (byte) 1));
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.aClass354_9211
					  .method6267(class186);
				bool_405_
				    = !Class72.method1559(class186.aByte2067,
							  -2073380259);
			    } else
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.anInterface38_9204;
			    aClass185_Sub1_9377.method14733
				(1, class534_sub10.anInterface37_10433);
			    aClass185_Sub1_9377.method14700(aClass349_9395);
			    class324.aClass433_3430.method6952
				(1.0F / class534_sub10.aFloat10432,
				 1.0F / class534_sub10.aFloat10432, 1.0F,
				 1.0F);
			    class324.anInt3447 = class534_sub10.anInt10437;
			    class324.anInt3428
				= (class534_sub10.anInt10438
				   - class534_sub10.anInt10437 + 1);
			    class324.anInt3449 = i_403_;
			    class324.anInt3450 = class534_sub10.anInt10436 / 3;
			    class324.method5812(bool_405_);
			    i_403_ += class534_sub10.anInt10436;
			}
		    }
		} else {
		    class324.aClass438_3442.method6997
			(aClass185_Sub1_9377.aFloatArray9197[0],
			 aClass185_Sub1_9377.aFloatArray9197[1],
			 aClass185_Sub1_9377.aFloatArray9197[2]);
		    class324.aClass438_3443.method6997
			((aClass185_Sub1_9377.aFloat9206
			  * aClass185_Sub1_9377.aFloat9159),
			 (aClass185_Sub1_9377.aFloat9206
			  * aClass185_Sub1_9377.aFloat9292),
			 (aClass185_Sub1_9377.aFloat9206
			  * aClass185_Sub1_9377.aFloat9163));
		    class324.aClass438_3444.method6997
			((-aClass185_Sub1_9377.aFloat9267
			  * aClass185_Sub1_9377.aFloat9159),
			 (-aClass185_Sub1_9377.aFloat9267
			  * aClass185_Sub1_9377.aFloat9292),
			 (-aClass185_Sub1_9377.aFloat9267
			  * aClass185_Sub1_9377.aFloat9163));
		    class324.aClass438_3445.method6997
			((aClass185_Sub1_9377.aFloat9205
			  * aClass185_Sub1_9377.aFloat9159),
			 (aClass185_Sub1_9377.aFloat9205
			  * aClass185_Sub1_9377.aFloat9292),
			 (aClass185_Sub1_9377.aFloat9205
			  * aClass185_Sub1_9377.aFloat9163));
		    int i_406_ = 0;
		    for (int i_407_ = 0; i_407_ < aClass534Array9375.length;
			 i_407_++) {
			Class534_Sub10 class534_sub10
			    = (Class534_Sub10) aClass534Array9375[i_407_];
			if (class534_sub10.anInt10436 > 0) {
			    if (aClass185_Sub1_9377.aBool9231) {
				aClass185_Sub1_9377.method3364
				    (0, class534_sub10.aClass166_10430);
				float f = 0.15F;
				class324.aClass441_3438.method7105
				    (0.0F,
				     1.0F / ((float) ((class534_sub10
						       .aClass166_10430
						       .anInt1762)
						      * -1095140607)
					     * f),
				     0.0F,
				     256.0F / ((float) ((class534_sub10
							 .aClass166_10430
							 .anInt1762)
							* -1095140607)
					       * f));
				class324.aClass438_3431.method6997
				    ((float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 16
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 8
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 0
					      & 0xff) / 255.0F);
			    } else {
				class324.aClass441_3438.method7105(0.0F, 0.0F,
								   0.0F, 0.0F);
				class324.aClass438_3431.method6997(0.0F, 0.0F,
								   0.0F);
			    }
			    byte i_408_ = 11;
			    if (class534_sub10.anInt10428 != -1) {
				Class186 class186
				    = (aClass185_Sub1_9377.aClass177_2012
					   .method2931
				       (class534_sub10.anInt10428, (byte) 1));
				i_408_ = class186.aByte2067;
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.aClass354_9211
					  .method6267(class186);
				class324.method5793(class186.aByte2068);
			    } else
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.anInterface38_9204;
			    aClass185_Sub1_9377.method14733
				(1, class534_sub10.anInterface37_10433);
			    aClass185_Sub1_9377.method14700(aClass349_9395);
			    class324.aClass433_3430.method6952
				(1.0F / class534_sub10.aFloat10432,
				 1.0F / class534_sub10.aFloat10432, 1.0F,
				 1.0F);
			    class324.anInt3447 = class534_sub10.anInt10437;
			    class324.anInt3428
				= (class534_sub10.anInt10438
				   - class534_sub10.anInt10437 + 1);
			    class324.anInt3449 = i_406_;
			    class324.anInt3450 = class534_sub10.anInt10436 / 3;
			    switch (i_408_) {
			    case 6:
				class324.method5812
				    (!Class72.method1559(i_408_, -1800401694));
				break;
			    case 2:
			    case 4:
			    case 8:
			    case 9:
				if (!aClass185_Sub1_9377.aBool9125
				    && (anInt9381 & 0x8) != 0
				    && aClass185_Sub1_9377
					   .aClass348_Sub1_Sub2_9236
					   .method17986((byte) 16)) {
				    Class348_Sub1_Sub2 class348_sub1_sub2
					= (aClass185_Sub1_9377
					   .aClass348_Sub1_Sub2_9236);
				    if (i_408_ == 2)
					class348_sub1_sub2
					    = (aClass185_Sub1_9377
					       .aClass348_Sub1_Sub2_9235);
				    class348_sub1_sub2.aClass433_11464
					.method6842
					(aClass185_Sub1_9377.aClass433_9164);
				    class348_sub1_sub2.aClass433_11466
					.method6952
					(1.0F / (class534_sub10.aFloat10432
						 * (float) ((class534_sub10
							     .aClass166_10430
							     .anInt1765)
							    * -108174347)),
					 1.0F / (class534_sub10.aFloat10432
						 * (float) ((class534_sub10
							     .aClass166_10430
							     .anInt1765)
							    * -108174347)),
					 1.0F, 1.0F);
				    class348_sub1_sub2.aClass438_11468
					.method6997
					((aClass185_Sub1_9377.aClass433_9118
					  .aFloatArray4853[12]),
					 (aClass185_Sub1_9377.aClass433_9118
					  .aFloatArray4853[13]),
					 (aClass185_Sub1_9377.aClass433_9118
					  .aFloatArray4853[14]));
				    Class186 class186
					= (aClass185_Sub1_9377
					       .aClass177_2012.method2931
					   (class534_sub10.anInt10428,
					    (byte) 1));
				    class348_sub1_sub2.anInt11461
					= class186.aByte2068 * 837530247;
				    class348_sub1_sub2.anInt11484
					= (class534_sub10.anInt10437
					   * 2134526643);
				    class348_sub1_sub2.anInt11483
					= ((class534_sub10.anInt10438
					    - class534_sub10.anInt10437 + 1)
					   * 257007611);
				    class348_sub1_sub2.anInt11473
					= i_406_ * 1042457319;
				    class348_sub1_sub2.anInt11487
					= (class534_sub10.anInt10436 / 3
					   * -1394271287);
				    class348_sub1_sub2.aClass441_11477
					.method7106(class324.aClass441_3438);
				    class348_sub1_sub2.aClass438_11459
					.method6992(class324.aClass438_3431);
				    class348_sub1_sub2.aClass441_11480
					.method7106(class324.aClass441_3440);
				    class348_sub1_sub2.aClass438_11465
					.method6992(class324.aClass438_3435);
				    class348_sub1_sub2.method17984(-515419501);
				} else
				    class324.method5796(0);
				break;
			    case 1:
				class324.aClass438_3433.method6997
				    ((aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[12]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[13]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[14]));
				if (aClass185_Sub1_9377.aBool9231)
				    class324.method5800();
				else
				    class324.method5810(0);
				break;
			    default:
				if (aClass185_Sub1_9377.aBool9231)
				    class324.method5799();
				else
				    class324.method5796(0);
				break;
			    case 7:
				class324.aClass438_3433.method6997
				    ((aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[12]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[13]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[14]));
				class324.aClass433_3446.method6840();
				class324.anInterface41_3434
				    = aClass185_Sub1_9377.method14616();
				class324.method5805(0);
			    }
			    i_406_ += class534_sub10.anInt10436;
			}
		    }
		}
	    }
	    if (!aClass700_9411.method14142(-138812099)) {
		aClass185_Sub1_9377.method14687(128);
		aClass185_Sub1_9377.method14603(false);
		Class438 class438 = new Class438(class324.aClass438_3435);
		class324.aClass438_3435.method6997(0.0F, 0.0F, 0.0F);
		Iterator iterator = aClass700_9411.iterator();
		while (iterator.hasNext()) {
		    Class534_Sub13 class534_sub13
			= (Class534_Sub13) iterator.next();
		    class534_sub13.method16136(class324, i, i_388_, i_389_,
					       bools, bool);
		}
		class324.aClass438_3435.method6992(class438);
	    }
	    if (aClass338_9376 != null) {
		aClass185_Sub1_9377.method14687(1);
		aClass185_Sub1_9377.method14733(0, anInterface37_9398);
		aClass185_Sub1_9377.method14733(1, anInterface37_9399);
		aClass185_Sub1_9377.method14700(aClass349_9395);
		Class433 class433 = aClass185_Sub1_9377.aClass433_9194;
		class433.method6840();
		class433.aFloatArray4853[13] = -1.0F;
		class324.method5794(class433);
		aClass338_9376.method5909(class324, i, i_388_, i_389_, bools,
					  bool);
	    }
	}
    }
    
    Class151_Sub2(Class185_Sub1 class185_sub1, int i, int i_409_, int i_410_,
		  int i_411_, int[][] is, int[][] is_412_, int i_413_) {
	super(i_410_, i_411_, i_413_, is);
	aFloat9386 = -3.4028235E38F;
	aClass700_9411 = new Class700();
	anIntArray9413 = new int[1];
	anIntArray9414 = new int[1];
	anIntArray9406 = new int[1];
	aClass185_Sub1_9377 = class185_sub1;
	anInt9378 = anInt1703 * -1495101509 - 2;
	anInt9379 = 1 << anInt9378;
	anInt9380 = i;
	anInt9381 = i_409_;
	anIntArrayArrayArray9392 = new int[i_410_][i_411_][];
	aClass534_Sub10ArrayArrayArray9387
	    = new Class534_Sub10[i_410_][i_411_][];
	anIntArrayArrayArray9384 = new int[i_410_][i_411_][];
	anIntArrayArrayArray9391 = new int[i_410_][i_411_][];
	anIntArrayArrayArray9388 = new int[i_410_][i_411_][];
	anIntArrayArrayArray9416 = new int[i_410_][i_411_][];
	aShortArrayArray9409 = new short[i_410_ * i_411_][];
	aByteArrayArray9394 = new byte[i_410_][i_411_];
	aByteArrayArray9403 = new byte[i_410_ + 1][i_411_ + 1];
	aFloatArrayArray9404 = (new float[anInt1701 * -1924295585 + 1]
				[anInt1700 * -1466328823 + 1]);
	aFloatArrayArray9397 = (new float[anInt1701 * -1924295585 + 1]
				[anInt1700 * -1466328823 + 1]);
	aFloatArrayArray9393 = (new float[anInt1701 * -1924295585 + 1]
				[anInt1700 * -1466328823 + 1]);
	for (int i_414_ = 0; i_414_ <= anInt1700 * -1466328823; i_414_++) {
	    for (int i_415_ = 0; i_415_ <= anInt1701 * -1924295585; i_415_++) {
		int i_416_ = anIntArrayArray1704[i_415_][i_414_];
		if ((float) i_416_ < aFloat9412)
		    aFloat9412 = (float) i_416_;
		if ((float) i_416_ > aFloat9386)
		    aFloat9386 = (float) i_416_;
		if (i_415_ > 0 && i_414_ > 0
		    && i_415_ < anInt1701 * -1924295585
		    && i_414_ < anInt1700 * -1466328823) {
		    int i_417_ = (is_412_[i_415_ + 1][i_414_]
				  - is_412_[i_415_ - 1][i_414_]);
		    int i_418_ = (is_412_[i_415_][i_414_ + 1]
				  - is_412_[i_415_][i_414_ - 1]);
		    float f
			= (float) (1.0
				   / Math.sqrt((double) (i_417_ * i_417_
							 + 4 * i_413_ * i_413_
							 + i_418_ * i_418_)));
		    aFloatArrayArray9404[i_415_][i_414_] = (float) i_417_ * f;
		    aFloatArrayArray9397[i_415_][i_414_]
			= (float) (-i_413_ * 2) * f;
		    aFloatArrayArray9393[i_415_][i_414_] = (float) i_418_ * f;
		}
	    }
	}
	aFloat9412--;
	aFloat9386++;
	aClass9_9385 = new Class9(128);
	if ((anInt9381 & 0x10) != 0)
	    aClass338_9376 = new Class338(aClass185_Sub1_9377, this);
    }
    
    public Class534_Sub18_Sub16 method2520
	(int i, int i_419_, Class534_Sub18_Sub16 class534_sub18_sub16) {
	if ((aByteArrayArray9394[i][i_419_] & 0x1) == 0)
	    return null;
	int i_420_ = anInt1702 * 127780559 >> aClass185_Sub1_9377.anInt9212;
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2
	    = (Class534_Sub18_Sub16_Sub2) class534_sub18_sub16;
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2_421_;
	if (class534_sub18_sub16_sub2 != null
	    && class534_sub18_sub16_sub2.method18753(i_420_, i_420_)) {
	    class534_sub18_sub16_sub2_421_ = class534_sub18_sub16_sub2;
	    class534_sub18_sub16_sub2_421_.method18752();
	} else
	    class534_sub18_sub16_sub2_421_
		= new Class534_Sub18_Sub16_Sub2(aClass185_Sub1_9377, i_420_,
						i_420_);
	class534_sub18_sub16_sub2_421_.method18756(0, 0, i_420_, i_420_);
	method15058(class534_sub18_sub16_sub2_421_, i, i_419_);
	return class534_sub18_sub16_sub2_421_;
    }
    
    public void method2517(int i, int i_422_, int i_423_, boolean[][] bools,
			   boolean bool, int i_424_) {
	if (aClass534Array9375 != null) {
	    int i_425_ = i_423_ + i_423_ + 1;
	    i_425_ *= i_425_;
	    if (anIntArray9406.length < i_425_)
		anIntArray9406 = new int[i_425_];
	    int i_426_ = i - i_423_;
	    int i_427_ = i_426_;
	    if (i_426_ < 0)
		i_426_ = 0;
	    int i_428_ = i_422_ - i_423_;
	    int i_429_ = i_428_;
	    if (i_428_ < 0)
		i_428_ = 0;
	    int i_430_ = i + i_423_;
	    if (i_430_ > anInt1701 * -1924295585 - 1)
		i_430_ = anInt1701 * -1924295585 - 1;
	    int i_431_ = i_422_ + i_423_;
	    if (i_431_ > anInt1700 * -1466328823 - 1)
		i_431_ = anInt1700 * -1466328823 - 1;
	    anInt9415 = 0;
	    for (int i_432_ = i_426_; i_432_ <= i_430_; i_432_++) {
		boolean[] bools_433_ = bools[i_432_ - i_427_];
		for (int i_434_ = i_428_; i_434_ <= i_431_; i_434_++) {
		    if (bools_433_[i_434_ - i_429_])
			anIntArray9406[anInt9415++]
			    = i_434_ * (anInt1701 * -1924295585) + i_432_;
		}
	    }
	    ByteBuffer bytebuffer = aClass185_Sub1_9377.aByteBuffer9266;
	    bytebuffer.clear();
	    for (int i_435_ = 0; i_435_ < aClass534Array9375.length;
		 i_435_++) {
		Class534_Sub10 class534_sub10
		    = (Class534_Sub10) aClass534Array9375[i_435_];
		class534_sub10.method16125(anIntArray9406, anInt9415);
	    }
	    int i_436_ = bytebuffer.position();
	    Class324 class324 = aClass185_Sub1_9377.aClass324_9158;
	    aClass185_Sub1_9377.method14712();
	    if (aClass185_Sub1_9377.anInt9252 > 0) {
		class324.aClass438_3435.method6997
		    (((float) (aClass185_Sub1_9377.anInt9251 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (aClass185_Sub1_9377.anInt9251 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (aClass185_Sub1_9377.anInt9251 >> 0 & 0xff)
		      / 255.0F));
		class324.aClass441_3440.method7105(0.0F, 0.0F, 1.0F,
						   -(aClass185_Sub1_9377
						     .aFloat9254));
		class324.aClass441_3440
		    .method7111(aClass185_Sub1_9377.aClass433_9144);
		class324.aClass441_3440.method7110
		    (1.0F / (aClass185_Sub1_9377.aFloat9255
			     - aClass185_Sub1_9377.aFloat9254));
	    } else {
		class324.aClass441_3440.method7105(0.0F, 0.0F, 0.0F, 0.0F);
		class324.aClass438_3435.method6997(0.0F, 0.0F, 0.0F);
	    }
	    if (i_436_ != 0) {
		Interface39 interface39
		    = aClass185_Sub1_9377.method14725(i_436_ / 2);
		interface39.method235(0, i_436_,
				      aClass185_Sub1_9377.aLong9139);
		aClass185_Sub1_9377.method14733(0, anInterface37_9398);
		aClass185_Sub1_9377.method14701(interface39);
		class324.method5794(Class433.aClass433_4854);
		if ((anInt9381 & 0x7) == 0) {
		    int i_437_ = 0;
		    for (int i_438_ = 0; i_438_ < aClass534Array9375.length;
			 i_438_++) {
			Class534_Sub10 class534_sub10
			    = (Class534_Sub10) aClass534Array9375[i_438_];
			if (class534_sub10.anInt10436 != 0) {
			    if (aClass185_Sub1_9377.aBool9231) {
				aClass185_Sub1_9377.method3364
				    (0, class534_sub10.aClass166_10430);
				class324.aClass441_3438.method7105
				    (0.0F, 1.0F, 0.0F,
				     ((float) aClass185_Sub1_9377.anInt9247
				      + ((float) ((class534_sub10
						   .aClass166_10430.anInt1764)
						  * 1446227271)
					 / 255.0F
					 * (float) ((class534_sub10
						     .aClass166_10430
						     .anInt1762)
						    * -1095140607))));
				class324.aClass441_3438.method7110
				    (1.0F / (float) ((class534_sub10
						      .aClass166_10430
						      .anInt1762)
						     * -1095140607));
				class324.aClass438_3431.method6997
				    ((float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 16
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 8
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 0
					      & 0xff) / 255.0F);
			    } else {
				class324.aClass441_3438.method7105(0.0F, 0.0F,
								   0.0F, 0.0F);
				class324.aClass438_3431.method6997(0.0F, 0.0F,
								   0.0F);
			    }
			    boolean bool_439_ = false;
			    if (class534_sub10.anInt10428 != -1) {
				Class186 class186
				    = (aClass185_Sub1_9377.aClass177_2012
					   .method2931
				       (class534_sub10.anInt10428, (byte) 1));
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.aClass354_9211
					  .method6267(class186);
				bool_439_
				    = !Class72.method1559(class186.aByte2067,
							  -2145671497);
			    } else
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.anInterface38_9204;
			    aClass185_Sub1_9377.method14733
				(1, class534_sub10.anInterface37_10433);
			    aClass185_Sub1_9377.method14700(aClass349_9395);
			    class324.aClass433_3430.method6952
				(1.0F / class534_sub10.aFloat10432,
				 1.0F / class534_sub10.aFloat10432, 1.0F,
				 1.0F);
			    class324.anInt3447 = class534_sub10.anInt10437;
			    class324.anInt3428
				= (class534_sub10.anInt10438
				   - class534_sub10.anInt10437 + 1);
			    class324.anInt3449 = i_437_;
			    class324.anInt3450 = class534_sub10.anInt10436 / 3;
			    class324.method5812(bool_439_);
			    i_437_ += class534_sub10.anInt10436;
			}
		    }
		} else {
		    class324.aClass438_3442.method6997
			(aClass185_Sub1_9377.aFloatArray9197[0],
			 aClass185_Sub1_9377.aFloatArray9197[1],
			 aClass185_Sub1_9377.aFloatArray9197[2]);
		    class324.aClass438_3443.method6997
			((aClass185_Sub1_9377.aFloat9206
			  * aClass185_Sub1_9377.aFloat9159),
			 (aClass185_Sub1_9377.aFloat9206
			  * aClass185_Sub1_9377.aFloat9292),
			 (aClass185_Sub1_9377.aFloat9206
			  * aClass185_Sub1_9377.aFloat9163));
		    class324.aClass438_3444.method6997
			((-aClass185_Sub1_9377.aFloat9267
			  * aClass185_Sub1_9377.aFloat9159),
			 (-aClass185_Sub1_9377.aFloat9267
			  * aClass185_Sub1_9377.aFloat9292),
			 (-aClass185_Sub1_9377.aFloat9267
			  * aClass185_Sub1_9377.aFloat9163));
		    class324.aClass438_3445.method6997
			((aClass185_Sub1_9377.aFloat9205
			  * aClass185_Sub1_9377.aFloat9159),
			 (aClass185_Sub1_9377.aFloat9205
			  * aClass185_Sub1_9377.aFloat9292),
			 (aClass185_Sub1_9377.aFloat9205
			  * aClass185_Sub1_9377.aFloat9163));
		    int i_440_ = 0;
		    for (int i_441_ = 0; i_441_ < aClass534Array9375.length;
			 i_441_++) {
			Class534_Sub10 class534_sub10
			    = (Class534_Sub10) aClass534Array9375[i_441_];
			if (class534_sub10.anInt10436 > 0) {
			    if (aClass185_Sub1_9377.aBool9231) {
				aClass185_Sub1_9377.method3364
				    (0, class534_sub10.aClass166_10430);
				float f = 0.15F;
				class324.aClass441_3438.method7105
				    (0.0F,
				     1.0F / ((float) ((class534_sub10
						       .aClass166_10430
						       .anInt1762)
						      * -1095140607)
					     * f),
				     0.0F,
				     256.0F / ((float) ((class534_sub10
							 .aClass166_10430
							 .anInt1762)
							* -1095140607)
					       * f));
				class324.aClass438_3431.method6997
				    ((float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 16
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 8
					      & 0xff) / 255.0F,
				     (float) ((class534_sub10.aClass166_10430
					       .anInt1763) * 2113275141 >> 0
					      & 0xff) / 255.0F);
			    } else {
				class324.aClass441_3438.method7105(0.0F, 0.0F,
								   0.0F, 0.0F);
				class324.aClass438_3431.method6997(0.0F, 0.0F,
								   0.0F);
			    }
			    byte i_442_ = 11;
			    if (class534_sub10.anInt10428 != -1) {
				Class186 class186
				    = (aClass185_Sub1_9377.aClass177_2012
					   .method2931
				       (class534_sub10.anInt10428, (byte) 1));
				i_442_ = class186.aByte2067;
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.aClass354_9211
					  .method6267(class186);
				class324.method5793(class186.aByte2068);
			    } else
				class324.anInterface38_3432
				    = aClass185_Sub1_9377.anInterface38_9204;
			    aClass185_Sub1_9377.method14733
				(1, class534_sub10.anInterface37_10433);
			    aClass185_Sub1_9377.method14700(aClass349_9395);
			    class324.aClass433_3430.method6952
				(1.0F / class534_sub10.aFloat10432,
				 1.0F / class534_sub10.aFloat10432, 1.0F,
				 1.0F);
			    class324.anInt3447 = class534_sub10.anInt10437;
			    class324.anInt3428
				= (class534_sub10.anInt10438
				   - class534_sub10.anInt10437 + 1);
			    class324.anInt3449 = i_440_;
			    class324.anInt3450 = class534_sub10.anInt10436 / 3;
			    switch (i_442_) {
			    case 6:
				class324.method5812
				    (!Class72.method1559(i_442_, -2130966466));
				break;
			    case 2:
			    case 4:
			    case 8:
			    case 9:
				if (!aClass185_Sub1_9377.aBool9125
				    && (anInt9381 & 0x8) != 0
				    && aClass185_Sub1_9377
					   .aClass348_Sub1_Sub2_9236
					   .method17986((byte) 16)) {
				    Class348_Sub1_Sub2 class348_sub1_sub2
					= (aClass185_Sub1_9377
					   .aClass348_Sub1_Sub2_9236);
				    if (i_442_ == 2)
					class348_sub1_sub2
					    = (aClass185_Sub1_9377
					       .aClass348_Sub1_Sub2_9235);
				    class348_sub1_sub2.aClass433_11464
					.method6842
					(aClass185_Sub1_9377.aClass433_9164);
				    class348_sub1_sub2.aClass433_11466
					.method6952
					(1.0F / (class534_sub10.aFloat10432
						 * (float) ((class534_sub10
							     .aClass166_10430
							     .anInt1765)
							    * -108174347)),
					 1.0F / (class534_sub10.aFloat10432
						 * (float) ((class534_sub10
							     .aClass166_10430
							     .anInt1765)
							    * -108174347)),
					 1.0F, 1.0F);
				    class348_sub1_sub2.aClass438_11468
					.method6997
					((aClass185_Sub1_9377.aClass433_9118
					  .aFloatArray4853[12]),
					 (aClass185_Sub1_9377.aClass433_9118
					  .aFloatArray4853[13]),
					 (aClass185_Sub1_9377.aClass433_9118
					  .aFloatArray4853[14]));
				    Class186 class186
					= (aClass185_Sub1_9377
					       .aClass177_2012.method2931
					   (class534_sub10.anInt10428,
					    (byte) 1));
				    class348_sub1_sub2.anInt11461
					= class186.aByte2068 * 837530247;
				    class348_sub1_sub2.anInt11484
					= (class534_sub10.anInt10437
					   * 2134526643);
				    class348_sub1_sub2.anInt11483
					= ((class534_sub10.anInt10438
					    - class534_sub10.anInt10437 + 1)
					   * 257007611);
				    class348_sub1_sub2.anInt11473
					= i_440_ * 1042457319;
				    class348_sub1_sub2.anInt11487
					= (class534_sub10.anInt10436 / 3
					   * -1394271287);
				    class348_sub1_sub2.aClass441_11477
					.method7106(class324.aClass441_3438);
				    class348_sub1_sub2.aClass438_11459
					.method6992(class324.aClass438_3431);
				    class348_sub1_sub2.aClass441_11480
					.method7106(class324.aClass441_3440);
				    class348_sub1_sub2.aClass438_11465
					.method6992(class324.aClass438_3435);
				    class348_sub1_sub2
					.method17984(-1990433538);
				} else
				    class324.method5796(0);
				break;
			    case 1:
				class324.aClass438_3433.method6997
				    ((aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[12]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[13]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[14]));
				if (aClass185_Sub1_9377.aBool9231)
				    class324.method5800();
				else
				    class324.method5810(0);
				break;
			    default:
				if (aClass185_Sub1_9377.aBool9231)
				    class324.method5799();
				else
				    class324.method5796(0);
				break;
			    case 7:
				class324.aClass438_3433.method6997
				    ((aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[12]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[13]),
				     (aClass185_Sub1_9377.aClass433_9118
				      .aFloatArray4853[14]));
				class324.aClass433_3446.method6840();
				class324.anInterface41_3434
				    = aClass185_Sub1_9377.method14616();
				class324.method5805(0);
			    }
			    i_440_ += class534_sub10.anInt10436;
			}
		    }
		}
	    }
	    if (!aClass700_9411.method14142(-14467506)) {
		aClass185_Sub1_9377.method14687(128);
		aClass185_Sub1_9377.method14603(false);
		Class438 class438 = new Class438(class324.aClass438_3435);
		class324.aClass438_3435.method6997(0.0F, 0.0F, 0.0F);
		Iterator iterator = aClass700_9411.iterator();
		while (iterator.hasNext()) {
		    Class534_Sub13 class534_sub13
			= (Class534_Sub13) iterator.next();
		    class534_sub13.method16136(class324, i, i_422_, i_423_,
					       bools, bool);
		}
		class324.aClass438_3435.method6992(class438);
	    }
	    if (aClass338_9376 != null) {
		aClass185_Sub1_9377.method14687(1);
		aClass185_Sub1_9377.method14733(0, anInterface37_9398);
		aClass185_Sub1_9377.method14733(1, anInterface37_9399);
		aClass185_Sub1_9377.method14700(aClass349_9395);
		Class433 class433 = aClass185_Sub1_9377.aClass433_9194;
		class433.method6840();
		class433.aFloatArray4853[13] = -1.0F;
		class324.method5794(class433);
		aClass338_9376.method5909(class324, i, i_422_, i_423_, bools,
					  bool);
	    }
	}
    }
    
    public Class534_Sub18_Sub16 method2522
	(int i, int i_443_, Class534_Sub18_Sub16 class534_sub18_sub16) {
	if ((aByteArrayArray9394[i][i_443_] & 0x1) == 0)
	    return null;
	int i_444_ = anInt1702 * 127780559 >> aClass185_Sub1_9377.anInt9212;
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2
	    = (Class534_Sub18_Sub16_Sub2) class534_sub18_sub16;
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2_445_;
	if (class534_sub18_sub16_sub2 != null
	    && class534_sub18_sub16_sub2.method18753(i_444_, i_444_)) {
	    class534_sub18_sub16_sub2_445_ = class534_sub18_sub16_sub2;
	    class534_sub18_sub16_sub2_445_.method18752();
	} else
	    class534_sub18_sub16_sub2_445_
		= new Class534_Sub18_Sub16_Sub2(aClass185_Sub1_9377, i_444_,
						i_444_);
	class534_sub18_sub16_sub2_445_.method18756(0, 0, i_444_, i_444_);
	method15058(class534_sub18_sub16_sub2_445_, i, i_443_);
	return class534_sub18_sub16_sub2_445_;
    }
    
    public Class534_Sub18_Sub16 method2501
	(int i, int i_446_, Class534_Sub18_Sub16 class534_sub18_sub16) {
	if ((aByteArrayArray9394[i][i_446_] & 0x1) == 0)
	    return null;
	int i_447_ = anInt1702 * 127780559 >> aClass185_Sub1_9377.anInt9212;
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2
	    = (Class534_Sub18_Sub16_Sub2) class534_sub18_sub16;
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2_448_;
	if (class534_sub18_sub16_sub2 != null
	    && class534_sub18_sub16_sub2.method18753(i_447_, i_447_)) {
	    class534_sub18_sub16_sub2_448_ = class534_sub18_sub16_sub2;
	    class534_sub18_sub16_sub2_448_.method18752();
	} else
	    class534_sub18_sub16_sub2_448_
		= new Class534_Sub18_Sub16_Sub2(aClass185_Sub1_9377, i_447_,
						i_447_);
	class534_sub18_sub16_sub2_448_.method18756(0, 0, i_447_, i_447_);
	method15058(class534_sub18_sub16_sub2_448_, i, i_446_);
	return class534_sub18_sub16_sub2_448_;
    }
    
    public Class534_Sub18_Sub16 method2524
	(int i, int i_449_, Class534_Sub18_Sub16 class534_sub18_sub16) {
	if ((aByteArrayArray9394[i][i_449_] & 0x1) == 0)
	    return null;
	int i_450_ = anInt1702 * 127780559 >> aClass185_Sub1_9377.anInt9212;
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2
	    = (Class534_Sub18_Sub16_Sub2) class534_sub18_sub16;
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2_451_;
	if (class534_sub18_sub16_sub2 != null
	    && class534_sub18_sub16_sub2.method18753(i_450_, i_450_)) {
	    class534_sub18_sub16_sub2_451_ = class534_sub18_sub16_sub2;
	    class534_sub18_sub16_sub2_451_.method18752();
	} else
	    class534_sub18_sub16_sub2_451_
		= new Class534_Sub18_Sub16_Sub2(aClass185_Sub1_9377, i_450_,
						i_450_);
	class534_sub18_sub16_sub2_451_.method18756(0, 0, i_450_, i_450_);
	method15058(class534_sub18_sub16_sub2_451_, i, i_449_);
	return class534_sub18_sub16_sub2_451_;
    }
    
    public Class534_Sub18_Sub16 method2525
	(int i, int i_452_, Class534_Sub18_Sub16 class534_sub18_sub16) {
	if ((aByteArrayArray9394[i][i_452_] & 0x1) == 0)
	    return null;
	int i_453_ = anInt1702 * 127780559 >> aClass185_Sub1_9377.anInt9212;
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2
	    = (Class534_Sub18_Sub16_Sub2) class534_sub18_sub16;
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2_454_;
	if (class534_sub18_sub16_sub2 != null
	    && class534_sub18_sub16_sub2.method18753(i_453_, i_453_)) {
	    class534_sub18_sub16_sub2_454_ = class534_sub18_sub16_sub2;
	    class534_sub18_sub16_sub2_454_.method18752();
	} else
	    class534_sub18_sub16_sub2_454_
		= new Class534_Sub18_Sub16_Sub2(aClass185_Sub1_9377, i_453_,
						i_453_);
	class534_sub18_sub16_sub2_454_.method18756(0, 0, i_453_, i_453_);
	method15058(class534_sub18_sub16_sub2_454_, i, i_452_);
	return class534_sub18_sub16_sub2_454_;
    }
    
    public void method2513(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			   int i_455_, int i_456_, int i_457_, boolean bool) {
	if (aClass338_9376 != null && class534_sub18_sub16 != null) {
	    int i_458_ = (i - (i_455_ * aClass185_Sub1_9377.anInt9213 >> 8)
			  >> aClass185_Sub1_9377.anInt9212);
	    int i_459_
		= (i_456_ - (i_455_ * aClass185_Sub1_9377.anInt9287 >> 8)
		   >> aClass185_Sub1_9377.anInt9212);
	    aClass338_9376.method5910(class534_sub18_sub16, i_458_, i_459_);
	}
    }
    
    public void method2532(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			   int i_460_, int i_461_, int i_462_, boolean bool) {
	if (aClass338_9376 != null && class534_sub18_sub16 != null) {
	    int i_463_ = (i - (i_460_ * aClass185_Sub1_9377.anInt9213 >> 8)
			  >> aClass185_Sub1_9377.anInt9212);
	    int i_464_
		= (i_461_ - (i_460_ * aClass185_Sub1_9377.anInt9287 >> 8)
		   >> aClass185_Sub1_9377.anInt9212);
	    aClass338_9376.method5930(class534_sub18_sub16, i_463_, i_464_);
	}
    }
    
    public void method2505(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			   int i_465_, int i_466_, int i_467_, boolean bool) {
	if (aClass338_9376 != null && class534_sub18_sub16 != null) {
	    int i_468_ = (i - (i_465_ * aClass185_Sub1_9377.anInt9213 >> 8)
			  >> aClass185_Sub1_9377.anInt9212);
	    int i_469_
		= (i_466_ - (i_465_ * aClass185_Sub1_9377.anInt9287 >> 8)
		   >> aClass185_Sub1_9377.anInt9212);
	    aClass338_9376.method5910(class534_sub18_sub16, i_468_, i_469_);
	}
    }
    
    public void method2529(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			   int i_470_, int i_471_, int i_472_, boolean bool) {
	if (aClass338_9376 != null && class534_sub18_sub16 != null) {
	    int i_473_ = (i - (i_470_ * aClass185_Sub1_9377.anInt9213 >> 8)
			  >> aClass185_Sub1_9377.anInt9212);
	    int i_474_
		= (i_471_ - (i_470_ * aClass185_Sub1_9377.anInt9287 >> 8)
		   >> aClass185_Sub1_9377.anInt9212);
	    aClass338_9376.method5910(class534_sub18_sub16, i_473_, i_474_);
	}
    }
    
    public boolean method2497(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			      int i_475_, int i_476_, int i_477_,
			      boolean bool) {
	if (aClass338_9376 == null || class534_sub18_sub16 == null)
	    return false;
	int i_478_ = (i - (i_475_ * aClass185_Sub1_9377.anInt9213 >> 8)
		      >> aClass185_Sub1_9377.anInt9212);
	int i_479_ = (i_476_ - (i_475_ * aClass185_Sub1_9377.anInt9287 >> 8)
		      >> aClass185_Sub1_9377.anInt9212);
	return aClass338_9376.method5922(class534_sub18_sub16, i_478_, i_479_);
    }
    
    public boolean method2504(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			      int i_480_, int i_481_, int i_482_,
			      boolean bool) {
	if (aClass338_9376 == null || class534_sub18_sub16 == null)
	    return false;
	int i_483_ = (i - (i_480_ * aClass185_Sub1_9377.anInt9213 >> 8)
		      >> aClass185_Sub1_9377.anInt9212);
	int i_484_ = (i_481_ - (i_480_ * aClass185_Sub1_9377.anInt9287 >> 8)
		      >> aClass185_Sub1_9377.anInt9212);
	return aClass338_9376.method5922(class534_sub18_sub16, i_483_, i_484_);
    }
    
    public void method2519(int i, int i_485_, int i_486_, int i_487_,
			   int i_488_, int i_489_, int i_490_,
			   boolean[][] bools) {
	if (anInt9401 > 0) {
	    Interface39 interface39
		= aClass185_Sub1_9377.method14725(anInt9383);
	    int i_491_ = 0;
	    int i_492_ = 32767;
	    int i_493_ = -32768;
	    ByteBuffer bytebuffer = aClass185_Sub1_9377.aByteBuffer9266;
	    bytebuffer.clear();
	    for (int i_494_ = i_488_; i_494_ < i_490_; i_494_++) {
		int i_495_ = i_494_ * (anInt1701 * -1924295585) + i_487_;
		for (int i_496_ = i_487_; i_496_ < i_489_; i_496_++) {
		    if (bools[i_496_ - i_487_][i_494_ - i_488_]) {
			short[] is = aShortArrayArray9409[i_495_];
			if (is != null) {
			    for (int i_497_ = 0; i_497_ < is.length;
				 i_497_++) {
				int i_498_ = is[i_497_] & 0xffff;
				if (i_498_ > i_493_)
				    i_493_ = i_498_;
				if (i_498_ < i_492_)
				    i_492_ = i_498_;
				bytebuffer.putShort((short) i_498_);
				i_491_++;
			    }
			}
		    }
		    i_495_++;
		}
	    }
	    interface39.method235(0, bytebuffer.position(),
				  aClass185_Sub1_9377.aLong9139);
	    if (i_491_ > 0) {
		aClass185_Sub1_9377.method14712();
		Class324 class324 = aClass185_Sub1_9377.aClass324_9158;
		aClass185_Sub1_9377.method14733(0, anInterface37_9398);
		aClass185_Sub1_9377.method14733(1, anInterface37_9399);
		aClass185_Sub1_9377.method14700(aClass349_9395);
		aClass185_Sub1_9377.method14701(interface39);
		aClass185_Sub1_9377.method3335(Class446.aClass446_4905);
		float f = (float) aClass185_Sub1_9377.method3253
				      (-129602193).method2910();
		float f_499_ = (float) aClass185_Sub1_9377.method3253
					   (-1556349366).method2911();
		Class446 class446 = new Class446();
		Class446 class446_500_ = new Class446();
		class446.method7306(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F,
				    1.0F, 0.0F);
		class446_500_.method7248(((float) i_486_
					  / (256.0F * (float) (anInt1702
							       * 127780559))),
					 ((float) -i_486_
					  / (256.0F * (float) (anInt1702
							       * 127780559))),
					 1.0F / (aFloat9386 - aFloat9412));
		class446_500_.method7287
		    ((float) i - (float) (i_487_ * i_486_) / 256.0F,
		     (float) i_485_ + (float) (i_490_ * i_486_) / 256.0F,
		     -aFloat9412 / (aFloat9386 - aFloat9412));
		class446_500_.method7249(2.0F / f, 2.0F / f_499_, 1.0F);
		class446_500_.method7287(-1.0F, -1.0F, 0.0F);
		aClass185_Sub1_9377.aClass446_9166.method7235(class446,
							      class446_500_);
		aClass185_Sub1_9377.aClass433_9194
		    .method6916(aClass185_Sub1_9377.aClass446_9166);
		aClass185_Sub1_9377
		    .method3338(aClass185_Sub1_9377.aClass433_9194);
		class324.method5794(Class433.aClass433_4854);
		class324.aClass441_3440.method7105(0.0F, 0.0F, 0.0F, 0.0F);
		class324.aClass438_3435.method6997(0.0F, 0.0F, 0.0F);
		class324.aClass441_3438.method7105(0.0F, 0.0F, 0.0F, 0.0F);
		class324.aClass438_3431.method6997(0.0F, 0.0F, 0.0F);
		class324.anInterface38_3432
		    = aClass185_Sub1_9377.anInterface38_9204;
		class324.aClass433_3430.method6840();
		class324.anInt3447 = i_492_;
		class324.anInt3428 = i_493_ - i_492_ + 1;
		class324.anInt3449 = 0;
		class324.anInt3450 = i_491_ / 3;
		if (aClass185_Sub1_9377.aBool9190) {
		    aClass185_Sub1_9377.method3461(false);
		    class324.method5812(false);
		    aClass185_Sub1_9377.method3461(true);
		} else
		    class324.method5812(false);
	    }
	}
    }
    
    public void method2496(Class534_Sub21 class534_sub21, int[] is) {
	aClass700_9411.method14131(new Class534_Sub13(aClass185_Sub1_9377,
						      this, class534_sub21,
						      is),
				   (short) 789);
    }
    
    public void method2502(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			   int i_501_, int i_502_, int i_503_, boolean bool) {
	if (aClass338_9376 != null && class534_sub18_sub16 != null) {
	    int i_504_ = (i - (i_501_ * aClass185_Sub1_9377.anInt9213 >> 8)
			  >> aClass185_Sub1_9377.anInt9212);
	    int i_505_
		= (i_502_ - (i_501_ * aClass185_Sub1_9377.anInt9287 >> 8)
		   >> aClass185_Sub1_9377.anInt9212);
	    aClass338_9376.method5910(class534_sub18_sub16, i_504_, i_505_);
	}
    }
    
    void method15062() {
	if ((anInt9380 & 0x2) == 0) {
	    anIntArrayArrayArray9391 = null;
	    anIntArrayArrayArray9384 = null;
	    anIntArrayArrayArray9388 = null;
	}
	anIntArrayArrayArray9396 = null;
	anIntArrayArrayArray9416 = null;
	anIntArrayArrayArray9392 = null;
	aClass534_Sub10ArrayArrayArray9387 = null;
	aByteArrayArray9403 = null;
	aClass9_9385 = null;
	aClass534Array9408 = null;
	aFloatArrayArray9393 = null;
	aFloatArrayArray9397 = null;
	aFloatArrayArray9404 = null;
    }
    
    void method15063(int i, int i_506_, byte[][] is,
		     Class534_Sub10[] class534_sub10s, Class9 class9,
		     Class534_Sub10[] class534_sub10s_507_) {
	if (anIntArrayArrayArray9388[i][i_506_] != null) {
	    Class534_Sub10[] class534_sub10s_508_
		= aClass534_Sub10ArrayArrayArray9387[i][i_506_];
	    int[] is_509_ = anIntArrayArrayArray9384[i][i_506_];
	    int[] is_510_ = anIntArrayArrayArray9391[i][i_506_];
	    int[] is_511_ = anIntArrayArrayArray9416[i][i_506_];
	    int[] is_512_ = anIntArrayArrayArray9388[i][i_506_];
	    int[] is_513_ = (anIntArrayArrayArray9392 != null
			     ? anIntArrayArrayArray9392[i][i_506_] : null);
	    int[] is_514_ = (anIntArrayArrayArray9396 != null
			     ? anIntArrayArrayArray9396[i][i_506_] : null);
	    if (is_511_ == null)
		is_511_ = is_512_;
	    float f = aFloatArrayArray9404[i][i_506_];
	    float f_515_ = aFloatArrayArray9397[i][i_506_];
	    float f_516_ = aFloatArrayArray9393[i][i_506_];
	    float f_517_ = aFloatArrayArray9404[i][i_506_ + 1];
	    float f_518_ = aFloatArrayArray9397[i][i_506_ + 1];
	    float f_519_ = aFloatArrayArray9393[i][i_506_ + 1];
	    float f_520_ = aFloatArrayArray9404[i + 1][i_506_ + 1];
	    float f_521_ = aFloatArrayArray9397[i + 1][i_506_ + 1];
	    float f_522_ = aFloatArrayArray9393[i + 1][i_506_ + 1];
	    float f_523_ = aFloatArrayArray9404[i + 1][i_506_];
	    float f_524_ = aFloatArrayArray9397[i + 1][i_506_];
	    float f_525_ = aFloatArrayArray9393[i + 1][i_506_];
	    int i_526_ = is[i][i_506_] & 0xff;
	    int i_527_ = is[i][i_506_ + 1] & 0xff;
	    int i_528_ = is[i + 1][i_506_ + 1] & 0xff;
	    int i_529_ = is[i + 1][i_506_] & 0xff;
	    int i_530_ = 0;
	while_22_:
	    for (int i_531_ = 0; i_531_ < is_512_.length; i_531_++) {
		Class534_Sub10 class534_sub10 = class534_sub10s_508_[i_531_];
		for (int i_532_ = 0; i_532_ < i_530_; i_532_++) {
		    if (class534_sub10s[i_532_] == class534_sub10)
			continue while_22_;
		}
		class534_sub10s[i_530_++] = class534_sub10;
	    }
	    short[] is_533_
		= (aShortArrayArray9409[i_506_ * (anInt1701 * -1924295585) + i]
		   = new short[is_512_.length]);
	    for (int i_534_ = 0; i_534_ < is_512_.length; i_534_++) {
		int i_535_ = (i << anInt1703 * -1495101509) + is_509_[i_534_];
		int i_536_
		    = (i_506_ << anInt1703 * -1495101509) + is_510_[i_534_];
		int i_537_ = i_535_ >> anInt9378;
		int i_538_ = i_536_ >> anInt9378;
		int i_539_ = is_512_[i_534_];
		int i_540_ = is_511_[i_534_];
		int i_541_ = is_513_ != null ? is_513_[i_534_] : 0;
		long l = ((long) i_540_ << 48 | (long) i_539_ << 32
			  | (long) (i_537_ << 16) | (long) i_538_);
		int i_542_ = is_509_[i_534_];
		int i_543_ = is_510_[i_534_];
		int i_544_ = 74;
		int i_545_ = 0;
		float f_546_ = 1.0F;
		float f_547_;
		float f_548_;
		float f_549_;
		if (i_542_ == 0 && i_543_ == 0) {
		    f_547_ = f;
		    f_548_ = f_515_;
		    f_549_ = f_516_;
		    i_544_ -= i_526_;
		} else if (i_542_ == 0 && i_543_ == anInt1702 * 127780559) {
		    f_547_ = f_517_;
		    f_548_ = f_518_;
		    f_549_ = f_519_;
		    i_544_ -= i_527_;
		} else if (i_542_ == anInt1702 * 127780559
			   && i_543_ == anInt1702 * 127780559) {
		    f_547_ = f_520_;
		    f_548_ = f_521_;
		    f_549_ = f_522_;
		    i_544_ -= i_528_;
		} else if (i_542_ == anInt1702 * 127780559 && i_543_ == 0) {
		    f_547_ = f_523_;
		    f_548_ = f_524_;
		    f_549_ = f_525_;
		    i_544_ -= i_529_;
		} else {
		    float f_550_
			= (float) i_542_ / (float) (anInt1702 * 127780559);
		    float f_551_
			= (float) i_543_ / (float) (anInt1702 * 127780559);
		    float f_552_ = f + (f_523_ - f) * f_550_;
		    float f_553_ = f_515_ + (f_524_ - f_515_) * f_550_;
		    float f_554_ = f_516_ + (f_525_ - f_516_) * f_550_;
		    float f_555_ = f_517_ + (f_520_ - f_517_) * f_550_;
		    float f_556_ = f_518_ + (f_521_ - f_518_) * f_550_;
		    float f_557_ = f_519_ + (f_522_ - f_519_) * f_550_;
		    f_547_ = f_552_ + (f_555_ - f_552_) * f_551_;
		    f_548_ = f_553_ + (f_556_ - f_553_) * f_551_;
		    f_549_ = f_554_ + (f_557_ - f_554_) * f_551_;
		    int i_558_ = i_526_ + ((i_529_ - i_526_) * i_542_
					   >> anInt1703 * -1495101509);
		    int i_559_ = i_527_ + ((i_528_ - i_527_) * i_542_
					   >> anInt1703 * -1495101509);
		    i_544_ -= i_558_ + ((i_559_ - i_558_) * i_543_
					>> anInt1703 * -1495101509);
		}
		if (i_539_ != -1) {
		    int i_560_ = (i_539_ & 0x7f) * i_544_ >> 7;
		    if (i_560_ < 2)
			i_560_ = 2;
		    else if (i_560_ > 126)
			i_560_ = 126;
		    i_545_ = Class661.anIntArray8548[i_539_ & 0xff80 | i_560_];
		    if ((anInt9381 & 0x7) == 0) {
			f_546_
			    = (aClass185_Sub1_9377.aFloatArray9197[0] * f_547_
			       + (aClass185_Sub1_9377.aFloatArray9197[1]
				  * f_548_)
			       + (aClass185_Sub1_9377.aFloatArray9197[2]
				  * f_549_));
			f_546_
			    = (aClass185_Sub1_9377.aFloat9205
			       + f_546_ * (f_546_ > 0.0F
					   ? aClass185_Sub1_9377.aFloat9206
					   : aClass185_Sub1_9377.aFloat9267));
		    }
		}
		Class534 class534 = null;
		if ((i_535_ & anInt9379 - 1) == 0
		    && (i_536_ & anInt9379 - 1) == 0)
		    class534 = class9.method579(l);
		int i_561_;
		if (class534 == null) {
		    int i_562_;
		    if (i_540_ != i_539_) {
			int i_563_ = (i_540_ & 0x7f) * i_544_ >> 7;
			if (i_563_ < 2)
			    i_563_ = 2;
			else if (i_563_ > 126)
			    i_563_ = 126;
			i_562_ = (Class661.anIntArray8548
				  [i_540_ & 0xff80 | i_563_]);
			if ((anInt9381 & 0x7) == 0) {
			    float f_564_
				= ((aClass185_Sub1_9377.aFloatArray9197[0]
				    * f_547_)
				   + (aClass185_Sub1_9377.aFloatArray9197[1]
				      * f_548_)
				   + (aClass185_Sub1_9377.aFloatArray9197[2]
				      * f_549_));
			    f_564_
				= (aClass185_Sub1_9377.aFloat9205
				   + (f_546_
				      * (f_546_ > 0.0F
					 ? aClass185_Sub1_9377.aFloat9206
					 : aClass185_Sub1_9377.aFloat9267)));
			    int i_565_ = i_562_ >> 16 & 0xff;
			    int i_566_ = i_562_ >> 8 & 0xff;
			    int i_567_ = i_562_ & 0xff;
			    i_565_ *= f_564_;
			    if (i_565_ < 0)
				i_565_ = 0;
			    else if (i_565_ > 255)
				i_565_ = 255;
			    i_566_ *= f_564_;
			    if (i_566_ < 0)
				i_566_ = 0;
			    else if (i_566_ > 255)
				i_566_ = 255;
			    i_567_ *= f_564_;
			    if (i_567_ < 0)
				i_567_ = 0;
			    else if (i_567_ > 255)
				i_567_ = 255;
			    i_562_ = i_565_ << 16 | i_566_ << 8 | i_567_;
			}
		    } else
			i_562_ = i_545_;
		    aByteBuffer9400.putFloat((float) i_535_);
		    aByteBuffer9400.putFloat((float) (method2498(i_535_,
								 i_536_,
								 1575247495)
						      + i_541_));
		    aByteBuffer9400.putFloat((float) i_536_);
		    aByteBuffer9400.putFloat((float) i_535_);
		    aByteBuffer9400.putFloat((float) i_536_);
		    if (anIntArrayArrayArray9396 != null)
			aByteBuffer9400.putFloat(is_514_ != null
						 ? (float) (is_514_[i_534_]
							    - 1)
						 : 0.0F);
		    if ((anInt9381 & 0x7) != 0) {
			aByteBuffer9400.putFloat(f_547_);
			aByteBuffer9400.putFloat(f_548_);
			aByteBuffer9400.putFloat(f_549_);
		    }
		    if (aClass185_Sub1_9377.anInt9268 == 0) {
			int i_568_ = i_562_ & ~0xff00ff;
			i_568_ |= (i_562_ & 0xff0000) >> 16;
			i_568_ |= (i_562_ & 0xff) << 16;
			i_562_ = i_568_;
		    }
		    aByteBuffer9410.putInt(~0xffffff | i_562_);
		    i_561_ = anInt9382++;
		    is_533_[i_534_] = (short) i_561_;
		    if (i_539_ != -1)
			class534_sub10s_507_[i_561_]
			    = class534_sub10s_508_[i_534_];
		    class9.method581(new Class534_Sub15(is_533_[i_534_]), l);
		} else {
		    is_533_[i_534_] = ((Class534_Sub15) class534).aShort10466;
		    i_561_ = is_533_[i_534_] & 0xffff;
		    if (i_539_ != -1
			&& ((class534_sub10s_508_[i_534_].aLong7158
			     * 8258869577519436579L)
			    < (class534_sub10s_507_[i_561_].aLong7158
			       * 8258869577519436579L)))
			class534_sub10s_507_[i_561_]
			    = class534_sub10s_508_[i_534_];
		}
		for (int i_569_ = 0; i_569_ < i_530_; i_569_++)
		    class534_sub10s[i_569_].method16119(i_561_, i_545_, i_544_,
							f_546_);
		anInt9383++;
	    }
	}
    }
    
    void method15064(int i, int i_570_, byte[][] is,
		     Class534_Sub10[] class534_sub10s, Class9 class9,
		     Class534_Sub10[] class534_sub10s_571_) {
	if (anIntArrayArrayArray9388[i][i_570_] != null) {
	    Class534_Sub10[] class534_sub10s_572_
		= aClass534_Sub10ArrayArrayArray9387[i][i_570_];
	    int[] is_573_ = anIntArrayArrayArray9384[i][i_570_];
	    int[] is_574_ = anIntArrayArrayArray9391[i][i_570_];
	    int[] is_575_ = anIntArrayArrayArray9416[i][i_570_];
	    int[] is_576_ = anIntArrayArrayArray9388[i][i_570_];
	    int[] is_577_ = (anIntArrayArrayArray9392 != null
			     ? anIntArrayArrayArray9392[i][i_570_] : null);
	    int[] is_578_ = (anIntArrayArrayArray9396 != null
			     ? anIntArrayArrayArray9396[i][i_570_] : null);
	    if (is_575_ == null)
		is_575_ = is_576_;
	    float f = aFloatArrayArray9404[i][i_570_];
	    float f_579_ = aFloatArrayArray9397[i][i_570_];
	    float f_580_ = aFloatArrayArray9393[i][i_570_];
	    float f_581_ = aFloatArrayArray9404[i][i_570_ + 1];
	    float f_582_ = aFloatArrayArray9397[i][i_570_ + 1];
	    float f_583_ = aFloatArrayArray9393[i][i_570_ + 1];
	    float f_584_ = aFloatArrayArray9404[i + 1][i_570_ + 1];
	    float f_585_ = aFloatArrayArray9397[i + 1][i_570_ + 1];
	    float f_586_ = aFloatArrayArray9393[i + 1][i_570_ + 1];
	    float f_587_ = aFloatArrayArray9404[i + 1][i_570_];
	    float f_588_ = aFloatArrayArray9397[i + 1][i_570_];
	    float f_589_ = aFloatArrayArray9393[i + 1][i_570_];
	    int i_590_ = is[i][i_570_] & 0xff;
	    int i_591_ = is[i][i_570_ + 1] & 0xff;
	    int i_592_ = is[i + 1][i_570_ + 1] & 0xff;
	    int i_593_ = is[i + 1][i_570_] & 0xff;
	    int i_594_ = 0;
	while_24_:
	    for (int i_595_ = 0; i_595_ < is_576_.length; i_595_++) {
		Class534_Sub10 class534_sub10 = class534_sub10s_572_[i_595_];
		for (int i_596_ = 0; i_596_ < i_594_; i_596_++) {
		    if (class534_sub10s[i_596_] == class534_sub10)
			continue while_24_;
		}
		class534_sub10s[i_594_++] = class534_sub10;
	    }
	    short[] is_597_
		= (aShortArrayArray9409[i_570_ * (anInt1701 * -1924295585) + i]
		   = new short[is_576_.length]);
	    for (int i_598_ = 0; i_598_ < is_576_.length; i_598_++) {
		int i_599_ = (i << anInt1703 * -1495101509) + is_573_[i_598_];
		int i_600_
		    = (i_570_ << anInt1703 * -1495101509) + is_574_[i_598_];
		int i_601_ = i_599_ >> anInt9378;
		int i_602_ = i_600_ >> anInt9378;
		int i_603_ = is_576_[i_598_];
		int i_604_ = is_575_[i_598_];
		int i_605_ = is_577_ != null ? is_577_[i_598_] : 0;
		long l = ((long) i_604_ << 48 | (long) i_603_ << 32
			  | (long) (i_601_ << 16) | (long) i_602_);
		int i_606_ = is_573_[i_598_];
		int i_607_ = is_574_[i_598_];
		int i_608_ = 74;
		int i_609_ = 0;
		float f_610_ = 1.0F;
		float f_611_;
		float f_612_;
		float f_613_;
		if (i_606_ == 0 && i_607_ == 0) {
		    f_611_ = f;
		    f_612_ = f_579_;
		    f_613_ = f_580_;
		    i_608_ -= i_590_;
		} else if (i_606_ == 0 && i_607_ == anInt1702 * 127780559) {
		    f_611_ = f_581_;
		    f_612_ = f_582_;
		    f_613_ = f_583_;
		    i_608_ -= i_591_;
		} else if (i_606_ == anInt1702 * 127780559
			   && i_607_ == anInt1702 * 127780559) {
		    f_611_ = f_584_;
		    f_612_ = f_585_;
		    f_613_ = f_586_;
		    i_608_ -= i_592_;
		} else if (i_606_ == anInt1702 * 127780559 && i_607_ == 0) {
		    f_611_ = f_587_;
		    f_612_ = f_588_;
		    f_613_ = f_589_;
		    i_608_ -= i_593_;
		} else {
		    float f_614_
			= (float) i_606_ / (float) (anInt1702 * 127780559);
		    float f_615_
			= (float) i_607_ / (float) (anInt1702 * 127780559);
		    float f_616_ = f + (f_587_ - f) * f_614_;
		    float f_617_ = f_579_ + (f_588_ - f_579_) * f_614_;
		    float f_618_ = f_580_ + (f_589_ - f_580_) * f_614_;
		    float f_619_ = f_581_ + (f_584_ - f_581_) * f_614_;
		    float f_620_ = f_582_ + (f_585_ - f_582_) * f_614_;
		    float f_621_ = f_583_ + (f_586_ - f_583_) * f_614_;
		    f_611_ = f_616_ + (f_619_ - f_616_) * f_615_;
		    f_612_ = f_617_ + (f_620_ - f_617_) * f_615_;
		    f_613_ = f_618_ + (f_621_ - f_618_) * f_615_;
		    int i_622_ = i_590_ + ((i_593_ - i_590_) * i_606_
					   >> anInt1703 * -1495101509);
		    int i_623_ = i_591_ + ((i_592_ - i_591_) * i_606_
					   >> anInt1703 * -1495101509);
		    i_608_ -= i_622_ + ((i_623_ - i_622_) * i_607_
					>> anInt1703 * -1495101509);
		}
		if (i_603_ != -1) {
		    int i_624_ = (i_603_ & 0x7f) * i_608_ >> 7;
		    if (i_624_ < 2)
			i_624_ = 2;
		    else if (i_624_ > 126)
			i_624_ = 126;
		    i_609_ = Class661.anIntArray8548[i_603_ & 0xff80 | i_624_];
		    if ((anInt9381 & 0x7) == 0) {
			f_610_
			    = (aClass185_Sub1_9377.aFloatArray9197[0] * f_611_
			       + (aClass185_Sub1_9377.aFloatArray9197[1]
				  * f_612_)
			       + (aClass185_Sub1_9377.aFloatArray9197[2]
				  * f_613_));
			f_610_
			    = (aClass185_Sub1_9377.aFloat9205
			       + f_610_ * (f_610_ > 0.0F
					   ? aClass185_Sub1_9377.aFloat9206
					   : aClass185_Sub1_9377.aFloat9267));
		    }
		}
		Class534 class534 = null;
		if ((i_599_ & anInt9379 - 1) == 0
		    && (i_600_ & anInt9379 - 1) == 0)
		    class534 = class9.method579(l);
		int i_625_;
		if (class534 == null) {
		    int i_626_;
		    if (i_604_ != i_603_) {
			int i_627_ = (i_604_ & 0x7f) * i_608_ >> 7;
			if (i_627_ < 2)
			    i_627_ = 2;
			else if (i_627_ > 126)
			    i_627_ = 126;
			i_626_ = (Class661.anIntArray8548
				  [i_604_ & 0xff80 | i_627_]);
			if ((anInt9381 & 0x7) == 0) {
			    float f_628_
				= ((aClass185_Sub1_9377.aFloatArray9197[0]
				    * f_611_)
				   + (aClass185_Sub1_9377.aFloatArray9197[1]
				      * f_612_)
				   + (aClass185_Sub1_9377.aFloatArray9197[2]
				      * f_613_));
			    f_628_
				= (aClass185_Sub1_9377.aFloat9205
				   + (f_610_
				      * (f_610_ > 0.0F
					 ? aClass185_Sub1_9377.aFloat9206
					 : aClass185_Sub1_9377.aFloat9267)));
			    int i_629_ = i_626_ >> 16 & 0xff;
			    int i_630_ = i_626_ >> 8 & 0xff;
			    int i_631_ = i_626_ & 0xff;
			    i_629_ *= f_628_;
			    if (i_629_ < 0)
				i_629_ = 0;
			    else if (i_629_ > 255)
				i_629_ = 255;
			    i_630_ *= f_628_;
			    if (i_630_ < 0)
				i_630_ = 0;
			    else if (i_630_ > 255)
				i_630_ = 255;
			    i_631_ *= f_628_;
			    if (i_631_ < 0)
				i_631_ = 0;
			    else if (i_631_ > 255)
				i_631_ = 255;
			    i_626_ = i_629_ << 16 | i_630_ << 8 | i_631_;
			}
		    } else
			i_626_ = i_609_;
		    aByteBuffer9400.putFloat((float) i_599_);
		    aByteBuffer9400.putFloat((float) (method2498(i_599_,
								 i_600_,
								 -236968376)
						      + i_605_));
		    aByteBuffer9400.putFloat((float) i_600_);
		    aByteBuffer9400.putFloat((float) i_599_);
		    aByteBuffer9400.putFloat((float) i_600_);
		    if (anIntArrayArrayArray9396 != null)
			aByteBuffer9400.putFloat(is_578_ != null
						 ? (float) (is_578_[i_598_]
							    - 1)
						 : 0.0F);
		    if ((anInt9381 & 0x7) != 0) {
			aByteBuffer9400.putFloat(f_611_);
			aByteBuffer9400.putFloat(f_612_);
			aByteBuffer9400.putFloat(f_613_);
		    }
		    if (aClass185_Sub1_9377.anInt9268 == 0) {
			int i_632_ = i_626_ & ~0xff00ff;
			i_632_ |= (i_626_ & 0xff0000) >> 16;
			i_632_ |= (i_626_ & 0xff) << 16;
			i_626_ = i_632_;
		    }
		    aByteBuffer9410.putInt(~0xffffff | i_626_);
		    i_625_ = anInt9382++;
		    is_597_[i_598_] = (short) i_625_;
		    if (i_603_ != -1)
			class534_sub10s_571_[i_625_]
			    = class534_sub10s_572_[i_598_];
		    class9.method581(new Class534_Sub15(is_597_[i_598_]), l);
		} else {
		    is_597_[i_598_] = ((Class534_Sub15) class534).aShort10466;
		    i_625_ = is_597_[i_598_] & 0xffff;
		    if (i_603_ != -1
			&& ((class534_sub10s_572_[i_598_].aLong7158
			     * 8258869577519436579L)
			    < (class534_sub10s_571_[i_625_].aLong7158
			       * 8258869577519436579L)))
			class534_sub10s_571_[i_625_]
			    = class534_sub10s_572_[i_598_];
		}
		for (int i_633_ = 0; i_633_ < i_594_; i_633_++)
		    class534_sub10s[i_633_].method16119(i_625_, i_609_, i_608_,
							f_610_);
		anInt9383++;
	    }
	}
    }
    
    void method15065(int i, int i_634_, byte[][] is,
		     Class534_Sub10[] class534_sub10s, Class9 class9,
		     Class534_Sub10[] class534_sub10s_635_) {
	if (anIntArrayArrayArray9388[i][i_634_] != null) {
	    Class534_Sub10[] class534_sub10s_636_
		= aClass534_Sub10ArrayArrayArray9387[i][i_634_];
	    int[] is_637_ = anIntArrayArrayArray9384[i][i_634_];
	    int[] is_638_ = anIntArrayArrayArray9391[i][i_634_];
	    int[] is_639_ = anIntArrayArrayArray9416[i][i_634_];
	    int[] is_640_ = anIntArrayArrayArray9388[i][i_634_];
	    int[] is_641_ = (anIntArrayArrayArray9392 != null
			     ? anIntArrayArrayArray9392[i][i_634_] : null);
	    int[] is_642_ = (anIntArrayArrayArray9396 != null
			     ? anIntArrayArrayArray9396[i][i_634_] : null);
	    if (is_639_ == null)
		is_639_ = is_640_;
	    float f = aFloatArrayArray9404[i][i_634_];
	    float f_643_ = aFloatArrayArray9397[i][i_634_];
	    float f_644_ = aFloatArrayArray9393[i][i_634_];
	    float f_645_ = aFloatArrayArray9404[i][i_634_ + 1];
	    float f_646_ = aFloatArrayArray9397[i][i_634_ + 1];
	    float f_647_ = aFloatArrayArray9393[i][i_634_ + 1];
	    float f_648_ = aFloatArrayArray9404[i + 1][i_634_ + 1];
	    float f_649_ = aFloatArrayArray9397[i + 1][i_634_ + 1];
	    float f_650_ = aFloatArrayArray9393[i + 1][i_634_ + 1];
	    float f_651_ = aFloatArrayArray9404[i + 1][i_634_];
	    float f_652_ = aFloatArrayArray9397[i + 1][i_634_];
	    float f_653_ = aFloatArrayArray9393[i + 1][i_634_];
	    int i_654_ = is[i][i_634_] & 0xff;
	    int i_655_ = is[i][i_634_ + 1] & 0xff;
	    int i_656_ = is[i + 1][i_634_ + 1] & 0xff;
	    int i_657_ = is[i + 1][i_634_] & 0xff;
	    int i_658_ = 0;
	while_26_:
	    for (int i_659_ = 0; i_659_ < is_640_.length; i_659_++) {
		Class534_Sub10 class534_sub10 = class534_sub10s_636_[i_659_];
		for (int i_660_ = 0; i_660_ < i_658_; i_660_++) {
		    if (class534_sub10s[i_660_] == class534_sub10)
			continue while_26_;
		}
		class534_sub10s[i_658_++] = class534_sub10;
	    }
	    short[] is_661_
		= (aShortArrayArray9409[i_634_ * (anInt1701 * -1924295585) + i]
		   = new short[is_640_.length]);
	    for (int i_662_ = 0; i_662_ < is_640_.length; i_662_++) {
		int i_663_ = (i << anInt1703 * -1495101509) + is_637_[i_662_];
		int i_664_
		    = (i_634_ << anInt1703 * -1495101509) + is_638_[i_662_];
		int i_665_ = i_663_ >> anInt9378;
		int i_666_ = i_664_ >> anInt9378;
		int i_667_ = is_640_[i_662_];
		int i_668_ = is_639_[i_662_];
		int i_669_ = is_641_ != null ? is_641_[i_662_] : 0;
		long l = ((long) i_668_ << 48 | (long) i_667_ << 32
			  | (long) (i_665_ << 16) | (long) i_666_);
		int i_670_ = is_637_[i_662_];
		int i_671_ = is_638_[i_662_];
		int i_672_ = 74;
		int i_673_ = 0;
		float f_674_ = 1.0F;
		float f_675_;
		float f_676_;
		float f_677_;
		if (i_670_ == 0 && i_671_ == 0) {
		    f_675_ = f;
		    f_676_ = f_643_;
		    f_677_ = f_644_;
		    i_672_ -= i_654_;
		} else if (i_670_ == 0 && i_671_ == anInt1702 * 127780559) {
		    f_675_ = f_645_;
		    f_676_ = f_646_;
		    f_677_ = f_647_;
		    i_672_ -= i_655_;
		} else if (i_670_ == anInt1702 * 127780559
			   && i_671_ == anInt1702 * 127780559) {
		    f_675_ = f_648_;
		    f_676_ = f_649_;
		    f_677_ = f_650_;
		    i_672_ -= i_656_;
		} else if (i_670_ == anInt1702 * 127780559 && i_671_ == 0) {
		    f_675_ = f_651_;
		    f_676_ = f_652_;
		    f_677_ = f_653_;
		    i_672_ -= i_657_;
		} else {
		    float f_678_
			= (float) i_670_ / (float) (anInt1702 * 127780559);
		    float f_679_
			= (float) i_671_ / (float) (anInt1702 * 127780559);
		    float f_680_ = f + (f_651_ - f) * f_678_;
		    float f_681_ = f_643_ + (f_652_ - f_643_) * f_678_;
		    float f_682_ = f_644_ + (f_653_ - f_644_) * f_678_;
		    float f_683_ = f_645_ + (f_648_ - f_645_) * f_678_;
		    float f_684_ = f_646_ + (f_649_ - f_646_) * f_678_;
		    float f_685_ = f_647_ + (f_650_ - f_647_) * f_678_;
		    f_675_ = f_680_ + (f_683_ - f_680_) * f_679_;
		    f_676_ = f_681_ + (f_684_ - f_681_) * f_679_;
		    f_677_ = f_682_ + (f_685_ - f_682_) * f_679_;
		    int i_686_ = i_654_ + ((i_657_ - i_654_) * i_670_
					   >> anInt1703 * -1495101509);
		    int i_687_ = i_655_ + ((i_656_ - i_655_) * i_670_
					   >> anInt1703 * -1495101509);
		    i_672_ -= i_686_ + ((i_687_ - i_686_) * i_671_
					>> anInt1703 * -1495101509);
		}
		if (i_667_ != -1) {
		    int i_688_ = (i_667_ & 0x7f) * i_672_ >> 7;
		    if (i_688_ < 2)
			i_688_ = 2;
		    else if (i_688_ > 126)
			i_688_ = 126;
		    i_673_ = Class661.anIntArray8548[i_667_ & 0xff80 | i_688_];
		    if ((anInt9381 & 0x7) == 0) {
			f_674_
			    = (aClass185_Sub1_9377.aFloatArray9197[0] * f_675_
			       + (aClass185_Sub1_9377.aFloatArray9197[1]
				  * f_676_)
			       + (aClass185_Sub1_9377.aFloatArray9197[2]
				  * f_677_));
			f_674_
			    = (aClass185_Sub1_9377.aFloat9205
			       + f_674_ * (f_674_ > 0.0F
					   ? aClass185_Sub1_9377.aFloat9206
					   : aClass185_Sub1_9377.aFloat9267));
		    }
		}
		Class534 class534 = null;
		if ((i_663_ & anInt9379 - 1) == 0
		    && (i_664_ & anInt9379 - 1) == 0)
		    class534 = class9.method579(l);
		int i_689_;
		if (class534 == null) {
		    int i_690_;
		    if (i_668_ != i_667_) {
			int i_691_ = (i_668_ & 0x7f) * i_672_ >> 7;
			if (i_691_ < 2)
			    i_691_ = 2;
			else if (i_691_ > 126)
			    i_691_ = 126;
			i_690_ = (Class661.anIntArray8548
				  [i_668_ & 0xff80 | i_691_]);
			if ((anInt9381 & 0x7) == 0) {
			    float f_692_
				= ((aClass185_Sub1_9377.aFloatArray9197[0]
				    * f_675_)
				   + (aClass185_Sub1_9377.aFloatArray9197[1]
				      * f_676_)
				   + (aClass185_Sub1_9377.aFloatArray9197[2]
				      * f_677_));
			    f_692_
				= (aClass185_Sub1_9377.aFloat9205
				   + (f_674_
				      * (f_674_ > 0.0F
					 ? aClass185_Sub1_9377.aFloat9206
					 : aClass185_Sub1_9377.aFloat9267)));
			    int i_693_ = i_690_ >> 16 & 0xff;
			    int i_694_ = i_690_ >> 8 & 0xff;
			    int i_695_ = i_690_ & 0xff;
			    i_693_ *= f_692_;
			    if (i_693_ < 0)
				i_693_ = 0;
			    else if (i_693_ > 255)
				i_693_ = 255;
			    i_694_ *= f_692_;
			    if (i_694_ < 0)
				i_694_ = 0;
			    else if (i_694_ > 255)
				i_694_ = 255;
			    i_695_ *= f_692_;
			    if (i_695_ < 0)
				i_695_ = 0;
			    else if (i_695_ > 255)
				i_695_ = 255;
			    i_690_ = i_693_ << 16 | i_694_ << 8 | i_695_;
			}
		    } else
			i_690_ = i_673_;
		    aByteBuffer9400.putFloat((float) i_663_);
		    aByteBuffer9400.putFloat((float) (method2498(i_663_,
								 i_664_,
								 -2076717087)
						      + i_669_));
		    aByteBuffer9400.putFloat((float) i_664_);
		    aByteBuffer9400.putFloat((float) i_663_);
		    aByteBuffer9400.putFloat((float) i_664_);
		    if (anIntArrayArrayArray9396 != null)
			aByteBuffer9400.putFloat(is_642_ != null
						 ? (float) (is_642_[i_662_]
							    - 1)
						 : 0.0F);
		    if ((anInt9381 & 0x7) != 0) {
			aByteBuffer9400.putFloat(f_675_);
			aByteBuffer9400.putFloat(f_676_);
			aByteBuffer9400.putFloat(f_677_);
		    }
		    if (aClass185_Sub1_9377.anInt9268 == 0) {
			int i_696_ = i_690_ & ~0xff00ff;
			i_696_ |= (i_690_ & 0xff0000) >> 16;
			i_696_ |= (i_690_ & 0xff) << 16;
			i_690_ = i_696_;
		    }
		    aByteBuffer9410.putInt(~0xffffff | i_690_);
		    i_689_ = anInt9382++;
		    is_661_[i_662_] = (short) i_689_;
		    if (i_667_ != -1)
			class534_sub10s_635_[i_689_]
			    = class534_sub10s_636_[i_662_];
		    class9.method581(new Class534_Sub15(is_661_[i_662_]), l);
		} else {
		    is_661_[i_662_] = ((Class534_Sub15) class534).aShort10466;
		    i_689_ = is_661_[i_662_] & 0xffff;
		    if (i_667_ != -1
			&& ((class534_sub10s_636_[i_662_].aLong7158
			     * 8258869577519436579L)
			    < (class534_sub10s_635_[i_689_].aLong7158
			       * 8258869577519436579L)))
			class534_sub10s_635_[i_689_]
			    = class534_sub10s_636_[i_662_];
		}
		for (int i_697_ = 0; i_697_ < i_658_; i_697_++)
		    class534_sub10s[i_697_].method16119(i_689_, i_673_, i_672_,
							f_674_);
		anInt9383++;
	    }
	}
    }
    
    public void method2523(int i, int i_698_, int[] is, int[] is_699_,
			   int[] is_700_, int[] is_701_, int[] is_702_,
			   int[] is_703_, int[] is_704_, int[] is_705_,
			   Class166 class166, boolean bool) {
	Class177 class177 = aClass185_Sub1_9377.aClass177_2012;
	if (is_701_ != null && anIntArrayArrayArray9396 == null)
	    anIntArrayArrayArray9396
		= new int[anInt1701 * -1924295585][anInt1700 * -1466328823][];
	if (is_699_ != null && anIntArrayArrayArray9392 == null)
	    anIntArrayArrayArray9392
		= new int[anInt1701 * -1924295585][anInt1700 * -1466328823][];
	anIntArrayArrayArray9384[i][i_698_] = is;
	anIntArrayArrayArray9391[i][i_698_] = is_700_;
	anIntArrayArrayArray9388[i][i_698_] = is_702_;
	anIntArrayArrayArray9416[i][i_698_] = is_703_;
	if (anIntArrayArrayArray9396 != null)
	    anIntArrayArrayArray9396[i][i_698_] = is_701_;
	if (anIntArrayArrayArray9392 != null)
	    anIntArrayArrayArray9392[i][i_698_] = is_699_;
	Class534_Sub10[] class534_sub10s
	    = (aClass534_Sub10ArrayArrayArray9387[i][i_698_]
	       = new Class534_Sub10[is_702_.length]);
	for (int i_706_ = 0; i_706_ < is_702_.length; i_706_++) {
	    int i_707_ = is_704_[i_706_];
	    int i_708_ = is_705_[i_706_];
	    if ((anInt9381 & 0x20) != 0 && i_707_ != -1
		&& class177.method2931(i_707_, (byte) 1).aBool2072) {
		i_708_ = 128;
		i_707_ = -1;
	    }
	    long l = ((long) (class166.anInt1764 * 1446227271) << 48
		      | (long) (class166.anInt1762 * -1095140607) << 42
		      | (long) (class166.anInt1763 * 2113275141) << 28
		      | (long) (i_708_ << 14) | (long) i_707_);
	    Class534 class534;
	    for (class534 = aClass9_9385.method579(l); class534 != null;
		 class534 = aClass9_9385.method582(503243045)) {
		Class534_Sub10 class534_sub10 = (Class534_Sub10) class534;
		if (class534_sub10.anInt10428 == i_707_
		    && class534_sub10.aFloat10432 == (float) i_708_
		    && class534_sub10.aClass166_10430.method2745(class166,
								 (byte) -107))
		    break;
	    }
	    if (class534 == null) {
		class534_sub10s[i_706_]
		    = new Class534_Sub10(this, i_707_, i_708_, class166);
		aClass9_9385.method581(class534_sub10s[i_706_], l);
	    } else
		class534_sub10s[i_706_] = (Class534_Sub10) class534;
	}
	if (bool)
	    aByteArrayArray9394[i][i_698_] |= 0x1;
	if (is_702_.length > anInt9402)
	    anInt9402 = is_702_.length;
	anInt9401 += is_702_.length;
    }
    
    void method15066(Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2,
		     int i, int i_709_) {
	int[] is = anIntArrayArrayArray9384[i][i_709_];
	int[] is_710_ = anIntArrayArrayArray9391[i][i_709_];
	int i_711_ = is.length;
	if (anIntArray9413.length < i_711_) {
	    anIntArray9413 = new int[i_711_];
	    anIntArray9414 = new int[i_711_];
	}
	for (int i_712_ = 0; i_712_ < i_711_; i_712_++) {
	    anIntArray9413[i_712_]
		= is[i_712_] >> aClass185_Sub1_9377.anInt9212;
	    anIntArray9414[i_712_]
		= is_710_[i_712_] >> aClass185_Sub1_9377.anInt9212;
	}
	int i_713_ = 0;
	while (i_713_ < i_711_) {
	    int i_714_ = anIntArray9413[i_713_];
	    int i_715_ = anIntArray9414[i_713_++];
	    int i_716_ = anIntArray9413[i_713_];
	    int i_717_ = anIntArray9414[i_713_++];
	    int i_718_ = anIntArray9413[i_713_];
	    int i_719_ = anIntArray9414[i_713_++];
	    if (((i_714_ - i_716_) * (i_717_ - i_719_)
		 - (i_717_ - i_715_) * (i_718_ - i_716_))
		> 0)
		class534_sub18_sub16_sub2.method18755(i_715_, i_717_, i_719_,
						      i_714_, i_716_, i_718_);
	}
    }
}
