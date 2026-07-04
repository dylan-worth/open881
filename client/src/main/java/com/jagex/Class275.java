/* Class275 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class275
{
    int[] anIntArray3041;
    
    public int method5145(int i, byte i_0_) {
	int i_1_ = (anIntArray3041.length >> 1) - 1;
	int i_2_ = i & i_1_;
	for (;;) {
	    int i_3_ = anIntArray3041[1 + (i_2_ + i_2_)];
	    if (-1 == i_3_)
		return -1;
	    if (anIntArray3041[i_2_ + i_2_] == i)
		return i_3_;
	    i_2_ = 1 + i_2_ & i_1_;
	}
    }
    
    public Class275(int[] is) {
	int i;
	for (i = 1; i <= is.length + (is.length >> 1); i <<= 1) {
	    /* empty */
	}
	anIntArray3041 = new int[i + i];
	for (int i_4_ = 0; i_4_ < i + i; i_4_++)
	    anIntArray3041[i_4_] = -1;
	for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
	    int i_6_;
	    for (i_6_ = is[i_5_] & i - 1;
		 -1 != anIntArray3041[1 + (i_6_ + i_6_)];
		 i_6_ = 1 + i_6_ & i - 1) {
		/* empty */
	    }
	    anIntArray3041[i_6_ + i_6_] = is[i_5_];
	    anIntArray3041[1 + (i_6_ + i_6_)] = i_5_;
	}
    }
    
    public int method5146(int i) {
	int i_7_ = (anIntArray3041.length >> 1) - 1;
	int i_8_ = i & i_7_;
	for (;;) {
	    int i_9_ = anIntArray3041[1 + (i_8_ + i_8_)];
	    if (-1 == i_9_)
		return -1;
	    if (anIntArray3041[i_8_ + i_8_] == i)
		return i_9_;
	    i_8_ = 1 + i_8_ & i_7_;
	}
    }
    
    static final int method5147(byte i) {
	return 0;
    }
    
    static Class534_Sub18_Sub8 method5148(byte[] is, byte i) {
	return new Class534_Sub18_Sub8(new Class534_Sub40(is),
				       Class283.anInterface18_3068);
    }
    
    static final void method5149(Class669 class669, int i) {
	int i_10_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_10_, -233305849);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_10_ >> 16];
	Class534_Sub20.method16195(class247, class243, false, 1, class669,
				   -2046778570);
    }
    
    static final void method5150(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	class669.anInt8600 -= 1235998252;
	class247.anInt2462
	    = (class669.anIntArray8595[class669.anInt8600 * 2088438307]
	       * -270518329);
	class247.anInt2463
	    = (class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1]
	       * 61142245);
	int i_11_
	    = class669.anIntArray8595[2 + class669.anInt8600 * 2088438307];
	if (i_11_ < 0)
	    i_11_ = 0;
	else if (i_11_ > 5)
	    i_11_ = 5;
	int i_12_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 3];
	if (i_12_ < 0)
	    i_12_ = 0;
	else if (i_12_ > 5)
	    i_12_ = 5;
	class247.aByte2458 = (byte) i_11_;
	class247.aByte2562 = (byte) i_12_;
	Class454.method7416(class247, -1198590075);
	Class519.method8649(class243, class247, 896611205);
	if (-1960530827 * class247.anInt2438 == 0)
	    Class606.method10054(class243, class247, false, -429510730);
	if (-1 == 1365669833 * class247.anInt2580 && !class243.aBool2413)
	    Class711_Sub2.method17257(-1278450723 * class247.anInt2454,
				      (short) -23855);
    }
    
    static void method5151(int i) {
	if (Class410.method6713(-1850530127 * client.anInt11039, (byte) 50)) {
	    if (client.aClass100_11094.method1867(-638525824) == null)
		Class673.method11110(13, -2105877179);
	    else
		Class673.method11110(9, 543816163);
	} else if (13 == -1850530127 * client.anInt11039
		   || -1850530127 * client.anInt11039 == 12)
	    Class673.method11110(15, -1181099246);
	else if (-1850530127 * client.anInt11039 == 14)
	    Class673.method11110(15, -492669996);
    }
}
