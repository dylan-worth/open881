/* Class684 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class684 implements Interface13
{
    byte[] aByteArray8677;
    Class670 aClass670_8678;
    int anInt8679;
    byte[] aByteArray8680;
    int anInt8681;
    short[] aShortArray8682;
    short[] aShortArray8683;
    short[] aShortArray8684;
    short[] aShortArray8685;
    int anInt8686;
    static final int anInt8687 = 8224;
    public int anInt8688 = -430182369;
    int anInt8689;
    int anInt8690;
    public boolean aBool8691;
    int anInt8692;
    int anInt8693 = -145336960;
    byte aByte8694;
    int anInt8695;
    public static Class53_Sub1 aClass53_Sub1_8696;
    
    public void method80(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(1385754289);
	    if (i == 0)
		break;
	    method13927(class534_sub40, i, (byte) 124);
	}
    }
    
    public void method79(Class534_Sub40 class534_sub40, byte i) {
	for (;;) {
	    int i_0_ = class534_sub40.method16527(-1681827239);
	    if (i_0_ == 0)
		break;
	    method13927(class534_sub40, i_0_, (byte) 120);
	}
    }
    
    void method13927(Class534_Sub40 class534_sub40, int i, byte i_1_) {
	do {
	    if (1 == i)
		anInt8686 = class534_sub40.method16550((byte) -26) * 276801009;
	    else if (i == 2)
		anInt8688 = class534_sub40.method16550((byte) 9) * 430182369;
	    else if (4 == i)
		anInt8693 = class534_sub40.method16529((byte) 1) * -1913738069;
	    else if (5 == i)
		anInt8689 = class534_sub40.method16529((byte) 1) * 518990719;
	    else if (6 == i)
		anInt8690 = class534_sub40.method16529((byte) 1) * -181056353;
	    else if (7 == i)
		anInt8681
		    = class534_sub40.method16527(1460774776) * -1945897667;
	    else if (8 == i)
		anInt8692
		    = class534_sub40.method16527(-1959570475) * 338099613;
	    else if (10 == i)
		aBool8691 = true;
	    else if (i == 9) {
		aByte8694 = (byte) 3;
		anInt8695 = -1645312416;
	    } else if (15 == i) {
		aByte8694 = (byte) 3;
		anInt8695 = class534_sub40.method16529((byte) 1) * -827440845;
	    } else if (i == 16) {
		aByte8694 = (byte) 3;
		anInt8695
		    = class534_sub40.method16533(-258848859) * -827440845;
	    } else if (40 == i) {
		int i_2_ = class534_sub40.method16527(1244738129);
		aShortArray8682 = new short[i_2_];
		aShortArray8683 = new short[i_2_];
		for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
		    aShortArray8682[i_3_]
			= (short) class534_sub40.method16529((byte) 1);
		    aShortArray8683[i_3_]
			= (short) class534_sub40.method16529((byte) 1);
		}
	    } else if (41 == i) {
		int i_4_ = class534_sub40.method16527(1063997400);
		aShortArray8684 = new short[i_4_];
		aShortArray8685 = new short[i_4_];
		for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
		    aShortArray8684[i_5_]
			= (short) class534_sub40.method16529((byte) 1);
		    aShortArray8685[i_5_]
			= (short) class534_sub40.method16529((byte) 1);
		}
	    } else if (44 == i) {
		int i_6_ = class534_sub40.method16529((byte) 1);
		int i_7_ = 0;
		for (int i_8_ = i_6_; i_8_ > 0; i_8_ >>= 1)
		    i_7_++;
		aByteArray8680 = new byte[i_7_];
		byte i_9_ = 0;
		for (int i_10_ = 0; i_10_ < i_7_; i_10_++) {
		    if ((i_6_ & 1 << i_10_) > 0) {
			aByteArray8680[i_10_] = i_9_;
			i_9_++;
		    } else
			aByteArray8680[i_10_] = (byte) -1;
		}
	    } else if (45 == i) {
		int i_11_ = class534_sub40.method16529((byte) 1);
		int i_12_ = 0;
		for (int i_13_ = i_11_; i_13_ > 0; i_13_ >>= 1)
		    i_12_++;
		aByteArray8677 = new byte[i_12_];
		byte i_14_ = 0;
		for (int i_15_ = 0; i_15_ < i_12_; i_15_++) {
		    if ((i_11_ & 1 << i_15_) > 0) {
			aByteArray8677[i_15_] = i_14_;
			i_14_++;
		    } else
			aByteArray8677[i_15_] = (byte) -1;
		}
	    } else if (i == 46)
		break;
	} while (false);
    }
    
    public final Class183 method13928
	(Class185 class185, int i, Class711 class711, byte i_16_, byte i_17_) {
	return method13931(class185, i, false, null, null, 0, 0, 0, 0, 0, 0, 0,
			   class711, i_16_, -784539298);
    }
    
    public final Class183 method13929
	(Class185 class185, int i, int i_18_, Class151 class151,
	 Class151 class151_19_, int i_20_, int i_21_, int i_22_,
	 Class711 class711, byte i_23_, byte i_24_) {
	return method13931(class185, i, true, class151, class151_19_, i_20_,
			   i_21_, i_22_, i_18_, 0, 0, 0, class711, i_23_,
			   -932954525);
    }
    
    void method13930(Class534_Sub40 class534_sub40, int i) {
	do {
	    if (1 == i)
		anInt8686 = class534_sub40.method16550((byte) -6) * 276801009;
	    else if (i == 2)
		anInt8688 = class534_sub40.method16550((byte) 22) * 430182369;
	    else if (4 == i)
		anInt8693 = class534_sub40.method16529((byte) 1) * -1913738069;
	    else if (5 == i)
		anInt8689 = class534_sub40.method16529((byte) 1) * 518990719;
	    else if (6 == i)
		anInt8690 = class534_sub40.method16529((byte) 1) * -181056353;
	    else if (7 == i)
		anInt8681
		    = class534_sub40.method16527(1424308196) * -1945897667;
	    else if (8 == i)
		anInt8692 = class534_sub40.method16527(593910185) * 338099613;
	    else if (10 == i)
		aBool8691 = true;
	    else if (i == 9) {
		aByte8694 = (byte) 3;
		anInt8695 = -1645312416;
	    } else if (15 == i) {
		aByte8694 = (byte) 3;
		anInt8695 = class534_sub40.method16529((byte) 1) * -827440845;
	    } else if (i == 16) {
		aByte8694 = (byte) 3;
		anInt8695
		    = class534_sub40.method16533(-258848859) * -827440845;
	    } else if (40 == i) {
		int i_25_ = class534_sub40.method16527(-1245494431);
		aShortArray8682 = new short[i_25_];
		aShortArray8683 = new short[i_25_];
		for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
		    aShortArray8682[i_26_]
			= (short) class534_sub40.method16529((byte) 1);
		    aShortArray8683[i_26_]
			= (short) class534_sub40.method16529((byte) 1);
		}
	    } else if (41 == i) {
		int i_27_ = class534_sub40.method16527(1184128911);
		aShortArray8684 = new short[i_27_];
		aShortArray8685 = new short[i_27_];
		for (int i_28_ = 0; i_28_ < i_27_; i_28_++) {
		    aShortArray8684[i_28_]
			= (short) class534_sub40.method16529((byte) 1);
		    aShortArray8685[i_28_]
			= (short) class534_sub40.method16529((byte) 1);
		}
	    } else if (44 == i) {
		int i_29_ = class534_sub40.method16529((byte) 1);
		int i_30_ = 0;
		for (int i_31_ = i_29_; i_31_ > 0; i_31_ >>= 1)
		    i_30_++;
		aByteArray8680 = new byte[i_30_];
		byte i_32_ = 0;
		for (int i_33_ = 0; i_33_ < i_30_; i_33_++) {
		    if ((i_29_ & 1 << i_33_) > 0) {
			aByteArray8680[i_33_] = i_32_;
			i_32_++;
		    } else
			aByteArray8680[i_33_] = (byte) -1;
		}
	    } else if (45 == i) {
		int i_34_ = class534_sub40.method16529((byte) 1);
		int i_35_ = 0;
		for (int i_36_ = i_34_; i_36_ > 0; i_36_ >>= 1)
		    i_35_++;
		aByteArray8677 = new byte[i_35_];
		byte i_37_ = 0;
		for (int i_38_ = 0; i_38_ < i_35_; i_38_++) {
		    if ((i_34_ & 1 << i_38_) > 0) {
			aByteArray8677[i_38_] = i_37_;
			i_37_++;
		    } else
			aByteArray8677[i_38_] = (byte) -1;
		}
	    } else if (i == 46)
		break;
	} while (false);
    }
    
    final Class183 method13931(Class185 class185, int i, boolean bool,
			       Class151 class151, Class151 class151_39_,
			       int i_40_, int i_41_, int i_42_, int i_43_,
			       int i_44_, int i_45_, int i_46_,
			       Class711 class711, byte i_47_, int i_48_) {
	int i_49_ = i;
	bool = bool & 0 != aByte8694;
	if (class711 != null)
	    i_49_ |= class711.method14360((short) -2372);
	if (anInt8689 * -942893953 != 128)
	    i_49_ |= 0x2;
	if (anInt8693 * 721939971 != 128 || 758959967 * anInt8690 != 0
	    || i_43_ != 0)
	    i_49_ |= 0x5;
	if (bool)
	    i_49_ |= 0x7;
	Class183 class183;
	synchronized (aClass670_8678.aClass203_8618) {
	    class183 = ((Class183)
			(aClass670_8678.aClass203_8618.method3871
			 ((long) (319915145 * anInt8679
				  | 2098753835 * class185.anInt2001 << 29))));
	}
	if (class183 == null
	    || class185.method3330(class183.method3101(), i_49_) != 0) {
	    if (null != class183)
		i_49_ = class185.method3331(i_49_, class183.method3101());
	    int i_50_ = i_49_;
	    if (aShortArray8682 != null)
		i_50_ |= 0x4000;
	    if (null != aShortArray8684)
		i_50_ |= 0x8000;
	    Class187 class187
		= Class187.method3709(aClass670_8678.aClass472_8617,
				      anInt8686 * 412003089, 0);
	    if (null == class187)
		return null;
	    if (class187.anInt2082 < 13)
		class187.method3723(2);
	    class183
		= class185.method3329(class187, i_50_,
				      aClass670_8678.anInt8619 * 1770536517,
				      64 + -1023243755 * anInt8681,
				      850 + anInt8692 * -616402763);
	    if (aShortArray8682 != null) {
		for (int i_51_ = 0; i_51_ < aShortArray8682.length; i_51_++)
		    class183.method3056(aShortArray8682[i_51_],
					aShortArray8683[i_51_]);
	    }
	    if (null != aShortArray8684) {
		for (int i_52_ = 0; i_52_ < aShortArray8684.length; i_52_++)
		    class183.method3118(aShortArray8684[i_52_],
					aShortArray8685[i_52_]);
	    }
	    class183.method3012(i_49_);
	    synchronized (aClass670_8678.aClass203_8618) {
		aClass670_8678.aClass203_8618.method3893
		    (class183,
		     (long) (anInt8679 * 319915145
			     | class185.anInt2001 * 2098753835 << 29));
	    }
	}
	Class183 class183_53_ = class183.method3011(i_47_, i_49_, true);
	if (class711 != null)
	    class711.method14399(class183_53_, 0, 1719845831);
	if (128 != anInt8693 * 721939971 || 128 != -942893953 * anInt8689)
	    class183_53_.method3021(anInt8693 * 721939971,
				    anInt8689 * -942893953,
				    721939971 * anInt8693);
	if (0 != anInt8690 * 758959967) {
	    if (90 == 758959967 * anInt8690)
		i_43_ += 4096;
	    if (180 == 758959967 * anInt8690)
		i_43_ += 8192;
	    if (270 == anInt8690 * 758959967)
		i_43_ += 12288;
	}
	if (0 != i_43_) {
	    i_43_ &= 0x3fff;
	    class183_53_.method3015(i_43_);
	}
	if (bool) {
	    if (null != class151)
		class183_53_.method3022(aByte8694, anInt8695 * -1790467589,
					class151, class151_39_, i_40_, i_41_,
					i_42_);
	    else {
		if (i_44_ != 0)
		    class183_53_.method3017(i_44_);
		if (0 != i_45_)
		    class183_53_.method3018(i_45_);
		if (0 != i_46_)
		    class183_53_.method3098(0, i_46_, 0);
	    }
	}
	class183_53_.method3012(i);
	return class183_53_;
    }
    
    public final boolean method13932(int i) {
	if (-1 == anInt8686 * 412003089)
	    return true;
	return aClass670_8678.aClass472_8617.method7669(412003089 * anInt8686,
							0, 1804616883);
    }
    
    public void method82(int i) {
	/* empty */
    }
    
    Class684(int i, Class670 class670) {
	anInt8689 = 2006302592;
	anInt8690 = 0;
	anInt8681 = 0;
	anInt8692 = 0;
	aBool8691 = false;
	aByte8694 = (byte) 0;
	anInt8695 = 827440845;
	anInt8679 = 301019577 * i;
	aClass670_8678 = class670;
    }
    
    public void method78(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(1872347010);
	    if (i == 0)
		break;
	    method13927(class534_sub40, i, (byte) 44);
	}
    }
    
    public void method81(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(858812710);
	    if (i == 0)
		break;
	    method13927(class534_sub40, i, (byte) 59);
	}
    }
    
    void method13933(Class534_Sub40 class534_sub40, int i) {
	do {
	    if (1 == i)
		anInt8686 = class534_sub40.method16550((byte) 2) * 276801009;
	    else if (i == 2)
		anInt8688 = class534_sub40.method16550((byte) 60) * 430182369;
	    else if (4 == i)
		anInt8693 = class534_sub40.method16529((byte) 1) * -1913738069;
	    else if (5 == i)
		anInt8689 = class534_sub40.method16529((byte) 1) * 518990719;
	    else if (6 == i)
		anInt8690 = class534_sub40.method16529((byte) 1) * -181056353;
	    else if (7 == i)
		anInt8681
		    = class534_sub40.method16527(945169795) * -1945897667;
	    else if (8 == i)
		anInt8692
		    = class534_sub40.method16527(-1464510882) * 338099613;
	    else if (10 == i)
		aBool8691 = true;
	    else if (i == 9) {
		aByte8694 = (byte) 3;
		anInt8695 = -1645312416;
	    } else if (15 == i) {
		aByte8694 = (byte) 3;
		anInt8695 = class534_sub40.method16529((byte) 1) * -827440845;
	    } else if (i == 16) {
		aByte8694 = (byte) 3;
		anInt8695
		    = class534_sub40.method16533(-258848859) * -827440845;
	    } else if (40 == i) {
		int i_54_ = class534_sub40.method16527(-97355146);
		aShortArray8682 = new short[i_54_];
		aShortArray8683 = new short[i_54_];
		for (int i_55_ = 0; i_55_ < i_54_; i_55_++) {
		    aShortArray8682[i_55_]
			= (short) class534_sub40.method16529((byte) 1);
		    aShortArray8683[i_55_]
			= (short) class534_sub40.method16529((byte) 1);
		}
	    } else if (41 == i) {
		int i_56_ = class534_sub40.method16527(1411024878);
		aShortArray8684 = new short[i_56_];
		aShortArray8685 = new short[i_56_];
		for (int i_57_ = 0; i_57_ < i_56_; i_57_++) {
		    aShortArray8684[i_57_]
			= (short) class534_sub40.method16529((byte) 1);
		    aShortArray8685[i_57_]
			= (short) class534_sub40.method16529((byte) 1);
		}
	    } else if (44 == i) {
		int i_58_ = class534_sub40.method16529((byte) 1);
		int i_59_ = 0;
		for (int i_60_ = i_58_; i_60_ > 0; i_60_ >>= 1)
		    i_59_++;
		aByteArray8680 = new byte[i_59_];
		byte i_61_ = 0;
		for (int i_62_ = 0; i_62_ < i_59_; i_62_++) {
		    if ((i_58_ & 1 << i_62_) > 0) {
			aByteArray8680[i_62_] = i_61_;
			i_61_++;
		    } else
			aByteArray8680[i_62_] = (byte) -1;
		}
	    } else if (45 == i) {
		int i_63_ = class534_sub40.method16529((byte) 1);
		int i_64_ = 0;
		for (int i_65_ = i_63_; i_65_ > 0; i_65_ >>= 1)
		    i_64_++;
		aByteArray8677 = new byte[i_64_];
		byte i_66_ = 0;
		for (int i_67_ = 0; i_67_ < i_64_; i_67_++) {
		    if ((i_63_ & 1 << i_67_) > 0) {
			aByteArray8677[i_67_] = i_66_;
			i_66_++;
		    } else
			aByteArray8677[i_67_] = (byte) -1;
		}
	    } else if (i == 46)
		break;
	} while (false);
    }
    
    public void method84() {
	/* empty */
    }
    
    public final Class183 method13934(Class185 class185, int i,
				      Class711 class711, byte i_68_) {
	return method13931(class185, i, false, null, null, 0, 0, 0, 0, 0, 0, 0,
			   class711, i_68_, -1643303394);
    }
    
    void method13935(Class534_Sub40 class534_sub40, int i) {
	do {
	    if (1 == i)
		anInt8686 = class534_sub40.method16550((byte) 43) * 276801009;
	    else if (i == 2)
		anInt8688 = class534_sub40.method16550((byte) -3) * 430182369;
	    else if (4 == i)
		anInt8693 = class534_sub40.method16529((byte) 1) * -1913738069;
	    else if (5 == i)
		anInt8689 = class534_sub40.method16529((byte) 1) * 518990719;
	    else if (6 == i)
		anInt8690 = class534_sub40.method16529((byte) 1) * -181056353;
	    else if (7 == i)
		anInt8681
		    = class534_sub40.method16527(1098810919) * -1945897667;
	    else if (8 == i)
		anInt8692 = class534_sub40.method16527(690290223) * 338099613;
	    else if (10 == i)
		aBool8691 = true;
	    else if (i == 9) {
		aByte8694 = (byte) 3;
		anInt8695 = -1645312416;
	    } else if (15 == i) {
		aByte8694 = (byte) 3;
		anInt8695 = class534_sub40.method16529((byte) 1) * -827440845;
	    } else if (i == 16) {
		aByte8694 = (byte) 3;
		anInt8695
		    = class534_sub40.method16533(-258848859) * -827440845;
	    } else if (40 == i) {
		int i_69_ = class534_sub40.method16527(841317865);
		aShortArray8682 = new short[i_69_];
		aShortArray8683 = new short[i_69_];
		for (int i_70_ = 0; i_70_ < i_69_; i_70_++) {
		    aShortArray8682[i_70_]
			= (short) class534_sub40.method16529((byte) 1);
		    aShortArray8683[i_70_]
			= (short) class534_sub40.method16529((byte) 1);
		}
	    } else if (41 == i) {
		int i_71_ = class534_sub40.method16527(-226439421);
		aShortArray8684 = new short[i_71_];
		aShortArray8685 = new short[i_71_];
		for (int i_72_ = 0; i_72_ < i_71_; i_72_++) {
		    aShortArray8684[i_72_]
			= (short) class534_sub40.method16529((byte) 1);
		    aShortArray8685[i_72_]
			= (short) class534_sub40.method16529((byte) 1);
		}
	    } else if (44 == i) {
		int i_73_ = class534_sub40.method16529((byte) 1);
		int i_74_ = 0;
		for (int i_75_ = i_73_; i_75_ > 0; i_75_ >>= 1)
		    i_74_++;
		aByteArray8680 = new byte[i_74_];
		byte i_76_ = 0;
		for (int i_77_ = 0; i_77_ < i_74_; i_77_++) {
		    if ((i_73_ & 1 << i_77_) > 0) {
			aByteArray8680[i_77_] = i_76_;
			i_76_++;
		    } else
			aByteArray8680[i_77_] = (byte) -1;
		}
	    } else if (45 == i) {
		int i_78_ = class534_sub40.method16529((byte) 1);
		int i_79_ = 0;
		for (int i_80_ = i_78_; i_80_ > 0; i_80_ >>= 1)
		    i_79_++;
		aByteArray8677 = new byte[i_79_];
		byte i_81_ = 0;
		for (int i_82_ = 0; i_82_ < i_79_; i_82_++) {
		    if ((i_78_ & 1 << i_82_) > 0) {
			aByteArray8677[i_82_] = i_81_;
			i_81_++;
		    } else
			aByteArray8677[i_82_] = (byte) -1;
		}
	    } else if (i == 46)
		break;
	} while (false);
    }
    
    public final Class183 method13936(Class185 class185, int i, int i_83_,
				      int i_84_, int i_85_, int i_86_,
				      Class711 class711, byte i_87_) {
	if (aByte8694 != 3)
	    return method13931(class185, i, false, null, null, 0, 0, 0, i_83_,
			       0, 0, 0, class711, i_87_, -1382102513);
	return method13931(class185, i, true, null, null, 0, 0, 0, i_83_,
			   i_84_, i_85_, i_86_, class711, i_87_, 1574495294);
    }
    
    public final boolean method13937() {
	if (-1 == anInt8686 * 412003089)
	    return true;
	return aClass670_8678.aClass472_8617.method7669(412003089 * anInt8686,
							0, 1804616883);
    }
    
    public final Class183 method13938(Class185 class185, int i,
				      Class711 class711, byte i_88_) {
	return method13931(class185, i, false, null, null, 0, 0, 0, 0, 0, 0, 0,
			   class711, i_88_, -1135832944);
    }
    
    public final Class183 method13939(Class185 class185, int i, int i_89_,
				      int i_90_, int i_91_, int i_92_,
				      Class711 class711, byte i_93_) {
	if (aByte8694 != 3)
	    return method13931(class185, i, false, null, null, 0, 0, 0, i_89_,
			       0, 0, 0, class711, i_93_, 107872229);
	return method13931(class185, i, true, null, null, 0, 0, 0, i_89_,
			   i_90_, i_91_, i_92_, class711, i_93_, 229727587);
    }
    
    public final boolean method13940() {
	if (-1 == anInt8686 * 412003089)
	    return true;
	return aClass670_8678.aClass472_8617.method7669(412003089 * anInt8686,
							0, 1804616883);
    }
    
    final Class183 method13941
	(Class185 class185, int i, boolean bool, Class151 class151,
	 Class151 class151_94_, int i_95_, int i_96_, int i_97_, int i_98_,
	 int i_99_, int i_100_, int i_101_, Class711 class711, byte i_102_) {
	int i_103_ = i;
	bool = bool & 0 != aByte8694;
	if (class711 != null)
	    i_103_ |= class711.method14360((short) -30607);
	if (anInt8689 * -942893953 != 128)
	    i_103_ |= 0x2;
	if (anInt8693 * 721939971 != 128 || 758959967 * anInt8690 != 0
	    || i_98_ != 0)
	    i_103_ |= 0x5;
	if (bool)
	    i_103_ |= 0x7;
	Class183 class183;
	synchronized (aClass670_8678.aClass203_8618) {
	    class183 = ((Class183)
			(aClass670_8678.aClass203_8618.method3871
			 ((long) (319915145 * anInt8679
				  | 2098753835 * class185.anInt2001 << 29))));
	}
	if (class183 == null
	    || class185.method3330(class183.method3101(), i_103_) != 0) {
	    if (null != class183)
		i_103_ = class185.method3331(i_103_, class183.method3101());
	    int i_104_ = i_103_;
	    if (aShortArray8682 != null)
		i_104_ |= 0x4000;
	    if (null != aShortArray8684)
		i_104_ |= 0x8000;
	    Class187 class187
		= Class187.method3709(aClass670_8678.aClass472_8617,
				      anInt8686 * 412003089, 0);
	    if (null == class187)
		return null;
	    if (class187.anInt2082 < 13)
		class187.method3723(2);
	    class183
		= class185.method3329(class187, i_104_,
				      aClass670_8678.anInt8619 * 1770536517,
				      64 + -1023243755 * anInt8681,
				      850 + anInt8692 * -616402763);
	    if (aShortArray8682 != null) {
		for (int i_105_ = 0; i_105_ < aShortArray8682.length; i_105_++)
		    class183.method3056(aShortArray8682[i_105_],
					aShortArray8683[i_105_]);
	    }
	    if (null != aShortArray8684) {
		for (int i_106_ = 0; i_106_ < aShortArray8684.length; i_106_++)
		    class183.method3118(aShortArray8684[i_106_],
					aShortArray8685[i_106_]);
	    }
	    class183.method3012(i_103_);
	    synchronized (aClass670_8678.aClass203_8618) {
		aClass670_8678.aClass203_8618.method3893
		    (class183,
		     (long) (anInt8679 * 319915145
			     | class185.anInt2001 * 2098753835 << 29));
	    }
	}
	Class183 class183_107_ = class183.method3011(i_102_, i_103_, true);
	if (class711 != null)
	    class711.method14399(class183_107_, 0, 1657115014);
	if (128 != anInt8693 * 721939971 || 128 != -942893953 * anInt8689)
	    class183_107_.method3021(anInt8693 * 721939971,
				     anInt8689 * -942893953,
				     721939971 * anInt8693);
	if (0 != anInt8690 * 758959967) {
	    if (90 == 758959967 * anInt8690)
		i_98_ += 4096;
	    if (180 == 758959967 * anInt8690)
		i_98_ += 8192;
	    if (270 == anInt8690 * 758959967)
		i_98_ += 12288;
	}
	if (0 != i_98_) {
	    i_98_ &= 0x3fff;
	    class183_107_.method3015(i_98_);
	}
	if (bool) {
	    if (null != class151)
		class183_107_.method3022(aByte8694, anInt8695 * -1790467589,
					 class151, class151_94_, i_95_, i_96_,
					 i_97_);
	    else {
		if (i_99_ != 0)
		    class183_107_.method3017(i_99_);
		if (0 != i_100_)
		    class183_107_.method3018(i_100_);
		if (0 != i_101_)
		    class183_107_.method3098(0, i_101_, 0);
	    }
	}
	class183_107_.method3012(i);
	return class183_107_;
    }
    
    public final Class183 method13942(Class185 class185, int i, int i_108_,
				      int i_109_, int i_110_, int i_111_,
				      Class711 class711, byte i_112_) {
	if (aByte8694 != 3)
	    return method13931(class185, i, false, null, null, 0, 0, 0, i_108_,
			       0, 0, 0, class711, i_112_, 986608268);
	return method13931(class185, i, true, null, null, 0, 0, 0, i_108_,
			   i_109_, i_110_, i_111_, class711, i_112_,
			   110421479);
    }
    
    public final Class183 method13943
	(Class185 class185, int i, int i_113_, Class151 class151,
	 Class151 class151_114_, int i_115_, int i_116_, int i_117_,
	 Class711 class711, byte i_118_) {
	return method13931(class185, i, true, class151, class151_114_, i_115_,
			   i_116_, i_117_, i_113_, 0, 0, 0, class711, i_118_,
			   -1684909933);
    }
    
    public final Class183 method13944(Class185 class185, int i, int i_119_,
				      int i_120_, int i_121_, int i_122_,
				      Class711 class711, byte i_123_) {
	if (aByte8694 != 3)
	    return method13931(class185, i, false, null, null, 0, 0, 0, i_119_,
			       0, 0, 0, class711, i_123_, -661818022);
	return method13931(class185, i, true, null, null, 0, 0, 0, i_119_,
			   i_120_, i_121_, i_122_, class711, i_123_,
			   1452792130);
    }
    
    public final Class183 method13945
	(Class185 class185, int i, int i_124_, int i_125_, int i_126_,
	 int i_127_, Class711 class711, byte i_128_, int i_129_) {
	if (aByte8694 != 3)
	    return method13931(class185, i, false, null, null, 0, 0, 0, i_124_,
			       0, 0, 0, class711, i_128_, -500868967);
	return method13931(class185, i, true, null, null, 0, 0, 0, i_124_,
			   i_125_, i_126_, i_127_, class711, i_128_,
			   1261588712);
    }
    
    final Class183 method13946(Class185 class185, int i, boolean bool,
			       Class151 class151, Class151 class151_130_,
			       int i_131_, int i_132_, int i_133_, int i_134_,
			       int i_135_, int i_136_, int i_137_,
			       Class711 class711, byte i_138_) {
	int i_139_ = i;
	bool = bool & 0 != aByte8694;
	if (class711 != null)
	    i_139_ |= class711.method14360((short) -29744);
	if (anInt8689 * -942893953 != 128)
	    i_139_ |= 0x2;
	if (anInt8693 * 721939971 != 128 || 758959967 * anInt8690 != 0
	    || i_134_ != 0)
	    i_139_ |= 0x5;
	if (bool)
	    i_139_ |= 0x7;
	Class183 class183;
	synchronized (aClass670_8678.aClass203_8618) {
	    class183 = ((Class183)
			(aClass670_8678.aClass203_8618.method3871
			 ((long) (319915145 * anInt8679
				  | 2098753835 * class185.anInt2001 << 29))));
	}
	if (class183 == null
	    || class185.method3330(class183.method3101(), i_139_) != 0) {
	    if (null != class183)
		i_139_ = class185.method3331(i_139_, class183.method3101());
	    int i_140_ = i_139_;
	    if (aShortArray8682 != null)
		i_140_ |= 0x4000;
	    if (null != aShortArray8684)
		i_140_ |= 0x8000;
	    Class187 class187
		= Class187.method3709(aClass670_8678.aClass472_8617,
				      anInt8686 * 412003089, 0);
	    if (null == class187)
		return null;
	    if (class187.anInt2082 < 13)
		class187.method3723(2);
	    class183
		= class185.method3329(class187, i_140_,
				      aClass670_8678.anInt8619 * 1770536517,
				      64 + -1023243755 * anInt8681,
				      850 + anInt8692 * -616402763);
	    if (aShortArray8682 != null) {
		for (int i_141_ = 0; i_141_ < aShortArray8682.length; i_141_++)
		    class183.method3056(aShortArray8682[i_141_],
					aShortArray8683[i_141_]);
	    }
	    if (null != aShortArray8684) {
		for (int i_142_ = 0; i_142_ < aShortArray8684.length; i_142_++)
		    class183.method3118(aShortArray8684[i_142_],
					aShortArray8685[i_142_]);
	    }
	    class183.method3012(i_139_);
	    synchronized (aClass670_8678.aClass203_8618) {
		aClass670_8678.aClass203_8618.method3893
		    (class183,
		     (long) (anInt8679 * 319915145
			     | class185.anInt2001 * 2098753835 << 29));
	    }
	}
	Class183 class183_143_ = class183.method3011(i_138_, i_139_, true);
	if (class711 != null)
	    class711.method14399(class183_143_, 0, 1874811623);
	if (128 != anInt8693 * 721939971 || 128 != -942893953 * anInt8689)
	    class183_143_.method3021(anInt8693 * 721939971,
				     anInt8689 * -942893953,
				     721939971 * anInt8693);
	if (0 != anInt8690 * 758959967) {
	    if (90 == 758959967 * anInt8690)
		i_134_ += 4096;
	    if (180 == 758959967 * anInt8690)
		i_134_ += 8192;
	    if (270 == anInt8690 * 758959967)
		i_134_ += 12288;
	}
	if (0 != i_134_) {
	    i_134_ &= 0x3fff;
	    class183_143_.method3015(i_134_);
	}
	if (bool) {
	    if (null != class151)
		class183_143_.method3022(aByte8694, anInt8695 * -1790467589,
					 class151, class151_130_, i_131_,
					 i_132_, i_133_);
	    else {
		if (i_135_ != 0)
		    class183_143_.method3017(i_135_);
		if (0 != i_136_)
		    class183_143_.method3018(i_136_);
		if (0 != i_137_)
		    class183_143_.method3098(0, i_137_, 0);
	    }
	}
	class183_143_.method3012(i);
	return class183_143_;
    }
    
    final Class183 method13947(Class185 class185, int i, boolean bool,
			       Class151 class151, Class151 class151_144_,
			       int i_145_, int i_146_, int i_147_, int i_148_,
			       int i_149_, int i_150_, int i_151_,
			       Class711 class711, byte i_152_) {
	int i_153_ = i;
	bool = bool & 0 != aByte8694;
	if (class711 != null)
	    i_153_ |= class711.method14360((short) -26567);
	if (anInt8689 * -942893953 != 128)
	    i_153_ |= 0x2;
	if (anInt8693 * 721939971 != 128 || 758959967 * anInt8690 != 0
	    || i_148_ != 0)
	    i_153_ |= 0x5;
	if (bool)
	    i_153_ |= 0x7;
	Class183 class183;
	synchronized (aClass670_8678.aClass203_8618) {
	    class183 = ((Class183)
			(aClass670_8678.aClass203_8618.method3871
			 ((long) (319915145 * anInt8679
				  | 2098753835 * class185.anInt2001 << 29))));
	}
	if (class183 == null
	    || class185.method3330(class183.method3101(), i_153_) != 0) {
	    if (null != class183)
		i_153_ = class185.method3331(i_153_, class183.method3101());
	    int i_154_ = i_153_;
	    if (aShortArray8682 != null)
		i_154_ |= 0x4000;
	    if (null != aShortArray8684)
		i_154_ |= 0x8000;
	    Class187 class187
		= Class187.method3709(aClass670_8678.aClass472_8617,
				      anInt8686 * 412003089, 0);
	    if (null == class187)
		return null;
	    if (class187.anInt2082 < 13)
		class187.method3723(2);
	    class183
		= class185.method3329(class187, i_154_,
				      aClass670_8678.anInt8619 * 1770536517,
				      64 + -1023243755 * anInt8681,
				      850 + anInt8692 * -616402763);
	    if (aShortArray8682 != null) {
		for (int i_155_ = 0; i_155_ < aShortArray8682.length; i_155_++)
		    class183.method3056(aShortArray8682[i_155_],
					aShortArray8683[i_155_]);
	    }
	    if (null != aShortArray8684) {
		for (int i_156_ = 0; i_156_ < aShortArray8684.length; i_156_++)
		    class183.method3118(aShortArray8684[i_156_],
					aShortArray8685[i_156_]);
	    }
	    class183.method3012(i_153_);
	    synchronized (aClass670_8678.aClass203_8618) {
		aClass670_8678.aClass203_8618.method3893
		    (class183,
		     (long) (anInt8679 * 319915145
			     | class185.anInt2001 * 2098753835 << 29));
	    }
	}
	Class183 class183_157_ = class183.method3011(i_152_, i_153_, true);
	if (class711 != null)
	    class711.method14399(class183_157_, 0, 1686413576);
	if (128 != anInt8693 * 721939971 || 128 != -942893953 * anInt8689)
	    class183_157_.method3021(anInt8693 * 721939971,
				     anInt8689 * -942893953,
				     721939971 * anInt8693);
	if (0 != anInt8690 * 758959967) {
	    if (90 == 758959967 * anInt8690)
		i_148_ += 4096;
	    if (180 == 758959967 * anInt8690)
		i_148_ += 8192;
	    if (270 == anInt8690 * 758959967)
		i_148_ += 12288;
	}
	if (0 != i_148_) {
	    i_148_ &= 0x3fff;
	    class183_157_.method3015(i_148_);
	}
	if (bool) {
	    if (null != class151)
		class183_157_.method3022(aByte8694, anInt8695 * -1790467589,
					 class151, class151_144_, i_145_,
					 i_146_, i_147_);
	    else {
		if (i_149_ != 0)
		    class183_157_.method3017(i_149_);
		if (0 != i_150_)
		    class183_157_.method3018(i_150_);
		if (0 != i_151_)
		    class183_157_.method3098(0, i_151_, 0);
	    }
	}
	class183_157_.method3012(i);
	return class183_157_;
    }
    
    public final Class183 method13948
	(Class185 class185, int i, int i_158_, Class151 class151,
	 Class151 class151_159_, int i_160_, int i_161_, int i_162_,
	 Class711 class711, byte i_163_) {
	return method13931(class185, i, true, class151, class151_159_, i_160_,
			   i_161_, i_162_, i_158_, 0, 0, 0, class711, i_163_,
			   320892902);
    }
    
    public void method83() {
	/* empty */
    }
    
    public static int method13949(CharSequence charsequence, byte i) {
	return Class60.method1257(charsequence, 10, true, -2083432752);
    }
    
    public static void method13950(int i, int i_164_) {
	Class25 class25
	    = (Class25) Class554_Sub1.aHashMap10681.get(Integer.valueOf(i));
	if (class25 == null)
	    class25 = new Class25();
	class25.anInt232 = Class554_Sub1.anInt10665 * -1551336507;
	class25.anInt231 = -1184677759 * Class554_Sub1.anInt10691;
	Class554_Sub1.aHashMap10681.put(Integer.valueOf(i), class25);
    }
}
