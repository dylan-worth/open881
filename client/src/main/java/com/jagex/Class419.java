/* Class419 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class419
{
    public static Class419 aClass419_4689;
    public static Class419 aClass419_4690;
    public static Class419 aClass419_4691;
    public static Class419 aClass419_4692;
    public static Class419 aClass419_4693;
    public static Class419 aClass419_4694;
    public static Class419 aClass419_4695 = new Class419(10);
    public static Class419 aClass419_4696;
    public static Class419 aClass419_4697;
    public static Class419 aClass419_4698;
    public static Class419 aClass419_4699;
    public static Class419 aClass419_4700;
    public static Class419 aClass419_4701;
    public static Class419 aClass419_4702;
    public static Class419 aClass419_4703;
    static long aLong4704;
    
    public static Class419[] method6762() {
	return (new Class419[]
		{ aClass419_4695, aClass419_4690, aClass419_4691,
		  aClass419_4692, aClass419_4693, aClass419_4702,
		  aClass419_4700, aClass419_4696, aClass419_4689,
		  aClass419_4698, aClass419_4699, aClass419_4697,
		  aClass419_4701, aClass419_4694, aClass419_4703 });
    }
    
    static {
	aClass419_4690 = new Class419(5);
	aClass419_4691 = new Class419(6);
	aClass419_4692 = new Class419(21);
	aClass419_4693 = new Class419(9);
	aClass419_4702 = new Class419(7);
	aClass419_4700 = new Class419(7);
	aClass419_4696 = new Class419(-1);
	aClass419_4689 = new Class419(8);
	aClass419_4698 = new Class419(3);
	aClass419_4699 = new Class419(2);
	aClass419_4697 = new Class419(-1);
	aClass419_4701 = new Class419(5);
	aClass419_4694 = new Class419(18);
	aClass419_4703 = new Class419(7);
    }
    
    Class419(int i) {
	/* empty */
    }
    
    public static Class419[] method6763() {
	return (new Class419[]
		{ aClass419_4695, aClass419_4690, aClass419_4691,
		  aClass419_4692, aClass419_4693, aClass419_4702,
		  aClass419_4700, aClass419_4696, aClass419_4689,
		  aClass419_4698, aClass419_4699, aClass419_4697,
		  aClass419_4701, aClass419_4694, aClass419_4703 });
    }
    
    public static Class419[] method6764() {
	return (new Class419[]
		{ aClass419_4695, aClass419_4690, aClass419_4691,
		  aClass419_4692, aClass419_4693, aClass419_4702,
		  aClass419_4700, aClass419_4696, aClass419_4689,
		  aClass419_4698, aClass419_4699, aClass419_4697,
		  aClass419_4701, aClass419_4694, aClass419_4703 });
    }
    
    static final void method6765(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	class247.aBool2489
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) == 1;
	Class454.method7416(class247, -1618528078);
    }
    
    static final void method6766(Class669 class669, int i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_0_, 62728171);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_0_ >> 16];
	Class394.method6560(class247, class243, class669, -1551903179);
    }
    
    static final void method6767(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_1_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_2_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	Class273.method5102(10, i_1_, i_2_, "", (byte) -51);
    }
    
    static final void method6768(Class669 class669, int i) {
	Class458.method7438(class669.aClass654_Sub1_Sub4_Sub1_8609,
			    (class669.anIntArray8595
			     [(class669.anInt8600 -= 308999563) * 2088438307]),
			    true, -1175666630);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (int) client.aFloatArray11167[0];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (int) client.aFloatArray11167[1];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (int) client.aFloatArray11167[2];
    }
    
    static final void method6769(Class669 class669, int i) {
	int i_3_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_3_, -151608499);
	Class299.method5513(class247, class669, -898265868);
    }
    
    static final int method6770(int i, int i_4_, int i_5_, int i_6_) {
	int i_7_ = i / i_5_;
	int i_8_ = i & i_5_ - 1;
	int i_9_ = i_4_ / i_5_;
	int i_10_ = i_4_ & i_5_ - 1;
	int i_11_ = Class110_Sub1.method14506(i_7_, i_9_, 886099173);
	int i_12_ = Class110_Sub1.method14506(i_7_ + 1, i_9_, 1299030043);
	int i_13_ = Class110_Sub1.method14506(i_7_, 1 + i_9_, 2043312289);
	int i_14_ = Class110_Sub1.method14506(1 + i_7_, 1 + i_9_, 1330093322);
	int i_15_ = Class97.method1827(i_11_, i_12_, i_8_, i_5_, (byte) 7);
	int i_16_ = Class97.method1827(i_13_, i_14_, i_8_, i_5_, (byte) 60);
	return Class97.method1827(i_15_, i_16_, i_10_, i_5_, (byte) 33);
    }
}
