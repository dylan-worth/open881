/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class30
{
    public static Class30 aClass30_268;
    public static Class30 aClass30_269 = new Class30();
    public static Class30 aClass30_270;
    public static Class30 aClass30_271;
    
    static void method879(Class247 class247, Class145 class145, int i,
			  int i_0_, int i_1_, int i_2_, Class163 class163,
			  double d, Class284 class284, Class280 class280,
			  int i_3_) {
	if (null != class163) {
	    int i_4_;
	    if (3 == Class10.anInt75 * -891094135)
		i_4_ = ((int) ((double) Class599.aClass298_Sub1_7871
					    .method5389(-1133155790)
			       * 2607.5945876176133)
			+ -2045337339 * client.anInt11189) & 0x3fff;
	    else if (Class10.anInt75 * -891094135 == 5)
		i_4_ = (int) client.aFloat11140 & 0x3fff;
	    else
		i_4_ = ((int) client.aFloat11140
			+ -2045337339 * client.anInt11189) & 0x3fff;
	    int i_5_ = (Math.max(-881188269 * class247.anInt2468 / 2,
				 class247.anInt2469 * -1279656873 / 2)
			+ 10);
	    int i_6_ = i_1_ * i_1_ + i_2_ * i_2_;
	    if (i_6_ <= i_5_ * i_5_) {
		int i_7_ = Class427.anIntArray4806[i_4_];
		int i_8_ = Class427.anIntArray4805[i_4_];
		if (-891094135 * Class10.anInt75 != 5) {
		    i_7_
			= i_7_ * 256 / (256 + client.anInt11022 * -2002513841);
		    i_8_
			= 256 * i_8_ / (256 + -2002513841 * client.anInt11022);
		}
		int i_9_ = i_8_ * i_1_ + i_7_ * i_2_ >> 14;
		int i_10_ = i_8_ * i_2_ - i_7_ * i_1_ >> 14;
		double d_11_ = d / 100.0;
		switch (-1448550931 * class284.anInt3069) {
		case 0:
		    i = (i + -881188269 * class247.anInt2468 / 2 + i_9_
			 - (int) ((double) class163.method22() * d_11_));
		    break;
		case 2:
		    i = -881188269 * class247.anInt2468 / 2 + i + i_9_;
		    break;
		case 1:
		    i = (-881188269 * class247.anInt2468 / 2 + i + i_9_
			 - (int) ((double) (class163.method22() / 2) * d_11_));
		    break;
		}
		switch (-1863758235 * class280.anInt3057) {
		case 2:
		    i_0_ = (class247.anInt2469 * -1279656873 / 2 + i_0_ - i_10_
			    - (int) ((double) (class163.method2692() / 2)
				     * d_11_));
		    break;
		case 0:
		    i_0_ = (i_0_ + -1279656873 * class247.anInt2469 / 2 - i_10_
			    - (int) ((double) class163.method2692() * d_11_));
		    break;
		case 1:
		    i_0_ = -1279656873 * class247.anInt2469 / 2 + i_0_ - i_10_;
		    break;
		}
		if (class145 != null) {
		    if (1.0 == d_11_)
			class163.method2691(i, i_0_, class145, i, i_0_);
		    else
			class163.method2659(i, i_0_,
					    (int) ((double) class163.method22()
						   * d_11_),
					    (int) ((double) class163
								.method2692()
						   * d_11_));
		} else {
		    if (1.0 == d_11_)
			class163.method2656(i, i_0_);
		    class163.method2659(i, i_0_,
					(int) ((double) class163.method22()
					       * d_11_),
					(int) ((double) class163.method2692()
					       * d_11_));
		}
	    }
	}
    }
    
    static {
	aClass30_268 = new Class30();
	aClass30_270 = new Class30();
	aClass30_271 = new Class30();
    }
    
    static final void method880(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class70.method1411(class247, class243, class669, 16711935);
    }
    
    Class30() {
	/* empty */
    }
    
    static final void method881(Class669 class669, int i) {
	Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
	    = ((Class654_Sub1_Sub5_Sub1_Sub1)
	       class669.aClass654_Sub1_Sub5_Sub1_8604);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 1691897137 * class654_sub1_sub5_sub1_sub1.anInt12192;
    }
    
    public static Object method882(byte[] is, boolean bool, int i) {
	if (is == null)
	    return null;
	if (is.length > 136) {
	    ByteBuffer bytebuffer = ByteBuffer.allocateDirect(is.length);
	    bytebuffer.position(0);
	    bytebuffer.put(is);
	    return bytebuffer;
	}
	if (bool)
	    return Arrays.copyOf(is, is.length);
	return is;
    }
    
    static final void method883(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_12_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_13_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class2.method511(i_12_, i_13_, true, -2072447750);
    }
    
    public static final void method884(String string, int i) {
	if (!string.equals("")) {
	    Class100 class100 = Class201.method3864(2095398292);
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4223,
				      class100.aClass13_1183, 1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16506
		(Class668.method11029(string, (byte) 0), 1459589982);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16713(string,
								  2078918127);
	    class100.method1863(class534_sub19, (byte) 80);
	}
    }
    
    static final void method885(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class263.method4831(class247, class243, class669,
			    Class253.aClass253_2662, (byte) 25);
    }
    
    public static Class446 method886(int i) {
	Class446 class446 = new Class446();
	class446.method7244(0.0F, 1.0F, 0.0F,
			    (float) (Math.random() * 3.141592653589793 * 2.0));
	float f = (float) (0.5 + 0.5 * Math.random()) * 256.0F;
	class446.method7287(f - 128.0F, 0.0F, 0.0F);
	class446.method7245(0.0F, 1.0F, 0.0F,
			    (float) (Math.random() * 3.141592653589793 * 2.0));
	return class446;
    }
}
