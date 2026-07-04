/* Class393 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class393 implements Interface47
{
    public int anInt4083;
    public Class391 aClass391_4084;
    public static final int anInt4085 = 2;
    public static final int anInt4086 = 1;
    public Class401 aClass401_4087;
    public int anInt4088;
    public int anInt4089;
    public int anInt4090;
    public static final int anInt4091 = 0;
    public int anInt4092;
    
    Class393(Class401 class401, Class391 class391, int i, int i_0_, int i_1_,
	     int i_2_, int i_3_) {
	aClass401_4087 = class401;
	aClass391_4084 = class391;
	anInt4088 = 1498205783 * i;
	anInt4089 = i_0_ * 689095985;
	anInt4090 = 1784230569 * i_1_;
	anInt4083 = i_2_ * -1219867273;
	anInt4092 = i_3_ * -323893073;
    }
    
    public Class397 method348(int i) {
	return Class397.aClass397_4118;
    }
    
    public Class397 method350() {
	return Class397.aClass397_4118;
    }
    
    public Class397 method351() {
	return Class397.aClass397_4118;
    }
    
    public Class397 method349() {
	return Class397.aClass397_4118;
    }
    
    public static Class393 method6550(Class534_Sub40 class534_sub40) {
	Class401 class401 = (Class72.method1560(1911085848)
			     [class534_sub40.method16527(-102101963)]);
	Class391 class391 = (Class705.method14234(-1206703357)
			     [class534_sub40.method16527(305482893)]);
	int i = class534_sub40.method16530((byte) -17);
	int i_4_ = class534_sub40.method16530((byte) -26);
	int i_5_ = class534_sub40.method16550((byte) -96);
	int i_6_ = class534_sub40.method16533(-258848859);
	int i_7_ = class534_sub40.method16527(1402960215);
	return new Class393(class401, class391, i, i_4_, i_5_, i_6_, i_7_);
    }
    
    public static Class393 method6551(Class534_Sub40 class534_sub40) {
	Class401 class401 = (Class72.method1560(1891762710)
			     [class534_sub40.method16527(-1185936769)]);
	Class391 class391 = (Class705.method14234(-977256152)
			     [class534_sub40.method16527(1808477799)]);
	int i = class534_sub40.method16530((byte) -5);
	int i_8_ = class534_sub40.method16530((byte) -120);
	int i_9_ = class534_sub40.method16550((byte) -12);
	int i_10_ = class534_sub40.method16533(-258848859);
	int i_11_ = class534_sub40.method16527(271221734);
	return new Class393(class401, class391, i, i_8_, i_9_, i_10_, i_11_);
    }
    
    static final void method6552(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class65.anInt705 * 1426180139;
    }
    
    static final void method6553(Class669 class669, int i) {
	int i_12_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub17_10758, i_12_,
	     250200523);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub17_10759, i_12_,
	     2041731540);
	Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub17_10758
	    .method17034(308999563);
	Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub17_10759
	    .method17034(308999563);
	Class453_Sub5.method16008((byte) -85);
	Class672.method11096((byte) 1);
	client.aBool11048 = false;
    }
    
    public static boolean method6554(int i) {
	do {
	    boolean bool;
	    try {
		if (IcmpService_Sub1.available())
		    break;
		bool = false;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	} while (false);
	if (null != IcmpService_Sub1.anIcmpService_Sub1_10890)
	    throw new IllegalStateException("");
	IcmpService_Sub1.anIcmpService_Sub1_10890 = new IcmpService_Sub1();
	Thread thread = new Thread(new Class645());
	thread.setDaemon(true);
	thread.start();
	return true;
    }
    
    public static String method6555(byte i) {
	return Class534_Sub1_Sub2.aString11720;
    }
    
    static int method6556(int i, byte i_13_) {
	Class534_Sub39 class534_sub39
	    = (Class534_Sub39) Class625.aClass9_8162.method579((long) i);
	if (class534_sub39 == null) {
	    Class384 class384
		= Class625.anInterface46_8159.method345(i, -404064168);
	    if (null == class384 || 2 != class384.anInt3954 * 302557339)
		return -1;
	    class534_sub39
		= new Class534_Sub39(1254165885 * Class625.anInt8161);
	    Class625.aClass9_8162.method581(class534_sub39, (long) i);
	    Class625.aClass384Array8160
		[(Class625.anInt8161 += 1391825877) * 1254165885 - 1]
		= class384;
	}
	return class534_sub39.anInt10807 * -705967177;
    }
    
    static final void method6557(Class669 class669, byte i) {
	int i_14_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class15 class15
	    = ((Class15)
	       Class531.aClass44_Sub7_7135.method91(i_14_, -1595635726));
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class15.anInt113 * 1160623023;
    }
}
