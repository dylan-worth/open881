/* Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class49
{
    static Class203 aClass203_364 = new Class203(32);
    static int anInt365;
    
    public static Class183 method1142
	(Class185 class185, int i, int i_0_, int i_1_, int i_2_,
	 Class183 class183, short i_3_, byte i_4_, Class711 class711) {
	if (class183 == null)
	    return null;
	int i_5_ = 2055;
	if (class711 != null) {
	    i_5_ |= class711.method14360((short) -27385);
	    i_5_ &= ~0x200;
	}
	long l = (long) ((i_3_ & 0xffff) << 8 | i_4_);
	Class183 class183_6_;
	synchronized (aClass203_364) {
	    class183_6_ = (Class183) aClass203_364.method3871(l);
	}
	if (class183_6_ == null
	    || class185.method3330(class183_6_.method3101(), i_5_) != 0) {
	    if (class183_6_ != null)
		i_5_ = class185.method3331(i_5_, class183_6_.method3101());
	    Class187 class187 = new Class187(4, 2, 2);
	    int i_7_ = 128;
	    int[] is = new int[4];
	    is[0] = class187.method3712(-i_7_, 0, -i_7_);
	    is[1] = class187.method3712(i_7_, 0, -i_7_);
	    is[2] = class187.method3712(i_7_, 0, i_7_);
	    is[3] = class187.method3712(-i_7_, 0, i_7_);
	    class187.method3713(0, 1, 2, (byte) 1, (byte) 0, (short) 0, i_4_,
				i_3_);
	    class187.method3713(0, 2, 3, (byte) 1, (byte) 0, (short) 0, i_4_,
				i_3_);
	    class187.method3722((short) 1, (short) 2, (short) 0);
	    class187.method3722((short) 2, (short) 3, (short) 0);
	    class183_6_ = class185.method3329(class187, i_5_,
					      -1789606037 * anInt365, 64, 768);
	    synchronized (aClass203_364) {
		aClass203_364.method3893(class183_6_, l);
	    }
	}
	int i_8_ = class183.method3134();
	int i_9_ = class183.method3043();
	int i_10_ = class183.method3047();
	int i_11_ = class183.method3038();
	if (null != class711) {
	    class183_6_ = class183_6_.method3011((byte) 3, i_5_, true);
	    class183_6_.method3021(i_9_ - i_8_ >> 1, 128, i_11_ - i_10_ >> 1);
	    class183_6_.method3098(i_8_ + i_9_ >> 1, 0, i_11_ + i_10_ >> 1);
	    class711.method14342(class183_6_, -1630301400);
	} else {
	    class183_6_ = class183_6_.method3011((byte) 3, i_5_, true);
	    class183_6_.method3021(i_9_ - i_8_ >> 1, 128, i_11_ - i_10_ >> 1);
	    class183_6_.method3098(i_9_ + i_8_ >> 1, 0, i_10_ + i_11_ >> 1);
	}
	if (0 != i_0_)
	    class183_6_.method3017(i_0_);
	if (0 != i_1_)
	    class183_6_.method3018(i_1_);
	if (0 != i_2_)
	    class183_6_.method3098(0, i_2_, 0);
	return class183_6_;
    }
    
    Class49() throws Throwable {
	throw new Error();
    }
    
    public static Class183 method1143
	(Class185 class185, int i, int i_12_, int i_13_, int i_14_,
	 Class183 class183, short i_15_, byte i_16_, Class711 class711) {
	if (class183 == null)
	    return null;
	int i_17_ = 2055;
	if (class711 != null) {
	    i_17_ |= class711.method14360((short) -3169);
	    i_17_ &= ~0x200;
	}
	long l = (long) ((i_15_ & 0xffff) << 8 | i_16_);
	Class183 class183_18_;
	synchronized (aClass203_364) {
	    class183_18_ = (Class183) aClass203_364.method3871(l);
	}
	if (class183_18_ == null
	    || class185.method3330(class183_18_.method3101(), i_17_) != 0) {
	    if (class183_18_ != null)
		i_17_ = class185.method3331(i_17_, class183_18_.method3101());
	    Class187 class187 = new Class187(4, 2, 2);
	    int i_19_ = 128;
	    int[] is = new int[4];
	    is[0] = class187.method3712(-i_19_, 0, -i_19_);
	    is[1] = class187.method3712(i_19_, 0, -i_19_);
	    is[2] = class187.method3712(i_19_, 0, i_19_);
	    is[3] = class187.method3712(-i_19_, 0, i_19_);
	    class187.method3713(0, 1, 2, (byte) 1, (byte) 0, (short) 0, i_16_,
				i_15_);
	    class187.method3713(0, 2, 3, (byte) 1, (byte) 0, (short) 0, i_16_,
				i_15_);
	    class187.method3722((short) 1, (short) 2, (short) 0);
	    class187.method3722((short) 2, (short) 3, (short) 0);
	    class183_18_
		= class185.method3329(class187, i_17_, -1789606037 * anInt365,
				      64, 768);
	    synchronized (aClass203_364) {
		aClass203_364.method3893(class183_18_, l);
	    }
	}
	int i_20_ = class183.method3134();
	int i_21_ = class183.method3043();
	int i_22_ = class183.method3047();
	int i_23_ = class183.method3038();
	if (null != class711) {
	    class183_18_ = class183_18_.method3011((byte) 3, i_17_, true);
	    class183_18_.method3021(i_21_ - i_20_ >> 1, 128,
				    i_23_ - i_22_ >> 1);
	    class183_18_.method3098(i_20_ + i_21_ >> 1, 0, i_23_ + i_22_ >> 1);
	    class711.method14342(class183_18_, -1941055804);
	} else {
	    class183_18_ = class183_18_.method3011((byte) 3, i_17_, true);
	    class183_18_.method3021(i_21_ - i_20_ >> 1, 128,
				    i_23_ - i_22_ >> 1);
	    class183_18_.method3098(i_21_ + i_20_ >> 1, 0, i_22_ + i_23_ >> 1);
	}
	if (0 != i_12_)
	    class183_18_.method3017(i_12_);
	if (0 != i_13_)
	    class183_18_.method3018(i_13_);
	if (0 != i_14_)
	    class183_18_.method3098(0, i_14_, 0);
	return class183_18_;
    }
    
    public static Class183 method1144
	(Class185 class185, int i, int i_24_, int i_25_, int i_26_, int i_27_,
	 Class183 class183, int i_28_, int i_29_, int i_30_, int i_31_,
	 Class711 class711) {
	if (class183 == null)
	    return null;
	int i_32_ = 2055;
	if (null != class711) {
	    i_32_ |= class711.method14360((short) -26924);
	    i_32_ &= ~0x200;
	}
	long l = (((long) i_29_ << 48)
		  + (((long) i_28_ << 32)
		     + (long) ((i_31_ << 24) + ((i_30_ << 16) + i_27_))));
	Class183 class183_33_;
	synchronized (aClass203_364) {
	    class183_33_ = (Class183) aClass203_364.method3871(l);
	}
	if (null == class183_33_
	    || class185.method3330(class183_33_.method3101(), i_32_) != 0) {
	    if (null != class183_33_)
		i_32_ = class185.method3331(i_32_, class183_33_.method3101());
	    int i_34_ = 3 * i_27_ + 6;
	    int i_35_ = 3;
	    int[] is = { 64, 96, 128 };
	    Class187 class187 = new Class187(1 + i_35_ * i_34_,
					     i_34_ * i_35_ * 2 - i_34_, 0);
	    int i_36_ = class187.method3712(0, 0, 0);
	    int[][] is_37_ = new int[i_35_][i_34_];
	    for (int i_38_ = 0; i_38_ < i_35_; i_38_++) {
		int i_39_ = is[i_38_];
		int i_40_ = is[i_38_];
		for (int i_41_ = 0; i_41_ < i_34_; i_41_++) {
		    int i_42_ = (i_41_ << 14) / i_34_;
		    int i_43_ = i_39_ * Class427.anIntArray4806[i_42_] >> 14;
		    int i_44_ = Class427.anIntArray4805[i_42_] * i_40_ >> 14;
		    is_37_[i_38_][i_41_]
			= class187.method3712(i_43_, 0, i_44_);
		}
	    }
	    for (int i_45_ = 0; i_45_ < i_35_; i_45_++) {
		int i_46_ = (128 + i_45_ * 256) / i_35_;
		int i_47_ = 256 - i_46_;
		byte i_48_ = (byte) (i_31_ * i_46_ + i_47_ * i_30_ >> 8);
		short i_49_
		    = (short) (((((i_28_ & 0xfc00) * i_47_
				  + (i_29_ & 0xfc00) * i_46_)
				 & 0xfc0000)
				+ (i_46_ * (i_29_ & 0x380) + i_47_ * (i_28_
								      & 0x380)
				   & 0x38000)
				+ ((i_47_ * (i_28_ & 0x7f)
				    + (i_29_ & 0x7f) * i_46_)
				   & 0x7f00))
			       >> 8);
		for (int i_50_ = 0; i_50_ < i_34_; i_50_++) {
		    if (0 == i_45_)
			class187.method3713(i_36_,
					    is_37_[0][(1 + i_50_) % i_34_],
					    is_37_[0][i_50_], (byte) 1,
					    (byte) -1, i_49_, i_48_,
					    (short) -1);
		    else {
			class187.method3713(is_37_[i_45_ - 1][i_50_],
					    (is_37_[i_45_ - 1]
					     [(1 + i_50_) % i_34_]),
					    is_37_[i_45_][(1 + i_50_) % i_34_],
					    (byte) 1, (byte) -1, i_49_, i_48_,
					    (short) -1);
			class187.method3713(is_37_[i_45_ - 1][i_50_],
					    is_37_[i_45_][(i_50_ + 1) % i_34_],
					    is_37_[i_45_][i_50_], (byte) 1,
					    (byte) -1, i_49_, i_48_,
					    (short) -1);
		    }
		}
	    }
	    class183_33_
		= class185.method3329(class187, i_32_, -1789606037 * anInt365,
				      64, 768);
	    synchronized (aClass203_364) {
		aClass203_364.method3893(class183_33_, l);
	    }
	}
	int i_51_ = class183.method3134();
	int i_52_ = class183.method3043();
	int i_53_ = class183.method3047();
	int i_54_ = class183.method3038();
	if (null != class711) {
	    class183_33_ = class183_33_.method3011((byte) 3, i_32_, true);
	    class183_33_.method3021(i_52_ - i_51_ >> 1, 128,
				    i_54_ - i_53_ >> 1);
	    class183_33_.method3098(i_52_ + i_51_ >> 1, 0, i_53_ + i_54_ >> 1);
	    class711.method14342(class183_33_, -1763776445);
	} else {
	    class183_33_ = class183_33_.method3011((byte) 3, i_32_, true);
	    class183_33_.method3021(i_52_ - i_51_ >> 1, 128,
				    i_54_ - i_53_ >> 1);
	    class183_33_.method3098(i_52_ + i_51_ >> 1, 0, i_53_ + i_54_ >> 1);
	}
	if (0 != i_24_)
	    class183_33_.method3017(i_24_);
	if (0 != i_25_)
	    class183_33_.method3018(i_25_);
	if (0 != i_26_)
	    class183_33_.method3098(0, i_26_, 0);
	return class183_33_;
    }
    
    public static Class183 method1145
	(Class185 class185, int i, int i_55_, int i_56_, int i_57_,
	 Class183 class183, short i_58_, byte i_59_, Class711 class711) {
	if (class183 == null)
	    return null;
	int i_60_ = 2055;
	if (class711 != null) {
	    i_60_ |= class711.method14360((short) -19003);
	    i_60_ &= ~0x200;
	}
	long l = (long) ((i_58_ & 0xffff) << 8 | i_59_);
	Class183 class183_61_;
	synchronized (aClass203_364) {
	    class183_61_ = (Class183) aClass203_364.method3871(l);
	}
	if (class183_61_ == null
	    || class185.method3330(class183_61_.method3101(), i_60_) != 0) {
	    if (class183_61_ != null)
		i_60_ = class185.method3331(i_60_, class183_61_.method3101());
	    Class187 class187 = new Class187(4, 2, 2);
	    int i_62_ = 128;
	    int[] is = new int[4];
	    is[0] = class187.method3712(-i_62_, 0, -i_62_);
	    is[1] = class187.method3712(i_62_, 0, -i_62_);
	    is[2] = class187.method3712(i_62_, 0, i_62_);
	    is[3] = class187.method3712(-i_62_, 0, i_62_);
	    class187.method3713(0, 1, 2, (byte) 1, (byte) 0, (short) 0, i_59_,
				i_58_);
	    class187.method3713(0, 2, 3, (byte) 1, (byte) 0, (short) 0, i_59_,
				i_58_);
	    class187.method3722((short) 1, (short) 2, (short) 0);
	    class187.method3722((short) 2, (short) 3, (short) 0);
	    class183_61_
		= class185.method3329(class187, i_60_, -1789606037 * anInt365,
				      64, 768);
	    synchronized (aClass203_364) {
		aClass203_364.method3893(class183_61_, l);
	    }
	}
	int i_63_ = class183.method3134();
	int i_64_ = class183.method3043();
	int i_65_ = class183.method3047();
	int i_66_ = class183.method3038();
	if (null != class711) {
	    class183_61_ = class183_61_.method3011((byte) 3, i_60_, true);
	    class183_61_.method3021(i_64_ - i_63_ >> 1, 128,
				    i_66_ - i_65_ >> 1);
	    class183_61_.method3098(i_63_ + i_64_ >> 1, 0, i_66_ + i_65_ >> 1);
	    class711.method14342(class183_61_, -1846752999);
	} else {
	    class183_61_ = class183_61_.method3011((byte) 3, i_60_, true);
	    class183_61_.method3021(i_64_ - i_63_ >> 1, 128,
				    i_66_ - i_65_ >> 1);
	    class183_61_.method3098(i_64_ + i_63_ >> 1, 0, i_65_ + i_66_ >> 1);
	}
	if (0 != i_55_)
	    class183_61_.method3017(i_55_);
	if (0 != i_56_)
	    class183_61_.method3018(i_56_);
	if (0 != i_57_)
	    class183_61_.method3098(0, i_57_, 0);
	return class183_61_;
    }
    
    static void method1146(int i) {
	anInt365 = i * 365309251;
	synchronized (aClass203_364) {
	    aClass203_364.method3877(-1919156918);
	}
    }
    
    public static void method1147() {
	synchronized (aClass203_364) {
	    aClass203_364.method3877(1733998593);
	}
    }
    
    public static void method1148() {
	synchronized (aClass203_364) {
	    aClass203_364.method3877(1601558318);
	}
    }
    
    public static void method1149() {
	synchronized (aClass203_364) {
	    aClass203_364.method3877(-704496705);
	}
    }
    
    static final void method1150(Class669 class669, int i) {
	int i_67_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_67_, 1081973863);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_67_ >> 16];
	Class499.method8270(class247, class243, class669, 2117027602);
    }
    
    static final void method1151(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class470.method7645(class247, class243, class669, (byte) 58);
    }
    
    static final void method1152(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class247.anInt2480 * 1500908359;
    }
    
    public static boolean method1153(int i, int i_68_) {
	return i == 0 || 1 == i || i == 2;
    }
}
