/* Class178 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class178
{
    static final int anInt1851 = 0;
    static final int anInt1852 = 0;
    static final int anInt1853 = 1;
    
    public static Class169[] method2938(Class472 class472, int i) {
	byte[] is = class472.method7738(i, (byte) -92);
	if (is == null)
	    return null;
	return method2943(is);
    }
    
    public static Class169[] method2939(Class472 class472, int i, int i_0_) {
	byte[] is = class472.method7743(i, i_0_, -670186429);
	if (is == null)
	    return null;
	return method2943(is);
    }
    
    public static Class169 method2940(Class472 class472, int i, int i_1_) {
	byte[] is = class472.method7743(i, i_1_, -1065133704);
	if (is == null)
	    return null;
	return method2943(is)[0];
    }
    
    public static Class169[] method2941(Class472 class472, int i) {
	byte[] is = class472.method7738(i, (byte) -60);
	if (is == null)
	    return null;
	return method2943(is);
    }
    
    public static Class169[] method2942(Class472 class472, int i) {
	byte[] is = class472.method7738(i, (byte) -89);
	if (is == null)
	    return null;
	return method2943(is);
    }
    
    public static Class169[] method2943(byte[] is) {
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	class534_sub40.anInt10811 = (is.length - 2) * -1387468933;
	int i = class534_sub40.method16529((byte) 1);
	int i_2_ = i >> 15;
	int i_3_ = i & 0x7fff;
	if (i_2_ == 0) {
	    Class169_Sub2[] class169_sub2s = new Class169_Sub2[i_3_];
	    for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
		class169_sub2s[i_4_] = new Class169_Sub2();
	    class534_sub40.anInt10811
		= (is.length - 7 - i_3_ * 8) * -1387468933;
	    int i_5_ = class534_sub40.method16529((byte) 1);
	    int i_6_ = class534_sub40.method16529((byte) 1);
	    int i_7_ = (class534_sub40.method16527(1244979673) & 0xff) + 1;
	    for (int i_8_ = 0; i_8_ < i_3_; i_8_++)
		class169_sub2s[i_8_].anInt9790
		    = class534_sub40.method16529((byte) 1);
	    for (int i_9_ = 0; i_9_ < i_3_; i_9_++)
		class169_sub2s[i_9_].anInt9792
		    = class534_sub40.method16529((byte) 1);
	    for (int i_10_ = 0; i_10_ < i_3_; i_10_++)
		class169_sub2s[i_10_].anInt9788
		    = class534_sub40.method16529((byte) 1);
	    for (int i_11_ = 0; i_11_ < i_3_; i_11_++)
		class169_sub2s[i_11_].anInt9789
		    = class534_sub40.method16529((byte) 1);
	    for (int i_12_ = 0; i_12_ < i_3_; i_12_++) {
		Class169_Sub2 class169_sub2 = class169_sub2s[i_12_];
		class169_sub2.anInt9795
		    = i_5_ - class169_sub2.anInt9788 - class169_sub2.anInt9790;
		class169_sub2.anInt9793
		    = i_6_ - class169_sub2.anInt9789 - class169_sub2.anInt9792;
	    }
	    class534_sub40.anInt10811
		= (is.length - 7 - i_3_ * 8 - (i_7_ - 1) * 3) * -1387468933;
	    int[] is_13_ = new int[i_7_];
	    for (int i_14_ = 1; i_14_ < i_7_; i_14_++) {
		is_13_[i_14_] = class534_sub40.method16531(1715958465);
		if (is_13_[i_14_] == 0)
		    is_13_[i_14_] = 1;
	    }
	    for (int i_15_ = 0; i_15_ < i_3_; i_15_++)
		class169_sub2s[i_15_].anIntArray9794 = is_13_;
	    class534_sub40.anInt10811 = 0;
	    for (int i_16_ = 0; i_16_ < i_3_; i_16_++) {
		Class169_Sub2 class169_sub2 = class169_sub2s[i_16_];
		int i_17_ = class169_sub2.anInt9788 * class169_sub2.anInt9789;
		class169_sub2.aByteArray9796 = new byte[i_17_];
		int i_18_ = class534_sub40.method16527(-1918338235);
		if ((i_18_ & 0x2) == 0) {
		    if ((i_18_ & 0x1) == 0) {
			for (int i_19_ = 0; i_19_ < i_17_; i_19_++)
			    class169_sub2.aByteArray9796[i_19_]
				= class534_sub40.method16586((byte) 1);
		    } else {
			for (int i_20_ = 0; i_20_ < class169_sub2.anInt9788;
			     i_20_++) {
			    for (int i_21_ = 0;
				 i_21_ < class169_sub2.anInt9789; i_21_++)
				class169_sub2.aByteArray9796
				    [i_20_ + i_21_ * class169_sub2.anInt9788]
				    = class534_sub40.method16586((byte) 1);
			}
		    }
		} else {
		    boolean bool = false;
		    class169_sub2.aByteArray9791 = new byte[i_17_];
		    if ((i_18_ & 0x1) == 0) {
			for (int i_22_ = 0; i_22_ < i_17_; i_22_++)
			    class169_sub2.aByteArray9796[i_22_]
				= class534_sub40.method16586((byte) 1);
			for (int i_23_ = 0; i_23_ < i_17_; i_23_++) {
			    byte i_24_
				= (class169_sub2.aByteArray9791[i_23_]
				   = class534_sub40.method16586((byte) 1));
			    bool = bool | i_24_ != -1;
			}
		    } else {
			for (int i_25_ = 0; i_25_ < class169_sub2.anInt9788;
			     i_25_++) {
			    for (int i_26_ = 0;
				 i_26_ < class169_sub2.anInt9789; i_26_++)
				class169_sub2.aByteArray9796
				    [i_25_ + i_26_ * class169_sub2.anInt9788]
				    = class534_sub40.method16586((byte) 1);
			}
			for (int i_27_ = 0; i_27_ < class169_sub2.anInt9788;
			     i_27_++) {
			    for (int i_28_ = 0;
				 i_28_ < class169_sub2.anInt9789; i_28_++) {
				byte i_29_
				    = (class169_sub2.aByteArray9791
					   [i_27_ + i_28_ * (class169_sub2
							     .anInt9788)]
				       = class534_sub40.method16586((byte) 1));
				bool = bool | i_29_ != -1;
			    }
			}
		    }
		    if (!bool)
			class169_sub2.aByteArray9791 = null;
		}
	    }
	    return class169_sub2s;
	}
	Class169_Sub1[] class169_sub1s = new Class169_Sub1[i_3_];
	class534_sub40.anInt10811 = 0;
	int i_30_ = class534_sub40.method16527(1021938174);
	if (i_30_ == 0) {
	    boolean bool = class534_sub40.method16527(452913721) == 1;
	    int i_31_ = class534_sub40.method16529((byte) 1);
	    int i_32_ = class534_sub40.method16529((byte) 1);
	    for (int i_33_ = 0; i_33_ < i_3_; i_33_++) {
		int[] is_34_ = new int[i_31_ * i_32_];
		for (int i_35_ = 0; i_35_ < i_31_ * i_32_; i_35_++) {
		    is_34_[i_35_]
			= ~0xffffff | class534_sub40.method16531(1721865482);
		    if (is_34_[i_35_] == -65281)
			is_34_[i_35_] = 0;
		}
		if (bool) {
		    for (int i_36_ = 0; i_36_ < i_31_ * i_32_; i_36_++) {
			is_34_[i_36_] &= 0xffffff;
			is_34_[i_36_]
			    |= class534_sub40.method16527(371836990) << 24;
		    }
		}
		class169_sub1s[i_33_]
		    = new Class169_Sub1(i_31_, i_32_, is_34_);
	    }
	} else {
	    if (i_30_ == 1)
		throw new UnsupportedOperationException();
	    throw new RuntimeException();
	}
	return class169_sub1s;
    }
    
    public static Class169 method2944(Class472 class472, int i, int i_37_) {
	byte[] is = class472.method7743(i, i_37_, -1620377402);
	if (is == null)
	    return null;
	return method2943(is)[0];
    }
    
    public static Class169 method2945(Class472 class472, int i) {
	byte[] is = class472.method7738(i, (byte) -120);
	if (is == null)
	    return null;
	return method2943(is)[0];
    }
    
    public static Class169 method2946(Class472 class472, int i, int i_38_) {
	byte[] is = class472.method7743(i, i_38_, -1308431651);
	if (is == null)
	    return null;
	return method2943(is)[0];
    }
    
    public static Class169 method2947(Class472 class472, int i) {
	byte[] is = class472.method7738(i, (byte) -110);
	if (is == null)
	    return null;
	return method2943(is)[0];
    }
    
    public static Class169[] method2948(Class472 class472, int i, int i_39_) {
	byte[] is = class472.method7743(i, i_39_, -980172075);
	if (is == null)
	    return null;
	return method2943(is);
    }
    
    public static Class169 method2949(Class472 class472, int i, int i_40_) {
	byte[] is = class472.method7743(i, i_40_, -1640047842);
	if (is == null)
	    return null;
	return method2943(is)[0];
    }
    
    Class178() throws Throwable {
	throw new Error();
    }
    
    public static Class169[] method2950(Class472 class472, int i) {
	byte[] is = class472.method7738(i, (byte) -104);
	if (is == null)
	    return null;
	return method2943(is);
    }
    
    public static Class169[] method2951(Class472 class472, int i) {
	byte[] is = class472.method7738(i, (byte) -77);
	if (is == null)
	    return null;
	return method2943(is);
    }
    
    public static Class169[] method2952(byte[] is) {
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	class534_sub40.anInt10811 = (is.length - 2) * -1387468933;
	int i = class534_sub40.method16529((byte) 1);
	int i_41_ = i >> 15;
	int i_42_ = i & 0x7fff;
	if (i_41_ == 0) {
	    Class169_Sub2[] class169_sub2s = new Class169_Sub2[i_42_];
	    for (int i_43_ = 0; i_43_ < i_42_; i_43_++)
		class169_sub2s[i_43_] = new Class169_Sub2();
	    class534_sub40.anInt10811
		= (is.length - 7 - i_42_ * 8) * -1387468933;
	    int i_44_ = class534_sub40.method16529((byte) 1);
	    int i_45_ = class534_sub40.method16529((byte) 1);
	    int i_46_ = (class534_sub40.method16527(1366611085) & 0xff) + 1;
	    for (int i_47_ = 0; i_47_ < i_42_; i_47_++)
		class169_sub2s[i_47_].anInt9790
		    = class534_sub40.method16529((byte) 1);
	    for (int i_48_ = 0; i_48_ < i_42_; i_48_++)
		class169_sub2s[i_48_].anInt9792
		    = class534_sub40.method16529((byte) 1);
	    for (int i_49_ = 0; i_49_ < i_42_; i_49_++)
		class169_sub2s[i_49_].anInt9788
		    = class534_sub40.method16529((byte) 1);
	    for (int i_50_ = 0; i_50_ < i_42_; i_50_++)
		class169_sub2s[i_50_].anInt9789
		    = class534_sub40.method16529((byte) 1);
	    for (int i_51_ = 0; i_51_ < i_42_; i_51_++) {
		Class169_Sub2 class169_sub2 = class169_sub2s[i_51_];
		class169_sub2.anInt9795 = (i_44_ - class169_sub2.anInt9788
					   - class169_sub2.anInt9790);
		class169_sub2.anInt9793 = (i_45_ - class169_sub2.anInt9789
					   - class169_sub2.anInt9792);
	    }
	    class534_sub40.anInt10811
		= (is.length - 7 - i_42_ * 8 - (i_46_ - 1) * 3) * -1387468933;
	    int[] is_52_ = new int[i_46_];
	    for (int i_53_ = 1; i_53_ < i_46_; i_53_++) {
		is_52_[i_53_] = class534_sub40.method16531(312420546);
		if (is_52_[i_53_] == 0)
		    is_52_[i_53_] = 1;
	    }
	    for (int i_54_ = 0; i_54_ < i_42_; i_54_++)
		class169_sub2s[i_54_].anIntArray9794 = is_52_;
	    class534_sub40.anInt10811 = 0;
	    for (int i_55_ = 0; i_55_ < i_42_; i_55_++) {
		Class169_Sub2 class169_sub2 = class169_sub2s[i_55_];
		int i_56_ = class169_sub2.anInt9788 * class169_sub2.anInt9789;
		class169_sub2.aByteArray9796 = new byte[i_56_];
		int i_57_ = class534_sub40.method16527(-1314243202);
		if ((i_57_ & 0x2) == 0) {
		    if ((i_57_ & 0x1) == 0) {
			for (int i_58_ = 0; i_58_ < i_56_; i_58_++)
			    class169_sub2.aByteArray9796[i_58_]
				= class534_sub40.method16586((byte) 1);
		    } else {
			for (int i_59_ = 0; i_59_ < class169_sub2.anInt9788;
			     i_59_++) {
			    for (int i_60_ = 0;
				 i_60_ < class169_sub2.anInt9789; i_60_++)
				class169_sub2.aByteArray9796
				    [i_59_ + i_60_ * class169_sub2.anInt9788]
				    = class534_sub40.method16586((byte) 1);
			}
		    }
		} else {
		    boolean bool = false;
		    class169_sub2.aByteArray9791 = new byte[i_56_];
		    if ((i_57_ & 0x1) == 0) {
			for (int i_61_ = 0; i_61_ < i_56_; i_61_++)
			    class169_sub2.aByteArray9796[i_61_]
				= class534_sub40.method16586((byte) 1);
			for (int i_62_ = 0; i_62_ < i_56_; i_62_++) {
			    byte i_63_
				= (class169_sub2.aByteArray9791[i_62_]
				   = class534_sub40.method16586((byte) 1));
			    bool = bool | i_63_ != -1;
			}
		    } else {
			for (int i_64_ = 0; i_64_ < class169_sub2.anInt9788;
			     i_64_++) {
			    for (int i_65_ = 0;
				 i_65_ < class169_sub2.anInt9789; i_65_++)
				class169_sub2.aByteArray9796
				    [i_64_ + i_65_ * class169_sub2.anInt9788]
				    = class534_sub40.method16586((byte) 1);
			}
			for (int i_66_ = 0; i_66_ < class169_sub2.anInt9788;
			     i_66_++) {
			    for (int i_67_ = 0;
				 i_67_ < class169_sub2.anInt9789; i_67_++) {
				byte i_68_
				    = (class169_sub2.aByteArray9791
					   [i_66_ + i_67_ * (class169_sub2
							     .anInt9788)]
				       = class534_sub40.method16586((byte) 1));
				bool = bool | i_68_ != -1;
			    }
			}
		    }
		    if (!bool)
			class169_sub2.aByteArray9791 = null;
		}
	    }
	    return class169_sub2s;
	}
	Class169_Sub1[] class169_sub1s = new Class169_Sub1[i_42_];
	class534_sub40.anInt10811 = 0;
	int i_69_ = class534_sub40.method16527(-291033745);
	if (i_69_ == 0) {
	    boolean bool = class534_sub40.method16527(1572368810) == 1;
	    int i_70_ = class534_sub40.method16529((byte) 1);
	    int i_71_ = class534_sub40.method16529((byte) 1);
	    for (int i_72_ = 0; i_72_ < i_42_; i_72_++) {
		int[] is_73_ = new int[i_70_ * i_71_];
		for (int i_74_ = 0; i_74_ < i_70_ * i_71_; i_74_++) {
		    is_73_[i_74_]
			= ~0xffffff | class534_sub40.method16531(1628894379);
		    if (is_73_[i_74_] == -65281)
			is_73_[i_74_] = 0;
		}
		if (bool) {
		    for (int i_75_ = 0; i_75_ < i_70_ * i_71_; i_75_++) {
			is_73_[i_75_] &= 0xffffff;
			is_73_[i_75_]
			    |= class534_sub40.method16527(-808461542) << 24;
		    }
		}
		class169_sub1s[i_72_]
		    = new Class169_Sub1(i_70_, i_71_, is_73_);
	    }
	} else {
	    if (i_69_ == 1)
		throw new UnsupportedOperationException();
	    throw new RuntimeException();
	}
	return class169_sub1s;
    }
    
    public static Class169[] method2953(byte[] is) {
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	class534_sub40.anInt10811 = (is.length - 2) * -1387468933;
	int i = class534_sub40.method16529((byte) 1);
	int i_76_ = i >> 15;
	int i_77_ = i & 0x7fff;
	if (i_76_ == 0) {
	    Class169_Sub2[] class169_sub2s = new Class169_Sub2[i_77_];
	    for (int i_78_ = 0; i_78_ < i_77_; i_78_++)
		class169_sub2s[i_78_] = new Class169_Sub2();
	    class534_sub40.anInt10811
		= (is.length - 7 - i_77_ * 8) * -1387468933;
	    int i_79_ = class534_sub40.method16529((byte) 1);
	    int i_80_ = class534_sub40.method16529((byte) 1);
	    int i_81_ = (class534_sub40.method16527(-899670274) & 0xff) + 1;
	    for (int i_82_ = 0; i_82_ < i_77_; i_82_++)
		class169_sub2s[i_82_].anInt9790
		    = class534_sub40.method16529((byte) 1);
	    for (int i_83_ = 0; i_83_ < i_77_; i_83_++)
		class169_sub2s[i_83_].anInt9792
		    = class534_sub40.method16529((byte) 1);
	    for (int i_84_ = 0; i_84_ < i_77_; i_84_++)
		class169_sub2s[i_84_].anInt9788
		    = class534_sub40.method16529((byte) 1);
	    for (int i_85_ = 0; i_85_ < i_77_; i_85_++)
		class169_sub2s[i_85_].anInt9789
		    = class534_sub40.method16529((byte) 1);
	    for (int i_86_ = 0; i_86_ < i_77_; i_86_++) {
		Class169_Sub2 class169_sub2 = class169_sub2s[i_86_];
		class169_sub2.anInt9795 = (i_79_ - class169_sub2.anInt9788
					   - class169_sub2.anInt9790);
		class169_sub2.anInt9793 = (i_80_ - class169_sub2.anInt9789
					   - class169_sub2.anInt9792);
	    }
	    class534_sub40.anInt10811
		= (is.length - 7 - i_77_ * 8 - (i_81_ - 1) * 3) * -1387468933;
	    int[] is_87_ = new int[i_81_];
	    for (int i_88_ = 1; i_88_ < i_81_; i_88_++) {
		is_87_[i_88_] = class534_sub40.method16531(1322266103);
		if (is_87_[i_88_] == 0)
		    is_87_[i_88_] = 1;
	    }
	    for (int i_89_ = 0; i_89_ < i_77_; i_89_++)
		class169_sub2s[i_89_].anIntArray9794 = is_87_;
	    class534_sub40.anInt10811 = 0;
	    for (int i_90_ = 0; i_90_ < i_77_; i_90_++) {
		Class169_Sub2 class169_sub2 = class169_sub2s[i_90_];
		int i_91_ = class169_sub2.anInt9788 * class169_sub2.anInt9789;
		class169_sub2.aByteArray9796 = new byte[i_91_];
		int i_92_ = class534_sub40.method16527(-83707228);
		if ((i_92_ & 0x2) == 0) {
		    if ((i_92_ & 0x1) == 0) {
			for (int i_93_ = 0; i_93_ < i_91_; i_93_++)
			    class169_sub2.aByteArray9796[i_93_]
				= class534_sub40.method16586((byte) 1);
		    } else {
			for (int i_94_ = 0; i_94_ < class169_sub2.anInt9788;
			     i_94_++) {
			    for (int i_95_ = 0;
				 i_95_ < class169_sub2.anInt9789; i_95_++)
				class169_sub2.aByteArray9796
				    [i_94_ + i_95_ * class169_sub2.anInt9788]
				    = class534_sub40.method16586((byte) 1);
			}
		    }
		} else {
		    boolean bool = false;
		    class169_sub2.aByteArray9791 = new byte[i_91_];
		    if ((i_92_ & 0x1) == 0) {
			for (int i_96_ = 0; i_96_ < i_91_; i_96_++)
			    class169_sub2.aByteArray9796[i_96_]
				= class534_sub40.method16586((byte) 1);
			for (int i_97_ = 0; i_97_ < i_91_; i_97_++) {
			    byte i_98_
				= (class169_sub2.aByteArray9791[i_97_]
				   = class534_sub40.method16586((byte) 1));
			    bool = bool | i_98_ != -1;
			}
		    } else {
			for (int i_99_ = 0; i_99_ < class169_sub2.anInt9788;
			     i_99_++) {
			    for (int i_100_ = 0;
				 i_100_ < class169_sub2.anInt9789; i_100_++)
				class169_sub2.aByteArray9796
				    [i_99_ + i_100_ * class169_sub2.anInt9788]
				    = class534_sub40.method16586((byte) 1);
			}
			for (int i_101_ = 0; i_101_ < class169_sub2.anInt9788;
			     i_101_++) {
			    for (int i_102_ = 0;
				 i_102_ < class169_sub2.anInt9789; i_102_++) {
				byte i_103_
				    = (class169_sub2.aByteArray9791
					   [i_101_ + i_102_ * (class169_sub2
							       .anInt9788)]
				       = class534_sub40.method16586((byte) 1));
				bool = bool | i_103_ != -1;
			    }
			}
		    }
		    if (!bool)
			class169_sub2.aByteArray9791 = null;
		}
	    }
	    return class169_sub2s;
	}
	Class169_Sub1[] class169_sub1s = new Class169_Sub1[i_77_];
	class534_sub40.anInt10811 = 0;
	int i_104_ = class534_sub40.method16527(-476585376);
	if (i_104_ == 0) {
	    boolean bool = class534_sub40.method16527(946147538) == 1;
	    int i_105_ = class534_sub40.method16529((byte) 1);
	    int i_106_ = class534_sub40.method16529((byte) 1);
	    for (int i_107_ = 0; i_107_ < i_77_; i_107_++) {
		int[] is_108_ = new int[i_105_ * i_106_];
		for (int i_109_ = 0; i_109_ < i_105_ * i_106_; i_109_++) {
		    is_108_[i_109_]
			= ~0xffffff | class534_sub40.method16531(330698465);
		    if (is_108_[i_109_] == -65281)
			is_108_[i_109_] = 0;
		}
		if (bool) {
		    for (int i_110_ = 0; i_110_ < i_105_ * i_106_; i_110_++) {
			is_108_[i_110_] &= 0xffffff;
			is_108_[i_110_]
			    |= class534_sub40.method16527(1634115752) << 24;
		    }
		}
		class169_sub1s[i_107_]
		    = new Class169_Sub1(i_105_, i_106_, is_108_);
	    }
	} else {
	    if (i_104_ == 1)
		throw new UnsupportedOperationException();
	    throw new RuntimeException();
	}
	return class169_sub1s;
    }
}
