/* Class171_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class171_Sub6 extends Class171
{
    int[] anIntArray9968;
    int[] anIntArray9969;
    int[] anIntArray9970;
    int[] anIntArray9971;
    int[] anIntArray9972;
    byte[][] aByteArrayArray9973;
    Class185_Sub2 aClass185_Sub2_9974;
    
    void method2847(char c, int i, int i_0_, int i_1_, boolean bool,
		    Class145 class145, int i_2_, int i_3_) {
	if (null != aClass185_Sub2_9974.anIntArray9338) {
	    if (null == class145)
		method2860(c, i, i_0_, i_1_, bool);
	    else {
		i += anIntArray9969[c];
		i_0_ += anIntArray9970[c];
		int i_4_ = anIntArray9971[c];
		int i_5_ = anIntArray9972[c];
		int i_6_ = 356365251 * aClass185_Sub2_9974.anInt9356;
		int i_7_ = i + i_6_ * i_0_;
		int i_8_ = i_6_ - i_4_;
		int i_9_ = 0;
		int i_10_ = 0;
		if (i_0_ < 9823353 * aClass185_Sub2_9974.anInt9344) {
		    int i_11_ = aClass185_Sub2_9974.anInt9344 * 9823353 - i_0_;
		    i_5_ -= i_11_;
		    i_0_ = aClass185_Sub2_9974.anInt9344 * 9823353;
		    i_10_ += i_4_ * i_11_;
		    i_7_ += i_11_ * i_6_;
		}
		if (i_0_ + i_5_ > aClass185_Sub2_9974.anInt9345 * 639238427)
		    i_5_ -= (i_5_ + i_0_
			     - aClass185_Sub2_9974.anInt9345 * 639238427);
		if (i < aClass185_Sub2_9974.anInt9365 * 1709859847) {
		    int i_12_ = aClass185_Sub2_9974.anInt9365 * 1709859847 - i;
		    i_4_ -= i_12_;
		    i = aClass185_Sub2_9974.anInt9365 * 1709859847;
		    i_10_ += i_12_;
		    i_7_ += i_12_;
		    i_9_ += i_12_;
		    i_8_ += i_12_;
		}
		if (i_4_ + i > aClass185_Sub2_9974.anInt9343 * -1807368365) {
		    int i_13_
			= (i_4_ + i
			   - -1807368365 * aClass185_Sub2_9974.anInt9343);
		    i_4_ -= i_13_;
		    i_9_ += i_13_;
		    i_8_ += i_13_;
		}
		if (i_4_ > 0 && i_5_ > 0) {
		    if (bool)
			method15627(aByteArrayArray9973[c],
				    aClass185_Sub2_9974.anIntArray9338, i_1_,
				    i_10_, i_7_, i_4_, i_5_, i_8_, i_9_, i,
				    i_0_, anIntArray9971[c], class145, i_2_,
				    i_3_);
		    else
			method15618(aByteArrayArray9973[c],
				    aClass185_Sub2_9974.anIntArray9338,
				    anIntArray9968, i_1_, i_10_, i_7_, i_4_,
				    i_5_, i_8_, i_9_, i, i_0_,
				    anIntArray9971[c], class145, i_2_, i_3_);
		}
	    }
	}
    }
    
    void method2860(char c, int i, int i_14_, int i_15_, boolean bool) {
	if (aClass185_Sub2_9974.anIntArray9338 != null) {
	    i += anIntArray9969[c];
	    i_14_ += anIntArray9970[c];
	    int i_16_ = anIntArray9971[c];
	    int i_17_ = anIntArray9972[c];
	    int i_18_ = aClass185_Sub2_9974.anInt9356 * 356365251;
	    int i_19_ = i + i_14_ * i_18_;
	    int i_20_ = i_18_ - i_16_;
	    int i_21_ = 0;
	    int i_22_ = 0;
	    if (i_14_ < aClass185_Sub2_9974.anInt9344 * 9823353) {
		int i_23_ = 9823353 * aClass185_Sub2_9974.anInt9344 - i_14_;
		i_17_ -= i_23_;
		i_14_ = aClass185_Sub2_9974.anInt9344 * 9823353;
		i_22_ += i_16_ * i_23_;
		i_19_ += i_23_ * i_18_;
	    }
	    if (i_17_ + i_14_ > 639238427 * aClass185_Sub2_9974.anInt9345)
		i_17_ -= (i_17_ + i_14_
			  - 639238427 * aClass185_Sub2_9974.anInt9345);
	    if (i < aClass185_Sub2_9974.anInt9365 * 1709859847) {
		int i_24_ = 1709859847 * aClass185_Sub2_9974.anInt9365 - i;
		i_16_ -= i_24_;
		i = aClass185_Sub2_9974.anInt9365 * 1709859847;
		i_22_ += i_24_;
		i_19_ += i_24_;
		i_21_ += i_24_;
		i_20_ += i_24_;
	    }
	    if (i_16_ + i > aClass185_Sub2_9974.anInt9343 * -1807368365) {
		int i_25_
		    = i_16_ + i - -1807368365 * aClass185_Sub2_9974.anInt9343;
		i_16_ -= i_25_;
		i_21_ += i_25_;
		i_20_ += i_25_;
	    }
	    if (i_16_ > 0 && i_17_ > 0) {
		if (bool)
		    method15617(aByteArrayArray9973[c],
				aClass185_Sub2_9974.anIntArray9338, i_15_,
				i_22_, i_19_, i_16_, i_17_, i_20_, i_21_);
		else
		    method15619(aByteArrayArray9973[c],
				aClass185_Sub2_9974.anIntArray9338,
				anIntArray9968, i_22_, i_19_, i_16_, i_17_,
				i_20_, i_21_);
	    }
	}
    }
    
    Class171_Sub6(Class185_Sub2 class185_sub2, Class16 class16,
		  Class169_Sub2[] class169_sub2s, int[] is, int[] is_26_) {
	super(class185_sub2, class16);
	aClass185_Sub2_9974 = class185_sub2;
	aClass185_Sub2_9974 = class185_sub2;
	anIntArray9971 = is;
	anIntArray9972 = is_26_;
	aByteArrayArray9973 = new byte[class169_sub2s.length][];
	anIntArray9970 = new int[class169_sub2s.length];
	anIntArray9969 = new int[class169_sub2s.length];
	for (int i = 0; i < class169_sub2s.length; i++) {
	    aByteArrayArray9973[i] = class169_sub2s[i].aByteArray9796;
	    anIntArray9970[i] = class169_sub2s[i].anInt9792;
	    anIntArray9969[i] = class169_sub2s[i].anInt9790;
	}
	anIntArray9968 = class169_sub2s[0].anIntArray9794;
    }
    
    void method15617(byte[] is, int[] is_27_, int i, int i_28_, int i_29_,
		     int i_30_, int i_31_, int i_32_, int i_33_) {
	int i_34_ = -(i_30_ >> 2);
	i_30_ = -(i_30_ & 0x3);
	for (int i_35_ = -i_31_; i_35_ < 0; i_35_++) {
	    for (int i_36_ = i_34_; i_36_ < 0; i_36_++) {
		if (is[i_28_++] != 0)
		    is_27_[i_29_++] = i;
		else
		    i_29_++;
		if (is[i_28_++] != 0)
		    is_27_[i_29_++] = i;
		else
		    i_29_++;
		if (is[i_28_++] != 0)
		    is_27_[i_29_++] = i;
		else
		    i_29_++;
		if (is[i_28_++] != 0)
		    is_27_[i_29_++] = i;
		else
		    i_29_++;
	    }
	    for (int i_37_ = i_30_; i_37_ < 0; i_37_++) {
		if (is[i_28_++] != 0)
		    is_27_[i_29_++] = i;
		else
		    i_29_++;
	    }
	    i_29_ += i_32_;
	    i_28_ += i_33_;
	}
    }
    
    void method2877(char c, int i, int i_38_, int i_39_, boolean bool,
		    Class145 class145, int i_40_, int i_41_) {
	if (null != aClass185_Sub2_9974.anIntArray9338) {
	    if (null == class145)
		method2860(c, i, i_38_, i_39_, bool);
	    else {
		i += anIntArray9969[c];
		i_38_ += anIntArray9970[c];
		int i_42_ = anIntArray9971[c];
		int i_43_ = anIntArray9972[c];
		int i_44_ = 356365251 * aClass185_Sub2_9974.anInt9356;
		int i_45_ = i + i_44_ * i_38_;
		int i_46_ = i_44_ - i_42_;
		int i_47_ = 0;
		int i_48_ = 0;
		if (i_38_ < 9823353 * aClass185_Sub2_9974.anInt9344) {
		    int i_49_
			= aClass185_Sub2_9974.anInt9344 * 9823353 - i_38_;
		    i_43_ -= i_49_;
		    i_38_ = aClass185_Sub2_9974.anInt9344 * 9823353;
		    i_48_ += i_42_ * i_49_;
		    i_45_ += i_49_ * i_44_;
		}
		if (i_38_ + i_43_ > aClass185_Sub2_9974.anInt9345 * 639238427)
		    i_43_ -= (i_43_ + i_38_
			      - aClass185_Sub2_9974.anInt9345 * 639238427);
		if (i < aClass185_Sub2_9974.anInt9365 * 1709859847) {
		    int i_50_ = aClass185_Sub2_9974.anInt9365 * 1709859847 - i;
		    i_42_ -= i_50_;
		    i = aClass185_Sub2_9974.anInt9365 * 1709859847;
		    i_48_ += i_50_;
		    i_45_ += i_50_;
		    i_47_ += i_50_;
		    i_46_ += i_50_;
		}
		if (i_42_ + i > aClass185_Sub2_9974.anInt9343 * -1807368365) {
		    int i_51_
			= (i_42_ + i
			   - -1807368365 * aClass185_Sub2_9974.anInt9343);
		    i_42_ -= i_51_;
		    i_47_ += i_51_;
		    i_46_ += i_51_;
		}
		if (i_42_ > 0 && i_43_ > 0) {
		    if (bool)
			method15627(aByteArrayArray9973[c],
				    aClass185_Sub2_9974.anIntArray9338, i_39_,
				    i_48_, i_45_, i_42_, i_43_, i_46_, i_47_,
				    i, i_38_, anIntArray9971[c], class145,
				    i_40_, i_41_);
		    else
			method15618(aByteArrayArray9973[c],
				    aClass185_Sub2_9974.anIntArray9338,
				    anIntArray9968, i_39_, i_48_, i_45_, i_42_,
				    i_43_, i_46_, i_47_, i, i_38_,
				    anIntArray9971[c], class145, i_40_, i_41_);
		}
	    }
	}
    }
    
    void method15618(byte[] is, int[] is_52_, int[] is_53_, int i, int i_54_,
		     int i_55_, int i_56_, int i_57_, int i_58_, int i_59_,
		     int i_60_, int i_61_, int i_62_, Class145 class145,
		     int i_63_, int i_64_) {
	Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
	int[] is_65_ = class145_sub2.anIntArray9797;
	int[] is_66_ = class145_sub2.anIntArray9798;
	int i_67_ = i_60_ - aClass185_Sub2_9974.anInt9365 * 1709859847;
	int i_68_ = i_61_;
	if (i_64_ > i_68_) {
	    i_68_ = i_64_;
	    i_55_ += (i_64_ - i_61_) * (356365251
					* aClass185_Sub2_9974.anInt9356);
	    i_54_ += (i_64_ - i_61_) * i_62_;
	}
	int i_69_ = (is_65_.length + i_64_ < i_57_ + i_61_
		     ? is_65_.length + i_64_ : i_61_ + i_57_);
	boolean bool = false;
	for (int i_70_ = i_68_; i_70_ < i_69_; i_70_++) {
	    int i_71_ = is_65_[i_70_ - i_64_] + i_63_;
	    int i_72_ = is_66_[i_70_ - i_64_];
	    int i_73_ = i_56_;
	    if (i_67_ > i_71_) {
		int i_74_ = i_67_ - i_71_;
		if (i_74_ >= i_72_) {
		    i_54_ += i_56_ + i_59_;
		    i_55_ += i_56_ + i_58_;
		    continue;
		}
		i_72_ -= i_74_;
	    } else {
		int i_75_ = i_71_ - i_67_;
		if (i_75_ >= i_56_) {
		    i_54_ += i_56_ + i_59_;
		    i_55_ += i_58_ + i_56_;
		    continue;
		}
		i_54_ += i_75_;
		i_73_ -= i_75_;
		i_55_ += i_75_;
	    }
	    int i_76_ = 0;
	    if (i_73_ < i_72_)
		i_72_ = i_73_;
	    else
		i_76_ = i_73_ - i_72_;
	    for (int i_77_ = -i_72_; i_77_ < 0; i_77_++) {
		int i_78_;
		if ((i_78_ = is[i_54_++]) != 0)
		    is_52_[i_55_++] = is_53_[i_78_ & 0xff];
		else
		    i_55_++;
	    }
	    i_54_ += i_76_ + i_59_;
	    i_55_ += i_58_ + i_76_;
	}
    }
    
    void method15619(byte[] is, int[] is_79_, int[] is_80_, int i, int i_81_,
		     int i_82_, int i_83_, int i_84_, int i_85_) {
	int i_86_ = -(i_82_ >> 2);
	i_82_ = -(i_82_ & 0x3);
	boolean bool = false;
	for (int i_87_ = -i_83_; i_87_ < 0; i_87_++) {
	    for (int i_88_ = i_86_; i_88_ < 0; i_88_++) {
		int i_89_;
		if ((i_89_ = is[i++]) != 0)
		    is_79_[i_81_++] = is_80_[i_89_ & 0xff];
		else
		    i_81_++;
		if ((i_89_ = is[i++]) != 0)
		    is_79_[i_81_++] = is_80_[i_89_ & 0xff];
		else
		    i_81_++;
		if ((i_89_ = is[i++]) != 0)
		    is_79_[i_81_++] = is_80_[i_89_ & 0xff];
		else
		    i_81_++;
		if ((i_89_ = is[i++]) != 0)
		    is_79_[i_81_++] = is_80_[i_89_ & 0xff];
		else
		    i_81_++;
	    }
	    for (int i_90_ = i_82_; i_90_ < 0; i_90_++) {
		int i_91_;
		if ((i_91_ = is[i++]) != 0)
		    is_79_[i_81_++] = is_80_[i_91_ & 0xff];
		else
		    i_81_++;
	    }
	    i_81_ += i_84_;
	    i += i_85_;
	}
    }
    
    void method15620(byte[] is, int[] is_92_, int[] is_93_, int i, int i_94_,
		     int i_95_, int i_96_, int i_97_, int i_98_, int i_99_,
		     int i_100_, int i_101_, int i_102_, Class145 class145,
		     int i_103_, int i_104_) {
	Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
	int[] is_105_ = class145_sub2.anIntArray9797;
	int[] is_106_ = class145_sub2.anIntArray9798;
	int i_107_ = i_100_ - aClass185_Sub2_9974.anInt9365 * 1709859847;
	int i_108_ = i_101_;
	if (i_104_ > i_108_) {
	    i_108_ = i_104_;
	    i_95_ += (i_104_ - i_101_) * (356365251
					  * aClass185_Sub2_9974.anInt9356);
	    i_94_ += (i_104_ - i_101_) * i_102_;
	}
	int i_109_ = (is_105_.length + i_104_ < i_97_ + i_101_
		      ? is_105_.length + i_104_ : i_101_ + i_97_);
	boolean bool = false;
	for (int i_110_ = i_108_; i_110_ < i_109_; i_110_++) {
	    int i_111_ = is_105_[i_110_ - i_104_] + i_103_;
	    int i_112_ = is_106_[i_110_ - i_104_];
	    int i_113_ = i_96_;
	    if (i_107_ > i_111_) {
		int i_114_ = i_107_ - i_111_;
		if (i_114_ >= i_112_) {
		    i_94_ += i_96_ + i_99_;
		    i_95_ += i_96_ + i_98_;
		    continue;
		}
		i_112_ -= i_114_;
	    } else {
		int i_115_ = i_111_ - i_107_;
		if (i_115_ >= i_96_) {
		    i_94_ += i_96_ + i_99_;
		    i_95_ += i_98_ + i_96_;
		    continue;
		}
		i_94_ += i_115_;
		i_113_ -= i_115_;
		i_95_ += i_115_;
	    }
	    int i_116_ = 0;
	    if (i_113_ < i_112_)
		i_112_ = i_113_;
	    else
		i_116_ = i_113_ - i_112_;
	    for (int i_117_ = -i_112_; i_117_ < 0; i_117_++) {
		int i_118_;
		if ((i_118_ = is[i_94_++]) != 0)
		    is_92_[i_95_++] = is_93_[i_118_ & 0xff];
		else
		    i_95_++;
	    }
	    i_94_ += i_116_ + i_99_;
	    i_95_ += i_98_ + i_116_;
	}
    }
    
    void method15621(byte[] is, int[] is_119_, int[] is_120_, int i,
		     int i_121_, int i_122_, int i_123_, int i_124_,
		     int i_125_) {
	int i_126_ = -(i_122_ >> 2);
	i_122_ = -(i_122_ & 0x3);
	boolean bool = false;
	for (int i_127_ = -i_123_; i_127_ < 0; i_127_++) {
	    for (int i_128_ = i_126_; i_128_ < 0; i_128_++) {
		int i_129_;
		if ((i_129_ = is[i++]) != 0)
		    is_119_[i_121_++] = is_120_[i_129_ & 0xff];
		else
		    i_121_++;
		if ((i_129_ = is[i++]) != 0)
		    is_119_[i_121_++] = is_120_[i_129_ & 0xff];
		else
		    i_121_++;
		if ((i_129_ = is[i++]) != 0)
		    is_119_[i_121_++] = is_120_[i_129_ & 0xff];
		else
		    i_121_++;
		if ((i_129_ = is[i++]) != 0)
		    is_119_[i_121_++] = is_120_[i_129_ & 0xff];
		else
		    i_121_++;
	    }
	    for (int i_130_ = i_122_; i_130_ < 0; i_130_++) {
		int i_131_;
		if ((i_131_ = is[i++]) != 0)
		    is_119_[i_121_++] = is_120_[i_131_ & 0xff];
		else
		    i_121_++;
	    }
	    i_121_ += i_124_;
	    i += i_125_;
	}
    }
    
    void method15622(byte[] is, int[] is_132_, int i, int i_133_, int i_134_,
		     int i_135_, int i_136_, int i_137_, int i_138_) {
	int i_139_ = -(i_135_ >> 2);
	i_135_ = -(i_135_ & 0x3);
	for (int i_140_ = -i_136_; i_140_ < 0; i_140_++) {
	    for (int i_141_ = i_139_; i_141_ < 0; i_141_++) {
		if (is[i_133_++] != 0)
		    is_132_[i_134_++] = i;
		else
		    i_134_++;
		if (is[i_133_++] != 0)
		    is_132_[i_134_++] = i;
		else
		    i_134_++;
		if (is[i_133_++] != 0)
		    is_132_[i_134_++] = i;
		else
		    i_134_++;
		if (is[i_133_++] != 0)
		    is_132_[i_134_++] = i;
		else
		    i_134_++;
	    }
	    for (int i_142_ = i_135_; i_142_ < 0; i_142_++) {
		if (is[i_133_++] != 0)
		    is_132_[i_134_++] = i;
		else
		    i_134_++;
	    }
	    i_134_ += i_137_;
	    i_133_ += i_138_;
	}
    }
    
    void method2848(char c, int i, int i_143_, int i_144_, boolean bool,
		    Class145 class145, int i_145_, int i_146_) {
	if (null != aClass185_Sub2_9974.anIntArray9338) {
	    if (null == class145)
		method2860(c, i, i_143_, i_144_, bool);
	    else {
		i += anIntArray9969[c];
		i_143_ += anIntArray9970[c];
		int i_147_ = anIntArray9971[c];
		int i_148_ = anIntArray9972[c];
		int i_149_ = 356365251 * aClass185_Sub2_9974.anInt9356;
		int i_150_ = i + i_149_ * i_143_;
		int i_151_ = i_149_ - i_147_;
		int i_152_ = 0;
		int i_153_ = 0;
		if (i_143_ < 9823353 * aClass185_Sub2_9974.anInt9344) {
		    int i_154_
			= aClass185_Sub2_9974.anInt9344 * 9823353 - i_143_;
		    i_148_ -= i_154_;
		    i_143_ = aClass185_Sub2_9974.anInt9344 * 9823353;
		    i_153_ += i_147_ * i_154_;
		    i_150_ += i_154_ * i_149_;
		}
		if (i_143_ + i_148_
		    > aClass185_Sub2_9974.anInt9345 * 639238427)
		    i_148_ -= (i_148_ + i_143_
			       - aClass185_Sub2_9974.anInt9345 * 639238427);
		if (i < aClass185_Sub2_9974.anInt9365 * 1709859847) {
		    int i_155_
			= aClass185_Sub2_9974.anInt9365 * 1709859847 - i;
		    i_147_ -= i_155_;
		    i = aClass185_Sub2_9974.anInt9365 * 1709859847;
		    i_153_ += i_155_;
		    i_150_ += i_155_;
		    i_152_ += i_155_;
		    i_151_ += i_155_;
		}
		if (i_147_ + i > aClass185_Sub2_9974.anInt9343 * -1807368365) {
		    int i_156_
			= (i_147_ + i
			   - -1807368365 * aClass185_Sub2_9974.anInt9343);
		    i_147_ -= i_156_;
		    i_152_ += i_156_;
		    i_151_ += i_156_;
		}
		if (i_147_ > 0 && i_148_ > 0) {
		    if (bool)
			method15627(aByteArrayArray9973[c],
				    aClass185_Sub2_9974.anIntArray9338, i_144_,
				    i_153_, i_150_, i_147_, i_148_, i_151_,
				    i_152_, i, i_143_, anIntArray9971[c],
				    class145, i_145_, i_146_);
		    else
			method15618(aByteArrayArray9973[c],
				    aClass185_Sub2_9974.anIntArray9338,
				    anIntArray9968, i_144_, i_153_, i_150_,
				    i_147_, i_148_, i_151_, i_152_, i, i_143_,
				    anIntArray9971[c], class145, i_145_,
				    i_146_);
		}
	    }
	}
    }
    
    void method2845(char c, int i, int i_157_, int i_158_, boolean bool) {
	if (aClass185_Sub2_9974.anIntArray9338 != null) {
	    i += anIntArray9969[c];
	    i_157_ += anIntArray9970[c];
	    int i_159_ = anIntArray9971[c];
	    int i_160_ = anIntArray9972[c];
	    int i_161_ = aClass185_Sub2_9974.anInt9356 * 356365251;
	    int i_162_ = i + i_157_ * i_161_;
	    int i_163_ = i_161_ - i_159_;
	    int i_164_ = 0;
	    int i_165_ = 0;
	    if (i_157_ < aClass185_Sub2_9974.anInt9344 * 9823353) {
		int i_166_ = 9823353 * aClass185_Sub2_9974.anInt9344 - i_157_;
		i_160_ -= i_166_;
		i_157_ = aClass185_Sub2_9974.anInt9344 * 9823353;
		i_165_ += i_159_ * i_166_;
		i_162_ += i_166_ * i_161_;
	    }
	    if (i_160_ + i_157_ > 639238427 * aClass185_Sub2_9974.anInt9345)
		i_160_ -= (i_160_ + i_157_
			   - 639238427 * aClass185_Sub2_9974.anInt9345);
	    if (i < aClass185_Sub2_9974.anInt9365 * 1709859847) {
		int i_167_ = 1709859847 * aClass185_Sub2_9974.anInt9365 - i;
		i_159_ -= i_167_;
		i = aClass185_Sub2_9974.anInt9365 * 1709859847;
		i_165_ += i_167_;
		i_162_ += i_167_;
		i_164_ += i_167_;
		i_163_ += i_167_;
	    }
	    if (i_159_ + i > aClass185_Sub2_9974.anInt9343 * -1807368365) {
		int i_168_
		    = i_159_ + i - -1807368365 * aClass185_Sub2_9974.anInt9343;
		i_159_ -= i_168_;
		i_164_ += i_168_;
		i_163_ += i_168_;
	    }
	    if (i_159_ > 0 && i_160_ > 0) {
		if (bool)
		    method15617(aByteArrayArray9973[c],
				aClass185_Sub2_9974.anIntArray9338, i_158_,
				i_165_, i_162_, i_159_, i_160_, i_163_,
				i_164_);
		else
		    method15619(aByteArrayArray9973[c],
				aClass185_Sub2_9974.anIntArray9338,
				anIntArray9968, i_165_, i_162_, i_159_, i_160_,
				i_163_, i_164_);
	    }
	}
    }
    
    void method15623(byte[] is, int[] is_169_, int[] is_170_, int i,
		     int i_171_, int i_172_, int i_173_, int i_174_,
		     int i_175_) {
	int i_176_ = -(i_172_ >> 2);
	i_172_ = -(i_172_ & 0x3);
	boolean bool = false;
	for (int i_177_ = -i_173_; i_177_ < 0; i_177_++) {
	    for (int i_178_ = i_176_; i_178_ < 0; i_178_++) {
		int i_179_;
		if ((i_179_ = is[i++]) != 0)
		    is_169_[i_171_++] = is_170_[i_179_ & 0xff];
		else
		    i_171_++;
		if ((i_179_ = is[i++]) != 0)
		    is_169_[i_171_++] = is_170_[i_179_ & 0xff];
		else
		    i_171_++;
		if ((i_179_ = is[i++]) != 0)
		    is_169_[i_171_++] = is_170_[i_179_ & 0xff];
		else
		    i_171_++;
		if ((i_179_ = is[i++]) != 0)
		    is_169_[i_171_++] = is_170_[i_179_ & 0xff];
		else
		    i_171_++;
	    }
	    for (int i_180_ = i_172_; i_180_ < 0; i_180_++) {
		int i_181_;
		if ((i_181_ = is[i++]) != 0)
		    is_169_[i_171_++] = is_170_[i_181_ & 0xff];
		else
		    i_171_++;
	    }
	    i_171_ += i_174_;
	    i += i_175_;
	}
    }
    
    void method2846(char c, int i, int i_182_, int i_183_, boolean bool) {
	if (aClass185_Sub2_9974.anIntArray9338 != null) {
	    i += anIntArray9969[c];
	    i_182_ += anIntArray9970[c];
	    int i_184_ = anIntArray9971[c];
	    int i_185_ = anIntArray9972[c];
	    int i_186_ = aClass185_Sub2_9974.anInt9356 * 356365251;
	    int i_187_ = i + i_182_ * i_186_;
	    int i_188_ = i_186_ - i_184_;
	    int i_189_ = 0;
	    int i_190_ = 0;
	    if (i_182_ < aClass185_Sub2_9974.anInt9344 * 9823353) {
		int i_191_ = 9823353 * aClass185_Sub2_9974.anInt9344 - i_182_;
		i_185_ -= i_191_;
		i_182_ = aClass185_Sub2_9974.anInt9344 * 9823353;
		i_190_ += i_184_ * i_191_;
		i_187_ += i_191_ * i_186_;
	    }
	    if (i_185_ + i_182_ > 639238427 * aClass185_Sub2_9974.anInt9345)
		i_185_ -= (i_185_ + i_182_
			   - 639238427 * aClass185_Sub2_9974.anInt9345);
	    if (i < aClass185_Sub2_9974.anInt9365 * 1709859847) {
		int i_192_ = 1709859847 * aClass185_Sub2_9974.anInt9365 - i;
		i_184_ -= i_192_;
		i = aClass185_Sub2_9974.anInt9365 * 1709859847;
		i_190_ += i_192_;
		i_187_ += i_192_;
		i_189_ += i_192_;
		i_188_ += i_192_;
	    }
	    if (i_184_ + i > aClass185_Sub2_9974.anInt9343 * -1807368365) {
		int i_193_
		    = i_184_ + i - -1807368365 * aClass185_Sub2_9974.anInt9343;
		i_184_ -= i_193_;
		i_189_ += i_193_;
		i_188_ += i_193_;
	    }
	    if (i_184_ > 0 && i_185_ > 0) {
		if (bool)
		    method15617(aByteArrayArray9973[c],
				aClass185_Sub2_9974.anIntArray9338, i_183_,
				i_190_, i_187_, i_184_, i_185_, i_188_,
				i_189_);
		else
		    method15619(aByteArrayArray9973[c],
				aClass185_Sub2_9974.anIntArray9338,
				anIntArray9968, i_190_, i_187_, i_184_, i_185_,
				i_188_, i_189_);
	    }
	}
    }
    
    void method15624(byte[] is, int[] is_194_, int[] is_195_, int i,
		     int i_196_, int i_197_, int i_198_, int i_199_,
		     int i_200_) {
	int i_201_ = -(i_197_ >> 2);
	i_197_ = -(i_197_ & 0x3);
	boolean bool = false;
	for (int i_202_ = -i_198_; i_202_ < 0; i_202_++) {
	    for (int i_203_ = i_201_; i_203_ < 0; i_203_++) {
		int i_204_;
		if ((i_204_ = is[i++]) != 0)
		    is_194_[i_196_++] = is_195_[i_204_ & 0xff];
		else
		    i_196_++;
		if ((i_204_ = is[i++]) != 0)
		    is_194_[i_196_++] = is_195_[i_204_ & 0xff];
		else
		    i_196_++;
		if ((i_204_ = is[i++]) != 0)
		    is_194_[i_196_++] = is_195_[i_204_ & 0xff];
		else
		    i_196_++;
		if ((i_204_ = is[i++]) != 0)
		    is_194_[i_196_++] = is_195_[i_204_ & 0xff];
		else
		    i_196_++;
	    }
	    for (int i_205_ = i_197_; i_205_ < 0; i_205_++) {
		int i_206_;
		if ((i_206_ = is[i++]) != 0)
		    is_194_[i_196_++] = is_195_[i_206_ & 0xff];
		else
		    i_196_++;
	    }
	    i_196_ += i_199_;
	    i += i_200_;
	}
    }
    
    void method15625(byte[] is, int[] is_207_, int i, int i_208_, int i_209_,
		     int i_210_, int i_211_, int i_212_, int i_213_) {
	int i_214_ = -(i_210_ >> 2);
	i_210_ = -(i_210_ & 0x3);
	for (int i_215_ = -i_211_; i_215_ < 0; i_215_++) {
	    for (int i_216_ = i_214_; i_216_ < 0; i_216_++) {
		if (is[i_208_++] != 0)
		    is_207_[i_209_++] = i;
		else
		    i_209_++;
		if (is[i_208_++] != 0)
		    is_207_[i_209_++] = i;
		else
		    i_209_++;
		if (is[i_208_++] != 0)
		    is_207_[i_209_++] = i;
		else
		    i_209_++;
		if (is[i_208_++] != 0)
		    is_207_[i_209_++] = i;
		else
		    i_209_++;
	    }
	    for (int i_217_ = i_210_; i_217_ < 0; i_217_++) {
		if (is[i_208_++] != 0)
		    is_207_[i_209_++] = i;
		else
		    i_209_++;
	    }
	    i_209_ += i_212_;
	    i_208_ += i_213_;
	}
    }
    
    void method15626(byte[] is, int[] is_218_, int i, int i_219_, int i_220_,
		     int i_221_, int i_222_, int i_223_, int i_224_) {
	int i_225_ = -(i_221_ >> 2);
	i_221_ = -(i_221_ & 0x3);
	for (int i_226_ = -i_222_; i_226_ < 0; i_226_++) {
	    for (int i_227_ = i_225_; i_227_ < 0; i_227_++) {
		if (is[i_219_++] != 0)
		    is_218_[i_220_++] = i;
		else
		    i_220_++;
		if (is[i_219_++] != 0)
		    is_218_[i_220_++] = i;
		else
		    i_220_++;
		if (is[i_219_++] != 0)
		    is_218_[i_220_++] = i;
		else
		    i_220_++;
		if (is[i_219_++] != 0)
		    is_218_[i_220_++] = i;
		else
		    i_220_++;
	    }
	    for (int i_228_ = i_221_; i_228_ < 0; i_228_++) {
		if (is[i_219_++] != 0)
		    is_218_[i_220_++] = i;
		else
		    i_220_++;
	    }
	    i_220_ += i_223_;
	    i_219_ += i_224_;
	}
    }
    
    void method15627(byte[] is, int[] is_229_, int i, int i_230_, int i_231_,
		     int i_232_, int i_233_, int i_234_, int i_235_,
		     int i_236_, int i_237_, int i_238_, Class145 class145,
		     int i_239_, int i_240_) {
	Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
	int[] is_241_ = class145_sub2.anIntArray9797;
	int[] is_242_ = class145_sub2.anIntArray9798;
	int i_243_ = i_236_ - 1709859847 * aClass185_Sub2_9974.anInt9365;
	int i_244_ = i_237_;
	if (i_240_ > i_244_) {
	    i_244_ = i_240_;
	    i_231_ += (i_240_ - i_237_) * (aClass185_Sub2_9974.anInt9356
					   * 356365251);
	    i_230_ += i_238_ * (i_240_ - i_237_);
	}
	int i_245_ = (is_241_.length + i_240_ < i_237_ + i_233_
		      ? is_241_.length + i_240_ : i_237_ + i_233_);
	for (int i_246_ = i_244_; i_246_ < i_245_; i_246_++) {
	    int i_247_ = i_239_ + is_241_[i_246_ - i_240_];
	    int i_248_ = is_242_[i_246_ - i_240_];
	    int i_249_ = i_232_;
	    if (i_243_ > i_247_) {
		int i_250_ = i_243_ - i_247_;
		if (i_250_ >= i_248_) {
		    i_230_ += i_235_ + i_232_;
		    i_231_ += i_232_ + i_234_;
		    continue;
		}
		i_248_ -= i_250_;
	    } else {
		int i_251_ = i_247_ - i_243_;
		if (i_251_ >= i_232_) {
		    i_230_ += i_235_ + i_232_;
		    i_231_ += i_232_ + i_234_;
		    continue;
		}
		i_230_ += i_251_;
		i_249_ -= i_251_;
		i_231_ += i_251_;
	    }
	    int i_252_ = 0;
	    if (i_249_ < i_248_)
		i_248_ = i_249_;
	    else
		i_252_ = i_249_ - i_248_;
	    for (int i_253_ = -i_248_; i_253_ < 0; i_253_++) {
		if (is[i_230_++] != 0)
		    is_229_[i_231_++] = i;
		else
		    i_231_++;
	    }
	    i_230_ += i_252_ + i_230_;
	    i_231_ += i_252_ + i_234_;
	}
    }
    
    void method15628(byte[] is, int[] is_254_, int i, int i_255_, int i_256_,
		     int i_257_, int i_258_, int i_259_, int i_260_,
		     int i_261_, int i_262_, int i_263_, Class145 class145,
		     int i_264_, int i_265_) {
	Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
	int[] is_266_ = class145_sub2.anIntArray9797;
	int[] is_267_ = class145_sub2.anIntArray9798;
	int i_268_ = i_261_ - 1709859847 * aClass185_Sub2_9974.anInt9365;
	int i_269_ = i_262_;
	if (i_265_ > i_269_) {
	    i_269_ = i_265_;
	    i_256_ += (i_265_ - i_262_) * (aClass185_Sub2_9974.anInt9356
					   * 356365251);
	    i_255_ += i_263_ * (i_265_ - i_262_);
	}
	int i_270_ = (is_266_.length + i_265_ < i_262_ + i_258_
		      ? is_266_.length + i_265_ : i_262_ + i_258_);
	for (int i_271_ = i_269_; i_271_ < i_270_; i_271_++) {
	    int i_272_ = i_264_ + is_266_[i_271_ - i_265_];
	    int i_273_ = is_267_[i_271_ - i_265_];
	    int i_274_ = i_257_;
	    if (i_268_ > i_272_) {
		int i_275_ = i_268_ - i_272_;
		if (i_275_ >= i_273_) {
		    i_255_ += i_260_ + i_257_;
		    i_256_ += i_257_ + i_259_;
		    continue;
		}
		i_273_ -= i_275_;
	    } else {
		int i_276_ = i_272_ - i_268_;
		if (i_276_ >= i_257_) {
		    i_255_ += i_260_ + i_257_;
		    i_256_ += i_257_ + i_259_;
		    continue;
		}
		i_255_ += i_276_;
		i_274_ -= i_276_;
		i_256_ += i_276_;
	    }
	    int i_277_ = 0;
	    if (i_274_ < i_273_)
		i_273_ = i_274_;
	    else
		i_277_ = i_274_ - i_273_;
	    for (int i_278_ = -i_273_; i_278_ < 0; i_278_++) {
		if (is[i_255_++] != 0)
		    is_254_[i_256_++] = i;
		else
		    i_256_++;
	    }
	    i_255_ += i_277_ + i_255_;
	    i_256_ += i_277_ + i_259_;
	}
    }
    
    static final void method15629(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class316.method5722(class247, class243, class669, (byte) 6);
    }
}
