/* Class690_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.net.MalformedURLException;
import java.net.URL;

public class Class690_Sub37 extends Class690
{
    public static final int anInt10951 = 4;
    public static final int anInt10952 = 3;
    public static final int anInt10953 = 2;
    public static final int anInt10954 = 1;
    public static final int anInt10955 = 0;
    
    int method14017(int i) {
	return 0;
    }
    
    public Class690_Sub37(int i, Class534_Sub35 class534_sub35) {
	super(i, class534_sub35);
    }
    
    public void method17191(byte i) {
	if (189295939 * anInt8753 < 0 || anInt8753 * 189295939 > 4)
	    anInt8753 = method14017(2141618268) * 1823770475;
    }
    
    int method14021() {
	return 0;
    }
    
    int method14026(int i, int i_0_) {
	return 1;
    }
    
    public Class690_Sub37(Class534_Sub35 class534_sub35) {
	super(class534_sub35);
    }
    
    public int method17192(int i) {
	return anInt8753 * 189295939;
    }
    
    void method14020(int i, int i_1_) {
	anInt8753 = i * 1823770475;
    }
    
    void method14025(int i) {
	anInt8753 = i * 1823770475;
    }
    
    int method14018() {
	return 0;
    }
    
    void method14024(int i) {
	anInt8753 = i * 1823770475;
    }
    
    int method14022() {
	return 0;
    }
    
    void method14023(int i) {
	anInt8753 = i * 1823770475;
    }
    
    int method14027(int i) {
	return 1;
    }
    
    int method14028(int i) {
	return 1;
    }
    
    int method14029(int i) {
	return 1;
    }
    
    int method14030(int i) {
	return 1;
    }
    
    public void method17193() {
	if (189295939 * anInt8753 < 0 || anInt8753 * 189295939 > 4)
	    anInt8753 = method14017(2099128554) * 1823770475;
    }
    
    public static final void method17194
	(Class247[] class247s, int i, int i_2_, int i_3_, int i_4_, int i_5_,
	 int i_6_, int i_7_, int i_8_, boolean bool, int i_9_) {
	Class254.aClass185_2683.method3373(i_2_, i_3_, i_4_, i_5_);
	for (int i_10_ = 0; i_10_ < class247s.length; i_10_++) {
	    Class247 class247 = class247s[i_10_];
	    if (class247 != null
		&& (i == class247.anInt2472 * -742015869
		    || (-1412584499 == i
			&& client.aClass247_11044 == class247))) {
		int i_11_;
		if (i_8_ == -1) {
		    client.aRectangleArray11285
			[client.anInt11249 * 1372795039].setBounds
			(-1196182029 * class247.anInt2466 + i_6_,
			 class247.anInt2467 * -612037017 + i_7_,
			 class247.anInt2468 * -881188269,
			 class247.anInt2469 * -1279656873);
		    i_11_ = (client.anInt11249 += 799140703) * 1372795039 - 1;
		} else
		    i_11_ = i_8_;
		class247.anInt2631 = -182601423 * i_11_;
		class247.anInt2632 = 476982323 * client.anInt11101;
		if (!client.method17394(class247)) {
		    if (0 != 1231845787 * class247.anInt2457)
			Class690_Sub8.method16957(class247, (byte) -120);
		    int i_12_ = -1196182029 * class247.anInt2466 + i_6_;
		    int i_13_ = class247.anInt2467 * -612037017 + i_7_;
		    int i_14_ = class247.anInt2484 * 1943720095;
		    if (client.aBool11087
			&& ((client.method17392(class247).anInt10574
			     * 1837782131) != 0
			    || -1960530827 * class247.anInt2438 == 0)
			&& i_14_ > 127)
			i_14_ = 127;
		    if (client.aClass247_11044 == class247) {
			if (-1412584499 != i
			    && ((class247.anInt2566 * -712285239
				 == 1319143699 * Class247.anInt2455)
				|| (class247.anInt2566 * -712285239
				    == 1098206671 * Class247.anInt2578)
				|| (client.method17392(class247)
					.method16268(1543068295)
				    && (2113390179 * Class247.anInt2429
					!= (class247.anInt2566
					    * -712285239))))) {
			    Class520.aClass247Array7063 = class247s;
			    Class77.anInt818 = 803767343 * i_6_;
			    Class69.anInt729 = i_7_ * -831277231;
			    continue;
			}
			if (client.aBool11247 && client.aBool11103) {
			    int i_15_ = Class81.aClass563_834
					    .method9493(-1863383692);
			    int i_16_
				= Class81.aClass563_834.method9477(1789979121);
			    i_15_ -= -1626933515 * client.anInt11131;
			    i_16_ -= client.anInt11035 * 1953389231;
			    if (i_15_ < client.anInt11236 * -169004095)
				i_15_ = -169004095 * client.anInt11236;
			    if (-881188269 * class247.anInt2468 + i_15_
				> (client.anInt11236 * -169004095
				   + -1152577469 * client.anInt11239))
				i_15_ = (client.anInt11236 * -169004095
					 + -1152577469 * client.anInt11239
					 - class247.anInt2468 * -881188269);
			    if (i_16_ < client.anInt11158 * -171218513)
				i_16_ = client.anInt11158 * -171218513;
			    if (i_16_ + -1279656873 * class247.anInt2469
				> (1976194639 * client.anInt11243
				   + -171218513 * client.anInt11158))
				i_16_ = (client.anInt11243 * 1976194639
					 + -171218513 * client.anInt11158
					 - class247.anInt2469 * -1279656873);
			    if (client.method17392(class247)
				    .method16268(413372438))
				Class316.method5724(i_15_, i_16_,
						    (class247.anInt2468
						     * -881188269),
						    (class247.anInt2469
						     * -1279656873),
						    (byte) 1);
			    if (2113390179 * Class247.anInt2429
				!= class247.anInt2566 * -712285239) {
				i_12_ = i_15_;
				i_13_ = i_16_;
			    }
			}
			if (1098206671 * Class247.anInt2578
			    == class247.anInt2566 * -712285239)
			    i_14_ = 128;
		    }
		    int i_17_;
		    int i_18_;
		    int i_19_;
		    int i_20_;
		    if (class247.anInt2438 * -1960530827 == 2) {
			i_17_ = i_2_;
			i_18_ = i_3_;
			i_19_ = i_4_;
			i_20_ = i_5_;
		    } else {
			int i_21_ = i_12_ + -881188269 * class247.anInt2468;
			int i_22_ = class247.anInt2469 * -1279656873 + i_13_;
			if (-1960530827 * class247.anInt2438 == 9) {
			    i_21_++;
			    i_22_++;
			}
			i_17_ = i_12_ > i_2_ ? i_12_ : i_2_;
			i_18_ = i_13_ > i_3_ ? i_13_ : i_3_;
			i_19_ = i_21_ < i_4_ ? i_21_ : i_4_;
			i_20_ = i_22_ < i_5_ ? i_22_ : i_5_;
		    }
		    if (i_17_ < i_19_ && i_18_ < i_20_) {
			if (0 != class247.anInt2457 * 1231845787) {
			    if ((class247.anInt2457 * 1231845787
				 == -24082201 * Class247.anInt2599)
				|| (1231845787 * class247.anInt2457
				    == -28714589 * Class247.anInt2432)) {
				if (client.aBool11232) {
				    Class254.aClass185_2683.method3581();
				    Class617.method10235
					(i_12_, i_13_,
					 -881188269 * class247.anInt2468,
					 class247.anInt2469 * -1279656873,
					 (-28714589 * Class247.anInt2432
					  == 1231845787 * class247.anInt2457),
					 1384464791);
				    Class289.method5281(i_11_, i_17_, i_18_,
							i_19_, i_20_, i_12_,
							i_13_, (byte) 7);
				    Class254.aClass185_2683.method3281();
				    Class254.aClass185_2683
					.method3373(i_2_, i_3_, i_4_, i_5_);
				    client.aBoolArray11180[i_11_] = true;
				}
				continue;
			    }
			    if ((class247.anInt2457 * 1231845787
				 == Class247.anInt2433 * -387004955)
				&& 1 == -1468443459 * client.anInt11155) {
				if (5 != -1960530827 * class247.anInt2438
				    || (class247.method4525((Class254
							     .aClass185_2683),
							    447549967)
					!= null)) {
				    Class200_Sub21.method15638
					(Class254.aClass185_2683, class247,
					 i_12_, i_13_, -788885885);
				    Class254.aClass185_2683
					.method3373(i_2_, i_3_, i_4_, i_5_);
				}
				continue;
			    }
			    if (94559621 * Class247.anInt2540
				== class247.anInt2457 * 1231845787) {
				Class215.method4109(Class254.aClass185_2683,
						    i_12_, i_13_, class247,
						    (short) -9975);
				continue;
			    }
			    if (Class247.anInt2452 * 1478916581
				== 1231845787 * class247.anInt2457) {
				Class242.method4466(Class254.aClass185_2683,
						    i_12_, i_13_, class247,
						    (290091559
						     * class247.anInt2482
						     % 64),
						    851825197);
				continue;
			    }
			    if (1231845787 * class247.anInt2457
				== 1576053415 * Class247.anInt2434) {
				if (class247.method4525((Class254
							 .aClass185_2683),
							447549967)
				    != null) {
				    Class254.aClass185_2683.method3581();
				    Class162.method2641(class247, i_12_, i_13_,
							-234785209);
				    Class254.aClass185_2683
					.method3373(i_2_, i_3_, i_4_, i_5_);
				}
				continue;
			    }
			    if (-718771705 * Class247.anInt2435
				== 1231845787 * class247.anInt2457) {
				Class574.method9739(Class254.aClass185_2683,
						    i_12_, i_13_,
						    (-881188269
						     * class247.anInt2468),
						    (class247.anInt2469
						     * -1279656873),
						    (byte) 43);
				client.aBoolArray11180[i_11_] = true;
				Class254.aClass185_2683.method3373(i_2_, i_3_,
								   i_4_, i_5_);
				continue;
			    }
			    if (Class247.anInt2436 * 627941839
				== 1231845787 * class247.anInt2457) {
				Class546.method8991(Class254.aClass185_2683,
						    i_12_, i_13_,
						    (class247.anInt2468
						     * -881188269),
						    (-1279656873
						     * class247.anInt2469),
						    1933408439);
				client.aBoolArray11180[i_11_] = true;
				Class254.aClass185_2683.method3373(i_2_, i_3_,
								   i_4_, i_5_);
				continue;
			    }
			    if (Class247.anInt2628 * -1022419033
				== 1231845787 * class247.anInt2457) {
				if (client.aBool11262 || client.aBool11051) {
				    Class375.method6414(i_12_, i_13_, class247,
							(byte) -40);
				    client.aBoolArray11180[i_11_] = true;
				}
				continue;
			    }
			    if (Class247.anInt2426 * -1927636305
				== 1231845787 * class247.anInt2457) {
				Class163 class163
				    = Class660.method10949(-2029047086);
				if (class163 != null) {
				    int i_23_ = i_4_ - i_2_;
				    int i_24_ = i_5_ - i_3_;
				    float f = (float) i_23_ / (float) i_24_;
				    float f_25_
					= ((float) class163.method2647()
					   / (float) class163.method2649());
				    int i_26_;
				    int i_27_;
				    if (f < f_25_) {
					i_26_ = i_23_;
					i_27_ = (int) ((float) i_23_ / f_25_);
				    } else {
					i_26_ = (int) (f_25_ * (float) i_24_);
					i_27_ = i_24_;
				    }
				    int i_28_ = i_2_ + (i_23_ - i_26_) / 2;
				    int i_29_ = (i_24_ - i_27_) / 2 + i_3_;
				    class163.method2659(i_28_, i_29_, i_26_,
							i_27_);
				}
				continue;
			    }
			    if (class247.anInt2457 * 1231845787
				== Class247.anInt2612 * 1835705285) {
				if (Class228.method4188(-1501288938)
				    && Class302.method5570((byte) 91))
				    Class672.method11091(i_2_, i_3_, i_4_,
							 i_5_, 700921764);
				continue;
			    }
			}
			if (0 == -1960530827 * class247.anInt2438) {
			    if (1231845787 * class247.anInt2457
				== -593375903 * Class247.anInt2439) {
				Class254.aClass185_2683.method3581();
				client.aClass512_11100.method8501
				    ((byte) -54).method10152
				    (client.aClass512_11100, 2147292908);
				Class254.aClass185_2683.method3350
				    (i_12_, i_13_,
				     Class706_Sub4.anInt10994 * 1771907305,
				     -1091172141 * Class18.anInt205);
			    }
			    method17194(class247s,
					class247.anInt2454 * -1278450723,
					i_17_, i_18_, i_19_, i_20_,
					(i_12_
					 - class247.anInt2478 * -488164841),
					(i_13_
					 - 2142374941 * class247.anInt2479),
					i_11_, bool, 1742539394);
			    if (class247.aClass247Array2621 != null)
				method17194(class247.aClass247Array2621,
					    class247.anInt2454 * -1278450723,
					    i_17_, i_18_, i_19_, i_20_,
					    i_12_ - (-488164841
						     * class247.anInt2478),
					    i_13_ - (2142374941
						     * class247.anInt2479),
					    i_11_, bool, -1398299637);
			    Class534_Sub37 class534_sub37
				= ((Class534_Sub37)
				   (client.aClass9_11224.method579
				    ((long) (-1278450723
					     * class247.anInt2454))));
			    if (class534_sub37 != null)
				Class705.method14231
				    (class534_sub37.anInt10803 * 1225863589,
				     i_17_, i_18_, i_19_, i_20_,
				     i_12_ - -488164841 * class247.anInt2478,
				     i_13_ - class247.anInt2479 * 2142374941,
				     i_11_, -104362242);
			    if (Class247.anInt2439 * -593375903
				== 1231845787 * class247.anInt2457) {
				if (Class254.aClass185_2683.method3352()) {
				    Class254.aClass185_2683.method3351
					(class247.anInt2468 * -881188269,
					 class247.anInt2469 * -1279656873);
				    if (16 == client.anInt11039 * -1850530127)
					Class223.method4160
					    (i_12_, i_13_,
					     -881188269 * class247.anInt2468,
					     class247.anInt2469 * -1279656873,
					     (byte) -54);
				}
				if (3 == -1468443459 * client.anInt11155) {
				    int i_30_ = client.anInt11166 * 436142635;
				    int i_31_ = client.anInt11116 * 2087079589;
				    int i_32_ = 849699371 * client.anInt11187;
				    int i_33_ = client.anInt11118 * 163760341;
				    if (client.anInt11101
					< client.anInt11114 * 691235653) {
					float f
					    = ((float) (client.anInt11101
							- (1433220121
							   * (client
							      .anInt11238)))
					       * 1.0F
					       / (float) ((client.anInt11114
							   * 691235653)
							  - (client.anInt11238
							     * 1433220121)));
					i_30_
					    = (int) (((float) (-946888063
							       * (Class690_Sub36
								  .anInt10950))
						      * (1.0F - f))
						     + ((float) ((client
								  .anInt11166)
								 * 436142635)
							* f));
					i_31_
					    = (int) ((float) (client.anInt11116
							      * 2087079589) * f
						     + ((1.0F - f)
							* (float) (224715311
								   * (Class482
								      .anInt5270))));
					i_32_
					    = (int) (((float) (849699371
							       * (client
								  .anInt11187))
						      * f)
						     + ((1.0F - f)
							* (float) ((Class383
								    .anInt3943)
								   * -1967749899)));
					i_33_
					    = (int) (f * (float) ((client
								   .anInt11118)
								  * 163760341)
						     + ((float) ((Class396
								  .anInt4107)
								 * 1339734199)
							* (1.0F - f)));
				    }
				    if (i_30_ > 0)
					Class254.aClass185_2683.method3292
					    (i_17_, i_18_, i_19_ - i_17_,
					     i_20_ - i_18_,
					     (i_30_ << 24 | i_31_ << 16
					      | i_32_ << 8 | i_33_),
					     -1627350344);
				}
			    }
			    Class254.aClass185_2683.method3373(i_2_, i_3_,
							       i_4_, i_5_);
			}
			if (client.aBoolArray11214[i_11_]
			    || client.anInt11325 * 683407653 > 1) {
			    if (3 == class247.anInt2438 * -1960530827) {
				if (i_14_ == 0) {
				    if (class247.aBool2447)
					Class254.aClass185_2683.method3298
					    (i_12_, i_13_,
					     -881188269 * class247.anInt2468,
					     class247.anInt2469 * -1279656873,
					     (~0xffffff
					      | (290091559
						 * class247.anInt2482)),
					     0);
				    else
					Class254.aClass185_2683.method3297
					    (i_12_, i_13_,
					     class247.anInt2468 * -881188269,
					     class247.anInt2469 * -1279656873,
					     (~0xffffff
					      | (290091559
						 * class247.anInt2482)),
					     0);
				} else if (class247.aBool2447)
				    Class254.aClass185_2683.method3298
					(i_12_, i_13_,
					 -881188269 * class247.anInt2468,
					 -1279656873 * class247.anInt2469,
					 (255 - (i_14_ & 0xff) << 24
					  | (290091559 * class247.anInt2482
					     & 0xffffff)),
					 1);
				else
				    Class254.aClass185_2683.method3297
					(i_12_, i_13_,
					 class247.anInt2468 * -881188269,
					 -1279656873 * class247.anInt2469,
					 (255 - (i_14_ & 0xff) << 24
					  | (class247.anInt2482 * 290091559
					     & 0xffffff)),
					 1);
			    } else if (4 == class247.anInt2438 * -1960530827) {
				int i_34_ = 255 - (i_14_ & 0xff);
				if (i_34_ != 0) {
				    Class171 class171
					= (class247.method4555
					   (Class351.aClass406_3620,
					    client.anInterface52_11081,
					    (byte) -29));
				    if (null == class171) {
					if (Class247.aBool2451)
					    Class454.method7416(class247,
								-1205827089);
				    } else {
					int i_35_
					    = 290091559 * class247.anInt2482;
					String string = class247.aString2533;
					if (-1 != (403396513
						   * class247.anInt2606)) {
					    Class15 class15
						= ((Class15)
						   (Class531
							.aClass44_Sub7_7135
							.method91
						    ((403396513
						      * class247.anInt2606),
						     -308739237)));
					    string = class15.aString122;
					    if (string == null)
						string = "null";
					    if (((class15.anInt174 * 1113844363
						  == 1)
						 || 1 != (class247.anInt2602
							  * -148110895))
						&& (class247.anInt2602
						    * -148110895) != -1)
						string
						    = new StringBuilder()
							  .append
							  (Class154.method2575
							   (16748608,
							    -969775927))
							  .append
							  (string).append
							  (Class29.aString262)
							  .append
							  (" x").append
							  (Class6.method565
							   ((class247.anInt2602
							     * -148110895),
							    -501887921))
							  .toString();
					}
					if (class247
					    == client.aClass247_11119) {
					    string = (Class58.aClass58_565
							  .method1245
						      (Class539.aClass672_7171,
						       (byte) -9));
					    i_35_ = (class247.anInt2482
						     * 290091559);
					}
					if (client.aBool11112)
					    Class254.aClass185_2683.method3282
						(i_12_, i_13_,
						 i_12_ + (class247.anInt2468
							  * -881188269),
						 ((-1279656873
						   * class247.anInt2469)
						  + i_13_));
					i_34_ <<= 24;
					if (class247.aBool2539)
					    class171.method2836
						(string, i_12_, i_13_,
						 (-881188269
						  * class247.anInt2468),
						 (-1279656873
						  * class247.anInt2469),
						 i_34_ | i_35_,
						 (class247.aBool2537 ? i_34_
						  : -1),
						 (-1049814117
						  * class247.anInt2535),
						 (183230983
						  * class247.anInt2534),
						 client.aRandom11178,
						 Class709.anInt8857,
						 client.anIntArray11287,
						 Class658.aClass163Array8541,
						 null, (byte) 8);
					else
					    class171.method2861
						(string, i_12_, i_13_,
						 (-881188269
						  * class247.anInt2468),
						 (-1279656873
						  * class247.anInt2469),
						 i_34_ | i_35_,
						 (class247.aBool2537 ? i_34_
						  : -1),
						 (-1049814117
						  * class247.anInt2535),
						 (class247.anInt2534
						  * 183230983),
						 (class247.anInt2528
						  * -1959194819),
						 (class247.anInt2538
						  * 741572507),
						 Class658.aClass163Array8541,
						 null, null, 0, 0, (byte) -93);
					if (client.aBool11112)
					    Class254.aClass185_2683.method3373
						(i_2_, i_3_, i_4_, i_5_);
				    }
				}
			    } else if (5 == -1960530827 * class247.anInt2438) {
				if (class247.anInt2611 * -1980976335 >= 0)
				    class247.method4521
					(Class184.aClass44_Sub6_1988,
					 Class492.aClass44_Sub10_5341, 65535)
					.method8347
					(Class254.aClass185_2683, 0, i_12_,
					 i_13_,
					 class247.anInt2468 * -881188269,
					 class247.anInt2469 * -1279656873,
					 class247.anInt2583 * -461629 << 3,
					 -976080175 * class247.anInt2613 << 3,
					 0, 0, 1850894037);
				else {
				    Class163 class163;
				    if (class247.anInt2606 * 403396513 != -1) {
					Class631 class631
					    = (class247.aBool2610
					       ? (Class322
						  .aClass654_Sub1_Sub5_Sub1_Sub2_3419
						  .aClass631_12226)
					       : null);
					class163
					    = (Class531.aClass44_Sub7_7135
						   .method17306
					       (Class254.aClass185_2683,
						403396513 * class247.anInt2606,
						(-148110895
						 * class247.anInt2602),
						973326593 * class247.anInt2490,
						(~0xffffff
						 | (2071487835
						    * class247.anInt2587)),
						(class247.anInt2513
						 * 1245616333),
						class631, -878424575));
				    } else if (class247.anInt2441 * -154373687
					       != -1) {
					class163
					    = ((Class163)
					       (client.aClass203_11336
						    .method3871
						((long) (-154373687
							 * (class247
							    .anInt2441)))));
					if (null == class163
					    && !(client.aMap11186.containsKey
						 (Integer.valueOf
						  (class247.anInt2441
						   * -154373687)))) {
					    try {
						client.aMap11186.put
						    ((Integer.valueOf
						      (-154373687
						       * class247.anInt2441)),
						     (Class480
							  .aClass63_5263
							  .method1270
						      ((new URL
							(new StringBuilder
							     ().append
							     (client
							      .aString11031)
							     .append
							     ("/img/image_")
							     .append
							     ((class247
							       .anInt2441)
							      * -154373687)
							     .append
							     (".png?a=").append
							     (Class250
								  .method4604
							      ((byte) -17))
							     .toString())),
						       -2079565072)));
					    } catch (MalformedURLException malformedurlexception) {
						Class262.method4824
						    (null,
						     malformedurlexception,
						     (byte) -46);
					    }
					}
				    } else
					class163 = (class247.method4516
						    (Class254.aClass185_2683,
						     -1190300820));
				    if (class163 != null) {
					int i_36_ = class163.method22();
					int i_37_ = class163.method2692();
					int i_38_ = 255 - (i_14_ & 0xff);
					if (i_38_ != 0) {
					    int i_39_;
					    if (290091559 * class247.anInt2482
						== -1)
						i_39_ = 16777215;
					    else {
						i_39_
						    = (class247.anInt2482
						       * 290091559) & 0xffffff;
						if (0 == i_39_)
						    i_39_ = 16777215;
					    }
					    i_39_ |= i_38_ << 24;
					    boolean bool_40_ = -1 != i_39_;
					    if (class247.aBool2489) {
						Class254.aClass185_2683
						    .method3282
						    (i_12_, i_13_,
						     (i_12_
						      + (class247.anInt2468
							 * -881188269)),
						     (class247.anInt2469
						      * -1279656873) + i_13_);
						if (0 != (1994134509
							  * (class247
							     .anInt2488))) {
						    int i_41_
							= ((i_36_ - 1
							    + (-881188269
							       * (class247
								  .anInt2468)))
							   / i_36_);
						    int i_42_
							= (((-1279656873
							     * (class247
								.anInt2469))
							    + (i_37_ - 1))
							   / i_37_);
						    for (int i_43_ = 0;
							 i_43_ < i_41_;
							 i_43_++) {
							for (int i_44_ = 0;
							     i_44_ < i_42_;
							     i_44_++) {
							    if (bool_40_)
								class163
								    .method2666
								    ((((float) i_36_
								       / 2.0F)
								      + (float) (i_43_ * i_36_ + i_12_)),
								     ((float) (i_13_
									       + i_44_ * i_37_)
								      + ((float) i_37_
									 / 2.0F)),
								     4096,
								     (1994134509
								      * (class247
									 .anInt2488)),
								     0, i_39_,
								     1);
							    else
								class163
								    .method2665
								    (((float) (i_36_ * i_43_
									       + i_12_)
								      + ((float) i_36_
									 / 2.0F)),
								     ((float) (i_13_
									       + i_44_ * i_37_)
								      + ((float) i_37_
									 / 2.0F)),
								     4096,
								     (1994134509
								      * (class247
									 .anInt2488)));
							}
						    }
						} else if (bool_40_)
						    class163.method2663
							(i_12_, i_13_,
							 (-881188269
							  * (class247
							     .anInt2468)),
							 (class247.anInt2469
							  * -1279656873),
							 0, i_39_, 1);
						else
						    class163.method2662
							(i_12_, i_13_,
							 (-881188269
							  * (class247
							     .anInt2468)),
							 (class247.anInt2469
							  * -1279656873));
						Class254.aClass185_2683
						    .method3373
						    (i_2_, i_3_, i_4_, i_5_);
					    } else if (bool_40_) {
						if (0
						    != (1994134509
							* class247.anInt2488))
						    class163.method2666
							((((float) (-881188269
								    * (class247
								       .anInt2468))
							   / 2.0F)
							  + (float) i_12_),
							 (((float) ((class247
								     .anInt2469)
								    * -1279656873)
							   / 2.0F)
							  + (float) i_13_),
							 (-1574621184
							  * class247.anInt2468
							  / i_36_),
							 (1994134509
							  * (class247
							     .anInt2488)),
							 0, i_39_, 1);
						else if ((i_36_
							  != ((class247
							       .anInt2468)
							      * -881188269))
							 || (((class247
							       .anInt2469)
							      * -1279656873)
							     != i_37_))
						    class163.method2660
							(i_12_, i_13_,
							 (-881188269
							  * (class247
							     .anInt2468)),
							 (-1279656873
							  * (class247
							     .anInt2469)),
							 0, i_39_, 1);
						else
						    class163.method2657(i_12_,
									i_13_,
									0,
									i_39_,
									1);
					    } else if ((1994134509
							* class247.anInt2488)
						       != 0)
						class163.method2667
						    (((float) ((class247
								.anInt2468)
							       * -881188269)
						      / 2.0F) + (float) i_12_,
						     ((float) (-1279656873
							       * (class247
								  .anInt2469))
						      / 2.0F) + (float) i_13_,
						     (float) i_36_ / 2.0F,
						     (float) i_37_ / 2.0F,
						     (-1574621184
						      * class247.anInt2468
						      / i_36_),
						     (-1614450688
						      * class247.anInt2469
						      / i_37_),
						     (1994134509
						      * class247.anInt2488),
						     1, -1, 1);
					    else if ((class247.anInt2468
						      * -881188269) != i_36_
						     || ((-1279656873
							  * class247.anInt2469)
							 != i_37_))
						class163.method2659
						    (i_12_, i_13_,
						     (class247.anInt2468
						      * -881188269),
						     (-1279656873
						      * class247.anInt2469));
					    else
						class163.method2656(i_12_,
								    i_13_);
					}
				    } else if (Class247.aBool2451)
					Class454.method7416(class247,
							    -760493715);
				}
			    } else if (6 == class247.anInt2438 * -1960530827) {
				Class254.aClass185_2683.method3581();
				Class183 class183 = null;
				int i_45_ = 2048;
				if (-626632091 * class247.anInt2521 != 0)
				    i_45_ |= 0x80000;
				int i_46_ = 0;
				if (403396513 * class247.anInt2606 != -1) {
				    Class15 class15
					= ((Class15)
					   (Class531.aClass44_Sub7_7135
						.method91
					    (403396513 * class247.anInt2606,
					     976439915)));
				    if (class15 != null) {
					class15 = (class15.method675
						   ((-148110895
						     * class247.anInt2602),
						    (byte) -26));
					class183
					    = (class15.method689
					       (Class254.aClass185_2683, i_45_,
						1,
						(class247.aBool2610
						 ? (Class322
						    .aClass654_Sub1_Sub5_Sub1_Sub2_3419
						    .aClass631_12226)
						 : null),
						class247.aClass711_2442, 0, 0,
						0, 0, 750184811));
					if (null != class183)
					    i_46_
						= -class183.method3045() >> 1;
					else
					    Class454.method7416(class247,
								-866556848);
				    }
				} else if (3 == (class247.anInt2496
						 * -1866862435)) {
				    int i_47_ = class247.anInt2497 * 939166901;
				    if (i_47_ >= 0 && i_47_ < 2048) {
					Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
					    = (client
					       .aClass654_Sub1_Sub5_Sub1_Sub2Array11279
					       [i_47_]);
					if ((null
					     != class654_sub1_sub5_sub1_sub2)
					    && ((-643758853 * client.anInt11037
						 == i_47_)
						|| ((Class511.method8410
						     ((class654_sub1_sub5_sub1_sub2
						       .aString12211),
						      1597755020))
						    == (27898029
							* (class247
							   .anInt2550))))) {
					    class183
						= (class247.method4519
						   (Class254.aClass185_2683,
						    i_45_,
						    (Class200_Sub23
						     .aClass44_Sub14_10041),
						    (Class307
						     .aClass44_Sub15_3349),
						    (Class578
						     .aClass44_Sub3_7743),
						    (Class531
						     .aClass44_Sub7_7135),
						    (Class200_Sub12
						     .aClass44_Sub1_9934),
						    Class78.aClass103_825,
						    Class78.aClass103_825,
						    class247.aClass711_2442,
						    (class654_sub1_sub5_sub1_sub2
						     .aClass631_12226),
						    -557821294));
					    if (class183 == null
						&& Class247.aBool2451)
						Class454.method7416
						    (class247, -514610023);
					}
				    }
				} else if (5 == (-1866862435
						 * class247.anInt2496)) {
				    int i_48_ = 939166901 * class247.anInt2497;
				    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
					= null;
				    boolean bool_49_ = false;
				    if (i_48_ >= 0 && i_48_ < 2048) {
					class654_sub1_sub5_sub1_sub2
					    = (client
					       .aClass654_Sub1_Sub5_Sub1_Sub2Array11279
					       [i_48_]);
					bool_49_
					    = ((null
						!= class654_sub1_sub5_sub1_sub2)
					       && ((client.anInt11037
						    * -643758853) == i_48_
						   || ((Class511.method8410
							((class654_sub1_sub5_sub1_sub2
							  .aString12211),
							 1747595877))
						       == (class247.anInt2550
							   * 27898029))));
				    } else if (-1 == i_48_) {
					bool_49_ = true;
					class654_sub1_sub5_sub1_sub2
					    = (Class322
					       .aClass654_Sub1_Sub5_Sub1_Sub2_3419);
				    } else {
					Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2_50_
					    = ((Class654_Sub1_Sub5_Sub1_Sub2)
					       (client.aMap11191.get
						(Integer.valueOf(i_48_))));
					if ((null
					     != class654_sub1_sub5_sub1_sub2_50_)
					    && (i_48_
						== ((class654_sub1_sub5_sub1_sub2_50_
						     .anInt11922)
						    * 1126388985))) {
					    bool_49_ = true;
					    class654_sub1_sub5_sub1_sub2
						= class654_sub1_sub5_sub1_sub2_50_;
					}
				    }
				    if (bool_49_
					&& class654_sub1_sub5_sub1_sub2 != null
					&& (class654_sub1_sub5_sub1_sub2
					    .aClass631_12226) != null)
					class183
					    = (class654_sub1_sub5_sub1_sub2
						   .aClass631_12226.method10434
					       (Class254.aClass185_2683, i_45_,
						(Class200_Sub23
						 .aClass44_Sub14_10041),
						Class307.aClass44_Sub15_3349,
						Class578.aClass44_Sub3_7743,
						Class531.aClass44_Sub7_7135,
						Class78.aClass103_825,
						Class78.aClass103_825,
						class247.aClass711_2442, null,
						null, null, 0, true,
						Class69.aClass630_728,
						-2145708161));
				} else if (8 == (-1866862435
						 * class247.anInt2496)
					   || (-1866862435 * class247.anInt2496
					       == 9)) {
				    Class534_Sub5 class534_sub5
					= Class269.method5023((939166901
							       * (class247
								  .anInt2497)),
							      false,
							      (byte) -68);
				    if (class534_sub5 != null)
					class183
					    = (class534_sub5.method16041
					       (Class254.aClass185_2683, i_45_,
						class247.aClass711_2442,
						class247.anInt2550 * 27898029,
						9 == (-1866862435
						      * class247.anInt2496),
						(class247.aBool2610
						 ? (Class322
						    .aClass654_Sub1_Sub5_Sub1_Sub2_3419
						    .aClass631_12226)
						 : null),
						1446129734));
				} else if (class247.aClass711_2442 == null
					   || !class247.aClass711_2442
						   .method14338((byte) 0)) {
				    class183
					= (class247.method4519
					   (Class254.aClass185_2683, i_45_,
					    (Class200_Sub23
					     .aClass44_Sub14_10041),
					    Class307.aClass44_Sub15_3349,
					    Class578.aClass44_Sub3_7743,
					    Class531.aClass44_Sub7_7135,
					    Class200_Sub12.aClass44_Sub1_9934,
					    Class78.aClass103_825,
					    Class78.aClass103_825, null,
					    (Class322
					     .aClass654_Sub1_Sub5_Sub1_Sub2_3419
					     .aClass631_12226),
					    743668233));
				    if (class183 == null && Class247.aBool2451)
					Class454.method7416(class247,
							    -1231886488);
				} else {
				    class183
					= (class247.method4519
					   (Class254.aClass185_2683, i_45_,
					    (Class200_Sub23
					     .aClass44_Sub14_10041),
					    Class307.aClass44_Sub15_3349,
					    Class578.aClass44_Sub3_7743,
					    Class531.aClass44_Sub7_7135,
					    Class200_Sub12.aClass44_Sub1_9934,
					    Class78.aClass103_825,
					    Class78.aClass103_825,
					    class247.aClass711_2442,
					    (Class322
					     .aClass654_Sub1_Sub5_Sub1_Sub2_3419
					     .aClass631_12226),
					    920588386));
				    if (null == class183 && Class247.aBool2451)
					Class454.method7416(class247,
							    -862131280);
				}
				if (null != class183) {
				    if (class247.anInt2521 * -626632091 != 0)
					class183.method3058
					    (-2009238791 * class247.anInt2518,
					     292475331 * class247.anInt2573,
					     class247.anInt2520 * -1130667895,
					     class247.anInt2521 * -626632091);
				    int i_51_;
				    if (class247.anInt2594 * -1843491229 > 0)
					i_51_
					    = ((class247.anInt2468 * -881188269
						<< 9)
					       / (class247.anInt2594
						  * -1843491229));
				    else
					i_51_ = 512;
				    int i_52_;
				    if (class247.anInt2510 * 1477650141 > 0)
					i_52_ = (((class247.anInt2469
						   * -1279656873)
						  << 9)
						 / (1477650141
						    * class247.anInt2510));
				    else
					i_52_ = 512;
				    int i_53_ = i_12_ + (class247.anInt2468
							 * -881188269 / 2);
				    int i_54_
					= (class247.anInt2469 * -1279656873 / 2
					   + i_13_);
				    if (!class247.aBool2499) {
					i_53_ += (-1399895567
						  * class247.anInt2586
						  * i_51_) >> 9;
					i_54_ += i_52_ * (class247.anInt2506
							  * -1446592235) >> 9;
				    }
				    client.aClass446_11041.method7254();
				    Class254.aClass185_2683
					.method3335(client.aClass446_11041);
				    Class433 class433
					= Class254.aClass185_2683.method3518();
				    int i_55_ = client.aClass512_11100
						    .method8443(-740100626);
				    int i_56_ = client.aClass512_11100
						    .method8456((byte) -46);
				    i_56_ += class247.anInt2508 * -1230478387;
				    if (class247.aBool2525) {
					if (-891094135 * Class10.anInt75
					    == 3) {
					    if (class247.aBool2499)
						class433.method6951
						    ((float) i_53_,
						     (float) i_54_,
						     (float) i_51_,
						     (float) i_52_,
						     (Class599
							  .aClass298_Sub1_7871
							  .method5397
						      (1204311235)),
						     (Class599
							  .aClass298_Sub1_7871
							  .method5398
						      (1396693233)),
						     (float) ((Class706_Sub4
							       .anInt10994)
							      * 1771907305),
						     (float) (-1091172141
							      * (Class18
								 .anInt205)),
						     (float) ((class247
							       .anInt2508)
							      * -1230478387));
					    else
						class433.method6951
						    ((float) i_53_,
						     (float) i_54_,
						     (float) i_51_,
						     (float) i_52_,
						     (Class599
							  .aClass298_Sub1_7871
							  .method5397
						      (1204311235)),
						     (Class599
							  .aClass298_Sub1_7871
							  .method5398
						      (1396693233)),
						     (float) (1771907305
							      * (Class706_Sub4
								 .anInt10994)),
						     (float) (Class18.anInt205
							      * -1091172141),
						     (float) (((class247
								.anInt2508)
							       * -1230478387)
							      << 2));
					} else if (class247.aBool2499)
					    class433.method6951
						((float) i_53_, (float) i_54_,
						 (float) i_51_, (float) i_52_,
						 (float) i_55_, (float) i_56_,
						 (float) ((Class706_Sub4
							   .anInt10994)
							  * 1771907305),
						 (float) (Class18.anInt205
							  * -1091172141),
						 (float) (class247.anInt2508
							  * -1230478387));
					else
					    class433.method6951
						((float) i_53_, (float) i_54_,
						 (float) i_51_, (float) i_52_,
						 (float) i_55_, (float) i_56_,
						 (float) (1771907305
							  * (Class706_Sub4
							     .anInt10994)),
						 (float) (-1091172141
							  * Class18.anInt205),
						 (float) ((-1230478387
							   * (class247
							      .anInt2508))
							  << 2));
				    } else if (3
					       == -891094135 * Class10.anInt75)
					class433.method6857
					    ((float) i_53_, (float) i_54_,
					     (float) i_51_, (float) i_52_,
					     Class599.aClass298_Sub1_7871
						 .method5397(1204311235),
					     Class599.aClass298_Sub1_7871
						 .method5398(1396693233),
					     (float) (1771907305
						      * (Class706_Sub4
							 .anInt10994)),
					     (float) (Class18.anInt205
						      * -1091172141));
				    else
					class433.method6857
					    ((float) i_53_, (float) i_54_,
					     (float) i_51_, (float) i_52_,
					     (float) i_55_, (float) i_56_,
					     (float) (Class706_Sub4.anInt10994
						      * 1771907305),
					     (float) (-1091172141
						      * Class18.anInt205));
				    Class254.aClass185_2683
					.method3338(class433);
				    Class254.aClass185_2683.method3340(2, 0);
				    if (class247.aBool2512)
					Class254.aClass185_2683
					    .method3461(false);
				    if (class247.aBool2499) {
					client.aClass446_11358.method7244
					    (1.0F, 0.0F, 0.0F,
					     (Class427.method6799
					      (class247.anInt2502
					       * 1033849275)));
					client.aClass446_11358.method7245
					    (0.0F, 1.0F, 0.0F,
					     (Class427.method6799
					      (class247.anInt2503
					       * -806242263)));
					client.aClass446_11358.method7245
					    (0.0F, 0.0F, 1.0F,
					     (Class427.method6799
					      (-1513459333
					       * class247.anInt2624)));
					client.aClass446_11358.method7287
					    ((float) (class247.anInt2586
						      * -1399895567),
					     (float) (class247.anInt2506
						      * -1446592235),
					     (float) (class247.anInt2507
						      * 1556427793));
				    } else {
					int i_57_
					    = ((((-1230478387
						  * class247.anInt2508)
						 << 2)
						* (Class427.anIntArray4806
						   [((1033849275
						      * class247.anInt2502)
						     << 3)]))
					       >> 14);
					int i_58_
					    = ((((class247.anInt2508
						  * -1230478387)
						 << 2)
						* (Class427.anIntArray4805
						   [((1033849275
						      * class247.anInt2502)
						     << 3)]))
					       >> 14);
					client.aClass446_11358.method7244
					    (0.0F, 0.0F, 1.0F,
					     (Class427.method6799
					      (-(-1513459333
						 * class247.anInt2624) << 3)));
					client.aClass446_11358.method7245
					    (0.0F, 1.0F, 0.0F,
					     (Class427.method6799
					      (-806242263 * class247.anInt2503
					       << 3)));
					client.aClass446_11358.method7287
					    ((float) ((-495767299
						       * class247.anInt2500)
						      << 2),
					     (float) (i_46_
						      + (i_57_
							 + ((1797197351
							     * (class247
								.anInt2598))
							    << 2))),
					     (float) (((1797197351
							* class247.anInt2598)
						       << 2)
						      + i_58_));
					client.aClass446_11358.method7245
					    (1.0F, 0.0F, 0.0F,
					     (Class427.method6799
					      (1033849275 * class247.anInt2502
					       << 3)));
				    }
				    class247.method4531((Class254
							 .aClass185_2683),
							class183,
							client.aClass446_11358,
							client.anInt11101,
							-10262874);
				    Class254.aClass185_2683.method3281();
				    Class254.aClass185_2683.method3237(true);
				    Class254.aClass185_2683
					.method3373(i_2_, i_3_, i_4_, i_5_);
				    if (client.aBool11112)
					Class254.aClass185_2683.method3282
					    (i_12_, i_13_,
					     (-881188269 * class247.anInt2468
					      + i_12_),
					     (class247.anInt2469 * -1279656873
					      + i_13_));
				    if (class247.aBool2522)
					client.aClass512_11100.method8501
					    ((byte) 46).method10159
					    (((float) (1469151327
						       * class247.anInt2529)
					      / 256.0F),
					     ((float) (-660951517
						       * class247.anInt2526)
					      / 256.0F),
					     (float) (class247.anInt2527
						      * -531958613) / 256.0F,
					     -1189137809 * class247.anInt2511,
					     -893779117 * class247.anInt2618,
					     1770570081 * class247.anInt2559,
					     -380992263 * class247.anInt2608,
					     -2113334655 * class247.anInt2431,
					     1868906617);
				    else
					client.aClass512_11100.method8501
					    ((byte) -25).method10176((byte) 1);
				    class183.method3034(client.aClass446_11358,
							null, 1);
				    if (!class247.aBool2525
					&& class247.aClass629_2519 != null)
					Class254.aClass185_2683.method3334
					    (class247.aClass629_2519
						 .method10423());
				    if (client.aBool11112)
					Class254.aClass185_2683.method3373
					    (i_2_, i_3_, i_4_, i_5_);
				    Class254.aClass185_2683.method3237(false);
				    Class254.aClass185_2683.method3537();
				    Class254.aClass185_2683
					.method3373(i_2_, i_3_, i_4_, i_5_);
				    if (class247.aBool2522)
					client.aClass512_11100.method8501
					    ((byte) 58).method10176((byte) 1);
				    if (class247.aBool2512)
					Class254.aClass185_2683
					    .method3461(true);
				}
			    } else if (-1960530827 * class247.anInt2438 == 9) {
				int i_59_;
				int i_60_;
				int i_61_;
				int i_62_;
				if (class247.aBool2486) {
				    i_59_ = i_12_;
				    i_60_ = i_13_ + (-1279656873
						     * class247.anInt2469);
				    i_61_ = i_12_ + (class247.anInt2468
						     * -881188269);
				    i_62_ = i_13_;
				} else {
				    i_59_ = i_12_;
				    i_60_ = i_13_;
				    i_61_ = (class247.anInt2468 * -881188269
					     + i_12_);
				    i_62_ = i_13_ + (-1279656873
						     * class247.anInt2469);
				}
				if (1684703667 * class247.anInt2485 == 1)
				    Class254.aClass185_2683.method3303
					(i_59_, i_60_, i_61_, i_62_,
					 (~0xffffff
					  | class247.anInt2482 * 290091559),
					 0);
				else
				    Class254.aClass185_2683.method3307
					(i_59_, i_60_, i_61_, i_62_,
					 (~0xffffff
					  | class247.anInt2482 * 290091559),
					 1684703667 * class247.anInt2485, 0);
			    }
			}
		    }
		}
	    }
	}
    }
    
    static void method17195(int i) {
	if (null != Class104.aClass185_1297) {
	    Class104.aClass185_1297.method3236(-568376843);
	    Class104.aClass185_1297 = null;
	    Class662.aClass171_8551 = null;
	}
    }
}
