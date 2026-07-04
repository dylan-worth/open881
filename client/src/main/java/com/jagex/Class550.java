/* Class550 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Stack;

public class Class550
{
    public Class654_Sub1 aClass654_Sub1_7303;
    static Stack aStack7304 = new Stack();
    boolean aBool7305;
    Class557 aClass557_7306;
    public static int anInt7307;
    
    static void method9021(Class550 class550) {
	class550.aClass654_Sub1_7303 = null;
	synchronized (aStack7304) {
	    if (aStack7304.size() < 200)
		aStack7304.push(class550);
	}
    }
    
    Class550() {
	/* empty */
    }
    
    public static Class550 method9022(boolean bool) {
	synchronized (aStack7304) {
	    Class550 class550;
	    if (aStack7304.isEmpty())
		class550 = new Class550();
	    else
		class550 = (Class550) aStack7304.pop();
	    class550.aBool7305 = bool;
	    Class550 class550_0_ = class550;
	    return class550_0_;
	}
    }
    
    public static Class550 method9023(boolean bool) {
	synchronized (aStack7304) {
	    Class550 class550;
	    if (aStack7304.isEmpty())
		class550 = new Class550();
	    else
		class550 = (Class550) aStack7304.pop();
	    class550.aBool7305 = bool;
	    Class550 class550_1_ = class550;
	    return class550_1_;
	}
    }
    
    static void method9024(Class550 class550) {
	class550.aClass654_Sub1_7303 = null;
	synchronized (aStack7304) {
	    if (aStack7304.size() < 200)
		aStack7304.push(class550);
	}
    }
    
    public boolean method9025(Class185 class185, int i, int i_2_, int i_3_) {
	int i_4_ = aClass654_Sub1_7303.method16847(110810603);
	if (null != aClass654_Sub1_7303.aClass194Array10852) {
	    for (int i_5_ = 0;
		 i_5_ < aClass654_Sub1_7303.aClass194Array10852.length;
		 i_5_++) {
		aClass654_Sub1_7303.aClass194Array10852[i_5_].anInt2147
		    <<= i_4_;
		if ((aClass654_Sub1_7303.aClass194Array10852[i_5_].method3798
		     (i + aClass557_7306.anInt7485 * 1061504705,
		      i_2_ + 28868363 * aClass557_7306.anInt7486))
		    && aClass654_Sub1_7303.method16846(class185, i, i_2_,
						       (byte) 76)) {
		    aClass654_Sub1_7303.aClass194Array10852[i_5_].anInt2147
			>>= i_4_;
		    return true;
		}
		aClass654_Sub1_7303.aClass194Array10852[i_5_].anInt2147
		    >>= i_4_;
	    }
	}
	return false;
    }
    
    public static void method9026() {
	synchronized (aStack7304) {
	    aStack7304 = new Stack();
	}
    }
    
    public static void method9027() {
	synchronized (aStack7304) {
	    aStack7304 = new Stack();
	}
    }
    
    public boolean method9028(Class185 class185, int i, int i_6_) {
	int i_7_ = aClass654_Sub1_7303.method16847(110810603);
	if (null != aClass654_Sub1_7303.aClass194Array10852) {
	    for (int i_8_ = 0;
		 i_8_ < aClass654_Sub1_7303.aClass194Array10852.length;
		 i_8_++) {
		aClass654_Sub1_7303.aClass194Array10852[i_8_].anInt2147
		    <<= i_7_;
		if ((aClass654_Sub1_7303.aClass194Array10852[i_8_].method3798
		     (i + aClass557_7306.anInt7485 * 1061504705,
		      i_6_ + 28868363 * aClass557_7306.anInt7486))
		    && aClass654_Sub1_7303.method16846(class185, i, i_6_,
						       (byte) 33)) {
		    aClass654_Sub1_7303.aClass194Array10852[i_8_].anInt2147
			>>= i_7_;
		    return true;
		}
		aClass654_Sub1_7303.aClass194Array10852[i_8_].anInt2147
		    >>= i_7_;
	    }
	}
	return false;
    }
    
    static Class17 method9029(Class15 class15, Class534_Sub40 class534_sub40,
			      int i, int i_9_) {
	Class17 class17 = new Class17(class15);
	int i_10_ = class534_sub40.method16527(-1480532182);
	boolean bool = (i_10_ & 0x1) != 0;
	boolean bool_11_ = (i_10_ & 0x2) != 0;
	boolean bool_12_ = 0 != (i_10_ & 0x4);
	boolean bool_13_ = 0 != (i_10_ & 0x8);
	if (bool) {
	    if (i <= 1) {
		class17.anIntArray198[0]
		    = class534_sub40.method16529((byte) 1);
		class17.anIntArray195[0]
		    = class534_sub40.method16529((byte) 1);
	    } else {
		class17.anIntArray198[0]
		    = class534_sub40.method16550((byte) -63);
		class17.anIntArray195[0]
		    = class534_sub40.method16550((byte) -63);
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
			= class534_sub40.method16550((byte) 28);
		    class17.anIntArray195[1]
			= class534_sub40.method16550((byte) -74);
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
			= class534_sub40.method16550((byte) -73);
		    class17.anIntArray195[2]
			= class534_sub40.method16550((byte) 20);
		}
	    }
	}
	if (bool_11_) {
	    if (i <= 1) {
		class17.anIntArray197[0]
		    = class534_sub40.method16529((byte) 1);
		class17.anIntArray200[0]
		    = class534_sub40.method16529((byte) 1);
	    } else {
		class17.anIntArray197[0]
		    = class534_sub40.method16550((byte) 21);
		class17.anIntArray200[0]
		    = class534_sub40.method16550((byte) -90);
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
			= class534_sub40.method16550((byte) 2);
		    class17.anIntArray200[1]
			= class534_sub40.method16550((byte) 2);
		}
	    }
	}
	if (bool_12_) {
	    int i_14_ = class534_sub40.method16529((byte) 1);
	    int[] is = new int[4];
	    is[0] = i_14_ & 0xf;
	    is[1] = i_14_ >> 4 & 0xf;
	    is[2] = i_14_ >> 8 & 0xf;
	    is[3] = i_14_ >> 12 & 0xf;
	    for (int i_15_ = 0; i_15_ < 4; i_15_++) {
		if (15 != is[i_15_])
		    class17.aShortArray199[is[i_15_]]
			= (short) class534_sub40.method16529((byte) 1);
	    }
	}
	if (bool_13_) {
	    int i_16_ = class534_sub40.method16527(-1259915527);
	    int[] is = new int[2];
	    is[0] = i_16_ & 0xf;
	    is[1] = i_16_ >> 4 & 0xf;
	    for (int i_17_ = 0; i_17_ < 2; i_17_++) {
		if (is[i_17_] != 15)
		    class17.aShortArray192[is[i_17_]]
			= (short) class534_sub40.method16529((byte) 1);
	    }
	}
	return class17;
    }
    
    public static Class603 method9030(Class534_Sub40 class534_sub40, int i) {
	int i_18_ = class534_sub40.method16527(1800712543);
	int[] is = new int[i_18_];
	for (int i_19_ = 0; i_19_ < i_18_; i_19_++)
	    is[i_19_] = class534_sub40.method16527(357709399);
	return new Class603(is);
    }
    
    static final void method9031(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
    }
}
