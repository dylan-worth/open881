/* Class181 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class181
{
    public static Class181 aClass181_1951;
    public static Class181 aClass181_1952;
    public int anInt1953;
    public static Class181 aClass181_1954;
    static Class181 aClass181_1955;
    public static Class181 aClass181_1956;
    static Class181 aClass181_1957;
    public static Class181 aClass181_1958;
    public static Class181 aClass181_1959 = new Class181(4, 3);
    public static Class181 aClass181_1960;
    public static Class181 aClass181_1961;
    public int anInt1962;
    
    static {
	aClass181_1952 = new Class181(0, 4);
	aClass181_1951 = new Class181(8, 1);
	aClass181_1954 = new Class181(6, 1);
	aClass181_1961 = new Class181(1, 2);
	aClass181_1956 = new Class181(3, 1);
	aClass181_1957 = new Class181(5, 3);
	aClass181_1955 = new Class181(9, 4);
	aClass181_1958 = new Class181(7, 1);
	aClass181_1960 = new Class181(2, 1);
    }
    
    Class181(int i, int i_0_) {
	anInt1953 = 647220571 * i;
	anInt1962 = -1101597561 * i_0_;
    }
    
    public static boolean method2979(int i, byte i_1_) {
	return (i >= Class595.aClass595_7839.anInt7852 * 847393323
		&& i <= 847393323 * Class595.aClass595_7844.anInt7852);
    }
    
    static final void method2980(Class247 class247, Class243 class243,
				 Class669 class669, byte i) {
	class247.aBool2501
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) == 1;
	Class454.method7416(class247, -1229369767);
	if (-1 == class247.anInt2580 * 1365669833 && !class243.aBool2413)
	    Class606.method10053(-1278450723 * class247.anInt2454, 1470590307);
    }
    
    static final void method2981(Class247 class247, Class243 class243,
				 Class669 class669, short i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (Class546.method8989(string, class669, -219410121) != null)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2603
	    = Class99.method1859(string, class669, 1722928738);
	class247.aBool2561 = true;
    }
    
    static final void method2982(Class669 class669, int i)
	throws Exception_Sub2 {
	class669.anInt8600 -= 926998689;
	int i_2_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_3_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	int i_4_
	    = class669.anIntArray8595[2 + class669.anInt8600 * 2088438307];
	float f = (float) (2.0 * Math.atan((double) ((float) i_2_ / 2.0F
						     / (float) i_4_)));
	float f_5_ = (float) (2.0 * Math.atan((double) ((float) i_3_ / 2.0F
							/ (float) i_4_)));
	Class599.aClass298_Sub1_7871.method5370(f, f_5_, (byte) -6);
    }
    
    static void method2983(Class185 class185, Class145 class145,
			   Class247 class247, int i, int i_6_, int i_7_,
			   int i_8_, int i_9_, byte i_10_) {
	Class272 class272
	    = ((Class272)
	       Class222.aClass44_Sub9_2313.method91(i_9_, -394506750));
	if (null != class272 && class272.anIntArray2981 != null
	    && class272.method5063(Class78.aClass103_825,
				   Class78.aClass103_825, (short) 30424))
	    class272 = class272.method5052(Class78.aClass103_825,
					   Class78.aClass103_825, 798397243);
	if (null != class272 && class272.aBool2979
	    && class272.method5063(Class78.aClass103_825,
				   Class78.aClass103_825, (short) 11721)) {
	    if (null != class272.anIntArray2992) {
		int[] is = new int[class272.anIntArray2992.length];
		for (int i_11_ = 0; i_11_ < is.length / 2; i_11_++) {
		    int i_12_;
		    if (3 == -891094135 * Class10.anInt75)
			i_12_ = ((int) ((double) Class599
						     .aClass298_Sub1_7871
						     .method5389(-1149694557)
					* 2607.5945876176133)
				 + client.anInt11189 * -2045337339) & 0x3fff;
		    else if (5 == Class10.anInt75 * -891094135)
			i_12_ = (int) client.aFloat11140 & 0x3fff;
		    else
			i_12_ = ((int) client.aFloat11140
				 + client.anInt11189 * -2045337339) & 0x3fff;
		    int i_13_ = Class427.anIntArray4806[i_12_];
		    int i_14_ = Class427.anIntArray4805[i_12_];
		    if (-891094135 * Class10.anInt75 != 5) {
			i_13_ = i_13_ * 256 / (client.anInt11022 * -2002513841
					       + 256);
			i_14_ = (i_14_ * 256
				 / (256 + client.anInt11022 * -2002513841));
		    }
		    is[i_11_ * 2]
			= (i + class247.anInt2468 * -881188269 / 2
			   + ((i_14_ * (i_7_ + 4 * (class272.anIntArray2992
						    [2 * i_11_]))
			       + (class272.anIntArray2992[i_11_ * 2 + 1] * 4
				  + i_8_) * i_13_)
			      >> 14));
		    is[1 + i_11_ * 2]
			= (class247.anInt2469 * -1279656873 / 2 + i_6_
			   - ((((i_8_
				 + 4 * class272.anIntArray2992[i_11_ * 2 + 1])
				* i_14_)
			       - ((i_7_
				   + 4 * class272.anIntArray2992[2 * i_11_])
				  * i_13_))
			      >> 14));
		}
		Class246 class246 = class247.method4525(class185, 447549967);
		if (null != class246)
		    Class182.method2992(class185, is,
					class272.anInt2997 * 1393455813,
					class246.anIntArray2422,
					class246.anIntArray2421);
		if (685328963 * class272.anInt3011 > 0) {
		    for (int i_15_ = 0; i_15_ < is.length / 2 - 1; i_15_++) {
			int i_16_ = is[2 * i_15_];
			int i_17_ = is[i_15_ * 2 + 1];
			int i_18_ = is[2 * (1 + i_15_)];
			int i_19_ = is[2 * (i_15_ + 1) + 1];
			if (i_18_ < i_16_) {
			    int i_20_ = i_16_;
			    int i_21_ = i_17_;
			    i_16_ = i_18_;
			    i_17_ = i_19_;
			    i_18_ = i_20_;
			    i_19_ = i_21_;
			} else if (i_16_ == i_18_ && i_19_ < i_17_) {
			    int i_22_ = i_17_;
			    i_17_ = i_19_;
			    i_19_ = i_22_;
			}
			if (null != class145)
			    class185.method3306
				(i_16_, i_17_, i_18_, i_19_,
				 (class272.anIntArray2986
				  [class272.aByteArray3006[i_15_] & 0xff]),
				 1, class145, i, i_6_,
				 class272.anInt3011 * 685328963,
				 1781521033 * class272.anInt2999,
				 class272.anInt3000 * 290033855);
			else
			    class185.method3305
				(i_16_, i_17_, i_18_, i_19_,
				 (class272.anIntArray2986
				  [class272.aByteArray3006[i_15_] & 0xff]),
				 1, class272.anInt3011 * 685328963,
				 1781521033 * class272.anInt2999,
				 290033855 * class272.anInt3000);
		    }
		    int i_23_ = is[is.length - 2];
		    int i_24_ = is[is.length - 1];
		    int i_25_ = is[0];
		    int i_26_ = is[1];
		    if (i_25_ < i_23_) {
			int i_27_ = i_23_;
			int i_28_ = i_24_;
			i_23_ = i_25_;
			i_24_ = i_26_;
			i_25_ = i_27_;
			i_26_ = i_28_;
		    } else if (i_23_ == i_25_ && i_26_ < i_24_) {
			int i_29_ = i_24_;
			i_24_ = i_26_;
			i_26_ = i_29_;
		    }
		    if (class145 != null)
			class185.method3306(i_23_, i_24_, i_25_, i_26_,
					    (class272.anIntArray2986
					     [(class272.aByteArray3006
					       [(class272.aByteArray3006.length
						 - 1)]) & 0xff]),
					    1, class145, i, i_6_,
					    class272.anInt3011 * 685328963,
					    class272.anInt2999 * 1781521033,
					    290033855 * class272.anInt3000);
		    else
			class185.method3305(i_23_, i_24_, i_25_, i_26_,
					    (class272.anIntArray2986
					     [(class272.aByteArray3006
					       [(class272.aByteArray3006.length
						 - 1)]) & 0xff]),
					    1, 685328963 * class272.anInt3011,
					    1781521033 * class272.anInt2999,
					    class272.anInt3000 * 290033855);
		} else if (null != class145) {
		    for (int i_30_ = 0; i_30_ < is.length / 2 - 1; i_30_++)
			class185.method3384(is[i_30_ * 2], is[1 + 2 * i_30_],
					    is[2 * (i_30_ + 1)],
					    is[2 * (1 + i_30_) + 1],
					    (class272.anIntArray2986
					     [(class272.aByteArray3006[i_30_]
					       & 0xff)]),
					    1, class145, i, i_6_);
		    class185.method3384(is[is.length - 2], is[is.length - 1],
					is[0], is[1],
					(class272.anIntArray2986
					 [(class272.aByteArray3006
					   [(class272.aByteArray3006.length
					     - 1)]) & 0xff]),
					1, class145, i, i_6_);
		} else {
		    for (int i_31_ = 0; i_31_ < is.length / 2 - 1; i_31_++)
			class185.method3303(is[2 * i_31_], is[1 + i_31_ * 2],
					    is[2 * (1 + i_31_)],
					    is[2 * (1 + i_31_) + 1],
					    (class272.anIntArray2986
					     [(class272.aByteArray3006[i_31_]
					       & 0xff)]),
					    1);
		    class185.method3303(is[is.length - 2], is[is.length - 1],
					is[0], is[1],
					(class272.anIntArray2986
					 [(class272.aByteArray3006
					   [(class272.aByteArray3006.length
					     - 1)]) & 0xff]),
					1);
		}
	    }
	    Class163 class163 = null;
	    if (-1 != 1747122653 * class272.anInt2967) {
		class163 = class272.method5047(class185, false, -426638603);
		if (class163 != null) {
		    int i_32_
			= (class272.anInt3007 * 1484992485 > 0
			   ? class272.anInt3007 * 1484992485
			   : 1515024757 * Class620.aClass632_8113.anInt8267);
		    Class30.method879(class247, class145, i, i_6_, i_7_, i_8_,
				      class163, (double) i_32_,
				      class272.aClass284_3003,
				      class272.aClass280_3004, -617339663);
		}
	    }
	    if (null != class272.aString2969) {
		int i_33_ = 0;
		if (null != class163)
		    i_33_ = class163.method2649();
		Class171 class171 = Class219.aClass171_2307;
		Class16 class16 = Class690_Sub9.aClass16_10875;
		if (class272.anInt2985 * 638004337 == 1) {
		    class171 = Class539_Sub1.aClass171_10327;
		    class16 = Class67.aClass16_720;
		}
		if (class272.anInt2985 * 638004337 == 2) {
		    class171 = Class231.aClass171_2325;
		    class16 = Class322.aClass16_3420;
		}
		Class575.method9758(class247, class145, i, i_6_, i_7_, i_8_,
				    i_33_, class272.aString2969, class171,
				    class16, -1512587879 * class272.anInt2970,
				    (byte) 1);
	    }
	}
    }
}
