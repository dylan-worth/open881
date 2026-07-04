/* Class241 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class241
{
    int[][] anIntArrayArray2395;
    int[] anIntArray2396;
    int[] anIntArray2397;
    int[] anIntArray2398;
    Class258 aClass258_2399;
    int[] anIntArray2400;
    boolean[] aBoolArray2401;
    int[][] anIntArrayArray2402;
    int[][] anIntArrayArray2403;
    int[] anIntArray2404;
    int anInt2405;
    boolean[][] aBoolArrayArray2406;
    static int[] anIntArray2407 = { 256, 128, 86, 64 };
    static float[] aFloatArray2408
	= { 1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F,
	    1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F,
	    1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F,
	    2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F,
	    2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F,
	    3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F,
	    4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F,
	    6.208247E-7F, 6.611694E-7F, 7.041359E-7F, 7.4989464E-7F,
	    7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F,
	    1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F,
	    1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F,
	    1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F,
	    2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F,
	    2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F,
	    3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F,
	    4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F,
	    5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F,
	    7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F,
	    1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F,
	    1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F,
	    1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F,
	    2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F,
	    2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F,
	    3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F,
	    4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F,
	    6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F,
	    7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F,
	    1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F,
	    1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F,
	    1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F,
	    2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F,
	    2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F,
	    3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F,
	    4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F,
	    5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F,
	    7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F,
	    9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F,
	    0.0012634633F, 0.0013455702F, 0.0014330129F, 0.0015261382F,
	    0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F,
	    0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F,
	    0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F,
	    0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F,
	    0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F,
	    0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F,
	    0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F,
	    0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F,
	    0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F,
	    0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F,
	    0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F,
	    0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F,
	    0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F,
	    0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F,
	    0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F,
	    0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F,
	    0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F,
	    0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F,
	    0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F,
	    0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F,
	    0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F,
	    0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F,
	    0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F };
    
    static int method4437(int[] is, int i) {
	int i_0_ = is[i];
	int i_1_ = -1;
	int i_2_ = 2147483647;
	for (int i_3_ = 0; i_3_ < i; i_3_++) {
	    int i_4_ = is[i_3_];
	    if (i_4_ > i_0_ && i_4_ < i_2_) {
		i_1_ = i_3_;
		i_2_ = i_4_;
	    }
	}
	return i_1_;
    }
    
    void method4438(Class258 class258, int i) {
	aClass258_2399 = class258;
	int i_5_ = aClass258_2399.method4699(16);
	if (i_5_ != 1)
	    throw new RuntimeException();
	if (aBoolArray2401 == null || aBoolArray2401.length != i)
	    aBoolArray2401 = new boolean[i];
	else {
	    for (int i_6_ = 0; i_6_ < aBoolArray2401.length; i_6_++)
		aBoolArray2401[i_6_] = false;
	}
	int i_7_ = aClass258_2399.method4699(5);
	int i_8_ = 0;
	if (anIntArray2397 == null || anIntArray2397.length != i_7_)
	    anIntArray2397 = new int[i_7_];
	else
	    method4443(anIntArray2397);
	for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
	    int i_10_ = aClass258_2399.method4699(4);
	    anIntArray2397[i_9_] = i_10_;
	    if (i_10_ >= i_8_)
		i_8_ = i_10_ + 1;
	}
	if (anIntArray2398 == null || anIntArray2398.length != i_8_)
	    anIntArray2398 = new int[i_8_];
	else
	    method4443(anIntArray2398);
	if (anIntArray2396 == null || anIntArray2396.length != i_8_)
	    anIntArray2396 = new int[i_8_];
	else
	    method4443(anIntArray2396);
	if (anIntArray2400 == null || anIntArray2400.length != i_8_)
	    anIntArray2400 = new int[i_8_];
	else
	    method4443(anIntArray2400);
	if (anIntArrayArray2395 == null || anIntArrayArray2395.length != i_8_)
	    anIntArrayArray2395 = new int[i_8_][];
	for (int i_11_ = 0; i_11_ < i_8_; i_11_++) {
	    anIntArray2398[i_11_] = aClass258_2399.method4699(3) + 1;
	    int i_12_ = anIntArray2396[i_11_] = aClass258_2399.method4699(2);
	    if (i_12_ != 0)
		anIntArray2400[i_11_] = aClass258_2399.method4699(8);
	    i_12_ = 1 << i_12_;
	    int[] is = new int[i_12_];
	    anIntArrayArray2395[i_11_] = is;
	    for (int i_13_ = 0; i_13_ < i_12_; i_13_++)
		is[i_13_] = aClass258_2399.method4699(8) - 1;
	}
	anInt2405 = aClass258_2399.method4699(2) + 1;
	int i_14_ = aClass258_2399.method4699(4);
	int i_15_ = 2;
	for (int i_16_ = 0; i_16_ < i_7_; i_16_++)
	    i_15_ += anIntArray2398[anIntArray2397[i_16_]];
	if (anIntArray2404 == null || anIntArray2404.length != i_15_)
	    anIntArray2404 = new int[i_15_];
	else
	    method4443(anIntArray2404);
	anIntArray2404[0] = 0;
	anIntArray2404[1] = 1 << i_14_;
	i_15_ = 2;
	for (int i_17_ = 0; i_17_ < i_7_; i_17_++) {
	    int i_18_ = anIntArray2397[i_17_];
	    for (int i_19_ = 0; i_19_ < anIntArray2398[i_18_]; i_19_++)
		anIntArray2404[i_15_++] = aClass258_2399.method4699(i_14_);
	}
	if (anIntArrayArray2402 == null
	    || anIntArrayArray2402.length < i_15_) {
	    anIntArrayArray2402 = new int[i][i_15_];
	    anIntArrayArray2403 = new int[i][i_15_];
	    aBoolArrayArray2406 = new boolean[i][i_15_];
	}
    }
    
    static int method4439(int[] is, int i) {
	int i_20_ = is[i];
	int i_21_ = -1;
	int i_22_ = -2147483648;
	for (int i_23_ = 0; i_23_ < i; i_23_++) {
	    int i_24_ = is[i_23_];
	    if (i_24_ < i_20_ && i_24_ > i_22_) {
		i_21_ = i_23_;
		i_22_ = i_24_;
	    }
	}
	return i_21_;
    }
    
    void method4440(int i, int i_25_, int i_26_) {
	if (i < i_25_) {
	    int i_27_ = i;
	    int i_28_ = anIntArrayArray2402[i_26_][i_27_];
	    int i_29_ = anIntArrayArray2403[i_26_][i_27_];
	    boolean bool = aBoolArrayArray2406[i_26_][i_27_];
	    for (int i_30_ = i + 1; i_30_ <= i_25_; i_30_++) {
		int i_31_ = anIntArrayArray2402[i_26_][i_30_];
		if (i_31_ < i_28_) {
		    anIntArrayArray2402[i_26_][i_27_] = i_31_;
		    anIntArrayArray2403[i_26_][i_27_]
			= anIntArrayArray2403[i_26_][i_30_];
		    aBoolArrayArray2406[i_26_][i_27_]
			= aBoolArrayArray2406[i_26_][i_30_];
		    i_27_++;
		    anIntArrayArray2402[i_26_][i_30_]
			= anIntArrayArray2402[i_26_][i_27_];
		    anIntArrayArray2403[i_26_][i_30_]
			= anIntArrayArray2403[i_26_][i_27_];
		    aBoolArrayArray2406[i_26_][i_30_]
			= aBoolArrayArray2406[i_26_][i_27_];
		}
	    }
	    anIntArrayArray2402[i_26_][i_27_] = i_28_;
	    anIntArrayArray2403[i_26_][i_27_] = i_29_;
	    aBoolArrayArray2406[i_26_][i_27_] = bool;
	    method4444(i, i_27_ - 1, i_26_);
	    method4444(i_27_ + 1, i_25_, i_26_);
	}
    }
    
    int method4441(int i, int i_32_, int i_33_, int i_34_, int i_35_) {
	int i_36_ = i_34_ - i_32_;
	int i_37_ = i_33_ - i;
	int i_38_ = i_36_ < 0 ? -i_36_ : i_36_;
	int i_39_ = i_38_ * (i_35_ - i);
	int i_40_ = i_39_ / i_37_;
	return i_36_ < 0 ? i_32_ - i_40_ : i_32_ + i_40_;
    }
    
    void method4442(int i, int i_41_, int i_42_) {
	if (i < i_41_) {
	    int i_43_ = i;
	    int i_44_ = anIntArrayArray2402[i_42_][i_43_];
	    int i_45_ = anIntArrayArray2403[i_42_][i_43_];
	    boolean bool = aBoolArrayArray2406[i_42_][i_43_];
	    for (int i_46_ = i + 1; i_46_ <= i_41_; i_46_++) {
		int i_47_ = anIntArrayArray2402[i_42_][i_46_];
		if (i_47_ < i_44_) {
		    anIntArrayArray2402[i_42_][i_43_] = i_47_;
		    anIntArrayArray2403[i_42_][i_43_]
			= anIntArrayArray2403[i_42_][i_46_];
		    aBoolArrayArray2406[i_42_][i_43_]
			= aBoolArrayArray2406[i_42_][i_46_];
		    i_43_++;
		    anIntArrayArray2402[i_42_][i_46_]
			= anIntArrayArray2402[i_42_][i_43_];
		    anIntArrayArray2403[i_42_][i_46_]
			= anIntArrayArray2403[i_42_][i_43_];
		    aBoolArrayArray2406[i_42_][i_46_]
			= aBoolArrayArray2406[i_42_][i_43_];
		}
	    }
	    anIntArrayArray2402[i_42_][i_43_] = i_44_;
	    anIntArrayArray2403[i_42_][i_43_] = i_45_;
	    aBoolArrayArray2406[i_42_][i_43_] = bool;
	    method4444(i, i_43_ - 1, i_42_);
	    method4444(i_43_ + 1, i_41_, i_42_);
	}
    }
    
    void method4443(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    void method4444(int i, int i_48_, int i_49_) {
	if (i < i_48_) {
	    int i_50_ = i;
	    int i_51_ = anIntArrayArray2402[i_49_][i_50_];
	    int i_52_ = anIntArrayArray2403[i_49_][i_50_];
	    boolean bool = aBoolArrayArray2406[i_49_][i_50_];
	    for (int i_53_ = i + 1; i_53_ <= i_48_; i_53_++) {
		int i_54_ = anIntArrayArray2402[i_49_][i_53_];
		if (i_54_ < i_51_) {
		    anIntArrayArray2402[i_49_][i_50_] = i_54_;
		    anIntArrayArray2403[i_49_][i_50_]
			= anIntArrayArray2403[i_49_][i_53_];
		    aBoolArrayArray2406[i_49_][i_50_]
			= aBoolArrayArray2406[i_49_][i_53_];
		    i_50_++;
		    anIntArrayArray2402[i_49_][i_53_]
			= anIntArrayArray2402[i_49_][i_50_];
		    anIntArrayArray2403[i_49_][i_53_]
			= anIntArrayArray2403[i_49_][i_50_];
		    aBoolArrayArray2406[i_49_][i_53_]
			= aBoolArrayArray2406[i_49_][i_50_];
		}
	    }
	    anIntArrayArray2402[i_49_][i_50_] = i_51_;
	    anIntArrayArray2403[i_49_][i_50_] = i_52_;
	    aBoolArrayArray2406[i_49_][i_50_] = bool;
	    method4444(i, i_50_ - 1, i_49_);
	    method4444(i_50_ + 1, i_48_, i_49_);
	}
    }
    
    boolean method4445(int i) {
	boolean bool = aClass258_2399.method4714() != 0;
	aBoolArray2401[i] = bool;
	if (!bool)
	    return false;
	int i_55_ = anIntArray2404.length;
	for (int i_56_ = 0; i_56_ < i_55_; i_56_++)
	    anIntArrayArray2402[i][i_56_] = anIntArray2404[i_56_];
	int i_57_ = anIntArray2407[anInt2405 - 1];
	int i_58_ = Class695.method14072(i_57_ - 1, (byte) -78);
	anIntArrayArray2403[i][0] = aClass258_2399.method4699(i_58_);
	anIntArrayArray2403[i][1] = aClass258_2399.method4699(i_58_);
	int i_59_ = 2;
	for (int i_60_ = 0; i_60_ < anIntArray2397.length; i_60_++) {
	    int i_61_ = anIntArray2397[i_60_];
	    int i_62_ = anIntArray2398[i_61_];
	    int i_63_ = anIntArray2396[i_61_];
	    int i_64_ = (1 << i_63_) - 1;
	    int i_65_ = 0;
	    if (i_63_ > 0)
		i_65_ = aClass258_2399.aClass256Array2726
			    [anIntArray2400[i_61_]].method4658(aClass258_2399);
	    for (int i_66_ = 0; i_66_ < i_62_; i_66_++) {
		int i_67_ = anIntArrayArray2395[i_61_][i_65_ & i_64_];
		i_65_ >>>= i_63_;
		anIntArrayArray2403[i][i_59_]
		    = i_67_ >= 0 ? aClass258_2399.aClass256Array2726[i_67_]
				       .method4658(aClass258_2399) : 0;
		i_59_++;
	    }
	}
	return true;
    }
    
    void method4446(int i) {
	if (aBoolArray2401[i]) {
	    int i_68_ = anIntArray2404.length;
	    int i_69_ = anIntArray2407[anInt2405 - 1];
	    boolean[] bools = aBoolArrayArray2406[i];
	    aBoolArrayArray2406[i][1] = true;
	    bools[0] = true;
	    for (int i_70_ = 2; i_70_ < i_68_; i_70_++) {
		int i_71_ = method4439(anIntArray2404, i_70_);
		int i_72_ = method4459(anIntArray2404, i_70_);
		int i_73_ = method4441(anIntArray2404[i_71_],
				       anIntArrayArray2403[i][i_71_],
				       anIntArray2404[i_72_],
				       anIntArrayArray2403[i][i_72_],
				       anIntArray2404[i_70_]);
		int i_74_ = anIntArrayArray2403[i][i_70_];
		int i_75_ = i_69_ - i_73_;
		int i_76_ = i_73_;
		int i_77_ = (i_75_ < i_76_ ? i_75_ : i_76_) << 1;
		if (i_74_ != 0) {
		    boolean[] bools_78_ = aBoolArrayArray2406[i];
		    int i_79_ = i_71_;
		    aBoolArrayArray2406[i][i_72_] = true;
		    bools_78_[i_79_] = true;
		    aBoolArrayArray2406[i][i_70_] = true;
		    if (i_74_ >= i_77_)
			anIntArrayArray2403[i][i_70_]
			    = (i_75_ > i_76_ ? i_74_ - i_76_ + i_73_
			       : i_73_ - i_74_ + i_75_ - 1);
		    else
			anIntArrayArray2403[i][i_70_]
			    = ((i_74_ & 0x1) != 0 ? i_73_ - (i_74_ + 1 >> 1)
			       : i_73_ + (i_74_ >> 1));
		} else {
		    aBoolArrayArray2406[i][i_70_] = false;
		    anIntArrayArray2403[i][i_70_] = i_73_;
		}
	    }
	    for (int i_80_ = 0; i_80_ < i_68_; i_80_++) {
		if (!aBoolArrayArray2406[i][i_80_])
		    anIntArrayArray2403[i][i_80_] = -1;
	    }
	}
    }
    
    void method4447(Class239 class239, int i, int i_81_) {
	if (aBoolArray2401[i_81_]) {
	    int i_82_ = anIntArray2404.length;
	    method4444(0, i_82_ - 1, i_81_);
	    int i_83_ = 0;
	    int i_84_ = anIntArrayArray2403[i_81_][0] * anInt2405;
	    for (int i_85_ = 1; i_85_ < i_82_; i_85_++) {
		if (anIntArrayArray2403[i_81_][i_85_] >= 0) {
		    int i_86_ = anIntArrayArray2402[i_81_][i_85_];
		    int i_87_ = anIntArrayArray2403[i_81_][i_85_] * anInt2405;
		    method4460(i_83_, i_84_, i_86_, i_87_, class239, i);
		    if (i_86_ < i) {
			/* empty */
		    }
		    i_83_ = i_86_;
		    i_84_ = i_87_;
		}
	    }
	    float f = aFloatArray2408[i_84_];
	    for (int i_88_ = i_83_; i_88_ < i; i_88_++)
		class239.aFloatArray2384[i_88_] *= f;
	}
    }
    
    static int method4448(int[] is, int i) {
	int i_89_ = is[i];
	int i_90_ = -1;
	int i_91_ = 2147483647;
	for (int i_92_ = 0; i_92_ < i; i_92_++) {
	    int i_93_ = is[i_92_];
	    if (i_93_ > i_89_ && i_93_ < i_91_) {
		i_90_ = i_92_;
		i_91_ = i_93_;
	    }
	}
	return i_90_;
    }
    
    static int method4449(int[] is, int i) {
	int i_94_ = is[i];
	int i_95_ = -1;
	int i_96_ = -2147483648;
	for (int i_97_ = 0; i_97_ < i; i_97_++) {
	    int i_98_ = is[i_97_];
	    if (i_98_ < i_94_ && i_98_ > i_96_) {
		i_95_ = i_97_;
		i_96_ = i_98_;
	    }
	}
	return i_95_;
    }
    
    static int method4450(int[] is, int i) {
	int i_99_ = is[i];
	int i_100_ = -1;
	int i_101_ = -2147483648;
	for (int i_102_ = 0; i_102_ < i; i_102_++) {
	    int i_103_ = is[i_102_];
	    if (i_103_ < i_99_ && i_103_ > i_101_) {
		i_100_ = i_102_;
		i_101_ = i_103_;
	    }
	}
	return i_100_;
    }
    
    static int method4451(int[] is, int i) {
	int i_104_ = is[i];
	int i_105_ = -1;
	int i_106_ = -2147483648;
	for (int i_107_ = 0; i_107_ < i; i_107_++) {
	    int i_108_ = is[i_107_];
	    if (i_108_ < i_104_ && i_108_ > i_106_) {
		i_105_ = i_107_;
		i_106_ = i_108_;
	    }
	}
	return i_105_;
    }
    
    static int method4452(int[] is, int i) {
	int i_109_ = is[i];
	int i_110_ = -1;
	int i_111_ = -2147483648;
	for (int i_112_ = 0; i_112_ < i; i_112_++) {
	    int i_113_ = is[i_112_];
	    if (i_113_ < i_109_ && i_113_ > i_111_) {
		i_110_ = i_112_;
		i_111_ = i_113_;
	    }
	}
	return i_110_;
    }
    
    void method4453(int i, int i_114_, int i_115_, int i_116_,
		    Class239 class239, int i_117_) {
	int i_118_ = i_116_ - i_114_;
	int i_119_ = i_115_ - i;
	int i_120_ = i_118_ < 0 ? -i_118_ : i_118_;
	int i_121_ = i_118_ / i_119_;
	int i_122_ = i_114_;
	int i_123_ = 0;
	int i_124_ = i_118_ < 0 ? i_121_ - 1 : i_121_ + 1;
	i_120_ = i_120_ - (i_121_ < 0 ? -i_121_ : i_121_) * i_119_;
	class239.aFloatArray2384[i] *= aFloatArray2408[i_122_];
	if (i_115_ > i_117_)
	    i_115_ = i_117_;
	for (int i_125_ = i + 1; i_125_ < i_115_; i_125_++) {
	    i_123_ += i_120_;
	    if (i_123_ >= i_119_) {
		i_123_ -= i_119_;
		i_122_ += i_124_;
	    } else
		i_122_ += i_121_;
	    class239.aFloatArray2384[i_125_] *= aFloatArray2408[i_122_];
	}
    }
    
    static int method4454(int[] is, int i) {
	int i_126_ = is[i];
	int i_127_ = -1;
	int i_128_ = 2147483647;
	for (int i_129_ = 0; i_129_ < i; i_129_++) {
	    int i_130_ = is[i_129_];
	    if (i_130_ > i_126_ && i_130_ < i_128_) {
		i_127_ = i_129_;
		i_128_ = i_130_;
	    }
	}
	return i_127_;
    }
    
    void method4455(int i, int i_131_, int i_132_, int i_133_,
		    Class239 class239, int i_134_) {
	int i_135_ = i_133_ - i_131_;
	int i_136_ = i_132_ - i;
	int i_137_ = i_135_ < 0 ? -i_135_ : i_135_;
	int i_138_ = i_135_ / i_136_;
	int i_139_ = i_131_;
	int i_140_ = 0;
	int i_141_ = i_135_ < 0 ? i_138_ - 1 : i_138_ + 1;
	i_137_ = i_137_ - (i_138_ < 0 ? -i_138_ : i_138_) * i_136_;
	class239.aFloatArray2384[i] *= aFloatArray2408[i_139_];
	if (i_132_ > i_134_)
	    i_132_ = i_134_;
	for (int i_142_ = i + 1; i_142_ < i_132_; i_142_++) {
	    i_140_ += i_137_;
	    if (i_140_ >= i_136_) {
		i_140_ -= i_136_;
		i_139_ += i_141_;
	    } else
		i_139_ += i_138_;
	    class239.aFloatArray2384[i_142_] *= aFloatArray2408[i_139_];
	}
    }
    
    int method4456(int i, int i_143_, int i_144_, int i_145_, int i_146_) {
	int i_147_ = i_145_ - i_143_;
	int i_148_ = i_144_ - i;
	int i_149_ = i_147_ < 0 ? -i_147_ : i_147_;
	int i_150_ = i_149_ * (i_146_ - i);
	int i_151_ = i_150_ / i_148_;
	return i_147_ < 0 ? i_143_ - i_151_ : i_143_ + i_151_;
    }
    
    void method4457(Class239 class239, int i, int i_152_) {
	if (aBoolArray2401[i_152_]) {
	    int i_153_ = anIntArray2404.length;
	    method4444(0, i_153_ - 1, i_152_);
	    int i_154_ = 0;
	    int i_155_ = anIntArrayArray2403[i_152_][0] * anInt2405;
	    for (int i_156_ = 1; i_156_ < i_153_; i_156_++) {
		if (anIntArrayArray2403[i_152_][i_156_] >= 0) {
		    int i_157_ = anIntArrayArray2402[i_152_][i_156_];
		    int i_158_
			= anIntArrayArray2403[i_152_][i_156_] * anInt2405;
		    method4460(i_154_, i_155_, i_157_, i_158_, class239, i);
		    if (i_157_ < i) {
			/* empty */
		    }
		    i_154_ = i_157_;
		    i_155_ = i_158_;
		}
	    }
	    float f = aFloatArray2408[i_155_];
	    for (int i_159_ = i_154_; i_159_ < i; i_159_++)
		class239.aFloatArray2384[i_159_] *= f;
	}
    }
    
    void method4458(int i, int i_160_, int i_161_, int i_162_,
		    Class239 class239, int i_163_) {
	int i_164_ = i_162_ - i_160_;
	int i_165_ = i_161_ - i;
	int i_166_ = i_164_ < 0 ? -i_164_ : i_164_;
	int i_167_ = i_164_ / i_165_;
	int i_168_ = i_160_;
	int i_169_ = 0;
	int i_170_ = i_164_ < 0 ? i_167_ - 1 : i_167_ + 1;
	i_166_ = i_166_ - (i_167_ < 0 ? -i_167_ : i_167_) * i_165_;
	class239.aFloatArray2384[i] *= aFloatArray2408[i_168_];
	if (i_161_ > i_163_)
	    i_161_ = i_163_;
	for (int i_171_ = i + 1; i_171_ < i_161_; i_171_++) {
	    i_169_ += i_166_;
	    if (i_169_ >= i_165_) {
		i_169_ -= i_165_;
		i_168_ += i_170_;
	    } else
		i_168_ += i_167_;
	    class239.aFloatArray2384[i_171_] *= aFloatArray2408[i_168_];
	}
    }
    
    Class241() {
	/* empty */
    }
    
    static int method4459(int[] is, int i) {
	int i_172_ = is[i];
	int i_173_ = -1;
	int i_174_ = 2147483647;
	for (int i_175_ = 0; i_175_ < i; i_175_++) {
	    int i_176_ = is[i_175_];
	    if (i_176_ > i_172_ && i_176_ < i_174_) {
		i_173_ = i_175_;
		i_174_ = i_176_;
	    }
	}
	return i_173_;
    }
    
    void method4460(int i, int i_177_, int i_178_, int i_179_,
		    Class239 class239, int i_180_) {
	int i_181_ = i_179_ - i_177_;
	int i_182_ = i_178_ - i;
	int i_183_ = i_181_ < 0 ? -i_181_ : i_181_;
	int i_184_ = i_181_ / i_182_;
	int i_185_ = i_177_;
	int i_186_ = 0;
	int i_187_ = i_181_ < 0 ? i_184_ - 1 : i_184_ + 1;
	i_183_ = i_183_ - (i_184_ < 0 ? -i_184_ : i_184_) * i_182_;
	class239.aFloatArray2384[i] *= aFloatArray2408[i_185_];
	if (i_178_ > i_180_)
	    i_178_ = i_180_;
	for (int i_188_ = i + 1; i_188_ < i_178_; i_188_++) {
	    i_186_ += i_183_;
	    if (i_186_ >= i_182_) {
		i_186_ -= i_182_;
		i_185_ += i_187_;
	    } else
		i_185_ += i_184_;
	    class239.aFloatArray2384[i_188_] *= aFloatArray2408[i_185_];
	}
    }
    
    boolean method4461(int i) {
	boolean bool = aClass258_2399.method4714() != 0;
	aBoolArray2401[i] = bool;
	if (!bool)
	    return false;
	int i_189_ = anIntArray2404.length;
	for (int i_190_ = 0; i_190_ < i_189_; i_190_++)
	    anIntArrayArray2402[i][i_190_] = anIntArray2404[i_190_];
	int i_191_ = anIntArray2407[anInt2405 - 1];
	int i_192_ = Class695.method14072(i_191_ - 1, (byte) 94);
	anIntArrayArray2403[i][0] = aClass258_2399.method4699(i_192_);
	anIntArrayArray2403[i][1] = aClass258_2399.method4699(i_192_);
	int i_193_ = 2;
	for (int i_194_ = 0; i_194_ < anIntArray2397.length; i_194_++) {
	    int i_195_ = anIntArray2397[i_194_];
	    int i_196_ = anIntArray2398[i_195_];
	    int i_197_ = anIntArray2396[i_195_];
	    int i_198_ = (1 << i_197_) - 1;
	    int i_199_ = 0;
	    if (i_197_ > 0)
		i_199_
		    = aClass258_2399.aClass256Array2726
			  [anIntArray2400[i_195_]].method4658(aClass258_2399);
	    for (int i_200_ = 0; i_200_ < i_196_; i_200_++) {
		int i_201_ = anIntArrayArray2395[i_195_][i_199_ & i_198_];
		i_199_ >>>= i_197_;
		anIntArrayArray2403[i][i_193_]
		    = i_201_ >= 0 ? aClass258_2399.aClass256Array2726
					[i_201_]
					.method4658(aClass258_2399) : 0;
		i_193_++;
	    }
	}
	return true;
    }
    
    boolean method4462(int i) {
	boolean bool = aClass258_2399.method4714() != 0;
	aBoolArray2401[i] = bool;
	if (!bool)
	    return false;
	int i_202_ = anIntArray2404.length;
	for (int i_203_ = 0; i_203_ < i_202_; i_203_++)
	    anIntArrayArray2402[i][i_203_] = anIntArray2404[i_203_];
	int i_204_ = anIntArray2407[anInt2405 - 1];
	int i_205_ = Class695.method14072(i_204_ - 1, (byte) 2);
	anIntArrayArray2403[i][0] = aClass258_2399.method4699(i_205_);
	anIntArrayArray2403[i][1] = aClass258_2399.method4699(i_205_);
	int i_206_ = 2;
	for (int i_207_ = 0; i_207_ < anIntArray2397.length; i_207_++) {
	    int i_208_ = anIntArray2397[i_207_];
	    int i_209_ = anIntArray2398[i_208_];
	    int i_210_ = anIntArray2396[i_208_];
	    int i_211_ = (1 << i_210_) - 1;
	    int i_212_ = 0;
	    if (i_210_ > 0)
		i_212_
		    = aClass258_2399.aClass256Array2726
			  [anIntArray2400[i_208_]].method4658(aClass258_2399);
	    for (int i_213_ = 0; i_213_ < i_209_; i_213_++) {
		int i_214_ = anIntArrayArray2395[i_208_][i_212_ & i_211_];
		i_212_ >>>= i_210_;
		anIntArrayArray2403[i][i_206_]
		    = i_214_ >= 0 ? aClass258_2399.aClass256Array2726
					[i_214_]
					.method4658(aClass258_2399) : 0;
		i_206_++;
	    }
	}
	return true;
    }
    
    void method4463(Class258 class258, int i) {
	aClass258_2399 = class258;
	int i_215_ = aClass258_2399.method4699(16);
	if (i_215_ != 1)
	    throw new RuntimeException();
	if (aBoolArray2401 == null || aBoolArray2401.length != i)
	    aBoolArray2401 = new boolean[i];
	else {
	    for (int i_216_ = 0; i_216_ < aBoolArray2401.length; i_216_++)
		aBoolArray2401[i_216_] = false;
	}
	int i_217_ = aClass258_2399.method4699(5);
	int i_218_ = 0;
	if (anIntArray2397 == null || anIntArray2397.length != i_217_)
	    anIntArray2397 = new int[i_217_];
	else
	    method4443(anIntArray2397);
	for (int i_219_ = 0; i_219_ < i_217_; i_219_++) {
	    int i_220_ = aClass258_2399.method4699(4);
	    anIntArray2397[i_219_] = i_220_;
	    if (i_220_ >= i_218_)
		i_218_ = i_220_ + 1;
	}
	if (anIntArray2398 == null || anIntArray2398.length != i_218_)
	    anIntArray2398 = new int[i_218_];
	else
	    method4443(anIntArray2398);
	if (anIntArray2396 == null || anIntArray2396.length != i_218_)
	    anIntArray2396 = new int[i_218_];
	else
	    method4443(anIntArray2396);
	if (anIntArray2400 == null || anIntArray2400.length != i_218_)
	    anIntArray2400 = new int[i_218_];
	else
	    method4443(anIntArray2400);
	if (anIntArrayArray2395 == null
	    || anIntArrayArray2395.length != i_218_)
	    anIntArrayArray2395 = new int[i_218_][];
	for (int i_221_ = 0; i_221_ < i_218_; i_221_++) {
	    anIntArray2398[i_221_] = aClass258_2399.method4699(3) + 1;
	    int i_222_ = anIntArray2396[i_221_] = aClass258_2399.method4699(2);
	    if (i_222_ != 0)
		anIntArray2400[i_221_] = aClass258_2399.method4699(8);
	    i_222_ = 1 << i_222_;
	    int[] is = new int[i_222_];
	    anIntArrayArray2395[i_221_] = is;
	    for (int i_223_ = 0; i_223_ < i_222_; i_223_++)
		is[i_223_] = aClass258_2399.method4699(8) - 1;
	}
	anInt2405 = aClass258_2399.method4699(2) + 1;
	int i_224_ = aClass258_2399.method4699(4);
	int i_225_ = 2;
	for (int i_226_ = 0; i_226_ < i_217_; i_226_++)
	    i_225_ += anIntArray2398[anIntArray2397[i_226_]];
	if (anIntArray2404 == null || anIntArray2404.length != i_225_)
	    anIntArray2404 = new int[i_225_];
	else
	    method4443(anIntArray2404);
	anIntArray2404[0] = 0;
	anIntArray2404[1] = 1 << i_224_;
	i_225_ = 2;
	for (int i_227_ = 0; i_227_ < i_217_; i_227_++) {
	    int i_228_ = anIntArray2397[i_227_];
	    for (int i_229_ = 0; i_229_ < anIntArray2398[i_228_]; i_229_++)
		anIntArray2404[i_225_++] = aClass258_2399.method4699(i_224_);
	}
	if (anIntArrayArray2402 == null
	    || anIntArrayArray2402.length < i_225_) {
	    anIntArrayArray2402 = new int[i][i_225_];
	    anIntArrayArray2403 = new int[i][i_225_];
	    aBoolArrayArray2406 = new boolean[i][i_225_];
	}
    }
}
