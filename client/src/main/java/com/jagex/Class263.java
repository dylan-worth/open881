/* Class263 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class263
{
    byte[] aByteArray2802;
    int anInt2803;
    
    String method4825() {
	int i = method4830(2088438307);
	if (-1 == i)
	    return null;
	if (i > 256)
	    throw new RuntimeException_Sub2();
	String string = new String(aByteArray2802, 1138774363 * anInt2803, i);
	anInt2803 += i * 1466398419;
	return string;
    }
    
    Class263(byte[] is) {
	aByteArray2802 = is;
	anInt2803 = 0;
    }
    
    String method4826(int i) {
	int i_0_ = method4830(2088438307);
	if (-1 == i_0_)
	    return null;
	if (i_0_ > 256)
	    throw new RuntimeException_Sub2();
	String string
	    = new String(aByteArray2802, 1138774363 * anInt2803, i_0_);
	anInt2803 += i_0_ * 1466398419;
	return string;
    }
    
    int method4827() {
	short i = 0;
	for (int i_1_ = 0; i_1_ < 2; i_1_++)
	    i |= (aByteArray2802[(anInt2803 += 1466398419) * 1138774363 - 1]
		  & 0xff) << i_1_ * 8;
	return i;
    }
    
    int method4828() {
	short i = 0;
	for (int i_2_ = 0; i_2_ < 2; i_2_++)
	    i |= (aByteArray2802[(anInt2803 += 1466398419) * 1138774363 - 1]
		  & 0xff) << i_2_ * 8;
	return i;
    }
    
    String method4829() {
	int i = method4830(2088438307);
	if (-1 == i)
	    return null;
	if (i > 256)
	    throw new RuntimeException_Sub2();
	String string = new String(aByteArray2802, 1138774363 * anInt2803, i);
	anInt2803 += i * 1466398419;
	return string;
    }
    
    int method4830(int i) {
	short i_3_ = 0;
	for (int i_4_ = 0; i_4_ < 2; i_4_++)
	    i_3_ |= (aByteArray2802[(anInt2803 += 1466398419) * 1138774363 - 1]
		     & 0xff) << i_4_ * 8;
	return i_3_;
    }
    
    static final void method4831(Class247 class247, Class243 class243,
				 Class669 class669, Class253 class253,
				 byte i) {
	int i_5_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	switch (1705314695 * class253.anInt2666) {
	case 1:
	    class247.aString2495
		= client.aClass214_11359.method4044(i_5_, 1481307617)
		      .method3979(995477553);
	    break;
	case 4:
	    class247.aString2495
		= ((Class225)
		   client.aClass214_11359.method4074(1835907383).get(i_5_))
		      .method4169(-764677583);
	    break;
	default:
	    throw new IllegalStateException();
	case 0:
	    if (-1050164879 * client.anInt11171 == 2
		&& i_5_ < client.anInt11324 * -1979292205)
		class247.aString2495
		    = client.aClass28Array11327[i_5_].aString257;
	    else
		return;
	    break;
	case 2:
	    if (null != Class168.aClass98Array1792
		&& i_5_ < Class168.aClass98Array1792.length)
		class247.aString2495
		    = Class168.aClass98Array1792[i_5_].aString1165;
	    break;
	case 3:
	case 5:
	    class247.aString2495 = (class669.aClass534_Sub26_8606
				    .aClass337Array10579[i_5_].aString3523);
	}
	class247.aClass253_2609 = class253;
    }
    
    public static Class702[] method4832(int i) {
	return (new Class702[]
		{ Class702.aClass702_8815, Class702.aClass702_8812,
		  Class702.aClass702_8813, Class702.aClass702_8814,
		  Class702.aClass702_8811 });
    }
    
    public static void method4833(int i) {
	Class274.aMap3037.clear();
	Class274.aClass9_3036.method578((byte) 72);
	Class274.aClass696_3038.method14075(958896847);
	Class274.anInt3035 = 0;
    }
    
    static final void method4834(Class669 class669, byte i) {
	int i_6_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_6_, 1831309873);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_6_ >> 16];
	Class204.method3907(class247, class243, class669, -16777216);
    }
    
    static void method4835(Class534_Sub18_Sub11 class534_sub18_sub11, int i,
			   byte i_7_) {
	if (Class72.aBool758) {
	    Class16 class16 = Class160.method2620(1770101340);
	    int i_8_ = 0;
	    for (Class534_Sub18_Sub7 class534_sub18_sub7
		     = (Class534_Sub18_Sub7) class534_sub18_sub11
						 .aClass696_11794
						 .method14078(1221951837);
		 null != class534_sub18_sub7;
		 class534_sub18_sub7
		     = (Class534_Sub18_Sub7) class534_sub18_sub11
						 .aClass696_11794
						 .method14080((byte) 28)) {
		int i_9_ = Class281.method5236(class534_sub18_sub7, class16,
					       -1875140451);
		if (i_9_ > i_8_)
		    i_8_ = i_9_;
	    }
	    i_8_ += 8;
	    int i_10_
		= 21 + (-238165825 * Class72.anInt754
			* (-475442105 * class534_sub18_sub11.anInt11795));
	    Class281.anInt3062
		= 2050568967 * ((-238165825 * Class72.anInt754
				 * (class534_sub18_sub11.anInt11795
				    * -475442105))
				+ (Class72.aBool784 ? 26 : 22));
	    int i_11_ = (Class641.anInt8340 * -1739196959
			 + Class627.anInt8175 * -620506573);
	    if (i_11_ + i_8_ > 1771907305 * Class706_Sub4.anInt10994)
		i_11_ = -620506573 * Class627.anInt8175 - i_8_;
	    if (i_11_ < 0)
		i_11_ = 0;
	    int i_12_ = (Class72.aBool784
			 ? 1 + (102396103 * class16.anInt190 + 20) : 31);
	    int i_13_ = 1 + (i - i_12_ + 102396103 * class16.anInt190);
	    if (i_13_ + i_10_ > Class18.anInt205 * -1091172141)
		i_13_ = -1091172141 * Class18.anInt205 - i_10_;
	    if (i_13_ < 0)
		i_13_ = 0;
	    Class112.anInt1364 = -228643305 * i_11_;
	    Class150.anInt1699 = i_13_ * 1135371673;
	    Class536_Sub4.anInt10366 = i_8_ * 1938836795;
	    Class72.aClass534_Sub18_Sub11_760 = class534_sub18_sub11;
	}
    }
    
    static final void method4836(Class669 class669, int i) {
	class669.anInt8600 -= 1853997378;
	int i_14_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	if (i_14_ >= 2)
	    throw new RuntimeException();
	client.anInt11152 = -1871523627 * i_14_;
	int i_15_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	if (i_15_ + 1 >= (client.anIntArrayArrayArray11151
			  [-1351358339 * client.anInt11152]).length >> 1)
	    throw new RuntimeException();
	client.anInt11052 = -2114709439 * i_15_;
	client.anInt11156 = 0;
	client.anInt11034
	    = (class669.anIntArray8595[class669.anInt8600 * 2088438307 + 2]
	       * 1740105663);
	client.anInt11266
	    = (-24061415
	       * class669.anIntArray8595[2088438307 * class669.anInt8600 + 3]);
	int i_16_
	    = class669.anIntArray8595[4 + 2088438307 * class669.anInt8600];
	if (i_16_ >= 2)
	    throw new RuntimeException();
	client.anInt11153 = 378787251 * i_16_;
	int i_17_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 5];
	if (i_17_ + 1 >= (client.anIntArrayArrayArray11151
			  [1614995835 * client.anInt11153]).length >> 1)
	    throw new RuntimeException();
	client.anInt11080 = i_17_ * -1920101379;
	Class10.anInt75 = -1822037319;
	Class106.anInt1312 = 309821991;
	Class93.anInt901 = 1899572639;
    }
}
