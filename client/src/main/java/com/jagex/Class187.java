/* Class187 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class187
{
    public short[] aShortArray2077;
    byte aByte2078;
    static final int anInt2079 = 1;
    public int[] anIntArray2080;
    public int anInt2081;
    public int anInt2082 = 12;
    public int[] anIntArray2083;
    public float[] aFloatArray2084;
    public short[] aShortArray2085;
    public byte[] aByteArray2086;
    public int[] anIntArray2087;
    public short[] aShortArray2088;
    int anInt2089;
    public int[] anIntArray2090;
    public float[] aFloatArray2091;
    public int anInt2092;
    public short[] aShortArray2093;
    public short[] aShortArray2094;
    public short[] aShortArray2095;
    public short[] aShortArray2096;
    public byte[] aByteArray2097;
    public byte[] aByteArray2098;
    public byte[] aByteArray2099;
    public byte[] aByteArray2100;
    public byte[] aByteArray2101;
    public short[] aShortArray2102;
    static final int anInt2103 = 3;
    public short[] aShortArray2104;
    static final int anInt2105 = 26;
    public int anInt2106;
    public static final short aShort2107 = -1;
    public short[] aShortArray2108;
    public static final short aShort2109 = 32766;
    int anInt2110;
    public byte[] aByteArray2111;
    public int[] anIntArray2112;
    public int[] anIntArray2113;
    public short[] aShortArray2114;
    public int[] anIntArray2115;
    public int[] anIntArray2116;
    public int[] anIntArray2117;
    public int[] anIntArray2118;
    public int[] anIntArray2119;
    public int[] anIntArray2120;
    byte[] aByteArray2121;
    public byte[] aByteArray2122;
    public Class172[] aClass172Array2123;
    public Class158[] aClass158Array2124;
    public Class168[] aClass168Array2125;
    
    public void method3706(float f) {
	for (int i = 0; i < anInt2081; i++) {
	    anIntArray2083[i] *= f;
	    anIntArray2080[i] *= f;
	    anIntArray2113[i] *= f;
	}
	if (anInt2110 > 0 && anIntArray2115 != null) {
	    for (int i = 0; i < anIntArray2115.length; i++) {
		anIntArray2115[i] *= f;
		anIntArray2116[i] *= f;
		if (aByteArray2086[i] != 1)
		    anIntArray2117[i] *= f;
	    }
	}
    }
    
    public static Class187 method3707(Class472 class472, int i, int i_0_) {
	byte[] is = class472.method7743(i, i_0_, -1979812696);
	if (is == null)
	    return null;
	return new Class187(is);
    }
    
    public Class187(int i, int i_1_, int i_2_) {
	anInt2081 = 0;
	anInt2106 = 0;
	anInt2092 = 0;
	aByte2078 = (byte) 0;
	anInt2110 = 0;
	anIntArray2083 = new int[i];
	anIntArray2080 = new int[i];
	anIntArray2113 = new int[i];
	anIntArray2087 = new int[i];
	aShortArray2093 = new short[i_1_];
	aShortArray2077 = new short[i_1_];
	aShortArray2095 = new short[i_1_];
	aByteArray2099 = new byte[i_1_];
	aByteArray2100 = new byte[i_1_];
	aByteArray2101 = new byte[i_1_];
	aShortArray2102 = new short[i_1_];
	aShortArray2096 = new short[i_1_];
	aShortArray2104 = new short[i_1_];
	anIntArray2090 = new int[i_1_];
	if (i_2_ > 0) {
	    aByteArray2086 = new byte[i_2_];
	    aShortArray2108 = new short[i_2_];
	    aShortArray2085 = new short[i_2_];
	    aShortArray2114 = new short[i_2_];
	    anIntArray2115 = new int[i_2_];
	    anIntArray2116 = new int[i_2_];
	    anIntArray2117 = new int[i_2_];
	    aByteArray2121 = new byte[i_2_];
	    aByteArray2122 = new byte[i_2_];
	    anIntArray2118 = new int[i_2_];
	    anIntArray2119 = new int[i_2_];
	    anIntArray2120 = new int[i_2_];
	}
    }
    
    final int method3708(Class187 class187_3_, int i, short i_4_) {
	int i_5_ = class187_3_.anIntArray2083[i];
	int i_6_ = class187_3_.anIntArray2080[i];
	int i_7_ = class187_3_.anIntArray2113[i];
	for (int i_8_ = 0; i_8_ < anInt2081; i_8_++) {
	    if (i_5_ == anIntArray2083[i_8_] && i_6_ == anIntArray2080[i_8_]
		&& i_7_ == anIntArray2113[i_8_]) {
		aShortArray2088[i_8_] |= i_4_;
		return i_8_;
	    }
	}
	anIntArray2083[anInt2081] = i_5_;
	anIntArray2080[anInt2081] = i_6_;
	anIntArray2113[anInt2081] = i_7_;
	aShortArray2088[anInt2081] = i_4_;
	anIntArray2087[anInt2081] = (class187_3_.anIntArray2087 != null
				     ? class187_3_.anIntArray2087[i] : -1);
	return anInt2081++;
    }
    
    public static Class187 method3709(Class472 class472, int i, int i_9_) {
	byte[] is = class472.method7743(i, i_9_, -1345474872);
	if (is == null)
	    return null;
	return new Class187(is);
    }
    
    void method3710(Class534_Sub40 class534_sub40,
		    Class534_Sub40 class534_sub40_10_,
		    Class534_Sub40 class534_sub40_11_) {
	short i = 0;
	short i_12_ = 0;
	short i_13_ = 0;
	int i_14_ = 0;
	for (int i_15_ = 0; i_15_ < anInt2092; i_15_++) {
	    int i_16_ = class534_sub40_10_.method16527(-406607317);
	    int i_17_ = i_16_ & 0x7;
	    if (i_17_ == 1) {
		aShortArray2093[i_15_] = i
		    = (short) (class534_sub40.method16545((byte) -57) + i_14_);
		i_14_ = i;
		aShortArray2077[i_15_] = i_12_
		    = (short) (class534_sub40.method16545((byte) -25) + i_14_);
		i_14_ = i_12_;
		aShortArray2095[i_15_] = i_13_
		    = (short) (class534_sub40.method16545((byte) -54) + i_14_);
		i_14_ = i_13_;
		if (i > anInt2106)
		    anInt2106 = i;
		if (i_12_ > anInt2106)
		    anInt2106 = i_12_;
		if (i_13_ > anInt2106)
		    anInt2106 = i_13_;
	    }
	    if (i_17_ == 2) {
		i_12_ = i_13_;
		i_13_
		    = (short) (class534_sub40.method16545((byte) -60) + i_14_);
		i_14_ = i_13_;
		aShortArray2093[i_15_] = i;
		aShortArray2077[i_15_] = i_12_;
		aShortArray2095[i_15_] = i_13_;
		if (i_13_ > anInt2106)
		    anInt2106 = i_13_;
	    }
	    if (i_17_ == 3) {
		i = i_13_;
		i_13_ = (short) (class534_sub40.method16545((byte) -127)
				 + i_14_);
		i_14_ = i_13_;
		aShortArray2093[i_15_] = i;
		aShortArray2077[i_15_] = i_12_;
		aShortArray2095[i_15_] = i_13_;
		if (i_13_ > anInt2106)
		    anInt2106 = i_13_;
	    }
	    if (i_17_ == 4) {
		short i_18_ = i;
		i = i_12_;
		i_12_ = i_18_;
		i_13_
		    = (short) (class534_sub40.method16545((byte) -64) + i_14_);
		i_14_ = i_13_;
		aShortArray2093[i_15_] = i;
		aShortArray2077[i_15_] = i_12_;
		aShortArray2095[i_15_] = i_13_;
		if (i_13_ > anInt2106)
		    anInt2106 = i_13_;
	    }
	    if (anInt2089 > 0 && (i_16_ & 0x8) != 0) {
		aByteArray2111[i_15_]
		    = (byte) class534_sub40_11_.method16527(-1160173119);
		aByteArray2097[i_15_]
		    = (byte) class534_sub40_11_.method16527(-2034309819);
		aByteArray2098[i_15_]
		    = (byte) class534_sub40_11_.method16527(164296326);
	    }
	}
	anInt2106++;
    }
    
    void method3711
	(Class534_Sub40 class534_sub40, Class534_Sub40 class534_sub40_19_,
	 Class534_Sub40 class534_sub40_20_, Class534_Sub40 class534_sub40_21_,
	 Class534_Sub40 class534_sub40_22_,
	 Class534_Sub40 class534_sub40_23_) {
	for (int i = 0; i < anInt2110; i++) {
	    int i_24_ = aByteArray2086[i] & 0xff;
	    if (i_24_ == 0) {
		aShortArray2108[i]
		    = (short) class534_sub40.method16529((byte) 1);
		aShortArray2085[i]
		    = (short) class534_sub40.method16529((byte) 1);
		aShortArray2114[i]
		    = (short) class534_sub40.method16529((byte) 1);
	    }
	    if (i_24_ == 1) {
		aShortArray2108[i]
		    = (short) class534_sub40_19_.method16529((byte) 1);
		aShortArray2085[i]
		    = (short) class534_sub40_19_.method16529((byte) 1);
		aShortArray2114[i]
		    = (short) class534_sub40_19_.method16529((byte) 1);
		if (anInt2082 < 15) {
		    anIntArray2115[i]
			= class534_sub40_20_.method16529((byte) 1);
		    if (anInt2082 < 14)
			anIntArray2116[i]
			    = class534_sub40_20_.method16529((byte) 1);
		    else
			anIntArray2116[i]
			    = class534_sub40_20_.method16531(1761080696);
		    anIntArray2117[i]
			= class534_sub40_20_.method16529((byte) 1);
		} else {
		    anIntArray2115[i]
			= class534_sub40_20_.method16531(2024814829);
		    anIntArray2116[i]
			= class534_sub40_20_.method16531(97736481);
		    anIntArray2117[i]
			= class534_sub40_20_.method16531(1161773050);
		}
		aByteArray2121[i] = class534_sub40_21_.method16586((byte) 1);
		aByteArray2122[i] = class534_sub40_22_.method16586((byte) 1);
		anIntArray2118[i] = class534_sub40_23_.method16586((byte) 1);
	    }
	    if (i_24_ == 2) {
		aShortArray2108[i]
		    = (short) class534_sub40_19_.method16529((byte) 1);
		aShortArray2085[i]
		    = (short) class534_sub40_19_.method16529((byte) 1);
		aShortArray2114[i]
		    = (short) class534_sub40_19_.method16529((byte) 1);
		if (anInt2082 < 15) {
		    anIntArray2115[i]
			= class534_sub40_20_.method16529((byte) 1);
		    if (anInt2082 < 14)
			anIntArray2116[i]
			    = class534_sub40_20_.method16529((byte) 1);
		    else
			anIntArray2116[i]
			    = class534_sub40_20_.method16531(1721048814);
		    anIntArray2117[i]
			= class534_sub40_20_.method16529((byte) 1);
		} else {
		    anIntArray2115[i]
			= class534_sub40_20_.method16531(159198498);
		    anIntArray2116[i]
			= class534_sub40_20_.method16531(950824964);
		    anIntArray2117[i]
			= class534_sub40_20_.method16531(2083634252);
		}
		aByteArray2121[i] = class534_sub40_21_.method16586((byte) 1);
		aByteArray2122[i] = class534_sub40_22_.method16586((byte) 1);
		anIntArray2118[i] = class534_sub40_23_.method16586((byte) 1);
		anIntArray2119[i] = class534_sub40_23_.method16586((byte) 1);
		anIntArray2120[i] = class534_sub40_23_.method16586((byte) 1);
	    }
	    if (i_24_ == 3) {
		aShortArray2108[i]
		    = (short) class534_sub40_19_.method16529((byte) 1);
		aShortArray2085[i]
		    = (short) class534_sub40_19_.method16529((byte) 1);
		aShortArray2114[i]
		    = (short) class534_sub40_19_.method16529((byte) 1);
		if (anInt2082 < 15) {
		    anIntArray2115[i]
			= class534_sub40_20_.method16529((byte) 1);
		    if (anInt2082 < 14)
			anIntArray2116[i]
			    = class534_sub40_20_.method16529((byte) 1);
		    else
			anIntArray2116[i]
			    = class534_sub40_20_.method16531(418511546);
		    anIntArray2117[i]
			= class534_sub40_20_.method16529((byte) 1);
		} else {
		    anIntArray2115[i]
			= class534_sub40_20_.method16531(19664081);
		    anIntArray2116[i]
			= class534_sub40_20_.method16531(1351707009);
		    anIntArray2117[i]
			= class534_sub40_20_.method16531(1457484714);
		}
		aByteArray2121[i] = class534_sub40_21_.method16586((byte) 1);
		aByteArray2122[i] = class534_sub40_22_.method16586((byte) 1);
		anIntArray2118[i] = class534_sub40_23_.method16586((byte) 1);
	    }
	}
    }
    
    public int method3712(int i, int i_25_, int i_26_) {
	for (int i_27_ = 0; i_27_ < anInt2081; i_27_++) {
	    if (anIntArray2083[i_27_] == i && anIntArray2080[i_27_] == i_25_
		&& anIntArray2113[i_27_] == i_26_)
		return i_27_;
	}
	anIntArray2083[anInt2081] = i;
	anIntArray2080[anInt2081] = i_25_;
	anIntArray2113[anInt2081] = i_26_;
	anInt2106 = anInt2081 + 1;
	return anInt2081++;
    }
    
    public int method3713(int i, int i_28_, int i_29_, byte i_30_, byte i_31_,
			  short i_32_, byte i_33_, short i_34_) {
	aShortArray2093[anInt2092] = (short) i;
	aShortArray2077[anInt2092] = (short) i_28_;
	aShortArray2095[anInt2092] = (short) i_29_;
	aByteArray2099[anInt2092] = i_30_;
	aShortArray2102[anInt2092] = (short) i_31_;
	aShortArray2096[anInt2092] = i_32_;
	aByteArray2101[anInt2092] = i_33_;
	aShortArray2104[anInt2092] = i_34_;
	return anInt2092++;
    }
    
    public static Class187 method3714(Class472 class472, int i, int i_35_) {
	byte[] is = class472.method7743(i, i_35_, -1038159713);
	if (is == null)
	    return null;
	return new Class187(is);
    }
    
    void method3715
	(Class534_Sub40 class534_sub40, Class534_Sub40 class534_sub40_36_,
	 Class534_Sub40 class534_sub40_37_, Class534_Sub40 class534_sub40_38_,
	 Class534_Sub40 class534_sub40_39_,
	 Class534_Sub40 class534_sub40_40_) {
	for (int i = 0; i < anInt2110; i++) {
	    int i_41_ = aByteArray2086[i] & 0xff;
	    if (i_41_ == 0) {
		aShortArray2108[i]
		    = (short) class534_sub40.method16529((byte) 1);
		aShortArray2085[i]
		    = (short) class534_sub40.method16529((byte) 1);
		aShortArray2114[i]
		    = (short) class534_sub40.method16529((byte) 1);
	    }
	    if (i_41_ == 1) {
		aShortArray2108[i]
		    = (short) class534_sub40_36_.method16529((byte) 1);
		aShortArray2085[i]
		    = (short) class534_sub40_36_.method16529((byte) 1);
		aShortArray2114[i]
		    = (short) class534_sub40_36_.method16529((byte) 1);
		if (anInt2082 < 15) {
		    anIntArray2115[i]
			= class534_sub40_37_.method16529((byte) 1);
		    if (anInt2082 < 14)
			anIntArray2116[i]
			    = class534_sub40_37_.method16529((byte) 1);
		    else
			anIntArray2116[i]
			    = class534_sub40_37_.method16531(25832431);
		    anIntArray2117[i]
			= class534_sub40_37_.method16529((byte) 1);
		} else {
		    anIntArray2115[i]
			= class534_sub40_37_.method16531(2092838290);
		    anIntArray2116[i]
			= class534_sub40_37_.method16531(1519722993);
		    anIntArray2117[i]
			= class534_sub40_37_.method16531(310801544);
		}
		aByteArray2121[i] = class534_sub40_38_.method16586((byte) 1);
		aByteArray2122[i] = class534_sub40_39_.method16586((byte) 1);
		anIntArray2118[i] = class534_sub40_40_.method16586((byte) 1);
	    }
	    if (i_41_ == 2) {
		aShortArray2108[i]
		    = (short) class534_sub40_36_.method16529((byte) 1);
		aShortArray2085[i]
		    = (short) class534_sub40_36_.method16529((byte) 1);
		aShortArray2114[i]
		    = (short) class534_sub40_36_.method16529((byte) 1);
		if (anInt2082 < 15) {
		    anIntArray2115[i]
			= class534_sub40_37_.method16529((byte) 1);
		    if (anInt2082 < 14)
			anIntArray2116[i]
			    = class534_sub40_37_.method16529((byte) 1);
		    else
			anIntArray2116[i]
			    = class534_sub40_37_.method16531(798113628);
		    anIntArray2117[i]
			= class534_sub40_37_.method16529((byte) 1);
		} else {
		    anIntArray2115[i]
			= class534_sub40_37_.method16531(279402546);
		    anIntArray2116[i]
			= class534_sub40_37_.method16531(521455849);
		    anIntArray2117[i]
			= class534_sub40_37_.method16531(1916496933);
		}
		aByteArray2121[i] = class534_sub40_38_.method16586((byte) 1);
		aByteArray2122[i] = class534_sub40_39_.method16586((byte) 1);
		anIntArray2118[i] = class534_sub40_40_.method16586((byte) 1);
		anIntArray2119[i] = class534_sub40_40_.method16586((byte) 1);
		anIntArray2120[i] = class534_sub40_40_.method16586((byte) 1);
	    }
	    if (i_41_ == 3) {
		aShortArray2108[i]
		    = (short) class534_sub40_36_.method16529((byte) 1);
		aShortArray2085[i]
		    = (short) class534_sub40_36_.method16529((byte) 1);
		aShortArray2114[i]
		    = (short) class534_sub40_36_.method16529((byte) 1);
		if (anInt2082 < 15) {
		    anIntArray2115[i]
			= class534_sub40_37_.method16529((byte) 1);
		    if (anInt2082 < 14)
			anIntArray2116[i]
			    = class534_sub40_37_.method16529((byte) 1);
		    else
			anIntArray2116[i]
			    = class534_sub40_37_.method16531(1965021722);
		    anIntArray2117[i]
			= class534_sub40_37_.method16529((byte) 1);
		} else {
		    anIntArray2115[i]
			= class534_sub40_37_.method16531(1146995902);
		    anIntArray2116[i]
			= class534_sub40_37_.method16531(619165211);
		    anIntArray2117[i]
			= class534_sub40_37_.method16531(419219808);
		}
		aByteArray2121[i] = class534_sub40_38_.method16586((byte) 1);
		aByteArray2122[i] = class534_sub40_39_.method16586((byte) 1);
		anIntArray2118[i] = class534_sub40_40_.method16586((byte) 1);
	    }
	}
    }
    
    public int[][] method3716(boolean bool) {
	int[] is = new int[400];
	int i = 0;
	int i_42_ = bool ? anInt2081 : anInt2106;
	for (int i_43_ = 0; i_43_ < i_42_; i_43_++) {
	    int i_44_ = anIntArray2087[i_43_];
	    if (i_44_ >= 0) {
		is[i_44_]++;
		if (i_44_ > i)
		    i = i_44_;
	    }
	}
	int[][] is_45_ = new int[i + 1][];
	for (int i_46_ = 0; i_46_ <= i; i_46_++) {
	    is_45_[i_46_] = new int[is[i_46_]];
	    is[i_46_] = 0;
	}
	for (int i_47_ = 0; i_47_ < i_42_; i_47_++) {
	    int i_48_ = anIntArray2087[i_47_];
	    if (i_48_ >= 0)
		is_45_[i_48_][is[i_48_]++] = i_47_;
	}
	return is_45_;
    }
    
    public int[][] method3717() {
	int[] is = new int[256];
	int i = 0;
	for (int i_49_ = 0; i_49_ < anInt2092; i_49_++) {
	    int i_50_ = anIntArray2090[i_49_];
	    if (i_50_ >= 0) {
		is[i_50_]++;
		if (i_50_ > i)
		    i = i_50_;
	    }
	}
	int[][] is_51_ = new int[i + 1][];
	for (int i_52_ = 0; i_52_ <= i; i_52_++) {
	    is_51_[i_52_] = new int[is[i_52_]];
	    is[i_52_] = 0;
	}
	for (int i_53_ = 0; i_53_ < anInt2092; i_53_++) {
	    int i_54_ = anIntArray2090[i_53_];
	    if (i_54_ >= 0)
		is_51_[i_54_][is[i_54_]++] = i_53_;
	}
	return is_51_;
    }
    
    public int[][] method3718() {
	int[] is = new int[256];
	int i = 0;
	for (int i_55_ = 0; i_55_ < aClass168Array2125.length; i_55_++) {
	    int i_56_ = aClass168Array2125[i_55_].anInt1790 * -1478655655;
	    if (i_56_ >= 0) {
		is[i_56_]++;
		if (i_56_ > i)
		    i = i_56_;
	    }
	}
	int[][] is_57_ = new int[i + 1][];
	for (int i_58_ = 0; i_58_ <= i; i_58_++) {
	    is_57_[i_58_] = new int[is[i_58_]];
	    is[i_58_] = 0;
	}
	for (int i_59_ = 0; i_59_ < aClass168Array2125.length; i_59_++) {
	    int i_60_ = aClass168Array2125[i_59_].anInt1790 * -1478655655;
	    if (i_60_ >= 0)
		is_57_[i_60_][is[i_60_]++] = i_59_;
	}
	return is_57_;
    }
    
    public void method3719(short i, short i_61_) {
	for (int i_62_ = 0; i_62_ < anInt2092; i_62_++) {
	    if (aShortArray2096[i_62_] == i)
		aShortArray2096[i_62_] = i_61_;
	}
    }
    
    public void method3720(int i) {
	for (int i_63_ = 0; i_63_ < anInt2081; i_63_++) {
	    anIntArray2083[i_63_] <<= i;
	    anIntArray2080[i_63_] <<= i;
	    anIntArray2113[i_63_] <<= i;
	}
	if (anInt2110 > 0 && anIntArray2115 != null) {
	    for (int i_64_ = 0; i_64_ < anIntArray2115.length; i_64_++) {
		anIntArray2115[i_64_] <<= i;
		anIntArray2116[i_64_] <<= i;
		if (aByteArray2086[i_64_] != 1)
		    anIntArray2117[i_64_] <<= i;
	    }
	}
    }
    
    public void method3721(int i, int i_65_, int i_66_) {
	for (int i_67_ = 0; i_67_ < anInt2081; i_67_++) {
	    anIntArray2083[i_67_] += i;
	    anIntArray2080[i_67_] += i_65_;
	    anIntArray2113[i_67_] += i_66_;
	}
    }
    
    public byte method3722(short i, short i_68_, short i_69_) {
	if (anInt2110 >= 255)
	    throw new IllegalStateException();
	aByteArray2086[anInt2110] = (byte) 0;
	aShortArray2108[anInt2110] = i;
	aShortArray2085[anInt2110] = i_68_;
	aShortArray2114[anInt2110] = i_69_;
	return (byte) anInt2110++;
    }
    
    public void method3723(int i) {
	for (int i_70_ = 0; i_70_ < anInt2081; i_70_++) {
	    anIntArray2083[i_70_] <<= i;
	    anIntArray2080[i_70_] <<= i;
	    anIntArray2113[i_70_] <<= i;
	}
	if (anInt2110 > 0 && anIntArray2115 != null) {
	    for (int i_71_ = 0; i_71_ < anIntArray2115.length; i_71_++) {
		anIntArray2115[i_71_] <<= i;
		anIntArray2116[i_71_] <<= i;
		if (aByteArray2086[i_71_] != 1)
		    anIntArray2117[i_71_] <<= i;
	    }
	}
    }
    
    public void method3724(int i, int i_72_, int i_73_) {
	if (i_73_ != 0) {
	    int i_74_ = Class427.anIntArray4806[i_73_];
	    int i_75_ = Class427.anIntArray4805[i_73_];
	    for (int i_76_ = 0; i_76_ < anInt2081; i_76_++) {
		int i_77_ = ((anIntArray2080[i_76_] * i_74_
			      + anIntArray2083[i_76_] * i_75_)
			     >> 14);
		anIntArray2080[i_76_]
		    = (anIntArray2080[i_76_] * i_75_
		       - anIntArray2083[i_76_] * i_74_) >> 14;
		anIntArray2083[i_76_] = i_77_;
	    }
	}
	if (i != 0) {
	    int i_78_ = Class427.anIntArray4806[i];
	    int i_79_ = Class427.anIntArray4805[i];
	    for (int i_80_ = 0; i_80_ < anInt2081; i_80_++) {
		int i_81_ = ((anIntArray2080[i_80_] * i_79_
			      - anIntArray2113[i_80_] * i_78_)
			     >> 14);
		anIntArray2113[i_80_]
		    = (anIntArray2080[i_80_] * i_78_
		       + anIntArray2113[i_80_] * i_79_) >> 14;
		anIntArray2080[i_80_] = i_81_;
	    }
	}
	if (i_72_ != 0) {
	    int i_82_ = Class427.anIntArray4806[i_72_];
	    int i_83_ = Class427.anIntArray4805[i_72_];
	    for (int i_84_ = 0; i_84_ < anInt2081; i_84_++) {
		int i_85_ = ((anIntArray2113[i_84_] * i_82_
			      + anIntArray2083[i_84_] * i_83_)
			     >> 14);
		anIntArray2113[i_84_]
		    = (anIntArray2113[i_84_] * i_83_
		       - anIntArray2083[i_84_] * i_82_) >> 14;
		anIntArray2083[i_84_] = i_85_;
	    }
	}
    }
    
    public byte method3725(short i, short i_86_, short i_87_, short i_88_,
			   short i_89_, short i_90_, byte i_91_, byte i_92_,
			   byte i_93_) {
	if (anInt2110 >= 255)
	    throw new IllegalStateException();
	aByteArray2086[anInt2110] = (byte) 3;
	aShortArray2108[anInt2110] = i;
	aShortArray2085[anInt2110] = i_86_;
	aShortArray2114[anInt2110] = i_87_;
	anIntArray2115[anInt2110] = i_88_;
	anIntArray2116[anInt2110] = i_89_;
	anIntArray2117[anInt2110] = i_90_;
	aByteArray2121[anInt2110] = i_91_;
	aByteArray2122[anInt2110] = i_92_;
	anIntArray2118[anInt2110] = i_93_;
	return (byte) anInt2110++;
    }
    
    public void method3726(float f) {
	for (int i = 0; i < anInt2081; i++) {
	    anIntArray2083[i] *= f;
	    anIntArray2080[i] *= f;
	    anIntArray2113[i] *= f;
	}
	if (anInt2110 > 0 && anIntArray2115 != null) {
	    for (int i = 0; i < anIntArray2115.length; i++) {
		anIntArray2115[i] *= f;
		anIntArray2116[i] *= f;
		if (aByteArray2086[i] != 1)
		    anIntArray2117[i] *= f;
	    }
	}
    }
    
    public static Class187 method3727(Class472 class472, int i, int i_94_) {
	byte[] is = class472.method7743(i, i_94_, -1047433886);
	if (is == null)
	    return null;
	return new Class187(is);
    }
    
    final int method3728(Class187 class187_95_, int i, short i_96_) {
	int i_97_ = class187_95_.anIntArray2083[i];
	int i_98_ = class187_95_.anIntArray2080[i];
	int i_99_ = class187_95_.anIntArray2113[i];
	for (int i_100_ = 0; i_100_ < anInt2081; i_100_++) {
	    if (i_97_ == anIntArray2083[i_100_]
		&& i_98_ == anIntArray2080[i_100_]
		&& i_99_ == anIntArray2113[i_100_]) {
		aShortArray2088[i_100_] |= i_96_;
		return i_100_;
	    }
	}
	anIntArray2083[anInt2081] = i_97_;
	anIntArray2080[anInt2081] = i_98_;
	anIntArray2113[anInt2081] = i_99_;
	aShortArray2088[anInt2081] = i_96_;
	anIntArray2087[anInt2081] = (class187_95_.anIntArray2087 != null
				     ? class187_95_.anIntArray2087[i] : -1);
	return anInt2081++;
    }
    
    public void method3729(short i, short i_101_) {
	if (aShortArray2104 != null) {
	    for (int i_102_ = 0; i_102_ < anInt2092; i_102_++) {
		if (aShortArray2104[i_102_] == i)
		    aShortArray2104[i_102_] = i_101_;
	    }
	}
    }
    
    void method3730(Class534_Sub40 class534_sub40,
		    Class534_Sub40 class534_sub40_103_,
		    Class534_Sub40 class534_sub40_104_) {
	short i = 0;
	short i_105_ = 0;
	short i_106_ = 0;
	int i_107_ = 0;
	for (int i_108_ = 0; i_108_ < anInt2092; i_108_++) {
	    int i_109_ = class534_sub40_103_.method16527(-1264529073);
	    int i_110_ = i_109_ & 0x7;
	    if (i_110_ == 1) {
		aShortArray2093[i_108_] = i
		    = (short) (class534_sub40.method16545((byte) -83)
			       + i_107_);
		i_107_ = i;
		aShortArray2077[i_108_] = i_105_
		    = (short) (class534_sub40.method16545((byte) -27)
			       + i_107_);
		i_107_ = i_105_;
		aShortArray2095[i_108_] = i_106_
		    = (short) (class534_sub40.method16545((byte) -28)
			       + i_107_);
		i_107_ = i_106_;
		if (i > anInt2106)
		    anInt2106 = i;
		if (i_105_ > anInt2106)
		    anInt2106 = i_105_;
		if (i_106_ > anInt2106)
		    anInt2106 = i_106_;
	    }
	    if (i_110_ == 2) {
		i_105_ = i_106_;
		i_106_ = (short) (class534_sub40.method16545((byte) -84)
				  + i_107_);
		i_107_ = i_106_;
		aShortArray2093[i_108_] = i;
		aShortArray2077[i_108_] = i_105_;
		aShortArray2095[i_108_] = i_106_;
		if (i_106_ > anInt2106)
		    anInt2106 = i_106_;
	    }
	    if (i_110_ == 3) {
		i = i_106_;
		i_106_ = (short) (class534_sub40.method16545((byte) -79)
				  + i_107_);
		i_107_ = i_106_;
		aShortArray2093[i_108_] = i;
		aShortArray2077[i_108_] = i_105_;
		aShortArray2095[i_108_] = i_106_;
		if (i_106_ > anInt2106)
		    anInt2106 = i_106_;
	    }
	    if (i_110_ == 4) {
		short i_111_ = i;
		i = i_105_;
		i_105_ = i_111_;
		i_106_ = (short) (class534_sub40.method16545((byte) -22)
				  + i_107_);
		i_107_ = i_106_;
		aShortArray2093[i_108_] = i;
		aShortArray2077[i_108_] = i_105_;
		aShortArray2095[i_108_] = i_106_;
		if (i_106_ > anInt2106)
		    anInt2106 = i_106_;
	    }
	    if (anInt2089 > 0 && (i_109_ & 0x8) != 0) {
		aByteArray2111[i_108_]
		    = (byte) class534_sub40_104_.method16527(930061674);
		aByteArray2097[i_108_]
		    = (byte) class534_sub40_104_.method16527(-877047943);
		aByteArray2098[i_108_]
		    = (byte) class534_sub40_104_.method16527(-920367423);
	    }
	}
	anInt2106++;
    }
    
    public int[][] method3731() {
	int[] is = new int[256];
	int i = 0;
	for (int i_112_ = 0; i_112_ < aClass168Array2125.length; i_112_++) {
	    int i_113_ = aClass168Array2125[i_112_].anInt1790 * -1478655655;
	    if (i_113_ >= 0) {
		is[i_113_]++;
		if (i_113_ > i)
		    i = i_113_;
	    }
	}
	int[][] is_114_ = new int[i + 1][];
	for (int i_115_ = 0; i_115_ <= i; i_115_++) {
	    is_114_[i_115_] = new int[is[i_115_]];
	    is[i_115_] = 0;
	}
	for (int i_116_ = 0; i_116_ < aClass168Array2125.length; i_116_++) {
	    int i_117_ = aClass168Array2125[i_116_].anInt1790 * -1478655655;
	    if (i_117_ >= 0)
		is_114_[i_117_][is[i_117_]++] = i_116_;
	}
	return is_114_;
    }
    
    public int method3732(int i, int i_118_, int i_119_) {
	for (int i_120_ = 0; i_120_ < anInt2081; i_120_++) {
	    if (anIntArray2083[i_120_] == i && anIntArray2080[i_120_] == i_118_
		&& anIntArray2113[i_120_] == i_119_)
		return i_120_;
	}
	anIntArray2083[anInt2081] = i;
	anIntArray2080[anInt2081] = i_118_;
	anIntArray2113[anInt2081] = i_119_;
	anInt2106 = anInt2081 + 1;
	return anInt2081++;
    }
    
    public int method3733(int i, int i_121_, int i_122_, byte i_123_,
			  byte i_124_, short i_125_, byte i_126_,
			  short i_127_) {
	aShortArray2093[anInt2092] = (short) i;
	aShortArray2077[anInt2092] = (short) i_121_;
	aShortArray2095[anInt2092] = (short) i_122_;
	aByteArray2099[anInt2092] = i_123_;
	aShortArray2102[anInt2092] = (short) i_124_;
	aShortArray2096[anInt2092] = i_125_;
	aByteArray2101[anInt2092] = i_126_;
	aShortArray2104[anInt2092] = i_127_;
	return anInt2092++;
    }
    
    public int method3734(int i, int i_128_, int i_129_, byte i_130_,
			  byte i_131_, short i_132_, byte i_133_,
			  short i_134_) {
	aShortArray2093[anInt2092] = (short) i;
	aShortArray2077[anInt2092] = (short) i_128_;
	aShortArray2095[anInt2092] = (short) i_129_;
	aByteArray2099[anInt2092] = i_130_;
	aShortArray2102[anInt2092] = (short) i_131_;
	aShortArray2096[anInt2092] = i_132_;
	aByteArray2101[anInt2092] = i_133_;
	aShortArray2104[anInt2092] = i_134_;
	return anInt2092++;
    }
    
    public int method3735(int i, int i_135_, int i_136_, byte i_137_,
			  byte i_138_, short i_139_, byte i_140_,
			  short i_141_) {
	aShortArray2093[anInt2092] = (short) i;
	aShortArray2077[anInt2092] = (short) i_135_;
	aShortArray2095[anInt2092] = (short) i_136_;
	aByteArray2099[anInt2092] = i_137_;
	aShortArray2102[anInt2092] = (short) i_138_;
	aShortArray2096[anInt2092] = i_139_;
	aByteArray2101[anInt2092] = i_140_;
	aShortArray2104[anInt2092] = i_141_;
	return anInt2092++;
    }
    
    public byte method3736(short i, short i_142_, short i_143_) {
	if (anInt2110 >= 255)
	    throw new IllegalStateException();
	aByteArray2086[anInt2110] = (byte) 0;
	aShortArray2108[anInt2110] = i;
	aShortArray2085[anInt2110] = i_142_;
	aShortArray2114[anInt2110] = i_143_;
	return (byte) anInt2110++;
    }
    
    public byte method3737(short i, short i_144_, short i_145_, short i_146_,
			   short i_147_, short i_148_, byte i_149_,
			   byte i_150_, byte i_151_) {
	if (anInt2110 >= 255)
	    throw new IllegalStateException();
	aByteArray2086[anInt2110] = (byte) 3;
	aShortArray2108[anInt2110] = i;
	aShortArray2085[anInt2110] = i_144_;
	aShortArray2114[anInt2110] = i_145_;
	anIntArray2115[anInt2110] = i_146_;
	anIntArray2116[anInt2110] = i_147_;
	anIntArray2117[anInt2110] = i_148_;
	aByteArray2121[anInt2110] = i_149_;
	aByteArray2122[anInt2110] = i_150_;
	anIntArray2118[anInt2110] = i_151_;
	return (byte) anInt2110++;
    }
    
    public int[][] method3738(boolean bool) {
	int[] is = new int[400];
	int i = 0;
	int i_152_ = bool ? anInt2081 : anInt2106;
	for (int i_153_ = 0; i_153_ < i_152_; i_153_++) {
	    int i_154_ = anIntArray2087[i_153_];
	    if (i_154_ >= 0) {
		is[i_154_]++;
		if (i_154_ > i)
		    i = i_154_;
	    }
	}
	int[][] is_155_ = new int[i + 1][];
	for (int i_156_ = 0; i_156_ <= i; i_156_++) {
	    is_155_[i_156_] = new int[is[i_156_]];
	    is[i_156_] = 0;
	}
	for (int i_157_ = 0; i_157_ < i_152_; i_157_++) {
	    int i_158_ = anIntArray2087[i_157_];
	    if (i_158_ >= 0)
		is_155_[i_158_][is[i_158_]++] = i_157_;
	}
	return is_155_;
    }
    
    public int[][] method3739() {
	int[] is = new int[256];
	int i = 0;
	for (int i_159_ = 0; i_159_ < anInt2092; i_159_++) {
	    int i_160_ = anIntArray2090[i_159_];
	    if (i_160_ >= 0) {
		is[i_160_]++;
		if (i_160_ > i)
		    i = i_160_;
	    }
	}
	int[][] is_161_ = new int[i + 1][];
	for (int i_162_ = 0; i_162_ <= i; i_162_++) {
	    is_161_[i_162_] = new int[is[i_162_]];
	    is[i_162_] = 0;
	}
	for (int i_163_ = 0; i_163_ < anInt2092; i_163_++) {
	    int i_164_ = anIntArray2090[i_163_];
	    if (i_164_ >= 0)
		is_161_[i_164_][is[i_164_]++] = i_163_;
	}
	return is_161_;
    }
    
    final int method3740(Class187 class187_165_, int i, short i_166_) {
	int i_167_ = class187_165_.anIntArray2083[i];
	int i_168_ = class187_165_.anIntArray2080[i];
	int i_169_ = class187_165_.anIntArray2113[i];
	for (int i_170_ = 0; i_170_ < anInt2081; i_170_++) {
	    if (i_167_ == anIntArray2083[i_170_]
		&& i_168_ == anIntArray2080[i_170_]
		&& i_169_ == anIntArray2113[i_170_]) {
		aShortArray2088[i_170_] |= i_166_;
		return i_170_;
	    }
	}
	anIntArray2083[anInt2081] = i_167_;
	anIntArray2080[anInt2081] = i_168_;
	anIntArray2113[anInt2081] = i_169_;
	aShortArray2088[anInt2081] = i_166_;
	anIntArray2087[anInt2081] = (class187_165_.anIntArray2087 != null
				     ? class187_165_.anIntArray2087[i] : -1);
	return anInt2081++;
    }
    
    public Class187(byte[] is) {
	anInt2081 = 0;
	anInt2106 = 0;
	anInt2092 = 0;
	aByte2078 = (byte) 0;
	anInt2110 = 0;
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	Class534_Sub40 class534_sub40_171_ = new Class534_Sub40(is);
	Class534_Sub40 class534_sub40_172_ = new Class534_Sub40(is);
	Class534_Sub40 class534_sub40_173_ = new Class534_Sub40(is);
	Class534_Sub40 class534_sub40_174_ = new Class534_Sub40(is);
	Class534_Sub40 class534_sub40_175_ = new Class534_Sub40(is);
	Class534_Sub40 class534_sub40_176_ = new Class534_Sub40(is);
	int i = class534_sub40.method16527(1023541451);
	if (i != 1)
	    System.out
		.println(new StringBuilder().append("").append(i).toString());
	else {
	    class534_sub40.method16527(1516001863);
	    anInt2082 = class534_sub40.method16527(152452904);
	    class534_sub40.anInt10811 = (is.length - 26) * -1387468933;
	    anInt2081 = class534_sub40.method16529((byte) 1);
	    anInt2092 = class534_sub40.method16529((byte) 1);
	    anInt2110 = class534_sub40.method16529((byte) 1);
	    int i_177_ = class534_sub40.method16527(-922404180);
	    boolean bool = (i_177_ & 0x1) == 1;
	    boolean bool_178_ = (i_177_ & 0x2) == 2;
	    boolean bool_179_ = (i_177_ & 0x4) == 4;
	    boolean bool_180_ = (i_177_ & 0x10) == 16;
	    boolean bool_181_ = (i_177_ & 0x20) == 32;
	    boolean bool_182_ = (i_177_ & 0x40) == 64;
	    boolean bool_183_ = (i_177_ & 0x80) == 128;
	    int i_184_ = class534_sub40.method16527(-510354471);
	    int i_185_ = class534_sub40.method16527(-793724940);
	    int i_186_ = class534_sub40.method16527(1921911961);
	    int i_187_ = class534_sub40.method16527(2044386678);
	    int i_188_ = class534_sub40.method16527(-878867);
	    int i_189_ = class534_sub40.method16529((byte) 1);
	    int i_190_ = class534_sub40.method16529((byte) 1);
	    int i_191_ = class534_sub40.method16529((byte) 1);
	    int i_192_ = class534_sub40.method16529((byte) 1);
	    int i_193_ = class534_sub40.method16529((byte) 1);
	    int i_194_ = class534_sub40.method16529((byte) 1);
	    int i_195_ = class534_sub40.method16529((byte) 1);
	    if (!bool_180_) {
		if (i_188_ == 1)
		    i_194_ = anInt2081;
		else
		    i_194_ = 0;
	    }
	    if (!bool_181_) {
		if (i_186_ == 1)
		    i_195_ = anInt2092;
		else
		    i_195_ = 0;
	    }
	    int i_196_ = 0;
	    int i_197_ = 0;
	    int i_198_ = 0;
	    if (anInt2110 > 0) {
		aByteArray2086 = new byte[anInt2110];
		class534_sub40.anInt10811 = 132560497;
		for (int i_199_ = 0; i_199_ < anInt2110; i_199_++) {
		    byte i_200_ = (aByteArray2086[i_199_]
				   = class534_sub40.method16586((byte) 1));
		    if (i_200_ == 0)
			i_196_++;
		    if (i_200_ >= 1 && i_200_ <= 3)
			i_197_++;
		    if (i_200_ == 2)
			i_198_++;
		}
	    }
	    int i_201_ = 3 + anInt2110;
	    int i_202_ = i_201_;
	    i_201_ += anInt2081;
	    int i_203_ = i_201_;
	    if (bool)
		i_201_ += anInt2092;
	    int i_204_ = i_201_;
	    i_201_ += anInt2092;
	    int i_205_ = i_201_;
	    if (i_184_ == 255)
		i_201_ += anInt2092;
	    int i_206_ = i_201_;
	    i_201_ += i_195_;
	    int i_207_ = i_201_;
	    i_201_ += i_194_;
	    int i_208_ = i_201_;
	    if (i_185_ == 1)
		i_201_ += anInt2092;
	    int i_209_ = i_201_;
	    i_201_ += i_192_;
	    int i_210_ = i_201_;
	    if (i_187_ == 1)
		i_201_ += anInt2092 * 2;
	    int i_211_ = i_201_;
	    i_201_ += i_193_;
	    int i_212_ = i_201_;
	    i_201_ += anInt2092 * 2;
	    int i_213_ = i_201_;
	    i_201_ += i_189_;
	    int i_214_ = i_201_;
	    i_201_ += i_190_;
	    int i_215_ = i_201_;
	    i_201_ += i_191_;
	    int i_216_ = i_201_;
	    i_201_ += i_196_ * 6;
	    int i_217_ = i_201_;
	    i_201_ += i_197_ * 6;
	    int i_218_ = 6;
	    if (anInt2082 == 14)
		i_218_ = 7;
	    else if (anInt2082 >= 15)
		i_218_ = 9;
	    int i_219_ = i_201_;
	    i_201_ += i_197_ * i_218_;
	    int i_220_ = i_201_;
	    i_201_ += i_197_;
	    int i_221_ = i_201_;
	    i_201_ += i_197_;
	    int i_222_ = i_201_;
	    i_201_ += i_197_ + i_198_ * 2;
	    int i_223_ = i_201_;
	    int i_224_ = is.length;
	    int i_225_ = is.length;
	    int i_226_ = is.length;
	    int i_227_ = is.length;
	    if (bool_183_) {
		Class534_Sub40 class534_sub40_228_ = new Class534_Sub40(is);
		class534_sub40_228_.anInt10811
		    = (is.length - 26) * -1387468933;
		class534_sub40_228_.anInt10811
		    -= (is[class534_sub40_228_.anInt10811 * 31645619 - 1]
			* -1387468933);
		anInt2089 = class534_sub40_228_.method16529((byte) 1);
		int i_229_ = class534_sub40_228_.method16529((byte) 1);
		int i_230_ = class534_sub40_228_.method16529((byte) 1);
		i_224_ = i_223_ + i_229_;
		i_225_ = i_224_ + i_230_;
		i_226_ = i_225_ + anInt2081;
		i_227_ = i_226_ + anInt2089 * 2;
	    }
	    anIntArray2083 = new int[anInt2081];
	    anIntArray2080 = new int[anInt2081];
	    anIntArray2113 = new int[anInt2081];
	    aShortArray2093 = new short[anInt2092];
	    aShortArray2077 = new short[anInt2092];
	    aShortArray2095 = new short[anInt2092];
	    if (i_188_ == 1)
		anIntArray2087 = new int[anInt2081];
	    if (bool)
		aByteArray2099 = new byte[anInt2092];
	    if (i_184_ == 255)
		aByteArray2100 = new byte[anInt2092];
	    else
		aByte2078 = (byte) i_184_;
	    if (i_185_ == 1)
		aByteArray2101 = new byte[anInt2092];
	    if (i_186_ == 1)
		anIntArray2090 = new int[anInt2092];
	    if (i_187_ == 1)
		aShortArray2104 = new short[anInt2092];
	    if (i_187_ == 1 && (anInt2110 > 0 || anInt2089 > 0))
		aShortArray2102 = new short[anInt2092];
	    aShortArray2096 = new short[anInt2092];
	    if (anInt2110 > 0) {
		aShortArray2108 = new short[anInt2110];
		aShortArray2085 = new short[anInt2110];
		aShortArray2114 = new short[anInt2110];
		if (i_197_ > 0) {
		    anIntArray2115 = new int[i_197_];
		    anIntArray2116 = new int[i_197_];
		    anIntArray2117 = new int[i_197_];
		    aByteArray2121 = new byte[i_197_];
		    aByteArray2122 = new byte[i_197_];
		    anIntArray2118 = new int[i_197_];
		}
		if (i_198_ > 0) {
		    anIntArray2119 = new int[i_198_];
		    anIntArray2120 = new int[i_198_];
		}
	    }
	    class534_sub40.anInt10811 = i_202_ * -1387468933;
	    class534_sub40_171_.anInt10811 = i_213_ * -1387468933;
	    class534_sub40_172_.anInt10811 = i_214_ * -1387468933;
	    class534_sub40_173_.anInt10811 = i_215_ * -1387468933;
	    class534_sub40_174_.anInt10811 = i_207_ * -1387468933;
	    int i_231_ = 0;
	    int i_232_ = 0;
	    int i_233_ = 0;
	    for (int i_234_ = 0; i_234_ < anInt2081; i_234_++) {
		int i_235_ = class534_sub40.method16527(-553962597);
		int i_236_ = 0;
		if ((i_235_ & 0x1) != 0)
		    i_236_ = class534_sub40_171_.method16545((byte) -114);
		int i_237_ = 0;
		if ((i_235_ & 0x2) != 0)
		    i_237_ = class534_sub40_172_.method16545((byte) -100);
		int i_238_ = 0;
		if ((i_235_ & 0x4) != 0)
		    i_238_ = class534_sub40_173_.method16545((byte) -56);
		anIntArray2083[i_234_] = i_231_ + i_236_;
		anIntArray2080[i_234_] = i_232_ + i_237_;
		anIntArray2113[i_234_] = i_233_ + i_238_;
		i_231_ = anIntArray2083[i_234_];
		i_232_ = anIntArray2080[i_234_];
		i_233_ = anIntArray2113[i_234_];
		if (i_188_ == 1) {
		    if (bool_180_)
			anIntArray2087[i_234_]
			    = class534_sub40_174_.method16547(-1641213930);
		    else {
			anIntArray2087[i_234_]
			    = class534_sub40_174_.method16527(-1399103494);
			if (anIntArray2087[i_234_] == 255)
			    anIntArray2087[i_234_] = -1;
		    }
		}
	    }
	    if (anInt2089 > 0) {
		class534_sub40.anInt10811 = i_225_ * -1387468933;
		class534_sub40_171_.anInt10811 = i_226_ * -1387468933;
		class534_sub40_172_.anInt10811 = i_227_ * -1387468933;
		anIntArray2112 = new int[anInt2081];
		int i_239_ = 0;
		int i_240_ = 0;
		for (/**/; i_239_ < anInt2081; i_239_++) {
		    anIntArray2112[i_239_] = i_240_;
		    i_240_ += class534_sub40.method16527(-498901963);
		}
		aByteArray2111 = new byte[anInt2092];
		aByteArray2097 = new byte[anInt2092];
		aByteArray2098 = new byte[anInt2092];
		aFloatArray2091 = new float[anInt2089];
		aFloatArray2084 = new float[anInt2089];
		for (i_239_ = 0; i_239_ < anInt2089; i_239_++) {
		    aFloatArray2091[i_239_]
			= ((float) class534_sub40_171_.method16530((byte) -58)
			   / 4096.0F);
		    aFloatArray2084[i_239_]
			= ((float) class534_sub40_172_.method16530((byte) -76)
			   / 4096.0F);
		}
	    }
	    class534_sub40.anInt10811 = i_212_ * -1387468933;
	    class534_sub40_171_.anInt10811 = i_203_ * -1387468933;
	    class534_sub40_172_.anInt10811 = i_205_ * -1387468933;
	    class534_sub40_173_.anInt10811 = i_208_ * -1387468933;
	    class534_sub40_174_.anInt10811 = i_206_ * -1387468933;
	    class534_sub40_175_.anInt10811 = i_210_ * -1387468933;
	    class534_sub40_176_.anInt10811 = i_211_ * -1387468933;
	    for (int i_241_ = 0; i_241_ < anInt2092; i_241_++) {
		aShortArray2096[i_241_]
		    = (short) class534_sub40.method16529((byte) 1);
		if (bool)
		    aByteArray2099[i_241_]
			= class534_sub40_171_.method16586((byte) 1);
		if (i_184_ == 255)
		    aByteArray2100[i_241_]
			= class534_sub40_172_.method16586((byte) 1);
		if (i_185_ == 1)
		    aByteArray2101[i_241_]
			= class534_sub40_173_.method16586((byte) 1);
		if (i_186_ == 1) {
		    if (bool_181_)
			anIntArray2090[i_241_]
			    = class534_sub40_174_.method16547(-1641213930);
		    else {
			anIntArray2090[i_241_]
			    = class534_sub40_174_.method16527(1435756881);
			if (anIntArray2090[i_241_] == 255)
			    anIntArray2090[i_241_] = -1;
		    }
		}
		if (i_187_ == 1)
		    aShortArray2104[i_241_]
			= (short) (class534_sub40_175_.method16529((byte) 1)
				   - 1);
		if (aShortArray2102 != null) {
		    if (aShortArray2104[i_241_] != -1) {
			if (anInt2082 >= 16)
			    aShortArray2102[i_241_]
				= (short) (class534_sub40_176_
					       .method16546(-1706829710)
					   - 1);
			else
			    aShortArray2102[i_241_]
				= (short) (class534_sub40_176_
					       .method16527(151593929)
					   - 1);
		    } else
			aShortArray2102[i_241_] = (short) -1;
		}
	    }
	    anInt2106 = -1;
	    class534_sub40.anInt10811 = i_209_ * -1387468933;
	    class534_sub40_171_.anInt10811 = i_204_ * -1387468933;
	    class534_sub40_172_.anInt10811 = i_224_ * -1387468933;
	    method3710(class534_sub40, class534_sub40_171_,
		       class534_sub40_172_);
	    class534_sub40.anInt10811 = i_216_ * -1387468933;
	    class534_sub40_171_.anInt10811 = i_217_ * -1387468933;
	    class534_sub40_172_.anInt10811 = i_219_ * -1387468933;
	    class534_sub40_173_.anInt10811 = i_220_ * -1387468933;
	    class534_sub40_174_.anInt10811 = i_221_ * -1387468933;
	    class534_sub40_175_.anInt10811 = i_222_ * -1387468933;
	    method3711(class534_sub40, class534_sub40_171_,
		       class534_sub40_172_, class534_sub40_173_,
		       class534_sub40_174_, class534_sub40_175_);
	    class534_sub40.anInt10811 = i_223_ * -1387468933;
	    if (bool_178_) {
		int i_242_ = class534_sub40.method16527(1934117568);
		if (i_242_ > 0) {
		    aClass172Array2123 = new Class172[i_242_];
		    for (int i_243_ = 0; i_243_ < i_242_; i_243_++) {
			int i_244_ = class534_sub40.method16529((byte) 1);
			int i_245_ = class534_sub40.method16529((byte) 1);
			byte i_246_;
			if (i_184_ == 255)
			    i_246_ = aByteArray2100[i_245_];
			else
			    i_246_ = (byte) i_184_;
			aClass172Array2123[i_243_]
			    = new Class172(i_244_, i_245_,
					   aShortArray2093[i_245_],
					   aShortArray2077[i_245_],
					   aShortArray2095[i_245_], i_246_);
		    }
		}
		int i_247_ = class534_sub40.method16527(-1812047903);
		if (i_247_ > 0) {
		    aClass158Array2124 = new Class158[i_247_];
		    for (int i_248_ = 0; i_248_ < i_247_; i_248_++) {
			int i_249_ = class534_sub40.method16529((byte) 1);
			int i_250_ = class534_sub40.method16529((byte) 1);
			aClass158Array2124[i_248_]
			    = new Class158(i_249_, i_250_);
		    }
		}
	    }
	    if (bool_179_) {
		int i_251_ = class534_sub40.method16527(-724879072);
		if (i_251_ > 0) {
		    aClass168Array2125 = new Class168[i_251_];
		    for (int i_252_ = 0; i_252_ < i_251_; i_252_++) {
			int i_253_ = class534_sub40.method16529((byte) 1);
			int i_254_ = class534_sub40.method16529((byte) 1);
			int i_255_;
			if (bool_182_)
			    i_255_ = class534_sub40.method16547(-1641213930);
			else {
			    i_255_ = class534_sub40.method16527(-651316643);
			    if (i_255_ == 255)
				i_255_ = -1;
			}
			byte i_256_ = class534_sub40.method16586((byte) 1);
			aClass168Array2125[i_252_]
			    = new Class168(i_253_, i_254_, i_255_, i_256_);
		    }
		}
	    }
	}
    }
    
    public void method3741(short i, short i_257_) {
	for (int i_258_ = 0; i_258_ < anInt2092; i_258_++) {
	    if (aShortArray2096[i_258_] == i)
		aShortArray2096[i_258_] = i_257_;
	}
    }
    
    public Class187(Class187[] class187s, int i) {
	anInt2081 = 0;
	anInt2106 = 0;
	anInt2092 = 0;
	aByte2078 = (byte) 0;
	anInt2110 = 0;
	anInt2081 = 0;
	anInt2092 = 0;
	anInt2110 = 0;
	anInt2089 = 0;
	int i_259_ = 0;
	int i_260_ = 0;
	int i_261_ = 0;
	boolean bool = false;
	boolean bool_262_ = false;
	boolean bool_263_ = false;
	boolean bool_264_ = false;
	boolean bool_265_ = false;
	boolean bool_266_ = false;
	aByte2078 = (byte) -1;
	for (int i_267_ = 0; i_267_ < i; i_267_++) {
	    Class187 class187_268_ = class187s[i_267_];
	    if (class187_268_ != null) {
		anInt2081 += class187_268_.anInt2081;
		anInt2092 += class187_268_.anInt2092;
		anInt2110 += class187_268_.anInt2110;
		anInt2089 += class187_268_.anInt2089;
		if (class187_268_.aClass172Array2123 != null)
		    i_259_ += class187_268_.aClass172Array2123.length;
		if (class187_268_.aClass158Array2124 != null)
		    i_260_ += class187_268_.aClass158Array2124.length;
		if (class187_268_.aClass168Array2125 != null)
		    i_261_ += class187_268_.aClass168Array2125.length;
		bool = bool | class187_268_.aByteArray2099 != null;
		if (class187_268_.aByteArray2100 != null)
		    bool_262_ = true;
		else {
		    if (aByte2078 == -1)
			aByte2078 = class187_268_.aByte2078;
		    if (aByte2078 != class187_268_.aByte2078)
			bool_262_ = true;
		}
		bool_263_ = bool_263_ | class187_268_.aByteArray2101 != null;
		bool_264_ = bool_264_ | class187_268_.aShortArray2102 != null;
		bool_265_ = bool_265_ | class187_268_.aShortArray2104 != null;
		bool_266_ = bool_266_ | class187_268_.anIntArray2090 != null;
	    }
	}
	anIntArray2083 = new int[anInt2081];
	anIntArray2080 = new int[anInt2081];
	anIntArray2113 = new int[anInt2081];
	anIntArray2087 = new int[anInt2081];
	aShortArray2088 = new short[anInt2081];
	aShortArray2093 = new short[anInt2092];
	aShortArray2077 = new short[anInt2092];
	aShortArray2095 = new short[anInt2092];
	if (bool)
	    aByteArray2099 = new byte[anInt2092];
	if (bool_262_)
	    aByteArray2100 = new byte[anInt2092];
	if (bool_263_)
	    aByteArray2101 = new byte[anInt2092];
	if (bool_264_)
	    aShortArray2102 = new short[anInt2092];
	aShortArray2096 = new short[anInt2092];
	if (bool_265_)
	    aShortArray2104 = new short[anInt2092];
	if (bool_266_)
	    anIntArray2090 = new int[anInt2092];
	aShortArray2094 = new short[anInt2092];
	if (anInt2110 > 0) {
	    aByteArray2086 = new byte[anInt2110];
	    aShortArray2108 = new short[anInt2110];
	    aShortArray2085 = new short[anInt2110];
	    aShortArray2114 = new short[anInt2110];
	    anIntArray2115 = new int[anInt2110];
	    anIntArray2116 = new int[anInt2110];
	    anIntArray2117 = new int[anInt2110];
	    aByteArray2121 = new byte[anInt2110];
	    aByteArray2122 = new byte[anInt2110];
	    anIntArray2118 = new int[anInt2110];
	    anIntArray2119 = new int[anInt2110];
	    anIntArray2120 = new int[anInt2110];
	}
	if (i_261_ > 0)
	    aClass168Array2125 = new Class168[i_261_];
	if (i_259_ > 0)
	    aClass172Array2123 = new Class172[i_259_];
	if (i_260_ > 0)
	    aClass158Array2124 = new Class158[i_260_];
	if (anInt2089 > 0) {
	    aFloatArray2091 = new float[anInt2089];
	    aFloatArray2084 = new float[anInt2089];
	    anIntArray2112 = new int[anInt2081];
	    aByteArray2111 = new byte[anInt2092];
	    aByteArray2097 = new byte[anInt2092];
	    aByteArray2098 = new byte[anInt2092];
	}
	int[] is = new int[anInt2081];
	int[] is_269_ = new int[anInt2089];
	int[] is_270_ = new int[anInt2081];
	int[] is_271_ = new int[anInt2081];
	int[] is_272_ = new int[3];
	anInt2081 = 0;
	anInt2092 = 0;
	anInt2110 = 0;
	anInt2089 = 0;
	i_259_ = 0;
	i_260_ = 0;
	i_261_ = 0;
	for (int i_273_ = 0; i_273_ < i; i_273_++) {
	    short i_274_ = (short) (1 << i_273_);
	    Class187 class187_275_ = class187s[i_273_];
	    int i_276_ = anInt2092;
	    if (class187_275_ != null) {
		boolean[] bools = new boolean[class187_275_.anInt2081];
		if (class187_275_.aClass168Array2125 != null) {
		    for (int i_277_ = 0;
			 i_277_ < class187_275_.aClass168Array2125.length;
			 i_277_++) {
			Class168 class168
			    = class187_275_.aClass168Array2125[i_277_];
			aClass168Array2125[i_261_++]
			    = class168.method2755((class168.anInt1791
						   * 1329690033) + anInt2092,
						  (byte) 59);
		    }
		}
		for (int i_278_ = 0; i_278_ < class187_275_.anInt2092;
		     i_278_++) {
		    is_272_[0] = class187_275_.aShortArray2093[i_278_];
		    is_272_[1] = class187_275_.aShortArray2077[i_278_];
		    is_272_[2] = class187_275_.aShortArray2095[i_278_];
		    for (int i_279_ = 0; i_279_ < 3; i_279_++) {
			int i_280_ = is_272_[i_279_];
			int i_281_ = class187_275_.anIntArray2083[i_280_];
			int i_282_ = class187_275_.anIntArray2080[i_280_];
			int i_283_ = class187_275_.anIntArray2113[i_280_];
			int i_284_;
			for (i_284_ = 0; i_284_ < anInt2081; i_284_++) {
			    if (i_281_ == anIntArray2083[i_284_]
				&& i_282_ == anIntArray2080[i_284_]
				&& i_283_ == anIntArray2113[i_284_]) {
				aShortArray2088[i_284_] |= i_274_;
				is_270_[i_280_] = i_284_;
				break;
			    }
			}
			if (class187_275_.anInt2089 > 0 && !bools[i_280_]) {
			    int i_285_
				= ((i_280_ < class187_275_.anInt2081 - 1
				    ? class187_275_.anIntArray2112[i_280_ + 1]
				    : class187_275_.anInt2089)
				   - class187_275_.anIntArray2112[i_280_]);
			    for (int i_286_ = 0; i_286_ < i_285_; i_286_++) {
				aFloatArray2091[anInt2089]
				    = (class187_275_.aFloatArray2091
				       [(class187_275_.anIntArray2112[i_280_]
					 + i_286_)]);
				aFloatArray2084[anInt2089]
				    = (class187_275_.aFloatArray2084
				       [(class187_275_.anIntArray2112[i_280_]
					 + i_286_)]);
				is_269_[anInt2089]
				    = i_284_ << 16 | is[i_284_] + i_286_;
				anInt2089++;
			    }
			    is_271_[i_280_] = is[i_284_];
			    is[i_284_] += i_285_;
			    bools[i_280_] = true;
			}
			if (i_284_ >= anInt2081) {
			    anIntArray2083[anInt2081] = i_281_;
			    anIntArray2080[anInt2081] = i_282_;
			    anIntArray2113[anInt2081] = i_283_;
			    aShortArray2088[anInt2081] = i_274_;
			    anIntArray2087[anInt2081]
				= (class187_275_.anIntArray2087 != null
				   ? class187_275_.anIntArray2087[i_280_]
				   : -1);
			    is_270_[i_280_] = anInt2081;
			    anInt2081++;
			}
		    }
		}
		for (int i_287_ = 0; i_287_ < class187_275_.anInt2092;
		     i_287_++) {
		    if (bool && class187_275_.aByteArray2099 != null)
			aByteArray2099[anInt2092]
			    = class187_275_.aByteArray2099[i_287_];
		    if (bool_262_) {
			if (class187_275_.aByteArray2100 != null)
			    aByteArray2100[anInt2092]
				= class187_275_.aByteArray2100[i_287_];
			else
			    aByteArray2100[anInt2092]
				= class187_275_.aByte2078;
		    }
		    if (bool_263_ && class187_275_.aByteArray2101 != null)
			aByteArray2101[anInt2092]
			    = class187_275_.aByteArray2101[i_287_];
		    if (bool_265_) {
			if (class187_275_.aShortArray2104 != null)
			    aShortArray2104[anInt2092]
				= class187_275_.aShortArray2104[i_287_];
			else
			    aShortArray2104[anInt2092] = (short) -1;
		    }
		    if (bool_266_) {
			if (class187_275_.anIntArray2090 != null)
			    anIntArray2090[anInt2092]
				= class187_275_.anIntArray2090[i_287_];
			else
			    anIntArray2090[anInt2092] = -1;
		    }
		    if (class187_275_.anInt2089 > 0) {
			aByteArray2111[anInt2092]
			    = (byte) (class187_275_.aByteArray2111[i_287_]
				      + is_271_[(class187_275_.aShortArray2093
						 [i_287_])]);
			aByteArray2097[anInt2092]
			    = (byte) (class187_275_.aByteArray2097[i_287_]
				      + is_271_[(class187_275_.aShortArray2077
						 [i_287_])]);
			aByteArray2098[anInt2092]
			    = (byte) (class187_275_.aByteArray2098[i_287_]
				      + is_271_[(class187_275_.aShortArray2095
						 [i_287_])]);
		    }
		    aShortArray2093[anInt2092]
			= (short) (is_270_
				   [class187_275_.aShortArray2093[i_287_]]);
		    aShortArray2077[anInt2092]
			= (short) (is_270_
				   [class187_275_.aShortArray2077[i_287_]]);
		    aShortArray2095[anInt2092]
			= (short) (is_270_
				   [class187_275_.aShortArray2095[i_287_]]);
		    aShortArray2094[anInt2092] = i_274_;
		    aShortArray2096[anInt2092]
			= class187_275_.aShortArray2096[i_287_];
		    anInt2092++;
		}
		if (class187_275_.aClass172Array2123 != null) {
		    for (int i_288_ = 0;
			 i_288_ < class187_275_.aClass172Array2123.length;
			 i_288_++) {
			int i_289_
			    = is_270_[(class187_275_.aClass172Array2123[i_288_]
				       .anInt1814) * 1404619919];
			int i_290_ = is_270_[(class187_275_.aClass172Array2123
					      [i_288_].anInt1812) * 496404005];
			int i_291_
			    = is_270_[(class187_275_.aClass172Array2123[i_288_]
				       .anInt1813) * 1123614299];
			aClass172Array2123[i_259_]
			    = (class187_275_.aClass172Array2123[i_288_]
				   .method2889
			       ((class187_275_.aClass172Array2123[i_288_]
				 .anInt1810) * -1916225325 + i_276_,
				i_289_, i_290_, i_291_, -318923023));
			i_259_++;
		    }
		}
		if (class187_275_.aClass158Array2124 != null) {
		    for (int i_292_ = 0;
			 i_292_ < class187_275_.aClass158Array2124.length;
			 i_292_++) {
			int i_293_
			    = is_270_[(class187_275_.aClass158Array2124[i_292_]
				       .anInt1753) * -1634673991];
			aClass158Array2124[i_260_]
			    = class187_275_.aClass158Array2124[i_292_]
				  .method2588(i_293_, -1851539455);
			i_260_++;
		    }
		}
	    }
	}
	anInt2106 = anInt2081;
	if (anInt2089 > 0) {
	    Class33.method901(is_269_, aFloatArray2091, aFloatArray2084,
			      -719187564);
	    int i_294_ = 0;
	    int i_295_ = 0;
	    for (/**/; i_294_ < anInt2081; i_294_++) {
		anIntArray2112[i_294_] = i_295_;
		i_295_ += is[i_294_];
	    }
	}
	int i_296_ = 0;
	int i_297_ = 0;
	for (/**/; i_296_ < i; i_296_++) {
	    short i_298_ = (short) (1 << i_296_);
	    Class187 class187_299_ = class187s[i_296_];
	    if (class187_299_ != null) {
		if (bool_264_) {
		    int i_300_ = 0;
		    while (i_300_ < class187_299_.anInt2092) {
			aShortArray2102[i_297_]
			    = (class187_299_.aShortArray2102 != null
			       ? class187_299_.aShortArray2102[i_300_]
			       : (short) -1);
			if (aShortArray2102[i_297_] > -1
			    && aShortArray2102[i_297_] < 32766)
			    aShortArray2102[i_297_]
				= (short) (aShortArray2102[i_297_]
					   + anInt2110);
			i_300_++;
			i_297_++;
		    }
		}
		for (int i_301_ = 0; i_301_ < class187_299_.anInt2110;
		     i_301_++) {
		    byte i_302_ = (aByteArray2086[anInt2110]
				   = class187_299_.aByteArray2086[i_301_]);
		    if (i_302_ == 0) {
			aShortArray2108[anInt2110]
			    = (short) method3708(class187_299_,
						 (class187_299_.aShortArray2108
						  [i_301_]),
						 i_298_);
			aShortArray2085[anInt2110]
			    = (short) method3708(class187_299_,
						 (class187_299_.aShortArray2085
						  [i_301_]),
						 i_298_);
			aShortArray2114[anInt2110]
			    = (short) method3708(class187_299_,
						 (class187_299_.aShortArray2114
						  [i_301_]),
						 i_298_);
		    } else if (i_302_ >= 1 && i_302_ <= 3) {
			aShortArray2108[anInt2110]
			    = class187_299_.aShortArray2108[i_301_];
			aShortArray2085[anInt2110]
			    = class187_299_.aShortArray2085[i_301_];
			aShortArray2114[anInt2110]
			    = class187_299_.aShortArray2114[i_301_];
			anIntArray2115[anInt2110]
			    = class187_299_.anIntArray2115[i_301_];
			anIntArray2116[anInt2110]
			    = class187_299_.anIntArray2116[i_301_];
			anIntArray2117[anInt2110]
			    = class187_299_.anIntArray2117[i_301_];
			aByteArray2121[anInt2110]
			    = class187_299_.aByteArray2121[i_301_];
			aByteArray2122[anInt2110]
			    = class187_299_.aByteArray2122[i_301_];
			anIntArray2118[anInt2110]
			    = class187_299_.anIntArray2118[i_301_];
		    } else if (i_302_ == 2) {
			anIntArray2119[anInt2110]
			    = class187_299_.anIntArray2119[i_301_];
			anIntArray2120[anInt2110]
			    = class187_299_.anIntArray2120[i_301_];
		    }
		    anInt2110++;
		}
	    }
	}
    }
    
    public void method3742(short i, short i_303_) {
	if (aShortArray2104 != null) {
	    for (int i_304_ = 0; i_304_ < anInt2092; i_304_++) {
		if (aShortArray2104[i_304_] == i)
		    aShortArray2104[i_304_] = i_303_;
	    }
	}
    }
    
    public void method3743(float f) {
	for (int i = 0; i < anInt2081; i++) {
	    anIntArray2083[i] *= f;
	    anIntArray2080[i] *= f;
	    anIntArray2113[i] *= f;
	}
	if (anInt2110 > 0 && anIntArray2115 != null) {
	    for (int i = 0; i < anIntArray2115.length; i++) {
		anIntArray2115[i] *= f;
		anIntArray2116[i] *= f;
		if (aByteArray2086[i] != 1)
		    anIntArray2117[i] *= f;
	    }
	}
    }
    
    public void method3744(short i, short i_305_) {
	if (aShortArray2104 != null) {
	    for (int i_306_ = 0; i_306_ < anInt2092; i_306_++) {
		if (aShortArray2104[i_306_] == i)
		    aShortArray2104[i_306_] = i_305_;
	    }
	}
    }
    
    public void method3745(short i, short i_307_) {
	for (int i_308_ = 0; i_308_ < anInt2092; i_308_++) {
	    if (aShortArray2096[i_308_] == i)
		aShortArray2096[i_308_] = i_307_;
	}
    }
    
    public void method3746(int i, int i_309_, int i_310_) {
	if (i_310_ != 0) {
	    int i_311_ = Class427.anIntArray4806[i_310_];
	    int i_312_ = Class427.anIntArray4805[i_310_];
	    for (int i_313_ = 0; i_313_ < anInt2081; i_313_++) {
		int i_314_ = ((anIntArray2080[i_313_] * i_311_
			       + anIntArray2083[i_313_] * i_312_)
			      >> 14);
		anIntArray2080[i_313_]
		    = (anIntArray2080[i_313_] * i_312_
		       - anIntArray2083[i_313_] * i_311_) >> 14;
		anIntArray2083[i_313_] = i_314_;
	    }
	}
	if (i != 0) {
	    int i_315_ = Class427.anIntArray4806[i];
	    int i_316_ = Class427.anIntArray4805[i];
	    for (int i_317_ = 0; i_317_ < anInt2081; i_317_++) {
		int i_318_ = ((anIntArray2080[i_317_] * i_316_
			       - anIntArray2113[i_317_] * i_315_)
			      >> 14);
		anIntArray2113[i_317_]
		    = (anIntArray2080[i_317_] * i_315_
		       + anIntArray2113[i_317_] * i_316_) >> 14;
		anIntArray2080[i_317_] = i_318_;
	    }
	}
	if (i_309_ != 0) {
	    int i_319_ = Class427.anIntArray4806[i_309_];
	    int i_320_ = Class427.anIntArray4805[i_309_];
	    for (int i_321_ = 0; i_321_ < anInt2081; i_321_++) {
		int i_322_ = ((anIntArray2113[i_321_] * i_319_
			       + anIntArray2083[i_321_] * i_320_)
			      >> 14);
		anIntArray2113[i_321_]
		    = (anIntArray2113[i_321_] * i_320_
		       - anIntArray2083[i_321_] * i_319_) >> 14;
		anIntArray2083[i_321_] = i_322_;
	    }
	}
    }
    
    public void method3747(int i, int i_323_, int i_324_) {
	if (i_324_ != 0) {
	    int i_325_ = Class427.anIntArray4806[i_324_];
	    int i_326_ = Class427.anIntArray4805[i_324_];
	    for (int i_327_ = 0; i_327_ < anInt2081; i_327_++) {
		int i_328_ = ((anIntArray2080[i_327_] * i_325_
			       + anIntArray2083[i_327_] * i_326_)
			      >> 14);
		anIntArray2080[i_327_]
		    = (anIntArray2080[i_327_] * i_326_
		       - anIntArray2083[i_327_] * i_325_) >> 14;
		anIntArray2083[i_327_] = i_328_;
	    }
	}
	if (i != 0) {
	    int i_329_ = Class427.anIntArray4806[i];
	    int i_330_ = Class427.anIntArray4805[i];
	    for (int i_331_ = 0; i_331_ < anInt2081; i_331_++) {
		int i_332_ = ((anIntArray2080[i_331_] * i_330_
			       - anIntArray2113[i_331_] * i_329_)
			      >> 14);
		anIntArray2113[i_331_]
		    = (anIntArray2080[i_331_] * i_329_
		       + anIntArray2113[i_331_] * i_330_) >> 14;
		anIntArray2080[i_331_] = i_332_;
	    }
	}
	if (i_323_ != 0) {
	    int i_333_ = Class427.anIntArray4806[i_323_];
	    int i_334_ = Class427.anIntArray4805[i_323_];
	    for (int i_335_ = 0; i_335_ < anInt2081; i_335_++) {
		int i_336_ = ((anIntArray2113[i_335_] * i_333_
			       + anIntArray2083[i_335_] * i_334_)
			      >> 14);
		anIntArray2113[i_335_]
		    = (anIntArray2113[i_335_] * i_334_
		       - anIntArray2083[i_335_] * i_333_) >> 14;
		anIntArray2083[i_335_] = i_336_;
	    }
	}
    }
    
    public int[][] method3748() {
	int[] is = new int[256];
	int i = 0;
	for (int i_337_ = 0; i_337_ < anInt2092; i_337_++) {
	    int i_338_ = anIntArray2090[i_337_];
	    if (i_338_ >= 0) {
		is[i_338_]++;
		if (i_338_ > i)
		    i = i_338_;
	    }
	}
	int[][] is_339_ = new int[i + 1][];
	for (int i_340_ = 0; i_340_ <= i; i_340_++) {
	    is_339_[i_340_] = new int[is[i_340_]];
	    is[i_340_] = 0;
	}
	for (int i_341_ = 0; i_341_ < anInt2092; i_341_++) {
	    int i_342_ = anIntArray2090[i_341_];
	    if (i_342_ >= 0)
		is_339_[i_342_][is[i_342_]++] = i_341_;
	}
	return is_339_;
    }
    
    public void method3749(int i, int i_343_, int i_344_) {
	for (int i_345_ = 0; i_345_ < anInt2081; i_345_++) {
	    anIntArray2083[i_345_] += i;
	    anIntArray2080[i_345_] += i_343_;
	    anIntArray2113[i_345_] += i_344_;
	}
    }
    
    public void method3750(short i, short i_346_) {
	if (aShortArray2104 != null) {
	    for (int i_347_ = 0; i_347_ < anInt2092; i_347_++) {
		if (aShortArray2104[i_347_] == i)
		    aShortArray2104[i_347_] = i_346_;
	    }
	}
    }
}
