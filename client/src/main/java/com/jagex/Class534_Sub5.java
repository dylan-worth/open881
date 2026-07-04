/* Class534_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class534_Sub5 extends Class534
{
    static Class9 aClass9_10411 = new Class9(32);
    static Class203 aClass203_10412 = new Class203(10);
    static int anInt10413;
    int[] anIntArray10414 = { -1 };
    int[] anIntArray10415 = { 0 };
    Class8[] aClass8Array10416 = null;
    
    static void method16040(int i, int i_0_, int i_1_, int i_2_, Class8 class8,
			    boolean bool) {
	long l = (long) (i | (bool ? -2147483648 : 0));
	Class534_Sub5 class534_sub5
	    = (Class534_Sub5) aClass9_10411.method579(l);
	if (class534_sub5 == null) {
	    class534_sub5 = new Class534_Sub5();
	    aClass9_10411.method581(class534_sub5, l);
	}
	if (class534_sub5.anIntArray10414.length <= i_0_) {
	    int[] is = new int[i_0_ + 1];
	    int[] is_3_ = new int[i_0_ + 1];
	    Class8[] class8s = null;
	    if (null != class534_sub5.aClass8Array10416)
		class8s = new Class8[1 + i_0_];
	    for (int i_4_ = 0; i_4_ < class534_sub5.anIntArray10414.length;
		 i_4_++) {
		is[i_4_] = class534_sub5.anIntArray10414[i_4_];
		is_3_[i_4_] = class534_sub5.anIntArray10415[i_4_];
		if (class534_sub5.aClass8Array10416 != null)
		    class8s[i_4_] = class534_sub5.aClass8Array10416[i_4_];
	    }
	    for (int i_5_ = class534_sub5.anIntArray10414.length; i_5_ < i_0_;
		 i_5_++) {
		is[i_5_] = -1;
		is_3_[i_5_] = 0;
	    }
	    class534_sub5.anIntArray10414 = is;
	    class534_sub5.anIntArray10415 = is_3_;
	    class534_sub5.aClass8Array10416 = class8s;
	}
	class534_sub5.anIntArray10414[i_0_] = i_1_;
	class534_sub5.anIntArray10415[i_0_] = i_2_;
	if (null != class8) {
	    if (null == class534_sub5.aClass8Array10416)
		class534_sub5.aClass8Array10416
		    = new Class8[class534_sub5.anIntArray10414.length];
	    class534_sub5.aClass8Array10416[i_0_] = class8;
	} else if (null != class534_sub5.aClass8Array10416)
	    class534_sub5.aClass8Array10416[i_0_] = null;
    }
    
    final Class183 method16041(Class185 class185, int i, Class711 class711,
			       int i_6_, boolean bool, Class631 class631,
			       int i_7_) {
	Class183 class183 = null;
	int i_8_ = i;
	Class570 class570 = null;
	if (-1 != i_6_)
	    class570 = (Class570) Class200_Sub23.aClass44_Sub14_10041
				      .method91(i_6_, 548149144);
	int[] is = anIntArray10414;
	if (class570 != null && null != class570.anIntArray7652) {
	    is = new int[class570.anIntArray7652.length];
	    for (int i_9_ = 0; i_9_ < class570.anIntArray7652.length; i_9_++) {
		int i_10_ = class570.anIntArray7652[i_9_];
		if (i_10_ >= 0 && i_10_ < anIntArray10414.length)
		    is[i_9_] = anIntArray10414[i_10_];
		else
		    is[i_9_] = -1;
	    }
	}
	if (null != class711)
	    i_8_ |= class711.method14360((short) -18738);
	long l = method16061(is, i_6_,
			     null != class631 ? class631.anIntArray8208 : null,
			     bool, (byte) 1);
	if (null != aClass203_10412)
	    class183 = (Class183) aClass203_10412.method3871(l);
	if (null == class183
	    || class185.method3330(class183.method3101(), i_8_) != 0) {
	    if (null != class183)
		i_8_ = class185.method3331(i_8_, class183.method3101());
	    int i_11_ = i_8_;
	    boolean bool_12_ = false;
	    for (int i_13_ = 0; i_13_ < is.length; i_13_++) {
		if (-1 != is[i_13_]
		    && !((Class15)
			 Class531.aClass44_Sub7_7135.method91(is[i_13_],
							      -609163631))
			    .method677(bool, null, -275920363))
		    bool_12_ = true;
	    }
	    if (bool_12_)
		return null;
	    Class187[] class187s = new Class187[is.length];
	    for (int i_14_ = 0; i_14_ < is.length; i_14_++) {
		if (is[i_14_] != -1)
		    class187s[i_14_]
			= ((Class15)
			   Class531.aClass44_Sub7_7135.method91(is[i_14_],
								-375613354))
			      .method680(bool, null, (byte) 2);
	    }
	    if (null != class570 && class570.anIntArrayArray7648 != null) {
		for (int i_15_ = 0;
		     i_15_ < class570.anIntArrayArray7648.length; i_15_++) {
		    if (class570.anIntArrayArray7648[i_15_] != null
			&& null != class187s[i_15_]) {
			int i_16_ = class570.anIntArrayArray7648[i_15_][0];
			int i_17_ = class570.anIntArrayArray7648[i_15_][1];
			int i_18_ = class570.anIntArrayArray7648[i_15_][2];
			int i_19_ = class570.anIntArrayArray7648[i_15_][3];
			int i_20_ = class570.anIntArrayArray7648[i_15_][4];
			int i_21_ = class570.anIntArrayArray7648[i_15_][5];
			if (i_19_ != 0 || 0 != i_20_ || i_21_ != 0)
			    class187s[i_15_].method3724(i_19_, i_20_, i_21_);
			if (i_16_ != 0 || 0 != i_17_ || 0 != i_18_)
			    class187s[i_15_].method3721(i_16_, i_17_, i_18_);
		    }
		}
	    }
	    Class187 class187 = new Class187(class187s, class187s.length);
	    if (class631 != null)
		i_11_ |= 0x4000;
	    class183 = class185.method3329(class187, i_11_,
					   anInt10413 * -1962800471, 66, 855);
	    if (null != class631) {
		for (int i_22_ = 0; i_22_ < 10; i_22_++) {
		    for (int i_23_ = 0;
			 i_23_ < Class631.aShortArrayArray8218[i_22_].length;
			 i_23_++) {
			if (class631.anIntArray8208[i_22_]
			    < (Class312.aShortArrayArrayArray3371[i_22_]
			       [i_23_]).length)
			    class183.method3056
				(Class631.aShortArrayArray8218[i_22_][i_23_],
				 (Class312.aShortArrayArrayArray3371[i_22_]
				  [i_23_][class631.anIntArray8208[i_22_]]));
		    }
		}
		for (int i_24_ = 0; i_24_ < 10; i_24_++) {
		    for (int i_25_ = 0;
			 i_25_ < Class580.aShortArrayArray7762[i_24_].length;
			 i_25_++) {
			if (class631.anIntArray8213[i_24_]
			    < (Class473.aShortArrayArrayArray5173[i_24_]
			       [i_25_]).length)
			    class183.method3118
				(Class580.aShortArrayArray7762[i_24_][i_25_],
				 (Class473.aShortArrayArrayArray5173[i_24_]
				  [i_25_][class631.anIntArray8213[i_24_]]));
		    }
		}
	    }
	    if (null != aClass203_10412) {
		class183.method3012(i_8_);
		aClass203_10412.method3893(class183, l);
	    }
	}
	if (class711 == null)
	    return class183;
	Class183 class183_26_ = class183.method3011((byte) 1, i_8_, true);
	class711.method14399(class183_26_, 0, 1525884642);
	return class183_26_;
    }
    
    static void method16042() {
	aClass203_10412.method3877(-1949029651);
    }
    
    public static int method16043(int i, int i_27_, boolean bool) {
	Class534_Sub5 class534_sub5 = Class269.method5023(i, bool, (byte) 116);
	if (null == class534_sub5)
	    return -1;
	if (i_27_ < 0 || i_27_ >= class534_sub5.anIntArray10414.length)
	    return -1;
	return class534_sub5.anIntArray10414[i_27_];
    }
    
    public static int method16044(int i, boolean bool) {
	if (bool)
	    return 0;
	Class534_Sub5 class534_sub5 = Class269.method5023(i, bool, (byte) -90);
	if (null == class534_sub5)
	    return ((((Class534_Sub18_Sub2)
		      Class219.aClass44_Sub19_2306.method91(i, -2039559653))
		     .anInt11371)
		    * 1857484701);
	int i_28_ = 0;
	for (int i_29_ = 0; i_29_ < class534_sub5.anIntArray10414.length;
	     i_29_++) {
	    if (-1 == class534_sub5.anIntArray10414[i_29_])
		i_28_++;
	}
	i_28_ += ((((Class534_Sub18_Sub2)
		    Class219.aClass44_Sub19_2306.method91(i, -599395696))
		   .anInt11371) * 1857484701
		  - class534_sub5.anIntArray10414.length);
	return i_28_;
    }
    
    public static int method16045(int i, int i_30_, boolean bool) {
	Class534_Sub5 class534_sub5 = Class269.method5023(i, bool, (byte) 0);
	if (null == class534_sub5)
	    return -1;
	if (i_30_ < 0 || i_30_ >= class534_sub5.anIntArray10414.length)
	    return -1;
	return class534_sub5.anIntArray10414[i_30_];
    }
    
    public static int method16046(int i, int i_31_, boolean bool) {
	Class534_Sub5 class534_sub5 = Class269.method5023(i, bool, (byte) -27);
	if (null == class534_sub5)
	    return 0;
	if (i_31_ < 0 || i_31_ >= class534_sub5.anIntArray10415.length)
	    return 0;
	return class534_sub5.anIntArray10415[i_31_];
    }
    
    public static int method16047(int i, int i_32_, boolean bool) {
	Class534_Sub5 class534_sub5 = Class269.method5023(i, bool, (byte) 9);
	if (null == class534_sub5)
	    return 0;
	if (i_32_ < 0 || i_32_ >= class534_sub5.anIntArray10415.length)
	    return 0;
	return class534_sub5.anIntArray10415[i_32_];
    }
    
    public static int method16048(int i, int i_33_, int i_34_, boolean bool) {
	Class318 class318
	    = ((Class318)
	       Class84.aClass44_Sub11_840.method91(i_34_, -1473880507));
	Class150 class150 = class318.aClass150_3392;
	Class534_Sub5 class534_sub5 = Class269.method5023(i, bool, (byte) 24);
	int i_35_;
	if (class534_sub5 == null || i_33_ < 0
	    || i_33_ >= class534_sub5.anIntArray10415.length
	    || null == class534_sub5.aClass8Array10416
	    || null == class534_sub5.aClass8Array10416[i_33_])
	    i_35_ = ((Integer) class150.method2478(520458997)).intValue();
	else
	    i_35_
		= class534_sub5.aClass8Array10416[i_33_]
		      .method32(-1270946121 * class150.anInt1694, 1564797111);
	return class318.method5750(i_35_, 1726631207);
    }
    
    public static int method16049(int i, int i_36_, int i_37_, boolean bool) {
	Class318 class318
	    = ((Class318)
	       Class84.aClass44_Sub11_840.method91(i_37_, -1843526983));
	Class150 class150 = class318.aClass150_3392;
	Class534_Sub5 class534_sub5 = Class269.method5023(i, bool, (byte) -7);
	int i_38_;
	if (class534_sub5 == null || i_36_ < 0
	    || i_36_ >= class534_sub5.anIntArray10415.length
	    || null == class534_sub5.aClass8Array10416
	    || null == class534_sub5.aClass8Array10416[i_36_])
	    i_38_ = ((Integer) class150.method2478(579609286)).intValue();
	else
	    i_38_ = class534_sub5.aClass8Array10416[i_36_]
			.method32(-1270946121 * class150.anInt1694, 380666499);
	return class318.method5750(i_38_, 1743026369);
    }
    
    public static int method16050(int i, int i_39_, boolean bool) {
	Class534_Sub5 class534_sub5 = Class269.method5023(i, bool, (byte) -77);
	if (class534_sub5 == null)
	    return 0;
	if (i_39_ == -1)
	    return 0;
	int i_40_ = 0;
	for (int i_41_ = 0; i_41_ < class534_sub5.anIntArray10415.length;
	     i_41_++) {
	    if (i_39_ == class534_sub5.anIntArray10414[i_41_])
		i_40_ += class534_sub5.anIntArray10415[i_41_];
	}
	return i_40_;
    }
    
    public static int method16051(int i, boolean bool) {
	if (bool)
	    return 0;
	Class534_Sub5 class534_sub5 = Class269.method5023(i, bool, (byte) 43);
	if (null == class534_sub5)
	    return ((((Class534_Sub18_Sub2)
		      Class219.aClass44_Sub19_2306.method91(i, 966189568))
		     .anInt11371)
		    * 1857484701);
	int i_42_ = 0;
	for (int i_43_ = 0; i_43_ < class534_sub5.anIntArray10414.length;
	     i_43_++) {
	    if (-1 == class534_sub5.anIntArray10414[i_43_])
		i_42_++;
	}
	i_42_ += ((((Class534_Sub18_Sub2)
		    Class219.aClass44_Sub19_2306.method91(i, -229004750))
		   .anInt11371) * 1857484701
		  - class534_sub5.anIntArray10414.length);
	return i_42_;
    }
    
    public static int method16052(int i, int i_44_, boolean bool) {
	int i_45_ = 0;
	Class534_Sub5 class534_sub5 = Class269.method5023(i, bool, (byte) -97);
	if (class534_sub5 == null)
	    return 0;
	for (int i_46_ = 0; i_46_ < class534_sub5.anIntArray10414.length;
	     i_46_++) {
	    if (class534_sub5.anIntArray10414[i_46_] >= 0
		&& (((Class15)
		     Class531.aClass44_Sub7_7135.method91((class534_sub5
							   .anIntArray10414
							   [i_46_]),
							  1097484811)).anInt113
		    * 1160623023) == i_44_)
		i_45_ += Class19.method798(i, i_46_, bool, (byte) -6);
	}
	return i_45_;
    }
    
    public static int method16053(int i, int i_47_, boolean bool) {
	Class534_Sub5 class534_sub5 = Class269.method5023(i, bool, (byte) 13);
	if (class534_sub5 == null)
	    return 0;
	if (i_47_ == -1)
	    return 0;
	int i_48_ = 0;
	for (int i_49_ = 0; i_49_ < class534_sub5.anIntArray10415.length;
	     i_49_++) {
	    if (i_47_ == class534_sub5.anIntArray10414[i_49_])
		i_48_ += class534_sub5.anIntArray10415[i_49_];
	}
	return i_48_;
    }
    
    static void method16054(int i, boolean bool) {
	Class534_Sub5 class534_sub5 = Class269.method5023(i, bool, (byte) 46);
	if (null != class534_sub5) {
	    for (int i_50_ = 0; i_50_ < class534_sub5.anIntArray10414.length;
		 i_50_++) {
		class534_sub5.anIntArray10414[i_50_] = -1;
		class534_sub5.anIntArray10415[i_50_] = 0;
	    }
	    class534_sub5.aClass8Array10416 = null;
	}
    }
    
    static Class534_Sub5 method16055(int i, boolean bool) {
	long l = (long) (i | (bool ? -2147483648 : 0));
	return (Class534_Sub5) aClass9_10411.method579(l);
    }
    
    static Class534_Sub5 method16056(int i, boolean bool) {
	long l = (long) (i | (bool ? -2147483648 : 0));
	return (Class534_Sub5) aClass9_10411.method579(l);
    }
    
    public static int method16057(int i, int i_51_, boolean bool) {
	Class534_Sub5 class534_sub5 = Class269.method5023(i, bool, (byte) 82);
	if (null == class534_sub5)
	    return -1;
	if (i_51_ < 0 || i_51_ >= class534_sub5.anIntArray10414.length)
	    return -1;
	return class534_sub5.anIntArray10414[i_51_];
    }
    
    static void method16058(int i, int i_52_, int i_53_, int i_54_,
			    Class8 class8, boolean bool) {
	long l = (long) (i | (bool ? -2147483648 : 0));
	Class534_Sub5 class534_sub5
	    = (Class534_Sub5) aClass9_10411.method579(l);
	if (class534_sub5 == null) {
	    class534_sub5 = new Class534_Sub5();
	    aClass9_10411.method581(class534_sub5, l);
	}
	if (class534_sub5.anIntArray10414.length <= i_52_) {
	    int[] is = new int[i_52_ + 1];
	    int[] is_55_ = new int[i_52_ + 1];
	    Class8[] class8s = null;
	    if (null != class534_sub5.aClass8Array10416)
		class8s = new Class8[1 + i_52_];
	    for (int i_56_ = 0; i_56_ < class534_sub5.anIntArray10414.length;
		 i_56_++) {
		is[i_56_] = class534_sub5.anIntArray10414[i_56_];
		is_55_[i_56_] = class534_sub5.anIntArray10415[i_56_];
		if (class534_sub5.aClass8Array10416 != null)
		    class8s[i_56_] = class534_sub5.aClass8Array10416[i_56_];
	    }
	    for (int i_57_ = class534_sub5.anIntArray10414.length;
		 i_57_ < i_52_; i_57_++) {
		is[i_57_] = -1;
		is_55_[i_57_] = 0;
	    }
	    class534_sub5.anIntArray10414 = is;
	    class534_sub5.anIntArray10415 = is_55_;
	    class534_sub5.aClass8Array10416 = class8s;
	}
	class534_sub5.anIntArray10414[i_52_] = i_53_;
	class534_sub5.anIntArray10415[i_52_] = i_54_;
	if (null != class8) {
	    if (null == class534_sub5.aClass8Array10416)
		class534_sub5.aClass8Array10416
		    = new Class8[class534_sub5.anIntArray10414.length];
	    class534_sub5.aClass8Array10416[i_52_] = class8;
	} else if (null != class534_sub5.aClass8Array10416)
	    class534_sub5.aClass8Array10416[i_52_] = null;
    }
    
    static void method16059(int i, int i_58_, int i_59_, int i_60_,
			    Class8 class8, boolean bool) {
	long l = (long) (i | (bool ? -2147483648 : 0));
	Class534_Sub5 class534_sub5
	    = (Class534_Sub5) aClass9_10411.method579(l);
	if (class534_sub5 == null) {
	    class534_sub5 = new Class534_Sub5();
	    aClass9_10411.method581(class534_sub5, l);
	}
	if (class534_sub5.anIntArray10414.length <= i_58_) {
	    int[] is = new int[i_58_ + 1];
	    int[] is_61_ = new int[i_58_ + 1];
	    Class8[] class8s = null;
	    if (null != class534_sub5.aClass8Array10416)
		class8s = new Class8[1 + i_58_];
	    for (int i_62_ = 0; i_62_ < class534_sub5.anIntArray10414.length;
		 i_62_++) {
		is[i_62_] = class534_sub5.anIntArray10414[i_62_];
		is_61_[i_62_] = class534_sub5.anIntArray10415[i_62_];
		if (class534_sub5.aClass8Array10416 != null)
		    class8s[i_62_] = class534_sub5.aClass8Array10416[i_62_];
	    }
	    for (int i_63_ = class534_sub5.anIntArray10414.length;
		 i_63_ < i_58_; i_63_++) {
		is[i_63_] = -1;
		is_61_[i_63_] = 0;
	    }
	    class534_sub5.anIntArray10414 = is;
	    class534_sub5.anIntArray10415 = is_61_;
	    class534_sub5.aClass8Array10416 = class8s;
	}
	class534_sub5.anIntArray10414[i_58_] = i_59_;
	class534_sub5.anIntArray10415[i_58_] = i_60_;
	if (null != class8) {
	    if (null == class534_sub5.aClass8Array10416)
		class534_sub5.aClass8Array10416
		    = new Class8[class534_sub5.anIntArray10414.length];
	    class534_sub5.aClass8Array10416[i_58_] = class8;
	} else if (null != class534_sub5.aClass8Array10416)
	    class534_sub5.aClass8Array10416[i_58_] = null;
    }
    
    static void method16060(int i, boolean bool) {
	Class534_Sub5 class534_sub5 = Class269.method5023(i, bool, (byte) 27);
	if (null != class534_sub5) {
	    for (int i_64_ = 0; i_64_ < class534_sub5.anIntArray10414.length;
		 i_64_++) {
		class534_sub5.anIntArray10414[i_64_] = -1;
		class534_sub5.anIntArray10415[i_64_] = 0;
	    }
	    class534_sub5.aClass8Array10416 = null;
	}
    }
    
    long method16061(int[] is, int i, int[] is_65_, boolean bool, byte i_66_) {
	long[] ls = Class534_Sub40.aLongArray10812;
	long l = -1L;
	l = l >>> 8 ^ ls[(int) ((l ^ (long) (i >> 8)) & 0xffL)];
	l = l >>> 8 ^ ls[(int) ((l ^ (long) i) & 0xffL)];
	for (int i_67_ = 0; i_67_ < is.length; i_67_++) {
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_67_] >> 24)) & 0xffL)];
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_67_] >> 16)) & 0xffL)];
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_67_] >> 8)) & 0xffL)];
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) is[i_67_]) & 0xffL)];
	}
	if (null != is_65_) {
	    for (int i_68_ = 0; i_68_ < 5; i_68_++)
		l = l >>> 8 ^ ls[(int) ((l ^ (long) is_65_[i_68_]) & 0xffL)];
	}
	l = l >>> 8 ^ ls[(int) ((l ^ (long) (bool ? 1 : 0)) & 0xffL)];
	return l;
    }
    
    static void method16062() {
	aClass9_10411.method578((byte) -8);
    }
    
    final Class183 method16063(Class185 class185, int i, Class711 class711,
			       int i_69_, boolean bool, Class631 class631) {
	Class183 class183 = null;
	int i_70_ = i;
	Class570 class570 = null;
	if (-1 != i_69_)
	    class570 = (Class570) Class200_Sub23.aClass44_Sub14_10041
				      .method91(i_69_, -767976162);
	int[] is = anIntArray10414;
	if (class570 != null && null != class570.anIntArray7652) {
	    is = new int[class570.anIntArray7652.length];
	    for (int i_71_ = 0; i_71_ < class570.anIntArray7652.length;
		 i_71_++) {
		int i_72_ = class570.anIntArray7652[i_71_];
		if (i_72_ >= 0 && i_72_ < anIntArray10414.length)
		    is[i_71_] = anIntArray10414[i_72_];
		else
		    is[i_71_] = -1;
	    }
	}
	if (null != class711)
	    i_70_ |= class711.method14360((short) -28742);
	long l = method16061(is, i_69_,
			     null != class631 ? class631.anIntArray8208 : null,
			     bool, (byte) 1);
	if (null != aClass203_10412)
	    class183 = (Class183) aClass203_10412.method3871(l);
	if (null == class183
	    || class185.method3330(class183.method3101(), i_70_) != 0) {
	    if (null != class183)
		i_70_ = class185.method3331(i_70_, class183.method3101());
	    int i_73_ = i_70_;
	    boolean bool_74_ = false;
	    for (int i_75_ = 0; i_75_ < is.length; i_75_++) {
		if (-1 != is[i_75_]
		    && !((Class15)
			 Class531.aClass44_Sub7_7135.method91(is[i_75_],
							      819552953))
			    .method677(bool, null, -1516820494))
		    bool_74_ = true;
	    }
	    if (bool_74_)
		return null;
	    Class187[] class187s = new Class187[is.length];
	    for (int i_76_ = 0; i_76_ < is.length; i_76_++) {
		if (is[i_76_] != -1)
		    class187s[i_76_]
			= ((Class15)
			   Class531.aClass44_Sub7_7135.method91(is[i_76_],
								-732518697))
			      .method680(bool, null, (byte) 2);
	    }
	    if (null != class570 && class570.anIntArrayArray7648 != null) {
		for (int i_77_ = 0;
		     i_77_ < class570.anIntArrayArray7648.length; i_77_++) {
		    if (class570.anIntArrayArray7648[i_77_] != null
			&& null != class187s[i_77_]) {
			int i_78_ = class570.anIntArrayArray7648[i_77_][0];
			int i_79_ = class570.anIntArrayArray7648[i_77_][1];
			int i_80_ = class570.anIntArrayArray7648[i_77_][2];
			int i_81_ = class570.anIntArrayArray7648[i_77_][3];
			int i_82_ = class570.anIntArrayArray7648[i_77_][4];
			int i_83_ = class570.anIntArrayArray7648[i_77_][5];
			if (i_81_ != 0 || 0 != i_82_ || i_83_ != 0)
			    class187s[i_77_].method3724(i_81_, i_82_, i_83_);
			if (i_78_ != 0 || 0 != i_79_ || 0 != i_80_)
			    class187s[i_77_].method3721(i_78_, i_79_, i_80_);
		    }
		}
	    }
	    Class187 class187 = new Class187(class187s, class187s.length);
	    if (class631 != null)
		i_73_ |= 0x4000;
	    class183 = class185.method3329(class187, i_73_,
					   anInt10413 * -1962800471, 66, 855);
	    if (null != class631) {
		for (int i_84_ = 0; i_84_ < 10; i_84_++) {
		    for (int i_85_ = 0;
			 i_85_ < Class631.aShortArrayArray8218[i_84_].length;
			 i_85_++) {
			if (class631.anIntArray8208[i_84_]
			    < (Class312.aShortArrayArrayArray3371[i_84_]
			       [i_85_]).length)
			    class183.method3056
				(Class631.aShortArrayArray8218[i_84_][i_85_],
				 (Class312.aShortArrayArrayArray3371[i_84_]
				  [i_85_][class631.anIntArray8208[i_84_]]));
		    }
		}
		for (int i_86_ = 0; i_86_ < 10; i_86_++) {
		    for (int i_87_ = 0;
			 i_87_ < Class580.aShortArrayArray7762[i_86_].length;
			 i_87_++) {
			if (class631.anIntArray8213[i_86_]
			    < (Class473.aShortArrayArrayArray5173[i_86_]
			       [i_87_]).length)
			    class183.method3118
				(Class580.aShortArrayArray7762[i_86_][i_87_],
				 (Class473.aShortArrayArrayArray5173[i_86_]
				  [i_87_][class631.anIntArray8213[i_86_]]));
		    }
		}
	    }
	    if (null != aClass203_10412) {
		class183.method3012(i_70_);
		aClass203_10412.method3893(class183, l);
	    }
	}
	if (class711 == null)
	    return class183;
	Class183 class183_88_ = class183.method3011((byte) 1, i_70_, true);
	class711.method14399(class183_88_, 0, 1927941493);
	return class183_88_;
    }
    
    static void method16064(int i) {
	anInt10413 = -2060961383 * i;
	aClass203_10412.method3877(-458689356);
    }
    
    Class534_Sub5() {
	/* empty */
    }
    
    static void method16065() {
	aClass203_10412.method3877(293099980);
    }
    
    static final void method16066(Class669 class669, int i) {
	class669.anInt8600 -= 926998689;
	int i_89_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_90_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	boolean bool
	    = (class669.anIntArray8595[2088438307 * class669.anInt8600 + 2]
	       == 1);
	Class626 class626
	    = client.aClass214_11359.method4044(i_89_, 1481307617)
		  .method3974(i_90_, -1213435377);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (bool ? class626.method10336(1445701475)
	       : class626.method10333(441412758));
    }
}
