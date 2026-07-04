/* Class575 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.LinkedList;

public class Class575
{
    static LinkedList aLinkedList7711 = new LinkedList();
    
    Class575() throws Throwable {
	throw new Error();
    }
    
    static void method9740(Interface68 interface68) {
	while (aLinkedList7711.size() > 10)
	    aLinkedList7711.remove();
	aLinkedList7711.add(interface68);
    }
    
    static void method9741(Interface68 interface68) {
	while (aLinkedList7711.size() > 10)
	    aLinkedList7711.remove();
	aLinkedList7711.add(interface68);
    }
    
    public static void method9742(int i) {
	Class185.method3694(new Class587(i), -1600474947);
    }
    
    public static void method9743() {
	if ((16 == client.anInt11039 * -1850530127
	     || -1850530127 * client.anInt11039 == 3)
	    && null != client.aClass100_11264) {
	    for (;;) {
		Interface68 interface68 = (Interface68) aLinkedList7711.poll();
		if (null == interface68)
		    break;
		interface68.method356(2136566573);
	    }
	}
    }
    
    public static void method9744(Class26 class26) {
	Class185.method3694(new Class572(class26), -1600474947);
    }
    
    public static void method9745(Class26 class26) {
	Class185.method3694(new Class572(class26), -1600474947);
    }
    
    public static void method9746(int i, int i_0_, int i_1_) {
	Class185.method3694
	    (new Class71_Sub1(i, i_0_, i_1_, client.anInt11074 * 1262399261,
			      1930739095 * Class6.aClass450_56.anInt4928,
			      Class6.aClass450_56.anInt4929 * 1871597189,
			      Class6.aClass450_56.method7334(822688380),
			      Class6.aClass450_56.method7340((byte) 24),
			      Class645.aClass463_8374.method7523(-374259247)),
	     -1600474947);
    }
    
    public static void method9747(Class68 class68, String string, int i,
				  Throwable throwable) {
	Class185.method3694(new Class584(class68, string, i, throwable),
			    -1600474947);
    }
    
    static void method9748(Interface68 interface68) {
	while (aLinkedList7711.size() > 10)
	    aLinkedList7711.remove();
	aLinkedList7711.add(interface68);
    }
    
    public static void method9749(int i) {
	Class185.method3694(new Class587(i), -1600474947);
    }
    
    public static void method9750(Class52_Sub1 class52_sub1) {
	Class185.method3694(class52_sub1, -1600474947);
    }
    
    public static void method9751(int i) {
	Class185.method3694(new Class587(i), -1600474947);
    }
    
    static final void method9752(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	class247.method4522((byte) 41);
    }
    
    static final void method9753(Class669 class669, int i) {
	Class189.method3761(31645619);
    }
    
    static final void method9754(Class669 class669, int i)
	throws Exception_Sub2 {
	class669.anInt8600 -= 617999126;
	int i_2_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_3_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	Class438 class438
	    = Class438.method6996((float) i_2_, (float) i_2_, (float) i_2_);
	if (class438.aFloat4864 == -1.0F)
	    class438.aFloat4864 = Float.POSITIVE_INFINITY;
	if (class438.aFloat4863 == -1.0F)
	    class438.aFloat4863 = Float.POSITIVE_INFINITY;
	if (-1.0F == class438.aFloat4865)
	    class438.aFloat4865 = Float.POSITIVE_INFINITY;
	Class599.aClass298_Sub1_7871.method5454(class438, -1127503483);
	Class599.aClass298_Sub1_7871.method5365((float) i_3_ / 1000.0F,
						31645619);
	class438.method7074();
    }
    
    static final void method9755(Class669 class669, int i) {
	Class17.method775((byte) -102);
    }
    
    static final void method9756(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_4_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_5_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aClass219_11338.method4120(i_4_, (byte) 111)
		  .method4349(i_5_, (byte) 97);
    }
    
    static final void method9757(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class89.method1714(-2135715783).method93();
    }
    
    static void method9758(Class247 class247, Class145 class145, int i,
			   int i_6_, int i_7_, int i_8_, int i_9_,
			   String string, Class171 class171, Class16 class16,
			   int i_10_, byte i_11_) {
	int i_12_;
	if (3 == -891094135 * Class10.anInt75)
	    i_12_ = ((int) ((double) Class599.aClass298_Sub1_7871
					 .method5389(108239838)
			    * 2607.5945876176133)
		     + -2045337339 * client.anInt11189) & 0x3fff;
	else if (5 == -891094135 * Class10.anInt75)
	    i_12_ = (int) client.aFloat11140 & 0x3fff;
	else
	    i_12_ = ((int) client.aFloat11140 + client.anInt11189 * -2045337339
		     & 0x3fff);
	int i_13_ = (Math.max(-881188269 * class247.anInt2468 / 2,
			      class247.anInt2469 * -1279656873 / 2)
		     + 10);
	int i_14_ = i_7_ * i_7_ + i_8_ * i_8_;
	if (i_14_ <= i_13_ * i_13_) {
	    int i_15_ = Class427.anIntArray4806[i_12_];
	    int i_16_ = Class427.anIntArray4805[i_12_];
	    if (5 != -891094135 * Class10.anInt75) {
		i_15_ = i_15_ * 256 / (-2002513841 * client.anInt11022 + 256);
		i_16_ = i_16_ * 256 / (-2002513841 * client.anInt11022 + 256);
	    }
	    int i_17_ = i_8_ * i_15_ + i_7_ * i_16_ >> 14;
	    int i_18_ = i_8_ * i_16_ - i_15_ * i_7_ >> 14;
	    int i_19_ = class16.method747(string, 100, null, -1041342507);
	    int i_20_ = class16.method737(string, 100, 0, null, 2112849964);
	    i_17_ -= i_19_ / 2;
	    if (i_17_ >= -(class247.anInt2468 * -881188269)
		&& i_17_ <= -881188269 * class247.anInt2468
		&& i_18_ >= -(-1279656873 * class247.anInt2469)
		&& i_18_ <= class247.anInt2469 * -1279656873)
		class171.method2844(string,
				    (-881188269 * class247.anInt2468 / 2
				     + (i + i_17_)),
				    (class247.anInt2469 * -1279656873 / 2
				     + i_6_ - i_18_ - i_9_ - i_20_),
				    i_19_, 50, i_10_, 0, 1, 0, 0, null, null,
				    class145, i, i_6_, 202025040);
	}
    }
    
    static final void method9759(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class81.aClass563_834.method9472((byte) -58) ? 1 : 0;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class81.aClass563_834.method9501((byte) -121) ? 1 : 0;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class81.aClass563_834.method9494((byte) -107) ? 1 : 0;
    }
}
