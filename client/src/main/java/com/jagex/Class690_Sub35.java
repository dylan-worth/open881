/* Class690_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class690_Sub35 extends Class690
{
    public void method17177() {
	if (aClass534_Sub35_8752.method16442(-531493946)
		.method14108(-1233550485)) {
	    if ((anInt8753 * 189295939
		 < Class288.aClass288_3089.anInt3087 * 1733332129)
		|| (anInt8753 * 189295939
		    > Class288.aClass288_3088.anInt3087 * 1733332129))
		anInt8753 = method14017(2144048594) * 1823770475;
	} else if ((anInt8753 * 189295939
		    < Class292.aClass292_3120.anInt3122 * -919727987)
		   || (189295939 * anInt8753
		       > Class292.aClass292_3121.anInt3122 * -919727987))
	    anInt8753 = method14017(2142857161) * 1823770475;
    }
    
    public Class690_Sub35(int i, Class534_Sub35 class534_sub35) {
	super(i, class534_sub35);
    }
    
    public void method17178(byte i) {
	if (aClass534_Sub35_8752.method16442(-531493946)
		.method14108(-1233550485)) {
	    if ((anInt8753 * 189295939
		 < Class288.aClass288_3089.anInt3087 * 1733332129)
		|| (anInt8753 * 189295939
		    > Class288.aClass288_3088.anInt3087 * 1733332129))
		anInt8753 = method14017(2094625706) * 1823770475;
	} else if ((anInt8753 * 189295939
		    < Class292.aClass292_3120.anInt3122 * -919727987)
		   || (189295939 * anInt8753
		       > Class292.aClass292_3121.anInt3122 * -919727987))
	    anInt8753 = method14017(2135519887) * 1823770475;
    }
    
    int method14017(int i) {
	if (aClass534_Sub35_8752.method16442(-531493946)
		.method14108(-1233550485))
	    return 1733332129 * Class288.aClass288_3085.anInt3087;
	return -919727987 * Class292.aClass292_3120.anInt3122;
    }
    
    int method14026(int i, int i_0_) {
	return 1;
    }
    
    int method14018() {
	if (aClass534_Sub35_8752.method16442(-531493946)
		.method14108(-1233550485))
	    return 1733332129 * Class288.aClass288_3085.anInt3087;
	return -919727987 * Class292.aClass292_3120.anInt3122;
    }
    
    public int method17179(byte i) {
	return 189295939 * anInt8753;
    }
    
    int method14021() {
	if (aClass534_Sub35_8752.method16442(-531493946)
		.method14108(-1233550485))
	    return 1733332129 * Class288.aClass288_3085.anInt3087;
	return -919727987 * Class292.aClass292_3120.anInt3122;
    }
    
    int method14022() {
	if (aClass534_Sub35_8752.method16442(-531493946)
		.method14108(-1233550485))
	    return 1733332129 * Class288.aClass288_3085.anInt3087;
	return -919727987 * Class292.aClass292_3120.anInt3122;
    }
    
    public Class690_Sub35(Class534_Sub35 class534_sub35) {
	super(class534_sub35);
    }
    
    void method14023(int i) {
	anInt8753 = 1823770475 * i;
    }
    
    void method14025(int i) {
	anInt8753 = 1823770475 * i;
    }
    
    void method14024(int i) {
	anInt8753 = 1823770475 * i;
    }
    
    int method14027(int i) {
	return 1;
    }
    
    int method14028(int i) {
	return 1;
    }
    
    int method14029(int i) {
	return 1;
    }
    
    void method14020(int i, int i_1_) {
	anInt8753 = 1823770475 * i;
    }
    
    public void method17180() {
	if (aClass534_Sub35_8752.method16442(-531493946)
		.method14108(-1233550485)) {
	    if ((anInt8753 * 189295939
		 < Class288.aClass288_3089.anInt3087 * 1733332129)
		|| (anInt8753 * 189295939
		    > Class288.aClass288_3088.anInt3087 * 1733332129))
		anInt8753 = method14017(2145380264) * 1823770475;
	} else if ((anInt8753 * 189295939
		    < Class292.aClass292_3120.anInt3122 * -919727987)
		   || (189295939 * anInt8753
		       > Class292.aClass292_3121.anInt3122 * -919727987))
	    anInt8753 = method14017(2101738038) * 1823770475;
    }
    
    int method14030(int i) {
	return 1;
    }
    
    public int method17181() {
	return 189295939 * anInt8753;
    }
    
    public static Class183 method17182(Class185 class185, int i, int i_2_,
				       int i_3_, int i_4_, Class183 class183,
				       short i_5_, byte i_6_,
				       Class711 class711, byte i_7_) {
	if (class183 == null)
	    return null;
	int i_8_ = 2055;
	if (class711 != null) {
	    i_8_ |= class711.method14360((short) -2611);
	    i_8_ &= ~0x200;
	}
	long l = (long) ((i_5_ & 0xffff) << 8 | i_6_);
	Class183 class183_9_;
	synchronized (Class49.aClass203_364) {
	    class183_9_ = (Class183) Class49.aClass203_364.method3871(l);
	}
	if (class183_9_ == null
	    || class185.method3330(class183_9_.method3101(), i_8_) != 0) {
	    if (class183_9_ != null)
		i_8_ = class185.method3331(i_8_, class183_9_.method3101());
	    Class187 class187 = new Class187(4, 2, 2);
	    int i_10_ = 128;
	    int[] is = new int[4];
	    is[0] = class187.method3712(-i_10_, 0, -i_10_);
	    is[1] = class187.method3712(i_10_, 0, -i_10_);
	    is[2] = class187.method3712(i_10_, 0, i_10_);
	    is[3] = class187.method3712(-i_10_, 0, i_10_);
	    class187.method3713(0, 1, 2, (byte) 1, (byte) 0, (short) 0, i_6_,
				i_5_);
	    class187.method3713(0, 2, 3, (byte) 1, (byte) 0, (short) 0, i_6_,
				i_5_);
	    class187.method3722((short) 1, (short) 2, (short) 0);
	    class187.method3722((short) 2, (short) 3, (short) 0);
	    class183_9_
		= class185.method3329(class187, i_8_,
				      -1789606037 * Class49.anInt365, 64, 768);
	    synchronized (Class49.aClass203_364) {
		Class49.aClass203_364.method3893(class183_9_, l);
	    }
	}
	int i_11_ = class183.method3134();
	int i_12_ = class183.method3043();
	int i_13_ = class183.method3047();
	int i_14_ = class183.method3038();
	if (null != class711) {
	    class183_9_ = class183_9_.method3011((byte) 3, i_8_, true);
	    class183_9_.method3021(i_12_ - i_11_ >> 1, 128,
				   i_14_ - i_13_ >> 1);
	    class183_9_.method3098(i_11_ + i_12_ >> 1, 0, i_14_ + i_13_ >> 1);
	    class711.method14342(class183_9_, -91067565);
	} else {
	    class183_9_ = class183_9_.method3011((byte) 3, i_8_, true);
	    class183_9_.method3021(i_12_ - i_11_ >> 1, 128,
				   i_14_ - i_13_ >> 1);
	    class183_9_.method3098(i_12_ + i_11_ >> 1, 0, i_13_ + i_14_ >> 1);
	}
	if (0 != i_2_)
	    class183_9_.method3017(i_2_);
	if (0 != i_3_)
	    class183_9_.method3018(i_3_);
	if (0 != i_4_)
	    class183_9_.method3098(0, i_4_, 0);
	return class183_9_;
    }
}
