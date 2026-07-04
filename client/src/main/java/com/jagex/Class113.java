/* Class113 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.File;
import java.io.IOException;

public class Class113
{
    static int anInt1365;
    static boolean aBool1366 = false;
    static boolean aBool1367 = false;
    static int[] anIntArray1368 = new int[4];
    static Class700 aClass700_1369;
    static final double aDouble1370 = 100.0;
    static int[] anIntArray1371;
    static int[] anIntArray1372;
    static boolean aBool1373;
    static boolean[][] aBoolArrayArray1374;
    public static int anInt1375;
    public static int anInt1376;
    static int[] anIntArray1377;
    static boolean aBool1378;
    static final int anInt1379 = 48;
    static int anInt1380;
    static int anInt1381 = 1312565957;
    
    static void method2020(Class247 class247, Class145 class145, int i,
			   int i_0_, int i_1_, int i_2_, Class163 class163) {
	Class30.method879(class247, class145, i, i_0_, i_1_, i_2_, class163,
			  100.0, Class284.aClass284_3072,
			  Class280.aClass280_3056, -1224569903);
    }
    
    static boolean method2021(Class185 class185, int i) {
	class185.method3581();
	Class250.method4604((byte) -66);
	if (!class185.method3669(1819862316))
	    return false;
	int i_3_ = client.aClass512_11100.method8417(1833162560);
	int i_4_ = client.aClass512_11100.method8418(-1533611049);
	Class468 class468 = client.aClass512_11100.method8552((byte) 0);
	Class556 class556 = client.aClass512_11100.method8424((byte) 43);
	int i_5_ = i;
	if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419 != null) {
	    int i_6_ = ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			 .anIntArray11977[0])
			>> 3);
	    int i_7_ = ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			 .anIntArray11978[0])
			>> 3);
	    if (i_6_ >= 0 && i_6_ < aBoolArrayArray1374.length && i_7_ >= 0
		&& i_7_ < aBoolArrayArray1374[i_6_].length
		&& aBoolArrayArray1374[i_6_][i_7_])
		i_5_ = 0;
	}
	int i_8_ = i_3_ / 2;
	int i_9_ = 0;
	int i_10_ = 0;
	boolean bool = true;
	for (int i_11_ = i_9_; i_11_ < i_9_ + i_3_; i_11_++) {
	    for (int i_12_ = i_10_; i_12_ < i_4_ + i_10_; i_12_++) {
		for (int i_13_ = i_5_; i_13_ <= 3; i_13_++) {
		    if (i_13_ < i || class468.method7609(i, i_13_, i_11_,
							 i_12_, 2130719532)) {
			int i_14_ = i_13_;
			if (class468.method7612(i_11_, i_12_, (byte) 0))
			    i_14_--;
			if (i_14_ >= 0)
			    bool &= Class260.method4806(i_14_, i_11_, i_12_,
							-468987324);
		    }
		}
	    }
	}
	if (!bool)
	    return false;
	int i_15_ = i_3_ * 4 + 48 + 48;
	int[] is = new int[i_15_ * i_15_];
	for (int i_16_ = 0; i_16_ < is.length; i_16_++)
	    is[i_16_] = 0;
	Class175_Sub1 class175_sub1 = null;
	int i_17_ = 0;
	int i_18_ = 0;
	if (aBool1367) {
	    Class613.aClass163_8025
		= class185.method3315(i_15_, i_15_, false, true);
	    class175_sub1 = class185.method3263();
	    class175_sub1.method15075(0, Class613.aClass163_8025.method2651());
	    Interface21 interface21 = class185.method3265(i_15_, i_15_);
	    class175_sub1.method15074(interface21);
	    class185.method3260(class175_sub1, 1898371138);
	    i_8_ = i_3_;
	    i_17_ = 48;
	    i_18_ = 48;
	    class185.method3340(1, 0);
	} else
	    Class613.aClass163_8025
		= class185.method3317(is, 0, i_15_, i_15_, i_15_, (byte) 88);
	client.aClass512_11100.method8501((byte) -27).method10176((byte) 1);
	int i_19_
	    = ~0xffffff | ((238 + (int) (Math.random() * 20.0) - 10 << 16)
			   + (238 + (int) (Math.random() * 20.0) - 10 << 8)
			   + (238 + (int) (Math.random() * 20.0) - 10));
	int i_20_ = ~0xffffff | 238 + (int) (Math.random() * 20.0) - 10 << 16;
	int i_21_ = ((int) (Math.random() * 8.0) << 16
		     | (int) (Math.random() * 8.0) << 8
		     | (int) (Math.random() * 8.0));
	boolean[][] bools = new boolean[2 + (1 + i_8_)][2 + (i_8_ + 1)];
	class185.method3283(anIntArray1368);
	class185.method3281();
	for (int i_22_ = i_9_; i_22_ < i_9_ + i_3_; i_22_ += i_8_) {
	    for (int i_23_ = i_10_; i_23_ < i_4_ + i_10_; i_23_ += i_8_) {
		int i_24_ = i_17_;
		int i_25_ = i_18_;
		int i_26_ = i_22_;
		if (i_26_ > 0) {
		    i_26_--;
		    i_24_ += 4;
		}
		int i_27_ = i_23_;
		if (i_27_ > 0)
		    i_27_--;
		int i_28_ = i_22_ + i_8_;
		if (i_28_ < i_3_)
		    i_28_++;
		int i_29_ = i_23_ + i_8_;
		if (i_29_ < i_4_) {
		    i_29_++;
		    i_25_ += 4;
		}
		if (aBool1366)
		    class185.method3537();
		else
		    class185.method3373(0, 0, i_24_ + 4 * i_8_,
					4 * i_8_ + i_25_);
		class185.method3340(3, -16777216);
		int i_30_ = i_8_;
		if (i_30_ > i_3_ - 1)
		    i_30_ = i_3_ - 1;
		for (int i_31_ = i_5_; i_31_ <= 3; i_31_++) {
		    for (int i_32_ = 0; i_32_ <= i_30_; i_32_++) {
			for (int i_33_ = 0; i_33_ <= i_30_; i_33_++)
			    bools[i_32_][i_33_]
				= (i_31_ < i
				   || class468.method7609(i, i_31_,
							  i_26_ + i_32_,
							  i_33_ + i_27_,
							  2037611597));
		    }
		    class556.aClass151Array7434[i_31_].method2527(i_17_, i_18_,
								  1024, i_26_,
								  i_27_, i_28_,
								  i_29_,
								  bools);
		    for (int i_34_ = -4; i_34_ < i_8_; i_34_++) {
			for (int i_35_ = -4; i_35_ < i_8_; i_35_++) {
			    int i_36_ = i_34_ + i_22_;
			    int i_37_ = i_35_ + i_23_;
			    if (i_36_ >= i_9_ && i_37_ >= i_10_
				&& (i_31_ < i
				    || class468.method7609(i, i_31_, i_36_,
							   i_37_,
							   1997353673))) {
				int i_38_ = i_31_;
				if (class468.method7612(i_36_, i_37_,
							(byte) 0))
				    i_38_--;
				if (i_38_ >= 0)
				    Class369.method6377(class185, i_38_, i_36_,
							i_37_,
							4 * i_34_ + i_24_,
							(i_25_
							 + 4 * (i_8_ - i_35_)
							 - 4),
							i_19_, i_20_,
							-1145942751);
			    }
			}
		    }
		}
		class185.method3298(i_24_, i_25_, i_8_ * 4, 4 * i_8_, i_21_,
				    2);
		class185.method3581();
		if (!aBool1367) {
		    Class613.aClass163_8025.method2717(4 * (i_22_ - i_9_) + 48,
						       (48 + i_4_ * 4
							- (i_23_ - i_10_) * 4
							- 4 * i_8_),
						       4 * i_8_, i_8_ * 4,
						       i_24_, i_25_);
		    if (aBool1366) {
			Class613.aClass163_8025.method2656(256, 0);
			try {
			    class185.method3289(1659124707);
			    Class251.method4622(2000L);
			} catch (Exception exception) {
			    /* empty */
			}
		    }
		}
	    }
	}
	if (aBool1367) {
	    class185.method3261(class175_sub1, -11578496);
	    if (aBool1366) {
		Class613.aClass163_8025.method2656(256, 0);
		try {
		    class185.method3289(1855934599);
		    Class251.method4622(2000L);
		} catch (Exception exception) {
		    /* empty */
		}
	    }
	}
	class185.method3537();
	class185.method3318(anIntArray1368[0], anIntArray1368[1],
			    anIntArray1368[2], anIntArray1368[3]);
	class185.method3340(1, 1);
	Class422.method6785((byte) -82);
	anInt1380 = 0;
	aClass700_1369.method14152(-1059561503);
	if (!aBool1378) {
	    Class690_Sub27.method17128(i, 1946406670);
	    Class523 class523 = client.aClass512_11100.method8419(-323625667);
	    if (null != class523) {
		Class222.aClass44_Sub9_2313.method17322(1024, 64, 1851064094);
		Class597 class597
		    = client.aClass512_11100.method8416((byte) 44);
		for (int i_39_ = 0; i_39_ < -942354647 * class523.anInt7086;
		     i_39_++) {
		    int i_40_ = class523.anIntArray7085[i_39_];
		    if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aByte10854
			== i_40_ >> 28) {
			int i_41_ = ((i_40_ >> 14 & 0x3fff)
				     - -424199969 * class597.anInt7859);
			int i_42_ = ((i_40_ & 0x3fff)
				     - class597.anInt7861 * -1166289421);
			if (i_41_ >= 0 && i_41_ < i_3_ && i_42_ >= 0
			    && i_42_ < i_4_)
			    aClass700_1369.method14131
				(new Class534_Sub39(i_39_), (short) 789);
			else {
			    Class272 class272
				= ((Class272)
				   (Class222.aClass44_Sub9_2313.method91
				    (class523.anIntArray7084[i_39_],
				     -1466518784)));
			    if (class272.anIntArray2992 != null
				&& i_41_ + class272.anInt3005 * -321707117 >= 0
				&& (i_41_ + 1863424643 * class272.anInt2993
				    < i_3_)
				&& i_42_ + -967887583 * class272.anInt2996 >= 0
				&& (i_42_ + class272.anInt2989 * 148212907
				    < i_4_))
				aClass700_1369.method14131
				    (new Class534_Sub39(i_39_), (short) 789);
			}
		    }
		}
		Class222.aClass44_Sub9_2313.method17322(128, 64, 1343420595);
	    }
	}
	return true;
    }
    
    static void method2022(int i, int i_43_, Class247 class247,
			   Class246 class246, int i_44_, int i_45_) {
	Class99[] class99s = client.aClass99Array11053;
	for (int i_46_ = 0; i_46_ < class99s.length; i_46_++) {
	    Class99 class99 = class99s[i_46_];
	    if (class99 != null && 0 != class99.anInt1176 * 652406965
		&& client.anInt11101 % 20 < 10) {
		if (1 == class99.anInt1176 * 652406965) {
		    Class534_Sub6 class534_sub6
			= ((Class534_Sub6)
			   (client.aClass9_11331.method579
			    ((long) (class99.anInt1169 * -879249997))));
		    if (class534_sub6 != null) {
			Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
			    = ((Class654_Sub1_Sub5_Sub1_Sub1)
			       class534_sub6.anObject10417);
			Class438 class438
			    = (class654_sub1_sub5_sub1_sub1.method10807()
			       .aClass438_4885);
			int i_47_ = (int) class438.aFloat4864 / 128 - i / 128;
			int i_48_
			    = (int) class438.aFloat4865 / 128 - i_43_ / 128;
			Class15.method724(class247, class246, i_44_, i_45_,
					  i_47_, i_48_,
					  class99.anInt1177 * -1562758755,
					  360000L);
		    }
		}
		if (class99.anInt1176 * 652406965 == 2) {
		    int i_49_ = 487170425 * class99.anInt1171 / 128 - i / 128;
		    int i_50_
			= class99.anInt1172 * 631467137 / 128 - i_43_ / 128;
		    long l = (long) (-41335265 * class99.anInt1175 << 7);
		    l *= l;
		    Class15.method724(class247, class246, i_44_, i_45_, i_49_,
				      i_50_, -1562758755 * class99.anInt1177,
				      l);
		}
		if (652406965 * class99.anInt1176 == 10
		    && class99.anInt1169 * -879249997 >= 0
		    && (-879249997 * class99.anInt1169
			< (client
			   .aClass654_Sub1_Sub5_Sub1_Sub2Array11279).length)) {
		    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
			= (client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279
			   [-879249997 * class99.anInt1169]);
		    if (null != class654_sub1_sub5_sub1_sub2) {
			Class438 class438
			    = (class654_sub1_sub5_sub1_sub2.method10807()
			       .aClass438_4885);
			int i_51_ = (int) class438.aFloat4864 / 128 - i / 128;
			int i_52_
			    = (int) class438.aFloat4865 / 128 - i_43_ / 128;
			Class15.method724(class247, class246, i_44_, i_45_,
					  i_51_, i_52_,
					  class99.anInt1177 * -1562758755,
					  360000L);
		    }
		}
	    }
	}
    }
    
    static void method2023(Class247 class247, Class145 class145, int i,
			   int i_53_, int i_54_, int i_55_, int i_56_,
			   String string, Class171 class171, Class16 class16,
			   int i_57_) {
	int i_58_;
	if (3 == -891094135 * Class10.anInt75)
	    i_58_ = ((int) ((double) Class599.aClass298_Sub1_7871
					 .method5389(-121936694)
			    * 2607.5945876176133)
		     + -2045337339 * client.anInt11189) & 0x3fff;
	else if (5 == -891094135 * Class10.anInt75)
	    i_58_ = (int) client.aFloat11140 & 0x3fff;
	else
	    i_58_ = ((int) client.aFloat11140 + client.anInt11189 * -2045337339
		     & 0x3fff);
	int i_59_ = (Math.max(-881188269 * class247.anInt2468 / 2,
			      class247.anInt2469 * -1279656873 / 2)
		     + 10);
	int i_60_ = i_54_ * i_54_ + i_55_ * i_55_;
	if (i_60_ <= i_59_ * i_59_) {
	    int i_61_ = Class427.anIntArray4806[i_58_];
	    int i_62_ = Class427.anIntArray4805[i_58_];
	    if (5 != -891094135 * Class10.anInt75) {
		i_61_ = i_61_ * 256 / (-2002513841 * client.anInt11022 + 256);
		i_62_ = i_62_ * 256 / (-2002513841 * client.anInt11022 + 256);
	    }
	    int i_63_ = i_55_ * i_61_ + i_54_ * i_62_ >> 14;
	    int i_64_ = i_55_ * i_62_ - i_61_ * i_54_ >> 14;
	    int i_65_ = class16.method747(string, 100, null, -355324020);
	    int i_66_ = class16.method737(string, 100, 0, null, 2112849964);
	    i_63_ -= i_65_ / 2;
	    if (i_63_ >= -(class247.anInt2468 * -881188269)
		&& i_63_ <= -881188269 * class247.anInt2468
		&& i_64_ >= -(-1279656873 * class247.anInt2469)
		&& i_64_ <= class247.anInt2469 * -1279656873)
		class171.method2844(string,
				    (-881188269 * class247.anInt2468 / 2
				     + (i + i_63_)),
				    (class247.anInt2469 * -1279656873 / 2
				     + i_53_ - i_64_ - i_56_ - i_66_),
				    i_65_, 50, i_57_, 0, 1, 0, 0, null, null,
				    class145, i, i_53_, 202025040);
	}
    }
    
    static void method2024(Class247 class247, Class145 class145, int i,
			   int i_67_, int i_68_, int i_69_, Class163 class163,
			   double d, Class284 class284, Class280 class280) {
	if (null != class163) {
	    int i_70_;
	    if (3 == Class10.anInt75 * -891094135)
		i_70_ = ((int) ((double) Class599.aClass298_Sub1_7871
					     .method5389(-2043839805)
				* 2607.5945876176133)
			 + -2045337339 * client.anInt11189) & 0x3fff;
	    else if (Class10.anInt75 * -891094135 == 5)
		i_70_ = (int) client.aFloat11140 & 0x3fff;
	    else
		i_70_ = ((int) client.aFloat11140
			 + -2045337339 * client.anInt11189) & 0x3fff;
	    int i_71_ = (Math.max(-881188269 * class247.anInt2468 / 2,
				  class247.anInt2469 * -1279656873 / 2)
			 + 10);
	    int i_72_ = i_68_ * i_68_ + i_69_ * i_69_;
	    if (i_72_ <= i_71_ * i_71_) {
		int i_73_ = Class427.anIntArray4806[i_70_];
		int i_74_ = Class427.anIntArray4805[i_70_];
		if (-891094135 * Class10.anInt75 != 5) {
		    i_73_ = i_73_ * 256 / (256
					   + client.anInt11022 * -2002513841);
		    i_74_ = 256 * i_74_ / (256
					   + -2002513841 * client.anInt11022);
		}
		int i_75_ = i_74_ * i_68_ + i_73_ * i_69_ >> 14;
		int i_76_ = i_74_ * i_69_ - i_73_ * i_68_ >> 14;
		double d_77_ = d / 100.0;
		switch (-1448550931 * class284.anInt3069) {
		case 0:
		    i = (i + -881188269 * class247.anInt2468 / 2 + i_75_
			 - (int) ((double) class163.method22() * d_77_));
		    break;
		case 2:
		    i = -881188269 * class247.anInt2468 / 2 + i + i_75_;
		    break;
		case 1:
		    i = (-881188269 * class247.anInt2468 / 2 + i + i_75_
			 - (int) ((double) (class163.method22() / 2) * d_77_));
		    break;
		}
		switch (-1863758235 * class280.anInt3057) {
		case 2:
		    i_67_
			= (class247.anInt2469 * -1279656873 / 2 + i_67_ - i_76_
			   - (int) ((double) (class163.method2692() / 2)
				    * d_77_));
		    break;
		case 0:
		    i_67_
			= (i_67_ + -1279656873 * class247.anInt2469 / 2 - i_76_
			   - (int) ((double) class163.method2692() * d_77_));
		    break;
		case 1:
		    i_67_
			= -1279656873 * class247.anInt2469 / 2 + i_67_ - i_76_;
		    break;
		}
		if (class145 != null) {
		    if (1.0 == d_77_)
			class163.method2691(i, i_67_, class145, i, i_67_);
		    else
			class163.method2659(i, i_67_,
					    (int) ((double) class163.method22()
						   * d_77_),
					    (int) ((double) class163
								.method2692()
						   * d_77_));
		} else {
		    if (1.0 == d_77_)
			class163.method2656(i, i_67_);
		    class163.method2659(i, i_67_,
					(int) ((double) class163.method22()
					       * d_77_),
					(int) ((double) class163.method2692()
					       * d_77_));
		}
	    }
	}
    }
    
    public static void method2025() {
	Class613.aClass163_8025 = null;
	anInt1381 = 1312565957;
    }
    
    public static void method2026() {
	Class613.aClass163_8025 = null;
	anInt1381 = 1312565957;
    }
    
    public static void method2027() {
	Class613.aClass163_8025 = null;
	anInt1381 = 1312565957;
    }
    
    static void method2028(Class185 class185, Class145 class145,
			   Class247 class247, int i, int i_78_, int i_79_,
			   int i_80_, int i_81_) {
	Class272 class272
	    = ((Class272)
	       Class222.aClass44_Sub9_2313.method91(i_81_, 1046955649));
	if (null != class272 && class272.anIntArray2981 != null
	    && class272.method5063(Class78.aClass103_825,
				   Class78.aClass103_825, (short) 11778))
	    class272 = class272.method5052(Class78.aClass103_825,
					   Class78.aClass103_825, 707377656);
	if (null != class272 && class272.aBool2979
	    && class272.method5063(Class78.aClass103_825,
				   Class78.aClass103_825, (short) 4163)) {
	    if (null != class272.anIntArray2992) {
		int[] is = new int[class272.anIntArray2992.length];
		for (int i_82_ = 0; i_82_ < is.length / 2; i_82_++) {
		    int i_83_;
		    if (3 == -891094135 * Class10.anInt75)
			i_83_ = ((int) ((double) Class599
						     .aClass298_Sub1_7871
						     .method5389(-2006132579)
					* 2607.5945876176133)
				 + client.anInt11189 * -2045337339) & 0x3fff;
		    else if (5 == Class10.anInt75 * -891094135)
			i_83_ = (int) client.aFloat11140 & 0x3fff;
		    else
			i_83_ = ((int) client.aFloat11140
				 + client.anInt11189 * -2045337339) & 0x3fff;
		    int i_84_ = Class427.anIntArray4806[i_83_];
		    int i_85_ = Class427.anIntArray4805[i_83_];
		    if (-891094135 * Class10.anInt75 != 5) {
			i_84_ = i_84_ * 256 / (client.anInt11022 * -2002513841
					       + 256);
			i_85_ = (i_85_ * 256
				 / (256 + client.anInt11022 * -2002513841));
		    }
		    is[i_82_ * 2]
			= (i + class247.anInt2468 * -881188269 / 2
			   + ((i_85_ * (i_79_ + 4 * (class272.anIntArray2992
						     [2 * i_82_]))
			       + (class272.anIntArray2992[i_82_ * 2 + 1] * 4
				  + i_80_) * i_84_)
			      >> 14));
		    is[1 + i_82_ * 2]
			= (class247.anInt2469 * -1279656873 / 2 + i_78_
			   - ((((i_80_
				 + 4 * class272.anIntArray2992[i_82_ * 2 + 1])
				* i_85_)
			       - ((i_79_
				   + 4 * class272.anIntArray2992[2 * i_82_])
				  * i_84_))
			      >> 14));
		}
		Class246 class246 = class247.method4525(class185, 447549967);
		if (null != class246)
		    Class182.method2992(class185, is,
					class272.anInt2997 * 1393455813,
					class246.anIntArray2422,
					class246.anIntArray2421);
		if (685328963 * class272.anInt3011 > 0) {
		    for (int i_86_ = 0; i_86_ < is.length / 2 - 1; i_86_++) {
			int i_87_ = is[2 * i_86_];
			int i_88_ = is[i_86_ * 2 + 1];
			int i_89_ = is[2 * (1 + i_86_)];
			int i_90_ = is[2 * (i_86_ + 1) + 1];
			if (i_89_ < i_87_) {
			    int i_91_ = i_87_;
			    int i_92_ = i_88_;
			    i_87_ = i_89_;
			    i_88_ = i_90_;
			    i_89_ = i_91_;
			    i_90_ = i_92_;
			} else if (i_87_ == i_89_ && i_90_ < i_88_) {
			    int i_93_ = i_88_;
			    i_88_ = i_90_;
			    i_90_ = i_93_;
			}
			if (null != class145)
			    class185.method3306
				(i_87_, i_88_, i_89_, i_90_,
				 (class272.anIntArray2986
				  [class272.aByteArray3006[i_86_] & 0xff]),
				 1, class145, i, i_78_,
				 class272.anInt3011 * 685328963,
				 1781521033 * class272.anInt2999,
				 class272.anInt3000 * 290033855);
			else
			    class185.method3305
				(i_87_, i_88_, i_89_, i_90_,
				 (class272.anIntArray2986
				  [class272.aByteArray3006[i_86_] & 0xff]),
				 1, class272.anInt3011 * 685328963,
				 1781521033 * class272.anInt2999,
				 290033855 * class272.anInt3000);
		    }
		    int i_94_ = is[is.length - 2];
		    int i_95_ = is[is.length - 1];
		    int i_96_ = is[0];
		    int i_97_ = is[1];
		    if (i_96_ < i_94_) {
			int i_98_ = i_94_;
			int i_99_ = i_95_;
			i_94_ = i_96_;
			i_95_ = i_97_;
			i_96_ = i_98_;
			i_97_ = i_99_;
		    } else if (i_94_ == i_96_ && i_97_ < i_95_) {
			int i_100_ = i_95_;
			i_95_ = i_97_;
			i_97_ = i_100_;
		    }
		    if (class145 != null)
			class185.method3306(i_94_, i_95_, i_96_, i_97_,
					    (class272.anIntArray2986
					     [(class272.aByteArray3006
					       [(class272.aByteArray3006.length
						 - 1)]) & 0xff]),
					    1, class145, i, i_78_,
					    class272.anInt3011 * 685328963,
					    class272.anInt2999 * 1781521033,
					    290033855 * class272.anInt3000);
		    else
			class185.method3305(i_94_, i_95_, i_96_, i_97_,
					    (class272.anIntArray2986
					     [(class272.aByteArray3006
					       [(class272.aByteArray3006.length
						 - 1)]) & 0xff]),
					    1, 685328963 * class272.anInt3011,
					    1781521033 * class272.anInt2999,
					    class272.anInt3000 * 290033855);
		} else if (null != class145) {
		    for (int i_101_ = 0; i_101_ < is.length / 2 - 1; i_101_++)
			class185.method3384(is[i_101_ * 2], is[1 + 2 * i_101_],
					    is[2 * (i_101_ + 1)],
					    is[2 * (1 + i_101_) + 1],
					    (class272.anIntArray2986
					     [(class272.aByteArray3006[i_101_]
					       & 0xff)]),
					    1, class145, i, i_78_);
		    class185.method3384(is[is.length - 2], is[is.length - 1],
					is[0], is[1],
					(class272.anIntArray2986
					 [(class272.aByteArray3006
					   [(class272.aByteArray3006.length
					     - 1)]) & 0xff]),
					1, class145, i, i_78_);
		} else {
		    for (int i_102_ = 0; i_102_ < is.length / 2 - 1; i_102_++)
			class185.method3303(is[2 * i_102_], is[1 + i_102_ * 2],
					    is[2 * (1 + i_102_)],
					    is[2 * (1 + i_102_) + 1],
					    (class272.anIntArray2986
					     [(class272.aByteArray3006[i_102_]
					       & 0xff)]),
					    1);
		    class185.method3303(is[is.length - 2], is[is.length - 1],
					is[0], is[1],
					(class272.anIntArray2986
					 [(class272.aByteArray3006
					   [(class272.aByteArray3006.length
					     - 1)]) & 0xff]),
					1);
		}
	    }
	    Class163 class163 = null;
	    if (-1 != 1747122653 * class272.anInt2967) {
		class163 = class272.method5047(class185, false, -773745644);
		if (class163 != null) {
		    int i_103_
			= (class272.anInt3007 * 1484992485 > 0
			   ? class272.anInt3007 * 1484992485
			   : 1515024757 * Class620.aClass632_8113.anInt8267);
		    Class30.method879(class247, class145, i, i_78_, i_79_,
				      i_80_, class163, (double) i_103_,
				      class272.aClass284_3003,
				      class272.aClass280_3004, -1040526428);
		}
	    }
	    if (null != class272.aString2969) {
		int i_104_ = 0;
		if (null != class163)
		    i_104_ = class163.method2649();
		Class171 class171 = Class219.aClass171_2307;
		Class16 class16 = Class690_Sub9.aClass16_10875;
		if (class272.anInt2985 * 638004337 == 1) {
		    class171 = Class539_Sub1.aClass171_10327;
		    class16 = Class67.aClass16_720;
		}
		if (class272.anInt2985 * 638004337 == 2) {
		    class171 = Class231.aClass171_2325;
		    class16 = Class322.aClass16_3420;
		}
		Class575.method9758(class247, class145, i, i_78_, i_79_, i_80_,
				    i_104_, class272.aString2969, class171,
				    class16, -1512587879 * class272.anInt2970,
				    (byte) 1);
	    }
	}
    }
    
    public static void method2029() {
	anInt1381 = 1312565957;
    }
    
    public static void method2030() {
	int i = client.aClass512_11100.method8417(410558870);
	int i_105_ = client.aClass512_11100.method8418(-1533611049);
	aBoolArrayArray1374 = new boolean[i >> 3][i_105_ >> 3];
    }
    
    public static void method2031() {
	int i = client.aClass512_11100.method8417(444649642);
	int i_106_ = client.aClass512_11100.method8418(-1533611049);
	aBoolArrayArray1374 = new boolean[i >> 3][i_106_ >> 3];
    }
    
    static void method2032(Class247 class247, Class145 class145, int i,
			   int i_107_, int i_108_, int i_109_,
			   Class163 class163, double d, Class284 class284,
			   Class280 class280) {
	if (null != class163) {
	    int i_110_;
	    if (3 == Class10.anInt75 * -891094135)
		i_110_ = ((int) ((double) Class599.aClass298_Sub1_7871
					      .method5389(-418014646)
				 * 2607.5945876176133)
			  + -2045337339 * client.anInt11189) & 0x3fff;
	    else if (Class10.anInt75 * -891094135 == 5)
		i_110_ = (int) client.aFloat11140 & 0x3fff;
	    else
		i_110_ = ((int) client.aFloat11140
			  + -2045337339 * client.anInt11189) & 0x3fff;
	    int i_111_ = (Math.max(-881188269 * class247.anInt2468 / 2,
				   class247.anInt2469 * -1279656873 / 2)
			  + 10);
	    int i_112_ = i_108_ * i_108_ + i_109_ * i_109_;
	    if (i_112_ <= i_111_ * i_111_) {
		int i_113_ = Class427.anIntArray4806[i_110_];
		int i_114_ = Class427.anIntArray4805[i_110_];
		if (-891094135 * Class10.anInt75 != 5) {
		    i_113_
			= i_113_ * 256 / (256
					  + client.anInt11022 * -2002513841);
		    i_114_
			= 256 * i_114_ / (256
					  + -2002513841 * client.anInt11022);
		}
		int i_115_ = i_114_ * i_108_ + i_113_ * i_109_ >> 14;
		int i_116_ = i_114_ * i_109_ - i_113_ * i_108_ >> 14;
		double d_117_ = d / 100.0;
		switch (-1448550931 * class284.anInt3069) {
		case 0:
		    i = (i + -881188269 * class247.anInt2468 / 2 + i_115_
			 - (int) ((double) class163.method22() * d_117_));
		    break;
		case 2:
		    i = -881188269 * class247.anInt2468 / 2 + i + i_115_;
		    break;
		case 1:
		    i = (-881188269 * class247.anInt2468 / 2 + i + i_115_
			 - (int) ((double) (class163.method22() / 2)
				  * d_117_));
		    break;
		}
		switch (-1863758235 * class280.anInt3057) {
		case 2:
		    i_107_ = (class247.anInt2469 * -1279656873 / 2 + i_107_
			      - i_116_
			      - (int) ((double) (class163.method2692() / 2)
				       * d_117_));
		    break;
		case 0:
		    i_107_
			= (i_107_ + -1279656873 * class247.anInt2469 / 2
			   - i_116_
			   - (int) ((double) class163.method2692() * d_117_));
		    break;
		case 1:
		    i_107_ = (-1279656873 * class247.anInt2469 / 2 + i_107_
			      - i_116_);
		    break;
		}
		if (class145 != null) {
		    if (1.0 == d_117_)
			class163.method2691(i, i_107_, class145, i, i_107_);
		    else
			class163.method2659(i, i_107_,
					    (int) ((double) class163.method22()
						   * d_117_),
					    (int) ((double) class163
								.method2692()
						   * d_117_));
		} else {
		    if (1.0 == d_117_)
			class163.method2656(i, i_107_);
		    class163.method2659(i, i_107_,
					(int) ((double) class163.method22()
					       * d_117_),
					(int) ((double) class163.method2692()
					       * d_117_));
		}
	    }
	}
    }
    
    static void method2033(Class185 class185) {
	if ((anInt1381 * 1936210931
	     != Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aByte10854)
	    && client.aClass512_11100.method8424((byte) 61) != null) {
	    Class250.method4604((byte) -122);
	    if (Class396.method6570(class185,
				    (Class322
				     .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				     .aByte10854),
				    (byte) -24))
		anInt1381
		    = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aByte10854
		       * -1312565957);
	}
    }
    
    static boolean method2034(Class185 class185, int i) {
	class185.method3581();
	Class250.method4604((byte) -58);
	if (!class185.method3669(1819862316))
	    return false;
	int i_118_ = client.aClass512_11100.method8417(1736960792);
	int i_119_ = client.aClass512_11100.method8418(-1533611049);
	Class468 class468 = client.aClass512_11100.method8552((byte) 0);
	Class556 class556 = client.aClass512_11100.method8424((byte) 125);
	int i_120_ = i;
	if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419 != null) {
	    int i_121_ = ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			   .anIntArray11977[0])
			  >> 3);
	    int i_122_ = ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			   .anIntArray11978[0])
			  >> 3);
	    if (i_121_ >= 0 && i_121_ < aBoolArrayArray1374.length
		&& i_122_ >= 0 && i_122_ < aBoolArrayArray1374[i_121_].length
		&& aBoolArrayArray1374[i_121_][i_122_])
		i_120_ = 0;
	}
	int i_123_ = i_118_ / 2;
	int i_124_ = 0;
	int i_125_ = 0;
	boolean bool = true;
	for (int i_126_ = i_124_; i_126_ < i_124_ + i_118_; i_126_++) {
	    for (int i_127_ = i_125_; i_127_ < i_119_ + i_125_; i_127_++) {
		for (int i_128_ = i_120_; i_128_ <= 3; i_128_++) {
		    if (i_128_ < i
			|| class468.method7609(i, i_128_, i_126_, i_127_,
					       2038723681)) {
			int i_129_ = i_128_;
			if (class468.method7612(i_126_, i_127_, (byte) 0))
			    i_129_--;
			if (i_129_ >= 0)
			    bool &= Class260.method4806(i_129_, i_126_, i_127_,
							1575305796);
		    }
		}
	    }
	}
	if (!bool)
	    return false;
	int i_130_ = i_118_ * 4 + 48 + 48;
	int[] is = new int[i_130_ * i_130_];
	for (int i_131_ = 0; i_131_ < is.length; i_131_++)
	    is[i_131_] = 0;
	Class175_Sub1 class175_sub1 = null;
	int i_132_ = 0;
	int i_133_ = 0;
	if (aBool1367) {
	    Class613.aClass163_8025
		= class185.method3315(i_130_, i_130_, false, true);
	    class175_sub1 = class185.method3263();
	    class175_sub1.method15075(0, Class613.aClass163_8025.method2651());
	    Interface21 interface21 = class185.method3265(i_130_, i_130_);
	    class175_sub1.method15074(interface21);
	    class185.method3260(class175_sub1, -971127621);
	    i_123_ = i_118_;
	    i_132_ = 48;
	    i_133_ = 48;
	    class185.method3340(1, 0);
	} else
	    Class613.aClass163_8025
		= class185.method3317(is, 0, i_130_, i_130_, i_130_, (byte) 7);
	client.aClass512_11100.method8501((byte) -44).method10176((byte) 1);
	int i_134_
	    = ~0xffffff | ((238 + (int) (Math.random() * 20.0) - 10 << 16)
			   + (238 + (int) (Math.random() * 20.0) - 10 << 8)
			   + (238 + (int) (Math.random() * 20.0) - 10));
	int i_135_ = ~0xffffff | 238 + (int) (Math.random() * 20.0) - 10 << 16;
	int i_136_ = ((int) (Math.random() * 8.0) << 16
		      | (int) (Math.random() * 8.0) << 8
		      | (int) (Math.random() * 8.0));
	boolean[][] bools = new boolean[2 + (1 + i_123_)][2 + (i_123_ + 1)];
	class185.method3283(anIntArray1368);
	class185.method3281();
	for (int i_137_ = i_124_; i_137_ < i_124_ + i_118_; i_137_ += i_123_) {
	    for (int i_138_ = i_125_; i_138_ < i_119_ + i_125_;
		 i_138_ += i_123_) {
		int i_139_ = i_132_;
		int i_140_ = i_133_;
		int i_141_ = i_137_;
		if (i_141_ > 0) {
		    i_141_--;
		    i_139_ += 4;
		}
		int i_142_ = i_138_;
		if (i_142_ > 0)
		    i_142_--;
		int i_143_ = i_137_ + i_123_;
		if (i_143_ < i_118_)
		    i_143_++;
		int i_144_ = i_138_ + i_123_;
		if (i_144_ < i_119_) {
		    i_144_++;
		    i_140_ += 4;
		}
		if (aBool1366)
		    class185.method3537();
		else
		    class185.method3373(0, 0, i_139_ + 4 * i_123_,
					4 * i_123_ + i_140_);
		class185.method3340(3, -16777216);
		int i_145_ = i_123_;
		if (i_145_ > i_118_ - 1)
		    i_145_ = i_118_ - 1;
		for (int i_146_ = i_120_; i_146_ <= 3; i_146_++) {
		    for (int i_147_ = 0; i_147_ <= i_145_; i_147_++) {
			for (int i_148_ = 0; i_148_ <= i_145_; i_148_++)
			    bools[i_147_][i_148_]
				= (i_146_ < i
				   || class468.method7609(i, i_146_,
							  i_141_ + i_147_,
							  i_148_ + i_142_,
							  1995139044));
		    }
		    class556.aClass151Array7434[i_146_].method2527
			(i_132_, i_133_, 1024, i_141_, i_142_, i_143_, i_144_,
			 bools);
		    for (int i_149_ = -4; i_149_ < i_123_; i_149_++) {
			for (int i_150_ = -4; i_150_ < i_123_; i_150_++) {
			    int i_151_ = i_149_ + i_137_;
			    int i_152_ = i_150_ + i_138_;
			    if (i_151_ >= i_124_ && i_152_ >= i_125_
				&& (i_146_ < i
				    || class468.method7609(i, i_146_, i_151_,
							   i_152_,
							   2060453262))) {
				int i_153_ = i_146_;
				if (class468.method7612(i_151_, i_152_,
							(byte) 0))
				    i_153_--;
				if (i_153_ >= 0)
				    Class369.method6377
					(class185, i_153_, i_151_, i_152_,
					 4 * i_149_ + i_139_,
					 i_140_ + 4 * (i_123_ - i_150_) - 4,
					 i_134_, i_135_, 432891881);
			    }
			}
		    }
		}
		class185.method3298(i_139_, i_140_, i_123_ * 4, 4 * i_123_,
				    i_136_, 2);
		class185.method3581();
		if (!aBool1367) {
		    Class613.aClass163_8025.method2717
			(4 * (i_137_ - i_124_) + 48,
			 48 + i_119_ * 4 - (i_138_ - i_125_) * 4 - 4 * i_123_,
			 4 * i_123_, i_123_ * 4, i_139_, i_140_);
		    if (aBool1366) {
			Class613.aClass163_8025.method2656(256, 0);
			try {
			    class185.method3289(2107858037);
			    Class251.method4622(2000L);
			} catch (Exception exception) {
			    /* empty */
			}
		    }
		}
	    }
	}
	if (aBool1367) {
	    class185.method3261(class175_sub1, -11578496);
	    if (aBool1366) {
		Class613.aClass163_8025.method2656(256, 0);
		try {
		    class185.method3289(1548883557);
		    Class251.method4622(2000L);
		} catch (Exception exception) {
		    /* empty */
		}
	    }
	}
	class185.method3537();
	class185.method3318(anIntArray1368[0], anIntArray1368[1],
			    anIntArray1368[2], anIntArray1368[3]);
	class185.method3340(1, 1);
	Class422.method6785((byte) -25);
	anInt1380 = 0;
	aClass700_1369.method14152(-1850297617);
	if (!aBool1378) {
	    Class690_Sub27.method17128(i, 1377120265);
	    Class523 class523 = client.aClass512_11100.method8419(1483992753);
	    if (null != class523) {
		Class222.aClass44_Sub9_2313.method17322(1024, 64, 1698423621);
		Class597 class597
		    = client.aClass512_11100.method8416((byte) 84);
		for (int i_154_ = 0; i_154_ < -942354647 * class523.anInt7086;
		     i_154_++) {
		    int i_155_ = class523.anIntArray7085[i_154_];
		    if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aByte10854
			== i_155_ >> 28) {
			int i_156_ = ((i_155_ >> 14 & 0x3fff)
				      - -424199969 * class597.anInt7859);
			int i_157_ = ((i_155_ & 0x3fff)
				      - class597.anInt7861 * -1166289421);
			if (i_156_ >= 0 && i_156_ < i_118_ && i_157_ >= 0
			    && i_157_ < i_119_)
			    aClass700_1369.method14131
				(new Class534_Sub39(i_154_), (short) 789);
			else {
			    Class272 class272
				= ((Class272)
				   (Class222.aClass44_Sub9_2313.method91
				    (class523.anIntArray7084[i_154_],
				     227304750)));
			    if (class272.anIntArray2992 != null
				&& (i_156_ + class272.anInt3005 * -321707117
				    >= 0)
				&& (i_156_ + 1863424643 * class272.anInt2993
				    < i_118_)
				&& (i_157_ + -967887583 * class272.anInt2996
				    >= 0)
				&& (i_157_ + class272.anInt2989 * 148212907
				    < i_119_))
				aClass700_1369.method14131
				    (new Class534_Sub39(i_154_), (short) 789);
			}
		    }
		}
		Class222.aClass44_Sub9_2313.method17322(128, 64, 2112787211);
	    }
	}
	return true;
    }
    
    static boolean method2035(Class185 class185, int i) {
	class185.method3581();
	Class250.method4604((byte) -80);
	if (!class185.method3669(1819862316))
	    return false;
	int i_158_ = client.aClass512_11100.method8417(1339708073);
	int i_159_ = client.aClass512_11100.method8418(-1533611049);
	Class468 class468 = client.aClass512_11100.method8552((byte) 0);
	Class556 class556 = client.aClass512_11100.method8424((byte) 86);
	int i_160_ = i;
	if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419 != null) {
	    int i_161_ = ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			   .anIntArray11977[0])
			  >> 3);
	    int i_162_ = ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			   .anIntArray11978[0])
			  >> 3);
	    if (i_161_ >= 0 && i_161_ < aBoolArrayArray1374.length
		&& i_162_ >= 0 && i_162_ < aBoolArrayArray1374[i_161_].length
		&& aBoolArrayArray1374[i_161_][i_162_])
		i_160_ = 0;
	}
	int i_163_ = i_158_ / 2;
	int i_164_ = 0;
	int i_165_ = 0;
	boolean bool = true;
	for (int i_166_ = i_164_; i_166_ < i_164_ + i_158_; i_166_++) {
	    for (int i_167_ = i_165_; i_167_ < i_159_ + i_165_; i_167_++) {
		for (int i_168_ = i_160_; i_168_ <= 3; i_168_++) {
		    if (i_168_ < i
			|| class468.method7609(i, i_168_, i_166_, i_167_,
					       2103335262)) {
			int i_169_ = i_168_;
			if (class468.method7612(i_166_, i_167_, (byte) 0))
			    i_169_--;
			if (i_169_ >= 0)
			    bool &= Class260.method4806(i_169_, i_166_, i_167_,
							1929527917);
		    }
		}
	    }
	}
	if (!bool)
	    return false;
	int i_170_ = i_158_ * 4 + 48 + 48;
	int[] is = new int[i_170_ * i_170_];
	for (int i_171_ = 0; i_171_ < is.length; i_171_++)
	    is[i_171_] = 0;
	Class175_Sub1 class175_sub1 = null;
	int i_172_ = 0;
	int i_173_ = 0;
	if (aBool1367) {
	    Class613.aClass163_8025
		= class185.method3315(i_170_, i_170_, false, true);
	    class175_sub1 = class185.method3263();
	    class175_sub1.method15075(0, Class613.aClass163_8025.method2651());
	    Interface21 interface21 = class185.method3265(i_170_, i_170_);
	    class175_sub1.method15074(interface21);
	    class185.method3260(class175_sub1, 1092449277);
	    i_163_ = i_158_;
	    i_172_ = 48;
	    i_173_ = 48;
	    class185.method3340(1, 0);
	} else
	    Class613.aClass163_8025
		= class185.method3317(is, 0, i_170_, i_170_, i_170_,
				      (byte) -66);
	client.aClass512_11100.method8501((byte) 49).method10176((byte) 1);
	int i_174_
	    = ~0xffffff | ((238 + (int) (Math.random() * 20.0) - 10 << 16)
			   + (238 + (int) (Math.random() * 20.0) - 10 << 8)
			   + (238 + (int) (Math.random() * 20.0) - 10));
	int i_175_ = ~0xffffff | 238 + (int) (Math.random() * 20.0) - 10 << 16;
	int i_176_ = ((int) (Math.random() * 8.0) << 16
		      | (int) (Math.random() * 8.0) << 8
		      | (int) (Math.random() * 8.0));
	boolean[][] bools = new boolean[2 + (1 + i_163_)][2 + (i_163_ + 1)];
	class185.method3283(anIntArray1368);
	class185.method3281();
	for (int i_177_ = i_164_; i_177_ < i_164_ + i_158_; i_177_ += i_163_) {
	    for (int i_178_ = i_165_; i_178_ < i_159_ + i_165_;
		 i_178_ += i_163_) {
		int i_179_ = i_172_;
		int i_180_ = i_173_;
		int i_181_ = i_177_;
		if (i_181_ > 0) {
		    i_181_--;
		    i_179_ += 4;
		}
		int i_182_ = i_178_;
		if (i_182_ > 0)
		    i_182_--;
		int i_183_ = i_177_ + i_163_;
		if (i_183_ < i_158_)
		    i_183_++;
		int i_184_ = i_178_ + i_163_;
		if (i_184_ < i_159_) {
		    i_184_++;
		    i_180_ += 4;
		}
		if (aBool1366)
		    class185.method3537();
		else
		    class185.method3373(0, 0, i_179_ + 4 * i_163_,
					4 * i_163_ + i_180_);
		class185.method3340(3, -16777216);
		int i_185_ = i_163_;
		if (i_185_ > i_158_ - 1)
		    i_185_ = i_158_ - 1;
		for (int i_186_ = i_160_; i_186_ <= 3; i_186_++) {
		    for (int i_187_ = 0; i_187_ <= i_185_; i_187_++) {
			for (int i_188_ = 0; i_188_ <= i_185_; i_188_++)
			    bools[i_187_][i_188_]
				= (i_186_ < i
				   || class468.method7609(i, i_186_,
							  i_181_ + i_187_,
							  i_188_ + i_182_,
							  1973953190));
		    }
		    class556.aClass151Array7434[i_186_].method2527
			(i_172_, i_173_, 1024, i_181_, i_182_, i_183_, i_184_,
			 bools);
		    for (int i_189_ = -4; i_189_ < i_163_; i_189_++) {
			for (int i_190_ = -4; i_190_ < i_163_; i_190_++) {
			    int i_191_ = i_189_ + i_177_;
			    int i_192_ = i_190_ + i_178_;
			    if (i_191_ >= i_164_ && i_192_ >= i_165_
				&& (i_186_ < i
				    || class468.method7609(i, i_186_, i_191_,
							   i_192_,
							   1939178001))) {
				int i_193_ = i_186_;
				if (class468.method7612(i_191_, i_192_,
							(byte) 0))
				    i_193_--;
				if (i_193_ >= 0)
				    Class369.method6377
					(class185, i_193_, i_191_, i_192_,
					 4 * i_189_ + i_179_,
					 i_180_ + 4 * (i_163_ - i_190_) - 4,
					 i_174_, i_175_, 1502425911);
			    }
			}
		    }
		}
		class185.method3298(i_179_, i_180_, i_163_ * 4, 4 * i_163_,
				    i_176_, 2);
		class185.method3581();
		if (!aBool1367) {
		    Class613.aClass163_8025.method2717
			(4 * (i_177_ - i_164_) + 48,
			 48 + i_159_ * 4 - (i_178_ - i_165_) * 4 - 4 * i_163_,
			 4 * i_163_, i_163_ * 4, i_179_, i_180_);
		    if (aBool1366) {
			Class613.aClass163_8025.method2656(256, 0);
			try {
			    class185.method3289(2118420141);
			    Class251.method4622(2000L);
			} catch (Exception exception) {
			    /* empty */
			}
		    }
		}
	    }
	}
	if (aBool1367) {
	    class185.method3261(class175_sub1, -11578496);
	    if (aBool1366) {
		Class613.aClass163_8025.method2656(256, 0);
		try {
		    class185.method3289(2029036221);
		    Class251.method4622(2000L);
		} catch (Exception exception) {
		    /* empty */
		}
	    }
	}
	class185.method3537();
	class185.method3318(anIntArray1368[0], anIntArray1368[1],
			    anIntArray1368[2], anIntArray1368[3]);
	class185.method3340(1, 1);
	Class422.method6785((byte) -37);
	anInt1380 = 0;
	aClass700_1369.method14152(-1326585238);
	if (!aBool1378) {
	    Class690_Sub27.method17128(i, 1384663566);
	    Class523 class523 = client.aClass512_11100.method8419(-996419204);
	    if (null != class523) {
		Class222.aClass44_Sub9_2313.method17322(1024, 64, 1775098204);
		Class597 class597
		    = client.aClass512_11100.method8416((byte) 1);
		for (int i_194_ = 0; i_194_ < -942354647 * class523.anInt7086;
		     i_194_++) {
		    int i_195_ = class523.anIntArray7085[i_194_];
		    if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aByte10854
			== i_195_ >> 28) {
			int i_196_ = ((i_195_ >> 14 & 0x3fff)
				      - -424199969 * class597.anInt7859);
			int i_197_ = ((i_195_ & 0x3fff)
				      - class597.anInt7861 * -1166289421);
			if (i_196_ >= 0 && i_196_ < i_158_ && i_197_ >= 0
			    && i_197_ < i_159_)
			    aClass700_1369.method14131
				(new Class534_Sub39(i_194_), (short) 789);
			else {
			    Class272 class272
				= ((Class272)
				   (Class222.aClass44_Sub9_2313.method91
				    (class523.anIntArray7084[i_194_],
				     -108385378)));
			    if (class272.anIntArray2992 != null
				&& (i_196_ + class272.anInt3005 * -321707117
				    >= 0)
				&& (i_196_ + 1863424643 * class272.anInt2993
				    < i_158_)
				&& (i_197_ + -967887583 * class272.anInt2996
				    >= 0)
				&& (i_197_ + class272.anInt2989 * 148212907
				    < i_159_))
				aClass700_1369.method14131
				    (new Class534_Sub39(i_194_), (short) 789);
			}
		    }
		}
		Class222.aClass44_Sub9_2313.method17322(128, 64, 2091886518);
	    }
	}
	return true;
    }
    
    public static void method2036() {
	Class613.aClass163_8025 = null;
	anInt1381 = 1312565957;
    }
    
    static boolean method2037(Class185 class185, int i) {
	class185.method3581();
	Class250.method4604((byte) -114);
	if (!class185.method3669(1819862316))
	    return false;
	int i_198_ = client.aClass512_11100.method8417(1764397736);
	int i_199_ = client.aClass512_11100.method8418(-1533611049);
	Class468 class468 = client.aClass512_11100.method8552((byte) 0);
	Class556 class556 = client.aClass512_11100.method8424((byte) 53);
	int i_200_ = i;
	if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419 != null) {
	    int i_201_ = ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			   .anIntArray11977[0])
			  >> 3);
	    int i_202_ = ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			   .anIntArray11978[0])
			  >> 3);
	    if (i_201_ >= 0 && i_201_ < aBoolArrayArray1374.length
		&& i_202_ >= 0 && i_202_ < aBoolArrayArray1374[i_201_].length
		&& aBoolArrayArray1374[i_201_][i_202_])
		i_200_ = 0;
	}
	int i_203_ = i_198_ / 2;
	int i_204_ = 0;
	int i_205_ = 0;
	boolean bool = true;
	for (int i_206_ = i_204_; i_206_ < i_204_ + i_198_; i_206_++) {
	    for (int i_207_ = i_205_; i_207_ < i_199_ + i_205_; i_207_++) {
		for (int i_208_ = i_200_; i_208_ <= 3; i_208_++) {
		    if (i_208_ < i
			|| class468.method7609(i, i_208_, i_206_, i_207_,
					       1959993251)) {
			int i_209_ = i_208_;
			if (class468.method7612(i_206_, i_207_, (byte) 0))
			    i_209_--;
			if (i_209_ >= 0)
			    bool &= Class260.method4806(i_209_, i_206_, i_207_,
							-1041434670);
		    }
		}
	    }
	}
	if (!bool)
	    return false;
	int i_210_ = i_198_ * 4 + 48 + 48;
	int[] is = new int[i_210_ * i_210_];
	for (int i_211_ = 0; i_211_ < is.length; i_211_++)
	    is[i_211_] = 0;
	Class175_Sub1 class175_sub1 = null;
	int i_212_ = 0;
	int i_213_ = 0;
	if (aBool1367) {
	    Class613.aClass163_8025
		= class185.method3315(i_210_, i_210_, false, true);
	    class175_sub1 = class185.method3263();
	    class175_sub1.method15075(0, Class613.aClass163_8025.method2651());
	    Interface21 interface21 = class185.method3265(i_210_, i_210_);
	    class175_sub1.method15074(interface21);
	    class185.method3260(class175_sub1, -1375563301);
	    i_203_ = i_198_;
	    i_212_ = 48;
	    i_213_ = 48;
	    class185.method3340(1, 0);
	} else
	    Class613.aClass163_8025
		= class185.method3317(is, 0, i_210_, i_210_, i_210_,
				      (byte) -33);
	client.aClass512_11100.method8501((byte) 91).method10176((byte) 1);
	int i_214_
	    = ~0xffffff | ((238 + (int) (Math.random() * 20.0) - 10 << 16)
			   + (238 + (int) (Math.random() * 20.0) - 10 << 8)
			   + (238 + (int) (Math.random() * 20.0) - 10));
	int i_215_ = ~0xffffff | 238 + (int) (Math.random() * 20.0) - 10 << 16;
	int i_216_ = ((int) (Math.random() * 8.0) << 16
		      | (int) (Math.random() * 8.0) << 8
		      | (int) (Math.random() * 8.0));
	boolean[][] bools = new boolean[2 + (1 + i_203_)][2 + (i_203_ + 1)];
	class185.method3283(anIntArray1368);
	class185.method3281();
	for (int i_217_ = i_204_; i_217_ < i_204_ + i_198_; i_217_ += i_203_) {
	    for (int i_218_ = i_205_; i_218_ < i_199_ + i_205_;
		 i_218_ += i_203_) {
		int i_219_ = i_212_;
		int i_220_ = i_213_;
		int i_221_ = i_217_;
		if (i_221_ > 0) {
		    i_221_--;
		    i_219_ += 4;
		}
		int i_222_ = i_218_;
		if (i_222_ > 0)
		    i_222_--;
		int i_223_ = i_217_ + i_203_;
		if (i_223_ < i_198_)
		    i_223_++;
		int i_224_ = i_218_ + i_203_;
		if (i_224_ < i_199_) {
		    i_224_++;
		    i_220_ += 4;
		}
		if (aBool1366)
		    class185.method3537();
		else
		    class185.method3373(0, 0, i_219_ + 4 * i_203_,
					4 * i_203_ + i_220_);
		class185.method3340(3, -16777216);
		int i_225_ = i_203_;
		if (i_225_ > i_198_ - 1)
		    i_225_ = i_198_ - 1;
		for (int i_226_ = i_200_; i_226_ <= 3; i_226_++) {
		    for (int i_227_ = 0; i_227_ <= i_225_; i_227_++) {
			for (int i_228_ = 0; i_228_ <= i_225_; i_228_++)
			    bools[i_227_][i_228_]
				= (i_226_ < i
				   || class468.method7609(i, i_226_,
							  i_221_ + i_227_,
							  i_228_ + i_222_,
							  2020305168));
		    }
		    class556.aClass151Array7434[i_226_].method2527
			(i_212_, i_213_, 1024, i_221_, i_222_, i_223_, i_224_,
			 bools);
		    for (int i_229_ = -4; i_229_ < i_203_; i_229_++) {
			for (int i_230_ = -4; i_230_ < i_203_; i_230_++) {
			    int i_231_ = i_229_ + i_217_;
			    int i_232_ = i_230_ + i_218_;
			    if (i_231_ >= i_204_ && i_232_ >= i_205_
				&& (i_226_ < i
				    || class468.method7609(i, i_226_, i_231_,
							   i_232_,
							   1937599831))) {
				int i_233_ = i_226_;
				if (class468.method7612(i_231_, i_232_,
							(byte) 0))
				    i_233_--;
				if (i_233_ >= 0)
				    Class369.method6377
					(class185, i_233_, i_231_, i_232_,
					 4 * i_229_ + i_219_,
					 i_220_ + 4 * (i_203_ - i_230_) - 4,
					 i_214_, i_215_, -1189009091);
			    }
			}
		    }
		}
		class185.method3298(i_219_, i_220_, i_203_ * 4, 4 * i_203_,
				    i_216_, 2);
		class185.method3581();
		if (!aBool1367) {
		    Class613.aClass163_8025.method2717
			(4 * (i_217_ - i_204_) + 48,
			 48 + i_199_ * 4 - (i_218_ - i_205_) * 4 - 4 * i_203_,
			 4 * i_203_, i_203_ * 4, i_219_, i_220_);
		    if (aBool1366) {
			Class613.aClass163_8025.method2656(256, 0);
			try {
			    class185.method3289(1820005344);
			    Class251.method4622(2000L);
			} catch (Exception exception) {
			    /* empty */
			}
		    }
		}
	    }
	}
	if (aBool1367) {
	    class185.method3261(class175_sub1, -11578496);
	    if (aBool1366) {
		Class613.aClass163_8025.method2656(256, 0);
		try {
		    class185.method3289(1472279326);
		    Class251.method4622(2000L);
		} catch (Exception exception) {
		    /* empty */
		}
	    }
	}
	class185.method3537();
	class185.method3318(anIntArray1368[0], anIntArray1368[1],
			    anIntArray1368[2], anIntArray1368[3]);
	class185.method3340(1, 1);
	Class422.method6785((byte) -34);
	anInt1380 = 0;
	aClass700_1369.method14152(-1014981837);
	if (!aBool1378) {
	    Class690_Sub27.method17128(i, 822954761);
	    Class523 class523 = client.aClass512_11100.method8419(-216339013);
	    if (null != class523) {
		Class222.aClass44_Sub9_2313.method17322(1024, 64, 1669374758);
		Class597 class597
		    = client.aClass512_11100.method8416((byte) 40);
		for (int i_234_ = 0; i_234_ < -942354647 * class523.anInt7086;
		     i_234_++) {
		    int i_235_ = class523.anIntArray7085[i_234_];
		    if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aByte10854
			== i_235_ >> 28) {
			int i_236_ = ((i_235_ >> 14 & 0x3fff)
				      - -424199969 * class597.anInt7859);
			int i_237_ = ((i_235_ & 0x3fff)
				      - class597.anInt7861 * -1166289421);
			if (i_236_ >= 0 && i_236_ < i_198_ && i_237_ >= 0
			    && i_237_ < i_199_)
			    aClass700_1369.method14131
				(new Class534_Sub39(i_234_), (short) 789);
			else {
			    Class272 class272
				= ((Class272)
				   (Class222.aClass44_Sub9_2313.method91
				    (class523.anIntArray7084[i_234_],
				     -364028101)));
			    if (class272.anIntArray2992 != null
				&& (i_236_ + class272.anInt3005 * -321707117
				    >= 0)
				&& (i_236_ + 1863424643 * class272.anInt2993
				    < i_198_)
				&& (i_237_ + -967887583 * class272.anInt2996
				    >= 0)
				&& (i_237_ + class272.anInt2989 * 148212907
				    < i_199_))
				aClass700_1369.method14131
				    (new Class534_Sub39(i_234_), (short) 789);
			}
		    }
		}
		Class222.aClass44_Sub9_2313.method17322(128, 64, 1919062135);
	    }
	}
	return true;
    }
    
    static void method2038(int i) {
	anInt1380 = 0;
	int i_238_ = client.aClass512_11100.method8417(242339672);
	int i_239_ = client.aClass512_11100.method8418(-1533611049);
	Class468 class468 = client.aClass512_11100.method8552((byte) 0);
	Class556 class556 = client.aClass512_11100.method8424((byte) 74);
	Class44_Sub13 class44_sub13
	    = client.aClass512_11100.method8428(-1486655428);
	int i_240_ = i;
	if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419 != null) {
	    int i_241_ = ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			   .anIntArray11977[0])
			  >> 3);
	    int i_242_ = ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			   .anIntArray11978[0])
			  >> 3);
	    if (i_241_ >= 0 && i_241_ < aBoolArrayArray1374.length
		&& i_242_ >= 0 && i_242_ < aBoolArrayArray1374[i_241_].length
		&& aBoolArrayArray1374[i_241_][i_242_])
		i_240_ = 0;
	}
	for (int i_243_ = 0; i_243_ < i_238_; i_243_++) {
	    for (int i_244_ = 0; i_244_ < i_239_; i_244_++) {
		for (int i_245_ = i_240_; i_245_ <= i + 1 && i_245_ <= 3;
		     i_245_++) {
		    if ((i_245_ < i || class468.method7609(i, i_245_, i_243_,
							   i_244_, 1972046497))
			&& !(Class297.method5346
			     ((Interface62) class556.method9264(i_245_, i_243_,
								i_244_,
								(byte) 40),
			      class44_sub13, i_243_, i_244_, -731913961))
			&& !(Class297.method5346
			     (((Interface62)
			       class556.method9262(i_245_, i_243_, i_244_,
						   client.anInterface64_11333,
						   (byte) -38)),
			      class44_sub13, i_243_, i_244_, -1122489117))
			&& !(Class297.method5346
			     ((Interface62) class556.method9258(i_245_, i_243_,
								i_244_,
								(byte) 51),
			      class44_sub13, i_243_, i_244_, 1348719749))
			&& !(Class297.method5346
			     ((Interface62) class556.method9357(i_245_, i_243_,
								i_244_,
								(byte) 67),
			      class44_sub13, i_243_, i_244_, 1524641499))) {
			/* empty */
		    }
		}
	    }
	}
    }
    
    static boolean method2039(Interface62 interface62,
			      Class44_Sub13 class44_sub13, int i, int i_246_) {
	if (null == interface62)
	    return false;
	Class602 class602
	    = ((Class602)
	       class44_sub13.method91(interface62.method56(-1222222462),
				      -834715992));
	if (class602.aBool7964 && !client.aBool11157)
	    return false;
	int i_247_ = class602.anInt7949 * 196422211;
	if (class602.anIntArray7943 != null) {
	    for (int i_248_ = 0; i_248_ < class602.anIntArray7943.length;
		 i_248_++) {
		if (-1 != class602.anIntArray7943[i_248_]) {
		    Class602 class602_249_
			= ((Class602)
			   class44_sub13.method91((class602.anIntArray7943
						   [i_248_]),
						  -942262594));
		    if (class602_249_.anInt7949 * 196422211 >= 0)
			i_247_ = class602_249_.anInt7949 * 196422211;
		}
	    }
	}
	if (i_247_ >= 0) {
	    anIntArray1377[-463245253 * anInt1380]
		= -1562722583 * class602.anInt7887;
	    anIntArray1371[-463245253 * anInt1380] = i;
	    anIntArray1372[anInt1380 * -463245253] = i_246_;
	    anInt1380 += 138799347;
	    return true;
	}
	return false;
    }
    
    static boolean method2040(int i, int i_250_, int i_251_) {
	Class556 class556 = client.aClass512_11100.method8424((byte) 35);
	boolean bool = true;
	Interface62 interface62
	    = (Interface62) class556.method9258(i, i_250_, i_251_, (byte) -97);
	if (null != interface62)
	    bool &= Class429.method6813(interface62, 801942646);
	interface62
	    = (Interface62) class556.method9262(i, i_250_, i_251_,
						client.anInterface64_11333,
						(byte) -2);
	if (interface62 != null)
	    bool &= Class429.method6813(interface62, 1958546875);
	interface62
	    = (Interface62) class556.method9264(i, i_250_, i_251_, (byte) 45);
	if (null != interface62)
	    bool &= Class429.method6813(interface62, 1543023403);
	return bool;
    }
    
    static boolean method2041(int i, int i_252_, int i_253_) {
	Class556 class556 = client.aClass512_11100.method8424((byte) 68);
	boolean bool = true;
	Interface62 interface62
	    = (Interface62) class556.method9258(i, i_252_, i_253_, (byte) -89);
	if (null != interface62)
	    bool &= Class429.method6813(interface62, 1297640899);
	interface62
	    = (Interface62) class556.method9262(i, i_252_, i_253_,
						client.anInterface64_11333,
						(byte) 105);
	if (interface62 != null)
	    bool &= Class429.method6813(interface62, 1400735866);
	interface62
	    = (Interface62) class556.method9264(i, i_252_, i_253_, (byte) 30);
	if (null != interface62)
	    bool &= Class429.method6813(interface62, 735612046);
	return bool;
    }
    
    static void method2042(Class185 class185, int i, int i_254_, int i_255_,
			   int i_256_, int i_257_, int i_258_, int i_259_) {
	Class556 class556 = client.aClass512_11100.method8424((byte) 121);
	Interface62 interface62
	    = ((Interface62)
	       class556.method9258(i, i_254_, i_255_, (byte) -101));
	if (null != interface62) {
	    Class602 class602
		= ((Class602)
		   (client.aClass512_11100.method8428(-1486655428).method91
		    (interface62.method56(674821535), -2069506230)));
	    int i_260_ = interface62.method410(-1679259372) & 0x3;
	    int i_261_ = interface62.method409(-1369744860);
	    if (class602.anInt7890 * 350336715 != -1)
		Class233.method4341(class185, class602, i_260_, i_256_, i_257_,
				    983789251);
	    else {
		int i_262_ = i_258_;
		if (-2134171963 * class602.anInt7907 > 0)
		    i_262_ = i_259_;
		if (i_261_ == 847393323 * Class595.aClass595_7851.anInt7852
		    || (i_261_
			== 847393323 * Class595.aClass595_7829.anInt7852)) {
		    if (0 == i_260_)
			class185.method3302(i_256_, i_257_, 4, i_262_,
					    364378440);
		    else if (i_260_ == 1)
			class185.method3294(i_256_, i_257_, 4, i_262_,
					    378275832);
		    else if (i_260_ == 2)
			class185.method3302(i_256_ + 3, i_257_, 4, i_262_,
					    2781865);
		    else if (i_260_ == 3)
			class185.method3294(i_256_, 3 + i_257_, 4, i_262_,
					    750068073);
		}
		if (i_261_ == Class595.aClass595_7832.anInt7852 * 847393323) {
		    if (i_260_ == 0)
			class185.method3292(i_256_, i_257_, 1, 1, i_262_,
					    -1902543119);
		    else if (1 == i_260_)
			class185.method3292(i_256_ + 3, i_257_, 1, 1, i_262_,
					    -1582627979);
		    else if (2 == i_260_)
			class185.method3292(i_256_ + 3, i_257_ + 3, 1, 1,
					    i_262_, -1575726024);
		    else if (3 == i_260_)
			class185.method3292(i_256_, i_257_ + 3, 1, 1, i_262_,
					    -2127232574);
		}
		if (i_261_ == 847393323 * Class595.aClass595_7829.anInt7852) {
		    if (i_260_ == 0)
			class185.method3294(i_256_, i_257_, 4, i_262_,
					    1675932836);
		    else if (i_260_ == 1)
			class185.method3302(3 + i_256_, i_257_, 4, i_262_,
					    -435210283);
		    else if (i_260_ == 2)
			class185.method3294(i_256_, 3 + i_257_, 4, i_262_,
					    -1955170726);
		    else if (3 == i_260_)
			class185.method3302(i_256_, i_257_, 4, i_262_,
					    971574280);
		}
	    }
	}
	interface62
	    = (Interface62) class556.method9262(i, i_254_, i_255_,
						client.anInterface64_11333,
						(byte) 97);
	if (null != interface62) {
	    Class602 class602
		= ((Class602)
		   (client.aClass512_11100.method8428(-1486655428).method91
		    (interface62.method56(-1911943890), 894889914)));
	    int i_263_ = interface62.method410(1170951925) & 0x3;
	    int i_264_ = interface62.method409(-1895634709);
	    if (-1 != 350336715 * class602.anInt7890)
		Class233.method4341(class185, class602, i_263_, i_256_, i_257_,
				    -777180000);
	    else if (i_264_ == 847393323 * Class595.aClass595_7833.anInt7852) {
		int i_265_ = -1118482;
		if (-2134171963 * class602.anInt7907 > 0)
		    i_265_ = -1179648;
		if (0 == i_263_ || 2 == i_263_)
		    class185.method3567(i_256_, i_257_ + 3, 3 + i_256_, i_257_,
					i_265_, 1881998537);
		else
		    class185.method3567(i_256_, i_257_, 3 + i_256_, i_257_ + 3,
					i_265_, 591307164);
	    }
	}
	interface62
	    = (Interface62) class556.method9264(i, i_254_, i_255_, (byte) 57);
	if (null != interface62) {
	    Class602 class602
		= ((Class602)
		   (client.aClass512_11100.method8428(-1486655428).method91
		    (interface62.method56(570709453), -1245854680)));
	    int i_266_ = interface62.method410(-377801284) & 0x3;
	    if (-1 != class602.anInt7890 * 350336715)
		Class233.method4341(class185, class602, i_266_, i_256_, i_257_,
				    1576084976);
	}
    }
    
    static void method2043() {
	anInt1365 = 0;
	anInt1375 = 1660827629;
	anInt1376 = -517634255;
    }
    
    static void method2044(Class185 class185, Class602 class602, int i,
			   int i_267_, int i_268_) {
	Class85 class85
	    = ((Class85)
	       Class394_Sub1.aClass44_Sub18_10148
		   .method91(350336715 * class602.anInt7890, 1137051071));
	if (-1 != class85.anInt842 * 138454787) {
	    if (class602.aBool7924) {
		i += class602.anInt7925 * 1605976059;
		i &= 0x3;
	    } else
		i = 0;
	    Class163 class163
		= class85.method1672(class185, i, class602.aBool7955,
				     (short) 23865);
	    if (null != class163) {
		int i_269_ = class602.anInt7904 * -1082258489;
		int i_270_ = -1990374967 * class602.anInt7928;
		if (1 == (i & 0x1)) {
		    i_269_ = -1990374967 * class602.anInt7928;
		    i_270_ = class602.anInt7904 * -1082258489;
		}
		int i_271_ = class163.method22();
		int i_272_ = class163.method2692();
		if (class85.aBool844) {
		    i_271_ = 4 * i_269_;
		    i_272_ = 4 * i_270_;
		}
		if (2126510373 * class85.anInt841 != 0)
		    class163.method2660(i_267_, i_268_ - (i_270_ - 1) * 4,
					i_271_, i_272_, 0,
					(~0xffffff
					 | 2126510373 * class85.anInt841),
					1);
		else
		    class163.method2659(i_267_, i_268_ - 4 * (i_270_ - 1),
					i_271_, i_272_);
	    }
	}
    }
    
    static void method2045(Class185 class185, Class247 class247, int i,
			   int i_273_) {
	if (null != Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419) {
	    class185.method3581();
	    Class246 class246 = null;
	    Class145 class145 = null;
	    if (-1960530827 * class247.anInt2438 == 5) {
		class246 = class247.method4525(class185, 447549967);
		if (class246 == null)
		    return;
		class145 = class246.aClass145_2423;
		if ((-760407609 * class246.anInt2420
		     != class247.anInt2468 * -881188269)
		    || (class247.anInt2469 * -1279656873
			!= class246.anInt2419 * -976807825))
		    throw new IllegalStateException("");
	    }
	    class185.method3373(i, i_273_, -881188269 * class247.anInt2468 + i,
				-1279656873 * class247.anInt2469 + i_273_);
	    if (1265431623 * anInt1365 != 2 && 5 != anInt1365 * 1265431623
		&& Class613.aClass163_8025 != null) {
		class185.method3283(anIntArray1368);
		class185.method3281();
		Class597 class597
		    = client.aClass512_11100.method8416((byte) 35);
		int i_274_;
		int i_275_;
		int i_276_;
		int i_277_;
		if (5 == Class10.anInt75 * -891094135) {
		    i_274_ = 1196989073 * client.anInt11137;
		    i_275_ = client.anInt11138 * -823660049;
		    i_276_ = (int) -client.aFloat11140 & 0x3fff;
		    i_277_ = 4096;
		} else {
		    Class438 class438
			= (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			       .method10807
			   ().aClass438_4885);
		    i_274_ = (int) class438.aFloat4864;
		    i_275_ = (int) class438.aFloat4865;
		    if (3 == Class10.anInt75 * -891094135)
			i_276_ = ((int) -((double) Class599
						       .aClass298_Sub1_7871
						       .method5389(-486128027)
					  * 2607.5945876176133)
				  + client.anInt11189 * -2045337339) & 0x3fff;
		    else
			i_276_ = ((int) -client.aFloat11140
				  + -2045337339 * client.anInt11189) & 0x3fff;
		    i_277_ = 4096 - client.anInt11022 * -1975450384;
		}
		int i_278_ = 48 + i_274_ / 128;
		int i_279_
		    = (48 + client.aClass512_11100.method8418(-1533611049) * 4
		       - i_275_ / 128);
		if (class145 != null)
		    Class613.aClass163_8025.method2704
			(((float) (-881188269 * class247.anInt2468) / 2.0F
			  + (float) i),
			 ((float) i_273_
			  + (float) (-1279656873 * class247.anInt2469) / 2.0F),
			 (float) i_278_, (float) i_279_, i_277_, i_276_ << 2,
			 class145, i, i_273_);
		else
		    Class613.aClass163_8025.method2668
			(((float) i
			  + (float) (-881188269 * class247.anInt2468) / 2.0F),
			 ((float) (class247.anInt2469 * -1279656873) / 2.0F
			  + (float) i_273_),
			 (float) i_278_, (float) i_279_, i_277_, i_276_ << 2,
			 1, -1, 1);
		Class523 class523
		    = client.aClass512_11100.method8419(-163724959);
		for (Class534_Sub39 class534_sub39
			 = ((Class534_Sub39)
			    aClass700_1369.method14135((byte) -1));
		     null != class534_sub39;
		     class534_sub39
			 = ((Class534_Sub39)
			    aClass700_1369.method14139(2128136113))) {
		    int i_280_ = class534_sub39.anInt10807 * -705967177;
		    int i_281_
			= ((class523.anIntArray7085[i_280_] >> 14 & 0x3fff)
			   - -424199969 * class597.anInt7859);
		    int i_282_ = ((class523.anIntArray7085[i_280_] & 0x3fff)
				  - -1166289421 * class597.anInt7861);
		    int i_283_ = i_281_ * 4 + 2 - i_274_ / 128;
		    int i_284_ = i_282_ * 4 + 2 - i_275_ / 128;
		    Class181.method2983(class185, class145, class247, i,
					i_273_, i_283_, i_284_,
					class523.anIntArray7084[i_280_],
					(byte) -53);
		}
		for (int i_285_ = 0; i_285_ < anInt1380 * -463245253;
		     i_285_++) {
		    int i_286_ = 2 + anIntArray1371[i_285_] * 4 - i_274_ / 128;
		    int i_287_ = 4 * anIntArray1372[i_285_] + 2 - i_275_ / 128;
		    Class602 class602
			= ((Class602)
			   client.aClass512_11100.method8428(-1486655428)
			       .method91(anIntArray1377[i_285_], -814161806));
		    if (null != class602.anIntArray7943) {
			class602 = class602.method9988(Class78.aClass103_825,
						       Class78.aClass103_825,
						       -1116915826);
			if (null == class602
			    || class602.anInt7949 * 196422211 == -1)
			    continue;
		    }
		    Class181.method2983(class185, class145, class247, i,
					i_273_, i_286_, i_287_,
					class602.anInt7949 * 196422211,
					(byte) -113);
		}
		for (Class534_Sub7 class534_sub7
			 = ((Class534_Sub7)
			    client.aClass9_11209.method583(-1824590040));
		     null != class534_sub7;
		     class534_sub7
			 = ((Class534_Sub7)
			    client.aClass9_11209.method584((byte) -70))) {
		    int i_288_ = (int) ((8258869577519436579L
					 * class534_sub7.aLong7158) >> 28
					& 0x3L);
		    if (1936210931 * anInt1381 == i_288_) {
			int i_289_ = ((int) ((class534_sub7.aLong7158
					      * 8258869577519436579L)
					     & 0x3fffL)
				      - class597.anInt7859 * -424199969);
			int i_290_ = ((int) ((8258869577519436579L
					      * class534_sub7.aLong7158) >> 14
					     & 0x3fffL)
				      - -1166289421 * class597.anInt7861);
			int i_291_ = 4 * i_289_ + 2 - i_274_ / 128;
			int i_292_ = 2 + i_290_ * 4 - i_275_ / 128;
			Class246.method4509(class247, class145, i, i_273_,
					    i_291_, i_292_,
					    Class67.aClass163Array721[0],
					    1313730702);
		    }
		}
		Class536_Sub2.method15977(class185, i_274_, i_275_, class247,
					  class145, i, i_273_, -573426898);
		Class534_Sub42_Sub1.method18423(i_274_, i_275_, class247,
						class145, i, i_273_,
						-1403760683);
		Class406.method6681(i_274_, i_275_, class247, class246, i,
				    i_273_, (byte) -86);
		if (5 != Class10.anInt75 * -891094135) {
		    if (-1 != anInt1375 * -1254538725) {
			int i_293_
			    = (2 + anInt1375 * -723187604 - i_274_ / 128
			       + (Class322
				      .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				      .method18545((byte) 1)
				  - 1) * 2);
			int i_294_
			    = (2 + anInt1376 * -985777988 - i_275_ / 128
			       + (Class322
				      .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				      .method18545((byte) 1)
				  - 1) * 2);
			Class30.method879(class247, class145,
					  i - Class623.anInt8149 * 443444551,
					  (i_273_
					   - Class706.anInt8846 * -586110739),
					  i_293_, i_294_,
					  (Class19.aClass163Array209
					   [aBool1373 ? 1 : 0]),
					  100.0, Class284.aClass284_3070,
					  Class280.aClass280_3055,
					  -2108889399);
		    }
		    if (!Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			     .aClass618_12216.method10242((byte) 115))
			class185.method3292
			    (-881188269 * class247.anInt2468 / 2 + i - 1,
			     -1279656873 * class247.anInt2469 / 2 + i_273_ - 1,
			     3, 3, -1, -2055215612);
		}
		class185.method3318(anIntArray1368[0], anIntArray1368[1],
				    anIntArray1368[2], anIntArray1368[3]);
	    } else if (null != class145)
		class185.method3324(-16777216, class145, i, i_273_);
	}
    }
    
    static void method2046(Class185 class185, Class247 class247, int i,
			   int i_295_) {
	if (null != Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419) {
	    class185.method3581();
	    Class246 class246 = null;
	    Class145 class145 = null;
	    if (-1960530827 * class247.anInt2438 == 5) {
		class246 = class247.method4525(class185, 447549967);
		if (class246 == null)
		    return;
		class145 = class246.aClass145_2423;
		if ((-760407609 * class246.anInt2420
		     != class247.anInt2468 * -881188269)
		    || (class247.anInt2469 * -1279656873
			!= class246.anInt2419 * -976807825))
		    throw new IllegalStateException("");
	    }
	    class185.method3373(i, i_295_, -881188269 * class247.anInt2468 + i,
				-1279656873 * class247.anInt2469 + i_295_);
	    if (1265431623 * anInt1365 != 2 && 5 != anInt1365 * 1265431623
		&& Class613.aClass163_8025 != null) {
		class185.method3283(anIntArray1368);
		class185.method3281();
		Class597 class597
		    = client.aClass512_11100.method8416((byte) 7);
		int i_296_;
		int i_297_;
		int i_298_;
		int i_299_;
		if (5 == Class10.anInt75 * -891094135) {
		    i_296_ = 1196989073 * client.anInt11137;
		    i_297_ = client.anInt11138 * -823660049;
		    i_298_ = (int) -client.aFloat11140 & 0x3fff;
		    i_299_ = 4096;
		} else {
		    Class438 class438
			= (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			       .method10807
			   ().aClass438_4885);
		    i_296_ = (int) class438.aFloat4864;
		    i_297_ = (int) class438.aFloat4865;
		    if (3 == Class10.anInt75 * -891094135)
			i_298_ = ((int) -((double) Class599
						       .aClass298_Sub1_7871
						       .method5389(-1320425386)
					  * 2607.5945876176133)
				  + client.anInt11189 * -2045337339) & 0x3fff;
		    else
			i_298_ = ((int) -client.aFloat11140
				  + -2045337339 * client.anInt11189) & 0x3fff;
		    i_299_ = 4096 - client.anInt11022 * -1975450384;
		}
		int i_300_ = 48 + i_296_ / 128;
		int i_301_
		    = (48 + client.aClass512_11100.method8418(-1533611049) * 4
		       - i_297_ / 128);
		if (class145 != null)
		    Class613.aClass163_8025.method2704
			(((float) (-881188269 * class247.anInt2468) / 2.0F
			  + (float) i),
			 ((float) i_295_
			  + (float) (-1279656873 * class247.anInt2469) / 2.0F),
			 (float) i_300_, (float) i_301_, i_299_, i_298_ << 2,
			 class145, i, i_295_);
		else
		    Class613.aClass163_8025.method2668
			(((float) i
			  + (float) (-881188269 * class247.anInt2468) / 2.0F),
			 ((float) (class247.anInt2469 * -1279656873) / 2.0F
			  + (float) i_295_),
			 (float) i_300_, (float) i_301_, i_299_, i_298_ << 2,
			 1, -1, 1);
		Class523 class523
		    = client.aClass512_11100.method8419(1460955134);
		for (Class534_Sub39 class534_sub39
			 = ((Class534_Sub39)
			    aClass700_1369.method14135((byte) -1));
		     null != class534_sub39;
		     class534_sub39
			 = ((Class534_Sub39)
			    aClass700_1369.method14139(1168017166))) {
		    int i_302_ = class534_sub39.anInt10807 * -705967177;
		    int i_303_
			= ((class523.anIntArray7085[i_302_] >> 14 & 0x3fff)
			   - -424199969 * class597.anInt7859);
		    int i_304_ = ((class523.anIntArray7085[i_302_] & 0x3fff)
				  - -1166289421 * class597.anInt7861);
		    int i_305_ = i_303_ * 4 + 2 - i_296_ / 128;
		    int i_306_ = i_304_ * 4 + 2 - i_297_ / 128;
		    Class181.method2983(class185, class145, class247, i,
					i_295_, i_305_, i_306_,
					class523.anIntArray7084[i_302_],
					(byte) -78);
		}
		for (int i_307_ = 0; i_307_ < anInt1380 * -463245253;
		     i_307_++) {
		    int i_308_ = 2 + anIntArray1371[i_307_] * 4 - i_296_ / 128;
		    int i_309_ = 4 * anIntArray1372[i_307_] + 2 - i_297_ / 128;
		    Class602 class602
			= ((Class602)
			   client.aClass512_11100.method8428(-1486655428)
			       .method91(anIntArray1377[i_307_], -1726021500));
		    if (null != class602.anIntArray7943) {
			class602 = class602.method9988(Class78.aClass103_825,
						       Class78.aClass103_825,
						       -314157098);
			if (null == class602
			    || class602.anInt7949 * 196422211 == -1)
			    continue;
		    }
		    Class181.method2983(class185, class145, class247, i,
					i_295_, i_308_, i_309_,
					class602.anInt7949 * 196422211,
					(byte) -67);
		}
		for (Class534_Sub7 class534_sub7
			 = ((Class534_Sub7)
			    client.aClass9_11209.method583(-2119331181));
		     null != class534_sub7;
		     class534_sub7
			 = ((Class534_Sub7)
			    client.aClass9_11209.method584((byte) -3))) {
		    int i_310_ = (int) ((8258869577519436579L
					 * class534_sub7.aLong7158) >> 28
					& 0x3L);
		    if (1936210931 * anInt1381 == i_310_) {
			int i_311_ = ((int) ((class534_sub7.aLong7158
					      * 8258869577519436579L)
					     & 0x3fffL)
				      - class597.anInt7859 * -424199969);
			int i_312_ = ((int) ((8258869577519436579L
					      * class534_sub7.aLong7158) >> 14
					     & 0x3fffL)
				      - -1166289421 * class597.anInt7861);
			int i_313_ = 4 * i_311_ + 2 - i_296_ / 128;
			int i_314_ = 2 + i_312_ * 4 - i_297_ / 128;
			Class246.method4509(class247, class145, i, i_295_,
					    i_313_, i_314_,
					    Class67.aClass163Array721[0],
					    1313730702);
		    }
		}
		Class536_Sub2.method15977(class185, i_296_, i_297_, class247,
					  class145, i, i_295_, -1440941589);
		Class534_Sub42_Sub1.method18423(i_296_, i_297_, class247,
						class145, i, i_295_,
						-1640160451);
		Class406.method6681(i_296_, i_297_, class247, class246, i,
				    i_295_, (byte) -8);
		if (5 != Class10.anInt75 * -891094135) {
		    if (-1 != anInt1375 * -1254538725) {
			int i_315_
			    = (2 + anInt1375 * -723187604 - i_296_ / 128
			       + (Class322
				      .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				      .method18545((byte) 1)
				  - 1) * 2);
			int i_316_
			    = (2 + anInt1376 * -985777988 - i_297_ / 128
			       + (Class322
				      .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				      .method18545((byte) 1)
				  - 1) * 2);
			Class30.method879(class247, class145,
					  i - Class623.anInt8149 * 443444551,
					  (i_295_
					   - Class706.anInt8846 * -586110739),
					  i_315_, i_316_,
					  (Class19.aClass163Array209
					   [aBool1373 ? 1 : 0]),
					  100.0, Class284.aClass284_3070,
					  Class280.aClass280_3055,
					  -1445842828);
		    }
		    if (!Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			     .aClass618_12216.method10242((byte) -5))
			class185.method3292
			    (-881188269 * class247.anInt2468 / 2 + i - 1,
			     -1279656873 * class247.anInt2469 / 2 + i_295_ - 1,
			     3, 3, -1, -1592934490);
		}
		class185.method3318(anIntArray1368[0], anIntArray1368[1],
				    anIntArray1368[2], anIntArray1368[3]);
	    } else if (null != class145)
		class185.method3324(-16777216, class145, i, i_295_);
	}
    }
    
    static void method2047(Class185 class185, Class247 class247, int i,
			   int i_317_) {
	if (null != Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419) {
	    class185.method3581();
	    Class246 class246 = null;
	    Class145 class145 = null;
	    if (-1960530827 * class247.anInt2438 == 5) {
		class246 = class247.method4525(class185, 447549967);
		if (class246 == null)
		    return;
		class145 = class246.aClass145_2423;
		if ((-760407609 * class246.anInt2420
		     != class247.anInt2468 * -881188269)
		    || (class247.anInt2469 * -1279656873
			!= class246.anInt2419 * -976807825))
		    throw new IllegalStateException("");
	    }
	    class185.method3373(i, i_317_, -881188269 * class247.anInt2468 + i,
				-1279656873 * class247.anInt2469 + i_317_);
	    if (1265431623 * anInt1365 != 2 && 5 != anInt1365 * 1265431623
		&& Class613.aClass163_8025 != null) {
		class185.method3283(anIntArray1368);
		class185.method3281();
		Class597 class597
		    = client.aClass512_11100.method8416((byte) 121);
		int i_318_;
		int i_319_;
		int i_320_;
		int i_321_;
		if (5 == Class10.anInt75 * -891094135) {
		    i_318_ = 1196989073 * client.anInt11137;
		    i_319_ = client.anInt11138 * -823660049;
		    i_320_ = (int) -client.aFloat11140 & 0x3fff;
		    i_321_ = 4096;
		} else {
		    Class438 class438
			= (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			       .method10807
			   ().aClass438_4885);
		    i_318_ = (int) class438.aFloat4864;
		    i_319_ = (int) class438.aFloat4865;
		    if (3 == Class10.anInt75 * -891094135)
			i_320_ = ((int) -((double) Class599
						       .aClass298_Sub1_7871
						       .method5389(244570229)
					  * 2607.5945876176133)
				  + client.anInt11189 * -2045337339) & 0x3fff;
		    else
			i_320_ = ((int) -client.aFloat11140
				  + -2045337339 * client.anInt11189) & 0x3fff;
		    i_321_ = 4096 - client.anInt11022 * -1975450384;
		}
		int i_322_ = 48 + i_318_ / 128;
		int i_323_
		    = (48 + client.aClass512_11100.method8418(-1533611049) * 4
		       - i_319_ / 128);
		if (class145 != null)
		    Class613.aClass163_8025.method2704
			(((float) (-881188269 * class247.anInt2468) / 2.0F
			  + (float) i),
			 ((float) i_317_
			  + (float) (-1279656873 * class247.anInt2469) / 2.0F),
			 (float) i_322_, (float) i_323_, i_321_, i_320_ << 2,
			 class145, i, i_317_);
		else
		    Class613.aClass163_8025.method2668
			(((float) i
			  + (float) (-881188269 * class247.anInt2468) / 2.0F),
			 ((float) (class247.anInt2469 * -1279656873) / 2.0F
			  + (float) i_317_),
			 (float) i_322_, (float) i_323_, i_321_, i_320_ << 2,
			 1, -1, 1);
		Class523 class523
		    = client.aClass512_11100.method8419(235775298);
		for (Class534_Sub39 class534_sub39
			 = ((Class534_Sub39)
			    aClass700_1369.method14135((byte) -1));
		     null != class534_sub39;
		     class534_sub39
			 = ((Class534_Sub39)
			    aClass700_1369.method14139(1453896392))) {
		    int i_324_ = class534_sub39.anInt10807 * -705967177;
		    int i_325_
			= ((class523.anIntArray7085[i_324_] >> 14 & 0x3fff)
			   - -424199969 * class597.anInt7859);
		    int i_326_ = ((class523.anIntArray7085[i_324_] & 0x3fff)
				  - -1166289421 * class597.anInt7861);
		    int i_327_ = i_325_ * 4 + 2 - i_318_ / 128;
		    int i_328_ = i_326_ * 4 + 2 - i_319_ / 128;
		    Class181.method2983(class185, class145, class247, i,
					i_317_, i_327_, i_328_,
					class523.anIntArray7084[i_324_],
					(byte) -52);
		}
		for (int i_329_ = 0; i_329_ < anInt1380 * -463245253;
		     i_329_++) {
		    int i_330_ = 2 + anIntArray1371[i_329_] * 4 - i_318_ / 128;
		    int i_331_ = 4 * anIntArray1372[i_329_] + 2 - i_319_ / 128;
		    Class602 class602
			= ((Class602)
			   client.aClass512_11100.method8428(-1486655428)
			       .method91(anIntArray1377[i_329_], 1353642036));
		    if (null != class602.anIntArray7943) {
			class602 = class602.method9988(Class78.aClass103_825,
						       Class78.aClass103_825,
						       168268935);
			if (null == class602
			    || class602.anInt7949 * 196422211 == -1)
			    continue;
		    }
		    Class181.method2983(class185, class145, class247, i,
					i_317_, i_330_, i_331_,
					class602.anInt7949 * 196422211,
					(byte) -83);
		}
		for (Class534_Sub7 class534_sub7
			 = ((Class534_Sub7)
			    client.aClass9_11209.method583(-1901538333));
		     null != class534_sub7;
		     class534_sub7
			 = ((Class534_Sub7)
			    client.aClass9_11209.method584((byte) -9))) {
		    int i_332_ = (int) ((8258869577519436579L
					 * class534_sub7.aLong7158) >> 28
					& 0x3L);
		    if (1936210931 * anInt1381 == i_332_) {
			int i_333_ = ((int) ((class534_sub7.aLong7158
					      * 8258869577519436579L)
					     & 0x3fffL)
				      - class597.anInt7859 * -424199969);
			int i_334_ = ((int) ((8258869577519436579L
					      * class534_sub7.aLong7158) >> 14
					     & 0x3fffL)
				      - -1166289421 * class597.anInt7861);
			int i_335_ = 4 * i_333_ + 2 - i_318_ / 128;
			int i_336_ = 2 + i_334_ * 4 - i_319_ / 128;
			Class246.method4509(class247, class145, i, i_317_,
					    i_335_, i_336_,
					    Class67.aClass163Array721[0],
					    1313730702);
		    }
		}
		Class536_Sub2.method15977(class185, i_318_, i_319_, class247,
					  class145, i, i_317_, 1330771689);
		Class534_Sub42_Sub1.method18423(i_318_, i_319_, class247,
						class145, i, i_317_,
						-1737463260);
		Class406.method6681(i_318_, i_319_, class247, class246, i,
				    i_317_, (byte) -3);
		if (5 != Class10.anInt75 * -891094135) {
		    if (-1 != anInt1375 * -1254538725) {
			int i_337_
			    = (2 + anInt1375 * -723187604 - i_318_ / 128
			       + (Class322
				      .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				      .method18545((byte) 1)
				  - 1) * 2);
			int i_338_
			    = (2 + anInt1376 * -985777988 - i_319_ / 128
			       + (Class322
				      .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				      .method18545((byte) 1)
				  - 1) * 2);
			Class30.method879(class247, class145,
					  i - Class623.anInt8149 * 443444551,
					  (i_317_
					   - Class706.anInt8846 * -586110739),
					  i_337_, i_338_,
					  (Class19.aClass163Array209
					   [aBool1373 ? 1 : 0]),
					  100.0, Class284.aClass284_3070,
					  Class280.aClass280_3055,
					  -1341425583);
		    }
		    if (!Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			     .aClass618_12216.method10242((byte) 20))
			class185.method3292
			    (-881188269 * class247.anInt2468 / 2 + i - 1,
			     -1279656873 * class247.anInt2469 / 2 + i_317_ - 1,
			     3, 3, -1, -1716749898);
		}
		class185.method3318(anIntArray1368[0], anIntArray1368[1],
				    anIntArray1368[2], anIntArray1368[3]);
	    } else if (null != class145)
		class185.method3324(-16777216, class145, i, i_317_);
	}
    }
    
    static void method2048(Class185 class185, int i, int i_339_,
			   Class247 class247, Class145 class145, int i_340_,
			   int i_341_) {
	for (int i_342_ = 0; i_342_ < client.anInt11321 * -1125820437;
	     i_342_++) {
	    Class534_Sub6 class534_sub6
		= ((Class534_Sub6)
		   client.aClass9_11331
		       .method579((long) client.anIntArray11088[i_342_]));
	    if (class534_sub6 != null) {
		Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
		    = ((Class654_Sub1_Sub5_Sub1_Sub1)
		       class534_sub6.anObject10417);
		if (class654_sub1_sub5_sub1_sub1.method18840(538617276)
		    && (class654_sub1_sub5_sub1_sub1.aByte10854
			== (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			    .aByte10854))) {
		    Class307 class307
			= class654_sub1_sub5_sub1_sub1.aClass307_12204;
		    if (class307 != null && null != class307.anIntArray3284)
			class307 = class307.method5615(Class78.aClass103_825,
						       Class78.aClass103_825,
						       -1466068515);
		    if (null != class307 && class307.aBool3300
			&& class307.aBool3313) {
			Class438 class438
			    = (class654_sub1_sub5_sub1_sub1.method10807()
			       .aClass438_4885);
			int i_343_ = (int) class438.aFloat4864 / 128 - i / 128;
			int i_344_
			    = (int) class438.aFloat4865 / 128 - i_339_ / 128;
			if (-1 != class307.anInt3338 * -161851867)
			    Class181.method2983(class185, class145, class247,
						i_340_, i_341_, i_343_, i_344_,
						(-161851867
						 * class307.anInt3338),
						(byte) -120);
			else
			    Class246.method4509(class247, class145, i_340_,
						i_341_, i_343_, i_344_,
						Class67.aClass163Array721[1],
						1313730702);
		    }
		}
	    }
	}
    }
    
    static void method2049(Class185 class185, int i, int i_345_,
			   Class247 class247, Class145 class145, int i_346_,
			   int i_347_) {
	for (int i_348_ = 0; i_348_ < client.anInt11321 * -1125820437;
	     i_348_++) {
	    Class534_Sub6 class534_sub6
		= ((Class534_Sub6)
		   client.aClass9_11331
		       .method579((long) client.anIntArray11088[i_348_]));
	    if (class534_sub6 != null) {
		Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
		    = ((Class654_Sub1_Sub5_Sub1_Sub1)
		       class534_sub6.anObject10417);
		if (class654_sub1_sub5_sub1_sub1.method18840(-698368058)
		    && (class654_sub1_sub5_sub1_sub1.aByte10854
			== (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			    .aByte10854))) {
		    Class307 class307
			= class654_sub1_sub5_sub1_sub1.aClass307_12204;
		    if (class307 != null && null != class307.anIntArray3284)
			class307 = class307.method5615(Class78.aClass103_825,
						       Class78.aClass103_825,
						       -1466068515);
		    if (null != class307 && class307.aBool3300
			&& class307.aBool3313) {
			Class438 class438
			    = (class654_sub1_sub5_sub1_sub1.method10807()
			       .aClass438_4885);
			int i_349_ = (int) class438.aFloat4864 / 128 - i / 128;
			int i_350_
			    = (int) class438.aFloat4865 / 128 - i_345_ / 128;
			if (-1 != class307.anInt3338 * -161851867)
			    Class181.method2983(class185, class145, class247,
						i_346_, i_347_, i_349_, i_350_,
						(-161851867
						 * class307.anInt3338),
						(byte) -96);
			else
			    Class246.method4509(class247, class145, i_346_,
						i_347_, i_349_, i_350_,
						Class67.aClass163Array721[1],
						1313730702);
		    }
		}
	    }
	}
    }
    
    static void method2050(Class185 class185, int i, int i_351_,
			   Class247 class247, Class145 class145, int i_352_,
			   int i_353_) {
	for (int i_354_ = 0; i_354_ < client.anInt11321 * -1125820437;
	     i_354_++) {
	    Class534_Sub6 class534_sub6
		= ((Class534_Sub6)
		   client.aClass9_11331
		       .method579((long) client.anIntArray11088[i_354_]));
	    if (class534_sub6 != null) {
		Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
		    = ((Class654_Sub1_Sub5_Sub1_Sub1)
		       class534_sub6.anObject10417);
		if (class654_sub1_sub5_sub1_sub1.method18840(-1568169601)
		    && (class654_sub1_sub5_sub1_sub1.aByte10854
			== (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			    .aByte10854))) {
		    Class307 class307
			= class654_sub1_sub5_sub1_sub1.aClass307_12204;
		    if (class307 != null && null != class307.anIntArray3284)
			class307 = class307.method5615(Class78.aClass103_825,
						       Class78.aClass103_825,
						       -1466068515);
		    if (null != class307 && class307.aBool3300
			&& class307.aBool3313) {
			Class438 class438
			    = (class654_sub1_sub5_sub1_sub1.method10807()
			       .aClass438_4885);
			int i_355_ = (int) class438.aFloat4864 / 128 - i / 128;
			int i_356_
			    = (int) class438.aFloat4865 / 128 - i_351_ / 128;
			if (-1 != class307.anInt3338 * -161851867)
			    Class181.method2983(class185, class145, class247,
						i_352_, i_353_, i_355_, i_356_,
						(-161851867
						 * class307.anInt3338),
						(byte) -123);
			else
			    Class246.method4509(class247, class145, i_352_,
						i_353_, i_355_, i_356_,
						Class67.aClass163Array721[1],
						1313730702);
		    }
		}
	    }
	}
    }
    
    static void method2051(Class185 class185, int i, int i_357_,
			   Class247 class247, Class145 class145, int i_358_,
			   int i_359_) {
	for (int i_360_ = 0; i_360_ < client.anInt11321 * -1125820437;
	     i_360_++) {
	    Class534_Sub6 class534_sub6
		= ((Class534_Sub6)
		   client.aClass9_11331
		       .method579((long) client.anIntArray11088[i_360_]));
	    if (class534_sub6 != null) {
		Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
		    = ((Class654_Sub1_Sub5_Sub1_Sub1)
		       class534_sub6.anObject10417);
		if (class654_sub1_sub5_sub1_sub1.method18840(-299812615)
		    && (class654_sub1_sub5_sub1_sub1.aByte10854
			== (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			    .aByte10854))) {
		    Class307 class307
			= class654_sub1_sub5_sub1_sub1.aClass307_12204;
		    if (class307 != null && null != class307.anIntArray3284)
			class307 = class307.method5615(Class78.aClass103_825,
						       Class78.aClass103_825,
						       -1466068515);
		    if (null != class307 && class307.aBool3300
			&& class307.aBool3313) {
			Class438 class438
			    = (class654_sub1_sub5_sub1_sub1.method10807()
			       .aClass438_4885);
			int i_361_ = (int) class438.aFloat4864 / 128 - i / 128;
			int i_362_
			    = (int) class438.aFloat4865 / 128 - i_357_ / 128;
			if (-1 != class307.anInt3338 * -161851867)
			    Class181.method2983(class185, class145, class247,
						i_358_, i_359_, i_361_, i_362_,
						(-161851867
						 * class307.anInt3338),
						(byte) -24);
			else
			    Class246.method4509(class247, class145, i_358_,
						i_359_, i_361_, i_362_,
						Class67.aClass163Array721[1],
						1313730702);
		    }
		}
	    }
	}
    }
    
    static void method2052(int i, int i_363_, Class247 class247,
			   Class145 class145, int i_364_, int i_365_) {
	int i_366_ = -1843550713 * Class108.anInt1321;
	int[] is = Class108.anIntArray1322;
	for (int i_367_ = 0; i_367_ < i_366_; i_367_++) {
	    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		= client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[is[i_367_]];
	    if (null != class654_sub1_sub5_sub1_sub2
		&& class654_sub1_sub5_sub1_sub2.method18876(-441117355)
		&& !class654_sub1_sub5_sub1_sub2.aClass618_12216
			.method10242((byte) -5)
		&& (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
		    != class654_sub1_sub5_sub1_sub2)
		&& (class654_sub1_sub5_sub1_sub2.aByte10854
		    == (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			.aByte10854))) {
		Class438 class438 = (class654_sub1_sub5_sub1_sub2.method10807()
				     .aClass438_4885);
		int i_368_ = (int) class438.aFloat4864 / 128 - i / 128;
		int i_369_ = (int) class438.aFloat4865 / 128 - i_363_ / 128;
		boolean bool = false;
		for (int i_370_ = 0; i_370_ < -1979292205 * client.anInt11324;
		     i_370_++) {
		    Class28 class28 = client.aClass28Array11327[i_370_];
		    if (class654_sub1_sub5_sub1_sub2.aString12211
			    .equals(class28.aString257)
			&& -721928209 * class28.anInt251 != 0) {
			bool = true;
			break;
		    }
		}
		boolean bool_371_ = false;
		for (int i_372_ = 0; i_372_ < -217094943 * Class455.anInt4963;
		     i_372_++) {
		    if (class654_sub1_sub5_sub1_sub2.aString12211.equals
			(Class168.aClass98Array1792[i_372_].aString1162)) {
			bool_371_ = true;
			break;
		    }
		}
		boolean bool_373_ = false;
		if ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.anInt12224
		     * 676699829) != 0
		    && class654_sub1_sub5_sub1_sub2.anInt12224 * 676699829 != 0
		    && ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.anInt12224
			 * 676699829)
			== (class654_sub1_sub5_sub1_sub2.anInt12224
			    * 676699829)))
		    bool_373_ = true;
		if (null != class654_sub1_sub5_sub1_sub2.aClass631_12226
		    && 1568742735 * (class654_sub1_sub5_sub1_sub2
				     .aClass631_12226.anInt8212) != -1
		    && ((Class307) (Class578.aClass44_Sub3_7743.method91
				    ((class654_sub1_sub5_sub1_sub2
				      .aClass631_12226.anInt8212) * 1568742735,
				     -85303879))).aBool3348)
		    Class246.method4509(class247, class145, i_364_, i_365_,
					i_368_, i_369_,
					Class67.aClass163Array721[1],
					1313730702);
		else if (class654_sub1_sub5_sub1_sub2.aClass252_12232
			 == Class252.aClass252_2655)
		    Class246.method4509(class247, class145, i_364_, i_365_,
					i_368_, i_369_,
					Class67.aClass163Array721[8],
					1313730702);
		else if (Class252.aClass252_2656
			 == class654_sub1_sub5_sub1_sub2.aClass252_12232)
		    Class246.method4509(class247, class145, i_364_, i_365_,
					i_368_, i_369_,
					Class67.aClass163Array721[6],
					1313730702);
		else if (bool_373_)
		    Class246.method4509(class247, class145, i_364_, i_365_,
					i_368_, i_369_,
					Class67.aClass163Array721[4],
					1313730702);
		else if (class654_sub1_sub5_sub1_sub2.aBool12234)
		    Class246.method4509(class247, class145, i_364_, i_365_,
					i_368_, i_369_,
					Class67.aClass163Array721[7],
					1313730702);
		else if (bool)
		    Class246.method4509(class247, class145, i_364_, i_365_,
					i_368_, i_369_,
					Class67.aClass163Array721[3],
					1313730702);
		else if (bool_371_)
		    Class246.method4509(class247, class145, i_364_, i_365_,
					i_368_, i_369_,
					Class67.aClass163Array721[5],
					1313730702);
		else
		    Class246.method4509(class247, class145, i_364_, i_365_,
					i_368_, i_369_,
					Class67.aClass163Array721[2],
					1313730702);
	    }
	}
    }
    
    static void method2053(int i, int i_374_, boolean bool) {
	aBoolArrayArray1374[i][i_374_] = bool;
    }
    
    static void method2054(int i, int i_375_, Class247 class247,
			   Class145 class145, int i_376_, int i_377_) {
	int i_378_ = -1843550713 * Class108.anInt1321;
	int[] is = Class108.anIntArray1322;
	for (int i_379_ = 0; i_379_ < i_378_; i_379_++) {
	    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		= client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[is[i_379_]];
	    if (null != class654_sub1_sub5_sub1_sub2
		&& class654_sub1_sub5_sub1_sub2.method18876(-441117355)
		&& !class654_sub1_sub5_sub1_sub2.aClass618_12216
			.method10242((byte) -23)
		&& (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
		    != class654_sub1_sub5_sub1_sub2)
		&& (class654_sub1_sub5_sub1_sub2.aByte10854
		    == (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			.aByte10854))) {
		Class438 class438 = (class654_sub1_sub5_sub1_sub2.method10807()
				     .aClass438_4885);
		int i_380_ = (int) class438.aFloat4864 / 128 - i / 128;
		int i_381_ = (int) class438.aFloat4865 / 128 - i_375_ / 128;
		boolean bool = false;
		for (int i_382_ = 0; i_382_ < -1979292205 * client.anInt11324;
		     i_382_++) {
		    Class28 class28 = client.aClass28Array11327[i_382_];
		    if (class654_sub1_sub5_sub1_sub2.aString12211
			    .equals(class28.aString257)
			&& -721928209 * class28.anInt251 != 0) {
			bool = true;
			break;
		    }
		}
		boolean bool_383_ = false;
		for (int i_384_ = 0; i_384_ < -217094943 * Class455.anInt4963;
		     i_384_++) {
		    if (class654_sub1_sub5_sub1_sub2.aString12211.equals
			(Class168.aClass98Array1792[i_384_].aString1162)) {
			bool_383_ = true;
			break;
		    }
		}
		boolean bool_385_ = false;
		if ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.anInt12224
		     * 676699829) != 0
		    && class654_sub1_sub5_sub1_sub2.anInt12224 * 676699829 != 0
		    && ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.anInt12224
			 * 676699829)
			== (class654_sub1_sub5_sub1_sub2.anInt12224
			    * 676699829)))
		    bool_385_ = true;
		if (null != class654_sub1_sub5_sub1_sub2.aClass631_12226
		    && 1568742735 * (class654_sub1_sub5_sub1_sub2
				     .aClass631_12226.anInt8212) != -1
		    && ((Class307) (Class578.aClass44_Sub3_7743.method91
				    ((class654_sub1_sub5_sub1_sub2
				      .aClass631_12226.anInt8212) * 1568742735,
				     1548296496))).aBool3348)
		    Class246.method4509(class247, class145, i_376_, i_377_,
					i_380_, i_381_,
					Class67.aClass163Array721[1],
					1313730702);
		else if (class654_sub1_sub5_sub1_sub2.aClass252_12232
			 == Class252.aClass252_2655)
		    Class246.method4509(class247, class145, i_376_, i_377_,
					i_380_, i_381_,
					Class67.aClass163Array721[8],
					1313730702);
		else if (Class252.aClass252_2656
			 == class654_sub1_sub5_sub1_sub2.aClass252_12232)
		    Class246.method4509(class247, class145, i_376_, i_377_,
					i_380_, i_381_,
					Class67.aClass163Array721[6],
					1313730702);
		else if (bool_385_)
		    Class246.method4509(class247, class145, i_376_, i_377_,
					i_380_, i_381_,
					Class67.aClass163Array721[4],
					1313730702);
		else if (class654_sub1_sub5_sub1_sub2.aBool12234)
		    Class246.method4509(class247, class145, i_376_, i_377_,
					i_380_, i_381_,
					Class67.aClass163Array721[7],
					1313730702);
		else if (bool)
		    Class246.method4509(class247, class145, i_376_, i_377_,
					i_380_, i_381_,
					Class67.aClass163Array721[3],
					1313730702);
		else if (bool_383_)
		    Class246.method4509(class247, class145, i_376_, i_377_,
					i_380_, i_381_,
					Class67.aClass163Array721[5],
					1313730702);
		else
		    Class246.method4509(class247, class145, i_376_, i_377_,
					i_380_, i_381_,
					Class67.aClass163Array721[2],
					1313730702);
	    }
	}
    }
    
    static void method2055(int i, int i_386_, Class247 class247,
			   Class145 class145, int i_387_, int i_388_) {
	int i_389_ = -1843550713 * Class108.anInt1321;
	int[] is = Class108.anIntArray1322;
	for (int i_390_ = 0; i_390_ < i_389_; i_390_++) {
	    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		= client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[is[i_390_]];
	    if (null != class654_sub1_sub5_sub1_sub2
		&& class654_sub1_sub5_sub1_sub2.method18876(-441117355)
		&& !class654_sub1_sub5_sub1_sub2.aClass618_12216
			.method10242((byte) -94)
		&& (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
		    != class654_sub1_sub5_sub1_sub2)
		&& (class654_sub1_sub5_sub1_sub2.aByte10854
		    == (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			.aByte10854))) {
		Class438 class438 = (class654_sub1_sub5_sub1_sub2.method10807()
				     .aClass438_4885);
		int i_391_ = (int) class438.aFloat4864 / 128 - i / 128;
		int i_392_ = (int) class438.aFloat4865 / 128 - i_386_ / 128;
		boolean bool = false;
		for (int i_393_ = 0; i_393_ < -1979292205 * client.anInt11324;
		     i_393_++) {
		    Class28 class28 = client.aClass28Array11327[i_393_];
		    if (class654_sub1_sub5_sub1_sub2.aString12211
			    .equals(class28.aString257)
			&& -721928209 * class28.anInt251 != 0) {
			bool = true;
			break;
		    }
		}
		boolean bool_394_ = false;
		for (int i_395_ = 0; i_395_ < -217094943 * Class455.anInt4963;
		     i_395_++) {
		    if (class654_sub1_sub5_sub1_sub2.aString12211.equals
			(Class168.aClass98Array1792[i_395_].aString1162)) {
			bool_394_ = true;
			break;
		    }
		}
		boolean bool_396_ = false;
		if ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.anInt12224
		     * 676699829) != 0
		    && class654_sub1_sub5_sub1_sub2.anInt12224 * 676699829 != 0
		    && ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.anInt12224
			 * 676699829)
			== (class654_sub1_sub5_sub1_sub2.anInt12224
			    * 676699829)))
		    bool_396_ = true;
		if (null != class654_sub1_sub5_sub1_sub2.aClass631_12226
		    && 1568742735 * (class654_sub1_sub5_sub1_sub2
				     .aClass631_12226.anInt8212) != -1
		    && ((Class307) (Class578.aClass44_Sub3_7743.method91
				    ((class654_sub1_sub5_sub1_sub2
				      .aClass631_12226.anInt8212) * 1568742735,
				     -762408190))).aBool3348)
		    Class246.method4509(class247, class145, i_387_, i_388_,
					i_391_, i_392_,
					Class67.aClass163Array721[1],
					1313730702);
		else if (class654_sub1_sub5_sub1_sub2.aClass252_12232
			 == Class252.aClass252_2655)
		    Class246.method4509(class247, class145, i_387_, i_388_,
					i_391_, i_392_,
					Class67.aClass163Array721[8],
					1313730702);
		else if (Class252.aClass252_2656
			 == class654_sub1_sub5_sub1_sub2.aClass252_12232)
		    Class246.method4509(class247, class145, i_387_, i_388_,
					i_391_, i_392_,
					Class67.aClass163Array721[6],
					1313730702);
		else if (bool_396_)
		    Class246.method4509(class247, class145, i_387_, i_388_,
					i_391_, i_392_,
					Class67.aClass163Array721[4],
					1313730702);
		else if (class654_sub1_sub5_sub1_sub2.aBool12234)
		    Class246.method4509(class247, class145, i_387_, i_388_,
					i_391_, i_392_,
					Class67.aClass163Array721[7],
					1313730702);
		else if (bool)
		    Class246.method4509(class247, class145, i_387_, i_388_,
					i_391_, i_392_,
					Class67.aClass163Array721[3],
					1313730702);
		else if (bool_394_)
		    Class246.method4509(class247, class145, i_387_, i_388_,
					i_391_, i_392_,
					Class67.aClass163Array721[5],
					1313730702);
		else
		    Class246.method4509(class247, class145, i_387_, i_388_,
					i_391_, i_392_,
					Class67.aClass163Array721[2],
					1313730702);
	    }
	}
    }
    
    static void method2056(int i, int i_397_, boolean bool) {
	aBoolArrayArray1374[i][i_397_] = bool;
    }
    
    static {
	anInt1380 = 0;
	anIntArray1371 = new int[1013];
	anIntArray1372 = new int[1000];
	anIntArray1377 = new int[1012];
	aClass700_1369 = new Class700();
	anInt1375 = 1660827629;
	anInt1376 = -517634255;
	aBool1373 = true;
	aBool1378 = false;
	anInt1365 = 0;
    }
    
    static void method2057(Class185 class185, int i, int i_398_, int i_399_,
			   int i_400_, int i_401_, int i_402_, int i_403_) {
	Class556 class556 = client.aClass512_11100.method8424((byte) 54);
	Interface62 interface62
	    = ((Interface62)
	       class556.method9258(i, i_398_, i_399_, (byte) -103));
	if (null != interface62) {
	    Class602 class602
		= ((Class602)
		   (client.aClass512_11100.method8428(-1486655428).method91
		    (interface62.method56(-1294768691), -454704992)));
	    int i_404_ = interface62.method410(-1252014004) & 0x3;
	    int i_405_ = interface62.method409(-1706992405);
	    if (class602.anInt7890 * 350336715 != -1)
		Class233.method4341(class185, class602, i_404_, i_400_, i_401_,
				    1367248999);
	    else {
		int i_406_ = i_402_;
		if (-2134171963 * class602.anInt7907 > 0)
		    i_406_ = i_403_;
		if (i_405_ == 847393323 * Class595.aClass595_7851.anInt7852
		    || (i_405_
			== 847393323 * Class595.aClass595_7829.anInt7852)) {
		    if (0 == i_404_)
			class185.method3302(i_400_, i_401_, 4, i_406_,
					    -824774658);
		    else if (i_404_ == 1)
			class185.method3294(i_400_, i_401_, 4, i_406_,
					    -1788204303);
		    else if (i_404_ == 2)
			class185.method3302(i_400_ + 3, i_401_, 4, i_406_,
					    -1012764852);
		    else if (i_404_ == 3)
			class185.method3294(i_400_, 3 + i_401_, 4, i_406_,
					    -114481890);
		}
		if (i_405_ == Class595.aClass595_7832.anInt7852 * 847393323) {
		    if (i_404_ == 0)
			class185.method3292(i_400_, i_401_, 1, 1, i_406_,
					    -2035902034);
		    else if (1 == i_404_)
			class185.method3292(i_400_ + 3, i_401_, 1, 1, i_406_,
					    -1592774587);
		    else if (2 == i_404_)
			class185.method3292(i_400_ + 3, i_401_ + 3, 1, 1,
					    i_406_, -1580616118);
		    else if (3 == i_404_)
			class185.method3292(i_400_, i_401_ + 3, 1, 1, i_406_,
					    -1732103459);
		}
		if (i_405_ == 847393323 * Class595.aClass595_7829.anInt7852) {
		    if (i_404_ == 0)
			class185.method3294(i_400_, i_401_, 4, i_406_,
					    1637946009);
		    else if (i_404_ == 1)
			class185.method3302(3 + i_400_, i_401_, 4, i_406_,
					    1095913915);
		    else if (i_404_ == 2)
			class185.method3294(i_400_, 3 + i_401_, 4, i_406_,
					    970276261);
		    else if (3 == i_404_)
			class185.method3302(i_400_, i_401_, 4, i_406_,
					    -1099751202);
		}
	    }
	}
	interface62
	    = (Interface62) class556.method9262(i, i_398_, i_399_,
						client.anInterface64_11333,
						(byte) -108);
	if (null != interface62) {
	    Class602 class602
		= ((Class602)
		   client.aClass512_11100.method8428(-1486655428)
		       .method91(interface62.method56(-928489319), 453433065));
	    int i_407_ = interface62.method410(1258342784) & 0x3;
	    int i_408_ = interface62.method409(-2042474059);
	    if (-1 != 350336715 * class602.anInt7890)
		Class233.method4341(class185, class602, i_407_, i_400_, i_401_,
				    -1329161651);
	    else if (i_408_ == 847393323 * Class595.aClass595_7833.anInt7852) {
		int i_409_ = -1118482;
		if (-2134171963 * class602.anInt7907 > 0)
		    i_409_ = -1179648;
		if (0 == i_407_ || 2 == i_407_)
		    class185.method3567(i_400_, i_401_ + 3, 3 + i_400_, i_401_,
					i_409_, 963540716);
		else
		    class185.method3567(i_400_, i_401_, 3 + i_400_, i_401_ + 3,
					i_409_, 1975328471);
	    }
	}
	interface62
	    = (Interface62) class556.method9264(i, i_398_, i_399_, (byte) 82);
	if (null != interface62) {
	    Class602 class602
		= ((Class602)
		   client.aClass512_11100.method8428(-1486655428)
		       .method91(interface62.method56(-37664787), -283305763));
	    int i_410_ = interface62.method410(390488441) & 0x3;
	    if (-1 != class602.anInt7890 * 350336715)
		Class233.method4341(class185, class602, i_410_, i_400_, i_401_,
				    -1682207959);
	}
    }
    
    static void method2058(Class247 class247, Class145 class145, int i,
			   int i_411_, int i_412_, int i_413_, int i_414_,
			   String string, Class171 class171, Class16 class16,
			   int i_415_) {
	int i_416_;
	if (3 == -891094135 * Class10.anInt75)
	    i_416_ = ((int) ((double) Class599.aClass298_Sub1_7871
					  .method5389(-1859825986)
			     * 2607.5945876176133)
		      + -2045337339 * client.anInt11189) & 0x3fff;
	else if (5 == -891094135 * Class10.anInt75)
	    i_416_ = (int) client.aFloat11140 & 0x3fff;
	else
	    i_416_
		= ((int) client.aFloat11140 + client.anInt11189 * -2045337339
		   & 0x3fff);
	int i_417_ = (Math.max(-881188269 * class247.anInt2468 / 2,
			       class247.anInt2469 * -1279656873 / 2)
		      + 10);
	int i_418_ = i_412_ * i_412_ + i_413_ * i_413_;
	if (i_418_ <= i_417_ * i_417_) {
	    int i_419_ = Class427.anIntArray4806[i_416_];
	    int i_420_ = Class427.anIntArray4805[i_416_];
	    if (5 != -891094135 * Class10.anInt75) {
		i_419_
		    = i_419_ * 256 / (-2002513841 * client.anInt11022 + 256);
		i_420_
		    = i_420_ * 256 / (-2002513841 * client.anInt11022 + 256);
	    }
	    int i_421_ = i_413_ * i_419_ + i_412_ * i_420_ >> 14;
	    int i_422_ = i_413_ * i_420_ - i_419_ * i_412_ >> 14;
	    int i_423_ = class16.method747(string, 100, null, 1078813868);
	    int i_424_ = class16.method737(string, 100, 0, null, 2112849964);
	    i_421_ -= i_423_ / 2;
	    if (i_421_ >= -(class247.anInt2468 * -881188269)
		&& i_421_ <= -881188269 * class247.anInt2468
		&& i_422_ >= -(-1279656873 * class247.anInt2469)
		&& i_422_ <= class247.anInt2469 * -1279656873)
		class171.method2844(string,
				    (-881188269 * class247.anInt2468 / 2
				     + (i + i_421_)),
				    (class247.anInt2469 * -1279656873 / 2
				     + i_411_ - i_422_ - i_414_ - i_424_),
				    i_423_, 50, i_415_, 0, 1, 0, 0, null, null,
				    class145, i, i_411_, 202025040);
	}
    }
    
    static void method2059(Class185 class185, Class145 class145,
			   Class247 class247, int i, int i_425_, int i_426_,
			   int i_427_, int i_428_) {
	Class272 class272
	    = ((Class272)
	       Class222.aClass44_Sub9_2313.method91(i_428_, -1950899083));
	if (null != class272 && class272.anIntArray2981 != null
	    && class272.method5063(Class78.aClass103_825,
				   Class78.aClass103_825, (short) 1177))
	    class272 = class272.method5052(Class78.aClass103_825,
					   Class78.aClass103_825, -2048318387);
	if (null != class272 && class272.aBool2979
	    && class272.method5063(Class78.aClass103_825,
				   Class78.aClass103_825, (short) 18308)) {
	    if (null != class272.anIntArray2992) {
		int[] is = new int[class272.anIntArray2992.length];
		for (int i_429_ = 0; i_429_ < is.length / 2; i_429_++) {
		    int i_430_;
		    if (3 == -891094135 * Class10.anInt75)
			i_430_ = ((int) ((double) Class599
						      .aClass298_Sub1_7871
						      .method5389(-1447263533)
					 * 2607.5945876176133)
				  + client.anInt11189 * -2045337339) & 0x3fff;
		    else if (5 == Class10.anInt75 * -891094135)
			i_430_ = (int) client.aFloat11140 & 0x3fff;
		    else
			i_430_ = ((int) client.aFloat11140
				  + client.anInt11189 * -2045337339) & 0x3fff;
		    int i_431_ = Class427.anIntArray4806[i_430_];
		    int i_432_ = Class427.anIntArray4805[i_430_];
		    if (-891094135 * Class10.anInt75 != 5) {
			i_431_
			    = i_431_ * 256 / (client.anInt11022 * -2002513841
					      + 256);
			i_432_ = (i_432_ * 256
				  / (256 + client.anInt11022 * -2002513841));
		    }
		    is[i_429_ * 2]
			= (i + class247.anInt2468 * -881188269 / 2
			   + ((i_432_ * (i_426_ + 4 * (class272.anIntArray2992
						       [2 * i_429_]))
			       + (class272.anIntArray2992[i_429_ * 2 + 1] * 4
				  + i_427_) * i_431_)
			      >> 14));
		    is[1 + i_429_ * 2]
			= (class247.anInt2469 * -1279656873 / 2 + i_425_
			   - ((((i_427_
				 + 4 * class272.anIntArray2992[i_429_ * 2 + 1])
				* i_432_)
			       - ((i_426_
				   + 4 * class272.anIntArray2992[2 * i_429_])
				  * i_431_))
			      >> 14));
		}
		Class246 class246 = class247.method4525(class185, 447549967);
		if (null != class246)
		    Class182.method2992(class185, is,
					class272.anInt2997 * 1393455813,
					class246.anIntArray2422,
					class246.anIntArray2421);
		if (685328963 * class272.anInt3011 > 0) {
		    for (int i_433_ = 0; i_433_ < is.length / 2 - 1;
			 i_433_++) {
			int i_434_ = is[2 * i_433_];
			int i_435_ = is[i_433_ * 2 + 1];
			int i_436_ = is[2 * (1 + i_433_)];
			int i_437_ = is[2 * (i_433_ + 1) + 1];
			if (i_436_ < i_434_) {
			    int i_438_ = i_434_;
			    int i_439_ = i_435_;
			    i_434_ = i_436_;
			    i_435_ = i_437_;
			    i_436_ = i_438_;
			    i_437_ = i_439_;
			} else if (i_434_ == i_436_ && i_437_ < i_435_) {
			    int i_440_ = i_435_;
			    i_435_ = i_437_;
			    i_437_ = i_440_;
			}
			if (null != class145)
			    class185.method3306
				(i_434_, i_435_, i_436_, i_437_,
				 (class272.anIntArray2986
				  [class272.aByteArray3006[i_433_] & 0xff]),
				 1, class145, i, i_425_,
				 class272.anInt3011 * 685328963,
				 1781521033 * class272.anInt2999,
				 class272.anInt3000 * 290033855);
			else
			    class185.method3305
				(i_434_, i_435_, i_436_, i_437_,
				 (class272.anIntArray2986
				  [class272.aByteArray3006[i_433_] & 0xff]),
				 1, class272.anInt3011 * 685328963,
				 1781521033 * class272.anInt2999,
				 290033855 * class272.anInt3000);
		    }
		    int i_441_ = is[is.length - 2];
		    int i_442_ = is[is.length - 1];
		    int i_443_ = is[0];
		    int i_444_ = is[1];
		    if (i_443_ < i_441_) {
			int i_445_ = i_441_;
			int i_446_ = i_442_;
			i_441_ = i_443_;
			i_442_ = i_444_;
			i_443_ = i_445_;
			i_444_ = i_446_;
		    } else if (i_441_ == i_443_ && i_444_ < i_442_) {
			int i_447_ = i_442_;
			i_442_ = i_444_;
			i_444_ = i_447_;
		    }
		    if (class145 != null)
			class185.method3306(i_441_, i_442_, i_443_, i_444_,
					    (class272.anIntArray2986
					     [(class272.aByteArray3006
					       [(class272.aByteArray3006.length
						 - 1)]) & 0xff]),
					    1, class145, i, i_425_,
					    class272.anInt3011 * 685328963,
					    class272.anInt2999 * 1781521033,
					    290033855 * class272.anInt3000);
		    else
			class185.method3305(i_441_, i_442_, i_443_, i_444_,
					    (class272.anIntArray2986
					     [(class272.aByteArray3006
					       [(class272.aByteArray3006.length
						 - 1)]) & 0xff]),
					    1, 685328963 * class272.anInt3011,
					    1781521033 * class272.anInt2999,
					    class272.anInt3000 * 290033855);
		} else if (null != class145) {
		    for (int i_448_ = 0; i_448_ < is.length / 2 - 1; i_448_++)
			class185.method3384(is[i_448_ * 2], is[1 + 2 * i_448_],
					    is[2 * (i_448_ + 1)],
					    is[2 * (1 + i_448_) + 1],
					    (class272.anIntArray2986
					     [(class272.aByteArray3006[i_448_]
					       & 0xff)]),
					    1, class145, i, i_425_);
		    class185.method3384(is[is.length - 2], is[is.length - 1],
					is[0], is[1],
					(class272.anIntArray2986
					 [(class272.aByteArray3006
					   [(class272.aByteArray3006.length
					     - 1)]) & 0xff]),
					1, class145, i, i_425_);
		} else {
		    for (int i_449_ = 0; i_449_ < is.length / 2 - 1; i_449_++)
			class185.method3303(is[2 * i_449_], is[1 + i_449_ * 2],
					    is[2 * (1 + i_449_)],
					    is[2 * (1 + i_449_) + 1],
					    (class272.anIntArray2986
					     [(class272.aByteArray3006[i_449_]
					       & 0xff)]),
					    1);
		    class185.method3303(is[is.length - 2], is[is.length - 1],
					is[0], is[1],
					(class272.anIntArray2986
					 [(class272.aByteArray3006
					   [(class272.aByteArray3006.length
					     - 1)]) & 0xff]),
					1);
		}
	    }
	    Class163 class163 = null;
	    if (-1 != 1747122653 * class272.anInt2967) {
		class163 = class272.method5047(class185, false, 1239047577);
		if (class163 != null) {
		    int i_450_
			= (class272.anInt3007 * 1484992485 > 0
			   ? class272.anInt3007 * 1484992485
			   : 1515024757 * Class620.aClass632_8113.anInt8267);
		    Class30.method879(class247, class145, i, i_425_, i_426_,
				      i_427_, class163, (double) i_450_,
				      class272.aClass284_3003,
				      class272.aClass280_3004, -1986459340);
		}
	    }
	    if (null != class272.aString2969) {
		int i_451_ = 0;
		if (null != class163)
		    i_451_ = class163.method2649();
		Class171 class171 = Class219.aClass171_2307;
		Class16 class16 = Class690_Sub9.aClass16_10875;
		if (class272.anInt2985 * 638004337 == 1) {
		    class171 = Class539_Sub1.aClass171_10327;
		    class16 = Class67.aClass16_720;
		}
		if (class272.anInt2985 * 638004337 == 2) {
		    class171 = Class231.aClass171_2325;
		    class16 = Class322.aClass16_3420;
		}
		Class575.method9758(class247, class145, i, i_425_, i_426_,
				    i_427_, i_451_, class272.aString2969,
				    class171, class16,
				    -1512587879 * class272.anInt2970,
				    (byte) 1);
	    }
	}
    }
    
    static void method2060(Class185 class185, Class145 class145,
			   Class247 class247, int i, int i_452_, int i_453_,
			   int i_454_, int i_455_) {
	Class272 class272
	    = ((Class272)
	       Class222.aClass44_Sub9_2313.method91(i_455_, -1219341012));
	if (null != class272 && class272.anIntArray2981 != null
	    && class272.method5063(Class78.aClass103_825,
				   Class78.aClass103_825, (short) 10578))
	    class272 = class272.method5052(Class78.aClass103_825,
					   Class78.aClass103_825, 1173693396);
	if (null != class272 && class272.aBool2979
	    && class272.method5063(Class78.aClass103_825,
				   Class78.aClass103_825, (short) 26904)) {
	    if (null != class272.anIntArray2992) {
		int[] is = new int[class272.anIntArray2992.length];
		for (int i_456_ = 0; i_456_ < is.length / 2; i_456_++) {
		    int i_457_;
		    if (3 == -891094135 * Class10.anInt75)
			i_457_ = ((int) ((double) Class599
						      .aClass298_Sub1_7871
						      .method5389(330249459)
					 * 2607.5945876176133)
				  + client.anInt11189 * -2045337339) & 0x3fff;
		    else if (5 == Class10.anInt75 * -891094135)
			i_457_ = (int) client.aFloat11140 & 0x3fff;
		    else
			i_457_ = ((int) client.aFloat11140
				  + client.anInt11189 * -2045337339) & 0x3fff;
		    int i_458_ = Class427.anIntArray4806[i_457_];
		    int i_459_ = Class427.anIntArray4805[i_457_];
		    if (-891094135 * Class10.anInt75 != 5) {
			i_458_
			    = i_458_ * 256 / (client.anInt11022 * -2002513841
					      + 256);
			i_459_ = (i_459_ * 256
				  / (256 + client.anInt11022 * -2002513841));
		    }
		    is[i_456_ * 2]
			= (i + class247.anInt2468 * -881188269 / 2
			   + ((i_459_ * (i_453_ + 4 * (class272.anIntArray2992
						       [2 * i_456_]))
			       + (class272.anIntArray2992[i_456_ * 2 + 1] * 4
				  + i_454_) * i_458_)
			      >> 14));
		    is[1 + i_456_ * 2]
			= (class247.anInt2469 * -1279656873 / 2 + i_452_
			   - ((((i_454_
				 + 4 * class272.anIntArray2992[i_456_ * 2 + 1])
				* i_459_)
			       - ((i_453_
				   + 4 * class272.anIntArray2992[2 * i_456_])
				  * i_458_))
			      >> 14));
		}
		Class246 class246 = class247.method4525(class185, 447549967);
		if (null != class246)
		    Class182.method2992(class185, is,
					class272.anInt2997 * 1393455813,
					class246.anIntArray2422,
					class246.anIntArray2421);
		if (685328963 * class272.anInt3011 > 0) {
		    for (int i_460_ = 0; i_460_ < is.length / 2 - 1;
			 i_460_++) {
			int i_461_ = is[2 * i_460_];
			int i_462_ = is[i_460_ * 2 + 1];
			int i_463_ = is[2 * (1 + i_460_)];
			int i_464_ = is[2 * (i_460_ + 1) + 1];
			if (i_463_ < i_461_) {
			    int i_465_ = i_461_;
			    int i_466_ = i_462_;
			    i_461_ = i_463_;
			    i_462_ = i_464_;
			    i_463_ = i_465_;
			    i_464_ = i_466_;
			} else if (i_461_ == i_463_ && i_464_ < i_462_) {
			    int i_467_ = i_462_;
			    i_462_ = i_464_;
			    i_464_ = i_467_;
			}
			if (null != class145)
			    class185.method3306
				(i_461_, i_462_, i_463_, i_464_,
				 (class272.anIntArray2986
				  [class272.aByteArray3006[i_460_] & 0xff]),
				 1, class145, i, i_452_,
				 class272.anInt3011 * 685328963,
				 1781521033 * class272.anInt2999,
				 class272.anInt3000 * 290033855);
			else
			    class185.method3305
				(i_461_, i_462_, i_463_, i_464_,
				 (class272.anIntArray2986
				  [class272.aByteArray3006[i_460_] & 0xff]),
				 1, class272.anInt3011 * 685328963,
				 1781521033 * class272.anInt2999,
				 290033855 * class272.anInt3000);
		    }
		    int i_468_ = is[is.length - 2];
		    int i_469_ = is[is.length - 1];
		    int i_470_ = is[0];
		    int i_471_ = is[1];
		    if (i_470_ < i_468_) {
			int i_472_ = i_468_;
			int i_473_ = i_469_;
			i_468_ = i_470_;
			i_469_ = i_471_;
			i_470_ = i_472_;
			i_471_ = i_473_;
		    } else if (i_468_ == i_470_ && i_471_ < i_469_) {
			int i_474_ = i_469_;
			i_469_ = i_471_;
			i_471_ = i_474_;
		    }
		    if (class145 != null)
			class185.method3306(i_468_, i_469_, i_470_, i_471_,
					    (class272.anIntArray2986
					     [(class272.aByteArray3006
					       [(class272.aByteArray3006.length
						 - 1)]) & 0xff]),
					    1, class145, i, i_452_,
					    class272.anInt3011 * 685328963,
					    class272.anInt2999 * 1781521033,
					    290033855 * class272.anInt3000);
		    else
			class185.method3305(i_468_, i_469_, i_470_, i_471_,
					    (class272.anIntArray2986
					     [(class272.aByteArray3006
					       [(class272.aByteArray3006.length
						 - 1)]) & 0xff]),
					    1, 685328963 * class272.anInt3011,
					    1781521033 * class272.anInt2999,
					    class272.anInt3000 * 290033855);
		} else if (null != class145) {
		    for (int i_475_ = 0; i_475_ < is.length / 2 - 1; i_475_++)
			class185.method3384(is[i_475_ * 2], is[1 + 2 * i_475_],
					    is[2 * (i_475_ + 1)],
					    is[2 * (1 + i_475_) + 1],
					    (class272.anIntArray2986
					     [(class272.aByteArray3006[i_475_]
					       & 0xff)]),
					    1, class145, i, i_452_);
		    class185.method3384(is[is.length - 2], is[is.length - 1],
					is[0], is[1],
					(class272.anIntArray2986
					 [(class272.aByteArray3006
					   [(class272.aByteArray3006.length
					     - 1)]) & 0xff]),
					1, class145, i, i_452_);
		} else {
		    for (int i_476_ = 0; i_476_ < is.length / 2 - 1; i_476_++)
			class185.method3303(is[2 * i_476_], is[1 + i_476_ * 2],
					    is[2 * (1 + i_476_)],
					    is[2 * (1 + i_476_) + 1],
					    (class272.anIntArray2986
					     [(class272.aByteArray3006[i_476_]
					       & 0xff)]),
					    1);
		    class185.method3303(is[is.length - 2], is[is.length - 1],
					is[0], is[1],
					(class272.anIntArray2986
					 [(class272.aByteArray3006
					   [(class272.aByteArray3006.length
					     - 1)]) & 0xff]),
					1);
		}
	    }
	    Class163 class163 = null;
	    if (-1 != 1747122653 * class272.anInt2967) {
		class163 = class272.method5047(class185, false, 1112032740);
		if (class163 != null) {
		    int i_477_
			= (class272.anInt3007 * 1484992485 > 0
			   ? class272.anInt3007 * 1484992485
			   : 1515024757 * Class620.aClass632_8113.anInt8267);
		    Class30.method879(class247, class145, i, i_452_, i_453_,
				      i_454_, class163, (double) i_477_,
				      class272.aClass284_3003,
				      class272.aClass280_3004, -1830969497);
		}
	    }
	    if (null != class272.aString2969) {
		int i_478_ = 0;
		if (null != class163)
		    i_478_ = class163.method2649();
		Class171 class171 = Class219.aClass171_2307;
		Class16 class16 = Class690_Sub9.aClass16_10875;
		if (class272.anInt2985 * 638004337 == 1) {
		    class171 = Class539_Sub1.aClass171_10327;
		    class16 = Class67.aClass16_720;
		}
		if (class272.anInt2985 * 638004337 == 2) {
		    class171 = Class231.aClass171_2325;
		    class16 = Class322.aClass16_3420;
		}
		Class575.method9758(class247, class145, i, i_452_, i_453_,
				    i_454_, i_478_, class272.aString2969,
				    class171, class16,
				    -1512587879 * class272.anInt2970,
				    (byte) 1);
	    }
	}
    }
    
    static void method2061(Class247 class247, Class246 class246, int i,
			   int i_479_, int i_480_, int i_481_, int i_482_,
			   long l) {
	int i_483_ = i_480_ * i_480_ + i_481_ * i_481_;
	if ((long) i_483_ <= l) {
	    int i_484_;
	    if (Class10.anInt75 * -891094135 == 3)
		i_484_ = ((int) ((double) Class599.aClass298_Sub1_7871
					      .method5389(-320797375)
				 * 2607.5945876176133)
			  + client.anInt11189 * -2045337339) & 0x3fff;
	    else if (5 == -891094135 * Class10.anInt75)
		i_484_ = (int) client.aFloat11140 & 0x3fff;
	    else
		i_484_ = ((int) client.aFloat11140
			  + -2045337339 * client.anInt11189) & 0x3fff;
	    int i_485_ = Class427.anIntArray4806[i_484_];
	    int i_486_ = Class427.anIntArray4805[i_484_];
	    if (5 != Class10.anInt75 * -891094135) {
		i_485_
		    = i_485_ * 256 / (client.anInt11022 * -2002513841 + 256);
		i_486_
		    = 256 * i_486_ / (256 + client.anInt11022 * -2002513841);
	    }
	    int i_487_ = i_486_ * i_480_ + i_485_ * i_481_ >> 14;
	    int i_488_ = i_486_ * i_481_ - i_480_ * i_485_ >> 14;
	    Class163 class163 = Class530.aClass163Array7133[i_482_];
	    int i_489_ = class163.method2647();
	    int i_490_ = class163.method2649();
	    int i_491_
		= class247.anInt2468 * -881188269 / 2 + i_487_ - i_489_ / 2;
	    int i_492_ = i_491_ + i_489_;
	    int i_493_
		= class247.anInt2469 * -1279656873 / 2 + -i_488_ - i_490_;
	    int i_494_ = i_493_ + i_490_;
	    boolean bool;
	    if (null != class246)
		bool = (!class246.method4504(i_491_, i_493_, -1494229182)
			|| !class246.method4504(i_492_, i_493_, -1425615299)
			|| !class246.method4504(i_491_, i_494_, 1094589786)
			|| !class246.method4504(i_492_, i_494_, 1041621497));
	    else {
		int i_495_ = i_490_;
		int i_496_ = i_489_ / 2;
		bool = (i_493_ <= -i_495_
			|| i_494_ >= -1279656873 * class247.anInt2469
			|| i_491_ <= -i_496_
			|| i_492_ >= i_496_ + class247.anInt2468 * -881188269);
	    }
	    if (bool) {
		double d = Math.atan2((double) i_487_, (double) i_488_);
		double d_497_ = Math.atan2((double) Math.abs(i_487_),
					   (double) Math.abs(i_488_));
		double d_498_ = Math.atan2((double) (-881188269
						     * class247.anInt2468 / 2),
					   (double) (class247.anInt2469
						     * -1279656873 / 2));
		boolean bool_499_ = false;
		double d_500_ = 0.0;
		int i_501_;
		if (d_497_ < d_498_) {
		    d_500_ = 1.5707963267948966 - d;
		    i_501_ = -1279656873 * class247.anInt2469 / 2;
		} else {
		    d_500_ = d;
		    i_501_ = -881188269 * class247.anInt2468 / 2;
		}
		int i_502_ = Math.abs((int) -((double) i_501_
					      * Math.sin(1.5707963267948966)
					      / Math.sin(d_500_)));
		Class310.aClass163Array3359[i_482_].method2664
		    ((0.0F
		      + ((float) i
			 + (float) (-881188269 * class247.anInt2468) / 2.0F)),
		     ((float) i_479_
		      + (float) (-1279656873 * class247.anInt2469) / 2.0F
		      - 0.0F),
		     ((float) Class310.aClass163Array3359[i_482_].method22()
		      / 2.0F),
		     (float) i_502_, 4096,
		     (int) (-d / 6.283185307179586 * 65535.0));
	    } else if (null != class246)
		class163.method2691(i + i_491_, i_479_ + i_493_,
				    class246.aClass145_2423, i, i_479_);
	    else
		class163.method2656(i + i_491_, i_479_ + i_493_);
	}
    }
    
    static void method2062(Class247 class247, Class246 class246, int i,
			   int i_503_, int i_504_, int i_505_, int i_506_,
			   long l) {
	int i_507_ = i_504_ * i_504_ + i_505_ * i_505_;
	if ((long) i_507_ <= l) {
	    int i_508_;
	    if (Class10.anInt75 * -891094135 == 3)
		i_508_ = ((int) ((double) Class599.aClass298_Sub1_7871
					      .method5389(-512595739)
				 * 2607.5945876176133)
			  + client.anInt11189 * -2045337339) & 0x3fff;
	    else if (5 == -891094135 * Class10.anInt75)
		i_508_ = (int) client.aFloat11140 & 0x3fff;
	    else
		i_508_ = ((int) client.aFloat11140
			  + -2045337339 * client.anInt11189) & 0x3fff;
	    int i_509_ = Class427.anIntArray4806[i_508_];
	    int i_510_ = Class427.anIntArray4805[i_508_];
	    if (5 != Class10.anInt75 * -891094135) {
		i_509_
		    = i_509_ * 256 / (client.anInt11022 * -2002513841 + 256);
		i_510_
		    = 256 * i_510_ / (256 + client.anInt11022 * -2002513841);
	    }
	    int i_511_ = i_510_ * i_504_ + i_509_ * i_505_ >> 14;
	    int i_512_ = i_510_ * i_505_ - i_504_ * i_509_ >> 14;
	    Class163 class163 = Class530.aClass163Array7133[i_506_];
	    int i_513_ = class163.method2647();
	    int i_514_ = class163.method2649();
	    int i_515_
		= class247.anInt2468 * -881188269 / 2 + i_511_ - i_513_ / 2;
	    int i_516_ = i_515_ + i_513_;
	    int i_517_
		= class247.anInt2469 * -1279656873 / 2 + -i_512_ - i_514_;
	    int i_518_ = i_517_ + i_514_;
	    boolean bool;
	    if (null != class246)
		bool = (!class246.method4504(i_515_, i_517_, 1023446618)
			|| !class246.method4504(i_516_, i_517_, -1502281076)
			|| !class246.method4504(i_515_, i_518_, -672679910)
			|| !class246.method4504(i_516_, i_518_, -807058821));
	    else {
		int i_519_ = i_514_;
		int i_520_ = i_513_ / 2;
		bool = (i_517_ <= -i_519_
			|| i_518_ >= -1279656873 * class247.anInt2469
			|| i_515_ <= -i_520_
			|| i_516_ >= i_520_ + class247.anInt2468 * -881188269);
	    }
	    if (bool) {
		double d = Math.atan2((double) i_511_, (double) i_512_);
		double d_521_ = Math.atan2((double) Math.abs(i_511_),
					   (double) Math.abs(i_512_));
		double d_522_ = Math.atan2((double) (-881188269
						     * class247.anInt2468 / 2),
					   (double) (class247.anInt2469
						     * -1279656873 / 2));
		boolean bool_523_ = false;
		double d_524_ = 0.0;
		int i_525_;
		if (d_521_ < d_522_) {
		    d_524_ = 1.5707963267948966 - d;
		    i_525_ = -1279656873 * class247.anInt2469 / 2;
		} else {
		    d_524_ = d;
		    i_525_ = -881188269 * class247.anInt2468 / 2;
		}
		int i_526_ = Math.abs((int) -((double) i_525_
					      * Math.sin(1.5707963267948966)
					      / Math.sin(d_524_)));
		Class310.aClass163Array3359[i_506_].method2664
		    ((0.0F
		      + ((float) i
			 + (float) (-881188269 * class247.anInt2468) / 2.0F)),
		     ((float) i_503_
		      + (float) (-1279656873 * class247.anInt2469) / 2.0F
		      - 0.0F),
		     ((float) Class310.aClass163Array3359[i_506_].method22()
		      / 2.0F),
		     (float) i_526_, 4096,
		     (int) (-d / 6.283185307179586 * 65535.0));
	    } else if (null != class246)
		class163.method2691(i + i_515_, i_503_ + i_517_,
				    class246.aClass145_2423, i, i_503_);
	    else
		class163.method2656(i + i_515_, i_503_ + i_517_);
	}
    }
    
    static void method2063(int i, int i_527_, Class247 class247,
			   Class246 class246, int i_528_, int i_529_) {
	Class99[] class99s = client.aClass99Array11053;
	for (int i_530_ = 0; i_530_ < class99s.length; i_530_++) {
	    Class99 class99 = class99s[i_530_];
	    if (class99 != null && 0 != class99.anInt1176 * 652406965
		&& client.anInt11101 % 20 < 10) {
		if (1 == class99.anInt1176 * 652406965) {
		    Class534_Sub6 class534_sub6
			= ((Class534_Sub6)
			   (client.aClass9_11331.method579
			    ((long) (class99.anInt1169 * -879249997))));
		    if (class534_sub6 != null) {
			Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
			    = ((Class654_Sub1_Sub5_Sub1_Sub1)
			       class534_sub6.anObject10417);
			Class438 class438
			    = (class654_sub1_sub5_sub1_sub1.method10807()
			       .aClass438_4885);
			int i_531_ = (int) class438.aFloat4864 / 128 - i / 128;
			int i_532_
			    = (int) class438.aFloat4865 / 128 - i_527_ / 128;
			Class15.method724(class247, class246, i_528_, i_529_,
					  i_531_, i_532_,
					  class99.anInt1177 * -1562758755,
					  360000L);
		    }
		}
		if (class99.anInt1176 * 652406965 == 2) {
		    int i_533_ = 487170425 * class99.anInt1171 / 128 - i / 128;
		    int i_534_
			= class99.anInt1172 * 631467137 / 128 - i_527_ / 128;
		    long l = (long) (-41335265 * class99.anInt1175 << 7);
		    l *= l;
		    Class15.method724(class247, class246, i_528_, i_529_,
				      i_533_, i_534_,
				      -1562758755 * class99.anInt1177, l);
		}
		if (652406965 * class99.anInt1176 == 10
		    && class99.anInt1169 * -879249997 >= 0
		    && (-879249997 * class99.anInt1169
			< (client
			   .aClass654_Sub1_Sub5_Sub1_Sub2Array11279).length)) {
		    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
			= (client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279
			   [-879249997 * class99.anInt1169]);
		    if (null != class654_sub1_sub5_sub1_sub2) {
			Class438 class438
			    = (class654_sub1_sub5_sub1_sub2.method10807()
			       .aClass438_4885);
			int i_535_ = (int) class438.aFloat4864 / 128 - i / 128;
			int i_536_
			    = (int) class438.aFloat4865 / 128 - i_527_ / 128;
			Class15.method724(class247, class246, i_528_, i_529_,
					  i_535_, i_536_,
					  class99.anInt1177 * -1562758755,
					  360000L);
		    }
		}
	    }
	}
    }
    
    static void method2064() {
	anInt1365 = 0;
	anInt1375 = 1660827629;
	anInt1376 = -517634255;
    }
    
    public static void method2065() {
	int i = client.aClass512_11100.method8417(549710212);
	int i_537_ = client.aClass512_11100.method8418(-1533611049);
	aBoolArrayArray1374 = new boolean[i >> 3][i_537_ >> 3];
    }
    
    Class113() throws Throwable {
	throw new Error();
    }
    
    static void method2066() {
	anInt1365 = 0;
	anInt1375 = 1660827629;
	anInt1376 = -517634255;
    }
    
    static void method2067(Class247 class247, Class145 class145, int i,
			   int i_538_, int i_539_, int i_540_, int i_541_,
			   String string, Class171 class171, Class16 class16,
			   int i_542_) {
	int i_543_;
	if (3 == -891094135 * Class10.anInt75)
	    i_543_ = ((int) ((double) Class599.aClass298_Sub1_7871
					  .method5389(-292702068)
			     * 2607.5945876176133)
		      + -2045337339 * client.anInt11189) & 0x3fff;
	else if (5 == -891094135 * Class10.anInt75)
	    i_543_ = (int) client.aFloat11140 & 0x3fff;
	else
	    i_543_
		= ((int) client.aFloat11140 + client.anInt11189 * -2045337339
		   & 0x3fff);
	int i_544_ = (Math.max(-881188269 * class247.anInt2468 / 2,
			       class247.anInt2469 * -1279656873 / 2)
		      + 10);
	int i_545_ = i_539_ * i_539_ + i_540_ * i_540_;
	if (i_545_ <= i_544_ * i_544_) {
	    int i_546_ = Class427.anIntArray4806[i_543_];
	    int i_547_ = Class427.anIntArray4805[i_543_];
	    if (5 != -891094135 * Class10.anInt75) {
		i_546_
		    = i_546_ * 256 / (-2002513841 * client.anInt11022 + 256);
		i_547_
		    = i_547_ * 256 / (-2002513841 * client.anInt11022 + 256);
	    }
	    int i_548_ = i_540_ * i_546_ + i_539_ * i_547_ >> 14;
	    int i_549_ = i_540_ * i_547_ - i_546_ * i_539_ >> 14;
	    int i_550_ = class16.method747(string, 100, null, 724736024);
	    int i_551_ = class16.method737(string, 100, 0, null, 2112849964);
	    i_548_ -= i_550_ / 2;
	    if (i_548_ >= -(class247.anInt2468 * -881188269)
		&& i_548_ <= -881188269 * class247.anInt2468
		&& i_549_ >= -(-1279656873 * class247.anInt2469)
		&& i_549_ <= class247.anInt2469 * -1279656873)
		class171.method2844(string,
				    (-881188269 * class247.anInt2468 / 2
				     + (i + i_548_)),
				    (class247.anInt2469 * -1279656873 / 2
				     + i_538_ - i_549_ - i_541_ - i_551_),
				    i_550_, 50, i_542_, 0, 1, 0, 0, null, null,
				    class145, i, i_538_, 202025040);
	}
    }
    
    static void method2068(int i, int i_552_, Class247 class247,
			   Class145 class145, int i_553_, int i_554_) {
	int i_555_ = -1843550713 * Class108.anInt1321;
	int[] is = Class108.anIntArray1322;
	for (int i_556_ = 0; i_556_ < i_555_; i_556_++) {
	    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		= client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[is[i_556_]];
	    if (null != class654_sub1_sub5_sub1_sub2
		&& class654_sub1_sub5_sub1_sub2.method18876(-441117355)
		&& !class654_sub1_sub5_sub1_sub2.aClass618_12216
			.method10242((byte) -22)
		&& (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
		    != class654_sub1_sub5_sub1_sub2)
		&& (class654_sub1_sub5_sub1_sub2.aByte10854
		    == (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			.aByte10854))) {
		Class438 class438 = (class654_sub1_sub5_sub1_sub2.method10807()
				     .aClass438_4885);
		int i_557_ = (int) class438.aFloat4864 / 128 - i / 128;
		int i_558_ = (int) class438.aFloat4865 / 128 - i_552_ / 128;
		boolean bool = false;
		for (int i_559_ = 0; i_559_ < -1979292205 * client.anInt11324;
		     i_559_++) {
		    Class28 class28 = client.aClass28Array11327[i_559_];
		    if (class654_sub1_sub5_sub1_sub2.aString12211
			    .equals(class28.aString257)
			&& -721928209 * class28.anInt251 != 0) {
			bool = true;
			break;
		    }
		}
		boolean bool_560_ = false;
		for (int i_561_ = 0; i_561_ < -217094943 * Class455.anInt4963;
		     i_561_++) {
		    if (class654_sub1_sub5_sub1_sub2.aString12211.equals
			(Class168.aClass98Array1792[i_561_].aString1162)) {
			bool_560_ = true;
			break;
		    }
		}
		boolean bool_562_ = false;
		if ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.anInt12224
		     * 676699829) != 0
		    && class654_sub1_sub5_sub1_sub2.anInt12224 * 676699829 != 0
		    && ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.anInt12224
			 * 676699829)
			== (class654_sub1_sub5_sub1_sub2.anInt12224
			    * 676699829)))
		    bool_562_ = true;
		if (null != class654_sub1_sub5_sub1_sub2.aClass631_12226
		    && 1568742735 * (class654_sub1_sub5_sub1_sub2
				     .aClass631_12226.anInt8212) != -1
		    && ((Class307) (Class578.aClass44_Sub3_7743.method91
				    ((class654_sub1_sub5_sub1_sub2
				      .aClass631_12226.anInt8212) * 1568742735,
				     1422130343))).aBool3348)
		    Class246.method4509(class247, class145, i_553_, i_554_,
					i_557_, i_558_,
					Class67.aClass163Array721[1],
					1313730702);
		else if (class654_sub1_sub5_sub1_sub2.aClass252_12232
			 == Class252.aClass252_2655)
		    Class246.method4509(class247, class145, i_553_, i_554_,
					i_557_, i_558_,
					Class67.aClass163Array721[8],
					1313730702);
		else if (Class252.aClass252_2656
			 == class654_sub1_sub5_sub1_sub2.aClass252_12232)
		    Class246.method4509(class247, class145, i_553_, i_554_,
					i_557_, i_558_,
					Class67.aClass163Array721[6],
					1313730702);
		else if (bool_562_)
		    Class246.method4509(class247, class145, i_553_, i_554_,
					i_557_, i_558_,
					Class67.aClass163Array721[4],
					1313730702);
		else if (class654_sub1_sub5_sub1_sub2.aBool12234)
		    Class246.method4509(class247, class145, i_553_, i_554_,
					i_557_, i_558_,
					Class67.aClass163Array721[7],
					1313730702);
		else if (bool)
		    Class246.method4509(class247, class145, i_553_, i_554_,
					i_557_, i_558_,
					Class67.aClass163Array721[3],
					1313730702);
		else if (bool_560_)
		    Class246.method4509(class247, class145, i_553_, i_554_,
					i_557_, i_558_,
					Class67.aClass163Array721[5],
					1313730702);
		else
		    Class246.method4509(class247, class145, i_553_, i_554_,
					i_557_, i_558_,
					Class67.aClass163Array721[2],
					1313730702);
	    }
	}
    }
    
    static void method2069(Class185 class185, int i, int i_563_,
			   Class247 class247, Class145 class145, int i_564_,
			   int i_565_) {
	for (int i_566_ = 0; i_566_ < client.anInt11321 * -1125820437;
	     i_566_++) {
	    Class534_Sub6 class534_sub6
		= ((Class534_Sub6)
		   client.aClass9_11331
		       .method579((long) client.anIntArray11088[i_566_]));
	    if (class534_sub6 != null) {
		Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
		    = ((Class654_Sub1_Sub5_Sub1_Sub1)
		       class534_sub6.anObject10417);
		if (class654_sub1_sub5_sub1_sub1.method18840(34814042)
		    && (class654_sub1_sub5_sub1_sub1.aByte10854
			== (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			    .aByte10854))) {
		    Class307 class307
			= class654_sub1_sub5_sub1_sub1.aClass307_12204;
		    if (class307 != null && null != class307.anIntArray3284)
			class307 = class307.method5615(Class78.aClass103_825,
						       Class78.aClass103_825,
						       -1466068515);
		    if (null != class307 && class307.aBool3300
			&& class307.aBool3313) {
			Class438 class438
			    = (class654_sub1_sub5_sub1_sub1.method10807()
			       .aClass438_4885);
			int i_567_ = (int) class438.aFloat4864 / 128 - i / 128;
			int i_568_
			    = (int) class438.aFloat4865 / 128 - i_563_ / 128;
			if (-1 != class307.anInt3338 * -161851867)
			    Class181.method2983(class185, class145, class247,
						i_564_, i_565_, i_567_, i_568_,
						(-161851867
						 * class307.anInt3338),
						(byte) -80);
			else
			    Class246.method4509(class247, class145, i_564_,
						i_565_, i_567_, i_568_,
						Class67.aClass163Array721[1],
						1313730702);
		    }
		}
	    }
	}
    }
    
    static void method2070(Class247 class247, Class145 class145, int i,
			   int i_569_, int i_570_, int i_571_,
			   Class163 class163) {
	Class30.method879(class247, class145, i, i_569_, i_570_, i_571_,
			  class163, 100.0, Class284.aClass284_3072,
			  Class280.aClass280_3056, -187840594);
    }
    
    static void method2071(int i, int i_572_, boolean bool) {
	aBoolArrayArray1374[i][i_572_] = bool;
    }
    
    static int method2072(int i) {
	if (null == client.aClass247_11044) {
	    if (!Class72.aBool758) {
		if (Class700.aClass638_8806.aBool8315) {
		    if (Class271.aClass534_Sub18_Sub7_2963 != null)
			return (Class271.aClass534_Sub18_Sub7_2963.anInt11700
				* -1664709445);
		} else if (Class251.aClass534_Sub18_Sub7_2653 != null)
		    return (-1664709445
			    * Class251.aClass534_Sub18_Sub7_2653.anInt11700);
	    } else {
		Class16 class16 = Class160.method2620(1770101340);
		int i_573_ = Class81.aClass563_834.method9493(-1648790280);
		int i_574_ = Class81.aClass563_834.method9477(1734573042);
		if (!Class72.aBool766) {
		    if (i_573_ > -620506573 * Class627.anInt8175
			&& i_573_ < (Class627.anInt8175 * -620506573
				     + -1739196959 * Class641.anInt8340)) {
			int i_575_ = -1;
			for (int i_576_ = 0;
			     i_576_ < 324852453 * Class72.anInt765; i_576_++) {
			    if (Class72.aBool784) {
				int i_577_
				    = ((-238165825 * Class72.anInt754
					* (Class72.anInt765 * 324852453 - 1
					   - i_576_))
				       + (1
					  + (-260575397 * Class72.anInt782 + 20
					     + 102396103 * class16.anInt190)));
				if (i_574_ > (i_577_
					      - class16.anInt190 * 102396103
					      - 1)
				    && i_574_ < (class16.anInt189 * 728893755
						 + i_577_))
				    i_575_ = i_576_;
			    } else {
				int i_578_
				    = (31 + Class72.anInt782 * -260575397
				       + (-238165825 * Class72.anInt754
					  * (Class72.anInt765 * 324852453 - 1
					     - i_576_)));
				if (i_574_ > (i_578_
					      - 102396103 * class16.anInt190
					      - 1)
				    && i_574_ < (728893755 * class16.anInt189
						 + i_578_))
				    i_575_ = i_576_;
			    }
			}
			if (-1 != i_575_) {
			    int i_579_ = 0;
			    Class710 class710
				= new Class710(Class72.aClass700_771);
			    for (Class534_Sub18_Sub7 class534_sub18_sub7
				     = ((Class534_Sub18_Sub7)
					class710.method14308((byte) -30));
				 class534_sub18_sub7 != null;
				 class534_sub18_sub7
				     = (Class534_Sub18_Sub7) class710.next()) {
				if (i_579_++ == i_575_)
				    return (class534_sub18_sub7.anInt11700
					    * -1664709445);
			    }
			}
		    }
		} else if (i_573_ > -620506573 * Class627.anInt8175
			   && i_573_ < (Class627.anInt8175 * -620506573
					+ -1739196959 * Class641.anInt8340)) {
		    int i_580_ = -1;
		    for (int i_581_ = 0;
			 i_581_ < 1965634793 * Class72.anInt789; i_581_++) {
			if (Class72.aBool784) {
			    int i_582_
				= (1
				   + (-260575397 * Class72.anInt782 + 20
				      + 102396103 * class16.anInt190)
				   + Class72.anInt754 * -238165825 * i_581_);
			    if ((i_574_
				 > i_582_ - class16.anInt190 * 102396103 - 1)
				&& (i_574_
				    < class16.anInt189 * 728893755 + i_582_))
				i_580_ = i_581_;
			} else {
			    int i_583_
				= (31 + Class72.anInt782 * -260575397
				   + Class72.anInt754 * -238165825 * i_581_);
			    if ((i_574_
				 > i_583_ - class16.anInt190 * 102396103 - 1)
				&& (i_574_
				    < i_583_ + class16.anInt189 * 728893755))
				i_580_ = i_581_;
			}
		    }
		    if (-1 != i_580_) {
			int i_584_ = 0;
			Class694 class694
			    = new Class694(Class72.aClass696_772);
			for (Class534_Sub18_Sub11 class534_sub18_sub11
				 = ((Class534_Sub18_Sub11)
				    class694.method14068((byte) -27));
			     null != class534_sub18_sub11;
			     class534_sub18_sub11
				 = (Class534_Sub18_Sub11) class694.next()) {
			    if (i_584_++ == i_580_)
				return (((Class534_Sub18_Sub7)
					 (class534_sub18_sub11.aClass696_11794
					  .aClass534_Sub18_8785
					  .aClass534_Sub18_10510)).anInt11700
					* -1664709445);
			}
		    }
		} else if (null != Class72.aClass534_Sub18_Sub11_760
			   && i_573_ > Class112.anInt1364 * -1803884121
			   && i_573_ < (Class536_Sub4.anInt10366 * -2123561997
					+ Class112.anInt1364 * -1803884121)) {
		    int i_585_ = -1;
		    for (int i_586_ = 0;
			 i_586_ < (Class72.aClass534_Sub18_Sub11_760.anInt11795
				   * -475442105);
			 i_586_++) {
			if (Class72.aBool784) {
			    int i_587_
				= (-238165825 * Class72.anInt754 * i_586_
				   + (class16.anInt190 * 102396103
				      + (20 + Class150.anInt1699 * 892411561)
				      + 1));
			    if ((i_574_
				 > i_587_ - 102396103 * class16.anInt190 - 1)
				&& (i_574_
				    < i_587_ + class16.anInt189 * 728893755))
				i_585_ = i_586_;
			} else {
			    int i_588_
				= (-238165825 * Class72.anInt754 * i_586_
				   + (892411561 * Class150.anInt1699 + 31));
			    if ((i_574_
				 > i_588_ - 102396103 * class16.anInt190 - 1)
				&& (i_574_
				    < i_588_ + 728893755 * class16.anInt189))
				i_585_ = i_586_;
			}
		    }
		    if (i_585_ != -1) {
			int i_589_ = 0;
			Class694 class694
			    = new Class694(Class72.aClass534_Sub18_Sub11_760
					   .aClass696_11794);
			for (Class534_Sub18_Sub7 class534_sub18_sub7
				 = ((Class534_Sub18_Sub7)
				    class694.method14068((byte) 2));
			     class534_sub18_sub7 != null;
			     class534_sub18_sub7
				 = (Class534_Sub18_Sub7) class694.next()) {
			    if (i_589_++ == i_585_)
				return (-1664709445
					* class534_sub18_sub7.anInt11700);
			}
		    }
		}
	    }
	}
	return -1;
    }
    
    static byte[] method2073(File file, int i, byte i_590_) {
	byte[] is;
	try {
	    byte[] is_591_ = new byte[i];
	    Class568.method9573(file, is_591_, i, 927772987);
	    is = is_591_;
	} catch (IOException ioexception) {
	    return null;
	}
	return is;
    }
}
