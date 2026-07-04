/* Class256 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class256
{
    int[] anIntArray2704;
    int[] anIntArray2705;
    int anInt2706;
    int anInt2707;
    int[] anIntArray2708;
    int anInt2709 = 0;
    int anInt2710 = 0;
    float[][] aFloatArrayArray2711;
    
    float[] method4654(Class258 class258) {
	return aFloatArrayArray2711[method4658(class258)];
    }
    
    float[] method4655(Class258 class258) {
	return aFloatArrayArray2711[method4658(class258)];
    }
    
    void method4656(Class258 class258) {
	int i = class258.method4697();
	int i_0_ = class258.method4782();
	class258.method4699(24);
	anInt2706 = class258.method4699(16);
	anInt2707 = class258.method4699(24);
	if (anIntArray2705 == null || anIntArray2705.length != anInt2707)
	    anIntArray2705 = new int[anInt2707];
	boolean bool = class258.method4714() != 0;
	if (bool) {
	    int i_1_ = 0;
	    int i_2_ = class258.method4699(5) + 1;
	    while (i_1_ < anInt2707) {
		int i_3_
		    = class258.method4699(Class695.method14072((anInt2707
								- i_1_),
							       (byte) -22));
		for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
		    anIntArray2705[i_1_++] = i_2_;
		i_2_++;
	    }
	} else {
	    boolean bool_5_ = class258.method4714() != 0;
	    for (int i_6_ = 0; i_6_ < anInt2707; i_6_++) {
		if (bool_5_ && class258.method4714() == 0)
		    anIntArray2705[i_6_] = 0;
		else
		    anIntArray2705[i_6_] = class258.method4699(5) + 1;
	    }
	}
	method4657();
	int i_7_ = class258.method4699(4);
	if (i_7_ > 0) {
	    float f = class258.method4718(class258.method4699(32));
	    float f_8_ = class258.method4718(class258.method4699(32));
	    int i_9_ = class258.method4699(4) + 1;
	    boolean bool_10_ = class258.method4714() != 0;
	    int i_11_;
	    if (i_7_ == 1)
		i_11_ = method4664(anInt2707, anInt2706);
	    else
		i_11_ = anInt2707 * anInt2706;
	    anIntArray2708 = new int[i_11_];
	    for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
		anIntArray2708[i_12_] = class258.method4699(i_9_);
	    aFloatArrayArray2711 = new float[anInt2707][anInt2706];
	    if (i_7_ == 1) {
		for (int i_13_ = 0; i_13_ < anInt2707; i_13_++) {
		    float f_14_ = 0.0F;
		    int i_15_ = 1;
		    for (int i_16_ = 0; i_16_ < anInt2706; i_16_++) {
			int i_17_ = i_13_ / i_15_ % i_11_;
			float f_18_
			    = (float) anIntArray2708[i_17_] * f_8_ + f + f_14_;
			aFloatArrayArray2711[i_13_][i_16_] = f_18_;
			if (bool_10_)
			    f_14_ = f_18_;
			i_15_ *= i_11_;
		    }
		}
	    } else {
		for (int i_19_ = 0; i_19_ < anInt2707; i_19_++) {
		    float f_20_ = 0.0F;
		    int i_21_ = i_19_ * anInt2706;
		    for (int i_22_ = 0; i_22_ < anInt2706; i_22_++) {
			float f_23_
			    = (float) anIntArray2708[i_21_] * f_8_ + f + f_20_;
			aFloatArrayArray2711[i_19_][i_22_] = f_23_;
			if (bool_10_)
			    f_20_ = f_23_;
			i_21_++;
		    }
		}
	    }
	}
	anInt2710 = class258.method4697() - i;
	anInt2709 = class258.method4782() - i_0_;
    }
    
    Class256() {
	/* empty */
    }
    
    void method4657() {
	int[] is = new int[anInt2707];
	int[] is_24_ = new int[33];
	for (int i = 0; i < anInt2707; i++) {
	    int i_25_ = anIntArray2705[i];
	    if (i_25_ != 0) {
		int i_26_ = 1 << 32 - i_25_;
		int i_27_ = is_24_[i_25_];
		is[i] = i_27_;
		int i_28_;
		if ((i_27_ & i_26_) != 0)
		    i_28_ = is_24_[i_25_ - 1];
		else {
		    i_28_ = i_27_ | i_26_;
		    for (int i_29_ = i_25_ - 1; i_29_ >= 1; i_29_--) {
			int i_30_ = is_24_[i_29_];
			if (i_30_ != i_27_)
			    break;
			int i_31_ = 1 << 32 - i_29_;
			if ((i_30_ & i_31_) != 0) {
			    is_24_[i_29_] = is_24_[i_29_ - 1];
			    break;
			}
			is_24_[i_29_] = i_30_ | i_31_;
		    }
		}
		is_24_[i_25_] = i_28_;
		for (int i_32_ = i_25_ + 1; i_32_ <= 32; i_32_++) {
		    int i_33_ = is_24_[i_32_];
		    if (i_33_ == i_27_)
			is_24_[i_32_] = i_28_;
		}
	    }
	}
	anIntArray2704 = new int[8];
	int i = 0;
	for (int i_34_ = 0; i_34_ < anInt2707; i_34_++) {
	    int i_35_ = anIntArray2705[i_34_];
	    if (i_35_ != 0) {
		int i_36_ = is[i_34_];
		int i_37_ = 0;
		for (int i_38_ = 0; i_38_ < i_35_; i_38_++) {
		    int i_39_ = -2147483648 >>> i_38_;
		    if ((i_36_ & i_39_) != 0) {
			if (anIntArray2704[i_37_] == 0)
			    anIntArray2704[i_37_] = i;
			i_37_ = anIntArray2704[i_37_];
		    } else
			i_37_++;
		    if (i_37_ >= anIntArray2704.length) {
			int[] is_40_ = new int[anIntArray2704.length * 2];
			for (int i_41_ = 0; i_41_ < anIntArray2704.length;
			     i_41_++)
			    is_40_[i_41_] = anIntArray2704[i_41_];
			anIntArray2704 = is_40_;
		    }
		    i_39_ >>>= 1;
		}
		anIntArray2704[i_37_] = i_34_ ^ 0xffffffff;
		if (i_37_ >= i)
		    i = i_37_ + 1;
	    }
	}
    }
    
    int method4658(Class258 class258) {
	int i;
	for (i = 0; anIntArray2704[i] >= 0;
	     i = class258.method4714() != 0 ? anIntArray2704[i] : i + 1) {
	    /* empty */
	}
	return anIntArray2704[i] ^ 0xffffffff;
    }
    
    float[] method4659(Class258 class258) {
	return aFloatArrayArray2711[method4658(class258)];
    }
    
    static int method4660(int i, int i_42_) {
	int i_43_ = (int) Math.pow((double) i, 1.0 / (double) i_42_) + 1;
	for (;;) {
	    int i_44_ = i_43_;
	    int i_45_ = i_42_;
	    int i_46_ = 1;
	    for (/**/; i_45_ > 1; i_45_ >>= 1) {
		if ((i_45_ & 0x1) != 0)
		    i_46_ *= i_44_;
		i_44_ *= i_44_;
	    }
	    int i_47_;
	    if (1 == i_45_)
		i_47_ = i_46_ * i_44_;
	    else
		i_47_ = i_46_;
	    if (i_47_ <= i)
		break;
	    i_43_--;
	}
	return i_43_;
    }
    
    static int method4661(int i, int i_48_) {
	int i_49_ = (int) Math.pow((double) i, 1.0 / (double) i_48_) + 1;
	for (;;) {
	    int i_50_ = i_49_;
	    int i_51_ = i_48_;
	    int i_52_ = 1;
	    for (/**/; i_51_ > 1; i_51_ >>= 1) {
		if ((i_51_ & 0x1) != 0)
		    i_52_ *= i_50_;
		i_50_ *= i_50_;
	    }
	    int i_53_;
	    if (1 == i_51_)
		i_53_ = i_52_ * i_50_;
	    else
		i_53_ = i_52_;
	    if (i_53_ <= i)
		break;
	    i_49_--;
	}
	return i_49_;
    }
    
    void method4662(Class258 class258) {
	int i = class258.method4697();
	int i_54_ = class258.method4782();
	class258.method4699(24);
	anInt2706 = class258.method4699(16);
	anInt2707 = class258.method4699(24);
	if (anIntArray2705 == null || anIntArray2705.length != anInt2707)
	    anIntArray2705 = new int[anInt2707];
	boolean bool = class258.method4714() != 0;
	if (bool) {
	    int i_55_ = 0;
	    int i_56_ = class258.method4699(5) + 1;
	    while (i_55_ < anInt2707) {
		int i_57_
		    = class258.method4699(Class695.method14072((anInt2707
								- i_55_),
							       (byte) 3));
		for (int i_58_ = 0; i_58_ < i_57_; i_58_++)
		    anIntArray2705[i_55_++] = i_56_;
		i_56_++;
	    }
	} else {
	    boolean bool_59_ = class258.method4714() != 0;
	    for (int i_60_ = 0; i_60_ < anInt2707; i_60_++) {
		if (bool_59_ && class258.method4714() == 0)
		    anIntArray2705[i_60_] = 0;
		else
		    anIntArray2705[i_60_] = class258.method4699(5) + 1;
	    }
	}
	method4657();
	int i_61_ = class258.method4699(4);
	if (i_61_ > 0) {
	    float f = class258.method4718(class258.method4699(32));
	    float f_62_ = class258.method4718(class258.method4699(32));
	    int i_63_ = class258.method4699(4) + 1;
	    boolean bool_64_ = class258.method4714() != 0;
	    int i_65_;
	    if (i_61_ == 1)
		i_65_ = method4664(anInt2707, anInt2706);
	    else
		i_65_ = anInt2707 * anInt2706;
	    anIntArray2708 = new int[i_65_];
	    for (int i_66_ = 0; i_66_ < i_65_; i_66_++)
		anIntArray2708[i_66_] = class258.method4699(i_63_);
	    aFloatArrayArray2711 = new float[anInt2707][anInt2706];
	    if (i_61_ == 1) {
		for (int i_67_ = 0; i_67_ < anInt2707; i_67_++) {
		    float f_68_ = 0.0F;
		    int i_69_ = 1;
		    for (int i_70_ = 0; i_70_ < anInt2706; i_70_++) {
			int i_71_ = i_67_ / i_69_ % i_65_;
			float f_72_ = ((float) anIntArray2708[i_71_] * f_62_
				       + f + f_68_);
			aFloatArrayArray2711[i_67_][i_70_] = f_72_;
			if (bool_64_)
			    f_68_ = f_72_;
			i_69_ *= i_65_;
		    }
		}
	    } else {
		for (int i_73_ = 0; i_73_ < anInt2707; i_73_++) {
		    float f_74_ = 0.0F;
		    int i_75_ = i_73_ * anInt2706;
		    for (int i_76_ = 0; i_76_ < anInt2706; i_76_++) {
			float f_77_ = ((float) anIntArray2708[i_75_] * f_62_
				       + f + f_74_);
			aFloatArrayArray2711[i_73_][i_76_] = f_77_;
			if (bool_64_)
			    f_74_ = f_77_;
			i_75_++;
		    }
		}
	    }
	}
	anInt2710 = class258.method4697() - i;
	anInt2709 = class258.method4782() - i_54_;
    }
    
    void method4663() {
	int[] is = new int[anInt2707];
	int[] is_78_ = new int[33];
	for (int i = 0; i < anInt2707; i++) {
	    int i_79_ = anIntArray2705[i];
	    if (i_79_ != 0) {
		int i_80_ = 1 << 32 - i_79_;
		int i_81_ = is_78_[i_79_];
		is[i] = i_81_;
		int i_82_;
		if ((i_81_ & i_80_) != 0)
		    i_82_ = is_78_[i_79_ - 1];
		else {
		    i_82_ = i_81_ | i_80_;
		    for (int i_83_ = i_79_ - 1; i_83_ >= 1; i_83_--) {
			int i_84_ = is_78_[i_83_];
			if (i_84_ != i_81_)
			    break;
			int i_85_ = 1 << 32 - i_83_;
			if ((i_84_ & i_85_) != 0) {
			    is_78_[i_83_] = is_78_[i_83_ - 1];
			    break;
			}
			is_78_[i_83_] = i_84_ | i_85_;
		    }
		}
		is_78_[i_79_] = i_82_;
		for (int i_86_ = i_79_ + 1; i_86_ <= 32; i_86_++) {
		    int i_87_ = is_78_[i_86_];
		    if (i_87_ == i_81_)
			is_78_[i_86_] = i_82_;
		}
	    }
	}
	anIntArray2704 = new int[8];
	int i = 0;
	for (int i_88_ = 0; i_88_ < anInt2707; i_88_++) {
	    int i_89_ = anIntArray2705[i_88_];
	    if (i_89_ != 0) {
		int i_90_ = is[i_88_];
		int i_91_ = 0;
		for (int i_92_ = 0; i_92_ < i_89_; i_92_++) {
		    int i_93_ = -2147483648 >>> i_92_;
		    if ((i_90_ & i_93_) != 0) {
			if (anIntArray2704[i_91_] == 0)
			    anIntArray2704[i_91_] = i;
			i_91_ = anIntArray2704[i_91_];
		    } else
			i_91_++;
		    if (i_91_ >= anIntArray2704.length) {
			int[] is_94_ = new int[anIntArray2704.length * 2];
			for (int i_95_ = 0; i_95_ < anIntArray2704.length;
			     i_95_++)
			    is_94_[i_95_] = anIntArray2704[i_95_];
			anIntArray2704 = is_94_;
		    }
		    i_93_ >>>= 1;
		}
		anIntArray2704[i_91_] = i_88_ ^ 0xffffffff;
		if (i_91_ >= i)
		    i = i_91_ + 1;
	    }
	}
    }
    
    static int method4664(int i, int i_96_) {
	int i_97_ = (int) Math.pow((double) i, 1.0 / (double) i_96_) + 1;
	for (;;) {
	    int i_98_ = i_97_;
	    int i_99_ = i_96_;
	    int i_100_ = 1;
	    for (/**/; i_99_ > 1; i_99_ >>= 1) {
		if ((i_99_ & 0x1) != 0)
		    i_100_ *= i_98_;
		i_98_ *= i_98_;
	    }
	    int i_101_;
	    if (1 == i_99_)
		i_101_ = i_100_ * i_98_;
	    else
		i_101_ = i_100_;
	    if (i_101_ <= i)
		break;
	    i_97_--;
	}
	return i_97_;
    }
    
    void method4665() {
	int[] is = new int[anInt2707];
	int[] is_102_ = new int[33];
	for (int i = 0; i < anInt2707; i++) {
	    int i_103_ = anIntArray2705[i];
	    if (i_103_ != 0) {
		int i_104_ = 1 << 32 - i_103_;
		int i_105_ = is_102_[i_103_];
		is[i] = i_105_;
		int i_106_;
		if ((i_105_ & i_104_) != 0)
		    i_106_ = is_102_[i_103_ - 1];
		else {
		    i_106_ = i_105_ | i_104_;
		    for (int i_107_ = i_103_ - 1; i_107_ >= 1; i_107_--) {
			int i_108_ = is_102_[i_107_];
			if (i_108_ != i_105_)
			    break;
			int i_109_ = 1 << 32 - i_107_;
			if ((i_108_ & i_109_) != 0) {
			    is_102_[i_107_] = is_102_[i_107_ - 1];
			    break;
			}
			is_102_[i_107_] = i_108_ | i_109_;
		    }
		}
		is_102_[i_103_] = i_106_;
		for (int i_110_ = i_103_ + 1; i_110_ <= 32; i_110_++) {
		    int i_111_ = is_102_[i_110_];
		    if (i_111_ == i_105_)
			is_102_[i_110_] = i_106_;
		}
	    }
	}
	anIntArray2704 = new int[8];
	int i = 0;
	for (int i_112_ = 0; i_112_ < anInt2707; i_112_++) {
	    int i_113_ = anIntArray2705[i_112_];
	    if (i_113_ != 0) {
		int i_114_ = is[i_112_];
		int i_115_ = 0;
		for (int i_116_ = 0; i_116_ < i_113_; i_116_++) {
		    int i_117_ = -2147483648 >>> i_116_;
		    if ((i_114_ & i_117_) != 0) {
			if (anIntArray2704[i_115_] == 0)
			    anIntArray2704[i_115_] = i;
			i_115_ = anIntArray2704[i_115_];
		    } else
			i_115_++;
		    if (i_115_ >= anIntArray2704.length) {
			int[] is_118_ = new int[anIntArray2704.length * 2];
			for (int i_119_ = 0; i_119_ < anIntArray2704.length;
			     i_119_++)
			    is_118_[i_119_] = anIntArray2704[i_119_];
			anIntArray2704 = is_118_;
		    }
		    i_117_ >>>= 1;
		}
		anIntArray2704[i_115_] = i_112_ ^ 0xffffffff;
		if (i_115_ >= i)
		    i = i_115_ + 1;
	    }
	}
    }
    
    int method4666(Class258 class258) {
	int i;
	for (i = 0; anIntArray2704[i] >= 0;
	     i = class258.method4714() != 0 ? anIntArray2704[i] : i + 1) {
	    /* empty */
	}
	return anIntArray2704[i] ^ 0xffffffff;
    }
    
    void method4667(Class258 class258) {
	class258.method4699(anInt2709 * 8 + anInt2710);
    }
    
    void method4668() {
	int[] is = new int[anInt2707];
	int[] is_120_ = new int[33];
	for (int i = 0; i < anInt2707; i++) {
	    int i_121_ = anIntArray2705[i];
	    if (i_121_ != 0) {
		int i_122_ = 1 << 32 - i_121_;
		int i_123_ = is_120_[i_121_];
		is[i] = i_123_;
		int i_124_;
		if ((i_123_ & i_122_) != 0)
		    i_124_ = is_120_[i_121_ - 1];
		else {
		    i_124_ = i_123_ | i_122_;
		    for (int i_125_ = i_121_ - 1; i_125_ >= 1; i_125_--) {
			int i_126_ = is_120_[i_125_];
			if (i_126_ != i_123_)
			    break;
			int i_127_ = 1 << 32 - i_125_;
			if ((i_126_ & i_127_) != 0) {
			    is_120_[i_125_] = is_120_[i_125_ - 1];
			    break;
			}
			is_120_[i_125_] = i_126_ | i_127_;
		    }
		}
		is_120_[i_121_] = i_124_;
		for (int i_128_ = i_121_ + 1; i_128_ <= 32; i_128_++) {
		    int i_129_ = is_120_[i_128_];
		    if (i_129_ == i_123_)
			is_120_[i_128_] = i_124_;
		}
	    }
	}
	anIntArray2704 = new int[8];
	int i = 0;
	for (int i_130_ = 0; i_130_ < anInt2707; i_130_++) {
	    int i_131_ = anIntArray2705[i_130_];
	    if (i_131_ != 0) {
		int i_132_ = is[i_130_];
		int i_133_ = 0;
		for (int i_134_ = 0; i_134_ < i_131_; i_134_++) {
		    int i_135_ = -2147483648 >>> i_134_;
		    if ((i_132_ & i_135_) != 0) {
			if (anIntArray2704[i_133_] == 0)
			    anIntArray2704[i_133_] = i;
			i_133_ = anIntArray2704[i_133_];
		    } else
			i_133_++;
		    if (i_133_ >= anIntArray2704.length) {
			int[] is_136_ = new int[anIntArray2704.length * 2];
			for (int i_137_ = 0; i_137_ < anIntArray2704.length;
			     i_137_++)
			    is_136_[i_137_] = anIntArray2704[i_137_];
			anIntArray2704 = is_136_;
		    }
		    i_135_ >>>= 1;
		}
		anIntArray2704[i_133_] = i_130_ ^ 0xffffffff;
		if (i_133_ >= i)
		    i = i_133_ + 1;
	    }
	}
    }
    
    float[] method4669(Class258 class258) {
	return aFloatArrayArray2711[method4658(class258)];
    }
}
