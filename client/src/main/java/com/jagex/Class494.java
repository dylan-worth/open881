/* Class494 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class494 implements Interface11
{
    public static Class472 aClass472_5535;
    
    public Object method74(Class534_Sub40 class534_sub40) {
	return Class526.method8756(class534_sub40, (short) 664);
    }
    
    public Object method75(Class534_Sub40 class534_sub40, int i) {
	return Class526.method8756(class534_sub40, (short) 664);
    }
    
    public Object method77(Class534_Sub40 class534_sub40) {
	return Class526.method8756(class534_sub40, (short) 664);
    }
    
    public Object method76(Class534_Sub40 class534_sub40) {
	return Class526.method8756(class534_sub40, (short) 664);
    }
    
    static final void method8124(Class669 class669, byte i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aClass214_11359.method4044(i_0_, 1481307617)
		  .method3970((byte) 68);
    }
    
    static final void method8125(Class669 class669, int i) {
	Class554_Sub1.aBool10685
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) == 1;
    }
    
    static final void method8126(Class669 class669, byte i) {
	int i_1_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (int) (Class260.method4812(i_1_, (byte) 0) / 60000L);
    }
    
    static final void method8127(Class669 class669, int i) {
	int i_2_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = client.aClass214_11359.method4044(i_2_, 1481307617)
		  .method3979(995477553);
    }
    
    static final void method8128(Class534_Sub40_Sub1 class534_sub40_sub1,
				 int i) {
	int i_3_ = 0;
	class534_sub40_sub1.method18294(-435764450);
	for (int i_4_ = 0; i_4_ < -1843550713 * Class108.anInt1321; i_4_++) {
	    int i_5_ = Class108.anIntArray1322[i_4_];
	    if (0 == (Class108.aByteArray1317[i_5_] & 0x1)) {
		if (i_3_ > 0) {
		    i_3_--;
		    Class108.aByteArray1317[i_5_] |= 0x2;
		} else {
		    int i_6_ = class534_sub40_sub1.method18295(1, -761815447);
		    if (0 == i_6_) {
			i_3_ = Class637.method10560(class534_sub40_sub1,
						    -1343193041);
			Class108.aByteArray1317[i_5_] |= 0x2;
		    } else
			Class261.method4816(class534_sub40_sub1, i_5_,
					    1529999223);
		}
	    }
	}
	class534_sub40_sub1.method18296(1608026100);
	if (0 != i_3_)
	    throw new RuntimeException();
	class534_sub40_sub1.method18294(1069373166);
	for (int i_7_ = 0; i_7_ < Class108.anInt1321 * -1843550713; i_7_++) {
	    int i_8_ = Class108.anIntArray1322[i_7_];
	    if ((Class108.aByteArray1317[i_8_] & 0x1) != 0) {
		if (i_3_ > 0) {
		    i_3_--;
		    Class108.aByteArray1317[i_8_] |= 0x2;
		} else {
		    int i_9_ = class534_sub40_sub1.method18295(1, -761815447);
		    if (0 == i_9_) {
			i_3_ = Class637.method10560(class534_sub40_sub1,
						    -1343193041);
			Class108.aByteArray1317[i_8_] |= 0x2;
		    } else
			Class261.method4816(class534_sub40_sub1, i_8_,
					    -349925789);
		}
	    }
	}
	class534_sub40_sub1.method18296(837189527);
	if (0 != i_3_)
	    throw new RuntimeException();
	class534_sub40_sub1.method18294(1575307643);
	for (int i_10_ = 0; i_10_ < 918952205 * Class108.anInt1328; i_10_++) {
	    int i_11_ = Class108.anIntArray1324[i_10_];
	    if (0 != (Class108.aByteArray1317[i_11_] & 0x1)) {
		if (i_3_ > 0) {
		    i_3_--;
		    Class108.aByteArray1317[i_11_] |= 0x2;
		} else {
		    int i_12_ = class534_sub40_sub1.method18295(1, -761815447);
		    if (i_12_ == 0) {
			i_3_ = Class637.method10560(class534_sub40_sub1,
						    -1343193041);
			Class108.aByteArray1317[i_11_] |= 0x2;
		    } else if (Class220.method4145(class534_sub40_sub1, i_11_,
						   (byte) -101))
			Class108.aByteArray1317[i_11_] |= 0x2;
		}
	    }
	}
	class534_sub40_sub1.method18296(1114038285);
	if (0 != i_3_)
	    throw new RuntimeException();
	class534_sub40_sub1.method18294(-938158416);
	for (int i_13_ = 0; i_13_ < Class108.anInt1328 * 918952205; i_13_++) {
	    int i_14_ = Class108.anIntArray1324[i_13_];
	    if ((Class108.aByteArray1317[i_14_] & 0x1) == 0) {
		if (i_3_ > 0) {
		    i_3_--;
		    Class108.aByteArray1317[i_14_] |= 0x2;
		} else {
		    int i_15_ = class534_sub40_sub1.method18295(1, -761815447);
		    if (0 == i_15_) {
			i_3_ = Class637.method10560(class534_sub40_sub1,
						    -1343193041);
			Class108.aByteArray1317[i_14_] |= 0x2;
		    } else if (Class220.method4145(class534_sub40_sub1, i_14_,
						   (byte) -89))
			Class108.aByteArray1317[i_14_] |= 0x2;
		}
	    }
	}
	class534_sub40_sub1.method18296(1220820586);
	if (i_3_ != 0)
	    throw new RuntimeException();
	Class108.anInt1321 = 0;
	Class108.anInt1328 = 0;
	for (int i_16_ = 1; i_16_ < 2048; i_16_++) {
	    Class108.aByteArray1317[i_16_] >>= 1;
	    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		= client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i_16_];
	    if (class654_sub1_sub5_sub1_sub2 != null)
		Class108.anIntArray1322
		    [(Class108.anInt1321 += 76736439) * -1843550713 - 1]
		    = i_16_;
	    else
		Class108.anIntArray1324
		    [(Class108.anInt1328 += -989241915) * 918952205 - 1]
		    = i_16_;
	}
    }
    
    static final void method8129(Class669 class669, int i) {
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub14_10755,
	     (class669.anIntArray8595
	      [(class669.anInt8600 -= 308999563) * 2088438307]),
	     776449812);
	client.aClass512_11100.method8441(176836096);
	Class672.method11096((byte) 1);
	client.aBool11048 = false;
    }
}
