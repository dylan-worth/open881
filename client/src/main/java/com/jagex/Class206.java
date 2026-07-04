/* Class206 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class206 implements Interface6
{
    Interface14 anInterface14_2231;
    Class203 aClass203_2232 = new Class203(100);
    static String[] aStringArray2233;
    
    void method3925() {
	synchronized (aClass203_2232) {
	    aClass203_2232.method3884((byte) -54);
	}
    }
    
    Class534_Sub18_Sub17 method3926(int i, int i_0_) {
	Class534_Sub18_Sub17 class534_sub18_sub17;
	synchronized (aClass203_2232) {
	    class534_sub18_sub17
		= (Class534_Sub18_Sub17) aClass203_2232.method3871((long) i);
	    if (class534_sub18_sub17 == null) {
		class534_sub18_sub17 = new Class534_Sub18_Sub17(i);
		aClass203_2232.method3893(class534_sub18_sub17, (long) i);
	    }
	    if (!class534_sub18_sub17.method18436(-2016287913)) {
		Class534_Sub18_Sub17 class534_sub18_sub17_1_ = null;
		return class534_sub18_sub17_1_;
	    }
	}
	return class534_sub18_sub17;
    }
    
    void method3927(int i) {
	synchronized (aClass203_2232) {
	    aClass203_2232.method3876(i, (byte) 0);
	}
    }
    
    void method3928(int i, int i_2_) {
	synchronized (aClass203_2232) {
	    aClass203_2232.method3876(i, (byte) 0);
	}
    }
    
    void method3929(int i) {
	synchronized (aClass203_2232) {
	    aClass203_2232.method3884((byte) -25);
	}
    }
    
    Class206(Interface14 interface14, Class472 class472,
	     Class472 class472_3_) {
	anInterface14_2231 = interface14;
	Class228.method4191(class472, class472_3_, 2, (byte) 6);
    }
    
    void method3930(int i) {
	synchronized (aClass203_2232) {
	    aClass203_2232.method3876(i, (byte) 0);
	}
    }
    
    void method3931(byte i) {
	synchronized (aClass203_2232) {
	    aClass203_2232.method3877(-1271845120);
	}
    }
    
    void method3932() {
	synchronized (aClass203_2232) {
	    aClass203_2232.method3877(1768366168);
	}
    }
    
    void method3933(int i) {
	synchronized (aClass203_2232) {
	    aClass203_2232.method3876(i, (byte) 0);
	}
    }
    
    public static Class704[] method3934(int i) {
	return (new Class704[]
		{ Class704.aClass704_8836, Class704.aClass704_8831,
		  Class704.aClass704_8838, Class704.aClass704_8832,
		  Class704.aClass704_8843, Class704.aClass704_8829,
		  Class704.aClass704_8835, Class704.aClass704_8830,
		  Class704.aClass704_8827, Class704.aClass704_8842,
		  Class704.aClass704_8840, Class704.aClass704_8833,
		  Class704.aClass704_8839, Class704.aClass704_8841,
		  Class704.aClass704_8828, Class704.aClass704_8826,
		  Class704.aClass704_8837, Class704.aClass704_8825,
		  Class704.aClass704_8834 });
    }
    
    static final void method3935(Class669 class669, int i) {
	int i_4_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_4_, 1998910143);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_4_ >> 16];
	Class523.method8727(class247, class243, class669, (byte) 62);
    }
    
    static final void method3936(Class669 class669, byte i) {
	int i_5_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_5_, 1291777153);
	Class449.method7327(class247, class669, (byte) 95);
    }
    
    static int method3937
	(Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2, int i) {
	int i_6_ = 1734964233 * class654_sub1_sub5_sub1_sub2.anInt12227;
	Class570 class570
	    = class654_sub1_sub5_sub1_sub2.method18531((byte) -52);
	int i_7_ = class654_sub1_sub5_sub1_sub2.aClass711_Sub1_11965
		       .method14329(1255924037);
	if (-1 == i_7_
	    || class654_sub1_sub5_sub1_sub2.aClass711_Sub1_11965.aBool10971)
	    i_6_ = -729876395 * class654_sub1_sub5_sub1_sub2.anInt12230;
	else if (1074876801 * class570.anInt7642 == i_7_
		 || class570.anInt7631 * 421310407 == i_7_
		 || i_7_ == class570.anInt7633 * 541177679
		 || class570.anInt7632 * -921167219 == i_7_)
	    i_6_ = class654_sub1_sub5_sub1_sub2.anInt12231 * -510526957;
	else if (i_7_ == 1846476627 * class570.anInt7634
		 || -63558043 * class570.anInt7638 == i_7_
		 || class570.anInt7647 * -1045334803 == i_7_
		 || 630970333 * class570.anInt7636 == i_7_)
	    i_6_ = -2046269725 * class654_sub1_sub5_sub1_sub2.anInt12222;
	return i_6_;
    }
    
    static void method3938(int i, int i_8_, int i_9_, int i_10_, int i_11_) {
	Class534_Sub18_Sub6 class534_sub18_sub6
	    = Class447.method7308(17, (long) i_8_ << 32 | (long) i);
	class534_sub18_sub6.method18121(-1241733575);
	class534_sub18_sub6.anInt11666 = 517206857 * i_9_;
	class534_sub18_sub6.anInt11660 = i_10_ * -1621355885;
    }
}
