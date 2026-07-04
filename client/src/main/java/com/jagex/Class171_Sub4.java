/* Class171_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class171_Sub4 extends Class171
{
    int[] anIntArray9938;
    byte[][] aByteArrayArray9939;
    Class185_Sub2 aClass185_Sub2_9940;
    int[] anIntArray9941;
    int[] anIntArray9942;
    int[] anIntArray9943;
    public static Class232 aClass232_9944;
    
    void method15589(byte[] is, int[] is_0_, int i, int i_1_, int i_2_,
		     int i_3_, int i_4_, int i_5_, int i_6_, int i_7_,
		     int i_8_, int i_9_, Class145 class145, int i_10_,
		     int i_11_) {
	Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
	int[] is_12_ = class145_sub2.anIntArray9797;
	int[] is_13_ = class145_sub2.anIntArray9798;
	int i_14_ = i_8_;
	if (i_11_ > i_14_) {
	    i_14_ = i_11_;
	    i_2_ += aClass185_Sub2_9940.anInt9356 * 356365251 * (i_11_ - i_8_);
	    i_1_ += (i_11_ - i_8_) * i_9_;
	}
	int i_15_ = (is_12_.length + i_11_ < i_8_ + i_4_
		     ? is_12_.length + i_11_ : i_4_ + i_8_);
	for (int i_16_ = i_14_; i_16_ < i_15_; i_16_++) {
	    int i_17_ = i_10_ + is_12_[i_16_ - i_11_];
	    int i_18_ = is_13_[i_16_ - i_11_];
	    int i_19_ = i_3_;
	    if (i_7_ > i_17_) {
		int i_20_ = i_7_ - i_17_;
		if (i_20_ >= i_18_) {
		    i_1_ += i_3_ + i_6_;
		    i_2_ += i_5_ + i_3_;
		    continue;
		}
		i_18_ -= i_20_;
	    } else {
		int i_21_ = i_17_ - i_7_;
		if (i_21_ >= i_3_) {
		    i_1_ += i_3_ + i_6_;
		    i_2_ += i_5_ + i_3_;
		    continue;
		}
		i_1_ += i_21_;
		i_19_ -= i_21_;
		i_2_ += i_21_;
	    }
	    int i_22_ = 0;
	    if (i_19_ < i_18_)
		i_18_ = i_19_;
	    else
		i_22_ = i_19_ - i_18_;
	    for (int i_23_ = 0; i_23_ < i_18_; i_23_++) {
		if (is[i_1_++] != 0)
		    is_0_[i_2_++] = i;
		else
		    i_2_++;
	    }
	    i_1_ += i_6_ + i_22_;
	    i_2_ += i_5_ + i_22_;
	}
    }
    
    Class171_Sub4(Class185_Sub2 class185_sub2, Class16 class16,
		  Class169_Sub1[] class169_sub1s, int[] is, int[] is_24_) {
	super(class185_sub2, class16);
	aClass185_Sub2_9940 = class185_sub2;
	anIntArray9943 = is;
	anIntArray9941 = is_24_;
	aByteArrayArray9939 = new byte[class169_sub1s.length][];
	anIntArray9942 = new int[class169_sub1s.length];
	anIntArray9938 = new int[class169_sub1s.length];
	for (int i = 0; i < class169_sub1s.length; i++) {
	    int[] is_25_ = class169_sub1s[i].method2766(false);
	    byte[] is_26_ = aByteArrayArray9939[i] = new byte[is_25_.length];
	    for (int i_27_ = 0; i_27_ < is_25_.length; i_27_++) {
		int i_28_ = is_25_[i_27_];
		byte i_29_
		    = (byte) (((i_28_ >> 8 & 0xff) * 4
			       + (i_28_ >> 16 & 0xff) * 3 + (i_28_ & 0xff))
			      >> 3);
		is_26_[i_27_] = i_29_;
	    }
	    anIntArray9942[i] = class169_sub1s[i].method2781();
	    anIntArray9938[i] = class169_sub1s[i].method2764();
	}
    }
    
    void method2860(char c, int i, int i_30_, int i_31_, boolean bool) {
	if (aClass185_Sub2_9940.anIntArray9338 != null) {
	    i += anIntArray9938[c];
	    i_30_ += anIntArray9942[c];
	    int i_32_ = anIntArray9943[c];
	    int i_33_ = anIntArray9941[c];
	    int i_34_ = 356365251 * aClass185_Sub2_9940.anInt9356;
	    int i_35_ = i_34_ * i_30_ + i;
	    int i_36_ = i_34_ - i_32_;
	    int i_37_ = 0;
	    int i_38_ = 0;
	    if (i_30_ < 9823353 * aClass185_Sub2_9940.anInt9344) {
		int i_39_ = aClass185_Sub2_9940.anInt9344 * 9823353 - i_30_;
		i_33_ -= i_39_;
		i_30_ = 9823353 * aClass185_Sub2_9940.anInt9344;
		i_38_ += i_39_ * i_32_;
		i_35_ += i_39_ * i_34_;
	    }
	    if (i_30_ + i_33_ > aClass185_Sub2_9940.anInt9345 * 639238427)
		i_33_ -= (i_33_ + i_30_
			  - aClass185_Sub2_9940.anInt9345 * 639238427);
	    if (i < aClass185_Sub2_9940.anInt9365 * 1709859847) {
		int i_40_ = aClass185_Sub2_9940.anInt9365 * 1709859847 - i;
		i_32_ -= i_40_;
		i = aClass185_Sub2_9940.anInt9365 * 1709859847;
		i_38_ += i_40_;
		i_35_ += i_40_;
		i_37_ += i_40_;
		i_36_ += i_40_;
	    }
	    if (i_32_ + i > aClass185_Sub2_9940.anInt9343 * -1807368365) {
		int i_41_
		    = i + i_32_ - -1807368365 * aClass185_Sub2_9940.anInt9343;
		i_32_ -= i_41_;
		i_37_ += i_41_;
		i_36_ += i_41_;
	    }
	    if (i_32_ > 0 && i_33_ > 0) {
		if (-16777216 == (i_31_ & ~0xffffff))
		    method15591(aByteArrayArray9939[c],
				aClass185_Sub2_9940.anIntArray9338, i_31_,
				i_38_, i_35_, i_32_, i_33_, i_36_, i_37_);
		else if (0 != (i_31_ & ~0xffffff))
		    method15599(aByteArrayArray9939[c],
				aClass185_Sub2_9940.anIntArray9338, i_31_,
				i_38_, i_35_, i_32_, i_33_, i_36_, i_37_);
	    }
	}
    }
    
    void method2877(char c, int i, int i_42_, int i_43_, boolean bool,
		    Class145 class145, int i_44_, int i_45_) {
	if (aClass185_Sub2_9940.anIntArray9338 != null) {
	    if (null == class145)
		method2860(c, i, i_42_, i_43_, bool);
	    else {
		i += anIntArray9938[c];
		i_42_ += anIntArray9942[c];
		int i_46_ = anIntArray9943[c];
		int i_47_ = anIntArray9941[c];
		int i_48_ = aClass185_Sub2_9940.anInt9356 * 356365251;
		int i_49_ = i_42_ * i_48_ + i;
		int i_50_ = i_48_ - i_46_;
		int i_51_ = 0;
		int i_52_ = 0;
		if (i_42_ < 9823353 * aClass185_Sub2_9940.anInt9344) {
		    int i_53_
			= aClass185_Sub2_9940.anInt9344 * 9823353 - i_42_;
		    i_47_ -= i_53_;
		    i_42_ = aClass185_Sub2_9940.anInt9344 * 9823353;
		    i_52_ += i_46_ * i_53_;
		    i_49_ += i_48_ * i_53_;
		}
		if (i_47_ + i_42_ > 639238427 * aClass185_Sub2_9940.anInt9345)
		    i_47_ -= (i_42_ + i_47_
			      - 639238427 * aClass185_Sub2_9940.anInt9345);
		if (i < aClass185_Sub2_9940.anInt9365 * 1709859847) {
		    int i_54_ = 1709859847 * aClass185_Sub2_9940.anInt9365 - i;
		    i_46_ -= i_54_;
		    i = aClass185_Sub2_9940.anInt9365 * 1709859847;
		    i_52_ += i_54_;
		    i_49_ += i_54_;
		    i_51_ += i_54_;
		    i_50_ += i_54_;
		}
		if (i + i_46_ > aClass185_Sub2_9940.anInt9343 * -1807368365) {
		    int i_55_
			= (i + i_46_
			   - aClass185_Sub2_9940.anInt9343 * -1807368365);
		    i_46_ -= i_55_;
		    i_51_ += i_55_;
		    i_50_ += i_55_;
		}
		if (i_46_ > 0 && i_47_ > 0) {
		    if ((i_43_ & ~0xffffff) == -16777216)
			method15592(aByteArrayArray9939[c],
				    aClass185_Sub2_9940.anIntArray9338, i_43_,
				    i_52_, i_49_, i_46_, i_47_, i_50_, i_51_,
				    i, i_42_, anIntArray9943[c], class145,
				    i_44_, i_45_);
		    else
			method15593(aByteArrayArray9939[c],
				    aClass185_Sub2_9940.anIntArray9338, i_43_,
				    i_52_, i_49_, i_46_, i_47_, i_50_, i_51_,
				    i, i_42_, anIntArray9943[c], class145,
				    i_44_, i_45_);
		}
	    }
	}
    }
    
    void method15590(byte[] is, int[] is_56_, int i, int i_57_, int i_58_,
		     int i_59_, int i_60_, int i_61_, int i_62_, int i_63_,
		     int i_64_, int i_65_, Class145 class145, int i_66_,
		     int i_67_) {
	Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
	int[] is_68_ = class145_sub2.anIntArray9797;
	int[] is_69_ = class145_sub2.anIntArray9798;
	int i_70_ = i_63_ - aClass185_Sub2_9940.anInt9365 * 1709859847;
	int i_71_ = i_64_;
	if (i_67_ > i_71_) {
	    i_71_ = i_67_;
	    i_58_ += (i_67_ - i_64_) * (356365251
					* aClass185_Sub2_9940.anInt9356);
	    i_57_ += i_65_ * (i_67_ - i_64_);
	}
	int i_72_ = (i_67_ + is_68_.length < i_64_ + i_60_
		     ? i_67_ + is_68_.length : i_64_ + i_60_);
	int i_73_ = i >>> 24;
	int i_74_ = 255 - i_73_;
	for (int i_75_ = i_71_; i_75_ < i_72_; i_75_++) {
	    int i_76_ = i_66_ + is_68_[i_75_ - i_67_];
	    int i_77_ = is_69_[i_75_ - i_67_];
	    int i_78_ = i_59_;
	    if (i_70_ > i_76_) {
		int i_79_ = i_70_ - i_76_;
		if (i_79_ >= i_77_) {
		    i_57_ += i_59_ + i_62_;
		    i_58_ += i_61_ + i_59_;
		    continue;
		}
		i_77_ -= i_79_;
	    } else {
		int i_80_ = i_76_ - i_70_;
		if (i_80_ >= i_59_) {
		    i_57_ += i_62_ + i_59_;
		    i_58_ += i_61_ + i_59_;
		    continue;
		}
		i_57_ += i_80_;
		i_78_ -= i_80_;
		i_58_ += i_80_;
	    }
	    int i_81_ = 0;
	    if (i_78_ < i_77_)
		i_77_ = i_78_;
	    else
		i_81_ = i_78_ - i_77_;
	    for (int i_82_ = -i_77_; i_82_ < 0; i_82_++) {
		if (is[i_57_++] != 0) {
		    int i_83_ = ((((i & 0xff00) * i_73_ & 0xff0000)
				  + (i_73_ * (i & 0xff00ff) & ~0xff00ff))
				 >> 8);
		    int i_84_ = is_56_[i_58_];
		    is_56_[i_58_++]
			= (((i_74_ * (i_84_ & 0xff00ff) & ~0xff00ff)
			    + (i_74_ * (i_84_ & 0xff00) & 0xff0000))
			   >> 8) + i_83_;
		} else
		    i_58_++;
	    }
	    i_57_ += i_81_ + i_62_;
	    i_58_ += i_61_ + i_81_;
	}
    }
    
    void method15591(byte[] is, int[] is_85_, int i, int i_86_, int i_87_,
		     int i_88_, int i_89_, int i_90_, int i_91_) {
	int i_92_ = -(i_88_ >> 2);
	i_88_ = -(i_88_ & 0x3);
	for (int i_93_ = -i_89_; i_93_ < 0; i_93_++) {
	    for (int i_94_ = i_92_; i_94_ < 0; i_94_++) {
		if (is[i_86_++] != 0)
		    is_85_[i_87_++] = i;
		else
		    i_87_++;
		if (is[i_86_++] != 0)
		    is_85_[i_87_++] = i;
		else
		    i_87_++;
		if (is[i_86_++] != 0)
		    is_85_[i_87_++] = i;
		else
		    i_87_++;
		if (is[i_86_++] != 0)
		    is_85_[i_87_++] = i;
		else
		    i_87_++;
	    }
	    for (int i_95_ = i_88_; i_95_ < 0; i_95_++) {
		if (is[i_86_++] != 0)
		    is_85_[i_87_++] = i;
		else
		    i_87_++;
	    }
	    i_87_ += i_90_;
	    i_86_ += i_91_;
	}
    }
    
    void method15592(byte[] is, int[] is_96_, int i, int i_97_, int i_98_,
		     int i_99_, int i_100_, int i_101_, int i_102_, int i_103_,
		     int i_104_, int i_105_, Class145 class145, int i_106_,
		     int i_107_) {
	Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
	int[] is_108_ = class145_sub2.anIntArray9797;
	int[] is_109_ = class145_sub2.anIntArray9798;
	int i_110_ = i_104_;
	if (i_107_ > i_110_) {
	    i_110_ = i_107_;
	    i_98_ += aClass185_Sub2_9940.anInt9356 * 356365251 * (i_107_
								  - i_104_);
	    i_97_ += (i_107_ - i_104_) * i_105_;
	}
	int i_111_ = (is_108_.length + i_107_ < i_104_ + i_100_
		      ? is_108_.length + i_107_ : i_100_ + i_104_);
	for (int i_112_ = i_110_; i_112_ < i_111_; i_112_++) {
	    int i_113_ = i_106_ + is_108_[i_112_ - i_107_];
	    int i_114_ = is_109_[i_112_ - i_107_];
	    int i_115_ = i_99_;
	    if (i_103_ > i_113_) {
		int i_116_ = i_103_ - i_113_;
		if (i_116_ >= i_114_) {
		    i_97_ += i_99_ + i_102_;
		    i_98_ += i_101_ + i_99_;
		    continue;
		}
		i_114_ -= i_116_;
	    } else {
		int i_117_ = i_113_ - i_103_;
		if (i_117_ >= i_99_) {
		    i_97_ += i_99_ + i_102_;
		    i_98_ += i_101_ + i_99_;
		    continue;
		}
		i_97_ += i_117_;
		i_115_ -= i_117_;
		i_98_ += i_117_;
	    }
	    int i_118_ = 0;
	    if (i_115_ < i_114_)
		i_114_ = i_115_;
	    else
		i_118_ = i_115_ - i_114_;
	    for (int i_119_ = 0; i_119_ < i_114_; i_119_++) {
		if (is[i_97_++] != 0)
		    is_96_[i_98_++] = i;
		else
		    i_98_++;
	    }
	    i_97_ += i_102_ + i_118_;
	    i_98_ += i_101_ + i_118_;
	}
    }
    
    void method15593(byte[] is, int[] is_120_, int i, int i_121_, int i_122_,
		     int i_123_, int i_124_, int i_125_, int i_126_,
		     int i_127_, int i_128_, int i_129_, Class145 class145,
		     int i_130_, int i_131_) {
	Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
	int[] is_132_ = class145_sub2.anIntArray9797;
	int[] is_133_ = class145_sub2.anIntArray9798;
	int i_134_ = i_127_ - aClass185_Sub2_9940.anInt9365 * 1709859847;
	int i_135_ = i_128_;
	if (i_131_ > i_135_) {
	    i_135_ = i_131_;
	    i_122_ += (i_131_ - i_128_) * (356365251
					   * aClass185_Sub2_9940.anInt9356);
	    i_121_ += i_129_ * (i_131_ - i_128_);
	}
	int i_136_ = (i_131_ + is_132_.length < i_128_ + i_124_
		      ? i_131_ + is_132_.length : i_128_ + i_124_);
	int i_137_ = i >>> 24;
	int i_138_ = 255 - i_137_;
	for (int i_139_ = i_135_; i_139_ < i_136_; i_139_++) {
	    int i_140_ = i_130_ + is_132_[i_139_ - i_131_];
	    int i_141_ = is_133_[i_139_ - i_131_];
	    int i_142_ = i_123_;
	    if (i_134_ > i_140_) {
		int i_143_ = i_134_ - i_140_;
		if (i_143_ >= i_141_) {
		    i_121_ += i_123_ + i_126_;
		    i_122_ += i_125_ + i_123_;
		    continue;
		}
		i_141_ -= i_143_;
	    } else {
		int i_144_ = i_140_ - i_134_;
		if (i_144_ >= i_123_) {
		    i_121_ += i_126_ + i_123_;
		    i_122_ += i_125_ + i_123_;
		    continue;
		}
		i_121_ += i_144_;
		i_142_ -= i_144_;
		i_122_ += i_144_;
	    }
	    int i_145_ = 0;
	    if (i_142_ < i_141_)
		i_141_ = i_142_;
	    else
		i_145_ = i_142_ - i_141_;
	    for (int i_146_ = -i_141_; i_146_ < 0; i_146_++) {
		if (is[i_121_++] != 0) {
		    int i_147_ = ((((i & 0xff00) * i_137_ & 0xff0000)
				   + (i_137_ * (i & 0xff00ff) & ~0xff00ff))
				  >> 8);
		    int i_148_ = is_120_[i_122_];
		    is_120_[i_122_++]
			= (((i_138_ * (i_148_ & 0xff00ff) & ~0xff00ff)
			    + (i_138_ * (i_148_ & 0xff00) & 0xff0000))
			   >> 8) + i_147_;
		} else
		    i_122_++;
	    }
	    i_121_ += i_145_ + i_126_;
	    i_122_ += i_125_ + i_145_;
	}
    }
    
    Class171_Sub4(Class185_Sub2 class185_sub2, Class16 class16,
		  Class169_Sub2[] class169_sub2s, int[] is, int[] is_149_) {
	super(class185_sub2, class16);
	aClass185_Sub2_9940 = class185_sub2;
	anIntArray9943 = is;
	anIntArray9941 = is_149_;
	aByteArrayArray9939 = new byte[class169_sub2s.length][];
	anIntArray9942 = new int[class169_sub2s.length];
	anIntArray9938 = new int[class169_sub2s.length];
	for (int i = 0; i < class169_sub2s.length; i++) {
	    aByteArrayArray9939[i] = class169_sub2s[i].aByteArray9796;
	    anIntArray9942[i] = class169_sub2s[i].anInt9792;
	    anIntArray9938[i] = class169_sub2s[i].anInt9790;
	}
    }
    
    void method2846(char c, int i, int i_150_, int i_151_, boolean bool) {
	if (aClass185_Sub2_9940.anIntArray9338 != null) {
	    i += anIntArray9938[c];
	    i_150_ += anIntArray9942[c];
	    int i_152_ = anIntArray9943[c];
	    int i_153_ = anIntArray9941[c];
	    int i_154_ = 356365251 * aClass185_Sub2_9940.anInt9356;
	    int i_155_ = i_154_ * i_150_ + i;
	    int i_156_ = i_154_ - i_152_;
	    int i_157_ = 0;
	    int i_158_ = 0;
	    if (i_150_ < 9823353 * aClass185_Sub2_9940.anInt9344) {
		int i_159_ = aClass185_Sub2_9940.anInt9344 * 9823353 - i_150_;
		i_153_ -= i_159_;
		i_150_ = 9823353 * aClass185_Sub2_9940.anInt9344;
		i_158_ += i_159_ * i_152_;
		i_155_ += i_159_ * i_154_;
	    }
	    if (i_150_ + i_153_ > aClass185_Sub2_9940.anInt9345 * 639238427)
		i_153_ -= (i_153_ + i_150_
			   - aClass185_Sub2_9940.anInt9345 * 639238427);
	    if (i < aClass185_Sub2_9940.anInt9365 * 1709859847) {
		int i_160_ = aClass185_Sub2_9940.anInt9365 * 1709859847 - i;
		i_152_ -= i_160_;
		i = aClass185_Sub2_9940.anInt9365 * 1709859847;
		i_158_ += i_160_;
		i_155_ += i_160_;
		i_157_ += i_160_;
		i_156_ += i_160_;
	    }
	    if (i_152_ + i > aClass185_Sub2_9940.anInt9343 * -1807368365) {
		int i_161_
		    = i + i_152_ - -1807368365 * aClass185_Sub2_9940.anInt9343;
		i_152_ -= i_161_;
		i_157_ += i_161_;
		i_156_ += i_161_;
	    }
	    if (i_152_ > 0 && i_153_ > 0) {
		if (-16777216 == (i_151_ & ~0xffffff))
		    method15591(aByteArrayArray9939[c],
				aClass185_Sub2_9940.anIntArray9338, i_151_,
				i_158_, i_155_, i_152_, i_153_, i_156_,
				i_157_);
		else if (0 != (i_151_ & ~0xffffff))
		    method15599(aByteArrayArray9939[c],
				aClass185_Sub2_9940.anIntArray9338, i_151_,
				i_158_, i_155_, i_152_, i_153_, i_156_,
				i_157_);
	    }
	}
    }
    
    void method2847(char c, int i, int i_162_, int i_163_, boolean bool,
		    Class145 class145, int i_164_, int i_165_) {
	if (aClass185_Sub2_9940.anIntArray9338 != null) {
	    if (null == class145)
		method2860(c, i, i_162_, i_163_, bool);
	    else {
		i += anIntArray9938[c];
		i_162_ += anIntArray9942[c];
		int i_166_ = anIntArray9943[c];
		int i_167_ = anIntArray9941[c];
		int i_168_ = aClass185_Sub2_9940.anInt9356 * 356365251;
		int i_169_ = i_162_ * i_168_ + i;
		int i_170_ = i_168_ - i_166_;
		int i_171_ = 0;
		int i_172_ = 0;
		if (i_162_ < 9823353 * aClass185_Sub2_9940.anInt9344) {
		    int i_173_
			= aClass185_Sub2_9940.anInt9344 * 9823353 - i_162_;
		    i_167_ -= i_173_;
		    i_162_ = aClass185_Sub2_9940.anInt9344 * 9823353;
		    i_172_ += i_166_ * i_173_;
		    i_169_ += i_168_ * i_173_;
		}
		if (i_167_ + i_162_
		    > 639238427 * aClass185_Sub2_9940.anInt9345)
		    i_167_ -= (i_162_ + i_167_
			       - 639238427 * aClass185_Sub2_9940.anInt9345);
		if (i < aClass185_Sub2_9940.anInt9365 * 1709859847) {
		    int i_174_
			= 1709859847 * aClass185_Sub2_9940.anInt9365 - i;
		    i_166_ -= i_174_;
		    i = aClass185_Sub2_9940.anInt9365 * 1709859847;
		    i_172_ += i_174_;
		    i_169_ += i_174_;
		    i_171_ += i_174_;
		    i_170_ += i_174_;
		}
		if (i + i_166_ > aClass185_Sub2_9940.anInt9343 * -1807368365) {
		    int i_175_
			= (i + i_166_
			   - aClass185_Sub2_9940.anInt9343 * -1807368365);
		    i_166_ -= i_175_;
		    i_171_ += i_175_;
		    i_170_ += i_175_;
		}
		if (i_166_ > 0 && i_167_ > 0) {
		    if ((i_163_ & ~0xffffff) == -16777216)
			method15592(aByteArrayArray9939[c],
				    aClass185_Sub2_9940.anIntArray9338, i_163_,
				    i_172_, i_169_, i_166_, i_167_, i_170_,
				    i_171_, i, i_162_, anIntArray9943[c],
				    class145, i_164_, i_165_);
		    else
			method15593(aByteArrayArray9939[c],
				    aClass185_Sub2_9940.anIntArray9338, i_163_,
				    i_172_, i_169_, i_166_, i_167_, i_170_,
				    i_171_, i, i_162_, anIntArray9943[c],
				    class145, i_164_, i_165_);
		}
	    }
	}
    }
    
    void method2848(char c, int i, int i_176_, int i_177_, boolean bool,
		    Class145 class145, int i_178_, int i_179_) {
	if (aClass185_Sub2_9940.anIntArray9338 != null) {
	    if (null == class145)
		method2860(c, i, i_176_, i_177_, bool);
	    else {
		i += anIntArray9938[c];
		i_176_ += anIntArray9942[c];
		int i_180_ = anIntArray9943[c];
		int i_181_ = anIntArray9941[c];
		int i_182_ = aClass185_Sub2_9940.anInt9356 * 356365251;
		int i_183_ = i_176_ * i_182_ + i;
		int i_184_ = i_182_ - i_180_;
		int i_185_ = 0;
		int i_186_ = 0;
		if (i_176_ < 9823353 * aClass185_Sub2_9940.anInt9344) {
		    int i_187_
			= aClass185_Sub2_9940.anInt9344 * 9823353 - i_176_;
		    i_181_ -= i_187_;
		    i_176_ = aClass185_Sub2_9940.anInt9344 * 9823353;
		    i_186_ += i_180_ * i_187_;
		    i_183_ += i_182_ * i_187_;
		}
		if (i_181_ + i_176_
		    > 639238427 * aClass185_Sub2_9940.anInt9345)
		    i_181_ -= (i_176_ + i_181_
			       - 639238427 * aClass185_Sub2_9940.anInt9345);
		if (i < aClass185_Sub2_9940.anInt9365 * 1709859847) {
		    int i_188_
			= 1709859847 * aClass185_Sub2_9940.anInt9365 - i;
		    i_180_ -= i_188_;
		    i = aClass185_Sub2_9940.anInt9365 * 1709859847;
		    i_186_ += i_188_;
		    i_183_ += i_188_;
		    i_185_ += i_188_;
		    i_184_ += i_188_;
		}
		if (i + i_180_ > aClass185_Sub2_9940.anInt9343 * -1807368365) {
		    int i_189_
			= (i + i_180_
			   - aClass185_Sub2_9940.anInt9343 * -1807368365);
		    i_180_ -= i_189_;
		    i_185_ += i_189_;
		    i_184_ += i_189_;
		}
		if (i_180_ > 0 && i_181_ > 0) {
		    if ((i_177_ & ~0xffffff) == -16777216)
			method15592(aByteArrayArray9939[c],
				    aClass185_Sub2_9940.anIntArray9338, i_177_,
				    i_186_, i_183_, i_180_, i_181_, i_184_,
				    i_185_, i, i_176_, anIntArray9943[c],
				    class145, i_178_, i_179_);
		    else
			method15593(aByteArrayArray9939[c],
				    aClass185_Sub2_9940.anIntArray9338, i_177_,
				    i_186_, i_183_, i_180_, i_181_, i_184_,
				    i_185_, i, i_176_, anIntArray9943[c],
				    class145, i_178_, i_179_);
		}
	    }
	}
    }
    
    void method15594(byte[] is, int[] is_190_, int i, int i_191_, int i_192_,
		     int i_193_, int i_194_, int i_195_, int i_196_,
		     int i_197_, int i_198_, int i_199_, Class145 class145,
		     int i_200_, int i_201_) {
	Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
	int[] is_202_ = class145_sub2.anIntArray9797;
	int[] is_203_ = class145_sub2.anIntArray9798;
	int i_204_ = i_197_ - aClass185_Sub2_9940.anInt9365 * 1709859847;
	int i_205_ = i_198_;
	if (i_201_ > i_205_) {
	    i_205_ = i_201_;
	    i_192_ += (i_201_ - i_198_) * (356365251
					   * aClass185_Sub2_9940.anInt9356);
	    i_191_ += i_199_ * (i_201_ - i_198_);
	}
	int i_206_ = (i_201_ + is_202_.length < i_198_ + i_194_
		      ? i_201_ + is_202_.length : i_198_ + i_194_);
	int i_207_ = i >>> 24;
	int i_208_ = 255 - i_207_;
	for (int i_209_ = i_205_; i_209_ < i_206_; i_209_++) {
	    int i_210_ = i_200_ + is_202_[i_209_ - i_201_];
	    int i_211_ = is_203_[i_209_ - i_201_];
	    int i_212_ = i_193_;
	    if (i_204_ > i_210_) {
		int i_213_ = i_204_ - i_210_;
		if (i_213_ >= i_211_) {
		    i_191_ += i_193_ + i_196_;
		    i_192_ += i_195_ + i_193_;
		    continue;
		}
		i_211_ -= i_213_;
	    } else {
		int i_214_ = i_210_ - i_204_;
		if (i_214_ >= i_193_) {
		    i_191_ += i_196_ + i_193_;
		    i_192_ += i_195_ + i_193_;
		    continue;
		}
		i_191_ += i_214_;
		i_212_ -= i_214_;
		i_192_ += i_214_;
	    }
	    int i_215_ = 0;
	    if (i_212_ < i_211_)
		i_211_ = i_212_;
	    else
		i_215_ = i_212_ - i_211_;
	    for (int i_216_ = -i_211_; i_216_ < 0; i_216_++) {
		if (is[i_191_++] != 0) {
		    int i_217_ = ((((i & 0xff00) * i_207_ & 0xff0000)
				   + (i_207_ * (i & 0xff00ff) & ~0xff00ff))
				  >> 8);
		    int i_218_ = is_190_[i_192_];
		    is_190_[i_192_++]
			= (((i_208_ * (i_218_ & 0xff00ff) & ~0xff00ff)
			    + (i_208_ * (i_218_ & 0xff00) & 0xff0000))
			   >> 8) + i_217_;
		} else
		    i_192_++;
	    }
	    i_191_ += i_215_ + i_196_;
	    i_192_ += i_195_ + i_215_;
	}
    }
    
    void method15595(byte[] is, int[] is_219_, int i, int i_220_, int i_221_,
		     int i_222_, int i_223_, int i_224_, int i_225_) {
	int i_226_ = i >>> 24;
	int i_227_ = 255 - i_226_;
	for (int i_228_ = -i_223_; i_228_ < 0; i_228_++) {
	    for (int i_229_ = -i_222_; i_229_ < 0; i_229_++) {
		if (is[i_220_++] != 0) {
		    int i_230_ = (((i_226_ * (i & 0xff00ff) & ~0xff00ff)
				   + (i_226_ * (i & 0xff00) & 0xff0000))
				  >> 8);
		    int i_231_ = is_219_[i_221_];
		    is_219_[i_221_++]
			= ((((i_231_ & 0xff00ff) * i_227_ & ~0xff00ff)
			    + ((i_231_ & 0xff00) * i_227_ & 0xff0000))
			   >> 8) + i_230_;
		} else
		    i_221_++;
	    }
	    i_221_ += i_224_;
	    i_220_ += i_225_;
	}
    }
    
    void method15596(byte[] is, int[] is_232_, int i, int i_233_, int i_234_,
		     int i_235_, int i_236_, int i_237_, int i_238_) {
	int i_239_ = i >>> 24;
	int i_240_ = 255 - i_239_;
	for (int i_241_ = -i_236_; i_241_ < 0; i_241_++) {
	    for (int i_242_ = -i_235_; i_242_ < 0; i_242_++) {
		if (is[i_233_++] != 0) {
		    int i_243_ = (((i_239_ * (i & 0xff00ff) & ~0xff00ff)
				   + (i_239_ * (i & 0xff00) & 0xff0000))
				  >> 8);
		    int i_244_ = is_232_[i_234_];
		    is_232_[i_234_++]
			= ((((i_244_ & 0xff00ff) * i_240_ & ~0xff00ff)
			    + ((i_244_ & 0xff00) * i_240_ & 0xff0000))
			   >> 8) + i_243_;
		} else
		    i_234_++;
	    }
	    i_234_ += i_237_;
	    i_233_ += i_238_;
	}
    }
    
    void method15597(byte[] is, int[] is_245_, int i, int i_246_, int i_247_,
		     int i_248_, int i_249_, int i_250_, int i_251_,
		     int i_252_, int i_253_, int i_254_, Class145 class145,
		     int i_255_, int i_256_) {
	Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
	int[] is_257_ = class145_sub2.anIntArray9797;
	int[] is_258_ = class145_sub2.anIntArray9798;
	int i_259_ = i_253_;
	if (i_256_ > i_259_) {
	    i_259_ = i_256_;
	    i_247_ += aClass185_Sub2_9940.anInt9356 * 356365251 * (i_256_
								   - i_253_);
	    i_246_ += (i_256_ - i_253_) * i_254_;
	}
	int i_260_ = (is_257_.length + i_256_ < i_253_ + i_249_
		      ? is_257_.length + i_256_ : i_249_ + i_253_);
	for (int i_261_ = i_259_; i_261_ < i_260_; i_261_++) {
	    int i_262_ = i_255_ + is_257_[i_261_ - i_256_];
	    int i_263_ = is_258_[i_261_ - i_256_];
	    int i_264_ = i_248_;
	    if (i_252_ > i_262_) {
		int i_265_ = i_252_ - i_262_;
		if (i_265_ >= i_263_) {
		    i_246_ += i_248_ + i_251_;
		    i_247_ += i_250_ + i_248_;
		    continue;
		}
		i_263_ -= i_265_;
	    } else {
		int i_266_ = i_262_ - i_252_;
		if (i_266_ >= i_248_) {
		    i_246_ += i_248_ + i_251_;
		    i_247_ += i_250_ + i_248_;
		    continue;
		}
		i_246_ += i_266_;
		i_264_ -= i_266_;
		i_247_ += i_266_;
	    }
	    int i_267_ = 0;
	    if (i_264_ < i_263_)
		i_263_ = i_264_;
	    else
		i_267_ = i_264_ - i_263_;
	    for (int i_268_ = 0; i_268_ < i_263_; i_268_++) {
		if (is[i_246_++] != 0)
		    is_245_[i_247_++] = i;
		else
		    i_247_++;
	    }
	    i_246_ += i_251_ + i_267_;
	    i_247_ += i_250_ + i_267_;
	}
    }
    
    void method15598(byte[] is, int[] is_269_, int i, int i_270_, int i_271_,
		     int i_272_, int i_273_, int i_274_, int i_275_) {
	int i_276_ = -(i_272_ >> 2);
	i_272_ = -(i_272_ & 0x3);
	for (int i_277_ = -i_273_; i_277_ < 0; i_277_++) {
	    for (int i_278_ = i_276_; i_278_ < 0; i_278_++) {
		if (is[i_270_++] != 0)
		    is_269_[i_271_++] = i;
		else
		    i_271_++;
		if (is[i_270_++] != 0)
		    is_269_[i_271_++] = i;
		else
		    i_271_++;
		if (is[i_270_++] != 0)
		    is_269_[i_271_++] = i;
		else
		    i_271_++;
		if (is[i_270_++] != 0)
		    is_269_[i_271_++] = i;
		else
		    i_271_++;
	    }
	    for (int i_279_ = i_272_; i_279_ < 0; i_279_++) {
		if (is[i_270_++] != 0)
		    is_269_[i_271_++] = i;
		else
		    i_271_++;
	    }
	    i_271_ += i_274_;
	    i_270_ += i_275_;
	}
    }
    
    void method15599(byte[] is, int[] is_280_, int i, int i_281_, int i_282_,
		     int i_283_, int i_284_, int i_285_, int i_286_) {
	int i_287_ = i >>> 24;
	int i_288_ = 255 - i_287_;
	for (int i_289_ = -i_284_; i_289_ < 0; i_289_++) {
	    for (int i_290_ = -i_283_; i_290_ < 0; i_290_++) {
		if (is[i_281_++] != 0) {
		    int i_291_ = (((i_287_ * (i & 0xff00ff) & ~0xff00ff)
				   + (i_287_ * (i & 0xff00) & 0xff0000))
				  >> 8);
		    int i_292_ = is_280_[i_282_];
		    is_280_[i_282_++]
			= ((((i_292_ & 0xff00ff) * i_288_ & ~0xff00ff)
			    + ((i_292_ & 0xff00) * i_288_ & 0xff0000))
			   >> 8) + i_291_;
		} else
		    i_282_++;
	    }
	    i_282_ += i_285_;
	    i_281_ += i_286_;
	}
    }
    
    void method15600(byte[] is, int[] is_293_, int i, int i_294_, int i_295_,
		     int i_296_, int i_297_, int i_298_, int i_299_,
		     int i_300_, int i_301_, int i_302_, Class145 class145,
		     int i_303_, int i_304_) {
	Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
	int[] is_305_ = class145_sub2.anIntArray9797;
	int[] is_306_ = class145_sub2.anIntArray9798;
	int i_307_ = i_300_ - aClass185_Sub2_9940.anInt9365 * 1709859847;
	int i_308_ = i_301_;
	if (i_304_ > i_308_) {
	    i_308_ = i_304_;
	    i_295_ += (i_304_ - i_301_) * (356365251
					   * aClass185_Sub2_9940.anInt9356);
	    i_294_ += i_302_ * (i_304_ - i_301_);
	}
	int i_309_ = (i_304_ + is_305_.length < i_301_ + i_297_
		      ? i_304_ + is_305_.length : i_301_ + i_297_);
	int i_310_ = i >>> 24;
	int i_311_ = 255 - i_310_;
	for (int i_312_ = i_308_; i_312_ < i_309_; i_312_++) {
	    int i_313_ = i_303_ + is_305_[i_312_ - i_304_];
	    int i_314_ = is_306_[i_312_ - i_304_];
	    int i_315_ = i_296_;
	    if (i_307_ > i_313_) {
		int i_316_ = i_307_ - i_313_;
		if (i_316_ >= i_314_) {
		    i_294_ += i_296_ + i_299_;
		    i_295_ += i_298_ + i_296_;
		    continue;
		}
		i_314_ -= i_316_;
	    } else {
		int i_317_ = i_313_ - i_307_;
		if (i_317_ >= i_296_) {
		    i_294_ += i_299_ + i_296_;
		    i_295_ += i_298_ + i_296_;
		    continue;
		}
		i_294_ += i_317_;
		i_315_ -= i_317_;
		i_295_ += i_317_;
	    }
	    int i_318_ = 0;
	    if (i_315_ < i_314_)
		i_314_ = i_315_;
	    else
		i_318_ = i_315_ - i_314_;
	    for (int i_319_ = -i_314_; i_319_ < 0; i_319_++) {
		if (is[i_294_++] != 0) {
		    int i_320_ = ((((i & 0xff00) * i_310_ & 0xff0000)
				   + (i_310_ * (i & 0xff00ff) & ~0xff00ff))
				  >> 8);
		    int i_321_ = is_293_[i_295_];
		    is_293_[i_295_++]
			= (((i_311_ * (i_321_ & 0xff00ff) & ~0xff00ff)
			    + (i_311_ * (i_321_ & 0xff00) & 0xff0000))
			   >> 8) + i_320_;
		} else
		    i_295_++;
	    }
	    i_294_ += i_318_ + i_299_;
	    i_295_ += i_298_ + i_318_;
	}
    }
    
    void method2845(char c, int i, int i_322_, int i_323_, boolean bool) {
	if (aClass185_Sub2_9940.anIntArray9338 != null) {
	    i += anIntArray9938[c];
	    i_322_ += anIntArray9942[c];
	    int i_324_ = anIntArray9943[c];
	    int i_325_ = anIntArray9941[c];
	    int i_326_ = 356365251 * aClass185_Sub2_9940.anInt9356;
	    int i_327_ = i_326_ * i_322_ + i;
	    int i_328_ = i_326_ - i_324_;
	    int i_329_ = 0;
	    int i_330_ = 0;
	    if (i_322_ < 9823353 * aClass185_Sub2_9940.anInt9344) {
		int i_331_ = aClass185_Sub2_9940.anInt9344 * 9823353 - i_322_;
		i_325_ -= i_331_;
		i_322_ = 9823353 * aClass185_Sub2_9940.anInt9344;
		i_330_ += i_331_ * i_324_;
		i_327_ += i_331_ * i_326_;
	    }
	    if (i_322_ + i_325_ > aClass185_Sub2_9940.anInt9345 * 639238427)
		i_325_ -= (i_325_ + i_322_
			   - aClass185_Sub2_9940.anInt9345 * 639238427);
	    if (i < aClass185_Sub2_9940.anInt9365 * 1709859847) {
		int i_332_ = aClass185_Sub2_9940.anInt9365 * 1709859847 - i;
		i_324_ -= i_332_;
		i = aClass185_Sub2_9940.anInt9365 * 1709859847;
		i_330_ += i_332_;
		i_327_ += i_332_;
		i_329_ += i_332_;
		i_328_ += i_332_;
	    }
	    if (i_324_ + i > aClass185_Sub2_9940.anInt9343 * -1807368365) {
		int i_333_
		    = i + i_324_ - -1807368365 * aClass185_Sub2_9940.anInt9343;
		i_324_ -= i_333_;
		i_329_ += i_333_;
		i_328_ += i_333_;
	    }
	    if (i_324_ > 0 && i_325_ > 0) {
		if (-16777216 == (i_323_ & ~0xffffff))
		    method15591(aByteArrayArray9939[c],
				aClass185_Sub2_9940.anIntArray9338, i_323_,
				i_330_, i_327_, i_324_, i_325_, i_328_,
				i_329_);
		else if (0 != (i_323_ & ~0xffffff))
		    method15599(aByteArrayArray9939[c],
				aClass185_Sub2_9940.anIntArray9338, i_323_,
				i_330_, i_327_, i_324_, i_325_, i_328_,
				i_329_);
	    }
	}
    }
    
    static final void method15601(byte i) {
	Class555.aClass44_Sub16_7417.method1085(1910226327);
	Class88.aClass44_Sub12_884.method1085(2116313132);
	Class307.aClass44_Sub15_3349.method1085(1989694729);
	client.aClass512_11100.method8428(-1486655428).method1085(1986721715);
	Class578.aClass44_Sub3_7743.method1085(2001242331);
	Class531.aClass44_Sub7_7135.method1085(2007454955);
	Class200_Sub12.aClass44_Sub1_9934.method1085(2040906617);
	Class55.aClass44_Sub4_447.method1085(2019432735);
	Class84.aClass44_Sub11_840.method1085(2060976308);
	Class562.aClass110_Sub1_Sub1_7560.method17856(1118141950);
	Class535.aClass110_Sub1_Sub2_7162.method17879((byte) 119);
	Class78.aClass110_Sub1_Sub2_826.method17879((byte) 119);
	Class279.aClass110_Sub1_Sub2_3053.method17879((byte) 113);
	Class522.aClass110_Sub1_Sub2_7083.method17879((byte) 108);
	Class534_Sub24.aClass110_Sub1_Sub2_10565.method17879((byte) 125);
	Class200_Sub23.aClass44_Sub14_10041.method1085(2032950875);
	Class394_Sub1.aClass44_Sub18_10148.method1085(1902434621);
	Class222.aClass44_Sub9_2313.method1085(2116521562);
	Class534_Sub11_Sub13.aClass44_Sub22_11730.method1085(1893177142);
	Class184.aClass44_Sub6_1988.method1085(1997081596);
	Class492.aClass44_Sub10_5341.method1085(2037475518);
	Class200_Sub10.aClass44_Sub20_9926.method1085(1987412120);
	Class650.aClass44_Sub5_8464.method1085(1990077080);
	Class632.aClass44_Sub2_8270.method1085(1986033796);
	Class470.aClass44_Sub17_5153.method1085(1962710304);
	Class586.method9858((short) -29935);
	Class601_Sub1.method16965((byte) 1);
	Class351.aClass406_3620.method6654((byte) 71);
	Class453_Sub3.method15986((byte) -6);
	Class220.method4146(286414324);
	client.aClass203_11078.method3884((byte) -43);
	client.aClass203_11079.method3884((byte) -108);
	Class679.aClass203_8660.method3884((byte) -59);
	client.aClass203_11336.method3884((byte) -30);
	Class150_Sub1.aClass44_8902.method1085(2107089359);
	Class706.aClass44_8845.method1085(2065695967);
	client.aClass203_11082.method3884((byte) -21);
    }
    
    static final void method15602(Class669 class669, int i) {
	int i_334_ = (class669.anIntArray8595
		      [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_334_, 662172582);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_334_ >> 16];
	Class536.method8907(class247, class243, class669, (short) -256);
    }
    
    public static int method15603(CharSequence charsequence, int i, int i_335_,
				  byte[] is, int i_336_, int i_337_) {
	int i_338_ = i_335_ - i;
	for (int i_339_ = 0; i_339_ < i_338_; i_339_++) {
	    char c = charsequence.charAt(i + i_339_);
	    if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
		is[i_336_ + i_339_] = (byte) c;
	    else if ('\u20ac' == c)
		is[i_336_ + i_339_] = (byte) -128;
	    else if (c == '\u201a')
		is[i_339_ + i_336_] = (byte) -126;
	    else if (c == '\u0192')
		is[i_336_ + i_339_] = (byte) -125;
	    else if (c == '\u201e')
		is[i_339_ + i_336_] = (byte) -124;
	    else if (c == '\u2026')
		is[i_339_ + i_336_] = (byte) -123;
	    else if (c == '\u2020')
		is[i_336_ + i_339_] = (byte) -122;
	    else if ('\u2021' == c)
		is[i_336_ + i_339_] = (byte) -121;
	    else if ('\u02c6' == c)
		is[i_339_ + i_336_] = (byte) -120;
	    else if (c == '\u2030')
		is[i_339_ + i_336_] = (byte) -119;
	    else if ('\u0160' == c)
		is[i_336_ + i_339_] = (byte) -118;
	    else if (c == '\u2039')
		is[i_339_ + i_336_] = (byte) -117;
	    else if (c == '\u0152')
		is[i_339_ + i_336_] = (byte) -116;
	    else if (c == '\u017d')
		is[i_336_ + i_339_] = (byte) -114;
	    else if ('\u2018' == c)
		is[i_339_ + i_336_] = (byte) -111;
	    else if ('\u2019' == c)
		is[i_339_ + i_336_] = (byte) -110;
	    else if ('\u201c' == c)
		is[i_339_ + i_336_] = (byte) -109;
	    else if (c == '\u201d')
		is[i_339_ + i_336_] = (byte) -108;
	    else if (c == '\u2022')
		is[i_336_ + i_339_] = (byte) -107;
	    else if (c == '\u2013')
		is[i_336_ + i_339_] = (byte) -106;
	    else if (c == '\u2014')
		is[i_339_ + i_336_] = (byte) -105;
	    else if (c == '\u02dc')
		is[i_336_ + i_339_] = (byte) -104;
	    else if ('\u2122' == c)
		is[i_339_ + i_336_] = (byte) -103;
	    else if ('\u0161' == c)
		is[i_336_ + i_339_] = (byte) -102;
	    else if ('\u203a' == c)
		is[i_339_ + i_336_] = (byte) -101;
	    else if ('\u0153' == c)
		is[i_336_ + i_339_] = (byte) -100;
	    else if ('\u017e' == c)
		is[i_339_ + i_336_] = (byte) -98;
	    else if (c == '\u0178')
		is[i_339_ + i_336_] = (byte) -97;
	    else
		is[i_336_ + i_339_] = (byte) 63;
	}
	return i_338_;
    }
}
