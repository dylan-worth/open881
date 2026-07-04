/* Class183_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaclib.memory.Stream;

import jaggl.OpenGL;

public class Class183_Sub1 extends Class183
{
    float[] aFloatArray9022;
    int anInt9023;
    static final int anInt9024 = 1;
    static final int anInt9025 = 2;
    static final int anInt9026 = 4;
    static int[] anIntArray9027;
    int[][] anIntArrayArray9028;
    Class185_Sub3 aClass185_Sub3_9029;
    int anInt9030;
    short[] aShortArray9031;
    static final int anInt9032 = 16;
    short aShort9033;
    int[] anIntArray9034;
    boolean aBool9035 = false;
    boolean aBool9036 = false;
    int anInt9037 = 0;
    boolean aBool9038;
    static final int anInt9039 = 7;
    short aShort9040;
    int[] anIntArray9041;
    short[] aShortArray9042;
    int[] anIntArray9043;
    int anInt9044;
    short[] aShortArray9045;
    short aShort9046;
    short[] aShortArray9047;
    short[] aShortArray9048;
    Class152 aClass152_9049;
    byte[] aByteArray9050;
    float[] aFloatArray9051;
    int anInt9052;
    int anInt9053;
    short[] aShortArray9054;
    byte[] aByteArray9055;
    short[] aShortArray9056;
    int anInt9057 = 0;
    short[] aShortArray9058;
    short[] aShortArray9059;
    int[] anIntArray9060;
    short[] aShortArray9061;
    Class129 aClass129_9062;
    static final int anInt9063 = 8;
    Class129 aClass129_9064;
    byte aByte9065;
    Class132 aClass132_9066;
    Interface16 anInterface16_9067;
    Interface15 anInterface15_9068;
    int anInt9069;
    Class133[] aClass133Array9070;
    static final int anInt9071 = 4;
    short aShort9072;
    int[][] anIntArrayArray9073;
    short aShort9074;
    boolean aBool9075;
    short aShort9076;
    short aShort9077;
    short aShort9078;
    Class129 aClass129_9079;
    short aShort9080;
    static float[] aFloatArray9081 = new float[2];
    int[] anIntArray9082;
    short[] aShortArray9083;
    Class172[] aClass172Array9084;
    Class158[] aClass158Array9085;
    int anInt9086;
    Class149[] aClass149Array9087;
    int anInt9088;
    int[][] anIntArrayArray9089;
    static long[] aLongArray9090;
    Class129 aClass129_9091;
    static int[] anIntArray9092 = new int[8];
    boolean aBool9093;
    static int[] anIntArray9094;
    static int anInt9095;
    static int anInt9096;
    static int anInt9097;
    static boolean aBool9098;
    
    void method14529(Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1) {
	if (aClass185_Sub3_9029.anIntArray9717.length < anInt9044) {
	    aClass185_Sub3_9029.anIntArray9717 = new int[anInt9044];
	    aClass185_Sub3_9029.anIntArray9718 = new int[anInt9044];
	}
	int[] is = aClass185_Sub3_9029.anIntArray9717;
	int[] is_0_ = aClass185_Sub3_9029.anIntArray9718;
	for (int i = 0; i < anInt9057; i++) {
	    int i_1_ = (((anIntArray9034[i]
			  - (anIntArray9043[i] * aClass185_Sub3_9029.anInt9652
			     >> 8))
			 >> aClass185_Sub3_9029.anInt9574)
			- class534_sub18_sub16_sub1.anInt12071);
	    int i_2_ = (((anIntArray9041[i]
			  - (anIntArray9043[i] * aClass185_Sub3_9029.anInt9647
			     >> 8))
			 >> aClass185_Sub3_9029.anInt9574)
			- class534_sub18_sub16_sub1.anInt12070);
	    int i_3_ = anIntArray9082[i];
	    int i_4_ = anIntArray9082[i + 1];
	    for (int i_5_ = i_3_; i_5_ < i_4_ && aShortArray9083[i_5_] != 0;
		 i_5_++) {
		int i_6_ = (aShortArray9083[i_5_] & 0xffff) - 1;
		is[i_6_] = i_1_;
		is_0_[i_6_] = i_2_;
	    }
	}
	for (int i = 0; i < anInt9053; i++) {
	    if (aByteArray9055 == null || aByteArray9055[i] <= 128) {
		int i_7_ = aShortArray9056[i] & 0xffff;
		int i_8_ = aShortArray9031[i] & 0xffff;
		int i_9_ = aShortArray9058[i] & 0xffff;
		int i_10_ = is[i_7_];
		int i_11_ = is[i_8_];
		int i_12_ = is[i_9_];
		int i_13_ = is_0_[i_7_];
		int i_14_ = is_0_[i_8_];
		int i_15_ = is_0_[i_9_];
		if (((i_10_ - i_11_) * (i_14_ - i_15_)
		     - (i_14_ - i_13_) * (i_12_ - i_11_))
		    > 0)
		    class534_sub18_sub16_sub1.method18675(i_13_, i_14_, i_15_,
							  i_10_, i_11_, i_12_);
	    }
	}
    }
    
    Class183_Sub1(Class185_Sub3 class185_sub3, Class187 class187, int i,
		  int i_16_, int i_17_, int i_18_) {
	anInt9044 = 0;
	anInt9052 = 0;
	anInt9053 = 0;
	aBool9093 = true;
	aBool9075 = false;
	aBool9038 = false;
	aClass185_Sub3_9029 = class185_sub3;
	anInt9030 = i;
	anInt9088 = i_18_;
	if (Class127.method2207(i, i_18_))
	    aClass129_9062 = new Class129(null, 5126, 3, 0);
	if (Class127.method2210(i, i_18_))
	    aClass129_9091 = new Class129(null, 5126, 2, 0);
	if (Class127.method2293(i, i_18_))
	    aClass129_9064 = new Class129(null, 5126, 3, 0);
	if (Class127.method2270(i, i_18_))
	    aClass129_9079 = new Class129(null, 5121, 4, 0);
	if (Class127.method2257(i, i_18_))
	    aClass132_9066 = new Class132();
	Class177 class177 = class185_sub3.aClass177_2012;
	Interface45 interface45 = class185_sub3.anInterface45_1999;
	int[] is = new int[class187.anInt2092];
	anIntArray9082 = new int[class187.anInt2106 + 1];
	for (int i_19_ = 0; i_19_ < class187.anInt2092; i_19_++) {
	    if (class187.aByteArray2099 == null
		|| class187.aByteArray2099[i_19_] != 2) {
		if (class187.aShortArray2104 != null
		    && class187.aShortArray2104[i_19_] != -1) {
		    Class186 class186
			= class177.method2931((class187.aShortArray2104[i_19_]
					       & 0xffff),
					      (byte) 1);
		    if (((anInt9088 & 0x40) == 0 || !class186.aBool2072)
			&& class186.aBool2028)
			continue;
		}
		is[anInt9052++] = i_19_;
		anIntArray9082[class187.aShortArray2093[i_19_]]++;
		anIntArray9082[class187.aShortArray2077[i_19_]]++;
		anIntArray9082[class187.aShortArray2095[i_19_]]++;
	    }
	}
	anInt9053 = anInt9052;
	long[] ls = new long[anInt9052];
	boolean bool = (anInt9030 & 0x100) != 0;
	for (int i_20_ = 0; i_20_ < anInt9052; i_20_++) {
	    int i_21_ = is[i_20_];
	    Class186 class186 = null;
	    int i_22_ = 0;
	    int i_23_ = 0;
	    int i_24_ = 0;
	    int i_25_ = 0;
	    if (class187.aClass168Array2125 != null) {
		boolean bool_26_ = false;
		for (int i_27_ = 0; i_27_ < class187.aClass168Array2125.length;
		     i_27_++) {
		    Class168 class168 = class187.aClass168Array2125[i_27_];
		    if (i_21_ == class168.anInt1791 * 1329690033) {
			Class383 class383
			    = interface45.method344((class168.anInt1788
						     * 452560563),
						    -2124138888);
			if (class383.aBool3942)
			    bool_26_ = true;
			if (class383.anInt3936 * 651115273 != -1) {
			    Class186 class186_28_
				= class177.method2931((class383.anInt3936
						       * 651115273),
						      (byte) 1);
			    if (class186_28_.aClass599_2064
				== Class599.aClass599_7870)
				aBool9035 = true;
			}
		    }
		}
		if (bool_26_) {
		    ls[i_20_] = 9223372036854775807L;
		    anInt9053--;
		    continue;
		}
	    }
	    if (class187.aClass172Array2123 != null) {
		boolean bool_29_ = false;
		for (int i_30_ = 0; i_30_ < class187.aClass172Array2123.length;
		     i_30_++) {
		    Class172 class172 = class187.aClass172Array2123[i_30_];
		    if (i_21_ == class172.anInt1810 * -1916225325) {
			Class385 class385
			    = (aClass185_Sub3_9029.anInterface48_2000.method354
			       (class172.anInt1811 * 1708272351, -1278456161));
			if (class385.aBool4039)
			    bool_29_ = true;
		    }
		}
		if (bool_29_) {
		    ls[i_20_] = 9223372036854775807L;
		    anInt9053--;
		    continue;
		}
	    }
	    int i_31_ = -1;
	    if (class187.aShortArray2104 != null) {
		i_31_ = class187.aShortArray2104[i_21_];
		if (i_31_ != -1) {
		    class186 = class177.method2931(i_31_ & 0xffff, (byte) 1);
		    if ((anInt9088 & 0x40) == 0 || !class186.aBool2072) {
			i_24_ = class186.aByte2067;
			i_25_ = class186.aByte2068;
			if (class186.aByte2047 != 0 || class186.aByte2048 != 0)
			    aBool9036 = true;
		    } else {
			i_31_ = -1;
			class186 = null;
		    }
		}
	    }
	    boolean bool_32_
		= ((class187.aByteArray2101 != null
		    && class187.aByteArray2101[i_21_] != 0)
		   || (class186 != null
		       && class186.aClass599_2064 != Class599.aClass599_7869));
	    if ((bool || bool_32_) && class187.aByteArray2100 != null)
		i_22_ += class187.aByteArray2100[i_21_] << 17;
	    if (bool_32_)
		i_22_ += 65536;
	    i_22_ += (i_24_ & 0xff) << 8;
	    i_22_ += i_25_ & 0xff;
	    i_23_ += (i_31_ & 0xffff) << 16;
	    i_23_ += i_20_ & 0xffff;
	    ls[i_20_] = ((long) i_22_ << 32) + (long) i_23_;
	    aBool9035 |= bool_32_;
	    Class183_Sub1 class183_sub1_33_ = this;
	    class183_sub1_33_.aBool9036
		= (class183_sub1_33_.aBool9036
		   | (class186 != null && (class186.aByte2047 != 0
					   || class186.aByte2048 != 0)));
	}
	Class417.method6755(ls, is, -1583731260);
	anInt9037 = class187.anInt2081;
	anInt9057 = class187.anInt2106;
	anIntArray9034 = class187.anIntArray2083;
	anIntArray9043 = class187.anIntArray2080;
	anIntArray9041 = class187.anIntArray2113;
	aShortArray9048 = class187.aShortArray2088;
	Class135[] class135s = new Class135[anInt9057];
	aClass172Array9084 = class187.aClass172Array2123;
	aClass158Array9085 = class187.aClass158Array2124;
	if (class187.aClass168Array2125 != null) {
	    anInt9086 = class187.aClass168Array2125.length;
	    aClass149Array9087 = new Class149[anInt9086];
	    aClass133Array9070 = new Class133[anInt9086];
	    for (int i_34_ = 0; i_34_ < anInt9086; i_34_++) {
		Class168 class168 = class187.aClass168Array2125[i_34_];
		Class383 class383
		    = interface45.method344(class168.anInt1788 * 452560563,
					    -1983466839);
		int i_35_ = -1;
		for (int i_36_ = 0; i_36_ < anInt9052; i_36_++) {
		    if (is[i_36_] == class168.anInt1791 * 1329690033) {
			i_35_ = i_36_;
			break;
		    }
		}
		if (i_35_ == -1)
		    throw new RuntimeException();
		int i_37_ = ((Class661.anIntArray8549
			      [(class187.aShortArray2096
				[class168.anInt1791 * 1329690033]) & 0xffff])
			     & 0xffffff);
		i_37_ = i_37_ | 255 - (class187.aByteArray2101 != null
				       ? (class187.aByteArray2101
					  [class168.anInt1791 * 1329690033])
				       : 0) << 24;
		aClass149Array9087[i_34_]
		    = new Class149(i_35_,
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
		aClass133Array9070[i_34_] = new Class133(i_37_);
	    }
	}
	int i_38_ = anInt9052 * 3;
	aShortArray9045 = new short[i_38_];
	aShortArray9042 = new short[i_38_];
	aShortArray9047 = new short[i_38_];
	aByteArray9050 = new byte[i_38_];
	aFloatArray9022 = new float[i_38_];
	aFloatArray9051 = new float[i_38_];
	aShortArray9054 = new short[anInt9052];
	aByteArray9055 = new byte[anInt9052];
	aShortArray9056 = new short[anInt9052];
	aShortArray9031 = new short[anInt9052];
	aShortArray9058 = new short[anInt9052];
	aShortArray9059 = new short[anInt9052];
	if (class187.aShortArray2094 != null)
	    aShortArray9061 = new short[anInt9052];
	aShort9040 = (short) i_16_;
	aShort9046 = (short) i_17_;
	aShortArray9083 = new short[i_38_];
	aLongArray9090 = new long[i_38_];
	int i_39_ = 0;
	for (int i_40_ = 0; i_40_ < class187.anInt2106; i_40_++) {
	    int i_41_ = anIntArray9082[i_40_];
	    anIntArray9082[i_40_] = i_39_;
	    i_39_ += i_41_;
	    class135s[i_40_] = new Class135();
	}
	anIntArray9082[class187.anInt2106] = i_39_;
	Class196 class196 = method3009(class187, is, anInt9052);
	Class138[] class138s = new Class138[class187.anInt2092];
	for (int i_42_ = 0; i_42_ < class187.anInt2092; i_42_++) {
	    short i_43_ = class187.aShortArray2093[i_42_];
	    short i_44_ = class187.aShortArray2077[i_42_];
	    short i_45_ = class187.aShortArray2095[i_42_];
	    int i_46_ = anIntArray9034[i_44_] - anIntArray9034[i_43_];
	    int i_47_ = anIntArray9043[i_44_] - anIntArray9043[i_43_];
	    int i_48_ = anIntArray9041[i_44_] - anIntArray9041[i_43_];
	    int i_49_ = anIntArray9034[i_45_] - anIntArray9034[i_43_];
	    int i_50_ = anIntArray9043[i_45_] - anIntArray9043[i_43_];
	    int i_51_ = anIntArray9041[i_45_] - anIntArray9041[i_43_];
	    int i_52_ = i_47_ * i_51_ - i_50_ * i_48_;
	    int i_53_ = i_48_ * i_49_ - i_51_ * i_46_;
	    int i_54_;
	    for (i_54_ = i_46_ * i_50_ - i_49_ * i_47_;
		 (i_52_ > 8192 || i_53_ > 8192 || i_54_ > 8192 || i_52_ < -8192
		  || i_53_ < -8192 || i_54_ < -8192);
		 i_54_ >>= 1) {
		i_52_ >>= 1;
		i_53_ >>= 1;
	    }
	    int i_55_ = (int) Math.sqrt((double) (i_52_ * i_52_ + i_53_ * i_53_
						  + i_54_ * i_54_));
	    if (i_55_ <= 0)
		i_55_ = 1;
	    i_52_ = i_52_ * 256 / i_55_;
	    i_53_ = i_53_ * 256 / i_55_;
	    i_54_ = i_54_ * 256 / i_55_;
	    byte i_56_ = (class187.aByteArray2099 == null ? (byte) 0
			  : class187.aByteArray2099[i_42_]);
	    if (i_56_ == 0) {
		Class135 class135 = class135s[i_43_];
		class135.anInt1598 += i_52_;
		class135.anInt1597 += i_53_;
		class135.anInt1596 += i_54_;
		class135.anInt1599++;
		class135 = class135s[i_44_];
		class135.anInt1598 += i_52_;
		class135.anInt1597 += i_53_;
		class135.anInt1596 += i_54_;
		class135.anInt1599++;
		class135 = class135s[i_45_];
		class135.anInt1598 += i_52_;
		class135.anInt1597 += i_53_;
		class135.anInt1596 += i_54_;
		class135.anInt1599++;
	    } else if (i_56_ == 1) {
		Class138 class138 = class138s[i_42_] = new Class138();
		class138.anInt1607 = i_52_;
		class138.anInt1606 = i_53_;
		class138.anInt1605 = i_54_;
	    }
	}
	for (int i_57_ = 0; i_57_ < anInt9052; i_57_++) {
	    int i_58_ = is[i_57_];
	    int i_59_ = class187.aShortArray2096[i_58_] & 0xffff;
	    int i_60_ = (class187.aByteArray2101 != null
			 ? class187.aByteArray2101[i_58_] & 0xff : 0);
	    short i_61_ = (class187.aShortArray2104 == null ? (short) -1
			   : class187.aShortArray2104[i_58_]);
	    if (i_61_ != -1 && (anInt9088 & 0x40) != 0
		&& class177.method2931(i_61_, (byte) 1).aBool2072)
		i_61_ = (short) -1;
	    float f = 0.0F;
	    float f_62_ = 0.0F;
	    float f_63_ = 0.0F;
	    float f_64_ = 0.0F;
	    float f_65_ = 0.0F;
	    float f_66_ = 0.0F;
	    long l;
	    long l_67_;
	    long l_68_;
	    if (i_61_ != -1) {
		int i_69_ = (class187.aShortArray2102 != null
			     ? class187.aShortArray2102[i_58_] : -1);
		if (i_69_ == 32766) {
		    int i_70_ = class187.aByteArray2111[i_58_] & 0xff;
		    int i_71_ = class187.aByteArray2097[i_58_] & 0xff;
		    int i_72_ = class187.aByteArray2098[i_58_] & 0xff;
		    i_70_ += (class187.anIntArray2112
			      [class187.aShortArray2093[i_58_]]);
		    l_68_ = (long) i_70_;
		    i_71_ += (class187.anIntArray2112
			      [class187.aShortArray2077[i_58_]]);
		    l_67_ = (long) i_70_;
		    i_72_ += (class187.anIntArray2112
			      [class187.aShortArray2095[i_58_]]);
		    l = (long) i_70_;
		    f = class187.aFloatArray2091[i_70_];
		    f_62_ = class187.aFloatArray2084[i_70_];
		    f_63_ = class187.aFloatArray2091[i_71_];
		    f_64_ = class187.aFloatArray2084[i_71_];
		    f_65_ = class187.aFloatArray2091[i_72_];
		    f_66_ = class187.aFloatArray2084[i_72_];
		} else if (i_69_ == -1) {
		    f = 0.0F;
		    f_62_ = 1.0F;
		    l_68_ = 65535L;
		    f_63_ = 1.0F;
		    f_64_ = 1.0F;
		    l_67_ = 131071L;
		    f_65_ = 0.0F;
		    f_66_ = 0.0F;
		    l = 196607L;
		} else {
		    i_69_ &= 0xffff;
		    int i_73_ = 0;
		    int i_74_ = 0;
		    int i_75_ = 0;
		    byte i_76_ = class187.aByteArray2086[i_69_];
		    if (i_76_ == 0) {
			short i_77_ = class187.aShortArray2093[i_58_];
			short i_78_ = class187.aShortArray2077[i_58_];
			short i_79_ = class187.aShortArray2095[i_58_];
			short i_80_ = class187.aShortArray2108[i_69_];
			short i_81_ = class187.aShortArray2085[i_69_];
			short i_82_ = class187.aShortArray2114[i_69_];
			float f_83_ = (float) class187.anIntArray2083[i_80_];
			float f_84_ = (float) class187.anIntArray2080[i_80_];
			float f_85_ = (float) class187.anIntArray2113[i_80_];
			float f_86_
			    = (float) class187.anIntArray2083[i_81_] - f_83_;
			float f_87_
			    = (float) class187.anIntArray2080[i_81_] - f_84_;
			float f_88_
			    = (float) class187.anIntArray2113[i_81_] - f_85_;
			float f_89_
			    = (float) class187.anIntArray2083[i_82_] - f_83_;
			float f_90_
			    = (float) class187.anIntArray2080[i_82_] - f_84_;
			float f_91_
			    = (float) class187.anIntArray2113[i_82_] - f_85_;
			float f_92_
			    = (float) class187.anIntArray2083[i_77_] - f_83_;
			float f_93_
			    = (float) class187.anIntArray2080[i_77_] - f_84_;
			float f_94_
			    = (float) class187.anIntArray2113[i_77_] - f_85_;
			float f_95_
			    = (float) class187.anIntArray2083[i_78_] - f_83_;
			float f_96_
			    = (float) class187.anIntArray2080[i_78_] - f_84_;
			float f_97_
			    = (float) class187.anIntArray2113[i_78_] - f_85_;
			float f_98_
			    = (float) class187.anIntArray2083[i_79_] - f_83_;
			float f_99_
			    = (float) class187.anIntArray2080[i_79_] - f_84_;
			float f_100_
			    = (float) class187.anIntArray2113[i_79_] - f_85_;
			float f_101_ = f_87_ * f_91_ - f_88_ * f_90_;
			float f_102_ = f_88_ * f_89_ - f_86_ * f_91_;
			float f_103_ = f_86_ * f_90_ - f_87_ * f_89_;
			float f_104_ = f_90_ * f_103_ - f_91_ * f_102_;
			float f_105_ = f_91_ * f_101_ - f_89_ * f_103_;
			float f_106_ = f_89_ * f_102_ - f_90_ * f_101_;
			float f_107_ = 1.0F / (f_104_ * f_86_ + f_105_ * f_87_
					       + f_106_ * f_88_);
			f = ((f_104_ * f_92_ + f_105_ * f_93_ + f_106_ * f_94_)
			     * f_107_);
			f_63_ = (f_104_ * f_95_ + f_105_ * f_96_
				 + f_106_ * f_97_) * f_107_;
			f_65_ = (f_104_ * f_98_ + f_105_ * f_99_
				 + f_106_ * f_100_) * f_107_;
			f_104_ = f_87_ * f_103_ - f_88_ * f_102_;
			f_105_ = f_88_ * f_101_ - f_86_ * f_103_;
			f_106_ = f_86_ * f_102_ - f_87_ * f_101_;
			f_107_ = 1.0F / (f_104_ * f_89_ + f_105_ * f_90_
					 + f_106_ * f_91_);
			f_62_ = (f_104_ * f_92_ + f_105_ * f_93_
				 + f_106_ * f_94_) * f_107_;
			f_64_ = (f_104_ * f_95_ + f_105_ * f_96_
				 + f_106_ * f_97_) * f_107_;
			f_66_ = (f_104_ * f_98_ + f_105_ * f_99_
				 + f_106_ * f_100_) * f_107_;
		    } else {
			short i_108_ = class187.aShortArray2093[i_58_];
			short i_109_ = class187.aShortArray2077[i_58_];
			short i_110_ = class187.aShortArray2095[i_58_];
			int i_111_ = class196.anIntArray2161[i_69_];
			int i_112_ = class196.anIntArray2160[i_69_];
			int i_113_ = class196.anIntArray2162[i_69_];
			float[] fs = class196.aFloatArrayArray2163[i_69_];
			byte i_114_ = class187.aByteArray2122[i_69_];
			float f_115_
			    = (float) class187.anIntArray2118[i_69_] / 256.0F;
			if (i_76_ == 1) {
			    float f_116_
				= ((float) class187.anIntArray2117[i_69_]
				   / 1024.0F);
			    method3006(class187.anIntArray2083[i_108_],
				       class187.anIntArray2080[i_108_],
				       class187.anIntArray2113[i_108_], i_111_,
				       i_112_, i_113_, fs, f_116_, i_114_,
				       f_115_, aFloatArray9081);
			    f = aFloatArray9081[0];
			    f_62_ = aFloatArray9081[1];
			    method3006(class187.anIntArray2083[i_109_],
				       class187.anIntArray2080[i_109_],
				       class187.anIntArray2113[i_109_], i_111_,
				       i_112_, i_113_, fs, f_116_, i_114_,
				       f_115_, aFloatArray9081);
			    f_63_ = aFloatArray9081[0];
			    f_64_ = aFloatArray9081[1];
			    method3006(class187.anIntArray2083[i_110_],
				       class187.anIntArray2080[i_110_],
				       class187.anIntArray2113[i_110_], i_111_,
				       i_112_, i_113_, fs, f_116_, i_114_,
				       f_115_, aFloatArray9081);
			    f_65_ = aFloatArray9081[0];
			    f_66_ = aFloatArray9081[1];
			    float f_117_ = f_116_ / 2.0F;
			    if ((i_114_ & 0x1) == 0) {
				if (f_63_ - f > f_117_) {
				    f_63_ -= f_116_;
				    i_74_ = 1;
				} else if (f - f_63_ > f_117_) {
				    f_63_ += f_116_;
				    i_74_ = 2;
				}
				if (f_65_ - f > f_117_) {
				    f_65_ -= f_116_;
				    i_75_ = 1;
				} else if (f - f_65_ > f_117_) {
				    f_65_ += f_116_;
				    i_75_ = 2;
				}
			    } else {
				if (f_64_ - f_62_ > f_117_) {
				    f_64_ -= f_116_;
				    i_74_ = 1;
				} else if (f_62_ - f_64_ > f_117_) {
				    f_64_ += f_116_;
				    i_74_ = 2;
				}
				if (f_66_ - f_62_ > f_117_) {
				    f_66_ -= f_116_;
				    i_75_ = 1;
				} else if (f_62_ - f_66_ > f_117_) {
				    f_66_ += f_116_;
				    i_75_ = 2;
				}
			    }
			} else if (i_76_ == 2) {
			    float f_118_
				= ((float) class187.anIntArray2119[i_69_]
				   / 256.0F);
			    float f_119_
				= ((float) class187.anIntArray2120[i_69_]
				   / 256.0F);
			    int i_120_ = (class187.anIntArray2083[i_109_]
					  - class187.anIntArray2083[i_108_]);
			    int i_121_ = (class187.anIntArray2080[i_109_]
					  - class187.anIntArray2080[i_108_]);
			    int i_122_ = (class187.anIntArray2113[i_109_]
					  - class187.anIntArray2113[i_108_]);
			    int i_123_ = (class187.anIntArray2083[i_110_]
					  - class187.anIntArray2083[i_108_]);
			    int i_124_ = (class187.anIntArray2080[i_110_]
					  - class187.anIntArray2080[i_108_]);
			    int i_125_ = (class187.anIntArray2113[i_110_]
					  - class187.anIntArray2113[i_108_]);
			    int i_126_ = i_121_ * i_125_ - i_124_ * i_122_;
			    int i_127_ = i_122_ * i_123_ - i_125_ * i_120_;
			    int i_128_ = i_120_ * i_124_ - i_123_ * i_121_;
			    float f_129_
				= (64.0F
				   / (float) class187.anIntArray2115[i_69_]);
			    float f_130_
				= (64.0F
				   / (float) class187.anIntArray2116[i_69_]);
			    float f_131_
				= (64.0F
				   / (float) class187.anIntArray2117[i_69_]);
			    float f_132_ = (((float) i_126_ * fs[0]
					     + (float) i_127_ * fs[1]
					     + (float) i_128_ * fs[2])
					    / f_129_);
			    float f_133_ = (((float) i_126_ * fs[3]
					     + (float) i_127_ * fs[4]
					     + (float) i_128_ * fs[5])
					    / f_130_);
			    float f_134_ = (((float) i_126_ * fs[6]
					     + (float) i_127_ * fs[7]
					     + (float) i_128_ * fs[8])
					    / f_131_);
			    i_73_ = method3179(f_132_, f_133_, f_134_);
			    method3008(class187.anIntArray2083[i_108_],
				       class187.anIntArray2080[i_108_],
				       class187.anIntArray2113[i_108_], i_111_,
				       i_112_, i_113_, i_73_, fs, i_114_,
				       f_115_, f_118_, f_119_,
				       aFloatArray9081);
			    f = aFloatArray9081[0];
			    f_62_ = aFloatArray9081[1];
			    method3008(class187.anIntArray2083[i_109_],
				       class187.anIntArray2080[i_109_],
				       class187.anIntArray2113[i_109_], i_111_,
				       i_112_, i_113_, i_73_, fs, i_114_,
				       f_115_, f_118_, f_119_,
				       aFloatArray9081);
			    f_63_ = aFloatArray9081[0];
			    f_64_ = aFloatArray9081[1];
			    method3008(class187.anIntArray2083[i_110_],
				       class187.anIntArray2080[i_110_],
				       class187.anIntArray2113[i_110_], i_111_,
				       i_112_, i_113_, i_73_, fs, i_114_,
				       f_115_, f_118_, f_119_,
				       aFloatArray9081);
			    f_65_ = aFloatArray9081[0];
			    f_66_ = aFloatArray9081[1];
			} else if (i_76_ == 3) {
			    method3005(class187.anIntArray2083[i_108_],
				       class187.anIntArray2080[i_108_],
				       class187.anIntArray2113[i_108_], i_111_,
				       i_112_, i_113_, fs, i_114_, f_115_,
				       aFloatArray9081);
			    f = aFloatArray9081[0];
			    f_62_ = aFloatArray9081[1];
			    method3005(class187.anIntArray2083[i_109_],
				       class187.anIntArray2080[i_109_],
				       class187.anIntArray2113[i_109_], i_111_,
				       i_112_, i_113_, fs, i_114_, f_115_,
				       aFloatArray9081);
			    f_63_ = aFloatArray9081[0];
			    f_64_ = aFloatArray9081[1];
			    method3005(class187.anIntArray2083[i_110_],
				       class187.anIntArray2080[i_110_],
				       class187.anIntArray2113[i_110_], i_111_,
				       i_112_, i_113_, fs, i_114_, f_115_,
				       aFloatArray9081);
			    f_65_ = aFloatArray9081[0];
			    f_66_ = aFloatArray9081[1];
			    if ((i_114_ & 0x1) == 0) {
				if (f_63_ - f > 0.5F) {
				    f_63_--;
				    i_74_ = 1;
				} else if (f - f_63_ > 0.5F) {
				    f_63_++;
				    i_74_ = 2;
				}
				if (f_65_ - f > 0.5F) {
				    f_65_--;
				    i_75_ = 1;
				} else if (f - f_65_ > 0.5F) {
				    f_65_++;
				    i_75_ = 2;
				}
			    } else {
				if (f_64_ - f_62_ > 0.5F) {
				    f_64_--;
				    i_74_ = 1;
				} else if (f_62_ - f_64_ > 0.5F) {
				    f_64_++;
				    i_74_ = 2;
				}
				if (f_66_ - f_62_ > 0.5F) {
				    f_66_--;
				    i_75_ = 1;
				} else if (f_62_ - f_66_ > 0.5F) {
				    f_66_++;
				    i_75_ = 2;
				}
			    }
			}
		    }
		    l_68_ = (long) (i_73_ << 16 | i_69_);
		    l_67_ = (long) (i_74_ << 19) | l_68_;
		    l = (long) (i_75_ << 19) | l_68_;
		}
	    } else {
		l = 0L;
		l_67_ = 0L;
		l_68_ = 0L;
	    }
	    byte i_135_ = (class187.aByteArray2099 != null
			   ? class187.aByteArray2099[i_58_] : (byte) 0);
	    if (i_135_ == 0) {
		long l_136_ = (long) ((i_59_ << 8) + i_60_);
		short i_137_ = class187.aShortArray2093[i_58_];
		short i_138_ = class187.aShortArray2077[i_58_];
		short i_139_ = class187.aShortArray2095[i_58_];
		Class135 class135 = class135s[i_137_];
		aShortArray9056[i_57_]
		    = method14530(class187, i_137_, l_136_ | l_68_ << 24,
				  class135.anInt1598, class135.anInt1597,
				  class135.anInt1596, class135.anInt1599, f,
				  f_62_);
		class135 = class135s[i_138_];
		aShortArray9031[i_57_]
		    = method14530(class187, i_138_, l_136_ | l_67_ << 24,
				  class135.anInt1598, class135.anInt1597,
				  class135.anInt1596, class135.anInt1599,
				  f_63_, f_64_);
		class135 = class135s[i_139_];
		aShortArray9058[i_57_]
		    = method14530(class187, i_139_, l_136_ | l << 24,
				  class135.anInt1598, class135.anInt1597,
				  class135.anInt1596, class135.anInt1599,
				  f_65_, f_66_);
	    } else if (i_135_ == 1) {
		Class138 class138 = class138s[i_58_];
		long l_140_ = (((long) (class138.anInt1607 & ~0x7fffffff) << 9)
			       + ((long) (class138.anInt1606 + 256) << 32)
			       + ((long) (class138.anInt1605 + 256) << 24)
			       + (long) (i_59_ << 8) + (long) i_60_);
		aShortArray9056[i_57_]
		    = method14530(class187, class187.aShortArray2093[i_58_],
				  l_140_ | l_68_ << 41, class138.anInt1607,
				  class138.anInt1606, class138.anInt1605, 0, f,
				  f_62_);
		aShortArray9031[i_57_]
		    = method14530(class187, class187.aShortArray2077[i_58_],
				  l_140_ | l_68_ << 41, class138.anInt1607,
				  class138.anInt1606, class138.anInt1605, 0,
				  f_63_, f_64_);
		aShortArray9058[i_57_]
		    = method14530(class187, class187.aShortArray2095[i_58_],
				  l_140_ | l_68_ << 41, class138.anInt1607,
				  class138.anInt1606, class138.anInt1605, 0,
				  f_65_, f_66_);
	    }
	    if (class187.aByteArray2101 != null)
		aByteArray9055[i_57_] = class187.aByteArray2101[i_58_];
	    if (class187.aShortArray2094 != null)
		aShortArray9061[i_57_] = class187.aShortArray2094[i_58_];
	    aShortArray9054[i_57_] = class187.aShortArray2096[i_58_];
	    aShortArray9059[i_57_] = i_61_;
	}
	int i_141_ = 0;
	short i_142_ = -10000;
	for (int i_143_ = 0; i_143_ < anInt9053; i_143_++) {
	    short i_144_ = aShortArray9059[i_143_];
	    if (i_144_ != i_142_) {
		i_141_++;
		i_142_ = i_144_;
	    }
	}
	anIntArray9060 = new int[i_141_ + 1];
	i_141_ = 0;
	i_142_ = (short) -10000;
	for (int i_145_ = 0; i_145_ < anInt9053; i_145_++) {
	    short i_146_ = aShortArray9059[i_145_];
	    if (i_146_ != i_142_) {
		anIntArray9060[i_141_++] = i_145_;
		i_142_ = i_146_;
	    }
	}
	anIntArray9060[i_141_] = anInt9053;
	aLongArray9090 = null;
	aShortArray9045 = method14553(aShortArray9045, anInt9044);
	aShortArray9042 = method14553(aShortArray9042, anInt9044);
	aShortArray9047 = method14553(aShortArray9047, anInt9044);
	aByteArray9050 = method14537(aByteArray9050, anInt9044);
	aFloatArray9022 = method14531(aFloatArray9022, anInt9044);
	aFloatArray9051 = method14531(aFloatArray9051, anInt9044);
	if (class187.anIntArray2087 != null
	    && Class127.method2253(i, anInt9088))
	    anIntArrayArray9028 = class187.method3716(false);
	if (class187.aClass168Array2125 != null
	    && Class127.method2209(i, anInt9088))
	    anIntArrayArray9089 = class187.method3718();
	if (class187.anIntArray2090 != null
	    && Class127.method2224(i, anInt9088)) {
	    int i_147_ = 0;
	    int[] is_148_ = new int[256];
	    for (int i_149_ = 0; i_149_ < anInt9052; i_149_++) {
		int i_150_ = class187.anIntArray2090[is[i_149_]];
		if (i_150_ >= 0) {
		    is_148_[i_150_]++;
		    if (i_150_ > i_147_)
			i_147_ = i_150_;
		}
	    }
	    anIntArrayArray9073 = new int[i_147_ + 1][];
	    for (int i_151_ = 0; i_151_ <= i_147_; i_151_++) {
		anIntArrayArray9073[i_151_] = new int[is_148_[i_151_]];
		is_148_[i_151_] = 0;
	    }
	    for (int i_152_ = 0; i_152_ < anInt9052; i_152_++) {
		int i_153_ = class187.anIntArray2090[is[i_152_]];
		if (i_153_ >= 0)
		    anIntArrayArray9073[i_153_][is_148_[i_153_]++] = i_152_;
	    }
	}
    }
    
    short method14530(Class187 class187, int i, long l, int i_154_, int i_155_,
		      int i_156_, int i_157_, float f, float f_158_) {
	int i_159_ = anIntArray9082[i];
	int i_160_ = anIntArray9082[i + 1];
	int i_161_ = 0;
	for (int i_162_ = i_159_; i_162_ < i_160_; i_162_++) {
	    if (aShortArray9083[i_162_] == 0) {
		i_161_ = i_162_;
		break;
	    }
	    int i_163_ = (aShortArray9083[i_162_] & 0xffff) - 1;
	    if (aLongArray9090[i_162_] == l)
		return (short) i_163_;
	}
	aShortArray9083[i_161_] = (short) (anInt9044 + 1);
	aLongArray9090[i_161_] = l;
	aShortArray9045[anInt9044] = (short) i_154_;
	aShortArray9042[anInt9044] = (short) i_155_;
	aShortArray9047[anInt9044] = (short) i_156_;
	aByteArray9050[anInt9044] = (byte) i_157_;
	aFloatArray9022[anInt9044] = f;
	aFloatArray9051[anInt9044] = f_158_;
	return (short) anInt9044++;
    }
    
    public int method3134() {
	if (!aBool9075)
	    method14533();
	return aShort9033;
    }
    
    public boolean method3170() {
	if (aShortArray9059 == null)
	    return true;
	for (int i = 0; i < aShortArray9059.length; i++) {
	    if (aShortArray9059[i] != -1) {
		Class186 class186
		    = aClass185_Sub3_9029.aClass177_2012
			  .method2931(aShortArray9059[i] & 0xffff, (byte) 1);
		if (class186.aBool2043
		    && !aClass185_Sub3_9029.aClass161_9659
			    .method2624(Class598.aClass598_7865, class186, -1))
		    return false;
	    }
	}
	return true;
    }
    
    static float[] method14531(float[] fs, int i) {
	float[] fs_164_ = new float[i];
	System.arraycopy(fs, 0, fs_164_, 0, i);
	return fs_164_;
    }
    
    public int method3101() {
	return anInt9030;
    }
    
    public int method3052() {
	if (!aBool9075)
	    method14533();
	return aShort9074;
    }
    
    public void method3014() {
	if (anInt9044 > 0 && anInt9053 > 0) {
	    method14542(false);
	    if ((aByte9065 & 0x10) == 0
		&& aClass132_9066.anInterface16_1580 == null)
		method14541(false);
	    method14556();
	}
    }
    
    public Class183 method3011(byte i, int i_165_, boolean bool) {
	boolean bool_166_ = false;
	Class183_Sub1 class183_sub1_167_;
	Class183_Sub1 class183_sub1_168_;
	if (i > 0 && i <= 8) {
	    class183_sub1_168_
		= aClass185_Sub3_9029.aClass183_Sub1Array9709[i - 1];
	    class183_sub1_167_
		= aClass185_Sub3_9029.aClass183_Sub1Array9707[i - 1];
	    bool_166_ = true;
	} else
	    class183_sub1_167_ = class183_sub1_168_
		= new Class183_Sub1(aClass185_Sub3_9029);
	return method14532(class183_sub1_167_, class183_sub1_168_, i_165_,
			   bool_166_, bool);
    }
    
    Class183 method14532(Class183_Sub1 class183_sub1_169_,
			 Class183_Sub1 class183_sub1_170_, int i, boolean bool,
			 boolean bool_171_) {
	class183_sub1_169_.aByte9065 = (byte) 0;
	class183_sub1_169_.anInt9030 = i;
	class183_sub1_169_.anInt9088 = anInt9088;
	class183_sub1_169_.aShort9040 = aShort9040;
	class183_sub1_169_.aShort9046 = aShort9046;
	class183_sub1_169_.anInt9037 = anInt9037;
	class183_sub1_169_.anInt9057 = anInt9057;
	class183_sub1_169_.anInt9044 = anInt9044;
	class183_sub1_169_.anInt9052 = anInt9052;
	class183_sub1_169_.anInt9053 = anInt9053;
	class183_sub1_169_.anInt9086 = anInt9086;
	if ((i & 0x100) != 0)
	    class183_sub1_169_.aBool9035 = true;
	else
	    class183_sub1_169_.aBool9035 = aBool9035;
	class183_sub1_169_.aBool9036 = aBool9036;
	boolean bool_172_ = Class127.method2226(i, anInt9088);
	boolean bool_173_ = Class127.method2196(i, anInt9088);
	boolean bool_174_ = Class127.method2197(i, anInt9088);
	boolean bool_175_ = bool_172_ | bool_173_ | bool_174_;
	if (bool_175_) {
	    if (bool_172_) {
		if (class183_sub1_170_.anIntArray9034 == null
		    || class183_sub1_170_.anIntArray9034.length < anInt9037)
		    class183_sub1_169_.anIntArray9034
			= class183_sub1_170_.anIntArray9034
			= new int[anInt9037];
		else
		    class183_sub1_169_.anIntArray9034
			= class183_sub1_170_.anIntArray9034;
	    } else
		class183_sub1_169_.anIntArray9034 = anIntArray9034;
	    if (bool_173_) {
		if (class183_sub1_170_.anIntArray9043 == null
		    || class183_sub1_170_.anIntArray9043.length < anInt9037)
		    class183_sub1_169_.anIntArray9043
			= class183_sub1_170_.anIntArray9043
			= new int[anInt9037];
		else
		    class183_sub1_169_.anIntArray9043
			= class183_sub1_170_.anIntArray9043;
	    } else
		class183_sub1_169_.anIntArray9043 = anIntArray9043;
	    if (bool_174_) {
		if (class183_sub1_170_.anIntArray9041 == null
		    || class183_sub1_170_.anIntArray9041.length < anInt9037)
		    class183_sub1_169_.anIntArray9041
			= class183_sub1_170_.anIntArray9041
			= new int[anInt9037];
		else
		    class183_sub1_169_.anIntArray9041
			= class183_sub1_170_.anIntArray9041;
	    } else
		class183_sub1_169_.anIntArray9041 = anIntArray9041;
	    for (int i_176_ = 0; i_176_ < anInt9037; i_176_++) {
		if (bool_172_)
		    class183_sub1_169_.anIntArray9034[i_176_]
			= anIntArray9034[i_176_];
		if (bool_173_)
		    class183_sub1_169_.anIntArray9043[i_176_]
			= anIntArray9043[i_176_];
		if (bool_174_)
		    class183_sub1_169_.anIntArray9041[i_176_]
			= anIntArray9041[i_176_];
	    }
	} else {
	    class183_sub1_169_.anIntArray9034 = anIntArray9034;
	    class183_sub1_169_.anIntArray9043 = anIntArray9043;
	    class183_sub1_169_.anIntArray9041 = anIntArray9041;
	}
	if (Class127.method2236(i, anInt9088)) {
	    if (bool)
		class183_sub1_169_.aByte9065 |= 0x1;
	    class183_sub1_169_.aClass129_9062
		= class183_sub1_170_.aClass129_9062;
	    class183_sub1_169_.aClass129_9062.aByte1518
		= aClass129_9062.aByte1518;
	    class183_sub1_169_.aClass129_9062.anInterface15_1519
		= aClass129_9062.anInterface15_1519;
	} else if (Class127.method2207(i, anInt9088))
	    class183_sub1_169_.aClass129_9062 = aClass129_9062;
	else
	    class183_sub1_169_.aClass129_9062 = null;
	if (Class127.method2225(i, anInt9088)) {
	    if (class183_sub1_170_.aShortArray9054 == null
		|| class183_sub1_170_.aShortArray9054.length < anInt9052)
		class183_sub1_169_.aShortArray9054
		    = class183_sub1_170_.aShortArray9054
		    = new short[anInt9052];
	    else
		class183_sub1_169_.aShortArray9054
		    = class183_sub1_170_.aShortArray9054;
	    for (int i_177_ = 0; i_177_ < anInt9052; i_177_++)
		class183_sub1_169_.aShortArray9054[i_177_]
		    = aShortArray9054[i_177_];
	} else
	    class183_sub1_169_.aShortArray9054 = aShortArray9054;
	if (Class127.method2201(i, anInt9088)) {
	    if (class183_sub1_170_.aByteArray9055 == null
		|| class183_sub1_170_.aByteArray9055.length < anInt9052)
		class183_sub1_169_.aByteArray9055
		    = class183_sub1_170_.aByteArray9055 = new byte[anInt9052];
	    else
		class183_sub1_169_.aByteArray9055
		    = class183_sub1_170_.aByteArray9055;
	    for (int i_178_ = 0; i_178_ < anInt9052; i_178_++)
		class183_sub1_169_.aByteArray9055[i_178_]
		    = aByteArray9055[i_178_];
	} else
	    class183_sub1_169_.aByteArray9055 = aByteArray9055;
	if (Class127.method2212(i, anInt9088)) {
	    if (bool)
		class183_sub1_169_.aByte9065 |= 0x2;
	    class183_sub1_169_.aClass129_9079
		= class183_sub1_170_.aClass129_9079;
	    class183_sub1_169_.aClass129_9079.aByte1518
		= aClass129_9079.aByte1518;
	    class183_sub1_169_.aClass129_9079.anInterface15_1519
		= aClass129_9079.anInterface15_1519;
	} else if (Class127.method2270(i, anInt9088))
	    class183_sub1_169_.aClass129_9079 = aClass129_9079;
	else
	    class183_sub1_169_.aClass129_9079 = null;
	if (Class127.method2241(i, anInt9088)) {
	    if (class183_sub1_170_.aShortArray9045 == null
		|| class183_sub1_170_.aShortArray9045.length < anInt9044) {
		int i_179_ = anInt9044;
		class183_sub1_169_.aShortArray9045
		    = class183_sub1_170_.aShortArray9045 = new short[i_179_];
		class183_sub1_169_.aShortArray9042
		    = class183_sub1_170_.aShortArray9042 = new short[i_179_];
		class183_sub1_169_.aShortArray9047
		    = class183_sub1_170_.aShortArray9047 = new short[i_179_];
	    } else {
		class183_sub1_169_.aShortArray9045
		    = class183_sub1_170_.aShortArray9045;
		class183_sub1_169_.aShortArray9042
		    = class183_sub1_170_.aShortArray9042;
		class183_sub1_169_.aShortArray9047
		    = class183_sub1_170_.aShortArray9047;
	    }
	    if (aClass152_9049 != null) {
		if (class183_sub1_170_.aClass152_9049 == null)
		    class183_sub1_170_.aClass152_9049 = new Class152();
		Class152 class152 = (class183_sub1_169_.aClass152_9049
				     = class183_sub1_170_.aClass152_9049);
		if (class152.aShortArray1708 == null
		    || class152.aShortArray1708.length < anInt9044) {
		    int i_180_ = anInt9044;
		    class152.aShortArray1708 = new short[i_180_];
		    class152.aShortArray1707 = new short[i_180_];
		    class152.aShortArray1706 = new short[i_180_];
		    class152.aByteArray1709 = new byte[i_180_];
		}
		for (int i_181_ = 0; i_181_ < anInt9044; i_181_++) {
		    class183_sub1_169_.aShortArray9045[i_181_]
			= aShortArray9045[i_181_];
		    class183_sub1_169_.aShortArray9042[i_181_]
			= aShortArray9042[i_181_];
		    class183_sub1_169_.aShortArray9047[i_181_]
			= aShortArray9047[i_181_];
		    class152.aShortArray1708[i_181_]
			= aClass152_9049.aShortArray1708[i_181_];
		    class152.aShortArray1707[i_181_]
			= aClass152_9049.aShortArray1707[i_181_];
		    class152.aShortArray1706[i_181_]
			= aClass152_9049.aShortArray1706[i_181_];
		    class152.aByteArray1709[i_181_]
			= aClass152_9049.aByteArray1709[i_181_];
		}
	    } else {
		for (int i_182_ = 0; i_182_ < anInt9044; i_182_++) {
		    class183_sub1_169_.aShortArray9045[i_182_]
			= aShortArray9045[i_182_];
		    class183_sub1_169_.aShortArray9042[i_182_]
			= aShortArray9042[i_182_];
		    class183_sub1_169_.aShortArray9047[i_182_]
			= aShortArray9047[i_182_];
		}
	    }
	    class183_sub1_169_.aByteArray9050 = aByteArray9050;
	} else {
	    class183_sub1_169_.aClass152_9049 = aClass152_9049;
	    class183_sub1_169_.aShortArray9045 = aShortArray9045;
	    class183_sub1_169_.aShortArray9042 = aShortArray9042;
	    class183_sub1_169_.aShortArray9047 = aShortArray9047;
	    class183_sub1_169_.aByteArray9050 = aByteArray9050;
	}
	if (Class127.method2213(i, anInt9088)) {
	    if (bool)
		class183_sub1_169_.aByte9065 |= 0x4;
	    class183_sub1_169_.aClass129_9064
		= class183_sub1_170_.aClass129_9064;
	    class183_sub1_169_.aClass129_9064.aByte1518
		= aClass129_9064.aByte1518;
	    class183_sub1_169_.aClass129_9064.anInterface15_1519
		= aClass129_9064.anInterface15_1519;
	} else if (Class127.method2293(i, anInt9088))
	    class183_sub1_169_.aClass129_9064 = aClass129_9064;
	else
	    class183_sub1_169_.aClass129_9064 = null;
	if (Class127.method2202(i, anInt9088)) {
	    if (class183_sub1_170_.aFloatArray9022 == null
		|| class183_sub1_170_.aFloatArray9022.length < anInt9052) {
		int i_183_ = anInt9044;
		class183_sub1_169_.aFloatArray9022
		    = class183_sub1_170_.aFloatArray9022 = new float[i_183_];
		class183_sub1_169_.aFloatArray9051
		    = class183_sub1_170_.aFloatArray9051 = new float[i_183_];
	    } else {
		class183_sub1_169_.aFloatArray9022
		    = class183_sub1_170_.aFloatArray9022;
		class183_sub1_169_.aFloatArray9051
		    = class183_sub1_170_.aFloatArray9051;
	    }
	    for (int i_184_ = 0; i_184_ < anInt9044; i_184_++) {
		class183_sub1_169_.aFloatArray9022[i_184_]
		    = aFloatArray9022[i_184_];
		class183_sub1_169_.aFloatArray9051[i_184_]
		    = aFloatArray9051[i_184_];
	    }
	} else {
	    class183_sub1_169_.aFloatArray9022 = aFloatArray9022;
	    class183_sub1_169_.aFloatArray9051 = aFloatArray9051;
	}
	if (Class127.method2198(i, anInt9088)) {
	    if (bool)
		class183_sub1_169_.aByte9065 |= 0x8;
	    class183_sub1_169_.aClass129_9091
		= class183_sub1_170_.aClass129_9091;
	    class183_sub1_169_.aClass129_9091.aByte1518
		= aClass129_9091.aByte1518;
	    class183_sub1_169_.aClass129_9091.anInterface15_1519
		= aClass129_9091.anInterface15_1519;
	} else if (Class127.method2210(i, anInt9088))
	    class183_sub1_169_.aClass129_9091 = aClass129_9091;
	else
	    class183_sub1_169_.aClass129_9091 = null;
	if (Class127.method2203(i, anInt9088)) {
	    if (class183_sub1_170_.aShortArray9056 == null
		|| class183_sub1_170_.aShortArray9056.length < anInt9052) {
		int i_185_ = anInt9052;
		class183_sub1_169_.aShortArray9056
		    = class183_sub1_170_.aShortArray9056 = new short[i_185_];
		class183_sub1_169_.aShortArray9031
		    = class183_sub1_170_.aShortArray9031 = new short[i_185_];
		class183_sub1_169_.aShortArray9058
		    = class183_sub1_170_.aShortArray9058 = new short[i_185_];
	    } else {
		class183_sub1_169_.aShortArray9056
		    = class183_sub1_170_.aShortArray9056;
		class183_sub1_169_.aShortArray9031
		    = class183_sub1_170_.aShortArray9031;
		class183_sub1_169_.aShortArray9058
		    = class183_sub1_170_.aShortArray9058;
	    }
	    for (int i_186_ = 0; i_186_ < anInt9052; i_186_++) {
		class183_sub1_169_.aShortArray9056[i_186_]
		    = aShortArray9056[i_186_];
		class183_sub1_169_.aShortArray9031[i_186_]
		    = aShortArray9031[i_186_];
		class183_sub1_169_.aShortArray9058[i_186_]
		    = aShortArray9058[i_186_];
	    }
	} else {
	    class183_sub1_169_.aShortArray9056 = aShortArray9056;
	    class183_sub1_169_.aShortArray9031 = aShortArray9031;
	    class183_sub1_169_.aShortArray9058 = aShortArray9058;
	}
	if (Class127.method2216(i, anInt9088)) {
	    if (bool)
		class183_sub1_169_.aByte9065 |= 0x10;
	    class183_sub1_169_.aClass132_9066
		= class183_sub1_170_.aClass132_9066;
	    class183_sub1_169_.aClass132_9066.anInterface16_1580
		= aClass132_9066.anInterface16_1580;
	} else if (Class127.method2257(i, anInt9088))
	    class183_sub1_169_.aClass132_9066 = aClass132_9066;
	else
	    class183_sub1_169_.aClass132_9066 = null;
	if (Class127.method2204(i, anInt9088)) {
	    if (class183_sub1_170_.aShortArray9059 == null
		|| class183_sub1_170_.aShortArray9059.length < anInt9052) {
		int i_187_ = anInt9052;
		class183_sub1_169_.aShortArray9059
		    = class183_sub1_170_.aShortArray9059 = new short[i_187_];
	    } else
		class183_sub1_169_.aShortArray9059
		    = class183_sub1_170_.aShortArray9059;
	    for (int i_188_ = 0; i_188_ < anInt9052; i_188_++)
		class183_sub1_169_.aShortArray9059[i_188_]
		    = aShortArray9059[i_188_];
	} else
	    class183_sub1_169_.aShortArray9059 = aShortArray9059;
	if (Class127.method2222(i, anInt9088)) {
	    if (class183_sub1_170_.aClass133Array9070 == null
		|| class183_sub1_170_.aClass133Array9070.length < anInt9086) {
		int i_189_ = anInt9086;
		class183_sub1_169_.aClass133Array9070
		    = class183_sub1_170_.aClass133Array9070
		    = new Class133[i_189_];
		for (int i_190_ = 0; i_190_ < anInt9086; i_190_++)
		    class183_sub1_169_.aClass133Array9070[i_190_]
			= aClass133Array9070[i_190_].method2315();
	    } else {
		class183_sub1_169_.aClass133Array9070
		    = class183_sub1_170_.aClass133Array9070;
		for (int i_191_ = 0; i_191_ < anInt9086; i_191_++)
		    class183_sub1_169_.aClass133Array9070[i_191_]
			.method2311(aClass133Array9070[i_191_]);
	    }
	} else
	    class183_sub1_169_.aClass133Array9070 = aClass133Array9070;
	class183_sub1_169_.aClass149Array9087 = aClass149Array9087;
	if (aBool9075) {
	    class183_sub1_169_.anInt9069 = anInt9069;
	    class183_sub1_169_.anInt9023 = anInt9023;
	    class183_sub1_169_.aShort9033 = aShort9033;
	    class183_sub1_169_.aShort9076 = aShort9076;
	    class183_sub1_169_.aShort9072 = aShort9072;
	    class183_sub1_169_.aShort9074 = aShort9074;
	    class183_sub1_169_.aShort9077 = aShort9077;
	    class183_sub1_169_.aShort9078 = aShort9078;
	    class183_sub1_169_.aBool9075 = true;
	} else
	    class183_sub1_169_.aBool9075 = false;
	if (aBool9038) {
	    class183_sub1_169_.aShort9080 = aShort9080;
	    class183_sub1_169_.aBool9038 = true;
	} else
	    class183_sub1_169_.aBool9038 = false;
	class183_sub1_169_.anIntArrayArray9028 = anIntArrayArray9028;
	class183_sub1_169_.anIntArrayArray9073 = anIntArrayArray9073;
	class183_sub1_169_.anIntArrayArray9089 = anIntArrayArray9089;
	class183_sub1_169_.aShortArray9083 = aShortArray9083;
	class183_sub1_169_.anIntArray9082 = anIntArray9082;
	class183_sub1_169_.aShortArray9048 = aShortArray9048;
	class183_sub1_169_.aShortArray9061 = aShortArray9061;
	class183_sub1_169_.anIntArray9060 = anIntArray9060;
	class183_sub1_169_.aClass172Array9084 = aClass172Array9084;
	class183_sub1_169_.aClass158Array9085 = aClass158Array9085;
	return class183_sub1_169_;
    }
    
    public void method3155(byte i, byte[] is) {
	if (is == null) {
	    for (int i_192_ = 0; i_192_ < anInt9052; i_192_++)
		aByteArray9055[i_192_] = i;
	} else {
	    for (int i_193_ = 0; i_193_ < anInt9052; i_193_++) {
		int i_194_ = 255 - ((255 - (is[i_193_] & 0xff))
				    * (255 - (i & 0xff)) / 255);
		aByteArray9055[i_193_] = (byte) i_194_;
	    }
	}
	if (aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
    }
    
    public void method3015(int i) {
	int i_195_ = Class427.anIntArray4806[i];
	int i_196_ = Class427.anIntArray4805[i];
	for (int i_197_ = 0; i_197_ < anInt9057; i_197_++) {
	    int i_198_ = ((anIntArray9041[i_197_] * i_195_
			   + anIntArray9034[i_197_] * i_196_)
			  >> 14);
	    anIntArray9041[i_197_] = (anIntArray9041[i_197_] * i_196_
				      - anIntArray9034[i_197_] * i_195_) >> 14;
	    anIntArray9034[i_197_] = i_198_;
	}
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	aBool9075 = false;
    }
    
    public void method3016(int i) {
	int i_199_ = Class427.anIntArray4806[i];
	int i_200_ = Class427.anIntArray4805[i];
	for (int i_201_ = 0; i_201_ < anInt9057; i_201_++) {
	    int i_202_ = ((anIntArray9041[i_201_] * i_199_
			   + anIntArray9034[i_201_] * i_200_)
			  >> 14);
	    anIntArray9041[i_201_] = (anIntArray9041[i_201_] * i_200_
				      - anIntArray9034[i_201_] * i_199_) >> 14;
	    anIntArray9034[i_201_] = i_202_;
	}
	for (int i_203_ = 0; i_203_ < anInt9044; i_203_++) {
	    int i_204_ = ((aShortArray9047[i_203_] * i_199_
			   + aShortArray9045[i_203_] * i_200_)
			  >> 14);
	    aShortArray9047[i_203_]
		= (short) ((aShortArray9047[i_203_] * i_200_
			    - aShortArray9045[i_203_] * i_199_)
			   >> 14);
	    aShortArray9045[i_203_] = (short) i_204_;
	}
	if (aClass129_9064 == null && aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
	if (aClass129_9064 != null)
	    aClass129_9064.anInterface15_1519 = null;
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	aBool9075 = false;
    }
    
    public void method3017(int i) {
	int i_205_ = Class427.anIntArray4806[i];
	int i_206_ = Class427.anIntArray4805[i];
	for (int i_207_ = 0; i_207_ < anInt9057; i_207_++) {
	    int i_208_ = ((anIntArray9043[i_207_] * i_206_
			   - anIntArray9041[i_207_] * i_205_)
			  >> 14);
	    anIntArray9041[i_207_] = (anIntArray9043[i_207_] * i_205_
				      + anIntArray9041[i_207_] * i_206_) >> 14;
	    anIntArray9043[i_207_] = i_208_;
	}
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	aBool9075 = false;
    }
    
    public void method3018(int i) {
	int i_209_ = Class427.anIntArray4806[i];
	int i_210_ = Class427.anIntArray4805[i];
	for (int i_211_ = 0; i_211_ < anInt9057; i_211_++) {
	    int i_212_ = ((anIntArray9043[i_211_] * i_209_
			   + anIntArray9034[i_211_] * i_210_)
			  >> 14);
	    anIntArray9043[i_211_] = (anIntArray9043[i_211_] * i_210_
				      - anIntArray9034[i_211_] * i_209_) >> 14;
	    anIntArray9034[i_211_] = i_212_;
	}
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	aBool9075 = false;
    }
    
    public void method3098(int i, int i_213_, int i_214_) {
	for (int i_215_ = 0; i_215_ < anInt9057; i_215_++) {
	    if (i != 0)
		anIntArray9034[i_215_] += i;
	    if (i_213_ != 0)
		anIntArray9043[i_215_] += i_213_;
	    if (i_214_ != 0)
		anIntArray9041[i_215_] += i_214_;
	}
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	aBool9075 = false;
    }
    
    public int method3046() {
	if (!aBool9075)
	    method14533();
	return aShort9074;
    }
    
    public void method3021(int i, int i_216_, int i_217_) {
	for (int i_218_ = 0; i_218_ < anInt9057; i_218_++) {
	    if (i != 128)
		anIntArray9034[i_218_] = anIntArray9034[i_218_] * i >> 7;
	    if (i_216_ != 128)
		anIntArray9043[i_218_] = anIntArray9043[i_218_] * i_216_ >> 7;
	    if (i_217_ != 128)
		anIntArray9041[i_218_] = anIntArray9041[i_218_] * i_217_ >> 7;
	}
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	aBool9075 = false;
    }
    
    public void method3146(int i) {
	aShort9040 = (short) i;
	if (aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
    }
    
    void method14533() {
	int i = 32767;
	int i_219_ = 32767;
	int i_220_ = 32767;
	int i_221_ = -32768;
	int i_222_ = -32768;
	int i_223_ = -32768;
	int i_224_ = 0;
	int i_225_ = 0;
	for (int i_226_ = 0; i_226_ < anInt9057; i_226_++) {
	    int i_227_ = anIntArray9034[i_226_];
	    int i_228_ = anIntArray9043[i_226_];
	    int i_229_ = anIntArray9041[i_226_];
	    if (i_227_ < i)
		i = i_227_;
	    if (i_227_ > i_221_)
		i_221_ = i_227_;
	    if (i_228_ < i_219_)
		i_219_ = i_228_;
	    if (i_228_ > i_222_)
		i_222_ = i_228_;
	    if (i_229_ < i_220_)
		i_220_ = i_229_;
	    if (i_229_ > i_223_)
		i_223_ = i_229_;
	    int i_230_ = i_227_ * i_227_ + i_229_ * i_229_;
	    if (i_230_ > i_224_)
		i_224_ = i_230_;
	    i_230_ = i_227_ * i_227_ + i_229_ * i_229_ + i_228_ * i_228_;
	    if (i_230_ > i_225_)
		i_225_ = i_230_;
	}
	aShort9033 = (short) i;
	aShort9076 = (short) i_221_;
	aShort9072 = (short) i_219_;
	aShort9074 = (short) i_222_;
	aShort9077 = (short) i_220_;
	aShort9078 = (short) i_223_;
	anInt9023 = (int) (Math.sqrt((double) i_224_) + 0.99);
	anInt9069 = (int) (Math.sqrt((double) i_225_) + 0.99);
	aBool9075 = true;
    }
    
    public int method3019() {
	return anInt9030;
    }
    
    public int method3041() {
	if (!aBool9075)
	    method14533();
	return anInt9023;
    }
    
    void method3057() {
	/* empty */
    }
    
    public void method3133(Class446 class446, int i, boolean bool) {
	if (aShortArray9048 != null) {
	    Class446 class446_231_ = class446;
	    if (bool) {
		class446_231_ = aClass185_Sub3_9029.aClass446_9618;
		class446_231_.method7242(class446);
	    }
	    float[] fs = new float[3];
	    for (int i_232_ = 0; i_232_ < anInt9057; i_232_++) {
		if ((i & aShortArray9048[i_232_]) != 0) {
		    class446_231_.method7255((float) anIntArray9034[i_232_],
					     (float) anIntArray9043[i_232_],
					     (float) anIntArray9041[i_232_],
					     fs);
		    anIntArray9034[i_232_] = (int) fs[0];
		    anIntArray9043[i_232_] = (int) fs[1];
		    anIntArray9041[i_232_] = (int) fs[2];
		}
	    }
	}
    }
    
    public int method3043() {
	if (!aBool9075)
	    method14533();
	return aShort9076;
    }
    
    void method14534(boolean bool) {
	if ((aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716
	     .aByteArray10810).length
	    < anInt9053 * 6)
	    aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716
		= new Class534_Sub40_Sub2((anInt9053 + 100) * 6);
	else
	    aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716.anInt10811 = 0;
	Class534_Sub40_Sub2 class534_sub40_sub2
	    = aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716;
	if (aClass185_Sub3_9029.aBool9566) {
	    for (int i = 0; i < anInt9053; i++) {
		class534_sub40_sub2.method16507(aShortArray9056[i],
						1860976760);
		class534_sub40_sub2.method16507(aShortArray9031[i],
						1805502833);
		class534_sub40_sub2.method16507(aShortArray9058[i],
						1336631588);
	    }
	} else {
	    for (int i = 0; i < anInt9053; i++) {
		class534_sub40_sub2.method16721(aShortArray9056[i],
						1203548667);
		class534_sub40_sub2.method16721(aShortArray9031[i],
						1203548667);
		class534_sub40_sub2.method16721(aShortArray9058[i],
						1203548667);
	    }
	}
	if (class534_sub40_sub2.anInt10811 * 31645619 != 0) {
	    if (bool) {
		if (anInterface16_9067 == null)
		    anInterface16_9067
			= (aClass185_Sub3_9029.method15217
			   (5123, class534_sub40_sub2.aByteArray10810,
			    class534_sub40_sub2.anInt10811 * 31645619, true));
		else
		    anInterface16_9067.method101
			(5123, class534_sub40_sub2.aByteArray10810,
			 class534_sub40_sub2.anInt10811 * 31645619);
		aClass132_9066.anInterface16_1580 = anInterface16_9067;
	    } else
		aClass132_9066.anInterface16_1580
		    = (aClass185_Sub3_9029.method15217
		       (5123, class534_sub40_sub2.aByteArray10810,
			class534_sub40_sub2.anInt10811 * 31645619, false));
	    if (!bool)
		aBool9093 = true;
	}
    }
    
    public void method3067(Class183 class183, int i, int i_233_, int i_234_,
			   boolean bool) {
	Class183_Sub1 class183_sub1_235_ = (Class183_Sub1) class183;
	if (anInt9052 != 0 && class183_sub1_235_.anInt9052 != 0) {
	    int i_236_ = class183_sub1_235_.anInt9057;
	    int[] is = class183_sub1_235_.anIntArray9034;
	    int[] is_237_ = class183_sub1_235_.anIntArray9043;
	    int[] is_238_ = class183_sub1_235_.anIntArray9041;
	    short[] is_239_ = class183_sub1_235_.aShortArray9045;
	    short[] is_240_ = class183_sub1_235_.aShortArray9042;
	    short[] is_241_ = class183_sub1_235_.aShortArray9047;
	    byte[] is_242_ = class183_sub1_235_.aByteArray9050;
	    short[] is_243_;
	    short[] is_244_;
	    short[] is_245_;
	    byte[] is_246_;
	    if (aClass152_9049 != null) {
		is_243_ = aClass152_9049.aShortArray1708;
		is_244_ = aClass152_9049.aShortArray1707;
		is_245_ = aClass152_9049.aShortArray1706;
		is_246_ = aClass152_9049.aByteArray1709;
	    } else {
		is_243_ = null;
		is_244_ = null;
		is_245_ = null;
		is_246_ = null;
	    }
	    short[] is_247_;
	    short[] is_248_;
	    short[] is_249_;
	    byte[] is_250_;
	    if (class183_sub1_235_.aClass152_9049 != null) {
		is_247_ = class183_sub1_235_.aClass152_9049.aShortArray1708;
		is_248_ = class183_sub1_235_.aClass152_9049.aShortArray1707;
		is_249_ = class183_sub1_235_.aClass152_9049.aShortArray1706;
		is_250_ = class183_sub1_235_.aClass152_9049.aByteArray1709;
	    } else {
		is_247_ = null;
		is_248_ = null;
		is_249_ = null;
		is_250_ = null;
	    }
	    int[] is_251_ = class183_sub1_235_.anIntArray9082;
	    short[] is_252_ = class183_sub1_235_.aShortArray9083;
	    if (!class183_sub1_235_.aBool9075)
		class183_sub1_235_.method14533();
	    int i_253_ = class183_sub1_235_.aShort9072;
	    int i_254_ = class183_sub1_235_.aShort9074;
	    int i_255_ = class183_sub1_235_.aShort9033;
	    int i_256_ = class183_sub1_235_.aShort9076;
	    int i_257_ = class183_sub1_235_.aShort9077;
	    int i_258_ = class183_sub1_235_.aShort9078;
	    for (int i_259_ = 0; i_259_ < anInt9057; i_259_++) {
		int i_260_ = anIntArray9043[i_259_] - i_233_;
		if (i_260_ >= i_253_ && i_260_ <= i_254_) {
		    int i_261_ = anIntArray9034[i_259_] - i;
		    if (i_261_ >= i_255_ && i_261_ <= i_256_) {
			int i_262_ = anIntArray9041[i_259_] - i_234_;
			if (i_262_ >= i_257_ && i_262_ <= i_258_) {
			    int i_263_ = -1;
			    int i_264_ = anIntArray9082[i_259_];
			    int i_265_ = anIntArray9082[i_259_ + 1];
			    for (int i_266_ = i_264_;
				 (i_266_ < i_265_
				  && aShortArray9083[i_266_] != 0);
				 i_266_++) {
				i_263_
				    = (aShortArray9083[i_266_] & 0xffff) - 1;
				if (aByteArray9050[i_263_] != 0)
				    break;
			    }
			    if (i_263_ != -1) {
				for (int i_267_ = 0; i_267_ < i_236_;
				     i_267_++) {
				    if (i_261_ == is[i_267_]
					&& i_262_ == is_238_[i_267_]
					&& i_260_ == is_237_[i_267_]) {
					int i_268_ = -1;
					i_264_ = is_251_[i_267_];
					i_265_ = is_251_[i_267_ + 1];
					for (int i_269_ = i_264_;
					     (i_269_ < i_265_
					      && is_252_[i_269_] != 0);
					     i_269_++) {
					    i_268_ = (is_252_[i_269_]
						      & 0xffff) - 1;
					    if (is_242_[i_268_] != 0)
						break;
					}
					if (i_268_ != -1) {
					    if (is_243_ == null) {
						aClass152_9049
						    = new Class152();
						is_243_
						    = aClass152_9049
							  .aShortArray1708
						    = (Class534_Sub42
							   .method16820
						       (aShortArray9045,
							(byte) 2));
						is_244_
						    = aClass152_9049
							  .aShortArray1707
						    = (Class534_Sub42
							   .method16820
						       (aShortArray9042,
							(byte) 2));
						is_245_
						    = aClass152_9049
							  .aShortArray1706
						    = (Class534_Sub42
							   .method16820
						       (aShortArray9047,
							(byte) 2));
						is_246_
						    = aClass152_9049
							  .aByteArray1709
						    = (Class586.method9861
						       (aByteArray9050,
							-16711936));
					    }
					    if (is_247_ == null) {
						Class152 class152
						    = (class183_sub1_235_
							   .aClass152_9049
						       = new Class152());
						is_247_
						    = class152.aShortArray1708
						    = (Class534_Sub42
							   .method16820
						       (is_239_, (byte) 2));
						is_248_
						    = class152.aShortArray1707
						    = (Class534_Sub42
							   .method16820
						       (is_240_, (byte) 2));
						is_249_
						    = class152.aShortArray1706
						    = (Class534_Sub42
							   .method16820
						       (is_241_, (byte) 2));
						is_250_
						    = class152.aByteArray1709
						    = (Class586.method9861
						       (is_242_, -16711936));
					    }
					    short i_270_
						= aShortArray9045[i_263_];
					    short i_271_
						= aShortArray9042[i_263_];
					    short i_272_
						= aShortArray9047[i_263_];
					    byte i_273_
						= aByteArray9050[i_263_];
					    i_264_ = is_251_[i_267_];
					    i_265_ = is_251_[i_267_ + 1];
					    for (int i_274_ = i_264_;
						 i_274_ < i_265_; i_274_++) {
						int i_275_
						    = is_252_[i_274_] - 1;
						if (i_275_ == -1)
						    break;
						if (is_250_[i_275_] != 0) {
						    is_247_[i_275_] += i_270_;
						    is_248_[i_275_] += i_271_;
						    is_249_[i_275_] += i_272_;
						    is_250_[i_275_] += i_273_;
						}
					    }
					    i_270_ = is_239_[i_268_];
					    i_271_ = is_240_[i_268_];
					    i_272_ = is_241_[i_268_];
					    i_273_ = is_242_[i_268_];
					    i_264_ = anIntArray9082[i_259_];
					    i_265_
						= anIntArray9082[i_259_ + 1];
					    for (int i_276_ = i_264_;
						 (i_276_ < i_265_
						  && (aShortArray9083[i_276_]
						      != 0));
						 i_276_++) {
						int i_277_
						    = ((aShortArray9083[i_276_]
							& 0xffff)
						       - 1);
						if (is_246_[i_277_] != 0) {
						    is_243_[i_277_] += i_270_;
						    is_244_[i_277_] += i_271_;
						    is_245_[i_277_] += i_272_;
						    is_246_[i_277_] += i_273_;
						}
					    }
					    if (aClass129_9064 == null
						&& aClass129_9079 != null)
						aClass129_9079
						    .anInterface15_1519
						    = null;
					    if (aClass129_9064 != null)
						aClass129_9064
						    .anInterface15_1519
						    = null;
					    if ((class183_sub1_235_
						 .aClass129_9064) == null
						&& (class183_sub1_235_
						    .aClass129_9079) != null)
						class183_sub1_235_
						    .aClass129_9079
						    .anInterface15_1519
						    = null;
					    if ((class183_sub1_235_
						 .aClass129_9064)
						!= null)
						class183_sub1_235_
						    .aClass129_9064
						    .anInterface15_1519
						    = null;
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
    
    public int method3047() {
	if (!aBool9075)
	    method14533();
	return aShort9077;
    }
    
    public int method3038() {
	if (!aBool9075)
	    method14533();
	return aShort9078;
    }
    
    public int method3049() {
	if (!aBool9038)
	    method3050();
	return aShort9080;
    }
    
    public void method3077(Class183 class183, int i, int i_278_, int i_279_,
			   boolean bool) {
	Class183_Sub1 class183_sub1_280_ = (Class183_Sub1) class183;
	if (anInt9052 != 0 && class183_sub1_280_.anInt9052 != 0) {
	    int i_281_ = class183_sub1_280_.anInt9057;
	    int[] is = class183_sub1_280_.anIntArray9034;
	    int[] is_282_ = class183_sub1_280_.anIntArray9043;
	    int[] is_283_ = class183_sub1_280_.anIntArray9041;
	    short[] is_284_ = class183_sub1_280_.aShortArray9045;
	    short[] is_285_ = class183_sub1_280_.aShortArray9042;
	    short[] is_286_ = class183_sub1_280_.aShortArray9047;
	    byte[] is_287_ = class183_sub1_280_.aByteArray9050;
	    short[] is_288_;
	    short[] is_289_;
	    short[] is_290_;
	    byte[] is_291_;
	    if (aClass152_9049 != null) {
		is_288_ = aClass152_9049.aShortArray1708;
		is_289_ = aClass152_9049.aShortArray1707;
		is_290_ = aClass152_9049.aShortArray1706;
		is_291_ = aClass152_9049.aByteArray1709;
	    } else {
		is_288_ = null;
		is_289_ = null;
		is_290_ = null;
		is_291_ = null;
	    }
	    short[] is_292_;
	    short[] is_293_;
	    short[] is_294_;
	    byte[] is_295_;
	    if (class183_sub1_280_.aClass152_9049 != null) {
		is_292_ = class183_sub1_280_.aClass152_9049.aShortArray1708;
		is_293_ = class183_sub1_280_.aClass152_9049.aShortArray1707;
		is_294_ = class183_sub1_280_.aClass152_9049.aShortArray1706;
		is_295_ = class183_sub1_280_.aClass152_9049.aByteArray1709;
	    } else {
		is_292_ = null;
		is_293_ = null;
		is_294_ = null;
		is_295_ = null;
	    }
	    int[] is_296_ = class183_sub1_280_.anIntArray9082;
	    short[] is_297_ = class183_sub1_280_.aShortArray9083;
	    if (!class183_sub1_280_.aBool9075)
		class183_sub1_280_.method14533();
	    int i_298_ = class183_sub1_280_.aShort9072;
	    int i_299_ = class183_sub1_280_.aShort9074;
	    int i_300_ = class183_sub1_280_.aShort9033;
	    int i_301_ = class183_sub1_280_.aShort9076;
	    int i_302_ = class183_sub1_280_.aShort9077;
	    int i_303_ = class183_sub1_280_.aShort9078;
	    for (int i_304_ = 0; i_304_ < anInt9057; i_304_++) {
		int i_305_ = anIntArray9043[i_304_] - i_278_;
		if (i_305_ >= i_298_ && i_305_ <= i_299_) {
		    int i_306_ = anIntArray9034[i_304_] - i;
		    if (i_306_ >= i_300_ && i_306_ <= i_301_) {
			int i_307_ = anIntArray9041[i_304_] - i_279_;
			if (i_307_ >= i_302_ && i_307_ <= i_303_) {
			    int i_308_ = -1;
			    int i_309_ = anIntArray9082[i_304_];
			    int i_310_ = anIntArray9082[i_304_ + 1];
			    for (int i_311_ = i_309_;
				 (i_311_ < i_310_
				  && aShortArray9083[i_311_] != 0);
				 i_311_++) {
				i_308_
				    = (aShortArray9083[i_311_] & 0xffff) - 1;
				if (aByteArray9050[i_308_] != 0)
				    break;
			    }
			    if (i_308_ != -1) {
				for (int i_312_ = 0; i_312_ < i_281_;
				     i_312_++) {
				    if (i_306_ == is[i_312_]
					&& i_307_ == is_283_[i_312_]
					&& i_305_ == is_282_[i_312_]) {
					int i_313_ = -1;
					i_309_ = is_296_[i_312_];
					i_310_ = is_296_[i_312_ + 1];
					for (int i_314_ = i_309_;
					     (i_314_ < i_310_
					      && is_297_[i_314_] != 0);
					     i_314_++) {
					    i_313_ = (is_297_[i_314_]
						      & 0xffff) - 1;
					    if (is_287_[i_313_] != 0)
						break;
					}
					if (i_313_ != -1) {
					    if (is_288_ == null) {
						aClass152_9049
						    = new Class152();
						is_288_
						    = aClass152_9049
							  .aShortArray1708
						    = (Class534_Sub42
							   .method16820
						       (aShortArray9045,
							(byte) 2));
						is_289_
						    = aClass152_9049
							  .aShortArray1707
						    = (Class534_Sub42
							   .method16820
						       (aShortArray9042,
							(byte) 2));
						is_290_
						    = aClass152_9049
							  .aShortArray1706
						    = (Class534_Sub42
							   .method16820
						       (aShortArray9047,
							(byte) 2));
						is_291_
						    = aClass152_9049
							  .aByteArray1709
						    = (Class586.method9861
						       (aByteArray9050,
							-16711936));
					    }
					    if (is_292_ == null) {
						Class152 class152
						    = (class183_sub1_280_
							   .aClass152_9049
						       = new Class152());
						is_292_
						    = class152.aShortArray1708
						    = (Class534_Sub42
							   .method16820
						       (is_284_, (byte) 2));
						is_293_
						    = class152.aShortArray1707
						    = (Class534_Sub42
							   .method16820
						       (is_285_, (byte) 2));
						is_294_
						    = class152.aShortArray1706
						    = (Class534_Sub42
							   .method16820
						       (is_286_, (byte) 2));
						is_295_
						    = class152.aByteArray1709
						    = (Class586.method9861
						       (is_287_, -16711936));
					    }
					    short i_315_
						= aShortArray9045[i_308_];
					    short i_316_
						= aShortArray9042[i_308_];
					    short i_317_
						= aShortArray9047[i_308_];
					    byte i_318_
						= aByteArray9050[i_308_];
					    i_309_ = is_296_[i_312_];
					    i_310_ = is_296_[i_312_ + 1];
					    for (int i_319_ = i_309_;
						 i_319_ < i_310_; i_319_++) {
						int i_320_
						    = is_297_[i_319_] - 1;
						if (i_320_ == -1)
						    break;
						if (is_295_[i_320_] != 0) {
						    is_292_[i_320_] += i_315_;
						    is_293_[i_320_] += i_316_;
						    is_294_[i_320_] += i_317_;
						    is_295_[i_320_] += i_318_;
						}
					    }
					    i_315_ = is_284_[i_313_];
					    i_316_ = is_285_[i_313_];
					    i_317_ = is_286_[i_313_];
					    i_318_ = is_287_[i_313_];
					    i_309_ = anIntArray9082[i_304_];
					    i_310_
						= anIntArray9082[i_304_ + 1];
					    for (int i_321_ = i_309_;
						 (i_321_ < i_310_
						  && (aShortArray9083[i_321_]
						      != 0));
						 i_321_++) {
						int i_322_
						    = ((aShortArray9083[i_321_]
							& 0xffff)
						       - 1);
						if (is_291_[i_322_] != 0) {
						    is_288_[i_322_] += i_315_;
						    is_289_[i_322_] += i_316_;
						    is_290_[i_322_] += i_317_;
						    is_291_[i_322_] += i_318_;
						}
					    }
					    if (aClass129_9064 == null
						&& aClass129_9079 != null)
						aClass129_9079
						    .anInterface15_1519
						    = null;
					    if (aClass129_9064 != null)
						aClass129_9064
						    .anInterface15_1519
						    = null;
					    if ((class183_sub1_280_
						 .aClass129_9064) == null
						&& (class183_sub1_280_
						    .aClass129_9079) != null)
						class183_sub1_280_
						    .aClass129_9079
						    .anInterface15_1519
						    = null;
					    if ((class183_sub1_280_
						 .aClass129_9064)
						!= null)
						class183_sub1_280_
						    .aClass129_9064
						    .anInterface15_1519
						    = null;
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
	aShort9040 = (short) i;
	if (aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
    }
    
    public int method3128() {
	if (!aBool9075)
	    method14533();
	return aShort9076;
    }
    
    public byte[] method3152() {
	return aByteArray9055;
    }
    
    public int method3054() {
	return aShort9046;
    }
    
    public void method3150(byte i, byte[] is) {
	if (is == null) {
	    for (int i_323_ = 0; i_323_ < anInt9052; i_323_++)
		aByteArray9055[i_323_] = i;
	} else {
	    for (int i_324_ = 0; i_324_ < anInt9052; i_324_++) {
		int i_325_ = 255 - ((255 - (is[i_324_] & 0xff))
				    * (255 - (i & 0xff)) / 255);
		aByteArray9055[i_324_] = (byte) i_325_;
	    }
	}
	if (aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
    }
    
    public void method3056(short i, short i_326_) {
	for (int i_327_ = 0; i_327_ < anInt9052; i_327_++) {
	    if (aShortArray9054[i_327_] == i)
		aShortArray9054[i_327_] = i_326_;
	}
	if (aClass149Array9087 != null) {
	    for (int i_328_ = 0; i_328_ < anInt9086; i_328_++) {
		Class149 class149 = aClass149Array9087[i_328_];
		Class133 class133 = aClass133Array9070[i_328_];
		class133.anInt1585
		    = (class133.anInt1585 & ~0xffffff
		       | ((Class661.anIntArray8549
			   [aShortArray9054[class149.anInt1687] & 0xffff])
			  & 0xffffff));
	    }
	}
	if (aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
    }
    
    public void method3088(byte i, byte[] is) {
	if (is == null) {
	    for (int i_329_ = 0; i_329_ < anInt9052; i_329_++)
		aByteArray9055[i_329_] = i;
	} else {
	    for (int i_330_ = 0; i_330_ < anInt9052; i_330_++) {
		int i_331_ = 255 - ((255 - (is[i_330_] & 0xff))
				    * (255 - (i & 0xff)) / 255);
		aByteArray9055[i_330_] = (byte) i_331_;
	    }
	}
	if (aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
    }
    
    public void method3118(short i, short i_332_) {
	Class177 class177 = aClass185_Sub3_9029.aClass177_2012;
	for (int i_333_ = 0; i_333_ < anInt9052; i_333_++) {
	    if (aShortArray9059[i_333_] == i)
		aShortArray9059[i_333_] = i_332_;
	}
	byte i_334_ = 0;
	byte i_335_ = 0;
	if (i != -1) {
	    Class186 class186 = class177.method2931(i & 0xffff, (byte) 1);
	    i_334_ = class186.aByte2074;
	    i_335_ = class186.aByte2059;
	}
	byte i_336_ = 0;
	byte i_337_ = 0;
	if (i_332_ != -1) {
	    Class186 class186 = class177.method2931(i_332_ & 0xffff, (byte) 1);
	    i_336_ = class186.aByte2074;
	    i_337_ = class186.aByte2059;
	    if (class186.aByte2047 != 0 || class186.aByte2048 != 0)
		aBool9036 = true;
	}
	if (i_334_ != i_336_ | i_335_ != i_337_) {
	    if (aClass149Array9087 != null) {
		for (int i_338_ = 0; i_338_ < anInt9086; i_338_++) {
		    Class149 class149 = aClass149Array9087[i_338_];
		    Class133 class133 = aClass133Array9070[i_338_];
		    class133.anInt1585
			= (class133.anInt1585 & ~0xffffff
			   | ((Class661.anIntArray8549
			       [aShortArray9054[class149.anInt1687] & 0xffff])
			      & 0xffffff));
		}
	    }
	    if (aClass129_9079 != null)
		aClass129_9079.anInterface15_1519 = null;
	}
    }
    
    public void method3058(int i, int i_339_, int i_340_, int i_341_) {
	for (int i_342_ = 0; i_342_ < anInt9052; i_342_++) {
	    int i_343_ = aShortArray9054[i_342_] & 0xffff;
	    int i_344_ = i_343_ >> 10 & 0x3f;
	    int i_345_ = i_343_ >> 7 & 0x7;
	    int i_346_ = i_343_ & 0x7f;
	    if (i != -1)
		i_344_ += (i - i_344_) * i_341_ >> 7;
	    if (i_339_ != -1)
		i_345_ += (i_339_ - i_345_) * i_341_ >> 7;
	    if (i_340_ != -1)
		i_346_ += (i_340_ - i_346_) * i_341_ >> 7;
	    aShortArray9054[i_342_]
		= (short) (i_344_ << 10 | i_345_ << 7 | i_346_);
	}
	if (aClass149Array9087 != null) {
	    for (int i_347_ = 0; i_347_ < anInt9086; i_347_++) {
		Class149 class149 = aClass149Array9087[i_347_];
		Class133 class133 = aClass133Array9070[i_347_];
		class133.anInt1585
		    = (class133.anInt1585 & ~0xffffff
		       | ((Class661.anIntArray8549
			   [aShortArray9054[class149.anInt1687] & 0xffff])
			  & 0xffffff));
	    }
	}
	if (aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
    }
    
    public boolean method3060() {
	if (aShortArray9059 == null)
	    return true;
	for (int i = 0; i < aShortArray9059.length; i++) {
	    if (aShortArray9059[i] != -1) {
		Class186 class186
		    = aClass185_Sub3_9029.aClass177_2012
			  .method2931(aShortArray9059[i] & 0xffff, (byte) 1);
		if (class186.aBool2043
		    && !aClass185_Sub3_9029.aClass161_9659
			    .method2624(Class598.aClass598_7865, class186, -1))
		    return false;
	    }
	}
	return true;
    }
    
    public boolean method3027() {
	return aBool9035;
    }
    
    int method14535(int i, short i_348_, int i_349_, byte i_350_) {
	int i_351_ = Class661.anIntArray8549[method14544(i, i_349_)];
	if (i_348_ != -1) {
	    Class186 class186 = aClass185_Sub3_9029.aClass177_2012
				    .method2931(i_348_ & 0xffff, (byte) 1);
	    int i_352_ = class186.aByte2074 & 0xff;
	    if (i_352_ != 0) {
		int i_353_;
		if (i_349_ < 0)
		    i_353_ = 0;
		else if (i_349_ > 127)
		    i_353_ = 16777215;
		else
		    i_353_ = 131586 * i_349_;
		if (i_352_ == 256)
		    i_351_ = i_353_;
		else {
		    int i_354_ = i_352_;
		    int i_355_ = 256 - i_352_;
		    i_351_ = ((((i_353_ & 0xff00ff) * i_354_
				+ (i_351_ & 0xff00ff) * i_355_)
			       & ~0xff00ff)
			      + (((i_353_ & 0xff00) * i_354_
				  + (i_351_ & 0xff00) * i_355_)
				 & 0xff0000)) >> 8;
		}
	    }
	    int i_356_ = class186.aByte2059 & 0xff;
	    if (i_356_ != 0) {
		i_356_ += 256;
		int i_357_ = ((i_351_ & 0xff0000) >> 16) * i_356_;
		if (i_357_ > 65535)
		    i_357_ = 65535;
		int i_358_ = ((i_351_ & 0xff00) >> 8) * i_356_;
		if (i_358_ > 65535)
		    i_358_ = 65535;
		int i_359_ = (i_351_ & 0xff) * i_356_;
		if (i_359_ > 65535)
		    i_359_ = 65535;
		i_351_ = (i_357_ << 8 & 0xff0000) + (i_358_ & 0xff00) + (i_359_
									 >> 8);
	    }
	}
	return i_351_ << 8 | 255 - (i_350_ & 0xff);
    }
    
    void method3202() {
	/* empty */
    }
    
    void method3109() {
	/* empty */
    }
    
    boolean method3032() {
	if (anIntArrayArray9028 == null)
	    return false;
	for (int i = 0; i < anInt9037; i++) {
	    anIntArray9034[i] <<= 4;
	    anIntArray9043[i] <<= 4;
	    anIntArray9041[i] <<= 4;
	}
	anInt9095 = 0;
	anInt9096 = 0;
	anInt9097 = 0;
	return true;
    }
    
    void method3068(int i, int[] is, int i_360_, int i_361_, int i_362_,
		    boolean bool, int i_363_, int[] is_364_) {
	int i_365_ = is.length;
	if (i == 0) {
	    i_360_ <<= 4;
	    i_361_ <<= 4;
	    i_362_ <<= 4;
	    int i_366_ = 0;
	    anInt9095 = 0;
	    anInt9096 = 0;
	    anInt9097 = 0;
	    for (int i_367_ = 0; i_367_ < i_365_; i_367_++) {
		int i_368_ = is[i_367_];
		if (i_368_ < anIntArrayArray9028.length) {
		    int[] is_369_ = anIntArrayArray9028[i_368_];
		    for (int i_370_ = 0; i_370_ < is_369_.length; i_370_++) {
			int i_371_ = is_369_[i_370_];
			if (aShortArray9048 == null
			    || (i_363_ & aShortArray9048[i_371_]) != 0) {
			    anInt9095 += anIntArray9034[i_371_];
			    anInt9096 += anIntArray9043[i_371_];
			    anInt9097 += anIntArray9041[i_371_];
			    i_366_++;
			}
		    }
		}
	    }
	    if (i_366_ > 0) {
		anInt9095 = anInt9095 / i_366_ + i_360_;
		anInt9096 = anInt9096 / i_366_ + i_361_;
		anInt9097 = anInt9097 / i_366_ + i_362_;
		aBool9098 = true;
	    } else {
		anInt9095 = i_360_;
		anInt9096 = i_361_;
		anInt9097 = i_362_;
	    }
	} else if (i == 1) {
	    if (is_364_ != null) {
		int i_372_ = ((is_364_[0] * i_360_ + is_364_[1] * i_361_
			       + is_364_[2] * i_362_ + 8192)
			      >> 14);
		int i_373_ = ((is_364_[3] * i_360_ + is_364_[4] * i_361_
			       + is_364_[5] * i_362_ + 8192)
			      >> 14);
		int i_374_ = ((is_364_[6] * i_360_ + is_364_[7] * i_361_
			       + is_364_[8] * i_362_ + 8192)
			      >> 14);
		i_360_ = i_372_;
		i_361_ = i_373_;
		i_362_ = i_374_;
	    }
	    i_360_ <<= 4;
	    i_361_ <<= 4;
	    i_362_ <<= 4;
	    for (int i_375_ = 0; i_375_ < i_365_; i_375_++) {
		int i_376_ = is[i_375_];
		if (i_376_ < anIntArrayArray9028.length) {
		    int[] is_377_ = anIntArrayArray9028[i_376_];
		    for (int i_378_ = 0; i_378_ < is_377_.length; i_378_++) {
			int i_379_ = is_377_[i_378_];
			if (aShortArray9048 == null
			    || (i_363_ & aShortArray9048[i_379_]) != 0) {
			    anIntArray9034[i_379_] += i_360_;
			    anIntArray9043[i_379_] += i_361_;
			    anIntArray9041[i_379_] += i_362_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_364_ != null) {
		int i_380_ = is_364_[9] << 4;
		int i_381_ = is_364_[10] << 4;
		int i_382_ = is_364_[11] << 4;
		int i_383_ = is_364_[12] << 4;
		int i_384_ = is_364_[13] << 4;
		int i_385_ = is_364_[14] << 4;
		if (aBool9098) {
		    int i_386_
			= ((is_364_[0] * anInt9095 + is_364_[3] * anInt9096
			    + is_364_[6] * anInt9097 + 8192)
			   >> 14);
		    int i_387_
			= ((is_364_[1] * anInt9095 + is_364_[4] * anInt9096
			    + is_364_[7] * anInt9097 + 8192)
			   >> 14);
		    int i_388_
			= ((is_364_[2] * anInt9095 + is_364_[5] * anInt9096
			    + is_364_[8] * anInt9097 + 8192)
			   >> 14);
		    i_386_ += i_383_;
		    i_387_ += i_384_;
		    i_388_ += i_385_;
		    anInt9095 = i_386_;
		    anInt9096 = i_387_;
		    anInt9097 = i_388_;
		    aBool9098 = false;
		}
		int[] is_389_ = new int[9];
		int i_390_ = Class427.anIntArray4805[i_360_];
		int i_391_ = Class427.anIntArray4806[i_360_];
		int i_392_ = Class427.anIntArray4805[i_361_];
		int i_393_ = Class427.anIntArray4806[i_361_];
		int i_394_ = Class427.anIntArray4805[i_362_];
		int i_395_ = Class427.anIntArray4806[i_362_];
		int i_396_ = i_391_ * i_394_ + 8192 >> 14;
		int i_397_ = i_391_ * i_395_ + 8192 >> 14;
		is_389_[0] = i_392_ * i_394_ + i_393_ * i_397_ + 8192 >> 14;
		is_389_[1] = -i_392_ * i_395_ + i_393_ * i_396_ + 8192 >> 14;
		is_389_[2] = i_393_ * i_390_ + 8192 >> 14;
		is_389_[3] = i_390_ * i_395_ + 8192 >> 14;
		is_389_[4] = i_390_ * i_394_ + 8192 >> 14;
		is_389_[5] = -i_391_;
		is_389_[6] = -i_393_ * i_394_ + i_392_ * i_397_ + 8192 >> 14;
		is_389_[7] = i_393_ * i_395_ + i_392_ * i_396_ + 8192 >> 14;
		is_389_[8] = i_392_ * i_390_ + 8192 >> 14;
		int i_398_ = (is_389_[0] * -anInt9095 + is_389_[1] * -anInt9096
			      + is_389_[2] * -anInt9097 + 8192) >> 14;
		int i_399_ = (is_389_[3] * -anInt9095 + is_389_[4] * -anInt9096
			      + is_389_[5] * -anInt9097 + 8192) >> 14;
		int i_400_ = (is_389_[6] * -anInt9095 + is_389_[7] * -anInt9096
			      + is_389_[8] * -anInt9097 + 8192) >> 14;
		int i_401_ = i_398_ + anInt9095;
		int i_402_ = i_399_ + anInt9096;
		int i_403_ = i_400_ + anInt9097;
		int[] is_404_ = new int[9];
		for (int i_405_ = 0; i_405_ < 3; i_405_++) {
		    for (int i_406_ = 0; i_406_ < 3; i_406_++) {
			int i_407_ = 0;
			for (int i_408_ = 0; i_408_ < 3; i_408_++)
			    i_407_ += (is_389_[i_405_ * 3 + i_408_]
				       * is_364_[i_406_ * 3 + i_408_]);
			is_404_[i_405_ * 3 + i_406_] = i_407_ + 8192 >> 14;
		    }
		}
		int i_409_ = ((is_389_[0] * i_383_ + is_389_[1] * i_384_
			       + is_389_[2] * i_385_ + 8192)
			      >> 14);
		int i_410_ = ((is_389_[3] * i_383_ + is_389_[4] * i_384_
			       + is_389_[5] * i_385_ + 8192)
			      >> 14);
		int i_411_ = ((is_389_[6] * i_383_ + is_389_[7] * i_384_
			       + is_389_[8] * i_385_ + 8192)
			      >> 14);
		i_409_ += i_401_;
		i_410_ += i_402_;
		i_411_ += i_403_;
		int[] is_412_ = new int[9];
		for (int i_413_ = 0; i_413_ < 3; i_413_++) {
		    for (int i_414_ = 0; i_414_ < 3; i_414_++) {
			int i_415_ = 0;
			for (int i_416_ = 0; i_416_ < 3; i_416_++)
			    i_415_ += (is_364_[i_413_ * 3 + i_416_]
				       * is_404_[i_414_ + i_416_ * 3]);
			is_412_[i_413_ * 3 + i_414_] = i_415_ + 8192 >> 14;
		    }
		}
		int i_417_ = ((is_364_[0] * i_409_ + is_364_[1] * i_410_
			       + is_364_[2] * i_411_ + 8192)
			      >> 14);
		int i_418_ = ((is_364_[3] * i_409_ + is_364_[4] * i_410_
			       + is_364_[5] * i_411_ + 8192)
			      >> 14);
		int i_419_ = ((is_364_[6] * i_409_ + is_364_[7] * i_410_
			       + is_364_[8] * i_411_ + 8192)
			      >> 14);
		i_417_ += i_380_;
		i_418_ += i_381_;
		i_419_ += i_382_;
		for (int i_420_ = 0; i_420_ < i_365_; i_420_++) {
		    int i_421_ = is[i_420_];
		    if (i_421_ < anIntArrayArray9028.length) {
			int[] is_422_ = anIntArrayArray9028[i_421_];
			for (int i_423_ = 0; i_423_ < is_422_.length;
			     i_423_++) {
			    int i_424_ = is_422_[i_423_];
			    if (aShortArray9048 == null
				|| (i_363_ & aShortArray9048[i_424_]) != 0) {
				int i_425_
				    = ((is_412_[0] * anIntArray9034[i_424_]
					+ is_412_[1] * anIntArray9043[i_424_]
					+ is_412_[2] * anIntArray9041[i_424_]
					+ 8192)
				       >> 14);
				int i_426_
				    = ((is_412_[3] * anIntArray9034[i_424_]
					+ is_412_[4] * anIntArray9043[i_424_]
					+ is_412_[5] * anIntArray9041[i_424_]
					+ 8192)
				       >> 14);
				int i_427_
				    = ((is_412_[6] * anIntArray9034[i_424_]
					+ is_412_[7] * anIntArray9043[i_424_]
					+ is_412_[8] * anIntArray9041[i_424_]
					+ 8192)
				       >> 14);
				i_425_ += i_417_;
				i_426_ += i_418_;
				i_427_ += i_419_;
				anIntArray9034[i_424_] = i_425_;
				anIntArray9043[i_424_] = i_426_;
				anIntArray9041[i_424_] = i_427_;
			    }
			}
		    }
		}
	    } else {
		for (int i_428_ = 0; i_428_ < i_365_; i_428_++) {
		    int i_429_ = is[i_428_];
		    if (i_429_ < anIntArrayArray9028.length) {
			int[] is_430_ = anIntArrayArray9028[i_429_];
			for (int i_431_ = 0; i_431_ < is_430_.length;
			     i_431_++) {
			    int i_432_ = is_430_[i_431_];
			    if (aShortArray9048 == null
				|| (i_363_ & aShortArray9048[i_432_]) != 0) {
				anIntArray9034[i_432_] -= anInt9095;
				anIntArray9043[i_432_] -= anInt9096;
				anIntArray9041[i_432_] -= anInt9097;
				if (i_362_ != 0) {
				    int i_433_
					= Class427.anIntArray4806[i_362_];
				    int i_434_
					= Class427.anIntArray4805[i_362_];
				    int i_435_
					= ((anIntArray9043[i_432_] * i_433_
					    + anIntArray9034[i_432_] * i_434_
					    + 16383)
					   >> 14);
				    anIntArray9043[i_432_]
					= (anIntArray9043[i_432_] * i_434_
					   - anIntArray9034[i_432_] * i_433_
					   + 16383) >> 14;
				    anIntArray9034[i_432_] = i_435_;
				}
				if (i_360_ != 0) {
				    int i_436_
					= Class427.anIntArray4806[i_360_];
				    int i_437_
					= Class427.anIntArray4805[i_360_];
				    int i_438_
					= ((anIntArray9043[i_432_] * i_437_
					    - anIntArray9041[i_432_] * i_436_
					    + 16383)
					   >> 14);
				    anIntArray9041[i_432_]
					= (anIntArray9043[i_432_] * i_436_
					   + anIntArray9041[i_432_] * i_437_
					   + 16383) >> 14;
				    anIntArray9043[i_432_] = i_438_;
				}
				if (i_361_ != 0) {
				    int i_439_
					= Class427.anIntArray4806[i_361_];
				    int i_440_
					= Class427.anIntArray4805[i_361_];
				    int i_441_
					= ((anIntArray9041[i_432_] * i_439_
					    + anIntArray9034[i_432_] * i_440_
					    + 16383)
					   >> 14);
				    anIntArray9041[i_432_]
					= (anIntArray9041[i_432_] * i_440_
					   - anIntArray9034[i_432_] * i_439_
					   + 16383) >> 14;
				    anIntArray9034[i_432_] = i_441_;
				}
				anIntArray9034[i_432_] += anInt9095;
				anIntArray9043[i_432_] += anInt9096;
				anIntArray9041[i_432_] += anInt9097;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_442_ = 0; i_442_ < i_365_; i_442_++) {
			int i_443_ = is[i_442_];
			if (i_443_ < anIntArrayArray9028.length) {
			    int[] is_444_ = anIntArrayArray9028[i_443_];
			    for (int i_445_ = 0; i_445_ < is_444_.length;
				 i_445_++) {
				int i_446_ = is_444_[i_445_];
				if (aShortArray9048 == null
				    || ((i_363_ & aShortArray9048[i_446_])
					!= 0)) {
				    int i_447_ = anIntArray9082[i_446_];
				    int i_448_ = anIntArray9082[i_446_ + 1];
				    for (int i_449_ = i_447_;
					 (i_449_ < i_448_
					  && aShortArray9083[i_449_] != 0);
					 i_449_++) {
					int i_450_ = ((aShortArray9083[i_449_]
						       & 0xffff)
						      - 1);
					if (i_362_ != 0) {
					    int i_451_
						= (Class427.anIntArray4806
						   [i_362_]);
					    int i_452_
						= (Class427.anIntArray4805
						   [i_362_]);
					    int i_453_
						= (((aShortArray9042[i_450_]
						     * i_451_)
						    + (aShortArray9045[i_450_]
						       * i_452_)
						    + 16383)
						   >> 14);
					    aShortArray9042[i_450_]
						= (short) (((aShortArray9042
							     [i_450_]) * i_452_
							    - ((aShortArray9045
								[i_450_])
							       * i_451_)
							    + 16383)
							   >> 14);
					    aShortArray9045[i_450_]
						= (short) i_453_;
					}
					if (i_360_ != 0) {
					    int i_454_
						= (Class427.anIntArray4806
						   [i_360_]);
					    int i_455_
						= (Class427.anIntArray4805
						   [i_360_]);
					    int i_456_
						= (((aShortArray9042[i_450_]
						     * i_455_)
						    - (aShortArray9047[i_450_]
						       * i_454_)
						    + 16383)
						   >> 14);
					    aShortArray9047[i_450_]
						= (short) (((aShortArray9042
							     [i_450_]) * i_454_
							    + ((aShortArray9047
								[i_450_])
							       * i_455_)
							    + 16383)
							   >> 14);
					    aShortArray9042[i_450_]
						= (short) i_456_;
					}
					if (i_361_ != 0) {
					    int i_457_
						= (Class427.anIntArray4806
						   [i_361_]);
					    int i_458_
						= (Class427.anIntArray4805
						   [i_361_]);
					    int i_459_
						= (((aShortArray9047[i_450_]
						     * i_457_)
						    + (aShortArray9045[i_450_]
						       * i_458_)
						    + 16383)
						   >> 14);
					    aShortArray9047[i_450_]
						= (short) (((aShortArray9047
							     [i_450_]) * i_458_
							    - ((aShortArray9045
								[i_450_])
							       * i_457_)
							    + 16383)
							   >> 14);
					    aShortArray9045[i_450_]
						= (short) i_459_;
					}
				    }
				}
			    }
			}
		    }
		    if (aClass129_9064 == null && aClass129_9079 != null)
			aClass129_9079.anInterface15_1519 = null;
		    if (aClass129_9064 != null)
			aClass129_9064.anInterface15_1519 = null;
		}
	    }
	} else if (i == 3) {
	    if (is_364_ != null) {
		int i_460_ = is_364_[9] << 4;
		int i_461_ = is_364_[10] << 4;
		int i_462_ = is_364_[11] << 4;
		int i_463_ = is_364_[12] << 4;
		int i_464_ = is_364_[13] << 4;
		int i_465_ = is_364_[14] << 4;
		if (aBool9098) {
		    int i_466_
			= ((is_364_[0] * anInt9095 + is_364_[3] * anInt9096
			    + is_364_[6] * anInt9097 + 8192)
			   >> 14);
		    int i_467_
			= ((is_364_[1] * anInt9095 + is_364_[4] * anInt9096
			    + is_364_[7] * anInt9097 + 8192)
			   >> 14);
		    int i_468_
			= ((is_364_[2] * anInt9095 + is_364_[5] * anInt9096
			    + is_364_[8] * anInt9097 + 8192)
			   >> 14);
		    i_466_ += i_463_;
		    i_467_ += i_464_;
		    i_468_ += i_465_;
		    anInt9095 = i_466_;
		    anInt9096 = i_467_;
		    anInt9097 = i_468_;
		    aBool9098 = false;
		}
		int i_469_ = i_360_ << 15 >> 7;
		int i_470_ = i_361_ << 15 >> 7;
		int i_471_ = i_362_ << 15 >> 7;
		int i_472_ = i_469_ * -anInt9095 + 8192 >> 14;
		int i_473_ = i_470_ * -anInt9096 + 8192 >> 14;
		int i_474_ = i_471_ * -anInt9097 + 8192 >> 14;
		int i_475_ = i_472_ + anInt9095;
		int i_476_ = i_473_ + anInt9096;
		int i_477_ = i_474_ + anInt9097;
		int[] is_478_ = new int[9];
		is_478_[0] = i_469_ * is_364_[0] + 8192 >> 14;
		is_478_[1] = i_469_ * is_364_[3] + 8192 >> 14;
		is_478_[2] = i_469_ * is_364_[6] + 8192 >> 14;
		is_478_[3] = i_470_ * is_364_[1] + 8192 >> 14;
		is_478_[4] = i_470_ * is_364_[4] + 8192 >> 14;
		is_478_[5] = i_470_ * is_364_[7] + 8192 >> 14;
		is_478_[6] = i_471_ * is_364_[2] + 8192 >> 14;
		is_478_[7] = i_471_ * is_364_[5] + 8192 >> 14;
		is_478_[8] = i_471_ * is_364_[8] + 8192 >> 14;
		int i_479_ = i_469_ * i_463_ + 8192 >> 14;
		int i_480_ = i_470_ * i_464_ + 8192 >> 14;
		int i_481_ = i_471_ * i_465_ + 8192 >> 14;
		i_479_ += i_475_;
		i_480_ += i_476_;
		i_481_ += i_477_;
		int[] is_482_ = new int[9];
		for (int i_483_ = 0; i_483_ < 3; i_483_++) {
		    for (int i_484_ = 0; i_484_ < 3; i_484_++) {
			int i_485_ = 0;
			for (int i_486_ = 0; i_486_ < 3; i_486_++)
			    i_485_ += (is_364_[i_483_ * 3 + i_486_]
				       * is_478_[i_484_ + i_486_ * 3]);
			is_482_[i_483_ * 3 + i_484_] = i_485_ + 8192 >> 14;
		    }
		}
		int i_487_ = ((is_364_[0] * i_479_ + is_364_[1] * i_480_
			       + is_364_[2] * i_481_ + 8192)
			      >> 14);
		int i_488_ = ((is_364_[3] * i_479_ + is_364_[4] * i_480_
			       + is_364_[5] * i_481_ + 8192)
			      >> 14);
		int i_489_ = ((is_364_[6] * i_479_ + is_364_[7] * i_480_
			       + is_364_[8] * i_481_ + 8192)
			      >> 14);
		i_487_ += i_460_;
		i_488_ += i_461_;
		i_489_ += i_462_;
		for (int i_490_ = 0; i_490_ < i_365_; i_490_++) {
		    int i_491_ = is[i_490_];
		    if (i_491_ < anIntArrayArray9028.length) {
			int[] is_492_ = anIntArrayArray9028[i_491_];
			for (int i_493_ = 0; i_493_ < is_492_.length;
			     i_493_++) {
			    int i_494_ = is_492_[i_493_];
			    if (aShortArray9048 == null
				|| (i_363_ & aShortArray9048[i_494_]) != 0) {
				int i_495_
				    = ((is_482_[0] * anIntArray9034[i_494_]
					+ is_482_[1] * anIntArray9043[i_494_]
					+ is_482_[2] * anIntArray9041[i_494_]
					+ 8192)
				       >> 14);
				int i_496_
				    = ((is_482_[3] * anIntArray9034[i_494_]
					+ is_482_[4] * anIntArray9043[i_494_]
					+ is_482_[5] * anIntArray9041[i_494_]
					+ 8192)
				       >> 14);
				int i_497_
				    = ((is_482_[6] * anIntArray9034[i_494_]
					+ is_482_[7] * anIntArray9043[i_494_]
					+ is_482_[8] * anIntArray9041[i_494_]
					+ 8192)
				       >> 14);
				i_495_ += i_487_;
				i_496_ += i_488_;
				i_497_ += i_489_;
				anIntArray9034[i_494_] = i_495_;
				anIntArray9043[i_494_] = i_496_;
				anIntArray9041[i_494_] = i_497_;
			    }
			}
		    }
		}
	    } else {
		for (int i_498_ = 0; i_498_ < i_365_; i_498_++) {
		    int i_499_ = is[i_498_];
		    if (i_499_ < anIntArrayArray9028.length) {
			int[] is_500_ = anIntArrayArray9028[i_499_];
			for (int i_501_ = 0; i_501_ < is_500_.length;
			     i_501_++) {
			    int i_502_ = is_500_[i_501_];
			    if (aShortArray9048 == null
				|| (i_363_ & aShortArray9048[i_502_]) != 0) {
				anIntArray9034[i_502_] -= anInt9095;
				anIntArray9043[i_502_] -= anInt9096;
				anIntArray9041[i_502_] -= anInt9097;
				anIntArray9034[i_502_]
				    = anIntArray9034[i_502_] * i_360_ >> 7;
				anIntArray9043[i_502_]
				    = anIntArray9043[i_502_] * i_361_ >> 7;
				anIntArray9041[i_502_]
				    = anIntArray9041[i_502_] * i_362_ >> 7;
				anIntArray9034[i_502_] += anInt9095;
				anIntArray9043[i_502_] += anInt9096;
				anIntArray9041[i_502_] += anInt9097;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9073 != null) {
		for (int i_503_ = 0; i_503_ < i_365_; i_503_++) {
		    int i_504_ = is[i_503_];
		    if (i_504_ < anIntArrayArray9073.length) {
			int[] is_505_ = anIntArrayArray9073[i_504_];
			for (int i_506_ = 0; i_506_ < is_505_.length;
			     i_506_++) {
			    int i_507_ = is_505_[i_506_];
			    if (aShortArray9061 == null
				|| (i_363_ & aShortArray9061[i_507_]) != 0) {
				int i_508_ = ((aByteArray9055[i_507_] & 0xff)
					      + i_360_ * 8);
				if (i_508_ < 0)
				    i_508_ = 0;
				else if (i_508_ > 255)
				    i_508_ = 255;
				aByteArray9055[i_507_] = (byte) i_508_;
				if (aClass129_9079 != null)
				    aClass129_9079.anInterface15_1519 = null;
			    }
			}
		    }
		}
		if (aClass149Array9087 != null) {
		    for (int i_509_ = 0; i_509_ < anInt9086; i_509_++) {
			Class149 class149 = aClass149Array9087[i_509_];
			Class133 class133 = aClass133Array9070[i_509_];
			class133.anInt1585
			    = (class133.anInt1585 & 0xffffff
			       | 255 - (aByteArray9055[class149.anInt1687]
					& 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9073 != null) {
		for (int i_510_ = 0; i_510_ < i_365_; i_510_++) {
		    int i_511_ = is[i_510_];
		    if (i_511_ < anIntArrayArray9073.length) {
			int[] is_512_ = anIntArrayArray9073[i_511_];
			for (int i_513_ = 0; i_513_ < is_512_.length;
			     i_513_++) {
			    int i_514_ = is_512_[i_513_];
			    if (aShortArray9061 == null
				|| (i_363_ & aShortArray9061[i_514_]) != 0) {
				int i_515_ = aShortArray9054[i_514_] & 0xffff;
				int i_516_ = i_515_ >> 10 & 0x3f;
				int i_517_ = i_515_ >> 7 & 0x7;
				int i_518_ = i_515_ & 0x7f;
				i_516_ = i_516_ + i_360_ & 0x3f;
				i_517_ += i_361_ / 4;
				if (i_517_ < 0)
				    i_517_ = 0;
				else if (i_517_ > 7)
				    i_517_ = 7;
				i_518_ += i_362_;
				if (i_518_ < 0)
				    i_518_ = 0;
				else if (i_518_ > 127)
				    i_518_ = 127;
				aShortArray9054[i_514_]
				    = (short) (i_516_ << 10 | i_517_ << 7
					       | i_518_);
				if (aClass129_9079 != null)
				    aClass129_9079.anInterface15_1519 = null;
			    }
			}
		    }
		}
		if (aClass149Array9087 != null) {
		    for (int i_519_ = 0; i_519_ < anInt9086; i_519_++) {
			Class149 class149 = aClass149Array9087[i_519_];
			Class133 class133 = aClass133Array9070[i_519_];
			class133.anInt1585
			    = (class133.anInt1585 & ~0xffffff
			       | (Class661.anIntArray8549
				  [(aShortArray9054[class149.anInt1687]
				    & 0xffff)]) & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9089 != null) {
		for (int i_520_ = 0; i_520_ < i_365_; i_520_++) {
		    int i_521_ = is[i_520_];
		    if (i_521_ < anIntArrayArray9089.length) {
			int[] is_522_ = anIntArrayArray9089[i_521_];
			for (int i_523_ = 0; i_523_ < is_522_.length;
			     i_523_++) {
			    Class133 class133
				= aClass133Array9070[is_522_[i_523_]];
			    class133.anInt1584 += i_360_;
			    class133.anInt1583 += i_361_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9089 != null) {
		for (int i_524_ = 0; i_524_ < i_365_; i_524_++) {
		    int i_525_ = is[i_524_];
		    if (i_525_ < anIntArrayArray9089.length) {
			int[] is_526_ = anIntArrayArray9089[i_525_];
			for (int i_527_ = 0; i_527_ < is_526_.length;
			     i_527_++) {
			    Class133 class133
				= aClass133Array9070[is_526_[i_527_]];
			    class133.anInt1582
				= class133.anInt1582 * i_360_ >> 7;
			    class133.anInt1581
				= class133.anInt1581 * i_361_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9089 != null) {
		for (int i_528_ = 0; i_528_ < i_365_; i_528_++) {
		    int i_529_ = is[i_528_];
		    if (i_529_ < anIntArrayArray9089.length) {
			int[] is_530_ = anIntArrayArray9089[i_529_];
			for (int i_531_ = 0; i_531_ < is_530_.length;
			     i_531_++) {
			    Class133 class133
				= aClass133Array9070[is_530_[i_531_]];
			    class133.anInt1586
				= class133.anInt1586 + i_360_ & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    void method3137(int i, int i_532_, int i_533_, int i_534_) {
	if (i == 0) {
	    int i_535_ = 0;
	    anInt9095 = 0;
	    anInt9096 = 0;
	    anInt9097 = 0;
	    for (int i_536_ = 0; i_536_ < anInt9057; i_536_++) {
		anInt9095 += anIntArray9034[i_536_];
		anInt9096 += anIntArray9043[i_536_];
		anInt9097 += anIntArray9041[i_536_];
		i_535_++;
	    }
	    if (i_535_ > 0) {
		anInt9095 = anInt9095 / i_535_ + i_532_;
		anInt9096 = anInt9096 / i_535_ + i_533_;
		anInt9097 = anInt9097 / i_535_ + i_534_;
	    } else {
		anInt9095 = i_532_;
		anInt9096 = i_533_;
		anInt9097 = i_534_;
	    }
	} else if (i == 1) {
	    for (int i_537_ = 0; i_537_ < anInt9057; i_537_++) {
		anIntArray9034[i_537_] += i_532_;
		anIntArray9043[i_537_] += i_533_;
		anIntArray9041[i_537_] += i_534_;
	    }
	} else if (i == 2) {
	    for (int i_538_ = 0; i_538_ < anInt9057; i_538_++) {
		anIntArray9034[i_538_] -= anInt9095;
		anIntArray9043[i_538_] -= anInt9096;
		anIntArray9041[i_538_] -= anInt9097;
		if (i_534_ != 0) {
		    int i_539_ = Class427.anIntArray4806[i_534_];
		    int i_540_ = Class427.anIntArray4805[i_534_];
		    int i_541_ = ((anIntArray9043[i_538_] * i_539_
				   + anIntArray9034[i_538_] * i_540_ + 16383)
				  >> 14);
		    anIntArray9043[i_538_]
			= (anIntArray9043[i_538_] * i_540_
			   - anIntArray9034[i_538_] * i_539_ + 16383) >> 14;
		    anIntArray9034[i_538_] = i_541_;
		}
		if (i_532_ != 0) {
		    int i_542_ = Class427.anIntArray4806[i_532_];
		    int i_543_ = Class427.anIntArray4805[i_532_];
		    int i_544_ = ((anIntArray9043[i_538_] * i_543_
				   - anIntArray9041[i_538_] * i_542_ + 16383)
				  >> 14);
		    anIntArray9041[i_538_]
			= (anIntArray9043[i_538_] * i_542_
			   + anIntArray9041[i_538_] * i_543_ + 16383) >> 14;
		    anIntArray9043[i_538_] = i_544_;
		}
		if (i_533_ != 0) {
		    int i_545_ = Class427.anIntArray4806[i_533_];
		    int i_546_ = Class427.anIntArray4805[i_533_];
		    int i_547_ = ((anIntArray9041[i_538_] * i_545_
				   + anIntArray9034[i_538_] * i_546_ + 16383)
				  >> 14);
		    anIntArray9041[i_538_]
			= (anIntArray9041[i_538_] * i_546_
			   - anIntArray9034[i_538_] * i_545_ + 16383) >> 14;
		    anIntArray9034[i_538_] = i_547_;
		}
		anIntArray9034[i_538_] += anInt9095;
		anIntArray9043[i_538_] += anInt9096;
		anIntArray9041[i_538_] += anInt9097;
	    }
	} else if (i == 3) {
	    for (int i_548_ = 0; i_548_ < anInt9057; i_548_++) {
		anIntArray9034[i_548_] -= anInt9095;
		anIntArray9043[i_548_] -= anInt9096;
		anIntArray9041[i_548_] -= anInt9097;
		anIntArray9034[i_548_] = anIntArray9034[i_548_] * i_532_ / 128;
		anIntArray9043[i_548_] = anIntArray9043[i_548_] * i_533_ / 128;
		anIntArray9041[i_548_] = anIntArray9041[i_548_] * i_534_ / 128;
		anIntArray9034[i_548_] += anInt9095;
		anIntArray9043[i_548_] += anInt9096;
		anIntArray9041[i_548_] += anInt9097;
	    }
	} else if (i == 5) {
	    for (int i_549_ = 0; i_549_ < anInt9052; i_549_++) {
		int i_550_ = (aByteArray9055[i_549_] & 0xff) + i_532_ * 8;
		if (i_550_ < 0)
		    i_550_ = 0;
		else if (i_550_ > 255)
		    i_550_ = 255;
		aByteArray9055[i_549_] = (byte) i_550_;
	    }
	    if (aClass129_9079 != null)
		aClass129_9079.anInterface15_1519 = null;
	    if (aClass149Array9087 != null) {
		for (int i_551_ = 0; i_551_ < anInt9086; i_551_++) {
		    Class149 class149 = aClass149Array9087[i_551_];
		    Class133 class133 = aClass133Array9070[i_551_];
		    class133.anInt1585
			= (class133.anInt1585 & 0xffffff
			   | (255 - (aByteArray9055[class149.anInt1687] & 0xff)
			      << 24));
		}
	    }
	} else if (i == 7) {
	    for (int i_552_ = 0; i_552_ < anInt9052; i_552_++) {
		int i_553_ = aShortArray9054[i_552_] & 0xffff;
		int i_554_ = i_553_ >> 10 & 0x3f;
		int i_555_ = i_553_ >> 7 & 0x7;
		int i_556_ = i_553_ & 0x7f;
		i_554_ = i_554_ + i_532_ & 0x3f;
		i_555_ += i_533_ / 4;
		if (i_555_ < 0)
		    i_555_ = 0;
		else if (i_555_ > 7)
		    i_555_ = 7;
		i_556_ += i_534_;
		if (i_556_ < 0)
		    i_556_ = 0;
		else if (i_556_ > 127)
		    i_556_ = 127;
		aShortArray9054[i_552_]
		    = (short) (i_554_ << 10 | i_555_ << 7 | i_556_);
	    }
	    if (aClass129_9079 != null)
		aClass129_9079.anInterface15_1519 = null;
	    if (aClass149Array9087 != null) {
		for (int i_557_ = 0; i_557_ < anInt9086; i_557_++) {
		    Class149 class149 = aClass149Array9087[i_557_];
		    Class133 class133 = aClass133Array9070[i_557_];
		    class133.anInt1585
			= (class133.anInt1585 & ~0xffffff
			   | ((Class661.anIntArray8549
			       [aShortArray9054[class149.anInt1687] & 0xffff])
			      & 0xffffff));
		}
	    }
	} else if (i == 8) {
	    for (int i_558_ = 0; i_558_ < anInt9086; i_558_++) {
		Class133 class133 = aClass133Array9070[i_558_];
		class133.anInt1584 += i_532_;
		class133.anInt1583 += i_533_;
	    }
	} else if (i == 10) {
	    for (int i_559_ = 0; i_559_ < anInt9086; i_559_++) {
		Class133 class133 = aClass133Array9070[i_559_];
		class133.anInt1582 = class133.anInt1582 * i_532_ >> 7;
		class133.anInt1581 = class133.anInt1581 * i_533_ >> 7;
	    }
	} else if (i == 9) {
	    for (int i_560_ = 0; i_560_ < anInt9086; i_560_++) {
		Class133 class133 = aClass133Array9070[i_560_];
		class133.anInt1586 = class133.anInt1586 + i_532_ & 0x3fff;
	    }
	}
    }
    
    public void method3034(Class446 class446, Class194 class194, int i) {
	if ((i & 0x2) != 0)
	    OpenGL.glPolygonMode(1032, 6913);
	if (anInt9044 != 0) {
	    Class433 class433 = aClass185_Sub3_9029.aClass433_9605;
	    Class433 class433_561_ = aClass185_Sub3_9029.aClass433_9530;
	    Class433 class433_562_ = aClass185_Sub3_9029.aClass433_9552;
	    class433_561_.method6916(class446);
	    class433_562_.method6842(class433_561_);
	    class433_562_.method6839(aClass185_Sub3_9029.aClass433_9607);
	    if (!aBool9075)
		method14533();
	    float[] fs = aClass185_Sub3_9029.aFloatArray9569;
	    class433_561_.method6850(0.0F, (float) aShort9072, 0.0F, fs);
	    float f = fs[0];
	    float f_563_ = fs[1];
	    float f_564_ = fs[2];
	    class433_561_.method6850(0.0F, (float) aShort9074, 0.0F, fs);
	    float f_565_ = fs[0];
	    float f_566_ = fs[1];
	    float f_567_ = fs[2];
	    for (int i_568_ = 0; i_568_ < 6; i_568_++) {
		float[] fs_569_
		    = aClass185_Sub3_9029.aFloatArrayArray9608[i_568_];
		float f_570_
		    = (fs_569_[0] * f + fs_569_[1] * f_563_
		       + fs_569_[2] * f_564_ + fs_569_[3] + (float) anInt9023);
		float f_571_
		    = (fs_569_[0] * f_565_ + fs_569_[1] * f_566_
		       + fs_569_[2] * f_567_ + fs_569_[3] + (float) anInt9023);
		if (f_570_ < 0.0F && f_571_ < 0.0F)
		    return;
	    }
	    if (class194 != null) {
		boolean bool = false;
		boolean bool_572_ = true;
		int i_573_ = aShort9033 + aShort9076 >> 1;
		int i_574_ = aShort9077 + aShort9078 >> 1;
		int i_575_ = i_573_;
		short i_576_ = aShort9072;
		int i_577_ = i_574_;
		float f_578_
		    = (class433_562_.aFloatArray4853[0] * (float) i_575_
		       + class433_562_.aFloatArray4853[4] * (float) i_576_
		       + class433_562_.aFloatArray4853[8] * (float) i_577_
		       + class433_562_.aFloatArray4853[12]);
		float f_579_
		    = (class433_562_.aFloatArray4853[1] * (float) i_575_
		       + class433_562_.aFloatArray4853[5] * (float) i_576_
		       + class433_562_.aFloatArray4853[9] * (float) i_577_
		       + class433_562_.aFloatArray4853[13]);
		float f_580_
		    = (class433_562_.aFloatArray4853[2] * (float) i_575_
		       + class433_562_.aFloatArray4853[6] * (float) i_576_
		       + class433_562_.aFloatArray4853[10] * (float) i_577_
		       + class433_562_.aFloatArray4853[14]);
		float f_581_
		    = (class433_562_.aFloatArray4853[3] * (float) i_575_
		       + class433_562_.aFloatArray4853[7] * (float) i_576_
		       + class433_562_.aFloatArray4853[11] * (float) i_577_
		       + class433_562_.aFloatArray4853[15]);
		if (f_580_ >= -f_581_) {
		    class194.anInt2148
			= (int) (aClass185_Sub3_9029.aFloat9610
				 + (aClass185_Sub3_9029.aFloat9663 * f_578_
				    / f_581_));
		    class194.anInt2149
			= (int) (aClass185_Sub3_9029.aFloat9612
				 + (aClass185_Sub3_9029.aFloat9613 * f_579_
				    / f_581_));
		} else
		    bool = true;
		i_575_ = i_573_;
		i_576_ = aShort9074;
		i_577_ = i_574_;
		float f_582_
		    = (class433_562_.aFloatArray4853[0] * (float) i_575_
		       + class433_562_.aFloatArray4853[4] * (float) i_576_
		       + class433_562_.aFloatArray4853[8] * (float) i_577_
		       + class433_562_.aFloatArray4853[12]);
		float f_583_
		    = (class433_562_.aFloatArray4853[1] * (float) i_575_
		       + class433_562_.aFloatArray4853[5] * (float) i_576_
		       + class433_562_.aFloatArray4853[9] * (float) i_577_
		       + class433_562_.aFloatArray4853[13]);
		float f_584_
		    = (class433_562_.aFloatArray4853[2] * (float) i_575_
		       + class433_562_.aFloatArray4853[6] * (float) i_576_
		       + class433_562_.aFloatArray4853[10] * (float) i_577_
		       + class433_562_.aFloatArray4853[14]);
		float f_585_
		    = (class433_562_.aFloatArray4853[3] * (float) i_575_
		       + class433_562_.aFloatArray4853[7] * (float) i_576_
		       + class433_562_.aFloatArray4853[11] * (float) i_577_
		       + class433_562_.aFloatArray4853[15]);
		if (f_584_ >= -f_585_) {
		    class194.anInt2152
			= (int) (aClass185_Sub3_9029.aFloat9610
				 + (aClass185_Sub3_9029.aFloat9663 * f_582_
				    / f_585_));
		    class194.anInt2151
			= (int) (aClass185_Sub3_9029.aFloat9612
				 + (aClass185_Sub3_9029.aFloat9613 * f_583_
				    / f_585_));
		} else
		    bool = true;
		if (bool) {
		    if (f_580_ < -f_581_ && f_584_ < -f_585_)
			bool_572_ = false;
		    else if (f_580_ < -f_581_) {
			float f_586_
			    = (f_580_ + f_581_) / (f_584_ + f_585_) - 1.0F;
			float f_587_ = f_578_ + f_586_ * (f_582_ - f_578_);
			float f_588_ = f_579_ + f_586_ * (f_583_ - f_579_);
			float f_589_ = f_581_ + f_586_ * (f_585_ - f_581_);
			class194.anInt2148
			    = (int) (aClass185_Sub3_9029.aFloat9610
				     + (aClass185_Sub3_9029.aFloat9663 * f_587_
					/ f_589_));
			class194.anInt2149
			    = (int) (aClass185_Sub3_9029.aFloat9612
				     + (aClass185_Sub3_9029.aFloat9613 * f_588_
					/ f_589_));
		    } else if (f_584_ < -f_585_) {
			float f_590_
			    = (f_584_ + f_585_) / (f_580_ + f_581_) - 1.0F;
			float f_591_ = f_582_ + f_590_ * (f_578_ - f_582_);
			float f_592_ = f_583_ + f_590_ * (f_579_ - f_583_);
			float f_593_ = f_585_ + f_590_ * (f_581_ - f_585_);
			class194.anInt2152
			    = (int) (aClass185_Sub3_9029.aFloat9610
				     + (aClass185_Sub3_9029.aFloat9663 * f_591_
					/ f_593_));
			class194.anInt2151
			    = (int) (aClass185_Sub3_9029.aFloat9612
				     + (aClass185_Sub3_9029.aFloat9613 * f_592_
					/ f_593_));
		    }
		}
		if (bool_572_) {
		    if (f_580_ / f_581_ > f_584_ / f_585_) {
			float f_594_ = (f_578_
					+ (class433.aFloatArray4853[0]
					   * (float) anInt9023)
					+ class433.aFloatArray4853[12]);
			float f_595_ = (f_581_
					+ (class433.aFloatArray4853[3]
					   * (float) anInt9023)
					+ class433.aFloatArray4853[15]);
			class194.anInt2147
			    = (int) (aClass185_Sub3_9029.aFloat9610
				     - (float) class194.anInt2148
				     + (aClass185_Sub3_9029.aFloat9663 * f_594_
					/ f_595_));
		    } else {
			float f_596_ = (f_582_
					+ (class433.aFloatArray4853[0]
					   * (float) anInt9023)
					+ class433.aFloatArray4853[12]);
			float f_597_ = (f_585_
					+ (class433.aFloatArray4853[3]
					   * (float) anInt9023)
					+ class433.aFloatArray4853[15]);
			class194.anInt2147
			    = (int) (aClass185_Sub3_9029.aFloat9610
				     - (float) class194.anInt2152
				     + (aClass185_Sub3_9029.aFloat9663 * f_596_
					/ f_597_));
		    }
		    class194.aBool2150 = true;
		}
	    }
	    aClass185_Sub3_9029.method15226();
	    aClass185_Sub3_9029.method15199(class433_561_);
	    method14539();
	    aClass185_Sub3_9029.method15201();
	    class433_561_.method6839(aClass185_Sub3_9029.aClass433_9533);
	    method14540(class433_561_);
	    if ((i & 0x2) != 0)
		OpenGL.glPolygonMode(1028, 6914);
	}
    }
    
    void method3107() {
	for (int i = 0; i < anInt9037; i++) {
	    anIntArray9034[i] = anIntArray9034[i] + 7 >> 4;
	    anIntArray9043[i] = anIntArray9043[i] + 7 >> 4;
	    anIntArray9041[i] = anIntArray9041[i] + 7 >> 4;
	}
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	aBool9075 = false;
    }
    
    static short[] method14536(short[] is, int i) {
	short[] is_598_ = new short[i];
	System.arraycopy(is, 0, is_598_, 0, i);
	return is_598_;
    }
    
    public Class158[] method3065() {
	return aClass158Array9085;
    }
    
    public Class172[] method3168() {
	return aClass172Array9084;
    }
    
    public void method3073(Class446 class446) {
	Class433 class433 = aClass185_Sub3_9029.aClass433_9530;
	class433.method6916(class446);
	if (aClass172Array9084 != null) {
	    for (int i = 0; i < aClass172Array9084.length; i++) {
		Class172 class172 = aClass172Array9084[i];
		Class172 class172_599_ = class172;
		if (class172.aClass172_1809 != null)
		    class172_599_ = class172.aClass172_1809;
		class172_599_.anInt1815
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9034[(class172.anInt1814
							    * 1404619919)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9043
					       [(class172.anInt1814
						 * 1404619919)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9041
					       [(class172.anInt1814
						 * 1404619919)]))))
		       * -697779603);
		class172_599_.anInt1823
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9034
					    [class172.anInt1814 * 1404619919]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9043[(class172.anInt1814
							     * 1404619919)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9041
					      [(class172.anInt1814
						* 1404619919)])))) * 880720549;
		class172_599_.anInt1817
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9034[(class172.anInt1814
							    * 1404619919)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9043
					       [(class172.anInt1814
						 * 1404619919)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9041
					       [(class172.anInt1814
						 * 1404619919)]))))
		       * -487629419);
		class172_599_.anInt1818
		    = (int) (class433.aFloatArray4853[12]
			     + ((class433.aFloatArray4853[0]
				 * (float) (anIntArray9034
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[4]
				   * (float) anIntArray9043[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[8]
				   * (float) (anIntArray9041
					      [(class172.anInt1812
						* 496404005)])))) * 1861716229;
		class172_599_.anInt1808
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9034
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9043[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9041
					      [(class172.anInt1812
						* 496404005)])))) * 968631629;
		class172_599_.anInt1819
		    = (int) (class433.aFloatArray4853[14]
			     + ((class433.aFloatArray4853[2]
				 * (float) (anIntArray9034
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[6]
				   * (float) anIntArray9043[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[10]
				   * (float) (anIntArray9041
					      [(class172.anInt1812
						* 496404005)])))) * -337212495;
		class172_599_.anInt1821
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9034[(class172.anInt1813
							    * 1123614299)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9043
					       [(class172.anInt1813
						 * 1123614299)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9041
					       [(class172.anInt1813
						 * 1123614299)]))))
		       * -289878931);
		class172_599_.anInt1822
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9034
					    [class172.anInt1813 * 1123614299]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9043[(class172.anInt1813
							     * 1123614299)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9041
					      [(class172.anInt1813
						* 1123614299)])))) * 286740539;
		class172_599_.anInt1820
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9034[(class172.anInt1813
							    * 1123614299)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9043
					       [(class172.anInt1813
						 * 1123614299)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9041
					       [(class172.anInt1813
						 * 1123614299)]))))
		       * -2010684097);
	    }
	}
	if (aClass158Array9085 != null) {
	    for (int i = 0; i < aClass158Array9085.length; i++) {
		Class158 class158 = aClass158Array9085[i];
		Class158 class158_600_ = class158;
		if (class158.aClass158_1748 != null)
		    class158_600_ = class158.aClass158_1748;
		if (class158.aClass433_1747 != null)
		    class158.aClass433_1747.method6842(class433);
		else
		    class158.aClass433_1747 = new Class433(class433);
		class158_600_.anInt1750
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9034[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9043
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9041
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * 1976103833);
		class158_600_.anInt1751
		    = ((int) (class433.aFloatArray4853[13]
			      + ((class433.aFloatArray4853[1]
				  * (float) anIntArray9034[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[5]
				    * (float) (anIntArray9043
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[9]
				    * (float) (anIntArray9041
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * 1216251817);
		class158_600_.anInt1749
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9034[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9043
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9041
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * -1645064349);
	    }
	}
    }
    
    public boolean method3062() {
	return aBool9036;
    }
    
    static byte[] method14537(byte[] is, int i) {
	byte[] is_601_ = new byte[i];
	System.arraycopy(is, 0, is_601_, 0, i);
	return is_601_;
    }
    
    public Class183 method3071(byte i, int i_602_, boolean bool) {
	boolean bool_603_ = false;
	Class183_Sub1 class183_sub1_604_;
	Class183_Sub1 class183_sub1_605_;
	if (i > 0 && i <= 8) {
	    class183_sub1_605_
		= aClass185_Sub3_9029.aClass183_Sub1Array9709[i - 1];
	    class183_sub1_604_
		= aClass185_Sub3_9029.aClass183_Sub1Array9707[i - 1];
	    bool_603_ = true;
	} else
	    class183_sub1_604_ = class183_sub1_605_
		= new Class183_Sub1(aClass185_Sub3_9029);
	return method14532(class183_sub1_604_, class183_sub1_605_, i_602_,
			   bool_603_, bool);
    }
    
    void method14538(Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1) {
	if (aClass185_Sub3_9029.anIntArray9717.length < anInt9044) {
	    aClass185_Sub3_9029.anIntArray9717 = new int[anInt9044];
	    aClass185_Sub3_9029.anIntArray9718 = new int[anInt9044];
	}
	int[] is = aClass185_Sub3_9029.anIntArray9717;
	int[] is_606_ = aClass185_Sub3_9029.anIntArray9718;
	for (int i = 0; i < anInt9057; i++) {
	    int i_607_
		= (((anIntArray9034[i]
		     - (anIntArray9043[i] * aClass185_Sub3_9029.anInt9652
			>> 8))
		    >> aClass185_Sub3_9029.anInt9574)
		   - class534_sub18_sub16_sub1.anInt12071);
	    int i_608_
		= (((anIntArray9041[i]
		     - (anIntArray9043[i] * aClass185_Sub3_9029.anInt9647
			>> 8))
		    >> aClass185_Sub3_9029.anInt9574)
		   - class534_sub18_sub16_sub1.anInt12070);
	    int i_609_ = anIntArray9082[i];
	    int i_610_ = anIntArray9082[i + 1];
	    for (int i_611_ = i_609_;
		 i_611_ < i_610_ && aShortArray9083[i_611_] != 0; i_611_++) {
		int i_612_ = (aShortArray9083[i_611_] & 0xffff) - 1;
		is[i_612_] = i_607_;
		is_606_[i_612_] = i_608_;
	    }
	}
	for (int i = 0; i < anInt9053; i++) {
	    if (aByteArray9055 == null || aByteArray9055[i] <= 128) {
		int i_613_ = aShortArray9056[i] & 0xffff;
		int i_614_ = aShortArray9031[i] & 0xffff;
		int i_615_ = aShortArray9058[i] & 0xffff;
		int i_616_ = is[i_613_];
		int i_617_ = is[i_614_];
		int i_618_ = is[i_615_];
		int i_619_ = is_606_[i_613_];
		int i_620_ = is_606_[i_614_];
		int i_621_ = is_606_[i_615_];
		if (((i_616_ - i_617_) * (i_620_ - i_621_)
		     - (i_620_ - i_619_) * (i_618_ - i_617_))
		    > 0)
		    class534_sub18_sub16_sub1.method18675(i_619_, i_620_,
							  i_621_, i_616_,
							  i_617_, i_618_);
	    }
	}
    }
    
    public int method3210() {
	if (!aBool9075)
	    method14533();
	return aShort9077;
    }
    
    void method14539() {
	if (anInt9053 != 0) {
	    if (aByte9065 != 0)
		method14542(true);
	    method14542(false);
	    if (aClass132_9066 != null) {
		if (aClass132_9066.anInterface16_1580 == null)
		    method14541((aByte9065 & 0x10) != 0);
		if (aClass132_9066.anInterface16_1580 != null) {
		    aClass185_Sub3_9029.method15432(aClass129_9064 != null);
		    aClass185_Sub3_9029.method15221(aClass129_9062,
						    aClass129_9064,
						    aClass129_9079,
						    aClass129_9091);
		    int i = anIntArray9060.length - 1;
		    for (int i_622_ = 0; i_622_ < i; i_622_++) {
			int i_623_ = anIntArray9060[i_622_];
			int i_624_ = anIntArray9060[i_622_ + 1];
			int i_625_ = (aShortArray9059[i_623_] == -1 ? -1
				      : aShortArray9059[i_623_] & 0xffff);
			aClass185_Sub3_9029
			    .method15228(i_625_, aClass129_9064 != null);
			aClass185_Sub3_9029.method15222((aClass132_9066
							 .anInterface16_1580),
							4, i_623_ * 3,
							(i_624_ - i_623_) * 3);
		    }
		}
	    }
	    method14556();
	}
    }
    
    void method14540(Class433 class433) {
	if (aClass149Array9087 != null) {
	    Class433 class433_626_ = aClass185_Sub3_9029.aClass433_9557;
	    aClass185_Sub3_9029.method15211();
	    aClass185_Sub3_9029.method3461(!aBool9035);
	    aClass185_Sub3_9029.method15432(false);
	    aClass185_Sub3_9029.method15221(aClass185_Sub3_9029.aClass129_9711,
					    null, null,
					    (aClass185_Sub3_9029
					     .aClass129_9712));
	    for (int i = 0; i < anInt9086; i++) {
		Class149 class149 = aClass149Array9087[i];
		Class133 class133 = aClass133Array9070[i];
		if (!class149.aBool1692 || !aClass185_Sub3_9029.method3409()) {
		    float f = ((float) (anIntArray9034[class149.anInt1686]
					+ anIntArray9034[class149.anInt1693]
					+ anIntArray9034[class149.anInt1685])
			       * 0.3333333F);
		    float f_627_
			= ((float) (anIntArray9043[class149.anInt1686]
				    + anIntArray9043[class149.anInt1693]
				    + anIntArray9043[class149.anInt1685])
			   * 0.3333333F);
		    float f_628_
			= ((float) (anIntArray9041[class149.anInt1686]
				    + anIntArray9041[class149.anInt1693]
				    + anIntArray9041[class149.anInt1685])
			   * 0.3333333F);
		    float f_629_ = (class433.aFloatArray4853[0] * f
				    + class433.aFloatArray4853[4] * f_627_
				    + class433.aFloatArray4853[8] * f_628_
				    + class433.aFloatArray4853[12]);
		    float f_630_ = (class433.aFloatArray4853[1] * f
				    + class433.aFloatArray4853[5] * f_627_
				    + class433.aFloatArray4853[9] * f_628_
				    + class433.aFloatArray4853[13]);
		    float f_631_ = (class433.aFloatArray4853[2] * f
				    + class433.aFloatArray4853[6] * f_627_
				    + class433.aFloatArray4853[10] * f_628_
				    + class433.aFloatArray4853[14]);
		    float f_632_
			= ((float) (1.0
				    / Math.sqrt((double) (f_629_ * f_629_
							  + f_630_ * f_630_
							  + f_631_ * f_631_)))
			   * (float) class149.anInt1688);
		    class433_626_.method6935
			(class133.anInt1586,
			 class133.anInt1582 * class149.aShort1684 >> 7,
			 class133.anInt1581 * class149.aShort1689 >> 7,
			 f_629_ + (float) class133.anInt1584 - f_629_ * f_632_,
			 f_630_ + (float) class133.anInt1583 - f_630_ * f_632_,
			 f_631_ - f_631_ * f_632_);
		    aClass185_Sub3_9029.method15200(class433_626_);
		    int i_633_ = class133.anInt1585;
		    OpenGL.glColor4ub((byte) (i_633_ >> 16),
				      (byte) (i_633_ >> 8), (byte) i_633_,
				      (byte) (i_633_ >> 24));
		    aClass185_Sub3_9029.method15227(class149.aShort1690);
		    aClass185_Sub3_9029.method15246(class149.aByte1691);
		    aClass185_Sub3_9029.method15274(7, 0, 4);
		}
	    }
	    aClass185_Sub3_9029.method3461(true);
	    aClass185_Sub3_9029.method15201();
	}
    }
    
    void method14541(boolean bool) {
	if ((aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716
	     .aByteArray10810).length
	    < anInt9053 * 6)
	    aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716
		= new Class534_Sub40_Sub2((anInt9053 + 100) * 6);
	else
	    aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716.anInt10811 = 0;
	Class534_Sub40_Sub2 class534_sub40_sub2
	    = aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716;
	if (aClass185_Sub3_9029.aBool9566) {
	    for (int i = 0; i < anInt9053; i++) {
		class534_sub40_sub2.method16507(aShortArray9056[i], 688599446);
		class534_sub40_sub2.method16507(aShortArray9031[i],
						2147288594);
		class534_sub40_sub2.method16507(aShortArray9058[i], 550541859);
	    }
	} else {
	    for (int i = 0; i < anInt9053; i++) {
		class534_sub40_sub2.method16721(aShortArray9056[i],
						1203548667);
		class534_sub40_sub2.method16721(aShortArray9031[i],
						1203548667);
		class534_sub40_sub2.method16721(aShortArray9058[i],
						1203548667);
	    }
	}
	if (class534_sub40_sub2.anInt10811 * 31645619 != 0) {
	    if (bool) {
		if (anInterface16_9067 == null)
		    anInterface16_9067
			= (aClass185_Sub3_9029.method15217
			   (5123, class534_sub40_sub2.aByteArray10810,
			    class534_sub40_sub2.anInt10811 * 31645619, true));
		else
		    anInterface16_9067.method101
			(5123, class534_sub40_sub2.aByteArray10810,
			 class534_sub40_sub2.anInt10811 * 31645619);
		aClass132_9066.anInterface16_1580 = anInterface16_9067;
	    } else
		aClass132_9066.anInterface16_1580
		    = (aClass185_Sub3_9029.method15217
		       (5123, class534_sub40_sub2.aByteArray10810,
			class534_sub40_sub2.anInt10811 * 31645619, false));
	    if (!bool)
		aBool9093 = true;
	}
    }
    
    void method14542(boolean bool) {
	boolean bool_634_ = (aClass129_9079 != null
			     && aClass129_9079.anInterface15_1519 == null);
	boolean bool_635_ = (aClass129_9064 != null
			     && aClass129_9064.anInterface15_1519 == null);
	boolean bool_636_ = (aClass129_9062 != null
			     && aClass129_9062.anInterface15_1519 == null);
	boolean bool_637_ = (aClass129_9091 != null
			     && aClass129_9091.anInterface15_1519 == null);
	if (bool) {
	    bool_634_ = bool_634_ & (aByte9065 & 0x2) != 0;
	    bool_635_ = bool_635_ & (aByte9065 & 0x4) != 0;
	    bool_636_ = bool_636_ & (aByte9065 & 0x1) != 0;
	    bool_637_ = bool_637_ & (aByte9065 & 0x8) != 0;
	}
	byte i = 0;
	byte i_638_ = 0;
	byte i_639_ = 0;
	byte i_640_ = 0;
	byte i_641_ = 0;
	if (bool_636_) {
	    i_638_ = i;
	    i += 12;
	}
	if (bool_634_) {
	    i_639_ = i;
	    i += 4;
	}
	if (bool_635_) {
	    i_640_ = i;
	    i += 12;
	}
	if (bool_637_) {
	    i_641_ = i;
	    i += 8;
	}
	if (i != 0) {
	    if ((aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716
		 .aByteArray10810).length
		< anInt9044 * i)
		aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716
		    = new Class534_Sub40_Sub2((anInt9044 + 100) * i);
	    else
		aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716.anInt10811 = 0;
	    Class534_Sub40_Sub2 class534_sub40_sub2
		= aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716;
	    if (bool_636_) {
		if (aClass185_Sub3_9029.aBool9566) {
		    for (int i_642_ = 0; i_642_ < anInt9057; i_642_++) {
			int i_643_
			    = Stream.floatToRawIntBits((float) anIntArray9034
							       [i_642_]);
			int i_644_
			    = Stream.floatToRawIntBits((float) anIntArray9043
							       [i_642_]);
			int i_645_
			    = Stream.floatToRawIntBits((float) anIntArray9041
							       [i_642_]);
			int i_646_ = anIntArray9082[i_642_];
			int i_647_ = anIntArray9082[i_642_ + 1];
			for (int i_648_ = i_646_;
			     i_648_ < i_647_ && aShortArray9083[i_648_] != 0;
			     i_648_++) {
			    int i_649_
				= (aShortArray9083[i_648_] & 0xffff) - 1;
			    class534_sub40_sub2.anInt10811
				= i_649_ * i * -1387468933;
			    class534_sub40_sub2.method16510(i_643_,
							    -773561843);
			    class534_sub40_sub2.method16510(i_644_,
							    -1270442310);
			    class534_sub40_sub2.method16510(i_645_,
							    -848632800);
			}
		    }
		} else {
		    for (int i_650_ = 0; i_650_ < anInt9057; i_650_++) {
			int i_651_
			    = Stream.floatToRawIntBits((float) anIntArray9034
							       [i_650_]);
			int i_652_
			    = Stream.floatToRawIntBits((float) anIntArray9043
							       [i_650_]);
			int i_653_
			    = Stream.floatToRawIntBits((float) anIntArray9041
							       [i_650_]);
			int i_654_ = anIntArray9082[i_650_];
			int i_655_ = anIntArray9082[i_650_ + 1];
			for (int i_656_ = i_654_;
			     i_656_ < i_655_ && aShortArray9083[i_656_] != 0;
			     i_656_++) {
			    int i_657_
				= (aShortArray9083[i_656_] & 0xffff) - 1;
			    class534_sub40_sub2.anInt10811
				= i_657_ * i * -1387468933;
			    class534_sub40_sub2.method16511(i_651_, 996481189);
			    class534_sub40_sub2.method16511(i_652_,
							    -1187572868);
			    class534_sub40_sub2.method16511(i_653_,
							    -1171186415);
			}
		    }
		}
	    }
	    if (bool_634_) {
		if (aClass129_9064 == null) {
		    short[] is;
		    short[] is_658_;
		    short[] is_659_;
		    byte[] is_660_;
		    if (aClass152_9049 != null) {
			is = aClass152_9049.aShortArray1708;
			is_658_ = aClass152_9049.aShortArray1707;
			is_659_ = aClass152_9049.aShortArray1706;
			is_660_ = aClass152_9049.aByteArray1709;
		    } else {
			is = aShortArray9045;
			is_658_ = aShortArray9042;
			is_659_ = aShortArray9047;
			is_660_ = aByteArray9050;
		    }
		    float f = aClass185_Sub3_9029.aFloatArray9640[0];
		    float f_661_ = aClass185_Sub3_9029.aFloatArray9640[1];
		    float f_662_ = aClass185_Sub3_9029.aFloatArray9640[2];
		    float f_663_ = aClass185_Sub3_9029.aFloat9646;
		    float f_664_ = (aClass185_Sub3_9029.aFloat9686 * 768.0F
				    / (float) aShort9046);
		    float f_665_ = (aClass185_Sub3_9029.aFloat9587 * 768.0F
				    / (float) aShort9046);
		    for (int i_666_ = 0; i_666_ < anInt9052; i_666_++) {
			int i_667_
			    = method14543(aShortArray9054[i_666_],
					  aShortArray9059[i_666_], aShort9040,
					  aByteArray9055[i_666_]);
			float f_668_ = ((float) (i_667_ >>> 24)
					* aClass185_Sub3_9029.aFloat9643);
			float f_669_ = ((float) (i_667_ >> 16 & 0xff)
					* aClass185_Sub3_9029.aFloat9644);
			float f_670_ = ((float) (i_667_ >> 8 & 0xff)
					* aClass185_Sub3_9029.aFloat9645);
			int i_671_ = aShortArray9056[i_666_] & 0xffff;
			short i_672_ = (short) is_660_[i_671_];
			float f_673_;
			if (i_672_ == 0)
			    f_673_ = ((f * (float) is[i_671_]
				       + f_661_ * (float) is_658_[i_671_]
				       + f_662_ * (float) is_659_[i_671_])
				      * 0.0026041667F);
			else
			    f_673_ = ((f * (float) is[i_671_]
				       + f_661_ * (float) is_658_[i_671_]
				       + f_662_ * (float) is_659_[i_671_])
				      / (float) (i_672_ * 256));
			float f_674_ = f_663_ + f_673_ * (f_673_ < 0.0F
							  ? f_665_ : f_664_);
			int i_675_ = (int) (f_668_ * f_674_);
			if (i_675_ < 0)
			    i_675_ = 0;
			else if (i_675_ > 255)
			    i_675_ = 255;
			int i_676_ = (int) (f_669_ * f_674_);
			if (i_676_ < 0)
			    i_676_ = 0;
			else if (i_676_ > 255)
			    i_676_ = 255;
			int i_677_ = (int) (f_670_ * f_674_);
			if (i_677_ < 0)
			    i_677_ = 0;
			else if (i_677_ > 255)
			    i_677_ = 255;
			class534_sub40_sub2.anInt10811
			    = (i_639_ + i_671_ * i) * -1387468933;
			class534_sub40_sub2.method16506(i_675_, 918697575);
			class534_sub40_sub2.method16506(i_676_, 207411710);
			class534_sub40_sub2.method16506(i_677_, 1261715752);
			class534_sub40_sub2.method16506(255 - ((aByteArray9055
								[i_666_])
							       & 0xff),
							1439781251);
			i_671_ = aShortArray9031[i_666_] & 0xffff;
			i_672_ = (short) is_660_[i_671_];
			if (i_672_ == 0)
			    f_673_ = ((f * (float) is[i_671_]
				       + f_661_ * (float) is_658_[i_671_]
				       + f_662_ * (float) is_659_[i_671_])
				      * 0.0026041667F);
			else
			    f_673_ = ((f * (float) is[i_671_]
				       + f_661_ * (float) is_658_[i_671_]
				       + f_662_ * (float) is_659_[i_671_])
				      / (float) (i_672_ * 256));
			f_674_ = f_663_ + f_673_ * (f_673_ < 0.0F ? f_665_
						    : f_664_);
			i_675_ = (int) (f_668_ * f_674_);
			if (i_675_ < 0)
			    i_675_ = 0;
			else if (i_675_ > 255)
			    i_675_ = 255;
			i_676_ = (int) (f_669_ * f_674_);
			if (i_676_ < 0)
			    i_676_ = 0;
			else if (i_676_ > 255)
			    i_676_ = 255;
			i_677_ = (int) (f_670_ * f_674_);
			if (i_677_ < 0)
			    i_677_ = 0;
			else if (i_677_ > 255)
			    i_677_ = 255;
			class534_sub40_sub2.anInt10811
			    = (i_639_ + i_671_ * i) * -1387468933;
			class534_sub40_sub2.method16506(i_675_, 1538590907);
			class534_sub40_sub2.method16506(i_676_, 1025932920);
			class534_sub40_sub2.method16506(i_677_, 1947525707);
			class534_sub40_sub2.method16506(255 - ((aByteArray9055
								[i_666_])
							       & 0xff),
							1725964911);
			i_671_ = aShortArray9058[i_666_] & 0xffff;
			i_672_ = (short) is_660_[i_671_];
			if (i_672_ == 0)
			    f_673_ = ((f * (float) is[i_671_]
				       + f_661_ * (float) is_658_[i_671_]
				       + f_662_ * (float) is_659_[i_671_])
				      * 0.0026041667F);
			else
			    f_673_ = ((f * (float) is[i_671_]
				       + f_661_ * (float) is_658_[i_671_]
				       + f_662_ * (float) is_659_[i_671_])
				      / (float) (i_672_ * 256));
			f_674_ = f_663_ + f_673_ * (f_673_ < 0.0F ? f_665_
						    : f_664_);
			i_675_ = (int) (f_668_ * f_674_);
			if (i_675_ < 0)
			    i_675_ = 0;
			else if (i_675_ > 255)
			    i_675_ = 255;
			i_676_ = (int) (f_669_ * f_674_);
			if (i_676_ < 0)
			    i_676_ = 0;
			else if (i_676_ > 255)
			    i_676_ = 255;
			i_677_ = (int) (f_670_ * f_674_);
			if (i_677_ < 0)
			    i_677_ = 0;
			else if (i_677_ > 255)
			    i_677_ = 255;
			class534_sub40_sub2.anInt10811
			    = (i_639_ + i_671_ * i) * -1387468933;
			class534_sub40_sub2.method16506(i_675_, 1312870030);
			class534_sub40_sub2.method16506(i_676_, 674730998);
			class534_sub40_sub2.method16506(i_677_, 515960976);
			class534_sub40_sub2.method16506(255 - ((aByteArray9055
								[i_666_])
							       & 0xff),
							1475672746);
		    }
		} else {
		    for (int i_678_ = 0; i_678_ < anInt9052; i_678_++) {
			int i_679_
			    = method14543(aShortArray9054[i_678_],
					  aShortArray9059[i_678_], aShort9040,
					  aByteArray9055[i_678_]);
			class534_sub40_sub2.anInt10811
			    = ((i_639_
				+ (aShortArray9056[i_678_] & 0xffff) * i)
			       * -1387468933);
			class534_sub40_sub2.method16510(i_679_, -1686246404);
			class534_sub40_sub2.anInt10811
			    = ((i_639_
				+ (aShortArray9031[i_678_] & 0xffff) * i)
			       * -1387468933);
			class534_sub40_sub2.method16510(i_679_, -1755499896);
			class534_sub40_sub2.anInt10811
			    = ((i_639_
				+ (aShortArray9058[i_678_] & 0xffff) * i)
			       * -1387468933);
			class534_sub40_sub2.method16510(i_679_, -1689694292);
		    }
		}
	    }
	    if (bool_635_) {
		short[] is;
		short[] is_680_;
		short[] is_681_;
		byte[] is_682_;
		if (aClass152_9049 != null) {
		    is = aClass152_9049.aShortArray1708;
		    is_680_ = aClass152_9049.aShortArray1707;
		    is_681_ = aClass152_9049.aShortArray1706;
		    is_682_ = aClass152_9049.aByteArray1709;
		} else {
		    is = aShortArray9045;
		    is_680_ = aShortArray9042;
		    is_681_ = aShortArray9047;
		    is_682_ = aByteArray9050;
		}
		float f = 3.0F / (float) aShort9046;
		float f_683_ = 3.0F / (float) (aShort9046 + aShort9046 / 2);
		class534_sub40_sub2.anInt10811 = i_640_ * -1387468933;
		if (aClass185_Sub3_9029.aBool9566) {
		    for (int i_684_ = 0; i_684_ < anInt9044; i_684_++) {
			int i_685_ = is_682_[i_684_] & 0xff;
			if (i_685_ == 0) {
			    class534_sub40_sub2
				.method18397((float) is[i_684_] * f_683_);
			    class534_sub40_sub2
				.method18397((float) is_680_[i_684_] * f_683_);
			    class534_sub40_sub2
				.method18397((float) is_681_[i_684_] * f_683_);
			} else {
			    float f_686_ = f / (float) i_685_;
			    class534_sub40_sub2
				.method18397((float) is[i_684_] * f_686_);
			    class534_sub40_sub2
				.method18397((float) is_680_[i_684_] * f_686_);
			    class534_sub40_sub2
				.method18397((float) is_681_[i_684_] * f_686_);
			}
			class534_sub40_sub2.anInt10811
			    += (i - 12) * -1387468933;
		    }
		} else {
		    for (int i_687_ = 0; i_687_ < anInt9044; i_687_++) {
			int i_688_ = is_682_[i_687_] & 0xff;
			if (i_688_ == 0) {
			    class534_sub40_sub2
				.method18400((float) is[i_687_] * f_683_);
			    class534_sub40_sub2
				.method18400((float) is_680_[i_687_] * f_683_);
			    class534_sub40_sub2
				.method18400((float) is_681_[i_687_] * f_683_);
			} else {
			    float f_689_ = f / (float) i_688_;
			    class534_sub40_sub2
				.method18400((float) is[i_687_] * f_689_);
			    class534_sub40_sub2
				.method18400((float) is_680_[i_687_] * f_689_);
			    class534_sub40_sub2
				.method18400((float) is_681_[i_687_] * f_689_);
			}
			class534_sub40_sub2.anInt10811
			    += (i - 12) * -1387468933;
		    }
		}
	    }
	    if (bool_637_) {
		class534_sub40_sub2.anInt10811 = i_641_ * -1387468933;
		if (aClass185_Sub3_9029.aBool9566) {
		    for (int i_690_ = 0; i_690_ < anInt9044; i_690_++) {
			class534_sub40_sub2
			    .method18397(aFloatArray9022[i_690_]);
			class534_sub40_sub2
			    .method18397(aFloatArray9051[i_690_]);
			class534_sub40_sub2.anInt10811
			    += (i - 8) * -1387468933;
		    }
		} else {
		    for (int i_691_ = 0; i_691_ < anInt9044; i_691_++) {
			class534_sub40_sub2
			    .method18400(aFloatArray9022[i_691_]);
			class534_sub40_sub2
			    .method18400(aFloatArray9051[i_691_]);
			class534_sub40_sub2.anInt10811
			    += (i - 8) * -1387468933;
		    }
		}
	    }
	    class534_sub40_sub2.anInt10811 = i * anInt9044 * -1387468933;
	    Interface15 interface15;
	    if (bool) {
		if (anInterface15_9068 == null)
		    anInterface15_9068
			= (aClass185_Sub3_9029.method15218
			   (i, class534_sub40_sub2.aByteArray10810,
			    class534_sub40_sub2.anInt10811 * 31645619, true));
		else
		    anInterface15_9068.method95(i,
						(class534_sub40_sub2
						 .aByteArray10810),
						(class534_sub40_sub2.anInt10811
						 * 31645619));
		interface15 = anInterface15_9068;
		aByte9065 = (byte) 0;
	    } else {
		interface15
		    = (aClass185_Sub3_9029.method15218
		       (i, class534_sub40_sub2.aByteArray10810,
			class534_sub40_sub2.anInt10811 * 31645619, false));
		aBool9093 = true;
	    }
	    if (bool_636_) {
		aClass129_9062.anInterface15_1519 = interface15;
		aClass129_9062.aByte1518 = i_638_;
	    }
	    if (bool_637_) {
		aClass129_9091.anInterface15_1519 = interface15;
		aClass129_9091.aByte1518 = i_641_;
	    }
	    if (bool_634_) {
		aClass129_9079.anInterface15_1519 = interface15;
		aClass129_9079.aByte1518 = i_639_;
	    }
	    if (bool_635_) {
		aClass129_9064.anInterface15_1519 = interface15;
		aClass129_9064.aByte1518 = i_640_;
	    }
	}
    }
    
    int method14543(int i, short i_692_, int i_693_, byte i_694_) {
	int i_695_ = Class661.anIntArray8549[method14544(i, i_693_)];
	if (i_692_ != -1) {
	    Class186 class186 = aClass185_Sub3_9029.aClass177_2012
				    .method2931(i_692_ & 0xffff, (byte) 1);
	    int i_696_ = class186.aByte2074 & 0xff;
	    if (i_696_ != 0) {
		int i_697_;
		if (i_693_ < 0)
		    i_697_ = 0;
		else if (i_693_ > 127)
		    i_697_ = 16777215;
		else
		    i_697_ = 131586 * i_693_;
		if (i_696_ == 256)
		    i_695_ = i_697_;
		else {
		    int i_698_ = i_696_;
		    int i_699_ = 256 - i_696_;
		    i_695_ = ((((i_697_ & 0xff00ff) * i_698_
				+ (i_695_ & 0xff00ff) * i_699_)
			       & ~0xff00ff)
			      + (((i_697_ & 0xff00) * i_698_
				  + (i_695_ & 0xff00) * i_699_)
				 & 0xff0000)) >> 8;
		}
	    }
	    int i_700_ = class186.aByte2059 & 0xff;
	    if (i_700_ != 0) {
		i_700_ += 256;
		int i_701_ = ((i_695_ & 0xff0000) >> 16) * i_700_;
		if (i_701_ > 65535)
		    i_701_ = 65535;
		int i_702_ = ((i_695_ & 0xff00) >> 8) * i_700_;
		if (i_702_ > 65535)
		    i_702_ = 65535;
		int i_703_ = (i_695_ & 0xff) * i_700_;
		if (i_703_ > 65535)
		    i_703_ = 65535;
		i_695_ = (i_701_ << 8 & 0xff0000) + (i_702_ & 0xff00) + (i_703_
									 >> 8);
	    }
	}
	return i_695_ << 8 | 255 - (i_694_ & 0xff);
    }
    
    static final int method14544(int i, int i_704_) {
	i_704_ = i_704_ * (i & 0x7f) >> 7;
	if (i_704_ < 2)
	    i_704_ = 2;
	else if (i_704_ > 126)
	    i_704_ = 126;
	return (i & 0xff80) + i_704_;
    }
    
    static {
	anIntArray9027 = new int[8];
	anIntArray9094 = new int[8];
    }
    
    public Class534_Sub18_Sub16 method3097
	(Class534_Sub18_Sub16 class534_sub18_sub16) {
	if (anInt9044 == 0)
	    return null;
	if (!aBool9075)
	    method14533();
	int i;
	int i_705_;
	if (aClass185_Sub3_9029.anInt9652 > 0) {
	    i = (aShort9033 - (aShort9074 * aClass185_Sub3_9029.anInt9652 >> 8)
		 >> aClass185_Sub3_9029.anInt9574);
	    i_705_ = aShort9076 - (aShort9072 * aClass185_Sub3_9029.anInt9652
				   >> 8) >> aClass185_Sub3_9029.anInt9574;
	} else {
	    i = (aShort9033 - (aShort9072 * aClass185_Sub3_9029.anInt9652 >> 8)
		 >> aClass185_Sub3_9029.anInt9574);
	    i_705_ = aShort9076 - (aShort9074 * aClass185_Sub3_9029.anInt9652
				   >> 8) >> aClass185_Sub3_9029.anInt9574;
	}
	int i_706_;
	int i_707_;
	if (aClass185_Sub3_9029.anInt9647 > 0) {
	    i_706_ = aShort9077 - (aShort9074 * aClass185_Sub3_9029.anInt9647
				   >> 8) >> aClass185_Sub3_9029.anInt9574;
	    i_707_ = aShort9078 - (aShort9072 * aClass185_Sub3_9029.anInt9647
				   >> 8) >> aClass185_Sub3_9029.anInt9574;
	} else {
	    i_706_ = aShort9077 - (aShort9072 * aClass185_Sub3_9029.anInt9647
				   >> 8) >> aClass185_Sub3_9029.anInt9574;
	    i_707_ = aShort9078 - (aShort9074 * aClass185_Sub3_9029.anInt9647
				   >> 8) >> aClass185_Sub3_9029.anInt9574;
	}
	int i_708_ = i_705_ - i + 1;
	int i_709_ = i_707_ - i_706_ + 1;
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1
	    = (Class534_Sub18_Sub16_Sub1) class534_sub18_sub16;
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1_710_;
	if (class534_sub18_sub16_sub1 != null
	    && class534_sub18_sub16_sub1.method18681(i_708_, i_709_)) {
	    class534_sub18_sub16_sub1_710_ = class534_sub18_sub16_sub1;
	    class534_sub18_sub16_sub1_710_.method18672();
	} else
	    class534_sub18_sub16_sub1_710_
		= new Class534_Sub18_Sub16_Sub1(aClass185_Sub3_9029, i_708_,
						i_709_);
	class534_sub18_sub16_sub1_710_.method18682(i, i_706_, i_705_, i_707_);
	method14538(class534_sub18_sub16_sub1_710_);
	return class534_sub18_sub16_sub1_710_;
    }
    
    public void method3063(Class183 class183, int i, int i_711_, int i_712_,
			   boolean bool) {
	Class183_Sub1 class183_sub1_713_ = (Class183_Sub1) class183;
	if (anInt9052 != 0 && class183_sub1_713_.anInt9052 != 0) {
	    int i_714_ = class183_sub1_713_.anInt9057;
	    int[] is = class183_sub1_713_.anIntArray9034;
	    int[] is_715_ = class183_sub1_713_.anIntArray9043;
	    int[] is_716_ = class183_sub1_713_.anIntArray9041;
	    short[] is_717_ = class183_sub1_713_.aShortArray9045;
	    short[] is_718_ = class183_sub1_713_.aShortArray9042;
	    short[] is_719_ = class183_sub1_713_.aShortArray9047;
	    byte[] is_720_ = class183_sub1_713_.aByteArray9050;
	    short[] is_721_;
	    short[] is_722_;
	    short[] is_723_;
	    byte[] is_724_;
	    if (aClass152_9049 != null) {
		is_721_ = aClass152_9049.aShortArray1708;
		is_722_ = aClass152_9049.aShortArray1707;
		is_723_ = aClass152_9049.aShortArray1706;
		is_724_ = aClass152_9049.aByteArray1709;
	    } else {
		is_721_ = null;
		is_722_ = null;
		is_723_ = null;
		is_724_ = null;
	    }
	    short[] is_725_;
	    short[] is_726_;
	    short[] is_727_;
	    byte[] is_728_;
	    if (class183_sub1_713_.aClass152_9049 != null) {
		is_725_ = class183_sub1_713_.aClass152_9049.aShortArray1708;
		is_726_ = class183_sub1_713_.aClass152_9049.aShortArray1707;
		is_727_ = class183_sub1_713_.aClass152_9049.aShortArray1706;
		is_728_ = class183_sub1_713_.aClass152_9049.aByteArray1709;
	    } else {
		is_725_ = null;
		is_726_ = null;
		is_727_ = null;
		is_728_ = null;
	    }
	    int[] is_729_ = class183_sub1_713_.anIntArray9082;
	    short[] is_730_ = class183_sub1_713_.aShortArray9083;
	    if (!class183_sub1_713_.aBool9075)
		class183_sub1_713_.method14533();
	    int i_731_ = class183_sub1_713_.aShort9072;
	    int i_732_ = class183_sub1_713_.aShort9074;
	    int i_733_ = class183_sub1_713_.aShort9033;
	    int i_734_ = class183_sub1_713_.aShort9076;
	    int i_735_ = class183_sub1_713_.aShort9077;
	    int i_736_ = class183_sub1_713_.aShort9078;
	    for (int i_737_ = 0; i_737_ < anInt9057; i_737_++) {
		int i_738_ = anIntArray9043[i_737_] - i_711_;
		if (i_738_ >= i_731_ && i_738_ <= i_732_) {
		    int i_739_ = anIntArray9034[i_737_] - i;
		    if (i_739_ >= i_733_ && i_739_ <= i_734_) {
			int i_740_ = anIntArray9041[i_737_] - i_712_;
			if (i_740_ >= i_735_ && i_740_ <= i_736_) {
			    int i_741_ = -1;
			    int i_742_ = anIntArray9082[i_737_];
			    int i_743_ = anIntArray9082[i_737_ + 1];
			    for (int i_744_ = i_742_;
				 (i_744_ < i_743_
				  && aShortArray9083[i_744_] != 0);
				 i_744_++) {
				i_741_
				    = (aShortArray9083[i_744_] & 0xffff) - 1;
				if (aByteArray9050[i_741_] != 0)
				    break;
			    }
			    if (i_741_ != -1) {
				for (int i_745_ = 0; i_745_ < i_714_;
				     i_745_++) {
				    if (i_739_ == is[i_745_]
					&& i_740_ == is_716_[i_745_]
					&& i_738_ == is_715_[i_745_]) {
					int i_746_ = -1;
					i_742_ = is_729_[i_745_];
					i_743_ = is_729_[i_745_ + 1];
					for (int i_747_ = i_742_;
					     (i_747_ < i_743_
					      && is_730_[i_747_] != 0);
					     i_747_++) {
					    i_746_ = (is_730_[i_747_]
						      & 0xffff) - 1;
					    if (is_720_[i_746_] != 0)
						break;
					}
					if (i_746_ != -1) {
					    if (is_721_ == null) {
						aClass152_9049
						    = new Class152();
						is_721_
						    = aClass152_9049
							  .aShortArray1708
						    = (Class534_Sub42
							   .method16820
						       (aShortArray9045,
							(byte) 2));
						is_722_
						    = aClass152_9049
							  .aShortArray1707
						    = (Class534_Sub42
							   .method16820
						       (aShortArray9042,
							(byte) 2));
						is_723_
						    = aClass152_9049
							  .aShortArray1706
						    = (Class534_Sub42
							   .method16820
						       (aShortArray9047,
							(byte) 2));
						is_724_
						    = aClass152_9049
							  .aByteArray1709
						    = (Class586.method9861
						       (aByteArray9050,
							-16711936));
					    }
					    if (is_725_ == null) {
						Class152 class152
						    = (class183_sub1_713_
							   .aClass152_9049
						       = new Class152());
						is_725_
						    = class152.aShortArray1708
						    = (Class534_Sub42
							   .method16820
						       (is_717_, (byte) 2));
						is_726_
						    = class152.aShortArray1707
						    = (Class534_Sub42
							   .method16820
						       (is_718_, (byte) 2));
						is_727_
						    = class152.aShortArray1706
						    = (Class534_Sub42
							   .method16820
						       (is_719_, (byte) 2));
						is_728_
						    = class152.aByteArray1709
						    = (Class586.method9861
						       (is_720_, -16711936));
					    }
					    short i_748_
						= aShortArray9045[i_741_];
					    short i_749_
						= aShortArray9042[i_741_];
					    short i_750_
						= aShortArray9047[i_741_];
					    byte i_751_
						= aByteArray9050[i_741_];
					    i_742_ = is_729_[i_745_];
					    i_743_ = is_729_[i_745_ + 1];
					    for (int i_752_ = i_742_;
						 i_752_ < i_743_; i_752_++) {
						int i_753_
						    = is_730_[i_752_] - 1;
						if (i_753_ == -1)
						    break;
						if (is_728_[i_753_] != 0) {
						    is_725_[i_753_] += i_748_;
						    is_726_[i_753_] += i_749_;
						    is_727_[i_753_] += i_750_;
						    is_728_[i_753_] += i_751_;
						}
					    }
					    i_748_ = is_717_[i_746_];
					    i_749_ = is_718_[i_746_];
					    i_750_ = is_719_[i_746_];
					    i_751_ = is_720_[i_746_];
					    i_742_ = anIntArray9082[i_737_];
					    i_743_
						= anIntArray9082[i_737_ + 1];
					    for (int i_754_ = i_742_;
						 (i_754_ < i_743_
						  && (aShortArray9083[i_754_]
						      != 0));
						 i_754_++) {
						int i_755_
						    = ((aShortArray9083[i_754_]
							& 0xffff)
						       - 1);
						if (is_724_[i_755_] != 0) {
						    is_721_[i_755_] += i_748_;
						    is_722_[i_755_] += i_749_;
						    is_723_[i_755_] += i_750_;
						    is_724_[i_755_] += i_751_;
						}
					    }
					    if (aClass129_9064 == null
						&& aClass129_9079 != null)
						aClass129_9079
						    .anInterface15_1519
						    = null;
					    if (aClass129_9064 != null)
						aClass129_9064
						    .anInterface15_1519
						    = null;
					    if ((class183_sub1_713_
						 .aClass129_9064) == null
						&& (class183_sub1_713_
						    .aClass129_9079) != null)
						class183_sub1_713_
						    .aClass129_9079
						    .anInterface15_1519
						    = null;
					    if ((class183_sub1_713_
						 .aClass129_9064)
						!= null)
						class183_sub1_713_
						    .aClass129_9064
						    .anInterface15_1519
						    = null;
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
    
    public int method3078() {
	if (!aBool9075)
	    method14533();
	return anInt9023;
    }
    
    public void method3169(Class446 class446, Class194 class194, int i) {
	if ((i & 0x2) != 0)
	    OpenGL.glPolygonMode(1032, 6913);
	if (anInt9044 != 0) {
	    Class433 class433 = aClass185_Sub3_9029.aClass433_9605;
	    Class433 class433_756_ = aClass185_Sub3_9029.aClass433_9530;
	    Class433 class433_757_ = aClass185_Sub3_9029.aClass433_9552;
	    class433_756_.method6916(class446);
	    class433_757_.method6842(class433_756_);
	    class433_757_.method6839(aClass185_Sub3_9029.aClass433_9607);
	    if (!aBool9075)
		method14533();
	    float[] fs = aClass185_Sub3_9029.aFloatArray9569;
	    class433_756_.method6850(0.0F, (float) aShort9072, 0.0F, fs);
	    float f = fs[0];
	    float f_758_ = fs[1];
	    float f_759_ = fs[2];
	    class433_756_.method6850(0.0F, (float) aShort9074, 0.0F, fs);
	    float f_760_ = fs[0];
	    float f_761_ = fs[1];
	    float f_762_ = fs[2];
	    for (int i_763_ = 0; i_763_ < 6; i_763_++) {
		float[] fs_764_
		    = aClass185_Sub3_9029.aFloatArrayArray9608[i_763_];
		float f_765_
		    = (fs_764_[0] * f + fs_764_[1] * f_758_
		       + fs_764_[2] * f_759_ + fs_764_[3] + (float) anInt9023);
		float f_766_
		    = (fs_764_[0] * f_760_ + fs_764_[1] * f_761_
		       + fs_764_[2] * f_762_ + fs_764_[3] + (float) anInt9023);
		if (f_765_ < 0.0F && f_766_ < 0.0F)
		    return;
	    }
	    if (class194 != null) {
		boolean bool = false;
		boolean bool_767_ = true;
		int i_768_ = aShort9033 + aShort9076 >> 1;
		int i_769_ = aShort9077 + aShort9078 >> 1;
		int i_770_ = i_768_;
		short i_771_ = aShort9072;
		int i_772_ = i_769_;
		float f_773_
		    = (class433_757_.aFloatArray4853[0] * (float) i_770_
		       + class433_757_.aFloatArray4853[4] * (float) i_771_
		       + class433_757_.aFloatArray4853[8] * (float) i_772_
		       + class433_757_.aFloatArray4853[12]);
		float f_774_
		    = (class433_757_.aFloatArray4853[1] * (float) i_770_
		       + class433_757_.aFloatArray4853[5] * (float) i_771_
		       + class433_757_.aFloatArray4853[9] * (float) i_772_
		       + class433_757_.aFloatArray4853[13]);
		float f_775_
		    = (class433_757_.aFloatArray4853[2] * (float) i_770_
		       + class433_757_.aFloatArray4853[6] * (float) i_771_
		       + class433_757_.aFloatArray4853[10] * (float) i_772_
		       + class433_757_.aFloatArray4853[14]);
		float f_776_
		    = (class433_757_.aFloatArray4853[3] * (float) i_770_
		       + class433_757_.aFloatArray4853[7] * (float) i_771_
		       + class433_757_.aFloatArray4853[11] * (float) i_772_
		       + class433_757_.aFloatArray4853[15]);
		if (f_775_ >= -f_776_) {
		    class194.anInt2148
			= (int) (aClass185_Sub3_9029.aFloat9610
				 + (aClass185_Sub3_9029.aFloat9663 * f_773_
				    / f_776_));
		    class194.anInt2149
			= (int) (aClass185_Sub3_9029.aFloat9612
				 + (aClass185_Sub3_9029.aFloat9613 * f_774_
				    / f_776_));
		} else
		    bool = true;
		i_770_ = i_768_;
		i_771_ = aShort9074;
		i_772_ = i_769_;
		float f_777_
		    = (class433_757_.aFloatArray4853[0] * (float) i_770_
		       + class433_757_.aFloatArray4853[4] * (float) i_771_
		       + class433_757_.aFloatArray4853[8] * (float) i_772_
		       + class433_757_.aFloatArray4853[12]);
		float f_778_
		    = (class433_757_.aFloatArray4853[1] * (float) i_770_
		       + class433_757_.aFloatArray4853[5] * (float) i_771_
		       + class433_757_.aFloatArray4853[9] * (float) i_772_
		       + class433_757_.aFloatArray4853[13]);
		float f_779_
		    = (class433_757_.aFloatArray4853[2] * (float) i_770_
		       + class433_757_.aFloatArray4853[6] * (float) i_771_
		       + class433_757_.aFloatArray4853[10] * (float) i_772_
		       + class433_757_.aFloatArray4853[14]);
		float f_780_
		    = (class433_757_.aFloatArray4853[3] * (float) i_770_
		       + class433_757_.aFloatArray4853[7] * (float) i_771_
		       + class433_757_.aFloatArray4853[11] * (float) i_772_
		       + class433_757_.aFloatArray4853[15]);
		if (f_779_ >= -f_780_) {
		    class194.anInt2152
			= (int) (aClass185_Sub3_9029.aFloat9610
				 + (aClass185_Sub3_9029.aFloat9663 * f_777_
				    / f_780_));
		    class194.anInt2151
			= (int) (aClass185_Sub3_9029.aFloat9612
				 + (aClass185_Sub3_9029.aFloat9613 * f_778_
				    / f_780_));
		} else
		    bool = true;
		if (bool) {
		    if (f_775_ < -f_776_ && f_779_ < -f_780_)
			bool_767_ = false;
		    else if (f_775_ < -f_776_) {
			float f_781_
			    = (f_775_ + f_776_) / (f_779_ + f_780_) - 1.0F;
			float f_782_ = f_773_ + f_781_ * (f_777_ - f_773_);
			float f_783_ = f_774_ + f_781_ * (f_778_ - f_774_);
			float f_784_ = f_776_ + f_781_ * (f_780_ - f_776_);
			class194.anInt2148
			    = (int) (aClass185_Sub3_9029.aFloat9610
				     + (aClass185_Sub3_9029.aFloat9663 * f_782_
					/ f_784_));
			class194.anInt2149
			    = (int) (aClass185_Sub3_9029.aFloat9612
				     + (aClass185_Sub3_9029.aFloat9613 * f_783_
					/ f_784_));
		    } else if (f_779_ < -f_780_) {
			float f_785_
			    = (f_779_ + f_780_) / (f_775_ + f_776_) - 1.0F;
			float f_786_ = f_777_ + f_785_ * (f_773_ - f_777_);
			float f_787_ = f_778_ + f_785_ * (f_774_ - f_778_);
			float f_788_ = f_780_ + f_785_ * (f_776_ - f_780_);
			class194.anInt2152
			    = (int) (aClass185_Sub3_9029.aFloat9610
				     + (aClass185_Sub3_9029.aFloat9663 * f_786_
					/ f_788_));
			class194.anInt2151
			    = (int) (aClass185_Sub3_9029.aFloat9612
				     + (aClass185_Sub3_9029.aFloat9613 * f_787_
					/ f_788_));
		    }
		}
		if (bool_767_) {
		    if (f_775_ / f_776_ > f_779_ / f_780_) {
			float f_789_ = (f_773_
					+ (class433.aFloatArray4853[0]
					   * (float) anInt9023)
					+ class433.aFloatArray4853[12]);
			float f_790_ = (f_776_
					+ (class433.aFloatArray4853[3]
					   * (float) anInt9023)
					+ class433.aFloatArray4853[15]);
			class194.anInt2147
			    = (int) (aClass185_Sub3_9029.aFloat9610
				     - (float) class194.anInt2148
				     + (aClass185_Sub3_9029.aFloat9663 * f_789_
					/ f_790_));
		    } else {
			float f_791_ = (f_777_
					+ (class433.aFloatArray4853[0]
					   * (float) anInt9023)
					+ class433.aFloatArray4853[12]);
			float f_792_ = (f_780_
					+ (class433.aFloatArray4853[3]
					   * (float) anInt9023)
					+ class433.aFloatArray4853[15]);
			class194.anInt2147
			    = (int) (aClass185_Sub3_9029.aFloat9610
				     - (float) class194.anInt2152
				     + (aClass185_Sub3_9029.aFloat9663 * f_791_
					/ f_792_));
		    }
		    class194.aBool2150 = true;
		}
	    }
	    aClass185_Sub3_9029.method15226();
	    aClass185_Sub3_9029.method15199(class433_756_);
	    method14539();
	    aClass185_Sub3_9029.method15201();
	    class433_756_.method6839(aClass185_Sub3_9029.aClass433_9533);
	    method14540(class433_756_);
	    if ((i & 0x2) != 0)
		OpenGL.glPolygonMode(1028, 6914);
	}
    }
    
    public void method3120(int i) {
	aShort9046 = (short) i;
	if (aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
	if (aClass129_9064 != null)
	    aClass129_9064.anInterface15_1519 = null;
    }
    
    public int method3072() {
	return anInt9030;
    }
    
    public void method3022(int i, int i_793_, Class151 class151,
			   Class151 class151_794_, int i_795_, int i_796_,
			   int i_797_) {
	if (!aBool9075)
	    method14533();
	int i_798_ = i_795_ + aShort9033;
	int i_799_ = i_795_ + aShort9076;
	int i_800_ = i_797_ + aShort9077;
	int i_801_ = i_797_ + aShort9078;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_798_ >= 0
		&& ((i_799_ + class151.anInt1702 * 127780559
		     >> class151.anInt1703 * -1495101509)
		    < class151.anInt1701 * -1924295585)
		&& i_800_ >= 0
		&& ((i_801_ + class151.anInt1702 * 127780559
		     >> class151.anInt1703 * -1495101509)
		    < class151.anInt1700 * -1466328823))) {
	    if (i == 4 || i == 5) {
		if (class151_794_ == null
		    || (i_798_ < 0
			|| ((i_799_ + class151_794_.anInt1702 * 127780559
			     >> class151_794_.anInt1703 * -1495101509)
			    >= class151_794_.anInt1701 * -1924295585)
			|| i_800_ < 0
			|| ((i_801_ + class151_794_.anInt1702 * 127780559
			     >> class151_794_.anInt1703 * -1495101509)
			    >= class151_794_.anInt1700 * -1466328823)))
		    return;
	    } else {
		i_798_ >>= class151.anInt1703 * -1495101509;
		i_799_ = (i_799_ + (class151.anInt1702 * 127780559 - 1)
			  >> class151.anInt1703 * -1495101509);
		i_800_ >>= class151.anInt1703 * -1495101509;
		i_801_ = (i_801_ + (class151.anInt1702 * 127780559 - 1)
			  >> class151.anInt1703 * -1495101509);
		if (class151.method2491(i_798_, i_800_, -1012072547) == i_796_
		    && class151.method2491(i_799_, i_800_, 217813773) == i_796_
		    && (class151.method2491(i_798_, i_801_, -1715312917)
			== i_796_)
		    && (class151.method2491(i_799_, i_801_, -2093224680)
			== i_796_))
		    return;
	    }
	    if (i == 1) {
		for (int i_802_ = 0; i_802_ < anInt9057; i_802_++)
		    anIntArray9043[i_802_]
			= (anIntArray9043[i_802_]
			   + class151.method2521((anIntArray9034[i_802_]
						  + i_795_),
						 (anIntArray9041[i_802_]
						  + i_797_),
						 -1816291038)
			   - i_796_);
	    } else if (i == 2) {
		int i_803_ = aShort9072;
		if (i_803_ == 0)
		    return;
		for (int i_804_ = 0; i_804_ < anInt9057; i_804_++) {
		    int i_805_ = (anIntArray9043[i_804_] << 16) / i_803_;
		    if (i_805_ < i_793_)
			anIntArray9043[i_804_]
			    = (anIntArray9043[i_804_]
			       + (class151.method2521((anIntArray9034[i_804_]
						       + i_795_),
						      (anIntArray9041[i_804_]
						       + i_797_),
						      -762506772)
				  - i_796_) * (i_793_ - i_805_) / i_793_);
		}
	    } else if (i == 3) {
		int i_806_ = (i_793_ & 0xff) * 16;
		int i_807_ = (i_793_ >> 8 & 0xff) * 16;
		int i_808_ = (i_793_ >> 16 & 0xff) << 6;
		int i_809_ = (i_793_ >> 24 & 0xff) << 6;
		if (i_795_ - (i_806_ >> 1) < 0
		    || (i_795_ + (i_806_ >> 1) + class151.anInt1702 * 127780559
			>= (class151.anInt1701 * -1924295585
			    << class151.anInt1703 * -1495101509))
		    || i_797_ - (i_807_ >> 1) < 0
		    || (i_797_ + (i_807_ >> 1) + class151.anInt1702 * 127780559
			>= (class151.anInt1700 * -1466328823
			    << class151.anInt1703 * -1495101509)))
		    return;
		method3115(class151, i_795_, i_796_, i_797_, i_806_, i_807_,
			   i_808_, i_809_);
	    } else if (i == 4) {
		int i_810_ = aShort9074 - aShort9072;
		for (int i_811_ = 0; i_811_ < anInt9057; i_811_++)
		    anIntArray9043[i_811_]
			= (anIntArray9043[i_811_]
			   + (class151_794_.method2521((anIntArray9034[i_811_]
							+ i_795_),
						       (anIntArray9041[i_811_]
							+ i_797_),
						       -2084610458)
			      - i_796_)
			   + i_810_);
	    } else if (i == 5) {
		int i_812_ = aShort9074 - aShort9072;
		for (int i_813_ = 0; i_813_ < anInt9057; i_813_++) {
		    int i_814_ = anIntArray9034[i_813_] + i_795_;
		    int i_815_ = anIntArray9041[i_813_] + i_797_;
		    int i_816_
			= class151.method2521(i_814_, i_815_, -635315724);
		    int i_817_ = class151_794_.method2521(i_814_, i_815_,
							  -1565047698);
		    int i_818_ = i_816_ - i_817_ - i_793_;
		    anIntArray9043[i_813_]
			= ((anIntArray9043[i_813_] << 8) / i_812_ * i_818_
			   >> 8) - (i_796_ - i_816_);
		}
	    }
	    if (aClass129_9062 != null)
		aClass129_9062.anInterface15_1519 = null;
	    aBool9075 = false;
	}
    }
    
    public void method3074(int i) {
	anInt9030 = i;
	if (aClass152_9049 != null && (anInt9030 & 0x10000) == 0) {
	    aShortArray9045 = aClass152_9049.aShortArray1708;
	    aShortArray9042 = aClass152_9049.aShortArray1707;
	    aShortArray9047 = aClass152_9049.aShortArray1706;
	    aByteArray9050 = aClass152_9049.aByteArray1709;
	    aClass152_9049 = null;
	}
	aBool9093 = true;
	method14556();
    }
    
    public void method3044() {
	if (anInt9044 > 0 && anInt9053 > 0) {
	    method14542(false);
	    if ((aByte9065 & 0x10) == 0
		&& aClass132_9066.anInterface16_1580 == null)
		method14541(false);
	    method14556();
	}
    }
    
    boolean method14545(int i, int i_819_, int i_820_, int i_821_, int i_822_,
			int i_823_, int i_824_, int i_825_) {
	if (i_819_ < i_820_ && i_819_ < i_821_ && i_819_ < i_822_)
	    return false;
	if (i_819_ > i_820_ && i_819_ > i_821_ && i_819_ > i_822_)
	    return false;
	if (i < i_823_ && i < i_824_ && i < i_825_)
	    return false;
	if (i > i_823_ && i > i_824_ && i > i_825_)
	    return false;
	return true;
    }
    
    public void method3200() {
	if (anInt9044 > 0 && anInt9053 > 0) {
	    method14542(false);
	    if ((aByte9065 & 0x10) == 0
		&& aClass132_9066.anInterface16_1580 == null)
		method14541(false);
	    method14556();
	}
    }
    
    public void method3094() {
	if (anInt9044 > 0 && anInt9053 > 0) {
	    method14542(false);
	    if ((aByte9065 & 0x10) == 0
		&& aClass132_9066.anInterface16_1580 == null)
		method14541(false);
	    method14556();
	}
    }
    
    public void method3079(int i) {
	int i_826_ = Class427.anIntArray4806[i];
	int i_827_ = Class427.anIntArray4805[i];
	for (int i_828_ = 0; i_828_ < anInt9057; i_828_++) {
	    int i_829_ = ((anIntArray9041[i_828_] * i_826_
			   + anIntArray9034[i_828_] * i_827_)
			  >> 14);
	    anIntArray9041[i_828_] = (anIntArray9041[i_828_] * i_827_
				      - anIntArray9034[i_828_] * i_826_) >> 14;
	    anIntArray9034[i_828_] = i_829_;
	}
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	aBool9075 = false;
    }
    
    public void method3075(int i) {
	int i_830_ = Class427.anIntArray4806[i];
	int i_831_ = Class427.anIntArray4805[i];
	for (int i_832_ = 0; i_832_ < anInt9057; i_832_++) {
	    int i_833_ = ((anIntArray9041[i_832_] * i_830_
			   + anIntArray9034[i_832_] * i_831_)
			  >> 14);
	    anIntArray9041[i_832_] = (anIntArray9041[i_832_] * i_831_
				      - anIntArray9034[i_832_] * i_830_) >> 14;
	    anIntArray9034[i_832_] = i_833_;
	}
	for (int i_834_ = 0; i_834_ < anInt9044; i_834_++) {
	    int i_835_ = ((aShortArray9047[i_834_] * i_830_
			   + aShortArray9045[i_834_] * i_831_)
			  >> 14);
	    aShortArray9047[i_834_]
		= (short) ((aShortArray9047[i_834_] * i_831_
			    - aShortArray9045[i_834_] * i_830_)
			   >> 14);
	    aShortArray9045[i_834_] = (short) i_835_;
	}
	if (aClass129_9064 == null && aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
	if (aClass129_9064 != null)
	    aClass129_9064.anInterface15_1519 = null;
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	aBool9075 = false;
    }
    
    void method14546(boolean bool) {
	boolean bool_836_ = (aClass129_9079 != null
			     && aClass129_9079.anInterface15_1519 == null);
	boolean bool_837_ = (aClass129_9064 != null
			     && aClass129_9064.anInterface15_1519 == null);
	boolean bool_838_ = (aClass129_9062 != null
			     && aClass129_9062.anInterface15_1519 == null);
	boolean bool_839_ = (aClass129_9091 != null
			     && aClass129_9091.anInterface15_1519 == null);
	if (bool) {
	    bool_836_ = bool_836_ & (aByte9065 & 0x2) != 0;
	    bool_837_ = bool_837_ & (aByte9065 & 0x4) != 0;
	    bool_838_ = bool_838_ & (aByte9065 & 0x1) != 0;
	    bool_839_ = bool_839_ & (aByte9065 & 0x8) != 0;
	}
	byte i = 0;
	byte i_840_ = 0;
	byte i_841_ = 0;
	byte i_842_ = 0;
	byte i_843_ = 0;
	if (bool_838_) {
	    i_840_ = i;
	    i += 12;
	}
	if (bool_836_) {
	    i_841_ = i;
	    i += 4;
	}
	if (bool_837_) {
	    i_842_ = i;
	    i += 12;
	}
	if (bool_839_) {
	    i_843_ = i;
	    i += 8;
	}
	if (i != 0) {
	    if ((aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716
		 .aByteArray10810).length
		< anInt9044 * i)
		aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716
		    = new Class534_Sub40_Sub2((anInt9044 + 100) * i);
	    else
		aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716.anInt10811 = 0;
	    Class534_Sub40_Sub2 class534_sub40_sub2
		= aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716;
	    if (bool_838_) {
		if (aClass185_Sub3_9029.aBool9566) {
		    for (int i_844_ = 0; i_844_ < anInt9057; i_844_++) {
			int i_845_
			    = Stream.floatToRawIntBits((float) anIntArray9034
							       [i_844_]);
			int i_846_
			    = Stream.floatToRawIntBits((float) anIntArray9043
							       [i_844_]);
			int i_847_
			    = Stream.floatToRawIntBits((float) anIntArray9041
							       [i_844_]);
			int i_848_ = anIntArray9082[i_844_];
			int i_849_ = anIntArray9082[i_844_ + 1];
			for (int i_850_ = i_848_;
			     i_850_ < i_849_ && aShortArray9083[i_850_] != 0;
			     i_850_++) {
			    int i_851_
				= (aShortArray9083[i_850_] & 0xffff) - 1;
			    class534_sub40_sub2.anInt10811
				= i_851_ * i * -1387468933;
			    class534_sub40_sub2.method16510(i_845_,
							    -312451186);
			    class534_sub40_sub2.method16510(i_846_,
							    -1752475359);
			    class534_sub40_sub2.method16510(i_847_,
							    -1256307748);
			}
		    }
		} else {
		    for (int i_852_ = 0; i_852_ < anInt9057; i_852_++) {
			int i_853_
			    = Stream.floatToRawIntBits((float) anIntArray9034
							       [i_852_]);
			int i_854_
			    = Stream.floatToRawIntBits((float) anIntArray9043
							       [i_852_]);
			int i_855_
			    = Stream.floatToRawIntBits((float) anIntArray9041
							       [i_852_]);
			int i_856_ = anIntArray9082[i_852_];
			int i_857_ = anIntArray9082[i_852_ + 1];
			for (int i_858_ = i_856_;
			     i_858_ < i_857_ && aShortArray9083[i_858_] != 0;
			     i_858_++) {
			    int i_859_
				= (aShortArray9083[i_858_] & 0xffff) - 1;
			    class534_sub40_sub2.anInt10811
				= i_859_ * i * -1387468933;
			    class534_sub40_sub2.method16511(i_853_, 373981999);
			    class534_sub40_sub2.method16511(i_854_,
							    1447084374);
			    class534_sub40_sub2.method16511(i_855_, 532459047);
			}
		    }
		}
	    }
	    if (bool_836_) {
		if (aClass129_9064 == null) {
		    short[] is;
		    short[] is_860_;
		    short[] is_861_;
		    byte[] is_862_;
		    if (aClass152_9049 != null) {
			is = aClass152_9049.aShortArray1708;
			is_860_ = aClass152_9049.aShortArray1707;
			is_861_ = aClass152_9049.aShortArray1706;
			is_862_ = aClass152_9049.aByteArray1709;
		    } else {
			is = aShortArray9045;
			is_860_ = aShortArray9042;
			is_861_ = aShortArray9047;
			is_862_ = aByteArray9050;
		    }
		    float f = aClass185_Sub3_9029.aFloatArray9640[0];
		    float f_863_ = aClass185_Sub3_9029.aFloatArray9640[1];
		    float f_864_ = aClass185_Sub3_9029.aFloatArray9640[2];
		    float f_865_ = aClass185_Sub3_9029.aFloat9646;
		    float f_866_ = (aClass185_Sub3_9029.aFloat9686 * 768.0F
				    / (float) aShort9046);
		    float f_867_ = (aClass185_Sub3_9029.aFloat9587 * 768.0F
				    / (float) aShort9046);
		    for (int i_868_ = 0; i_868_ < anInt9052; i_868_++) {
			int i_869_
			    = method14543(aShortArray9054[i_868_],
					  aShortArray9059[i_868_], aShort9040,
					  aByteArray9055[i_868_]);
			float f_870_ = ((float) (i_869_ >>> 24)
					* aClass185_Sub3_9029.aFloat9643);
			float f_871_ = ((float) (i_869_ >> 16 & 0xff)
					* aClass185_Sub3_9029.aFloat9644);
			float f_872_ = ((float) (i_869_ >> 8 & 0xff)
					* aClass185_Sub3_9029.aFloat9645);
			int i_873_ = aShortArray9056[i_868_] & 0xffff;
			short i_874_ = (short) is_862_[i_873_];
			float f_875_;
			if (i_874_ == 0)
			    f_875_ = ((f * (float) is[i_873_]
				       + f_863_ * (float) is_860_[i_873_]
				       + f_864_ * (float) is_861_[i_873_])
				      * 0.0026041667F);
			else
			    f_875_ = ((f * (float) is[i_873_]
				       + f_863_ * (float) is_860_[i_873_]
				       + f_864_ * (float) is_861_[i_873_])
				      / (float) (i_874_ * 256));
			float f_876_ = f_865_ + f_875_ * (f_875_ < 0.0F
							  ? f_867_ : f_866_);
			int i_877_ = (int) (f_870_ * f_876_);
			if (i_877_ < 0)
			    i_877_ = 0;
			else if (i_877_ > 255)
			    i_877_ = 255;
			int i_878_ = (int) (f_871_ * f_876_);
			if (i_878_ < 0)
			    i_878_ = 0;
			else if (i_878_ > 255)
			    i_878_ = 255;
			int i_879_ = (int) (f_872_ * f_876_);
			if (i_879_ < 0)
			    i_879_ = 0;
			else if (i_879_ > 255)
			    i_879_ = 255;
			class534_sub40_sub2.anInt10811
			    = (i_841_ + i_873_ * i) * -1387468933;
			class534_sub40_sub2.method16506(i_877_, 1582625289);
			class534_sub40_sub2.method16506(i_878_, 219048741);
			class534_sub40_sub2.method16506(i_879_, 279680500);
			class534_sub40_sub2.method16506(255 - ((aByteArray9055
								[i_868_])
							       & 0xff),
							356371851);
			i_873_ = aShortArray9031[i_868_] & 0xffff;
			i_874_ = (short) is_862_[i_873_];
			if (i_874_ == 0)
			    f_875_ = ((f * (float) is[i_873_]
				       + f_863_ * (float) is_860_[i_873_]
				       + f_864_ * (float) is_861_[i_873_])
				      * 0.0026041667F);
			else
			    f_875_ = ((f * (float) is[i_873_]
				       + f_863_ * (float) is_860_[i_873_]
				       + f_864_ * (float) is_861_[i_873_])
				      / (float) (i_874_ * 256));
			f_876_ = f_865_ + f_875_ * (f_875_ < 0.0F ? f_867_
						    : f_866_);
			i_877_ = (int) (f_870_ * f_876_);
			if (i_877_ < 0)
			    i_877_ = 0;
			else if (i_877_ > 255)
			    i_877_ = 255;
			i_878_ = (int) (f_871_ * f_876_);
			if (i_878_ < 0)
			    i_878_ = 0;
			else if (i_878_ > 255)
			    i_878_ = 255;
			i_879_ = (int) (f_872_ * f_876_);
			if (i_879_ < 0)
			    i_879_ = 0;
			else if (i_879_ > 255)
			    i_879_ = 255;
			class534_sub40_sub2.anInt10811
			    = (i_841_ + i_873_ * i) * -1387468933;
			class534_sub40_sub2.method16506(i_877_, 588396860);
			class534_sub40_sub2.method16506(i_878_, 1334781746);
			class534_sub40_sub2.method16506(i_879_, 1743319890);
			class534_sub40_sub2.method16506(255 - ((aByteArray9055
								[i_868_])
							       & 0xff),
							506126085);
			i_873_ = aShortArray9058[i_868_] & 0xffff;
			i_874_ = (short) is_862_[i_873_];
			if (i_874_ == 0)
			    f_875_ = ((f * (float) is[i_873_]
				       + f_863_ * (float) is_860_[i_873_]
				       + f_864_ * (float) is_861_[i_873_])
				      * 0.0026041667F);
			else
			    f_875_ = ((f * (float) is[i_873_]
				       + f_863_ * (float) is_860_[i_873_]
				       + f_864_ * (float) is_861_[i_873_])
				      / (float) (i_874_ * 256));
			f_876_ = f_865_ + f_875_ * (f_875_ < 0.0F ? f_867_
						    : f_866_);
			i_877_ = (int) (f_870_ * f_876_);
			if (i_877_ < 0)
			    i_877_ = 0;
			else if (i_877_ > 255)
			    i_877_ = 255;
			i_878_ = (int) (f_871_ * f_876_);
			if (i_878_ < 0)
			    i_878_ = 0;
			else if (i_878_ > 255)
			    i_878_ = 255;
			i_879_ = (int) (f_872_ * f_876_);
			if (i_879_ < 0)
			    i_879_ = 0;
			else if (i_879_ > 255)
			    i_879_ = 255;
			class534_sub40_sub2.anInt10811
			    = (i_841_ + i_873_ * i) * -1387468933;
			class534_sub40_sub2.method16506(i_877_, 975383029);
			class534_sub40_sub2.method16506(i_878_, 1847167517);
			class534_sub40_sub2.method16506(i_879_, 1961581725);
			class534_sub40_sub2.method16506(255 - ((aByteArray9055
								[i_868_])
							       & 0xff),
							862542989);
		    }
		} else {
		    for (int i_880_ = 0; i_880_ < anInt9052; i_880_++) {
			int i_881_
			    = method14543(aShortArray9054[i_880_],
					  aShortArray9059[i_880_], aShort9040,
					  aByteArray9055[i_880_]);
			class534_sub40_sub2.anInt10811
			    = ((i_841_
				+ (aShortArray9056[i_880_] & 0xffff) * i)
			       * -1387468933);
			class534_sub40_sub2.method16510(i_881_, -1758257144);
			class534_sub40_sub2.anInt10811
			    = ((i_841_
				+ (aShortArray9031[i_880_] & 0xffff) * i)
			       * -1387468933);
			class534_sub40_sub2.method16510(i_881_, -1301700544);
			class534_sub40_sub2.anInt10811
			    = ((i_841_
				+ (aShortArray9058[i_880_] & 0xffff) * i)
			       * -1387468933);
			class534_sub40_sub2.method16510(i_881_, -1489102057);
		    }
		}
	    }
	    if (bool_837_) {
		short[] is;
		short[] is_882_;
		short[] is_883_;
		byte[] is_884_;
		if (aClass152_9049 != null) {
		    is = aClass152_9049.aShortArray1708;
		    is_882_ = aClass152_9049.aShortArray1707;
		    is_883_ = aClass152_9049.aShortArray1706;
		    is_884_ = aClass152_9049.aByteArray1709;
		} else {
		    is = aShortArray9045;
		    is_882_ = aShortArray9042;
		    is_883_ = aShortArray9047;
		    is_884_ = aByteArray9050;
		}
		float f = 3.0F / (float) aShort9046;
		float f_885_ = 3.0F / (float) (aShort9046 + aShort9046 / 2);
		class534_sub40_sub2.anInt10811 = i_842_ * -1387468933;
		if (aClass185_Sub3_9029.aBool9566) {
		    for (int i_886_ = 0; i_886_ < anInt9044; i_886_++) {
			int i_887_ = is_884_[i_886_] & 0xff;
			if (i_887_ == 0) {
			    class534_sub40_sub2
				.method18397((float) is[i_886_] * f_885_);
			    class534_sub40_sub2
				.method18397((float) is_882_[i_886_] * f_885_);
			    class534_sub40_sub2
				.method18397((float) is_883_[i_886_] * f_885_);
			} else {
			    float f_888_ = f / (float) i_887_;
			    class534_sub40_sub2
				.method18397((float) is[i_886_] * f_888_);
			    class534_sub40_sub2
				.method18397((float) is_882_[i_886_] * f_888_);
			    class534_sub40_sub2
				.method18397((float) is_883_[i_886_] * f_888_);
			}
			class534_sub40_sub2.anInt10811
			    += (i - 12) * -1387468933;
		    }
		} else {
		    for (int i_889_ = 0; i_889_ < anInt9044; i_889_++) {
			int i_890_ = is_884_[i_889_] & 0xff;
			if (i_890_ == 0) {
			    class534_sub40_sub2
				.method18400((float) is[i_889_] * f_885_);
			    class534_sub40_sub2
				.method18400((float) is_882_[i_889_] * f_885_);
			    class534_sub40_sub2
				.method18400((float) is_883_[i_889_] * f_885_);
			} else {
			    float f_891_ = f / (float) i_890_;
			    class534_sub40_sub2
				.method18400((float) is[i_889_] * f_891_);
			    class534_sub40_sub2
				.method18400((float) is_882_[i_889_] * f_891_);
			    class534_sub40_sub2
				.method18400((float) is_883_[i_889_] * f_891_);
			}
			class534_sub40_sub2.anInt10811
			    += (i - 12) * -1387468933;
		    }
		}
	    }
	    if (bool_839_) {
		class534_sub40_sub2.anInt10811 = i_843_ * -1387468933;
		if (aClass185_Sub3_9029.aBool9566) {
		    for (int i_892_ = 0; i_892_ < anInt9044; i_892_++) {
			class534_sub40_sub2
			    .method18397(aFloatArray9022[i_892_]);
			class534_sub40_sub2
			    .method18397(aFloatArray9051[i_892_]);
			class534_sub40_sub2.anInt10811
			    += (i - 8) * -1387468933;
		    }
		} else {
		    for (int i_893_ = 0; i_893_ < anInt9044; i_893_++) {
			class534_sub40_sub2
			    .method18400(aFloatArray9022[i_893_]);
			class534_sub40_sub2
			    .method18400(aFloatArray9051[i_893_]);
			class534_sub40_sub2.anInt10811
			    += (i - 8) * -1387468933;
		    }
		}
	    }
	    class534_sub40_sub2.anInt10811 = i * anInt9044 * -1387468933;
	    Interface15 interface15;
	    if (bool) {
		if (anInterface15_9068 == null)
		    anInterface15_9068
			= (aClass185_Sub3_9029.method15218
			   (i, class534_sub40_sub2.aByteArray10810,
			    class534_sub40_sub2.anInt10811 * 31645619, true));
		else
		    anInterface15_9068.method95(i,
						(class534_sub40_sub2
						 .aByteArray10810),
						(class534_sub40_sub2.anInt10811
						 * 31645619));
		interface15 = anInterface15_9068;
		aByte9065 = (byte) 0;
	    } else {
		interface15
		    = (aClass185_Sub3_9029.method15218
		       (i, class534_sub40_sub2.aByteArray10810,
			class534_sub40_sub2.anInt10811 * 31645619, false));
		aBool9093 = true;
	    }
	    if (bool_838_) {
		aClass129_9062.anInterface15_1519 = interface15;
		aClass129_9062.aByte1518 = i_840_;
	    }
	    if (bool_839_) {
		aClass129_9091.anInterface15_1519 = interface15;
		aClass129_9091.aByte1518 = i_843_;
	    }
	    if (bool_836_) {
		aClass129_9079.anInterface15_1519 = interface15;
		aClass129_9079.aByte1518 = i_841_;
	    }
	    if (bool_837_) {
		aClass129_9064.anInterface15_1519 = interface15;
		aClass129_9064.aByte1518 = i_842_;
	    }
	}
    }
    
    public void method3180(int i) {
	int i_894_ = Class427.anIntArray4806[i];
	int i_895_ = Class427.anIntArray4805[i];
	for (int i_896_ = 0; i_896_ < anInt9057; i_896_++) {
	    int i_897_ = ((anIntArray9043[i_896_] * i_895_
			   - anIntArray9041[i_896_] * i_894_)
			  >> 14);
	    anIntArray9041[i_896_] = (anIntArray9043[i_896_] * i_894_
				      + anIntArray9041[i_896_] * i_895_) >> 14;
	    anIntArray9043[i_896_] = i_897_;
	}
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	aBool9075 = false;
    }
    
    public void method3083(int i) {
	int i_898_ = Class427.anIntArray4806[i];
	int i_899_ = Class427.anIntArray4805[i];
	for (int i_900_ = 0; i_900_ < anInt9057; i_900_++) {
	    int i_901_ = ((anIntArray9043[i_900_] * i_898_
			   + anIntArray9034[i_900_] * i_899_)
			  >> 14);
	    anIntArray9043[i_900_] = (anIntArray9043[i_900_] * i_899_
				      - anIntArray9034[i_900_] * i_898_) >> 14;
	    anIntArray9034[i_900_] = i_901_;
	}
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	aBool9075 = false;
    }
    
    void method3033(int i, int[] is, int i_902_, int i_903_, int i_904_,
		    int i_905_, boolean bool) {
	int i_906_ = is.length;
	if (i == 0) {
	    i_902_ <<= 4;
	    i_903_ <<= 4;
	    i_904_ <<= 4;
	    int i_907_ = 0;
	    anInt9095 = 0;
	    anInt9096 = 0;
	    anInt9097 = 0;
	    for (int i_908_ = 0; i_908_ < i_906_; i_908_++) {
		int i_909_ = is[i_908_];
		if (i_909_ < anIntArrayArray9028.length) {
		    int[] is_910_ = anIntArrayArray9028[i_909_];
		    for (int i_911_ = 0; i_911_ < is_910_.length; i_911_++) {
			int i_912_ = is_910_[i_911_];
			anInt9095 += anIntArray9034[i_912_];
			anInt9096 += anIntArray9043[i_912_];
			anInt9097 += anIntArray9041[i_912_];
			i_907_++;
		    }
		}
	    }
	    if (i_907_ > 0) {
		anInt9095 = anInt9095 / i_907_ + i_902_;
		anInt9096 = anInt9096 / i_907_ + i_903_;
		anInt9097 = anInt9097 / i_907_ + i_904_;
	    } else {
		anInt9095 = i_902_;
		anInt9096 = i_903_;
		anInt9097 = i_904_;
	    }
	} else if (i == 1) {
	    i_902_ <<= 4;
	    i_903_ <<= 4;
	    i_904_ <<= 4;
	    for (int i_913_ = 0; i_913_ < i_906_; i_913_++) {
		int i_914_ = is[i_913_];
		if (i_914_ < anIntArrayArray9028.length) {
		    int[] is_915_ = anIntArrayArray9028[i_914_];
		    for (int i_916_ = 0; i_916_ < is_915_.length; i_916_++) {
			int i_917_ = is_915_[i_916_];
			anIntArray9034[i_917_] += i_902_;
			anIntArray9043[i_917_] += i_903_;
			anIntArray9041[i_917_] += i_904_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_918_ = 0; i_918_ < i_906_; i_918_++) {
		int i_919_ = is[i_918_];
		if (i_919_ < anIntArrayArray9028.length) {
		    int[] is_920_ = anIntArrayArray9028[i_919_];
		    if ((i_905_ & 0x1) == 0) {
			for (int i_921_ = 0; i_921_ < is_920_.length;
			     i_921_++) {
			    int i_922_ = is_920_[i_921_];
			    anIntArray9034[i_922_] -= anInt9095;
			    anIntArray9043[i_922_] -= anInt9096;
			    anIntArray9041[i_922_] -= anInt9097;
			    if (i_904_ != 0) {
				int i_923_ = Class427.anIntArray4806[i_904_];
				int i_924_ = Class427.anIntArray4805[i_904_];
				int i_925_ = (anIntArray9043[i_922_] * i_923_
					      + anIntArray9034[i_922_] * i_924_
					      + 16383) >> 14;
				anIntArray9043[i_922_]
				    = (anIntArray9043[i_922_] * i_924_
				       - anIntArray9034[i_922_] * i_923_
				       + 16383) >> 14;
				anIntArray9034[i_922_] = i_925_;
			    }
			    if (i_902_ != 0) {
				int i_926_ = Class427.anIntArray4806[i_902_];
				int i_927_ = Class427.anIntArray4805[i_902_];
				int i_928_ = (anIntArray9043[i_922_] * i_927_
					      - anIntArray9041[i_922_] * i_926_
					      + 16383) >> 14;
				anIntArray9041[i_922_]
				    = (anIntArray9043[i_922_] * i_926_
				       + anIntArray9041[i_922_] * i_927_
				       + 16383) >> 14;
				anIntArray9043[i_922_] = i_928_;
			    }
			    if (i_903_ != 0) {
				int i_929_ = Class427.anIntArray4806[i_903_];
				int i_930_ = Class427.anIntArray4805[i_903_];
				int i_931_ = (anIntArray9041[i_922_] * i_929_
					      + anIntArray9034[i_922_] * i_930_
					      + 16383) >> 14;
				anIntArray9041[i_922_]
				    = (anIntArray9041[i_922_] * i_930_
				       - anIntArray9034[i_922_] * i_929_
				       + 16383) >> 14;
				anIntArray9034[i_922_] = i_931_;
			    }
			    anIntArray9034[i_922_] += anInt9095;
			    anIntArray9043[i_922_] += anInt9096;
			    anIntArray9041[i_922_] += anInt9097;
			}
		    } else {
			for (int i_932_ = 0; i_932_ < is_920_.length;
			     i_932_++) {
			    int i_933_ = is_920_[i_932_];
			    anIntArray9034[i_933_] -= anInt9095;
			    anIntArray9043[i_933_] -= anInt9096;
			    anIntArray9041[i_933_] -= anInt9097;
			    if (i_902_ != 0) {
				int i_934_ = Class427.anIntArray4806[i_902_];
				int i_935_ = Class427.anIntArray4805[i_902_];
				int i_936_ = (anIntArray9043[i_933_] * i_935_
					      - anIntArray9041[i_933_] * i_934_
					      + 16383) >> 14;
				anIntArray9041[i_933_]
				    = (anIntArray9043[i_933_] * i_934_
				       + anIntArray9041[i_933_] * i_935_
				       + 16383) >> 14;
				anIntArray9043[i_933_] = i_936_;
			    }
			    if (i_904_ != 0) {
				int i_937_ = Class427.anIntArray4806[i_904_];
				int i_938_ = Class427.anIntArray4805[i_904_];
				int i_939_ = (anIntArray9043[i_933_] * i_937_
					      + anIntArray9034[i_933_] * i_938_
					      + 16383) >> 14;
				anIntArray9043[i_933_]
				    = (anIntArray9043[i_933_] * i_938_
				       - anIntArray9034[i_933_] * i_937_
				       + 16383) >> 14;
				anIntArray9034[i_933_] = i_939_;
			    }
			    if (i_903_ != 0) {
				int i_940_ = Class427.anIntArray4806[i_903_];
				int i_941_ = Class427.anIntArray4805[i_903_];
				int i_942_ = (anIntArray9041[i_933_] * i_940_
					      + anIntArray9034[i_933_] * i_941_
					      + 16383) >> 14;
				anIntArray9041[i_933_]
				    = (anIntArray9041[i_933_] * i_941_
				       - anIntArray9034[i_933_] * i_940_
				       + 16383) >> 14;
				anIntArray9034[i_933_] = i_942_;
			    }
			    anIntArray9034[i_933_] += anInt9095;
			    anIntArray9043[i_933_] += anInt9096;
			    anIntArray9041[i_933_] += anInt9097;
			}
		    }
		}
	    }
	    if (bool) {
		for (int i_943_ = 0; i_943_ < i_906_; i_943_++) {
		    int i_944_ = is[i_943_];
		    if (i_944_ < anIntArrayArray9028.length) {
			int[] is_945_ = anIntArrayArray9028[i_944_];
			for (int i_946_ = 0; i_946_ < is_945_.length;
			     i_946_++) {
			    int i_947_ = is_945_[i_946_];
			    int i_948_ = anIntArray9082[i_947_];
			    int i_949_ = anIntArray9082[i_947_ + 1];
			    for (int i_950_ = i_948_;
				 (i_950_ < i_949_
				  && aShortArray9083[i_950_] != 0);
				 i_950_++) {
				int i_951_
				    = (aShortArray9083[i_950_] & 0xffff) - 1;
				if (i_904_ != 0) {
				    int i_952_
					= Class427.anIntArray4806[i_904_];
				    int i_953_
					= Class427.anIntArray4805[i_904_];
				    int i_954_
					= ((aShortArray9042[i_951_] * i_952_
					    + aShortArray9045[i_951_] * i_953_
					    + 16383)
					   >> 14);
				    aShortArray9042[i_951_]
					= (short) (((aShortArray9042[i_951_]
						     * i_953_)
						    - (aShortArray9045[i_951_]
						       * i_952_)
						    + 16383)
						   >> 14);
				    aShortArray9045[i_951_] = (short) i_954_;
				}
				if (i_902_ != 0) {
				    int i_955_
					= Class427.anIntArray4806[i_902_];
				    int i_956_
					= Class427.anIntArray4805[i_902_];
				    int i_957_
					= ((aShortArray9042[i_951_] * i_956_
					    - aShortArray9047[i_951_] * i_955_
					    + 16383)
					   >> 14);
				    aShortArray9047[i_951_]
					= (short) (((aShortArray9042[i_951_]
						     * i_955_)
						    + (aShortArray9047[i_951_]
						       * i_956_)
						    + 16383)
						   >> 14);
				    aShortArray9042[i_951_] = (short) i_957_;
				}
				if (i_903_ != 0) {
				    int i_958_
					= Class427.anIntArray4806[i_903_];
				    int i_959_
					= Class427.anIntArray4805[i_903_];
				    int i_960_
					= ((aShortArray9047[i_951_] * i_958_
					    + aShortArray9045[i_951_] * i_959_
					    + 16383)
					   >> 14);
				    aShortArray9047[i_951_]
					= (short) (((aShortArray9047[i_951_]
						     * i_959_)
						    - (aShortArray9045[i_951_]
						       * i_958_)
						    + 16383)
						   >> 14);
				    aShortArray9045[i_951_] = (short) i_960_;
				}
			    }
			}
		    }
		}
		if (aClass129_9064 == null && aClass129_9079 != null)
		    aClass129_9079.anInterface15_1519 = null;
		if (aClass129_9064 != null)
		    aClass129_9064.anInterface15_1519 = null;
	    }
	} else if (i == 3) {
	    for (int i_961_ = 0; i_961_ < i_906_; i_961_++) {
		int i_962_ = is[i_961_];
		if (i_962_ < anIntArrayArray9028.length) {
		    int[] is_963_ = anIntArrayArray9028[i_962_];
		    for (int i_964_ = 0; i_964_ < is_963_.length; i_964_++) {
			int i_965_ = is_963_[i_964_];
			anIntArray9034[i_965_] -= anInt9095;
			anIntArray9043[i_965_] -= anInt9096;
			anIntArray9041[i_965_] -= anInt9097;
			anIntArray9034[i_965_]
			    = anIntArray9034[i_965_] * i_902_ >> 7;
			anIntArray9043[i_965_]
			    = anIntArray9043[i_965_] * i_903_ >> 7;
			anIntArray9041[i_965_]
			    = anIntArray9041[i_965_] * i_904_ >> 7;
			anIntArray9034[i_965_] += anInt9095;
			anIntArray9043[i_965_] += anInt9096;
			anIntArray9041[i_965_] += anInt9097;
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9073 != null) {
		for (int i_966_ = 0; i_966_ < i_906_; i_966_++) {
		    int i_967_ = is[i_966_];
		    if (i_967_ < anIntArrayArray9073.length) {
			int[] is_968_ = anIntArrayArray9073[i_967_];
			for (int i_969_ = 0; i_969_ < is_968_.length;
			     i_969_++) {
			    int i_970_ = is_968_[i_969_];
			    int i_971_
				= (aByteArray9055[i_970_] & 0xff) + i_902_ * 8;
			    if (i_971_ < 0)
				i_971_ = 0;
			    else if (i_971_ > 255)
				i_971_ = 255;
			    aByteArray9055[i_970_] = (byte) i_971_;
			}
			if (is_968_.length > 0 && aClass129_9079 != null)
			    aClass129_9079.anInterface15_1519 = null;
		    }
		}
		if (aClass149Array9087 != null) {
		    for (int i_972_ = 0; i_972_ < anInt9086; i_972_++) {
			Class149 class149 = aClass149Array9087[i_972_];
			Class133 class133 = aClass133Array9070[i_972_];
			class133.anInt1585
			    = (class133.anInt1585 & 0xffffff
			       | 255 - (aByteArray9055[class149.anInt1687]
					& 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9073 != null) {
		for (int i_973_ = 0; i_973_ < i_906_; i_973_++) {
		    int i_974_ = is[i_973_];
		    if (i_974_ < anIntArrayArray9073.length) {
			int[] is_975_ = anIntArrayArray9073[i_974_];
			for (int i_976_ = 0; i_976_ < is_975_.length;
			     i_976_++) {
			    int i_977_ = is_975_[i_976_];
			    int i_978_ = aShortArray9054[i_977_] & 0xffff;
			    int i_979_ = i_978_ >> 10 & 0x3f;
			    int i_980_ = i_978_ >> 7 & 0x7;
			    int i_981_ = i_978_ & 0x7f;
			    i_979_ = i_979_ + i_902_ & 0x3f;
			    i_980_ += i_903_ / 4;
			    if (i_980_ < 0)
				i_980_ = 0;
			    else if (i_980_ > 7)
				i_980_ = 7;
			    i_981_ += i_904_;
			    if (i_981_ < 0)
				i_981_ = 0;
			    else if (i_981_ > 127)
				i_981_ = 127;
			    aShortArray9054[i_977_]
				= (short) (i_979_ << 10 | i_980_ << 7
					   | i_981_);
			}
			if (is_975_.length > 0 && aClass129_9079 != null)
			    aClass129_9079.anInterface15_1519 = null;
		    }
		}
		if (aClass149Array9087 != null) {
		    for (int i_982_ = 0; i_982_ < anInt9086; i_982_++) {
			Class149 class149 = aClass149Array9087[i_982_];
			Class133 class133 = aClass133Array9070[i_982_];
			class133.anInt1585
			    = (class133.anInt1585 & ~0xffffff
			       | (Class661.anIntArray8549
				  [(aShortArray9054[class149.anInt1687]
				    & 0xffff)]) & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9089 != null) {
		for (int i_983_ = 0; i_983_ < i_906_; i_983_++) {
		    int i_984_ = is[i_983_];
		    if (i_984_ < anIntArrayArray9089.length) {
			int[] is_985_ = anIntArrayArray9089[i_984_];
			for (int i_986_ = 0; i_986_ < is_985_.length;
			     i_986_++) {
			    Class133 class133
				= aClass133Array9070[is_985_[i_986_]];
			    class133.anInt1584 += i_902_;
			    class133.anInt1583 += i_903_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9089 != null) {
		for (int i_987_ = 0; i_987_ < i_906_; i_987_++) {
		    int i_988_ = is[i_987_];
		    if (i_988_ < anIntArrayArray9089.length) {
			int[] is_989_ = anIntArrayArray9089[i_988_];
			for (int i_990_ = 0; i_990_ < is_989_.length;
			     i_990_++) {
			    Class133 class133
				= aClass133Array9070[is_989_[i_990_]];
			    class133.anInt1582
				= class133.anInt1582 * i_902_ >> 7;
			    class133.anInt1581
				= class133.anInt1581 * i_903_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9089 != null) {
		for (int i_991_ = 0; i_991_ < i_906_; i_991_++) {
		    int i_992_ = is[i_991_];
		    if (i_992_ < anIntArrayArray9089.length) {
			int[] is_993_ = anIntArrayArray9089[i_992_];
			for (int i_994_ = 0; i_994_ < is_993_.length;
			     i_994_++) {
			    Class133 class133
				= aClass133Array9070[is_993_[i_994_]];
			    class133.anInt1586
				= class133.anInt1586 + i_902_ & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    public byte[] method3055() {
	return aByteArray9055;
    }
    
    public void method3086() {
	for (int i = 0; i < anInt9057; i++)
	    anIntArray9041[i] = -anIntArray9041[i];
	for (int i = 0; i < anInt9044; i++)
	    aShortArray9047[i] = (short) -aShortArray9047[i];
	for (int i = 0; i < anInt9052; i++) {
	    short i_995_ = aShortArray9056[i];
	    aShortArray9056[i] = aShortArray9058[i];
	    aShortArray9058[i] = i_995_;
	}
	if (aClass129_9064 == null && aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
	if (aClass129_9064 != null)
	    aClass129_9064.anInterface15_1519 = null;
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	if (aClass132_9066 != null)
	    aClass132_9066.anInterface16_1580 = null;
	aBool9075 = false;
    }
    
    int method14547(int i, short i_996_, int i_997_, byte i_998_) {
	int i_999_ = Class661.anIntArray8549[method14544(i, i_997_)];
	if (i_996_ != -1) {
	    Class186 class186 = aClass185_Sub3_9029.aClass177_2012
				    .method2931(i_996_ & 0xffff, (byte) 1);
	    int i_1000_ = class186.aByte2074 & 0xff;
	    if (i_1000_ != 0) {
		int i_1001_;
		if (i_997_ < 0)
		    i_1001_ = 0;
		else if (i_997_ > 127)
		    i_1001_ = 16777215;
		else
		    i_1001_ = 131586 * i_997_;
		if (i_1000_ == 256)
		    i_999_ = i_1001_;
		else {
		    int i_1002_ = i_1000_;
		    int i_1003_ = 256 - i_1000_;
		    i_999_ = ((((i_1001_ & 0xff00ff) * i_1002_
				+ (i_999_ & 0xff00ff) * i_1003_)
			       & ~0xff00ff)
			      + (((i_1001_ & 0xff00) * i_1002_
				  + (i_999_ & 0xff00) * i_1003_)
				 & 0xff0000)) >> 8;
		}
	    }
	    int i_1004_ = class186.aByte2059 & 0xff;
	    if (i_1004_ != 0) {
		i_1004_ += 256;
		int i_1005_ = ((i_999_ & 0xff0000) >> 16) * i_1004_;
		if (i_1005_ > 65535)
		    i_1005_ = 65535;
		int i_1006_ = ((i_999_ & 0xff00) >> 8) * i_1004_;
		if (i_1006_ > 65535)
		    i_1006_ = 65535;
		int i_1007_ = (i_999_ & 0xff) * i_1004_;
		if (i_1007_ > 65535)
		    i_1007_ = 65535;
		i_999_
		    = (i_1005_ << 8 & 0xff0000) + (i_1006_ & 0xff00) + (i_1007_
									>> 8);
	    }
	}
	return i_999_ << 8 | 255 - (i_998_ & 0xff);
    }
    
    public void method3208() {
	for (int i = 0; i < anInt9057; i++)
	    anIntArray9041[i] = -anIntArray9041[i];
	for (int i = 0; i < anInt9044; i++)
	    aShortArray9047[i] = (short) -aShortArray9047[i];
	for (int i = 0; i < anInt9052; i++) {
	    short i_1008_ = aShortArray9056[i];
	    aShortArray9056[i] = aShortArray9058[i];
	    aShortArray9058[i] = i_1008_;
	}
	if (aClass129_9064 == null && aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
	if (aClass129_9064 != null)
	    aClass129_9064.anInterface15_1519 = null;
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	if (aClass132_9066 != null)
	    aClass132_9066.anInterface16_1580 = null;
	aBool9075 = false;
    }
    
    void method14548(boolean bool) {
	if ((aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716
	     .aByteArray10810).length
	    < anInt9053 * 6)
	    aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716
		= new Class534_Sub40_Sub2((anInt9053 + 100) * 6);
	else
	    aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716.anInt10811 = 0;
	Class534_Sub40_Sub2 class534_sub40_sub2
	    = aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716;
	if (aClass185_Sub3_9029.aBool9566) {
	    for (int i = 0; i < anInt9053; i++) {
		class534_sub40_sub2.method16507(aShortArray9056[i], 997202877);
		class534_sub40_sub2.method16507(aShortArray9031[i],
						1756149524);
		class534_sub40_sub2.method16507(aShortArray9058[i],
						1558229208);
	    }
	} else {
	    for (int i = 0; i < anInt9053; i++) {
		class534_sub40_sub2.method16721(aShortArray9056[i],
						1203548667);
		class534_sub40_sub2.method16721(aShortArray9031[i],
						1203548667);
		class534_sub40_sub2.method16721(aShortArray9058[i],
						1203548667);
	    }
	}
	if (class534_sub40_sub2.anInt10811 * 31645619 != 0) {
	    if (bool) {
		if (anInterface16_9067 == null)
		    anInterface16_9067
			= (aClass185_Sub3_9029.method15217
			   (5123, class534_sub40_sub2.aByteArray10810,
			    class534_sub40_sub2.anInt10811 * 31645619, true));
		else
		    anInterface16_9067.method101
			(5123, class534_sub40_sub2.aByteArray10810,
			 class534_sub40_sub2.anInt10811 * 31645619);
		aClass132_9066.anInterface16_1580 = anInterface16_9067;
	    } else
		aClass132_9066.anInterface16_1580
		    = (aClass185_Sub3_9029.method15217
		       (5123, class534_sub40_sub2.aByteArray10810,
			class534_sub40_sub2.anInt10811 * 31645619, false));
	    if (!bool)
		aBool9093 = true;
	}
    }
    
    public Class172[] method3163() {
	return aClass172Array9084;
    }
    
    public void method3091(int i, int i_1009_, Class151 class151,
			   Class151 class151_1010_, int i_1011_, int i_1012_,
			   int i_1013_) {
	if (!aBool9075)
	    method14533();
	int i_1014_ = i_1011_ + aShort9033;
	int i_1015_ = i_1011_ + aShort9076;
	int i_1016_ = i_1013_ + aShort9077;
	int i_1017_ = i_1013_ + aShort9078;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_1014_ >= 0
		&& ((i_1015_ + class151.anInt1702 * 127780559
		     >> class151.anInt1703 * -1495101509)
		    < class151.anInt1701 * -1924295585)
		&& i_1016_ >= 0
		&& ((i_1017_ + class151.anInt1702 * 127780559
		     >> class151.anInt1703 * -1495101509)
		    < class151.anInt1700 * -1466328823))) {
	    if (i == 4 || i == 5) {
		if (class151_1010_ == null
		    || (i_1014_ < 0
			|| ((i_1015_ + class151_1010_.anInt1702 * 127780559
			     >> class151_1010_.anInt1703 * -1495101509)
			    >= class151_1010_.anInt1701 * -1924295585)
			|| i_1016_ < 0
			|| ((i_1017_ + class151_1010_.anInt1702 * 127780559
			     >> class151_1010_.anInt1703 * -1495101509)
			    >= class151_1010_.anInt1700 * -1466328823)))
		    return;
	    } else {
		i_1014_ >>= class151.anInt1703 * -1495101509;
		i_1015_ = (i_1015_ + (class151.anInt1702 * 127780559 - 1)
			   >> class151.anInt1703 * -1495101509);
		i_1016_ >>= class151.anInt1703 * -1495101509;
		i_1017_ = (i_1017_ + (class151.anInt1702 * 127780559 - 1)
			   >> class151.anInt1703 * -1495101509);
		if (class151.method2491(i_1014_, i_1016_, 601906799) == i_1012_
		    && (class151.method2491(i_1015_, i_1016_, -1359845578)
			== i_1012_)
		    && (class151.method2491(i_1014_, i_1017_, -895607656)
			== i_1012_)
		    && (class151.method2491(i_1015_, i_1017_, 1718793059)
			== i_1012_))
		    return;
	    }
	    if (i == 1) {
		for (int i_1018_ = 0; i_1018_ < anInt9057; i_1018_++)
		    anIntArray9043[i_1018_]
			= (anIntArray9043[i_1018_]
			   + class151.method2521((anIntArray9034[i_1018_]
						  + i_1011_),
						 (anIntArray9041[i_1018_]
						  + i_1013_),
						 -608399523)
			   - i_1012_);
	    } else if (i == 2) {
		int i_1019_ = aShort9072;
		if (i_1019_ == 0)
		    return;
		for (int i_1020_ = 0; i_1020_ < anInt9057; i_1020_++) {
		    int i_1021_ = (anIntArray9043[i_1020_] << 16) / i_1019_;
		    if (i_1021_ < i_1009_)
			anIntArray9043[i_1020_]
			    = (anIntArray9043[i_1020_]
			       + (class151.method2521((anIntArray9034[i_1020_]
						       + i_1011_),
						      (anIntArray9041[i_1020_]
						       + i_1013_),
						      -1617627420)
				  - i_1012_) * (i_1009_ - i_1021_) / i_1009_);
		}
	    } else if (i == 3) {
		int i_1022_ = (i_1009_ & 0xff) * 16;
		int i_1023_ = (i_1009_ >> 8 & 0xff) * 16;
		int i_1024_ = (i_1009_ >> 16 & 0xff) << 6;
		int i_1025_ = (i_1009_ >> 24 & 0xff) << 6;
		if (i_1011_ - (i_1022_ >> 1) < 0
		    || ((i_1011_ + (i_1022_ >> 1)
			 + class151.anInt1702 * 127780559)
			>= (class151.anInt1701 * -1924295585
			    << class151.anInt1703 * -1495101509))
		    || i_1013_ - (i_1023_ >> 1) < 0
		    || ((i_1013_ + (i_1023_ >> 1)
			 + class151.anInt1702 * 127780559)
			>= (class151.anInt1700 * -1466328823
			    << class151.anInt1703 * -1495101509)))
		    return;
		method3115(class151, i_1011_, i_1012_, i_1013_, i_1022_,
			   i_1023_, i_1024_, i_1025_);
	    } else if (i == 4) {
		int i_1026_ = aShort9074 - aShort9072;
		for (int i_1027_ = 0; i_1027_ < anInt9057; i_1027_++)
		    anIntArray9043[i_1027_]
			= (anIntArray9043[i_1027_]
			   + ((class151_1010_.method2521
			       (anIntArray9034[i_1027_] + i_1011_,
				anIntArray9041[i_1027_] + i_1013_, -782514455))
			      - i_1012_)
			   + i_1026_);
	    } else if (i == 5) {
		int i_1028_ = aShort9074 - aShort9072;
		for (int i_1029_ = 0; i_1029_ < anInt9057; i_1029_++) {
		    int i_1030_ = anIntArray9034[i_1029_] + i_1011_;
		    int i_1031_ = anIntArray9041[i_1029_] + i_1013_;
		    int i_1032_
			= class151.method2521(i_1030_, i_1031_, -1995103903);
		    int i_1033_ = class151_1010_.method2521(i_1030_, i_1031_,
							    -1694151935);
		    int i_1034_ = i_1032_ - i_1033_ - i_1009_;
		    anIntArray9043[i_1029_]
			= ((anIntArray9043[i_1029_] << 8) / i_1028_ * i_1034_
			   >> 8) - (i_1012_ - i_1032_);
		}
	    }
	    if (aClass129_9062 != null)
		aClass129_9062.anInterface15_1519 = null;
	    aBool9075 = false;
	}
    }
    
    public void method3132(int i, int i_1035_, Class151 class151,
			   Class151 class151_1036_, int i_1037_, int i_1038_,
			   int i_1039_) {
	if (!aBool9075)
	    method14533();
	int i_1040_ = i_1037_ + aShort9033;
	int i_1041_ = i_1037_ + aShort9076;
	int i_1042_ = i_1039_ + aShort9077;
	int i_1043_ = i_1039_ + aShort9078;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_1040_ >= 0
		&& ((i_1041_ + class151.anInt1702 * 127780559
		     >> class151.anInt1703 * -1495101509)
		    < class151.anInt1701 * -1924295585)
		&& i_1042_ >= 0
		&& ((i_1043_ + class151.anInt1702 * 127780559
		     >> class151.anInt1703 * -1495101509)
		    < class151.anInt1700 * -1466328823))) {
	    if (i == 4 || i == 5) {
		if (class151_1036_ == null
		    || (i_1040_ < 0
			|| ((i_1041_ + class151_1036_.anInt1702 * 127780559
			     >> class151_1036_.anInt1703 * -1495101509)
			    >= class151_1036_.anInt1701 * -1924295585)
			|| i_1042_ < 0
			|| ((i_1043_ + class151_1036_.anInt1702 * 127780559
			     >> class151_1036_.anInt1703 * -1495101509)
			    >= class151_1036_.anInt1700 * -1466328823)))
		    return;
	    } else {
		i_1040_ >>= class151.anInt1703 * -1495101509;
		i_1041_ = (i_1041_ + (class151.anInt1702 * 127780559 - 1)
			   >> class151.anInt1703 * -1495101509);
		i_1042_ >>= class151.anInt1703 * -1495101509;
		i_1043_ = (i_1043_ + (class151.anInt1702 * 127780559 - 1)
			   >> class151.anInt1703 * -1495101509);
		if ((class151.method2491(i_1040_, i_1042_, -501121787)
		     == i_1038_)
		    && (class151.method2491(i_1041_, i_1042_, 1155925265)
			== i_1038_)
		    && (class151.method2491(i_1040_, i_1043_, -1592719796)
			== i_1038_)
		    && (class151.method2491(i_1041_, i_1043_, -708209802)
			== i_1038_))
		    return;
	    }
	    if (i == 1) {
		for (int i_1044_ = 0; i_1044_ < anInt9057; i_1044_++)
		    anIntArray9043[i_1044_]
			= (anIntArray9043[i_1044_]
			   + class151.method2521((anIntArray9034[i_1044_]
						  + i_1037_),
						 (anIntArray9041[i_1044_]
						  + i_1039_),
						 -1322541390)
			   - i_1038_);
	    } else if (i == 2) {
		int i_1045_ = aShort9072;
		if (i_1045_ == 0)
		    return;
		for (int i_1046_ = 0; i_1046_ < anInt9057; i_1046_++) {
		    int i_1047_ = (anIntArray9043[i_1046_] << 16) / i_1045_;
		    if (i_1047_ < i_1035_)
			anIntArray9043[i_1046_]
			    = (anIntArray9043[i_1046_]
			       + (class151.method2521((anIntArray9034[i_1046_]
						       + i_1037_),
						      (anIntArray9041[i_1046_]
						       + i_1039_),
						      -2052133151)
				  - i_1038_) * (i_1035_ - i_1047_) / i_1035_);
		}
	    } else if (i == 3) {
		int i_1048_ = (i_1035_ & 0xff) * 16;
		int i_1049_ = (i_1035_ >> 8 & 0xff) * 16;
		int i_1050_ = (i_1035_ >> 16 & 0xff) << 6;
		int i_1051_ = (i_1035_ >> 24 & 0xff) << 6;
		if (i_1037_ - (i_1048_ >> 1) < 0
		    || ((i_1037_ + (i_1048_ >> 1)
			 + class151.anInt1702 * 127780559)
			>= (class151.anInt1701 * -1924295585
			    << class151.anInt1703 * -1495101509))
		    || i_1039_ - (i_1049_ >> 1) < 0
		    || ((i_1039_ + (i_1049_ >> 1)
			 + class151.anInt1702 * 127780559)
			>= (class151.anInt1700 * -1466328823
			    << class151.anInt1703 * -1495101509)))
		    return;
		method3115(class151, i_1037_, i_1038_, i_1039_, i_1048_,
			   i_1049_, i_1050_, i_1051_);
	    } else if (i == 4) {
		int i_1052_ = aShort9074 - aShort9072;
		for (int i_1053_ = 0; i_1053_ < anInt9057; i_1053_++)
		    anIntArray9043[i_1053_]
			= (anIntArray9043[i_1053_]
			   + (class151_1036_.method2521((anIntArray9034
							 [i_1053_]) + i_1037_,
							(anIntArray9041
							 [i_1053_]) + i_1039_,
							-1878848315)
			      - i_1038_)
			   + i_1052_);
	    } else if (i == 5) {
		int i_1054_ = aShort9074 - aShort9072;
		for (int i_1055_ = 0; i_1055_ < anInt9057; i_1055_++) {
		    int i_1056_ = anIntArray9034[i_1055_] + i_1037_;
		    int i_1057_ = anIntArray9041[i_1055_] + i_1039_;
		    int i_1058_
			= class151.method2521(i_1056_, i_1057_, -1035059163);
		    int i_1059_ = class151_1036_.method2521(i_1056_, i_1057_,
							    -501481058);
		    int i_1060_ = i_1058_ - i_1059_ - i_1035_;
		    anIntArray9043[i_1055_]
			= ((anIntArray9043[i_1055_] << 8) / i_1054_ * i_1060_
			   >> 8) - (i_1038_ - i_1058_);
		}
	    }
	    if (aClass129_9062 != null)
		aClass129_9062.anInterface15_1519 = null;
	    aBool9075 = false;
	}
    }
    
    public void method3093(int i, int i_1061_, Class151 class151,
			   Class151 class151_1062_, int i_1063_, int i_1064_,
			   int i_1065_) {
	if (!aBool9075)
	    method14533();
	int i_1066_ = i_1063_ + aShort9033;
	int i_1067_ = i_1063_ + aShort9076;
	int i_1068_ = i_1065_ + aShort9077;
	int i_1069_ = i_1065_ + aShort9078;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_1066_ >= 0
		&& ((i_1067_ + class151.anInt1702 * 127780559
		     >> class151.anInt1703 * -1495101509)
		    < class151.anInt1701 * -1924295585)
		&& i_1068_ >= 0
		&& ((i_1069_ + class151.anInt1702 * 127780559
		     >> class151.anInt1703 * -1495101509)
		    < class151.anInt1700 * -1466328823))) {
	    if (i == 4 || i == 5) {
		if (class151_1062_ == null
		    || (i_1066_ < 0
			|| ((i_1067_ + class151_1062_.anInt1702 * 127780559
			     >> class151_1062_.anInt1703 * -1495101509)
			    >= class151_1062_.anInt1701 * -1924295585)
			|| i_1068_ < 0
			|| ((i_1069_ + class151_1062_.anInt1702 * 127780559
			     >> class151_1062_.anInt1703 * -1495101509)
			    >= class151_1062_.anInt1700 * -1466328823)))
		    return;
	    } else {
		i_1066_ >>= class151.anInt1703 * -1495101509;
		i_1067_ = (i_1067_ + (class151.anInt1702 * 127780559 - 1)
			   >> class151.anInt1703 * -1495101509);
		i_1068_ >>= class151.anInt1703 * -1495101509;
		i_1069_ = (i_1069_ + (class151.anInt1702 * 127780559 - 1)
			   >> class151.anInt1703 * -1495101509);
		if (class151.method2491(i_1066_, i_1068_, 110001368) == i_1064_
		    && (class151.method2491(i_1067_, i_1068_, 7401693)
			== i_1064_)
		    && (class151.method2491(i_1066_, i_1069_, 135647914)
			== i_1064_)
		    && (class151.method2491(i_1067_, i_1069_, -1143699722)
			== i_1064_))
		    return;
	    }
	    if (i == 1) {
		for (int i_1070_ = 0; i_1070_ < anInt9057; i_1070_++)
		    anIntArray9043[i_1070_]
			= (anIntArray9043[i_1070_]
			   + class151.method2521((anIntArray9034[i_1070_]
						  + i_1063_),
						 (anIntArray9041[i_1070_]
						  + i_1065_),
						 -772899258)
			   - i_1064_);
	    } else if (i == 2) {
		int i_1071_ = aShort9072;
		if (i_1071_ == 0)
		    return;
		for (int i_1072_ = 0; i_1072_ < anInt9057; i_1072_++) {
		    int i_1073_ = (anIntArray9043[i_1072_] << 16) / i_1071_;
		    if (i_1073_ < i_1061_)
			anIntArray9043[i_1072_]
			    = (anIntArray9043[i_1072_]
			       + (class151.method2521((anIntArray9034[i_1072_]
						       + i_1063_),
						      (anIntArray9041[i_1072_]
						       + i_1065_),
						      -736977295)
				  - i_1064_) * (i_1061_ - i_1073_) / i_1061_);
		}
	    } else if (i == 3) {
		int i_1074_ = (i_1061_ & 0xff) * 16;
		int i_1075_ = (i_1061_ >> 8 & 0xff) * 16;
		int i_1076_ = (i_1061_ >> 16 & 0xff) << 6;
		int i_1077_ = (i_1061_ >> 24 & 0xff) << 6;
		if (i_1063_ - (i_1074_ >> 1) < 0
		    || ((i_1063_ + (i_1074_ >> 1)
			 + class151.anInt1702 * 127780559)
			>= (class151.anInt1701 * -1924295585
			    << class151.anInt1703 * -1495101509))
		    || i_1065_ - (i_1075_ >> 1) < 0
		    || ((i_1065_ + (i_1075_ >> 1)
			 + class151.anInt1702 * 127780559)
			>= (class151.anInt1700 * -1466328823
			    << class151.anInt1703 * -1495101509)))
		    return;
		method3115(class151, i_1063_, i_1064_, i_1065_, i_1074_,
			   i_1075_, i_1076_, i_1077_);
	    } else if (i == 4) {
		int i_1078_ = aShort9074 - aShort9072;
		for (int i_1079_ = 0; i_1079_ < anInt9057; i_1079_++)
		    anIntArray9043[i_1079_]
			= (anIntArray9043[i_1079_]
			   + ((class151_1062_.method2521
			       (anIntArray9034[i_1079_] + i_1063_,
				anIntArray9041[i_1079_] + i_1065_, -657853717))
			      - i_1064_)
			   + i_1078_);
	    } else if (i == 5) {
		int i_1080_ = aShort9074 - aShort9072;
		for (int i_1081_ = 0; i_1081_ < anInt9057; i_1081_++) {
		    int i_1082_ = anIntArray9034[i_1081_] + i_1063_;
		    int i_1083_ = anIntArray9041[i_1081_] + i_1065_;
		    int i_1084_
			= class151.method2521(i_1082_, i_1083_, -926913558);
		    int i_1085_ = class151_1062_.method2521(i_1082_, i_1083_,
							    -986595584);
		    int i_1086_ = i_1084_ - i_1085_ - i_1061_;
		    anIntArray9043[i_1081_]
			= ((anIntArray9043[i_1081_] << 8) / i_1080_ * i_1086_
			   >> 8) - (i_1064_ - i_1084_);
		}
	    }
	    if (aClass129_9062 != null)
		aClass129_9062.anInterface15_1519 = null;
	    aBool9075 = false;
	}
    }
    
    boolean method3066() {
	if (anIntArrayArray9028 == null)
	    return false;
	for (int i = 0; i < anInt9037; i++) {
	    anIntArray9034[i] <<= 4;
	    anIntArray9043[i] <<= 4;
	    anIntArray9041[i] <<= 4;
	}
	anInt9095 = 0;
	anInt9096 = 0;
	anInt9097 = 0;
	return true;
    }
    
    void method3162() {
	for (int i = 0; i < anInt9037; i++) {
	    anIntArray9034[i] = anIntArray9034[i] + 7 >> 4;
	    anIntArray9043[i] = anIntArray9043[i] + 7 >> 4;
	    anIntArray9041[i] = anIntArray9041[i] + 7 >> 4;
	}
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	aBool9075 = false;
    }
    
    public void method3080(int i) {
	int i_1087_ = Class427.anIntArray4806[i];
	int i_1088_ = Class427.anIntArray4805[i];
	for (int i_1089_ = 0; i_1089_ < anInt9057; i_1089_++) {
	    int i_1090_ = ((anIntArray9041[i_1089_] * i_1087_
			    + anIntArray9034[i_1089_] * i_1088_)
			   >> 14);
	    anIntArray9041[i_1089_]
		= (anIntArray9041[i_1089_] * i_1088_
		   - anIntArray9034[i_1089_] * i_1087_) >> 14;
	    anIntArray9034[i_1089_] = i_1090_;
	}
	for (int i_1091_ = 0; i_1091_ < anInt9044; i_1091_++) {
	    int i_1092_ = ((aShortArray9047[i_1091_] * i_1087_
			    + aShortArray9045[i_1091_] * i_1088_)
			   >> 14);
	    aShortArray9047[i_1091_]
		= (short) ((aShortArray9047[i_1091_] * i_1088_
			    - aShortArray9045[i_1091_] * i_1087_)
			   >> 14);
	    aShortArray9045[i_1091_] = (short) i_1092_;
	}
	if (aClass129_9064 == null && aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
	if (aClass129_9064 != null)
	    aClass129_9064.anInterface15_1519 = null;
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	aBool9075 = false;
    }
    
    public int method3085() {
	if (!aBool9075)
	    method14533();
	return anInt9023;
    }
    
    void method3031(int i, int[] is, int i_1093_, int i_1094_, int i_1095_,
		    int i_1096_, boolean bool) {
	int i_1097_ = is.length;
	if (i == 0) {
	    i_1093_ <<= 4;
	    i_1094_ <<= 4;
	    i_1095_ <<= 4;
	    int i_1098_ = 0;
	    anInt9095 = 0;
	    anInt9096 = 0;
	    anInt9097 = 0;
	    for (int i_1099_ = 0; i_1099_ < i_1097_; i_1099_++) {
		int i_1100_ = is[i_1099_];
		if (i_1100_ < anIntArrayArray9028.length) {
		    int[] is_1101_ = anIntArrayArray9028[i_1100_];
		    for (int i_1102_ = 0; i_1102_ < is_1101_.length;
			 i_1102_++) {
			int i_1103_ = is_1101_[i_1102_];
			anInt9095 += anIntArray9034[i_1103_];
			anInt9096 += anIntArray9043[i_1103_];
			anInt9097 += anIntArray9041[i_1103_];
			i_1098_++;
		    }
		}
	    }
	    if (i_1098_ > 0) {
		anInt9095 = anInt9095 / i_1098_ + i_1093_;
		anInt9096 = anInt9096 / i_1098_ + i_1094_;
		anInt9097 = anInt9097 / i_1098_ + i_1095_;
	    } else {
		anInt9095 = i_1093_;
		anInt9096 = i_1094_;
		anInt9097 = i_1095_;
	    }
	} else if (i == 1) {
	    i_1093_ <<= 4;
	    i_1094_ <<= 4;
	    i_1095_ <<= 4;
	    for (int i_1104_ = 0; i_1104_ < i_1097_; i_1104_++) {
		int i_1105_ = is[i_1104_];
		if (i_1105_ < anIntArrayArray9028.length) {
		    int[] is_1106_ = anIntArrayArray9028[i_1105_];
		    for (int i_1107_ = 0; i_1107_ < is_1106_.length;
			 i_1107_++) {
			int i_1108_ = is_1106_[i_1107_];
			anIntArray9034[i_1108_] += i_1093_;
			anIntArray9043[i_1108_] += i_1094_;
			anIntArray9041[i_1108_] += i_1095_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_1109_ = 0; i_1109_ < i_1097_; i_1109_++) {
		int i_1110_ = is[i_1109_];
		if (i_1110_ < anIntArrayArray9028.length) {
		    int[] is_1111_ = anIntArrayArray9028[i_1110_];
		    if ((i_1096_ & 0x1) == 0) {
			for (int i_1112_ = 0; i_1112_ < is_1111_.length;
			     i_1112_++) {
			    int i_1113_ = is_1111_[i_1112_];
			    anIntArray9034[i_1113_] -= anInt9095;
			    anIntArray9043[i_1113_] -= anInt9096;
			    anIntArray9041[i_1113_] -= anInt9097;
			    if (i_1095_ != 0) {
				int i_1114_ = Class427.anIntArray4806[i_1095_];
				int i_1115_ = Class427.anIntArray4805[i_1095_];
				int i_1116_
				    = ((anIntArray9043[i_1113_] * i_1114_
					+ anIntArray9034[i_1113_] * i_1115_
					+ 16383)
				       >> 14);
				anIntArray9043[i_1113_]
				    = (anIntArray9043[i_1113_] * i_1115_
				       - anIntArray9034[i_1113_] * i_1114_
				       + 16383) >> 14;
				anIntArray9034[i_1113_] = i_1116_;
			    }
			    if (i_1093_ != 0) {
				int i_1117_ = Class427.anIntArray4806[i_1093_];
				int i_1118_ = Class427.anIntArray4805[i_1093_];
				int i_1119_
				    = ((anIntArray9043[i_1113_] * i_1118_
					- anIntArray9041[i_1113_] * i_1117_
					+ 16383)
				       >> 14);
				anIntArray9041[i_1113_]
				    = (anIntArray9043[i_1113_] * i_1117_
				       + anIntArray9041[i_1113_] * i_1118_
				       + 16383) >> 14;
				anIntArray9043[i_1113_] = i_1119_;
			    }
			    if (i_1094_ != 0) {
				int i_1120_ = Class427.anIntArray4806[i_1094_];
				int i_1121_ = Class427.anIntArray4805[i_1094_];
				int i_1122_
				    = ((anIntArray9041[i_1113_] * i_1120_
					+ anIntArray9034[i_1113_] * i_1121_
					+ 16383)
				       >> 14);
				anIntArray9041[i_1113_]
				    = (anIntArray9041[i_1113_] * i_1121_
				       - anIntArray9034[i_1113_] * i_1120_
				       + 16383) >> 14;
				anIntArray9034[i_1113_] = i_1122_;
			    }
			    anIntArray9034[i_1113_] += anInt9095;
			    anIntArray9043[i_1113_] += anInt9096;
			    anIntArray9041[i_1113_] += anInt9097;
			}
		    } else {
			for (int i_1123_ = 0; i_1123_ < is_1111_.length;
			     i_1123_++) {
			    int i_1124_ = is_1111_[i_1123_];
			    anIntArray9034[i_1124_] -= anInt9095;
			    anIntArray9043[i_1124_] -= anInt9096;
			    anIntArray9041[i_1124_] -= anInt9097;
			    if (i_1093_ != 0) {
				int i_1125_ = Class427.anIntArray4806[i_1093_];
				int i_1126_ = Class427.anIntArray4805[i_1093_];
				int i_1127_
				    = ((anIntArray9043[i_1124_] * i_1126_
					- anIntArray9041[i_1124_] * i_1125_
					+ 16383)
				       >> 14);
				anIntArray9041[i_1124_]
				    = (anIntArray9043[i_1124_] * i_1125_
				       + anIntArray9041[i_1124_] * i_1126_
				       + 16383) >> 14;
				anIntArray9043[i_1124_] = i_1127_;
			    }
			    if (i_1095_ != 0) {
				int i_1128_ = Class427.anIntArray4806[i_1095_];
				int i_1129_ = Class427.anIntArray4805[i_1095_];
				int i_1130_
				    = ((anIntArray9043[i_1124_] * i_1128_
					+ anIntArray9034[i_1124_] * i_1129_
					+ 16383)
				       >> 14);
				anIntArray9043[i_1124_]
				    = (anIntArray9043[i_1124_] * i_1129_
				       - anIntArray9034[i_1124_] * i_1128_
				       + 16383) >> 14;
				anIntArray9034[i_1124_] = i_1130_;
			    }
			    if (i_1094_ != 0) {
				int i_1131_ = Class427.anIntArray4806[i_1094_];
				int i_1132_ = Class427.anIntArray4805[i_1094_];
				int i_1133_
				    = ((anIntArray9041[i_1124_] * i_1131_
					+ anIntArray9034[i_1124_] * i_1132_
					+ 16383)
				       >> 14);
				anIntArray9041[i_1124_]
				    = (anIntArray9041[i_1124_] * i_1132_
				       - anIntArray9034[i_1124_] * i_1131_
				       + 16383) >> 14;
				anIntArray9034[i_1124_] = i_1133_;
			    }
			    anIntArray9034[i_1124_] += anInt9095;
			    anIntArray9043[i_1124_] += anInt9096;
			    anIntArray9041[i_1124_] += anInt9097;
			}
		    }
		}
	    }
	    if (bool) {
		for (int i_1134_ = 0; i_1134_ < i_1097_; i_1134_++) {
		    int i_1135_ = is[i_1134_];
		    if (i_1135_ < anIntArrayArray9028.length) {
			int[] is_1136_ = anIntArrayArray9028[i_1135_];
			for (int i_1137_ = 0; i_1137_ < is_1136_.length;
			     i_1137_++) {
			    int i_1138_ = is_1136_[i_1137_];
			    int i_1139_ = anIntArray9082[i_1138_];
			    int i_1140_ = anIntArray9082[i_1138_ + 1];
			    for (int i_1141_ = i_1139_;
				 (i_1141_ < i_1140_
				  && aShortArray9083[i_1141_] != 0);
				 i_1141_++) {
				int i_1142_
				    = (aShortArray9083[i_1141_] & 0xffff) - 1;
				if (i_1095_ != 0) {
				    int i_1143_
					= Class427.anIntArray4806[i_1095_];
				    int i_1144_
					= Class427.anIntArray4805[i_1095_];
				    int i_1145_
					= (aShortArray9042[i_1142_] * i_1143_
					   + aShortArray9045[i_1142_] * i_1144_
					   + 16383) >> 14;
				    aShortArray9042[i_1142_]
					= (short) (((aShortArray9042[i_1142_]
						     * i_1144_)
						    - (aShortArray9045[i_1142_]
						       * i_1143_)
						    + 16383)
						   >> 14);
				    aShortArray9045[i_1142_] = (short) i_1145_;
				}
				if (i_1093_ != 0) {
				    int i_1146_
					= Class427.anIntArray4806[i_1093_];
				    int i_1147_
					= Class427.anIntArray4805[i_1093_];
				    int i_1148_
					= (aShortArray9042[i_1142_] * i_1147_
					   - aShortArray9047[i_1142_] * i_1146_
					   + 16383) >> 14;
				    aShortArray9047[i_1142_]
					= (short) (((aShortArray9042[i_1142_]
						     * i_1146_)
						    + (aShortArray9047[i_1142_]
						       * i_1147_)
						    + 16383)
						   >> 14);
				    aShortArray9042[i_1142_] = (short) i_1148_;
				}
				if (i_1094_ != 0) {
				    int i_1149_
					= Class427.anIntArray4806[i_1094_];
				    int i_1150_
					= Class427.anIntArray4805[i_1094_];
				    int i_1151_
					= (aShortArray9047[i_1142_] * i_1149_
					   + aShortArray9045[i_1142_] * i_1150_
					   + 16383) >> 14;
				    aShortArray9047[i_1142_]
					= (short) (((aShortArray9047[i_1142_]
						     * i_1150_)
						    - (aShortArray9045[i_1142_]
						       * i_1149_)
						    + 16383)
						   >> 14);
				    aShortArray9045[i_1142_] = (short) i_1151_;
				}
			    }
			}
		    }
		}
		if (aClass129_9064 == null && aClass129_9079 != null)
		    aClass129_9079.anInterface15_1519 = null;
		if (aClass129_9064 != null)
		    aClass129_9064.anInterface15_1519 = null;
	    }
	} else if (i == 3) {
	    for (int i_1152_ = 0; i_1152_ < i_1097_; i_1152_++) {
		int i_1153_ = is[i_1152_];
		if (i_1153_ < anIntArrayArray9028.length) {
		    int[] is_1154_ = anIntArrayArray9028[i_1153_];
		    for (int i_1155_ = 0; i_1155_ < is_1154_.length;
			 i_1155_++) {
			int i_1156_ = is_1154_[i_1155_];
			anIntArray9034[i_1156_] -= anInt9095;
			anIntArray9043[i_1156_] -= anInt9096;
			anIntArray9041[i_1156_] -= anInt9097;
			anIntArray9034[i_1156_]
			    = anIntArray9034[i_1156_] * i_1093_ >> 7;
			anIntArray9043[i_1156_]
			    = anIntArray9043[i_1156_] * i_1094_ >> 7;
			anIntArray9041[i_1156_]
			    = anIntArray9041[i_1156_] * i_1095_ >> 7;
			anIntArray9034[i_1156_] += anInt9095;
			anIntArray9043[i_1156_] += anInt9096;
			anIntArray9041[i_1156_] += anInt9097;
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9073 != null) {
		for (int i_1157_ = 0; i_1157_ < i_1097_; i_1157_++) {
		    int i_1158_ = is[i_1157_];
		    if (i_1158_ < anIntArrayArray9073.length) {
			int[] is_1159_ = anIntArrayArray9073[i_1158_];
			for (int i_1160_ = 0; i_1160_ < is_1159_.length;
			     i_1160_++) {
			    int i_1161_ = is_1159_[i_1160_];
			    int i_1162_ = ((aByteArray9055[i_1161_] & 0xff)
					   + i_1093_ * 8);
			    if (i_1162_ < 0)
				i_1162_ = 0;
			    else if (i_1162_ > 255)
				i_1162_ = 255;
			    aByteArray9055[i_1161_] = (byte) i_1162_;
			}
			if (is_1159_.length > 0 && aClass129_9079 != null)
			    aClass129_9079.anInterface15_1519 = null;
		    }
		}
		if (aClass149Array9087 != null) {
		    for (int i_1163_ = 0; i_1163_ < anInt9086; i_1163_++) {
			Class149 class149 = aClass149Array9087[i_1163_];
			Class133 class133 = aClass133Array9070[i_1163_];
			class133.anInt1585
			    = (class133.anInt1585 & 0xffffff
			       | 255 - (aByteArray9055[class149.anInt1687]
					& 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9073 != null) {
		for (int i_1164_ = 0; i_1164_ < i_1097_; i_1164_++) {
		    int i_1165_ = is[i_1164_];
		    if (i_1165_ < anIntArrayArray9073.length) {
			int[] is_1166_ = anIntArrayArray9073[i_1165_];
			for (int i_1167_ = 0; i_1167_ < is_1166_.length;
			     i_1167_++) {
			    int i_1168_ = is_1166_[i_1167_];
			    int i_1169_ = aShortArray9054[i_1168_] & 0xffff;
			    int i_1170_ = i_1169_ >> 10 & 0x3f;
			    int i_1171_ = i_1169_ >> 7 & 0x7;
			    int i_1172_ = i_1169_ & 0x7f;
			    i_1170_ = i_1170_ + i_1093_ & 0x3f;
			    i_1171_ += i_1094_ / 4;
			    if (i_1171_ < 0)
				i_1171_ = 0;
			    else if (i_1171_ > 7)
				i_1171_ = 7;
			    i_1172_ += i_1095_;
			    if (i_1172_ < 0)
				i_1172_ = 0;
			    else if (i_1172_ > 127)
				i_1172_ = 127;
			    aShortArray9054[i_1168_]
				= (short) (i_1170_ << 10 | i_1171_ << 7
					   | i_1172_);
			}
			if (is_1166_.length > 0 && aClass129_9079 != null)
			    aClass129_9079.anInterface15_1519 = null;
		    }
		}
		if (aClass149Array9087 != null) {
		    for (int i_1173_ = 0; i_1173_ < anInt9086; i_1173_++) {
			Class149 class149 = aClass149Array9087[i_1173_];
			Class133 class133 = aClass133Array9070[i_1173_];
			class133.anInt1585
			    = (class133.anInt1585 & ~0xffffff
			       | (Class661.anIntArray8549
				  [(aShortArray9054[class149.anInt1687]
				    & 0xffff)]) & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9089 != null) {
		for (int i_1174_ = 0; i_1174_ < i_1097_; i_1174_++) {
		    int i_1175_ = is[i_1174_];
		    if (i_1175_ < anIntArrayArray9089.length) {
			int[] is_1176_ = anIntArrayArray9089[i_1175_];
			for (int i_1177_ = 0; i_1177_ < is_1176_.length;
			     i_1177_++) {
			    Class133 class133
				= aClass133Array9070[is_1176_[i_1177_]];
			    class133.anInt1584 += i_1093_;
			    class133.anInt1583 += i_1094_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9089 != null) {
		for (int i_1178_ = 0; i_1178_ < i_1097_; i_1178_++) {
		    int i_1179_ = is[i_1178_];
		    if (i_1179_ < anIntArrayArray9089.length) {
			int[] is_1180_ = anIntArrayArray9089[i_1179_];
			for (int i_1181_ = 0; i_1181_ < is_1180_.length;
			     i_1181_++) {
			    Class133 class133
				= aClass133Array9070[is_1180_[i_1181_]];
			    class133.anInt1582
				= class133.anInt1582 * i_1093_ >> 7;
			    class133.anInt1581
				= class133.anInt1581 * i_1094_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9089 != null) {
		for (int i_1182_ = 0; i_1182_ < i_1097_; i_1182_++) {
		    int i_1183_ = is[i_1182_];
		    if (i_1183_ < anIntArrayArray9089.length) {
			int[] is_1184_ = anIntArrayArray9089[i_1183_];
			for (int i_1185_ = 0; i_1185_ < is_1184_.length;
			     i_1185_++) {
			    Class133 class133
				= aClass133Array9070[is_1184_[i_1185_]];
			    class133.anInt1586
				= class133.anInt1586 + i_1093_ & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    void method3099(int i, int[] is, int i_1186_, int i_1187_, int i_1188_,
		    int i_1189_, boolean bool) {
	int i_1190_ = is.length;
	if (i == 0) {
	    i_1186_ <<= 4;
	    i_1187_ <<= 4;
	    i_1188_ <<= 4;
	    int i_1191_ = 0;
	    anInt9095 = 0;
	    anInt9096 = 0;
	    anInt9097 = 0;
	    for (int i_1192_ = 0; i_1192_ < i_1190_; i_1192_++) {
		int i_1193_ = is[i_1192_];
		if (i_1193_ < anIntArrayArray9028.length) {
		    int[] is_1194_ = anIntArrayArray9028[i_1193_];
		    for (int i_1195_ = 0; i_1195_ < is_1194_.length;
			 i_1195_++) {
			int i_1196_ = is_1194_[i_1195_];
			anInt9095 += anIntArray9034[i_1196_];
			anInt9096 += anIntArray9043[i_1196_];
			anInt9097 += anIntArray9041[i_1196_];
			i_1191_++;
		    }
		}
	    }
	    if (i_1191_ > 0) {
		anInt9095 = anInt9095 / i_1191_ + i_1186_;
		anInt9096 = anInt9096 / i_1191_ + i_1187_;
		anInt9097 = anInt9097 / i_1191_ + i_1188_;
	    } else {
		anInt9095 = i_1186_;
		anInt9096 = i_1187_;
		anInt9097 = i_1188_;
	    }
	} else if (i == 1) {
	    i_1186_ <<= 4;
	    i_1187_ <<= 4;
	    i_1188_ <<= 4;
	    for (int i_1197_ = 0; i_1197_ < i_1190_; i_1197_++) {
		int i_1198_ = is[i_1197_];
		if (i_1198_ < anIntArrayArray9028.length) {
		    int[] is_1199_ = anIntArrayArray9028[i_1198_];
		    for (int i_1200_ = 0; i_1200_ < is_1199_.length;
			 i_1200_++) {
			int i_1201_ = is_1199_[i_1200_];
			anIntArray9034[i_1201_] += i_1186_;
			anIntArray9043[i_1201_] += i_1187_;
			anIntArray9041[i_1201_] += i_1188_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_1202_ = 0; i_1202_ < i_1190_; i_1202_++) {
		int i_1203_ = is[i_1202_];
		if (i_1203_ < anIntArrayArray9028.length) {
		    int[] is_1204_ = anIntArrayArray9028[i_1203_];
		    if ((i_1189_ & 0x1) == 0) {
			for (int i_1205_ = 0; i_1205_ < is_1204_.length;
			     i_1205_++) {
			    int i_1206_ = is_1204_[i_1205_];
			    anIntArray9034[i_1206_] -= anInt9095;
			    anIntArray9043[i_1206_] -= anInt9096;
			    anIntArray9041[i_1206_] -= anInt9097;
			    if (i_1188_ != 0) {
				int i_1207_ = Class427.anIntArray4806[i_1188_];
				int i_1208_ = Class427.anIntArray4805[i_1188_];
				int i_1209_
				    = ((anIntArray9043[i_1206_] * i_1207_
					+ anIntArray9034[i_1206_] * i_1208_
					+ 16383)
				       >> 14);
				anIntArray9043[i_1206_]
				    = (anIntArray9043[i_1206_] * i_1208_
				       - anIntArray9034[i_1206_] * i_1207_
				       + 16383) >> 14;
				anIntArray9034[i_1206_] = i_1209_;
			    }
			    if (i_1186_ != 0) {
				int i_1210_ = Class427.anIntArray4806[i_1186_];
				int i_1211_ = Class427.anIntArray4805[i_1186_];
				int i_1212_
				    = ((anIntArray9043[i_1206_] * i_1211_
					- anIntArray9041[i_1206_] * i_1210_
					+ 16383)
				       >> 14);
				anIntArray9041[i_1206_]
				    = (anIntArray9043[i_1206_] * i_1210_
				       + anIntArray9041[i_1206_] * i_1211_
				       + 16383) >> 14;
				anIntArray9043[i_1206_] = i_1212_;
			    }
			    if (i_1187_ != 0) {
				int i_1213_ = Class427.anIntArray4806[i_1187_];
				int i_1214_ = Class427.anIntArray4805[i_1187_];
				int i_1215_
				    = ((anIntArray9041[i_1206_] * i_1213_
					+ anIntArray9034[i_1206_] * i_1214_
					+ 16383)
				       >> 14);
				anIntArray9041[i_1206_]
				    = (anIntArray9041[i_1206_] * i_1214_
				       - anIntArray9034[i_1206_] * i_1213_
				       + 16383) >> 14;
				anIntArray9034[i_1206_] = i_1215_;
			    }
			    anIntArray9034[i_1206_] += anInt9095;
			    anIntArray9043[i_1206_] += anInt9096;
			    anIntArray9041[i_1206_] += anInt9097;
			}
		    } else {
			for (int i_1216_ = 0; i_1216_ < is_1204_.length;
			     i_1216_++) {
			    int i_1217_ = is_1204_[i_1216_];
			    anIntArray9034[i_1217_] -= anInt9095;
			    anIntArray9043[i_1217_] -= anInt9096;
			    anIntArray9041[i_1217_] -= anInt9097;
			    if (i_1186_ != 0) {
				int i_1218_ = Class427.anIntArray4806[i_1186_];
				int i_1219_ = Class427.anIntArray4805[i_1186_];
				int i_1220_
				    = ((anIntArray9043[i_1217_] * i_1219_
					- anIntArray9041[i_1217_] * i_1218_
					+ 16383)
				       >> 14);
				anIntArray9041[i_1217_]
				    = (anIntArray9043[i_1217_] * i_1218_
				       + anIntArray9041[i_1217_] * i_1219_
				       + 16383) >> 14;
				anIntArray9043[i_1217_] = i_1220_;
			    }
			    if (i_1188_ != 0) {
				int i_1221_ = Class427.anIntArray4806[i_1188_];
				int i_1222_ = Class427.anIntArray4805[i_1188_];
				int i_1223_
				    = ((anIntArray9043[i_1217_] * i_1221_
					+ anIntArray9034[i_1217_] * i_1222_
					+ 16383)
				       >> 14);
				anIntArray9043[i_1217_]
				    = (anIntArray9043[i_1217_] * i_1222_
				       - anIntArray9034[i_1217_] * i_1221_
				       + 16383) >> 14;
				anIntArray9034[i_1217_] = i_1223_;
			    }
			    if (i_1187_ != 0) {
				int i_1224_ = Class427.anIntArray4806[i_1187_];
				int i_1225_ = Class427.anIntArray4805[i_1187_];
				int i_1226_
				    = ((anIntArray9041[i_1217_] * i_1224_
					+ anIntArray9034[i_1217_] * i_1225_
					+ 16383)
				       >> 14);
				anIntArray9041[i_1217_]
				    = (anIntArray9041[i_1217_] * i_1225_
				       - anIntArray9034[i_1217_] * i_1224_
				       + 16383) >> 14;
				anIntArray9034[i_1217_] = i_1226_;
			    }
			    anIntArray9034[i_1217_] += anInt9095;
			    anIntArray9043[i_1217_] += anInt9096;
			    anIntArray9041[i_1217_] += anInt9097;
			}
		    }
		}
	    }
	    if (bool) {
		for (int i_1227_ = 0; i_1227_ < i_1190_; i_1227_++) {
		    int i_1228_ = is[i_1227_];
		    if (i_1228_ < anIntArrayArray9028.length) {
			int[] is_1229_ = anIntArrayArray9028[i_1228_];
			for (int i_1230_ = 0; i_1230_ < is_1229_.length;
			     i_1230_++) {
			    int i_1231_ = is_1229_[i_1230_];
			    int i_1232_ = anIntArray9082[i_1231_];
			    int i_1233_ = anIntArray9082[i_1231_ + 1];
			    for (int i_1234_ = i_1232_;
				 (i_1234_ < i_1233_
				  && aShortArray9083[i_1234_] != 0);
				 i_1234_++) {
				int i_1235_
				    = (aShortArray9083[i_1234_] & 0xffff) - 1;
				if (i_1188_ != 0) {
				    int i_1236_
					= Class427.anIntArray4806[i_1188_];
				    int i_1237_
					= Class427.anIntArray4805[i_1188_];
				    int i_1238_
					= (aShortArray9042[i_1235_] * i_1236_
					   + aShortArray9045[i_1235_] * i_1237_
					   + 16383) >> 14;
				    aShortArray9042[i_1235_]
					= (short) (((aShortArray9042[i_1235_]
						     * i_1237_)
						    - (aShortArray9045[i_1235_]
						       * i_1236_)
						    + 16383)
						   >> 14);
				    aShortArray9045[i_1235_] = (short) i_1238_;
				}
				if (i_1186_ != 0) {
				    int i_1239_
					= Class427.anIntArray4806[i_1186_];
				    int i_1240_
					= Class427.anIntArray4805[i_1186_];
				    int i_1241_
					= (aShortArray9042[i_1235_] * i_1240_
					   - aShortArray9047[i_1235_] * i_1239_
					   + 16383) >> 14;
				    aShortArray9047[i_1235_]
					= (short) (((aShortArray9042[i_1235_]
						     * i_1239_)
						    + (aShortArray9047[i_1235_]
						       * i_1240_)
						    + 16383)
						   >> 14);
				    aShortArray9042[i_1235_] = (short) i_1241_;
				}
				if (i_1187_ != 0) {
				    int i_1242_
					= Class427.anIntArray4806[i_1187_];
				    int i_1243_
					= Class427.anIntArray4805[i_1187_];
				    int i_1244_
					= (aShortArray9047[i_1235_] * i_1242_
					   + aShortArray9045[i_1235_] * i_1243_
					   + 16383) >> 14;
				    aShortArray9047[i_1235_]
					= (short) (((aShortArray9047[i_1235_]
						     * i_1243_)
						    - (aShortArray9045[i_1235_]
						       * i_1242_)
						    + 16383)
						   >> 14);
				    aShortArray9045[i_1235_] = (short) i_1244_;
				}
			    }
			}
		    }
		}
		if (aClass129_9064 == null && aClass129_9079 != null)
		    aClass129_9079.anInterface15_1519 = null;
		if (aClass129_9064 != null)
		    aClass129_9064.anInterface15_1519 = null;
	    }
	} else if (i == 3) {
	    for (int i_1245_ = 0; i_1245_ < i_1190_; i_1245_++) {
		int i_1246_ = is[i_1245_];
		if (i_1246_ < anIntArrayArray9028.length) {
		    int[] is_1247_ = anIntArrayArray9028[i_1246_];
		    for (int i_1248_ = 0; i_1248_ < is_1247_.length;
			 i_1248_++) {
			int i_1249_ = is_1247_[i_1248_];
			anIntArray9034[i_1249_] -= anInt9095;
			anIntArray9043[i_1249_] -= anInt9096;
			anIntArray9041[i_1249_] -= anInt9097;
			anIntArray9034[i_1249_]
			    = anIntArray9034[i_1249_] * i_1186_ >> 7;
			anIntArray9043[i_1249_]
			    = anIntArray9043[i_1249_] * i_1187_ >> 7;
			anIntArray9041[i_1249_]
			    = anIntArray9041[i_1249_] * i_1188_ >> 7;
			anIntArray9034[i_1249_] += anInt9095;
			anIntArray9043[i_1249_] += anInt9096;
			anIntArray9041[i_1249_] += anInt9097;
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9073 != null) {
		for (int i_1250_ = 0; i_1250_ < i_1190_; i_1250_++) {
		    int i_1251_ = is[i_1250_];
		    if (i_1251_ < anIntArrayArray9073.length) {
			int[] is_1252_ = anIntArrayArray9073[i_1251_];
			for (int i_1253_ = 0; i_1253_ < is_1252_.length;
			     i_1253_++) {
			    int i_1254_ = is_1252_[i_1253_];
			    int i_1255_ = ((aByteArray9055[i_1254_] & 0xff)
					   + i_1186_ * 8);
			    if (i_1255_ < 0)
				i_1255_ = 0;
			    else if (i_1255_ > 255)
				i_1255_ = 255;
			    aByteArray9055[i_1254_] = (byte) i_1255_;
			}
			if (is_1252_.length > 0 && aClass129_9079 != null)
			    aClass129_9079.anInterface15_1519 = null;
		    }
		}
		if (aClass149Array9087 != null) {
		    for (int i_1256_ = 0; i_1256_ < anInt9086; i_1256_++) {
			Class149 class149 = aClass149Array9087[i_1256_];
			Class133 class133 = aClass133Array9070[i_1256_];
			class133.anInt1585
			    = (class133.anInt1585 & 0xffffff
			       | 255 - (aByteArray9055[class149.anInt1687]
					& 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9073 != null) {
		for (int i_1257_ = 0; i_1257_ < i_1190_; i_1257_++) {
		    int i_1258_ = is[i_1257_];
		    if (i_1258_ < anIntArrayArray9073.length) {
			int[] is_1259_ = anIntArrayArray9073[i_1258_];
			for (int i_1260_ = 0; i_1260_ < is_1259_.length;
			     i_1260_++) {
			    int i_1261_ = is_1259_[i_1260_];
			    int i_1262_ = aShortArray9054[i_1261_] & 0xffff;
			    int i_1263_ = i_1262_ >> 10 & 0x3f;
			    int i_1264_ = i_1262_ >> 7 & 0x7;
			    int i_1265_ = i_1262_ & 0x7f;
			    i_1263_ = i_1263_ + i_1186_ & 0x3f;
			    i_1264_ += i_1187_ / 4;
			    if (i_1264_ < 0)
				i_1264_ = 0;
			    else if (i_1264_ > 7)
				i_1264_ = 7;
			    i_1265_ += i_1188_;
			    if (i_1265_ < 0)
				i_1265_ = 0;
			    else if (i_1265_ > 127)
				i_1265_ = 127;
			    aShortArray9054[i_1261_]
				= (short) (i_1263_ << 10 | i_1264_ << 7
					   | i_1265_);
			}
			if (is_1259_.length > 0 && aClass129_9079 != null)
			    aClass129_9079.anInterface15_1519 = null;
		    }
		}
		if (aClass149Array9087 != null) {
		    for (int i_1266_ = 0; i_1266_ < anInt9086; i_1266_++) {
			Class149 class149 = aClass149Array9087[i_1266_];
			Class133 class133 = aClass133Array9070[i_1266_];
			class133.anInt1585
			    = (class133.anInt1585 & ~0xffffff
			       | (Class661.anIntArray8549
				  [(aShortArray9054[class149.anInt1687]
				    & 0xffff)]) & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9089 != null) {
		for (int i_1267_ = 0; i_1267_ < i_1190_; i_1267_++) {
		    int i_1268_ = is[i_1267_];
		    if (i_1268_ < anIntArrayArray9089.length) {
			int[] is_1269_ = anIntArrayArray9089[i_1268_];
			for (int i_1270_ = 0; i_1270_ < is_1269_.length;
			     i_1270_++) {
			    Class133 class133
				= aClass133Array9070[is_1269_[i_1270_]];
			    class133.anInt1584 += i_1186_;
			    class133.anInt1583 += i_1187_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9089 != null) {
		for (int i_1271_ = 0; i_1271_ < i_1190_; i_1271_++) {
		    int i_1272_ = is[i_1271_];
		    if (i_1272_ < anIntArrayArray9089.length) {
			int[] is_1273_ = anIntArrayArray9089[i_1272_];
			for (int i_1274_ = 0; i_1274_ < is_1273_.length;
			     i_1274_++) {
			    Class133 class133
				= aClass133Array9070[is_1273_[i_1274_]];
			    class133.anInt1582
				= class133.anInt1582 * i_1186_ >> 7;
			    class133.anInt1581
				= class133.anInt1581 * i_1187_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9089 != null) {
		for (int i_1275_ = 0; i_1275_ < i_1190_; i_1275_++) {
		    int i_1276_ = is[i_1275_];
		    if (i_1276_ < anIntArrayArray9089.length) {
			int[] is_1277_ = anIntArrayArray9089[i_1276_];
			for (int i_1278_ = 0; i_1278_ < is_1277_.length;
			     i_1278_++) {
			    Class133 class133
				= aClass133Array9070[is_1277_[i_1278_]];
			    class133.anInt1586
				= class133.anInt1586 + i_1186_ & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    void method3100(int i, int[] is, int i_1279_, int i_1280_, int i_1281_,
		    int i_1282_, boolean bool) {
	int i_1283_ = is.length;
	if (i == 0) {
	    i_1279_ <<= 4;
	    i_1280_ <<= 4;
	    i_1281_ <<= 4;
	    int i_1284_ = 0;
	    anInt9095 = 0;
	    anInt9096 = 0;
	    anInt9097 = 0;
	    for (int i_1285_ = 0; i_1285_ < i_1283_; i_1285_++) {
		int i_1286_ = is[i_1285_];
		if (i_1286_ < anIntArrayArray9028.length) {
		    int[] is_1287_ = anIntArrayArray9028[i_1286_];
		    for (int i_1288_ = 0; i_1288_ < is_1287_.length;
			 i_1288_++) {
			int i_1289_ = is_1287_[i_1288_];
			anInt9095 += anIntArray9034[i_1289_];
			anInt9096 += anIntArray9043[i_1289_];
			anInt9097 += anIntArray9041[i_1289_];
			i_1284_++;
		    }
		}
	    }
	    if (i_1284_ > 0) {
		anInt9095 = anInt9095 / i_1284_ + i_1279_;
		anInt9096 = anInt9096 / i_1284_ + i_1280_;
		anInt9097 = anInt9097 / i_1284_ + i_1281_;
	    } else {
		anInt9095 = i_1279_;
		anInt9096 = i_1280_;
		anInt9097 = i_1281_;
	    }
	} else if (i == 1) {
	    i_1279_ <<= 4;
	    i_1280_ <<= 4;
	    i_1281_ <<= 4;
	    for (int i_1290_ = 0; i_1290_ < i_1283_; i_1290_++) {
		int i_1291_ = is[i_1290_];
		if (i_1291_ < anIntArrayArray9028.length) {
		    int[] is_1292_ = anIntArrayArray9028[i_1291_];
		    for (int i_1293_ = 0; i_1293_ < is_1292_.length;
			 i_1293_++) {
			int i_1294_ = is_1292_[i_1293_];
			anIntArray9034[i_1294_] += i_1279_;
			anIntArray9043[i_1294_] += i_1280_;
			anIntArray9041[i_1294_] += i_1281_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_1295_ = 0; i_1295_ < i_1283_; i_1295_++) {
		int i_1296_ = is[i_1295_];
		if (i_1296_ < anIntArrayArray9028.length) {
		    int[] is_1297_ = anIntArrayArray9028[i_1296_];
		    if ((i_1282_ & 0x1) == 0) {
			for (int i_1298_ = 0; i_1298_ < is_1297_.length;
			     i_1298_++) {
			    int i_1299_ = is_1297_[i_1298_];
			    anIntArray9034[i_1299_] -= anInt9095;
			    anIntArray9043[i_1299_] -= anInt9096;
			    anIntArray9041[i_1299_] -= anInt9097;
			    if (i_1281_ != 0) {
				int i_1300_ = Class427.anIntArray4806[i_1281_];
				int i_1301_ = Class427.anIntArray4805[i_1281_];
				int i_1302_
				    = ((anIntArray9043[i_1299_] * i_1300_
					+ anIntArray9034[i_1299_] * i_1301_
					+ 16383)
				       >> 14);
				anIntArray9043[i_1299_]
				    = (anIntArray9043[i_1299_] * i_1301_
				       - anIntArray9034[i_1299_] * i_1300_
				       + 16383) >> 14;
				anIntArray9034[i_1299_] = i_1302_;
			    }
			    if (i_1279_ != 0) {
				int i_1303_ = Class427.anIntArray4806[i_1279_];
				int i_1304_ = Class427.anIntArray4805[i_1279_];
				int i_1305_
				    = ((anIntArray9043[i_1299_] * i_1304_
					- anIntArray9041[i_1299_] * i_1303_
					+ 16383)
				       >> 14);
				anIntArray9041[i_1299_]
				    = (anIntArray9043[i_1299_] * i_1303_
				       + anIntArray9041[i_1299_] * i_1304_
				       + 16383) >> 14;
				anIntArray9043[i_1299_] = i_1305_;
			    }
			    if (i_1280_ != 0) {
				int i_1306_ = Class427.anIntArray4806[i_1280_];
				int i_1307_ = Class427.anIntArray4805[i_1280_];
				int i_1308_
				    = ((anIntArray9041[i_1299_] * i_1306_
					+ anIntArray9034[i_1299_] * i_1307_
					+ 16383)
				       >> 14);
				anIntArray9041[i_1299_]
				    = (anIntArray9041[i_1299_] * i_1307_
				       - anIntArray9034[i_1299_] * i_1306_
				       + 16383) >> 14;
				anIntArray9034[i_1299_] = i_1308_;
			    }
			    anIntArray9034[i_1299_] += anInt9095;
			    anIntArray9043[i_1299_] += anInt9096;
			    anIntArray9041[i_1299_] += anInt9097;
			}
		    } else {
			for (int i_1309_ = 0; i_1309_ < is_1297_.length;
			     i_1309_++) {
			    int i_1310_ = is_1297_[i_1309_];
			    anIntArray9034[i_1310_] -= anInt9095;
			    anIntArray9043[i_1310_] -= anInt9096;
			    anIntArray9041[i_1310_] -= anInt9097;
			    if (i_1279_ != 0) {
				int i_1311_ = Class427.anIntArray4806[i_1279_];
				int i_1312_ = Class427.anIntArray4805[i_1279_];
				int i_1313_
				    = ((anIntArray9043[i_1310_] * i_1312_
					- anIntArray9041[i_1310_] * i_1311_
					+ 16383)
				       >> 14);
				anIntArray9041[i_1310_]
				    = (anIntArray9043[i_1310_] * i_1311_
				       + anIntArray9041[i_1310_] * i_1312_
				       + 16383) >> 14;
				anIntArray9043[i_1310_] = i_1313_;
			    }
			    if (i_1281_ != 0) {
				int i_1314_ = Class427.anIntArray4806[i_1281_];
				int i_1315_ = Class427.anIntArray4805[i_1281_];
				int i_1316_
				    = ((anIntArray9043[i_1310_] * i_1314_
					+ anIntArray9034[i_1310_] * i_1315_
					+ 16383)
				       >> 14);
				anIntArray9043[i_1310_]
				    = (anIntArray9043[i_1310_] * i_1315_
				       - anIntArray9034[i_1310_] * i_1314_
				       + 16383) >> 14;
				anIntArray9034[i_1310_] = i_1316_;
			    }
			    if (i_1280_ != 0) {
				int i_1317_ = Class427.anIntArray4806[i_1280_];
				int i_1318_ = Class427.anIntArray4805[i_1280_];
				int i_1319_
				    = ((anIntArray9041[i_1310_] * i_1317_
					+ anIntArray9034[i_1310_] * i_1318_
					+ 16383)
				       >> 14);
				anIntArray9041[i_1310_]
				    = (anIntArray9041[i_1310_] * i_1318_
				       - anIntArray9034[i_1310_] * i_1317_
				       + 16383) >> 14;
				anIntArray9034[i_1310_] = i_1319_;
			    }
			    anIntArray9034[i_1310_] += anInt9095;
			    anIntArray9043[i_1310_] += anInt9096;
			    anIntArray9041[i_1310_] += anInt9097;
			}
		    }
		}
	    }
	    if (bool) {
		for (int i_1320_ = 0; i_1320_ < i_1283_; i_1320_++) {
		    int i_1321_ = is[i_1320_];
		    if (i_1321_ < anIntArrayArray9028.length) {
			int[] is_1322_ = anIntArrayArray9028[i_1321_];
			for (int i_1323_ = 0; i_1323_ < is_1322_.length;
			     i_1323_++) {
			    int i_1324_ = is_1322_[i_1323_];
			    int i_1325_ = anIntArray9082[i_1324_];
			    int i_1326_ = anIntArray9082[i_1324_ + 1];
			    for (int i_1327_ = i_1325_;
				 (i_1327_ < i_1326_
				  && aShortArray9083[i_1327_] != 0);
				 i_1327_++) {
				int i_1328_
				    = (aShortArray9083[i_1327_] & 0xffff) - 1;
				if (i_1281_ != 0) {
				    int i_1329_
					= Class427.anIntArray4806[i_1281_];
				    int i_1330_
					= Class427.anIntArray4805[i_1281_];
				    int i_1331_
					= (aShortArray9042[i_1328_] * i_1329_
					   + aShortArray9045[i_1328_] * i_1330_
					   + 16383) >> 14;
				    aShortArray9042[i_1328_]
					= (short) (((aShortArray9042[i_1328_]
						     * i_1330_)
						    - (aShortArray9045[i_1328_]
						       * i_1329_)
						    + 16383)
						   >> 14);
				    aShortArray9045[i_1328_] = (short) i_1331_;
				}
				if (i_1279_ != 0) {
				    int i_1332_
					= Class427.anIntArray4806[i_1279_];
				    int i_1333_
					= Class427.anIntArray4805[i_1279_];
				    int i_1334_
					= (aShortArray9042[i_1328_] * i_1333_
					   - aShortArray9047[i_1328_] * i_1332_
					   + 16383) >> 14;
				    aShortArray9047[i_1328_]
					= (short) (((aShortArray9042[i_1328_]
						     * i_1332_)
						    + (aShortArray9047[i_1328_]
						       * i_1333_)
						    + 16383)
						   >> 14);
				    aShortArray9042[i_1328_] = (short) i_1334_;
				}
				if (i_1280_ != 0) {
				    int i_1335_
					= Class427.anIntArray4806[i_1280_];
				    int i_1336_
					= Class427.anIntArray4805[i_1280_];
				    int i_1337_
					= (aShortArray9047[i_1328_] * i_1335_
					   + aShortArray9045[i_1328_] * i_1336_
					   + 16383) >> 14;
				    aShortArray9047[i_1328_]
					= (short) (((aShortArray9047[i_1328_]
						     * i_1336_)
						    - (aShortArray9045[i_1328_]
						       * i_1335_)
						    + 16383)
						   >> 14);
				    aShortArray9045[i_1328_] = (short) i_1337_;
				}
			    }
			}
		    }
		}
		if (aClass129_9064 == null && aClass129_9079 != null)
		    aClass129_9079.anInterface15_1519 = null;
		if (aClass129_9064 != null)
		    aClass129_9064.anInterface15_1519 = null;
	    }
	} else if (i == 3) {
	    for (int i_1338_ = 0; i_1338_ < i_1283_; i_1338_++) {
		int i_1339_ = is[i_1338_];
		if (i_1339_ < anIntArrayArray9028.length) {
		    int[] is_1340_ = anIntArrayArray9028[i_1339_];
		    for (int i_1341_ = 0; i_1341_ < is_1340_.length;
			 i_1341_++) {
			int i_1342_ = is_1340_[i_1341_];
			anIntArray9034[i_1342_] -= anInt9095;
			anIntArray9043[i_1342_] -= anInt9096;
			anIntArray9041[i_1342_] -= anInt9097;
			anIntArray9034[i_1342_]
			    = anIntArray9034[i_1342_] * i_1279_ >> 7;
			anIntArray9043[i_1342_]
			    = anIntArray9043[i_1342_] * i_1280_ >> 7;
			anIntArray9041[i_1342_]
			    = anIntArray9041[i_1342_] * i_1281_ >> 7;
			anIntArray9034[i_1342_] += anInt9095;
			anIntArray9043[i_1342_] += anInt9096;
			anIntArray9041[i_1342_] += anInt9097;
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9073 != null) {
		for (int i_1343_ = 0; i_1343_ < i_1283_; i_1343_++) {
		    int i_1344_ = is[i_1343_];
		    if (i_1344_ < anIntArrayArray9073.length) {
			int[] is_1345_ = anIntArrayArray9073[i_1344_];
			for (int i_1346_ = 0; i_1346_ < is_1345_.length;
			     i_1346_++) {
			    int i_1347_ = is_1345_[i_1346_];
			    int i_1348_ = ((aByteArray9055[i_1347_] & 0xff)
					   + i_1279_ * 8);
			    if (i_1348_ < 0)
				i_1348_ = 0;
			    else if (i_1348_ > 255)
				i_1348_ = 255;
			    aByteArray9055[i_1347_] = (byte) i_1348_;
			}
			if (is_1345_.length > 0 && aClass129_9079 != null)
			    aClass129_9079.anInterface15_1519 = null;
		    }
		}
		if (aClass149Array9087 != null) {
		    for (int i_1349_ = 0; i_1349_ < anInt9086; i_1349_++) {
			Class149 class149 = aClass149Array9087[i_1349_];
			Class133 class133 = aClass133Array9070[i_1349_];
			class133.anInt1585
			    = (class133.anInt1585 & 0xffffff
			       | 255 - (aByteArray9055[class149.anInt1687]
					& 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9073 != null) {
		for (int i_1350_ = 0; i_1350_ < i_1283_; i_1350_++) {
		    int i_1351_ = is[i_1350_];
		    if (i_1351_ < anIntArrayArray9073.length) {
			int[] is_1352_ = anIntArrayArray9073[i_1351_];
			for (int i_1353_ = 0; i_1353_ < is_1352_.length;
			     i_1353_++) {
			    int i_1354_ = is_1352_[i_1353_];
			    int i_1355_ = aShortArray9054[i_1354_] & 0xffff;
			    int i_1356_ = i_1355_ >> 10 & 0x3f;
			    int i_1357_ = i_1355_ >> 7 & 0x7;
			    int i_1358_ = i_1355_ & 0x7f;
			    i_1356_ = i_1356_ + i_1279_ & 0x3f;
			    i_1357_ += i_1280_ / 4;
			    if (i_1357_ < 0)
				i_1357_ = 0;
			    else if (i_1357_ > 7)
				i_1357_ = 7;
			    i_1358_ += i_1281_;
			    if (i_1358_ < 0)
				i_1358_ = 0;
			    else if (i_1358_ > 127)
				i_1358_ = 127;
			    aShortArray9054[i_1354_]
				= (short) (i_1356_ << 10 | i_1357_ << 7
					   | i_1358_);
			}
			if (is_1352_.length > 0 && aClass129_9079 != null)
			    aClass129_9079.anInterface15_1519 = null;
		    }
		}
		if (aClass149Array9087 != null) {
		    for (int i_1359_ = 0; i_1359_ < anInt9086; i_1359_++) {
			Class149 class149 = aClass149Array9087[i_1359_];
			Class133 class133 = aClass133Array9070[i_1359_];
			class133.anInt1585
			    = (class133.anInt1585 & ~0xffffff
			       | (Class661.anIntArray8549
				  [(aShortArray9054[class149.anInt1687]
				    & 0xffff)]) & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9089 != null) {
		for (int i_1360_ = 0; i_1360_ < i_1283_; i_1360_++) {
		    int i_1361_ = is[i_1360_];
		    if (i_1361_ < anIntArrayArray9089.length) {
			int[] is_1362_ = anIntArrayArray9089[i_1361_];
			for (int i_1363_ = 0; i_1363_ < is_1362_.length;
			     i_1363_++) {
			    Class133 class133
				= aClass133Array9070[is_1362_[i_1363_]];
			    class133.anInt1584 += i_1279_;
			    class133.anInt1583 += i_1280_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9089 != null) {
		for (int i_1364_ = 0; i_1364_ < i_1283_; i_1364_++) {
		    int i_1365_ = is[i_1364_];
		    if (i_1365_ < anIntArrayArray9089.length) {
			int[] is_1366_ = anIntArrayArray9089[i_1365_];
			for (int i_1367_ = 0; i_1367_ < is_1366_.length;
			     i_1367_++) {
			    Class133 class133
				= aClass133Array9070[is_1366_[i_1367_]];
			    class133.anInt1582
				= class133.anInt1582 * i_1279_ >> 7;
			    class133.anInt1581
				= class133.anInt1581 * i_1280_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9089 != null) {
		for (int i_1368_ = 0; i_1368_ < i_1283_; i_1368_++) {
		    int i_1369_ = is[i_1368_];
		    if (i_1369_ < anIntArrayArray9089.length) {
			int[] is_1370_ = anIntArrayArray9089[i_1369_];
			for (int i_1371_ = 0; i_1371_ < is_1370_.length;
			     i_1371_++) {
			    Class133 class133
				= aClass133Array9070[is_1370_[i_1371_]];
			    class133.anInt1586
				= class133.anInt1586 + i_1279_ & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    void method3121(int i, int[] is, int i_1372_, int i_1373_, int i_1374_,
		    boolean bool, int i_1375_, int[] is_1376_) {
	int i_1377_ = is.length;
	if (i == 0) {
	    i_1372_ <<= 4;
	    i_1373_ <<= 4;
	    i_1374_ <<= 4;
	    int i_1378_ = 0;
	    anInt9095 = 0;
	    anInt9096 = 0;
	    anInt9097 = 0;
	    for (int i_1379_ = 0; i_1379_ < i_1377_; i_1379_++) {
		int i_1380_ = is[i_1379_];
		if (i_1380_ < anIntArrayArray9028.length) {
		    int[] is_1381_ = anIntArrayArray9028[i_1380_];
		    for (int i_1382_ = 0; i_1382_ < is_1381_.length;
			 i_1382_++) {
			int i_1383_ = is_1381_[i_1382_];
			if (aShortArray9048 == null
			    || (i_1375_ & aShortArray9048[i_1383_]) != 0) {
			    anInt9095 += anIntArray9034[i_1383_];
			    anInt9096 += anIntArray9043[i_1383_];
			    anInt9097 += anIntArray9041[i_1383_];
			    i_1378_++;
			}
		    }
		}
	    }
	    if (i_1378_ > 0) {
		anInt9095 = anInt9095 / i_1378_ + i_1372_;
		anInt9096 = anInt9096 / i_1378_ + i_1373_;
		anInt9097 = anInt9097 / i_1378_ + i_1374_;
		aBool9098 = true;
	    } else {
		anInt9095 = i_1372_;
		anInt9096 = i_1373_;
		anInt9097 = i_1374_;
	    }
	} else if (i == 1) {
	    if (is_1376_ != null) {
		int i_1384_ = ((is_1376_[0] * i_1372_ + is_1376_[1] * i_1373_
				+ is_1376_[2] * i_1374_ + 8192)
			       >> 14);
		int i_1385_ = ((is_1376_[3] * i_1372_ + is_1376_[4] * i_1373_
				+ is_1376_[5] * i_1374_ + 8192)
			       >> 14);
		int i_1386_ = ((is_1376_[6] * i_1372_ + is_1376_[7] * i_1373_
				+ is_1376_[8] * i_1374_ + 8192)
			       >> 14);
		i_1372_ = i_1384_;
		i_1373_ = i_1385_;
		i_1374_ = i_1386_;
	    }
	    i_1372_ <<= 4;
	    i_1373_ <<= 4;
	    i_1374_ <<= 4;
	    for (int i_1387_ = 0; i_1387_ < i_1377_; i_1387_++) {
		int i_1388_ = is[i_1387_];
		if (i_1388_ < anIntArrayArray9028.length) {
		    int[] is_1389_ = anIntArrayArray9028[i_1388_];
		    for (int i_1390_ = 0; i_1390_ < is_1389_.length;
			 i_1390_++) {
			int i_1391_ = is_1389_[i_1390_];
			if (aShortArray9048 == null
			    || (i_1375_ & aShortArray9048[i_1391_]) != 0) {
			    anIntArray9034[i_1391_] += i_1372_;
			    anIntArray9043[i_1391_] += i_1373_;
			    anIntArray9041[i_1391_] += i_1374_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_1376_ != null) {
		int i_1392_ = is_1376_[9] << 4;
		int i_1393_ = is_1376_[10] << 4;
		int i_1394_ = is_1376_[11] << 4;
		int i_1395_ = is_1376_[12] << 4;
		int i_1396_ = is_1376_[13] << 4;
		int i_1397_ = is_1376_[14] << 4;
		if (aBool9098) {
		    int i_1398_
			= ((is_1376_[0] * anInt9095 + is_1376_[3] * anInt9096
			    + is_1376_[6] * anInt9097 + 8192)
			   >> 14);
		    int i_1399_
			= ((is_1376_[1] * anInt9095 + is_1376_[4] * anInt9096
			    + is_1376_[7] * anInt9097 + 8192)
			   >> 14);
		    int i_1400_
			= ((is_1376_[2] * anInt9095 + is_1376_[5] * anInt9096
			    + is_1376_[8] * anInt9097 + 8192)
			   >> 14);
		    i_1398_ += i_1395_;
		    i_1399_ += i_1396_;
		    i_1400_ += i_1397_;
		    anInt9095 = i_1398_;
		    anInt9096 = i_1399_;
		    anInt9097 = i_1400_;
		    aBool9098 = false;
		}
		int[] is_1401_ = new int[9];
		int i_1402_ = Class427.anIntArray4805[i_1372_];
		int i_1403_ = Class427.anIntArray4806[i_1372_];
		int i_1404_ = Class427.anIntArray4805[i_1373_];
		int i_1405_ = Class427.anIntArray4806[i_1373_];
		int i_1406_ = Class427.anIntArray4805[i_1374_];
		int i_1407_ = Class427.anIntArray4806[i_1374_];
		int i_1408_ = i_1403_ * i_1406_ + 8192 >> 14;
		int i_1409_ = i_1403_ * i_1407_ + 8192 >> 14;
		is_1401_[0]
		    = i_1404_ * i_1406_ + i_1405_ * i_1409_ + 8192 >> 14;
		is_1401_[1]
		    = -i_1404_ * i_1407_ + i_1405_ * i_1408_ + 8192 >> 14;
		is_1401_[2] = i_1405_ * i_1402_ + 8192 >> 14;
		is_1401_[3] = i_1402_ * i_1407_ + 8192 >> 14;
		is_1401_[4] = i_1402_ * i_1406_ + 8192 >> 14;
		is_1401_[5] = -i_1403_;
		is_1401_[6]
		    = -i_1405_ * i_1406_ + i_1404_ * i_1409_ + 8192 >> 14;
		is_1401_[7]
		    = i_1405_ * i_1407_ + i_1404_ * i_1408_ + 8192 >> 14;
		is_1401_[8] = i_1404_ * i_1402_ + 8192 >> 14;
		int i_1410_
		    = ((is_1401_[0] * -anInt9095 + is_1401_[1] * -anInt9096
			+ is_1401_[2] * -anInt9097 + 8192)
		       >> 14);
		int i_1411_
		    = ((is_1401_[3] * -anInt9095 + is_1401_[4] * -anInt9096
			+ is_1401_[5] * -anInt9097 + 8192)
		       >> 14);
		int i_1412_
		    = ((is_1401_[6] * -anInt9095 + is_1401_[7] * -anInt9096
			+ is_1401_[8] * -anInt9097 + 8192)
		       >> 14);
		int i_1413_ = i_1410_ + anInt9095;
		int i_1414_ = i_1411_ + anInt9096;
		int i_1415_ = i_1412_ + anInt9097;
		int[] is_1416_ = new int[9];
		for (int i_1417_ = 0; i_1417_ < 3; i_1417_++) {
		    for (int i_1418_ = 0; i_1418_ < 3; i_1418_++) {
			int i_1419_ = 0;
			for (int i_1420_ = 0; i_1420_ < 3; i_1420_++)
			    i_1419_ += (is_1401_[i_1417_ * 3 + i_1420_]
					* is_1376_[i_1418_ * 3 + i_1420_]);
			is_1416_[i_1417_ * 3 + i_1418_] = i_1419_ + 8192 >> 14;
		    }
		}
		int i_1421_ = ((is_1401_[0] * i_1395_ + is_1401_[1] * i_1396_
				+ is_1401_[2] * i_1397_ + 8192)
			       >> 14);
		int i_1422_ = ((is_1401_[3] * i_1395_ + is_1401_[4] * i_1396_
				+ is_1401_[5] * i_1397_ + 8192)
			       >> 14);
		int i_1423_ = ((is_1401_[6] * i_1395_ + is_1401_[7] * i_1396_
				+ is_1401_[8] * i_1397_ + 8192)
			       >> 14);
		i_1421_ += i_1413_;
		i_1422_ += i_1414_;
		i_1423_ += i_1415_;
		int[] is_1424_ = new int[9];
		for (int i_1425_ = 0; i_1425_ < 3; i_1425_++) {
		    for (int i_1426_ = 0; i_1426_ < 3; i_1426_++) {
			int i_1427_ = 0;
			for (int i_1428_ = 0; i_1428_ < 3; i_1428_++)
			    i_1427_ += (is_1376_[i_1425_ * 3 + i_1428_]
					* is_1416_[i_1426_ + i_1428_ * 3]);
			is_1424_[i_1425_ * 3 + i_1426_] = i_1427_ + 8192 >> 14;
		    }
		}
		int i_1429_ = ((is_1376_[0] * i_1421_ + is_1376_[1] * i_1422_
				+ is_1376_[2] * i_1423_ + 8192)
			       >> 14);
		int i_1430_ = ((is_1376_[3] * i_1421_ + is_1376_[4] * i_1422_
				+ is_1376_[5] * i_1423_ + 8192)
			       >> 14);
		int i_1431_ = ((is_1376_[6] * i_1421_ + is_1376_[7] * i_1422_
				+ is_1376_[8] * i_1423_ + 8192)
			       >> 14);
		i_1429_ += i_1392_;
		i_1430_ += i_1393_;
		i_1431_ += i_1394_;
		for (int i_1432_ = 0; i_1432_ < i_1377_; i_1432_++) {
		    int i_1433_ = is[i_1432_];
		    if (i_1433_ < anIntArrayArray9028.length) {
			int[] is_1434_ = anIntArrayArray9028[i_1433_];
			for (int i_1435_ = 0; i_1435_ < is_1434_.length;
			     i_1435_++) {
			    int i_1436_ = is_1434_[i_1435_];
			    if (aShortArray9048 == null
				|| (i_1375_ & aShortArray9048[i_1436_]) != 0) {
				int i_1437_
				    = ((is_1424_[0] * anIntArray9034[i_1436_]
					+ is_1424_[1] * anIntArray9043[i_1436_]
					+ is_1424_[2] * anIntArray9041[i_1436_]
					+ 8192)
				       >> 14);
				int i_1438_
				    = ((is_1424_[3] * anIntArray9034[i_1436_]
					+ is_1424_[4] * anIntArray9043[i_1436_]
					+ is_1424_[5] * anIntArray9041[i_1436_]
					+ 8192)
				       >> 14);
				int i_1439_
				    = ((is_1424_[6] * anIntArray9034[i_1436_]
					+ is_1424_[7] * anIntArray9043[i_1436_]
					+ is_1424_[8] * anIntArray9041[i_1436_]
					+ 8192)
				       >> 14);
				i_1437_ += i_1429_;
				i_1438_ += i_1430_;
				i_1439_ += i_1431_;
				anIntArray9034[i_1436_] = i_1437_;
				anIntArray9043[i_1436_] = i_1438_;
				anIntArray9041[i_1436_] = i_1439_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1440_ = 0; i_1440_ < i_1377_; i_1440_++) {
		    int i_1441_ = is[i_1440_];
		    if (i_1441_ < anIntArrayArray9028.length) {
			int[] is_1442_ = anIntArrayArray9028[i_1441_];
			for (int i_1443_ = 0; i_1443_ < is_1442_.length;
			     i_1443_++) {
			    int i_1444_ = is_1442_[i_1443_];
			    if (aShortArray9048 == null
				|| (i_1375_ & aShortArray9048[i_1444_]) != 0) {
				anIntArray9034[i_1444_] -= anInt9095;
				anIntArray9043[i_1444_] -= anInt9096;
				anIntArray9041[i_1444_] -= anInt9097;
				if (i_1374_ != 0) {
				    int i_1445_
					= Class427.anIntArray4806[i_1374_];
				    int i_1446_
					= Class427.anIntArray4805[i_1374_];
				    int i_1447_
					= ((anIntArray9043[i_1444_] * i_1445_
					    + anIntArray9034[i_1444_] * i_1446_
					    + 16383)
					   >> 14);
				    anIntArray9043[i_1444_]
					= (anIntArray9043[i_1444_] * i_1446_
					   - anIntArray9034[i_1444_] * i_1445_
					   + 16383) >> 14;
				    anIntArray9034[i_1444_] = i_1447_;
				}
				if (i_1372_ != 0) {
				    int i_1448_
					= Class427.anIntArray4806[i_1372_];
				    int i_1449_
					= Class427.anIntArray4805[i_1372_];
				    int i_1450_
					= ((anIntArray9043[i_1444_] * i_1449_
					    - anIntArray9041[i_1444_] * i_1448_
					    + 16383)
					   >> 14);
				    anIntArray9041[i_1444_]
					= (anIntArray9043[i_1444_] * i_1448_
					   + anIntArray9041[i_1444_] * i_1449_
					   + 16383) >> 14;
				    anIntArray9043[i_1444_] = i_1450_;
				}
				if (i_1373_ != 0) {
				    int i_1451_
					= Class427.anIntArray4806[i_1373_];
				    int i_1452_
					= Class427.anIntArray4805[i_1373_];
				    int i_1453_
					= ((anIntArray9041[i_1444_] * i_1451_
					    + anIntArray9034[i_1444_] * i_1452_
					    + 16383)
					   >> 14);
				    anIntArray9041[i_1444_]
					= (anIntArray9041[i_1444_] * i_1452_
					   - anIntArray9034[i_1444_] * i_1451_
					   + 16383) >> 14;
				    anIntArray9034[i_1444_] = i_1453_;
				}
				anIntArray9034[i_1444_] += anInt9095;
				anIntArray9043[i_1444_] += anInt9096;
				anIntArray9041[i_1444_] += anInt9097;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_1454_ = 0; i_1454_ < i_1377_; i_1454_++) {
			int i_1455_ = is[i_1454_];
			if (i_1455_ < anIntArrayArray9028.length) {
			    int[] is_1456_ = anIntArrayArray9028[i_1455_];
			    for (int i_1457_ = 0; i_1457_ < is_1456_.length;
				 i_1457_++) {
				int i_1458_ = is_1456_[i_1457_];
				if (aShortArray9048 == null
				    || ((i_1375_ & aShortArray9048[i_1458_])
					!= 0)) {
				    int i_1459_ = anIntArray9082[i_1458_];
				    int i_1460_ = anIntArray9082[i_1458_ + 1];
				    for (int i_1461_ = i_1459_;
					 (i_1461_ < i_1460_
					  && aShortArray9083[i_1461_] != 0);
					 i_1461_++) {
					int i_1462_ = (aShortArray9083[i_1461_]
						       & 0xffff) - 1;
					if (i_1374_ != 0) {
					    int i_1463_
						= (Class427.anIntArray4806
						   [i_1374_]);
					    int i_1464_
						= (Class427.anIntArray4805
						   [i_1374_]);
					    int i_1465_
						= (((aShortArray9042[i_1462_]
						     * i_1463_)
						    + (aShortArray9045[i_1462_]
						       * i_1464_)
						    + 16383)
						   >> 14);
					    aShortArray9042[i_1462_]
						= (short) ((((aShortArray9042
							      [i_1462_])
							     * i_1464_)
							    - ((aShortArray9045
								[i_1462_])
							       * i_1463_)
							    + 16383)
							   >> 14);
					    aShortArray9045[i_1462_]
						= (short) i_1465_;
					}
					if (i_1372_ != 0) {
					    int i_1466_
						= (Class427.anIntArray4806
						   [i_1372_]);
					    int i_1467_
						= (Class427.anIntArray4805
						   [i_1372_]);
					    int i_1468_
						= (((aShortArray9042[i_1462_]
						     * i_1467_)
						    - (aShortArray9047[i_1462_]
						       * i_1466_)
						    + 16383)
						   >> 14);
					    aShortArray9047[i_1462_]
						= (short) ((((aShortArray9042
							      [i_1462_])
							     * i_1466_)
							    + ((aShortArray9047
								[i_1462_])
							       * i_1467_)
							    + 16383)
							   >> 14);
					    aShortArray9042[i_1462_]
						= (short) i_1468_;
					}
					if (i_1373_ != 0) {
					    int i_1469_
						= (Class427.anIntArray4806
						   [i_1373_]);
					    int i_1470_
						= (Class427.anIntArray4805
						   [i_1373_]);
					    int i_1471_
						= (((aShortArray9047[i_1462_]
						     * i_1469_)
						    + (aShortArray9045[i_1462_]
						       * i_1470_)
						    + 16383)
						   >> 14);
					    aShortArray9047[i_1462_]
						= (short) ((((aShortArray9047
							      [i_1462_])
							     * i_1470_)
							    - ((aShortArray9045
								[i_1462_])
							       * i_1469_)
							    + 16383)
							   >> 14);
					    aShortArray9045[i_1462_]
						= (short) i_1471_;
					}
				    }
				}
			    }
			}
		    }
		    if (aClass129_9064 == null && aClass129_9079 != null)
			aClass129_9079.anInterface15_1519 = null;
		    if (aClass129_9064 != null)
			aClass129_9064.anInterface15_1519 = null;
		}
	    }
	} else if (i == 3) {
	    if (is_1376_ != null) {
		int i_1472_ = is_1376_[9] << 4;
		int i_1473_ = is_1376_[10] << 4;
		int i_1474_ = is_1376_[11] << 4;
		int i_1475_ = is_1376_[12] << 4;
		int i_1476_ = is_1376_[13] << 4;
		int i_1477_ = is_1376_[14] << 4;
		if (aBool9098) {
		    int i_1478_
			= ((is_1376_[0] * anInt9095 + is_1376_[3] * anInt9096
			    + is_1376_[6] * anInt9097 + 8192)
			   >> 14);
		    int i_1479_
			= ((is_1376_[1] * anInt9095 + is_1376_[4] * anInt9096
			    + is_1376_[7] * anInt9097 + 8192)
			   >> 14);
		    int i_1480_
			= ((is_1376_[2] * anInt9095 + is_1376_[5] * anInt9096
			    + is_1376_[8] * anInt9097 + 8192)
			   >> 14);
		    i_1478_ += i_1475_;
		    i_1479_ += i_1476_;
		    i_1480_ += i_1477_;
		    anInt9095 = i_1478_;
		    anInt9096 = i_1479_;
		    anInt9097 = i_1480_;
		    aBool9098 = false;
		}
		int i_1481_ = i_1372_ << 15 >> 7;
		int i_1482_ = i_1373_ << 15 >> 7;
		int i_1483_ = i_1374_ << 15 >> 7;
		int i_1484_ = i_1481_ * -anInt9095 + 8192 >> 14;
		int i_1485_ = i_1482_ * -anInt9096 + 8192 >> 14;
		int i_1486_ = i_1483_ * -anInt9097 + 8192 >> 14;
		int i_1487_ = i_1484_ + anInt9095;
		int i_1488_ = i_1485_ + anInt9096;
		int i_1489_ = i_1486_ + anInt9097;
		int[] is_1490_ = new int[9];
		is_1490_[0] = i_1481_ * is_1376_[0] + 8192 >> 14;
		is_1490_[1] = i_1481_ * is_1376_[3] + 8192 >> 14;
		is_1490_[2] = i_1481_ * is_1376_[6] + 8192 >> 14;
		is_1490_[3] = i_1482_ * is_1376_[1] + 8192 >> 14;
		is_1490_[4] = i_1482_ * is_1376_[4] + 8192 >> 14;
		is_1490_[5] = i_1482_ * is_1376_[7] + 8192 >> 14;
		is_1490_[6] = i_1483_ * is_1376_[2] + 8192 >> 14;
		is_1490_[7] = i_1483_ * is_1376_[5] + 8192 >> 14;
		is_1490_[8] = i_1483_ * is_1376_[8] + 8192 >> 14;
		int i_1491_ = i_1481_ * i_1475_ + 8192 >> 14;
		int i_1492_ = i_1482_ * i_1476_ + 8192 >> 14;
		int i_1493_ = i_1483_ * i_1477_ + 8192 >> 14;
		i_1491_ += i_1487_;
		i_1492_ += i_1488_;
		i_1493_ += i_1489_;
		int[] is_1494_ = new int[9];
		for (int i_1495_ = 0; i_1495_ < 3; i_1495_++) {
		    for (int i_1496_ = 0; i_1496_ < 3; i_1496_++) {
			int i_1497_ = 0;
			for (int i_1498_ = 0; i_1498_ < 3; i_1498_++)
			    i_1497_ += (is_1376_[i_1495_ * 3 + i_1498_]
					* is_1490_[i_1496_ + i_1498_ * 3]);
			is_1494_[i_1495_ * 3 + i_1496_] = i_1497_ + 8192 >> 14;
		    }
		}
		int i_1499_ = ((is_1376_[0] * i_1491_ + is_1376_[1] * i_1492_
				+ is_1376_[2] * i_1493_ + 8192)
			       >> 14);
		int i_1500_ = ((is_1376_[3] * i_1491_ + is_1376_[4] * i_1492_
				+ is_1376_[5] * i_1493_ + 8192)
			       >> 14);
		int i_1501_ = ((is_1376_[6] * i_1491_ + is_1376_[7] * i_1492_
				+ is_1376_[8] * i_1493_ + 8192)
			       >> 14);
		i_1499_ += i_1472_;
		i_1500_ += i_1473_;
		i_1501_ += i_1474_;
		for (int i_1502_ = 0; i_1502_ < i_1377_; i_1502_++) {
		    int i_1503_ = is[i_1502_];
		    if (i_1503_ < anIntArrayArray9028.length) {
			int[] is_1504_ = anIntArrayArray9028[i_1503_];
			for (int i_1505_ = 0; i_1505_ < is_1504_.length;
			     i_1505_++) {
			    int i_1506_ = is_1504_[i_1505_];
			    if (aShortArray9048 == null
				|| (i_1375_ & aShortArray9048[i_1506_]) != 0) {
				int i_1507_
				    = ((is_1494_[0] * anIntArray9034[i_1506_]
					+ is_1494_[1] * anIntArray9043[i_1506_]
					+ is_1494_[2] * anIntArray9041[i_1506_]
					+ 8192)
				       >> 14);
				int i_1508_
				    = ((is_1494_[3] * anIntArray9034[i_1506_]
					+ is_1494_[4] * anIntArray9043[i_1506_]
					+ is_1494_[5] * anIntArray9041[i_1506_]
					+ 8192)
				       >> 14);
				int i_1509_
				    = ((is_1494_[6] * anIntArray9034[i_1506_]
					+ is_1494_[7] * anIntArray9043[i_1506_]
					+ is_1494_[8] * anIntArray9041[i_1506_]
					+ 8192)
				       >> 14);
				i_1507_ += i_1499_;
				i_1508_ += i_1500_;
				i_1509_ += i_1501_;
				anIntArray9034[i_1506_] = i_1507_;
				anIntArray9043[i_1506_] = i_1508_;
				anIntArray9041[i_1506_] = i_1509_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1510_ = 0; i_1510_ < i_1377_; i_1510_++) {
		    int i_1511_ = is[i_1510_];
		    if (i_1511_ < anIntArrayArray9028.length) {
			int[] is_1512_ = anIntArrayArray9028[i_1511_];
			for (int i_1513_ = 0; i_1513_ < is_1512_.length;
			     i_1513_++) {
			    int i_1514_ = is_1512_[i_1513_];
			    if (aShortArray9048 == null
				|| (i_1375_ & aShortArray9048[i_1514_]) != 0) {
				anIntArray9034[i_1514_] -= anInt9095;
				anIntArray9043[i_1514_] -= anInt9096;
				anIntArray9041[i_1514_] -= anInt9097;
				anIntArray9034[i_1514_]
				    = anIntArray9034[i_1514_] * i_1372_ >> 7;
				anIntArray9043[i_1514_]
				    = anIntArray9043[i_1514_] * i_1373_ >> 7;
				anIntArray9041[i_1514_]
				    = anIntArray9041[i_1514_] * i_1374_ >> 7;
				anIntArray9034[i_1514_] += anInt9095;
				anIntArray9043[i_1514_] += anInt9096;
				anIntArray9041[i_1514_] += anInt9097;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9073 != null) {
		for (int i_1515_ = 0; i_1515_ < i_1377_; i_1515_++) {
		    int i_1516_ = is[i_1515_];
		    if (i_1516_ < anIntArrayArray9073.length) {
			int[] is_1517_ = anIntArrayArray9073[i_1516_];
			for (int i_1518_ = 0; i_1518_ < is_1517_.length;
			     i_1518_++) {
			    int i_1519_ = is_1517_[i_1518_];
			    if (aShortArray9061 == null
				|| (i_1375_ & aShortArray9061[i_1519_]) != 0) {
				int i_1520_ = ((aByteArray9055[i_1519_] & 0xff)
					       + i_1372_ * 8);
				if (i_1520_ < 0)
				    i_1520_ = 0;
				else if (i_1520_ > 255)
				    i_1520_ = 255;
				aByteArray9055[i_1519_] = (byte) i_1520_;
				if (aClass129_9079 != null)
				    aClass129_9079.anInterface15_1519 = null;
			    }
			}
		    }
		}
		if (aClass149Array9087 != null) {
		    for (int i_1521_ = 0; i_1521_ < anInt9086; i_1521_++) {
			Class149 class149 = aClass149Array9087[i_1521_];
			Class133 class133 = aClass133Array9070[i_1521_];
			class133.anInt1585
			    = (class133.anInt1585 & 0xffffff
			       | 255 - (aByteArray9055[class149.anInt1687]
					& 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9073 != null) {
		for (int i_1522_ = 0; i_1522_ < i_1377_; i_1522_++) {
		    int i_1523_ = is[i_1522_];
		    if (i_1523_ < anIntArrayArray9073.length) {
			int[] is_1524_ = anIntArrayArray9073[i_1523_];
			for (int i_1525_ = 0; i_1525_ < is_1524_.length;
			     i_1525_++) {
			    int i_1526_ = is_1524_[i_1525_];
			    if (aShortArray9061 == null
				|| (i_1375_ & aShortArray9061[i_1526_]) != 0) {
				int i_1527_
				    = aShortArray9054[i_1526_] & 0xffff;
				int i_1528_ = i_1527_ >> 10 & 0x3f;
				int i_1529_ = i_1527_ >> 7 & 0x7;
				int i_1530_ = i_1527_ & 0x7f;
				i_1528_ = i_1528_ + i_1372_ & 0x3f;
				i_1529_ += i_1373_ / 4;
				if (i_1529_ < 0)
				    i_1529_ = 0;
				else if (i_1529_ > 7)
				    i_1529_ = 7;
				i_1530_ += i_1374_;
				if (i_1530_ < 0)
				    i_1530_ = 0;
				else if (i_1530_ > 127)
				    i_1530_ = 127;
				aShortArray9054[i_1526_]
				    = (short) (i_1528_ << 10 | i_1529_ << 7
					       | i_1530_);
				if (aClass129_9079 != null)
				    aClass129_9079.anInterface15_1519 = null;
			    }
			}
		    }
		}
		if (aClass149Array9087 != null) {
		    for (int i_1531_ = 0; i_1531_ < anInt9086; i_1531_++) {
			Class149 class149 = aClass149Array9087[i_1531_];
			Class133 class133 = aClass133Array9070[i_1531_];
			class133.anInt1585
			    = (class133.anInt1585 & ~0xffffff
			       | (Class661.anIntArray8549
				  [(aShortArray9054[class149.anInt1687]
				    & 0xffff)]) & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9089 != null) {
		for (int i_1532_ = 0; i_1532_ < i_1377_; i_1532_++) {
		    int i_1533_ = is[i_1532_];
		    if (i_1533_ < anIntArrayArray9089.length) {
			int[] is_1534_ = anIntArrayArray9089[i_1533_];
			for (int i_1535_ = 0; i_1535_ < is_1534_.length;
			     i_1535_++) {
			    Class133 class133
				= aClass133Array9070[is_1534_[i_1535_]];
			    class133.anInt1584 += i_1372_;
			    class133.anInt1583 += i_1373_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9089 != null) {
		for (int i_1536_ = 0; i_1536_ < i_1377_; i_1536_++) {
		    int i_1537_ = is[i_1536_];
		    if (i_1537_ < anIntArrayArray9089.length) {
			int[] is_1538_ = anIntArrayArray9089[i_1537_];
			for (int i_1539_ = 0; i_1539_ < is_1538_.length;
			     i_1539_++) {
			    Class133 class133
				= aClass133Array9070[is_1538_[i_1539_]];
			    class133.anInt1582
				= class133.anInt1582 * i_1372_ >> 7;
			    class133.anInt1581
				= class133.anInt1581 * i_1373_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9089 != null) {
		for (int i_1540_ = 0; i_1540_ < i_1377_; i_1540_++) {
		    int i_1541_ = is[i_1540_];
		    if (i_1541_ < anIntArrayArray9089.length) {
			int[] is_1542_ = anIntArrayArray9089[i_1541_];
			for (int i_1543_ = 0; i_1543_ < is_1542_.length;
			     i_1543_++) {
			    Class133 class133
				= aClass133Array9070[is_1542_[i_1543_]];
			    class133.anInt1586
				= class133.anInt1586 + i_1372_ & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    void method3102(int i, int[] is, int i_1544_, int i_1545_, int i_1546_,
		    boolean bool, int i_1547_, int[] is_1548_) {
	int i_1549_ = is.length;
	if (i == 0) {
	    i_1544_ <<= 4;
	    i_1545_ <<= 4;
	    i_1546_ <<= 4;
	    int i_1550_ = 0;
	    anInt9095 = 0;
	    anInt9096 = 0;
	    anInt9097 = 0;
	    for (int i_1551_ = 0; i_1551_ < i_1549_; i_1551_++) {
		int i_1552_ = is[i_1551_];
		if (i_1552_ < anIntArrayArray9028.length) {
		    int[] is_1553_ = anIntArrayArray9028[i_1552_];
		    for (int i_1554_ = 0; i_1554_ < is_1553_.length;
			 i_1554_++) {
			int i_1555_ = is_1553_[i_1554_];
			if (aShortArray9048 == null
			    || (i_1547_ & aShortArray9048[i_1555_]) != 0) {
			    anInt9095 += anIntArray9034[i_1555_];
			    anInt9096 += anIntArray9043[i_1555_];
			    anInt9097 += anIntArray9041[i_1555_];
			    i_1550_++;
			}
		    }
		}
	    }
	    if (i_1550_ > 0) {
		anInt9095 = anInt9095 / i_1550_ + i_1544_;
		anInt9096 = anInt9096 / i_1550_ + i_1545_;
		anInt9097 = anInt9097 / i_1550_ + i_1546_;
		aBool9098 = true;
	    } else {
		anInt9095 = i_1544_;
		anInt9096 = i_1545_;
		anInt9097 = i_1546_;
	    }
	} else if (i == 1) {
	    if (is_1548_ != null) {
		int i_1556_ = ((is_1548_[0] * i_1544_ + is_1548_[1] * i_1545_
				+ is_1548_[2] * i_1546_ + 8192)
			       >> 14);
		int i_1557_ = ((is_1548_[3] * i_1544_ + is_1548_[4] * i_1545_
				+ is_1548_[5] * i_1546_ + 8192)
			       >> 14);
		int i_1558_ = ((is_1548_[6] * i_1544_ + is_1548_[7] * i_1545_
				+ is_1548_[8] * i_1546_ + 8192)
			       >> 14);
		i_1544_ = i_1556_;
		i_1545_ = i_1557_;
		i_1546_ = i_1558_;
	    }
	    i_1544_ <<= 4;
	    i_1545_ <<= 4;
	    i_1546_ <<= 4;
	    for (int i_1559_ = 0; i_1559_ < i_1549_; i_1559_++) {
		int i_1560_ = is[i_1559_];
		if (i_1560_ < anIntArrayArray9028.length) {
		    int[] is_1561_ = anIntArrayArray9028[i_1560_];
		    for (int i_1562_ = 0; i_1562_ < is_1561_.length;
			 i_1562_++) {
			int i_1563_ = is_1561_[i_1562_];
			if (aShortArray9048 == null
			    || (i_1547_ & aShortArray9048[i_1563_]) != 0) {
			    anIntArray9034[i_1563_] += i_1544_;
			    anIntArray9043[i_1563_] += i_1545_;
			    anIntArray9041[i_1563_] += i_1546_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_1548_ != null) {
		int i_1564_ = is_1548_[9] << 4;
		int i_1565_ = is_1548_[10] << 4;
		int i_1566_ = is_1548_[11] << 4;
		int i_1567_ = is_1548_[12] << 4;
		int i_1568_ = is_1548_[13] << 4;
		int i_1569_ = is_1548_[14] << 4;
		if (aBool9098) {
		    int i_1570_
			= ((is_1548_[0] * anInt9095 + is_1548_[3] * anInt9096
			    + is_1548_[6] * anInt9097 + 8192)
			   >> 14);
		    int i_1571_
			= ((is_1548_[1] * anInt9095 + is_1548_[4] * anInt9096
			    + is_1548_[7] * anInt9097 + 8192)
			   >> 14);
		    int i_1572_
			= ((is_1548_[2] * anInt9095 + is_1548_[5] * anInt9096
			    + is_1548_[8] * anInt9097 + 8192)
			   >> 14);
		    i_1570_ += i_1567_;
		    i_1571_ += i_1568_;
		    i_1572_ += i_1569_;
		    anInt9095 = i_1570_;
		    anInt9096 = i_1571_;
		    anInt9097 = i_1572_;
		    aBool9098 = false;
		}
		int[] is_1573_ = new int[9];
		int i_1574_ = Class427.anIntArray4805[i_1544_];
		int i_1575_ = Class427.anIntArray4806[i_1544_];
		int i_1576_ = Class427.anIntArray4805[i_1545_];
		int i_1577_ = Class427.anIntArray4806[i_1545_];
		int i_1578_ = Class427.anIntArray4805[i_1546_];
		int i_1579_ = Class427.anIntArray4806[i_1546_];
		int i_1580_ = i_1575_ * i_1578_ + 8192 >> 14;
		int i_1581_ = i_1575_ * i_1579_ + 8192 >> 14;
		is_1573_[0]
		    = i_1576_ * i_1578_ + i_1577_ * i_1581_ + 8192 >> 14;
		is_1573_[1]
		    = -i_1576_ * i_1579_ + i_1577_ * i_1580_ + 8192 >> 14;
		is_1573_[2] = i_1577_ * i_1574_ + 8192 >> 14;
		is_1573_[3] = i_1574_ * i_1579_ + 8192 >> 14;
		is_1573_[4] = i_1574_ * i_1578_ + 8192 >> 14;
		is_1573_[5] = -i_1575_;
		is_1573_[6]
		    = -i_1577_ * i_1578_ + i_1576_ * i_1581_ + 8192 >> 14;
		is_1573_[7]
		    = i_1577_ * i_1579_ + i_1576_ * i_1580_ + 8192 >> 14;
		is_1573_[8] = i_1576_ * i_1574_ + 8192 >> 14;
		int i_1582_
		    = ((is_1573_[0] * -anInt9095 + is_1573_[1] * -anInt9096
			+ is_1573_[2] * -anInt9097 + 8192)
		       >> 14);
		int i_1583_
		    = ((is_1573_[3] * -anInt9095 + is_1573_[4] * -anInt9096
			+ is_1573_[5] * -anInt9097 + 8192)
		       >> 14);
		int i_1584_
		    = ((is_1573_[6] * -anInt9095 + is_1573_[7] * -anInt9096
			+ is_1573_[8] * -anInt9097 + 8192)
		       >> 14);
		int i_1585_ = i_1582_ + anInt9095;
		int i_1586_ = i_1583_ + anInt9096;
		int i_1587_ = i_1584_ + anInt9097;
		int[] is_1588_ = new int[9];
		for (int i_1589_ = 0; i_1589_ < 3; i_1589_++) {
		    for (int i_1590_ = 0; i_1590_ < 3; i_1590_++) {
			int i_1591_ = 0;
			for (int i_1592_ = 0; i_1592_ < 3; i_1592_++)
			    i_1591_ += (is_1573_[i_1589_ * 3 + i_1592_]
					* is_1548_[i_1590_ * 3 + i_1592_]);
			is_1588_[i_1589_ * 3 + i_1590_] = i_1591_ + 8192 >> 14;
		    }
		}
		int i_1593_ = ((is_1573_[0] * i_1567_ + is_1573_[1] * i_1568_
				+ is_1573_[2] * i_1569_ + 8192)
			       >> 14);
		int i_1594_ = ((is_1573_[3] * i_1567_ + is_1573_[4] * i_1568_
				+ is_1573_[5] * i_1569_ + 8192)
			       >> 14);
		int i_1595_ = ((is_1573_[6] * i_1567_ + is_1573_[7] * i_1568_
				+ is_1573_[8] * i_1569_ + 8192)
			       >> 14);
		i_1593_ += i_1585_;
		i_1594_ += i_1586_;
		i_1595_ += i_1587_;
		int[] is_1596_ = new int[9];
		for (int i_1597_ = 0; i_1597_ < 3; i_1597_++) {
		    for (int i_1598_ = 0; i_1598_ < 3; i_1598_++) {
			int i_1599_ = 0;
			for (int i_1600_ = 0; i_1600_ < 3; i_1600_++)
			    i_1599_ += (is_1548_[i_1597_ * 3 + i_1600_]
					* is_1588_[i_1598_ + i_1600_ * 3]);
			is_1596_[i_1597_ * 3 + i_1598_] = i_1599_ + 8192 >> 14;
		    }
		}
		int i_1601_ = ((is_1548_[0] * i_1593_ + is_1548_[1] * i_1594_
				+ is_1548_[2] * i_1595_ + 8192)
			       >> 14);
		int i_1602_ = ((is_1548_[3] * i_1593_ + is_1548_[4] * i_1594_
				+ is_1548_[5] * i_1595_ + 8192)
			       >> 14);
		int i_1603_ = ((is_1548_[6] * i_1593_ + is_1548_[7] * i_1594_
				+ is_1548_[8] * i_1595_ + 8192)
			       >> 14);
		i_1601_ += i_1564_;
		i_1602_ += i_1565_;
		i_1603_ += i_1566_;
		for (int i_1604_ = 0; i_1604_ < i_1549_; i_1604_++) {
		    int i_1605_ = is[i_1604_];
		    if (i_1605_ < anIntArrayArray9028.length) {
			int[] is_1606_ = anIntArrayArray9028[i_1605_];
			for (int i_1607_ = 0; i_1607_ < is_1606_.length;
			     i_1607_++) {
			    int i_1608_ = is_1606_[i_1607_];
			    if (aShortArray9048 == null
				|| (i_1547_ & aShortArray9048[i_1608_]) != 0) {
				int i_1609_
				    = ((is_1596_[0] * anIntArray9034[i_1608_]
					+ is_1596_[1] * anIntArray9043[i_1608_]
					+ is_1596_[2] * anIntArray9041[i_1608_]
					+ 8192)
				       >> 14);
				int i_1610_
				    = ((is_1596_[3] * anIntArray9034[i_1608_]
					+ is_1596_[4] * anIntArray9043[i_1608_]
					+ is_1596_[5] * anIntArray9041[i_1608_]
					+ 8192)
				       >> 14);
				int i_1611_
				    = ((is_1596_[6] * anIntArray9034[i_1608_]
					+ is_1596_[7] * anIntArray9043[i_1608_]
					+ is_1596_[8] * anIntArray9041[i_1608_]
					+ 8192)
				       >> 14);
				i_1609_ += i_1601_;
				i_1610_ += i_1602_;
				i_1611_ += i_1603_;
				anIntArray9034[i_1608_] = i_1609_;
				anIntArray9043[i_1608_] = i_1610_;
				anIntArray9041[i_1608_] = i_1611_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1612_ = 0; i_1612_ < i_1549_; i_1612_++) {
		    int i_1613_ = is[i_1612_];
		    if (i_1613_ < anIntArrayArray9028.length) {
			int[] is_1614_ = anIntArrayArray9028[i_1613_];
			for (int i_1615_ = 0; i_1615_ < is_1614_.length;
			     i_1615_++) {
			    int i_1616_ = is_1614_[i_1615_];
			    if (aShortArray9048 == null
				|| (i_1547_ & aShortArray9048[i_1616_]) != 0) {
				anIntArray9034[i_1616_] -= anInt9095;
				anIntArray9043[i_1616_] -= anInt9096;
				anIntArray9041[i_1616_] -= anInt9097;
				if (i_1546_ != 0) {
				    int i_1617_
					= Class427.anIntArray4806[i_1546_];
				    int i_1618_
					= Class427.anIntArray4805[i_1546_];
				    int i_1619_
					= ((anIntArray9043[i_1616_] * i_1617_
					    + anIntArray9034[i_1616_] * i_1618_
					    + 16383)
					   >> 14);
				    anIntArray9043[i_1616_]
					= (anIntArray9043[i_1616_] * i_1618_
					   - anIntArray9034[i_1616_] * i_1617_
					   + 16383) >> 14;
				    anIntArray9034[i_1616_] = i_1619_;
				}
				if (i_1544_ != 0) {
				    int i_1620_
					= Class427.anIntArray4806[i_1544_];
				    int i_1621_
					= Class427.anIntArray4805[i_1544_];
				    int i_1622_
					= ((anIntArray9043[i_1616_] * i_1621_
					    - anIntArray9041[i_1616_] * i_1620_
					    + 16383)
					   >> 14);
				    anIntArray9041[i_1616_]
					= (anIntArray9043[i_1616_] * i_1620_
					   + anIntArray9041[i_1616_] * i_1621_
					   + 16383) >> 14;
				    anIntArray9043[i_1616_] = i_1622_;
				}
				if (i_1545_ != 0) {
				    int i_1623_
					= Class427.anIntArray4806[i_1545_];
				    int i_1624_
					= Class427.anIntArray4805[i_1545_];
				    int i_1625_
					= ((anIntArray9041[i_1616_] * i_1623_
					    + anIntArray9034[i_1616_] * i_1624_
					    + 16383)
					   >> 14);
				    anIntArray9041[i_1616_]
					= (anIntArray9041[i_1616_] * i_1624_
					   - anIntArray9034[i_1616_] * i_1623_
					   + 16383) >> 14;
				    anIntArray9034[i_1616_] = i_1625_;
				}
				anIntArray9034[i_1616_] += anInt9095;
				anIntArray9043[i_1616_] += anInt9096;
				anIntArray9041[i_1616_] += anInt9097;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_1626_ = 0; i_1626_ < i_1549_; i_1626_++) {
			int i_1627_ = is[i_1626_];
			if (i_1627_ < anIntArrayArray9028.length) {
			    int[] is_1628_ = anIntArrayArray9028[i_1627_];
			    for (int i_1629_ = 0; i_1629_ < is_1628_.length;
				 i_1629_++) {
				int i_1630_ = is_1628_[i_1629_];
				if (aShortArray9048 == null
				    || ((i_1547_ & aShortArray9048[i_1630_])
					!= 0)) {
				    int i_1631_ = anIntArray9082[i_1630_];
				    int i_1632_ = anIntArray9082[i_1630_ + 1];
				    for (int i_1633_ = i_1631_;
					 (i_1633_ < i_1632_
					  && aShortArray9083[i_1633_] != 0);
					 i_1633_++) {
					int i_1634_ = (aShortArray9083[i_1633_]
						       & 0xffff) - 1;
					if (i_1546_ != 0) {
					    int i_1635_
						= (Class427.anIntArray4806
						   [i_1546_]);
					    int i_1636_
						= (Class427.anIntArray4805
						   [i_1546_]);
					    int i_1637_
						= (((aShortArray9042[i_1634_]
						     * i_1635_)
						    + (aShortArray9045[i_1634_]
						       * i_1636_)
						    + 16383)
						   >> 14);
					    aShortArray9042[i_1634_]
						= (short) ((((aShortArray9042
							      [i_1634_])
							     * i_1636_)
							    - ((aShortArray9045
								[i_1634_])
							       * i_1635_)
							    + 16383)
							   >> 14);
					    aShortArray9045[i_1634_]
						= (short) i_1637_;
					}
					if (i_1544_ != 0) {
					    int i_1638_
						= (Class427.anIntArray4806
						   [i_1544_]);
					    int i_1639_
						= (Class427.anIntArray4805
						   [i_1544_]);
					    int i_1640_
						= (((aShortArray9042[i_1634_]
						     * i_1639_)
						    - (aShortArray9047[i_1634_]
						       * i_1638_)
						    + 16383)
						   >> 14);
					    aShortArray9047[i_1634_]
						= (short) ((((aShortArray9042
							      [i_1634_])
							     * i_1638_)
							    + ((aShortArray9047
								[i_1634_])
							       * i_1639_)
							    + 16383)
							   >> 14);
					    aShortArray9042[i_1634_]
						= (short) i_1640_;
					}
					if (i_1545_ != 0) {
					    int i_1641_
						= (Class427.anIntArray4806
						   [i_1545_]);
					    int i_1642_
						= (Class427.anIntArray4805
						   [i_1545_]);
					    int i_1643_
						= (((aShortArray9047[i_1634_]
						     * i_1641_)
						    + (aShortArray9045[i_1634_]
						       * i_1642_)
						    + 16383)
						   >> 14);
					    aShortArray9047[i_1634_]
						= (short) ((((aShortArray9047
							      [i_1634_])
							     * i_1642_)
							    - ((aShortArray9045
								[i_1634_])
							       * i_1641_)
							    + 16383)
							   >> 14);
					    aShortArray9045[i_1634_]
						= (short) i_1643_;
					}
				    }
				}
			    }
			}
		    }
		    if (aClass129_9064 == null && aClass129_9079 != null)
			aClass129_9079.anInterface15_1519 = null;
		    if (aClass129_9064 != null)
			aClass129_9064.anInterface15_1519 = null;
		}
	    }
	} else if (i == 3) {
	    if (is_1548_ != null) {
		int i_1644_ = is_1548_[9] << 4;
		int i_1645_ = is_1548_[10] << 4;
		int i_1646_ = is_1548_[11] << 4;
		int i_1647_ = is_1548_[12] << 4;
		int i_1648_ = is_1548_[13] << 4;
		int i_1649_ = is_1548_[14] << 4;
		if (aBool9098) {
		    int i_1650_
			= ((is_1548_[0] * anInt9095 + is_1548_[3] * anInt9096
			    + is_1548_[6] * anInt9097 + 8192)
			   >> 14);
		    int i_1651_
			= ((is_1548_[1] * anInt9095 + is_1548_[4] * anInt9096
			    + is_1548_[7] * anInt9097 + 8192)
			   >> 14);
		    int i_1652_
			= ((is_1548_[2] * anInt9095 + is_1548_[5] * anInt9096
			    + is_1548_[8] * anInt9097 + 8192)
			   >> 14);
		    i_1650_ += i_1647_;
		    i_1651_ += i_1648_;
		    i_1652_ += i_1649_;
		    anInt9095 = i_1650_;
		    anInt9096 = i_1651_;
		    anInt9097 = i_1652_;
		    aBool9098 = false;
		}
		int i_1653_ = i_1544_ << 15 >> 7;
		int i_1654_ = i_1545_ << 15 >> 7;
		int i_1655_ = i_1546_ << 15 >> 7;
		int i_1656_ = i_1653_ * -anInt9095 + 8192 >> 14;
		int i_1657_ = i_1654_ * -anInt9096 + 8192 >> 14;
		int i_1658_ = i_1655_ * -anInt9097 + 8192 >> 14;
		int i_1659_ = i_1656_ + anInt9095;
		int i_1660_ = i_1657_ + anInt9096;
		int i_1661_ = i_1658_ + anInt9097;
		int[] is_1662_ = new int[9];
		is_1662_[0] = i_1653_ * is_1548_[0] + 8192 >> 14;
		is_1662_[1] = i_1653_ * is_1548_[3] + 8192 >> 14;
		is_1662_[2] = i_1653_ * is_1548_[6] + 8192 >> 14;
		is_1662_[3] = i_1654_ * is_1548_[1] + 8192 >> 14;
		is_1662_[4] = i_1654_ * is_1548_[4] + 8192 >> 14;
		is_1662_[5] = i_1654_ * is_1548_[7] + 8192 >> 14;
		is_1662_[6] = i_1655_ * is_1548_[2] + 8192 >> 14;
		is_1662_[7] = i_1655_ * is_1548_[5] + 8192 >> 14;
		is_1662_[8] = i_1655_ * is_1548_[8] + 8192 >> 14;
		int i_1663_ = i_1653_ * i_1647_ + 8192 >> 14;
		int i_1664_ = i_1654_ * i_1648_ + 8192 >> 14;
		int i_1665_ = i_1655_ * i_1649_ + 8192 >> 14;
		i_1663_ += i_1659_;
		i_1664_ += i_1660_;
		i_1665_ += i_1661_;
		int[] is_1666_ = new int[9];
		for (int i_1667_ = 0; i_1667_ < 3; i_1667_++) {
		    for (int i_1668_ = 0; i_1668_ < 3; i_1668_++) {
			int i_1669_ = 0;
			for (int i_1670_ = 0; i_1670_ < 3; i_1670_++)
			    i_1669_ += (is_1548_[i_1667_ * 3 + i_1670_]
					* is_1662_[i_1668_ + i_1670_ * 3]);
			is_1666_[i_1667_ * 3 + i_1668_] = i_1669_ + 8192 >> 14;
		    }
		}
		int i_1671_ = ((is_1548_[0] * i_1663_ + is_1548_[1] * i_1664_
				+ is_1548_[2] * i_1665_ + 8192)
			       >> 14);
		int i_1672_ = ((is_1548_[3] * i_1663_ + is_1548_[4] * i_1664_
				+ is_1548_[5] * i_1665_ + 8192)
			       >> 14);
		int i_1673_ = ((is_1548_[6] * i_1663_ + is_1548_[7] * i_1664_
				+ is_1548_[8] * i_1665_ + 8192)
			       >> 14);
		i_1671_ += i_1644_;
		i_1672_ += i_1645_;
		i_1673_ += i_1646_;
		for (int i_1674_ = 0; i_1674_ < i_1549_; i_1674_++) {
		    int i_1675_ = is[i_1674_];
		    if (i_1675_ < anIntArrayArray9028.length) {
			int[] is_1676_ = anIntArrayArray9028[i_1675_];
			for (int i_1677_ = 0; i_1677_ < is_1676_.length;
			     i_1677_++) {
			    int i_1678_ = is_1676_[i_1677_];
			    if (aShortArray9048 == null
				|| (i_1547_ & aShortArray9048[i_1678_]) != 0) {
				int i_1679_
				    = ((is_1666_[0] * anIntArray9034[i_1678_]
					+ is_1666_[1] * anIntArray9043[i_1678_]
					+ is_1666_[2] * anIntArray9041[i_1678_]
					+ 8192)
				       >> 14);
				int i_1680_
				    = ((is_1666_[3] * anIntArray9034[i_1678_]
					+ is_1666_[4] * anIntArray9043[i_1678_]
					+ is_1666_[5] * anIntArray9041[i_1678_]
					+ 8192)
				       >> 14);
				int i_1681_
				    = ((is_1666_[6] * anIntArray9034[i_1678_]
					+ is_1666_[7] * anIntArray9043[i_1678_]
					+ is_1666_[8] * anIntArray9041[i_1678_]
					+ 8192)
				       >> 14);
				i_1679_ += i_1671_;
				i_1680_ += i_1672_;
				i_1681_ += i_1673_;
				anIntArray9034[i_1678_] = i_1679_;
				anIntArray9043[i_1678_] = i_1680_;
				anIntArray9041[i_1678_] = i_1681_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1682_ = 0; i_1682_ < i_1549_; i_1682_++) {
		    int i_1683_ = is[i_1682_];
		    if (i_1683_ < anIntArrayArray9028.length) {
			int[] is_1684_ = anIntArrayArray9028[i_1683_];
			for (int i_1685_ = 0; i_1685_ < is_1684_.length;
			     i_1685_++) {
			    int i_1686_ = is_1684_[i_1685_];
			    if (aShortArray9048 == null
				|| (i_1547_ & aShortArray9048[i_1686_]) != 0) {
				anIntArray9034[i_1686_] -= anInt9095;
				anIntArray9043[i_1686_] -= anInt9096;
				anIntArray9041[i_1686_] -= anInt9097;
				anIntArray9034[i_1686_]
				    = anIntArray9034[i_1686_] * i_1544_ >> 7;
				anIntArray9043[i_1686_]
				    = anIntArray9043[i_1686_] * i_1545_ >> 7;
				anIntArray9041[i_1686_]
				    = anIntArray9041[i_1686_] * i_1546_ >> 7;
				anIntArray9034[i_1686_] += anInt9095;
				anIntArray9043[i_1686_] += anInt9096;
				anIntArray9041[i_1686_] += anInt9097;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9073 != null) {
		for (int i_1687_ = 0; i_1687_ < i_1549_; i_1687_++) {
		    int i_1688_ = is[i_1687_];
		    if (i_1688_ < anIntArrayArray9073.length) {
			int[] is_1689_ = anIntArrayArray9073[i_1688_];
			for (int i_1690_ = 0; i_1690_ < is_1689_.length;
			     i_1690_++) {
			    int i_1691_ = is_1689_[i_1690_];
			    if (aShortArray9061 == null
				|| (i_1547_ & aShortArray9061[i_1691_]) != 0) {
				int i_1692_ = ((aByteArray9055[i_1691_] & 0xff)
					       + i_1544_ * 8);
				if (i_1692_ < 0)
				    i_1692_ = 0;
				else if (i_1692_ > 255)
				    i_1692_ = 255;
				aByteArray9055[i_1691_] = (byte) i_1692_;
				if (aClass129_9079 != null)
				    aClass129_9079.anInterface15_1519 = null;
			    }
			}
		    }
		}
		if (aClass149Array9087 != null) {
		    for (int i_1693_ = 0; i_1693_ < anInt9086; i_1693_++) {
			Class149 class149 = aClass149Array9087[i_1693_];
			Class133 class133 = aClass133Array9070[i_1693_];
			class133.anInt1585
			    = (class133.anInt1585 & 0xffffff
			       | 255 - (aByteArray9055[class149.anInt1687]
					& 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9073 != null) {
		for (int i_1694_ = 0; i_1694_ < i_1549_; i_1694_++) {
		    int i_1695_ = is[i_1694_];
		    if (i_1695_ < anIntArrayArray9073.length) {
			int[] is_1696_ = anIntArrayArray9073[i_1695_];
			for (int i_1697_ = 0; i_1697_ < is_1696_.length;
			     i_1697_++) {
			    int i_1698_ = is_1696_[i_1697_];
			    if (aShortArray9061 == null
				|| (i_1547_ & aShortArray9061[i_1698_]) != 0) {
				int i_1699_
				    = aShortArray9054[i_1698_] & 0xffff;
				int i_1700_ = i_1699_ >> 10 & 0x3f;
				int i_1701_ = i_1699_ >> 7 & 0x7;
				int i_1702_ = i_1699_ & 0x7f;
				i_1700_ = i_1700_ + i_1544_ & 0x3f;
				i_1701_ += i_1545_ / 4;
				if (i_1701_ < 0)
				    i_1701_ = 0;
				else if (i_1701_ > 7)
				    i_1701_ = 7;
				i_1702_ += i_1546_;
				if (i_1702_ < 0)
				    i_1702_ = 0;
				else if (i_1702_ > 127)
				    i_1702_ = 127;
				aShortArray9054[i_1698_]
				    = (short) (i_1700_ << 10 | i_1701_ << 7
					       | i_1702_);
				if (aClass129_9079 != null)
				    aClass129_9079.anInterface15_1519 = null;
			    }
			}
		    }
		}
		if (aClass149Array9087 != null) {
		    for (int i_1703_ = 0; i_1703_ < anInt9086; i_1703_++) {
			Class149 class149 = aClass149Array9087[i_1703_];
			Class133 class133 = aClass133Array9070[i_1703_];
			class133.anInt1585
			    = (class133.anInt1585 & ~0xffffff
			       | (Class661.anIntArray8549
				  [(aShortArray9054[class149.anInt1687]
				    & 0xffff)]) & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9089 != null) {
		for (int i_1704_ = 0; i_1704_ < i_1549_; i_1704_++) {
		    int i_1705_ = is[i_1704_];
		    if (i_1705_ < anIntArrayArray9089.length) {
			int[] is_1706_ = anIntArrayArray9089[i_1705_];
			for (int i_1707_ = 0; i_1707_ < is_1706_.length;
			     i_1707_++) {
			    Class133 class133
				= aClass133Array9070[is_1706_[i_1707_]];
			    class133.anInt1584 += i_1544_;
			    class133.anInt1583 += i_1545_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9089 != null) {
		for (int i_1708_ = 0; i_1708_ < i_1549_; i_1708_++) {
		    int i_1709_ = is[i_1708_];
		    if (i_1709_ < anIntArrayArray9089.length) {
			int[] is_1710_ = anIntArrayArray9089[i_1709_];
			for (int i_1711_ = 0; i_1711_ < is_1710_.length;
			     i_1711_++) {
			    Class133 class133
				= aClass133Array9070[is_1710_[i_1711_]];
			    class133.anInt1582
				= class133.anInt1582 * i_1544_ >> 7;
			    class133.anInt1581
				= class133.anInt1581 * i_1545_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9089 != null) {
		for (int i_1712_ = 0; i_1712_ < i_1549_; i_1712_++) {
		    int i_1713_ = is[i_1712_];
		    if (i_1713_ < anIntArrayArray9089.length) {
			int[] is_1714_ = anIntArrayArray9089[i_1713_];
			for (int i_1715_ = 0; i_1715_ < is_1714_.length;
			     i_1715_++) {
			    Class133 class133
				= aClass133Array9070[is_1714_[i_1715_]];
			    class133.anInt1586
				= class133.anInt1586 + i_1544_ & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    void method3095(int i, int[] is, int i_1716_, int i_1717_, int i_1718_,
		    boolean bool, int i_1719_, int[] is_1720_) {
	int i_1721_ = is.length;
	if (i == 0) {
	    i_1716_ <<= 4;
	    i_1717_ <<= 4;
	    i_1718_ <<= 4;
	    int i_1722_ = 0;
	    anInt9095 = 0;
	    anInt9096 = 0;
	    anInt9097 = 0;
	    for (int i_1723_ = 0; i_1723_ < i_1721_; i_1723_++) {
		int i_1724_ = is[i_1723_];
		if (i_1724_ < anIntArrayArray9028.length) {
		    int[] is_1725_ = anIntArrayArray9028[i_1724_];
		    for (int i_1726_ = 0; i_1726_ < is_1725_.length;
			 i_1726_++) {
			int i_1727_ = is_1725_[i_1726_];
			if (aShortArray9048 == null
			    || (i_1719_ & aShortArray9048[i_1727_]) != 0) {
			    anInt9095 += anIntArray9034[i_1727_];
			    anInt9096 += anIntArray9043[i_1727_];
			    anInt9097 += anIntArray9041[i_1727_];
			    i_1722_++;
			}
		    }
		}
	    }
	    if (i_1722_ > 0) {
		anInt9095 = anInt9095 / i_1722_ + i_1716_;
		anInt9096 = anInt9096 / i_1722_ + i_1717_;
		anInt9097 = anInt9097 / i_1722_ + i_1718_;
		aBool9098 = true;
	    } else {
		anInt9095 = i_1716_;
		anInt9096 = i_1717_;
		anInt9097 = i_1718_;
	    }
	} else if (i == 1) {
	    if (is_1720_ != null) {
		int i_1728_ = ((is_1720_[0] * i_1716_ + is_1720_[1] * i_1717_
				+ is_1720_[2] * i_1718_ + 8192)
			       >> 14);
		int i_1729_ = ((is_1720_[3] * i_1716_ + is_1720_[4] * i_1717_
				+ is_1720_[5] * i_1718_ + 8192)
			       >> 14);
		int i_1730_ = ((is_1720_[6] * i_1716_ + is_1720_[7] * i_1717_
				+ is_1720_[8] * i_1718_ + 8192)
			       >> 14);
		i_1716_ = i_1728_;
		i_1717_ = i_1729_;
		i_1718_ = i_1730_;
	    }
	    i_1716_ <<= 4;
	    i_1717_ <<= 4;
	    i_1718_ <<= 4;
	    for (int i_1731_ = 0; i_1731_ < i_1721_; i_1731_++) {
		int i_1732_ = is[i_1731_];
		if (i_1732_ < anIntArrayArray9028.length) {
		    int[] is_1733_ = anIntArrayArray9028[i_1732_];
		    for (int i_1734_ = 0; i_1734_ < is_1733_.length;
			 i_1734_++) {
			int i_1735_ = is_1733_[i_1734_];
			if (aShortArray9048 == null
			    || (i_1719_ & aShortArray9048[i_1735_]) != 0) {
			    anIntArray9034[i_1735_] += i_1716_;
			    anIntArray9043[i_1735_] += i_1717_;
			    anIntArray9041[i_1735_] += i_1718_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_1720_ != null) {
		int i_1736_ = is_1720_[9] << 4;
		int i_1737_ = is_1720_[10] << 4;
		int i_1738_ = is_1720_[11] << 4;
		int i_1739_ = is_1720_[12] << 4;
		int i_1740_ = is_1720_[13] << 4;
		int i_1741_ = is_1720_[14] << 4;
		if (aBool9098) {
		    int i_1742_
			= ((is_1720_[0] * anInt9095 + is_1720_[3] * anInt9096
			    + is_1720_[6] * anInt9097 + 8192)
			   >> 14);
		    int i_1743_
			= ((is_1720_[1] * anInt9095 + is_1720_[4] * anInt9096
			    + is_1720_[7] * anInt9097 + 8192)
			   >> 14);
		    int i_1744_
			= ((is_1720_[2] * anInt9095 + is_1720_[5] * anInt9096
			    + is_1720_[8] * anInt9097 + 8192)
			   >> 14);
		    i_1742_ += i_1739_;
		    i_1743_ += i_1740_;
		    i_1744_ += i_1741_;
		    anInt9095 = i_1742_;
		    anInt9096 = i_1743_;
		    anInt9097 = i_1744_;
		    aBool9098 = false;
		}
		int[] is_1745_ = new int[9];
		int i_1746_ = Class427.anIntArray4805[i_1716_];
		int i_1747_ = Class427.anIntArray4806[i_1716_];
		int i_1748_ = Class427.anIntArray4805[i_1717_];
		int i_1749_ = Class427.anIntArray4806[i_1717_];
		int i_1750_ = Class427.anIntArray4805[i_1718_];
		int i_1751_ = Class427.anIntArray4806[i_1718_];
		int i_1752_ = i_1747_ * i_1750_ + 8192 >> 14;
		int i_1753_ = i_1747_ * i_1751_ + 8192 >> 14;
		is_1745_[0]
		    = i_1748_ * i_1750_ + i_1749_ * i_1753_ + 8192 >> 14;
		is_1745_[1]
		    = -i_1748_ * i_1751_ + i_1749_ * i_1752_ + 8192 >> 14;
		is_1745_[2] = i_1749_ * i_1746_ + 8192 >> 14;
		is_1745_[3] = i_1746_ * i_1751_ + 8192 >> 14;
		is_1745_[4] = i_1746_ * i_1750_ + 8192 >> 14;
		is_1745_[5] = -i_1747_;
		is_1745_[6]
		    = -i_1749_ * i_1750_ + i_1748_ * i_1753_ + 8192 >> 14;
		is_1745_[7]
		    = i_1749_ * i_1751_ + i_1748_ * i_1752_ + 8192 >> 14;
		is_1745_[8] = i_1748_ * i_1746_ + 8192 >> 14;
		int i_1754_
		    = ((is_1745_[0] * -anInt9095 + is_1745_[1] * -anInt9096
			+ is_1745_[2] * -anInt9097 + 8192)
		       >> 14);
		int i_1755_
		    = ((is_1745_[3] * -anInt9095 + is_1745_[4] * -anInt9096
			+ is_1745_[5] * -anInt9097 + 8192)
		       >> 14);
		int i_1756_
		    = ((is_1745_[6] * -anInt9095 + is_1745_[7] * -anInt9096
			+ is_1745_[8] * -anInt9097 + 8192)
		       >> 14);
		int i_1757_ = i_1754_ + anInt9095;
		int i_1758_ = i_1755_ + anInt9096;
		int i_1759_ = i_1756_ + anInt9097;
		int[] is_1760_ = new int[9];
		for (int i_1761_ = 0; i_1761_ < 3; i_1761_++) {
		    for (int i_1762_ = 0; i_1762_ < 3; i_1762_++) {
			int i_1763_ = 0;
			for (int i_1764_ = 0; i_1764_ < 3; i_1764_++)
			    i_1763_ += (is_1745_[i_1761_ * 3 + i_1764_]
					* is_1720_[i_1762_ * 3 + i_1764_]);
			is_1760_[i_1761_ * 3 + i_1762_] = i_1763_ + 8192 >> 14;
		    }
		}
		int i_1765_ = ((is_1745_[0] * i_1739_ + is_1745_[1] * i_1740_
				+ is_1745_[2] * i_1741_ + 8192)
			       >> 14);
		int i_1766_ = ((is_1745_[3] * i_1739_ + is_1745_[4] * i_1740_
				+ is_1745_[5] * i_1741_ + 8192)
			       >> 14);
		int i_1767_ = ((is_1745_[6] * i_1739_ + is_1745_[7] * i_1740_
				+ is_1745_[8] * i_1741_ + 8192)
			       >> 14);
		i_1765_ += i_1757_;
		i_1766_ += i_1758_;
		i_1767_ += i_1759_;
		int[] is_1768_ = new int[9];
		for (int i_1769_ = 0; i_1769_ < 3; i_1769_++) {
		    for (int i_1770_ = 0; i_1770_ < 3; i_1770_++) {
			int i_1771_ = 0;
			for (int i_1772_ = 0; i_1772_ < 3; i_1772_++)
			    i_1771_ += (is_1720_[i_1769_ * 3 + i_1772_]
					* is_1760_[i_1770_ + i_1772_ * 3]);
			is_1768_[i_1769_ * 3 + i_1770_] = i_1771_ + 8192 >> 14;
		    }
		}
		int i_1773_ = ((is_1720_[0] * i_1765_ + is_1720_[1] * i_1766_
				+ is_1720_[2] * i_1767_ + 8192)
			       >> 14);
		int i_1774_ = ((is_1720_[3] * i_1765_ + is_1720_[4] * i_1766_
				+ is_1720_[5] * i_1767_ + 8192)
			       >> 14);
		int i_1775_ = ((is_1720_[6] * i_1765_ + is_1720_[7] * i_1766_
				+ is_1720_[8] * i_1767_ + 8192)
			       >> 14);
		i_1773_ += i_1736_;
		i_1774_ += i_1737_;
		i_1775_ += i_1738_;
		for (int i_1776_ = 0; i_1776_ < i_1721_; i_1776_++) {
		    int i_1777_ = is[i_1776_];
		    if (i_1777_ < anIntArrayArray9028.length) {
			int[] is_1778_ = anIntArrayArray9028[i_1777_];
			for (int i_1779_ = 0; i_1779_ < is_1778_.length;
			     i_1779_++) {
			    int i_1780_ = is_1778_[i_1779_];
			    if (aShortArray9048 == null
				|| (i_1719_ & aShortArray9048[i_1780_]) != 0) {
				int i_1781_
				    = ((is_1768_[0] * anIntArray9034[i_1780_]
					+ is_1768_[1] * anIntArray9043[i_1780_]
					+ is_1768_[2] * anIntArray9041[i_1780_]
					+ 8192)
				       >> 14);
				int i_1782_
				    = ((is_1768_[3] * anIntArray9034[i_1780_]
					+ is_1768_[4] * anIntArray9043[i_1780_]
					+ is_1768_[5] * anIntArray9041[i_1780_]
					+ 8192)
				       >> 14);
				int i_1783_
				    = ((is_1768_[6] * anIntArray9034[i_1780_]
					+ is_1768_[7] * anIntArray9043[i_1780_]
					+ is_1768_[8] * anIntArray9041[i_1780_]
					+ 8192)
				       >> 14);
				i_1781_ += i_1773_;
				i_1782_ += i_1774_;
				i_1783_ += i_1775_;
				anIntArray9034[i_1780_] = i_1781_;
				anIntArray9043[i_1780_] = i_1782_;
				anIntArray9041[i_1780_] = i_1783_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1784_ = 0; i_1784_ < i_1721_; i_1784_++) {
		    int i_1785_ = is[i_1784_];
		    if (i_1785_ < anIntArrayArray9028.length) {
			int[] is_1786_ = anIntArrayArray9028[i_1785_];
			for (int i_1787_ = 0; i_1787_ < is_1786_.length;
			     i_1787_++) {
			    int i_1788_ = is_1786_[i_1787_];
			    if (aShortArray9048 == null
				|| (i_1719_ & aShortArray9048[i_1788_]) != 0) {
				anIntArray9034[i_1788_] -= anInt9095;
				anIntArray9043[i_1788_] -= anInt9096;
				anIntArray9041[i_1788_] -= anInt9097;
				if (i_1718_ != 0) {
				    int i_1789_
					= Class427.anIntArray4806[i_1718_];
				    int i_1790_
					= Class427.anIntArray4805[i_1718_];
				    int i_1791_
					= ((anIntArray9043[i_1788_] * i_1789_
					    + anIntArray9034[i_1788_] * i_1790_
					    + 16383)
					   >> 14);
				    anIntArray9043[i_1788_]
					= (anIntArray9043[i_1788_] * i_1790_
					   - anIntArray9034[i_1788_] * i_1789_
					   + 16383) >> 14;
				    anIntArray9034[i_1788_] = i_1791_;
				}
				if (i_1716_ != 0) {
				    int i_1792_
					= Class427.anIntArray4806[i_1716_];
				    int i_1793_
					= Class427.anIntArray4805[i_1716_];
				    int i_1794_
					= ((anIntArray9043[i_1788_] * i_1793_
					    - anIntArray9041[i_1788_] * i_1792_
					    + 16383)
					   >> 14);
				    anIntArray9041[i_1788_]
					= (anIntArray9043[i_1788_] * i_1792_
					   + anIntArray9041[i_1788_] * i_1793_
					   + 16383) >> 14;
				    anIntArray9043[i_1788_] = i_1794_;
				}
				if (i_1717_ != 0) {
				    int i_1795_
					= Class427.anIntArray4806[i_1717_];
				    int i_1796_
					= Class427.anIntArray4805[i_1717_];
				    int i_1797_
					= ((anIntArray9041[i_1788_] * i_1795_
					    + anIntArray9034[i_1788_] * i_1796_
					    + 16383)
					   >> 14);
				    anIntArray9041[i_1788_]
					= (anIntArray9041[i_1788_] * i_1796_
					   - anIntArray9034[i_1788_] * i_1795_
					   + 16383) >> 14;
				    anIntArray9034[i_1788_] = i_1797_;
				}
				anIntArray9034[i_1788_] += anInt9095;
				anIntArray9043[i_1788_] += anInt9096;
				anIntArray9041[i_1788_] += anInt9097;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_1798_ = 0; i_1798_ < i_1721_; i_1798_++) {
			int i_1799_ = is[i_1798_];
			if (i_1799_ < anIntArrayArray9028.length) {
			    int[] is_1800_ = anIntArrayArray9028[i_1799_];
			    for (int i_1801_ = 0; i_1801_ < is_1800_.length;
				 i_1801_++) {
				int i_1802_ = is_1800_[i_1801_];
				if (aShortArray9048 == null
				    || ((i_1719_ & aShortArray9048[i_1802_])
					!= 0)) {
				    int i_1803_ = anIntArray9082[i_1802_];
				    int i_1804_ = anIntArray9082[i_1802_ + 1];
				    for (int i_1805_ = i_1803_;
					 (i_1805_ < i_1804_
					  && aShortArray9083[i_1805_] != 0);
					 i_1805_++) {
					int i_1806_ = (aShortArray9083[i_1805_]
						       & 0xffff) - 1;
					if (i_1718_ != 0) {
					    int i_1807_
						= (Class427.anIntArray4806
						   [i_1718_]);
					    int i_1808_
						= (Class427.anIntArray4805
						   [i_1718_]);
					    int i_1809_
						= (((aShortArray9042[i_1806_]
						     * i_1807_)
						    + (aShortArray9045[i_1806_]
						       * i_1808_)
						    + 16383)
						   >> 14);
					    aShortArray9042[i_1806_]
						= (short) ((((aShortArray9042
							      [i_1806_])
							     * i_1808_)
							    - ((aShortArray9045
								[i_1806_])
							       * i_1807_)
							    + 16383)
							   >> 14);
					    aShortArray9045[i_1806_]
						= (short) i_1809_;
					}
					if (i_1716_ != 0) {
					    int i_1810_
						= (Class427.anIntArray4806
						   [i_1716_]);
					    int i_1811_
						= (Class427.anIntArray4805
						   [i_1716_]);
					    int i_1812_
						= (((aShortArray9042[i_1806_]
						     * i_1811_)
						    - (aShortArray9047[i_1806_]
						       * i_1810_)
						    + 16383)
						   >> 14);
					    aShortArray9047[i_1806_]
						= (short) ((((aShortArray9042
							      [i_1806_])
							     * i_1810_)
							    + ((aShortArray9047
								[i_1806_])
							       * i_1811_)
							    + 16383)
							   >> 14);
					    aShortArray9042[i_1806_]
						= (short) i_1812_;
					}
					if (i_1717_ != 0) {
					    int i_1813_
						= (Class427.anIntArray4806
						   [i_1717_]);
					    int i_1814_
						= (Class427.anIntArray4805
						   [i_1717_]);
					    int i_1815_
						= (((aShortArray9047[i_1806_]
						     * i_1813_)
						    + (aShortArray9045[i_1806_]
						       * i_1814_)
						    + 16383)
						   >> 14);
					    aShortArray9047[i_1806_]
						= (short) ((((aShortArray9047
							      [i_1806_])
							     * i_1814_)
							    - ((aShortArray9045
								[i_1806_])
							       * i_1813_)
							    + 16383)
							   >> 14);
					    aShortArray9045[i_1806_]
						= (short) i_1815_;
					}
				    }
				}
			    }
			}
		    }
		    if (aClass129_9064 == null && aClass129_9079 != null)
			aClass129_9079.anInterface15_1519 = null;
		    if (aClass129_9064 != null)
			aClass129_9064.anInterface15_1519 = null;
		}
	    }
	} else if (i == 3) {
	    if (is_1720_ != null) {
		int i_1816_ = is_1720_[9] << 4;
		int i_1817_ = is_1720_[10] << 4;
		int i_1818_ = is_1720_[11] << 4;
		int i_1819_ = is_1720_[12] << 4;
		int i_1820_ = is_1720_[13] << 4;
		int i_1821_ = is_1720_[14] << 4;
		if (aBool9098) {
		    int i_1822_
			= ((is_1720_[0] * anInt9095 + is_1720_[3] * anInt9096
			    + is_1720_[6] * anInt9097 + 8192)
			   >> 14);
		    int i_1823_
			= ((is_1720_[1] * anInt9095 + is_1720_[4] * anInt9096
			    + is_1720_[7] * anInt9097 + 8192)
			   >> 14);
		    int i_1824_
			= ((is_1720_[2] * anInt9095 + is_1720_[5] * anInt9096
			    + is_1720_[8] * anInt9097 + 8192)
			   >> 14);
		    i_1822_ += i_1819_;
		    i_1823_ += i_1820_;
		    i_1824_ += i_1821_;
		    anInt9095 = i_1822_;
		    anInt9096 = i_1823_;
		    anInt9097 = i_1824_;
		    aBool9098 = false;
		}
		int i_1825_ = i_1716_ << 15 >> 7;
		int i_1826_ = i_1717_ << 15 >> 7;
		int i_1827_ = i_1718_ << 15 >> 7;
		int i_1828_ = i_1825_ * -anInt9095 + 8192 >> 14;
		int i_1829_ = i_1826_ * -anInt9096 + 8192 >> 14;
		int i_1830_ = i_1827_ * -anInt9097 + 8192 >> 14;
		int i_1831_ = i_1828_ + anInt9095;
		int i_1832_ = i_1829_ + anInt9096;
		int i_1833_ = i_1830_ + anInt9097;
		int[] is_1834_ = new int[9];
		is_1834_[0] = i_1825_ * is_1720_[0] + 8192 >> 14;
		is_1834_[1] = i_1825_ * is_1720_[3] + 8192 >> 14;
		is_1834_[2] = i_1825_ * is_1720_[6] + 8192 >> 14;
		is_1834_[3] = i_1826_ * is_1720_[1] + 8192 >> 14;
		is_1834_[4] = i_1826_ * is_1720_[4] + 8192 >> 14;
		is_1834_[5] = i_1826_ * is_1720_[7] + 8192 >> 14;
		is_1834_[6] = i_1827_ * is_1720_[2] + 8192 >> 14;
		is_1834_[7] = i_1827_ * is_1720_[5] + 8192 >> 14;
		is_1834_[8] = i_1827_ * is_1720_[8] + 8192 >> 14;
		int i_1835_ = i_1825_ * i_1819_ + 8192 >> 14;
		int i_1836_ = i_1826_ * i_1820_ + 8192 >> 14;
		int i_1837_ = i_1827_ * i_1821_ + 8192 >> 14;
		i_1835_ += i_1831_;
		i_1836_ += i_1832_;
		i_1837_ += i_1833_;
		int[] is_1838_ = new int[9];
		for (int i_1839_ = 0; i_1839_ < 3; i_1839_++) {
		    for (int i_1840_ = 0; i_1840_ < 3; i_1840_++) {
			int i_1841_ = 0;
			for (int i_1842_ = 0; i_1842_ < 3; i_1842_++)
			    i_1841_ += (is_1720_[i_1839_ * 3 + i_1842_]
					* is_1834_[i_1840_ + i_1842_ * 3]);
			is_1838_[i_1839_ * 3 + i_1840_] = i_1841_ + 8192 >> 14;
		    }
		}
		int i_1843_ = ((is_1720_[0] * i_1835_ + is_1720_[1] * i_1836_
				+ is_1720_[2] * i_1837_ + 8192)
			       >> 14);
		int i_1844_ = ((is_1720_[3] * i_1835_ + is_1720_[4] * i_1836_
				+ is_1720_[5] * i_1837_ + 8192)
			       >> 14);
		int i_1845_ = ((is_1720_[6] * i_1835_ + is_1720_[7] * i_1836_
				+ is_1720_[8] * i_1837_ + 8192)
			       >> 14);
		i_1843_ += i_1816_;
		i_1844_ += i_1817_;
		i_1845_ += i_1818_;
		for (int i_1846_ = 0; i_1846_ < i_1721_; i_1846_++) {
		    int i_1847_ = is[i_1846_];
		    if (i_1847_ < anIntArrayArray9028.length) {
			int[] is_1848_ = anIntArrayArray9028[i_1847_];
			for (int i_1849_ = 0; i_1849_ < is_1848_.length;
			     i_1849_++) {
			    int i_1850_ = is_1848_[i_1849_];
			    if (aShortArray9048 == null
				|| (i_1719_ & aShortArray9048[i_1850_]) != 0) {
				int i_1851_
				    = ((is_1838_[0] * anIntArray9034[i_1850_]
					+ is_1838_[1] * anIntArray9043[i_1850_]
					+ is_1838_[2] * anIntArray9041[i_1850_]
					+ 8192)
				       >> 14);
				int i_1852_
				    = ((is_1838_[3] * anIntArray9034[i_1850_]
					+ is_1838_[4] * anIntArray9043[i_1850_]
					+ is_1838_[5] * anIntArray9041[i_1850_]
					+ 8192)
				       >> 14);
				int i_1853_
				    = ((is_1838_[6] * anIntArray9034[i_1850_]
					+ is_1838_[7] * anIntArray9043[i_1850_]
					+ is_1838_[8] * anIntArray9041[i_1850_]
					+ 8192)
				       >> 14);
				i_1851_ += i_1843_;
				i_1852_ += i_1844_;
				i_1853_ += i_1845_;
				anIntArray9034[i_1850_] = i_1851_;
				anIntArray9043[i_1850_] = i_1852_;
				anIntArray9041[i_1850_] = i_1853_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1854_ = 0; i_1854_ < i_1721_; i_1854_++) {
		    int i_1855_ = is[i_1854_];
		    if (i_1855_ < anIntArrayArray9028.length) {
			int[] is_1856_ = anIntArrayArray9028[i_1855_];
			for (int i_1857_ = 0; i_1857_ < is_1856_.length;
			     i_1857_++) {
			    int i_1858_ = is_1856_[i_1857_];
			    if (aShortArray9048 == null
				|| (i_1719_ & aShortArray9048[i_1858_]) != 0) {
				anIntArray9034[i_1858_] -= anInt9095;
				anIntArray9043[i_1858_] -= anInt9096;
				anIntArray9041[i_1858_] -= anInt9097;
				anIntArray9034[i_1858_]
				    = anIntArray9034[i_1858_] * i_1716_ >> 7;
				anIntArray9043[i_1858_]
				    = anIntArray9043[i_1858_] * i_1717_ >> 7;
				anIntArray9041[i_1858_]
				    = anIntArray9041[i_1858_] * i_1718_ >> 7;
				anIntArray9034[i_1858_] += anInt9095;
				anIntArray9043[i_1858_] += anInt9096;
				anIntArray9041[i_1858_] += anInt9097;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9073 != null) {
		for (int i_1859_ = 0; i_1859_ < i_1721_; i_1859_++) {
		    int i_1860_ = is[i_1859_];
		    if (i_1860_ < anIntArrayArray9073.length) {
			int[] is_1861_ = anIntArrayArray9073[i_1860_];
			for (int i_1862_ = 0; i_1862_ < is_1861_.length;
			     i_1862_++) {
			    int i_1863_ = is_1861_[i_1862_];
			    if (aShortArray9061 == null
				|| (i_1719_ & aShortArray9061[i_1863_]) != 0) {
				int i_1864_ = ((aByteArray9055[i_1863_] & 0xff)
					       + i_1716_ * 8);
				if (i_1864_ < 0)
				    i_1864_ = 0;
				else if (i_1864_ > 255)
				    i_1864_ = 255;
				aByteArray9055[i_1863_] = (byte) i_1864_;
				if (aClass129_9079 != null)
				    aClass129_9079.anInterface15_1519 = null;
			    }
			}
		    }
		}
		if (aClass149Array9087 != null) {
		    for (int i_1865_ = 0; i_1865_ < anInt9086; i_1865_++) {
			Class149 class149 = aClass149Array9087[i_1865_];
			Class133 class133 = aClass133Array9070[i_1865_];
			class133.anInt1585
			    = (class133.anInt1585 & 0xffffff
			       | 255 - (aByteArray9055[class149.anInt1687]
					& 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9073 != null) {
		for (int i_1866_ = 0; i_1866_ < i_1721_; i_1866_++) {
		    int i_1867_ = is[i_1866_];
		    if (i_1867_ < anIntArrayArray9073.length) {
			int[] is_1868_ = anIntArrayArray9073[i_1867_];
			for (int i_1869_ = 0; i_1869_ < is_1868_.length;
			     i_1869_++) {
			    int i_1870_ = is_1868_[i_1869_];
			    if (aShortArray9061 == null
				|| (i_1719_ & aShortArray9061[i_1870_]) != 0) {
				int i_1871_
				    = aShortArray9054[i_1870_] & 0xffff;
				int i_1872_ = i_1871_ >> 10 & 0x3f;
				int i_1873_ = i_1871_ >> 7 & 0x7;
				int i_1874_ = i_1871_ & 0x7f;
				i_1872_ = i_1872_ + i_1716_ & 0x3f;
				i_1873_ += i_1717_ / 4;
				if (i_1873_ < 0)
				    i_1873_ = 0;
				else if (i_1873_ > 7)
				    i_1873_ = 7;
				i_1874_ += i_1718_;
				if (i_1874_ < 0)
				    i_1874_ = 0;
				else if (i_1874_ > 127)
				    i_1874_ = 127;
				aShortArray9054[i_1870_]
				    = (short) (i_1872_ << 10 | i_1873_ << 7
					       | i_1874_);
				if (aClass129_9079 != null)
				    aClass129_9079.anInterface15_1519 = null;
			    }
			}
		    }
		}
		if (aClass149Array9087 != null) {
		    for (int i_1875_ = 0; i_1875_ < anInt9086; i_1875_++) {
			Class149 class149 = aClass149Array9087[i_1875_];
			Class133 class133 = aClass133Array9070[i_1875_];
			class133.anInt1585
			    = (class133.anInt1585 & ~0xffffff
			       | (Class661.anIntArray8549
				  [(aShortArray9054[class149.anInt1687]
				    & 0xffff)]) & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9089 != null) {
		for (int i_1876_ = 0; i_1876_ < i_1721_; i_1876_++) {
		    int i_1877_ = is[i_1876_];
		    if (i_1877_ < anIntArrayArray9089.length) {
			int[] is_1878_ = anIntArrayArray9089[i_1877_];
			for (int i_1879_ = 0; i_1879_ < is_1878_.length;
			     i_1879_++) {
			    Class133 class133
				= aClass133Array9070[is_1878_[i_1879_]];
			    class133.anInt1584 += i_1716_;
			    class133.anInt1583 += i_1717_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9089 != null) {
		for (int i_1880_ = 0; i_1880_ < i_1721_; i_1880_++) {
		    int i_1881_ = is[i_1880_];
		    if (i_1881_ < anIntArrayArray9089.length) {
			int[] is_1882_ = anIntArrayArray9089[i_1881_];
			for (int i_1883_ = 0; i_1883_ < is_1882_.length;
			     i_1883_++) {
			    Class133 class133
				= aClass133Array9070[is_1882_[i_1883_]];
			    class133.anInt1582
				= class133.anInt1582 * i_1716_ >> 7;
			    class133.anInt1581
				= class133.anInt1581 * i_1717_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9089 != null) {
		for (int i_1884_ = 0; i_1884_ < i_1721_; i_1884_++) {
		    int i_1885_ = is[i_1884_];
		    if (i_1885_ < anIntArrayArray9089.length) {
			int[] is_1886_ = anIntArrayArray9089[i_1885_];
			for (int i_1887_ = 0; i_1887_ < is_1886_.length;
			     i_1887_++) {
			    Class133 class133
				= aClass133Array9070[is_1886_[i_1887_]];
			    class133.anInt1586
				= class133.anInt1586 + i_1716_ & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    public int method3136() {
	if (!aBool9075)
	    method14533();
	return aShort9074;
    }
    
    public void method3105(Class446 class446, int i, boolean bool) {
	if (aShortArray9048 != null) {
	    Class446 class446_1888_ = class446;
	    if (bool) {
		class446_1888_ = aClass185_Sub3_9029.aClass446_9618;
		class446_1888_.method7242(class446);
	    }
	    float[] fs = new float[3];
	    for (int i_1889_ = 0; i_1889_ < anInt9057; i_1889_++) {
		if ((i & aShortArray9048[i_1889_]) != 0) {
		    class446_1888_.method7255((float) anIntArray9034[i_1889_],
					      (float) anIntArray9043[i_1889_],
					      (float) anIntArray9041[i_1889_],
					      fs);
		    anIntArray9034[i_1889_] = (int) fs[0];
		    anIntArray9043[i_1889_] = (int) fs[1];
		    anIntArray9041[i_1889_] = (int) fs[2];
		}
	    }
	}
    }
    
    public void method3025(int i, int i_1890_, int i_1891_) {
	for (int i_1892_ = 0; i_1892_ < anInt9057; i_1892_++) {
	    if (i != 128)
		anIntArray9034[i_1892_] = anIntArray9034[i_1892_] * i >> 7;
	    if (i_1890_ != 128)
		anIntArray9043[i_1892_]
		    = anIntArray9043[i_1892_] * i_1890_ >> 7;
	    if (i_1891_ != 128)
		anIntArray9041[i_1892_]
		    = anIntArray9041[i_1892_] * i_1891_ >> 7;
	}
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	aBool9075 = false;
    }
    
    public void method3154(short i, short i_1893_) {
	for (int i_1894_ = 0; i_1894_ < anInt9052; i_1894_++) {
	    if (aShortArray9054[i_1894_] == i)
		aShortArray9054[i_1894_] = i_1893_;
	}
	if (aClass149Array9087 != null) {
	    for (int i_1895_ = 0; i_1895_ < anInt9086; i_1895_++) {
		Class149 class149 = aClass149Array9087[i_1895_];
		Class133 class133 = aClass133Array9070[i_1895_];
		class133.anInt1585
		    = (class133.anInt1585 & ~0xffffff
		       | ((Class661.anIntArray8549
			   [aShortArray9054[class149.anInt1687] & 0xffff])
			  & 0xffffff));
	    }
	}
	if (aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
    }
    
    public boolean method3111(int i, int i_1896_, Class446 class446,
			      boolean bool, int i_1897_) {
	Class433 class433 = aClass185_Sub3_9029.aClass433_9530;
	class433.method6916(class446);
	class433.method6839(aClass185_Sub3_9029.aClass433_9607);
	boolean bool_1898_ = false;
	int i_1899_ = 2147483647;
	int i_1900_ = -2147483648;
	int i_1901_ = 2147483647;
	int i_1902_ = -2147483648;
	if (!aBool9075)
	    method14533();
	int i_1903_ = aShort9076 - aShort9033 >> 1;
	int i_1904_ = aShort9074 - aShort9072 >> 1;
	int i_1905_ = aShort9078 - aShort9077 >> 1;
	int i_1906_ = aShort9033 + i_1903_;
	int i_1907_ = aShort9072 + i_1904_;
	int i_1908_ = aShort9077 + i_1905_;
	int i_1909_ = i_1906_ - (i_1903_ << i_1897_);
	int i_1910_ = i_1907_ - (i_1904_ << i_1897_);
	int i_1911_ = i_1908_ - (i_1905_ << i_1897_);
	int i_1912_ = i_1906_ + (i_1903_ << i_1897_);
	int i_1913_ = i_1907_ + (i_1904_ << i_1897_);
	int i_1914_ = i_1908_ + (i_1905_ << i_1897_);
	anIntArray9092[0] = i_1909_;
	anIntArray9027[0] = i_1910_;
	anIntArray9094[0] = i_1911_;
	anIntArray9092[1] = i_1912_;
	anIntArray9027[1] = i_1910_;
	anIntArray9094[1] = i_1911_;
	anIntArray9092[2] = i_1909_;
	anIntArray9027[2] = i_1913_;
	anIntArray9094[2] = i_1911_;
	anIntArray9092[3] = i_1912_;
	anIntArray9027[3] = i_1913_;
	anIntArray9094[3] = i_1911_;
	anIntArray9092[4] = i_1909_;
	anIntArray9027[4] = i_1910_;
	anIntArray9094[4] = i_1914_;
	anIntArray9092[5] = i_1912_;
	anIntArray9027[5] = i_1910_;
	anIntArray9094[5] = i_1914_;
	anIntArray9092[6] = i_1909_;
	anIntArray9027[6] = i_1913_;
	anIntArray9094[6] = i_1914_;
	anIntArray9092[7] = i_1912_;
	anIntArray9027[7] = i_1913_;
	anIntArray9094[7] = i_1914_;
	for (int i_1915_ = 0; i_1915_ < 8; i_1915_++) {
	    int i_1916_ = anIntArray9092[i_1915_];
	    int i_1917_ = anIntArray9027[i_1915_];
	    int i_1918_ = anIntArray9094[i_1915_];
	    float f = (class433.aFloatArray4853[2] * (float) i_1916_
		       + class433.aFloatArray4853[6] * (float) i_1917_
		       + class433.aFloatArray4853[10] * (float) i_1918_
		       + class433.aFloatArray4853[14]);
	    float f_1919_ = (class433.aFloatArray4853[3] * (float) i_1916_
			     + class433.aFloatArray4853[7] * (float) i_1917_
			     + class433.aFloatArray4853[11] * (float) i_1918_
			     + class433.aFloatArray4853[15]);
	    if (f >= -f_1919_) {
		float f_1920_
		    = (class433.aFloatArray4853[0] * (float) i_1916_
		       + class433.aFloatArray4853[4] * (float) i_1917_
		       + class433.aFloatArray4853[8] * (float) i_1918_
		       + class433.aFloatArray4853[12]);
		float f_1921_
		    = (class433.aFloatArray4853[1] * (float) i_1916_
		       + class433.aFloatArray4853[5] * (float) i_1917_
		       + class433.aFloatArray4853[9] * (float) i_1918_
		       + class433.aFloatArray4853[13]);
		int i_1922_ = (int) (aClass185_Sub3_9029.aFloat9610
				     + (aClass185_Sub3_9029.aFloat9663
					* f_1920_ / f_1919_));
		int i_1923_ = (int) (aClass185_Sub3_9029.aFloat9612
				     + (aClass185_Sub3_9029.aFloat9613
					* f_1921_ / f_1919_));
		if (i_1922_ < i_1899_)
		    i_1899_ = i_1922_;
		if (i_1922_ > i_1900_)
		    i_1900_ = i_1922_;
		if (i_1923_ < i_1901_)
		    i_1901_ = i_1923_;
		if (i_1923_ > i_1902_)
		    i_1902_ = i_1923_;
		bool_1898_ = true;
	    }
	}
	if (bool_1898_ && i > i_1899_ && i < i_1900_ && i_1896_ > i_1901_
	    && i_1896_ < i_1902_) {
	    if (bool)
		return true;
	    if (aClass185_Sub3_9029.anIntArray9717.length < anInt9044) {
		aClass185_Sub3_9029.anIntArray9717 = new int[anInt9044];
		aClass185_Sub3_9029.anIntArray9718 = new int[anInt9044];
	    }
	    int[] is = aClass185_Sub3_9029.anIntArray9717;
	    int[] is_1924_ = aClass185_Sub3_9029.anIntArray9718;
	    for (int i_1925_ = 0; i_1925_ < anInt9057; i_1925_++) {
		int i_1926_ = anIntArray9034[i_1925_];
		int i_1927_ = anIntArray9043[i_1925_];
		int i_1928_ = anIntArray9041[i_1925_];
		float f = (class433.aFloatArray4853[2] * (float) i_1926_
			   + class433.aFloatArray4853[6] * (float) i_1927_
			   + class433.aFloatArray4853[10] * (float) i_1928_
			   + class433.aFloatArray4853[14]);
		float f_1929_
		    = (class433.aFloatArray4853[3] * (float) i_1926_
		       + class433.aFloatArray4853[7] * (float) i_1927_
		       + class433.aFloatArray4853[11] * (float) i_1928_
		       + class433.aFloatArray4853[15]);
		if (f >= -f_1929_) {
		    float f_1930_
			= (class433.aFloatArray4853[0] * (float) i_1926_
			   + class433.aFloatArray4853[4] * (float) i_1927_
			   + class433.aFloatArray4853[8] * (float) i_1928_
			   + class433.aFloatArray4853[12]);
		    float f_1931_
			= (class433.aFloatArray4853[1] * (float) i_1926_
			   + class433.aFloatArray4853[5] * (float) i_1927_
			   + class433.aFloatArray4853[9] * (float) i_1928_
			   + class433.aFloatArray4853[13]);
		    int i_1932_ = anIntArray9082[i_1925_];
		    int i_1933_ = anIntArray9082[i_1925_ + 1];
		    for (int i_1934_ = i_1932_;
			 i_1934_ < i_1933_ && aShortArray9083[i_1934_] != 0;
			 i_1934_++) {
			int i_1935_ = (aShortArray9083[i_1934_] & 0xffff) - 1;
			is[i_1935_] = (int) (aClass185_Sub3_9029.aFloat9610
					     + (aClass185_Sub3_9029.aFloat9663
						* f_1930_ / f_1929_));
			is_1924_[i_1935_]
			    = (int) (aClass185_Sub3_9029.aFloat9612
				     + (aClass185_Sub3_9029.aFloat9613
					* f_1931_ / f_1929_));
		    }
		} else {
		    int i_1936_ = anIntArray9082[i_1925_];
		    int i_1937_ = anIntArray9082[i_1925_ + 1];
		    for (int i_1938_ = i_1936_;
			 i_1938_ < i_1937_ && aShortArray9083[i_1938_] != 0;
			 i_1938_++) {
			int i_1939_ = (aShortArray9083[i_1938_] & 0xffff) - 1;
			is[i_1939_] = -999999;
		    }
		}
	    }
	    for (int i_1940_ = 0; i_1940_ < anInt9052; i_1940_++) {
		if (is[aShortArray9056[i_1940_] & 0xffff] != -999999
		    && is[aShortArray9031[i_1940_] & 0xffff] != -999999
		    && is[aShortArray9058[i_1940_] & 0xffff] != -999999
		    && method14545(i, i_1896_,
				   is_1924_[aShortArray9056[i_1940_] & 0xffff],
				   is_1924_[aShortArray9031[i_1940_] & 0xffff],
				   is_1924_[aShortArray9058[i_1940_] & 0xffff],
				   is[aShortArray9056[i_1940_] & 0xffff],
				   is[aShortArray9031[i_1940_] & 0xffff],
				   is[aShortArray9058[i_1940_] & 0xffff]))
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method3108(int i, int i_1941_, Class446 class446,
			      boolean bool, int i_1942_) {
	Class433 class433 = aClass185_Sub3_9029.aClass433_9530;
	class433.method6916(class446);
	class433.method6839(aClass185_Sub3_9029.aClass433_9607);
	boolean bool_1943_ = false;
	int i_1944_ = 2147483647;
	int i_1945_ = -2147483648;
	int i_1946_ = 2147483647;
	int i_1947_ = -2147483648;
	if (!aBool9075)
	    method14533();
	int i_1948_ = aShort9076 - aShort9033 >> 1;
	int i_1949_ = aShort9074 - aShort9072 >> 1;
	int i_1950_ = aShort9078 - aShort9077 >> 1;
	int i_1951_ = aShort9033 + i_1948_;
	int i_1952_ = aShort9072 + i_1949_;
	int i_1953_ = aShort9077 + i_1950_;
	int i_1954_ = i_1951_ - (i_1948_ << i_1942_);
	int i_1955_ = i_1952_ - (i_1949_ << i_1942_);
	int i_1956_ = i_1953_ - (i_1950_ << i_1942_);
	int i_1957_ = i_1951_ + (i_1948_ << i_1942_);
	int i_1958_ = i_1952_ + (i_1949_ << i_1942_);
	int i_1959_ = i_1953_ + (i_1950_ << i_1942_);
	anIntArray9092[0] = i_1954_;
	anIntArray9027[0] = i_1955_;
	anIntArray9094[0] = i_1956_;
	anIntArray9092[1] = i_1957_;
	anIntArray9027[1] = i_1955_;
	anIntArray9094[1] = i_1956_;
	anIntArray9092[2] = i_1954_;
	anIntArray9027[2] = i_1958_;
	anIntArray9094[2] = i_1956_;
	anIntArray9092[3] = i_1957_;
	anIntArray9027[3] = i_1958_;
	anIntArray9094[3] = i_1956_;
	anIntArray9092[4] = i_1954_;
	anIntArray9027[4] = i_1955_;
	anIntArray9094[4] = i_1959_;
	anIntArray9092[5] = i_1957_;
	anIntArray9027[5] = i_1955_;
	anIntArray9094[5] = i_1959_;
	anIntArray9092[6] = i_1954_;
	anIntArray9027[6] = i_1958_;
	anIntArray9094[6] = i_1959_;
	anIntArray9092[7] = i_1957_;
	anIntArray9027[7] = i_1958_;
	anIntArray9094[7] = i_1959_;
	for (int i_1960_ = 0; i_1960_ < 8; i_1960_++) {
	    int i_1961_ = anIntArray9092[i_1960_];
	    int i_1962_ = anIntArray9027[i_1960_];
	    int i_1963_ = anIntArray9094[i_1960_];
	    float f = (class433.aFloatArray4853[2] * (float) i_1961_
		       + class433.aFloatArray4853[6] * (float) i_1962_
		       + class433.aFloatArray4853[10] * (float) i_1963_
		       + class433.aFloatArray4853[14]);
	    float f_1964_ = (class433.aFloatArray4853[3] * (float) i_1961_
			     + class433.aFloatArray4853[7] * (float) i_1962_
			     + class433.aFloatArray4853[11] * (float) i_1963_
			     + class433.aFloatArray4853[15]);
	    if (f >= -f_1964_) {
		float f_1965_
		    = (class433.aFloatArray4853[0] * (float) i_1961_
		       + class433.aFloatArray4853[4] * (float) i_1962_
		       + class433.aFloatArray4853[8] * (float) i_1963_
		       + class433.aFloatArray4853[12]);
		float f_1966_
		    = (class433.aFloatArray4853[1] * (float) i_1961_
		       + class433.aFloatArray4853[5] * (float) i_1962_
		       + class433.aFloatArray4853[9] * (float) i_1963_
		       + class433.aFloatArray4853[13]);
		int i_1967_ = (int) (aClass185_Sub3_9029.aFloat9610
				     + (aClass185_Sub3_9029.aFloat9663
					* f_1965_ / f_1964_));
		int i_1968_ = (int) (aClass185_Sub3_9029.aFloat9612
				     + (aClass185_Sub3_9029.aFloat9613
					* f_1966_ / f_1964_));
		if (i_1967_ < i_1944_)
		    i_1944_ = i_1967_;
		if (i_1967_ > i_1945_)
		    i_1945_ = i_1967_;
		if (i_1968_ < i_1946_)
		    i_1946_ = i_1968_;
		if (i_1968_ > i_1947_)
		    i_1947_ = i_1968_;
		bool_1943_ = true;
	    }
	}
	if (bool_1943_ && i > i_1944_ && i < i_1945_ && i_1941_ > i_1946_
	    && i_1941_ < i_1947_) {
	    if (bool)
		return true;
	    if (aClass185_Sub3_9029.anIntArray9717.length < anInt9044) {
		aClass185_Sub3_9029.anIntArray9717 = new int[anInt9044];
		aClass185_Sub3_9029.anIntArray9718 = new int[anInt9044];
	    }
	    int[] is = aClass185_Sub3_9029.anIntArray9717;
	    int[] is_1969_ = aClass185_Sub3_9029.anIntArray9718;
	    for (int i_1970_ = 0; i_1970_ < anInt9057; i_1970_++) {
		int i_1971_ = anIntArray9034[i_1970_];
		int i_1972_ = anIntArray9043[i_1970_];
		int i_1973_ = anIntArray9041[i_1970_];
		float f = (class433.aFloatArray4853[2] * (float) i_1971_
			   + class433.aFloatArray4853[6] * (float) i_1972_
			   + class433.aFloatArray4853[10] * (float) i_1973_
			   + class433.aFloatArray4853[14]);
		float f_1974_
		    = (class433.aFloatArray4853[3] * (float) i_1971_
		       + class433.aFloatArray4853[7] * (float) i_1972_
		       + class433.aFloatArray4853[11] * (float) i_1973_
		       + class433.aFloatArray4853[15]);
		if (f >= -f_1974_) {
		    float f_1975_
			= (class433.aFloatArray4853[0] * (float) i_1971_
			   + class433.aFloatArray4853[4] * (float) i_1972_
			   + class433.aFloatArray4853[8] * (float) i_1973_
			   + class433.aFloatArray4853[12]);
		    float f_1976_
			= (class433.aFloatArray4853[1] * (float) i_1971_
			   + class433.aFloatArray4853[5] * (float) i_1972_
			   + class433.aFloatArray4853[9] * (float) i_1973_
			   + class433.aFloatArray4853[13]);
		    int i_1977_ = anIntArray9082[i_1970_];
		    int i_1978_ = anIntArray9082[i_1970_ + 1];
		    for (int i_1979_ = i_1977_;
			 i_1979_ < i_1978_ && aShortArray9083[i_1979_] != 0;
			 i_1979_++) {
			int i_1980_ = (aShortArray9083[i_1979_] & 0xffff) - 1;
			is[i_1980_] = (int) (aClass185_Sub3_9029.aFloat9610
					     + (aClass185_Sub3_9029.aFloat9663
						* f_1975_ / f_1974_));
			is_1969_[i_1980_]
			    = (int) (aClass185_Sub3_9029.aFloat9612
				     + (aClass185_Sub3_9029.aFloat9613
					* f_1976_ / f_1974_));
		    }
		} else {
		    int i_1981_ = anIntArray9082[i_1970_];
		    int i_1982_ = anIntArray9082[i_1970_ + 1];
		    for (int i_1983_ = i_1981_;
			 i_1983_ < i_1982_ && aShortArray9083[i_1983_] != 0;
			 i_1983_++) {
			int i_1984_ = (aShortArray9083[i_1983_] & 0xffff) - 1;
			is[i_1984_] = -999999;
		    }
		}
	    }
	    for (int i_1985_ = 0; i_1985_ < anInt9052; i_1985_++) {
		if (is[aShortArray9056[i_1985_] & 0xffff] != -999999
		    && is[aShortArray9031[i_1985_] & 0xffff] != -999999
		    && is[aShortArray9058[i_1985_] & 0xffff] != -999999
		    && method14545(i, i_1941_,
				   is_1969_[aShortArray9056[i_1985_] & 0xffff],
				   is_1969_[aShortArray9031[i_1985_] & 0xffff],
				   is_1969_[aShortArray9058[i_1985_] & 0xffff],
				   is[aShortArray9056[i_1985_] & 0xffff],
				   is[aShortArray9031[i_1985_] & 0xffff],
				   is[aShortArray9058[i_1985_] & 0xffff]))
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method3167(int i, int i_1986_, Class446 class446,
			      boolean bool, int i_1987_) {
	Class433 class433 = aClass185_Sub3_9029.aClass433_9530;
	class433.method6916(class446);
	class433.method6839(aClass185_Sub3_9029.aClass433_9607);
	boolean bool_1988_ = false;
	int i_1989_ = 2147483647;
	int i_1990_ = -2147483648;
	int i_1991_ = 2147483647;
	int i_1992_ = -2147483648;
	if (!aBool9075)
	    method14533();
	int i_1993_ = aShort9076 - aShort9033 >> 1;
	int i_1994_ = aShort9074 - aShort9072 >> 1;
	int i_1995_ = aShort9078 - aShort9077 >> 1;
	int i_1996_ = aShort9033 + i_1993_;
	int i_1997_ = aShort9072 + i_1994_;
	int i_1998_ = aShort9077 + i_1995_;
	int i_1999_ = i_1996_ - (i_1993_ << i_1987_);
	int i_2000_ = i_1997_ - (i_1994_ << i_1987_);
	int i_2001_ = i_1998_ - (i_1995_ << i_1987_);
	int i_2002_ = i_1996_ + (i_1993_ << i_1987_);
	int i_2003_ = i_1997_ + (i_1994_ << i_1987_);
	int i_2004_ = i_1998_ + (i_1995_ << i_1987_);
	anIntArray9092[0] = i_1999_;
	anIntArray9027[0] = i_2000_;
	anIntArray9094[0] = i_2001_;
	anIntArray9092[1] = i_2002_;
	anIntArray9027[1] = i_2000_;
	anIntArray9094[1] = i_2001_;
	anIntArray9092[2] = i_1999_;
	anIntArray9027[2] = i_2003_;
	anIntArray9094[2] = i_2001_;
	anIntArray9092[3] = i_2002_;
	anIntArray9027[3] = i_2003_;
	anIntArray9094[3] = i_2001_;
	anIntArray9092[4] = i_1999_;
	anIntArray9027[4] = i_2000_;
	anIntArray9094[4] = i_2004_;
	anIntArray9092[5] = i_2002_;
	anIntArray9027[5] = i_2000_;
	anIntArray9094[5] = i_2004_;
	anIntArray9092[6] = i_1999_;
	anIntArray9027[6] = i_2003_;
	anIntArray9094[6] = i_2004_;
	anIntArray9092[7] = i_2002_;
	anIntArray9027[7] = i_2003_;
	anIntArray9094[7] = i_2004_;
	for (int i_2005_ = 0; i_2005_ < 8; i_2005_++) {
	    int i_2006_ = anIntArray9092[i_2005_];
	    int i_2007_ = anIntArray9027[i_2005_];
	    int i_2008_ = anIntArray9094[i_2005_];
	    float f = (class433.aFloatArray4853[2] * (float) i_2006_
		       + class433.aFloatArray4853[6] * (float) i_2007_
		       + class433.aFloatArray4853[10] * (float) i_2008_
		       + class433.aFloatArray4853[14]);
	    float f_2009_ = (class433.aFloatArray4853[3] * (float) i_2006_
			     + class433.aFloatArray4853[7] * (float) i_2007_
			     + class433.aFloatArray4853[11] * (float) i_2008_
			     + class433.aFloatArray4853[15]);
	    if (f >= -f_2009_) {
		float f_2010_
		    = (class433.aFloatArray4853[0] * (float) i_2006_
		       + class433.aFloatArray4853[4] * (float) i_2007_
		       + class433.aFloatArray4853[8] * (float) i_2008_
		       + class433.aFloatArray4853[12]);
		float f_2011_
		    = (class433.aFloatArray4853[1] * (float) i_2006_
		       + class433.aFloatArray4853[5] * (float) i_2007_
		       + class433.aFloatArray4853[9] * (float) i_2008_
		       + class433.aFloatArray4853[13]);
		int i_2012_ = (int) (aClass185_Sub3_9029.aFloat9610
				     + (aClass185_Sub3_9029.aFloat9663
					* f_2010_ / f_2009_));
		int i_2013_ = (int) (aClass185_Sub3_9029.aFloat9612
				     + (aClass185_Sub3_9029.aFloat9613
					* f_2011_ / f_2009_));
		if (i_2012_ < i_1989_)
		    i_1989_ = i_2012_;
		if (i_2012_ > i_1990_)
		    i_1990_ = i_2012_;
		if (i_2013_ < i_1991_)
		    i_1991_ = i_2013_;
		if (i_2013_ > i_1992_)
		    i_1992_ = i_2013_;
		bool_1988_ = true;
	    }
	}
	if (bool_1988_ && i > i_1989_ && i < i_1990_ && i_1986_ > i_1991_
	    && i_1986_ < i_1992_) {
	    if (bool)
		return true;
	    if (aClass185_Sub3_9029.anIntArray9717.length < anInt9044) {
		aClass185_Sub3_9029.anIntArray9717 = new int[anInt9044];
		aClass185_Sub3_9029.anIntArray9718 = new int[anInt9044];
	    }
	    int[] is = aClass185_Sub3_9029.anIntArray9717;
	    int[] is_2014_ = aClass185_Sub3_9029.anIntArray9718;
	    for (int i_2015_ = 0; i_2015_ < anInt9057; i_2015_++) {
		int i_2016_ = anIntArray9034[i_2015_];
		int i_2017_ = anIntArray9043[i_2015_];
		int i_2018_ = anIntArray9041[i_2015_];
		float f = (class433.aFloatArray4853[2] * (float) i_2016_
			   + class433.aFloatArray4853[6] * (float) i_2017_
			   + class433.aFloatArray4853[10] * (float) i_2018_
			   + class433.aFloatArray4853[14]);
		float f_2019_
		    = (class433.aFloatArray4853[3] * (float) i_2016_
		       + class433.aFloatArray4853[7] * (float) i_2017_
		       + class433.aFloatArray4853[11] * (float) i_2018_
		       + class433.aFloatArray4853[15]);
		if (f >= -f_2019_) {
		    float f_2020_
			= (class433.aFloatArray4853[0] * (float) i_2016_
			   + class433.aFloatArray4853[4] * (float) i_2017_
			   + class433.aFloatArray4853[8] * (float) i_2018_
			   + class433.aFloatArray4853[12]);
		    float f_2021_
			= (class433.aFloatArray4853[1] * (float) i_2016_
			   + class433.aFloatArray4853[5] * (float) i_2017_
			   + class433.aFloatArray4853[9] * (float) i_2018_
			   + class433.aFloatArray4853[13]);
		    int i_2022_ = anIntArray9082[i_2015_];
		    int i_2023_ = anIntArray9082[i_2015_ + 1];
		    for (int i_2024_ = i_2022_;
			 i_2024_ < i_2023_ && aShortArray9083[i_2024_] != 0;
			 i_2024_++) {
			int i_2025_ = (aShortArray9083[i_2024_] & 0xffff) - 1;
			is[i_2025_] = (int) (aClass185_Sub3_9029.aFloat9610
					     + (aClass185_Sub3_9029.aFloat9663
						* f_2020_ / f_2019_));
			is_2014_[i_2025_]
			    = (int) (aClass185_Sub3_9029.aFloat9612
				     + (aClass185_Sub3_9029.aFloat9613
					* f_2021_ / f_2019_));
		    }
		} else {
		    int i_2026_ = anIntArray9082[i_2015_];
		    int i_2027_ = anIntArray9082[i_2015_ + 1];
		    for (int i_2028_ = i_2026_;
			 i_2028_ < i_2027_ && aShortArray9083[i_2028_] != 0;
			 i_2028_++) {
			int i_2029_ = (aShortArray9083[i_2028_] & 0xffff) - 1;
			is[i_2029_] = -999999;
		    }
		}
	    }
	    for (int i_2030_ = 0; i_2030_ < anInt9052; i_2030_++) {
		if (is[aShortArray9056[i_2030_] & 0xffff] != -999999
		    && is[aShortArray9031[i_2030_] & 0xffff] != -999999
		    && is[aShortArray9058[i_2030_] & 0xffff] != -999999
		    && method14545(i, i_1986_,
				   is_2014_[aShortArray9056[i_2030_] & 0xffff],
				   is_2014_[aShortArray9031[i_2030_] & 0xffff],
				   is_2014_[aShortArray9058[i_2030_] & 0xffff],
				   is[aShortArray9056[i_2030_] & 0xffff],
				   is[aShortArray9031[i_2030_] & 0xffff],
				   is[aShortArray9058[i_2030_] & 0xffff]))
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method3110(int i, int i_2031_, Class446 class446,
			      boolean bool, int i_2032_) {
	Class433 class433 = aClass185_Sub3_9029.aClass433_9530;
	class433.method6916(class446);
	class433.method6839(aClass185_Sub3_9029.aClass433_9607);
	boolean bool_2033_ = false;
	int i_2034_ = 2147483647;
	int i_2035_ = -2147483648;
	int i_2036_ = 2147483647;
	int i_2037_ = -2147483648;
	if (!aBool9075)
	    method14533();
	int i_2038_ = aShort9076 - aShort9033 >> 1;
	int i_2039_ = aShort9074 - aShort9072 >> 1;
	int i_2040_ = aShort9078 - aShort9077 >> 1;
	int i_2041_ = aShort9033 + i_2038_;
	int i_2042_ = aShort9072 + i_2039_;
	int i_2043_ = aShort9077 + i_2040_;
	int i_2044_ = i_2041_ - (i_2038_ << i_2032_);
	int i_2045_ = i_2042_ - (i_2039_ << i_2032_);
	int i_2046_ = i_2043_ - (i_2040_ << i_2032_);
	int i_2047_ = i_2041_ + (i_2038_ << i_2032_);
	int i_2048_ = i_2042_ + (i_2039_ << i_2032_);
	int i_2049_ = i_2043_ + (i_2040_ << i_2032_);
	anIntArray9092[0] = i_2044_;
	anIntArray9027[0] = i_2045_;
	anIntArray9094[0] = i_2046_;
	anIntArray9092[1] = i_2047_;
	anIntArray9027[1] = i_2045_;
	anIntArray9094[1] = i_2046_;
	anIntArray9092[2] = i_2044_;
	anIntArray9027[2] = i_2048_;
	anIntArray9094[2] = i_2046_;
	anIntArray9092[3] = i_2047_;
	anIntArray9027[3] = i_2048_;
	anIntArray9094[3] = i_2046_;
	anIntArray9092[4] = i_2044_;
	anIntArray9027[4] = i_2045_;
	anIntArray9094[4] = i_2049_;
	anIntArray9092[5] = i_2047_;
	anIntArray9027[5] = i_2045_;
	anIntArray9094[5] = i_2049_;
	anIntArray9092[6] = i_2044_;
	anIntArray9027[6] = i_2048_;
	anIntArray9094[6] = i_2049_;
	anIntArray9092[7] = i_2047_;
	anIntArray9027[7] = i_2048_;
	anIntArray9094[7] = i_2049_;
	for (int i_2050_ = 0; i_2050_ < 8; i_2050_++) {
	    int i_2051_ = anIntArray9092[i_2050_];
	    int i_2052_ = anIntArray9027[i_2050_];
	    int i_2053_ = anIntArray9094[i_2050_];
	    float f = (class433.aFloatArray4853[2] * (float) i_2051_
		       + class433.aFloatArray4853[6] * (float) i_2052_
		       + class433.aFloatArray4853[10] * (float) i_2053_
		       + class433.aFloatArray4853[14]);
	    float f_2054_ = (class433.aFloatArray4853[3] * (float) i_2051_
			     + class433.aFloatArray4853[7] * (float) i_2052_
			     + class433.aFloatArray4853[11] * (float) i_2053_
			     + class433.aFloatArray4853[15]);
	    if (f >= -f_2054_) {
		float f_2055_
		    = (class433.aFloatArray4853[0] * (float) i_2051_
		       + class433.aFloatArray4853[4] * (float) i_2052_
		       + class433.aFloatArray4853[8] * (float) i_2053_
		       + class433.aFloatArray4853[12]);
		float f_2056_
		    = (class433.aFloatArray4853[1] * (float) i_2051_
		       + class433.aFloatArray4853[5] * (float) i_2052_
		       + class433.aFloatArray4853[9] * (float) i_2053_
		       + class433.aFloatArray4853[13]);
		int i_2057_ = (int) (aClass185_Sub3_9029.aFloat9610
				     + (aClass185_Sub3_9029.aFloat9663
					* f_2055_ / f_2054_));
		int i_2058_ = (int) (aClass185_Sub3_9029.aFloat9612
				     + (aClass185_Sub3_9029.aFloat9613
					* f_2056_ / f_2054_));
		if (i_2057_ < i_2034_)
		    i_2034_ = i_2057_;
		if (i_2057_ > i_2035_)
		    i_2035_ = i_2057_;
		if (i_2058_ < i_2036_)
		    i_2036_ = i_2058_;
		if (i_2058_ > i_2037_)
		    i_2037_ = i_2058_;
		bool_2033_ = true;
	    }
	}
	if (bool_2033_ && i > i_2034_ && i < i_2035_ && i_2031_ > i_2036_
	    && i_2031_ < i_2037_) {
	    if (bool)
		return true;
	    if (aClass185_Sub3_9029.anIntArray9717.length < anInt9044) {
		aClass185_Sub3_9029.anIntArray9717 = new int[anInt9044];
		aClass185_Sub3_9029.anIntArray9718 = new int[anInt9044];
	    }
	    int[] is = aClass185_Sub3_9029.anIntArray9717;
	    int[] is_2059_ = aClass185_Sub3_9029.anIntArray9718;
	    for (int i_2060_ = 0; i_2060_ < anInt9057; i_2060_++) {
		int i_2061_ = anIntArray9034[i_2060_];
		int i_2062_ = anIntArray9043[i_2060_];
		int i_2063_ = anIntArray9041[i_2060_];
		float f = (class433.aFloatArray4853[2] * (float) i_2061_
			   + class433.aFloatArray4853[6] * (float) i_2062_
			   + class433.aFloatArray4853[10] * (float) i_2063_
			   + class433.aFloatArray4853[14]);
		float f_2064_
		    = (class433.aFloatArray4853[3] * (float) i_2061_
		       + class433.aFloatArray4853[7] * (float) i_2062_
		       + class433.aFloatArray4853[11] * (float) i_2063_
		       + class433.aFloatArray4853[15]);
		if (f >= -f_2064_) {
		    float f_2065_
			= (class433.aFloatArray4853[0] * (float) i_2061_
			   + class433.aFloatArray4853[4] * (float) i_2062_
			   + class433.aFloatArray4853[8] * (float) i_2063_
			   + class433.aFloatArray4853[12]);
		    float f_2066_
			= (class433.aFloatArray4853[1] * (float) i_2061_
			   + class433.aFloatArray4853[5] * (float) i_2062_
			   + class433.aFloatArray4853[9] * (float) i_2063_
			   + class433.aFloatArray4853[13]);
		    int i_2067_ = anIntArray9082[i_2060_];
		    int i_2068_ = anIntArray9082[i_2060_ + 1];
		    for (int i_2069_ = i_2067_;
			 i_2069_ < i_2068_ && aShortArray9083[i_2069_] != 0;
			 i_2069_++) {
			int i_2070_ = (aShortArray9083[i_2069_] & 0xffff) - 1;
			is[i_2070_] = (int) (aClass185_Sub3_9029.aFloat9610
					     + (aClass185_Sub3_9029.aFloat9663
						* f_2065_ / f_2064_));
			is_2059_[i_2070_]
			    = (int) (aClass185_Sub3_9029.aFloat9612
				     + (aClass185_Sub3_9029.aFloat9613
					* f_2066_ / f_2064_));
		    }
		} else {
		    int i_2071_ = anIntArray9082[i_2060_];
		    int i_2072_ = anIntArray9082[i_2060_ + 1];
		    for (int i_2073_ = i_2071_;
			 i_2073_ < i_2072_ && aShortArray9083[i_2073_] != 0;
			 i_2073_++) {
			int i_2074_ = (aShortArray9083[i_2073_] & 0xffff) - 1;
			is[i_2074_] = -999999;
		    }
		}
	    }
	    for (int i_2075_ = 0; i_2075_ < anInt9052; i_2075_++) {
		if (is[aShortArray9056[i_2075_] & 0xffff] != -999999
		    && is[aShortArray9031[i_2075_] & 0xffff] != -999999
		    && is[aShortArray9058[i_2075_] & 0xffff] != -999999
		    && method14545(i, i_2031_,
				   is_2059_[aShortArray9056[i_2075_] & 0xffff],
				   is_2059_[aShortArray9031[i_2075_] & 0xffff],
				   is_2059_[aShortArray9058[i_2075_] & 0xffff],
				   is[aShortArray9056[i_2075_] & 0xffff],
				   is[aShortArray9031[i_2075_] & 0xffff],
				   is[aShortArray9058[i_2075_] & 0xffff]))
		    return true;
	    }
	}
	return false;
    }
    
    Class183_Sub1(Class185_Sub3 class185_sub3) {
	anInt9044 = 0;
	anInt9052 = 0;
	anInt9053 = 0;
	aBool9093 = true;
	aBool9075 = false;
	aBool9038 = false;
	aClass185_Sub3_9029 = class185_sub3;
	aClass129_9062 = new Class129(null, 5126, 3, 0);
	aClass129_9091 = new Class129(null, 5126, 2, 0);
	aClass129_9064 = new Class129(null, 5126, 3, 0);
	aClass129_9079 = new Class129(null, 5121, 4, 0);
	aClass132_9066 = new Class132();
    }
    
    public boolean method3183(int i, int i_2076_, Class446 class446,
			      boolean bool, int i_2077_) {
	Class433 class433 = aClass185_Sub3_9029.aClass433_9530;
	class433.method6916(class446);
	class433.method6839(aClass185_Sub3_9029.aClass433_9607);
	boolean bool_2078_ = false;
	int i_2079_ = 2147483647;
	int i_2080_ = -2147483648;
	int i_2081_ = 2147483647;
	int i_2082_ = -2147483648;
	if (!aBool9075)
	    method14533();
	int i_2083_ = aShort9076 - aShort9033 >> 1;
	int i_2084_ = aShort9074 - aShort9072 >> 1;
	int i_2085_ = aShort9078 - aShort9077 >> 1;
	int i_2086_ = aShort9033 + i_2083_;
	int i_2087_ = aShort9072 + i_2084_;
	int i_2088_ = aShort9077 + i_2085_;
	int i_2089_ = i_2086_ - (i_2083_ << i_2077_);
	int i_2090_ = i_2087_ - (i_2084_ << i_2077_);
	int i_2091_ = i_2088_ - (i_2085_ << i_2077_);
	int i_2092_ = i_2086_ + (i_2083_ << i_2077_);
	int i_2093_ = i_2087_ + (i_2084_ << i_2077_);
	int i_2094_ = i_2088_ + (i_2085_ << i_2077_);
	anIntArray9092[0] = i_2089_;
	anIntArray9027[0] = i_2090_;
	anIntArray9094[0] = i_2091_;
	anIntArray9092[1] = i_2092_;
	anIntArray9027[1] = i_2090_;
	anIntArray9094[1] = i_2091_;
	anIntArray9092[2] = i_2089_;
	anIntArray9027[2] = i_2093_;
	anIntArray9094[2] = i_2091_;
	anIntArray9092[3] = i_2092_;
	anIntArray9027[3] = i_2093_;
	anIntArray9094[3] = i_2091_;
	anIntArray9092[4] = i_2089_;
	anIntArray9027[4] = i_2090_;
	anIntArray9094[4] = i_2094_;
	anIntArray9092[5] = i_2092_;
	anIntArray9027[5] = i_2090_;
	anIntArray9094[5] = i_2094_;
	anIntArray9092[6] = i_2089_;
	anIntArray9027[6] = i_2093_;
	anIntArray9094[6] = i_2094_;
	anIntArray9092[7] = i_2092_;
	anIntArray9027[7] = i_2093_;
	anIntArray9094[7] = i_2094_;
	for (int i_2095_ = 0; i_2095_ < 8; i_2095_++) {
	    int i_2096_ = anIntArray9092[i_2095_];
	    int i_2097_ = anIntArray9027[i_2095_];
	    int i_2098_ = anIntArray9094[i_2095_];
	    float f = (class433.aFloatArray4853[2] * (float) i_2096_
		       + class433.aFloatArray4853[6] * (float) i_2097_
		       + class433.aFloatArray4853[10] * (float) i_2098_
		       + class433.aFloatArray4853[14]);
	    float f_2099_ = (class433.aFloatArray4853[3] * (float) i_2096_
			     + class433.aFloatArray4853[7] * (float) i_2097_
			     + class433.aFloatArray4853[11] * (float) i_2098_
			     + class433.aFloatArray4853[15]);
	    if (f >= -f_2099_) {
		float f_2100_
		    = (class433.aFloatArray4853[0] * (float) i_2096_
		       + class433.aFloatArray4853[4] * (float) i_2097_
		       + class433.aFloatArray4853[8] * (float) i_2098_
		       + class433.aFloatArray4853[12]);
		float f_2101_
		    = (class433.aFloatArray4853[1] * (float) i_2096_
		       + class433.aFloatArray4853[5] * (float) i_2097_
		       + class433.aFloatArray4853[9] * (float) i_2098_
		       + class433.aFloatArray4853[13]);
		int i_2102_ = (int) (aClass185_Sub3_9029.aFloat9610
				     + (aClass185_Sub3_9029.aFloat9663
					* f_2100_ / f_2099_));
		int i_2103_ = (int) (aClass185_Sub3_9029.aFloat9612
				     + (aClass185_Sub3_9029.aFloat9613
					* f_2101_ / f_2099_));
		if (i_2102_ < i_2079_)
		    i_2079_ = i_2102_;
		if (i_2102_ > i_2080_)
		    i_2080_ = i_2102_;
		if (i_2103_ < i_2081_)
		    i_2081_ = i_2103_;
		if (i_2103_ > i_2082_)
		    i_2082_ = i_2103_;
		bool_2078_ = true;
	    }
	}
	if (bool_2078_ && i > i_2079_ && i < i_2080_ && i_2076_ > i_2081_
	    && i_2076_ < i_2082_) {
	    if (bool)
		return true;
	    if (aClass185_Sub3_9029.anIntArray9717.length < anInt9044) {
		aClass185_Sub3_9029.anIntArray9717 = new int[anInt9044];
		aClass185_Sub3_9029.anIntArray9718 = new int[anInt9044];
	    }
	    int[] is = aClass185_Sub3_9029.anIntArray9717;
	    int[] is_2104_ = aClass185_Sub3_9029.anIntArray9718;
	    for (int i_2105_ = 0; i_2105_ < anInt9057; i_2105_++) {
		int i_2106_ = anIntArray9034[i_2105_];
		int i_2107_ = anIntArray9043[i_2105_];
		int i_2108_ = anIntArray9041[i_2105_];
		float f = (class433.aFloatArray4853[2] * (float) i_2106_
			   + class433.aFloatArray4853[6] * (float) i_2107_
			   + class433.aFloatArray4853[10] * (float) i_2108_
			   + class433.aFloatArray4853[14]);
		float f_2109_
		    = (class433.aFloatArray4853[3] * (float) i_2106_
		       + class433.aFloatArray4853[7] * (float) i_2107_
		       + class433.aFloatArray4853[11] * (float) i_2108_
		       + class433.aFloatArray4853[15]);
		if (f >= -f_2109_) {
		    float f_2110_
			= (class433.aFloatArray4853[0] * (float) i_2106_
			   + class433.aFloatArray4853[4] * (float) i_2107_
			   + class433.aFloatArray4853[8] * (float) i_2108_
			   + class433.aFloatArray4853[12]);
		    float f_2111_
			= (class433.aFloatArray4853[1] * (float) i_2106_
			   + class433.aFloatArray4853[5] * (float) i_2107_
			   + class433.aFloatArray4853[9] * (float) i_2108_
			   + class433.aFloatArray4853[13]);
		    int i_2112_ = anIntArray9082[i_2105_];
		    int i_2113_ = anIntArray9082[i_2105_ + 1];
		    for (int i_2114_ = i_2112_;
			 i_2114_ < i_2113_ && aShortArray9083[i_2114_] != 0;
			 i_2114_++) {
			int i_2115_ = (aShortArray9083[i_2114_] & 0xffff) - 1;
			is[i_2115_] = (int) (aClass185_Sub3_9029.aFloat9610
					     + (aClass185_Sub3_9029.aFloat9663
						* f_2110_ / f_2109_));
			is_2104_[i_2115_]
			    = (int) (aClass185_Sub3_9029.aFloat9612
				     + (aClass185_Sub3_9029.aFloat9613
					* f_2111_ / f_2109_));
		    }
		} else {
		    int i_2116_ = anIntArray9082[i_2105_];
		    int i_2117_ = anIntArray9082[i_2105_ + 1];
		    for (int i_2118_ = i_2116_;
			 i_2118_ < i_2117_ && aShortArray9083[i_2118_] != 0;
			 i_2118_++) {
			int i_2119_ = (aShortArray9083[i_2118_] & 0xffff) - 1;
			is[i_2119_] = -999999;
		    }
		}
	    }
	    for (int i_2120_ = 0; i_2120_ < anInt9052; i_2120_++) {
		if (is[aShortArray9056[i_2120_] & 0xffff] != -999999
		    && is[aShortArray9031[i_2120_] & 0xffff] != -999999
		    && is[aShortArray9058[i_2120_] & 0xffff] != -999999
		    && method14545(i, i_2076_,
				   is_2104_[aShortArray9056[i_2120_] & 0xffff],
				   is_2104_[aShortArray9031[i_2120_] & 0xffff],
				   is_2104_[aShortArray9058[i_2120_] & 0xffff],
				   is[aShortArray9056[i_2120_] & 0xffff],
				   is[aShortArray9031[i_2120_] & 0xffff],
				   is[aShortArray9058[i_2120_] & 0xffff]))
		    return true;
	    }
	}
	return false;
    }
    
    Class183 method14549(Class183_Sub1 class183_sub1_2121_,
			 Class183_Sub1 class183_sub1_2122_, int i,
			 boolean bool, boolean bool_2123_) {
	class183_sub1_2121_.aByte9065 = (byte) 0;
	class183_sub1_2121_.anInt9030 = i;
	class183_sub1_2121_.anInt9088 = anInt9088;
	class183_sub1_2121_.aShort9040 = aShort9040;
	class183_sub1_2121_.aShort9046 = aShort9046;
	class183_sub1_2121_.anInt9037 = anInt9037;
	class183_sub1_2121_.anInt9057 = anInt9057;
	class183_sub1_2121_.anInt9044 = anInt9044;
	class183_sub1_2121_.anInt9052 = anInt9052;
	class183_sub1_2121_.anInt9053 = anInt9053;
	class183_sub1_2121_.anInt9086 = anInt9086;
	if ((i & 0x100) != 0)
	    class183_sub1_2121_.aBool9035 = true;
	else
	    class183_sub1_2121_.aBool9035 = aBool9035;
	class183_sub1_2121_.aBool9036 = aBool9036;
	boolean bool_2124_ = Class127.method2226(i, anInt9088);
	boolean bool_2125_ = Class127.method2196(i, anInt9088);
	boolean bool_2126_ = Class127.method2197(i, anInt9088);
	boolean bool_2127_ = bool_2124_ | bool_2125_ | bool_2126_;
	if (bool_2127_) {
	    if (bool_2124_) {
		if (class183_sub1_2122_.anIntArray9034 == null
		    || class183_sub1_2122_.anIntArray9034.length < anInt9037)
		    class183_sub1_2121_.anIntArray9034
			= class183_sub1_2122_.anIntArray9034
			= new int[anInt9037];
		else
		    class183_sub1_2121_.anIntArray9034
			= class183_sub1_2122_.anIntArray9034;
	    } else
		class183_sub1_2121_.anIntArray9034 = anIntArray9034;
	    if (bool_2125_) {
		if (class183_sub1_2122_.anIntArray9043 == null
		    || class183_sub1_2122_.anIntArray9043.length < anInt9037)
		    class183_sub1_2121_.anIntArray9043
			= class183_sub1_2122_.anIntArray9043
			= new int[anInt9037];
		else
		    class183_sub1_2121_.anIntArray9043
			= class183_sub1_2122_.anIntArray9043;
	    } else
		class183_sub1_2121_.anIntArray9043 = anIntArray9043;
	    if (bool_2126_) {
		if (class183_sub1_2122_.anIntArray9041 == null
		    || class183_sub1_2122_.anIntArray9041.length < anInt9037)
		    class183_sub1_2121_.anIntArray9041
			= class183_sub1_2122_.anIntArray9041
			= new int[anInt9037];
		else
		    class183_sub1_2121_.anIntArray9041
			= class183_sub1_2122_.anIntArray9041;
	    } else
		class183_sub1_2121_.anIntArray9041 = anIntArray9041;
	    for (int i_2128_ = 0; i_2128_ < anInt9037; i_2128_++) {
		if (bool_2124_)
		    class183_sub1_2121_.anIntArray9034[i_2128_]
			= anIntArray9034[i_2128_];
		if (bool_2125_)
		    class183_sub1_2121_.anIntArray9043[i_2128_]
			= anIntArray9043[i_2128_];
		if (bool_2126_)
		    class183_sub1_2121_.anIntArray9041[i_2128_]
			= anIntArray9041[i_2128_];
	    }
	} else {
	    class183_sub1_2121_.anIntArray9034 = anIntArray9034;
	    class183_sub1_2121_.anIntArray9043 = anIntArray9043;
	    class183_sub1_2121_.anIntArray9041 = anIntArray9041;
	}
	if (Class127.method2236(i, anInt9088)) {
	    if (bool)
		class183_sub1_2121_.aByte9065 |= 0x1;
	    class183_sub1_2121_.aClass129_9062
		= class183_sub1_2122_.aClass129_9062;
	    class183_sub1_2121_.aClass129_9062.aByte1518
		= aClass129_9062.aByte1518;
	    class183_sub1_2121_.aClass129_9062.anInterface15_1519
		= aClass129_9062.anInterface15_1519;
	} else if (Class127.method2207(i, anInt9088))
	    class183_sub1_2121_.aClass129_9062 = aClass129_9062;
	else
	    class183_sub1_2121_.aClass129_9062 = null;
	if (Class127.method2225(i, anInt9088)) {
	    if (class183_sub1_2122_.aShortArray9054 == null
		|| class183_sub1_2122_.aShortArray9054.length < anInt9052)
		class183_sub1_2121_.aShortArray9054
		    = class183_sub1_2122_.aShortArray9054
		    = new short[anInt9052];
	    else
		class183_sub1_2121_.aShortArray9054
		    = class183_sub1_2122_.aShortArray9054;
	    for (int i_2129_ = 0; i_2129_ < anInt9052; i_2129_++)
		class183_sub1_2121_.aShortArray9054[i_2129_]
		    = aShortArray9054[i_2129_];
	} else
	    class183_sub1_2121_.aShortArray9054 = aShortArray9054;
	if (Class127.method2201(i, anInt9088)) {
	    if (class183_sub1_2122_.aByteArray9055 == null
		|| class183_sub1_2122_.aByteArray9055.length < anInt9052)
		class183_sub1_2121_.aByteArray9055
		    = class183_sub1_2122_.aByteArray9055 = new byte[anInt9052];
	    else
		class183_sub1_2121_.aByteArray9055
		    = class183_sub1_2122_.aByteArray9055;
	    for (int i_2130_ = 0; i_2130_ < anInt9052; i_2130_++)
		class183_sub1_2121_.aByteArray9055[i_2130_]
		    = aByteArray9055[i_2130_];
	} else
	    class183_sub1_2121_.aByteArray9055 = aByteArray9055;
	if (Class127.method2212(i, anInt9088)) {
	    if (bool)
		class183_sub1_2121_.aByte9065 |= 0x2;
	    class183_sub1_2121_.aClass129_9079
		= class183_sub1_2122_.aClass129_9079;
	    class183_sub1_2121_.aClass129_9079.aByte1518
		= aClass129_9079.aByte1518;
	    class183_sub1_2121_.aClass129_9079.anInterface15_1519
		= aClass129_9079.anInterface15_1519;
	} else if (Class127.method2270(i, anInt9088))
	    class183_sub1_2121_.aClass129_9079 = aClass129_9079;
	else
	    class183_sub1_2121_.aClass129_9079 = null;
	if (Class127.method2241(i, anInt9088)) {
	    if (class183_sub1_2122_.aShortArray9045 == null
		|| class183_sub1_2122_.aShortArray9045.length < anInt9044) {
		int i_2131_ = anInt9044;
		class183_sub1_2121_.aShortArray9045
		    = class183_sub1_2122_.aShortArray9045 = new short[i_2131_];
		class183_sub1_2121_.aShortArray9042
		    = class183_sub1_2122_.aShortArray9042 = new short[i_2131_];
		class183_sub1_2121_.aShortArray9047
		    = class183_sub1_2122_.aShortArray9047 = new short[i_2131_];
	    } else {
		class183_sub1_2121_.aShortArray9045
		    = class183_sub1_2122_.aShortArray9045;
		class183_sub1_2121_.aShortArray9042
		    = class183_sub1_2122_.aShortArray9042;
		class183_sub1_2121_.aShortArray9047
		    = class183_sub1_2122_.aShortArray9047;
	    }
	    if (aClass152_9049 != null) {
		if (class183_sub1_2122_.aClass152_9049 == null)
		    class183_sub1_2122_.aClass152_9049 = new Class152();
		Class152 class152 = (class183_sub1_2121_.aClass152_9049
				     = class183_sub1_2122_.aClass152_9049);
		if (class152.aShortArray1708 == null
		    || class152.aShortArray1708.length < anInt9044) {
		    int i_2132_ = anInt9044;
		    class152.aShortArray1708 = new short[i_2132_];
		    class152.aShortArray1707 = new short[i_2132_];
		    class152.aShortArray1706 = new short[i_2132_];
		    class152.aByteArray1709 = new byte[i_2132_];
		}
		for (int i_2133_ = 0; i_2133_ < anInt9044; i_2133_++) {
		    class183_sub1_2121_.aShortArray9045[i_2133_]
			= aShortArray9045[i_2133_];
		    class183_sub1_2121_.aShortArray9042[i_2133_]
			= aShortArray9042[i_2133_];
		    class183_sub1_2121_.aShortArray9047[i_2133_]
			= aShortArray9047[i_2133_];
		    class152.aShortArray1708[i_2133_]
			= aClass152_9049.aShortArray1708[i_2133_];
		    class152.aShortArray1707[i_2133_]
			= aClass152_9049.aShortArray1707[i_2133_];
		    class152.aShortArray1706[i_2133_]
			= aClass152_9049.aShortArray1706[i_2133_];
		    class152.aByteArray1709[i_2133_]
			= aClass152_9049.aByteArray1709[i_2133_];
		}
	    } else {
		for (int i_2134_ = 0; i_2134_ < anInt9044; i_2134_++) {
		    class183_sub1_2121_.aShortArray9045[i_2134_]
			= aShortArray9045[i_2134_];
		    class183_sub1_2121_.aShortArray9042[i_2134_]
			= aShortArray9042[i_2134_];
		    class183_sub1_2121_.aShortArray9047[i_2134_]
			= aShortArray9047[i_2134_];
		}
	    }
	    class183_sub1_2121_.aByteArray9050 = aByteArray9050;
	} else {
	    class183_sub1_2121_.aClass152_9049 = aClass152_9049;
	    class183_sub1_2121_.aShortArray9045 = aShortArray9045;
	    class183_sub1_2121_.aShortArray9042 = aShortArray9042;
	    class183_sub1_2121_.aShortArray9047 = aShortArray9047;
	    class183_sub1_2121_.aByteArray9050 = aByteArray9050;
	}
	if (Class127.method2213(i, anInt9088)) {
	    if (bool)
		class183_sub1_2121_.aByte9065 |= 0x4;
	    class183_sub1_2121_.aClass129_9064
		= class183_sub1_2122_.aClass129_9064;
	    class183_sub1_2121_.aClass129_9064.aByte1518
		= aClass129_9064.aByte1518;
	    class183_sub1_2121_.aClass129_9064.anInterface15_1519
		= aClass129_9064.anInterface15_1519;
	} else if (Class127.method2293(i, anInt9088))
	    class183_sub1_2121_.aClass129_9064 = aClass129_9064;
	else
	    class183_sub1_2121_.aClass129_9064 = null;
	if (Class127.method2202(i, anInt9088)) {
	    if (class183_sub1_2122_.aFloatArray9022 == null
		|| class183_sub1_2122_.aFloatArray9022.length < anInt9052) {
		int i_2135_ = anInt9044;
		class183_sub1_2121_.aFloatArray9022
		    = class183_sub1_2122_.aFloatArray9022 = new float[i_2135_];
		class183_sub1_2121_.aFloatArray9051
		    = class183_sub1_2122_.aFloatArray9051 = new float[i_2135_];
	    } else {
		class183_sub1_2121_.aFloatArray9022
		    = class183_sub1_2122_.aFloatArray9022;
		class183_sub1_2121_.aFloatArray9051
		    = class183_sub1_2122_.aFloatArray9051;
	    }
	    for (int i_2136_ = 0; i_2136_ < anInt9044; i_2136_++) {
		class183_sub1_2121_.aFloatArray9022[i_2136_]
		    = aFloatArray9022[i_2136_];
		class183_sub1_2121_.aFloatArray9051[i_2136_]
		    = aFloatArray9051[i_2136_];
	    }
	} else {
	    class183_sub1_2121_.aFloatArray9022 = aFloatArray9022;
	    class183_sub1_2121_.aFloatArray9051 = aFloatArray9051;
	}
	if (Class127.method2198(i, anInt9088)) {
	    if (bool)
		class183_sub1_2121_.aByte9065 |= 0x8;
	    class183_sub1_2121_.aClass129_9091
		= class183_sub1_2122_.aClass129_9091;
	    class183_sub1_2121_.aClass129_9091.aByte1518
		= aClass129_9091.aByte1518;
	    class183_sub1_2121_.aClass129_9091.anInterface15_1519
		= aClass129_9091.anInterface15_1519;
	} else if (Class127.method2210(i, anInt9088))
	    class183_sub1_2121_.aClass129_9091 = aClass129_9091;
	else
	    class183_sub1_2121_.aClass129_9091 = null;
	if (Class127.method2203(i, anInt9088)) {
	    if (class183_sub1_2122_.aShortArray9056 == null
		|| class183_sub1_2122_.aShortArray9056.length < anInt9052) {
		int i_2137_ = anInt9052;
		class183_sub1_2121_.aShortArray9056
		    = class183_sub1_2122_.aShortArray9056 = new short[i_2137_];
		class183_sub1_2121_.aShortArray9031
		    = class183_sub1_2122_.aShortArray9031 = new short[i_2137_];
		class183_sub1_2121_.aShortArray9058
		    = class183_sub1_2122_.aShortArray9058 = new short[i_2137_];
	    } else {
		class183_sub1_2121_.aShortArray9056
		    = class183_sub1_2122_.aShortArray9056;
		class183_sub1_2121_.aShortArray9031
		    = class183_sub1_2122_.aShortArray9031;
		class183_sub1_2121_.aShortArray9058
		    = class183_sub1_2122_.aShortArray9058;
	    }
	    for (int i_2138_ = 0; i_2138_ < anInt9052; i_2138_++) {
		class183_sub1_2121_.aShortArray9056[i_2138_]
		    = aShortArray9056[i_2138_];
		class183_sub1_2121_.aShortArray9031[i_2138_]
		    = aShortArray9031[i_2138_];
		class183_sub1_2121_.aShortArray9058[i_2138_]
		    = aShortArray9058[i_2138_];
	    }
	} else {
	    class183_sub1_2121_.aShortArray9056 = aShortArray9056;
	    class183_sub1_2121_.aShortArray9031 = aShortArray9031;
	    class183_sub1_2121_.aShortArray9058 = aShortArray9058;
	}
	if (Class127.method2216(i, anInt9088)) {
	    if (bool)
		class183_sub1_2121_.aByte9065 |= 0x10;
	    class183_sub1_2121_.aClass132_9066
		= class183_sub1_2122_.aClass132_9066;
	    class183_sub1_2121_.aClass132_9066.anInterface16_1580
		= aClass132_9066.anInterface16_1580;
	} else if (Class127.method2257(i, anInt9088))
	    class183_sub1_2121_.aClass132_9066 = aClass132_9066;
	else
	    class183_sub1_2121_.aClass132_9066 = null;
	if (Class127.method2204(i, anInt9088)) {
	    if (class183_sub1_2122_.aShortArray9059 == null
		|| class183_sub1_2122_.aShortArray9059.length < anInt9052) {
		int i_2139_ = anInt9052;
		class183_sub1_2121_.aShortArray9059
		    = class183_sub1_2122_.aShortArray9059 = new short[i_2139_];
	    } else
		class183_sub1_2121_.aShortArray9059
		    = class183_sub1_2122_.aShortArray9059;
	    for (int i_2140_ = 0; i_2140_ < anInt9052; i_2140_++)
		class183_sub1_2121_.aShortArray9059[i_2140_]
		    = aShortArray9059[i_2140_];
	} else
	    class183_sub1_2121_.aShortArray9059 = aShortArray9059;
	if (Class127.method2222(i, anInt9088)) {
	    if (class183_sub1_2122_.aClass133Array9070 == null
		|| class183_sub1_2122_.aClass133Array9070.length < anInt9086) {
		int i_2141_ = anInt9086;
		class183_sub1_2121_.aClass133Array9070
		    = class183_sub1_2122_.aClass133Array9070
		    = new Class133[i_2141_];
		for (int i_2142_ = 0; i_2142_ < anInt9086; i_2142_++)
		    class183_sub1_2121_.aClass133Array9070[i_2142_]
			= aClass133Array9070[i_2142_].method2315();
	    } else {
		class183_sub1_2121_.aClass133Array9070
		    = class183_sub1_2122_.aClass133Array9070;
		for (int i_2143_ = 0; i_2143_ < anInt9086; i_2143_++)
		    class183_sub1_2121_.aClass133Array9070[i_2143_]
			.method2311(aClass133Array9070[i_2143_]);
	    }
	} else
	    class183_sub1_2121_.aClass133Array9070 = aClass133Array9070;
	class183_sub1_2121_.aClass149Array9087 = aClass149Array9087;
	if (aBool9075) {
	    class183_sub1_2121_.anInt9069 = anInt9069;
	    class183_sub1_2121_.anInt9023 = anInt9023;
	    class183_sub1_2121_.aShort9033 = aShort9033;
	    class183_sub1_2121_.aShort9076 = aShort9076;
	    class183_sub1_2121_.aShort9072 = aShort9072;
	    class183_sub1_2121_.aShort9074 = aShort9074;
	    class183_sub1_2121_.aShort9077 = aShort9077;
	    class183_sub1_2121_.aShort9078 = aShort9078;
	    class183_sub1_2121_.aBool9075 = true;
	} else
	    class183_sub1_2121_.aBool9075 = false;
	if (aBool9038) {
	    class183_sub1_2121_.aShort9080 = aShort9080;
	    class183_sub1_2121_.aBool9038 = true;
	} else
	    class183_sub1_2121_.aBool9038 = false;
	class183_sub1_2121_.anIntArrayArray9028 = anIntArrayArray9028;
	class183_sub1_2121_.anIntArrayArray9073 = anIntArrayArray9073;
	class183_sub1_2121_.anIntArrayArray9089 = anIntArrayArray9089;
	class183_sub1_2121_.aShortArray9083 = aShortArray9083;
	class183_sub1_2121_.anIntArray9082 = anIntArray9082;
	class183_sub1_2121_.aShortArray9048 = aShortArray9048;
	class183_sub1_2121_.aShortArray9061 = aShortArray9061;
	class183_sub1_2121_.anIntArray9060 = anIntArray9060;
	class183_sub1_2121_.aClass172Array9084 = aClass172Array9084;
	class183_sub1_2121_.aClass158Array9085 = aClass158Array9085;
	return class183_sub1_2121_;
    }
    
    public void method3215(Class446 class446) {
	Class433 class433 = aClass185_Sub3_9029.aClass433_9530;
	class433.method6916(class446);
	if (aClass172Array9084 != null) {
	    for (int i = 0; i < aClass172Array9084.length; i++) {
		Class172 class172 = aClass172Array9084[i];
		Class172 class172_2144_ = class172;
		if (class172.aClass172_1809 != null)
		    class172_2144_ = class172.aClass172_1809;
		class172_2144_.anInt1815
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9034[(class172.anInt1814
							    * 1404619919)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9043
					       [(class172.anInt1814
						 * 1404619919)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9041
					       [(class172.anInt1814
						 * 1404619919)]))))
		       * -697779603);
		class172_2144_.anInt1823
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9034
					    [class172.anInt1814 * 1404619919]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9043[(class172.anInt1814
							     * 1404619919)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9041
					      [(class172.anInt1814
						* 1404619919)])))) * 880720549;
		class172_2144_.anInt1817
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9034[(class172.anInt1814
							    * 1404619919)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9043
					       [(class172.anInt1814
						 * 1404619919)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9041
					       [(class172.anInt1814
						 * 1404619919)]))))
		       * -487629419);
		class172_2144_.anInt1818
		    = (int) (class433.aFloatArray4853[12]
			     + ((class433.aFloatArray4853[0]
				 * (float) (anIntArray9034
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[4]
				   * (float) anIntArray9043[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[8]
				   * (float) (anIntArray9041
					      [(class172.anInt1812
						* 496404005)])))) * 1861716229;
		class172_2144_.anInt1808
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9034
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9043[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9041
					      [(class172.anInt1812
						* 496404005)])))) * 968631629;
		class172_2144_.anInt1819
		    = (int) (class433.aFloatArray4853[14]
			     + ((class433.aFloatArray4853[2]
				 * (float) (anIntArray9034
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[6]
				   * (float) anIntArray9043[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[10]
				   * (float) (anIntArray9041
					      [(class172.anInt1812
						* 496404005)])))) * -337212495;
		class172_2144_.anInt1821
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9034[(class172.anInt1813
							    * 1123614299)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9043
					       [(class172.anInt1813
						 * 1123614299)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9041
					       [(class172.anInt1813
						 * 1123614299)]))))
		       * -289878931);
		class172_2144_.anInt1822
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9034
					    [class172.anInt1813 * 1123614299]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9043[(class172.anInt1813
							     * 1123614299)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9041
					      [(class172.anInt1813
						* 1123614299)])))) * 286740539;
		class172_2144_.anInt1820
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9034[(class172.anInt1813
							    * 1123614299)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9043
					       [(class172.anInt1813
						 * 1123614299)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9041
					       [(class172.anInt1813
						 * 1123614299)]))))
		       * -2010684097);
	    }
	}
	if (aClass158Array9085 != null) {
	    for (int i = 0; i < aClass158Array9085.length; i++) {
		Class158 class158 = aClass158Array9085[i];
		Class158 class158_2145_ = class158;
		if (class158.aClass158_1748 != null)
		    class158_2145_ = class158.aClass158_1748;
		if (class158.aClass433_1747 != null)
		    class158.aClass433_1747.method6842(class433);
		else
		    class158.aClass433_1747 = new Class433(class433);
		class158_2145_.anInt1750
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9034[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9043
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9041
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * 1976103833);
		class158_2145_.anInt1751
		    = ((int) (class433.aFloatArray4853[13]
			      + ((class433.aFloatArray4853[1]
				  * (float) anIntArray9034[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[5]
				    * (float) (anIntArray9043
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[9]
				    * (float) (anIntArray9041
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * 1216251817);
		class158_2145_.anInt1749
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9034[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9043
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9041
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * -1645064349);
	    }
	}
    }
    
    void method14550(boolean bool) {
	boolean bool_2146_ = (aClass129_9079 != null
			      && aClass129_9079.anInterface15_1519 == null);
	boolean bool_2147_ = (aClass129_9064 != null
			      && aClass129_9064.anInterface15_1519 == null);
	boolean bool_2148_ = (aClass129_9062 != null
			      && aClass129_9062.anInterface15_1519 == null);
	boolean bool_2149_ = (aClass129_9091 != null
			      && aClass129_9091.anInterface15_1519 == null);
	if (bool) {
	    bool_2146_ = bool_2146_ & (aByte9065 & 0x2) != 0;
	    bool_2147_ = bool_2147_ & (aByte9065 & 0x4) != 0;
	    bool_2148_ = bool_2148_ & (aByte9065 & 0x1) != 0;
	    bool_2149_ = bool_2149_ & (aByte9065 & 0x8) != 0;
	}
	byte i = 0;
	byte i_2150_ = 0;
	byte i_2151_ = 0;
	byte i_2152_ = 0;
	byte i_2153_ = 0;
	if (bool_2148_) {
	    i_2150_ = i;
	    i += 12;
	}
	if (bool_2146_) {
	    i_2151_ = i;
	    i += 4;
	}
	if (bool_2147_) {
	    i_2152_ = i;
	    i += 12;
	}
	if (bool_2149_) {
	    i_2153_ = i;
	    i += 8;
	}
	if (i != 0) {
	    if ((aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716
		 .aByteArray10810).length
		< anInt9044 * i)
		aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716
		    = new Class534_Sub40_Sub2((anInt9044 + 100) * i);
	    else
		aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716.anInt10811 = 0;
	    Class534_Sub40_Sub2 class534_sub40_sub2
		= aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716;
	    if (bool_2148_) {
		if (aClass185_Sub3_9029.aBool9566) {
		    for (int i_2154_ = 0; i_2154_ < anInt9057; i_2154_++) {
			int i_2155_
			    = Stream.floatToRawIntBits((float) anIntArray9034
							       [i_2154_]);
			int i_2156_
			    = Stream.floatToRawIntBits((float) anIntArray9043
							       [i_2154_]);
			int i_2157_
			    = Stream.floatToRawIntBits((float) anIntArray9041
							       [i_2154_]);
			int i_2158_ = anIntArray9082[i_2154_];
			int i_2159_ = anIntArray9082[i_2154_ + 1];
			for (int i_2160_ = i_2158_;
			     (i_2160_ < i_2159_
			      && aShortArray9083[i_2160_] != 0);
			     i_2160_++) {
			    int i_2161_
				= (aShortArray9083[i_2160_] & 0xffff) - 1;
			    class534_sub40_sub2.anInt10811
				= i_2161_ * i * -1387468933;
			    class534_sub40_sub2.method16510(i_2155_,
							    -1030829797);
			    class534_sub40_sub2.method16510(i_2156_,
							    -226759947);
			    class534_sub40_sub2.method16510(i_2157_,
							    -1570635329);
			}
		    }
		} else {
		    for (int i_2162_ = 0; i_2162_ < anInt9057; i_2162_++) {
			int i_2163_
			    = Stream.floatToRawIntBits((float) anIntArray9034
							       [i_2162_]);
			int i_2164_
			    = Stream.floatToRawIntBits((float) anIntArray9043
							       [i_2162_]);
			int i_2165_
			    = Stream.floatToRawIntBits((float) anIntArray9041
							       [i_2162_]);
			int i_2166_ = anIntArray9082[i_2162_];
			int i_2167_ = anIntArray9082[i_2162_ + 1];
			for (int i_2168_ = i_2166_;
			     (i_2168_ < i_2167_
			      && aShortArray9083[i_2168_] != 0);
			     i_2168_++) {
			    int i_2169_
				= (aShortArray9083[i_2168_] & 0xffff) - 1;
			    class534_sub40_sub2.anInt10811
				= i_2169_ * i * -1387468933;
			    class534_sub40_sub2.method16511(i_2163_,
							    -1700793042);
			    class534_sub40_sub2.method16511(i_2164_,
							    455896919);
			    class534_sub40_sub2.method16511(i_2165_,
							    -1479062533);
			}
		    }
		}
	    }
	    if (bool_2146_) {
		if (aClass129_9064 == null) {
		    short[] is;
		    short[] is_2170_;
		    short[] is_2171_;
		    byte[] is_2172_;
		    if (aClass152_9049 != null) {
			is = aClass152_9049.aShortArray1708;
			is_2170_ = aClass152_9049.aShortArray1707;
			is_2171_ = aClass152_9049.aShortArray1706;
			is_2172_ = aClass152_9049.aByteArray1709;
		    } else {
			is = aShortArray9045;
			is_2170_ = aShortArray9042;
			is_2171_ = aShortArray9047;
			is_2172_ = aByteArray9050;
		    }
		    float f = aClass185_Sub3_9029.aFloatArray9640[0];
		    float f_2173_ = aClass185_Sub3_9029.aFloatArray9640[1];
		    float f_2174_ = aClass185_Sub3_9029.aFloatArray9640[2];
		    float f_2175_ = aClass185_Sub3_9029.aFloat9646;
		    float f_2176_ = (aClass185_Sub3_9029.aFloat9686 * 768.0F
				     / (float) aShort9046);
		    float f_2177_ = (aClass185_Sub3_9029.aFloat9587 * 768.0F
				     / (float) aShort9046);
		    for (int i_2178_ = 0; i_2178_ < anInt9052; i_2178_++) {
			int i_2179_
			    = method14543(aShortArray9054[i_2178_],
					  aShortArray9059[i_2178_], aShort9040,
					  aByteArray9055[i_2178_]);
			float f_2180_ = ((float) (i_2179_ >>> 24)
					 * aClass185_Sub3_9029.aFloat9643);
			float f_2181_ = ((float) (i_2179_ >> 16 & 0xff)
					 * aClass185_Sub3_9029.aFloat9644);
			float f_2182_ = ((float) (i_2179_ >> 8 & 0xff)
					 * aClass185_Sub3_9029.aFloat9645);
			int i_2183_ = aShortArray9056[i_2178_] & 0xffff;
			short i_2184_ = (short) is_2172_[i_2183_];
			float f_2185_;
			if (i_2184_ == 0)
			    f_2185_ = ((f * (float) is[i_2183_]
					+ f_2173_ * (float) is_2170_[i_2183_]
					+ f_2174_ * (float) is_2171_[i_2183_])
				       * 0.0026041667F);
			else
			    f_2185_ = ((f * (float) is[i_2183_]
					+ f_2173_ * (float) is_2170_[i_2183_]
					+ f_2174_ * (float) is_2171_[i_2183_])
				       / (float) (i_2184_ * 256));
			float f_2186_
			    = f_2175_ + f_2185_ * (f_2185_ < 0.0F ? f_2177_
						   : f_2176_);
			int i_2187_ = (int) (f_2180_ * f_2186_);
			if (i_2187_ < 0)
			    i_2187_ = 0;
			else if (i_2187_ > 255)
			    i_2187_ = 255;
			int i_2188_ = (int) (f_2181_ * f_2186_);
			if (i_2188_ < 0)
			    i_2188_ = 0;
			else if (i_2188_ > 255)
			    i_2188_ = 255;
			int i_2189_ = (int) (f_2182_ * f_2186_);
			if (i_2189_ < 0)
			    i_2189_ = 0;
			else if (i_2189_ > 255)
			    i_2189_ = 255;
			class534_sub40_sub2.anInt10811
			    = (i_2151_ + i_2183_ * i) * -1387468933;
			class534_sub40_sub2.method16506(i_2187_, 894819683);
			class534_sub40_sub2.method16506(i_2188_, 1857741742);
			class534_sub40_sub2.method16506(i_2189_, 613432044);
			class534_sub40_sub2.method16506(255 - ((aByteArray9055
								[i_2178_])
							       & 0xff),
							330142149);
			i_2183_ = aShortArray9031[i_2178_] & 0xffff;
			i_2184_ = (short) is_2172_[i_2183_];
			if (i_2184_ == 0)
			    f_2185_ = ((f * (float) is[i_2183_]
					+ f_2173_ * (float) is_2170_[i_2183_]
					+ f_2174_ * (float) is_2171_[i_2183_])
				       * 0.0026041667F);
			else
			    f_2185_ = ((f * (float) is[i_2183_]
					+ f_2173_ * (float) is_2170_[i_2183_]
					+ f_2174_ * (float) is_2171_[i_2183_])
				       / (float) (i_2184_ * 256));
			f_2186_ = f_2175_ + f_2185_ * (f_2185_ < 0.0F ? f_2177_
						       : f_2176_);
			i_2187_ = (int) (f_2180_ * f_2186_);
			if (i_2187_ < 0)
			    i_2187_ = 0;
			else if (i_2187_ > 255)
			    i_2187_ = 255;
			i_2188_ = (int) (f_2181_ * f_2186_);
			if (i_2188_ < 0)
			    i_2188_ = 0;
			else if (i_2188_ > 255)
			    i_2188_ = 255;
			i_2189_ = (int) (f_2182_ * f_2186_);
			if (i_2189_ < 0)
			    i_2189_ = 0;
			else if (i_2189_ > 255)
			    i_2189_ = 255;
			class534_sub40_sub2.anInt10811
			    = (i_2151_ + i_2183_ * i) * -1387468933;
			class534_sub40_sub2.method16506(i_2187_, 2112097590);
			class534_sub40_sub2.method16506(i_2188_, 1986405477);
			class534_sub40_sub2.method16506(i_2189_, 1774774620);
			class534_sub40_sub2.method16506(255 - ((aByteArray9055
								[i_2178_])
							       & 0xff),
							913246947);
			i_2183_ = aShortArray9058[i_2178_] & 0xffff;
			i_2184_ = (short) is_2172_[i_2183_];
			if (i_2184_ == 0)
			    f_2185_ = ((f * (float) is[i_2183_]
					+ f_2173_ * (float) is_2170_[i_2183_]
					+ f_2174_ * (float) is_2171_[i_2183_])
				       * 0.0026041667F);
			else
			    f_2185_ = ((f * (float) is[i_2183_]
					+ f_2173_ * (float) is_2170_[i_2183_]
					+ f_2174_ * (float) is_2171_[i_2183_])
				       / (float) (i_2184_ * 256));
			f_2186_ = f_2175_ + f_2185_ * (f_2185_ < 0.0F ? f_2177_
						       : f_2176_);
			i_2187_ = (int) (f_2180_ * f_2186_);
			if (i_2187_ < 0)
			    i_2187_ = 0;
			else if (i_2187_ > 255)
			    i_2187_ = 255;
			i_2188_ = (int) (f_2181_ * f_2186_);
			if (i_2188_ < 0)
			    i_2188_ = 0;
			else if (i_2188_ > 255)
			    i_2188_ = 255;
			i_2189_ = (int) (f_2182_ * f_2186_);
			if (i_2189_ < 0)
			    i_2189_ = 0;
			else if (i_2189_ > 255)
			    i_2189_ = 255;
			class534_sub40_sub2.anInt10811
			    = (i_2151_ + i_2183_ * i) * -1387468933;
			class534_sub40_sub2.method16506(i_2187_, 704567687);
			class534_sub40_sub2.method16506(i_2188_, 719351117);
			class534_sub40_sub2.method16506(i_2189_, 656584254);
			class534_sub40_sub2.method16506(255 - ((aByteArray9055
								[i_2178_])
							       & 0xff),
							1971242733);
		    }
		} else {
		    for (int i_2190_ = 0; i_2190_ < anInt9052; i_2190_++) {
			int i_2191_
			    = method14543(aShortArray9054[i_2190_],
					  aShortArray9059[i_2190_], aShort9040,
					  aByteArray9055[i_2190_]);
			class534_sub40_sub2.anInt10811
			    = ((i_2151_
				+ (aShortArray9056[i_2190_] & 0xffff) * i)
			       * -1387468933);
			class534_sub40_sub2.method16510(i_2191_, -48140548);
			class534_sub40_sub2.anInt10811
			    = ((i_2151_
				+ (aShortArray9031[i_2190_] & 0xffff) * i)
			       * -1387468933);
			class534_sub40_sub2.method16510(i_2191_, -571545119);
			class534_sub40_sub2.anInt10811
			    = ((i_2151_
				+ (aShortArray9058[i_2190_] & 0xffff) * i)
			       * -1387468933);
			class534_sub40_sub2.method16510(i_2191_, -734999491);
		    }
		}
	    }
	    if (bool_2147_) {
		short[] is;
		short[] is_2192_;
		short[] is_2193_;
		byte[] is_2194_;
		if (aClass152_9049 != null) {
		    is = aClass152_9049.aShortArray1708;
		    is_2192_ = aClass152_9049.aShortArray1707;
		    is_2193_ = aClass152_9049.aShortArray1706;
		    is_2194_ = aClass152_9049.aByteArray1709;
		} else {
		    is = aShortArray9045;
		    is_2192_ = aShortArray9042;
		    is_2193_ = aShortArray9047;
		    is_2194_ = aByteArray9050;
		}
		float f = 3.0F / (float) aShort9046;
		float f_2195_ = 3.0F / (float) (aShort9046 + aShort9046 / 2);
		class534_sub40_sub2.anInt10811 = i_2152_ * -1387468933;
		if (aClass185_Sub3_9029.aBool9566) {
		    for (int i_2196_ = 0; i_2196_ < anInt9044; i_2196_++) {
			int i_2197_ = is_2194_[i_2196_] & 0xff;
			if (i_2197_ == 0) {
			    class534_sub40_sub2
				.method18397((float) is[i_2196_] * f_2195_);
			    class534_sub40_sub2.method18397((float) (is_2192_
								     [i_2196_])
							    * f_2195_);
			    class534_sub40_sub2.method18397((float) (is_2193_
								     [i_2196_])
							    * f_2195_);
			} else {
			    float f_2198_ = f / (float) i_2197_;
			    class534_sub40_sub2
				.method18397((float) is[i_2196_] * f_2198_);
			    class534_sub40_sub2.method18397((float) (is_2192_
								     [i_2196_])
							    * f_2198_);
			    class534_sub40_sub2.method18397((float) (is_2193_
								     [i_2196_])
							    * f_2198_);
			}
			class534_sub40_sub2.anInt10811
			    += (i - 12) * -1387468933;
		    }
		} else {
		    for (int i_2199_ = 0; i_2199_ < anInt9044; i_2199_++) {
			int i_2200_ = is_2194_[i_2199_] & 0xff;
			if (i_2200_ == 0) {
			    class534_sub40_sub2
				.method18400((float) is[i_2199_] * f_2195_);
			    class534_sub40_sub2.method18400((float) (is_2192_
								     [i_2199_])
							    * f_2195_);
			    class534_sub40_sub2.method18400((float) (is_2193_
								     [i_2199_])
							    * f_2195_);
			} else {
			    float f_2201_ = f / (float) i_2200_;
			    class534_sub40_sub2
				.method18400((float) is[i_2199_] * f_2201_);
			    class534_sub40_sub2.method18400((float) (is_2192_
								     [i_2199_])
							    * f_2201_);
			    class534_sub40_sub2.method18400((float) (is_2193_
								     [i_2199_])
							    * f_2201_);
			}
			class534_sub40_sub2.anInt10811
			    += (i - 12) * -1387468933;
		    }
		}
	    }
	    if (bool_2149_) {
		class534_sub40_sub2.anInt10811 = i_2153_ * -1387468933;
		if (aClass185_Sub3_9029.aBool9566) {
		    for (int i_2202_ = 0; i_2202_ < anInt9044; i_2202_++) {
			class534_sub40_sub2
			    .method18397(aFloatArray9022[i_2202_]);
			class534_sub40_sub2
			    .method18397(aFloatArray9051[i_2202_]);
			class534_sub40_sub2.anInt10811
			    += (i - 8) * -1387468933;
		    }
		} else {
		    for (int i_2203_ = 0; i_2203_ < anInt9044; i_2203_++) {
			class534_sub40_sub2
			    .method18400(aFloatArray9022[i_2203_]);
			class534_sub40_sub2
			    .method18400(aFloatArray9051[i_2203_]);
			class534_sub40_sub2.anInt10811
			    += (i - 8) * -1387468933;
		    }
		}
	    }
	    class534_sub40_sub2.anInt10811 = i * anInt9044 * -1387468933;
	    Interface15 interface15;
	    if (bool) {
		if (anInterface15_9068 == null)
		    anInterface15_9068
			= (aClass185_Sub3_9029.method15218
			   (i, class534_sub40_sub2.aByteArray10810,
			    class534_sub40_sub2.anInt10811 * 31645619, true));
		else
		    anInterface15_9068.method95(i,
						(class534_sub40_sub2
						 .aByteArray10810),
						(class534_sub40_sub2.anInt10811
						 * 31645619));
		interface15 = anInterface15_9068;
		aByte9065 = (byte) 0;
	    } else {
		interface15
		    = (aClass185_Sub3_9029.method15218
		       (i, class534_sub40_sub2.aByteArray10810,
			class534_sub40_sub2.anInt10811 * 31645619, false));
		aBool9093 = true;
	    }
	    if (bool_2148_) {
		aClass129_9062.anInterface15_1519 = interface15;
		aClass129_9062.aByte1518 = i_2150_;
	    }
	    if (bool_2149_) {
		aClass129_9091.anInterface15_1519 = interface15;
		aClass129_9091.aByte1518 = i_2153_;
	    }
	    if (bool_2146_) {
		aClass129_9079.anInterface15_1519 = interface15;
		aClass129_9079.aByte1518 = i_2151_;
	    }
	    if (bool_2147_) {
		aClass129_9064.anInterface15_1519 = interface15;
		aClass129_9064.aByte1518 = i_2152_;
	    }
	}
    }
    
    static short[] method14551(short[] is, int i) {
	short[] is_2204_ = new short[i];
	System.arraycopy(is, 0, is_2204_, 0, i);
	return is_2204_;
    }
    
    public Class534_Sub18_Sub16 method3117
	(Class534_Sub18_Sub16 class534_sub18_sub16) {
	if (anInt9044 == 0)
	    return null;
	if (!aBool9075)
	    method14533();
	int i;
	int i_2205_;
	if (aClass185_Sub3_9029.anInt9652 > 0) {
	    i = (aShort9033 - (aShort9074 * aClass185_Sub3_9029.anInt9652 >> 8)
		 >> aClass185_Sub3_9029.anInt9574);
	    i_2205_ = aShort9076 - (aShort9072 * aClass185_Sub3_9029.anInt9652
				    >> 8) >> aClass185_Sub3_9029.anInt9574;
	} else {
	    i = (aShort9033 - (aShort9072 * aClass185_Sub3_9029.anInt9652 >> 8)
		 >> aClass185_Sub3_9029.anInt9574);
	    i_2205_ = aShort9076 - (aShort9074 * aClass185_Sub3_9029.anInt9652
				    >> 8) >> aClass185_Sub3_9029.anInt9574;
	}
	int i_2206_;
	int i_2207_;
	if (aClass185_Sub3_9029.anInt9647 > 0) {
	    i_2206_ = aShort9077 - (aShort9074 * aClass185_Sub3_9029.anInt9647
				    >> 8) >> aClass185_Sub3_9029.anInt9574;
	    i_2207_ = aShort9078 - (aShort9072 * aClass185_Sub3_9029.anInt9647
				    >> 8) >> aClass185_Sub3_9029.anInt9574;
	} else {
	    i_2206_ = aShort9077 - (aShort9072 * aClass185_Sub3_9029.anInt9647
				    >> 8) >> aClass185_Sub3_9029.anInt9574;
	    i_2207_ = aShort9078 - (aShort9074 * aClass185_Sub3_9029.anInt9647
				    >> 8) >> aClass185_Sub3_9029.anInt9574;
	}
	int i_2208_ = i_2205_ - i + 1;
	int i_2209_ = i_2207_ - i_2206_ + 1;
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1
	    = (Class534_Sub18_Sub16_Sub1) class534_sub18_sub16;
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1_2210_;
	if (class534_sub18_sub16_sub1 != null
	    && class534_sub18_sub16_sub1.method18681(i_2208_, i_2209_)) {
	    class534_sub18_sub16_sub1_2210_ = class534_sub18_sub16_sub1;
	    class534_sub18_sub16_sub1_2210_.method18672();
	} else
	    class534_sub18_sub16_sub1_2210_
		= new Class534_Sub18_Sub16_Sub1(aClass185_Sub3_9029, i_2208_,
						i_2209_);
	class534_sub18_sub16_sub1_2210_.method18682(i, i_2206_, i_2205_,
						    i_2207_);
	method14538(class534_sub18_sub16_sub1_2210_);
	return class534_sub18_sub16_sub1_2210_;
    }
    
    public Class534_Sub18_Sub16 method3175
	(Class534_Sub18_Sub16 class534_sub18_sub16) {
	if (anInt9044 == 0)
	    return null;
	if (!aBool9075)
	    method14533();
	int i;
	int i_2211_;
	if (aClass185_Sub3_9029.anInt9652 > 0) {
	    i = (aShort9033 - (aShort9074 * aClass185_Sub3_9029.anInt9652 >> 8)
		 >> aClass185_Sub3_9029.anInt9574);
	    i_2211_ = aShort9076 - (aShort9072 * aClass185_Sub3_9029.anInt9652
				    >> 8) >> aClass185_Sub3_9029.anInt9574;
	} else {
	    i = (aShort9033 - (aShort9072 * aClass185_Sub3_9029.anInt9652 >> 8)
		 >> aClass185_Sub3_9029.anInt9574);
	    i_2211_ = aShort9076 - (aShort9074 * aClass185_Sub3_9029.anInt9652
				    >> 8) >> aClass185_Sub3_9029.anInt9574;
	}
	int i_2212_;
	int i_2213_;
	if (aClass185_Sub3_9029.anInt9647 > 0) {
	    i_2212_ = aShort9077 - (aShort9074 * aClass185_Sub3_9029.anInt9647
				    >> 8) >> aClass185_Sub3_9029.anInt9574;
	    i_2213_ = aShort9078 - (aShort9072 * aClass185_Sub3_9029.anInt9647
				    >> 8) >> aClass185_Sub3_9029.anInt9574;
	} else {
	    i_2212_ = aShort9077 - (aShort9072 * aClass185_Sub3_9029.anInt9647
				    >> 8) >> aClass185_Sub3_9029.anInt9574;
	    i_2213_ = aShort9078 - (aShort9074 * aClass185_Sub3_9029.anInt9647
				    >> 8) >> aClass185_Sub3_9029.anInt9574;
	}
	int i_2214_ = i_2211_ - i + 1;
	int i_2215_ = i_2213_ - i_2212_ + 1;
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1
	    = (Class534_Sub18_Sub16_Sub1) class534_sub18_sub16;
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1_2216_;
	if (class534_sub18_sub16_sub1 != null
	    && class534_sub18_sub16_sub1.method18681(i_2214_, i_2215_)) {
	    class534_sub18_sub16_sub1_2216_ = class534_sub18_sub16_sub1;
	    class534_sub18_sub16_sub1_2216_.method18672();
	} else
	    class534_sub18_sub16_sub1_2216_
		= new Class534_Sub18_Sub16_Sub1(aClass185_Sub3_9029, i_2214_,
						i_2215_);
	class534_sub18_sub16_sub1_2216_.method18682(i, i_2212_, i_2211_,
						    i_2213_);
	method14538(class534_sub18_sub16_sub1_2216_);
	return class534_sub18_sub16_sub1_2216_;
    }
    
    public void method3119() {
	if (!aBool9038) {
	    if (!aBool9075)
		method14533();
	    aShort9080 = aShort9072;
	    aBool9038 = true;
	}
    }
    
    void method14552() {
	int i = 32767;
	int i_2217_ = 32767;
	int i_2218_ = 32767;
	int i_2219_ = -32768;
	int i_2220_ = -32768;
	int i_2221_ = -32768;
	int i_2222_ = 0;
	int i_2223_ = 0;
	for (int i_2224_ = 0; i_2224_ < anInt9057; i_2224_++) {
	    int i_2225_ = anIntArray9034[i_2224_];
	    int i_2226_ = anIntArray9043[i_2224_];
	    int i_2227_ = anIntArray9041[i_2224_];
	    if (i_2225_ < i)
		i = i_2225_;
	    if (i_2225_ > i_2219_)
		i_2219_ = i_2225_;
	    if (i_2226_ < i_2217_)
		i_2217_ = i_2226_;
	    if (i_2226_ > i_2220_)
		i_2220_ = i_2226_;
	    if (i_2227_ < i_2218_)
		i_2218_ = i_2227_;
	    if (i_2227_ > i_2221_)
		i_2221_ = i_2227_;
	    int i_2228_ = i_2225_ * i_2225_ + i_2227_ * i_2227_;
	    if (i_2228_ > i_2222_)
		i_2222_ = i_2228_;
	    i_2228_
		= i_2225_ * i_2225_ + i_2227_ * i_2227_ + i_2226_ * i_2226_;
	    if (i_2228_ > i_2223_)
		i_2223_ = i_2228_;
	}
	aShort9033 = (short) i;
	aShort9076 = (short) i_2219_;
	aShort9072 = (short) i_2217_;
	aShort9074 = (short) i_2220_;
	aShort9077 = (short) i_2218_;
	aShort9078 = (short) i_2221_;
	anInt9023 = (int) (Math.sqrt((double) i_2222_) + 0.99);
	anInt9069 = (int) (Math.sqrt((double) i_2223_) + 0.99);
	aBool9075 = true;
    }
    
    void method3036() {
	for (int i = 0; i < anInt9037; i++) {
	    anIntArray9034[i] = anIntArray9034[i] + 7 >> 4;
	    anIntArray9043[i] = anIntArray9043[i] + 7 >> 4;
	    anIntArray9041[i] = anIntArray9041[i] + 7 >> 4;
	}
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	aBool9075 = false;
    }
    
    public int method3122() {
	if (!aBool9075)
	    method14533();
	return anInt9023;
    }
    
    public int method3123() {
	if (!aBool9075)
	    method14533();
	return anInt9023;
    }
    
    public int method3124() {
	if (!aBool9075)
	    method14533();
	return anInt9023;
    }
    
    public int method3125() {
	if (!aBool9075)
	    method14533();
	return anInt9023;
    }
    
    public int method3126() {
	if (!aBool9075)
	    method14533();
	return anInt9023;
    }
    
    void method3104(int i, int i_2229_, int i_2230_, int i_2231_) {
	if (i == 0) {
	    int i_2232_ = 0;
	    anInt9095 = 0;
	    anInt9096 = 0;
	    anInt9097 = 0;
	    for (int i_2233_ = 0; i_2233_ < anInt9057; i_2233_++) {
		anInt9095 += anIntArray9034[i_2233_];
		anInt9096 += anIntArray9043[i_2233_];
		anInt9097 += anIntArray9041[i_2233_];
		i_2232_++;
	    }
	    if (i_2232_ > 0) {
		anInt9095 = anInt9095 / i_2232_ + i_2229_;
		anInt9096 = anInt9096 / i_2232_ + i_2230_;
		anInt9097 = anInt9097 / i_2232_ + i_2231_;
	    } else {
		anInt9095 = i_2229_;
		anInt9096 = i_2230_;
		anInt9097 = i_2231_;
	    }
	} else if (i == 1) {
	    for (int i_2234_ = 0; i_2234_ < anInt9057; i_2234_++) {
		anIntArray9034[i_2234_] += i_2229_;
		anIntArray9043[i_2234_] += i_2230_;
		anIntArray9041[i_2234_] += i_2231_;
	    }
	} else if (i == 2) {
	    for (int i_2235_ = 0; i_2235_ < anInt9057; i_2235_++) {
		anIntArray9034[i_2235_] -= anInt9095;
		anIntArray9043[i_2235_] -= anInt9096;
		anIntArray9041[i_2235_] -= anInt9097;
		if (i_2231_ != 0) {
		    int i_2236_ = Class427.anIntArray4806[i_2231_];
		    int i_2237_ = Class427.anIntArray4805[i_2231_];
		    int i_2238_
			= ((anIntArray9043[i_2235_] * i_2236_
			    + anIntArray9034[i_2235_] * i_2237_ + 16383)
			   >> 14);
		    anIntArray9043[i_2235_]
			= (anIntArray9043[i_2235_] * i_2237_
			   - anIntArray9034[i_2235_] * i_2236_ + 16383) >> 14;
		    anIntArray9034[i_2235_] = i_2238_;
		}
		if (i_2229_ != 0) {
		    int i_2239_ = Class427.anIntArray4806[i_2229_];
		    int i_2240_ = Class427.anIntArray4805[i_2229_];
		    int i_2241_
			= ((anIntArray9043[i_2235_] * i_2240_
			    - anIntArray9041[i_2235_] * i_2239_ + 16383)
			   >> 14);
		    anIntArray9041[i_2235_]
			= (anIntArray9043[i_2235_] * i_2239_
			   + anIntArray9041[i_2235_] * i_2240_ + 16383) >> 14;
		    anIntArray9043[i_2235_] = i_2241_;
		}
		if (i_2230_ != 0) {
		    int i_2242_ = Class427.anIntArray4806[i_2230_];
		    int i_2243_ = Class427.anIntArray4805[i_2230_];
		    int i_2244_
			= ((anIntArray9041[i_2235_] * i_2242_
			    + anIntArray9034[i_2235_] * i_2243_ + 16383)
			   >> 14);
		    anIntArray9041[i_2235_]
			= (anIntArray9041[i_2235_] * i_2243_
			   - anIntArray9034[i_2235_] * i_2242_ + 16383) >> 14;
		    anIntArray9034[i_2235_] = i_2244_;
		}
		anIntArray9034[i_2235_] += anInt9095;
		anIntArray9043[i_2235_] += anInt9096;
		anIntArray9041[i_2235_] += anInt9097;
	    }
	} else if (i == 3) {
	    for (int i_2245_ = 0; i_2245_ < anInt9057; i_2245_++) {
		anIntArray9034[i_2245_] -= anInt9095;
		anIntArray9043[i_2245_] -= anInt9096;
		anIntArray9041[i_2245_] -= anInt9097;
		anIntArray9034[i_2245_]
		    = anIntArray9034[i_2245_] * i_2229_ / 128;
		anIntArray9043[i_2245_]
		    = anIntArray9043[i_2245_] * i_2230_ / 128;
		anIntArray9041[i_2245_]
		    = anIntArray9041[i_2245_] * i_2231_ / 128;
		anIntArray9034[i_2245_] += anInt9095;
		anIntArray9043[i_2245_] += anInt9096;
		anIntArray9041[i_2245_] += anInt9097;
	    }
	} else if (i == 5) {
	    for (int i_2246_ = 0; i_2246_ < anInt9052; i_2246_++) {
		int i_2247_ = (aByteArray9055[i_2246_] & 0xff) + i_2229_ * 8;
		if (i_2247_ < 0)
		    i_2247_ = 0;
		else if (i_2247_ > 255)
		    i_2247_ = 255;
		aByteArray9055[i_2246_] = (byte) i_2247_;
	    }
	    if (aClass129_9079 != null)
		aClass129_9079.anInterface15_1519 = null;
	    if (aClass149Array9087 != null) {
		for (int i_2248_ = 0; i_2248_ < anInt9086; i_2248_++) {
		    Class149 class149 = aClass149Array9087[i_2248_];
		    Class133 class133 = aClass133Array9070[i_2248_];
		    class133.anInt1585
			= (class133.anInt1585 & 0xffffff
			   | (255 - (aByteArray9055[class149.anInt1687] & 0xff)
			      << 24));
		}
	    }
	} else if (i == 7) {
	    for (int i_2249_ = 0; i_2249_ < anInt9052; i_2249_++) {
		int i_2250_ = aShortArray9054[i_2249_] & 0xffff;
		int i_2251_ = i_2250_ >> 10 & 0x3f;
		int i_2252_ = i_2250_ >> 7 & 0x7;
		int i_2253_ = i_2250_ & 0x7f;
		i_2251_ = i_2251_ + i_2229_ & 0x3f;
		i_2252_ += i_2230_ / 4;
		if (i_2252_ < 0)
		    i_2252_ = 0;
		else if (i_2252_ > 7)
		    i_2252_ = 7;
		i_2253_ += i_2231_;
		if (i_2253_ < 0)
		    i_2253_ = 0;
		else if (i_2253_ > 127)
		    i_2253_ = 127;
		aShortArray9054[i_2249_]
		    = (short) (i_2251_ << 10 | i_2252_ << 7 | i_2253_);
	    }
	    if (aClass129_9079 != null)
		aClass129_9079.anInterface15_1519 = null;
	    if (aClass149Array9087 != null) {
		for (int i_2254_ = 0; i_2254_ < anInt9086; i_2254_++) {
		    Class149 class149 = aClass149Array9087[i_2254_];
		    Class133 class133 = aClass133Array9070[i_2254_];
		    class133.anInt1585
			= (class133.anInt1585 & ~0xffffff
			   | ((Class661.anIntArray8549
			       [aShortArray9054[class149.anInt1687] & 0xffff])
			      & 0xffffff));
		}
	    }
	} else if (i == 8) {
	    for (int i_2255_ = 0; i_2255_ < anInt9086; i_2255_++) {
		Class133 class133 = aClass133Array9070[i_2255_];
		class133.anInt1584 += i_2229_;
		class133.anInt1583 += i_2230_;
	    }
	} else if (i == 10) {
	    for (int i_2256_ = 0; i_2256_ < anInt9086; i_2256_++) {
		Class133 class133 = aClass133Array9070[i_2256_];
		class133.anInt1582 = class133.anInt1582 * i_2229_ >> 7;
		class133.anInt1581 = class133.anInt1581 * i_2230_ >> 7;
	    }
	} else if (i == 9) {
	    for (int i_2257_ = 0; i_2257_ < anInt9086; i_2257_++) {
		Class133 class133 = aClass133Array9070[i_2257_];
		class133.anInt1586 = class133.anInt1586 + i_2229_ & 0x3fff;
	    }
	}
    }
    
    public int method3048() {
	if (!aBool9075)
	    method14533();
	return anInt9069;
    }
    
    public int method3129() {
	if (!aBool9075)
	    method14533();
	return anInt9069;
    }
    
    public int method3130() {
	if (!aBool9075)
	    method14533();
	return anInt9069;
    }
    
    public int method3131() {
	if (!aBool9075)
	    method14533();
	return aShort9076;
    }
    
    public void method3147(int i) {
	aShort9046 = (short) i;
	if (aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
	if (aClass129_9064 != null)
	    aClass129_9064.anInterface15_1519 = null;
    }
    
    public int method3026() {
	if (!aBool9075)
	    method14533();
	return aShort9076;
    }
    
    public int method3156() {
	if (!aBool9075)
	    method14533();
	return aShort9072;
    }
    
    public int method3064() {
	if (!aBool9075)
	    method14533();
	return aShort9072;
    }
    
    static short[] method14553(short[] is, int i) {
	short[] is_2258_ = new short[i];
	System.arraycopy(is, 0, is_2258_, 0, i);
	return is_2258_;
    }
    
    public int method3142() {
	if (!aBool9075)
	    method14533();
	return aShort9074;
    }
    
    public boolean method3039(int i, int i_2259_, Class446 class446,
			      boolean bool, int i_2260_) {
	Class433 class433 = aClass185_Sub3_9029.aClass433_9530;
	class433.method6916(class446);
	class433.method6839(aClass185_Sub3_9029.aClass433_9607);
	boolean bool_2261_ = false;
	int i_2262_ = 2147483647;
	int i_2263_ = -2147483648;
	int i_2264_ = 2147483647;
	int i_2265_ = -2147483648;
	if (!aBool9075)
	    method14533();
	int i_2266_ = aShort9076 - aShort9033 >> 1;
	int i_2267_ = aShort9074 - aShort9072 >> 1;
	int i_2268_ = aShort9078 - aShort9077 >> 1;
	int i_2269_ = aShort9033 + i_2266_;
	int i_2270_ = aShort9072 + i_2267_;
	int i_2271_ = aShort9077 + i_2268_;
	int i_2272_ = i_2269_ - (i_2266_ << i_2260_);
	int i_2273_ = i_2270_ - (i_2267_ << i_2260_);
	int i_2274_ = i_2271_ - (i_2268_ << i_2260_);
	int i_2275_ = i_2269_ + (i_2266_ << i_2260_);
	int i_2276_ = i_2270_ + (i_2267_ << i_2260_);
	int i_2277_ = i_2271_ + (i_2268_ << i_2260_);
	anIntArray9092[0] = i_2272_;
	anIntArray9027[0] = i_2273_;
	anIntArray9094[0] = i_2274_;
	anIntArray9092[1] = i_2275_;
	anIntArray9027[1] = i_2273_;
	anIntArray9094[1] = i_2274_;
	anIntArray9092[2] = i_2272_;
	anIntArray9027[2] = i_2276_;
	anIntArray9094[2] = i_2274_;
	anIntArray9092[3] = i_2275_;
	anIntArray9027[3] = i_2276_;
	anIntArray9094[3] = i_2274_;
	anIntArray9092[4] = i_2272_;
	anIntArray9027[4] = i_2273_;
	anIntArray9094[4] = i_2277_;
	anIntArray9092[5] = i_2275_;
	anIntArray9027[5] = i_2273_;
	anIntArray9094[5] = i_2277_;
	anIntArray9092[6] = i_2272_;
	anIntArray9027[6] = i_2276_;
	anIntArray9094[6] = i_2277_;
	anIntArray9092[7] = i_2275_;
	anIntArray9027[7] = i_2276_;
	anIntArray9094[7] = i_2277_;
	for (int i_2278_ = 0; i_2278_ < 8; i_2278_++) {
	    int i_2279_ = anIntArray9092[i_2278_];
	    int i_2280_ = anIntArray9027[i_2278_];
	    int i_2281_ = anIntArray9094[i_2278_];
	    float f = (class433.aFloatArray4853[2] * (float) i_2279_
		       + class433.aFloatArray4853[6] * (float) i_2280_
		       + class433.aFloatArray4853[10] * (float) i_2281_
		       + class433.aFloatArray4853[14]);
	    float f_2282_ = (class433.aFloatArray4853[3] * (float) i_2279_
			     + class433.aFloatArray4853[7] * (float) i_2280_
			     + class433.aFloatArray4853[11] * (float) i_2281_
			     + class433.aFloatArray4853[15]);
	    if (f >= -f_2282_) {
		float f_2283_
		    = (class433.aFloatArray4853[0] * (float) i_2279_
		       + class433.aFloatArray4853[4] * (float) i_2280_
		       + class433.aFloatArray4853[8] * (float) i_2281_
		       + class433.aFloatArray4853[12]);
		float f_2284_
		    = (class433.aFloatArray4853[1] * (float) i_2279_
		       + class433.aFloatArray4853[5] * (float) i_2280_
		       + class433.aFloatArray4853[9] * (float) i_2281_
		       + class433.aFloatArray4853[13]);
		int i_2285_ = (int) (aClass185_Sub3_9029.aFloat9610
				     + (aClass185_Sub3_9029.aFloat9663
					* f_2283_ / f_2282_));
		int i_2286_ = (int) (aClass185_Sub3_9029.aFloat9612
				     + (aClass185_Sub3_9029.aFloat9613
					* f_2284_ / f_2282_));
		if (i_2285_ < i_2262_)
		    i_2262_ = i_2285_;
		if (i_2285_ > i_2263_)
		    i_2263_ = i_2285_;
		if (i_2286_ < i_2264_)
		    i_2264_ = i_2286_;
		if (i_2286_ > i_2265_)
		    i_2265_ = i_2286_;
		bool_2261_ = true;
	    }
	}
	if (bool_2261_ && i > i_2262_ && i < i_2263_ && i_2259_ > i_2264_
	    && i_2259_ < i_2265_) {
	    if (bool)
		return true;
	    if (aClass185_Sub3_9029.anIntArray9717.length < anInt9044) {
		aClass185_Sub3_9029.anIntArray9717 = new int[anInt9044];
		aClass185_Sub3_9029.anIntArray9718 = new int[anInt9044];
	    }
	    int[] is = aClass185_Sub3_9029.anIntArray9717;
	    int[] is_2287_ = aClass185_Sub3_9029.anIntArray9718;
	    for (int i_2288_ = 0; i_2288_ < anInt9057; i_2288_++) {
		int i_2289_ = anIntArray9034[i_2288_];
		int i_2290_ = anIntArray9043[i_2288_];
		int i_2291_ = anIntArray9041[i_2288_];
		float f = (class433.aFloatArray4853[2] * (float) i_2289_
			   + class433.aFloatArray4853[6] * (float) i_2290_
			   + class433.aFloatArray4853[10] * (float) i_2291_
			   + class433.aFloatArray4853[14]);
		float f_2292_
		    = (class433.aFloatArray4853[3] * (float) i_2289_
		       + class433.aFloatArray4853[7] * (float) i_2290_
		       + class433.aFloatArray4853[11] * (float) i_2291_
		       + class433.aFloatArray4853[15]);
		if (f >= -f_2292_) {
		    float f_2293_
			= (class433.aFloatArray4853[0] * (float) i_2289_
			   + class433.aFloatArray4853[4] * (float) i_2290_
			   + class433.aFloatArray4853[8] * (float) i_2291_
			   + class433.aFloatArray4853[12]);
		    float f_2294_
			= (class433.aFloatArray4853[1] * (float) i_2289_
			   + class433.aFloatArray4853[5] * (float) i_2290_
			   + class433.aFloatArray4853[9] * (float) i_2291_
			   + class433.aFloatArray4853[13]);
		    int i_2295_ = anIntArray9082[i_2288_];
		    int i_2296_ = anIntArray9082[i_2288_ + 1];
		    for (int i_2297_ = i_2295_;
			 i_2297_ < i_2296_ && aShortArray9083[i_2297_] != 0;
			 i_2297_++) {
			int i_2298_ = (aShortArray9083[i_2297_] & 0xffff) - 1;
			is[i_2298_] = (int) (aClass185_Sub3_9029.aFloat9610
					     + (aClass185_Sub3_9029.aFloat9663
						* f_2293_ / f_2292_));
			is_2287_[i_2298_]
			    = (int) (aClass185_Sub3_9029.aFloat9612
				     + (aClass185_Sub3_9029.aFloat9613
					* f_2294_ / f_2292_));
		    }
		} else {
		    int i_2299_ = anIntArray9082[i_2288_];
		    int i_2300_ = anIntArray9082[i_2288_ + 1];
		    for (int i_2301_ = i_2299_;
			 i_2301_ < i_2300_ && aShortArray9083[i_2301_] != 0;
			 i_2301_++) {
			int i_2302_ = (aShortArray9083[i_2301_] & 0xffff) - 1;
			is[i_2302_] = -999999;
		    }
		}
	    }
	    for (int i_2303_ = 0; i_2303_ < anInt9052; i_2303_++) {
		if (is[aShortArray9056[i_2303_] & 0xffff] != -999999
		    && is[aShortArray9031[i_2303_] & 0xffff] != -999999
		    && is[aShortArray9058[i_2303_] & 0xffff] != -999999
		    && method14545(i, i_2259_,
				   is_2287_[aShortArray9056[i_2303_] & 0xffff],
				   is_2287_[aShortArray9031[i_2303_] & 0xffff],
				   is_2287_[aShortArray9058[i_2303_] & 0xffff],
				   is[aShortArray9056[i_2303_] & 0xffff],
				   is[aShortArray9031[i_2303_] & 0xffff],
				   is[aShortArray9058[i_2303_] & 0xffff]))
		    return true;
	    }
	}
	return false;
    }
    
    public int method3139() {
	if (!aBool9075)
	    method14533();
	return aShort9074;
    }
    
    void method14554(boolean bool) {
	boolean bool_2304_ = (aClass129_9079 != null
			      && aClass129_9079.anInterface15_1519 == null);
	boolean bool_2305_ = (aClass129_9064 != null
			      && aClass129_9064.anInterface15_1519 == null);
	boolean bool_2306_ = (aClass129_9062 != null
			      && aClass129_9062.anInterface15_1519 == null);
	boolean bool_2307_ = (aClass129_9091 != null
			      && aClass129_9091.anInterface15_1519 == null);
	if (bool) {
	    bool_2304_ = bool_2304_ & (aByte9065 & 0x2) != 0;
	    bool_2305_ = bool_2305_ & (aByte9065 & 0x4) != 0;
	    bool_2306_ = bool_2306_ & (aByte9065 & 0x1) != 0;
	    bool_2307_ = bool_2307_ & (aByte9065 & 0x8) != 0;
	}
	byte i = 0;
	byte i_2308_ = 0;
	byte i_2309_ = 0;
	byte i_2310_ = 0;
	byte i_2311_ = 0;
	if (bool_2306_) {
	    i_2308_ = i;
	    i += 12;
	}
	if (bool_2304_) {
	    i_2309_ = i;
	    i += 4;
	}
	if (bool_2305_) {
	    i_2310_ = i;
	    i += 12;
	}
	if (bool_2307_) {
	    i_2311_ = i;
	    i += 8;
	}
	if (i != 0) {
	    if ((aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716
		 .aByteArray10810).length
		< anInt9044 * i)
		aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716
		    = new Class534_Sub40_Sub2((anInt9044 + 100) * i);
	    else
		aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716.anInt10811 = 0;
	    Class534_Sub40_Sub2 class534_sub40_sub2
		= aClass185_Sub3_9029.aClass534_Sub40_Sub2_9716;
	    if (bool_2306_) {
		if (aClass185_Sub3_9029.aBool9566) {
		    for (int i_2312_ = 0; i_2312_ < anInt9057; i_2312_++) {
			int i_2313_
			    = Stream.floatToRawIntBits((float) anIntArray9034
							       [i_2312_]);
			int i_2314_
			    = Stream.floatToRawIntBits((float) anIntArray9043
							       [i_2312_]);
			int i_2315_
			    = Stream.floatToRawIntBits((float) anIntArray9041
							       [i_2312_]);
			int i_2316_ = anIntArray9082[i_2312_];
			int i_2317_ = anIntArray9082[i_2312_ + 1];
			for (int i_2318_ = i_2316_;
			     (i_2318_ < i_2317_
			      && aShortArray9083[i_2318_] != 0);
			     i_2318_++) {
			    int i_2319_
				= (aShortArray9083[i_2318_] & 0xffff) - 1;
			    class534_sub40_sub2.anInt10811
				= i_2319_ * i * -1387468933;
			    class534_sub40_sub2.method16510(i_2313_,
							    -1246927323);
			    class534_sub40_sub2.method16510(i_2314_,
							    -1474935688);
			    class534_sub40_sub2.method16510(i_2315_,
							    -1974532743);
			}
		    }
		} else {
		    for (int i_2320_ = 0; i_2320_ < anInt9057; i_2320_++) {
			int i_2321_
			    = Stream.floatToRawIntBits((float) anIntArray9034
							       [i_2320_]);
			int i_2322_
			    = Stream.floatToRawIntBits((float) anIntArray9043
							       [i_2320_]);
			int i_2323_
			    = Stream.floatToRawIntBits((float) anIntArray9041
							       [i_2320_]);
			int i_2324_ = anIntArray9082[i_2320_];
			int i_2325_ = anIntArray9082[i_2320_ + 1];
			for (int i_2326_ = i_2324_;
			     (i_2326_ < i_2325_
			      && aShortArray9083[i_2326_] != 0);
			     i_2326_++) {
			    int i_2327_
				= (aShortArray9083[i_2326_] & 0xffff) - 1;
			    class534_sub40_sub2.anInt10811
				= i_2327_ * i * -1387468933;
			    class534_sub40_sub2.method16511(i_2321_,
							    -618346298);
			    class534_sub40_sub2.method16511(i_2322_,
							    -1114451359);
			    class534_sub40_sub2.method16511(i_2323_,
							    -394828742);
			}
		    }
		}
	    }
	    if (bool_2304_) {
		if (aClass129_9064 == null) {
		    short[] is;
		    short[] is_2328_;
		    short[] is_2329_;
		    byte[] is_2330_;
		    if (aClass152_9049 != null) {
			is = aClass152_9049.aShortArray1708;
			is_2328_ = aClass152_9049.aShortArray1707;
			is_2329_ = aClass152_9049.aShortArray1706;
			is_2330_ = aClass152_9049.aByteArray1709;
		    } else {
			is = aShortArray9045;
			is_2328_ = aShortArray9042;
			is_2329_ = aShortArray9047;
			is_2330_ = aByteArray9050;
		    }
		    float f = aClass185_Sub3_9029.aFloatArray9640[0];
		    float f_2331_ = aClass185_Sub3_9029.aFloatArray9640[1];
		    float f_2332_ = aClass185_Sub3_9029.aFloatArray9640[2];
		    float f_2333_ = aClass185_Sub3_9029.aFloat9646;
		    float f_2334_ = (aClass185_Sub3_9029.aFloat9686 * 768.0F
				     / (float) aShort9046);
		    float f_2335_ = (aClass185_Sub3_9029.aFloat9587 * 768.0F
				     / (float) aShort9046);
		    for (int i_2336_ = 0; i_2336_ < anInt9052; i_2336_++) {
			int i_2337_
			    = method14543(aShortArray9054[i_2336_],
					  aShortArray9059[i_2336_], aShort9040,
					  aByteArray9055[i_2336_]);
			float f_2338_ = ((float) (i_2337_ >>> 24)
					 * aClass185_Sub3_9029.aFloat9643);
			float f_2339_ = ((float) (i_2337_ >> 16 & 0xff)
					 * aClass185_Sub3_9029.aFloat9644);
			float f_2340_ = ((float) (i_2337_ >> 8 & 0xff)
					 * aClass185_Sub3_9029.aFloat9645);
			int i_2341_ = aShortArray9056[i_2336_] & 0xffff;
			short i_2342_ = (short) is_2330_[i_2341_];
			float f_2343_;
			if (i_2342_ == 0)
			    f_2343_ = ((f * (float) is[i_2341_]
					+ f_2331_ * (float) is_2328_[i_2341_]
					+ f_2332_ * (float) is_2329_[i_2341_])
				       * 0.0026041667F);
			else
			    f_2343_ = ((f * (float) is[i_2341_]
					+ f_2331_ * (float) is_2328_[i_2341_]
					+ f_2332_ * (float) is_2329_[i_2341_])
				       / (float) (i_2342_ * 256));
			float f_2344_
			    = f_2333_ + f_2343_ * (f_2343_ < 0.0F ? f_2335_
						   : f_2334_);
			int i_2345_ = (int) (f_2338_ * f_2344_);
			if (i_2345_ < 0)
			    i_2345_ = 0;
			else if (i_2345_ > 255)
			    i_2345_ = 255;
			int i_2346_ = (int) (f_2339_ * f_2344_);
			if (i_2346_ < 0)
			    i_2346_ = 0;
			else if (i_2346_ > 255)
			    i_2346_ = 255;
			int i_2347_ = (int) (f_2340_ * f_2344_);
			if (i_2347_ < 0)
			    i_2347_ = 0;
			else if (i_2347_ > 255)
			    i_2347_ = 255;
			class534_sub40_sub2.anInt10811
			    = (i_2309_ + i_2341_ * i) * -1387468933;
			class534_sub40_sub2.method16506(i_2345_, 523330907);
			class534_sub40_sub2.method16506(i_2346_, 641692359);
			class534_sub40_sub2.method16506(i_2347_, 2034484508);
			class534_sub40_sub2.method16506(255 - ((aByteArray9055
								[i_2336_])
							       & 0xff),
							967628951);
			i_2341_ = aShortArray9031[i_2336_] & 0xffff;
			i_2342_ = (short) is_2330_[i_2341_];
			if (i_2342_ == 0)
			    f_2343_ = ((f * (float) is[i_2341_]
					+ f_2331_ * (float) is_2328_[i_2341_]
					+ f_2332_ * (float) is_2329_[i_2341_])
				       * 0.0026041667F);
			else
			    f_2343_ = ((f * (float) is[i_2341_]
					+ f_2331_ * (float) is_2328_[i_2341_]
					+ f_2332_ * (float) is_2329_[i_2341_])
				       / (float) (i_2342_ * 256));
			f_2344_ = f_2333_ + f_2343_ * (f_2343_ < 0.0F ? f_2335_
						       : f_2334_);
			i_2345_ = (int) (f_2338_ * f_2344_);
			if (i_2345_ < 0)
			    i_2345_ = 0;
			else if (i_2345_ > 255)
			    i_2345_ = 255;
			i_2346_ = (int) (f_2339_ * f_2344_);
			if (i_2346_ < 0)
			    i_2346_ = 0;
			else if (i_2346_ > 255)
			    i_2346_ = 255;
			i_2347_ = (int) (f_2340_ * f_2344_);
			if (i_2347_ < 0)
			    i_2347_ = 0;
			else if (i_2347_ > 255)
			    i_2347_ = 255;
			class534_sub40_sub2.anInt10811
			    = (i_2309_ + i_2341_ * i) * -1387468933;
			class534_sub40_sub2.method16506(i_2345_, 934899585);
			class534_sub40_sub2.method16506(i_2346_, 1317055473);
			class534_sub40_sub2.method16506(i_2347_, 1159856084);
			class534_sub40_sub2.method16506(255 - ((aByteArray9055
								[i_2336_])
							       & 0xff),
							1807740113);
			i_2341_ = aShortArray9058[i_2336_] & 0xffff;
			i_2342_ = (short) is_2330_[i_2341_];
			if (i_2342_ == 0)
			    f_2343_ = ((f * (float) is[i_2341_]
					+ f_2331_ * (float) is_2328_[i_2341_]
					+ f_2332_ * (float) is_2329_[i_2341_])
				       * 0.0026041667F);
			else
			    f_2343_ = ((f * (float) is[i_2341_]
					+ f_2331_ * (float) is_2328_[i_2341_]
					+ f_2332_ * (float) is_2329_[i_2341_])
				       / (float) (i_2342_ * 256));
			f_2344_ = f_2333_ + f_2343_ * (f_2343_ < 0.0F ? f_2335_
						       : f_2334_);
			i_2345_ = (int) (f_2338_ * f_2344_);
			if (i_2345_ < 0)
			    i_2345_ = 0;
			else if (i_2345_ > 255)
			    i_2345_ = 255;
			i_2346_ = (int) (f_2339_ * f_2344_);
			if (i_2346_ < 0)
			    i_2346_ = 0;
			else if (i_2346_ > 255)
			    i_2346_ = 255;
			i_2347_ = (int) (f_2340_ * f_2344_);
			if (i_2347_ < 0)
			    i_2347_ = 0;
			else if (i_2347_ > 255)
			    i_2347_ = 255;
			class534_sub40_sub2.anInt10811
			    = (i_2309_ + i_2341_ * i) * -1387468933;
			class534_sub40_sub2.method16506(i_2345_, 2072526703);
			class534_sub40_sub2.method16506(i_2346_, 1426602762);
			class534_sub40_sub2.method16506(i_2347_, 1059760055);
			class534_sub40_sub2.method16506(255 - ((aByteArray9055
								[i_2336_])
							       & 0xff),
							852458149);
		    }
		} else {
		    for (int i_2348_ = 0; i_2348_ < anInt9052; i_2348_++) {
			int i_2349_
			    = method14543(aShortArray9054[i_2348_],
					  aShortArray9059[i_2348_], aShort9040,
					  aByteArray9055[i_2348_]);
			class534_sub40_sub2.anInt10811
			    = ((i_2309_
				+ (aShortArray9056[i_2348_] & 0xffff) * i)
			       * -1387468933);
			class534_sub40_sub2.method16510(i_2349_, -220522742);
			class534_sub40_sub2.anInt10811
			    = ((i_2309_
				+ (aShortArray9031[i_2348_] & 0xffff) * i)
			       * -1387468933);
			class534_sub40_sub2.method16510(i_2349_, -1116768594);
			class534_sub40_sub2.anInt10811
			    = ((i_2309_
				+ (aShortArray9058[i_2348_] & 0xffff) * i)
			       * -1387468933);
			class534_sub40_sub2.method16510(i_2349_, -1950446391);
		    }
		}
	    }
	    if (bool_2305_) {
		short[] is;
		short[] is_2350_;
		short[] is_2351_;
		byte[] is_2352_;
		if (aClass152_9049 != null) {
		    is = aClass152_9049.aShortArray1708;
		    is_2350_ = aClass152_9049.aShortArray1707;
		    is_2351_ = aClass152_9049.aShortArray1706;
		    is_2352_ = aClass152_9049.aByteArray1709;
		} else {
		    is = aShortArray9045;
		    is_2350_ = aShortArray9042;
		    is_2351_ = aShortArray9047;
		    is_2352_ = aByteArray9050;
		}
		float f = 3.0F / (float) aShort9046;
		float f_2353_ = 3.0F / (float) (aShort9046 + aShort9046 / 2);
		class534_sub40_sub2.anInt10811 = i_2310_ * -1387468933;
		if (aClass185_Sub3_9029.aBool9566) {
		    for (int i_2354_ = 0; i_2354_ < anInt9044; i_2354_++) {
			int i_2355_ = is_2352_[i_2354_] & 0xff;
			if (i_2355_ == 0) {
			    class534_sub40_sub2
				.method18397((float) is[i_2354_] * f_2353_);
			    class534_sub40_sub2.method18397((float) (is_2350_
								     [i_2354_])
							    * f_2353_);
			    class534_sub40_sub2.method18397((float) (is_2351_
								     [i_2354_])
							    * f_2353_);
			} else {
			    float f_2356_ = f / (float) i_2355_;
			    class534_sub40_sub2
				.method18397((float) is[i_2354_] * f_2356_);
			    class534_sub40_sub2.method18397((float) (is_2350_
								     [i_2354_])
							    * f_2356_);
			    class534_sub40_sub2.method18397((float) (is_2351_
								     [i_2354_])
							    * f_2356_);
			}
			class534_sub40_sub2.anInt10811
			    += (i - 12) * -1387468933;
		    }
		} else {
		    for (int i_2357_ = 0; i_2357_ < anInt9044; i_2357_++) {
			int i_2358_ = is_2352_[i_2357_] & 0xff;
			if (i_2358_ == 0) {
			    class534_sub40_sub2
				.method18400((float) is[i_2357_] * f_2353_);
			    class534_sub40_sub2.method18400((float) (is_2350_
								     [i_2357_])
							    * f_2353_);
			    class534_sub40_sub2.method18400((float) (is_2351_
								     [i_2357_])
							    * f_2353_);
			} else {
			    float f_2359_ = f / (float) i_2358_;
			    class534_sub40_sub2
				.method18400((float) is[i_2357_] * f_2359_);
			    class534_sub40_sub2.method18400((float) (is_2350_
								     [i_2357_])
							    * f_2359_);
			    class534_sub40_sub2.method18400((float) (is_2351_
								     [i_2357_])
							    * f_2359_);
			}
			class534_sub40_sub2.anInt10811
			    += (i - 12) * -1387468933;
		    }
		}
	    }
	    if (bool_2307_) {
		class534_sub40_sub2.anInt10811 = i_2311_ * -1387468933;
		if (aClass185_Sub3_9029.aBool9566) {
		    for (int i_2360_ = 0; i_2360_ < anInt9044; i_2360_++) {
			class534_sub40_sub2
			    .method18397(aFloatArray9022[i_2360_]);
			class534_sub40_sub2
			    .method18397(aFloatArray9051[i_2360_]);
			class534_sub40_sub2.anInt10811
			    += (i - 8) * -1387468933;
		    }
		} else {
		    for (int i_2361_ = 0; i_2361_ < anInt9044; i_2361_++) {
			class534_sub40_sub2
			    .method18400(aFloatArray9022[i_2361_]);
			class534_sub40_sub2
			    .method18400(aFloatArray9051[i_2361_]);
			class534_sub40_sub2.anInt10811
			    += (i - 8) * -1387468933;
		    }
		}
	    }
	    class534_sub40_sub2.anInt10811 = i * anInt9044 * -1387468933;
	    Interface15 interface15;
	    if (bool) {
		if (anInterface15_9068 == null)
		    anInterface15_9068
			= (aClass185_Sub3_9029.method15218
			   (i, class534_sub40_sub2.aByteArray10810,
			    class534_sub40_sub2.anInt10811 * 31645619, true));
		else
		    anInterface15_9068.method95(i,
						(class534_sub40_sub2
						 .aByteArray10810),
						(class534_sub40_sub2.anInt10811
						 * 31645619));
		interface15 = anInterface15_9068;
		aByte9065 = (byte) 0;
	    } else {
		interface15
		    = (aClass185_Sub3_9029.method15218
		       (i, class534_sub40_sub2.aByteArray10810,
			class534_sub40_sub2.anInt10811 * 31645619, false));
		aBool9093 = true;
	    }
	    if (bool_2306_) {
		aClass129_9062.anInterface15_1519 = interface15;
		aClass129_9062.aByte1518 = i_2308_;
	    }
	    if (bool_2307_) {
		aClass129_9091.anInterface15_1519 = interface15;
		aClass129_9091.aByte1518 = i_2311_;
	    }
	    if (bool_2304_) {
		aClass129_9079.anInterface15_1519 = interface15;
		aClass129_9079.aByte1518 = i_2309_;
	    }
	    if (bool_2305_) {
		aClass129_9064.anInterface15_1519 = interface15;
		aClass129_9064.aByte1518 = i_2310_;
	    }
	}
    }
    
    public void method3112(int i) {
	int i_2362_ = Class427.anIntArray4806[i];
	int i_2363_ = Class427.anIntArray4805[i];
	for (int i_2364_ = 0; i_2364_ < anInt9057; i_2364_++) {
	    int i_2365_ = ((anIntArray9043[i_2364_] * i_2363_
			    - anIntArray9041[i_2364_] * i_2362_)
			   >> 14);
	    anIntArray9041[i_2364_]
		= (anIntArray9043[i_2364_] * i_2362_
		   + anIntArray9041[i_2364_] * i_2363_) >> 14;
	    anIntArray9043[i_2364_] = i_2365_;
	}
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	aBool9075 = false;
    }
    
    public int method3138() {
	if (!aBool9075)
	    method14533();
	return aShort9078;
    }
    
    public int method3143() {
	if (!aBool9038)
	    method3050();
	return aShort9080;
    }
    
    public int method3144() {
	if (!aBool9038)
	    method3050();
	return aShort9080;
    }
    
    void method14555(Class433 class433) {
	if (aClass149Array9087 != null) {
	    Class433 class433_2366_ = aClass185_Sub3_9029.aClass433_9557;
	    aClass185_Sub3_9029.method15211();
	    aClass185_Sub3_9029.method3461(!aBool9035);
	    aClass185_Sub3_9029.method15432(false);
	    aClass185_Sub3_9029.method15221(aClass185_Sub3_9029.aClass129_9711,
					    null, null,
					    (aClass185_Sub3_9029
					     .aClass129_9712));
	    for (int i = 0; i < anInt9086; i++) {
		Class149 class149 = aClass149Array9087[i];
		Class133 class133 = aClass133Array9070[i];
		if (!class149.aBool1692 || !aClass185_Sub3_9029.method3409()) {
		    float f = ((float) (anIntArray9034[class149.anInt1686]
					+ anIntArray9034[class149.anInt1693]
					+ anIntArray9034[class149.anInt1685])
			       * 0.3333333F);
		    float f_2367_
			= ((float) (anIntArray9043[class149.anInt1686]
				    + anIntArray9043[class149.anInt1693]
				    + anIntArray9043[class149.anInt1685])
			   * 0.3333333F);
		    float f_2368_
			= ((float) (anIntArray9041[class149.anInt1686]
				    + anIntArray9041[class149.anInt1693]
				    + anIntArray9041[class149.anInt1685])
			   * 0.3333333F);
		    float f_2369_ = (class433.aFloatArray4853[0] * f
				     + class433.aFloatArray4853[4] * f_2367_
				     + class433.aFloatArray4853[8] * f_2368_
				     + class433.aFloatArray4853[12]);
		    float f_2370_ = (class433.aFloatArray4853[1] * f
				     + class433.aFloatArray4853[5] * f_2367_
				     + class433.aFloatArray4853[9] * f_2368_
				     + class433.aFloatArray4853[13]);
		    float f_2371_ = (class433.aFloatArray4853[2] * f
				     + class433.aFloatArray4853[6] * f_2367_
				     + class433.aFloatArray4853[10] * f_2368_
				     + class433.aFloatArray4853[14]);
		    float f_2372_
			= ((float) (1.0
				    / Math.sqrt((double) (f_2369_ * f_2369_
							  + f_2370_ * f_2370_
							  + (f_2371_
							     * f_2371_))))
			   * (float) class149.anInt1688);
		    class433_2366_.method6935
			(class133.anInt1586,
			 class133.anInt1582 * class149.aShort1684 >> 7,
			 class133.anInt1581 * class149.aShort1689 >> 7,
			 (f_2369_ + (float) class133.anInt1584
			  - f_2369_ * f_2372_),
			 (f_2370_ + (float) class133.anInt1583
			  - f_2370_ * f_2372_),
			 f_2371_ - f_2371_ * f_2372_);
		    aClass185_Sub3_9029.method15200(class433_2366_);
		    int i_2373_ = class133.anInt1585;
		    OpenGL.glColor4ub((byte) (i_2373_ >> 16),
				      (byte) (i_2373_ >> 8), (byte) i_2373_,
				      (byte) (i_2373_ >> 24));
		    aClass185_Sub3_9029.method15227(class149.aShort1690);
		    aClass185_Sub3_9029.method15246(class149.aByte1691);
		    aClass185_Sub3_9029.method15274(7, 0, 4);
		}
	    }
	    aClass185_Sub3_9029.method3461(true);
	    aClass185_Sub3_9029.method15201();
	}
    }
    
    public int method3042() {
	if (!aBool9075)
	    method14533();
	return anInt9069;
    }
    
    void method14556() {
	if (aBool9093) {
	    aBool9093 = false;
	    if (aClass172Array9084 == null && aClass158Array9085 == null
		&& aClass149Array9087 == null
		&& !Class127.method2251(anInt9030, anInt9088)) {
		boolean bool = false;
		boolean bool_2374_ = false;
		boolean bool_2375_ = false;
		if (anIntArray9034 != null
		    && !Class127.method2217(anInt9030, anInt9088)) {
		    if (aClass129_9062 == null
			|| aClass129_9062.anInterface15_1519 != null) {
			if (!aBool9075)
			    method14533();
			bool = true;
		    } else
			aBool9093 = true;
		}
		if (anIntArray9043 != null
		    && !Class127.method2218(anInt9030, anInt9088)) {
		    if (aClass129_9062 == null
			|| aClass129_9062.anInterface15_1519 != null) {
			if (!aBool9075)
			    method14533();
			bool_2374_ = true;
		    } else
			aBool9093 = true;
		}
		if (anIntArray9041 != null
		    && !Class127.method2219(anInt9030, anInt9088)) {
		    if (aClass129_9062 == null
			|| aClass129_9062.anInterface15_1519 != null) {
			if (!aBool9075)
			    method14533();
			bool_2375_ = true;
		    } else
			aBool9093 = true;
		}
		if (bool)
		    anIntArray9034 = null;
		if (bool_2374_)
		    anIntArray9043 = null;
		if (bool_2375_)
		    anIntArray9041 = null;
	    }
	    if (aShortArray9083 != null && anIntArray9034 == null
		&& anIntArray9043 == null && anIntArray9041 == null) {
		aShortArray9083 = null;
		anIntArray9082 = null;
	    }
	    if (aByteArray9050 != null
		&& !Class127.method2214(anInt9030, anInt9088)) {
		if (aClass129_9064 != null) {
		    if (aClass129_9064.anInterface15_1519 != null) {
			aShortArray9047 = null;
			aShortArray9042 = null;
			aShortArray9045 = null;
			aByteArray9050 = null;
		    } else
			aBool9093 = true;
		} else if (aClass129_9079 == null
			   || aClass129_9079.anInterface15_1519 != null) {
		    aShortArray9047 = null;
		    aShortArray9042 = null;
		    aShortArray9045 = null;
		    aByteArray9050 = null;
		} else
		    aBool9093 = true;
	    }
	    if (aShortArray9054 != null
		&& !Class127.method2221(anInt9030, anInt9088)) {
		if (aClass129_9079 == null
		    || aClass129_9079.anInterface15_1519 != null)
		    aShortArray9054 = null;
		else
		    aBool9093 = true;
	    }
	    if (aByteArray9055 != null
		&& !Class127.method2269(anInt9030, anInt9088)) {
		if (aClass129_9079 == null
		    || aClass129_9079.anInterface15_1519 != null)
		    aByteArray9055 = null;
		else
		    aBool9093 = true;
	    }
	    if (aFloatArray9022 != null
		&& !Class127.method2223(anInt9030, anInt9088)) {
		if (aClass129_9091 == null
		    || aClass129_9091.anInterface15_1519 != null) {
		    aFloatArray9051 = null;
		    aFloatArray9022 = null;
		} else
		    aBool9093 = true;
	    }
	    if (aShortArray9059 != null
		&& !Class127.method2280(anInt9030, anInt9088)) {
		if (aClass129_9079 == null
		    || aClass129_9079.anInterface15_1519 != null)
		    aShortArray9059 = null;
		else
		    aBool9093 = true;
	    }
	    if (aShortArray9056 != null
		&& !Class127.method2220(anInt9030, anInt9088)) {
		if ((aClass132_9066 == null
		     || aClass132_9066.anInterface16_1580 != null)
		    && (aClass129_9079 == null
			|| aClass129_9079.anInterface15_1519 != null)) {
		    aShortArray9058 = null;
		    aShortArray9031 = null;
		    aShortArray9056 = null;
		} else
		    aBool9093 = true;
	    }
	    if (anIntArrayArray9073 != null
		&& !Class127.method2224(anInt9030, anInt9088)) {
		anIntArrayArray9073 = null;
		aShortArray9061 = null;
	    }
	    if (anIntArrayArray9028 != null
		&& !Class127.method2253(anInt9030, anInt9088)) {
		anIntArrayArray9028 = null;
		aShortArray9048 = null;
	    }
	    if (anIntArrayArray9089 != null
		&& !Class127.method2209(anInt9030, anInt9088))
		anIntArrayArray9089 = null;
	    if (anIntArray9060 != null && (anInt9030 & 0x800) == 0
		&& (anInt9030 & 0x40000) == 0)
		anIntArray9060 = null;
	}
    }
    
    public void method3103(int i) {
	aShort9046 = (short) i;
	if (aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
	if (aClass129_9064 != null)
	    aClass129_9064.anInterface15_1519 = null;
    }
    
    public void method3149(int i) {
	aShort9046 = (short) i;
	if (aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
	if (aClass129_9064 != null)
	    aClass129_9064.anInterface15_1519 = null;
    }
    
    public int method3176() {
	return aShort9040;
    }
    
    public int method3151() {
	return aShort9046;
    }
    
    boolean method14557(int i, int i_2376_, int i_2377_, int i_2378_,
			int i_2379_, int i_2380_, int i_2381_, int i_2382_) {
	if (i_2376_ < i_2377_ && i_2376_ < i_2378_ && i_2376_ < i_2379_)
	    return false;
	if (i_2376_ > i_2377_ && i_2376_ > i_2378_ && i_2376_ > i_2379_)
	    return false;
	if (i < i_2380_ && i < i_2381_ && i < i_2382_)
	    return false;
	if (i > i_2380_ && i > i_2381_ && i > i_2382_)
	    return false;
	return true;
    }
    
    public void method3199(short i, short i_2383_) {
	for (int i_2384_ = 0; i_2384_ < anInt9052; i_2384_++) {
	    if (aShortArray9054[i_2384_] == i)
		aShortArray9054[i_2384_] = i_2383_;
	}
	if (aClass149Array9087 != null) {
	    for (int i_2385_ = 0; i_2385_ < anInt9086; i_2385_++) {
		Class149 class149 = aClass149Array9087[i_2385_];
		Class133 class133 = aClass133Array9070[i_2385_];
		class133.anInt1585
		    = (class133.anInt1585 & ~0xffffff
		       | ((Class661.anIntArray8549
			   [aShortArray9054[class149.anInt1687] & 0xffff])
			  & 0xffffff));
	    }
	}
	if (aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
    }
    
    void method3181() {
	/* empty */
    }
    
    public Class534_Sub18_Sub16 method3040
	(Class534_Sub18_Sub16 class534_sub18_sub16) {
	if (anInt9044 == 0)
	    return null;
	if (!aBool9075)
	    method14533();
	int i;
	int i_2386_;
	if (aClass185_Sub3_9029.anInt9652 > 0) {
	    i = (aShort9033 - (aShort9074 * aClass185_Sub3_9029.anInt9652 >> 8)
		 >> aClass185_Sub3_9029.anInt9574);
	    i_2386_ = aShort9076 - (aShort9072 * aClass185_Sub3_9029.anInt9652
				    >> 8) >> aClass185_Sub3_9029.anInt9574;
	} else {
	    i = (aShort9033 - (aShort9072 * aClass185_Sub3_9029.anInt9652 >> 8)
		 >> aClass185_Sub3_9029.anInt9574);
	    i_2386_ = aShort9076 - (aShort9074 * aClass185_Sub3_9029.anInt9652
				    >> 8) >> aClass185_Sub3_9029.anInt9574;
	}
	int i_2387_;
	int i_2388_;
	if (aClass185_Sub3_9029.anInt9647 > 0) {
	    i_2387_ = aShort9077 - (aShort9074 * aClass185_Sub3_9029.anInt9647
				    >> 8) >> aClass185_Sub3_9029.anInt9574;
	    i_2388_ = aShort9078 - (aShort9072 * aClass185_Sub3_9029.anInt9647
				    >> 8) >> aClass185_Sub3_9029.anInt9574;
	} else {
	    i_2387_ = aShort9077 - (aShort9072 * aClass185_Sub3_9029.anInt9647
				    >> 8) >> aClass185_Sub3_9029.anInt9574;
	    i_2388_ = aShort9078 - (aShort9074 * aClass185_Sub3_9029.anInt9647
				    >> 8) >> aClass185_Sub3_9029.anInt9574;
	}
	int i_2389_ = i_2386_ - i + 1;
	int i_2390_ = i_2388_ - i_2387_ + 1;
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1
	    = (Class534_Sub18_Sub16_Sub1) class534_sub18_sub16;
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1_2391_;
	if (class534_sub18_sub16_sub1 != null
	    && class534_sub18_sub16_sub1.method18681(i_2389_, i_2390_)) {
	    class534_sub18_sub16_sub1_2391_ = class534_sub18_sub16_sub1;
	    class534_sub18_sub16_sub1_2391_.method18672();
	} else
	    class534_sub18_sub16_sub1_2391_
		= new Class534_Sub18_Sub16_Sub1(aClass185_Sub3_9029, i_2389_,
						i_2390_);
	class534_sub18_sub16_sub1_2391_.method18682(i, i_2387_, i_2386_,
						    i_2388_);
	method14538(class534_sub18_sub16_sub1_2391_);
	return class534_sub18_sub16_sub1_2391_;
    }
    
    public void method3050() {
	if (!aBool9038) {
	    if (!aBool9075)
		method14533();
	    aShort9080 = aShort9072;
	    aBool9038 = true;
	}
    }
    
    public void method3157(byte i, byte[] is) {
	if (is == null) {
	    for (int i_2392_ = 0; i_2392_ < anInt9052; i_2392_++)
		aByteArray9055[i_2392_] = i;
	} else {
	    for (int i_2393_ = 0; i_2393_ < anInt9052; i_2393_++) {
		int i_2394_ = 255 - ((255 - (is[i_2393_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		aByteArray9055[i_2393_] = (byte) i_2394_;
	    }
	}
	if (aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
    }
    
    public void method3158(short i, short i_2395_) {
	Class177 class177 = aClass185_Sub3_9029.aClass177_2012;
	for (int i_2396_ = 0; i_2396_ < anInt9052; i_2396_++) {
	    if (aShortArray9059[i_2396_] == i)
		aShortArray9059[i_2396_] = i_2395_;
	}
	byte i_2397_ = 0;
	byte i_2398_ = 0;
	if (i != -1) {
	    Class186 class186 = class177.method2931(i & 0xffff, (byte) 1);
	    i_2397_ = class186.aByte2074;
	    i_2398_ = class186.aByte2059;
	}
	byte i_2399_ = 0;
	byte i_2400_ = 0;
	if (i_2395_ != -1) {
	    Class186 class186
		= class177.method2931(i_2395_ & 0xffff, (byte) 1);
	    i_2399_ = class186.aByte2074;
	    i_2400_ = class186.aByte2059;
	    if (class186.aByte2047 != 0 || class186.aByte2048 != 0)
		aBool9036 = true;
	}
	if (i_2397_ != i_2399_ | i_2398_ != i_2400_) {
	    if (aClass149Array9087 != null) {
		for (int i_2401_ = 0; i_2401_ < anInt9086; i_2401_++) {
		    Class149 class149 = aClass149Array9087[i_2401_];
		    Class133 class133 = aClass133Array9070[i_2401_];
		    class133.anInt1585
			= (class133.anInt1585 & ~0xffffff
			   | ((Class661.anIntArray8549
			       [aShortArray9054[class149.anInt1687] & 0xffff])
			      & 0xffffff));
		}
	    }
	    if (aClass129_9079 != null)
		aClass129_9079.anInterface15_1519 = null;
	}
    }
    
    public void method3127() {
	for (int i = 0; i < anInt9057; i++)
	    anIntArray9041[i] = -anIntArray9041[i];
	for (int i = 0; i < anInt9044; i++)
	    aShortArray9047[i] = (short) -aShortArray9047[i];
	for (int i = 0; i < anInt9052; i++) {
	    short i_2402_ = aShortArray9056[i];
	    aShortArray9056[i] = aShortArray9058[i];
	    aShortArray9058[i] = i_2402_;
	}
	if (aClass129_9064 == null && aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
	if (aClass129_9064 != null)
	    aClass129_9064.anInterface15_1519 = null;
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	if (aClass132_9066 != null)
	    aClass132_9066.anInterface16_1580 = null;
	aBool9075 = false;
    }
    
    public void method3023(int i, int i_2403_, int i_2404_) {
	for (int i_2405_ = 0; i_2405_ < anInt9057; i_2405_++) {
	    if (i != 128)
		anIntArray9034[i_2405_] = anIntArray9034[i_2405_] * i >> 7;
	    if (i_2403_ != 128)
		anIntArray9043[i_2405_]
		    = anIntArray9043[i_2405_] * i_2403_ >> 7;
	    if (i_2404_ != 128)
		anIntArray9041[i_2405_]
		    = anIntArray9041[i_2405_] * i_2404_ >> 7;
	}
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	aBool9075 = false;
    }
    
    public void method3161(int i, int i_2406_, int i_2407_, int i_2408_) {
	for (int i_2409_ = 0; i_2409_ < anInt9052; i_2409_++) {
	    int i_2410_ = aShortArray9054[i_2409_] & 0xffff;
	    int i_2411_ = i_2410_ >> 10 & 0x3f;
	    int i_2412_ = i_2410_ >> 7 & 0x7;
	    int i_2413_ = i_2410_ & 0x7f;
	    if (i != -1)
		i_2411_ += (i - i_2411_) * i_2408_ >> 7;
	    if (i_2406_ != -1)
		i_2412_ += (i_2406_ - i_2412_) * i_2408_ >> 7;
	    if (i_2407_ != -1)
		i_2413_ += (i_2407_ - i_2413_) * i_2408_ >> 7;
	    aShortArray9054[i_2409_]
		= (short) (i_2411_ << 10 | i_2412_ << 7 | i_2413_);
	}
	if (aClass149Array9087 != null) {
	    for (int i_2414_ = 0; i_2414_ < anInt9086; i_2414_++) {
		Class149 class149 = aClass149Array9087[i_2414_];
		Class133 class133 = aClass133Array9070[i_2414_];
		class133.anInt1585
		    = (class133.anInt1585 & ~0xffffff
		       | ((Class661.anIntArray8549
			   [aShortArray9054[class149.anInt1687] & 0xffff])
			  & 0xffffff));
	    }
	}
	if (aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
    }
    
    public void method3141(int i, int i_2415_, int i_2416_, int i_2417_) {
	for (int i_2418_ = 0; i_2418_ < anInt9052; i_2418_++) {
	    int i_2419_ = aShortArray9054[i_2418_] & 0xffff;
	    int i_2420_ = i_2419_ >> 10 & 0x3f;
	    int i_2421_ = i_2419_ >> 7 & 0x7;
	    int i_2422_ = i_2419_ & 0x7f;
	    if (i != -1)
		i_2420_ += (i - i_2420_) * i_2417_ >> 7;
	    if (i_2415_ != -1)
		i_2421_ += (i_2415_ - i_2421_) * i_2417_ >> 7;
	    if (i_2416_ != -1)
		i_2422_ += (i_2416_ - i_2422_) * i_2417_ >> 7;
	    aShortArray9054[i_2418_]
		= (short) (i_2420_ << 10 | i_2421_ << 7 | i_2422_);
	}
	if (aClass149Array9087 != null) {
	    for (int i_2423_ = 0; i_2423_ < anInt9086; i_2423_++) {
		Class149 class149 = aClass149Array9087[i_2423_];
		Class133 class133 = aClass133Array9070[i_2423_];
		class133.anInt1585
		    = (class133.anInt1585 & ~0xffffff
		       | ((Class661.anIntArray8549
			   [aShortArray9054[class149.anInt1687] & 0xffff])
			  & 0xffffff));
	    }
	}
	if (aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
    }
    
    public void method3145(int i) {
	aShort9040 = (short) i;
	if (aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
    }
    
    public Class172[] method3164() {
	return aClass172Array9084;
    }
    
    public Class172[] method3165() {
	return aClass172Array9084;
    }
    
    public Class158[] method3166() {
	return aClass158Array9085;
    }
    
    public Class158[] method3024() {
	return aClass158Array9085;
    }
    
    public boolean method3090() {
	if (aShortArray9059 == null)
	    return true;
	for (int i = 0; i < aShortArray9059.length; i++) {
	    if (aShortArray9059[i] != -1) {
		Class186 class186
		    = aClass185_Sub3_9029.aClass177_2012
			  .method2931(aShortArray9059[i] & 0xffff, (byte) 1);
		if (class186.aBool2043
		    && !aClass185_Sub3_9029.aClass161_9659
			    .method2624(Class598.aClass598_7865, class186, -1))
		    return false;
	    }
	}
	return true;
    }
    
    public boolean method3059() {
	if (aShortArray9059 == null)
	    return true;
	for (int i = 0; i < aShortArray9059.length; i++) {
	    if (aShortArray9059[i] != -1) {
		Class186 class186
		    = aClass185_Sub3_9029.aClass177_2012
			  .method2931(aShortArray9059[i] & 0xffff, (byte) 1);
		if (class186.aBool2043
		    && !aClass185_Sub3_9029.aClass161_9659
			    .method2624(Class598.aClass598_7865, class186, -1))
		    return false;
	    }
	}
	return true;
    }
    
    void method14558() {
	if (aBool9093) {
	    aBool9093 = false;
	    if (aClass172Array9084 == null && aClass158Array9085 == null
		&& aClass149Array9087 == null
		&& !Class127.method2251(anInt9030, anInt9088)) {
		boolean bool = false;
		boolean bool_2424_ = false;
		boolean bool_2425_ = false;
		if (anIntArray9034 != null
		    && !Class127.method2217(anInt9030, anInt9088)) {
		    if (aClass129_9062 == null
			|| aClass129_9062.anInterface15_1519 != null) {
			if (!aBool9075)
			    method14533();
			bool = true;
		    } else
			aBool9093 = true;
		}
		if (anIntArray9043 != null
		    && !Class127.method2218(anInt9030, anInt9088)) {
		    if (aClass129_9062 == null
			|| aClass129_9062.anInterface15_1519 != null) {
			if (!aBool9075)
			    method14533();
			bool_2424_ = true;
		    } else
			aBool9093 = true;
		}
		if (anIntArray9041 != null
		    && !Class127.method2219(anInt9030, anInt9088)) {
		    if (aClass129_9062 == null
			|| aClass129_9062.anInterface15_1519 != null) {
			if (!aBool9075)
			    method14533();
			bool_2425_ = true;
		    } else
			aBool9093 = true;
		}
		if (bool)
		    anIntArray9034 = null;
		if (bool_2424_)
		    anIntArray9043 = null;
		if (bool_2425_)
		    anIntArray9041 = null;
	    }
	    if (aShortArray9083 != null && anIntArray9034 == null
		&& anIntArray9043 == null && anIntArray9041 == null) {
		aShortArray9083 = null;
		anIntArray9082 = null;
	    }
	    if (aByteArray9050 != null
		&& !Class127.method2214(anInt9030, anInt9088)) {
		if (aClass129_9064 != null) {
		    if (aClass129_9064.anInterface15_1519 != null) {
			aShortArray9047 = null;
			aShortArray9042 = null;
			aShortArray9045 = null;
			aByteArray9050 = null;
		    } else
			aBool9093 = true;
		} else if (aClass129_9079 == null
			   || aClass129_9079.anInterface15_1519 != null) {
		    aShortArray9047 = null;
		    aShortArray9042 = null;
		    aShortArray9045 = null;
		    aByteArray9050 = null;
		} else
		    aBool9093 = true;
	    }
	    if (aShortArray9054 != null
		&& !Class127.method2221(anInt9030, anInt9088)) {
		if (aClass129_9079 == null
		    || aClass129_9079.anInterface15_1519 != null)
		    aShortArray9054 = null;
		else
		    aBool9093 = true;
	    }
	    if (aByteArray9055 != null
		&& !Class127.method2269(anInt9030, anInt9088)) {
		if (aClass129_9079 == null
		    || aClass129_9079.anInterface15_1519 != null)
		    aByteArray9055 = null;
		else
		    aBool9093 = true;
	    }
	    if (aFloatArray9022 != null
		&& !Class127.method2223(anInt9030, anInt9088)) {
		if (aClass129_9091 == null
		    || aClass129_9091.anInterface15_1519 != null) {
		    aFloatArray9051 = null;
		    aFloatArray9022 = null;
		} else
		    aBool9093 = true;
	    }
	    if (aShortArray9059 != null
		&& !Class127.method2280(anInt9030, anInt9088)) {
		if (aClass129_9079 == null
		    || aClass129_9079.anInterface15_1519 != null)
		    aShortArray9059 = null;
		else
		    aBool9093 = true;
	    }
	    if (aShortArray9056 != null
		&& !Class127.method2220(anInt9030, anInt9088)) {
		if ((aClass132_9066 == null
		     || aClass132_9066.anInterface16_1580 != null)
		    && (aClass129_9079 == null
			|| aClass129_9079.anInterface15_1519 != null)) {
		    aShortArray9058 = null;
		    aShortArray9031 = null;
		    aShortArray9056 = null;
		} else
		    aBool9093 = true;
	    }
	    if (anIntArrayArray9073 != null
		&& !Class127.method2224(anInt9030, anInt9088)) {
		anIntArrayArray9073 = null;
		aShortArray9061 = null;
	    }
	    if (anIntArrayArray9028 != null
		&& !Class127.method2253(anInt9030, anInt9088)) {
		anIntArrayArray9028 = null;
		aShortArray9048 = null;
	    }
	    if (anIntArrayArray9089 != null
		&& !Class127.method2209(anInt9030, anInt9088))
		anIntArrayArray9089 = null;
	    if (anIntArray9060 != null && (anInt9030 & 0x800) == 0
		&& (anInt9030 & 0x40000) == 0)
		anIntArray9060 = null;
	}
    }
    
    public boolean method3171() {
	return aBool9035;
    }
    
    public boolean method3172() {
	return aBool9035;
    }
    
    public boolean method3173() {
	return aBool9035;
    }
    
    public boolean method3174() {
	return aBool9036;
    }
    
    Class183 method14559(Class183_Sub1 class183_sub1_2426_,
			 Class183_Sub1 class183_sub1_2427_, int i,
			 boolean bool, boolean bool_2428_) {
	class183_sub1_2426_.aByte9065 = (byte) 0;
	class183_sub1_2426_.anInt9030 = i;
	class183_sub1_2426_.anInt9088 = anInt9088;
	class183_sub1_2426_.aShort9040 = aShort9040;
	class183_sub1_2426_.aShort9046 = aShort9046;
	class183_sub1_2426_.anInt9037 = anInt9037;
	class183_sub1_2426_.anInt9057 = anInt9057;
	class183_sub1_2426_.anInt9044 = anInt9044;
	class183_sub1_2426_.anInt9052 = anInt9052;
	class183_sub1_2426_.anInt9053 = anInt9053;
	class183_sub1_2426_.anInt9086 = anInt9086;
	if ((i & 0x100) != 0)
	    class183_sub1_2426_.aBool9035 = true;
	else
	    class183_sub1_2426_.aBool9035 = aBool9035;
	class183_sub1_2426_.aBool9036 = aBool9036;
	boolean bool_2429_ = Class127.method2226(i, anInt9088);
	boolean bool_2430_ = Class127.method2196(i, anInt9088);
	boolean bool_2431_ = Class127.method2197(i, anInt9088);
	boolean bool_2432_ = bool_2429_ | bool_2430_ | bool_2431_;
	if (bool_2432_) {
	    if (bool_2429_) {
		if (class183_sub1_2427_.anIntArray9034 == null
		    || class183_sub1_2427_.anIntArray9034.length < anInt9037)
		    class183_sub1_2426_.anIntArray9034
			= class183_sub1_2427_.anIntArray9034
			= new int[anInt9037];
		else
		    class183_sub1_2426_.anIntArray9034
			= class183_sub1_2427_.anIntArray9034;
	    } else
		class183_sub1_2426_.anIntArray9034 = anIntArray9034;
	    if (bool_2430_) {
		if (class183_sub1_2427_.anIntArray9043 == null
		    || class183_sub1_2427_.anIntArray9043.length < anInt9037)
		    class183_sub1_2426_.anIntArray9043
			= class183_sub1_2427_.anIntArray9043
			= new int[anInt9037];
		else
		    class183_sub1_2426_.anIntArray9043
			= class183_sub1_2427_.anIntArray9043;
	    } else
		class183_sub1_2426_.anIntArray9043 = anIntArray9043;
	    if (bool_2431_) {
		if (class183_sub1_2427_.anIntArray9041 == null
		    || class183_sub1_2427_.anIntArray9041.length < anInt9037)
		    class183_sub1_2426_.anIntArray9041
			= class183_sub1_2427_.anIntArray9041
			= new int[anInt9037];
		else
		    class183_sub1_2426_.anIntArray9041
			= class183_sub1_2427_.anIntArray9041;
	    } else
		class183_sub1_2426_.anIntArray9041 = anIntArray9041;
	    for (int i_2433_ = 0; i_2433_ < anInt9037; i_2433_++) {
		if (bool_2429_)
		    class183_sub1_2426_.anIntArray9034[i_2433_]
			= anIntArray9034[i_2433_];
		if (bool_2430_)
		    class183_sub1_2426_.anIntArray9043[i_2433_]
			= anIntArray9043[i_2433_];
		if (bool_2431_)
		    class183_sub1_2426_.anIntArray9041[i_2433_]
			= anIntArray9041[i_2433_];
	    }
	} else {
	    class183_sub1_2426_.anIntArray9034 = anIntArray9034;
	    class183_sub1_2426_.anIntArray9043 = anIntArray9043;
	    class183_sub1_2426_.anIntArray9041 = anIntArray9041;
	}
	if (Class127.method2236(i, anInt9088)) {
	    if (bool)
		class183_sub1_2426_.aByte9065 |= 0x1;
	    class183_sub1_2426_.aClass129_9062
		= class183_sub1_2427_.aClass129_9062;
	    class183_sub1_2426_.aClass129_9062.aByte1518
		= aClass129_9062.aByte1518;
	    class183_sub1_2426_.aClass129_9062.anInterface15_1519
		= aClass129_9062.anInterface15_1519;
	} else if (Class127.method2207(i, anInt9088))
	    class183_sub1_2426_.aClass129_9062 = aClass129_9062;
	else
	    class183_sub1_2426_.aClass129_9062 = null;
	if (Class127.method2225(i, anInt9088)) {
	    if (class183_sub1_2427_.aShortArray9054 == null
		|| class183_sub1_2427_.aShortArray9054.length < anInt9052)
		class183_sub1_2426_.aShortArray9054
		    = class183_sub1_2427_.aShortArray9054
		    = new short[anInt9052];
	    else
		class183_sub1_2426_.aShortArray9054
		    = class183_sub1_2427_.aShortArray9054;
	    for (int i_2434_ = 0; i_2434_ < anInt9052; i_2434_++)
		class183_sub1_2426_.aShortArray9054[i_2434_]
		    = aShortArray9054[i_2434_];
	} else
	    class183_sub1_2426_.aShortArray9054 = aShortArray9054;
	if (Class127.method2201(i, anInt9088)) {
	    if (class183_sub1_2427_.aByteArray9055 == null
		|| class183_sub1_2427_.aByteArray9055.length < anInt9052)
		class183_sub1_2426_.aByteArray9055
		    = class183_sub1_2427_.aByteArray9055 = new byte[anInt9052];
	    else
		class183_sub1_2426_.aByteArray9055
		    = class183_sub1_2427_.aByteArray9055;
	    for (int i_2435_ = 0; i_2435_ < anInt9052; i_2435_++)
		class183_sub1_2426_.aByteArray9055[i_2435_]
		    = aByteArray9055[i_2435_];
	} else
	    class183_sub1_2426_.aByteArray9055 = aByteArray9055;
	if (Class127.method2212(i, anInt9088)) {
	    if (bool)
		class183_sub1_2426_.aByte9065 |= 0x2;
	    class183_sub1_2426_.aClass129_9079
		= class183_sub1_2427_.aClass129_9079;
	    class183_sub1_2426_.aClass129_9079.aByte1518
		= aClass129_9079.aByte1518;
	    class183_sub1_2426_.aClass129_9079.anInterface15_1519
		= aClass129_9079.anInterface15_1519;
	} else if (Class127.method2270(i, anInt9088))
	    class183_sub1_2426_.aClass129_9079 = aClass129_9079;
	else
	    class183_sub1_2426_.aClass129_9079 = null;
	if (Class127.method2241(i, anInt9088)) {
	    if (class183_sub1_2427_.aShortArray9045 == null
		|| class183_sub1_2427_.aShortArray9045.length < anInt9044) {
		int i_2436_ = anInt9044;
		class183_sub1_2426_.aShortArray9045
		    = class183_sub1_2427_.aShortArray9045 = new short[i_2436_];
		class183_sub1_2426_.aShortArray9042
		    = class183_sub1_2427_.aShortArray9042 = new short[i_2436_];
		class183_sub1_2426_.aShortArray9047
		    = class183_sub1_2427_.aShortArray9047 = new short[i_2436_];
	    } else {
		class183_sub1_2426_.aShortArray9045
		    = class183_sub1_2427_.aShortArray9045;
		class183_sub1_2426_.aShortArray9042
		    = class183_sub1_2427_.aShortArray9042;
		class183_sub1_2426_.aShortArray9047
		    = class183_sub1_2427_.aShortArray9047;
	    }
	    if (aClass152_9049 != null) {
		if (class183_sub1_2427_.aClass152_9049 == null)
		    class183_sub1_2427_.aClass152_9049 = new Class152();
		Class152 class152 = (class183_sub1_2426_.aClass152_9049
				     = class183_sub1_2427_.aClass152_9049);
		if (class152.aShortArray1708 == null
		    || class152.aShortArray1708.length < anInt9044) {
		    int i_2437_ = anInt9044;
		    class152.aShortArray1708 = new short[i_2437_];
		    class152.aShortArray1707 = new short[i_2437_];
		    class152.aShortArray1706 = new short[i_2437_];
		    class152.aByteArray1709 = new byte[i_2437_];
		}
		for (int i_2438_ = 0; i_2438_ < anInt9044; i_2438_++) {
		    class183_sub1_2426_.aShortArray9045[i_2438_]
			= aShortArray9045[i_2438_];
		    class183_sub1_2426_.aShortArray9042[i_2438_]
			= aShortArray9042[i_2438_];
		    class183_sub1_2426_.aShortArray9047[i_2438_]
			= aShortArray9047[i_2438_];
		    class152.aShortArray1708[i_2438_]
			= aClass152_9049.aShortArray1708[i_2438_];
		    class152.aShortArray1707[i_2438_]
			= aClass152_9049.aShortArray1707[i_2438_];
		    class152.aShortArray1706[i_2438_]
			= aClass152_9049.aShortArray1706[i_2438_];
		    class152.aByteArray1709[i_2438_]
			= aClass152_9049.aByteArray1709[i_2438_];
		}
	    } else {
		for (int i_2439_ = 0; i_2439_ < anInt9044; i_2439_++) {
		    class183_sub1_2426_.aShortArray9045[i_2439_]
			= aShortArray9045[i_2439_];
		    class183_sub1_2426_.aShortArray9042[i_2439_]
			= aShortArray9042[i_2439_];
		    class183_sub1_2426_.aShortArray9047[i_2439_]
			= aShortArray9047[i_2439_];
		}
	    }
	    class183_sub1_2426_.aByteArray9050 = aByteArray9050;
	} else {
	    class183_sub1_2426_.aClass152_9049 = aClass152_9049;
	    class183_sub1_2426_.aShortArray9045 = aShortArray9045;
	    class183_sub1_2426_.aShortArray9042 = aShortArray9042;
	    class183_sub1_2426_.aShortArray9047 = aShortArray9047;
	    class183_sub1_2426_.aByteArray9050 = aByteArray9050;
	}
	if (Class127.method2213(i, anInt9088)) {
	    if (bool)
		class183_sub1_2426_.aByte9065 |= 0x4;
	    class183_sub1_2426_.aClass129_9064
		= class183_sub1_2427_.aClass129_9064;
	    class183_sub1_2426_.aClass129_9064.aByte1518
		= aClass129_9064.aByte1518;
	    class183_sub1_2426_.aClass129_9064.anInterface15_1519
		= aClass129_9064.anInterface15_1519;
	} else if (Class127.method2293(i, anInt9088))
	    class183_sub1_2426_.aClass129_9064 = aClass129_9064;
	else
	    class183_sub1_2426_.aClass129_9064 = null;
	if (Class127.method2202(i, anInt9088)) {
	    if (class183_sub1_2427_.aFloatArray9022 == null
		|| class183_sub1_2427_.aFloatArray9022.length < anInt9052) {
		int i_2440_ = anInt9044;
		class183_sub1_2426_.aFloatArray9022
		    = class183_sub1_2427_.aFloatArray9022 = new float[i_2440_];
		class183_sub1_2426_.aFloatArray9051
		    = class183_sub1_2427_.aFloatArray9051 = new float[i_2440_];
	    } else {
		class183_sub1_2426_.aFloatArray9022
		    = class183_sub1_2427_.aFloatArray9022;
		class183_sub1_2426_.aFloatArray9051
		    = class183_sub1_2427_.aFloatArray9051;
	    }
	    for (int i_2441_ = 0; i_2441_ < anInt9044; i_2441_++) {
		class183_sub1_2426_.aFloatArray9022[i_2441_]
		    = aFloatArray9022[i_2441_];
		class183_sub1_2426_.aFloatArray9051[i_2441_]
		    = aFloatArray9051[i_2441_];
	    }
	} else {
	    class183_sub1_2426_.aFloatArray9022 = aFloatArray9022;
	    class183_sub1_2426_.aFloatArray9051 = aFloatArray9051;
	}
	if (Class127.method2198(i, anInt9088)) {
	    if (bool)
		class183_sub1_2426_.aByte9065 |= 0x8;
	    class183_sub1_2426_.aClass129_9091
		= class183_sub1_2427_.aClass129_9091;
	    class183_sub1_2426_.aClass129_9091.aByte1518
		= aClass129_9091.aByte1518;
	    class183_sub1_2426_.aClass129_9091.anInterface15_1519
		= aClass129_9091.anInterface15_1519;
	} else if (Class127.method2210(i, anInt9088))
	    class183_sub1_2426_.aClass129_9091 = aClass129_9091;
	else
	    class183_sub1_2426_.aClass129_9091 = null;
	if (Class127.method2203(i, anInt9088)) {
	    if (class183_sub1_2427_.aShortArray9056 == null
		|| class183_sub1_2427_.aShortArray9056.length < anInt9052) {
		int i_2442_ = anInt9052;
		class183_sub1_2426_.aShortArray9056
		    = class183_sub1_2427_.aShortArray9056 = new short[i_2442_];
		class183_sub1_2426_.aShortArray9031
		    = class183_sub1_2427_.aShortArray9031 = new short[i_2442_];
		class183_sub1_2426_.aShortArray9058
		    = class183_sub1_2427_.aShortArray9058 = new short[i_2442_];
	    } else {
		class183_sub1_2426_.aShortArray9056
		    = class183_sub1_2427_.aShortArray9056;
		class183_sub1_2426_.aShortArray9031
		    = class183_sub1_2427_.aShortArray9031;
		class183_sub1_2426_.aShortArray9058
		    = class183_sub1_2427_.aShortArray9058;
	    }
	    for (int i_2443_ = 0; i_2443_ < anInt9052; i_2443_++) {
		class183_sub1_2426_.aShortArray9056[i_2443_]
		    = aShortArray9056[i_2443_];
		class183_sub1_2426_.aShortArray9031[i_2443_]
		    = aShortArray9031[i_2443_];
		class183_sub1_2426_.aShortArray9058[i_2443_]
		    = aShortArray9058[i_2443_];
	    }
	} else {
	    class183_sub1_2426_.aShortArray9056 = aShortArray9056;
	    class183_sub1_2426_.aShortArray9031 = aShortArray9031;
	    class183_sub1_2426_.aShortArray9058 = aShortArray9058;
	}
	if (Class127.method2216(i, anInt9088)) {
	    if (bool)
		class183_sub1_2426_.aByte9065 |= 0x10;
	    class183_sub1_2426_.aClass132_9066
		= class183_sub1_2427_.aClass132_9066;
	    class183_sub1_2426_.aClass132_9066.anInterface16_1580
		= aClass132_9066.anInterface16_1580;
	} else if (Class127.method2257(i, anInt9088))
	    class183_sub1_2426_.aClass132_9066 = aClass132_9066;
	else
	    class183_sub1_2426_.aClass132_9066 = null;
	if (Class127.method2204(i, anInt9088)) {
	    if (class183_sub1_2427_.aShortArray9059 == null
		|| class183_sub1_2427_.aShortArray9059.length < anInt9052) {
		int i_2444_ = anInt9052;
		class183_sub1_2426_.aShortArray9059
		    = class183_sub1_2427_.aShortArray9059 = new short[i_2444_];
	    } else
		class183_sub1_2426_.aShortArray9059
		    = class183_sub1_2427_.aShortArray9059;
	    for (int i_2445_ = 0; i_2445_ < anInt9052; i_2445_++)
		class183_sub1_2426_.aShortArray9059[i_2445_]
		    = aShortArray9059[i_2445_];
	} else
	    class183_sub1_2426_.aShortArray9059 = aShortArray9059;
	if (Class127.method2222(i, anInt9088)) {
	    if (class183_sub1_2427_.aClass133Array9070 == null
		|| class183_sub1_2427_.aClass133Array9070.length < anInt9086) {
		int i_2446_ = anInt9086;
		class183_sub1_2426_.aClass133Array9070
		    = class183_sub1_2427_.aClass133Array9070
		    = new Class133[i_2446_];
		for (int i_2447_ = 0; i_2447_ < anInt9086; i_2447_++)
		    class183_sub1_2426_.aClass133Array9070[i_2447_]
			= aClass133Array9070[i_2447_].method2315();
	    } else {
		class183_sub1_2426_.aClass133Array9070
		    = class183_sub1_2427_.aClass133Array9070;
		for (int i_2448_ = 0; i_2448_ < anInt9086; i_2448_++)
		    class183_sub1_2426_.aClass133Array9070[i_2448_]
			.method2311(aClass133Array9070[i_2448_]);
	    }
	} else
	    class183_sub1_2426_.aClass133Array9070 = aClass133Array9070;
	class183_sub1_2426_.aClass149Array9087 = aClass149Array9087;
	if (aBool9075) {
	    class183_sub1_2426_.anInt9069 = anInt9069;
	    class183_sub1_2426_.anInt9023 = anInt9023;
	    class183_sub1_2426_.aShort9033 = aShort9033;
	    class183_sub1_2426_.aShort9076 = aShort9076;
	    class183_sub1_2426_.aShort9072 = aShort9072;
	    class183_sub1_2426_.aShort9074 = aShort9074;
	    class183_sub1_2426_.aShort9077 = aShort9077;
	    class183_sub1_2426_.aShort9078 = aShort9078;
	    class183_sub1_2426_.aBool9075 = true;
	} else
	    class183_sub1_2426_.aBool9075 = false;
	if (aBool9038) {
	    class183_sub1_2426_.aShort9080 = aShort9080;
	    class183_sub1_2426_.aBool9038 = true;
	} else
	    class183_sub1_2426_.aBool9038 = false;
	class183_sub1_2426_.anIntArrayArray9028 = anIntArrayArray9028;
	class183_sub1_2426_.anIntArrayArray9073 = anIntArrayArray9073;
	class183_sub1_2426_.anIntArrayArray9089 = anIntArrayArray9089;
	class183_sub1_2426_.aShortArray9083 = aShortArray9083;
	class183_sub1_2426_.anIntArray9082 = anIntArray9082;
	class183_sub1_2426_.aShortArray9048 = aShortArray9048;
	class183_sub1_2426_.aShortArray9061 = aShortArray9061;
	class183_sub1_2426_.anIntArray9060 = anIntArray9060;
	class183_sub1_2426_.aClass172Array9084 = aClass172Array9084;
	class183_sub1_2426_.aClass158Array9085 = aClass158Array9085;
	return class183_sub1_2426_;
    }
    
    short method14560(Class187 class187, int i, long l, int i_2449_,
		      int i_2450_, int i_2451_, int i_2452_, float f,
		      float f_2453_) {
	int i_2454_ = anIntArray9082[i];
	int i_2455_ = anIntArray9082[i + 1];
	int i_2456_ = 0;
	for (int i_2457_ = i_2454_; i_2457_ < i_2455_; i_2457_++) {
	    if (aShortArray9083[i_2457_] == 0) {
		i_2456_ = i_2457_;
		break;
	    }
	    int i_2458_ = (aShortArray9083[i_2457_] & 0xffff) - 1;
	    if (aLongArray9090[i_2457_] == l)
		return (short) i_2458_;
	}
	aShortArray9083[i_2456_] = (short) (anInt9044 + 1);
	aLongArray9090[i_2456_] = l;
	aShortArray9045[anInt9044] = (short) i_2449_;
	aShortArray9042[anInt9044] = (short) i_2450_;
	aShortArray9047[anInt9044] = (short) i_2451_;
	aByteArray9050[anInt9044] = (byte) i_2452_;
	aFloatArray9022[anInt9044] = f;
	aFloatArray9051[anInt9044] = f_2453_;
	return (short) anInt9044++;
    }
    
    short method14561(Class187 class187, int i, long l, int i_2459_,
		      int i_2460_, int i_2461_, int i_2462_, float f,
		      float f_2463_) {
	int i_2464_ = anIntArray9082[i];
	int i_2465_ = anIntArray9082[i + 1];
	int i_2466_ = 0;
	for (int i_2467_ = i_2464_; i_2467_ < i_2465_; i_2467_++) {
	    if (aShortArray9083[i_2467_] == 0) {
		i_2466_ = i_2467_;
		break;
	    }
	    int i_2468_ = (aShortArray9083[i_2467_] & 0xffff) - 1;
	    if (aLongArray9090[i_2467_] == l)
		return (short) i_2468_;
	}
	aShortArray9083[i_2466_] = (short) (anInt9044 + 1);
	aLongArray9090[i_2466_] = l;
	aShortArray9045[anInt9044] = (short) i_2459_;
	aShortArray9042[anInt9044] = (short) i_2460_;
	aShortArray9047[anInt9044] = (short) i_2461_;
	aByteArray9050[anInt9044] = (byte) i_2462_;
	aFloatArray9022[anInt9044] = f;
	aFloatArray9051[anInt9044] = f_2463_;
	return (short) anInt9044++;
    }
    
    static byte[] method14562(byte[] is, int i) {
	byte[] is_2469_ = new byte[i];
	System.arraycopy(is, 0, is_2469_, 0, i);
	return is_2469_;
    }
    
    public void method3084(int i) {
	int i_2470_ = Class427.anIntArray4806[i];
	int i_2471_ = Class427.anIntArray4805[i];
	for (int i_2472_ = 0; i_2472_ < anInt9057; i_2472_++) {
	    int i_2473_ = ((anIntArray9043[i_2472_] * i_2470_
			    + anIntArray9034[i_2472_] * i_2471_)
			   >> 14);
	    anIntArray9043[i_2472_]
		= (anIntArray9043[i_2472_] * i_2471_
		   - anIntArray9034[i_2472_] * i_2470_) >> 14;
	    anIntArray9034[i_2472_] = i_2473_;
	}
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	aBool9075 = false;
    }
    
    public void method3081(int i) {
	int i_2474_ = Class427.anIntArray4806[i];
	int i_2475_ = Class427.anIntArray4805[i];
	for (int i_2476_ = 0; i_2476_ < anInt9057; i_2476_++) {
	    int i_2477_ = ((anIntArray9043[i_2476_] * i_2475_
			    - anIntArray9041[i_2476_] * i_2474_)
			   >> 14);
	    anIntArray9041[i_2476_]
		= (anIntArray9043[i_2476_] * i_2474_
		   + anIntArray9041[i_2476_] * i_2475_) >> 14;
	    anIntArray9043[i_2476_] = i_2477_;
	}
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	aBool9075 = false;
    }
    
    static short[] method14563(short[] is, int i) {
	short[] is_2478_ = new short[i];
	System.arraycopy(is, 0, is_2478_, 0, i);
	return is_2478_;
    }
    
    static float[] method14564(float[] fs, int i) {
	float[] fs_2479_ = new float[i];
	System.arraycopy(fs, 0, fs_2479_, 0, i);
	return fs_2479_;
    }
    
    public void method3012(int i) {
	anInt9030 = i;
	if (aClass152_9049 != null && (anInt9030 & 0x10000) == 0) {
	    aShortArray9045 = aClass152_9049.aShortArray1708;
	    aShortArray9042 = aClass152_9049.aShortArray1707;
	    aShortArray9047 = aClass152_9049.aShortArray1706;
	    aByteArray9050 = aClass152_9049.aByteArray1709;
	    aClass152_9049 = null;
	}
	aBool9093 = true;
	method14556();
    }
    
    Class183 method14565(Class183_Sub1 class183_sub1_2480_,
			 Class183_Sub1 class183_sub1_2481_, int i,
			 boolean bool, boolean bool_2482_) {
	class183_sub1_2480_.aByte9065 = (byte) 0;
	class183_sub1_2480_.anInt9030 = i;
	class183_sub1_2480_.anInt9088 = anInt9088;
	class183_sub1_2480_.aShort9040 = aShort9040;
	class183_sub1_2480_.aShort9046 = aShort9046;
	class183_sub1_2480_.anInt9037 = anInt9037;
	class183_sub1_2480_.anInt9057 = anInt9057;
	class183_sub1_2480_.anInt9044 = anInt9044;
	class183_sub1_2480_.anInt9052 = anInt9052;
	class183_sub1_2480_.anInt9053 = anInt9053;
	class183_sub1_2480_.anInt9086 = anInt9086;
	if ((i & 0x100) != 0)
	    class183_sub1_2480_.aBool9035 = true;
	else
	    class183_sub1_2480_.aBool9035 = aBool9035;
	class183_sub1_2480_.aBool9036 = aBool9036;
	boolean bool_2483_ = Class127.method2226(i, anInt9088);
	boolean bool_2484_ = Class127.method2196(i, anInt9088);
	boolean bool_2485_ = Class127.method2197(i, anInt9088);
	boolean bool_2486_ = bool_2483_ | bool_2484_ | bool_2485_;
	if (bool_2486_) {
	    if (bool_2483_) {
		if (class183_sub1_2481_.anIntArray9034 == null
		    || class183_sub1_2481_.anIntArray9034.length < anInt9037)
		    class183_sub1_2480_.anIntArray9034
			= class183_sub1_2481_.anIntArray9034
			= new int[anInt9037];
		else
		    class183_sub1_2480_.anIntArray9034
			= class183_sub1_2481_.anIntArray9034;
	    } else
		class183_sub1_2480_.anIntArray9034 = anIntArray9034;
	    if (bool_2484_) {
		if (class183_sub1_2481_.anIntArray9043 == null
		    || class183_sub1_2481_.anIntArray9043.length < anInt9037)
		    class183_sub1_2480_.anIntArray9043
			= class183_sub1_2481_.anIntArray9043
			= new int[anInt9037];
		else
		    class183_sub1_2480_.anIntArray9043
			= class183_sub1_2481_.anIntArray9043;
	    } else
		class183_sub1_2480_.anIntArray9043 = anIntArray9043;
	    if (bool_2485_) {
		if (class183_sub1_2481_.anIntArray9041 == null
		    || class183_sub1_2481_.anIntArray9041.length < anInt9037)
		    class183_sub1_2480_.anIntArray9041
			= class183_sub1_2481_.anIntArray9041
			= new int[anInt9037];
		else
		    class183_sub1_2480_.anIntArray9041
			= class183_sub1_2481_.anIntArray9041;
	    } else
		class183_sub1_2480_.anIntArray9041 = anIntArray9041;
	    for (int i_2487_ = 0; i_2487_ < anInt9037; i_2487_++) {
		if (bool_2483_)
		    class183_sub1_2480_.anIntArray9034[i_2487_]
			= anIntArray9034[i_2487_];
		if (bool_2484_)
		    class183_sub1_2480_.anIntArray9043[i_2487_]
			= anIntArray9043[i_2487_];
		if (bool_2485_)
		    class183_sub1_2480_.anIntArray9041[i_2487_]
			= anIntArray9041[i_2487_];
	    }
	} else {
	    class183_sub1_2480_.anIntArray9034 = anIntArray9034;
	    class183_sub1_2480_.anIntArray9043 = anIntArray9043;
	    class183_sub1_2480_.anIntArray9041 = anIntArray9041;
	}
	if (Class127.method2236(i, anInt9088)) {
	    if (bool)
		class183_sub1_2480_.aByte9065 |= 0x1;
	    class183_sub1_2480_.aClass129_9062
		= class183_sub1_2481_.aClass129_9062;
	    class183_sub1_2480_.aClass129_9062.aByte1518
		= aClass129_9062.aByte1518;
	    class183_sub1_2480_.aClass129_9062.anInterface15_1519
		= aClass129_9062.anInterface15_1519;
	} else if (Class127.method2207(i, anInt9088))
	    class183_sub1_2480_.aClass129_9062 = aClass129_9062;
	else
	    class183_sub1_2480_.aClass129_9062 = null;
	if (Class127.method2225(i, anInt9088)) {
	    if (class183_sub1_2481_.aShortArray9054 == null
		|| class183_sub1_2481_.aShortArray9054.length < anInt9052)
		class183_sub1_2480_.aShortArray9054
		    = class183_sub1_2481_.aShortArray9054
		    = new short[anInt9052];
	    else
		class183_sub1_2480_.aShortArray9054
		    = class183_sub1_2481_.aShortArray9054;
	    for (int i_2488_ = 0; i_2488_ < anInt9052; i_2488_++)
		class183_sub1_2480_.aShortArray9054[i_2488_]
		    = aShortArray9054[i_2488_];
	} else
	    class183_sub1_2480_.aShortArray9054 = aShortArray9054;
	if (Class127.method2201(i, anInt9088)) {
	    if (class183_sub1_2481_.aByteArray9055 == null
		|| class183_sub1_2481_.aByteArray9055.length < anInt9052)
		class183_sub1_2480_.aByteArray9055
		    = class183_sub1_2481_.aByteArray9055 = new byte[anInt9052];
	    else
		class183_sub1_2480_.aByteArray9055
		    = class183_sub1_2481_.aByteArray9055;
	    for (int i_2489_ = 0; i_2489_ < anInt9052; i_2489_++)
		class183_sub1_2480_.aByteArray9055[i_2489_]
		    = aByteArray9055[i_2489_];
	} else
	    class183_sub1_2480_.aByteArray9055 = aByteArray9055;
	if (Class127.method2212(i, anInt9088)) {
	    if (bool)
		class183_sub1_2480_.aByte9065 |= 0x2;
	    class183_sub1_2480_.aClass129_9079
		= class183_sub1_2481_.aClass129_9079;
	    class183_sub1_2480_.aClass129_9079.aByte1518
		= aClass129_9079.aByte1518;
	    class183_sub1_2480_.aClass129_9079.anInterface15_1519
		= aClass129_9079.anInterface15_1519;
	} else if (Class127.method2270(i, anInt9088))
	    class183_sub1_2480_.aClass129_9079 = aClass129_9079;
	else
	    class183_sub1_2480_.aClass129_9079 = null;
	if (Class127.method2241(i, anInt9088)) {
	    if (class183_sub1_2481_.aShortArray9045 == null
		|| class183_sub1_2481_.aShortArray9045.length < anInt9044) {
		int i_2490_ = anInt9044;
		class183_sub1_2480_.aShortArray9045
		    = class183_sub1_2481_.aShortArray9045 = new short[i_2490_];
		class183_sub1_2480_.aShortArray9042
		    = class183_sub1_2481_.aShortArray9042 = new short[i_2490_];
		class183_sub1_2480_.aShortArray9047
		    = class183_sub1_2481_.aShortArray9047 = new short[i_2490_];
	    } else {
		class183_sub1_2480_.aShortArray9045
		    = class183_sub1_2481_.aShortArray9045;
		class183_sub1_2480_.aShortArray9042
		    = class183_sub1_2481_.aShortArray9042;
		class183_sub1_2480_.aShortArray9047
		    = class183_sub1_2481_.aShortArray9047;
	    }
	    if (aClass152_9049 != null) {
		if (class183_sub1_2481_.aClass152_9049 == null)
		    class183_sub1_2481_.aClass152_9049 = new Class152();
		Class152 class152 = (class183_sub1_2480_.aClass152_9049
				     = class183_sub1_2481_.aClass152_9049);
		if (class152.aShortArray1708 == null
		    || class152.aShortArray1708.length < anInt9044) {
		    int i_2491_ = anInt9044;
		    class152.aShortArray1708 = new short[i_2491_];
		    class152.aShortArray1707 = new short[i_2491_];
		    class152.aShortArray1706 = new short[i_2491_];
		    class152.aByteArray1709 = new byte[i_2491_];
		}
		for (int i_2492_ = 0; i_2492_ < anInt9044; i_2492_++) {
		    class183_sub1_2480_.aShortArray9045[i_2492_]
			= aShortArray9045[i_2492_];
		    class183_sub1_2480_.aShortArray9042[i_2492_]
			= aShortArray9042[i_2492_];
		    class183_sub1_2480_.aShortArray9047[i_2492_]
			= aShortArray9047[i_2492_];
		    class152.aShortArray1708[i_2492_]
			= aClass152_9049.aShortArray1708[i_2492_];
		    class152.aShortArray1707[i_2492_]
			= aClass152_9049.aShortArray1707[i_2492_];
		    class152.aShortArray1706[i_2492_]
			= aClass152_9049.aShortArray1706[i_2492_];
		    class152.aByteArray1709[i_2492_]
			= aClass152_9049.aByteArray1709[i_2492_];
		}
	    } else {
		for (int i_2493_ = 0; i_2493_ < anInt9044; i_2493_++) {
		    class183_sub1_2480_.aShortArray9045[i_2493_]
			= aShortArray9045[i_2493_];
		    class183_sub1_2480_.aShortArray9042[i_2493_]
			= aShortArray9042[i_2493_];
		    class183_sub1_2480_.aShortArray9047[i_2493_]
			= aShortArray9047[i_2493_];
		}
	    }
	    class183_sub1_2480_.aByteArray9050 = aByteArray9050;
	} else {
	    class183_sub1_2480_.aClass152_9049 = aClass152_9049;
	    class183_sub1_2480_.aShortArray9045 = aShortArray9045;
	    class183_sub1_2480_.aShortArray9042 = aShortArray9042;
	    class183_sub1_2480_.aShortArray9047 = aShortArray9047;
	    class183_sub1_2480_.aByteArray9050 = aByteArray9050;
	}
	if (Class127.method2213(i, anInt9088)) {
	    if (bool)
		class183_sub1_2480_.aByte9065 |= 0x4;
	    class183_sub1_2480_.aClass129_9064
		= class183_sub1_2481_.aClass129_9064;
	    class183_sub1_2480_.aClass129_9064.aByte1518
		= aClass129_9064.aByte1518;
	    class183_sub1_2480_.aClass129_9064.anInterface15_1519
		= aClass129_9064.anInterface15_1519;
	} else if (Class127.method2293(i, anInt9088))
	    class183_sub1_2480_.aClass129_9064 = aClass129_9064;
	else
	    class183_sub1_2480_.aClass129_9064 = null;
	if (Class127.method2202(i, anInt9088)) {
	    if (class183_sub1_2481_.aFloatArray9022 == null
		|| class183_sub1_2481_.aFloatArray9022.length < anInt9052) {
		int i_2494_ = anInt9044;
		class183_sub1_2480_.aFloatArray9022
		    = class183_sub1_2481_.aFloatArray9022 = new float[i_2494_];
		class183_sub1_2480_.aFloatArray9051
		    = class183_sub1_2481_.aFloatArray9051 = new float[i_2494_];
	    } else {
		class183_sub1_2480_.aFloatArray9022
		    = class183_sub1_2481_.aFloatArray9022;
		class183_sub1_2480_.aFloatArray9051
		    = class183_sub1_2481_.aFloatArray9051;
	    }
	    for (int i_2495_ = 0; i_2495_ < anInt9044; i_2495_++) {
		class183_sub1_2480_.aFloatArray9022[i_2495_]
		    = aFloatArray9022[i_2495_];
		class183_sub1_2480_.aFloatArray9051[i_2495_]
		    = aFloatArray9051[i_2495_];
	    }
	} else {
	    class183_sub1_2480_.aFloatArray9022 = aFloatArray9022;
	    class183_sub1_2480_.aFloatArray9051 = aFloatArray9051;
	}
	if (Class127.method2198(i, anInt9088)) {
	    if (bool)
		class183_sub1_2480_.aByte9065 |= 0x8;
	    class183_sub1_2480_.aClass129_9091
		= class183_sub1_2481_.aClass129_9091;
	    class183_sub1_2480_.aClass129_9091.aByte1518
		= aClass129_9091.aByte1518;
	    class183_sub1_2480_.aClass129_9091.anInterface15_1519
		= aClass129_9091.anInterface15_1519;
	} else if (Class127.method2210(i, anInt9088))
	    class183_sub1_2480_.aClass129_9091 = aClass129_9091;
	else
	    class183_sub1_2480_.aClass129_9091 = null;
	if (Class127.method2203(i, anInt9088)) {
	    if (class183_sub1_2481_.aShortArray9056 == null
		|| class183_sub1_2481_.aShortArray9056.length < anInt9052) {
		int i_2496_ = anInt9052;
		class183_sub1_2480_.aShortArray9056
		    = class183_sub1_2481_.aShortArray9056 = new short[i_2496_];
		class183_sub1_2480_.aShortArray9031
		    = class183_sub1_2481_.aShortArray9031 = new short[i_2496_];
		class183_sub1_2480_.aShortArray9058
		    = class183_sub1_2481_.aShortArray9058 = new short[i_2496_];
	    } else {
		class183_sub1_2480_.aShortArray9056
		    = class183_sub1_2481_.aShortArray9056;
		class183_sub1_2480_.aShortArray9031
		    = class183_sub1_2481_.aShortArray9031;
		class183_sub1_2480_.aShortArray9058
		    = class183_sub1_2481_.aShortArray9058;
	    }
	    for (int i_2497_ = 0; i_2497_ < anInt9052; i_2497_++) {
		class183_sub1_2480_.aShortArray9056[i_2497_]
		    = aShortArray9056[i_2497_];
		class183_sub1_2480_.aShortArray9031[i_2497_]
		    = aShortArray9031[i_2497_];
		class183_sub1_2480_.aShortArray9058[i_2497_]
		    = aShortArray9058[i_2497_];
	    }
	} else {
	    class183_sub1_2480_.aShortArray9056 = aShortArray9056;
	    class183_sub1_2480_.aShortArray9031 = aShortArray9031;
	    class183_sub1_2480_.aShortArray9058 = aShortArray9058;
	}
	if (Class127.method2216(i, anInt9088)) {
	    if (bool)
		class183_sub1_2480_.aByte9065 |= 0x10;
	    class183_sub1_2480_.aClass132_9066
		= class183_sub1_2481_.aClass132_9066;
	    class183_sub1_2480_.aClass132_9066.anInterface16_1580
		= aClass132_9066.anInterface16_1580;
	} else if (Class127.method2257(i, anInt9088))
	    class183_sub1_2480_.aClass132_9066 = aClass132_9066;
	else
	    class183_sub1_2480_.aClass132_9066 = null;
	if (Class127.method2204(i, anInt9088)) {
	    if (class183_sub1_2481_.aShortArray9059 == null
		|| class183_sub1_2481_.aShortArray9059.length < anInt9052) {
		int i_2498_ = anInt9052;
		class183_sub1_2480_.aShortArray9059
		    = class183_sub1_2481_.aShortArray9059 = new short[i_2498_];
	    } else
		class183_sub1_2480_.aShortArray9059
		    = class183_sub1_2481_.aShortArray9059;
	    for (int i_2499_ = 0; i_2499_ < anInt9052; i_2499_++)
		class183_sub1_2480_.aShortArray9059[i_2499_]
		    = aShortArray9059[i_2499_];
	} else
	    class183_sub1_2480_.aShortArray9059 = aShortArray9059;
	if (Class127.method2222(i, anInt9088)) {
	    if (class183_sub1_2481_.aClass133Array9070 == null
		|| class183_sub1_2481_.aClass133Array9070.length < anInt9086) {
		int i_2500_ = anInt9086;
		class183_sub1_2480_.aClass133Array9070
		    = class183_sub1_2481_.aClass133Array9070
		    = new Class133[i_2500_];
		for (int i_2501_ = 0; i_2501_ < anInt9086; i_2501_++)
		    class183_sub1_2480_.aClass133Array9070[i_2501_]
			= aClass133Array9070[i_2501_].method2315();
	    } else {
		class183_sub1_2480_.aClass133Array9070
		    = class183_sub1_2481_.aClass133Array9070;
		for (int i_2502_ = 0; i_2502_ < anInt9086; i_2502_++)
		    class183_sub1_2480_.aClass133Array9070[i_2502_]
			.method2311(aClass133Array9070[i_2502_]);
	    }
	} else
	    class183_sub1_2480_.aClass133Array9070 = aClass133Array9070;
	class183_sub1_2480_.aClass149Array9087 = aClass149Array9087;
	if (aBool9075) {
	    class183_sub1_2480_.anInt9069 = anInt9069;
	    class183_sub1_2480_.anInt9023 = anInt9023;
	    class183_sub1_2480_.aShort9033 = aShort9033;
	    class183_sub1_2480_.aShort9076 = aShort9076;
	    class183_sub1_2480_.aShort9072 = aShort9072;
	    class183_sub1_2480_.aShort9074 = aShort9074;
	    class183_sub1_2480_.aShort9077 = aShort9077;
	    class183_sub1_2480_.aShort9078 = aShort9078;
	    class183_sub1_2480_.aBool9075 = true;
	} else
	    class183_sub1_2480_.aBool9075 = false;
	if (aBool9038) {
	    class183_sub1_2480_.aShort9080 = aShort9080;
	    class183_sub1_2480_.aBool9038 = true;
	} else
	    class183_sub1_2480_.aBool9038 = false;
	class183_sub1_2480_.anIntArrayArray9028 = anIntArrayArray9028;
	class183_sub1_2480_.anIntArrayArray9073 = anIntArrayArray9073;
	class183_sub1_2480_.anIntArrayArray9089 = anIntArrayArray9089;
	class183_sub1_2480_.aShortArray9083 = aShortArray9083;
	class183_sub1_2480_.anIntArray9082 = anIntArray9082;
	class183_sub1_2480_.aShortArray9048 = aShortArray9048;
	class183_sub1_2480_.aShortArray9061 = aShortArray9061;
	class183_sub1_2480_.anIntArray9060 = anIntArray9060;
	class183_sub1_2480_.aClass172Array9084 = aClass172Array9084;
	class183_sub1_2480_.aClass158Array9085 = aClass158Array9085;
	return class183_sub1_2480_;
    }
    
    Class183 method14566(Class183_Sub1 class183_sub1_2503_,
			 Class183_Sub1 class183_sub1_2504_, int i,
			 boolean bool, boolean bool_2505_) {
	class183_sub1_2503_.aByte9065 = (byte) 0;
	class183_sub1_2503_.anInt9030 = i;
	class183_sub1_2503_.anInt9088 = anInt9088;
	class183_sub1_2503_.aShort9040 = aShort9040;
	class183_sub1_2503_.aShort9046 = aShort9046;
	class183_sub1_2503_.anInt9037 = anInt9037;
	class183_sub1_2503_.anInt9057 = anInt9057;
	class183_sub1_2503_.anInt9044 = anInt9044;
	class183_sub1_2503_.anInt9052 = anInt9052;
	class183_sub1_2503_.anInt9053 = anInt9053;
	class183_sub1_2503_.anInt9086 = anInt9086;
	if ((i & 0x100) != 0)
	    class183_sub1_2503_.aBool9035 = true;
	else
	    class183_sub1_2503_.aBool9035 = aBool9035;
	class183_sub1_2503_.aBool9036 = aBool9036;
	boolean bool_2506_ = Class127.method2226(i, anInt9088);
	boolean bool_2507_ = Class127.method2196(i, anInt9088);
	boolean bool_2508_ = Class127.method2197(i, anInt9088);
	boolean bool_2509_ = bool_2506_ | bool_2507_ | bool_2508_;
	if (bool_2509_) {
	    if (bool_2506_) {
		if (class183_sub1_2504_.anIntArray9034 == null
		    || class183_sub1_2504_.anIntArray9034.length < anInt9037)
		    class183_sub1_2503_.anIntArray9034
			= class183_sub1_2504_.anIntArray9034
			= new int[anInt9037];
		else
		    class183_sub1_2503_.anIntArray9034
			= class183_sub1_2504_.anIntArray9034;
	    } else
		class183_sub1_2503_.anIntArray9034 = anIntArray9034;
	    if (bool_2507_) {
		if (class183_sub1_2504_.anIntArray9043 == null
		    || class183_sub1_2504_.anIntArray9043.length < anInt9037)
		    class183_sub1_2503_.anIntArray9043
			= class183_sub1_2504_.anIntArray9043
			= new int[anInt9037];
		else
		    class183_sub1_2503_.anIntArray9043
			= class183_sub1_2504_.anIntArray9043;
	    } else
		class183_sub1_2503_.anIntArray9043 = anIntArray9043;
	    if (bool_2508_) {
		if (class183_sub1_2504_.anIntArray9041 == null
		    || class183_sub1_2504_.anIntArray9041.length < anInt9037)
		    class183_sub1_2503_.anIntArray9041
			= class183_sub1_2504_.anIntArray9041
			= new int[anInt9037];
		else
		    class183_sub1_2503_.anIntArray9041
			= class183_sub1_2504_.anIntArray9041;
	    } else
		class183_sub1_2503_.anIntArray9041 = anIntArray9041;
	    for (int i_2510_ = 0; i_2510_ < anInt9037; i_2510_++) {
		if (bool_2506_)
		    class183_sub1_2503_.anIntArray9034[i_2510_]
			= anIntArray9034[i_2510_];
		if (bool_2507_)
		    class183_sub1_2503_.anIntArray9043[i_2510_]
			= anIntArray9043[i_2510_];
		if (bool_2508_)
		    class183_sub1_2503_.anIntArray9041[i_2510_]
			= anIntArray9041[i_2510_];
	    }
	} else {
	    class183_sub1_2503_.anIntArray9034 = anIntArray9034;
	    class183_sub1_2503_.anIntArray9043 = anIntArray9043;
	    class183_sub1_2503_.anIntArray9041 = anIntArray9041;
	}
	if (Class127.method2236(i, anInt9088)) {
	    if (bool)
		class183_sub1_2503_.aByte9065 |= 0x1;
	    class183_sub1_2503_.aClass129_9062
		= class183_sub1_2504_.aClass129_9062;
	    class183_sub1_2503_.aClass129_9062.aByte1518
		= aClass129_9062.aByte1518;
	    class183_sub1_2503_.aClass129_9062.anInterface15_1519
		= aClass129_9062.anInterface15_1519;
	} else if (Class127.method2207(i, anInt9088))
	    class183_sub1_2503_.aClass129_9062 = aClass129_9062;
	else
	    class183_sub1_2503_.aClass129_9062 = null;
	if (Class127.method2225(i, anInt9088)) {
	    if (class183_sub1_2504_.aShortArray9054 == null
		|| class183_sub1_2504_.aShortArray9054.length < anInt9052)
		class183_sub1_2503_.aShortArray9054
		    = class183_sub1_2504_.aShortArray9054
		    = new short[anInt9052];
	    else
		class183_sub1_2503_.aShortArray9054
		    = class183_sub1_2504_.aShortArray9054;
	    for (int i_2511_ = 0; i_2511_ < anInt9052; i_2511_++)
		class183_sub1_2503_.aShortArray9054[i_2511_]
		    = aShortArray9054[i_2511_];
	} else
	    class183_sub1_2503_.aShortArray9054 = aShortArray9054;
	if (Class127.method2201(i, anInt9088)) {
	    if (class183_sub1_2504_.aByteArray9055 == null
		|| class183_sub1_2504_.aByteArray9055.length < anInt9052)
		class183_sub1_2503_.aByteArray9055
		    = class183_sub1_2504_.aByteArray9055 = new byte[anInt9052];
	    else
		class183_sub1_2503_.aByteArray9055
		    = class183_sub1_2504_.aByteArray9055;
	    for (int i_2512_ = 0; i_2512_ < anInt9052; i_2512_++)
		class183_sub1_2503_.aByteArray9055[i_2512_]
		    = aByteArray9055[i_2512_];
	} else
	    class183_sub1_2503_.aByteArray9055 = aByteArray9055;
	if (Class127.method2212(i, anInt9088)) {
	    if (bool)
		class183_sub1_2503_.aByte9065 |= 0x2;
	    class183_sub1_2503_.aClass129_9079
		= class183_sub1_2504_.aClass129_9079;
	    class183_sub1_2503_.aClass129_9079.aByte1518
		= aClass129_9079.aByte1518;
	    class183_sub1_2503_.aClass129_9079.anInterface15_1519
		= aClass129_9079.anInterface15_1519;
	} else if (Class127.method2270(i, anInt9088))
	    class183_sub1_2503_.aClass129_9079 = aClass129_9079;
	else
	    class183_sub1_2503_.aClass129_9079 = null;
	if (Class127.method2241(i, anInt9088)) {
	    if (class183_sub1_2504_.aShortArray9045 == null
		|| class183_sub1_2504_.aShortArray9045.length < anInt9044) {
		int i_2513_ = anInt9044;
		class183_sub1_2503_.aShortArray9045
		    = class183_sub1_2504_.aShortArray9045 = new short[i_2513_];
		class183_sub1_2503_.aShortArray9042
		    = class183_sub1_2504_.aShortArray9042 = new short[i_2513_];
		class183_sub1_2503_.aShortArray9047
		    = class183_sub1_2504_.aShortArray9047 = new short[i_2513_];
	    } else {
		class183_sub1_2503_.aShortArray9045
		    = class183_sub1_2504_.aShortArray9045;
		class183_sub1_2503_.aShortArray9042
		    = class183_sub1_2504_.aShortArray9042;
		class183_sub1_2503_.aShortArray9047
		    = class183_sub1_2504_.aShortArray9047;
	    }
	    if (aClass152_9049 != null) {
		if (class183_sub1_2504_.aClass152_9049 == null)
		    class183_sub1_2504_.aClass152_9049 = new Class152();
		Class152 class152 = (class183_sub1_2503_.aClass152_9049
				     = class183_sub1_2504_.aClass152_9049);
		if (class152.aShortArray1708 == null
		    || class152.aShortArray1708.length < anInt9044) {
		    int i_2514_ = anInt9044;
		    class152.aShortArray1708 = new short[i_2514_];
		    class152.aShortArray1707 = new short[i_2514_];
		    class152.aShortArray1706 = new short[i_2514_];
		    class152.aByteArray1709 = new byte[i_2514_];
		}
		for (int i_2515_ = 0; i_2515_ < anInt9044; i_2515_++) {
		    class183_sub1_2503_.aShortArray9045[i_2515_]
			= aShortArray9045[i_2515_];
		    class183_sub1_2503_.aShortArray9042[i_2515_]
			= aShortArray9042[i_2515_];
		    class183_sub1_2503_.aShortArray9047[i_2515_]
			= aShortArray9047[i_2515_];
		    class152.aShortArray1708[i_2515_]
			= aClass152_9049.aShortArray1708[i_2515_];
		    class152.aShortArray1707[i_2515_]
			= aClass152_9049.aShortArray1707[i_2515_];
		    class152.aShortArray1706[i_2515_]
			= aClass152_9049.aShortArray1706[i_2515_];
		    class152.aByteArray1709[i_2515_]
			= aClass152_9049.aByteArray1709[i_2515_];
		}
	    } else {
		for (int i_2516_ = 0; i_2516_ < anInt9044; i_2516_++) {
		    class183_sub1_2503_.aShortArray9045[i_2516_]
			= aShortArray9045[i_2516_];
		    class183_sub1_2503_.aShortArray9042[i_2516_]
			= aShortArray9042[i_2516_];
		    class183_sub1_2503_.aShortArray9047[i_2516_]
			= aShortArray9047[i_2516_];
		}
	    }
	    class183_sub1_2503_.aByteArray9050 = aByteArray9050;
	} else {
	    class183_sub1_2503_.aClass152_9049 = aClass152_9049;
	    class183_sub1_2503_.aShortArray9045 = aShortArray9045;
	    class183_sub1_2503_.aShortArray9042 = aShortArray9042;
	    class183_sub1_2503_.aShortArray9047 = aShortArray9047;
	    class183_sub1_2503_.aByteArray9050 = aByteArray9050;
	}
	if (Class127.method2213(i, anInt9088)) {
	    if (bool)
		class183_sub1_2503_.aByte9065 |= 0x4;
	    class183_sub1_2503_.aClass129_9064
		= class183_sub1_2504_.aClass129_9064;
	    class183_sub1_2503_.aClass129_9064.aByte1518
		= aClass129_9064.aByte1518;
	    class183_sub1_2503_.aClass129_9064.anInterface15_1519
		= aClass129_9064.anInterface15_1519;
	} else if (Class127.method2293(i, anInt9088))
	    class183_sub1_2503_.aClass129_9064 = aClass129_9064;
	else
	    class183_sub1_2503_.aClass129_9064 = null;
	if (Class127.method2202(i, anInt9088)) {
	    if (class183_sub1_2504_.aFloatArray9022 == null
		|| class183_sub1_2504_.aFloatArray9022.length < anInt9052) {
		int i_2517_ = anInt9044;
		class183_sub1_2503_.aFloatArray9022
		    = class183_sub1_2504_.aFloatArray9022 = new float[i_2517_];
		class183_sub1_2503_.aFloatArray9051
		    = class183_sub1_2504_.aFloatArray9051 = new float[i_2517_];
	    } else {
		class183_sub1_2503_.aFloatArray9022
		    = class183_sub1_2504_.aFloatArray9022;
		class183_sub1_2503_.aFloatArray9051
		    = class183_sub1_2504_.aFloatArray9051;
	    }
	    for (int i_2518_ = 0; i_2518_ < anInt9044; i_2518_++) {
		class183_sub1_2503_.aFloatArray9022[i_2518_]
		    = aFloatArray9022[i_2518_];
		class183_sub1_2503_.aFloatArray9051[i_2518_]
		    = aFloatArray9051[i_2518_];
	    }
	} else {
	    class183_sub1_2503_.aFloatArray9022 = aFloatArray9022;
	    class183_sub1_2503_.aFloatArray9051 = aFloatArray9051;
	}
	if (Class127.method2198(i, anInt9088)) {
	    if (bool)
		class183_sub1_2503_.aByte9065 |= 0x8;
	    class183_sub1_2503_.aClass129_9091
		= class183_sub1_2504_.aClass129_9091;
	    class183_sub1_2503_.aClass129_9091.aByte1518
		= aClass129_9091.aByte1518;
	    class183_sub1_2503_.aClass129_9091.anInterface15_1519
		= aClass129_9091.anInterface15_1519;
	} else if (Class127.method2210(i, anInt9088))
	    class183_sub1_2503_.aClass129_9091 = aClass129_9091;
	else
	    class183_sub1_2503_.aClass129_9091 = null;
	if (Class127.method2203(i, anInt9088)) {
	    if (class183_sub1_2504_.aShortArray9056 == null
		|| class183_sub1_2504_.aShortArray9056.length < anInt9052) {
		int i_2519_ = anInt9052;
		class183_sub1_2503_.aShortArray9056
		    = class183_sub1_2504_.aShortArray9056 = new short[i_2519_];
		class183_sub1_2503_.aShortArray9031
		    = class183_sub1_2504_.aShortArray9031 = new short[i_2519_];
		class183_sub1_2503_.aShortArray9058
		    = class183_sub1_2504_.aShortArray9058 = new short[i_2519_];
	    } else {
		class183_sub1_2503_.aShortArray9056
		    = class183_sub1_2504_.aShortArray9056;
		class183_sub1_2503_.aShortArray9031
		    = class183_sub1_2504_.aShortArray9031;
		class183_sub1_2503_.aShortArray9058
		    = class183_sub1_2504_.aShortArray9058;
	    }
	    for (int i_2520_ = 0; i_2520_ < anInt9052; i_2520_++) {
		class183_sub1_2503_.aShortArray9056[i_2520_]
		    = aShortArray9056[i_2520_];
		class183_sub1_2503_.aShortArray9031[i_2520_]
		    = aShortArray9031[i_2520_];
		class183_sub1_2503_.aShortArray9058[i_2520_]
		    = aShortArray9058[i_2520_];
	    }
	} else {
	    class183_sub1_2503_.aShortArray9056 = aShortArray9056;
	    class183_sub1_2503_.aShortArray9031 = aShortArray9031;
	    class183_sub1_2503_.aShortArray9058 = aShortArray9058;
	}
	if (Class127.method2216(i, anInt9088)) {
	    if (bool)
		class183_sub1_2503_.aByte9065 |= 0x10;
	    class183_sub1_2503_.aClass132_9066
		= class183_sub1_2504_.aClass132_9066;
	    class183_sub1_2503_.aClass132_9066.anInterface16_1580
		= aClass132_9066.anInterface16_1580;
	} else if (Class127.method2257(i, anInt9088))
	    class183_sub1_2503_.aClass132_9066 = aClass132_9066;
	else
	    class183_sub1_2503_.aClass132_9066 = null;
	if (Class127.method2204(i, anInt9088)) {
	    if (class183_sub1_2504_.aShortArray9059 == null
		|| class183_sub1_2504_.aShortArray9059.length < anInt9052) {
		int i_2521_ = anInt9052;
		class183_sub1_2503_.aShortArray9059
		    = class183_sub1_2504_.aShortArray9059 = new short[i_2521_];
	    } else
		class183_sub1_2503_.aShortArray9059
		    = class183_sub1_2504_.aShortArray9059;
	    for (int i_2522_ = 0; i_2522_ < anInt9052; i_2522_++)
		class183_sub1_2503_.aShortArray9059[i_2522_]
		    = aShortArray9059[i_2522_];
	} else
	    class183_sub1_2503_.aShortArray9059 = aShortArray9059;
	if (Class127.method2222(i, anInt9088)) {
	    if (class183_sub1_2504_.aClass133Array9070 == null
		|| class183_sub1_2504_.aClass133Array9070.length < anInt9086) {
		int i_2523_ = anInt9086;
		class183_sub1_2503_.aClass133Array9070
		    = class183_sub1_2504_.aClass133Array9070
		    = new Class133[i_2523_];
		for (int i_2524_ = 0; i_2524_ < anInt9086; i_2524_++)
		    class183_sub1_2503_.aClass133Array9070[i_2524_]
			= aClass133Array9070[i_2524_].method2315();
	    } else {
		class183_sub1_2503_.aClass133Array9070
		    = class183_sub1_2504_.aClass133Array9070;
		for (int i_2525_ = 0; i_2525_ < anInt9086; i_2525_++)
		    class183_sub1_2503_.aClass133Array9070[i_2525_]
			.method2311(aClass133Array9070[i_2525_]);
	    }
	} else
	    class183_sub1_2503_.aClass133Array9070 = aClass133Array9070;
	class183_sub1_2503_.aClass149Array9087 = aClass149Array9087;
	if (aBool9075) {
	    class183_sub1_2503_.anInt9069 = anInt9069;
	    class183_sub1_2503_.anInt9023 = anInt9023;
	    class183_sub1_2503_.aShort9033 = aShort9033;
	    class183_sub1_2503_.aShort9076 = aShort9076;
	    class183_sub1_2503_.aShort9072 = aShort9072;
	    class183_sub1_2503_.aShort9074 = aShort9074;
	    class183_sub1_2503_.aShort9077 = aShort9077;
	    class183_sub1_2503_.aShort9078 = aShort9078;
	    class183_sub1_2503_.aBool9075 = true;
	} else
	    class183_sub1_2503_.aBool9075 = false;
	if (aBool9038) {
	    class183_sub1_2503_.aShort9080 = aShort9080;
	    class183_sub1_2503_.aBool9038 = true;
	} else
	    class183_sub1_2503_.aBool9038 = false;
	class183_sub1_2503_.anIntArrayArray9028 = anIntArrayArray9028;
	class183_sub1_2503_.anIntArrayArray9073 = anIntArrayArray9073;
	class183_sub1_2503_.anIntArrayArray9089 = anIntArrayArray9089;
	class183_sub1_2503_.aShortArray9083 = aShortArray9083;
	class183_sub1_2503_.anIntArray9082 = anIntArray9082;
	class183_sub1_2503_.aShortArray9048 = aShortArray9048;
	class183_sub1_2503_.aShortArray9061 = aShortArray9061;
	class183_sub1_2503_.anIntArray9060 = anIntArray9060;
	class183_sub1_2503_.aClass172Array9084 = aClass172Array9084;
	class183_sub1_2503_.aClass158Array9085 = aClass158Array9085;
	return class183_sub1_2503_;
    }
    
    void method14567(Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1) {
	if (aClass185_Sub3_9029.anIntArray9717.length < anInt9044) {
	    aClass185_Sub3_9029.anIntArray9717 = new int[anInt9044];
	    aClass185_Sub3_9029.anIntArray9718 = new int[anInt9044];
	}
	int[] is = aClass185_Sub3_9029.anIntArray9717;
	int[] is_2526_ = aClass185_Sub3_9029.anIntArray9718;
	for (int i = 0; i < anInt9057; i++) {
	    int i_2527_
		= (((anIntArray9034[i]
		     - (anIntArray9043[i] * aClass185_Sub3_9029.anInt9652
			>> 8))
		    >> aClass185_Sub3_9029.anInt9574)
		   - class534_sub18_sub16_sub1.anInt12071);
	    int i_2528_
		= (((anIntArray9041[i]
		     - (anIntArray9043[i] * aClass185_Sub3_9029.anInt9647
			>> 8))
		    >> aClass185_Sub3_9029.anInt9574)
		   - class534_sub18_sub16_sub1.anInt12070);
	    int i_2529_ = anIntArray9082[i];
	    int i_2530_ = anIntArray9082[i + 1];
	    for (int i_2531_ = i_2529_;
		 i_2531_ < i_2530_ && aShortArray9083[i_2531_] != 0;
		 i_2531_++) {
		int i_2532_ = (aShortArray9083[i_2531_] & 0xffff) - 1;
		is[i_2532_] = i_2527_;
		is_2526_[i_2532_] = i_2528_;
	    }
	}
	for (int i = 0; i < anInt9053; i++) {
	    if (aByteArray9055 == null || aByteArray9055[i] <= 128) {
		int i_2533_ = aShortArray9056[i] & 0xffff;
		int i_2534_ = aShortArray9031[i] & 0xffff;
		int i_2535_ = aShortArray9058[i] & 0xffff;
		int i_2536_ = is[i_2533_];
		int i_2537_ = is[i_2534_];
		int i_2538_ = is[i_2535_];
		int i_2539_ = is_2526_[i_2533_];
		int i_2540_ = is_2526_[i_2534_];
		int i_2541_ = is_2526_[i_2535_];
		if (((i_2536_ - i_2537_) * (i_2540_ - i_2541_)
		     - (i_2540_ - i_2539_) * (i_2538_ - i_2537_))
		    > 0)
		    class534_sub18_sub16_sub1.method18675(i_2539_, i_2540_,
							  i_2541_, i_2536_,
							  i_2537_, i_2538_);
	    }
	}
    }
    
    public void method3159(short i, short i_2542_) {
	Class177 class177 = aClass185_Sub3_9029.aClass177_2012;
	for (int i_2543_ = 0; i_2543_ < anInt9052; i_2543_++) {
	    if (aShortArray9059[i_2543_] == i)
		aShortArray9059[i_2543_] = i_2542_;
	}
	byte i_2544_ = 0;
	byte i_2545_ = 0;
	if (i != -1) {
	    Class186 class186 = class177.method2931(i & 0xffff, (byte) 1);
	    i_2544_ = class186.aByte2074;
	    i_2545_ = class186.aByte2059;
	}
	byte i_2546_ = 0;
	byte i_2547_ = 0;
	if (i_2542_ != -1) {
	    Class186 class186
		= class177.method2931(i_2542_ & 0xffff, (byte) 1);
	    i_2546_ = class186.aByte2074;
	    i_2547_ = class186.aByte2059;
	    if (class186.aByte2047 != 0 || class186.aByte2048 != 0)
		aBool9036 = true;
	}
	if (i_2544_ != i_2546_ | i_2545_ != i_2547_) {
	    if (aClass149Array9087 != null) {
		for (int i_2548_ = 0; i_2548_ < anInt9086; i_2548_++) {
		    Class149 class149 = aClass149Array9087[i_2548_];
		    Class133 class133 = aClass133Array9070[i_2548_];
		    class133.anInt1585
			= (class133.anInt1585 & ~0xffffff
			   | ((Class661.anIntArray8549
			       [aShortArray9054[class149.anInt1687] & 0xffff])
			      & 0xffffff));
		}
	    }
	    if (aClass129_9079 != null)
		aClass129_9079.anInterface15_1519 = null;
	}
    }
    
    public void method3195() {
	for (int i = 0; i < anInt9057; i++)
	    anIntArray9041[i] = -anIntArray9041[i];
	for (int i = 0; i < anInt9044; i++)
	    aShortArray9047[i] = (short) -aShortArray9047[i];
	for (int i = 0; i < anInt9052; i++) {
	    short i_2549_ = aShortArray9056[i];
	    aShortArray9056[i] = aShortArray9058[i];
	    aShortArray9058[i] = i_2549_;
	}
	if (aClass129_9064 == null && aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
	if (aClass129_9064 != null)
	    aClass129_9064.anInterface15_1519 = null;
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	if (aClass132_9066 != null)
	    aClass132_9066.anInterface16_1580 = null;
	aBool9075 = false;
    }
    
    public int method3140() {
	if (!aBool9075)
	    method14533();
	return aShort9077;
    }
    
    public void method3177(int i) {
	int i_2550_ = Class427.anIntArray4806[i];
	int i_2551_ = Class427.anIntArray4805[i];
	for (int i_2552_ = 0; i_2552_ < anInt9057; i_2552_++) {
	    int i_2553_ = ((anIntArray9041[i_2552_] * i_2550_
			    + anIntArray9034[i_2552_] * i_2551_)
			   >> 14);
	    anIntArray9041[i_2552_]
		= (anIntArray9041[i_2552_] * i_2551_
		   - anIntArray9034[i_2552_] * i_2550_) >> 14;
	    anIntArray9034[i_2552_] = i_2553_;
	}
	for (int i_2554_ = 0; i_2554_ < anInt9044; i_2554_++) {
	    int i_2555_ = ((aShortArray9047[i_2554_] * i_2550_
			    + aShortArray9045[i_2554_] * i_2551_)
			   >> 14);
	    aShortArray9047[i_2554_]
		= (short) ((aShortArray9047[i_2554_] * i_2551_
			    - aShortArray9045[i_2554_] * i_2550_)
			   >> 14);
	    aShortArray9045[i_2554_] = (short) i_2555_;
	}
	if (aClass129_9064 == null && aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
	if (aClass129_9064 != null)
	    aClass129_9064.anInterface15_1519 = null;
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	aBool9075 = false;
    }
    
    public void method3178(int i, int i_2556_, int i_2557_) {
	for (int i_2558_ = 0; i_2558_ < anInt9057; i_2558_++) {
	    if (i != 0)
		anIntArray9034[i_2558_] += i;
	    if (i_2556_ != 0)
		anIntArray9043[i_2558_] += i_2556_;
	    if (i_2557_ != 0)
		anIntArray9041[i_2558_] += i_2557_;
	}
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	aBool9075 = false;
    }
    
    public void method3153(int i, int i_2559_, int i_2560_) {
	for (int i_2561_ = 0; i_2561_ < anInt9057; i_2561_++) {
	    if (i != 0)
		anIntArray9034[i_2561_] += i;
	    if (i_2559_ != 0)
		anIntArray9043[i_2561_] += i_2559_;
	    if (i_2560_ != 0)
		anIntArray9041[i_2561_] += i_2560_;
	}
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	aBool9075 = false;
    }
    
    public int method3053() {
	return aShort9040;
    }
    
    void method14568() {
	int i = 32767;
	int i_2562_ = 32767;
	int i_2563_ = 32767;
	int i_2564_ = -32768;
	int i_2565_ = -32768;
	int i_2566_ = -32768;
	int i_2567_ = 0;
	int i_2568_ = 0;
	for (int i_2569_ = 0; i_2569_ < anInt9057; i_2569_++) {
	    int i_2570_ = anIntArray9034[i_2569_];
	    int i_2571_ = anIntArray9043[i_2569_];
	    int i_2572_ = anIntArray9041[i_2569_];
	    if (i_2570_ < i)
		i = i_2570_;
	    if (i_2570_ > i_2564_)
		i_2564_ = i_2570_;
	    if (i_2571_ < i_2562_)
		i_2562_ = i_2571_;
	    if (i_2571_ > i_2565_)
		i_2565_ = i_2571_;
	    if (i_2572_ < i_2563_)
		i_2563_ = i_2572_;
	    if (i_2572_ > i_2566_)
		i_2566_ = i_2572_;
	    int i_2573_ = i_2570_ * i_2570_ + i_2572_ * i_2572_;
	    if (i_2573_ > i_2567_)
		i_2567_ = i_2573_;
	    i_2573_
		= i_2570_ * i_2570_ + i_2572_ * i_2572_ + i_2571_ * i_2571_;
	    if (i_2573_ > i_2568_)
		i_2568_ = i_2573_;
	}
	aShort9033 = (short) i;
	aShort9076 = (short) i_2564_;
	aShort9072 = (short) i_2562_;
	aShort9074 = (short) i_2565_;
	aShort9077 = (short) i_2563_;
	aShort9078 = (short) i_2566_;
	anInt9023 = (int) (Math.sqrt((double) i_2567_) + 0.99);
	anInt9069 = (int) (Math.sqrt((double) i_2568_) + 0.99);
	aBool9075 = true;
    }
    
    public int method3087() {
	if (!aBool9075)
	    method14533();
	return aShort9033;
    }
    
    public void method3160(short i, short i_2574_) {
	Class177 class177 = aClass185_Sub3_9029.aClass177_2012;
	for (int i_2575_ = 0; i_2575_ < anInt9052; i_2575_++) {
	    if (aShortArray9059[i_2575_] == i)
		aShortArray9059[i_2575_] = i_2574_;
	}
	byte i_2576_ = 0;
	byte i_2577_ = 0;
	if (i != -1) {
	    Class186 class186 = class177.method2931(i & 0xffff, (byte) 1);
	    i_2576_ = class186.aByte2074;
	    i_2577_ = class186.aByte2059;
	}
	byte i_2578_ = 0;
	byte i_2579_ = 0;
	if (i_2574_ != -1) {
	    Class186 class186
		= class177.method2931(i_2574_ & 0xffff, (byte) 1);
	    i_2578_ = class186.aByte2074;
	    i_2579_ = class186.aByte2059;
	    if (class186.aByte2047 != 0 || class186.aByte2048 != 0)
		aBool9036 = true;
	}
	if (i_2576_ != i_2578_ | i_2577_ != i_2579_) {
	    if (aClass149Array9087 != null) {
		for (int i_2580_ = 0; i_2580_ < anInt9086; i_2580_++) {
		    Class149 class149 = aClass149Array9087[i_2580_];
		    Class133 class133 = aClass133Array9070[i_2580_];
		    class133.anInt1585
			= (class133.anInt1585 & ~0xffffff
			   | ((Class661.anIntArray8549
			       [aShortArray9054[class149.anInt1687] & 0xffff])
			      & 0xffffff));
		}
	    }
	    if (aClass129_9079 != null)
		aClass129_9079.anInterface15_1519 = null;
	}
    }
    
    void method3182() {
	/* empty */
    }
    
    public int method3045() {
	if (!aBool9075)
	    method14533();
	return aShort9072;
    }
    
    void method3184() {
	/* empty */
    }
    
    void method3185() {
	/* empty */
    }
    
    boolean method14569(int i, int i_2581_, int i_2582_, int i_2583_,
			int i_2584_, int i_2585_, int i_2586_, int i_2587_) {
	if (i_2581_ < i_2582_ && i_2581_ < i_2583_ && i_2581_ < i_2584_)
	    return false;
	if (i_2581_ > i_2582_ && i_2581_ > i_2583_ && i_2581_ > i_2584_)
	    return false;
	if (i < i_2585_ && i < i_2586_ && i < i_2587_)
	    return false;
	if (i > i_2585_ && i > i_2586_ && i > i_2587_)
	    return false;
	return true;
    }
    
    boolean method14570(int i, int i_2588_, int i_2589_, int i_2590_,
			int i_2591_, int i_2592_, int i_2593_, int i_2594_) {
	if (i_2588_ < i_2589_ && i_2588_ < i_2590_ && i_2588_ < i_2591_)
	    return false;
	if (i_2588_ > i_2589_ && i_2588_ > i_2590_ && i_2588_ > i_2591_)
	    return false;
	if (i < i_2592_ && i < i_2593_ && i < i_2594_)
	    return false;
	if (i > i_2592_ && i > i_2593_ && i > i_2594_)
	    return false;
	return true;
    }
    
    public Class534_Sub18_Sub16 method3116
	(Class534_Sub18_Sub16 class534_sub18_sub16) {
	if (anInt9044 == 0)
	    return null;
	if (!aBool9075)
	    method14533();
	int i;
	int i_2595_;
	if (aClass185_Sub3_9029.anInt9652 > 0) {
	    i = (aShort9033 - (aShort9074 * aClass185_Sub3_9029.anInt9652 >> 8)
		 >> aClass185_Sub3_9029.anInt9574);
	    i_2595_ = aShort9076 - (aShort9072 * aClass185_Sub3_9029.anInt9652
				    >> 8) >> aClass185_Sub3_9029.anInt9574;
	} else {
	    i = (aShort9033 - (aShort9072 * aClass185_Sub3_9029.anInt9652 >> 8)
		 >> aClass185_Sub3_9029.anInt9574);
	    i_2595_ = aShort9076 - (aShort9074 * aClass185_Sub3_9029.anInt9652
				    >> 8) >> aClass185_Sub3_9029.anInt9574;
	}
	int i_2596_;
	int i_2597_;
	if (aClass185_Sub3_9029.anInt9647 > 0) {
	    i_2596_ = aShort9077 - (aShort9074 * aClass185_Sub3_9029.anInt9647
				    >> 8) >> aClass185_Sub3_9029.anInt9574;
	    i_2597_ = aShort9078 - (aShort9072 * aClass185_Sub3_9029.anInt9647
				    >> 8) >> aClass185_Sub3_9029.anInt9574;
	} else {
	    i_2596_ = aShort9077 - (aShort9072 * aClass185_Sub3_9029.anInt9647
				    >> 8) >> aClass185_Sub3_9029.anInt9574;
	    i_2597_ = aShort9078 - (aShort9074 * aClass185_Sub3_9029.anInt9647
				    >> 8) >> aClass185_Sub3_9029.anInt9574;
	}
	int i_2598_ = i_2595_ - i + 1;
	int i_2599_ = i_2597_ - i_2596_ + 1;
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1
	    = (Class534_Sub18_Sub16_Sub1) class534_sub18_sub16;
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1_2600_;
	if (class534_sub18_sub16_sub1 != null
	    && class534_sub18_sub16_sub1.method18681(i_2598_, i_2599_)) {
	    class534_sub18_sub16_sub1_2600_ = class534_sub18_sub16_sub1;
	    class534_sub18_sub16_sub1_2600_.method18672();
	} else
	    class534_sub18_sub16_sub1_2600_
		= new Class534_Sub18_Sub16_Sub1(aClass185_Sub3_9029, i_2598_,
						i_2599_);
	class534_sub18_sub16_sub1_2600_.method18682(i, i_2596_, i_2595_,
						    i_2597_);
	method14538(class534_sub18_sub16_sub1_2600_);
	return class534_sub18_sub16_sub1_2600_;
    }
    
    public void method3020() {
	for (int i = 0; i < anInt9057; i++)
	    anIntArray9041[i] = -anIntArray9041[i];
	for (int i = 0; i < anInt9044; i++)
	    aShortArray9047[i] = (short) -aShortArray9047[i];
	for (int i = 0; i < anInt9052; i++) {
	    short i_2601_ = aShortArray9056[i];
	    aShortArray9056[i] = aShortArray9058[i];
	    aShortArray9058[i] = i_2601_;
	}
	if (aClass129_9064 == null && aClass129_9079 != null)
	    aClass129_9079.anInterface15_1519 = null;
	if (aClass129_9064 != null)
	    aClass129_9064.anInterface15_1519 = null;
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	if (aClass132_9066 != null)
	    aClass132_9066.anInterface16_1580 = null;
	aBool9075 = false;
    }
    
    static final int method14571(int i, int i_2602_) {
	i_2602_ = i_2602_ * (i & 0x7f) >> 7;
	if (i_2602_ < 2)
	    i_2602_ = 2;
	else if (i_2602_ > 126)
	    i_2602_ = 126;
	return (i & 0xff80) + i_2602_;
    }
    
    void method14572(Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1) {
	if (aClass185_Sub3_9029.anIntArray9717.length < anInt9044) {
	    aClass185_Sub3_9029.anIntArray9717 = new int[anInt9044];
	    aClass185_Sub3_9029.anIntArray9718 = new int[anInt9044];
	}
	int[] is = aClass185_Sub3_9029.anIntArray9717;
	int[] is_2603_ = aClass185_Sub3_9029.anIntArray9718;
	for (int i = 0; i < anInt9057; i++) {
	    int i_2604_
		= (((anIntArray9034[i]
		     - (anIntArray9043[i] * aClass185_Sub3_9029.anInt9652
			>> 8))
		    >> aClass185_Sub3_9029.anInt9574)
		   - class534_sub18_sub16_sub1.anInt12071);
	    int i_2605_
		= (((anIntArray9041[i]
		     - (anIntArray9043[i] * aClass185_Sub3_9029.anInt9647
			>> 8))
		    >> aClass185_Sub3_9029.anInt9574)
		   - class534_sub18_sub16_sub1.anInt12070);
	    int i_2606_ = anIntArray9082[i];
	    int i_2607_ = anIntArray9082[i + 1];
	    for (int i_2608_ = i_2606_;
		 i_2608_ < i_2607_ && aShortArray9083[i_2608_] != 0;
		 i_2608_++) {
		int i_2609_ = (aShortArray9083[i_2608_] & 0xffff) - 1;
		is[i_2609_] = i_2604_;
		is_2603_[i_2609_] = i_2605_;
	    }
	}
	for (int i = 0; i < anInt9053; i++) {
	    if (aByteArray9055 == null || aByteArray9055[i] <= 128) {
		int i_2610_ = aShortArray9056[i] & 0xffff;
		int i_2611_ = aShortArray9031[i] & 0xffff;
		int i_2612_ = aShortArray9058[i] & 0xffff;
		int i_2613_ = is[i_2610_];
		int i_2614_ = is[i_2611_];
		int i_2615_ = is[i_2612_];
		int i_2616_ = is_2603_[i_2610_];
		int i_2617_ = is_2603_[i_2611_];
		int i_2618_ = is_2603_[i_2612_];
		if (((i_2613_ - i_2614_) * (i_2617_ - i_2618_)
		     - (i_2617_ - i_2616_) * (i_2615_ - i_2614_))
		    > 0)
		    class534_sub18_sub16_sub1.method18675(i_2616_, i_2617_,
							  i_2618_, i_2613_,
							  i_2614_, i_2615_);
	    }
	}
    }
    
    void method14573() {
	if (anInt9053 != 0) {
	    if (aByte9065 != 0)
		method14542(true);
	    method14542(false);
	    if (aClass132_9066 != null) {
		if (aClass132_9066.anInterface16_1580 == null)
		    method14541((aByte9065 & 0x10) != 0);
		if (aClass132_9066.anInterface16_1580 != null) {
		    aClass185_Sub3_9029.method15432(aClass129_9064 != null);
		    aClass185_Sub3_9029.method15221(aClass129_9062,
						    aClass129_9064,
						    aClass129_9079,
						    aClass129_9091);
		    int i = anIntArray9060.length - 1;
		    for (int i_2619_ = 0; i_2619_ < i; i_2619_++) {
			int i_2620_ = anIntArray9060[i_2619_];
			int i_2621_ = anIntArray9060[i_2619_ + 1];
			int i_2622_ = (aShortArray9059[i_2620_] == -1 ? -1
				       : aShortArray9059[i_2620_] & 0xffff);
			aClass185_Sub3_9029
			    .method15228(i_2622_, aClass129_9064 != null);
			aClass185_Sub3_9029.method15222((aClass132_9066
							 .anInterface16_1580),
							4, i_2620_ * 3,
							((i_2621_ - i_2620_)
							 * 3));
		    }
		}
	    }
	    method14556();
	}
    }
    
    void method14574() {
	if (anInt9053 != 0) {
	    if (aByte9065 != 0)
		method14542(true);
	    method14542(false);
	    if (aClass132_9066 != null) {
		if (aClass132_9066.anInterface16_1580 == null)
		    method14541((aByte9065 & 0x10) != 0);
		if (aClass132_9066.anInterface16_1580 != null) {
		    aClass185_Sub3_9029.method15432(aClass129_9064 != null);
		    aClass185_Sub3_9029.method15221(aClass129_9062,
						    aClass129_9064,
						    aClass129_9079,
						    aClass129_9091);
		    int i = anIntArray9060.length - 1;
		    for (int i_2623_ = 0; i_2623_ < i; i_2623_++) {
			int i_2624_ = anIntArray9060[i_2623_];
			int i_2625_ = anIntArray9060[i_2623_ + 1];
			int i_2626_ = (aShortArray9059[i_2624_] == -1 ? -1
				       : aShortArray9059[i_2624_] & 0xffff);
			aClass185_Sub3_9029
			    .method15228(i_2626_, aClass129_9064 != null);
			aClass185_Sub3_9029.method15222((aClass132_9066
							 .anInterface16_1580),
							4, i_2624_ * 3,
							((i_2625_ - i_2624_)
							 * 3));
		    }
		}
	    }
	    method14556();
	}
    }
    
    void method14575(Class433 class433) {
	if (aClass149Array9087 != null) {
	    Class433 class433_2627_ = aClass185_Sub3_9029.aClass433_9557;
	    aClass185_Sub3_9029.method15211();
	    aClass185_Sub3_9029.method3461(!aBool9035);
	    aClass185_Sub3_9029.method15432(false);
	    aClass185_Sub3_9029.method15221(aClass185_Sub3_9029.aClass129_9711,
					    null, null,
					    (aClass185_Sub3_9029
					     .aClass129_9712));
	    for (int i = 0; i < anInt9086; i++) {
		Class149 class149 = aClass149Array9087[i];
		Class133 class133 = aClass133Array9070[i];
		if (!class149.aBool1692 || !aClass185_Sub3_9029.method3409()) {
		    float f = ((float) (anIntArray9034[class149.anInt1686]
					+ anIntArray9034[class149.anInt1693]
					+ anIntArray9034[class149.anInt1685])
			       * 0.3333333F);
		    float f_2628_
			= ((float) (anIntArray9043[class149.anInt1686]
				    + anIntArray9043[class149.anInt1693]
				    + anIntArray9043[class149.anInt1685])
			   * 0.3333333F);
		    float f_2629_
			= ((float) (anIntArray9041[class149.anInt1686]
				    + anIntArray9041[class149.anInt1693]
				    + anIntArray9041[class149.anInt1685])
			   * 0.3333333F);
		    float f_2630_ = (class433.aFloatArray4853[0] * f
				     + class433.aFloatArray4853[4] * f_2628_
				     + class433.aFloatArray4853[8] * f_2629_
				     + class433.aFloatArray4853[12]);
		    float f_2631_ = (class433.aFloatArray4853[1] * f
				     + class433.aFloatArray4853[5] * f_2628_
				     + class433.aFloatArray4853[9] * f_2629_
				     + class433.aFloatArray4853[13]);
		    float f_2632_ = (class433.aFloatArray4853[2] * f
				     + class433.aFloatArray4853[6] * f_2628_
				     + class433.aFloatArray4853[10] * f_2629_
				     + class433.aFloatArray4853[14]);
		    float f_2633_
			= ((float) (1.0
				    / Math.sqrt((double) (f_2630_ * f_2630_
							  + f_2631_ * f_2631_
							  + (f_2632_
							     * f_2632_))))
			   * (float) class149.anInt1688);
		    class433_2627_.method6935
			(class133.anInt1586,
			 class133.anInt1582 * class149.aShort1684 >> 7,
			 class133.anInt1581 * class149.aShort1689 >> 7,
			 (f_2630_ + (float) class133.anInt1584
			  - f_2630_ * f_2633_),
			 (f_2631_ + (float) class133.anInt1583
			  - f_2631_ * f_2633_),
			 f_2632_ - f_2632_ * f_2633_);
		    aClass185_Sub3_9029.method15200(class433_2627_);
		    int i_2634_ = class133.anInt1585;
		    OpenGL.glColor4ub((byte) (i_2634_ >> 16),
				      (byte) (i_2634_ >> 8), (byte) i_2634_,
				      (byte) (i_2634_ >> 24));
		    aClass185_Sub3_9029.method15227(class149.aShort1690);
		    aClass185_Sub3_9029.method15246(class149.aByte1691);
		    aClass185_Sub3_9029.method15274(7, 0, 4);
		}
	    }
	    aClass185_Sub3_9029.method3461(true);
	    aClass185_Sub3_9029.method15201();
	}
    }
    
    public void method3035(Class446 class446, Class194 class194, int i) {
	if ((i & 0x2) != 0)
	    OpenGL.glPolygonMode(1032, 6913);
	if (anInt9044 != 0) {
	    Class433 class433 = aClass185_Sub3_9029.aClass433_9605;
	    Class433 class433_2635_ = aClass185_Sub3_9029.aClass433_9530;
	    Class433 class433_2636_ = aClass185_Sub3_9029.aClass433_9552;
	    class433_2635_.method6916(class446);
	    class433_2636_.method6842(class433_2635_);
	    class433_2636_.method6839(aClass185_Sub3_9029.aClass433_9607);
	    if (!aBool9075)
		method14533();
	    float[] fs = aClass185_Sub3_9029.aFloatArray9569;
	    class433_2635_.method6850(0.0F, (float) aShort9072, 0.0F, fs);
	    float f = fs[0];
	    float f_2637_ = fs[1];
	    float f_2638_ = fs[2];
	    class433_2635_.method6850(0.0F, (float) aShort9074, 0.0F, fs);
	    float f_2639_ = fs[0];
	    float f_2640_ = fs[1];
	    float f_2641_ = fs[2];
	    for (int i_2642_ = 0; i_2642_ < 6; i_2642_++) {
		float[] fs_2643_
		    = aClass185_Sub3_9029.aFloatArrayArray9608[i_2642_];
		float f_2644_ = (fs_2643_[0] * f + fs_2643_[1] * f_2637_
				 + fs_2643_[2] * f_2638_ + fs_2643_[3]
				 + (float) anInt9023);
		float f_2645_ = (fs_2643_[0] * f_2639_ + fs_2643_[1] * f_2640_
				 + fs_2643_[2] * f_2641_ + fs_2643_[3]
				 + (float) anInt9023);
		if (f_2644_ < 0.0F && f_2645_ < 0.0F)
		    return;
	    }
	    if (class194 != null) {
		boolean bool = false;
		boolean bool_2646_ = true;
		int i_2647_ = aShort9033 + aShort9076 >> 1;
		int i_2648_ = aShort9077 + aShort9078 >> 1;
		int i_2649_ = i_2647_;
		short i_2650_ = aShort9072;
		int i_2651_ = i_2648_;
		float f_2652_
		    = (class433_2636_.aFloatArray4853[0] * (float) i_2649_
		       + class433_2636_.aFloatArray4853[4] * (float) i_2650_
		       + class433_2636_.aFloatArray4853[8] * (float) i_2651_
		       + class433_2636_.aFloatArray4853[12]);
		float f_2653_
		    = (class433_2636_.aFloatArray4853[1] * (float) i_2649_
		       + class433_2636_.aFloatArray4853[5] * (float) i_2650_
		       + class433_2636_.aFloatArray4853[9] * (float) i_2651_
		       + class433_2636_.aFloatArray4853[13]);
		float f_2654_
		    = (class433_2636_.aFloatArray4853[2] * (float) i_2649_
		       + class433_2636_.aFloatArray4853[6] * (float) i_2650_
		       + class433_2636_.aFloatArray4853[10] * (float) i_2651_
		       + class433_2636_.aFloatArray4853[14]);
		float f_2655_
		    = (class433_2636_.aFloatArray4853[3] * (float) i_2649_
		       + class433_2636_.aFloatArray4853[7] * (float) i_2650_
		       + class433_2636_.aFloatArray4853[11] * (float) i_2651_
		       + class433_2636_.aFloatArray4853[15]);
		if (f_2654_ >= -f_2655_) {
		    class194.anInt2148
			= (int) (aClass185_Sub3_9029.aFloat9610
				 + (aClass185_Sub3_9029.aFloat9663 * f_2652_
				    / f_2655_));
		    class194.anInt2149
			= (int) (aClass185_Sub3_9029.aFloat9612
				 + (aClass185_Sub3_9029.aFloat9613 * f_2653_
				    / f_2655_));
		} else
		    bool = true;
		i_2649_ = i_2647_;
		i_2650_ = aShort9074;
		i_2651_ = i_2648_;
		float f_2656_
		    = (class433_2636_.aFloatArray4853[0] * (float) i_2649_
		       + class433_2636_.aFloatArray4853[4] * (float) i_2650_
		       + class433_2636_.aFloatArray4853[8] * (float) i_2651_
		       + class433_2636_.aFloatArray4853[12]);
		float f_2657_
		    = (class433_2636_.aFloatArray4853[1] * (float) i_2649_
		       + class433_2636_.aFloatArray4853[5] * (float) i_2650_
		       + class433_2636_.aFloatArray4853[9] * (float) i_2651_
		       + class433_2636_.aFloatArray4853[13]);
		float f_2658_
		    = (class433_2636_.aFloatArray4853[2] * (float) i_2649_
		       + class433_2636_.aFloatArray4853[6] * (float) i_2650_
		       + class433_2636_.aFloatArray4853[10] * (float) i_2651_
		       + class433_2636_.aFloatArray4853[14]);
		float f_2659_
		    = (class433_2636_.aFloatArray4853[3] * (float) i_2649_
		       + class433_2636_.aFloatArray4853[7] * (float) i_2650_
		       + class433_2636_.aFloatArray4853[11] * (float) i_2651_
		       + class433_2636_.aFloatArray4853[15]);
		if (f_2658_ >= -f_2659_) {
		    class194.anInt2152
			= (int) (aClass185_Sub3_9029.aFloat9610
				 + (aClass185_Sub3_9029.aFloat9663 * f_2656_
				    / f_2659_));
		    class194.anInt2151
			= (int) (aClass185_Sub3_9029.aFloat9612
				 + (aClass185_Sub3_9029.aFloat9613 * f_2657_
				    / f_2659_));
		} else
		    bool = true;
		if (bool) {
		    if (f_2654_ < -f_2655_ && f_2658_ < -f_2659_)
			bool_2646_ = false;
		    else if (f_2654_ < -f_2655_) {
			float f_2660_
			    = (f_2654_ + f_2655_) / (f_2658_ + f_2659_) - 1.0F;
			float f_2661_
			    = f_2652_ + f_2660_ * (f_2656_ - f_2652_);
			float f_2662_
			    = f_2653_ + f_2660_ * (f_2657_ - f_2653_);
			float f_2663_
			    = f_2655_ + f_2660_ * (f_2659_ - f_2655_);
			class194.anInt2148
			    = (int) (aClass185_Sub3_9029.aFloat9610
				     + (aClass185_Sub3_9029.aFloat9663
					* f_2661_ / f_2663_));
			class194.anInt2149
			    = (int) (aClass185_Sub3_9029.aFloat9612
				     + (aClass185_Sub3_9029.aFloat9613
					* f_2662_ / f_2663_));
		    } else if (f_2658_ < -f_2659_) {
			float f_2664_
			    = (f_2658_ + f_2659_) / (f_2654_ + f_2655_) - 1.0F;
			float f_2665_
			    = f_2656_ + f_2664_ * (f_2652_ - f_2656_);
			float f_2666_
			    = f_2657_ + f_2664_ * (f_2653_ - f_2657_);
			float f_2667_
			    = f_2659_ + f_2664_ * (f_2655_ - f_2659_);
			class194.anInt2152
			    = (int) (aClass185_Sub3_9029.aFloat9610
				     + (aClass185_Sub3_9029.aFloat9663
					* f_2665_ / f_2667_));
			class194.anInt2151
			    = (int) (aClass185_Sub3_9029.aFloat9612
				     + (aClass185_Sub3_9029.aFloat9613
					* f_2666_ / f_2667_));
		    }
		}
		if (bool_2646_) {
		    if (f_2654_ / f_2655_ > f_2658_ / f_2659_) {
			float f_2668_ = (f_2652_
					 + (class433.aFloatArray4853[0]
					    * (float) anInt9023)
					 + class433.aFloatArray4853[12]);
			float f_2669_ = (f_2655_
					 + (class433.aFloatArray4853[3]
					    * (float) anInt9023)
					 + class433.aFloatArray4853[15]);
			class194.anInt2147
			    = (int) (aClass185_Sub3_9029.aFloat9610
				     - (float) class194.anInt2148
				     + (aClass185_Sub3_9029.aFloat9663
					* f_2668_ / f_2669_));
		    } else {
			float f_2670_ = (f_2656_
					 + (class433.aFloatArray4853[0]
					    * (float) anInt9023)
					 + class433.aFloatArray4853[12]);
			float f_2671_ = (f_2659_
					 + (class433.aFloatArray4853[3]
					    * (float) anInt9023)
					 + class433.aFloatArray4853[15]);
			class194.anInt2147
			    = (int) (aClass185_Sub3_9029.aFloat9610
				     - (float) class194.anInt2152
				     + (aClass185_Sub3_9029.aFloat9663
					* f_2670_ / f_2671_));
		    }
		    class194.aBool2150 = true;
		}
	    }
	    aClass185_Sub3_9029.method15226();
	    aClass185_Sub3_9029.method15199(class433_2635_);
	    method14539();
	    aClass185_Sub3_9029.method15201();
	    class433_2635_.method6839(aClass185_Sub3_9029.aClass433_9533);
	    method14540(class433_2635_);
	    if ((i & 0x2) != 0)
		OpenGL.glPolygonMode(1028, 6914);
	}
    }
    
    void method3106() {
	for (int i = 0; i < anInt9037; i++) {
	    anIntArray9034[i] = anIntArray9034[i] + 7 >> 4;
	    anIntArray9043[i] = anIntArray9043[i] + 7 >> 4;
	    anIntArray9041[i] = anIntArray9041[i] + 7 >> 4;
	}
	if (aClass129_9062 != null)
	    aClass129_9062.anInterface15_1519 = null;
	aBool9075 = false;
    }
    
    public void method3069(Class183 class183, int i, int i_2672_, int i_2673_,
			   boolean bool) {
	Class183_Sub1 class183_sub1_2674_ = (Class183_Sub1) class183;
	if (anInt9052 != 0 && class183_sub1_2674_.anInt9052 != 0) {
	    int i_2675_ = class183_sub1_2674_.anInt9057;
	    int[] is = class183_sub1_2674_.anIntArray9034;
	    int[] is_2676_ = class183_sub1_2674_.anIntArray9043;
	    int[] is_2677_ = class183_sub1_2674_.anIntArray9041;
	    short[] is_2678_ = class183_sub1_2674_.aShortArray9045;
	    short[] is_2679_ = class183_sub1_2674_.aShortArray9042;
	    short[] is_2680_ = class183_sub1_2674_.aShortArray9047;
	    byte[] is_2681_ = class183_sub1_2674_.aByteArray9050;
	    short[] is_2682_;
	    short[] is_2683_;
	    short[] is_2684_;
	    byte[] is_2685_;
	    if (aClass152_9049 != null) {
		is_2682_ = aClass152_9049.aShortArray1708;
		is_2683_ = aClass152_9049.aShortArray1707;
		is_2684_ = aClass152_9049.aShortArray1706;
		is_2685_ = aClass152_9049.aByteArray1709;
	    } else {
		is_2682_ = null;
		is_2683_ = null;
		is_2684_ = null;
		is_2685_ = null;
	    }
	    short[] is_2686_;
	    short[] is_2687_;
	    short[] is_2688_;
	    byte[] is_2689_;
	    if (class183_sub1_2674_.aClass152_9049 != null) {
		is_2686_ = class183_sub1_2674_.aClass152_9049.aShortArray1708;
		is_2687_ = class183_sub1_2674_.aClass152_9049.aShortArray1707;
		is_2688_ = class183_sub1_2674_.aClass152_9049.aShortArray1706;
		is_2689_ = class183_sub1_2674_.aClass152_9049.aByteArray1709;
	    } else {
		is_2686_ = null;
		is_2687_ = null;
		is_2688_ = null;
		is_2689_ = null;
	    }
	    int[] is_2690_ = class183_sub1_2674_.anIntArray9082;
	    short[] is_2691_ = class183_sub1_2674_.aShortArray9083;
	    if (!class183_sub1_2674_.aBool9075)
		class183_sub1_2674_.method14533();
	    int i_2692_ = class183_sub1_2674_.aShort9072;
	    int i_2693_ = class183_sub1_2674_.aShort9074;
	    int i_2694_ = class183_sub1_2674_.aShort9033;
	    int i_2695_ = class183_sub1_2674_.aShort9076;
	    int i_2696_ = class183_sub1_2674_.aShort9077;
	    int i_2697_ = class183_sub1_2674_.aShort9078;
	    for (int i_2698_ = 0; i_2698_ < anInt9057; i_2698_++) {
		int i_2699_ = anIntArray9043[i_2698_] - i_2672_;
		if (i_2699_ >= i_2692_ && i_2699_ <= i_2693_) {
		    int i_2700_ = anIntArray9034[i_2698_] - i;
		    if (i_2700_ >= i_2694_ && i_2700_ <= i_2695_) {
			int i_2701_ = anIntArray9041[i_2698_] - i_2673_;
			if (i_2701_ >= i_2696_ && i_2701_ <= i_2697_) {
			    int i_2702_ = -1;
			    int i_2703_ = anIntArray9082[i_2698_];
			    int i_2704_ = anIntArray9082[i_2698_ + 1];
			    for (int i_2705_ = i_2703_;
				 (i_2705_ < i_2704_
				  && aShortArray9083[i_2705_] != 0);
				 i_2705_++) {
				i_2702_
				    = (aShortArray9083[i_2705_] & 0xffff) - 1;
				if (aByteArray9050[i_2702_] != 0)
				    break;
			    }
			    if (i_2702_ != -1) {
				for (int i_2706_ = 0; i_2706_ < i_2675_;
				     i_2706_++) {
				    if (i_2700_ == is[i_2706_]
					&& i_2701_ == is_2677_[i_2706_]
					&& i_2699_ == is_2676_[i_2706_]) {
					int i_2707_ = -1;
					i_2703_ = is_2690_[i_2706_];
					i_2704_ = is_2690_[i_2706_ + 1];
					for (int i_2708_ = i_2703_;
					     (i_2708_ < i_2704_
					      && is_2691_[i_2708_] != 0);
					     i_2708_++) {
					    i_2707_ = (is_2691_[i_2708_]
						       & 0xffff) - 1;
					    if (is_2681_[i_2707_] != 0)
						break;
					}
					if (i_2707_ != -1) {
					    if (is_2682_ == null) {
						aClass152_9049
						    = new Class152();
						is_2682_
						    = aClass152_9049
							  .aShortArray1708
						    = (Class534_Sub42
							   .method16820
						       (aShortArray9045,
							(byte) 2));
						is_2683_
						    = aClass152_9049
							  .aShortArray1707
						    = (Class534_Sub42
							   .method16820
						       (aShortArray9042,
							(byte) 2));
						is_2684_
						    = aClass152_9049
							  .aShortArray1706
						    = (Class534_Sub42
							   .method16820
						       (aShortArray9047,
							(byte) 2));
						is_2685_
						    = aClass152_9049
							  .aByteArray1709
						    = (Class586.method9861
						       (aByteArray9050,
							-16711936));
					    }
					    if (is_2686_ == null) {
						Class152 class152
						    = (class183_sub1_2674_
							   .aClass152_9049
						       = new Class152());
						is_2686_
						    = class152.aShortArray1708
						    = (Class534_Sub42
							   .method16820
						       (is_2678_, (byte) 2));
						is_2687_
						    = class152.aShortArray1707
						    = (Class534_Sub42
							   .method16820
						       (is_2679_, (byte) 2));
						is_2688_
						    = class152.aShortArray1706
						    = (Class534_Sub42
							   .method16820
						       (is_2680_, (byte) 2));
						is_2689_
						    = class152.aByteArray1709
						    = (Class586.method9861
						       (is_2681_, -16711936));
					    }
					    short i_2709_
						= aShortArray9045[i_2702_];
					    short i_2710_
						= aShortArray9042[i_2702_];
					    short i_2711_
						= aShortArray9047[i_2702_];
					    byte i_2712_
						= aByteArray9050[i_2702_];
					    i_2703_ = is_2690_[i_2706_];
					    i_2704_ = is_2690_[i_2706_ + 1];
					    for (int i_2713_ = i_2703_;
						 i_2713_ < i_2704_;
						 i_2713_++) {
						int i_2714_
						    = is_2691_[i_2713_] - 1;
						if (i_2714_ == -1)
						    break;
						if (is_2689_[i_2714_] != 0) {
						    is_2686_[i_2714_]
							+= i_2709_;
						    is_2687_[i_2714_]
							+= i_2710_;
						    is_2688_[i_2714_]
							+= i_2711_;
						    is_2689_[i_2714_]
							+= i_2712_;
						}
					    }
					    i_2709_ = is_2678_[i_2707_];
					    i_2710_ = is_2679_[i_2707_];
					    i_2711_ = is_2680_[i_2707_];
					    i_2712_ = is_2681_[i_2707_];
					    i_2703_ = anIntArray9082[i_2698_];
					    i_2704_
						= anIntArray9082[i_2698_ + 1];
					    for (int i_2715_ = i_2703_;
						 (i_2715_ < i_2704_
						  && (aShortArray9083[i_2715_]
						      != 0));
						 i_2715_++) {
						int i_2716_
						    = (aShortArray9083[i_2715_]
						       & 0xffff) - 1;
						if (is_2685_[i_2716_] != 0) {
						    is_2682_[i_2716_]
							+= i_2709_;
						    is_2683_[i_2716_]
							+= i_2710_;
						    is_2684_[i_2716_]
							+= i_2711_;
						    is_2685_[i_2716_]
							+= i_2712_;
						}
					    }
					    if (aClass129_9064 == null
						&& aClass129_9079 != null)
						aClass129_9079
						    .anInterface15_1519
						    = null;
					    if (aClass129_9064 != null)
						aClass129_9064
						    .anInterface15_1519
						    = null;
					    if ((class183_sub1_2674_
						 .aClass129_9064) == null
						&& (class183_sub1_2674_
						    .aClass129_9079) != null)
						class183_sub1_2674_
						    .aClass129_9079
						    .anInterface15_1519
						    = null;
					    if ((class183_sub1_2674_
						 .aClass129_9064)
						!= null)
						class183_sub1_2674_
						    .aClass129_9064
						    .anInterface15_1519
						    = null;
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
    
    public int method3004() {
	if (!aBool9075)
	    method14533();
	return anInt9069;
    }
    
    short method14576(Class187 class187, int i, long l, int i_2717_,
		      int i_2718_, int i_2719_, int i_2720_, float f,
		      float f_2721_) {
	int i_2722_ = anIntArray9082[i];
	int i_2723_ = anIntArray9082[i + 1];
	int i_2724_ = 0;
	for (int i_2725_ = i_2722_; i_2725_ < i_2723_; i_2725_++) {
	    if (aShortArray9083[i_2725_] == 0) {
		i_2724_ = i_2725_;
		break;
	    }
	    int i_2726_ = (aShortArray9083[i_2725_] & 0xffff) - 1;
	    if (aLongArray9090[i_2725_] == l)
		return (short) i_2726_;
	}
	aShortArray9083[i_2724_] = (short) (anInt9044 + 1);
	aLongArray9090[i_2724_] = l;
	aShortArray9045[anInt9044] = (short) i_2717_;
	aShortArray9042[anInt9044] = (short) i_2718_;
	aShortArray9047[anInt9044] = (short) i_2719_;
	aByteArray9050[anInt9044] = (byte) i_2720_;
	aFloatArray9022[anInt9044] = f;
	aFloatArray9051[anInt9044] = f_2721_;
	return (short) anInt9044++;
    }
    
    public void method3113(Class446 class446) {
	Class433 class433 = aClass185_Sub3_9029.aClass433_9530;
	class433.method6916(class446);
	if (aClass172Array9084 != null) {
	    for (int i = 0; i < aClass172Array9084.length; i++) {
		Class172 class172 = aClass172Array9084[i];
		Class172 class172_2727_ = class172;
		if (class172.aClass172_1809 != null)
		    class172_2727_ = class172.aClass172_1809;
		class172_2727_.anInt1815
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9034[(class172.anInt1814
							    * 1404619919)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9043
					       [(class172.anInt1814
						 * 1404619919)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9041
					       [(class172.anInt1814
						 * 1404619919)]))))
		       * -697779603);
		class172_2727_.anInt1823
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9034
					    [class172.anInt1814 * 1404619919]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9043[(class172.anInt1814
							     * 1404619919)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9041
					      [(class172.anInt1814
						* 1404619919)])))) * 880720549;
		class172_2727_.anInt1817
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9034[(class172.anInt1814
							    * 1404619919)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9043
					       [(class172.anInt1814
						 * 1404619919)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9041
					       [(class172.anInt1814
						 * 1404619919)]))))
		       * -487629419);
		class172_2727_.anInt1818
		    = (int) (class433.aFloatArray4853[12]
			     + ((class433.aFloatArray4853[0]
				 * (float) (anIntArray9034
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[4]
				   * (float) anIntArray9043[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[8]
				   * (float) (anIntArray9041
					      [(class172.anInt1812
						* 496404005)])))) * 1861716229;
		class172_2727_.anInt1808
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9034
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9043[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9041
					      [(class172.anInt1812
						* 496404005)])))) * 968631629;
		class172_2727_.anInt1819
		    = (int) (class433.aFloatArray4853[14]
			     + ((class433.aFloatArray4853[2]
				 * (float) (anIntArray9034
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[6]
				   * (float) anIntArray9043[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[10]
				   * (float) (anIntArray9041
					      [(class172.anInt1812
						* 496404005)])))) * -337212495;
		class172_2727_.anInt1821
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9034[(class172.anInt1813
							    * 1123614299)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9043
					       [(class172.anInt1813
						 * 1123614299)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9041
					       [(class172.anInt1813
						 * 1123614299)]))))
		       * -289878931);
		class172_2727_.anInt1822
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9034
					    [class172.anInt1813 * 1123614299]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9043[(class172.anInt1813
							     * 1123614299)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9041
					      [(class172.anInt1813
						* 1123614299)])))) * 286740539;
		class172_2727_.anInt1820
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9034[(class172.anInt1813
							    * 1123614299)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9043
					       [(class172.anInt1813
						 * 1123614299)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9041
					       [(class172.anInt1813
						 * 1123614299)]))))
		       * -2010684097);
	    }
	}
	if (aClass158Array9085 != null) {
	    for (int i = 0; i < aClass158Array9085.length; i++) {
		Class158 class158 = aClass158Array9085[i];
		Class158 class158_2728_ = class158;
		if (class158.aClass158_1748 != null)
		    class158_2728_ = class158.aClass158_1748;
		if (class158.aClass433_1747 != null)
		    class158.aClass433_1747.method6842(class433);
		else
		    class158.aClass433_1747 = new Class433(class433);
		class158_2728_.anInt1750
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9034[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9043
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9041
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * 1976103833);
		class158_2728_.anInt1751
		    = ((int) (class433.aFloatArray4853[13]
			      + ((class433.aFloatArray4853[1]
				  * (float) anIntArray9034[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[5]
				    * (float) (anIntArray9043
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[9]
				    * (float) (anIntArray9041
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * 1216251817);
		class158_2728_.anInt1749
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9034[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9043
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9041
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * -1645064349);
	    }
	}
    }
    
    public void method3037(Class446 class446, int i, boolean bool) {
	if (aShortArray9048 != null) {
	    Class446 class446_2729_ = class446;
	    if (bool) {
		class446_2729_ = aClass185_Sub3_9029.aClass446_9618;
		class446_2729_.method7242(class446);
	    }
	    float[] fs = new float[3];
	    for (int i_2730_ = 0; i_2730_ < anInt9057; i_2730_++) {
		if ((i & aShortArray9048[i_2730_]) != 0) {
		    class446_2729_.method7255((float) anIntArray9034[i_2730_],
					      (float) anIntArray9043[i_2730_],
					      (float) anIntArray9041[i_2730_],
					      fs);
		    anIntArray9034[i_2730_] = (int) fs[0];
		    anIntArray9043[i_2730_] = (int) fs[1];
		    anIntArray9041[i_2730_] = (int) fs[2];
		}
	    }
	}
    }
    
    public Class183 method3070(byte i, int i_2731_, boolean bool) {
	boolean bool_2732_ = false;
	Class183_Sub1 class183_sub1_2733_;
	Class183_Sub1 class183_sub1_2734_;
	if (i > 0 && i <= 8) {
	    class183_sub1_2734_
		= aClass185_Sub3_9029.aClass183_Sub1Array9709[i - 1];
	    class183_sub1_2733_
		= aClass185_Sub3_9029.aClass183_Sub1Array9707[i - 1];
	    bool_2732_ = true;
	} else
	    class183_sub1_2733_ = class183_sub1_2734_
		= new Class183_Sub1(aClass185_Sub3_9029);
	return method14532(class183_sub1_2733_, class183_sub1_2734_, i_2731_,
			   bool_2732_, bool);
    }
    
    int method14577(int i, short i_2735_, int i_2736_, byte i_2737_) {
	int i_2738_ = Class661.anIntArray8549[method14544(i, i_2736_)];
	if (i_2735_ != -1) {
	    Class186 class186 = aClass185_Sub3_9029.aClass177_2012
				    .method2931(i_2735_ & 0xffff, (byte) 1);
	    int i_2739_ = class186.aByte2074 & 0xff;
	    if (i_2739_ != 0) {
		int i_2740_;
		if (i_2736_ < 0)
		    i_2740_ = 0;
		else if (i_2736_ > 127)
		    i_2740_ = 16777215;
		else
		    i_2740_ = 131586 * i_2736_;
		if (i_2739_ == 256)
		    i_2738_ = i_2740_;
		else {
		    int i_2741_ = i_2739_;
		    int i_2742_ = 256 - i_2739_;
		    i_2738_ = ((((i_2740_ & 0xff00ff) * i_2741_
				 + (i_2738_ & 0xff00ff) * i_2742_)
				& ~0xff00ff)
			       + (((i_2740_ & 0xff00) * i_2741_
				   + (i_2738_ & 0xff00) * i_2742_)
				  & 0xff0000)) >> 8;
		}
	    }
	    int i_2743_ = class186.aByte2059 & 0xff;
	    if (i_2743_ != 0) {
		i_2743_ += 256;
		int i_2744_ = ((i_2738_ & 0xff0000) >> 16) * i_2743_;
		if (i_2744_ > 65535)
		    i_2744_ = 65535;
		int i_2745_ = ((i_2738_ & 0xff00) >> 8) * i_2743_;
		if (i_2745_ > 65535)
		    i_2745_ = 65535;
		int i_2746_ = (i_2738_ & 0xff) * i_2743_;
		if (i_2746_ > 65535)
		    i_2746_ = 65535;
		i_2738_
		    = (i_2744_ << 8 & 0xff0000) + (i_2745_ & 0xff00) + (i_2746_
									>> 8);
	    }
	}
	return i_2738_ << 8 | 255 - (i_2737_ & 0xff);
    }
    
    static final int method14578(int i, int i_2747_) {
	i_2747_ = i_2747_ * (i & 0x7f) >> 7;
	if (i_2747_ < 2)
	    i_2747_ = 2;
	else if (i_2747_ > 126)
	    i_2747_ = 126;
	return (i & 0xff80) + i_2747_;
    }
    
    public void method3076() {
	if (anInt9044 > 0 && anInt9053 > 0) {
	    method14542(false);
	    if ((aByte9065 & 0x10) == 0
		&& aClass132_9066.anInterface16_1580 == null)
		method14541(false);
	    method14556();
	}
    }
    
    static final int method14579(int i, int i_2748_) {
	i_2748_ = i_2748_ * (i & 0x7f) >> 7;
	if (i_2748_ < 2)
	    i_2748_ = 2;
	else if (i_2748_ > 126)
	    i_2748_ = 126;
	return (i & 0xff80) + i_2748_;
    }
    
    static final int method14580(int i, int i_2749_) {
	i_2749_ = i_2749_ * (i & 0x7f) >> 7;
	if (i_2749_ < 2)
	    i_2749_ = 2;
	else if (i_2749_ > 126)
	    i_2749_ = 126;
	return (i & 0xff80) + i_2749_;
    }
}
