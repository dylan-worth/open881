/* Class108 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class108
{
    static Class534_Sub40[] aClass534_Sub40Array1316;
    static boolean $assertionsDisabled
	= !com.jagex.Class108.class.desiredAssertionStatus();
    static byte[] aByteArray1317 = new byte[2048];
    static final int anInt1318 = 1;
    static Class534_Sub40[] aClass534_Sub40Array1319;
    static Class60[] aClass60Array1320;
    public static int anInt1321;
    static int[] anIntArray1322;
    static final int anInt1323 = 2;
    static int[] anIntArray1324;
    static byte[] aByteArray1325 = new byte[2048];
    static int anInt1326;
    static int[] anIntArray1327;
    static int anInt1328;
    
    static int method1950(Class534_Sub40_Sub1 class534_sub40_sub1) {
	int i = class534_sub40_sub1.method18295(2, -761815447);
	int i_0_;
	if (0 == i)
	    i_0_ = 0;
	else if (i == 1)
	    i_0_ = class534_sub40_sub1.method18295(5, -761815447);
	else if (i == 2)
	    i_0_ = class534_sub40_sub1.method18295(8, -761815447);
	else
	    i_0_ = class534_sub40_sub1.method18295(11, -761815447);
	return i_0_;
    }
    
    Class108() throws Throwable {
	throw new Error();
    }
    
    static final void method1951(Class534_Sub40_Sub1 class534_sub40_sub1) {
	class534_sub40_sub1.method18294(318075731);
	int i = -643758853 * client.anInt11037;
	Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
	    = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
	       = client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i]
	       = (new Class654_Sub1_Sub5_Sub1_Sub2
		  (client.aClass512_11100.method8424((byte) 126))));
	class654_sub1_sub5_sub1_sub2.anInt11922 = i * -2061161143;
	int i_1_ = class534_sub40_sub1.method18295(30, -761815447);
	byte i_2_ = (byte) (i_1_ >> 28);
	int i_3_ = i_1_ >> 14 & 0x3fff;
	int i_4_ = i_1_ & 0x3fff;
	Class597 class597 = client.aClass512_11100.method8416((byte) 120);
	class654_sub1_sub5_sub1_sub2.anIntArray11977[0]
	    = i_3_ - -424199969 * class597.anInt7859;
	class654_sub1_sub5_sub1_sub2.anIntArray11978[0]
	    = i_4_ - -1166289421 * class597.anInt7861;
	class654_sub1_sub5_sub1_sub2.method10815
	    ((float) ((class654_sub1_sub5_sub1_sub2.anIntArray11977[0] << 9)
		      + (class654_sub1_sub5_sub1_sub2.method18545((byte) 1)
			 << 8)),
	     (class654_sub1_sub5_sub1_sub2.method10808().aClass438_4885
	      .aFloat4863),
	     (float) ((class654_sub1_sub5_sub1_sub2.anIntArray11978[0] << 9)
		      + (class654_sub1_sub5_sub1_sub2.method18545((byte) 1)
			 << 8)));
	Class674.anInt8633
	    = (class654_sub1_sub5_sub1_sub2.aByte10854
	       = class654_sub1_sub5_sub1_sub2.aByte10853 = i_2_) * -2078297599;
	if (client.aClass512_11100.method8552((byte) 0).method7612
	    (class654_sub1_sub5_sub1_sub2.anIntArray11977[0],
	     class654_sub1_sub5_sub1_sub2.anIntArray11978[0], (byte) 0))
	    class654_sub1_sub5_sub1_sub2.aByte10853++;
	if (null != aClass534_Sub40Array1319[i])
	    class654_sub1_sub5_sub1_sub2
		.method18865(aClass534_Sub40Array1319[i], (byte) 62);
	if (null != aClass534_Sub40Array1316[i])
	    class654_sub1_sub5_sub1_sub2
		.method18866(aClass534_Sub40Array1316[i], (byte) 0);
	anInt1321 = 0;
	anIntArray1322[(anInt1321 += 76736439) * -1843550713 - 1] = i;
	aByteArray1317[i] = (byte) 0;
	anInt1328 = 0;
	for (int i_5_ = 1; i_5_ < 2048; i_5_++) {
	    if (i != i_5_) {
		int i_6_ = class534_sub40_sub1.method18295(18, -761815447);
		int i_7_ = i_6_ >> 16 & 0x3;
		int i_8_ = i_6_ >> 8 & 0xff;
		int i_9_ = i_6_ & 0xff;
		Class60 class60 = aClass60Array1320[i_5_] = new Class60();
		class60.anInt646
		    = 186312257 * (i_9_ + ((i_8_ << 14) + (i_7_ << 28)));
		class60.anInt643 = 0;
		class60.anInt644 = -587751205;
		class60.aClass252_645 = Class252.aClass252_2658;
		class60.aBool642 = false;
		anIntArray1324[(anInt1328 += -989241915) * 918952205 - 1]
		    = i_5_;
		aByteArray1317[i_5_] = (byte) 0;
	    }
	}
	class534_sub40_sub1.method18296(1003538285);
	Class305 class305
	    = Class599.aClass298_Sub1_7871.method5388((byte) 118);
	if (class305 == Class305.aClass305_3265) {
	    Class347_Sub1 class347_sub1
		= ((Class347_Sub1)
		   Class599.aClass298_Sub1_7871.method5380((byte) -59));
	    class347_sub1.method15745((byte) -3);
	}
	Class293 class293
	    = Class599.aClass298_Sub1_7871.method5425(1863451952);
	if (Class293.aClass293_3125 == class293) {
	    Class706_Sub4 class706_sub4
		= ((Class706_Sub4)
		   Class599.aClass298_Sub1_7871.method5381(1983755053));
	    class706_sub4.method17298(-1172483249);
	}
    }
    
    static final void method1952(Class534_Sub40_Sub1 class534_sub40_sub1) {
	class534_sub40_sub1.method18294(1725010914);
	int i = -643758853 * client.anInt11037;
	Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
	    = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
	       = client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i]
	       = new Class654_Sub1_Sub5_Sub1_Sub2(client.aClass512_11100
						      .method8424((byte) 16)));
	class654_sub1_sub5_sub1_sub2.anInt11922 = i * -2061161143;
	int i_10_ = class534_sub40_sub1.method18295(30, -761815447);
	byte i_11_ = (byte) (i_10_ >> 28);
	int i_12_ = i_10_ >> 14 & 0x3fff;
	int i_13_ = i_10_ & 0x3fff;
	Class597 class597 = client.aClass512_11100.method8416((byte) 49);
	class654_sub1_sub5_sub1_sub2.anIntArray11977[0]
	    = i_12_ - -424199969 * class597.anInt7859;
	class654_sub1_sub5_sub1_sub2.anIntArray11978[0]
	    = i_13_ - -1166289421 * class597.anInt7861;
	class654_sub1_sub5_sub1_sub2.method10815
	    ((float) ((class654_sub1_sub5_sub1_sub2.anIntArray11977[0] << 9)
		      + (class654_sub1_sub5_sub1_sub2.method18545((byte) 1)
			 << 8)),
	     (class654_sub1_sub5_sub1_sub2.method10808().aClass438_4885
	      .aFloat4863),
	     (float) ((class654_sub1_sub5_sub1_sub2.anIntArray11978[0] << 9)
		      + (class654_sub1_sub5_sub1_sub2.method18545((byte) 1)
			 << 8)));
	Class674.anInt8633 = (class654_sub1_sub5_sub1_sub2.aByte10854
			      = class654_sub1_sub5_sub1_sub2.aByte10853
			      = i_11_) * -2078297599;
	if (client.aClass512_11100.method8552((byte) 0).method7612
	    (class654_sub1_sub5_sub1_sub2.anIntArray11977[0],
	     class654_sub1_sub5_sub1_sub2.anIntArray11978[0], (byte) 0))
	    class654_sub1_sub5_sub1_sub2.aByte10853++;
	if (null != aClass534_Sub40Array1319[i])
	    class654_sub1_sub5_sub1_sub2
		.method18865(aClass534_Sub40Array1319[i], (byte) 32);
	if (null != aClass534_Sub40Array1316[i])
	    class654_sub1_sub5_sub1_sub2
		.method18866(aClass534_Sub40Array1316[i], (byte) 0);
	anInt1321 = 0;
	anIntArray1322[(anInt1321 += 76736439) * -1843550713 - 1] = i;
	aByteArray1317[i] = (byte) 0;
	anInt1328 = 0;
	for (int i_14_ = 1; i_14_ < 2048; i_14_++) {
	    if (i != i_14_) {
		int i_15_ = class534_sub40_sub1.method18295(18, -761815447);
		int i_16_ = i_15_ >> 16 & 0x3;
		int i_17_ = i_15_ >> 8 & 0xff;
		int i_18_ = i_15_ & 0xff;
		Class60 class60 = aClass60Array1320[i_14_] = new Class60();
		class60.anInt646
		    = 186312257 * (i_18_ + ((i_17_ << 14) + (i_16_ << 28)));
		class60.anInt643 = 0;
		class60.anInt644 = -587751205;
		class60.aClass252_645 = Class252.aClass252_2658;
		class60.aBool642 = false;
		anIntArray1324[(anInt1328 += -989241915) * 918952205 - 1]
		    = i_14_;
		aByteArray1317[i_14_] = (byte) 0;
	    }
	}
	class534_sub40_sub1.method18296(1834546374);
	Class305 class305 = Class599.aClass298_Sub1_7871.method5388((byte) 2);
	if (class305 == Class305.aClass305_3265) {
	    Class347_Sub1 class347_sub1
		= ((Class347_Sub1)
		   Class599.aClass298_Sub1_7871.method5380((byte) -43));
	    class347_sub1.method15745((byte) 10);
	}
	Class293 class293
	    = Class599.aClass298_Sub1_7871.method5425(1105199767);
	if (Class293.aClass293_3125 == class293) {
	    Class706_Sub4 class706_sub4
		= ((Class706_Sub4)
		   Class599.aClass298_Sub1_7871.method5381(1507959263));
	    class706_sub4.method17298(-1172483249);
	}
    }
    
    static final void method1953(Class534_Sub40_Sub1 class534_sub40_sub1,
				 int i) {
	anInt1326 = 0;
	Class494.method8128(class534_sub40_sub1, -1064067467);
	Class480.method7920(class534_sub40_sub1, 2146603949);
	if (class534_sub40_sub1.anInt10811 * 31645619 != i)
	    throw new RuntimeException(new StringBuilder().append
					   (class534_sub40_sub1.anInt10811
					    * 31645619)
					   .append
					   (" ").append
					   (i).toString());
    }
    
    static final void method1954(Class534_Sub40_Sub1 class534_sub40_sub1,
				 int i) {
	anInt1326 = 0;
	Class494.method8128(class534_sub40_sub1, -652499917);
	Class480.method7920(class534_sub40_sub1, 2146725249);
	if (class534_sub40_sub1.anInt10811 * 31645619 != i)
	    throw new RuntimeException(new StringBuilder().append
					   (class534_sub40_sub1.anInt10811
					    * 31645619)
					   .append
					   (" ").append
					   (i).toString());
    }
    
    static final void method1955(Class534_Sub40_Sub1 class534_sub40_sub1,
				 int i) {
	anInt1326 = 0;
	Class494.method8128(class534_sub40_sub1, 1781046673);
	Class480.method7920(class534_sub40_sub1, 2147390697);
	if (class534_sub40_sub1.anInt10811 * 31645619 != i)
	    throw new RuntimeException(new StringBuilder().append
					   (class534_sub40_sub1.anInt10811
					    * 31645619)
					   .append
					   (" ").append
					   (i).toString());
    }
    
    static {
	aClass534_Sub40Array1319 = new Class534_Sub40[2048];
	aClass534_Sub40Array1316 = new Class534_Sub40[2048];
	anInt1321 = 0;
	anIntArray1322 = new int[2048];
	anInt1328 = 0;
	anIntArray1324 = new int[2048];
	aClass60Array1320 = new Class60[2048];
	anInt1326 = 0;
	anIntArray1327 = new int[2048];
    }
    
    static boolean method1956(Class534_Sub40_Sub1 class534_sub40_sub1, int i) {
	int i_19_ = class534_sub40_sub1.method18295(2, -761815447);
	if (i_19_ == 0) {
	    if (class534_sub40_sub1.method18295(1, -761815447) != 0)
		Class220.method4145(class534_sub40_sub1, i, (byte) -32);
	    int i_20_ = class534_sub40_sub1.method18295(6, -761815447);
	    int i_21_ = class534_sub40_sub1.method18295(6, -761815447);
	    boolean bool = class534_sub40_sub1.method18295(1, -761815447) == 1;
	    if (bool)
		anIntArray1327[(anInt1326 += 375555833) * -1852482743 - 1] = i;
	    if (client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i] != null)
		throw new RuntimeException();
	    Class60 class60 = aClass60Array1320[i];
	    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		= (client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i]
		   = (new Class654_Sub1_Sub5_Sub1_Sub2
		      (client.aClass512_11100.method8424((byte) 74))));
	    class654_sub1_sub5_sub1_sub2.anInt11922 = -2061161143 * i;
	    if (null != aClass534_Sub40Array1319[i])
		class654_sub1_sub5_sub1_sub2
		    .method18865(aClass534_Sub40Array1319[i], (byte) 63);
	    if (aClass534_Sub40Array1316[i] != null)
		class654_sub1_sub5_sub1_sub2
		    .method18866(aClass534_Sub40Array1316[i], (byte) 0);
	    class654_sub1_sub5_sub1_sub2
		.method18523(-23485487 * class60.anInt643, true, 884642565);
	    class654_sub1_sub5_sub1_sub2.anInt11944
		= -767670225 * class60.anInt644;
	    int i_22_ = 1272457665 * class60.anInt646;
	    int i_23_ = i_22_ >> 28;
	    int i_24_ = i_22_ >> 14 & 0xff;
	    int i_25_ = i_22_ & 0xff;
	    Class597 class597 = client.aClass512_11100.method8416((byte) 65);
	    int i_26_ = (i_24_ << 6) + i_20_ - class597.anInt7859 * -424199969;
	    int i_27_
		= (i_25_ << 6) + i_21_ - -1166289421 * class597.anInt7861;
	    class654_sub1_sub5_sub1_sub2.aClass252_12232
		= class60.aClass252_645;
	    class654_sub1_sub5_sub1_sub2.aBool12234 = class60.aBool642;
	    class654_sub1_sub5_sub1_sub2.aByteArray11979[0]
		= aByteArray1325[i];
	    class654_sub1_sub5_sub1_sub2.aByte10854
		= class654_sub1_sub5_sub1_sub2.aByte10853 = (byte) i_23_;
	    if (client.aClass512_11100.method8552((byte) 0)
		    .method7612(i_26_, i_27_, (byte) 0))
		class654_sub1_sub5_sub1_sub2.aByte10853++;
	    class654_sub1_sub5_sub1_sub2.method18871(i_26_, i_27_,
						     -1747919051);
	    aClass60Array1320[i] = null;
	    return true;
	}
	if (i_19_ == 1) {
	    int i_28_ = class534_sub40_sub1.method18295(2, -761815447);
	    int i_29_ = aClass60Array1320[i].anInt646 * 1272457665;
	    aClass60Array1320[i].anInt646
		= ((((i_29_ >> 28) + i_28_ & 0x3) << 28)
		   + (i_29_ & 0xfffffff)) * 186312257;
	    return false;
	}
	if (i_19_ == 2) {
	    int i_30_ = class534_sub40_sub1.method18295(5, -761815447);
	    int i_31_ = i_30_ >> 3 & 0x3;
	    int i_32_ = i_30_ & 0x7;
	    int i_33_ = aClass60Array1320[i].anInt646 * 1272457665;
	    if (!$assertionsDisabled
		&& (aByteArray1325[i] < 0 || aByteArray1325[i] > 3))
		throw new AssertionError();
	    int i_34_ = i_31_ + (i_33_ >> 28) & 0x3;
	    int i_35_ = i_33_ >> 14 & 0xff;
	    int i_36_ = i_33_ & 0xff;
	    if (0 == i_32_) {
		i_35_--;
		i_36_--;
	    }
	    if (1 == i_32_)
		i_36_--;
	    if (2 == i_32_) {
		i_35_++;
		i_36_--;
	    }
	    if (i_32_ == 3)
		i_35_--;
	    if (4 == i_32_)
		i_35_++;
	    if (5 == i_32_) {
		i_35_--;
		i_36_++;
	    }
	    if (6 == i_32_)
		i_36_++;
	    if (i_32_ == 7) {
		i_35_++;
		i_36_++;
	    }
	    Class448.method7319(Class676.method11130((byte) -87),
				aByteArray1325[i], 2088438307);
	    aClass60Array1320[i].anInt646
		= ((i_35_ << 14) + (i_34_ << 28) + i_36_) * 186312257;
	    return false;
	}
	int i_37_ = class534_sub40_sub1.method18295(20, -761815447);
	int i_38_ = i_37_ >> 18 & 0x3;
	int i_39_ = i_37_ >> 16 & 0x3;
	int i_40_ = i_37_ >> 8 & 0xff;
	int i_41_ = i_37_ & 0xff;
	int i_42_ = 1272457665 * aClass60Array1320[i].anInt646;
	aByteArray1325[i] = (byte) (i_38_ - 1);
	if (!$assertionsDisabled
	    && (aByteArray1325[i] < 0 || aByteArray1325[i] > 3))
	    throw new AssertionError();
	int i_43_ = i_39_ + (i_42_ >> 28) & 0x3;
	int i_44_ = (i_42_ >> 14) + i_40_ & 0xff;
	int i_45_ = i_42_ + i_41_ & 0xff;
	Class448.method7319(Class676.method11130((byte) -14), i_38_ - 1,
			    2088438307);
	aClass60Array1320[i].anInt646
	    = 186312257 * (i_45_ + ((i_44_ << 14) + (i_43_ << 28)));
	return false;
    }
    
    static int method1957(Class534_Sub40_Sub1 class534_sub40_sub1) {
	int i = class534_sub40_sub1.method18295(2, -761815447);
	int i_46_;
	if (0 == i)
	    i_46_ = 0;
	else if (i == 1)
	    i_46_ = class534_sub40_sub1.method18295(5, -761815447);
	else if (i == 2)
	    i_46_ = class534_sub40_sub1.method18295(8, -761815447);
	else
	    i_46_ = class534_sub40_sub1.method18295(11, -761815447);
	return i_46_;
    }
    
    static void method1958(Class534_Sub40_Sub1 class534_sub40_sub1, int i) {
	Class597 class597 = client.aClass512_11100.method8416((byte) 17);
	boolean bool = class534_sub40_sub1.method18295(1, -761815447) == 1;
	if (bool)
	    anIntArray1327[(anInt1326 += 375555833) * -1852482743 - 1] = i;
	int i_47_ = class534_sub40_sub1.method18295(2, -761815447);
	Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
	    = client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i];
	if (i_47_ == 0) {
	    if (!bool) {
		if (client.anInt11037 * -643758853 == i)
		    throw new RuntimeException();
		Class60 class60 = aClass60Array1320[i] = new Class60();
		Class676.method11130((byte) 62);
		class60.anInt646
		    = (186312257
		       * (((class654_sub1_sub5_sub1_sub2.anIntArray11978[0]
			    + -1166289421 * class597.anInt7861)
			   >> 6)
			  + ((class654_sub1_sub5_sub1_sub2.aByte10854 << 28)
			     + ((-424199969 * class597.anInt7859
				 + (class654_sub1_sub5_sub1_sub2
				    .anIntArray11977[0]))
				>> 6 << 14))));
		if (class654_sub1_sub5_sub1_sub2.anInt12223 * -2025203045
		    != -1)
		    class60.anInt643
			= class654_sub1_sub5_sub1_sub2.anInt12223 * -982249813;
		else
		    class60.anInt643
			= class654_sub1_sub5_sub1_sub2.aClass57_11973
			      .method1231(269603393) * 252679473;
		class60.anInt644
		    = class654_sub1_sub5_sub1_sub2.anInt11944 * 101449423;
		class60.aClass252_645
		    = class654_sub1_sub5_sub1_sub2.aClass252_12232;
		class60.aBool642 = class654_sub1_sub5_sub1_sub2.aBool12234;
		if (class654_sub1_sub5_sub1_sub2.anInt12229 * -785793877 > 0)
		    Class576.method9763(class654_sub1_sub5_sub1_sub2,
					-1809376855);
		client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i] = null;
		if (class534_sub40_sub1.method18295(1, -761815447) != 0)
		    Class220.method4145(class534_sub40_sub1, i, (byte) -69);
	    }
	} else if (1 == i_47_) {
	    int i_48_ = class534_sub40_sub1.method18295(3, -761815447);
	    int i_49_ = class534_sub40_sub1.method18295(1, -761815447);
	    int i_50_ = class654_sub1_sub5_sub1_sub2.anIntArray11977[0];
	    int i_51_ = class654_sub1_sub5_sub1_sub2.anIntArray11978[0];
	    if (i_49_ == 1) {
		aByteArray1325[i] = Class676.aClass676_8650.aByte8648;
		int i_52_ = class534_sub40_sub1.method18295(2, -761815447);
		switch (i_52_) {
		case 1:
		    class654_sub1_sub5_sub1_sub2.method18872(i_50_ - 1, i_51_,
							     aByteArray1325[i],
							     (byte) -6);
		    break;
		case 3:
		    class654_sub1_sub5_sub1_sub2.method18872(i_50_, i_51_ - 1,
							     aByteArray1325[i],
							     (byte) -20);
		    break;
		case 0:
		    class654_sub1_sub5_sub1_sub2.method18872(i_50_, i_51_ + 1,
							     aByteArray1325[i],
							     (byte) -15);
		    break;
		case 2:
		    class654_sub1_sub5_sub1_sub2.method18872(i_50_ + 1, i_51_,
							     aByteArray1325[i],
							     (byte) -41);
		    break;
		}
	    }
	    if (i_48_ == 0) {
		i_50_--;
		i_51_--;
	    } else if (1 == i_48_)
		i_51_--;
	    else if (2 == i_48_) {
		i_50_++;
		i_51_--;
	    } else if (3 == i_48_)
		i_50_--;
	    else if (i_48_ == 4)
		i_50_++;
	    else if (i_48_ == 5) {
		i_50_--;
		i_51_++;
	    } else if (6 == i_48_)
		i_51_++;
	    else if (7 == i_48_) {
		i_50_++;
		i_51_++;
	    }
	    class654_sub1_sub5_sub1_sub2
		.method18872(i_50_, i_51_, aByteArray1325[i], (byte) -24);
	} else if (i_47_ == 2) {
	    int i_53_ = class534_sub40_sub1.method18295(4, -761815447);
	    int i_54_ = class654_sub1_sub5_sub1_sub2.anIntArray11977[0];
	    int i_55_ = class654_sub1_sub5_sub1_sub2.anIntArray11978[0];
	    if (0 == i_53_) {
		i_54_ -= 2;
		i_55_ -= 2;
	    } else if (i_53_ == 1) {
		i_54_--;
		i_55_ -= 2;
	    } else if (2 == i_53_)
		i_55_ -= 2;
	    else if (3 == i_53_) {
		i_54_++;
		i_55_ -= 2;
	    } else if (4 == i_53_) {
		i_54_ += 2;
		i_55_ -= 2;
	    } else if (5 == i_53_) {
		i_54_ -= 2;
		i_55_--;
	    } else if (6 == i_53_) {
		i_54_ += 2;
		i_55_--;
	    } else if (7 == i_53_)
		i_54_ -= 2;
	    else if (i_53_ == 8)
		i_54_ += 2;
	    else if (9 == i_53_) {
		i_54_ -= 2;
		i_55_++;
	    } else if (10 == i_53_) {
		i_54_ += 2;
		i_55_++;
	    } else if (i_53_ == 11) {
		i_54_ -= 2;
		i_55_ += 2;
	    } else if (12 == i_53_) {
		i_54_--;
		i_55_ += 2;
	    } else if (13 == i_53_)
		i_55_ += 2;
	    else if (i_53_ == 14) {
		i_54_++;
		i_55_ += 2;
	    } else if (i_53_ == 15) {
		i_54_ += 2;
		i_55_ += 2;
	    }
	    class654_sub1_sub5_sub1_sub2
		.method18872(i_54_, i_55_, aByteArray1325[i], (byte) -21);
	} else {
	    int i_56_ = class534_sub40_sub1.method18295(1, -761815447);
	    if (i_56_ == 0) {
		int i_57_ = class534_sub40_sub1.method18295(15, -761815447);
		int i_58_ = i_57_ >> 12 & 0x7;
		int i_59_ = (byte) (i_57_ >> 10) & 0x3;
		int i_60_ = i_57_ >> 5 & 0x1f;
		if (i_60_ > 15)
		    i_60_ -= 32;
		int i_61_ = i_57_ & 0x1f;
		if (i_61_ > 15)
		    i_61_ -= 32;
		int i_62_
		    = i_60_ + class654_sub1_sub5_sub1_sub2.anIntArray11977[0];
		int i_63_
		    = i_61_ + class654_sub1_sub5_sub1_sub2.anIntArray11978[0];
		if (i_58_ == Class676.aClass676_8647.anInt8645 * -848448635)
		    class654_sub1_sub5_sub1_sub2.method18871(i_62_, i_63_,
							     -1790485573);
		else {
		    aByteArray1325[i] = (byte) (i_58_ - 1);
		    class654_sub1_sub5_sub1_sub2.method18872(i_62_, i_63_,
							     aByteArray1325[i],
							     (byte) -22);
		}
		class654_sub1_sub5_sub1_sub2.aByte10854
		    = class654_sub1_sub5_sub1_sub2.aByte10853
		    = (byte) (i_59_ + class654_sub1_sub5_sub1_sub2.aByte10854
			      & 0x3);
		if (client.aClass512_11100.method8552((byte) 0)
			.method7612(i_62_, i_63_, (byte) 0))
		    class654_sub1_sub5_sub1_sub2.aByte10853++;
		if (i == client.anInt11037 * -643758853
		    && (class654_sub1_sub5_sub1_sub2.aByte10854
			!= -878424575 * Class674.anInt8633))
		    Class674.anInt8633
			= (class654_sub1_sub5_sub1_sub2.aByte10854
			   * -2078297599);
	    } else {
		int i_64_ = class534_sub40_sub1.method18295(3, -761815447);
		int i_65_ = class534_sub40_sub1.method18295(30, -761815447);
		int i_66_ = i_65_ >> 28 & 0x3;
		int i_67_ = i_65_ >> 14 & 0x3fff;
		int i_68_ = i_65_ & 0x3fff;
		int i_69_ = ((i_67_ + (class597.anInt7859 * -424199969
				       + (class654_sub1_sub5_sub1_sub2
					  .anIntArray11977[0]))
			      & 0x3fff)
			     - class597.anInt7859 * -424199969);
		int i_70_ = (((class654_sub1_sub5_sub1_sub2.anIntArray11978[0]
			       + class597.anInt7861 * -1166289421 + i_68_)
			      & 0x3fff)
			     - -1166289421 * class597.anInt7861);
		if (Class676.aClass676_8647.anInt8645 * -848448635 == i_64_)
		    class654_sub1_sub5_sub1_sub2.method18871(i_69_, i_70_,
							     -1887653452);
		else {
		    aByteArray1325[i] = (byte) (i_64_ - 1);
		    class654_sub1_sub5_sub1_sub2.method18872(i_69_, i_70_,
							     aByteArray1325[i],
							     (byte) -26);
		}
		class654_sub1_sub5_sub1_sub2.aByte10854
		    = class654_sub1_sub5_sub1_sub2.aByte10853
		    = (byte) (i_66_ + class654_sub1_sub5_sub1_sub2.aByte10854
			      & 0x3);
		if (client.aClass512_11100.method8552((byte) 0)
			.method7612(i_69_, i_70_, (byte) 0))
		    class654_sub1_sub5_sub1_sub2.aByte10853++;
		if (i == client.anInt11037 * -643758853)
		    Class674.anInt8633
			= (class654_sub1_sub5_sub1_sub2.aByte10854
			   * -2078297599);
	    }
	}
    }
    
    static int method1959(Class534_Sub40_Sub1 class534_sub40_sub1) {
	int i = class534_sub40_sub1.method18295(2, -761815447);
	int i_71_;
	if (0 == i)
	    i_71_ = 0;
	else if (i == 1)
	    i_71_ = class534_sub40_sub1.method18295(5, -761815447);
	else if (i == 2)
	    i_71_ = class534_sub40_sub1.method18295(8, -761815447);
	else
	    i_71_ = class534_sub40_sub1.method18295(11, -761815447);
	return i_71_;
    }
    
    static final void method1960(Class534_Sub40_Sub1 class534_sub40_sub1) {
	for (int i = 0; i < anInt1326 * -1852482743; i++) {
	    class534_sub40_sub1.method16529((byte) 1);
	    int i_72_ = anIntArray1327[i];
	    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		= client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i_72_];
	    int i_73_ = class534_sub40_sub1.method16527(-1858806765);
	    if ((i_73_ & 0x20) != 0)
		i_73_ += class534_sub40_sub1.method16527(615079752) << 8;
	    if (0 != (i_73_ & 0x800))
		i_73_ += class534_sub40_sub1.method16527(1745520033) << 16;
	    Class47.method1115(class534_sub40_sub1, i_72_,
			       class654_sub1_sub5_sub1_sub2, i_73_,
			       -444144980);
	}
    }
    
    static final void method1961(Class534_Sub40_Sub1 class534_sub40_sub1) {
	for (int i = 0; i < anInt1326 * -1852482743; i++) {
	    class534_sub40_sub1.method16529((byte) 1);
	    int i_74_ = anIntArray1327[i];
	    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		= client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i_74_];
	    int i_75_ = class534_sub40_sub1.method16527(48970267);
	    if ((i_75_ & 0x20) != 0)
		i_75_ += class534_sub40_sub1.method16527(149583565) << 8;
	    if (0 != (i_75_ & 0x800))
		i_75_ += class534_sub40_sub1.method16527(900626722) << 16;
	    Class47.method1115(class534_sub40_sub1, i_74_,
			       class654_sub1_sub5_sub1_sub2, i_75_,
			       -944976496);
	}
    }
    
    static final void method1962(Class534_Sub40_Sub1 class534_sub40_sub1) {
	for (int i = 0; i < anInt1326 * -1852482743; i++) {
	    class534_sub40_sub1.method16529((byte) 1);
	    int i_76_ = anIntArray1327[i];
	    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		= client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i_76_];
	    int i_77_ = class534_sub40_sub1.method16527(-1507368443);
	    if ((i_77_ & 0x20) != 0)
		i_77_ += class534_sub40_sub1.method16527(-908810973) << 8;
	    if (0 != (i_77_ & 0x800))
		i_77_ += class534_sub40_sub1.method16527(549990239) << 16;
	    Class47.method1115(class534_sub40_sub1, i_76_,
			       class654_sub1_sub5_sub1_sub2, i_77_,
			       -515550071);
	}
    }
    
    static final void method1963(Class534_Sub40_Sub1 class534_sub40_sub1) {
	for (int i = 0; i < anInt1326 * -1852482743; i++) {
	    class534_sub40_sub1.method16529((byte) 1);
	    int i_78_ = anIntArray1327[i];
	    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		= client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i_78_];
	    int i_79_ = class534_sub40_sub1.method16527(-1608402539);
	    if ((i_79_ & 0x20) != 0)
		i_79_ += class534_sub40_sub1.method16527(-1089498654) << 8;
	    if (0 != (i_79_ & 0x800))
		i_79_ += class534_sub40_sub1.method16527(-726826391) << 16;
	    Class47.method1115(class534_sub40_sub1, i_78_,
			       class654_sub1_sub5_sub1_sub2, i_79_,
			       -1254830318);
	}
    }
    
    public static Class303 method1964(int i, byte i_80_) {
	if (Class303.aClass303_3251.anInt3250 * 1266327829 == i)
	    return Class303.aClass303_3251;
	if (i == 1266327829 * Class303.aClass303_3247.anInt3250)
	    return Class303.aClass303_3247;
	if (i == Class303.aClass303_3249.anInt3250 * 1266327829)
	    return Class303.aClass303_3249;
	return null;
    }
    
    public static String method1965(int i, int i_81_) {
	return new StringBuilder().append("<img=").append(i).append(">")
		   .toString();
    }
    
    static final void method1966(Class669 class669, byte i) {
	int i_82_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class534_Sub18_Sub9 class534_sub18_sub9 = Class554.method9114(i_82_);
	if (class534_sub18_sub9 == null)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 646871815 * class534_sub18_sub9.anInt11768;
    }
    
    public static int method1967(CharSequence charsequence, int i, int i_83_) {
	return Class60.method1257(charsequence, i, true, -2054621610);
    }
    
    static final void method1968(Class669 class669, int i) {
	Class247 class247
	    = Class112.method2017(class669.anIntArray8595[((class669.anInt8600
							    -= 308999563)
							   * 2088438307)],
				  1060065770);
	class247.aClass247Array2620 = null;
	class247.aClass247Array2621 = null;
	Class454.method7416(class247, -904820094);
    }
    
    static boolean method1969(int i, byte i_84_) {
	return 10 == i || i == 17 || 3 == i || 6 == i || 0 == i;
    }
    
    static void method1970(String[] strings, int[] is, int i, int i_85_,
			   int i_86_) {
	if (i < i_85_) {
	    int i_87_ = (i_85_ + i) / 2;
	    int i_88_ = i;
	    String string = strings[i_87_];
	    strings[i_87_] = strings[i_85_];
	    strings[i_85_] = string;
	    int i_89_ = is[i_87_];
	    is[i_87_] = is[i_85_];
	    is[i_85_] = i_89_;
	    for (int i_90_ = i; i_90_ < i_85_; i_90_++) {
		if (string == null
		    || (strings[i_90_] != null
			&& strings[i_90_].compareTo(string) < (i_90_ & 0x1))) {
		    String string_91_ = strings[i_90_];
		    strings[i_90_] = strings[i_88_];
		    strings[i_88_] = string_91_;
		    int i_92_ = is[i_90_];
		    is[i_90_] = is[i_88_];
		    is[i_88_++] = i_92_;
		}
	    }
	    strings[i_85_] = strings[i_88_];
	    strings[i_88_] = string;
	    is[i_85_] = is[i_88_];
	    is[i_88_] = i_89_;
	    method1970(strings, is, i, i_88_ - 1, -296297732);
	    method1970(strings, is, 1 + i_88_, i_85_, 986935353);
	}
    }
    
    static void method1971(int i) {
	int i_93_ = 0;
	if (null != Class44_Sub6.aClass534_Sub35_10989)
	    i_93_ = Class44_Sub6.aClass534_Sub35_10989
			.aClass690_Sub20_10742.method17058(-1153285340);
	if (2 == i_93_) {
	    int i_94_ = (-166028671 * Class391.anInt4076 > 800 ? 800
			 : -166028671 * Class391.anInt4076);
	    int i_95_ = (8272787 * client.anInt5561 > 600 ? 600
			 : client.anInt5561 * 8272787);
	    Class706_Sub4.anInt10994 = i_94_ * 919220057;
	    client.anInt5562
		= -138655283 * ((-166028671 * Class391.anInt4076 - i_94_) / 2);
	    Class18.anInt205 = i_95_ * 533696347;
	    client.anInt5563 = 0;
	} else if (i_93_ == 1) {
	    int i_96_ = (Class391.anInt4076 * -166028671 > 1024 ? 1024
			 : Class391.anInt4076 * -166028671);
	    int i_97_ = (client.anInt5561 * 8272787 > 768 ? 768
			 : 8272787 * client.anInt5561);
	    Class706_Sub4.anInt10994 = i_96_ * 919220057;
	    client.anInt5562
		= (-166028671 * Class391.anInt4076 - i_96_) / 2 * -138655283;
	    Class18.anInt205 = 533696347 * i_97_;
	    client.anInt5563 = 0;
	} else {
	    Class706_Sub4.anInt10994 = -1855494695 * Class391.anInt4076;
	    client.anInt5562 = 0;
	    Class18.anInt205 = -1459402175 * client.anInt5561;
	    client.anInt5563 = 0;
	}
    }
}
