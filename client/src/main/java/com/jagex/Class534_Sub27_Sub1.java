/* Class534_Sub27_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class534_Sub27_Sub1 extends Class534_Sub27
{
    boolean aBool11778;
    static final int anInt11779 = 0;
    static final int anInt11780 = 4;
    static final int anInt11781 = 8;
    static final boolean aBool11782 = true;
    short[] aShortArray11783;
    static final int anInt11784 = 4;
    byte[] aByteArray11785 = new byte[512];
    int anInt11786 = 0;
    int anInt11787;
    static final int anInt11788 = 1638;
    int anInt11789;
    int anInt11790;
    int anInt11791 = 872580036;
    short[] aShortArray11792;
    
    void method18319() {
	aByteArray11785
	    = Class35.method929(anInt11786 * -1209107165, -1432249821);
	method18323((byte) 1);
	for (int i = anInt11789 * 601085707 - 1; i >= 1; i--) {
	    short i_0_ = aShortArray11783[i];
	    if (i_0_ > 8 || i_0_ < -8)
		break;
	    anInt11789 -= 1909898403;
	}
    }
    
    void method18320(int i, int[] is, int i_1_) {
	int i_2_ = Class35.anIntArray283[i] * (1130469635 * anInt11787);
	if (anInt11789 * 601085707 == 1) {
	    int i_3_ = aShortArray11783[0];
	    int i_4_ = aShortArray11792[0] << 12;
	    int i_5_ = i_4_ * (anInt11787 * 1130469635) >> 12;
	    int i_6_ = i_4_ * (1531596817 * anInt11791) >> 12;
	    int i_7_ = i_4_ * i_2_ >> 12;
	    int i_8_ = i_7_ >> 12;
	    int i_9_ = 1 + i_8_;
	    if (i_9_ >= i_5_)
		i_9_ = 0;
	    i_7_ &= 0xfff;
	    int i_10_ = Class405.anIntArray4286[i_7_];
	    int i_11_ = aByteArray11785[i_8_ & 0xff] & 0xff;
	    int i_12_ = aByteArray11785[i_9_ & 0xff] & 0xff;
	    if (aBool11778) {
		for (int i_13_ = 0; i_13_ < Class35.anInt284 * 327132075;
		     i_13_++) {
		    int i_14_ = (anInt11791 * 1531596817
				 * Class35.anIntArray280[i_13_]);
		    int i_15_ = method18321(i_4_ * i_14_ >> 12, i_7_, i_11_,
					    i_12_, i_10_, i_6_, -1462551228);
		    i_15_ = i_15_ * i_3_ >> 12;
		    is[i_13_] = (i_15_ >> 1) + 2048;
		}
	    } else {
		for (int i_16_ = 0; i_16_ < 327132075 * Class35.anInt284;
		     i_16_++) {
		    int i_17_ = (1531596817 * anInt11791
				 * Class35.anIntArray280[i_16_]);
		    int i_18_ = method18321(i_17_ * i_4_ >> 12, i_7_, i_11_,
					    i_12_, i_10_, i_6_, -303350074);
		    is[i_16_] = i_18_ * i_3_ >> 12;
		}
	    }
	} else {
	    int i_19_ = aShortArray11783[0];
	    if (i_19_ > 8 || i_19_ < -8) {
		int i_20_ = aShortArray11792[0] << 12;
		int i_21_ = 1130469635 * anInt11787 * i_20_ >> 12;
		int i_22_ = anInt11791 * 1531596817 * i_20_ >> 12;
		int i_23_ = i_20_ * i_2_ >> 12;
		int i_24_ = i_23_ >> 12;
		int i_25_ = i_24_ + 1;
		if (i_25_ >= i_21_)
		    i_25_ = 0;
		i_23_ &= 0xfff;
		int i_26_ = Class405.anIntArray4286[i_23_];
		int i_27_ = aByteArray11785[i_24_ & 0xff] & 0xff;
		int i_28_ = aByteArray11785[i_25_ & 0xff] & 0xff;
		for (int i_29_ = 0; i_29_ < 327132075 * Class35.anInt284;
		     i_29_++) {
		    int i_30_ = (Class35.anIntArray280[i_29_]
				 * (anInt11791 * 1531596817));
		    int i_31_ = method18321(i_20_ * i_30_ >> 12, i_23_, i_27_,
					    i_28_, i_26_, i_22_, -1392831095);
		    is[i_29_] = i_31_ * i_19_ >> 12;
		}
	    }
	    for (int i_32_ = 1; i_32_ < anInt11789 * 601085707; i_32_++) {
		i_19_ = aShortArray11783[i_32_];
		if (i_19_ > 8 || i_19_ < -8) {
		    int i_33_ = aShortArray11792[i_32_] << 12;
		    int i_34_ = 1130469635 * anInt11787 * i_33_ >> 12;
		    int i_35_ = i_33_ * (1531596817 * anInt11791) >> 12;
		    int i_36_ = i_33_ * i_2_ >> 12;
		    int i_37_ = i_36_ >> 12;
		    int i_38_ = i_37_ + 1;
		    if (i_38_ >= i_34_)
			i_38_ = 0;
		    i_36_ &= 0xfff;
		    int i_39_ = Class405.anIntArray4286[i_36_];
		    int i_40_ = aByteArray11785[i_37_ & 0xff] & 0xff;
		    int i_41_ = aByteArray11785[i_38_ & 0xff] & 0xff;
		    if (aBool11778 && i_32_ == anInt11789 * 601085707 - 1) {
			for (int i_42_ = 0;
			     i_42_ < 327132075 * Class35.anInt284; i_42_++) {
			    int i_43_ = (anInt11791 * 1531596817
					 * Class35.anIntArray280[i_42_]);
			    int i_44_ = method18321(i_43_ * i_33_ >> 12, i_36_,
						    i_40_, i_41_, i_39_, i_35_,
						    -1559923795);
			    i_44_ = (i_44_ * i_19_ >> 12) + is[i_42_];
			    is[i_42_] = (i_44_ >> 1) + 2048;
			}
		    } else {
			for (int i_45_ = 0;
			     i_45_ < Class35.anInt284 * 327132075; i_45_++) {
			    int i_46_ = (1531596817 * anInt11791
					 * Class35.anIntArray280[i_45_]);
			    int i_47_ = method18321(i_33_ * i_46_ >> 12, i_36_,
						    i_40_, i_41_, i_39_, i_35_,
						    999509598);
			    is[i_45_] += i_19_ * i_47_ >> 12;
			}
		    }
		}
	    }
	}
    }
    
    int method18321(int i, int i_48_, int i_49_, int i_50_, int i_51_,
		    int i_52_, int i_53_) {
	int i_54_ = i >> 12;
	int i_55_ = 1 + i_54_;
	if (i_55_ >= i_52_)
	    i_55_ = 0;
	i &= 0xfff;
	i_54_ &= 0xff;
	i_55_ &= 0xff;
	int i_56_ = i - 4096;
	int i_57_ = i_48_ - 4096;
	int i_58_ = Class405.anIntArray4286[i];
	int i_59_ = aByteArray11785[i_49_ + i_54_] & 0x3;
	int i_60_;
	if (i_59_ <= 1)
	    i_60_ = i_59_ == 0 ? i_48_ + i : i_48_ - i;
	else
	    i_60_ = i_59_ == 2 ? i - i_48_ : -i - i_48_;
	i_59_ = aByteArray11785[i_49_ + i_55_] & 0x3;
	int i_61_;
	if (i_59_ <= 1)
	    i_61_ = i_59_ == 0 ? i_48_ + i_56_ : i_48_ - i_56_;
	else
	    i_61_ = i_59_ == 2 ? i_56_ - i_48_ : -i_56_ - i_48_;
	int i_62_ = (i_58_ * (i_61_ - i_60_) >> 12) + i_60_;
	i_59_ = aByteArray11785[i_50_ + i_54_] & 0x3;
	if (i_59_ <= 1)
	    i_60_ = i_59_ == 0 ? i_57_ + i : i_57_ - i;
	else
	    i_60_ = i_59_ == 2 ? i - i_57_ : -i - i_57_;
	i_59_ = aByteArray11785[i_55_ + i_50_] & 0x3;
	if (i_59_ <= 1)
	    i_61_ = i_59_ == 0 ? i_57_ + i_56_ : i_57_ - i_56_;
	else
	    i_61_ = 2 == i_59_ ? i_56_ - i_57_ : -i_56_ - i_57_;
	int i_63_ = ((i_61_ - i_60_) * i_58_ >> 12) + i_60_;
	return ((i_63_ - i_62_) * i_51_ >> 12) + i_62_;
    }
    
    void method18322(int i) {
	aByteArray11785
	    = Class35.method929(anInt11786 * -1209107165, 591312955);
	method18323((byte) 1);
	for (int i_64_ = anInt11789 * 601085707 - 1; i_64_ >= 1; i_64_--) {
	    short i_65_ = aShortArray11783[i_64_];
	    if (i_65_ > 8 || i_65_ < -8)
		break;
	    anInt11789 -= 1909898403;
	}
    }
    
    void method18323(byte i) {
	if (anInt11790 * 739122705 > 0) {
	    aShortArray11783 = new short[anInt11789 * 601085707];
	    aShortArray11792 = new short[anInt11789 * 601085707];
	    for (int i_66_ = 0; i_66_ < anInt11789 * 601085707; i_66_++) {
		aShortArray11783[i_66_]
		    = (short) (int) (Math.pow((double) ((float) (739122705
								 * anInt11790)
							/ 4096.0F),
					      (double) i_66_)
				     * 4096.0);
		aShortArray11792[i_66_]
		    = (short) (int) Math.pow(2.0, (double) i_66_);
	    }
	} else if (aShortArray11783 != null
		   && anInt11789 * 601085707 == aShortArray11783.length) {
	    aShortArray11792 = new short[anInt11789 * 601085707];
	    for (int i_67_ = 0; i_67_ < anInt11789 * 601085707; i_67_++)
		aShortArray11792[i_67_]
		    = (short) (int) Math.pow(2.0, (double) i_67_);
	}
    }
    
    void method18324(int i, int[] is) {
	int i_68_ = Class35.anIntArray283[i] * (1130469635 * anInt11787);
	if (anInt11789 * 601085707 == 1) {
	    int i_69_ = aShortArray11783[0];
	    int i_70_ = aShortArray11792[0] << 12;
	    int i_71_ = i_70_ * (anInt11787 * 1130469635) >> 12;
	    int i_72_ = i_70_ * (1531596817 * anInt11791) >> 12;
	    int i_73_ = i_70_ * i_68_ >> 12;
	    int i_74_ = i_73_ >> 12;
	    int i_75_ = 1 + i_74_;
	    if (i_75_ >= i_71_)
		i_75_ = 0;
	    i_73_ &= 0xfff;
	    int i_76_ = Class405.anIntArray4286[i_73_];
	    int i_77_ = aByteArray11785[i_74_ & 0xff] & 0xff;
	    int i_78_ = aByteArray11785[i_75_ & 0xff] & 0xff;
	    if (aBool11778) {
		for (int i_79_ = 0; i_79_ < Class35.anInt284 * 327132075;
		     i_79_++) {
		    int i_80_ = (anInt11791 * 1531596817
				 * Class35.anIntArray280[i_79_]);
		    int i_81_ = method18321(i_70_ * i_80_ >> 12, i_73_, i_77_,
					    i_78_, i_76_, i_72_, -579874769);
		    i_81_ = i_81_ * i_69_ >> 12;
		    is[i_79_] = (i_81_ >> 1) + 2048;
		}
	    } else {
		for (int i_82_ = 0; i_82_ < 327132075 * Class35.anInt284;
		     i_82_++) {
		    int i_83_ = (1531596817 * anInt11791
				 * Class35.anIntArray280[i_82_]);
		    int i_84_ = method18321(i_83_ * i_70_ >> 12, i_73_, i_77_,
					    i_78_, i_76_, i_72_, -2001700133);
		    is[i_82_] = i_84_ * i_69_ >> 12;
		}
	    }
	} else {
	    int i_85_ = aShortArray11783[0];
	    if (i_85_ > 8 || i_85_ < -8) {
		int i_86_ = aShortArray11792[0] << 12;
		int i_87_ = 1130469635 * anInt11787 * i_86_ >> 12;
		int i_88_ = anInt11791 * 1531596817 * i_86_ >> 12;
		int i_89_ = i_86_ * i_68_ >> 12;
		int i_90_ = i_89_ >> 12;
		int i_91_ = i_90_ + 1;
		if (i_91_ >= i_87_)
		    i_91_ = 0;
		i_89_ &= 0xfff;
		int i_92_ = Class405.anIntArray4286[i_89_];
		int i_93_ = aByteArray11785[i_90_ & 0xff] & 0xff;
		int i_94_ = aByteArray11785[i_91_ & 0xff] & 0xff;
		for (int i_95_ = 0; i_95_ < 327132075 * Class35.anInt284;
		     i_95_++) {
		    int i_96_ = (Class35.anIntArray280[i_95_]
				 * (anInt11791 * 1531596817));
		    int i_97_ = method18321(i_86_ * i_96_ >> 12, i_89_, i_93_,
					    i_94_, i_92_, i_88_, -1221737752);
		    is[i_95_] = i_97_ * i_85_ >> 12;
		}
	    }
	    for (int i_98_ = 1; i_98_ < anInt11789 * 601085707; i_98_++) {
		i_85_ = aShortArray11783[i_98_];
		if (i_85_ > 8 || i_85_ < -8) {
		    int i_99_ = aShortArray11792[i_98_] << 12;
		    int i_100_ = 1130469635 * anInt11787 * i_99_ >> 12;
		    int i_101_ = i_99_ * (1531596817 * anInt11791) >> 12;
		    int i_102_ = i_99_ * i_68_ >> 12;
		    int i_103_ = i_102_ >> 12;
		    int i_104_ = i_103_ + 1;
		    if (i_104_ >= i_100_)
			i_104_ = 0;
		    i_102_ &= 0xfff;
		    int i_105_ = Class405.anIntArray4286[i_102_];
		    int i_106_ = aByteArray11785[i_103_ & 0xff] & 0xff;
		    int i_107_ = aByteArray11785[i_104_ & 0xff] & 0xff;
		    if (aBool11778 && i_98_ == anInt11789 * 601085707 - 1) {
			for (int i_108_ = 0;
			     i_108_ < 327132075 * Class35.anInt284; i_108_++) {
			    int i_109_ = (anInt11791 * 1531596817
					  * Class35.anIntArray280[i_108_]);
			    int i_110_
				= method18321(i_109_ * i_99_ >> 12, i_102_,
					      i_106_, i_107_, i_105_, i_101_,
					      1692033974);
			    i_110_ = (i_110_ * i_85_ >> 12) + is[i_108_];
			    is[i_108_] = (i_110_ >> 1) + 2048;
			}
		    } else {
			for (int i_111_ = 0;
			     i_111_ < Class35.anInt284 * 327132075; i_111_++) {
			    int i_112_ = (1531596817 * anInt11791
					  * Class35.anIntArray280[i_111_]);
			    int i_113_
				= method18321(i_99_ * i_112_ >> 12, i_102_,
					      i_106_, i_107_, i_105_, i_101_,
					      2139863305);
			    is[i_111_] += i_85_ * i_113_ >> 12;
			}
		    }
		}
	    }
	}
    }
    
    int method18325(int i, int i_114_, int i_115_, int i_116_, int i_117_,
		    int i_118_) {
	int i_119_ = i >> 12;
	int i_120_ = 1 + i_119_;
	if (i_120_ >= i_118_)
	    i_120_ = 0;
	i &= 0xfff;
	i_119_ &= 0xff;
	i_120_ &= 0xff;
	int i_121_ = i - 4096;
	int i_122_ = i_114_ - 4096;
	int i_123_ = Class405.anIntArray4286[i];
	int i_124_ = aByteArray11785[i_115_ + i_119_] & 0x3;
	int i_125_;
	if (i_124_ <= 1)
	    i_125_ = i_124_ == 0 ? i_114_ + i : i_114_ - i;
	else
	    i_125_ = i_124_ == 2 ? i - i_114_ : -i - i_114_;
	i_124_ = aByteArray11785[i_115_ + i_120_] & 0x3;
	int i_126_;
	if (i_124_ <= 1)
	    i_126_ = i_124_ == 0 ? i_114_ + i_121_ : i_114_ - i_121_;
	else
	    i_126_ = i_124_ == 2 ? i_121_ - i_114_ : -i_121_ - i_114_;
	int i_127_ = (i_123_ * (i_126_ - i_125_) >> 12) + i_125_;
	i_124_ = aByteArray11785[i_116_ + i_119_] & 0x3;
	if (i_124_ <= 1)
	    i_125_ = i_124_ == 0 ? i_122_ + i : i_122_ - i;
	else
	    i_125_ = i_124_ == 2 ? i - i_122_ : -i - i_122_;
	i_124_ = aByteArray11785[i_120_ + i_116_] & 0x3;
	if (i_124_ <= 1)
	    i_126_ = i_124_ == 0 ? i_122_ + i_121_ : i_122_ - i_121_;
	else
	    i_126_ = 2 == i_124_ ? i_121_ - i_122_ : -i_121_ - i_122_;
	int i_128_ = ((i_126_ - i_125_) * i_123_ >> 12) + i_125_;
	return ((i_128_ - i_127_) * i_117_ >> 12) + i_127_;
    }
    
    void method18326(int i, int[] is) {
	int i_129_ = Class35.anIntArray283[i] * (1130469635 * anInt11787);
	if (anInt11789 * 601085707 == 1) {
	    int i_130_ = aShortArray11783[0];
	    int i_131_ = aShortArray11792[0] << 12;
	    int i_132_ = i_131_ * (anInt11787 * 1130469635) >> 12;
	    int i_133_ = i_131_ * (1531596817 * anInt11791) >> 12;
	    int i_134_ = i_131_ * i_129_ >> 12;
	    int i_135_ = i_134_ >> 12;
	    int i_136_ = 1 + i_135_;
	    if (i_136_ >= i_132_)
		i_136_ = 0;
	    i_134_ &= 0xfff;
	    int i_137_ = Class405.anIntArray4286[i_134_];
	    int i_138_ = aByteArray11785[i_135_ & 0xff] & 0xff;
	    int i_139_ = aByteArray11785[i_136_ & 0xff] & 0xff;
	    if (aBool11778) {
		for (int i_140_ = 0; i_140_ < Class35.anInt284 * 327132075;
		     i_140_++) {
		    int i_141_ = (anInt11791 * 1531596817
				  * Class35.anIntArray280[i_140_]);
		    int i_142_
			= method18321(i_131_ * i_141_ >> 12, i_134_, i_138_,
				      i_139_, i_137_, i_133_, -264455967);
		    i_142_ = i_142_ * i_130_ >> 12;
		    is[i_140_] = (i_142_ >> 1) + 2048;
		}
	    } else {
		for (int i_143_ = 0; i_143_ < 327132075 * Class35.anInt284;
		     i_143_++) {
		    int i_144_ = (1531596817 * anInt11791
				  * Class35.anIntArray280[i_143_]);
		    int i_145_
			= method18321(i_144_ * i_131_ >> 12, i_134_, i_138_,
				      i_139_, i_137_, i_133_, -1040643093);
		    is[i_143_] = i_145_ * i_130_ >> 12;
		}
	    }
	} else {
	    int i_146_ = aShortArray11783[0];
	    if (i_146_ > 8 || i_146_ < -8) {
		int i_147_ = aShortArray11792[0] << 12;
		int i_148_ = 1130469635 * anInt11787 * i_147_ >> 12;
		int i_149_ = anInt11791 * 1531596817 * i_147_ >> 12;
		int i_150_ = i_147_ * i_129_ >> 12;
		int i_151_ = i_150_ >> 12;
		int i_152_ = i_151_ + 1;
		if (i_152_ >= i_148_)
		    i_152_ = 0;
		i_150_ &= 0xfff;
		int i_153_ = Class405.anIntArray4286[i_150_];
		int i_154_ = aByteArray11785[i_151_ & 0xff] & 0xff;
		int i_155_ = aByteArray11785[i_152_ & 0xff] & 0xff;
		for (int i_156_ = 0; i_156_ < 327132075 * Class35.anInt284;
		     i_156_++) {
		    int i_157_ = (Class35.anIntArray280[i_156_]
				  * (anInt11791 * 1531596817));
		    int i_158_
			= method18321(i_147_ * i_157_ >> 12, i_150_, i_154_,
				      i_155_, i_153_, i_149_, -1955694421);
		    is[i_156_] = i_158_ * i_146_ >> 12;
		}
	    }
	    for (int i_159_ = 1; i_159_ < anInt11789 * 601085707; i_159_++) {
		i_146_ = aShortArray11783[i_159_];
		if (i_146_ > 8 || i_146_ < -8) {
		    int i_160_ = aShortArray11792[i_159_] << 12;
		    int i_161_ = 1130469635 * anInt11787 * i_160_ >> 12;
		    int i_162_ = i_160_ * (1531596817 * anInt11791) >> 12;
		    int i_163_ = i_160_ * i_129_ >> 12;
		    int i_164_ = i_163_ >> 12;
		    int i_165_ = i_164_ + 1;
		    if (i_165_ >= i_161_)
			i_165_ = 0;
		    i_163_ &= 0xfff;
		    int i_166_ = Class405.anIntArray4286[i_163_];
		    int i_167_ = aByteArray11785[i_164_ & 0xff] & 0xff;
		    int i_168_ = aByteArray11785[i_165_ & 0xff] & 0xff;
		    if (aBool11778 && i_159_ == anInt11789 * 601085707 - 1) {
			for (int i_169_ = 0;
			     i_169_ < 327132075 * Class35.anInt284; i_169_++) {
			    int i_170_ = (anInt11791 * 1531596817
					  * Class35.anIntArray280[i_169_]);
			    int i_171_
				= method18321(i_170_ * i_160_ >> 12, i_163_,
					      i_167_, i_168_, i_166_, i_162_,
					      1097941616);
			    i_171_ = (i_171_ * i_146_ >> 12) + is[i_169_];
			    is[i_169_] = (i_171_ >> 1) + 2048;
			}
		    } else {
			for (int i_172_ = 0;
			     i_172_ < Class35.anInt284 * 327132075; i_172_++) {
			    int i_173_ = (1531596817 * anInt11791
					  * Class35.anIntArray280[i_172_]);
			    int i_174_
				= method18321(i_160_ * i_173_ >> 12, i_163_,
					      i_167_, i_168_, i_166_, i_162_,
					      304927295);
			    is[i_172_] += i_146_ * i_174_ >> 12;
			}
		    }
		}
	    }
	}
    }
    
    Class534_Sub27_Sub1() {
	super(0, true);
	anInt11787 = 1909614252;
	anInt11789 = -950340980;
	anInt11790 = -49532410;
	aBool11778 = true;
    }
    
    int method18327(int i, int i_175_, int i_176_, int i_177_, int i_178_,
		    int i_179_) {
	int i_180_ = i >> 12;
	int i_181_ = 1 + i_180_;
	if (i_181_ >= i_179_)
	    i_181_ = 0;
	i &= 0xfff;
	i_180_ &= 0xff;
	i_181_ &= 0xff;
	int i_182_ = i - 4096;
	int i_183_ = i_175_ - 4096;
	int i_184_ = Class405.anIntArray4286[i];
	int i_185_ = aByteArray11785[i_176_ + i_180_] & 0x3;
	int i_186_;
	if (i_185_ <= 1)
	    i_186_ = i_185_ == 0 ? i_175_ + i : i_175_ - i;
	else
	    i_186_ = i_185_ == 2 ? i - i_175_ : -i - i_175_;
	i_185_ = aByteArray11785[i_176_ + i_181_] & 0x3;
	int i_187_;
	if (i_185_ <= 1)
	    i_187_ = i_185_ == 0 ? i_175_ + i_182_ : i_175_ - i_182_;
	else
	    i_187_ = i_185_ == 2 ? i_182_ - i_175_ : -i_182_ - i_175_;
	int i_188_ = (i_184_ * (i_187_ - i_186_) >> 12) + i_186_;
	i_185_ = aByteArray11785[i_177_ + i_180_] & 0x3;
	if (i_185_ <= 1)
	    i_186_ = i_185_ == 0 ? i_183_ + i : i_183_ - i;
	else
	    i_186_ = i_185_ == 2 ? i - i_183_ : -i - i_183_;
	i_185_ = aByteArray11785[i_181_ + i_177_] & 0x3;
	if (i_185_ <= 1)
	    i_187_ = i_185_ == 0 ? i_183_ + i_182_ : i_183_ - i_182_;
	else
	    i_187_ = 2 == i_185_ ? i_182_ - i_183_ : -i_182_ - i_183_;
	int i_189_ = ((i_187_ - i_186_) * i_184_ >> 12) + i_186_;
	return ((i_189_ - i_188_) * i_178_ >> 12) + i_188_;
    }
    
    void method18328(int i, int[] is) {
	int i_190_ = Class35.anIntArray283[i] * (1130469635 * anInt11787);
	if (anInt11789 * 601085707 == 1) {
	    int i_191_ = aShortArray11783[0];
	    int i_192_ = aShortArray11792[0] << 12;
	    int i_193_ = i_192_ * (anInt11787 * 1130469635) >> 12;
	    int i_194_ = i_192_ * (1531596817 * anInt11791) >> 12;
	    int i_195_ = i_192_ * i_190_ >> 12;
	    int i_196_ = i_195_ >> 12;
	    int i_197_ = 1 + i_196_;
	    if (i_197_ >= i_193_)
		i_197_ = 0;
	    i_195_ &= 0xfff;
	    int i_198_ = Class405.anIntArray4286[i_195_];
	    int i_199_ = aByteArray11785[i_196_ & 0xff] & 0xff;
	    int i_200_ = aByteArray11785[i_197_ & 0xff] & 0xff;
	    if (aBool11778) {
		for (int i_201_ = 0; i_201_ < Class35.anInt284 * 327132075;
		     i_201_++) {
		    int i_202_ = (anInt11791 * 1531596817
				  * Class35.anIntArray280[i_201_]);
		    int i_203_
			= method18321(i_192_ * i_202_ >> 12, i_195_, i_199_,
				      i_200_, i_198_, i_194_, -714982185);
		    i_203_ = i_203_ * i_191_ >> 12;
		    is[i_201_] = (i_203_ >> 1) + 2048;
		}
	    } else {
		for (int i_204_ = 0; i_204_ < 327132075 * Class35.anInt284;
		     i_204_++) {
		    int i_205_ = (1531596817 * anInt11791
				  * Class35.anIntArray280[i_204_]);
		    int i_206_
			= method18321(i_205_ * i_192_ >> 12, i_195_, i_199_,
				      i_200_, i_198_, i_194_, 561593830);
		    is[i_204_] = i_206_ * i_191_ >> 12;
		}
	    }
	} else {
	    int i_207_ = aShortArray11783[0];
	    if (i_207_ > 8 || i_207_ < -8) {
		int i_208_ = aShortArray11792[0] << 12;
		int i_209_ = 1130469635 * anInt11787 * i_208_ >> 12;
		int i_210_ = anInt11791 * 1531596817 * i_208_ >> 12;
		int i_211_ = i_208_ * i_190_ >> 12;
		int i_212_ = i_211_ >> 12;
		int i_213_ = i_212_ + 1;
		if (i_213_ >= i_209_)
		    i_213_ = 0;
		i_211_ &= 0xfff;
		int i_214_ = Class405.anIntArray4286[i_211_];
		int i_215_ = aByteArray11785[i_212_ & 0xff] & 0xff;
		int i_216_ = aByteArray11785[i_213_ & 0xff] & 0xff;
		for (int i_217_ = 0; i_217_ < 327132075 * Class35.anInt284;
		     i_217_++) {
		    int i_218_ = (Class35.anIntArray280[i_217_]
				  * (anInt11791 * 1531596817));
		    int i_219_
			= method18321(i_208_ * i_218_ >> 12, i_211_, i_215_,
				      i_216_, i_214_, i_210_, -1225306738);
		    is[i_217_] = i_219_ * i_207_ >> 12;
		}
	    }
	    for (int i_220_ = 1; i_220_ < anInt11789 * 601085707; i_220_++) {
		i_207_ = aShortArray11783[i_220_];
		if (i_207_ > 8 || i_207_ < -8) {
		    int i_221_ = aShortArray11792[i_220_] << 12;
		    int i_222_ = 1130469635 * anInt11787 * i_221_ >> 12;
		    int i_223_ = i_221_ * (1531596817 * anInt11791) >> 12;
		    int i_224_ = i_221_ * i_190_ >> 12;
		    int i_225_ = i_224_ >> 12;
		    int i_226_ = i_225_ + 1;
		    if (i_226_ >= i_222_)
			i_226_ = 0;
		    i_224_ &= 0xfff;
		    int i_227_ = Class405.anIntArray4286[i_224_];
		    int i_228_ = aByteArray11785[i_225_ & 0xff] & 0xff;
		    int i_229_ = aByteArray11785[i_226_ & 0xff] & 0xff;
		    if (aBool11778 && i_220_ == anInt11789 * 601085707 - 1) {
			for (int i_230_ = 0;
			     i_230_ < 327132075 * Class35.anInt284; i_230_++) {
			    int i_231_ = (anInt11791 * 1531596817
					  * Class35.anIntArray280[i_230_]);
			    int i_232_
				= method18321(i_231_ * i_221_ >> 12, i_224_,
					      i_228_, i_229_, i_227_, i_223_,
					      1214171747);
			    i_232_ = (i_232_ * i_207_ >> 12) + is[i_230_];
			    is[i_230_] = (i_232_ >> 1) + 2048;
			}
		    } else {
			for (int i_233_ = 0;
			     i_233_ < Class35.anInt284 * 327132075; i_233_++) {
			    int i_234_ = (1531596817 * anInt11791
					  * Class35.anIntArray280[i_233_]);
			    int i_235_
				= method18321(i_221_ * i_234_ >> 12, i_224_,
					      i_228_, i_229_, i_227_, i_223_,
					      1963659006);
			    is[i_233_] += i_207_ * i_235_ >> 12;
			}
		    }
		}
	    }
	}
    }
    
    int method18329(int i, int i_236_, int i_237_, int i_238_, int i_239_,
		    int i_240_) {
	int i_241_ = i >> 12;
	int i_242_ = 1 + i_241_;
	if (i_242_ >= i_240_)
	    i_242_ = 0;
	i &= 0xfff;
	i_241_ &= 0xff;
	i_242_ &= 0xff;
	int i_243_ = i - 4096;
	int i_244_ = i_236_ - 4096;
	int i_245_ = Class405.anIntArray4286[i];
	int i_246_ = aByteArray11785[i_237_ + i_241_] & 0x3;
	int i_247_;
	if (i_246_ <= 1)
	    i_247_ = i_246_ == 0 ? i_236_ + i : i_236_ - i;
	else
	    i_247_ = i_246_ == 2 ? i - i_236_ : -i - i_236_;
	i_246_ = aByteArray11785[i_237_ + i_242_] & 0x3;
	int i_248_;
	if (i_246_ <= 1)
	    i_248_ = i_246_ == 0 ? i_236_ + i_243_ : i_236_ - i_243_;
	else
	    i_248_ = i_246_ == 2 ? i_243_ - i_236_ : -i_243_ - i_236_;
	int i_249_ = (i_245_ * (i_248_ - i_247_) >> 12) + i_247_;
	i_246_ = aByteArray11785[i_238_ + i_241_] & 0x3;
	if (i_246_ <= 1)
	    i_247_ = i_246_ == 0 ? i_244_ + i : i_244_ - i;
	else
	    i_247_ = i_246_ == 2 ? i - i_244_ : -i - i_244_;
	i_246_ = aByteArray11785[i_242_ + i_238_] & 0x3;
	if (i_246_ <= 1)
	    i_248_ = i_246_ == 0 ? i_244_ + i_243_ : i_244_ - i_243_;
	else
	    i_248_ = 2 == i_246_ ? i_243_ - i_244_ : -i_243_ - i_244_;
	int i_250_ = ((i_248_ - i_247_) * i_245_ >> 12) + i_247_;
	return ((i_250_ - i_249_) * i_239_ >> 12) + i_249_;
    }
    
    int method18330(int i, int i_251_, int i_252_, int i_253_, int i_254_,
		    int i_255_) {
	int i_256_ = i >> 12;
	int i_257_ = 1 + i_256_;
	if (i_257_ >= i_255_)
	    i_257_ = 0;
	i &= 0xfff;
	i_256_ &= 0xff;
	i_257_ &= 0xff;
	int i_258_ = i - 4096;
	int i_259_ = i_251_ - 4096;
	int i_260_ = Class405.anIntArray4286[i];
	int i_261_ = aByteArray11785[i_252_ + i_256_] & 0x3;
	int i_262_;
	if (i_261_ <= 1)
	    i_262_ = i_261_ == 0 ? i_251_ + i : i_251_ - i;
	else
	    i_262_ = i_261_ == 2 ? i - i_251_ : -i - i_251_;
	i_261_ = aByteArray11785[i_252_ + i_257_] & 0x3;
	int i_263_;
	if (i_261_ <= 1)
	    i_263_ = i_261_ == 0 ? i_251_ + i_258_ : i_251_ - i_258_;
	else
	    i_263_ = i_261_ == 2 ? i_258_ - i_251_ : -i_258_ - i_251_;
	int i_264_ = (i_260_ * (i_263_ - i_262_) >> 12) + i_262_;
	i_261_ = aByteArray11785[i_253_ + i_256_] & 0x3;
	if (i_261_ <= 1)
	    i_262_ = i_261_ == 0 ? i_259_ + i : i_259_ - i;
	else
	    i_262_ = i_261_ == 2 ? i - i_259_ : -i - i_259_;
	i_261_ = aByteArray11785[i_257_ + i_253_] & 0x3;
	if (i_261_ <= 1)
	    i_263_ = i_261_ == 0 ? i_259_ + i_258_ : i_259_ - i_258_;
	else
	    i_263_ = 2 == i_261_ ? i_258_ - i_259_ : -i_258_ - i_259_;
	int i_265_ = ((i_263_ - i_262_) * i_260_ >> 12) + i_262_;
	return ((i_265_ - i_264_) * i_254_ >> 12) + i_264_;
    }
    
    void method18331() {
	aByteArray11785
	    = Class35.method929(anInt11786 * -1209107165, 1460170427);
	method18323((byte) 1);
	for (int i = anInt11789 * 601085707 - 1; i >= 1; i--) {
	    short i_266_ = aShortArray11783[i];
	    if (i_266_ > 8 || i_266_ < -8)
		break;
	    anInt11789 -= 1909898403;
	}
    }
    
    void method18332(int i, int[] is) {
	int i_267_ = Class35.anIntArray283[i] * (1130469635 * anInt11787);
	if (anInt11789 * 601085707 == 1) {
	    int i_268_ = aShortArray11783[0];
	    int i_269_ = aShortArray11792[0] << 12;
	    int i_270_ = i_269_ * (anInt11787 * 1130469635) >> 12;
	    int i_271_ = i_269_ * (1531596817 * anInt11791) >> 12;
	    int i_272_ = i_269_ * i_267_ >> 12;
	    int i_273_ = i_272_ >> 12;
	    int i_274_ = 1 + i_273_;
	    if (i_274_ >= i_270_)
		i_274_ = 0;
	    i_272_ &= 0xfff;
	    int i_275_ = Class405.anIntArray4286[i_272_];
	    int i_276_ = aByteArray11785[i_273_ & 0xff] & 0xff;
	    int i_277_ = aByteArray11785[i_274_ & 0xff] & 0xff;
	    if (aBool11778) {
		for (int i_278_ = 0; i_278_ < Class35.anInt284 * 327132075;
		     i_278_++) {
		    int i_279_ = (anInt11791 * 1531596817
				  * Class35.anIntArray280[i_278_]);
		    int i_280_
			= method18321(i_269_ * i_279_ >> 12, i_272_, i_276_,
				      i_277_, i_275_, i_271_, -1368668975);
		    i_280_ = i_280_ * i_268_ >> 12;
		    is[i_278_] = (i_280_ >> 1) + 2048;
		}
	    } else {
		for (int i_281_ = 0; i_281_ < 327132075 * Class35.anInt284;
		     i_281_++) {
		    int i_282_ = (1531596817 * anInt11791
				  * Class35.anIntArray280[i_281_]);
		    int i_283_
			= method18321(i_282_ * i_269_ >> 12, i_272_, i_276_,
				      i_277_, i_275_, i_271_, -457742456);
		    is[i_281_] = i_283_ * i_268_ >> 12;
		}
	    }
	} else {
	    int i_284_ = aShortArray11783[0];
	    if (i_284_ > 8 || i_284_ < -8) {
		int i_285_ = aShortArray11792[0] << 12;
		int i_286_ = 1130469635 * anInt11787 * i_285_ >> 12;
		int i_287_ = anInt11791 * 1531596817 * i_285_ >> 12;
		int i_288_ = i_285_ * i_267_ >> 12;
		int i_289_ = i_288_ >> 12;
		int i_290_ = i_289_ + 1;
		if (i_290_ >= i_286_)
		    i_290_ = 0;
		i_288_ &= 0xfff;
		int i_291_ = Class405.anIntArray4286[i_288_];
		int i_292_ = aByteArray11785[i_289_ & 0xff] & 0xff;
		int i_293_ = aByteArray11785[i_290_ & 0xff] & 0xff;
		for (int i_294_ = 0; i_294_ < 327132075 * Class35.anInt284;
		     i_294_++) {
		    int i_295_ = (Class35.anIntArray280[i_294_]
				  * (anInt11791 * 1531596817));
		    int i_296_
			= method18321(i_285_ * i_295_ >> 12, i_288_, i_292_,
				      i_293_, i_291_, i_287_, -1972286962);
		    is[i_294_] = i_296_ * i_284_ >> 12;
		}
	    }
	    for (int i_297_ = 1; i_297_ < anInt11789 * 601085707; i_297_++) {
		i_284_ = aShortArray11783[i_297_];
		if (i_284_ > 8 || i_284_ < -8) {
		    int i_298_ = aShortArray11792[i_297_] << 12;
		    int i_299_ = 1130469635 * anInt11787 * i_298_ >> 12;
		    int i_300_ = i_298_ * (1531596817 * anInt11791) >> 12;
		    int i_301_ = i_298_ * i_267_ >> 12;
		    int i_302_ = i_301_ >> 12;
		    int i_303_ = i_302_ + 1;
		    if (i_303_ >= i_299_)
			i_303_ = 0;
		    i_301_ &= 0xfff;
		    int i_304_ = Class405.anIntArray4286[i_301_];
		    int i_305_ = aByteArray11785[i_302_ & 0xff] & 0xff;
		    int i_306_ = aByteArray11785[i_303_ & 0xff] & 0xff;
		    if (aBool11778 && i_297_ == anInt11789 * 601085707 - 1) {
			for (int i_307_ = 0;
			     i_307_ < 327132075 * Class35.anInt284; i_307_++) {
			    int i_308_ = (anInt11791 * 1531596817
					  * Class35.anIntArray280[i_307_]);
			    int i_309_
				= method18321(i_308_ * i_298_ >> 12, i_301_,
					      i_305_, i_306_, i_304_, i_300_,
					      -785865143);
			    i_309_ = (i_309_ * i_284_ >> 12) + is[i_307_];
			    is[i_307_] = (i_309_ >> 1) + 2048;
			}
		    } else {
			for (int i_310_ = 0;
			     i_310_ < Class35.anInt284 * 327132075; i_310_++) {
			    int i_311_ = (1531596817 * anInt11791
					  * Class35.anIntArray280[i_310_]);
			    int i_312_
				= method18321(i_298_ * i_311_ >> 12, i_301_,
					      i_305_, i_306_, i_304_, i_300_,
					      -1174536832);
			    is[i_310_] += i_284_ * i_312_ >> 12;
			}
		    }
		}
	    }
	}
    }
    
    void method18333() {
	aByteArray11785
	    = Class35.method929(anInt11786 * -1209107165, 211977447);
	method18323((byte) 1);
	for (int i = anInt11789 * 601085707 - 1; i >= 1; i--) {
	    short i_313_ = aShortArray11783[i];
	    if (i_313_ > 8 || i_313_ < -8)
		break;
	    anInt11789 -= 1909898403;
	}
    }
    
    void method18334() {
	if (anInt11790 * 739122705 > 0) {
	    aShortArray11783 = new short[anInt11789 * 601085707];
	    aShortArray11792 = new short[anInt11789 * 601085707];
	    for (int i = 0; i < anInt11789 * 601085707; i++) {
		aShortArray11783[i]
		    = (short) (int) (Math.pow((double) ((float) (739122705
								 * anInt11790)
							/ 4096.0F),
					      (double) i)
				     * 4096.0);
		aShortArray11792[i] = (short) (int) Math.pow(2.0, (double) i);
	    }
	} else if (aShortArray11783 != null
		   && anInt11789 * 601085707 == aShortArray11783.length) {
	    aShortArray11792 = new short[anInt11789 * 601085707];
	    for (int i = 0; i < anInt11789 * 601085707; i++)
		aShortArray11792[i] = (short) (int) Math.pow(2.0, (double) i);
	}
    }
    
    void method18335() {
	if (anInt11790 * 739122705 > 0) {
	    aShortArray11783 = new short[anInt11789 * 601085707];
	    aShortArray11792 = new short[anInt11789 * 601085707];
	    for (int i = 0; i < anInt11789 * 601085707; i++) {
		aShortArray11783[i]
		    = (short) (int) (Math.pow((double) ((float) (739122705
								 * anInt11790)
							/ 4096.0F),
					      (double) i)
				     * 4096.0);
		aShortArray11792[i] = (short) (int) Math.pow(2.0, (double) i);
	    }
	} else if (aShortArray11783 != null
		   && anInt11789 * 601085707 == aShortArray11783.length) {
	    aShortArray11792 = new short[anInt11789 * 601085707];
	    for (int i = 0; i < anInt11789 * 601085707; i++)
		aShortArray11792[i] = (short) (int) Math.pow(2.0, (double) i);
	}
    }
    
    public static int[] method18336(int i, int i_314_, int i_315_, int i_316_,
				    int i_317_, float f, boolean bool) {
	int[] is = new int[i];
	Class534_Sub27_Sub1 class534_sub27_sub1 = new Class534_Sub27_Sub1();
	class534_sub27_sub1.anInt11786 = i_314_ * -334914933;
	class534_sub27_sub1.aBool11778 = bool;
	class534_sub27_sub1.anInt11791 = i_315_ * -855596815;
	class534_sub27_sub1.anInt11787 = i_316_ * 477403563;
	class534_sub27_sub1.anInt11789 = i_317_ * 1909898403;
	class534_sub27_sub1.anInt11790 = -1869573391 * (int) (f * 4096.0F);
	class534_sub27_sub1.method18322(2110854129);
	Class35.method928(i, 1, (byte) -53);
	class534_sub27_sub1.method18320(0, is, 1925893384);
	return is;
    }
    
    public static int[][] method18337(int i, int i_318_, int i_319_,
				      int i_320_, int i_321_, int i_322_,
				      float f, boolean bool) {
	int[][] is = new int[i_318_][i];
	Class534_Sub27_Sub1 class534_sub27_sub1 = new Class534_Sub27_Sub1();
	class534_sub27_sub1.aBool11778 = bool;
	class534_sub27_sub1.anInt11791 = i_320_ * -855596815;
	class534_sub27_sub1.anInt11787 = 477403563 * i_321_;
	class534_sub27_sub1.anInt11789 = i_322_ * 1909898403;
	class534_sub27_sub1.anInt11790 = -1869573391 * (int) (f * 4096.0F);
	class534_sub27_sub1.method18322(2115302058);
	Class35.method928(i, i_318_, (byte) -42);
	for (int i_323_ = 0; i_323_ < i_318_; i_323_++)
	    class534_sub27_sub1.method18320(i_323_, is[i_323_], -123751192);
	return is;
    }
    
    public static int[][] method18338(int i, int i_324_, int i_325_,
				      int i_326_, int i_327_, int i_328_,
				      float f, boolean bool) {
	int[][] is = new int[i_324_][i];
	Class534_Sub27_Sub1 class534_sub27_sub1 = new Class534_Sub27_Sub1();
	class534_sub27_sub1.aBool11778 = bool;
	class534_sub27_sub1.anInt11791 = i_326_ * -855596815;
	class534_sub27_sub1.anInt11787 = 477403563 * i_327_;
	class534_sub27_sub1.anInt11789 = i_328_ * 1909898403;
	class534_sub27_sub1.anInt11790 = -1869573391 * (int) (f * 4096.0F);
	class534_sub27_sub1.method18322(2136104740);
	Class35.method928(i, i_324_, (byte) -62);
	for (int i_329_ = 0; i_329_ < i_324_; i_329_++)
	    class534_sub27_sub1.method18320(i_329_, is[i_329_], 791225704);
	return is;
    }
    
    public static int[][] method18339(int i, int i_330_, int i_331_,
				      int i_332_, int i_333_, int i_334_,
				      float f, boolean bool) {
	int[][] is = new int[i_330_][i];
	Class534_Sub27_Sub1 class534_sub27_sub1 = new Class534_Sub27_Sub1();
	class534_sub27_sub1.aBool11778 = bool;
	class534_sub27_sub1.anInt11791 = i_332_ * -855596815;
	class534_sub27_sub1.anInt11787 = 477403563 * i_333_;
	class534_sub27_sub1.anInt11789 = i_334_ * 1909898403;
	class534_sub27_sub1.anInt11790 = -1869573391 * (int) (f * 4096.0F);
	class534_sub27_sub1.method18322(2097157460);
	Class35.method928(i, i_330_, (byte) -17);
	for (int i_335_ = 0; i_335_ < i_330_; i_335_++)
	    class534_sub27_sub1.method18320(i_335_, is[i_335_], 1719056257);
	return is;
    }
    
    public static int[] method18340(int i, int i_336_, int i_337_, int i_338_,
				    int i_339_, float f, boolean bool) {
	int[] is = new int[i];
	Class534_Sub27_Sub1 class534_sub27_sub1 = new Class534_Sub27_Sub1();
	class534_sub27_sub1.anInt11786 = i_336_ * -334914933;
	class534_sub27_sub1.aBool11778 = bool;
	class534_sub27_sub1.anInt11791 = i_337_ * -855596815;
	class534_sub27_sub1.anInt11787 = i_338_ * 477403563;
	class534_sub27_sub1.anInt11789 = i_339_ * 1909898403;
	class534_sub27_sub1.anInt11790 = -1869573391 * (int) (f * 4096.0F);
	class534_sub27_sub1.method18322(2138734822);
	Class35.method928(i, 1, (byte) -89);
	class534_sub27_sub1.method18320(0, is, 45113993);
	return is;
    }
    
    public static int[][] method18341(int i, int i_340_, int i_341_,
				      int i_342_, int i_343_, int i_344_,
				      float f, boolean bool) {
	int[][] is = new int[i_340_][i];
	Class534_Sub27_Sub1 class534_sub27_sub1 = new Class534_Sub27_Sub1();
	class534_sub27_sub1.aBool11778 = bool;
	class534_sub27_sub1.anInt11791 = i_342_ * -855596815;
	class534_sub27_sub1.anInt11787 = 477403563 * i_343_;
	class534_sub27_sub1.anInt11789 = i_344_ * 1909898403;
	class534_sub27_sub1.anInt11790 = -1869573391 * (int) (f * 4096.0F);
	class534_sub27_sub1.method18322(2144788282);
	Class35.method928(i, i_340_, (byte) -105);
	for (int i_345_ = 0; i_345_ < i_340_; i_345_++)
	    class534_sub27_sub1.method18320(i_345_, is[i_345_], 441040069);
	return is;
    }
}
