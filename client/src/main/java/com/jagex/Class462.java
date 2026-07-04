/* Class462 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class462
{
    int[] anIntArray5074;
    int anInt5075;
    byte[] aByteArray5076;
    int anInt5077;
    int anInt5078;
    byte[][] aByteArrayArray5079;
    int[] anIntArray5080;
    Class275 aClass275_5081;
    int anInt5082;
    int[] anIntArray5083;
    int[] anIntArray5084;
    int[] anIntArray5085;
    int[] anIntArray5086;
    int[] anIntArray5087;
    static final int anInt5088 = 7;
    int[] anIntArray5089;
    int[][] anIntArrayArray5090;
    int[][] anIntArrayArray5091;
    Class275[] aClass275Array5092;
    int[] anIntArray5093;
    static int anInt5094;
    
    void method7513(byte[] is) {
	Class534_Sub40 class534_sub40
	    = new Class534_Sub40(Class465.method7572(is, (byte) -12));
	int i = class534_sub40.method16527(1537451084);
	if (i < 5 || i > 7)
	    throw new RuntimeException();
	if (i >= 6)
	    anInt5077 = class534_sub40.method16533(-258848859) * -1069294537;
	else
	    anInt5077 = 0;
	int i_0_ = class534_sub40.method16527(-1332251095);
	boolean bool = (i_0_ & 0x1) != 0;
	boolean bool_1_ = 0 != (i_0_ & 0x2);
	boolean bool_2_ = 0 != (i_0_ & 0x4);
	boolean bool_3_ = 0 != (i_0_ & 0x8);
	if (i >= 7)
	    anInt5078 = class534_sub40.method16549(589799520) * -1433390337;
	else
	    anInt5078 = class534_sub40.method16529((byte) 1) * -1433390337;
	int i_4_ = 0;
	int i_5_ = -1;
	anIntArray5086 = new int[-1069101825 * anInt5078];
	if (i >= 7) {
	    for (int i_6_ = 0; i_6_ < -1069101825 * anInt5078; i_6_++) {
		anIntArray5086[i_6_] = i_4_
		    += class534_sub40.method16549(1074921925);
		if (anIntArray5086[i_6_] > i_5_)
		    i_5_ = anIntArray5086[i_6_];
	    }
	} else {
	    for (int i_7_ = 0; i_7_ < anInt5078 * -1069101825; i_7_++) {
		anIntArray5086[i_7_] = i_4_
		    += class534_sub40.method16529((byte) 1);
		if (anIntArray5086[i_7_] > i_5_)
		    i_5_ = anIntArray5086[i_7_];
	    }
	}
	anInt5082 = 1088977275 * (1 + i_5_);
	anIntArray5083 = new int[anInt5082 * -540639821];
	if (bool_3_)
	    anIntArray5084 = new int[-540639821 * anInt5082];
	if (bool_1_)
	    aByteArrayArray5079 = new byte[anInt5082 * -540639821][];
	anIntArray5093 = new int[anInt5082 * -540639821];
	anIntArray5074 = new int[-540639821 * anInt5082];
	anIntArrayArray5090 = new int[-540639821 * anInt5082][];
	anIntArray5085 = new int[anInt5082 * -540639821];
	if (bool) {
	    anIntArray5080 = new int[-540639821 * anInt5082];
	    for (int i_8_ = 0; i_8_ < -540639821 * anInt5082; i_8_++)
		anIntArray5080[i_8_] = -1;
	    for (int i_9_ = 0; i_9_ < anInt5078 * -1069101825; i_9_++)
		anIntArray5080[anIntArray5086[i_9_]]
		    = class534_sub40.method16533(-258848859);
	    aClass275_5081 = new Class275(anIntArray5080);
	}
	for (int i_10_ = 0; i_10_ < anInt5078 * -1069101825; i_10_++)
	    anIntArray5083[anIntArray5086[i_10_]]
		= class534_sub40.method16533(-258848859);
	if (bool_3_) {
	    for (int i_11_ = 0; i_11_ < -1069101825 * anInt5078; i_11_++)
		anIntArray5084[i_11_] = class534_sub40.method16533(-258848859);
	}
	if (bool_1_) {
	    for (int i_12_ = 0; i_12_ < anInt5078 * -1069101825; i_12_++) {
		byte[] is_13_ = new byte[64];
		class534_sub40.method16735(is_13_, 0, 64, (short) -27552);
		aByteArrayArray5079[anIntArray5086[i_12_]] = is_13_;
	    }
	}
	if (bool_2_) {
	    anIntArray5087 = new int[anInt5082 * -540639821];
	    anIntArray5089 = new int[-540639821 * anInt5082];
	    for (int i_14_ = 0; i_14_ < anInt5078 * -1069101825; i_14_++) {
		anIntArray5087[anIntArray5086[i_14_]]
		    = class534_sub40.method16533(-258848859);
		anIntArray5089[anIntArray5086[i_14_]]
		    = class534_sub40.method16533(-258848859);
	    }
	}
	for (int i_15_ = 0; i_15_ < anInt5078 * -1069101825; i_15_++)
	    anIntArray5093[anIntArray5086[i_15_]]
		= class534_sub40.method16533(-258848859);
	if (i >= 7) {
	    for (int i_16_ = 0; i_16_ < anInt5078 * -1069101825; i_16_++)
		anIntArray5074[anIntArray5086[i_16_]]
		    = class534_sub40.method16549(-116937804);
	    for (int i_17_ = 0; i_17_ < -1069101825 * anInt5078; i_17_++) {
		int i_18_ = anIntArray5086[i_17_];
		int i_19_ = anIntArray5074[i_18_];
		i_4_ = 0;
		int i_20_ = -1;
		anIntArrayArray5090[i_18_] = new int[i_19_];
		for (int i_21_ = 0; i_21_ < i_19_; i_21_++) {
		    int i_22_ = (anIntArrayArray5090[i_18_][i_21_] = i_4_
				 += class534_sub40.method16549(392470415));
		    if (i_22_ > i_20_)
			i_20_ = i_22_;
		}
		anIntArray5085[i_18_] = i_20_ + 1;
		if (i_19_ == 1 + i_20_)
		    anIntArrayArray5090[i_18_] = null;
	    }
	} else {
	    for (int i_23_ = 0; i_23_ < anInt5078 * -1069101825; i_23_++)
		anIntArray5074[anIntArray5086[i_23_]]
		    = class534_sub40.method16529((byte) 1);
	    for (int i_24_ = 0; i_24_ < -1069101825 * anInt5078; i_24_++) {
		int i_25_ = anIntArray5086[i_24_];
		int i_26_ = anIntArray5074[i_25_];
		i_4_ = 0;
		int i_27_ = -1;
		anIntArrayArray5090[i_25_] = new int[i_26_];
		for (int i_28_ = 0; i_28_ < i_26_; i_28_++) {
		    int i_29_ = (anIntArrayArray5090[i_25_][i_28_] = i_4_
				 += class534_sub40.method16529((byte) 1));
		    if (i_29_ > i_27_)
			i_27_ = i_29_;
		}
		anIntArray5085[i_25_] = 1 + i_27_;
		if (i_26_ == i_27_ + 1)
		    anIntArrayArray5090[i_25_] = null;
	    }
	}
	if (bool) {
	    anIntArrayArray5091 = new int[i_5_ + 1][];
	    aClass275Array5092 = new Class275[1 + i_5_];
	    for (int i_30_ = 0; i_30_ < anInt5078 * -1069101825; i_30_++) {
		int i_31_ = anIntArray5086[i_30_];
		int i_32_ = anIntArray5074[i_31_];
		anIntArrayArray5091[i_31_] = new int[anIntArray5085[i_31_]];
		for (int i_33_ = 0; i_33_ < anIntArray5085[i_31_]; i_33_++)
		    anIntArrayArray5091[i_31_][i_33_] = -1;
		for (int i_34_ = 0; i_34_ < i_32_; i_34_++) {
		    int i_35_;
		    if (anIntArrayArray5090[i_31_] != null)
			i_35_ = anIntArrayArray5090[i_31_][i_34_];
		    else
			i_35_ = i_34_;
		    anIntArrayArray5091[i_31_][i_35_]
			= class534_sub40.method16533(-258848859);
		}
		aClass275Array5092[i_31_]
		    = new Class275(anIntArrayArray5091[i_31_]);
	    }
	}
    }
    
    void method7514(byte[] is, int i) {
	Class534_Sub40 class534_sub40
	    = new Class534_Sub40(Class465.method7572(is, (byte) 68));
	int i_36_ = class534_sub40.method16527(-2090714710);
	if (i_36_ < 5 || i_36_ > 7)
	    throw new RuntimeException();
	if (i_36_ >= 6)
	    anInt5077 = class534_sub40.method16533(-258848859) * -1069294537;
	else
	    anInt5077 = 0;
	int i_37_ = class534_sub40.method16527(-737810085);
	boolean bool = (i_37_ & 0x1) != 0;
	boolean bool_38_ = 0 != (i_37_ & 0x2);
	boolean bool_39_ = 0 != (i_37_ & 0x4);
	boolean bool_40_ = 0 != (i_37_ & 0x8);
	if (i_36_ >= 7)
	    anInt5078 = class534_sub40.method16549(1539599234) * -1433390337;
	else
	    anInt5078 = class534_sub40.method16529((byte) 1) * -1433390337;
	int i_41_ = 0;
	int i_42_ = -1;
	anIntArray5086 = new int[-1069101825 * anInt5078];
	if (i_36_ >= 7) {
	    for (int i_43_ = 0; i_43_ < -1069101825 * anInt5078; i_43_++) {
		anIntArray5086[i_43_] = i_41_
		    += class534_sub40.method16549(573629539);
		if (anIntArray5086[i_43_] > i_42_)
		    i_42_ = anIntArray5086[i_43_];
	    }
	} else {
	    for (int i_44_ = 0; i_44_ < anInt5078 * -1069101825; i_44_++) {
		anIntArray5086[i_44_] = i_41_
		    += class534_sub40.method16529((byte) 1);
		if (anIntArray5086[i_44_] > i_42_)
		    i_42_ = anIntArray5086[i_44_];
	    }
	}
	anInt5082 = 1088977275 * (1 + i_42_);
	anIntArray5083 = new int[anInt5082 * -540639821];
	if (bool_40_)
	    anIntArray5084 = new int[-540639821 * anInt5082];
	if (bool_38_)
	    aByteArrayArray5079 = new byte[anInt5082 * -540639821][];
	anIntArray5093 = new int[anInt5082 * -540639821];
	anIntArray5074 = new int[-540639821 * anInt5082];
	anIntArrayArray5090 = new int[-540639821 * anInt5082][];
	anIntArray5085 = new int[anInt5082 * -540639821];
	if (bool) {
	    anIntArray5080 = new int[-540639821 * anInt5082];
	    for (int i_45_ = 0; i_45_ < -540639821 * anInt5082; i_45_++)
		anIntArray5080[i_45_] = -1;
	    for (int i_46_ = 0; i_46_ < anInt5078 * -1069101825; i_46_++)
		anIntArray5080[anIntArray5086[i_46_]]
		    = class534_sub40.method16533(-258848859);
	    aClass275_5081 = new Class275(anIntArray5080);
	}
	for (int i_47_ = 0; i_47_ < anInt5078 * -1069101825; i_47_++)
	    anIntArray5083[anIntArray5086[i_47_]]
		= class534_sub40.method16533(-258848859);
	if (bool_40_) {
	    for (int i_48_ = 0; i_48_ < -1069101825 * anInt5078; i_48_++)
		anIntArray5084[i_48_] = class534_sub40.method16533(-258848859);
	}
	if (bool_38_) {
	    for (int i_49_ = 0; i_49_ < anInt5078 * -1069101825; i_49_++) {
		byte[] is_50_ = new byte[64];
		class534_sub40.method16735(is_50_, 0, 64, (short) -7886);
		aByteArrayArray5079[anIntArray5086[i_49_]] = is_50_;
	    }
	}
	if (bool_39_) {
	    anIntArray5087 = new int[anInt5082 * -540639821];
	    anIntArray5089 = new int[-540639821 * anInt5082];
	    for (int i_51_ = 0; i_51_ < anInt5078 * -1069101825; i_51_++) {
		anIntArray5087[anIntArray5086[i_51_]]
		    = class534_sub40.method16533(-258848859);
		anIntArray5089[anIntArray5086[i_51_]]
		    = class534_sub40.method16533(-258848859);
	    }
	}
	for (int i_52_ = 0; i_52_ < anInt5078 * -1069101825; i_52_++)
	    anIntArray5093[anIntArray5086[i_52_]]
		= class534_sub40.method16533(-258848859);
	if (i_36_ >= 7) {
	    for (int i_53_ = 0; i_53_ < anInt5078 * -1069101825; i_53_++)
		anIntArray5074[anIntArray5086[i_53_]]
		    = class534_sub40.method16549(-384964688);
	    for (int i_54_ = 0; i_54_ < -1069101825 * anInt5078; i_54_++) {
		int i_55_ = anIntArray5086[i_54_];
		int i_56_ = anIntArray5074[i_55_];
		i_41_ = 0;
		int i_57_ = -1;
		anIntArrayArray5090[i_55_] = new int[i_56_];
		for (int i_58_ = 0; i_58_ < i_56_; i_58_++) {
		    int i_59_ = (anIntArrayArray5090[i_55_][i_58_] = i_41_
				 += class534_sub40.method16549(-959532525));
		    if (i_59_ > i_57_)
			i_57_ = i_59_;
		}
		anIntArray5085[i_55_] = i_57_ + 1;
		if (i_56_ == 1 + i_57_)
		    anIntArrayArray5090[i_55_] = null;
	    }
	} else {
	    for (int i_60_ = 0; i_60_ < anInt5078 * -1069101825; i_60_++)
		anIntArray5074[anIntArray5086[i_60_]]
		    = class534_sub40.method16529((byte) 1);
	    for (int i_61_ = 0; i_61_ < -1069101825 * anInt5078; i_61_++) {
		int i_62_ = anIntArray5086[i_61_];
		int i_63_ = anIntArray5074[i_62_];
		i_41_ = 0;
		int i_64_ = -1;
		anIntArrayArray5090[i_62_] = new int[i_63_];
		for (int i_65_ = 0; i_65_ < i_63_; i_65_++) {
		    int i_66_ = (anIntArrayArray5090[i_62_][i_65_] = i_41_
				 += class534_sub40.method16529((byte) 1));
		    if (i_66_ > i_64_)
			i_64_ = i_66_;
		}
		anIntArray5085[i_62_] = 1 + i_64_;
		if (i_63_ == i_64_ + 1)
		    anIntArrayArray5090[i_62_] = null;
	    }
	}
	if (bool) {
	    anIntArrayArray5091 = new int[i_42_ + 1][];
	    aClass275Array5092 = new Class275[1 + i_42_];
	    for (int i_67_ = 0; i_67_ < anInt5078 * -1069101825; i_67_++) {
		int i_68_ = anIntArray5086[i_67_];
		int i_69_ = anIntArray5074[i_68_];
		anIntArrayArray5091[i_68_] = new int[anIntArray5085[i_68_]];
		for (int i_70_ = 0; i_70_ < anIntArray5085[i_68_]; i_70_++)
		    anIntArrayArray5091[i_68_][i_70_] = -1;
		for (int i_71_ = 0; i_71_ < i_69_; i_71_++) {
		    int i_72_;
		    if (anIntArrayArray5090[i_68_] != null)
			i_72_ = anIntArrayArray5090[i_68_][i_71_];
		    else
			i_72_ = i_71_;
		    anIntArrayArray5091[i_68_][i_72_]
			= class534_sub40.method16533(-258848859);
		}
		aClass275Array5092[i_68_]
		    = new Class275(anIntArrayArray5091[i_68_]);
	    }
	}
    }
    
    void method7515(byte[] is) {
	Class534_Sub40 class534_sub40
	    = new Class534_Sub40(Class465.method7572(is, (byte) 94));
	int i = class534_sub40.method16527(1445616670);
	if (i < 5 || i > 7)
	    throw new RuntimeException();
	if (i >= 6)
	    anInt5077 = class534_sub40.method16533(-258848859) * -1069294537;
	else
	    anInt5077 = 0;
	int i_73_ = class534_sub40.method16527(-653643388);
	boolean bool = (i_73_ & 0x1) != 0;
	boolean bool_74_ = 0 != (i_73_ & 0x2);
	boolean bool_75_ = 0 != (i_73_ & 0x4);
	boolean bool_76_ = 0 != (i_73_ & 0x8);
	if (i >= 7)
	    anInt5078 = class534_sub40.method16549(1681060193) * -1433390337;
	else
	    anInt5078 = class534_sub40.method16529((byte) 1) * -1433390337;
	int i_77_ = 0;
	int i_78_ = -1;
	anIntArray5086 = new int[-1069101825 * anInt5078];
	if (i >= 7) {
	    for (int i_79_ = 0; i_79_ < -1069101825 * anInt5078; i_79_++) {
		anIntArray5086[i_79_] = i_77_
		    += class534_sub40.method16549(1724913295);
		if (anIntArray5086[i_79_] > i_78_)
		    i_78_ = anIntArray5086[i_79_];
	    }
	} else {
	    for (int i_80_ = 0; i_80_ < anInt5078 * -1069101825; i_80_++) {
		anIntArray5086[i_80_] = i_77_
		    += class534_sub40.method16529((byte) 1);
		if (anIntArray5086[i_80_] > i_78_)
		    i_78_ = anIntArray5086[i_80_];
	    }
	}
	anInt5082 = 1088977275 * (1 + i_78_);
	anIntArray5083 = new int[anInt5082 * -540639821];
	if (bool_76_)
	    anIntArray5084 = new int[-540639821 * anInt5082];
	if (bool_74_)
	    aByteArrayArray5079 = new byte[anInt5082 * -540639821][];
	anIntArray5093 = new int[anInt5082 * -540639821];
	anIntArray5074 = new int[-540639821 * anInt5082];
	anIntArrayArray5090 = new int[-540639821 * anInt5082][];
	anIntArray5085 = new int[anInt5082 * -540639821];
	if (bool) {
	    anIntArray5080 = new int[-540639821 * anInt5082];
	    for (int i_81_ = 0; i_81_ < -540639821 * anInt5082; i_81_++)
		anIntArray5080[i_81_] = -1;
	    for (int i_82_ = 0; i_82_ < anInt5078 * -1069101825; i_82_++)
		anIntArray5080[anIntArray5086[i_82_]]
		    = class534_sub40.method16533(-258848859);
	    aClass275_5081 = new Class275(anIntArray5080);
	}
	for (int i_83_ = 0; i_83_ < anInt5078 * -1069101825; i_83_++)
	    anIntArray5083[anIntArray5086[i_83_]]
		= class534_sub40.method16533(-258848859);
	if (bool_76_) {
	    for (int i_84_ = 0; i_84_ < -1069101825 * anInt5078; i_84_++)
		anIntArray5084[i_84_] = class534_sub40.method16533(-258848859);
	}
	if (bool_74_) {
	    for (int i_85_ = 0; i_85_ < anInt5078 * -1069101825; i_85_++) {
		byte[] is_86_ = new byte[64];
		class534_sub40.method16735(is_86_, 0, 64, (short) -9776);
		aByteArrayArray5079[anIntArray5086[i_85_]] = is_86_;
	    }
	}
	if (bool_75_) {
	    anIntArray5087 = new int[anInt5082 * -540639821];
	    anIntArray5089 = new int[-540639821 * anInt5082];
	    for (int i_87_ = 0; i_87_ < anInt5078 * -1069101825; i_87_++) {
		anIntArray5087[anIntArray5086[i_87_]]
		    = class534_sub40.method16533(-258848859);
		anIntArray5089[anIntArray5086[i_87_]]
		    = class534_sub40.method16533(-258848859);
	    }
	}
	for (int i_88_ = 0; i_88_ < anInt5078 * -1069101825; i_88_++)
	    anIntArray5093[anIntArray5086[i_88_]]
		= class534_sub40.method16533(-258848859);
	if (i >= 7) {
	    for (int i_89_ = 0; i_89_ < anInt5078 * -1069101825; i_89_++)
		anIntArray5074[anIntArray5086[i_89_]]
		    = class534_sub40.method16549(1866525312);
	    for (int i_90_ = 0; i_90_ < -1069101825 * anInt5078; i_90_++) {
		int i_91_ = anIntArray5086[i_90_];
		int i_92_ = anIntArray5074[i_91_];
		i_77_ = 0;
		int i_93_ = -1;
		anIntArrayArray5090[i_91_] = new int[i_92_];
		for (int i_94_ = 0; i_94_ < i_92_; i_94_++) {
		    int i_95_ = (anIntArrayArray5090[i_91_][i_94_] = i_77_
				 += class534_sub40.method16549(-757623296));
		    if (i_95_ > i_93_)
			i_93_ = i_95_;
		}
		anIntArray5085[i_91_] = i_93_ + 1;
		if (i_92_ == 1 + i_93_)
		    anIntArrayArray5090[i_91_] = null;
	    }
	} else {
	    for (int i_96_ = 0; i_96_ < anInt5078 * -1069101825; i_96_++)
		anIntArray5074[anIntArray5086[i_96_]]
		    = class534_sub40.method16529((byte) 1);
	    for (int i_97_ = 0; i_97_ < -1069101825 * anInt5078; i_97_++) {
		int i_98_ = anIntArray5086[i_97_];
		int i_99_ = anIntArray5074[i_98_];
		i_77_ = 0;
		int i_100_ = -1;
		anIntArrayArray5090[i_98_] = new int[i_99_];
		for (int i_101_ = 0; i_101_ < i_99_; i_101_++) {
		    int i_102_ = (anIntArrayArray5090[i_98_][i_101_] = i_77_
				  += class534_sub40.method16529((byte) 1));
		    if (i_102_ > i_100_)
			i_100_ = i_102_;
		}
		anIntArray5085[i_98_] = 1 + i_100_;
		if (i_99_ == i_100_ + 1)
		    anIntArrayArray5090[i_98_] = null;
	    }
	}
	if (bool) {
	    anIntArrayArray5091 = new int[i_78_ + 1][];
	    aClass275Array5092 = new Class275[1 + i_78_];
	    for (int i_103_ = 0; i_103_ < anInt5078 * -1069101825; i_103_++) {
		int i_104_ = anIntArray5086[i_103_];
		int i_105_ = anIntArray5074[i_104_];
		anIntArrayArray5091[i_104_] = new int[anIntArray5085[i_104_]];
		for (int i_106_ = 0; i_106_ < anIntArray5085[i_104_]; i_106_++)
		    anIntArrayArray5091[i_104_][i_106_] = -1;
		for (int i_107_ = 0; i_107_ < i_105_; i_107_++) {
		    int i_108_;
		    if (anIntArrayArray5090[i_104_] != null)
			i_108_ = anIntArrayArray5090[i_104_][i_107_];
		    else
			i_108_ = i_107_;
		    anIntArrayArray5091[i_104_][i_108_]
			= class534_sub40.method16533(-258848859);
		}
		aClass275Array5092[i_104_]
		    = new Class275(anIntArrayArray5091[i_104_]);
	    }
	}
    }
    
    void method7516(byte[] is) {
	Class534_Sub40 class534_sub40
	    = new Class534_Sub40(Class465.method7572(is, (byte) -98));
	int i = class534_sub40.method16527(1011309795);
	if (i < 5 || i > 7)
	    throw new RuntimeException();
	if (i >= 6)
	    anInt5077 = class534_sub40.method16533(-258848859) * -1069294537;
	else
	    anInt5077 = 0;
	int i_109_ = class534_sub40.method16527(-1014452595);
	boolean bool = (i_109_ & 0x1) != 0;
	boolean bool_110_ = 0 != (i_109_ & 0x2);
	boolean bool_111_ = 0 != (i_109_ & 0x4);
	boolean bool_112_ = 0 != (i_109_ & 0x8);
	if (i >= 7)
	    anInt5078 = class534_sub40.method16549(441490288) * -1433390337;
	else
	    anInt5078 = class534_sub40.method16529((byte) 1) * -1433390337;
	int i_113_ = 0;
	int i_114_ = -1;
	anIntArray5086 = new int[-1069101825 * anInt5078];
	if (i >= 7) {
	    for (int i_115_ = 0; i_115_ < -1069101825 * anInt5078; i_115_++) {
		anIntArray5086[i_115_] = i_113_
		    += class534_sub40.method16549(572794469);
		if (anIntArray5086[i_115_] > i_114_)
		    i_114_ = anIntArray5086[i_115_];
	    }
	} else {
	    for (int i_116_ = 0; i_116_ < anInt5078 * -1069101825; i_116_++) {
		anIntArray5086[i_116_] = i_113_
		    += class534_sub40.method16529((byte) 1);
		if (anIntArray5086[i_116_] > i_114_)
		    i_114_ = anIntArray5086[i_116_];
	    }
	}
	anInt5082 = 1088977275 * (1 + i_114_);
	anIntArray5083 = new int[anInt5082 * -540639821];
	if (bool_112_)
	    anIntArray5084 = new int[-540639821 * anInt5082];
	if (bool_110_)
	    aByteArrayArray5079 = new byte[anInt5082 * -540639821][];
	anIntArray5093 = new int[anInt5082 * -540639821];
	anIntArray5074 = new int[-540639821 * anInt5082];
	anIntArrayArray5090 = new int[-540639821 * anInt5082][];
	anIntArray5085 = new int[anInt5082 * -540639821];
	if (bool) {
	    anIntArray5080 = new int[-540639821 * anInt5082];
	    for (int i_117_ = 0; i_117_ < -540639821 * anInt5082; i_117_++)
		anIntArray5080[i_117_] = -1;
	    for (int i_118_ = 0; i_118_ < anInt5078 * -1069101825; i_118_++)
		anIntArray5080[anIntArray5086[i_118_]]
		    = class534_sub40.method16533(-258848859);
	    aClass275_5081 = new Class275(anIntArray5080);
	}
	for (int i_119_ = 0; i_119_ < anInt5078 * -1069101825; i_119_++)
	    anIntArray5083[anIntArray5086[i_119_]]
		= class534_sub40.method16533(-258848859);
	if (bool_112_) {
	    for (int i_120_ = 0; i_120_ < -1069101825 * anInt5078; i_120_++)
		anIntArray5084[i_120_]
		    = class534_sub40.method16533(-258848859);
	}
	if (bool_110_) {
	    for (int i_121_ = 0; i_121_ < anInt5078 * -1069101825; i_121_++) {
		byte[] is_122_ = new byte[64];
		class534_sub40.method16735(is_122_, 0, 64, (short) -21582);
		aByteArrayArray5079[anIntArray5086[i_121_]] = is_122_;
	    }
	}
	if (bool_111_) {
	    anIntArray5087 = new int[anInt5082 * -540639821];
	    anIntArray5089 = new int[-540639821 * anInt5082];
	    for (int i_123_ = 0; i_123_ < anInt5078 * -1069101825; i_123_++) {
		anIntArray5087[anIntArray5086[i_123_]]
		    = class534_sub40.method16533(-258848859);
		anIntArray5089[anIntArray5086[i_123_]]
		    = class534_sub40.method16533(-258848859);
	    }
	}
	for (int i_124_ = 0; i_124_ < anInt5078 * -1069101825; i_124_++)
	    anIntArray5093[anIntArray5086[i_124_]]
		= class534_sub40.method16533(-258848859);
	if (i >= 7) {
	    for (int i_125_ = 0; i_125_ < anInt5078 * -1069101825; i_125_++)
		anIntArray5074[anIntArray5086[i_125_]]
		    = class534_sub40.method16549(-546097441);
	    for (int i_126_ = 0; i_126_ < -1069101825 * anInt5078; i_126_++) {
		int i_127_ = anIntArray5086[i_126_];
		int i_128_ = anIntArray5074[i_127_];
		i_113_ = 0;
		int i_129_ = -1;
		anIntArrayArray5090[i_127_] = new int[i_128_];
		for (int i_130_ = 0; i_130_ < i_128_; i_130_++) {
		    int i_131_ = (anIntArrayArray5090[i_127_][i_130_] = i_113_
				  += class534_sub40.method16549(409156768));
		    if (i_131_ > i_129_)
			i_129_ = i_131_;
		}
		anIntArray5085[i_127_] = i_129_ + 1;
		if (i_128_ == 1 + i_129_)
		    anIntArrayArray5090[i_127_] = null;
	    }
	} else {
	    for (int i_132_ = 0; i_132_ < anInt5078 * -1069101825; i_132_++)
		anIntArray5074[anIntArray5086[i_132_]]
		    = class534_sub40.method16529((byte) 1);
	    for (int i_133_ = 0; i_133_ < -1069101825 * anInt5078; i_133_++) {
		int i_134_ = anIntArray5086[i_133_];
		int i_135_ = anIntArray5074[i_134_];
		i_113_ = 0;
		int i_136_ = -1;
		anIntArrayArray5090[i_134_] = new int[i_135_];
		for (int i_137_ = 0; i_137_ < i_135_; i_137_++) {
		    int i_138_ = (anIntArrayArray5090[i_134_][i_137_] = i_113_
				  += class534_sub40.method16529((byte) 1));
		    if (i_138_ > i_136_)
			i_136_ = i_138_;
		}
		anIntArray5085[i_134_] = 1 + i_136_;
		if (i_135_ == i_136_ + 1)
		    anIntArrayArray5090[i_134_] = null;
	    }
	}
	if (bool) {
	    anIntArrayArray5091 = new int[i_114_ + 1][];
	    aClass275Array5092 = new Class275[1 + i_114_];
	    for (int i_139_ = 0; i_139_ < anInt5078 * -1069101825; i_139_++) {
		int i_140_ = anIntArray5086[i_139_];
		int i_141_ = anIntArray5074[i_140_];
		anIntArrayArray5091[i_140_] = new int[anIntArray5085[i_140_]];
		for (int i_142_ = 0; i_142_ < anIntArray5085[i_140_]; i_142_++)
		    anIntArrayArray5091[i_140_][i_142_] = -1;
		for (int i_143_ = 0; i_143_ < i_141_; i_143_++) {
		    int i_144_;
		    if (anIntArrayArray5090[i_140_] != null)
			i_144_ = anIntArrayArray5090[i_140_][i_143_];
		    else
			i_144_ = i_143_;
		    anIntArrayArray5091[i_140_][i_144_]
			= class534_sub40.method16533(-258848859);
		}
		aClass275Array5092[i_140_]
		    = new Class275(anIntArrayArray5091[i_140_]);
	    }
	}
    }
    
    Class462(byte[] is, int i, byte[] is_145_) {
	anInt5075
	    = Class317.method5744(is, is.length, -1872400808) * -2136245927;
	if (i != -461160727 * anInt5075)
	    throw new RuntimeException();
	if (null != is_145_) {
	    if (64 != is_145_.length)
		throw new RuntimeException();
	    aByteArray5076 = Class70.method1413(is, 0, is.length, 2006000748);
	    for (int i_146_ = 0; i_146_ < 64; i_146_++) {
		if (aByteArray5076[i_146_] != is_145_[i_146_])
		    throw new RuntimeException();
	    }
	}
	method7514(is, -1784533868);
    }
    
    static final void method7517(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	client.method17837(class247, class243, class669, (byte) -75);
    }
}
