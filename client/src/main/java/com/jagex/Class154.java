/* Class154 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class154 implements Interface76
{
    static Class154 aClass154_1731;
    static Class154 aClass154_1732;
    static Class154 aClass154_1733;
    static Class154 aClass154_1734;
    static Class154 aClass154_1735 = new Class154(1, 1);
    static Class154 aClass154_1736;
    static Class154 aClass154_1737;
    int anInt1738;
    int anInt1739;
    static String aString1740;
    static Class177 aClass177_1741;
    
    static Class154[] method2573() {
	return new Class154[] { aClass154_1736, aClass154_1735, aClass154_1733,
				aClass154_1732, aClass154_1734, aClass154_1737,
				aClass154_1731 };
    }
    
    public int method93() {
	return 88152011 * anInt1739;
    }
    
    static {
	aClass154_1732 = new Class154(5, 2);
	aClass154_1733 = new Class154(6, 3);
	aClass154_1734 = new Class154(2, 4);
	aClass154_1731 = new Class154(0, 5);
	aClass154_1736 = new Class154(4, 6);
	aClass154_1737 = new Class154(3, 7);
    }
    
    public int method22() {
	return 88152011 * anInt1739;
    }
    
    public int method53() {
	return 88152011 * anInt1739;
    }
    
    Class154(int i, int i_0_) {
	anInt1738 = -186174197 * i;
	anInt1739 = 1676989923 * i_0_;
    }
    
    static Class154[] method2574() {
	return new Class154[] { aClass154_1736, aClass154_1735, aClass154_1733,
				aClass154_1732, aClass154_1734, aClass154_1737,
				aClass154_1731 };
    }
    
    public static String method2575(int i, int i_1_) {
	return new StringBuilder().append("<col=").append
		   (Integer.toHexString(i)).append
		   (">").toString();
    }
    
    static final void method2576(Class247 class247, Class243 class243,
				 Class669 class669, byte i) {
	class247.anInt2496 = -214166091;
	class247.anInt2497
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) * 931070365;
	Class454.method7416(class247, -1598935006);
	if (-1 == 1365669833 * class247.anInt2580 && !class243.aBool2413)
	    Class626.method10366(-1278450723 * class247.anInt2454, 943996980);
    }
    
    static void method2577(int i, int i_2_, int i_3_, int i_4_, Class8 class8,
			   boolean bool, int i_5_) {
	long l = (long) (i | (bool ? -2147483648 : 0));
	Class534_Sub5 class534_sub5
	    = (Class534_Sub5) Class534_Sub5.aClass9_10411.method579(l);
	if (class534_sub5 == null) {
	    class534_sub5 = new Class534_Sub5();
	    Class534_Sub5.aClass9_10411.method581(class534_sub5, l);
	}
	if (class534_sub5.anIntArray10414.length <= i_2_) {
	    int[] is = new int[i_2_ + 1];
	    int[] is_6_ = new int[i_2_ + 1];
	    Class8[] class8s = null;
	    if (null != class534_sub5.aClass8Array10416)
		class8s = new Class8[1 + i_2_];
	    for (int i_7_ = 0; i_7_ < class534_sub5.anIntArray10414.length;
		 i_7_++) {
		is[i_7_] = class534_sub5.anIntArray10414[i_7_];
		is_6_[i_7_] = class534_sub5.anIntArray10415[i_7_];
		if (class534_sub5.aClass8Array10416 != null)
		    class8s[i_7_] = class534_sub5.aClass8Array10416[i_7_];
	    }
	    for (int i_8_ = class534_sub5.anIntArray10414.length; i_8_ < i_2_;
		 i_8_++) {
		is[i_8_] = -1;
		is_6_[i_8_] = 0;
	    }
	    class534_sub5.anIntArray10414 = is;
	    class534_sub5.anIntArray10415 = is_6_;
	    class534_sub5.aClass8Array10416 = class8s;
	}
	class534_sub5.anIntArray10414[i_2_] = i_3_;
	class534_sub5.anIntArray10415[i_2_] = i_4_;
	if (null != class8) {
	    if (null == class534_sub5.aClass8Array10416)
		class534_sub5.aClass8Array10416
		    = new Class8[class534_sub5.anIntArray10414.length];
	    class534_sub5.aClass8Array10416[i_2_] = class8;
	} else if (null != class534_sub5.aClass8Array10416)
	    class534_sub5.aClass8Array10416[i_2_] = null;
    }
}
