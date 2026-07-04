/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Random;

public class Class35
{
    public static int[] anIntArray280;
    static final int anInt281 = 12;
    static int anInt282;
    public static int[] anIntArray283;
    public static int anInt284;
    static Class478 aClass478_285 = new Class478(16, Class461.aClass461_5070);
    
    public static void method928(int i, int i_0_, byte i_1_) {
	if (anInt284 * 327132075 != i) {
	    anIntArray280 = new int[i];
	    for (int i_2_ = 0; i_2_ < i; i_2_++)
		anIntArray280[i_2_] = (i_2_ << 12) / i;
	    anInt284 = 1521368835 * i;
	}
	if (i_0_ != 123414429 * anInt282) {
	    if (i_0_ != anInt284 * 327132075) {
		anIntArray283 = new int[i_0_];
		for (int i_3_ = 0; i_3_ < i_0_; i_3_++)
		    anIntArray283[i_3_] = (i_3_ << 12) / i_0_;
	    } else
		anIntArray283 = anIntArray280;
	    anInt282 = 914593461 * i_0_;
	}
    }
    
    public static byte[] method929(int i, int i_4_) {
	byte[] is = ((byte[])
		     aClass478_285.method7793(Integer.valueOf(i), 2043769434));
	if (is == null) {
	    is = new byte[512];
	    Random random = new Random((long) i);
	    for (int i_5_ = 0; i_5_ < 255; i_5_++)
		is[i_5_] = (byte) i_5_;
	    for (int i_6_ = 0; i_6_ < 255; i_6_++) {
		int i_7_ = 255 - i_6_;
		int i_8_
		    = Class200_Sub21.method15637(random, i_7_, 1902134044);
		byte i_9_ = is[i_8_];
		is[i_8_] = is[i_7_];
		is[i_7_] = is[511 - i_6_] = i_9_;
	    }
	    aClass478_285.method7791(Integer.valueOf(i), is, -349469960);
	}
	return is;
    }
    
    Class35() throws Throwable {
	throw new Error();
    }
    
    public static void method930(int i, int i_10_) {
	if (anInt284 * 327132075 != i) {
	    anIntArray280 = new int[i];
	    for (int i_11_ = 0; i_11_ < i; i_11_++)
		anIntArray280[i_11_] = (i_11_ << 12) / i;
	    anInt284 = 1521368835 * i;
	}
	if (i_10_ != 123414429 * anInt282) {
	    if (i_10_ != anInt284 * 327132075) {
		anIntArray283 = new int[i_10_];
		for (int i_12_ = 0; i_12_ < i_10_; i_12_++)
		    anIntArray283[i_12_] = (i_12_ << 12) / i_10_;
	    } else
		anIntArray283 = anIntArray280;
	    anInt282 = 914593461 * i_10_;
	}
    }
    
    public static void method931(int i, int i_13_) {
	if (anInt284 * 327132075 != i) {
	    anIntArray280 = new int[i];
	    for (int i_14_ = 0; i_14_ < i; i_14_++)
		anIntArray280[i_14_] = (i_14_ << 12) / i;
	    anInt284 = 1521368835 * i;
	}
	if (i_13_ != 123414429 * anInt282) {
	    if (i_13_ != anInt284 * 327132075) {
		anIntArray283 = new int[i_13_];
		for (int i_15_ = 0; i_15_ < i_13_; i_15_++)
		    anIntArray283[i_15_] = (i_15_ << 12) / i_13_;
	    } else
		anIntArray283 = anIntArray280;
	    anInt282 = 914593461 * i_13_;
	}
    }
}
