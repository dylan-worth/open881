/* Class200_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class200_Sub3 extends Class200
{
    int anInt9886;
    int anInt9887;
    int anInt9888;
    int anInt9889;
    int anInt9890;
    int anInt9891;
    
    public void method3846() {
	Class201.aClass204Array2178[-1065149589 * anInt9889]
	    .method3906(0, 1510860557);
	Class201.aClass204Array2178[anInt9887 * 750044415]
	    .method3906(1, 1401667643);
	client.anInt11152 = 0;
	client.anInt11052 = -211353161 * anInt9886;
	client.anInt11156 = 0;
	client.anInt11034 = anInt9890 * -510081599;
	client.anInt11266 = 1249772227 * anInt9891;
	client.anInt11153 = 378787251;
	client.anInt11080 = anInt9888 * -1838245657;
	Class10.anInt75 = -1822037319;
	Class84.method1670(1863358455);
	client.aBool11109 = true;
    }
    
    public void method3845(int i) {
	Class201.aClass204Array2178[-1065149589 * anInt9889]
	    .method3906(0, -1764616998);
	Class201.aClass204Array2178[anInt9887 * 750044415]
	    .method3906(1, 362087381);
	client.anInt11152 = 0;
	client.anInt11052 = -211353161 * anInt9886;
	client.anInt11156 = 0;
	client.anInt11034 = anInt9890 * -510081599;
	client.anInt11266 = 1249772227 * anInt9891;
	client.anInt11153 = 378787251;
	client.anInt11080 = anInt9888 * -1838245657;
	Class10.anInt75 = -1822037319;
	Class84.method1670(1535622260);
	client.aBool11109 = true;
    }
    
    Class200_Sub3(Class534_Sub40 class534_sub40) {
	super(class534_sub40);
	anInt9889 = class534_sub40.method16529((byte) 1) * -1744881341;
	anInt9887 = class534_sub40.method16529((byte) 1) * 1991391999;
	anInt9886 = class534_sub40.method16529((byte) 1) * 1898993095;
	anInt9888 = class534_sub40.method16529((byte) 1) * 2070961019;
	anInt9890 = class534_sub40.method16529((byte) 1) * 295898495;
	anInt9891 = class534_sub40.method16529((byte) 1) * -1925109261;
    }
    
    public void method3847() {
	Class201.aClass204Array2178[-1065149589 * anInt9889]
	    .method3906(0, 1375744065);
	Class201.aClass204Array2178[anInt9887 * 750044415]
	    .method3906(1, -1473549086);
	client.anInt11152 = 0;
	client.anInt11052 = -211353161 * anInt9886;
	client.anInt11156 = 0;
	client.anInt11034 = anInt9890 * -510081599;
	client.anInt11266 = 1249772227 * anInt9891;
	client.anInt11153 = 378787251;
	client.anInt11080 = anInt9888 * -1838245657;
	Class10.anInt75 = -1822037319;
	Class84.method1670(1299932006);
	client.aBool11109 = true;
    }
    
    public static Class183 method15570
	(Class185 class185, int i, int i_0_, int i_1_, int i_2_, int i_3_,
	 Class183 class183, int i_4_, int i_5_, int i_6_, int i_7_,
	 Class711 class711, int i_8_) {
	if (class183 == null)
	    return null;
	int i_9_ = 2055;
	if (null != class711) {
	    i_9_ |= class711.method14360((short) -11682);
	    i_9_ &= ~0x200;
	}
	long l = (((long) i_5_ << 48)
		  + (((long) i_4_ << 32)
		     + (long) ((i_7_ << 24) + ((i_6_ << 16) + i_3_))));
	Class183 class183_10_;
	synchronized (Class49.aClass203_364) {
	    class183_10_ = (Class183) Class49.aClass203_364.method3871(l);
	}
	if (null == class183_10_
	    || class185.method3330(class183_10_.method3101(), i_9_) != 0) {
	    if (null != class183_10_)
		i_9_ = class185.method3331(i_9_, class183_10_.method3101());
	    int i_11_ = 3 * i_3_ + 6;
	    int i_12_ = 3;
	    int[] is = { 64, 96, 128 };
	    Class187 class187 = new Class187(1 + i_12_ * i_11_,
					     i_11_ * i_12_ * 2 - i_11_, 0);
	    int i_13_ = class187.method3712(0, 0, 0);
	    int[][] is_14_ = new int[i_12_][i_11_];
	    for (int i_15_ = 0; i_15_ < i_12_; i_15_++) {
		int i_16_ = is[i_15_];
		int i_17_ = is[i_15_];
		for (int i_18_ = 0; i_18_ < i_11_; i_18_++) {
		    int i_19_ = (i_18_ << 14) / i_11_;
		    int i_20_ = i_16_ * Class427.anIntArray4806[i_19_] >> 14;
		    int i_21_ = Class427.anIntArray4805[i_19_] * i_17_ >> 14;
		    is_14_[i_15_][i_18_]
			= class187.method3712(i_20_, 0, i_21_);
		}
	    }
	    for (int i_22_ = 0; i_22_ < i_12_; i_22_++) {
		int i_23_ = (128 + i_22_ * 256) / i_12_;
		int i_24_ = 256 - i_23_;
		byte i_25_ = (byte) (i_7_ * i_23_ + i_24_ * i_6_ >> 8);
		short i_26_
		    = (short) (((((i_4_ & 0xfc00) * i_24_
				  + (i_5_ & 0xfc00) * i_23_)
				 & 0xfc0000)
				+ (i_23_ * (i_5_ & 0x380) + i_24_ * (i_4_
								     & 0x380)
				   & 0x38000)
				+ ((i_24_ * (i_4_ & 0x7f)
				    + (i_5_ & 0x7f) * i_23_)
				   & 0x7f00))
			       >> 8);
		for (int i_27_ = 0; i_27_ < i_11_; i_27_++) {
		    if (0 == i_22_)
			class187.method3713(i_13_,
					    is_14_[0][(1 + i_27_) % i_11_],
					    is_14_[0][i_27_], (byte) 1,
					    (byte) -1, i_26_, i_25_,
					    (short) -1);
		    else {
			class187.method3713(is_14_[i_22_ - 1][i_27_],
					    (is_14_[i_22_ - 1]
					     [(1 + i_27_) % i_11_]),
					    is_14_[i_22_][(1 + i_27_) % i_11_],
					    (byte) 1, (byte) -1, i_26_, i_25_,
					    (short) -1);
			class187.method3713(is_14_[i_22_ - 1][i_27_],
					    is_14_[i_22_][(i_27_ + 1) % i_11_],
					    is_14_[i_22_][i_27_], (byte) 1,
					    (byte) -1, i_26_, i_25_,
					    (short) -1);
		    }
		}
	    }
	    class183_10_
		= class185.method3329(class187, i_9_,
				      -1789606037 * Class49.anInt365, 64, 768);
	    synchronized (Class49.aClass203_364) {
		Class49.aClass203_364.method3893(class183_10_, l);
	    }
	}
	int i_28_ = class183.method3134();
	int i_29_ = class183.method3043();
	int i_30_ = class183.method3047();
	int i_31_ = class183.method3038();
	if (null != class711) {
	    class183_10_ = class183_10_.method3011((byte) 3, i_9_, true);
	    class183_10_.method3021(i_29_ - i_28_ >> 1, 128,
				    i_31_ - i_30_ >> 1);
	    class183_10_.method3098(i_29_ + i_28_ >> 1, 0, i_30_ + i_31_ >> 1);
	    class711.method14342(class183_10_, -988284401);
	} else {
	    class183_10_ = class183_10_.method3011((byte) 3, i_9_, true);
	    class183_10_.method3021(i_29_ - i_28_ >> 1, 128,
				    i_31_ - i_30_ >> 1);
	    class183_10_.method3098(i_29_ + i_28_ >> 1, 0, i_30_ + i_31_ >> 1);
	}
	if (0 != i_0_)
	    class183_10_.method3017(i_0_);
	if (0 != i_1_)
	    class183_10_.method3018(i_1_);
	if (0 != i_2_)
	    class183_10_.method3098(0, i_2_, 0);
	return class183_10_;
    }
}
