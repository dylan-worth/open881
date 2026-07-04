/* Class453 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class453 implements Interface76
{
    static Class453 aClass453_4945;
    public static Class453 aClass453_4946
	= new Class453_Sub1(Class649.aClass649_8432, 0, true, true);
    public static Class453 aClass453_4947;
    static Class453 aClass453_4948;
    static Class453 aClass453_4949;
    public static Class453 aClass453_4950;
    public static Class453 aClass453_4951
	= new Class453_Sub2(Class649.aClass649_8433, 1, false, true);
    public static Class453 aClass453_4952;
    public static Class453 aClass453_4953;
    public static Class453 aClass453_4954;
    static Class453 aClass453_4955;
    Class649 aClass649_4956;
    int anInt4957;
    public static int anInt4958;
    
    public static Class453[] method7393(int i) {
	return new Class453[] { aClass453_4950, aClass453_4955, aClass453_4946,
				aClass453_4953, aClass453_4954, aClass453_4951,
				aClass453_4949, aClass453_4947, aClass453_4948,
				aClass453_4952, aClass453_4945 };
    }
    
    Class453(Class649 class649, int i, boolean bool, boolean bool_0_) {
	aClass649_4956 = class649;
	anInt4957 = i * 288015735;
    }
    
    public final Class649 method7394(byte i) {
	return aClass649_4956;
    }
    
    public int method93() {
	return anInt4957 * -214588345;
    }
    
    Object method7395(Class150 class150, int i) {
	return class150.aClass493_1696.method8104((byte) 13);
    }
    
    static {
	aClass453_4947
	    = new Class453_Sub5(Class649.aClass649_8393, 2, true, true);
	aClass453_4948
	    = new Class453_Sub4(Class649.aClass649_8435, 3, false, false);
	aClass453_4949
	    = new Class453(Class649.aClass649_8440, 4, false, false);
	aClass453_4952 = new Class453(Class649.aClass649_8437, 5, true, true);
	aClass453_4953 = new Class453(Class649.aClass649_8434, 6, true, true);
	aClass453_4954 = new Class453(Class649.aClass649_8439, 7, true, false);
	aClass453_4945
	    = new Class453_Sub3(Class649.aClass649_8408, 8, false, false);
	aClass453_4950 = new Class453(Class649.aClass649_8454, 9, false, true);
	aClass453_4955
	    = new Class453(Class649.aClass649_8382, 10, false, false);
    }
    
    public Object method7396(Class150 class150, byte i) {
	if (class150.aBool1698)
	    return method7395(class150, 1462355914);
	return class150.aClass493_1696.method8104((byte) 93);
    }
    
    public int method22() {
	return anInt4957 * -214588345;
    }
    
    public int method53() {
	return anInt4957 * -214588345;
    }
    
    public final Class649 method7397() {
	return aClass649_4956;
    }
    
    Object method7398(Class150 class150) {
	return class150.aClass493_1696.method8104((byte) 26);
    }
    
    public static Class453[] method7399() {
	return new Class453[] { aClass453_4950, aClass453_4955, aClass453_4946,
				aClass453_4953, aClass453_4954, aClass453_4951,
				aClass453_4949, aClass453_4947, aClass453_4948,
				aClass453_4952, aClass453_4945 };
    }
    
    Object method7400(Class150 class150) {
	return class150.aClass493_1696.method8104((byte) 92);
    }
    
    public Object method7401(Class150 class150) {
	if (class150.aBool1698)
	    return method7395(class150, -487546251);
	return class150.aClass493_1696.method8104((byte) 64);
    }
    
    public Object method7402(Class150 class150) {
	if (class150.aBool1698)
	    return method7395(class150, -1253018156);
	return class150.aClass493_1696.method8104((byte) 44);
    }
    
    static final void method7403(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (!string.equals(class247.aString2533)) {
	    class247.aString2533 = string;
	    Class454.method7416(class247, -724306728);
	}
	if (1365669833 * class247.anInt2580 == -1 && !class243.aBool2413)
	    Class334.method5895(class247.anInt2454 * -1278450723, 728266542);
    }
    
    static final void method7404(Class669 class669, short i) {
	int i_2_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_2_, -291047754);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_2_ >> 16];
	Class661.method10972(class247, class243, class669, (byte) 1);
    }
    
    static final void method7405(Class247 class247, int i, int i_3_, int i_4_,
				 Class669 class669, byte i_5_) {
	if (class247.anIntArray2544 == null)
	    throw new RuntimeException();
	class247.anIntArray2544[i] = i_3_;
	class247.anIntArray2545[i] = i_4_;
    }
    
    static final void method7406(Class669 class669, int i) {
	if (client.anInt11194 * 365872613 >= 2)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 365872613 * client.anInt11194;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
    
    static void method7407(boolean bool, byte i) {
	if (bool) {
	    if (-993629849 * client.anInt11185 != -1)
		Class219.method4143(-993629849 * client.anInt11185, 548857409);
	    for (Class534_Sub37 class534_sub37
		     = ((Class534_Sub37)
			client.aClass9_11224.method583(-1667165825));
		 class534_sub37 != null;
		 class534_sub37
		     = ((Class534_Sub37)
			client.aClass9_11224.method584((byte) -126))) {
		if (!class534_sub37.method8889(-261816620)) {
		    class534_sub37
			= ((Class534_Sub37)
			   client.aClass9_11224.method583(-1593322137));
		    if (class534_sub37 == null)
			break;
		}
		Class534_Sub41.method16766(class534_sub37, true, false,
					   -501970604);
	    }
	    client.anInt11185 = 1328962985;
	    client.aClass9_11224 = new Class9(8);
	    Class701.method14213(221055378);
	    client.anInt11185 = 1207952641 * Class620.aClass632_8113.anInt8235;
	    if (-1 != -993629849 * client.anInt11185) {
		Class260.method4813(false, (short) 20172);
		Class422.method6785((byte) -23);
		Class463.method7544(-993629849 * client.anInt11185, null,
				    1195982846);
	    }
	}
	Class65.aBool709 = true;
    }
}
