/* Class630 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class630
{
    public int anInt8193 = -944395377;
    public int anInt8194 = -509807721;
    public static final int anInt8195 = 1;
    public int[] anIntArray8196;
    public static final int anInt8197 = 0;
    static final int anInt8198 = 2;
    public int[] anIntArray8199;
    public int[] anIntArray8200;
    static int anInt8201;
    
    public Class630(Class472 class472) {
	byte[] is = class472.method7738((Class617.aClass617_8091.anInt8096
					 * -448671533),
					(byte) -12);
	method10428(new Class534_Sub40(is), (byte) -4);
    }
    
    void method10428(Class534_Sub40 class534_sub40, byte i) {
	for (;;) {
	    int i_0_ = class534_sub40.method16527(127191699);
	    if (0 == i_0_)
		break;
	    if (i_0_ == 1) {
		int i_1_ = class534_sub40.method16527(1417890162);
		anIntArray8196 = new int[i_1_];
		for (int i_2_ = 0; i_2_ < anIntArray8196.length; i_2_++) {
		    anIntArray8196[i_2_]
			= class534_sub40.method16527(987588136);
		    if (0 != anIntArray8196[i_2_]
			&& anIntArray8196[i_2_] != 2) {
			/* empty */
		    }
		}
	    } else if (3 == i_0_)
		anInt8193 = class534_sub40.method16527(938516703) * 944395377;
	    else if (4 == i_0_)
		anInt8194
		    = class534_sub40.method16527(-1733500780) * 509807721;
	    else if (5 == i_0_) {
		anIntArray8199
		    = new int[class534_sub40.method16527(303076376)];
		for (int i_3_ = 0; i_3_ < anIntArray8199.length; i_3_++)
		    anIntArray8199[i_3_]
			= class534_sub40.method16527(1736185503);
	    } else if (i_0_ == 6) {
		anIntArray8200
		    = new int[class534_sub40.method16527(889426946)];
		for (int i_4_ = 0; i_4_ < anIntArray8200.length; i_4_++)
		    anIntArray8200[i_4_]
			= class534_sub40.method16527(-509585953);
	    }
	}
	if (anIntArray8196 == null)
	    throw new RuntimeException("");
    }
    
    void method10429(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(94132122);
	    if (0 == i)
		break;
	    if (i == 1) {
		int i_5_ = class534_sub40.method16527(-282428279);
		anIntArray8196 = new int[i_5_];
		for (int i_6_ = 0; i_6_ < anIntArray8196.length; i_6_++) {
		    anIntArray8196[i_6_]
			= class534_sub40.method16527(488769600);
		    if (0 != anIntArray8196[i_6_]
			&& anIntArray8196[i_6_] != 2) {
			/* empty */
		    }
		}
	    } else if (3 == i)
		anInt8193 = class534_sub40.method16527(1917208126) * 944395377;
	    else if (4 == i)
		anInt8194 = class534_sub40.method16527(1667687177) * 509807721;
	    else if (5 == i) {
		anIntArray8199
		    = new int[class534_sub40.method16527(-1697671717)];
		for (int i_7_ = 0; i_7_ < anIntArray8199.length; i_7_++)
		    anIntArray8199[i_7_]
			= class534_sub40.method16527(434478862);
	    } else if (i == 6) {
		anIntArray8200
		    = new int[class534_sub40.method16527(962628684)];
		for (int i_8_ = 0; i_8_ < anIntArray8200.length; i_8_++)
		    anIntArray8200[i_8_]
			= class534_sub40.method16527(1198319809);
	    }
	}
	if (anIntArray8196 == null)
	    throw new RuntimeException("");
    }
    
    static final void method10430(Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	int i_9_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = new StringBuilder().append(string).append
		  (Class316.method5723(i_9_, true, (byte) 31)).toString();
    }
    
    static final void method10431(Class669 class669, byte i)
	throws Exception_Sub2 {
	class669.anInt8600 -= 1235998252;
	float f
	    = (float) class669.anIntArray8595[class669.anInt8600 * 2088438307];
	float f_10_ = (float) (class669.anIntArray8595
			       [class669.anInt8600 * 2088438307 + 1]);
	float f_11_ = (float) (class669.anIntArray8595
			       [class669.anInt8600 * 2088438307 + 2]);
	float f_12_ = ((float) (class669.anIntArray8595
				[3 + 2088438307 * class669.anInt8600])
		       / 1000.0F);
	Class599.aClass298_Sub1_7871.method5354(Class438.method6996(f, f_10_,
								    f_11_),
						f_12_, (byte) 96);
    }
    
    static final void method10432(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_13_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_14_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	Class90 class90 = (Class90) Class534_Sub11_Sub13
					.aClass44_Sub22_11730
					.method91(i_14_, 542144650);
	if (class90.method1718(-1775265948))
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= ((Class307)
		   Class578.aClass44_Sub3_7743.method91(i_13_, 1323383829))
		      .method5608(i_14_, class90.aString889, 1794115792);
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= (((Class307)
		    Class578.aClass44_Sub3_7743.method91(i_13_, 725590680))
		       .method5613
		   (i_14_, class90.anInt888 * 263946597, -2109347064));
    }
    
    static void method10433(int i) {
	Class100 class100 = Class201.method3864(2095398292);
	Class534_Sub19 class534_sub19
	    = Class346.method6128(Class404.aClass404_4273,
				  class100.aClass13_1183, 1341391005);
	class534_sub19.aClass534_Sub40_Sub1_10513
	    .method16510(-983036913 * client.anInt11144, -1215732719);
	class100.method1863(class534_sub19, (byte) 92);
    }
}
