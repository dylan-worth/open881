/* Class205 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class205 implements Interface13
{
    public int anInt2206;
    Class206 aClass206_2207;
    public int anInt2208;
    public int[] anIntArray2209;
    public int[] anIntArray2210;
    public int[] anIntArray2211;
    public int anInt2212 = 0;
    public Class208 aClass208_2213;
    public boolean aBool2214;
    public int[][] anIntArrayArray2215;
    public int[] anIntArray2216;
    public int anInt2217;
    public int anInt2218;
    public int anInt2219;
    public int anInt2220;
    public int anInt2221;
    public static boolean aBool2222 = false;
    public int anInt2223;
    int anInt2224 = -243170501;
    public boolean aBool2225;
    public int[] anIntArray2226;
    public int[] anIntArray2227;
    public int anInt2228;
    Class9 aClass9_2229;
    public int anInt2230;
    
    void method3912(Class534_Sub40 class534_sub40, int i) {
	if (i == 1) {
	    int i_0_ = class534_sub40.method16529((byte) 1);
	    anIntArray2211 = new int[i_0_];
	    for (int i_1_ = 0; i_1_ < i_0_; i_1_++)
		anIntArray2211[i_1_] = class534_sub40.method16529((byte) 1);
	    anIntArray2209 = new int[i_0_];
	    for (int i_2_ = 0; i_2_ < i_0_; i_2_++)
		anIntArray2209[i_2_] = class534_sub40.method16529((byte) 1);
	    for (int i_3_ = 0; i_3_ < i_0_; i_3_++)
		anIntArray2209[i_3_] = (class534_sub40.method16529((byte) 1)
					<< 16) + anIntArray2209[i_3_];
	} else if (i == 2)
	    anInt2206 = class534_sub40.method16529((byte) 1) * -1861769857;
	else if (5 == i)
	    anInt2217 = class534_sub40.method16527(240360509) * -1938491323;
	else if (6 == i)
	    anInt2219 = class534_sub40.method16529((byte) 1) * 2116456681;
	else if (7 == i)
	    anInt2228 = class534_sub40.method16529((byte) 1) * -1704094575;
	else if (8 == i)
	    anInt2220 = class534_sub40.method16527(429995917) * 1736090485;
	else if (i == 9)
	    anInt2221 = class534_sub40.method16527(-1373494731) * -2082983731;
	else if (10 == i)
	    anInt2218 = class534_sub40.method16527(-1618625280) * 1084459067;
	else if (11 == i)
	    anInt2223 = class534_sub40.method16527(-658151266) * -282961309;
	else if (12 == i || 112 == i) {
	    int i_4_;
	    if (i == 12)
		i_4_ = class534_sub40.method16527(-1663993255);
	    else
		i_4_ = class534_sub40.method16529((byte) 1);
	    anIntArray2210 = new int[i_4_];
	    for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
		anIntArray2210[i_5_] = class534_sub40.method16529((byte) 1);
	    for (int i_6_ = 0; i_6_ < i_4_; i_6_++)
		anIntArray2210[i_6_] = (class534_sub40.method16529((byte) 1)
					<< 16) + anIntArray2210[i_6_];
	} else if (i == 13) {
	    int i_7_ = class534_sub40.method16529((byte) 1);
	    anIntArrayArray2215 = new int[i_7_][];
	    for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
		int i_9_ = class534_sub40.method16527(-1421836941);
		if (i_9_ > 0) {
		    anIntArrayArray2215[i_8_] = new int[i_9_];
		    anIntArrayArray2215[i_8_][0]
			= class534_sub40.method16531(320144598);
		    for (int i_10_ = 1; i_10_ < i_9_; i_10_++)
			anIntArrayArray2215[i_8_][i_10_]
			    = class534_sub40.method16529((byte) 1);
		}
	    }
	} else if (i == 14)
	    aBool2214 = true;
	else if (15 == i)
	    aBool2225 = true;
	else if (16 != i && 18 != i) {
	    if (i == 19 || i == 119) {
		if (anIntArray2216 == null) {
		    anIntArray2216 = new int[anIntArrayArray2215.length];
		    for (int i_11_ = 0; i_11_ < anIntArrayArray2215.length;
			 i_11_++)
			anIntArray2216[i_11_] = 255;
		}
		int i_12_;
		if (i == 19)
		    i_12_ = class534_sub40.method16527(1416557155);
		else
		    i_12_ = class534_sub40.method16529((byte) 1);
		anIntArray2216[i_12_] = class534_sub40.method16527(1730998786);
	    } else if (i == 20 || i == 120) {
		if (null == anIntArray2227 || anIntArray2226 == null) {
		    anIntArray2227 = new int[anIntArrayArray2215.length];
		    anIntArray2226 = new int[anIntArrayArray2215.length];
		    for (int i_13_ = 0; i_13_ < anIntArrayArray2215.length;
			 i_13_++) {
			anIntArray2227[i_13_] = 256;
			anIntArray2226[i_13_] = 256;
		    }
		}
		int i_14_;
		if (20 == i)
		    i_14_ = class534_sub40.method16527(-268052537);
		else
		    i_14_ = class534_sub40.method16529((byte) 1);
		anIntArray2227[i_14_] = class534_sub40.method16529((byte) 1);
		anIntArray2226[i_14_] = class534_sub40.method16529((byte) 1);
	    } else if (i == 22)
		anInt2230
		    = class534_sub40.method16527(-1401185472) * -2097961293;
	    else if (23 == i)
		class534_sub40.method16529((byte) 1);
	    else if (24 == i) {
		anInt2224 = class534_sub40.method16529((byte) 1) * 243170501;
		if (null != aClass206_2207)
		    aClass208_2213
			= ((Class208)
			   aClass206_2207.anInterface14_2231
			       .method91(anInt2224 * 2115215885, 682193561));
	    } else if (i == 249) {
		int i_15_ = class534_sub40.method16527(361565657);
		if (null == aClass9_2229) {
		    int i_16_ = Class162.method2640(i_15_, (byte) 81);
		    aClass9_2229 = new Class9(i_16_);
		}
		for (int i_17_ = 0; i_17_ < i_15_; i_17_++) {
		    boolean bool = class534_sub40.method16527(341772055) == 1;
		    int i_18_ = class534_sub40.method16531(1555105759);
		    Class534 class534;
		    if (bool)
			class534
			    = new Class534_Sub6(class534_sub40
						    .method16541((byte) -19));
		    else
			class534
			    = new Class534_Sub39(class534_sub40
						     .method16533(-258848859));
		    aClass9_2229.method581(class534, (long) i_18_);
		}
	    }
	}
    }
    
    public void method79(Class534_Sub40 class534_sub40, byte i) {
	for (;;) {
	    int i_19_ = class534_sub40.method16527(-1147793425);
	    if (0 == i_19_)
		break;
	    method3915(class534_sub40, i_19_, 1557991132);
	}
    }
    
    public void method78(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(-861030367);
	    if (0 == i)
		break;
	    method3915(class534_sub40, i, 570318025);
	}
    }
    
    public void method82(int i) {
	if (-1 == 716389381 * anInt2221) {
	    if (aClass208_2213 != null
		&& aClass208_2213.aBoolArray2240 != null)
		anInt2221 = 128999834;
	    else
		anInt2221 = 0;
	}
	if (anInt2218 * -492433165 == -1) {
	    if (null != aClass208_2213
		&& aClass208_2213.aBoolArray2240 != null)
		anInt2218 = -2126049162;
	    else
		anInt2218 = 0;
	}
	if (anIntArray2211 != null) {
	    anInt2212 = 0;
	    for (int i_20_ = 0; i_20_ < anIntArray2211.length; i_20_++)
		anInt2212 += -1346711357 * anIntArray2211[i_20_];
	}
    }
    
    public boolean method3913(int i) {
	if (null == anIntArray2209)
	    return true;
	boolean bool = true;
	int[] is = anIntArray2209;
	for (int i_21_ = 0; i_21_ < is.length; i_21_++) {
	    int i_22_ = is[i_21_];
	    if (aClass206_2207.method3926(i_22_ >>> 16, -681325029) == null)
		bool = false;
	}
	return bool;
    }
    
    public int method3914(int i, int i_23_, byte i_24_) {
	if (aClass9_2229 == null)
	    return i_23_;
	Class534_Sub39 class534_sub39
	    = (Class534_Sub39) aClass9_2229.method579((long) i);
	if (null == class534_sub39)
	    return i_23_;
	return class534_sub39.anInt10807 * -705967177;
    }
    
    void method3915(Class534_Sub40 class534_sub40, int i, int i_25_) {
	if (i == 1) {
	    int i_26_ = class534_sub40.method16529((byte) 1);
	    anIntArray2211 = new int[i_26_];
	    for (int i_27_ = 0; i_27_ < i_26_; i_27_++)
		anIntArray2211[i_27_] = class534_sub40.method16529((byte) 1);
	    anIntArray2209 = new int[i_26_];
	    for (int i_28_ = 0; i_28_ < i_26_; i_28_++)
		anIntArray2209[i_28_] = class534_sub40.method16529((byte) 1);
	    for (int i_29_ = 0; i_29_ < i_26_; i_29_++)
		anIntArray2209[i_29_] = (class534_sub40.method16529((byte) 1)
					 << 16) + anIntArray2209[i_29_];
	} else if (i == 2)
	    anInt2206 = class534_sub40.method16529((byte) 1) * -1861769857;
	else if (5 == i)
	    anInt2217 = class534_sub40.method16527(-497938296) * -1938491323;
	else if (6 == i)
	    anInt2219 = class534_sub40.method16529((byte) 1) * 2116456681;
	else if (7 == i)
	    anInt2228 = class534_sub40.method16529((byte) 1) * -1704094575;
	else if (8 == i)
	    anInt2220 = class534_sub40.method16527(-2040265735) * 1736090485;
	else if (i == 9)
	    anInt2221 = class534_sub40.method16527(216331940) * -2082983731;
	else if (10 == i)
	    anInt2218 = class534_sub40.method16527(1402182124) * 1084459067;
	else if (11 == i)
	    anInt2223 = class534_sub40.method16527(-356562367) * -282961309;
	else if (12 == i || 112 == i) {
	    int i_30_;
	    if (i == 12)
		i_30_ = class534_sub40.method16527(328861502);
	    else
		i_30_ = class534_sub40.method16529((byte) 1);
	    anIntArray2210 = new int[i_30_];
	    for (int i_31_ = 0; i_31_ < i_30_; i_31_++)
		anIntArray2210[i_31_] = class534_sub40.method16529((byte) 1);
	    for (int i_32_ = 0; i_32_ < i_30_; i_32_++)
		anIntArray2210[i_32_] = (class534_sub40.method16529((byte) 1)
					 << 16) + anIntArray2210[i_32_];
	} else if (i == 13) {
	    int i_33_ = class534_sub40.method16529((byte) 1);
	    anIntArrayArray2215 = new int[i_33_][];
	    for (int i_34_ = 0; i_34_ < i_33_; i_34_++) {
		int i_35_ = class534_sub40.method16527(699956736);
		if (i_35_ > 0) {
		    anIntArrayArray2215[i_34_] = new int[i_35_];
		    anIntArrayArray2215[i_34_][0]
			= class534_sub40.method16531(959804458);
		    for (int i_36_ = 1; i_36_ < i_35_; i_36_++)
			anIntArrayArray2215[i_34_][i_36_]
			    = class534_sub40.method16529((byte) 1);
		}
	    }
	} else if (i == 14)
	    aBool2214 = true;
	else if (15 == i)
	    aBool2225 = true;
	else if (16 != i && 18 != i) {
	    if (i == 19 || i == 119) {
		if (anIntArray2216 == null) {
		    anIntArray2216 = new int[anIntArrayArray2215.length];
		    for (int i_37_ = 0; i_37_ < anIntArrayArray2215.length;
			 i_37_++)
			anIntArray2216[i_37_] = 255;
		}
		int i_38_;
		if (i == 19)
		    i_38_ = class534_sub40.method16527(850236111);
		else
		    i_38_ = class534_sub40.method16529((byte) 1);
		anIntArray2216[i_38_] = class534_sub40.method16527(-244945866);
	    } else if (i == 20 || i == 120) {
		if (null == anIntArray2227 || anIntArray2226 == null) {
		    anIntArray2227 = new int[anIntArrayArray2215.length];
		    anIntArray2226 = new int[anIntArrayArray2215.length];
		    for (int i_39_ = 0; i_39_ < anIntArrayArray2215.length;
			 i_39_++) {
			anIntArray2227[i_39_] = 256;
			anIntArray2226[i_39_] = 256;
		    }
		}
		int i_40_;
		if (20 == i)
		    i_40_ = class534_sub40.method16527(-1542840645);
		else
		    i_40_ = class534_sub40.method16529((byte) 1);
		anIntArray2227[i_40_] = class534_sub40.method16529((byte) 1);
		anIntArray2226[i_40_] = class534_sub40.method16529((byte) 1);
	    } else if (i == 22)
		anInt2230
		    = class534_sub40.method16527(496762173) * -2097961293;
	    else if (23 == i)
		class534_sub40.method16529((byte) 1);
	    else if (24 == i) {
		anInt2224 = class534_sub40.method16529((byte) 1) * 243170501;
		if (null != aClass206_2207)
		    aClass208_2213
			= ((Class208)
			   aClass206_2207.anInterface14_2231
			       .method91(anInt2224 * 2115215885, -1520830598));
	    } else if (i == 249) {
		int i_41_ = class534_sub40.method16527(1885503279);
		if (null == aClass9_2229) {
		    int i_42_ = Class162.method2640(i_41_, (byte) 28);
		    aClass9_2229 = new Class9(i_42_);
		}
		for (int i_43_ = 0; i_43_ < i_41_; i_43_++) {
		    boolean bool = class534_sub40.method16527(-431365436) == 1;
		    int i_44_ = class534_sub40.method16531(1121039119);
		    Class534 class534;
		    if (bool)
			class534
			    = new Class534_Sub6(class534_sub40
						    .method16541((byte) -9));
		    else
			class534
			    = new Class534_Sub39(class534_sub40
						     .method16533(-258848859));
		    aClass9_2229.method581(class534, (long) i_44_);
		}
	    }
	}
    }
    
    public void method80(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(-698454478);
	    if (0 == i)
		break;
	    method3915(class534_sub40, i, 1091772517);
	}
    }
    
    Class205(int i, Class206 class206) {
	anInt2206 = 1861769857;
	anInt2217 = -1102522023;
	anInt2219 = -2116456681;
	anInt2228 = 1704094575;
	anInt2220 = 74266175;
	anInt2221 = 2082983731;
	anInt2218 = -1084459067;
	anInt2223 = -565922618;
	aBool2214 = false;
	aBool2225 = false;
	anInt2230 = 2097961293;
	anInt2208 = -1644429831 * i;
	aClass206_2207 = class206;
    }
    
    public void method81(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(-936252295);
	    if (0 == i)
		break;
	    method3915(class534_sub40, i, 1759860843);
	}
    }
    
    void method3916(Class534_Sub40 class534_sub40, int i) {
	if (i == 1) {
	    int i_45_ = class534_sub40.method16529((byte) 1);
	    anIntArray2211 = new int[i_45_];
	    for (int i_46_ = 0; i_46_ < i_45_; i_46_++)
		anIntArray2211[i_46_] = class534_sub40.method16529((byte) 1);
	    anIntArray2209 = new int[i_45_];
	    for (int i_47_ = 0; i_47_ < i_45_; i_47_++)
		anIntArray2209[i_47_] = class534_sub40.method16529((byte) 1);
	    for (int i_48_ = 0; i_48_ < i_45_; i_48_++)
		anIntArray2209[i_48_] = (class534_sub40.method16529((byte) 1)
					 << 16) + anIntArray2209[i_48_];
	} else if (i == 2)
	    anInt2206 = class534_sub40.method16529((byte) 1) * -1861769857;
	else if (5 == i)
	    anInt2217 = class534_sub40.method16527(-1775183973) * -1938491323;
	else if (6 == i)
	    anInt2219 = class534_sub40.method16529((byte) 1) * 2116456681;
	else if (7 == i)
	    anInt2228 = class534_sub40.method16529((byte) 1) * -1704094575;
	else if (8 == i)
	    anInt2220 = class534_sub40.method16527(-1017651402) * 1736090485;
	else if (i == 9)
	    anInt2221 = class534_sub40.method16527(-2145569597) * -2082983731;
	else if (10 == i)
	    anInt2218 = class534_sub40.method16527(877050600) * 1084459067;
	else if (11 == i)
	    anInt2223 = class534_sub40.method16527(-2124182597) * -282961309;
	else if (12 == i || 112 == i) {
	    int i_49_;
	    if (i == 12)
		i_49_ = class534_sub40.method16527(747834153);
	    else
		i_49_ = class534_sub40.method16529((byte) 1);
	    anIntArray2210 = new int[i_49_];
	    for (int i_50_ = 0; i_50_ < i_49_; i_50_++)
		anIntArray2210[i_50_] = class534_sub40.method16529((byte) 1);
	    for (int i_51_ = 0; i_51_ < i_49_; i_51_++)
		anIntArray2210[i_51_] = (class534_sub40.method16529((byte) 1)
					 << 16) + anIntArray2210[i_51_];
	} else if (i == 13) {
	    int i_52_ = class534_sub40.method16529((byte) 1);
	    anIntArrayArray2215 = new int[i_52_][];
	    for (int i_53_ = 0; i_53_ < i_52_; i_53_++) {
		int i_54_ = class534_sub40.method16527(-2045561463);
		if (i_54_ > 0) {
		    anIntArrayArray2215[i_53_] = new int[i_54_];
		    anIntArrayArray2215[i_53_][0]
			= class534_sub40.method16531(668704759);
		    for (int i_55_ = 1; i_55_ < i_54_; i_55_++)
			anIntArrayArray2215[i_53_][i_55_]
			    = class534_sub40.method16529((byte) 1);
		}
	    }
	} else if (i == 14)
	    aBool2214 = true;
	else if (15 == i)
	    aBool2225 = true;
	else if (16 != i && 18 != i) {
	    if (i == 19 || i == 119) {
		if (anIntArray2216 == null) {
		    anIntArray2216 = new int[anIntArrayArray2215.length];
		    for (int i_56_ = 0; i_56_ < anIntArrayArray2215.length;
			 i_56_++)
			anIntArray2216[i_56_] = 255;
		}
		int i_57_;
		if (i == 19)
		    i_57_ = class534_sub40.method16527(1398843268);
		else
		    i_57_ = class534_sub40.method16529((byte) 1);
		anIntArray2216[i_57_]
		    = class534_sub40.method16527(-2015825553);
	    } else if (i == 20 || i == 120) {
		if (null == anIntArray2227 || anIntArray2226 == null) {
		    anIntArray2227 = new int[anIntArrayArray2215.length];
		    anIntArray2226 = new int[anIntArrayArray2215.length];
		    for (int i_58_ = 0; i_58_ < anIntArrayArray2215.length;
			 i_58_++) {
			anIntArray2227[i_58_] = 256;
			anIntArray2226[i_58_] = 256;
		    }
		}
		int i_59_;
		if (20 == i)
		    i_59_ = class534_sub40.method16527(-1556060866);
		else
		    i_59_ = class534_sub40.method16529((byte) 1);
		anIntArray2227[i_59_] = class534_sub40.method16529((byte) 1);
		anIntArray2226[i_59_] = class534_sub40.method16529((byte) 1);
	    } else if (i == 22)
		anInt2230 = class534_sub40.method16527(81720106) * -2097961293;
	    else if (23 == i)
		class534_sub40.method16529((byte) 1);
	    else if (24 == i) {
		anInt2224 = class534_sub40.method16529((byte) 1) * 243170501;
		if (null != aClass206_2207)
		    aClass208_2213
			= ((Class208)
			   aClass206_2207.anInterface14_2231
			       .method91(anInt2224 * 2115215885, 369748837));
	    } else if (i == 249) {
		int i_60_ = class534_sub40.method16527(-1968892375);
		if (null == aClass9_2229) {
		    int i_61_ = Class162.method2640(i_60_, (byte) 59);
		    aClass9_2229 = new Class9(i_61_);
		}
		for (int i_62_ = 0; i_62_ < i_60_; i_62_++) {
		    boolean bool
			= class534_sub40.method16527(-1346533802) == 1;
		    int i_63_ = class534_sub40.method16531(1958953970);
		    Class534 class534;
		    if (bool)
			class534
			    = new Class534_Sub6(class534_sub40
						    .method16541((byte) -9));
		    else
			class534
			    = new Class534_Sub39(class534_sub40
						     .method16533(-258848859));
		    aClass9_2229.method581(class534, (long) i_63_);
		}
	    }
	}
    }
    
    void method3917(Class534_Sub40 class534_sub40, int i) {
	if (i == 1) {
	    int i_64_ = class534_sub40.method16529((byte) 1);
	    anIntArray2211 = new int[i_64_];
	    for (int i_65_ = 0; i_65_ < i_64_; i_65_++)
		anIntArray2211[i_65_] = class534_sub40.method16529((byte) 1);
	    anIntArray2209 = new int[i_64_];
	    for (int i_66_ = 0; i_66_ < i_64_; i_66_++)
		anIntArray2209[i_66_] = class534_sub40.method16529((byte) 1);
	    for (int i_67_ = 0; i_67_ < i_64_; i_67_++)
		anIntArray2209[i_67_] = (class534_sub40.method16529((byte) 1)
					 << 16) + anIntArray2209[i_67_];
	} else if (i == 2)
	    anInt2206 = class534_sub40.method16529((byte) 1) * -1861769857;
	else if (5 == i)
	    anInt2217 = class534_sub40.method16527(-101211017) * -1938491323;
	else if (6 == i)
	    anInt2219 = class534_sub40.method16529((byte) 1) * 2116456681;
	else if (7 == i)
	    anInt2228 = class534_sub40.method16529((byte) 1) * -1704094575;
	else if (8 == i)
	    anInt2220 = class534_sub40.method16527(-1395616083) * 1736090485;
	else if (i == 9)
	    anInt2221 = class534_sub40.method16527(1090460546) * -2082983731;
	else if (10 == i)
	    anInt2218 = class534_sub40.method16527(3894625) * 1084459067;
	else if (11 == i)
	    anInt2223 = class534_sub40.method16527(-1848742490) * -282961309;
	else if (12 == i || 112 == i) {
	    int i_68_;
	    if (i == 12)
		i_68_ = class534_sub40.method16527(-114756760);
	    else
		i_68_ = class534_sub40.method16529((byte) 1);
	    anIntArray2210 = new int[i_68_];
	    for (int i_69_ = 0; i_69_ < i_68_; i_69_++)
		anIntArray2210[i_69_] = class534_sub40.method16529((byte) 1);
	    for (int i_70_ = 0; i_70_ < i_68_; i_70_++)
		anIntArray2210[i_70_] = (class534_sub40.method16529((byte) 1)
					 << 16) + anIntArray2210[i_70_];
	} else if (i == 13) {
	    int i_71_ = class534_sub40.method16529((byte) 1);
	    anIntArrayArray2215 = new int[i_71_][];
	    for (int i_72_ = 0; i_72_ < i_71_; i_72_++) {
		int i_73_ = class534_sub40.method16527(-1632188663);
		if (i_73_ > 0) {
		    anIntArrayArray2215[i_72_] = new int[i_73_];
		    anIntArrayArray2215[i_72_][0]
			= class534_sub40.method16531(1161684942);
		    for (int i_74_ = 1; i_74_ < i_73_; i_74_++)
			anIntArrayArray2215[i_72_][i_74_]
			    = class534_sub40.method16529((byte) 1);
		}
	    }
	} else if (i == 14)
	    aBool2214 = true;
	else if (15 == i)
	    aBool2225 = true;
	else if (16 != i && 18 != i) {
	    if (i == 19 || i == 119) {
		if (anIntArray2216 == null) {
		    anIntArray2216 = new int[anIntArrayArray2215.length];
		    for (int i_75_ = 0; i_75_ < anIntArrayArray2215.length;
			 i_75_++)
			anIntArray2216[i_75_] = 255;
		}
		int i_76_;
		if (i == 19)
		    i_76_ = class534_sub40.method16527(-1083455283);
		else
		    i_76_ = class534_sub40.method16529((byte) 1);
		anIntArray2216[i_76_] = class534_sub40.method16527(-270910097);
	    } else if (i == 20 || i == 120) {
		if (null == anIntArray2227 || anIntArray2226 == null) {
		    anIntArray2227 = new int[anIntArrayArray2215.length];
		    anIntArray2226 = new int[anIntArrayArray2215.length];
		    for (int i_77_ = 0; i_77_ < anIntArrayArray2215.length;
			 i_77_++) {
			anIntArray2227[i_77_] = 256;
			anIntArray2226[i_77_] = 256;
		    }
		}
		int i_78_;
		if (20 == i)
		    i_78_ = class534_sub40.method16527(1434878208);
		else
		    i_78_ = class534_sub40.method16529((byte) 1);
		anIntArray2227[i_78_] = class534_sub40.method16529((byte) 1);
		anIntArray2226[i_78_] = class534_sub40.method16529((byte) 1);
	    } else if (i == 22)
		anInt2230
		    = class534_sub40.method16527(-387470071) * -2097961293;
	    else if (23 == i)
		class534_sub40.method16529((byte) 1);
	    else if (24 == i) {
		anInt2224 = class534_sub40.method16529((byte) 1) * 243170501;
		if (null != aClass206_2207)
		    aClass208_2213
			= ((Class208)
			   aClass206_2207.anInterface14_2231
			       .method91(anInt2224 * 2115215885, -116207186));
	    } else if (i == 249) {
		int i_79_ = class534_sub40.method16527(1465472039);
		if (null == aClass9_2229) {
		    int i_80_ = Class162.method2640(i_79_, (byte) 115);
		    aClass9_2229 = new Class9(i_80_);
		}
		for (int i_81_ = 0; i_81_ < i_79_; i_81_++) {
		    boolean bool
			= class534_sub40.method16527(-2059038141) == 1;
		    int i_82_ = class534_sub40.method16531(857783451);
		    Class534 class534;
		    if (bool)
			class534
			    = new Class534_Sub6(class534_sub40
						    .method16541((byte) -18));
		    else
			class534
			    = new Class534_Sub39(class534_sub40
						     .method16533(-258848859));
		    aClass9_2229.method581(class534, (long) i_82_);
		}
	    }
	}
    }
    
    void method3918(Class534_Sub40 class534_sub40, int i) {
	if (i == 1) {
	    int i_83_ = class534_sub40.method16529((byte) 1);
	    anIntArray2211 = new int[i_83_];
	    for (int i_84_ = 0; i_84_ < i_83_; i_84_++)
		anIntArray2211[i_84_] = class534_sub40.method16529((byte) 1);
	    anIntArray2209 = new int[i_83_];
	    for (int i_85_ = 0; i_85_ < i_83_; i_85_++)
		anIntArray2209[i_85_] = class534_sub40.method16529((byte) 1);
	    for (int i_86_ = 0; i_86_ < i_83_; i_86_++)
		anIntArray2209[i_86_] = (class534_sub40.method16529((byte) 1)
					 << 16) + anIntArray2209[i_86_];
	} else if (i == 2)
	    anInt2206 = class534_sub40.method16529((byte) 1) * -1861769857;
	else if (5 == i)
	    anInt2217 = class534_sub40.method16527(-1036544659) * -1938491323;
	else if (6 == i)
	    anInt2219 = class534_sub40.method16529((byte) 1) * 2116456681;
	else if (7 == i)
	    anInt2228 = class534_sub40.method16529((byte) 1) * -1704094575;
	else if (8 == i)
	    anInt2220 = class534_sub40.method16527(-578899813) * 1736090485;
	else if (i == 9)
	    anInt2221 = class534_sub40.method16527(-1157874095) * -2082983731;
	else if (10 == i)
	    anInt2218 = class534_sub40.method16527(-1323280794) * 1084459067;
	else if (11 == i)
	    anInt2223 = class534_sub40.method16527(1993989878) * -282961309;
	else if (12 == i || 112 == i) {
	    int i_87_;
	    if (i == 12)
		i_87_ = class534_sub40.method16527(1634143659);
	    else
		i_87_ = class534_sub40.method16529((byte) 1);
	    anIntArray2210 = new int[i_87_];
	    for (int i_88_ = 0; i_88_ < i_87_; i_88_++)
		anIntArray2210[i_88_] = class534_sub40.method16529((byte) 1);
	    for (int i_89_ = 0; i_89_ < i_87_; i_89_++)
		anIntArray2210[i_89_] = (class534_sub40.method16529((byte) 1)
					 << 16) + anIntArray2210[i_89_];
	} else if (i == 13) {
	    int i_90_ = class534_sub40.method16529((byte) 1);
	    anIntArrayArray2215 = new int[i_90_][];
	    for (int i_91_ = 0; i_91_ < i_90_; i_91_++) {
		int i_92_ = class534_sub40.method16527(1494696823);
		if (i_92_ > 0) {
		    anIntArrayArray2215[i_91_] = new int[i_92_];
		    anIntArrayArray2215[i_91_][0]
			= class534_sub40.method16531(420743044);
		    for (int i_93_ = 1; i_93_ < i_92_; i_93_++)
			anIntArrayArray2215[i_91_][i_93_]
			    = class534_sub40.method16529((byte) 1);
		}
	    }
	} else if (i == 14)
	    aBool2214 = true;
	else if (15 == i)
	    aBool2225 = true;
	else if (16 != i && 18 != i) {
	    if (i == 19 || i == 119) {
		if (anIntArray2216 == null) {
		    anIntArray2216 = new int[anIntArrayArray2215.length];
		    for (int i_94_ = 0; i_94_ < anIntArrayArray2215.length;
			 i_94_++)
			anIntArray2216[i_94_] = 255;
		}
		int i_95_;
		if (i == 19)
		    i_95_ = class534_sub40.method16527(-1072461334);
		else
		    i_95_ = class534_sub40.method16529((byte) 1);
		anIntArray2216[i_95_]
		    = class534_sub40.method16527(-2018566607);
	    } else if (i == 20 || i == 120) {
		if (null == anIntArray2227 || anIntArray2226 == null) {
		    anIntArray2227 = new int[anIntArrayArray2215.length];
		    anIntArray2226 = new int[anIntArrayArray2215.length];
		    for (int i_96_ = 0; i_96_ < anIntArrayArray2215.length;
			 i_96_++) {
			anIntArray2227[i_96_] = 256;
			anIntArray2226[i_96_] = 256;
		    }
		}
		int i_97_;
		if (20 == i)
		    i_97_ = class534_sub40.method16527(1603183346);
		else
		    i_97_ = class534_sub40.method16529((byte) 1);
		anIntArray2227[i_97_] = class534_sub40.method16529((byte) 1);
		anIntArray2226[i_97_] = class534_sub40.method16529((byte) 1);
	    } else if (i == 22)
		anInt2230
		    = class534_sub40.method16527(2145257240) * -2097961293;
	    else if (23 == i)
		class534_sub40.method16529((byte) 1);
	    else if (24 == i) {
		anInt2224 = class534_sub40.method16529((byte) 1) * 243170501;
		if (null != aClass206_2207)
		    aClass208_2213
			= ((Class208)
			   aClass206_2207.anInterface14_2231
			       .method91(anInt2224 * 2115215885, -993246242));
	    } else if (i == 249) {
		int i_98_ = class534_sub40.method16527(186657968);
		if (null == aClass9_2229) {
		    int i_99_ = Class162.method2640(i_98_, (byte) 28);
		    aClass9_2229 = new Class9(i_99_);
		}
		for (int i_100_ = 0; i_100_ < i_98_; i_100_++) {
		    boolean bool
			= class534_sub40.method16527(-1223745532) == 1;
		    int i_101_ = class534_sub40.method16531(1287431903);
		    Class534 class534;
		    if (bool)
			class534
			    = new Class534_Sub6(class534_sub40
						    .method16541((byte) -89));
		    else
			class534
			    = new Class534_Sub39(class534_sub40
						     .method16533(-258848859));
		    aClass9_2229.method581(class534, (long) i_101_);
		}
	    }
	}
    }
    
    void method3919(Class534_Sub40 class534_sub40, int i) {
	if (i == 1) {
	    int i_102_ = class534_sub40.method16529((byte) 1);
	    anIntArray2211 = new int[i_102_];
	    for (int i_103_ = 0; i_103_ < i_102_; i_103_++)
		anIntArray2211[i_103_] = class534_sub40.method16529((byte) 1);
	    anIntArray2209 = new int[i_102_];
	    for (int i_104_ = 0; i_104_ < i_102_; i_104_++)
		anIntArray2209[i_104_] = class534_sub40.method16529((byte) 1);
	    for (int i_105_ = 0; i_105_ < i_102_; i_105_++)
		anIntArray2209[i_105_] = (class534_sub40.method16529((byte) 1)
					  << 16) + anIntArray2209[i_105_];
	} else if (i == 2)
	    anInt2206 = class534_sub40.method16529((byte) 1) * -1861769857;
	else if (5 == i)
	    anInt2217 = class534_sub40.method16527(-462849027) * -1938491323;
	else if (6 == i)
	    anInt2219 = class534_sub40.method16529((byte) 1) * 2116456681;
	else if (7 == i)
	    anInt2228 = class534_sub40.method16529((byte) 1) * -1704094575;
	else if (8 == i)
	    anInt2220 = class534_sub40.method16527(-1991463421) * 1736090485;
	else if (i == 9)
	    anInt2221 = class534_sub40.method16527(1402038381) * -2082983731;
	else if (10 == i)
	    anInt2218 = class534_sub40.method16527(1633613733) * 1084459067;
	else if (11 == i)
	    anInt2223 = class534_sub40.method16527(1318886179) * -282961309;
	else if (12 == i || 112 == i) {
	    int i_106_;
	    if (i == 12)
		i_106_ = class534_sub40.method16527(1025030229);
	    else
		i_106_ = class534_sub40.method16529((byte) 1);
	    anIntArray2210 = new int[i_106_];
	    for (int i_107_ = 0; i_107_ < i_106_; i_107_++)
		anIntArray2210[i_107_] = class534_sub40.method16529((byte) 1);
	    for (int i_108_ = 0; i_108_ < i_106_; i_108_++)
		anIntArray2210[i_108_] = (class534_sub40.method16529((byte) 1)
					  << 16) + anIntArray2210[i_108_];
	} else if (i == 13) {
	    int i_109_ = class534_sub40.method16529((byte) 1);
	    anIntArrayArray2215 = new int[i_109_][];
	    for (int i_110_ = 0; i_110_ < i_109_; i_110_++) {
		int i_111_ = class534_sub40.method16527(390724258);
		if (i_111_ > 0) {
		    anIntArrayArray2215[i_110_] = new int[i_111_];
		    anIntArrayArray2215[i_110_][0]
			= class534_sub40.method16531(1303727874);
		    for (int i_112_ = 1; i_112_ < i_111_; i_112_++)
			anIntArrayArray2215[i_110_][i_112_]
			    = class534_sub40.method16529((byte) 1);
		}
	    }
	} else if (i == 14)
	    aBool2214 = true;
	else if (15 == i)
	    aBool2225 = true;
	else if (16 != i && 18 != i) {
	    if (i == 19 || i == 119) {
		if (anIntArray2216 == null) {
		    anIntArray2216 = new int[anIntArrayArray2215.length];
		    for (int i_113_ = 0; i_113_ < anIntArrayArray2215.length;
			 i_113_++)
			anIntArray2216[i_113_] = 255;
		}
		int i_114_;
		if (i == 19)
		    i_114_ = class534_sub40.method16527(-688555876);
		else
		    i_114_ = class534_sub40.method16529((byte) 1);
		anIntArray2216[i_114_]
		    = class534_sub40.method16527(-629668974);
	    } else if (i == 20 || i == 120) {
		if (null == anIntArray2227 || anIntArray2226 == null) {
		    anIntArray2227 = new int[anIntArrayArray2215.length];
		    anIntArray2226 = new int[anIntArrayArray2215.length];
		    for (int i_115_ = 0; i_115_ < anIntArrayArray2215.length;
			 i_115_++) {
			anIntArray2227[i_115_] = 256;
			anIntArray2226[i_115_] = 256;
		    }
		}
		int i_116_;
		if (20 == i)
		    i_116_ = class534_sub40.method16527(-1977410690);
		else
		    i_116_ = class534_sub40.method16529((byte) 1);
		anIntArray2227[i_116_] = class534_sub40.method16529((byte) 1);
		anIntArray2226[i_116_] = class534_sub40.method16529((byte) 1);
	    } else if (i == 22)
		anInt2230
		    = class534_sub40.method16527(-711663967) * -2097961293;
	    else if (23 == i)
		class534_sub40.method16529((byte) 1);
	    else if (24 == i) {
		anInt2224 = class534_sub40.method16529((byte) 1) * 243170501;
		if (null != aClass206_2207)
		    aClass208_2213
			= ((Class208)
			   aClass206_2207.anInterface14_2231
			       .method91(anInt2224 * 2115215885, 993363744));
	    } else if (i == 249) {
		int i_117_ = class534_sub40.method16527(2085941440);
		if (null == aClass9_2229) {
		    int i_118_ = Class162.method2640(i_117_, (byte) 123);
		    aClass9_2229 = new Class9(i_118_);
		}
		for (int i_119_ = 0; i_119_ < i_117_; i_119_++) {
		    boolean bool = class534_sub40.method16527(-622329021) == 1;
		    int i_120_ = class534_sub40.method16531(1127729189);
		    Class534 class534;
		    if (bool)
			class534
			    = new Class534_Sub6(class534_sub40
						    .method16541((byte) -37));
		    else
			class534
			    = new Class534_Sub39(class534_sub40
						     .method16533(-258848859));
		    aClass9_2229.method581(class534, (long) i_120_);
		}
	    }
	}
    }
    
    public int method3920(int i, int i_121_) {
	if (aClass9_2229 == null)
	    return i_121_;
	Class534_Sub39 class534_sub39
	    = (Class534_Sub39) aClass9_2229.method579((long) i);
	if (null == class534_sub39)
	    return i_121_;
	return class534_sub39.anInt10807 * -705967177;
    }
    
    public void method83() {
	if (-1 == 716389381 * anInt2221) {
	    if (aClass208_2213 != null
		&& aClass208_2213.aBoolArray2240 != null)
		anInt2221 = 128999834;
	    else
		anInt2221 = 0;
	}
	if (anInt2218 * -492433165 == -1) {
	    if (null != aClass208_2213
		&& aClass208_2213.aBoolArray2240 != null)
		anInt2218 = -2126049162;
	    else
		anInt2218 = 0;
	}
	if (anIntArray2211 != null) {
	    anInt2212 = 0;
	    for (int i = 0; i < anIntArray2211.length; i++)
		anInt2212 += -1346711357 * anIntArray2211[i];
	}
    }
    
    public void method84() {
	if (-1 == 716389381 * anInt2221) {
	    if (aClass208_2213 != null
		&& aClass208_2213.aBoolArray2240 != null)
		anInt2221 = 128999834;
	    else
		anInt2221 = 0;
	}
	if (anInt2218 * -492433165 == -1) {
	    if (null != aClass208_2213
		&& aClass208_2213.aBoolArray2240 != null)
		anInt2218 = -2126049162;
	    else
		anInt2218 = 0;
	}
	if (anIntArray2211 != null) {
	    anInt2212 = 0;
	    for (int i = 0; i < anIntArray2211.length; i++)
		anInt2212 += -1346711357 * anIntArray2211[i];
	}
    }
    
    public String method3921(int i, String string, int i_122_) {
	if (null == aClass9_2229)
	    return string;
	Class534_Sub6 class534_sub6
	    = (Class534_Sub6) aClass9_2229.method579((long) i);
	if (class534_sub6 == null)
	    return string;
	return (String) class534_sub6.anObject10417;
    }
    
    public int method3922(int i, int i_123_) {
	if (aClass9_2229 == null)
	    return i_123_;
	Class534_Sub39 class534_sub39
	    = (Class534_Sub39) aClass9_2229.method579((long) i);
	if (null == class534_sub39)
	    return i_123_;
	return class534_sub39.anInt10807 * -705967177;
    }
    
    public String method3923(int i, String string) {
	if (null == aClass9_2229)
	    return string;
	Class534_Sub6 class534_sub6
	    = (Class534_Sub6) aClass9_2229.method579((long) i);
	if (class534_sub6 == null)
	    return string;
	return (String) class534_sub6.anObject10417;
    }
    
    static final void method3924(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = -1857977261 * Class554_Sub1.anInt10671 == 100 ? 1 : 0;
    }
}
