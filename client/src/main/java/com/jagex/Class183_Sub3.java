/* Class183_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class183_Sub3 extends Class183
{
    int anInt9799;
    long[] aLongArray9800;
    short[] aShortArray9801;
    static final int anInt9802 = 4;
    int anInt9803;
    short aShort9804;
    short aShort9805;
    int anInt9806 = 0;
    int anInt9807 = 0;
    int[] anIntArray9808;
    int[] anIntArray9809;
    float[] aFloatArray9810;
    int[] anIntArray9811;
    short[] aShortArray9812;
    int anInt9813 = 0;
    byte[] aByteArray9814;
    short[] aShortArray9815;
    short[] aShortArray9816;
    Class185_Sub1 aClass185_Sub1_9817;
    int anInt9818;
    int[][] anIntArrayArray9819;
    int[] anIntArray9820;
    float[] aFloatArray9821;
    Class363 aClass363_9822;
    int anInt9823 = 0;
    int anInt9824 = 0;
    short[] aShortArray9825;
    byte[] aByteArray9826;
    int[] anIntArray9827;
    int[] anIntArray9828;
    float[] aFloatArray9829;
    short[] aShortArray9830;
    int[][] anIntArrayArray9831;
    short[] aShortArray9832;
    Class335 aClass335_9833;
    Class379 aClass379_9834;
    Class379 aClass379_9835;
    Class379 aClass379_9836;
    Class379 aClass379_9837;
    boolean aBool9838 = false;
    boolean aBool9839 = true;
    boolean aBool9840 = false;
    boolean aBool9841 = false;
    int anInt9842;
    short[] aShortArray9843;
    int anInt9844;
    short[] aShortArray9845;
    int anInt9846;
    short[] aShortArray9847;
    int anInt9848;
    int anInt9849;
    boolean aBool9850 = false;
    boolean aBool9851 = false;
    int[] anIntArray9852;
    int[] anIntArray9853;
    int[] anIntArray9854;
    int[] anIntArray9855;
    int[][] anIntArrayArray9856;
    int[] anIntArray9857;
    Class172[] aClass172Array9858;
    Class158[] aClass158Array9859;
    int anInt9860;
    Class368[] aClass368Array9861;
    Class339[] aClass339Array9862;
    short[] aShortArray9863;
    short[] aShortArray9864;
    int anInt9865;
    int anInt9866;
    int[] anIntArray9867;
    int anInt9868;
    short[] aShortArray9869;
    static final int anInt9870 = 7;
    int anInt9871;
    int anInt9872;
    int anInt9873;
    boolean aBool9874;
    static Class345 aClass345_9875;
    
    boolean method3032() {
	if (anIntArrayArray9819 == null)
	    return false;
	for (int i = 0; i < anInt9806; i++) {
	    anIntArray9808[i] <<= 4;
	    anIntArray9809[i] <<= 4;
	    anIntArray9828[i] <<= 4;
	}
	anInt9871 = 0;
	anInt9818 = 0;
	anInt9873 = 0;
	return true;
    }
    
    Class183_Sub3(Class185_Sub1 class185_sub1, Class187 class187, int i,
		  int i_0_, int i_1_, int i_2_) {
	this(class185_sub1, i, i_2_, true, false);
	Class177 class177 = class185_sub1.aClass177_2012;
	Interface45 interface45 = class185_sub1.anInterface45_1999;
	int[] is = new int[class187.anInt2092];
	anIntArray9853 = new int[class187.anInt2106 + 1];
	for (int i_3_ = 0; i_3_ < class187.anInt2092; i_3_++) {
	    if (class187.aByteArray2099 == null
		|| class187.aByteArray2099[i_3_] != 2) {
		if (class187.aShortArray2104 != null
		    && class187.aShortArray2104[i_3_] != -1) {
		    Class186 class186
			= class177.method2931((class187.aShortArray2104[i_3_]
					       & 0xffff),
					      (byte) 1);
		    if (((anInt9872 & 0x40) == 0 || !class186.aBool2072)
			&& class186.aBool2028)
			continue;
		}
		is[anInt9823++] = i_3_;
		anIntArray9853[class187.aShortArray2093[i_3_]]++;
		anIntArray9853[class187.aShortArray2077[i_3_]]++;
		anIntArray9853[class187.aShortArray2095[i_3_]]++;
	    }
	}
	anInt9824 = anInt9823;
	long[] ls = new long[anInt9823];
	boolean bool = (anInt9803 & 0x100) != 0;
	for (int i_4_ = 0; i_4_ < anInt9823; i_4_++) {
	    int i_5_ = is[i_4_];
	    Class186 class186 = null;
	    int i_6_ = 0;
	    int i_7_ = 0;
	    int i_8_ = 0;
	    int i_9_ = 0;
	    if (class187.aClass168Array2125 != null) {
		boolean bool_10_ = false;
		for (int i_11_ = 0; i_11_ < class187.aClass168Array2125.length;
		     i_11_++) {
		    Class168 class168 = class187.aClass168Array2125[i_11_];
		    if (i_5_ == class168.anInt1791 * 1329690033) {
			Class383 class383
			    = interface45.method344((class168.anInt1788
						     * 452560563),
						    -1537561956);
			if (class383.aBool3942)
			    bool_10_ = true;
			if (class383.anInt3936 * 651115273 != -1) {
			    Class186 class186_12_
				= class177.method2931((class383.anInt3936
						       * 651115273),
						      (byte) 1);
			    if (class186_12_.aClass599_2064
				== Class599.aClass599_7870)
				aBool9840 = true;
			}
		    }
		}
		if (bool_10_) {
		    ls[i_4_] = 9223372036854775807L;
		    anInt9824--;
		    continue;
		}
	    }
	    if (class187.aClass172Array2123 != null) {
		boolean bool_13_ = false;
		for (int i_14_ = 0; i_14_ < class187.aClass172Array2123.length;
		     i_14_++) {
		    Class172 class172 = class187.aClass172Array2123[i_14_];
		    if (i_5_ == class172.anInt1810 * -1916225325) {
			Class385 class385
			    = (aClass185_Sub1_9817.anInterface48_2000.method354
			       (class172.anInt1811 * 1708272351, -787802805));
			if (class385.aBool4039)
			    bool_13_ = true;
		    }
		}
		if (bool_13_) {
		    ls[i_4_] = 9223372036854775807L;
		    anInt9824--;
		    continue;
		}
	    }
	    int i_15_ = -1;
	    if (class187.aShortArray2104 != null) {
		i_15_ = class187.aShortArray2104[i_5_];
		if (i_15_ != -1) {
		    class186 = class177.method2931(i_15_ & 0xffff, (byte) 1);
		    if ((anInt9872 & 0x40) == 0 || !class186.aBool2072) {
			i_8_ = class186.aByte2067;
			i_9_ = class186.aByte2068;
		    } else {
			i_15_ = -1;
			class186 = null;
		    }
		}
	    }
	    boolean bool_16_
		= ((class187.aByteArray2101 != null
		    && class187.aByteArray2101[i_5_] != 0)
		   || (class186 != null
		       && class186.aClass599_2064 != Class599.aClass599_7869));
	    if ((bool || bool_16_) && class187.aByteArray2100 != null)
		i_6_ += class187.aByteArray2100[i_5_] << 17;
	    if (bool_16_)
		i_6_ += 65536;
	    i_6_ += (i_8_ & 0xff) << 8;
	    i_6_ += i_9_ & 0xff;
	    i_7_ += (i_15_ & 0xffff) << 16;
	    i_7_ += i_4_ & 0xffff;
	    ls[i_4_] = ((long) i_6_ << 32) + (long) i_7_;
	    aBool9840 |= bool_16_;
	    Class183_Sub3 class183_sub3_17_ = this;
	    class183_sub3_17_.aBool9841
		= (class183_sub3_17_.aBool9841
		   | (class186 != null && (class186.aByte2047 != 0
					   || class186.aByte2048 != 0)));
	}
	Class417.method6755(ls, is, -1758793138);
	anInt9806 = class187.anInt2081;
	anInt9807 = class187.anInt2106;
	anIntArray9808 = class187.anIntArray2083;
	anIntArray9809 = class187.anIntArray2080;
	anIntArray9828 = class187.anIntArray2113;
	aShortArray9812 = class187.aShortArray2088;
	Class358[] class358s = new Class358[anInt9807];
	aClass172Array9858 = class187.aClass172Array2123;
	aClass158Array9859 = class187.aClass158Array2124;
	if (class187.aClass168Array2125 != null) {
	    anInt9860 = class187.aClass168Array2125.length;
	    aClass368Array9861 = new Class368[anInt9860];
	    aClass339Array9862 = new Class339[anInt9860];
	    for (int i_18_ = 0; i_18_ < anInt9860; i_18_++) {
		Class168 class168 = class187.aClass168Array2125[i_18_];
		Class383 class383
		    = interface45.method344(class168.anInt1788 * 452560563,
					    -1534281253);
		int i_19_ = -1;
		for (int i_20_ = 0; i_20_ < anInt9823; i_20_++) {
		    if (is[i_20_] == class168.anInt1791 * 1329690033) {
			i_19_ = i_20_;
			break;
		    }
		}
		if (i_19_ == -1)
		    throw new RuntimeException();
		int i_21_ = ((Class661.anIntArray8549
			      [(class187.aShortArray2096
				[class168.anInt1791 * 1329690033]) & 0xffff])
			     & 0xffffff);
		i_21_ = i_21_ | 255 - (class187.aByteArray2101 != null
				       ? (class187.aByteArray2101
					  [class168.anInt1791 * 1329690033])
				       : 0) << 24;
		aClass368Array9861[i_18_]
		    = new Class368(i_19_,
				   (class187.aShortArray2093
				    [class168.anInt1791 * 1329690033]),
				   (class187.aShortArray2077
				    [class168.anInt1791 * 1329690033]),
				   (class187.aShortArray2095
				    [class168.anInt1791 * 1329690033]),
				   class383.anInt3937 * -312833239,
				   class383.anInt3938 * -407898751,
				   class383.anInt3936 * 651115273,
				   class383.anInt3940 * -1616229305,
				   class383.anInt3935 * 1576328455,
				   class383.aBool3942, class383.aBool3941,
				   class168.anInt1789 * -1972242819);
		aClass339Array9862[i_18_] = new Class339(i_21_);
	    }
	}
	int i_22_ = anInt9823 * 3;
	aShortArray9801 = new short[i_22_];
	aShortArray9815 = new short[i_22_];
	aShortArray9816 = new short[i_22_];
	aShortArray9864 = new short[i_22_];
	aShortArray9869 = new short[i_22_];
	aByteArray9814 = new byte[i_22_];
	aFloatArray9829 = new float[i_22_];
	aFloatArray9821 = new float[i_22_];
	aShortArray9825 = new short[anInt9823];
	aByteArray9826 = new byte[anInt9823];
	aShortArray9847 = new short[anInt9823];
	aShortArray9845 = new short[anInt9823];
	aShortArray9843 = new short[anInt9823];
	aShortArray9830 = new short[anInt9823];
	if (class187.aShortArray2094 != null)
	    aShortArray9832 = new short[anInt9823];
	aShort9804 = (short) i_0_;
	aShort9805 = (short) i_1_;
	aShortArray9863 = new short[i_22_];
	aLongArray9800 = new long[i_22_];
	int i_23_ = 0;
	for (int i_24_ = 0; i_24_ < class187.anInt2106; i_24_++) {
	    int i_25_ = anIntArray9853[i_24_];
	    anIntArray9853[i_24_] = i_23_;
	    i_23_ += i_25_;
	    class358s[i_24_] = new Class358();
	}
	anIntArray9853[class187.anInt2106] = i_23_;
	Class196 class196 = method3009(class187, is, anInt9823);
	Class377[] class377s = new Class377[class187.anInt2092];
	for (int i_26_ = 0; i_26_ < class187.anInt2092; i_26_++) {
	    short i_27_ = class187.aShortArray2093[i_26_];
	    short i_28_ = class187.aShortArray2077[i_26_];
	    short i_29_ = class187.aShortArray2095[i_26_];
	    int i_30_ = anIntArray9808[i_28_] - anIntArray9808[i_27_];
	    int i_31_ = anIntArray9809[i_28_] - anIntArray9809[i_27_];
	    int i_32_ = anIntArray9828[i_28_] - anIntArray9828[i_27_];
	    int i_33_ = anIntArray9808[i_29_] - anIntArray9808[i_27_];
	    int i_34_ = anIntArray9809[i_29_] - anIntArray9809[i_27_];
	    int i_35_ = anIntArray9828[i_29_] - anIntArray9828[i_27_];
	    int i_36_ = i_31_ * i_35_ - i_34_ * i_32_;
	    int i_37_ = i_32_ * i_33_ - i_35_ * i_30_;
	    int i_38_;
	    for (i_38_ = i_30_ * i_34_ - i_33_ * i_31_;
		 (i_36_ > 8192 || i_37_ > 8192 || i_38_ > 8192 || i_36_ < -8192
		  || i_37_ < -8192 || i_38_ < -8192);
		 i_38_ >>= 1) {
		i_36_ >>= 1;
		i_37_ >>= 1;
	    }
	    int i_39_ = (int) Math.sqrt((double) (i_36_ * i_36_ + i_37_ * i_37_
						  + i_38_ * i_38_));
	    if (i_39_ <= 0)
		i_39_ = 1;
	    i_36_ = i_36_ * 256 / i_39_;
	    i_37_ = i_37_ * 256 / i_39_;
	    i_38_ = i_38_ * 256 / i_39_;
	    byte i_40_ = (class187.aByteArray2099 == null ? (byte) 0
			  : class187.aByteArray2099[i_26_]);
	    if (i_40_ == 0) {
		Class358 class358 = class358s[i_27_];
		class358.anInt3692 += i_36_;
		class358.anInt3693 += i_37_;
		class358.anInt3691 += i_38_;
		class358.anInt3694++;
		class358 = class358s[i_28_];
		class358.anInt3692 += i_36_;
		class358.anInt3693 += i_37_;
		class358.anInt3691 += i_38_;
		class358.anInt3694++;
		class358 = class358s[i_29_];
		class358.anInt3692 += i_36_;
		class358.anInt3693 += i_37_;
		class358.anInt3691 += i_38_;
		class358.anInt3694++;
	    } else if (i_40_ == 1) {
		Class377 class377 = class377s[i_26_] = new Class377();
		class377.anInt3914 = i_36_;
		class377.anInt3913 = i_37_;
		class377.anInt3912 = i_38_;
	    }
	}
	for (int i_41_ = 0; i_41_ < anInt9823; i_41_++) {
	    int i_42_ = is[i_41_];
	    int i_43_ = class187.aShortArray2096[i_42_] & 0xffff;
	    int i_44_ = (class187.aByteArray2101 != null
			 ? class187.aByteArray2101[i_42_] & 0xff : 0);
	    short i_45_ = (class187.aShortArray2104 == null ? (short) -1
			   : class187.aShortArray2104[i_42_]);
	    if (i_45_ != -1 && (anInt9872 & 0x40) != 0
		&& class177.method2931(i_45_, (byte) 1).aBool2072)
		i_45_ = (short) -1;
	    float f = 0.0F;
	    float f_46_ = 0.0F;
	    float f_47_ = 0.0F;
	    float f_48_ = 0.0F;
	    float f_49_ = 0.0F;
	    float f_50_ = 0.0F;
	    long l;
	    long l_51_;
	    long l_52_;
	    if (i_45_ != -1) {
		int i_53_ = (class187.aShortArray2102 != null
			     ? class187.aShortArray2102[i_42_] : -1);
		if (i_53_ == 32766) {
		    int i_54_ = class187.aByteArray2111[i_42_] & 0xff;
		    int i_55_ = class187.aByteArray2097[i_42_] & 0xff;
		    int i_56_ = class187.aByteArray2098[i_42_] & 0xff;
		    i_54_ += (class187.anIntArray2112
			      [class187.aShortArray2093[i_42_]]);
		    l_52_ = (long) i_54_;
		    i_55_ += (class187.anIntArray2112
			      [class187.aShortArray2077[i_42_]]);
		    l_51_ = (long) i_54_;
		    i_56_ += (class187.anIntArray2112
			      [class187.aShortArray2095[i_42_]]);
		    l = (long) i_54_;
		    f = class187.aFloatArray2091[i_54_];
		    f_46_ = class187.aFloatArray2084[i_54_];
		    f_47_ = class187.aFloatArray2091[i_55_];
		    f_48_ = class187.aFloatArray2084[i_55_];
		    f_49_ = class187.aFloatArray2091[i_56_];
		    f_50_ = class187.aFloatArray2084[i_56_];
		} else if (i_53_ == -1) {
		    f = 0.0F;
		    f_46_ = 1.0F;
		    l_52_ = 65535L;
		    f_47_ = 1.0F;
		    f_48_ = 1.0F;
		    l_51_ = 131071L;
		    f_49_ = 0.0F;
		    f_50_ = 0.0F;
		    l = 196607L;
		} else {
		    i_53_ &= 0xffff;
		    int i_57_ = 0;
		    int i_58_ = 0;
		    int i_59_ = 0;
		    byte i_60_ = class187.aByteArray2086[i_53_];
		    if (i_60_ == 0) {
			short i_61_ = class187.aShortArray2093[i_42_];
			short i_62_ = class187.aShortArray2077[i_42_];
			short i_63_ = class187.aShortArray2095[i_42_];
			short i_64_ = class187.aShortArray2108[i_53_];
			short i_65_ = class187.aShortArray2085[i_53_];
			short i_66_ = class187.aShortArray2114[i_53_];
			float f_67_ = (float) class187.anIntArray2083[i_64_];
			float f_68_ = (float) class187.anIntArray2080[i_64_];
			float f_69_ = (float) class187.anIntArray2113[i_64_];
			float f_70_
			    = (float) class187.anIntArray2083[i_65_] - f_67_;
			float f_71_
			    = (float) class187.anIntArray2080[i_65_] - f_68_;
			float f_72_
			    = (float) class187.anIntArray2113[i_65_] - f_69_;
			float f_73_
			    = (float) class187.anIntArray2083[i_66_] - f_67_;
			float f_74_
			    = (float) class187.anIntArray2080[i_66_] - f_68_;
			float f_75_
			    = (float) class187.anIntArray2113[i_66_] - f_69_;
			float f_76_
			    = (float) class187.anIntArray2083[i_61_] - f_67_;
			float f_77_
			    = (float) class187.anIntArray2080[i_61_] - f_68_;
			float f_78_
			    = (float) class187.anIntArray2113[i_61_] - f_69_;
			float f_79_
			    = (float) class187.anIntArray2083[i_62_] - f_67_;
			float f_80_
			    = (float) class187.anIntArray2080[i_62_] - f_68_;
			float f_81_
			    = (float) class187.anIntArray2113[i_62_] - f_69_;
			float f_82_
			    = (float) class187.anIntArray2083[i_63_] - f_67_;
			float f_83_
			    = (float) class187.anIntArray2080[i_63_] - f_68_;
			float f_84_
			    = (float) class187.anIntArray2113[i_63_] - f_69_;
			float f_85_ = f_71_ * f_75_ - f_72_ * f_74_;
			float f_86_ = f_72_ * f_73_ - f_70_ * f_75_;
			float f_87_ = f_70_ * f_74_ - f_71_ * f_73_;
			float f_88_ = f_74_ * f_87_ - f_75_ * f_86_;
			float f_89_ = f_75_ * f_85_ - f_73_ * f_87_;
			float f_90_ = f_73_ * f_86_ - f_74_ * f_85_;
			float f_91_ = 1.0F / (f_88_ * f_70_ + f_89_ * f_71_
					      + f_90_ * f_72_);
			f = ((f_88_ * f_76_ + f_89_ * f_77_ + f_90_ * f_78_)
			     * f_91_);
			f_47_ = (f_88_ * f_79_ + f_89_ * f_80_
				 + f_90_ * f_81_) * f_91_;
			f_49_ = (f_88_ * f_82_ + f_89_ * f_83_
				 + f_90_ * f_84_) * f_91_;
			f_88_ = f_71_ * f_87_ - f_72_ * f_86_;
			f_89_ = f_72_ * f_85_ - f_70_ * f_87_;
			f_90_ = f_70_ * f_86_ - f_71_ * f_85_;
			f_91_ = 1.0F / (f_88_ * f_73_ + f_89_ * f_74_
					+ f_90_ * f_75_);
			f_46_ = (f_88_ * f_76_ + f_89_ * f_77_
				 + f_90_ * f_78_) * f_91_;
			f_48_ = (f_88_ * f_79_ + f_89_ * f_80_
				 + f_90_ * f_81_) * f_91_;
			f_50_ = (f_88_ * f_82_ + f_89_ * f_83_
				 + f_90_ * f_84_) * f_91_;
		    } else {
			short i_92_ = class187.aShortArray2093[i_42_];
			short i_93_ = class187.aShortArray2077[i_42_];
			short i_94_ = class187.aShortArray2095[i_42_];
			int i_95_ = class196.anIntArray2161[i_53_];
			int i_96_ = class196.anIntArray2160[i_53_];
			int i_97_ = class196.anIntArray2162[i_53_];
			float[] fs = class196.aFloatArrayArray2163[i_53_];
			byte i_98_ = class187.aByteArray2122[i_53_];
			float f_99_
			    = (float) class187.anIntArray2118[i_53_] / 256.0F;
			if (i_60_ == 1) {
			    float f_100_
				= ((float) class187.anIntArray2117[i_53_]
				   / 1024.0F);
			    method3006(class187.anIntArray2083[i_92_],
				       class187.anIntArray2080[i_92_],
				       class187.anIntArray2113[i_92_], i_95_,
				       i_96_, i_97_, fs, f_100_, i_98_, f_99_,
				       aFloatArray9810);
			    f = aFloatArray9810[0];
			    f_46_ = aFloatArray9810[1];
			    method3006(class187.anIntArray2083[i_93_],
				       class187.anIntArray2080[i_93_],
				       class187.anIntArray2113[i_93_], i_95_,
				       i_96_, i_97_, fs, f_100_, i_98_, f_99_,
				       aFloatArray9810);
			    f_47_ = aFloatArray9810[0];
			    f_48_ = aFloatArray9810[1];
			    method3006(class187.anIntArray2083[i_94_],
				       class187.anIntArray2080[i_94_],
				       class187.anIntArray2113[i_94_], i_95_,
				       i_96_, i_97_, fs, f_100_, i_98_, f_99_,
				       aFloatArray9810);
			    f_49_ = aFloatArray9810[0];
			    f_50_ = aFloatArray9810[1];
			    float f_101_ = f_100_ / 2.0F;
			    if ((i_98_ & 0x1) == 0) {
				if (f_47_ - f > f_101_) {
				    f_47_ -= f_100_;
				    i_58_ = 1;
				} else if (f - f_47_ > f_101_) {
				    f_47_ += f_100_;
				    i_58_ = 2;
				}
				if (f_49_ - f > f_101_) {
				    f_49_ -= f_100_;
				    i_59_ = 1;
				} else if (f - f_49_ > f_101_) {
				    f_49_ += f_100_;
				    i_59_ = 2;
				}
			    } else {
				if (f_48_ - f_46_ > f_101_) {
				    f_48_ -= f_100_;
				    i_58_ = 1;
				} else if (f_46_ - f_48_ > f_101_) {
				    f_48_ += f_100_;
				    i_58_ = 2;
				}
				if (f_50_ - f_46_ > f_101_) {
				    f_50_ -= f_100_;
				    i_59_ = 1;
				} else if (f_46_ - f_50_ > f_101_) {
				    f_50_ += f_100_;
				    i_59_ = 2;
				}
			    }
			} else if (i_60_ == 2) {
			    float f_102_
				= ((float) class187.anIntArray2119[i_53_]
				   / 256.0F);
			    float f_103_
				= ((float) class187.anIntArray2120[i_53_]
				   / 256.0F);
			    int i_104_ = (class187.anIntArray2083[i_93_]
					  - class187.anIntArray2083[i_92_]);
			    int i_105_ = (class187.anIntArray2080[i_93_]
					  - class187.anIntArray2080[i_92_]);
			    int i_106_ = (class187.anIntArray2113[i_93_]
					  - class187.anIntArray2113[i_92_]);
			    int i_107_ = (class187.anIntArray2083[i_94_]
					  - class187.anIntArray2083[i_92_]);
			    int i_108_ = (class187.anIntArray2080[i_94_]
					  - class187.anIntArray2080[i_92_]);
			    int i_109_ = (class187.anIntArray2113[i_94_]
					  - class187.anIntArray2113[i_92_]);
			    int i_110_ = i_105_ * i_109_ - i_108_ * i_106_;
			    int i_111_ = i_106_ * i_107_ - i_109_ * i_104_;
			    int i_112_ = i_104_ * i_108_ - i_107_ * i_105_;
			    float f_113_
				= (64.0F
				   / (float) class187.anIntArray2115[i_53_]);
			    float f_114_
				= (64.0F
				   / (float) class187.anIntArray2116[i_53_]);
			    float f_115_
				= (64.0F
				   / (float) class187.anIntArray2117[i_53_]);
			    float f_116_ = (((float) i_110_ * fs[0]
					     + (float) i_111_ * fs[1]
					     + (float) i_112_ * fs[2])
					    / f_113_);
			    float f_117_ = (((float) i_110_ * fs[3]
					     + (float) i_111_ * fs[4]
					     + (float) i_112_ * fs[5])
					    / f_114_);
			    float f_118_ = (((float) i_110_ * fs[6]
					     + (float) i_111_ * fs[7]
					     + (float) i_112_ * fs[8])
					    / f_115_);
			    i_57_ = method3179(f_116_, f_117_, f_118_);
			    method3008(class187.anIntArray2083[i_92_],
				       class187.anIntArray2080[i_92_],
				       class187.anIntArray2113[i_92_], i_95_,
				       i_96_, i_97_, i_57_, fs, i_98_, f_99_,
				       f_102_, f_103_, aFloatArray9810);
			    f = aFloatArray9810[0];
			    f_46_ = aFloatArray9810[1];
			    method3008(class187.anIntArray2083[i_93_],
				       class187.anIntArray2080[i_93_],
				       class187.anIntArray2113[i_93_], i_95_,
				       i_96_, i_97_, i_57_, fs, i_98_, f_99_,
				       f_102_, f_103_, aFloatArray9810);
			    f_47_ = aFloatArray9810[0];
			    f_48_ = aFloatArray9810[1];
			    method3008(class187.anIntArray2083[i_94_],
				       class187.anIntArray2080[i_94_],
				       class187.anIntArray2113[i_94_], i_95_,
				       i_96_, i_97_, i_57_, fs, i_98_, f_99_,
				       f_102_, f_103_, aFloatArray9810);
			    f_49_ = aFloatArray9810[0];
			    f_50_ = aFloatArray9810[1];
			} else if (i_60_ == 3) {
			    method3005(class187.anIntArray2083[i_92_],
				       class187.anIntArray2080[i_92_],
				       class187.anIntArray2113[i_92_], i_95_,
				       i_96_, i_97_, fs, i_98_, f_99_,
				       aFloatArray9810);
			    f = aFloatArray9810[0];
			    f_46_ = aFloatArray9810[1];
			    method3005(class187.anIntArray2083[i_93_],
				       class187.anIntArray2080[i_93_],
				       class187.anIntArray2113[i_93_], i_95_,
				       i_96_, i_97_, fs, i_98_, f_99_,
				       aFloatArray9810);
			    f_47_ = aFloatArray9810[0];
			    f_48_ = aFloatArray9810[1];
			    method3005(class187.anIntArray2083[i_94_],
				       class187.anIntArray2080[i_94_],
				       class187.anIntArray2113[i_94_], i_95_,
				       i_96_, i_97_, fs, i_98_, f_99_,
				       aFloatArray9810);
			    f_49_ = aFloatArray9810[0];
			    f_50_ = aFloatArray9810[1];
			    if ((i_98_ & 0x1) == 0) {
				if (f_47_ - f > 0.5F) {
				    f_47_--;
				    i_58_ = 1;
				} else if (f - f_47_ > 0.5F) {
				    f_47_++;
				    i_58_ = 2;
				}
				if (f_49_ - f > 0.5F) {
				    f_49_--;
				    i_59_ = 1;
				} else if (f - f_49_ > 0.5F) {
				    f_49_++;
				    i_59_ = 2;
				}
			    } else {
				if (f_48_ - f_46_ > 0.5F) {
				    f_48_--;
				    i_58_ = 1;
				} else if (f_46_ - f_48_ > 0.5F) {
				    f_48_++;
				    i_58_ = 2;
				}
				if (f_50_ - f_46_ > 0.5F) {
				    f_50_--;
				    i_59_ = 1;
				} else if (f_46_ - f_50_ > 0.5F) {
				    f_50_++;
				    i_59_ = 2;
				}
			    }
			}
		    }
		    l_52_ = (long) (i_57_ << 16 | i_53_);
		    l_51_ = (long) (i_58_ << 19) | l_52_;
		    l = (long) (i_59_ << 19) | l_52_;
		}
	    } else {
		l = 0L;
		l_51_ = 0L;
		l_52_ = 0L;
	    }
	    byte i_119_ = (class187.aByteArray2099 != null
			   ? class187.aByteArray2099[i_42_] : (byte) 0);
	    if (i_119_ == 0) {
		long l_120_ = (long) ((i_43_ << 8) + i_44_);
		short i_121_ = class187.aShortArray2093[i_42_];
		short i_122_ = class187.aShortArray2077[i_42_];
		short i_123_ = class187.aShortArray2095[i_42_];
		Class358 class358 = class358s[i_121_];
		aShortArray9847[i_41_]
		    = method15498(class187, i_121_, i_41_,
				  l_120_ | l_52_ << 24, class358.anInt3692,
				  class358.anInt3693, class358.anInt3691,
				  class358.anInt3694, f, f_46_);
		class358 = class358s[i_122_];
		aShortArray9845[i_41_]
		    = method15498(class187, i_122_, i_41_,
				  l_120_ | l_51_ << 24, class358.anInt3692,
				  class358.anInt3693, class358.anInt3691,
				  class358.anInt3694, f_47_, f_48_);
		class358 = class358s[i_123_];
		aShortArray9843[i_41_]
		    = method15498(class187, i_123_, i_41_, l_120_ | l << 24,
				  class358.anInt3692, class358.anInt3693,
				  class358.anInt3691, class358.anInt3694,
				  f_49_, f_50_);
	    } else if (i_119_ == 1) {
		Class377 class377 = class377s[i_42_];
		long l_124_ = (((long) (class377.anInt3914 & ~0x7fffffff) << 9)
			       + ((long) (class377.anInt3913 + 256) << 32)
			       + ((long) (class377.anInt3912 + 256) << 24)
			       + (long) (i_43_ << 8) + (long) i_44_);
		aShortArray9847[i_41_]
		    = method15498(class187, class187.aShortArray2093[i_42_],
				  i_41_, l_124_ | l_52_ << 41,
				  class377.anInt3914, class377.anInt3913,
				  class377.anInt3912, 0, f, f_46_);
		aShortArray9845[i_41_]
		    = method15498(class187, class187.aShortArray2077[i_42_],
				  i_41_, l_124_ | l_52_ << 41,
				  class377.anInt3914, class377.anInt3913,
				  class377.anInt3912, 0, f_47_, f_48_);
		aShortArray9843[i_41_]
		    = method15498(class187, class187.aShortArray2095[i_42_],
				  i_41_, l_124_ | l_52_ << 41,
				  class377.anInt3914, class377.anInt3913,
				  class377.anInt3912, 0, f_49_, f_50_);
	    }
	    if (class187.aByteArray2101 != null)
		aByteArray9826[i_41_] = class187.aByteArray2101[i_42_];
	    if (class187.aShortArray2094 != null)
		aShortArray9832[i_41_] = class187.aShortArray2094[i_42_];
	    aShortArray9825[i_41_] = class187.aShortArray2096[i_42_];
	    aShortArray9830[i_41_] = i_45_;
	}
	if (anInt9824 > 0) {
	    int i_125_ = 1;
	    short i_126_ = aShortArray9830[0];
	    for (int i_127_ = 0; i_127_ < anInt9824; i_127_++) {
		short i_128_ = aShortArray9830[i_127_];
		if (i_128_ != i_126_) {
		    i_125_++;
		    i_126_ = i_128_;
		}
	    }
	    anIntArray9854 = new int[i_125_];
	    anIntArray9855 = new int[i_125_];
	    anIntArray9827 = new int[i_125_ + 1];
	    anIntArray9827[0] = 0;
	    int i_129_ = anInt9813;
	    int i_130_ = 0;
	    i_125_ = 0;
	    i_126_ = aShortArray9830[0];
	    for (int i_131_ = 0; i_131_ < anInt9824; i_131_++) {
		short i_132_ = aShortArray9830[i_131_];
		if (i_132_ != i_126_) {
		    anIntArray9854[i_125_] = i_129_;
		    anIntArray9855[i_125_] = i_130_ - i_129_ + 1;
		    anIntArray9827[++i_125_] = i_131_;
		    i_129_ = anInt9813;
		    i_130_ = 0;
		    i_126_ = i_132_;
		}
		int i_133_ = aShortArray9847[i_131_] & 0xffff;
		if (i_133_ < i_129_)
		    i_129_ = i_133_;
		if (i_133_ > i_130_)
		    i_130_ = i_133_;
		i_133_ = aShortArray9845[i_131_] & 0xffff;
		if (i_133_ < i_129_)
		    i_129_ = i_133_;
		if (i_133_ > i_130_)
		    i_130_ = i_133_;
		i_133_ = aShortArray9843[i_131_] & 0xffff;
		if (i_133_ < i_129_)
		    i_129_ = i_133_;
		if (i_133_ > i_130_)
		    i_130_ = i_133_;
	    }
	    anIntArray9854[i_125_] = i_129_;
	    anIntArray9855[i_125_] = i_130_ - i_129_ + 1;
	    anIntArray9827[++i_125_] = anInt9824;
	}
	aLongArray9800 = null;
	aShortArray9801 = method15500(aShortArray9801, anInt9813);
	aShortArray9815 = method15500(aShortArray9815, anInt9813);
	aShortArray9816 = method15500(aShortArray9816, anInt9813);
	aShortArray9864 = method15500(aShortArray9864, anInt9813);
	aShortArray9869 = method15500(aShortArray9869, anInt9813);
	aByteArray9814 = method15499(aByteArray9814, anInt9813);
	aFloatArray9829 = method15501(aFloatArray9829, anInt9813);
	aFloatArray9821 = method15501(aFloatArray9821, anInt9813);
	if (class187.anIntArray2087 != null
	    && Class342.method5971(i, anInt9872))
	    anIntArrayArray9819 = class187.method3716(false);
	if (class187.aClass168Array2125 != null
	    && Class342.method5983(i, anInt9872))
	    anIntArrayArray9856 = class187.method3718();
	if (class187.anIntArray2090 != null
	    && Class342.method5981(i, anInt9872)) {
	    int i_134_ = 0;
	    int[] is_135_ = new int[256];
	    for (int i_136_ = 0; i_136_ < anInt9823; i_136_++) {
		int i_137_ = class187.anIntArray2090[is[i_136_]];
		if (i_137_ >= 0) {
		    is_135_[i_137_]++;
		    if (i_137_ > i_134_)
			i_134_ = i_137_;
		}
	    }
	    anIntArrayArray9831 = new int[i_134_ + 1][];
	    for (int i_138_ = 0; i_138_ <= i_134_; i_138_++) {
		anIntArrayArray9831[i_138_] = new int[is_135_[i_138_]];
		is_135_[i_138_] = 0;
	    }
	    for (int i_139_ = 0; i_139_ < anInt9823; i_139_++) {
		int i_140_ = class187.anIntArray2090[is[i_139_]];
		if (i_140_ >= 0)
		    anIntArrayArray9831[i_140_][is_135_[i_140_]++] = i_139_;
	    }
	}
    }
    
    short method15498(Class187 class187, int i, int i_141_, long l, int i_142_,
		      int i_143_, int i_144_, int i_145_, float f,
		      float f_146_) {
	int i_147_ = anIntArray9853[i];
	int i_148_ = anIntArray9853[i + 1];
	int i_149_ = 0;
	for (int i_150_ = i_147_; i_150_ < i_148_; i_150_++) {
	    if (aShortArray9863[i_150_] == 0) {
		i_149_ = i_150_;
		break;
	    }
	    int i_151_ = (aShortArray9863[i_150_] & 0xffff) - 1;
	    if (aLongArray9800[i_150_] == l)
		return (short) i_151_;
	}
	aShortArray9863[i_149_] = (short) (anInt9813 + 1);
	aLongArray9800[i_149_] = l;
	aShortArray9815[anInt9813] = (short) i_141_;
	aShortArray9801[anInt9813] = (short) i;
	aShortArray9816[anInt9813] = (short) i_142_;
	aShortArray9864[anInt9813] = (short) i_143_;
	aShortArray9869[anInt9813] = (short) i_144_;
	aByteArray9814[anInt9813] = (byte) i_145_;
	aFloatArray9829[anInt9813] = f;
	aFloatArray9821[anInt9813] = f_146_;
	return (short) anInt9813++;
    }
    
    static byte[] method15499(byte[] is, int i) {
	byte[] is_152_ = new byte[i];
	System.arraycopy(is, 0, is_152_, 0, i);
	return is_152_;
    }
    
    static short[] method15500(short[] is, int i) {
	short[] is_153_ = new short[i];
	System.arraycopy(is, 0, is_153_, 0, i);
	return is_153_;
    }
    
    static float[] method15501(float[] fs, int i) {
	float[] fs_154_ = new float[i];
	System.arraycopy(fs, 0, fs_154_, 0, i);
	return fs_154_;
    }
    
    public int method3101() {
	return anInt9803;
    }
    
    public void method3012(int i) {
	if (aClass379_9834 != null)
	    aClass379_9834.aBool3923 = Class342.method5991(i, anInt9872);
	if (aClass379_9837 != null)
	    aClass379_9837.aBool3923 = Class342.method5996(i, anInt9872);
	if (aClass379_9835 != null)
	    aClass379_9835.aBool3923 = Class342.method5966(i, anInt9872);
	if (aClass379_9836 != null)
	    aClass379_9836.aBool3923 = Class342.method5970(i, anInt9872);
	anInt9803 = i;
	if (aClass363_9822 != null && (anInt9803 & 0x10000) == 0) {
	    aShortArray9816 = aClass363_9822.aShortArray3722;
	    aShortArray9864 = aClass363_9822.aShortArray3720;
	    aShortArray9869 = aClass363_9822.aShortArray3723;
	    aByteArray9814 = aClass363_9822.aByteArray3721;
	    aClass363_9822 = null;
	}
	aBool9839 = true;
	method15503();
    }
    
    public void method3014() {
	if (anInt9813 > 0 && anInt9824 > 0) {
	    method15517();
	    method15553();
	    method15503();
	}
    }
    
    public Class183 method3011(byte i, int i_155_, boolean bool) {
	boolean bool_156_ = false;
	Class183_Sub3 class183_sub3_157_;
	Class183_Sub3 class183_sub3_158_;
	if (i > 0 && i <= 8) {
	    class183_sub3_158_
		= aClass185_Sub1_9817.aClass183_Sub3Array9290[i - 1];
	    class183_sub3_157_
		= aClass185_Sub1_9817.aClass183_Sub3Array9128[i - 1];
	    bool_156_ = true;
	} else
	    class183_sub3_157_ = class183_sub3_158_
		= new Class183_Sub3(aClass185_Sub1_9817, 0, 0, true, false);
	return method15502(class183_sub3_157_, class183_sub3_158_, i_155_,
			   bool_156_, bool);
    }
    
    Class183 method15502(Class183_Sub3 class183_sub3_159_,
			 Class183_Sub3 class183_sub3_160_, int i, boolean bool,
			 boolean bool_161_) {
	class183_sub3_159_.anInt9803 = i;
	class183_sub3_159_.anInt9872 = anInt9872;
	class183_sub3_159_.aShort9804 = aShort9804;
	class183_sub3_159_.aShort9805 = aShort9805;
	class183_sub3_159_.anInt9806 = anInt9806;
	class183_sub3_159_.anInt9807 = anInt9807;
	class183_sub3_159_.anInt9813 = anInt9813;
	class183_sub3_159_.anInt9823 = anInt9823;
	class183_sub3_159_.anInt9824 = anInt9824;
	class183_sub3_159_.anInt9860 = anInt9860;
	if ((i & 0x100) != 0)
	    class183_sub3_159_.aBool9840 = true;
	else
	    class183_sub3_159_.aBool9840 = aBool9840;
	class183_sub3_159_.aBool9841 = aBool9841;
	boolean bool_162_ = Class342.method5952(i, anInt9872);
	boolean bool_163_ = Class342.method5969(i, anInt9872);
	boolean bool_164_ = Class342.method5954(i, anInt9872);
	boolean bool_165_ = bool_162_ | bool_163_ | bool_164_;
	if (bool_165_) {
	    if (bool_162_) {
		if (class183_sub3_160_.anIntArray9808 == null
		    || class183_sub3_160_.anIntArray9808.length < anInt9806)
		    class183_sub3_159_.anIntArray9808
			= class183_sub3_160_.anIntArray9808
			= new int[anInt9806];
		else
		    class183_sub3_159_.anIntArray9808
			= class183_sub3_160_.anIntArray9808;
	    } else
		class183_sub3_159_.anIntArray9808 = anIntArray9808;
	    if (bool_163_) {
		if (class183_sub3_160_.anIntArray9809 == null
		    || class183_sub3_160_.anIntArray9809.length < anInt9806)
		    class183_sub3_159_.anIntArray9809
			= class183_sub3_160_.anIntArray9809
			= new int[anInt9806];
		else
		    class183_sub3_159_.anIntArray9809
			= class183_sub3_160_.anIntArray9809;
	    } else
		class183_sub3_159_.anIntArray9809 = anIntArray9809;
	    if (bool_164_) {
		if (class183_sub3_160_.anIntArray9828 == null
		    || class183_sub3_160_.anIntArray9828.length < anInt9806)
		    class183_sub3_159_.anIntArray9828
			= class183_sub3_160_.anIntArray9828
			= new int[anInt9806];
		else
		    class183_sub3_159_.anIntArray9828
			= class183_sub3_160_.anIntArray9828;
	    } else
		class183_sub3_159_.anIntArray9828 = anIntArray9828;
	    for (int i_166_ = 0; i_166_ < anInt9806; i_166_++) {
		if (bool_162_)
		    class183_sub3_159_.anIntArray9808[i_166_]
			= anIntArray9808[i_166_];
		if (bool_163_)
		    class183_sub3_159_.anIntArray9809[i_166_]
			= anIntArray9809[i_166_];
		if (bool_164_)
		    class183_sub3_159_.anIntArray9828[i_166_]
			= anIntArray9828[i_166_];
	    }
	} else {
	    class183_sub3_159_.anIntArray9808 = anIntArray9808;
	    class183_sub3_159_.anIntArray9809 = anIntArray9809;
	    class183_sub3_159_.anIntArray9828 = anIntArray9828;
	}
	if (Class342.method5991(i, anInt9872)) {
	    class183_sub3_159_.aClass379_9834
		= class183_sub3_160_.aClass379_9834;
	    class183_sub3_159_.aClass379_9834.anInterface37_3922
		= aClass379_9834.anInterface37_3922;
	    class183_sub3_159_.aClass379_9834.aBool3921
		= aClass379_9834.aBool3921;
	    class183_sub3_159_.aClass379_9834.aBool3923 = true;
	} else if (Class342.method5964(i, anInt9872))
	    class183_sub3_159_.aClass379_9834 = aClass379_9834;
	else
	    class183_sub3_159_.aClass379_9834 = null;
	if (Class342.method5957(i, anInt9872)) {
	    if (class183_sub3_160_.aShortArray9825 == null
		|| class183_sub3_160_.aShortArray9825.length < anInt9823)
		class183_sub3_159_.aShortArray9825
		    = class183_sub3_160_.aShortArray9825
		    = new short[anInt9823];
	    else
		class183_sub3_159_.aShortArray9825
		    = class183_sub3_160_.aShortArray9825;
	    for (int i_167_ = 0; i_167_ < anInt9823; i_167_++)
		class183_sub3_159_.aShortArray9825[i_167_]
		    = aShortArray9825[i_167_];
	} else
	    class183_sub3_159_.aShortArray9825 = aShortArray9825;
	if (Class342.method5958(i, anInt9872)) {
	    if (class183_sub3_160_.aByteArray9826 == null
		|| class183_sub3_160_.aByteArray9826.length < anInt9823)
		class183_sub3_159_.aByteArray9826
		    = class183_sub3_160_.aByteArray9826 = new byte[anInt9823];
	    else
		class183_sub3_159_.aByteArray9826
		    = class183_sub3_160_.aByteArray9826;
	    for (int i_168_ = 0; i_168_ < anInt9823; i_168_++)
		class183_sub3_159_.aByteArray9826[i_168_]
		    = aByteArray9826[i_168_];
	} else
	    class183_sub3_159_.aByteArray9826 = aByteArray9826;
	if (Class342.method5966(i, anInt9872)) {
	    class183_sub3_159_.aClass379_9835
		= class183_sub3_160_.aClass379_9835;
	    class183_sub3_159_.aClass379_9835.anInterface37_3922
		= aClass379_9835.anInterface37_3922;
	    class183_sub3_159_.aClass379_9835.aBool3921
		= aClass379_9835.aBool3921;
	    class183_sub3_159_.aClass379_9835.aBool3923 = true;
	} else if (Class342.method6031(i, anInt9872))
	    class183_sub3_159_.aClass379_9835 = aClass379_9835;
	else
	    class183_sub3_159_.aClass379_9835 = null;
	if (Class342.method6051(i, anInt9872)) {
	    if (class183_sub3_160_.aShortArray9816 == null
		|| class183_sub3_160_.aShortArray9816.length < anInt9813) {
		int i_169_ = anInt9813;
		class183_sub3_159_.aShortArray9816
		    = class183_sub3_160_.aShortArray9816 = new short[i_169_];
		class183_sub3_159_.aShortArray9864
		    = class183_sub3_160_.aShortArray9864 = new short[i_169_];
		class183_sub3_159_.aShortArray9869
		    = class183_sub3_160_.aShortArray9869 = new short[i_169_];
	    } else {
		class183_sub3_159_.aShortArray9816
		    = class183_sub3_160_.aShortArray9816;
		class183_sub3_159_.aShortArray9864
		    = class183_sub3_160_.aShortArray9864;
		class183_sub3_159_.aShortArray9869
		    = class183_sub3_160_.aShortArray9869;
	    }
	    if (aClass363_9822 != null) {
		if (class183_sub3_160_.aClass363_9822 == null)
		    class183_sub3_160_.aClass363_9822 = new Class363();
		Class363 class363 = (class183_sub3_159_.aClass363_9822
				     = class183_sub3_160_.aClass363_9822);
		if (class363.aShortArray3722 == null
		    || class363.aShortArray3722.length < anInt9813) {
		    int i_170_ = anInt9813;
		    class363.aShortArray3722 = new short[i_170_];
		    class363.aShortArray3720 = new short[i_170_];
		    class363.aShortArray3723 = new short[i_170_];
		    class363.aByteArray3721 = new byte[i_170_];
		}
		for (int i_171_ = 0; i_171_ < anInt9813; i_171_++) {
		    class183_sub3_159_.aShortArray9816[i_171_]
			= aShortArray9816[i_171_];
		    class183_sub3_159_.aShortArray9864[i_171_]
			= aShortArray9864[i_171_];
		    class183_sub3_159_.aShortArray9869[i_171_]
			= aShortArray9869[i_171_];
		    class363.aShortArray3722[i_171_]
			= aClass363_9822.aShortArray3722[i_171_];
		    class363.aShortArray3720[i_171_]
			= aClass363_9822.aShortArray3720[i_171_];
		    class363.aShortArray3723[i_171_]
			= aClass363_9822.aShortArray3723[i_171_];
		    class363.aByteArray3721[i_171_]
			= aClass363_9822.aByteArray3721[i_171_];
		}
	    } else {
		class183_sub3_159_.aClass363_9822 = null;
		for (int i_172_ = 0; i_172_ < anInt9813; i_172_++) {
		    class183_sub3_159_.aShortArray9816[i_172_]
			= aShortArray9816[i_172_];
		    class183_sub3_159_.aShortArray9864[i_172_]
			= aShortArray9864[i_172_];
		    class183_sub3_159_.aShortArray9869[i_172_]
			= aShortArray9869[i_172_];
		}
	    }
	    class183_sub3_159_.aByteArray9814 = aByteArray9814;
	} else {
	    class183_sub3_159_.aClass363_9822 = aClass363_9822;
	    class183_sub3_159_.aShortArray9816 = aShortArray9816;
	    class183_sub3_159_.aShortArray9864 = aShortArray9864;
	    class183_sub3_159_.aShortArray9869 = aShortArray9869;
	    class183_sub3_159_.aByteArray9814 = aByteArray9814;
	}
	if (Class342.method5970(i, anInt9872)) {
	    class183_sub3_159_.aClass379_9836
		= class183_sub3_160_.aClass379_9836;
	    class183_sub3_159_.aClass379_9836.anInterface37_3922
		= aClass379_9836.anInterface37_3922;
	    class183_sub3_159_.aClass379_9836.aBool3921
		= aClass379_9836.aBool3921;
	    class183_sub3_159_.aClass379_9836.aBool3923 = true;
	} else if (Class342.method6045(i, anInt9872))
	    class183_sub3_159_.aClass379_9836 = aClass379_9836;
	else
	    class183_sub3_159_.aClass379_9836 = null;
	if (Class342.method6021(i, anInt9872)) {
	    if (class183_sub3_160_.aFloatArray9829 == null
		|| class183_sub3_160_.aFloatArray9829.length < anInt9823) {
		int i_173_ = anInt9813;
		class183_sub3_159_.aFloatArray9829
		    = class183_sub3_160_.aFloatArray9829 = new float[i_173_];
		class183_sub3_159_.aFloatArray9821
		    = class183_sub3_160_.aFloatArray9821 = new float[i_173_];
	    } else {
		class183_sub3_159_.aFloatArray9829
		    = class183_sub3_160_.aFloatArray9829;
		class183_sub3_159_.aFloatArray9821
		    = class183_sub3_160_.aFloatArray9821;
	    }
	    for (int i_174_ = 0; i_174_ < anInt9813; i_174_++) {
		class183_sub3_159_.aFloatArray9829[i_174_]
		    = aFloatArray9829[i_174_];
		class183_sub3_159_.aFloatArray9821[i_174_]
		    = aFloatArray9821[i_174_];
	    }
	} else {
	    class183_sub3_159_.aFloatArray9829 = aFloatArray9829;
	    class183_sub3_159_.aFloatArray9821 = aFloatArray9821;
	}
	if (Class342.method5996(i, anInt9872)) {
	    class183_sub3_159_.aClass379_9837
		= class183_sub3_160_.aClass379_9837;
	    class183_sub3_159_.aClass379_9837.anInterface37_3922
		= aClass379_9837.anInterface37_3922;
	    class183_sub3_159_.aClass379_9837.aBool3921
		= aClass379_9837.aBool3921;
	    class183_sub3_159_.aClass379_9837.aBool3923 = true;
	} else if (Class342.method5967(i, anInt9872))
	    class183_sub3_159_.aClass379_9837 = aClass379_9837;
	else
	    class183_sub3_159_.aClass379_9837 = null;
	if (Class342.method5960(i, anInt9872)) {
	    if (class183_sub3_160_.aShortArray9847 == null
		|| class183_sub3_160_.aShortArray9847.length < anInt9823) {
		int i_175_ = anInt9823;
		class183_sub3_159_.aShortArray9847
		    = class183_sub3_160_.aShortArray9847 = new short[i_175_];
		class183_sub3_159_.aShortArray9845
		    = class183_sub3_160_.aShortArray9845 = new short[i_175_];
		class183_sub3_159_.aShortArray9843
		    = class183_sub3_160_.aShortArray9843 = new short[i_175_];
	    } else {
		class183_sub3_159_.aShortArray9847
		    = class183_sub3_160_.aShortArray9847;
		class183_sub3_159_.aShortArray9845
		    = class183_sub3_160_.aShortArray9845;
		class183_sub3_159_.aShortArray9843
		    = class183_sub3_160_.aShortArray9843;
	    }
	    for (int i_176_ = 0; i_176_ < anInt9823; i_176_++) {
		class183_sub3_159_.aShortArray9847[i_176_]
		    = aShortArray9847[i_176_];
		class183_sub3_159_.aShortArray9845[i_176_]
		    = aShortArray9845[i_176_];
		class183_sub3_159_.aShortArray9843[i_176_]
		    = aShortArray9843[i_176_];
	    }
	} else {
	    class183_sub3_159_.aShortArray9847 = aShortArray9847;
	    class183_sub3_159_.aShortArray9845 = aShortArray9845;
	    class183_sub3_159_.aShortArray9843 = aShortArray9843;
	}
	if (Class342.method5973(i, anInt9872)) {
	    class183_sub3_159_.aClass335_9833
		= class183_sub3_160_.aClass335_9833;
	    class183_sub3_159_.aClass335_9833.anInterface39_3515
		= aClass335_9833.anInterface39_3515;
	    class183_sub3_159_.aClass335_9833.aBool3516
		= aClass335_9833.aBool3516;
	    class183_sub3_159_.aClass335_9833.aBool3514 = true;
	} else if (Class342.method5965(i, anInt9872))
	    class183_sub3_159_.aClass335_9833 = aClass335_9833;
	else
	    class183_sub3_159_.aClass335_9833 = null;
	if (Class342.method6030(i, anInt9872)) {
	    if (class183_sub3_160_.aShortArray9830 == null
		|| class183_sub3_160_.aShortArray9830.length < anInt9823) {
		int i_177_ = anInt9823;
		class183_sub3_159_.aShortArray9830
		    = class183_sub3_160_.aShortArray9830 = new short[i_177_];
	    } else
		class183_sub3_159_.aShortArray9830
		    = class183_sub3_160_.aShortArray9830;
	    for (int i_178_ = 0; i_178_ < anInt9823; i_178_++)
		class183_sub3_159_.aShortArray9830[i_178_]
		    = aShortArray9830[i_178_];
	} else
	    class183_sub3_159_.aShortArray9830 = aShortArray9830;
	if (Class342.method5962(i, anInt9872)) {
	    if (class183_sub3_160_.aClass339Array9862 == null
		|| class183_sub3_160_.aClass339Array9862.length < anInt9860) {
		int i_179_ = anInt9860;
		class183_sub3_159_.aClass339Array9862
		    = class183_sub3_160_.aClass339Array9862
		    = new Class339[i_179_];
		for (int i_180_ = 0; i_180_ < anInt9860; i_180_++)
		    class183_sub3_159_.aClass339Array9862[i_180_]
			= aClass339Array9862[i_180_].method5933();
	    } else {
		class183_sub3_159_.aClass339Array9862
		    = class183_sub3_160_.aClass339Array9862;
		for (int i_181_ = 0; i_181_ < anInt9860; i_181_++)
		    class183_sub3_159_.aClass339Array9862[i_181_]
			.method5935(aClass339Array9862[i_181_]);
	    }
	} else
	    class183_sub3_159_.aClass339Array9862 = aClass339Array9862;
	class183_sub3_159_.aClass368Array9861 = aClass368Array9861;
	if (aBool9850) {
	    class183_sub3_159_.anInt9842 = anInt9842;
	    class183_sub3_159_.anInt9868 = anInt9868;
	    class183_sub3_159_.anInt9865 = anInt9865;
	    class183_sub3_159_.anInt9848 = anInt9848;
	    class183_sub3_159_.anInt9799 = anInt9799;
	    class183_sub3_159_.anInt9846 = anInt9846;
	    class183_sub3_159_.anInt9849 = anInt9849;
	    class183_sub3_159_.anInt9866 = anInt9866;
	    class183_sub3_159_.aBool9850 = true;
	} else
	    class183_sub3_159_.aBool9850 = false;
	if (aBool9851) {
	    class183_sub3_159_.anInt9844 = anInt9844;
	    class183_sub3_159_.aBool9851 = true;
	} else
	    class183_sub3_159_.aBool9851 = false;
	class183_sub3_159_.anIntArrayArray9819 = anIntArrayArray9819;
	class183_sub3_159_.anIntArrayArray9831 = anIntArrayArray9831;
	class183_sub3_159_.anIntArrayArray9856 = anIntArrayArray9856;
	class183_sub3_159_.aShortArray9863 = aShortArray9863;
	class183_sub3_159_.anIntArray9853 = anIntArray9853;
	class183_sub3_159_.aShortArray9801 = aShortArray9801;
	class183_sub3_159_.aShortArray9815 = aShortArray9815;
	class183_sub3_159_.aShortArray9812 = aShortArray9812;
	class183_sub3_159_.aShortArray9832 = aShortArray9832;
	class183_sub3_159_.anIntArray9827 = anIntArray9827;
	class183_sub3_159_.anIntArray9855 = anIntArray9855;
	class183_sub3_159_.anIntArray9854 = anIntArray9854;
	class183_sub3_159_.aClass172Array9858 = aClass172Array9858;
	class183_sub3_159_.aClass158Array9859 = aClass158Array9859;
	return class183_sub3_159_;
    }
    
    void method15503() {
	if (aBool9839) {
	    aBool9839 = false;
	    if (aClass172Array9858 == null && aClass158Array9859 == null
		&& aClass368Array9861 == null
		&& !Class342.method5956(anInt9803, anInt9872)) {
		boolean bool = false;
		boolean bool_182_ = false;
		boolean bool_183_ = false;
		if (anIntArray9808 != null
		    && !Class342.method5974(anInt9803, anInt9872)) {
		    if (aClass379_9834 == null
			|| aClass379_9834.method6422()) {
			if (!aBool9850)
			    method15507();
			bool = true;
		    } else
			aBool9839 = true;
		}
		if (anIntArray9809 != null
		    && !Class342.method5975(anInt9803, anInt9872)) {
		    if (aClass379_9834 == null
			|| aClass379_9834.method6422()) {
			if (!aBool9850)
			    method15507();
			bool_182_ = true;
		    } else
			aBool9839 = true;
		}
		if (anIntArray9828 != null
		    && !Class342.method5976(anInt9803, anInt9872)) {
		    if (aClass379_9834 == null
			|| aClass379_9834.method6422()) {
			if (!aBool9850)
			    method15507();
			bool_183_ = true;
		    } else
			aBool9839 = true;
		}
		if (bool)
		    anIntArray9808 = null;
		if (bool_182_)
		    anIntArray9809 = null;
		if (bool_183_)
		    anIntArray9828 = null;
	    }
	    if (aShortArray9863 != null && anIntArray9808 == null
		&& anIntArray9809 == null && anIntArray9828 == null) {
		aShortArray9863 = null;
		anIntArray9853 = null;
	    }
	while_58_:
	    do {
		if (aByteArray9814 != null
		    && !Class342.method5977(anInt9803, anInt9872)) {
		    do {
			if ((anInt9872 & 0x37) != 0) {
			    if (aClass379_9836 != null
				&& !aClass379_9836.method6422())
				break;
			} else if (aClass379_9835 != null
				   && !aClass379_9835.method6422())
			    break;
			aShortArray9869 = null;
			aShortArray9864 = null;
			aShortArray9816 = null;
			aByteArray9814 = null;
			break while_58_;
		    } while (false);
		    aBool9839 = true;
		}
	    } while (false);
	    if (aShortArray9825 != null
		&& !Class342.method5978(anInt9803, anInt9872)) {
		if (aClass379_9835 == null || aClass379_9835.method6422())
		    aShortArray9825 = null;
		else
		    aBool9839 = true;
	    }
	    if (aByteArray9826 != null
		&& !Class342.method5979(anInt9803, anInt9872)) {
		if (aClass379_9835 == null || aClass379_9835.method6422())
		    aByteArray9826 = null;
		else
		    aBool9839 = true;
	    }
	    if (aFloatArray9829 != null
		&& !Class342.method5995(anInt9803, anInt9872)) {
		if (aClass379_9837 == null || aClass379_9837.method6422()) {
		    aFloatArray9821 = null;
		    aFloatArray9829 = null;
		} else
		    aBool9839 = true;
	    }
	    if (aShortArray9830 != null
		&& !Class342.method5985(anInt9803, anInt9872)) {
		if (aClass379_9835 == null || aClass379_9835.method6422())
		    aShortArray9830 = null;
		else
		    aBool9839 = true;
	    }
	    if (aShortArray9847 != null
		&& !Class342.method6036(anInt9803, anInt9872)) {
		if ((aClass335_9833 == null || aClass335_9833.method5897())
		    && (aClass379_9835 == null
			|| aClass379_9835.method6422())) {
		    aShortArray9843 = null;
		    aShortArray9845 = null;
		    aShortArray9847 = null;
		} else
		    aBool9839 = true;
	    }
	    if (aShortArray9801 != null) {
		if (aClass379_9834 == null || aClass379_9834.method6422())
		    aShortArray9801 = null;
		else
		    aBool9839 = true;
	    }
	    if (aShortArray9815 != null) {
		if (aClass379_9835 == null || aClass379_9835.method6422())
		    aShortArray9815 = null;
		else
		    aBool9839 = true;
	    }
	    if (anIntArrayArray9831 != null
		&& !Class342.method5981(anInt9803, anInt9872)) {
		anIntArrayArray9831 = null;
		aShortArray9832 = null;
	    }
	    if (anIntArrayArray9819 != null
		&& !Class342.method5971(anInt9803, anInt9872)) {
		anIntArrayArray9819 = null;
		aShortArray9812 = null;
	    }
	    if (anIntArrayArray9856 != null
		&& !Class342.method5983(anInt9803, anInt9872))
		anIntArrayArray9856 = null;
	    if (anIntArray9827 != null && (anInt9803 & 0x800) == 0
		&& (anInt9803 & 0x40000) == 0) {
		anIntArray9827 = null;
		anIntArray9855 = null;
		anIntArray9854 = null;
	    }
	}
    }
    
    public int method3042() {
	if (!aBool9850)
	    method15507();
	return anInt9842;
    }
    
    void method15504() {
	if (aClass379_9835 != null)
	    aClass379_9835.aBool3921 = false;
    }
    
    void method15505() {
	if ((anInt9872 & 0x37) != 0) {
	    if (aClass379_9836 != null)
		aClass379_9836.aBool3921 = false;
	} else if (aClass379_9835 != null)
	    aClass379_9835.aBool3921 = false;
    }
    
    public Class183 method3071(byte i, int i_184_, boolean bool) {
	boolean bool_185_ = false;
	Class183_Sub3 class183_sub3_186_;
	Class183_Sub3 class183_sub3_187_;
	if (i > 0 && i <= 8) {
	    class183_sub3_187_
		= aClass185_Sub1_9817.aClass183_Sub3Array9290[i - 1];
	    class183_sub3_186_
		= aClass185_Sub1_9817.aClass183_Sub3Array9128[i - 1];
	    bool_185_ = true;
	} else
	    class183_sub3_186_ = class183_sub3_187_
		= new Class183_Sub3(aClass185_Sub1_9817, 0, 0, true, false);
	return method15502(class183_sub3_186_, class183_sub3_187_, i_184_,
			   bool_185_, bool);
    }
    
    public void method3015(int i) {
	int i_188_ = Class427.anIntArray4806[i];
	int i_189_ = Class427.anIntArray4805[i];
	for (int i_190_ = 0; i_190_ < anInt9807; i_190_++) {
	    int i_191_ = ((anIntArray9828[i_190_] * i_188_
			   + anIntArray9808[i_190_] * i_189_)
			  >> 14);
	    anIntArray9828[i_190_] = (anIntArray9828[i_190_] * i_189_
				      - anIntArray9808[i_190_] * i_188_) >> 14;
	    anIntArray9808[i_190_] = i_191_;
	}
	method15509();
	aBool9850 = false;
    }
    
    public void method3016(int i) {
	int i_192_ = Class427.anIntArray4806[i];
	int i_193_ = Class427.anIntArray4805[i];
	for (int i_194_ = 0; i_194_ < anInt9807; i_194_++) {
	    int i_195_ = ((anIntArray9828[i_194_] * i_192_
			   + anIntArray9808[i_194_] * i_193_)
			  >> 14);
	    anIntArray9828[i_194_] = (anIntArray9828[i_194_] * i_193_
				      - anIntArray9808[i_194_] * i_192_) >> 14;
	    anIntArray9808[i_194_] = i_195_;
	}
	for (int i_196_ = 0; i_196_ < anInt9813; i_196_++) {
	    int i_197_ = ((aShortArray9869[i_196_] * i_192_
			   + aShortArray9816[i_196_] * i_193_)
			  >> 14);
	    aShortArray9869[i_196_]
		= (short) ((aShortArray9869[i_196_] * i_193_
			    - aShortArray9816[i_196_] * i_192_)
			   >> 14);
	    aShortArray9816[i_196_] = (short) i_197_;
	}
	method15509();
	method15505();
	aBool9850 = false;
    }
    
    public int method3129() {
	if (!aBool9850)
	    method15507();
	return anInt9842;
    }
    
    public void method3018(int i) {
	int i_198_ = Class427.anIntArray4806[i];
	int i_199_ = Class427.anIntArray4805[i];
	for (int i_200_ = 0; i_200_ < anInt9807; i_200_++) {
	    int i_201_ = ((anIntArray9809[i_200_] * i_198_
			   + anIntArray9808[i_200_] * i_199_)
			  >> 14);
	    anIntArray9809[i_200_] = (anIntArray9809[i_200_] * i_199_
				      - anIntArray9808[i_200_] * i_198_) >> 14;
	    anIntArray9808[i_200_] = i_201_;
	}
	method15509();
	aBool9850 = false;
    }
    
    public void method3098(int i, int i_202_, int i_203_) {
	for (int i_204_ = 0; i_204_ < anInt9807; i_204_++) {
	    if (i != 0)
		anIntArray9808[i_204_] += i;
	    if (i_202_ != 0)
		anIntArray9809[i_204_] += i_202_;
	    if (i_203_ != 0)
		anIntArray9828[i_204_] += i_203_;
	}
	method15509();
	aBool9850 = false;
    }
    
    boolean method15506(int i, int i_205_, int i_206_, int i_207_, int i_208_,
			int i_209_, int i_210_, int i_211_, int i_212_,
			int i_213_) {
	if (i_207_ < i_208_ && i_207_ < i_209_ && i_207_ < i_210_)
	    return false;
	if (i_205_ > i_208_ && i_205_ > i_209_ && i_205_ > i_210_)
	    return false;
	if (i_206_ < i_211_ && i_206_ < i_212_ && i_206_ < i_213_)
	    return false;
	if (i > i_211_ && i > i_212_ && i > i_213_)
	    return false;
	return true;
    }
    
    public void method3146(int i) {
	aShort9804 = (short) i;
	method15504();
    }
    
    public void method3022(int i, int i_214_, Class151 class151,
			   Class151 class151_215_, int i_216_, int i_217_,
			   int i_218_) {
	if (!aBool9850)
	    method15507();
	int i_219_ = i_216_ + anInt9865;
	int i_220_ = i_216_ + anInt9848;
	int i_221_ = i_218_ + anInt9849;
	int i_222_ = i_218_ + anInt9866;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_219_ >= 0
		&& ((i_220_ + class151.anInt1702 * 127780559
		     >> class151.anInt1703 * -1495101509)
		    < class151.anInt1701 * -1924295585)
		&& i_221_ >= 0
		&& ((i_222_ + class151.anInt1702 * 127780559
		     >> class151.anInt1703 * -1495101509)
		    < class151.anInt1700 * -1466328823))) {
	    if (i == 4 || i == 5) {
		if (class151_215_ == null
		    || (i_219_ < 0
			|| ((i_220_ + class151_215_.anInt1702 * 127780559
			     >> class151_215_.anInt1703 * -1495101509)
			    >= class151_215_.anInt1701 * -1924295585)
			|| i_221_ < 0
			|| ((i_222_ + class151_215_.anInt1702 * 127780559
			     >> class151_215_.anInt1703 * -1495101509)
			    >= class151_215_.anInt1700 * -1466328823)))
		    return;
	    } else {
		i_219_ >>= class151.anInt1703 * -1495101509;
		i_220_ = (i_220_ + (class151.anInt1702 * 127780559 - 1)
			  >> class151.anInt1703 * -1495101509);
		i_221_ >>= class151.anInt1703 * -1495101509;
		i_222_ = (i_222_ + (class151.anInt1702 * 127780559 - 1)
			  >> class151.anInt1703 * -1495101509);
		if (class151.method2491(i_219_, i_221_, 1074349108) == i_217_
		    && class151.method2491(i_220_, i_221_, 757696553) == i_217_
		    && class151.method2491(i_219_, i_222_, 661680675) == i_217_
		    && (class151.method2491(i_220_, i_222_, -1136286243)
			== i_217_))
		    return;
	    }
	    if (i == 1) {
		for (int i_223_ = 0; i_223_ < anInt9807; i_223_++)
		    anIntArray9809[i_223_]
			= (anIntArray9809[i_223_]
			   + class151.method2521((anIntArray9808[i_223_]
						  + i_216_),
						 (anIntArray9828[i_223_]
						  + i_218_),
						 -1207511047)
			   - i_217_);
	    } else if (i == 2) {
		int i_224_ = anInt9799;
		if (i_224_ == 0)
		    return;
		for (int i_225_ = 0; i_225_ < anInt9807; i_225_++) {
		    int i_226_ = (anIntArray9809[i_225_] << 16) / i_224_;
		    if (i_226_ < i_214_)
			anIntArray9809[i_225_]
			    = (anIntArray9809[i_225_]
			       + (class151.method2521((anIntArray9808[i_225_]
						       + i_216_),
						      (anIntArray9828[i_225_]
						       + i_218_),
						      -1009321815)
				  - i_217_) * (i_214_ - i_226_) / i_214_);
		}
	    } else if (i == 3) {
		int i_227_ = (i_214_ & 0xff) * 16;
		int i_228_ = (i_214_ >> 8 & 0xff) * 16;
		int i_229_ = (i_214_ >> 16 & 0xff) << 6;
		int i_230_ = (i_214_ >> 24 & 0xff) << 6;
		if (i_216_ - (i_227_ >> 1) < 0
		    || (i_216_ + (i_227_ >> 1) + class151.anInt1702 * 127780559
			>= (class151.anInt1701 * -1924295585
			    << class151.anInt1703 * -1495101509))
		    || i_218_ - (i_228_ >> 1) < 0
		    || (i_218_ + (i_228_ >> 1) + class151.anInt1702 * 127780559
			>= (class151.anInt1700 * -1466328823
			    << class151.anInt1703 * -1495101509)))
		    return;
		method3115(class151, i_216_, i_217_, i_218_, i_227_, i_228_,
			   i_229_, i_230_);
	    } else if (i == 4) {
		int i_231_ = anInt9846 - anInt9799;
		for (int i_232_ = 0; i_232_ < anInt9807; i_232_++)
		    anIntArray9809[i_232_]
			= (anIntArray9809[i_232_]
			   + (class151_215_.method2521((anIntArray9808[i_232_]
							+ i_216_),
						       (anIntArray9828[i_232_]
							+ i_218_),
						       -1302088711)
			      - i_217_)
			   + i_231_);
	    } else if (i == 5) {
		int i_233_ = anInt9846 - anInt9799;
		for (int i_234_ = 0; i_234_ < anInt9807; i_234_++) {
		    int i_235_ = anIntArray9808[i_234_] + i_216_;
		    int i_236_ = anIntArray9828[i_234_] + i_218_;
		    int i_237_
			= class151.method2521(i_235_, i_236_, -1120813765);
		    int i_238_
			= class151_215_.method2521(i_235_, i_236_, -491576276);
		    int i_239_ = i_237_ - i_238_ - i_214_;
		    anIntArray9809[i_234_]
			= ((anIntArray9809[i_234_] << 8) / i_233_ * i_239_
			   >> 8) - (i_217_ - i_237_);
		}
	    }
	    method15509();
	    aBool9850 = false;
	}
    }
    
    void method15507() {
	int i = 32767;
	int i_240_ = 32767;
	int i_241_ = 32767;
	int i_242_ = -32768;
	int i_243_ = -32768;
	int i_244_ = -32768;
	int i_245_ = 0;
	int i_246_ = 0;
	for (int i_247_ = 0; i_247_ < anInt9807; i_247_++) {
	    int i_248_ = anIntArray9808[i_247_];
	    int i_249_ = anIntArray9809[i_247_];
	    int i_250_ = anIntArray9828[i_247_];
	    if (i_248_ < i)
		i = i_248_;
	    if (i_248_ > i_242_)
		i_242_ = i_248_;
	    if (i_249_ < i_240_)
		i_240_ = i_249_;
	    if (i_249_ > i_243_)
		i_243_ = i_249_;
	    if (i_250_ < i_241_)
		i_241_ = i_250_;
	    if (i_250_ > i_244_)
		i_244_ = i_250_;
	    int i_251_ = i_248_ * i_248_ + i_250_ * i_250_;
	    if (i_251_ > i_245_)
		i_245_ = i_251_;
	    i_251_ = i_248_ * i_248_ + i_250_ * i_250_ + i_249_ * i_249_;
	    if (i_251_ > i_246_)
		i_246_ = i_251_;
	}
	anInt9865 = i;
	anInt9848 = i_242_;
	anInt9799 = i_240_;
	anInt9846 = i_243_;
	anInt9849 = i_241_;
	anInt9866 = i_244_;
	anInt9868 = (int) (Math.sqrt((double) i_245_) + 0.99);
	anInt9842 = (int) (Math.sqrt((double) i_246_) + 0.99);
	aBool9850 = true;
    }
    
    public void method3050() {
	if (!aBool9851) {
	    if (!aBool9850)
		method15507();
	    anInt9844 = anInt9799;
	    aBool9851 = true;
	}
    }
    
    public int method3041() {
	if (!aBool9850)
	    method15507();
	return anInt9868;
    }
    
    public boolean method3062() {
	return aBool9841;
    }
    
    public int method3134() {
	if (!aBool9850)
	    method15507();
	return anInt9865;
    }
    
    public int method3043() {
	if (!aBool9850)
	    method15507();
	return anInt9848;
    }
    
    public void method3079(int i) {
	int i_252_ = Class427.anIntArray4806[i];
	int i_253_ = Class427.anIntArray4805[i];
	for (int i_254_ = 0; i_254_ < anInt9807; i_254_++) {
	    int i_255_ = ((anIntArray9828[i_254_] * i_252_
			   + anIntArray9808[i_254_] * i_253_)
			  >> 14);
	    anIntArray9828[i_254_] = (anIntArray9828[i_254_] * i_253_
				      - anIntArray9808[i_254_] * i_252_) >> 14;
	    anIntArray9808[i_254_] = i_255_;
	}
	method15509();
	aBool9850 = false;
    }
    
    public int method3046() {
	if (!aBool9850)
	    method15507();
	return anInt9846;
    }
    
    void method15508(Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2) {
	if (anIntArray9820.length < anInt9813) {
	    anIntArray9820 = new int[anInt9813];
	    anIntArray9867 = new int[anInt9813];
	}
	for (int i = 0; i < anInt9807; i++) {
	    int i_256_
		= (((anIntArray9808[i]
		     - (anIntArray9809[i] * aClass185_Sub1_9817.anInt9213
			>> 8))
		    >> aClass185_Sub1_9817.anInt9212)
		   - class534_sub18_sub16_sub2.anInt12123);
	    int i_257_
		= (((anIntArray9828[i]
		     - (anIntArray9809[i] * aClass185_Sub1_9817.anInt9287
			>> 8))
		    >> aClass185_Sub1_9817.anInt9212)
		   - class534_sub18_sub16_sub2.anInt12121);
	    int i_258_ = anIntArray9853[i];
	    int i_259_ = anIntArray9853[i + 1];
	    for (int i_260_ = i_258_;
		 i_260_ < i_259_ && aShortArray9863[i_260_] != 0; i_260_++) {
		int i_261_ = (aShortArray9863[i_260_] & 0xffff) - 1;
		anIntArray9820[i_261_] = i_256_;
		anIntArray9867[i_261_] = i_257_;
	    }
	}
	for (int i = 0; i < anInt9824; i++) {
	    if (aByteArray9826 == null || aByteArray9826[i] <= 128) {
		int i_262_ = aShortArray9847[i] & 0xffff;
		int i_263_ = aShortArray9845[i] & 0xffff;
		int i_264_ = aShortArray9843[i] & 0xffff;
		int i_265_ = anIntArray9820[i_262_];
		int i_266_ = anIntArray9820[i_263_];
		int i_267_ = anIntArray9820[i_264_];
		int i_268_ = anIntArray9867[i_262_];
		int i_269_ = anIntArray9867[i_263_];
		int i_270_ = anIntArray9867[i_264_];
		if (((i_265_ - i_266_) * (i_269_ - i_270_)
		     - (i_269_ - i_268_) * (i_267_ - i_266_))
		    > 0)
		    class534_sub18_sub16_sub2.method18755(i_268_, i_269_,
							  i_270_, i_265_,
							  i_266_, i_267_);
	    }
	}
    }
    
    public int method3038() {
	if (!aBool9850)
	    method15507();
	return anInt9866;
    }
    
    public int method3049() {
	if (!aBool9851)
	    method3050();
	return anInt9844;
    }
    
    public void method3077(Class183 class183, int i, int i_271_, int i_272_,
			   boolean bool) {
	Class183_Sub3 class183_sub3_273_ = (Class183_Sub3) class183;
	if (anInt9823 != 0 && class183_sub3_273_.anInt9823 != 0) {
	    int i_274_ = class183_sub3_273_.anInt9807;
	    int[] is = class183_sub3_273_.anIntArray9808;
	    int[] is_275_ = class183_sub3_273_.anIntArray9809;
	    int[] is_276_ = class183_sub3_273_.anIntArray9828;
	    short[] is_277_ = class183_sub3_273_.aShortArray9816;
	    short[] is_278_ = class183_sub3_273_.aShortArray9864;
	    short[] is_279_ = class183_sub3_273_.aShortArray9869;
	    byte[] is_280_ = class183_sub3_273_.aByteArray9814;
	    short[] is_281_;
	    short[] is_282_;
	    short[] is_283_;
	    byte[] is_284_;
	    if (aClass363_9822 != null) {
		is_281_ = aClass363_9822.aShortArray3722;
		is_282_ = aClass363_9822.aShortArray3720;
		is_283_ = aClass363_9822.aShortArray3723;
		is_284_ = aClass363_9822.aByteArray3721;
	    } else {
		is_281_ = null;
		is_282_ = null;
		is_283_ = null;
		is_284_ = null;
	    }
	    short[] is_285_;
	    short[] is_286_;
	    short[] is_287_;
	    byte[] is_288_;
	    if (class183_sub3_273_.aClass363_9822 != null) {
		is_285_ = class183_sub3_273_.aClass363_9822.aShortArray3722;
		is_286_ = class183_sub3_273_.aClass363_9822.aShortArray3720;
		is_287_ = class183_sub3_273_.aClass363_9822.aShortArray3723;
		is_288_ = class183_sub3_273_.aClass363_9822.aByteArray3721;
	    } else {
		is_285_ = null;
		is_286_ = null;
		is_287_ = null;
		is_288_ = null;
	    }
	    int[] is_289_ = class183_sub3_273_.anIntArray9853;
	    short[] is_290_ = class183_sub3_273_.aShortArray9863;
	    if (!class183_sub3_273_.aBool9850)
		class183_sub3_273_.method15507();
	    int i_291_ = class183_sub3_273_.anInt9799;
	    int i_292_ = class183_sub3_273_.anInt9846;
	    int i_293_ = class183_sub3_273_.anInt9865;
	    int i_294_ = class183_sub3_273_.anInt9848;
	    int i_295_ = class183_sub3_273_.anInt9849;
	    int i_296_ = class183_sub3_273_.anInt9866;
	    for (int i_297_ = 0; i_297_ < anInt9807; i_297_++) {
		int i_298_ = anIntArray9809[i_297_] - i_271_;
		if (i_298_ >= i_291_ && i_298_ <= i_292_) {
		    int i_299_ = anIntArray9808[i_297_] - i;
		    if (i_299_ >= i_293_ && i_299_ <= i_294_) {
			int i_300_ = anIntArray9828[i_297_] - i_272_;
			if (i_300_ >= i_295_ && i_300_ <= i_296_) {
			    int i_301_ = -1;
			    int i_302_ = anIntArray9853[i_297_];
			    int i_303_ = anIntArray9853[i_297_ + 1];
			    for (int i_304_ = i_302_;
				 (i_304_ < i_303_
				  && aShortArray9863[i_304_] != 0);
				 i_304_++) {
				i_301_
				    = (aShortArray9863[i_304_] & 0xffff) - 1;
				if (aByteArray9814[i_301_] != 0)
				    break;
			    }
			    if (i_301_ != -1) {
				for (int i_305_ = 0; i_305_ < i_274_;
				     i_305_++) {
				    if (i_299_ == is[i_305_]
					&& i_300_ == is_276_[i_305_]
					&& i_298_ == is_275_[i_305_]) {
					int i_306_ = -1;
					i_302_ = is_289_[i_305_];
					i_303_ = is_289_[i_305_ + 1];
					for (int i_307_ = i_302_;
					     (i_307_ < i_303_
					      && is_290_[i_307_] != 0);
					     i_307_++) {
					    i_306_
						= is_290_[i_307_] - 1 & 0xffff;
					    if (is_280_[i_306_] != 0)
						break;
					}
					if (i_306_ != -1) {
					    if (is_281_ == null) {
						aClass363_9822
						    = new Class363();
						is_281_
						    = aClass363_9822
							  .aShortArray3722
						    = (Class534_Sub42
							   .method16820
						       (aShortArray9816,
							(byte) 2));
						is_282_
						    = aClass363_9822
							  .aShortArray3720
						    = (Class534_Sub42
							   .method16820
						       (aShortArray9864,
							(byte) 2));
						is_283_
						    = aClass363_9822
							  .aShortArray3723
						    = (Class534_Sub42
							   .method16820
						       (aShortArray9869,
							(byte) 2));
						is_284_
						    = aClass363_9822
							  .aByteArray3721
						    = (Class586.method9861
						       (aByteArray9814,
							-16711936));
					    }
					    if (is_285_ == null) {
						Class363 class363
						    = (class183_sub3_273_
							   .aClass363_9822
						       = new Class363());
						is_285_
						    = class363.aShortArray3722
						    = (Class534_Sub42
							   .method16820
						       (is_277_, (byte) 2));
						is_286_
						    = class363.aShortArray3720
						    = (Class534_Sub42
							   .method16820
						       (is_278_, (byte) 2));
						is_287_
						    = class363.aShortArray3723
						    = (Class534_Sub42
							   .method16820
						       (is_279_, (byte) 2));
						is_288_
						    = class363.aByteArray3721
						    = (Class586.method9861
						       (is_280_, -16711936));
					    }
					    short i_308_
						= aShortArray9816[i_301_];
					    short i_309_
						= aShortArray9864[i_301_];
					    short i_310_
						= aShortArray9869[i_301_];
					    byte i_311_
						= aByteArray9814[i_301_];
					    i_302_ = is_289_[i_305_];
					    i_303_ = is_289_[i_305_ + 1];
					    for (int i_312_ = i_302_;
						 i_312_ < i_303_; i_312_++) {
						int i_313_
						    = is_290_[i_312_] - 1;
						if (i_313_ == -1)
						    break;
						if (is_288_[i_313_] != 0) {
						    is_285_[i_313_] += i_308_;
						    is_286_[i_313_] += i_309_;
						    is_287_[i_313_] += i_310_;
						    is_288_[i_313_] += i_311_;
						}
					    }
					    i_308_ = is_277_[i_306_];
					    i_309_ = is_278_[i_306_];
					    i_310_ = is_279_[i_306_];
					    i_311_ = is_280_[i_306_];
					    i_302_ = anIntArray9853[i_297_];
					    i_303_
						= anIntArray9853[i_297_ + 1];
					    for (int i_314_ = i_302_;
						 (i_314_ < i_303_
						  && (aShortArray9863[i_314_]
						      != 0));
						 i_314_++) {
						int i_315_
						    = ((aShortArray9863[i_314_]
							& 0xffff)
						       - 1);
						if (is_284_[i_315_] != 0) {
						    is_281_[i_315_] += i_308_;
						    is_282_[i_315_] += i_309_;
						    is_283_[i_315_] += i_310_;
						    is_284_[i_315_] += i_311_;
						}
					    }
					    class183_sub3_273_.method15505();
					    method15505();
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method3051(int i) {
	aShort9804 = (short) i;
	method15504();
    }
    
    public void method3120(int i) {
	aShort9805 = (short) i;
	method15509();
	method15505();
    }
    
    public int method3053() {
	return aShort9804;
    }
    
    public int method3054() {
	return aShort9805;
    }
    
    public Class534_Sub18_Sub16 method3040
	(Class534_Sub18_Sub16 class534_sub18_sub16) {
	if (anInt9813 == 0)
	    return null;
	if (!aBool9850)
	    method15507();
	int i;
	int i_316_;
	if (aClass185_Sub1_9817.anInt9213 > 0) {
	    i = (anInt9865 - (anInt9846 * aClass185_Sub1_9817.anInt9213 >> 8)
		 >> aClass185_Sub1_9817.anInt9212);
	    i_316_ = anInt9848 - (anInt9799 * aClass185_Sub1_9817.anInt9213
				  >> 8) >> aClass185_Sub1_9817.anInt9212;
	} else {
	    i = (anInt9865 - (anInt9799 * aClass185_Sub1_9817.anInt9213 >> 8)
		 >> aClass185_Sub1_9817.anInt9212);
	    i_316_ = anInt9848 - (anInt9846 * aClass185_Sub1_9817.anInt9213
				  >> 8) >> aClass185_Sub1_9817.anInt9212;
	}
	int i_317_;
	int i_318_;
	if (aClass185_Sub1_9817.anInt9287 > 0) {
	    i_317_ = anInt9849 - (anInt9846 * aClass185_Sub1_9817.anInt9287
				  >> 8) >> aClass185_Sub1_9817.anInt9212;
	    i_318_ = anInt9866 - (anInt9799 * aClass185_Sub1_9817.anInt9287
				  >> 8) >> aClass185_Sub1_9817.anInt9212;
	} else {
	    i_317_ = anInt9849 - (anInt9799 * aClass185_Sub1_9817.anInt9287
				  >> 8) >> aClass185_Sub1_9817.anInt9212;
	    i_318_ = anInt9866 - (anInt9846 * aClass185_Sub1_9817.anInt9287
				  >> 8) >> aClass185_Sub1_9817.anInt9212;
	}
	int i_319_ = i_316_ - i + 1;
	int i_320_ = i_318_ - i_317_ + 1;
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2
	    = (Class534_Sub18_Sub16_Sub2) class534_sub18_sub16;
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2_321_;
	if (class534_sub18_sub16_sub2 != null
	    && class534_sub18_sub16_sub2.method18753(i_319_, i_320_)) {
	    class534_sub18_sub16_sub2_321_ = class534_sub18_sub16_sub2;
	    class534_sub18_sub16_sub2_321_.method18752();
	} else
	    class534_sub18_sub16_sub2_321_
		= new Class534_Sub18_Sub16_Sub2(aClass185_Sub1_9817, i_319_,
						i_320_);
	class534_sub18_sub16_sub2_321_.method18756(i, i_317_, i_316_, i_318_);
	method15508(class534_sub18_sub16_sub2_321_);
	return class534_sub18_sub16_sub2_321_;
    }
    
    public void method3021(int i, int i_322_, int i_323_) {
	for (int i_324_ = 0; i_324_ < anInt9807; i_324_++) {
	    if (i != 128)
		anIntArray9808[i_324_] = anIntArray9808[i_324_] * i >> 7;
	    if (i_322_ != 128)
		anIntArray9809[i_324_] = anIntArray9809[i_324_] * i_322_ >> 7;
	    if (i_323_ != 128)
		anIntArray9828[i_324_] = anIntArray9828[i_324_] * i_323_ >> 7;
	}
	method15509();
	aBool9850 = false;
    }
    
    public void method3088(byte i, byte[] is) {
	if (is == null) {
	    for (int i_325_ = 0; i_325_ < anInt9823; i_325_++)
		aByteArray9826[i_325_] = i;
	} else {
	    for (int i_326_ = 0; i_326_ < anInt9823; i_326_++) {
		int i_327_ = 255 - ((255 - (is[i_326_] & 0xff))
				    * (255 - (i & 0xff)) / 255);
		aByteArray9826[i_326_] = (byte) i_327_;
	    }
	}
	method15504();
    }
    
    public void method3118(short i, short i_328_) {
	Class177 class177 = aClass185_Sub1_9817.aClass177_2012;
	for (int i_329_ = 0; i_329_ < anInt9823; i_329_++) {
	    if (aShortArray9830[i_329_] == i)
		aShortArray9830[i_329_] = i_328_;
	}
	byte i_330_ = 0;
	byte i_331_ = 0;
	if (i != -1) {
	    Class186 class186 = class177.method2931(i & 0xffff, (byte) 1);
	    i_330_ = class186.aByte2074;
	    i_331_ = class186.aByte2059;
	}
	byte i_332_ = 0;
	byte i_333_ = 0;
	if (i_328_ != -1) {
	    Class186 class186 = class177.method2931(i_328_ & 0xffff, (byte) 1);
	    i_332_ = class186.aByte2074;
	    i_333_ = class186.aByte2059;
	    if (class186.aByte2047 != 0 || class186.aByte2048 != 0)
		aBool9841 = true;
	}
	if (i_330_ != i_332_ | i_331_ != i_333_) {
	    if (aClass368Array9861 != null) {
		for (int i_334_ = 0; i_334_ < anInt9860; i_334_++) {
		    Class368 class368 = aClass368Array9861[i_334_];
		    Class339 class339 = aClass339Array9862[i_334_];
		    class339.anInt3539
			= (class339.anInt3539 & ~0xffffff
			   | ((Class661.anIntArray8549
			       [aShortArray9825[class368.anInt3860] & 0xffff])
			      & 0xffffff));
		}
	    }
	    method15504();
	}
    }
    
    public void method3058(int i, int i_335_, int i_336_, int i_337_) {
	for (int i_338_ = 0; i_338_ < anInt9823; i_338_++) {
	    int i_339_ = aShortArray9825[i_338_] & 0xffff;
	    int i_340_ = i_339_ >> 10 & 0x3f;
	    int i_341_ = i_339_ >> 7 & 0x7;
	    int i_342_ = i_339_ & 0x7f;
	    if (i != -1)
		i_340_ += (i - i_340_) * i_337_ >> 7;
	    if (i_335_ != -1)
		i_341_ += (i_335_ - i_341_) * i_337_ >> 7;
	    if (i_336_ != -1)
		i_342_ += (i_336_ - i_342_) * i_337_ >> 7;
	    aShortArray9825[i_338_]
		= (short) (i_340_ << 10 | i_341_ << 7 | i_342_);
	}
	if (aClass368Array9861 != null) {
	    for (int i_343_ = 0; i_343_ < anInt9860; i_343_++) {
		Class368 class368 = aClass368Array9861[i_343_];
		Class339 class339 = aClass339Array9862[i_343_];
		class339.anInt3539
		    = (class339.anInt3539 & ~0xffffff
		       | ((Class661.anIntArray8549
			   [aShortArray9825[class368.anInt3860] & 0xffff])
			  & 0xffffff));
	    }
	}
	method15504();
    }
    
    public void method3020() {
	for (int i = 0; i < anInt9807; i++)
	    anIntArray9828[i] = -anIntArray9828[i];
	for (int i = 0; i < anInt9813; i++)
	    aShortArray9869[i] = (short) -aShortArray9869[i];
	for (int i = 0; i < anInt9823; i++) {
	    short i_344_ = aShortArray9847[i];
	    aShortArray9847[i] = aShortArray9843[i];
	    aShortArray9843[i] = i_344_;
	}
	method15509();
	method15505();
	method15528();
	aBool9850 = false;
    }
    
    void method15509() {
	if (aClass379_9834 != null)
	    aClass379_9834.aBool3921 = false;
    }
    
    public void method3023(int i, int i_345_, int i_346_) {
	for (int i_347_ = 0; i_347_ < anInt9807; i_347_++) {
	    if (i != 128)
		anIntArray9808[i_347_] = anIntArray9808[i_347_] * i >> 7;
	    if (i_345_ != 128)
		anIntArray9809[i_347_] = anIntArray9809[i_347_] * i_345_ >> 7;
	    if (i_346_ != 128)
		anIntArray9828[i_347_] = anIntArray9828[i_347_] * i_346_ >> 7;
	}
	method15509();
	aBool9850 = false;
    }
    
    public boolean method3039(int i, int i_348_, Class446 class446,
			      boolean bool, int i_349_) {
	return method15511(i, i_348_, 0, 0, class446, bool, i_349_);
    }
    
    public Class534_Sub18_Sub16 method3117
	(Class534_Sub18_Sub16 class534_sub18_sub16) {
	if (anInt9813 == 0)
	    return null;
	if (!aBool9850)
	    method15507();
	int i;
	int i_350_;
	if (aClass185_Sub1_9817.anInt9213 > 0) {
	    i = (anInt9865 - (anInt9846 * aClass185_Sub1_9817.anInt9213 >> 8)
		 >> aClass185_Sub1_9817.anInt9212);
	    i_350_ = anInt9848 - (anInt9799 * aClass185_Sub1_9817.anInt9213
				  >> 8) >> aClass185_Sub1_9817.anInt9212;
	} else {
	    i = (anInt9865 - (anInt9799 * aClass185_Sub1_9817.anInt9213 >> 8)
		 >> aClass185_Sub1_9817.anInt9212);
	    i_350_ = anInt9848 - (anInt9846 * aClass185_Sub1_9817.anInt9213
				  >> 8) >> aClass185_Sub1_9817.anInt9212;
	}
	int i_351_;
	int i_352_;
	if (aClass185_Sub1_9817.anInt9287 > 0) {
	    i_351_ = anInt9849 - (anInt9846 * aClass185_Sub1_9817.anInt9287
				  >> 8) >> aClass185_Sub1_9817.anInt9212;
	    i_352_ = anInt9866 - (anInt9799 * aClass185_Sub1_9817.anInt9287
				  >> 8) >> aClass185_Sub1_9817.anInt9212;
	} else {
	    i_351_ = anInt9849 - (anInt9799 * aClass185_Sub1_9817.anInt9287
				  >> 8) >> aClass185_Sub1_9817.anInt9212;
	    i_352_ = anInt9866 - (anInt9846 * aClass185_Sub1_9817.anInt9287
				  >> 8) >> aClass185_Sub1_9817.anInt9212;
	}
	int i_353_ = i_350_ - i + 1;
	int i_354_ = i_352_ - i_351_ + 1;
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2
	    = (Class534_Sub18_Sub16_Sub2) class534_sub18_sub16;
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2_355_;
	if (class534_sub18_sub16_sub2 != null
	    && class534_sub18_sub16_sub2.method18753(i_353_, i_354_)) {
	    class534_sub18_sub16_sub2_355_ = class534_sub18_sub16_sub2;
	    class534_sub18_sub16_sub2_355_.method18752();
	} else
	    class534_sub18_sub16_sub2_355_
		= new Class534_Sub18_Sub16_Sub2(aClass185_Sub1_9817, i_353_,
						i_354_);
	class534_sub18_sub16_sub2_355_.method18756(i, i_351_, i_350_, i_352_);
	method15508(class534_sub18_sub16_sub2_355_);
	return class534_sub18_sub16_sub2_355_;
    }
    
    void method3104(int i, int i_356_, int i_357_, int i_358_) {
	if (i == 0) {
	    int i_359_ = 0;
	    anInt9871 = 0;
	    anInt9818 = 0;
	    anInt9873 = 0;
	    for (int i_360_ = 0; i_360_ < anInt9807; i_360_++) {
		anInt9871 += anIntArray9808[i_360_];
		anInt9818 += anIntArray9809[i_360_];
		anInt9873 += anIntArray9828[i_360_];
		i_359_++;
	    }
	    if (i_359_ > 0) {
		anInt9871 = anInt9871 / i_359_ + i_356_;
		anInt9818 = anInt9818 / i_359_ + i_357_;
		anInt9873 = anInt9873 / i_359_ + i_358_;
	    } else {
		anInt9871 = i_356_;
		anInt9818 = i_357_;
		anInt9873 = i_358_;
	    }
	} else if (i == 1) {
	    for (int i_361_ = 0; i_361_ < anInt9807; i_361_++) {
		anIntArray9808[i_361_] += i_356_;
		anIntArray9809[i_361_] += i_357_;
		anIntArray9828[i_361_] += i_358_;
	    }
	} else if (i == 2) {
	    for (int i_362_ = 0; i_362_ < anInt9807; i_362_++) {
		anIntArray9808[i_362_] -= anInt9871;
		anIntArray9809[i_362_] -= anInt9818;
		anIntArray9828[i_362_] -= anInt9873;
		if (i_358_ != 0) {
		    int i_363_ = Class427.anIntArray4806[i_358_];
		    int i_364_ = Class427.anIntArray4805[i_358_];
		    int i_365_ = ((anIntArray9809[i_362_] * i_363_
				   + anIntArray9808[i_362_] * i_364_ + 16383)
				  >> 14);
		    anIntArray9809[i_362_]
			= (anIntArray9809[i_362_] * i_364_
			   - anIntArray9808[i_362_] * i_363_ + 16383) >> 14;
		    anIntArray9808[i_362_] = i_365_;
		}
		if (i_356_ != 0) {
		    int i_366_ = Class427.anIntArray4806[i_356_];
		    int i_367_ = Class427.anIntArray4805[i_356_];
		    int i_368_ = ((anIntArray9809[i_362_] * i_367_
				   - anIntArray9828[i_362_] * i_366_ + 16383)
				  >> 14);
		    anIntArray9828[i_362_]
			= (anIntArray9809[i_362_] * i_366_
			   + anIntArray9828[i_362_] * i_367_ + 16383) >> 14;
		    anIntArray9809[i_362_] = i_368_;
		}
		if (i_357_ != 0) {
		    int i_369_ = Class427.anIntArray4806[i_357_];
		    int i_370_ = Class427.anIntArray4805[i_357_];
		    int i_371_ = ((anIntArray9828[i_362_] * i_369_
				   + anIntArray9808[i_362_] * i_370_ + 16383)
				  >> 14);
		    anIntArray9828[i_362_]
			= (anIntArray9828[i_362_] * i_370_
			   - anIntArray9808[i_362_] * i_369_ + 16383) >> 14;
		    anIntArray9808[i_362_] = i_371_;
		}
		anIntArray9808[i_362_] += anInt9871;
		anIntArray9809[i_362_] += anInt9818;
		anIntArray9828[i_362_] += anInt9873;
	    }
	} else if (i == 3) {
	    for (int i_372_ = 0; i_372_ < anInt9807; i_372_++) {
		anIntArray9808[i_372_] -= anInt9871;
		anIntArray9809[i_372_] -= anInt9818;
		anIntArray9828[i_372_] -= anInt9873;
		anIntArray9808[i_372_] = anIntArray9808[i_372_] * i_356_ / 128;
		anIntArray9809[i_372_] = anIntArray9809[i_372_] * i_357_ / 128;
		anIntArray9828[i_372_] = anIntArray9828[i_372_] * i_358_ / 128;
		anIntArray9808[i_372_] += anInt9871;
		anIntArray9809[i_372_] += anInt9818;
		anIntArray9828[i_372_] += anInt9873;
	    }
	} else if (i == 5) {
	    for (int i_373_ = 0; i_373_ < anInt9823; i_373_++) {
		int i_374_ = (aByteArray9826[i_373_] & 0xff) + i_356_ * 8;
		if (i_374_ < 0)
		    i_374_ = 0;
		else if (i_374_ > 255)
		    i_374_ = 255;
		aByteArray9826[i_373_] = (byte) i_374_;
	    }
	    if (aClass368Array9861 != null) {
		for (int i_375_ = 0; i_375_ < anInt9860; i_375_++) {
		    Class368 class368 = aClass368Array9861[i_375_];
		    Class339 class339 = aClass339Array9862[i_375_];
		    class339.anInt3539
			= (class339.anInt3539 & 0xffffff
			   | (255 - (aByteArray9826[class368.anInt3860] & 0xff)
			      << 24));
		}
	    }
	    method15504();
	} else if (i == 7) {
	    for (int i_376_ = 0; i_376_ < anInt9823; i_376_++) {
		int i_377_ = aShortArray9825[i_376_] & 0xffff;
		int i_378_ = i_377_ >> 10 & 0x3f;
		int i_379_ = i_377_ >> 7 & 0x7;
		int i_380_ = i_377_ & 0x7f;
		i_378_ = i_378_ + i_356_ & 0x3f;
		i_379_ += i_357_ / 4;
		if (i_379_ < 0)
		    i_379_ = 0;
		else if (i_379_ > 7)
		    i_379_ = 7;
		i_380_ += i_358_;
		if (i_380_ < 0)
		    i_380_ = 0;
		else if (i_380_ > 127)
		    i_380_ = 127;
		aShortArray9825[i_376_]
		    = (short) (i_378_ << 10 | i_379_ << 7 | i_380_);
	    }
	    if (aClass368Array9861 != null) {
		for (int i_381_ = 0; i_381_ < anInt9860; i_381_++) {
		    Class368 class368 = aClass368Array9861[i_381_];
		    Class339 class339 = aClass339Array9862[i_381_];
		    class339.anInt3539
			= (class339.anInt3539 & ~0xffffff
			   | ((Class661.anIntArray8549
			       [aShortArray9825[class368.anInt3860] & 0xffff])
			      & 0xffffff));
		}
	    }
	    method15504();
	} else if (i == 8) {
	    for (int i_382_ = 0; i_382_ < anInt9860; i_382_++) {
		Class339 class339 = aClass339Array9862[i_382_];
		class339.anInt3537 += i_356_;
		class339.anInt3534 += i_357_;
	    }
	} else if (i == 10) {
	    for (int i_383_ = 0; i_383_ < anInt9860; i_383_++) {
		Class339 class339 = aClass339Array9862[i_383_];
		class339.anInt3538 = class339.anInt3538 * i_356_ >> 7;
		class339.anInt3536 = class339.anInt3536 * i_357_ >> 7;
	    }
	} else if (i == 9) {
	    for (int i_384_ = 0; i_384_ < anInt9860; i_384_++) {
		Class339 class339 = aClass339Array9862[i_384_];
		class339.anInt3535 = class339.anInt3535 + i_356_ & 0x3fff;
	    }
	}
    }
    
    void method15510(Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2) {
	if (anIntArray9820.length < anInt9813) {
	    anIntArray9820 = new int[anInt9813];
	    anIntArray9867 = new int[anInt9813];
	}
	for (int i = 0; i < anInt9807; i++) {
	    int i_385_
		= (((anIntArray9808[i]
		     - (anIntArray9809[i] * aClass185_Sub1_9817.anInt9213
			>> 8))
		    >> aClass185_Sub1_9817.anInt9212)
		   - class534_sub18_sub16_sub2.anInt12123);
	    int i_386_
		= (((anIntArray9828[i]
		     - (anIntArray9809[i] * aClass185_Sub1_9817.anInt9287
			>> 8))
		    >> aClass185_Sub1_9817.anInt9212)
		   - class534_sub18_sub16_sub2.anInt12121);
	    int i_387_ = anIntArray9853[i];
	    int i_388_ = anIntArray9853[i + 1];
	    for (int i_389_ = i_387_;
		 i_389_ < i_388_ && aShortArray9863[i_389_] != 0; i_389_++) {
		int i_390_ = (aShortArray9863[i_389_] & 0xffff) - 1;
		anIntArray9820[i_390_] = i_385_;
		anIntArray9867[i_390_] = i_386_;
	    }
	}
	for (int i = 0; i < anInt9824; i++) {
	    if (aByteArray9826 == null || aByteArray9826[i] <= 128) {
		int i_391_ = aShortArray9847[i] & 0xffff;
		int i_392_ = aShortArray9845[i] & 0xffff;
		int i_393_ = aShortArray9843[i] & 0xffff;
		int i_394_ = anIntArray9820[i_391_];
		int i_395_ = anIntArray9820[i_392_];
		int i_396_ = anIntArray9820[i_393_];
		int i_397_ = anIntArray9867[i_391_];
		int i_398_ = anIntArray9867[i_392_];
		int i_399_ = anIntArray9867[i_393_];
		if (((i_394_ - i_395_) * (i_398_ - i_399_)
		     - (i_398_ - i_397_) * (i_396_ - i_395_))
		    > 0)
		    class534_sub18_sub16_sub2.method18755(i_397_, i_398_,
							  i_399_, i_394_,
							  i_395_, i_396_);
	    }
	}
    }
    
    void method3137(int i, int i_400_, int i_401_, int i_402_) {
	if (i == 0) {
	    int i_403_ = 0;
	    anInt9871 = 0;
	    anInt9818 = 0;
	    anInt9873 = 0;
	    for (int i_404_ = 0; i_404_ < anInt9807; i_404_++) {
		anInt9871 += anIntArray9808[i_404_];
		anInt9818 += anIntArray9809[i_404_];
		anInt9873 += anIntArray9828[i_404_];
		i_403_++;
	    }
	    if (i_403_ > 0) {
		anInt9871 = anInt9871 / i_403_ + i_400_;
		anInt9818 = anInt9818 / i_403_ + i_401_;
		anInt9873 = anInt9873 / i_403_ + i_402_;
	    } else {
		anInt9871 = i_400_;
		anInt9818 = i_401_;
		anInt9873 = i_402_;
	    }
	} else if (i == 1) {
	    for (int i_405_ = 0; i_405_ < anInt9807; i_405_++) {
		anIntArray9808[i_405_] += i_400_;
		anIntArray9809[i_405_] += i_401_;
		anIntArray9828[i_405_] += i_402_;
	    }
	} else if (i == 2) {
	    for (int i_406_ = 0; i_406_ < anInt9807; i_406_++) {
		anIntArray9808[i_406_] -= anInt9871;
		anIntArray9809[i_406_] -= anInt9818;
		anIntArray9828[i_406_] -= anInt9873;
		if (i_402_ != 0) {
		    int i_407_ = Class427.anIntArray4806[i_402_];
		    int i_408_ = Class427.anIntArray4805[i_402_];
		    int i_409_ = ((anIntArray9809[i_406_] * i_407_
				   + anIntArray9808[i_406_] * i_408_ + 16383)
				  >> 14);
		    anIntArray9809[i_406_]
			= (anIntArray9809[i_406_] * i_408_
			   - anIntArray9808[i_406_] * i_407_ + 16383) >> 14;
		    anIntArray9808[i_406_] = i_409_;
		}
		if (i_400_ != 0) {
		    int i_410_ = Class427.anIntArray4806[i_400_];
		    int i_411_ = Class427.anIntArray4805[i_400_];
		    int i_412_ = ((anIntArray9809[i_406_] * i_411_
				   - anIntArray9828[i_406_] * i_410_ + 16383)
				  >> 14);
		    anIntArray9828[i_406_]
			= (anIntArray9809[i_406_] * i_410_
			   + anIntArray9828[i_406_] * i_411_ + 16383) >> 14;
		    anIntArray9809[i_406_] = i_412_;
		}
		if (i_401_ != 0) {
		    int i_413_ = Class427.anIntArray4806[i_401_];
		    int i_414_ = Class427.anIntArray4805[i_401_];
		    int i_415_ = ((anIntArray9828[i_406_] * i_413_
				   + anIntArray9808[i_406_] * i_414_ + 16383)
				  >> 14);
		    anIntArray9828[i_406_]
			= (anIntArray9828[i_406_] * i_414_
			   - anIntArray9808[i_406_] * i_413_ + 16383) >> 14;
		    anIntArray9808[i_406_] = i_415_;
		}
		anIntArray9808[i_406_] += anInt9871;
		anIntArray9809[i_406_] += anInt9818;
		anIntArray9828[i_406_] += anInt9873;
	    }
	} else if (i == 3) {
	    for (int i_416_ = 0; i_416_ < anInt9807; i_416_++) {
		anIntArray9808[i_416_] -= anInt9871;
		anIntArray9809[i_416_] -= anInt9818;
		anIntArray9828[i_416_] -= anInt9873;
		anIntArray9808[i_416_] = anIntArray9808[i_416_] * i_400_ / 128;
		anIntArray9809[i_416_] = anIntArray9809[i_416_] * i_401_ / 128;
		anIntArray9828[i_416_] = anIntArray9828[i_416_] * i_402_ / 128;
		anIntArray9808[i_416_] += anInt9871;
		anIntArray9809[i_416_] += anInt9818;
		anIntArray9828[i_416_] += anInt9873;
	    }
	} else if (i == 5) {
	    for (int i_417_ = 0; i_417_ < anInt9823; i_417_++) {
		int i_418_ = (aByteArray9826[i_417_] & 0xff) + i_400_ * 8;
		if (i_418_ < 0)
		    i_418_ = 0;
		else if (i_418_ > 255)
		    i_418_ = 255;
		aByteArray9826[i_417_] = (byte) i_418_;
	    }
	    if (aClass368Array9861 != null) {
		for (int i_419_ = 0; i_419_ < anInt9860; i_419_++) {
		    Class368 class368 = aClass368Array9861[i_419_];
		    Class339 class339 = aClass339Array9862[i_419_];
		    class339.anInt3539
			= (class339.anInt3539 & 0xffffff
			   | (255 - (aByteArray9826[class368.anInt3860] & 0xff)
			      << 24));
		}
	    }
	    method15504();
	} else if (i == 7) {
	    for (int i_420_ = 0; i_420_ < anInt9823; i_420_++) {
		int i_421_ = aShortArray9825[i_420_] & 0xffff;
		int i_422_ = i_421_ >> 10 & 0x3f;
		int i_423_ = i_421_ >> 7 & 0x7;
		int i_424_ = i_421_ & 0x7f;
		i_422_ = i_422_ + i_400_ & 0x3f;
		i_423_ += i_401_ / 4;
		if (i_423_ < 0)
		    i_423_ = 0;
		else if (i_423_ > 7)
		    i_423_ = 7;
		i_424_ += i_402_;
		if (i_424_ < 0)
		    i_424_ = 0;
		else if (i_424_ > 127)
		    i_424_ = 127;
		aShortArray9825[i_420_]
		    = (short) (i_422_ << 10 | i_423_ << 7 | i_424_);
	    }
	    if (aClass368Array9861 != null) {
		for (int i_425_ = 0; i_425_ < anInt9860; i_425_++) {
		    Class368 class368 = aClass368Array9861[i_425_];
		    Class339 class339 = aClass339Array9862[i_425_];
		    class339.anInt3539
			= (class339.anInt3539 & ~0xffffff
			   | ((Class661.anIntArray8549
			       [aShortArray9825[class368.anInt3860] & 0xffff])
			      & 0xffffff));
		}
	    }
	    method15504();
	} else if (i == 8) {
	    for (int i_426_ = 0; i_426_ < anInt9860; i_426_++) {
		Class339 class339 = aClass339Array9862[i_426_];
		class339.anInt3537 += i_400_;
		class339.anInt3534 += i_401_;
	    }
	} else if (i == 10) {
	    for (int i_427_ = 0; i_427_ < anInt9860; i_427_++) {
		Class339 class339 = aClass339Array9862[i_427_];
		class339.anInt3538 = class339.anInt3538 * i_400_ >> 7;
		class339.anInt3536 = class339.anInt3536 * i_401_ >> 7;
	    }
	} else if (i == 9) {
	    for (int i_428_ = 0; i_428_ < anInt9860; i_428_++) {
		Class339 class339 = aClass339Array9862[i_428_];
		class339.anInt3535 = class339.anInt3535 + i_400_ & 0x3fff;
	    }
	}
    }
    
    void method3033(int i, int[] is, int i_429_, int i_430_, int i_431_,
		    int i_432_, boolean bool) {
	int i_433_ = is.length;
	if (i == 0) {
	    i_429_ <<= 4;
	    i_430_ <<= 4;
	    i_431_ <<= 4;
	    int i_434_ = 0;
	    anInt9871 = 0;
	    anInt9818 = 0;
	    anInt9873 = 0;
	    for (int i_435_ = 0; i_435_ < i_433_; i_435_++) {
		int i_436_ = is[i_435_];
		if (i_436_ < anIntArrayArray9819.length) {
		    int[] is_437_ = anIntArrayArray9819[i_436_];
		    for (int i_438_ = 0; i_438_ < is_437_.length; i_438_++) {
			int i_439_ = is_437_[i_438_];
			anInt9871 += anIntArray9808[i_439_];
			anInt9818 += anIntArray9809[i_439_];
			anInt9873 += anIntArray9828[i_439_];
			i_434_++;
		    }
		}
	    }
	    if (i_434_ > 0) {
		anInt9871 = anInt9871 / i_434_ + i_429_;
		anInt9818 = anInt9818 / i_434_ + i_430_;
		anInt9873 = anInt9873 / i_434_ + i_431_;
	    } else {
		anInt9871 = i_429_;
		anInt9818 = i_430_;
		anInt9873 = i_431_;
	    }
	} else if (i == 1) {
	    i_429_ <<= 4;
	    i_430_ <<= 4;
	    i_431_ <<= 4;
	    for (int i_440_ = 0; i_440_ < i_433_; i_440_++) {
		int i_441_ = is[i_440_];
		if (i_441_ < anIntArrayArray9819.length) {
		    int[] is_442_ = anIntArrayArray9819[i_441_];
		    for (int i_443_ = 0; i_443_ < is_442_.length; i_443_++) {
			int i_444_ = is_442_[i_443_];
			anIntArray9808[i_444_] += i_429_;
			anIntArray9809[i_444_] += i_430_;
			anIntArray9828[i_444_] += i_431_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_445_ = 0; i_445_ < i_433_; i_445_++) {
		int i_446_ = is[i_445_];
		if (i_446_ < anIntArrayArray9819.length) {
		    int[] is_447_ = anIntArrayArray9819[i_446_];
		    if ((i_432_ & 0x1) == 0) {
			for (int i_448_ = 0; i_448_ < is_447_.length;
			     i_448_++) {
			    int i_449_ = is_447_[i_448_];
			    anIntArray9808[i_449_] -= anInt9871;
			    anIntArray9809[i_449_] -= anInt9818;
			    anIntArray9828[i_449_] -= anInt9873;
			    if (i_431_ != 0) {
				int i_450_ = Class427.anIntArray4806[i_431_];
				int i_451_ = Class427.anIntArray4805[i_431_];
				int i_452_ = (anIntArray9809[i_449_] * i_450_
					      + anIntArray9808[i_449_] * i_451_
					      + 16383) >> 14;
				anIntArray9809[i_449_]
				    = (anIntArray9809[i_449_] * i_451_
				       - anIntArray9808[i_449_] * i_450_
				       + 16383) >> 14;
				anIntArray9808[i_449_] = i_452_;
			    }
			    if (i_429_ != 0) {
				int i_453_ = Class427.anIntArray4806[i_429_];
				int i_454_ = Class427.anIntArray4805[i_429_];
				int i_455_ = (anIntArray9809[i_449_] * i_454_
					      - anIntArray9828[i_449_] * i_453_
					      + 16383) >> 14;
				anIntArray9828[i_449_]
				    = (anIntArray9809[i_449_] * i_453_
				       + anIntArray9828[i_449_] * i_454_
				       + 16383) >> 14;
				anIntArray9809[i_449_] = i_455_;
			    }
			    if (i_430_ != 0) {
				int i_456_ = Class427.anIntArray4806[i_430_];
				int i_457_ = Class427.anIntArray4805[i_430_];
				int i_458_ = (anIntArray9828[i_449_] * i_456_
					      + anIntArray9808[i_449_] * i_457_
					      + 16383) >> 14;
				anIntArray9828[i_449_]
				    = (anIntArray9828[i_449_] * i_457_
				       - anIntArray9808[i_449_] * i_456_
				       + 16383) >> 14;
				anIntArray9808[i_449_] = i_458_;
			    }
			    anIntArray9808[i_449_] += anInt9871;
			    anIntArray9809[i_449_] += anInt9818;
			    anIntArray9828[i_449_] += anInt9873;
			}
		    } else {
			for (int i_459_ = 0; i_459_ < is_447_.length;
			     i_459_++) {
			    int i_460_ = is_447_[i_459_];
			    anIntArray9808[i_460_] -= anInt9871;
			    anIntArray9809[i_460_] -= anInt9818;
			    anIntArray9828[i_460_] -= anInt9873;
			    if (i_429_ != 0) {
				int i_461_ = Class427.anIntArray4806[i_429_];
				int i_462_ = Class427.anIntArray4805[i_429_];
				int i_463_ = (anIntArray9809[i_460_] * i_462_
					      - anIntArray9828[i_460_] * i_461_
					      + 16383) >> 14;
				anIntArray9828[i_460_]
				    = (anIntArray9809[i_460_] * i_461_
				       + anIntArray9828[i_460_] * i_462_
				       + 16383) >> 14;
				anIntArray9809[i_460_] = i_463_;
			    }
			    if (i_431_ != 0) {
				int i_464_ = Class427.anIntArray4806[i_431_];
				int i_465_ = Class427.anIntArray4805[i_431_];
				int i_466_ = (anIntArray9809[i_460_] * i_464_
					      + anIntArray9808[i_460_] * i_465_
					      + 16383) >> 14;
				anIntArray9809[i_460_]
				    = (anIntArray9809[i_460_] * i_465_
				       - anIntArray9808[i_460_] * i_464_
				       + 16383) >> 14;
				anIntArray9808[i_460_] = i_466_;
			    }
			    if (i_430_ != 0) {
				int i_467_ = Class427.anIntArray4806[i_430_];
				int i_468_ = Class427.anIntArray4805[i_430_];
				int i_469_ = (anIntArray9828[i_460_] * i_467_
					      + anIntArray9808[i_460_] * i_468_
					      + 16383) >> 14;
				anIntArray9828[i_460_]
				    = (anIntArray9828[i_460_] * i_468_
				       - anIntArray9808[i_460_] * i_467_
				       + 16383) >> 14;
				anIntArray9808[i_460_] = i_469_;
			    }
			    anIntArray9808[i_460_] += anInt9871;
			    anIntArray9809[i_460_] += anInt9818;
			    anIntArray9828[i_460_] += anInt9873;
			}
		    }
		}
	    }
	    if (bool) {
		for (int i_470_ = 0; i_470_ < i_433_; i_470_++) {
		    int i_471_ = is[i_470_];
		    if (i_471_ < anIntArrayArray9819.length) {
			int[] is_472_ = anIntArrayArray9819[i_471_];
			for (int i_473_ = 0; i_473_ < is_472_.length;
			     i_473_++) {
			    int i_474_ = is_472_[i_473_];
			    int i_475_ = anIntArray9853[i_474_];
			    int i_476_ = anIntArray9853[i_474_ + 1];
			    for (int i_477_ = i_475_;
				 (i_477_ < i_476_
				  && aShortArray9863[i_477_] != 0);
				 i_477_++) {
				int i_478_
				    = (aShortArray9863[i_477_] & 0xffff) - 1;
				if (i_431_ != 0) {
				    int i_479_
					= Class427.anIntArray4806[i_431_];
				    int i_480_
					= Class427.anIntArray4805[i_431_];
				    int i_481_
					= ((aShortArray9864[i_478_] * i_479_
					    + aShortArray9816[i_478_] * i_480_
					    + 16383)
					   >> 14);
				    aShortArray9864[i_478_]
					= (short) (((aShortArray9864[i_478_]
						     * i_480_)
						    - (aShortArray9816[i_478_]
						       * i_479_)
						    + 16383)
						   >> 14);
				    aShortArray9816[i_478_] = (short) i_481_;
				}
				if (i_429_ != 0) {
				    int i_482_
					= Class427.anIntArray4806[i_429_];
				    int i_483_
					= Class427.anIntArray4805[i_429_];
				    int i_484_
					= ((aShortArray9864[i_478_] * i_483_
					    - aShortArray9869[i_478_] * i_482_
					    + 16383)
					   >> 14);
				    aShortArray9869[i_478_]
					= (short) (((aShortArray9864[i_478_]
						     * i_482_)
						    + (aShortArray9869[i_478_]
						       * i_483_)
						    + 16383)
						   >> 14);
				    aShortArray9864[i_478_] = (short) i_484_;
				}
				if (i_430_ != 0) {
				    int i_485_
					= Class427.anIntArray4806[i_430_];
				    int i_486_
					= Class427.anIntArray4805[i_430_];
				    int i_487_
					= ((aShortArray9869[i_478_] * i_485_
					    + aShortArray9816[i_478_] * i_486_
					    + 16383)
					   >> 14);
				    aShortArray9869[i_478_]
					= (short) (((aShortArray9869[i_478_]
						     * i_486_)
						    - (aShortArray9816[i_478_]
						       * i_485_)
						    + 16383)
						   >> 14);
				    aShortArray9816[i_478_] = (short) i_487_;
				}
			    }
			}
		    }
		}
		method15505();
	    }
	} else if (i == 3) {
	    for (int i_488_ = 0; i_488_ < i_433_; i_488_++) {
		int i_489_ = is[i_488_];
		if (i_489_ < anIntArrayArray9819.length) {
		    int[] is_490_ = anIntArrayArray9819[i_489_];
		    for (int i_491_ = 0; i_491_ < is_490_.length; i_491_++) {
			int i_492_ = is_490_[i_491_];
			anIntArray9808[i_492_] -= anInt9871;
			anIntArray9809[i_492_] -= anInt9818;
			anIntArray9828[i_492_] -= anInt9873;
			anIntArray9808[i_492_]
			    = anIntArray9808[i_492_] * i_429_ >> 7;
			anIntArray9809[i_492_]
			    = anIntArray9809[i_492_] * i_430_ >> 7;
			anIntArray9828[i_492_]
			    = anIntArray9828[i_492_] * i_431_ >> 7;
			anIntArray9808[i_492_] += anInt9871;
			anIntArray9809[i_492_] += anInt9818;
			anIntArray9828[i_492_] += anInt9873;
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9831 != null) {
		boolean bool_493_ = false;
		for (int i_494_ = 0; i_494_ < i_433_; i_494_++) {
		    int i_495_ = is[i_494_];
		    if (i_495_ < anIntArrayArray9831.length) {
			int[] is_496_ = anIntArrayArray9831[i_495_];
			for (int i_497_ = 0; i_497_ < is_496_.length;
			     i_497_++) {
			    int i_498_ = is_496_[i_497_];
			    int i_499_
				= (aByteArray9826[i_498_] & 0xff) + i_429_ * 8;
			    if (i_499_ < 0)
				i_499_ = 0;
			    else if (i_499_ > 255)
				i_499_ = 255;
			    aByteArray9826[i_498_] = (byte) i_499_;
			}
			bool_493_ = bool_493_ | is_496_.length > 0;
		    }
		}
		if (bool_493_) {
		    if (aClass368Array9861 != null) {
			for (int i_500_ = 0; i_500_ < anInt9860; i_500_++) {
			    Class368 class368 = aClass368Array9861[i_500_];
			    Class339 class339 = aClass339Array9862[i_500_];
			    class339.anInt3539
				= (class339.anInt3539 & 0xffffff
				   | 255 - (aByteArray9826[class368.anInt3860]
					    & 0xff) << 24);
			}
		    }
		    method15504();
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9831 != null) {
		boolean bool_501_ = false;
		for (int i_502_ = 0; i_502_ < i_433_; i_502_++) {
		    int i_503_ = is[i_502_];
		    if (i_503_ < anIntArrayArray9831.length) {
			int[] is_504_ = anIntArrayArray9831[i_503_];
			for (int i_505_ = 0; i_505_ < is_504_.length;
			     i_505_++) {
			    int i_506_ = is_504_[i_505_];
			    int i_507_ = aShortArray9825[i_506_] & 0xffff;
			    int i_508_ = i_507_ >> 10 & 0x3f;
			    int i_509_ = i_507_ >> 7 & 0x7;
			    int i_510_ = i_507_ & 0x7f;
			    i_508_ = i_508_ + i_429_ & 0x3f;
			    i_509_ += i_430_ / 4;
			    if (i_509_ < 0)
				i_509_ = 0;
			    else if (i_509_ > 7)
				i_509_ = 7;
			    i_510_ += i_431_;
			    if (i_510_ < 0)
				i_510_ = 0;
			    else if (i_510_ > 127)
				i_510_ = 127;
			    aShortArray9825[i_506_]
				= (short) (i_508_ << 10 | i_509_ << 7
					   | i_510_);
			}
			bool_501_ = bool_501_ | is_504_.length > 0;
		    }
		}
		if (bool_501_) {
		    if (aClass368Array9861 != null) {
			for (int i_511_ = 0; i_511_ < anInt9860; i_511_++) {
			    Class368 class368 = aClass368Array9861[i_511_];
			    Class339 class339 = aClass339Array9862[i_511_];
			    class339.anInt3539
				= (class339.anInt3539 & ~0xffffff
				   | (Class661.anIntArray8549
				      [(aShortArray9825[class368.anInt3860]
					& 0xffff)]) & 0xffffff);
			}
		    }
		    method15504();
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9856 != null) {
		for (int i_512_ = 0; i_512_ < i_433_; i_512_++) {
		    int i_513_ = is[i_512_];
		    if (i_513_ < anIntArrayArray9856.length) {
			int[] is_514_ = anIntArrayArray9856[i_513_];
			for (int i_515_ = 0; i_515_ < is_514_.length;
			     i_515_++) {
			    Class339 class339
				= aClass339Array9862[is_514_[i_515_]];
			    class339.anInt3537 += i_429_;
			    class339.anInt3534 += i_430_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9856 != null) {
		for (int i_516_ = 0; i_516_ < i_433_; i_516_++) {
		    int i_517_ = is[i_516_];
		    if (i_517_ < anIntArrayArray9856.length) {
			int[] is_518_ = anIntArrayArray9856[i_517_];
			for (int i_519_ = 0; i_519_ < is_518_.length;
			     i_519_++) {
			    Class339 class339
				= aClass339Array9862[is_518_[i_519_]];
			    class339.anInt3538
				= class339.anInt3538 * i_429_ >> 7;
			    class339.anInt3536
				= class339.anInt3536 * i_430_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9856 != null) {
		for (int i_520_ = 0; i_520_ < i_433_; i_520_++) {
		    int i_521_ = is[i_520_];
		    if (i_521_ < anIntArrayArray9856.length) {
			int[] is_522_ = anIntArrayArray9856[i_521_];
			for (int i_523_ = 0; i_523_ < is_522_.length;
			     i_523_++) {
			    Class339 class339
				= aClass339Array9862[is_522_[i_523_]];
			    class339.anInt3535
				= class339.anInt3535 + i_429_ & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    void method3109() {
	/* empty */
    }
    
    public void method3150(byte i, byte[] is) {
	if (is == null) {
	    for (int i_524_ = 0; i_524_ < anInt9823; i_524_++)
		aByteArray9826[i_524_] = i;
	} else {
	    for (int i_525_ = 0; i_525_ < anInt9823; i_525_++) {
		int i_526_ = 255 - ((255 - (is[i_525_] & 0xff))
				    * (255 - (i & 0xff)) / 255);
		aByteArray9826[i_525_] = (byte) i_526_;
	    }
	}
	method15504();
    }
    
    void method3185() {
	/* empty */
    }
    
    public void method3074(int i) {
	if (aClass379_9834 != null)
	    aClass379_9834.aBool3923 = Class342.method5991(i, anInt9872);
	if (aClass379_9837 != null)
	    aClass379_9837.aBool3923 = Class342.method5996(i, anInt9872);
	if (aClass379_9835 != null)
	    aClass379_9835.aBool3923 = Class342.method5966(i, anInt9872);
	if (aClass379_9836 != null)
	    aClass379_9836.aBool3923 = Class342.method5970(i, anInt9872);
	anInt9803 = i;
	if (aClass363_9822 != null && (anInt9803 & 0x10000) == 0) {
	    aShortArray9816 = aClass363_9822.aShortArray3722;
	    aShortArray9864 = aClass363_9822.aShortArray3720;
	    aShortArray9869 = aClass363_9822.aShortArray3723;
	    aByteArray9814 = aClass363_9822.aByteArray3721;
	    aClass363_9822 = null;
	}
	aBool9839 = true;
	method15503();
    }
    
    public void method3073(Class446 class446) {
	Class433 class433 = aClass185_Sub1_9817.aClass433_9194;
	class433.method6916(class446);
	if (aClass172Array9858 != null) {
	    for (int i = 0; i < aClass172Array9858.length; i++) {
		Class172 class172 = aClass172Array9858[i];
		Class172 class172_527_ = class172;
		if (class172.aClass172_1809 != null)
		    class172_527_ = class172.aClass172_1809;
		class172_527_.anInt1815
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9808[(class172.anInt1814
							    * 1404619919)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9809
					       [(class172.anInt1814
						 * 1404619919)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9828
					       [(class172.anInt1814
						 * 1404619919)]))))
		       * -697779603);
		class172_527_.anInt1823
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9808
					    [class172.anInt1814 * 1404619919]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9809[(class172.anInt1814
							     * 1404619919)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9828
					      [(class172.anInt1814
						* 1404619919)])))) * 880720549;
		class172_527_.anInt1817
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9808[(class172.anInt1814
							    * 1404619919)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9809
					       [(class172.anInt1814
						 * 1404619919)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9828
					       [(class172.anInt1814
						 * 1404619919)]))))
		       * -487629419);
		class172_527_.anInt1818
		    = (int) (class433.aFloatArray4853[12]
			     + ((class433.aFloatArray4853[0]
				 * (float) (anIntArray9808
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[4]
				   * (float) anIntArray9809[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[8]
				   * (float) (anIntArray9828
					      [(class172.anInt1812
						* 496404005)])))) * 1861716229;
		class172_527_.anInt1808
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9808
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9809[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9828
					      [(class172.anInt1812
						* 496404005)])))) * 968631629;
		class172_527_.anInt1819
		    = (int) (class433.aFloatArray4853[14]
			     + ((class433.aFloatArray4853[2]
				 * (float) (anIntArray9808
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[6]
				   * (float) anIntArray9809[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[10]
				   * (float) (anIntArray9828
					      [(class172.anInt1812
						* 496404005)])))) * -337212495;
		class172_527_.anInt1821
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9808[(class172.anInt1813
							    * 1123614299)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9809
					       [(class172.anInt1813
						 * 1123614299)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9828
					       [(class172.anInt1813
						 * 1123614299)]))))
		       * -289878931);
		class172_527_.anInt1822
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9808
					    [class172.anInt1813 * 1123614299]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9809[(class172.anInt1813
							     * 1123614299)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9828
					      [(class172.anInt1813
						* 1123614299)])))) * 286740539;
		class172_527_.anInt1820
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9808[(class172.anInt1813
							    * 1123614299)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9809
					       [(class172.anInt1813
						 * 1123614299)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9828
					       [(class172.anInt1813
						 * 1123614299)]))))
		       * -2010684097);
	    }
	}
	if (aClass158Array9859 != null) {
	    for (int i = 0; i < aClass158Array9859.length; i++) {
		Class158 class158 = aClass158Array9859[i];
		Class158 class158_528_ = class158;
		if (class158.aClass158_1748 != null)
		    class158_528_ = class158.aClass158_1748;
		if (class158.aClass433_1747 != null)
		    class158.aClass433_1747.method6842(class433);
		else
		    class158.aClass433_1747 = new Class433(class433);
		class158_528_.anInt1750
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9808[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9809
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9828
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * 1976103833);
		class158_528_.anInt1751
		    = ((int) (class433.aFloatArray4853[13]
			      + ((class433.aFloatArray4853[1]
				  * (float) anIntArray9808[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[5]
				    * (float) (anIntArray9809
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[9]
				    * (float) (anIntArray9828
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * 1216251817);
		class158_528_.anInt1749
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9808[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9809
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9828
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * -1645064349);
	    }
	}
    }
    
    public Class172[] method3168() {
	return aClass172Array9858;
    }
    
    boolean method15511(int i, int i_529_, int i_530_, int i_531_,
			Class446 class446, boolean bool, int i_532_) {
	Class433 class433 = aClass185_Sub1_9817.aClass433_9194;
	class433.method6916(class446);
	class433.method6839(aClass185_Sub1_9817.aClass433_9284);
	boolean bool_533_ = false;
	float f = 3.4028235E38F;
	float f_534_ = -3.4028235E38F;
	float f_535_ = 3.4028235E38F;
	float f_536_ = -3.4028235E38F;
	if (!aBool9850)
	    method15507();
	int i_537_ = anInt9848 - anInt9865 >> 1;
	int i_538_ = anInt9846 - anInt9799 >> 1;
	int i_539_ = anInt9866 - anInt9849 >> 1;
	int i_540_ = anInt9865 + i_537_;
	int i_541_ = anInt9799 + i_538_;
	int i_542_ = anInt9849 + i_539_;
	int i_543_ = i_540_ - (i_537_ << i_532_);
	int i_544_ = i_541_ - (i_538_ << i_532_);
	int i_545_ = i_542_ - (i_539_ << i_532_);
	int i_546_ = i_540_ + (i_537_ << i_532_);
	int i_547_ = i_541_ + (i_538_ << i_532_);
	int i_548_ = i_542_ + (i_539_ << i_532_);
	anIntArray9852[0] = i_543_;
	anIntArray9811[0] = i_544_;
	anIntArray9857[0] = i_545_;
	anIntArray9852[1] = i_546_;
	anIntArray9811[1] = i_544_;
	anIntArray9857[1] = i_545_;
	anIntArray9852[2] = i_543_;
	anIntArray9811[2] = i_547_;
	anIntArray9857[2] = i_545_;
	anIntArray9852[3] = i_546_;
	anIntArray9811[3] = i_547_;
	anIntArray9857[3] = i_545_;
	anIntArray9852[4] = i_543_;
	anIntArray9811[4] = i_544_;
	anIntArray9857[4] = i_548_;
	anIntArray9852[5] = i_546_;
	anIntArray9811[5] = i_544_;
	anIntArray9857[5] = i_548_;
	anIntArray9852[6] = i_543_;
	anIntArray9811[6] = i_547_;
	anIntArray9857[6] = i_548_;
	anIntArray9852[7] = i_546_;
	anIntArray9811[7] = i_547_;
	anIntArray9857[7] = i_548_;
	for (int i_549_ = 0; i_549_ < 8; i_549_++) {
	    float f_550_ = (float) anIntArray9852[i_549_];
	    float f_551_ = (float) anIntArray9811[i_549_];
	    float f_552_ = (float) anIntArray9857[i_549_];
	    float f_553_ = (class433.aFloatArray4853[2] * f_550_
			    + class433.aFloatArray4853[6] * f_551_
			    + class433.aFloatArray4853[10] * f_552_
			    + class433.aFloatArray4853[14]);
	    float f_554_ = (class433.aFloatArray4853[3] * f_550_
			    + class433.aFloatArray4853[7] * f_551_
			    + class433.aFloatArray4853[11] * f_552_
			    + class433.aFloatArray4853[15]);
	    if (f_553_ >= -f_554_) {
		float f_555_ = (class433.aFloatArray4853[0] * f_550_
				+ class433.aFloatArray4853[4] * f_551_
				+ class433.aFloatArray4853[8] * f_552_
				+ class433.aFloatArray4853[12]);
		float f_556_ = (class433.aFloatArray4853[1] * f_550_
				+ class433.aFloatArray4853[5] * f_551_
				+ class433.aFloatArray4853[9] * f_552_
				+ class433.aFloatArray4853[13]);
		float f_557_
		    = (aClass185_Sub1_9817.aFloat9257
		       + aClass185_Sub1_9817.aFloat9167 * f_555_ / f_554_);
		float f_558_
		    = (aClass185_Sub1_9817.aFloat9168
		       + aClass185_Sub1_9817.aFloat9169 * f_556_ / f_554_);
		if (f_557_ < f)
		    f = f_557_;
		if (f_557_ > f_534_)
		    f_534_ = f_557_;
		if (f_558_ < f_535_)
		    f_535_ = f_558_;
		if (f_558_ > f_536_)
		    f_536_ = f_558_;
		bool_533_ = true;
	    }
	}
	int i_559_ = i + i_530_;
	int i_560_ = i_529_ + i_531_;
	if (bool_533_ && (float) i_559_ > f && (float) i < f_534_
	    && (float) i_560_ > f_535_ && (float) i_529_ < f_536_) {
	    if (bool)
		return true;
	    if (anIntArray9820.length < anInt9813) {
		anIntArray9820 = new int[anInt9813];
		anIntArray9867 = new int[anInt9813];
	    }
	    for (int i_561_ = 0; i_561_ < anInt9807; i_561_++) {
		float f_562_ = (float) anIntArray9808[i_561_];
		float f_563_ = (float) anIntArray9809[i_561_];
		float f_564_ = (float) anIntArray9828[i_561_];
		float f_565_ = (class433.aFloatArray4853[2] * f_562_
				+ class433.aFloatArray4853[6] * f_563_
				+ class433.aFloatArray4853[10] * f_564_
				+ class433.aFloatArray4853[14]);
		float f_566_ = (class433.aFloatArray4853[3] * f_562_
				+ class433.aFloatArray4853[7] * f_563_
				+ class433.aFloatArray4853[11] * f_564_
				+ class433.aFloatArray4853[15]);
		if (f_565_ >= -f_566_) {
		    float f_567_ = (class433.aFloatArray4853[0] * f_562_
				    + class433.aFloatArray4853[4] * f_563_
				    + class433.aFloatArray4853[8] * f_564_
				    + class433.aFloatArray4853[12]);
		    float f_568_ = (class433.aFloatArray4853[1] * f_562_
				    + class433.aFloatArray4853[5] * f_563_
				    + class433.aFloatArray4853[9] * f_564_
				    + class433.aFloatArray4853[13]);
		    int i_569_ = anIntArray9853[i_561_];
		    int i_570_ = anIntArray9853[i_561_ + 1];
		    for (int i_571_ = i_569_;
			 i_571_ < i_570_ && aShortArray9863[i_571_] != 0;
			 i_571_++) {
			int i_572_ = (aShortArray9863[i_571_] & 0xffff) - 1;
			anIntArray9820[i_572_]
			    = (int) (aClass185_Sub1_9817.aFloat9257
				     + (aClass185_Sub1_9817.aFloat9167 * f_567_
					/ f_566_));
			anIntArray9867[i_572_]
			    = (int) (aClass185_Sub1_9817.aFloat9168
				     + (aClass185_Sub1_9817.aFloat9169 * f_568_
					/ f_566_));
		    }
		} else {
		    int i_573_ = anIntArray9853[i_561_];
		    int i_574_ = anIntArray9853[i_561_ + 1];
		    for (int i_575_ = i_573_;
			 i_575_ < i_574_ && aShortArray9863[i_575_] != 0;
			 i_575_++) {
			int i_576_ = (aShortArray9863[i_575_] & 0xffff) - 1;
			anIntArray9820[i_576_] = -999999;
		    }
		}
	    }
	    for (int i_577_ = 0; i_577_ < anInt9823; i_577_++) {
		if (anIntArray9820[aShortArray9847[i_577_] & 0xffff] != -999999
		    && (anIntArray9820[aShortArray9845[i_577_] & 0xffff]
			!= -999999)
		    && (anIntArray9820[aShortArray9843[i_577_] & 0xffff]
			!= -999999)
		    && (method15512
			(i, i_529_, i_559_, i_560_,
			 anIntArray9867[aShortArray9847[i_577_] & 0xffff],
			 anIntArray9867[aShortArray9845[i_577_] & 0xffff],
			 anIntArray9867[aShortArray9843[i_577_] & 0xffff],
			 anIntArray9820[aShortArray9847[i_577_] & 0xffff],
			 anIntArray9820[aShortArray9845[i_577_] & 0xffff],
			 anIntArray9820[aShortArray9843[i_577_] & 0xffff])))
		    return true;
	    }
	}
	return false;
    }
    
    boolean method15512(int i, int i_578_, int i_579_, int i_580_, int i_581_,
			int i_582_, int i_583_, int i_584_, int i_585_,
			int i_586_) {
	if (i_580_ < i_581_ && i_580_ < i_582_ && i_580_ < i_583_)
	    return false;
	if (i_578_ > i_581_ && i_578_ > i_582_ && i_578_ > i_583_)
	    return false;
	if (i_579_ < i_584_ && i_579_ < i_585_ && i_579_ < i_586_)
	    return false;
	if (i > i_584_ && i > i_585_ && i > i_586_)
	    return false;
	return true;
    }
    
    static byte[] method15513(byte[] is, int i) {
	byte[] is_587_ = new byte[i];
	System.arraycopy(is, 0, is_587_, 0, i);
	return is_587_;
    }
    
    boolean method15514(int i, int i_588_, int i_589_, int i_590_, int i_591_,
			int i_592_, int i_593_, int i_594_, int i_595_,
			int i_596_) {
	if (i_590_ < i_591_ && i_590_ < i_592_ && i_590_ < i_593_)
	    return false;
	if (i_588_ > i_591_ && i_588_ > i_592_ && i_588_ > i_593_)
	    return false;
	if (i_589_ < i_594_ && i_589_ < i_595_ && i_589_ < i_596_)
	    return false;
	if (i > i_594_ && i > i_595_ && i > i_596_)
	    return false;
	return true;
    }
    
    void method15515() {
	if ((anInt9872 & 0x37) != 0) {
	    if (aClass379_9836 != null)
		aClass379_9836.aBool3921 = false;
	} else if (aClass379_9835 != null)
	    aClass379_9835.aBool3921 = false;
    }
    
    void method15516(Class446 class446) {
	if (anInt9824 != 0 && (method15517() && method15553())) {
	    if (aClass345_9875 == null) {
		/* empty */
	    }
	    aClass185_Sub1_9817.method14712();
	    aClass185_Sub1_9817.method14605();
	    Class324 class324 = aClass185_Sub1_9817.aClass324_9158;
	    aClass185_Sub1_9817.method14733(0,
					    aClass379_9834.anInterface37_3922);
	    aClass185_Sub1_9817.method14733(1,
					    aClass379_9835.anInterface37_3922);
	    aClass185_Sub1_9817.method14733(2,
					    aClass379_9837.anInterface37_3922);
	    aClass185_Sub1_9817.method14701(aClass335_9833.anInterface39_3515);
	    aClass185_Sub1_9817.aClass433_9194.method6916(class446);
	    class324.method5794(aClass185_Sub1_9817.aClass433_9194);
	    class324.aClass433_3430.method6840();
	    if (aClass185_Sub1_9817.aBool9231) {
		Class166 class166 = aClass185_Sub1_9817.method14685();
		class324.aClass441_3438.method7105
		    (0.0F, 1.0F, 0.0F, (float) -aClass185_Sub1_9817.anInt9247);
		class324.aClass441_3438.method7110(3.0F
						   / (float) ((class166
							       .anInt1762)
							      * -1095140607));
		class324.aClass438_3431.method6997
		    (((float) (class166.anInt1763 * 2113275141 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (class166.anInt1763 * 2113275141 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (class166.anInt1763 * 2113275141 >> 0 & 0xff)
		      / 255.0F));
	    } else {
		class324.aClass441_3438.method7105(0.0F, 0.0F, 0.0F, 0.0F);
		class324.aClass438_3431.method6997(0.0F, 0.0F, 0.0F);
	    }
	    if (aClass185_Sub1_9817.anInt9252 > 0) {
		class324.aClass441_3440.method7105(0.0F, 0.0F, 1.0F,
						   -(aClass185_Sub1_9817
						     .aFloat9254));
		class324.aClass438_3435.method6997
		    (((float) (aClass185_Sub1_9817.anInt9251 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (aClass185_Sub1_9817.anInt9251 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (aClass185_Sub1_9817.anInt9251 >> 0 & 0xff)
		      / 255.0F));
		aClass185_Sub1_9817.aClass433_9194.method6916(class446);
		aClass185_Sub1_9817.aClass433_9194.method6867();
		class324.aClass441_3438
		    .method7111(aClass185_Sub1_9817.aClass433_9194);
		aClass185_Sub1_9817.aClass433_9194.method6916(class446);
		aClass185_Sub1_9817.aClass433_9194
		    .method6839(aClass185_Sub1_9817.aClass433_9142);
		aClass185_Sub1_9817.aClass433_9194.method6867();
		class324.aClass441_3440
		    .method7111(aClass185_Sub1_9817.aClass433_9194);
		class324.aClass441_3440.method7110
		    (1.0F / (aClass185_Sub1_9817.aFloat9255
			     - aClass185_Sub1_9817.aFloat9254));
	    } else {
		class324.aClass441_3440.method7105(0.0F, 0.0F, 0.0F, 0.0F);
		class324.aClass438_3435.method6997(0.0F, 0.0F, 0.0F);
	    }
	    if ((anInt9872 & 0x37) == 0) {
		aClass185_Sub1_9817
		    .method14700(aClass185_Sub1_9817.aClass349_9216);
		if (aClass185_Sub1_9817.aBool9125)
		    aClass185_Sub1_9817.method14648(false);
		for (int i = 0; i < anIntArray9854.length; i++) {
		    int i_597_ = anIntArray9827[i];
		    int i_598_ = anIntArray9827[i + 1];
		    int i_599_ = aShortArray9830[i_597_];
		    boolean bool = false;
		    byte i_600_ = 0;
		    if (i_599_ != -1) {
			Class186 class186
			    = aClass185_Sub1_9817.aClass177_2012
				  .method2931(i_599_ & 0xffff, (byte) 1);
			class324.anInterface38_3432
			    = aClass185_Sub1_9817.aClass354_9211
				  .method6267(class186);
			bool = !Class72.method1559(class186.aByte2067,
						   -2056182682);
			class324.aClass433_3430.aFloatArray4853[12]
			    = ((float) (aClass185_Sub1_9817.anInt9264 % 128000)
			       / 1000.0F * (float) class186.aByte2047 / 64.0F
			       % 1.0F);
			class324.aClass433_3430.aFloatArray4853[13]
			    = ((float) (aClass185_Sub1_9817.anInt9264 % 128000)
			       / 1000.0F * (float) class186.aByte2048 / 64.0F
			       % 1.0F);
			if (class186.aClass599_2064 == Class599.aClass599_7868)
			    i_600_ = class186.aByte2051;
		    } else {
			class324.anInterface38_3432
			    = aClass185_Sub1_9817.anInterface38_9204;
			float[] fs = class324.aClass433_3430.aFloatArray4853;
			class324.aClass433_3430.aFloatArray4853[13] = 0.0F;
			fs[12] = 0.0F;
		    }
		    aClass185_Sub1_9817.method14959(i_600_);
		    class324.anInt3447 = anIntArray9854[i];
		    class324.anInt3428 = anIntArray9855[i];
		    class324.anInt3449 = i_597_ * 3;
		    class324.anInt3450 = i_598_ - i_597_;
		    class324.method5812(bool);
		}
	    } else {
		aClass185_Sub1_9817
		    .method14733(3, aClass379_9836.anInterface37_3922);
		aClass185_Sub1_9817
		    .method14700(aClass185_Sub1_9817.aClass349_9285);
		Class446 class446_601_ = aClass185_Sub1_9817.aClass446_9166;
		class446_601_.method7236(class446);
		class446_601_.method7243();
		int i = 0;
		if (aClass185_Sub1_9817.aBool9125)
		    aClass185_Sub1_9817.method14648(true);
		else {
		    class324.aClass438_3442.method6997
			(aClass185_Sub1_9817.aFloatArray9197[0],
			 aClass185_Sub1_9817.aFloatArray9197[1],
			 aClass185_Sub1_9817.aFloatArray9197[2]);
		    class324.aClass438_3442.method7059(class446_601_);
		    class324.aClass438_3443.method6997
			((aClass185_Sub1_9817.aFloat9206
			  * aClass185_Sub1_9817.aFloat9159),
			 (aClass185_Sub1_9817.aFloat9206
			  * aClass185_Sub1_9817.aFloat9292),
			 (aClass185_Sub1_9817.aFloat9206
			  * aClass185_Sub1_9817.aFloat9163));
		    class324.aClass438_3444.method6997
			((-aClass185_Sub1_9817.aFloat9267
			  * aClass185_Sub1_9817.aFloat9159),
			 (-aClass185_Sub1_9817.aFloat9267
			  * aClass185_Sub1_9817.aFloat9292),
			 (-aClass185_Sub1_9817.aFloat9267
			  * aClass185_Sub1_9817.aFloat9163));
		    class324.aClass438_3445.method6997
			((aClass185_Sub1_9817.aFloat9205
			  * aClass185_Sub1_9817.aFloat9159),
			 (aClass185_Sub1_9817.aFloat9205
			  * aClass185_Sub1_9817.aFloat9292),
			 (aClass185_Sub1_9817.aFloat9205
			  * aClass185_Sub1_9817.aFloat9163));
		    if (aClass185_Sub1_9817.anInt9209 > 0) {
			i = aClass185_Sub1_9817.anInt9209;
			Class438 class438 = aClass185_Sub1_9817.aClass438_9151;
			for (int i_602_ = 0; i_602_ < i; i_602_++) {
			    Class534_Sub21 class534_sub21
				= (aClass185_Sub1_9817.aClass534_Sub21Array9208
				   [i_602_]);
			    int i_603_ = class534_sub21.method16201((byte) -1);
			    class438
				.method6992(class534_sub21.aClass438_10529);
			    class438.method7022(class446_601_);
			    class324.aFloatArray3448[i_602_ * 4 + 0]
				= class438.aFloat4864;
			    class324.aFloatArray3448[i_602_ * 4 + 1]
				= class438.aFloat4863;
			    class324.aFloatArray3448[i_602_ * 4 + 2]
				= class438.aFloat4865;
			    class324.aFloatArray3448[i_602_ * 4 + 3]
				= 1.0F / (float) (class534_sub21
						      .method16233(-896850435)
						  * (class534_sub21.method16233
						     (-1610414115)));
			    float f = (class534_sub21.method16202(-693604944)
				       / 255.0F);
			    class324.aFloatArray3439[i_602_ * 4 + 0]
				= (float) (i_603_ >> 16 & 0xff) * f;
			    class324.aFloatArray3439[i_602_ * 4 + 1]
				= (float) (i_603_ >> 8 & 0xff) * f;
			    class324.aFloatArray3439[i_602_ * 4 + 2]
				= (float) (i_603_ & 0xff) * f;
			    class324.aFloatArray3439[i_602_ * 4 + 3] = 1.0F;
			}
		    }
		}
		for (int i_604_ = 0; i_604_ < anIntArray9854.length;
		     i_604_++) {
		    int i_605_ = anIntArray9827[i_604_];
		    int i_606_ = anIntArray9827[i_604_ + 1];
		    int i_607_ = aShortArray9830[i_605_];
		    byte i_608_ = 11;
		    Class186 class186 = null;
		    byte i_609_ = 0;
		    if (i_607_ != -1) {
			class186 = aClass185_Sub1_9817.aClass177_2012
				       .method2931(i_607_ & 0xffff, (byte) 1);
			class324.anInterface38_3432
			    = aClass185_Sub1_9817.aClass354_9211
				  .method6267(class186);
			i_608_ = class186.aByte2067;
			class324.method5793(class186.aByte2068);
			class324.aClass433_3430.aFloatArray4853[12]
			    = ((float) (aClass185_Sub1_9817.anInt9264 % 128000)
			       / 1000.0F * (float) class186.aByte2047 / 64.0F
			       % 1.0F);
			class324.aClass433_3430.aFloatArray4853[13]
			    = ((float) (aClass185_Sub1_9817.anInt9264 % 128000)
			       / 1000.0F * (float) class186.aByte2048 / 64.0F
			       % 1.0F);
			if (class186.aClass599_2064 == Class599.aClass599_7868)
			    i_609_ = class186.aByte2051;
		    } else {
			class324.anInterface38_3432
			    = aClass185_Sub1_9817.anInterface38_9204;
			float[] fs = class324.aClass433_3430.aFloatArray4853;
			class324.aClass433_3430.aFloatArray4853[13] = 0.0F;
			fs[12] = 0.0F;
		    }
		    aClass185_Sub1_9817.method14959(i_609_);
		    class324.anInt3447 = anIntArray9854[i_604_];
		    class324.anInt3428 = anIntArray9855[i_604_];
		    class324.anInt3449 = i_605_ * 3;
		    class324.anInt3450 = i_606_ - i_605_;
		    switch (i_608_) {
		    case 6:
			class324.method5812(!Class72.method1559(i_608_,
								-2113364237));
			break;
		    default:
			class324.method5796(i);
			break;
		    case 5:
			if (!aClass185_Sub1_9817.aBool9125) {
			    Class348_Sub1_Sub1 class348_sub1_sub1
				= aClass185_Sub1_9817.aClass348_Sub1_Sub1_9237;
			    class348_sub1_sub1.method17975(class186.aByte2068,
							   (class186.anInt2069
							    * 1880963453),
							   (byte) 78);
			    class348_sub1_sub1.aClass433_11448
				.method6916(class446);
			    class348_sub1_sub1.aClass433_11437
				.method6916(class446);
			    class348_sub1_sub1.aClass433_11437.method6839
				(aClass185_Sub1_9817.aClass433_9164);
			    class348_sub1_sub1.anInt11451
				= anIntArray9854[i_604_] * -89724309;
			    class348_sub1_sub1.anInt11452
				= anIntArray9855[i_604_] * -890917363;
			    class348_sub1_sub1.anInt11453
				= i_605_ * -1012786239;
			    class348_sub1_sub1.anInt11443
				= (i_606_ - i_605_) * -694101341;
			    class348_sub1_sub1.method17976(216015837);
			} else
			    class324.method5796(i);
			break;
		    case 7:
			class324.aClass438_3433.method6997
			    ((aClass185_Sub1_9817.aClass433_9118
			      .aFloatArray4853[12]),
			     (aClass185_Sub1_9817.aClass433_9118
			      .aFloatArray4853[13]),
			     (aClass185_Sub1_9817.aClass433_9118
			      .aFloatArray4853[14]));
			class324.aClass438_3433.method7022(class446_601_);
			class324.aClass433_3446.method6916(class446);
			class324.anInterface41_3434
			    = aClass185_Sub1_9817.method14616();
			class324.method5805(i);
			break;
		    case 1:
			class324.aClass438_3433.method6997
			    ((aClass185_Sub1_9817.aClass433_9118
			      .aFloatArray4853[12]),
			     (aClass185_Sub1_9817.aClass433_9118
			      .aFloatArray4853[13]),
			     (aClass185_Sub1_9817.aClass433_9118
			      .aFloatArray4853[14]));
			class324.aClass438_3433.method7022(class446_601_);
			class324.method5810(i);
		    }
		}
	    }
	    method15503();
	}
    }
    
    public boolean method3027() {
	return aBool9840;
    }
    
    public int method3151() {
	return aShort9805;
    }
    
    boolean method15517() {
	boolean bool = !aClass379_9835.aBool3921;
	boolean bool_610_
	    = (anInt9872 & 0x37) != 0 && !aClass379_9836.aBool3921;
	boolean bool_611_ = !aClass379_9834.aBool3921;
	boolean bool_612_ = !aClass379_9837.aBool3921;
	if (!bool_611_ && !bool && !bool_610_ && !bool_612_)
	    return true;
	boolean bool_613_ = true;
	if (bool_611_ && aShortArray9801 != null) {
	    if (aClass379_9834.anInterface37_3924 == null)
		aClass379_9834.anInterface37_3924
		    = aClass185_Sub1_9817.method14698(aBool9838);
	    Interface37 interface37 = aClass379_9834.anInterface37_3924;
	    interface37.method236(anInt9813 * 12, 12);
	    Unsafe unsafe = aClass185_Sub1_9817.anUnsafe9127;
	    if (unsafe != null) {
		int i = anInt9813 * 12;
		long l = interface37.method227(0, i);
		for (int i_614_ = 0; i_614_ < anInt9813; i_614_++) {
		    short i_615_ = aShortArray9801[i_614_];
		    unsafe.putFloat(l, (float) anIntArray9808[i_615_]);
		    l += 4L;
		    unsafe.putFloat(l, (float) anIntArray9809[i_615_]);
		    l += 4L;
		    unsafe.putFloat(l, (float) anIntArray9828[i_615_]);
		    l += 4L;
		}
		interface37.method228();
	    } else {
		ByteBuffer bytebuffer = aClass185_Sub1_9817.aByteBuffer9266;
		bytebuffer.clear();
		for (int i = 0; i < anInt9813; i++) {
		    bytebuffer
			.putFloat((float) anIntArray9808[aShortArray9801[i]]);
		    bytebuffer
			.putFloat((float) anIntArray9809[aShortArray9801[i]]);
		    bytebuffer
			.putFloat((float) anIntArray9828[aShortArray9801[i]]);
		}
		interface37.method235(0, bytebuffer.position(),
				      aClass185_Sub1_9817.aLong9139);
	    }
	    aClass379_9834.anInterface37_3922 = interface37;
	    aClass379_9834.aBool3921 = true;
	}
	if (bool) {
	    if (aClass379_9835.anInterface37_3924 == null)
		aClass379_9835.anInterface37_3924
		    = aClass185_Sub1_9817.method14698(aBool9838);
	    Interface37 interface37 = aClass379_9835.anInterface37_3924;
	    interface37.method236(anInt9813 * 4, 4);
	    Unsafe unsafe = aClass185_Sub1_9817.anUnsafe9127;
	    if (unsafe != null) {
		int i = anInt9813 * 4;
		long l = interface37.method227(0, i);
		if ((anInt9872 & 0x37) == 0) {
		    short[] is;
		    short[] is_616_;
		    short[] is_617_;
		    byte[] is_618_;
		    if (aClass363_9822 != null) {
			is = aClass363_9822.aShortArray3722;
			is_616_ = aClass363_9822.aShortArray3720;
			is_617_ = aClass363_9822.aShortArray3723;
			is_618_ = aClass363_9822.aByteArray3721;
		    } else {
			is = aShortArray9816;
			is_616_ = aShortArray9864;
			is_617_ = aShortArray9869;
			is_618_ = aByteArray9814;
		    }
		    float f = (aClass185_Sub1_9817.aFloat9206 * 768.0F
			       / (float) aShort9805);
		    float f_619_ = (aClass185_Sub1_9817.aFloat9267 * 768.0F
				    / (float) aShort9805);
		    for (int i_620_ = 0; i_620_ < anInt9813; i_620_++) {
			short i_621_ = aShortArray9815[i_620_];
			int i_622_
			    = method15527(aShortArray9825[i_621_] & 0xffff,
					  aShortArray9830[i_621_], aShort9804);
			float f_623_ = ((float) (i_622_ >> 16 & 0xff)
					* aClass185_Sub1_9817.aFloat9159);
			float f_624_ = ((float) (i_622_ >> 8 & 0xff)
					* aClass185_Sub1_9817.aFloat9292);
			float f_625_ = ((float) (i_622_ & 0xff)
					* aClass185_Sub1_9817.aFloat9163);
			byte i_626_ = is_618_[i_620_];
			float f_627_;
			if (i_626_ == 0)
			    f_627_
				= (((aClass185_Sub1_9817.aFloatArray9197[0]
				     * (float) is[i_620_])
				    + (aClass185_Sub1_9817.aFloatArray9197[1]
				       * (float) is_616_[i_620_])
				    + (aClass185_Sub1_9817.aFloatArray9197[2]
				       * (float) is_617_[i_620_]))
				   * 0.0026041667F);
			else
			    f_627_
				= (((aClass185_Sub1_9817.aFloatArray9197[0]
				     * (float) is[i_620_])
				    + (aClass185_Sub1_9817.aFloatArray9197[1]
				       * (float) is_616_[i_620_])
				    + (aClass185_Sub1_9817.aFloatArray9197[2]
				       * (float) is_617_[i_620_]))
				   / ((float) i_626_ * 256.0F));
			float f_628_
			    = (aClass185_Sub1_9817.aFloat9205
			       + f_627_ * (f_627_ < 0.0F ? f_619_ : f));
			int i_629_ = (int) (f_623_ * f_628_);
			if (i_629_ < 0)
			    i_629_ = 0;
			else if (i_629_ > 255)
			    i_629_ = 255;
			int i_630_ = (int) (f_624_ * f_628_);
			if (i_630_ < 0)
			    i_630_ = 0;
			else if (i_630_ > 255)
			    i_630_ = 255;
			int i_631_ = (int) (f_625_ * f_628_);
			if (i_631_ < 0)
			    i_631_ = 0;
			else if (i_631_ > 255)
			    i_631_ = 255;
			unsafe.putInt(l,
				      (255 - aByteArray9826[i_621_] << 24
				       | i_629_ << 16 | i_630_ << 8 | i_631_));
			l += 4L;
		    }
		} else {
		    for (int i_632_ = 0; i_632_ < anInt9813; i_632_++) {
			short i_633_ = aShortArray9815[i_632_];
			int i_634_
			    = (255 - aByteArray9826[i_633_] << 24
			       | method15527(aShortArray9825[i_633_] & 0xffff,
					     aShortArray9830[i_633_],
					     aShort9804));
			unsafe.putInt(l, i_634_);
			l += 4L;
		    }
		}
		interface37.method228();
	    } else {
		ByteBuffer bytebuffer = aClass185_Sub1_9817.aByteBuffer9266;
		bytebuffer.clear();
		if ((anInt9872 & 0x37) == 0) {
		    short[] is;
		    short[] is_635_;
		    short[] is_636_;
		    byte[] is_637_;
		    if (aClass363_9822 != null) {
			is = aClass363_9822.aShortArray3722;
			is_635_ = aClass363_9822.aShortArray3720;
			is_636_ = aClass363_9822.aShortArray3723;
			is_637_ = aClass363_9822.aByteArray3721;
		    } else {
			is = aShortArray9816;
			is_635_ = aShortArray9864;
			is_636_ = aShortArray9869;
			is_637_ = aByteArray9814;
		    }
		    float f = (aClass185_Sub1_9817.aFloat9206 * 768.0F
			       / (float) aShort9805);
		    float f_638_ = (aClass185_Sub1_9817.aFloat9267 * 768.0F
				    / (float) aShort9805);
		    for (int i = 0; i < anInt9813; i++) {
			short i_639_ = aShortArray9815[i];
			int i_640_
			    = method15527(aShortArray9825[i_639_] & 0xffff,
					  aShortArray9830[i_639_], aShort9804);
			float f_641_ = ((float) (i_640_ >> 16 & 0xff)
					* aClass185_Sub1_9817.aFloat9159);
			float f_642_ = ((float) (i_640_ >> 8 & 0xff)
					* aClass185_Sub1_9817.aFloat9292);
			float f_643_ = ((float) (i_640_ & 0xff)
					* aClass185_Sub1_9817.aFloat9163);
			byte i_644_ = is_637_[i];
			float f_645_;
			if (i_644_ == 0)
			    f_645_
				= ((aClass185_Sub1_9817.aFloatArray9197[0]
				    * (float) is[i])
				   + (aClass185_Sub1_9817.aFloatArray9197[1]
				      * (float) is_635_[i])
				   + (aClass185_Sub1_9817.aFloatArray9197[2]
				      * (float) is_636_[i])) * 0.0026041667F;
			else
			    f_645_
				= (((aClass185_Sub1_9817.aFloatArray9197[0]
				     * (float) is[i])
				    + (aClass185_Sub1_9817.aFloatArray9197[1]
				       * (float) is_635_[i])
				    + (aClass185_Sub1_9817.aFloatArray9197[2]
				       * (float) is_636_[i]))
				   / ((float) i_644_ * 256.0F));
			float f_646_
			    = (aClass185_Sub1_9817.aFloat9205
			       + f_645_ * (f_645_ < 0.0F ? f_638_ : f));
			int i_647_ = (int) (f_641_ * f_646_);
			if (i_647_ < 0)
			    i_647_ = 0;
			else if (i_647_ > 255)
			    i_647_ = 255;
			int i_648_ = (int) (f_642_ * f_646_);
			if (i_648_ < 0)
			    i_648_ = 0;
			else if (i_648_ > 255)
			    i_648_ = 255;
			int i_649_ = (int) (f_643_ * f_646_);
			if (i_649_ < 0)
			    i_649_ = 0;
			else if (i_649_ > 255)
			    i_649_ = 255;
			bytebuffer.putInt(255 - aByteArray9826[i_639_] << 24
					  | i_647_ << 16 | i_648_ << 8
					  | i_649_);
		    }
		} else {
		    for (int i = 0; i < anInt9813; i++) {
			short i_650_ = aShortArray9815[i];
			int i_651_
			    = (255 - aByteArray9826[i_650_] << 24
			       | method15527(aShortArray9825[i_650_] & 0xffff,
					     aShortArray9830[i_650_],
					     aShort9804));
			bytebuffer.putInt(i_651_);
		    }
		}
		interface37.method235(0, bytebuffer.position(),
				      aClass185_Sub1_9817.aLong9139);
	    }
	    aClass379_9835.anInterface37_3922 = interface37;
	    aClass379_9835.aBool3921 = true;
	}
	if (bool_610_) {
	    if (aClass379_9836.anInterface37_3924 == null)
		aClass379_9836.anInterface37_3924
		    = aClass185_Sub1_9817.method14698(aBool9838);
	    Interface37 interface37 = aClass379_9836.anInterface37_3924;
	    interface37.method236(anInt9813 * 12, 12);
	    short[] is;
	    short[] is_652_;
	    short[] is_653_;
	    byte[] is_654_;
	    if (aClass363_9822 != null) {
		is = aClass363_9822.aShortArray3722;
		is_652_ = aClass363_9822.aShortArray3720;
		is_653_ = aClass363_9822.aShortArray3723;
		is_654_ = aClass363_9822.aByteArray3721;
	    } else {
		is = aShortArray9816;
		is_652_ = aShortArray9864;
		is_653_ = aShortArray9869;
		is_654_ = aByteArray9814;
	    }
	    Unsafe unsafe = aClass185_Sub1_9817.anUnsafe9127;
	    if (unsafe != null) {
		int i = anInt9813 * 12;
		long l = interface37.method227(0, i);
		for (int i_655_ = 0; i_655_ < anInt9813; i_655_++) {
		    Class438 class438 = new Class438((float) is[i_655_],
						     (float) is_652_[i_655_],
						     (float) is_653_[i_655_]);
		    if (class438.method7012() != 0.0F) {
			if (is_654_[i_655_] > 1)
			    class438.method7042((float) is_654_[i_655_]);
			class438.method7002();
		    }
		    unsafe.putFloat(l, class438.aFloat4864);
		    l += 4L;
		    unsafe.putFloat(l, class438.aFloat4863);
		    l += 4L;
		    unsafe.putFloat(l, class438.aFloat4865);
		    l += 4L;
		}
		interface37.method228();
	    } else {
		ByteBuffer bytebuffer = aClass185_Sub1_9817.aByteBuffer9266;
		bytebuffer.clear();
		for (int i = 0; i < anInt9813; i++) {
		    Class438 class438
			= new Class438((float) is[i], (float) is_652_[i],
				       (float) is_653_[i]);
		    if (class438.method7012() != 0.0F) {
			if (is_654_[i] > 1)
			    class438.method7042((float) is_654_[i]);
			class438.method7002();
		    }
		    bytebuffer.putFloat(class438.aFloat4864);
		    bytebuffer.putFloat(class438.aFloat4863);
		    bytebuffer.putFloat(class438.aFloat4865);
		}
		interface37.method235(0, bytebuffer.position(),
				      aClass185_Sub1_9817.aLong9139);
	    }
	    aClass379_9836.anInterface37_3922 = interface37;
	    aClass379_9836.aBool3921 = true;
	}
	if (bool_612_) {
	    if (aClass379_9837.anInterface37_3924 == null)
		aClass379_9837.anInterface37_3924
		    = aClass185_Sub1_9817.method14698(aBool9838);
	    Interface37 interface37 = aClass379_9837.anInterface37_3924;
	    interface37.method236(anInt9813 * 8, 8);
	    Unsafe unsafe = aClass185_Sub1_9817.anUnsafe9127;
	    if (unsafe != null) {
		int i = anInt9813 * 8;
		long l = interface37.method227(0, i);
		for (int i_656_ = 0; i_656_ < anInt9813; i_656_++) {
		    unsafe.putFloat(l, aFloatArray9829[i_656_]);
		    l += 4L;
		    unsafe.putFloat(l, aFloatArray9821[i_656_]);
		    l += 4L;
		}
		interface37.method228();
	    } else {
		ByteBuffer bytebuffer = aClass185_Sub1_9817.aByteBuffer9266;
		bytebuffer.clear();
		for (int i = 0; i < anInt9813; i++) {
		    bytebuffer.putFloat(aFloatArray9829[i]);
		    bytebuffer.putFloat(aFloatArray9821[i]);
		}
		interface37.method235(0, bytebuffer.position(),
				      aClass185_Sub1_9817.aLong9139);
	    }
	    aClass379_9837.anInterface37_3922 = interface37;
	    aClass379_9837.aBool3921 = true;
	}
	return bool_613_;
    }
    
    void method15518() {
	if (aClass379_9834 != null)
	    aClass379_9834.method6423();
	if (aClass379_9837 != null)
	    aClass379_9837.method6423();
	if (aClass379_9835 != null)
	    aClass379_9835.method6423();
	if (aClass379_9836 != null)
	    aClass379_9836.method6423();
	if (aClass335_9833 != null)
	    aClass335_9833.method5899();
    }
    
    public void method3119() {
	if (!aBool9851) {
	    if (!aBool9850)
		method15507();
	    anInt9844 = anInt9799;
	    aBool9851 = true;
	}
    }
    
    void method15519() {
	if ((anInt9872 & 0x37) != 0) {
	    if (aClass379_9836 != null)
		aClass379_9836.aBool3921 = false;
	} else if (aClass379_9835 != null)
	    aClass379_9835.aBool3921 = false;
    }
    
    void method3202() {
	/* empty */
    }
    
    public void method3063(Class183 class183, int i, int i_657_, int i_658_,
			   boolean bool) {
	Class183_Sub3 class183_sub3_659_ = (Class183_Sub3) class183;
	if (anInt9823 != 0 && class183_sub3_659_.anInt9823 != 0) {
	    int i_660_ = class183_sub3_659_.anInt9807;
	    int[] is = class183_sub3_659_.anIntArray9808;
	    int[] is_661_ = class183_sub3_659_.anIntArray9809;
	    int[] is_662_ = class183_sub3_659_.anIntArray9828;
	    short[] is_663_ = class183_sub3_659_.aShortArray9816;
	    short[] is_664_ = class183_sub3_659_.aShortArray9864;
	    short[] is_665_ = class183_sub3_659_.aShortArray9869;
	    byte[] is_666_ = class183_sub3_659_.aByteArray9814;
	    short[] is_667_;
	    short[] is_668_;
	    short[] is_669_;
	    byte[] is_670_;
	    if (aClass363_9822 != null) {
		is_667_ = aClass363_9822.aShortArray3722;
		is_668_ = aClass363_9822.aShortArray3720;
		is_669_ = aClass363_9822.aShortArray3723;
		is_670_ = aClass363_9822.aByteArray3721;
	    } else {
		is_667_ = null;
		is_668_ = null;
		is_669_ = null;
		is_670_ = null;
	    }
	    short[] is_671_;
	    short[] is_672_;
	    short[] is_673_;
	    byte[] is_674_;
	    if (class183_sub3_659_.aClass363_9822 != null) {
		is_671_ = class183_sub3_659_.aClass363_9822.aShortArray3722;
		is_672_ = class183_sub3_659_.aClass363_9822.aShortArray3720;
		is_673_ = class183_sub3_659_.aClass363_9822.aShortArray3723;
		is_674_ = class183_sub3_659_.aClass363_9822.aByteArray3721;
	    } else {
		is_671_ = null;
		is_672_ = null;
		is_673_ = null;
		is_674_ = null;
	    }
	    int[] is_675_ = class183_sub3_659_.anIntArray9853;
	    short[] is_676_ = class183_sub3_659_.aShortArray9863;
	    if (!class183_sub3_659_.aBool9850)
		class183_sub3_659_.method15507();
	    int i_677_ = class183_sub3_659_.anInt9799;
	    int i_678_ = class183_sub3_659_.anInt9846;
	    int i_679_ = class183_sub3_659_.anInt9865;
	    int i_680_ = class183_sub3_659_.anInt9848;
	    int i_681_ = class183_sub3_659_.anInt9849;
	    int i_682_ = class183_sub3_659_.anInt9866;
	    for (int i_683_ = 0; i_683_ < anInt9807; i_683_++) {
		int i_684_ = anIntArray9809[i_683_] - i_657_;
		if (i_684_ >= i_677_ && i_684_ <= i_678_) {
		    int i_685_ = anIntArray9808[i_683_] - i;
		    if (i_685_ >= i_679_ && i_685_ <= i_680_) {
			int i_686_ = anIntArray9828[i_683_] - i_658_;
			if (i_686_ >= i_681_ && i_686_ <= i_682_) {
			    int i_687_ = -1;
			    int i_688_ = anIntArray9853[i_683_];
			    int i_689_ = anIntArray9853[i_683_ + 1];
			    for (int i_690_ = i_688_;
				 (i_690_ < i_689_
				  && aShortArray9863[i_690_] != 0);
				 i_690_++) {
				i_687_
				    = (aShortArray9863[i_690_] & 0xffff) - 1;
				if (aByteArray9814[i_687_] != 0)
				    break;
			    }
			    if (i_687_ != -1) {
				for (int i_691_ = 0; i_691_ < i_660_;
				     i_691_++) {
				    if (i_685_ == is[i_691_]
					&& i_686_ == is_662_[i_691_]
					&& i_684_ == is_661_[i_691_]) {
					int i_692_ = -1;
					i_688_ = is_675_[i_691_];
					i_689_ = is_675_[i_691_ + 1];
					for (int i_693_ = i_688_;
					     (i_693_ < i_689_
					      && is_676_[i_693_] != 0);
					     i_693_++) {
					    i_692_
						= is_676_[i_693_] - 1 & 0xffff;
					    if (is_666_[i_692_] != 0)
						break;
					}
					if (i_692_ != -1) {
					    if (is_667_ == null) {
						aClass363_9822
						    = new Class363();
						is_667_
						    = aClass363_9822
							  .aShortArray3722
						    = (Class534_Sub42
							   .method16820
						       (aShortArray9816,
							(byte) 2));
						is_668_
						    = aClass363_9822
							  .aShortArray3720
						    = (Class534_Sub42
							   .method16820
						       (aShortArray9864,
							(byte) 2));
						is_669_
						    = aClass363_9822
							  .aShortArray3723
						    = (Class534_Sub42
							   .method16820
						       (aShortArray9869,
							(byte) 2));
						is_670_
						    = aClass363_9822
							  .aByteArray3721
						    = (Class586.method9861
						       (aByteArray9814,
							-16711936));
					    }
					    if (is_671_ == null) {
						Class363 class363
						    = (class183_sub3_659_
							   .aClass363_9822
						       = new Class363());
						is_671_
						    = class363.aShortArray3722
						    = (Class534_Sub42
							   .method16820
						       (is_663_, (byte) 2));
						is_672_
						    = class363.aShortArray3720
						    = (Class534_Sub42
							   .method16820
						       (is_664_, (byte) 2));
						is_673_
						    = class363.aShortArray3723
						    = (Class534_Sub42
							   .method16820
						       (is_665_, (byte) 2));
						is_674_
						    = class363.aByteArray3721
						    = (Class586.method9861
						       (is_666_, -16711936));
					    }
					    short i_694_
						= aShortArray9816[i_687_];
					    short i_695_
						= aShortArray9864[i_687_];
					    short i_696_
						= aShortArray9869[i_687_];
					    byte i_697_
						= aByteArray9814[i_687_];
					    i_688_ = is_675_[i_691_];
					    i_689_ = is_675_[i_691_ + 1];
					    for (int i_698_ = i_688_;
						 i_698_ < i_689_; i_698_++) {
						int i_699_
						    = is_676_[i_698_] - 1;
						if (i_699_ == -1)
						    break;
						if (is_674_[i_699_] != 0) {
						    is_671_[i_699_] += i_694_;
						    is_672_[i_699_] += i_695_;
						    is_673_[i_699_] += i_696_;
						    is_674_[i_699_] += i_697_;
						}
					    }
					    i_694_ = is_663_[i_692_];
					    i_695_ = is_664_[i_692_];
					    i_696_ = is_665_[i_692_];
					    i_697_ = is_666_[i_692_];
					    i_688_ = anIntArray9853[i_683_];
					    i_689_
						= anIntArray9853[i_683_ + 1];
					    for (int i_700_ = i_688_;
						 (i_700_ < i_689_
						  && (aShortArray9863[i_700_]
						      != 0));
						 i_700_++) {
						int i_701_
						    = ((aShortArray9863[i_700_]
							& 0xffff)
						       - 1);
						if (is_670_[i_701_] != 0) {
						    is_667_[i_701_] += i_694_;
						    is_668_[i_701_] += i_695_;
						    is_669_[i_701_] += i_696_;
						    is_670_[i_701_] += i_697_;
						}
					    }
					    class183_sub3_659_.method15505();
					    method15505();
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method3069(Class183 class183, int i, int i_702_, int i_703_,
			   boolean bool) {
	Class183_Sub3 class183_sub3_704_ = (Class183_Sub3) class183;
	if (anInt9823 != 0 && class183_sub3_704_.anInt9823 != 0) {
	    int i_705_ = class183_sub3_704_.anInt9807;
	    int[] is = class183_sub3_704_.anIntArray9808;
	    int[] is_706_ = class183_sub3_704_.anIntArray9809;
	    int[] is_707_ = class183_sub3_704_.anIntArray9828;
	    short[] is_708_ = class183_sub3_704_.aShortArray9816;
	    short[] is_709_ = class183_sub3_704_.aShortArray9864;
	    short[] is_710_ = class183_sub3_704_.aShortArray9869;
	    byte[] is_711_ = class183_sub3_704_.aByteArray9814;
	    short[] is_712_;
	    short[] is_713_;
	    short[] is_714_;
	    byte[] is_715_;
	    if (aClass363_9822 != null) {
		is_712_ = aClass363_9822.aShortArray3722;
		is_713_ = aClass363_9822.aShortArray3720;
		is_714_ = aClass363_9822.aShortArray3723;
		is_715_ = aClass363_9822.aByteArray3721;
	    } else {
		is_712_ = null;
		is_713_ = null;
		is_714_ = null;
		is_715_ = null;
	    }
	    short[] is_716_;
	    short[] is_717_;
	    short[] is_718_;
	    byte[] is_719_;
	    if (class183_sub3_704_.aClass363_9822 != null) {
		is_716_ = class183_sub3_704_.aClass363_9822.aShortArray3722;
		is_717_ = class183_sub3_704_.aClass363_9822.aShortArray3720;
		is_718_ = class183_sub3_704_.aClass363_9822.aShortArray3723;
		is_719_ = class183_sub3_704_.aClass363_9822.aByteArray3721;
	    } else {
		is_716_ = null;
		is_717_ = null;
		is_718_ = null;
		is_719_ = null;
	    }
	    int[] is_720_ = class183_sub3_704_.anIntArray9853;
	    short[] is_721_ = class183_sub3_704_.aShortArray9863;
	    if (!class183_sub3_704_.aBool9850)
		class183_sub3_704_.method15507();
	    int i_722_ = class183_sub3_704_.anInt9799;
	    int i_723_ = class183_sub3_704_.anInt9846;
	    int i_724_ = class183_sub3_704_.anInt9865;
	    int i_725_ = class183_sub3_704_.anInt9848;
	    int i_726_ = class183_sub3_704_.anInt9849;
	    int i_727_ = class183_sub3_704_.anInt9866;
	    for (int i_728_ = 0; i_728_ < anInt9807; i_728_++) {
		int i_729_ = anIntArray9809[i_728_] - i_702_;
		if (i_729_ >= i_722_ && i_729_ <= i_723_) {
		    int i_730_ = anIntArray9808[i_728_] - i;
		    if (i_730_ >= i_724_ && i_730_ <= i_725_) {
			int i_731_ = anIntArray9828[i_728_] - i_703_;
			if (i_731_ >= i_726_ && i_731_ <= i_727_) {
			    int i_732_ = -1;
			    int i_733_ = anIntArray9853[i_728_];
			    int i_734_ = anIntArray9853[i_728_ + 1];
			    for (int i_735_ = i_733_;
				 (i_735_ < i_734_
				  && aShortArray9863[i_735_] != 0);
				 i_735_++) {
				i_732_
				    = (aShortArray9863[i_735_] & 0xffff) - 1;
				if (aByteArray9814[i_732_] != 0)
				    break;
			    }
			    if (i_732_ != -1) {
				for (int i_736_ = 0; i_736_ < i_705_;
				     i_736_++) {
				    if (i_730_ == is[i_736_]
					&& i_731_ == is_707_[i_736_]
					&& i_729_ == is_706_[i_736_]) {
					int i_737_ = -1;
					i_733_ = is_720_[i_736_];
					i_734_ = is_720_[i_736_ + 1];
					for (int i_738_ = i_733_;
					     (i_738_ < i_734_
					      && is_721_[i_738_] != 0);
					     i_738_++) {
					    i_737_
						= is_721_[i_738_] - 1 & 0xffff;
					    if (is_711_[i_737_] != 0)
						break;
					}
					if (i_737_ != -1) {
					    if (is_712_ == null) {
						aClass363_9822
						    = new Class363();
						is_712_
						    = aClass363_9822
							  .aShortArray3722
						    = (Class534_Sub42
							   .method16820
						       (aShortArray9816,
							(byte) 2));
						is_713_
						    = aClass363_9822
							  .aShortArray3720
						    = (Class534_Sub42
							   .method16820
						       (aShortArray9864,
							(byte) 2));
						is_714_
						    = aClass363_9822
							  .aShortArray3723
						    = (Class534_Sub42
							   .method16820
						       (aShortArray9869,
							(byte) 2));
						is_715_
						    = aClass363_9822
							  .aByteArray3721
						    = (Class586.method9861
						       (aByteArray9814,
							-16711936));
					    }
					    if (is_716_ == null) {
						Class363 class363
						    = (class183_sub3_704_
							   .aClass363_9822
						       = new Class363());
						is_716_
						    = class363.aShortArray3722
						    = (Class534_Sub42
							   .method16820
						       (is_708_, (byte) 2));
						is_717_
						    = class363.aShortArray3720
						    = (Class534_Sub42
							   .method16820
						       (is_709_, (byte) 2));
						is_718_
						    = class363.aShortArray3723
						    = (Class534_Sub42
							   .method16820
						       (is_710_, (byte) 2));
						is_719_
						    = class363.aByteArray3721
						    = (Class586.method9861
						       (is_711_, -16711936));
					    }
					    short i_739_
						= aShortArray9816[i_732_];
					    short i_740_
						= aShortArray9864[i_732_];
					    short i_741_
						= aShortArray9869[i_732_];
					    byte i_742_
						= aByteArray9814[i_732_];
					    i_733_ = is_720_[i_736_];
					    i_734_ = is_720_[i_736_ + 1];
					    for (int i_743_ = i_733_;
						 i_743_ < i_734_; i_743_++) {
						int i_744_
						    = is_721_[i_743_] - 1;
						if (i_744_ == -1)
						    break;
						if (is_719_[i_744_] != 0) {
						    is_716_[i_744_] += i_739_;
						    is_717_[i_744_] += i_740_;
						    is_718_[i_744_] += i_741_;
						    is_719_[i_744_] += i_742_;
						}
					    }
					    i_739_ = is_708_[i_737_];
					    i_740_ = is_709_[i_737_];
					    i_741_ = is_710_[i_737_];
					    i_742_ = is_711_[i_737_];
					    i_733_ = anIntArray9853[i_728_];
					    i_734_
						= anIntArray9853[i_728_ + 1];
					    for (int i_745_ = i_733_;
						 (i_745_ < i_734_
						  && (aShortArray9863[i_745_]
						      != 0));
						 i_745_++) {
						int i_746_
						    = ((aShortArray9863[i_745_]
							& 0xffff)
						       - 1);
						if (is_715_[i_746_] != 0) {
						    is_712_[i_746_] += i_739_;
						    is_713_[i_746_] += i_740_;
						    is_714_[i_746_] += i_741_;
						    is_715_[i_746_] += i_742_;
						}
					    }
					    class183_sub3_704_.method15505();
					    method15505();
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    int method15520(int i, short i_747_, int i_748_) {
	int i_749_
	    = aClass185_Sub1_9817.anIntArray9126[method15523(i, i_748_)];
	if (i_747_ != -1) {
	    Class186 class186 = aClass185_Sub1_9817.aClass177_2012
				    .method2931(i_747_ & 0xffff, (byte) 1);
	    int i_750_ = class186.aByte2074 & 0xff;
	    if (i_750_ != 0) {
		int i_751_ = 131586 * i_748_;
		if (i_748_ < 0)
		    i_751_ = 0;
		else if (i_748_ > 127)
		    i_751_ = 16777215;
		else
		    i_751_ = 131586 * i_748_;
		if (i_750_ == 256)
		    i_749_ = i_751_;
		else {
		    int i_752_ = i_750_;
		    int i_753_ = 256 - i_750_;
		    i_749_ = ((((i_751_ & 0xff00ff) * i_752_
				+ (i_749_ & 0xff00ff) * i_753_)
			       & ~0xff00ff)
			      + (((i_751_ & 0xff00) * i_752_
				  + (i_749_ & 0xff00) * i_753_)
				 & 0xff0000)) >> 8;
		}
	    }
	    int i_754_ = class186.aByte2059 & 0xff;
	    if (i_754_ != 0) {
		i_754_ += 256;
		int i_755_ = ((i_749_ & 0xff0000) >> 16) * i_754_;
		if (i_755_ > 65535)
		    i_755_ = 65535;
		int i_756_ = ((i_749_ & 0xff00) >> 8) * i_754_;
		if (i_756_ > 65535)
		    i_756_ = 65535;
		int i_757_ = (i_749_ & 0xff) * i_754_;
		if (i_757_ > 65535)
		    i_757_ = 65535;
		i_749_ = (i_755_ << 8 & 0xff0000) + (i_756_ & 0xff00) + (i_757_
									 >> 8);
	    }
	}
	return i_749_ & 0xffffff;
    }
    
    public int method3052() {
	if (!aBool9850)
	    method15507();
	return anInt9846;
    }
    
    public void method3149(int i) {
	aShort9805 = (short) i;
	method15509();
	method15505();
    }
    
    public Class158[] method3065() {
	return aClass158Array9859;
    }
    
    public byte[] method3055() {
	return aByteArray9826;
    }
    
    public void method3044() {
	if (anInt9813 > 0 && anInt9824 > 0) {
	    method15517();
	    method15553();
	    method15503();
	}
    }
    
    public void method3076() {
	if (anInt9813 > 0 && anInt9824 > 0) {
	    method15517();
	    method15553();
	    method15503();
	}
    }
    
    public int method3047() {
	if (!aBool9850)
	    method15507();
	return anInt9849;
    }
    
    Class183_Sub3(Class185_Sub1 class185_sub1, int i, int i_758_, boolean bool,
		  boolean bool_759_) {
	aFloatArray9810 = new float[2];
	anIntArray9820 = new int[1];
	anIntArray9867 = new int[1];
	anIntArray9852 = new int[8];
	anIntArray9811 = new int[8];
	anIntArray9857 = new int[8];
	aClass185_Sub1_9817 = class185_sub1;
	anInt9803 = i;
	anInt9872 = i_758_;
	aBool9838 = bool_759_;
	if (bool || Class342.method5964(anInt9803, anInt9872))
	    aClass379_9834
		= new Class379(Class342.method5991(anInt9803, anInt9872));
	if (bool || Class342.method5967(anInt9803, anInt9872))
	    aClass379_9837
		= new Class379(Class342.method5996(anInt9803, anInt9872));
	if (bool || Class342.method6031(anInt9803, anInt9872))
	    aClass379_9835
		= new Class379(Class342.method5966(anInt9803, anInt9872));
	if (bool || Class342.method6045(anInt9803, anInt9872))
	    aClass379_9836
		= new Class379(Class342.method5970(anInt9803, anInt9872));
	if (bool || Class342.method5965(anInt9803, anInt9872))
	    aClass335_9833
		= new Class335(Class342.method5973(anInt9803, anInt9872));
	if (bool && bool_759_) {
	    aClass379_9834.anInterface37_3924
		= aClass379_9834.anInterface37_3922
		= aClass185_Sub1_9817.method14698(aBool9838);
	    aClass379_9837.anInterface37_3924
		= aClass379_9837.anInterface37_3922
		= aClass185_Sub1_9817.method14698(aBool9838);
	    aClass379_9835.anInterface37_3924
		= aClass379_9835.anInterface37_3922
		= aClass185_Sub1_9817.method14698(aBool9838);
	    aClass379_9836.anInterface37_3924
		= aClass379_9836.anInterface37_3922
		= aClass185_Sub1_9817.method14698(aBool9838);
	}
    }
    
    public void method3094() {
	if (anInt9813 > 0 && anInt9824 > 0) {
	    method15517();
	    method15553();
	    method15503();
	}
    }
    
    public void method3112(int i) {
	int i_760_ = Class427.anIntArray4806[i];
	int i_761_ = Class427.anIntArray4805[i];
	for (int i_762_ = 0; i_762_ < anInt9807; i_762_++) {
	    int i_763_ = ((anIntArray9809[i_762_] * i_761_
			   - anIntArray9828[i_762_] * i_760_)
			  >> 14);
	    anIntArray9828[i_762_] = (anIntArray9809[i_762_] * i_760_
				      + anIntArray9828[i_762_] * i_761_) >> 14;
	    anIntArray9809[i_762_] = i_763_;
	}
	method15509();
	aBool9850 = false;
    }
    
    public void method3081(int i) {
	int i_764_ = Class427.anIntArray4806[i];
	int i_765_ = Class427.anIntArray4805[i];
	for (int i_766_ = 0; i_766_ < anInt9807; i_766_++) {
	    int i_767_ = ((anIntArray9809[i_766_] * i_765_
			   - anIntArray9828[i_766_] * i_764_)
			  >> 14);
	    anIntArray9828[i_766_] = (anIntArray9809[i_766_] * i_764_
				      + anIntArray9828[i_766_] * i_765_) >> 14;
	    anIntArray9809[i_766_] = i_767_;
	}
	method15509();
	aBool9850 = false;
    }
    
    public void method3180(int i) {
	int i_768_ = Class427.anIntArray4806[i];
	int i_769_ = Class427.anIntArray4805[i];
	for (int i_770_ = 0; i_770_ < anInt9807; i_770_++) {
	    int i_771_ = ((anIntArray9809[i_770_] * i_769_
			   - anIntArray9828[i_770_] * i_768_)
			  >> 14);
	    anIntArray9828[i_770_] = (anIntArray9809[i_770_] * i_768_
				      + anIntArray9828[i_770_] * i_769_) >> 14;
	    anIntArray9809[i_770_] = i_771_;
	}
	method15509();
	aBool9850 = false;
    }
    
    void method15521() {
	if (aClass379_9834 != null)
	    aClass379_9834.method6423();
	if (aClass379_9837 != null)
	    aClass379_9837.method6423();
	if (aClass379_9835 != null)
	    aClass379_9835.method6423();
	if (aClass379_9836 != null)
	    aClass379_9836.method6423();
	if (aClass335_9833 != null)
	    aClass335_9833.method5899();
    }
    
    public int method3026() {
	if (!aBool9850)
	    method15507();
	return anInt9848;
    }
    
    Class183 method15522(Class183_Sub3 class183_sub3_772_,
			 Class183_Sub3 class183_sub3_773_, int i, boolean bool,
			 boolean bool_774_) {
	class183_sub3_772_.anInt9803 = i;
	class183_sub3_772_.anInt9872 = anInt9872;
	class183_sub3_772_.aShort9804 = aShort9804;
	class183_sub3_772_.aShort9805 = aShort9805;
	class183_sub3_772_.anInt9806 = anInt9806;
	class183_sub3_772_.anInt9807 = anInt9807;
	class183_sub3_772_.anInt9813 = anInt9813;
	class183_sub3_772_.anInt9823 = anInt9823;
	class183_sub3_772_.anInt9824 = anInt9824;
	class183_sub3_772_.anInt9860 = anInt9860;
	if ((i & 0x100) != 0)
	    class183_sub3_772_.aBool9840 = true;
	else
	    class183_sub3_772_.aBool9840 = aBool9840;
	class183_sub3_772_.aBool9841 = aBool9841;
	boolean bool_775_ = Class342.method5952(i, anInt9872);
	boolean bool_776_ = Class342.method5969(i, anInt9872);
	boolean bool_777_ = Class342.method5954(i, anInt9872);
	boolean bool_778_ = bool_775_ | bool_776_ | bool_777_;
	if (bool_778_) {
	    if (bool_775_) {
		if (class183_sub3_773_.anIntArray9808 == null
		    || class183_sub3_773_.anIntArray9808.length < anInt9806)
		    class183_sub3_772_.anIntArray9808
			= class183_sub3_773_.anIntArray9808
			= new int[anInt9806];
		else
		    class183_sub3_772_.anIntArray9808
			= class183_sub3_773_.anIntArray9808;
	    } else
		class183_sub3_772_.anIntArray9808 = anIntArray9808;
	    if (bool_776_) {
		if (class183_sub3_773_.anIntArray9809 == null
		    || class183_sub3_773_.anIntArray9809.length < anInt9806)
		    class183_sub3_772_.anIntArray9809
			= class183_sub3_773_.anIntArray9809
			= new int[anInt9806];
		else
		    class183_sub3_772_.anIntArray9809
			= class183_sub3_773_.anIntArray9809;
	    } else
		class183_sub3_772_.anIntArray9809 = anIntArray9809;
	    if (bool_777_) {
		if (class183_sub3_773_.anIntArray9828 == null
		    || class183_sub3_773_.anIntArray9828.length < anInt9806)
		    class183_sub3_772_.anIntArray9828
			= class183_sub3_773_.anIntArray9828
			= new int[anInt9806];
		else
		    class183_sub3_772_.anIntArray9828
			= class183_sub3_773_.anIntArray9828;
	    } else
		class183_sub3_772_.anIntArray9828 = anIntArray9828;
	    for (int i_779_ = 0; i_779_ < anInt9806; i_779_++) {
		if (bool_775_)
		    class183_sub3_772_.anIntArray9808[i_779_]
			= anIntArray9808[i_779_];
		if (bool_776_)
		    class183_sub3_772_.anIntArray9809[i_779_]
			= anIntArray9809[i_779_];
		if (bool_777_)
		    class183_sub3_772_.anIntArray9828[i_779_]
			= anIntArray9828[i_779_];
	    }
	} else {
	    class183_sub3_772_.anIntArray9808 = anIntArray9808;
	    class183_sub3_772_.anIntArray9809 = anIntArray9809;
	    class183_sub3_772_.anIntArray9828 = anIntArray9828;
	}
	if (Class342.method5991(i, anInt9872)) {
	    class183_sub3_772_.aClass379_9834
		= class183_sub3_773_.aClass379_9834;
	    class183_sub3_772_.aClass379_9834.anInterface37_3922
		= aClass379_9834.anInterface37_3922;
	    class183_sub3_772_.aClass379_9834.aBool3921
		= aClass379_9834.aBool3921;
	    class183_sub3_772_.aClass379_9834.aBool3923 = true;
	} else if (Class342.method5964(i, anInt9872))
	    class183_sub3_772_.aClass379_9834 = aClass379_9834;
	else
	    class183_sub3_772_.aClass379_9834 = null;
	if (Class342.method5957(i, anInt9872)) {
	    if (class183_sub3_773_.aShortArray9825 == null
		|| class183_sub3_773_.aShortArray9825.length < anInt9823)
		class183_sub3_772_.aShortArray9825
		    = class183_sub3_773_.aShortArray9825
		    = new short[anInt9823];
	    else
		class183_sub3_772_.aShortArray9825
		    = class183_sub3_773_.aShortArray9825;
	    for (int i_780_ = 0; i_780_ < anInt9823; i_780_++)
		class183_sub3_772_.aShortArray9825[i_780_]
		    = aShortArray9825[i_780_];
	} else
	    class183_sub3_772_.aShortArray9825 = aShortArray9825;
	if (Class342.method5958(i, anInt9872)) {
	    if (class183_sub3_773_.aByteArray9826 == null
		|| class183_sub3_773_.aByteArray9826.length < anInt9823)
		class183_sub3_772_.aByteArray9826
		    = class183_sub3_773_.aByteArray9826 = new byte[anInt9823];
	    else
		class183_sub3_772_.aByteArray9826
		    = class183_sub3_773_.aByteArray9826;
	    for (int i_781_ = 0; i_781_ < anInt9823; i_781_++)
		class183_sub3_772_.aByteArray9826[i_781_]
		    = aByteArray9826[i_781_];
	} else
	    class183_sub3_772_.aByteArray9826 = aByteArray9826;
	if (Class342.method5966(i, anInt9872)) {
	    class183_sub3_772_.aClass379_9835
		= class183_sub3_773_.aClass379_9835;
	    class183_sub3_772_.aClass379_9835.anInterface37_3922
		= aClass379_9835.anInterface37_3922;
	    class183_sub3_772_.aClass379_9835.aBool3921
		= aClass379_9835.aBool3921;
	    class183_sub3_772_.aClass379_9835.aBool3923 = true;
	} else if (Class342.method6031(i, anInt9872))
	    class183_sub3_772_.aClass379_9835 = aClass379_9835;
	else
	    class183_sub3_772_.aClass379_9835 = null;
	if (Class342.method6051(i, anInt9872)) {
	    if (class183_sub3_773_.aShortArray9816 == null
		|| class183_sub3_773_.aShortArray9816.length < anInt9813) {
		int i_782_ = anInt9813;
		class183_sub3_772_.aShortArray9816
		    = class183_sub3_773_.aShortArray9816 = new short[i_782_];
		class183_sub3_772_.aShortArray9864
		    = class183_sub3_773_.aShortArray9864 = new short[i_782_];
		class183_sub3_772_.aShortArray9869
		    = class183_sub3_773_.aShortArray9869 = new short[i_782_];
	    } else {
		class183_sub3_772_.aShortArray9816
		    = class183_sub3_773_.aShortArray9816;
		class183_sub3_772_.aShortArray9864
		    = class183_sub3_773_.aShortArray9864;
		class183_sub3_772_.aShortArray9869
		    = class183_sub3_773_.aShortArray9869;
	    }
	    if (aClass363_9822 != null) {
		if (class183_sub3_773_.aClass363_9822 == null)
		    class183_sub3_773_.aClass363_9822 = new Class363();
		Class363 class363 = (class183_sub3_772_.aClass363_9822
				     = class183_sub3_773_.aClass363_9822);
		if (class363.aShortArray3722 == null
		    || class363.aShortArray3722.length < anInt9813) {
		    int i_783_ = anInt9813;
		    class363.aShortArray3722 = new short[i_783_];
		    class363.aShortArray3720 = new short[i_783_];
		    class363.aShortArray3723 = new short[i_783_];
		    class363.aByteArray3721 = new byte[i_783_];
		}
		for (int i_784_ = 0; i_784_ < anInt9813; i_784_++) {
		    class183_sub3_772_.aShortArray9816[i_784_]
			= aShortArray9816[i_784_];
		    class183_sub3_772_.aShortArray9864[i_784_]
			= aShortArray9864[i_784_];
		    class183_sub3_772_.aShortArray9869[i_784_]
			= aShortArray9869[i_784_];
		    class363.aShortArray3722[i_784_]
			= aClass363_9822.aShortArray3722[i_784_];
		    class363.aShortArray3720[i_784_]
			= aClass363_9822.aShortArray3720[i_784_];
		    class363.aShortArray3723[i_784_]
			= aClass363_9822.aShortArray3723[i_784_];
		    class363.aByteArray3721[i_784_]
			= aClass363_9822.aByteArray3721[i_784_];
		}
	    } else {
		class183_sub3_772_.aClass363_9822 = null;
		for (int i_785_ = 0; i_785_ < anInt9813; i_785_++) {
		    class183_sub3_772_.aShortArray9816[i_785_]
			= aShortArray9816[i_785_];
		    class183_sub3_772_.aShortArray9864[i_785_]
			= aShortArray9864[i_785_];
		    class183_sub3_772_.aShortArray9869[i_785_]
			= aShortArray9869[i_785_];
		}
	    }
	    class183_sub3_772_.aByteArray9814 = aByteArray9814;
	} else {
	    class183_sub3_772_.aClass363_9822 = aClass363_9822;
	    class183_sub3_772_.aShortArray9816 = aShortArray9816;
	    class183_sub3_772_.aShortArray9864 = aShortArray9864;
	    class183_sub3_772_.aShortArray9869 = aShortArray9869;
	    class183_sub3_772_.aByteArray9814 = aByteArray9814;
	}
	if (Class342.method5970(i, anInt9872)) {
	    class183_sub3_772_.aClass379_9836
		= class183_sub3_773_.aClass379_9836;
	    class183_sub3_772_.aClass379_9836.anInterface37_3922
		= aClass379_9836.anInterface37_3922;
	    class183_sub3_772_.aClass379_9836.aBool3921
		= aClass379_9836.aBool3921;
	    class183_sub3_772_.aClass379_9836.aBool3923 = true;
	} else if (Class342.method6045(i, anInt9872))
	    class183_sub3_772_.aClass379_9836 = aClass379_9836;
	else
	    class183_sub3_772_.aClass379_9836 = null;
	if (Class342.method6021(i, anInt9872)) {
	    if (class183_sub3_773_.aFloatArray9829 == null
		|| class183_sub3_773_.aFloatArray9829.length < anInt9823) {
		int i_786_ = anInt9813;
		class183_sub3_772_.aFloatArray9829
		    = class183_sub3_773_.aFloatArray9829 = new float[i_786_];
		class183_sub3_772_.aFloatArray9821
		    = class183_sub3_773_.aFloatArray9821 = new float[i_786_];
	    } else {
		class183_sub3_772_.aFloatArray9829
		    = class183_sub3_773_.aFloatArray9829;
		class183_sub3_772_.aFloatArray9821
		    = class183_sub3_773_.aFloatArray9821;
	    }
	    for (int i_787_ = 0; i_787_ < anInt9813; i_787_++) {
		class183_sub3_772_.aFloatArray9829[i_787_]
		    = aFloatArray9829[i_787_];
		class183_sub3_772_.aFloatArray9821[i_787_]
		    = aFloatArray9821[i_787_];
	    }
	} else {
	    class183_sub3_772_.aFloatArray9829 = aFloatArray9829;
	    class183_sub3_772_.aFloatArray9821 = aFloatArray9821;
	}
	if (Class342.method5996(i, anInt9872)) {
	    class183_sub3_772_.aClass379_9837
		= class183_sub3_773_.aClass379_9837;
	    class183_sub3_772_.aClass379_9837.anInterface37_3922
		= aClass379_9837.anInterface37_3922;
	    class183_sub3_772_.aClass379_9837.aBool3921
		= aClass379_9837.aBool3921;
	    class183_sub3_772_.aClass379_9837.aBool3923 = true;
	} else if (Class342.method5967(i, anInt9872))
	    class183_sub3_772_.aClass379_9837 = aClass379_9837;
	else
	    class183_sub3_772_.aClass379_9837 = null;
	if (Class342.method5960(i, anInt9872)) {
	    if (class183_sub3_773_.aShortArray9847 == null
		|| class183_sub3_773_.aShortArray9847.length < anInt9823) {
		int i_788_ = anInt9823;
		class183_sub3_772_.aShortArray9847
		    = class183_sub3_773_.aShortArray9847 = new short[i_788_];
		class183_sub3_772_.aShortArray9845
		    = class183_sub3_773_.aShortArray9845 = new short[i_788_];
		class183_sub3_772_.aShortArray9843
		    = class183_sub3_773_.aShortArray9843 = new short[i_788_];
	    } else {
		class183_sub3_772_.aShortArray9847
		    = class183_sub3_773_.aShortArray9847;
		class183_sub3_772_.aShortArray9845
		    = class183_sub3_773_.aShortArray9845;
		class183_sub3_772_.aShortArray9843
		    = class183_sub3_773_.aShortArray9843;
	    }
	    for (int i_789_ = 0; i_789_ < anInt9823; i_789_++) {
		class183_sub3_772_.aShortArray9847[i_789_]
		    = aShortArray9847[i_789_];
		class183_sub3_772_.aShortArray9845[i_789_]
		    = aShortArray9845[i_789_];
		class183_sub3_772_.aShortArray9843[i_789_]
		    = aShortArray9843[i_789_];
	    }
	} else {
	    class183_sub3_772_.aShortArray9847 = aShortArray9847;
	    class183_sub3_772_.aShortArray9845 = aShortArray9845;
	    class183_sub3_772_.aShortArray9843 = aShortArray9843;
	}
	if (Class342.method5973(i, anInt9872)) {
	    class183_sub3_772_.aClass335_9833
		= class183_sub3_773_.aClass335_9833;
	    class183_sub3_772_.aClass335_9833.anInterface39_3515
		= aClass335_9833.anInterface39_3515;
	    class183_sub3_772_.aClass335_9833.aBool3516
		= aClass335_9833.aBool3516;
	    class183_sub3_772_.aClass335_9833.aBool3514 = true;
	} else if (Class342.method5965(i, anInt9872))
	    class183_sub3_772_.aClass335_9833 = aClass335_9833;
	else
	    class183_sub3_772_.aClass335_9833 = null;
	if (Class342.method6030(i, anInt9872)) {
	    if (class183_sub3_773_.aShortArray9830 == null
		|| class183_sub3_773_.aShortArray9830.length < anInt9823) {
		int i_790_ = anInt9823;
		class183_sub3_772_.aShortArray9830
		    = class183_sub3_773_.aShortArray9830 = new short[i_790_];
	    } else
		class183_sub3_772_.aShortArray9830
		    = class183_sub3_773_.aShortArray9830;
	    for (int i_791_ = 0; i_791_ < anInt9823; i_791_++)
		class183_sub3_772_.aShortArray9830[i_791_]
		    = aShortArray9830[i_791_];
	} else
	    class183_sub3_772_.aShortArray9830 = aShortArray9830;
	if (Class342.method5962(i, anInt9872)) {
	    if (class183_sub3_773_.aClass339Array9862 == null
		|| class183_sub3_773_.aClass339Array9862.length < anInt9860) {
		int i_792_ = anInt9860;
		class183_sub3_772_.aClass339Array9862
		    = class183_sub3_773_.aClass339Array9862
		    = new Class339[i_792_];
		for (int i_793_ = 0; i_793_ < anInt9860; i_793_++)
		    class183_sub3_772_.aClass339Array9862[i_793_]
			= aClass339Array9862[i_793_].method5933();
	    } else {
		class183_sub3_772_.aClass339Array9862
		    = class183_sub3_773_.aClass339Array9862;
		for (int i_794_ = 0; i_794_ < anInt9860; i_794_++)
		    class183_sub3_772_.aClass339Array9862[i_794_]
			.method5935(aClass339Array9862[i_794_]);
	    }
	} else
	    class183_sub3_772_.aClass339Array9862 = aClass339Array9862;
	class183_sub3_772_.aClass368Array9861 = aClass368Array9861;
	if (aBool9850) {
	    class183_sub3_772_.anInt9842 = anInt9842;
	    class183_sub3_772_.anInt9868 = anInt9868;
	    class183_sub3_772_.anInt9865 = anInt9865;
	    class183_sub3_772_.anInt9848 = anInt9848;
	    class183_sub3_772_.anInt9799 = anInt9799;
	    class183_sub3_772_.anInt9846 = anInt9846;
	    class183_sub3_772_.anInt9849 = anInt9849;
	    class183_sub3_772_.anInt9866 = anInt9866;
	    class183_sub3_772_.aBool9850 = true;
	} else
	    class183_sub3_772_.aBool9850 = false;
	if (aBool9851) {
	    class183_sub3_772_.anInt9844 = anInt9844;
	    class183_sub3_772_.aBool9851 = true;
	} else
	    class183_sub3_772_.aBool9851 = false;
	class183_sub3_772_.anIntArrayArray9819 = anIntArrayArray9819;
	class183_sub3_772_.anIntArrayArray9831 = anIntArrayArray9831;
	class183_sub3_772_.anIntArrayArray9856 = anIntArrayArray9856;
	class183_sub3_772_.aShortArray9863 = aShortArray9863;
	class183_sub3_772_.anIntArray9853 = anIntArray9853;
	class183_sub3_772_.aShortArray9801 = aShortArray9801;
	class183_sub3_772_.aShortArray9815 = aShortArray9815;
	class183_sub3_772_.aShortArray9812 = aShortArray9812;
	class183_sub3_772_.aShortArray9832 = aShortArray9832;
	class183_sub3_772_.anIntArray9827 = anIntArray9827;
	class183_sub3_772_.anIntArray9855 = anIntArray9855;
	class183_sub3_772_.anIntArray9854 = anIntArray9854;
	class183_sub3_772_.aClass172Array9858 = aClass172Array9858;
	class183_sub3_772_.aClass158Array9859 = aClass158Array9859;
	return class183_sub3_772_;
    }
    
    public void method3086() {
	for (int i = 0; i < anInt9807; i++)
	    anIntArray9828[i] = -anIntArray9828[i];
	for (int i = 0; i < anInt9813; i++)
	    aShortArray9869[i] = (short) -aShortArray9869[i];
	for (int i = 0; i < anInt9823; i++) {
	    short i_795_ = aShortArray9847[i];
	    aShortArray9847[i] = aShortArray9843[i];
	    aShortArray9843[i] = i_795_;
	}
	method15509();
	method15505();
	method15528();
	aBool9850 = false;
    }
    
    public void method3127() {
	for (int i = 0; i < anInt9807; i++)
	    anIntArray9828[i] = -anIntArray9828[i];
	for (int i = 0; i < anInt9813; i++)
	    aShortArray9869[i] = (short) -aShortArray9869[i];
	for (int i = 0; i < anInt9823; i++) {
	    short i_796_ = aShortArray9847[i];
	    aShortArray9847[i] = aShortArray9843[i];
	    aShortArray9843[i] = i_796_;
	}
	method15509();
	method15505();
	method15528();
	aBool9850 = false;
    }
    
    public void method3208() {
	for (int i = 0; i < anInt9807; i++)
	    anIntArray9828[i] = -anIntArray9828[i];
	for (int i = 0; i < anInt9813; i++)
	    aShortArray9869[i] = (short) -aShortArray9869[i];
	for (int i = 0; i < anInt9823; i++) {
	    short i_797_ = aShortArray9847[i];
	    aShortArray9847[i] = aShortArray9843[i];
	    aShortArray9843[i] = i_797_;
	}
	method15509();
	method15505();
	method15528();
	aBool9850 = false;
    }
    
    public void method3159(short i, short i_798_) {
	Class177 class177 = aClass185_Sub1_9817.aClass177_2012;
	for (int i_799_ = 0; i_799_ < anInt9823; i_799_++) {
	    if (aShortArray9830[i_799_] == i)
		aShortArray9830[i_799_] = i_798_;
	}
	byte i_800_ = 0;
	byte i_801_ = 0;
	if (i != -1) {
	    Class186 class186 = class177.method2931(i & 0xffff, (byte) 1);
	    i_800_ = class186.aByte2074;
	    i_801_ = class186.aByte2059;
	}
	byte i_802_ = 0;
	byte i_803_ = 0;
	if (i_798_ != -1) {
	    Class186 class186 = class177.method2931(i_798_ & 0xffff, (byte) 1);
	    i_802_ = class186.aByte2074;
	    i_803_ = class186.aByte2059;
	    if (class186.aByte2047 != 0 || class186.aByte2048 != 0)
		aBool9841 = true;
	}
	if (i_800_ != i_802_ | i_801_ != i_803_) {
	    if (aClass368Array9861 != null) {
		for (int i_804_ = 0; i_804_ < anInt9860; i_804_++) {
		    Class368 class368 = aClass368Array9861[i_804_];
		    Class339 class339 = aClass339Array9862[i_804_];
		    class339.anInt3539
			= (class339.anInt3539 & ~0xffffff
			   | ((Class661.anIntArray8549
			       [aShortArray9825[class368.anInt3860] & 0xffff])
			      & 0xffffff));
		}
	    }
	    method15504();
	}
    }
    
    public void method3025(int i, int i_805_, int i_806_) {
	for (int i_807_ = 0; i_807_ < anInt9807; i_807_++) {
	    if (i != 128)
		anIntArray9808[i_807_] = anIntArray9808[i_807_] * i >> 7;
	    if (i_805_ != 128)
		anIntArray9809[i_807_] = anIntArray9809[i_807_] * i_805_ >> 7;
	    if (i_806_ != 128)
		anIntArray9828[i_807_] = anIntArray9828[i_807_] * i_806_ >> 7;
	}
	method15509();
	aBool9850 = false;
    }
    
    public void method3091(int i, int i_808_, Class151 class151,
			   Class151 class151_809_, int i_810_, int i_811_,
			   int i_812_) {
	if (!aBool9850)
	    method15507();
	int i_813_ = i_810_ + anInt9865;
	int i_814_ = i_810_ + anInt9848;
	int i_815_ = i_812_ + anInt9849;
	int i_816_ = i_812_ + anInt9866;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_813_ >= 0
		&& ((i_814_ + class151.anInt1702 * 127780559
		     >> class151.anInt1703 * -1495101509)
		    < class151.anInt1701 * -1924295585)
		&& i_815_ >= 0
		&& ((i_816_ + class151.anInt1702 * 127780559
		     >> class151.anInt1703 * -1495101509)
		    < class151.anInt1700 * -1466328823))) {
	    if (i == 4 || i == 5) {
		if (class151_809_ == null
		    || (i_813_ < 0
			|| ((i_814_ + class151_809_.anInt1702 * 127780559
			     >> class151_809_.anInt1703 * -1495101509)
			    >= class151_809_.anInt1701 * -1924295585)
			|| i_815_ < 0
			|| ((i_816_ + class151_809_.anInt1702 * 127780559
			     >> class151_809_.anInt1703 * -1495101509)
			    >= class151_809_.anInt1700 * -1466328823)))
		    return;
	    } else {
		i_813_ >>= class151.anInt1703 * -1495101509;
		i_814_ = (i_814_ + (class151.anInt1702 * 127780559 - 1)
			  >> class151.anInt1703 * -1495101509);
		i_815_ >>= class151.anInt1703 * -1495101509;
		i_816_ = (i_816_ + (class151.anInt1702 * 127780559 - 1)
			  >> class151.anInt1703 * -1495101509);
		if (class151.method2491(i_813_, i_815_, -167950286) == i_811_
		    && (class151.method2491(i_814_, i_815_, -190456877)
			== i_811_)
		    && (class151.method2491(i_813_, i_816_, -1345945349)
			== i_811_)
		    && (class151.method2491(i_814_, i_816_, 504668270)
			== i_811_))
		    return;
	    }
	    if (i == 1) {
		for (int i_817_ = 0; i_817_ < anInt9807; i_817_++)
		    anIntArray9809[i_817_]
			= (anIntArray9809[i_817_]
			   + class151.method2521((anIntArray9808[i_817_]
						  + i_810_),
						 (anIntArray9828[i_817_]
						  + i_812_),
						 -1559608308)
			   - i_811_);
	    } else if (i == 2) {
		int i_818_ = anInt9799;
		if (i_818_ == 0)
		    return;
		for (int i_819_ = 0; i_819_ < anInt9807; i_819_++) {
		    int i_820_ = (anIntArray9809[i_819_] << 16) / i_818_;
		    if (i_820_ < i_808_)
			anIntArray9809[i_819_]
			    = (anIntArray9809[i_819_]
			       + (class151.method2521((anIntArray9808[i_819_]
						       + i_810_),
						      (anIntArray9828[i_819_]
						       + i_812_),
						      -1886599328)
				  - i_811_) * (i_808_ - i_820_) / i_808_);
		}
	    } else if (i == 3) {
		int i_821_ = (i_808_ & 0xff) * 16;
		int i_822_ = (i_808_ >> 8 & 0xff) * 16;
		int i_823_ = (i_808_ >> 16 & 0xff) << 6;
		int i_824_ = (i_808_ >> 24 & 0xff) << 6;
		if (i_810_ - (i_821_ >> 1) < 0
		    || (i_810_ + (i_821_ >> 1) + class151.anInt1702 * 127780559
			>= (class151.anInt1701 * -1924295585
			    << class151.anInt1703 * -1495101509))
		    || i_812_ - (i_822_ >> 1) < 0
		    || (i_812_ + (i_822_ >> 1) + class151.anInt1702 * 127780559
			>= (class151.anInt1700 * -1466328823
			    << class151.anInt1703 * -1495101509)))
		    return;
		method3115(class151, i_810_, i_811_, i_812_, i_821_, i_822_,
			   i_823_, i_824_);
	    } else if (i == 4) {
		int i_825_ = anInt9846 - anInt9799;
		for (int i_826_ = 0; i_826_ < anInt9807; i_826_++)
		    anIntArray9809[i_826_]
			= (anIntArray9809[i_826_]
			   + (class151_809_.method2521((anIntArray9808[i_826_]
							+ i_810_),
						       (anIntArray9828[i_826_]
							+ i_812_),
						       -2125131255)
			      - i_811_)
			   + i_825_);
	    } else if (i == 5) {
		int i_827_ = anInt9846 - anInt9799;
		for (int i_828_ = 0; i_828_ < anInt9807; i_828_++) {
		    int i_829_ = anIntArray9808[i_828_] + i_810_;
		    int i_830_ = anIntArray9828[i_828_] + i_812_;
		    int i_831_
			= class151.method2521(i_829_, i_830_, -582466239);
		    int i_832_ = class151_809_.method2521(i_829_, i_830_,
							  -1263641556);
		    int i_833_ = i_831_ - i_832_ - i_808_;
		    anIntArray9809[i_828_]
			= ((anIntArray9809[i_828_] << 8) / i_827_ * i_833_
			   >> 8) - (i_811_ - i_831_);
		}
	    }
	    method15509();
	    aBool9850 = false;
	}
    }
    
    public void method3132(int i, int i_834_, Class151 class151,
			   Class151 class151_835_, int i_836_, int i_837_,
			   int i_838_) {
	if (!aBool9850)
	    method15507();
	int i_839_ = i_836_ + anInt9865;
	int i_840_ = i_836_ + anInt9848;
	int i_841_ = i_838_ + anInt9849;
	int i_842_ = i_838_ + anInt9866;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_839_ >= 0
		&& ((i_840_ + class151.anInt1702 * 127780559
		     >> class151.anInt1703 * -1495101509)
		    < class151.anInt1701 * -1924295585)
		&& i_841_ >= 0
		&& ((i_842_ + class151.anInt1702 * 127780559
		     >> class151.anInt1703 * -1495101509)
		    < class151.anInt1700 * -1466328823))) {
	    if (i == 4 || i == 5) {
		if (class151_835_ == null
		    || (i_839_ < 0
			|| ((i_840_ + class151_835_.anInt1702 * 127780559
			     >> class151_835_.anInt1703 * -1495101509)
			    >= class151_835_.anInt1701 * -1924295585)
			|| i_841_ < 0
			|| ((i_842_ + class151_835_.anInt1702 * 127780559
			     >> class151_835_.anInt1703 * -1495101509)
			    >= class151_835_.anInt1700 * -1466328823)))
		    return;
	    } else {
		i_839_ >>= class151.anInt1703 * -1495101509;
		i_840_ = (i_840_ + (class151.anInt1702 * 127780559 - 1)
			  >> class151.anInt1703 * -1495101509);
		i_841_ >>= class151.anInt1703 * -1495101509;
		i_842_ = (i_842_ + (class151.anInt1702 * 127780559 - 1)
			  >> class151.anInt1703 * -1495101509);
		if (class151.method2491(i_839_, i_841_, -1655400769) == i_837_
		    && (class151.method2491(i_840_, i_841_, -1990145527)
			== i_837_)
		    && class151.method2491(i_839_, i_842_, 630911298) == i_837_
		    && (class151.method2491(i_840_, i_842_, 559642945)
			== i_837_))
		    return;
	    }
	    if (i == 1) {
		for (int i_843_ = 0; i_843_ < anInt9807; i_843_++)
		    anIntArray9809[i_843_]
			= (anIntArray9809[i_843_]
			   + class151.method2521((anIntArray9808[i_843_]
						  + i_836_),
						 (anIntArray9828[i_843_]
						  + i_838_),
						 -1422127089)
			   - i_837_);
	    } else if (i == 2) {
		int i_844_ = anInt9799;
		if (i_844_ == 0)
		    return;
		for (int i_845_ = 0; i_845_ < anInt9807; i_845_++) {
		    int i_846_ = (anIntArray9809[i_845_] << 16) / i_844_;
		    if (i_846_ < i_834_)
			anIntArray9809[i_845_]
			    = (anIntArray9809[i_845_]
			       + (class151.method2521((anIntArray9808[i_845_]
						       + i_836_),
						      (anIntArray9828[i_845_]
						       + i_838_),
						      -1176480154)
				  - i_837_) * (i_834_ - i_846_) / i_834_);
		}
	    } else if (i == 3) {
		int i_847_ = (i_834_ & 0xff) * 16;
		int i_848_ = (i_834_ >> 8 & 0xff) * 16;
		int i_849_ = (i_834_ >> 16 & 0xff) << 6;
		int i_850_ = (i_834_ >> 24 & 0xff) << 6;
		if (i_836_ - (i_847_ >> 1) < 0
		    || (i_836_ + (i_847_ >> 1) + class151.anInt1702 * 127780559
			>= (class151.anInt1701 * -1924295585
			    << class151.anInt1703 * -1495101509))
		    || i_838_ - (i_848_ >> 1) < 0
		    || (i_838_ + (i_848_ >> 1) + class151.anInt1702 * 127780559
			>= (class151.anInt1700 * -1466328823
			    << class151.anInt1703 * -1495101509)))
		    return;
		method3115(class151, i_836_, i_837_, i_838_, i_847_, i_848_,
			   i_849_, i_850_);
	    } else if (i == 4) {
		int i_851_ = anInt9846 - anInt9799;
		for (int i_852_ = 0; i_852_ < anInt9807; i_852_++)
		    anIntArray9809[i_852_]
			= (anIntArray9809[i_852_]
			   + (class151_835_.method2521((anIntArray9808[i_852_]
							+ i_836_),
						       (anIntArray9828[i_852_]
							+ i_838_),
						       -556293189)
			      - i_837_)
			   + i_851_);
	    } else if (i == 5) {
		int i_853_ = anInt9846 - anInt9799;
		for (int i_854_ = 0; i_854_ < anInt9807; i_854_++) {
		    int i_855_ = anIntArray9808[i_854_] + i_836_;
		    int i_856_ = anIntArray9828[i_854_] + i_838_;
		    int i_857_
			= class151.method2521(i_855_, i_856_, -1342026742);
		    int i_858_ = class151_835_.method2521(i_855_, i_856_,
							  -1376231781);
		    int i_859_ = i_857_ - i_858_ - i_834_;
		    anIntArray9809[i_854_]
			= ((anIntArray9809[i_854_] << 8) / i_853_ * i_859_
			   >> 8) - (i_837_ - i_857_);
		}
	    }
	    method15509();
	    aBool9850 = false;
	}
    }
    
    public void method3093(int i, int i_860_, Class151 class151,
			   Class151 class151_861_, int i_862_, int i_863_,
			   int i_864_) {
	if (!aBool9850)
	    method15507();
	int i_865_ = i_862_ + anInt9865;
	int i_866_ = i_862_ + anInt9848;
	int i_867_ = i_864_ + anInt9849;
	int i_868_ = i_864_ + anInt9866;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_865_ >= 0
		&& ((i_866_ + class151.anInt1702 * 127780559
		     >> class151.anInt1703 * -1495101509)
		    < class151.anInt1701 * -1924295585)
		&& i_867_ >= 0
		&& ((i_868_ + class151.anInt1702 * 127780559
		     >> class151.anInt1703 * -1495101509)
		    < class151.anInt1700 * -1466328823))) {
	    if (i == 4 || i == 5) {
		if (class151_861_ == null
		    || (i_865_ < 0
			|| ((i_866_ + class151_861_.anInt1702 * 127780559
			     >> class151_861_.anInt1703 * -1495101509)
			    >= class151_861_.anInt1701 * -1924295585)
			|| i_867_ < 0
			|| ((i_868_ + class151_861_.anInt1702 * 127780559
			     >> class151_861_.anInt1703 * -1495101509)
			    >= class151_861_.anInt1700 * -1466328823)))
		    return;
	    } else {
		i_865_ >>= class151.anInt1703 * -1495101509;
		i_866_ = (i_866_ + (class151.anInt1702 * 127780559 - 1)
			  >> class151.anInt1703 * -1495101509);
		i_867_ >>= class151.anInt1703 * -1495101509;
		i_868_ = (i_868_ + (class151.anInt1702 * 127780559 - 1)
			  >> class151.anInt1703 * -1495101509);
		if (class151.method2491(i_865_, i_867_, 1329864851) == i_863_
		    && (class151.method2491(i_866_, i_867_, -1150789558)
			== i_863_)
		    && (class151.method2491(i_865_, i_868_, 1817507038)
			== i_863_)
		    && (class151.method2491(i_866_, i_868_, 173047612)
			== i_863_))
		    return;
	    }
	    if (i == 1) {
		for (int i_869_ = 0; i_869_ < anInt9807; i_869_++)
		    anIntArray9809[i_869_]
			= (anIntArray9809[i_869_]
			   + class151.method2521((anIntArray9808[i_869_]
						  + i_862_),
						 (anIntArray9828[i_869_]
						  + i_864_),
						 -1024003742)
			   - i_863_);
	    } else if (i == 2) {
		int i_870_ = anInt9799;
		if (i_870_ == 0)
		    return;
		for (int i_871_ = 0; i_871_ < anInt9807; i_871_++) {
		    int i_872_ = (anIntArray9809[i_871_] << 16) / i_870_;
		    if (i_872_ < i_860_)
			anIntArray9809[i_871_]
			    = (anIntArray9809[i_871_]
			       + (class151.method2521((anIntArray9808[i_871_]
						       + i_862_),
						      (anIntArray9828[i_871_]
						       + i_864_),
						      -1995447939)
				  - i_863_) * (i_860_ - i_872_) / i_860_);
		}
	    } else if (i == 3) {
		int i_873_ = (i_860_ & 0xff) * 16;
		int i_874_ = (i_860_ >> 8 & 0xff) * 16;
		int i_875_ = (i_860_ >> 16 & 0xff) << 6;
		int i_876_ = (i_860_ >> 24 & 0xff) << 6;
		if (i_862_ - (i_873_ >> 1) < 0
		    || (i_862_ + (i_873_ >> 1) + class151.anInt1702 * 127780559
			>= (class151.anInt1701 * -1924295585
			    << class151.anInt1703 * -1495101509))
		    || i_864_ - (i_874_ >> 1) < 0
		    || (i_864_ + (i_874_ >> 1) + class151.anInt1702 * 127780559
			>= (class151.anInt1700 * -1466328823
			    << class151.anInt1703 * -1495101509)))
		    return;
		method3115(class151, i_862_, i_863_, i_864_, i_873_, i_874_,
			   i_875_, i_876_);
	    } else if (i == 4) {
		int i_877_ = anInt9846 - anInt9799;
		for (int i_878_ = 0; i_878_ < anInt9807; i_878_++)
		    anIntArray9809[i_878_]
			= (anIntArray9809[i_878_]
			   + (class151_861_.method2521((anIntArray9808[i_878_]
							+ i_862_),
						       (anIntArray9828[i_878_]
							+ i_864_),
						       -1542020853)
			      - i_863_)
			   + i_877_);
	    } else if (i == 5) {
		int i_879_ = anInt9846 - anInt9799;
		for (int i_880_ = 0; i_880_ < anInt9807; i_880_++) {
		    int i_881_ = anIntArray9808[i_880_] + i_862_;
		    int i_882_ = anIntArray9828[i_880_] + i_864_;
		    int i_883_
			= class151.method2521(i_881_, i_882_, -1793184241);
		    int i_884_ = class151_861_.method2521(i_881_, i_882_,
							  -1312021887);
		    int i_885_ = i_883_ - i_884_ - i_860_;
		    anIntArray9809[i_880_]
			= ((anIntArray9809[i_880_] << 8) / i_879_ * i_885_
			   >> 8) - (i_863_ - i_883_);
		}
	    }
	    method15509();
	    aBool9850 = false;
	}
    }
    
    boolean method3066() {
	if (anIntArrayArray9819 == null)
	    return false;
	for (int i = 0; i < anInt9806; i++) {
	    anIntArray9808[i] <<= 4;
	    anIntArray9809[i] <<= 4;
	    anIntArray9828[i] <<= 4;
	}
	anInt9871 = 0;
	anInt9818 = 0;
	anInt9873 = 0;
	return true;
    }
    
    void method3162() {
	for (int i = 0; i < anInt9806; i++) {
	    anIntArray9808[i] = anIntArray9808[i] + 7 >> 4;
	    anIntArray9809[i] = anIntArray9809[i] + 7 >> 4;
	    anIntArray9828[i] = anIntArray9828[i] + 7 >> 4;
	}
	method15509();
	aBool9850 = false;
    }
    
    void method3106() {
	for (int i = 0; i < anInt9806; i++) {
	    anIntArray9808[i] = anIntArray9808[i] + 7 >> 4;
	    anIntArray9809[i] = anIntArray9809[i] + 7 >> 4;
	    anIntArray9828[i] = anIntArray9828[i] + 7 >> 4;
	}
	method15509();
	aBool9850 = false;
    }
    
    void method3036() {
	for (int i = 0; i < anInt9806; i++) {
	    anIntArray9808[i] = anIntArray9808[i] + 7 >> 4;
	    anIntArray9809[i] = anIntArray9809[i] + 7 >> 4;
	    anIntArray9828[i] = anIntArray9828[i] + 7 >> 4;
	}
	method15509();
	aBool9850 = false;
    }
    
    void method3031(int i, int[] is, int i_886_, int i_887_, int i_888_,
		    int i_889_, boolean bool) {
	int i_890_ = is.length;
	if (i == 0) {
	    i_886_ <<= 4;
	    i_887_ <<= 4;
	    i_888_ <<= 4;
	    int i_891_ = 0;
	    anInt9871 = 0;
	    anInt9818 = 0;
	    anInt9873 = 0;
	    for (int i_892_ = 0; i_892_ < i_890_; i_892_++) {
		int i_893_ = is[i_892_];
		if (i_893_ < anIntArrayArray9819.length) {
		    int[] is_894_ = anIntArrayArray9819[i_893_];
		    for (int i_895_ = 0; i_895_ < is_894_.length; i_895_++) {
			int i_896_ = is_894_[i_895_];
			anInt9871 += anIntArray9808[i_896_];
			anInt9818 += anIntArray9809[i_896_];
			anInt9873 += anIntArray9828[i_896_];
			i_891_++;
		    }
		}
	    }
	    if (i_891_ > 0) {
		anInt9871 = anInt9871 / i_891_ + i_886_;
		anInt9818 = anInt9818 / i_891_ + i_887_;
		anInt9873 = anInt9873 / i_891_ + i_888_;
	    } else {
		anInt9871 = i_886_;
		anInt9818 = i_887_;
		anInt9873 = i_888_;
	    }
	} else if (i == 1) {
	    i_886_ <<= 4;
	    i_887_ <<= 4;
	    i_888_ <<= 4;
	    for (int i_897_ = 0; i_897_ < i_890_; i_897_++) {
		int i_898_ = is[i_897_];
		if (i_898_ < anIntArrayArray9819.length) {
		    int[] is_899_ = anIntArrayArray9819[i_898_];
		    for (int i_900_ = 0; i_900_ < is_899_.length; i_900_++) {
			int i_901_ = is_899_[i_900_];
			anIntArray9808[i_901_] += i_886_;
			anIntArray9809[i_901_] += i_887_;
			anIntArray9828[i_901_] += i_888_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_902_ = 0; i_902_ < i_890_; i_902_++) {
		int i_903_ = is[i_902_];
		if (i_903_ < anIntArrayArray9819.length) {
		    int[] is_904_ = anIntArrayArray9819[i_903_];
		    if ((i_889_ & 0x1) == 0) {
			for (int i_905_ = 0; i_905_ < is_904_.length;
			     i_905_++) {
			    int i_906_ = is_904_[i_905_];
			    anIntArray9808[i_906_] -= anInt9871;
			    anIntArray9809[i_906_] -= anInt9818;
			    anIntArray9828[i_906_] -= anInt9873;
			    if (i_888_ != 0) {
				int i_907_ = Class427.anIntArray4806[i_888_];
				int i_908_ = Class427.anIntArray4805[i_888_];
				int i_909_ = (anIntArray9809[i_906_] * i_907_
					      + anIntArray9808[i_906_] * i_908_
					      + 16383) >> 14;
				anIntArray9809[i_906_]
				    = (anIntArray9809[i_906_] * i_908_
				       - anIntArray9808[i_906_] * i_907_
				       + 16383) >> 14;
				anIntArray9808[i_906_] = i_909_;
			    }
			    if (i_886_ != 0) {
				int i_910_ = Class427.anIntArray4806[i_886_];
				int i_911_ = Class427.anIntArray4805[i_886_];
				int i_912_ = (anIntArray9809[i_906_] * i_911_
					      - anIntArray9828[i_906_] * i_910_
					      + 16383) >> 14;
				anIntArray9828[i_906_]
				    = (anIntArray9809[i_906_] * i_910_
				       + anIntArray9828[i_906_] * i_911_
				       + 16383) >> 14;
				anIntArray9809[i_906_] = i_912_;
			    }
			    if (i_887_ != 0) {
				int i_913_ = Class427.anIntArray4806[i_887_];
				int i_914_ = Class427.anIntArray4805[i_887_];
				int i_915_ = (anIntArray9828[i_906_] * i_913_
					      + anIntArray9808[i_906_] * i_914_
					      + 16383) >> 14;
				anIntArray9828[i_906_]
				    = (anIntArray9828[i_906_] * i_914_
				       - anIntArray9808[i_906_] * i_913_
				       + 16383) >> 14;
				anIntArray9808[i_906_] = i_915_;
			    }
			    anIntArray9808[i_906_] += anInt9871;
			    anIntArray9809[i_906_] += anInt9818;
			    anIntArray9828[i_906_] += anInt9873;
			}
		    } else {
			for (int i_916_ = 0; i_916_ < is_904_.length;
			     i_916_++) {
			    int i_917_ = is_904_[i_916_];
			    anIntArray9808[i_917_] -= anInt9871;
			    anIntArray9809[i_917_] -= anInt9818;
			    anIntArray9828[i_917_] -= anInt9873;
			    if (i_886_ != 0) {
				int i_918_ = Class427.anIntArray4806[i_886_];
				int i_919_ = Class427.anIntArray4805[i_886_];
				int i_920_ = (anIntArray9809[i_917_] * i_919_
					      - anIntArray9828[i_917_] * i_918_
					      + 16383) >> 14;
				anIntArray9828[i_917_]
				    = (anIntArray9809[i_917_] * i_918_
				       + anIntArray9828[i_917_] * i_919_
				       + 16383) >> 14;
				anIntArray9809[i_917_] = i_920_;
			    }
			    if (i_888_ != 0) {
				int i_921_ = Class427.anIntArray4806[i_888_];
				int i_922_ = Class427.anIntArray4805[i_888_];
				int i_923_ = (anIntArray9809[i_917_] * i_921_
					      + anIntArray9808[i_917_] * i_922_
					      + 16383) >> 14;
				anIntArray9809[i_917_]
				    = (anIntArray9809[i_917_] * i_922_
				       - anIntArray9808[i_917_] * i_921_
				       + 16383) >> 14;
				anIntArray9808[i_917_] = i_923_;
			    }
			    if (i_887_ != 0) {
				int i_924_ = Class427.anIntArray4806[i_887_];
				int i_925_ = Class427.anIntArray4805[i_887_];
				int i_926_ = (anIntArray9828[i_917_] * i_924_
					      + anIntArray9808[i_917_] * i_925_
					      + 16383) >> 14;
				anIntArray9828[i_917_]
				    = (anIntArray9828[i_917_] * i_925_
				       - anIntArray9808[i_917_] * i_924_
				       + 16383) >> 14;
				anIntArray9808[i_917_] = i_926_;
			    }
			    anIntArray9808[i_917_] += anInt9871;
			    anIntArray9809[i_917_] += anInt9818;
			    anIntArray9828[i_917_] += anInt9873;
			}
		    }
		}
	    }
	    if (bool) {
		for (int i_927_ = 0; i_927_ < i_890_; i_927_++) {
		    int i_928_ = is[i_927_];
		    if (i_928_ < anIntArrayArray9819.length) {
			int[] is_929_ = anIntArrayArray9819[i_928_];
			for (int i_930_ = 0; i_930_ < is_929_.length;
			     i_930_++) {
			    int i_931_ = is_929_[i_930_];
			    int i_932_ = anIntArray9853[i_931_];
			    int i_933_ = anIntArray9853[i_931_ + 1];
			    for (int i_934_ = i_932_;
				 (i_934_ < i_933_
				  && aShortArray9863[i_934_] != 0);
				 i_934_++) {
				int i_935_
				    = (aShortArray9863[i_934_] & 0xffff) - 1;
				if (i_888_ != 0) {
				    int i_936_
					= Class427.anIntArray4806[i_888_];
				    int i_937_
					= Class427.anIntArray4805[i_888_];
				    int i_938_
					= ((aShortArray9864[i_935_] * i_936_
					    + aShortArray9816[i_935_] * i_937_
					    + 16383)
					   >> 14);
				    aShortArray9864[i_935_]
					= (short) (((aShortArray9864[i_935_]
						     * i_937_)
						    - (aShortArray9816[i_935_]
						       * i_936_)
						    + 16383)
						   >> 14);
				    aShortArray9816[i_935_] = (short) i_938_;
				}
				if (i_886_ != 0) {
				    int i_939_
					= Class427.anIntArray4806[i_886_];
				    int i_940_
					= Class427.anIntArray4805[i_886_];
				    int i_941_
					= ((aShortArray9864[i_935_] * i_940_
					    - aShortArray9869[i_935_] * i_939_
					    + 16383)
					   >> 14);
				    aShortArray9869[i_935_]
					= (short) (((aShortArray9864[i_935_]
						     * i_939_)
						    + (aShortArray9869[i_935_]
						       * i_940_)
						    + 16383)
						   >> 14);
				    aShortArray9864[i_935_] = (short) i_941_;
				}
				if (i_887_ != 0) {
				    int i_942_
					= Class427.anIntArray4806[i_887_];
				    int i_943_
					= Class427.anIntArray4805[i_887_];
				    int i_944_
					= ((aShortArray9869[i_935_] * i_942_
					    + aShortArray9816[i_935_] * i_943_
					    + 16383)
					   >> 14);
				    aShortArray9869[i_935_]
					= (short) (((aShortArray9869[i_935_]
						     * i_943_)
						    - (aShortArray9816[i_935_]
						       * i_942_)
						    + 16383)
						   >> 14);
				    aShortArray9816[i_935_] = (short) i_944_;
				}
			    }
			}
		    }
		}
		method15505();
	    }
	} else if (i == 3) {
	    for (int i_945_ = 0; i_945_ < i_890_; i_945_++) {
		int i_946_ = is[i_945_];
		if (i_946_ < anIntArrayArray9819.length) {
		    int[] is_947_ = anIntArrayArray9819[i_946_];
		    for (int i_948_ = 0; i_948_ < is_947_.length; i_948_++) {
			int i_949_ = is_947_[i_948_];
			anIntArray9808[i_949_] -= anInt9871;
			anIntArray9809[i_949_] -= anInt9818;
			anIntArray9828[i_949_] -= anInt9873;
			anIntArray9808[i_949_]
			    = anIntArray9808[i_949_] * i_886_ >> 7;
			anIntArray9809[i_949_]
			    = anIntArray9809[i_949_] * i_887_ >> 7;
			anIntArray9828[i_949_]
			    = anIntArray9828[i_949_] * i_888_ >> 7;
			anIntArray9808[i_949_] += anInt9871;
			anIntArray9809[i_949_] += anInt9818;
			anIntArray9828[i_949_] += anInt9873;
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9831 != null) {
		boolean bool_950_ = false;
		for (int i_951_ = 0; i_951_ < i_890_; i_951_++) {
		    int i_952_ = is[i_951_];
		    if (i_952_ < anIntArrayArray9831.length) {
			int[] is_953_ = anIntArrayArray9831[i_952_];
			for (int i_954_ = 0; i_954_ < is_953_.length;
			     i_954_++) {
			    int i_955_ = is_953_[i_954_];
			    int i_956_
				= (aByteArray9826[i_955_] & 0xff) + i_886_ * 8;
			    if (i_956_ < 0)
				i_956_ = 0;
			    else if (i_956_ > 255)
				i_956_ = 255;
			    aByteArray9826[i_955_] = (byte) i_956_;
			}
			bool_950_ = bool_950_ | is_953_.length > 0;
		    }
		}
		if (bool_950_) {
		    if (aClass368Array9861 != null) {
			for (int i_957_ = 0; i_957_ < anInt9860; i_957_++) {
			    Class368 class368 = aClass368Array9861[i_957_];
			    Class339 class339 = aClass339Array9862[i_957_];
			    class339.anInt3539
				= (class339.anInt3539 & 0xffffff
				   | 255 - (aByteArray9826[class368.anInt3860]
					    & 0xff) << 24);
			}
		    }
		    method15504();
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9831 != null) {
		boolean bool_958_ = false;
		for (int i_959_ = 0; i_959_ < i_890_; i_959_++) {
		    int i_960_ = is[i_959_];
		    if (i_960_ < anIntArrayArray9831.length) {
			int[] is_961_ = anIntArrayArray9831[i_960_];
			for (int i_962_ = 0; i_962_ < is_961_.length;
			     i_962_++) {
			    int i_963_ = is_961_[i_962_];
			    int i_964_ = aShortArray9825[i_963_] & 0xffff;
			    int i_965_ = i_964_ >> 10 & 0x3f;
			    int i_966_ = i_964_ >> 7 & 0x7;
			    int i_967_ = i_964_ & 0x7f;
			    i_965_ = i_965_ + i_886_ & 0x3f;
			    i_966_ += i_887_ / 4;
			    if (i_966_ < 0)
				i_966_ = 0;
			    else if (i_966_ > 7)
				i_966_ = 7;
			    i_967_ += i_888_;
			    if (i_967_ < 0)
				i_967_ = 0;
			    else if (i_967_ > 127)
				i_967_ = 127;
			    aShortArray9825[i_963_]
				= (short) (i_965_ << 10 | i_966_ << 7
					   | i_967_);
			}
			bool_958_ = bool_958_ | is_961_.length > 0;
		    }
		}
		if (bool_958_) {
		    if (aClass368Array9861 != null) {
			for (int i_968_ = 0; i_968_ < anInt9860; i_968_++) {
			    Class368 class368 = aClass368Array9861[i_968_];
			    Class339 class339 = aClass339Array9862[i_968_];
			    class339.anInt3539
				= (class339.anInt3539 & ~0xffffff
				   | (Class661.anIntArray8549
				      [(aShortArray9825[class368.anInt3860]
					& 0xffff)]) & 0xffffff);
			}
		    }
		    method15504();
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9856 != null) {
		for (int i_969_ = 0; i_969_ < i_890_; i_969_++) {
		    int i_970_ = is[i_969_];
		    if (i_970_ < anIntArrayArray9856.length) {
			int[] is_971_ = anIntArrayArray9856[i_970_];
			for (int i_972_ = 0; i_972_ < is_971_.length;
			     i_972_++) {
			    Class339 class339
				= aClass339Array9862[is_971_[i_972_]];
			    class339.anInt3537 += i_886_;
			    class339.anInt3534 += i_887_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9856 != null) {
		for (int i_973_ = 0; i_973_ < i_890_; i_973_++) {
		    int i_974_ = is[i_973_];
		    if (i_974_ < anIntArrayArray9856.length) {
			int[] is_975_ = anIntArrayArray9856[i_974_];
			for (int i_976_ = 0; i_976_ < is_975_.length;
			     i_976_++) {
			    Class339 class339
				= aClass339Array9862[is_975_[i_976_]];
			    class339.anInt3538
				= class339.anInt3538 * i_886_ >> 7;
			    class339.anInt3536
				= class339.anInt3536 * i_887_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9856 != null) {
		for (int i_977_ = 0; i_977_ < i_890_; i_977_++) {
		    int i_978_ = is[i_977_];
		    if (i_978_ < anIntArrayArray9856.length) {
			int[] is_979_ = anIntArrayArray9856[i_978_];
			for (int i_980_ = 0; i_980_ < is_979_.length;
			     i_980_++) {
			    Class339 class339
				= aClass339Array9862[is_979_[i_980_]];
			    class339.anInt3535
				= class339.anInt3535 + i_886_ & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    void method3099(int i, int[] is, int i_981_, int i_982_, int i_983_,
		    int i_984_, boolean bool) {
	int i_985_ = is.length;
	if (i == 0) {
	    i_981_ <<= 4;
	    i_982_ <<= 4;
	    i_983_ <<= 4;
	    int i_986_ = 0;
	    anInt9871 = 0;
	    anInt9818 = 0;
	    anInt9873 = 0;
	    for (int i_987_ = 0; i_987_ < i_985_; i_987_++) {
		int i_988_ = is[i_987_];
		if (i_988_ < anIntArrayArray9819.length) {
		    int[] is_989_ = anIntArrayArray9819[i_988_];
		    for (int i_990_ = 0; i_990_ < is_989_.length; i_990_++) {
			int i_991_ = is_989_[i_990_];
			anInt9871 += anIntArray9808[i_991_];
			anInt9818 += anIntArray9809[i_991_];
			anInt9873 += anIntArray9828[i_991_];
			i_986_++;
		    }
		}
	    }
	    if (i_986_ > 0) {
		anInt9871 = anInt9871 / i_986_ + i_981_;
		anInt9818 = anInt9818 / i_986_ + i_982_;
		anInt9873 = anInt9873 / i_986_ + i_983_;
	    } else {
		anInt9871 = i_981_;
		anInt9818 = i_982_;
		anInt9873 = i_983_;
	    }
	} else if (i == 1) {
	    i_981_ <<= 4;
	    i_982_ <<= 4;
	    i_983_ <<= 4;
	    for (int i_992_ = 0; i_992_ < i_985_; i_992_++) {
		int i_993_ = is[i_992_];
		if (i_993_ < anIntArrayArray9819.length) {
		    int[] is_994_ = anIntArrayArray9819[i_993_];
		    for (int i_995_ = 0; i_995_ < is_994_.length; i_995_++) {
			int i_996_ = is_994_[i_995_];
			anIntArray9808[i_996_] += i_981_;
			anIntArray9809[i_996_] += i_982_;
			anIntArray9828[i_996_] += i_983_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_997_ = 0; i_997_ < i_985_; i_997_++) {
		int i_998_ = is[i_997_];
		if (i_998_ < anIntArrayArray9819.length) {
		    int[] is_999_ = anIntArrayArray9819[i_998_];
		    if ((i_984_ & 0x1) == 0) {
			for (int i_1000_ = 0; i_1000_ < is_999_.length;
			     i_1000_++) {
			    int i_1001_ = is_999_[i_1000_];
			    anIntArray9808[i_1001_] -= anInt9871;
			    anIntArray9809[i_1001_] -= anInt9818;
			    anIntArray9828[i_1001_] -= anInt9873;
			    if (i_983_ != 0) {
				int i_1002_ = Class427.anIntArray4806[i_983_];
				int i_1003_ = Class427.anIntArray4805[i_983_];
				int i_1004_
				    = ((anIntArray9809[i_1001_] * i_1002_
					+ anIntArray9808[i_1001_] * i_1003_
					+ 16383)
				       >> 14);
				anIntArray9809[i_1001_]
				    = (anIntArray9809[i_1001_] * i_1003_
				       - anIntArray9808[i_1001_] * i_1002_
				       + 16383) >> 14;
				anIntArray9808[i_1001_] = i_1004_;
			    }
			    if (i_981_ != 0) {
				int i_1005_ = Class427.anIntArray4806[i_981_];
				int i_1006_ = Class427.anIntArray4805[i_981_];
				int i_1007_
				    = ((anIntArray9809[i_1001_] * i_1006_
					- anIntArray9828[i_1001_] * i_1005_
					+ 16383)
				       >> 14);
				anIntArray9828[i_1001_]
				    = (anIntArray9809[i_1001_] * i_1005_
				       + anIntArray9828[i_1001_] * i_1006_
				       + 16383) >> 14;
				anIntArray9809[i_1001_] = i_1007_;
			    }
			    if (i_982_ != 0) {
				int i_1008_ = Class427.anIntArray4806[i_982_];
				int i_1009_ = Class427.anIntArray4805[i_982_];
				int i_1010_
				    = ((anIntArray9828[i_1001_] * i_1008_
					+ anIntArray9808[i_1001_] * i_1009_
					+ 16383)
				       >> 14);
				anIntArray9828[i_1001_]
				    = (anIntArray9828[i_1001_] * i_1009_
				       - anIntArray9808[i_1001_] * i_1008_
				       + 16383) >> 14;
				anIntArray9808[i_1001_] = i_1010_;
			    }
			    anIntArray9808[i_1001_] += anInt9871;
			    anIntArray9809[i_1001_] += anInt9818;
			    anIntArray9828[i_1001_] += anInt9873;
			}
		    } else {
			for (int i_1011_ = 0; i_1011_ < is_999_.length;
			     i_1011_++) {
			    int i_1012_ = is_999_[i_1011_];
			    anIntArray9808[i_1012_] -= anInt9871;
			    anIntArray9809[i_1012_] -= anInt9818;
			    anIntArray9828[i_1012_] -= anInt9873;
			    if (i_981_ != 0) {
				int i_1013_ = Class427.anIntArray4806[i_981_];
				int i_1014_ = Class427.anIntArray4805[i_981_];
				int i_1015_
				    = ((anIntArray9809[i_1012_] * i_1014_
					- anIntArray9828[i_1012_] * i_1013_
					+ 16383)
				       >> 14);
				anIntArray9828[i_1012_]
				    = (anIntArray9809[i_1012_] * i_1013_
				       + anIntArray9828[i_1012_] * i_1014_
				       + 16383) >> 14;
				anIntArray9809[i_1012_] = i_1015_;
			    }
			    if (i_983_ != 0) {
				int i_1016_ = Class427.anIntArray4806[i_983_];
				int i_1017_ = Class427.anIntArray4805[i_983_];
				int i_1018_
				    = ((anIntArray9809[i_1012_] * i_1016_
					+ anIntArray9808[i_1012_] * i_1017_
					+ 16383)
				       >> 14);
				anIntArray9809[i_1012_]
				    = (anIntArray9809[i_1012_] * i_1017_
				       - anIntArray9808[i_1012_] * i_1016_
				       + 16383) >> 14;
				anIntArray9808[i_1012_] = i_1018_;
			    }
			    if (i_982_ != 0) {
				int i_1019_ = Class427.anIntArray4806[i_982_];
				int i_1020_ = Class427.anIntArray4805[i_982_];
				int i_1021_
				    = ((anIntArray9828[i_1012_] * i_1019_
					+ anIntArray9808[i_1012_] * i_1020_
					+ 16383)
				       >> 14);
				anIntArray9828[i_1012_]
				    = (anIntArray9828[i_1012_] * i_1020_
				       - anIntArray9808[i_1012_] * i_1019_
				       + 16383) >> 14;
				anIntArray9808[i_1012_] = i_1021_;
			    }
			    anIntArray9808[i_1012_] += anInt9871;
			    anIntArray9809[i_1012_] += anInt9818;
			    anIntArray9828[i_1012_] += anInt9873;
			}
		    }
		}
	    }
	    if (bool) {
		for (int i_1022_ = 0; i_1022_ < i_985_; i_1022_++) {
		    int i_1023_ = is[i_1022_];
		    if (i_1023_ < anIntArrayArray9819.length) {
			int[] is_1024_ = anIntArrayArray9819[i_1023_];
			for (int i_1025_ = 0; i_1025_ < is_1024_.length;
			     i_1025_++) {
			    int i_1026_ = is_1024_[i_1025_];
			    int i_1027_ = anIntArray9853[i_1026_];
			    int i_1028_ = anIntArray9853[i_1026_ + 1];
			    for (int i_1029_ = i_1027_;
				 (i_1029_ < i_1028_
				  && aShortArray9863[i_1029_] != 0);
				 i_1029_++) {
				int i_1030_
				    = (aShortArray9863[i_1029_] & 0xffff) - 1;
				if (i_983_ != 0) {
				    int i_1031_
					= Class427.anIntArray4806[i_983_];
				    int i_1032_
					= Class427.anIntArray4805[i_983_];
				    int i_1033_
					= (aShortArray9864[i_1030_] * i_1031_
					   + aShortArray9816[i_1030_] * i_1032_
					   + 16383) >> 14;
				    aShortArray9864[i_1030_]
					= (short) (((aShortArray9864[i_1030_]
						     * i_1032_)
						    - (aShortArray9816[i_1030_]
						       * i_1031_)
						    + 16383)
						   >> 14);
				    aShortArray9816[i_1030_] = (short) i_1033_;
				}
				if (i_981_ != 0) {
				    int i_1034_
					= Class427.anIntArray4806[i_981_];
				    int i_1035_
					= Class427.anIntArray4805[i_981_];
				    int i_1036_
					= (aShortArray9864[i_1030_] * i_1035_
					   - aShortArray9869[i_1030_] * i_1034_
					   + 16383) >> 14;
				    aShortArray9869[i_1030_]
					= (short) (((aShortArray9864[i_1030_]
						     * i_1034_)
						    + (aShortArray9869[i_1030_]
						       * i_1035_)
						    + 16383)
						   >> 14);
				    aShortArray9864[i_1030_] = (short) i_1036_;
				}
				if (i_982_ != 0) {
				    int i_1037_
					= Class427.anIntArray4806[i_982_];
				    int i_1038_
					= Class427.anIntArray4805[i_982_];
				    int i_1039_
					= (aShortArray9869[i_1030_] * i_1037_
					   + aShortArray9816[i_1030_] * i_1038_
					   + 16383) >> 14;
				    aShortArray9869[i_1030_]
					= (short) (((aShortArray9869[i_1030_]
						     * i_1038_)
						    - (aShortArray9816[i_1030_]
						       * i_1037_)
						    + 16383)
						   >> 14);
				    aShortArray9816[i_1030_] = (short) i_1039_;
				}
			    }
			}
		    }
		}
		method15505();
	    }
	} else if (i == 3) {
	    for (int i_1040_ = 0; i_1040_ < i_985_; i_1040_++) {
		int i_1041_ = is[i_1040_];
		if (i_1041_ < anIntArrayArray9819.length) {
		    int[] is_1042_ = anIntArrayArray9819[i_1041_];
		    for (int i_1043_ = 0; i_1043_ < is_1042_.length;
			 i_1043_++) {
			int i_1044_ = is_1042_[i_1043_];
			anIntArray9808[i_1044_] -= anInt9871;
			anIntArray9809[i_1044_] -= anInt9818;
			anIntArray9828[i_1044_] -= anInt9873;
			anIntArray9808[i_1044_]
			    = anIntArray9808[i_1044_] * i_981_ >> 7;
			anIntArray9809[i_1044_]
			    = anIntArray9809[i_1044_] * i_982_ >> 7;
			anIntArray9828[i_1044_]
			    = anIntArray9828[i_1044_] * i_983_ >> 7;
			anIntArray9808[i_1044_] += anInt9871;
			anIntArray9809[i_1044_] += anInt9818;
			anIntArray9828[i_1044_] += anInt9873;
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9831 != null) {
		boolean bool_1045_ = false;
		for (int i_1046_ = 0; i_1046_ < i_985_; i_1046_++) {
		    int i_1047_ = is[i_1046_];
		    if (i_1047_ < anIntArrayArray9831.length) {
			int[] is_1048_ = anIntArrayArray9831[i_1047_];
			for (int i_1049_ = 0; i_1049_ < is_1048_.length;
			     i_1049_++) {
			    int i_1050_ = is_1048_[i_1049_];
			    int i_1051_ = ((aByteArray9826[i_1050_] & 0xff)
					   + i_981_ * 8);
			    if (i_1051_ < 0)
				i_1051_ = 0;
			    else if (i_1051_ > 255)
				i_1051_ = 255;
			    aByteArray9826[i_1050_] = (byte) i_1051_;
			}
			bool_1045_ = bool_1045_ | is_1048_.length > 0;
		    }
		}
		if (bool_1045_) {
		    if (aClass368Array9861 != null) {
			for (int i_1052_ = 0; i_1052_ < anInt9860; i_1052_++) {
			    Class368 class368 = aClass368Array9861[i_1052_];
			    Class339 class339 = aClass339Array9862[i_1052_];
			    class339.anInt3539
				= (class339.anInt3539 & 0xffffff
				   | 255 - (aByteArray9826[class368.anInt3860]
					    & 0xff) << 24);
			}
		    }
		    method15504();
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9831 != null) {
		boolean bool_1053_ = false;
		for (int i_1054_ = 0; i_1054_ < i_985_; i_1054_++) {
		    int i_1055_ = is[i_1054_];
		    if (i_1055_ < anIntArrayArray9831.length) {
			int[] is_1056_ = anIntArrayArray9831[i_1055_];
			for (int i_1057_ = 0; i_1057_ < is_1056_.length;
			     i_1057_++) {
			    int i_1058_ = is_1056_[i_1057_];
			    int i_1059_ = aShortArray9825[i_1058_] & 0xffff;
			    int i_1060_ = i_1059_ >> 10 & 0x3f;
			    int i_1061_ = i_1059_ >> 7 & 0x7;
			    int i_1062_ = i_1059_ & 0x7f;
			    i_1060_ = i_1060_ + i_981_ & 0x3f;
			    i_1061_ += i_982_ / 4;
			    if (i_1061_ < 0)
				i_1061_ = 0;
			    else if (i_1061_ > 7)
				i_1061_ = 7;
			    i_1062_ += i_983_;
			    if (i_1062_ < 0)
				i_1062_ = 0;
			    else if (i_1062_ > 127)
				i_1062_ = 127;
			    aShortArray9825[i_1058_]
				= (short) (i_1060_ << 10 | i_1061_ << 7
					   | i_1062_);
			}
			bool_1053_ = bool_1053_ | is_1056_.length > 0;
		    }
		}
		if (bool_1053_) {
		    if (aClass368Array9861 != null) {
			for (int i_1063_ = 0; i_1063_ < anInt9860; i_1063_++) {
			    Class368 class368 = aClass368Array9861[i_1063_];
			    Class339 class339 = aClass339Array9862[i_1063_];
			    class339.anInt3539
				= (class339.anInt3539 & ~0xffffff
				   | (Class661.anIntArray8549
				      [(aShortArray9825[class368.anInt3860]
					& 0xffff)]) & 0xffffff);
			}
		    }
		    method15504();
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9856 != null) {
		for (int i_1064_ = 0; i_1064_ < i_985_; i_1064_++) {
		    int i_1065_ = is[i_1064_];
		    if (i_1065_ < anIntArrayArray9856.length) {
			int[] is_1066_ = anIntArrayArray9856[i_1065_];
			for (int i_1067_ = 0; i_1067_ < is_1066_.length;
			     i_1067_++) {
			    Class339 class339
				= aClass339Array9862[is_1066_[i_1067_]];
			    class339.anInt3537 += i_981_;
			    class339.anInt3534 += i_982_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9856 != null) {
		for (int i_1068_ = 0; i_1068_ < i_985_; i_1068_++) {
		    int i_1069_ = is[i_1068_];
		    if (i_1069_ < anIntArrayArray9856.length) {
			int[] is_1070_ = anIntArrayArray9856[i_1069_];
			for (int i_1071_ = 0; i_1071_ < is_1070_.length;
			     i_1071_++) {
			    Class339 class339
				= aClass339Array9862[is_1070_[i_1071_]];
			    class339.anInt3538
				= class339.anInt3538 * i_981_ >> 7;
			    class339.anInt3536
				= class339.anInt3536 * i_982_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9856 != null) {
		for (int i_1072_ = 0; i_1072_ < i_985_; i_1072_++) {
		    int i_1073_ = is[i_1072_];
		    if (i_1073_ < anIntArrayArray9856.length) {
			int[] is_1074_ = anIntArrayArray9856[i_1073_];
			for (int i_1075_ = 0; i_1075_ < is_1074_.length;
			     i_1075_++) {
			    Class339 class339
				= aClass339Array9862[is_1074_[i_1075_]];
			    class339.anInt3535
				= class339.anInt3535 + i_981_ & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    void method3100(int i, int[] is, int i_1076_, int i_1077_, int i_1078_,
		    int i_1079_, boolean bool) {
	int i_1080_ = is.length;
	if (i == 0) {
	    i_1076_ <<= 4;
	    i_1077_ <<= 4;
	    i_1078_ <<= 4;
	    int i_1081_ = 0;
	    anInt9871 = 0;
	    anInt9818 = 0;
	    anInt9873 = 0;
	    for (int i_1082_ = 0; i_1082_ < i_1080_; i_1082_++) {
		int i_1083_ = is[i_1082_];
		if (i_1083_ < anIntArrayArray9819.length) {
		    int[] is_1084_ = anIntArrayArray9819[i_1083_];
		    for (int i_1085_ = 0; i_1085_ < is_1084_.length;
			 i_1085_++) {
			int i_1086_ = is_1084_[i_1085_];
			anInt9871 += anIntArray9808[i_1086_];
			anInt9818 += anIntArray9809[i_1086_];
			anInt9873 += anIntArray9828[i_1086_];
			i_1081_++;
		    }
		}
	    }
	    if (i_1081_ > 0) {
		anInt9871 = anInt9871 / i_1081_ + i_1076_;
		anInt9818 = anInt9818 / i_1081_ + i_1077_;
		anInt9873 = anInt9873 / i_1081_ + i_1078_;
	    } else {
		anInt9871 = i_1076_;
		anInt9818 = i_1077_;
		anInt9873 = i_1078_;
	    }
	} else if (i == 1) {
	    i_1076_ <<= 4;
	    i_1077_ <<= 4;
	    i_1078_ <<= 4;
	    for (int i_1087_ = 0; i_1087_ < i_1080_; i_1087_++) {
		int i_1088_ = is[i_1087_];
		if (i_1088_ < anIntArrayArray9819.length) {
		    int[] is_1089_ = anIntArrayArray9819[i_1088_];
		    for (int i_1090_ = 0; i_1090_ < is_1089_.length;
			 i_1090_++) {
			int i_1091_ = is_1089_[i_1090_];
			anIntArray9808[i_1091_] += i_1076_;
			anIntArray9809[i_1091_] += i_1077_;
			anIntArray9828[i_1091_] += i_1078_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_1092_ = 0; i_1092_ < i_1080_; i_1092_++) {
		int i_1093_ = is[i_1092_];
		if (i_1093_ < anIntArrayArray9819.length) {
		    int[] is_1094_ = anIntArrayArray9819[i_1093_];
		    if ((i_1079_ & 0x1) == 0) {
			for (int i_1095_ = 0; i_1095_ < is_1094_.length;
			     i_1095_++) {
			    int i_1096_ = is_1094_[i_1095_];
			    anIntArray9808[i_1096_] -= anInt9871;
			    anIntArray9809[i_1096_] -= anInt9818;
			    anIntArray9828[i_1096_] -= anInt9873;
			    if (i_1078_ != 0) {
				int i_1097_ = Class427.anIntArray4806[i_1078_];
				int i_1098_ = Class427.anIntArray4805[i_1078_];
				int i_1099_
				    = ((anIntArray9809[i_1096_] * i_1097_
					+ anIntArray9808[i_1096_] * i_1098_
					+ 16383)
				       >> 14);
				anIntArray9809[i_1096_]
				    = (anIntArray9809[i_1096_] * i_1098_
				       - anIntArray9808[i_1096_] * i_1097_
				       + 16383) >> 14;
				anIntArray9808[i_1096_] = i_1099_;
			    }
			    if (i_1076_ != 0) {
				int i_1100_ = Class427.anIntArray4806[i_1076_];
				int i_1101_ = Class427.anIntArray4805[i_1076_];
				int i_1102_
				    = ((anIntArray9809[i_1096_] * i_1101_
					- anIntArray9828[i_1096_] * i_1100_
					+ 16383)
				       >> 14);
				anIntArray9828[i_1096_]
				    = (anIntArray9809[i_1096_] * i_1100_
				       + anIntArray9828[i_1096_] * i_1101_
				       + 16383) >> 14;
				anIntArray9809[i_1096_] = i_1102_;
			    }
			    if (i_1077_ != 0) {
				int i_1103_ = Class427.anIntArray4806[i_1077_];
				int i_1104_ = Class427.anIntArray4805[i_1077_];
				int i_1105_
				    = ((anIntArray9828[i_1096_] * i_1103_
					+ anIntArray9808[i_1096_] * i_1104_
					+ 16383)
				       >> 14);
				anIntArray9828[i_1096_]
				    = (anIntArray9828[i_1096_] * i_1104_
				       - anIntArray9808[i_1096_] * i_1103_
				       + 16383) >> 14;
				anIntArray9808[i_1096_] = i_1105_;
			    }
			    anIntArray9808[i_1096_] += anInt9871;
			    anIntArray9809[i_1096_] += anInt9818;
			    anIntArray9828[i_1096_] += anInt9873;
			}
		    } else {
			for (int i_1106_ = 0; i_1106_ < is_1094_.length;
			     i_1106_++) {
			    int i_1107_ = is_1094_[i_1106_];
			    anIntArray9808[i_1107_] -= anInt9871;
			    anIntArray9809[i_1107_] -= anInt9818;
			    anIntArray9828[i_1107_] -= anInt9873;
			    if (i_1076_ != 0) {
				int i_1108_ = Class427.anIntArray4806[i_1076_];
				int i_1109_ = Class427.anIntArray4805[i_1076_];
				int i_1110_
				    = ((anIntArray9809[i_1107_] * i_1109_
					- anIntArray9828[i_1107_] * i_1108_
					+ 16383)
				       >> 14);
				anIntArray9828[i_1107_]
				    = (anIntArray9809[i_1107_] * i_1108_
				       + anIntArray9828[i_1107_] * i_1109_
				       + 16383) >> 14;
				anIntArray9809[i_1107_] = i_1110_;
			    }
			    if (i_1078_ != 0) {
				int i_1111_ = Class427.anIntArray4806[i_1078_];
				int i_1112_ = Class427.anIntArray4805[i_1078_];
				int i_1113_
				    = ((anIntArray9809[i_1107_] * i_1111_
					+ anIntArray9808[i_1107_] * i_1112_
					+ 16383)
				       >> 14);
				anIntArray9809[i_1107_]
				    = (anIntArray9809[i_1107_] * i_1112_
				       - anIntArray9808[i_1107_] * i_1111_
				       + 16383) >> 14;
				anIntArray9808[i_1107_] = i_1113_;
			    }
			    if (i_1077_ != 0) {
				int i_1114_ = Class427.anIntArray4806[i_1077_];
				int i_1115_ = Class427.anIntArray4805[i_1077_];
				int i_1116_
				    = ((anIntArray9828[i_1107_] * i_1114_
					+ anIntArray9808[i_1107_] * i_1115_
					+ 16383)
				       >> 14);
				anIntArray9828[i_1107_]
				    = (anIntArray9828[i_1107_] * i_1115_
				       - anIntArray9808[i_1107_] * i_1114_
				       + 16383) >> 14;
				anIntArray9808[i_1107_] = i_1116_;
			    }
			    anIntArray9808[i_1107_] += anInt9871;
			    anIntArray9809[i_1107_] += anInt9818;
			    anIntArray9828[i_1107_] += anInt9873;
			}
		    }
		}
	    }
	    if (bool) {
		for (int i_1117_ = 0; i_1117_ < i_1080_; i_1117_++) {
		    int i_1118_ = is[i_1117_];
		    if (i_1118_ < anIntArrayArray9819.length) {
			int[] is_1119_ = anIntArrayArray9819[i_1118_];
			for (int i_1120_ = 0; i_1120_ < is_1119_.length;
			     i_1120_++) {
			    int i_1121_ = is_1119_[i_1120_];
			    int i_1122_ = anIntArray9853[i_1121_];
			    int i_1123_ = anIntArray9853[i_1121_ + 1];
			    for (int i_1124_ = i_1122_;
				 (i_1124_ < i_1123_
				  && aShortArray9863[i_1124_] != 0);
				 i_1124_++) {
				int i_1125_
				    = (aShortArray9863[i_1124_] & 0xffff) - 1;
				if (i_1078_ != 0) {
				    int i_1126_
					= Class427.anIntArray4806[i_1078_];
				    int i_1127_
					= Class427.anIntArray4805[i_1078_];
				    int i_1128_
					= (aShortArray9864[i_1125_] * i_1126_
					   + aShortArray9816[i_1125_] * i_1127_
					   + 16383) >> 14;
				    aShortArray9864[i_1125_]
					= (short) (((aShortArray9864[i_1125_]
						     * i_1127_)
						    - (aShortArray9816[i_1125_]
						       * i_1126_)
						    + 16383)
						   >> 14);
				    aShortArray9816[i_1125_] = (short) i_1128_;
				}
				if (i_1076_ != 0) {
				    int i_1129_
					= Class427.anIntArray4806[i_1076_];
				    int i_1130_
					= Class427.anIntArray4805[i_1076_];
				    int i_1131_
					= (aShortArray9864[i_1125_] * i_1130_
					   - aShortArray9869[i_1125_] * i_1129_
					   + 16383) >> 14;
				    aShortArray9869[i_1125_]
					= (short) (((aShortArray9864[i_1125_]
						     * i_1129_)
						    + (aShortArray9869[i_1125_]
						       * i_1130_)
						    + 16383)
						   >> 14);
				    aShortArray9864[i_1125_] = (short) i_1131_;
				}
				if (i_1077_ != 0) {
				    int i_1132_
					= Class427.anIntArray4806[i_1077_];
				    int i_1133_
					= Class427.anIntArray4805[i_1077_];
				    int i_1134_
					= (aShortArray9869[i_1125_] * i_1132_
					   + aShortArray9816[i_1125_] * i_1133_
					   + 16383) >> 14;
				    aShortArray9869[i_1125_]
					= (short) (((aShortArray9869[i_1125_]
						     * i_1133_)
						    - (aShortArray9816[i_1125_]
						       * i_1132_)
						    + 16383)
						   >> 14);
				    aShortArray9816[i_1125_] = (short) i_1134_;
				}
			    }
			}
		    }
		}
		method15505();
	    }
	} else if (i == 3) {
	    for (int i_1135_ = 0; i_1135_ < i_1080_; i_1135_++) {
		int i_1136_ = is[i_1135_];
		if (i_1136_ < anIntArrayArray9819.length) {
		    int[] is_1137_ = anIntArrayArray9819[i_1136_];
		    for (int i_1138_ = 0; i_1138_ < is_1137_.length;
			 i_1138_++) {
			int i_1139_ = is_1137_[i_1138_];
			anIntArray9808[i_1139_] -= anInt9871;
			anIntArray9809[i_1139_] -= anInt9818;
			anIntArray9828[i_1139_] -= anInt9873;
			anIntArray9808[i_1139_]
			    = anIntArray9808[i_1139_] * i_1076_ >> 7;
			anIntArray9809[i_1139_]
			    = anIntArray9809[i_1139_] * i_1077_ >> 7;
			anIntArray9828[i_1139_]
			    = anIntArray9828[i_1139_] * i_1078_ >> 7;
			anIntArray9808[i_1139_] += anInt9871;
			anIntArray9809[i_1139_] += anInt9818;
			anIntArray9828[i_1139_] += anInt9873;
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9831 != null) {
		boolean bool_1140_ = false;
		for (int i_1141_ = 0; i_1141_ < i_1080_; i_1141_++) {
		    int i_1142_ = is[i_1141_];
		    if (i_1142_ < anIntArrayArray9831.length) {
			int[] is_1143_ = anIntArrayArray9831[i_1142_];
			for (int i_1144_ = 0; i_1144_ < is_1143_.length;
			     i_1144_++) {
			    int i_1145_ = is_1143_[i_1144_];
			    int i_1146_ = ((aByteArray9826[i_1145_] & 0xff)
					   + i_1076_ * 8);
			    if (i_1146_ < 0)
				i_1146_ = 0;
			    else if (i_1146_ > 255)
				i_1146_ = 255;
			    aByteArray9826[i_1145_] = (byte) i_1146_;
			}
			bool_1140_ = bool_1140_ | is_1143_.length > 0;
		    }
		}
		if (bool_1140_) {
		    if (aClass368Array9861 != null) {
			for (int i_1147_ = 0; i_1147_ < anInt9860; i_1147_++) {
			    Class368 class368 = aClass368Array9861[i_1147_];
			    Class339 class339 = aClass339Array9862[i_1147_];
			    class339.anInt3539
				= (class339.anInt3539 & 0xffffff
				   | 255 - (aByteArray9826[class368.anInt3860]
					    & 0xff) << 24);
			}
		    }
		    method15504();
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9831 != null) {
		boolean bool_1148_ = false;
		for (int i_1149_ = 0; i_1149_ < i_1080_; i_1149_++) {
		    int i_1150_ = is[i_1149_];
		    if (i_1150_ < anIntArrayArray9831.length) {
			int[] is_1151_ = anIntArrayArray9831[i_1150_];
			for (int i_1152_ = 0; i_1152_ < is_1151_.length;
			     i_1152_++) {
			    int i_1153_ = is_1151_[i_1152_];
			    int i_1154_ = aShortArray9825[i_1153_] & 0xffff;
			    int i_1155_ = i_1154_ >> 10 & 0x3f;
			    int i_1156_ = i_1154_ >> 7 & 0x7;
			    int i_1157_ = i_1154_ & 0x7f;
			    i_1155_ = i_1155_ + i_1076_ & 0x3f;
			    i_1156_ += i_1077_ / 4;
			    if (i_1156_ < 0)
				i_1156_ = 0;
			    else if (i_1156_ > 7)
				i_1156_ = 7;
			    i_1157_ += i_1078_;
			    if (i_1157_ < 0)
				i_1157_ = 0;
			    else if (i_1157_ > 127)
				i_1157_ = 127;
			    aShortArray9825[i_1153_]
				= (short) (i_1155_ << 10 | i_1156_ << 7
					   | i_1157_);
			}
			bool_1148_ = bool_1148_ | is_1151_.length > 0;
		    }
		}
		if (bool_1148_) {
		    if (aClass368Array9861 != null) {
			for (int i_1158_ = 0; i_1158_ < anInt9860; i_1158_++) {
			    Class368 class368 = aClass368Array9861[i_1158_];
			    Class339 class339 = aClass339Array9862[i_1158_];
			    class339.anInt3539
				= (class339.anInt3539 & ~0xffffff
				   | (Class661.anIntArray8549
				      [(aShortArray9825[class368.anInt3860]
					& 0xffff)]) & 0xffffff);
			}
		    }
		    method15504();
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9856 != null) {
		for (int i_1159_ = 0; i_1159_ < i_1080_; i_1159_++) {
		    int i_1160_ = is[i_1159_];
		    if (i_1160_ < anIntArrayArray9856.length) {
			int[] is_1161_ = anIntArrayArray9856[i_1160_];
			for (int i_1162_ = 0; i_1162_ < is_1161_.length;
			     i_1162_++) {
			    Class339 class339
				= aClass339Array9862[is_1161_[i_1162_]];
			    class339.anInt3537 += i_1076_;
			    class339.anInt3534 += i_1077_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9856 != null) {
		for (int i_1163_ = 0; i_1163_ < i_1080_; i_1163_++) {
		    int i_1164_ = is[i_1163_];
		    if (i_1164_ < anIntArrayArray9856.length) {
			int[] is_1165_ = anIntArrayArray9856[i_1164_];
			for (int i_1166_ = 0; i_1166_ < is_1165_.length;
			     i_1166_++) {
			    Class339 class339
				= aClass339Array9862[is_1165_[i_1166_]];
			    class339.anInt3538
				= class339.anInt3538 * i_1076_ >> 7;
			    class339.anInt3536
				= class339.anInt3536 * i_1077_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9856 != null) {
		for (int i_1167_ = 0; i_1167_ < i_1080_; i_1167_++) {
		    int i_1168_ = is[i_1167_];
		    if (i_1168_ < anIntArrayArray9856.length) {
			int[] is_1169_ = anIntArrayArray9856[i_1168_];
			for (int i_1170_ = 0; i_1170_ < is_1169_.length;
			     i_1170_++) {
			    Class339 class339
				= aClass339Array9862[is_1169_[i_1170_]];
			    class339.anInt3535
				= class339.anInt3535 + i_1076_ & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    void method3121(int i, int[] is, int i_1171_, int i_1172_, int i_1173_,
		    boolean bool, int i_1174_, int[] is_1175_) {
	int i_1176_ = is.length;
	if (i == 0) {
	    i_1171_ <<= 4;
	    i_1172_ <<= 4;
	    i_1173_ <<= 4;
	    int i_1177_ = 0;
	    anInt9871 = 0;
	    anInt9818 = 0;
	    anInt9873 = 0;
	    for (int i_1178_ = 0; i_1178_ < i_1176_; i_1178_++) {
		int i_1179_ = is[i_1178_];
		if (i_1179_ < anIntArrayArray9819.length) {
		    int[] is_1180_ = anIntArrayArray9819[i_1179_];
		    for (int i_1181_ = 0; i_1181_ < is_1180_.length;
			 i_1181_++) {
			int i_1182_ = is_1180_[i_1181_];
			if (aShortArray9812 == null
			    || (i_1174_ & aShortArray9812[i_1182_]) != 0) {
			    anInt9871 += anIntArray9808[i_1182_];
			    anInt9818 += anIntArray9809[i_1182_];
			    anInt9873 += anIntArray9828[i_1182_];
			    i_1177_++;
			}
		    }
		}
	    }
	    if (i_1177_ > 0) {
		anInt9871 = anInt9871 / i_1177_ + i_1171_;
		anInt9818 = anInt9818 / i_1177_ + i_1172_;
		anInt9873 = anInt9873 / i_1177_ + i_1173_;
		aBool9874 = true;
	    } else {
		anInt9871 = i_1171_;
		anInt9818 = i_1172_;
		anInt9873 = i_1173_;
	    }
	} else if (i == 1) {
	    if (is_1175_ != null) {
		int i_1183_ = ((is_1175_[0] * i_1171_ + is_1175_[1] * i_1172_
				+ is_1175_[2] * i_1173_ + 8192)
			       >> 14);
		int i_1184_ = ((is_1175_[3] * i_1171_ + is_1175_[4] * i_1172_
				+ is_1175_[5] * i_1173_ + 8192)
			       >> 14);
		int i_1185_ = ((is_1175_[6] * i_1171_ + is_1175_[7] * i_1172_
				+ is_1175_[8] * i_1173_ + 8192)
			       >> 14);
		i_1171_ = i_1183_;
		i_1172_ = i_1184_;
		i_1173_ = i_1185_;
	    }
	    i_1171_ <<= 4;
	    i_1172_ <<= 4;
	    i_1173_ <<= 4;
	    for (int i_1186_ = 0; i_1186_ < i_1176_; i_1186_++) {
		int i_1187_ = is[i_1186_];
		if (i_1187_ < anIntArrayArray9819.length) {
		    int[] is_1188_ = anIntArrayArray9819[i_1187_];
		    for (int i_1189_ = 0; i_1189_ < is_1188_.length;
			 i_1189_++) {
			int i_1190_ = is_1188_[i_1189_];
			if (aShortArray9812 == null
			    || (i_1174_ & aShortArray9812[i_1190_]) != 0) {
			    anIntArray9808[i_1190_] += i_1171_;
			    anIntArray9809[i_1190_] += i_1172_;
			    anIntArray9828[i_1190_] += i_1173_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_1175_ != null) {
		int i_1191_ = is_1175_[9] << 4;
		int i_1192_ = is_1175_[10] << 4;
		int i_1193_ = is_1175_[11] << 4;
		int i_1194_ = is_1175_[12] << 4;
		int i_1195_ = is_1175_[13] << 4;
		int i_1196_ = is_1175_[14] << 4;
		if (aBool9874) {
		    int i_1197_
			= ((is_1175_[0] * anInt9871 + is_1175_[3] * anInt9818
			    + is_1175_[6] * anInt9873 + 8192)
			   >> 14);
		    int i_1198_
			= ((is_1175_[1] * anInt9871 + is_1175_[4] * anInt9818
			    + is_1175_[7] * anInt9873 + 8192)
			   >> 14);
		    int i_1199_
			= ((is_1175_[2] * anInt9871 + is_1175_[5] * anInt9818
			    + is_1175_[8] * anInt9873 + 8192)
			   >> 14);
		    i_1197_ += i_1194_;
		    i_1198_ += i_1195_;
		    i_1199_ += i_1196_;
		    anInt9871 = i_1197_;
		    anInt9818 = i_1198_;
		    anInt9873 = i_1199_;
		    aBool9874 = false;
		}
		int[] is_1200_ = new int[9];
		int i_1201_ = Class427.anIntArray4805[i_1171_];
		int i_1202_ = Class427.anIntArray4806[i_1171_];
		int i_1203_ = Class427.anIntArray4805[i_1172_];
		int i_1204_ = Class427.anIntArray4806[i_1172_];
		int i_1205_ = Class427.anIntArray4805[i_1173_];
		int i_1206_ = Class427.anIntArray4806[i_1173_];
		int i_1207_ = i_1202_ * i_1205_ + 8192 >> 14;
		int i_1208_ = i_1202_ * i_1206_ + 8192 >> 14;
		is_1200_[0]
		    = i_1203_ * i_1205_ + i_1204_ * i_1208_ + 8192 >> 14;
		is_1200_[1]
		    = -i_1203_ * i_1206_ + i_1204_ * i_1207_ + 8192 >> 14;
		is_1200_[2] = i_1204_ * i_1201_ + 8192 >> 14;
		is_1200_[3] = i_1201_ * i_1206_ + 8192 >> 14;
		is_1200_[4] = i_1201_ * i_1205_ + 8192 >> 14;
		is_1200_[5] = -i_1202_;
		is_1200_[6]
		    = -i_1204_ * i_1205_ + i_1203_ * i_1208_ + 8192 >> 14;
		is_1200_[7]
		    = i_1204_ * i_1206_ + i_1203_ * i_1207_ + 8192 >> 14;
		is_1200_[8] = i_1203_ * i_1201_ + 8192 >> 14;
		int i_1209_
		    = ((is_1200_[0] * -anInt9871 + is_1200_[1] * -anInt9818
			+ is_1200_[2] * -anInt9873 + 8192)
		       >> 14);
		int i_1210_
		    = ((is_1200_[3] * -anInt9871 + is_1200_[4] * -anInt9818
			+ is_1200_[5] * -anInt9873 + 8192)
		       >> 14);
		int i_1211_
		    = ((is_1200_[6] * -anInt9871 + is_1200_[7] * -anInt9818
			+ is_1200_[8] * -anInt9873 + 8192)
		       >> 14);
		int i_1212_ = i_1209_ + anInt9871;
		int i_1213_ = i_1210_ + anInt9818;
		int i_1214_ = i_1211_ + anInt9873;
		int[] is_1215_ = new int[9];
		for (int i_1216_ = 0; i_1216_ < 3; i_1216_++) {
		    for (int i_1217_ = 0; i_1217_ < 3; i_1217_++) {
			int i_1218_ = 0;
			for (int i_1219_ = 0; i_1219_ < 3; i_1219_++)
			    i_1218_ += (is_1200_[i_1216_ * 3 + i_1219_]
					* is_1175_[i_1217_ * 3 + i_1219_]);
			is_1215_[i_1216_ * 3 + i_1217_] = i_1218_ + 8192 >> 14;
		    }
		}
		int i_1220_ = ((is_1200_[0] * i_1194_ + is_1200_[1] * i_1195_
				+ is_1200_[2] * i_1196_ + 8192)
			       >> 14);
		int i_1221_ = ((is_1200_[3] * i_1194_ + is_1200_[4] * i_1195_
				+ is_1200_[5] * i_1196_ + 8192)
			       >> 14);
		int i_1222_ = ((is_1200_[6] * i_1194_ + is_1200_[7] * i_1195_
				+ is_1200_[8] * i_1196_ + 8192)
			       >> 14);
		i_1220_ += i_1212_;
		i_1221_ += i_1213_;
		i_1222_ += i_1214_;
		int[] is_1223_ = new int[9];
		for (int i_1224_ = 0; i_1224_ < 3; i_1224_++) {
		    for (int i_1225_ = 0; i_1225_ < 3; i_1225_++) {
			int i_1226_ = 0;
			for (int i_1227_ = 0; i_1227_ < 3; i_1227_++)
			    i_1226_ += (is_1175_[i_1224_ * 3 + i_1227_]
					* is_1215_[i_1225_ + i_1227_ * 3]);
			is_1223_[i_1224_ * 3 + i_1225_] = i_1226_ + 8192 >> 14;
		    }
		}
		int i_1228_ = ((is_1175_[0] * i_1220_ + is_1175_[1] * i_1221_
				+ is_1175_[2] * i_1222_ + 8192)
			       >> 14);
		int i_1229_ = ((is_1175_[3] * i_1220_ + is_1175_[4] * i_1221_
				+ is_1175_[5] * i_1222_ + 8192)
			       >> 14);
		int i_1230_ = ((is_1175_[6] * i_1220_ + is_1175_[7] * i_1221_
				+ is_1175_[8] * i_1222_ + 8192)
			       >> 14);
		i_1228_ += i_1191_;
		i_1229_ += i_1192_;
		i_1230_ += i_1193_;
		for (int i_1231_ = 0; i_1231_ < i_1176_; i_1231_++) {
		    int i_1232_ = is[i_1231_];
		    if (i_1232_ < anIntArrayArray9819.length) {
			int[] is_1233_ = anIntArrayArray9819[i_1232_];
			for (int i_1234_ = 0; i_1234_ < is_1233_.length;
			     i_1234_++) {
			    int i_1235_ = is_1233_[i_1234_];
			    if (aShortArray9812 == null
				|| (i_1174_ & aShortArray9812[i_1235_]) != 0) {
				int i_1236_
				    = ((is_1223_[0] * anIntArray9808[i_1235_]
					+ is_1223_[1] * anIntArray9809[i_1235_]
					+ is_1223_[2] * anIntArray9828[i_1235_]
					+ 8192)
				       >> 14);
				int i_1237_
				    = ((is_1223_[3] * anIntArray9808[i_1235_]
					+ is_1223_[4] * anIntArray9809[i_1235_]
					+ is_1223_[5] * anIntArray9828[i_1235_]
					+ 8192)
				       >> 14);
				int i_1238_
				    = ((is_1223_[6] * anIntArray9808[i_1235_]
					+ is_1223_[7] * anIntArray9809[i_1235_]
					+ is_1223_[8] * anIntArray9828[i_1235_]
					+ 8192)
				       >> 14);
				i_1236_ += i_1228_;
				i_1237_ += i_1229_;
				i_1238_ += i_1230_;
				anIntArray9808[i_1235_] = i_1236_;
				anIntArray9809[i_1235_] = i_1237_;
				anIntArray9828[i_1235_] = i_1238_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1239_ = 0; i_1239_ < i_1176_; i_1239_++) {
		    int i_1240_ = is[i_1239_];
		    if (i_1240_ < anIntArrayArray9819.length) {
			int[] is_1241_ = anIntArrayArray9819[i_1240_];
			for (int i_1242_ = 0; i_1242_ < is_1241_.length;
			     i_1242_++) {
			    int i_1243_ = is_1241_[i_1242_];
			    if (aShortArray9812 == null
				|| (i_1174_ & aShortArray9812[i_1243_]) != 0) {
				anIntArray9808[i_1243_] -= anInt9871;
				anIntArray9809[i_1243_] -= anInt9818;
				anIntArray9828[i_1243_] -= anInt9873;
				if (i_1173_ != 0) {
				    int i_1244_
					= Class427.anIntArray4806[i_1173_];
				    int i_1245_
					= Class427.anIntArray4805[i_1173_];
				    int i_1246_
					= ((anIntArray9809[i_1243_] * i_1244_
					    + anIntArray9808[i_1243_] * i_1245_
					    + 16383)
					   >> 14);
				    anIntArray9809[i_1243_]
					= (anIntArray9809[i_1243_] * i_1245_
					   - anIntArray9808[i_1243_] * i_1244_
					   + 16383) >> 14;
				    anIntArray9808[i_1243_] = i_1246_;
				}
				if (i_1171_ != 0) {
				    int i_1247_
					= Class427.anIntArray4806[i_1171_];
				    int i_1248_
					= Class427.anIntArray4805[i_1171_];
				    int i_1249_
					= ((anIntArray9809[i_1243_] * i_1248_
					    - anIntArray9828[i_1243_] * i_1247_
					    + 16383)
					   >> 14);
				    anIntArray9828[i_1243_]
					= (anIntArray9809[i_1243_] * i_1247_
					   + anIntArray9828[i_1243_] * i_1248_
					   + 16383) >> 14;
				    anIntArray9809[i_1243_] = i_1249_;
				}
				if (i_1172_ != 0) {
				    int i_1250_
					= Class427.anIntArray4806[i_1172_];
				    int i_1251_
					= Class427.anIntArray4805[i_1172_];
				    int i_1252_
					= ((anIntArray9828[i_1243_] * i_1250_
					    + anIntArray9808[i_1243_] * i_1251_
					    + 16383)
					   >> 14);
				    anIntArray9828[i_1243_]
					= (anIntArray9828[i_1243_] * i_1251_
					   - anIntArray9808[i_1243_] * i_1250_
					   + 16383) >> 14;
				    anIntArray9808[i_1243_] = i_1252_;
				}
				anIntArray9808[i_1243_] += anInt9871;
				anIntArray9809[i_1243_] += anInt9818;
				anIntArray9828[i_1243_] += anInt9873;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_1253_ = 0; i_1253_ < i_1176_; i_1253_++) {
			int i_1254_ = is[i_1253_];
			if (i_1254_ < anIntArrayArray9819.length) {
			    int[] is_1255_ = anIntArrayArray9819[i_1254_];
			    for (int i_1256_ = 0; i_1256_ < is_1255_.length;
				 i_1256_++) {
				int i_1257_ = is_1255_[i_1256_];
				if (aShortArray9812 == null
				    || ((i_1174_ & aShortArray9812[i_1257_])
					!= 0)) {
				    int i_1258_ = anIntArray9853[i_1257_];
				    int i_1259_ = anIntArray9853[i_1257_ + 1];
				    for (int i_1260_ = i_1258_;
					 (i_1260_ < i_1259_
					  && aShortArray9863[i_1260_] != 0);
					 i_1260_++) {
					int i_1261_ = (aShortArray9863[i_1260_]
						       & 0xffff) - 1;
					if (i_1173_ != 0) {
					    int i_1262_
						= (Class427.anIntArray4806
						   [i_1173_]);
					    int i_1263_
						= (Class427.anIntArray4805
						   [i_1173_]);
					    int i_1264_
						= (((aShortArray9864[i_1261_]
						     * i_1262_)
						    + (aShortArray9816[i_1261_]
						       * i_1263_)
						    + 16383)
						   >> 14);
					    aShortArray9864[i_1261_]
						= (short) ((((aShortArray9864
							      [i_1261_])
							     * i_1263_)
							    - ((aShortArray9816
								[i_1261_])
							       * i_1262_)
							    + 16383)
							   >> 14);
					    aShortArray9816[i_1261_]
						= (short) i_1264_;
					}
					if (i_1171_ != 0) {
					    int i_1265_
						= (Class427.anIntArray4806
						   [i_1171_]);
					    int i_1266_
						= (Class427.anIntArray4805
						   [i_1171_]);
					    int i_1267_
						= (((aShortArray9864[i_1261_]
						     * i_1266_)
						    - (aShortArray9869[i_1261_]
						       * i_1265_)
						    + 16383)
						   >> 14);
					    aShortArray9869[i_1261_]
						= (short) ((((aShortArray9864
							      [i_1261_])
							     * i_1265_)
							    + ((aShortArray9869
								[i_1261_])
							       * i_1266_)
							    + 16383)
							   >> 14);
					    aShortArray9864[i_1261_]
						= (short) i_1267_;
					}
					if (i_1172_ != 0) {
					    int i_1268_
						= (Class427.anIntArray4806
						   [i_1172_]);
					    int i_1269_
						= (Class427.anIntArray4805
						   [i_1172_]);
					    int i_1270_
						= (((aShortArray9869[i_1261_]
						     * i_1268_)
						    + (aShortArray9816[i_1261_]
						       * i_1269_)
						    + 16383)
						   >> 14);
					    aShortArray9869[i_1261_]
						= (short) ((((aShortArray9869
							      [i_1261_])
							     * i_1269_)
							    - ((aShortArray9816
								[i_1261_])
							       * i_1268_)
							    + 16383)
							   >> 14);
					    aShortArray9816[i_1261_]
						= (short) i_1270_;
					}
				    }
				}
			    }
			}
		    }
		    method15505();
		}
	    }
	} else if (i == 3) {
	    if (is_1175_ != null) {
		int i_1271_ = is_1175_[9] << 4;
		int i_1272_ = is_1175_[10] << 4;
		int i_1273_ = is_1175_[11] << 4;
		int i_1274_ = is_1175_[12] << 4;
		int i_1275_ = is_1175_[13] << 4;
		int i_1276_ = is_1175_[14] << 4;
		if (aBool9874) {
		    int i_1277_
			= ((is_1175_[0] * anInt9871 + is_1175_[3] * anInt9818
			    + is_1175_[6] * anInt9873 + 8192)
			   >> 14);
		    int i_1278_
			= ((is_1175_[1] * anInt9871 + is_1175_[4] * anInt9818
			    + is_1175_[7] * anInt9873 + 8192)
			   >> 14);
		    int i_1279_
			= ((is_1175_[2] * anInt9871 + is_1175_[5] * anInt9818
			    + is_1175_[8] * anInt9873 + 8192)
			   >> 14);
		    i_1277_ += i_1274_;
		    i_1278_ += i_1275_;
		    i_1279_ += i_1276_;
		    anInt9871 = i_1277_;
		    anInt9818 = i_1278_;
		    anInt9873 = i_1279_;
		    aBool9874 = false;
		}
		int i_1280_ = i_1171_ << 15 >> 7;
		int i_1281_ = i_1172_ << 15 >> 7;
		int i_1282_ = i_1173_ << 15 >> 7;
		int i_1283_ = i_1280_ * -anInt9871 + 8192 >> 14;
		int i_1284_ = i_1281_ * -anInt9818 + 8192 >> 14;
		int i_1285_ = i_1282_ * -anInt9873 + 8192 >> 14;
		int i_1286_ = i_1283_ + anInt9871;
		int i_1287_ = i_1284_ + anInt9818;
		int i_1288_ = i_1285_ + anInt9873;
		int[] is_1289_ = new int[9];
		is_1289_[0] = i_1280_ * is_1175_[0] + 8192 >> 14;
		is_1289_[1] = i_1280_ * is_1175_[3] + 8192 >> 14;
		is_1289_[2] = i_1280_ * is_1175_[6] + 8192 >> 14;
		is_1289_[3] = i_1281_ * is_1175_[1] + 8192 >> 14;
		is_1289_[4] = i_1281_ * is_1175_[4] + 8192 >> 14;
		is_1289_[5] = i_1281_ * is_1175_[7] + 8192 >> 14;
		is_1289_[6] = i_1282_ * is_1175_[2] + 8192 >> 14;
		is_1289_[7] = i_1282_ * is_1175_[5] + 8192 >> 14;
		is_1289_[8] = i_1282_ * is_1175_[8] + 8192 >> 14;
		int i_1290_ = i_1280_ * i_1274_ + 8192 >> 14;
		int i_1291_ = i_1281_ * i_1275_ + 8192 >> 14;
		int i_1292_ = i_1282_ * i_1276_ + 8192 >> 14;
		i_1290_ += i_1286_;
		i_1291_ += i_1287_;
		i_1292_ += i_1288_;
		int[] is_1293_ = new int[9];
		for (int i_1294_ = 0; i_1294_ < 3; i_1294_++) {
		    for (int i_1295_ = 0; i_1295_ < 3; i_1295_++) {
			int i_1296_ = 0;
			for (int i_1297_ = 0; i_1297_ < 3; i_1297_++)
			    i_1296_ += (is_1175_[i_1294_ * 3 + i_1297_]
					* is_1289_[i_1295_ + i_1297_ * 3]);
			is_1293_[i_1294_ * 3 + i_1295_] = i_1296_ + 8192 >> 14;
		    }
		}
		int i_1298_ = ((is_1175_[0] * i_1290_ + is_1175_[1] * i_1291_
				+ is_1175_[2] * i_1292_ + 8192)
			       >> 14);
		int i_1299_ = ((is_1175_[3] * i_1290_ + is_1175_[4] * i_1291_
				+ is_1175_[5] * i_1292_ + 8192)
			       >> 14);
		int i_1300_ = ((is_1175_[6] * i_1290_ + is_1175_[7] * i_1291_
				+ is_1175_[8] * i_1292_ + 8192)
			       >> 14);
		i_1298_ += i_1271_;
		i_1299_ += i_1272_;
		i_1300_ += i_1273_;
		for (int i_1301_ = 0; i_1301_ < i_1176_; i_1301_++) {
		    int i_1302_ = is[i_1301_];
		    if (i_1302_ < anIntArrayArray9819.length) {
			int[] is_1303_ = anIntArrayArray9819[i_1302_];
			for (int i_1304_ = 0; i_1304_ < is_1303_.length;
			     i_1304_++) {
			    int i_1305_ = is_1303_[i_1304_];
			    if (aShortArray9812 == null
				|| (i_1174_ & aShortArray9812[i_1305_]) != 0) {
				int i_1306_
				    = ((is_1293_[0] * anIntArray9808[i_1305_]
					+ is_1293_[1] * anIntArray9809[i_1305_]
					+ is_1293_[2] * anIntArray9828[i_1305_]
					+ 8192)
				       >> 14);
				int i_1307_
				    = ((is_1293_[3] * anIntArray9808[i_1305_]
					+ is_1293_[4] * anIntArray9809[i_1305_]
					+ is_1293_[5] * anIntArray9828[i_1305_]
					+ 8192)
				       >> 14);
				int i_1308_
				    = ((is_1293_[6] * anIntArray9808[i_1305_]
					+ is_1293_[7] * anIntArray9809[i_1305_]
					+ is_1293_[8] * anIntArray9828[i_1305_]
					+ 8192)
				       >> 14);
				i_1306_ += i_1298_;
				i_1307_ += i_1299_;
				i_1308_ += i_1300_;
				anIntArray9808[i_1305_] = i_1306_;
				anIntArray9809[i_1305_] = i_1307_;
				anIntArray9828[i_1305_] = i_1308_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1309_ = 0; i_1309_ < i_1176_; i_1309_++) {
		    int i_1310_ = is[i_1309_];
		    if (i_1310_ < anIntArrayArray9819.length) {
			int[] is_1311_ = anIntArrayArray9819[i_1310_];
			for (int i_1312_ = 0; i_1312_ < is_1311_.length;
			     i_1312_++) {
			    int i_1313_ = is_1311_[i_1312_];
			    if (aShortArray9812 == null
				|| (i_1174_ & aShortArray9812[i_1313_]) != 0) {
				anIntArray9808[i_1313_] -= anInt9871;
				anIntArray9809[i_1313_] -= anInt9818;
				anIntArray9828[i_1313_] -= anInt9873;
				anIntArray9808[i_1313_]
				    = anIntArray9808[i_1313_] * i_1171_ >> 7;
				anIntArray9809[i_1313_]
				    = anIntArray9809[i_1313_] * i_1172_ >> 7;
				anIntArray9828[i_1313_]
				    = anIntArray9828[i_1313_] * i_1173_ >> 7;
				anIntArray9808[i_1313_] += anInt9871;
				anIntArray9809[i_1313_] += anInt9818;
				anIntArray9828[i_1313_] += anInt9873;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9831 != null) {
		boolean bool_1314_ = false;
		for (int i_1315_ = 0; i_1315_ < i_1176_; i_1315_++) {
		    int i_1316_ = is[i_1315_];
		    if (i_1316_ < anIntArrayArray9831.length) {
			int[] is_1317_ = anIntArrayArray9831[i_1316_];
			for (int i_1318_ = 0; i_1318_ < is_1317_.length;
			     i_1318_++) {
			    int i_1319_ = is_1317_[i_1318_];
			    if (aShortArray9832 == null
				|| (i_1174_ & aShortArray9832[i_1319_]) != 0) {
				int i_1320_ = ((aByteArray9826[i_1319_] & 0xff)
					       + i_1171_ * 8);
				if (i_1320_ < 0)
				    i_1320_ = 0;
				else if (i_1320_ > 255)
				    i_1320_ = 255;
				aByteArray9826[i_1319_] = (byte) i_1320_;
			    }
			}
			bool_1314_ = bool_1314_ | is_1317_.length > 0;
		    }
		}
		if (bool_1314_) {
		    if (aClass368Array9861 != null) {
			for (int i_1321_ = 0; i_1321_ < anInt9860; i_1321_++) {
			    Class368 class368 = aClass368Array9861[i_1321_];
			    Class339 class339 = aClass339Array9862[i_1321_];
			    class339.anInt3539
				= (class339.anInt3539 & 0xffffff
				   | 255 - (aByteArray9826[class368.anInt3860]
					    & 0xff) << 24);
			}
		    }
		    method15504();
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9831 != null) {
		boolean bool_1322_ = false;
		for (int i_1323_ = 0; i_1323_ < i_1176_; i_1323_++) {
		    int i_1324_ = is[i_1323_];
		    if (i_1324_ < anIntArrayArray9831.length) {
			int[] is_1325_ = anIntArrayArray9831[i_1324_];
			for (int i_1326_ = 0; i_1326_ < is_1325_.length;
			     i_1326_++) {
			    int i_1327_ = is_1325_[i_1326_];
			    if (aShortArray9832 == null
				|| (i_1174_ & aShortArray9832[i_1327_]) != 0) {
				int i_1328_
				    = aShortArray9825[i_1327_] & 0xffff;
				int i_1329_ = i_1328_ >> 10 & 0x3f;
				int i_1330_ = i_1328_ >> 7 & 0x7;
				int i_1331_ = i_1328_ & 0x7f;
				i_1329_ = i_1329_ + i_1171_ & 0x3f;
				i_1330_ += i_1172_ / 4;
				if (i_1330_ < 0)
				    i_1330_ = 0;
				else if (i_1330_ > 7)
				    i_1330_ = 7;
				i_1331_ += i_1173_;
				if (i_1331_ < 0)
				    i_1331_ = 0;
				else if (i_1331_ > 127)
				    i_1331_ = 127;
				aShortArray9825[i_1327_]
				    = (short) (i_1329_ << 10 | i_1330_ << 7
					       | i_1331_);
			    }
			}
			bool_1322_ = bool_1322_ | is_1325_.length > 0;
		    }
		}
		if (bool_1322_) {
		    if (aClass368Array9861 != null) {
			for (int i_1332_ = 0; i_1332_ < anInt9860; i_1332_++) {
			    Class368 class368 = aClass368Array9861[i_1332_];
			    Class339 class339 = aClass339Array9862[i_1332_];
			    class339.anInt3539
				= (class339.anInt3539 & ~0xffffff
				   | (Class661.anIntArray8549
				      [(aShortArray9825[class368.anInt3860]
					& 0xffff)]) & 0xffffff);
			}
		    }
		    method15504();
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9856 != null) {
		for (int i_1333_ = 0; i_1333_ < i_1176_; i_1333_++) {
		    int i_1334_ = is[i_1333_];
		    if (i_1334_ < anIntArrayArray9856.length) {
			int[] is_1335_ = anIntArrayArray9856[i_1334_];
			for (int i_1336_ = 0; i_1336_ < is_1335_.length;
			     i_1336_++) {
			    Class339 class339
				= aClass339Array9862[is_1335_[i_1336_]];
			    class339.anInt3537 += i_1171_;
			    class339.anInt3534 += i_1172_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9856 != null) {
		for (int i_1337_ = 0; i_1337_ < i_1176_; i_1337_++) {
		    int i_1338_ = is[i_1337_];
		    if (i_1338_ < anIntArrayArray9856.length) {
			int[] is_1339_ = anIntArrayArray9856[i_1338_];
			for (int i_1340_ = 0; i_1340_ < is_1339_.length;
			     i_1340_++) {
			    Class339 class339
				= aClass339Array9862[is_1339_[i_1340_]];
			    class339.anInt3538
				= class339.anInt3538 * i_1171_ >> 7;
			    class339.anInt3536
				= class339.anInt3536 * i_1172_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9856 != null) {
		for (int i_1341_ = 0; i_1341_ < i_1176_; i_1341_++) {
		    int i_1342_ = is[i_1341_];
		    if (i_1342_ < anIntArrayArray9856.length) {
			int[] is_1343_ = anIntArrayArray9856[i_1342_];
			for (int i_1344_ = 0; i_1344_ < is_1343_.length;
			     i_1344_++) {
			    Class339 class339
				= aClass339Array9862[is_1343_[i_1344_]];
			    class339.anInt3535
				= class339.anInt3535 + i_1171_ & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    void method3102(int i, int[] is, int i_1345_, int i_1346_, int i_1347_,
		    boolean bool, int i_1348_, int[] is_1349_) {
	int i_1350_ = is.length;
	if (i == 0) {
	    i_1345_ <<= 4;
	    i_1346_ <<= 4;
	    i_1347_ <<= 4;
	    int i_1351_ = 0;
	    anInt9871 = 0;
	    anInt9818 = 0;
	    anInt9873 = 0;
	    for (int i_1352_ = 0; i_1352_ < i_1350_; i_1352_++) {
		int i_1353_ = is[i_1352_];
		if (i_1353_ < anIntArrayArray9819.length) {
		    int[] is_1354_ = anIntArrayArray9819[i_1353_];
		    for (int i_1355_ = 0; i_1355_ < is_1354_.length;
			 i_1355_++) {
			int i_1356_ = is_1354_[i_1355_];
			if (aShortArray9812 == null
			    || (i_1348_ & aShortArray9812[i_1356_]) != 0) {
			    anInt9871 += anIntArray9808[i_1356_];
			    anInt9818 += anIntArray9809[i_1356_];
			    anInt9873 += anIntArray9828[i_1356_];
			    i_1351_++;
			}
		    }
		}
	    }
	    if (i_1351_ > 0) {
		anInt9871 = anInt9871 / i_1351_ + i_1345_;
		anInt9818 = anInt9818 / i_1351_ + i_1346_;
		anInt9873 = anInt9873 / i_1351_ + i_1347_;
		aBool9874 = true;
	    } else {
		anInt9871 = i_1345_;
		anInt9818 = i_1346_;
		anInt9873 = i_1347_;
	    }
	} else if (i == 1) {
	    if (is_1349_ != null) {
		int i_1357_ = ((is_1349_[0] * i_1345_ + is_1349_[1] * i_1346_
				+ is_1349_[2] * i_1347_ + 8192)
			       >> 14);
		int i_1358_ = ((is_1349_[3] * i_1345_ + is_1349_[4] * i_1346_
				+ is_1349_[5] * i_1347_ + 8192)
			       >> 14);
		int i_1359_ = ((is_1349_[6] * i_1345_ + is_1349_[7] * i_1346_
				+ is_1349_[8] * i_1347_ + 8192)
			       >> 14);
		i_1345_ = i_1357_;
		i_1346_ = i_1358_;
		i_1347_ = i_1359_;
	    }
	    i_1345_ <<= 4;
	    i_1346_ <<= 4;
	    i_1347_ <<= 4;
	    for (int i_1360_ = 0; i_1360_ < i_1350_; i_1360_++) {
		int i_1361_ = is[i_1360_];
		if (i_1361_ < anIntArrayArray9819.length) {
		    int[] is_1362_ = anIntArrayArray9819[i_1361_];
		    for (int i_1363_ = 0; i_1363_ < is_1362_.length;
			 i_1363_++) {
			int i_1364_ = is_1362_[i_1363_];
			if (aShortArray9812 == null
			    || (i_1348_ & aShortArray9812[i_1364_]) != 0) {
			    anIntArray9808[i_1364_] += i_1345_;
			    anIntArray9809[i_1364_] += i_1346_;
			    anIntArray9828[i_1364_] += i_1347_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_1349_ != null) {
		int i_1365_ = is_1349_[9] << 4;
		int i_1366_ = is_1349_[10] << 4;
		int i_1367_ = is_1349_[11] << 4;
		int i_1368_ = is_1349_[12] << 4;
		int i_1369_ = is_1349_[13] << 4;
		int i_1370_ = is_1349_[14] << 4;
		if (aBool9874) {
		    int i_1371_
			= ((is_1349_[0] * anInt9871 + is_1349_[3] * anInt9818
			    + is_1349_[6] * anInt9873 + 8192)
			   >> 14);
		    int i_1372_
			= ((is_1349_[1] * anInt9871 + is_1349_[4] * anInt9818
			    + is_1349_[7] * anInt9873 + 8192)
			   >> 14);
		    int i_1373_
			= ((is_1349_[2] * anInt9871 + is_1349_[5] * anInt9818
			    + is_1349_[8] * anInt9873 + 8192)
			   >> 14);
		    i_1371_ += i_1368_;
		    i_1372_ += i_1369_;
		    i_1373_ += i_1370_;
		    anInt9871 = i_1371_;
		    anInt9818 = i_1372_;
		    anInt9873 = i_1373_;
		    aBool9874 = false;
		}
		int[] is_1374_ = new int[9];
		int i_1375_ = Class427.anIntArray4805[i_1345_];
		int i_1376_ = Class427.anIntArray4806[i_1345_];
		int i_1377_ = Class427.anIntArray4805[i_1346_];
		int i_1378_ = Class427.anIntArray4806[i_1346_];
		int i_1379_ = Class427.anIntArray4805[i_1347_];
		int i_1380_ = Class427.anIntArray4806[i_1347_];
		int i_1381_ = i_1376_ * i_1379_ + 8192 >> 14;
		int i_1382_ = i_1376_ * i_1380_ + 8192 >> 14;
		is_1374_[0]
		    = i_1377_ * i_1379_ + i_1378_ * i_1382_ + 8192 >> 14;
		is_1374_[1]
		    = -i_1377_ * i_1380_ + i_1378_ * i_1381_ + 8192 >> 14;
		is_1374_[2] = i_1378_ * i_1375_ + 8192 >> 14;
		is_1374_[3] = i_1375_ * i_1380_ + 8192 >> 14;
		is_1374_[4] = i_1375_ * i_1379_ + 8192 >> 14;
		is_1374_[5] = -i_1376_;
		is_1374_[6]
		    = -i_1378_ * i_1379_ + i_1377_ * i_1382_ + 8192 >> 14;
		is_1374_[7]
		    = i_1378_ * i_1380_ + i_1377_ * i_1381_ + 8192 >> 14;
		is_1374_[8] = i_1377_ * i_1375_ + 8192 >> 14;
		int i_1383_
		    = ((is_1374_[0] * -anInt9871 + is_1374_[1] * -anInt9818
			+ is_1374_[2] * -anInt9873 + 8192)
		       >> 14);
		int i_1384_
		    = ((is_1374_[3] * -anInt9871 + is_1374_[4] * -anInt9818
			+ is_1374_[5] * -anInt9873 + 8192)
		       >> 14);
		int i_1385_
		    = ((is_1374_[6] * -anInt9871 + is_1374_[7] * -anInt9818
			+ is_1374_[8] * -anInt9873 + 8192)
		       >> 14);
		int i_1386_ = i_1383_ + anInt9871;
		int i_1387_ = i_1384_ + anInt9818;
		int i_1388_ = i_1385_ + anInt9873;
		int[] is_1389_ = new int[9];
		for (int i_1390_ = 0; i_1390_ < 3; i_1390_++) {
		    for (int i_1391_ = 0; i_1391_ < 3; i_1391_++) {
			int i_1392_ = 0;
			for (int i_1393_ = 0; i_1393_ < 3; i_1393_++)
			    i_1392_ += (is_1374_[i_1390_ * 3 + i_1393_]
					* is_1349_[i_1391_ * 3 + i_1393_]);
			is_1389_[i_1390_ * 3 + i_1391_] = i_1392_ + 8192 >> 14;
		    }
		}
		int i_1394_ = ((is_1374_[0] * i_1368_ + is_1374_[1] * i_1369_
				+ is_1374_[2] * i_1370_ + 8192)
			       >> 14);
		int i_1395_ = ((is_1374_[3] * i_1368_ + is_1374_[4] * i_1369_
				+ is_1374_[5] * i_1370_ + 8192)
			       >> 14);
		int i_1396_ = ((is_1374_[6] * i_1368_ + is_1374_[7] * i_1369_
				+ is_1374_[8] * i_1370_ + 8192)
			       >> 14);
		i_1394_ += i_1386_;
		i_1395_ += i_1387_;
		i_1396_ += i_1388_;
		int[] is_1397_ = new int[9];
		for (int i_1398_ = 0; i_1398_ < 3; i_1398_++) {
		    for (int i_1399_ = 0; i_1399_ < 3; i_1399_++) {
			int i_1400_ = 0;
			for (int i_1401_ = 0; i_1401_ < 3; i_1401_++)
			    i_1400_ += (is_1349_[i_1398_ * 3 + i_1401_]
					* is_1389_[i_1399_ + i_1401_ * 3]);
			is_1397_[i_1398_ * 3 + i_1399_] = i_1400_ + 8192 >> 14;
		    }
		}
		int i_1402_ = ((is_1349_[0] * i_1394_ + is_1349_[1] * i_1395_
				+ is_1349_[2] * i_1396_ + 8192)
			       >> 14);
		int i_1403_ = ((is_1349_[3] * i_1394_ + is_1349_[4] * i_1395_
				+ is_1349_[5] * i_1396_ + 8192)
			       >> 14);
		int i_1404_ = ((is_1349_[6] * i_1394_ + is_1349_[7] * i_1395_
				+ is_1349_[8] * i_1396_ + 8192)
			       >> 14);
		i_1402_ += i_1365_;
		i_1403_ += i_1366_;
		i_1404_ += i_1367_;
		for (int i_1405_ = 0; i_1405_ < i_1350_; i_1405_++) {
		    int i_1406_ = is[i_1405_];
		    if (i_1406_ < anIntArrayArray9819.length) {
			int[] is_1407_ = anIntArrayArray9819[i_1406_];
			for (int i_1408_ = 0; i_1408_ < is_1407_.length;
			     i_1408_++) {
			    int i_1409_ = is_1407_[i_1408_];
			    if (aShortArray9812 == null
				|| (i_1348_ & aShortArray9812[i_1409_]) != 0) {
				int i_1410_
				    = ((is_1397_[0] * anIntArray9808[i_1409_]
					+ is_1397_[1] * anIntArray9809[i_1409_]
					+ is_1397_[2] * anIntArray9828[i_1409_]
					+ 8192)
				       >> 14);
				int i_1411_
				    = ((is_1397_[3] * anIntArray9808[i_1409_]
					+ is_1397_[4] * anIntArray9809[i_1409_]
					+ is_1397_[5] * anIntArray9828[i_1409_]
					+ 8192)
				       >> 14);
				int i_1412_
				    = ((is_1397_[6] * anIntArray9808[i_1409_]
					+ is_1397_[7] * anIntArray9809[i_1409_]
					+ is_1397_[8] * anIntArray9828[i_1409_]
					+ 8192)
				       >> 14);
				i_1410_ += i_1402_;
				i_1411_ += i_1403_;
				i_1412_ += i_1404_;
				anIntArray9808[i_1409_] = i_1410_;
				anIntArray9809[i_1409_] = i_1411_;
				anIntArray9828[i_1409_] = i_1412_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1413_ = 0; i_1413_ < i_1350_; i_1413_++) {
		    int i_1414_ = is[i_1413_];
		    if (i_1414_ < anIntArrayArray9819.length) {
			int[] is_1415_ = anIntArrayArray9819[i_1414_];
			for (int i_1416_ = 0; i_1416_ < is_1415_.length;
			     i_1416_++) {
			    int i_1417_ = is_1415_[i_1416_];
			    if (aShortArray9812 == null
				|| (i_1348_ & aShortArray9812[i_1417_]) != 0) {
				anIntArray9808[i_1417_] -= anInt9871;
				anIntArray9809[i_1417_] -= anInt9818;
				anIntArray9828[i_1417_] -= anInt9873;
				if (i_1347_ != 0) {
				    int i_1418_
					= Class427.anIntArray4806[i_1347_];
				    int i_1419_
					= Class427.anIntArray4805[i_1347_];
				    int i_1420_
					= ((anIntArray9809[i_1417_] * i_1418_
					    + anIntArray9808[i_1417_] * i_1419_
					    + 16383)
					   >> 14);
				    anIntArray9809[i_1417_]
					= (anIntArray9809[i_1417_] * i_1419_
					   - anIntArray9808[i_1417_] * i_1418_
					   + 16383) >> 14;
				    anIntArray9808[i_1417_] = i_1420_;
				}
				if (i_1345_ != 0) {
				    int i_1421_
					= Class427.anIntArray4806[i_1345_];
				    int i_1422_
					= Class427.anIntArray4805[i_1345_];
				    int i_1423_
					= ((anIntArray9809[i_1417_] * i_1422_
					    - anIntArray9828[i_1417_] * i_1421_
					    + 16383)
					   >> 14);
				    anIntArray9828[i_1417_]
					= (anIntArray9809[i_1417_] * i_1421_
					   + anIntArray9828[i_1417_] * i_1422_
					   + 16383) >> 14;
				    anIntArray9809[i_1417_] = i_1423_;
				}
				if (i_1346_ != 0) {
				    int i_1424_
					= Class427.anIntArray4806[i_1346_];
				    int i_1425_
					= Class427.anIntArray4805[i_1346_];
				    int i_1426_
					= ((anIntArray9828[i_1417_] * i_1424_
					    + anIntArray9808[i_1417_] * i_1425_
					    + 16383)
					   >> 14);
				    anIntArray9828[i_1417_]
					= (anIntArray9828[i_1417_] * i_1425_
					   - anIntArray9808[i_1417_] * i_1424_
					   + 16383) >> 14;
				    anIntArray9808[i_1417_] = i_1426_;
				}
				anIntArray9808[i_1417_] += anInt9871;
				anIntArray9809[i_1417_] += anInt9818;
				anIntArray9828[i_1417_] += anInt9873;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_1427_ = 0; i_1427_ < i_1350_; i_1427_++) {
			int i_1428_ = is[i_1427_];
			if (i_1428_ < anIntArrayArray9819.length) {
			    int[] is_1429_ = anIntArrayArray9819[i_1428_];
			    for (int i_1430_ = 0; i_1430_ < is_1429_.length;
				 i_1430_++) {
				int i_1431_ = is_1429_[i_1430_];
				if (aShortArray9812 == null
				    || ((i_1348_ & aShortArray9812[i_1431_])
					!= 0)) {
				    int i_1432_ = anIntArray9853[i_1431_];
				    int i_1433_ = anIntArray9853[i_1431_ + 1];
				    for (int i_1434_ = i_1432_;
					 (i_1434_ < i_1433_
					  && aShortArray9863[i_1434_] != 0);
					 i_1434_++) {
					int i_1435_ = (aShortArray9863[i_1434_]
						       & 0xffff) - 1;
					if (i_1347_ != 0) {
					    int i_1436_
						= (Class427.anIntArray4806
						   [i_1347_]);
					    int i_1437_
						= (Class427.anIntArray4805
						   [i_1347_]);
					    int i_1438_
						= (((aShortArray9864[i_1435_]
						     * i_1436_)
						    + (aShortArray9816[i_1435_]
						       * i_1437_)
						    + 16383)
						   >> 14);
					    aShortArray9864[i_1435_]
						= (short) ((((aShortArray9864
							      [i_1435_])
							     * i_1437_)
							    - ((aShortArray9816
								[i_1435_])
							       * i_1436_)
							    + 16383)
							   >> 14);
					    aShortArray9816[i_1435_]
						= (short) i_1438_;
					}
					if (i_1345_ != 0) {
					    int i_1439_
						= (Class427.anIntArray4806
						   [i_1345_]);
					    int i_1440_
						= (Class427.anIntArray4805
						   [i_1345_]);
					    int i_1441_
						= (((aShortArray9864[i_1435_]
						     * i_1440_)
						    - (aShortArray9869[i_1435_]
						       * i_1439_)
						    + 16383)
						   >> 14);
					    aShortArray9869[i_1435_]
						= (short) ((((aShortArray9864
							      [i_1435_])
							     * i_1439_)
							    + ((aShortArray9869
								[i_1435_])
							       * i_1440_)
							    + 16383)
							   >> 14);
					    aShortArray9864[i_1435_]
						= (short) i_1441_;
					}
					if (i_1346_ != 0) {
					    int i_1442_
						= (Class427.anIntArray4806
						   [i_1346_]);
					    int i_1443_
						= (Class427.anIntArray4805
						   [i_1346_]);
					    int i_1444_
						= (((aShortArray9869[i_1435_]
						     * i_1442_)
						    + (aShortArray9816[i_1435_]
						       * i_1443_)
						    + 16383)
						   >> 14);
					    aShortArray9869[i_1435_]
						= (short) ((((aShortArray9869
							      [i_1435_])
							     * i_1443_)
							    - ((aShortArray9816
								[i_1435_])
							       * i_1442_)
							    + 16383)
							   >> 14);
					    aShortArray9816[i_1435_]
						= (short) i_1444_;
					}
				    }
				}
			    }
			}
		    }
		    method15505();
		}
	    }
	} else if (i == 3) {
	    if (is_1349_ != null) {
		int i_1445_ = is_1349_[9] << 4;
		int i_1446_ = is_1349_[10] << 4;
		int i_1447_ = is_1349_[11] << 4;
		int i_1448_ = is_1349_[12] << 4;
		int i_1449_ = is_1349_[13] << 4;
		int i_1450_ = is_1349_[14] << 4;
		if (aBool9874) {
		    int i_1451_
			= ((is_1349_[0] * anInt9871 + is_1349_[3] * anInt9818
			    + is_1349_[6] * anInt9873 + 8192)
			   >> 14);
		    int i_1452_
			= ((is_1349_[1] * anInt9871 + is_1349_[4] * anInt9818
			    + is_1349_[7] * anInt9873 + 8192)
			   >> 14);
		    int i_1453_
			= ((is_1349_[2] * anInt9871 + is_1349_[5] * anInt9818
			    + is_1349_[8] * anInt9873 + 8192)
			   >> 14);
		    i_1451_ += i_1448_;
		    i_1452_ += i_1449_;
		    i_1453_ += i_1450_;
		    anInt9871 = i_1451_;
		    anInt9818 = i_1452_;
		    anInt9873 = i_1453_;
		    aBool9874 = false;
		}
		int i_1454_ = i_1345_ << 15 >> 7;
		int i_1455_ = i_1346_ << 15 >> 7;
		int i_1456_ = i_1347_ << 15 >> 7;
		int i_1457_ = i_1454_ * -anInt9871 + 8192 >> 14;
		int i_1458_ = i_1455_ * -anInt9818 + 8192 >> 14;
		int i_1459_ = i_1456_ * -anInt9873 + 8192 >> 14;
		int i_1460_ = i_1457_ + anInt9871;
		int i_1461_ = i_1458_ + anInt9818;
		int i_1462_ = i_1459_ + anInt9873;
		int[] is_1463_ = new int[9];
		is_1463_[0] = i_1454_ * is_1349_[0] + 8192 >> 14;
		is_1463_[1] = i_1454_ * is_1349_[3] + 8192 >> 14;
		is_1463_[2] = i_1454_ * is_1349_[6] + 8192 >> 14;
		is_1463_[3] = i_1455_ * is_1349_[1] + 8192 >> 14;
		is_1463_[4] = i_1455_ * is_1349_[4] + 8192 >> 14;
		is_1463_[5] = i_1455_ * is_1349_[7] + 8192 >> 14;
		is_1463_[6] = i_1456_ * is_1349_[2] + 8192 >> 14;
		is_1463_[7] = i_1456_ * is_1349_[5] + 8192 >> 14;
		is_1463_[8] = i_1456_ * is_1349_[8] + 8192 >> 14;
		int i_1464_ = i_1454_ * i_1448_ + 8192 >> 14;
		int i_1465_ = i_1455_ * i_1449_ + 8192 >> 14;
		int i_1466_ = i_1456_ * i_1450_ + 8192 >> 14;
		i_1464_ += i_1460_;
		i_1465_ += i_1461_;
		i_1466_ += i_1462_;
		int[] is_1467_ = new int[9];
		for (int i_1468_ = 0; i_1468_ < 3; i_1468_++) {
		    for (int i_1469_ = 0; i_1469_ < 3; i_1469_++) {
			int i_1470_ = 0;
			for (int i_1471_ = 0; i_1471_ < 3; i_1471_++)
			    i_1470_ += (is_1349_[i_1468_ * 3 + i_1471_]
					* is_1463_[i_1469_ + i_1471_ * 3]);
			is_1467_[i_1468_ * 3 + i_1469_] = i_1470_ + 8192 >> 14;
		    }
		}
		int i_1472_ = ((is_1349_[0] * i_1464_ + is_1349_[1] * i_1465_
				+ is_1349_[2] * i_1466_ + 8192)
			       >> 14);
		int i_1473_ = ((is_1349_[3] * i_1464_ + is_1349_[4] * i_1465_
				+ is_1349_[5] * i_1466_ + 8192)
			       >> 14);
		int i_1474_ = ((is_1349_[6] * i_1464_ + is_1349_[7] * i_1465_
				+ is_1349_[8] * i_1466_ + 8192)
			       >> 14);
		i_1472_ += i_1445_;
		i_1473_ += i_1446_;
		i_1474_ += i_1447_;
		for (int i_1475_ = 0; i_1475_ < i_1350_; i_1475_++) {
		    int i_1476_ = is[i_1475_];
		    if (i_1476_ < anIntArrayArray9819.length) {
			int[] is_1477_ = anIntArrayArray9819[i_1476_];
			for (int i_1478_ = 0; i_1478_ < is_1477_.length;
			     i_1478_++) {
			    int i_1479_ = is_1477_[i_1478_];
			    if (aShortArray9812 == null
				|| (i_1348_ & aShortArray9812[i_1479_]) != 0) {
				int i_1480_
				    = ((is_1467_[0] * anIntArray9808[i_1479_]
					+ is_1467_[1] * anIntArray9809[i_1479_]
					+ is_1467_[2] * anIntArray9828[i_1479_]
					+ 8192)
				       >> 14);
				int i_1481_
				    = ((is_1467_[3] * anIntArray9808[i_1479_]
					+ is_1467_[4] * anIntArray9809[i_1479_]
					+ is_1467_[5] * anIntArray9828[i_1479_]
					+ 8192)
				       >> 14);
				int i_1482_
				    = ((is_1467_[6] * anIntArray9808[i_1479_]
					+ is_1467_[7] * anIntArray9809[i_1479_]
					+ is_1467_[8] * anIntArray9828[i_1479_]
					+ 8192)
				       >> 14);
				i_1480_ += i_1472_;
				i_1481_ += i_1473_;
				i_1482_ += i_1474_;
				anIntArray9808[i_1479_] = i_1480_;
				anIntArray9809[i_1479_] = i_1481_;
				anIntArray9828[i_1479_] = i_1482_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1483_ = 0; i_1483_ < i_1350_; i_1483_++) {
		    int i_1484_ = is[i_1483_];
		    if (i_1484_ < anIntArrayArray9819.length) {
			int[] is_1485_ = anIntArrayArray9819[i_1484_];
			for (int i_1486_ = 0; i_1486_ < is_1485_.length;
			     i_1486_++) {
			    int i_1487_ = is_1485_[i_1486_];
			    if (aShortArray9812 == null
				|| (i_1348_ & aShortArray9812[i_1487_]) != 0) {
				anIntArray9808[i_1487_] -= anInt9871;
				anIntArray9809[i_1487_] -= anInt9818;
				anIntArray9828[i_1487_] -= anInt9873;
				anIntArray9808[i_1487_]
				    = anIntArray9808[i_1487_] * i_1345_ >> 7;
				anIntArray9809[i_1487_]
				    = anIntArray9809[i_1487_] * i_1346_ >> 7;
				anIntArray9828[i_1487_]
				    = anIntArray9828[i_1487_] * i_1347_ >> 7;
				anIntArray9808[i_1487_] += anInt9871;
				anIntArray9809[i_1487_] += anInt9818;
				anIntArray9828[i_1487_] += anInt9873;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9831 != null) {
		boolean bool_1488_ = false;
		for (int i_1489_ = 0; i_1489_ < i_1350_; i_1489_++) {
		    int i_1490_ = is[i_1489_];
		    if (i_1490_ < anIntArrayArray9831.length) {
			int[] is_1491_ = anIntArrayArray9831[i_1490_];
			for (int i_1492_ = 0; i_1492_ < is_1491_.length;
			     i_1492_++) {
			    int i_1493_ = is_1491_[i_1492_];
			    if (aShortArray9832 == null
				|| (i_1348_ & aShortArray9832[i_1493_]) != 0) {
				int i_1494_ = ((aByteArray9826[i_1493_] & 0xff)
					       + i_1345_ * 8);
				if (i_1494_ < 0)
				    i_1494_ = 0;
				else if (i_1494_ > 255)
				    i_1494_ = 255;
				aByteArray9826[i_1493_] = (byte) i_1494_;
			    }
			}
			bool_1488_ = bool_1488_ | is_1491_.length > 0;
		    }
		}
		if (bool_1488_) {
		    if (aClass368Array9861 != null) {
			for (int i_1495_ = 0; i_1495_ < anInt9860; i_1495_++) {
			    Class368 class368 = aClass368Array9861[i_1495_];
			    Class339 class339 = aClass339Array9862[i_1495_];
			    class339.anInt3539
				= (class339.anInt3539 & 0xffffff
				   | 255 - (aByteArray9826[class368.anInt3860]
					    & 0xff) << 24);
			}
		    }
		    method15504();
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9831 != null) {
		boolean bool_1496_ = false;
		for (int i_1497_ = 0; i_1497_ < i_1350_; i_1497_++) {
		    int i_1498_ = is[i_1497_];
		    if (i_1498_ < anIntArrayArray9831.length) {
			int[] is_1499_ = anIntArrayArray9831[i_1498_];
			for (int i_1500_ = 0; i_1500_ < is_1499_.length;
			     i_1500_++) {
			    int i_1501_ = is_1499_[i_1500_];
			    if (aShortArray9832 == null
				|| (i_1348_ & aShortArray9832[i_1501_]) != 0) {
				int i_1502_
				    = aShortArray9825[i_1501_] & 0xffff;
				int i_1503_ = i_1502_ >> 10 & 0x3f;
				int i_1504_ = i_1502_ >> 7 & 0x7;
				int i_1505_ = i_1502_ & 0x7f;
				i_1503_ = i_1503_ + i_1345_ & 0x3f;
				i_1504_ += i_1346_ / 4;
				if (i_1504_ < 0)
				    i_1504_ = 0;
				else if (i_1504_ > 7)
				    i_1504_ = 7;
				i_1505_ += i_1347_;
				if (i_1505_ < 0)
				    i_1505_ = 0;
				else if (i_1505_ > 127)
				    i_1505_ = 127;
				aShortArray9825[i_1501_]
				    = (short) (i_1503_ << 10 | i_1504_ << 7
					       | i_1505_);
			    }
			}
			bool_1496_ = bool_1496_ | is_1499_.length > 0;
		    }
		}
		if (bool_1496_) {
		    if (aClass368Array9861 != null) {
			for (int i_1506_ = 0; i_1506_ < anInt9860; i_1506_++) {
			    Class368 class368 = aClass368Array9861[i_1506_];
			    Class339 class339 = aClass339Array9862[i_1506_];
			    class339.anInt3539
				= (class339.anInt3539 & ~0xffffff
				   | (Class661.anIntArray8549
				      [(aShortArray9825[class368.anInt3860]
					& 0xffff)]) & 0xffffff);
			}
		    }
		    method15504();
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9856 != null) {
		for (int i_1507_ = 0; i_1507_ < i_1350_; i_1507_++) {
		    int i_1508_ = is[i_1507_];
		    if (i_1508_ < anIntArrayArray9856.length) {
			int[] is_1509_ = anIntArrayArray9856[i_1508_];
			for (int i_1510_ = 0; i_1510_ < is_1509_.length;
			     i_1510_++) {
			    Class339 class339
				= aClass339Array9862[is_1509_[i_1510_]];
			    class339.anInt3537 += i_1345_;
			    class339.anInt3534 += i_1346_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9856 != null) {
		for (int i_1511_ = 0; i_1511_ < i_1350_; i_1511_++) {
		    int i_1512_ = is[i_1511_];
		    if (i_1512_ < anIntArrayArray9856.length) {
			int[] is_1513_ = anIntArrayArray9856[i_1512_];
			for (int i_1514_ = 0; i_1514_ < is_1513_.length;
			     i_1514_++) {
			    Class339 class339
				= aClass339Array9862[is_1513_[i_1514_]];
			    class339.anInt3538
				= class339.anInt3538 * i_1345_ >> 7;
			    class339.anInt3536
				= class339.anInt3536 * i_1346_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9856 != null) {
		for (int i_1515_ = 0; i_1515_ < i_1350_; i_1515_++) {
		    int i_1516_ = is[i_1515_];
		    if (i_1516_ < anIntArrayArray9856.length) {
			int[] is_1517_ = anIntArrayArray9856[i_1516_];
			for (int i_1518_ = 0; i_1518_ < is_1517_.length;
			     i_1518_++) {
			    Class339 class339
				= aClass339Array9862[is_1517_[i_1518_]];
			    class339.anInt3535
				= class339.anInt3535 + i_1345_ & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    void method3095(int i, int[] is, int i_1519_, int i_1520_, int i_1521_,
		    boolean bool, int i_1522_, int[] is_1523_) {
	int i_1524_ = is.length;
	if (i == 0) {
	    i_1519_ <<= 4;
	    i_1520_ <<= 4;
	    i_1521_ <<= 4;
	    int i_1525_ = 0;
	    anInt9871 = 0;
	    anInt9818 = 0;
	    anInt9873 = 0;
	    for (int i_1526_ = 0; i_1526_ < i_1524_; i_1526_++) {
		int i_1527_ = is[i_1526_];
		if (i_1527_ < anIntArrayArray9819.length) {
		    int[] is_1528_ = anIntArrayArray9819[i_1527_];
		    for (int i_1529_ = 0; i_1529_ < is_1528_.length;
			 i_1529_++) {
			int i_1530_ = is_1528_[i_1529_];
			if (aShortArray9812 == null
			    || (i_1522_ & aShortArray9812[i_1530_]) != 0) {
			    anInt9871 += anIntArray9808[i_1530_];
			    anInt9818 += anIntArray9809[i_1530_];
			    anInt9873 += anIntArray9828[i_1530_];
			    i_1525_++;
			}
		    }
		}
	    }
	    if (i_1525_ > 0) {
		anInt9871 = anInt9871 / i_1525_ + i_1519_;
		anInt9818 = anInt9818 / i_1525_ + i_1520_;
		anInt9873 = anInt9873 / i_1525_ + i_1521_;
		aBool9874 = true;
	    } else {
		anInt9871 = i_1519_;
		anInt9818 = i_1520_;
		anInt9873 = i_1521_;
	    }
	} else if (i == 1) {
	    if (is_1523_ != null) {
		int i_1531_ = ((is_1523_[0] * i_1519_ + is_1523_[1] * i_1520_
				+ is_1523_[2] * i_1521_ + 8192)
			       >> 14);
		int i_1532_ = ((is_1523_[3] * i_1519_ + is_1523_[4] * i_1520_
				+ is_1523_[5] * i_1521_ + 8192)
			       >> 14);
		int i_1533_ = ((is_1523_[6] * i_1519_ + is_1523_[7] * i_1520_
				+ is_1523_[8] * i_1521_ + 8192)
			       >> 14);
		i_1519_ = i_1531_;
		i_1520_ = i_1532_;
		i_1521_ = i_1533_;
	    }
	    i_1519_ <<= 4;
	    i_1520_ <<= 4;
	    i_1521_ <<= 4;
	    for (int i_1534_ = 0; i_1534_ < i_1524_; i_1534_++) {
		int i_1535_ = is[i_1534_];
		if (i_1535_ < anIntArrayArray9819.length) {
		    int[] is_1536_ = anIntArrayArray9819[i_1535_];
		    for (int i_1537_ = 0; i_1537_ < is_1536_.length;
			 i_1537_++) {
			int i_1538_ = is_1536_[i_1537_];
			if (aShortArray9812 == null
			    || (i_1522_ & aShortArray9812[i_1538_]) != 0) {
			    anIntArray9808[i_1538_] += i_1519_;
			    anIntArray9809[i_1538_] += i_1520_;
			    anIntArray9828[i_1538_] += i_1521_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_1523_ != null) {
		int i_1539_ = is_1523_[9] << 4;
		int i_1540_ = is_1523_[10] << 4;
		int i_1541_ = is_1523_[11] << 4;
		int i_1542_ = is_1523_[12] << 4;
		int i_1543_ = is_1523_[13] << 4;
		int i_1544_ = is_1523_[14] << 4;
		if (aBool9874) {
		    int i_1545_
			= ((is_1523_[0] * anInt9871 + is_1523_[3] * anInt9818
			    + is_1523_[6] * anInt9873 + 8192)
			   >> 14);
		    int i_1546_
			= ((is_1523_[1] * anInt9871 + is_1523_[4] * anInt9818
			    + is_1523_[7] * anInt9873 + 8192)
			   >> 14);
		    int i_1547_
			= ((is_1523_[2] * anInt9871 + is_1523_[5] * anInt9818
			    + is_1523_[8] * anInt9873 + 8192)
			   >> 14);
		    i_1545_ += i_1542_;
		    i_1546_ += i_1543_;
		    i_1547_ += i_1544_;
		    anInt9871 = i_1545_;
		    anInt9818 = i_1546_;
		    anInt9873 = i_1547_;
		    aBool9874 = false;
		}
		int[] is_1548_ = new int[9];
		int i_1549_ = Class427.anIntArray4805[i_1519_];
		int i_1550_ = Class427.anIntArray4806[i_1519_];
		int i_1551_ = Class427.anIntArray4805[i_1520_];
		int i_1552_ = Class427.anIntArray4806[i_1520_];
		int i_1553_ = Class427.anIntArray4805[i_1521_];
		int i_1554_ = Class427.anIntArray4806[i_1521_];
		int i_1555_ = i_1550_ * i_1553_ + 8192 >> 14;
		int i_1556_ = i_1550_ * i_1554_ + 8192 >> 14;
		is_1548_[0]
		    = i_1551_ * i_1553_ + i_1552_ * i_1556_ + 8192 >> 14;
		is_1548_[1]
		    = -i_1551_ * i_1554_ + i_1552_ * i_1555_ + 8192 >> 14;
		is_1548_[2] = i_1552_ * i_1549_ + 8192 >> 14;
		is_1548_[3] = i_1549_ * i_1554_ + 8192 >> 14;
		is_1548_[4] = i_1549_ * i_1553_ + 8192 >> 14;
		is_1548_[5] = -i_1550_;
		is_1548_[6]
		    = -i_1552_ * i_1553_ + i_1551_ * i_1556_ + 8192 >> 14;
		is_1548_[7]
		    = i_1552_ * i_1554_ + i_1551_ * i_1555_ + 8192 >> 14;
		is_1548_[8] = i_1551_ * i_1549_ + 8192 >> 14;
		int i_1557_
		    = ((is_1548_[0] * -anInt9871 + is_1548_[1] * -anInt9818
			+ is_1548_[2] * -anInt9873 + 8192)
		       >> 14);
		int i_1558_
		    = ((is_1548_[3] * -anInt9871 + is_1548_[4] * -anInt9818
			+ is_1548_[5] * -anInt9873 + 8192)
		       >> 14);
		int i_1559_
		    = ((is_1548_[6] * -anInt9871 + is_1548_[7] * -anInt9818
			+ is_1548_[8] * -anInt9873 + 8192)
		       >> 14);
		int i_1560_ = i_1557_ + anInt9871;
		int i_1561_ = i_1558_ + anInt9818;
		int i_1562_ = i_1559_ + anInt9873;
		int[] is_1563_ = new int[9];
		for (int i_1564_ = 0; i_1564_ < 3; i_1564_++) {
		    for (int i_1565_ = 0; i_1565_ < 3; i_1565_++) {
			int i_1566_ = 0;
			for (int i_1567_ = 0; i_1567_ < 3; i_1567_++)
			    i_1566_ += (is_1548_[i_1564_ * 3 + i_1567_]
					* is_1523_[i_1565_ * 3 + i_1567_]);
			is_1563_[i_1564_ * 3 + i_1565_] = i_1566_ + 8192 >> 14;
		    }
		}
		int i_1568_ = ((is_1548_[0] * i_1542_ + is_1548_[1] * i_1543_
				+ is_1548_[2] * i_1544_ + 8192)
			       >> 14);
		int i_1569_ = ((is_1548_[3] * i_1542_ + is_1548_[4] * i_1543_
				+ is_1548_[5] * i_1544_ + 8192)
			       >> 14);
		int i_1570_ = ((is_1548_[6] * i_1542_ + is_1548_[7] * i_1543_
				+ is_1548_[8] * i_1544_ + 8192)
			       >> 14);
		i_1568_ += i_1560_;
		i_1569_ += i_1561_;
		i_1570_ += i_1562_;
		int[] is_1571_ = new int[9];
		for (int i_1572_ = 0; i_1572_ < 3; i_1572_++) {
		    for (int i_1573_ = 0; i_1573_ < 3; i_1573_++) {
			int i_1574_ = 0;
			for (int i_1575_ = 0; i_1575_ < 3; i_1575_++)
			    i_1574_ += (is_1523_[i_1572_ * 3 + i_1575_]
					* is_1563_[i_1573_ + i_1575_ * 3]);
			is_1571_[i_1572_ * 3 + i_1573_] = i_1574_ + 8192 >> 14;
		    }
		}
		int i_1576_ = ((is_1523_[0] * i_1568_ + is_1523_[1] * i_1569_
				+ is_1523_[2] * i_1570_ + 8192)
			       >> 14);
		int i_1577_ = ((is_1523_[3] * i_1568_ + is_1523_[4] * i_1569_
				+ is_1523_[5] * i_1570_ + 8192)
			       >> 14);
		int i_1578_ = ((is_1523_[6] * i_1568_ + is_1523_[7] * i_1569_
				+ is_1523_[8] * i_1570_ + 8192)
			       >> 14);
		i_1576_ += i_1539_;
		i_1577_ += i_1540_;
		i_1578_ += i_1541_;
		for (int i_1579_ = 0; i_1579_ < i_1524_; i_1579_++) {
		    int i_1580_ = is[i_1579_];
		    if (i_1580_ < anIntArrayArray9819.length) {
			int[] is_1581_ = anIntArrayArray9819[i_1580_];
			for (int i_1582_ = 0; i_1582_ < is_1581_.length;
			     i_1582_++) {
			    int i_1583_ = is_1581_[i_1582_];
			    if (aShortArray9812 == null
				|| (i_1522_ & aShortArray9812[i_1583_]) != 0) {
				int i_1584_
				    = ((is_1571_[0] * anIntArray9808[i_1583_]
					+ is_1571_[1] * anIntArray9809[i_1583_]
					+ is_1571_[2] * anIntArray9828[i_1583_]
					+ 8192)
				       >> 14);
				int i_1585_
				    = ((is_1571_[3] * anIntArray9808[i_1583_]
					+ is_1571_[4] * anIntArray9809[i_1583_]
					+ is_1571_[5] * anIntArray9828[i_1583_]
					+ 8192)
				       >> 14);
				int i_1586_
				    = ((is_1571_[6] * anIntArray9808[i_1583_]
					+ is_1571_[7] * anIntArray9809[i_1583_]
					+ is_1571_[8] * anIntArray9828[i_1583_]
					+ 8192)
				       >> 14);
				i_1584_ += i_1576_;
				i_1585_ += i_1577_;
				i_1586_ += i_1578_;
				anIntArray9808[i_1583_] = i_1584_;
				anIntArray9809[i_1583_] = i_1585_;
				anIntArray9828[i_1583_] = i_1586_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1587_ = 0; i_1587_ < i_1524_; i_1587_++) {
		    int i_1588_ = is[i_1587_];
		    if (i_1588_ < anIntArrayArray9819.length) {
			int[] is_1589_ = anIntArrayArray9819[i_1588_];
			for (int i_1590_ = 0; i_1590_ < is_1589_.length;
			     i_1590_++) {
			    int i_1591_ = is_1589_[i_1590_];
			    if (aShortArray9812 == null
				|| (i_1522_ & aShortArray9812[i_1591_]) != 0) {
				anIntArray9808[i_1591_] -= anInt9871;
				anIntArray9809[i_1591_] -= anInt9818;
				anIntArray9828[i_1591_] -= anInt9873;
				if (i_1521_ != 0) {
				    int i_1592_
					= Class427.anIntArray4806[i_1521_];
				    int i_1593_
					= Class427.anIntArray4805[i_1521_];
				    int i_1594_
					= ((anIntArray9809[i_1591_] * i_1592_
					    + anIntArray9808[i_1591_] * i_1593_
					    + 16383)
					   >> 14);
				    anIntArray9809[i_1591_]
					= (anIntArray9809[i_1591_] * i_1593_
					   - anIntArray9808[i_1591_] * i_1592_
					   + 16383) >> 14;
				    anIntArray9808[i_1591_] = i_1594_;
				}
				if (i_1519_ != 0) {
				    int i_1595_
					= Class427.anIntArray4806[i_1519_];
				    int i_1596_
					= Class427.anIntArray4805[i_1519_];
				    int i_1597_
					= ((anIntArray9809[i_1591_] * i_1596_
					    - anIntArray9828[i_1591_] * i_1595_
					    + 16383)
					   >> 14);
				    anIntArray9828[i_1591_]
					= (anIntArray9809[i_1591_] * i_1595_
					   + anIntArray9828[i_1591_] * i_1596_
					   + 16383) >> 14;
				    anIntArray9809[i_1591_] = i_1597_;
				}
				if (i_1520_ != 0) {
				    int i_1598_
					= Class427.anIntArray4806[i_1520_];
				    int i_1599_
					= Class427.anIntArray4805[i_1520_];
				    int i_1600_
					= ((anIntArray9828[i_1591_] * i_1598_
					    + anIntArray9808[i_1591_] * i_1599_
					    + 16383)
					   >> 14);
				    anIntArray9828[i_1591_]
					= (anIntArray9828[i_1591_] * i_1599_
					   - anIntArray9808[i_1591_] * i_1598_
					   + 16383) >> 14;
				    anIntArray9808[i_1591_] = i_1600_;
				}
				anIntArray9808[i_1591_] += anInt9871;
				anIntArray9809[i_1591_] += anInt9818;
				anIntArray9828[i_1591_] += anInt9873;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_1601_ = 0; i_1601_ < i_1524_; i_1601_++) {
			int i_1602_ = is[i_1601_];
			if (i_1602_ < anIntArrayArray9819.length) {
			    int[] is_1603_ = anIntArrayArray9819[i_1602_];
			    for (int i_1604_ = 0; i_1604_ < is_1603_.length;
				 i_1604_++) {
				int i_1605_ = is_1603_[i_1604_];
				if (aShortArray9812 == null
				    || ((i_1522_ & aShortArray9812[i_1605_])
					!= 0)) {
				    int i_1606_ = anIntArray9853[i_1605_];
				    int i_1607_ = anIntArray9853[i_1605_ + 1];
				    for (int i_1608_ = i_1606_;
					 (i_1608_ < i_1607_
					  && aShortArray9863[i_1608_] != 0);
					 i_1608_++) {
					int i_1609_ = (aShortArray9863[i_1608_]
						       & 0xffff) - 1;
					if (i_1521_ != 0) {
					    int i_1610_
						= (Class427.anIntArray4806
						   [i_1521_]);
					    int i_1611_
						= (Class427.anIntArray4805
						   [i_1521_]);
					    int i_1612_
						= (((aShortArray9864[i_1609_]
						     * i_1610_)
						    + (aShortArray9816[i_1609_]
						       * i_1611_)
						    + 16383)
						   >> 14);
					    aShortArray9864[i_1609_]
						= (short) ((((aShortArray9864
							      [i_1609_])
							     * i_1611_)
							    - ((aShortArray9816
								[i_1609_])
							       * i_1610_)
							    + 16383)
							   >> 14);
					    aShortArray9816[i_1609_]
						= (short) i_1612_;
					}
					if (i_1519_ != 0) {
					    int i_1613_
						= (Class427.anIntArray4806
						   [i_1519_]);
					    int i_1614_
						= (Class427.anIntArray4805
						   [i_1519_]);
					    int i_1615_
						= (((aShortArray9864[i_1609_]
						     * i_1614_)
						    - (aShortArray9869[i_1609_]
						       * i_1613_)
						    + 16383)
						   >> 14);
					    aShortArray9869[i_1609_]
						= (short) ((((aShortArray9864
							      [i_1609_])
							     * i_1613_)
							    + ((aShortArray9869
								[i_1609_])
							       * i_1614_)
							    + 16383)
							   >> 14);
					    aShortArray9864[i_1609_]
						= (short) i_1615_;
					}
					if (i_1520_ != 0) {
					    int i_1616_
						= (Class427.anIntArray4806
						   [i_1520_]);
					    int i_1617_
						= (Class427.anIntArray4805
						   [i_1520_]);
					    int i_1618_
						= (((aShortArray9869[i_1609_]
						     * i_1616_)
						    + (aShortArray9816[i_1609_]
						       * i_1617_)
						    + 16383)
						   >> 14);
					    aShortArray9869[i_1609_]
						= (short) ((((aShortArray9869
							      [i_1609_])
							     * i_1617_)
							    - ((aShortArray9816
								[i_1609_])
							       * i_1616_)
							    + 16383)
							   >> 14);
					    aShortArray9816[i_1609_]
						= (short) i_1618_;
					}
				    }
				}
			    }
			}
		    }
		    method15505();
		}
	    }
	} else if (i == 3) {
	    if (is_1523_ != null) {
		int i_1619_ = is_1523_[9] << 4;
		int i_1620_ = is_1523_[10] << 4;
		int i_1621_ = is_1523_[11] << 4;
		int i_1622_ = is_1523_[12] << 4;
		int i_1623_ = is_1523_[13] << 4;
		int i_1624_ = is_1523_[14] << 4;
		if (aBool9874) {
		    int i_1625_
			= ((is_1523_[0] * anInt9871 + is_1523_[3] * anInt9818
			    + is_1523_[6] * anInt9873 + 8192)
			   >> 14);
		    int i_1626_
			= ((is_1523_[1] * anInt9871 + is_1523_[4] * anInt9818
			    + is_1523_[7] * anInt9873 + 8192)
			   >> 14);
		    int i_1627_
			= ((is_1523_[2] * anInt9871 + is_1523_[5] * anInt9818
			    + is_1523_[8] * anInt9873 + 8192)
			   >> 14);
		    i_1625_ += i_1622_;
		    i_1626_ += i_1623_;
		    i_1627_ += i_1624_;
		    anInt9871 = i_1625_;
		    anInt9818 = i_1626_;
		    anInt9873 = i_1627_;
		    aBool9874 = false;
		}
		int i_1628_ = i_1519_ << 15 >> 7;
		int i_1629_ = i_1520_ << 15 >> 7;
		int i_1630_ = i_1521_ << 15 >> 7;
		int i_1631_ = i_1628_ * -anInt9871 + 8192 >> 14;
		int i_1632_ = i_1629_ * -anInt9818 + 8192 >> 14;
		int i_1633_ = i_1630_ * -anInt9873 + 8192 >> 14;
		int i_1634_ = i_1631_ + anInt9871;
		int i_1635_ = i_1632_ + anInt9818;
		int i_1636_ = i_1633_ + anInt9873;
		int[] is_1637_ = new int[9];
		is_1637_[0] = i_1628_ * is_1523_[0] + 8192 >> 14;
		is_1637_[1] = i_1628_ * is_1523_[3] + 8192 >> 14;
		is_1637_[2] = i_1628_ * is_1523_[6] + 8192 >> 14;
		is_1637_[3] = i_1629_ * is_1523_[1] + 8192 >> 14;
		is_1637_[4] = i_1629_ * is_1523_[4] + 8192 >> 14;
		is_1637_[5] = i_1629_ * is_1523_[7] + 8192 >> 14;
		is_1637_[6] = i_1630_ * is_1523_[2] + 8192 >> 14;
		is_1637_[7] = i_1630_ * is_1523_[5] + 8192 >> 14;
		is_1637_[8] = i_1630_ * is_1523_[8] + 8192 >> 14;
		int i_1638_ = i_1628_ * i_1622_ + 8192 >> 14;
		int i_1639_ = i_1629_ * i_1623_ + 8192 >> 14;
		int i_1640_ = i_1630_ * i_1624_ + 8192 >> 14;
		i_1638_ += i_1634_;
		i_1639_ += i_1635_;
		i_1640_ += i_1636_;
		int[] is_1641_ = new int[9];
		for (int i_1642_ = 0; i_1642_ < 3; i_1642_++) {
		    for (int i_1643_ = 0; i_1643_ < 3; i_1643_++) {
			int i_1644_ = 0;
			for (int i_1645_ = 0; i_1645_ < 3; i_1645_++)
			    i_1644_ += (is_1523_[i_1642_ * 3 + i_1645_]
					* is_1637_[i_1643_ + i_1645_ * 3]);
			is_1641_[i_1642_ * 3 + i_1643_] = i_1644_ + 8192 >> 14;
		    }
		}
		int i_1646_ = ((is_1523_[0] * i_1638_ + is_1523_[1] * i_1639_
				+ is_1523_[2] * i_1640_ + 8192)
			       >> 14);
		int i_1647_ = ((is_1523_[3] * i_1638_ + is_1523_[4] * i_1639_
				+ is_1523_[5] * i_1640_ + 8192)
			       >> 14);
		int i_1648_ = ((is_1523_[6] * i_1638_ + is_1523_[7] * i_1639_
				+ is_1523_[8] * i_1640_ + 8192)
			       >> 14);
		i_1646_ += i_1619_;
		i_1647_ += i_1620_;
		i_1648_ += i_1621_;
		for (int i_1649_ = 0; i_1649_ < i_1524_; i_1649_++) {
		    int i_1650_ = is[i_1649_];
		    if (i_1650_ < anIntArrayArray9819.length) {
			int[] is_1651_ = anIntArrayArray9819[i_1650_];
			for (int i_1652_ = 0; i_1652_ < is_1651_.length;
			     i_1652_++) {
			    int i_1653_ = is_1651_[i_1652_];
			    if (aShortArray9812 == null
				|| (i_1522_ & aShortArray9812[i_1653_]) != 0) {
				int i_1654_
				    = ((is_1641_[0] * anIntArray9808[i_1653_]
					+ is_1641_[1] * anIntArray9809[i_1653_]
					+ is_1641_[2] * anIntArray9828[i_1653_]
					+ 8192)
				       >> 14);
				int i_1655_
				    = ((is_1641_[3] * anIntArray9808[i_1653_]
					+ is_1641_[4] * anIntArray9809[i_1653_]
					+ is_1641_[5] * anIntArray9828[i_1653_]
					+ 8192)
				       >> 14);
				int i_1656_
				    = ((is_1641_[6] * anIntArray9808[i_1653_]
					+ is_1641_[7] * anIntArray9809[i_1653_]
					+ is_1641_[8] * anIntArray9828[i_1653_]
					+ 8192)
				       >> 14);
				i_1654_ += i_1646_;
				i_1655_ += i_1647_;
				i_1656_ += i_1648_;
				anIntArray9808[i_1653_] = i_1654_;
				anIntArray9809[i_1653_] = i_1655_;
				anIntArray9828[i_1653_] = i_1656_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1657_ = 0; i_1657_ < i_1524_; i_1657_++) {
		    int i_1658_ = is[i_1657_];
		    if (i_1658_ < anIntArrayArray9819.length) {
			int[] is_1659_ = anIntArrayArray9819[i_1658_];
			for (int i_1660_ = 0; i_1660_ < is_1659_.length;
			     i_1660_++) {
			    int i_1661_ = is_1659_[i_1660_];
			    if (aShortArray9812 == null
				|| (i_1522_ & aShortArray9812[i_1661_]) != 0) {
				anIntArray9808[i_1661_] -= anInt9871;
				anIntArray9809[i_1661_] -= anInt9818;
				anIntArray9828[i_1661_] -= anInt9873;
				anIntArray9808[i_1661_]
				    = anIntArray9808[i_1661_] * i_1519_ >> 7;
				anIntArray9809[i_1661_]
				    = anIntArray9809[i_1661_] * i_1520_ >> 7;
				anIntArray9828[i_1661_]
				    = anIntArray9828[i_1661_] * i_1521_ >> 7;
				anIntArray9808[i_1661_] += anInt9871;
				anIntArray9809[i_1661_] += anInt9818;
				anIntArray9828[i_1661_] += anInt9873;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9831 != null) {
		boolean bool_1662_ = false;
		for (int i_1663_ = 0; i_1663_ < i_1524_; i_1663_++) {
		    int i_1664_ = is[i_1663_];
		    if (i_1664_ < anIntArrayArray9831.length) {
			int[] is_1665_ = anIntArrayArray9831[i_1664_];
			for (int i_1666_ = 0; i_1666_ < is_1665_.length;
			     i_1666_++) {
			    int i_1667_ = is_1665_[i_1666_];
			    if (aShortArray9832 == null
				|| (i_1522_ & aShortArray9832[i_1667_]) != 0) {
				int i_1668_ = ((aByteArray9826[i_1667_] & 0xff)
					       + i_1519_ * 8);
				if (i_1668_ < 0)
				    i_1668_ = 0;
				else if (i_1668_ > 255)
				    i_1668_ = 255;
				aByteArray9826[i_1667_] = (byte) i_1668_;
			    }
			}
			bool_1662_ = bool_1662_ | is_1665_.length > 0;
		    }
		}
		if (bool_1662_) {
		    if (aClass368Array9861 != null) {
			for (int i_1669_ = 0; i_1669_ < anInt9860; i_1669_++) {
			    Class368 class368 = aClass368Array9861[i_1669_];
			    Class339 class339 = aClass339Array9862[i_1669_];
			    class339.anInt3539
				= (class339.anInt3539 & 0xffffff
				   | 255 - (aByteArray9826[class368.anInt3860]
					    & 0xff) << 24);
			}
		    }
		    method15504();
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9831 != null) {
		boolean bool_1670_ = false;
		for (int i_1671_ = 0; i_1671_ < i_1524_; i_1671_++) {
		    int i_1672_ = is[i_1671_];
		    if (i_1672_ < anIntArrayArray9831.length) {
			int[] is_1673_ = anIntArrayArray9831[i_1672_];
			for (int i_1674_ = 0; i_1674_ < is_1673_.length;
			     i_1674_++) {
			    int i_1675_ = is_1673_[i_1674_];
			    if (aShortArray9832 == null
				|| (i_1522_ & aShortArray9832[i_1675_]) != 0) {
				int i_1676_
				    = aShortArray9825[i_1675_] & 0xffff;
				int i_1677_ = i_1676_ >> 10 & 0x3f;
				int i_1678_ = i_1676_ >> 7 & 0x7;
				int i_1679_ = i_1676_ & 0x7f;
				i_1677_ = i_1677_ + i_1519_ & 0x3f;
				i_1678_ += i_1520_ / 4;
				if (i_1678_ < 0)
				    i_1678_ = 0;
				else if (i_1678_ > 7)
				    i_1678_ = 7;
				i_1679_ += i_1521_;
				if (i_1679_ < 0)
				    i_1679_ = 0;
				else if (i_1679_ > 127)
				    i_1679_ = 127;
				aShortArray9825[i_1675_]
				    = (short) (i_1677_ << 10 | i_1678_ << 7
					       | i_1679_);
			    }
			}
			bool_1670_ = bool_1670_ | is_1673_.length > 0;
		    }
		}
		if (bool_1670_) {
		    if (aClass368Array9861 != null) {
			for (int i_1680_ = 0; i_1680_ < anInt9860; i_1680_++) {
			    Class368 class368 = aClass368Array9861[i_1680_];
			    Class339 class339 = aClass339Array9862[i_1680_];
			    class339.anInt3539
				= (class339.anInt3539 & ~0xffffff
				   | (Class661.anIntArray8549
				      [(aShortArray9825[class368.anInt3860]
					& 0xffff)]) & 0xffffff);
			}
		    }
		    method15504();
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9856 != null) {
		for (int i_1681_ = 0; i_1681_ < i_1524_; i_1681_++) {
		    int i_1682_ = is[i_1681_];
		    if (i_1682_ < anIntArrayArray9856.length) {
			int[] is_1683_ = anIntArrayArray9856[i_1682_];
			for (int i_1684_ = 0; i_1684_ < is_1683_.length;
			     i_1684_++) {
			    Class339 class339
				= aClass339Array9862[is_1683_[i_1684_]];
			    class339.anInt3537 += i_1519_;
			    class339.anInt3534 += i_1520_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9856 != null) {
		for (int i_1685_ = 0; i_1685_ < i_1524_; i_1685_++) {
		    int i_1686_ = is[i_1685_];
		    if (i_1686_ < anIntArrayArray9856.length) {
			int[] is_1687_ = anIntArrayArray9856[i_1686_];
			for (int i_1688_ = 0; i_1688_ < is_1687_.length;
			     i_1688_++) {
			    Class339 class339
				= aClass339Array9862[is_1687_[i_1688_]];
			    class339.anInt3538
				= class339.anInt3538 * i_1519_ >> 7;
			    class339.anInt3536
				= class339.anInt3536 * i_1520_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9856 != null) {
		for (int i_1689_ = 0; i_1689_ < i_1524_; i_1689_++) {
		    int i_1690_ = is[i_1689_];
		    if (i_1690_ < anIntArrayArray9856.length) {
			int[] is_1691_ = anIntArrayArray9856[i_1690_];
			for (int i_1692_ = 0; i_1692_ < is_1691_.length;
			     i_1692_++) {
			    Class339 class339
				= aClass339Array9862[is_1691_[i_1692_]];
			    class339.anInt3535
				= class339.anInt3535 + i_1519_ & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    public Class172[] method3164() {
	return aClass172Array9858;
    }
    
    public void method3105(Class446 class446, int i, boolean bool) {
	if (aShortArray9812 != null) {
	    Class446 class446_1693_ = class446;
	    if (bool) {
		class446_1693_ = aClass185_Sub1_9817.aClass446_9166;
		class446_1693_.method7242(class446);
	    }
	    float[] fs = new float[3];
	    for (int i_1694_ = 0; i_1694_ < anInt9807; i_1694_++) {
		if ((i & aShortArray9812[i_1694_]) != 0) {
		    class446_1693_.method7255((float) anIntArray9808[i_1694_],
					      (float) anIntArray9809[i_1694_],
					      (float) anIntArray9828[i_1694_],
					      fs);
		    anIntArray9808[i_1694_] = (int) fs[0];
		    anIntArray9809[i_1694_] = (int) fs[1];
		    anIntArray9828[i_1694_] = (int) fs[2];
		}
	    }
	}
    }
    
    public void method3133(Class446 class446, int i, boolean bool) {
	if (aShortArray9812 != null) {
	    Class446 class446_1695_ = class446;
	    if (bool) {
		class446_1695_ = aClass185_Sub1_9817.aClass446_9166;
		class446_1695_.method7242(class446);
	    }
	    float[] fs = new float[3];
	    for (int i_1696_ = 0; i_1696_ < anInt9807; i_1696_++) {
		if ((i & aShortArray9812[i_1696_]) != 0) {
		    class446_1695_.method7255((float) anIntArray9808[i_1696_],
					      (float) anIntArray9809[i_1696_],
					      (float) anIntArray9828[i_1696_],
					      fs);
		    anIntArray9808[i_1696_] = (int) fs[0];
		    anIntArray9809[i_1696_] = (int) fs[1];
		    anIntArray9828[i_1696_] = (int) fs[2];
		}
	    }
	}
    }
    
    public void method3084(int i) {
	int i_1697_ = Class427.anIntArray4806[i];
	int i_1698_ = Class427.anIntArray4805[i];
	for (int i_1699_ = 0; i_1699_ < anInt9807; i_1699_++) {
	    int i_1700_ = ((anIntArray9809[i_1699_] * i_1697_
			    + anIntArray9808[i_1699_] * i_1698_)
			   >> 14);
	    anIntArray9809[i_1699_]
		= (anIntArray9809[i_1699_] * i_1698_
		   - anIntArray9808[i_1699_] * i_1697_) >> 14;
	    anIntArray9808[i_1699_] = i_1700_;
	}
	method15509();
	aBool9850 = false;
    }
    
    public void method3035(Class446 class446, Class194 class194, int i) {
	if (aClass345_9875 != null)
	    aClass345_9875.method6120();
	if (class194 != null)
	    class194.aBool2150 = false;
	if (anInt9813 != 0) {
	    Class433 class433 = aClass185_Sub1_9817.aClass433_9203;
	    Class433 class433_1701_ = aClass185_Sub1_9817.aClass433_9194;
	    Class433 class433_1702_ = aClass185_Sub1_9817.aClass433_9150;
	    class433_1701_.method6916(class446);
	    class433_1702_.method6842(class433_1701_);
	    class433_1702_.method6839(aClass185_Sub1_9817.aClass433_9284);
	    if (!aBool9850)
		method15507();
	    float[] fs = aClass185_Sub1_9817.aFloatArray9156;
	    class433_1701_.method6850(0.0F, (float) anInt9799, 0.0F, fs);
	    float f = fs[0];
	    float f_1703_ = fs[1];
	    float f_1704_ = fs[2];
	    class433_1701_.method6850(0.0F, (float) anInt9846, 0.0F, fs);
	    float f_1705_ = fs[0];
	    float f_1706_ = fs[1];
	    float f_1707_ = fs[2];
	    for (int i_1708_ = 0; i_1708_ < 6; i_1708_++) {
		float[] fs_1709_
		    = aClass185_Sub1_9817.aFloatArrayArray9165[i_1708_];
		float f_1710_ = (fs_1709_[0] * f + fs_1709_[1] * f_1703_
				 + fs_1709_[2] * f_1704_ + fs_1709_[3]
				 + (float) anInt9868);
		float f_1711_ = (fs_1709_[0] * f_1705_ + fs_1709_[1] * f_1706_
				 + fs_1709_[2] * f_1707_ + fs_1709_[3]
				 + (float) anInt9868);
		if (f_1710_ < 0.0F && f_1711_ < 0.0F)
		    return;
	    }
	    if (class194 != null) {
		boolean bool = false;
		boolean bool_1712_ = true;
		int i_1713_ = anInt9865 + anInt9848 >> 1;
		int i_1714_ = anInt9849 + anInt9866 >> 1;
		int i_1715_ = i_1713_;
		int i_1716_ = anInt9799;
		int i_1717_ = i_1714_;
		float f_1718_
		    = (class433_1702_.aFloatArray4853[0] * (float) i_1715_
		       + class433_1702_.aFloatArray4853[4] * (float) i_1716_
		       + class433_1702_.aFloatArray4853[8] * (float) i_1717_
		       + class433_1702_.aFloatArray4853[12]);
		float f_1719_
		    = (class433_1702_.aFloatArray4853[1] * (float) i_1715_
		       + class433_1702_.aFloatArray4853[5] * (float) i_1716_
		       + class433_1702_.aFloatArray4853[9] * (float) i_1717_
		       + class433_1702_.aFloatArray4853[13]);
		float f_1720_
		    = (class433_1702_.aFloatArray4853[2] * (float) i_1715_
		       + class433_1702_.aFloatArray4853[6] * (float) i_1716_
		       + class433_1702_.aFloatArray4853[10] * (float) i_1717_
		       + class433_1702_.aFloatArray4853[14]);
		float f_1721_
		    = (class433_1702_.aFloatArray4853[3] * (float) i_1715_
		       + class433_1702_.aFloatArray4853[7] * (float) i_1716_
		       + class433_1702_.aFloatArray4853[11] * (float) i_1717_
		       + class433_1702_.aFloatArray4853[15]);
		if (f_1720_ >= -f_1721_) {
		    class194.anInt2148
			= (int) (aClass185_Sub1_9817.aFloat9257
				 + (aClass185_Sub1_9817.aFloat9167 * f_1718_
				    / f_1721_));
		    class194.anInt2149
			= (int) (aClass185_Sub1_9817.aFloat9168
				 + (aClass185_Sub1_9817.aFloat9169 * f_1719_
				    / f_1721_));
		} else
		    bool = true;
		i_1715_ = i_1713_;
		i_1716_ = anInt9846;
		i_1717_ = i_1714_;
		float f_1722_
		    = (class433_1702_.aFloatArray4853[0] * (float) i_1715_
		       + class433_1702_.aFloatArray4853[4] * (float) i_1716_
		       + class433_1702_.aFloatArray4853[8] * (float) i_1717_
		       + class433_1702_.aFloatArray4853[12]);
		float f_1723_
		    = (class433_1702_.aFloatArray4853[1] * (float) i_1715_
		       + class433_1702_.aFloatArray4853[5] * (float) i_1716_
		       + class433_1702_.aFloatArray4853[9] * (float) i_1717_
		       + class433_1702_.aFloatArray4853[13]);
		float f_1724_
		    = (class433_1702_.aFloatArray4853[2] * (float) i_1715_
		       + class433_1702_.aFloatArray4853[6] * (float) i_1716_
		       + class433_1702_.aFloatArray4853[10] * (float) i_1717_
		       + class433_1702_.aFloatArray4853[14]);
		float f_1725_
		    = (class433_1702_.aFloatArray4853[3] * (float) i_1715_
		       + class433_1702_.aFloatArray4853[7] * (float) i_1716_
		       + class433_1702_.aFloatArray4853[11] * (float) i_1717_
		       + class433_1702_.aFloatArray4853[15]);
		if (f_1724_ >= -f_1725_) {
		    class194.anInt2152
			= (int) (aClass185_Sub1_9817.aFloat9257
				 + (aClass185_Sub1_9817.aFloat9167 * f_1722_
				    / f_1725_));
		    class194.anInt2151
			= (int) (aClass185_Sub1_9817.aFloat9168
				 + (aClass185_Sub1_9817.aFloat9169 * f_1723_
				    / f_1725_));
		} else
		    bool = true;
		if (bool) {
		    if (f_1720_ < -f_1721_ && f_1724_ < -f_1725_)
			bool_1712_ = false;
		    else if (f_1720_ < -f_1721_) {
			float f_1726_
			    = (f_1720_ + f_1721_) / (f_1724_ + f_1725_) - 1.0F;
			float f_1727_
			    = f_1718_ + f_1726_ * (f_1722_ - f_1718_);
			float f_1728_
			    = f_1719_ + f_1726_ * (f_1723_ - f_1719_);
			float f_1729_
			    = f_1721_ + f_1726_ * (f_1725_ - f_1721_);
			class194.anInt2148
			    = (int) (aClass185_Sub1_9817.aFloat9257
				     + (aClass185_Sub1_9817.aFloat9167
					* f_1727_ / f_1729_));
			class194.anInt2149
			    = (int) (aClass185_Sub1_9817.aFloat9168
				     + (aClass185_Sub1_9817.aFloat9169
					* f_1728_ / f_1729_));
		    } else if (f_1724_ < -f_1725_) {
			float f_1730_
			    = (f_1724_ + f_1725_) / (f_1720_ + f_1721_) - 1.0F;
			float f_1731_
			    = f_1722_ + f_1730_ * (f_1718_ - f_1722_);
			float f_1732_
			    = f_1723_ + f_1730_ * (f_1719_ - f_1723_);
			float f_1733_
			    = f_1725_ + f_1730_ * (f_1721_ - f_1725_);
			class194.anInt2152
			    = (int) (aClass185_Sub1_9817.aFloat9257
				     + (aClass185_Sub1_9817.aFloat9167
					* f_1731_ / f_1733_));
			class194.anInt2151
			    = (int) (aClass185_Sub1_9817.aFloat9168
				     + (aClass185_Sub1_9817.aFloat9169
					* f_1732_ / f_1733_));
		    }
		}
		if (bool_1712_) {
		    if (f_1720_ / f_1721_ > f_1724_ / f_1725_) {
			float f_1734_ = (f_1718_
					 + (class433.aFloatArray4853[0]
					    * (float) anInt9868)
					 + class433.aFloatArray4853[12]);
			float f_1735_ = (f_1721_
					 + (class433.aFloatArray4853[3]
					    * (float) anInt9868)
					 + class433.aFloatArray4853[15]);
			class194.anInt2147
			    = (int) (aClass185_Sub1_9817.aFloat9257
				     - (float) class194.anInt2148
				     + (aClass185_Sub1_9817.aFloat9167
					* f_1734_ / f_1735_));
		    } else {
			float f_1736_ = (f_1722_
					 + (class433.aFloatArray4853[0]
					    * (float) anInt9868)
					 + class433.aFloatArray4853[12]);
			float f_1737_ = (f_1725_
					 + (class433.aFloatArray4853[3]
					    * (float) anInt9868)
					 + class433.aFloatArray4853[15]);
			class194.anInt2147
			    = (int) (aClass185_Sub1_9817.aFloat9257
				     - (float) class194.anInt2152
				     + (aClass185_Sub1_9817.aFloat9167
					* f_1736_ / f_1737_));
		    }
		    class194.aBool2150 = true;
		}
	    }
	    aClass185_Sub1_9817.method14642(i);
	    method15516(class446);
	    aClass185_Sub1_9817.method14642(0);
	    class433_1701_.method6916(class446);
	    class433_1701_.method6839(aClass185_Sub1_9817.aClass433_9142);
	    method15526(class433_1701_);
	}
    }
    
    public boolean method3108(int i, int i_1738_, Class446 class446,
			      boolean bool, int i_1739_) {
	return method15511(i, i_1738_, 0, 0, class446, bool, i_1739_);
    }
    
    public boolean method3167(int i, int i_1740_, Class446 class446,
			      boolean bool, int i_1741_) {
	return method15511(i, i_1740_, 0, 0, class446, bool, i_1741_);
    }
    
    public boolean method3110(int i, int i_1742_, Class446 class446,
			      boolean bool, int i_1743_) {
	return method15511(i, i_1742_, 0, 0, class446, bool, i_1743_);
    }
    
    public boolean method3111(int i, int i_1744_, Class446 class446,
			      boolean bool, int i_1745_) {
	return method15511(i, i_1744_, 0, 0, class446, bool, i_1745_);
    }
    
    public boolean method3183(int i, int i_1746_, Class446 class446,
			      boolean bool, int i_1747_) {
	return method15511(i, i_1746_, 0, 0, class446, bool, i_1747_);
    }
    
    int method15523(int i, int i_1748_) {
	i_1748_ = i_1748_ * (i & 0x7f) >> 7;
	if (i_1748_ < 2)
	    i_1748_ = 2;
	else if (i_1748_ > 126)
	    i_1748_ = 126;
	return (i & 0xff80) + i_1748_;
    }
    
    public void method3215(Class446 class446) {
	Class433 class433 = aClass185_Sub1_9817.aClass433_9194;
	class433.method6916(class446);
	if (aClass172Array9858 != null) {
	    for (int i = 0; i < aClass172Array9858.length; i++) {
		Class172 class172 = aClass172Array9858[i];
		Class172 class172_1749_ = class172;
		if (class172.aClass172_1809 != null)
		    class172_1749_ = class172.aClass172_1809;
		class172_1749_.anInt1815
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9808[(class172.anInt1814
							    * 1404619919)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9809
					       [(class172.anInt1814
						 * 1404619919)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9828
					       [(class172.anInt1814
						 * 1404619919)]))))
		       * -697779603);
		class172_1749_.anInt1823
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9808
					    [class172.anInt1814 * 1404619919]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9809[(class172.anInt1814
							     * 1404619919)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9828
					      [(class172.anInt1814
						* 1404619919)])))) * 880720549;
		class172_1749_.anInt1817
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9808[(class172.anInt1814
							    * 1404619919)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9809
					       [(class172.anInt1814
						 * 1404619919)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9828
					       [(class172.anInt1814
						 * 1404619919)]))))
		       * -487629419);
		class172_1749_.anInt1818
		    = (int) (class433.aFloatArray4853[12]
			     + ((class433.aFloatArray4853[0]
				 * (float) (anIntArray9808
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[4]
				   * (float) anIntArray9809[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[8]
				   * (float) (anIntArray9828
					      [(class172.anInt1812
						* 496404005)])))) * 1861716229;
		class172_1749_.anInt1808
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9808
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9809[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9828
					      [(class172.anInt1812
						* 496404005)])))) * 968631629;
		class172_1749_.anInt1819
		    = (int) (class433.aFloatArray4853[14]
			     + ((class433.aFloatArray4853[2]
				 * (float) (anIntArray9808
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[6]
				   * (float) anIntArray9809[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[10]
				   * (float) (anIntArray9828
					      [(class172.anInt1812
						* 496404005)])))) * -337212495;
		class172_1749_.anInt1821
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9808[(class172.anInt1813
							    * 1123614299)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9809
					       [(class172.anInt1813
						 * 1123614299)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9828
					       [(class172.anInt1813
						 * 1123614299)]))))
		       * -289878931);
		class172_1749_.anInt1822
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9808
					    [class172.anInt1813 * 1123614299]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9809[(class172.anInt1813
							     * 1123614299)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9828
					      [(class172.anInt1813
						* 1123614299)])))) * 286740539;
		class172_1749_.anInt1820
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9808[(class172.anInt1813
							    * 1123614299)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9809
					       [(class172.anInt1813
						 * 1123614299)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9828
					       [(class172.anInt1813
						 * 1123614299)]))))
		       * -2010684097);
	    }
	}
	if (aClass158Array9859 != null) {
	    for (int i = 0; i < aClass158Array9859.length; i++) {
		Class158 class158 = aClass158Array9859[i];
		Class158 class158_1750_ = class158;
		if (class158.aClass158_1748 != null)
		    class158_1750_ = class158.aClass158_1748;
		if (class158.aClass433_1747 != null)
		    class158.aClass433_1747.method6842(class433);
		else
		    class158.aClass433_1747 = new Class433(class433);
		class158_1750_.anInt1750
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9808[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9809
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9828
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * 1976103833);
		class158_1750_.anInt1751
		    = ((int) (class433.aFloatArray4853[13]
			      + ((class433.aFloatArray4853[1]
				  * (float) anIntArray9808[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[5]
				    * (float) (anIntArray9809
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[9]
				    * (float) (anIntArray9828
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * 1216251817);
		class158_1750_.anInt1749
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9808[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9809
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9828
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * -1645064349);
	    }
	}
    }
    
    public Class534_Sub18_Sub16 method3097
	(Class534_Sub18_Sub16 class534_sub18_sub16) {
	if (anInt9813 == 0)
	    return null;
	if (!aBool9850)
	    method15507();
	int i;
	int i_1751_;
	if (aClass185_Sub1_9817.anInt9213 > 0) {
	    i = (anInt9865 - (anInt9846 * aClass185_Sub1_9817.anInt9213 >> 8)
		 >> aClass185_Sub1_9817.anInt9212);
	    i_1751_ = anInt9848 - (anInt9799 * aClass185_Sub1_9817.anInt9213
				   >> 8) >> aClass185_Sub1_9817.anInt9212;
	} else {
	    i = (anInt9865 - (anInt9799 * aClass185_Sub1_9817.anInt9213 >> 8)
		 >> aClass185_Sub1_9817.anInt9212);
	    i_1751_ = anInt9848 - (anInt9846 * aClass185_Sub1_9817.anInt9213
				   >> 8) >> aClass185_Sub1_9817.anInt9212;
	}
	int i_1752_;
	int i_1753_;
	if (aClass185_Sub1_9817.anInt9287 > 0) {
	    i_1752_ = anInt9849 - (anInt9846 * aClass185_Sub1_9817.anInt9287
				   >> 8) >> aClass185_Sub1_9817.anInt9212;
	    i_1753_ = anInt9866 - (anInt9799 * aClass185_Sub1_9817.anInt9287
				   >> 8) >> aClass185_Sub1_9817.anInt9212;
	} else {
	    i_1752_ = anInt9849 - (anInt9799 * aClass185_Sub1_9817.anInt9287
				   >> 8) >> aClass185_Sub1_9817.anInt9212;
	    i_1753_ = anInt9866 - (anInt9846 * aClass185_Sub1_9817.anInt9287
				   >> 8) >> aClass185_Sub1_9817.anInt9212;
	}
	int i_1754_ = i_1751_ - i + 1;
	int i_1755_ = i_1753_ - i_1752_ + 1;
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2
	    = (Class534_Sub18_Sub16_Sub2) class534_sub18_sub16;
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2_1756_;
	if (class534_sub18_sub16_sub2 != null
	    && class534_sub18_sub16_sub2.method18753(i_1754_, i_1755_)) {
	    class534_sub18_sub16_sub2_1756_ = class534_sub18_sub16_sub2;
	    class534_sub18_sub16_sub2_1756_.method18752();
	} else
	    class534_sub18_sub16_sub2_1756_
		= new Class534_Sub18_Sub16_Sub2(aClass185_Sub1_9817, i_1754_,
						i_1755_);
	class534_sub18_sub16_sub2_1756_.method18756(i, i_1752_, i_1751_,
						    i_1753_);
	method15508(class534_sub18_sub16_sub2_1756_);
	return class534_sub18_sub16_sub2_1756_;
    }
    
    public Class534_Sub18_Sub16 method3116
	(Class534_Sub18_Sub16 class534_sub18_sub16) {
	if (anInt9813 == 0)
	    return null;
	if (!aBool9850)
	    method15507();
	int i;
	int i_1757_;
	if (aClass185_Sub1_9817.anInt9213 > 0) {
	    i = (anInt9865 - (anInt9846 * aClass185_Sub1_9817.anInt9213 >> 8)
		 >> aClass185_Sub1_9817.anInt9212);
	    i_1757_ = anInt9848 - (anInt9799 * aClass185_Sub1_9817.anInt9213
				   >> 8) >> aClass185_Sub1_9817.anInt9212;
	} else {
	    i = (anInt9865 - (anInt9799 * aClass185_Sub1_9817.anInt9213 >> 8)
		 >> aClass185_Sub1_9817.anInt9212);
	    i_1757_ = anInt9848 - (anInt9846 * aClass185_Sub1_9817.anInt9213
				   >> 8) >> aClass185_Sub1_9817.anInt9212;
	}
	int i_1758_;
	int i_1759_;
	if (aClass185_Sub1_9817.anInt9287 > 0) {
	    i_1758_ = anInt9849 - (anInt9846 * aClass185_Sub1_9817.anInt9287
				   >> 8) >> aClass185_Sub1_9817.anInt9212;
	    i_1759_ = anInt9866 - (anInt9799 * aClass185_Sub1_9817.anInt9287
				   >> 8) >> aClass185_Sub1_9817.anInt9212;
	} else {
	    i_1758_ = anInt9849 - (anInt9799 * aClass185_Sub1_9817.anInt9287
				   >> 8) >> aClass185_Sub1_9817.anInt9212;
	    i_1759_ = anInt9866 - (anInt9846 * aClass185_Sub1_9817.anInt9287
				   >> 8) >> aClass185_Sub1_9817.anInt9212;
	}
	int i_1760_ = i_1757_ - i + 1;
	int i_1761_ = i_1759_ - i_1758_ + 1;
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2
	    = (Class534_Sub18_Sub16_Sub2) class534_sub18_sub16;
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2_1762_;
	if (class534_sub18_sub16_sub2 != null
	    && class534_sub18_sub16_sub2.method18753(i_1760_, i_1761_)) {
	    class534_sub18_sub16_sub2_1762_ = class534_sub18_sub16_sub2;
	    class534_sub18_sub16_sub2_1762_.method18752();
	} else
	    class534_sub18_sub16_sub2_1762_
		= new Class534_Sub18_Sub16_Sub2(aClass185_Sub1_9817, i_1760_,
						i_1761_);
	class534_sub18_sub16_sub2_1762_.method18756(i, i_1758_, i_1757_,
						    i_1759_);
	method15508(class534_sub18_sub16_sub2_1762_);
	return class534_sub18_sub16_sub2_1762_;
    }
    
    public void method3113(Class446 class446) {
	Class433 class433 = aClass185_Sub1_9817.aClass433_9194;
	class433.method6916(class446);
	if (aClass172Array9858 != null) {
	    for (int i = 0; i < aClass172Array9858.length; i++) {
		Class172 class172 = aClass172Array9858[i];
		Class172 class172_1763_ = class172;
		if (class172.aClass172_1809 != null)
		    class172_1763_ = class172.aClass172_1809;
		class172_1763_.anInt1815
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9808[(class172.anInt1814
							    * 1404619919)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9809
					       [(class172.anInt1814
						 * 1404619919)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9828
					       [(class172.anInt1814
						 * 1404619919)]))))
		       * -697779603);
		class172_1763_.anInt1823
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9808
					    [class172.anInt1814 * 1404619919]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9809[(class172.anInt1814
							     * 1404619919)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9828
					      [(class172.anInt1814
						* 1404619919)])))) * 880720549;
		class172_1763_.anInt1817
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9808[(class172.anInt1814
							    * 1404619919)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9809
					       [(class172.anInt1814
						 * 1404619919)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9828
					       [(class172.anInt1814
						 * 1404619919)]))))
		       * -487629419);
		class172_1763_.anInt1818
		    = (int) (class433.aFloatArray4853[12]
			     + ((class433.aFloatArray4853[0]
				 * (float) (anIntArray9808
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[4]
				   * (float) anIntArray9809[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[8]
				   * (float) (anIntArray9828
					      [(class172.anInt1812
						* 496404005)])))) * 1861716229;
		class172_1763_.anInt1808
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9808
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9809[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9828
					      [(class172.anInt1812
						* 496404005)])))) * 968631629;
		class172_1763_.anInt1819
		    = (int) (class433.aFloatArray4853[14]
			     + ((class433.aFloatArray4853[2]
				 * (float) (anIntArray9808
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[6]
				   * (float) anIntArray9809[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[10]
				   * (float) (anIntArray9828
					      [(class172.anInt1812
						* 496404005)])))) * -337212495;
		class172_1763_.anInt1821
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9808[(class172.anInt1813
							    * 1123614299)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9809
					       [(class172.anInt1813
						 * 1123614299)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9828
					       [(class172.anInt1813
						 * 1123614299)]))))
		       * -289878931);
		class172_1763_.anInt1822
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9808
					    [class172.anInt1813 * 1123614299]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9809[(class172.anInt1813
							     * 1123614299)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9828
					      [(class172.anInt1813
						* 1123614299)])))) * 286740539;
		class172_1763_.anInt1820
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9808[(class172.anInt1813
							    * 1123614299)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9809
					       [(class172.anInt1813
						 * 1123614299)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9828
					       [(class172.anInt1813
						 * 1123614299)]))))
		       * -2010684097);
	    }
	}
	if (aClass158Array9859 != null) {
	    for (int i = 0; i < aClass158Array9859.length; i++) {
		Class158 class158 = aClass158Array9859[i];
		Class158 class158_1764_ = class158;
		if (class158.aClass158_1748 != null)
		    class158_1764_ = class158.aClass158_1748;
		if (class158.aClass433_1747 != null)
		    class158.aClass433_1747.method6842(class433);
		else
		    class158.aClass433_1747 = new Class433(class433);
		class158_1764_.anInt1750
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9808[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9809
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9828
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * 1976103833);
		class158_1764_.anInt1751
		    = ((int) (class433.aFloatArray4853[13]
			      + ((class433.aFloatArray4853[1]
				  * (float) anIntArray9808[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[5]
				    * (float) (anIntArray9809
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[9]
				    * (float) (anIntArray9828
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * 1216251817);
		class158_1764_.anInt1749
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9808[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9809
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9828
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * -1645064349);
	    }
	}
    }
    
    public int method3128() {
	if (!aBool9850)
	    method15507();
	return anInt9848;
    }
    
    public void method3067(Class183 class183, int i, int i_1765_, int i_1766_,
			   boolean bool) {
	Class183_Sub3 class183_sub3_1767_ = (Class183_Sub3) class183;
	if (anInt9823 != 0 && class183_sub3_1767_.anInt9823 != 0) {
	    int i_1768_ = class183_sub3_1767_.anInt9807;
	    int[] is = class183_sub3_1767_.anIntArray9808;
	    int[] is_1769_ = class183_sub3_1767_.anIntArray9809;
	    int[] is_1770_ = class183_sub3_1767_.anIntArray9828;
	    short[] is_1771_ = class183_sub3_1767_.aShortArray9816;
	    short[] is_1772_ = class183_sub3_1767_.aShortArray9864;
	    short[] is_1773_ = class183_sub3_1767_.aShortArray9869;
	    byte[] is_1774_ = class183_sub3_1767_.aByteArray9814;
	    short[] is_1775_;
	    short[] is_1776_;
	    short[] is_1777_;
	    byte[] is_1778_;
	    if (aClass363_9822 != null) {
		is_1775_ = aClass363_9822.aShortArray3722;
		is_1776_ = aClass363_9822.aShortArray3720;
		is_1777_ = aClass363_9822.aShortArray3723;
		is_1778_ = aClass363_9822.aByteArray3721;
	    } else {
		is_1775_ = null;
		is_1776_ = null;
		is_1777_ = null;
		is_1778_ = null;
	    }
	    short[] is_1779_;
	    short[] is_1780_;
	    short[] is_1781_;
	    byte[] is_1782_;
	    if (class183_sub3_1767_.aClass363_9822 != null) {
		is_1779_ = class183_sub3_1767_.aClass363_9822.aShortArray3722;
		is_1780_ = class183_sub3_1767_.aClass363_9822.aShortArray3720;
		is_1781_ = class183_sub3_1767_.aClass363_9822.aShortArray3723;
		is_1782_ = class183_sub3_1767_.aClass363_9822.aByteArray3721;
	    } else {
		is_1779_ = null;
		is_1780_ = null;
		is_1781_ = null;
		is_1782_ = null;
	    }
	    int[] is_1783_ = class183_sub3_1767_.anIntArray9853;
	    short[] is_1784_ = class183_sub3_1767_.aShortArray9863;
	    if (!class183_sub3_1767_.aBool9850)
		class183_sub3_1767_.method15507();
	    int i_1785_ = class183_sub3_1767_.anInt9799;
	    int i_1786_ = class183_sub3_1767_.anInt9846;
	    int i_1787_ = class183_sub3_1767_.anInt9865;
	    int i_1788_ = class183_sub3_1767_.anInt9848;
	    int i_1789_ = class183_sub3_1767_.anInt9849;
	    int i_1790_ = class183_sub3_1767_.anInt9866;
	    for (int i_1791_ = 0; i_1791_ < anInt9807; i_1791_++) {
		int i_1792_ = anIntArray9809[i_1791_] - i_1765_;
		if (i_1792_ >= i_1785_ && i_1792_ <= i_1786_) {
		    int i_1793_ = anIntArray9808[i_1791_] - i;
		    if (i_1793_ >= i_1787_ && i_1793_ <= i_1788_) {
			int i_1794_ = anIntArray9828[i_1791_] - i_1766_;
			if (i_1794_ >= i_1789_ && i_1794_ <= i_1790_) {
			    int i_1795_ = -1;
			    int i_1796_ = anIntArray9853[i_1791_];
			    int i_1797_ = anIntArray9853[i_1791_ + 1];
			    for (int i_1798_ = i_1796_;
				 (i_1798_ < i_1797_
				  && aShortArray9863[i_1798_] != 0);
				 i_1798_++) {
				i_1795_
				    = (aShortArray9863[i_1798_] & 0xffff) - 1;
				if (aByteArray9814[i_1795_] != 0)
				    break;
			    }
			    if (i_1795_ != -1) {
				for (int i_1799_ = 0; i_1799_ < i_1768_;
				     i_1799_++) {
				    if (i_1793_ == is[i_1799_]
					&& i_1794_ == is_1770_[i_1799_]
					&& i_1792_ == is_1769_[i_1799_]) {
					int i_1800_ = -1;
					i_1796_ = is_1783_[i_1799_];
					i_1797_ = is_1783_[i_1799_ + 1];
					for (int i_1801_ = i_1796_;
					     (i_1801_ < i_1797_
					      && is_1784_[i_1801_] != 0);
					     i_1801_++) {
					    i_1800_ = (is_1784_[i_1801_] - 1
						       & 0xffff);
					    if (is_1774_[i_1800_] != 0)
						break;
					}
					if (i_1800_ != -1) {
					    if (is_1775_ == null) {
						aClass363_9822
						    = new Class363();
						is_1775_
						    = aClass363_9822
							  .aShortArray3722
						    = (Class534_Sub42
							   .method16820
						       (aShortArray9816,
							(byte) 2));
						is_1776_
						    = aClass363_9822
							  .aShortArray3720
						    = (Class534_Sub42
							   .method16820
						       (aShortArray9864,
							(byte) 2));
						is_1777_
						    = aClass363_9822
							  .aShortArray3723
						    = (Class534_Sub42
							   .method16820
						       (aShortArray9869,
							(byte) 2));
						is_1778_
						    = aClass363_9822
							  .aByteArray3721
						    = (Class586.method9861
						       (aByteArray9814,
							-16711936));
					    }
					    if (is_1779_ == null) {
						Class363 class363
						    = (class183_sub3_1767_
							   .aClass363_9822
						       = new Class363());
						is_1779_
						    = class363.aShortArray3722
						    = (Class534_Sub42
							   .method16820
						       (is_1771_, (byte) 2));
						is_1780_
						    = class363.aShortArray3720
						    = (Class534_Sub42
							   .method16820
						       (is_1772_, (byte) 2));
						is_1781_
						    = class363.aShortArray3723
						    = (Class534_Sub42
							   .method16820
						       (is_1773_, (byte) 2));
						is_1782_
						    = class363.aByteArray3721
						    = (Class586.method9861
						       (is_1774_, -16711936));
					    }
					    short i_1802_
						= aShortArray9816[i_1795_];
					    short i_1803_
						= aShortArray9864[i_1795_];
					    short i_1804_
						= aShortArray9869[i_1795_];
					    byte i_1805_
						= aByteArray9814[i_1795_];
					    i_1796_ = is_1783_[i_1799_];
					    i_1797_ = is_1783_[i_1799_ + 1];
					    for (int i_1806_ = i_1796_;
						 i_1806_ < i_1797_;
						 i_1806_++) {
						int i_1807_
						    = is_1784_[i_1806_] - 1;
						if (i_1807_ == -1)
						    break;
						if (is_1782_[i_1807_] != 0) {
						    is_1779_[i_1807_]
							+= i_1802_;
						    is_1780_[i_1807_]
							+= i_1803_;
						    is_1781_[i_1807_]
							+= i_1804_;
						    is_1782_[i_1807_]
							+= i_1805_;
						}
					    }
					    i_1802_ = is_1771_[i_1800_];
					    i_1803_ = is_1772_[i_1800_];
					    i_1804_ = is_1773_[i_1800_];
					    i_1805_ = is_1774_[i_1800_];
					    i_1796_ = anIntArray9853[i_1791_];
					    i_1797_
						= anIntArray9853[i_1791_ + 1];
					    for (int i_1808_ = i_1796_;
						 (i_1808_ < i_1797_
						  && (aShortArray9863[i_1808_]
						      != 0));
						 i_1808_++) {
						int i_1809_
						    = (aShortArray9863[i_1808_]
						       & 0xffff) - 1;
						if (is_1778_[i_1809_] != 0) {
						    is_1775_[i_1809_]
							+= i_1802_;
						    is_1776_[i_1809_]
							+= i_1803_;
						    is_1777_[i_1809_]
							+= i_1804_;
						    is_1778_[i_1809_]
							+= i_1805_;
						}
					    }
					    class183_sub3_1767_.method15505();
					    method15505();
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public int method3085() {
	if (!aBool9850)
	    method15507();
	return anInt9868;
    }
    
    public int method3078() {
	if (!aBool9850)
	    method15507();
	return anInt9868;
    }
    
    public boolean method3059() {
	if (aShortArray9830 == null)
	    return true;
	for (int i = 0; i < aShortArray9830.length; i++) {
	    if (aShortArray9830[i] != -1
		&& !(aClass185_Sub1_9817.aClass354_9211.method6265
		     (aClass185_Sub1_9817.aClass177_2012
			  .method2931(aShortArray9830[i], (byte) 1),
		      -1)))
		return false;
	}
	return true;
    }
    
    public int method3123() {
	if (!aBool9850)
	    method15507();
	return anInt9868;
    }
    
    public int method3124() {
	if (!aBool9850)
	    method15507();
	return anInt9868;
    }
    
    public int method3125() {
	if (!aBool9850)
	    method15507();
	return anInt9868;
    }
    
    public int method3126() {
	if (!aBool9850)
	    method15507();
	return anInt9868;
    }
    
    public int method3004() {
	if (!aBool9850)
	    method15507();
	return anInt9842;
    }
    
    public int method3048() {
	if (!aBool9850)
	    method15507();
	return anInt9842;
    }
    
    public Class534_Sub18_Sub16 method3175
	(Class534_Sub18_Sub16 class534_sub18_sub16) {
	if (anInt9813 == 0)
	    return null;
	if (!aBool9850)
	    method15507();
	int i;
	int i_1810_;
	if (aClass185_Sub1_9817.anInt9213 > 0) {
	    i = (anInt9865 - (anInt9846 * aClass185_Sub1_9817.anInt9213 >> 8)
		 >> aClass185_Sub1_9817.anInt9212);
	    i_1810_ = anInt9848 - (anInt9799 * aClass185_Sub1_9817.anInt9213
				   >> 8) >> aClass185_Sub1_9817.anInt9212;
	} else {
	    i = (anInt9865 - (anInt9799 * aClass185_Sub1_9817.anInt9213 >> 8)
		 >> aClass185_Sub1_9817.anInt9212);
	    i_1810_ = anInt9848 - (anInt9846 * aClass185_Sub1_9817.anInt9213
				   >> 8) >> aClass185_Sub1_9817.anInt9212;
	}
	int i_1811_;
	int i_1812_;
	if (aClass185_Sub1_9817.anInt9287 > 0) {
	    i_1811_ = anInt9849 - (anInt9846 * aClass185_Sub1_9817.anInt9287
				   >> 8) >> aClass185_Sub1_9817.anInt9212;
	    i_1812_ = anInt9866 - (anInt9799 * aClass185_Sub1_9817.anInt9287
				   >> 8) >> aClass185_Sub1_9817.anInt9212;
	} else {
	    i_1811_ = anInt9849 - (anInt9799 * aClass185_Sub1_9817.anInt9287
				   >> 8) >> aClass185_Sub1_9817.anInt9212;
	    i_1812_ = anInt9866 - (anInt9846 * aClass185_Sub1_9817.anInt9287
				   >> 8) >> aClass185_Sub1_9817.anInt9212;
	}
	int i_1813_ = i_1810_ - i + 1;
	int i_1814_ = i_1812_ - i_1811_ + 1;
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2
	    = (Class534_Sub18_Sub16_Sub2) class534_sub18_sub16;
	Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2_1815_;
	if (class534_sub18_sub16_sub2 != null
	    && class534_sub18_sub16_sub2.method18753(i_1813_, i_1814_)) {
	    class534_sub18_sub16_sub2_1815_ = class534_sub18_sub16_sub2;
	    class534_sub18_sub16_sub2_1815_.method18752();
	} else
	    class534_sub18_sub16_sub2_1815_
		= new Class534_Sub18_Sub16_Sub2(aClass185_Sub1_9817, i_1813_,
						i_1814_);
	class534_sub18_sub16_sub2_1815_.method18756(i, i_1811_, i_1810_,
						    i_1812_);
	method15508(class534_sub18_sub16_sub2_1815_);
	return class534_sub18_sub16_sub2_1815_;
    }
    
    void method15524(Class534_Sub18_Sub16_Sub2 class534_sub18_sub16_sub2) {
	if (anIntArray9820.length < anInt9813) {
	    anIntArray9820 = new int[anInt9813];
	    anIntArray9867 = new int[anInt9813];
	}
	for (int i = 0; i < anInt9807; i++) {
	    int i_1816_
		= (((anIntArray9808[i]
		     - (anIntArray9809[i] * aClass185_Sub1_9817.anInt9213
			>> 8))
		    >> aClass185_Sub1_9817.anInt9212)
		   - class534_sub18_sub16_sub2.anInt12123);
	    int i_1817_
		= (((anIntArray9828[i]
		     - (anIntArray9809[i] * aClass185_Sub1_9817.anInt9287
			>> 8))
		    >> aClass185_Sub1_9817.anInt9212)
		   - class534_sub18_sub16_sub2.anInt12121);
	    int i_1818_ = anIntArray9853[i];
	    int i_1819_ = anIntArray9853[i + 1];
	    for (int i_1820_ = i_1818_;
		 i_1820_ < i_1819_ && aShortArray9863[i_1820_] != 0;
		 i_1820_++) {
		int i_1821_ = (aShortArray9863[i_1820_] & 0xffff) - 1;
		anIntArray9820[i_1821_] = i_1816_;
		anIntArray9867[i_1821_] = i_1817_;
	    }
	}
	for (int i = 0; i < anInt9824; i++) {
	    if (aByteArray9826 == null || aByteArray9826[i] <= 128) {
		int i_1822_ = aShortArray9847[i] & 0xffff;
		int i_1823_ = aShortArray9845[i] & 0xffff;
		int i_1824_ = aShortArray9843[i] & 0xffff;
		int i_1825_ = anIntArray9820[i_1822_];
		int i_1826_ = anIntArray9820[i_1823_];
		int i_1827_ = anIntArray9820[i_1824_];
		int i_1828_ = anIntArray9867[i_1822_];
		int i_1829_ = anIntArray9867[i_1823_];
		int i_1830_ = anIntArray9867[i_1824_];
		if (((i_1825_ - i_1826_) * (i_1829_ - i_1830_)
		     - (i_1829_ - i_1828_) * (i_1827_ - i_1826_))
		    > 0)
		    class534_sub18_sub16_sub2.method18755(i_1828_, i_1829_,
							  i_1830_, i_1825_,
							  i_1826_, i_1827_);
	    }
	}
    }
    
    public int method3131() {
	if (!aBool9850)
	    method15507();
	return anInt9848;
    }
    
    void method15525() {
	if (aClass335_9833 != null)
	    aClass335_9833.aBool3516 = false;
    }
    
    public void method3017(int i) {
	int i_1831_ = Class427.anIntArray4806[i];
	int i_1832_ = Class427.anIntArray4805[i];
	for (int i_1833_ = 0; i_1833_ < anInt9807; i_1833_++) {
	    int i_1834_ = ((anIntArray9809[i_1833_] * i_1832_
			    - anIntArray9828[i_1833_] * i_1831_)
			   >> 14);
	    anIntArray9828[i_1833_]
		= (anIntArray9809[i_1833_] * i_1831_
		   + anIntArray9828[i_1833_] * i_1832_) >> 14;
	    anIntArray9809[i_1833_] = i_1834_;
	}
	method15509();
	aBool9850 = false;
    }
    
    public int method3156() {
	if (!aBool9850)
	    method15507();
	return anInt9799;
    }
    
    public int method3064() {
	if (!aBool9850)
	    method15507();
	return anInt9799;
    }
    
    public int method3136() {
	if (!aBool9850)
	    method15507();
	return anInt9846;
    }
    
    public int method3142() {
	if (!aBool9850)
	    method15507();
	return anInt9846;
    }
    
    public void method3080(int i) {
	int i_1835_ = Class427.anIntArray4806[i];
	int i_1836_ = Class427.anIntArray4805[i];
	for (int i_1837_ = 0; i_1837_ < anInt9807; i_1837_++) {
	    int i_1838_ = ((anIntArray9828[i_1837_] * i_1835_
			    + anIntArray9808[i_1837_] * i_1836_)
			   >> 14);
	    anIntArray9828[i_1837_]
		= (anIntArray9828[i_1837_] * i_1836_
		   - anIntArray9808[i_1837_] * i_1835_) >> 14;
	    anIntArray9808[i_1837_] = i_1838_;
	}
	for (int i_1839_ = 0; i_1839_ < anInt9813; i_1839_++) {
	    int i_1840_ = ((aShortArray9869[i_1839_] * i_1835_
			    + aShortArray9816[i_1839_] * i_1836_)
			   >> 14);
	    aShortArray9869[i_1839_]
		= (short) ((aShortArray9869[i_1839_] * i_1836_
			    - aShortArray9816[i_1839_] * i_1835_)
			   >> 14);
	    aShortArray9816[i_1839_] = (short) i_1840_;
	}
	method15509();
	method15505();
	aBool9850 = false;
    }
    
    public int method3139() {
	if (!aBool9850)
	    method15507();
	return anInt9846;
    }
    
    public void method3037(Class446 class446, int i, boolean bool) {
	if (aShortArray9812 != null) {
	    Class446 class446_1841_ = class446;
	    if (bool) {
		class446_1841_ = aClass185_Sub1_9817.aClass446_9166;
		class446_1841_.method7242(class446);
	    }
	    float[] fs = new float[3];
	    for (int i_1842_ = 0; i_1842_ < anInt9807; i_1842_++) {
		if ((i & aShortArray9812[i_1842_]) != 0) {
		    class446_1841_.method7255((float) anIntArray9808[i_1842_],
					      (float) anIntArray9809[i_1842_],
					      (float) anIntArray9828[i_1842_],
					      fs);
		    anIntArray9808[i_1842_] = (int) fs[0];
		    anIntArray9809[i_1842_] = (int) fs[1];
		    anIntArray9828[i_1842_] = (int) fs[2];
		}
	    }
	}
    }
    
    public int method3210() {
	if (!aBool9850)
	    method15507();
	return anInt9849;
    }
    
    public int method3140() {
	if (!aBool9850)
	    method15507();
	return anInt9849;
    }
    
    public int method3143() {
	if (!aBool9851)
	    method3050();
	return anInt9844;
    }
    
    void method3068(int i, int[] is, int i_1843_, int i_1844_, int i_1845_,
		    boolean bool, int i_1846_, int[] is_1847_) {
	int i_1848_ = is.length;
	if (i == 0) {
	    i_1843_ <<= 4;
	    i_1844_ <<= 4;
	    i_1845_ <<= 4;
	    int i_1849_ = 0;
	    anInt9871 = 0;
	    anInt9818 = 0;
	    anInt9873 = 0;
	    for (int i_1850_ = 0; i_1850_ < i_1848_; i_1850_++) {
		int i_1851_ = is[i_1850_];
		if (i_1851_ < anIntArrayArray9819.length) {
		    int[] is_1852_ = anIntArrayArray9819[i_1851_];
		    for (int i_1853_ = 0; i_1853_ < is_1852_.length;
			 i_1853_++) {
			int i_1854_ = is_1852_[i_1853_];
			if (aShortArray9812 == null
			    || (i_1846_ & aShortArray9812[i_1854_]) != 0) {
			    anInt9871 += anIntArray9808[i_1854_];
			    anInt9818 += anIntArray9809[i_1854_];
			    anInt9873 += anIntArray9828[i_1854_];
			    i_1849_++;
			}
		    }
		}
	    }
	    if (i_1849_ > 0) {
		anInt9871 = anInt9871 / i_1849_ + i_1843_;
		anInt9818 = anInt9818 / i_1849_ + i_1844_;
		anInt9873 = anInt9873 / i_1849_ + i_1845_;
		aBool9874 = true;
	    } else {
		anInt9871 = i_1843_;
		anInt9818 = i_1844_;
		anInt9873 = i_1845_;
	    }
	} else if (i == 1) {
	    if (is_1847_ != null) {
		int i_1855_ = ((is_1847_[0] * i_1843_ + is_1847_[1] * i_1844_
				+ is_1847_[2] * i_1845_ + 8192)
			       >> 14);
		int i_1856_ = ((is_1847_[3] * i_1843_ + is_1847_[4] * i_1844_
				+ is_1847_[5] * i_1845_ + 8192)
			       >> 14);
		int i_1857_ = ((is_1847_[6] * i_1843_ + is_1847_[7] * i_1844_
				+ is_1847_[8] * i_1845_ + 8192)
			       >> 14);
		i_1843_ = i_1855_;
		i_1844_ = i_1856_;
		i_1845_ = i_1857_;
	    }
	    i_1843_ <<= 4;
	    i_1844_ <<= 4;
	    i_1845_ <<= 4;
	    for (int i_1858_ = 0; i_1858_ < i_1848_; i_1858_++) {
		int i_1859_ = is[i_1858_];
		if (i_1859_ < anIntArrayArray9819.length) {
		    int[] is_1860_ = anIntArrayArray9819[i_1859_];
		    for (int i_1861_ = 0; i_1861_ < is_1860_.length;
			 i_1861_++) {
			int i_1862_ = is_1860_[i_1861_];
			if (aShortArray9812 == null
			    || (i_1846_ & aShortArray9812[i_1862_]) != 0) {
			    anIntArray9808[i_1862_] += i_1843_;
			    anIntArray9809[i_1862_] += i_1844_;
			    anIntArray9828[i_1862_] += i_1845_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_1847_ != null) {
		int i_1863_ = is_1847_[9] << 4;
		int i_1864_ = is_1847_[10] << 4;
		int i_1865_ = is_1847_[11] << 4;
		int i_1866_ = is_1847_[12] << 4;
		int i_1867_ = is_1847_[13] << 4;
		int i_1868_ = is_1847_[14] << 4;
		if (aBool9874) {
		    int i_1869_
			= ((is_1847_[0] * anInt9871 + is_1847_[3] * anInt9818
			    + is_1847_[6] * anInt9873 + 8192)
			   >> 14);
		    int i_1870_
			= ((is_1847_[1] * anInt9871 + is_1847_[4] * anInt9818
			    + is_1847_[7] * anInt9873 + 8192)
			   >> 14);
		    int i_1871_
			= ((is_1847_[2] * anInt9871 + is_1847_[5] * anInt9818
			    + is_1847_[8] * anInt9873 + 8192)
			   >> 14);
		    i_1869_ += i_1866_;
		    i_1870_ += i_1867_;
		    i_1871_ += i_1868_;
		    anInt9871 = i_1869_;
		    anInt9818 = i_1870_;
		    anInt9873 = i_1871_;
		    aBool9874 = false;
		}
		int[] is_1872_ = new int[9];
		int i_1873_ = Class427.anIntArray4805[i_1843_];
		int i_1874_ = Class427.anIntArray4806[i_1843_];
		int i_1875_ = Class427.anIntArray4805[i_1844_];
		int i_1876_ = Class427.anIntArray4806[i_1844_];
		int i_1877_ = Class427.anIntArray4805[i_1845_];
		int i_1878_ = Class427.anIntArray4806[i_1845_];
		int i_1879_ = i_1874_ * i_1877_ + 8192 >> 14;
		int i_1880_ = i_1874_ * i_1878_ + 8192 >> 14;
		is_1872_[0]
		    = i_1875_ * i_1877_ + i_1876_ * i_1880_ + 8192 >> 14;
		is_1872_[1]
		    = -i_1875_ * i_1878_ + i_1876_ * i_1879_ + 8192 >> 14;
		is_1872_[2] = i_1876_ * i_1873_ + 8192 >> 14;
		is_1872_[3] = i_1873_ * i_1878_ + 8192 >> 14;
		is_1872_[4] = i_1873_ * i_1877_ + 8192 >> 14;
		is_1872_[5] = -i_1874_;
		is_1872_[6]
		    = -i_1876_ * i_1877_ + i_1875_ * i_1880_ + 8192 >> 14;
		is_1872_[7]
		    = i_1876_ * i_1878_ + i_1875_ * i_1879_ + 8192 >> 14;
		is_1872_[8] = i_1875_ * i_1873_ + 8192 >> 14;
		int i_1881_
		    = ((is_1872_[0] * -anInt9871 + is_1872_[1] * -anInt9818
			+ is_1872_[2] * -anInt9873 + 8192)
		       >> 14);
		int i_1882_
		    = ((is_1872_[3] * -anInt9871 + is_1872_[4] * -anInt9818
			+ is_1872_[5] * -anInt9873 + 8192)
		       >> 14);
		int i_1883_
		    = ((is_1872_[6] * -anInt9871 + is_1872_[7] * -anInt9818
			+ is_1872_[8] * -anInt9873 + 8192)
		       >> 14);
		int i_1884_ = i_1881_ + anInt9871;
		int i_1885_ = i_1882_ + anInt9818;
		int i_1886_ = i_1883_ + anInt9873;
		int[] is_1887_ = new int[9];
		for (int i_1888_ = 0; i_1888_ < 3; i_1888_++) {
		    for (int i_1889_ = 0; i_1889_ < 3; i_1889_++) {
			int i_1890_ = 0;
			for (int i_1891_ = 0; i_1891_ < 3; i_1891_++)
			    i_1890_ += (is_1872_[i_1888_ * 3 + i_1891_]
					* is_1847_[i_1889_ * 3 + i_1891_]);
			is_1887_[i_1888_ * 3 + i_1889_] = i_1890_ + 8192 >> 14;
		    }
		}
		int i_1892_ = ((is_1872_[0] * i_1866_ + is_1872_[1] * i_1867_
				+ is_1872_[2] * i_1868_ + 8192)
			       >> 14);
		int i_1893_ = ((is_1872_[3] * i_1866_ + is_1872_[4] * i_1867_
				+ is_1872_[5] * i_1868_ + 8192)
			       >> 14);
		int i_1894_ = ((is_1872_[6] * i_1866_ + is_1872_[7] * i_1867_
				+ is_1872_[8] * i_1868_ + 8192)
			       >> 14);
		i_1892_ += i_1884_;
		i_1893_ += i_1885_;
		i_1894_ += i_1886_;
		int[] is_1895_ = new int[9];
		for (int i_1896_ = 0; i_1896_ < 3; i_1896_++) {
		    for (int i_1897_ = 0; i_1897_ < 3; i_1897_++) {
			int i_1898_ = 0;
			for (int i_1899_ = 0; i_1899_ < 3; i_1899_++)
			    i_1898_ += (is_1847_[i_1896_ * 3 + i_1899_]
					* is_1887_[i_1897_ + i_1899_ * 3]);
			is_1895_[i_1896_ * 3 + i_1897_] = i_1898_ + 8192 >> 14;
		    }
		}
		int i_1900_ = ((is_1847_[0] * i_1892_ + is_1847_[1] * i_1893_
				+ is_1847_[2] * i_1894_ + 8192)
			       >> 14);
		int i_1901_ = ((is_1847_[3] * i_1892_ + is_1847_[4] * i_1893_
				+ is_1847_[5] * i_1894_ + 8192)
			       >> 14);
		int i_1902_ = ((is_1847_[6] * i_1892_ + is_1847_[7] * i_1893_
				+ is_1847_[8] * i_1894_ + 8192)
			       >> 14);
		i_1900_ += i_1863_;
		i_1901_ += i_1864_;
		i_1902_ += i_1865_;
		for (int i_1903_ = 0; i_1903_ < i_1848_; i_1903_++) {
		    int i_1904_ = is[i_1903_];
		    if (i_1904_ < anIntArrayArray9819.length) {
			int[] is_1905_ = anIntArrayArray9819[i_1904_];
			for (int i_1906_ = 0; i_1906_ < is_1905_.length;
			     i_1906_++) {
			    int i_1907_ = is_1905_[i_1906_];
			    if (aShortArray9812 == null
				|| (i_1846_ & aShortArray9812[i_1907_]) != 0) {
				int i_1908_
				    = ((is_1895_[0] * anIntArray9808[i_1907_]
					+ is_1895_[1] * anIntArray9809[i_1907_]
					+ is_1895_[2] * anIntArray9828[i_1907_]
					+ 8192)
				       >> 14);
				int i_1909_
				    = ((is_1895_[3] * anIntArray9808[i_1907_]
					+ is_1895_[4] * anIntArray9809[i_1907_]
					+ is_1895_[5] * anIntArray9828[i_1907_]
					+ 8192)
				       >> 14);
				int i_1910_
				    = ((is_1895_[6] * anIntArray9808[i_1907_]
					+ is_1895_[7] * anIntArray9809[i_1907_]
					+ is_1895_[8] * anIntArray9828[i_1907_]
					+ 8192)
				       >> 14);
				i_1908_ += i_1900_;
				i_1909_ += i_1901_;
				i_1910_ += i_1902_;
				anIntArray9808[i_1907_] = i_1908_;
				anIntArray9809[i_1907_] = i_1909_;
				anIntArray9828[i_1907_] = i_1910_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1911_ = 0; i_1911_ < i_1848_; i_1911_++) {
		    int i_1912_ = is[i_1911_];
		    if (i_1912_ < anIntArrayArray9819.length) {
			int[] is_1913_ = anIntArrayArray9819[i_1912_];
			for (int i_1914_ = 0; i_1914_ < is_1913_.length;
			     i_1914_++) {
			    int i_1915_ = is_1913_[i_1914_];
			    if (aShortArray9812 == null
				|| (i_1846_ & aShortArray9812[i_1915_]) != 0) {
				anIntArray9808[i_1915_] -= anInt9871;
				anIntArray9809[i_1915_] -= anInt9818;
				anIntArray9828[i_1915_] -= anInt9873;
				if (i_1845_ != 0) {
				    int i_1916_
					= Class427.anIntArray4806[i_1845_];
				    int i_1917_
					= Class427.anIntArray4805[i_1845_];
				    int i_1918_
					= ((anIntArray9809[i_1915_] * i_1916_
					    + anIntArray9808[i_1915_] * i_1917_
					    + 16383)
					   >> 14);
				    anIntArray9809[i_1915_]
					= (anIntArray9809[i_1915_] * i_1917_
					   - anIntArray9808[i_1915_] * i_1916_
					   + 16383) >> 14;
				    anIntArray9808[i_1915_] = i_1918_;
				}
				if (i_1843_ != 0) {
				    int i_1919_
					= Class427.anIntArray4806[i_1843_];
				    int i_1920_
					= Class427.anIntArray4805[i_1843_];
				    int i_1921_
					= ((anIntArray9809[i_1915_] * i_1920_
					    - anIntArray9828[i_1915_] * i_1919_
					    + 16383)
					   >> 14);
				    anIntArray9828[i_1915_]
					= (anIntArray9809[i_1915_] * i_1919_
					   + anIntArray9828[i_1915_] * i_1920_
					   + 16383) >> 14;
				    anIntArray9809[i_1915_] = i_1921_;
				}
				if (i_1844_ != 0) {
				    int i_1922_
					= Class427.anIntArray4806[i_1844_];
				    int i_1923_
					= Class427.anIntArray4805[i_1844_];
				    int i_1924_
					= ((anIntArray9828[i_1915_] * i_1922_
					    + anIntArray9808[i_1915_] * i_1923_
					    + 16383)
					   >> 14);
				    anIntArray9828[i_1915_]
					= (anIntArray9828[i_1915_] * i_1923_
					   - anIntArray9808[i_1915_] * i_1922_
					   + 16383) >> 14;
				    anIntArray9808[i_1915_] = i_1924_;
				}
				anIntArray9808[i_1915_] += anInt9871;
				anIntArray9809[i_1915_] += anInt9818;
				anIntArray9828[i_1915_] += anInt9873;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_1925_ = 0; i_1925_ < i_1848_; i_1925_++) {
			int i_1926_ = is[i_1925_];
			if (i_1926_ < anIntArrayArray9819.length) {
			    int[] is_1927_ = anIntArrayArray9819[i_1926_];
			    for (int i_1928_ = 0; i_1928_ < is_1927_.length;
				 i_1928_++) {
				int i_1929_ = is_1927_[i_1928_];
				if (aShortArray9812 == null
				    || ((i_1846_ & aShortArray9812[i_1929_])
					!= 0)) {
				    int i_1930_ = anIntArray9853[i_1929_];
				    int i_1931_ = anIntArray9853[i_1929_ + 1];
				    for (int i_1932_ = i_1930_;
					 (i_1932_ < i_1931_
					  && aShortArray9863[i_1932_] != 0);
					 i_1932_++) {
					int i_1933_ = (aShortArray9863[i_1932_]
						       & 0xffff) - 1;
					if (i_1845_ != 0) {
					    int i_1934_
						= (Class427.anIntArray4806
						   [i_1845_]);
					    int i_1935_
						= (Class427.anIntArray4805
						   [i_1845_]);
					    int i_1936_
						= (((aShortArray9864[i_1933_]
						     * i_1934_)
						    + (aShortArray9816[i_1933_]
						       * i_1935_)
						    + 16383)
						   >> 14);
					    aShortArray9864[i_1933_]
						= (short) ((((aShortArray9864
							      [i_1933_])
							     * i_1935_)
							    - ((aShortArray9816
								[i_1933_])
							       * i_1934_)
							    + 16383)
							   >> 14);
					    aShortArray9816[i_1933_]
						= (short) i_1936_;
					}
					if (i_1843_ != 0) {
					    int i_1937_
						= (Class427.anIntArray4806
						   [i_1843_]);
					    int i_1938_
						= (Class427.anIntArray4805
						   [i_1843_]);
					    int i_1939_
						= (((aShortArray9864[i_1933_]
						     * i_1938_)
						    - (aShortArray9869[i_1933_]
						       * i_1937_)
						    + 16383)
						   >> 14);
					    aShortArray9869[i_1933_]
						= (short) ((((aShortArray9864
							      [i_1933_])
							     * i_1937_)
							    + ((aShortArray9869
								[i_1933_])
							       * i_1938_)
							    + 16383)
							   >> 14);
					    aShortArray9864[i_1933_]
						= (short) i_1939_;
					}
					if (i_1844_ != 0) {
					    int i_1940_
						= (Class427.anIntArray4806
						   [i_1844_]);
					    int i_1941_
						= (Class427.anIntArray4805
						   [i_1844_]);
					    int i_1942_
						= (((aShortArray9869[i_1933_]
						     * i_1940_)
						    + (aShortArray9816[i_1933_]
						       * i_1941_)
						    + 16383)
						   >> 14);
					    aShortArray9869[i_1933_]
						= (short) ((((aShortArray9869
							      [i_1933_])
							     * i_1941_)
							    - ((aShortArray9816
								[i_1933_])
							       * i_1940_)
							    + 16383)
							   >> 14);
					    aShortArray9816[i_1933_]
						= (short) i_1942_;
					}
				    }
				}
			    }
			}
		    }
		    method15505();
		}
	    }
	} else if (i == 3) {
	    if (is_1847_ != null) {
		int i_1943_ = is_1847_[9] << 4;
		int i_1944_ = is_1847_[10] << 4;
		int i_1945_ = is_1847_[11] << 4;
		int i_1946_ = is_1847_[12] << 4;
		int i_1947_ = is_1847_[13] << 4;
		int i_1948_ = is_1847_[14] << 4;
		if (aBool9874) {
		    int i_1949_
			= ((is_1847_[0] * anInt9871 + is_1847_[3] * anInt9818
			    + is_1847_[6] * anInt9873 + 8192)
			   >> 14);
		    int i_1950_
			= ((is_1847_[1] * anInt9871 + is_1847_[4] * anInt9818
			    + is_1847_[7] * anInt9873 + 8192)
			   >> 14);
		    int i_1951_
			= ((is_1847_[2] * anInt9871 + is_1847_[5] * anInt9818
			    + is_1847_[8] * anInt9873 + 8192)
			   >> 14);
		    i_1949_ += i_1946_;
		    i_1950_ += i_1947_;
		    i_1951_ += i_1948_;
		    anInt9871 = i_1949_;
		    anInt9818 = i_1950_;
		    anInt9873 = i_1951_;
		    aBool9874 = false;
		}
		int i_1952_ = i_1843_ << 15 >> 7;
		int i_1953_ = i_1844_ << 15 >> 7;
		int i_1954_ = i_1845_ << 15 >> 7;
		int i_1955_ = i_1952_ * -anInt9871 + 8192 >> 14;
		int i_1956_ = i_1953_ * -anInt9818 + 8192 >> 14;
		int i_1957_ = i_1954_ * -anInt9873 + 8192 >> 14;
		int i_1958_ = i_1955_ + anInt9871;
		int i_1959_ = i_1956_ + anInt9818;
		int i_1960_ = i_1957_ + anInt9873;
		int[] is_1961_ = new int[9];
		is_1961_[0] = i_1952_ * is_1847_[0] + 8192 >> 14;
		is_1961_[1] = i_1952_ * is_1847_[3] + 8192 >> 14;
		is_1961_[2] = i_1952_ * is_1847_[6] + 8192 >> 14;
		is_1961_[3] = i_1953_ * is_1847_[1] + 8192 >> 14;
		is_1961_[4] = i_1953_ * is_1847_[4] + 8192 >> 14;
		is_1961_[5] = i_1953_ * is_1847_[7] + 8192 >> 14;
		is_1961_[6] = i_1954_ * is_1847_[2] + 8192 >> 14;
		is_1961_[7] = i_1954_ * is_1847_[5] + 8192 >> 14;
		is_1961_[8] = i_1954_ * is_1847_[8] + 8192 >> 14;
		int i_1962_ = i_1952_ * i_1946_ + 8192 >> 14;
		int i_1963_ = i_1953_ * i_1947_ + 8192 >> 14;
		int i_1964_ = i_1954_ * i_1948_ + 8192 >> 14;
		i_1962_ += i_1958_;
		i_1963_ += i_1959_;
		i_1964_ += i_1960_;
		int[] is_1965_ = new int[9];
		for (int i_1966_ = 0; i_1966_ < 3; i_1966_++) {
		    for (int i_1967_ = 0; i_1967_ < 3; i_1967_++) {
			int i_1968_ = 0;
			for (int i_1969_ = 0; i_1969_ < 3; i_1969_++)
			    i_1968_ += (is_1847_[i_1966_ * 3 + i_1969_]
					* is_1961_[i_1967_ + i_1969_ * 3]);
			is_1965_[i_1966_ * 3 + i_1967_] = i_1968_ + 8192 >> 14;
		    }
		}
		int i_1970_ = ((is_1847_[0] * i_1962_ + is_1847_[1] * i_1963_
				+ is_1847_[2] * i_1964_ + 8192)
			       >> 14);
		int i_1971_ = ((is_1847_[3] * i_1962_ + is_1847_[4] * i_1963_
				+ is_1847_[5] * i_1964_ + 8192)
			       >> 14);
		int i_1972_ = ((is_1847_[6] * i_1962_ + is_1847_[7] * i_1963_
				+ is_1847_[8] * i_1964_ + 8192)
			       >> 14);
		i_1970_ += i_1943_;
		i_1971_ += i_1944_;
		i_1972_ += i_1945_;
		for (int i_1973_ = 0; i_1973_ < i_1848_; i_1973_++) {
		    int i_1974_ = is[i_1973_];
		    if (i_1974_ < anIntArrayArray9819.length) {
			int[] is_1975_ = anIntArrayArray9819[i_1974_];
			for (int i_1976_ = 0; i_1976_ < is_1975_.length;
			     i_1976_++) {
			    int i_1977_ = is_1975_[i_1976_];
			    if (aShortArray9812 == null
				|| (i_1846_ & aShortArray9812[i_1977_]) != 0) {
				int i_1978_
				    = ((is_1965_[0] * anIntArray9808[i_1977_]
					+ is_1965_[1] * anIntArray9809[i_1977_]
					+ is_1965_[2] * anIntArray9828[i_1977_]
					+ 8192)
				       >> 14);
				int i_1979_
				    = ((is_1965_[3] * anIntArray9808[i_1977_]
					+ is_1965_[4] * anIntArray9809[i_1977_]
					+ is_1965_[5] * anIntArray9828[i_1977_]
					+ 8192)
				       >> 14);
				int i_1980_
				    = ((is_1965_[6] * anIntArray9808[i_1977_]
					+ is_1965_[7] * anIntArray9809[i_1977_]
					+ is_1965_[8] * anIntArray9828[i_1977_]
					+ 8192)
				       >> 14);
				i_1978_ += i_1970_;
				i_1979_ += i_1971_;
				i_1980_ += i_1972_;
				anIntArray9808[i_1977_] = i_1978_;
				anIntArray9809[i_1977_] = i_1979_;
				anIntArray9828[i_1977_] = i_1980_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1981_ = 0; i_1981_ < i_1848_; i_1981_++) {
		    int i_1982_ = is[i_1981_];
		    if (i_1982_ < anIntArrayArray9819.length) {
			int[] is_1983_ = anIntArrayArray9819[i_1982_];
			for (int i_1984_ = 0; i_1984_ < is_1983_.length;
			     i_1984_++) {
			    int i_1985_ = is_1983_[i_1984_];
			    if (aShortArray9812 == null
				|| (i_1846_ & aShortArray9812[i_1985_]) != 0) {
				anIntArray9808[i_1985_] -= anInt9871;
				anIntArray9809[i_1985_] -= anInt9818;
				anIntArray9828[i_1985_] -= anInt9873;
				anIntArray9808[i_1985_]
				    = anIntArray9808[i_1985_] * i_1843_ >> 7;
				anIntArray9809[i_1985_]
				    = anIntArray9809[i_1985_] * i_1844_ >> 7;
				anIntArray9828[i_1985_]
				    = anIntArray9828[i_1985_] * i_1845_ >> 7;
				anIntArray9808[i_1985_] += anInt9871;
				anIntArray9809[i_1985_] += anInt9818;
				anIntArray9828[i_1985_] += anInt9873;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9831 != null) {
		boolean bool_1986_ = false;
		for (int i_1987_ = 0; i_1987_ < i_1848_; i_1987_++) {
		    int i_1988_ = is[i_1987_];
		    if (i_1988_ < anIntArrayArray9831.length) {
			int[] is_1989_ = anIntArrayArray9831[i_1988_];
			for (int i_1990_ = 0; i_1990_ < is_1989_.length;
			     i_1990_++) {
			    int i_1991_ = is_1989_[i_1990_];
			    if (aShortArray9832 == null
				|| (i_1846_ & aShortArray9832[i_1991_]) != 0) {
				int i_1992_ = ((aByteArray9826[i_1991_] & 0xff)
					       + i_1843_ * 8);
				if (i_1992_ < 0)
				    i_1992_ = 0;
				else if (i_1992_ > 255)
				    i_1992_ = 255;
				aByteArray9826[i_1991_] = (byte) i_1992_;
			    }
			}
			bool_1986_ = bool_1986_ | is_1989_.length > 0;
		    }
		}
		if (bool_1986_) {
		    if (aClass368Array9861 != null) {
			for (int i_1993_ = 0; i_1993_ < anInt9860; i_1993_++) {
			    Class368 class368 = aClass368Array9861[i_1993_];
			    Class339 class339 = aClass339Array9862[i_1993_];
			    class339.anInt3539
				= (class339.anInt3539 & 0xffffff
				   | 255 - (aByteArray9826[class368.anInt3860]
					    & 0xff) << 24);
			}
		    }
		    method15504();
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9831 != null) {
		boolean bool_1994_ = false;
		for (int i_1995_ = 0; i_1995_ < i_1848_; i_1995_++) {
		    int i_1996_ = is[i_1995_];
		    if (i_1996_ < anIntArrayArray9831.length) {
			int[] is_1997_ = anIntArrayArray9831[i_1996_];
			for (int i_1998_ = 0; i_1998_ < is_1997_.length;
			     i_1998_++) {
			    int i_1999_ = is_1997_[i_1998_];
			    if (aShortArray9832 == null
				|| (i_1846_ & aShortArray9832[i_1999_]) != 0) {
				int i_2000_
				    = aShortArray9825[i_1999_] & 0xffff;
				int i_2001_ = i_2000_ >> 10 & 0x3f;
				int i_2002_ = i_2000_ >> 7 & 0x7;
				int i_2003_ = i_2000_ & 0x7f;
				i_2001_ = i_2001_ + i_1843_ & 0x3f;
				i_2002_ += i_1844_ / 4;
				if (i_2002_ < 0)
				    i_2002_ = 0;
				else if (i_2002_ > 7)
				    i_2002_ = 7;
				i_2003_ += i_1845_;
				if (i_2003_ < 0)
				    i_2003_ = 0;
				else if (i_2003_ > 127)
				    i_2003_ = 127;
				aShortArray9825[i_1999_]
				    = (short) (i_2001_ << 10 | i_2002_ << 7
					       | i_2003_);
			    }
			}
			bool_1994_ = bool_1994_ | is_1997_.length > 0;
		    }
		}
		if (bool_1994_) {
		    if (aClass368Array9861 != null) {
			for (int i_2004_ = 0; i_2004_ < anInt9860; i_2004_++) {
			    Class368 class368 = aClass368Array9861[i_2004_];
			    Class339 class339 = aClass339Array9862[i_2004_];
			    class339.anInt3539
				= (class339.anInt3539 & ~0xffffff
				   | (Class661.anIntArray8549
				      [(aShortArray9825[class368.anInt3860]
					& 0xffff)]) & 0xffffff);
			}
		    }
		    method15504();
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9856 != null) {
		for (int i_2005_ = 0; i_2005_ < i_1848_; i_2005_++) {
		    int i_2006_ = is[i_2005_];
		    if (i_2006_ < anIntArrayArray9856.length) {
			int[] is_2007_ = anIntArrayArray9856[i_2006_];
			for (int i_2008_ = 0; i_2008_ < is_2007_.length;
			     i_2008_++) {
			    Class339 class339
				= aClass339Array9862[is_2007_[i_2008_]];
			    class339.anInt3537 += i_1843_;
			    class339.anInt3534 += i_1844_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9856 != null) {
		for (int i_2009_ = 0; i_2009_ < i_1848_; i_2009_++) {
		    int i_2010_ = is[i_2009_];
		    if (i_2010_ < anIntArrayArray9856.length) {
			int[] is_2011_ = anIntArrayArray9856[i_2010_];
			for (int i_2012_ = 0; i_2012_ < is_2011_.length;
			     i_2012_++) {
			    Class339 class339
				= aClass339Array9862[is_2011_[i_2012_]];
			    class339.anInt3538
				= class339.anInt3538 * i_1843_ >> 7;
			    class339.anInt3536
				= class339.anInt3536 * i_1844_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9856 != null) {
		for (int i_2013_ = 0; i_2013_ < i_1848_; i_2013_++) {
		    int i_2014_ = is[i_2013_];
		    if (i_2014_ < anIntArrayArray9856.length) {
			int[] is_2015_ = anIntArrayArray9856[i_2014_];
			for (int i_2016_ = 0; i_2016_ < is_2015_.length;
			     i_2016_++) {
			    Class339 class339
				= aClass339Array9862[is_2015_[i_2016_]];
			    class339.anInt3535
				= class339.anInt3535 + i_1843_ & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    public void method3145(int i) {
	aShort9804 = (short) i;
	method15504();
    }
    
    public int method3019() {
	return anInt9803;
    }
    
    public void method3147(int i) {
	aShort9805 = (short) i;
	method15509();
	method15505();
    }
    
    public void method3103(int i) {
	aShort9805 = (short) i;
	method15509();
	method15505();
    }
    
    void method15526(Class433 class433) {
	if (aClass368Array9861 != null) {
	    aClass185_Sub1_9817.method3461(!aBool9840);
	    Class446 class446 = aClass185_Sub1_9817.aClass446_9166;
	    Class323 class323 = aClass185_Sub1_9817.aClass323_9234;
	    boolean bool = aClass185_Sub1_9817.anInt9252 > 0;
	    if (bool)
		class323.aClass438_3424.method6997
		    (((float) (aClass185_Sub1_9817.anInt9251 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (aClass185_Sub1_9817.anInt9251 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (aClass185_Sub1_9817.anInt9251 >> 0 & 0xff)
		      / 255.0F));
	    else
		class323.aClass438_3424.method6997(0.0F, 0.0F, 0.0F);
	    for (int i = 0; i < anInt9860; i++) {
		Class368 class368 = aClass368Array9861[i];
		Class339 class339 = aClass339Array9862[i];
		if (!class368.aBool3864 || !aClass185_Sub1_9817.method3409()) {
		    float f = ((float) (anIntArray9808[class368.anInt3859]
					+ anIntArray9808[class368.anInt3858]
					+ anIntArray9808[class368.anInt3857])
			       * 0.3333333F);
		    float f_2017_
			= ((float) (anIntArray9809[class368.anInt3859]
				    + anIntArray9809[class368.anInt3858]
				    + anIntArray9809[class368.anInt3857])
			   * 0.3333333F);
		    float f_2018_
			= ((float) (anIntArray9828[class368.anInt3859]
				    + anIntArray9828[class368.anInt3858]
				    + anIntArray9828[class368.anInt3857])
			   * 0.3333333F);
		    float f_2019_ = (class433.aFloatArray4853[0] * f
				     + class433.aFloatArray4853[4] * f_2017_
				     + class433.aFloatArray4853[8] * f_2018_
				     + class433.aFloatArray4853[12]);
		    float f_2020_ = (class433.aFloatArray4853[1] * f
				     + class433.aFloatArray4853[5] * f_2017_
				     + class433.aFloatArray4853[9] * f_2018_
				     + class433.aFloatArray4853[13]);
		    float f_2021_ = (class433.aFloatArray4853[2] * f
				     + class433.aFloatArray4853[6] * f_2017_
				     + class433.aFloatArray4853[10] * f_2018_
				     + class433.aFloatArray4853[14]);
		    float f_2022_
			= ((float) (1.0
				    / Math.sqrt((double) (f_2019_ * f_2019_
							  + f_2020_ * f_2020_
							  + (f_2021_
							     * f_2021_))))
			   * (float) class368.anInt3862);
		    class446.method7240
			(class339.anInt3535,
			 class339.anInt3538 * class368.aShort3861 >> 7,
			 class339.anInt3536 * class368.aShort3865 >> 7,
			 (f_2019_ + (float) class339.anInt3537
			  - f_2019_ * f_2022_),
			 (f_2020_ + (float) class339.anInt3534
			  - f_2020_ * f_2022_),
			 f_2021_ - f_2021_ * f_2022_);
		    class446.method7253(aClass185_Sub1_9817.aClass446_9141);
		    aClass185_Sub1_9817.aClass433_9150.method6916(class446);
		    class323.method5784(aClass185_Sub1_9817.aClass433_9150);
		    class323.aClass433_3423.method6840();
		    class323.anInt3427 = class339.anInt3539;
		    if (bool)
			class323.aFloat3421
			    = 1.0F - ((aClass185_Sub1_9817.aFloat9255
				       - f_2021_)
				      / (aClass185_Sub1_9817.aFloat9255
					 - aClass185_Sub1_9817.aFloat9254));
		    class323.anInterface38_3426 = null;
		    if (class368.aShort3863 != -1)
			class323.anInterface38_3426
			    = (aClass185_Sub1_9817.aClass354_9211.method6267
			       (aClass185_Sub1_9817.aClass177_2012.method2931
				(class368.aShort3863 & 0xffff, (byte) 1)));
		    class323.method5785(bool);
		}
	    }
	    aClass185_Sub1_9817.method3461(true);
	}
    }
    
    public int method3176() {
	return aShort9804;
    }
    
    public int method3072() {
	return anInt9803;
    }
    
    public byte[] method3152() {
	return aByteArray9826;
    }
    
    public void method3154(short i, short i_2023_) {
	for (int i_2024_ = 0; i_2024_ < anInt9823; i_2024_++) {
	    if (aShortArray9825[i_2024_] == i)
		aShortArray9825[i_2024_] = i_2023_;
	}
	if (aClass368Array9861 != null) {
	    for (int i_2025_ = 0; i_2025_ < anInt9860; i_2025_++) {
		Class368 class368 = aClass368Array9861[i_2025_];
		Class339 class339 = aClass339Array9862[i_2025_];
		class339.anInt3539
		    = (class339.anInt3539 & ~0xffffff
		       | ((Class661.anIntArray8549
			   [aShortArray9825[class368.anInt3860] & 0xffff])
			  & 0xffffff));
	    }
	}
	method15504();
    }
    
    public void method3178(int i, int i_2026_, int i_2027_) {
	for (int i_2028_ = 0; i_2028_ < anInt9807; i_2028_++) {
	    if (i != 0)
		anIntArray9808[i_2028_] += i;
	    if (i_2026_ != 0)
		anIntArray9809[i_2028_] += i_2026_;
	    if (i_2027_ != 0)
		anIntArray9828[i_2028_] += i_2027_;
	}
	method15509();
	aBool9850 = false;
    }
    
    public void method3155(byte i, byte[] is) {
	if (is == null) {
	    for (int i_2029_ = 0; i_2029_ < anInt9823; i_2029_++)
		aByteArray9826[i_2029_] = i;
	} else {
	    for (int i_2030_ = 0; i_2030_ < anInt9823; i_2030_++) {
		int i_2031_ = 255 - ((255 - (is[i_2030_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		aByteArray9826[i_2030_] = (byte) i_2031_;
	    }
	}
	method15504();
    }
    
    public void method3141(int i, int i_2032_, int i_2033_, int i_2034_) {
	for (int i_2035_ = 0; i_2035_ < anInt9823; i_2035_++) {
	    int i_2036_ = aShortArray9825[i_2035_] & 0xffff;
	    int i_2037_ = i_2036_ >> 10 & 0x3f;
	    int i_2038_ = i_2036_ >> 7 & 0x7;
	    int i_2039_ = i_2036_ & 0x7f;
	    if (i != -1)
		i_2037_ += (i - i_2037_) * i_2034_ >> 7;
	    if (i_2032_ != -1)
		i_2038_ += (i_2032_ - i_2038_) * i_2034_ >> 7;
	    if (i_2033_ != -1)
		i_2039_ += (i_2033_ - i_2039_) * i_2034_ >> 7;
	    aShortArray9825[i_2035_]
		= (short) (i_2037_ << 10 | i_2038_ << 7 | i_2039_);
	}
	if (aClass368Array9861 != null) {
	    for (int i_2040_ = 0; i_2040_ < anInt9860; i_2040_++) {
		Class368 class368 = aClass368Array9861[i_2040_];
		Class339 class339 = aClass339Array9862[i_2040_];
		class339.anInt3539
		    = (class339.anInt3539 & ~0xffffff
		       | ((Class661.anIntArray8549
			   [aShortArray9825[class368.anInt3860] & 0xffff])
			  & 0xffffff));
	    }
	}
	method15504();
    }
    
    public void method3157(byte i, byte[] is) {
	if (is == null) {
	    for (int i_2041_ = 0; i_2041_ < anInt9823; i_2041_++)
		aByteArray9826[i_2041_] = i;
	} else {
	    for (int i_2042_ = 0; i_2042_ < anInt9823; i_2042_++) {
		int i_2043_ = 255 - ((255 - (is[i_2042_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		aByteArray9826[i_2042_] = (byte) i_2043_;
	    }
	}
	method15504();
    }
    
    public void method3158(short i, short i_2044_) {
	Class177 class177 = aClass185_Sub1_9817.aClass177_2012;
	for (int i_2045_ = 0; i_2045_ < anInt9823; i_2045_++) {
	    if (aShortArray9830[i_2045_] == i)
		aShortArray9830[i_2045_] = i_2044_;
	}
	byte i_2046_ = 0;
	byte i_2047_ = 0;
	if (i != -1) {
	    Class186 class186 = class177.method2931(i & 0xffff, (byte) 1);
	    i_2046_ = class186.aByte2074;
	    i_2047_ = class186.aByte2059;
	}
	byte i_2048_ = 0;
	byte i_2049_ = 0;
	if (i_2044_ != -1) {
	    Class186 class186
		= class177.method2931(i_2044_ & 0xffff, (byte) 1);
	    i_2048_ = class186.aByte2074;
	    i_2049_ = class186.aByte2059;
	    if (class186.aByte2047 != 0 || class186.aByte2048 != 0)
		aBool9841 = true;
	}
	if (i_2046_ != i_2048_ | i_2047_ != i_2049_) {
	    if (aClass368Array9861 != null) {
		for (int i_2050_ = 0; i_2050_ < anInt9860; i_2050_++) {
		    Class368 class368 = aClass368Array9861[i_2050_];
		    Class339 class339 = aClass339Array9862[i_2050_];
		    class339.anInt3539
			= (class339.anInt3539 & ~0xffffff
			   | ((Class661.anIntArray8549
			       [aShortArray9825[class368.anInt3860] & 0xffff])
			      & 0xffffff));
		}
	    }
	    method15504();
	}
    }
    
    public int method3122() {
	if (!aBool9850)
	    method15507();
	return anInt9868;
    }
    
    public void method3160(short i, short i_2051_) {
	Class177 class177 = aClass185_Sub1_9817.aClass177_2012;
	for (int i_2052_ = 0; i_2052_ < anInt9823; i_2052_++) {
	    if (aShortArray9830[i_2052_] == i)
		aShortArray9830[i_2052_] = i_2051_;
	}
	byte i_2053_ = 0;
	byte i_2054_ = 0;
	if (i != -1) {
	    Class186 class186 = class177.method2931(i & 0xffff, (byte) 1);
	    i_2053_ = class186.aByte2074;
	    i_2054_ = class186.aByte2059;
	}
	byte i_2055_ = 0;
	byte i_2056_ = 0;
	if (i_2051_ != -1) {
	    Class186 class186
		= class177.method2931(i_2051_ & 0xffff, (byte) 1);
	    i_2055_ = class186.aByte2074;
	    i_2056_ = class186.aByte2059;
	    if (class186.aByte2047 != 0 || class186.aByte2048 != 0)
		aBool9841 = true;
	}
	if (i_2053_ != i_2055_ | i_2054_ != i_2056_) {
	    if (aClass368Array9861 != null) {
		for (int i_2057_ = 0; i_2057_ < anInt9860; i_2057_++) {
		    Class368 class368 = aClass368Array9861[i_2057_];
		    Class339 class339 = aClass339Array9862[i_2057_];
		    class339.anInt3539
			= (class339.anInt3539 & ~0xffffff
			   | ((Class661.anIntArray8549
			       [aShortArray9825[class368.anInt3860] & 0xffff])
			      & 0xffffff));
		}
	    }
	    method15504();
	}
    }
    
    public void method3161(int i, int i_2058_, int i_2059_, int i_2060_) {
	for (int i_2061_ = 0; i_2061_ < anInt9823; i_2061_++) {
	    int i_2062_ = aShortArray9825[i_2061_] & 0xffff;
	    int i_2063_ = i_2062_ >> 10 & 0x3f;
	    int i_2064_ = i_2062_ >> 7 & 0x7;
	    int i_2065_ = i_2062_ & 0x7f;
	    if (i != -1)
		i_2063_ += (i - i_2063_) * i_2060_ >> 7;
	    if (i_2058_ != -1)
		i_2064_ += (i_2058_ - i_2064_) * i_2060_ >> 7;
	    if (i_2059_ != -1)
		i_2065_ += (i_2059_ - i_2065_) * i_2060_ >> 7;
	    aShortArray9825[i_2061_]
		= (short) (i_2063_ << 10 | i_2064_ << 7 | i_2065_);
	}
	if (aClass368Array9861 != null) {
	    for (int i_2066_ = 0; i_2066_ < anInt9860; i_2066_++) {
		Class368 class368 = aClass368Array9861[i_2066_];
		Class339 class339 = aClass339Array9862[i_2066_];
		class339.anInt3539
		    = (class339.anInt3539 & ~0xffffff
		       | ((Class661.anIntArray8549
			   [aShortArray9825[class368.anInt3860] & 0xffff])
			  & 0xffffff));
	    }
	}
	method15504();
    }
    
    public int method3138() {
	if (!aBool9850)
	    method15507();
	return anInt9866;
    }
    
    public Class172[] method3163() {
	return aClass172Array9858;
    }
    
    int method15527(int i, short i_2067_, int i_2068_) {
	int i_2069_
	    = aClass185_Sub1_9817.anIntArray9126[method15523(i, i_2068_)];
	if (i_2067_ != -1) {
	    Class186 class186 = aClass185_Sub1_9817.aClass177_2012
				    .method2931(i_2067_ & 0xffff, (byte) 1);
	    int i_2070_ = class186.aByte2074 & 0xff;
	    if (i_2070_ != 0) {
		int i_2071_ = 131586 * i_2068_;
		if (i_2068_ < 0)
		    i_2071_ = 0;
		else if (i_2068_ > 127)
		    i_2071_ = 16777215;
		else
		    i_2071_ = 131586 * i_2068_;
		if (i_2070_ == 256)
		    i_2069_ = i_2071_;
		else {
		    int i_2072_ = i_2070_;
		    int i_2073_ = 256 - i_2070_;
		    i_2069_ = ((((i_2071_ & 0xff00ff) * i_2072_
				 + (i_2069_ & 0xff00ff) * i_2073_)
				& ~0xff00ff)
			       + (((i_2071_ & 0xff00) * i_2072_
				   + (i_2069_ & 0xff00) * i_2073_)
				  & 0xff0000)) >> 8;
		}
	    }
	    int i_2074_ = class186.aByte2059 & 0xff;
	    if (i_2074_ != 0) {
		i_2074_ += 256;
		int i_2075_ = ((i_2069_ & 0xff0000) >> 16) * i_2074_;
		if (i_2075_ > 65535)
		    i_2075_ = 65535;
		int i_2076_ = ((i_2069_ & 0xff00) >> 8) * i_2074_;
		if (i_2076_ > 65535)
		    i_2076_ = 65535;
		int i_2077_ = (i_2069_ & 0xff) * i_2074_;
		if (i_2077_ > 65535)
		    i_2077_ = 65535;
		i_2069_
		    = (i_2075_ << 8 & 0xff0000) + (i_2076_ & 0xff00) + (i_2077_
									>> 8);
	    }
	}
	return i_2069_ & 0xffffff;
    }
    
    public void method3034(Class446 class446, Class194 class194, int i) {
	if (aClass345_9875 != null)
	    aClass345_9875.method6120();
	if (class194 != null)
	    class194.aBool2150 = false;
	if (anInt9813 != 0) {
	    Class433 class433 = aClass185_Sub1_9817.aClass433_9203;
	    Class433 class433_2078_ = aClass185_Sub1_9817.aClass433_9194;
	    Class433 class433_2079_ = aClass185_Sub1_9817.aClass433_9150;
	    class433_2078_.method6916(class446);
	    class433_2079_.method6842(class433_2078_);
	    class433_2079_.method6839(aClass185_Sub1_9817.aClass433_9284);
	    if (!aBool9850)
		method15507();
	    float[] fs = aClass185_Sub1_9817.aFloatArray9156;
	    class433_2078_.method6850(0.0F, (float) anInt9799, 0.0F, fs);
	    float f = fs[0];
	    float f_2080_ = fs[1];
	    float f_2081_ = fs[2];
	    class433_2078_.method6850(0.0F, (float) anInt9846, 0.0F, fs);
	    float f_2082_ = fs[0];
	    float f_2083_ = fs[1];
	    float f_2084_ = fs[2];
	    for (int i_2085_ = 0; i_2085_ < 6; i_2085_++) {
		float[] fs_2086_
		    = aClass185_Sub1_9817.aFloatArrayArray9165[i_2085_];
		float f_2087_ = (fs_2086_[0] * f + fs_2086_[1] * f_2080_
				 + fs_2086_[2] * f_2081_ + fs_2086_[3]
				 + (float) anInt9868);
		float f_2088_ = (fs_2086_[0] * f_2082_ + fs_2086_[1] * f_2083_
				 + fs_2086_[2] * f_2084_ + fs_2086_[3]
				 + (float) anInt9868);
		if (f_2087_ < 0.0F && f_2088_ < 0.0F)
		    return;
	    }
	    if (class194 != null) {
		boolean bool = false;
		boolean bool_2089_ = true;
		int i_2090_ = anInt9865 + anInt9848 >> 1;
		int i_2091_ = anInt9849 + anInt9866 >> 1;
		int i_2092_ = i_2090_;
		int i_2093_ = anInt9799;
		int i_2094_ = i_2091_;
		float f_2095_
		    = (class433_2079_.aFloatArray4853[0] * (float) i_2092_
		       + class433_2079_.aFloatArray4853[4] * (float) i_2093_
		       + class433_2079_.aFloatArray4853[8] * (float) i_2094_
		       + class433_2079_.aFloatArray4853[12]);
		float f_2096_
		    = (class433_2079_.aFloatArray4853[1] * (float) i_2092_
		       + class433_2079_.aFloatArray4853[5] * (float) i_2093_
		       + class433_2079_.aFloatArray4853[9] * (float) i_2094_
		       + class433_2079_.aFloatArray4853[13]);
		float f_2097_
		    = (class433_2079_.aFloatArray4853[2] * (float) i_2092_
		       + class433_2079_.aFloatArray4853[6] * (float) i_2093_
		       + class433_2079_.aFloatArray4853[10] * (float) i_2094_
		       + class433_2079_.aFloatArray4853[14]);
		float f_2098_
		    = (class433_2079_.aFloatArray4853[3] * (float) i_2092_
		       + class433_2079_.aFloatArray4853[7] * (float) i_2093_
		       + class433_2079_.aFloatArray4853[11] * (float) i_2094_
		       + class433_2079_.aFloatArray4853[15]);
		if (f_2097_ >= -f_2098_) {
		    class194.anInt2148
			= (int) (aClass185_Sub1_9817.aFloat9257
				 + (aClass185_Sub1_9817.aFloat9167 * f_2095_
				    / f_2098_));
		    class194.anInt2149
			= (int) (aClass185_Sub1_9817.aFloat9168
				 + (aClass185_Sub1_9817.aFloat9169 * f_2096_
				    / f_2098_));
		} else
		    bool = true;
		i_2092_ = i_2090_;
		i_2093_ = anInt9846;
		i_2094_ = i_2091_;
		float f_2099_
		    = (class433_2079_.aFloatArray4853[0] * (float) i_2092_
		       + class433_2079_.aFloatArray4853[4] * (float) i_2093_
		       + class433_2079_.aFloatArray4853[8] * (float) i_2094_
		       + class433_2079_.aFloatArray4853[12]);
		float f_2100_
		    = (class433_2079_.aFloatArray4853[1] * (float) i_2092_
		       + class433_2079_.aFloatArray4853[5] * (float) i_2093_
		       + class433_2079_.aFloatArray4853[9] * (float) i_2094_
		       + class433_2079_.aFloatArray4853[13]);
		float f_2101_
		    = (class433_2079_.aFloatArray4853[2] * (float) i_2092_
		       + class433_2079_.aFloatArray4853[6] * (float) i_2093_
		       + class433_2079_.aFloatArray4853[10] * (float) i_2094_
		       + class433_2079_.aFloatArray4853[14]);
		float f_2102_
		    = (class433_2079_.aFloatArray4853[3] * (float) i_2092_
		       + class433_2079_.aFloatArray4853[7] * (float) i_2093_
		       + class433_2079_.aFloatArray4853[11] * (float) i_2094_
		       + class433_2079_.aFloatArray4853[15]);
		if (f_2101_ >= -f_2102_) {
		    class194.anInt2152
			= (int) (aClass185_Sub1_9817.aFloat9257
				 + (aClass185_Sub1_9817.aFloat9167 * f_2099_
				    / f_2102_));
		    class194.anInt2151
			= (int) (aClass185_Sub1_9817.aFloat9168
				 + (aClass185_Sub1_9817.aFloat9169 * f_2100_
				    / f_2102_));
		} else
		    bool = true;
		if (bool) {
		    if (f_2097_ < -f_2098_ && f_2101_ < -f_2102_)
			bool_2089_ = false;
		    else if (f_2097_ < -f_2098_) {
			float f_2103_
			    = (f_2097_ + f_2098_) / (f_2101_ + f_2102_) - 1.0F;
			float f_2104_
			    = f_2095_ + f_2103_ * (f_2099_ - f_2095_);
			float f_2105_
			    = f_2096_ + f_2103_ * (f_2100_ - f_2096_);
			float f_2106_
			    = f_2098_ + f_2103_ * (f_2102_ - f_2098_);
			class194.anInt2148
			    = (int) (aClass185_Sub1_9817.aFloat9257
				     + (aClass185_Sub1_9817.aFloat9167
					* f_2104_ / f_2106_));
			class194.anInt2149
			    = (int) (aClass185_Sub1_9817.aFloat9168
				     + (aClass185_Sub1_9817.aFloat9169
					* f_2105_ / f_2106_));
		    } else if (f_2101_ < -f_2102_) {
			float f_2107_
			    = (f_2101_ + f_2102_) / (f_2097_ + f_2098_) - 1.0F;
			float f_2108_
			    = f_2099_ + f_2107_ * (f_2095_ - f_2099_);
			float f_2109_
			    = f_2100_ + f_2107_ * (f_2096_ - f_2100_);
			float f_2110_
			    = f_2102_ + f_2107_ * (f_2098_ - f_2102_);
			class194.anInt2152
			    = (int) (aClass185_Sub1_9817.aFloat9257
				     + (aClass185_Sub1_9817.aFloat9167
					* f_2108_ / f_2110_));
			class194.anInt2151
			    = (int) (aClass185_Sub1_9817.aFloat9168
				     + (aClass185_Sub1_9817.aFloat9169
					* f_2109_ / f_2110_));
		    }
		}
		if (bool_2089_) {
		    if (f_2097_ / f_2098_ > f_2101_ / f_2102_) {
			float f_2111_ = (f_2095_
					 + (class433.aFloatArray4853[0]
					    * (float) anInt9868)
					 + class433.aFloatArray4853[12]);
			float f_2112_ = (f_2098_
					 + (class433.aFloatArray4853[3]
					    * (float) anInt9868)
					 + class433.aFloatArray4853[15]);
			class194.anInt2147
			    = (int) (aClass185_Sub1_9817.aFloat9257
				     - (float) class194.anInt2148
				     + (aClass185_Sub1_9817.aFloat9167
					* f_2111_ / f_2112_));
		    } else {
			float f_2113_ = (f_2099_
					 + (class433.aFloatArray4853[0]
					    * (float) anInt9868)
					 + class433.aFloatArray4853[12]);
			float f_2114_ = (f_2102_
					 + (class433.aFloatArray4853[3]
					    * (float) anInt9868)
					 + class433.aFloatArray4853[15]);
			class194.anInt2147
			    = (int) (aClass185_Sub1_9817.aFloat9257
				     - (float) class194.anInt2152
				     + (aClass185_Sub1_9817.aFloat9167
					* f_2113_ / f_2114_));
		    }
		    class194.aBool2150 = true;
		}
	    }
	    aClass185_Sub1_9817.method14642(i);
	    method15516(class446);
	    aClass185_Sub1_9817.method14642(0);
	    class433_2078_.method6916(class446);
	    class433_2078_.method6839(aClass185_Sub1_9817.aClass433_9142);
	    method15526(class433_2078_);
	}
    }
    
    public Class158[] method3166() {
	return aClass158Array9859;
    }
    
    public Class158[] method3024() {
	return aClass158Array9859;
    }
    
    public boolean method3090() {
	if (aShortArray9830 == null)
	    return true;
	for (int i = 0; i < aShortArray9830.length; i++) {
	    if (aShortArray9830[i] != -1
		&& !(aClass185_Sub1_9817.aClass354_9211.method6265
		     (aClass185_Sub1_9817.aClass177_2012
			  .method2931(aShortArray9830[i], (byte) 1),
		      -1)))
		return false;
	}
	return true;
    }
    
    public void method3195() {
	for (int i = 0; i < anInt9807; i++)
	    anIntArray9828[i] = -anIntArray9828[i];
	for (int i = 0; i < anInt9813; i++)
	    aShortArray9869[i] = (short) -aShortArray9869[i];
	for (int i = 0; i < anInt9823; i++) {
	    short i_2115_ = aShortArray9847[i];
	    aShortArray9847[i] = aShortArray9843[i];
	    aShortArray9843[i] = i_2115_;
	}
	method15509();
	method15505();
	method15528();
	aBool9850 = false;
    }
    
    public boolean method3170() {
	if (aShortArray9830 == null)
	    return true;
	for (int i = 0; i < aShortArray9830.length; i++) {
	    if (aShortArray9830[i] != -1
		&& !(aClass185_Sub1_9817.aClass354_9211.method6265
		     (aClass185_Sub1_9817.aClass177_2012
			  .method2931(aShortArray9830[i], (byte) 1),
		      -1)))
		return false;
	}
	return true;
    }
    
    public boolean method3171() {
	return aBool9840;
    }
    
    public boolean method3172() {
	return aBool9840;
    }
    
    public boolean method3173() {
	return aBool9840;
    }
    
    public boolean method3174() {
	return aBool9841;
    }
    
    public void method3075(int i) {
	int i_2116_ = Class427.anIntArray4806[i];
	int i_2117_ = Class427.anIntArray4805[i];
	for (int i_2118_ = 0; i_2118_ < anInt9807; i_2118_++) {
	    int i_2119_ = ((anIntArray9828[i_2118_] * i_2116_
			    + anIntArray9808[i_2118_] * i_2117_)
			   >> 14);
	    anIntArray9828[i_2118_]
		= (anIntArray9828[i_2118_] * i_2117_
		   - anIntArray9808[i_2118_] * i_2116_) >> 14;
	    anIntArray9808[i_2118_] = i_2119_;
	}
	for (int i_2120_ = 0; i_2120_ < anInt9813; i_2120_++) {
	    int i_2121_ = ((aShortArray9869[i_2120_] * i_2116_
			    + aShortArray9816[i_2120_] * i_2117_)
			   >> 14);
	    aShortArray9869[i_2120_]
		= (short) ((aShortArray9869[i_2120_] * i_2117_
			    - aShortArray9816[i_2120_] * i_2116_)
			   >> 14);
	    aShortArray9816[i_2120_] = (short) i_2121_;
	}
	method15509();
	method15505();
	aBool9850 = false;
    }
    
    public void method3200() {
	if (anInt9813 > 0 && anInt9824 > 0) {
	    method15517();
	    method15553();
	    method15503();
	}
    }
    
    public void method3177(int i) {
	int i_2122_ = Class427.anIntArray4806[i];
	int i_2123_ = Class427.anIntArray4805[i];
	for (int i_2124_ = 0; i_2124_ < anInt9807; i_2124_++) {
	    int i_2125_ = ((anIntArray9828[i_2124_] * i_2122_
			    + anIntArray9808[i_2124_] * i_2123_)
			   >> 14);
	    anIntArray9828[i_2124_]
		= (anIntArray9828[i_2124_] * i_2123_
		   - anIntArray9808[i_2124_] * i_2122_) >> 14;
	    anIntArray9808[i_2124_] = i_2125_;
	}
	for (int i_2126_ = 0; i_2126_ < anInt9813; i_2126_++) {
	    int i_2127_ = ((aShortArray9869[i_2126_] * i_2122_
			    + aShortArray9816[i_2126_] * i_2123_)
			   >> 14);
	    aShortArray9869[i_2126_]
		= (short) ((aShortArray9869[i_2126_] * i_2123_
			    - aShortArray9816[i_2126_] * i_2122_)
			   >> 14);
	    aShortArray9816[i_2126_] = (short) i_2127_;
	}
	method15509();
	method15505();
	aBool9850 = false;
    }
    
    void method15528() {
	if (aClass335_9833 != null)
	    aClass335_9833.aBool3516 = false;
    }
    
    public void method3153(int i, int i_2128_, int i_2129_) {
	for (int i_2130_ = 0; i_2130_ < anInt9807; i_2130_++) {
	    if (i != 0)
		anIntArray9808[i_2130_] += i;
	    if (i_2128_ != 0)
		anIntArray9809[i_2130_] += i_2128_;
	    if (i_2129_ != 0)
		anIntArray9828[i_2130_] += i_2129_;
	}
	method15509();
	aBool9850 = false;
    }
    
    public int method3087() {
	if (!aBool9850)
	    method15507();
	return anInt9865;
    }
    
    void method3181() {
	/* empty */
    }
    
    void method3182() {
	/* empty */
    }
    
    public void method3169(Class446 class446, Class194 class194, int i) {
	if (aClass345_9875 != null)
	    aClass345_9875.method6120();
	if (class194 != null)
	    class194.aBool2150 = false;
	if (anInt9813 != 0) {
	    Class433 class433 = aClass185_Sub1_9817.aClass433_9203;
	    Class433 class433_2131_ = aClass185_Sub1_9817.aClass433_9194;
	    Class433 class433_2132_ = aClass185_Sub1_9817.aClass433_9150;
	    class433_2131_.method6916(class446);
	    class433_2132_.method6842(class433_2131_);
	    class433_2132_.method6839(aClass185_Sub1_9817.aClass433_9284);
	    if (!aBool9850)
		method15507();
	    float[] fs = aClass185_Sub1_9817.aFloatArray9156;
	    class433_2131_.method6850(0.0F, (float) anInt9799, 0.0F, fs);
	    float f = fs[0];
	    float f_2133_ = fs[1];
	    float f_2134_ = fs[2];
	    class433_2131_.method6850(0.0F, (float) anInt9846, 0.0F, fs);
	    float f_2135_ = fs[0];
	    float f_2136_ = fs[1];
	    float f_2137_ = fs[2];
	    for (int i_2138_ = 0; i_2138_ < 6; i_2138_++) {
		float[] fs_2139_
		    = aClass185_Sub1_9817.aFloatArrayArray9165[i_2138_];
		float f_2140_ = (fs_2139_[0] * f + fs_2139_[1] * f_2133_
				 + fs_2139_[2] * f_2134_ + fs_2139_[3]
				 + (float) anInt9868);
		float f_2141_ = (fs_2139_[0] * f_2135_ + fs_2139_[1] * f_2136_
				 + fs_2139_[2] * f_2137_ + fs_2139_[3]
				 + (float) anInt9868);
		if (f_2140_ < 0.0F && f_2141_ < 0.0F)
		    return;
	    }
	    if (class194 != null) {
		boolean bool = false;
		boolean bool_2142_ = true;
		int i_2143_ = anInt9865 + anInt9848 >> 1;
		int i_2144_ = anInt9849 + anInt9866 >> 1;
		int i_2145_ = i_2143_;
		int i_2146_ = anInt9799;
		int i_2147_ = i_2144_;
		float f_2148_
		    = (class433_2132_.aFloatArray4853[0] * (float) i_2145_
		       + class433_2132_.aFloatArray4853[4] * (float) i_2146_
		       + class433_2132_.aFloatArray4853[8] * (float) i_2147_
		       + class433_2132_.aFloatArray4853[12]);
		float f_2149_
		    = (class433_2132_.aFloatArray4853[1] * (float) i_2145_
		       + class433_2132_.aFloatArray4853[5] * (float) i_2146_
		       + class433_2132_.aFloatArray4853[9] * (float) i_2147_
		       + class433_2132_.aFloatArray4853[13]);
		float f_2150_
		    = (class433_2132_.aFloatArray4853[2] * (float) i_2145_
		       + class433_2132_.aFloatArray4853[6] * (float) i_2146_
		       + class433_2132_.aFloatArray4853[10] * (float) i_2147_
		       + class433_2132_.aFloatArray4853[14]);
		float f_2151_
		    = (class433_2132_.aFloatArray4853[3] * (float) i_2145_
		       + class433_2132_.aFloatArray4853[7] * (float) i_2146_
		       + class433_2132_.aFloatArray4853[11] * (float) i_2147_
		       + class433_2132_.aFloatArray4853[15]);
		if (f_2150_ >= -f_2151_) {
		    class194.anInt2148
			= (int) (aClass185_Sub1_9817.aFloat9257
				 + (aClass185_Sub1_9817.aFloat9167 * f_2148_
				    / f_2151_));
		    class194.anInt2149
			= (int) (aClass185_Sub1_9817.aFloat9168
				 + (aClass185_Sub1_9817.aFloat9169 * f_2149_
				    / f_2151_));
		} else
		    bool = true;
		i_2145_ = i_2143_;
		i_2146_ = anInt9846;
		i_2147_ = i_2144_;
		float f_2152_
		    = (class433_2132_.aFloatArray4853[0] * (float) i_2145_
		       + class433_2132_.aFloatArray4853[4] * (float) i_2146_
		       + class433_2132_.aFloatArray4853[8] * (float) i_2147_
		       + class433_2132_.aFloatArray4853[12]);
		float f_2153_
		    = (class433_2132_.aFloatArray4853[1] * (float) i_2145_
		       + class433_2132_.aFloatArray4853[5] * (float) i_2146_
		       + class433_2132_.aFloatArray4853[9] * (float) i_2147_
		       + class433_2132_.aFloatArray4853[13]);
		float f_2154_
		    = (class433_2132_.aFloatArray4853[2] * (float) i_2145_
		       + class433_2132_.aFloatArray4853[6] * (float) i_2146_
		       + class433_2132_.aFloatArray4853[10] * (float) i_2147_
		       + class433_2132_.aFloatArray4853[14]);
		float f_2155_
		    = (class433_2132_.aFloatArray4853[3] * (float) i_2145_
		       + class433_2132_.aFloatArray4853[7] * (float) i_2146_
		       + class433_2132_.aFloatArray4853[11] * (float) i_2147_
		       + class433_2132_.aFloatArray4853[15]);
		if (f_2154_ >= -f_2155_) {
		    class194.anInt2152
			= (int) (aClass185_Sub1_9817.aFloat9257
				 + (aClass185_Sub1_9817.aFloat9167 * f_2152_
				    / f_2155_));
		    class194.anInt2151
			= (int) (aClass185_Sub1_9817.aFloat9168
				 + (aClass185_Sub1_9817.aFloat9169 * f_2153_
				    / f_2155_));
		} else
		    bool = true;
		if (bool) {
		    if (f_2150_ < -f_2151_ && f_2154_ < -f_2155_)
			bool_2142_ = false;
		    else if (f_2150_ < -f_2151_) {
			float f_2156_
			    = (f_2150_ + f_2151_) / (f_2154_ + f_2155_) - 1.0F;
			float f_2157_
			    = f_2148_ + f_2156_ * (f_2152_ - f_2148_);
			float f_2158_
			    = f_2149_ + f_2156_ * (f_2153_ - f_2149_);
			float f_2159_
			    = f_2151_ + f_2156_ * (f_2155_ - f_2151_);
			class194.anInt2148
			    = (int) (aClass185_Sub1_9817.aFloat9257
				     + (aClass185_Sub1_9817.aFloat9167
					* f_2157_ / f_2159_));
			class194.anInt2149
			    = (int) (aClass185_Sub1_9817.aFloat9168
				     + (aClass185_Sub1_9817.aFloat9169
					* f_2158_ / f_2159_));
		    } else if (f_2154_ < -f_2155_) {
			float f_2160_
			    = (f_2154_ + f_2155_) / (f_2150_ + f_2151_) - 1.0F;
			float f_2161_
			    = f_2152_ + f_2160_ * (f_2148_ - f_2152_);
			float f_2162_
			    = f_2153_ + f_2160_ * (f_2149_ - f_2153_);
			float f_2163_
			    = f_2155_ + f_2160_ * (f_2151_ - f_2155_);
			class194.anInt2152
			    = (int) (aClass185_Sub1_9817.aFloat9257
				     + (aClass185_Sub1_9817.aFloat9167
					* f_2161_ / f_2163_));
			class194.anInt2151
			    = (int) (aClass185_Sub1_9817.aFloat9168
				     + (aClass185_Sub1_9817.aFloat9169
					* f_2162_ / f_2163_));
		    }
		}
		if (bool_2142_) {
		    if (f_2150_ / f_2151_ > f_2154_ / f_2155_) {
			float f_2164_ = (f_2148_
					 + (class433.aFloatArray4853[0]
					    * (float) anInt9868)
					 + class433.aFloatArray4853[12]);
			float f_2165_ = (f_2151_
					 + (class433.aFloatArray4853[3]
					    * (float) anInt9868)
					 + class433.aFloatArray4853[15]);
			class194.anInt2147
			    = (int) (aClass185_Sub1_9817.aFloat9257
				     - (float) class194.anInt2148
				     + (aClass185_Sub1_9817.aFloat9167
					* f_2164_ / f_2165_));
		    } else {
			float f_2166_ = (f_2152_
					 + (class433.aFloatArray4853[0]
					    * (float) anInt9868)
					 + class433.aFloatArray4853[12]);
			float f_2167_ = (f_2155_
					 + (class433.aFloatArray4853[3]
					    * (float) anInt9868)
					 + class433.aFloatArray4853[15]);
			class194.anInt2147
			    = (int) (aClass185_Sub1_9817.aFloat9257
				     - (float) class194.anInt2152
				     + (aClass185_Sub1_9817.aFloat9167
					* f_2166_ / f_2167_));
		    }
		    class194.aBool2150 = true;
		}
	    }
	    aClass185_Sub1_9817.method14642(i);
	    method15516(class446);
	    aClass185_Sub1_9817.method14642(0);
	    class433_2131_.method6916(class446);
	    class433_2131_.method6839(aClass185_Sub1_9817.aClass433_9142);
	    method15526(class433_2131_);
	}
    }
    
    void method3184() {
	/* empty */
    }
    
    static float[] method15529(float[] fs, int i) {
	float[] fs_2168_ = new float[i];
	System.arraycopy(fs, 0, fs_2168_, 0, i);
	return fs_2168_;
    }
    
    short method15530(Class187 class187, int i, int i_2169_, long l,
		      int i_2170_, int i_2171_, int i_2172_, int i_2173_,
		      float f, float f_2174_) {
	int i_2175_ = anIntArray9853[i];
	int i_2176_ = anIntArray9853[i + 1];
	int i_2177_ = 0;
	for (int i_2178_ = i_2175_; i_2178_ < i_2176_; i_2178_++) {
	    if (aShortArray9863[i_2178_] == 0) {
		i_2177_ = i_2178_;
		break;
	    }
	    int i_2179_ = (aShortArray9863[i_2178_] & 0xffff) - 1;
	    if (aLongArray9800[i_2178_] == l)
		return (short) i_2179_;
	}
	aShortArray9863[i_2177_] = (short) (anInt9813 + 1);
	aLongArray9800[i_2177_] = l;
	aShortArray9815[anInt9813] = (short) i_2169_;
	aShortArray9801[anInt9813] = (short) i;
	aShortArray9816[anInt9813] = (short) i_2170_;
	aShortArray9864[anInt9813] = (short) i_2171_;
	aShortArray9869[anInt9813] = (short) i_2172_;
	aByteArray9814[anInt9813] = (byte) i_2173_;
	aFloatArray9829[anInt9813] = f;
	aFloatArray9821[anInt9813] = f_2174_;
	return (short) anInt9813++;
    }
    
    short method15531(Class187 class187, int i, int i_2180_, long l,
		      int i_2181_, int i_2182_, int i_2183_, int i_2184_,
		      float f, float f_2185_) {
	int i_2186_ = anIntArray9853[i];
	int i_2187_ = anIntArray9853[i + 1];
	int i_2188_ = 0;
	for (int i_2189_ = i_2186_; i_2189_ < i_2187_; i_2189_++) {
	    if (aShortArray9863[i_2189_] == 0) {
		i_2188_ = i_2189_;
		break;
	    }
	    int i_2190_ = (aShortArray9863[i_2189_] & 0xffff) - 1;
	    if (aLongArray9800[i_2189_] == l)
		return (short) i_2190_;
	}
	aShortArray9863[i_2188_] = (short) (anInt9813 + 1);
	aLongArray9800[i_2188_] = l;
	aShortArray9815[anInt9813] = (short) i_2180_;
	aShortArray9801[anInt9813] = (short) i;
	aShortArray9816[anInt9813] = (short) i_2181_;
	aShortArray9864[anInt9813] = (short) i_2182_;
	aShortArray9869[anInt9813] = (short) i_2183_;
	aByteArray9814[anInt9813] = (byte) i_2184_;
	aFloatArray9829[anInt9813] = f;
	aFloatArray9821[anInt9813] = f_2185_;
	return (short) anInt9813++;
    }
    
    short method15532(Class187 class187, int i, int i_2191_, long l,
		      int i_2192_, int i_2193_, int i_2194_, int i_2195_,
		      float f, float f_2196_) {
	int i_2197_ = anIntArray9853[i];
	int i_2198_ = anIntArray9853[i + 1];
	int i_2199_ = 0;
	for (int i_2200_ = i_2197_; i_2200_ < i_2198_; i_2200_++) {
	    if (aShortArray9863[i_2200_] == 0) {
		i_2199_ = i_2200_;
		break;
	    }
	    int i_2201_ = (aShortArray9863[i_2200_] & 0xffff) - 1;
	    if (aLongArray9800[i_2200_] == l)
		return (short) i_2201_;
	}
	aShortArray9863[i_2199_] = (short) (anInt9813 + 1);
	aLongArray9800[i_2199_] = l;
	aShortArray9815[anInt9813] = (short) i_2191_;
	aShortArray9801[anInt9813] = (short) i;
	aShortArray9816[anInt9813] = (short) i_2192_;
	aShortArray9864[anInt9813] = (short) i_2193_;
	aShortArray9869[anInt9813] = (short) i_2194_;
	aByteArray9814[anInt9813] = (byte) i_2195_;
	aFloatArray9829[anInt9813] = f;
	aFloatArray9821[anInt9813] = f_2196_;
	return (short) anInt9813++;
    }
    
    static byte[] method15533(byte[] is, int i) {
	byte[] is_2202_ = new byte[i];
	System.arraycopy(is, 0, is_2202_, 0, i);
	return is_2202_;
    }
    
    static byte[] method15534(byte[] is, int i) {
	byte[] is_2203_ = new byte[i];
	System.arraycopy(is, 0, is_2203_, 0, i);
	return is_2203_;
    }
    
    public Class183 method3070(byte i, int i_2204_, boolean bool) {
	boolean bool_2205_ = false;
	Class183_Sub3 class183_sub3_2206_;
	Class183_Sub3 class183_sub3_2207_;
	if (i > 0 && i <= 8) {
	    class183_sub3_2207_
		= aClass185_Sub1_9817.aClass183_Sub3Array9290[i - 1];
	    class183_sub3_2206_
		= aClass185_Sub1_9817.aClass183_Sub3Array9128[i - 1];
	    bool_2205_ = true;
	} else
	    class183_sub3_2206_ = class183_sub3_2207_
		= new Class183_Sub3(aClass185_Sub1_9817, 0, 0, true, false);
	return method15502(class183_sub3_2206_, class183_sub3_2207_, i_2204_,
			   bool_2205_, bool);
    }
    
    public Class172[] method3165() {
	return aClass172Array9858;
    }
    
    static short[] method15535(short[] is, int i) {
	short[] is_2208_ = new short[i];
	System.arraycopy(is, 0, is_2208_, 0, i);
	return is_2208_;
    }
    
    static short[] method15536(short[] is, int i) {
	short[] is_2209_ = new short[i];
	System.arraycopy(is, 0, is_2209_, 0, i);
	return is_2209_;
    }
    
    public void method3199(short i, short i_2210_) {
	for (int i_2211_ = 0; i_2211_ < anInt9823; i_2211_++) {
	    if (aShortArray9825[i_2211_] == i)
		aShortArray9825[i_2211_] = i_2210_;
	}
	if (aClass368Array9861 != null) {
	    for (int i_2212_ = 0; i_2212_ < anInt9860; i_2212_++) {
		Class368 class368 = aClass368Array9861[i_2212_];
		Class339 class339 = aClass339Array9862[i_2212_];
		class339.anInt3539
		    = (class339.anInt3539 & ~0xffffff
		       | ((Class661.anIntArray8549
			   [aShortArray9825[class368.anInt3860] & 0xffff])
			  & 0xffffff));
	    }
	}
	method15504();
    }
    
    static float[] method15537(float[] fs, int i) {
	float[] fs_2213_ = new float[i];
	System.arraycopy(fs, 0, fs_2213_, 0, i);
	return fs_2213_;
    }
    
    void method3057() {
	/* empty */
    }
    
    void method15538() {
	if (aClass379_9834 != null)
	    aClass379_9834.aBool3921 = false;
    }
    
    public boolean method3060() {
	if (aShortArray9830 == null)
	    return true;
	for (int i = 0; i < aShortArray9830.length; i++) {
	    if (aShortArray9830[i] != -1
		&& !(aClass185_Sub1_9817.aClass354_9211.method6265
		     (aClass185_Sub1_9817.aClass177_2012
			  .method2931(aShortArray9830[i], (byte) 1),
		      -1)))
		return false;
	}
	return true;
    }
    
    void method15539() {
	if ((anInt9872 & 0x37) != 0) {
	    if (aClass379_9836 != null)
		aClass379_9836.aBool3921 = false;
	} else if (aClass379_9835 != null)
	    aClass379_9835.aBool3921 = false;
    }
    
    void method15540(Class446 class446) {
	if (anInt9824 != 0 && (method15517() && method15553())) {
	    if (aClass345_9875 == null) {
		/* empty */
	    }
	    aClass185_Sub1_9817.method14712();
	    aClass185_Sub1_9817.method14605();
	    Class324 class324 = aClass185_Sub1_9817.aClass324_9158;
	    aClass185_Sub1_9817.method14733(0,
					    aClass379_9834.anInterface37_3922);
	    aClass185_Sub1_9817.method14733(1,
					    aClass379_9835.anInterface37_3922);
	    aClass185_Sub1_9817.method14733(2,
					    aClass379_9837.anInterface37_3922);
	    aClass185_Sub1_9817.method14701(aClass335_9833.anInterface39_3515);
	    aClass185_Sub1_9817.aClass433_9194.method6916(class446);
	    class324.method5794(aClass185_Sub1_9817.aClass433_9194);
	    class324.aClass433_3430.method6840();
	    if (aClass185_Sub1_9817.aBool9231) {
		Class166 class166 = aClass185_Sub1_9817.method14685();
		class324.aClass441_3438.method7105
		    (0.0F, 1.0F, 0.0F, (float) -aClass185_Sub1_9817.anInt9247);
		class324.aClass441_3438.method7110(3.0F
						   / (float) ((class166
							       .anInt1762)
							      * -1095140607));
		class324.aClass438_3431.method6997
		    (((float) (class166.anInt1763 * 2113275141 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (class166.anInt1763 * 2113275141 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (class166.anInt1763 * 2113275141 >> 0 & 0xff)
		      / 255.0F));
	    } else {
		class324.aClass441_3438.method7105(0.0F, 0.0F, 0.0F, 0.0F);
		class324.aClass438_3431.method6997(0.0F, 0.0F, 0.0F);
	    }
	    if (aClass185_Sub1_9817.anInt9252 > 0) {
		class324.aClass441_3440.method7105(0.0F, 0.0F, 1.0F,
						   -(aClass185_Sub1_9817
						     .aFloat9254));
		class324.aClass438_3435.method6997
		    (((float) (aClass185_Sub1_9817.anInt9251 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (aClass185_Sub1_9817.anInt9251 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (aClass185_Sub1_9817.anInt9251 >> 0 & 0xff)
		      / 255.0F));
		aClass185_Sub1_9817.aClass433_9194.method6916(class446);
		aClass185_Sub1_9817.aClass433_9194.method6867();
		class324.aClass441_3438
		    .method7111(aClass185_Sub1_9817.aClass433_9194);
		aClass185_Sub1_9817.aClass433_9194.method6916(class446);
		aClass185_Sub1_9817.aClass433_9194
		    .method6839(aClass185_Sub1_9817.aClass433_9142);
		aClass185_Sub1_9817.aClass433_9194.method6867();
		class324.aClass441_3440
		    .method7111(aClass185_Sub1_9817.aClass433_9194);
		class324.aClass441_3440.method7110
		    (1.0F / (aClass185_Sub1_9817.aFloat9255
			     - aClass185_Sub1_9817.aFloat9254));
	    } else {
		class324.aClass441_3440.method7105(0.0F, 0.0F, 0.0F, 0.0F);
		class324.aClass438_3435.method6997(0.0F, 0.0F, 0.0F);
	    }
	    if ((anInt9872 & 0x37) == 0) {
		aClass185_Sub1_9817
		    .method14700(aClass185_Sub1_9817.aClass349_9216);
		if (aClass185_Sub1_9817.aBool9125)
		    aClass185_Sub1_9817.method14648(false);
		for (int i = 0; i < anIntArray9854.length; i++) {
		    int i_2214_ = anIntArray9827[i];
		    int i_2215_ = anIntArray9827[i + 1];
		    int i_2216_ = aShortArray9830[i_2214_];
		    boolean bool = false;
		    byte i_2217_ = 0;
		    if (i_2216_ != -1) {
			Class186 class186
			    = aClass185_Sub1_9817.aClass177_2012
				  .method2931(i_2216_ & 0xffff, (byte) 1);
			class324.anInterface38_3432
			    = aClass185_Sub1_9817.aClass354_9211
				  .method6267(class186);
			bool = !Class72.method1559(class186.aByte2067,
						   -1768567673);
			class324.aClass433_3430.aFloatArray4853[12]
			    = ((float) (aClass185_Sub1_9817.anInt9264 % 128000)
			       / 1000.0F * (float) class186.aByte2047 / 64.0F
			       % 1.0F);
			class324.aClass433_3430.aFloatArray4853[13]
			    = ((float) (aClass185_Sub1_9817.anInt9264 % 128000)
			       / 1000.0F * (float) class186.aByte2048 / 64.0F
			       % 1.0F);
			if (class186.aClass599_2064 == Class599.aClass599_7868)
			    i_2217_ = class186.aByte2051;
		    } else {
			class324.anInterface38_3432
			    = aClass185_Sub1_9817.anInterface38_9204;
			float[] fs = class324.aClass433_3430.aFloatArray4853;
			class324.aClass433_3430.aFloatArray4853[13] = 0.0F;
			fs[12] = 0.0F;
		    }
		    aClass185_Sub1_9817.method14959(i_2217_);
		    class324.anInt3447 = anIntArray9854[i];
		    class324.anInt3428 = anIntArray9855[i];
		    class324.anInt3449 = i_2214_ * 3;
		    class324.anInt3450 = i_2215_ - i_2214_;
		    class324.method5812(bool);
		}
	    } else {
		aClass185_Sub1_9817
		    .method14733(3, aClass379_9836.anInterface37_3922);
		aClass185_Sub1_9817
		    .method14700(aClass185_Sub1_9817.aClass349_9285);
		Class446 class446_2218_ = aClass185_Sub1_9817.aClass446_9166;
		class446_2218_.method7236(class446);
		class446_2218_.method7243();
		int i = 0;
		if (aClass185_Sub1_9817.aBool9125)
		    aClass185_Sub1_9817.method14648(true);
		else {
		    class324.aClass438_3442.method6997
			(aClass185_Sub1_9817.aFloatArray9197[0],
			 aClass185_Sub1_9817.aFloatArray9197[1],
			 aClass185_Sub1_9817.aFloatArray9197[2]);
		    class324.aClass438_3442.method7059(class446_2218_);
		    class324.aClass438_3443.method6997
			((aClass185_Sub1_9817.aFloat9206
			  * aClass185_Sub1_9817.aFloat9159),
			 (aClass185_Sub1_9817.aFloat9206
			  * aClass185_Sub1_9817.aFloat9292),
			 (aClass185_Sub1_9817.aFloat9206
			  * aClass185_Sub1_9817.aFloat9163));
		    class324.aClass438_3444.method6997
			((-aClass185_Sub1_9817.aFloat9267
			  * aClass185_Sub1_9817.aFloat9159),
			 (-aClass185_Sub1_9817.aFloat9267
			  * aClass185_Sub1_9817.aFloat9292),
			 (-aClass185_Sub1_9817.aFloat9267
			  * aClass185_Sub1_9817.aFloat9163));
		    class324.aClass438_3445.method6997
			((aClass185_Sub1_9817.aFloat9205
			  * aClass185_Sub1_9817.aFloat9159),
			 (aClass185_Sub1_9817.aFloat9205
			  * aClass185_Sub1_9817.aFloat9292),
			 (aClass185_Sub1_9817.aFloat9205
			  * aClass185_Sub1_9817.aFloat9163));
		    if (aClass185_Sub1_9817.anInt9209 > 0) {
			i = aClass185_Sub1_9817.anInt9209;
			Class438 class438 = aClass185_Sub1_9817.aClass438_9151;
			for (int i_2219_ = 0; i_2219_ < i; i_2219_++) {
			    Class534_Sub21 class534_sub21
				= (aClass185_Sub1_9817.aClass534_Sub21Array9208
				   [i_2219_]);
			    int i_2220_
				= class534_sub21.method16201((byte) 63);
			    class438
				.method6992(class534_sub21.aClass438_10529);
			    class438.method7022(class446_2218_);
			    class324.aFloatArray3448[i_2219_ * 4 + 0]
				= class438.aFloat4864;
			    class324.aFloatArray3448[i_2219_ * 4 + 1]
				= class438.aFloat4863;
			    class324.aFloatArray3448[i_2219_ * 4 + 2]
				= class438.aFloat4865;
			    class324.aFloatArray3448[i_2219_ * 4 + 3]
				= 1.0F / (float) (class534_sub21
						      .method16233(-827117320)
						  * (class534_sub21.method16233
						     (-2101782368)));
			    float f = (class534_sub21.method16202(-693604944)
				       / 255.0F);
			    class324.aFloatArray3439[i_2219_ * 4 + 0]
				= (float) (i_2220_ >> 16 & 0xff) * f;
			    class324.aFloatArray3439[i_2219_ * 4 + 1]
				= (float) (i_2220_ >> 8 & 0xff) * f;
			    class324.aFloatArray3439[i_2219_ * 4 + 2]
				= (float) (i_2220_ & 0xff) * f;
			    class324.aFloatArray3439[i_2219_ * 4 + 3] = 1.0F;
			}
		    }
		}
		for (int i_2221_ = 0; i_2221_ < anIntArray9854.length;
		     i_2221_++) {
		    int i_2222_ = anIntArray9827[i_2221_];
		    int i_2223_ = anIntArray9827[i_2221_ + 1];
		    int i_2224_ = aShortArray9830[i_2222_];
		    byte i_2225_ = 11;
		    Class186 class186 = null;
		    byte i_2226_ = 0;
		    if (i_2224_ != -1) {
			class186 = aClass185_Sub1_9817.aClass177_2012
				       .method2931(i_2224_ & 0xffff, (byte) 1);
			class324.anInterface38_3432
			    = aClass185_Sub1_9817.aClass354_9211
				  .method6267(class186);
			i_2225_ = class186.aByte2067;
			class324.method5793(class186.aByte2068);
			class324.aClass433_3430.aFloatArray4853[12]
			    = ((float) (aClass185_Sub1_9817.anInt9264 % 128000)
			       / 1000.0F * (float) class186.aByte2047 / 64.0F
			       % 1.0F);
			class324.aClass433_3430.aFloatArray4853[13]
			    = ((float) (aClass185_Sub1_9817.anInt9264 % 128000)
			       / 1000.0F * (float) class186.aByte2048 / 64.0F
			       % 1.0F);
			if (class186.aClass599_2064 == Class599.aClass599_7868)
			    i_2226_ = class186.aByte2051;
		    } else {
			class324.anInterface38_3432
			    = aClass185_Sub1_9817.anInterface38_9204;
			float[] fs = class324.aClass433_3430.aFloatArray4853;
			class324.aClass433_3430.aFloatArray4853[13] = 0.0F;
			fs[12] = 0.0F;
		    }
		    aClass185_Sub1_9817.method14959(i_2226_);
		    class324.anInt3447 = anIntArray9854[i_2221_];
		    class324.anInt3428 = anIntArray9855[i_2221_];
		    class324.anInt3449 = i_2222_ * 3;
		    class324.anInt3450 = i_2223_ - i_2222_;
		    switch (i_2225_) {
		    case 6:
			class324.method5812(!Class72.method1559(i_2225_,
								-1942661504));
			break;
		    default:
			class324.method5796(i);
			break;
		    case 5:
			if (!aClass185_Sub1_9817.aBool9125) {
			    Class348_Sub1_Sub1 class348_sub1_sub1
				= aClass185_Sub1_9817.aClass348_Sub1_Sub1_9237;
			    class348_sub1_sub1.method17975(class186.aByte2068,
							   (class186.anInt2069
							    * 1880963453),
							   (byte) 119);
			    class348_sub1_sub1.aClass433_11448
				.method6916(class446);
			    class348_sub1_sub1.aClass433_11437
				.method6916(class446);
			    class348_sub1_sub1.aClass433_11437.method6839
				(aClass185_Sub1_9817.aClass433_9164);
			    class348_sub1_sub1.anInt11451
				= anIntArray9854[i_2221_] * -89724309;
			    class348_sub1_sub1.anInt11452
				= anIntArray9855[i_2221_] * -890917363;
			    class348_sub1_sub1.anInt11453
				= i_2222_ * -1012786239;
			    class348_sub1_sub1.anInt11443
				= (i_2223_ - i_2222_) * -694101341;
			    class348_sub1_sub1.method17976(216015837);
			} else
			    class324.method5796(i);
			break;
		    case 7:
			class324.aClass438_3433.method6997
			    ((aClass185_Sub1_9817.aClass433_9118
			      .aFloatArray4853[12]),
			     (aClass185_Sub1_9817.aClass433_9118
			      .aFloatArray4853[13]),
			     (aClass185_Sub1_9817.aClass433_9118
			      .aFloatArray4853[14]));
			class324.aClass438_3433.method7022(class446_2218_);
			class324.aClass433_3446.method6916(class446);
			class324.anInterface41_3434
			    = aClass185_Sub1_9817.method14616();
			class324.method5805(i);
			break;
		    case 1:
			class324.aClass438_3433.method6997
			    ((aClass185_Sub1_9817.aClass433_9118
			      .aFloatArray4853[12]),
			     (aClass185_Sub1_9817.aClass433_9118
			      .aFloatArray4853[13]),
			     (aClass185_Sub1_9817.aClass433_9118
			      .aFloatArray4853[14]));
			class324.aClass438_3433.method7022(class446_2218_);
			class324.method5810(i);
		    }
		}
	    }
	    method15503();
	}
    }
    
    void method15541() {
	if (aClass335_9833 != null)
	    aClass335_9833.aBool3516 = false;
    }
    
    boolean method15542(int i, int i_2227_, int i_2228_, int i_2229_,
			Class446 class446, boolean bool, int i_2230_) {
	Class433 class433 = aClass185_Sub1_9817.aClass433_9194;
	class433.method6916(class446);
	class433.method6839(aClass185_Sub1_9817.aClass433_9284);
	boolean bool_2231_ = false;
	float f = 3.4028235E38F;
	float f_2232_ = -3.4028235E38F;
	float f_2233_ = 3.4028235E38F;
	float f_2234_ = -3.4028235E38F;
	if (!aBool9850)
	    method15507();
	int i_2235_ = anInt9848 - anInt9865 >> 1;
	int i_2236_ = anInt9846 - anInt9799 >> 1;
	int i_2237_ = anInt9866 - anInt9849 >> 1;
	int i_2238_ = anInt9865 + i_2235_;
	int i_2239_ = anInt9799 + i_2236_;
	int i_2240_ = anInt9849 + i_2237_;
	int i_2241_ = i_2238_ - (i_2235_ << i_2230_);
	int i_2242_ = i_2239_ - (i_2236_ << i_2230_);
	int i_2243_ = i_2240_ - (i_2237_ << i_2230_);
	int i_2244_ = i_2238_ + (i_2235_ << i_2230_);
	int i_2245_ = i_2239_ + (i_2236_ << i_2230_);
	int i_2246_ = i_2240_ + (i_2237_ << i_2230_);
	anIntArray9852[0] = i_2241_;
	anIntArray9811[0] = i_2242_;
	anIntArray9857[0] = i_2243_;
	anIntArray9852[1] = i_2244_;
	anIntArray9811[1] = i_2242_;
	anIntArray9857[1] = i_2243_;
	anIntArray9852[2] = i_2241_;
	anIntArray9811[2] = i_2245_;
	anIntArray9857[2] = i_2243_;
	anIntArray9852[3] = i_2244_;
	anIntArray9811[3] = i_2245_;
	anIntArray9857[3] = i_2243_;
	anIntArray9852[4] = i_2241_;
	anIntArray9811[4] = i_2242_;
	anIntArray9857[4] = i_2246_;
	anIntArray9852[5] = i_2244_;
	anIntArray9811[5] = i_2242_;
	anIntArray9857[5] = i_2246_;
	anIntArray9852[6] = i_2241_;
	anIntArray9811[6] = i_2245_;
	anIntArray9857[6] = i_2246_;
	anIntArray9852[7] = i_2244_;
	anIntArray9811[7] = i_2245_;
	anIntArray9857[7] = i_2246_;
	for (int i_2247_ = 0; i_2247_ < 8; i_2247_++) {
	    float f_2248_ = (float) anIntArray9852[i_2247_];
	    float f_2249_ = (float) anIntArray9811[i_2247_];
	    float f_2250_ = (float) anIntArray9857[i_2247_];
	    float f_2251_ = (class433.aFloatArray4853[2] * f_2248_
			     + class433.aFloatArray4853[6] * f_2249_
			     + class433.aFloatArray4853[10] * f_2250_
			     + class433.aFloatArray4853[14]);
	    float f_2252_ = (class433.aFloatArray4853[3] * f_2248_
			     + class433.aFloatArray4853[7] * f_2249_
			     + class433.aFloatArray4853[11] * f_2250_
			     + class433.aFloatArray4853[15]);
	    if (f_2251_ >= -f_2252_) {
		float f_2253_ = (class433.aFloatArray4853[0] * f_2248_
				 + class433.aFloatArray4853[4] * f_2249_
				 + class433.aFloatArray4853[8] * f_2250_
				 + class433.aFloatArray4853[12]);
		float f_2254_ = (class433.aFloatArray4853[1] * f_2248_
				 + class433.aFloatArray4853[5] * f_2249_
				 + class433.aFloatArray4853[9] * f_2250_
				 + class433.aFloatArray4853[13]);
		float f_2255_
		    = (aClass185_Sub1_9817.aFloat9257
		       + aClass185_Sub1_9817.aFloat9167 * f_2253_ / f_2252_);
		float f_2256_
		    = (aClass185_Sub1_9817.aFloat9168
		       + aClass185_Sub1_9817.aFloat9169 * f_2254_ / f_2252_);
		if (f_2255_ < f)
		    f = f_2255_;
		if (f_2255_ > f_2232_)
		    f_2232_ = f_2255_;
		if (f_2256_ < f_2233_)
		    f_2233_ = f_2256_;
		if (f_2256_ > f_2234_)
		    f_2234_ = f_2256_;
		bool_2231_ = true;
	    }
	}
	int i_2257_ = i + i_2228_;
	int i_2258_ = i_2227_ + i_2229_;
	if (bool_2231_ && (float) i_2257_ > f && (float) i < f_2232_
	    && (float) i_2258_ > f_2233_ && (float) i_2227_ < f_2234_) {
	    if (bool)
		return true;
	    if (anIntArray9820.length < anInt9813) {
		anIntArray9820 = new int[anInt9813];
		anIntArray9867 = new int[anInt9813];
	    }
	    for (int i_2259_ = 0; i_2259_ < anInt9807; i_2259_++) {
		float f_2260_ = (float) anIntArray9808[i_2259_];
		float f_2261_ = (float) anIntArray9809[i_2259_];
		float f_2262_ = (float) anIntArray9828[i_2259_];
		float f_2263_ = (class433.aFloatArray4853[2] * f_2260_
				 + class433.aFloatArray4853[6] * f_2261_
				 + class433.aFloatArray4853[10] * f_2262_
				 + class433.aFloatArray4853[14]);
		float f_2264_ = (class433.aFloatArray4853[3] * f_2260_
				 + class433.aFloatArray4853[7] * f_2261_
				 + class433.aFloatArray4853[11] * f_2262_
				 + class433.aFloatArray4853[15]);
		if (f_2263_ >= -f_2264_) {
		    float f_2265_ = (class433.aFloatArray4853[0] * f_2260_
				     + class433.aFloatArray4853[4] * f_2261_
				     + class433.aFloatArray4853[8] * f_2262_
				     + class433.aFloatArray4853[12]);
		    float f_2266_ = (class433.aFloatArray4853[1] * f_2260_
				     + class433.aFloatArray4853[5] * f_2261_
				     + class433.aFloatArray4853[9] * f_2262_
				     + class433.aFloatArray4853[13]);
		    int i_2267_ = anIntArray9853[i_2259_];
		    int i_2268_ = anIntArray9853[i_2259_ + 1];
		    for (int i_2269_ = i_2267_;
			 i_2269_ < i_2268_ && aShortArray9863[i_2269_] != 0;
			 i_2269_++) {
			int i_2270_ = (aShortArray9863[i_2269_] & 0xffff) - 1;
			anIntArray9820[i_2270_]
			    = (int) (aClass185_Sub1_9817.aFloat9257
				     + (aClass185_Sub1_9817.aFloat9167
					* f_2265_ / f_2264_));
			anIntArray9867[i_2270_]
			    = (int) (aClass185_Sub1_9817.aFloat9168
				     + (aClass185_Sub1_9817.aFloat9169
					* f_2266_ / f_2264_));
		    }
		} else {
		    int i_2271_ = anIntArray9853[i_2259_];
		    int i_2272_ = anIntArray9853[i_2259_ + 1];
		    for (int i_2273_ = i_2271_;
			 i_2273_ < i_2272_ && aShortArray9863[i_2273_] != 0;
			 i_2273_++) {
			int i_2274_ = (aShortArray9863[i_2273_] & 0xffff) - 1;
			anIntArray9820[i_2274_] = -999999;
		    }
		}
	    }
	    for (int i_2275_ = 0; i_2275_ < anInt9823; i_2275_++) {
		if ((anIntArray9820[aShortArray9847[i_2275_] & 0xffff]
		     != -999999)
		    && (anIntArray9820[aShortArray9845[i_2275_] & 0xffff]
			!= -999999)
		    && (anIntArray9820[aShortArray9843[i_2275_] & 0xffff]
			!= -999999)
		    && (method15512
			(i, i_2227_, i_2257_, i_2258_,
			 anIntArray9867[aShortArray9847[i_2275_] & 0xffff],
			 anIntArray9867[aShortArray9845[i_2275_] & 0xffff],
			 anIntArray9867[aShortArray9843[i_2275_] & 0xffff],
			 anIntArray9820[aShortArray9847[i_2275_] & 0xffff],
			 anIntArray9820[aShortArray9845[i_2275_] & 0xffff],
			 anIntArray9820[aShortArray9843[i_2275_] & 0xffff])))
		    return true;
	    }
	}
	return false;
    }
    
    void method15543() {
	if (aClass335_9833 != null)
	    aClass335_9833.aBool3516 = false;
    }
    
    void method15544() {
	int i = 32767;
	int i_2276_ = 32767;
	int i_2277_ = 32767;
	int i_2278_ = -32768;
	int i_2279_ = -32768;
	int i_2280_ = -32768;
	int i_2281_ = 0;
	int i_2282_ = 0;
	for (int i_2283_ = 0; i_2283_ < anInt9807; i_2283_++) {
	    int i_2284_ = anIntArray9808[i_2283_];
	    int i_2285_ = anIntArray9809[i_2283_];
	    int i_2286_ = anIntArray9828[i_2283_];
	    if (i_2284_ < i)
		i = i_2284_;
	    if (i_2284_ > i_2278_)
		i_2278_ = i_2284_;
	    if (i_2285_ < i_2276_)
		i_2276_ = i_2285_;
	    if (i_2285_ > i_2279_)
		i_2279_ = i_2285_;
	    if (i_2286_ < i_2277_)
		i_2277_ = i_2286_;
	    if (i_2286_ > i_2280_)
		i_2280_ = i_2286_;
	    int i_2287_ = i_2284_ * i_2284_ + i_2286_ * i_2286_;
	    if (i_2287_ > i_2281_)
		i_2281_ = i_2287_;
	    i_2287_
		= i_2284_ * i_2284_ + i_2286_ * i_2286_ + i_2285_ * i_2285_;
	    if (i_2287_ > i_2282_)
		i_2282_ = i_2287_;
	}
	anInt9865 = i;
	anInt9848 = i_2278_;
	anInt9799 = i_2276_;
	anInt9846 = i_2279_;
	anInt9849 = i_2277_;
	anInt9866 = i_2280_;
	anInt9868 = (int) (Math.sqrt((double) i_2281_) + 0.99);
	anInt9842 = (int) (Math.sqrt((double) i_2282_) + 0.99);
	aBool9850 = true;
    }
    
    boolean method15545(int i, int i_2288_, int i_2289_, int i_2290_,
			Class446 class446, boolean bool, int i_2291_) {
	Class433 class433 = aClass185_Sub1_9817.aClass433_9194;
	class433.method6916(class446);
	class433.method6839(aClass185_Sub1_9817.aClass433_9284);
	boolean bool_2292_ = false;
	float f = 3.4028235E38F;
	float f_2293_ = -3.4028235E38F;
	float f_2294_ = 3.4028235E38F;
	float f_2295_ = -3.4028235E38F;
	if (!aBool9850)
	    method15507();
	int i_2296_ = anInt9848 - anInt9865 >> 1;
	int i_2297_ = anInt9846 - anInt9799 >> 1;
	int i_2298_ = anInt9866 - anInt9849 >> 1;
	int i_2299_ = anInt9865 + i_2296_;
	int i_2300_ = anInt9799 + i_2297_;
	int i_2301_ = anInt9849 + i_2298_;
	int i_2302_ = i_2299_ - (i_2296_ << i_2291_);
	int i_2303_ = i_2300_ - (i_2297_ << i_2291_);
	int i_2304_ = i_2301_ - (i_2298_ << i_2291_);
	int i_2305_ = i_2299_ + (i_2296_ << i_2291_);
	int i_2306_ = i_2300_ + (i_2297_ << i_2291_);
	int i_2307_ = i_2301_ + (i_2298_ << i_2291_);
	anIntArray9852[0] = i_2302_;
	anIntArray9811[0] = i_2303_;
	anIntArray9857[0] = i_2304_;
	anIntArray9852[1] = i_2305_;
	anIntArray9811[1] = i_2303_;
	anIntArray9857[1] = i_2304_;
	anIntArray9852[2] = i_2302_;
	anIntArray9811[2] = i_2306_;
	anIntArray9857[2] = i_2304_;
	anIntArray9852[3] = i_2305_;
	anIntArray9811[3] = i_2306_;
	anIntArray9857[3] = i_2304_;
	anIntArray9852[4] = i_2302_;
	anIntArray9811[4] = i_2303_;
	anIntArray9857[4] = i_2307_;
	anIntArray9852[5] = i_2305_;
	anIntArray9811[5] = i_2303_;
	anIntArray9857[5] = i_2307_;
	anIntArray9852[6] = i_2302_;
	anIntArray9811[6] = i_2306_;
	anIntArray9857[6] = i_2307_;
	anIntArray9852[7] = i_2305_;
	anIntArray9811[7] = i_2306_;
	anIntArray9857[7] = i_2307_;
	for (int i_2308_ = 0; i_2308_ < 8; i_2308_++) {
	    float f_2309_ = (float) anIntArray9852[i_2308_];
	    float f_2310_ = (float) anIntArray9811[i_2308_];
	    float f_2311_ = (float) anIntArray9857[i_2308_];
	    float f_2312_ = (class433.aFloatArray4853[2] * f_2309_
			     + class433.aFloatArray4853[6] * f_2310_
			     + class433.aFloatArray4853[10] * f_2311_
			     + class433.aFloatArray4853[14]);
	    float f_2313_ = (class433.aFloatArray4853[3] * f_2309_
			     + class433.aFloatArray4853[7] * f_2310_
			     + class433.aFloatArray4853[11] * f_2311_
			     + class433.aFloatArray4853[15]);
	    if (f_2312_ >= -f_2313_) {
		float f_2314_ = (class433.aFloatArray4853[0] * f_2309_
				 + class433.aFloatArray4853[4] * f_2310_
				 + class433.aFloatArray4853[8] * f_2311_
				 + class433.aFloatArray4853[12]);
		float f_2315_ = (class433.aFloatArray4853[1] * f_2309_
				 + class433.aFloatArray4853[5] * f_2310_
				 + class433.aFloatArray4853[9] * f_2311_
				 + class433.aFloatArray4853[13]);
		float f_2316_
		    = (aClass185_Sub1_9817.aFloat9257
		       + aClass185_Sub1_9817.aFloat9167 * f_2314_ / f_2313_);
		float f_2317_
		    = (aClass185_Sub1_9817.aFloat9168
		       + aClass185_Sub1_9817.aFloat9169 * f_2315_ / f_2313_);
		if (f_2316_ < f)
		    f = f_2316_;
		if (f_2316_ > f_2293_)
		    f_2293_ = f_2316_;
		if (f_2317_ < f_2294_)
		    f_2294_ = f_2317_;
		if (f_2317_ > f_2295_)
		    f_2295_ = f_2317_;
		bool_2292_ = true;
	    }
	}
	int i_2318_ = i + i_2289_;
	int i_2319_ = i_2288_ + i_2290_;
	if (bool_2292_ && (float) i_2318_ > f && (float) i < f_2293_
	    && (float) i_2319_ > f_2294_ && (float) i_2288_ < f_2295_) {
	    if (bool)
		return true;
	    if (anIntArray9820.length < anInt9813) {
		anIntArray9820 = new int[anInt9813];
		anIntArray9867 = new int[anInt9813];
	    }
	    for (int i_2320_ = 0; i_2320_ < anInt9807; i_2320_++) {
		float f_2321_ = (float) anIntArray9808[i_2320_];
		float f_2322_ = (float) anIntArray9809[i_2320_];
		float f_2323_ = (float) anIntArray9828[i_2320_];
		float f_2324_ = (class433.aFloatArray4853[2] * f_2321_
				 + class433.aFloatArray4853[6] * f_2322_
				 + class433.aFloatArray4853[10] * f_2323_
				 + class433.aFloatArray4853[14]);
		float f_2325_ = (class433.aFloatArray4853[3] * f_2321_
				 + class433.aFloatArray4853[7] * f_2322_
				 + class433.aFloatArray4853[11] * f_2323_
				 + class433.aFloatArray4853[15]);
		if (f_2324_ >= -f_2325_) {
		    float f_2326_ = (class433.aFloatArray4853[0] * f_2321_
				     + class433.aFloatArray4853[4] * f_2322_
				     + class433.aFloatArray4853[8] * f_2323_
				     + class433.aFloatArray4853[12]);
		    float f_2327_ = (class433.aFloatArray4853[1] * f_2321_
				     + class433.aFloatArray4853[5] * f_2322_
				     + class433.aFloatArray4853[9] * f_2323_
				     + class433.aFloatArray4853[13]);
		    int i_2328_ = anIntArray9853[i_2320_];
		    int i_2329_ = anIntArray9853[i_2320_ + 1];
		    for (int i_2330_ = i_2328_;
			 i_2330_ < i_2329_ && aShortArray9863[i_2330_] != 0;
			 i_2330_++) {
			int i_2331_ = (aShortArray9863[i_2330_] & 0xffff) - 1;
			anIntArray9820[i_2331_]
			    = (int) (aClass185_Sub1_9817.aFloat9257
				     + (aClass185_Sub1_9817.aFloat9167
					* f_2326_ / f_2325_));
			anIntArray9867[i_2331_]
			    = (int) (aClass185_Sub1_9817.aFloat9168
				     + (aClass185_Sub1_9817.aFloat9169
					* f_2327_ / f_2325_));
		    }
		} else {
		    int i_2332_ = anIntArray9853[i_2320_];
		    int i_2333_ = anIntArray9853[i_2320_ + 1];
		    for (int i_2334_ = i_2332_;
			 i_2334_ < i_2333_ && aShortArray9863[i_2334_] != 0;
			 i_2334_++) {
			int i_2335_ = (aShortArray9863[i_2334_] & 0xffff) - 1;
			anIntArray9820[i_2335_] = -999999;
		    }
		}
	    }
	    for (int i_2336_ = 0; i_2336_ < anInt9823; i_2336_++) {
		if ((anIntArray9820[aShortArray9847[i_2336_] & 0xffff]
		     != -999999)
		    && (anIntArray9820[aShortArray9845[i_2336_] & 0xffff]
			!= -999999)
		    && (anIntArray9820[aShortArray9843[i_2336_] & 0xffff]
			!= -999999)
		    && (method15512
			(i, i_2288_, i_2318_, i_2319_,
			 anIntArray9867[aShortArray9847[i_2336_] & 0xffff],
			 anIntArray9867[aShortArray9845[i_2336_] & 0xffff],
			 anIntArray9867[aShortArray9843[i_2336_] & 0xffff],
			 anIntArray9820[aShortArray9847[i_2336_] & 0xffff],
			 anIntArray9820[aShortArray9845[i_2336_] & 0xffff],
			 anIntArray9820[aShortArray9843[i_2336_] & 0xffff])))
		    return true;
	    }
	}
	return false;
    }
    
    boolean method15546(int i, int i_2337_, int i_2338_, int i_2339_,
			Class446 class446, boolean bool, int i_2340_) {
	Class433 class433 = aClass185_Sub1_9817.aClass433_9194;
	class433.method6916(class446);
	class433.method6839(aClass185_Sub1_9817.aClass433_9284);
	boolean bool_2341_ = false;
	float f = 3.4028235E38F;
	float f_2342_ = -3.4028235E38F;
	float f_2343_ = 3.4028235E38F;
	float f_2344_ = -3.4028235E38F;
	if (!aBool9850)
	    method15507();
	int i_2345_ = anInt9848 - anInt9865 >> 1;
	int i_2346_ = anInt9846 - anInt9799 >> 1;
	int i_2347_ = anInt9866 - anInt9849 >> 1;
	int i_2348_ = anInt9865 + i_2345_;
	int i_2349_ = anInt9799 + i_2346_;
	int i_2350_ = anInt9849 + i_2347_;
	int i_2351_ = i_2348_ - (i_2345_ << i_2340_);
	int i_2352_ = i_2349_ - (i_2346_ << i_2340_);
	int i_2353_ = i_2350_ - (i_2347_ << i_2340_);
	int i_2354_ = i_2348_ + (i_2345_ << i_2340_);
	int i_2355_ = i_2349_ + (i_2346_ << i_2340_);
	int i_2356_ = i_2350_ + (i_2347_ << i_2340_);
	anIntArray9852[0] = i_2351_;
	anIntArray9811[0] = i_2352_;
	anIntArray9857[0] = i_2353_;
	anIntArray9852[1] = i_2354_;
	anIntArray9811[1] = i_2352_;
	anIntArray9857[1] = i_2353_;
	anIntArray9852[2] = i_2351_;
	anIntArray9811[2] = i_2355_;
	anIntArray9857[2] = i_2353_;
	anIntArray9852[3] = i_2354_;
	anIntArray9811[3] = i_2355_;
	anIntArray9857[3] = i_2353_;
	anIntArray9852[4] = i_2351_;
	anIntArray9811[4] = i_2352_;
	anIntArray9857[4] = i_2356_;
	anIntArray9852[5] = i_2354_;
	anIntArray9811[5] = i_2352_;
	anIntArray9857[5] = i_2356_;
	anIntArray9852[6] = i_2351_;
	anIntArray9811[6] = i_2355_;
	anIntArray9857[6] = i_2356_;
	anIntArray9852[7] = i_2354_;
	anIntArray9811[7] = i_2355_;
	anIntArray9857[7] = i_2356_;
	for (int i_2357_ = 0; i_2357_ < 8; i_2357_++) {
	    float f_2358_ = (float) anIntArray9852[i_2357_];
	    float f_2359_ = (float) anIntArray9811[i_2357_];
	    float f_2360_ = (float) anIntArray9857[i_2357_];
	    float f_2361_ = (class433.aFloatArray4853[2] * f_2358_
			     + class433.aFloatArray4853[6] * f_2359_
			     + class433.aFloatArray4853[10] * f_2360_
			     + class433.aFloatArray4853[14]);
	    float f_2362_ = (class433.aFloatArray4853[3] * f_2358_
			     + class433.aFloatArray4853[7] * f_2359_
			     + class433.aFloatArray4853[11] * f_2360_
			     + class433.aFloatArray4853[15]);
	    if (f_2361_ >= -f_2362_) {
		float f_2363_ = (class433.aFloatArray4853[0] * f_2358_
				 + class433.aFloatArray4853[4] * f_2359_
				 + class433.aFloatArray4853[8] * f_2360_
				 + class433.aFloatArray4853[12]);
		float f_2364_ = (class433.aFloatArray4853[1] * f_2358_
				 + class433.aFloatArray4853[5] * f_2359_
				 + class433.aFloatArray4853[9] * f_2360_
				 + class433.aFloatArray4853[13]);
		float f_2365_
		    = (aClass185_Sub1_9817.aFloat9257
		       + aClass185_Sub1_9817.aFloat9167 * f_2363_ / f_2362_);
		float f_2366_
		    = (aClass185_Sub1_9817.aFloat9168
		       + aClass185_Sub1_9817.aFloat9169 * f_2364_ / f_2362_);
		if (f_2365_ < f)
		    f = f_2365_;
		if (f_2365_ > f_2342_)
		    f_2342_ = f_2365_;
		if (f_2366_ < f_2343_)
		    f_2343_ = f_2366_;
		if (f_2366_ > f_2344_)
		    f_2344_ = f_2366_;
		bool_2341_ = true;
	    }
	}
	int i_2367_ = i + i_2338_;
	int i_2368_ = i_2337_ + i_2339_;
	if (bool_2341_ && (float) i_2367_ > f && (float) i < f_2342_
	    && (float) i_2368_ > f_2343_ && (float) i_2337_ < f_2344_) {
	    if (bool)
		return true;
	    if (anIntArray9820.length < anInt9813) {
		anIntArray9820 = new int[anInt9813];
		anIntArray9867 = new int[anInt9813];
	    }
	    for (int i_2369_ = 0; i_2369_ < anInt9807; i_2369_++) {
		float f_2370_ = (float) anIntArray9808[i_2369_];
		float f_2371_ = (float) anIntArray9809[i_2369_];
		float f_2372_ = (float) anIntArray9828[i_2369_];
		float f_2373_ = (class433.aFloatArray4853[2] * f_2370_
				 + class433.aFloatArray4853[6] * f_2371_
				 + class433.aFloatArray4853[10] * f_2372_
				 + class433.aFloatArray4853[14]);
		float f_2374_ = (class433.aFloatArray4853[3] * f_2370_
				 + class433.aFloatArray4853[7] * f_2371_
				 + class433.aFloatArray4853[11] * f_2372_
				 + class433.aFloatArray4853[15]);
		if (f_2373_ >= -f_2374_) {
		    float f_2375_ = (class433.aFloatArray4853[0] * f_2370_
				     + class433.aFloatArray4853[4] * f_2371_
				     + class433.aFloatArray4853[8] * f_2372_
				     + class433.aFloatArray4853[12]);
		    float f_2376_ = (class433.aFloatArray4853[1] * f_2370_
				     + class433.aFloatArray4853[5] * f_2371_
				     + class433.aFloatArray4853[9] * f_2372_
				     + class433.aFloatArray4853[13]);
		    int i_2377_ = anIntArray9853[i_2369_];
		    int i_2378_ = anIntArray9853[i_2369_ + 1];
		    for (int i_2379_ = i_2377_;
			 i_2379_ < i_2378_ && aShortArray9863[i_2379_] != 0;
			 i_2379_++) {
			int i_2380_ = (aShortArray9863[i_2379_] & 0xffff) - 1;
			anIntArray9820[i_2380_]
			    = (int) (aClass185_Sub1_9817.aFloat9257
				     + (aClass185_Sub1_9817.aFloat9167
					* f_2375_ / f_2374_));
			anIntArray9867[i_2380_]
			    = (int) (aClass185_Sub1_9817.aFloat9168
				     + (aClass185_Sub1_9817.aFloat9169
					* f_2376_ / f_2374_));
		    }
		} else {
		    int i_2381_ = anIntArray9853[i_2369_];
		    int i_2382_ = anIntArray9853[i_2369_ + 1];
		    for (int i_2383_ = i_2381_;
			 i_2383_ < i_2382_ && aShortArray9863[i_2383_] != 0;
			 i_2383_++) {
			int i_2384_ = (aShortArray9863[i_2383_] & 0xffff) - 1;
			anIntArray9820[i_2384_] = -999999;
		    }
		}
	    }
	    for (int i_2385_ = 0; i_2385_ < anInt9823; i_2385_++) {
		if ((anIntArray9820[aShortArray9847[i_2385_] & 0xffff]
		     != -999999)
		    && (anIntArray9820[aShortArray9845[i_2385_] & 0xffff]
			!= -999999)
		    && (anIntArray9820[aShortArray9843[i_2385_] & 0xffff]
			!= -999999)
		    && (method15512
			(i, i_2337_, i_2367_, i_2368_,
			 anIntArray9867[aShortArray9847[i_2385_] & 0xffff],
			 anIntArray9867[aShortArray9845[i_2385_] & 0xffff],
			 anIntArray9867[aShortArray9843[i_2385_] & 0xffff],
			 anIntArray9820[aShortArray9847[i_2385_] & 0xffff],
			 anIntArray9820[aShortArray9845[i_2385_] & 0xffff],
			 anIntArray9820[aShortArray9843[i_2385_] & 0xffff])))
		    return true;
	    }
	}
	return false;
    }
    
    public int method3045() {
	if (!aBool9850)
	    method15507();
	return anInt9799;
    }
    
    boolean method15547(int i, int i_2386_, int i_2387_, int i_2388_,
			int i_2389_, int i_2390_, int i_2391_, int i_2392_,
			int i_2393_, int i_2394_) {
	if (i_2388_ < i_2389_ && i_2388_ < i_2390_ && i_2388_ < i_2391_)
	    return false;
	if (i_2386_ > i_2389_ && i_2386_ > i_2390_ && i_2386_ > i_2391_)
	    return false;
	if (i_2387_ < i_2392_ && i_2387_ < i_2393_ && i_2387_ < i_2394_)
	    return false;
	if (i > i_2392_ && i > i_2393_ && i > i_2394_)
	    return false;
	return true;
    }
    
    public void method3056(short i, short i_2395_) {
	for (int i_2396_ = 0; i_2396_ < anInt9823; i_2396_++) {
	    if (aShortArray9825[i_2396_] == i)
		aShortArray9825[i_2396_] = i_2395_;
	}
	if (aClass368Array9861 != null) {
	    for (int i_2397_ = 0; i_2397_ < anInt9860; i_2397_++) {
		Class368 class368 = aClass368Array9861[i_2397_];
		Class339 class339 = aClass339Array9862[i_2397_];
		class339.anInt3539
		    = (class339.anInt3539 & ~0xffffff
		       | ((Class661.anIntArray8549
			   [aShortArray9825[class368.anInt3860] & 0xffff])
			  & 0xffffff));
	    }
	}
	method15504();
    }
    
    void method3107() {
	for (int i = 0; i < anInt9806; i++) {
	    anIntArray9808[i] = anIntArray9808[i] + 7 >> 4;
	    anIntArray9809[i] = anIntArray9809[i] + 7 >> 4;
	    anIntArray9828[i] = anIntArray9828[i] + 7 >> 4;
	}
	method15509();
	aBool9850 = false;
    }
    
    public int method3130() {
	if (!aBool9850)
	    method15507();
	return anInt9842;
    }
    
    void method15548() {
	if (aClass379_9834 != null)
	    aClass379_9834.method6423();
	if (aClass379_9837 != null)
	    aClass379_9837.method6423();
	if (aClass379_9835 != null)
	    aClass379_9835.method6423();
	if (aClass379_9836 != null)
	    aClass379_9836.method6423();
	if (aClass335_9833 != null)
	    aClass335_9833.method5899();
    }
    
    public int method3144() {
	if (!aBool9851)
	    method3050();
	return anInt9844;
    }
    
    void method15549(Class446 class446) {
	if (anInt9824 != 0 && (method15517() && method15553())) {
	    if (aClass345_9875 == null) {
		/* empty */
	    }
	    aClass185_Sub1_9817.method14712();
	    aClass185_Sub1_9817.method14605();
	    Class324 class324 = aClass185_Sub1_9817.aClass324_9158;
	    aClass185_Sub1_9817.method14733(0,
					    aClass379_9834.anInterface37_3922);
	    aClass185_Sub1_9817.method14733(1,
					    aClass379_9835.anInterface37_3922);
	    aClass185_Sub1_9817.method14733(2,
					    aClass379_9837.anInterface37_3922);
	    aClass185_Sub1_9817.method14701(aClass335_9833.anInterface39_3515);
	    aClass185_Sub1_9817.aClass433_9194.method6916(class446);
	    class324.method5794(aClass185_Sub1_9817.aClass433_9194);
	    class324.aClass433_3430.method6840();
	    if (aClass185_Sub1_9817.aBool9231) {
		Class166 class166 = aClass185_Sub1_9817.method14685();
		class324.aClass441_3438.method7105
		    (0.0F, 1.0F, 0.0F, (float) -aClass185_Sub1_9817.anInt9247);
		class324.aClass441_3438.method7110(3.0F
						   / (float) ((class166
							       .anInt1762)
							      * -1095140607));
		class324.aClass438_3431.method6997
		    (((float) (class166.anInt1763 * 2113275141 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (class166.anInt1763 * 2113275141 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (class166.anInt1763 * 2113275141 >> 0 & 0xff)
		      / 255.0F));
	    } else {
		class324.aClass441_3438.method7105(0.0F, 0.0F, 0.0F, 0.0F);
		class324.aClass438_3431.method6997(0.0F, 0.0F, 0.0F);
	    }
	    if (aClass185_Sub1_9817.anInt9252 > 0) {
		class324.aClass441_3440.method7105(0.0F, 0.0F, 1.0F,
						   -(aClass185_Sub1_9817
						     .aFloat9254));
		class324.aClass438_3435.method6997
		    (((float) (aClass185_Sub1_9817.anInt9251 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (aClass185_Sub1_9817.anInt9251 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (aClass185_Sub1_9817.anInt9251 >> 0 & 0xff)
		      / 255.0F));
		aClass185_Sub1_9817.aClass433_9194.method6916(class446);
		aClass185_Sub1_9817.aClass433_9194.method6867();
		class324.aClass441_3438
		    .method7111(aClass185_Sub1_9817.aClass433_9194);
		aClass185_Sub1_9817.aClass433_9194.method6916(class446);
		aClass185_Sub1_9817.aClass433_9194
		    .method6839(aClass185_Sub1_9817.aClass433_9142);
		aClass185_Sub1_9817.aClass433_9194.method6867();
		class324.aClass441_3440
		    .method7111(aClass185_Sub1_9817.aClass433_9194);
		class324.aClass441_3440.method7110
		    (1.0F / (aClass185_Sub1_9817.aFloat9255
			     - aClass185_Sub1_9817.aFloat9254));
	    } else {
		class324.aClass441_3440.method7105(0.0F, 0.0F, 0.0F, 0.0F);
		class324.aClass438_3435.method6997(0.0F, 0.0F, 0.0F);
	    }
	    if ((anInt9872 & 0x37) == 0) {
		aClass185_Sub1_9817
		    .method14700(aClass185_Sub1_9817.aClass349_9216);
		if (aClass185_Sub1_9817.aBool9125)
		    aClass185_Sub1_9817.method14648(false);
		for (int i = 0; i < anIntArray9854.length; i++) {
		    int i_2398_ = anIntArray9827[i];
		    int i_2399_ = anIntArray9827[i + 1];
		    int i_2400_ = aShortArray9830[i_2398_];
		    boolean bool = false;
		    byte i_2401_ = 0;
		    if (i_2400_ != -1) {
			Class186 class186
			    = aClass185_Sub1_9817.aClass177_2012
				  .method2931(i_2400_ & 0xffff, (byte) 1);
			class324.anInterface38_3432
			    = aClass185_Sub1_9817.aClass354_9211
				  .method6267(class186);
			bool = !Class72.method1559(class186.aByte2067,
						   -1821407670);
			class324.aClass433_3430.aFloatArray4853[12]
			    = ((float) (aClass185_Sub1_9817.anInt9264 % 128000)
			       / 1000.0F * (float) class186.aByte2047 / 64.0F
			       % 1.0F);
			class324.aClass433_3430.aFloatArray4853[13]
			    = ((float) (aClass185_Sub1_9817.anInt9264 % 128000)
			       / 1000.0F * (float) class186.aByte2048 / 64.0F
			       % 1.0F);
			if (class186.aClass599_2064 == Class599.aClass599_7868)
			    i_2401_ = class186.aByte2051;
		    } else {
			class324.anInterface38_3432
			    = aClass185_Sub1_9817.anInterface38_9204;
			float[] fs = class324.aClass433_3430.aFloatArray4853;
			class324.aClass433_3430.aFloatArray4853[13] = 0.0F;
			fs[12] = 0.0F;
		    }
		    aClass185_Sub1_9817.method14959(i_2401_);
		    class324.anInt3447 = anIntArray9854[i];
		    class324.anInt3428 = anIntArray9855[i];
		    class324.anInt3449 = i_2398_ * 3;
		    class324.anInt3450 = i_2399_ - i_2398_;
		    class324.method5812(bool);
		}
	    } else {
		aClass185_Sub1_9817
		    .method14733(3, aClass379_9836.anInterface37_3922);
		aClass185_Sub1_9817
		    .method14700(aClass185_Sub1_9817.aClass349_9285);
		Class446 class446_2402_ = aClass185_Sub1_9817.aClass446_9166;
		class446_2402_.method7236(class446);
		class446_2402_.method7243();
		int i = 0;
		if (aClass185_Sub1_9817.aBool9125)
		    aClass185_Sub1_9817.method14648(true);
		else {
		    class324.aClass438_3442.method6997
			(aClass185_Sub1_9817.aFloatArray9197[0],
			 aClass185_Sub1_9817.aFloatArray9197[1],
			 aClass185_Sub1_9817.aFloatArray9197[2]);
		    class324.aClass438_3442.method7059(class446_2402_);
		    class324.aClass438_3443.method6997
			((aClass185_Sub1_9817.aFloat9206
			  * aClass185_Sub1_9817.aFloat9159),
			 (aClass185_Sub1_9817.aFloat9206
			  * aClass185_Sub1_9817.aFloat9292),
			 (aClass185_Sub1_9817.aFloat9206
			  * aClass185_Sub1_9817.aFloat9163));
		    class324.aClass438_3444.method6997
			((-aClass185_Sub1_9817.aFloat9267
			  * aClass185_Sub1_9817.aFloat9159),
			 (-aClass185_Sub1_9817.aFloat9267
			  * aClass185_Sub1_9817.aFloat9292),
			 (-aClass185_Sub1_9817.aFloat9267
			  * aClass185_Sub1_9817.aFloat9163));
		    class324.aClass438_3445.method6997
			((aClass185_Sub1_9817.aFloat9205
			  * aClass185_Sub1_9817.aFloat9159),
			 (aClass185_Sub1_9817.aFloat9205
			  * aClass185_Sub1_9817.aFloat9292),
			 (aClass185_Sub1_9817.aFloat9205
			  * aClass185_Sub1_9817.aFloat9163));
		    if (aClass185_Sub1_9817.anInt9209 > 0) {
			i = aClass185_Sub1_9817.anInt9209;
			Class438 class438 = aClass185_Sub1_9817.aClass438_9151;
			for (int i_2403_ = 0; i_2403_ < i; i_2403_++) {
			    Class534_Sub21 class534_sub21
				= (aClass185_Sub1_9817.aClass534_Sub21Array9208
				   [i_2403_]);
			    int i_2404_
				= class534_sub21.method16201((byte) -73);
			    class438
				.method6992(class534_sub21.aClass438_10529);
			    class438.method7022(class446_2402_);
			    class324.aFloatArray3448[i_2403_ * 4 + 0]
				= class438.aFloat4864;
			    class324.aFloatArray3448[i_2403_ * 4 + 1]
				= class438.aFloat4863;
			    class324.aFloatArray3448[i_2403_ * 4 + 2]
				= class438.aFloat4865;
			    class324.aFloatArray3448[i_2403_ * 4 + 3]
				= (1.0F
				   / (float) (class534_sub21
						  .method16233(-1526319780)
					      * class534_sub21
						    .method16233(-953665491)));
			    float f = (class534_sub21.method16202(-693604944)
				       / 255.0F);
			    class324.aFloatArray3439[i_2403_ * 4 + 0]
				= (float) (i_2404_ >> 16 & 0xff) * f;
			    class324.aFloatArray3439[i_2403_ * 4 + 1]
				= (float) (i_2404_ >> 8 & 0xff) * f;
			    class324.aFloatArray3439[i_2403_ * 4 + 2]
				= (float) (i_2404_ & 0xff) * f;
			    class324.aFloatArray3439[i_2403_ * 4 + 3] = 1.0F;
			}
		    }
		}
		for (int i_2405_ = 0; i_2405_ < anIntArray9854.length;
		     i_2405_++) {
		    int i_2406_ = anIntArray9827[i_2405_];
		    int i_2407_ = anIntArray9827[i_2405_ + 1];
		    int i_2408_ = aShortArray9830[i_2406_];
		    byte i_2409_ = 11;
		    Class186 class186 = null;
		    byte i_2410_ = 0;
		    if (i_2408_ != -1) {
			class186 = aClass185_Sub1_9817.aClass177_2012
				       .method2931(i_2408_ & 0xffff, (byte) 1);
			class324.anInterface38_3432
			    = aClass185_Sub1_9817.aClass354_9211
				  .method6267(class186);
			i_2409_ = class186.aByte2067;
			class324.method5793(class186.aByte2068);
			class324.aClass433_3430.aFloatArray4853[12]
			    = ((float) (aClass185_Sub1_9817.anInt9264 % 128000)
			       / 1000.0F * (float) class186.aByte2047 / 64.0F
			       % 1.0F);
			class324.aClass433_3430.aFloatArray4853[13]
			    = ((float) (aClass185_Sub1_9817.anInt9264 % 128000)
			       / 1000.0F * (float) class186.aByte2048 / 64.0F
			       % 1.0F);
			if (class186.aClass599_2064 == Class599.aClass599_7868)
			    i_2410_ = class186.aByte2051;
		    } else {
			class324.anInterface38_3432
			    = aClass185_Sub1_9817.anInterface38_9204;
			float[] fs = class324.aClass433_3430.aFloatArray4853;
			class324.aClass433_3430.aFloatArray4853[13] = 0.0F;
			fs[12] = 0.0F;
		    }
		    aClass185_Sub1_9817.method14959(i_2410_);
		    class324.anInt3447 = anIntArray9854[i_2405_];
		    class324.anInt3428 = anIntArray9855[i_2405_];
		    class324.anInt3449 = i_2406_ * 3;
		    class324.anInt3450 = i_2407_ - i_2406_;
		    switch (i_2409_) {
		    case 6:
			class324.method5812(!Class72.method1559(i_2409_,
								-1682440466));
			break;
		    default:
			class324.method5796(i);
			break;
		    case 5:
			if (!aClass185_Sub1_9817.aBool9125) {
			    Class348_Sub1_Sub1 class348_sub1_sub1
				= aClass185_Sub1_9817.aClass348_Sub1_Sub1_9237;
			    class348_sub1_sub1.method17975(class186.aByte2068,
							   (class186.anInt2069
							    * 1880963453),
							   (byte) 23);
			    class348_sub1_sub1.aClass433_11448
				.method6916(class446);
			    class348_sub1_sub1.aClass433_11437
				.method6916(class446);
			    class348_sub1_sub1.aClass433_11437.method6839
				(aClass185_Sub1_9817.aClass433_9164);
			    class348_sub1_sub1.anInt11451
				= anIntArray9854[i_2405_] * -89724309;
			    class348_sub1_sub1.anInt11452
				= anIntArray9855[i_2405_] * -890917363;
			    class348_sub1_sub1.anInt11453
				= i_2406_ * -1012786239;
			    class348_sub1_sub1.anInt11443
				= (i_2407_ - i_2406_) * -694101341;
			    class348_sub1_sub1.method17976(216015837);
			} else
			    class324.method5796(i);
			break;
		    case 7:
			class324.aClass438_3433.method6997
			    ((aClass185_Sub1_9817.aClass433_9118
			      .aFloatArray4853[12]),
			     (aClass185_Sub1_9817.aClass433_9118
			      .aFloatArray4853[13]),
			     (aClass185_Sub1_9817.aClass433_9118
			      .aFloatArray4853[14]));
			class324.aClass438_3433.method7022(class446_2402_);
			class324.aClass433_3446.method6916(class446);
			class324.anInterface41_3434
			    = aClass185_Sub1_9817.method14616();
			class324.method5805(i);
			break;
		    case 1:
			class324.aClass438_3433.method6997
			    ((aClass185_Sub1_9817.aClass433_9118
			      .aFloatArray4853[12]),
			     (aClass185_Sub1_9817.aClass433_9118
			      .aFloatArray4853[13]),
			     (aClass185_Sub1_9817.aClass433_9118
			      .aFloatArray4853[14]));
			class324.aClass438_3433.method7022(class446_2402_);
			class324.method5810(i);
		    }
		}
	    }
	    method15503();
	}
    }
    
    boolean method15550() {
	if (aClass335_9833.aBool3516)
	    return true;
	if (aClass335_9833.anInterface39_3517 == null)
	    aClass335_9833.anInterface39_3517
		= aClass185_Sub1_9817.method14971(false);
	Interface39 interface39 = aClass335_9833.anInterface39_3517;
	interface39.method277(anInt9824 * 6);
	Unsafe unsafe = aClass185_Sub1_9817.anUnsafe9127;
	if (unsafe != null) {
	    int i = anInt9824 * 6;
	    long l = interface39.method227(0, i);
	    if (l == 0L)
		return false;
	    for (int i_2411_ = 0; i_2411_ < anInt9824; i_2411_++) {
		unsafe.putShort(l, aShortArray9847[i_2411_]);
		l += 2L;
		unsafe.putShort(l, aShortArray9845[i_2411_]);
		l += 2L;
		unsafe.putShort(l, aShortArray9843[i_2411_]);
		l += 2L;
	    }
	    interface39.method228();
	    aClass335_9833.anInterface39_3515 = interface39;
	    aClass335_9833.aBool3516 = true;
	    aBool9839 = true;
	    return true;
	}
	ByteBuffer bytebuffer = aClass185_Sub1_9817.aByteBuffer9266;
	bytebuffer.clear();
	for (int i = 0; i < anInt9824; i++) {
	    bytebuffer.putShort(aShortArray9847[i]);
	    bytebuffer.putShort(aShortArray9845[i]);
	    bytebuffer.putShort(aShortArray9843[i]);
	}
	if (interface39.method235(0, bytebuffer.position(),
				  aClass185_Sub1_9817.aLong9139)) {
	    aClass335_9833.anInterface39_3515 = interface39;
	    aClass335_9833.aBool3516 = true;
	    aBool9839 = true;
	    return true;
	}
	return false;
    }
    
    boolean method15551() {
	boolean bool = !aClass379_9835.aBool3921;
	boolean bool_2412_
	    = (anInt9872 & 0x37) != 0 && !aClass379_9836.aBool3921;
	boolean bool_2413_ = !aClass379_9834.aBool3921;
	boolean bool_2414_ = !aClass379_9837.aBool3921;
	if (!bool_2413_ && !bool && !bool_2412_ && !bool_2414_)
	    return true;
	boolean bool_2415_ = true;
	if (bool_2413_ && aShortArray9801 != null) {
	    if (aClass379_9834.anInterface37_3924 == null)
		aClass379_9834.anInterface37_3924
		    = aClass185_Sub1_9817.method14698(aBool9838);
	    Interface37 interface37 = aClass379_9834.anInterface37_3924;
	    interface37.method236(anInt9813 * 12, 12);
	    Unsafe unsafe = aClass185_Sub1_9817.anUnsafe9127;
	    if (unsafe != null) {
		int i = anInt9813 * 12;
		long l = interface37.method227(0, i);
		for (int i_2416_ = 0; i_2416_ < anInt9813; i_2416_++) {
		    short i_2417_ = aShortArray9801[i_2416_];
		    unsafe.putFloat(l, (float) anIntArray9808[i_2417_]);
		    l += 4L;
		    unsafe.putFloat(l, (float) anIntArray9809[i_2417_]);
		    l += 4L;
		    unsafe.putFloat(l, (float) anIntArray9828[i_2417_]);
		    l += 4L;
		}
		interface37.method228();
	    } else {
		ByteBuffer bytebuffer = aClass185_Sub1_9817.aByteBuffer9266;
		bytebuffer.clear();
		for (int i = 0; i < anInt9813; i++) {
		    bytebuffer
			.putFloat((float) anIntArray9808[aShortArray9801[i]]);
		    bytebuffer
			.putFloat((float) anIntArray9809[aShortArray9801[i]]);
		    bytebuffer
			.putFloat((float) anIntArray9828[aShortArray9801[i]]);
		}
		interface37.method235(0, bytebuffer.position(),
				      aClass185_Sub1_9817.aLong9139);
	    }
	    aClass379_9834.anInterface37_3922 = interface37;
	    aClass379_9834.aBool3921 = true;
	}
	if (bool) {
	    if (aClass379_9835.anInterface37_3924 == null)
		aClass379_9835.anInterface37_3924
		    = aClass185_Sub1_9817.method14698(aBool9838);
	    Interface37 interface37 = aClass379_9835.anInterface37_3924;
	    interface37.method236(anInt9813 * 4, 4);
	    Unsafe unsafe = aClass185_Sub1_9817.anUnsafe9127;
	    if (unsafe != null) {
		int i = anInt9813 * 4;
		long l = interface37.method227(0, i);
		if ((anInt9872 & 0x37) == 0) {
		    short[] is;
		    short[] is_2418_;
		    short[] is_2419_;
		    byte[] is_2420_;
		    if (aClass363_9822 != null) {
			is = aClass363_9822.aShortArray3722;
			is_2418_ = aClass363_9822.aShortArray3720;
			is_2419_ = aClass363_9822.aShortArray3723;
			is_2420_ = aClass363_9822.aByteArray3721;
		    } else {
			is = aShortArray9816;
			is_2418_ = aShortArray9864;
			is_2419_ = aShortArray9869;
			is_2420_ = aByteArray9814;
		    }
		    float f = (aClass185_Sub1_9817.aFloat9206 * 768.0F
			       / (float) aShort9805);
		    float f_2421_ = (aClass185_Sub1_9817.aFloat9267 * 768.0F
				     / (float) aShort9805);
		    for (int i_2422_ = 0; i_2422_ < anInt9813; i_2422_++) {
			short i_2423_ = aShortArray9815[i_2422_];
			int i_2424_
			    = method15527(aShortArray9825[i_2423_] & 0xffff,
					  aShortArray9830[i_2423_],
					  aShort9804);
			float f_2425_ = ((float) (i_2424_ >> 16 & 0xff)
					 * aClass185_Sub1_9817.aFloat9159);
			float f_2426_ = ((float) (i_2424_ >> 8 & 0xff)
					 * aClass185_Sub1_9817.aFloat9292);
			float f_2427_ = ((float) (i_2424_ & 0xff)
					 * aClass185_Sub1_9817.aFloat9163);
			byte i_2428_ = is_2420_[i_2422_];
			float f_2429_;
			if (i_2428_ == 0)
			    f_2429_
				= (((aClass185_Sub1_9817.aFloatArray9197[0]
				     * (float) is[i_2422_])
				    + (aClass185_Sub1_9817.aFloatArray9197[1]
				       * (float) is_2418_[i_2422_])
				    + (aClass185_Sub1_9817.aFloatArray9197[2]
				       * (float) is_2419_[i_2422_]))
				   * 0.0026041667F);
			else
			    f_2429_
				= (((aClass185_Sub1_9817.aFloatArray9197[0]
				     * (float) is[i_2422_])
				    + (aClass185_Sub1_9817.aFloatArray9197[1]
				       * (float) is_2418_[i_2422_])
				    + (aClass185_Sub1_9817.aFloatArray9197[2]
				       * (float) is_2419_[i_2422_]))
				   / ((float) i_2428_ * 256.0F));
			float f_2430_
			    = (aClass185_Sub1_9817.aFloat9205
			       + f_2429_ * (f_2429_ < 0.0F ? f_2421_ : f));
			int i_2431_ = (int) (f_2425_ * f_2430_);
			if (i_2431_ < 0)
			    i_2431_ = 0;
			else if (i_2431_ > 255)
			    i_2431_ = 255;
			int i_2432_ = (int) (f_2426_ * f_2430_);
			if (i_2432_ < 0)
			    i_2432_ = 0;
			else if (i_2432_ > 255)
			    i_2432_ = 255;
			int i_2433_ = (int) (f_2427_ * f_2430_);
			if (i_2433_ < 0)
			    i_2433_ = 0;
			else if (i_2433_ > 255)
			    i_2433_ = 255;
			unsafe.putInt(l, (255 - aByteArray9826[i_2423_] << 24
					  | i_2431_ << 16 | i_2432_ << 8
					  | i_2433_));
			l += 4L;
		    }
		} else {
		    for (int i_2434_ = 0; i_2434_ < anInt9813; i_2434_++) {
			short i_2435_ = aShortArray9815[i_2434_];
			int i_2436_
			    = (255 - aByteArray9826[i_2435_] << 24
			       | method15527(aShortArray9825[i_2435_] & 0xffff,
					     aShortArray9830[i_2435_],
					     aShort9804));
			unsafe.putInt(l, i_2436_);
			l += 4L;
		    }
		}
		interface37.method228();
	    } else {
		ByteBuffer bytebuffer = aClass185_Sub1_9817.aByteBuffer9266;
		bytebuffer.clear();
		if ((anInt9872 & 0x37) == 0) {
		    short[] is;
		    short[] is_2437_;
		    short[] is_2438_;
		    byte[] is_2439_;
		    if (aClass363_9822 != null) {
			is = aClass363_9822.aShortArray3722;
			is_2437_ = aClass363_9822.aShortArray3720;
			is_2438_ = aClass363_9822.aShortArray3723;
			is_2439_ = aClass363_9822.aByteArray3721;
		    } else {
			is = aShortArray9816;
			is_2437_ = aShortArray9864;
			is_2438_ = aShortArray9869;
			is_2439_ = aByteArray9814;
		    }
		    float f = (aClass185_Sub1_9817.aFloat9206 * 768.0F
			       / (float) aShort9805);
		    float f_2440_ = (aClass185_Sub1_9817.aFloat9267 * 768.0F
				     / (float) aShort9805);
		    for (int i = 0; i < anInt9813; i++) {
			short i_2441_ = aShortArray9815[i];
			int i_2442_
			    = method15527(aShortArray9825[i_2441_] & 0xffff,
					  aShortArray9830[i_2441_],
					  aShort9804);
			float f_2443_ = ((float) (i_2442_ >> 16 & 0xff)
					 * aClass185_Sub1_9817.aFloat9159);
			float f_2444_ = ((float) (i_2442_ >> 8 & 0xff)
					 * aClass185_Sub1_9817.aFloat9292);
			float f_2445_ = ((float) (i_2442_ & 0xff)
					 * aClass185_Sub1_9817.aFloat9163);
			byte i_2446_ = is_2439_[i];
			float f_2447_;
			if (i_2446_ == 0)
			    f_2447_
				= ((aClass185_Sub1_9817.aFloatArray9197[0]
				    * (float) is[i])
				   + (aClass185_Sub1_9817.aFloatArray9197[1]
				      * (float) is_2437_[i])
				   + (aClass185_Sub1_9817.aFloatArray9197[2]
				      * (float) is_2438_[i])) * 0.0026041667F;
			else
			    f_2447_
				= (((aClass185_Sub1_9817.aFloatArray9197[0]
				     * (float) is[i])
				    + (aClass185_Sub1_9817.aFloatArray9197[1]
				       * (float) is_2437_[i])
				    + (aClass185_Sub1_9817.aFloatArray9197[2]
				       * (float) is_2438_[i]))
				   / ((float) i_2446_ * 256.0F));
			float f_2448_
			    = (aClass185_Sub1_9817.aFloat9205
			       + f_2447_ * (f_2447_ < 0.0F ? f_2440_ : f));
			int i_2449_ = (int) (f_2443_ * f_2448_);
			if (i_2449_ < 0)
			    i_2449_ = 0;
			else if (i_2449_ > 255)
			    i_2449_ = 255;
			int i_2450_ = (int) (f_2444_ * f_2448_);
			if (i_2450_ < 0)
			    i_2450_ = 0;
			else if (i_2450_ > 255)
			    i_2450_ = 255;
			int i_2451_ = (int) (f_2445_ * f_2448_);
			if (i_2451_ < 0)
			    i_2451_ = 0;
			else if (i_2451_ > 255)
			    i_2451_ = 255;
			bytebuffer.putInt(255 - aByteArray9826[i_2441_] << 24
					  | i_2449_ << 16 | i_2450_ << 8
					  | i_2451_);
		    }
		} else {
		    for (int i = 0; i < anInt9813; i++) {
			short i_2452_ = aShortArray9815[i];
			int i_2453_
			    = (255 - aByteArray9826[i_2452_] << 24
			       | method15527(aShortArray9825[i_2452_] & 0xffff,
					     aShortArray9830[i_2452_],
					     aShort9804));
			bytebuffer.putInt(i_2453_);
		    }
		}
		interface37.method235(0, bytebuffer.position(),
				      aClass185_Sub1_9817.aLong9139);
	    }
	    aClass379_9835.anInterface37_3922 = interface37;
	    aClass379_9835.aBool3921 = true;
	}
	if (bool_2412_) {
	    if (aClass379_9836.anInterface37_3924 == null)
		aClass379_9836.anInterface37_3924
		    = aClass185_Sub1_9817.method14698(aBool9838);
	    Interface37 interface37 = aClass379_9836.anInterface37_3924;
	    interface37.method236(anInt9813 * 12, 12);
	    short[] is;
	    short[] is_2454_;
	    short[] is_2455_;
	    byte[] is_2456_;
	    if (aClass363_9822 != null) {
		is = aClass363_9822.aShortArray3722;
		is_2454_ = aClass363_9822.aShortArray3720;
		is_2455_ = aClass363_9822.aShortArray3723;
		is_2456_ = aClass363_9822.aByteArray3721;
	    } else {
		is = aShortArray9816;
		is_2454_ = aShortArray9864;
		is_2455_ = aShortArray9869;
		is_2456_ = aByteArray9814;
	    }
	    Unsafe unsafe = aClass185_Sub1_9817.anUnsafe9127;
	    if (unsafe != null) {
		int i = anInt9813 * 12;
		long l = interface37.method227(0, i);
		for (int i_2457_ = 0; i_2457_ < anInt9813; i_2457_++) {
		    Class438 class438
			= new Class438((float) is[i_2457_],
				       (float) is_2454_[i_2457_],
				       (float) is_2455_[i_2457_]);
		    if (class438.method7012() != 0.0F) {
			if (is_2456_[i_2457_] > 1)
			    class438.method7042((float) is_2456_[i_2457_]);
			class438.method7002();
		    }
		    unsafe.putFloat(l, class438.aFloat4864);
		    l += 4L;
		    unsafe.putFloat(l, class438.aFloat4863);
		    l += 4L;
		    unsafe.putFloat(l, class438.aFloat4865);
		    l += 4L;
		}
		interface37.method228();
	    } else {
		ByteBuffer bytebuffer = aClass185_Sub1_9817.aByteBuffer9266;
		bytebuffer.clear();
		for (int i = 0; i < anInt9813; i++) {
		    Class438 class438
			= new Class438((float) is[i], (float) is_2454_[i],
				       (float) is_2455_[i]);
		    if (class438.method7012() != 0.0F) {
			if (is_2456_[i] > 1)
			    class438.method7042((float) is_2456_[i]);
			class438.method7002();
		    }
		    bytebuffer.putFloat(class438.aFloat4864);
		    bytebuffer.putFloat(class438.aFloat4863);
		    bytebuffer.putFloat(class438.aFloat4865);
		}
		interface37.method235(0, bytebuffer.position(),
				      aClass185_Sub1_9817.aLong9139);
	    }
	    aClass379_9836.anInterface37_3922 = interface37;
	    aClass379_9836.aBool3921 = true;
	}
	if (bool_2414_) {
	    if (aClass379_9837.anInterface37_3924 == null)
		aClass379_9837.anInterface37_3924
		    = aClass185_Sub1_9817.method14698(aBool9838);
	    Interface37 interface37 = aClass379_9837.anInterface37_3924;
	    interface37.method236(anInt9813 * 8, 8);
	    Unsafe unsafe = aClass185_Sub1_9817.anUnsafe9127;
	    if (unsafe != null) {
		int i = anInt9813 * 8;
		long l = interface37.method227(0, i);
		for (int i_2458_ = 0; i_2458_ < anInt9813; i_2458_++) {
		    unsafe.putFloat(l, aFloatArray9829[i_2458_]);
		    l += 4L;
		    unsafe.putFloat(l, aFloatArray9821[i_2458_]);
		    l += 4L;
		}
		interface37.method228();
	    } else {
		ByteBuffer bytebuffer = aClass185_Sub1_9817.aByteBuffer9266;
		bytebuffer.clear();
		for (int i = 0; i < anInt9813; i++) {
		    bytebuffer.putFloat(aFloatArray9829[i]);
		    bytebuffer.putFloat(aFloatArray9821[i]);
		}
		interface37.method235(0, bytebuffer.position(),
				      aClass185_Sub1_9817.aLong9139);
	    }
	    aClass379_9837.anInterface37_3922 = interface37;
	    aClass379_9837.aBool3921 = true;
	}
	return bool_2415_;
    }
    
    boolean method15552() {
	boolean bool = !aClass379_9835.aBool3921;
	boolean bool_2459_
	    = (anInt9872 & 0x37) != 0 && !aClass379_9836.aBool3921;
	boolean bool_2460_ = !aClass379_9834.aBool3921;
	boolean bool_2461_ = !aClass379_9837.aBool3921;
	if (!bool_2460_ && !bool && !bool_2459_ && !bool_2461_)
	    return true;
	boolean bool_2462_ = true;
	if (bool_2460_ && aShortArray9801 != null) {
	    if (aClass379_9834.anInterface37_3924 == null)
		aClass379_9834.anInterface37_3924
		    = aClass185_Sub1_9817.method14698(aBool9838);
	    Interface37 interface37 = aClass379_9834.anInterface37_3924;
	    interface37.method236(anInt9813 * 12, 12);
	    Unsafe unsafe = aClass185_Sub1_9817.anUnsafe9127;
	    if (unsafe != null) {
		int i = anInt9813 * 12;
		long l = interface37.method227(0, i);
		for (int i_2463_ = 0; i_2463_ < anInt9813; i_2463_++) {
		    short i_2464_ = aShortArray9801[i_2463_];
		    unsafe.putFloat(l, (float) anIntArray9808[i_2464_]);
		    l += 4L;
		    unsafe.putFloat(l, (float) anIntArray9809[i_2464_]);
		    l += 4L;
		    unsafe.putFloat(l, (float) anIntArray9828[i_2464_]);
		    l += 4L;
		}
		interface37.method228();
	    } else {
		ByteBuffer bytebuffer = aClass185_Sub1_9817.aByteBuffer9266;
		bytebuffer.clear();
		for (int i = 0; i < anInt9813; i++) {
		    bytebuffer
			.putFloat((float) anIntArray9808[aShortArray9801[i]]);
		    bytebuffer
			.putFloat((float) anIntArray9809[aShortArray9801[i]]);
		    bytebuffer
			.putFloat((float) anIntArray9828[aShortArray9801[i]]);
		}
		interface37.method235(0, bytebuffer.position(),
				      aClass185_Sub1_9817.aLong9139);
	    }
	    aClass379_9834.anInterface37_3922 = interface37;
	    aClass379_9834.aBool3921 = true;
	}
	if (bool) {
	    if (aClass379_9835.anInterface37_3924 == null)
		aClass379_9835.anInterface37_3924
		    = aClass185_Sub1_9817.method14698(aBool9838);
	    Interface37 interface37 = aClass379_9835.anInterface37_3924;
	    interface37.method236(anInt9813 * 4, 4);
	    Unsafe unsafe = aClass185_Sub1_9817.anUnsafe9127;
	    if (unsafe != null) {
		int i = anInt9813 * 4;
		long l = interface37.method227(0, i);
		if ((anInt9872 & 0x37) == 0) {
		    short[] is;
		    short[] is_2465_;
		    short[] is_2466_;
		    byte[] is_2467_;
		    if (aClass363_9822 != null) {
			is = aClass363_9822.aShortArray3722;
			is_2465_ = aClass363_9822.aShortArray3720;
			is_2466_ = aClass363_9822.aShortArray3723;
			is_2467_ = aClass363_9822.aByteArray3721;
		    } else {
			is = aShortArray9816;
			is_2465_ = aShortArray9864;
			is_2466_ = aShortArray9869;
			is_2467_ = aByteArray9814;
		    }
		    float f = (aClass185_Sub1_9817.aFloat9206 * 768.0F
			       / (float) aShort9805);
		    float f_2468_ = (aClass185_Sub1_9817.aFloat9267 * 768.0F
				     / (float) aShort9805);
		    for (int i_2469_ = 0; i_2469_ < anInt9813; i_2469_++) {
			short i_2470_ = aShortArray9815[i_2469_];
			int i_2471_
			    = method15527(aShortArray9825[i_2470_] & 0xffff,
					  aShortArray9830[i_2470_],
					  aShort9804);
			float f_2472_ = ((float) (i_2471_ >> 16 & 0xff)
					 * aClass185_Sub1_9817.aFloat9159);
			float f_2473_ = ((float) (i_2471_ >> 8 & 0xff)
					 * aClass185_Sub1_9817.aFloat9292);
			float f_2474_ = ((float) (i_2471_ & 0xff)
					 * aClass185_Sub1_9817.aFloat9163);
			byte i_2475_ = is_2467_[i_2469_];
			float f_2476_;
			if (i_2475_ == 0)
			    f_2476_
				= (((aClass185_Sub1_9817.aFloatArray9197[0]
				     * (float) is[i_2469_])
				    + (aClass185_Sub1_9817.aFloatArray9197[1]
				       * (float) is_2465_[i_2469_])
				    + (aClass185_Sub1_9817.aFloatArray9197[2]
				       * (float) is_2466_[i_2469_]))
				   * 0.0026041667F);
			else
			    f_2476_
				= (((aClass185_Sub1_9817.aFloatArray9197[0]
				     * (float) is[i_2469_])
				    + (aClass185_Sub1_9817.aFloatArray9197[1]
				       * (float) is_2465_[i_2469_])
				    + (aClass185_Sub1_9817.aFloatArray9197[2]
				       * (float) is_2466_[i_2469_]))
				   / ((float) i_2475_ * 256.0F));
			float f_2477_
			    = (aClass185_Sub1_9817.aFloat9205
			       + f_2476_ * (f_2476_ < 0.0F ? f_2468_ : f));
			int i_2478_ = (int) (f_2472_ * f_2477_);
			if (i_2478_ < 0)
			    i_2478_ = 0;
			else if (i_2478_ > 255)
			    i_2478_ = 255;
			int i_2479_ = (int) (f_2473_ * f_2477_);
			if (i_2479_ < 0)
			    i_2479_ = 0;
			else if (i_2479_ > 255)
			    i_2479_ = 255;
			int i_2480_ = (int) (f_2474_ * f_2477_);
			if (i_2480_ < 0)
			    i_2480_ = 0;
			else if (i_2480_ > 255)
			    i_2480_ = 255;
			unsafe.putInt(l, (255 - aByteArray9826[i_2470_] << 24
					  | i_2478_ << 16 | i_2479_ << 8
					  | i_2480_));
			l += 4L;
		    }
		} else {
		    for (int i_2481_ = 0; i_2481_ < anInt9813; i_2481_++) {
			short i_2482_ = aShortArray9815[i_2481_];
			int i_2483_
			    = (255 - aByteArray9826[i_2482_] << 24
			       | method15527(aShortArray9825[i_2482_] & 0xffff,
					     aShortArray9830[i_2482_],
					     aShort9804));
			unsafe.putInt(l, i_2483_);
			l += 4L;
		    }
		}
		interface37.method228();
	    } else {
		ByteBuffer bytebuffer = aClass185_Sub1_9817.aByteBuffer9266;
		bytebuffer.clear();
		if ((anInt9872 & 0x37) == 0) {
		    short[] is;
		    short[] is_2484_;
		    short[] is_2485_;
		    byte[] is_2486_;
		    if (aClass363_9822 != null) {
			is = aClass363_9822.aShortArray3722;
			is_2484_ = aClass363_9822.aShortArray3720;
			is_2485_ = aClass363_9822.aShortArray3723;
			is_2486_ = aClass363_9822.aByteArray3721;
		    } else {
			is = aShortArray9816;
			is_2484_ = aShortArray9864;
			is_2485_ = aShortArray9869;
			is_2486_ = aByteArray9814;
		    }
		    float f = (aClass185_Sub1_9817.aFloat9206 * 768.0F
			       / (float) aShort9805);
		    float f_2487_ = (aClass185_Sub1_9817.aFloat9267 * 768.0F
				     / (float) aShort9805);
		    for (int i = 0; i < anInt9813; i++) {
			short i_2488_ = aShortArray9815[i];
			int i_2489_
			    = method15527(aShortArray9825[i_2488_] & 0xffff,
					  aShortArray9830[i_2488_],
					  aShort9804);
			float f_2490_ = ((float) (i_2489_ >> 16 & 0xff)
					 * aClass185_Sub1_9817.aFloat9159);
			float f_2491_ = ((float) (i_2489_ >> 8 & 0xff)
					 * aClass185_Sub1_9817.aFloat9292);
			float f_2492_ = ((float) (i_2489_ & 0xff)
					 * aClass185_Sub1_9817.aFloat9163);
			byte i_2493_ = is_2486_[i];
			float f_2494_;
			if (i_2493_ == 0)
			    f_2494_
				= ((aClass185_Sub1_9817.aFloatArray9197[0]
				    * (float) is[i])
				   + (aClass185_Sub1_9817.aFloatArray9197[1]
				      * (float) is_2484_[i])
				   + (aClass185_Sub1_9817.aFloatArray9197[2]
				      * (float) is_2485_[i])) * 0.0026041667F;
			else
			    f_2494_
				= (((aClass185_Sub1_9817.aFloatArray9197[0]
				     * (float) is[i])
				    + (aClass185_Sub1_9817.aFloatArray9197[1]
				       * (float) is_2484_[i])
				    + (aClass185_Sub1_9817.aFloatArray9197[2]
				       * (float) is_2485_[i]))
				   / ((float) i_2493_ * 256.0F));
			float f_2495_
			    = (aClass185_Sub1_9817.aFloat9205
			       + f_2494_ * (f_2494_ < 0.0F ? f_2487_ : f));
			int i_2496_ = (int) (f_2490_ * f_2495_);
			if (i_2496_ < 0)
			    i_2496_ = 0;
			else if (i_2496_ > 255)
			    i_2496_ = 255;
			int i_2497_ = (int) (f_2491_ * f_2495_);
			if (i_2497_ < 0)
			    i_2497_ = 0;
			else if (i_2497_ > 255)
			    i_2497_ = 255;
			int i_2498_ = (int) (f_2492_ * f_2495_);
			if (i_2498_ < 0)
			    i_2498_ = 0;
			else if (i_2498_ > 255)
			    i_2498_ = 255;
			bytebuffer.putInt(255 - aByteArray9826[i_2488_] << 24
					  | i_2496_ << 16 | i_2497_ << 8
					  | i_2498_);
		    }
		} else {
		    for (int i = 0; i < anInt9813; i++) {
			short i_2499_ = aShortArray9815[i];
			int i_2500_
			    = (255 - aByteArray9826[i_2499_] << 24
			       | method15527(aShortArray9825[i_2499_] & 0xffff,
					     aShortArray9830[i_2499_],
					     aShort9804));
			bytebuffer.putInt(i_2500_);
		    }
		}
		interface37.method235(0, bytebuffer.position(),
				      aClass185_Sub1_9817.aLong9139);
	    }
	    aClass379_9835.anInterface37_3922 = interface37;
	    aClass379_9835.aBool3921 = true;
	}
	if (bool_2459_) {
	    if (aClass379_9836.anInterface37_3924 == null)
		aClass379_9836.anInterface37_3924
		    = aClass185_Sub1_9817.method14698(aBool9838);
	    Interface37 interface37 = aClass379_9836.anInterface37_3924;
	    interface37.method236(anInt9813 * 12, 12);
	    short[] is;
	    short[] is_2501_;
	    short[] is_2502_;
	    byte[] is_2503_;
	    if (aClass363_9822 != null) {
		is = aClass363_9822.aShortArray3722;
		is_2501_ = aClass363_9822.aShortArray3720;
		is_2502_ = aClass363_9822.aShortArray3723;
		is_2503_ = aClass363_9822.aByteArray3721;
	    } else {
		is = aShortArray9816;
		is_2501_ = aShortArray9864;
		is_2502_ = aShortArray9869;
		is_2503_ = aByteArray9814;
	    }
	    Unsafe unsafe = aClass185_Sub1_9817.anUnsafe9127;
	    if (unsafe != null) {
		int i = anInt9813 * 12;
		long l = interface37.method227(0, i);
		for (int i_2504_ = 0; i_2504_ < anInt9813; i_2504_++) {
		    Class438 class438
			= new Class438((float) is[i_2504_],
				       (float) is_2501_[i_2504_],
				       (float) is_2502_[i_2504_]);
		    if (class438.method7012() != 0.0F) {
			if (is_2503_[i_2504_] > 1)
			    class438.method7042((float) is_2503_[i_2504_]);
			class438.method7002();
		    }
		    unsafe.putFloat(l, class438.aFloat4864);
		    l += 4L;
		    unsafe.putFloat(l, class438.aFloat4863);
		    l += 4L;
		    unsafe.putFloat(l, class438.aFloat4865);
		    l += 4L;
		}
		interface37.method228();
	    } else {
		ByteBuffer bytebuffer = aClass185_Sub1_9817.aByteBuffer9266;
		bytebuffer.clear();
		for (int i = 0; i < anInt9813; i++) {
		    Class438 class438
			= new Class438((float) is[i], (float) is_2501_[i],
				       (float) is_2502_[i]);
		    if (class438.method7012() != 0.0F) {
			if (is_2503_[i] > 1)
			    class438.method7042((float) is_2503_[i]);
			class438.method7002();
		    }
		    bytebuffer.putFloat(class438.aFloat4864);
		    bytebuffer.putFloat(class438.aFloat4863);
		    bytebuffer.putFloat(class438.aFloat4865);
		}
		interface37.method235(0, bytebuffer.position(),
				      aClass185_Sub1_9817.aLong9139);
	    }
	    aClass379_9836.anInterface37_3922 = interface37;
	    aClass379_9836.aBool3921 = true;
	}
	if (bool_2461_) {
	    if (aClass379_9837.anInterface37_3924 == null)
		aClass379_9837.anInterface37_3924
		    = aClass185_Sub1_9817.method14698(aBool9838);
	    Interface37 interface37 = aClass379_9837.anInterface37_3924;
	    interface37.method236(anInt9813 * 8, 8);
	    Unsafe unsafe = aClass185_Sub1_9817.anUnsafe9127;
	    if (unsafe != null) {
		int i = anInt9813 * 8;
		long l = interface37.method227(0, i);
		for (int i_2505_ = 0; i_2505_ < anInt9813; i_2505_++) {
		    unsafe.putFloat(l, aFloatArray9829[i_2505_]);
		    l += 4L;
		    unsafe.putFloat(l, aFloatArray9821[i_2505_]);
		    l += 4L;
		}
		interface37.method228();
	    } else {
		ByteBuffer bytebuffer = aClass185_Sub1_9817.aByteBuffer9266;
		bytebuffer.clear();
		for (int i = 0; i < anInt9813; i++) {
		    bytebuffer.putFloat(aFloatArray9829[i]);
		    bytebuffer.putFloat(aFloatArray9821[i]);
		}
		interface37.method235(0, bytebuffer.position(),
				      aClass185_Sub1_9817.aLong9139);
	    }
	    aClass379_9837.anInterface37_3922 = interface37;
	    aClass379_9837.aBool3921 = true;
	}
	return bool_2462_;
    }
    
    boolean method15553() {
	if (aClass335_9833.aBool3516)
	    return true;
	if (aClass335_9833.anInterface39_3517 == null)
	    aClass335_9833.anInterface39_3517
		= aClass185_Sub1_9817.method14971(false);
	Interface39 interface39 = aClass335_9833.anInterface39_3517;
	interface39.method277(anInt9824 * 6);
	Unsafe unsafe = aClass185_Sub1_9817.anUnsafe9127;
	if (unsafe != null) {
	    int i = anInt9824 * 6;
	    long l = interface39.method227(0, i);
	    if (l == 0L)
		return false;
	    for (int i_2506_ = 0; i_2506_ < anInt9824; i_2506_++) {
		unsafe.putShort(l, aShortArray9847[i_2506_]);
		l += 2L;
		unsafe.putShort(l, aShortArray9845[i_2506_]);
		l += 2L;
		unsafe.putShort(l, aShortArray9843[i_2506_]);
		l += 2L;
	    }
	    interface39.method228();
	    aClass335_9833.anInterface39_3515 = interface39;
	    aClass335_9833.aBool3516 = true;
	    aBool9839 = true;
	    return true;
	}
	ByteBuffer bytebuffer = aClass185_Sub1_9817.aByteBuffer9266;
	bytebuffer.clear();
	for (int i = 0; i < anInt9824; i++) {
	    bytebuffer.putShort(aShortArray9847[i]);
	    bytebuffer.putShort(aShortArray9845[i]);
	    bytebuffer.putShort(aShortArray9843[i]);
	}
	if (interface39.method235(0, bytebuffer.position(),
				  aClass185_Sub1_9817.aLong9139)) {
	    aClass335_9833.anInterface39_3515 = interface39;
	    aClass335_9833.aBool3516 = true;
	    aBool9839 = true;
	    return true;
	}
	return false;
    }
    
    static short[] method15554(short[] is, int i) {
	short[] is_2507_ = new short[i];
	System.arraycopy(is, 0, is_2507_, 0, i);
	return is_2507_;
    }
    
    int method15555(int i, int i_2508_) {
	i_2508_ = i_2508_ * (i & 0x7f) >> 7;
	if (i_2508_ < 2)
	    i_2508_ = 2;
	else if (i_2508_ > 126)
	    i_2508_ = 126;
	return (i & 0xff80) + i_2508_;
    }
    
    public void method3083(int i) {
	int i_2509_ = Class427.anIntArray4806[i];
	int i_2510_ = Class427.anIntArray4805[i];
	for (int i_2511_ = 0; i_2511_ < anInt9807; i_2511_++) {
	    int i_2512_ = ((anIntArray9809[i_2511_] * i_2509_
			    + anIntArray9808[i_2511_] * i_2510_)
			   >> 14);
	    anIntArray9809[i_2511_]
		= (anIntArray9809[i_2511_] * i_2510_
		   - anIntArray9808[i_2511_] * i_2509_) >> 14;
	    anIntArray9808[i_2511_] = i_2512_;
	}
	method15509();
	aBool9850 = false;
    }
    
    int method15556(int i, short i_2513_, int i_2514_) {
	int i_2515_
	    = aClass185_Sub1_9817.anIntArray9126[method15523(i, i_2514_)];
	if (i_2513_ != -1) {
	    Class186 class186 = aClass185_Sub1_9817.aClass177_2012
				    .method2931(i_2513_ & 0xffff, (byte) 1);
	    int i_2516_ = class186.aByte2074 & 0xff;
	    if (i_2516_ != 0) {
		int i_2517_ = 131586 * i_2514_;
		if (i_2514_ < 0)
		    i_2517_ = 0;
		else if (i_2514_ > 127)
		    i_2517_ = 16777215;
		else
		    i_2517_ = 131586 * i_2514_;
		if (i_2516_ == 256)
		    i_2515_ = i_2517_;
		else {
		    int i_2518_ = i_2516_;
		    int i_2519_ = 256 - i_2516_;
		    i_2515_ = ((((i_2517_ & 0xff00ff) * i_2518_
				 + (i_2515_ & 0xff00ff) * i_2519_)
				& ~0xff00ff)
			       + (((i_2517_ & 0xff00) * i_2518_
				   + (i_2515_ & 0xff00) * i_2519_)
				  & 0xff0000)) >> 8;
		}
	    }
	    int i_2520_ = class186.aByte2059 & 0xff;
	    if (i_2520_ != 0) {
		i_2520_ += 256;
		int i_2521_ = ((i_2515_ & 0xff0000) >> 16) * i_2520_;
		if (i_2521_ > 65535)
		    i_2521_ = 65535;
		int i_2522_ = ((i_2515_ & 0xff00) >> 8) * i_2520_;
		if (i_2522_ > 65535)
		    i_2522_ = 65535;
		int i_2523_ = (i_2515_ & 0xff) * i_2520_;
		if (i_2523_ > 65535)
		    i_2523_ = 65535;
		i_2515_
		    = (i_2521_ << 8 & 0xff0000) + (i_2522_ & 0xff00) + (i_2523_
									>> 8);
	    }
	}
	return i_2515_ & 0xffffff;
    }
}
