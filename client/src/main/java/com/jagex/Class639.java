/* Class639 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.net.Socket;

public class Class639
{
    static Class367 aClass367_8316 = null;
    static Socket aSocket8317;
    
    public static Class388 method10570(int i) {
	if (null != aClass367_8316)
	    return aClass367_8316.method6342((byte) -37)
		       .method6370(i, -2006993144);
	return null;
    }
    
    public static Class388 method10571(int i) {
	if (null != aClass367_8316)
	    return aClass367_8316.method6342((byte) -19)
		       .method6370(i, -1651617522);
	return null;
    }
    
    public static void method10572(Class652 class652) {
	if (class652.aClass376_8481 == Class376.aClass376_3910)
	    aClass367_8316 = new Class367_Sub1(class652);
	else if (class652.aClass376_8481 == Class376.aClass376_3909)
	    aClass367_8316 = new Class367_Sub2(class652);
	else
	    throw new RuntimeException();
    }
    
    public static void method10573(Class652 class652) {
	if (class652.aClass376_8481 == Class376.aClass376_3910)
	    aClass367_8316 = new Class367_Sub1(class652);
	else if (class652.aClass376_8481 == Class376.aClass376_3909)
	    aClass367_8316 = new Class367_Sub2(class652);
	else
	    throw new RuntimeException();
    }
    
    Class639() throws Throwable {
	throw new Error();
    }
    
    public static void method10574() {
	if (aClass367_8316 != null) {
	    aClass367_8316.method6343(-1845683625);
	    aClass367_8316 = null;
	}
    }
    
    public static void method10575() {
	if (aClass367_8316 != null) {
	    aClass367_8316.method6343(-1320547678);
	    aClass367_8316 = null;
	}
    }
    
    public static void method10576(int i, int i_0_, float f,
				   Interface42 interface42) {
	if (null != aClass367_8316)
	    aClass367_8316.method6342((byte) 4)
		.method6368(i, i_0_, f, interface42, (byte) -54);
    }
    
    public static Interface70 method10577(Class472 class472, int i,
					  Interface69 interface69,
					  boolean bool, Class203 class203) {
	if (aClass367_8316 != null) {
	    if (bool)
		return new Class600(class472, i, aClass367_8316, interface69);
	    return new Class614(class472, i, aClass367_8316, interface69,
				class203);
	}
	return null;
    }
    
    public static void method10578(int i, int i_1_, float f,
				   Interface42 interface42) {
	if (null != aClass367_8316)
	    aClass367_8316.method6342((byte) -8)
		.method6368(i, i_1_, f, interface42, (byte) -6);
    }
    
    public static Class388 method10579(int i) {
	if (null != aClass367_8316)
	    return aClass367_8316.method6342((byte) -71)
		       .method6370(i, -2110589137);
	return null;
    }
    
    public static void method10580(int i, int i_2_, float f,
				   Interface42 interface42) {
	if (null != aClass367_8316)
	    aClass367_8316.method6342((byte) -13)
		.method6368(i, i_2_, f, interface42, (byte) -43);
    }
    
    public static void method10581(Class652 class652) {
	if (class652.aClass376_8481 == Class376.aClass376_3910)
	    aClass367_8316 = new Class367_Sub1(class652);
	else if (class652.aClass376_8481 == Class376.aClass376_3909)
	    aClass367_8316 = new Class367_Sub2(class652);
	else
	    throw new RuntimeException();
    }
    
    public static boolean method10582(int i, int i_3_) {
	if (aClass367_8316 == null
	    || aClass367_8316.method6342((byte) 15) == null)
	    return false;
	if (i_3_ == i)
	    return true;
	Class388 class388
	    = aClass367_8316.method6342((byte) 15).method6370(i, -1711628391);
	Class388 class388_4_
	    = aClass367_8316.method6342((byte) 9).method6370(i_3_,
							     -2058323122);
	Class388 class388_5_ = class388;
    while_143_:
	do {
	    do {
		if (null == class388_5_)
		    break while_143_;
		class388_5_ = class388_5_.method6512(-2075814524);
		if (class388_4_ == class388_5_)
		    return true;
	    } while (class388 != class388_5_);
	    return false;
	} while (false);
	class388_5_ = class388_4_;
    while_144_:
	do {
	    do {
		if (null == class388_5_)
		    break while_144_;
		class388_5_ = class388_5_.method6512(-2075814524);
		if (class388_5_ == class388)
		    return true;
	    } while (class388_4_ != class388_5_);
	    return false;
	} while (false);
	return false;
    }
    
    public static void method10583() {
	if (aClass367_8316 != null) {
	    aClass367_8316.method6343(-1209567595);
	    aClass367_8316 = null;
	}
    }
    
    public static Class388 method10584(int i) {
	if (null != aClass367_8316)
	    return aClass367_8316.method6342((byte) -5)
		       .method6370(i, -1670334291);
	return null;
    }
    
    public static void method10585() {
	if (aClass367_8316 != null) {
	    aClass367_8316.method6343(-2096613736);
	    aClass367_8316 = null;
	}
    }
    
    public static Class388 method10586(int i) {
	if (null != aClass367_8316)
	    return aClass367_8316.method6342((byte) -3)
		       .method6370(i, -1659991922);
	return null;
    }
    
    static final void method10587(Class669 class669, byte i) {
	int i_6_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class415.anIntArray4666[i_6_ & 0xffff];
    }
    
    static final void method10588(Class669 class669, int i) {
	int i_7_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	if ((Class599.aClass298_Sub1_7871.method5388((byte) -19)
	     != Class305.aClass305_3265)
	    || (Class599.aClass298_Sub1_7871.method5425(2100173513)
		!= Class293.aClass293_3125))
	    throw new RuntimeException();
	Class347_Sub1 class347_sub1
	    = ((Class347_Sub1)
	       Class599.aClass298_Sub1_7871.method5380((byte) -107));
	Class706_Sub4 class706_sub4
	    = ((Class706_Sub4)
	       Class599.aClass298_Sub1_7871.method5381(2018756650));
	Class438 class438 = class347_sub1.method15760(-1117784507);
	Class438 class438_8_ = Class438.method6994(class438);
	class438_8_.aFloat4863 += (float) i_7_;
	Class438 class438_9_
	    = Class438.method7055(class706_sub4.method14236(308999563),
				  class438_8_);
	class438_9_.method7002();
	float f = class347_sub1.method15751((byte) 108).method7012();
	Class435.method6984(class706_sub4.method14236(308999563), class438_9_,
			    class438, f, Class679.aClass438Array8661);
	Object object = null;
	if (null == Class679.aClass438Array8661[0])
	    throw new RuntimeException("");
	Class438 class438_10_;
	if (Class679.aClass438Array8661[1] == null)
	    class438_10_ = Class679.aClass438Array8661[0];
	else if (Class438.method7055
		     (class706_sub4.method14236(308999563),
		      Class679.aClass438Array8661[0])
		     .method7012()
		 < Class438.method7055
		       (class706_sub4.method14236(308999563),
			Class679.aClass438Array8661[1])
		       .method7012())
	    class438_10_ = Class679.aClass438Array8661[1];
	else
	    class438_10_ = Class679.aClass438Array8661[0];
	float f_11_ = Class455.method7423((class438.aFloat4864
					   - class438_10_.aFloat4864),
					  (class438.aFloat4865
					   - class438_10_.aFloat4865),
					  (byte) 17);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 0;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (int) ((double) f_11_ * 2607.5945876176133) & 0x3fff;
    }
    
    static final void method10589(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub28_10788
		  .method17131(-1025145425);
    }
    
    static final void method10590(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class669.aClass352_8602.anInt3643 * -1394878511;
    }
}
