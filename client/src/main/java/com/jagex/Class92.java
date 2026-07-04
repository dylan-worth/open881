/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Random;

public class Class92
{
    static int[] anIntArray894;
    static Object anObject895 = new Object();
    static Random aRandom896;
    
    public static boolean method1729(int i) {
	return i == (i & -i);
    }
    
    static {
	anIntArray894 = new int[33];
	anIntArray894[0] = 0;
	int i = 2;
	for (int i_0_ = 1; i_0_ < 33; i_0_++) {
	    anIntArray894[i_0_] = i - 1;
	    i += i;
	}
    }
    
    Class92() throws Throwable {
	throw new Error();
    }
    
    public static int method1730(int i) {
	i = (i >>> 1 & 0x55555555) + (i & 0x55555555);
	i = (i & 0x33333333) + (i >>> 2 & 0x33333333);
	i = i + (i >>> 4) & 0xf0f0f0f;
	i += i >>> 8;
	i += i >>> 16;
	return i & 0xff;
    }
    
    public static int method1731(int i, int i_1_, int i_2_) {
	int i_3_ = Class211.method3958(i_2_ - i_1_ + 1, (byte) 2);
	i_3_ <<= i_1_;
	return i &= i_3_ ^ 0xffffffff;
    }
    
    public static boolean method1732(int i) {
	return i == (i & -i);
    }
    
    public static int method1733(int i, int i_4_, int i_5_) {
	int i_6_ = Class211.method3958(i_5_ - i_4_ + 1, (byte) 2);
	i_6_ <<= i_4_;
	i |= i_6_;
	return i;
    }
    
    public static int method1734(int i) {
	int i_7_ = i >>> 1;
	i_7_ |= i_7_ >>> 1;
	i_7_ |= i_7_ >>> 2;
	i_7_ |= i_7_ >>> 4;
	i_7_ |= i_7_ >>> 8;
	i_7_ |= i_7_ >>> 16;
	return i & (i_7_ ^ 0xffffffff);
    }
    
    public static int method1735(int i, int i_8_) {
	int i_9_ = 0;
	for (/**/; i_8_ > 0; i_8_--) {
	    i_9_ = i_9_ << 1 | i & 0x1;
	    i >>>= 1;
	}
	return i_9_;
    }
    
    public static int method1736(int i) {
	int i_10_ = i >>> 1;
	i_10_ |= i_10_ >>> 1;
	i_10_ |= i_10_ >>> 2;
	i_10_ |= i_10_ >>> 4;
	i_10_ |= i_10_ >>> 8;
	i_10_ |= i_10_ >>> 16;
	return i & (i_10_ ^ 0xffffffff);
    }
    
    public static int method1737(int i, int i_11_) {
	int i_12_ = 0;
	for (/**/; i_11_ > 0; i_11_--) {
	    i_12_ = i_12_ << 1 | i & 0x1;
	    i >>>= 1;
	}
	return i_12_;
    }
    
    public static boolean method1738(int i) {
	return i == (i & -i);
    }
    
    static int method1739(int i, int i_13_) {
	int i_14_ = i >> 31 & i_13_ - 1;
	return (i + (i >>> 31)) % i_13_ + i_14_;
    }
    
    public static int method1740(int i) {
	return anIntArray894[i];
    }
    
    public static int method1741(int i, int i_15_) {
	int i_16_ = 0;
	for (/**/; i_15_ > 0; i_15_--) {
	    i_16_ = i_16_ << 1 | i & 0x1;
	    i >>>= 1;
	}
	return i_16_;
    }
    
    public static int method1742(int i) {
	int i_17_ = i >>> 1;
	i_17_ |= i_17_ >>> 1;
	i_17_ |= i_17_ >>> 2;
	i_17_ |= i_17_ >>> 4;
	i_17_ |= i_17_ >>> 8;
	i_17_ |= i_17_ >>> 16;
	return i & (i_17_ ^ 0xffffffff);
    }
    
    static int method1743(int i, int i_18_) {
	int i_19_ = i >> 31 & i_18_ - 1;
	return (i + (i >>> 31)) % i_18_ + i_19_;
    }
    
    public static int method1744(int i, int i_20_, int i_21_) {
	int i_22_ = Class211.method3958(i_21_ - i_20_ + 1, (byte) 2);
	i_22_ <<= i_20_;
	i |= i_22_;
	return i;
    }
    
    static final void method1745(Class669 class669, byte i) {
	class669.anInt8600 -= 308999563;
    }
    
    static final void method1746(Class669 class669, int i) {
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub25_10750,
	     (class669.anIntArray8595
	      [(class669.anInt8600 -= 308999563) * 2088438307]) != 0 ? 1 : 0,
	     1999422991);
	Class672.method11096((byte) 1);
	client.aClass512_11100.method8441(1147415793);
    }
    
    static final void method1747(Class669 class669, byte i) {
	int i_23_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	int[] is = Class38.method974(i_23_, 1131109434);
	Class688.method13991(is, 0, class669.anIntArray8595,
			     class669.anInt8600 * 2088438307, 3);
	class669.anInt8600 += 926998689;
    }
}
