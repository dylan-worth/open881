/* Class706 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class706
{
    Class298 aClass298_8844;
    public static Class44 aClass44_8845;
    static int anInt8846;
    
    public abstract void method14235(Class534_Sub40 class534_sub40, int i);
    
    public abstract Class438 method14236(int i);
    
    public abstract boolean method14237(byte i);
    
    public abstract void method14238(float f);
    
    public abstract void method14239(float f, int i);
    
    public abstract void method14240(Class287 class287, Class446 class446,
				     int i, int i_0_, float f, int i_1_);
    
    public abstract Class438 method14241();
    
    public abstract void method14242(float f);
    
    public abstract Class438 method14243();
    
    public abstract void method14244(float f);
    
    public abstract boolean method14245();
    
    public abstract void method14246(Class287 class287, Class446 class446,
				     int i, int i_2_, float f);
    
    public abstract Class438 method14247();
    
    public abstract Class438 method14248(int i);
    
    public abstract Class438 method14249();
    
    Class706(Class298 class298) {
	aClass298_8844 = class298;
    }
    
    public abstract Class438 method14250();
    
    public abstract void method14251(Class534_Sub40 class534_sub40);
    
    public static void method14252(boolean bool, int i) {
	if (bool) {
	    if (-993629849 * client.anInt11185 != -1)
		Class219.method4143(client.anInt11185 * -993629849,
				    -112846134);
	    for (Class534_Sub37 class534_sub37
		     = ((Class534_Sub37)
			client.aClass9_11224.method583(-1784242951));
		 null != class534_sub37;
		 class534_sub37
		     = ((Class534_Sub37)
			client.aClass9_11224.method584((byte) -53))) {
		if (!class534_sub37.method8889(1003425287)) {
		    class534_sub37
			= ((Class534_Sub37)
			   client.aClass9_11224.method583(-1903622199));
		    if (null == class534_sub37)
			break;
		}
		Class534_Sub41.method16766(class534_sub37, true, false,
					   -501970604);
	    }
	    client.anInt11185 = 1328962985;
	    client.aClass9_11224 = new Class9(8);
	    Class701.method14213(1971380603);
	    client.anInt11185 = 858200713 * Class620.aClass632_8113.anInt8225;
	    if (-993629849 * client.anInt11185 != -1) {
		Class260.method4813(false, (short) -5549);
		Class422.method6785((byte) -63);
		Class463.method7544(-993629849 * client.anInt11185, null,
				    1028603060);
	    }
	}
	Class519.method8652(16711935);
	Class599.aClass298_Sub1_7871.method5466(true, -2025776485);
	Class65.aBool709 = false;
	Class5.method562((byte) 1);
	client.anInt11215 = 411567433;
	Class560.method9432(client.anInt11055 * 965081907, -1417842748);
	Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
	    = new Class654_Sub1_Sub5_Sub1_Sub2(null);
	client.aMap11191.clear();
	Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method10815
	    ((float) (client.aClass512_11100.method8417(-192611210) * 512 / 2),
	     0.0F,
	     (float) (client.aClass512_11100.method8418(-1533611049) * 512
		      / 2));
	Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.anIntArray11977[0]
	    = client.aClass512_11100.method8417(-520765010) / 2;
	Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.anIntArray11978[0]
	    = client.aClass512_11100.method8418(-1533611049) / 2;
	Class636.anInt8305 = 0;
	Class200_Sub13.anInt9937 = 0;
	if (4 == Class10.anInt75 * -891094135) {
	    Class200_Sub13.anInt9937
		= -2079086379 * (Class200_Sub8.anInt9909 * -986862531 << 9);
	    Class636.anInt8305
		= -866237299 * (Class200_Sub9.anInt9916 * 1718679887 << 9);
	} else
	    Class84.method1670(1634225619);
	client.aClass512_11100.method8501((byte) 53).method10157(1998605368);
    }
    
    public static final void method14253(boolean bool, int i) {
	Class534_Sub19 class534_sub19
	    = Class346.method6128(Class404.aClass404_4256,
				  client.aClass100_11264.aClass13_1183,
				  1341391005);
	client.aClass100_11264.method1863(class534_sub19, (byte) 20);
	for (Class534_Sub37 class534_sub37
		 = ((Class534_Sub37)
		    client.aClass9_11224.method583(-1970594863));
	     null != class534_sub37;
	     class534_sub37 = ((Class534_Sub37)
			       client.aClass9_11224.method584((byte) -19))) {
	    if (!class534_sub37.method8889(1596830883)) {
		class534_sub37 = ((Class534_Sub37)
				  client.aClass9_11224.method583(-1521154699));
		if (null == class534_sub37)
		    break;
	    }
	    if (class534_sub37.anInt10804 * 410447 == 0)
		Class534_Sub41.method16766(class534_sub37, true, bool,
					   -501970604);
	}
	if (null != client.aClass247_11119) {
	    Class454.method7416(client.aClass247_11119, -1774014447);
	    client.aClass247_11119 = null;
	}
    }
    
    static void method14254(int i, String string, int i_3_) {
	Class534_Sub18_Sub6 class534_sub18_sub6
	    = Class447.method7308(2, (long) i);
	class534_sub18_sub6.method18121(127208875);
	class534_sub18_sub6.aString11677 = string;
    }
}
