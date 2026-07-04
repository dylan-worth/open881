/* Class631 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class631
{
    public static final int anInt8202 = -2147483648;
    public static final int anInt8203 = 1073741824;
    static final int anInt8204 = 1073741823;
    int[] anIntArray8205;
    public boolean aBool8206;
    public static final int anInt8207 = 4;
    public int[] anIntArray8208;
    int anInt8209;
    long aLong8210;
    Class17[] aClass17Array8211;
    public int anInt8212 = -2005653935;
    public int[] anIntArray8213;
    public static final int anInt8214 = 4;
    public static final int anInt8215 = 10;
    long aLong8216;
    public static final int anInt8217 = 10;
    public static short[][] aShortArrayArray8218;
    static int[] anIntArray8219 = { 8, 11, 4, 6, 9, 7, 10, 0 };
    static Class203 aClass203_8220 = new Class203(260);
    static Class203 aClass203_8221 = new Class203(5);
    public static Class472 aClass472_8222;
    
    public Class183 method10434
	(Class185 class185, int i, Class44_Sub14 class44_sub14,
	 Class44_Sub15 class44_sub15, Class44_Sub3 class44_sub3,
	 Class44_Sub7 class44_sub7, Interface18 interface18,
	 Interface20 interface20, Class711 class711, Class711 class711_0_,
	 Class711[] class711s, int[] is, int i_1_, boolean bool,
	 Class630 class630, int i_2_) {
	if (1568742735 * anInt8212 != -1)
	    return (((Class307)
		     class44_sub3.method91(1568742735 * anInt8212, 594000351))
			.method5610
		    (class185, i, class44_sub14, interface18, interface20,
		     class711, class711_0_, class711s, is, i_1_, null,
		     -1549507482));
	int i_3_ = i;
	long l = aLong8216 * -5136918868954132743L;
	int[] is_4_ = anIntArray8205;
	boolean bool_5_ = false;
	boolean bool_6_ = false;
	if (null != class711) {
	    Class205 class205 = class711.method14382(-1194209608);
	    if (null != class205
		&& (class205.anInt2219 * 1456424793 >= 0
		    || class205.anInt2228 * -2133808015 >= 0)) {
		is_4_ = new int[anIntArray8205.length];
		for (int i_7_ = 0; i_7_ < is_4_.length; i_7_++)
		    is_4_[i_7_] = anIntArray8205[i_7_];
		if (1456424793 * class205.anInt2219 >= 0
		    && -1 != 133098641 * class630.anInt8193) {
		    bool_5_ = true;
		    if (65535 == 1456424793 * class205.anInt2219) {
			is_4_[class630.anInt8193 * 133098641] = 0;
			for (int i_8_ = 0;
			     i_8_ < class630.anIntArray8199.length; i_8_++)
			    is_4_[class630.anIntArray8199[i_8_]] = 0;
			l ^= ~0xffffffffL;
		    } else {
			is_4_[class630.anInt8193 * 133098641]
			    = 1456424793 * class205.anInt2219 | 0x40000000;
			for (int i_9_ = 0;
			     i_9_ < class630.anIntArray8199.length; i_9_++)
			    is_4_[class630.anIntArray8199[i_9_]] = 0;
			l ^= ((long) is_4_[133098641 * class630.anInt8193]
			      << 32);
		    }
		}
		if (-2133808015 * class205.anInt2228 >= 0
		    && -1 != class630.anInt8194 * 1980974041) {
		    bool_6_ = true;
		    if (65535 == class205.anInt2228 * -2133808015) {
			is_4_[1980974041 * class630.anInt8194] = 0;
			for (int i_10_ = 0;
			     i_10_ < class630.anIntArray8200.length; i_10_++)
			    is_4_[class630.anIntArray8200[i_10_]] = 0;
			l ^= 0xffffffffL;
		    } else {
			is_4_[class630.anInt8194 * 1980974041]
			    = class205.anInt2228 * -2133808015 | 0x40000000;
			for (int i_11_ = 0;
			     i_11_ < class630.anIntArray8200.length; i_11_++)
			    is_4_[class630.anIntArray8200[i_11_]] = 0;
			l ^= (long) is_4_[class630.anInt8194 * 1980974041];
		    }
		}
	    }
	}
	boolean bool_12_ = false;
	int i_13_ = null != class711s ? class711s.length : 0;
	for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
	    if (null != class711s[i_14_]) {
		i_3_ |= class711s[i_14_].method14360((short) -5435);
		bool_12_ = true;
	    }
	}
	if (null != class711) {
	    i_3_ |= class711.method14360((short) -2328);
	    bool_12_ = true;
	}
	if (null != class711_0_) {
	    i_3_ |= class711_0_.method14360((short) -16576);
	    bool_12_ = true;
	}
	boolean bool_15_ = false;
	if (is != null) {
	    for (int i_16_ = 0; i_16_ < is.length; i_16_++) {
		if (-1 != is[i_16_]) {
		    i_3_ |= 0x20;
		    bool_15_ = true;
		}
	    }
	}
	Class183 class183;
	synchronized (aClass203_8220) {
	    class183 = (Class183) aClass203_8220.method3871(l);
	}
	Class570 class570 = null;
	if (-1 != anInt8209 * 1957003231)
	    class570
		= (Class570) class44_sub14.method91(1957003231 * anInt8209,
						    1470625264);
	if (class183 == null
	    || class185.method3330(class183.method3101(), i_3_) != 0) {
	    if (class183 != null)
		i_3_ = class185.method3331(i_3_, class183.method3101());
	    int i_17_ = i_3_;
	    boolean bool_18_ = false;
	    for (int i_19_ = 0; i_19_ < is_4_.length; i_19_++) {
		int i_20_ = is_4_[i_19_];
		Class17 class17 = null;
		boolean bool_21_ = false;
		if (bool_5_) {
		    if (133098641 * class630.anInt8193 == i_19_)
			bool_21_ = true;
		    else {
			for (int i_22_ = 0;
			     i_22_ < class630.anIntArray8199.length; i_22_++) {
			    if (i_19_ == class630.anIntArray8199[i_22_]) {
				bool_21_ = true;
				break;
			    }
			}
		    }
		}
		if (bool_6_) {
		    if (i_19_ == class630.anInt8194 * 1980974041)
			bool_21_ = true;
		    else {
			for (int i_23_ = 0;
			     i_23_ < class630.anIntArray8200.length; i_23_++) {
			    if (i_19_ == class630.anIntArray8200[i_23_]) {
				bool_21_ = true;
				break;
			    }
			}
		    }
		}
		if (0 != (i_20_ & 0x40000000)) {
		    if (!bool_21_ && null != aClass17Array8211
			&& aClass17Array8211[i_19_] != null)
			class17 = aClass17Array8211[i_19_];
		    if (!((Class15) class44_sub7.method91(i_20_ & 0x3fffffff,
							  -1461180255))
			     .method677(aBool8206, class17, -1151798175))
			bool_18_ = true;
		} else if (0 != (i_20_ & ~0x7fffffff)
			   && !((Class330)
				class44_sub15.method91(i_20_ & 0x3fffffff,
						       269786741))
				   .method5838(-1505730923))
		    bool_18_ = true;
	    }
	    if (bool_18_) {
		if (-1838289588078258487L * aLong8210 != -1L) {
		    synchronized (aClass203_8220) {
			class183
			    = (Class183) (aClass203_8220.method3871
					  (aLong8210 * -1838289588078258487L));
		    }
		}
		if (null == class183
		    || class185.method3330(class183.method3101(), i_3_) != 0)
		    return null;
	    } else {
		Class187[] class187s = new Class187[is_4_.length];
		for (int i_24_ = 0; i_24_ < is_4_.length; i_24_++) {
		    int i_25_ = is_4_[i_24_];
		    Class17 class17 = null;
		    boolean bool_26_
			= 5 == i_24_ && bool_5_ || 3 == i_24_ && bool_6_;
		    if ((i_25_ & 0x40000000) != 0) {
			if (!bool_26_ && null != aClass17Array8211
			    && null != aClass17Array8211[i_24_])
			    class17 = aClass17Array8211[i_24_];
			Class187 class187
			    = ((Class15)
			       class44_sub7.method91(i_25_ & 0x3fffffff,
						     -1840819367))
				  .method680(aBool8206, class17, (byte) 2);
			if (null != class187)
			    class187s[i_24_] = class187;
		    } else if (0 != (i_25_ & ~0x7fffffff)) {
			Class187 class187
			    = ((Class330)
			       class44_sub15.method91(i_25_ & 0x3fffffff,
						      -1969416527))
				  .method5839(-845027918);
			if (class187 != null)
			    class187s[i_24_] = class187;
		    }
		}
		if (null != class570 && null != class570.anIntArrayArray7648) {
		    for (int i_27_ = 0;
			 i_27_ < class570.anIntArrayArray7648.length;
			 i_27_++) {
			if (class187s[i_27_] != null) {
			    int i_28_ = 0;
			    int i_29_ = 0;
			    int i_30_ = 0;
			    int i_31_ = 0;
			    int i_32_ = 0;
			    int i_33_ = 0;
			    if (null != class570.anIntArrayArray7648[i_27_]) {
				i_28_ = class570.anIntArrayArray7648[i_27_][0];
				i_29_ = class570.anIntArrayArray7648[i_27_][1];
				i_30_ = class570.anIntArrayArray7648[i_27_][2];
				i_31_ = (class570.anIntArrayArray7648[i_27_][3]
					 << 3);
				i_32_ = (class570.anIntArrayArray7648[i_27_][4]
					 << 3);
				i_33_ = (class570.anIntArrayArray7648[i_27_][5]
					 << 3);
			    }
			    if (0 != i_31_ || i_32_ != 0 || 0 != i_33_)
				class187s[i_27_].method3724(i_31_, i_32_,
							    i_33_);
			    if (i_28_ != 0 || 0 != i_29_ || i_30_ != 0)
				class187s[i_27_].method3721(i_28_, i_29_,
							    i_30_);
			}
		    }
		}
		Class187 class187 = new Class187(class187s, class187s.length);
		i_17_ |= 0x4000;
		class183 = class185.method3329(class187, i_17_,
					       Class597.anInt7862 * -18281241,
					       64, 850);
		for (int i_34_ = 0; i_34_ < 10; i_34_++) {
		    for (int i_35_ = 0;
			 i_35_ < aShortArrayArray8218[i_34_].length; i_35_++) {
			if (anIntArray8208[i_34_]
			    < (Class312.aShortArrayArrayArray3371[i_34_]
			       [i_35_]).length)
			    class183.method3056((aShortArrayArray8218[i_34_]
						 [i_35_]),
						(Class312
						 .aShortArrayArrayArray3371
						 [i_34_][i_35_]
						 [anIntArray8208[i_34_]]));
		    }
		}
		for (int i_36_ = 0; i_36_ < 10; i_36_++) {
		    for (int i_37_ = 0;
			 i_37_ < Class580.aShortArrayArray7762[i_36_].length;
			 i_37_++) {
			if (anIntArray8213[i_36_]
			    < (Class473.aShortArrayArrayArray5173[i_36_]
			       [i_37_]).length)
			    class183.method3118((Class580.aShortArrayArray7762
						 [i_36_][i_37_]),
						(Class473
						 .aShortArrayArrayArray5173
						 [i_36_][i_37_]
						 [anIntArray8213[i_36_]]));
		    }
		}
		class183.method3050();
		if (bool) {
		    class183.method3012(i_3_);
		    synchronized (aClass203_8220) {
			aClass203_8220.method3893(class183, l);
		    }
		    aLong8210 = l * 4695899949764322169L;
		}
	    }
	}
	Class183 class183_38_ = class183.method3011((byte) 4, i_3_, true);
	if (!bool_12_ && !bool_15_)
	    return class183_38_;
	Class446[] class446s = null;
	if (null != class570)
	    class446s = class570.method9616((byte) -71);
	if (bool_15_ && null != class446s) {
	    for (int i_39_ = 0; i_39_ < is.length; i_39_++) {
		if (null != class446s[i_39_])
		    class183_38_.method3037(class446s[i_39_], 1 << i_39_,
					    true);
	    }
	}
	int i_40_ = 0;
	int i_41_ = 1;
	while (i_40_ < i_13_) {
	    if (null != class711s[i_40_])
		class711s[i_40_].method14341(class183_38_, 0, i_41_,
					     -1129238346);
	    i_40_++;
	    i_41_ <<= 1;
	}
	if (bool_15_) {
	    for (i_40_ = 0; i_40_ < is.length; i_40_++) {
		if (-1 != is[i_40_]) {
		    i_41_ = is[i_40_] - i_1_;
		    i_41_ &= 0x3fff;
		    Class446 class446 = new Class446();
		    class446.method7244(0.0F, 1.0F, 0.0F,
					Class427.method6799(i_41_));
		    class183_38_.method3037(class446, 1 << i_40_, false);
		}
	    }
	}
	if (bool_15_ && null != class446s) {
	    for (i_40_ = 0; i_40_ < is.length; i_40_++) {
		if (class446s[i_40_] != null)
		    class183_38_.method3037(class446s[i_40_], 1 << i_40_,
					    false);
	    }
	}
	if (null != class711 && null != class711_0_)
	    Class612.method10106(class183_38_, class711, class711_0_,
				 (byte) 40);
	else if (class711 != null)
	    class711.method14399(class183_38_, 0, 1535694780);
	else if (class711_0_ != null)
	    class711_0_.method14399(class183_38_, 0, 1943436048);
	return class183_38_;
    }
    
    public void method10435(int i, int[] is, Class17[] class17s, int[] is_42_,
			    int[] is_43_, boolean bool, int i_44_,
			    short i_45_) {
	if (anInt8209 * 1957003231 != i)
	    anInt8209 = i * 1957362719;
	anIntArray8205 = is;
	aClass17Array8211 = class17s;
	anIntArray8208 = is_42_;
	anIntArray8213 = is_43_;
	aBool8206 = bool;
	anInt8212 = 2005653935 * i_44_;
	method10449((byte) -12);
    }
    
    public void method10436(int i, int i_46_, Class44_Sub15 class44_sub15) {
	int i_47_ = anIntArray8219[i];
	if (class44_sub15.method91(i_46_, 917338146) != null) {
	    anIntArray8205[i_47_] = i_46_ | ~0x7fffffff;
	    method10449((byte) -11);
	}
    }
    
    public Class183 method10437(Class185 class185, int i,
				Class44_Sub15 class44_sub15,
				Class44_Sub1 class44_sub1, Class711 class711,
				int i_48_, int i_49_, int i_50_) {
	int i_51_
	    = class711 != null ? i | class711.method14360((short) -30517) : i;
	long l = (long) i_50_ << 32 | (long) (i_49_ << 16) | (long) i_48_;
	Class183 class183;
	synchronized (aClass203_8221) {
	    class183 = (Class183) aClass203_8221.method3871(l);
	}
	if (class183 == null
	    || class185.method3330(class183.method3101(), i_51_) != 0) {
	    if (null != class183)
		i_51_ = class185.method3331(i_51_, class183.method3101());
	    int i_52_ = i_51_;
	    Class187[] class187s = new Class187[3];
	    int i_53_ = 0;
	    if (((Class330) class44_sub15.method91(i_48_, 1052877844))
		    .method5840((byte) -114)
		&& ((Class330) class44_sub15.method91(i_49_, -1322309099))
		       .method5840((byte) -94)
		&& ((Class330) class44_sub15.method91(i_50_, 461378266))
		       .method5840((byte) -124)) {
		Class187 class187
		    = ((Class330) class44_sub15.method91(i_48_, -1403383734))
			  .method5841((byte) 126);
		if (null != class187)
		    class187s[i_53_++] = class187;
		class187
		    = ((Class330) class44_sub15.method91(i_49_, -872498709))
			  .method5841((byte) 126);
		if (class187 != null)
		    class187s[i_53_++] = class187;
		class187
		    = ((Class330) class44_sub15.method91(i_50_, -1976854681))
			  .method5841((byte) 126);
		if (class187 != null)
		    class187s[i_53_++] = class187;
		class187 = new Class187(class187s, i_53_);
		i_52_ |= 0x4000;
		class183 = class185.method3329(class187, i_52_,
					       -18281241 * Class597.anInt7862,
					       64, 768);
		for (int i_54_ = 0; i_54_ < 10; i_54_++) {
		    for (int i_55_ = 0;
			 i_55_ < aShortArrayArray8218[i_54_].length; i_55_++) {
			if (anIntArray8208[i_54_]
			    < (Class312.aShortArrayArrayArray3371[i_54_]
			       [i_55_]).length)
			    class183.method3056((aShortArrayArray8218[i_54_]
						 [i_55_]),
						(Class312
						 .aShortArrayArrayArray3371
						 [i_54_][i_55_]
						 [anIntArray8208[i_54_]]));
		    }
		}
		for (int i_56_ = 0; i_56_ < 10; i_56_++) {
		    for (int i_57_ = 0;
			 i_57_ < Class580.aShortArrayArray7762[i_56_].length;
			 i_57_++) {
			if (anIntArray8213[i_56_]
			    < (Class473.aShortArrayArrayArray5173[i_56_]
			       [i_57_]).length)
			    class183.method3118((Class580.aShortArrayArray7762
						 [i_56_][i_57_]),
						(Class473
						 .aShortArrayArrayArray5173
						 [i_56_][i_57_]
						 [anIntArray8213[i_56_]]));
		    }
		}
		class183.method3012(i_51_);
		synchronized (aClass203_8221) {
		    aClass203_8221.method3893(class183, l);
		}
	    } else
		return null;
	}
	if (class711 == null)
	    return class183;
	class183 = class183.method3011((byte) 4, i_51_, true);
	class711.method14399(class183, 0, 2079175882);
	return class183;
    }
    
    public void method10438(int i, int i_58_, byte i_59_) {
	anIntArray8213[i] = i_58_;
	method10449((byte) -113);
    }
    
    public void method10439(int i, int i_60_, Class44_Sub15 class44_sub15,
			    int i_61_) {
	int i_62_ = anIntArray8219[i];
	if (class44_sub15.method91(i_60_, 1111243241) != null) {
	    anIntArray8205[i_62_] = i_60_ | ~0x7fffffff;
	    method10449((byte) -8);
	}
    }
    
    void method10440() {
	long[] ls = Class534_Sub40.aLongArray10812;
	aLong8216 = 8746091183093017783L;
	aLong8216 = (-8746091183093017783L
		     * (aLong8216 * -5136918868954132743L >>> 8
			^ ls[(int) ((-5136918868954132743L * aLong8216
				     ^ (long) (anInt8209 * 1957003231 >> 8))
				    & 0xffL)]));
	aLong8216 = (-5136918868954132743L * aLong8216 >>> 8
		     ^ ls[(int) ((aLong8216 * -5136918868954132743L
				  ^ (long) (anInt8209 * 1957003231))
				 & 0xffL)]) * -8746091183093017783L;
	for (int i = 0; i < anIntArray8205.length; i++) {
	    aLong8216 = (-8746091183093017783L
			 * (-5136918868954132743L * aLong8216 >>> 8
			    ^ ls[(int) ((aLong8216 * -5136918868954132743L
					 ^ (long) (anIntArray8205[i] >> 24))
					& 0xffL)]));
	    aLong8216 = (-8746091183093017783L
			 * (aLong8216 * -5136918868954132743L >>> 8
			    ^ ls[(int) ((-5136918868954132743L * aLong8216
					 ^ (long) (anIntArray8205[i] >> 16))
					& 0xffL)]));
	    aLong8216 = (-8746091183093017783L
			 * (aLong8216 * -5136918868954132743L >>> 8
			    ^ ls[(int) ((-5136918868954132743L * aLong8216
					 ^ (long) (anIntArray8205[i] >> 8))
					& 0xffL)]));
	    aLong8216 = (aLong8216 * -5136918868954132743L >>> 8
			 ^ ls[(int) ((aLong8216 * -5136918868954132743L
				      ^ (long) anIntArray8205[i])
				     & 0xffL)]) * -8746091183093017783L;
	}
	if (aClass17Array8211 != null) {
	    for (int i = 0; i < aClass17Array8211.length; i++) {
		if (null != aClass17Array8211[i]) {
		    int[] is;
		    int[] is_63_;
		    if (aBool8206) {
			is = aClass17Array8211[i].anIntArray195;
			is_63_ = aClass17Array8211[i].anIntArray200;
		    } else {
			is = aClass17Array8211[i].anIntArray198;
			is_63_ = aClass17Array8211[i].anIntArray197;
		    }
		    if (null != is) {
			for (int i_64_ = 0; i_64_ < is.length; i_64_++) {
			    aLong8216
				= (-8746091183093017783L
				   * (-5136918868954132743L * aLong8216 >>> 8
				      ^ ls[(int) (((-5136918868954132743L
						    * aLong8216)
						   ^ (long) (is[i_64_] >> 8))
						  & 0xffL)]));
			    aLong8216
				= (-8746091183093017783L
				   * (-5136918868954132743L * aLong8216 >>> 8
				      ^ ls[(int) (((aLong8216
						    * -5136918868954132743L)
						   ^ (long) is[i_64_])
						  & 0xffL)]));
			}
		    }
		    if (null != is_63_) {
			for (int i_65_ = 0; i_65_ < is_63_.length; i_65_++) {
			    aLong8216
				= (-8746091183093017783L
				   * (-5136918868954132743L * aLong8216 >>> 8
				      ^ ls[(int) (((-5136918868954132743L
						    * aLong8216)
						   ^ (long) (is_63_[i_65_]
							     >> 8))
						  & 0xffL)]));
			    aLong8216
				= ((aLong8216 * -5136918868954132743L >>> 8
				    ^ ls[(int) (((-5136918868954132743L
						  * aLong8216)
						 ^ (long) is_63_[i_65_])
						& 0xffL)])
				   * -8746091183093017783L);
			}
		    }
		    if (null != aClass17Array8211[i].aShortArray199) {
			for (int i_66_ = 0;
			     (i_66_
			      < aClass17Array8211[i].aShortArray199.length);
			     i_66_++) {
			    aLong8216
				= ((-5136918868954132743L * aLong8216 >>> 8
				    ^ ls[(int) (((-5136918868954132743L
						  * aLong8216)
						 ^ (long) ((aClass17Array8211
							    [i].aShortArray199
							    [i_66_])
							   >> 8))
						& 0xffL)])
				   * -8746091183093017783L);
			    aLong8216
				= (-8746091183093017783L
				   * (aLong8216 * -5136918868954132743L >>> 8
				      ^ ls[(int) (((aLong8216
						    * -5136918868954132743L)
						   ^ (long) (aClass17Array8211
							     [i].aShortArray199
							     [i_66_]))
						  & 0xffL)]));
			}
		    }
		    if (null != aClass17Array8211[i].aShortArray192) {
			for (int i_67_ = 0;
			     (i_67_
			      < aClass17Array8211[i].aShortArray192.length);
			     i_67_++) {
			    aLong8216
				= ((aLong8216 * -5136918868954132743L >>> 8
				    ^ ls[(int) (((aLong8216
						  * -5136918868954132743L)
						 ^ (long) ((aClass17Array8211
							    [i].aShortArray192
							    [i_67_])
							   >> 8))
						& 0xffL)])
				   * -8746091183093017783L);
			    aLong8216
				= ((-5136918868954132743L * aLong8216 >>> 8
				    ^ ls[(int) (((-5136918868954132743L
						  * aLong8216)
						 ^ (long) (aClass17Array8211[i]
							   .aShortArray192
							   [i_67_]))
						& 0xffL)])
				   * -8746091183093017783L);
			}
		    }
		}
	    }
	}
	for (int i = 0; i < 10; i++)
	    aLong8216 = (-8746091183093017783L
			 * (-5136918868954132743L * aLong8216 >>> 8
			    ^ ls[(int) ((aLong8216 * -5136918868954132743L
					 ^ (long) anIntArray8208[i])
					& 0xffL)]));
	for (int i = 0; i < 10; i++)
	    aLong8216 = (aLong8216 * -5136918868954132743L >>> 8
			 ^ ls[(int) ((-5136918868954132743L * aLong8216
				      ^ (long) anIntArray8213[i])
				     & 0xffL)]) * -8746091183093017783L;
	aLong8216 = (-5136918868954132743L * aLong8216 >>> 8
		     ^ ls[(int) ((aLong8216 * -5136918868954132743L
				  ^ (long) (aBool8206 ? 1 : 0))
				 & 0xffL)]) * -8746091183093017783L;
    }
    
    public void method10441(int i, int i_68_, int i_69_) {
	anIntArray8208[i] = i_68_;
	method10449((byte) -39);
    }
    
    public void method10442(int i, int i_70_) {
	anIntArray8208[i] = i_70_;
	method10449((byte) -95);
    }
    
    public Class183 method10443
	(Class185 class185, int i, Class44_Sub15 class44_sub15,
	 Class44_Sub3 class44_sub3, Class44_Sub7 class44_sub7,
	 Interface18 interface18, Interface20 interface20, Class711 class711,
	 int i_71_) {
	if (-1 != 1568742735 * anInt8212)
	    return (((Class307)
		     class44_sub3.method91(1568742735 * anInt8212, -697064585))
			.method5630
		    (class185, i, interface18, interface20, class711, null,
		     (byte) 3));
	int i_72_
	    = null != class711 ? i | class711.method14360((short) -4847) : i;
	Class183 class183;
	synchronized (aClass203_8221) {
	    class183 = ((Class183)
			aClass203_8221
			    .method3871(aLong8216 * -5136918868954132743L));
	}
	if (null == class183
	    || class185.method3330(class183.method3101(), i_72_) != 0) {
	    if (class183 != null)
		i_72_ = class185.method3331(i_72_, class183.method3101());
	    int i_73_ = i_72_;
	    boolean bool = false;
	    for (int i_74_ = 0; i_74_ < anIntArray8205.length; i_74_++) {
		int i_75_ = anIntArray8205[i_74_];
		Class17 class17 = null;
		if ((i_75_ & 0x40000000) != 0) {
		    if (aClass17Array8211 != null
			&& aClass17Array8211[i_74_] != null)
			class17 = aClass17Array8211[i_74_];
		    if (!((Class15) class44_sub7.method91(i_75_ & 0x3fffffff,
							  -1271241388))
			     .method681(aBool8206, class17, 1343523633))
			bool = true;
		} else if (0 != (i_75_ & ~0x7fffffff)
			   && !((Class330)
				class44_sub15.method91(i_75_ & 0x3fffffff,
						       -1609561559))
				   .method5840((byte) -101))
		    bool = true;
	    }
	    if (bool)
		return null;
	    Class187[] class187s = new Class187[anIntArray8205.length];
	    int i_76_ = 0;
	    for (int i_77_ = 0; i_77_ < anIntArray8205.length; i_77_++) {
		int i_78_ = anIntArray8205[i_77_];
		Class17 class17 = null;
		if ((i_78_ & 0x40000000) != 0) {
		    if (aClass17Array8211 != null
			&& null != aClass17Array8211[i_77_])
			class17 = aClass17Array8211[i_77_];
		    Class187 class187
			= ((Class15) class44_sub7.method91(i_78_ & 0x3fffffff,
							   -223810235))
			      .method682(aBool8206, class17, 2054748394);
		    if (null != class187)
			class187s[i_76_++] = class187;
		} else if ((i_78_ & ~0x7fffffff) != 0) {
		    Class187 class187
			= ((Class330)
			   class44_sub15.method91(i_78_ & 0x3fffffff,
						  511879192))
			      .method5841((byte) 127);
		    if (null != class187)
			class187s[i_76_++] = class187;
		}
	    }
	    Class187 class187 = new Class187(class187s, i_76_);
	    i_73_ |= 0x4000;
	    class183
		= class185.method3329(class187, i_73_,
				      -18281241 * Class597.anInt7862, 64, 768);
	    for (int i_79_ = 0; i_79_ < 10; i_79_++) {
		for (int i_80_ = 0; i_80_ < aShortArrayArray8218[i_79_].length;
		     i_80_++) {
		    if (anIntArray8208[i_79_]
			< (Class312.aShortArrayArrayArray3371[i_79_]
			   [i_80_]).length)
			class183.method3056(aShortArrayArray8218[i_79_][i_80_],
					    (Class312.aShortArrayArrayArray3371
					     [i_79_][i_80_]
					     [anIntArray8208[i_79_]]));
		}
	    }
	    for (int i_81_ = 0; i_81_ < 10; i_81_++) {
		for (int i_82_ = 0;
		     i_82_ < Class580.aShortArrayArray7762[i_81_].length;
		     i_82_++) {
		    if (anIntArray8213[i_81_]
			< (Class473.aShortArrayArrayArray5173[i_81_]
			   [i_82_]).length)
			class183.method3118((Class580.aShortArrayArray7762
					     [i_81_][i_82_]),
					    (Class473.aShortArrayArrayArray5173
					     [i_81_][i_82_]
					     [anIntArray8213[i_81_]]));
		}
	    }
	    class183.method3012(i_72_);
	    synchronized (aClass203_8221) {
		aClass203_8221.method3893(class183,
					  -5136918868954132743L * aLong8216);
	    }
	}
	if (null == class711)
	    return class183;
	Class183 class183_83_ = class183.method3011((byte) 4, i_72_, true);
	class711.method14399(class183_83_, 0, 2115253084);
	return class183_83_;
    }
    
    public Class183 method10444(Class185 class185, int i,
				Class44_Sub15 class44_sub15,
				Class44_Sub1 class44_sub1, Class711 class711,
				int i_84_, int i_85_, int i_86_, int i_87_) {
	int i_88_
	    = class711 != null ? i | class711.method14360((short) -20723) : i;
	long l = (long) i_86_ << 32 | (long) (i_85_ << 16) | (long) i_84_;
	Class183 class183;
	synchronized (aClass203_8221) {
	    class183 = (Class183) aClass203_8221.method3871(l);
	}
	if (class183 == null
	    || class185.method3330(class183.method3101(), i_88_) != 0) {
	    if (null != class183)
		i_88_ = class185.method3331(i_88_, class183.method3101());
	    int i_89_ = i_88_;
	    Class187[] class187s = new Class187[3];
	    int i_90_ = 0;
	    if (((Class330) class44_sub15.method91(i_84_, 928927635))
		    .method5840((byte) -20)
		&& ((Class330) class44_sub15.method91(i_85_, 176729797))
		       .method5840((byte) -66)
		&& ((Class330) class44_sub15.method91(i_86_, 1234191143))
		       .method5840((byte) -96)) {
		Class187 class187
		    = ((Class330) class44_sub15.method91(i_84_, -1739518052))
			  .method5841((byte) 127);
		if (null != class187)
		    class187s[i_90_++] = class187;
		class187
		    = ((Class330) class44_sub15.method91(i_85_, -612180322))
			  .method5841((byte) 127);
		if (class187 != null)
		    class187s[i_90_++] = class187;
		class187
		    = ((Class330) class44_sub15.method91(i_86_, -1886239513))
			  .method5841((byte) 127);
		if (class187 != null)
		    class187s[i_90_++] = class187;
		class187 = new Class187(class187s, i_90_);
		i_89_ |= 0x4000;
		class183 = class185.method3329(class187, i_89_,
					       -18281241 * Class597.anInt7862,
					       64, 768);
		for (int i_91_ = 0; i_91_ < 10; i_91_++) {
		    for (int i_92_ = 0;
			 i_92_ < aShortArrayArray8218[i_91_].length; i_92_++) {
			if (anIntArray8208[i_91_]
			    < (Class312.aShortArrayArrayArray3371[i_91_]
			       [i_92_]).length)
			    class183.method3056((aShortArrayArray8218[i_91_]
						 [i_92_]),
						(Class312
						 .aShortArrayArrayArray3371
						 [i_91_][i_92_]
						 [anIntArray8208[i_91_]]));
		    }
		}
		for (int i_93_ = 0; i_93_ < 10; i_93_++) {
		    for (int i_94_ = 0;
			 i_94_ < Class580.aShortArrayArray7762[i_93_].length;
			 i_94_++) {
			if (anIntArray8213[i_93_]
			    < (Class473.aShortArrayArrayArray5173[i_93_]
			       [i_94_]).length)
			    class183.method3118((Class580.aShortArrayArray7762
						 [i_93_][i_94_]),
						(Class473
						 .aShortArrayArrayArray5173
						 [i_93_][i_94_]
						 [anIntArray8213[i_93_]]));
		    }
		}
		class183.method3012(i_88_);
		synchronized (aClass203_8221) {
		    aClass203_8221.method3893(class183, l);
		}
	    } else
		return null;
	}
	if (class711 == null)
	    return class183;
	class183 = class183.method3011((byte) 4, i_88_, true);
	class711.method14399(class183, 0, 2071776960);
	return class183;
    }
    
    public void method10445(int i, int[] is, Class17[] class17s, int[] is_95_,
			    int[] is_96_, boolean bool, int i_97_) {
	if (anInt8209 * 1957003231 != i)
	    anInt8209 = i * 1957362719;
	anIntArray8205 = is;
	aClass17Array8211 = class17s;
	anIntArray8208 = is_95_;
	anIntArray8213 = is_96_;
	aBool8206 = bool;
	anInt8212 = 2005653935 * i_97_;
	method10449((byte) -40);
    }
    
    public void method10446(int i, int i_98_, Class44_Sub7 class44_sub7,
			    int i_99_) {
	if (-1 == i_98_)
	    anIntArray8205[i] = 0;
	else if (class44_sub7.method91(i_98_, -68926450) != null) {
	    anIntArray8205[i] = i_98_ | 0x40000000;
	    method10449((byte) -28);
	}
    }
    
    public void method10447(int i, int i_100_) {
	anIntArray8208[i] = i_100_;
	method10449((byte) -83);
    }
    
    public void method10448(int i, int i_101_) {
	anIntArray8208[i] = i_101_;
	method10449((byte) -7);
    }
    
    void method10449(byte i) {
	long[] ls = Class534_Sub40.aLongArray10812;
	aLong8216 = 8746091183093017783L;
	aLong8216 = (-8746091183093017783L
		     * (aLong8216 * -5136918868954132743L >>> 8
			^ ls[(int) ((-5136918868954132743L * aLong8216
				     ^ (long) (anInt8209 * 1957003231 >> 8))
				    & 0xffL)]));
	aLong8216 = (-5136918868954132743L * aLong8216 >>> 8
		     ^ ls[(int) ((aLong8216 * -5136918868954132743L
				  ^ (long) (anInt8209 * 1957003231))
				 & 0xffL)]) * -8746091183093017783L;
	for (int i_102_ = 0; i_102_ < anIntArray8205.length; i_102_++) {
	    aLong8216
		= (-8746091183093017783L
		   * (-5136918868954132743L * aLong8216 >>> 8
		      ^ ls[(int) ((aLong8216 * -5136918868954132743L
				   ^ (long) (anIntArray8205[i_102_] >> 24))
				  & 0xffL)]));
	    aLong8216
		= (-8746091183093017783L
		   * (aLong8216 * -5136918868954132743L >>> 8
		      ^ ls[(int) ((-5136918868954132743L * aLong8216
				   ^ (long) (anIntArray8205[i_102_] >> 16))
				  & 0xffL)]));
	    aLong8216
		= (-8746091183093017783L
		   * (aLong8216 * -5136918868954132743L >>> 8
		      ^ ls[(int) ((-5136918868954132743L * aLong8216
				   ^ (long) (anIntArray8205[i_102_] >> 8))
				  & 0xffL)]));
	    aLong8216 = (aLong8216 * -5136918868954132743L >>> 8
			 ^ ls[(int) ((aLong8216 * -5136918868954132743L
				      ^ (long) anIntArray8205[i_102_])
				     & 0xffL)]) * -8746091183093017783L;
	}
	if (aClass17Array8211 != null) {
	    for (int i_103_ = 0; i_103_ < aClass17Array8211.length; i_103_++) {
		if (null != aClass17Array8211[i_103_]) {
		    int[] is;
		    int[] is_104_;
		    if (aBool8206) {
			is = aClass17Array8211[i_103_].anIntArray195;
			is_104_ = aClass17Array8211[i_103_].anIntArray200;
		    } else {
			is = aClass17Array8211[i_103_].anIntArray198;
			is_104_ = aClass17Array8211[i_103_].anIntArray197;
		    }
		    if (null != is) {
			for (int i_105_ = 0; i_105_ < is.length; i_105_++) {
			    aLong8216
				= (-8746091183093017783L
				   * (-5136918868954132743L * aLong8216 >>> 8
				      ^ ls[(int) (((-5136918868954132743L
						    * aLong8216)
						   ^ (long) (is[i_105_] >> 8))
						  & 0xffL)]));
			    aLong8216
				= (-8746091183093017783L
				   * (-5136918868954132743L * aLong8216 >>> 8
				      ^ ls[(int) (((aLong8216
						    * -5136918868954132743L)
						   ^ (long) is[i_105_])
						  & 0xffL)]));
			}
		    }
		    if (null != is_104_) {
			for (int i_106_ = 0; i_106_ < is_104_.length;
			     i_106_++) {
			    aLong8216
				= (-8746091183093017783L
				   * (-5136918868954132743L * aLong8216 >>> 8
				      ^ ls[(int) (((-5136918868954132743L
						    * aLong8216)
						   ^ (long) (is_104_[i_106_]
							     >> 8))
						  & 0xffL)]));
			    aLong8216
				= ((aLong8216 * -5136918868954132743L >>> 8
				    ^ ls[(int) (((-5136918868954132743L
						  * aLong8216)
						 ^ (long) is_104_[i_106_])
						& 0xffL)])
				   * -8746091183093017783L);
			}
		    }
		    if (null != aClass17Array8211[i_103_].aShortArray199) {
			for (int i_107_ = 0;
			     i_107_ < (aClass17Array8211[i_103_]
				       .aShortArray199).length;
			     i_107_++) {
			    aLong8216
				= ((-5136918868954132743L * aLong8216 >>> 8
				    ^ ls[(int) (((-5136918868954132743L
						  * aLong8216)
						 ^ (long) ((aClass17Array8211
							    [i_103_]
							    .aShortArray199
							    [i_107_])
							   >> 8))
						& 0xffL)])
				   * -8746091183093017783L);
			    aLong8216
				= (-8746091183093017783L
				   * (aLong8216 * -5136918868954132743L >>> 8
				      ^ ls[(int) (((aLong8216
						    * -5136918868954132743L)
						   ^ (long) (aClass17Array8211
							     [i_103_]
							     .aShortArray199
							     [i_107_]))
						  & 0xffL)]));
			}
		    }
		    if (null != aClass17Array8211[i_103_].aShortArray192) {
			for (int i_108_ = 0;
			     i_108_ < (aClass17Array8211[i_103_]
				       .aShortArray192).length;
			     i_108_++) {
			    aLong8216
				= ((aLong8216 * -5136918868954132743L >>> 8
				    ^ ls[(int) (((aLong8216
						  * -5136918868954132743L)
						 ^ (long) ((aClass17Array8211
							    [i_103_]
							    .aShortArray192
							    [i_108_])
							   >> 8))
						& 0xffL)])
				   * -8746091183093017783L);
			    aLong8216
				= ((-5136918868954132743L * aLong8216 >>> 8
				    ^ ls[(int) (((-5136918868954132743L
						  * aLong8216)
						 ^ (long) (aClass17Array8211
							   [i_103_]
							   .aShortArray192
							   [i_108_]))
						& 0xffL)])
				   * -8746091183093017783L);
			}
		    }
		}
	    }
	}
	for (int i_109_ = 0; i_109_ < 10; i_109_++)
	    aLong8216 = (-8746091183093017783L
			 * (-5136918868954132743L * aLong8216 >>> 8
			    ^ ls[(int) ((aLong8216 * -5136918868954132743L
					 ^ (long) anIntArray8208[i_109_])
					& 0xffL)]));
	for (int i_110_ = 0; i_110_ < 10; i_110_++)
	    aLong8216 = (aLong8216 * -5136918868954132743L >>> 8
			 ^ ls[(int) ((-5136918868954132743L * aLong8216
				      ^ (long) anIntArray8213[i_110_])
				     & 0xffL)]) * -8746091183093017783L;
	aLong8216 = (-5136918868954132743L * aLong8216 >>> 8
		     ^ ls[(int) ((aLong8216 * -5136918868954132743L
				  ^ (long) (aBool8206 ? 1 : 0))
				 & 0xffL)]) * -8746091183093017783L;
    }
    
    public void method10450(int i, int i_111_) {
	anIntArray8213[i] = i_111_;
	method10449((byte) -22);
    }
    
    public void method10451(int i, int i_112_) {
	anIntArray8213[i] = i_112_;
	method10449((byte) -69);
    }
    
    public void method10452(int i, int i_113_) {
	anIntArray8213[i] = i_113_;
	method10449((byte) -57);
    }
    
    public void method10453(boolean bool) {
	aBool8206 = bool;
	method10449((byte) -109);
    }
    
    public void method10454(int i, int i_114_, Class44_Sub7 class44_sub7) {
	if (-1 == i_114_)
	    anIntArray8205[i] = 0;
	else if (class44_sub7.method91(i_114_, -1913263277) != null) {
	    anIntArray8205[i] = i_114_ | 0x40000000;
	    method10449((byte) -74);
	}
    }
    
    public Class183 method10455
	(Class185 class185, int i, Class44_Sub14 class44_sub14,
	 Class44_Sub15 class44_sub15, Class44_Sub3 class44_sub3,
	 Class44_Sub7 class44_sub7, Interface18 interface18,
	 Interface20 interface20, Class711 class711, Class711 class711_115_,
	 Class711[] class711s, int[] is, int i_116_, boolean bool,
	 Class630 class630) {
	if (1568742735 * anInt8212 != -1)
	    return (((Class307) class44_sub3.method91(1568742735 * anInt8212,
						      -1852167815))
			.method5610
		    (class185, i, class44_sub14, interface18, interface20,
		     class711, class711_115_, class711s, is, i_116_, null,
		     -2122903249));
	int i_117_ = i;
	long l = aLong8216 * -5136918868954132743L;
	int[] is_118_ = anIntArray8205;
	boolean bool_119_ = false;
	boolean bool_120_ = false;
	if (null != class711) {
	    Class205 class205 = class711.method14382(-640946999);
	    if (null != class205
		&& (class205.anInt2219 * 1456424793 >= 0
		    || class205.anInt2228 * -2133808015 >= 0)) {
		is_118_ = new int[anIntArray8205.length];
		for (int i_121_ = 0; i_121_ < is_118_.length; i_121_++)
		    is_118_[i_121_] = anIntArray8205[i_121_];
		if (1456424793 * class205.anInt2219 >= 0
		    && -1 != 133098641 * class630.anInt8193) {
		    bool_119_ = true;
		    if (65535 == 1456424793 * class205.anInt2219) {
			is_118_[class630.anInt8193 * 133098641] = 0;
			for (int i_122_ = 0;
			     i_122_ < class630.anIntArray8199.length; i_122_++)
			    is_118_[class630.anIntArray8199[i_122_]] = 0;
			l ^= ~0xffffffffL;
		    } else {
			is_118_[class630.anInt8193 * 133098641]
			    = 1456424793 * class205.anInt2219 | 0x40000000;
			for (int i_123_ = 0;
			     i_123_ < class630.anIntArray8199.length; i_123_++)
			    is_118_[class630.anIntArray8199[i_123_]] = 0;
			l ^= ((long) is_118_[133098641 * class630.anInt8193]
			      << 32);
		    }
		}
		if (-2133808015 * class205.anInt2228 >= 0
		    && -1 != class630.anInt8194 * 1980974041) {
		    bool_120_ = true;
		    if (65535 == class205.anInt2228 * -2133808015) {
			is_118_[1980974041 * class630.anInt8194] = 0;
			for (int i_124_ = 0;
			     i_124_ < class630.anIntArray8200.length; i_124_++)
			    is_118_[class630.anIntArray8200[i_124_]] = 0;
			l ^= 0xffffffffL;
		    } else {
			is_118_[class630.anInt8194 * 1980974041]
			    = class205.anInt2228 * -2133808015 | 0x40000000;
			for (int i_125_ = 0;
			     i_125_ < class630.anIntArray8200.length; i_125_++)
			    is_118_[class630.anIntArray8200[i_125_]] = 0;
			l ^= (long) is_118_[class630.anInt8194 * 1980974041];
		    }
		}
	    }
	}
	boolean bool_126_ = false;
	int i_127_ = null != class711s ? class711s.length : 0;
	for (int i_128_ = 0; i_128_ < i_127_; i_128_++) {
	    if (null != class711s[i_128_]) {
		i_117_ |= class711s[i_128_].method14360((short) -28265);
		bool_126_ = true;
	    }
	}
	if (null != class711) {
	    i_117_ |= class711.method14360((short) -16027);
	    bool_126_ = true;
	}
	if (null != class711_115_) {
	    i_117_ |= class711_115_.method14360((short) -1865);
	    bool_126_ = true;
	}
	boolean bool_129_ = false;
	if (is != null) {
	    for (int i_130_ = 0; i_130_ < is.length; i_130_++) {
		if (-1 != is[i_130_]) {
		    i_117_ |= 0x20;
		    bool_129_ = true;
		}
	    }
	}
	Class183 class183;
	synchronized (aClass203_8220) {
	    class183 = (Class183) aClass203_8220.method3871(l);
	}
	Class570 class570 = null;
	if (-1 != anInt8209 * 1957003231)
	    class570
		= (Class570) class44_sub14.method91(1957003231 * anInt8209,
						    -357469919);
	if (class183 == null
	    || class185.method3330(class183.method3101(), i_117_) != 0) {
	    if (class183 != null)
		i_117_ = class185.method3331(i_117_, class183.method3101());
	    int i_131_ = i_117_;
	    boolean bool_132_ = false;
	    for (int i_133_ = 0; i_133_ < is_118_.length; i_133_++) {
		int i_134_ = is_118_[i_133_];
		Class17 class17 = null;
		boolean bool_135_ = false;
		if (bool_119_) {
		    if (133098641 * class630.anInt8193 == i_133_)
			bool_135_ = true;
		    else {
			for (int i_136_ = 0;
			     i_136_ < class630.anIntArray8199.length;
			     i_136_++) {
			    if (i_133_ == class630.anIntArray8199[i_136_]) {
				bool_135_ = true;
				break;
			    }
			}
		    }
		}
		if (bool_120_) {
		    if (i_133_ == class630.anInt8194 * 1980974041)
			bool_135_ = true;
		    else {
			for (int i_137_ = 0;
			     i_137_ < class630.anIntArray8200.length;
			     i_137_++) {
			    if (i_133_ == class630.anIntArray8200[i_137_]) {
				bool_135_ = true;
				break;
			    }
			}
		    }
		}
		if (0 != (i_134_ & 0x40000000)) {
		    if (!bool_135_ && null != aClass17Array8211
			&& aClass17Array8211[i_133_] != null)
			class17 = aClass17Array8211[i_133_];
		    if (!((Class15) class44_sub7.method91(i_134_ & 0x3fffffff,
							  -1765180972))
			     .method677(aBool8206, class17, -1561102482))
			bool_132_ = true;
		} else if (0 != (i_134_ & ~0x7fffffff)
			   && !((Class330)
				class44_sub15.method91(i_134_ & 0x3fffffff,
						       -279427737))
				   .method5838(-1651057375))
		    bool_132_ = true;
	    }
	    if (bool_132_) {
		if (-1838289588078258487L * aLong8210 != -1L) {
		    synchronized (aClass203_8220) {
			class183
			    = (Class183) (aClass203_8220.method3871
					  (aLong8210 * -1838289588078258487L));
		    }
		}
		if (null == class183
		    || class185.method3330(class183.method3101(), i_117_) != 0)
		    return null;
	    } else {
		Class187[] class187s = new Class187[is_118_.length];
		for (int i_138_ = 0; i_138_ < is_118_.length; i_138_++) {
		    int i_139_ = is_118_[i_138_];
		    Class17 class17 = null;
		    boolean bool_140_
			= 5 == i_138_ && bool_119_ || 3 == i_138_ && bool_120_;
		    if ((i_139_ & 0x40000000) != 0) {
			if (!bool_140_ && null != aClass17Array8211
			    && null != aClass17Array8211[i_138_])
			    class17 = aClass17Array8211[i_138_];
			Class187 class187
			    = ((Class15)
			       class44_sub7.method91(i_139_ & 0x3fffffff,
						     419308314))
				  .method680(aBool8206, class17, (byte) 2);
			if (null != class187)
			    class187s[i_138_] = class187;
		    } else if (0 != (i_139_ & ~0x7fffffff)) {
			Class187 class187
			    = ((Class330)
			       class44_sub15.method91(i_139_ & 0x3fffffff,
						      694202184))
				  .method5839(-1116045634);
			if (class187 != null)
			    class187s[i_138_] = class187;
		    }
		}
		if (null != class570 && null != class570.anIntArrayArray7648) {
		    for (int i_141_ = 0;
			 i_141_ < class570.anIntArrayArray7648.length;
			 i_141_++) {
			if (class187s[i_141_] != null) {
			    int i_142_ = 0;
			    int i_143_ = 0;
			    int i_144_ = 0;
			    int i_145_ = 0;
			    int i_146_ = 0;
			    int i_147_ = 0;
			    if (null != class570.anIntArrayArray7648[i_141_]) {
				i_142_
				    = class570.anIntArrayArray7648[i_141_][0];
				i_143_
				    = class570.anIntArrayArray7648[i_141_][1];
				i_144_
				    = class570.anIntArrayArray7648[i_141_][2];
				i_145_
				    = (class570.anIntArrayArray7648[i_141_][3]
				       << 3);
				i_146_
				    = (class570.anIntArrayArray7648[i_141_][4]
				       << 3);
				i_147_
				    = (class570.anIntArrayArray7648[i_141_][5]
				       << 3);
			    }
			    if (0 != i_145_ || i_146_ != 0 || 0 != i_147_)
				class187s[i_141_].method3724(i_145_, i_146_,
							     i_147_);
			    if (i_142_ != 0 || 0 != i_143_ || i_144_ != 0)
				class187s[i_141_].method3721(i_142_, i_143_,
							     i_144_);
			}
		    }
		}
		Class187 class187 = new Class187(class187s, class187s.length);
		i_131_ |= 0x4000;
		class183 = class185.method3329(class187, i_131_,
					       Class597.anInt7862 * -18281241,
					       64, 850);
		for (int i_148_ = 0; i_148_ < 10; i_148_++) {
		    for (int i_149_ = 0;
			 i_149_ < aShortArrayArray8218[i_148_].length;
			 i_149_++) {
			if (anIntArray8208[i_148_]
			    < (Class312.aShortArrayArrayArray3371[i_148_]
			       [i_149_]).length)
			    class183.method3056((aShortArrayArray8218[i_148_]
						 [i_149_]),
						(Class312
						 .aShortArrayArrayArray3371
						 [i_148_][i_149_]
						 [anIntArray8208[i_148_]]));
		    }
		}
		for (int i_150_ = 0; i_150_ < 10; i_150_++) {
		    for (int i_151_ = 0;
			 i_151_ < Class580.aShortArrayArray7762[i_150_].length;
			 i_151_++) {
			if (anIntArray8213[i_150_]
			    < (Class473.aShortArrayArrayArray5173[i_150_]
			       [i_151_]).length)
			    class183.method3118((Class580.aShortArrayArray7762
						 [i_150_][i_151_]),
						(Class473
						 .aShortArrayArrayArray5173
						 [i_150_][i_151_]
						 [anIntArray8213[i_150_]]));
		    }
		}
		class183.method3050();
		if (bool) {
		    class183.method3012(i_117_);
		    synchronized (aClass203_8220) {
			aClass203_8220.method3893(class183, l);
		    }
		    aLong8210 = l * 4695899949764322169L;
		}
	    }
	}
	Class183 class183_152_ = class183.method3011((byte) 4, i_117_, true);
	if (!bool_126_ && !bool_129_)
	    return class183_152_;
	Class446[] class446s = null;
	if (null != class570)
	    class446s = class570.method9616((byte) -7);
	if (bool_129_ && null != class446s) {
	    for (int i_153_ = 0; i_153_ < is.length; i_153_++) {
		if (null != class446s[i_153_])
		    class183_152_.method3037(class446s[i_153_], 1 << i_153_,
					     true);
	    }
	}
	int i_154_ = 0;
	int i_155_ = 1;
	while (i_154_ < i_127_) {
	    if (null != class711s[i_154_])
		class711s[i_154_].method14341(class183_152_, 0, i_155_,
					      -645534469);
	    i_154_++;
	    i_155_ <<= 1;
	}
	if (bool_129_) {
	    for (i_154_ = 0; i_154_ < is.length; i_154_++) {
		if (-1 != is[i_154_]) {
		    i_155_ = is[i_154_] - i_116_;
		    i_155_ &= 0x3fff;
		    Class446 class446 = new Class446();
		    class446.method7244(0.0F, 1.0F, 0.0F,
					Class427.method6799(i_155_));
		    class183_152_.method3037(class446, 1 << i_154_, false);
		}
	    }
	}
	if (bool_129_ && null != class446s) {
	    for (i_154_ = 0; i_154_ < is.length; i_154_++) {
		if (class446s[i_154_] != null)
		    class183_152_.method3037(class446s[i_154_], 1 << i_154_,
					     false);
	    }
	}
	if (null != class711 && null != class711_115_)
	    Class612.method10106(class183_152_, class711, class711_115_,
				 (byte) -3);
	else if (class711 != null)
	    class711.method14399(class183_152_, 0, 2113949104);
	else if (class711_115_ != null)
	    class711_115_.method14399(class183_152_, 0, 1997394025);
	return class183_152_;
    }
    
    void method10456() {
	long[] ls = Class534_Sub40.aLongArray10812;
	aLong8216 = 8746091183093017783L;
	aLong8216 = (-8746091183093017783L
		     * (aLong8216 * -5136918868954132743L >>> 8
			^ ls[(int) ((-5136918868954132743L * aLong8216
				     ^ (long) (anInt8209 * 1957003231 >> 8))
				    & 0xffL)]));
	aLong8216 = (-5136918868954132743L * aLong8216 >>> 8
		     ^ ls[(int) ((aLong8216 * -5136918868954132743L
				  ^ (long) (anInt8209 * 1957003231))
				 & 0xffL)]) * -8746091183093017783L;
	for (int i = 0; i < anIntArray8205.length; i++) {
	    aLong8216 = (-8746091183093017783L
			 * (-5136918868954132743L * aLong8216 >>> 8
			    ^ ls[(int) ((aLong8216 * -5136918868954132743L
					 ^ (long) (anIntArray8205[i] >> 24))
					& 0xffL)]));
	    aLong8216 = (-8746091183093017783L
			 * (aLong8216 * -5136918868954132743L >>> 8
			    ^ ls[(int) ((-5136918868954132743L * aLong8216
					 ^ (long) (anIntArray8205[i] >> 16))
					& 0xffL)]));
	    aLong8216 = (-8746091183093017783L
			 * (aLong8216 * -5136918868954132743L >>> 8
			    ^ ls[(int) ((-5136918868954132743L * aLong8216
					 ^ (long) (anIntArray8205[i] >> 8))
					& 0xffL)]));
	    aLong8216 = (aLong8216 * -5136918868954132743L >>> 8
			 ^ ls[(int) ((aLong8216 * -5136918868954132743L
				      ^ (long) anIntArray8205[i])
				     & 0xffL)]) * -8746091183093017783L;
	}
	if (aClass17Array8211 != null) {
	    for (int i = 0; i < aClass17Array8211.length; i++) {
		if (null != aClass17Array8211[i]) {
		    int[] is;
		    int[] is_156_;
		    if (aBool8206) {
			is = aClass17Array8211[i].anIntArray195;
			is_156_ = aClass17Array8211[i].anIntArray200;
		    } else {
			is = aClass17Array8211[i].anIntArray198;
			is_156_ = aClass17Array8211[i].anIntArray197;
		    }
		    if (null != is) {
			for (int i_157_ = 0; i_157_ < is.length; i_157_++) {
			    aLong8216
				= (-8746091183093017783L
				   * (-5136918868954132743L * aLong8216 >>> 8
				      ^ ls[(int) (((-5136918868954132743L
						    * aLong8216)
						   ^ (long) (is[i_157_] >> 8))
						  & 0xffL)]));
			    aLong8216
				= (-8746091183093017783L
				   * (-5136918868954132743L * aLong8216 >>> 8
				      ^ ls[(int) (((aLong8216
						    * -5136918868954132743L)
						   ^ (long) is[i_157_])
						  & 0xffL)]));
			}
		    }
		    if (null != is_156_) {
			for (int i_158_ = 0; i_158_ < is_156_.length;
			     i_158_++) {
			    aLong8216
				= (-8746091183093017783L
				   * (-5136918868954132743L * aLong8216 >>> 8
				      ^ ls[(int) (((-5136918868954132743L
						    * aLong8216)
						   ^ (long) (is_156_[i_158_]
							     >> 8))
						  & 0xffL)]));
			    aLong8216
				= ((aLong8216 * -5136918868954132743L >>> 8
				    ^ ls[(int) (((-5136918868954132743L
						  * aLong8216)
						 ^ (long) is_156_[i_158_])
						& 0xffL)])
				   * -8746091183093017783L);
			}
		    }
		    if (null != aClass17Array8211[i].aShortArray199) {
			for (int i_159_ = 0;
			     (i_159_
			      < aClass17Array8211[i].aShortArray199.length);
			     i_159_++) {
			    aLong8216
				= ((-5136918868954132743L * aLong8216 >>> 8
				    ^ ls[(int) (((-5136918868954132743L
						  * aLong8216)
						 ^ (long) ((aClass17Array8211
							    [i].aShortArray199
							    [i_159_])
							   >> 8))
						& 0xffL)])
				   * -8746091183093017783L);
			    aLong8216
				= (-8746091183093017783L
				   * (aLong8216 * -5136918868954132743L >>> 8
				      ^ ls[(int) (((aLong8216
						    * -5136918868954132743L)
						   ^ (long) (aClass17Array8211
							     [i].aShortArray199
							     [i_159_]))
						  & 0xffL)]));
			}
		    }
		    if (null != aClass17Array8211[i].aShortArray192) {
			for (int i_160_ = 0;
			     (i_160_
			      < aClass17Array8211[i].aShortArray192.length);
			     i_160_++) {
			    aLong8216
				= ((aLong8216 * -5136918868954132743L >>> 8
				    ^ ls[(int) (((aLong8216
						  * -5136918868954132743L)
						 ^ (long) ((aClass17Array8211
							    [i].aShortArray192
							    [i_160_])
							   >> 8))
						& 0xffL)])
				   * -8746091183093017783L);
			    aLong8216
				= ((-5136918868954132743L * aLong8216 >>> 8
				    ^ ls[(int) (((-5136918868954132743L
						  * aLong8216)
						 ^ (long) (aClass17Array8211[i]
							   .aShortArray192
							   [i_160_]))
						& 0xffL)])
				   * -8746091183093017783L);
			}
		    }
		}
	    }
	}
	for (int i = 0; i < 10; i++)
	    aLong8216 = (-8746091183093017783L
			 * (-5136918868954132743L * aLong8216 >>> 8
			    ^ ls[(int) ((aLong8216 * -5136918868954132743L
					 ^ (long) anIntArray8208[i])
					& 0xffL)]));
	for (int i = 0; i < 10; i++)
	    aLong8216 = (aLong8216 * -5136918868954132743L >>> 8
			 ^ ls[(int) ((-5136918868954132743L * aLong8216
				      ^ (long) anIntArray8213[i])
				     & 0xffL)]) * -8746091183093017783L;
	aLong8216 = (-5136918868954132743L * aLong8216 >>> 8
		     ^ ls[(int) ((aLong8216 * -5136918868954132743L
				  ^ (long) (aBool8206 ? 1 : 0))
				 & 0xffL)]) * -8746091183093017783L;
    }
    
    public Class183 method10457
	(Class185 class185, int i, Class44_Sub15 class44_sub15,
	 Class44_Sub3 class44_sub3, Class44_Sub7 class44_sub7,
	 Interface18 interface18, Interface20 interface20, Class711 class711) {
	if (-1 != 1568742735 * anInt8212)
	    return (((Class307)
		     class44_sub3.method91(1568742735 * anInt8212, 367065813))
			.method5630
		    (class185, i, interface18, interface20, class711, null,
		     (byte) -102));
	int i_161_
	    = null != class711 ? i | class711.method14360((short) -5871) : i;
	Class183 class183;
	synchronized (aClass203_8221) {
	    class183 = ((Class183)
			aClass203_8221
			    .method3871(aLong8216 * -5136918868954132743L));
	}
	if (null == class183
	    || class185.method3330(class183.method3101(), i_161_) != 0) {
	    if (class183 != null)
		i_161_ = class185.method3331(i_161_, class183.method3101());
	    int i_162_ = i_161_;
	    boolean bool = false;
	    for (int i_163_ = 0; i_163_ < anIntArray8205.length; i_163_++) {
		int i_164_ = anIntArray8205[i_163_];
		Class17 class17 = null;
		if ((i_164_ & 0x40000000) != 0) {
		    if (aClass17Array8211 != null
			&& aClass17Array8211[i_163_] != null)
			class17 = aClass17Array8211[i_163_];
		    if (!((Class15) class44_sub7.method91(i_164_ & 0x3fffffff,
							  911297265))
			     .method681(aBool8206, class17, 994428717))
			bool = true;
		} else if (0 != (i_164_ & ~0x7fffffff)
			   && !((Class330)
				class44_sub15.method91(i_164_ & 0x3fffffff,
						       -2139018031))
				   .method5840((byte) -124))
		    bool = true;
	    }
	    if (bool)
		return null;
	    Class187[] class187s = new Class187[anIntArray8205.length];
	    int i_165_ = 0;
	    for (int i_166_ = 0; i_166_ < anIntArray8205.length; i_166_++) {
		int i_167_ = anIntArray8205[i_166_];
		Class17 class17 = null;
		if ((i_167_ & 0x40000000) != 0) {
		    if (aClass17Array8211 != null
			&& null != aClass17Array8211[i_166_])
			class17 = aClass17Array8211[i_166_];
		    Class187 class187
			= ((Class15) class44_sub7.method91(i_167_ & 0x3fffffff,
							   382096690))
			      .method682(aBool8206, class17, -1048219069);
		    if (null != class187)
			class187s[i_165_++] = class187;
		} else if ((i_167_ & ~0x7fffffff) != 0) {
		    Class187 class187
			= ((Class330)
			   class44_sub15.method91(i_167_ & 0x3fffffff,
						  742910232))
			      .method5841((byte) 127);
		    if (null != class187)
			class187s[i_165_++] = class187;
		}
	    }
	    Class187 class187 = new Class187(class187s, i_165_);
	    i_162_ |= 0x4000;
	    class183
		= class185.method3329(class187, i_162_,
				      -18281241 * Class597.anInt7862, 64, 768);
	    for (int i_168_ = 0; i_168_ < 10; i_168_++) {
		for (int i_169_ = 0;
		     i_169_ < aShortArrayArray8218[i_168_].length; i_169_++) {
		    if (anIntArray8208[i_168_]
			< (Class312.aShortArrayArrayArray3371[i_168_]
			   [i_169_]).length)
			class183.method3056((aShortArrayArray8218[i_168_]
					     [i_169_]),
					    (Class312.aShortArrayArrayArray3371
					     [i_168_][i_169_]
					     [anIntArray8208[i_168_]]));
		}
	    }
	    for (int i_170_ = 0; i_170_ < 10; i_170_++) {
		for (int i_171_ = 0;
		     i_171_ < Class580.aShortArrayArray7762[i_170_].length;
		     i_171_++) {
		    if (anIntArray8213[i_170_]
			< (Class473.aShortArrayArrayArray5173[i_170_]
			   [i_171_]).length)
			class183.method3118((Class580.aShortArrayArray7762
					     [i_170_][i_171_]),
					    (Class473.aShortArrayArrayArray5173
					     [i_170_][i_171_]
					     [anIntArray8213[i_170_]]));
		}
	    }
	    class183.method3012(i_161_);
	    synchronized (aClass203_8221) {
		aClass203_8221.method3893(class183,
					  -5136918868954132743L * aLong8216);
	    }
	}
	if (null == class711)
	    return class183;
	Class183 class183_172_ = class183.method3011((byte) 4, i_161_, true);
	class711.method14399(class183_172_, 0, 1792404468);
	return class183_172_;
    }
    
    public void method10458(int i, int[] is, Class17[] class17s, int[] is_173_,
			    int[] is_174_, boolean bool, int i_175_) {
	if (anInt8209 * 1957003231 != i)
	    anInt8209 = i * 1957362719;
	anIntArray8205 = is;
	aClass17Array8211 = class17s;
	anIntArray8208 = is_173_;
	anIntArray8213 = is_174_;
	aBool8206 = bool;
	anInt8212 = 2005653935 * i_175_;
	method10449((byte) -111);
    }
    
    public void method10459(boolean bool, int i) {
	aBool8206 = bool;
	method10449((byte) -48);
    }
    
    public static int method10460() {
	synchronized (aClass203_8220) {
	    int i = aClass203_8220.method3880(-1750556843);
	    return i;
	}
    }
    
    public static void method10461() {
	synchronized (aClass203_8220) {
	    aClass203_8220.method3877(2133724088);
	}
	synchronized (aClass203_8221) {
	    aClass203_8221.method3877(-1052088505);
	}
    }
    
    public static void method10462(int i) {
	synchronized (aClass203_8220) {
	    aClass203_8220.method3876(i, (byte) 0);
	}
	synchronized (aClass203_8221) {
	    aClass203_8221.method3876(i, (byte) 0);
	}
    }
    
    public static void method10463(int i) {
	synchronized (aClass203_8220) {
	    aClass203_8220.method3876(i, (byte) 0);
	}
	synchronized (aClass203_8221) {
	    aClass203_8221.method3876(i, (byte) 0);
	}
    }
    
    public static void method10464(int i) {
	synchronized (aClass203_8220) {
	    aClass203_8220.method3876(i, (byte) 0);
	}
	synchronized (aClass203_8221) {
	    aClass203_8221.method3876(i, (byte) 0);
	}
    }
    
    public static void method10465(int i) {
	synchronized (aClass203_8220) {
	    aClass203_8220.method3876(i, (byte) 0);
	}
	synchronized (aClass203_8221) {
	    aClass203_8221.method3876(i, (byte) 0);
	}
    }
    
    public static void method10466() {
	synchronized (aClass203_8220) {
	    aClass203_8220.method3884((byte) -73);
	}
	synchronized (aClass203_8221) {
	    aClass203_8221.method3884((byte) -19);
	}
    }
    
    static final void method10467(Class247 class247, Class243 class243,
				  Class669 class669, short i) {
	class247.aBool2447
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) == 1;
	Class454.method7416(class247, -583671177);
    }
    
    public static int method10468(long l) {
	return (int) (l / 86400000L) - 11745;
    }
    
    static char method10469(char c, Class672 class672, int i) {
	if (c >= '\u00c0' && c <= '\u00ff') {
	    if (c >= '\u00c0' && c <= '\u00c6')
		return 'A';
	    if (c == '\u00c7')
		return 'C';
	    if (c >= '\u00c8' && c <= '\u00cb')
		return 'E';
	    if (c >= '\u00cc' && c <= '\u00cf')
		return 'I';
	    if ('\u00d1' == c && class672 != Class672.aClass672_8625)
		return 'N';
	    if (c >= '\u00d2' && c <= '\u00d6')
		return 'O';
	    if (c >= '\u00d9' && c <= '\u00dc')
		return 'U';
	    if ('\u00dd' == c)
		return 'Y';
	    if ('\u00df' == c)
		return 's';
	    if (c >= '\u00e0' && c <= '\u00e6')
		return 'a';
	    if (c == '\u00e7')
		return 'c';
	    if (c >= '\u00e8' && c <= '\u00eb')
		return 'e';
	    if (c >= '\u00ec' && c <= '\u00ef')
		return 'i';
	    if (c == '\u00f1' && class672 != Class672.aClass672_8625)
		return 'n';
	    if (c >= '\u00f2' && c <= '\u00f6')
		return 'o';
	    if (c >= '\u00f9' && c <= '\u00fc')
		return 'u';
	    if (c == '\u00fd' || c == '\u00ff')
		return 'y';
	}
	if (c == '\u0152')
	    return 'O';
	if ('\u0153' == c)
	    return 'o';
	if (c == '\u0178')
	    return 'Y';
	return c;
    }
}
