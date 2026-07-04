/* Class307 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Arrays;

public class Class307 implements Interface13
{
    public byte aByte3274;
    public static final int anInt3275 = 8;
    public boolean aBool3276;
    Class304 aClass304_3277;
    Interface14 anInterface14_3278;
    public int anInt3279;
    public boolean aBool3280;
    public boolean aBool3281;
    public int[] anIntArray3282;
    public int[] anIntArray3283;
    public int[] anIntArray3284;
    public static short[] aShortArray3285 = new short[256];
    public String[] aStringArray3286;
    public short[] aShortArray3287;
    byte[] aByteArray3288;
    short[] aShortArray3289;
    public short[] aShortArray3290;
    public byte[] aByteArray3291;
    int anInt3292;
    byte aByte3293;
    byte aByte3294;
    public int anInt3295;
    byte aByte3296;
    int anInt3297;
    int[] anIntArray3298;
    public int anInt3299;
    public boolean aBool3300;
    public int anInt3301;
    int anInt3302;
    int anInt3303;
    public int anInt3304;
    public boolean aBool3305;
    public short aShort3306;
    int anInt3307;
    static final int anInt3308 = 6;
    public int[] anIntArray3309;
    public int anInt3310;
    byte aByte3311;
    public int anInt3312;
    public boolean aBool3313;
    short[] aShortArray3314;
    public byte aByte3315;
    public int anInt3316;
    public boolean aBool3317;
    public short[] aShortArray3318;
    public short aShort3319;
    public int anInt3320;
    public byte[] aByteArray3321;
    public byte aByte3322;
    public short aShort3323;
    public byte aByte3324;
    public Class686 aClass686_3325;
    public static final int anInt3326 = 1;
    public static final int anInt3327 = 2;
    public int anInt3328;
    public int anInt3329;
    public int anInt3330;
    public int anInt3331;
    public int anInt3332;
    Class9 aClass9_3333;
    public int anInt3334;
    int anInt3335;
    int[][] anIntArrayArray3336;
    public String aString3337 = "null";
    public int anInt3338;
    public int[] anIntArray3339;
    public byte aByte3340;
    public int anInt3341;
    public Class432 aClass432_3342;
    public int anInt3343;
    public int anInt3344;
    public int anInt3345;
    public boolean aBool3346;
    public int anInt3347;
    public boolean aBool3348;
    public static Class44_Sub15 aClass44_Sub15_3349;
    
    public String method5608(int i, String string, int i_0_) {
	if (aClass9_3333 == null)
	    return string;
	Class534_Sub6 class534_sub6
	    = (Class534_Sub6) aClass9_3333.method579((long) i);
	if (class534_sub6 == null)
	    return string;
	return (String) class534_sub6.anObject10417;
    }
    
    public void method79(Class534_Sub40 class534_sub40, byte i) {
	for (;;) {
	    int i_1_ = class534_sub40.method16527(-1554405916);
	    if (0 == i_1_)
		break;
	    method5609(class534_sub40, i_1_, -1932582213);
	}
    }
    
    void method5609(Class534_Sub40 class534_sub40, int i, int i_2_) {
	if (1 == i) {
	    int i_3_ = class534_sub40.method16527(1726247541);
	    anIntArray3282 = new int[i_3_];
	    for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
		anIntArray3282[i_4_] = class534_sub40.method16550((byte) -93);
	} else if (i == 2)
	    aString3337 = class534_sub40.method16541((byte) -20);
	else if (12 == i)
	    anInt3328 = class534_sub40.method16527(-1172605950) * 1054305681;
	else if (i >= 30 && i < 35)
	    aStringArray3286[i - 30] = class534_sub40.method16541((byte) -74);
	else if (40 == i) {
	    int i_5_ = class534_sub40.method16527(-1646825126);
	    aShortArray3314 = new short[i_5_];
	    aShortArray3287 = new short[i_5_];
	    for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
		aShortArray3314[i_6_]
		    = (short) class534_sub40.method16529((byte) 1);
		aShortArray3287[i_6_]
		    = (short) class534_sub40.method16529((byte) 1);
	    }
	} else if (41 == i) {
	    int i_7_ = class534_sub40.method16527(-1500585910);
	    aShortArray3289 = new short[i_7_];
	    aShortArray3290 = new short[i_7_];
	    for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
		aShortArray3289[i_8_]
		    = (short) class534_sub40.method16529((byte) 1);
		aShortArray3290[i_8_]
		    = (short) class534_sub40.method16529((byte) 1);
	    }
	} else if (i == 42) {
	    int i_9_ = class534_sub40.method16527(2118704244);
	    aByteArray3288 = new byte[i_9_];
	    for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
		aByteArray3288[i_10_] = class534_sub40.method16586((byte) 1);
	} else if (i == 44) {
	    int i_11_ = class534_sub40.method16529((byte) 1);
	    int i_12_ = 0;
	    for (int i_13_ = i_11_; i_13_ > 0; i_13_ >>= 1)
		i_12_++;
	    aByteArray3291 = new byte[i_12_];
	    byte i_14_ = 0;
	    for (int i_15_ = 0; i_15_ < i_12_; i_15_++) {
		if ((i_11_ & 1 << i_15_) > 0) {
		    aByteArray3291[i_15_] = i_14_;
		    i_14_++;
		} else
		    aByteArray3291[i_15_] = (byte) -1;
	    }
	} else if (45 == i) {
	    int i_16_ = class534_sub40.method16529((byte) 1);
	    int i_17_ = 0;
	    for (int i_18_ = i_16_; i_18_ > 0; i_18_ >>= 1)
		i_17_++;
	    aByteArray3321 = new byte[i_17_];
	    byte i_19_ = 0;
	    for (int i_20_ = 0; i_20_ < i_17_; i_20_++) {
		if ((i_16_ & 1 << i_20_) > 0) {
		    aByteArray3321[i_20_] = i_19_;
		    i_19_++;
		} else
		    aByteArray3321[i_20_] = (byte) -1;
	    }
	} else if (i == 60) {
	    int i_21_ = class534_sub40.method16527(-1466388114);
	    anIntArray3283 = new int[i_21_];
	    for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
		anIntArray3283[i_22_] = class534_sub40.method16550((byte) -93);
	} else if (i == 93)
	    aBool3300 = false;
	else if (95 == i)
	    anInt3301 = class534_sub40.method16529((byte) 1) * 1863678927;
	else if (i == 97)
	    anInt3302 = class534_sub40.method16529((byte) 1) * -1022455525;
	else if (98 == i)
	    anInt3303 = class534_sub40.method16529((byte) 1) * -1392672857;
	else if (99 == i)
	    aBool3276 = true;
	else if (i == 100)
	    anInt3307 = class534_sub40.method16586((byte) 1) * -412400947;
	else if (i == 101)
	    anInt3292 = class534_sub40.method16586((byte) 1) * 1679047953;
	else if (102 == i) {
	    int i_23_ = class534_sub40.method16527(23009897);
	    int i_24_ = 0;
	    for (int i_25_ = i_23_; 0 != i_25_; i_25_ >>= 1)
		i_24_++;
	    anIntArray3309 = new int[i_24_];
	    aShortArray3318 = new short[i_24_];
	    for (int i_26_ = 0; i_26_ < i_24_; i_26_++) {
		if (0 == (i_23_ & 1 << i_26_)) {
		    anIntArray3309[i_26_] = -1;
		    aShortArray3318[i_26_] = (short) -1;
		} else {
		    anIntArray3309[i_26_]
			= class534_sub40.method16550((byte) -3);
		    aShortArray3318[i_26_]
			= (short) class534_sub40.method16547(-1641213930);
		}
	    }
	} else if (i == 103)
	    anInt3312 = class534_sub40.method16529((byte) 1) * 1524082329;
	else if (106 == i || i == 118) {
	    anInt3335 = class534_sub40.method16529((byte) 1) * 1869867087;
	    if (1545219759 * anInt3335 == 65535)
		anInt3335 = -1869867087;
	    anInt3297 = class534_sub40.method16529((byte) 1) * -259747351;
	    if (1436374617 * anInt3297 == 65535)
		anInt3297 = 259747351;
	    int i_27_ = -1;
	    if (118 == i) {
		i_27_ = class534_sub40.method16529((byte) 1);
		if (65535 == i_27_)
		    i_27_ = -1;
	    }
	    int i_28_ = class534_sub40.method16527(725186139);
	    anIntArray3284 = new int[i_28_ + 2];
	    for (int i_29_ = 0; i_29_ <= i_28_; i_29_++) {
		anIntArray3284[i_29_] = class534_sub40.method16529((byte) 1);
		if (65535 == anIntArray3284[i_29_])
		    anIntArray3284[i_29_] = -1;
	    }
	    anIntArray3284[1 + i_28_] = i_27_;
	} else if (i == 107)
	    aBool3313 = false;
	else if (109 == i)
	    aBool3317 = false;
	else if (111 == i)
	    aBool3281 = false;
	else if (i == 113) {
	    aShort3319 = (short) class534_sub40.method16529((byte) 1);
	    aShort3306 = (short) class534_sub40.method16529((byte) 1);
	} else if (i == 114) {
	    aByte3315 = class534_sub40.method16586((byte) 1);
	    aByte3322 = class534_sub40.method16586((byte) 1);
	} else if (119 == i)
	    aByte3274 = class534_sub40.method16586((byte) 1);
	else if (i == 121) {
	    anIntArrayArray3336 = new int[anIntArray3282.length][];
	    int i_30_ = class534_sub40.method16527(-547875610);
	    for (int i_31_ = 0; i_31_ < i_30_; i_31_++) {
		int i_32_ = class534_sub40.method16527(-1961579251);
		int[] is = anIntArrayArray3336[i_32_] = new int[3];
		is[0] = class534_sub40.method16586((byte) 1);
		is[1] = class534_sub40.method16586((byte) 1);
		is[2] = class534_sub40.method16586((byte) 1);
	    }
	} else if (123 == i)
	    anInt3316 = class534_sub40.method16529((byte) 1) * -987716523;
	else if (i == 125)
	    aClass686_3325
		= ((Class686)
		   Class448.method7319(Class225.method4173(-1506893836),
				       class534_sub40.method16586((byte) 1),
				       2088438307));
	else if (127 == i)
	    anInt3310 = class534_sub40.method16529((byte) 1) * -990646495;
	else if (128 == i)
	    Class448.method7319(Class676.method11130((byte) -13),
				class534_sub40.method16527(310133736),
				2088438307);
	else if (i == 134) {
	    anInt3304 = class534_sub40.method16529((byte) 1) * 834215525;
	    if (65535 == 1315529581 * anInt3304)
		anInt3304 = -834215525;
	    anInt3329 = class534_sub40.method16529((byte) 1) * -481837541;
	    if (65535 == 1912925203 * anInt3329)
		anInt3329 = 481837541;
	    anInt3330 = class534_sub40.method16529((byte) 1) * 1043217285;
	    if (65535 == anInt3330 * 1144816973)
		anInt3330 = -1043217285;
	    anInt3331 = class534_sub40.method16529((byte) 1) * -1596236055;
	    if (-306882215 * anInt3331 == 65535)
		anInt3331 = 1596236055;
	    anInt3332 = class534_sub40.method16527(-929986980) * -955680361;
	} else if (135 == i || 136 == i) {
	    class534_sub40.method16527(-600498668);
	    class534_sub40.method16529((byte) 1);
	} else if (i == 137)
	    anInt3299 = class534_sub40.method16529((byte) 1) * -336530599;
	else if (i == 138)
	    anInt3320 = class534_sub40.method16550((byte) -23) * 910648041;
	else if (140 == i)
	    anInt3334 = class534_sub40.method16527(-596502838) * 1556518139;
	else if (i == 141)
	    aBool3280 = true;
	else if (142 == i)
	    anInt3338 = class534_sub40.method16529((byte) 1) * -1040460371;
	else if (143 == i)
	    aBool3305 = true;
	else if (i >= 150 && i < 155) {
	    aStringArray3286[i - 150] = class534_sub40.method16541((byte) -85);
	    if (!aClass304_3277.aBool3258)
		aStringArray3286[i - 150] = null;
	} else if (155 == i) {
	    aByte3293 = class534_sub40.method16586((byte) 1);
	    aByte3294 = class534_sub40.method16586((byte) 1);
	    aByte3296 = class534_sub40.method16586((byte) 1);
	    aByte3311 = class534_sub40.method16586((byte) 1);
	} else if (158 == i)
	    aByte3340 = (byte) 1;
	else if (159 == i)
	    aByte3340 = (byte) 0;
	else if (160 == i) {
	    int i_33_ = class534_sub40.method16527(-319275517);
	    anIntArray3339 = new int[i_33_];
	    for (int i_34_ = 0; i_34_ < i_33_; i_34_++)
		anIntArray3339[i_34_] = class534_sub40.method16529((byte) 1);
	} else if (i != 162) {
	    if (i == 163)
		anInt3341
		    = class534_sub40.method16527(-2068134821) * -507210193;
	    else if (i == 164) {
		anInt3343 = class534_sub40.method16529((byte) 1) * 1494484643;
		anInt3344 = class534_sub40.method16529((byte) 1) * -2117460245;
	    } else if (165 == i)
		anInt3345
		    = class534_sub40.method16527(-411202413) * 1906704249;
	    else if (i == 168)
		anInt3295
		    = class534_sub40.method16527(1368441183) * 1588450707;
	    else if (169 == i)
		aBool3346 = false;
	    else if (i >= 170 && i < 176) {
		if (anIntArray3298 == null) {
		    anIntArray3298 = new int[6];
		    Arrays.fill(anIntArray3298, -1);
		}
		int i_35_ = class534_sub40.method16529((byte) 1);
		if (65535 == i_35_)
		    i_35_ = -1;
		anIntArray3298[i - 170] = i_35_;
	    } else if (i != 178) {
		if (179 == i) {
		    aClass432_3342 = new Class432();
		    aClass432_3342.aFloat4847
			= (float) class534_sub40.method16545((byte) -106);
		    aClass432_3342.aFloat4845
			= (float) class534_sub40.method16545((byte) -101);
		    aClass432_3342.aFloat4844
			= (float) class534_sub40.method16545((byte) -77);
		    aClass432_3342.aFloat4848
			= (float) class534_sub40.method16545((byte) -121);
		    aClass432_3342.aFloat4850
			= (float) class534_sub40.method16545((byte) -97);
		    aClass432_3342.aFloat4849
			= (float) class534_sub40.method16545((byte) -53);
		} else if (180 == i)
		    anInt3347 = (class534_sub40.method16527(-1496596423)
				 & 0xff) * 1137260381;
		else if (181 == i) {
		    aShort3323 = (short) class534_sub40.method16529((byte) 1);
		    aByte3324 = (byte) class534_sub40.method16527(-615291841);
		} else if (182 == i)
		    aBool3348 = true;
		else if (249 == i) {
		    int i_36_ = class534_sub40.method16527(-1710522037);
		    if (null == aClass9_3333) {
			int i_37_ = Class162.method2640(i_36_, (byte) 65);
			aClass9_3333 = new Class9(i_37_);
		    }
		    for (int i_38_ = 0; i_38_ < i_36_; i_38_++) {
			boolean bool
			    = class534_sub40.method16527(-1985926058) == 1;
			int i_39_ = class534_sub40.method16531(225728517);
			Class534 class534;
			if (bool)
			    class534
				= (new Class534_Sub6
				   (class534_sub40.method16541((byte) -92)));
			else
			    class534
				= (new Class534_Sub39
				   (class534_sub40.method16533(-258848859)));
			aClass9_3333.method581(class534, (long) i_39_);
		    }
		}
	    }
	}
    }
    
    public void method84() {
	if (null == anIntArray3282)
	    anIntArray3282 = new int[0];
	if (-1 == aByte3340) {
	    if (null == aClass304_3277
		|| Class675.aClass675_8634 == aClass304_3277.aClass675_3257)
		aByte3340 = (byte) 1;
	    else
		aByte3340 = (byte) 0;
	}
    }
    
    public final Class183 method5610
	(Class185 class185, int i, Class44_Sub14 class44_sub14,
	 Interface18 interface18, Interface20 interface20, Class711 class711,
	 Class711 class711_40_, Class711[] class711s, int[] is, int i_41_,
	 Class301 class301, int i_42_) {
	return method5622(class185, i, class44_sub14, interface18, interface20,
			  class711, class711_40_, class711s, is, i_41_,
			  class301, anInt3310 * 1789154529, true, -909295235);
    }
    
    public boolean method5611(Interface18 interface18,
			      Interface20 interface20) {
	if (anIntArray3284 == null)
	    return true;
	int i = -1;
	if (-1 != 1545219759 * anInt3335) {
	    Class318 class318
		= interface18.method107(1545219759 * anInt3335, 1504047109);
	    if (null != class318)
		i = interface20.method119(class318, -1297809486);
	} else if (-1 != anInt3297 * 1436374617) {
	    Class150 class150
		= interface18.method108(Class453.aClass453_4946,
					anInt3297 * 1436374617, 1562360451);
	    if (class150 != null)
		i = interface20.method120(class150, (byte) -24);
	}
	if (i < 0 || i >= anIntArray3284.length - 1) {
	    int i_43_ = anIntArray3284[anIntArray3284.length - 1];
	    if (i_43_ != -1)
		return true;
	    return false;
	}
	if (-1 == anIntArray3284[i])
	    return false;
	return true;
    }
    
    public void method83() {
	if (null == anIntArray3282)
	    anIntArray3282 = new int[0];
	if (-1 == aByte3340) {
	    if (null == aClass304_3277
		|| Class675.aClass675_8634 == aClass304_3277.aClass675_3257)
		aByte3340 = (byte) 1;
	    else
		aByte3340 = (byte) 0;
	}
    }
    
    public final boolean method5612(int i) {
	if (null == anIntArray3282)
	    return true;
	boolean bool = true;
	int[] is = anIntArray3282;
	for (int i_44_ = 0; i_44_ < is.length; i_44_++) {
	    int i_45_ = is[i_44_];
	    if (!aClass304_3277.aClass472_3256.method7669(i_45_, 0,
							  1804616883))
		bool = false;
	}
	return bool;
    }
    
    public int method5613(int i, int i_46_, int i_47_) {
	if (aClass9_3333 == null)
	    return i_46_;
	Class534_Sub39 class534_sub39
	    = (Class534_Sub39) aClass9_3333.method579((long) i);
	if (class534_sub39 == null)
	    return i_46_;
	return class534_sub39.anInt10807 * -705967177;
    }
    
    public boolean method5614(Interface18 interface18,
			      Interface20 interface20) {
	if (anIntArray3284 == null)
	    return true;
	int i = -1;
	if (-1 != 1545219759 * anInt3335) {
	    Class318 class318
		= interface18.method107(1545219759 * anInt3335, 1504047109);
	    if (null != class318)
		i = interface20.method119(class318, -1905958911);
	} else if (-1 != anInt3297 * 1436374617) {
	    Class150 class150
		= interface18.method108(Class453.aClass453_4946,
					anInt3297 * 1436374617, 1753190763);
	    if (class150 != null)
		i = interface20.method120(class150, (byte) -6);
	}
	if (i < 0 || i >= anIntArray3284.length - 1) {
	    int i_48_ = anIntArray3284[anIntArray3284.length - 1];
	    if (i_48_ != -1)
		return true;
	    return false;
	}
	if (-1 == anIntArray3284[i])
	    return false;
	return true;
    }
    
    public final Class307 method5615(Interface18 interface18,
				     Interface20 interface20, int i) {
	int i_49_ = -1;
	if (-1 != anInt3335 * 1545219759) {
	    Class318 class318
		= interface18.method107(1545219759 * anInt3335, 1504047109);
	    if (null != class318)
		i_49_ = interface20.method119(class318, -1988502668);
	} else if (-1 != 1436374617 * anInt3297) {
	    Class150 class150
		= interface18.method108(Class453.aClass453_4946,
					1436374617 * anInt3297, 1652490869);
	    if (class150 != null)
		i_49_ = interface20.method120(class150, (byte) -59);
	}
	if (i_49_ < 0 || i_49_ >= anIntArray3284.length - 1) {
	    int i_50_ = anIntArray3284[anIntArray3284.length - 1];
	    if (-1 != i_50_)
		return ((Class307)
			anInterface14_3278.method91(i_50_, 450014392));
	    return null;
	}
	if (-1 == anIntArray3284[i_49_])
	    return null;
	return (Class307) anInterface14_3278.method91(anIntArray3284[i_49_],
						      -1330222553);
    }
    
    public boolean method5616(Interface18 interface18, Interface20 interface20,
			      int i) {
	if (anIntArray3284 == null)
	    return true;
	int i_51_ = -1;
	if (-1 != 1545219759 * anInt3335) {
	    Class318 class318
		= interface18.method107(1545219759 * anInt3335, 1504047109);
	    if (null != class318)
		i_51_ = interface20.method119(class318, -1399495907);
	} else if (-1 != anInt3297 * 1436374617) {
	    Class150 class150
		= interface18.method108(Class453.aClass453_4946,
					anInt3297 * 1436374617, 1654679112);
	    if (class150 != null)
		i_51_ = interface20.method120(class150, (byte) -109);
	}
	if (i_51_ < 0 || i_51_ >= anIntArray3284.length - 1) {
	    int i_52_ = anIntArray3284[anIntArray3284.length - 1];
	    if (i_52_ != -1)
		return true;
	    return false;
	}
	if (-1 == anIntArray3284[i_51_])
	    return false;
	return true;
    }
    
    Class307(int i, Class304 class304, Interface14 interface14) {
	anInt3328 = 1054305681;
	anInt3310 = 990646495;
	aByte3311 = (byte) 0;
	anInt3299 = 336530599;
	aBool3300 = true;
	anInt3301 = -1863678927;
	anInt3302 = -2025288320;
	anInt3303 = 2126500736;
	aBool3276 = false;
	aBool3305 = false;
	aBool3280 = false;
	anInt3307 = 0;
	anInt3292 = 0;
	anIntArray3309 = null;
	aShortArray3318 = null;
	anInt3320 = -910648041;
	anInt3312 = 1525994272;
	anInt3335 = -1869867087;
	anInt3297 = 259747351;
	aBool3313 = true;
	aBool3317 = true;
	aBool3281 = true;
	aShort3319 = (short) 0;
	aShort3306 = (short) 0;
	aByte3315 = (byte) -96;
	aByte3322 = (byte) -16;
	aShort3323 = (short) -1;
	aByte3324 = (byte) 0;
	aByte3274 = (byte) 0;
	anInt3304 = -834215525;
	anInt3329 = 481837541;
	anInt3330 = -1043217285;
	anInt3331 = 1596236055;
	anInt3332 = 0;
	anInt3295 = 0;
	anInt3334 = 1775134213;
	anInt3316 = 987716523;
	aClass686_3325 = Class686.aClass686_8701;
	anInt3338 = 1040460371;
	aByte3340 = (byte) -1;
	anInt3341 = 507210193;
	anInt3343 = 335979264;
	anInt3344 = -903943424;
	anInt3345 = 0;
	aBool3346 = true;
	anInt3347 = 0;
	aBool3348 = false;
	anInt3279 = i * 1992675663;
	aClass304_3277 = class304;
	anInterface14_3278 = interface14;
	aStringArray3286 = (String[]) aClass304_3277.aStringArray3260.clone();
    }
    
    public int method5617(int i, int i_53_) {
	if (null == anIntArray3298)
	    return -1;
	return anIntArray3298[i];
    }
    
    public final boolean method5618() {
	if (null == anIntArray3282)
	    return true;
	boolean bool = true;
	int[] is = anIntArray3282;
	for (int i = 0; i < is.length; i++) {
	    int i_54_ = is[i];
	    if (!aClass304_3277.aClass472_3256.method7669(i_54_, 0,
							  1804616883))
		bool = false;
	}
	return bool;
    }
    
    public void method82(int i) {
	if (null == anIntArray3282)
	    anIntArray3282 = new int[0];
	if (-1 == aByte3340) {
	    if (null == aClass304_3277
		|| Class675.aClass675_8634 == aClass304_3277.aClass675_3257)
		aByte3340 = (byte) 1;
	    else
		aByte3340 = (byte) 0;
	}
    }
    
    public void method78(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(724976568);
	    if (0 == i)
		break;
	    method5609(class534_sub40, i, -2061409105);
	}
    }
    
    public void method81(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(222094194);
	    if (0 == i)
		break;
	    method5609(class534_sub40, i, -2069934480);
	}
    }
    
    public final Class183 method5619
	(Class185 class185, int i, Interface18 interface18,
	 Interface20 interface20, Class711 class711, Class301 class301) {
	if (null != anIntArray3284) {
	    Class307 class307_55_
		= method5615(interface18, interface20, -1466068515);
	    if (class307_55_ == null)
		return null;
	    return class307_55_.method5630(class185, i, interface18,
					   interface20, class711, class301,
					   (byte) 34);
	}
	if (null == anIntArray3283
	    && (null == class301 || class301.anIntArray3233 == null))
	    return null;
	int i_56_ = i;
	if (class711 != null)
	    i_56_ |= class711.method14360((short) -22629);
	long l = (long) (-4020817 * anInt3279
			 | class185.anInt2001 * 2098753835 << 16);
	if (null != class301)
	    l |= class301.aLong3238 * -4758975763701750077L << 24;
	Class183 class183;
	synchronized (aClass304_3277.aClass203_3254) {
	    class183 = (Class183) aClass304_3277.aClass203_3254.method3871(l);
	}
	if (class183 == null || (class183.method3101() & i_56_) != i_56_) {
	    if (class183 != null)
		i_56_ |= class183.method3101();
	    int i_57_ = i_56_;
	    if (aShortArray3314 != null)
		i_57_ |= 0x4000;
	    if (aShortArray3289 != null)
		i_57_ |= 0x8000;
	    if (aByte3311 != 0)
		i_57_ |= 0x80000;
	    int[] is = (null != class301 && class301.anIntArray3233 != null
			? class301.anIntArray3233 : anIntArray3283);
	    boolean bool = false;
	    synchronized (aClass304_3277.aClass472_3256) {
		for (int i_58_ = 0; i_58_ < is.length; i_58_++) {
		    if (!aClass304_3277.aClass472_3256.method7669(is[i_58_], 0,
								  1804616883))
			bool = true;
		}
	    }
	    if (bool)
		return null;
	    Class187[] class187s = new Class187[is.length];
	    synchronized (aClass304_3277.aClass472_3256) {
		for (int i_59_ = 0; i_59_ < is.length; i_59_++)
		    class187s[i_59_]
			= Class187.method3709(aClass304_3277.aClass472_3256,
					      is[i_59_], 0);
	    }
	    for (int i_60_ = 0; i_60_ < is.length; i_60_++) {
		if (null != class187s[i_60_]
		    && class187s[i_60_].anInt2082 < 13)
		    class187s[i_60_].method3723(2);
	    }
	    Class187 class187;
	    if (class187s.length == 1)
		class187 = class187s[0];
	    else
		class187 = new Class187(class187s, class187s.length);
	    class183
		= class185.method3329(class187, i_57_,
				      aClass304_3277.anInt3259 * 388756143, 64,
				      768);
	    if (null != aShortArray3314) {
		short[] is_61_;
		if (null != class301 && class301.aShortArray3232 != null)
		    is_61_ = class301.aShortArray3232;
		else
		    is_61_ = aShortArray3287;
		for (int i_62_ = 0; i_62_ < aShortArray3314.length; i_62_++) {
		    if (null != aByteArray3288
			&& i_62_ < aByteArray3288.length)
			class183.method3056(aShortArray3314[i_62_],
					    (aShortArray3285
					     [aByteArray3288[i_62_] & 0xff]));
		    else
			class183.method3056(aShortArray3314[i_62_],
					    is_61_[i_62_]);
		}
	    }
	    if (null != aShortArray3289) {
		short[] is_63_;
		if (null != class301 && null != class301.aShortArray3237)
		    is_63_ = class301.aShortArray3237;
		else
		    is_63_ = aShortArray3290;
		for (int i_64_ = 0; i_64_ < aShortArray3289.length; i_64_++)
		    class183.method3118(aShortArray3289[i_64_], is_63_[i_64_]);
	    }
	    if (aByte3311 != 0)
		class183.method3058(aByte3293, aByte3294, aByte3296,
				    aByte3311 & 0xff);
	    class183.method3012(i_56_);
	    synchronized (aClass304_3277.aClass203_3254) {
		aClass304_3277.aClass203_3254.method3893(class183, l);
	    }
	}
	if (class711 != null) {
	    class183 = class183.method3011((byte) 1, i_56_, true);
	    class711.method14399(class183, 0, 1597910698);
	}
	class183.method3012(i);
	return class183;
    }
    
    void method5620(Class534_Sub40 class534_sub40, int i) {
	if (1 == i) {
	    int i_65_ = class534_sub40.method16527(-1650504181);
	    anIntArray3282 = new int[i_65_];
	    for (int i_66_ = 0; i_66_ < i_65_; i_66_++)
		anIntArray3282[i_66_] = class534_sub40.method16550((byte) 41);
	} else if (i == 2)
	    aString3337 = class534_sub40.method16541((byte) -56);
	else if (12 == i)
	    anInt3328 = class534_sub40.method16527(80747392) * 1054305681;
	else if (i >= 30 && i < 35)
	    aStringArray3286[i - 30] = class534_sub40.method16541((byte) -26);
	else if (40 == i) {
	    int i_67_ = class534_sub40.method16527(-2036837302);
	    aShortArray3314 = new short[i_67_];
	    aShortArray3287 = new short[i_67_];
	    for (int i_68_ = 0; i_68_ < i_67_; i_68_++) {
		aShortArray3314[i_68_]
		    = (short) class534_sub40.method16529((byte) 1);
		aShortArray3287[i_68_]
		    = (short) class534_sub40.method16529((byte) 1);
	    }
	} else if (41 == i) {
	    int i_69_ = class534_sub40.method16527(489151119);
	    aShortArray3289 = new short[i_69_];
	    aShortArray3290 = new short[i_69_];
	    for (int i_70_ = 0; i_70_ < i_69_; i_70_++) {
		aShortArray3289[i_70_]
		    = (short) class534_sub40.method16529((byte) 1);
		aShortArray3290[i_70_]
		    = (short) class534_sub40.method16529((byte) 1);
	    }
	} else if (i == 42) {
	    int i_71_ = class534_sub40.method16527(345808293);
	    aByteArray3288 = new byte[i_71_];
	    for (int i_72_ = 0; i_72_ < i_71_; i_72_++)
		aByteArray3288[i_72_] = class534_sub40.method16586((byte) 1);
	} else if (i == 44) {
	    int i_73_ = class534_sub40.method16529((byte) 1);
	    int i_74_ = 0;
	    for (int i_75_ = i_73_; i_75_ > 0; i_75_ >>= 1)
		i_74_++;
	    aByteArray3291 = new byte[i_74_];
	    byte i_76_ = 0;
	    for (int i_77_ = 0; i_77_ < i_74_; i_77_++) {
		if ((i_73_ & 1 << i_77_) > 0) {
		    aByteArray3291[i_77_] = i_76_;
		    i_76_++;
		} else
		    aByteArray3291[i_77_] = (byte) -1;
	    }
	} else if (45 == i) {
	    int i_78_ = class534_sub40.method16529((byte) 1);
	    int i_79_ = 0;
	    for (int i_80_ = i_78_; i_80_ > 0; i_80_ >>= 1)
		i_79_++;
	    aByteArray3321 = new byte[i_79_];
	    byte i_81_ = 0;
	    for (int i_82_ = 0; i_82_ < i_79_; i_82_++) {
		if ((i_78_ & 1 << i_82_) > 0) {
		    aByteArray3321[i_82_] = i_81_;
		    i_81_++;
		} else
		    aByteArray3321[i_82_] = (byte) -1;
	    }
	} else if (i == 60) {
	    int i_83_ = class534_sub40.method16527(1789530654);
	    anIntArray3283 = new int[i_83_];
	    for (int i_84_ = 0; i_84_ < i_83_; i_84_++)
		anIntArray3283[i_84_] = class534_sub40.method16550((byte) -33);
	} else if (i == 93)
	    aBool3300 = false;
	else if (95 == i)
	    anInt3301 = class534_sub40.method16529((byte) 1) * 1863678927;
	else if (i == 97)
	    anInt3302 = class534_sub40.method16529((byte) 1) * -1022455525;
	else if (98 == i)
	    anInt3303 = class534_sub40.method16529((byte) 1) * -1392672857;
	else if (99 == i)
	    aBool3276 = true;
	else if (i == 100)
	    anInt3307 = class534_sub40.method16586((byte) 1) * -412400947;
	else if (i == 101)
	    anInt3292 = class534_sub40.method16586((byte) 1) * 1679047953;
	else if (102 == i) {
	    int i_85_ = class534_sub40.method16527(497632582);
	    int i_86_ = 0;
	    for (int i_87_ = i_85_; 0 != i_87_; i_87_ >>= 1)
		i_86_++;
	    anIntArray3309 = new int[i_86_];
	    aShortArray3318 = new short[i_86_];
	    for (int i_88_ = 0; i_88_ < i_86_; i_88_++) {
		if (0 == (i_85_ & 1 << i_88_)) {
		    anIntArray3309[i_88_] = -1;
		    aShortArray3318[i_88_] = (short) -1;
		} else {
		    anIntArray3309[i_88_]
			= class534_sub40.method16550((byte) 13);
		    aShortArray3318[i_88_]
			= (short) class534_sub40.method16547(-1641213930);
		}
	    }
	} else if (i == 103)
	    anInt3312 = class534_sub40.method16529((byte) 1) * 1524082329;
	else if (106 == i || i == 118) {
	    anInt3335 = class534_sub40.method16529((byte) 1) * 1869867087;
	    if (1545219759 * anInt3335 == 65535)
		anInt3335 = -1869867087;
	    anInt3297 = class534_sub40.method16529((byte) 1) * -259747351;
	    if (1436374617 * anInt3297 == 65535)
		anInt3297 = 259747351;
	    int i_89_ = -1;
	    if (118 == i) {
		i_89_ = class534_sub40.method16529((byte) 1);
		if (65535 == i_89_)
		    i_89_ = -1;
	    }
	    int i_90_ = class534_sub40.method16527(723814518);
	    anIntArray3284 = new int[i_90_ + 2];
	    for (int i_91_ = 0; i_91_ <= i_90_; i_91_++) {
		anIntArray3284[i_91_] = class534_sub40.method16529((byte) 1);
		if (65535 == anIntArray3284[i_91_])
		    anIntArray3284[i_91_] = -1;
	    }
	    anIntArray3284[1 + i_90_] = i_89_;
	} else if (i == 107)
	    aBool3313 = false;
	else if (109 == i)
	    aBool3317 = false;
	else if (111 == i)
	    aBool3281 = false;
	else if (i == 113) {
	    aShort3319 = (short) class534_sub40.method16529((byte) 1);
	    aShort3306 = (short) class534_sub40.method16529((byte) 1);
	} else if (i == 114) {
	    aByte3315 = class534_sub40.method16586((byte) 1);
	    aByte3322 = class534_sub40.method16586((byte) 1);
	} else if (119 == i)
	    aByte3274 = class534_sub40.method16586((byte) 1);
	else if (i == 121) {
	    anIntArrayArray3336 = new int[anIntArray3282.length][];
	    int i_92_ = class534_sub40.method16527(-813605597);
	    for (int i_93_ = 0; i_93_ < i_92_; i_93_++) {
		int i_94_ = class534_sub40.method16527(152780785);
		int[] is = anIntArrayArray3336[i_94_] = new int[3];
		is[0] = class534_sub40.method16586((byte) 1);
		is[1] = class534_sub40.method16586((byte) 1);
		is[2] = class534_sub40.method16586((byte) 1);
	    }
	} else if (123 == i)
	    anInt3316 = class534_sub40.method16529((byte) 1) * -987716523;
	else if (i == 125)
	    aClass686_3325
		= ((Class686)
		   Class448.method7319(Class225.method4173(-1506893836),
				       class534_sub40.method16586((byte) 1),
				       2088438307));
	else if (127 == i)
	    anInt3310 = class534_sub40.method16529((byte) 1) * -990646495;
	else if (128 == i)
	    Class448.method7319(Class676.method11130((byte) 9),
				class534_sub40.method16527(1491037648),
				2088438307);
	else if (i == 134) {
	    anInt3304 = class534_sub40.method16529((byte) 1) * 834215525;
	    if (65535 == 1315529581 * anInt3304)
		anInt3304 = -834215525;
	    anInt3329 = class534_sub40.method16529((byte) 1) * -481837541;
	    if (65535 == 1912925203 * anInt3329)
		anInt3329 = 481837541;
	    anInt3330 = class534_sub40.method16529((byte) 1) * 1043217285;
	    if (65535 == anInt3330 * 1144816973)
		anInt3330 = -1043217285;
	    anInt3331 = class534_sub40.method16529((byte) 1) * -1596236055;
	    if (-306882215 * anInt3331 == 65535)
		anInt3331 = 1596236055;
	    anInt3332 = class534_sub40.method16527(-1642855600) * -955680361;
	} else if (135 == i || 136 == i) {
	    class534_sub40.method16527(736961357);
	    class534_sub40.method16529((byte) 1);
	} else if (i == 137)
	    anInt3299 = class534_sub40.method16529((byte) 1) * -336530599;
	else if (i == 138)
	    anInt3320 = class534_sub40.method16550((byte) -5) * 910648041;
	else if (140 == i)
	    anInt3334 = class534_sub40.method16527(1886152456) * 1556518139;
	else if (i == 141)
	    aBool3280 = true;
	else if (142 == i)
	    anInt3338 = class534_sub40.method16529((byte) 1) * -1040460371;
	else if (143 == i)
	    aBool3305 = true;
	else if (i >= 150 && i < 155) {
	    aStringArray3286[i - 150] = class534_sub40.method16541((byte) -78);
	    if (!aClass304_3277.aBool3258)
		aStringArray3286[i - 150] = null;
	} else if (155 == i) {
	    aByte3293 = class534_sub40.method16586((byte) 1);
	    aByte3294 = class534_sub40.method16586((byte) 1);
	    aByte3296 = class534_sub40.method16586((byte) 1);
	    aByte3311 = class534_sub40.method16586((byte) 1);
	} else if (158 == i)
	    aByte3340 = (byte) 1;
	else if (159 == i)
	    aByte3340 = (byte) 0;
	else if (160 == i) {
	    int i_95_ = class534_sub40.method16527(890697433);
	    anIntArray3339 = new int[i_95_];
	    for (int i_96_ = 0; i_96_ < i_95_; i_96_++)
		anIntArray3339[i_96_] = class534_sub40.method16529((byte) 1);
	} else if (i != 162) {
	    if (i == 163)
		anInt3341
		    = class534_sub40.method16527(-1563652205) * -507210193;
	    else if (i == 164) {
		anInt3343 = class534_sub40.method16529((byte) 1) * 1494484643;
		anInt3344 = class534_sub40.method16529((byte) 1) * -2117460245;
	    } else if (165 == i)
		anInt3345
		    = class534_sub40.method16527(-354507329) * 1906704249;
	    else if (i == 168)
		anInt3295
		    = class534_sub40.method16527(2015235265) * 1588450707;
	    else if (169 == i)
		aBool3346 = false;
	    else if (i >= 170 && i < 176) {
		if (anIntArray3298 == null) {
		    anIntArray3298 = new int[6];
		    Arrays.fill(anIntArray3298, -1);
		}
		int i_97_ = class534_sub40.method16529((byte) 1);
		if (65535 == i_97_)
		    i_97_ = -1;
		anIntArray3298[i - 170] = i_97_;
	    } else if (i != 178) {
		if (179 == i) {
		    aClass432_3342 = new Class432();
		    aClass432_3342.aFloat4847
			= (float) class534_sub40.method16545((byte) -4);
		    aClass432_3342.aFloat4845
			= (float) class534_sub40.method16545((byte) -34);
		    aClass432_3342.aFloat4844
			= (float) class534_sub40.method16545((byte) -97);
		    aClass432_3342.aFloat4848
			= (float) class534_sub40.method16545((byte) -28);
		    aClass432_3342.aFloat4850
			= (float) class534_sub40.method16545((byte) -66);
		    aClass432_3342.aFloat4849
			= (float) class534_sub40.method16545((byte) -115);
		} else if (180 == i)
		    anInt3347 = (class534_sub40.method16527(-1867758299)
				 & 0xff) * 1137260381;
		else if (181 == i) {
		    aShort3323 = (short) class534_sub40.method16529((byte) 1);
		    aByte3324 = (byte) class534_sub40.method16527(-1810687482);
		} else if (182 == i)
		    aBool3348 = true;
		else if (249 == i) {
		    int i_98_ = class534_sub40.method16527(1422574305);
		    if (null == aClass9_3333) {
			int i_99_ = Class162.method2640(i_98_, (byte) 42);
			aClass9_3333 = new Class9(i_99_);
		    }
		    for (int i_100_ = 0; i_100_ < i_98_; i_100_++) {
			boolean bool
			    = class534_sub40.method16527(-1296067637) == 1;
			int i_101_ = class534_sub40.method16531(1897657350);
			Class534 class534;
			if (bool)
			    class534
				= (new Class534_Sub6
				   (class534_sub40.method16541((byte) -21)));
			else
			    class534
				= (new Class534_Sub39
				   (class534_sub40.method16533(-258848859)));
			aClass9_3333.method581(class534, (long) i_101_);
		    }
		}
	    }
	}
    }
    
    void method5621(Class534_Sub40 class534_sub40, int i) {
	if (1 == i) {
	    int i_102_ = class534_sub40.method16527(-709254332);
	    anIntArray3282 = new int[i_102_];
	    for (int i_103_ = 0; i_103_ < i_102_; i_103_++)
		anIntArray3282[i_103_]
		    = class534_sub40.method16550((byte) -31);
	} else if (i == 2)
	    aString3337 = class534_sub40.method16541((byte) -89);
	else if (12 == i)
	    anInt3328 = class534_sub40.method16527(-158731842) * 1054305681;
	else if (i >= 30 && i < 35)
	    aStringArray3286[i - 30] = class534_sub40.method16541((byte) -112);
	else if (40 == i) {
	    int i_104_ = class534_sub40.method16527(-1580545041);
	    aShortArray3314 = new short[i_104_];
	    aShortArray3287 = new short[i_104_];
	    for (int i_105_ = 0; i_105_ < i_104_; i_105_++) {
		aShortArray3314[i_105_]
		    = (short) class534_sub40.method16529((byte) 1);
		aShortArray3287[i_105_]
		    = (short) class534_sub40.method16529((byte) 1);
	    }
	} else if (41 == i) {
	    int i_106_ = class534_sub40.method16527(-1211132381);
	    aShortArray3289 = new short[i_106_];
	    aShortArray3290 = new short[i_106_];
	    for (int i_107_ = 0; i_107_ < i_106_; i_107_++) {
		aShortArray3289[i_107_]
		    = (short) class534_sub40.method16529((byte) 1);
		aShortArray3290[i_107_]
		    = (short) class534_sub40.method16529((byte) 1);
	    }
	} else if (i == 42) {
	    int i_108_ = class534_sub40.method16527(-895472740);
	    aByteArray3288 = new byte[i_108_];
	    for (int i_109_ = 0; i_109_ < i_108_; i_109_++)
		aByteArray3288[i_109_] = class534_sub40.method16586((byte) 1);
	} else if (i == 44) {
	    int i_110_ = class534_sub40.method16529((byte) 1);
	    int i_111_ = 0;
	    for (int i_112_ = i_110_; i_112_ > 0; i_112_ >>= 1)
		i_111_++;
	    aByteArray3291 = new byte[i_111_];
	    byte i_113_ = 0;
	    for (int i_114_ = 0; i_114_ < i_111_; i_114_++) {
		if ((i_110_ & 1 << i_114_) > 0) {
		    aByteArray3291[i_114_] = i_113_;
		    i_113_++;
		} else
		    aByteArray3291[i_114_] = (byte) -1;
	    }
	} else if (45 == i) {
	    int i_115_ = class534_sub40.method16529((byte) 1);
	    int i_116_ = 0;
	    for (int i_117_ = i_115_; i_117_ > 0; i_117_ >>= 1)
		i_116_++;
	    aByteArray3321 = new byte[i_116_];
	    byte i_118_ = 0;
	    for (int i_119_ = 0; i_119_ < i_116_; i_119_++) {
		if ((i_115_ & 1 << i_119_) > 0) {
		    aByteArray3321[i_119_] = i_118_;
		    i_118_++;
		} else
		    aByteArray3321[i_119_] = (byte) -1;
	    }
	} else if (i == 60) {
	    int i_120_ = class534_sub40.method16527(435995171);
	    anIntArray3283 = new int[i_120_];
	    for (int i_121_ = 0; i_121_ < i_120_; i_121_++)
		anIntArray3283[i_121_]
		    = class534_sub40.method16550((byte) -33);
	} else if (i == 93)
	    aBool3300 = false;
	else if (95 == i)
	    anInt3301 = class534_sub40.method16529((byte) 1) * 1863678927;
	else if (i == 97)
	    anInt3302 = class534_sub40.method16529((byte) 1) * -1022455525;
	else if (98 == i)
	    anInt3303 = class534_sub40.method16529((byte) 1) * -1392672857;
	else if (99 == i)
	    aBool3276 = true;
	else if (i == 100)
	    anInt3307 = class534_sub40.method16586((byte) 1) * -412400947;
	else if (i == 101)
	    anInt3292 = class534_sub40.method16586((byte) 1) * 1679047953;
	else if (102 == i) {
	    int i_122_ = class534_sub40.method16527(-645263628);
	    int i_123_ = 0;
	    for (int i_124_ = i_122_; 0 != i_124_; i_124_ >>= 1)
		i_123_++;
	    anIntArray3309 = new int[i_123_];
	    aShortArray3318 = new short[i_123_];
	    for (int i_125_ = 0; i_125_ < i_123_; i_125_++) {
		if (0 == (i_122_ & 1 << i_125_)) {
		    anIntArray3309[i_125_] = -1;
		    aShortArray3318[i_125_] = (short) -1;
		} else {
		    anIntArray3309[i_125_]
			= class534_sub40.method16550((byte) 8);
		    aShortArray3318[i_125_]
			= (short) class534_sub40.method16547(-1641213930);
		}
	    }
	} else if (i == 103)
	    anInt3312 = class534_sub40.method16529((byte) 1) * 1524082329;
	else if (106 == i || i == 118) {
	    anInt3335 = class534_sub40.method16529((byte) 1) * 1869867087;
	    if (1545219759 * anInt3335 == 65535)
		anInt3335 = -1869867087;
	    anInt3297 = class534_sub40.method16529((byte) 1) * -259747351;
	    if (1436374617 * anInt3297 == 65535)
		anInt3297 = 259747351;
	    int i_126_ = -1;
	    if (118 == i) {
		i_126_ = class534_sub40.method16529((byte) 1);
		if (65535 == i_126_)
		    i_126_ = -1;
	    }
	    int i_127_ = class534_sub40.method16527(59604761);
	    anIntArray3284 = new int[i_127_ + 2];
	    for (int i_128_ = 0; i_128_ <= i_127_; i_128_++) {
		anIntArray3284[i_128_] = class534_sub40.method16529((byte) 1);
		if (65535 == anIntArray3284[i_128_])
		    anIntArray3284[i_128_] = -1;
	    }
	    anIntArray3284[1 + i_127_] = i_126_;
	} else if (i == 107)
	    aBool3313 = false;
	else if (109 == i)
	    aBool3317 = false;
	else if (111 == i)
	    aBool3281 = false;
	else if (i == 113) {
	    aShort3319 = (short) class534_sub40.method16529((byte) 1);
	    aShort3306 = (short) class534_sub40.method16529((byte) 1);
	} else if (i == 114) {
	    aByte3315 = class534_sub40.method16586((byte) 1);
	    aByte3322 = class534_sub40.method16586((byte) 1);
	} else if (119 == i)
	    aByte3274 = class534_sub40.method16586((byte) 1);
	else if (i == 121) {
	    anIntArrayArray3336 = new int[anIntArray3282.length][];
	    int i_129_ = class534_sub40.method16527(1325658717);
	    for (int i_130_ = 0; i_130_ < i_129_; i_130_++) {
		int i_131_ = class534_sub40.method16527(913427690);
		int[] is = anIntArrayArray3336[i_131_] = new int[3];
		is[0] = class534_sub40.method16586((byte) 1);
		is[1] = class534_sub40.method16586((byte) 1);
		is[2] = class534_sub40.method16586((byte) 1);
	    }
	} else if (123 == i)
	    anInt3316 = class534_sub40.method16529((byte) 1) * -987716523;
	else if (i == 125)
	    aClass686_3325
		= ((Class686)
		   Class448.method7319(Class225.method4173(-1506893836),
				       class534_sub40.method16586((byte) 1),
				       2088438307));
	else if (127 == i)
	    anInt3310 = class534_sub40.method16529((byte) 1) * -990646495;
	else if (128 == i)
	    Class448.method7319(Class676.method11130((byte) 42),
				class534_sub40.method16527(731553993),
				2088438307);
	else if (i == 134) {
	    anInt3304 = class534_sub40.method16529((byte) 1) * 834215525;
	    if (65535 == 1315529581 * anInt3304)
		anInt3304 = -834215525;
	    anInt3329 = class534_sub40.method16529((byte) 1) * -481837541;
	    if (65535 == 1912925203 * anInt3329)
		anInt3329 = 481837541;
	    anInt3330 = class534_sub40.method16529((byte) 1) * 1043217285;
	    if (65535 == anInt3330 * 1144816973)
		anInt3330 = -1043217285;
	    anInt3331 = class534_sub40.method16529((byte) 1) * -1596236055;
	    if (-306882215 * anInt3331 == 65535)
		anInt3331 = 1596236055;
	    anInt3332 = class534_sub40.method16527(1101292876) * -955680361;
	} else if (135 == i || 136 == i) {
	    class534_sub40.method16527(1751347082);
	    class534_sub40.method16529((byte) 1);
	} else if (i == 137)
	    anInt3299 = class534_sub40.method16529((byte) 1) * -336530599;
	else if (i == 138)
	    anInt3320 = class534_sub40.method16550((byte) -70) * 910648041;
	else if (140 == i)
	    anInt3334 = class534_sub40.method16527(1080583195) * 1556518139;
	else if (i == 141)
	    aBool3280 = true;
	else if (142 == i)
	    anInt3338 = class534_sub40.method16529((byte) 1) * -1040460371;
	else if (143 == i)
	    aBool3305 = true;
	else if (i >= 150 && i < 155) {
	    aStringArray3286[i - 150]
		= class534_sub40.method16541((byte) -128);
	    if (!aClass304_3277.aBool3258)
		aStringArray3286[i - 150] = null;
	} else if (155 == i) {
	    aByte3293 = class534_sub40.method16586((byte) 1);
	    aByte3294 = class534_sub40.method16586((byte) 1);
	    aByte3296 = class534_sub40.method16586((byte) 1);
	    aByte3311 = class534_sub40.method16586((byte) 1);
	} else if (158 == i)
	    aByte3340 = (byte) 1;
	else if (159 == i)
	    aByte3340 = (byte) 0;
	else if (160 == i) {
	    int i_132_ = class534_sub40.method16527(769222426);
	    anIntArray3339 = new int[i_132_];
	    for (int i_133_ = 0; i_133_ < i_132_; i_133_++)
		anIntArray3339[i_133_] = class534_sub40.method16529((byte) 1);
	} else if (i != 162) {
	    if (i == 163)
		anInt3341
		    = class534_sub40.method16527(-1936251736) * -507210193;
	    else if (i == 164) {
		anInt3343 = class534_sub40.method16529((byte) 1) * 1494484643;
		anInt3344 = class534_sub40.method16529((byte) 1) * -2117460245;
	    } else if (165 == i)
		anInt3345
		    = class534_sub40.method16527(1047668982) * 1906704249;
	    else if (i == 168)
		anInt3295
		    = class534_sub40.method16527(-1263754228) * 1588450707;
	    else if (169 == i)
		aBool3346 = false;
	    else if (i >= 170 && i < 176) {
		if (anIntArray3298 == null) {
		    anIntArray3298 = new int[6];
		    Arrays.fill(anIntArray3298, -1);
		}
		int i_134_ = class534_sub40.method16529((byte) 1);
		if (65535 == i_134_)
		    i_134_ = -1;
		anIntArray3298[i - 170] = i_134_;
	    } else if (i != 178) {
		if (179 == i) {
		    aClass432_3342 = new Class432();
		    aClass432_3342.aFloat4847
			= (float) class534_sub40.method16545((byte) -28);
		    aClass432_3342.aFloat4845
			= (float) class534_sub40.method16545((byte) -79);
		    aClass432_3342.aFloat4844
			= (float) class534_sub40.method16545((byte) -79);
		    aClass432_3342.aFloat4848
			= (float) class534_sub40.method16545((byte) -1);
		    aClass432_3342.aFloat4850
			= (float) class534_sub40.method16545((byte) -104);
		    aClass432_3342.aFloat4849
			= (float) class534_sub40.method16545((byte) -123);
		} else if (180 == i)
		    anInt3347 = (class534_sub40.method16527(2072601186)
				 & 0xff) * 1137260381;
		else if (181 == i) {
		    aShort3323 = (short) class534_sub40.method16529((byte) 1);
		    aByte3324 = (byte) class534_sub40.method16527(-2133477266);
		} else if (182 == i)
		    aBool3348 = true;
		else if (249 == i) {
		    int i_135_ = class534_sub40.method16527(-2074174397);
		    if (null == aClass9_3333) {
			int i_136_ = Class162.method2640(i_135_, (byte) 114);
			aClass9_3333 = new Class9(i_136_);
		    }
		    for (int i_137_ = 0; i_137_ < i_135_; i_137_++) {
			boolean bool
			    = class534_sub40.method16527(1093168483) == 1;
			int i_138_ = class534_sub40.method16531(1631389167);
			Class534 class534;
			if (bool)
			    class534
				= (new Class534_Sub6
				   (class534_sub40.method16541((byte) -128)));
			else
			    class534
				= (new Class534_Sub39
				   (class534_sub40.method16533(-258848859)));
			aClass9_3333.method581(class534, (long) i_138_);
		    }
		}
	    }
	}
    }
    
    public final Class183 method5622
	(Class185 class185, int i, Class44_Sub14 class44_sub14,
	 Interface18 interface18, Interface20 interface20, Class711 class711,
	 Class711 class711_139_, Class711[] class711s, int[] is, int i_140_,
	 Class301 class301, int i_141_, boolean bool, int i_142_) {
	if (null != anIntArray3284) {
	    Class307 class307_143_
		= method5615(interface18, interface20, -1466068515);
	    if (null == class307_143_)
		return null;
	    return class307_143_.method5622(class185, i, class44_sub14,
					    interface18, interface20, class711,
					    class711_139_, class711s, is,
					    i_140_, class301, i_141_, bool,
					    -909295235);
	}
	int i_144_ = i;
	if (anInt3303 * -169134057 != 128)
	    i_144_ |= 0x2;
	if (128 != anInt3302 * 30433555)
	    i_144_ |= 0x5;
	boolean bool_145_ = false;
	int i_146_ = null != class711s ? class711s.length : 0;
	for (int i_147_ = 0; i_147_ < i_146_; i_147_++) {
	    if (class711s[i_147_] != null) {
		i_144_ |= class711s[i_147_].method14360((short) -15446);
		bool_145_ = true;
	    }
	}
	if (class711 != null) {
	    i_144_ |= class711.method14360((short) -19123);
	    bool_145_ = true;
	}
	if (class711_139_ != null) {
	    i_144_ |= class711_139_.method14360((short) -23780);
	    bool_145_ = true;
	}
	long l = (long) (anInt3279 * -4020817
			 | 2098753835 * class185.anInt2001 << 16);
	if (null != class301)
	    l |= class301.aLong3238 * -4758975763701750077L << 24;
	Class183 class183;
	synchronized (aClass304_3277.aClass203_3255) {
	    class183 = (Class183) aClass304_3277.aClass203_3255.method3871(l);
	}
	Class570 class570 = null;
	if (!bool && i_141_ != -1)
	    class570 = (Class570) class44_sub14.method91(i_141_, 769950818);
	else if (1789154529 * anInt3310 != -1)
	    class570
		= (Class570) class44_sub14.method91(anInt3310 * 1789154529,
						    -1407759097);
	if (class183 == null || (class183.method3101() & i_144_) != i_144_) {
	    if (null != class183)
		i_144_ |= class183.method3101();
	    int i_148_ = i_144_;
	    if (null != aShortArray3314)
		i_148_ |= 0x4000;
	    if (aShortArray3289 != null)
		i_148_ |= 0x8000;
	    if (0 != aByte3311)
		i_148_ |= 0x80000;
	    int[] is_149_
		= (null != class301 && class301.anIntArray3233 != null
		   ? class301.anIntArray3233 : anIntArray3282);
	    boolean bool_150_ = false;
	    synchronized (aClass304_3277.aClass472_3256) {
		for (int i_151_ = 0; i_151_ < is_149_.length; i_151_++) {
		    if (-1 != is_149_[i_151_]
			&& !aClass304_3277.aClass472_3256
				.method7669(is_149_[i_151_], 0, 1804616883))
			bool_150_ = true;
		}
	    }
	    if (bool_150_)
		return null;
	    Class187[] class187s = new Class187[is_149_.length];
	    for (int i_152_ = 0; i_152_ < is_149_.length; i_152_++) {
		if (is_149_[i_152_] != -1) {
		    synchronized (aClass304_3277.aClass472_3256) {
			class187s[i_152_]
			    = Class187.method3709((aClass304_3277
						   .aClass472_3256),
						  is_149_[i_152_], 0);
		    }
		    if (class187s[i_152_] != null) {
			if (class187s[i_152_].anInt2082 < 13)
			    class187s[i_152_].method3723(2);
			if (anIntArrayArray3336 != null
			    && anIntArrayArray3336[i_152_] != null)
			    class187s[i_152_].method3721
				(anIntArrayArray3336[i_152_][0],
				 anIntArrayArray3336[i_152_][1],
				 anIntArrayArray3336[i_152_][2]);
		    }
		}
	    }
	    if (null != class301) {
		for (int i_153_ = 0; i_153_ < class187s.length; i_153_++) {
		    if (null != class187s[i_153_]) {
			if (class301.aFloatArray3234 != null
			    && class301.aFloatArray3234[i_153_] != 0.0F)
			    class187s[i_153_]
				.method3743(class301.aFloatArray3234[i_153_]);
			if (null != class301.anIntArrayArray3235)
			    class187s[i_153_].method3724
				(class301.anIntArrayArray3235[i_153_][0],
				 class301.anIntArrayArray3235[i_153_][1],
				 class301.anIntArrayArray3235[i_153_][2]);
			if (class301.anIntArrayArray3236 != null)
			    class187s[i_153_].method3721
				(class301.anIntArrayArray3236[i_153_][0],
				 class301.anIntArrayArray3236[i_153_][1],
				 class301.anIntArrayArray3236[i_153_][2]);
		    }
		}
	    }
	    if (class570 != null && class570.anIntArrayArray7648 != null) {
		for (int i_154_ = 0;
		     i_154_ < class570.anIntArrayArray7648.length; i_154_++) {
		    if (i_154_ < class187s.length
			&& class187s[i_154_] != null) {
			int i_155_ = 0;
			int i_156_ = 0;
			int i_157_ = 0;
			int i_158_ = 0;
			int i_159_ = 0;
			int i_160_ = 0;
			if (class570.anIntArrayArray7648[i_154_] != null) {
			    i_155_ = class570.anIntArrayArray7648[i_154_][0];
			    i_156_ = class570.anIntArrayArray7648[i_154_][1];
			    i_157_ = class570.anIntArrayArray7648[i_154_][2];
			    i_158_
				= class570.anIntArrayArray7648[i_154_][3] << 3;
			    i_159_
				= class570.anIntArrayArray7648[i_154_][4] << 3;
			    i_160_
				= class570.anIntArrayArray7648[i_154_][5] << 3;
			}
			if (0 != i_158_ || 0 != i_159_ || 0 != i_160_)
			    class187s[i_154_].method3724(i_158_, i_159_,
							 i_160_);
			if (0 != i_155_ || 0 != i_156_ || i_157_ != 0)
			    class187s[i_154_].method3721(i_155_, i_156_,
							 i_157_);
		    }
		}
	    }
	    Class187 class187;
	    if (1 == class187s.length)
		class187 = class187s[0];
	    else
		class187 = new Class187(class187s, class187s.length);
	    class183
		= class185.method3329(class187, i_148_,
				      aClass304_3277.anInt3259 * 388756143,
				      64 + 1700428293 * anInt3307,
				      850 + anInt3292 * -1713396811);
	    if (aShortArray3314 != null) {
		short[] is_161_;
		if (class301 != null && null != class301.aShortArray3232)
		    is_161_ = class301.aShortArray3232;
		else
		    is_161_ = aShortArray3287;
		for (int i_162_ = 0; i_162_ < aShortArray3314.length;
		     i_162_++) {
		    if (null != aByteArray3288
			&& i_162_ < aByteArray3288.length)
			class183.method3056(aShortArray3314[i_162_],
					    (aShortArray3285
					     [aByteArray3288[i_162_] & 0xff]));
		    else
			class183.method3056(aShortArray3314[i_162_],
					    is_161_[i_162_]);
		}
	    }
	    if (null != aShortArray3289) {
		short[] is_163_;
		if (class301 != null && class301.aShortArray3237 != null)
		    is_163_ = class301.aShortArray3237;
		else
		    is_163_ = aShortArray3290;
		for (int i_164_ = 0; i_164_ < aShortArray3289.length; i_164_++)
		    class183.method3118(aShortArray3289[i_164_],
					is_163_[i_164_]);
	    }
	    if (aByte3311 != 0)
		class183.method3058(aByte3293, aByte3294, aByte3296,
				    aByte3311 & 0xff);
	    class183.method3050();
	    class183.method3012(i_144_);
	    synchronized (aClass304_3277.aClass203_3255) {
		aClass304_3277.aClass203_3255.method3893(class183, l);
	    }
	}
	Class183 class183_165_ = class183.method3011((byte) 4, i_144_, true);
	boolean bool_166_ = false;
	if (is != null) {
	    for (int i_167_ = 0; i_167_ < 12; i_167_++) {
		if (is[i_167_] != -1)
		    bool_166_ = true;
	    }
	}
	if (!bool_145_ && !bool_166_)
	    return class183_165_;
	Class446[] class446s = null;
	if (class570 != null)
	    class446s = class570.method9616((byte) -2);
	if (bool_166_ && null != class446s) {
	    for (int i_168_ = 0; i_168_ < 12; i_168_++) {
		if (null != class446s[i_168_])
		    class183_165_.method3037(class446s[i_168_], 1 << i_168_,
					     true);
	    }
	}
	int i_169_ = 0;
	int i_170_ = 1;
	while (i_169_ < i_146_) {
	    if (class711s[i_169_] != null)
		class711s[i_169_].method14341(class183_165_, 0, i_170_,
					      1248214900);
	    i_169_++;
	    i_170_ <<= 1;
	}
	if (bool_166_) {
	    for (i_169_ = 0; i_169_ < 12; i_169_++) {
		if (-1 != is[i_169_]) {
		    i_170_ = is[i_169_] - i_140_;
		    i_170_ &= 0x3fff;
		    Class446 class446 = new Class446();
		    class446.method7244(0.0F, 1.0F, 0.0F,
					Class427.method6799(i_170_));
		    class183_165_.method3037(class446, 1 << i_169_, false);
		}
	    }
	}
	if (bool_166_ && class446s != null) {
	    for (i_169_ = 0; i_169_ < 12; i_169_++) {
		if (class446s[i_169_] != null)
		    class183_165_.method3037(class446s[i_169_], 1 << i_169_,
					     false);
	    }
	}
	if (class711 != null && null != class711_139_)
	    Class612.method10106(class183_165_, class711, class711_139_,
				 (byte) -26);
	else if (null != class711)
	    class711.method14399(class183_165_, 0, 1648475409);
	else if (class711_139_ != null)
	    class711_139_.method14399(class183_165_, 0, 1789291664);
	if (anInt3302 * 30433555 != 128 || anInt3303 * -169134057 != 128)
	    class183_165_.method3021(30433555 * anInt3302,
				     -169134057 * anInt3303,
				     30433555 * anInt3302);
	class183_165_.method3012(i);
	return class183_165_;
    }
    
    public final Class183 method5623
	(Class185 class185, int i, Interface18 interface18,
	 Interface20 interface20, Class711 class711, Class301 class301) {
	if (null != anIntArray3284) {
	    Class307 class307_171_
		= method5615(interface18, interface20, -1466068515);
	    if (class307_171_ == null)
		return null;
	    return class307_171_.method5630(class185, i, interface18,
					    interface20, class711, class301,
					    (byte) 48);
	}
	if (null == anIntArray3283
	    && (null == class301 || class301.anIntArray3233 == null))
	    return null;
	int i_172_ = i;
	if (class711 != null)
	    i_172_ |= class711.method14360((short) -32427);
	long l = (long) (-4020817 * anInt3279
			 | class185.anInt2001 * 2098753835 << 16);
	if (null != class301)
	    l |= class301.aLong3238 * -4758975763701750077L << 24;
	Class183 class183;
	synchronized (aClass304_3277.aClass203_3254) {
	    class183 = (Class183) aClass304_3277.aClass203_3254.method3871(l);
	}
	if (class183 == null || (class183.method3101() & i_172_) != i_172_) {
	    if (class183 != null)
		i_172_ |= class183.method3101();
	    int i_173_ = i_172_;
	    if (aShortArray3314 != null)
		i_173_ |= 0x4000;
	    if (aShortArray3289 != null)
		i_173_ |= 0x8000;
	    if (aByte3311 != 0)
		i_173_ |= 0x80000;
	    int[] is = (null != class301 && class301.anIntArray3233 != null
			? class301.anIntArray3233 : anIntArray3283);
	    boolean bool = false;
	    synchronized (aClass304_3277.aClass472_3256) {
		for (int i_174_ = 0; i_174_ < is.length; i_174_++) {
		    if (!aClass304_3277.aClass472_3256
			     .method7669(is[i_174_], 0, 1804616883))
			bool = true;
		}
	    }
	    if (bool)
		return null;
	    Class187[] class187s = new Class187[is.length];
	    synchronized (aClass304_3277.aClass472_3256) {
		for (int i_175_ = 0; i_175_ < is.length; i_175_++)
		    class187s[i_175_]
			= Class187.method3709(aClass304_3277.aClass472_3256,
					      is[i_175_], 0);
	    }
	    for (int i_176_ = 0; i_176_ < is.length; i_176_++) {
		if (null != class187s[i_176_]
		    && class187s[i_176_].anInt2082 < 13)
		    class187s[i_176_].method3723(2);
	    }
	    Class187 class187;
	    if (class187s.length == 1)
		class187 = class187s[0];
	    else
		class187 = new Class187(class187s, class187s.length);
	    class183
		= class185.method3329(class187, i_173_,
				      aClass304_3277.anInt3259 * 388756143, 64,
				      768);
	    if (null != aShortArray3314) {
		short[] is_177_;
		if (null != class301 && class301.aShortArray3232 != null)
		    is_177_ = class301.aShortArray3232;
		else
		    is_177_ = aShortArray3287;
		for (int i_178_ = 0; i_178_ < aShortArray3314.length;
		     i_178_++) {
		    if (null != aByteArray3288
			&& i_178_ < aByteArray3288.length)
			class183.method3056(aShortArray3314[i_178_],
					    (aShortArray3285
					     [aByteArray3288[i_178_] & 0xff]));
		    else
			class183.method3056(aShortArray3314[i_178_],
					    is_177_[i_178_]);
		}
	    }
	    if (null != aShortArray3289) {
		short[] is_179_;
		if (null != class301 && null != class301.aShortArray3237)
		    is_179_ = class301.aShortArray3237;
		else
		    is_179_ = aShortArray3290;
		for (int i_180_ = 0; i_180_ < aShortArray3289.length; i_180_++)
		    class183.method3118(aShortArray3289[i_180_],
					is_179_[i_180_]);
	    }
	    if (aByte3311 != 0)
		class183.method3058(aByte3293, aByte3294, aByte3296,
				    aByte3311 & 0xff);
	    class183.method3012(i_172_);
	    synchronized (aClass304_3277.aClass203_3254) {
		aClass304_3277.aClass203_3254.method3893(class183, l);
	    }
	}
	if (class711 != null) {
	    class183 = class183.method3011((byte) 1, i_172_, true);
	    class711.method14399(class183, 0, 1976178274);
	}
	class183.method3012(i);
	return class183;
    }
    
    public final Class183 method5624
	(Class185 class185, int i, Interface18 interface18,
	 Interface20 interface20, Class711 class711, Class301 class301) {
	if (null != anIntArray3284) {
	    Class307 class307_181_
		= method5615(interface18, interface20, -1466068515);
	    if (class307_181_ == null)
		return null;
	    return class307_181_.method5630(class185, i, interface18,
					    interface20, class711, class301,
					    (byte) 38);
	}
	if (null == anIntArray3283
	    && (null == class301 || class301.anIntArray3233 == null))
	    return null;
	int i_182_ = i;
	if (class711 != null)
	    i_182_ |= class711.method14360((short) -4112);
	long l = (long) (-4020817 * anInt3279
			 | class185.anInt2001 * 2098753835 << 16);
	if (null != class301)
	    l |= class301.aLong3238 * -4758975763701750077L << 24;
	Class183 class183;
	synchronized (aClass304_3277.aClass203_3254) {
	    class183 = (Class183) aClass304_3277.aClass203_3254.method3871(l);
	}
	if (class183 == null || (class183.method3101() & i_182_) != i_182_) {
	    if (class183 != null)
		i_182_ |= class183.method3101();
	    int i_183_ = i_182_;
	    if (aShortArray3314 != null)
		i_183_ |= 0x4000;
	    if (aShortArray3289 != null)
		i_183_ |= 0x8000;
	    if (aByte3311 != 0)
		i_183_ |= 0x80000;
	    int[] is = (null != class301 && class301.anIntArray3233 != null
			? class301.anIntArray3233 : anIntArray3283);
	    boolean bool = false;
	    synchronized (aClass304_3277.aClass472_3256) {
		for (int i_184_ = 0; i_184_ < is.length; i_184_++) {
		    if (!aClass304_3277.aClass472_3256
			     .method7669(is[i_184_], 0, 1804616883))
			bool = true;
		}
	    }
	    if (bool)
		return null;
	    Class187[] class187s = new Class187[is.length];
	    synchronized (aClass304_3277.aClass472_3256) {
		for (int i_185_ = 0; i_185_ < is.length; i_185_++)
		    class187s[i_185_]
			= Class187.method3709(aClass304_3277.aClass472_3256,
					      is[i_185_], 0);
	    }
	    for (int i_186_ = 0; i_186_ < is.length; i_186_++) {
		if (null != class187s[i_186_]
		    && class187s[i_186_].anInt2082 < 13)
		    class187s[i_186_].method3723(2);
	    }
	    Class187 class187;
	    if (class187s.length == 1)
		class187 = class187s[0];
	    else
		class187 = new Class187(class187s, class187s.length);
	    class183
		= class185.method3329(class187, i_183_,
				      aClass304_3277.anInt3259 * 388756143, 64,
				      768);
	    if (null != aShortArray3314) {
		short[] is_187_;
		if (null != class301 && class301.aShortArray3232 != null)
		    is_187_ = class301.aShortArray3232;
		else
		    is_187_ = aShortArray3287;
		for (int i_188_ = 0; i_188_ < aShortArray3314.length;
		     i_188_++) {
		    if (null != aByteArray3288
			&& i_188_ < aByteArray3288.length)
			class183.method3056(aShortArray3314[i_188_],
					    (aShortArray3285
					     [aByteArray3288[i_188_] & 0xff]));
		    else
			class183.method3056(aShortArray3314[i_188_],
					    is_187_[i_188_]);
		}
	    }
	    if (null != aShortArray3289) {
		short[] is_189_;
		if (null != class301 && null != class301.aShortArray3237)
		    is_189_ = class301.aShortArray3237;
		else
		    is_189_ = aShortArray3290;
		for (int i_190_ = 0; i_190_ < aShortArray3289.length; i_190_++)
		    class183.method3118(aShortArray3289[i_190_],
					is_189_[i_190_]);
	    }
	    if (aByte3311 != 0)
		class183.method3058(aByte3293, aByte3294, aByte3296,
				    aByte3311 & 0xff);
	    class183.method3012(i_182_);
	    synchronized (aClass304_3277.aClass203_3254) {
		aClass304_3277.aClass203_3254.method3893(class183, l);
	    }
	}
	if (class711 != null) {
	    class183 = class183.method3011((byte) 1, i_182_, true);
	    class711.method14399(class183, 0, 1979316512);
	}
	class183.method3012(i);
	return class183;
    }
    
    public final Class183 method5625
	(Class185 class185, int i, Interface18 interface18,
	 Interface20 interface20, Class711 class711, Class301 class301) {
	if (null != anIntArray3284) {
	    Class307 class307_191_
		= method5615(interface18, interface20, -1466068515);
	    if (class307_191_ == null)
		return null;
	    return class307_191_.method5630(class185, i, interface18,
					    interface20, class711, class301,
					    (byte) -30);
	}
	if (null == anIntArray3283
	    && (null == class301 || class301.anIntArray3233 == null))
	    return null;
	int i_192_ = i;
	if (class711 != null)
	    i_192_ |= class711.method14360((short) -13630);
	long l = (long) (-4020817 * anInt3279
			 | class185.anInt2001 * 2098753835 << 16);
	if (null != class301)
	    l |= class301.aLong3238 * -4758975763701750077L << 24;
	Class183 class183;
	synchronized (aClass304_3277.aClass203_3254) {
	    class183 = (Class183) aClass304_3277.aClass203_3254.method3871(l);
	}
	if (class183 == null || (class183.method3101() & i_192_) != i_192_) {
	    if (class183 != null)
		i_192_ |= class183.method3101();
	    int i_193_ = i_192_;
	    if (aShortArray3314 != null)
		i_193_ |= 0x4000;
	    if (aShortArray3289 != null)
		i_193_ |= 0x8000;
	    if (aByte3311 != 0)
		i_193_ |= 0x80000;
	    int[] is = (null != class301 && class301.anIntArray3233 != null
			? class301.anIntArray3233 : anIntArray3283);
	    boolean bool = false;
	    synchronized (aClass304_3277.aClass472_3256) {
		for (int i_194_ = 0; i_194_ < is.length; i_194_++) {
		    if (!aClass304_3277.aClass472_3256
			     .method7669(is[i_194_], 0, 1804616883))
			bool = true;
		}
	    }
	    if (bool)
		return null;
	    Class187[] class187s = new Class187[is.length];
	    synchronized (aClass304_3277.aClass472_3256) {
		for (int i_195_ = 0; i_195_ < is.length; i_195_++)
		    class187s[i_195_]
			= Class187.method3709(aClass304_3277.aClass472_3256,
					      is[i_195_], 0);
	    }
	    for (int i_196_ = 0; i_196_ < is.length; i_196_++) {
		if (null != class187s[i_196_]
		    && class187s[i_196_].anInt2082 < 13)
		    class187s[i_196_].method3723(2);
	    }
	    Class187 class187;
	    if (class187s.length == 1)
		class187 = class187s[0];
	    else
		class187 = new Class187(class187s, class187s.length);
	    class183
		= class185.method3329(class187, i_193_,
				      aClass304_3277.anInt3259 * 388756143, 64,
				      768);
	    if (null != aShortArray3314) {
		short[] is_197_;
		if (null != class301 && class301.aShortArray3232 != null)
		    is_197_ = class301.aShortArray3232;
		else
		    is_197_ = aShortArray3287;
		for (int i_198_ = 0; i_198_ < aShortArray3314.length;
		     i_198_++) {
		    if (null != aByteArray3288
			&& i_198_ < aByteArray3288.length)
			class183.method3056(aShortArray3314[i_198_],
					    (aShortArray3285
					     [aByteArray3288[i_198_] & 0xff]));
		    else
			class183.method3056(aShortArray3314[i_198_],
					    is_197_[i_198_]);
		}
	    }
	    if (null != aShortArray3289) {
		short[] is_199_;
		if (null != class301 && null != class301.aShortArray3237)
		    is_199_ = class301.aShortArray3237;
		else
		    is_199_ = aShortArray3290;
		for (int i_200_ = 0; i_200_ < aShortArray3289.length; i_200_++)
		    class183.method3118(aShortArray3289[i_200_],
					is_199_[i_200_]);
	    }
	    if (aByte3311 != 0)
		class183.method3058(aByte3293, aByte3294, aByte3296,
				    aByte3311 & 0xff);
	    class183.method3012(i_192_);
	    synchronized (aClass304_3277.aClass203_3254) {
		aClass304_3277.aClass203_3254.method3893(class183, l);
	    }
	}
	if (class711 != null) {
	    class183 = class183.method3011((byte) 1, i_192_, true);
	    class711.method14399(class183, 0, 2019006508);
	}
	class183.method3012(i);
	return class183;
    }
    
    public final Class307 method5626(Interface18 interface18,
				     Interface20 interface20) {
	int i = -1;
	if (-1 != anInt3335 * 1545219759) {
	    Class318 class318
		= interface18.method107(1545219759 * anInt3335, 1504047109);
	    if (null != class318)
		i = interface20.method119(class318, -1559812397);
	} else if (-1 != 1436374617 * anInt3297) {
	    Class150 class150
		= interface18.method108(Class453.aClass453_4946,
					1436374617 * anInt3297, 1802947938);
	    if (class150 != null)
		i = interface20.method120(class150, (byte) -11);
	}
	if (i < 0 || i >= anIntArray3284.length - 1) {
	    int i_201_ = anIntArray3284[anIntArray3284.length - 1];
	    if (-1 != i_201_)
		return ((Class307)
			anInterface14_3278.method91(i_201_, -1598206329));
	    return null;
	}
	if (-1 == anIntArray3284[i])
	    return null;
	return ((Class307)
		anInterface14_3278.method91(anIntArray3284[i], 782960350));
    }
    
    public final Class183 method5627
	(Class185 class185, int i, Interface18 interface18,
	 Interface20 interface20, Class711 class711, Class301 class301) {
	if (null != anIntArray3284) {
	    Class307 class307_202_
		= method5615(interface18, interface20, -1466068515);
	    if (class307_202_ == null)
		return null;
	    return class307_202_.method5630(class185, i, interface18,
					    interface20, class711, class301,
					    (byte) -34);
	}
	if (null == anIntArray3283
	    && (null == class301 || class301.anIntArray3233 == null))
	    return null;
	int i_203_ = i;
	if (class711 != null)
	    i_203_ |= class711.method14360((short) -12842);
	long l = (long) (-4020817 * anInt3279
			 | class185.anInt2001 * 2098753835 << 16);
	if (null != class301)
	    l |= class301.aLong3238 * -4758975763701750077L << 24;
	Class183 class183;
	synchronized (aClass304_3277.aClass203_3254) {
	    class183 = (Class183) aClass304_3277.aClass203_3254.method3871(l);
	}
	if (class183 == null || (class183.method3101() & i_203_) != i_203_) {
	    if (class183 != null)
		i_203_ |= class183.method3101();
	    int i_204_ = i_203_;
	    if (aShortArray3314 != null)
		i_204_ |= 0x4000;
	    if (aShortArray3289 != null)
		i_204_ |= 0x8000;
	    if (aByte3311 != 0)
		i_204_ |= 0x80000;
	    int[] is = (null != class301 && class301.anIntArray3233 != null
			? class301.anIntArray3233 : anIntArray3283);
	    boolean bool = false;
	    synchronized (aClass304_3277.aClass472_3256) {
		for (int i_205_ = 0; i_205_ < is.length; i_205_++) {
		    if (!aClass304_3277.aClass472_3256
			     .method7669(is[i_205_], 0, 1804616883))
			bool = true;
		}
	    }
	    if (bool)
		return null;
	    Class187[] class187s = new Class187[is.length];
	    synchronized (aClass304_3277.aClass472_3256) {
		for (int i_206_ = 0; i_206_ < is.length; i_206_++)
		    class187s[i_206_]
			= Class187.method3709(aClass304_3277.aClass472_3256,
					      is[i_206_], 0);
	    }
	    for (int i_207_ = 0; i_207_ < is.length; i_207_++) {
		if (null != class187s[i_207_]
		    && class187s[i_207_].anInt2082 < 13)
		    class187s[i_207_].method3723(2);
	    }
	    Class187 class187;
	    if (class187s.length == 1)
		class187 = class187s[0];
	    else
		class187 = new Class187(class187s, class187s.length);
	    class183
		= class185.method3329(class187, i_204_,
				      aClass304_3277.anInt3259 * 388756143, 64,
				      768);
	    if (null != aShortArray3314) {
		short[] is_208_;
		if (null != class301 && class301.aShortArray3232 != null)
		    is_208_ = class301.aShortArray3232;
		else
		    is_208_ = aShortArray3287;
		for (int i_209_ = 0; i_209_ < aShortArray3314.length;
		     i_209_++) {
		    if (null != aByteArray3288
			&& i_209_ < aByteArray3288.length)
			class183.method3056(aShortArray3314[i_209_],
					    (aShortArray3285
					     [aByteArray3288[i_209_] & 0xff]));
		    else
			class183.method3056(aShortArray3314[i_209_],
					    is_208_[i_209_]);
		}
	    }
	    if (null != aShortArray3289) {
		short[] is_210_;
		if (null != class301 && null != class301.aShortArray3237)
		    is_210_ = class301.aShortArray3237;
		else
		    is_210_ = aShortArray3290;
		for (int i_211_ = 0; i_211_ < aShortArray3289.length; i_211_++)
		    class183.method3118(aShortArray3289[i_211_],
					is_210_[i_211_]);
	    }
	    if (aByte3311 != 0)
		class183.method3058(aByte3293, aByte3294, aByte3296,
				    aByte3311 & 0xff);
	    class183.method3012(i_203_);
	    synchronized (aClass304_3277.aClass203_3254) {
		aClass304_3277.aClass203_3254.method3893(class183, l);
	    }
	}
	if (class711 != null) {
	    class183 = class183.method3011((byte) 1, i_203_, true);
	    class711.method14399(class183, 0, 1455849061);
	}
	class183.method3012(i);
	return class183;
    }
    
    public boolean method5628() {
	if (null == anIntArray3284)
	    return (1315529581 * anInt3304 != -1
		    || anInt3330 * 1144816973 != -1
		    || -1 != anInt3331 * -306882215);
	for (int i = 0; i < anIntArray3284.length; i++) {
	    if (anIntArray3284[i] != -1) {
		Class307 class307_212_
		    = (Class307) anInterface14_3278.method91(anIntArray3284[i],
							     640993804);
		if (1315529581 * class307_212_.anInt3304 != -1
		    || 1144816973 * class307_212_.anInt3330 != -1
		    || -1 != -306882215 * class307_212_.anInt3331)
		    return true;
	    }
	}
	return false;
    }
    
    public final boolean method5629() {
	if (null == anIntArray3282)
	    return true;
	boolean bool = true;
	int[] is = anIntArray3282;
	for (int i = 0; i < is.length; i++) {
	    int i_213_ = is[i];
	    if (!aClass304_3277.aClass472_3256.method7669(i_213_, 0,
							  1804616883))
		bool = false;
	}
	return bool;
    }
    
    public final Class183 method5630
	(Class185 class185, int i, Interface18 interface18,
	 Interface20 interface20, Class711 class711, Class301 class301,
	 byte i_214_) {
	if (null != anIntArray3284) {
	    Class307 class307_215_
		= method5615(interface18, interface20, -1466068515);
	    if (class307_215_ == null)
		return null;
	    return class307_215_.method5630(class185, i, interface18,
					    interface20, class711, class301,
					    (byte) 24);
	}
	if (null == anIntArray3283
	    && (null == class301 || class301.anIntArray3233 == null))
	    return null;
	int i_216_ = i;
	if (class711 != null)
	    i_216_ |= class711.method14360((short) -10841);
	long l = (long) (-4020817 * anInt3279
			 | class185.anInt2001 * 2098753835 << 16);
	if (null != class301)
	    l |= class301.aLong3238 * -4758975763701750077L << 24;
	Class183 class183;
	synchronized (aClass304_3277.aClass203_3254) {
	    class183 = (Class183) aClass304_3277.aClass203_3254.method3871(l);
	}
	if (class183 == null || (class183.method3101() & i_216_) != i_216_) {
	    if (class183 != null)
		i_216_ |= class183.method3101();
	    int i_217_ = i_216_;
	    if (aShortArray3314 != null)
		i_217_ |= 0x4000;
	    if (aShortArray3289 != null)
		i_217_ |= 0x8000;
	    if (aByte3311 != 0)
		i_217_ |= 0x80000;
	    int[] is = (null != class301 && class301.anIntArray3233 != null
			? class301.anIntArray3233 : anIntArray3283);
	    boolean bool = false;
	    synchronized (aClass304_3277.aClass472_3256) {
		for (int i_218_ = 0; i_218_ < is.length; i_218_++) {
		    if (!aClass304_3277.aClass472_3256
			     .method7669(is[i_218_], 0, 1804616883))
			bool = true;
		}
	    }
	    if (bool)
		return null;
	    Class187[] class187s = new Class187[is.length];
	    synchronized (aClass304_3277.aClass472_3256) {
		for (int i_219_ = 0; i_219_ < is.length; i_219_++)
		    class187s[i_219_]
			= Class187.method3709(aClass304_3277.aClass472_3256,
					      is[i_219_], 0);
	    }
	    for (int i_220_ = 0; i_220_ < is.length; i_220_++) {
		if (null != class187s[i_220_]
		    && class187s[i_220_].anInt2082 < 13)
		    class187s[i_220_].method3723(2);
	    }
	    Class187 class187;
	    if (class187s.length == 1)
		class187 = class187s[0];
	    else
		class187 = new Class187(class187s, class187s.length);
	    class183
		= class185.method3329(class187, i_217_,
				      aClass304_3277.anInt3259 * 388756143, 64,
				      768);
	    if (null != aShortArray3314) {
		short[] is_221_;
		if (null != class301 && class301.aShortArray3232 != null)
		    is_221_ = class301.aShortArray3232;
		else
		    is_221_ = aShortArray3287;
		for (int i_222_ = 0; i_222_ < aShortArray3314.length;
		     i_222_++) {
		    if (null != aByteArray3288
			&& i_222_ < aByteArray3288.length)
			class183.method3056(aShortArray3314[i_222_],
					    (aShortArray3285
					     [aByteArray3288[i_222_] & 0xff]));
		    else
			class183.method3056(aShortArray3314[i_222_],
					    is_221_[i_222_]);
		}
	    }
	    if (null != aShortArray3289) {
		short[] is_223_;
		if (null != class301 && null != class301.aShortArray3237)
		    is_223_ = class301.aShortArray3237;
		else
		    is_223_ = aShortArray3290;
		for (int i_224_ = 0; i_224_ < aShortArray3289.length; i_224_++)
		    class183.method3118(aShortArray3289[i_224_],
					is_223_[i_224_]);
	    }
	    if (aByte3311 != 0)
		class183.method3058(aByte3293, aByte3294, aByte3296,
				    aByte3311 & 0xff);
	    class183.method3012(i_216_);
	    synchronized (aClass304_3277.aClass203_3254) {
		aClass304_3277.aClass203_3254.method3893(class183, l);
	    }
	}
	if (class711 != null) {
	    class183 = class183.method3011((byte) 1, i_216_, true);
	    class711.method14399(class183, 0, 1501424750);
	}
	class183.method3012(i);
	return class183;
    }
    
    public final Class183 method5631
	(Class185 class185, int i, Class44_Sub14 class44_sub14,
	 Interface18 interface18, Interface20 interface20, Class711 class711,
	 Class711 class711_225_, Class711[] class711s, int[] is, int i_226_,
	 Class301 class301) {
	return method5622(class185, i, class44_sub14, interface18, interface20,
			  class711, class711_225_, class711s, is, i_226_,
			  class301, anInt3310 * 1789154529, true, -909295235);
    }
    
    public String method5632(int i, String string) {
	if (aClass9_3333 == null)
	    return string;
	Class534_Sub6 class534_sub6
	    = (Class534_Sub6) aClass9_3333.method579((long) i);
	if (class534_sub6 == null)
	    return string;
	return (String) class534_sub6.anObject10417;
    }
    
    public String method5633(int i, String string) {
	if (aClass9_3333 == null)
	    return string;
	Class534_Sub6 class534_sub6
	    = (Class534_Sub6) aClass9_3333.method579((long) i);
	if (class534_sub6 == null)
	    return string;
	return (String) class534_sub6.anObject10417;
    }
    
    public String method5634(int i, String string) {
	if (aClass9_3333 == null)
	    return string;
	Class534_Sub6 class534_sub6
	    = (Class534_Sub6) aClass9_3333.method579((long) i);
	if (class534_sub6 == null)
	    return string;
	return (String) class534_sub6.anObject10417;
    }
    
    public final Class307 method5635(Interface18 interface18,
				     Interface20 interface20) {
	int i = -1;
	if (-1 != anInt3335 * 1545219759) {
	    Class318 class318
		= interface18.method107(1545219759 * anInt3335, 1504047109);
	    if (null != class318)
		i = interface20.method119(class318, -2129776300);
	} else if (-1 != 1436374617 * anInt3297) {
	    Class150 class150
		= interface18.method108(Class453.aClass453_4946,
					1436374617 * anInt3297, 1781871464);
	    if (class150 != null)
		i = interface20.method120(class150, (byte) -62);
	}
	if (i < 0 || i >= anIntArray3284.length - 1) {
	    int i_227_ = anIntArray3284[anIntArray3284.length - 1];
	    if (-1 != i_227_)
		return ((Class307)
			anInterface14_3278.method91(i_227_, -571806279));
	    return null;
	}
	if (-1 == anIntArray3284[i])
	    return null;
	return ((Class307)
		anInterface14_3278.method91(anIntArray3284[i], -409635556));
    }
    
    public int method5636(int i, int i_228_) {
	if (aClass9_3333 == null)
	    return i_228_;
	Class534_Sub39 class534_sub39
	    = (Class534_Sub39) aClass9_3333.method579((long) i);
	if (class534_sub39 == null)
	    return i_228_;
	return class534_sub39.anInt10807 * -705967177;
    }
    
    public final Class307 method5637(Interface18 interface18,
				     Interface20 interface20) {
	int i = -1;
	if (-1 != anInt3335 * 1545219759) {
	    Class318 class318
		= interface18.method107(1545219759 * anInt3335, 1504047109);
	    if (null != class318)
		i = interface20.method119(class318, -1887465253);
	} else if (-1 != 1436374617 * anInt3297) {
	    Class150 class150
		= interface18.method108(Class453.aClass453_4946,
					1436374617 * anInt3297, 1848075231);
	    if (class150 != null)
		i = interface20.method120(class150, (byte) -118);
	}
	if (i < 0 || i >= anIntArray3284.length - 1) {
	    int i_229_ = anIntArray3284[anIntArray3284.length - 1];
	    if (-1 != i_229_)
		return ((Class307)
			anInterface14_3278.method91(i_229_, 165614435));
	    return null;
	}
	if (-1 == anIntArray3284[i])
	    return null;
	return ((Class307)
		anInterface14_3278.method91(anIntArray3284[i], 471558486));
    }
    
    public boolean method5638(int i) {
	if (null == anIntArray3284)
	    return (1315529581 * anInt3304 != -1
		    || anInt3330 * 1144816973 != -1
		    || -1 != anInt3331 * -306882215);
	for (int i_230_ = 0; i_230_ < anIntArray3284.length; i_230_++) {
	    if (anIntArray3284[i_230_] != -1) {
		Class307 class307_231_
		    = ((Class307)
		       anInterface14_3278.method91(anIntArray3284[i_230_],
						   -111827236));
		if (1315529581 * class307_231_.anInt3304 != -1
		    || 1144816973 * class307_231_.anInt3330 != -1
		    || -1 != -306882215 * class307_231_.anInt3331)
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method5639() {
	if (null == anIntArray3284)
	    return (1315529581 * anInt3304 != -1
		    || anInt3330 * 1144816973 != -1
		    || -1 != anInt3331 * -306882215);
	for (int i = 0; i < anIntArray3284.length; i++) {
	    if (anIntArray3284[i] != -1) {
		Class307 class307_232_
		    = (Class307) anInterface14_3278.method91(anIntArray3284[i],
							     -1944526693);
		if (1315529581 * class307_232_.anInt3304 != -1
		    || 1144816973 * class307_232_.anInt3330 != -1
		    || -1 != -306882215 * class307_232_.anInt3331)
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method5640(Interface18 interface18,
			      Interface20 interface20) {
	if (anIntArray3284 == null)
	    return true;
	int i = -1;
	if (-1 != 1545219759 * anInt3335) {
	    Class318 class318
		= interface18.method107(1545219759 * anInt3335, 1504047109);
	    if (null != class318)
		i = interface20.method119(class318, -1487654038);
	} else if (-1 != anInt3297 * 1436374617) {
	    Class150 class150
		= interface18.method108(Class453.aClass453_4946,
					anInt3297 * 1436374617, 1536301974);
	    if (class150 != null)
		i = interface20.method120(class150, (byte) -56);
	}
	if (i < 0 || i >= anIntArray3284.length - 1) {
	    int i_233_ = anIntArray3284[anIntArray3284.length - 1];
	    if (i_233_ != -1)
		return true;
	    return false;
	}
	if (-1 == anIntArray3284[i])
	    return false;
	return true;
    }
    
    public boolean method5641(Interface18 interface18,
			      Interface20 interface20) {
	if (anIntArray3284 == null)
	    return true;
	int i = -1;
	if (-1 != 1545219759 * anInt3335) {
	    Class318 class318
		= interface18.method107(1545219759 * anInt3335, 1504047109);
	    if (null != class318)
		i = interface20.method119(class318, -1727796730);
	} else if (-1 != anInt3297 * 1436374617) {
	    Class150 class150
		= interface18.method108(Class453.aClass453_4946,
					anInt3297 * 1436374617, 1729804418);
	    if (class150 != null)
		i = interface20.method120(class150, (byte) -98);
	}
	if (i < 0 || i >= anIntArray3284.length - 1) {
	    int i_234_ = anIntArray3284[anIntArray3284.length - 1];
	    if (i_234_ != -1)
		return true;
	    return false;
	}
	if (-1 == anIntArray3284[i])
	    return false;
	return true;
    }
    
    public boolean method5642() {
	if (null == anIntArray3284)
	    return (1315529581 * anInt3304 != -1
		    || anInt3330 * 1144816973 != -1
		    || -1 != anInt3331 * -306882215);
	for (int i = 0; i < anIntArray3284.length; i++) {
	    if (anIntArray3284[i] != -1) {
		Class307 class307_235_
		    = (Class307) anInterface14_3278.method91(anIntArray3284[i],
							     268239611);
		if (1315529581 * class307_235_.anInt3304 != -1
		    || 1144816973 * class307_235_.anInt3330 != -1
		    || -1 != -306882215 * class307_235_.anInt3331)
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method5643() {
	if (null == anIntArray3284)
	    return (1315529581 * anInt3304 != -1
		    || anInt3330 * 1144816973 != -1
		    || -1 != anInt3331 * -306882215);
	for (int i = 0; i < anIntArray3284.length; i++) {
	    if (anIntArray3284[i] != -1) {
		Class307 class307_236_
		    = (Class307) anInterface14_3278.method91(anIntArray3284[i],
							     282409245);
		if (1315529581 * class307_236_.anInt3304 != -1
		    || 1144816973 * class307_236_.anInt3330 != -1
		    || -1 != -306882215 * class307_236_.anInt3331)
		    return true;
	    }
	}
	return false;
    }
    
    public int method5644(int i, int i_237_) {
	if (aClass9_3333 == null)
	    return i_237_;
	Class534_Sub39 class534_sub39
	    = (Class534_Sub39) aClass9_3333.method579((long) i);
	if (class534_sub39 == null)
	    return i_237_;
	return class534_sub39.anInt10807 * -705967177;
    }
    
    public boolean method5645() {
	if (null == anIntArray3284)
	    return (1315529581 * anInt3304 != -1
		    || anInt3330 * 1144816973 != -1
		    || -1 != anInt3331 * -306882215);
	for (int i = 0; i < anIntArray3284.length; i++) {
	    if (anIntArray3284[i] != -1) {
		Class307 class307_238_
		    = (Class307) anInterface14_3278.method91(anIntArray3284[i],
							     1057491403);
		if (1315529581 * class307_238_.anInt3304 != -1
		    || 1144816973 * class307_238_.anInt3330 != -1
		    || -1 != -306882215 * class307_238_.anInt3331)
		    return true;
	    }
	}
	return false;
    }
    
    public void method80(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(-1513716903);
	    if (0 == i)
		break;
	    method5609(class534_sub40, i, -2140305459);
	}
    }
    
    public boolean method5646() {
	if (null == anIntArray3284)
	    return (1315529581 * anInt3304 != -1
		    || anInt3330 * 1144816973 != -1
		    || -1 != anInt3331 * -306882215);
	for (int i = 0; i < anIntArray3284.length; i++) {
	    if (anIntArray3284[i] != -1) {
		Class307 class307_239_
		    = (Class307) anInterface14_3278.method91(anIntArray3284[i],
							     -1188790652);
		if (1315529581 * class307_239_.anInt3304 != -1
		    || 1144816973 * class307_239_.anInt3330 != -1
		    || -1 != -306882215 * class307_239_.anInt3331)
		    return true;
	    }
	}
	return false;
    }
    
    public int method5647(int i) {
	if (null == anIntArray3298)
	    return -1;
	return anIntArray3298[i];
    }
    
    public static void method5648(int i, String string, int i_240_) {
	int i_241_ = -1843550713 * Class108.anInt1321;
	int[] is = Class108.anIntArray1322;
	boolean bool = false;
	for (int i_242_ = 0; i_242_ < i_241_; i_242_++) {
	    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		= client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[is[i_242_]];
	    if (class654_sub1_sub5_sub1_sub2 != null
		&& (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
		    != class654_sub1_sub5_sub1_sub2)
		&& class654_sub1_sub5_sub1_sub2.aString12211 != null
		&& class654_sub1_sub5_sub1_sub2.aString12211
		       .equalsIgnoreCase(string)) {
		Class404 class404 = null;
		if (i == 1)
		    class404 = Class404.aClass404_4198;
		else if (2 == i)
		    class404 = Class404.aClass404_4237;
		else if (i == 3)
		    class404 = Class404.aClass404_4261;
		else if (4 == i)
		    class404 = Class404.aClass404_4215;
		else if (5 == i)
		    class404 = Class404.aClass404_4202;
		else if (i == 6)
		    class404 = Class404.aClass404_4196;
		else if (i == 7)
		    class404 = Class404.aClass404_4264;
		else if (i == 8)
		    class404 = Class404.aClass404_4162;
		else if (9 == i)
		    class404 = Class404.aClass404_4232;
		else if (i == 10)
		    class404 = Class404.aClass404_4189;
		if (class404 != null) {
		    Class534_Sub19 class534_sub19
			= Class346.method6128(class404,
					      (client.aClass100_11264
					       .aClass13_1183),
					      1341391005);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16687(is[i_242_], 1947357522);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16560(0, 900914214);
		    client.aClass100_11264.method1863(class534_sub19,
						      (byte) 32);
		}
		bool = true;
		break;
	    }
	}
	if (!bool)
	    Class553.method9105(4, new StringBuilder().append
				       (Class58.aClass58_522.method1245
					(Class539.aClass672_7171, (byte) -8))
				       .append
				       (string).toString(), -2122168838);
    }
    
    public static void method5649(int i, int i_243_) {
	if (i < 1)
	    Class554_Sub1.anInt10665 = -1926359745 * Class554_Sub1.anInt10669;
	else
	    Class554_Sub1.anInt10665 = i * 1856193797;
    }
}
