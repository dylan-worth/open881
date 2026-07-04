/* Class534_Sub18_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class534_Sub18_Sub12 extends Class534_Sub18
{
    String[] aStringArray11796;
    Class56 aClass56_11797;
    int[] anIntArray11798;
    public boolean aBool11799 = true;
    public int[] anIntArray11800;
    int[][] anIntArrayArray11801;
    
    public int method18354(byte i) {
	if (anIntArray11798 == null)
	    return 0;
	return anIntArray11798.length;
    }
    
    void method18355(Class534_Sub40 class534_sub40, int i) {
	for (;;) {
	    int i_0_ = class534_sub40.method16527(1191757666);
	    if (i_0_ == 0)
		break;
	    method18373(class534_sub40, i_0_, (short) -32556);
	}
    }
    
    public int method18356(int i, int i_1_) {
	if (anIntArray11798 == null || i < 0 || i > anIntArray11798.length)
	    return -1;
	if (null == anIntArrayArray11801[i] || i_1_ < 0
	    || i_1_ > anIntArrayArray11801[i].length)
	    return -1;
	return anIntArrayArray11801[i][i_1_];
    }
    
    public void method18357(Class534_Sub40 class534_sub40, int[] is, int i) {
	if (null != anIntArray11798) {
	    for (int i_2_ = 0;
		 i_2_ < anIntArray11798.length && i_2_ < is.length; i_2_++) {
		int i_3_
		    = method18361(i_2_, -1923608425).anInt8334 * 1319261785;
		if (i_3_ > 0)
		    class534_sub40.method16515((long) is[i_2_], i_3_,
					       1538992274);
	    }
	}
    }
    
    public int method18358() {
	if (anIntArray11798 == null)
	    return 0;
	return anIntArray11798.length;
    }
    
    public String method18359(short i) {
	StringBuilder stringbuilder = new StringBuilder(80);
	if (aStringArray11796 == null)
	    return "";
	stringbuilder.append(aStringArray11796[0]);
	for (int i_4_ = 1; i_4_ < aStringArray11796.length; i_4_++) {
	    for (int i_5_ = 0; i_5_ < 3; i_5_++)
		stringbuilder.append('.');
	    stringbuilder.append(aStringArray11796[i_4_]);
	}
	return stringbuilder.toString();
    }
    
    public String method18360() {
	StringBuilder stringbuilder = new StringBuilder(80);
	if (aStringArray11796 == null)
	    return "";
	stringbuilder.append(aStringArray11796[0]);
	for (int i = 1; i < aStringArray11796.length; i++) {
	    for (int i_6_ = 0; i_6_ < 3; i_6_++)
		stringbuilder.append('.');
	    stringbuilder.append(aStringArray11796[i]);
	}
	return stringbuilder.toString();
    }
    
    public Class640 method18361(int i, int i_7_) {
	if (null == anIntArray11798 || i < 0 || i > anIntArray11798.length)
	    return null;
	return Class100.method1885(anIntArray11798[i], 1609075087);
    }
    
    public Class640 method18362(int i) {
	if (null == anIntArray11798 || i < 0 || i > anIntArray11798.length)
	    return null;
	return Class100.method1885(anIntArray11798[i], 1706853261);
    }
    
    void method18363(byte i) {
	if (null != anIntArray11800) {
	    for (int i_8_ = 0; i_8_ < anIntArray11800.length; i_8_++)
		anIntArray11800[i_8_] |= 0x8000;
	}
    }
    
    void method18364(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(-885416483);
	    if (i == 0)
		break;
	    method18373(class534_sub40, i, (short) -22106);
	}
    }
    
    void method18365(Class534_Sub40 class534_sub40, int i) {
	if (1 == i)
	    aStringArray11796
		= Class387.method6504(class534_sub40.method16541((byte) -110),
				      '<', -504643210);
	else if (2 == i) {
	    int i_9_ = class534_sub40.method16527(-279218337);
	    anIntArray11800 = new int[i_9_];
	    for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
		anIntArray11800[i_10_] = class534_sub40.method16529((byte) 1);
	} else if (3 == i) {
	    int i_11_ = class534_sub40.method16527(2015801166);
	    anIntArray11798 = new int[i_11_];
	    anIntArrayArray11801 = new int[i_11_][];
	    for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
		int i_13_ = class534_sub40.method16529((byte) 1);
		Class640 class640 = Class100.method1885(i_13_, 1423341138);
		if (class640 != null) {
		    anIntArray11798[i_12_] = i_13_;
		    anIntArrayArray11801[i_12_]
			= new int[1087638781 * class640.anInt8336];
		    for (int i_14_ = 0;
			 i_14_ < 1087638781 * class640.anInt8336; i_14_++)
			anIntArrayArray11801[i_12_][i_14_]
			    = class534_sub40.method16529((byte) 1);
		}
	    }
	} else if (i == 4)
	    aBool11799 = false;
    }
    
    void method18366(Class534_Sub40 class534_sub40, int i) {
	if (1 == i)
	    aStringArray11796
		= Class387.method6504(class534_sub40.method16541((byte) -31),
				      '<', 125119554);
	else if (2 == i) {
	    int i_15_ = class534_sub40.method16527(-157114082);
	    anIntArray11800 = new int[i_15_];
	    for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
		anIntArray11800[i_16_] = class534_sub40.method16529((byte) 1);
	} else if (3 == i) {
	    int i_17_ = class534_sub40.method16527(1864440173);
	    anIntArray11798 = new int[i_17_];
	    anIntArrayArray11801 = new int[i_17_][];
	    for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
		int i_19_ = class534_sub40.method16529((byte) 1);
		Class640 class640 = Class100.method1885(i_19_, 2032814450);
		if (class640 != null) {
		    anIntArray11798[i_18_] = i_19_;
		    anIntArrayArray11801[i_18_]
			= new int[1087638781 * class640.anInt8336];
		    for (int i_20_ = 0;
			 i_20_ < 1087638781 * class640.anInt8336; i_20_++)
			anIntArrayArray11801[i_18_][i_20_]
			    = class534_sub40.method16529((byte) 1);
		}
	    }
	} else if (i == 4)
	    aBool11799 = false;
    }
    
    Class534_Sub18_Sub12() {
	/* empty */
    }
    
    public void method18367(Class534_Sub40 class534_sub40, int[] is) {
	if (null != anIntArray11798) {
	    for (int i = 0; i < anIntArray11798.length && i < is.length; i++) {
		int i_21_ = method18361(i, -1923608425).anInt8334 * 1319261785;
		if (i_21_ > 0)
		    class534_sub40.method16515((long) is[i], i_21_,
					       1583676291);
	    }
	}
    }
    
    public void method18368(Class534_Sub40 class534_sub40, int[] is) {
	if (null != anIntArray11798) {
	    for (int i = 0; i < anIntArray11798.length && i < is.length; i++) {
		int i_22_ = method18361(i, -1923608425).anInt8334 * 1319261785;
		if (i_22_ > 0)
		    class534_sub40.method16515((long) is[i], i_22_,
					       1926370825);
	    }
	}
    }
    
    void method18369() {
	if (null != anIntArray11800) {
	    for (int i = 0; i < anIntArray11800.length; i++)
		anIntArray11800[i] |= 0x8000;
	}
    }
    
    public String method18370(Class534_Sub40 class534_sub40) {
	StringBuilder stringbuilder = new StringBuilder(80);
	if (null != anIntArray11798) {
	    for (int i = 0; i < anIntArray11798.length; i++) {
		stringbuilder.append(aStringArray11796[i]);
		stringbuilder.append
		    (aClass56_11797.method1219
		     (method18361(i, -1923608425), anIntArrayArray11801[i],
		      class534_sub40.method16661((Class100.method1885
						  (anIntArray11798[i],
						   1600938895)
						  .anInt8335) * 1576396751,
						 (byte) 1)));
	    }
	}
	stringbuilder.append(aStringArray11796[aStringArray11796.length - 1]);
	return stringbuilder.toString();
    }
    
    public String method18371() {
	StringBuilder stringbuilder = new StringBuilder(80);
	if (aStringArray11796 == null)
	    return "";
	stringbuilder.append(aStringArray11796[0]);
	for (int i = 1; i < aStringArray11796.length; i++) {
	    for (int i_23_ = 0; i_23_ < 3; i_23_++)
		stringbuilder.append('.');
	    stringbuilder.append(aStringArray11796[i]);
	}
	return stringbuilder.toString();
    }
    
    public int method18372(int i, int i_24_, int i_25_) {
	if (anIntArray11798 == null || i < 0 || i > anIntArray11798.length)
	    return -1;
	if (null == anIntArrayArray11801[i] || i_24_ < 0
	    || i_24_ > anIntArrayArray11801[i].length)
	    return -1;
	return anIntArrayArray11801[i][i_24_];
    }
    
    void method18373(Class534_Sub40 class534_sub40, int i, short i_26_) {
	if (1 == i)
	    aStringArray11796
		= Class387.method6504(class534_sub40.method16541((byte) -113),
				      '<', -1345450230);
	else if (2 == i) {
	    int i_27_ = class534_sub40.method16527(-802183803);
	    anIntArray11800 = new int[i_27_];
	    for (int i_28_ = 0; i_28_ < i_27_; i_28_++)
		anIntArray11800[i_28_] = class534_sub40.method16529((byte) 1);
	} else if (3 == i) {
	    int i_29_ = class534_sub40.method16527(2091017745);
	    anIntArray11798 = new int[i_29_];
	    anIntArrayArray11801 = new int[i_29_][];
	    for (int i_30_ = 0; i_30_ < i_29_; i_30_++) {
		int i_31_ = class534_sub40.method16529((byte) 1);
		Class640 class640 = Class100.method1885(i_31_, 2079887980);
		if (class640 != null) {
		    anIntArray11798[i_30_] = i_31_;
		    anIntArrayArray11801[i_30_]
			= new int[1087638781 * class640.anInt8336];
		    for (int i_32_ = 0;
			 i_32_ < 1087638781 * class640.anInt8336; i_32_++)
			anIntArrayArray11801[i_30_][i_32_]
			    = class534_sub40.method16529((byte) 1);
		}
	    }
	} else if (i == 4)
	    aBool11799 = false;
    }
    
    public int method18374() {
	if (anIntArray11798 == null)
	    return 0;
	return anIntArray11798.length;
    }
    
    public int method18375() {
	if (anIntArray11798 == null)
	    return 0;
	return anIntArray11798.length;
    }
    
    public int method18376(int i, int i_33_) {
	if (anIntArray11798 == null || i < 0 || i > anIntArray11798.length)
	    return -1;
	if (null == anIntArrayArray11801[i] || i_33_ < 0
	    || i_33_ > anIntArrayArray11801[i].length)
	    return -1;
	return anIntArrayArray11801[i][i_33_];
    }
    
    public String method18377(Class534_Sub40 class534_sub40, int i) {
	StringBuilder stringbuilder = new StringBuilder(80);
	if (null != anIntArray11798) {
	    for (int i_34_ = 0; i_34_ < anIntArray11798.length; i_34_++) {
		stringbuilder.append(aStringArray11796[i_34_]);
		stringbuilder.append
		    (aClass56_11797.method1219
		     (method18361(i_34_, -1923608425),
		      anIntArrayArray11801[i_34_],
		      class534_sub40.method16661((Class100.method1885
						  (anIntArray11798[i_34_],
						   1817633960)
						  .anInt8335) * 1576396751,
						 (byte) 1)));
	    }
	}
	stringbuilder.append(aStringArray11796[aStringArray11796.length - 1]);
	return stringbuilder.toString();
    }
    
    public String method18378(Class534_Sub40 class534_sub40) {
	StringBuilder stringbuilder = new StringBuilder(80);
	if (null != anIntArray11798) {
	    for (int i = 0; i < anIntArray11798.length; i++) {
		stringbuilder.append(aStringArray11796[i]);
		stringbuilder.append
		    (aClass56_11797.method1219
		     (method18361(i, -1923608425), anIntArrayArray11801[i],
		      class534_sub40.method16661((Class100.method1885
						  (anIntArray11798[i],
						   1601769471)
						  .anInt8335) * 1576396751,
						 (byte) 1)));
	    }
	}
	stringbuilder.append(aStringArray11796[aStringArray11796.length - 1]);
	return stringbuilder.toString();
    }
    
    public void method18379(Class534_Sub40 class534_sub40, int[] is) {
	if (null != anIntArray11798) {
	    for (int i = 0; i < anIntArray11798.length && i < is.length; i++) {
		int i_35_ = method18361(i, -1923608425).anInt8334 * 1319261785;
		if (i_35_ > 0)
		    class534_sub40.method16515((long) is[i], i_35_,
					       1131609811);
	    }
	}
    }
    
    static final void method18380(Class669 class669, byte i) {
	int i_36_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_36_, 111726213);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_36_ >> 16];
	Class575.method9752(class247, class243, class669, 2026531208);
    }
}
