/* Class551 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Comparator;

class Class551 implements Comparator
{
    Class367_Sub1 this$0;
    static int anInt7308;
    
    public boolean method9032(Object object) {
	return super.equals(object);
    }
    
    public boolean method9033(Object object) {
	return super.equals(object);
    }
    
    public int compare(Object object, Object object_0_) {
	return method9037((Class479) object, (Class479) object_0_,
			  -1267328252);
    }
    
    public int method9034(Object object, Object object_1_) {
	return method9037((Class479) object, (Class479) object_1_, 1506495955);
    }
    
    public int method9035(Object object, Object object_2_) {
	return method9037((Class479) object, (Class479) object_2_, 1347668340);
    }
    
    public int method9036(Object object, Object object_3_) {
	return method9037((Class479) object, (Class479) object_3_, 1586640254);
    }
    
    int method9037(Class479 class479, Class479 class479_4_, int i) {
	float f = class479.method7819(1180702434);
	float f_5_ = class479_4_.method7819(1586520913);
	if (f_5_ > f)
	    return 1;
	if (f_5_ < f)
	    return -1;
	return 0;
    }
    
    public int method9038(Object object, Object object_6_) {
	return method9037((Class479) object, (Class479) object_6_, -740518620);
    }
    
    public boolean method9039(Object object) {
	return super.equals(object);
    }
    
    Class551(Class367_Sub1 class367_sub1) {
	this$0 = class367_sub1;
    }
    
    int method9040(Class479 class479, Class479 class479_7_) {
	float f = class479.method7819(908480844);
	float f_8_ = class479_7_.method7819(1952862279);
	if (f_8_ > f)
	    return 1;
	if (f_8_ < f)
	    return -1;
	return 0;
    }
    
    public boolean equals(Object object) {
	return super.equals(object);
    }
    
    public boolean method9041(Object object) {
	return super.equals(object);
    }
    
    int method9042(Class479 class479, Class479 class479_9_) {
	float f = class479.method7819(1852077058);
	float f_10_ = class479_9_.method7819(906827576);
	if (f_10_ > f)
	    return 1;
	if (f_10_ < f)
	    return -1;
	return 0;
    }
    
    int method9043(Class479 class479, Class479 class479_11_) {
	float f = class479.method7819(475733147);
	float f_12_ = class479_11_.method7819(621789246);
	if (f_12_ > f)
	    return 1;
	if (f_12_ < f)
	    return -1;
	return 0;
    }
    
    int method9044(Class479 class479, Class479 class479_13_) {
	float f = class479.method7819(23456533);
	float f_14_ = class479_13_.method7819(68143879);
	if (f_14_ > f)
	    return 1;
	if (f_14_ < f)
	    return -1;
	return 0;
    }
    
    public static String method9045(Class534_Sub40 class534_sub40, byte i) {
	return Class394_Sub2.method15786(class534_sub40, 32767, 16777472);
    }
    
    static long method9046(Interface62 interface62, int i, int i_15_,
			   int i_16_) {
	long l = 4194304L;
	long l_17_ = -9223372036854775808L;
	Class602 class602
	    = ((Class602)
	       client.aClass512_11100.method8428(-1486655428)
		   .method91(interface62.method56(-1670561317), -1770315856));
	long l_18_
	    = (long) (i | i_15_ << 7 | interface62.method409(-2093214781) << 14
		      | interface62.method410(-449684343) << 20 | 0x40000000);
	if (class602.anInt7907 * -2134171963 == 0)
	    l_18_ |= l_17_;
	if (1 == class602.anInt7940 * 1288889595)
	    l_18_ |= l;
	l_18_ |= (long) interface62.method56(-2021349173) << 32;
	return l_18_;
    }
    
    static int method9047(byte i) {
	int i_19_ = Class110.aClass294_1344.anInt3148 * -1262216053;
	if (i_19_ < Class334.aClass294Array3506.length - 1)
	    Class110.aClass294_1344 = Class334.aClass294Array3506[i_19_ + 1];
	return 100;
    }
    
    static final void method9048(Class669 class669, byte i) {
	int i_20_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_20_, 520592122);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_20_ >> 16];
	Class690_Sub25.method17111(class247, class243, class669, -1385741648);
    }
    
    static final void method9049(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class669.aClass352_8602.aByte3630;
    }
    
    static final void method9050(Class669 class669, byte i) {
	if ((-1850530127 * client.anInt11039 != 9
	     && 16 != client.anInt11039 * -1850530127)
	    || Class202.method3865((byte) 0))
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 1;
	else if (Class5.aBool45)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	else if (Class5.aLong46 * -6973245282492846285L
		 > Class250.method4604((byte) -75) - 1000L)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 1;
	else {
	    Class5.aBool45 = true;
	    Class100 class100 = Class201.method3864(2095398292);
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4173,
				      class100.aClass13_1183, 1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513
		.method16510(Class619.anInt8110 * -1783077181, -242647152);
	    class100.method1863(class534_sub19, (byte) 55);
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	}
    }
    
    static final void method9051(Class669 class669, int i) {
	int i_21_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_21_, -260447312);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_21_ >> 16];
	Class601.method9976(class247, class243, class669, (byte) 44);
    }
    
    public static void method9052(int i, int i_22_) {
	Class534_Sub18_Sub6 class534_sub18_sub6
	    = Class447.method7308(8, (long) i);
	class534_sub18_sub6.method18182(-1052637456);
    }
}
