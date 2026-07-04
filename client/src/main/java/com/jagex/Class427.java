/* Class427 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class427
{
    public static final int anInt4799 = 14;
    public static final int anInt4800 = 16383;
    public static final int anInt4801 = 16383;
    public static final double aDouble4802 = 2607.5945876176133;
    public static final int anInt4803 = 16384;
    public static final int anInt4804 = 1024;
    public static int[] anIntArray4805;
    public static int[] anIntArray4806 = new int[16384];
    public static final int anInt4807 = 2048;
    public static final int anInt4808 = 4096;
    public static final int anInt4809 = 14;
    public static final int anInt4810 = 6144;
    public static final int anInt4811 = 10240;
    public static final int anInt4812 = 12288;
    public static final int anInt4813 = 14336;
    public static final int anInt4814 = 16384;
    public static final int anInt4815 = 8192;
    public static final int anInt4816 = 16384;
    
    Class427() throws Throwable {
	throw new Error();
    }
    
    public static float method6799(int i) {
	i &= 0x3fff;
	return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
    }
    
    static {
	anIntArray4805 = new int[16384];
	double d = 3.834951969714103E-4;
	for (int i = 0; i < 16384; i++) {
	    anIntArray4806[i] = (int) (16384.0 * Math.sin((double) i * d));
	    anIntArray4805[i] = (int) (16384.0 * Math.cos((double) i * d));
	}
    }
}
