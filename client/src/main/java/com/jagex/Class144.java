/* Class144 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class144
{
    byte[] aByteArray1654;
    Class151_Sub1 aClass151_Sub1_1655;
    int anInt1656;
    int anInt1657;
    int anInt1658;
    int anInt1659;
    Class185_Sub3 aClass185_Sub3_1660;
    int anInt1661;
    Class142[][] aClass142ArrayArray1662;
    
    void method2425(int i, int i_0_, int i_1_, int i_2_) {
	if (aClass142ArrayArray1662 != null) {
	    int i_3_ = i - 1 >> 7;
	    int i_4_ = i - 1 + i_1_ - 1 >> 7;
	    int i_5_ = i_0_ - 1 >> 7;
	    int i_6_ = i_0_ - 1 + i_2_ - 1 >> 7;
	    for (int i_7_ = i_3_; i_7_ <= i_4_; i_7_++) {
		Class142[] class142s = aClass142ArrayArray1662[i_7_];
		for (int i_8_ = i_5_; i_8_ <= i_6_; i_8_++)
		    class142s[i_8_].aBool1641 = true;
	    }
	}
    }
    
    void method2426(int i, int i_9_, int i_10_, boolean[][] bools,
		    boolean bool) {
	aClass185_Sub3_1660.method15432(false);
	aClass185_Sub3_1660.method15193(false);
	aClass185_Sub3_1660.method15227(-2);
	aClass185_Sub3_1660.method15214(1);
	aClass185_Sub3_1660.method15246(1);
	float f = 1.0F / (float) (aClass185_Sub3_1660.anInt9638 * 128);
	if (bool) {
	    for (int i_11_ = 0; i_11_ < anInt1656; i_11_++) {
		int i_12_ = i_11_ << anInt1661;
		int i_13_ = i_11_ + 1 << anInt1661;
		for (int i_14_ = 0; i_14_ < anInt1659; i_14_++) {
		    int i_15_ = i_14_ << anInt1661;
		    int i_16_ = i_14_ + 1 << anInt1661;
		while_132_:
		    for (int i_17_ = i_15_; i_17_ < i_16_; i_17_++) {
			if (i_17_ - i >= -i_10_ && i_17_ - i <= i_10_) {
			    for (int i_18_ = i_12_; i_18_ < i_13_; i_18_++) {
				if (i_18_ - i_9_ >= -i_10_
				    && i_18_ - i_9_ <= i_10_
				    && (bools[i_17_ - i + i_10_]
					[i_18_ - i_9_ + i_10_])) {
				    OpenGL.glMatrixMode(5890);
				    OpenGL.glLoadIdentity();
				    OpenGL.glScalef(f, f, 1.0F);
				    OpenGL.glTranslatef((float) -i_14_ / f,
							(float) -i_11_ / f,
							1.0F);
				    OpenGL.glMatrixMode(5888);
				    aClass142ArrayArray1662[i_14_][i_11_]
					.method2405();
				    break while_132_;
				}
			    }
			}
		    }
		}
	    }
	} else {
	    for (int i_19_ = 0; i_19_ < anInt1656; i_19_++) {
		int i_20_ = i_19_ << anInt1661;
		int i_21_ = i_19_ + 1 << anInt1661;
		for (int i_22_ = 0; i_22_ < anInt1659; i_22_++) {
		    int i_23_ = 0;
		    int i_24_ = i_22_ << anInt1661;
		    int i_25_ = i_22_ + 1 << anInt1661;
		    Class534_Sub40_Sub2 class534_sub40_sub2
			= aClass185_Sub3_1660.aClass534_Sub40_Sub2_9716;
		    class534_sub40_sub2.anInt10811 = 0;
		    for (int i_26_ = i_20_; i_26_ < i_21_; i_26_++) {
			if (i_26_ - i_9_ >= -i_10_ && i_26_ - i_9_ <= i_10_) {
			    int i_27_ = (i_26_ * (aClass151_Sub1_1655.anInt1701
						  * -1924295585)
					 + i_24_);
			    for (int i_28_ = i_24_; i_28_ < i_25_; i_28_++) {
				if (i_28_ - i >= -i_10_ && i_28_ - i <= i_10_
				    && (bools[i_28_ - i + i_10_]
					[i_26_ - i_9_ + i_10_])) {
				    short[] is
					= (aClass151_Sub1_1655
					   .aShortArrayArray9304[i_27_]);
				    if (is != null) {
					if (aClass185_Sub3_1660.aBool9566) {
					    for (int i_29_ = 0;
						 i_29_ < is.length; i_29_++) {
						class534_sub40_sub2.method16507
						    (is[i_29_] & 0xffff,
						     2133289007);
						i_23_++;
					    }
					} else {
					    for (int i_30_ = 0;
						 i_30_ < is.length; i_30_++) {
						class534_sub40_sub2.method16721
						    (is[i_30_] & 0xffff,
						     1203548667);
						i_23_++;
					    }
					}
				    }
				}
				i_27_++;
			    }
			}
		    }
		    if (i_23_ > 0) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glScalef(f, f, 1.0F);
			OpenGL.glTranslatef((float) -i_22_ / f,
					    (float) -i_19_ / f, 1.0F);
			OpenGL.glMatrixMode(5888);
			aClass142ArrayArray1662[i_22_][i_19_].method2406
			    (class534_sub40_sub2.aByteArray10810, i_23_);
		    }
		}
	    }
	}
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    Class144(Class185_Sub3 class185_sub3, Class151_Sub1 class151_sub1) {
	aClass185_Sub3_1660 = class185_sub3;
	aClass151_Sub1_1655 = class151_sub1;
	anInt1658 = 2 + ((aClass151_Sub1_1655.anInt1701 * -1924295585
			  * (aClass151_Sub1_1655.anInt1702 * 127780559))
			 >> aClass185_Sub3_1660.anInt9574);
	anInt1657 = 2 + ((aClass151_Sub1_1655.anInt1700 * -1466328823
			  * (aClass151_Sub1_1655.anInt1702 * 127780559))
			 >> aClass185_Sub3_1660.anInt9574);
	aByteArray1654 = new byte[anInt1658 * anInt1657];
	anInt1661 = (7 + aClass185_Sub3_1660.anInt9574
		     - aClass151_Sub1_1655.anInt1703 * -1495101509);
	anInt1659 = aClass151_Sub1_1655.anInt1701 * -1924295585 >> anInt1661;
	anInt1656 = aClass151_Sub1_1655.anInt1700 * -1466328823 >> anInt1661;
    }
    
    void method2427(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
		    int i_31_) {
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1
	    = (Class534_Sub18_Sub16_Sub1) class534_sub18_sub16;
	i += class534_sub18_sub16_sub1.anInt12071 + 1;
	i_31_ += class534_sub18_sub16_sub1.anInt12070 + 1;
	int i_32_ = i + i_31_ * anInt1658;
	int i_33_ = 0;
	int i_34_ = class534_sub18_sub16_sub1.anInt12072;
	int i_35_ = class534_sub18_sub16_sub1.anInt12068;
	int i_36_ = anInt1658 - i_35_;
	int i_37_ = 0;
	if (i_31_ <= 0) {
	    int i_38_ = 1 - i_31_;
	    i_34_ -= i_38_;
	    i_33_ += i_38_ * i_35_;
	    i_32_ += i_38_ * anInt1658;
	    i_31_ = 1;
	}
	if (i_31_ + i_34_ >= anInt1657) {
	    int i_39_ = i_31_ + i_34_ + 1 - anInt1657;
	    i_34_ -= i_39_;
	}
	if (i <= 0) {
	    int i_40_ = 1 - i;
	    i_35_ -= i_40_;
	    i_33_ += i_40_;
	    i_32_ += i_40_;
	    i_37_ += i_40_;
	    i_36_ += i_40_;
	    i = 1;
	}
	if (i + i_35_ >= anInt1658) {
	    int i_41_ = i + i_35_ + 1 - anInt1658;
	    i_35_ -= i_41_;
	    i_37_ += i_41_;
	    i_36_ += i_41_;
	}
	if (i_35_ > 0 && i_34_ > 0) {
	    method2431(aByteArray1654,
		       class534_sub18_sub16_sub1.aByteArray12073, i_33_, i_32_,
		       i_35_, i_34_, i_36_, i_37_);
	    method2440(i, i_31_, i_35_, i_34_);
	}
    }
    
    void method2428(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
		    int i_42_) {
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1
	    = (Class534_Sub18_Sub16_Sub1) class534_sub18_sub16;
	i += class534_sub18_sub16_sub1.anInt12071 + 1;
	i_42_ += class534_sub18_sub16_sub1.anInt12070 + 1;
	int i_43_ = i + i_42_ * anInt1658;
	int i_44_ = 0;
	int i_45_ = class534_sub18_sub16_sub1.anInt12072;
	int i_46_ = class534_sub18_sub16_sub1.anInt12068;
	int i_47_ = anInt1658 - i_46_;
	int i_48_ = 0;
	if (i_42_ <= 0) {
	    int i_49_ = 1 - i_42_;
	    i_45_ -= i_49_;
	    i_44_ += i_49_ * i_46_;
	    i_43_ += i_49_ * anInt1658;
	    i_42_ = 1;
	}
	if (i_42_ + i_45_ >= anInt1657) {
	    int i_50_ = i_42_ + i_45_ + 1 - anInt1657;
	    i_45_ -= i_50_;
	}
	if (i <= 0) {
	    int i_51_ = 1 - i;
	    i_46_ -= i_51_;
	    i_44_ += i_51_;
	    i_43_ += i_51_;
	    i_48_ += i_51_;
	    i_47_ += i_51_;
	    i = 1;
	}
	if (i + i_46_ >= anInt1658) {
	    int i_52_ = i + i_46_ + 1 - anInt1658;
	    i_46_ -= i_52_;
	    i_48_ += i_52_;
	    i_47_ += i_52_;
	}
	if (i_46_ > 0 && i_45_ > 0) {
	    method2432(aByteArray1654,
		       class534_sub18_sub16_sub1.aByteArray12073, i_44_, i_43_,
		       i_46_, i_45_, i_47_, i_48_);
	    method2440(i, i_42_, i_46_, i_45_);
	}
    }
    
    boolean method2429(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
		       int i_53_) {
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1
	    = (Class534_Sub18_Sub16_Sub1) class534_sub18_sub16;
	i += class534_sub18_sub16_sub1.anInt12071 + 1;
	i_53_ += class534_sub18_sub16_sub1.anInt12070 + 1;
	int i_54_ = i + i_53_ * anInt1658;
	int i_55_ = class534_sub18_sub16_sub1.anInt12072;
	int i_56_ = class534_sub18_sub16_sub1.anInt12068;
	int i_57_ = anInt1658 - i_56_;
	if (i_53_ <= 0) {
	    int i_58_ = 1 - i_53_;
	    i_55_ -= i_58_;
	    i_54_ += i_58_ * anInt1658;
	    i_53_ = 1;
	}
	if (i_53_ + i_55_ >= anInt1657) {
	    int i_59_ = i_53_ + i_55_ + 1 - anInt1657;
	    i_55_ -= i_59_;
	}
	if (i <= 0) {
	    int i_60_ = 1 - i;
	    i_56_ -= i_60_;
	    i_54_ += i_60_;
	    i_57_ += i_60_;
	    i = 1;
	}
	if (i + i_56_ >= anInt1658) {
	    int i_61_ = i + i_56_ + 1 - anInt1658;
	    i_56_ -= i_61_;
	    i_57_ += i_61_;
	}
	if (i_56_ <= 0 || i_55_ <= 0)
	    return false;
	int i_62_ = 8;
	i_57_ += (i_62_ - 1) * anInt1658;
	return method2435(aByteArray1654, i_54_, i_56_, i_55_, i_57_, i_62_);
    }
    
    void method2430() {
	aClass142ArrayArray1662 = new Class142[anInt1659][anInt1656];
	for (int i = 0; i < anInt1656; i++) {
	    for (int i_63_ = 0; i_63_ < anInt1659; i_63_++)
		aClass142ArrayArray1662[i_63_][i]
		    = new Class142(aClass185_Sub3_1660, this,
				   aClass151_Sub1_1655, i_63_, i, anInt1661,
				   i_63_ * 128 + 1, i * 128 + 1);
	}
    }
    
    static final void method2431(byte[] is, byte[] is_64_, int i, int i_65_,
				 int i_66_, int i_67_, int i_68_, int i_69_) {
	int i_70_ = -(i_66_ >> 2);
	i_66_ = -(i_66_ & 0x3);
	for (int i_71_ = -i_67_; i_71_ < 0; i_71_++) {
	    for (int i_72_ = i_70_; i_72_ < 0; i_72_++) {
		is[i_65_++] += is_64_[i++];
		is[i_65_++] += is_64_[i++];
		is[i_65_++] += is_64_[i++];
		is[i_65_++] += is_64_[i++];
	    }
	    for (int i_73_ = i_66_; i_73_ < 0; i_73_++)
		is[i_65_++] += is_64_[i++];
	    i_65_ += i_68_;
	    i += i_69_;
	}
    }
    
    static final void method2432(byte[] is, byte[] is_74_, int i, int i_75_,
				 int i_76_, int i_77_, int i_78_, int i_79_) {
	int i_80_ = -(i_76_ >> 2);
	i_76_ = -(i_76_ & 0x3);
	for (int i_81_ = -i_77_; i_81_ < 0; i_81_++) {
	    for (int i_82_ = i_80_; i_82_ < 0; i_82_++) {
		is[i_75_++] -= is_74_[i++];
		is[i_75_++] -= is_74_[i++];
		is[i_75_++] -= is_74_[i++];
		is[i_75_++] -= is_74_[i++];
	    }
	    for (int i_83_ = i_76_; i_83_ < 0; i_83_++)
		is[i_75_++] -= is_74_[i++];
	    i_75_ += i_78_;
	    i += i_79_;
	}
    }
    
    void method2433() {
	aClass142ArrayArray1662 = new Class142[anInt1659][anInt1656];
	for (int i = 0; i < anInt1656; i++) {
	    for (int i_84_ = 0; i_84_ < anInt1659; i_84_++)
		aClass142ArrayArray1662[i_84_][i]
		    = new Class142(aClass185_Sub3_1660, this,
				   aClass151_Sub1_1655, i_84_, i, anInt1661,
				   i_84_ * 128 + 1, i * 128 + 1);
	}
    }
    
    void method2434() {
	aClass142ArrayArray1662 = new Class142[anInt1659][anInt1656];
	for (int i = 0; i < anInt1656; i++) {
	    for (int i_85_ = 0; i_85_ < anInt1659; i_85_++)
		aClass142ArrayArray1662[i_85_][i]
		    = new Class142(aClass185_Sub3_1660, this,
				   aClass151_Sub1_1655, i_85_, i, anInt1661,
				   i_85_ * 128 + 1, i * 128 + 1);
	}
    }
    
    static final boolean method2435(byte[] is, int i, int i_86_, int i_87_,
				    int i_88_, int i_89_) {
	int i_90_ = i_86_ % i_89_;
	int i_91_;
	if (i_90_ != 0)
	    i_91_ = i_89_ - i_90_;
	else
	    i_91_ = 0;
	int i_92_ = -((i_87_ + i_89_ - 1) / i_89_);
	int i_93_ = -((i_86_ + i_89_ - 1) / i_89_);
	for (int i_94_ = i_92_; i_94_ < 0; i_94_++) {
	    for (int i_95_ = i_93_; i_95_ < 0; i_95_++) {
		if (is[i] == 0)
		    return true;
		i += i_89_;
	    }
	    i -= i_91_;
	    if (is[i - 1] == 0)
		return true;
	    i += i_88_;
	}
	return false;
    }
    
    void method2436() {
	aClass142ArrayArray1662 = new Class142[anInt1659][anInt1656];
	for (int i = 0; i < anInt1656; i++) {
	    for (int i_96_ = 0; i_96_ < anInt1659; i_96_++)
		aClass142ArrayArray1662[i_96_][i]
		    = new Class142(aClass185_Sub3_1660, this,
				   aClass151_Sub1_1655, i_96_, i, anInt1661,
				   i_96_ * 128 + 1, i * 128 + 1);
	}
    }
    
    void method2437(int i, int i_97_, int i_98_, boolean[][] bools,
		    boolean bool) {
	aClass185_Sub3_1660.method15432(false);
	aClass185_Sub3_1660.method15193(false);
	aClass185_Sub3_1660.method15227(-2);
	aClass185_Sub3_1660.method15214(1);
	aClass185_Sub3_1660.method15246(1);
	float f = 1.0F / (float) (aClass185_Sub3_1660.anInt9638 * 128);
	if (bool) {
	    for (int i_99_ = 0; i_99_ < anInt1656; i_99_++) {
		int i_100_ = i_99_ << anInt1661;
		int i_101_ = i_99_ + 1 << anInt1661;
		for (int i_102_ = 0; i_102_ < anInt1659; i_102_++) {
		    int i_103_ = i_102_ << anInt1661;
		    int i_104_ = i_102_ + 1 << anInt1661;
		while_133_:
		    for (int i_105_ = i_103_; i_105_ < i_104_; i_105_++) {
			if (i_105_ - i >= -i_98_ && i_105_ - i <= i_98_) {
			    for (int i_106_ = i_100_; i_106_ < i_101_;
				 i_106_++) {
				if (i_106_ - i_97_ >= -i_98_
				    && i_106_ - i_97_ <= i_98_
				    && (bools[i_105_ - i + i_98_]
					[i_106_ - i_97_ + i_98_])) {
				    OpenGL.glMatrixMode(5890);
				    OpenGL.glLoadIdentity();
				    OpenGL.glScalef(f, f, 1.0F);
				    OpenGL.glTranslatef((float) -i_102_ / f,
							(float) -i_99_ / f,
							1.0F);
				    OpenGL.glMatrixMode(5888);
				    aClass142ArrayArray1662[i_102_][i_99_]
					.method2405();
				    break while_133_;
				}
			    }
			}
		    }
		}
	    }
	} else {
	    for (int i_107_ = 0; i_107_ < anInt1656; i_107_++) {
		int i_108_ = i_107_ << anInt1661;
		int i_109_ = i_107_ + 1 << anInt1661;
		for (int i_110_ = 0; i_110_ < anInt1659; i_110_++) {
		    int i_111_ = 0;
		    int i_112_ = i_110_ << anInt1661;
		    int i_113_ = i_110_ + 1 << anInt1661;
		    Class534_Sub40_Sub2 class534_sub40_sub2
			= aClass185_Sub3_1660.aClass534_Sub40_Sub2_9716;
		    class534_sub40_sub2.anInt10811 = 0;
		    for (int i_114_ = i_108_; i_114_ < i_109_; i_114_++) {
			if (i_114_ - i_97_ >= -i_98_
			    && i_114_ - i_97_ <= i_98_) {
			    int i_115_
				= (i_114_ * (aClass151_Sub1_1655.anInt1701
					     * -1924295585)
				   + i_112_);
			    for (int i_116_ = i_112_; i_116_ < i_113_;
				 i_116_++) {
				if (i_116_ - i >= -i_98_ && i_116_ - i <= i_98_
				    && (bools[i_116_ - i + i_98_]
					[i_114_ - i_97_ + i_98_])) {
				    short[] is
					= (aClass151_Sub1_1655
					   .aShortArrayArray9304[i_115_]);
				    if (is != null) {
					if (aClass185_Sub3_1660.aBool9566) {
					    for (int i_117_ = 0;
						 i_117_ < is.length;
						 i_117_++) {
						class534_sub40_sub2.method16507
						    (is[i_117_] & 0xffff,
						     1932816148);
						i_111_++;
					    }
					} else {
					    for (int i_118_ = 0;
						 i_118_ < is.length;
						 i_118_++) {
						class534_sub40_sub2.method16721
						    (is[i_118_] & 0xffff,
						     1203548667);
						i_111_++;
					    }
					}
				    }
				}
				i_115_++;
			    }
			}
		    }
		    if (i_111_ > 0) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glScalef(f, f, 1.0F);
			OpenGL.glTranslatef((float) -i_110_ / f,
					    (float) -i_107_ / f, 1.0F);
			OpenGL.glMatrixMode(5888);
			aClass142ArrayArray1662[i_110_][i_107_].method2406
			    (class534_sub40_sub2.aByteArray10810, i_111_);
		    }
		}
	    }
	}
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    void method2438() {
	aClass142ArrayArray1662 = new Class142[anInt1659][anInt1656];
	for (int i = 0; i < anInt1656; i++) {
	    for (int i_119_ = 0; i_119_ < anInt1659; i_119_++)
		aClass142ArrayArray1662[i_119_][i]
		    = new Class142(aClass185_Sub3_1660, this,
				   aClass151_Sub1_1655, i_119_, i, anInt1661,
				   i_119_ * 128 + 1, i * 128 + 1);
	}
    }
    
    void method2439() {
	aClass142ArrayArray1662 = new Class142[anInt1659][anInt1656];
	for (int i = 0; i < anInt1656; i++) {
	    for (int i_120_ = 0; i_120_ < anInt1659; i_120_++)
		aClass142ArrayArray1662[i_120_][i]
		    = new Class142(aClass185_Sub3_1660, this,
				   aClass151_Sub1_1655, i_120_, i, anInt1661,
				   i_120_ * 128 + 1, i * 128 + 1);
	}
    }
    
    void method2440(int i, int i_121_, int i_122_, int i_123_) {
	if (aClass142ArrayArray1662 != null) {
	    int i_124_ = i - 1 >> 7;
	    int i_125_ = i - 1 + i_122_ - 1 >> 7;
	    int i_126_ = i_121_ - 1 >> 7;
	    int i_127_ = i_121_ - 1 + i_123_ - 1 >> 7;
	    for (int i_128_ = i_124_; i_128_ <= i_125_; i_128_++) {
		Class142[] class142s = aClass142ArrayArray1662[i_128_];
		for (int i_129_ = i_126_; i_129_ <= i_127_; i_129_++)
		    class142s[i_129_].aBool1641 = true;
	    }
	}
    }
    
    void method2441(int i, int i_130_, int i_131_, boolean[][] bools,
		    boolean bool) {
	aClass185_Sub3_1660.method15432(false);
	aClass185_Sub3_1660.method15193(false);
	aClass185_Sub3_1660.method15227(-2);
	aClass185_Sub3_1660.method15214(1);
	aClass185_Sub3_1660.method15246(1);
	float f = 1.0F / (float) (aClass185_Sub3_1660.anInt9638 * 128);
	if (bool) {
	    for (int i_132_ = 0; i_132_ < anInt1656; i_132_++) {
		int i_133_ = i_132_ << anInt1661;
		int i_134_ = i_132_ + 1 << anInt1661;
		for (int i_135_ = 0; i_135_ < anInt1659; i_135_++) {
		    int i_136_ = i_135_ << anInt1661;
		    int i_137_ = i_135_ + 1 << anInt1661;
		while_134_:
		    for (int i_138_ = i_136_; i_138_ < i_137_; i_138_++) {
			if (i_138_ - i >= -i_131_ && i_138_ - i <= i_131_) {
			    for (int i_139_ = i_133_; i_139_ < i_134_;
				 i_139_++) {
				if (i_139_ - i_130_ >= -i_131_
				    && i_139_ - i_130_ <= i_131_
				    && (bools[i_138_ - i + i_131_]
					[i_139_ - i_130_ + i_131_])) {
				    OpenGL.glMatrixMode(5890);
				    OpenGL.glLoadIdentity();
				    OpenGL.glScalef(f, f, 1.0F);
				    OpenGL.glTranslatef((float) -i_135_ / f,
							(float) -i_132_ / f,
							1.0F);
				    OpenGL.glMatrixMode(5888);
				    aClass142ArrayArray1662[i_135_][i_132_]
					.method2405();
				    break while_134_;
				}
			    }
			}
		    }
		}
	    }
	} else {
	    for (int i_140_ = 0; i_140_ < anInt1656; i_140_++) {
		int i_141_ = i_140_ << anInt1661;
		int i_142_ = i_140_ + 1 << anInt1661;
		for (int i_143_ = 0; i_143_ < anInt1659; i_143_++) {
		    int i_144_ = 0;
		    int i_145_ = i_143_ << anInt1661;
		    int i_146_ = i_143_ + 1 << anInt1661;
		    Class534_Sub40_Sub2 class534_sub40_sub2
			= aClass185_Sub3_1660.aClass534_Sub40_Sub2_9716;
		    class534_sub40_sub2.anInt10811 = 0;
		    for (int i_147_ = i_141_; i_147_ < i_142_; i_147_++) {
			if (i_147_ - i_130_ >= -i_131_
			    && i_147_ - i_130_ <= i_131_) {
			    int i_148_
				= (i_147_ * (aClass151_Sub1_1655.anInt1701
					     * -1924295585)
				   + i_145_);
			    for (int i_149_ = i_145_; i_149_ < i_146_;
				 i_149_++) {
				if (i_149_ - i >= -i_131_
				    && i_149_ - i <= i_131_
				    && (bools[i_149_ - i + i_131_]
					[i_147_ - i_130_ + i_131_])) {
				    short[] is
					= (aClass151_Sub1_1655
					   .aShortArrayArray9304[i_148_]);
				    if (is != null) {
					if (aClass185_Sub3_1660.aBool9566) {
					    for (int i_150_ = 0;
						 i_150_ < is.length;
						 i_150_++) {
						class534_sub40_sub2.method16507
						    (is[i_150_] & 0xffff,
						     1306487676);
						i_144_++;
					    }
					} else {
					    for (int i_151_ = 0;
						 i_151_ < is.length;
						 i_151_++) {
						class534_sub40_sub2.method16721
						    (is[i_151_] & 0xffff,
						     1203548667);
						i_144_++;
					    }
					}
				    }
				}
				i_148_++;
			    }
			}
		    }
		    if (i_144_ > 0) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glScalef(f, f, 1.0F);
			OpenGL.glTranslatef((float) -i_143_ / f,
					    (float) -i_140_ / f, 1.0F);
			OpenGL.glMatrixMode(5888);
			aClass142ArrayArray1662[i_143_][i_140_].method2406
			    (class534_sub40_sub2.aByteArray10810, i_144_);
		    }
		}
	    }
	}
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    void method2442(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
		    int i_152_) {
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1
	    = (Class534_Sub18_Sub16_Sub1) class534_sub18_sub16;
	i += class534_sub18_sub16_sub1.anInt12071 + 1;
	i_152_ += class534_sub18_sub16_sub1.anInt12070 + 1;
	int i_153_ = i + i_152_ * anInt1658;
	int i_154_ = 0;
	int i_155_ = class534_sub18_sub16_sub1.anInt12072;
	int i_156_ = class534_sub18_sub16_sub1.anInt12068;
	int i_157_ = anInt1658 - i_156_;
	int i_158_ = 0;
	if (i_152_ <= 0) {
	    int i_159_ = 1 - i_152_;
	    i_155_ -= i_159_;
	    i_154_ += i_159_ * i_156_;
	    i_153_ += i_159_ * anInt1658;
	    i_152_ = 1;
	}
	if (i_152_ + i_155_ >= anInt1657) {
	    int i_160_ = i_152_ + i_155_ + 1 - anInt1657;
	    i_155_ -= i_160_;
	}
	if (i <= 0) {
	    int i_161_ = 1 - i;
	    i_156_ -= i_161_;
	    i_154_ += i_161_;
	    i_153_ += i_161_;
	    i_158_ += i_161_;
	    i_157_ += i_161_;
	    i = 1;
	}
	if (i + i_156_ >= anInt1658) {
	    int i_162_ = i + i_156_ + 1 - anInt1658;
	    i_156_ -= i_162_;
	    i_158_ += i_162_;
	    i_157_ += i_162_;
	}
	if (i_156_ > 0 && i_155_ > 0) {
	    method2431(aByteArray1654,
		       class534_sub18_sub16_sub1.aByteArray12073, i_154_,
		       i_153_, i_156_, i_155_, i_157_, i_158_);
	    method2440(i, i_152_, i_156_, i_155_);
	}
    }
    
    static final boolean method2443(byte[] is, int i, int i_163_, int i_164_,
				    int i_165_, int i_166_) {
	int i_167_ = i_163_ % i_166_;
	int i_168_;
	if (i_167_ != 0)
	    i_168_ = i_166_ - i_167_;
	else
	    i_168_ = 0;
	int i_169_ = -((i_164_ + i_166_ - 1) / i_166_);
	int i_170_ = -((i_163_ + i_166_ - 1) / i_166_);
	for (int i_171_ = i_169_; i_171_ < 0; i_171_++) {
	    for (int i_172_ = i_170_; i_172_ < 0; i_172_++) {
		if (is[i] == 0)
		    return true;
		i += i_166_;
	    }
	    i -= i_168_;
	    if (is[i - 1] == 0)
		return true;
	    i += i_165_;
	}
	return false;
    }
    
    void method2444(int i, int i_173_, int i_174_, int i_175_) {
	if (aClass142ArrayArray1662 != null) {
	    int i_176_ = i - 1 >> 7;
	    int i_177_ = i - 1 + i_174_ - 1 >> 7;
	    int i_178_ = i_173_ - 1 >> 7;
	    int i_179_ = i_173_ - 1 + i_175_ - 1 >> 7;
	    for (int i_180_ = i_176_; i_180_ <= i_177_; i_180_++) {
		Class142[] class142s = aClass142ArrayArray1662[i_180_];
		for (int i_181_ = i_178_; i_181_ <= i_179_; i_181_++)
		    class142s[i_181_].aBool1641 = true;
	    }
	}
    }
    
    void method2445() {
	aClass142ArrayArray1662 = new Class142[anInt1659][anInt1656];
	for (int i = 0; i < anInt1656; i++) {
	    for (int i_182_ = 0; i_182_ < anInt1659; i_182_++)
		aClass142ArrayArray1662[i_182_][i]
		    = new Class142(aClass185_Sub3_1660, this,
				   aClass151_Sub1_1655, i_182_, i, anInt1661,
				   i_182_ * 128 + 1, i * 128 + 1);
	}
    }
    
    static final void method2446(byte[] is, byte[] is_183_, int i, int i_184_,
				 int i_185_, int i_186_, int i_187_,
				 int i_188_) {
	int i_189_ = -(i_185_ >> 2);
	i_185_ = -(i_185_ & 0x3);
	for (int i_190_ = -i_186_; i_190_ < 0; i_190_++) {
	    for (int i_191_ = i_189_; i_191_ < 0; i_191_++) {
		is[i_184_++] -= is_183_[i++];
		is[i_184_++] -= is_183_[i++];
		is[i_184_++] -= is_183_[i++];
		is[i_184_++] -= is_183_[i++];
	    }
	    for (int i_192_ = i_185_; i_192_ < 0; i_192_++)
		is[i_184_++] -= is_183_[i++];
	    i_184_ += i_187_;
	    i += i_188_;
	}
    }
    
    static final void method2447(byte[] is, byte[] is_193_, int i, int i_194_,
				 int i_195_, int i_196_, int i_197_,
				 int i_198_) {
	int i_199_ = -(i_195_ >> 2);
	i_195_ = -(i_195_ & 0x3);
	for (int i_200_ = -i_196_; i_200_ < 0; i_200_++) {
	    for (int i_201_ = i_199_; i_201_ < 0; i_201_++) {
		is[i_194_++] -= is_193_[i++];
		is[i_194_++] -= is_193_[i++];
		is[i_194_++] -= is_193_[i++];
		is[i_194_++] -= is_193_[i++];
	    }
	    for (int i_202_ = i_195_; i_202_ < 0; i_202_++)
		is[i_194_++] -= is_193_[i++];
	    i_194_ += i_197_;
	    i += i_198_;
	}
    }
    
    void method2448(int i, int i_203_, int i_204_, int i_205_) {
	if (aClass142ArrayArray1662 != null) {
	    int i_206_ = i - 1 >> 7;
	    int i_207_ = i - 1 + i_204_ - 1 >> 7;
	    int i_208_ = i_203_ - 1 >> 7;
	    int i_209_ = i_203_ - 1 + i_205_ - 1 >> 7;
	    for (int i_210_ = i_206_; i_210_ <= i_207_; i_210_++) {
		Class142[] class142s = aClass142ArrayArray1662[i_210_];
		for (int i_211_ = i_208_; i_211_ <= i_209_; i_211_++)
		    class142s[i_211_].aBool1641 = true;
	    }
	}
    }
    
    static final boolean method2449(byte[] is, int i, int i_212_, int i_213_,
				    int i_214_, int i_215_) {
	int i_216_ = i_212_ % i_215_;
	int i_217_;
	if (i_216_ != 0)
	    i_217_ = i_215_ - i_216_;
	else
	    i_217_ = 0;
	int i_218_ = -((i_213_ + i_215_ - 1) / i_215_);
	int i_219_ = -((i_212_ + i_215_ - 1) / i_215_);
	for (int i_220_ = i_218_; i_220_ < 0; i_220_++) {
	    for (int i_221_ = i_219_; i_221_ < 0; i_221_++) {
		if (is[i] == 0)
		    return true;
		i += i_215_;
	    }
	    i -= i_217_;
	    if (is[i - 1] == 0)
		return true;
	    i += i_214_;
	}
	return false;
    }
}
