/* Class512 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Class512
{
    Class514 aClass514_5681;
    Class499 aClass499_5682;
    Class499 aClass499_5683;
    Class302 aClass302_5684;
    Class460_Sub1 aClass460_Sub1_5685;
    Class460_Sub1 aClass460_Sub1_5686;
    int anInt5687;
    Class597 aClass597_5688;
    int anInt5689;
    int anInt5690;
    Class523 aClass523_5691;
    byte[][] aByteArrayArray5692;
    int anInt5693;
    Class616 aClass616_5694;
    Class507 aClass507_5695;
    int anInt5696;
    int anInt5697;
    Class534_Sub18_Sub9 aClass534_Sub18_Sub9_5698;
    int anInt5699;
    public boolean aBool5700;
    float aFloat5701;
    Class468 aClass468_5702;
    int[][] anIntArrayArray5703;
    int[][] anIntArrayArray5704;
    byte[][][] aByteArrayArrayArray5705;
    int anInt5706;
    Class597 aClass597_5707 = new Class597();
    int anInt5708;
    int anInt5709;
    int anInt5710;
    public long aLong5711;
    Class44_Sub13 aClass44_Sub13_5712;
    boolean aBool5713;
    int[] anIntArray5714;
    byte[][] aByteArrayArray5715;
    byte[][] aByteArrayArray5716;
    byte[][] aByteArrayArray5717;
    int[] anIntArray5718;
    byte[][] aByteArrayArray5719;
    int[][][] anIntArrayArrayArray5720;
    Class556 aClass556_5721;
    public long aLong5722;
    HashMap aHashMap5723;
    int anInt5724;
    public int anInt5725;
    public static Class472 aClass472_5726;
    
    public byte[][][] method8411(byte i) {
	return aByteArrayArrayArray5705;
    }
    
    public Class499 method8412(int i) {
	return aClass499_5682;
    }
    
    public Class507 method8413(int i) {
	return aClass507_5695;
    }
    
    public int method8414(int i) {
	return 100 - anInt5693 * -1617629820 / (anInt5708 * -568733371);
    }
    
    public int method8415(int i) {
	return 100 - anInt5709 * 1620147172 / (-1443452255 * anInt5710);
    }
    
    public Class597 method8416(byte i) {
	return aClass597_5707;
    }
    
    public int method8417(int i) {
	return anInt5724 * -858656915;
    }
    
    public int method8418(int i) {
	return -2041900081 * anInt5706;
    }
    
    public Class523 method8419(int i) {
	return aClass523_5691;
    }
    
    public Class514 method8420(int i) {
	return aClass514_5681;
    }
    
    public void method8421(Class511 class511) {
	aClass499_5682 = class511.aClass499_5680;
	if (aClass499_5682 == Class499.aClass499_5597)
	    method8463(-1395166223);
	else if (Class499.aClass499_5595 == aClass499_5682)
	    method8444(class511.aClass534_Sub40_Sub1_5679, -1380244576);
	else if (Class499.aClass499_5594 == aClass499_5682)
	    method8446(2139493092);
	else if (aClass499_5682.method8264(1152909114))
	    method8445(class511.aClass534_Sub40_Sub1_5679, 1672191476);
    }
    
    public Class616 method8422() {
	return aClass616_5694;
    }
    
    void method8423(Class512 class512_0_, byte i) {
	boolean bool = class512_0_.aBool5713;
	class512_0_.aBool5713 = aBool5713;
	aBool5713 = bool;
	Class499 class499 = class512_0_.aClass499_5683;
	class512_0_.aClass499_5683 = aClass499_5683;
	aClass499_5683 = class499;
	class512_0_.aClass597_5688 = aClass597_5707;
	aClass597_5688 = class512_0_.aClass597_5707;
	aClass616_5694.method10146(class512_0_.method8501((byte) -63),
				   -2008552135);
    }
    
    public Class556 method8424(byte i) {
	return aClass556_5721;
    }
    
    void method8425(Class460_Sub1 class460_sub1, byte[][] is, int i) {
	int i_1_ = is.length;
	for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
	    byte[] is_3_ = is[i_2_];
	    if (null != is_3_) {
		Class534_Sub40 class534_sub40 = new Class534_Sub40(is_3_);
		int i_4_ = anIntArray5718[i_2_] >> 8;
		int i_5_ = anIntArray5718[i_2_] & 0xff;
		int i_6_ = 64 * i_4_ - aClass597_5707.anInt7859 * -424199969;
		int i_7_ = i_5_ * 64 - aClass597_5707.anInt7861 * -1166289421;
		if (!aBool5713 && null != Class171_Sub4.aClass232_9944)
		    Class171_Sub4.aClass232_9944.method4270((byte) -1);
		class460_sub1.method7450(class534_sub40, i_6_, i_7_,
					 aClass597_5707.anInt7859 * -424199969,
					 (-1166289421
					  * aClass597_5707.anInt7861),
					 1083504760);
		class460_sub1.method15951(Class254.aClass185_2683,
					  class534_sub40, i_6_, i_7_,
					  1921551517);
	    }
	}
	for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
	    int i_9_ = ((anIntArray5718[i_8_] >> 8) * 64
			- aClass597_5707.anInt7859 * -424199969);
	    int i_10_ = (64 * (anIntArray5718[i_8_] & 0xff)
			 - aClass597_5707.anInt7861 * -1166289421);
	    byte[] is_11_ = is[i_8_];
	    if (is_11_ == null && anInt5690 * 102545369 < 800) {
		if (!aBool5713 && null != Class171_Sub4.aClass232_9944)
		    Class171_Sub4.aClass232_9944.method4270((byte) -1);
		class460_sub1.method7448(i_9_, i_10_, 64, 64, (byte) -30);
	    }
	}
    }
    
    public Class507 method8426() {
	return aClass507_5695;
    }
    
    public Class514 method8427() {
	return aClass514_5681;
    }
    
    public Class44_Sub13 method8428(int i) {
	return aClass44_Sub13_5712;
    }
    
    public int[][] method8429(int i) {
	return anIntArrayArray5703;
    }
    
    public int[][] method8430(int i) {
	return anIntArrayArray5704;
    }
    
    public Class512(boolean bool) {
	aClass597_5688 = new Class597();
	aClass514_5681 = new Class514(0, 0, 0, 0);
	anInt5693 = 0;
	anInt5708 = -1233643123;
	anInt5709 = 0;
	anInt5710 = 291223905;
	anInt5699 = 0;
	aBool5700 = false;
	aLong5711 = 2452396203634292367L;
	aHashMap5723 = new HashMap();
	aBool5713 = bool;
    }
    
    public void method8431(byte[][][] is) {
	aByteArrayArrayArray5705 = is;
    }
    
    public float method8432(byte i) {
	return aFloat5701;
    }
    
    void method8433(int i, short i_12_) {
	int i_13_ = (aClass597_5707.anInt7859 * -424199969
		     - -424199969 * aClass597_5688.anInt7859);
	int i_14_ = (aClass597_5707.anInt7861 * -1166289421
		     - -1166289421 * aClass597_5688.anInt7861);
	if (i == 3) {
	    for (int i_15_ = 0; i_15_ < client.anInt11148 * 759971875;
		 i_15_++) {
		Class534_Sub6 class534_sub6
		    = client.aClass534_Sub6Array11085[i_15_];
		if (null != class534_sub6) {
		    Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
			= ((Class654_Sub1_Sub5_Sub1_Sub1)
			   class534_sub6.anObject10417);
		    for (int i_16_ = 0;
			 i_16_ < (class654_sub1_sub5_sub1_sub1
				  .anIntArray11977).length;
			 i_16_++) {
			class654_sub1_sub5_sub1_sub1.anIntArray11977[i_16_]
			    -= i_13_;
			class654_sub1_sub5_sub1_sub1.anIntArray11978[i_16_]
			    -= i_14_;
		    }
		    Class438 class438
			= Class438.method6994(class654_sub1_sub5_sub1_sub1
						  .method10807
					      ().aClass438_4885);
		    class438.aFloat4864 -= (float) (i_13_ * 512);
		    class438.aFloat4865 -= (float) (512 * i_14_);
		    class654_sub1_sub5_sub1_sub1.method10809(class438);
		    class438.method7074();
		}
	    }
	} else {
	    boolean bool = false;
	    client.anInt11321 = 0;
	    int i_17_ = anInt5724 * -1545676288 - 512;
	    int i_18_ = -1775788544 * anInt5706 - 512;
	    for (int i_19_ = 0; i_19_ < 759971875 * client.anInt11148;
		 i_19_++) {
		Class534_Sub6 class534_sub6
		    = client.aClass534_Sub6Array11085[i_19_];
		if (class534_sub6 != null) {
		    Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
			= ((Class654_Sub1_Sub5_Sub1_Sub1)
			   class534_sub6.anObject10417);
		    Class438 class438
			= Class438.method6994(class654_sub1_sub5_sub1_sub1
						  .method10807
					      ().aClass438_4885);
		    class438.aFloat4864 -= (float) (512 * i_13_);
		    class438.aFloat4865 -= (float) (512 * i_14_);
		    class654_sub1_sub5_sub1_sub1.method10809(class438);
		    if ((int) class438.aFloat4864 < 0
			|| (int) class438.aFloat4864 > i_17_
			|| (int) class438.aFloat4865 < 0
			|| (int) class438.aFloat4865 > i_18_) {
			class654_sub1_sub5_sub1_sub1.method18827(null,
								 (byte) -2);
			class534_sub6.method8892((byte) 1);
			bool = true;
		    } else {
			boolean bool_20_ = true;
			for (int i_21_ = 0;
			     i_21_ < (class654_sub1_sub5_sub1_sub1
				      .anIntArray11977).length;
			     i_21_++) {
			    class654_sub1_sub5_sub1_sub1.anIntArray11977[i_21_]
				-= i_13_;
			    class654_sub1_sub5_sub1_sub1.anIntArray11978[i_21_]
				-= i_14_;
			    if ((class654_sub1_sub5_sub1_sub1.anIntArray11977
				 [i_21_]) < 0
				|| ((class654_sub1_sub5_sub1_sub1
				     .anIntArray11977[i_21_])
				    >= anInt5724 * -858656915)
				|| (class654_sub1_sub5_sub1_sub1
				    .anIntArray11978[i_21_]) < 0
				|| ((class654_sub1_sub5_sub1_sub1
				     .anIntArray11978[i_21_])
				    >= -2041900081 * anInt5706))
				bool_20_ = false;
			}
			if (bool_20_)
			    client.anIntArray11088[((client.anInt11321
						     += 590354627)
						    * -1125820437) - 1]
				= (1126388985
				   * class654_sub1_sub5_sub1_sub1.anInt11922);
			else {
			    class654_sub1_sub5_sub1_sub1
				.method18827(null, (byte) -2);
			    class534_sub6.method8892((byte) 1);
			    bool = true;
			}
		    }
		    class438.method7074();
		}
	    }
	    if (bool) {
		client.anInt11148
		    = client.aClass9_11331.method600(2010819373) * 1085173643;
		int i_22_ = 0;
		Iterator iterator = client.aClass9_11331.iterator();
		while (iterator.hasNext()) {
		    Class534_Sub6 class534_sub6
			= (Class534_Sub6) iterator.next();
		    client.aClass534_Sub6Array11085[i_22_++] = class534_sub6;
		}
	    }
	}
	for (int i_23_ = 0; i_23_ < 2048; i_23_++) {
	    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		= client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i_23_];
	    if (class654_sub1_sub5_sub1_sub2 != null) {
		for (int i_24_ = 0;
		     (i_24_
		      < class654_sub1_sub5_sub1_sub2.anIntArray11977.length);
		     i_24_++) {
		    class654_sub1_sub5_sub1_sub2.anIntArray11977[i_24_]
			-= i_13_;
		    class654_sub1_sub5_sub1_sub2.anIntArray11978[i_24_]
			-= i_14_;
		}
		Class438 class438
		    = Class438.method6994(class654_sub1_sub5_sub1_sub2
					      .method10807().aClass438_4885);
		class438.aFloat4864 -= (float) (i_13_ * 512);
		class438.aFloat4865 -= (float) (i_14_ * 512);
		class654_sub1_sub5_sub1_sub2.method10809(class438);
		class438.method7074();
	    }
	}
	Class99[] class99s = client.aClass99Array11053;
	for (int i_25_ = 0; i_25_ < class99s.length; i_25_++) {
	    Class99 class99 = class99s[i_25_];
	    if (class99 != null) {
		class99.anInt1171 -= -1208905216 * i_13_;
		class99.anInt1172 -= i_14_ * 1906770432;
	    }
	}
	for (Class534_Sub4 class534_sub4
		 = ((Class534_Sub4)
		    Class534_Sub4.aClass700_10408.method14135((byte) -1));
	     null != class534_sub4;
	     class534_sub4 = (Class534_Sub4) Class534_Sub4.aClass700_10408
						 .method14139(1573131555)) {
	    class534_sub4.anInt10397 -= 1402161037 * i_13_;
	    class534_sub4.anInt10400 -= i_14_ * 2107243719;
	    Class602 class602
		= ((Class602)
		   aClass44_Sub13_5712.method91((class534_sub4.anInt10398
						 * -1375582077),
						205306138));
	    int i_26_;
	    int i_27_;
	    if (0 == (class534_sub4.anInt10403 * 220446523 & 0x1)) {
		i_26_ = -1082258489 * class602.anInt7904;
		i_27_ = class602.anInt7928 * -1990374967;
	    } else {
		i_26_ = -1990374967 * class602.anInt7928;
		i_27_ = class602.anInt7904 * -1082258489;
	    }
	    if (Class499.aClass499_5599 != aClass499_5682
		&& (i_26_ + class534_sub4.anInt10397 * -1522052283 <= 0
		    || class534_sub4.anInt10400 * -1246362377 + i_27_ <= 0
		    || (-1522052283 * class534_sub4.anInt10397
			>= -858656915 * anInt5724)
		    || (class534_sub4.anInt10400 * -1246362377
			>= -2041900081 * anInt5706)))
		class534_sub4.method8892((byte) 1);
	}
	for (Class534_Sub4 class534_sub4
		 = ((Class534_Sub4)
		    Class534_Sub4.aClass700_10409.method14135((byte) -1));
	     class534_sub4 != null;
	     class534_sub4 = (Class534_Sub4) Class534_Sub4.aClass700_10409
						 .method14139(1269731231)) {
	    class534_sub4.anInt10397 -= i_13_ * 1402161037;
	    class534_sub4.anInt10400 -= i_14_ * 2107243719;
	    Class602 class602
		= ((Class602)
		   aClass44_Sub13_5712.method91((class534_sub4.anInt10398
						 * -1375582077),
						-2139164607));
	    int i_28_;
	    int i_29_;
	    if ((220446523 * class534_sub4.anInt10403 & 0x1) == 0) {
		i_28_ = class602.anInt7904 * -1082258489;
		i_29_ = -1990374967 * class602.anInt7928;
	    } else {
		i_28_ = class602.anInt7928 * -1990374967;
		i_29_ = class602.anInt7904 * -1082258489;
	    }
	    if (aClass499_5682 != Class499.aClass499_5599
		&& (i_28_ + class534_sub4.anInt10397 * -1522052283 <= 0
		    || class534_sub4.anInt10400 * -1246362377 + i_29_ <= 0
		    || (class534_sub4.anInt10397 * -1522052283
			>= anInt5724 * -858656915)
		    || (-1246362377 * class534_sub4.anInt10400
			>= -2041900081 * anInt5706)))
		class534_sub4.method8892((byte) 1);
	}
	for (Class534_Sub7 class534_sub7
		 = (Class534_Sub7) client.aClass9_11209.method583(-1646309905);
	     null != class534_sub7;
	     class534_sub7 = ((Class534_Sub7)
			      client.aClass9_11209.method584((byte) -11))) {
	    int i_30_
		= (int) (8258869577519436579L * class534_sub7.aLong7158 >> 28
			 & 0x3L);
	    int i_31_ = (int) (class534_sub7.aLong7158 * 8258869577519436579L
			       & 0x3fffL);
	    int i_32_ = i_31_ - -424199969 * aClass597_5707.anInt7859;
	    int i_33_
		= (int) (8258869577519436579L * class534_sub7.aLong7158 >> 14
			 & 0x3fffL);
	    int i_34_ = i_33_ - aClass597_5707.anInt7861 * -1166289421;
	    if (aClass556_5721 != null) {
		if (i_32_ < 0 || i_34_ < 0 || i_32_ >= -858656915 * anInt5724
		    || i_34_ >= -2041900081 * anInt5706
		    || i_32_ >= 1183912005 * aClass556_5721.anInt7435
		    || i_34_ >= 60330541 * aClass556_5721.anInt7470) {
		    if (aClass499_5682 != Class499.aClass499_5599)
			class534_sub7.method8892((byte) 1);
		} else if (aClass556_5721.aClass568ArrayArrayArray7431 != null)
		    aClass556_5721.method9254(i_30_, i_32_, i_34_, 1466988422);
	    }
	}
	if (0 != Class113.anInt1375 * -1254538725) {
	    Class113.anInt1375 -= -1660827629 * i_13_;
	    Class113.anInt1376 -= 517634255 * i_14_;
	}
	Class278.method5224(false, 79760031);
	if (i == 3) {
	    client.anInt11137 -= -590552576 * i_13_;
	    client.anInt11138 -= i_14_ * -1766187520;
	    Class588.anInt7808 -= i_13_ * -1630722560;
	    Class453.anInt4958 -= -191354368 * i_14_;
	    if (-891094135 * Class10.anInt75 != 5
		&& 3 != Class10.anInt75 * -891094135)
		Class235.method4408(Class200_Sub5.method15573((byte) 110),
				    (byte) 55);
	} else {
	    Class200_Sub8.anInt9909 -= -827897067 * i_13_;
	    Class200_Sub9.anInt9916 -= i_14_ * 1775664559;
	    Class652.anInt8484 -= 1442265799 * i_13_;
	    Class609.anInt8007 -= i_14_ * -1322167097;
	    Class200_Sub13.anInt9937 -= 659663360 * i_13_;
	    Class636.anInt8305 -= -1131865600 * i_14_;
	    if (Math.abs(i_13_) > -858656915 * anInt5724
		|| Math.abs(i_14_) > -2041900081 * anInt5706)
		aClass616_5694.method10157(1266331154);
	}
	Class489.method8005(-1400186835);
	Class561.method9444((byte) -72);
	client.aClass9_11322.method578((byte) -26);
	client.aClass700_11210.method14152(-1058624045);
	client.aClass709_11212.method14283(-1107967299);
	Class569.method9598(-489460437);
    }
    
    public void method8434(int i) {
	aClass597_5707 = new Class597();
	anInt5690 = 0;
	anInt5689 = 0;
    }
    
    public void method8435(Class44_Sub13 class44_sub13, int i) {
	aClass44_Sub13_5712 = class44_sub13;
    }
    
    void method8436(int i, int i_35_, int i_36_, boolean bool, int i_37_) {
	if (-1468443459 * client.anInt11155 == 4) {
	    if (aBool5713)
		throw new IllegalStateException();
	    client.anInt11155 = -143767915;
	    client.anInt11023 = -1139557399;
	}
	if (bool || i != anInt5689 * 996655731
	    || i_35_ != 102545369 * anInt5690) {
	    anInt5689 = i * -457461061;
	    anInt5690 = 1232492649 * i_35_;
	    if (!aBool5713) {
		Class673.method11110(i_36_, -1045384570);
		Class689.method14015
		    (Class58.aClass58_460.method1245(Class539.aClass672_7171,
						     (byte) -111),
		     true, Class254.aClass185_2683,
		     Class539_Sub1.aClass171_10327, Class67.aClass16_720,
		     (byte) -111);
	    }
	    if (aClass597_5707 != null)
		aClass597_5688 = aClass597_5707;
	    else
		aClass597_5688 = new Class597(0, 0, 0);
	    aClass597_5707
		= new Class597(0,
			       (anInt5689 * 996655731
				- (-858656915 * anInt5724 >> 4)) * 8,
			       8 * (anInt5690 * 102545369
				    - (-2041900081 * anInt5706 >> 4)));
	    aClass534_Sub18_Sub9_5698
		= Class554.method9113((anInt5724 * -858656915 / 2
				       + (-424199969
					  * aClass597_5707.anInt7859)),
				      (-858656915 * anInt5724 / 2
				       + (aClass597_5707.anInt7861
					  * -1166289421)));
	    aClass523_5691 = null;
	    aLong5711 = 2452396203634292367L;
	    if (!aBool5713)
		method8433(i_36_, (short) -17180);
	}
    }
    
    public void method8437(boolean bool, int i) {
	Class653 class653 = null;
	if (null != aClass616_5694 && bool)
	    class653 = aClass616_5694.method10144(-1822166583);
	aClass616_5694
	    = new Class616(Class254.aClass185_2683, Class464.aClass472_5113,
			   -858656915 * anInt5724 >> 3,
			   -2041900081 * anInt5706 >> 3);
	if (class653 != null)
	    aClass616_5694.method10216(this, class653, 0, (byte) 52);
    }
    
    public void method8438(int i) {
	aClass616_5694.method10216(this, null, 0, (byte) 123);
    }
    
    public void method8439(byte i) {
	anInt5696 = -1623634152;
	if (-858656915 * anInt5724 == 0)
	    anInt5697 = 2015729170;
	else
	    anInt5697 = ((int) (34.46 * (double) (-858656915 * anInt5724))
			 * 204453663);
	anInt5697 = 204453663 * (anInt5697 * -921893665 << 2);
	if (Class254.aClass185_2683.method3333())
	    anInt5697 += 1601060352;
    }
    
    public void method8440() {
	if (aClass556_5721 != null) {
	    Class469.method7636((byte) -13);
	    aHashMap5723 = aClass556_5721.method9282(-2032885309);
	    aClass556_5721.aClass557_7478.method9407((short) 15866);
	    aClass556_5721 = null;
	}
    }
    
    public void method8441(int i) {
	if (aBool5713) {
	    method8532((byte) 16);
	    aLong5711 = 2452396203634292367L;
	    Class512 class512_38_ = client.aClass512_11100;
	    anInt5699 = 1 * class512_38_.anInt5699;
	    anIntArray5718 = class512_38_.anIntArray5718;
	    anIntArray5714 = class512_38_.anIntArray5714;
	    aByteArrayArray5715 = class512_38_.aByteArrayArray5715;
	    aByteArrayArray5716 = class512_38_.aByteArrayArray5716;
	    aByteArrayArray5717 = class512_38_.aByteArrayArray5717;
	    aByteArrayArray5692 = class512_38_.aByteArrayArray5692;
	    aByteArrayArray5719 = class512_38_.aByteArrayArray5719;
	    aClass468_5702 = class512_38_.aClass468_5702;
	    aClass616_5694 = class512_38_.aClass616_5694;
	    anIntArrayArrayArray5720 = class512_38_.anIntArrayArrayArray5720;
	    anInt5696 = 1 * class512_38_.anInt5696;
	    anInt5697 = 1 * class512_38_.anInt5697;
	    aClass534_Sub18_Sub9_5698 = class512_38_.aClass534_Sub18_Sub9_5698;
	    aClass523_5691 = class512_38_.aClass523_5691;
	    anIntArrayArray5703 = class512_38_.anIntArrayArray5703;
	    anIntArrayArray5704 = class512_38_.anIntArrayArray5704;
	    aByteArrayArrayArray5705 = class512_38_.aByteArrayArrayArray5705;
	    aClass499_5682 = class512_38_.aClass499_5682;
	    aClass302_5684 = class512_38_.aClass302_5684;
	    aClass597_5707 = class512_38_.aClass597_5707;
	    aClass597_5688 = class512_38_.aClass597_5688;
	    anInt5689 = class512_38_.anInt5689 * 1;
	    anInt5690 = class512_38_.anInt5690 * 1;
	    anInt5724 = 1 * class512_38_.anInt5724;
	    anInt5706 = 1 * class512_38_.anInt5706;
	} else if (15 == client.anInt11039 * -1850530127)
	    Class673.method11110(10, -1366189620);
	else if (client.anInt11039 * -1850530127 == 9)
	    Class673.method11110(17, -558661682);
	else if (7 == -1850530127 * client.anInt11039)
	    Class673.method11110(6, -1803922824);
	else if (-1850530127 * client.anInt11039 == 16)
	    Class673.method11110(3, -336621588);
	else if (18 == client.anInt11039 * -1850530127)
	    Class673.method11110(0, -2051380414);
    }
    
    public void method8442(Class511 class511, int i) {
	aClass499_5682 = class511.aClass499_5680;
	if (aClass499_5682 == Class499.aClass499_5597)
	    method8463(-1395166223);
	else if (Class499.aClass499_5595 == aClass499_5682)
	    method8444(class511.aClass534_Sub40_Sub1_5679, 1273397659);
	else if (Class499.aClass499_5594 == aClass499_5682)
	    method8446(2094159383);
	else if (aClass499_5682.method8264(-982501715))
	    method8445(class511.aClass534_Sub40_Sub1_5679, -1011928953);
    }
    
    public int method8443(int i) {
	return -2135507245 * anInt5696;
    }
    
    void method8444(Class534_Sub40_Sub1 class534_sub40_sub1, int i) {
	int i_39_ = class534_sub40_sub1.method16572((byte) 49);
	boolean bool = class534_sub40_sub1.method16527(-1952912400) == 1;
	int i_40_ = class534_sub40_sub1.method16643(-2054284025);
	anInt5725 = class534_sub40_sub1.method16527(94312942) * 1826695267;
	int i_41_ = class534_sub40_sub1.method16563((byte) -37);
	int i_42_ = class534_sub40_sub1.method16571(362957407);
	if (!aBool5713)
	    method8449(-84010581);
	method8448(Class162.method2643(i_40_, -1720854605), 1233070456);
	anIntArray5718 = new int[i_41_];
	anIntArray5714 = new int[i_41_];
	aByteArrayArray5715 = new byte[i_41_][];
	aByteArrayArray5716 = new byte[i_41_][];
	aByteArrayArray5717 = null;
	aByteArrayArray5692 = new byte[i_41_][];
	aByteArrayArray5719 = new byte[i_41_][];
	i_41_ = 0;
	for (int i_43_ = (i_39_ - (-858656915 * anInt5724 >> 4)) / 8;
	     i_43_ <= ((anInt5724 * -858656915 >> 4) + i_39_) / 8; i_43_++) {
	    for (int i_44_ = (i_42_ - (anInt5706 * -2041900081 >> 4)) / 8;
		 i_44_ <= (i_42_ + (-2041900081 * anInt5706 >> 4)) / 8;
		 i_44_++) {
		if (Class298_Sub1.aClass472_10064.method7664
		    (method8447(i_43_, i_44_, -2140769454),
		     Class465.aClass465_5117.anInt5123 * 625273953,
		     195489411)) {
		    anIntArray5718[i_41_] = i_44_ + (i_43_ << 8);
		    anIntArray5714[i_41_]
			= method8447(i_43_, i_44_, -2108935356);
		    i_41_++;
		}
	    }
	}
	anInt5699 = -179707951 * i_41_;
	method8436(i_39_, i_42_, 3, bool, 1198399829);
    }
    
    void method8445(Class534_Sub40_Sub1 class534_sub40_sub1, int i) {
	int i_45_ = class534_sub40_sub1.method16573(-1982766353);
	int i_46_ = class534_sub40_sub1.method16563((byte) -119);
	if (i_46_ == 1)
	    aClass499_5682 = Class499.aClass499_5598;
	else if (i_46_ == 2)
	    aClass499_5682 = Class499.aClass499_5596;
	else if (i_46_ == 3)
	    aClass499_5682 = Class499.aClass499_5602;
	else if (4 == i_46_)
	    aClass499_5682 = Class499.aClass499_5599;
	int i_47_ = class534_sub40_sub1.method16643(-2096165204);
	anInt5725 = class534_sub40_sub1.method16643(-2095245112) * 1826695267;
	int i_48_ = class534_sub40_sub1.method16643(-2073711854);
	boolean bool = (i_48_ & 0x1) != 0;
	int i_49_ = class534_sub40_sub1.method16573(-1982766353);
	if (!aBool5713)
	    method8449(740289839);
	method8448(Class162.method2643(i_47_, -1263943538), 1809120815);
	class534_sub40_sub1.method18294(-1678795896);
	HashSet hashset = new HashSet();
	for (int i_50_ = 0; i_50_ < 4; i_50_++) {
	    for (int i_51_ = 0; i_51_ < -858656915 * anInt5724 >> 3; i_51_++) {
		for (int i_52_ = 0; i_52_ < -2041900081 * anInt5706 >> 3;
		     i_52_++) {
		    int i_53_ = class534_sub40_sub1.method18295(1, -761815447);
		    if (1 == i_53_) {
			int i_54_
			    = class534_sub40_sub1.method18295(26, -761815447);
			anIntArrayArrayArray5720[i_50_][i_51_][i_52_] = i_54_;
			int i_55_ = i_54_ >> 14 & 0x3ff;
			int i_56_ = i_54_ >> 3 & 0x7ff;
			int i_57_ = i_55_ >> 3 << 8 | i_56_ >> 3;
			hashset.add(Integer.valueOf(i_57_));
		    } else
			anIntArrayArrayArray5720[i_50_][i_51_][i_52_] = -1;
		}
	    }
	}
	class534_sub40_sub1.method18296(893848388);
	int i_58_ = hashset.size();
	anIntArray5718 = new int[i_58_];
	anIntArray5714 = new int[i_58_];
	aByteArrayArray5715 = new byte[i_58_][];
	aByteArrayArray5716 = new byte[i_58_][];
	aByteArrayArray5717 = null;
	aByteArrayArray5692 = new byte[i_58_][];
	aByteArrayArray5719 = new byte[i_58_][];
	i_58_ = 0;
	for (int i_59_ = 0; i_59_ < 4; i_59_++) {
	    for (int i_60_ = 0; i_60_ < -858656915 * anInt5724 >> 3; i_60_++) {
		for (int i_61_ = 0; i_61_ < -2041900081 * anInt5706 >> 3;
		     i_61_++) {
		    int i_62_ = anIntArrayArrayArray5720[i_59_][i_60_][i_61_];
		    if (i_62_ != -1) {
			int i_63_ = i_62_ >> 14 & 0x3ff;
			int i_64_ = i_62_ >> 3 & 0x7ff;
			int i_65_ = i_64_ / 8 + (i_63_ / 8 << 8);
			for (int i_66_ = 0; i_66_ < i_58_; i_66_++) {
			    if (i_65_ == anIntArray5718[i_66_]) {
				i_65_ = -1;
				break;
			    }
			}
			if (-1 != i_65_) {
			    int i_67_ = i_65_ >> 8 & 0xff;
			    int i_68_ = i_65_ & 0xff;
			    if (Class298_Sub1.aClass472_10064.method7664
				(method8447(i_67_, i_68_, -1047067238),
				 625273953 * Class465.aClass465_5117.anInt5123,
				 -1755245225)) {
				anIntArray5718[i_58_] = i_65_;
				anIntArray5714[i_58_]
				    = method8447(i_67_, i_68_, -1920432664);
				i_58_++;
			    }
			}
		    }
		}
	    }
	}
	anInt5699 = i_58_ * -179707951;
	method8436(i_49_, i_45_, 3, bool, 1608271326);
    }
    
    void method8446(int i) {
	aClass499_5683 = aClass499_5682;
	method8448(Class302.aClass302_3246, 1907682964);
	for (int i_69_ = 0; i_69_ < 4; i_69_++) {
	    for (int i_70_ = 0; i_70_ < anInt5724 * -858656915 >> 3; i_70_++) {
		for (int i_71_ = 0; i_71_ < anInt5706 * -2041900081 >> 3;
		     i_71_++)
		    anIntArrayArrayArray5720[i_69_][i_70_][i_71_] = -1;
	    }
	}
	for (Class534_Sub17 class534_sub17
		 = ((Class534_Sub17)
		    Class201.aClass700_2183.method14135((byte) -1));
	     null != class534_sub17;
	     class534_sub17 = (Class534_Sub17) Class201.aClass700_2183
						   .method14139(1381532114)) {
	    int i_72_ = class534_sub17.anInt10503 * -910054877;
	    boolean bool = (i_72_ & 0x1) == 1;
	    int i_73_ = class534_sub17.anInt10500 * 114372825 >> 3;
	    int i_74_ = class534_sub17.anInt10501 * -528957025 >> 3;
	    int i_75_ = class534_sub17.anInt10507 * -2085075479;
	    int i_76_ = class534_sub17.anInt10499 * 1958875635;
	    int i_77_ = class534_sub17.anInt10505 * -983164393;
	    int i_78_ = class534_sub17.anInt10502 * -444640799;
	    int i_79_ = class534_sub17.anInt10504 * 1910050013;
	    int i_80_ = class534_sub17.anInt10506 * -513660413;
	    int i_81_ = 0;
	    int i_82_ = 0;
	    int i_83_ = 1;
	    int i_84_ = 1;
	    if (i_72_ == 1) {
		i_82_ = i_79_ - 1;
		i_83_ = -1;
	    } else if (i_72_ == 2) {
		i_82_ = i_79_ - 1;
		i_81_ = i_80_ - 1;
		i_83_ = -1;
		i_84_ = -1;
	    } else if (3 == i_72_) {
		i_81_ = i_80_ - 1;
		i_83_ = 1;
		i_84_ = -1;
	    }
	    int i_85_ = i_74_;
	    while (i_85_ < i_80_ + i_74_) {
		int i_86_ = i_82_;
		int i_87_ = i_73_;
		while (i_87_ < i_79_ + i_73_) {
		    if (bool)
			anIntArrayArrayArray5720[i_78_][i_75_ + i_81_]
			    [i_76_ + i_86_]
			    = (i_72_ << 1) + ((i_85_ << 3)
					      + ((i_77_ << 24)
						 + (i_87_ << 14)));
		    else
			anIntArrayArrayArray5720[i_78_][i_86_ + i_75_]
			    [i_76_ + i_81_]
			    = ((i_85_ << 3) + ((i_87_ << 14) + (i_77_ << 24))
			       + (i_72_ << 1));
		    i_87_++;
		    i_86_ += i_83_;
		}
		i_85_++;
		i_81_ += i_84_;
	    }
	}
	int i_88_ = client.anInt11242 * 1358961957;
	anIntArray5718 = new int[i_88_];
	anIntArray5714 = new int[i_88_];
	aByteArrayArray5715 = new byte[i_88_][];
	aByteArrayArray5716 = new byte[i_88_][];
	aByteArrayArray5717 = null;
	aByteArrayArray5692 = new byte[i_88_][];
	aByteArrayArray5719 = new byte[i_88_][];
	i_88_ = 0;
	for (Class534_Sub17 class534_sub17
		 = ((Class534_Sub17)
		    Class201.aClass700_2183.method14135((byte) -1));
	     null != class534_sub17;
	     class534_sub17 = (Class534_Sub17) Class201.aClass700_2183
						   .method14139(1577751509)) {
	    int i_89_ = 114372825 * class534_sub17.anInt10500 >>> 3;
	    int i_90_ = -528957025 * class534_sub17.anInt10501 >>> 3;
	    int i_91_ = i_89_ + 1910050013 * class534_sub17.anInt10504;
	    if ((i_91_ & 0x7) == 0)
		i_91_--;
	    i_91_ >>>= 3;
	    int i_92_ = -513660413 * class534_sub17.anInt10506 + i_90_;
	    if (0 == (i_92_ & 0x7))
		i_92_--;
	    i_92_ >>>= 3;
	    for (int i_93_ = i_89_ >>> 3; i_93_ <= i_91_; i_93_++) {
	    while_1_:
		for (int i_94_ = i_90_ >>> 3; i_94_ <= i_92_; i_94_++) {
		    int i_95_ = i_93_ << 8 | i_94_;
		    for (int i_96_ = 0; i_96_ < i_88_; i_96_++) {
			if (i_95_ == anIntArray5718[i_96_])
			    continue while_1_;
		    }
		    if (Class298_Sub1.aClass472_10064.method7664
			(method8447(i_93_, i_94_, 468801302),
			 Class465.aClass465_5117.anInt5123 * 625273953,
			 762278927)) {
			anIntArray5718[i_88_] = i_95_;
			anIntArray5714[i_88_]
			    = method8447(i_93_, i_94_, -2138759337);
			i_88_++;
		    }
		}
	    }
	}
	anInt5699 = -179707951 * i_88_;
	method8436(anInt5724 * -858656915 >> 4, anInt5706 * -2041900081 >> 4,
		   3, false, -1622717183);
    }
    
    int method8447(int i, int i_97_, int i_98_) {
	return i | i_97_ << 7;
    }
    
    void method8448(Class302 class302, int i) {
	if (class302 != aClass302_5684) {
	    anInt5724
		= (anInt5706 = 1741717883 * class302.anInt3241) * -380961109;
	    anIntArrayArrayArray5720 = (new int[4][-858656915 * anInt5724 >> 3]
					[-2041900081 * anInt5706 >> 3]);
	    anIntArrayArray5703
		= new int[anInt5724 * -858656915][-2041900081 * anInt5706];
	    anIntArrayArray5704
		= new int[-858656915 * anInt5724][anInt5706 * -2041900081];
	    aByteArrayArrayArray5705
		= new byte[4][anInt5724 * -858656915][anInt5706 * -2041900081];
	    aClass468_5702 = new Class468(4, anInt5724 * -858656915,
					  anInt5706 * -2041900081);
	    method8437(false, -1669474893);
	    Class606.method10051(-754492994);
	    aClass302_5684 = class302;
	}
    }
    
    void method8449(int i) {
	if (Class499.aClass499_5594 != aClass499_5682
	    && aClass499_5683 != Class499.aClass499_5594) {
	    if (aClass499_5682 == Class499.aClass499_5598
		|| Class499.aClass499_5602 == aClass499_5682
		|| (aClass499_5682 != aClass499_5683
		    && (Class499.aClass499_5595 == aClass499_5682
			|| aClass499_5683 == Class499.aClass499_5595))) {
		Iterator iterator = client.aClass9_11331.iterator();
		while (iterator.hasNext()) {
		    Class534_Sub6 class534_sub6
			= (Class534_Sub6) iterator.next();
		    Class694.method14069(((Class654_Sub1_Sub5_Sub1_Sub1)
					  class534_sub6.anObject10417),
					 -836779145);
		}
		client.anInt11321 = 0;
		client.anInt11148 = 0;
		client.aClass9_11331.method578((byte) 12);
	    }
	    aClass499_5683 = aClass499_5682;
	}
    }
    
    public byte[][] method8450(int i, int i_99_) {
	if (null != aClass460_Sub1_5686
	    && aClass460_Sub1_5686.aByteArrayArrayArray5067 != null
	    && null != aClass460_Sub1_5686.aByteArrayArrayArray5067[i])
	    return aClass460_Sub1_5686.aByteArrayArrayArray5067[i];
	return null;
    }
    
    public Class499 method8451() {
	return aClass499_5682;
    }
    
    void method8452(int i) {
	aClass460_Sub1_5685 = null;
	aClass460_Sub1_5686 = null;
	if (null != aClass468_5702)
	    aClass468_5702.method7607(65280);
	if (aClass616_5694 != null)
	    aClass616_5694.method10140(-907127);
	if (aClass556_5721 != null) {
	    aClass556_5721.aClass557_7478.method9407((short) 27474);
	    aClass556_5721 = null;
	}
    }
    
    void method8453(Class512 class512_100_) {
	boolean bool = class512_100_.aBool5713;
	class512_100_.aBool5713 = aBool5713;
	aBool5713 = bool;
	Class499 class499 = class512_100_.aClass499_5683;
	class512_100_.aClass499_5683 = aClass499_5683;
	aClass499_5683 = class499;
	class512_100_.aClass597_5688 = aClass597_5707;
	aClass597_5688 = class512_100_.aClass597_5707;
	aClass616_5694.method10146(class512_100_.method8501((byte) 94),
				   2067342850);
    }
    
    void method8454(int i, int i_101_) {
	try {
	    Thread.sleep((long) i);
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    public void method8455(int i) {
	if (aClass556_5721 != null) {
	    Class469.method7636((byte) -42);
	    aHashMap5723 = aClass556_5721.method9282(-1328496315);
	    aClass556_5721.aClass557_7478.method9407((short) 6229);
	    aClass556_5721 = null;
	}
    }
    
    public int method8456(byte i) {
	return -921893665 * anInt5697;
    }
    
    void method8457(Class460_Sub1 class460_sub1, byte[][] is, byte i) {
	for (int i_102_ = 0; i_102_ < anInt5699 * -1729832655; i_102_++) {
	    byte[] is_103_ = is[i_102_];
	    if (is_103_ != null) {
		int i_104_ = ((anIntArray5718[i_102_] >> 8) * 64
			      - -424199969 * aClass597_5707.anInt7859);
		int i_105_ = ((anIntArray5718[i_102_] & 0xff) * 64
			      - aClass597_5707.anInt7861 * -1166289421);
		if (!aBool5713)
		    Class171_Sub4.aClass232_9944.method4270((byte) -1);
		class460_sub1.method15940(Class254.aClass185_2683, is_103_,
					  i_104_, i_105_, -1536094921);
		if (aBool5713)
		    method8454(10, 799987736);
	    }
	}
    }
    
    void method8458(Class460_Sub1 class460_sub1, byte[][] is, byte i) {
	for (int i_106_ = 0; i_106_ < -692901467 * class460_sub1.anInt4991;
	     i_106_++) {
	    if (!aBool5713)
		Class171_Sub4.aClass232_9944.method4270((byte) -1);
	    for (int i_107_ = 0; i_107_ < anInt5724 * -858656915 >> 3;
		 i_107_++) {
		for (int i_108_ = 0; i_108_ < -2041900081 * anInt5706 >> 3;
		     i_108_++) {
		    int i_109_
			= anIntArrayArrayArray5720[i_106_][i_107_][i_108_];
		    if (i_109_ != -1) {
			int i_110_ = i_109_ >> 24 & 0x3;
			if (!class460_sub1.aBool5002 || 0 == i_110_) {
			    int i_111_ = i_109_ >> 1 & 0x3;
			    int i_112_ = i_109_ >> 14 & 0x3ff;
			    int i_113_ = i_109_ >> 3 & 0x7ff;
			    int i_114_ = i_113_ / 8 + (i_112_ / 8 << 8);
			    for (int i_115_ = 0;
				 i_115_ < anIntArray5718.length; i_115_++) {
				if (i_114_ == anIntArray5718[i_115_]
				    && is[i_115_] != null) {
				    class460_sub1.method15941
					(Class254.aClass185_2683, is[i_115_],
					 i_106_, i_107_ * 8, i_108_ * 8,
					 i_110_, (i_112_ & 0x7) * 8,
					 (i_113_ & 0x7) * 8, i_111_,
					 (byte) -49);
				    break;
				}
			    }
			}
		    }
		    if (aBool5713)
			method8454(5, -973535560);
		}
	    }
	}
    }
    
    void method8459(int i) {
	int i_116_ = aByteArrayArray5717.length;
	for (int i_117_ = 0; i_117_ < i_116_; i_117_++) {
	    if (aByteArrayArray5717[i_117_] != null) {
		int i_118_ = -1;
		for (int i_119_ = 0; i_119_ < client.anInt11105 * -1616155819;
		     i_119_++) {
		    if (client.anIntArray11104[i_119_]
			== anIntArray5718[i_117_]) {
			i_118_ = i_119_;
			break;
		    }
		}
		if (-1 == i_118_) {
		    client.anIntArray11104[client.anInt11105 * -1616155819]
			= anIntArray5718[i_117_];
		    i_118_ = (client.anInt11105 += -1230339) * -1616155819 - 1;
		}
		Class534_Sub40 class534_sub40
		    = new Class534_Sub40(aByteArrayArray5717[i_117_]);
		int i_120_ = 0;
		while ((31645619 * class534_sub40.anInt10811
			< aByteArrayArray5717[i_117_].length)
		       && i_120_ < 511
		       && client.anInt11321 * -1125820437 < 1023) {
		    int i_121_ = i_118_ | i_120_++ << 6;
		    int i_122_ = class534_sub40.method16529((byte) 1);
		    int i_123_ = i_122_ >> 14;
		    int i_124_ = i_122_ >> 7 & 0x3f;
		    int i_125_ = i_122_ & 0x3f;
		    int i_126_
			= ((anIntArray5718[i_117_] >> 8) * 64
			   - -424199969 * aClass597_5707.anInt7859 + i_124_);
		    int i_127_
			= ((anIntArray5718[i_117_] & 0xff) * 64
			   - aClass597_5707.anInt7861 * -1166289421 + i_125_);
		    Class307 class307
			= (Class307) (Class578.aClass44_Sub3_7743.method91
				      (class534_sub40.method16529((byte) 1),
				       -2051320128));
		    Class534_Sub6 class534_sub6
			= ((Class534_Sub6)
			   client.aClass9_11331.method579((long) i_121_));
		    if (null == class534_sub6 && (class307.aByte3274 & 0x1) > 0
			&& i_126_ >= 0
			&& (-1821838479 * class307.anInt3328 + i_126_
			    < -858656915 * anInt5724)
			&& i_127_ >= 0
			&& (i_127_ + -1821838479 * class307.anInt3328
			    < -2041900081 * anInt5706)) {
			Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
			    = new Class654_Sub1_Sub5_Sub1_Sub1(aClass556_5721);
			class654_sub1_sub5_sub1_sub1.anInt11922
			    = -2061161143 * i_121_;
			Class534_Sub6 class534_sub6_128_
			    = new Class534_Sub6(class654_sub1_sub5_sub1_sub1);
			client.aClass9_11331.method581(class534_sub6_128_,
						       (long) i_121_);
			client.aClass534_Sub6Array11085
			    [(client.anInt11148 += 1085173643) * 759971875 - 1]
			    = class534_sub6_128_;
			client.anIntArray11088[((client.anInt11321
						 += 590354627) * -1125820437
						- 1)]
			    = i_121_;
			class654_sub1_sub5_sub1_sub1.anInt11967
			    = client.anInt11101 * 1162675721;
			class654_sub1_sub5_sub1_sub1.method18827(class307,
								 (byte) -2);
			class654_sub1_sub5_sub1_sub1.method18535
			    ((class654_sub1_sub5_sub1_sub1.aClass307_12204
			      .anInt3328) * -1821838479,
			     -1708017146);
			class654_sub1_sub5_sub1_sub1.anInt11971
			    = (1883849079
			       * (-1373680215 * (class654_sub1_sub5_sub1_sub1
						 .aClass307_12204.anInt3312)
				  << 3));
			class654_sub1_sub5_sub1_sub1.method18523
			    (class654_sub1_sub5_sub1_sub1.aClass307_12204
				 .aClass686_3325.method13963
				 (1604502217).method93() << 11 & 0x3fff,
			     true, -495191156);
			class654_sub1_sub5_sub1_sub1.method18832
			    (i_123_, i_126_, i_127_, true,
			     class654_sub1_sub5_sub1_sub1
				 .method18545((byte) 1),
			     -24778799);
		    }
		}
	    }
	}
    }
    
    public int method8460() {
	return -2135507245 * anInt5696;
    }
    
    public Class499 method8461() {
	return aClass499_5682;
    }
    
    public Class499 method8462() {
	return aClass499_5682;
    }
    
    void method8463(int i) {
	method8448(Class162.method2643(Class44_Sub6.aClass534_Sub35_10989
					   .aClass690_Sub22_10745
					   .method17078(2034934442),
				       -967244320),
		   567722400);
	int i_129_ = aClass597_5707.anInt7859 * -424199969;
	int i_130_ = -1166289421 * aClass597_5707.anInt7861;
	int i_131_
	    = (-116109187 * Class200_Sub13.anInt9937 >> 12) + (i_129_ >> 3);
	int i_132_ = (-1098179003 * Class636.anInt8305 >> 12) + (i_130_ >> 3);
	Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aByte10854 = (byte) 0;
	Class674.anInt8633 = 0;
	Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method18871(8, 8,
								-1594555466);
	int i_133_ = 18;
	anIntArray5718 = new int[i_133_];
	anIntArray5714 = new int[i_133_];
	aByteArrayArray5715 = new byte[i_133_][];
	aByteArrayArray5716 = new byte[i_133_][];
	aByteArrayArray5717 = new byte[i_133_][];
	aByteArrayArray5692 = new byte[i_133_][];
	aByteArrayArray5719 = new byte[i_133_][];
	i_133_ = 0;
	for (int i_134_ = (i_131_ - (anInt5724 * -858656915 >> 4)) / 8;
	     i_134_ <= ((anInt5724 * -858656915 >> 4) + i_131_) / 8;
	     i_134_++) {
	    for (int i_135_ = (i_132_ - (anInt5706 * -2041900081 >> 4)) / 8;
		 i_135_ <= ((-2041900081 * anInt5706 >> 4) + i_132_) / 8;
		 i_135_++) {
		int i_136_ = i_135_ + (i_134_ << 8);
		if (Class298_Sub1.aClass472_10064.method7664
		    (method8447(i_134_, i_135_, -677195746),
		     625273953 * Class465.aClass465_5117.anInt5123,
		     -1472597959)) {
		    anIntArray5718[i_133_] = i_136_;
		    anIntArray5714[i_133_]
			= method8447(i_134_, i_135_, -1634485470);
		    i_133_++;
		}
	    }
	}
	anInt5699 = -179707951 * i_133_;
	int i_137_;
	if (-1850530127 * client.anInt11039 == 15)
	    i_137_ = 10;
	else if (7 == -1850530127 * client.anInt11039)
	    i_137_ = 6;
	else if (client.anInt11039 * -1850530127 == 9)
	    i_137_ = 17;
	else if (18 == -1850530127 * client.anInt11039)
	    i_137_ = 0;
	else
	    throw new RuntimeException(new StringBuilder().append("").append
					   (-1850530127 * client.anInt11039)
					   .toString());
	method8436(i_131_, i_132_, i_137_, false, 2132940154);
    }
    
    public Class507 method8464() {
	return aClass507_5695;
    }
    
    public Class507 method8465() {
	return aClass507_5695;
    }
    
    public int method8466() {
	return 100 - anInt5693 * -1617629820 / (anInt5708 * -568733371);
    }
    
    public int method8467() {
	return 100 - anInt5709 * 1620147172 / (-1443452255 * anInt5710);
    }
    
    public int method8468() {
	return 100 - anInt5709 * 1620147172 / (-1443452255 * anInt5710);
    }
    
    public int method8469() {
	return 100 - anInt5709 * 1620147172 / (-1443452255 * anInt5710);
    }
    
    void method8470(Class460_Sub1 class460_sub1, byte[][] is) {
	for (int i = 0; i < -692901467 * class460_sub1.anInt4991; i++) {
	    if (!aBool5713)
		Class171_Sub4.aClass232_9944.method4270((byte) -1);
	    for (int i_138_ = 0; i_138_ < -858656915 * anInt5724 >> 3;
		 i_138_++) {
		for (int i_139_ = 0; i_139_ < anInt5706 * -2041900081 >> 3;
		     i_139_++) {
		    int i_140_ = anIntArrayArrayArray5720[i][i_138_][i_139_];
		    if (i_140_ != -1) {
			int i_141_ = i_140_ >> 24 & 0x3;
			if (!class460_sub1.aBool5002 || 0 == i_141_) {
			    int i_142_ = i_140_ >> 1 & 0x3;
			    int i_143_ = i_140_ >> 14 & 0x3ff;
			    int i_144_ = i_140_ >> 3 & 0x7ff;
			    int i_145_ = (i_143_ / 8 << 8) + i_144_ / 8;
			    for (int i_146_ = 0;
				 i_146_ < anIntArray5718.length; i_146_++) {
				if (anIntArray5718[i_146_] == i_145_
				    && null != is[i_146_]) {
				    Class534_Sub40 class534_sub40
					= new Class534_Sub40(is[i_146_]);
				    class460_sub1.method7451(class534_sub40, i,
							     i_138_ * 8,
							     i_139_ * 8,
							     i_141_, i_143_,
							     i_144_, i_142_,
							     17054994);
				    class460_sub1.method15949
					(Class254.aClass185_2683,
					 class534_sub40, i, 8 * i_138_,
					 8 * i_139_, i_141_, i_143_, i_144_,
					 i_142_, -1030488951);
				    break;
				}
			    }
			}
		    }
		}
	    }
	}
	for (int i = 0; i < -692901467 * class460_sub1.anInt4991; i++) {
	    if (!aBool5713)
		Class171_Sub4.aClass232_9944.method4270((byte) -1);
	    for (int i_147_ = 0; i_147_ < anInt5724 * -858656915 >> 3;
		 i_147_++) {
		for (int i_148_ = 0; i_148_ < anInt5706 * -2041900081 >> 3;
		     i_148_++) {
		    int i_149_ = anIntArrayArrayArray5720[i][i_147_][i_148_];
		    if (i_149_ == -1)
			class460_sub1.method7449(i, 8 * i_147_, 8 * i_148_, 8,
						 8, -904088808);
		}
	    }
	}
    }
    
    public int method8471() {
	return anInt5724 * -858656915;
    }
    
    public int method8472() {
	return anInt5724 * -858656915;
    }
    
    public int method8473() {
	return anInt5724 * -858656915;
    }
    
    public int method8474() {
	return anInt5724 * -858656915;
    }
    
    public byte[][] method8475(int i) {
	if (null != aClass460_Sub1_5686
	    && aClass460_Sub1_5686.aByteArrayArrayArray5067 != null
	    && null != aClass460_Sub1_5686.aByteArrayArrayArray5067[i])
	    return aClass460_Sub1_5686.aByteArrayArrayArray5067[i];
	return null;
    }
    
    void method8476(int i) {
	try {
	    Thread.sleep((long) i);
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    void method8477() {
	aClass460_Sub1_5685 = null;
	aClass460_Sub1_5686 = null;
	if (null != aClass468_5702)
	    aClass468_5702.method7607(65280);
	if (aClass616_5694 != null)
	    aClass616_5694.method10140(-907127);
	if (aClass556_5721 != null) {
	    aClass556_5721.aClass557_7478.method9407((short) 22869);
	    aClass556_5721 = null;
	}
    }
    
    public Class523 method8478() {
	return aClass523_5691;
    }
    
    public boolean method8479() {
	if (!aBool5713)
	    Class184.method3220(false, (byte) -79);
	if (aLong5711 * 1097591286410319761L == -1L)
	    aLong5711
		= Class250.method4604((byte) -71) * -2452396203634292367L;
	anInt5693 = 0;
	for (int i = 0; i < anInt5699 * -1729832655; i++) {
	    if (!Class298_Sub1.aClass472_10064.method7681(anIntArray5714[i],
							  1985197084))
		anInt5693 += 58619833;
	}
	if (aClass523_5691 == null) {
	    if (null != aClass534_Sub18_Sub9_5698
		&& Class74.aClass472_800.method7685((aClass534_Sub18_Sub9_5698
						     .aString11765),
						    (short) 5645)) {
		if (!Class74.aClass472_800.method7705
		     (aClass534_Sub18_Sub9_5698.aString11765, -960367044))
		    anInt5693 += 58619833;
		else
		    aClass523_5691
			= Class369.method6378(Class74.aClass472_800,
					      (aClass534_Sub18_Sub9_5698
					       .aString11765),
					      client.aBool11157, (byte) -21);
	    } else
		aClass523_5691 = new Class523(0);
	}
	if (-1304666487 * anInt5693 > 0) {
	    if (anInt5708 * -568733371 < anInt5693 * -1304666487)
		anInt5708 = -961318283 * anInt5693;
	    aClass507_5695 = Class507.aClass507_5664;
	    return false;
	}
	for (int i = 0; i < -1729832655 * anInt5699; i++) {
	    if (aByteArrayArray5715[i] == null)
		aByteArrayArray5715[i]
		    = (Class298_Sub1.aClass472_10064.method7743
		       (anIntArray5714[i],
			625273953 * Class465.aClass465_5117.anInt5123,
			-1360918615));
	    if (null == aByteArrayArray5716[i])
		aByteArrayArray5716[i]
		    = (Class298_Sub1.aClass472_10064.method7743
		       (anIntArray5714[i],
			625273953 * Class465.aClass465_5115.anInt5123,
			-1122654156));
	    if (aByteArrayArray5692[i] == null)
		aByteArrayArray5692[i]
		    = (Class298_Sub1.aClass472_10064.method7743
		       (anIntArray5714[i],
			Class465.aClass465_5118.anInt5123 * 625273953,
			-1529033521));
	    if (aByteArrayArray5719[i] == null)
		aByteArrayArray5719[i]
		    = (Class298_Sub1.aClass472_10064.method7743
		       (anIntArray5714[i],
			625273953 * Class465.aClass465_5114.anInt5123,
			-759778025));
	    if (aByteArrayArray5717 != null && null == aByteArrayArray5717[i])
		aByteArrayArray5717[i]
		    = (Class298_Sub1.aClass472_10064.method7743
		       (anIntArray5714[i],
			625273953 * Class465.aClass465_5119.anInt5123,
			-1035420103));
	}
	int i = -284446239 * anInt5709;
	Class647 class647 = new Class647(-1);
	Class647 class647_150_ = new Class647(-1);
	anInt5709 = 0;
	for (int i_151_ = 0; i_151_ < anInt5699 * -1729832655; i_151_++) {
	    byte[] is = aByteArrayArray5716[i_151_];
	    if (null != is) {
		int i_152_ = (64 * (anIntArray5718[i_151_] >> 8)
			      - aClass597_5707.anInt7859 * -424199969);
		int i_153_ = ((anIntArray5718[i_151_] & 0xff) * 64
			      - -1166289421 * aClass597_5707.anInt7861);
		if (aClass499_5682.method8264(-1227838746)) {
		    i_152_ = 10;
		    i_153_ = 10;
		}
		int i_154_
		    = Class472.method7745(aClass44_Sub13_5712, is, i_152_,
					  i_153_, -858656915 * anInt5724,
					  -2041900081 * anInt5706,
					  class647_150_, class647, (byte) -77);
		if (i_154_ > 0)
		    anInt5709 += -922463711 * i_154_;
	    }
	    is = aByteArrayArray5719[i_151_];
	    if (null != is) {
		int i_155_ = ((anIntArray5718[i_151_] >> 8) * 64
			      - aClass597_5707.anInt7859 * -424199969);
		int i_156_ = (64 * (anIntArray5718[i_151_] & 0xff)
			      - aClass597_5707.anInt7861 * -1166289421);
		if (aClass499_5682.method8264(-986938916)) {
		    i_155_ = 10;
		    i_156_ = 10;
		}
		int i_157_
		    = Class472.method7745(aClass44_Sub13_5712, is, i_155_,
					  i_156_, anInt5724 * -858656915,
					  anInt5706 * -2041900081,
					  class647_150_, class647, (byte) -56);
		if (i_157_ > 0)
		    anInt5709 += -922463711 * i_157_;
	    }
	}
	if (-284446239 * anInt5709 > 0) {
	    if (i == -284446239 * anInt5709) {
		if (0 != anInt5687 * 1765484627
		    && 1000 == client.anInt11101 - anInt5687 * 1765484627) {
		    Class229.method4203(class647_150_.anInt8375 * 1015861657,
					1015861657 * class647.anInt8375,
					-284446239 * anInt5709, 1780286627);
		    Class539.method8928(-1077778946);
		}
	    } else
		anInt5687 = 1121278939 * client.anInt11101;
	    if (anInt5710 * -1443452255 < anInt5709 * -284446239)
		anInt5710 = 854916929 * anInt5709;
	    aClass507_5695 = Class507.aClass507_5665;
	    return false;
	}
	if (!aBool5713 && Class507.aClass507_5666 != aClass507_5695)
	    Class689.method14015
		(new StringBuilder().append
		     (Class58.aClass58_460.method1245(Class539.aClass672_7171,
						      (byte) -90))
		     .append
		     (Class29.aString264).append
		     ("(100%)").toString(),
		 true, Class254.aClass185_2683, Class539_Sub1.aClass171_10327,
		 Class67.aClass16_720, (byte) -13);
	aClass507_5695 = Class507.aClass507_5667;
	if (!aBool5713 && null != Class171_Sub4.aClass232_9944)
	    Class171_Sub4.aClass232_9944.method4270((byte) -1);
	if (!aBool5713) {
	    for (int i_158_ = 0; i_158_ < 2048; i_158_++) {
		Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		    = client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i_158_];
		if (null != class654_sub1_sub5_sub1_sub2)
		    class654_sub1_sub5_sub1_sub2.aClass556_10855 = null;
	    }
	    for (int i_159_ = 0;
		 i_159_ < client.aClass534_Sub6Array11085.length; i_159_++) {
		Class534_Sub6 class534_sub6
		    = client.aClass534_Sub6Array11085[i_159_];
		if (null != class534_sub6)
		    ((Class654_Sub1)
		     class534_sub6.anObject10417).aClass556_10855
			= null;
	    }
	}
	if (!aBool5713)
	    Class11.method611(true, -1134994716);
	boolean bool = false;
	if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub3_10767
		.method16839(2123878317)
	    == 2) {
	    for (int i_160_ = 0; i_160_ < anInt5699 * -1729832655; i_160_++) {
		if (null != aByteArrayArray5719[i_160_]
		    || aByteArrayArray5692[i_160_] != null) {
		    bool = true;
		    break;
		}
	    }
	}
	int i_161_ = (Class524.method8733(Class44_Sub6
					      .aClass534_Sub35_10989
					      .aClass690_Sub35_10783
					      .method17179((byte) -10),
					  1485266147).anInt3119
		      * 1956245800);
	if (Class254.aClass185_2683.method3333())
	    i_161_++;
	method8439((byte) 8);
	method8452(-460074872);
	aClass556_5721
	    = new Class556(Class254.aClass185_2683, 9, 4,
			   anInt5724 * -858656915, anInt5706 * -2041900081,
			   i_161_, bool,
			   Class254.aClass185_2683.method3344() > 0);
	aClass556_5721.method9228(false, (byte) -41);
	aClass556_5721.method9342(client.anInt11060 * 1757769263, 2134860236);
	aClass556_5721.method9251(aHashMap5723, (byte) -17);
	if (client.anInt11060 * 1757769263 != 0)
	    aClass556_5721.method9227(Class219.aClass171_2307, (byte) 0);
	else
	    aClass556_5721.method9227(null, (byte) 0);
	aClass514_5681 = new Class514();
	aFloat5701 = -0.05F + (float) (Math.random() / 10.0);
	aClass460_Sub1_5686
	    = new Class460_Sub1(aClass556_5721, aClass44_Sub13_5712, 4,
				anInt5724 * -858656915,
				anInt5706 * -2041900081, false, aClass468_5702,
				aClass616_5694);
	aClass460_Sub1_5686.method7446(1899305238);
	aClass460_Sub1_5686.anInt4986
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub6_10743
		  .method16923((byte) 125) * -78666497;
	aClass460_Sub1_5686.aBool5043
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub3_10767
		  .method16839(-909568402) == 2;
	aClass460_Sub1_5686.aBool4998
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub12_10753
		  .method16985(16711680) == 1;
	aClass460_Sub1_5686.aBool4981
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub25_10750
		  .method17102((byte) 0) == 1;
	aClass460_Sub1_5686.aBool4990
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub16_10763
		  .method17030((byte) -1) == 1;
	if (!aClass499_5682.method8264(1196677092))
	    method8425(aClass460_Sub1_5686, aByteArrayArray5715, 735142481);
	else
	    method8522(aClass460_Sub1_5686, aByteArrayArray5715, -1288837941);
	if (aBool5713)
	    method8454(50, -2019753624);
	aClass616_5694.method10153(-858656915 * anInt5724 >> 4,
				   -2041900081 * anInt5706 >> 4, 208545788);
	aClass616_5694.method10141(this, (byte) 32);
	if (bool) {
	    aClass556_5721.method9228(true, (byte) -84);
	    aClass460_Sub1_5685
		= new Class460_Sub1(aClass556_5721, aClass44_Sub13_5712, 1,
				    anInt5724 * -858656915,
				    -2041900081 * anInt5706, true,
				    aClass468_5702, aClass616_5694);
	    aClass460_Sub1_5685.method7446(-402755553);
	    aClass460_Sub1_5685.anInt4986
		= Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub6_10743
		      .method16923((byte) 91) * -78666497;
	    aClass460_Sub1_5685.aBool5043
		= Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub3_10767
		      .method16839(-446825503) == 2;
	    aClass460_Sub1_5685.aBool4998
		= Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub12_10753
		      .method16985(16711680) == 1;
	    aClass460_Sub1_5685.aBool4981
		= Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub25_10750
		      .method17102((byte) -82) == 1;
	    aClass460_Sub1_5685.aBool4990
		= Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub16_10763
		      .method17030((byte) -40) == 1;
	    if (!aClass499_5682.method8264(100832794)) {
		method8425(aClass460_Sub1_5685, aByteArrayArray5692,
			   735142481);
		if (!aBool5713)
		    Class184.method3220(true, (byte) -11);
	    } else {
		method8522(aClass460_Sub1_5685, aByteArrayArray5692,
			   -1604934160);
		if (!aBool5713)
		    Class184.method3220(true, (byte) -59);
	    }
	    aClass460_Sub1_5685.method7459(0,
					   (aClass460_Sub1_5686
					    .anIntArrayArrayArray4995[0]),
					   (byte) 1);
	    aClass460_Sub1_5685.method7454(Class254.aClass185_2683, null,
					   -1805385084);
	    aClass556_5721.method9228(false, (byte) -97);
	    if (aBool5713)
		method8454(50, -1580096766);
	}
	aClass460_Sub1_5686.method7454(Class254.aClass185_2683,
				       (bool
					? (aClass460_Sub1_5685
					   .anIntArrayArrayArray4995)
					: null),
				       -1874746055);
	if (!aClass499_5682.method8264(1051894410)) {
	    if (!aBool5713)
		Class184.method3220(true, (byte) -39);
	    method8457(aClass460_Sub1_5686, aByteArrayArray5716, (byte) 0);
	    if (aByteArrayArray5717 != null)
		method8459(-172304236);
	} else {
	    if (!aBool5713)
		Class184.method3220(true, (byte) -93);
	    method8458(aClass460_Sub1_5686, aByteArrayArray5716, (byte) 64);
	}
	if (!aBool5713)
	    Class184.method3220(true, (byte) -53);
	aClass460_Sub1_5686.method7455(Class254.aClass185_2683,
				       (bool
					? aClass556_5721.aClass151Array7436[0]
					: null),
				       null, (byte) 0);
	if (aBool5713)
	    method8454(75, 1701770071);
	aClass460_Sub1_5686.method15947(Class254.aClass185_2683, false,
					(byte) -29);
	if (aBool5713)
	    method8454(75, 1416633497);
	if (!aBool5713)
	    Class184.method3220(true, (byte) -90);
	if (bool) {
	    aClass556_5721.method9228(true, (byte) -34);
	    if (!aBool5713)
		Class184.method3220(true, (byte) -68);
	    if (!aClass499_5682.method8264(-2146830469))
		method8457(aClass460_Sub1_5685, aByteArrayArray5719, (byte) 0);
	    else
		method8458(aClass460_Sub1_5685, aByteArrayArray5719,
			   (byte) -14);
	    if (!aBool5713)
		Class184.method3220(true, (byte) -13);
	    aClass460_Sub1_5685.method7455(Class254.aClass185_2683, null,
					   (aClass556_5721.aClass151Array7434
					    [0]),
					   (byte) 0);
	    aClass460_Sub1_5685.method15947(Class254.aClass185_2683, true,
					    (byte) 43);
	    if (!aBool5713)
		Class184.method3220(true, (byte) -37);
	    aClass556_5721.method9228(false, (byte) -10);
	    if (aBool5713)
		method8454(50, -666430622);
	}
	aClass460_Sub1_5686.method7470(-1520798724);
	if (aClass460_Sub1_5685 != null)
	    aClass460_Sub1_5685.method7470(2146191213);
	aClass556_5721.method9229(1037868385);
	if (aBool5713) {
	    Class250.method4604((byte) -26);
	    while (!Class254.aClass185_2683.method3669(1819862316))
		method8454(1, -1263735807);
	}
	boolean bool_162_ = false;
	if (aBool5713) {
	    Class512 class512_163_ = client.aClass512_11100;
	    method8423(class512_163_, (byte) 60);
	    Class159.aClass509_1754.method8376(class512_163_, -715690538);
	    bool_162_ = true;
	    Class250.method4604((byte) -49);
	    synchronized (client.anObject11200) {
		client.aBool11139 = true;
		try {
		    client.anObject11200.wait();
		} catch (InterruptedException interruptedexception) {
		    /* empty */
		}
	    }
	    client.aClass512_11100 = this;
	    class512_163_.method8452(2023000084);
	    method8433(3, (short) -13196);
	    method8449(385304360);
	} else {
	    Class171_Sub4.aClass232_9944.method4270((byte) -1);
	    aClass616_5694.method10162(1574250592);
	    Class563.method9513(1989687144);
	}
	for (int i_164_ = 0; i_164_ < 4; i_164_++) {
	    for (int i_165_ = 0; i_165_ < anInt5724 * -858656915; i_165_++) {
		for (int i_166_ = 0; i_166_ < anInt5706 * -2041900081;
		     i_166_++)
		    Class563.method9510(i_164_, i_165_, i_166_, (short) 18838);
	    }
	}
	for (int i_167_ = 0; i_167_ < client.aClass530Array11054.length;
	     i_167_++) {
	    if (client.aClass530Array11054[i_167_] != null)
		client.aClass530Array11054[i_167_].method8842(-1382436271);
	}
	Class453_Sub5.method16008((byte) -74);
	Class464.method7567((byte) -66);
	if (Class309.method5657((byte) 6) == Class508.aClass508_5669
	    && client.aClass100_11264.method1867(814338955) != null
	    && -1850530127 * client.anInt11039 == 3) {
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4240,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16510(1057001181,
								  -105245392);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 54);
	}
	if (!aClass499_5682.method8264(-1868088570)) {
	    int i_168_
		= (anInt5689 * 996655731 - (-858656915 * anInt5724 >> 4)) / 8;
	    int i_169_
		= (anInt5689 * 996655731 + (anInt5724 * -858656915 >> 4)) / 8;
	    int i_170_
		= (anInt5690 * 102545369 - (anInt5706 * -2041900081 >> 4)) / 8;
	    int i_171_
		= (102545369 * anInt5690 + (anInt5706 * -2041900081 >> 4)) / 8;
	    for (int i_172_ = i_168_ - 1; i_172_ <= i_169_ + 1; i_172_++) {
		for (int i_173_ = i_170_ - 1; i_173_ <= i_171_ + 1; i_173_++) {
		    if (i_172_ < i_168_ || i_172_ > i_169_ || i_173_ < i_170_
			|| i_173_ > i_171_)
			Class298_Sub1.aClass472_10064.method7666
			    (method8447(i_172_, i_173_, 649126563), 297966126);
		}
	    }
	}
	long l = (Class250.method4604((byte) -71)
		  - aLong5711 * 1097591286410319761L);
	if (10 == -1850530127 * client.anInt11039)
	    Class673.method11110(15, 95117130);
	else if (17 == -1850530127 * client.anInt11039)
	    Class673.method11110(9, -1119301415);
	else if (-1850530127 * client.anInt11039 == 6)
	    Class673.method11110(7, 523693473);
	else if (0 == client.anInt11039 * -1850530127)
	    Class673.method11110(18, -1026744734);
	else {
	    Class673.method11110(16, 15111555);
	    if (client.aClass100_11264.method1867(347003740) != null) {
		Class534_Sub19 class534_sub19
		    = Class346.method6128(Class404.aClass404_4165,
					  client.aClass100_11264.aClass13_1183,
					  1341391005);
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16510((int) l, -1716048238);
		client.aClass100_11264.method1863(class534_sub19, (byte) 111);
	    }
	}
	if (aBool5700) {
	    Class73.method1567(Long.toString(Class250.method4604((byte) -33)
					     - (-746363806453947029L
						* aLong5722)),
			       -906536008);
	    aBool5700 = false;
	}
	if (bool_162_) {
	    synchronized (client.anObject11102) {
		client.anObject11102.notify();
	    }
	}
	return true;
    }
    
    public float method8480() {
	return aFloat5701;
    }
    
    public int method8481() {
	return -2135507245 * anInt5696;
    }
    
    public int[][] method8482() {
	return anIntArrayArray5704;
    }
    
    public int method8483() {
	return -2135507245 * anInt5696;
    }
    
    public int method8484() {
	return -2135507245 * anInt5696;
    }
    
    public int method8485() {
	return -921893665 * anInt5697;
    }
    
    public void method8486(byte[][][] is) {
	aByteArrayArrayArray5705 = is;
    }
    
    public int method8487() {
	return -921893665 * anInt5697;
    }
    
    public Class556 method8488() {
	return aClass556_5721;
    }
    
    public Class556 method8489() {
	return aClass556_5721;
    }
    
    void method8490(int i) {
	try {
	    Thread.sleep((long) i);
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    public byte[][] method8491(int i) {
	if (null != aClass460_Sub1_5686
	    && aClass460_Sub1_5686.aByteArrayArrayArray5067 != null
	    && null != aClass460_Sub1_5686.aByteArrayArrayArray5067[i])
	    return aClass460_Sub1_5686.aByteArrayArrayArray5067[i];
	return null;
    }
    
    void method8492() {
	aClass460_Sub1_5685 = null;
	aClass460_Sub1_5686 = null;
	if (null != aClass468_5702)
	    aClass468_5702.method7607(65280);
	if (aClass616_5694 != null)
	    aClass616_5694.method10140(-907127);
	if (aClass556_5721 != null) {
	    aClass556_5721.aClass557_7478.method9407((short) 2902);
	    aClass556_5721 = null;
	}
    }
    
    public Class460_Sub1 method8493(int i) {
	return aClass460_Sub1_5686;
    }
    
    public Class44_Sub13 method8494() {
	return aClass44_Sub13_5712;
    }
    
    public Class44_Sub13 method8495() {
	return aClass44_Sub13_5712;
    }
    
    public int[][] method8496() {
	return anIntArrayArray5703;
    }
    
    public Class597 method8497() {
	return aClass597_5707;
    }
    
    public int[][] method8498() {
	return anIntArrayArray5704;
    }
    
    public int[][] method8499() {
	return anIntArrayArray5704;
    }
    
    public void method8500(byte[][][] is) {
	aByteArrayArrayArray5705 = is;
    }
    
    public Class616 method8501(byte i) {
	return aClass616_5694;
    }
    
    void method8502() {
	aClass460_Sub1_5685 = null;
	aClass460_Sub1_5686 = null;
	if (null != aClass468_5702)
	    aClass468_5702.method7607(65280);
	if (aClass616_5694 != null)
	    aClass616_5694.method10140(-907127);
	if (aClass556_5721 != null) {
	    aClass556_5721.aClass557_7478.method9407((short) 21916);
	    aClass556_5721 = null;
	}
    }
    
    public void method8503(Class44_Sub13 class44_sub13) {
	aClass44_Sub13_5712 = class44_sub13;
    }
    
    public void method8504() {
	anInt5696 = -1623634152;
	if (-858656915 * anInt5724 == 0)
	    anInt5697 = 2015729170;
	else
	    anInt5697 = ((int) (34.46 * (double) (-858656915 * anInt5724))
			 * 204453663);
	anInt5697 = 204453663 * (anInt5697 * -921893665 << 2);
	if (Class254.aClass185_2683.method3333())
	    anInt5697 += 1601060352;
    }
    
    public void method8505(Class44_Sub13 class44_sub13) {
	aClass44_Sub13_5712 = class44_sub13;
    }
    
    public void method8506(Class44_Sub13 class44_sub13) {
	aClass44_Sub13_5712 = class44_sub13;
    }
    
    public void method8507(Class44_Sub13 class44_sub13) {
	aClass44_Sub13_5712 = class44_sub13;
    }
    
    void method8508(Class534_Sub40_Sub1 class534_sub40_sub1) {
	int i = class534_sub40_sub1.method16572((byte) 20);
	boolean bool = class534_sub40_sub1.method16527(420321588) == 1;
	int i_174_ = class534_sub40_sub1.method16643(-2033041063);
	anInt5725 = class534_sub40_sub1.method16527(-1954465344) * 1826695267;
	int i_175_ = class534_sub40_sub1.method16563((byte) -66);
	int i_176_ = class534_sub40_sub1.method16571(-1330346460);
	if (!aBool5713)
	    method8449(1334603698);
	method8448(Class162.method2643(i_174_, -2094707802), 2048379745);
	anIntArray5718 = new int[i_175_];
	anIntArray5714 = new int[i_175_];
	aByteArrayArray5715 = new byte[i_175_][];
	aByteArrayArray5716 = new byte[i_175_][];
	aByteArrayArray5717 = null;
	aByteArrayArray5692 = new byte[i_175_][];
	aByteArrayArray5719 = new byte[i_175_][];
	i_175_ = 0;
	for (int i_177_ = (i - (-858656915 * anInt5724 >> 4)) / 8;
	     i_177_ <= ((anInt5724 * -858656915 >> 4) + i) / 8; i_177_++) {
	    for (int i_178_ = (i_176_ - (anInt5706 * -2041900081 >> 4)) / 8;
		 i_178_ <= (i_176_ + (-2041900081 * anInt5706 >> 4)) / 8;
		 i_178_++) {
		if (Class298_Sub1.aClass472_10064.method7664
		    (method8447(i_177_, i_178_, 39101126),
		     Class465.aClass465_5117.anInt5123 * 625273953,
		     929439940)) {
		    anIntArray5718[i_175_] = i_178_ + (i_177_ << 8);
		    anIntArray5714[i_175_]
			= method8447(i_177_, i_178_, -1409490693);
		    i_175_++;
		}
	    }
	}
	anInt5699 = -179707951 * i_175_;
	method8436(i, i_176_, 3, bool, -1306650798);
    }
    
    public void method8509() {
	aClass597_5707 = new Class597();
	anInt5690 = 0;
	anInt5689 = 0;
    }
    
    public void method8510() {
	aClass597_5707 = new Class597();
	anInt5690 = 0;
	anInt5689 = 0;
    }
    
    public int method8511() {
	return -2041900081 * anInt5706;
    }
    
    void method8512() {
	if (Class499.aClass499_5594 != aClass499_5682
	    && aClass499_5683 != Class499.aClass499_5594) {
	    if (aClass499_5682 == Class499.aClass499_5598
		|| Class499.aClass499_5602 == aClass499_5682
		|| (aClass499_5682 != aClass499_5683
		    && (Class499.aClass499_5595 == aClass499_5682
			|| aClass499_5683 == Class499.aClass499_5595))) {
		Iterator iterator = client.aClass9_11331.iterator();
		while (iterator.hasNext()) {
		    Class534_Sub6 class534_sub6
			= (Class534_Sub6) iterator.next();
		    Class694.method14069(((Class654_Sub1_Sub5_Sub1_Sub1)
					  class534_sub6.anObject10417),
					 -836779145);
		}
		client.anInt11321 = 0;
		client.anInt11148 = 0;
		client.aClass9_11331.method578((byte) 18);
	    }
	    aClass499_5683 = aClass499_5682;
	}
    }
    
    public void method8513(boolean bool) {
	Class653 class653 = null;
	if (null != aClass616_5694 && bool)
	    class653 = aClass616_5694.method10144(385305078);
	aClass616_5694
	    = new Class616(Class254.aClass185_2683, Class464.aClass472_5113,
			   -858656915 * anInt5724 >> 3,
			   -2041900081 * anInt5706 >> 3);
	if (class653 != null)
	    aClass616_5694.method10216(this, class653, 0, (byte) 67);
    }
    
    public void method8514() {
	aClass616_5694.method10216(this, null, 0, (byte) 125);
    }
    
    public void method8515() {
	aClass616_5694.method10216(this, null, 0, (byte) 80);
    }
    
    public Class44_Sub13 method8516() {
	return aClass44_Sub13_5712;
    }
    
    public void method8517() {
	anInt5696 = -1623634152;
	if (-858656915 * anInt5724 == 0)
	    anInt5697 = 2015729170;
	else
	    anInt5697 = ((int) (34.46 * (double) (-858656915 * anInt5724))
			 * 204453663);
	anInt5697 = 204453663 * (anInt5697 * -921893665 << 2);
	if (Class254.aClass185_2683.method3333())
	    anInt5697 += 1601060352;
    }
    
    void method8518(Class512 class512_179_) {
	boolean bool = class512_179_.aBool5713;
	class512_179_.aBool5713 = aBool5713;
	aBool5713 = bool;
	Class499 class499 = class512_179_.aClass499_5683;
	class512_179_.aClass499_5683 = aClass499_5683;
	aClass499_5683 = class499;
	class512_179_.aClass597_5688 = aClass597_5707;
	aClass597_5688 = class512_179_.aClass597_5707;
	aClass616_5694.method10146(class512_179_.method8501((byte) 24),
				   -1657102552);
    }
    
    void method8519(Class512 class512_180_) {
	boolean bool = class512_180_.aBool5713;
	class512_180_.aBool5713 = aBool5713;
	aBool5713 = bool;
	Class499 class499 = class512_180_.aClass499_5683;
	class512_180_.aClass499_5683 = aClass499_5683;
	aClass499_5683 = class499;
	class512_180_.aClass597_5688 = aClass597_5707;
	aClass597_5688 = class512_180_.aClass597_5707;
	aClass616_5694.method10146(class512_180_.method8501((byte) -29),
				   4779320);
    }
    
    void method8520(Class460_Sub1 class460_sub1, byte[][] is) {
	for (int i = 0; i < anInt5699 * -1729832655; i++) {
	    byte[] is_181_ = is[i];
	    if (is_181_ != null) {
		int i_182_ = ((anIntArray5718[i] >> 8) * 64
			      - -424199969 * aClass597_5707.anInt7859);
		int i_183_ = ((anIntArray5718[i] & 0xff) * 64
			      - aClass597_5707.anInt7861 * -1166289421);
		if (!aBool5713)
		    Class171_Sub4.aClass232_9944.method4270((byte) -1);
		class460_sub1.method15940(Class254.aClass185_2683, is_181_,
					  i_182_, i_183_, -1536094921);
		if (aBool5713)
		    method8454(10, -1003290959);
	    }
	}
    }
    
    public Class460_Sub1 method8521() {
	return aClass460_Sub1_5686;
    }
    
    void method8522(Class460_Sub1 class460_sub1, byte[][] is, int i) {
	for (int i_184_ = 0; i_184_ < -692901467 * class460_sub1.anInt4991;
	     i_184_++) {
	    if (!aBool5713)
		Class171_Sub4.aClass232_9944.method4270((byte) -1);
	    for (int i_185_ = 0; i_185_ < -858656915 * anInt5724 >> 3;
		 i_185_++) {
		for (int i_186_ = 0; i_186_ < anInt5706 * -2041900081 >> 3;
		     i_186_++) {
		    int i_187_
			= anIntArrayArrayArray5720[i_184_][i_185_][i_186_];
		    if (i_187_ != -1) {
			int i_188_ = i_187_ >> 24 & 0x3;
			if (!class460_sub1.aBool5002 || 0 == i_188_) {
			    int i_189_ = i_187_ >> 1 & 0x3;
			    int i_190_ = i_187_ >> 14 & 0x3ff;
			    int i_191_ = i_187_ >> 3 & 0x7ff;
			    int i_192_ = (i_190_ / 8 << 8) + i_191_ / 8;
			    for (int i_193_ = 0;
				 i_193_ < anIntArray5718.length; i_193_++) {
				if (anIntArray5718[i_193_] == i_192_
				    && null != is[i_193_]) {
				    Class534_Sub40 class534_sub40
					= new Class534_Sub40(is[i_193_]);
				    class460_sub1.method7451(class534_sub40,
							     i_184_,
							     i_185_ * 8,
							     i_186_ * 8,
							     i_188_, i_190_,
							     i_191_, i_189_,
							     17054994);
				    class460_sub1.method15949
					(Class254.aClass185_2683,
					 class534_sub40, i_184_, 8 * i_185_,
					 8 * i_186_, i_188_, i_190_, i_191_,
					 i_189_, -1030488951);
				    break;
				}
			    }
			}
		    }
		}
	    }
	}
	for (int i_194_ = 0; i_194_ < -692901467 * class460_sub1.anInt4991;
	     i_194_++) {
	    if (!aBool5713)
		Class171_Sub4.aClass232_9944.method4270((byte) -1);
	    for (int i_195_ = 0; i_195_ < anInt5724 * -858656915 >> 3;
		 i_195_++) {
		for (int i_196_ = 0; i_196_ < anInt5706 * -2041900081 >> 3;
		     i_196_++) {
		    int i_197_
			= anIntArrayArrayArray5720[i_194_][i_195_][i_196_];
		    if (i_197_ == -1)
			class460_sub1.method7449(i_194_, 8 * i_195_,
						 8 * i_196_, 8, 8, -904088808);
		}
	    }
	}
    }
    
    public boolean method8523() {
	if (!aBool5713)
	    Class184.method3220(false, (byte) -37);
	if (aLong5711 * 1097591286410319761L == -1L)
	    aLong5711
		= Class250.method4604((byte) -90) * -2452396203634292367L;
	anInt5693 = 0;
	for (int i = 0; i < anInt5699 * -1729832655; i++) {
	    if (!Class298_Sub1.aClass472_10064.method7681(anIntArray5714[i],
							  1255697076))
		anInt5693 += 58619833;
	}
	if (aClass523_5691 == null) {
	    if (null != aClass534_Sub18_Sub9_5698
		&& Class74.aClass472_800.method7685((aClass534_Sub18_Sub9_5698
						     .aString11765),
						    (short) -20109)) {
		if (!Class74.aClass472_800.method7705
		     (aClass534_Sub18_Sub9_5698.aString11765, -201907276))
		    anInt5693 += 58619833;
		else
		    aClass523_5691
			= Class369.method6378(Class74.aClass472_800,
					      (aClass534_Sub18_Sub9_5698
					       .aString11765),
					      client.aBool11157, (byte) -18);
	    } else
		aClass523_5691 = new Class523(0);
	}
	if (-1304666487 * anInt5693 > 0) {
	    if (anInt5708 * -568733371 < anInt5693 * -1304666487)
		anInt5708 = -961318283 * anInt5693;
	    aClass507_5695 = Class507.aClass507_5664;
	    return false;
	}
	for (int i = 0; i < -1729832655 * anInt5699; i++) {
	    if (aByteArrayArray5715[i] == null)
		aByteArrayArray5715[i]
		    = (Class298_Sub1.aClass472_10064.method7743
		       (anIntArray5714[i],
			625273953 * Class465.aClass465_5117.anInt5123,
			-1436223696));
	    if (null == aByteArrayArray5716[i])
		aByteArrayArray5716[i]
		    = (Class298_Sub1.aClass472_10064.method7743
		       (anIntArray5714[i],
			625273953 * Class465.aClass465_5115.anInt5123,
			-761756970));
	    if (aByteArrayArray5692[i] == null)
		aByteArrayArray5692[i]
		    = (Class298_Sub1.aClass472_10064.method7743
		       (anIntArray5714[i],
			Class465.aClass465_5118.anInt5123 * 625273953,
			-2064521526));
	    if (aByteArrayArray5719[i] == null)
		aByteArrayArray5719[i]
		    = (Class298_Sub1.aClass472_10064.method7743
		       (anIntArray5714[i],
			625273953 * Class465.aClass465_5114.anInt5123,
			-1432354671));
	    if (aByteArrayArray5717 != null && null == aByteArrayArray5717[i])
		aByteArrayArray5717[i]
		    = (Class298_Sub1.aClass472_10064.method7743
		       (anIntArray5714[i],
			625273953 * Class465.aClass465_5119.anInt5123,
			-970745741));
	}
	int i = -284446239 * anInt5709;
	Class647 class647 = new Class647(-1);
	Class647 class647_198_ = new Class647(-1);
	anInt5709 = 0;
	for (int i_199_ = 0; i_199_ < anInt5699 * -1729832655; i_199_++) {
	    byte[] is = aByteArrayArray5716[i_199_];
	    if (null != is) {
		int i_200_ = (64 * (anIntArray5718[i_199_] >> 8)
			      - aClass597_5707.anInt7859 * -424199969);
		int i_201_ = ((anIntArray5718[i_199_] & 0xff) * 64
			      - -1166289421 * aClass597_5707.anInt7861);
		if (aClass499_5682.method8264(668629623)) {
		    i_200_ = 10;
		    i_201_ = 10;
		}
		int i_202_
		    = Class472.method7745(aClass44_Sub13_5712, is, i_200_,
					  i_201_, -858656915 * anInt5724,
					  -2041900081 * anInt5706,
					  class647_198_, class647, (byte) -67);
		if (i_202_ > 0)
		    anInt5709 += -922463711 * i_202_;
	    }
	    is = aByteArrayArray5719[i_199_];
	    if (null != is) {
		int i_203_ = ((anIntArray5718[i_199_] >> 8) * 64
			      - aClass597_5707.anInt7859 * -424199969);
		int i_204_ = (64 * (anIntArray5718[i_199_] & 0xff)
			      - aClass597_5707.anInt7861 * -1166289421);
		if (aClass499_5682.method8264(-452993986)) {
		    i_203_ = 10;
		    i_204_ = 10;
		}
		int i_205_
		    = Class472.method7745(aClass44_Sub13_5712, is, i_203_,
					  i_204_, anInt5724 * -858656915,
					  anInt5706 * -2041900081,
					  class647_198_, class647, (byte) -69);
		if (i_205_ > 0)
		    anInt5709 += -922463711 * i_205_;
	    }
	}
	if (-284446239 * anInt5709 > 0) {
	    if (i == -284446239 * anInt5709) {
		if (0 != anInt5687 * 1765484627
		    && 1000 == client.anInt11101 - anInt5687 * 1765484627) {
		    Class229.method4203(class647_198_.anInt8375 * 1015861657,
					1015861657 * class647.anInt8375,
					-284446239 * anInt5709, 287573617);
		    Class539.method8928(1455459247);
		}
	    } else
		anInt5687 = 1121278939 * client.anInt11101;
	    if (anInt5710 * -1443452255 < anInt5709 * -284446239)
		anInt5710 = 854916929 * anInt5709;
	    aClass507_5695 = Class507.aClass507_5665;
	    return false;
	}
	if (!aBool5713 && Class507.aClass507_5666 != aClass507_5695)
	    Class689.method14015
		(new StringBuilder().append
		     (Class58.aClass58_460.method1245(Class539.aClass672_7171,
						      (byte) -27))
		     .append
		     (Class29.aString264).append
		     ("(100%)").toString(),
		 true, Class254.aClass185_2683, Class539_Sub1.aClass171_10327,
		 Class67.aClass16_720, (byte) -64);
	aClass507_5695 = Class507.aClass507_5667;
	if (!aBool5713 && null != Class171_Sub4.aClass232_9944)
	    Class171_Sub4.aClass232_9944.method4270((byte) -1);
	if (!aBool5713) {
	    for (int i_206_ = 0; i_206_ < 2048; i_206_++) {
		Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		    = client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i_206_];
		if (null != class654_sub1_sub5_sub1_sub2)
		    class654_sub1_sub5_sub1_sub2.aClass556_10855 = null;
	    }
	    for (int i_207_ = 0;
		 i_207_ < client.aClass534_Sub6Array11085.length; i_207_++) {
		Class534_Sub6 class534_sub6
		    = client.aClass534_Sub6Array11085[i_207_];
		if (null != class534_sub6)
		    ((Class654_Sub1)
		     class534_sub6.anObject10417).aClass556_10855
			= null;
	    }
	}
	if (!aBool5713)
	    Class11.method611(true, -1409357332);
	boolean bool = false;
	if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub3_10767
		.method16839(-1506807015)
	    == 2) {
	    for (int i_208_ = 0; i_208_ < anInt5699 * -1729832655; i_208_++) {
		if (null != aByteArrayArray5719[i_208_]
		    || aByteArrayArray5692[i_208_] != null) {
		    bool = true;
		    break;
		}
	    }
	}
	int i_209_ = (Class524.method8733(Class44_Sub6
					      .aClass534_Sub35_10989
					      .aClass690_Sub35_10783
					      .method17179((byte) 0),
					  1485266147).anInt3119
		      * 1956245800);
	if (Class254.aClass185_2683.method3333())
	    i_209_++;
	method8439((byte) 8);
	method8452(-964096743);
	aClass556_5721
	    = new Class556(Class254.aClass185_2683, 9, 4,
			   anInt5724 * -858656915, anInt5706 * -2041900081,
			   i_209_, bool,
			   Class254.aClass185_2683.method3344() > 0);
	aClass556_5721.method9228(false, (byte) -98);
	aClass556_5721.method9342(client.anInt11060 * 1757769263, -1531995775);
	aClass556_5721.method9251(aHashMap5723, (byte) -62);
	if (client.anInt11060 * 1757769263 != 0)
	    aClass556_5721.method9227(Class219.aClass171_2307, (byte) 0);
	else
	    aClass556_5721.method9227(null, (byte) 0);
	aClass514_5681 = new Class514();
	aFloat5701 = -0.05F + (float) (Math.random() / 10.0);
	aClass460_Sub1_5686
	    = new Class460_Sub1(aClass556_5721, aClass44_Sub13_5712, 4,
				anInt5724 * -858656915,
				anInt5706 * -2041900081, false, aClass468_5702,
				aClass616_5694);
	aClass460_Sub1_5686.method7446(-1527972874);
	aClass460_Sub1_5686.anInt4986
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub6_10743
		  .method16923((byte) 86) * -78666497;
	aClass460_Sub1_5686.aBool5043
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub3_10767
		  .method16839(-141045817) == 2;
	aClass460_Sub1_5686.aBool4998
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub12_10753
		  .method16985(16711680) == 1;
	aClass460_Sub1_5686.aBool4981
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub25_10750
		  .method17102((byte) -31) == 1;
	aClass460_Sub1_5686.aBool4990
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub16_10763
		  .method17030((byte) -66) == 1;
	if (!aClass499_5682.method8264(868743869))
	    method8425(aClass460_Sub1_5686, aByteArrayArray5715, 735142481);
	else
	    method8522(aClass460_Sub1_5686, aByteArrayArray5715, -873587968);
	if (aBool5713)
	    method8454(50, 1910106292);
	aClass616_5694.method10153(-858656915 * anInt5724 >> 4,
				   -2041900081 * anInt5706 >> 4, 1974194278);
	aClass616_5694.method10141(this, (byte) 107);
	if (bool) {
	    aClass556_5721.method9228(true, (byte) -98);
	    aClass460_Sub1_5685
		= new Class460_Sub1(aClass556_5721, aClass44_Sub13_5712, 1,
				    anInt5724 * -858656915,
				    -2041900081 * anInt5706, true,
				    aClass468_5702, aClass616_5694);
	    aClass460_Sub1_5685.method7446(-1861233461);
	    aClass460_Sub1_5685.anInt4986
		= Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub6_10743
		      .method16923((byte) 112) * -78666497;
	    aClass460_Sub1_5685.aBool5043
		= Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub3_10767
		      .method16839(2003368397) == 2;
	    aClass460_Sub1_5685.aBool4998
		= Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub12_10753
		      .method16985(16711680) == 1;
	    aClass460_Sub1_5685.aBool4981
		= Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub25_10750
		      .method17102((byte) -75) == 1;
	    aClass460_Sub1_5685.aBool4990
		= Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub16_10763
		      .method17030((byte) 45) == 1;
	    if (!aClass499_5682.method8264(313188212)) {
		method8425(aClass460_Sub1_5685, aByteArrayArray5692,
			   735142481);
		if (!aBool5713)
		    Class184.method3220(true, (byte) -86);
	    } else {
		method8522(aClass460_Sub1_5685, aByteArrayArray5692,
			   682118850);
		if (!aBool5713)
		    Class184.method3220(true, (byte) -66);
	    }
	    aClass460_Sub1_5685.method7459(0,
					   (aClass460_Sub1_5686
					    .anIntArrayArrayArray4995[0]),
					   (byte) 1);
	    aClass460_Sub1_5685.method7454(Class254.aClass185_2683, null,
					   -1886758617);
	    aClass556_5721.method9228(false, (byte) 3);
	    if (aBool5713)
		method8454(50, -218020524);
	}
	aClass460_Sub1_5686.method7454(Class254.aClass185_2683,
				       (bool
					? (aClass460_Sub1_5685
					   .anIntArrayArrayArray4995)
					: null),
				       -1528623024);
	if (!aClass499_5682.method8264(-1864386199)) {
	    if (!aBool5713)
		Class184.method3220(true, (byte) -8);
	    method8457(aClass460_Sub1_5686, aByteArrayArray5716, (byte) 0);
	    if (aByteArrayArray5717 != null)
		method8459(2034223417);
	} else {
	    if (!aBool5713)
		Class184.method3220(true, (byte) -83);
	    method8458(aClass460_Sub1_5686, aByteArrayArray5716, (byte) 22);
	}
	if (!aBool5713)
	    Class184.method3220(true, (byte) -14);
	aClass460_Sub1_5686.method7455(Class254.aClass185_2683,
				       (bool
					? aClass556_5721.aClass151Array7436[0]
					: null),
				       null, (byte) 0);
	if (aBool5713)
	    method8454(75, -1149442500);
	aClass460_Sub1_5686.method15947(Class254.aClass185_2683, false,
					(byte) -119);
	if (aBool5713)
	    method8454(75, 914135257);
	if (!aBool5713)
	    Class184.method3220(true, (byte) -21);
	if (bool) {
	    aClass556_5721.method9228(true, (byte) -106);
	    if (!aBool5713)
		Class184.method3220(true, (byte) -63);
	    if (!aClass499_5682.method8264(558301767))
		method8457(aClass460_Sub1_5685, aByteArrayArray5719, (byte) 0);
	    else
		method8458(aClass460_Sub1_5685, aByteArrayArray5719,
			   (byte) 39);
	    if (!aBool5713)
		Class184.method3220(true, (byte) -84);
	    aClass460_Sub1_5685.method7455(Class254.aClass185_2683, null,
					   (aClass556_5721.aClass151Array7434
					    [0]),
					   (byte) 0);
	    aClass460_Sub1_5685.method15947(Class254.aClass185_2683, true,
					    (byte) 35);
	    if (!aBool5713)
		Class184.method3220(true, (byte) -120);
	    aClass556_5721.method9228(false, (byte) -53);
	    if (aBool5713)
		method8454(50, -1545747015);
	}
	aClass460_Sub1_5686.method7470(785361992);
	if (aClass460_Sub1_5685 != null)
	    aClass460_Sub1_5685.method7470(877489550);
	aClass556_5721.method9229(1294806910);
	if (aBool5713) {
	    Class250.method4604((byte) -47);
	    while (!Class254.aClass185_2683.method3669(1819862316))
		method8454(1, 747080842);
	}
	boolean bool_210_ = false;
	if (aBool5713) {
	    Class512 class512_211_ = client.aClass512_11100;
	    method8423(class512_211_, (byte) 12);
	    Class159.aClass509_1754.method8376(class512_211_, -715690538);
	    bool_210_ = true;
	    Class250.method4604((byte) -98);
	    synchronized (client.anObject11200) {
		client.aBool11139 = true;
		try {
		    client.anObject11200.wait();
		} catch (InterruptedException interruptedexception) {
		    /* empty */
		}
	    }
	    client.aClass512_11100 = this;
	    class512_211_.method8452(-334551709);
	    method8433(3, (short) -216);
	    method8449(-1082389065);
	} else {
	    Class171_Sub4.aClass232_9944.method4270((byte) -1);
	    aClass616_5694.method10162(2145443288);
	    Class563.method9513(1212944321);
	}
	for (int i_212_ = 0; i_212_ < 4; i_212_++) {
	    for (int i_213_ = 0; i_213_ < anInt5724 * -858656915; i_213_++) {
		for (int i_214_ = 0; i_214_ < anInt5706 * -2041900081;
		     i_214_++)
		    Class563.method9510(i_212_, i_213_, i_214_, (short) 16130);
	    }
	}
	for (int i_215_ = 0; i_215_ < client.aClass530Array11054.length;
	     i_215_++) {
	    if (client.aClass530Array11054[i_215_] != null)
		client.aClass530Array11054[i_215_].method8842(-1424239223);
	}
	Class453_Sub5.method16008((byte) -57);
	Class464.method7567((byte) -80);
	if (Class309.method5657((byte) 78) == Class508.aClass508_5669
	    && client.aClass100_11264.method1867(1994712280) != null
	    && -1850530127 * client.anInt11039 == 3) {
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4240,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16510(1057001181,
								  -675183592);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 48);
	}
	if (!aClass499_5682.method8264(-773318171)) {
	    int i_216_
		= (anInt5689 * 996655731 - (-858656915 * anInt5724 >> 4)) / 8;
	    int i_217_
		= (anInt5689 * 996655731 + (anInt5724 * -858656915 >> 4)) / 8;
	    int i_218_
		= (anInt5690 * 102545369 - (anInt5706 * -2041900081 >> 4)) / 8;
	    int i_219_
		= (102545369 * anInt5690 + (anInt5706 * -2041900081 >> 4)) / 8;
	    for (int i_220_ = i_216_ - 1; i_220_ <= i_217_ + 1; i_220_++) {
		for (int i_221_ = i_218_ - 1; i_221_ <= i_219_ + 1; i_221_++) {
		    if (i_220_ < i_216_ || i_220_ > i_217_ || i_221_ < i_218_
			|| i_221_ > i_219_)
			Class298_Sub1.aClass472_10064.method7666
			    (method8447(i_220_, i_221_, 367475482),
			     -979476562);
		}
	    }
	}
	long l = (Class250.method4604((byte) -41)
		  - aLong5711 * 1097591286410319761L);
	if (10 == -1850530127 * client.anInt11039)
	    Class673.method11110(15, -2051574644);
	else if (17 == -1850530127 * client.anInt11039)
	    Class673.method11110(9, 597488594);
	else if (-1850530127 * client.anInt11039 == 6)
	    Class673.method11110(7, -1719602385);
	else if (0 == client.anInt11039 * -1850530127)
	    Class673.method11110(18, -1617740980);
	else {
	    Class673.method11110(16, -1863422932);
	    if (client.aClass100_11264.method1867(801380586) != null) {
		Class534_Sub19 class534_sub19
		    = Class346.method6128(Class404.aClass404_4165,
					  client.aClass100_11264.aClass13_1183,
					  1341391005);
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16510((int) l, -434077834);
		client.aClass100_11264.method1863(class534_sub19, (byte) 48);
	    }
	}
	if (aBool5700) {
	    Class73.method1567(Long.toString(Class250.method4604((byte) -16)
					     - (-746363806453947029L
						* aLong5722)),
			       -1280898659);
	    aBool5700 = false;
	}
	if (bool_210_) {
	    synchronized (client.anObject11102) {
		client.anObject11102.notify();
	    }
	}
	return true;
    }
    
    public void method8524(Class511 class511) {
	aClass499_5682 = class511.aClass499_5680;
	if (aClass499_5682 == Class499.aClass499_5597)
	    method8463(-1395166223);
	else if (Class499.aClass499_5595 == aClass499_5682)
	    method8444(class511.aClass534_Sub40_Sub1_5679, 648390549);
	else if (Class499.aClass499_5594 == aClass499_5682)
	    method8446(-1185246647);
	else if (aClass499_5682.method8264(-444861618))
	    method8445(class511.aClass534_Sub40_Sub1_5679, 2135498797);
    }
    
    public void method8525(Class511 class511) {
	aClass499_5682 = class511.aClass499_5680;
	if (aClass499_5682 == Class499.aClass499_5597)
	    method8463(-1395166223);
	else if (Class499.aClass499_5595 == aClass499_5682)
	    method8444(class511.aClass534_Sub40_Sub1_5679, 405285921);
	else if (Class499.aClass499_5594 == aClass499_5682)
	    method8446(935274621);
	else if (aClass499_5682.method8264(860998888))
	    method8445(class511.aClass534_Sub40_Sub1_5679, 1067372800);
    }
    
    void method8526() {
	method8448(Class162.method2643(Class44_Sub6.aClass534_Sub35_10989
					   .aClass690_Sub22_10745
					   .method17078(1873569032),
				       -1894744415),
		   528721602);
	int i = aClass597_5707.anInt7859 * -424199969;
	int i_222_ = -1166289421 * aClass597_5707.anInt7861;
	int i_223_ = (-116109187 * Class200_Sub13.anInt9937 >> 12) + (i >> 3);
	int i_224_ = (-1098179003 * Class636.anInt8305 >> 12) + (i_222_ >> 3);
	Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aByte10854 = (byte) 0;
	Class674.anInt8633 = 0;
	Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method18871(8, 8,
								-1914980734);
	int i_225_ = 18;
	anIntArray5718 = new int[i_225_];
	anIntArray5714 = new int[i_225_];
	aByteArrayArray5715 = new byte[i_225_][];
	aByteArrayArray5716 = new byte[i_225_][];
	aByteArrayArray5717 = new byte[i_225_][];
	aByteArrayArray5692 = new byte[i_225_][];
	aByteArrayArray5719 = new byte[i_225_][];
	i_225_ = 0;
	for (int i_226_ = (i_223_ - (anInt5724 * -858656915 >> 4)) / 8;
	     i_226_ <= ((anInt5724 * -858656915 >> 4) + i_223_) / 8;
	     i_226_++) {
	    for (int i_227_ = (i_224_ - (anInt5706 * -2041900081 >> 4)) / 8;
		 i_227_ <= ((-2041900081 * anInt5706 >> 4) + i_224_) / 8;
		 i_227_++) {
		int i_228_ = i_227_ + (i_226_ << 8);
		if (Class298_Sub1.aClass472_10064.method7664
		    (method8447(i_226_, i_227_, -1688307466),
		     625273953 * Class465.aClass465_5117.anInt5123,
		     -1824761963)) {
		    anIntArray5718[i_225_] = i_228_;
		    anIntArray5714[i_225_]
			= method8447(i_226_, i_227_, -1006824817);
		    i_225_++;
		}
	    }
	}
	anInt5699 = -179707951 * i_225_;
	int i_229_;
	if (-1850530127 * client.anInt11039 == 15)
	    i_229_ = 10;
	else if (7 == -1850530127 * client.anInt11039)
	    i_229_ = 6;
	else if (client.anInt11039 * -1850530127 == 9)
	    i_229_ = 17;
	else if (18 == -1850530127 * client.anInt11039)
	    i_229_ = 0;
	else
	    throw new RuntimeException(new StringBuilder().append("").append
					   (-1850530127 * client.anInt11039)
					   .toString());
	method8436(i_223_, i_224_, i_229_, false, 957090236);
    }
    
    public void method8527(Class511 class511) {
	aClass499_5682 = class511.aClass499_5680;
	if (aClass499_5682 == Class499.aClass499_5597)
	    method8463(-1395166223);
	else if (Class499.aClass499_5595 == aClass499_5682)
	    method8444(class511.aClass534_Sub40_Sub1_5679, -588343952);
	else if (Class499.aClass499_5594 == aClass499_5682)
	    method8446(-878545840);
	else if (aClass499_5682.method8264(-1830460862))
	    method8445(class511.aClass534_Sub40_Sub1_5679, 102206014);
    }
    
    void method8528() {
	method8448(Class162.method2643(Class44_Sub6.aClass534_Sub35_10989
					   .aClass690_Sub22_10745
					   .method17078(1895001145),
				       -1568976891),
		   1031920032);
	int i = aClass597_5707.anInt7859 * -424199969;
	int i_230_ = -1166289421 * aClass597_5707.anInt7861;
	int i_231_ = (-116109187 * Class200_Sub13.anInt9937 >> 12) + (i >> 3);
	int i_232_ = (-1098179003 * Class636.anInt8305 >> 12) + (i_230_ >> 3);
	Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aByte10854 = (byte) 0;
	Class674.anInt8633 = 0;
	Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method18871(8, 8,
								-1523647979);
	int i_233_ = 18;
	anIntArray5718 = new int[i_233_];
	anIntArray5714 = new int[i_233_];
	aByteArrayArray5715 = new byte[i_233_][];
	aByteArrayArray5716 = new byte[i_233_][];
	aByteArrayArray5717 = new byte[i_233_][];
	aByteArrayArray5692 = new byte[i_233_][];
	aByteArrayArray5719 = new byte[i_233_][];
	i_233_ = 0;
	for (int i_234_ = (i_231_ - (anInt5724 * -858656915 >> 4)) / 8;
	     i_234_ <= ((anInt5724 * -858656915 >> 4) + i_231_) / 8;
	     i_234_++) {
	    for (int i_235_ = (i_232_ - (anInt5706 * -2041900081 >> 4)) / 8;
		 i_235_ <= ((-2041900081 * anInt5706 >> 4) + i_232_) / 8;
		 i_235_++) {
		int i_236_ = i_235_ + (i_234_ << 8);
		if (Class298_Sub1.aClass472_10064.method7664
		    (method8447(i_234_, i_235_, 361090780),
		     625273953 * Class465.aClass465_5117.anInt5123,
		     -1979296278)) {
		    anIntArray5718[i_233_] = i_236_;
		    anIntArray5714[i_233_]
			= method8447(i_234_, i_235_, 10068743);
		    i_233_++;
		}
	    }
	}
	anInt5699 = -179707951 * i_233_;
	int i_237_;
	if (-1850530127 * client.anInt11039 == 15)
	    i_237_ = 10;
	else if (7 == -1850530127 * client.anInt11039)
	    i_237_ = 6;
	else if (client.anInt11039 * -1850530127 == 9)
	    i_237_ = 17;
	else if (18 == -1850530127 * client.anInt11039)
	    i_237_ = 0;
	else
	    throw new RuntimeException(new StringBuilder().append("").append
					   (-1850530127 * client.anInt11039)
					   .toString());
	method8436(i_231_, i_232_, i_237_, false, -1359577446);
    }
    
    void method8529() {
	method8448(Class162.method2643(Class44_Sub6.aClass534_Sub35_10989
					   .aClass690_Sub22_10745
					   .method17078(720018998),
				       -1283574332),
		   879145237);
	int i = aClass597_5707.anInt7859 * -424199969;
	int i_238_ = -1166289421 * aClass597_5707.anInt7861;
	int i_239_ = (-116109187 * Class200_Sub13.anInt9937 >> 12) + (i >> 3);
	int i_240_ = (-1098179003 * Class636.anInt8305 >> 12) + (i_238_ >> 3);
	Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aByte10854 = (byte) 0;
	Class674.anInt8633 = 0;
	Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method18871(8, 8,
								-2046223861);
	int i_241_ = 18;
	anIntArray5718 = new int[i_241_];
	anIntArray5714 = new int[i_241_];
	aByteArrayArray5715 = new byte[i_241_][];
	aByteArrayArray5716 = new byte[i_241_][];
	aByteArrayArray5717 = new byte[i_241_][];
	aByteArrayArray5692 = new byte[i_241_][];
	aByteArrayArray5719 = new byte[i_241_][];
	i_241_ = 0;
	for (int i_242_ = (i_239_ - (anInt5724 * -858656915 >> 4)) / 8;
	     i_242_ <= ((anInt5724 * -858656915 >> 4) + i_239_) / 8;
	     i_242_++) {
	    for (int i_243_ = (i_240_ - (anInt5706 * -2041900081 >> 4)) / 8;
		 i_243_ <= ((-2041900081 * anInt5706 >> 4) + i_240_) / 8;
		 i_243_++) {
		int i_244_ = i_243_ + (i_242_ << 8);
		if (Class298_Sub1.aClass472_10064.method7664
		    (method8447(i_242_, i_243_, 300628817),
		     625273953 * Class465.aClass465_5117.anInt5123,
		     -6630304)) {
		    anIntArray5718[i_241_] = i_244_;
		    anIntArray5714[i_241_]
			= method8447(i_242_, i_243_, -993927267);
		    i_241_++;
		}
	    }
	}
	anInt5699 = -179707951 * i_241_;
	int i_245_;
	if (-1850530127 * client.anInt11039 == 15)
	    i_245_ = 10;
	else if (7 == -1850530127 * client.anInt11039)
	    i_245_ = 6;
	else if (client.anInt11039 * -1850530127 == 9)
	    i_245_ = 17;
	else if (18 == -1850530127 * client.anInt11039)
	    i_245_ = 0;
	else
	    throw new RuntimeException(new StringBuilder().append("").append
					   (-1850530127 * client.anInt11039)
					   .toString());
	method8436(i_239_, i_240_, i_245_, false, -67671686);
    }
    
    void method8530(Class534_Sub40_Sub1 class534_sub40_sub1) {
	int i = class534_sub40_sub1.method16572((byte) 47);
	boolean bool = class534_sub40_sub1.method16527(-800791995) == 1;
	int i_246_ = class534_sub40_sub1.method16643(-2093708039);
	anInt5725 = class534_sub40_sub1.method16527(1394369662) * 1826695267;
	int i_247_ = class534_sub40_sub1.method16563((byte) -121);
	int i_248_ = class534_sub40_sub1.method16571(1792459467);
	if (!aBool5713)
	    method8449(-260914902);
	method8448(Class162.method2643(i_246_, -1889973315), 1525990559);
	anIntArray5718 = new int[i_247_];
	anIntArray5714 = new int[i_247_];
	aByteArrayArray5715 = new byte[i_247_][];
	aByteArrayArray5716 = new byte[i_247_][];
	aByteArrayArray5717 = null;
	aByteArrayArray5692 = new byte[i_247_][];
	aByteArrayArray5719 = new byte[i_247_][];
	i_247_ = 0;
	for (int i_249_ = (i - (-858656915 * anInt5724 >> 4)) / 8;
	     i_249_ <= ((anInt5724 * -858656915 >> 4) + i) / 8; i_249_++) {
	    for (int i_250_ = (i_248_ - (anInt5706 * -2041900081 >> 4)) / 8;
		 i_250_ <= (i_248_ + (-2041900081 * anInt5706 >> 4)) / 8;
		 i_250_++) {
		if (Class298_Sub1.aClass472_10064.method7664
		    (method8447(i_249_, i_250_, -174461623),
		     Class465.aClass465_5117.anInt5123 * 625273953,
		     -101486919)) {
		    anIntArray5718[i_247_] = i_250_ + (i_249_ << 8);
		    anIntArray5714[i_247_]
			= method8447(i_249_, i_250_, -812681961);
		    i_247_++;
		}
	    }
	}
	anInt5699 = -179707951 * i_247_;
	method8436(i, i_248_, 3, bool, -1736555417);
    }
    
    void method8531(Class534_Sub40_Sub1 class534_sub40_sub1) {
	int i = class534_sub40_sub1.method16572((byte) 91);
	boolean bool = class534_sub40_sub1.method16527(521975857) == 1;
	int i_251_ = class534_sub40_sub1.method16643(-2000894996);
	anInt5725 = class534_sub40_sub1.method16527(67446763) * 1826695267;
	int i_252_ = class534_sub40_sub1.method16563((byte) -13);
	int i_253_ = class534_sub40_sub1.method16571(-713881709);
	if (!aBool5713)
	    method8449(-1138939193);
	method8448(Class162.method2643(i_251_, -1653868645), 1816014837);
	anIntArray5718 = new int[i_252_];
	anIntArray5714 = new int[i_252_];
	aByteArrayArray5715 = new byte[i_252_][];
	aByteArrayArray5716 = new byte[i_252_][];
	aByteArrayArray5717 = null;
	aByteArrayArray5692 = new byte[i_252_][];
	aByteArrayArray5719 = new byte[i_252_][];
	i_252_ = 0;
	for (int i_254_ = (i - (-858656915 * anInt5724 >> 4)) / 8;
	     i_254_ <= ((anInt5724 * -858656915 >> 4) + i) / 8; i_254_++) {
	    for (int i_255_ = (i_253_ - (anInt5706 * -2041900081 >> 4)) / 8;
		 i_255_ <= (i_253_ + (-2041900081 * anInt5706 >> 4)) / 8;
		 i_255_++) {
		if (Class298_Sub1.aClass472_10064.method7664
		    (method8447(i_254_, i_255_, -538702619),
		     Class465.aClass465_5117.anInt5123 * 625273953,
		     764919883)) {
		    anIntArray5718[i_252_] = i_255_ + (i_254_ << 8);
		    anIntArray5714[i_252_]
			= method8447(i_254_, i_255_, -1029244889);
		    i_252_++;
		}
	    }
	}
	anInt5699 = -179707951 * i_252_;
	method8436(i, i_253_, 3, bool, 498965851);
    }
    
    public void method8532(byte i) {
	aClass507_5695 = Class507.aClass507_5666;
	anInt5693 = 0;
	anInt5708 = -1233643123;
	anInt5709 = 0;
	anInt5710 = 291223905;
	anInt5687 = 0;
    }
    
    void method8533(Class534_Sub40_Sub1 class534_sub40_sub1) {
	int i = class534_sub40_sub1.method16573(-1982766353);
	int i_256_ = class534_sub40_sub1.method16563((byte) -87);
	if (i_256_ == 1)
	    aClass499_5682 = Class499.aClass499_5598;
	else if (i_256_ == 2)
	    aClass499_5682 = Class499.aClass499_5596;
	else if (i_256_ == 3)
	    aClass499_5682 = Class499.aClass499_5602;
	else if (4 == i_256_)
	    aClass499_5682 = Class499.aClass499_5599;
	int i_257_ = class534_sub40_sub1.method16643(-2034187568);
	anInt5725 = class534_sub40_sub1.method16643(-2019654798) * 1826695267;
	int i_258_ = class534_sub40_sub1.method16643(-2111896776);
	boolean bool = (i_258_ & 0x1) != 0;
	int i_259_ = class534_sub40_sub1.method16573(-1982766353);
	if (!aBool5713)
	    method8449(1090740212);
	method8448(Class162.method2643(i_257_, -1859094139), 1430901572);
	class534_sub40_sub1.method18294(690203102);
	HashSet hashset = new HashSet();
	for (int i_260_ = 0; i_260_ < 4; i_260_++) {
	    for (int i_261_ = 0; i_261_ < -858656915 * anInt5724 >> 3;
		 i_261_++) {
		for (int i_262_ = 0; i_262_ < -2041900081 * anInt5706 >> 3;
		     i_262_++) {
		    int i_263_
			= class534_sub40_sub1.method18295(1, -761815447);
		    if (1 == i_263_) {
			int i_264_
			    = class534_sub40_sub1.method18295(26, -761815447);
			anIntArrayArrayArray5720[i_260_][i_261_][i_262_]
			    = i_264_;
			int i_265_ = i_264_ >> 14 & 0x3ff;
			int i_266_ = i_264_ >> 3 & 0x7ff;
			int i_267_ = i_265_ >> 3 << 8 | i_266_ >> 3;
			hashset.add(Integer.valueOf(i_267_));
		    } else
			anIntArrayArrayArray5720[i_260_][i_261_][i_262_] = -1;
		}
	    }
	}
	class534_sub40_sub1.method18296(1005014527);
	int i_268_ = hashset.size();
	anIntArray5718 = new int[i_268_];
	anIntArray5714 = new int[i_268_];
	aByteArrayArray5715 = new byte[i_268_][];
	aByteArrayArray5716 = new byte[i_268_][];
	aByteArrayArray5717 = null;
	aByteArrayArray5692 = new byte[i_268_][];
	aByteArrayArray5719 = new byte[i_268_][];
	i_268_ = 0;
	for (int i_269_ = 0; i_269_ < 4; i_269_++) {
	    for (int i_270_ = 0; i_270_ < -858656915 * anInt5724 >> 3;
		 i_270_++) {
		for (int i_271_ = 0; i_271_ < -2041900081 * anInt5706 >> 3;
		     i_271_++) {
		    int i_272_
			= anIntArrayArrayArray5720[i_269_][i_270_][i_271_];
		    if (i_272_ != -1) {
			int i_273_ = i_272_ >> 14 & 0x3ff;
			int i_274_ = i_272_ >> 3 & 0x7ff;
			int i_275_ = i_274_ / 8 + (i_273_ / 8 << 8);
			for (int i_276_ = 0; i_276_ < i_268_; i_276_++) {
			    if (i_275_ == anIntArray5718[i_276_]) {
				i_275_ = -1;
				break;
			    }
			}
			if (-1 != i_275_) {
			    int i_277_ = i_275_ >> 8 & 0xff;
			    int i_278_ = i_275_ & 0xff;
			    if (Class298_Sub1.aClass472_10064.method7664
				(method8447(i_277_, i_278_, 13500296),
				 625273953 * Class465.aClass465_5117.anInt5123,
				 1383697049)) {
				anIntArray5718[i_268_] = i_275_;
				anIntArray5714[i_268_]
				    = method8447(i_277_, i_278_, -1575800559);
				i_268_++;
			    }
			}
		    }
		}
	    }
	}
	anInt5699 = i_268_ * -179707951;
	method8436(i_259_, i, 3, bool, 819411255);
    }
    
    void method8534() {
	aClass499_5683 = aClass499_5682;
	method8448(Class302.aClass302_3246, 2112883528);
	for (int i = 0; i < 4; i++) {
	    for (int i_279_ = 0; i_279_ < anInt5724 * -858656915 >> 3;
		 i_279_++) {
		for (int i_280_ = 0; i_280_ < anInt5706 * -2041900081 >> 3;
		     i_280_++)
		    anIntArrayArrayArray5720[i][i_279_][i_280_] = -1;
	    }
	}
	for (Class534_Sub17 class534_sub17
		 = ((Class534_Sub17)
		    Class201.aClass700_2183.method14135((byte) -1));
	     null != class534_sub17;
	     class534_sub17 = (Class534_Sub17) Class201.aClass700_2183
						   .method14139(984793436)) {
	    int i = class534_sub17.anInt10503 * -910054877;
	    boolean bool = (i & 0x1) == 1;
	    int i_281_ = class534_sub17.anInt10500 * 114372825 >> 3;
	    int i_282_ = class534_sub17.anInt10501 * -528957025 >> 3;
	    int i_283_ = class534_sub17.anInt10507 * -2085075479;
	    int i_284_ = class534_sub17.anInt10499 * 1958875635;
	    int i_285_ = class534_sub17.anInt10505 * -983164393;
	    int i_286_ = class534_sub17.anInt10502 * -444640799;
	    int i_287_ = class534_sub17.anInt10504 * 1910050013;
	    int i_288_ = class534_sub17.anInt10506 * -513660413;
	    int i_289_ = 0;
	    int i_290_ = 0;
	    int i_291_ = 1;
	    int i_292_ = 1;
	    if (i == 1) {
		i_290_ = i_287_ - 1;
		i_291_ = -1;
	    } else if (i == 2) {
		i_290_ = i_287_ - 1;
		i_289_ = i_288_ - 1;
		i_291_ = -1;
		i_292_ = -1;
	    } else if (3 == i) {
		i_289_ = i_288_ - 1;
		i_291_ = 1;
		i_292_ = -1;
	    }
	    int i_293_ = i_282_;
	    while (i_293_ < i_288_ + i_282_) {
		int i_294_ = i_290_;
		int i_295_ = i_281_;
		while (i_295_ < i_287_ + i_281_) {
		    if (bool)
			anIntArrayArrayArray5720[i_286_][i_283_ + i_289_]
			    [i_284_ + i_294_]
			    = (i << 1) + ((i_293_ << 3)
					  + ((i_285_ << 24) + (i_295_ << 14)));
		    else
			anIntArrayArrayArray5720[i_286_][i_294_ + i_283_]
			    [i_284_ + i_289_]
			    = ((i_293_ << 3)
			       + ((i_295_ << 14) + (i_285_ << 24)) + (i << 1));
		    i_295_++;
		    i_294_ += i_291_;
		}
		i_293_++;
		i_289_ += i_292_;
	    }
	}
	int i = client.anInt11242 * 1358961957;
	anIntArray5718 = new int[i];
	anIntArray5714 = new int[i];
	aByteArrayArray5715 = new byte[i][];
	aByteArrayArray5716 = new byte[i][];
	aByteArrayArray5717 = null;
	aByteArrayArray5692 = new byte[i][];
	aByteArrayArray5719 = new byte[i][];
	i = 0;
	for (Class534_Sub17 class534_sub17
		 = ((Class534_Sub17)
		    Class201.aClass700_2183.method14135((byte) -1));
	     null != class534_sub17;
	     class534_sub17 = (Class534_Sub17) Class201.aClass700_2183
						   .method14139(1513198531)) {
	    int i_296_ = 114372825 * class534_sub17.anInt10500 >>> 3;
	    int i_297_ = -528957025 * class534_sub17.anInt10501 >>> 3;
	    int i_298_ = i_296_ + 1910050013 * class534_sub17.anInt10504;
	    if ((i_298_ & 0x7) == 0)
		i_298_--;
	    i_298_ >>>= 3;
	    int i_299_ = -513660413 * class534_sub17.anInt10506 + i_297_;
	    if (0 == (i_299_ & 0x7))
		i_299_--;
	    i_299_ >>>= 3;
	    for (int i_300_ = i_296_ >>> 3; i_300_ <= i_298_; i_300_++) {
	    while_3_:
		for (int i_301_ = i_297_ >>> 3; i_301_ <= i_299_; i_301_++) {
		    int i_302_ = i_300_ << 8 | i_301_;
		    for (int i_303_ = 0; i_303_ < i; i_303_++) {
			if (i_302_ == anIntArray5718[i_303_])
			    continue while_3_;
		    }
		    if (Class298_Sub1.aClass472_10064.method7664
			(method8447(i_300_, i_301_, -1296631019),
			 Class465.aClass465_5117.anInt5123 * 625273953,
			 695060574)) {
			anIntArray5718[i] = i_302_;
			anIntArray5714[i]
			    = method8447(i_300_, i_301_, -1200532669);
			i++;
		    }
		}
	    }
	}
	anInt5699 = -179707951 * i;
	method8436(anInt5724 * -858656915 >> 4, anInt5706 * -2041900081 >> 4,
		   3, false, -1621018987);
    }
    
    void method8535(Class460_Sub1 class460_sub1, byte[][] is) {
	for (int i = 0; i < -692901467 * class460_sub1.anInt4991; i++) {
	    if (!aBool5713)
		Class171_Sub4.aClass232_9944.method4270((byte) -1);
	    for (int i_304_ = 0; i_304_ < -858656915 * anInt5724 >> 3;
		 i_304_++) {
		for (int i_305_ = 0; i_305_ < anInt5706 * -2041900081 >> 3;
		     i_305_++) {
		    int i_306_ = anIntArrayArrayArray5720[i][i_304_][i_305_];
		    if (i_306_ != -1) {
			int i_307_ = i_306_ >> 24 & 0x3;
			if (!class460_sub1.aBool5002 || 0 == i_307_) {
			    int i_308_ = i_306_ >> 1 & 0x3;
			    int i_309_ = i_306_ >> 14 & 0x3ff;
			    int i_310_ = i_306_ >> 3 & 0x7ff;
			    int i_311_ = (i_309_ / 8 << 8) + i_310_ / 8;
			    for (int i_312_ = 0;
				 i_312_ < anIntArray5718.length; i_312_++) {
				if (anIntArray5718[i_312_] == i_311_
				    && null != is[i_312_]) {
				    Class534_Sub40 class534_sub40
					= new Class534_Sub40(is[i_312_]);
				    class460_sub1.method7451(class534_sub40, i,
							     i_304_ * 8,
							     i_305_ * 8,
							     i_307_, i_309_,
							     i_310_, i_308_,
							     17054994);
				    class460_sub1.method15949
					(Class254.aClass185_2683,
					 class534_sub40, i, 8 * i_304_,
					 8 * i_305_, i_307_, i_309_, i_310_,
					 i_308_, -1030488951);
				    break;
				}
			    }
			}
		    }
		}
	    }
	}
	for (int i = 0; i < -692901467 * class460_sub1.anInt4991; i++) {
	    if (!aBool5713)
		Class171_Sub4.aClass232_9944.method4270((byte) -1);
	    for (int i_313_ = 0; i_313_ < anInt5724 * -858656915 >> 3;
		 i_313_++) {
		for (int i_314_ = 0; i_314_ < anInt5706 * -2041900081 >> 3;
		     i_314_++) {
		    int i_315_ = anIntArrayArrayArray5720[i][i_313_][i_314_];
		    if (i_315_ == -1)
			class460_sub1.method7449(i, 8 * i_313_, 8 * i_314_, 8,
						 8, -904088808);
		}
	    }
	}
    }
    
    void method8536() {
	method8448(Class162.method2643(Class44_Sub6.aClass534_Sub35_10989
					   .aClass690_Sub22_10745
					   .method17078(1410936276),
				       -1010145069),
		   529117234);
	int i = aClass597_5707.anInt7859 * -424199969;
	int i_316_ = -1166289421 * aClass597_5707.anInt7861;
	int i_317_ = (-116109187 * Class200_Sub13.anInt9937 >> 12) + (i >> 3);
	int i_318_ = (-1098179003 * Class636.anInt8305 >> 12) + (i_316_ >> 3);
	Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aByte10854 = (byte) 0;
	Class674.anInt8633 = 0;
	Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method18871(8, 8,
								-1598561406);
	int i_319_ = 18;
	anIntArray5718 = new int[i_319_];
	anIntArray5714 = new int[i_319_];
	aByteArrayArray5715 = new byte[i_319_][];
	aByteArrayArray5716 = new byte[i_319_][];
	aByteArrayArray5717 = new byte[i_319_][];
	aByteArrayArray5692 = new byte[i_319_][];
	aByteArrayArray5719 = new byte[i_319_][];
	i_319_ = 0;
	for (int i_320_ = (i_317_ - (anInt5724 * -858656915 >> 4)) / 8;
	     i_320_ <= ((anInt5724 * -858656915 >> 4) + i_317_) / 8;
	     i_320_++) {
	    for (int i_321_ = (i_318_ - (anInt5706 * -2041900081 >> 4)) / 8;
		 i_321_ <= ((-2041900081 * anInt5706 >> 4) + i_318_) / 8;
		 i_321_++) {
		int i_322_ = i_321_ + (i_320_ << 8);
		if (Class298_Sub1.aClass472_10064.method7664
		    (method8447(i_320_, i_321_, -744321483),
		     625273953 * Class465.aClass465_5117.anInt5123,
		     -2122713043)) {
		    anIntArray5718[i_319_] = i_322_;
		    anIntArray5714[i_319_]
			= method8447(i_320_, i_321_, -264222346);
		    i_319_++;
		}
	    }
	}
	anInt5699 = -179707951 * i_319_;
	int i_323_;
	if (-1850530127 * client.anInt11039 == 15)
	    i_323_ = 10;
	else if (7 == -1850530127 * client.anInt11039)
	    i_323_ = 6;
	else if (client.anInt11039 * -1850530127 == 9)
	    i_323_ = 17;
	else if (18 == -1850530127 * client.anInt11039)
	    i_323_ = 0;
	else
	    throw new RuntimeException(new StringBuilder().append("").append
					   (-1850530127 * client.anInt11039)
					   .toString());
	method8436(i_317_, i_318_, i_323_, false, -362437464);
    }
    
    void method8537() {
	aClass499_5683 = aClass499_5682;
	method8448(Class302.aClass302_3246, 1096398125);
	for (int i = 0; i < 4; i++) {
	    for (int i_324_ = 0; i_324_ < anInt5724 * -858656915 >> 3;
		 i_324_++) {
		for (int i_325_ = 0; i_325_ < anInt5706 * -2041900081 >> 3;
		     i_325_++)
		    anIntArrayArrayArray5720[i][i_324_][i_325_] = -1;
	    }
	}
	for (Class534_Sub17 class534_sub17
		 = ((Class534_Sub17)
		    Class201.aClass700_2183.method14135((byte) -1));
	     null != class534_sub17;
	     class534_sub17 = (Class534_Sub17) Class201.aClass700_2183
						   .method14139(661173872)) {
	    int i = class534_sub17.anInt10503 * -910054877;
	    boolean bool = (i & 0x1) == 1;
	    int i_326_ = class534_sub17.anInt10500 * 114372825 >> 3;
	    int i_327_ = class534_sub17.anInt10501 * -528957025 >> 3;
	    int i_328_ = class534_sub17.anInt10507 * -2085075479;
	    int i_329_ = class534_sub17.anInt10499 * 1958875635;
	    int i_330_ = class534_sub17.anInt10505 * -983164393;
	    int i_331_ = class534_sub17.anInt10502 * -444640799;
	    int i_332_ = class534_sub17.anInt10504 * 1910050013;
	    int i_333_ = class534_sub17.anInt10506 * -513660413;
	    int i_334_ = 0;
	    int i_335_ = 0;
	    int i_336_ = 1;
	    int i_337_ = 1;
	    if (i == 1) {
		i_335_ = i_332_ - 1;
		i_336_ = -1;
	    } else if (i == 2) {
		i_335_ = i_332_ - 1;
		i_334_ = i_333_ - 1;
		i_336_ = -1;
		i_337_ = -1;
	    } else if (3 == i) {
		i_334_ = i_333_ - 1;
		i_336_ = 1;
		i_337_ = -1;
	    }
	    int i_338_ = i_327_;
	    while (i_338_ < i_333_ + i_327_) {
		int i_339_ = i_335_;
		int i_340_ = i_326_;
		while (i_340_ < i_332_ + i_326_) {
		    if (bool)
			anIntArrayArrayArray5720[i_331_][i_328_ + i_334_]
			    [i_329_ + i_339_]
			    = (i << 1) + ((i_338_ << 3)
					  + ((i_330_ << 24) + (i_340_ << 14)));
		    else
			anIntArrayArrayArray5720[i_331_][i_339_ + i_328_]
			    [i_329_ + i_334_]
			    = ((i_338_ << 3)
			       + ((i_340_ << 14) + (i_330_ << 24)) + (i << 1));
		    i_340_++;
		    i_339_ += i_336_;
		}
		i_338_++;
		i_334_ += i_337_;
	    }
	}
	int i = client.anInt11242 * 1358961957;
	anIntArray5718 = new int[i];
	anIntArray5714 = new int[i];
	aByteArrayArray5715 = new byte[i][];
	aByteArrayArray5716 = new byte[i][];
	aByteArrayArray5717 = null;
	aByteArrayArray5692 = new byte[i][];
	aByteArrayArray5719 = new byte[i][];
	i = 0;
	for (Class534_Sub17 class534_sub17
		 = ((Class534_Sub17)
		    Class201.aClass700_2183.method14135((byte) -1));
	     null != class534_sub17;
	     class534_sub17 = (Class534_Sub17) Class201.aClass700_2183
						   .method14139(1587544611)) {
	    int i_341_ = 114372825 * class534_sub17.anInt10500 >>> 3;
	    int i_342_ = -528957025 * class534_sub17.anInt10501 >>> 3;
	    int i_343_ = i_341_ + 1910050013 * class534_sub17.anInt10504;
	    if ((i_343_ & 0x7) == 0)
		i_343_--;
	    i_343_ >>>= 3;
	    int i_344_ = -513660413 * class534_sub17.anInt10506 + i_342_;
	    if (0 == (i_344_ & 0x7))
		i_344_--;
	    i_344_ >>>= 3;
	    for (int i_345_ = i_341_ >>> 3; i_345_ <= i_343_; i_345_++) {
	    while_5_:
		for (int i_346_ = i_342_ >>> 3; i_346_ <= i_344_; i_346_++) {
		    int i_347_ = i_345_ << 8 | i_346_;
		    for (int i_348_ = 0; i_348_ < i; i_348_++) {
			if (i_347_ == anIntArray5718[i_348_])
			    continue while_5_;
		    }
		    if (Class298_Sub1.aClass472_10064.method7664
			(method8447(i_345_, i_346_, 144959252),
			 Class465.aClass465_5117.anInt5123 * 625273953,
			 783055551)) {
			anIntArray5718[i] = i_347_;
			anIntArray5714[i]
			    = method8447(i_345_, i_346_, -1417796817);
			i++;
		    }
		}
	    }
	}
	anInt5699 = -179707951 * i;
	method8436(anInt5724 * -858656915 >> 4, anInt5706 * -2041900081 >> 4,
		   3, false, 752060543);
    }
    
    public int method8538() {
	return -921893665 * anInt5697;
    }
    
    void method8539(Class302 class302) {
	if (class302 != aClass302_5684) {
	    anInt5724
		= (anInt5706 = 1741717883 * class302.anInt3241) * -380961109;
	    anIntArrayArrayArray5720 = (new int[4][-858656915 * anInt5724 >> 3]
					[-2041900081 * anInt5706 >> 3]);
	    anIntArrayArray5703
		= new int[anInt5724 * -858656915][-2041900081 * anInt5706];
	    anIntArrayArray5704
		= new int[-858656915 * anInt5724][anInt5706 * -2041900081];
	    aByteArrayArrayArray5705
		= new byte[4][anInt5724 * -858656915][anInt5706 * -2041900081];
	    aClass468_5702 = new Class468(4, anInt5724 * -858656915,
					  anInt5706 * -2041900081);
	    method8437(false, 1601337070);
	    Class606.method10051(-1556994994);
	    aClass302_5684 = class302;
	}
    }
    
    public int method8540() {
	return anInt5724 * -858656915;
    }
    
    void method8541() {
	aClass499_5683 = aClass499_5682;
	method8448(Class302.aClass302_3246, 756835596);
	for (int i = 0; i < 4; i++) {
	    for (int i_349_ = 0; i_349_ < anInt5724 * -858656915 >> 3;
		 i_349_++) {
		for (int i_350_ = 0; i_350_ < anInt5706 * -2041900081 >> 3;
		     i_350_++)
		    anIntArrayArrayArray5720[i][i_349_][i_350_] = -1;
	    }
	}
	for (Class534_Sub17 class534_sub17
		 = ((Class534_Sub17)
		    Class201.aClass700_2183.method14135((byte) -1));
	     null != class534_sub17;
	     class534_sub17 = (Class534_Sub17) Class201.aClass700_2183
						   .method14139(1404666091)) {
	    int i = class534_sub17.anInt10503 * -910054877;
	    boolean bool = (i & 0x1) == 1;
	    int i_351_ = class534_sub17.anInt10500 * 114372825 >> 3;
	    int i_352_ = class534_sub17.anInt10501 * -528957025 >> 3;
	    int i_353_ = class534_sub17.anInt10507 * -2085075479;
	    int i_354_ = class534_sub17.anInt10499 * 1958875635;
	    int i_355_ = class534_sub17.anInt10505 * -983164393;
	    int i_356_ = class534_sub17.anInt10502 * -444640799;
	    int i_357_ = class534_sub17.anInt10504 * 1910050013;
	    int i_358_ = class534_sub17.anInt10506 * -513660413;
	    int i_359_ = 0;
	    int i_360_ = 0;
	    int i_361_ = 1;
	    int i_362_ = 1;
	    if (i == 1) {
		i_360_ = i_357_ - 1;
		i_361_ = -1;
	    } else if (i == 2) {
		i_360_ = i_357_ - 1;
		i_359_ = i_358_ - 1;
		i_361_ = -1;
		i_362_ = -1;
	    } else if (3 == i) {
		i_359_ = i_358_ - 1;
		i_361_ = 1;
		i_362_ = -1;
	    }
	    int i_363_ = i_352_;
	    while (i_363_ < i_358_ + i_352_) {
		int i_364_ = i_360_;
		int i_365_ = i_351_;
		while (i_365_ < i_357_ + i_351_) {
		    if (bool)
			anIntArrayArrayArray5720[i_356_][i_353_ + i_359_]
			    [i_354_ + i_364_]
			    = (i << 1) + ((i_363_ << 3)
					  + ((i_355_ << 24) + (i_365_ << 14)));
		    else
			anIntArrayArrayArray5720[i_356_][i_364_ + i_353_]
			    [i_354_ + i_359_]
			    = ((i_363_ << 3)
			       + ((i_365_ << 14) + (i_355_ << 24)) + (i << 1));
		    i_365_++;
		    i_364_ += i_361_;
		}
		i_363_++;
		i_359_ += i_362_;
	    }
	}
	int i = client.anInt11242 * 1358961957;
	anIntArray5718 = new int[i];
	anIntArray5714 = new int[i];
	aByteArrayArray5715 = new byte[i][];
	aByteArrayArray5716 = new byte[i][];
	aByteArrayArray5717 = null;
	aByteArrayArray5692 = new byte[i][];
	aByteArrayArray5719 = new byte[i][];
	i = 0;
	for (Class534_Sub17 class534_sub17
		 = ((Class534_Sub17)
		    Class201.aClass700_2183.method14135((byte) -1));
	     null != class534_sub17;
	     class534_sub17 = (Class534_Sub17) Class201.aClass700_2183
						   .method14139(1243827088)) {
	    int i_366_ = 114372825 * class534_sub17.anInt10500 >>> 3;
	    int i_367_ = -528957025 * class534_sub17.anInt10501 >>> 3;
	    int i_368_ = i_366_ + 1910050013 * class534_sub17.anInt10504;
	    if ((i_368_ & 0x7) == 0)
		i_368_--;
	    i_368_ >>>= 3;
	    int i_369_ = -513660413 * class534_sub17.anInt10506 + i_367_;
	    if (0 == (i_369_ & 0x7))
		i_369_--;
	    i_369_ >>>= 3;
	    for (int i_370_ = i_366_ >>> 3; i_370_ <= i_368_; i_370_++) {
	    while_7_:
		for (int i_371_ = i_367_ >>> 3; i_371_ <= i_369_; i_371_++) {
		    int i_372_ = i_370_ << 8 | i_371_;
		    for (int i_373_ = 0; i_373_ < i; i_373_++) {
			if (i_372_ == anIntArray5718[i_373_])
			    continue while_7_;
		    }
		    if (Class298_Sub1.aClass472_10064.method7664
			(method8447(i_370_, i_371_, 729983533),
			 Class465.aClass465_5117.anInt5123 * 625273953,
			 -1061807275)) {
			anIntArray5718[i] = i_372_;
			anIntArray5714[i]
			    = method8447(i_370_, i_371_, -1403780772);
			i++;
		    }
		}
	    }
	}
	anInt5699 = -179707951 * i;
	method8436(anInt5724 * -858656915 >> 4, anInt5706 * -2041900081 >> 4,
		   3, false, 231303240);
    }
    
    void method8542() {
	if (Class499.aClass499_5594 != aClass499_5682
	    && aClass499_5683 != Class499.aClass499_5594) {
	    if (aClass499_5682 == Class499.aClass499_5598
		|| Class499.aClass499_5602 == aClass499_5682
		|| (aClass499_5682 != aClass499_5683
		    && (Class499.aClass499_5595 == aClass499_5682
			|| aClass499_5683 == Class499.aClass499_5595))) {
		Iterator iterator = client.aClass9_11331.iterator();
		while (iterator.hasNext()) {
		    Class534_Sub6 class534_sub6
			= (Class534_Sub6) iterator.next();
		    Class694.method14069(((Class654_Sub1_Sub5_Sub1_Sub1)
					  class534_sub6.anObject10417),
					 -836779145);
		}
		client.anInt11321 = 0;
		client.anInt11148 = 0;
		client.aClass9_11331.method578((byte) -71);
	    }
	    aClass499_5683 = aClass499_5682;
	}
    }
    
    void method8543() {
	if (Class499.aClass499_5594 != aClass499_5682
	    && aClass499_5683 != Class499.aClass499_5594) {
	    if (aClass499_5682 == Class499.aClass499_5598
		|| Class499.aClass499_5602 == aClass499_5682
		|| (aClass499_5682 != aClass499_5683
		    && (Class499.aClass499_5595 == aClass499_5682
			|| aClass499_5683 == Class499.aClass499_5595))) {
		Iterator iterator = client.aClass9_11331.iterator();
		while (iterator.hasNext()) {
		    Class534_Sub6 class534_sub6
			= (Class534_Sub6) iterator.next();
		    Class694.method14069(((Class654_Sub1_Sub5_Sub1_Sub1)
					  class534_sub6.anObject10417),
					 -836779145);
		}
		client.anInt11321 = 0;
		client.anInt11148 = 0;
		client.aClass9_11331.method578((byte) -56);
	    }
	    aClass499_5683 = aClass499_5682;
	}
    }
    
    void method8544(int i, int i_374_, int i_375_, boolean bool) {
	if (-1468443459 * client.anInt11155 == 4) {
	    if (aBool5713)
		throw new IllegalStateException();
	    client.anInt11155 = -143767915;
	    client.anInt11023 = -1139557399;
	}
	if (bool || i != anInt5689 * 996655731
	    || i_374_ != 102545369 * anInt5690) {
	    anInt5689 = i * -457461061;
	    anInt5690 = 1232492649 * i_374_;
	    if (!aBool5713) {
		Class673.method11110(i_375_, -1527819609);
		Class689.method14015
		    (Class58.aClass58_460.method1245(Class539.aClass672_7171,
						     (byte) -96),
		     true, Class254.aClass185_2683,
		     Class539_Sub1.aClass171_10327, Class67.aClass16_720,
		     (byte) -86);
	    }
	    if (aClass597_5707 != null)
		aClass597_5688 = aClass597_5707;
	    else
		aClass597_5688 = new Class597(0, 0, 0);
	    aClass597_5707
		= new Class597(0,
			       (anInt5689 * 996655731
				- (-858656915 * anInt5724 >> 4)) * 8,
			       8 * (anInt5690 * 102545369
				    - (-2041900081 * anInt5706 >> 4)));
	    aClass534_Sub18_Sub9_5698
		= Class554.method9113((anInt5724 * -858656915 / 2
				       + (-424199969
					  * aClass597_5707.anInt7859)),
				      (-858656915 * anInt5724 / 2
				       + (aClass597_5707.anInt7861
					  * -1166289421)));
	    aClass523_5691 = null;
	    aLong5711 = 2452396203634292367L;
	    if (!aBool5713)
		method8433(i_375_, (short) -19060);
	}
    }
    
    void method8545(Class460_Sub1 class460_sub1, byte[][] is) {
	int i = is.length;
	for (int i_376_ = 0; i_376_ < i; i_376_++) {
	    byte[] is_377_ = is[i_376_];
	    if (null != is_377_) {
		Class534_Sub40 class534_sub40 = new Class534_Sub40(is_377_);
		int i_378_ = anIntArray5718[i_376_] >> 8;
		int i_379_ = anIntArray5718[i_376_] & 0xff;
		int i_380_
		    = 64 * i_378_ - aClass597_5707.anInt7859 * -424199969;
		int i_381_
		    = i_379_ * 64 - aClass597_5707.anInt7861 * -1166289421;
		if (!aBool5713 && null != Class171_Sub4.aClass232_9944)
		    Class171_Sub4.aClass232_9944.method4270((byte) -1);
		class460_sub1.method7450(class534_sub40, i_380_, i_381_,
					 aClass597_5707.anInt7859 * -424199969,
					 (-1166289421
					  * aClass597_5707.anInt7861),
					 1150128392);
		class460_sub1.method15951(Class254.aClass185_2683,
					  class534_sub40, i_380_, i_381_,
					  -1558253889);
	    }
	}
	for (int i_382_ = 0; i_382_ < i; i_382_++) {
	    int i_383_ = ((anIntArray5718[i_382_] >> 8) * 64
			  - aClass597_5707.anInt7859 * -424199969);
	    int i_384_ = (64 * (anIntArray5718[i_382_] & 0xff)
			  - aClass597_5707.anInt7861 * -1166289421);
	    byte[] is_385_ = is[i_382_];
	    if (is_385_ == null && anInt5690 * 102545369 < 800) {
		if (!aBool5713 && null != Class171_Sub4.aClass232_9944)
		    Class171_Sub4.aClass232_9944.method4270((byte) -1);
		class460_sub1.method7448(i_383_, i_384_, 64, 64, (byte) 80);
	    }
	}
    }
    
    void method8546(int i, int i_386_, int i_387_, boolean bool) {
	if (-1468443459 * client.anInt11155 == 4) {
	    if (aBool5713)
		throw new IllegalStateException();
	    client.anInt11155 = -143767915;
	    client.anInt11023 = -1139557399;
	}
	if (bool || i != anInt5689 * 996655731
	    || i_386_ != 102545369 * anInt5690) {
	    anInt5689 = i * -457461061;
	    anInt5690 = 1232492649 * i_386_;
	    if (!aBool5713) {
		Class673.method11110(i_387_, -535407462);
		Class689.method14015
		    (Class58.aClass58_460.method1245(Class539.aClass672_7171,
						     (byte) -124),
		     true, Class254.aClass185_2683,
		     Class539_Sub1.aClass171_10327, Class67.aClass16_720,
		     (byte) -77);
	    }
	    if (aClass597_5707 != null)
		aClass597_5688 = aClass597_5707;
	    else
		aClass597_5688 = new Class597(0, 0, 0);
	    aClass597_5707
		= new Class597(0,
			       (anInt5689 * 996655731
				- (-858656915 * anInt5724 >> 4)) * 8,
			       8 * (anInt5690 * 102545369
				    - (-2041900081 * anInt5706 >> 4)));
	    aClass534_Sub18_Sub9_5698
		= Class554.method9113((anInt5724 * -858656915 / 2
				       + (-424199969
					  * aClass597_5707.anInt7859)),
				      (-858656915 * anInt5724 / 2
				       + (aClass597_5707.anInt7861
					  * -1166289421)));
	    aClass523_5691 = null;
	    aLong5711 = 2452396203634292367L;
	    if (!aBool5713)
		method8433(i_387_, (short) -5803);
	}
    }
    
    void method8547() {
	if (Class499.aClass499_5594 != aClass499_5682
	    && aClass499_5683 != Class499.aClass499_5594) {
	    if (aClass499_5682 == Class499.aClass499_5598
		|| Class499.aClass499_5602 == aClass499_5682
		|| (aClass499_5682 != aClass499_5683
		    && (Class499.aClass499_5595 == aClass499_5682
			|| aClass499_5683 == Class499.aClass499_5595))) {
		Iterator iterator = client.aClass9_11331.iterator();
		while (iterator.hasNext()) {
		    Class534_Sub6 class534_sub6
			= (Class534_Sub6) iterator.next();
		    Class694.method14069(((Class654_Sub1_Sub5_Sub1_Sub1)
					  class534_sub6.anObject10417),
					 -836779145);
		}
		client.anInt11321 = 0;
		client.anInt11148 = 0;
		client.aClass9_11331.method578((byte) -41);
	    }
	    aClass499_5683 = aClass499_5682;
	}
    }
    
    void method8548(int i) {
	int i_388_ = (aClass597_5707.anInt7859 * -424199969
		      - -424199969 * aClass597_5688.anInt7859);
	int i_389_ = (aClass597_5707.anInt7861 * -1166289421
		      - -1166289421 * aClass597_5688.anInt7861);
	if (i == 3) {
	    for (int i_390_ = 0; i_390_ < client.anInt11148 * 759971875;
		 i_390_++) {
		Class534_Sub6 class534_sub6
		    = client.aClass534_Sub6Array11085[i_390_];
		if (null != class534_sub6) {
		    Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
			= ((Class654_Sub1_Sub5_Sub1_Sub1)
			   class534_sub6.anObject10417);
		    for (int i_391_ = 0;
			 i_391_ < (class654_sub1_sub5_sub1_sub1
				   .anIntArray11977).length;
			 i_391_++) {
			class654_sub1_sub5_sub1_sub1.anIntArray11977[i_391_]
			    -= i_388_;
			class654_sub1_sub5_sub1_sub1.anIntArray11978[i_391_]
			    -= i_389_;
		    }
		    Class438 class438
			= Class438.method6994(class654_sub1_sub5_sub1_sub1
						  .method10807
					      ().aClass438_4885);
		    class438.aFloat4864 -= (float) (i_388_ * 512);
		    class438.aFloat4865 -= (float) (512 * i_389_);
		    class654_sub1_sub5_sub1_sub1.method10809(class438);
		    class438.method7074();
		}
	    }
	} else {
	    boolean bool = false;
	    client.anInt11321 = 0;
	    int i_392_ = anInt5724 * -1545676288 - 512;
	    int i_393_ = -1775788544 * anInt5706 - 512;
	    for (int i_394_ = 0; i_394_ < 759971875 * client.anInt11148;
		 i_394_++) {
		Class534_Sub6 class534_sub6
		    = client.aClass534_Sub6Array11085[i_394_];
		if (class534_sub6 != null) {
		    Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
			= ((Class654_Sub1_Sub5_Sub1_Sub1)
			   class534_sub6.anObject10417);
		    Class438 class438
			= Class438.method6994(class654_sub1_sub5_sub1_sub1
						  .method10807
					      ().aClass438_4885);
		    class438.aFloat4864 -= (float) (512 * i_388_);
		    class438.aFloat4865 -= (float) (512 * i_389_);
		    class654_sub1_sub5_sub1_sub1.method10809(class438);
		    if ((int) class438.aFloat4864 < 0
			|| (int) class438.aFloat4864 > i_392_
			|| (int) class438.aFloat4865 < 0
			|| (int) class438.aFloat4865 > i_393_) {
			class654_sub1_sub5_sub1_sub1.method18827(null,
								 (byte) -2);
			class534_sub6.method8892((byte) 1);
			bool = true;
		    } else {
			boolean bool_395_ = true;
			for (int i_396_ = 0;
			     i_396_ < (class654_sub1_sub5_sub1_sub1
				       .anIntArray11977).length;
			     i_396_++) {
			    class654_sub1_sub5_sub1_sub1.anIntArray11977
				[i_396_]
				-= i_388_;
			    class654_sub1_sub5_sub1_sub1.anIntArray11978
				[i_396_]
				-= i_389_;
			    if ((class654_sub1_sub5_sub1_sub1.anIntArray11977
				 [i_396_]) < 0
				|| ((class654_sub1_sub5_sub1_sub1
				     .anIntArray11977[i_396_])
				    >= anInt5724 * -858656915)
				|| (class654_sub1_sub5_sub1_sub1
				    .anIntArray11978[i_396_]) < 0
				|| ((class654_sub1_sub5_sub1_sub1
				     .anIntArray11978[i_396_])
				    >= -2041900081 * anInt5706))
				bool_395_ = false;
			}
			if (bool_395_)
			    client.anIntArray11088[((client.anInt11321
						     += 590354627)
						    * -1125820437) - 1]
				= (1126388985
				   * class654_sub1_sub5_sub1_sub1.anInt11922);
			else {
			    class654_sub1_sub5_sub1_sub1
				.method18827(null, (byte) -2);
			    class534_sub6.method8892((byte) 1);
			    bool = true;
			}
		    }
		    class438.method7074();
		}
	    }
	    if (bool) {
		client.anInt11148
		    = client.aClass9_11331.method600(278240935) * 1085173643;
		int i_397_ = 0;
		Iterator iterator = client.aClass9_11331.iterator();
		while (iterator.hasNext()) {
		    Class534_Sub6 class534_sub6
			= (Class534_Sub6) iterator.next();
		    client.aClass534_Sub6Array11085[i_397_++] = class534_sub6;
		}
	    }
	}
	for (int i_398_ = 0; i_398_ < 2048; i_398_++) {
	    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		= client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i_398_];
	    if (class654_sub1_sub5_sub1_sub2 != null) {
		for (int i_399_ = 0;
		     (i_399_
		      < class654_sub1_sub5_sub1_sub2.anIntArray11977.length);
		     i_399_++) {
		    class654_sub1_sub5_sub1_sub2.anIntArray11977[i_399_]
			-= i_388_;
		    class654_sub1_sub5_sub1_sub2.anIntArray11978[i_399_]
			-= i_389_;
		}
		Class438 class438
		    = Class438.method6994(class654_sub1_sub5_sub1_sub2
					      .method10807().aClass438_4885);
		class438.aFloat4864 -= (float) (i_388_ * 512);
		class438.aFloat4865 -= (float) (i_389_ * 512);
		class654_sub1_sub5_sub1_sub2.method10809(class438);
		class438.method7074();
	    }
	}
	Class99[] class99s = client.aClass99Array11053;
	for (int i_400_ = 0; i_400_ < class99s.length; i_400_++) {
	    Class99 class99 = class99s[i_400_];
	    if (class99 != null) {
		class99.anInt1171 -= -1208905216 * i_388_;
		class99.anInt1172 -= i_389_ * 1906770432;
	    }
	}
	for (Class534_Sub4 class534_sub4
		 = ((Class534_Sub4)
		    Class534_Sub4.aClass700_10408.method14135((byte) -1));
	     null != class534_sub4;
	     class534_sub4 = (Class534_Sub4) Class534_Sub4.aClass700_10408
						 .method14139(1854250861)) {
	    class534_sub4.anInt10397 -= 1402161037 * i_388_;
	    class534_sub4.anInt10400 -= i_389_ * 2107243719;
	    Class602 class602
		= ((Class602)
		   aClass44_Sub13_5712.method91((class534_sub4.anInt10398
						 * -1375582077),
						-1842161247));
	    int i_401_;
	    int i_402_;
	    if (0 == (class534_sub4.anInt10403 * 220446523 & 0x1)) {
		i_401_ = -1082258489 * class602.anInt7904;
		i_402_ = class602.anInt7928 * -1990374967;
	    } else {
		i_401_ = -1990374967 * class602.anInt7928;
		i_402_ = class602.anInt7904 * -1082258489;
	    }
	    if (Class499.aClass499_5599 != aClass499_5682
		&& (i_401_ + class534_sub4.anInt10397 * -1522052283 <= 0
		    || class534_sub4.anInt10400 * -1246362377 + i_402_ <= 0
		    || (-1522052283 * class534_sub4.anInt10397
			>= -858656915 * anInt5724)
		    || (class534_sub4.anInt10400 * -1246362377
			>= -2041900081 * anInt5706)))
		class534_sub4.method8892((byte) 1);
	}
	for (Class534_Sub4 class534_sub4
		 = ((Class534_Sub4)
		    Class534_Sub4.aClass700_10409.method14135((byte) -1));
	     class534_sub4 != null;
	     class534_sub4 = (Class534_Sub4) Class534_Sub4.aClass700_10409
						 .method14139(1756343740)) {
	    class534_sub4.anInt10397 -= i_388_ * 1402161037;
	    class534_sub4.anInt10400 -= i_389_ * 2107243719;
	    Class602 class602
		= ((Class602)
		   aClass44_Sub13_5712.method91((class534_sub4.anInt10398
						 * -1375582077),
						868317894));
	    int i_403_;
	    int i_404_;
	    if ((220446523 * class534_sub4.anInt10403 & 0x1) == 0) {
		i_403_ = class602.anInt7904 * -1082258489;
		i_404_ = -1990374967 * class602.anInt7928;
	    } else {
		i_403_ = class602.anInt7928 * -1990374967;
		i_404_ = class602.anInt7904 * -1082258489;
	    }
	    if (aClass499_5682 != Class499.aClass499_5599
		&& (i_403_ + class534_sub4.anInt10397 * -1522052283 <= 0
		    || class534_sub4.anInt10400 * -1246362377 + i_404_ <= 0
		    || (class534_sub4.anInt10397 * -1522052283
			>= anInt5724 * -858656915)
		    || (-1246362377 * class534_sub4.anInt10400
			>= -2041900081 * anInt5706)))
		class534_sub4.method8892((byte) 1);
	}
	for (Class534_Sub7 class534_sub7
		 = (Class534_Sub7) client.aClass9_11209.method583(-1641596900);
	     null != class534_sub7;
	     class534_sub7 = ((Class534_Sub7)
			      client.aClass9_11209.method584((byte) -14))) {
	    int i_405_
		= (int) (8258869577519436579L * class534_sub7.aLong7158 >> 28
			 & 0x3L);
	    int i_406_ = (int) (class534_sub7.aLong7158 * 8258869577519436579L
				& 0x3fffL);
	    int i_407_ = i_406_ - -424199969 * aClass597_5707.anInt7859;
	    int i_408_
		= (int) (8258869577519436579L * class534_sub7.aLong7158 >> 14
			 & 0x3fffL);
	    int i_409_ = i_408_ - aClass597_5707.anInt7861 * -1166289421;
	    if (aClass556_5721 != null) {
		if (i_407_ < 0 || i_409_ < 0
		    || i_407_ >= -858656915 * anInt5724
		    || i_409_ >= -2041900081 * anInt5706
		    || i_407_ >= 1183912005 * aClass556_5721.anInt7435
		    || i_409_ >= 60330541 * aClass556_5721.anInt7470) {
		    if (aClass499_5682 != Class499.aClass499_5599)
			class534_sub7.method8892((byte) 1);
		} else if (aClass556_5721.aClass568ArrayArrayArray7431 != null)
		    aClass556_5721.method9254(i_405_, i_407_, i_409_,
					      1507242221);
	    }
	}
	if (0 != Class113.anInt1375 * -1254538725) {
	    Class113.anInt1375 -= -1660827629 * i_388_;
	    Class113.anInt1376 -= 517634255 * i_389_;
	}
	Class278.method5224(false, 228250325);
	if (i == 3) {
	    client.anInt11137 -= -590552576 * i_388_;
	    client.anInt11138 -= i_389_ * -1766187520;
	    Class588.anInt7808 -= i_388_ * -1630722560;
	    Class453.anInt4958 -= -191354368 * i_389_;
	    if (-891094135 * Class10.anInt75 != 5
		&& 3 != Class10.anInt75 * -891094135)
		Class235.method4408(Class200_Sub5.method15573((byte) 80),
				    (byte) 95);
	} else {
	    Class200_Sub8.anInt9909 -= -827897067 * i_388_;
	    Class200_Sub9.anInt9916 -= i_389_ * 1775664559;
	    Class652.anInt8484 -= 1442265799 * i_388_;
	    Class609.anInt8007 -= i_389_ * -1322167097;
	    Class200_Sub13.anInt9937 -= 659663360 * i_388_;
	    Class636.anInt8305 -= -1131865600 * i_389_;
	    if (Math.abs(i_388_) > -858656915 * anInt5724
		|| Math.abs(i_389_) > -2041900081 * anInt5706)
		aClass616_5694.method10157(1297215829);
	}
	Class489.method8005(-1804424067);
	Class561.method9444((byte) -92);
	client.aClass9_11322.method578((byte) 10);
	client.aClass700_11210.method14152(-1437493028);
	client.aClass709_11212.method14283(-1107967299);
	Class569.method9598(-1426984661);
    }
    
    void method8549(int i, int i_410_, int i_411_, boolean bool) {
	if (-1468443459 * client.anInt11155 == 4) {
	    if (aBool5713)
		throw new IllegalStateException();
	    client.anInt11155 = -143767915;
	    client.anInt11023 = -1139557399;
	}
	if (bool || i != anInt5689 * 996655731
	    || i_410_ != 102545369 * anInt5690) {
	    anInt5689 = i * -457461061;
	    anInt5690 = 1232492649 * i_410_;
	    if (!aBool5713) {
		Class673.method11110(i_411_, -665009874);
		Class689.method14015
		    (Class58.aClass58_460.method1245(Class539.aClass672_7171,
						     (byte) -73),
		     true, Class254.aClass185_2683,
		     Class539_Sub1.aClass171_10327, Class67.aClass16_720,
		     (byte) -27);
	    }
	    if (aClass597_5707 != null)
		aClass597_5688 = aClass597_5707;
	    else
		aClass597_5688 = new Class597(0, 0, 0);
	    aClass597_5707
		= new Class597(0,
			       (anInt5689 * 996655731
				- (-858656915 * anInt5724 >> 4)) * 8,
			       8 * (anInt5690 * 102545369
				    - (-2041900081 * anInt5706 >> 4)));
	    aClass534_Sub18_Sub9_5698
		= Class554.method9113((anInt5724 * -858656915 / 2
				       + (-424199969
					  * aClass597_5707.anInt7859)),
				      (-858656915 * anInt5724 / 2
				       + (aClass597_5707.anInt7861
					  * -1166289421)));
	    aClass523_5691 = null;
	    aLong5711 = 2452396203634292367L;
	    if (!aBool5713)
		method8433(i_411_, (short) -27006);
	}
    }
    
    void method8550(Class302 class302) {
	if (class302 != aClass302_5684) {
	    anInt5724
		= (anInt5706 = 1741717883 * class302.anInt3241) * -380961109;
	    anIntArrayArrayArray5720 = (new int[4][-858656915 * anInt5724 >> 3]
					[-2041900081 * anInt5706 >> 3]);
	    anIntArrayArray5703
		= new int[anInt5724 * -858656915][-2041900081 * anInt5706];
	    anIntArrayArray5704
		= new int[-858656915 * anInt5724][anInt5706 * -2041900081];
	    aByteArrayArrayArray5705
		= new byte[4][anInt5724 * -858656915][anInt5706 * -2041900081];
	    aClass468_5702 = new Class468(4, anInt5724 * -858656915,
					  anInt5706 * -2041900081);
	    method8437(false, -1982787922);
	    Class606.method10051(-1267559520);
	    aClass302_5684 = class302;
	}
    }
    
    public void method8551() {
	aClass597_5707 = new Class597();
	anInt5690 = 0;
	anInt5689 = 0;
    }
    
    public Class468 method8552(byte i) {
	return aClass468_5702;
    }
    
    public void method8553(Class511 class511) {
	aClass499_5682 = class511.aClass499_5680;
	if (aClass499_5682 == Class499.aClass499_5597)
	    method8463(-1395166223);
	else if (Class499.aClass499_5595 == aClass499_5682)
	    method8444(class511.aClass534_Sub40_Sub1_5679, 869811147);
	else if (Class499.aClass499_5594 == aClass499_5682)
	    method8446(-1175033650);
	else if (aClass499_5682.method8264(-2147187352))
	    method8445(class511.aClass534_Sub40_Sub1_5679, 733162656);
    }
    
    public int method8554() {
	return -2041900081 * anInt5706;
    }
    
    void method8555(Class460_Sub1 class460_sub1, byte[][] is) {
	for (int i = 0; i < -692901467 * class460_sub1.anInt4991; i++) {
	    if (!aBool5713)
		Class171_Sub4.aClass232_9944.method4270((byte) -1);
	    for (int i_412_ = 0; i_412_ < anInt5724 * -858656915 >> 3;
		 i_412_++) {
		for (int i_413_ = 0; i_413_ < -2041900081 * anInt5706 >> 3;
		     i_413_++) {
		    int i_414_ = anIntArrayArrayArray5720[i][i_412_][i_413_];
		    if (i_414_ != -1) {
			int i_415_ = i_414_ >> 24 & 0x3;
			if (!class460_sub1.aBool5002 || 0 == i_415_) {
			    int i_416_ = i_414_ >> 1 & 0x3;
			    int i_417_ = i_414_ >> 14 & 0x3ff;
			    int i_418_ = i_414_ >> 3 & 0x7ff;
			    int i_419_ = i_418_ / 8 + (i_417_ / 8 << 8);
			    for (int i_420_ = 0;
				 i_420_ < anIntArray5718.length; i_420_++) {
				if (i_419_ == anIntArray5718[i_420_]
				    && is[i_420_] != null) {
				    class460_sub1.method15941
					(Class254.aClass185_2683, is[i_420_],
					 i, i_412_ * 8, i_413_ * 8, i_415_,
					 (i_417_ & 0x7) * 8,
					 (i_418_ & 0x7) * 8, i_416_,
					 (byte) -36);
				    break;
				}
			    }
			}
		    }
		    if (aBool5713)
			method8454(5, 1361748332);
		}
	    }
	}
    }
    
    void method8556(int i) {
	try {
	    Thread.sleep((long) i);
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    void method8557() {
	aClass499_5683 = aClass499_5682;
	method8448(Class302.aClass302_3246, 1245140534);
	for (int i = 0; i < 4; i++) {
	    for (int i_421_ = 0; i_421_ < anInt5724 * -858656915 >> 3;
		 i_421_++) {
		for (int i_422_ = 0; i_422_ < anInt5706 * -2041900081 >> 3;
		     i_422_++)
		    anIntArrayArrayArray5720[i][i_421_][i_422_] = -1;
	    }
	}
	for (Class534_Sub17 class534_sub17
		 = ((Class534_Sub17)
		    Class201.aClass700_2183.method14135((byte) -1));
	     null != class534_sub17;
	     class534_sub17 = (Class534_Sub17) Class201.aClass700_2183
						   .method14139(1973437643)) {
	    int i = class534_sub17.anInt10503 * -910054877;
	    boolean bool = (i & 0x1) == 1;
	    int i_423_ = class534_sub17.anInt10500 * 114372825 >> 3;
	    int i_424_ = class534_sub17.anInt10501 * -528957025 >> 3;
	    int i_425_ = class534_sub17.anInt10507 * -2085075479;
	    int i_426_ = class534_sub17.anInt10499 * 1958875635;
	    int i_427_ = class534_sub17.anInt10505 * -983164393;
	    int i_428_ = class534_sub17.anInt10502 * -444640799;
	    int i_429_ = class534_sub17.anInt10504 * 1910050013;
	    int i_430_ = class534_sub17.anInt10506 * -513660413;
	    int i_431_ = 0;
	    int i_432_ = 0;
	    int i_433_ = 1;
	    int i_434_ = 1;
	    if (i == 1) {
		i_432_ = i_429_ - 1;
		i_433_ = -1;
	    } else if (i == 2) {
		i_432_ = i_429_ - 1;
		i_431_ = i_430_ - 1;
		i_433_ = -1;
		i_434_ = -1;
	    } else if (3 == i) {
		i_431_ = i_430_ - 1;
		i_433_ = 1;
		i_434_ = -1;
	    }
	    int i_435_ = i_424_;
	    while (i_435_ < i_430_ + i_424_) {
		int i_436_ = i_432_;
		int i_437_ = i_423_;
		while (i_437_ < i_429_ + i_423_) {
		    if (bool)
			anIntArrayArrayArray5720[i_428_][i_425_ + i_431_]
			    [i_426_ + i_436_]
			    = (i << 1) + ((i_435_ << 3)
					  + ((i_427_ << 24) + (i_437_ << 14)));
		    else
			anIntArrayArrayArray5720[i_428_][i_436_ + i_425_]
			    [i_426_ + i_431_]
			    = ((i_435_ << 3)
			       + ((i_437_ << 14) + (i_427_ << 24)) + (i << 1));
		    i_437_++;
		    i_436_ += i_433_;
		}
		i_435_++;
		i_431_ += i_434_;
	    }
	}
	int i = client.anInt11242 * 1358961957;
	anIntArray5718 = new int[i];
	anIntArray5714 = new int[i];
	aByteArrayArray5715 = new byte[i][];
	aByteArrayArray5716 = new byte[i][];
	aByteArrayArray5717 = null;
	aByteArrayArray5692 = new byte[i][];
	aByteArrayArray5719 = new byte[i][];
	i = 0;
	for (Class534_Sub17 class534_sub17
		 = ((Class534_Sub17)
		    Class201.aClass700_2183.method14135((byte) -1));
	     null != class534_sub17;
	     class534_sub17 = (Class534_Sub17) Class201.aClass700_2183
						   .method14139(1415605834)) {
	    int i_438_ = 114372825 * class534_sub17.anInt10500 >>> 3;
	    int i_439_ = -528957025 * class534_sub17.anInt10501 >>> 3;
	    int i_440_ = i_438_ + 1910050013 * class534_sub17.anInt10504;
	    if ((i_440_ & 0x7) == 0)
		i_440_--;
	    i_440_ >>>= 3;
	    int i_441_ = -513660413 * class534_sub17.anInt10506 + i_439_;
	    if (0 == (i_441_ & 0x7))
		i_441_--;
	    i_441_ >>>= 3;
	    for (int i_442_ = i_438_ >>> 3; i_442_ <= i_440_; i_442_++) {
	    while_9_:
		for (int i_443_ = i_439_ >>> 3; i_443_ <= i_441_; i_443_++) {
		    int i_444_ = i_442_ << 8 | i_443_;
		    for (int i_445_ = 0; i_445_ < i; i_445_++) {
			if (i_444_ == anIntArray5718[i_445_])
			    continue while_9_;
		    }
		    if (Class298_Sub1.aClass472_10064.method7664
			(method8447(i_442_, i_443_, 351472348),
			 Class465.aClass465_5117.anInt5123 * 625273953,
			 530912152)) {
			anIntArray5718[i] = i_444_;
			anIntArray5714[i]
			    = method8447(i_442_, i_443_, -489144436);
			i++;
		    }
		}
	    }
	}
	anInt5699 = -179707951 * i;
	method8436(anInt5724 * -858656915 >> 4, anInt5706 * -2041900081 >> 4,
		   3, false, -903382965);
    }
    
    public void method8558() {
	aClass597_5707 = new Class597();
	anInt5690 = 0;
	anInt5689 = 0;
    }
    
    void method8559(Class460_Sub1 class460_sub1, byte[][] is) {
	int i = is.length;
	for (int i_446_ = 0; i_446_ < i; i_446_++) {
	    byte[] is_447_ = is[i_446_];
	    if (null != is_447_) {
		Class534_Sub40 class534_sub40 = new Class534_Sub40(is_447_);
		int i_448_ = anIntArray5718[i_446_] >> 8;
		int i_449_ = anIntArray5718[i_446_] & 0xff;
		int i_450_
		    = 64 * i_448_ - aClass597_5707.anInt7859 * -424199969;
		int i_451_
		    = i_449_ * 64 - aClass597_5707.anInt7861 * -1166289421;
		if (!aBool5713 && null != Class171_Sub4.aClass232_9944)
		    Class171_Sub4.aClass232_9944.method4270((byte) -1);
		class460_sub1.method7450(class534_sub40, i_450_, i_451_,
					 aClass597_5707.anInt7859 * -424199969,
					 (-1166289421
					  * aClass597_5707.anInt7861),
					 146794291);
		class460_sub1.method15951(Class254.aClass185_2683,
					  class534_sub40, i_450_, i_451_,
					  72154613);
	    }
	}
	for (int i_452_ = 0; i_452_ < i; i_452_++) {
	    int i_453_ = ((anIntArray5718[i_452_] >> 8) * 64
			  - aClass597_5707.anInt7859 * -424199969);
	    int i_454_ = (64 * (anIntArray5718[i_452_] & 0xff)
			  - aClass597_5707.anInt7861 * -1166289421);
	    byte[] is_455_ = is[i_452_];
	    if (is_455_ == null && anInt5690 * 102545369 < 800) {
		if (!aBool5713 && null != Class171_Sub4.aClass232_9944)
		    Class171_Sub4.aClass232_9944.method4270((byte) -1);
		class460_sub1.method7448(i_453_, i_454_, 64, 64, (byte) 72);
	    }
	}
    }
    
    void method8560(Class460_Sub1 class460_sub1, byte[][] is) {
	int i = is.length;
	for (int i_456_ = 0; i_456_ < i; i_456_++) {
	    byte[] is_457_ = is[i_456_];
	    if (null != is_457_) {
		Class534_Sub40 class534_sub40 = new Class534_Sub40(is_457_);
		int i_458_ = anIntArray5718[i_456_] >> 8;
		int i_459_ = anIntArray5718[i_456_] & 0xff;
		int i_460_
		    = 64 * i_458_ - aClass597_5707.anInt7859 * -424199969;
		int i_461_
		    = i_459_ * 64 - aClass597_5707.anInt7861 * -1166289421;
		if (!aBool5713 && null != Class171_Sub4.aClass232_9944)
		    Class171_Sub4.aClass232_9944.method4270((byte) -1);
		class460_sub1.method7450(class534_sub40, i_460_, i_461_,
					 aClass597_5707.anInt7859 * -424199969,
					 (-1166289421
					  * aClass597_5707.anInt7861),
					 302644248);
		class460_sub1.method15951(Class254.aClass185_2683,
					  class534_sub40, i_460_, i_461_,
					  -2040912116);
	    }
	}
	for (int i_462_ = 0; i_462_ < i; i_462_++) {
	    int i_463_ = ((anIntArray5718[i_462_] >> 8) * 64
			  - aClass597_5707.anInt7859 * -424199969);
	    int i_464_ = (64 * (anIntArray5718[i_462_] & 0xff)
			  - aClass597_5707.anInt7861 * -1166289421);
	    byte[] is_465_ = is[i_462_];
	    if (is_465_ == null && anInt5690 * 102545369 < 800) {
		if (!aBool5713 && null != Class171_Sub4.aClass232_9944)
		    Class171_Sub4.aClass232_9944.method4270((byte) -1);
		class460_sub1.method7448(i_463_, i_464_, 64, 64, (byte) 15);
	    }
	}
    }
    
    void method8561(Class460_Sub1 class460_sub1, byte[][] is) {
	for (int i = 0; i < -692901467 * class460_sub1.anInt4991; i++) {
	    if (!aBool5713)
		Class171_Sub4.aClass232_9944.method4270((byte) -1);
	    for (int i_466_ = 0; i_466_ < -858656915 * anInt5724 >> 3;
		 i_466_++) {
		for (int i_467_ = 0; i_467_ < anInt5706 * -2041900081 >> 3;
		     i_467_++) {
		    int i_468_ = anIntArrayArrayArray5720[i][i_466_][i_467_];
		    if (i_468_ != -1) {
			int i_469_ = i_468_ >> 24 & 0x3;
			if (!class460_sub1.aBool5002 || 0 == i_469_) {
			    int i_470_ = i_468_ >> 1 & 0x3;
			    int i_471_ = i_468_ >> 14 & 0x3ff;
			    int i_472_ = i_468_ >> 3 & 0x7ff;
			    int i_473_ = (i_471_ / 8 << 8) + i_472_ / 8;
			    for (int i_474_ = 0;
				 i_474_ < anIntArray5718.length; i_474_++) {
				if (anIntArray5718[i_474_] == i_473_
				    && null != is[i_474_]) {
				    Class534_Sub40 class534_sub40
					= new Class534_Sub40(is[i_474_]);
				    class460_sub1.method7451(class534_sub40, i,
							     i_466_ * 8,
							     i_467_ * 8,
							     i_469_, i_471_,
							     i_472_, i_470_,
							     17054994);
				    class460_sub1.method15949
					(Class254.aClass185_2683,
					 class534_sub40, i, 8 * i_466_,
					 8 * i_467_, i_469_, i_471_, i_472_,
					 i_470_, -1030488951);
				    break;
				}
			    }
			}
		    }
		}
	    }
	}
	for (int i = 0; i < -692901467 * class460_sub1.anInt4991; i++) {
	    if (!aBool5713)
		Class171_Sub4.aClass232_9944.method4270((byte) -1);
	    for (int i_475_ = 0; i_475_ < anInt5724 * -858656915 >> 3;
		 i_475_++) {
		for (int i_476_ = 0; i_476_ < anInt5706 * -2041900081 >> 3;
		     i_476_++) {
		    int i_477_ = anIntArrayArrayArray5720[i][i_475_][i_476_];
		    if (i_477_ == -1)
			class460_sub1.method7449(i, 8 * i_475_, 8 * i_476_, 8,
						 8, -904088808);
		}
	    }
	}
    }
    
    void method8562(Class460_Sub1 class460_sub1, byte[][] is) {
	for (int i = 0; i < -692901467 * class460_sub1.anInt4991; i++) {
	    if (!aBool5713)
		Class171_Sub4.aClass232_9944.method4270((byte) -1);
	    for (int i_478_ = 0; i_478_ < -858656915 * anInt5724 >> 3;
		 i_478_++) {
		for (int i_479_ = 0; i_479_ < anInt5706 * -2041900081 >> 3;
		     i_479_++) {
		    int i_480_ = anIntArrayArrayArray5720[i][i_478_][i_479_];
		    if (i_480_ != -1) {
			int i_481_ = i_480_ >> 24 & 0x3;
			if (!class460_sub1.aBool5002 || 0 == i_481_) {
			    int i_482_ = i_480_ >> 1 & 0x3;
			    int i_483_ = i_480_ >> 14 & 0x3ff;
			    int i_484_ = i_480_ >> 3 & 0x7ff;
			    int i_485_ = (i_483_ / 8 << 8) + i_484_ / 8;
			    for (int i_486_ = 0;
				 i_486_ < anIntArray5718.length; i_486_++) {
				if (anIntArray5718[i_486_] == i_485_
				    && null != is[i_486_]) {
				    Class534_Sub40 class534_sub40
					= new Class534_Sub40(is[i_486_]);
				    class460_sub1.method7451(class534_sub40, i,
							     i_478_ * 8,
							     i_479_ * 8,
							     i_481_, i_483_,
							     i_484_, i_482_,
							     17054994);
				    class460_sub1.method15949
					(Class254.aClass185_2683,
					 class534_sub40, i, 8 * i_478_,
					 8 * i_479_, i_481_, i_483_, i_484_,
					 i_482_, -1030488951);
				    break;
				}
			    }
			}
		    }
		}
	    }
	}
	for (int i = 0; i < -692901467 * class460_sub1.anInt4991; i++) {
	    if (!aBool5713)
		Class171_Sub4.aClass232_9944.method4270((byte) -1);
	    for (int i_487_ = 0; i_487_ < anInt5724 * -858656915 >> 3;
		 i_487_++) {
		for (int i_488_ = 0; i_488_ < anInt5706 * -2041900081 >> 3;
		     i_488_++) {
		    int i_489_ = anIntArrayArrayArray5720[i][i_487_][i_488_];
		    if (i_489_ == -1)
			class460_sub1.method7449(i, 8 * i_487_, 8 * i_488_, 8,
						 8, -904088808);
		}
	    }
	}
    }
    
    void method8563(int i) {
	int i_490_ = (aClass597_5707.anInt7859 * -424199969
		      - -424199969 * aClass597_5688.anInt7859);
	int i_491_ = (aClass597_5707.anInt7861 * -1166289421
		      - -1166289421 * aClass597_5688.anInt7861);
	if (i == 3) {
	    for (int i_492_ = 0; i_492_ < client.anInt11148 * 759971875;
		 i_492_++) {
		Class534_Sub6 class534_sub6
		    = client.aClass534_Sub6Array11085[i_492_];
		if (null != class534_sub6) {
		    Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
			= ((Class654_Sub1_Sub5_Sub1_Sub1)
			   class534_sub6.anObject10417);
		    for (int i_493_ = 0;
			 i_493_ < (class654_sub1_sub5_sub1_sub1
				   .anIntArray11977).length;
			 i_493_++) {
			class654_sub1_sub5_sub1_sub1.anIntArray11977[i_493_]
			    -= i_490_;
			class654_sub1_sub5_sub1_sub1.anIntArray11978[i_493_]
			    -= i_491_;
		    }
		    Class438 class438
			= Class438.method6994(class654_sub1_sub5_sub1_sub1
						  .method10807
					      ().aClass438_4885);
		    class438.aFloat4864 -= (float) (i_490_ * 512);
		    class438.aFloat4865 -= (float) (512 * i_491_);
		    class654_sub1_sub5_sub1_sub1.method10809(class438);
		    class438.method7074();
		}
	    }
	} else {
	    boolean bool = false;
	    client.anInt11321 = 0;
	    int i_494_ = anInt5724 * -1545676288 - 512;
	    int i_495_ = -1775788544 * anInt5706 - 512;
	    for (int i_496_ = 0; i_496_ < 759971875 * client.anInt11148;
		 i_496_++) {
		Class534_Sub6 class534_sub6
		    = client.aClass534_Sub6Array11085[i_496_];
		if (class534_sub6 != null) {
		    Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
			= ((Class654_Sub1_Sub5_Sub1_Sub1)
			   class534_sub6.anObject10417);
		    Class438 class438
			= Class438.method6994(class654_sub1_sub5_sub1_sub1
						  .method10807
					      ().aClass438_4885);
		    class438.aFloat4864 -= (float) (512 * i_490_);
		    class438.aFloat4865 -= (float) (512 * i_491_);
		    class654_sub1_sub5_sub1_sub1.method10809(class438);
		    if ((int) class438.aFloat4864 < 0
			|| (int) class438.aFloat4864 > i_494_
			|| (int) class438.aFloat4865 < 0
			|| (int) class438.aFloat4865 > i_495_) {
			class654_sub1_sub5_sub1_sub1.method18827(null,
								 (byte) -2);
			class534_sub6.method8892((byte) 1);
			bool = true;
		    } else {
			boolean bool_497_ = true;
			for (int i_498_ = 0;
			     i_498_ < (class654_sub1_sub5_sub1_sub1
				       .anIntArray11977).length;
			     i_498_++) {
			    class654_sub1_sub5_sub1_sub1.anIntArray11977
				[i_498_]
				-= i_490_;
			    class654_sub1_sub5_sub1_sub1.anIntArray11978
				[i_498_]
				-= i_491_;
			    if ((class654_sub1_sub5_sub1_sub1.anIntArray11977
				 [i_498_]) < 0
				|| ((class654_sub1_sub5_sub1_sub1
				     .anIntArray11977[i_498_])
				    >= anInt5724 * -858656915)
				|| (class654_sub1_sub5_sub1_sub1
				    .anIntArray11978[i_498_]) < 0
				|| ((class654_sub1_sub5_sub1_sub1
				     .anIntArray11978[i_498_])
				    >= -2041900081 * anInt5706))
				bool_497_ = false;
			}
			if (bool_497_)
			    client.anIntArray11088[((client.anInt11321
						     += 590354627)
						    * -1125820437) - 1]
				= (1126388985
				   * class654_sub1_sub5_sub1_sub1.anInt11922);
			else {
			    class654_sub1_sub5_sub1_sub1
				.method18827(null, (byte) -2);
			    class534_sub6.method8892((byte) 1);
			    bool = true;
			}
		    }
		    class438.method7074();
		}
	    }
	    if (bool) {
		client.anInt11148
		    = client.aClass9_11331.method600(1654174743) * 1085173643;
		int i_499_ = 0;
		Iterator iterator = client.aClass9_11331.iterator();
		while (iterator.hasNext()) {
		    Class534_Sub6 class534_sub6
			= (Class534_Sub6) iterator.next();
		    client.aClass534_Sub6Array11085[i_499_++] = class534_sub6;
		}
	    }
	}
	for (int i_500_ = 0; i_500_ < 2048; i_500_++) {
	    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		= client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i_500_];
	    if (class654_sub1_sub5_sub1_sub2 != null) {
		for (int i_501_ = 0;
		     (i_501_
		      < class654_sub1_sub5_sub1_sub2.anIntArray11977.length);
		     i_501_++) {
		    class654_sub1_sub5_sub1_sub2.anIntArray11977[i_501_]
			-= i_490_;
		    class654_sub1_sub5_sub1_sub2.anIntArray11978[i_501_]
			-= i_491_;
		}
		Class438 class438
		    = Class438.method6994(class654_sub1_sub5_sub1_sub2
					      .method10807().aClass438_4885);
		class438.aFloat4864 -= (float) (i_490_ * 512);
		class438.aFloat4865 -= (float) (i_491_ * 512);
		class654_sub1_sub5_sub1_sub2.method10809(class438);
		class438.method7074();
	    }
	}
	Class99[] class99s = client.aClass99Array11053;
	for (int i_502_ = 0; i_502_ < class99s.length; i_502_++) {
	    Class99 class99 = class99s[i_502_];
	    if (class99 != null) {
		class99.anInt1171 -= -1208905216 * i_490_;
		class99.anInt1172 -= i_491_ * 1906770432;
	    }
	}
	for (Class534_Sub4 class534_sub4
		 = ((Class534_Sub4)
		    Class534_Sub4.aClass700_10408.method14135((byte) -1));
	     null != class534_sub4;
	     class534_sub4 = (Class534_Sub4) Class534_Sub4.aClass700_10408
						 .method14139(1311206471)) {
	    class534_sub4.anInt10397 -= 1402161037 * i_490_;
	    class534_sub4.anInt10400 -= i_491_ * 2107243719;
	    Class602 class602
		= ((Class602)
		   aClass44_Sub13_5712.method91((class534_sub4.anInt10398
						 * -1375582077),
						-1154956725));
	    int i_503_;
	    int i_504_;
	    if (0 == (class534_sub4.anInt10403 * 220446523 & 0x1)) {
		i_503_ = -1082258489 * class602.anInt7904;
		i_504_ = class602.anInt7928 * -1990374967;
	    } else {
		i_503_ = -1990374967 * class602.anInt7928;
		i_504_ = class602.anInt7904 * -1082258489;
	    }
	    if (Class499.aClass499_5599 != aClass499_5682
		&& (i_503_ + class534_sub4.anInt10397 * -1522052283 <= 0
		    || class534_sub4.anInt10400 * -1246362377 + i_504_ <= 0
		    || (-1522052283 * class534_sub4.anInt10397
			>= -858656915 * anInt5724)
		    || (class534_sub4.anInt10400 * -1246362377
			>= -2041900081 * anInt5706)))
		class534_sub4.method8892((byte) 1);
	}
	for (Class534_Sub4 class534_sub4
		 = ((Class534_Sub4)
		    Class534_Sub4.aClass700_10409.method14135((byte) -1));
	     class534_sub4 != null;
	     class534_sub4 = (Class534_Sub4) Class534_Sub4.aClass700_10409
						 .method14139(615932010)) {
	    class534_sub4.anInt10397 -= i_490_ * 1402161037;
	    class534_sub4.anInt10400 -= i_491_ * 2107243719;
	    Class602 class602
		= ((Class602)
		   aClass44_Sub13_5712.method91((class534_sub4.anInt10398
						 * -1375582077),
						-26182766));
	    int i_505_;
	    int i_506_;
	    if ((220446523 * class534_sub4.anInt10403 & 0x1) == 0) {
		i_505_ = class602.anInt7904 * -1082258489;
		i_506_ = -1990374967 * class602.anInt7928;
	    } else {
		i_505_ = class602.anInt7928 * -1990374967;
		i_506_ = class602.anInt7904 * -1082258489;
	    }
	    if (aClass499_5682 != Class499.aClass499_5599
		&& (i_505_ + class534_sub4.anInt10397 * -1522052283 <= 0
		    || class534_sub4.anInt10400 * -1246362377 + i_506_ <= 0
		    || (class534_sub4.anInt10397 * -1522052283
			>= anInt5724 * -858656915)
		    || (-1246362377 * class534_sub4.anInt10400
			>= -2041900081 * anInt5706)))
		class534_sub4.method8892((byte) 1);
	}
	for (Class534_Sub7 class534_sub7
		 = (Class534_Sub7) client.aClass9_11209.method583(-1529019257);
	     null != class534_sub7;
	     class534_sub7 = ((Class534_Sub7)
			      client.aClass9_11209.method584((byte) -11))) {
	    int i_507_
		= (int) (8258869577519436579L * class534_sub7.aLong7158 >> 28
			 & 0x3L);
	    int i_508_ = (int) (class534_sub7.aLong7158 * 8258869577519436579L
				& 0x3fffL);
	    int i_509_ = i_508_ - -424199969 * aClass597_5707.anInt7859;
	    int i_510_
		= (int) (8258869577519436579L * class534_sub7.aLong7158 >> 14
			 & 0x3fffL);
	    int i_511_ = i_510_ - aClass597_5707.anInt7861 * -1166289421;
	    if (aClass556_5721 != null) {
		if (i_509_ < 0 || i_511_ < 0
		    || i_509_ >= -858656915 * anInt5724
		    || i_511_ >= -2041900081 * anInt5706
		    || i_509_ >= 1183912005 * aClass556_5721.anInt7435
		    || i_511_ >= 60330541 * aClass556_5721.anInt7470) {
		    if (aClass499_5682 != Class499.aClass499_5599)
			class534_sub7.method8892((byte) 1);
		} else if (aClass556_5721.aClass568ArrayArrayArray7431 != null)
		    aClass556_5721.method9254(i_507_, i_509_, i_511_,
					      1632417183);
	    }
	}
	if (0 != Class113.anInt1375 * -1254538725) {
	    Class113.anInt1375 -= -1660827629 * i_490_;
	    Class113.anInt1376 -= 517634255 * i_491_;
	}
	Class278.method5224(false, 117021458);
	if (i == 3) {
	    client.anInt11137 -= -590552576 * i_490_;
	    client.anInt11138 -= i_491_ * -1766187520;
	    Class588.anInt7808 -= i_490_ * -1630722560;
	    Class453.anInt4958 -= -191354368 * i_491_;
	    if (-891094135 * Class10.anInt75 != 5
		&& 3 != Class10.anInt75 * -891094135)
		Class235.method4408(Class200_Sub5.method15573((byte) 2),
				    (byte) 54);
	} else {
	    Class200_Sub8.anInt9909 -= -827897067 * i_490_;
	    Class200_Sub9.anInt9916 -= i_491_ * 1775664559;
	    Class652.anInt8484 -= 1442265799 * i_490_;
	    Class609.anInt8007 -= i_491_ * -1322167097;
	    Class200_Sub13.anInt9937 -= 659663360 * i_490_;
	    Class636.anInt8305 -= -1131865600 * i_491_;
	    if (Math.abs(i_490_) > -858656915 * anInt5724
		|| Math.abs(i_491_) > -2041900081 * anInt5706)
		aClass616_5694.method10157(2055457474);
	}
	Class489.method8005(115577057);
	Class561.method9444((byte) -100);
	client.aClass9_11322.method578((byte) -45);
	client.aClass700_11210.method14152(-2101790794);
	client.aClass709_11212.method14283(-1107967299);
	Class569.method9598(1087072516);
    }
    
    void method8564(Class460_Sub1 class460_sub1, byte[][] is) {
	for (int i = 0; i < -692901467 * class460_sub1.anInt4991; i++) {
	    if (!aBool5713)
		Class171_Sub4.aClass232_9944.method4270((byte) -1);
	    for (int i_512_ = 0; i_512_ < -858656915 * anInt5724 >> 3;
		 i_512_++) {
		for (int i_513_ = 0; i_513_ < anInt5706 * -2041900081 >> 3;
		     i_513_++) {
		    int i_514_ = anIntArrayArrayArray5720[i][i_512_][i_513_];
		    if (i_514_ != -1) {
			int i_515_ = i_514_ >> 24 & 0x3;
			if (!class460_sub1.aBool5002 || 0 == i_515_) {
			    int i_516_ = i_514_ >> 1 & 0x3;
			    int i_517_ = i_514_ >> 14 & 0x3ff;
			    int i_518_ = i_514_ >> 3 & 0x7ff;
			    int i_519_ = (i_517_ / 8 << 8) + i_518_ / 8;
			    for (int i_520_ = 0;
				 i_520_ < anIntArray5718.length; i_520_++) {
				if (anIntArray5718[i_520_] == i_519_
				    && null != is[i_520_]) {
				    Class534_Sub40 class534_sub40
					= new Class534_Sub40(is[i_520_]);
				    class460_sub1.method7451(class534_sub40, i,
							     i_512_ * 8,
							     i_513_ * 8,
							     i_515_, i_517_,
							     i_518_, i_516_,
							     17054994);
				    class460_sub1.method15949
					(Class254.aClass185_2683,
					 class534_sub40, i, 8 * i_512_,
					 8 * i_513_, i_515_, i_517_, i_518_,
					 i_516_, -1030488951);
				    break;
				}
			    }
			}
		    }
		}
	    }
	}
	for (int i = 0; i < -692901467 * class460_sub1.anInt4991; i++) {
	    if (!aBool5713)
		Class171_Sub4.aClass232_9944.method4270((byte) -1);
	    for (int i_521_ = 0; i_521_ < anInt5724 * -858656915 >> 3;
		 i_521_++) {
		for (int i_522_ = 0; i_522_ < anInt5706 * -2041900081 >> 3;
		     i_522_++) {
		    int i_523_ = anIntArrayArrayArray5720[i][i_521_][i_522_];
		    if (i_523_ == -1)
			class460_sub1.method7449(i, 8 * i_521_, 8 * i_522_, 8,
						 8, -904088808);
		}
	    }
	}
    }
    
    void method8565(int i) {
	try {
	    Thread.sleep((long) i);
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    void method8566(Class460_Sub1 class460_sub1, byte[][] is) {
	for (int i = 0; i < anInt5699 * -1729832655; i++) {
	    byte[] is_524_ = is[i];
	    if (is_524_ != null) {
		int i_525_ = ((anIntArray5718[i] >> 8) * 64
			      - -424199969 * aClass597_5707.anInt7859);
		int i_526_ = ((anIntArray5718[i] & 0xff) * 64
			      - aClass597_5707.anInt7861 * -1166289421);
		if (!aBool5713)
		    Class171_Sub4.aClass232_9944.method4270((byte) -1);
		class460_sub1.method15940(Class254.aClass185_2683, is_524_,
					  i_525_, i_526_, -1536094921);
		if (aBool5713)
		    method8454(10, -373652533);
	    }
	}
    }
    
    public void method8567(byte[][][] is, byte i) {
	aByteArrayArrayArray5705 = is;
    }
    
    void method8568(Class460_Sub1 class460_sub1, byte[][] is) {
	for (int i = 0; i < anInt5699 * -1729832655; i++) {
	    byte[] is_527_ = is[i];
	    if (is_527_ != null) {
		int i_528_ = ((anIntArray5718[i] >> 8) * 64
			      - -424199969 * aClass597_5707.anInt7859);
		int i_529_ = ((anIntArray5718[i] & 0xff) * 64
			      - aClass597_5707.anInt7861 * -1166289421);
		if (!aBool5713)
		    Class171_Sub4.aClass232_9944.method4270((byte) -1);
		class460_sub1.method15940(Class254.aClass185_2683, is_527_,
					  i_528_, i_529_, -1536094921);
		if (aBool5713)
		    method8454(10, 996347139);
	    }
	}
    }
    
    public boolean method8569(int i) {
	if (!aBool5713)
	    Class184.method3220(false, (byte) -111);
	if (aLong5711 * 1097591286410319761L == -1L)
	    aLong5711
		= Class250.method4604((byte) -79) * -2452396203634292367L;
	anInt5693 = 0;
	for (int i_530_ = 0; i_530_ < anInt5699 * -1729832655; i_530_++) {
	    if (!Class298_Sub1.aClass472_10064
		     .method7681(anIntArray5714[i_530_], 1514418080))
		anInt5693 += 58619833;
	}
	if (aClass523_5691 == null) {
	    if (null != aClass534_Sub18_Sub9_5698
		&& Class74.aClass472_800.method7685((aClass534_Sub18_Sub9_5698
						     .aString11765),
						    (short) -6593)) {
		if (!Class74.aClass472_800.method7705
		     (aClass534_Sub18_Sub9_5698.aString11765, -315303067))
		    anInt5693 += 58619833;
		else
		    aClass523_5691
			= Class369.method6378(Class74.aClass472_800,
					      (aClass534_Sub18_Sub9_5698
					       .aString11765),
					      client.aBool11157, (byte) -101);
	    } else
		aClass523_5691 = new Class523(0);
	}
	if (-1304666487 * anInt5693 > 0) {
	    if (anInt5708 * -568733371 < anInt5693 * -1304666487)
		anInt5708 = -961318283 * anInt5693;
	    aClass507_5695 = Class507.aClass507_5664;
	    return false;
	}
	for (int i_531_ = 0; i_531_ < -1729832655 * anInt5699; i_531_++) {
	    if (aByteArrayArray5715[i_531_] == null)
		aByteArrayArray5715[i_531_]
		    = (Class298_Sub1.aClass472_10064.method7743
		       (anIntArray5714[i_531_],
			625273953 * Class465.aClass465_5117.anInt5123,
			-741764108));
	    if (null == aByteArrayArray5716[i_531_])
		aByteArrayArray5716[i_531_]
		    = (Class298_Sub1.aClass472_10064.method7743
		       (anIntArray5714[i_531_],
			625273953 * Class465.aClass465_5115.anInt5123,
			-1669127165));
	    if (aByteArrayArray5692[i_531_] == null)
		aByteArrayArray5692[i_531_]
		    = (Class298_Sub1.aClass472_10064.method7743
		       (anIntArray5714[i_531_],
			Class465.aClass465_5118.anInt5123 * 625273953,
			-535105502));
	    if (aByteArrayArray5719[i_531_] == null)
		aByteArrayArray5719[i_531_]
		    = (Class298_Sub1.aClass472_10064.method7743
		       (anIntArray5714[i_531_],
			625273953 * Class465.aClass465_5114.anInt5123,
			-399883654));
	    if (aByteArrayArray5717 != null
		&& null == aByteArrayArray5717[i_531_])
		aByteArrayArray5717[i_531_]
		    = (Class298_Sub1.aClass472_10064.method7743
		       (anIntArray5714[i_531_],
			625273953 * Class465.aClass465_5119.anInt5123,
			-1799325670));
	}
	int i_532_ = -284446239 * anInt5709;
	Class647 class647 = new Class647(-1);
	Class647 class647_533_ = new Class647(-1);
	anInt5709 = 0;
	for (int i_534_ = 0; i_534_ < anInt5699 * -1729832655; i_534_++) {
	    byte[] is = aByteArrayArray5716[i_534_];
	    if (null != is) {
		int i_535_ = (64 * (anIntArray5718[i_534_] >> 8)
			      - aClass597_5707.anInt7859 * -424199969);
		int i_536_ = ((anIntArray5718[i_534_] & 0xff) * 64
			      - -1166289421 * aClass597_5707.anInt7861);
		if (aClass499_5682.method8264(1222796089)) {
		    i_535_ = 10;
		    i_536_ = 10;
		}
		int i_537_
		    = Class472.method7745(aClass44_Sub13_5712, is, i_535_,
					  i_536_, -858656915 * anInt5724,
					  -2041900081 * anInt5706,
					  class647_533_, class647,
					  (byte) -105);
		if (i_537_ > 0)
		    anInt5709 += -922463711 * i_537_;
	    }
	    is = aByteArrayArray5719[i_534_];
	    if (null != is) {
		int i_538_ = ((anIntArray5718[i_534_] >> 8) * 64
			      - aClass597_5707.anInt7859 * -424199969);
		int i_539_ = (64 * (anIntArray5718[i_534_] & 0xff)
			      - aClass597_5707.anInt7861 * -1166289421);
		if (aClass499_5682.method8264(570594407)) {
		    i_538_ = 10;
		    i_539_ = 10;
		}
		int i_540_
		    = Class472.method7745(aClass44_Sub13_5712, is, i_538_,
					  i_539_, anInt5724 * -858656915,
					  anInt5706 * -2041900081,
					  class647_533_, class647, (byte) -98);
		if (i_540_ > 0)
		    anInt5709 += -922463711 * i_540_;
	    }
	}
	if (-284446239 * anInt5709 > 0) {
	    if (i_532_ == -284446239 * anInt5709) {
		if (0 != anInt5687 * 1765484627
		    && 1000 == client.anInt11101 - anInt5687 * 1765484627) {
		    Class229.method4203(class647_533_.anInt8375 * 1015861657,
					1015861657 * class647.anInt8375,
					-284446239 * anInt5709, 1447612006);
		    Class539.method8928(-547844935);
		}
	    } else
		anInt5687 = 1121278939 * client.anInt11101;
	    if (anInt5710 * -1443452255 < anInt5709 * -284446239)
		anInt5710 = 854916929 * anInt5709;
	    aClass507_5695 = Class507.aClass507_5665;
	    return false;
	}
	if (!aBool5713 && Class507.aClass507_5666 != aClass507_5695)
	    Class689.method14015
		(new StringBuilder().append
		     (Class58.aClass58_460.method1245(Class539.aClass672_7171,
						      (byte) -121))
		     .append
		     (Class29.aString264).append
		     ("(100%)").toString(),
		 true, Class254.aClass185_2683, Class539_Sub1.aClass171_10327,
		 Class67.aClass16_720, (byte) -34);
	aClass507_5695 = Class507.aClass507_5667;
	if (!aBool5713 && null != Class171_Sub4.aClass232_9944)
	    Class171_Sub4.aClass232_9944.method4270((byte) -1);
	if (!aBool5713) {
	    for (int i_541_ = 0; i_541_ < 2048; i_541_++) {
		Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		    = client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i_541_];
		if (null != class654_sub1_sub5_sub1_sub2)
		    class654_sub1_sub5_sub1_sub2.aClass556_10855 = null;
	    }
	    for (int i_542_ = 0;
		 i_542_ < client.aClass534_Sub6Array11085.length; i_542_++) {
		Class534_Sub6 class534_sub6
		    = client.aClass534_Sub6Array11085[i_542_];
		if (null != class534_sub6)
		    ((Class654_Sub1)
		     class534_sub6.anObject10417).aClass556_10855
			= null;
	    }
	}
	if (!aBool5713)
	    Class11.method611(true, -1798431020);
	boolean bool = false;
	if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub3_10767
		.method16839(853489118)
	    == 2) {
	    for (int i_543_ = 0; i_543_ < anInt5699 * -1729832655; i_543_++) {
		if (null != aByteArrayArray5719[i_543_]
		    || aByteArrayArray5692[i_543_] != null) {
		    bool = true;
		    break;
		}
	    }
	}
	int i_544_ = (Class524.method8733(Class44_Sub6
					      .aClass534_Sub35_10989
					      .aClass690_Sub35_10783
					      .method17179((byte) -124),
					  1485266147).anInt3119
		      * 1956245800);
	if (Class254.aClass185_2683.method3333())
	    i_544_++;
	method8439((byte) 8);
	method8452(-244646687);
	aClass556_5721
	    = new Class556(Class254.aClass185_2683, 9, 4,
			   anInt5724 * -858656915, anInt5706 * -2041900081,
			   i_544_, bool,
			   Class254.aClass185_2683.method3344() > 0);
	aClass556_5721.method9228(false, (byte) -12);
	aClass556_5721.method9342(client.anInt11060 * 1757769263, 136598450);
	aClass556_5721.method9251(aHashMap5723, (byte) -67);
	if (client.anInt11060 * 1757769263 != 0)
	    aClass556_5721.method9227(Class219.aClass171_2307, (byte) 0);
	else
	    aClass556_5721.method9227(null, (byte) 0);
	aClass514_5681 = new Class514();
	aFloat5701 = -0.05F + (float) (Math.random() / 10.0);
	aClass460_Sub1_5686
	    = new Class460_Sub1(aClass556_5721, aClass44_Sub13_5712, 4,
				anInt5724 * -858656915,
				anInt5706 * -2041900081, false, aClass468_5702,
				aClass616_5694);
	aClass460_Sub1_5686.method7446(-1191772863);
	aClass460_Sub1_5686.anInt4986
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub6_10743
		  .method16923((byte) 127) * -78666497;
	aClass460_Sub1_5686.aBool5043
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub3_10767
		  .method16839(-353693287) == 2;
	aClass460_Sub1_5686.aBool4998
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub12_10753
		  .method16985(16711680) == 1;
	aClass460_Sub1_5686.aBool4981
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub25_10750
		  .method17102((byte) -122) == 1;
	aClass460_Sub1_5686.aBool4990
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub16_10763
		  .method17030((byte) -8) == 1;
	if (!aClass499_5682.method8264(-701911411))
	    method8425(aClass460_Sub1_5686, aByteArrayArray5715, 735142481);
	else
	    method8522(aClass460_Sub1_5686, aByteArrayArray5715, -218585457);
	if (aBool5713)
	    method8454(50, -1246291179);
	aClass616_5694.method10153(-858656915 * anInt5724 >> 4,
				   -2041900081 * anInt5706 >> 4, 1059828658);
	aClass616_5694.method10141(this, (byte) 28);
	if (bool) {
	    aClass556_5721.method9228(true, (byte) -42);
	    aClass460_Sub1_5685
		= new Class460_Sub1(aClass556_5721, aClass44_Sub13_5712, 1,
				    anInt5724 * -858656915,
				    -2041900081 * anInt5706, true,
				    aClass468_5702, aClass616_5694);
	    aClass460_Sub1_5685.method7446(929267194);
	    aClass460_Sub1_5685.anInt4986
		= Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub6_10743
		      .method16923((byte) 8) * -78666497;
	    aClass460_Sub1_5685.aBool5043
		= Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub3_10767
		      .method16839(1180500647) == 2;
	    aClass460_Sub1_5685.aBool4998
		= Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub12_10753
		      .method16985(16711680) == 1;
	    aClass460_Sub1_5685.aBool4981
		= Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub25_10750
		      .method17102((byte) -127) == 1;
	    aClass460_Sub1_5685.aBool4990
		= Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub16_10763
		      .method17030((byte) -16) == 1;
	    if (!aClass499_5682.method8264(-600991621)) {
		method8425(aClass460_Sub1_5685, aByteArrayArray5692,
			   735142481);
		if (!aBool5713)
		    Class184.method3220(true, (byte) -80);
	    } else {
		method8522(aClass460_Sub1_5685, aByteArrayArray5692,
			   -1062321988);
		if (!aBool5713)
		    Class184.method3220(true, (byte) -90);
	    }
	    aClass460_Sub1_5685.method7459(0,
					   (aClass460_Sub1_5686
					    .anIntArrayArrayArray4995[0]),
					   (byte) 1);
	    aClass460_Sub1_5685.method7454(Class254.aClass185_2683, null,
					   -2036392985);
	    aClass556_5721.method9228(false, (byte) -96);
	    if (aBool5713)
		method8454(50, 809966266);
	}
	aClass460_Sub1_5686.method7454(Class254.aClass185_2683,
				       (bool
					? (aClass460_Sub1_5685
					   .anIntArrayArrayArray4995)
					: null),
				       -1781342915);
	if (!aClass499_5682.method8264(-866354934)) {
	    if (!aBool5713)
		Class184.method3220(true, (byte) -66);
	    method8457(aClass460_Sub1_5686, aByteArrayArray5716, (byte) 0);
	    if (aByteArrayArray5717 != null)
		method8459(863820436);
	} else {
	    if (!aBool5713)
		Class184.method3220(true, (byte) -69);
	    method8458(aClass460_Sub1_5686, aByteArrayArray5716, (byte) 20);
	}
	if (!aBool5713)
	    Class184.method3220(true, (byte) -104);
	aClass460_Sub1_5686.method7455(Class254.aClass185_2683,
				       (bool
					? aClass556_5721.aClass151Array7436[0]
					: null),
				       null, (byte) 0);
	if (aBool5713)
	    method8454(75, -626348936);
	aClass460_Sub1_5686.method15947(Class254.aClass185_2683, false,
					(byte) 39);
	if (aBool5713)
	    method8454(75, -1698367071);
	if (!aBool5713)
	    Class184.method3220(true, (byte) -125);
	if (bool) {
	    aClass556_5721.method9228(true, (byte) -68);
	    if (!aBool5713)
		Class184.method3220(true, (byte) -41);
	    if (!aClass499_5682.method8264(1107139593))
		method8457(aClass460_Sub1_5685, aByteArrayArray5719, (byte) 0);
	    else
		method8458(aClass460_Sub1_5685, aByteArrayArray5719,
			   (byte) 29);
	    if (!aBool5713)
		Class184.method3220(true, (byte) -55);
	    aClass460_Sub1_5685.method7455(Class254.aClass185_2683, null,
					   (aClass556_5721.aClass151Array7434
					    [0]),
					   (byte) 0);
	    aClass460_Sub1_5685.method15947(Class254.aClass185_2683, true,
					    (byte) 24);
	    if (!aBool5713)
		Class184.method3220(true, (byte) -111);
	    aClass556_5721.method9228(false, (byte) 5);
	    if (aBool5713)
		method8454(50, 515304075);
	}
	aClass460_Sub1_5686.method7470(-1245302861);
	if (aClass460_Sub1_5685 != null)
	    aClass460_Sub1_5685.method7470(-1372800987);
	aClass556_5721.method9229(-2084620599);
	if (aBool5713) {
	    Class250.method4604((byte) -21);
	    while (!Class254.aClass185_2683.method3669(1819862316))
		method8454(1, -795806910);
	}
	boolean bool_545_ = false;
	if (aBool5713) {
	    Class512 class512_546_ = client.aClass512_11100;
	    method8423(class512_546_, (byte) 76);
	    Class159.aClass509_1754.method8376(class512_546_, -715690538);
	    bool_545_ = true;
	    Class250.method4604((byte) -3);
	    synchronized (client.anObject11200) {
		client.aBool11139 = true;
		try {
		    client.anObject11200.wait();
		} catch (InterruptedException interruptedexception) {
		    /* empty */
		}
	    }
	    client.aClass512_11100 = this;
	    class512_546_.method8452(-1951432814);
	    method8433(3, (short) -21142);
	    method8449(-909545950);
	} else {
	    Class171_Sub4.aClass232_9944.method4270((byte) -1);
	    aClass616_5694.method10162(1331769247);
	    Class563.method9513(1863941504);
	}
	for (int i_547_ = 0; i_547_ < 4; i_547_++) {
	    for (int i_548_ = 0; i_548_ < anInt5724 * -858656915; i_548_++) {
		for (int i_549_ = 0; i_549_ < anInt5706 * -2041900081;
		     i_549_++)
		    Class563.method9510(i_547_, i_548_, i_549_, (short) 8915);
	    }
	}
	for (int i_550_ = 0; i_550_ < client.aClass530Array11054.length;
	     i_550_++) {
	    if (client.aClass530Array11054[i_550_] != null)
		client.aClass530Array11054[i_550_].method8842(1147579047);
	}
	Class453_Sub5.method16008((byte) -65);
	Class464.method7567((byte) 105);
	if (Class309.method5657((byte) 97) == Class508.aClass508_5669
	    && client.aClass100_11264.method1867(47799646) != null
	    && -1850530127 * client.anInt11039 == 3) {
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4240,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16510(1057001181,
								  -1810523209);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 74);
	}
	if (!aClass499_5682.method8264(-1643637859)) {
	    int i_551_
		= (anInt5689 * 996655731 - (-858656915 * anInt5724 >> 4)) / 8;
	    int i_552_
		= (anInt5689 * 996655731 + (anInt5724 * -858656915 >> 4)) / 8;
	    int i_553_
		= (anInt5690 * 102545369 - (anInt5706 * -2041900081 >> 4)) / 8;
	    int i_554_
		= (102545369 * anInt5690 + (anInt5706 * -2041900081 >> 4)) / 8;
	    for (int i_555_ = i_551_ - 1; i_555_ <= i_552_ + 1; i_555_++) {
		for (int i_556_ = i_553_ - 1; i_556_ <= i_554_ + 1; i_556_++) {
		    if (i_555_ < i_551_ || i_555_ > i_552_ || i_556_ < i_553_
			|| i_556_ > i_554_)
			Class298_Sub1.aClass472_10064.method7666
			    (method8447(i_555_, i_556_, -2037618896),
			     -725238669);
		}
	    }
	}
	long l = (Class250.method4604((byte) -61)
		  - aLong5711 * 1097591286410319761L);
	if (10 == -1850530127 * client.anInt11039)
	    Class673.method11110(15, -1045077989);
	else if (17 == -1850530127 * client.anInt11039)
	    Class673.method11110(9, -717550074);
	else if (-1850530127 * client.anInt11039 == 6)
	    Class673.method11110(7, 202857958);
	else if (0 == client.anInt11039 * -1850530127)
	    Class673.method11110(18, -142722445);
	else {
	    Class673.method11110(16, 289834892);
	    if (client.aClass100_11264.method1867(287858209) != null) {
		Class534_Sub19 class534_sub19
		    = Class346.method6128(Class404.aClass404_4165,
					  client.aClass100_11264.aClass13_1183,
					  1341391005);
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16510((int) l, -1519948742);
		client.aClass100_11264.method1863(class534_sub19, (byte) 70);
	    }
	}
	if (aBool5700) {
	    Class73.method1567(Long.toString(Class250.method4604((byte) -94)
					     - (-746363806453947029L
						* aLong5722)),
			       -731652866);
	    aBool5700 = false;
	}
	if (bool_545_) {
	    synchronized (client.anObject11102) {
		client.anObject11102.notify();
	    }
	}
	return true;
    }
    
    void method8570() {
	int i = aByteArrayArray5717.length;
	for (int i_557_ = 0; i_557_ < i; i_557_++) {
	    if (aByteArrayArray5717[i_557_] != null) {
		int i_558_ = -1;
		for (int i_559_ = 0; i_559_ < client.anInt11105 * -1616155819;
		     i_559_++) {
		    if (client.anIntArray11104[i_559_]
			== anIntArray5718[i_557_]) {
			i_558_ = i_559_;
			break;
		    }
		}
		if (-1 == i_558_) {
		    client.anIntArray11104[client.anInt11105 * -1616155819]
			= anIntArray5718[i_557_];
		    i_558_ = (client.anInt11105 += -1230339) * -1616155819 - 1;
		}
		Class534_Sub40 class534_sub40
		    = new Class534_Sub40(aByteArrayArray5717[i_557_]);
		int i_560_ = 0;
		while ((31645619 * class534_sub40.anInt10811
			< aByteArrayArray5717[i_557_].length)
		       && i_560_ < 511
		       && client.anInt11321 * -1125820437 < 1023) {
		    int i_561_ = i_558_ | i_560_++ << 6;
		    int i_562_ = class534_sub40.method16529((byte) 1);
		    int i_563_ = i_562_ >> 14;
		    int i_564_ = i_562_ >> 7 & 0x3f;
		    int i_565_ = i_562_ & 0x3f;
		    int i_566_
			= ((anIntArray5718[i_557_] >> 8) * 64
			   - -424199969 * aClass597_5707.anInt7859 + i_564_);
		    int i_567_
			= ((anIntArray5718[i_557_] & 0xff) * 64
			   - aClass597_5707.anInt7861 * -1166289421 + i_565_);
		    Class307 class307
			= (Class307) (Class578.aClass44_Sub3_7743.method91
				      (class534_sub40.method16529((byte) 1),
				       561207835));
		    Class534_Sub6 class534_sub6
			= ((Class534_Sub6)
			   client.aClass9_11331.method579((long) i_561_));
		    if (null == class534_sub6 && (class307.aByte3274 & 0x1) > 0
			&& i_566_ >= 0
			&& (-1821838479 * class307.anInt3328 + i_566_
			    < -858656915 * anInt5724)
			&& i_567_ >= 0
			&& (i_567_ + -1821838479 * class307.anInt3328
			    < -2041900081 * anInt5706)) {
			Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
			    = new Class654_Sub1_Sub5_Sub1_Sub1(aClass556_5721);
			class654_sub1_sub5_sub1_sub1.anInt11922
			    = -2061161143 * i_561_;
			Class534_Sub6 class534_sub6_568_
			    = new Class534_Sub6(class654_sub1_sub5_sub1_sub1);
			client.aClass9_11331.method581(class534_sub6_568_,
						       (long) i_561_);
			client.aClass534_Sub6Array11085
			    [(client.anInt11148 += 1085173643) * 759971875 - 1]
			    = class534_sub6_568_;
			client.anIntArray11088[((client.anInt11321
						 += 590354627) * -1125820437
						- 1)]
			    = i_561_;
			class654_sub1_sub5_sub1_sub1.anInt11967
			    = client.anInt11101 * 1162675721;
			class654_sub1_sub5_sub1_sub1.method18827(class307,
								 (byte) -2);
			class654_sub1_sub5_sub1_sub1.method18535
			    ((class654_sub1_sub5_sub1_sub1.aClass307_12204
			      .anInt3328) * -1821838479,
			     1153246720);
			class654_sub1_sub5_sub1_sub1.anInt11971
			    = (1883849079
			       * (-1373680215 * (class654_sub1_sub5_sub1_sub1
						 .aClass307_12204.anInt3312)
				  << 3));
			class654_sub1_sub5_sub1_sub1.method18523
			    (class654_sub1_sub5_sub1_sub1.aClass307_12204
				 .aClass686_3325.method13963
				 (1543038722).method93() << 11 & 0x3fff,
			     true, -1809988712);
			class654_sub1_sub5_sub1_sub1.method18832
			    (i_563_, i_566_, i_567_, true,
			     class654_sub1_sub5_sub1_sub1
				 .method18545((byte) 1),
			     -525787883);
		    }
		}
	    }
	}
    }
    
    void method8571() {
	int i = aByteArrayArray5717.length;
	for (int i_569_ = 0; i_569_ < i; i_569_++) {
	    if (aByteArrayArray5717[i_569_] != null) {
		int i_570_ = -1;
		for (int i_571_ = 0; i_571_ < client.anInt11105 * -1616155819;
		     i_571_++) {
		    if (client.anIntArray11104[i_571_]
			== anIntArray5718[i_569_]) {
			i_570_ = i_571_;
			break;
		    }
		}
		if (-1 == i_570_) {
		    client.anIntArray11104[client.anInt11105 * -1616155819]
			= anIntArray5718[i_569_];
		    i_570_ = (client.anInt11105 += -1230339) * -1616155819 - 1;
		}
		Class534_Sub40 class534_sub40
		    = new Class534_Sub40(aByteArrayArray5717[i_569_]);
		int i_572_ = 0;
		while ((31645619 * class534_sub40.anInt10811
			< aByteArrayArray5717[i_569_].length)
		       && i_572_ < 511
		       && client.anInt11321 * -1125820437 < 1023) {
		    int i_573_ = i_570_ | i_572_++ << 6;
		    int i_574_ = class534_sub40.method16529((byte) 1);
		    int i_575_ = i_574_ >> 14;
		    int i_576_ = i_574_ >> 7 & 0x3f;
		    int i_577_ = i_574_ & 0x3f;
		    int i_578_
			= ((anIntArray5718[i_569_] >> 8) * 64
			   - -424199969 * aClass597_5707.anInt7859 + i_576_);
		    int i_579_
			= ((anIntArray5718[i_569_] & 0xff) * 64
			   - aClass597_5707.anInt7861 * -1166289421 + i_577_);
		    Class307 class307
			= (Class307) (Class578.aClass44_Sub3_7743.method91
				      (class534_sub40.method16529((byte) 1),
				       -1215900611));
		    Class534_Sub6 class534_sub6
			= ((Class534_Sub6)
			   client.aClass9_11331.method579((long) i_573_));
		    if (null == class534_sub6 && (class307.aByte3274 & 0x1) > 0
			&& i_578_ >= 0
			&& (-1821838479 * class307.anInt3328 + i_578_
			    < -858656915 * anInt5724)
			&& i_579_ >= 0
			&& (i_579_ + -1821838479 * class307.anInt3328
			    < -2041900081 * anInt5706)) {
			Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
			    = new Class654_Sub1_Sub5_Sub1_Sub1(aClass556_5721);
			class654_sub1_sub5_sub1_sub1.anInt11922
			    = -2061161143 * i_573_;
			Class534_Sub6 class534_sub6_580_
			    = new Class534_Sub6(class654_sub1_sub5_sub1_sub1);
			client.aClass9_11331.method581(class534_sub6_580_,
						       (long) i_573_);
			client.aClass534_Sub6Array11085
			    [(client.anInt11148 += 1085173643) * 759971875 - 1]
			    = class534_sub6_580_;
			client.anIntArray11088[((client.anInt11321
						 += 590354627) * -1125820437
						- 1)]
			    = i_573_;
			class654_sub1_sub5_sub1_sub1.anInt11967
			    = client.anInt11101 * 1162675721;
			class654_sub1_sub5_sub1_sub1.method18827(class307,
								 (byte) -2);
			class654_sub1_sub5_sub1_sub1.method18535
			    ((class654_sub1_sub5_sub1_sub1.aClass307_12204
			      .anInt3328) * -1821838479,
			     1374253643);
			class654_sub1_sub5_sub1_sub1.anInt11971
			    = (1883849079
			       * (-1373680215 * (class654_sub1_sub5_sub1_sub1
						 .aClass307_12204.anInt3312)
				  << 3));
			class654_sub1_sub5_sub1_sub1.method18523
			    (class654_sub1_sub5_sub1_sub1.aClass307_12204
				 .aClass686_3325.method13963
				 (1100803957).method93() << 11 & 0x3fff,
			     true, 256044061);
			class654_sub1_sub5_sub1_sub1.method18832
			    (i_575_, i_578_, i_579_, true,
			     class654_sub1_sub5_sub1_sub1
				 .method18545((byte) 1),
			     418090976);
		    }
		}
	    }
	}
    }
    
    static final void method8572(Class669 class669, int i) {
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub27_10757,
	     (class669.anIntArray8595
	      [(class669.anInt8600 -= 308999563) * 2088438307]),
	     -374552297);
	Class527.method8778(Class44_Sub6.aClass534_Sub35_10989
				.aClass690_Sub7_10733.method16935(-1807368365),
			    false, 278608571);
	Class672.method11096((byte) 1);
    }
}
