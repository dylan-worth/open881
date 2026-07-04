/* Class272 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class272 implements Interface13
{
    public String aString2964;
    Interface14 anInterface14_2965;
    public int anInt2966;
    public int anInt2967 = -1213277813;
    public int anInt2968 = -512422975;
    public String aString2969;
    public int anInt2970;
    public boolean aBool2971;
    public int anInt2972;
    public static final int anInt2973 = 0;
    public static final int anInt2974 = 1;
    public static final int anInt2975 = 2;
    public int anInt2976;
    public int anInt2977;
    public boolean aBool2978;
    public boolean aBool2979;
    public String[] aStringArray2980;
    public int[] anIntArray2981;
    int anInt2982;
    int anInt2983;
    int anInt2984;
    public int anInt2985;
    public int[] anIntArray2986;
    Class281 aClass281_2987;
    public int anInt2988;
    public int anInt2989;
    int anInt2990;
    int anInt2991;
    public int[] anIntArray2992;
    public int anInt2993;
    int anInt2994;
    public int anInt2995 = -2067287943;
    public int anInt2996;
    public int anInt2997;
    int anInt2998;
    public int anInt2999;
    public int anInt3000;
    public int anInt3001;
    int anInt3002;
    public Class284 aClass284_3003;
    public Class280 aClass280_3004;
    public int anInt3005;
    public byte[] aByteArray3006;
    public int anInt3007;
    int anInt3008;
    public int anInt3009;
    Class9 aClass9_3010;
    public int anInt3011;
    
    public final Class272 method5043(Interface18 interface18,
				     Interface20 interface20) {
	int i = -1;
	if (anInt2994 * 2053298867 != -1) {
	    Class318 class318
		= interface18.method107(anInt2994 * 2053298867, 1504047109);
	    if (null != class318)
		i = interface20.method119(class318, -1286709920);
	} else if (anInt2991 * -1810498581 != -1) {
	    Class150 class150
		= interface18.method108(Class453.aClass453_4946,
					anInt2991 * -1810498581, 1994830215);
	    if (null != class150)
		i = interface20.method120(class150, (byte) -65);
	}
	if (i < 0 || i >= anIntArray2981.length - 1) {
	    int i_0_ = anIntArray2981[anIntArray2981.length - 1];
	    if (i_0_ != -1)
		return ((Class272)
			anInterface14_2965.method91(i_0_, 1090643340));
	    return null;
	}
	if (-1 == anIntArray2981[i])
	    return null;
	return ((Class272)
		anInterface14_2965.method91(anIntArray2981[i], 42785251));
    }
    
    public String method5044(int i, String string) {
	if (null == aClass9_3010)
	    return string;
	Class534_Sub6 class534_sub6
	    = (Class534_Sub6) aClass9_3010.method579((long) i);
	if (class534_sub6 == null)
	    return string;
	return (String) class534_sub6.anObject10417;
    }
    
    void method5045(Class534_Sub40 class534_sub40, int i, int i_1_) {
	if (1 == i)
	    anInt2967 = class534_sub40.method16550((byte) 20) * 1213277813;
	else if (2 == i)
	    anInt2968 = class534_sub40.method16550((byte) 94) * 512422975;
	else if (3 == i)
	    aString2969 = class534_sub40.method16541((byte) -98);
	else if (4 == i)
	    anInt2970 = class534_sub40.method16531(603922296) * 1511802537;
	else if (5 == i)
	    anInt2995 = class534_sub40.method16531(514586640) * 2067287943;
	else if (i == 6)
	    anInt2985 = class534_sub40.method16527(1225785047) * -714664815;
	else if (7 == i) {
	    int i_2_ = class534_sub40.method16527(-471424840);
	    if ((i_2_ & 0x1) == 0)
		aBool2978 = false;
	    if ((i_2_ & 0x2) == 2)
		aBool2979 = true;
	} else if (i == 8)
	    class534_sub40.method16527(-1626446077);
	else if (i == 9) {
	    anInt2994 = class534_sub40.method16529((byte) 1) * 203515003;
	    if (2053298867 * anInt2994 == 65535)
		anInt2994 = -203515003;
	    anInt2991 = class534_sub40.method16529((byte) 1) * 1204311235;
	    if (-1810498581 * anInt2991 == 65535)
		anInt2991 = -1204311235;
	    anInt2983 = class534_sub40.method16533(-258848859) * -922685081;
	    anInt2984 = class534_sub40.method16533(-258848859) * -1090458667;
	} else if (i >= 10 && i <= 14)
	    aStringArray2980[i - 10] = class534_sub40.method16541((byte) -100);
	else if (i == 15) {
	    int i_3_ = class534_sub40.method16527(667152875);
	    anIntArray2992 = new int[2 * i_3_];
	    for (int i_4_ = 0; i_4_ < 2 * i_3_; i_4_++)
		anIntArray2992[i_4_] = class534_sub40.method16530((byte) -36);
	    anInt2997 = class534_sub40.method16533(-258848859) * 767966221;
	    int i_5_ = class534_sub40.method16527(-1010188749);
	    anIntArray2986 = new int[i_5_];
	    for (int i_6_ = 0; i_6_ < anIntArray2986.length; i_6_++)
		anIntArray2986[i_6_] = class534_sub40.method16533(-258848859);
	    aByteArray3006 = new byte[i_3_];
	    for (int i_7_ = 0; i_7_ < i_3_; i_7_++)
		aByteArray3006[i_7_] = class534_sub40.method16586((byte) 1);
	} else if (i == 16)
	    aBool2971 = false;
	else if (17 == i)
	    aString2964 = class534_sub40.method16541((byte) -21);
	else if (i == 18)
	    anInt2982 = class534_sub40.method16550((byte) -20) * -1450447181;
	else if (i == 19)
	    anInt2977 = class534_sub40.method16529((byte) 1) * -1790195673;
	else if (20 == i) {
	    anInt3008 = class534_sub40.method16529((byte) 1) * 1103600863;
	    if (65535 == -1999954145 * anInt3008)
		anInt3008 = -1103600863;
	    anInt2990 = class534_sub40.method16529((byte) 1) * -1643785285;
	    if (anInt2990 * -1547437709 == 65535)
		anInt2990 = 1643785285;
	    anInt2998 = class534_sub40.method16533(-258848859) * -677795049;
	    anInt3002 = class534_sub40.method16533(-258848859) * -871224657;
	} else if (21 == i)
	    anInt3009 = class534_sub40.method16533(-258848859) * -87565697;
	else if (i == 22)
	    anInt2976 = class534_sub40.method16533(-258848859) * 130037343;
	else if (23 == i) {
	    anInt3011 = class534_sub40.method16527(1208307227) * -872295829;
	    anInt2999 = class534_sub40.method16527(-692168440) * -1035879495;
	    anInt3000 = class534_sub40.method16527(-418004229) * 452058943;
	} else if (24 == i) {
	    anInt3001 = class534_sub40.method16530((byte) -10) * -951498863;
	    anInt2972 = class534_sub40.method16530((byte) -78) * -1516305789;
	} else if (i == 25)
	    anInt2988 = class534_sub40.method16550((byte) -33) * -1949132439;
	else if (i == 26 || 27 == i) {
	    anInt2994 = class534_sub40.method16529((byte) 1) * 203515003;
	    if (anInt2994 * 2053298867 == 65535)
		anInt2994 = -203515003;
	    anInt2991 = class534_sub40.method16529((byte) 1) * 1204311235;
	    if (65535 == -1810498581 * anInt2991)
		anInt2991 = -1204311235;
	    int i_8_ = -1;
	    if (27 == i) {
		i_8_ = class534_sub40.method16529((byte) 1);
		if (i_8_ == 65535)
		    i_8_ = -1;
	    }
	    int i_9_ = class534_sub40.method16527(-2119446022);
	    anIntArray2981 = new int[2 + i_9_];
	    for (int i_10_ = 0; i_10_ <= i_9_; i_10_++) {
		anIntArray2981[i_10_] = class534_sub40.method16529((byte) 1);
		if (anIntArray2981[i_10_] == 65535)
		    anIntArray2981[i_10_] = -1;
	    }
	    anIntArray2981[i_9_ + 1] = i_8_;
	} else if (i == 28)
	    anInt3007 = class534_sub40.method16527(-242068327) * -25856531;
	else if (29 == i)
	    aClass284_3003
		= ((Class284)
		   Class448.method7319(Class203.method3901((byte) 74),
				       class534_sub40.method16527(-1756401242),
				       2088438307));
	else if (i == 30)
	    aClass280_3004
		= ((Class280)
		   Class448.method7319(Class289.method5283((byte) 9),
				       class534_sub40.method16527(1590814260),
				       2088438307));
	else if (249 == i) {
	    int i_11_ = class534_sub40.method16527(-398799843);
	    if (null == aClass9_3010) {
		int i_12_ = Class162.method2640(i_11_, (byte) 109);
		aClass9_3010 = new Class9(i_12_);
	    }
	    for (int i_13_ = 0; i_13_ < i_11_; i_13_++) {
		boolean bool = class534_sub40.method16527(487645190) == 1;
		int i_14_ = class534_sub40.method16531(896748600);
		Class534 class534;
		if (bool)
		    class534 = new Class534_Sub6(class534_sub40
						     .method16541((byte) -54));
		else
		    class534
			= new Class534_Sub39(class534_sub40
						 .method16533(-258848859));
		aClass9_3010.method581(class534, (long) i_14_);
	    }
	}
    }
    
    public void method82(int i) {
	if (anIntArray2992 != null) {
	    for (int i_15_ = 0; i_15_ < anIntArray2992.length; i_15_ += 2) {
		if (anIntArray2992[i_15_] < anInt2993 * 1863424643)
		    anInt2993 = 2047542315 * anIntArray2992[i_15_];
		else if (anIntArray2992[i_15_] > -321707117 * anInt3005)
		    anInt3005 = -2019134821 * anIntArray2992[i_15_];
		if (anIntArray2992[1 + i_15_] < anInt2989 * 148212907)
		    anInt2989 = -345371133 * anIntArray2992[1 + i_15_];
		else if (anIntArray2992[1 + i_15_] > anInt2996 * -967887583)
		    anInt2996 = -576024863 * anIntArray2992[1 + i_15_];
	    }
	}
    }
    
    public int method5046(int i, int i_16_, int i_17_) {
	if (null == aClass9_3010)
	    return i_16_;
	Class534_Sub39 class534_sub39
	    = (Class534_Sub39) aClass9_3010.method579((long) i);
	if (null == class534_sub39)
	    return i_16_;
	return class534_sub39.anInt10807 * -705967177;
    }
    
    public Class163 method5047(Class185 class185, boolean bool, int i) {
	int i_18_ = bool ? anInt2968 * 1755773887 : anInt2967 * 1747122653;
	int i_19_ = i_18_ | 2098753835 * class185.anInt2001 << 29;
	Class163 class163
	    = ((Class163)
	       aClass281_2987.aClass203_3060.method3871((long) i_19_));
	if (null != class163)
	    return class163;
	if (!aClass281_2987.aClass472_3061.method7670(i_18_, (byte) -69))
	    return null;
	Class169 class169
	    = Class178.method2949(aClass281_2987.aClass472_3061, i_18_, 0);
	if (null != class169) {
	    class163 = class185.method3279(class169, true);
	    aClass281_2987.aClass203_3060.method3893(class163, (long) i_19_);
	}
	return class163;
    }
    
    public String method5048(int i, String string) {
	if (null == aClass9_3010)
	    return string;
	Class534_Sub6 class534_sub6
	    = (Class534_Sub6) aClass9_3010.method579((long) i);
	if (class534_sub6 == null)
	    return string;
	return (String) class534_sub6.anObject10417;
    }
    
    public Class163 method5049(Class185 class185, int i) {
	int i_20_
	    = 1339524825 * anInt2988 | 2098753835 * class185.anInt2001 << 29;
	Class163 class163
	    = ((Class163)
	       aClass281_2987.aClass203_3060.method3871((long) i_20_));
	if (class163 != null)
	    return class163;
	if (!aClass281_2987.aClass472_3061.method7670(anInt2988 * 1339524825,
						      (byte) -71))
	    return null;
	Class169 class169 = Class178.method2949(aClass281_2987.aClass472_3061,
						anInt2988 * 1339524825, 0);
	if (class169 != null) {
	    class163 = class185.method3279(class169, true);
	    aClass281_2987.aClass203_3060.method3893(class163, (long) i_20_);
	}
	return class163;
    }
    
    public Class163 method5050(Class185 class185) {
	int i = 1339524825 * anInt2988 | 2098753835 * class185.anInt2001 << 29;
	Class163 class163
	    = (Class163) aClass281_2987.aClass203_3060.method3871((long) i);
	if (class163 != null)
	    return class163;
	if (!aClass281_2987.aClass472_3061.method7670(anInt2988 * 1339524825,
						      (byte) -96))
	    return null;
	Class169 class169 = Class178.method2949(aClass281_2987.aClass472_3061,
						anInt2988 * 1339524825, 0);
	if (class169 != null) {
	    class163 = class185.method3279(class169, true);
	    aClass281_2987.aClass203_3060.method3893(class163, (long) i);
	}
	return class163;
    }
    
    public String method5051(int i, String string, int i_21_) {
	if (null == aClass9_3010)
	    return string;
	Class534_Sub6 class534_sub6
	    = (Class534_Sub6) aClass9_3010.method579((long) i);
	if (class534_sub6 == null)
	    return string;
	return (String) class534_sub6.anObject10417;
    }
    
    public final Class272 method5052(Interface18 interface18,
				     Interface20 interface20, int i) {
	int i_22_ = -1;
	if (anInt2994 * 2053298867 != -1) {
	    Class318 class318
		= interface18.method107(anInt2994 * 2053298867, 1504047109);
	    if (null != class318)
		i_22_ = interface20.method119(class318, -1053330756);
	} else if (anInt2991 * -1810498581 != -1) {
	    Class150 class150
		= interface18.method108(Class453.aClass453_4946,
					anInt2991 * -1810498581, 1626504763);
	    if (null != class150)
		i_22_ = interface20.method120(class150, (byte) -103);
	}
	if (i_22_ < 0 || i_22_ >= anIntArray2981.length - 1) {
	    int i_23_ = anIntArray2981[anIntArray2981.length - 1];
	    if (i_23_ != -1)
		return ((Class272)
			anInterface14_2965.method91(i_23_, -104211145));
	    return null;
	}
	if (-1 == anIntArray2981[i_22_])
	    return null;
	return (Class272) anInterface14_2965.method91(anIntArray2981[i_22_],
						      1536024266);
    }
    
    public void method80(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(1127539508);
	    if (0 == i)
		break;
	    method5045(class534_sub40, i, -1583672255);
	}
    }
    
    public void method78(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(580870678);
	    if (0 == i)
		break;
	    method5045(class534_sub40, i, -210355107);
	}
    }
    
    public void method81(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(-1658249768);
	    if (0 == i)
		break;
	    method5045(class534_sub40, i, -1273202312);
	}
    }
    
    public void method83() {
	if (anIntArray2992 != null) {
	    for (int i = 0; i < anIntArray2992.length; i += 2) {
		if (anIntArray2992[i] < anInt2993 * 1863424643)
		    anInt2993 = 2047542315 * anIntArray2992[i];
		else if (anIntArray2992[i] > -321707117 * anInt3005)
		    anInt3005 = -2019134821 * anIntArray2992[i];
		if (anIntArray2992[1 + i] < anInt2989 * 148212907)
		    anInt2989 = -345371133 * anIntArray2992[1 + i];
		else if (anIntArray2992[1 + i] > anInt2996 * -967887583)
		    anInt2996 = -576024863 * anIntArray2992[1 + i];
	    }
	}
    }
    
    Class272(int i, Interface14 interface14, Class281 class281) {
	anInt2985 = 0;
	aBool2978 = true;
	aBool2979 = false;
	aStringArray2980 = new String[5];
	anInt2982 = 1450447181;
	anInt2983 = 922685081;
	anInt2984 = 1090458667;
	anInt2994 = -203515003;
	anInt2991 = -1204311235;
	anInt3008 = -1103600863;
	anInt2990 = 1643785285;
	anIntArray2981 = null;
	anInt2993 = 99941333;
	anInt2989 = -1802112515;
	anInt3005 = -2147483648;
	anInt2996 = -2147483648;
	anInt3011 = 872295829;
	anInt2999 = 1035879495;
	anInt3000 = -452058943;
	aClass284_3003 = Class284.aClass284_3072;
	aClass280_3004 = Class280.aClass280_3056;
	anInt3007 = 25856531;
	aBool2971 = true;
	anInt2977 = 1790195673;
	anInt2988 = 1949132439;
	anInt2966 = -90070529 * i;
	anInterface14_2965 = interface14;
	aClass281_2987 = class281;
    }
    
    public void method84() {
	if (anIntArray2992 != null) {
	    for (int i = 0; i < anIntArray2992.length; i += 2) {
		if (anIntArray2992[i] < anInt2993 * 1863424643)
		    anInt2993 = 2047542315 * anIntArray2992[i];
		else if (anIntArray2992[i] > -321707117 * anInt3005)
		    anInt3005 = -2019134821 * anIntArray2992[i];
		if (anIntArray2992[1 + i] < anInt2989 * 148212907)
		    anInt2989 = -345371133 * anIntArray2992[1 + i];
		else if (anIntArray2992[1 + i] > anInt2996 * -967887583)
		    anInt2996 = -576024863 * anIntArray2992[1 + i];
	    }
	}
    }
    
    void method5053(Class534_Sub40 class534_sub40, int i) {
	if (1 == i)
	    anInt2967 = class534_sub40.method16550((byte) 54) * 1213277813;
	else if (2 == i)
	    anInt2968 = class534_sub40.method16550((byte) 14) * 512422975;
	else if (3 == i)
	    aString2969 = class534_sub40.method16541((byte) -18);
	else if (4 == i)
	    anInt2970 = class534_sub40.method16531(822586886) * 1511802537;
	else if (5 == i)
	    anInt2995 = class534_sub40.method16531(1858888343) * 2067287943;
	else if (i == 6)
	    anInt2985 = class534_sub40.method16527(-572627946) * -714664815;
	else if (7 == i) {
	    int i_24_ = class534_sub40.method16527(-1912151661);
	    if ((i_24_ & 0x1) == 0)
		aBool2978 = false;
	    if ((i_24_ & 0x2) == 2)
		aBool2979 = true;
	} else if (i == 8)
	    class534_sub40.method16527(1657000910);
	else if (i == 9) {
	    anInt2994 = class534_sub40.method16529((byte) 1) * 203515003;
	    if (2053298867 * anInt2994 == 65535)
		anInt2994 = -203515003;
	    anInt2991 = class534_sub40.method16529((byte) 1) * 1204311235;
	    if (-1810498581 * anInt2991 == 65535)
		anInt2991 = -1204311235;
	    anInt2983 = class534_sub40.method16533(-258848859) * -922685081;
	    anInt2984 = class534_sub40.method16533(-258848859) * -1090458667;
	} else if (i >= 10 && i <= 14)
	    aStringArray2980[i - 10] = class534_sub40.method16541((byte) -72);
	else if (i == 15) {
	    int i_25_ = class534_sub40.method16527(517017788);
	    anIntArray2992 = new int[2 * i_25_];
	    for (int i_26_ = 0; i_26_ < 2 * i_25_; i_26_++)
		anIntArray2992[i_26_] = class534_sub40.method16530((byte) -99);
	    anInt2997 = class534_sub40.method16533(-258848859) * 767966221;
	    int i_27_ = class534_sub40.method16527(453616337);
	    anIntArray2986 = new int[i_27_];
	    for (int i_28_ = 0; i_28_ < anIntArray2986.length; i_28_++)
		anIntArray2986[i_28_] = class534_sub40.method16533(-258848859);
	    aByteArray3006 = new byte[i_25_];
	    for (int i_29_ = 0; i_29_ < i_25_; i_29_++)
		aByteArray3006[i_29_] = class534_sub40.method16586((byte) 1);
	} else if (i == 16)
	    aBool2971 = false;
	else if (17 == i)
	    aString2964 = class534_sub40.method16541((byte) -98);
	else if (i == 18)
	    anInt2982 = class534_sub40.method16550((byte) -72) * -1450447181;
	else if (i == 19)
	    anInt2977 = class534_sub40.method16529((byte) 1) * -1790195673;
	else if (20 == i) {
	    anInt3008 = class534_sub40.method16529((byte) 1) * 1103600863;
	    if (65535 == -1999954145 * anInt3008)
		anInt3008 = -1103600863;
	    anInt2990 = class534_sub40.method16529((byte) 1) * -1643785285;
	    if (anInt2990 * -1547437709 == 65535)
		anInt2990 = 1643785285;
	    anInt2998 = class534_sub40.method16533(-258848859) * -677795049;
	    anInt3002 = class534_sub40.method16533(-258848859) * -871224657;
	} else if (21 == i)
	    anInt3009 = class534_sub40.method16533(-258848859) * -87565697;
	else if (i == 22)
	    anInt2976 = class534_sub40.method16533(-258848859) * 130037343;
	else if (23 == i) {
	    anInt3011 = class534_sub40.method16527(1913663460) * -872295829;
	    anInt2999 = class534_sub40.method16527(420857495) * -1035879495;
	    anInt3000 = class534_sub40.method16527(-241531263) * 452058943;
	} else if (24 == i) {
	    anInt3001 = class534_sub40.method16530((byte) -12) * -951498863;
	    anInt2972 = class534_sub40.method16530((byte) -54) * -1516305789;
	} else if (i == 25)
	    anInt2988 = class534_sub40.method16550((byte) 4) * -1949132439;
	else if (i == 26 || 27 == i) {
	    anInt2994 = class534_sub40.method16529((byte) 1) * 203515003;
	    if (anInt2994 * 2053298867 == 65535)
		anInt2994 = -203515003;
	    anInt2991 = class534_sub40.method16529((byte) 1) * 1204311235;
	    if (65535 == -1810498581 * anInt2991)
		anInt2991 = -1204311235;
	    int i_30_ = -1;
	    if (27 == i) {
		i_30_ = class534_sub40.method16529((byte) 1);
		if (i_30_ == 65535)
		    i_30_ = -1;
	    }
	    int i_31_ = class534_sub40.method16527(1337197602);
	    anIntArray2981 = new int[2 + i_31_];
	    for (int i_32_ = 0; i_32_ <= i_31_; i_32_++) {
		anIntArray2981[i_32_] = class534_sub40.method16529((byte) 1);
		if (anIntArray2981[i_32_] == 65535)
		    anIntArray2981[i_32_] = -1;
	    }
	    anIntArray2981[i_31_ + 1] = i_30_;
	} else if (i == 28)
	    anInt3007 = class534_sub40.method16527(67370711) * -25856531;
	else if (29 == i)
	    aClass284_3003
		= ((Class284)
		   Class448.method7319(Class203.method3901((byte) 66),
				       class534_sub40.method16527(-1749795886),
				       2088438307));
	else if (i == 30)
	    aClass280_3004
		= ((Class280)
		   Class448.method7319(Class289.method5283((byte) 9),
				       class534_sub40.method16527(931225172),
				       2088438307));
	else if (249 == i) {
	    int i_33_ = class534_sub40.method16527(-2058378701);
	    if (null == aClass9_3010) {
		int i_34_ = Class162.method2640(i_33_, (byte) 71);
		aClass9_3010 = new Class9(i_34_);
	    }
	    for (int i_35_ = 0; i_35_ < i_33_; i_35_++) {
		boolean bool = class534_sub40.method16527(1252307672) == 1;
		int i_36_ = class534_sub40.method16531(568462215);
		Class534 class534;
		if (bool)
		    class534 = new Class534_Sub6(class534_sub40
						     .method16541((byte) -93));
		else
		    class534
			= new Class534_Sub39(class534_sub40
						 .method16533(-258848859));
		aClass9_3010.method581(class534, (long) i_36_);
	    }
	}
    }
    
    void method5054(Class534_Sub40 class534_sub40, int i) {
	if (1 == i)
	    anInt2967 = class534_sub40.method16550((byte) 43) * 1213277813;
	else if (2 == i)
	    anInt2968 = class534_sub40.method16550((byte) -77) * 512422975;
	else if (3 == i)
	    aString2969 = class534_sub40.method16541((byte) -100);
	else if (4 == i)
	    anInt2970 = class534_sub40.method16531(958729639) * 1511802537;
	else if (5 == i)
	    anInt2995 = class534_sub40.method16531(723442169) * 2067287943;
	else if (i == 6)
	    anInt2985 = class534_sub40.method16527(-1749633585) * -714664815;
	else if (7 == i) {
	    int i_37_ = class534_sub40.method16527(-1489943285);
	    if ((i_37_ & 0x1) == 0)
		aBool2978 = false;
	    if ((i_37_ & 0x2) == 2)
		aBool2979 = true;
	} else if (i == 8)
	    class534_sub40.method16527(-8994307);
	else if (i == 9) {
	    anInt2994 = class534_sub40.method16529((byte) 1) * 203515003;
	    if (2053298867 * anInt2994 == 65535)
		anInt2994 = -203515003;
	    anInt2991 = class534_sub40.method16529((byte) 1) * 1204311235;
	    if (-1810498581 * anInt2991 == 65535)
		anInt2991 = -1204311235;
	    anInt2983 = class534_sub40.method16533(-258848859) * -922685081;
	    anInt2984 = class534_sub40.method16533(-258848859) * -1090458667;
	} else if (i >= 10 && i <= 14)
	    aStringArray2980[i - 10] = class534_sub40.method16541((byte) -44);
	else if (i == 15) {
	    int i_38_ = class534_sub40.method16527(114974630);
	    anIntArray2992 = new int[2 * i_38_];
	    for (int i_39_ = 0; i_39_ < 2 * i_38_; i_39_++)
		anIntArray2992[i_39_] = class534_sub40.method16530((byte) -62);
	    anInt2997 = class534_sub40.method16533(-258848859) * 767966221;
	    int i_40_ = class534_sub40.method16527(-1568489807);
	    anIntArray2986 = new int[i_40_];
	    for (int i_41_ = 0; i_41_ < anIntArray2986.length; i_41_++)
		anIntArray2986[i_41_] = class534_sub40.method16533(-258848859);
	    aByteArray3006 = new byte[i_38_];
	    for (int i_42_ = 0; i_42_ < i_38_; i_42_++)
		aByteArray3006[i_42_] = class534_sub40.method16586((byte) 1);
	} else if (i == 16)
	    aBool2971 = false;
	else if (17 == i)
	    aString2964 = class534_sub40.method16541((byte) -116);
	else if (i == 18)
	    anInt2982 = class534_sub40.method16550((byte) 67) * -1450447181;
	else if (i == 19)
	    anInt2977 = class534_sub40.method16529((byte) 1) * -1790195673;
	else if (20 == i) {
	    anInt3008 = class534_sub40.method16529((byte) 1) * 1103600863;
	    if (65535 == -1999954145 * anInt3008)
		anInt3008 = -1103600863;
	    anInt2990 = class534_sub40.method16529((byte) 1) * -1643785285;
	    if (anInt2990 * -1547437709 == 65535)
		anInt2990 = 1643785285;
	    anInt2998 = class534_sub40.method16533(-258848859) * -677795049;
	    anInt3002 = class534_sub40.method16533(-258848859) * -871224657;
	} else if (21 == i)
	    anInt3009 = class534_sub40.method16533(-258848859) * -87565697;
	else if (i == 22)
	    anInt2976 = class534_sub40.method16533(-258848859) * 130037343;
	else if (23 == i) {
	    anInt3011 = class534_sub40.method16527(-1583006772) * -872295829;
	    anInt2999 = class534_sub40.method16527(-744989364) * -1035879495;
	    anInt3000 = class534_sub40.method16527(1725653584) * 452058943;
	} else if (24 == i) {
	    anInt3001 = class534_sub40.method16530((byte) -25) * -951498863;
	    anInt2972 = class534_sub40.method16530((byte) -14) * -1516305789;
	} else if (i == 25)
	    anInt2988 = class534_sub40.method16550((byte) 24) * -1949132439;
	else if (i == 26 || 27 == i) {
	    anInt2994 = class534_sub40.method16529((byte) 1) * 203515003;
	    if (anInt2994 * 2053298867 == 65535)
		anInt2994 = -203515003;
	    anInt2991 = class534_sub40.method16529((byte) 1) * 1204311235;
	    if (65535 == -1810498581 * anInt2991)
		anInt2991 = -1204311235;
	    int i_43_ = -1;
	    if (27 == i) {
		i_43_ = class534_sub40.method16529((byte) 1);
		if (i_43_ == 65535)
		    i_43_ = -1;
	    }
	    int i_44_ = class534_sub40.method16527(-478735765);
	    anIntArray2981 = new int[2 + i_44_];
	    for (int i_45_ = 0; i_45_ <= i_44_; i_45_++) {
		anIntArray2981[i_45_] = class534_sub40.method16529((byte) 1);
		if (anIntArray2981[i_45_] == 65535)
		    anIntArray2981[i_45_] = -1;
	    }
	    anIntArray2981[i_44_ + 1] = i_43_;
	} else if (i == 28)
	    anInt3007 = class534_sub40.method16527(-1593847283) * -25856531;
	else if (29 == i)
	    aClass284_3003
		= ((Class284)
		   Class448.method7319(Class203.method3901((byte) 119),
				       class534_sub40.method16527(-1846809414),
				       2088438307));
	else if (i == 30)
	    aClass280_3004
		= ((Class280)
		   Class448.method7319(Class289.method5283((byte) 9),
				       class534_sub40.method16527(-1743897804),
				       2088438307));
	else if (249 == i) {
	    int i_46_ = class534_sub40.method16527(-1877866305);
	    if (null == aClass9_3010) {
		int i_47_ = Class162.method2640(i_46_, (byte) 9);
		aClass9_3010 = new Class9(i_47_);
	    }
	    for (int i_48_ = 0; i_48_ < i_46_; i_48_++) {
		boolean bool = class534_sub40.method16527(812687255) == 1;
		int i_49_ = class534_sub40.method16531(2038398084);
		Class534 class534;
		if (bool)
		    class534 = new Class534_Sub6(class534_sub40
						     .method16541((byte) -26));
		else
		    class534
			= new Class534_Sub39(class534_sub40
						 .method16533(-258848859));
		aClass9_3010.method581(class534, (long) i_49_);
	    }
	}
    }
    
    public boolean method5055(Interface18 interface18,
			      Interface20 interface20) {
	int i = -1;
	if (anInt2991 * -1810498581 != -1) {
	    Class150 class150
		= interface18.method108(Class453.aClass453_4946,
					anInt2991 * -1810498581, 1858569543);
	    i = interface20.method120(class150, (byte) -84);
	} else if (2053298867 * anInt2994 != -1) {
	    Class318 class318
		= interface18.method107(anInt2994 * 2053298867, 1504047109);
	    i = interface20.method119(class318, -1318298083);
	} else
	    return true;
	if (anIntArray2981 == null) {
	    if (i < -1390765481 * anInt2983 || i > 2121463165 * anInt2984)
		return false;
	} else {
	    if (i < 0 || i >= anIntArray2981.length - 1) {
		int i_50_ = anIntArray2981[anIntArray2981.length - 1];
		if (-1 != i_50_) {
		    if (anInt2983 * -1390765481 != -1
			&& -1 != anInt2984 * 2121463165
			&& (i < -1390765481 * anInt2983
			    || i > 2121463165 * anInt2984))
			return false;
		} else
		    return false;
	    }
	    if (-1 == anIntArray2981[i])
		return false;
	}
	boolean bool = false;
	int i_51_;
	if (-1 != anInt2990 * -1547437709) {
	    Class150 class150
		= interface18.method108(Class453.aClass453_4946,
					-1547437709 * anInt2990, 1610653850);
	    i_51_ = interface20.method120(class150, (byte) -62);
	} else if (anInt3008 * -1999954145 != -1) {
	    Class318 class318
		= interface18.method107(anInt3008 * -1999954145, 1504047109);
	    i_51_ = interface20.method119(class318, -2018920193);
	} else
	    return true;
	if (i_51_ < -409453401 * anInt2998 || i_51_ > 1183673423 * anInt3002)
	    return false;
	return true;
    }
    
    public boolean method5056(Interface18 interface18,
			      Interface20 interface20) {
	int i = -1;
	if (anInt2991 * -1810498581 != -1) {
	    Class150 class150
		= interface18.method108(Class453.aClass453_4946,
					anInt2991 * -1810498581, 1864443572);
	    i = interface20.method120(class150, (byte) -34);
	} else if (2053298867 * anInt2994 != -1) {
	    Class318 class318
		= interface18.method107(anInt2994 * 2053298867, 1504047109);
	    i = interface20.method119(class318, -1265912192);
	} else
	    return true;
	if (anIntArray2981 == null) {
	    if (i < -1390765481 * anInt2983 || i > 2121463165 * anInt2984)
		return false;
	} else {
	    if (i < 0 || i >= anIntArray2981.length - 1) {
		int i_52_ = anIntArray2981[anIntArray2981.length - 1];
		if (-1 != i_52_) {
		    if (anInt2983 * -1390765481 != -1
			&& -1 != anInt2984 * 2121463165
			&& (i < -1390765481 * anInt2983
			    || i > 2121463165 * anInt2984))
			return false;
		} else
		    return false;
	    }
	    if (-1 == anIntArray2981[i])
		return false;
	}
	boolean bool = false;
	int i_53_;
	if (-1 != anInt2990 * -1547437709) {
	    Class150 class150
		= interface18.method108(Class453.aClass453_4946,
					-1547437709 * anInt2990, 1825411418);
	    i_53_ = interface20.method120(class150, (byte) -89);
	} else if (anInt3008 * -1999954145 != -1) {
	    Class318 class318
		= interface18.method107(anInt3008 * -1999954145, 1504047109);
	    i_53_ = interface20.method119(class318, -1033835031);
	} else
	    return true;
	if (i_53_ < -409453401 * anInt2998 || i_53_ > 1183673423 * anInt3002)
	    return false;
	return true;
    }
    
    public Class163 method5057(Class185 class185, boolean bool) {
	int i = bool ? anInt2968 * 1755773887 : anInt2967 * 1747122653;
	int i_54_ = i | 2098753835 * class185.anInt2001 << 29;
	Class163 class163
	    = ((Class163)
	       aClass281_2987.aClass203_3060.method3871((long) i_54_));
	if (null != class163)
	    return class163;
	if (!aClass281_2987.aClass472_3061.method7670(i, (byte) -63))
	    return null;
	Class169 class169
	    = Class178.method2949(aClass281_2987.aClass472_3061, i, 0);
	if (null != class169) {
	    class163 = class185.method3279(class169, true);
	    aClass281_2987.aClass203_3060.method3893(class163, (long) i_54_);
	}
	return class163;
    }
    
    public Class163 method5058(Class185 class185, byte i) {
	Class163 class163
	    = (Class163) (aClass281_2987.aClass203_3060.method3871
			  ((long) (anInt2982 * -1269665669 | 0x20000
				   | 2098753835 * class185.anInt2001 << 29)));
	if (null != class163)
	    return class163;
	aClass281_2987.aClass472_3061.method7670(anInt2982 * -1269665669,
						 (byte) -124);
	Class169 class169 = Class178.method2949(aClass281_2987.aClass472_3061,
						anInt2982 * -1269665669, 0);
	if (null != class169) {
	    class163 = class185.method3279(class169, true);
	    aClass281_2987.aClass203_3060.method3893
		(class163, (long) (-1269665669 * anInt2982 | 0x20000
				   | 2098753835 * class185.anInt2001 << 29));
	}
	return class163;
    }
    
    public Class163 method5059(Class185 class185) {
	int i = 1339524825 * anInt2988 | 2098753835 * class185.anInt2001 << 29;
	Class163 class163
	    = (Class163) aClass281_2987.aClass203_3060.method3871((long) i);
	if (class163 != null)
	    return class163;
	if (!aClass281_2987.aClass472_3061.method7670(anInt2988 * 1339524825,
						      (byte) -64))
	    return null;
	Class169 class169 = Class178.method2949(aClass281_2987.aClass472_3061,
						anInt2988 * 1339524825, 0);
	if (class169 != null) {
	    class163 = class185.method3279(class169, true);
	    aClass281_2987.aClass203_3060.method3893(class163, (long) i);
	}
	return class163;
    }
    
    void method5060(Class534_Sub40 class534_sub40, int i) {
	if (1 == i)
	    anInt2967 = class534_sub40.method16550((byte) -26) * 1213277813;
	else if (2 == i)
	    anInt2968 = class534_sub40.method16550((byte) -19) * 512422975;
	else if (3 == i)
	    aString2969 = class534_sub40.method16541((byte) -38);
	else if (4 == i)
	    anInt2970 = class534_sub40.method16531(510638511) * 1511802537;
	else if (5 == i)
	    anInt2995 = class534_sub40.method16531(780023091) * 2067287943;
	else if (i == 6)
	    anInt2985 = class534_sub40.method16527(579720197) * -714664815;
	else if (7 == i) {
	    int i_55_ = class534_sub40.method16527(395076696);
	    if ((i_55_ & 0x1) == 0)
		aBool2978 = false;
	    if ((i_55_ & 0x2) == 2)
		aBool2979 = true;
	} else if (i == 8)
	    class534_sub40.method16527(-46095897);
	else if (i == 9) {
	    anInt2994 = class534_sub40.method16529((byte) 1) * 203515003;
	    if (2053298867 * anInt2994 == 65535)
		anInt2994 = -203515003;
	    anInt2991 = class534_sub40.method16529((byte) 1) * 1204311235;
	    if (-1810498581 * anInt2991 == 65535)
		anInt2991 = -1204311235;
	    anInt2983 = class534_sub40.method16533(-258848859) * -922685081;
	    anInt2984 = class534_sub40.method16533(-258848859) * -1090458667;
	} else if (i >= 10 && i <= 14)
	    aStringArray2980[i - 10] = class534_sub40.method16541((byte) -78);
	else if (i == 15) {
	    int i_56_ = class534_sub40.method16527(5616059);
	    anIntArray2992 = new int[2 * i_56_];
	    for (int i_57_ = 0; i_57_ < 2 * i_56_; i_57_++)
		anIntArray2992[i_57_] = class534_sub40.method16530((byte) -95);
	    anInt2997 = class534_sub40.method16533(-258848859) * 767966221;
	    int i_58_ = class534_sub40.method16527(823195144);
	    anIntArray2986 = new int[i_58_];
	    for (int i_59_ = 0; i_59_ < anIntArray2986.length; i_59_++)
		anIntArray2986[i_59_] = class534_sub40.method16533(-258848859);
	    aByteArray3006 = new byte[i_56_];
	    for (int i_60_ = 0; i_60_ < i_56_; i_60_++)
		aByteArray3006[i_60_] = class534_sub40.method16586((byte) 1);
	} else if (i == 16)
	    aBool2971 = false;
	else if (17 == i)
	    aString2964 = class534_sub40.method16541((byte) -96);
	else if (i == 18)
	    anInt2982 = class534_sub40.method16550((byte) 42) * -1450447181;
	else if (i == 19)
	    anInt2977 = class534_sub40.method16529((byte) 1) * -1790195673;
	else if (20 == i) {
	    anInt3008 = class534_sub40.method16529((byte) 1) * 1103600863;
	    if (65535 == -1999954145 * anInt3008)
		anInt3008 = -1103600863;
	    anInt2990 = class534_sub40.method16529((byte) 1) * -1643785285;
	    if (anInt2990 * -1547437709 == 65535)
		anInt2990 = 1643785285;
	    anInt2998 = class534_sub40.method16533(-258848859) * -677795049;
	    anInt3002 = class534_sub40.method16533(-258848859) * -871224657;
	} else if (21 == i)
	    anInt3009 = class534_sub40.method16533(-258848859) * -87565697;
	else if (i == 22)
	    anInt2976 = class534_sub40.method16533(-258848859) * 130037343;
	else if (23 == i) {
	    anInt3011 = class534_sub40.method16527(959212042) * -872295829;
	    anInt2999 = class534_sub40.method16527(-1716699197) * -1035879495;
	    anInt3000 = class534_sub40.method16527(1229178276) * 452058943;
	} else if (24 == i) {
	    anInt3001 = class534_sub40.method16530((byte) -26) * -951498863;
	    anInt2972 = class534_sub40.method16530((byte) -64) * -1516305789;
	} else if (i == 25)
	    anInt2988 = class534_sub40.method16550((byte) 40) * -1949132439;
	else if (i == 26 || 27 == i) {
	    anInt2994 = class534_sub40.method16529((byte) 1) * 203515003;
	    if (anInt2994 * 2053298867 == 65535)
		anInt2994 = -203515003;
	    anInt2991 = class534_sub40.method16529((byte) 1) * 1204311235;
	    if (65535 == -1810498581 * anInt2991)
		anInt2991 = -1204311235;
	    int i_61_ = -1;
	    if (27 == i) {
		i_61_ = class534_sub40.method16529((byte) 1);
		if (i_61_ == 65535)
		    i_61_ = -1;
	    }
	    int i_62_ = class534_sub40.method16527(-750168240);
	    anIntArray2981 = new int[2 + i_62_];
	    for (int i_63_ = 0; i_63_ <= i_62_; i_63_++) {
		anIntArray2981[i_63_] = class534_sub40.method16529((byte) 1);
		if (anIntArray2981[i_63_] == 65535)
		    anIntArray2981[i_63_] = -1;
	    }
	    anIntArray2981[i_62_ + 1] = i_61_;
	} else if (i == 28)
	    anInt3007 = class534_sub40.method16527(-1686134386) * -25856531;
	else if (29 == i)
	    aClass284_3003
		= ((Class284)
		   Class448.method7319(Class203.method3901((byte) 57),
				       class534_sub40.method16527(-2049241451),
				       2088438307));
	else if (i == 30)
	    aClass280_3004
		= ((Class280)
		   Class448.method7319(Class289.method5283((byte) 9),
				       class534_sub40.method16527(1173619906),
				       2088438307));
	else if (249 == i) {
	    int i_64_ = class534_sub40.method16527(1906114290);
	    if (null == aClass9_3010) {
		int i_65_ = Class162.method2640(i_64_, (byte) 87);
		aClass9_3010 = new Class9(i_65_);
	    }
	    for (int i_66_ = 0; i_66_ < i_64_; i_66_++) {
		boolean bool = class534_sub40.method16527(-1248482692) == 1;
		int i_67_ = class534_sub40.method16531(895972745);
		Class534 class534;
		if (bool)
		    class534 = new Class534_Sub6(class534_sub40
						     .method16541((byte) -16));
		else
		    class534
			= new Class534_Sub39(class534_sub40
						 .method16533(-258848859));
		aClass9_3010.method581(class534, (long) i_67_);
	    }
	}
    }
    
    public Class163 method5061(Class185 class185) {
	Class163 class163
	    = (Class163) (aClass281_2987.aClass203_3060.method3871
			  ((long) (anInt2982 * -1269665669 | 0x20000
				   | 2098753835 * class185.anInt2001 << 29)));
	if (null != class163)
	    return class163;
	aClass281_2987.aClass472_3061.method7670(anInt2982 * -1269665669,
						 (byte) -12);
	Class169 class169 = Class178.method2949(aClass281_2987.aClass472_3061,
						anInt2982 * -1269665669, 0);
	if (null != class169) {
	    class163 = class185.method3279(class169, true);
	    aClass281_2987.aClass203_3060.method3893
		(class163, (long) (-1269665669 * anInt2982 | 0x20000
				   | 2098753835 * class185.anInt2001 << 29));
	}
	return class163;
    }
    
    public Class163 method5062(Class185 class185) {
	Class163 class163
	    = (Class163) (aClass281_2987.aClass203_3060.method3871
			  ((long) (anInt2982 * -1269665669 | 0x20000
				   | 2098753835 * class185.anInt2001 << 29)));
	if (null != class163)
	    return class163;
	aClass281_2987.aClass472_3061.method7670(anInt2982 * -1269665669,
						 (byte) -125);
	Class169 class169 = Class178.method2949(aClass281_2987.aClass472_3061,
						anInt2982 * -1269665669, 0);
	if (null != class169) {
	    class163 = class185.method3279(class169, true);
	    aClass281_2987.aClass203_3060.method3893
		(class163, (long) (-1269665669 * anInt2982 | 0x20000
				   | 2098753835 * class185.anInt2001 << 29));
	}
	return class163;
    }
    
    public void method79(Class534_Sub40 class534_sub40, byte i) {
	for (;;) {
	    int i_68_ = class534_sub40.method16527(-1287764131);
	    if (0 == i_68_)
		break;
	    method5045(class534_sub40, i_68_, 2138905283);
	}
    }
    
    public boolean method5063(Interface18 interface18, Interface20 interface20,
			      short i) {
	int i_69_ = -1;
	if (anInt2991 * -1810498581 != -1) {
	    Class150 class150
		= interface18.method108(Class453.aClass453_4946,
					anInt2991 * -1810498581, 2061785556);
	    i_69_ = interface20.method120(class150, (byte) -46);
	} else if (2053298867 * anInt2994 != -1) {
	    Class318 class318
		= interface18.method107(anInt2994 * 2053298867, 1504047109);
	    i_69_ = interface20.method119(class318, -1970649301);
	} else
	    return true;
	if (anIntArray2981 == null) {
	    if (i_69_ < -1390765481 * anInt2983
		|| i_69_ > 2121463165 * anInt2984)
		return false;
	} else {
	    if (i_69_ < 0 || i_69_ >= anIntArray2981.length - 1) {
		int i_70_ = anIntArray2981[anIntArray2981.length - 1];
		if (-1 != i_70_) {
		    if (anInt2983 * -1390765481 != -1
			&& -1 != anInt2984 * 2121463165
			&& (i_69_ < -1390765481 * anInt2983
			    || i_69_ > 2121463165 * anInt2984))
			return false;
		} else
		    return false;
	    }
	    if (-1 == anIntArray2981[i_69_])
		return false;
	}
	boolean bool = false;
	int i_71_;
	if (-1 != anInt2990 * -1547437709) {
	    Class150 class150
		= interface18.method108(Class453.aClass453_4946,
					-1547437709 * anInt2990, 1843492027);
	    i_71_ = interface20.method120(class150, (byte) -9);
	} else if (anInt3008 * -1999954145 != -1) {
	    Class318 class318
		= interface18.method107(anInt3008 * -1999954145, 1504047109);
	    i_71_ = interface20.method119(class318, -2004855401);
	} else
	    return true;
	if (i_71_ < -409453401 * anInt2998 || i_71_ > 1183673423 * anInt3002)
	    return false;
	return true;
    }
    
    public String method5064(int i, String string) {
	if (null == aClass9_3010)
	    return string;
	Class534_Sub6 class534_sub6
	    = (Class534_Sub6) aClass9_3010.method579((long) i);
	if (class534_sub6 == null)
	    return string;
	return (String) class534_sub6.anObject10417;
    }
    
    public String method5065(int i, String string) {
	if (null == aClass9_3010)
	    return string;
	Class534_Sub6 class534_sub6
	    = (Class534_Sub6) aClass9_3010.method579((long) i);
	if (class534_sub6 == null)
	    return string;
	return (String) class534_sub6.anObject10417;
    }
    
    public Class163 method5066(Class185 class185, boolean bool) {
	int i = bool ? anInt2968 * 1755773887 : anInt2967 * 1747122653;
	int i_72_ = i | 2098753835 * class185.anInt2001 << 29;
	Class163 class163
	    = ((Class163)
	       aClass281_2987.aClass203_3060.method3871((long) i_72_));
	if (null != class163)
	    return class163;
	if (!aClass281_2987.aClass472_3061.method7670(i, (byte) -98))
	    return null;
	Class169 class169
	    = Class178.method2949(aClass281_2987.aClass472_3061, i, 0);
	if (null != class169) {
	    class163 = class185.method3279(class169, true);
	    aClass281_2987.aClass203_3060.method3893(class163, (long) i_72_);
	}
	return class163;
    }
    
    public static void method5067
	(int i, int i_73_, String string, String string_74_, String string_75_,
	 String string_76_, Class407 class407, byte i_77_) {
	Class216.method4111(i, i_73_, string, string_74_, string_75_,
			    string_76_, null, -1, class407, (byte) 12);
    }
    
    static String method5068(int i, int i_78_, boolean bool, int i_79_) {
	if (i_78_ < 2 || i_78_ > 36)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (i_78_).toString());
	if (!bool || i < 0)
	    return Integer.toString(i, i_78_);
	int i_80_ = 2;
	int i_81_ = i / i_78_;
	while (0 != i_81_) {
	    i_81_ /= i_78_;
	    i_80_++;
	}
	char[] cs = new char[i_80_];
	cs[0] = '+';
	for (int i_82_ = i_80_ - 1; i_82_ > 0; i_82_--) {
	    int i_83_ = i;
	    i /= i_78_;
	    int i_84_ = i_83_ - i * i_78_;
	    if (i_84_ >= 10)
		cs[i_82_] = (char) (87 + i_84_);
	    else
		cs[i_82_] = (char) (i_84_ + 48);
	}
	return new String(cs);
    }
}
