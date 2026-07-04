/* Class531 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class531
{
    public static Class44_Sub7 aClass44_Sub7_7135;
    public static long aLong7136;
    static String aString7137;
    
    static int method8854(int i) {
	if (9 == i || i == 10)
	    return 1;
	if (11 == i)
	    return 8;
	return i;
    }
    
    static int method8855(int i, int i_0_) {
	if (9 == i_0_)
	    i = i + 1 & 0x3;
	if (10 == i_0_)
	    i = i + 3 & 0x3;
	if (11 == i_0_)
	    i = 3 + i & 0x3;
	return i;
    }
    
    Class531() throws Throwable {
	throw new Error();
    }
    
    public static byte[][][] method8856(int i) {
	byte[][][] is = new byte[8][4][];
	int i_1_ = i;
	int i_2_ = i;
	byte[] is_3_ = new byte[i_1_ * i_2_];
	int i_4_ = 0;
	for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
	    for (int i_6_ = 0; i_6_ < i_1_; i_6_++) {
		if (i_6_ <= i_5_)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[0][0] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_7_ = i_2_ - 1; i_7_ >= 0; i_7_--) {
	    for (int i_8_ = 0; i_8_ < i_2_; i_8_++) {
		if (i_8_ <= i_7_)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[0][1] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_9_ = 0; i_9_ < i_2_; i_9_++) {
	    for (int i_10_ = 0; i_10_ < i_1_; i_10_++) {
		if (i_10_ >= i_9_)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[0][2] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_11_ = i_2_ - 1; i_11_ >= 0; i_11_--) {
	    for (int i_12_ = 0; i_12_ < i_1_; i_12_++) {
		if (i_12_ >= i_11_)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[0][3] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_13_ = i_2_ - 1; i_13_ >= 0; i_13_--) {
	    for (int i_14_ = 0; i_14_ < i_1_; i_14_++) {
		if (i_14_ <= i_13_ >> 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[1][0] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_15_ = 0; i_15_ < i_2_; i_15_++) {
	    for (int i_16_ = 0; i_16_ < i_1_; i_16_++) {
		if (i_4_ < 0 || i_4_ >= is_3_.length)
		    i_4_++;
		else {
		    if (i_16_ >= i_15_ << 1)
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	}
	is[1][1] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_17_ = 0; i_17_ < i_2_; i_17_++) {
	    for (int i_18_ = i_1_ - 1; i_18_ >= 0; i_18_--) {
		if (i_18_ <= i_17_ >> 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[1][2] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_19_ = i_2_ - 1; i_19_ >= 0; i_19_--) {
	    for (int i_20_ = i_1_ - 1; i_20_ >= 0; i_20_--) {
		if (i_20_ >= i_19_ << 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[1][3] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_21_ = i_2_ - 1; i_21_ >= 0; i_21_--) {
	    for (int i_22_ = i_1_ - 1; i_22_ >= 0; i_22_--) {
		if (i_22_ <= i_21_ >> 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[2][0] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_23_ = i_2_ - 1; i_23_ >= 0; i_23_--) {
	    for (int i_24_ = 0; i_24_ < i_1_; i_24_++) {
		if (i_24_ >= i_23_ << 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[2][1] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_25_ = 0; i_25_ < i_2_; i_25_++) {
	    for (int i_26_ = 0; i_26_ < i_1_; i_26_++) {
		if (i_26_ <= i_25_ >> 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[2][2] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_27_ = 0; i_27_ < i_2_; i_27_++) {
	    for (int i_28_ = i_1_ - 1; i_28_ >= 0; i_28_--) {
		if (i_28_ >= i_27_ << 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[2][3] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_29_ = i_2_ - 1; i_29_ >= 0; i_29_--) {
	    for (int i_30_ = 0; i_30_ < i_1_; i_30_++) {
		if (i_30_ >= i_29_ >> 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[3][0] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_31_ = 0; i_31_ < i_2_; i_31_++) {
	    for (int i_32_ = 0; i_32_ < i_1_; i_32_++) {
		if (i_32_ <= i_31_ << 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[3][1] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_33_ = 0; i_33_ < i_2_; i_33_++) {
	    for (int i_34_ = i_1_ - 1; i_34_ >= 0; i_34_--) {
		if (i_34_ >= i_33_ >> 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[3][2] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_35_ = i_2_ - 1; i_35_ >= 0; i_35_--) {
	    for (int i_36_ = i_1_ - 1; i_36_ >= 0; i_36_--) {
		if (i_36_ <= i_35_ << 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[3][3] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_37_ = i_2_ - 1; i_37_ >= 0; i_37_--) {
	    for (int i_38_ = i_1_ - 1; i_38_ >= 0; i_38_--) {
		if (i_38_ >= i_37_ >> 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[4][0] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_39_ = i_2_ - 1; i_39_ >= 0; i_39_--) {
	    for (int i_40_ = 0; i_40_ < i_1_; i_40_++) {
		if (i_40_ <= i_39_ << 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[4][1] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_41_ = 0; i_41_ < i_2_; i_41_++) {
	    for (int i_42_ = 0; i_42_ < i_1_; i_42_++) {
		if (i_42_ >= i_41_ >> 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[4][2] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_43_ = 0; i_43_ < i_2_; i_43_++) {
	    for (int i_44_ = i_1_ - 1; i_44_ >= 0; i_44_--) {
		if (i_44_ <= i_43_ << 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[4][3] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_45_ = 0; i_45_ < i_2_; i_45_++) {
	    for (int i_46_ = 0; i_46_ < i_1_; i_46_++) {
		if (i_46_ <= i_1_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[5][0] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_47_ = 0; i_47_ < i_2_; i_47_++) {
	    for (int i_48_ = 0; i_48_ < i_1_; i_48_++) {
		if (i_47_ <= i_2_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[5][1] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_49_ = 0; i_49_ < i_2_; i_49_++) {
	    for (int i_50_ = 0; i_50_ < i_1_; i_50_++) {
		if (i_50_ >= i_1_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[5][2] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_51_ = 0; i_51_ < i_2_; i_51_++) {
	    for (int i_52_ = 0; i_52_ < i_1_; i_52_++) {
		if (i_51_ >= i_2_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[5][3] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_53_ = 0; i_53_ < i_2_; i_53_++) {
	    for (int i_54_ = 0; i_54_ < i_1_; i_54_++) {
		if (i_54_ <= i_53_ - i_2_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[6][0] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_55_ = i_2_ - 1; i_55_ >= 0; i_55_--) {
	    for (int i_56_ = 0; i_56_ < i_1_; i_56_++) {
		if (i_56_ <= i_55_ - i_2_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[6][1] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_57_ = i_2_ - 1; i_57_ >= 0; i_57_--) {
	    for (int i_58_ = i_1_ - 1; i_58_ >= 0; i_58_--) {
		if (i_58_ <= i_57_ - i_2_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[6][2] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_59_ = 0; i_59_ < i_2_; i_59_++) {
	    for (int i_60_ = i_1_ - 1; i_60_ >= 0; i_60_--) {
		if (i_60_ <= i_59_ - i_2_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[6][3] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_61_ = 0; i_61_ < i_2_; i_61_++) {
	    for (int i_62_ = 0; i_62_ < i_1_; i_62_++) {
		if (i_62_ >= i_61_ - i_2_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[7][0] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_63_ = i_2_ - 1; i_63_ >= 0; i_63_--) {
	    for (int i_64_ = 0; i_64_ < i_1_; i_64_++) {
		if (i_64_ >= i_63_ - i_2_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[7][1] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_65_ = i_2_ - 1; i_65_ >= 0; i_65_--) {
	    for (int i_66_ = i_1_ - 1; i_66_ >= 0; i_66_--) {
		if (i_66_ >= i_65_ - i_2_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[7][2] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_67_ = 0; i_67_ < i_2_; i_67_++) {
	    for (int i_68_ = i_1_ - 1; i_68_ >= 0; i_68_--) {
		if (i_68_ >= i_67_ - i_2_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[7][3] = is_3_;
	return is;
    }
    
    public static byte[][][] method8857(int i) {
	byte[][][] is = new byte[8][4][];
	int i_69_ = i;
	int i_70_ = i;
	byte[] is_71_ = new byte[i_69_ * i_70_];
	int i_72_ = 0;
	for (int i_73_ = 0; i_73_ < i_70_; i_73_++) {
	    for (int i_74_ = 0; i_74_ < i_69_; i_74_++) {
		if (i_74_ <= i_73_)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[0][0] = is_71_;
	is_71_ = new byte[i_70_ * i_69_];
	i_72_ = 0;
	for (int i_75_ = i_70_ - 1; i_75_ >= 0; i_75_--) {
	    for (int i_76_ = 0; i_76_ < i_70_; i_76_++) {
		if (i_76_ <= i_75_)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[0][1] = is_71_;
	is_71_ = new byte[i_70_ * i_69_];
	i_72_ = 0;
	for (int i_77_ = 0; i_77_ < i_70_; i_77_++) {
	    for (int i_78_ = 0; i_78_ < i_69_; i_78_++) {
		if (i_78_ >= i_77_)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[0][2] = is_71_;
	is_71_ = new byte[i_70_ * i_69_];
	i_72_ = 0;
	for (int i_79_ = i_70_ - 1; i_79_ >= 0; i_79_--) {
	    for (int i_80_ = 0; i_80_ < i_69_; i_80_++) {
		if (i_80_ >= i_79_)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[0][3] = is_71_;
	is_71_ = new byte[i_69_ * i_70_];
	i_72_ = 0;
	for (int i_81_ = i_70_ - 1; i_81_ >= 0; i_81_--) {
	    for (int i_82_ = 0; i_82_ < i_69_; i_82_++) {
		if (i_82_ <= i_81_ >> 1)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[1][0] = is_71_;
	is_71_ = new byte[i_70_ * i_69_];
	i_72_ = 0;
	for (int i_83_ = 0; i_83_ < i_70_; i_83_++) {
	    for (int i_84_ = 0; i_84_ < i_69_; i_84_++) {
		if (i_72_ < 0 || i_72_ >= is_71_.length)
		    i_72_++;
		else {
		    if (i_84_ >= i_83_ << 1)
			is_71_[i_72_] = (byte) -1;
		    i_72_++;
		}
	    }
	}
	is[1][1] = is_71_;
	is_71_ = new byte[i_69_ * i_70_];
	i_72_ = 0;
	for (int i_85_ = 0; i_85_ < i_70_; i_85_++) {
	    for (int i_86_ = i_69_ - 1; i_86_ >= 0; i_86_--) {
		if (i_86_ <= i_85_ >> 1)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[1][2] = is_71_;
	is_71_ = new byte[i_70_ * i_69_];
	i_72_ = 0;
	for (int i_87_ = i_70_ - 1; i_87_ >= 0; i_87_--) {
	    for (int i_88_ = i_69_ - 1; i_88_ >= 0; i_88_--) {
		if (i_88_ >= i_87_ << 1)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[1][3] = is_71_;
	is_71_ = new byte[i_69_ * i_70_];
	i_72_ = 0;
	for (int i_89_ = i_70_ - 1; i_89_ >= 0; i_89_--) {
	    for (int i_90_ = i_69_ - 1; i_90_ >= 0; i_90_--) {
		if (i_90_ <= i_89_ >> 1)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[2][0] = is_71_;
	is_71_ = new byte[i_69_ * i_70_];
	i_72_ = 0;
	for (int i_91_ = i_70_ - 1; i_91_ >= 0; i_91_--) {
	    for (int i_92_ = 0; i_92_ < i_69_; i_92_++) {
		if (i_92_ >= i_91_ << 1)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[2][1] = is_71_;
	is_71_ = new byte[i_70_ * i_69_];
	i_72_ = 0;
	for (int i_93_ = 0; i_93_ < i_70_; i_93_++) {
	    for (int i_94_ = 0; i_94_ < i_69_; i_94_++) {
		if (i_94_ <= i_93_ >> 1)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[2][2] = is_71_;
	is_71_ = new byte[i_69_ * i_70_];
	i_72_ = 0;
	for (int i_95_ = 0; i_95_ < i_70_; i_95_++) {
	    for (int i_96_ = i_69_ - 1; i_96_ >= 0; i_96_--) {
		if (i_96_ >= i_95_ << 1)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[2][3] = is_71_;
	is_71_ = new byte[i_69_ * i_70_];
	i_72_ = 0;
	for (int i_97_ = i_70_ - 1; i_97_ >= 0; i_97_--) {
	    for (int i_98_ = 0; i_98_ < i_69_; i_98_++) {
		if (i_98_ >= i_97_ >> 1)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[3][0] = is_71_;
	is_71_ = new byte[i_69_ * i_70_];
	i_72_ = 0;
	for (int i_99_ = 0; i_99_ < i_70_; i_99_++) {
	    for (int i_100_ = 0; i_100_ < i_69_; i_100_++) {
		if (i_100_ <= i_99_ << 1)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[3][1] = is_71_;
	is_71_ = new byte[i_70_ * i_69_];
	i_72_ = 0;
	for (int i_101_ = 0; i_101_ < i_70_; i_101_++) {
	    for (int i_102_ = i_69_ - 1; i_102_ >= 0; i_102_--) {
		if (i_102_ >= i_101_ >> 1)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[3][2] = is_71_;
	is_71_ = new byte[i_70_ * i_69_];
	i_72_ = 0;
	for (int i_103_ = i_70_ - 1; i_103_ >= 0; i_103_--) {
	    for (int i_104_ = i_69_ - 1; i_104_ >= 0; i_104_--) {
		if (i_104_ <= i_103_ << 1)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[3][3] = is_71_;
	is_71_ = new byte[i_69_ * i_70_];
	i_72_ = 0;
	for (int i_105_ = i_70_ - 1; i_105_ >= 0; i_105_--) {
	    for (int i_106_ = i_69_ - 1; i_106_ >= 0; i_106_--) {
		if (i_106_ >= i_105_ >> 1)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[4][0] = is_71_;
	is_71_ = new byte[i_70_ * i_69_];
	i_72_ = 0;
	for (int i_107_ = i_70_ - 1; i_107_ >= 0; i_107_--) {
	    for (int i_108_ = 0; i_108_ < i_69_; i_108_++) {
		if (i_108_ <= i_107_ << 1)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[4][1] = is_71_;
	is_71_ = new byte[i_70_ * i_69_];
	i_72_ = 0;
	for (int i_109_ = 0; i_109_ < i_70_; i_109_++) {
	    for (int i_110_ = 0; i_110_ < i_69_; i_110_++) {
		if (i_110_ >= i_109_ >> 1)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[4][2] = is_71_;
	is_71_ = new byte[i_69_ * i_70_];
	i_72_ = 0;
	for (int i_111_ = 0; i_111_ < i_70_; i_111_++) {
	    for (int i_112_ = i_69_ - 1; i_112_ >= 0; i_112_--) {
		if (i_112_ <= i_111_ << 1)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[4][3] = is_71_;
	is_71_ = new byte[i_69_ * i_70_];
	i_72_ = 0;
	for (int i_113_ = 0; i_113_ < i_70_; i_113_++) {
	    for (int i_114_ = 0; i_114_ < i_69_; i_114_++) {
		if (i_114_ <= i_69_ / 2)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[5][0] = is_71_;
	is_71_ = new byte[i_70_ * i_69_];
	i_72_ = 0;
	for (int i_115_ = 0; i_115_ < i_70_; i_115_++) {
	    for (int i_116_ = 0; i_116_ < i_69_; i_116_++) {
		if (i_115_ <= i_70_ / 2)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[5][1] = is_71_;
	is_71_ = new byte[i_70_ * i_69_];
	i_72_ = 0;
	for (int i_117_ = 0; i_117_ < i_70_; i_117_++) {
	    for (int i_118_ = 0; i_118_ < i_69_; i_118_++) {
		if (i_118_ >= i_69_ / 2)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[5][2] = is_71_;
	is_71_ = new byte[i_69_ * i_70_];
	i_72_ = 0;
	for (int i_119_ = 0; i_119_ < i_70_; i_119_++) {
	    for (int i_120_ = 0; i_120_ < i_69_; i_120_++) {
		if (i_119_ >= i_70_ / 2)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[5][3] = is_71_;
	is_71_ = new byte[i_70_ * i_69_];
	i_72_ = 0;
	for (int i_121_ = 0; i_121_ < i_70_; i_121_++) {
	    for (int i_122_ = 0; i_122_ < i_69_; i_122_++) {
		if (i_122_ <= i_121_ - i_70_ / 2)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[6][0] = is_71_;
	is_71_ = new byte[i_69_ * i_70_];
	i_72_ = 0;
	for (int i_123_ = i_70_ - 1; i_123_ >= 0; i_123_--) {
	    for (int i_124_ = 0; i_124_ < i_69_; i_124_++) {
		if (i_124_ <= i_123_ - i_70_ / 2)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[6][1] = is_71_;
	is_71_ = new byte[i_70_ * i_69_];
	i_72_ = 0;
	for (int i_125_ = i_70_ - 1; i_125_ >= 0; i_125_--) {
	    for (int i_126_ = i_69_ - 1; i_126_ >= 0; i_126_--) {
		if (i_126_ <= i_125_ - i_70_ / 2)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[6][2] = is_71_;
	is_71_ = new byte[i_70_ * i_69_];
	i_72_ = 0;
	for (int i_127_ = 0; i_127_ < i_70_; i_127_++) {
	    for (int i_128_ = i_69_ - 1; i_128_ >= 0; i_128_--) {
		if (i_128_ <= i_127_ - i_70_ / 2)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[6][3] = is_71_;
	is_71_ = new byte[i_70_ * i_69_];
	i_72_ = 0;
	for (int i_129_ = 0; i_129_ < i_70_; i_129_++) {
	    for (int i_130_ = 0; i_130_ < i_69_; i_130_++) {
		if (i_130_ >= i_129_ - i_70_ / 2)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[7][0] = is_71_;
	is_71_ = new byte[i_70_ * i_69_];
	i_72_ = 0;
	for (int i_131_ = i_70_ - 1; i_131_ >= 0; i_131_--) {
	    for (int i_132_ = 0; i_132_ < i_69_; i_132_++) {
		if (i_132_ >= i_131_ - i_70_ / 2)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[7][1] = is_71_;
	is_71_ = new byte[i_70_ * i_69_];
	i_72_ = 0;
	for (int i_133_ = i_70_ - 1; i_133_ >= 0; i_133_--) {
	    for (int i_134_ = i_69_ - 1; i_134_ >= 0; i_134_--) {
		if (i_134_ >= i_133_ - i_70_ / 2)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[7][2] = is_71_;
	is_71_ = new byte[i_70_ * i_69_];
	i_72_ = 0;
	for (int i_135_ = 0; i_135_ < i_70_; i_135_++) {
	    for (int i_136_ = i_69_ - 1; i_136_ >= 0; i_136_--) {
		if (i_136_ >= i_135_ - i_70_ / 2)
		    is_71_[i_72_] = (byte) -1;
		i_72_++;
	    }
	}
	is[7][3] = is_71_;
	return is;
    }
    
    static final void method8858(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class36.method937(class247, class243, class669, (short) 256);
    }
    
    static final void method8859(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aClass214_11359.method4030(-358869573) ? 1 : 0;
    }
    
    public static void method8860(int i) {
	Class554_Sub1.aHashMap10682.clear();
	Class554_Sub1.aHashMap10681.clear();
    }
    
    static final void method8861(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class534_Sub20.method16195(class247, class243, true, 1, class669,
				   1284605771);
    }
}
