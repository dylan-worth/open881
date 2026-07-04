/* Class179_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Map;

public class Class179_Sub1 extends Class179
{
    Class472 aClass472_9329;
    Class472 aClass472_9330;
    public static Map aMap9331;
    static int anInt9332;
    
    public Class179_Sub1(Class472 class472, Class472 class472_0_) {
	aClass472_9330 = class472;
	aClass472_9329 = class472_0_;
    }
    
    byte[] method2955(Class598 class598, int i, int i_1_) {
	if ((class598 == Class598.aClass598_7864
	     || class598 == Class598.aClass598_7865)
	    && aClass472_9330.method7677(i, (byte) -71))
	    return aClass472_9330.method7738(i, (byte) -34);
	if (class598 == Class598.aClass598_7866
	    && aClass472_9329.method7677(i, (byte) 89))
	    return aClass472_9329.method7738(i, (byte) -35);
	return null;
    }
    
    public boolean method152(Class598 class598, int i, Class613 class613,
			     float f, int i_2_, int i_3_, boolean bool) {
	boolean bool_4_ = true;
	if (class598 == Class598.aClass598_7865) {
	    if (aClass472_9329.method7677(i, (byte) 14))
		bool_4_ = aClass472_9329.method7670(i, (byte) -68);
	    return bool_4_ & aClass472_9330.method7670(i, (byte) -106);
	}
	if (class598 == Class598.aClass598_7864)
	    return aClass472_9330.method7670(i, (byte) -93);
	if (Class598.aClass598_7866 == class598)
	    return aClass472_9329.method7670(i, (byte) -60);
	return false;
    }
    
    public boolean method155(Class598 class598, int i, Class613 class613,
			     float f, int i_5_, int i_6_, boolean bool,
			     int i_7_) {
	boolean bool_8_ = true;
	if (class598 == Class598.aClass598_7865) {
	    if (aClass472_9329.method7677(i, (byte) 62))
		bool_8_ = aClass472_9329.method7670(i, (byte) -3);
	    return bool_8_ & aClass472_9330.method7670(i, (byte) -60);
	}
	if (class598 == Class598.aClass598_7864)
	    return aClass472_9330.method7670(i, (byte) -61);
	if (Class598.aClass598_7866 == class598)
	    return aClass472_9329.method7670(i, (byte) -123);
	return false;
    }
    
    public boolean method157(Class598 class598, int i, Class613 class613,
			     float f, int i_9_, int i_10_, boolean bool) {
	boolean bool_11_ = true;
	if (class598 == Class598.aClass598_7865) {
	    if (aClass472_9329.method7677(i, (byte) -67))
		bool_11_ = aClass472_9329.method7670(i, (byte) -22);
	    return bool_11_ & aClass472_9330.method7670(i, (byte) -102);
	}
	if (class598 == Class598.aClass598_7864)
	    return aClass472_9330.method7670(i, (byte) -53);
	if (Class598.aClass598_7866 == class598)
	    return aClass472_9329.method7670(i, (byte) -21);
	return false;
    }
    
    byte[] method2961(Class598 class598, int i) {
	if ((class598 == Class598.aClass598_7864
	     || class598 == Class598.aClass598_7865)
	    && aClass472_9330.method7677(i, (byte) -87))
	    return aClass472_9330.method7738(i, (byte) -111);
	if (class598 == Class598.aClass598_7866
	    && aClass472_9329.method7677(i, (byte) -31))
	    return aClass472_9329.method7738(i, (byte) -44);
	return null;
    }
    
    byte[] method2971(Class598 class598, int i) {
	if ((class598 == Class598.aClass598_7864
	     || class598 == Class598.aClass598_7865)
	    && aClass472_9330.method7677(i, (byte) 58))
	    return aClass472_9330.method7738(i, (byte) -107);
	if (class598 == Class598.aClass598_7866
	    && aClass472_9329.method7677(i, (byte) 18))
	    return aClass472_9329.method7738(i, (byte) -45);
	return null;
    }
    
    static final void method14980(Class669 class669, int i) {
	int i_12_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class172.aClass268_1824.method4876(0 != i_12_, (byte) -35);
    }
    
    static final void method14981(Class669 class669, byte i) {
	int i_13_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_13_, -100814445);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_13_ >> 16];
	Class331.method5857(class247, class243, class669, -1855482145);
    }
    
    public static void method14982(Class44_Sub1 class44_sub1, byte i) {
	Class468.aClass44_Sub1_5146 = class44_sub1;
    }
}
