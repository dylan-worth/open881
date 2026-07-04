/* Class590 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class590 implements Interface76, Interface66
{
    int anInt7809;
    public static Class590 aClass590_7810;
    public static Class590 aClass590_7811
	= new Class590(0, "", new Class493[] { Class493.aClass493_5451,
					       Class493.aClass493_5496 });
    static Class590 aClass590_7812;
    public static Class590 aClass590_7813;
    Class493[] aClass493Array7814;
    
    Class590(int i, String string, Class493[] class493s) {
	anInt7809 = i * 1915749;
	aClass493Array7814 = class493s;
	Class493[] class493s_0_ = aClass493Array7814;
	for (int i_1_ = 0; i_1_ < class493s_0_.length; i_1_++) {
	    Class493 class493 = class493s_0_[i_1_];
	    switch (973874463 * class493.aClass483_5522.anInt5276) {
	    case 3:
		break;
	    case 0:
		break;
	    default:
		break;
	    case 4:
		/* empty */
	    }
	}
    }
    
    public int method93() {
	return -823493011 * anInt7809;
    }
    
    static {
	aClass590_7810
	    = new Class590(1, "", new Class493[] { Class493.aClass493_5451,
						   Class493.aClass493_5451 });
	aClass590_7813
	    = new Class590(2, "", new Class493[] { Class493.aClass493_5496,
						   Class493.aClass493_5496 });
	aClass590_7812
	    = new Class590(3, "", new Class493[] { Class493.aClass493_5451,
						   Class493.aClass493_5451,
						   Class493.aClass493_5496 });
    }
    
    public int method53() {
	return -823493011 * anInt7809;
    }
    
    public int method22() {
	return -823493011 * anInt7809;
    }
    
    public static void method9876(int i, int i_2_) {
	if (i < 0 || i > 2)
	    i = 0;
	Class625.anInt8164 = -256866481 * i;
	OutputStream_Sub1.aClass629Array11013
	    = new Class629[(Class184.anIntArray1982
			    [Class625.anInt8164 * -1429983313]) + 1];
	Class625.anInt8165 = 0;
	Class625.anInt8156 = 0;
    }
    
    static final void method9877(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class267.method4868(class247, class243, class669, -849099796);
    }
    
    static final void method9878(Class669 class669, int i) {
	if (Class713.aBool8884 && null != Class29.aFrame266)
	    Class159.method2611(Class44_Sub6.aClass534_Sub35_10989
				    .aClass690_Sub8_10775
				    .method16947(1795245059),
				-1, -1, false, 452051736);
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	boolean bool = ((class669.anIntArray8595
			 [(class669.anInt8600 -= 308999563) * 2088438307])
			== 1);
	String string_3_ = new StringBuilder().append
			       (Class286.method5266(-2061965704)).append
			       (string).toString();
	Class468.method7622(string_3_, bool, client.aBool11032, 1411490484);
    }
    
    public static void method9879(String string, boolean bool, int i) {
	if (9 == client.anInt11039 * -1850530127
	    && (!Class202.method3865((byte) 0)
		&& !Class295.method5325(-895544460))) {
	    Class65.aString696 = string;
	    Class65.aBool697 = bool;
	    Class673.method11110(7, -689444454);
	}
    }
    
    static final void method9880(int i, int i_4_, int i_5_, int i_6_,
				 int i_7_) {
	int i_8_ = client.anInt11115 * -679255007;
	int i_9_ = -416274775 * client.anInt11169;
	if (1 == client.anInt11265 * -1370432497) {
	    Class163 class163 = (Class79.aClass163Array829
				 [client.anInt11188 * 2143149601 / 100]);
	    class163.method2656(i_8_ - 8, i_9_ - 8);
	}
	if (client.anInt11265 * -1370432497 == 2) {
	    Class163 class163 = (Class79.aClass163Array829
				 [2143149601 * client.anInt11188 / 100 + 4]);
	    class163.method2656(i_8_ - 8, i_9_ - 8);
	}
    }
}
