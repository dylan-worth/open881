/* Class17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class17
{
    public short[] aShortArray192;
    static final int anInt193 = 1;
    static final int anInt194 = 2;
    public int[] anIntArray195;
    static final int anInt196 = 8;
    public int[] anIntArray197;
    public int[] anIntArray198 = new int[3];
    public short[] aShortArray199;
    public int[] anIntArray200;
    static final int anInt201 = 2;
    static final int anInt202 = 4;
    
    static Class17 method769(Class15 class15, Class534_Sub40 class534_sub40,
			     int i) {
	Class17 class17 = new Class17(class15);
	int i_0_ = class534_sub40.method16527(-479001084);
	boolean bool = (i_0_ & 0x1) != 0;
	boolean bool_1_ = (i_0_ & 0x2) != 0;
	boolean bool_2_ = 0 != (i_0_ & 0x4);
	boolean bool_3_ = 0 != (i_0_ & 0x8);
	if (bool) {
	    if (i <= 1) {
		class17.anIntArray198[0]
		    = class534_sub40.method16529((byte) 1);
		class17.anIntArray195[0]
		    = class534_sub40.method16529((byte) 1);
	    } else {
		class17.anIntArray198[0]
		    = class534_sub40.method16550((byte) 14);
		class17.anIntArray195[0]
		    = class534_sub40.method16550((byte) -58);
	    }
	    if (-1 != 384637321 * class15.anInt141
		|| class15.anInt143 * 1184936625 != -1) {
		if (i <= 1) {
		    class17.anIntArray198[1]
			= class534_sub40.method16529((byte) 1);
		    class17.anIntArray195[1]
			= class534_sub40.method16529((byte) 1);
		} else {
		    class17.anIntArray198[1]
			= class534_sub40.method16550((byte) -2);
		    class17.anIntArray195[1]
			= class534_sub40.method16550((byte) -3);
		}
	    }
	    if (-1 != class15.anInt144 * -1908318299
		|| -1 != 914690775 * class15.anInt145) {
		if (i <= 1) {
		    class17.anIntArray198[2]
			= class534_sub40.method16529((byte) 1);
		    class17.anIntArray195[2]
			= class534_sub40.method16529((byte) 1);
		} else {
		    class17.anIntArray198[2]
			= class534_sub40.method16550((byte) 38);
		    class17.anIntArray195[2]
			= class534_sub40.method16550((byte) 13);
		}
	    }
	}
	if (bool_1_) {
	    if (i <= 1) {
		class17.anIntArray197[0]
		    = class534_sub40.method16529((byte) 1);
		class17.anIntArray200[0]
		    = class534_sub40.method16529((byte) 1);
	    } else {
		class17.anIntArray197[0]
		    = class534_sub40.method16550((byte) -98);
		class17.anIntArray200[0]
		    = class534_sub40.method16550((byte) -70);
	    }
	    if (-1 != class15.anInt153 * 331707609
		|| -1648499137 * class15.anInt155 != -1) {
		if (i <= 1) {
		    class17.anIntArray197[1]
			= class534_sub40.method16529((byte) 1);
		    class17.anIntArray200[1]
			= class534_sub40.method16529((byte) 1);
		} else {
		    class17.anIntArray197[1]
			= class534_sub40.method16550((byte) 52);
		    class17.anIntArray200[1]
			= class534_sub40.method16550((byte) 33);
		}
	    }
	}
	if (bool_2_) {
	    int i_4_ = class534_sub40.method16529((byte) 1);
	    int[] is = new int[4];
	    is[0] = i_4_ & 0xf;
	    is[1] = i_4_ >> 4 & 0xf;
	    is[2] = i_4_ >> 8 & 0xf;
	    is[3] = i_4_ >> 12 & 0xf;
	    for (int i_5_ = 0; i_5_ < 4; i_5_++) {
		if (15 != is[i_5_])
		    class17.aShortArray199[is[i_5_]]
			= (short) class534_sub40.method16529((byte) 1);
	    }
	}
	if (bool_3_) {
	    int i_6_ = class534_sub40.method16527(1760548597);
	    int[] is = new int[2];
	    is[0] = i_6_ & 0xf;
	    is[1] = i_6_ >> 4 & 0xf;
	    for (int i_7_ = 0; i_7_ < 2; i_7_++) {
		if (is[i_7_] != 15)
		    class17.aShortArray192[is[i_7_]]
			= (short) class534_sub40.method16529((byte) 1);
	    }
	}
	return class17;
    }
    
    public static Class17 method770(Class15 class15,
				    Class534_Sub40 class534_sub40) {
	return Class550.method9029(class15, class534_sub40, 2, 1306933010);
    }
    
    Class17(Class15 class15) {
	anIntArray195 = new int[3];
	anIntArray197 = new int[2];
	anIntArray200 = new int[2];
	anIntArray198[0] = class15.anInt140 * -297379063;
	anIntArray198[1] = 384637321 * class15.anInt141;
	anIntArray198[2] = class15.anInt144 * -1908318299;
	anIntArray195[0] = 383860379 * class15.anInt156;
	anIntArray195[1] = 1184936625 * class15.anInt143;
	anIntArray195[2] = class15.anInt145 * 914690775;
	anIntArray197[0] = class15.anInt152 * 2038736063;
	anIntArray197[1] = 331707609 * class15.anInt153;
	anIntArray200[0] = -912813653 * class15.anInt154;
	anIntArray200[1] = -1648499137 * class15.anInt155;
	if (class15.aShortArray117 != null) {
	    aShortArray199 = new short[class15.aShortArray117.length];
	    System.arraycopy(class15.aShortArray117, 0, aShortArray199, 0,
			     aShortArray199.length);
	}
	if (class15.aShortArray120 != null) {
	    aShortArray192 = new short[class15.aShortArray120.length];
	    System.arraycopy(class15.aShortArray120, 0, aShortArray192, 0,
			     aShortArray192.length);
	}
    }
    
    public static Class17 method771(Class15 class15,
				    Class534_Sub40 class534_sub40) {
	return Class550.method9029(class15, class534_sub40, 2, 1339235831);
    }
    
    static Class17 method772(Class15 class15, Class534_Sub40 class534_sub40,
			     int i) {
	Class17 class17 = new Class17(class15);
	int i_8_ = class534_sub40.method16527(1826955839);
	boolean bool = (i_8_ & 0x1) != 0;
	boolean bool_9_ = (i_8_ & 0x2) != 0;
	boolean bool_10_ = 0 != (i_8_ & 0x4);
	boolean bool_11_ = 0 != (i_8_ & 0x8);
	if (bool) {
	    if (i <= 1) {
		class17.anIntArray198[0]
		    = class534_sub40.method16529((byte) 1);
		class17.anIntArray195[0]
		    = class534_sub40.method16529((byte) 1);
	    } else {
		class17.anIntArray198[0]
		    = class534_sub40.method16550((byte) -38);
		class17.anIntArray195[0]
		    = class534_sub40.method16550((byte) 112);
	    }
	    if (-1 != 384637321 * class15.anInt141
		|| class15.anInt143 * 1184936625 != -1) {
		if (i <= 1) {
		    class17.anIntArray198[1]
			= class534_sub40.method16529((byte) 1);
		    class17.anIntArray195[1]
			= class534_sub40.method16529((byte) 1);
		} else {
		    class17.anIntArray198[1]
			= class534_sub40.method16550((byte) -15);
		    class17.anIntArray195[1]
			= class534_sub40.method16550((byte) 29);
		}
	    }
	    if (-1 != class15.anInt144 * -1908318299
		|| -1 != 914690775 * class15.anInt145) {
		if (i <= 1) {
		    class17.anIntArray198[2]
			= class534_sub40.method16529((byte) 1);
		    class17.anIntArray195[2]
			= class534_sub40.method16529((byte) 1);
		} else {
		    class17.anIntArray198[2]
			= class534_sub40.method16550((byte) -11);
		    class17.anIntArray195[2]
			= class534_sub40.method16550((byte) 75);
		}
	    }
	}
	if (bool_9_) {
	    if (i <= 1) {
		class17.anIntArray197[0]
		    = class534_sub40.method16529((byte) 1);
		class17.anIntArray200[0]
		    = class534_sub40.method16529((byte) 1);
	    } else {
		class17.anIntArray197[0]
		    = class534_sub40.method16550((byte) -30);
		class17.anIntArray200[0]
		    = class534_sub40.method16550((byte) 61);
	    }
	    if (-1 != class15.anInt153 * 331707609
		|| -1648499137 * class15.anInt155 != -1) {
		if (i <= 1) {
		    class17.anIntArray197[1]
			= class534_sub40.method16529((byte) 1);
		    class17.anIntArray200[1]
			= class534_sub40.method16529((byte) 1);
		} else {
		    class17.anIntArray197[1]
			= class534_sub40.method16550((byte) -9);
		    class17.anIntArray200[1]
			= class534_sub40.method16550((byte) -48);
		}
	    }
	}
	if (bool_10_) {
	    int i_12_ = class534_sub40.method16529((byte) 1);
	    int[] is = new int[4];
	    is[0] = i_12_ & 0xf;
	    is[1] = i_12_ >> 4 & 0xf;
	    is[2] = i_12_ >> 8 & 0xf;
	    is[3] = i_12_ >> 12 & 0xf;
	    for (int i_13_ = 0; i_13_ < 4; i_13_++) {
		if (15 != is[i_13_])
		    class17.aShortArray199[is[i_13_]]
			= (short) class534_sub40.method16529((byte) 1);
	    }
	}
	if (bool_11_) {
	    int i_14_ = class534_sub40.method16527(746600566);
	    int[] is = new int[2];
	    is[0] = i_14_ & 0xf;
	    is[1] = i_14_ >> 4 & 0xf;
	    for (int i_15_ = 0; i_15_ < 2; i_15_++) {
		if (is[i_15_] != 15)
		    class17.aShortArray192[is[i_15_]]
			= (short) class534_sub40.method16529((byte) 1);
	    }
	}
	return class17;
    }
    
    public static Class17 method773(Class15 class15,
				    Class534_Sub40 class534_sub40) {
	return Class550.method9029(class15, class534_sub40, 2, 1471272393);
    }
    
    static final void method774(Class654_Sub1 class654_sub1, int i,
				boolean bool, boolean bool_16_, int i_17_) {
	int i_18_;
	int i_19_;
	if (class654_sub1 instanceof Class654_Sub1_Sub5
	    && class654_sub1 instanceof Interface62) {
	    Class654_Sub1_Sub5 class654_sub1_sub5
		= (Class654_Sub1_Sub5) class654_sub1;
	    int i_20_ = (1 + (class654_sub1_sub5.aShort11896
			      - class654_sub1_sub5.aShort11900)
			 << 9);
	    int i_21_ = ((class654_sub1_sub5.aShort11898
			  - class654_sub1_sub5.aShort11901 + 1)
			 << 9);
	    i_18_ = i_20_ / 2 + (class654_sub1_sub5.aShort11900 << 9);
	    i_19_ = (class654_sub1_sub5.aShort11901 << 9) + i_21_ / 2;
	} else {
	    Class438 class438 = class654_sub1.method10807().aClass438_4885;
	    i_18_ = (int) class438.aFloat4864;
	    i_19_ = (int) class438.aFloat4865;
	}
	Class159.method2612(class654_sub1.aByte10854, i_18_, i_19_, 0, i, bool,
			    bool_16_, 762441224);
    }
    
    public static void method775(byte i) {
	if (106 == Class65.anInt692 * 1114067909)
	    Class65.anInt692 = 1218165706;
    }
    
    static final void method776(Class669 class669, byte i) {
	class669.anInt8596 -= -2111195934;
	if (class669.aLongArray8587[class669.anInt8596 * 1572578961]
	    > class669.aLongArray8587[1 + 1572578961 * class669.anInt8596])
	    class669.anInt8613
		+= (class669.anIntArray8591[class669.anInt8613 * 662605117]
		    * -793595371);
    }
}
