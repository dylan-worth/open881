/* Class338 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;

public class Class338
{
    int anInt3525;
    Class151_Sub2 aClass151_Sub2_3526;
    int anInt3527;
    int anInt3528;
    byte[] aByteArray3529;
    Class185_Sub1 aClass185_Sub1_3530;
    int anInt3531;
    int anInt3532;
    Class344[][] aClass344ArrayArray3533;
    
    void method5907(int i, int i_0_, int i_1_, int i_2_) {
	if (aClass344ArrayArray3533 != null) {
	    int i_3_ = i - 1 >> 7;
	    int i_4_ = i - 1 + i_1_ - 1 >> 7;
	    int i_5_ = i_0_ - 1 >> 7;
	    int i_6_ = i_0_ - 1 + i_2_ - 1 >> 7;
	    for (int i_7_ = i_3_; i_7_ <= i_4_; i_7_++) {
		Class344[] class344s = aClass344ArrayArray3533[i_7_];
		for (int i_8_ = i_5_; i_8_ <= i_6_; i_8_++) {
		    if (class344s[i_8_] != null)
			class344s[i_8_].aBool3563 = true;
		}
	    }
	}
    }
    
    void method5908() {
	aClass344ArrayArray3533 = new Class344[anInt3527][anInt3531];
	for (int i = 0; i < anInt3531; i++) {
	    for (int i_9_ = 0; i_9_ < anInt3527; i_9_++) {
		aClass344ArrayArray3533[i_9_][i]
		    = new Class344(aClass185_Sub1_3530, this,
				   aClass151_Sub2_3526, i_9_, i, anInt3532,
				   i_9_ * 128 + 1, i * 128 + 1);
		if (aClass344ArrayArray3533[i_9_][i].anInt3565 == 0)
		    aClass344ArrayArray3533[i_9_][i] = null;
	    }
	}
    }
    
    void method5909(Class324 class324, int i, int i_10_, int i_11_,
		    boolean[][] bools, boolean bool) {
	aClass185_Sub1_3530.method3461(false);
	float f = 1.0F / (float) (aClass185_Sub1_3530.anInt9187 * 128);
	if (bool) {
	    for (int i_12_ = 0; i_12_ < anInt3531; i_12_++) {
		int i_13_ = i_12_ << anInt3532;
		int i_14_ = i_12_ + 1 << anInt3532;
		for (int i_15_ = 0; i_15_ < anInt3527; i_15_++) {
		    if (aClass344ArrayArray3533[i_15_][i_12_] != null) {
			int i_16_ = i_15_ << anInt3532;
			int i_17_ = i_15_ + 1 << anInt3532;
		    while_36_:
			for (int i_18_ = i_16_; i_18_ < i_17_; i_18_++) {
			    if (i_18_ - i >= -i_11_ && i_18_ - i <= i_11_) {
				for (int i_19_ = i_13_; i_19_ < i_14_;
				     i_19_++) {
				    if (i_19_ - i_10_ >= -i_11_
					&& i_19_ - i_10_ <= i_11_
					&& (bools[i_18_ - i + i_11_]
					    [i_19_ - i_10_ + i_11_])) {
					class324.aClass433_3430
					    .method6952(f, f, 1.0F, 1.0F);
					class324.aClass433_3430
					    .aFloatArray4853[12]
					    = (float) -i_15_;
					class324.aClass433_3430
					    .aFloatArray4853[13]
					    = (float) -i_12_;
					aClass344ArrayArray3533[i_15_]
					    [i_12_].method6111(class324);
					break while_36_;
				    }
				}
			    }
			}
		    }
		}
	    }
	} else {
	    int[] is = new int[anInt3531 * anInt3527];
	    ByteBuffer bytebuffer = aClass185_Sub1_3530.aByteBuffer9266;
	    bytebuffer.clear();
	    int i_20_ = 0;
	    for (int i_21_ = 0; i_21_ < anInt3531; i_21_++) {
		int i_22_ = i_21_ << anInt3532;
		int i_23_ = i_21_ + 1 << anInt3532;
		for (int i_24_ = 0; i_24_ < anInt3527; i_24_++) {
		    Class344 class344 = aClass344ArrayArray3533[i_24_][i_21_];
		    int i_25_ = 0;
		    if (class344 != null) {
			int i_26_ = i_24_ << anInt3532;
			int i_27_ = i_24_ + 1 << anInt3532;
			for (int i_28_ = i_22_; i_28_ < i_23_; i_28_++) {
			    if (i_28_ - i_10_ >= -i_11_
				&& i_28_ - i_10_ <= i_11_) {
				int i_29_
				    = (i_28_ * (aClass151_Sub2_3526.anInt1701
						* -1924295585)
				       + i_26_);
				for (int i_30_ = i_26_; i_30_ < i_27_;
				     i_30_++) {
				    if (i_30_ - i >= -i_11_
					&& i_30_ - i <= i_11_
					&& (bools[i_30_ - i + i_11_]
					    [i_28_ - i_10_ + i_11_])) {
					short[] is_31_
					    = (aClass151_Sub2_3526
					       .aShortArrayArray9409[i_29_]);
					if (is_31_ != null) {
					    for (int i_32_ = 0;
						 i_32_ < is_31_.length;
						 i_32_++) {
						bytebuffer
						    .putShort(is_31_[i_32_]);
						i_25_++;
					    }
					}
				    }
				    i_29_++;
				}
			    }
			}
		    }
		    is[i_20_] = i_25_;
		    i_20_++;
		}
	    }
	    if (bytebuffer.position() != 0) {
		int i_33_ = bytebuffer.position();
		Interface39 interface39
		    = aClass185_Sub1_3530.method14725(i_33_ / 2);
		interface39.method235(0, i_33_, aClass185_Sub1_3530.aLong9139);
		int i_34_ = 0;
		i_20_ = 0;
		for (int i_35_ = 0; i_35_ < anInt3531; i_35_++) {
		    for (int i_36_ = 0; i_36_ < anInt3527; i_36_++) {
			if (is[i_20_] != 0) {
			    class324.aClass433_3430.method6952(f, f, 1.0F,
							       1.0F);
			    class324.aClass433_3430.aFloatArray4853[12]
				= (float) -i_36_;
			    class324.aClass433_3430.aFloatArray4853[13]
				= (float) -i_35_;
			    aClass344ArrayArray3533[i_36_][i_35_].method6110
				(class324, interface39, i_34_, is[i_20_] / 3);
			    i_34_ += is[i_20_];
			}
			i_20_++;
		    }
		}
	    }
	}
	aClass185_Sub1_3530.method3461(true);
    }
    
    void method5910(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
		    int i_37_) {
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2
	    = (Class534_Sub18_Sub16_Sub2) class534_sub18_sub16;
	i += class534_sub18_sub16_sub2.anInt12123 + 1;
	i_37_ += class534_sub18_sub16_sub2.anInt12121 + 1;
	int i_38_ = i + i_37_ * anInt3525;
	int i_39_ = 0;
	int i_40_ = class534_sub18_sub16_sub2.anInt12122;
	int i_41_ = class534_sub18_sub16_sub2.anInt12125;
	int i_42_ = anInt3525 - i_41_;
	int i_43_ = 0;
	if (i_37_ <= 0) {
	    int i_44_ = 1 - i_37_;
	    i_40_ -= i_44_;
	    i_39_ += i_44_ * i_41_;
	    i_38_ += i_44_ * anInt3525;
	    i_37_ = 1;
	}
	if (i_37_ + i_40_ >= anInt3528) {
	    int i_45_ = i_37_ + i_40_ + 1 - anInt3528;
	    i_40_ -= i_45_;
	}
	if (i <= 0) {
	    int i_46_ = 1 - i;
	    i_41_ -= i_46_;
	    i_39_ += i_46_;
	    i_38_ += i_46_;
	    i_43_ += i_46_;
	    i_42_ += i_46_;
	    i = 1;
	}
	if (i + i_41_ >= anInt3525) {
	    int i_47_ = i + i_41_ + 1 - anInt3525;
	    i_41_ -= i_47_;
	    i_43_ += i_47_;
	    i_42_ += i_47_;
	}
	if (i_41_ > 0 && i_40_ > 0) {
	    method5911(aByteArray3529,
		       class534_sub18_sub16_sub2.aByteArray12120, i_39_, i_38_,
		       i_41_, i_40_, i_42_, i_43_);
	    method5907(i, i_37_, i_41_, i_40_);
	}
    }
    
    static final void method5911(byte[] is, byte[] is_48_, int i, int i_49_,
				 int i_50_, int i_51_, int i_52_, int i_53_) {
	int i_54_ = -(i_50_ >> 2);
	i_50_ = -(i_50_ & 0x3);
	for (int i_55_ = -i_51_; i_55_ < 0; i_55_++) {
	    for (int i_56_ = i_54_; i_56_ < 0; i_56_++) {
		is[i_49_++] += is_48_[i++];
		is[i_49_++] += is_48_[i++];
		is[i_49_++] += is_48_[i++];
		is[i_49_++] += is_48_[i++];
	    }
	    for (int i_57_ = i_50_; i_57_ < 0; i_57_++)
		is[i_49_++] += is_48_[i++];
	    i_49_ += i_52_;
	    i += i_53_;
	}
    }
    
    Class338(Class185_Sub1 class185_sub1, Class151_Sub2 class151_sub2) {
	aClass185_Sub1_3530 = class185_sub1;
	aClass151_Sub2_3526 = class151_sub2;
	anInt3525 = 2 + ((aClass151_Sub2_3526.anInt1701 * -1924295585
			  * (aClass151_Sub2_3526.anInt1702 * 127780559))
			 >> aClass185_Sub1_3530.anInt9212);
	anInt3528 = 2 + ((aClass151_Sub2_3526.anInt1700 * -1466328823
			  * (aClass151_Sub2_3526.anInt1702 * 127780559))
			 >> aClass185_Sub1_3530.anInt9212);
	aByteArray3529 = new byte[anInt3525 * anInt3528];
	anInt3532 = (7 + aClass185_Sub1_3530.anInt9212
		     - aClass151_Sub2_3526.anInt1703 * -1495101509);
	anInt3527 = aClass151_Sub2_3526.anInt1701 * -1924295585 >> anInt3532;
	anInt3531 = aClass151_Sub2_3526.anInt1700 * -1466328823 >> anInt3532;
    }
    
    void method5912(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
		    int i_58_) {
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2
	    = (Class534_Sub18_Sub16_Sub2) class534_sub18_sub16;
	i += class534_sub18_sub16_sub2.anInt12123 + 1;
	i_58_ += class534_sub18_sub16_sub2.anInt12121 + 1;
	int i_59_ = i + i_58_ * anInt3525;
	int i_60_ = 0;
	int i_61_ = class534_sub18_sub16_sub2.anInt12122;
	int i_62_ = class534_sub18_sub16_sub2.anInt12125;
	int i_63_ = anInt3525 - i_62_;
	int i_64_ = 0;
	if (i_58_ <= 0) {
	    int i_65_ = 1 - i_58_;
	    i_61_ -= i_65_;
	    i_60_ += i_65_ * i_62_;
	    i_59_ += i_65_ * anInt3525;
	    i_58_ = 1;
	}
	if (i_58_ + i_61_ >= anInt3528) {
	    int i_66_ = i_58_ + i_61_ + 1 - anInt3528;
	    i_61_ -= i_66_;
	}
	if (i <= 0) {
	    int i_67_ = 1 - i;
	    i_62_ -= i_67_;
	    i_60_ += i_67_;
	    i_59_ += i_67_;
	    i_64_ += i_67_;
	    i_63_ += i_67_;
	    i = 1;
	}
	if (i + i_62_ >= anInt3525) {
	    int i_68_ = i + i_62_ + 1 - anInt3525;
	    i_62_ -= i_68_;
	    i_64_ += i_68_;
	    i_63_ += i_68_;
	}
	if (i_62_ > 0 && i_61_ > 0) {
	    method5914(aByteArray3529,
		       class534_sub18_sub16_sub2.aByteArray12120, i_60_, i_59_,
		       i_62_, i_61_, i_63_, i_64_);
	    method5907(i, i_58_, i_62_, i_61_);
	}
    }
    
    void method5913(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
		    int i_69_) {
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2
	    = (Class534_Sub18_Sub16_Sub2) class534_sub18_sub16;
	i += class534_sub18_sub16_sub2.anInt12123 + 1;
	i_69_ += class534_sub18_sub16_sub2.anInt12121 + 1;
	int i_70_ = i + i_69_ * anInt3525;
	int i_71_ = 0;
	int i_72_ = class534_sub18_sub16_sub2.anInt12122;
	int i_73_ = class534_sub18_sub16_sub2.anInt12125;
	int i_74_ = anInt3525 - i_73_;
	int i_75_ = 0;
	if (i_69_ <= 0) {
	    int i_76_ = 1 - i_69_;
	    i_72_ -= i_76_;
	    i_71_ += i_76_ * i_73_;
	    i_70_ += i_76_ * anInt3525;
	    i_69_ = 1;
	}
	if (i_69_ + i_72_ >= anInt3528) {
	    int i_77_ = i_69_ + i_72_ + 1 - anInt3528;
	    i_72_ -= i_77_;
	}
	if (i <= 0) {
	    int i_78_ = 1 - i;
	    i_73_ -= i_78_;
	    i_71_ += i_78_;
	    i_70_ += i_78_;
	    i_75_ += i_78_;
	    i_74_ += i_78_;
	    i = 1;
	}
	if (i + i_73_ >= anInt3525) {
	    int i_79_ = i + i_73_ + 1 - anInt3525;
	    i_73_ -= i_79_;
	    i_75_ += i_79_;
	    i_74_ += i_79_;
	}
	if (i_73_ > 0 && i_72_ > 0) {
	    method5911(aByteArray3529,
		       class534_sub18_sub16_sub2.aByteArray12120, i_71_, i_70_,
		       i_73_, i_72_, i_74_, i_75_);
	    method5907(i, i_69_, i_73_, i_72_);
	}
    }
    
    static final void method5914(byte[] is, byte[] is_80_, int i, int i_81_,
				 int i_82_, int i_83_, int i_84_, int i_85_) {
	int i_86_ = -(i_82_ >> 2);
	i_82_ = -(i_82_ & 0x3);
	for (int i_87_ = -i_83_; i_87_ < 0; i_87_++) {
	    for (int i_88_ = i_86_; i_88_ < 0; i_88_++) {
		is[i_81_++] -= is_80_[i++];
		is[i_81_++] -= is_80_[i++];
		is[i_81_++] -= is_80_[i++];
		is[i_81_++] -= is_80_[i++];
	    }
	    for (int i_89_ = i_82_; i_89_ < 0; i_89_++)
		is[i_81_++] -= is_80_[i++];
	    i_81_ += i_84_;
	    i += i_85_;
	}
    }
    
    void method5915(int i, int i_90_, int i_91_, int i_92_) {
	if (aClass344ArrayArray3533 != null) {
	    int i_93_ = i - 1 >> 7;
	    int i_94_ = i - 1 + i_91_ - 1 >> 7;
	    int i_95_ = i_90_ - 1 >> 7;
	    int i_96_ = i_90_ - 1 + i_92_ - 1 >> 7;
	    for (int i_97_ = i_93_; i_97_ <= i_94_; i_97_++) {
		Class344[] class344s = aClass344ArrayArray3533[i_97_];
		for (int i_98_ = i_95_; i_98_ <= i_96_; i_98_++) {
		    if (class344s[i_98_] != null)
			class344s[i_98_].aBool3563 = true;
		}
	    }
	}
    }
    
    static final boolean method5916(byte[] is, int i, int i_99_, int i_100_,
				    int i_101_, int i_102_) {
	int i_103_ = i_99_ % i_102_;
	int i_104_;
	if (i_103_ != 0)
	    i_104_ = i_102_ - i_103_;
	else
	    i_104_ = 0;
	int i_105_ = -((i_100_ + i_102_ - 1) / i_102_);
	int i_106_ = -((i_99_ + i_102_ - 1) / i_102_);
	for (int i_107_ = i_105_; i_107_ < 0; i_107_++) {
	    for (int i_108_ = i_106_; i_108_ < 0; i_108_++) {
		if (is[i] == 0)
		    return true;
		i += i_102_;
	    }
	    i -= i_104_;
	    if (is[i - 1] == 0)
		return true;
	    i += i_101_;
	}
	return false;
    }
    
    void method5917(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
		    int i_109_) {
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2
	    = (Class534_Sub18_Sub16_Sub2) class534_sub18_sub16;
	i += class534_sub18_sub16_sub2.anInt12123 + 1;
	i_109_ += class534_sub18_sub16_sub2.anInt12121 + 1;
	int i_110_ = i + i_109_ * anInt3525;
	int i_111_ = 0;
	int i_112_ = class534_sub18_sub16_sub2.anInt12122;
	int i_113_ = class534_sub18_sub16_sub2.anInt12125;
	int i_114_ = anInt3525 - i_113_;
	int i_115_ = 0;
	if (i_109_ <= 0) {
	    int i_116_ = 1 - i_109_;
	    i_112_ -= i_116_;
	    i_111_ += i_116_ * i_113_;
	    i_110_ += i_116_ * anInt3525;
	    i_109_ = 1;
	}
	if (i_109_ + i_112_ >= anInt3528) {
	    int i_117_ = i_109_ + i_112_ + 1 - anInt3528;
	    i_112_ -= i_117_;
	}
	if (i <= 0) {
	    int i_118_ = 1 - i;
	    i_113_ -= i_118_;
	    i_111_ += i_118_;
	    i_110_ += i_118_;
	    i_115_ += i_118_;
	    i_114_ += i_118_;
	    i = 1;
	}
	if (i + i_113_ >= anInt3525) {
	    int i_119_ = i + i_113_ + 1 - anInt3525;
	    i_113_ -= i_119_;
	    i_115_ += i_119_;
	    i_114_ += i_119_;
	}
	if (i_113_ > 0 && i_112_ > 0) {
	    method5911(aByteArray3529,
		       class534_sub18_sub16_sub2.aByteArray12120, i_111_,
		       i_110_, i_113_, i_112_, i_114_, i_115_);
	    method5907(i, i_109_, i_113_, i_112_);
	}
    }
    
    void method5918(Class324 class324, int i, int i_120_, int i_121_,
		    boolean[][] bools, boolean bool) {
	aClass185_Sub1_3530.method3461(false);
	float f = 1.0F / (float) (aClass185_Sub1_3530.anInt9187 * 128);
	if (bool) {
	    for (int i_122_ = 0; i_122_ < anInt3531; i_122_++) {
		int i_123_ = i_122_ << anInt3532;
		int i_124_ = i_122_ + 1 << anInt3532;
		for (int i_125_ = 0; i_125_ < anInt3527; i_125_++) {
		    if (aClass344ArrayArray3533[i_125_][i_122_] != null) {
			int i_126_ = i_125_ << anInt3532;
			int i_127_ = i_125_ + 1 << anInt3532;
		    while_37_:
			for (int i_128_ = i_126_; i_128_ < i_127_; i_128_++) {
			    if (i_128_ - i >= -i_121_
				&& i_128_ - i <= i_121_) {
				for (int i_129_ = i_123_; i_129_ < i_124_;
				     i_129_++) {
				    if (i_129_ - i_120_ >= -i_121_
					&& i_129_ - i_120_ <= i_121_
					&& (bools[i_128_ - i + i_121_]
					    [i_129_ - i_120_ + i_121_])) {
					class324.aClass433_3430
					    .method6952(f, f, 1.0F, 1.0F);
					class324.aClass433_3430
					    .aFloatArray4853[12]
					    = (float) -i_125_;
					class324.aClass433_3430
					    .aFloatArray4853[13]
					    = (float) -i_122_;
					aClass344ArrayArray3533[i_125_]
					    [i_122_].method6111(class324);
					break while_37_;
				    }
				}
			    }
			}
		    }
		}
	    }
	} else {
	    int[] is = new int[anInt3531 * anInt3527];
	    ByteBuffer bytebuffer = aClass185_Sub1_3530.aByteBuffer9266;
	    bytebuffer.clear();
	    int i_130_ = 0;
	    for (int i_131_ = 0; i_131_ < anInt3531; i_131_++) {
		int i_132_ = i_131_ << anInt3532;
		int i_133_ = i_131_ + 1 << anInt3532;
		for (int i_134_ = 0; i_134_ < anInt3527; i_134_++) {
		    Class344 class344
			= aClass344ArrayArray3533[i_134_][i_131_];
		    int i_135_ = 0;
		    if (class344 != null) {
			int i_136_ = i_134_ << anInt3532;
			int i_137_ = i_134_ + 1 << anInt3532;
			for (int i_138_ = i_132_; i_138_ < i_133_; i_138_++) {
			    if (i_138_ - i_120_ >= -i_121_
				&& i_138_ - i_120_ <= i_121_) {
				int i_139_
				    = (i_138_ * (aClass151_Sub2_3526.anInt1701
						 * -1924295585)
				       + i_136_);
				for (int i_140_ = i_136_; i_140_ < i_137_;
				     i_140_++) {
				    if (i_140_ - i >= -i_121_
					&& i_140_ - i <= i_121_
					&& (bools[i_140_ - i + i_121_]
					    [i_138_ - i_120_ + i_121_])) {
					short[] is_141_
					    = (aClass151_Sub2_3526
					       .aShortArrayArray9409[i_139_]);
					if (is_141_ != null) {
					    for (int i_142_ = 0;
						 i_142_ < is_141_.length;
						 i_142_++) {
						bytebuffer
						    .putShort(is_141_[i_142_]);
						i_135_++;
					    }
					}
				    }
				    i_139_++;
				}
			    }
			}
		    }
		    is[i_130_] = i_135_;
		    i_130_++;
		}
	    }
	    if (bytebuffer.position() != 0) {
		int i_143_ = bytebuffer.position();
		Interface39 interface39
		    = aClass185_Sub1_3530.method14725(i_143_ / 2);
		interface39.method235(0, i_143_,
				      aClass185_Sub1_3530.aLong9139);
		int i_144_ = 0;
		i_130_ = 0;
		for (int i_145_ = 0; i_145_ < anInt3531; i_145_++) {
		    for (int i_146_ = 0; i_146_ < anInt3527; i_146_++) {
			if (is[i_130_] != 0) {
			    class324.aClass433_3430.method6952(f, f, 1.0F,
							       1.0F);
			    class324.aClass433_3430.aFloatArray4853[12]
				= (float) -i_146_;
			    class324.aClass433_3430.aFloatArray4853[13]
				= (float) -i_145_;
			    aClass344ArrayArray3533[i_146_][i_145_].method6110
				(class324, interface39, i_144_,
				 is[i_130_] / 3);
			    i_144_ += is[i_130_];
			}
			i_130_++;
		    }
		}
	    }
	}
	aClass185_Sub1_3530.method3461(true);
    }
    
    void method5919(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
		    int i_147_) {
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2
	    = (Class534_Sub18_Sub16_Sub2) class534_sub18_sub16;
	i += class534_sub18_sub16_sub2.anInt12123 + 1;
	i_147_ += class534_sub18_sub16_sub2.anInt12121 + 1;
	int i_148_ = i + i_147_ * anInt3525;
	int i_149_ = 0;
	int i_150_ = class534_sub18_sub16_sub2.anInt12122;
	int i_151_ = class534_sub18_sub16_sub2.anInt12125;
	int i_152_ = anInt3525 - i_151_;
	int i_153_ = 0;
	if (i_147_ <= 0) {
	    int i_154_ = 1 - i_147_;
	    i_150_ -= i_154_;
	    i_149_ += i_154_ * i_151_;
	    i_148_ += i_154_ * anInt3525;
	    i_147_ = 1;
	}
	if (i_147_ + i_150_ >= anInt3528) {
	    int i_155_ = i_147_ + i_150_ + 1 - anInt3528;
	    i_150_ -= i_155_;
	}
	if (i <= 0) {
	    int i_156_ = 1 - i;
	    i_151_ -= i_156_;
	    i_149_ += i_156_;
	    i_148_ += i_156_;
	    i_153_ += i_156_;
	    i_152_ += i_156_;
	    i = 1;
	}
	if (i + i_151_ >= anInt3525) {
	    int i_157_ = i + i_151_ + 1 - anInt3525;
	    i_151_ -= i_157_;
	    i_153_ += i_157_;
	    i_152_ += i_157_;
	}
	if (i_151_ > 0 && i_150_ > 0) {
	    method5911(aByteArray3529,
		       class534_sub18_sub16_sub2.aByteArray12120, i_149_,
		       i_148_, i_151_, i_150_, i_152_, i_153_);
	    method5907(i, i_147_, i_151_, i_150_);
	}
    }
    
    void method5920(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
		    int i_158_) {
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2
	    = (Class534_Sub18_Sub16_Sub2) class534_sub18_sub16;
	i += class534_sub18_sub16_sub2.anInt12123 + 1;
	i_158_ += class534_sub18_sub16_sub2.anInt12121 + 1;
	int i_159_ = i + i_158_ * anInt3525;
	int i_160_ = 0;
	int i_161_ = class534_sub18_sub16_sub2.anInt12122;
	int i_162_ = class534_sub18_sub16_sub2.anInt12125;
	int i_163_ = anInt3525 - i_162_;
	int i_164_ = 0;
	if (i_158_ <= 0) {
	    int i_165_ = 1 - i_158_;
	    i_161_ -= i_165_;
	    i_160_ += i_165_ * i_162_;
	    i_159_ += i_165_ * anInt3525;
	    i_158_ = 1;
	}
	if (i_158_ + i_161_ >= anInt3528) {
	    int i_166_ = i_158_ + i_161_ + 1 - anInt3528;
	    i_161_ -= i_166_;
	}
	if (i <= 0) {
	    int i_167_ = 1 - i;
	    i_162_ -= i_167_;
	    i_160_ += i_167_;
	    i_159_ += i_167_;
	    i_164_ += i_167_;
	    i_163_ += i_167_;
	    i = 1;
	}
	if (i + i_162_ >= anInt3525) {
	    int i_168_ = i + i_162_ + 1 - anInt3525;
	    i_162_ -= i_168_;
	    i_164_ += i_168_;
	    i_163_ += i_168_;
	}
	if (i_162_ > 0 && i_161_ > 0) {
	    method5911(aByteArray3529,
		       class534_sub18_sub16_sub2.aByteArray12120, i_160_,
		       i_159_, i_162_, i_161_, i_163_, i_164_);
	    method5907(i, i_158_, i_162_, i_161_);
	}
    }
    
    void method5921(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
		    int i_169_) {
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2
	    = (Class534_Sub18_Sub16_Sub2) class534_sub18_sub16;
	i += class534_sub18_sub16_sub2.anInt12123 + 1;
	i_169_ += class534_sub18_sub16_sub2.anInt12121 + 1;
	int i_170_ = i + i_169_ * anInt3525;
	int i_171_ = 0;
	int i_172_ = class534_sub18_sub16_sub2.anInt12122;
	int i_173_ = class534_sub18_sub16_sub2.anInt12125;
	int i_174_ = anInt3525 - i_173_;
	int i_175_ = 0;
	if (i_169_ <= 0) {
	    int i_176_ = 1 - i_169_;
	    i_172_ -= i_176_;
	    i_171_ += i_176_ * i_173_;
	    i_170_ += i_176_ * anInt3525;
	    i_169_ = 1;
	}
	if (i_169_ + i_172_ >= anInt3528) {
	    int i_177_ = i_169_ + i_172_ + 1 - anInt3528;
	    i_172_ -= i_177_;
	}
	if (i <= 0) {
	    int i_178_ = 1 - i;
	    i_173_ -= i_178_;
	    i_171_ += i_178_;
	    i_170_ += i_178_;
	    i_175_ += i_178_;
	    i_174_ += i_178_;
	    i = 1;
	}
	if (i + i_173_ >= anInt3525) {
	    int i_179_ = i + i_173_ + 1 - anInt3525;
	    i_173_ -= i_179_;
	    i_175_ += i_179_;
	    i_174_ += i_179_;
	}
	if (i_173_ > 0 && i_172_ > 0) {
	    method5914(aByteArray3529,
		       class534_sub18_sub16_sub2.aByteArray12120, i_171_,
		       i_170_, i_173_, i_172_, i_174_, i_175_);
	    method5907(i, i_169_, i_173_, i_172_);
	}
    }
    
    boolean method5922(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
		       int i_180_) {
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2
	    = (Class534_Sub18_Sub16_Sub2) class534_sub18_sub16;
	i += class534_sub18_sub16_sub2.anInt12123 + 1;
	i_180_ += class534_sub18_sub16_sub2.anInt12121 + 1;
	int i_181_ = i + i_180_ * anInt3525;
	int i_182_ = class534_sub18_sub16_sub2.anInt12122;
	int i_183_ = class534_sub18_sub16_sub2.anInt12125;
	int i_184_ = anInt3525 - i_183_;
	if (i_180_ <= 0) {
	    int i_185_ = 1 - i_180_;
	    i_182_ -= i_185_;
	    i_181_ += i_185_ * anInt3525;
	    i_180_ = 1;
	}
	if (i_180_ + i_182_ >= anInt3528) {
	    int i_186_ = i_180_ + i_182_ + 1 - anInt3528;
	    i_182_ -= i_186_;
	}
	if (i <= 0) {
	    int i_187_ = 1 - i;
	    i_183_ -= i_187_;
	    i_181_ += i_187_;
	    i_184_ += i_187_;
	    i = 1;
	}
	if (i + i_183_ >= anInt3525) {
	    int i_188_ = i + i_183_ + 1 - anInt3525;
	    i_183_ -= i_188_;
	    i_184_ += i_188_;
	}
	if (i_183_ <= 0 || i_182_ <= 0)
	    return false;
	int i_189_ = 8;
	i_184_ += (i_189_ - 1) * anInt3525;
	return method5916(aByteArray3529, i_181_, i_183_, i_182_, i_184_,
			  i_189_);
    }
    
    boolean method5923(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
		       int i_190_) {
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2
	    = (Class534_Sub18_Sub16_Sub2) class534_sub18_sub16;
	i += class534_sub18_sub16_sub2.anInt12123 + 1;
	i_190_ += class534_sub18_sub16_sub2.anInt12121 + 1;
	int i_191_ = i + i_190_ * anInt3525;
	int i_192_ = class534_sub18_sub16_sub2.anInt12122;
	int i_193_ = class534_sub18_sub16_sub2.anInt12125;
	int i_194_ = anInt3525 - i_193_;
	if (i_190_ <= 0) {
	    int i_195_ = 1 - i_190_;
	    i_192_ -= i_195_;
	    i_191_ += i_195_ * anInt3525;
	    i_190_ = 1;
	}
	if (i_190_ + i_192_ >= anInt3528) {
	    int i_196_ = i_190_ + i_192_ + 1 - anInt3528;
	    i_192_ -= i_196_;
	}
	if (i <= 0) {
	    int i_197_ = 1 - i;
	    i_193_ -= i_197_;
	    i_191_ += i_197_;
	    i_194_ += i_197_;
	    i = 1;
	}
	if (i + i_193_ >= anInt3525) {
	    int i_198_ = i + i_193_ + 1 - anInt3525;
	    i_193_ -= i_198_;
	    i_194_ += i_198_;
	}
	if (i_193_ <= 0 || i_192_ <= 0)
	    return false;
	int i_199_ = 8;
	i_194_ += (i_199_ - 1) * anInt3525;
	return method5916(aByteArray3529, i_191_, i_193_, i_192_, i_194_,
			  i_199_);
    }
    
    boolean method5924(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
		       int i_200_) {
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2
	    = (Class534_Sub18_Sub16_Sub2) class534_sub18_sub16;
	i += class534_sub18_sub16_sub2.anInt12123 + 1;
	i_200_ += class534_sub18_sub16_sub2.anInt12121 + 1;
	int i_201_ = i + i_200_ * anInt3525;
	int i_202_ = class534_sub18_sub16_sub2.anInt12122;
	int i_203_ = class534_sub18_sub16_sub2.anInt12125;
	int i_204_ = anInt3525 - i_203_;
	if (i_200_ <= 0) {
	    int i_205_ = 1 - i_200_;
	    i_202_ -= i_205_;
	    i_201_ += i_205_ * anInt3525;
	    i_200_ = 1;
	}
	if (i_200_ + i_202_ >= anInt3528) {
	    int i_206_ = i_200_ + i_202_ + 1 - anInt3528;
	    i_202_ -= i_206_;
	}
	if (i <= 0) {
	    int i_207_ = 1 - i;
	    i_203_ -= i_207_;
	    i_201_ += i_207_;
	    i_204_ += i_207_;
	    i = 1;
	}
	if (i + i_203_ >= anInt3525) {
	    int i_208_ = i + i_203_ + 1 - anInt3525;
	    i_203_ -= i_208_;
	    i_204_ += i_208_;
	}
	if (i_203_ <= 0 || i_202_ <= 0)
	    return false;
	int i_209_ = 8;
	i_204_ += (i_209_ - 1) * anInt3525;
	return method5916(aByteArray3529, i_201_, i_203_, i_202_, i_204_,
			  i_209_);
    }
    
    static final void method5925(byte[] is, byte[] is_210_, int i, int i_211_,
				 int i_212_, int i_213_, int i_214_,
				 int i_215_) {
	int i_216_ = -(i_212_ >> 2);
	i_212_ = -(i_212_ & 0x3);
	for (int i_217_ = -i_213_; i_217_ < 0; i_217_++) {
	    for (int i_218_ = i_216_; i_218_ < 0; i_218_++) {
		is[i_211_++] += is_210_[i++];
		is[i_211_++] += is_210_[i++];
		is[i_211_++] += is_210_[i++];
		is[i_211_++] += is_210_[i++];
	    }
	    for (int i_219_ = i_212_; i_219_ < 0; i_219_++)
		is[i_211_++] += is_210_[i++];
	    i_211_ += i_214_;
	    i += i_215_;
	}
    }
    
    void method5926(int i, int i_220_, int i_221_, int i_222_) {
	if (aClass344ArrayArray3533 != null) {
	    int i_223_ = i - 1 >> 7;
	    int i_224_ = i - 1 + i_221_ - 1 >> 7;
	    int i_225_ = i_220_ - 1 >> 7;
	    int i_226_ = i_220_ - 1 + i_222_ - 1 >> 7;
	    for (int i_227_ = i_223_; i_227_ <= i_224_; i_227_++) {
		Class344[] class344s = aClass344ArrayArray3533[i_227_];
		for (int i_228_ = i_225_; i_228_ <= i_226_; i_228_++) {
		    if (class344s[i_228_] != null)
			class344s[i_228_].aBool3563 = true;
		}
	    }
	}
    }
    
    void method5927(int i, int i_229_, int i_230_, int i_231_) {
	if (aClass344ArrayArray3533 != null) {
	    int i_232_ = i - 1 >> 7;
	    int i_233_ = i - 1 + i_230_ - 1 >> 7;
	    int i_234_ = i_229_ - 1 >> 7;
	    int i_235_ = i_229_ - 1 + i_231_ - 1 >> 7;
	    for (int i_236_ = i_232_; i_236_ <= i_233_; i_236_++) {
		Class344[] class344s = aClass344ArrayArray3533[i_236_];
		for (int i_237_ = i_234_; i_237_ <= i_235_; i_237_++) {
		    if (class344s[i_237_] != null)
			class344s[i_237_].aBool3563 = true;
		}
	    }
	}
    }
    
    void method5928(int i, int i_238_, int i_239_, int i_240_) {
	if (aClass344ArrayArray3533 != null) {
	    int i_241_ = i - 1 >> 7;
	    int i_242_ = i - 1 + i_239_ - 1 >> 7;
	    int i_243_ = i_238_ - 1 >> 7;
	    int i_244_ = i_238_ - 1 + i_240_ - 1 >> 7;
	    for (int i_245_ = i_241_; i_245_ <= i_242_; i_245_++) {
		Class344[] class344s = aClass344ArrayArray3533[i_245_];
		for (int i_246_ = i_243_; i_246_ <= i_244_; i_246_++) {
		    if (class344s[i_246_] != null)
			class344s[i_246_].aBool3563 = true;
		}
	    }
	}
    }
    
    static final void method5929(byte[] is, byte[] is_247_, int i, int i_248_,
				 int i_249_, int i_250_, int i_251_,
				 int i_252_) {
	int i_253_ = -(i_249_ >> 2);
	i_249_ = -(i_249_ & 0x3);
	for (int i_254_ = -i_250_; i_254_ < 0; i_254_++) {
	    for (int i_255_ = i_253_; i_255_ < 0; i_255_++) {
		is[i_248_++] += is_247_[i++];
		is[i_248_++] += is_247_[i++];
		is[i_248_++] += is_247_[i++];
		is[i_248_++] += is_247_[i++];
	    }
	    for (int i_256_ = i_249_; i_256_ < 0; i_256_++)
		is[i_248_++] += is_247_[i++];
	    i_248_ += i_251_;
	    i += i_252_;
	}
    }
    
    void method5930(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
		    int i_257_) {
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2
	    = (Class534_Sub18_Sub16_Sub2) class534_sub18_sub16;
	i += class534_sub18_sub16_sub2.anInt12123 + 1;
	i_257_ += class534_sub18_sub16_sub2.anInt12121 + 1;
	int i_258_ = i + i_257_ * anInt3525;
	int i_259_ = 0;
	int i_260_ = class534_sub18_sub16_sub2.anInt12122;
	int i_261_ = class534_sub18_sub16_sub2.anInt12125;
	int i_262_ = anInt3525 - i_261_;
	int i_263_ = 0;
	if (i_257_ <= 0) {
	    int i_264_ = 1 - i_257_;
	    i_260_ -= i_264_;
	    i_259_ += i_264_ * i_261_;
	    i_258_ += i_264_ * anInt3525;
	    i_257_ = 1;
	}
	if (i_257_ + i_260_ >= anInt3528) {
	    int i_265_ = i_257_ + i_260_ + 1 - anInt3528;
	    i_260_ -= i_265_;
	}
	if (i <= 0) {
	    int i_266_ = 1 - i;
	    i_261_ -= i_266_;
	    i_259_ += i_266_;
	    i_258_ += i_266_;
	    i_263_ += i_266_;
	    i_262_ += i_266_;
	    i = 1;
	}
	if (i + i_261_ >= anInt3525) {
	    int i_267_ = i + i_261_ + 1 - anInt3525;
	    i_261_ -= i_267_;
	    i_263_ += i_267_;
	    i_262_ += i_267_;
	}
	if (i_261_ > 0 && i_260_ > 0) {
	    method5914(aByteArray3529,
		       class534_sub18_sub16_sub2.aByteArray12120, i_259_,
		       i_258_, i_261_, i_260_, i_262_, i_263_);
	    method5907(i, i_257_, i_261_, i_260_);
	}
    }
    
    static final void method5931(byte[] is, byte[] is_268_, int i, int i_269_,
				 int i_270_, int i_271_, int i_272_,
				 int i_273_) {
	int i_274_ = -(i_270_ >> 2);
	i_270_ = -(i_270_ & 0x3);
	for (int i_275_ = -i_271_; i_275_ < 0; i_275_++) {
	    for (int i_276_ = i_274_; i_276_ < 0; i_276_++) {
		is[i_269_++] += is_268_[i++];
		is[i_269_++] += is_268_[i++];
		is[i_269_++] += is_268_[i++];
		is[i_269_++] += is_268_[i++];
	    }
	    for (int i_277_ = i_270_; i_277_ < 0; i_277_++)
		is[i_269_++] += is_268_[i++];
	    i_269_ += i_272_;
	    i += i_273_;
	}
    }
    
    static final void method5932(byte[] is, byte[] is_278_, int i, int i_279_,
				 int i_280_, int i_281_, int i_282_,
				 int i_283_) {
	int i_284_ = -(i_280_ >> 2);
	i_280_ = -(i_280_ & 0x3);
	for (int i_285_ = -i_281_; i_285_ < 0; i_285_++) {
	    for (int i_286_ = i_284_; i_286_ < 0; i_286_++) {
		is[i_279_++] -= is_278_[i++];
		is[i_279_++] -= is_278_[i++];
		is[i_279_++] -= is_278_[i++];
		is[i_279_++] -= is_278_[i++];
	    }
	    for (int i_287_ = i_280_; i_287_ < 0; i_287_++)
		is[i_279_++] -= is_278_[i++];
	    i_279_ += i_282_;
	    i += i_283_;
	}
    }
}
