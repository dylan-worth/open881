/* Class673 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class673
{
    public static float method11098(Class443 class443) {
	Class438 class438 = Class438.method6996(0.0F, 0.0F, 1.0F);
	class438.method7021(class443);
	double d = Math.atan2((double) class438.aFloat4864,
			      (double) class438.aFloat4865);
	class438.method7074();
	if (d < 0.0)
	    d = 3.141592653589793 + (d + 3.141592653589793);
	return (float) d;
    }
    
    public static float method11099(Class443 class443) {
	Class438 class438 = Class438.method6996(0.0F, 0.0F, 1.0F);
	class438.method7021(class443);
	double d
	    = 1.5707963267948966 - Math.acos((double) class438.aFloat4863);
	class438.method7074();
	return (float) d;
    }
    
    public static float method11100(Class443 class443) {
	Class438 class438 = Class438.method6996(0.0F, 0.0F, 1.0F);
	class438.method7021(class443);
	double d
	    = 1.5707963267948966 - Math.acos((double) class438.aFloat4863);
	class438.method7074();
	return (float) d;
    }
    
    public static float method11101(float f, float f_0_) {
	double d = Math.atan2((double) f, (double) f_0_);
	if (d < 0.0)
	    d = 3.141592653589793 + d + 3.141592653589793;
	return (float) d;
    }
    
    public static float method11102(float f, float f_1_) {
	double d = Math.atan2((double) f, (double) f_1_);
	if (d < 0.0)
	    d = 3.141592653589793 + d + 3.141592653589793;
	return (float) d;
    }
    
    public static float method11103(float f, float f_2_) {
	double d = Math.atan2((double) f, (double) f_2_);
	if (d < 0.0)
	    d = 3.141592653589793 + d + 3.141592653589793;
	return (float) d;
    }
    
    Class673() throws Throwable {
	throw new Error();
    }
    
    public static float method11104(Class443 class443) {
	Class438 class438 = Class438.method6996(0.0F, 0.0F, 1.0F);
	class438.method7021(class443);
	double d = Math.atan2((double) class438.aFloat4864,
			      (double) class438.aFloat4865);
	class438.method7074();
	if (d < 0.0)
	    d = 3.141592653589793 + (d + 3.141592653589793);
	return (float) d;
    }
    
    public static float method11105(Class443 class443) {
	Class438 class438 = Class438.method6996(0.0F, 0.0F, 1.0F);
	class438.method7021(class443);
	double d = Math.atan2((double) class438.aFloat4864,
			      (double) class438.aFloat4865);
	class438.method7074();
	if (d < 0.0)
	    d = 3.141592653589793 + (d + 3.141592653589793);
	return (float) d;
    }
    
    public static float method11106(Class443 class443) {
	Class438 class438 = Class438.method6996(0.0F, 0.0F, 1.0F);
	class438.method7021(class443);
	double d = Math.atan2((double) class438.aFloat4864,
			      (double) class438.aFloat4865);
	class438.method7074();
	if (d < 0.0)
	    d = 3.141592653589793 + (d + 3.141592653589793);
	return (float) d;
    }
    
    public static int method11107(Class443 class443) {
	Class438 class438 = Class438.method6996(0.0F, 0.0F, 1.0F);
	class438.method7021(class443);
	double d = Math.atan2((double) class438.aFloat4864,
			      (double) class438.aFloat4865);
	class438.method7074();
	if (d < 0.0)
	    d = 3.141592653589793 + (3.141592653589793 + d);
	return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
    }
    
    public static Class39 method11108(String string, int i, int i_3_) {
	Class39_Sub1 class39_sub1 = new Class39_Sub1();
	class39_sub1.aString305 = string;
	class39_sub1.anInt306 = i * -766230073;
	return class39_sub1;
    }
    
    static final void method11109(Class669 class669, int i) {
	class669.anInt8600 -= 926998689;
	int i_4_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_5_
	    = class669.anIntArray8595[1 + 2088438307 * class669.anInt8600];
	int i_6_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 2];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aClass219_11338.method4120(i_4_, (byte) 13)
		  .method4376(i_5_, i_6_, (short) 17127) == null ? 0 : 1;
    }
    
    public static void method11110(int i, int i_7_) {
	if (i != -1850530127 * client.anInt11039) {
	    client.anInt11061 = 0;
	    if (16 == -1850530127 * client.anInt11039 && i != 3)
		Class102.method1903(2099034274);
	    if (i == 5 || 1 == i)
		Class388.method6525(-1214199341);
	    if (i != 5 && null != Class369.aClass546_3869) {
		Class369.aClass546_3869.method8975(194313985);
		Class369.aClass546_3869 = null;
	    }
	    if (i == 15) {
		Class706.method14252((18 == -1850530127 * client.anInt11039
				      || 19 == -1850530127 * client.anInt11039
				      || (-993629849 * client.anInt11185
					  != 143908383 * (Class620
							  .aClass632_8113
							  .anInt8225))),
				     1773505533);
		Class263.method4833(-1191509262);
	    }
	    if (9 == i) {
		boolean bool;
		if (-1 == Class620.aClass632_8113.anInt8235 * -811037593)
		    bool = (13 == client.anInt11039 * -1850530127
			    || -1850530127 * client.anInt11039 == 14);
		else
		    bool = (-993629849 * client.anInt11185
			    != Class620.aClass632_8113.anInt8235 * -811037593);
		Class453.method7407(bool, (byte) 123);
	    }
	    if (i == 13 || i == 14) {
		if (!Class499.method8273(1936169113))
		    return;
	    } else if (12 == i
		       || i == 7 && -1850530127 * client.anInt11039 != 6) {
		if (!Class388.method6525(403413177))
		    return;
	    } else if (i == 19)
		Class659.method10916((byte) -25);
	    if (Class108.method1969(i, (byte) 0)) {
		client.aClass512_11100.method8532((byte) 123);
		client.aClass512_11100.aLong5711 = 2452396203634292367L;
	    }
	    if (3 == i || i == 15)
		Class437.method6989(1512990682);
	    boolean bool = (i == 4 || Class250.method4611(i, (byte) -1)
			    || Class192.method3789(i, -2095701415));
	    boolean bool_8_
		= (client.anInt11039 * -1850530127 == 4
		   || Class250.method4611(client.anInt11039 * -1850530127,
					  (byte) -1)
		   || Class192.method3789(client.anInt11039 * -1850530127,
					  -1614540948));
	    if (bool != bool_8_)
		Class6.aClass450_56.method7338(!bool, 2061785841);
	    if (Class108.method1969(i, (byte) 0) || i == 5 || 1 == i)
		Class254.aClass185_2683.method3268();
	    client.anInt11039 = i * 735142481;
	}
    }
    
    public static int method11111(int i, int i_9_, int i_10_, int i_11_) {
	i_10_ &= 0x3;
	if (i_10_ == 0)
	    return i_9_;
	if (1 == i_10_)
	    return 4095 - i;
	if (2 == i_10_)
	    return 4095 - i_9_;
	return i;
    }
}
