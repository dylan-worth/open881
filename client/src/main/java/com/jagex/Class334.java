/* Class334 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class334
{
    static Interface33[] anInterface33Array3502;
    static int anInt3503;
    static int anInt3504 = 1048534259;
    static Class87 aClass87_3505;
    static Class294[] aClass294Array3506;
    static Class472 aClass472_3507;
    static Class472 aClass472_3508;
    static long aLong3509;
    static final String aString3510 = " - ";
    static boolean aBool3511 = false;
    static Thread aThread3512;
    public static Class402 aClass402_3513;
    
    public static void method5871() {
	if (Class277.aClass300_3049 != null)
	    Class277.aClass300_3049.method5530((byte) 0);
	if (null != aThread3512) {
	    for (;;) {
		try {
		    aThread3512.join();
		    break;
		} catch (InterruptedException interruptedexception) {
		    /* empty */
		}
	    }
	}
    }
    
    static int method5872() {
	int i = Class110.aClass294_1344.anInt3148 * -1262216053;
	if (i < aClass294Array3506.length - 1)
	    Class110.aClass294_1344 = aClass294Array3506[i + 1];
	return 100;
    }
    
    public static void method5873() {
	aBool3511 = true;
	Class534_Sub21.aString10536 = Class65.aString694;
	Class367.aString3856 = Class65.aString665;
	Class622.method10291(false, 1158914022);
	Class235.method4403(325002274);
	aClass294Array3506 = null;
	Class522.aClass467_7082 = null;
	Class673.method11110(8, -1654481481);
    }
    
    public static void method5874(boolean bool) {
	if (null == Class277.aClass300_3049)
	    Class502.method8302(898758840);
	if (bool)
	    Class277.aClass300_3049.method5520(-161037272);
    }
    
    public static boolean method5875() {
	return aBool3511;
    }
    
    public static boolean method5876() {
	return aBool3511;
    }
    
    static void method5877(byte[] is) {
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	for (;;) {
	    int i = class534_sub40.method16527(-2139950854);
	    if (0 == i)
		break;
	    if (i == 1)
		Class616.anInt8074
		    = class534_sub40.method16529((byte) 1) * -1285368653;
	    else if (10 == i)
		class534_sub40.method16529((byte) 1);
	}
    }
    
    public static boolean method5878() {
	return aBool3511;
    }
    
    public static void method5879() {
	if (null == aClass294Array3506) {
	    aClass294Array3506 = Class294.method5317((byte) -117);
	    Class110.aClass294_1344 = aClass294Array3506[0];
	    aLong3509
		= Class250.method4604((byte) -125) * -3214781987892434315L;
	}
	if (Class277.aClass300_3049 == null)
	    Class502.method8302(898758840);
	Class294 class294 = Class110.aClass294_1344;
	int i = Class661.method10976(-678936265);
	if (class294 == Class110.aClass294_1344) {
	    Class274.aString3039
		= Class110.aClass294_1344.aClass58_3152
		      .method1245(Class539.aClass672_7171, (byte) -121);
	    Class154.aString1740 = Class274.aString3039;
	    if (Class110.aClass294_1344.aBool3157)
		Class210.anInt2246
		    = (255476555 * Class110.aClass294_1344.anInt3149
		       + ((Class110.aClass294_1344.anInt3155 * 1646981573
			   - Class110.aClass294_1344.anInt3149 * 255476555)
			  * i / 100)) * 310636191;
	    if (Class110.aClass294_1344.aBool3156)
		Class154.aString1740
		    = new StringBuilder().append(Class154.aString1740).append
			  (" - ").append
			  (Class210.anInt2246 * 664251743).append
			  ("%").toString();
	} else if (Class110.aClass294_1344 == Class294.aClass294_3150) {
	    Class277.aClass300_3049 = null;
	    Class673.method11110(15, 190405158);
	    if (aBool3511) {
		aBool3511 = false;
		Class200_Sub6.method15576(Class534_Sub21.aString10536,
					  Class367.aString3856, "", false,
					  -1863699809);
	    }
	} else {
	    Class274.aString3039
		= class294.aClass58_3151.method1245(Class539.aClass672_7171,
						    (byte) -58);
	    Class154.aString1740 = Class274.aString3039;
	    if (Class110.aClass294_1344.aBool3156)
		Class154.aString1740
		    = new StringBuilder().append(Class154.aString1740).append
			  (" - ").append
			  (class294.anInt3155 * 1646981573).append
			  ("%").toString();
	    Class210.anInt2246 = 2000703323 * class294.anInt3155;
	    if (Class110.aClass294_1344.aBool3157 || class294.aBool3157)
		aLong3509
		    = Class250.method4604((byte) -70) * -3214781987892434315L;
	}
	if (Class277.aClass300_3049 != null) {
	    Class277.aClass300_3049.method5539((-8730536087753452067L
						* aLong3509),
					       Class274.aString3039,
					       Class154.aString1740,
					       664251743 * Class210.anInt2246,
					       Class110.aClass294_1344,
					       (byte) 0);
	    if (anInterface33Array3502 != null) {
		for (int i_0_ = 1 + anInt3504 * 1101456325;
		     i_0_ < anInterface33Array3502.length; i_0_++) {
		    if ((anInterface33Array3502[i_0_].method217((byte) -46)
			 >= 100)
			&& anInt3504 * 1101456325 == i_0_ - 1
			&& 8 != -1850530127 * client.anInt11039
			&& Class277.aClass300_3049.method5518((byte) 46)) {
			try {
			    anInterface33Array3502[i_0_].method210((byte) 1);
			} catch (Exception exception) {
			    anInterface33Array3502 = null;
			    break;
			}
			Class277.aClass300_3049.method5528
			    (anInterface33Array3502[i_0_], 1945389123);
			anInt3504 += -1048534259;
			if ((1101456325 * anInt3504
			     >= anInterface33Array3502.length - 1)
			    && anInterface33Array3502.length > 1)
			    anInt3504 = (aClass87_3505.method1701((byte) 67)
					 ? 0 : -1) * -1048534259;
		    }
		}
	    }
	}
    }
    
    public static void method5880() {
	if (null == aClass294Array3506) {
	    aClass294Array3506 = Class294.method5317((byte) -31);
	    Class110.aClass294_1344 = aClass294Array3506[0];
	    aLong3509
		= Class250.method4604((byte) -69) * -3214781987892434315L;
	}
	if (Class277.aClass300_3049 == null)
	    Class502.method8302(898758840);
	Class294 class294 = Class110.aClass294_1344;
	int i = Class661.method10976(2106523985);
	if (class294 == Class110.aClass294_1344) {
	    Class274.aString3039
		= Class110.aClass294_1344.aClass58_3152
		      .method1245(Class539.aClass672_7171, (byte) -10);
	    Class154.aString1740 = Class274.aString3039;
	    if (Class110.aClass294_1344.aBool3157)
		Class210.anInt2246
		    = (255476555 * Class110.aClass294_1344.anInt3149
		       + ((Class110.aClass294_1344.anInt3155 * 1646981573
			   - Class110.aClass294_1344.anInt3149 * 255476555)
			  * i / 100)) * 310636191;
	    if (Class110.aClass294_1344.aBool3156)
		Class154.aString1740
		    = new StringBuilder().append(Class154.aString1740).append
			  (" - ").append
			  (Class210.anInt2246 * 664251743).append
			  ("%").toString();
	} else if (Class110.aClass294_1344 == Class294.aClass294_3150) {
	    Class277.aClass300_3049 = null;
	    Class673.method11110(15, -511068806);
	    if (aBool3511) {
		aBool3511 = false;
		Class200_Sub6.method15576(Class534_Sub21.aString10536,
					  Class367.aString3856, "", false,
					  -1637287880);
	    }
	} else {
	    Class274.aString3039
		= class294.aClass58_3151.method1245(Class539.aClass672_7171,
						    (byte) -73);
	    Class154.aString1740 = Class274.aString3039;
	    if (Class110.aClass294_1344.aBool3156)
		Class154.aString1740
		    = new StringBuilder().append(Class154.aString1740).append
			  (" - ").append
			  (class294.anInt3155 * 1646981573).append
			  ("%").toString();
	    Class210.anInt2246 = 2000703323 * class294.anInt3155;
	    if (Class110.aClass294_1344.aBool3157 || class294.aBool3157)
		aLong3509
		    = Class250.method4604((byte) -60) * -3214781987892434315L;
	}
	if (Class277.aClass300_3049 != null) {
	    Class277.aClass300_3049.method5539((-8730536087753452067L
						* aLong3509),
					       Class274.aString3039,
					       Class154.aString1740,
					       664251743 * Class210.anInt2246,
					       Class110.aClass294_1344,
					       (byte) 0);
	    if (anInterface33Array3502 != null) {
		for (int i_1_ = 1 + anInt3504 * 1101456325;
		     i_1_ < anInterface33Array3502.length; i_1_++) {
		    if ((anInterface33Array3502[i_1_].method217((byte) 29)
			 >= 100)
			&& anInt3504 * 1101456325 == i_1_ - 1
			&& 8 != -1850530127 * client.anInt11039
			&& Class277.aClass300_3049.method5518((byte) -75)) {
			try {
			    anInterface33Array3502[i_1_].method210((byte) 1);
			} catch (Exception exception) {
			    anInterface33Array3502 = null;
			    break;
			}
			Class277.aClass300_3049.method5528
			    (anInterface33Array3502[i_1_], 938855905);
			anInt3504 += -1048534259;
			if ((1101456325 * anInt3504
			     >= anInterface33Array3502.length - 1)
			    && anInterface33Array3502.length > 1)
			    anInt3504 = (aClass87_3505.method1701((byte) 5) ? 0
					 : -1) * -1048534259;
		    }
		}
	    }
	}
    }
    
    static void method5881() {
	if (Class110.aClass294_1344 != null) {
	    Class277.aClass300_3049 = new Class300();
	    Class277.aClass300_3049.method5539
		(aLong3509 * -8730536087753452067L,
		 Class110.aClass294_1344.aClass58_3152
		     .method1245(Class539.aClass672_7171, (byte) -53),
		 Class110.aClass294_1344.aClass58_3152
		     .method1245(Class539.aClass672_7171, (byte) -73),
		 Class110.aClass294_1344.anInt3149 * 255476555,
		 Class110.aClass294_1344, (byte) 0);
	    aThread3512 = new Thread(Class277.aClass300_3049, "");
	    aThread3512.start();
	}
    }
    
    public static boolean method5882() {
	return aBool3511;
    }
    
    public static int method5883() {
	return Class277.aClass300_3049.method5519((byte) -92);
    }
    
    public static int method5884() {
	return Class277.aClass300_3049.method5519((byte) 24);
    }
    
    public static boolean method5885() {
	return aBool3511;
    }
    
    static int method5886() {
	if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub42_10777
		.method17227(-216010130)
	    == 0) {
	    for (int i = 0; i < client.anInt11066 * 1779655715; i++) {
		if ((client.anInterface63Array11067[i].method424((byte) 1)
		     == 's')
		    || (client.anInterface63Array11067[i].method424((byte) 1)
			== 'S')) {
		    Class44_Sub6.aClass534_Sub35_10989.method16438
			((Class44_Sub6.aClass534_Sub35_10989
			  .aClass690_Sub42_10777),
			 1, -950849395);
		    client.aBool11028 = true;
		    Class325.method5818(Class26.aClass26_241, (byte) -20);
		    break;
		}
	    }
	}
	if (Class294.aClass294_3142 == Class110.aClass294_1344) {
	    if (null == Class522.aClass467_7082)
		Class522.aClass467_7082
		    = new Class467(Class6.aClass450_56, Class66.aClass464_713,
				   Class645.aClass463_8374,
				   Class37.LOGIN_EXPONENT,
				   Class37.RSA_UPDATE_MODULUS);
	    if (!Class522.aClass467_7082.method7586(1859935812))
		return 0;
	    Class150.method2490(0, null, true, (byte) -13);
	    Class223.aBool2315 = !Class281.method5237((short) 6775);
	    aClass472_3508
		= Class467.method7602((Class223.aBool2315
				       ? Class50.aClass50_395
				       : Class50.aClass50_393),
				      false, 1, true, true, -1747764863);
	    aClass472_3507 = Class467.method7602(Class50.aClass50_394, false,
						 1, true, true, -1747764863);
	    Class606.aClass472_7988
		= Class467.method7602(Class50.aClass50_376, false, 1, true,
				      true, -1747764863);
	    Class588.aClass472_7807
		= Class467.method7602(Class50.aClass50_405, true, 1, true,
				      true, -1747764863);
	}
	if (Class110.aClass294_1344 == Class294.aClass294_3140) {
	    boolean bool = aClass472_3507.method7672(-10600569);
	    boolean bool_2_ = Class588.aClass472_7807.method7672(-1021090158);
	    int i = Class57.aClass451_Sub1Array459
			[Class50.aClass50_394.method1155(1311407359)]
			.method15885(1037991257);
	    i = i + Class57.aClass451_Sub1Array459
			[(Class223.aBool2315
			  ? Class50.aClass50_395.method1155(1311407359)
			  : Class50.aClass50_393.method1155(1311407359))]
			.method15885(669326901);
	    i += Class57.aClass451_Sub1Array459
		     [Class50.aClass50_376.method1155(1311407359)]
		     .method15885(-2046301192);
	    i = i + (bool_2_ ? 100
		     : Class588.aClass472_7807.method7674(-710743564));
	    i = i + (bool ? 100 : aClass472_3507.method7674(92272373));
	    if (i != 500)
		return i / 5;
	    Class620.aClass632_8113 = new Class632(Class588.aClass472_7807);
	    Class569.method9597(Class620.aClass632_8113, (byte) -21);
	    int i_3_ = Class44_Sub6.aClass534_Sub35_10989
			   .aClass690_Sub43_10780.method17236(858691551);
	    aClass87_3505
		= new Class87(client.aClass675_11016, Class539.aClass672_7171,
			      aClass472_3507);
	    Class94[] class94s = aClass87_3505.method1703(i_3_, (byte) 70);
	    if (class94s.length == 0)
		class94s = aClass87_3505.method1703(0, (byte) 125);
	    Class313 class313
		= new Class313(aClass472_3508, Class606.aClass472_7988);
	    if (class94s.length > 0) {
		anInterface33Array3502 = new Interface33[class94s.length];
		for (int i_4_ = 0; i_4_ < anInterface33Array3502.length;
		     i_4_++)
		    anInterface33Array3502[i_4_]
			= new Class291((aClass87_3505.method1702
					(1064408419 * class94s[i_4_].anInt904,
					 -1085917262)),
				       class94s[i_4_].anInt903 * -2060664041,
				       -336114669 * class94s[i_4_].anInt902,
				       class313);
	    }
	}
	if (Class294.aClass294_3136 == Class110.aClass294_1344)
	    Class351.aClass406_3620
		= new Class406(Class254.aClass185_2683, aClass472_3508,
			       Class606.aClass472_7988,
			       Class97.method1832((byte) -83));
	if (Class294.aClass294_3139 == Class110.aClass294_1344) {
	    int i = Class351.aClass406_3620.method6644((byte) -12);
	    int i_5_ = Class351.aClass406_3620.method6649((byte) 0);
	    if (i < i_5_)
		return 100 * i / i_5_;
	}
	if (Class110.aClass294_1344 == Class294.aClass294_3137) {
	    if (anInterface33Array3502 != null
		&& anInterface33Array3502.length > 0) {
		if (anInterface33Array3502[0].method217((byte) 8) < 100)
		    return 0;
		if (anInterface33Array3502.length > 1
		    && aClass87_3505.method1701((byte) 112)
		    && anInterface33Array3502[1].method217((byte) -30) < 100)
		    return 0;
	    }
	    Class351.aClass406_3620.method6645(client.anInterface52_11081,
					       -1635655134);
	    Class78.method1620(Class254.aClass185_2683, -2003505044);
	    Class673.method11110(11, -1582762151);
	}
	if (Class294.aClass294_3133 == Class110.aClass294_1344) {
	    Class464.aClass472_5113
		= Class467.method7602(Class50.aClass50_389, false, 1, false,
				      true, -1747764863);
	    Class180.aClass472_1950
		= Class467.method7602(Class50.aClass50_378, false, 1, false,
				      true, -1747764863);
	    Class384.aClass472_3967
		= Class467.method7602(Class50.aClass50_367, false, 1, false,
				      true, -1747764863);
	    Class233.aClass472_2358
		= Class467.method7602(Class50.aClass50_368, false, 1, true,
				      true, -1747764863);
	    Class6.aClass472_57
		= Class467.method7602(Class50.aClass50_406, false, 1, true,
				      true, -1747764863);
	    Class289.aClass472_3106
		= Class467.method7602(Class50.aClass50_369, false, 1, true,
				      true, -1747764863);
	    Class298_Sub1.aClass472_10064
		= Class467.method7602(Class50.aClass50_370, true, 1, false,
				      true, -1747764863);
	    Class130.aClass472_1524
		= Class467.method7602(Class50.aClass50_371, false, 1, false,
				      true, -1747764863);
	    Class2.aClass472_23
		= Class467.method7602(Class50.aClass50_407, true, 1, false,
				      true, -1747764863);
	    Class509.aClass472_5675
		= Class467.method7602(Class50.aClass50_401, true, 1, false,
				      true, -1747764863);
	    Class631.aClass472_8222
		= Class467.method7602(Class50.aClass50_403, false, 1, false,
				      true, -1747764863);
	    Class294.aClass472_3158
		= Class467.method7602(Class50.aClass50_374, false, 1, true,
				      true, -1747764863);
	    Class601_Sub1.aClass472_10877
		= Class467.method7602(Class50.aClass50_375, true, 1, false,
				      false, -1747764863);
	    Class63.aClass472_654
		= Class467.method7602(Class50.aClass50_397, true, 1, false,
				      false, -1747764863);
	    Class190.aClass472_2137
		= Class467.method7602(Class50.aClass50_377, false, 1, true,
				      true, -1747764863);
	    Class242.aClass472_2410
		= Class467.method7602(Class50.aClass50_382, false, 1, true,
				      true, -1747764863);
	    Class200_Sub6.aClass472_9906
		= Class467.method7602(Class50.aClass50_366, false, 1, true,
				      true, -1747764863);
	    Class711_Sub3_Sub1.aClass472_11919
		= Class467.method7602(Class50.aClass50_380, false, 1, true,
				      true, -1747764863);
	    Class347_Sub3.aClass472_10254
		= Class467.method7602(Class50.aClass50_381, false, 1, true,
				      true, -1747764863);
	    Class311.aClass472_3364
		= Class467.method7602(Class50.aClass50_392, false, 1, true,
				      true, -1747764863);
	    Class52.aClass472_435
		= Class467.method7602(Class50.aClass50_390, false, 1, true,
				      true, -1747764863);
	    Class693.aClass472_8770
		= Class467.method7602(Class50.aClass50_384, true, 1, false,
				      false, -1747764863);
	    Class74.aClass472_800
		= Class467.method7602(Class50.aClass50_398, true, 1, false,
				      true, -1747764863);
	    Class494.aClass472_5535
		= Class467.method7602(Class50.aClass50_385, false, 1, true,
				      true, -1747764863);
	    Class369.aClass472_3868
		= Class467.method7602(Class50.aClass50_386, false, 1, true,
				      true, -1747764863);
	    Class699.aClass472_8802
		= Class467.method7602(Class50.aClass50_387, true, 1, true,
				      true, -1747764863);
	    Class680.aClass472_8669
		= Class467.method7602(Class50.aClass50_388, false, 1, true,
				      true, -1747764863);
	    Class397.aClass472_4120
		= Class467.method7602(Class50.aClass50_396, false, 1, true,
				      true, -1747764863);
	    client.aClass472_11237
		= Class467.method7602(Class50.aClass50_400, true, 1, false,
				      true, -1747764863);
	    Class512.aClass472_5726
		= Class467.method7602(Class50.aClass50_391, true, 1, false,
				      true, -1747764863);
	    Class295.aClass472_3161
		= Class467.method7602(Class50.aClass50_408, true, 1, true,
				      true, -1747764863);
	}
	if (Class294.aClass294_3153 == Class110.aClass294_1344) {
	    int i = 0;
	    int i_6_ = 0;
	    for (int i_7_ = 0; i_7_ < Class57.aClass451_Sub1Array459.length;
		 i_7_++) {
		if (Class57.aClass451_Sub1Array459[i_7_] != null) {
		    i += Class57.aClass451_Sub1Array459[i_7_]
			     .method15885(-1185101886);
		    i_6_++;
		}
	    }
	    if (i_6_ > 0)
		i /= i_6_;
	    if (i != 100) {
		if (-1948226033 * anInt3503 < 0)
		    anInt3503 = i * -399326993;
		return (100 * (i - -1948226033 * anInt3503)
			/ (100 - -1948226033 * anInt3503));
	    }
	    Class150_Sub1.method14442(Class620.aClass632_8113, (byte) 21);
	    Class351.aClass406_3620
		= new Class406(Class254.aClass185_2683,
			       Class464.aClass472_5113,
			       Class606.aClass472_7988,
			       Class97.method1832((byte) -18));
	}
	if (Class294.aClass294_3146 == Class110.aClass294_1344) {
	    byte[] is
		= Class588.aClass472_7807.method7738((Class617.aClass617_8088
						      .anInt8096) * -448671533,
						     (byte) -104);
	    if (is == null)
		return 0;
	    Class171_Sub4.aClass232_9944 = new Class232();
	    Class171_Sub4.aClass232_9944.method4285(50, 7340032, (byte) 125);
	    Class649.method10714(is, -2076356855);
	    Class673.method11110(4, -1539488983);
	}
	if (Class110.aClass294_1344 == Class294.aClass294_3141
	    && null == Class632.aClass538_8269) {
	    Class632.aClass538_8269 = new Class538(Class512.aClass472_5726);
	    Class670.method11043(Class632.aClass538_8269, -827467001);
	}
	if (Class294.aClass294_3135 == Class110.aClass294_1344) {
	    int i = Class83.method1651((byte) -43);
	    if (i < 100)
		return i;
	    Class299.method5512
		(Class588.aClass472_7807.method7738((Class617.aClass617_8086
						     .anInt8096) * -448671533,
						    (byte) -80),
		 975099236);
	    Class631.aShortArrayArray8218
		= Class620.aClass632_8113.aShortArrayArray8240;
	    Class312.aShortArrayArrayArray3371
		= Class620.aClass632_8113.aShortArrayArrayArray8254;
	    Class580.aShortArrayArray7762
		= Class620.aClass632_8113.aShortArrayArray8242;
	    Class473.aShortArrayArrayArray5173
		= Class620.aClass632_8113.aShortArrayArrayArray8262;
	    if (Class620.aClass632_8113.anInt8234 * 1576674457 != -1
		&& Class620.aClass632_8113.anInt8249 * -1351281821 != -1) {
		client.anInt11047
		    = Class620.aClass632_8113.anInt8234 * -1669149727;
		client.anInt11192
		    = Class620.aClass632_8113.anInt8249 * -807589047;
	    }
	    Class69.aClass630_728 = new Class630(Class588.aClass472_7807);
	    Class542.aClass623_7184 = new Class623(Class588.aClass472_7807);
	    Class700.aClass638_8806 = new Class638(Class588.aClass472_7807);
	    Class200_Sub16.aClass628_9965
		= new Class628(Class588.aClass472_7807);
	    Class554.aClass622_7353 = new Class622(Class588.aClass472_7807);
	}
	if (Class110.aClass294_1344 == Class294.aClass294_3143) {
	    if (Class620.aClass632_8113.anInt8259 * -1085389923 != -1
		&& !Class130.aClass472_1524.method7669((-1085389923
							* (Class620
							   .aClass632_8113
							   .anInt8259)),
						       0, 1804616883))
		return 99;
	    Class656.aClass177_8524 = new Class177(Class699.aClass472_8802);
	    Class534.anInterface25_7160
		= new Class179_Sub1(Class2.aClass472_23,
				    Class509.aClass472_5675);
	    Class534_Sub11_Sub13.aClass44_Sub22_11730
		= new Class44_Sub22(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class200_Sub23.aClass44_Sub14_10041
		= new Class44_Sub14(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class650.aClass44_Sub5_8464
		= new Class44_Sub5(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class233.aClass472_2358,
				   Class464.aClass472_5113);
	    Class150_Sub1.aClass44_8902
		= new Class44(client.aClass675_11016, Class539.aClass672_7171,
			      Class233.aClass472_2358, Class649.aClass649_8419,
			      64, new Class61(com.jagex.Class21.class));
	    Class706.aClass44_8845
		= new Class44(client.aClass675_11016, Class539.aClass672_7171,
			      Class233.aClass472_2358, Class649.aClass649_8396,
			      16, new Class61(com.jagex.Class74.class));
	    Class667.aClass44_Sub21_8582
		= new Class44_Sub21(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class242.aClass472_2410);
	    Class555.aClass44_Sub16_7417
		= new Class44_Sub16(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class88.aClass44_Sub12_884
		= new Class44_Sub12(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class632.aClass44_Sub2_8270
		= new Class44_Sub2(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class233.aClass472_2358,
				   Class464.aClass472_5113);
	    Class470.aClass44_Sub17_5153
		= new Class44_Sub17(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358,
				    Class464.aClass472_5113);
	    Class307.aClass44_Sub15_3349
		= new Class44_Sub15(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358,
				    Class130.aClass472_1524);
	    Class219.aClass44_Sub19_2306
		= new Class44_Sub19(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class200_Sub10.aClass44_Sub20_9926
		= new Class44_Sub20(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class175_Sub1.aClass44_Sub13_9427
		= new Class44_Sub13(client.aClass675_11016,
				    Class539.aClass672_7171, true,
				    Class190.aClass472_2137,
				    Class130.aClass472_1524);
	    client.aClass512_11100
		.method8435(Class175_Sub1.aClass44_Sub13_9427, 1658913301);
	    Class159.aClass509_1754.method8372
		(new Class44_Sub13(client.aClass675_11016,
				   Class539.aClass672_7171, true,
				   Class190.aClass472_2137,
				   Class130.aClass472_1524),
		 1497763632);
	    Class222.aClass44_Sub9_2313
		= new Class44_Sub9(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class233.aClass472_2358,
				   Class464.aClass472_5113);
	    Class394_Sub1.aClass44_Sub18_10148
		= new Class44_Sub18(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358,
				    Class464.aClass472_5113);
	    Class578.aClass44_Sub3_7743
		= new Class44_Sub3(client.aClass675_11016,
				   Class539.aClass672_7171, true,
				   Class200_Sub6.aClass472_9906,
				   Class130.aClass472_1524);
	    Class531.aClass44_Sub7_7135
		= new Class44_Sub7(client.aClass675_11016,
				   Class539.aClass672_7171, true,
				   Class534_Sub11_Sub13.aClass44_Sub22_11730,
				   Class711_Sub3_Sub1.aClass472_11919,
				   Class130.aClass472_1524);
	    Class223.aClass53_Sub2_2316
		= new Class53_Sub2(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class233.aClass472_2358, true);
	    Class337.aClass44_Sub8_3524
		= new Class44_Sub8(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class233.aClass472_2358);
	    Class200_Sub12.aClass44_Sub1_9934
		= new Class44_Sub1(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class347_Sub3.aClass472_10254,
				   Class180.aClass472_1950,
				   Class384.aClass472_3967,
				   Class337.aClass44_Sub8_3524);
	    Class184.aClass44_Sub6_1988
		= new Class44_Sub6(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class233.aClass472_2358);
	    Class492.aClass44_Sub10_5341
		= new Class44_Sub10(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class55.aClass44_Sub4_447
		= new Class44_Sub4(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class311.aClass472_3364,
				   Class130.aClass472_1524);
	    Class684.aClass53_Sub1_8696
		= new Class53_Sub1(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class52.aClass472_435, true);
	    Class407.aClass110_Sub1_Sub2_4312
		= new Class110_Sub1_Sub2(client.aClass675_11016,
					 Class453.aClass453_4947,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class562.aClass110_Sub1_Sub1_7560
		= new Class110_Sub1_Sub1(client.aClass675_11016,
					 Class453.aClass453_4946,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class535.aClass110_Sub1_Sub2_7162
		= new Class110_Sub1_Sub2(client.aClass675_11016,
					 Class453.aClass453_4951,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class78.aClass110_Sub1_Sub2_826
		= new Class110_Sub1_Sub2(client.aClass675_11016,
					 Class453.aClass453_4953,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class279.aClass110_Sub1_Sub2_3053
		= new Class110_Sub1_Sub2(client.aClass675_11016,
					 Class453.aClass453_4954,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class522.aClass110_Sub1_Sub2_7083
		= new Class110_Sub1_Sub2(client.aClass675_11016,
					 Class453.aClass453_4950,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class534_Sub24.aClass110_Sub1_Sub2_10565
		= new Class110_Sub1_Sub2(client.aClass675_11016,
					 Class453.aClass453_4952,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class179_Sub1.aMap9331
		= Class395.method6565((new Class110_Sub1[]
				       { Class407.aClass110_Sub1_Sub2_4312,
					 Class562.aClass110_Sub1_Sub1_7560,
					 Class535.aClass110_Sub1_Sub2_7162,
					 Class78.aClass110_Sub1_Sub2_826,
					 Class279.aClass110_Sub1_Sub2_3053,
					 Class522.aClass110_Sub1_Sub2_7083,
					 (Class534_Sub24
					  .aClass110_Sub1_Sub2_10565) }),
				      (byte) -112);
	    Class84.aClass44_Sub11_840
		= new Class44_Sub11(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358,
				    Class179_Sub1.aMap9331);
	    Class283.anInterface18_3068 = new Class306();
	    Class150_Sub1.method14443(Class289.aClass472_3106,
				      Class130.aClass472_1524,
				      Class464.aClass472_5113,
				      Class606.aClass472_7988, -972014688);
	    aClass402_3513 = new Class402(Class397.aClass472_4120);
	    Class48.aClass387_363 = new Class387(Class680.aClass472_8669);
	    Class269.aClass396_2956 = new Class396(Class680.aClass472_8669);
	    Class618.aClass458_8101 = new Class458(Class539.aClass672_7171,
						   Class494.aClass472_5535,
						   Class369.aClass472_3868);
	    RuntimeException_Sub4.aClass56_12127
		= new Class56(Class539.aClass672_7171, Class494.aClass472_5535,
			      Class369.aClass472_3868, new Class399());
	    Class78.aClass103_825
		= new Class103(Class562.aClass110_Sub1_Sub1_7560,
			       Class84.aClass44_Sub11_840,
			       Class542.aClass623_7184
				   .method10296(-1530155632));
	    Class635.method10538(-1027808913);
	    Class179_Sub1.method14982(Class200_Sub12.aClass44_Sub1_9934,
				      (byte) 5);
	    Class408.method6692(Class269.aClass396_2956, Class48.aClass387_363,
				(byte) -20);
	    Class60.method1254(Class130.aClass472_1524,
			       Class656.aClass177_8524,
			       Class534.anInterface25_7160, (byte) 39);
	    Class267 class267
		= new Class267(Class631.aClass472_8222
				   .method7687("huffman", "", 340360959));
	    Class175.method2919(class267, (byte) -24);
	    Class498.aClass502_5556
		= Class348_Sub1_Sub2.method17995(1702705689);
	    Class200_Sub23.aClass534_Sub28_10040 = new Class534_Sub28(true);
	}
	if (Class110.aClass294_1344 == Class294.aClass294_3144) {
	    int i = (Class633.method10499(Class464.aClass472_5113, (byte) -38)
		     + Class351.aClass406_3620.method6648(true, (byte) 28));
	    int i_8_ = (Class228.method4189((byte) -5)
			+ Class351.aClass406_3620.method6649((byte) 0));
	    if (i < i_8_)
		return i * 100 / i_8_;
	}
	if (Class110.aClass294_1344 == Class294.aClass294_3145)
	    Class554.method9108(Class693.aClass472_8770, Class74.aClass472_800,
				Class555.aClass44_Sub16_7417,
				Class88.aClass44_Sub12_884,
				client.aClass512_11100.method8428(-1486655428),
				Class222.aClass44_Sub9_2313,
				Class394_Sub1.aClass44_Sub18_10148,
				Class78.aClass103_825, Class78.aClass103_825);
	if (Class294.aClass294_3138 == Class110.aClass294_1344) {
	    Class77.aClass155_Sub1_819
		= new Class155_Sub1(Class407.aClass110_Sub1_Sub2_4312);
	    Class407.method6687(-1407443384);
	    Class640.aClass34_8337 = Class534_Sub31.method16387((byte) -31);
	    Class298_Sub1.aClass472_10064.method7692(false, true, 1891348506);
	    Class464.aClass472_5113.method7692(true, true, 1891348506);
	    Class606.aClass472_7988.method7692(true, true, 1891348506);
	    Class631.aClass472_8222.method7692(true, true, 1891348506);
	    client.aBool11263 = true;
	}
	if (Class294.aClass294_3147 == Class110.aClass294_1344
	    && Class620.aClass632_8113.anInt8225 * 143908383 != -1) {
	    if (!Class180.method2978((Class620.aClass632_8113.anInt8225
				      * 143908383),
				     null, 403732503))
		return 0;
	    boolean bool = true;
	    for (int i = 0;
		 i < (Class44_Sub11.aClass243Array11006
		      [143908383 * Class620.aClass632_8113.anInt8225]
		      .aClass247Array2412).length;
		 i++) {
		Class247 class247
		    = (Class44_Sub11.aClass243Array11006
		       [143908383 * Class620.aClass632_8113.anInt8225]
		       .aClass247Array2412[i]);
		if (-1960530827 * class247.anInt2438 == 5
		    && -1 != 2083357573 * class247.anInt2634
		    && !Class464.aClass472_5113.method7669((class247.anInt2634
							    * 2083357573),
							   0, 1804616883))
		    bool = false;
	    }
	    if (!bool)
		return 0;
	}
	if (Class294.aClass294_3154 == Class110.aClass294_1344)
	    Class706.method14252(true, 1773505533);
	if (Class294.aClass294_3134 == Class110.aClass294_1344) {
	    Class277.aClass300_3049.method5530((byte) 0);
	    try {
		aThread3512.join();
	    } catch (InterruptedException interruptedexception) {
		return 0;
	    }
	    Class277.aClass300_3049 = null;
	    aThread3512 = null;
	    aClass472_3508 = null;
	    aClass472_3507 = null;
	    aClass87_3505 = null;
	    anInterface33Array3502 = null;
	    Class594.aMap7828.remove(Class50.aClass50_394);
	    Class594.aMap7828.remove(Class50.aClass50_393);
	    Class594.aMap7828.remove(Class50.aClass50_395);
	    Class304.method5593(1570942240);
	    client.aBool11050
		= Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub42_10777
		      .method17227(-326012970) == 1;
	    Class44_Sub6.aClass534_Sub35_10989.method16438
		(Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub42_10777, 1,
		 -1590829324);
	    if (client.aBool11050)
		Class44_Sub6.aClass534_Sub35_10989.method16438
		    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10764,
		     0, -1722346442);
	    else if ((Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10764
		      .aBool10869)
		     && -686202593 * (Class200_Sub23.aClass534_Sub28_10040
				      .anInt10635) < 512
		     && 0 != (Class200_Sub23.aClass534_Sub28_10040.anInt10635
			      * -686202593))
		Class44_Sub6.aClass534_Sub35_10989.method16438
		    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10764,
		     0, -767387661);
	    Class672.method11096((byte) 1);
	    if (client.aBool11050) {
		Class527.method8778(0, false, 1739983644);
		if (!client.aBool11028)
		    Class325.method5818(Class26.aClass26_242, (byte) -11);
	    } else {
		Class527.method8778(Class44_Sub6.aClass534_Sub35_10989
					.aClass690_Sub7_10764
					.method16935(-1807368365),
				    false, 1067935347);
		if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10764
			.method16935(-1807368365)
		    == 0)
		    Class325.method5818(Class26.aClass26_245, (byte) -9);
	    }
	    Class159.method2611(Class44_Sub6.aClass534_Sub35_10989
				    .aClass690_Sub8_10775
				    .method16947(-303718735),
				-1, -1, false, 962396752);
	    Class351.aClass406_3620.method6645(client.anInterface52_11081,
					       -1472804264);
	    Class78.method1620(Class254.aClass185_2683, 1326205382);
	    Class603.method10028(Class254.aClass185_2683,
				 Class464.aClass472_5113, 2113098682);
	}
	return Class551.method9047((byte) -6);
    }
    
    static int method5887() {
	if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub42_10777
		.method17227(201098476)
	    == 0) {
	    for (int i = 0; i < client.anInt11066 * 1779655715; i++) {
		if ((client.anInterface63Array11067[i].method424((byte) 1)
		     == 's')
		    || (client.anInterface63Array11067[i].method424((byte) 1)
			== 'S')) {
		    Class44_Sub6.aClass534_Sub35_10989.method16438
			((Class44_Sub6.aClass534_Sub35_10989
			  .aClass690_Sub42_10777),
			 1, -328498746);
		    client.aBool11028 = true;
		    Class325.method5818(Class26.aClass26_241, (byte) -99);
		    break;
		}
	    }
	}
	if (Class294.aClass294_3142 == Class110.aClass294_1344) {
	    if (null == Class522.aClass467_7082)
		Class522.aClass467_7082
		    = new Class467(Class6.aClass450_56, Class66.aClass464_713,
				   Class645.aClass463_8374,
				   Class37.LOGIN_EXPONENT,
				   Class37.RSA_UPDATE_MODULUS);
	    if (!Class522.aClass467_7082.method7586(1573460852))
		return 0;
	    Class150.method2490(0, null, true, (byte) -7);
	    Class223.aBool2315 = !Class281.method5237((short) 8490);
	    aClass472_3508
		= Class467.method7602((Class223.aBool2315
				       ? Class50.aClass50_395
				       : Class50.aClass50_393),
				      false, 1, true, true, -1747764863);
	    aClass472_3507 = Class467.method7602(Class50.aClass50_394, false,
						 1, true, true, -1747764863);
	    Class606.aClass472_7988
		= Class467.method7602(Class50.aClass50_376, false, 1, true,
				      true, -1747764863);
	    Class588.aClass472_7807
		= Class467.method7602(Class50.aClass50_405, true, 1, true,
				      true, -1747764863);
	}
	if (Class110.aClass294_1344 == Class294.aClass294_3140) {
	    boolean bool = aClass472_3507.method7672(-107857324);
	    boolean bool_9_ = Class588.aClass472_7807.method7672(-1649039424);
	    int i = Class57.aClass451_Sub1Array459
			[Class50.aClass50_394.method1155(1311407359)]
			.method15885(-352940245);
	    i = i + Class57.aClass451_Sub1Array459
			[(Class223.aBool2315
			  ? Class50.aClass50_395.method1155(1311407359)
			  : Class50.aClass50_393.method1155(1311407359))]
			.method15885(-322173334);
	    i += Class57.aClass451_Sub1Array459
		     [Class50.aClass50_376.method1155(1311407359)]
		     .method15885(-1547879627);
	    i = i + (bool_9_ ? 100
		     : Class588.aClass472_7807.method7674(-1746417247));
	    i = i + (bool ? 100 : aClass472_3507.method7674(-1143809631));
	    if (i != 500)
		return i / 5;
	    Class620.aClass632_8113 = new Class632(Class588.aClass472_7807);
	    Class569.method9597(Class620.aClass632_8113, (byte) -9);
	    int i_10_ = Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub43_10780.method17236(1253414553);
	    aClass87_3505
		= new Class87(client.aClass675_11016, Class539.aClass672_7171,
			      aClass472_3507);
	    Class94[] class94s = aClass87_3505.method1703(i_10_, (byte) 14);
	    if (class94s.length == 0)
		class94s = aClass87_3505.method1703(0, (byte) 45);
	    Class313 class313
		= new Class313(aClass472_3508, Class606.aClass472_7988);
	    if (class94s.length > 0) {
		anInterface33Array3502 = new Interface33[class94s.length];
		for (int i_11_ = 0; i_11_ < anInterface33Array3502.length;
		     i_11_++)
		    anInterface33Array3502[i_11_]
			= new Class291((aClass87_3505.method1702
					(1064408419 * class94s[i_11_].anInt904,
					 -1085917262)),
				       class94s[i_11_].anInt903 * -2060664041,
				       -336114669 * class94s[i_11_].anInt902,
				       class313);
	    }
	}
	if (Class294.aClass294_3136 == Class110.aClass294_1344)
	    Class351.aClass406_3620
		= new Class406(Class254.aClass185_2683, aClass472_3508,
			       Class606.aClass472_7988,
			       Class97.method1832((byte) -52));
	if (Class294.aClass294_3139 == Class110.aClass294_1344) {
	    int i = Class351.aClass406_3620.method6644((byte) -33);
	    int i_12_ = Class351.aClass406_3620.method6649((byte) 0);
	    if (i < i_12_)
		return 100 * i / i_12_;
	}
	if (Class110.aClass294_1344 == Class294.aClass294_3137) {
	    if (anInterface33Array3502 != null
		&& anInterface33Array3502.length > 0) {
		if (anInterface33Array3502[0].method217((byte) 46) < 100)
		    return 0;
		if (anInterface33Array3502.length > 1
		    && aClass87_3505.method1701((byte) 14)
		    && anInterface33Array3502[1].method217((byte) 21) < 100)
		    return 0;
	    }
	    Class351.aClass406_3620.method6645(client.anInterface52_11081,
					       -602341910);
	    Class78.method1620(Class254.aClass185_2683, 766926008);
	    Class673.method11110(11, -1420036662);
	}
	if (Class294.aClass294_3133 == Class110.aClass294_1344) {
	    Class464.aClass472_5113
		= Class467.method7602(Class50.aClass50_389, false, 1, false,
				      true, -1747764863);
	    Class180.aClass472_1950
		= Class467.method7602(Class50.aClass50_378, false, 1, false,
				      true, -1747764863);
	    Class384.aClass472_3967
		= Class467.method7602(Class50.aClass50_367, false, 1, false,
				      true, -1747764863);
	    Class233.aClass472_2358
		= Class467.method7602(Class50.aClass50_368, false, 1, true,
				      true, -1747764863);
	    Class6.aClass472_57
		= Class467.method7602(Class50.aClass50_406, false, 1, true,
				      true, -1747764863);
	    Class289.aClass472_3106
		= Class467.method7602(Class50.aClass50_369, false, 1, true,
				      true, -1747764863);
	    Class298_Sub1.aClass472_10064
		= Class467.method7602(Class50.aClass50_370, true, 1, false,
				      true, -1747764863);
	    Class130.aClass472_1524
		= Class467.method7602(Class50.aClass50_371, false, 1, false,
				      true, -1747764863);
	    Class2.aClass472_23
		= Class467.method7602(Class50.aClass50_407, true, 1, false,
				      true, -1747764863);
	    Class509.aClass472_5675
		= Class467.method7602(Class50.aClass50_401, true, 1, false,
				      true, -1747764863);
	    Class631.aClass472_8222
		= Class467.method7602(Class50.aClass50_403, false, 1, false,
				      true, -1747764863);
	    Class294.aClass472_3158
		= Class467.method7602(Class50.aClass50_374, false, 1, true,
				      true, -1747764863);
	    Class601_Sub1.aClass472_10877
		= Class467.method7602(Class50.aClass50_375, true, 1, false,
				      false, -1747764863);
	    Class63.aClass472_654
		= Class467.method7602(Class50.aClass50_397, true, 1, false,
				      false, -1747764863);
	    Class190.aClass472_2137
		= Class467.method7602(Class50.aClass50_377, false, 1, true,
				      true, -1747764863);
	    Class242.aClass472_2410
		= Class467.method7602(Class50.aClass50_382, false, 1, true,
				      true, -1747764863);
	    Class200_Sub6.aClass472_9906
		= Class467.method7602(Class50.aClass50_366, false, 1, true,
				      true, -1747764863);
	    Class711_Sub3_Sub1.aClass472_11919
		= Class467.method7602(Class50.aClass50_380, false, 1, true,
				      true, -1747764863);
	    Class347_Sub3.aClass472_10254
		= Class467.method7602(Class50.aClass50_381, false, 1, true,
				      true, -1747764863);
	    Class311.aClass472_3364
		= Class467.method7602(Class50.aClass50_392, false, 1, true,
				      true, -1747764863);
	    Class52.aClass472_435
		= Class467.method7602(Class50.aClass50_390, false, 1, true,
				      true, -1747764863);
	    Class693.aClass472_8770
		= Class467.method7602(Class50.aClass50_384, true, 1, false,
				      false, -1747764863);
	    Class74.aClass472_800
		= Class467.method7602(Class50.aClass50_398, true, 1, false,
				      true, -1747764863);
	    Class494.aClass472_5535
		= Class467.method7602(Class50.aClass50_385, false, 1, true,
				      true, -1747764863);
	    Class369.aClass472_3868
		= Class467.method7602(Class50.aClass50_386, false, 1, true,
				      true, -1747764863);
	    Class699.aClass472_8802
		= Class467.method7602(Class50.aClass50_387, true, 1, true,
				      true, -1747764863);
	    Class680.aClass472_8669
		= Class467.method7602(Class50.aClass50_388, false, 1, true,
				      true, -1747764863);
	    Class397.aClass472_4120
		= Class467.method7602(Class50.aClass50_396, false, 1, true,
				      true, -1747764863);
	    client.aClass472_11237
		= Class467.method7602(Class50.aClass50_400, true, 1, false,
				      true, -1747764863);
	    Class512.aClass472_5726
		= Class467.method7602(Class50.aClass50_391, true, 1, false,
				      true, -1747764863);
	    Class295.aClass472_3161
		= Class467.method7602(Class50.aClass50_408, true, 1, true,
				      true, -1747764863);
	}
	if (Class294.aClass294_3153 == Class110.aClass294_1344) {
	    int i = 0;
	    int i_13_ = 0;
	    for (int i_14_ = 0; i_14_ < Class57.aClass451_Sub1Array459.length;
		 i_14_++) {
		if (Class57.aClass451_Sub1Array459[i_14_] != null) {
		    i += Class57.aClass451_Sub1Array459[i_14_]
			     .method15885(144331187);
		    i_13_++;
		}
	    }
	    if (i_13_ > 0)
		i /= i_13_;
	    if (i != 100) {
		if (-1948226033 * anInt3503 < 0)
		    anInt3503 = i * -399326993;
		return (100 * (i - -1948226033 * anInt3503)
			/ (100 - -1948226033 * anInt3503));
	    }
	    Class150_Sub1.method14442(Class620.aClass632_8113, (byte) 76);
	    Class351.aClass406_3620
		= new Class406(Class254.aClass185_2683,
			       Class464.aClass472_5113,
			       Class606.aClass472_7988,
			       Class97.method1832((byte) -54));
	}
	if (Class294.aClass294_3146 == Class110.aClass294_1344) {
	    byte[] is
		= Class588.aClass472_7807.method7738((Class617.aClass617_8088
						      .anInt8096) * -448671533,
						     (byte) -94);
	    if (is == null)
		return 0;
	    Class171_Sub4.aClass232_9944 = new Class232();
	    Class171_Sub4.aClass232_9944.method4285(50, 7340032, (byte) 37);
	    Class649.method10714(is, -2097332727);
	    Class673.method11110(4, -103384445);
	}
	if (Class110.aClass294_1344 == Class294.aClass294_3141
	    && null == Class632.aClass538_8269) {
	    Class632.aClass538_8269 = new Class538(Class512.aClass472_5726);
	    Class670.method11043(Class632.aClass538_8269, 1260264413);
	}
	if (Class294.aClass294_3135 == Class110.aClass294_1344) {
	    int i = Class83.method1651((byte) -7);
	    if (i < 100)
		return i;
	    Class299.method5512
		(Class588.aClass472_7807.method7738((Class617.aClass617_8086
						     .anInt8096) * -448671533,
						    (byte) -98),
		 1549232816);
	    Class631.aShortArrayArray8218
		= Class620.aClass632_8113.aShortArrayArray8240;
	    Class312.aShortArrayArrayArray3371
		= Class620.aClass632_8113.aShortArrayArrayArray8254;
	    Class580.aShortArrayArray7762
		= Class620.aClass632_8113.aShortArrayArray8242;
	    Class473.aShortArrayArrayArray5173
		= Class620.aClass632_8113.aShortArrayArrayArray8262;
	    if (Class620.aClass632_8113.anInt8234 * 1576674457 != -1
		&& Class620.aClass632_8113.anInt8249 * -1351281821 != -1) {
		client.anInt11047
		    = Class620.aClass632_8113.anInt8234 * -1669149727;
		client.anInt11192
		    = Class620.aClass632_8113.anInt8249 * -807589047;
	    }
	    Class69.aClass630_728 = new Class630(Class588.aClass472_7807);
	    Class542.aClass623_7184 = new Class623(Class588.aClass472_7807);
	    Class700.aClass638_8806 = new Class638(Class588.aClass472_7807);
	    Class200_Sub16.aClass628_9965
		= new Class628(Class588.aClass472_7807);
	    Class554.aClass622_7353 = new Class622(Class588.aClass472_7807);
	}
	if (Class110.aClass294_1344 == Class294.aClass294_3143) {
	    if (Class620.aClass632_8113.anInt8259 * -1085389923 != -1
		&& !Class130.aClass472_1524.method7669((-1085389923
							* (Class620
							   .aClass632_8113
							   .anInt8259)),
						       0, 1804616883))
		return 99;
	    Class656.aClass177_8524 = new Class177(Class699.aClass472_8802);
	    Class534.anInterface25_7160
		= new Class179_Sub1(Class2.aClass472_23,
				    Class509.aClass472_5675);
	    Class534_Sub11_Sub13.aClass44_Sub22_11730
		= new Class44_Sub22(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class200_Sub23.aClass44_Sub14_10041
		= new Class44_Sub14(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class650.aClass44_Sub5_8464
		= new Class44_Sub5(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class233.aClass472_2358,
				   Class464.aClass472_5113);
	    Class150_Sub1.aClass44_8902
		= new Class44(client.aClass675_11016, Class539.aClass672_7171,
			      Class233.aClass472_2358, Class649.aClass649_8419,
			      64, new Class61(com.jagex.Class21.class));
	    Class706.aClass44_8845
		= new Class44(client.aClass675_11016, Class539.aClass672_7171,
			      Class233.aClass472_2358, Class649.aClass649_8396,
			      16, new Class61(com.jagex.Class74.class));
	    Class667.aClass44_Sub21_8582
		= new Class44_Sub21(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class242.aClass472_2410);
	    Class555.aClass44_Sub16_7417
		= new Class44_Sub16(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class88.aClass44_Sub12_884
		= new Class44_Sub12(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class632.aClass44_Sub2_8270
		= new Class44_Sub2(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class233.aClass472_2358,
				   Class464.aClass472_5113);
	    Class470.aClass44_Sub17_5153
		= new Class44_Sub17(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358,
				    Class464.aClass472_5113);
	    Class307.aClass44_Sub15_3349
		= new Class44_Sub15(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358,
				    Class130.aClass472_1524);
	    Class219.aClass44_Sub19_2306
		= new Class44_Sub19(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class200_Sub10.aClass44_Sub20_9926
		= new Class44_Sub20(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class175_Sub1.aClass44_Sub13_9427
		= new Class44_Sub13(client.aClass675_11016,
				    Class539.aClass672_7171, true,
				    Class190.aClass472_2137,
				    Class130.aClass472_1524);
	    client.aClass512_11100
		.method8435(Class175_Sub1.aClass44_Sub13_9427, -331452908);
	    Class159.aClass509_1754.method8372
		(new Class44_Sub13(client.aClass675_11016,
				   Class539.aClass672_7171, true,
				   Class190.aClass472_2137,
				   Class130.aClass472_1524),
		 1227743168);
	    Class222.aClass44_Sub9_2313
		= new Class44_Sub9(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class233.aClass472_2358,
				   Class464.aClass472_5113);
	    Class394_Sub1.aClass44_Sub18_10148
		= new Class44_Sub18(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358,
				    Class464.aClass472_5113);
	    Class578.aClass44_Sub3_7743
		= new Class44_Sub3(client.aClass675_11016,
				   Class539.aClass672_7171, true,
				   Class200_Sub6.aClass472_9906,
				   Class130.aClass472_1524);
	    Class531.aClass44_Sub7_7135
		= new Class44_Sub7(client.aClass675_11016,
				   Class539.aClass672_7171, true,
				   Class534_Sub11_Sub13.aClass44_Sub22_11730,
				   Class711_Sub3_Sub1.aClass472_11919,
				   Class130.aClass472_1524);
	    Class223.aClass53_Sub2_2316
		= new Class53_Sub2(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class233.aClass472_2358, true);
	    Class337.aClass44_Sub8_3524
		= new Class44_Sub8(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class233.aClass472_2358);
	    Class200_Sub12.aClass44_Sub1_9934
		= new Class44_Sub1(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class347_Sub3.aClass472_10254,
				   Class180.aClass472_1950,
				   Class384.aClass472_3967,
				   Class337.aClass44_Sub8_3524);
	    Class184.aClass44_Sub6_1988
		= new Class44_Sub6(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class233.aClass472_2358);
	    Class492.aClass44_Sub10_5341
		= new Class44_Sub10(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class55.aClass44_Sub4_447
		= new Class44_Sub4(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class311.aClass472_3364,
				   Class130.aClass472_1524);
	    Class684.aClass53_Sub1_8696
		= new Class53_Sub1(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class52.aClass472_435, true);
	    Class407.aClass110_Sub1_Sub2_4312
		= new Class110_Sub1_Sub2(client.aClass675_11016,
					 Class453.aClass453_4947,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class562.aClass110_Sub1_Sub1_7560
		= new Class110_Sub1_Sub1(client.aClass675_11016,
					 Class453.aClass453_4946,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class535.aClass110_Sub1_Sub2_7162
		= new Class110_Sub1_Sub2(client.aClass675_11016,
					 Class453.aClass453_4951,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class78.aClass110_Sub1_Sub2_826
		= new Class110_Sub1_Sub2(client.aClass675_11016,
					 Class453.aClass453_4953,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class279.aClass110_Sub1_Sub2_3053
		= new Class110_Sub1_Sub2(client.aClass675_11016,
					 Class453.aClass453_4954,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class522.aClass110_Sub1_Sub2_7083
		= new Class110_Sub1_Sub2(client.aClass675_11016,
					 Class453.aClass453_4950,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class534_Sub24.aClass110_Sub1_Sub2_10565
		= new Class110_Sub1_Sub2(client.aClass675_11016,
					 Class453.aClass453_4952,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class179_Sub1.aMap9331
		= Class395.method6565((new Class110_Sub1[]
				       { Class407.aClass110_Sub1_Sub2_4312,
					 Class562.aClass110_Sub1_Sub1_7560,
					 Class535.aClass110_Sub1_Sub2_7162,
					 Class78.aClass110_Sub1_Sub2_826,
					 Class279.aClass110_Sub1_Sub2_3053,
					 Class522.aClass110_Sub1_Sub2_7083,
					 (Class534_Sub24
					  .aClass110_Sub1_Sub2_10565) }),
				      (byte) -58);
	    Class84.aClass44_Sub11_840
		= new Class44_Sub11(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358,
				    Class179_Sub1.aMap9331);
	    Class283.anInterface18_3068 = new Class306();
	    Class150_Sub1.method14443(Class289.aClass472_3106,
				      Class130.aClass472_1524,
				      Class464.aClass472_5113,
				      Class606.aClass472_7988, -972014688);
	    aClass402_3513 = new Class402(Class397.aClass472_4120);
	    Class48.aClass387_363 = new Class387(Class680.aClass472_8669);
	    Class269.aClass396_2956 = new Class396(Class680.aClass472_8669);
	    Class618.aClass458_8101 = new Class458(Class539.aClass672_7171,
						   Class494.aClass472_5535,
						   Class369.aClass472_3868);
	    RuntimeException_Sub4.aClass56_12127
		= new Class56(Class539.aClass672_7171, Class494.aClass472_5535,
			      Class369.aClass472_3868, new Class399());
	    Class78.aClass103_825
		= new Class103(Class562.aClass110_Sub1_Sub1_7560,
			       Class84.aClass44_Sub11_840,
			       Class542.aClass623_7184.method10296(13578470));
	    Class635.method10538(-1032768235);
	    Class179_Sub1.method14982(Class200_Sub12.aClass44_Sub1_9934,
				      (byte) 5);
	    Class408.method6692(Class269.aClass396_2956, Class48.aClass387_363,
				(byte) -3);
	    Class60.method1254(Class130.aClass472_1524,
			       Class656.aClass177_8524,
			       Class534.anInterface25_7160, (byte) 113);
	    Class267 class267
		= new Class267(Class631.aClass472_8222
				   .method7687("huffman", "", -628379977));
	    Class175.method2919(class267, (byte) 47);
	    Class498.aClass502_5556
		= Class348_Sub1_Sub2.method17995(202444384);
	    Class200_Sub23.aClass534_Sub28_10040 = new Class534_Sub28(true);
	}
	if (Class110.aClass294_1344 == Class294.aClass294_3144) {
	    int i = (Class633.method10499(Class464.aClass472_5113, (byte) -43)
		     + Class351.aClass406_3620.method6648(true, (byte) 52));
	    int i_15_ = (Class228.method4189((byte) -28)
			 + Class351.aClass406_3620.method6649((byte) 0));
	    if (i < i_15_)
		return i * 100 / i_15_;
	}
	if (Class110.aClass294_1344 == Class294.aClass294_3145)
	    Class554.method9108(Class693.aClass472_8770, Class74.aClass472_800,
				Class555.aClass44_Sub16_7417,
				Class88.aClass44_Sub12_884,
				client.aClass512_11100.method8428(-1486655428),
				Class222.aClass44_Sub9_2313,
				Class394_Sub1.aClass44_Sub18_10148,
				Class78.aClass103_825, Class78.aClass103_825);
	if (Class294.aClass294_3138 == Class110.aClass294_1344) {
	    Class77.aClass155_Sub1_819
		= new Class155_Sub1(Class407.aClass110_Sub1_Sub2_4312);
	    Class407.method6687(1657237397);
	    Class640.aClass34_8337 = Class534_Sub31.method16387((byte) -117);
	    Class298_Sub1.aClass472_10064.method7692(false, true, 1891348506);
	    Class464.aClass472_5113.method7692(true, true, 1891348506);
	    Class606.aClass472_7988.method7692(true, true, 1891348506);
	    Class631.aClass472_8222.method7692(true, true, 1891348506);
	    client.aBool11263 = true;
	}
	if (Class294.aClass294_3147 == Class110.aClass294_1344
	    && Class620.aClass632_8113.anInt8225 * 143908383 != -1) {
	    if (!Class180.method2978((Class620.aClass632_8113.anInt8225
				      * 143908383),
				     null, 587823500))
		return 0;
	    boolean bool = true;
	    for (int i = 0;
		 i < (Class44_Sub11.aClass243Array11006
		      [143908383 * Class620.aClass632_8113.anInt8225]
		      .aClass247Array2412).length;
		 i++) {
		Class247 class247
		    = (Class44_Sub11.aClass243Array11006
		       [143908383 * Class620.aClass632_8113.anInt8225]
		       .aClass247Array2412[i]);
		if (-1960530827 * class247.anInt2438 == 5
		    && -1 != 2083357573 * class247.anInt2634
		    && !Class464.aClass472_5113.method7669((class247.anInt2634
							    * 2083357573),
							   0, 1804616883))
		    bool = false;
	    }
	    if (!bool)
		return 0;
	}
	if (Class294.aClass294_3154 == Class110.aClass294_1344)
	    Class706.method14252(true, 1773505533);
	if (Class294.aClass294_3134 == Class110.aClass294_1344) {
	    Class277.aClass300_3049.method5530((byte) 0);
	    try {
		aThread3512.join();
	    } catch (InterruptedException interruptedexception) {
		return 0;
	    }
	    Class277.aClass300_3049 = null;
	    aThread3512 = null;
	    aClass472_3508 = null;
	    aClass472_3507 = null;
	    aClass87_3505 = null;
	    anInterface33Array3502 = null;
	    Class594.aMap7828.remove(Class50.aClass50_394);
	    Class594.aMap7828.remove(Class50.aClass50_393);
	    Class594.aMap7828.remove(Class50.aClass50_395);
	    Class304.method5593(1781771518);
	    client.aBool11050
		= Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub42_10777
		      .method17227(1729785019) == 1;
	    Class44_Sub6.aClass534_Sub35_10989.method16438
		(Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub42_10777, 1,
		 -976292528);
	    if (client.aBool11050)
		Class44_Sub6.aClass534_Sub35_10989.method16438
		    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10764,
		     0, -88042165);
	    else if ((Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10764
		      .aBool10869)
		     && -686202593 * (Class200_Sub23.aClass534_Sub28_10040
				      .anInt10635) < 512
		     && 0 != (Class200_Sub23.aClass534_Sub28_10040.anInt10635
			      * -686202593))
		Class44_Sub6.aClass534_Sub35_10989.method16438
		    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10764,
		     0, -743165971);
	    Class672.method11096((byte) 1);
	    if (client.aBool11050) {
		Class527.method8778(0, false, 713593349);
		if (!client.aBool11028)
		    Class325.method5818(Class26.aClass26_242, (byte) -98);
	    } else {
		Class527.method8778(Class44_Sub6.aClass534_Sub35_10989
					.aClass690_Sub7_10764
					.method16935(-1807368365),
				    false, -2031650237);
		if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10764
			.method16935(-1807368365)
		    == 0)
		    Class325.method5818(Class26.aClass26_245, (byte) -89);
	    }
	    Class159.method2611(Class44_Sub6.aClass534_Sub35_10989
				    .aClass690_Sub8_10775
				    .method16947(105810936),
				-1, -1, false, 43389925);
	    Class351.aClass406_3620.method6645(client.anInterface52_11081,
					       -614960731);
	    Class78.method1620(Class254.aClass185_2683, -1069944789);
	    Class603.method10028(Class254.aClass185_2683,
				 Class464.aClass472_5113, 811225337);
	}
	return Class551.method9047((byte) -60);
    }
    
    Class334() throws Throwable {
	throw new Error();
    }
    
    static int method5888() {
	if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub42_10777
		.method17227(1228256690)
	    == 0) {
	    for (int i = 0; i < client.anInt11066 * 1779655715; i++) {
		if ((client.anInterface63Array11067[i].method424((byte) 1)
		     == 's')
		    || (client.anInterface63Array11067[i].method424((byte) 1)
			== 'S')) {
		    Class44_Sub6.aClass534_Sub35_10989.method16438
			((Class44_Sub6.aClass534_Sub35_10989
			  .aClass690_Sub42_10777),
			 1, 1275930973);
		    client.aBool11028 = true;
		    Class325.method5818(Class26.aClass26_241, (byte) -67);
		    break;
		}
	    }
	}
	if (Class294.aClass294_3142 == Class110.aClass294_1344) {
	    if (null == Class522.aClass467_7082)
		Class522.aClass467_7082
		    = new Class467(Class6.aClass450_56, Class66.aClass464_713,
				   Class645.aClass463_8374,
				   Class37.LOGIN_EXPONENT,
				   Class37.RSA_UPDATE_MODULUS);
	    if (!Class522.aClass467_7082.method7586(886757872))
		return 0;
	    Class150.method2490(0, null, true, (byte) -98);
	    Class223.aBool2315 = !Class281.method5237((short) 15102);
	    aClass472_3508
		= Class467.method7602((Class223.aBool2315
				       ? Class50.aClass50_395
				       : Class50.aClass50_393),
				      false, 1, true, true, -1747764863);
	    aClass472_3507 = Class467.method7602(Class50.aClass50_394, false,
						 1, true, true, -1747764863);
	    Class606.aClass472_7988
		= Class467.method7602(Class50.aClass50_376, false, 1, true,
				      true, -1747764863);
	    Class588.aClass472_7807
		= Class467.method7602(Class50.aClass50_405, true, 1, true,
				      true, -1747764863);
	}
	if (Class110.aClass294_1344 == Class294.aClass294_3140) {
	    boolean bool = aClass472_3507.method7672(1226875748);
	    boolean bool_16_ = Class588.aClass472_7807.method7672(883439692);
	    int i = Class57.aClass451_Sub1Array459
			[Class50.aClass50_394.method1155(1311407359)]
			.method15885(-1645001982);
	    i = i + Class57.aClass451_Sub1Array459
			[(Class223.aBool2315
			  ? Class50.aClass50_395.method1155(1311407359)
			  : Class50.aClass50_393.method1155(1311407359))]
			.method15885(1661265477);
	    i += Class57.aClass451_Sub1Array459
		     [Class50.aClass50_376.method1155(1311407359)]
		     .method15885(-2018047918);
	    i = i + (bool_16_ ? 100
		     : Class588.aClass472_7807.method7674(-561579099));
	    i = i + (bool ? 100 : aClass472_3507.method7674(-526277147));
	    if (i != 500)
		return i / 5;
	    Class620.aClass632_8113 = new Class632(Class588.aClass472_7807);
	    Class569.method9597(Class620.aClass632_8113, (byte) -2);
	    int i_17_ = Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub43_10780.method17236(766594334);
	    aClass87_3505
		= new Class87(client.aClass675_11016, Class539.aClass672_7171,
			      aClass472_3507);
	    Class94[] class94s = aClass87_3505.method1703(i_17_, (byte) 56);
	    if (class94s.length == 0)
		class94s = aClass87_3505.method1703(0, (byte) 107);
	    Class313 class313
		= new Class313(aClass472_3508, Class606.aClass472_7988);
	    if (class94s.length > 0) {
		anInterface33Array3502 = new Interface33[class94s.length];
		for (int i_18_ = 0; i_18_ < anInterface33Array3502.length;
		     i_18_++)
		    anInterface33Array3502[i_18_]
			= new Class291((aClass87_3505.method1702
					(1064408419 * class94s[i_18_].anInt904,
					 -1085917262)),
				       class94s[i_18_].anInt903 * -2060664041,
				       -336114669 * class94s[i_18_].anInt902,
				       class313);
	    }
	}
	if (Class294.aClass294_3136 == Class110.aClass294_1344)
	    Class351.aClass406_3620
		= new Class406(Class254.aClass185_2683, aClass472_3508,
			       Class606.aClass472_7988,
			       Class97.method1832((byte) -92));
	if (Class294.aClass294_3139 == Class110.aClass294_1344) {
	    int i = Class351.aClass406_3620.method6644((byte) 18);
	    int i_19_ = Class351.aClass406_3620.method6649((byte) 0);
	    if (i < i_19_)
		return 100 * i / i_19_;
	}
	if (Class110.aClass294_1344 == Class294.aClass294_3137) {
	    if (anInterface33Array3502 != null
		&& anInterface33Array3502.length > 0) {
		if (anInterface33Array3502[0].method217((byte) -74) < 100)
		    return 0;
		if (anInterface33Array3502.length > 1
		    && aClass87_3505.method1701((byte) 104)
		    && anInterface33Array3502[1].method217((byte) 65) < 100)
		    return 0;
	    }
	    Class351.aClass406_3620.method6645(client.anInterface52_11081,
					       -568346598);
	    Class78.method1620(Class254.aClass185_2683, -1268118546);
	    Class673.method11110(11, -1378441394);
	}
	if (Class294.aClass294_3133 == Class110.aClass294_1344) {
	    Class464.aClass472_5113
		= Class467.method7602(Class50.aClass50_389, false, 1, false,
				      true, -1747764863);
	    Class180.aClass472_1950
		= Class467.method7602(Class50.aClass50_378, false, 1, false,
				      true, -1747764863);
	    Class384.aClass472_3967
		= Class467.method7602(Class50.aClass50_367, false, 1, false,
				      true, -1747764863);
	    Class233.aClass472_2358
		= Class467.method7602(Class50.aClass50_368, false, 1, true,
				      true, -1747764863);
	    Class6.aClass472_57
		= Class467.method7602(Class50.aClass50_406, false, 1, true,
				      true, -1747764863);
	    Class289.aClass472_3106
		= Class467.method7602(Class50.aClass50_369, false, 1, true,
				      true, -1747764863);
	    Class298_Sub1.aClass472_10064
		= Class467.method7602(Class50.aClass50_370, true, 1, false,
				      true, -1747764863);
	    Class130.aClass472_1524
		= Class467.method7602(Class50.aClass50_371, false, 1, false,
				      true, -1747764863);
	    Class2.aClass472_23
		= Class467.method7602(Class50.aClass50_407, true, 1, false,
				      true, -1747764863);
	    Class509.aClass472_5675
		= Class467.method7602(Class50.aClass50_401, true, 1, false,
				      true, -1747764863);
	    Class631.aClass472_8222
		= Class467.method7602(Class50.aClass50_403, false, 1, false,
				      true, -1747764863);
	    Class294.aClass472_3158
		= Class467.method7602(Class50.aClass50_374, false, 1, true,
				      true, -1747764863);
	    Class601_Sub1.aClass472_10877
		= Class467.method7602(Class50.aClass50_375, true, 1, false,
				      false, -1747764863);
	    Class63.aClass472_654
		= Class467.method7602(Class50.aClass50_397, true, 1, false,
				      false, -1747764863);
	    Class190.aClass472_2137
		= Class467.method7602(Class50.aClass50_377, false, 1, true,
				      true, -1747764863);
	    Class242.aClass472_2410
		= Class467.method7602(Class50.aClass50_382, false, 1, true,
				      true, -1747764863);
	    Class200_Sub6.aClass472_9906
		= Class467.method7602(Class50.aClass50_366, false, 1, true,
				      true, -1747764863);
	    Class711_Sub3_Sub1.aClass472_11919
		= Class467.method7602(Class50.aClass50_380, false, 1, true,
				      true, -1747764863);
	    Class347_Sub3.aClass472_10254
		= Class467.method7602(Class50.aClass50_381, false, 1, true,
				      true, -1747764863);
	    Class311.aClass472_3364
		= Class467.method7602(Class50.aClass50_392, false, 1, true,
				      true, -1747764863);
	    Class52.aClass472_435
		= Class467.method7602(Class50.aClass50_390, false, 1, true,
				      true, -1747764863);
	    Class693.aClass472_8770
		= Class467.method7602(Class50.aClass50_384, true, 1, false,
				      false, -1747764863);
	    Class74.aClass472_800
		= Class467.method7602(Class50.aClass50_398, true, 1, false,
				      true, -1747764863);
	    Class494.aClass472_5535
		= Class467.method7602(Class50.aClass50_385, false, 1, true,
				      true, -1747764863);
	    Class369.aClass472_3868
		= Class467.method7602(Class50.aClass50_386, false, 1, true,
				      true, -1747764863);
	    Class699.aClass472_8802
		= Class467.method7602(Class50.aClass50_387, true, 1, true,
				      true, -1747764863);
	    Class680.aClass472_8669
		= Class467.method7602(Class50.aClass50_388, false, 1, true,
				      true, -1747764863);
	    Class397.aClass472_4120
		= Class467.method7602(Class50.aClass50_396, false, 1, true,
				      true, -1747764863);
	    client.aClass472_11237
		= Class467.method7602(Class50.aClass50_400, true, 1, false,
				      true, -1747764863);
	    Class512.aClass472_5726
		= Class467.method7602(Class50.aClass50_391, true, 1, false,
				      true, -1747764863);
	    Class295.aClass472_3161
		= Class467.method7602(Class50.aClass50_408, true, 1, true,
				      true, -1747764863);
	}
	if (Class294.aClass294_3153 == Class110.aClass294_1344) {
	    int i = 0;
	    int i_20_ = 0;
	    for (int i_21_ = 0; i_21_ < Class57.aClass451_Sub1Array459.length;
		 i_21_++) {
		if (Class57.aClass451_Sub1Array459[i_21_] != null) {
		    i += Class57.aClass451_Sub1Array459[i_21_]
			     .method15885(716362389);
		    i_20_++;
		}
	    }
	    if (i_20_ > 0)
		i /= i_20_;
	    if (i != 100) {
		if (-1948226033 * anInt3503 < 0)
		    anInt3503 = i * -399326993;
		return (100 * (i - -1948226033 * anInt3503)
			/ (100 - -1948226033 * anInt3503));
	    }
	    Class150_Sub1.method14442(Class620.aClass632_8113, (byte) 35);
	    Class351.aClass406_3620
		= new Class406(Class254.aClass185_2683,
			       Class464.aClass472_5113,
			       Class606.aClass472_7988,
			       Class97.method1832((byte) -30));
	}
	if (Class294.aClass294_3146 == Class110.aClass294_1344) {
	    byte[] is
		= Class588.aClass472_7807.method7738((Class617.aClass617_8088
						      .anInt8096) * -448671533,
						     (byte) -100);
	    if (is == null)
		return 0;
	    Class171_Sub4.aClass232_9944 = new Class232();
	    Class171_Sub4.aClass232_9944.method4285(50, 7340032, (byte) 7);
	    Class649.method10714(is, -2089343606);
	    Class673.method11110(4, -2104298105);
	}
	if (Class110.aClass294_1344 == Class294.aClass294_3141
	    && null == Class632.aClass538_8269) {
	    Class632.aClass538_8269 = new Class538(Class512.aClass472_5726);
	    Class670.method11043(Class632.aClass538_8269, 1218783460);
	}
	if (Class294.aClass294_3135 == Class110.aClass294_1344) {
	    int i = Class83.method1651((byte) -99);
	    if (i < 100)
		return i;
	    Class299.method5512
		(Class588.aClass472_7807.method7738((Class617.aClass617_8086
						     .anInt8096) * -448671533,
						    (byte) -64),
		 2051074739);
	    Class631.aShortArrayArray8218
		= Class620.aClass632_8113.aShortArrayArray8240;
	    Class312.aShortArrayArrayArray3371
		= Class620.aClass632_8113.aShortArrayArrayArray8254;
	    Class580.aShortArrayArray7762
		= Class620.aClass632_8113.aShortArrayArray8242;
	    Class473.aShortArrayArrayArray5173
		= Class620.aClass632_8113.aShortArrayArrayArray8262;
	    if (Class620.aClass632_8113.anInt8234 * 1576674457 != -1
		&& Class620.aClass632_8113.anInt8249 * -1351281821 != -1) {
		client.anInt11047
		    = Class620.aClass632_8113.anInt8234 * -1669149727;
		client.anInt11192
		    = Class620.aClass632_8113.anInt8249 * -807589047;
	    }
	    Class69.aClass630_728 = new Class630(Class588.aClass472_7807);
	    Class542.aClass623_7184 = new Class623(Class588.aClass472_7807);
	    Class700.aClass638_8806 = new Class638(Class588.aClass472_7807);
	    Class200_Sub16.aClass628_9965
		= new Class628(Class588.aClass472_7807);
	    Class554.aClass622_7353 = new Class622(Class588.aClass472_7807);
	}
	if (Class110.aClass294_1344 == Class294.aClass294_3143) {
	    if (Class620.aClass632_8113.anInt8259 * -1085389923 != -1
		&& !Class130.aClass472_1524.method7669((-1085389923
							* (Class620
							   .aClass632_8113
							   .anInt8259)),
						       0, 1804616883))
		return 99;
	    Class656.aClass177_8524 = new Class177(Class699.aClass472_8802);
	    Class534.anInterface25_7160
		= new Class179_Sub1(Class2.aClass472_23,
				    Class509.aClass472_5675);
	    Class534_Sub11_Sub13.aClass44_Sub22_11730
		= new Class44_Sub22(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class200_Sub23.aClass44_Sub14_10041
		= new Class44_Sub14(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class650.aClass44_Sub5_8464
		= new Class44_Sub5(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class233.aClass472_2358,
				   Class464.aClass472_5113);
	    Class150_Sub1.aClass44_8902
		= new Class44(client.aClass675_11016, Class539.aClass672_7171,
			      Class233.aClass472_2358, Class649.aClass649_8419,
			      64, new Class61(com.jagex.Class21.class));
	    Class706.aClass44_8845
		= new Class44(client.aClass675_11016, Class539.aClass672_7171,
			      Class233.aClass472_2358, Class649.aClass649_8396,
			      16, new Class61(com.jagex.Class74.class));
	    Class667.aClass44_Sub21_8582
		= new Class44_Sub21(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class242.aClass472_2410);
	    Class555.aClass44_Sub16_7417
		= new Class44_Sub16(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class88.aClass44_Sub12_884
		= new Class44_Sub12(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class632.aClass44_Sub2_8270
		= new Class44_Sub2(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class233.aClass472_2358,
				   Class464.aClass472_5113);
	    Class470.aClass44_Sub17_5153
		= new Class44_Sub17(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358,
				    Class464.aClass472_5113);
	    Class307.aClass44_Sub15_3349
		= new Class44_Sub15(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358,
				    Class130.aClass472_1524);
	    Class219.aClass44_Sub19_2306
		= new Class44_Sub19(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class200_Sub10.aClass44_Sub20_9926
		= new Class44_Sub20(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class175_Sub1.aClass44_Sub13_9427
		= new Class44_Sub13(client.aClass675_11016,
				    Class539.aClass672_7171, true,
				    Class190.aClass472_2137,
				    Class130.aClass472_1524);
	    client.aClass512_11100
		.method8435(Class175_Sub1.aClass44_Sub13_9427, -1193059324);
	    Class159.aClass509_1754.method8372
		(new Class44_Sub13(client.aClass675_11016,
				   Class539.aClass672_7171, true,
				   Class190.aClass472_2137,
				   Class130.aClass472_1524),
		 555662663);
	    Class222.aClass44_Sub9_2313
		= new Class44_Sub9(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class233.aClass472_2358,
				   Class464.aClass472_5113);
	    Class394_Sub1.aClass44_Sub18_10148
		= new Class44_Sub18(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358,
				    Class464.aClass472_5113);
	    Class578.aClass44_Sub3_7743
		= new Class44_Sub3(client.aClass675_11016,
				   Class539.aClass672_7171, true,
				   Class200_Sub6.aClass472_9906,
				   Class130.aClass472_1524);
	    Class531.aClass44_Sub7_7135
		= new Class44_Sub7(client.aClass675_11016,
				   Class539.aClass672_7171, true,
				   Class534_Sub11_Sub13.aClass44_Sub22_11730,
				   Class711_Sub3_Sub1.aClass472_11919,
				   Class130.aClass472_1524);
	    Class223.aClass53_Sub2_2316
		= new Class53_Sub2(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class233.aClass472_2358, true);
	    Class337.aClass44_Sub8_3524
		= new Class44_Sub8(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class233.aClass472_2358);
	    Class200_Sub12.aClass44_Sub1_9934
		= new Class44_Sub1(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class347_Sub3.aClass472_10254,
				   Class180.aClass472_1950,
				   Class384.aClass472_3967,
				   Class337.aClass44_Sub8_3524);
	    Class184.aClass44_Sub6_1988
		= new Class44_Sub6(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class233.aClass472_2358);
	    Class492.aClass44_Sub10_5341
		= new Class44_Sub10(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class55.aClass44_Sub4_447
		= new Class44_Sub4(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class311.aClass472_3364,
				   Class130.aClass472_1524);
	    Class684.aClass53_Sub1_8696
		= new Class53_Sub1(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class52.aClass472_435, true);
	    Class407.aClass110_Sub1_Sub2_4312
		= new Class110_Sub1_Sub2(client.aClass675_11016,
					 Class453.aClass453_4947,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class562.aClass110_Sub1_Sub1_7560
		= new Class110_Sub1_Sub1(client.aClass675_11016,
					 Class453.aClass453_4946,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class535.aClass110_Sub1_Sub2_7162
		= new Class110_Sub1_Sub2(client.aClass675_11016,
					 Class453.aClass453_4951,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class78.aClass110_Sub1_Sub2_826
		= new Class110_Sub1_Sub2(client.aClass675_11016,
					 Class453.aClass453_4953,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class279.aClass110_Sub1_Sub2_3053
		= new Class110_Sub1_Sub2(client.aClass675_11016,
					 Class453.aClass453_4954,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class522.aClass110_Sub1_Sub2_7083
		= new Class110_Sub1_Sub2(client.aClass675_11016,
					 Class453.aClass453_4950,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class534_Sub24.aClass110_Sub1_Sub2_10565
		= new Class110_Sub1_Sub2(client.aClass675_11016,
					 Class453.aClass453_4952,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class179_Sub1.aMap9331
		= Class395.method6565((new Class110_Sub1[]
				       { Class407.aClass110_Sub1_Sub2_4312,
					 Class562.aClass110_Sub1_Sub1_7560,
					 Class535.aClass110_Sub1_Sub2_7162,
					 Class78.aClass110_Sub1_Sub2_826,
					 Class279.aClass110_Sub1_Sub2_3053,
					 Class522.aClass110_Sub1_Sub2_7083,
					 (Class534_Sub24
					  .aClass110_Sub1_Sub2_10565) }),
				      (byte) -115);
	    Class84.aClass44_Sub11_840
		= new Class44_Sub11(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358,
				    Class179_Sub1.aMap9331);
	    Class283.anInterface18_3068 = new Class306();
	    Class150_Sub1.method14443(Class289.aClass472_3106,
				      Class130.aClass472_1524,
				      Class464.aClass472_5113,
				      Class606.aClass472_7988, -972014688);
	    aClass402_3513 = new Class402(Class397.aClass472_4120);
	    Class48.aClass387_363 = new Class387(Class680.aClass472_8669);
	    Class269.aClass396_2956 = new Class396(Class680.aClass472_8669);
	    Class618.aClass458_8101 = new Class458(Class539.aClass672_7171,
						   Class494.aClass472_5535,
						   Class369.aClass472_3868);
	    RuntimeException_Sub4.aClass56_12127
		= new Class56(Class539.aClass672_7171, Class494.aClass472_5535,
			      Class369.aClass472_3868, new Class399());
	    Class78.aClass103_825
		= new Class103(Class562.aClass110_Sub1_Sub1_7560,
			       Class84.aClass44_Sub11_840,
			       Class542.aClass623_7184
				   .method10296(-1067928162));
	    Class635.method10538(-2092510384);
	    Class179_Sub1.method14982(Class200_Sub12.aClass44_Sub1_9934,
				      (byte) 5);
	    Class408.method6692(Class269.aClass396_2956, Class48.aClass387_363,
				(byte) -16);
	    Class60.method1254(Class130.aClass472_1524,
			       Class656.aClass177_8524,
			       Class534.anInterface25_7160, (byte) 45);
	    Class267 class267
		= new Class267(Class631.aClass472_8222
				   .method7687("huffman", "", -193809585));
	    Class175.method2919(class267, (byte) 12);
	    Class498.aClass502_5556
		= Class348_Sub1_Sub2.method17995(1787971040);
	    Class200_Sub23.aClass534_Sub28_10040 = new Class534_Sub28(true);
	}
	if (Class110.aClass294_1344 == Class294.aClass294_3144) {
	    int i = (Class633.method10499(Class464.aClass472_5113, (byte) -75)
		     + Class351.aClass406_3620.method6648(true, (byte) 62));
	    int i_22_ = (Class228.method4189((byte) 19)
			 + Class351.aClass406_3620.method6649((byte) 0));
	    if (i < i_22_)
		return i * 100 / i_22_;
	}
	if (Class110.aClass294_1344 == Class294.aClass294_3145)
	    Class554.method9108(Class693.aClass472_8770, Class74.aClass472_800,
				Class555.aClass44_Sub16_7417,
				Class88.aClass44_Sub12_884,
				client.aClass512_11100.method8428(-1486655428),
				Class222.aClass44_Sub9_2313,
				Class394_Sub1.aClass44_Sub18_10148,
				Class78.aClass103_825, Class78.aClass103_825);
	if (Class294.aClass294_3138 == Class110.aClass294_1344) {
	    Class77.aClass155_Sub1_819
		= new Class155_Sub1(Class407.aClass110_Sub1_Sub2_4312);
	    Class407.method6687(1887481038);
	    Class640.aClass34_8337 = Class534_Sub31.method16387((byte) -105);
	    Class298_Sub1.aClass472_10064.method7692(false, true, 1891348506);
	    Class464.aClass472_5113.method7692(true, true, 1891348506);
	    Class606.aClass472_7988.method7692(true, true, 1891348506);
	    Class631.aClass472_8222.method7692(true, true, 1891348506);
	    client.aBool11263 = true;
	}
	if (Class294.aClass294_3147 == Class110.aClass294_1344
	    && Class620.aClass632_8113.anInt8225 * 143908383 != -1) {
	    if (!Class180.method2978((Class620.aClass632_8113.anInt8225
				      * 143908383),
				     null, 1807877474))
		return 0;
	    boolean bool = true;
	    for (int i = 0;
		 i < (Class44_Sub11.aClass243Array11006
		      [143908383 * Class620.aClass632_8113.anInt8225]
		      .aClass247Array2412).length;
		 i++) {
		Class247 class247
		    = (Class44_Sub11.aClass243Array11006
		       [143908383 * Class620.aClass632_8113.anInt8225]
		       .aClass247Array2412[i]);
		if (-1960530827 * class247.anInt2438 == 5
		    && -1 != 2083357573 * class247.anInt2634
		    && !Class464.aClass472_5113.method7669((class247.anInt2634
							    * 2083357573),
							   0, 1804616883))
		    bool = false;
	    }
	    if (!bool)
		return 0;
	}
	if (Class294.aClass294_3154 == Class110.aClass294_1344)
	    Class706.method14252(true, 1773505533);
	if (Class294.aClass294_3134 == Class110.aClass294_1344) {
	    Class277.aClass300_3049.method5530((byte) 0);
	    try {
		aThread3512.join();
	    } catch (InterruptedException interruptedexception) {
		return 0;
	    }
	    Class277.aClass300_3049 = null;
	    aThread3512 = null;
	    aClass472_3508 = null;
	    aClass472_3507 = null;
	    aClass87_3505 = null;
	    anInterface33Array3502 = null;
	    Class594.aMap7828.remove(Class50.aClass50_394);
	    Class594.aMap7828.remove(Class50.aClass50_393);
	    Class594.aMap7828.remove(Class50.aClass50_395);
	    Class304.method5593(2122018001);
	    client.aBool11050
		= Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub42_10777
		      .method17227(662803507) == 1;
	    Class44_Sub6.aClass534_Sub35_10989.method16438
		(Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub42_10777, 1,
		 -430772013);
	    if (client.aBool11050)
		Class44_Sub6.aClass534_Sub35_10989.method16438
		    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10764,
		     0, -335284323);
	    else if ((Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10764
		      .aBool10869)
		     && -686202593 * (Class200_Sub23.aClass534_Sub28_10040
				      .anInt10635) < 512
		     && 0 != (Class200_Sub23.aClass534_Sub28_10040.anInt10635
			      * -686202593))
		Class44_Sub6.aClass534_Sub35_10989.method16438
		    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10764,
		     0, -1037661083);
	    Class672.method11096((byte) 1);
	    if (client.aBool11050) {
		Class527.method8778(0, false, 766842869);
		if (!client.aBool11028)
		    Class325.method5818(Class26.aClass26_242, (byte) -95);
	    } else {
		Class527.method8778(Class44_Sub6.aClass534_Sub35_10989
					.aClass690_Sub7_10764
					.method16935(-1807368365),
				    false, -1242441274);
		if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10764
			.method16935(-1807368365)
		    == 0)
		    Class325.method5818(Class26.aClass26_245, (byte) -96);
	    }
	    Class159.method2611(Class44_Sub6.aClass534_Sub35_10989
				    .aClass690_Sub8_10775
				    .method16947(1806087447),
				-1, -1, false, -1914697068);
	    Class351.aClass406_3620.method6645(client.anInterface52_11081,
					       -1062224069);
	    Class78.method1620(Class254.aClass185_2683, 880904688);
	    Class603.method10028(Class254.aClass185_2683,
				 Class464.aClass472_5113, -1799205450);
	}
	return Class551.method9047((byte) -10);
    }
    
    static void method5889(byte[] is) {
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	for (;;) {
	    int i = class534_sub40.method16527(1870689879);
	    if (0 == i)
		break;
	    if (i == 1)
		Class616.anInt8074
		    = class534_sub40.method16529((byte) 1) * -1285368653;
	    else if (10 == i)
		class534_sub40.method16529((byte) 1);
	}
    }
    
    static {
	anInt3503 = 399326993;
    }
    
    static void method5890() {
	Class24 class24
	    = Class606.method10050("2", client.aClass675_11016.aString8640,
				   false, 2128993376);
	Class77.aClass155_Sub1_819.method15460(class24, (byte) 1);
    }
    
    public static void method5891() {
	if (Class277.aClass300_3049 != null)
	    Class277.aClass300_3049.method5530((byte) 0);
	if (null != aThread3512) {
	    for (;;) {
		try {
		    aThread3512.join();
		    break;
		} catch (InterruptedException interruptedexception) {
		    /* empty */
		}
	    }
	}
    }
    
    public static void method5892() {
	if (null != anInterface33Array3502) {
	    Interface33[] interface33s = anInterface33Array3502;
	    for (int i = 0; i < interface33s.length; i++) {
		Interface33 interface33 = interface33s[i];
		interface33.method210((byte) 1);
	    }
	}
    }
    
    static final void method5893(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	if (class669.anIntArray8595[class669.anInt8600 * 2088438307]
	    < class669.anIntArray8595[1 + class669.anInt8600 * 2088438307])
	    class669.anInt8613
		+= (-793595371
		    * class669.anIntArray8591[662605117 * class669.anInt8613]);
    }
    
    static final void method5894(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_23_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_24_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aClass219_11338.method4120(i_23_, (byte) 97)
		  .method4350(i_24_, (byte) -54);
    }
    
    public static void method5895(int i, int i_25_) {
	Class534_Sub18_Sub6 class534_sub18_sub6
	    = Class447.method7308(3, (long) i);
	class534_sub18_sub6.method18182(-1052637456);
    }
}
