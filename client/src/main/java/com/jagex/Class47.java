/* Class47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class47
{
    public static Class47 aClass47_332;
    public static Class47 aClass47_333;
    public static Class47 aClass47_334;
    public static Class47 aClass47_335;
    public static Class47 aClass47_336;
    public static Class47 aClass47_337;
    public static Class47 aClass47_338;
    public static Class47 aClass47_339;
    public static Class47 aClass47_340;
    public static Class47 aClass47_341;
    public static Class47 aClass47_342;
    public static Class47 aClass47_343;
    public static Class47 aClass47_344;
    public static Class47 aClass47_345;
    public static Class47 aClass47_346;
    public static Class47 aClass47_347;
    public static Class47 aClass47_348;
    public static Class47 aClass47_349;
    public static Class47 aClass47_350;
    public static Class47 aClass47_351 = new Class47(Class30.aClass30_269);
    public static Class47 aClass47_352;
    public static Class47 aClass47_353;
    public static Class163 aClass163_354;
    public static Class47 aClass47_355;
    public static Class47 aClass47_356;
    public static Class47 aClass47_357;
    public static Class47 aClass47_358;
    Class30 aClass30_359;
    int anInt360;
    Interface5 anInterface5_361;
    public static Class47 aClass47_362;
    
    static final void method1115
	(Class534_Sub40_Sub1 class534_sub40_sub1, int i,
	 Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2, int i_0_,
	 int i_1_) {
	if (0 != (i_0_ & 0x4)) {
	    int i_2_ = class534_sub40_sub1.method16529((byte) 1);
	    if (i_2_ == 65535)
		i_2_ = -1;
	    class654_sub1_sub5_sub1_sub2.anInt11944 = i_2_ * 776069067;
	}
	if (0 != (i_0_ & 0x10)) {
	    class654_sub1_sub5_sub1_sub2.anInt12223
		= class534_sub40_sub1.method16529((byte) 1) * -1021477997;
	    if (class654_sub1_sub5_sub1_sub2.anInt11980 * -1763707177 == 0) {
		class654_sub1_sub5_sub1_sub2.method18524
		    (class654_sub1_sub5_sub1_sub2.anInt12223 * -2025203045,
		     204094092);
		class654_sub1_sub5_sub1_sub2.anInt12223 = 1021477997;
	    }
	}
	if (0 != (i_0_ & 0x2000)) {
	    int i_3_ = class534_sub40_sub1.method16571(-1369445510);
	    int i_4_ = class534_sub40_sub1.method16514((short) -26789);
	    if (65535 == i_3_)
		i_3_ = -1;
	    int i_5_ = class534_sub40_sub1.method16527(1286980969);
	    int i_6_ = i_5_ & 0x7;
	    int i_7_ = i_5_ >> 3 & 0xf;
	    if (15 == i_7_)
		i_7_ = -1;
	    boolean bool = (i_5_ >> 7 & 0x1) == 1;
	    class654_sub1_sub5_sub1_sub2.method18540(i_3_, i_4_, i_6_, i_7_,
						     bool, 2, (byte) 0);
	}
	if (0 != (i_0_ & 0x40000)) {
	    class534_sub40_sub1.anInt10811 += 1520029430;
	    int i_8_
		= (class534_sub40_sub1.aByteArray10810
		   [((class534_sub40_sub1.anInt10811 += -1387468933) * 31645619
		     - 1)]) & 0xff;
	    for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
		int i_10_ = class534_sub40_sub1.method16527(294164636);
		Class483 class483
		    = ((Class483)
		       Class448.method7319(Class483.method7942(-88965010),
					   i_10_, 2088438307));
		Class429 class429
		    = (Class562.aClass110_Sub1_Sub1_7560.method14492
		       (class534_sub40_sub1, class483, -1647422507));
		class654_sub1_sub5_sub1_sub2.anInterface4_11987.method29
		    (class429.anInt4820 * -608978823, class429.anObject4819,
		     (short) -3058);
	    }
	}
	if (0 != (i_0_ & 0x1000)) {
	    int i_11_ = class534_sub40_sub1.method16745(-891094135);
	    byte[] is = new byte[i_11_];
	    Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	    class534_sub40_sub1.method16753(is, 0, i_11_, 274672973);
	    Class108.aClass534_Sub40Array1316[i] = class534_sub40;
	    class654_sub1_sub5_sub1_sub2.method18866(class534_sub40, (byte) 0);
	}
	if ((i_0_ & 0x400000) != 0) {
	    int i_12_ = class534_sub40_sub1.method16643(-2137092807);
	    int[] is = new int[i_12_];
	    int[] is_13_ = new int[i_12_];
	    for (int i_14_ = 0; i_14_ < i_12_; i_14_++) {
		int i_15_ = class534_sub40_sub1.method16571(648489963);
		if ((i_15_ & 0xc000) == 49152) {
		    int i_16_ = class534_sub40_sub1.method16572((byte) 122);
		    is[i_14_] = i_15_ << 16 | i_16_;
		} else
		    is[i_14_] = i_15_;
		is_13_[i_14_] = class534_sub40_sub1.method16573(-1982766353);
	    }
	    class654_sub1_sub5_sub1_sub2.method18557(is, is_13_, (byte) 74);
	}
	if (0 != (i_0_ & 0x8000)) {
	    int i_17_ = class534_sub40_sub1.method16571(-1276840004);
	    int i_18_ = class534_sub40_sub1.method16582(1522423460);
	    if (65535 == i_17_)
		i_17_ = -1;
	    int i_19_ = class534_sub40_sub1.method16563((byte) -14);
	    int i_20_ = i_19_ & 0x7;
	    int i_21_ = i_19_ >> 3 & 0xf;
	    if (15 == i_21_)
		i_21_ = -1;
	    boolean bool = (i_19_ >> 7 & 0x1) == 1;
	    class654_sub1_sub5_sub1_sub2.method18540(i_17_, i_18_, i_20_,
						     i_21_, bool, 1, (byte) 0);
	}
	if (0 != (i_0_ & 0x400)) {
	    class654_sub1_sub5_sub1_sub2.aClass252_12232
		= ((Class252)
		   Class448.method7319(Class252.method4624(-1466328823),
				       class534_sub40_sub1
					   .method16563((byte) -96),
				       2088438307));
	    if (class654_sub1_sub5_sub1_sub2.aClass252_12232 == null)
		class654_sub1_sub5_sub1_sub2.aClass252_12232
		    = Class252.aClass252_2658;
	}
	if (0 != (i_0_ & 0x800000)) {
	    int i_22_ = class534_sub40_sub1.method16571(-416520731);
	    int i_23_ = class534_sub40_sub1.method16581(1038317543);
	    if (65535 == i_22_)
		i_22_ = -1;
	    int i_24_ = class534_sub40_sub1.method16563((byte) -6);
	    int i_25_ = i_24_ & 0x7;
	    int i_26_ = i_24_ >> 3 & 0xf;
	    if (i_26_ == 15)
		i_26_ = -1;
	    boolean bool = (i_24_ >> 7 & 0x1) == 1;
	    class654_sub1_sub5_sub1_sub2.method18540(i_22_, i_23_, i_25_,
						     i_26_, bool, 4, (byte) 0);
	}
	if ((i_0_ & 0x100000) != 0) {
	    int i_27_ = class534_sub40_sub1.method16571(1618105384);
	    int i_28_ = class534_sub40_sub1.method16581(-1667068881);
	    if (i_27_ == 65535)
		i_27_ = -1;
	    int i_29_ = class534_sub40_sub1.method16643(-2047598451);
	    int i_30_ = i_29_ & 0x7;
	    int i_31_ = i_29_ >> 3 & 0xf;
	    if (15 == i_31_)
		i_31_ = -1;
	    boolean bool = (i_29_ >> 7 & 0x1) == 1;
	    class654_sub1_sub5_sub1_sub2.method18540(i_27_, i_28_, i_30_,
						     i_31_, bool, 3, (byte) 0);
	}
	if ((i_0_ & 0x2) != 0) {
	    int i_32_ = class534_sub40_sub1.method16527(-318825210);
	    byte[] is = new byte[i_32_];
	    Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	    class534_sub40_sub1.method16753(is, 0, i_32_, 1866368264);
	    Class108.aClass534_Sub40Array1319[i] = class534_sub40;
	    class654_sub1_sub5_sub1_sub2.method18865(class534_sub40,
						     (byte) 61);
	}
	if (0 != (i_0_ & 0x40)) {
	    int i_33_ = class534_sub40_sub1.method16571(258472844);
	    int i_34_ = class534_sub40_sub1.method16514((short) -10699);
	    if (i_33_ == 65535)
		i_33_ = -1;
	    int i_35_ = class534_sub40_sub1.method16745(-891094135);
	    int i_36_ = i_35_ & 0x7;
	    int i_37_ = i_35_ >> 3 & 0xf;
	    if (i_37_ == 15)
		i_37_ = -1;
	    boolean bool = 1 == (i_35_ >> 7 & 0x1);
	    class654_sub1_sub5_sub1_sub2.method18540(i_33_, i_34_, i_36_,
						     i_37_, bool, 0, (byte) 0);
	}
	if (0 != (i_0_ & 0x200000)) {
	    String string = class534_sub40_sub1.method16541((byte) -19);
	    int i_38_ = class534_sub40_sub1.method16527(-293097028);
	    if (0 != (i_38_ & 0x1))
		Class272.method5067(2, i_38_,
				    class654_sub1_sub5_sub1_sub2
					.method18877(true, 1529160978),
				    class654_sub1_sub5_sub1_sub2
					.method18882(false, 870326225),
				    class654_sub1_sub5_sub1_sub2.aString12228,
				    string, null, (byte) 5);
	    class654_sub1_sub5_sub1_sub2.method18875(string, 0, 0, 2048853253);
	}
	if ((i_0_ & 0x80000) != 0) {
	    class654_sub1_sub5_sub1_sub2.anInterface4_11987
		.method33(-489805449);
	    class534_sub40_sub1.anInt10811 += 1520029430;
	    int i_39_
		= (class534_sub40_sub1.aByteArray10810
		   [((class534_sub40_sub1.anInt10811 += -1387468933) * 31645619
		     - 1)]) & 0xff;
	    for (int i_40_ = 0; i_40_ < i_39_; i_40_++) {
		int i_41_ = class534_sub40_sub1.method16745(-891094135);
		Class483 class483
		    = ((Class483)
		       Class448.method7319(Class483.method7942(-88965010),
					   i_41_, 2088438307));
		Class429 class429
		    = (Class562.aClass110_Sub1_Sub1_7560.method14492
		       (class534_sub40_sub1, class483, -2023004881));
		class654_sub1_sub5_sub1_sub2.anInterface4_11987.method29
		    (-608978823 * class429.anInt4820, class429.anObject4819,
		     (short) -10557);
	    }
	}
	if (0 != (i_0_ & 0x1)) {
	    int i_42_ = class534_sub40_sub1.method16745(-891094135);
	    if (i_42_ > 0) {
		for (int i_43_ = 0; i_43_ < i_42_; i_43_++) {
		    int i_44_ = -1;
		    int i_45_ = -1;
		    int i_46_ = -1;
		    int i_47_ = class534_sub40_sub1.method16546(-1706829710);
		    if (i_47_ == 32767) {
			i_47_ = class534_sub40_sub1.method16546(-1706829710);
			i_45_ = class534_sub40_sub1.method16546(-1706829710);
			i_44_ = class534_sub40_sub1.method16546(-1706829710);
			i_46_ = class534_sub40_sub1.method16546(-1706829710);
		    } else if (32766 != i_47_)
			i_45_ = class534_sub40_sub1.method16546(-1706829710);
		    else {
			i_47_ = -1;
			i_45_ = class534_sub40_sub1.method16745(-891094135);
		    }
		    int i_48_ = class534_sub40_sub1.method16546(-1706829710);
		    class654_sub1_sub5_sub1_sub2.method18565(i_47_, i_45_,
							     i_44_, i_46_,
							     client.anInt11101,
							     i_48_, 426860358);
		}
	    }
	    int i_49_ = class534_sub40_sub1.method16745(-891094135);
	    if (i_49_ > 0) {
		for (int i_50_ = 0; i_50_ < i_49_; i_50_++) {
		    int i_51_ = class534_sub40_sub1.method16546(-1706829710);
		    int i_52_ = class534_sub40_sub1.method16546(-1706829710);
		    if (32767 != i_52_) {
			int i_53_
			    = class534_sub40_sub1.method16546(-1706829710);
			int i_54_
			    = class534_sub40_sub1.method16745(-891094135);
			int i_55_
			    = (i_52_ > 0
			       ? class534_sub40_sub1.method16643(-2140898765)
			       : i_54_);
			class654_sub1_sub5_sub1_sub2.method18532(i_51_,
								 (client
								  .anInt11101),
								 i_52_, i_53_,
								 i_54_, i_55_,
								 1846476627);
		    } else
			class654_sub1_sub5_sub1_sub2.method18533(i_51_,
								 1587062467);
		}
	    }
	}
	if ((i_0_ & 0x200) != 0) {
	    int i_56_ = class534_sub40_sub1.method16563((byte) -53);
	    int[] is = new int[i_56_];
	    int[] is_57_ = new int[i_56_];
	    int[] is_58_ = new int[i_56_];
	    for (int i_59_ = 0; i_59_ < i_56_; i_59_++) {
		is[i_59_] = class534_sub40_sub1.method16550((byte) -8);
		is_57_[i_59_] = class534_sub40_sub1.method16745(-891094135);
		is_58_[i_59_] = class534_sub40_sub1.method16571(1629412888);
	    }
	    Class640.method10598(class654_sub1_sub5_sub1_sub2, is, is_57_,
				 is_58_, (byte) -37);
	}
	if ((i_0_ & 0x10000) != 0)
	    class654_sub1_sub5_sub1_sub2.aBool12234
		= class534_sub40_sub1.method16563((byte) -5) == 1;
	if (0 != (i_0_ & 0x20000)) {
	    class654_sub1_sub5_sub1_sub2.aByte11928
		= class534_sub40_sub1.method16565(2030493459);
	    class654_sub1_sub5_sub1_sub2.aByte11962
		= class534_sub40_sub1.method16567((byte) -44);
	    class654_sub1_sub5_sub1_sub2.aByte11963
		= class534_sub40_sub1.method16565(-1502068108);
	    class654_sub1_sub5_sub1_sub2.aByte11964
		= (byte) class534_sub40_sub1.method16745(-891094135);
	    class654_sub1_sub5_sub1_sub2.anInt11959
		= (client.anInt11101
		   + class534_sub40_sub1.method16572((byte) 81)) * 1446706933;
	    class654_sub1_sub5_sub1_sub2.anInt11960
		= ((client.anInt11101
		    + class534_sub40_sub1.method16571(1832800986))
		   * -1565168329);
	}
	if ((i_0_ & 0x8) != 0) {
	    int[] is = new int[4];
	    for (int i_60_ = 0; i_60_ < 4; i_60_++)
		is[i_60_] = class534_sub40_sub1.method16550((byte) 23);
	    int i_61_ = class534_sub40_sub1.method16643(-2127811534);
	    Class200_Sub6.method15575(class654_sub1_sub5_sub1_sub2, is, i_61_,
				      false, (byte) -41);
	}
	if ((i_0_ & 0x100) != 0) {
	    String string = class534_sub40_sub1.method16541((byte) -72);
	    if (class654_sub1_sub5_sub1_sub2
		== Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419)
		Class272.method5067(2, 0,
				    class654_sub1_sub5_sub1_sub2
					.method18877(true, 1677589206),
				    class654_sub1_sub5_sub1_sub2
					.method18882(false, 1896505624),
				    class654_sub1_sub5_sub1_sub2.aString12228,
				    string, null, (byte) 5);
	    class654_sub1_sub5_sub1_sub2.method18875(string, 0, 0, 1822797324);
	}
	if ((i_0_ & 0x80) != 0) {
	    class654_sub1_sub5_sub1_sub2.anInt11943
		= class534_sub40_sub1.method16586((byte) 1) * -1191215595;
	    class654_sub1_sub5_sub1_sub2.anInt11945
		= class534_sub40_sub1.method16567((byte) 29) * 668624251;
	    class654_sub1_sub5_sub1_sub2.anInt11951
		= class534_sub40_sub1.method16567((byte) -22) * 97139519;
	    class654_sub1_sub5_sub1_sub2.anInt11976
		= class534_sub40_sub1.method16586((byte) 1) * 554036703;
	    class654_sub1_sub5_sub1_sub2.anInt11954
		= class534_sub40_sub1.method16586((byte) 1) * 16838697;
	    class654_sub1_sub5_sub1_sub2.anInt11955
		= class534_sub40_sub1.method16586((byte) 1) * -2088816671;
	    class654_sub1_sub5_sub1_sub2.anInt11956
		= (class534_sub40_sub1.method16572((byte) 122)
		   + client.anInt11101) * 395292927;
	    class654_sub1_sub5_sub1_sub2.anInt11957
		= (class534_sub40_sub1.method16573(-1982766353)
		   + client.anInt11101) * 1497408113;
	    class654_sub1_sub5_sub1_sub2.anInt11958
		= class534_sub40_sub1.method16529((byte) 1) * -914359499;
	    class654_sub1_sub5_sub1_sub2.anInt11980 = 990207207;
	    class654_sub1_sub5_sub1_sub2.anInt11937 = 0;
	    class654_sub1_sub5_sub1_sub2.anInt11943
		+= (class654_sub1_sub5_sub1_sub2.anIntArray11977[0]
		    * -1191215595);
	    class654_sub1_sub5_sub1_sub2.anInt11945
		+= class654_sub1_sub5_sub1_sub2.anIntArray11978[0] * 668624251;
	    class654_sub1_sub5_sub1_sub2.anInt11951
		+= class654_sub1_sub5_sub1_sub2.anIntArray11977[0] * 97139519;
	    class654_sub1_sub5_sub1_sub2.anInt11976
		+= class654_sub1_sub5_sub1_sub2.anIntArray11978[0] * 554036703;
	    class654_sub1_sub5_sub1_sub2.anInt11954
		+= class654_sub1_sub5_sub1_sub2.aByte10854 * 16838697;
	    class654_sub1_sub5_sub1_sub2.anInt11955
		+= class654_sub1_sub5_sub1_sub2.aByte10854 * -2088816671;
	}
    }
    
    Class47(Class30 class30) {
	aClass30_359 = class30;
	anInt360 = 922715841;
    }
    
    public void method1116(int i) {
	anInt360 = i * 922715841;
    }
    
    public void method1117(int i, short i_62_) {
	anInt360 = i * 922715841;
    }
    
    public Interface5 method1118(int i) {
	return anInterface5_361;
    }
    
    public int method1119() {
	return anInt360 * -673052351;
    }
    
    public static Class47[] method1120() {
	return (new Class47[]
		{ aClass47_351, aClass47_333, aClass47_334, aClass47_335,
		  aClass47_336, aClass47_352, aClass47_343, aClass47_339,
		  aClass47_340, aClass47_349, aClass47_342, aClass47_337,
		  aClass47_344, aClass47_345, aClass47_341, aClass47_347,
		  aClass47_348, aClass47_356, aClass47_350, aClass47_346,
		  aClass47_355, aClass47_353, aClass47_362, aClass47_338,
		  aClass47_332, aClass47_357, aClass47_358 });
    }
    
    public void method1121(Interface5 interface5, short i) {
	if (interface5.method51(-1190618436) != aClass30_359)
	    throw new IllegalArgumentException();
	anInterface5_361 = interface5;
    }
    
    public int method1122(int i) {
	return anInt360 * -673052351;
    }
    
    public void method1123(int i) {
	anInt360 = i * 922715841;
    }
    
    static final void method1124(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class207.anInt2239 * -560653853;
    }
    
    public Interface5 method1125() {
	return anInterface5_361;
    }
    
    public static Class47[] method1126(int i) {
	return (new Class47[]
		{ aClass47_351, aClass47_333, aClass47_334, aClass47_335,
		  aClass47_336, aClass47_352, aClass47_343, aClass47_339,
		  aClass47_340, aClass47_349, aClass47_342, aClass47_337,
		  aClass47_344, aClass47_345, aClass47_341, aClass47_347,
		  aClass47_348, aClass47_356, aClass47_350, aClass47_346,
		  aClass47_355, aClass47_353, aClass47_362, aClass47_338,
		  aClass47_332, aClass47_357, aClass47_358 });
    }
    
    static {
	aClass47_333 = new Class47(Class30.aClass30_271);
	aClass47_334 = new Class47(Class30.aClass30_271);
	aClass47_335 = new Class47(Class30.aClass30_271);
	aClass47_336 = new Class47(Class30.aClass30_271);
	aClass47_352 = new Class47(Class30.aClass30_271);
	aClass47_343 = new Class47(Class30.aClass30_271);
	aClass47_339 = new Class47(Class30.aClass30_269);
	aClass47_340 = new Class47(Class30.aClass30_269);
	aClass47_349 = new Class47(Class30.aClass30_269);
	aClass47_342 = new Class47(Class30.aClass30_269);
	aClass47_337 = new Class47(Class30.aClass30_269);
	aClass47_344 = new Class47(Class30.aClass30_269);
	aClass47_345 = new Class47(Class30.aClass30_269);
	aClass47_341 = new Class47(Class30.aClass30_269);
	aClass47_347 = new Class47(Class30.aClass30_269);
	aClass47_348 = new Class47(Class30.aClass30_269);
	aClass47_356 = new Class47(Class30.aClass30_269);
	aClass47_350 = new Class47(Class30.aClass30_269);
	aClass47_346 = new Class47(Class30.aClass30_269);
	aClass47_355 = new Class47(Class30.aClass30_269);
	aClass47_353 = new Class47(Class30.aClass30_269);
	aClass47_362 = new Class47(Class30.aClass30_268);
	aClass47_338 = new Class47(Class30.aClass30_269);
	aClass47_332 = new Class47(Class30.aClass30_269);
	aClass47_357 = new Class47(Class30.aClass30_269);
	aClass47_358 = new Class47(Class30.aClass30_270);
    }
    
    public static String method1127(String string, byte i) {
	int i_63_ = string.length();
	int i_64_ = 0;
	for (int i_65_ = 0; i_65_ < i_63_; i_65_++) {
	    char c = string.charAt(i_65_);
	    if ('<' == c || '>' == c)
		i_64_ += 3;
	}
	StringBuilder stringbuilder = new StringBuilder(i_63_ + i_64_);
	for (int i_66_ = 0; i_66_ < i_63_; i_66_++) {
	    char c = string.charAt(i_66_);
	    if ('<' == c)
		stringbuilder.append("<lt>");
	    else if (c == '>')
		stringbuilder.append("<gt>");
	    else
		stringbuilder.append(c);
	}
	return stringbuilder.toString();
    }
    
    public static int method1128(int i, int i_67_, int i_68_, int i_69_) {
	i_68_ &= 0x3;
	if (0 == i_68_)
	    return i_67_;
	if (1 == i_68_)
	    return 7 - i;
	if (i_68_ == 2)
	    return 7 - i_67_;
	return i;
    }
    
    public void method1129(Interface5 interface5) {
	if (interface5.method51(-764351488) != aClass30_359)
	    throw new IllegalArgumentException();
	anInterface5_361 = interface5;
    }
    
    static final void method1130(long l) {
	int i = 1196989073 * client.anInt11137;
	int i_70_ = client.anInt11138 * -823660049;
	if (Class588.anInt7808 * 1490134939 != i) {
	    int i_71_ = i - 1490134939 * Class588.anInt7808;
	    int i_72_ = (int) (l * (long) i_71_ / 320L);
	    if (i_71_ > 0) {
		if (i_72_ == 0)
		    i_72_ = 1;
		else if (i_72_ > i_71_)
		    i_72_ = i_71_;
	    } else if (0 == i_72_)
		i_72_ = -1;
	    else if (i_72_ < i_71_)
		i_72_ = i_71_;
	    Class588.anInt7808 += 441411219 * i_72_;
	}
	if (i_70_ != Class453.anInt4958 * -1293868227) {
	    int i_73_ = i_70_ - -1293868227 * Class453.anInt4958;
	    int i_74_ = (int) (l * (long) i_73_ / 320L);
	    if (i_73_ > 0) {
		if (i_74_ == 0)
		    i_74_ = 1;
		else if (i_74_ > i_73_)
		    i_74_ = i_73_;
	    } else if (i_74_ == 0)
		i_74_ = -1;
	    else if (i_74_ < i_73_)
		i_74_ = i_73_;
	    Class453.anInt4958 += -1703261163 * i_74_;
	}
	client.aFloat11140 += (float) l * client.aFloat11141 / 40.0F * 8.0F;
	client.aFloat11302 += client.aFloat11330 * (float) l / 40.0F * 8.0F;
	Class326.method5819(29181971);
    }
}
