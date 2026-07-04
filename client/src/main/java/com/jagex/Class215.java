/* Class215 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.net.URL;

class Class215 implements Interface69
{
    Class232 this$0;
    static int anInt2297;
    
    public void method441(Interface70 interface70, int i, int i_0_,
			  boolean bool, int i_1_) {
	this$0.method4213(1659888447).add(interface70);
	if (bool)
	    this$0.method4215(1516154793).method3893(interface70, (long) i_0_);
	else
	    this$0.method4214((byte) 110).method3881(interface70, (long) i_0_,
						     interface70
							 .method456((byte) 6),
						     1193383020);
    }
    
    public void method443(Interface70 interface70) {
	if (interface70 != null)
	    this$0.method4214((byte) 70)
		.method3871((long) interface70.method30(1182724837));
    }
    
    public void method440(Interface70 interface70, int i) {
	if (interface70 != null)
	    this$0.method4214((byte) 23)
		.method3871((long) interface70.method30(-80738975));
    }
    
    public void method442(Interface70 interface70, int i, int i_2_,
			  boolean bool) {
	this$0.method4213(1659888447).add(interface70);
	if (bool)
	    this$0.method4215(1179284635).method3893(interface70, (long) i_2_);
	else
	    this$0.method4214((byte) 79).method3881(interface70, (long) i_2_,
						    interface70
							.method456((byte) 6),
						    1584567780);
    }
    
    Class215(Class232 class232) {
	this$0 = class232;
    }
    
    public static boolean method4106(String string, int i, String string_3_,
				     byte i_4_) {
	if (0 == i) {
	    boolean bool;
	    try {
		if (!Class519.aString7051.startsWith("win"))
		    throw new Exception();
		if (!string.startsWith("http://")
		    && !string.startsWith("https://"))
		    throw new Exception();
		String string_5_
		    = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
		for (int i_6_ = 0; i_6_ < string.length(); i_6_++) {
		    if (string_5_.indexOf(string.charAt(i_6_)) == -1)
			throw new Exception();
		}
		Runtime.getRuntime().exec(new StringBuilder().append
					      ("cmd /c start \"j\" \"").append
					      (string).append
					      ("\"").toString());
		bool = true;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (i == 1) {
	    boolean bool;
	    try {
		Object object
		    = Class31.method890(Class519.anApplet7055, string_3_,
					(new Object[]
					 { new URL(Class519.anApplet7055
						       .getCodeBase(),
						   string).toString() }),
					-441928345);
		bool = object != null;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (2 == i) {
	    boolean bool;
	    try {
		Class519.anApplet7055.getAppletContext().showDocument
		    (new URL(Class519.anApplet7055.getCodeBase(), string),
		     "_blank");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	if (i == 3) {
	    try {
		Class31.method887(Class519.anApplet7055, "loggedout",
				  -2089588105);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    boolean bool;
	    try {
		Class519.anApplet7055.getAppletContext().showDocument
		    (new URL(Class519.anApplet7055.getCodeBase(), string),
		     "_top");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	throw new IllegalArgumentException();
    }
    
    static final long method4107(int i) {
	return (((long) ((Class679.anInt8656 += -1282980117) * 1571172803 - 1)
		 << 32)
		| 0xffffffffL);
    }
    
    static final void method4108(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	int i_7_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_8_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	Class536_Sub1.method15934(i_7_, i_8_ >> 14 & 0x3fff, i_8_ & 0x3fff,
				  true, 1909499025);
    }
    
    static void method4109(Class185 class185, int i, int i_9_,
			   Class247 class247, short i_10_) {
	int i_11_ = 127;
	int i_12_ = 7;
	for (int i_13_ = 63; i_13_ >= 0; i_13_--) {
	    int i_14_
		= (i_13_ & 0x3f) << 10 | (i_12_ & 0x7) << 7 | i_11_ & 0x7f;
	    Class456.method7426(false, true, 1739452007);
	    int i_15_ = Class415.anIntArray4666[i_14_];
	    Class54.method1212(false, true, -1888722808);
	    class185.method3298(i,
				i_9_ + ((63 - i_13_) * (-1279656873
							* class247.anInt2469)
					>> 6),
				-881188269 * class247.anInt2468,
				(class247.anInt2469 * -1279656873 >> 6) + 1,
				~0xffffff | i_15_, 0);
	}
    }
    
    static final void method4110(Class669 class669, int i) {
	if (null == Class394_Sub3.aClass692_10247)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= Class394_Sub3.aClass692_10247.anInt8763 * 1457930057;
    }
}
