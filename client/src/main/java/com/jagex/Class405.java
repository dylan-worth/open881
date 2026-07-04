/* Class405 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Random;

public abstract class Class405
{
    static final int anInt4278 = 12;
    int anInt4279;
    static final int anInt4280 = 4095;
    short[] aShortArray4281;
    short[] aShortArray4282 = new short[512];
    int anInt4283;
    int anInt4284;
    static final int anInt4285 = 4096;
    public static int[] anIntArray4286 = new int[4096];
    int anInt4287;
    int anInt4288;
    
    abstract void method6622(int i, int i_0_);
    
    void method6623(int i, int i_1_, int i_2_) {
	int[] is = new int[i];
	int[] is_3_ = new int[i_1_];
	int[] is_4_ = new int[i_2_];
	for (int i_5_ = 0; i_5_ < i; i_5_++)
	    is[i_5_] = (i_5_ << 12) / i;
	for (int i_6_ = 0; i_6_ < i_1_; i_6_++)
	    is_3_[i_6_] = (i_6_ << 12) / i_1_;
	for (int i_7_ = 0; i_7_ < i_2_; i_7_++)
	    is_4_[i_7_] = (i_7_ << 12) / i_2_;
	method6624();
	for (int i_8_ = 0; i_8_ < i_2_; i_8_++) {
	    for (int i_9_ = 0; i_9_ < i_1_; i_9_++) {
		for (int i_10_ = 0; i_10_ < i; i_10_++) {
		    for (int i_11_ = 0; i_11_ < anInt4287; i_11_++) {
			int i_12_ = aShortArray4281[i_11_] << 12;
			int i_13_ = anInt4284 * i_12_ >> 12;
			int i_14_ = anInt4288 * i_12_ >> 12;
			int i_15_ = anInt4283 * i_12_ >> 12;
			int i_16_ = is[i_10_] * i_12_ >> 12;
			int i_17_ = is_3_[i_9_] * i_12_ >> 12;
			int i_18_ = is_4_[i_8_] * i_12_ >> 12;
			i_16_ *= anInt4284;
			i_17_ *= anInt4288;
			i_18_ *= anInt4283;
			int i_19_ = i_16_ >> 12;
			int i_20_ = i_19_ + 1;
			i_19_ &= 0xff;
			int i_21_ = i_17_ >> 12;
			int i_22_ = i_21_ + 1;
			i_21_ &= 0xff;
			int i_23_ = i_18_ >> 12;
			int i_24_ = i_23_ + 1;
			i_23_ &= 0xff;
			if (i_20_ >= i_13_)
			    i_20_ = 0;
			else
			    i_20_ &= 0xff;
			if (i_22_ >= i_14_)
			    i_22_ = 0;
			else
			    i_22_ &= 0xff;
			if (i_24_ >= i_15_)
			    i_24_ = 0;
			else
			    i_24_ &= 0xff;
			i_16_ &= 0xfff;
			i_17_ &= 0xfff;
			i_18_ &= 0xfff;
			int i_25_ = anIntArray4286[i_16_];
			int i_26_ = anIntArray4286[i_17_];
			int i_27_ = anIntArray4286[i_18_];
			int i_28_ = i_16_ - 4096;
			int i_29_ = i_17_ - 4096;
			int i_30_ = i_18_ - 4096;
			int i_31_ = aShortArray4282[i_23_];
			int i_32_ = aShortArray4282[i_24_];
			int i_33_ = aShortArray4282[i_21_ + i_31_];
			int i_34_ = aShortArray4282[i_22_ + i_31_];
			int i_35_ = aShortArray4282[i_21_ + i_32_];
			int i_36_ = aShortArray4282[i_22_ + i_32_];
			int i_37_ = method6628(aShortArray4282[i_19_ + i_33_],
					       i_16_, i_17_, i_18_);
			int i_38_ = method6628(aShortArray4282[i_20_ + i_33_],
					       i_28_, i_17_, i_18_);
			int i_39_ = i_37_ + (i_25_ * (i_38_ - i_37_) >> 12);
			i_37_ = method6628(aShortArray4282[i_19_ + i_34_],
					   i_16_, i_29_, i_18_);
			i_38_ = method6628(aShortArray4282[i_20_ + i_34_],
					   i_28_, i_29_, i_18_);
			int i_40_ = i_37_ + (i_25_ * (i_38_ - i_37_) >> 12);
			int i_41_ = i_39_ + (i_26_ * (i_40_ - i_39_) >> 12);
			i_37_ = method6628(aShortArray4282[i_19_ + i_35_],
					   i_16_, i_17_, i_30_);
			i_38_ = method6628(aShortArray4282[i_20_ + i_35_],
					   i_28_, i_17_, i_30_);
			i_39_ = i_37_ + (i_25_ * (i_38_ - i_37_) >> 12);
			i_37_ = method6628(aShortArray4282[i_19_ + i_36_],
					   i_16_, i_29_, i_30_);
			i_38_ = method6628(aShortArray4282[i_20_ + i_36_],
					   i_28_, i_29_, i_30_);
			i_40_ = i_37_ + (i_25_ * (i_38_ - i_37_) >> 12);
			int i_42_ = i_39_ + (i_26_ * (i_40_ - i_39_) >> 12);
			method6622(i_11_,
				   i_41_ + (i_27_ * (i_42_ - i_41_) >> 12));
		    }
		    method6625();
		}
	    }
	}
    }
    
    abstract void method6624();
    
    abstract void method6625();
    
    static int method6626(int i, int i_43_, int i_44_, int i_45_) {
	int i_46_ = i & 0xf;
	int i_47_ = i_46_ < 8 ? i_43_ : i_44_;
	int i_48_
	    = i_46_ < 4 ? i_44_ : i_46_ == 12 || i_46_ == 14 ? i_43_ : i_45_;
	return (((i_46_ & 0x1) == 0 ? i_47_ : -i_47_)
		+ ((i_46_ & 0x2) == 0 ? i_48_ : -i_48_));
    }
    
    void method6627() {
	aShortArray4281 = new short[anInt4287];
	for (int i = 0; i < anInt4287; i++)
	    aShortArray4281[i] = (short) (int) Math.pow(2.0, (double) i);
    }
    
    static int method6628(int i, int i_49_, int i_50_, int i_51_) {
	int i_52_ = i & 0xf;
	int i_53_ = i_52_ < 8 ? i_49_ : i_50_;
	int i_54_
	    = i_52_ < 4 ? i_50_ : i_52_ == 12 || i_52_ == 14 ? i_49_ : i_51_;
	return (((i_52_ & 0x1) == 0 ? i_53_ : -i_53_)
		+ ((i_52_ & 0x2) == 0 ? i_54_ : -i_54_));
    }
    
    void method6629(int i, int i_55_, int i_56_) {
	int[] is = new int[i];
	int[] is_57_ = new int[i_55_];
	int[] is_58_ = new int[i_56_];
	for (int i_59_ = 0; i_59_ < i; i_59_++)
	    is[i_59_] = (i_59_ << 12) / i;
	for (int i_60_ = 0; i_60_ < i_55_; i_60_++)
	    is_57_[i_60_] = (i_60_ << 12) / i_55_;
	for (int i_61_ = 0; i_61_ < i_56_; i_61_++)
	    is_58_[i_61_] = (i_61_ << 12) / i_56_;
	method6624();
	for (int i_62_ = 0; i_62_ < i_56_; i_62_++) {
	    for (int i_63_ = 0; i_63_ < i_55_; i_63_++) {
		for (int i_64_ = 0; i_64_ < i; i_64_++) {
		    for (int i_65_ = 0; i_65_ < anInt4287; i_65_++) {
			int i_66_ = aShortArray4281[i_65_] << 12;
			int i_67_ = anInt4284 * i_66_ >> 12;
			int i_68_ = anInt4288 * i_66_ >> 12;
			int i_69_ = anInt4283 * i_66_ >> 12;
			int i_70_ = is[i_64_] * i_66_ >> 12;
			int i_71_ = is_57_[i_63_] * i_66_ >> 12;
			int i_72_ = is_58_[i_62_] * i_66_ >> 12;
			i_70_ *= anInt4284;
			i_71_ *= anInt4288;
			i_72_ *= anInt4283;
			int i_73_ = i_70_ >> 12;
			int i_74_ = i_73_ + 1;
			i_73_ &= 0xff;
			int i_75_ = i_71_ >> 12;
			int i_76_ = i_75_ + 1;
			i_75_ &= 0xff;
			int i_77_ = i_72_ >> 12;
			int i_78_ = i_77_ + 1;
			i_77_ &= 0xff;
			if (i_74_ >= i_67_)
			    i_74_ = 0;
			else
			    i_74_ &= 0xff;
			if (i_76_ >= i_68_)
			    i_76_ = 0;
			else
			    i_76_ &= 0xff;
			if (i_78_ >= i_69_)
			    i_78_ = 0;
			else
			    i_78_ &= 0xff;
			i_70_ &= 0xfff;
			i_71_ &= 0xfff;
			i_72_ &= 0xfff;
			int i_79_ = anIntArray4286[i_70_];
			int i_80_ = anIntArray4286[i_71_];
			int i_81_ = anIntArray4286[i_72_];
			int i_82_ = i_70_ - 4096;
			int i_83_ = i_71_ - 4096;
			int i_84_ = i_72_ - 4096;
			int i_85_ = aShortArray4282[i_77_];
			int i_86_ = aShortArray4282[i_78_];
			int i_87_ = aShortArray4282[i_75_ + i_85_];
			int i_88_ = aShortArray4282[i_76_ + i_85_];
			int i_89_ = aShortArray4282[i_75_ + i_86_];
			int i_90_ = aShortArray4282[i_76_ + i_86_];
			int i_91_ = method6628(aShortArray4282[i_73_ + i_87_],
					       i_70_, i_71_, i_72_);
			int i_92_ = method6628(aShortArray4282[i_74_ + i_87_],
					       i_82_, i_71_, i_72_);
			int i_93_ = i_91_ + (i_79_ * (i_92_ - i_91_) >> 12);
			i_91_ = method6628(aShortArray4282[i_73_ + i_88_],
					   i_70_, i_83_, i_72_);
			i_92_ = method6628(aShortArray4282[i_74_ + i_88_],
					   i_82_, i_83_, i_72_);
			int i_94_ = i_91_ + (i_79_ * (i_92_ - i_91_) >> 12);
			int i_95_ = i_93_ + (i_80_ * (i_94_ - i_93_) >> 12);
			i_91_ = method6628(aShortArray4282[i_73_ + i_89_],
					   i_70_, i_71_, i_84_);
			i_92_ = method6628(aShortArray4282[i_74_ + i_89_],
					   i_82_, i_71_, i_84_);
			i_93_ = i_91_ + (i_79_ * (i_92_ - i_91_) >> 12);
			i_91_ = method6628(aShortArray4282[i_73_ + i_90_],
					   i_70_, i_83_, i_84_);
			i_92_ = method6628(aShortArray4282[i_74_ + i_90_],
					   i_82_, i_83_, i_84_);
			i_94_ = i_91_ + (i_79_ * (i_92_ - i_91_) >> 12);
			int i_96_ = i_93_ + (i_80_ * (i_94_ - i_93_) >> 12);
			method6622(i_65_,
				   i_95_ + (i_81_ * (i_96_ - i_95_) >> 12));
		    }
		    method6625();
		}
	    }
	}
    }
    
    static final int method6630(int i) {
	int i_97_ = i * (i * i >> 12) >> 12;
	int i_98_ = i * 6 - 61440;
	int i_99_ = 40960 + (i_98_ * i >> 12);
	return i_99_ * i_97_ >> 12;
    }
    
    static {
	for (int i = 0; i < 4096; i++)
	    anIntArray4286[i] = method6630(i);
    }
    
    void method6631() {
	Random random = new Random((long) anInt4279);
	for (int i = 0; i < 255; i++)
	    aShortArray4282[i] = (short) i;
	for (int i = 0; i < 255; i++) {
	    int i_100_ = 255 - i;
	    int i_101_
		= Class200_Sub21.method15637(random, i_100_, 1902134044);
	    short i_102_ = aShortArray4282[i_101_];
	    aShortArray4282[i_101_] = aShortArray4282[i_100_];
	    aShortArray4282[i_100_] = aShortArray4282[i_100_ + 256] = i_102_;
	}
    }
    
    void method6632(int i, int i_103_, int i_104_) {
	int[] is = new int[i];
	int[] is_105_ = new int[i_103_];
	int[] is_106_ = new int[i_104_];
	for (int i_107_ = 0; i_107_ < i; i_107_++)
	    is[i_107_] = (i_107_ << 12) / i;
	for (int i_108_ = 0; i_108_ < i_103_; i_108_++)
	    is_105_[i_108_] = (i_108_ << 12) / i_103_;
	for (int i_109_ = 0; i_109_ < i_104_; i_109_++)
	    is_106_[i_109_] = (i_109_ << 12) / i_104_;
	method6624();
	for (int i_110_ = 0; i_110_ < i_104_; i_110_++) {
	    for (int i_111_ = 0; i_111_ < i_103_; i_111_++) {
		for (int i_112_ = 0; i_112_ < i; i_112_++) {
		    for (int i_113_ = 0; i_113_ < anInt4287; i_113_++) {
			int i_114_ = aShortArray4281[i_113_] << 12;
			int i_115_ = anInt4284 * i_114_ >> 12;
			int i_116_ = anInt4288 * i_114_ >> 12;
			int i_117_ = anInt4283 * i_114_ >> 12;
			int i_118_ = is[i_112_] * i_114_ >> 12;
			int i_119_ = is_105_[i_111_] * i_114_ >> 12;
			int i_120_ = is_106_[i_110_] * i_114_ >> 12;
			i_118_ *= anInt4284;
			i_119_ *= anInt4288;
			i_120_ *= anInt4283;
			int i_121_ = i_118_ >> 12;
			int i_122_ = i_121_ + 1;
			i_121_ &= 0xff;
			int i_123_ = i_119_ >> 12;
			int i_124_ = i_123_ + 1;
			i_123_ &= 0xff;
			int i_125_ = i_120_ >> 12;
			int i_126_ = i_125_ + 1;
			i_125_ &= 0xff;
			if (i_122_ >= i_115_)
			    i_122_ = 0;
			else
			    i_122_ &= 0xff;
			if (i_124_ >= i_116_)
			    i_124_ = 0;
			else
			    i_124_ &= 0xff;
			if (i_126_ >= i_117_)
			    i_126_ = 0;
			else
			    i_126_ &= 0xff;
			i_118_ &= 0xfff;
			i_119_ &= 0xfff;
			i_120_ &= 0xfff;
			int i_127_ = anIntArray4286[i_118_];
			int i_128_ = anIntArray4286[i_119_];
			int i_129_ = anIntArray4286[i_120_];
			int i_130_ = i_118_ - 4096;
			int i_131_ = i_119_ - 4096;
			int i_132_ = i_120_ - 4096;
			int i_133_ = aShortArray4282[i_125_];
			int i_134_ = aShortArray4282[i_126_];
			int i_135_ = aShortArray4282[i_123_ + i_133_];
			int i_136_ = aShortArray4282[i_124_ + i_133_];
			int i_137_ = aShortArray4282[i_123_ + i_134_];
			int i_138_ = aShortArray4282[i_124_ + i_134_];
			int i_139_
			    = method6628(aShortArray4282[i_121_ + i_135_],
					 i_118_, i_119_, i_120_);
			int i_140_
			    = method6628(aShortArray4282[i_122_ + i_135_],
					 i_130_, i_119_, i_120_);
			int i_141_
			    = i_139_ + (i_127_ * (i_140_ - i_139_) >> 12);
			i_139_ = method6628(aShortArray4282[i_121_ + i_136_],
					    i_118_, i_131_, i_120_);
			i_140_ = method6628(aShortArray4282[i_122_ + i_136_],
					    i_130_, i_131_, i_120_);
			int i_142_
			    = i_139_ + (i_127_ * (i_140_ - i_139_) >> 12);
			int i_143_
			    = i_141_ + (i_128_ * (i_142_ - i_141_) >> 12);
			i_139_ = method6628(aShortArray4282[i_121_ + i_137_],
					    i_118_, i_119_, i_132_);
			i_140_ = method6628(aShortArray4282[i_122_ + i_137_],
					    i_130_, i_119_, i_132_);
			i_141_ = i_139_ + (i_127_ * (i_140_ - i_139_) >> 12);
			i_139_ = method6628(aShortArray4282[i_121_ + i_138_],
					    i_118_, i_131_, i_132_);
			i_140_ = method6628(aShortArray4282[i_122_ + i_138_],
					    i_130_, i_131_, i_132_);
			i_142_ = i_139_ + (i_127_ * (i_140_ - i_139_) >> 12);
			int i_144_
			    = i_141_ + (i_128_ * (i_142_ - i_141_) >> 12);
			method6622(i_113_, i_143_ + (i_129_ * (i_144_ - i_143_)
						     >> 12));
		    }
		    method6625();
		}
	    }
	}
    }
    
    abstract void method6633();
    
    abstract void method6634();
    
    abstract void method6635(int i, int i_145_);
    
    abstract void method6636(int i, int i_146_);
    
    void method6637() {
	aShortArray4281 = new short[anInt4287];
	for (int i = 0; i < anInt4287; i++)
	    aShortArray4281[i] = (short) (int) Math.pow(2.0, (double) i);
    }
    
    static int method6638(int i, int i_147_, int i_148_, int i_149_) {
	int i_150_ = i & 0xf;
	int i_151_ = i_150_ < 8 ? i_147_ : i_148_;
	int i_152_ = (i_150_ < 4 ? i_148_ : i_150_ == 12 || i_150_ == 14
		      ? i_147_ : i_149_);
	return (((i_150_ & 0x1) == 0 ? i_151_ : -i_151_)
		+ ((i_150_ & 0x2) == 0 ? i_152_ : -i_152_));
    }
    
    void method6639() {
	Random random = new Random((long) anInt4279);
	for (int i = 0; i < 255; i++)
	    aShortArray4282[i] = (short) i;
	for (int i = 0; i < 255; i++) {
	    int i_153_ = 255 - i;
	    int i_154_
		= Class200_Sub21.method15637(random, i_153_, 1902134044);
	    short i_155_ = aShortArray4282[i_154_];
	    aShortArray4282[i_154_] = aShortArray4282[i_153_];
	    aShortArray4282[i_153_] = aShortArray4282[i_153_ + 256] = i_155_;
	}
    }
    
    void method6640() {
	Random random = new Random((long) anInt4279);
	for (int i = 0; i < 255; i++)
	    aShortArray4282[i] = (short) i;
	for (int i = 0; i < 255; i++) {
	    int i_156_ = 255 - i;
	    int i_157_
		= Class200_Sub21.method15637(random, i_156_, 1902134044);
	    short i_158_ = aShortArray4282[i_157_];
	    aShortArray4282[i_157_] = aShortArray4282[i_156_];
	    aShortArray4282[i_156_] = aShortArray4282[i_156_ + 256] = i_158_;
	}
    }
    
    void method6641() {
	Random random = new Random((long) anInt4279);
	for (int i = 0; i < 255; i++)
	    aShortArray4282[i] = (short) i;
	for (int i = 0; i < 255; i++) {
	    int i_159_ = 255 - i;
	    int i_160_
		= Class200_Sub21.method15637(random, i_159_, 1902134044);
	    short i_161_ = aShortArray4282[i_160_];
	    aShortArray4282[i_160_] = aShortArray4282[i_159_];
	    aShortArray4282[i_159_] = aShortArray4282[i_159_ + 256] = i_161_;
	}
    }
    
    static final int method6642(int i) {
	int i_162_ = i * (i * i >> 12) >> 12;
	int i_163_ = i * 6 - 61440;
	int i_164_ = 40960 + (i_163_ * i >> 12);
	return i_164_ * i_162_ >> 12;
    }
    
    Class405(int i, int i_165_, int i_166_, int i_167_, int i_168_) {
	anInt4279 = 0;
	anInt4284 = 4;
	anInt4288 = 4;
	anInt4283 = 4;
	anInt4287 = 4;
	anInt4279 = i;
	anInt4284 = i_166_;
	anInt4288 = i_167_;
	anInt4283 = i_168_;
	anInt4287 = i_165_;
	method6627();
	method6631();
    }
    
    static final int method6643(int i) {
	int i_169_ = i * (i * i >> 12) >> 12;
	int i_170_ = i * 6 - 61440;
	int i_171_ = 40960 + (i_170_ * i >> 12);
	return i_171_ * i_169_ >> 12;
    }
}
