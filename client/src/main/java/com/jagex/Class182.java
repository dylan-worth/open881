/* Class182 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class182
{
    static int anInt1963;
    static int anInt1964;
    static int[] anIntArray1965;
    static int anInt1966;
    static int anInt1967;
    static int anInt1968;
    static int anInt1969;
    static int anInt1970;
    
    static void method2984(int i, int i_0_) {
	for (/**/; i_0_ >= i + 8; i_0_ -= 4) {
	    boolean bool = true;
	    for (int i_1_ = i + 4; i_1_ < i_0_; i_1_ += 4) {
		int i_2_ = anIntArray1965[i_1_ - 4];
		int i_3_ = anIntArray1965[i_1_];
		if (i_2_ > i_3_) {
		    bool = false;
		    anIntArray1965[i_1_ - 4] = i_3_;
		    anIntArray1965[i_1_] = i_2_;
		    i_2_ = anIntArray1965[i_1_ - 2];
		    anIntArray1965[i_1_ - 2] = anIntArray1965[i_1_ + 2];
		    anIntArray1965[i_1_ + 2] = i_2_;
		    i_2_ = anIntArray1965[i_1_ - 1];
		    anIntArray1965[i_1_ - 1] = anIntArray1965[i_1_ + 3];
		    anIntArray1965[i_1_ + 3] = i_2_;
		}
	    }
	    if (bool)
		break;
	}
    }
    
    public static void method2985(Class185 class185, int[] is, int i) {
	method2998(class185, is, 0, is.length, i, null, null);
    }
    
    static void method2986(int i, int i_4_) {
	for (/**/; i_4_ >= i + 8; i_4_ -= 4) {
	    boolean bool = true;
	    for (int i_5_ = i + 4; i_5_ < i_4_; i_5_ += 4) {
		int i_6_ = anIntArray1965[i_5_ - 4];
		int i_7_ = anIntArray1965[i_5_];
		if (i_6_ > i_7_) {
		    bool = false;
		    anIntArray1965[i_5_ - 4] = i_7_;
		    anIntArray1965[i_5_] = i_6_;
		    i_6_ = anIntArray1965[i_5_ - 2];
		    anIntArray1965[i_5_ - 2] = anIntArray1965[i_5_ + 2];
		    anIntArray1965[i_5_ + 2] = i_6_;
		    i_6_ = anIntArray1965[i_5_ - 1];
		    anIntArray1965[i_5_ - 1] = anIntArray1965[i_5_ + 3];
		    anIntArray1965[i_5_ + 3] = i_6_;
		}
	    }
	    if (bool)
		break;
	}
    }
    
    static void method2987(int i, int i_8_) {
	for (/**/; i_8_ >= i + 8; i_8_ -= 4) {
	    boolean bool = true;
	    for (int i_9_ = i + 4; i_9_ < i_8_; i_9_ += 4) {
		int i_10_ = anIntArray1965[i_9_ - 4];
		int i_11_ = anIntArray1965[i_9_];
		if (i_10_ > i_11_) {
		    bool = false;
		    anIntArray1965[i_9_ - 4] = i_11_;
		    anIntArray1965[i_9_] = i_10_;
		    i_10_ = anIntArray1965[i_9_ - 2];
		    anIntArray1965[i_9_ - 2] = anIntArray1965[i_9_ + 2];
		    anIntArray1965[i_9_ + 2] = i_10_;
		    i_10_ = anIntArray1965[i_9_ - 1];
		    anIntArray1965[i_9_ - 1] = anIntArray1965[i_9_ + 3];
		    anIntArray1965[i_9_ + 3] = i_10_;
		}
	    }
	    if (bool)
		break;
	}
    }
    
    static void method2988(int i, int i_12_) {
	if (i_12_ > i + 4) {
	    int i_13_ = i;
	    int i_14_ = anIntArray1965[i_13_];
	    int i_15_ = anIntArray1965[i_13_ + 1];
	    int i_16_ = anIntArray1965[i_13_ + 2];
	    int i_17_ = anIntArray1965[i_13_ + 3];
	    for (int i_18_ = i + 4; i_18_ < i_12_; i_18_ += 4) {
		int i_19_ = anIntArray1965[i_18_ + 1];
		if (i_19_ < i_15_) {
		    anIntArray1965[i_13_] = anIntArray1965[i_18_];
		    anIntArray1965[i_13_ + 1] = i_19_;
		    anIntArray1965[i_13_ + 2] = anIntArray1965[i_18_ + 2];
		    anIntArray1965[i_13_ + 3] = anIntArray1965[i_18_ + 3];
		    i_13_ += 4;
		    anIntArray1965[i_18_] = anIntArray1965[i_13_];
		    anIntArray1965[i_18_ + 1] = anIntArray1965[i_13_ + 1];
		    anIntArray1965[i_18_ + 2] = anIntArray1965[i_13_ + 2];
		    anIntArray1965[i_18_ + 3] = anIntArray1965[i_13_ + 3];
		}
	    }
	    anIntArray1965[i_13_] = i_14_;
	    anIntArray1965[i_13_ + 1] = i_15_;
	    anIntArray1965[i_13_ + 2] = i_16_;
	    anIntArray1965[i_13_ + 3] = i_17_;
	    method2991(i, i_13_);
	    method2991(i_13_ + 4, i_12_);
	}
    }
    
    Class182() throws Throwable {
	throw new Error();
    }
    
    static void method2989() {
	anInt1967 = 0;
    }
    
    static boolean method2990(int i) {
	int i_20_ = anInt1969;
	int i_21_ = anInt1970;
	int i_22_ = anInt1968;
	int i_23_;
	for (/**/; i_21_ >= i_20_; i_21_ = i_23_) {
	    anInt1968 = ++i_22_;
	    if (i_22_ >= i)
		return false;
	    i_23_ = anInt1964;
	    for (/**/; i_20_ < anInt1967; i_20_ += 4) {
		int i_24_ = anIntArray1965[i_20_ + 1];
		if (i_22_ < i_24_)
		    break;
		int i_25_ = anIntArray1965[i_20_];
		int i_26_ = anIntArray1965[i_20_ + 2];
		int i_27_ = anIntArray1965[i_20_ + 3];
		int i_28_ = (i_26_ - i_25_ << 16) / (i_27_ - i_24_);
		int i_29_ = (i_25_ << 16) + 32768;
		anIntArray1965[i_20_] = i_29_;
		anIntArray1965[i_20_ + 2] = i_28_;
	    }
	    for (int i_30_ = i_23_; i_30_ < i_20_; i_30_ += 4) {
		int i_31_ = anIntArray1965[i_30_ + 3];
		if (i_22_ >= i_31_) {
		    anIntArray1965[i_30_] = anIntArray1965[i_23_];
		    anIntArray1965[i_30_ + 1] = anIntArray1965[i_23_ + 1];
		    anIntArray1965[i_30_ + 2] = anIntArray1965[i_23_ + 2];
		    anIntArray1965[i_30_ + 3] = anIntArray1965[i_23_ + 3];
		    i_23_ += 4;
		}
	    }
	    if (i_23_ == anInt1967) {
		anInt1967 = 0;
		return false;
	    }
	    method2984(i_23_, i_20_);
	    anInt1964 = i_23_;
	    anInt1969 = i_20_;
	}
	anInt1966 = anIntArray1965[i_21_] >> 16;
	anInt1963 = anIntArray1965[i_21_ + 4] >> 16;
	anIntArray1965[i_21_] += anIntArray1965[i_21_ + 2];
	anIntArray1965[i_21_ + 4] += anIntArray1965[i_21_ + 6];
	i_21_ += 8;
	anInt1970 = i_21_;
	return true;
    }
    
    static void method2991(int i, int i_32_) {
	if (i_32_ > i + 4) {
	    int i_33_ = i;
	    int i_34_ = anIntArray1965[i_33_];
	    int i_35_ = anIntArray1965[i_33_ + 1];
	    int i_36_ = anIntArray1965[i_33_ + 2];
	    int i_37_ = anIntArray1965[i_33_ + 3];
	    for (int i_38_ = i + 4; i_38_ < i_32_; i_38_ += 4) {
		int i_39_ = anIntArray1965[i_38_ + 1];
		if (i_39_ < i_35_) {
		    anIntArray1965[i_33_] = anIntArray1965[i_38_];
		    anIntArray1965[i_33_ + 1] = i_39_;
		    anIntArray1965[i_33_ + 2] = anIntArray1965[i_38_ + 2];
		    anIntArray1965[i_33_ + 3] = anIntArray1965[i_38_ + 3];
		    i_33_ += 4;
		    anIntArray1965[i_38_] = anIntArray1965[i_33_];
		    anIntArray1965[i_38_ + 1] = anIntArray1965[i_33_ + 1];
		    anIntArray1965[i_38_ + 2] = anIntArray1965[i_33_ + 2];
		    anIntArray1965[i_38_ + 3] = anIntArray1965[i_33_ + 3];
		}
	    }
	    anIntArray1965[i_33_] = i_34_;
	    anIntArray1965[i_33_ + 1] = i_35_;
	    anIntArray1965[i_33_ + 2] = i_36_;
	    anIntArray1965[i_33_ + 3] = i_37_;
	    method2991(i, i_33_);
	    method2991(i_33_ + 4, i_32_);
	}
    }
    
    public static void method2992(Class185 class185, int[] is, int i,
				  int[] is_40_, int[] is_41_) {
	method2998(class185, is, 0, is.length, i, is_40_, is_41_);
    }
    
    public static void method2993(Class185 class185, int[] is, int i,
				  int[] is_42_, int[] is_43_) {
	method2998(class185, is, 0, is.length, i, is_42_, is_43_);
    }
    
    static void method2994(int[] is, int i, int i_44_) {
	int i_45_ = anInt1967 + (i_44_ << 1);
	if (anIntArray1965 == null || anIntArray1965.length < i_45_) {
	    int[] is_46_ = new int[i_45_];
	    for (int i_47_ = 0; i_47_ < anInt1967; i_47_++)
		is_46_[i_47_] = anIntArray1965[i_47_];
	    anIntArray1965 = is_46_;
	}
	i_44_ += i;
	int i_48_ = i_44_ - 2;
	for (int i_49_ = i; i_49_ < i_44_; i_49_ += 2) {
	    int i_50_ = is[i_48_ + 1];
	    int i_51_ = is[i_49_ + 1];
	    if (i_50_ < i_51_) {
		anIntArray1965[anInt1967++] = is[i_48_];
		anIntArray1965[anInt1967++] = i_50_;
		anIntArray1965[anInt1967++] = is[i_49_];
		anIntArray1965[anInt1967++] = i_51_;
	    } else if (i_51_ < i_50_) {
		anIntArray1965[anInt1967++] = is[i_49_];
		anIntArray1965[anInt1967++] = i_51_;
		anIntArray1965[anInt1967++] = is[i_48_];
		anIntArray1965[anInt1967++] = i_50_;
	    }
	    i_48_ = i_49_;
	}
    }
    
    static void method2995() {
	anInt1967 = 0;
    }
    
    static void method2996(int[] is, int i, int i_52_) {
	int i_53_ = anInt1967 + (i_52_ << 1);
	if (anIntArray1965 == null || anIntArray1965.length < i_53_) {
	    int[] is_54_ = new int[i_53_];
	    for (int i_55_ = 0; i_55_ < anInt1967; i_55_++)
		is_54_[i_55_] = anIntArray1965[i_55_];
	    anIntArray1965 = is_54_;
	}
	i_52_ += i;
	int i_56_ = i_52_ - 2;
	for (int i_57_ = i; i_57_ < i_52_; i_57_ += 2) {
	    int i_58_ = is[i_56_ + 1];
	    int i_59_ = is[i_57_ + 1];
	    if (i_58_ < i_59_) {
		anIntArray1965[anInt1967++] = is[i_56_];
		anIntArray1965[anInt1967++] = i_58_;
		anIntArray1965[anInt1967++] = is[i_57_];
		anIntArray1965[anInt1967++] = i_59_;
	    } else if (i_59_ < i_58_) {
		anIntArray1965[anInt1967++] = is[i_57_];
		anIntArray1965[anInt1967++] = i_59_;
		anIntArray1965[anInt1967++] = is[i_56_];
		anIntArray1965[anInt1967++] = i_58_;
	    }
	    i_56_ = i_57_;
	}
    }
    
    static void method2997(int[] is, int i, int i_60_) {
	int i_61_ = anInt1967 + (i_60_ << 1);
	if (anIntArray1965 == null || anIntArray1965.length < i_61_) {
	    int[] is_62_ = new int[i_61_];
	    for (int i_63_ = 0; i_63_ < anInt1967; i_63_++)
		is_62_[i_63_] = anIntArray1965[i_63_];
	    anIntArray1965 = is_62_;
	}
	i_60_ += i;
	int i_64_ = i_60_ - 2;
	for (int i_65_ = i; i_65_ < i_60_; i_65_ += 2) {
	    int i_66_ = is[i_64_ + 1];
	    int i_67_ = is[i_65_ + 1];
	    if (i_66_ < i_67_) {
		anIntArray1965[anInt1967++] = is[i_64_];
		anIntArray1965[anInt1967++] = i_66_;
		anIntArray1965[anInt1967++] = is[i_65_];
		anIntArray1965[anInt1967++] = i_67_;
	    } else if (i_67_ < i_66_) {
		anIntArray1965[anInt1967++] = is[i_65_];
		anIntArray1965[anInt1967++] = i_67_;
		anIntArray1965[anInt1967++] = is[i_64_];
		anIntArray1965[anInt1967++] = i_66_;
	    }
	    i_64_ = i_65_;
	}
    }
    
    static void method2998(Class185 class185, int[] is, int i, int i_68_,
			   int i_69_, int[] is_70_, int[] is_71_) {
	int[] is_72_ = new int[4];
	class185.method3360(is_72_);
	if (is_70_ != null && is_72_[3] - is_72_[1] != is_70_.length)
	    throw new IllegalStateException();
	method2989();
	method2994(is, i, i_68_);
	method3001(is_72_[1]);
	while (method2990(is_72_[3])) {
	    int i_73_ = anInt1966;
	    int i_74_ = anInt1963;
	    int i_75_ = anInt1968;
	    if (is_70_ != null) {
		int i_76_ = i_75_ - is_72_[1];
		if (i_73_ < is_70_[i_76_] + is_72_[0])
		    i_73_ = is_70_[i_76_] + is_72_[0];
		if (i_74_ > is_70_[i_76_] + is_71_[i_76_] + is_72_[0])
		    i_74_ = is_70_[i_76_] + is_71_[i_76_] + is_72_[0];
		if (i_74_ - i_73_ <= 0)
		    continue;
	    }
	    class185.method3248(i_73_, i_75_, i_74_ - i_73_, i_69_, 1);
	}
    }
    
    static void method2999(int i, int i_77_) {
	if (i_77_ > i + 4) {
	    int i_78_ = i;
	    int i_79_ = anIntArray1965[i_78_];
	    int i_80_ = anIntArray1965[i_78_ + 1];
	    int i_81_ = anIntArray1965[i_78_ + 2];
	    int i_82_ = anIntArray1965[i_78_ + 3];
	    for (int i_83_ = i + 4; i_83_ < i_77_; i_83_ += 4) {
		int i_84_ = anIntArray1965[i_83_ + 1];
		if (i_84_ < i_80_) {
		    anIntArray1965[i_78_] = anIntArray1965[i_83_];
		    anIntArray1965[i_78_ + 1] = i_84_;
		    anIntArray1965[i_78_ + 2] = anIntArray1965[i_83_ + 2];
		    anIntArray1965[i_78_ + 3] = anIntArray1965[i_83_ + 3];
		    i_78_ += 4;
		    anIntArray1965[i_83_] = anIntArray1965[i_78_];
		    anIntArray1965[i_83_ + 1] = anIntArray1965[i_78_ + 1];
		    anIntArray1965[i_83_ + 2] = anIntArray1965[i_78_ + 2];
		    anIntArray1965[i_83_ + 3] = anIntArray1965[i_78_ + 3];
		}
	    }
	    anIntArray1965[i_78_] = i_79_;
	    anIntArray1965[i_78_ + 1] = i_80_;
	    anIntArray1965[i_78_ + 2] = i_81_;
	    anIntArray1965[i_78_ + 3] = i_82_;
	    method2991(i, i_78_);
	    method2991(i_78_ + 4, i_77_);
	}
    }
    
    static void method3000(int i, int i_85_) {
	for (/**/; i_85_ >= i + 8; i_85_ -= 4) {
	    boolean bool = true;
	    for (int i_86_ = i + 4; i_86_ < i_85_; i_86_ += 4) {
		int i_87_ = anIntArray1965[i_86_ - 4];
		int i_88_ = anIntArray1965[i_86_];
		if (i_87_ > i_88_) {
		    bool = false;
		    anIntArray1965[i_86_ - 4] = i_88_;
		    anIntArray1965[i_86_] = i_87_;
		    i_87_ = anIntArray1965[i_86_ - 2];
		    anIntArray1965[i_86_ - 2] = anIntArray1965[i_86_ + 2];
		    anIntArray1965[i_86_ + 2] = i_87_;
		    i_87_ = anIntArray1965[i_86_ - 1];
		    anIntArray1965[i_86_ - 1] = anIntArray1965[i_86_ + 3];
		    anIntArray1965[i_86_ + 3] = i_87_;
		}
	    }
	    if (bool)
		break;
	}
    }
    
    static void method3001(int i) {
	if (anInt1967 < 0) {
	    anInt1970 = 0;
	    anInt1969 = 0;
	    anInt1964 = 0;
	    anInt1968 = 2147483646;
	} else {
	    method2991(0, anInt1967);
	    int i_89_ = anIntArray1965[1];
	    if (i_89_ < i)
		i_89_ = i;
	    int i_90_ = 0;
	    int i_91_;
	    for (i_91_ = 0; i_91_ < anInt1967; i_91_ += 4) {
		int i_92_ = anIntArray1965[i_91_ + 1];
		if (i_89_ < i_92_)
		    break;
		int i_93_ = anIntArray1965[i_91_];
		int i_94_ = anIntArray1965[i_91_ + 2];
		int i_95_ = anIntArray1965[i_91_ + 3];
		int i_96_ = (i_94_ - i_93_ << 16) / (i_95_ - i_92_);
		int i_97_ = (i_93_ << 16) + 32768;
		anIntArray1965[i_91_] = i_97_ + (i_89_ - i_92_) * i_96_;
		anIntArray1965[i_91_ + 2] = i_96_;
	    }
	    anInt1964 = i_90_;
	    anInt1969 = i_91_;
	    anInt1970 = i_91_;
	    anInt1968 = i_89_ - 1;
	}
    }
    
    public static void method3002(Class185 class185, int[] is, int i,
				  int[] is_98_, int[] is_99_) {
	method2998(class185, is, 0, is.length, i, is_98_, is_99_);
    }
    
    static void method3003(int i, int i_100_) {
	for (/**/; i_100_ >= i + 8; i_100_ -= 4) {
	    boolean bool = true;
	    for (int i_101_ = i + 4; i_101_ < i_100_; i_101_ += 4) {
		int i_102_ = anIntArray1965[i_101_ - 4];
		int i_103_ = anIntArray1965[i_101_];
		if (i_102_ > i_103_) {
		    bool = false;
		    anIntArray1965[i_101_ - 4] = i_103_;
		    anIntArray1965[i_101_] = i_102_;
		    i_102_ = anIntArray1965[i_101_ - 2];
		    anIntArray1965[i_101_ - 2] = anIntArray1965[i_101_ + 2];
		    anIntArray1965[i_101_ + 2] = i_102_;
		    i_102_ = anIntArray1965[i_101_ - 1];
		    anIntArray1965[i_101_ - 1] = anIntArray1965[i_101_ + 3];
		    anIntArray1965[i_101_ + 3] = i_102_;
		}
	    }
	    if (bool)
		break;
	}
    }
}
