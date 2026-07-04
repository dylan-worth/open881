/* Class660 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class660
{
    public static void method10917(long[] ls, Object[] objects) {
	Class605.method10034(ls, objects, 0, ls.length - 1, 1799675664);
    }
    
    public static void method10918(int[] is, Object[] objects, int i,
				   int i_0_) {
	if (i < i_0_) {
	    int i_1_ = (i_0_ + i) / 2;
	    int i_2_ = i;
	    int i_3_ = is[i_1_];
	    is[i_1_] = is[i_0_];
	    is[i_0_] = i_3_;
	    Object object = objects[i_1_];
	    objects[i_1_] = objects[i_0_];
	    objects[i_0_] = object;
	    int i_4_ = 2147483647 == i_3_ ? 0 : 1;
	    for (int i_5_ = i; i_5_ < i_0_; i_5_++) {
		if (is[i_5_] < i_3_ + (i_5_ & i_4_)) {
		    int i_6_ = is[i_5_];
		    is[i_5_] = is[i_2_];
		    is[i_2_] = i_6_;
		    Object object_7_ = objects[i_5_];
		    objects[i_5_] = objects[i_2_];
		    objects[i_2_++] = object_7_;
		}
	    }
	    is[i_0_] = is[i_2_];
	    is[i_2_] = i_3_;
	    objects[i_0_] = objects[i_2_];
	    objects[i_2_] = object;
	    Class160.method2617(is, objects, i, i_2_ - 1, -1355228170);
	    Class160.method2617(is, objects, i_2_ + 1, i_0_, -1735132953);
	}
    }
    
    public static void method10919(String[] strings, int[] is) {
	Class108.method1970(strings, is, 0, strings.length - 1, 704395531);
    }
    
    static void method10920(String[] strings, int[] is, int i, int i_8_) {
	if (i < i_8_) {
	    int i_9_ = (i_8_ + i) / 2;
	    int i_10_ = i;
	    String string = strings[i_9_];
	    strings[i_9_] = strings[i_8_];
	    strings[i_8_] = string;
	    int i_11_ = is[i_9_];
	    is[i_9_] = is[i_8_];
	    is[i_8_] = i_11_;
	    for (int i_12_ = i; i_12_ < i_8_; i_12_++) {
		if (string == null
		    || (strings[i_12_] != null
			&& strings[i_12_].compareTo(string) < (i_12_ & 0x1))) {
		    String string_13_ = strings[i_12_];
		    strings[i_12_] = strings[i_10_];
		    strings[i_10_] = string_13_;
		    int i_14_ = is[i_12_];
		    is[i_12_] = is[i_10_];
		    is[i_10_++] = i_14_;
		}
	    }
	    strings[i_8_] = strings[i_10_];
	    strings[i_10_] = string;
	    is[i_8_] = is[i_10_];
	    is[i_10_] = i_11_;
	    Class108.method1970(strings, is, i, i_10_ - 1, 1221785581);
	    Class108.method1970(strings, is, 1 + i_10_, i_8_, 964604300);
	}
    }
    
    static void method10921(String[] strings, int[] is, int i, int i_15_) {
	if (i < i_15_) {
	    int i_16_ = (i_15_ + i) / 2;
	    int i_17_ = i;
	    String string = strings[i_16_];
	    strings[i_16_] = strings[i_15_];
	    strings[i_15_] = string;
	    int i_18_ = is[i_16_];
	    is[i_16_] = is[i_15_];
	    is[i_15_] = i_18_;
	    for (int i_19_ = i; i_19_ < i_15_; i_19_++) {
		if (string == null
		    || (strings[i_19_] != null
			&& strings[i_19_].compareTo(string) < (i_19_ & 0x1))) {
		    String string_20_ = strings[i_19_];
		    strings[i_19_] = strings[i_17_];
		    strings[i_17_] = string_20_;
		    int i_21_ = is[i_19_];
		    is[i_19_] = is[i_17_];
		    is[i_17_++] = i_21_;
		}
	    }
	    strings[i_15_] = strings[i_17_];
	    strings[i_17_] = string;
	    is[i_15_] = is[i_17_];
	    is[i_17_] = i_18_;
	    Class108.method1970(strings, is, i, i_17_ - 1, -769811515);
	    Class108.method1970(strings, is, 1 + i_17_, i_15_, 762709183);
	}
    }
    
    public static void method10922(int[] is, int[] is_22_, int i, int i_23_) {
	if (i < i_23_) {
	    int i_24_ = (i_23_ + i) / 2;
	    int i_25_ = i;
	    int i_26_ = is[i_24_];
	    is[i_24_] = is[i_23_];
	    is[i_23_] = i_26_;
	    int i_27_ = is_22_[i_24_];
	    is_22_[i_24_] = is_22_[i_23_];
	    is_22_[i_23_] = i_27_;
	    int i_28_ = 2147483647 == i_26_ ? 0 : 1;
	    for (int i_29_ = i; i_29_ < i_23_; i_29_++) {
		if (is[i_29_] < (i_29_ & i_28_) + i_26_) {
		    int i_30_ = is[i_29_];
		    is[i_29_] = is[i_25_];
		    is[i_25_] = i_30_;
		    int i_31_ = is_22_[i_29_];
		    is_22_[i_29_] = is_22_[i_25_];
		    is_22_[i_25_++] = i_31_;
		}
	    }
	    is[i_23_] = is[i_25_];
	    is[i_25_] = i_26_;
	    is_22_[i_23_] = is_22_[i_25_];
	    is_22_[i_25_] = i_27_;
	    Class468.method7624(is, is_22_, i, i_25_ - 1, -999138089);
	    Class468.method7624(is, is_22_, 1 + i_25_, i_23_, 643914182);
	}
    }
    
    public static void method10923(String[] strings, int[] is) {
	Class108.method1970(strings, is, 0, strings.length - 1, 1554100);
    }
    
    public static void method10924(int[] is, int[] is_32_, int i, int i_33_) {
	if (i < i_33_) {
	    int i_34_ = (i_33_ + i) / 2;
	    int i_35_ = i;
	    int i_36_ = is[i_34_];
	    is[i_34_] = is[i_33_];
	    is[i_33_] = i_36_;
	    int i_37_ = is_32_[i_34_];
	    is_32_[i_34_] = is_32_[i_33_];
	    is_32_[i_33_] = i_37_;
	    int i_38_ = 2147483647 == i_36_ ? 0 : 1;
	    for (int i_39_ = i; i_39_ < i_33_; i_39_++) {
		if (is[i_39_] < (i_39_ & i_38_) + i_36_) {
		    int i_40_ = is[i_39_];
		    is[i_39_] = is[i_35_];
		    is[i_35_] = i_40_;
		    int i_41_ = is_32_[i_39_];
		    is_32_[i_39_] = is_32_[i_35_];
		    is_32_[i_35_++] = i_41_;
		}
	    }
	    is[i_33_] = is[i_35_];
	    is[i_35_] = i_36_;
	    is_32_[i_33_] = is_32_[i_35_];
	    is_32_[i_35_] = i_37_;
	    Class468.method7624(is, is_32_, i, i_35_ - 1, -206249239);
	    Class468.method7624(is, is_32_, 1 + i_35_, i_33_, -1557987733);
	}
    }
    
    static void method10925(long[] ls, int[] is, int i, int i_42_) {
	if (i < i_42_) {
	    int i_43_ = (i + i_42_) / 2;
	    int i_44_ = i;
	    long l = ls[i_43_];
	    ls[i_43_] = ls[i_42_];
	    ls[i_42_] = l;
	    int i_45_ = is[i_43_];
	    is[i_43_] = is[i_42_];
	    is[i_42_] = i_45_;
	    int i_46_ = 9223372036854775807L == l ? 0 : 1;
	    for (int i_47_ = i; i_47_ < i_42_; i_47_++) {
		if (ls[i_47_] < (long) (i_47_ & i_46_) + l) {
		    long l_48_ = ls[i_47_];
		    ls[i_47_] = ls[i_44_];
		    ls[i_44_] = l_48_;
		    int i_49_ = is[i_47_];
		    is[i_47_] = is[i_44_];
		    is[i_44_++] = i_49_;
		}
	    }
	    ls[i_42_] = ls[i_44_];
	    ls[i_44_] = l;
	    is[i_42_] = is[i_44_];
	    is[i_44_] = i_45_;
	    IsaacCipher.method650(ls, is, i, i_44_ - 1, -1354668087);
	    IsaacCipher.method650(ls, is, 1 + i_44_, i_42_, -1613859110);
	}
    }
    
    public static void method10926(long[] ls, int[] is) {
	IsaacCipher.method650(ls, is, 0, ls.length - 1, 1000238358);
    }
    
    public static void method10927(long[] ls, int[] is) {
	IsaacCipher.method650(ls, is, 0, ls.length - 1, -479056428);
    }
    
    static void method10928(int[] is, float[] fs, float[] fs_50_, int i,
			    int i_51_) {
	if (i < i_51_) {
	    int i_52_ = (i + i_51_) / 2;
	    int i_53_ = i;
	    int i_54_ = is[i_52_];
	    is[i_52_] = is[i_51_];
	    is[i_51_] = i_54_;
	    float f = fs[i_52_];
	    fs[i_52_] = fs[i_51_];
	    fs[i_51_] = f;
	    float f_55_ = fs_50_[i_52_];
	    fs_50_[i_52_] = fs_50_[i_51_];
	    fs_50_[i_51_] = f_55_;
	    int i_56_ = 9223372036854775807L == (long) i_54_ ? 0 : 1;
	    for (int i_57_ = i; i_57_ < i_51_; i_57_++) {
		if (is[i_57_] < (i_57_ & i_56_) + i_54_) {
		    int i_58_ = is[i_57_];
		    is[i_57_] = is[i_53_];
		    is[i_53_] = i_58_;
		    float f_59_ = fs[i_57_];
		    fs[i_57_] = fs[i_53_];
		    fs[i_53_] = f_59_;
		    float f_60_ = fs_50_[i_57_];
		    fs_50_[i_57_] = fs_50_[i_53_];
		    fs_50_[i_53_] = f_60_;
		    i_53_++;
		}
	    }
	    is[i_51_] = is[i_53_];
	    is[i_53_] = i_54_;
	    fs[i_51_] = fs[i_53_];
	    fs[i_53_] = f;
	    fs_50_[i_51_] = fs_50_[i_53_];
	    fs_50_[i_53_] = f_55_;
	    Class453_Sub5.method16009(is, fs, fs_50_, i, i_53_ - 1,
				      -1882703331);
	    Class453_Sub5.method16009(is, fs, fs_50_, 1 + i_53_, i_51_,
				      -1882703331);
	}
    }
    
    static void method10929(long[] ls, int[] is, int i, int i_61_) {
	if (i < i_61_) {
	    int i_62_ = (i + i_61_) / 2;
	    int i_63_ = i;
	    long l = ls[i_62_];
	    ls[i_62_] = ls[i_61_];
	    ls[i_61_] = l;
	    int i_64_ = is[i_62_];
	    is[i_62_] = is[i_61_];
	    is[i_61_] = i_64_;
	    int i_65_ = 9223372036854775807L == l ? 0 : 1;
	    for (int i_66_ = i; i_66_ < i_61_; i_66_++) {
		if (ls[i_66_] < (long) (i_66_ & i_65_) + l) {
		    long l_67_ = ls[i_66_];
		    ls[i_66_] = ls[i_63_];
		    ls[i_63_] = l_67_;
		    int i_68_ = is[i_66_];
		    is[i_66_] = is[i_63_];
		    is[i_63_++] = i_68_;
		}
	    }
	    ls[i_61_] = ls[i_63_];
	    ls[i_63_] = l;
	    is[i_61_] = is[i_63_];
	    is[i_63_] = i_64_;
	    IsaacCipher.method650(ls, is, i, i_63_ - 1, -881256425);
	    IsaacCipher.method650(ls, is, 1 + i_63_, i_61_, -1702573328);
	}
    }
    
    public static void method10930(float[] fs, int[] is, int i, int i_69_) {
	if (i < i_69_) {
	    int i_70_ = (i + i_69_) / 2;
	    int i_71_ = i;
	    float f = fs[i_70_];
	    fs[i_70_] = fs[i_69_];
	    fs[i_69_] = f;
	    int i_72_ = is[i_70_];
	    is[i_70_] = is[i_69_];
	    is[i_69_] = i_72_;
	    for (int i_73_ = i; i_73_ < i_69_; i_73_++) {
		if (fs[i_73_] > f) {
		    float f_74_ = fs[i_73_];
		    fs[i_73_] = fs[i_71_];
		    fs[i_71_] = f_74_;
		    int i_75_ = is[i_73_];
		    is[i_73_] = is[i_71_];
		    is[i_71_++] = i_75_;
		}
	    }
	    fs[i_69_] = fs[i_71_];
	    fs[i_71_] = f;
	    is[i_69_] = is[i_71_];
	    is[i_71_] = i_72_;
	    Class592.method9884(fs, is, i, i_71_ - 1, -456026135);
	    Class592.method9884(fs, is, i_71_ + 1, i_69_, 1063770988);
	}
    }
    
    Class660() throws Throwable {
	throw new Error();
    }
    
    public static void method10931(float[] fs, int[] is, int i, int i_76_) {
	if (i < i_76_) {
	    int i_77_ = (i + i_76_) / 2;
	    int i_78_ = i;
	    float f = fs[i_77_];
	    fs[i_77_] = fs[i_76_];
	    fs[i_76_] = f;
	    int i_79_ = is[i_77_];
	    is[i_77_] = is[i_76_];
	    is[i_76_] = i_79_;
	    for (int i_80_ = i; i_80_ < i_76_; i_80_++) {
		if (fs[i_80_] > f) {
		    float f_81_ = fs[i_80_];
		    fs[i_80_] = fs[i_78_];
		    fs[i_78_] = f_81_;
		    int i_82_ = is[i_80_];
		    is[i_80_] = is[i_78_];
		    is[i_78_++] = i_82_;
		}
	    }
	    fs[i_76_] = fs[i_78_];
	    fs[i_78_] = f;
	    is[i_76_] = is[i_78_];
	    is[i_78_] = i_79_;
	    Class592.method9884(fs, is, i, i_78_ - 1, 1683622507);
	    Class592.method9884(fs, is, i_78_ + 1, i_76_, 242662730);
	}
    }
    
    public static void method10932(float[] fs, int[] is, int i, int i_83_) {
	if (i < i_83_) {
	    int i_84_ = (i + i_83_) / 2;
	    int i_85_ = i;
	    float f = fs[i_84_];
	    fs[i_84_] = fs[i_83_];
	    fs[i_83_] = f;
	    int i_86_ = is[i_84_];
	    is[i_84_] = is[i_83_];
	    is[i_83_] = i_86_;
	    for (int i_87_ = i; i_87_ < i_83_; i_87_++) {
		if (fs[i_87_] > f) {
		    float f_88_ = fs[i_87_];
		    fs[i_87_] = fs[i_85_];
		    fs[i_85_] = f_88_;
		    int i_89_ = is[i_87_];
		    is[i_87_] = is[i_85_];
		    is[i_85_++] = i_89_;
		}
	    }
	    fs[i_83_] = fs[i_85_];
	    fs[i_85_] = f;
	    is[i_83_] = is[i_85_];
	    is[i_85_] = i_86_;
	    Class592.method9884(fs, is, i, i_85_ - 1, 941391492);
	    Class592.method9884(fs, is, i_85_ + 1, i_83_, 1165631206);
	}
    }
    
    public static void method10933(float[] fs, int[] is, int i, int i_90_) {
	if (i < i_90_) {
	    int i_91_ = (i + i_90_) / 2;
	    int i_92_ = i;
	    float f = fs[i_91_];
	    fs[i_91_] = fs[i_90_];
	    fs[i_90_] = f;
	    int i_93_ = is[i_91_];
	    is[i_91_] = is[i_90_];
	    is[i_90_] = i_93_;
	    for (int i_94_ = i; i_94_ < i_90_; i_94_++) {
		if (fs[i_94_] > f) {
		    float f_95_ = fs[i_94_];
		    fs[i_94_] = fs[i_92_];
		    fs[i_92_] = f_95_;
		    int i_96_ = is[i_94_];
		    is[i_94_] = is[i_92_];
		    is[i_92_++] = i_96_;
		}
	    }
	    fs[i_90_] = fs[i_92_];
	    fs[i_92_] = f;
	    is[i_90_] = is[i_92_];
	    is[i_92_] = i_93_;
	    Class592.method9884(fs, is, i, i_92_ - 1, 633671634);
	    Class592.method9884(fs, is, i_92_ + 1, i_90_, -533957851);
	}
    }
    
    public static void method10934(int[] is, float[] fs, float[] fs_97_) {
	Class453_Sub5.method16009(is, fs, fs_97_, 0, is.length - 1,
				  -1882703331);
    }
    
    public static void method10935(float[] fs, int[] is, int i, int i_98_) {
	if (i < i_98_) {
	    int i_99_ = (i + i_98_) / 2;
	    int i_100_ = i;
	    float f = fs[i_99_];
	    fs[i_99_] = fs[i_98_];
	    fs[i_98_] = f;
	    int i_101_ = is[i_99_];
	    is[i_99_] = is[i_98_];
	    is[i_98_] = i_101_;
	    for (int i_102_ = i; i_102_ < i_98_; i_102_++) {
		if (fs[i_102_] > f) {
		    float f_103_ = fs[i_102_];
		    fs[i_102_] = fs[i_100_];
		    fs[i_100_] = f_103_;
		    int i_104_ = is[i_102_];
		    is[i_102_] = is[i_100_];
		    is[i_100_++] = i_104_;
		}
	    }
	    fs[i_98_] = fs[i_100_];
	    fs[i_100_] = f;
	    is[i_98_] = is[i_100_];
	    is[i_100_] = i_101_;
	    Class592.method9884(fs, is, i, i_100_ - 1, 454961253);
	    Class592.method9884(fs, is, i_100_ + 1, i_98_, -415856689);
	}
    }
    
    static void method10936(int[] is, float[] fs, float[] fs_105_, int i,
			    int i_106_) {
	if (i < i_106_) {
	    int i_107_ = (i + i_106_) / 2;
	    int i_108_ = i;
	    int i_109_ = is[i_107_];
	    is[i_107_] = is[i_106_];
	    is[i_106_] = i_109_;
	    float f = fs[i_107_];
	    fs[i_107_] = fs[i_106_];
	    fs[i_106_] = f;
	    float f_110_ = fs_105_[i_107_];
	    fs_105_[i_107_] = fs_105_[i_106_];
	    fs_105_[i_106_] = f_110_;
	    int i_111_ = 9223372036854775807L == (long) i_109_ ? 0 : 1;
	    for (int i_112_ = i; i_112_ < i_106_; i_112_++) {
		if (is[i_112_] < (i_112_ & i_111_) + i_109_) {
		    int i_113_ = is[i_112_];
		    is[i_112_] = is[i_108_];
		    is[i_108_] = i_113_;
		    float f_114_ = fs[i_112_];
		    fs[i_112_] = fs[i_108_];
		    fs[i_108_] = f_114_;
		    float f_115_ = fs_105_[i_112_];
		    fs_105_[i_112_] = fs_105_[i_108_];
		    fs_105_[i_108_] = f_115_;
		    i_108_++;
		}
	    }
	    is[i_106_] = is[i_108_];
	    is[i_108_] = i_109_;
	    fs[i_106_] = fs[i_108_];
	    fs[i_108_] = f;
	    fs_105_[i_106_] = fs_105_[i_108_];
	    fs_105_[i_108_] = f_110_;
	    Class453_Sub5.method16009(is, fs, fs_105_, i, i_108_ - 1,
				      -1882703331);
	    Class453_Sub5.method16009(is, fs, fs_105_, 1 + i_108_, i_106_,
				      -1882703331);
	}
    }
    
    public static void method10937(int[] is, int[] is_116_, int i,
				   int i_117_) {
	if (i < i_117_) {
	    int i_118_ = (i_117_ + i) / 2;
	    int i_119_ = i;
	    int i_120_ = is[i_118_];
	    is[i_118_] = is[i_117_];
	    is[i_117_] = i_120_;
	    int i_121_ = is_116_[i_118_];
	    is_116_[i_118_] = is_116_[i_117_];
	    is_116_[i_117_] = i_121_;
	    int i_122_ = 2147483647 == i_120_ ? 0 : 1;
	    for (int i_123_ = i; i_123_ < i_117_; i_123_++) {
		if (is[i_123_] < (i_123_ & i_122_) + i_120_) {
		    int i_124_ = is[i_123_];
		    is[i_123_] = is[i_119_];
		    is[i_119_] = i_124_;
		    int i_125_ = is_116_[i_123_];
		    is_116_[i_123_] = is_116_[i_119_];
		    is_116_[i_119_++] = i_125_;
		}
	    }
	    is[i_117_] = is[i_119_];
	    is[i_119_] = i_120_;
	    is_116_[i_117_] = is_116_[i_119_];
	    is_116_[i_119_] = i_121_;
	    Class468.method7624(is, is_116_, i, i_119_ - 1, 1220786128);
	    Class468.method7624(is, is_116_, 1 + i_119_, i_117_, 936291517);
	}
    }
    
    static void method10938(int[] is, float[] fs, float[] fs_126_, int i,
			    int i_127_) {
	if (i < i_127_) {
	    int i_128_ = (i + i_127_) / 2;
	    int i_129_ = i;
	    int i_130_ = is[i_128_];
	    is[i_128_] = is[i_127_];
	    is[i_127_] = i_130_;
	    float f = fs[i_128_];
	    fs[i_128_] = fs[i_127_];
	    fs[i_127_] = f;
	    float f_131_ = fs_126_[i_128_];
	    fs_126_[i_128_] = fs_126_[i_127_];
	    fs_126_[i_127_] = f_131_;
	    int i_132_ = 9223372036854775807L == (long) i_130_ ? 0 : 1;
	    for (int i_133_ = i; i_133_ < i_127_; i_133_++) {
		if (is[i_133_] < (i_133_ & i_132_) + i_130_) {
		    int i_134_ = is[i_133_];
		    is[i_133_] = is[i_129_];
		    is[i_129_] = i_134_;
		    float f_135_ = fs[i_133_];
		    fs[i_133_] = fs[i_129_];
		    fs[i_129_] = f_135_;
		    float f_136_ = fs_126_[i_133_];
		    fs_126_[i_133_] = fs_126_[i_129_];
		    fs_126_[i_129_] = f_136_;
		    i_129_++;
		}
	    }
	    is[i_127_] = is[i_129_];
	    is[i_129_] = i_130_;
	    fs[i_127_] = fs[i_129_];
	    fs[i_129_] = f;
	    fs_126_[i_127_] = fs_126_[i_129_];
	    fs_126_[i_129_] = f_131_;
	    Class453_Sub5.method16009(is, fs, fs_126_, i, i_129_ - 1,
				      -1882703331);
	    Class453_Sub5.method16009(is, fs, fs_126_, 1 + i_129_, i_127_,
				      -1882703331);
	}
    }
    
    public static void method10939(int[] is, Object[] objects, int i,
				   int i_137_) {
	if (i < i_137_) {
	    int i_138_ = (i_137_ + i) / 2;
	    int i_139_ = i;
	    int i_140_ = is[i_138_];
	    is[i_138_] = is[i_137_];
	    is[i_137_] = i_140_;
	    Object object = objects[i_138_];
	    objects[i_138_] = objects[i_137_];
	    objects[i_137_] = object;
	    int i_141_ = 2147483647 == i_140_ ? 0 : 1;
	    for (int i_142_ = i; i_142_ < i_137_; i_142_++) {
		if (is[i_142_] < i_140_ + (i_142_ & i_141_)) {
		    int i_143_ = is[i_142_];
		    is[i_142_] = is[i_139_];
		    is[i_139_] = i_143_;
		    Object object_144_ = objects[i_142_];
		    objects[i_142_] = objects[i_139_];
		    objects[i_139_++] = object_144_;
		}
	    }
	    is[i_137_] = is[i_139_];
	    is[i_139_] = i_140_;
	    objects[i_137_] = objects[i_139_];
	    objects[i_139_] = object;
	    Class160.method2617(is, objects, i, i_139_ - 1, -47679976);
	    Class160.method2617(is, objects, i_139_ + 1, i_137_, -1320712260);
	}
    }
    
    public static void method10940(int[] is, Object[] objects, int i,
				   int i_145_) {
	if (i < i_145_) {
	    int i_146_ = (i_145_ + i) / 2;
	    int i_147_ = i;
	    int i_148_ = is[i_146_];
	    is[i_146_] = is[i_145_];
	    is[i_145_] = i_148_;
	    Object object = objects[i_146_];
	    objects[i_146_] = objects[i_145_];
	    objects[i_145_] = object;
	    int i_149_ = 2147483647 == i_148_ ? 0 : 1;
	    for (int i_150_ = i; i_150_ < i_145_; i_150_++) {
		if (is[i_150_] < i_148_ + (i_150_ & i_149_)) {
		    int i_151_ = is[i_150_];
		    is[i_150_] = is[i_147_];
		    is[i_147_] = i_151_;
		    Object object_152_ = objects[i_150_];
		    objects[i_150_] = objects[i_147_];
		    objects[i_147_++] = object_152_;
		}
	    }
	    is[i_145_] = is[i_147_];
	    is[i_147_] = i_148_;
	    objects[i_145_] = objects[i_147_];
	    objects[i_147_] = object;
	    Class160.method2617(is, objects, i, i_147_ - 1, -1515477132);
	    Class160.method2617(is, objects, i_147_ + 1, i_145_, -1237331956);
	}
    }
    
    static void method10941(String[] strings, int[] is, int i, int i_153_) {
	if (i < i_153_) {
	    int i_154_ = (i_153_ + i) / 2;
	    int i_155_ = i;
	    String string = strings[i_154_];
	    strings[i_154_] = strings[i_153_];
	    strings[i_153_] = string;
	    int i_156_ = is[i_154_];
	    is[i_154_] = is[i_153_];
	    is[i_153_] = i_156_;
	    for (int i_157_ = i; i_157_ < i_153_; i_157_++) {
		if (string == null
		    || (strings[i_157_] != null
			&& strings[i_157_].compareTo(string) < (i_157_
								& 0x1))) {
		    String string_158_ = strings[i_157_];
		    strings[i_157_] = strings[i_155_];
		    strings[i_155_] = string_158_;
		    int i_159_ = is[i_157_];
		    is[i_157_] = is[i_155_];
		    is[i_155_++] = i_159_;
		}
	    }
	    strings[i_153_] = strings[i_155_];
	    strings[i_155_] = string;
	    is[i_153_] = is[i_155_];
	    is[i_155_] = i_156_;
	    Class108.method1970(strings, is, i, i_155_ - 1, -379520432);
	    Class108.method1970(strings, is, 1 + i_155_, i_153_, -744483480);
	}
    }
    
    public static void method10942(long[] ls, Object[] objects) {
	Class605.method10034(ls, objects, 0, ls.length - 1, 1890071027);
    }
    
    static void method10943(int[] is, float[] fs, float[] fs_160_, int i,
			    int i_161_) {
	if (i < i_161_) {
	    int i_162_ = (i + i_161_) / 2;
	    int i_163_ = i;
	    int i_164_ = is[i_162_];
	    is[i_162_] = is[i_161_];
	    is[i_161_] = i_164_;
	    float f = fs[i_162_];
	    fs[i_162_] = fs[i_161_];
	    fs[i_161_] = f;
	    float f_165_ = fs_160_[i_162_];
	    fs_160_[i_162_] = fs_160_[i_161_];
	    fs_160_[i_161_] = f_165_;
	    int i_166_ = 9223372036854775807L == (long) i_164_ ? 0 : 1;
	    for (int i_167_ = i; i_167_ < i_161_; i_167_++) {
		if (is[i_167_] < (i_167_ & i_166_) + i_164_) {
		    int i_168_ = is[i_167_];
		    is[i_167_] = is[i_163_];
		    is[i_163_] = i_168_;
		    float f_169_ = fs[i_167_];
		    fs[i_167_] = fs[i_163_];
		    fs[i_163_] = f_169_;
		    float f_170_ = fs_160_[i_167_];
		    fs_160_[i_167_] = fs_160_[i_163_];
		    fs_160_[i_163_] = f_170_;
		    i_163_++;
		}
	    }
	    is[i_161_] = is[i_163_];
	    is[i_163_] = i_164_;
	    fs[i_161_] = fs[i_163_];
	    fs[i_163_] = f;
	    fs_160_[i_161_] = fs_160_[i_163_];
	    fs_160_[i_163_] = f_165_;
	    Class453_Sub5.method16009(is, fs, fs_160_, i, i_163_ - 1,
				      -1882703331);
	    Class453_Sub5.method16009(is, fs, fs_160_, 1 + i_163_, i_161_,
				      -1882703331);
	}
    }
    
    public static void method10944(long[] ls, Object[] objects) {
	Class605.method10034(ls, objects, 0, ls.length - 1, 1880319232);
    }
    
    static final void method10945(Class669 class669, int i) {
	int i_171_ = (class669.anIntArray8595
		      [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_171_, 399956812);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_171_ >> 16];
	Class536.method8907(class247, class243, class669, (short) -256);
    }
    
    static final void method10946(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class206_Sub1.method15707(class247, class243, class669, (byte) -43);
    }
    
    static final void method10947(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aClass631_12226
		!= null)
	       && (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aClass631_12226
		   .aBool8206)) ? 1 : 0;
    }
    
    static final void method10948(Class247 class247, Class669 class669,
				  byte i) {
	int i_172_ = 10;
	Class63.method1281(class247, i_172_, class669, 1774272638);
    }
    
    public static Class163 method10949(int i) {
	return Class574.aClass163_7706;
    }
    
    static void method10950(int i, int i_173_) {
	Class534_Sub5.anInt10413 = -2060961383 * i;
	Class534_Sub5.aClass203_10412.method3877(-1641504603);
    }
}
