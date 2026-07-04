/* Class449 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaclib.ping.Ping;

public class Class449
{
    static Class47[] aClass47Array4911;
    static int anInt4912 = 0;
    static int anInt4913 = 0;
    
    public static int method7321() {
	if (anInt4912 * 41966215 == 0) {
	    Class47.aClass47_333.method1121(new Class448("jaclib"),
					    (short) 128);
	    if (Class47.aClass47_333.method1118(1828410049)
		    .method56(-682283977)
		!= 100)
		return 1;
	    if (!((Class448) Class47.aClass47_333.method1118(1828410049))
		     .method7310(2052851785)
		&& !Class331.method5859(-2113285702)) {
		try {
		    Class700.aclient8805.method8170(-1004977104);
		    Class313.method5689(686737600);
		    Ping.init();
		} catch (Exception_Sub3 exception_sub3) {
		    Class530.method8852(Class68.aClass68_725,
					exception_sub3.aString11405,
					exception_sub3.anInt11406 * 1583361521,
					exception_sub3.getCause(), (byte) 5);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    anInt4912 = -341750985;
	}
	if (41966215 * anInt4912 == 1) {
	    aClass47Array4911 = Class47.method1126(1464202842);
	    Class47.aClass47_351.method1121(new Class439(Class588
							 .aClass472_7807),
					    (short) 128);
	    Class47.aClass47_334.method1121(new Class448("jaggl"),
					    (short) 128);
	    Class448 class448 = new Class448("jagdx");
	    if (!Class262.aString2801.startsWith("win"))
		class448.method7309(1877693855);
	    Class47.aClass47_335.method1121(class448, (short) 128);
	    Class47.aClass47_336.method1121(new Class448("sw3d"), (short) 128);
	    Class47.aClass47_343.method1121(new Class448("hw3d"), (short) 128);
	    Class47.aClass47_352.method1121(new Class448("RuneScape-Setup.exe",
							 true),
					    (short) 128);
	    Class47.aClass47_339.method1121(new Class439(Class295
							 .aClass472_3161),
					    (short) 128);
	    Class47.aClass47_340.method1121(new Class439(Class699
							 .aClass472_8802),
					    (short) 128);
	    Class47.aClass47_349.method1121(new Class439(Class233
							 .aClass472_2358),
					    (short) 128);
	    Class47.aClass47_342.method1121(new Class439(Class190
							 .aClass472_2137),
					    (short) 128);
	    Class47.aClass47_337.method1121(new Class439(Class242
							 .aClass472_2410),
					    (short) 128);
	    Class47.aClass47_344.method1121(new Class439(Class200_Sub6
							 .aClass472_9906),
					    (short) 128);
	    Class47.aClass47_345.method1121(new Class439(Class711_Sub3_Sub1
							 .aClass472_11919),
					    (short) 128);
	    Class47.aClass47_341.method1121(new Class439(Class347_Sub3
							 .aClass472_10254),
					    (short) 128);
	    Class47.aClass47_347.method1121(new Class439(Class311
							 .aClass472_3364),
					    (short) 128);
	    Class47.aClass47_348
		.method1121(new Class439(Class52.aClass472_435), (short) 128);
	    Class47.aClass47_356.method1121(new Class439(Class6.aClass472_57),
					    (short) 128);
	    Class47.aClass47_350.method1121(new Class439(Class494
							 .aClass472_5535),
					    (short) 128);
	    Class47.aClass47_346.method1121(new Class439(Class369
							 .aClass472_3868),
					    (short) 128);
	    Class47.aClass47_355.method1121(new Class439(Class680
							 .aClass472_8669),
					    (short) 128);
	    Class47.aClass47_353.method1121(new Class439(Class397
							 .aClass472_4120),
					    (short) 128);
	    Class47.aClass47_362.method1121(new Class447((Class631
							  .aClass472_8222),
							 "huffman"),
					    (short) 128);
	    Class47.aClass47_338.method1121(new Class439(Class289
							 .aClass472_3106),
					    (short) 128);
	    Class47.aClass47_332.method1121(new Class439(Class294
							 .aClass472_3158),
					    (short) 128);
	    Class47.aClass47_357.method1121(new Class439(Class606
							 .aClass472_7988),
					    (short) 128);
	    Class47.aClass47_358.method1121(new Class437((Class693
							  .aClass472_8770),
							 0),
					    (short) 128);
	    for (int i = 0; i < aClass47Array4911.length; i++) {
		if (aClass47Array4911[i].method1118(1828410049) == null)
		    throw new RuntimeException();
	    }
	    int i = 0;
	    Class47[] class47s = aClass47Array4911;
	    for (int i_0_ = 0; i_0_ < class47s.length; i_0_++) {
		Class47 class47 = class47s[i_0_];
		int i_1_ = class47.method1122(443607573);
		int i_2_
		    = class47.method1118(1828410049).method56(-1513457248);
		i += i_1_ * i_2_ / 100;
	    }
	    anInt4913 = i * -285262333;
	    anInt4912 = -683501970;
	}
	if (null == aClass47Array4911)
	    return 100;
	int i = 0;
	int i_3_ = 0;
	boolean bool = true;
	Class47[] class47s = aClass47Array4911;
	for (int i_4_ = 0; i_4_ < class47s.length; i_4_++) {
	    Class47 class47 = class47s[i_4_];
	    int i_5_ = class47.method1122(1736579390);
	    int i_6_ = class47.method1118(1828410049).method56(203287895);
	    if (i_6_ < 100)
		bool = false;
	    i += i_5_;
	    i_3_ += i_6_ * i_5_ / 100;
	}
	if (bool)
	    aClass47Array4911 = null;
	i_3_ -= anInt4913 * -1094853461;
	i -= anInt4913 * -1094853461;
	int i_7_ = i > 0 ? i_3_ * 100 / i : 100;
	if (!bool && i_7_ > 99)
	    i_7_ = 99;
	return i_7_;
    }
    
    public static int method7322() {
	if (anInt4912 * 41966215 == 0) {
	    Class47.aClass47_333.method1121(new Class448("jaclib"),
					    (short) 128);
	    if (Class47.aClass47_333.method1118(1828410049)
		    .method56(-291779005)
		!= 100)
		return 1;
	    if (!((Class448) Class47.aClass47_333.method1118(1828410049))
		     .method7310(1928964898)
		&& !Class331.method5859(-1415657416)) {
		try {
		    Class700.aclient8805.method8170(-1004977104);
		    Class313.method5689(538889824);
		    Ping.init();
		} catch (Exception_Sub3 exception_sub3) {
		    Class530.method8852(Class68.aClass68_725,
					exception_sub3.aString11405,
					exception_sub3.anInt11406 * 1583361521,
					exception_sub3.getCause(), (byte) 54);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    anInt4912 = -341750985;
	}
	if (41966215 * anInt4912 == 1) {
	    aClass47Array4911 = Class47.method1126(1954611288);
	    Class47.aClass47_351.method1121(new Class439(Class588
							 .aClass472_7807),
					    (short) 128);
	    Class47.aClass47_334.method1121(new Class448("jaggl"),
					    (short) 128);
	    Class448 class448 = new Class448("jagdx");
	    if (!Class262.aString2801.startsWith("win"))
		class448.method7309(444058840);
	    Class47.aClass47_335.method1121(class448, (short) 128);
	    Class47.aClass47_336.method1121(new Class448("sw3d"), (short) 128);
	    Class47.aClass47_343.method1121(new Class448("hw3d"), (short) 128);
	    Class47.aClass47_352.method1121(new Class448("RuneScape-Setup.exe",
							 true),
					    (short) 128);
	    Class47.aClass47_339.method1121(new Class439(Class295
							 .aClass472_3161),
					    (short) 128);
	    Class47.aClass47_340.method1121(new Class439(Class699
							 .aClass472_8802),
					    (short) 128);
	    Class47.aClass47_349.method1121(new Class439(Class233
							 .aClass472_2358),
					    (short) 128);
	    Class47.aClass47_342.method1121(new Class439(Class190
							 .aClass472_2137),
					    (short) 128);
	    Class47.aClass47_337.method1121(new Class439(Class242
							 .aClass472_2410),
					    (short) 128);
	    Class47.aClass47_344.method1121(new Class439(Class200_Sub6
							 .aClass472_9906),
					    (short) 128);
	    Class47.aClass47_345.method1121(new Class439(Class711_Sub3_Sub1
							 .aClass472_11919),
					    (short) 128);
	    Class47.aClass47_341.method1121(new Class439(Class347_Sub3
							 .aClass472_10254),
					    (short) 128);
	    Class47.aClass47_347.method1121(new Class439(Class311
							 .aClass472_3364),
					    (short) 128);
	    Class47.aClass47_348
		.method1121(new Class439(Class52.aClass472_435), (short) 128);
	    Class47.aClass47_356.method1121(new Class439(Class6.aClass472_57),
					    (short) 128);
	    Class47.aClass47_350.method1121(new Class439(Class494
							 .aClass472_5535),
					    (short) 128);
	    Class47.aClass47_346.method1121(new Class439(Class369
							 .aClass472_3868),
					    (short) 128);
	    Class47.aClass47_355.method1121(new Class439(Class680
							 .aClass472_8669),
					    (short) 128);
	    Class47.aClass47_353.method1121(new Class439(Class397
							 .aClass472_4120),
					    (short) 128);
	    Class47.aClass47_362.method1121(new Class447((Class631
							  .aClass472_8222),
							 "huffman"),
					    (short) 128);
	    Class47.aClass47_338.method1121(new Class439(Class289
							 .aClass472_3106),
					    (short) 128);
	    Class47.aClass47_332.method1121(new Class439(Class294
							 .aClass472_3158),
					    (short) 128);
	    Class47.aClass47_357.method1121(new Class439(Class606
							 .aClass472_7988),
					    (short) 128);
	    Class47.aClass47_358.method1121(new Class437((Class693
							  .aClass472_8770),
							 0),
					    (short) 128);
	    for (int i = 0; i < aClass47Array4911.length; i++) {
		if (aClass47Array4911[i].method1118(1828410049) == null)
		    throw new RuntimeException();
	    }
	    int i = 0;
	    Class47[] class47s = aClass47Array4911;
	    for (int i_8_ = 0; i_8_ < class47s.length; i_8_++) {
		Class47 class47 = class47s[i_8_];
		int i_9_ = class47.method1122(412701570);
		int i_10_
		    = class47.method1118(1828410049).method56(-720923811);
		i += i_9_ * i_10_ / 100;
	    }
	    anInt4913 = i * -285262333;
	    anInt4912 = -683501970;
	}
	if (null == aClass47Array4911)
	    return 100;
	int i = 0;
	int i_11_ = 0;
	boolean bool = true;
	Class47[] class47s = aClass47Array4911;
	for (int i_12_ = 0; i_12_ < class47s.length; i_12_++) {
	    Class47 class47 = class47s[i_12_];
	    int i_13_ = class47.method1122(1722924142);
	    int i_14_ = class47.method1118(1828410049).method56(-537056757);
	    if (i_14_ < 100)
		bool = false;
	    i += i_13_;
	    i_11_ += i_14_ * i_13_ / 100;
	}
	if (bool)
	    aClass47Array4911 = null;
	i_11_ -= anInt4913 * -1094853461;
	i -= anInt4913 * -1094853461;
	int i_15_ = i > 0 ? i_11_ * 100 / i : 100;
	if (!bool && i_15_ > 99)
	    i_15_ = 99;
	return i_15_;
    }
    
    public static int method7323() {
	if (anInt4912 * 41966215 == 0) {
	    Class47.aClass47_333.method1121(new Class448("jaclib"),
					    (short) 128);
	    if (Class47.aClass47_333.method1118(1828410049)
		    .method56(-1159249401)
		!= 100)
		return 1;
	    if (!((Class448) Class47.aClass47_333.method1118(1828410049))
		     .method7310(1833882268)
		&& !Class331.method5859(-1606157328)) {
		try {
		    Class700.aclient8805.method8170(-1004977104);
		    Class313.method5689(556389096);
		    Ping.init();
		} catch (Exception_Sub3 exception_sub3) {
		    Class530.method8852(Class68.aClass68_725,
					exception_sub3.aString11405,
					exception_sub3.anInt11406 * 1583361521,
					exception_sub3.getCause(), (byte) -37);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    anInt4912 = -341750985;
	}
	if (41966215 * anInt4912 == 1) {
	    aClass47Array4911 = Class47.method1126(2106437836);
	    Class47.aClass47_351.method1121(new Class439(Class588
							 .aClass472_7807),
					    (short) 128);
	    Class47.aClass47_334.method1121(new Class448("jaggl"),
					    (short) 128);
	    Class448 class448 = new Class448("jagdx");
	    if (!Class262.aString2801.startsWith("win"))
		class448.method7309(1062975261);
	    Class47.aClass47_335.method1121(class448, (short) 128);
	    Class47.aClass47_336.method1121(new Class448("sw3d"), (short) 128);
	    Class47.aClass47_343.method1121(new Class448("hw3d"), (short) 128);
	    Class47.aClass47_352.method1121(new Class448("RuneScape-Setup.exe",
							 true),
					    (short) 128);
	    Class47.aClass47_339.method1121(new Class439(Class295
							 .aClass472_3161),
					    (short) 128);
	    Class47.aClass47_340.method1121(new Class439(Class699
							 .aClass472_8802),
					    (short) 128);
	    Class47.aClass47_349.method1121(new Class439(Class233
							 .aClass472_2358),
					    (short) 128);
	    Class47.aClass47_342.method1121(new Class439(Class190
							 .aClass472_2137),
					    (short) 128);
	    Class47.aClass47_337.method1121(new Class439(Class242
							 .aClass472_2410),
					    (short) 128);
	    Class47.aClass47_344.method1121(new Class439(Class200_Sub6
							 .aClass472_9906),
					    (short) 128);
	    Class47.aClass47_345.method1121(new Class439(Class711_Sub3_Sub1
							 .aClass472_11919),
					    (short) 128);
	    Class47.aClass47_341.method1121(new Class439(Class347_Sub3
							 .aClass472_10254),
					    (short) 128);
	    Class47.aClass47_347.method1121(new Class439(Class311
							 .aClass472_3364),
					    (short) 128);
	    Class47.aClass47_348
		.method1121(new Class439(Class52.aClass472_435), (short) 128);
	    Class47.aClass47_356.method1121(new Class439(Class6.aClass472_57),
					    (short) 128);
	    Class47.aClass47_350.method1121(new Class439(Class494
							 .aClass472_5535),
					    (short) 128);
	    Class47.aClass47_346.method1121(new Class439(Class369
							 .aClass472_3868),
					    (short) 128);
	    Class47.aClass47_355.method1121(new Class439(Class680
							 .aClass472_8669),
					    (short) 128);
	    Class47.aClass47_353.method1121(new Class439(Class397
							 .aClass472_4120),
					    (short) 128);
	    Class47.aClass47_362.method1121(new Class447((Class631
							  .aClass472_8222),
							 "huffman"),
					    (short) 128);
	    Class47.aClass47_338.method1121(new Class439(Class289
							 .aClass472_3106),
					    (short) 128);
	    Class47.aClass47_332.method1121(new Class439(Class294
							 .aClass472_3158),
					    (short) 128);
	    Class47.aClass47_357.method1121(new Class439(Class606
							 .aClass472_7988),
					    (short) 128);
	    Class47.aClass47_358.method1121(new Class437((Class693
							  .aClass472_8770),
							 0),
					    (short) 128);
	    for (int i = 0; i < aClass47Array4911.length; i++) {
		if (aClass47Array4911[i].method1118(1828410049) == null)
		    throw new RuntimeException();
	    }
	    int i = 0;
	    Class47[] class47s = aClass47Array4911;
	    for (int i_16_ = 0; i_16_ < class47s.length; i_16_++) {
		Class47 class47 = class47s[i_16_];
		int i_17_ = class47.method1122(1440979419);
		int i_18_
		    = class47.method1118(1828410049).method56(-499056073);
		i += i_17_ * i_18_ / 100;
	    }
	    anInt4913 = i * -285262333;
	    anInt4912 = -683501970;
	}
	if (null == aClass47Array4911)
	    return 100;
	int i = 0;
	int i_19_ = 0;
	boolean bool = true;
	Class47[] class47s = aClass47Array4911;
	for (int i_20_ = 0; i_20_ < class47s.length; i_20_++) {
	    Class47 class47 = class47s[i_20_];
	    int i_21_ = class47.method1122(1954503939);
	    int i_22_ = class47.method1118(1828410049).method56(319941546);
	    if (i_22_ < 100)
		bool = false;
	    i += i_21_;
	    i_19_ += i_22_ * i_21_ / 100;
	}
	if (bool)
	    aClass47Array4911 = null;
	i_19_ -= anInt4913 * -1094853461;
	i -= anInt4913 * -1094853461;
	int i_23_ = i > 0 ? i_19_ * 100 / i : 100;
	if (!bool && i_23_ > 99)
	    i_23_ = 99;
	return i_23_;
    }
    
    Class449() throws Throwable {
	throw new Error();
    }
    
    public static int method7324() {
	if (anInt4912 * 41966215 == 0) {
	    Class47.aClass47_333.method1121(new Class448("jaclib"),
					    (short) 128);
	    if (Class47.aClass47_333.method1118(1828410049)
		    .method56(-1938311777)
		!= 100)
		return 1;
	    if (!((Class448) Class47.aClass47_333.method1118(1828410049))
		     .method7310(2085927754)
		&& !Class331.method5859(-1729127058)) {
		try {
		    Class700.aclient8805.method8170(-1004977104);
		    Class313.method5689(2026463564);
		    Ping.init();
		} catch (Exception_Sub3 exception_sub3) {
		    Class530.method8852(Class68.aClass68_725,
					exception_sub3.aString11405,
					exception_sub3.anInt11406 * 1583361521,
					exception_sub3.getCause(),
					(byte) -111);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    anInt4912 = -341750985;
	}
	if (41966215 * anInt4912 == 1) {
	    aClass47Array4911 = Class47.method1126(726439006);
	    Class47.aClass47_351.method1121(new Class439(Class588
							 .aClass472_7807),
					    (short) 128);
	    Class47.aClass47_334.method1121(new Class448("jaggl"),
					    (short) 128);
	    Class448 class448 = new Class448("jagdx");
	    if (!Class262.aString2801.startsWith("win"))
		class448.method7309(-237089965);
	    Class47.aClass47_335.method1121(class448, (short) 128);
	    Class47.aClass47_336.method1121(new Class448("sw3d"), (short) 128);
	    Class47.aClass47_343.method1121(new Class448("hw3d"), (short) 128);
	    Class47.aClass47_352.method1121(new Class448("RuneScape-Setup.exe",
							 true),
					    (short) 128);
	    Class47.aClass47_339.method1121(new Class439(Class295
							 .aClass472_3161),
					    (short) 128);
	    Class47.aClass47_340.method1121(new Class439(Class699
							 .aClass472_8802),
					    (short) 128);
	    Class47.aClass47_349.method1121(new Class439(Class233
							 .aClass472_2358),
					    (short) 128);
	    Class47.aClass47_342.method1121(new Class439(Class190
							 .aClass472_2137),
					    (short) 128);
	    Class47.aClass47_337.method1121(new Class439(Class242
							 .aClass472_2410),
					    (short) 128);
	    Class47.aClass47_344.method1121(new Class439(Class200_Sub6
							 .aClass472_9906),
					    (short) 128);
	    Class47.aClass47_345.method1121(new Class439(Class711_Sub3_Sub1
							 .aClass472_11919),
					    (short) 128);
	    Class47.aClass47_341.method1121(new Class439(Class347_Sub3
							 .aClass472_10254),
					    (short) 128);
	    Class47.aClass47_347.method1121(new Class439(Class311
							 .aClass472_3364),
					    (short) 128);
	    Class47.aClass47_348
		.method1121(new Class439(Class52.aClass472_435), (short) 128);
	    Class47.aClass47_356.method1121(new Class439(Class6.aClass472_57),
					    (short) 128);
	    Class47.aClass47_350.method1121(new Class439(Class494
							 .aClass472_5535),
					    (short) 128);
	    Class47.aClass47_346.method1121(new Class439(Class369
							 .aClass472_3868),
					    (short) 128);
	    Class47.aClass47_355.method1121(new Class439(Class680
							 .aClass472_8669),
					    (short) 128);
	    Class47.aClass47_353.method1121(new Class439(Class397
							 .aClass472_4120),
					    (short) 128);
	    Class47.aClass47_362.method1121(new Class447((Class631
							  .aClass472_8222),
							 "huffman"),
					    (short) 128);
	    Class47.aClass47_338.method1121(new Class439(Class289
							 .aClass472_3106),
					    (short) 128);
	    Class47.aClass47_332.method1121(new Class439(Class294
							 .aClass472_3158),
					    (short) 128);
	    Class47.aClass47_357.method1121(new Class439(Class606
							 .aClass472_7988),
					    (short) 128);
	    Class47.aClass47_358.method1121(new Class437((Class693
							  .aClass472_8770),
							 0),
					    (short) 128);
	    for (int i = 0; i < aClass47Array4911.length; i++) {
		if (aClass47Array4911[i].method1118(1828410049) == null)
		    throw new RuntimeException();
	    }
	    int i = 0;
	    Class47[] class47s = aClass47Array4911;
	    for (int i_24_ = 0; i_24_ < class47s.length; i_24_++) {
		Class47 class47 = class47s[i_24_];
		int i_25_ = class47.method1122(697297073);
		int i_26_ = class47.method1118(1828410049).method56(328744419);
		i += i_25_ * i_26_ / 100;
	    }
	    anInt4913 = i * -285262333;
	    anInt4912 = -683501970;
	}
	if (null == aClass47Array4911)
	    return 100;
	int i = 0;
	int i_27_ = 0;
	boolean bool = true;
	Class47[] class47s = aClass47Array4911;
	for (int i_28_ = 0; i_28_ < class47s.length; i_28_++) {
	    Class47 class47 = class47s[i_28_];
	    int i_29_ = class47.method1122(805531038);
	    int i_30_ = class47.method1118(1828410049).method56(-1724704733);
	    if (i_30_ < 100)
		bool = false;
	    i += i_29_;
	    i_27_ += i_30_ * i_29_ / 100;
	}
	if (bool)
	    aClass47Array4911 = null;
	i_27_ -= anInt4913 * -1094853461;
	i -= anInt4913 * -1094853461;
	int i_31_ = i > 0 ? i_27_ * 100 / i : 100;
	if (!bool && i_31_ > 99)
	    i_31_ = 99;
	return i_31_;
    }
    
    static final void method7325(Class669 class669, int i) {
	boolean bool = ((class669.anIntArray8595
			 [(class669.anInt8600 -= 308999563) * 2088438307])
			!= 0);
	if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aClass631_12226
	    != null)
	    Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aClass631_12226
		.method10459(bool, -352010307);
    }
    
    static final void method7326(Class669 class669, byte i) {
	int i_32_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_32_, 250536991);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_32_ >> 16];
	Class20.method801(class247, class243, class669, (short) -12185);
    }
    
    static final void method7327(Class247 class247, Class669 class669,
				 byte i) {
	int i_33_ = 10;
	int i_34_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	int i_35_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class453.method7405(class247, i_33_, i_34_, i_35_, class669,
			    (byte) -27);
    }
    
    static final void method7328(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	int i_36_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_37_
	    = class669.anIntArray8595[1 + 2088438307 * class669.anInt8600];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_36_ / i_37_;
    }
    
    static final void method7329(Class669 class669, short i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub1_10762
		  .method16828(62926167) == 1 ? 1 : 0;
    }
    
    public static void method7330
	(int i, int i_38_, int i_39_, int i_40_, Class602 class602,
	 Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1,
	 Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2,
	 int i_41_) {
	Class534_Sub16 class534_sub16 = new Class534_Sub16();
	class534_sub16.anInt10471 = -1178810913 * i;
	class534_sub16.anInt10472 = -973592293 * (i_38_ << 9);
	class534_sub16.anInt10473 = -1604946927 * (i_39_ << 9);
	if (class602 != null) {
	    class534_sub16.aClass602_10481 = class602;
	    int i_42_ = class602.anInt7904 * -1082258489;
	    int i_43_ = -1990374967 * class602.anInt7928;
	    if (1 == i_40_ || i_40_ == 3) {
		i_42_ = class602.anInt7928 * -1990374967;
		i_43_ = class602.anInt7904 * -1082258489;
	    }
	    class534_sub16.anInt10474 = (i_42_ + i_38_ << 9) * -800010841;
	    class534_sub16.anInt10475 = 1156683381 * (i_43_ + i_39_ << 9);
	    class534_sub16.anInt10489 = class602.anInt7945 * 1128583165;
	    class534_sub16.anInt10467
		= (372226515 * class602.anInt7946 << 9) * -612932795;
	    class534_sub16.anInt10480 = class602.anInt7948 * 1993106295;
	    class534_sub16.anInt10495 = class602.anInt7915 * 617813239;
	    class534_sub16.anInt10496 = 1071004077 * class602.anInt7950;
	    class534_sub16.anIntArray10479 = class602.anIntArray7951;
	    class534_sub16.anInt10493 = -1005766001 * class602.anInt7960;
	    class534_sub16.anInt10483 = class602.anInt7901 * -990708005;
	    class534_sub16.anInt10491
		= -2034082261 * (925162477 * class602.anInt7947 << 9);
	    if (null != class602.anIntArray7943) {
		class534_sub16.aBool10498 = true;
		class534_sub16.method16151(269137949);
	    }
	    if (null != class534_sub16.anIntArray10479)
		class534_sub16.anInt10488
		    = ((class534_sub16.anInt10495 * -1089168257
			+ (int) (Math.random()
				 * (double) ((1512108791
					      * class534_sub16.anInt10496)
					     - (-1089168257
						* class534_sub16.anInt10495))))
		       * 835810559);
	    Class534_Sub16.aClass700_10468.method14131(class534_sub16,
						       (short) 789);
	    Class171_Sub4.aClass232_9944.method4230((-241175639
						     * (class534_sub16
							.anInt10489)),
						    -1403456942);
	    Class171_Sub4.aClass232_9944
		.method4310(class534_sub16.anIntArray10479, 698753711);
	} else if (class654_sub1_sub5_sub1_sub1 != null) {
	    class534_sub16.aClass654_Sub1_Sub5_Sub1_Sub1_10482
		= class654_sub1_sub5_sub1_sub1;
	    Class307 class307 = class654_sub1_sub5_sub1_sub1.aClass307_12204;
	    if (class307.anIntArray3284 != null) {
		class534_sub16.aBool10498 = true;
		class307
		    = class307.method5615(Class78.aClass103_825,
					  Class78.aClass103_825, -1466068515);
	    }
	    if (null != class307) {
		class534_sub16.anInt10474
		    = -800010841 * (class307.anInt3328 * -1821838479 + i_38_
				    << 9);
		class534_sub16.anInt10475
		    = ((-1821838479 * class307.anInt3328 + i_39_ << 9)
		       * 1156683381);
		class534_sub16.anInt10489
		    = Class308.method5656(class654_sub1_sub5_sub1_sub1,
					  304134630) * 1086873753;
		class534_sub16.anInt10467
		    = (class307.anInt3332 * -869231065 << 9) * -612932795;
		class534_sub16.anInt10480 = 1689126761 * class307.anInt3334;
		class534_sub16.anInt10493 = class307.anInt3344 * 932822485;
		class534_sub16.anInt10483 = -32158863 * class307.anInt3343;
		class534_sub16.anInt10491
		    = (class307.anInt3295 * -1156607845 << 9) * -2034082261;
		Class171_Sub4.aClass232_9944
		    .method4230(1315529581 * class307.anInt3304, -1553605284);
		Class171_Sub4.aClass232_9944
		    .method4230(1912925203 * class307.anInt3329, -1757382396);
		Class171_Sub4.aClass232_9944
		    .method4230(1144816973 * class307.anInt3330, -1726430303);
		Class171_Sub4.aClass232_9944
		    .method4230(-306882215 * class307.anInt3331, -2098508267);
	    }
	    Class534_Sub16.aClass700_10469.method14131(class534_sub16,
						       (short) 789);
	} else if (class654_sub1_sub5_sub1_sub2 != null) {
	    class534_sub16.aClass654_Sub1_Sub5_Sub1_Sub2_10490
		= class654_sub1_sub5_sub1_sub2;
	    class534_sub16.anInt10474
		= (i_38_ + class654_sub1_sub5_sub1_sub2.method18545((byte) 1)
		   << 9) * -800010841;
	    class534_sub16.anInt10475
		= (i_39_ + class654_sub1_sub5_sub1_sub2.method18545((byte) 1)
		   << 9) * 1156683381;
	    class534_sub16.anInt10489
		= (Class206.method3937(class654_sub1_sub5_sub1_sub2, 411633108)
		   * 1086873753);
	    class534_sub16.anInt10467
		= ((class654_sub1_sub5_sub1_sub2.anInt12229 * -785793877 << 9)
		   * -612932795);
	    class534_sub16.anInt10480
		= -908420807 * class654_sub1_sub5_sub1_sub2.anInt12215;
	    class534_sub16.anInt10493 = 1916307200;
	    class534_sub16.anInt10483 = 665776896;
	    class534_sub16.anInt10491 = 0;
	    Class534_Sub16.aClass9_10470.method581
		(class534_sub16,
		 (long) (1126388985
			 * class654_sub1_sub5_sub1_sub2.anInt11922));
	    Class171_Sub4.aClass232_9944.method4230
		(class654_sub1_sub5_sub1_sub2.anInt12230 * -729876395,
		 -2002857657);
	    Class171_Sub4.aClass232_9944.method4230
		(-2046269725 * class654_sub1_sub5_sub1_sub2.anInt12222,
		 -2108415114);
	    Class171_Sub4.aClass232_9944.method4230
		(1734964233 * class654_sub1_sub5_sub1_sub2.anInt12227,
		 -1618413881);
	    Class171_Sub4.aClass232_9944.method4230
		(-510526957 * class654_sub1_sub5_sub1_sub2.anInt12231,
		 -1835823253);
	}
    }
}
