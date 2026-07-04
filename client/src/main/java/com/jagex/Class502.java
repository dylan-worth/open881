/* Class502 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class502
{
    abstract int method8279(long l);
    
    final int method8280(long l) {
	long l_0_ = method8282(1104976866);
	if (l_0_ > 0L)
	    Class251.method4622(l_0_);
	return method8298(l);
    }
    
    abstract void method8281(int i);
    
    abstract long method8282(int i);
    
    public static Class502 method8283() {
	Class502_Sub1 class502_sub1;
	try {
	    class502_sub1 = new Class502_Sub1();
	} catch (Throwable throwable) {
	    return new Class502_Sub2();
	}
	return class502_sub1;
    }
    
    abstract long method8284();
    
    abstract void method8285();
    
    abstract long method8286();
    
    abstract long method8287();
    
    abstract long method8288();
    
    Class502() {
	/* empty */
    }
    
    abstract int method8289(long l);
    
    public static Class502 method8290() {
	Class502_Sub1 class502_sub1;
	try {
	    class502_sub1 = new Class502_Sub1();
	} catch (Throwable throwable) {
	    return new Class502_Sub2();
	}
	return class502_sub1;
    }
    
    abstract long method8291();
    
    abstract long method8292();
    
    abstract long method8293();
    
    final int method8294(long l) {
	long l_1_ = method8282(569799817);
	if (l_1_ > 0L)
	    Class251.method4622(l_1_);
	return method8298(l);
    }
    
    final int method8295(long l) {
	long l_2_ = method8282(-1920798315);
	if (l_2_ > 0L)
	    Class251.method4622(l_2_);
	return method8298(l);
    }
    
    abstract long method8296();
    
    abstract long method8297(int i);
    
    abstract int method8298(long l);
    
    final int method8299(long l) {
	long l_3_ = method8282(1124756758);
	if (l_3_ > 0L)
	    Class251.method4622(l_3_);
	return method8298(l);
    }
    
    final int method8300(long l) {
	long l_4_ = method8282(-95670353);
	if (l_4_ > 0L)
	    Class251.method4622(l_4_);
	return method8298(l);
    }
    
    abstract long method8301();
    
    static void method8302(int i) {
	if (Class110.aClass294_1344 != null) {
	    Class277.aClass300_3049 = new Class300();
	    Class277.aClass300_3049.method5539
		(Class334.aLong3509 * -8730536087753452067L,
		 Class110.aClass294_1344.aClass58_3152
		     .method1245(Class539.aClass672_7171, (byte) -56),
		 Class110.aClass294_1344.aClass58_3152
		     .method1245(Class539.aClass672_7171, (byte) -87),
		 Class110.aClass294_1344.anInt3149 * 255476555,
		 Class110.aClass294_1344, (byte) 0);
	    Class334.aThread3512 = new Thread(Class277.aClass300_3049, "");
	    Class334.aThread3512.start();
	}
    }
    
    static final void method8303(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class118.method2131(class247, class243, class669, 1225863589);
    }
    
    static final void method8304(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	int i_5_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class247.anInt2606 = 407876511;
	if (i_5_ != 2083357573 * class247.anInt2634) {
	    class247.anInt2634 = -1986921139 * i_5_;
	    Class454.method7416(class247, -1403508127);
	}
	if (class247.anInt2580 * 1365669833 == -1 && !class243.aBool2413)
	    Class509.method8395(class247.anInt2454 * -1278450723, -2041286111);
    }
    
    static final void method8305(Class669 class669, byte i) {
	class669.anInt8596 -= -2111195934;
	if (class669.aLongArray8587[1572578961 * class669.anInt8596]
	    == class669.aLongArray8587[1572578961 * class669.anInt8596 + 1])
	    class669.anInt8613
		+= (class669.anIntArray8591[662605117 * class669.anInt8613]
		    * -793595371);
    }
    
    public static int[][] method8306(int i, int i_6_, int i_7_, int i_8_,
				     int i_9_, int i_10_, float f,
				     boolean bool, byte i_11_) {
	int[][] is = new int[i_6_][i];
	Class534_Sub27_Sub1 class534_sub27_sub1 = new Class534_Sub27_Sub1();
	class534_sub27_sub1.aBool11778 = bool;
	class534_sub27_sub1.anInt11791 = i_8_ * -855596815;
	class534_sub27_sub1.anInt11787 = 477403563 * i_9_;
	class534_sub27_sub1.anInt11789 = i_10_ * 1909898403;
	class534_sub27_sub1.anInt11790 = -1869573391 * (int) (f * 4096.0F);
	class534_sub27_sub1.method18322(2140894129);
	Class35.method928(i, i_6_, (byte) 1);
	for (int i_12_ = 0; i_12_ < i_6_; i_12_++)
	    class534_sub27_sub1.method18320(i_12_, is[i_12_], 1855490730);
	return is;
    }
}
