/* Class72 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.EventQueue;
import java.util.Iterator;
import java.util.List;

public class Class72
{
    static final int anInt753 = 2;
    static int anInt754 = -1621560336;
    static final int anInt755 = 1;
    static final int anInt756 = 31;
    static int anInt757;
    public static boolean aBool758 = false;
    static int anInt759;
    static Class534_Sub18_Sub11 aClass534_Sub18_Sub11_760;
    static final int anInt761 = 0;
    static Class433 aClass433_762;
    static Class700 aClass700_763;
    static final int anInt764 = 1;
    public static int anInt765;
    static boolean aBool766 = false;
    static final int anInt767 = 31;
    static Class9 aClass9_768;
    static float[] aFloatArray769;
    static Class700 aClass700_770;
    static Class700 aClass700_771;
    static Class696 aClass696_772;
    static final int anInt773 = 407;
    static Class247 aClass247_774;
    public static int anInt775;
    static int anInt776;
    static int anInt777;
    static int anInt778;
    static int anInt779;
    static int anInt780;
    static final int anInt781 = 6;
    static int anInt782;
    static Class446 aClass446_783;
    public static boolean aBool784;
    static int anInt785;
    public static final int anInt786 = 7;
    static Class433 aClass433_787;
    static final int anInt788 = 0;
    public static int anInt789;
    static final int anInt790 = 2;
    static final int anInt791 = 3;
    public static final int anInt792 = 4;
    static final int anInt793 = 5;
    static Class203 aClass203_794;
    static final int anInt795 = 504;
    static final int anInt796 = 8;
    static EventQueue anEventQueue797;
    
    static void method1416(Class185 class185) {
	if (aClass433_762 != null) {
	    class185.method3338(aClass433_762);
	    class185.method3335(aClass446_783);
	    class185.method3373(894945745 * anInt777, -655548783 * anInt778,
				1852547097 * anInt779 + anInt777 * 894945745,
				(anInt778 * -655548783
				 + anInt780 * -1954074475));
	    class185.method3318(894945745 * anInt777, -655548783 * anInt778,
				1852547097 * anInt779, -1954074475 * anInt780);
	}
    }
    
    static {
	aClass534_Sub18_Sub11_760 = null;
	anInt757 = 0;
	anInt765 = 0;
	anInt789 = 0;
	aClass700_771 = new Class700();
	aClass9_768 = new Class9(16);
	aClass696_772 = new Class696();
	aClass700_770 = new Class700();
	aClass700_763 = new Class700();
	aClass203_794 = new Class203(30);
	aClass247_774 = null;
	anInt759 = -1370224745;
	anInt776 = 590395525;
	anInt777 = 1105907919;
	anInt778 = 1266523535;
	anInt779 = 0;
	anInt780 = 0;
	aClass433_762 = null;
	aClass433_787 = new Class433();
	aClass446_783 = new Class446();
	aBool784 = false;
	anInt785 = 0;
	anInt775 = -1095883131;
	aFloatArray769 = new float[4];
    }
    
    static boolean method1417() {
	return Class677.method11142(Class700.aClass638_8806.aClass603_8309,
				    1691456971);
    }
    
    static boolean method1418() {
	return Class677.method11142(Class700.aClass638_8806.aClass603_8309,
				    1787284110);
    }
    
    static boolean method1419() {
	return Class677.method11142(Class700.aClass638_8806.aClass603_8310,
				    1759092732);
    }
    
    static boolean method1420(int i) {
	return (59 == i || i == 2 || 8 == i || i == 17 || 15 == i || 16 == i
		|| i == 58);
    }
    
    static boolean method1421() {
	return Class677.method11142(Class700.aClass638_8806.aClass603_8311,
				    1014284417);
    }
    
    static void method1422(int i, int i_0_) {
	anInt777 = -1105907919 * i;
	anInt778 = i_0_ * -1266523535;
    }
    
    static String method1423(Class534_Sub18_Sub7 class534_sub18_sub7) {
	if (class534_sub18_sub7.aString11710 == null
	    || class534_sub18_sub7.aString11710.length() == 0) {
	    if (class534_sub18_sub7.aString11708 != null
		&& class534_sub18_sub7.aString11708.length() > 0)
		return new StringBuilder().append
			   (class534_sub18_sub7.aString11699).append
			   (Class58.aClass58_461.method1245((Class539
							     .aClass672_7171),
							    (byte) -93))
			   .append
			   (class534_sub18_sub7.aString11708).toString();
	    return class534_sub18_sub7.aString11699;
	}
	if (null != class534_sub18_sub7.aString11708
	    && class534_sub18_sub7.aString11708.length() > 0)
	    return new StringBuilder().append
		       (class534_sub18_sub7.aString11699).append
		       (Class58.aClass58_461
			    .method1245(Class539.aClass672_7171, (byte) -61))
		       .append
		       (class534_sub18_sub7.aString11708).append
		       (Class58.aClass58_461
			    .method1245(Class539.aClass672_7171, (byte) -111))
		       .append
		       (class534_sub18_sub7.aString11710).toString();
	return new StringBuilder().append(class534_sub18_sub7.aString11699)
		   .append
		   (Class58.aClass58_461.method1245(Class539.aClass672_7171,
						    (byte) -94))
		   .append
		   (class534_sub18_sub7.aString11710).toString();
    }
    
    static void method1424(Class534_Sub18_Sub11 class534_sub18_sub11, int i) {
	if (aBool758) {
	    Class16 class16 = Class160.method2620(1770101340);
	    int i_1_ = 0;
	    for (Class534_Sub18_Sub7 class534_sub18_sub7
		     = (Class534_Sub18_Sub7) class534_sub18_sub11
						 .aClass696_11794
						 .method14078(1221951837);
		 null != class534_sub18_sub7;
		 class534_sub18_sub7
		     = (Class534_Sub18_Sub7) class534_sub18_sub11
						 .aClass696_11794
						 .method14080((byte) 16)) {
		int i_2_ = Class281.method5236(class534_sub18_sub7, class16,
					       -1395042333);
		if (i_2_ > i_1_)
		    i_1_ = i_2_;
	    }
	    i_1_ += 8;
	    int i_3_ = 21 + (-238165825 * anInt754
			     * (-475442105 * class534_sub18_sub11.anInt11795));
	    Class281.anInt3062
		= (2050568967
		   * (-238165825 * anInt754 * (class534_sub18_sub11.anInt11795
					       * -475442105)
		      + (aBool784 ? 26 : 22)));
	    int i_4_ = (Class641.anInt8340 * -1739196959
			+ Class627.anInt8175 * -620506573);
	    if (i_4_ + i_1_ > 1771907305 * Class706_Sub4.anInt10994)
		i_4_ = -620506573 * Class627.anInt8175 - i_1_;
	    if (i_4_ < 0)
		i_4_ = 0;
	    int i_5_ = aBool784 ? 1 + (102396103 * class16.anInt190 + 20) : 31;
	    int i_6_ = 1 + (i - i_5_ + 102396103 * class16.anInt190);
	    if (i_6_ + i_3_ > Class18.anInt205 * -1091172141)
		i_6_ = -1091172141 * Class18.anInt205 - i_3_;
	    if (i_6_ < 0)
		i_6_ = 0;
	    Class112.anInt1364 = -228643305 * i_4_;
	    Class150.anInt1699 = i_6_ * 1135371673;
	    Class536_Sub4.anInt10366 = i_1_ * 1938836795;
	    aClass534_Sub18_Sub11_760 = class534_sub18_sub11;
	}
    }
    
    static boolean method1425(Interface65 interface65,
			      Class534_Sub42 class534_sub42) {
	return (interface65 != null
		&& interface65.method437(class534_sub42,
					 client.anInterface63Array11070,
					 -2064179505 * client.anInt11199,
					 Class666.aClass547_8577,
					 -1882260320));
    }
    
    static void method1426(Class247 class247, int i, int i_7_) {
	if (client.aBool11218) {
	    Class90 class90
		= ((Class90)
		   (-1 != 410979031 * Class392_Sub1.anInt10224
		    ? (Class534_Sub11_Sub13.aClass44_Sub22_11730.method91
		       (Class392_Sub1.anInt10224 * 410979031, 1383315371))
		    : null));
	    if (client.method17392(class247).method16267(-971813184)
		&& (460977285 * Class200_Sub14.anInt9950 & 0x20) != 0
		&& (null == class90
		    || (class247.method4547((Class392_Sub1.anInt10224
					     * 410979031),
					    263946597 * class90.anInt888,
					    1473358026)
			!= 263946597 * class90.anInt888)))
		Class112.method2016
		    (client.aString11221,
		     new StringBuilder().append(client.aString11222).append
			 (" ").append
			 (Class29.aString263).append
			 (" ").append
			 (class247.aString2551).toString(),
		     Class460.anInt5069 * -731032933, 58,
		     403396513 * class247.anInt2606, 0L,
		     class247.anInt2580 * 1365669833,
		     -1278450723 * class247.anInt2454, true, false,
		     (long) (class247.anInt2580 * 1365669833 << 0
			     | class247.anInt2454 * -1278450723),
		     false, (short) 23457);
	}
	for (int i_8_ = 9; i_8_ >= 5; i_8_--) {
	    String string = Class387.method6505(class247, i_8_, -1199326728);
	    if (string != null)
		Class112.method2016
		    (string, class247.aString2551,
		     Class534_Sub18_Sub11.method18353(class247, i_8_,
						      (byte) -122),
		     1007, 403396513 * class247.anInt2606, (long) (i_8_ + 1),
		     1365669833 * class247.anInt2580,
		     -1278450723 * class247.anInt2454, true, false,
		     (long) (1365669833 * class247.anInt2580 << 0
			     | -1278450723 * class247.anInt2454),
		     false, (short) 19994);
	}
	String string = Class598.method9939(class247, 1382679968);
	if (string != null)
	    Class112.method2016(string, class247.aString2551,
				class247.anInt2555 * 1751127275, 25,
				class247.anInt2606 * 403396513, 0L,
				1365669833 * class247.anInt2580,
				-1278450723 * class247.anInt2454, true, false,
				(long) (1365669833 * class247.anInt2580 << 0
					| class247.anInt2454 * -1278450723),
				false, (short) 23197);
	for (int i_9_ = 4; i_9_ >= 0; i_9_--) {
	    String string_10_
		= Class387.method6505(class247, i_9_, -1199326728);
	    if (string_10_ != null)
		Class112.method2016
		    (string_10_, class247.aString2551,
		     Class534_Sub18_Sub11.method18353(class247, i_9_,
						      (byte) -71),
		     57, class247.anInt2606 * 403396513, (long) (1 + i_9_),
		     1365669833 * class247.anInt2580,
		     -1278450723 * class247.anInt2454, true, false,
		     (long) (1365669833 * class247.anInt2580 << 0
			     | -1278450723 * class247.anInt2454),
		     false, (short) 6655);
	}
	if (client.method17392(class247).method16272((short) 255)) {
	    if (class247.aString2483 != null)
		Class112.method2016(class247.aString2483, "", -1, 30,
				    403396513 * class247.anInt2606, 0L,
				    1365669833 * class247.anInt2580,
				    class247.anInt2454 * -1278450723, true,
				    false,
				    (long) ((1365669833 * class247.anInt2580
					     << 0)
					    | (class247.anInt2454
					       * -1278450723)),
				    false, (short) 27126);
	    else
		Class112.method2016
		    (Class58.aClass58_477.method1245(Class539.aClass672_7171,
						     (byte) -85),
		     "", -1, 30, 403396513 * class247.anInt2606, 0L,
		     1365669833 * class247.anInt2580,
		     class247.anInt2454 * -1278450723, true, false,
		     (long) (class247.anInt2580 * 1365669833 << 0
			     | -1278450723 * class247.anInt2454),
		     false, (short) 4710);
	}
    }
    
    static void method1427(int i) {
	for (Class534_Sub18_Sub7 class534_sub18_sub7
		 = (Class534_Sub18_Sub7) aClass700_771.method14135((byte) -1);
	     class534_sub18_sub7 != null;
	     class534_sub18_sub7 = ((Class534_Sub18_Sub7)
				    aClass700_771.method14139(1772316940))) {
	    if (Class591.method9883((-1986934021
				     * class534_sub18_sub7.anInt11706),
				    (byte) 5)
		&& class534_sub18_sub7.anInt11704 * -1180225371 >> 16 == i)
		Class70.method1408(class534_sub18_sub7, -888525991);
	}
    }
    
    static void method1428() {
	Class62.aClass534_Sub18_Sub7_650
	    = new Class534_Sub18_Sub7((Class58.aClass58_554.method1245
				       (Class539.aClass672_7171, (byte) -44)),
				      "", 846725895 * client.anInt11215, 1006,
				      -1, 0L, 0, 0, true, false, 0L, true);
    }
    
    static void method1429() {
	if (client.anInt11023 * -1450626137 < 0) {
	    Class16 class16 = Class160.method2620(1770101340);
	    if (!aBool758)
		aBool766 = ((-1 != -1144644173 * anInt775
			     && anInt765 * 324852453 >= anInt775 * -1144644173)
			    || ((324852453 * anInt765 * (anInt754 * -238165825)
				 + (aBool784 ? 26 : 22))
				> -1091172141 * Class18.anInt205));
	    aClass700_770.method14152(-1062903078);
	    aClass700_763.method14152(-1486514550);
	    for (Class534_Sub18_Sub7 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			aClass700_771.method14135((byte) -1));
		 null != class534_sub18_sub7;
		 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			aClass700_771.method14139(674479467))) {
		int i = -1986934021 * class534_sub18_sub7.anInt11706;
		if (i < 1000) {
		    class534_sub18_sub7.method8892((byte) 1);
		    if (59 == i || 2 == i || i == 8 || i == 17 || i == 15
			|| i == 16 || 58 == i)
			aClass700_763.method14131(class534_sub18_sub7,
						  (short) 789);
		    else
			aClass700_770.method14131(class534_sub18_sub7,
						  (short) 789);
		}
	    }
	    aClass700_770.method14134(aClass700_771, (short) 25351);
	    aClass700_763.method14134(aClass700_771, (short) 28234);
	    if (324852453 * anInt765 > 1) {
		if (Class418.method6761(-368463480)
		    && anInt765 * 324852453 > 2)
		    Class251.aClass534_Sub18_Sub7_2653
			= (Class534_Sub18_Sub7) (aClass700_771.aClass534_8803
						 .aClass534_7157
						 .aClass534_7157);
		else
		    Class251.aClass534_Sub18_Sub7_2653
			= ((Class534_Sub18_Sub7)
			   aClass700_771.aClass534_8803.aClass534_7157);
		Class331.aClass534_Sub18_Sub7_3496
		    = ((Class534_Sub18_Sub7)
		       aClass700_771.aClass534_8803.aClass534_7157);
		if (324852453 * anInt765 > 2)
		    Class271.aClass534_Sub18_Sub7_2963
			= ((Class534_Sub18_Sub7)
			   Class331.aClass534_Sub18_Sub7_3496.aClass534_7157);
		else
		    Class271.aClass534_Sub18_Sub7_2963 = null;
	    } else {
		Class251.aClass534_Sub18_Sub7_2653 = null;
		Class331.aClass534_Sub18_Sub7_3496 = null;
		Class271.aClass534_Sub18_Sub7_2963 = null;
	    }
	    Class534_Sub42 class534_sub42
		= ((Class534_Sub42)
		   client.aClass700_11063.method14135((byte) -1));
	    int i;
	    int i_11_;
	    if (class534_sub42 != null) {
		i = class534_sub42.method16799((byte) 64);
		i_11_ = class534_sub42.method16800(-706497269);
	    } else {
		i = Class81.aClass563_834.method9493(-1177492397);
		i_11_ = Class81.aClass563_834.method9477(1486347180);
	    }
	    if (aBool758) {
		if (Class479.method7919((Class700.aClass638_8806
					 .anInterface65_8313),
					class534_sub42, 941710601)) {
		    if (aClass534_Sub18_Sub11_760 != null
			&& i >= Class112.anInt1364 * -1803884121
			&& i <= (-2123561997 * Class536_Sub4.anInt10366
				 + Class112.anInt1364 * -1803884121)
			&& i_11_ >= Class150.anInt1699 * 892411561
			&& i_11_ <= (Class150.anInt1699 * 892411561
				     + -417346889 * Class281.anInt3062)) {
			int i_12_ = -1;
			for (int i_13_ = 0;
			     i_13_ < (-475442105
				      * aClass534_Sub18_Sub11_760.anInt11795);
			     i_13_++) {
			    if (aBool784) {
				int i_14_
				    = (i_13_ * (anInt754 * -238165825)
				       + (102396103 * class16.anInt190
					  + (892411561 * Class150.anInt1699
					     + 20)
					  + 1));
				if (i_11_ > (i_14_
					     - class16.anInt190 * 102396103
					     - 1)
				    && i_11_ < i_14_ + (728893755
							* class16.anInt189))
				    i_12_ = i_13_;
			    } else {
				int i_15_ = (i_13_ * (anInt754 * -238165825)
					     + (892411561 * Class150.anInt1699
						+ 31));
				if (i_11_ > i_15_ - 13 && i_11_ < 3 + i_15_)
				    i_12_ = i_13_;
			    }
			}
			if (-1 != i_12_) {
			    int i_16_ = 0;
			    Class694 class694
				= new Class694(aClass534_Sub18_Sub11_760
					       .aClass696_11794);
			    for (Class534_Sub18_Sub7 class534_sub18_sub7
				     = ((Class534_Sub18_Sub7)
					class694.method14068((byte) -3));
				 class534_sub18_sub7 != null;
				 class534_sub18_sub7
				     = (Class534_Sub18_Sub7) class694.next()) {
				if (i_16_ == i_12_) {
				    Class101.method1901(class534_sub18_sub7, i,
							i_11_, true,
							-204552386);
				    break;
				}
				i_16_++;
			    }
			}
			Class44_Sub16.method17357((byte) 14);
		    } else if (i >= Class627.anInt8175 * -620506573
			       && i <= (-620506573 * Class627.anInt8175
					+ -1739196959 * Class641.anInt8340)
			       && i_11_ >= -260575397 * anInt782
			       && (i_11_
				   <= (Class327_Sub1.anInt9991 * -577412881
				       + anInt782 * -260575397))) {
			if (!aBool766) {
			    int i_17_ = -1;
			    for (int i_18_ = 0; i_18_ < anInt765 * 324852453;
				 i_18_++) {
				if (aBool784) {
				    int i_19_
					= (((324852453 * anInt765 - 1 - i_18_)
					    * (anInt754 * -238165825))
					   + (1 + (anInt782 * -260575397 + 20
						   + (102396103
						      * class16.anInt190))));
				    if (i_11_ > (i_19_
						 - class16.anInt190 * 102396103
						 - 1)
					&& (i_11_
					    < i_19_ + (728893755
						       * class16.anInt189)))
					i_17_ = i_18_;
				} else {
				    int i_20_
					= (((324852453 * anInt765 - 1 - i_18_)
					    * (-238165825 * anInt754))
					   + (31 + anInt782 * -260575397));
				    if (i_11_ > i_20_ - 13
					&& i_11_ < i_20_ + 3)
					i_17_ = i_18_;
				}
			    }
			    if (-1 != i_17_) {
				int i_21_ = 0;
				Class710 class710
				    = new Class710(aClass700_771);
				for (Class534_Sub18_Sub7 class534_sub18_sub7
					 = ((Class534_Sub18_Sub7)
					    class710.method14308((byte) 114));
				     class534_sub18_sub7 != null;
				     class534_sub18_sub7
					 = ((Class534_Sub18_Sub7)
					    class710.next())) {
				    if (i_17_ == i_21_) {
					Class101.method1901
					    (class534_sub18_sub7, i, i_11_,
					     true, -1121435197);
					break;
				    }
				    i_21_++;
				}
			    }
			    Class44_Sub16.method17357((byte) 82);
			} else {
			    int i_22_ = -1;
			    for (int i_23_ = 0; i_23_ < anInt789 * 1965634793;
				 i_23_++) {
				if (aBool784) {
				    int i_24_
					= (1
					   + (20 + anInt782 * -260575397
					      + 102396103 * class16.anInt190)
					   + i_23_ * (-238165825 * anInt754));
				    if (i_11_ > (i_24_
						 - 102396103 * class16.anInt190
						 - 1)
					&& i_11_ < i_24_ + (class16.anInt189
							    * 728893755)) {
					i_22_ = i_23_;
					break;
				    }
				} else {
				    int i_25_
					= (i_23_ * (anInt754 * -238165825)
					   + (-260575397 * anInt782 + 31));
				    if (i_11_ > i_25_ - 13
					&& i_11_ < 3 + i_25_) {
					i_22_ = i_23_;
					break;
				    }
				}
			    }
			    if (i_22_ != -1) {
				int i_26_ = 0;
				Class694 class694
				    = new Class694(aClass696_772);
				for (Class534_Sub18_Sub11 class534_sub18_sub11
					 = ((Class534_Sub18_Sub11)
					    class694.method14068((byte) -9));
				     null != class534_sub18_sub11;
				     class534_sub18_sub11
					 = ((Class534_Sub18_Sub11)
					    class694.next())) {
				    if (i_22_ == i_26_) {
					Class101.method1901
					    (((Class534_Sub18_Sub7)
					      (class534_sub18_sub11
					       .aClass696_11794
					       .aClass534_Sub18_8785
					       .aClass534_Sub18_10510)),
					     i, i_11_, true, 454957193);
					Class44_Sub16.method17357((byte) 49);
					break;
				    }
				    i_26_++;
				}
			    }
			}
		    }
		} else {
		    boolean bool = false;
		    if (null != aClass534_Sub18_Sub11_760) {
			if (i < Class112.anInt1364 * -1803884121 - 10
			    || i > 10 + (-1803884121 * Class112.anInt1364
					 + (Class536_Sub4.anInt10366
					    * -2123561997))
			    || i_11_ < Class150.anInt1699 * 892411561 - 10
			    || (i_11_
				> 10 + (Class150.anInt1699 * 892411561
					+ -417346889 * Class281.anInt3062)))
			    Class582.method9834((byte) 35);
			else
			    bool = true;
		    }
		    if (!bool) {
			if (i < -620506573 * Class627.anInt8175 - 10
			    || i > (-1739196959 * Class641.anInt8340
				    + -620506573 * Class627.anInt8175 + 10)
			    || i_11_ < anInt782 * -260575397 - 10
			    || (i_11_
				> 10 + (Class327_Sub1.anInt9991 * -577412881
					+ anInt782 * -260575397)))
			    Class44_Sub16.method17357((byte) 109);
			else if (aBool766) {
			    int i_27_ = -1;
			    int i_28_ = -1;
			    for (int i_29_ = 0; i_29_ < anInt789 * 1965634793;
				 i_29_++) {
				if (aBool784) {
				    int i_30_
					= (anInt754 * -238165825 * i_29_
					   + (20 + anInt782 * -260575397
					      + class16.anInt190 * 102396103
					      + 1));
				    if (i_11_ > (i_30_
						 - 102396103 * class16.anInt190
						 - 1)
					&& (i_11_
					    < (728893755 * class16.anInt189
					       + i_30_))) {
					i_27_ = i_29_;
					i_28_ = (i_30_
						 - class16.anInt190 * 102396103
						 - 1);
					break;
				    }
				} else {
				    int i_31_
					= (anInt782 * -260575397 + 31
					   + -238165825 * anInt754 * i_29_);
				    if (i_11_ > i_31_ - 13
					&& i_11_ < 3 + i_31_) {
					i_27_ = i_29_;
					i_28_ = i_31_ - 13;
					break;
				    }
				}
			    }
			    if (-1 != i_27_) {
				int i_32_ = 0;
				Class694 class694
				    = new Class694(aClass696_772);
				for (Class534_Sub18_Sub11 class534_sub18_sub11
					 = ((Class534_Sub18_Sub11)
					    class694.method14068((byte) -33));
				     null != class534_sub18_sub11;
				     class534_sub18_sub11
					 = ((Class534_Sub18_Sub11)
					    class694.next())) {
				    if (i_32_ == i_27_) {
					if ((-475442105
					     * class534_sub18_sub11.anInt11795)
					    > 1)
					    Class263.method4835
						(class534_sub18_sub11, i_28_,
						 (byte) 95);
					break;
				    }
				    i_32_++;
				}
			    }
			}
		    }
		}
	    } else {
		boolean bool = Class479.method7919((Class700.aClass638_8806
						    .anInterface65_8312),
						   class534_sub42, 941710601);
		boolean bool_33_
		    = Class479.method7919((Class700.aClass638_8806
					   .anInterface65_8307),
					  class534_sub42, 941710601);
		boolean bool_34_
		    = Class479.method7919((Class700.aClass638_8806
					   .anInterface65_8308),
					  class534_sub42, 941710601);
		if ((bool || bool_33_) && ((client.anInt11213 * 2117088631 == 1
					    && anInt765 * 324852453 > 2)
					   || Class331.method5856((byte) -27)))
		    bool_34_ = true;
		if (bool_34_ && 324852453 * anInt765 > 0) {
		    if (client.aClass247_11044 == null
			&& client.anInt11248 * 245333843 == 0)
			Class43.method1073(i, i_11_, 1543773986);
		    else
			anInt757 = -1098055734;
		} else if (bool_33_) {
		    if (Class271.aClass534_Sub18_Sub7_2963 != null)
			Class101.method1901(Class271.aClass534_Sub18_Sub7_2963,
					    i, i_11_, false, -854646092);
		} else if (bool) {
		    if (null != Class251.aClass534_Sub18_Sub7_2653) {
			boolean bool_35_
			    = (null != client.aClass247_11044
			       || 245333843 * client.anInt11248 > 0);
			if (bool_35_) {
			    anInt757 = -549027867;
			    Class513.aClass534_Sub18_Sub7_5727
				= Class251.aClass534_Sub18_Sub7_2653;
			} else
			    Class101.method1901((Class251
						 .aClass534_Sub18_Sub7_2653),
						i, i_11_, false, -996981292);
		    } else if (client.aBool11218)
			Exception_Sub3.method17943((byte) 1);
		}
		if (null == client.aClass247_11044
		    && 245333843 * client.anInt11248 == 0) {
		    anInt757 = 0;
		    Class513.aClass534_Sub18_Sub7_5727 = null;
		}
	    }
	}
    }
    
    static void method1430() {
	if (client.anInt11023 * -1450626137 < 0) {
	    Class16 class16 = Class160.method2620(1770101340);
	    if (!aBool758)
		aBool766 = ((-1 != -1144644173 * anInt775
			     && anInt765 * 324852453 >= anInt775 * -1144644173)
			    || ((324852453 * anInt765 * (anInt754 * -238165825)
				 + (aBool784 ? 26 : 22))
				> -1091172141 * Class18.anInt205));
	    aClass700_770.method14152(-1437946066);
	    aClass700_763.method14152(-1825778580);
	    for (Class534_Sub18_Sub7 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			aClass700_771.method14135((byte) -1));
		 null != class534_sub18_sub7;
		 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			aClass700_771.method14139(718485596))) {
		int i = -1986934021 * class534_sub18_sub7.anInt11706;
		if (i < 1000) {
		    class534_sub18_sub7.method8892((byte) 1);
		    if (59 == i || 2 == i || i == 8 || i == 17 || i == 15
			|| i == 16 || 58 == i)
			aClass700_763.method14131(class534_sub18_sub7,
						  (short) 789);
		    else
			aClass700_770.method14131(class534_sub18_sub7,
						  (short) 789);
		}
	    }
	    aClass700_770.method14134(aClass700_771, (short) 15492);
	    aClass700_763.method14134(aClass700_771, (short) 27987);
	    if (324852453 * anInt765 > 1) {
		if (Class418.method6761(-430677321)
		    && anInt765 * 324852453 > 2)
		    Class251.aClass534_Sub18_Sub7_2653
			= (Class534_Sub18_Sub7) (aClass700_771.aClass534_8803
						 .aClass534_7157
						 .aClass534_7157);
		else
		    Class251.aClass534_Sub18_Sub7_2653
			= ((Class534_Sub18_Sub7)
			   aClass700_771.aClass534_8803.aClass534_7157);
		Class331.aClass534_Sub18_Sub7_3496
		    = ((Class534_Sub18_Sub7)
		       aClass700_771.aClass534_8803.aClass534_7157);
		if (324852453 * anInt765 > 2)
		    Class271.aClass534_Sub18_Sub7_2963
			= ((Class534_Sub18_Sub7)
			   Class331.aClass534_Sub18_Sub7_3496.aClass534_7157);
		else
		    Class271.aClass534_Sub18_Sub7_2963 = null;
	    } else {
		Class251.aClass534_Sub18_Sub7_2653 = null;
		Class331.aClass534_Sub18_Sub7_3496 = null;
		Class271.aClass534_Sub18_Sub7_2963 = null;
	    }
	    Class534_Sub42 class534_sub42
		= ((Class534_Sub42)
		   client.aClass700_11063.method14135((byte) -1));
	    int i;
	    int i_36_;
	    if (class534_sub42 != null) {
		i = class534_sub42.method16799((byte) 122);
		i_36_ = class534_sub42.method16800(-460030838);
	    } else {
		i = Class81.aClass563_834.method9493(-1531441928);
		i_36_ = Class81.aClass563_834.method9477(401896343);
	    }
	    if (aBool758) {
		if (Class479.method7919((Class700.aClass638_8806
					 .anInterface65_8313),
					class534_sub42, 941710601)) {
		    if (aClass534_Sub18_Sub11_760 != null
			&& i >= Class112.anInt1364 * -1803884121
			&& i <= (-2123561997 * Class536_Sub4.anInt10366
				 + Class112.anInt1364 * -1803884121)
			&& i_36_ >= Class150.anInt1699 * 892411561
			&& i_36_ <= (Class150.anInt1699 * 892411561
				     + -417346889 * Class281.anInt3062)) {
			int i_37_ = -1;
			for (int i_38_ = 0;
			     i_38_ < (-475442105
				      * aClass534_Sub18_Sub11_760.anInt11795);
			     i_38_++) {
			    if (aBool784) {
				int i_39_
				    = (i_38_ * (anInt754 * -238165825)
				       + (102396103 * class16.anInt190
					  + (892411561 * Class150.anInt1699
					     + 20)
					  + 1));
				if (i_36_ > (i_39_
					     - class16.anInt190 * 102396103
					     - 1)
				    && i_36_ < i_39_ + (728893755
							* class16.anInt189))
				    i_37_ = i_38_;
			    } else {
				int i_40_ = (i_38_ * (anInt754 * -238165825)
					     + (892411561 * Class150.anInt1699
						+ 31));
				if (i_36_ > i_40_ - 13 && i_36_ < 3 + i_40_)
				    i_37_ = i_38_;
			    }
			}
			if (-1 != i_37_) {
			    int i_41_ = 0;
			    Class694 class694
				= new Class694(aClass534_Sub18_Sub11_760
					       .aClass696_11794);
			    for (Class534_Sub18_Sub7 class534_sub18_sub7
				     = ((Class534_Sub18_Sub7)
					class694.method14068((byte) 69));
				 class534_sub18_sub7 != null;
				 class534_sub18_sub7
				     = (Class534_Sub18_Sub7) class694.next()) {
				if (i_41_ == i_37_) {
				    Class101.method1901(class534_sub18_sub7, i,
							i_36_, true,
							-1095322710);
				    break;
				}
				i_41_++;
			    }
			}
			Class44_Sub16.method17357((byte) 26);
		    } else if (i >= Class627.anInt8175 * -620506573
			       && i <= (-620506573 * Class627.anInt8175
					+ -1739196959 * Class641.anInt8340)
			       && i_36_ >= -260575397 * anInt782
			       && (i_36_
				   <= (Class327_Sub1.anInt9991 * -577412881
				       + anInt782 * -260575397))) {
			if (!aBool766) {
			    int i_42_ = -1;
			    for (int i_43_ = 0; i_43_ < anInt765 * 324852453;
				 i_43_++) {
				if (aBool784) {
				    int i_44_
					= (((324852453 * anInt765 - 1 - i_43_)
					    * (anInt754 * -238165825))
					   + (1 + (anInt782 * -260575397 + 20
						   + (102396103
						      * class16.anInt190))));
				    if (i_36_ > (i_44_
						 - class16.anInt190 * 102396103
						 - 1)
					&& (i_36_
					    < i_44_ + (728893755
						       * class16.anInt189)))
					i_42_ = i_43_;
				} else {
				    int i_45_
					= (((324852453 * anInt765 - 1 - i_43_)
					    * (-238165825 * anInt754))
					   + (31 + anInt782 * -260575397));
				    if (i_36_ > i_45_ - 13
					&& i_36_ < i_45_ + 3)
					i_42_ = i_43_;
				}
			    }
			    if (-1 != i_42_) {
				int i_46_ = 0;
				Class710 class710
				    = new Class710(aClass700_771);
				for (Class534_Sub18_Sub7 class534_sub18_sub7
					 = ((Class534_Sub18_Sub7)
					    class710.method14308((byte) 117));
				     class534_sub18_sub7 != null;
				     class534_sub18_sub7
					 = ((Class534_Sub18_Sub7)
					    class710.next())) {
				    if (i_42_ == i_46_) {
					Class101.method1901
					    (class534_sub18_sub7, i, i_36_,
					     true, 713017581);
					break;
				    }
				    i_46_++;
				}
			    }
			    Class44_Sub16.method17357((byte) 70);
			} else {
			    int i_47_ = -1;
			    for (int i_48_ = 0; i_48_ < anInt789 * 1965634793;
				 i_48_++) {
				if (aBool784) {
				    int i_49_
					= (1
					   + (20 + anInt782 * -260575397
					      + 102396103 * class16.anInt190)
					   + i_48_ * (-238165825 * anInt754));
				    if (i_36_ > (i_49_
						 - 102396103 * class16.anInt190
						 - 1)
					&& i_36_ < i_49_ + (class16.anInt189
							    * 728893755)) {
					i_47_ = i_48_;
					break;
				    }
				} else {
				    int i_50_
					= (i_48_ * (anInt754 * -238165825)
					   + (-260575397 * anInt782 + 31));
				    if (i_36_ > i_50_ - 13
					&& i_36_ < 3 + i_50_) {
					i_47_ = i_48_;
					break;
				    }
				}
			    }
			    if (i_47_ != -1) {
				int i_51_ = 0;
				Class694 class694
				    = new Class694(aClass696_772);
				for (Class534_Sub18_Sub11 class534_sub18_sub11
					 = ((Class534_Sub18_Sub11)
					    class694.method14068((byte) -103));
				     null != class534_sub18_sub11;
				     class534_sub18_sub11
					 = ((Class534_Sub18_Sub11)
					    class694.next())) {
				    if (i_47_ == i_51_) {
					Class101.method1901
					    (((Class534_Sub18_Sub7)
					      (class534_sub18_sub11
					       .aClass696_11794
					       .aClass534_Sub18_8785
					       .aClass534_Sub18_10510)),
					     i, i_36_, true, -1181276656);
					Class44_Sub16.method17357((byte) 88);
					break;
				    }
				    i_51_++;
				}
			    }
			}
		    }
		} else {
		    boolean bool = false;
		    if (null != aClass534_Sub18_Sub11_760) {
			if (i < Class112.anInt1364 * -1803884121 - 10
			    || i > 10 + (-1803884121 * Class112.anInt1364
					 + (Class536_Sub4.anInt10366
					    * -2123561997))
			    || i_36_ < Class150.anInt1699 * 892411561 - 10
			    || (i_36_
				> 10 + (Class150.anInt1699 * 892411561
					+ -417346889 * Class281.anInt3062)))
			    Class582.method9834((byte) 75);
			else
			    bool = true;
		    }
		    if (!bool) {
			if (i < -620506573 * Class627.anInt8175 - 10
			    || i > (-1739196959 * Class641.anInt8340
				    + -620506573 * Class627.anInt8175 + 10)
			    || i_36_ < anInt782 * -260575397 - 10
			    || (i_36_
				> 10 + (Class327_Sub1.anInt9991 * -577412881
					+ anInt782 * -260575397)))
			    Class44_Sub16.method17357((byte) 58);
			else if (aBool766) {
			    int i_52_ = -1;
			    int i_53_ = -1;
			    for (int i_54_ = 0; i_54_ < anInt789 * 1965634793;
				 i_54_++) {
				if (aBool784) {
				    int i_55_
					= (anInt754 * -238165825 * i_54_
					   + (20 + anInt782 * -260575397
					      + class16.anInt190 * 102396103
					      + 1));
				    if (i_36_ > (i_55_
						 - 102396103 * class16.anInt190
						 - 1)
					&& (i_36_
					    < (728893755 * class16.anInt189
					       + i_55_))) {
					i_52_ = i_54_;
					i_53_ = (i_55_
						 - class16.anInt190 * 102396103
						 - 1);
					break;
				    }
				} else {
				    int i_56_
					= (anInt782 * -260575397 + 31
					   + -238165825 * anInt754 * i_54_);
				    if (i_36_ > i_56_ - 13
					&& i_36_ < 3 + i_56_) {
					i_52_ = i_54_;
					i_53_ = i_56_ - 13;
					break;
				    }
				}
			    }
			    if (-1 != i_52_) {
				int i_57_ = 0;
				Class694 class694
				    = new Class694(aClass696_772);
				for (Class534_Sub18_Sub11 class534_sub18_sub11
					 = ((Class534_Sub18_Sub11)
					    class694.method14068((byte) -66));
				     null != class534_sub18_sub11;
				     class534_sub18_sub11
					 = ((Class534_Sub18_Sub11)
					    class694.next())) {
				    if (i_57_ == i_52_) {
					if ((-475442105
					     * class534_sub18_sub11.anInt11795)
					    > 1)
					    Class263.method4835
						(class534_sub18_sub11, i_53_,
						 (byte) 21);
					break;
				    }
				    i_57_++;
				}
			    }
			}
		    }
		}
	    } else {
		boolean bool = Class479.method7919((Class700.aClass638_8806
						    .anInterface65_8312),
						   class534_sub42, 941710601);
		boolean bool_58_
		    = Class479.method7919((Class700.aClass638_8806
					   .anInterface65_8307),
					  class534_sub42, 941710601);
		boolean bool_59_
		    = Class479.method7919((Class700.aClass638_8806
					   .anInterface65_8308),
					  class534_sub42, 941710601);
		if ((bool || bool_58_) && ((client.anInt11213 * 2117088631 == 1
					    && anInt765 * 324852453 > 2)
					   || Class331.method5856((byte) -33)))
		    bool_59_ = true;
		if (bool_59_ && 324852453 * anInt765 > 0) {
		    if (client.aClass247_11044 == null
			&& client.anInt11248 * 245333843 == 0)
			Class43.method1073(i, i_36_, 1543773986);
		    else
			anInt757 = -1098055734;
		} else if (bool_58_) {
		    if (Class271.aClass534_Sub18_Sub7_2963 != null)
			Class101.method1901(Class271.aClass534_Sub18_Sub7_2963,
					    i, i_36_, false, 997723661);
		} else if (bool) {
		    if (null != Class251.aClass534_Sub18_Sub7_2653) {
			boolean bool_60_
			    = (null != client.aClass247_11044
			       || 245333843 * client.anInt11248 > 0);
			if (bool_60_) {
			    anInt757 = -549027867;
			    Class513.aClass534_Sub18_Sub7_5727
				= Class251.aClass534_Sub18_Sub7_2653;
			} else
			    Class101.method1901((Class251
						 .aClass534_Sub18_Sub7_2653),
						i, i_36_, false, -2041301234);
		    } else if (client.aBool11218)
			Exception_Sub3.method17943((byte) 1);
		}
		if (null == client.aClass247_11044
		    && 245333843 * client.anInt11248 == 0) {
		    anInt757 = 0;
		    Class513.aClass534_Sub18_Sub7_5727 = null;
		}
	    }
	}
    }
    
    static Class534_Sub19 method1431(int i, int i_61_, int i_62_) {
	Class534_Sub19 class534_sub19 = null;
	if (i_62_ == 0)
	    class534_sub19
		= Class346.method6128(Class404.aClass404_4153,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	if (i_62_ == 1)
	    class534_sub19
		= Class346.method6128(Class404.aClass404_4195,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	Class597 class597 = client.aClass512_11100.method8416((byte) 127);
	class534_sub19.aClass534_Sub40_Sub1_10513
	    .method16569(-424199969 * class597.anInt7859 + i, 881609607);
	class534_sub19.aClass534_Sub40_Sub1_10513
	    .method16687(i_61_ + -1166289421 * class597.anInt7861, 2043025811);
	class534_sub19.aClass534_Sub40_Sub1_10513
	    .method16559(Class479.method7916(-877455222) ? 1 : 0, 1348228015);
	Class113.anInt1375 = -1660827629 * i;
	Class113.anInt1376 = 517634255 * i_61_;
	Class113.aBool1373 = false;
	Class453_Sub3.method15985(-258828825);
	return class534_sub19;
    }
    
    static void method1432(int i, int i_63_) {
	if (1 == -1488345619 * anInt757)
	    Class101.method1901(Class513.aClass534_Sub18_Sub7_5727, i, i_63_,
				false, 433757932);
	else if (2 == anInt757 * -1488345619)
	    Class43.method1073(i, i_63_, 1543773986);
	anInt757 = 0;
	Class513.aClass534_Sub18_Sub7_5727 = null;
    }
    
    static boolean method1433() {
	if (null == Class331.aClass534_Sub18_Sub7_3496)
	    return false;
	if (-1986934021 * Class331.aClass534_Sub18_Sub7_3496.anInt11706
	    >= 2000)
	    Class331.aClass534_Sub18_Sub7_3496.anInt11706 -= 585141872;
	if (1007
	    == Class331.aClass534_Sub18_Sub7_3496.anInt11706 * -1986934021)
	    return true;
	return false;
    }
    
    static boolean method1434() {
	if (null == Class331.aClass534_Sub18_Sub7_3496)
	    return false;
	if (-1986934021 * Class331.aClass534_Sub18_Sub7_3496.anInt11706
	    >= 2000)
	    Class331.aClass534_Sub18_Sub7_3496.anInt11706 -= 585141872;
	if (1007
	    == Class331.aClass534_Sub18_Sub7_3496.anInt11706 * -1986934021)
	    return true;
	return false;
    }
    
    static void method1435() {
	if (client.anInt11023 * -1450626137 < 0) {
	    Class16 class16 = Class160.method2620(1770101340);
	    if (!aBool758)
		aBool766 = ((-1 != -1144644173 * anInt775
			     && anInt765 * 324852453 >= anInt775 * -1144644173)
			    || ((324852453 * anInt765 * (anInt754 * -238165825)
				 + (aBool784 ? 26 : 22))
				> -1091172141 * Class18.anInt205));
	    aClass700_770.method14152(-973104865);
	    aClass700_763.method14152(-841056791);
	    for (Class534_Sub18_Sub7 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			aClass700_771.method14135((byte) -1));
		 null != class534_sub18_sub7;
		 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			aClass700_771.method14139(1511327484))) {
		int i = -1986934021 * class534_sub18_sub7.anInt11706;
		if (i < 1000) {
		    class534_sub18_sub7.method8892((byte) 1);
		    if (59 == i || 2 == i || i == 8 || i == 17 || i == 15
			|| i == 16 || 58 == i)
			aClass700_763.method14131(class534_sub18_sub7,
						  (short) 789);
		    else
			aClass700_770.method14131(class534_sub18_sub7,
						  (short) 789);
		}
	    }
	    aClass700_770.method14134(aClass700_771, (short) 30922);
	    aClass700_763.method14134(aClass700_771, (short) 4325);
	    if (324852453 * anInt765 > 1) {
		if (Class418.method6761(-1906212452)
		    && anInt765 * 324852453 > 2)
		    Class251.aClass534_Sub18_Sub7_2653
			= (Class534_Sub18_Sub7) (aClass700_771.aClass534_8803
						 .aClass534_7157
						 .aClass534_7157);
		else
		    Class251.aClass534_Sub18_Sub7_2653
			= ((Class534_Sub18_Sub7)
			   aClass700_771.aClass534_8803.aClass534_7157);
		Class331.aClass534_Sub18_Sub7_3496
		    = ((Class534_Sub18_Sub7)
		       aClass700_771.aClass534_8803.aClass534_7157);
		if (324852453 * anInt765 > 2)
		    Class271.aClass534_Sub18_Sub7_2963
			= ((Class534_Sub18_Sub7)
			   Class331.aClass534_Sub18_Sub7_3496.aClass534_7157);
		else
		    Class271.aClass534_Sub18_Sub7_2963 = null;
	    } else {
		Class251.aClass534_Sub18_Sub7_2653 = null;
		Class331.aClass534_Sub18_Sub7_3496 = null;
		Class271.aClass534_Sub18_Sub7_2963 = null;
	    }
	    Class534_Sub42 class534_sub42
		= ((Class534_Sub42)
		   client.aClass700_11063.method14135((byte) -1));
	    int i;
	    int i_64_;
	    if (class534_sub42 != null) {
		i = class534_sub42.method16799((byte) 121);
		i_64_ = class534_sub42.method16800(-632328283);
	    } else {
		i = Class81.aClass563_834.method9493(-1791459849);
		i_64_ = Class81.aClass563_834.method9477(1165624091);
	    }
	    if (aBool758) {
		if (Class479.method7919((Class700.aClass638_8806
					 .anInterface65_8313),
					class534_sub42, 941710601)) {
		    if (aClass534_Sub18_Sub11_760 != null
			&& i >= Class112.anInt1364 * -1803884121
			&& i <= (-2123561997 * Class536_Sub4.anInt10366
				 + Class112.anInt1364 * -1803884121)
			&& i_64_ >= Class150.anInt1699 * 892411561
			&& i_64_ <= (Class150.anInt1699 * 892411561
				     + -417346889 * Class281.anInt3062)) {
			int i_65_ = -1;
			for (int i_66_ = 0;
			     i_66_ < (-475442105
				      * aClass534_Sub18_Sub11_760.anInt11795);
			     i_66_++) {
			    if (aBool784) {
				int i_67_
				    = (i_66_ * (anInt754 * -238165825)
				       + (102396103 * class16.anInt190
					  + (892411561 * Class150.anInt1699
					     + 20)
					  + 1));
				if (i_64_ > (i_67_
					     - class16.anInt190 * 102396103
					     - 1)
				    && i_64_ < i_67_ + (728893755
							* class16.anInt189))
				    i_65_ = i_66_;
			    } else {
				int i_68_ = (i_66_ * (anInt754 * -238165825)
					     + (892411561 * Class150.anInt1699
						+ 31));
				if (i_64_ > i_68_ - 13 && i_64_ < 3 + i_68_)
				    i_65_ = i_66_;
			    }
			}
			if (-1 != i_65_) {
			    int i_69_ = 0;
			    Class694 class694
				= new Class694(aClass534_Sub18_Sub11_760
					       .aClass696_11794);
			    for (Class534_Sub18_Sub7 class534_sub18_sub7
				     = ((Class534_Sub18_Sub7)
					class694.method14068((byte) -14));
				 class534_sub18_sub7 != null;
				 class534_sub18_sub7
				     = (Class534_Sub18_Sub7) class694.next()) {
				if (i_69_ == i_65_) {
				    Class101.method1901(class534_sub18_sub7, i,
							i_64_, true,
							-1258462089);
				    break;
				}
				i_69_++;
			    }
			}
			Class44_Sub16.method17357((byte) 104);
		    } else if (i >= Class627.anInt8175 * -620506573
			       && i <= (-620506573 * Class627.anInt8175
					+ -1739196959 * Class641.anInt8340)
			       && i_64_ >= -260575397 * anInt782
			       && (i_64_
				   <= (Class327_Sub1.anInt9991 * -577412881
				       + anInt782 * -260575397))) {
			if (!aBool766) {
			    int i_70_ = -1;
			    for (int i_71_ = 0; i_71_ < anInt765 * 324852453;
				 i_71_++) {
				if (aBool784) {
				    int i_72_
					= (((324852453 * anInt765 - 1 - i_71_)
					    * (anInt754 * -238165825))
					   + (1 + (anInt782 * -260575397 + 20
						   + (102396103
						      * class16.anInt190))));
				    if (i_64_ > (i_72_
						 - class16.anInt190 * 102396103
						 - 1)
					&& (i_64_
					    < i_72_ + (728893755
						       * class16.anInt189)))
					i_70_ = i_71_;
				} else {
				    int i_73_
					= (((324852453 * anInt765 - 1 - i_71_)
					    * (-238165825 * anInt754))
					   + (31 + anInt782 * -260575397));
				    if (i_64_ > i_73_ - 13
					&& i_64_ < i_73_ + 3)
					i_70_ = i_71_;
				}
			    }
			    if (-1 != i_70_) {
				int i_74_ = 0;
				Class710 class710
				    = new Class710(aClass700_771);
				for (Class534_Sub18_Sub7 class534_sub18_sub7
					 = ((Class534_Sub18_Sub7)
					    class710.method14308((byte) -29));
				     class534_sub18_sub7 != null;
				     class534_sub18_sub7
					 = ((Class534_Sub18_Sub7)
					    class710.next())) {
				    if (i_70_ == i_74_) {
					Class101.method1901
					    (class534_sub18_sub7, i, i_64_,
					     true, -224606381);
					break;
				    }
				    i_74_++;
				}
			    }
			    Class44_Sub16.method17357((byte) 83);
			} else {
			    int i_75_ = -1;
			    for (int i_76_ = 0; i_76_ < anInt789 * 1965634793;
				 i_76_++) {
				if (aBool784) {
				    int i_77_
					= (1
					   + (20 + anInt782 * -260575397
					      + 102396103 * class16.anInt190)
					   + i_76_ * (-238165825 * anInt754));
				    if (i_64_ > (i_77_
						 - 102396103 * class16.anInt190
						 - 1)
					&& i_64_ < i_77_ + (class16.anInt189
							    * 728893755)) {
					i_75_ = i_76_;
					break;
				    }
				} else {
				    int i_78_
					= (i_76_ * (anInt754 * -238165825)
					   + (-260575397 * anInt782 + 31));
				    if (i_64_ > i_78_ - 13
					&& i_64_ < 3 + i_78_) {
					i_75_ = i_76_;
					break;
				    }
				}
			    }
			    if (i_75_ != -1) {
				int i_79_ = 0;
				Class694 class694
				    = new Class694(aClass696_772);
				for (Class534_Sub18_Sub11 class534_sub18_sub11
					 = ((Class534_Sub18_Sub11)
					    class694.method14068((byte) -21));
				     null != class534_sub18_sub11;
				     class534_sub18_sub11
					 = ((Class534_Sub18_Sub11)
					    class694.next())) {
				    if (i_75_ == i_79_) {
					Class101.method1901
					    (((Class534_Sub18_Sub7)
					      (class534_sub18_sub11
					       .aClass696_11794
					       .aClass534_Sub18_8785
					       .aClass534_Sub18_10510)),
					     i, i_64_, true, -410940313);
					Class44_Sub16.method17357((byte) 20);
					break;
				    }
				    i_79_++;
				}
			    }
			}
		    }
		} else {
		    boolean bool = false;
		    if (null != aClass534_Sub18_Sub11_760) {
			if (i < Class112.anInt1364 * -1803884121 - 10
			    || i > 10 + (-1803884121 * Class112.anInt1364
					 + (Class536_Sub4.anInt10366
					    * -2123561997))
			    || i_64_ < Class150.anInt1699 * 892411561 - 10
			    || (i_64_
				> 10 + (Class150.anInt1699 * 892411561
					+ -417346889 * Class281.anInt3062)))
			    Class582.method9834((byte) 117);
			else
			    bool = true;
		    }
		    if (!bool) {
			if (i < -620506573 * Class627.anInt8175 - 10
			    || i > (-1739196959 * Class641.anInt8340
				    + -620506573 * Class627.anInt8175 + 10)
			    || i_64_ < anInt782 * -260575397 - 10
			    || (i_64_
				> 10 + (Class327_Sub1.anInt9991 * -577412881
					+ anInt782 * -260575397)))
			    Class44_Sub16.method17357((byte) 36);
			else if (aBool766) {
			    int i_80_ = -1;
			    int i_81_ = -1;
			    for (int i_82_ = 0; i_82_ < anInt789 * 1965634793;
				 i_82_++) {
				if (aBool784) {
				    int i_83_
					= (anInt754 * -238165825 * i_82_
					   + (20 + anInt782 * -260575397
					      + class16.anInt190 * 102396103
					      + 1));
				    if (i_64_ > (i_83_
						 - 102396103 * class16.anInt190
						 - 1)
					&& (i_64_
					    < (728893755 * class16.anInt189
					       + i_83_))) {
					i_80_ = i_82_;
					i_81_ = (i_83_
						 - class16.anInt190 * 102396103
						 - 1);
					break;
				    }
				} else {
				    int i_84_
					= (anInt782 * -260575397 + 31
					   + -238165825 * anInt754 * i_82_);
				    if (i_64_ > i_84_ - 13
					&& i_64_ < 3 + i_84_) {
					i_80_ = i_82_;
					i_81_ = i_84_ - 13;
					break;
				    }
				}
			    }
			    if (-1 != i_80_) {
				int i_85_ = 0;
				Class694 class694
				    = new Class694(aClass696_772);
				for (Class534_Sub18_Sub11 class534_sub18_sub11
					 = ((Class534_Sub18_Sub11)
					    class694.method14068((byte) 6));
				     null != class534_sub18_sub11;
				     class534_sub18_sub11
					 = ((Class534_Sub18_Sub11)
					    class694.next())) {
				    if (i_85_ == i_80_) {
					if ((-475442105
					     * class534_sub18_sub11.anInt11795)
					    > 1)
					    Class263.method4835
						(class534_sub18_sub11, i_81_,
						 (byte) 4);
					break;
				    }
				    i_85_++;
				}
			    }
			}
		    }
		}
	    } else {
		boolean bool = Class479.method7919((Class700.aClass638_8806
						    .anInterface65_8312),
						   class534_sub42, 941710601);
		boolean bool_86_
		    = Class479.method7919((Class700.aClass638_8806
					   .anInterface65_8307),
					  class534_sub42, 941710601);
		boolean bool_87_
		    = Class479.method7919((Class700.aClass638_8806
					   .anInterface65_8308),
					  class534_sub42, 941710601);
		if ((bool || bool_86_) && ((client.anInt11213 * 2117088631 == 1
					    && anInt765 * 324852453 > 2)
					   || Class331.method5856((byte) -36)))
		    bool_87_ = true;
		if (bool_87_ && 324852453 * anInt765 > 0) {
		    if (client.aClass247_11044 == null
			&& client.anInt11248 * 245333843 == 0)
			Class43.method1073(i, i_64_, 1543773986);
		    else
			anInt757 = -1098055734;
		} else if (bool_86_) {
		    if (Class271.aClass534_Sub18_Sub7_2963 != null)
			Class101.method1901(Class271.aClass534_Sub18_Sub7_2963,
					    i, i_64_, false, 161374770);
		} else if (bool) {
		    if (null != Class251.aClass534_Sub18_Sub7_2653) {
			boolean bool_88_
			    = (null != client.aClass247_11044
			       || 245333843 * client.anInt11248 > 0);
			if (bool_88_) {
			    anInt757 = -549027867;
			    Class513.aClass534_Sub18_Sub7_5727
				= Class251.aClass534_Sub18_Sub7_2653;
			} else
			    Class101.method1901((Class251
						 .aClass534_Sub18_Sub7_2653),
						i, i_64_, false, -933232710);
		    } else if (client.aBool11218)
			Exception_Sub3.method17943((byte) 1);
		}
		if (null == client.aClass247_11044
		    && 245333843 * client.anInt11248 == 0) {
		    anInt757 = 0;
		    Class513.aClass534_Sub18_Sub7_5727 = null;
		}
	    }
	}
    }
    
    static boolean method1436(int i) {
	return (i == 44 || 45 == i || i == 46 || i == 47 || i == 48 || i == 49
		|| i == 50 || i == 51 || i == 52 || i == 53 || i == 15);
    }
    
    static void method1437(Class534_Sub18_Sub7 class534_sub18_sub7, int i,
			   int i_89_, boolean bool) {
	if (null != class534_sub18_sub7
	    && class534_sub18_sub7 != aClass700_771.aClass534_8803) {
	    int i_90_ = class534_sub18_sub7.anInt11703 * 980750511;
	    int i_91_ = -1180225371 * class534_sub18_sub7.anInt11704;
	    int i_92_ = class534_sub18_sub7.anInt11706 * -1986934021;
	    int i_93_ = (int) (-7225575275964615095L
			       * class534_sub18_sub7.aLong11702);
	    long l = -7225575275964615095L * class534_sub18_sub7.aLong11702;
	    if (i_92_ >= 2000)
		i_92_ -= 2000;
	    Class597 class597 = client.aClass512_11100.method8416((byte) 52);
	    if (i_92_ == 15) {
		Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		    = client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i_93_];
		if (null != class654_sub1_sub5_sub1_sub2) {
		    client.anInt11115 = -1077600287 * i;
		    client.anInt11169 = 1219616153 * i_89_;
		    client.anInt11265 = 1639785950;
		    client.anInt11188 = 0;
		    Class534_Sub19 class534_sub19
			= Class346.method6128(Class404.aClass404_4229,
					      (client.aClass100_11264
					       .aClass13_1183),
					      1341391005);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16687
			(-823724811 * client.anInt11170, 2002208613);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16506
			(Class479.method7916(-877455222) ? 1 : 0, 1534637571);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16579
			(-1808298539 * Class130.anInt1525, -687296288);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16507
			(-985352023 * client.anInt11219, 1835452974);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16687(i_93_, 1942520410);
		    client.aClass100_11264.method1863(class534_sub19,
						      (byte) 19);
		    Class84.method1669((class654_sub1_sub5_sub1_sub2
					.anIntArray11977[0]),
				       (class654_sub1_sub5_sub1_sub2
					.anIntArray11978[0]),
				       -787566118);
		}
	    }
	    if (i_92_ == 25) {
		Class247 class247
		    = Class81.method1637(i_91_, i_90_, 749134879);
		if (class247 != null) {
		    Exception_Sub3.method17943((byte) 1);
		    Class534_Sub25 class534_sub25
			= client.method17392(class247);
		    Class208.method3945(class247,
					class534_sub25.method16271((byte) 126),
					(class534_sub25.anInt10575
					 * -1799641075),
					-1778292728);
		    client.aString11221
			= Class598.method9939(class247, 221331154);
		    if (client.aString11221 == null)
			client.aString11221 = "Null";
		    client.aString11222
			= new StringBuilder().append(class247.aString2551)
			      .append
			      (Class154.method2575(16777215, 443181134))
			      .toString();
		}
	    } else {
		if (59 == i_92_) {
		    client.anInt11115 = i * -1077600287;
		    client.anInt11169 = 1219616153 * i_89_;
		    client.anInt11265 = -1327590673;
		    client.anInt11188 = 0;
		    Class534_Sub19 class534_sub19
			= Class346.method6128(Class404.aClass404_4157,
					      (client.aClass100_11264
					       .aClass13_1183),
					      1341391005);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16579
			(-1808298539 * Class130.anInt1525, 1747416540);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16569
			(client.anInt11170 * -823724811, 882869570);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16569
			(class597.anInt7861 * -1166289421 + i_91_, -67211160);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16687
			(class597.anInt7859 * -424199969 + i_90_, 2136744620);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16568
			(-985352023 * client.anInt11219, 341353665);
		    client.aClass100_11264.method1863(class534_sub19,
						      (byte) 7);
		    Class84.method1669(i_90_, i_91_, -787566118);
		}
		if (i_92_ == 17) {
		    client.anInt11115 = -1077600287 * i;
		    client.anInt11169 = 1219616153 * i_89_;
		    client.anInt11265 = 1639785950;
		    client.anInt11188 = 0;
		    Class534_Sub19 class534_sub19
			= Class346.method6128(Class404.aClass404_4262,
					      (client.aClass100_11264
					       .aClass13_1183),
					      1341391005);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16510
			(-1808298539 * Class130.anInt1525, -2071307314);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16687
			(client.anInt11170 * -823724811, 2071747662);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16560
			(Class479.method7916(-877455222) ? 1 : 0, -1636914824);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16569(i_93_, 1111132491);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16569
			(i_91_ + class597.anInt7861 * -1166289421, 115817676);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16568
			(i_90_ + class597.anInt7859 * -424199969, -1224048002);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16569
			(client.anInt11219 * -985352023, -2085240195);
		    client.aClass100_11264.method1863(class534_sub19,
						      (byte) 81);
		    Class84.method1669(i_90_, i_91_, -787566118);
		}
		if (60 == i_92_) {
		    if (365872613 * client.anInt11194 > 0
			&& Class453_Sub5.method16010(2100863003))
			Class534_Sub18_Sub2.method17849
			    ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			      .aByte10854),
			     class597.anInt7859 * -424199969 + i_90_,
			     -1166289421 * class597.anInt7861 + i_91_,
			     -363707204);
		    else {
			client.anInt11115 = -1077600287 * i;
			client.anInt11169 = i_89_ * 1219616153;
			client.anInt11265 = -1327590673;
			client.anInt11188 = 0;
			Class534_Sub19 class534_sub19
			    = Class346.method6128(Class404.aClass404_4179,
						  (client.aClass100_11264
						   .aClass13_1183),
						  1341391005);
			class534_sub19.aClass534_Sub40_Sub1_10513.method16687
			    (-424199969 * class597.anInt7859 + i_90_,
			     2132725638);
			class534_sub19.aClass534_Sub40_Sub1_10513.method16507
			    (-1166289421 * class597.anInt7861 + i_91_,
			     1154855541);
			client.aClass100_11264.method1863(class534_sub19,
							  (byte) 78);
		    }
		}
		if (i_92_ == 30 && client.aClass247_11119 == null) {
		    Class536.method8908(i_91_, i_90_, -898896926);
		    client.aClass247_11119
			= Class81.method1637(i_91_, i_90_, 475982531);
		    if (client.aClass247_11119 != null)
			Class454.method7416(client.aClass247_11119,
					    -1362402472);
		}
		if (i_92_ == 1008 || i_92_ == 1009 || i_92_ == 1010
		    || 1011 == i_92_ || 1012 == i_92_)
		    Class536_Sub4.method15993(i_92_, i_93_, i_90_, (byte) 50);
		if (i_92_ == 23) {
		    if (client.anInt11194 * 365872613 > 0
			&& Class453_Sub5.method16010(2105684459))
			Class534_Sub18_Sub2.method17849
			    ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			      .aByte10854),
			     i_90_ + -424199969 * class597.anInt7859,
			     i_91_ + class597.anInt7861 * -1166289421,
			     448606069);
		    else {
			Class534_Sub19 class534_sub19
			    = Class711.method14415(i_90_, i_91_, i_93_,
						   1294038924);
			if (i_93_ == 1) {
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16506(-1, 262251335);
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16506(-1, 1640073856);
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16507
				((int) client.aFloat11140, 1730315396);
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16506(57, 1199940797);
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16506
				(client.anInt11189 * -2045337339, 1429779966);
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16506
				(-2002513841 * client.anInt11022, 1268069554);
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16506(89, 2012522750);
			    Class438 class438
				= (Class322
				       .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				       .method10807
				   ().aClass438_4885);
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16507
				((int) class438.aFloat4864, 1771701974);
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16507
				((int) class438.aFloat4865, 1191918938);
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16506(63, 1357444438);
			} else {
			    client.anInt11115 = -1077600287 * i;
			    client.anInt11169 = 1219616153 * i_89_;
			    client.anInt11265 = -1327590673;
			    client.anInt11188 = 0;
			}
			client.aClass100_11264.method1863(class534_sub19,
							  (byte) 94);
			Class84.method1669(i_90_, i_91_, -787566118);
		    }
		}
		Class404 class404 = null;
		if (9 == i_92_)
		    class404 = Class404.aClass404_4248;
		else if (i_92_ == 10)
		    class404 = Class404.aClass404_4266;
		else if (i_92_ == 11)
		    class404 = Class404.aClass404_4221;
		else if (12 == i_92_)
		    class404 = Class404.aClass404_4226;
		else if (13 == i_92_)
		    class404 = Class404.aClass404_4216;
		else if (i_92_ == 1003)
		    class404 = Class404.aClass404_4254;
		if (class404 != null) {
		    Class534_Sub6 class534_sub6
			= ((Class534_Sub6)
			   client.aClass9_11331.method579((long) i_93_));
		    if (null != class534_sub6) {
			Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
			    = ((Class654_Sub1_Sub5_Sub1_Sub1)
			       class534_sub6.anObject10417);
			client.anInt11115 = -1077600287 * i;
			client.anInt11169 = 1219616153 * i_89_;
			client.anInt11265 = 1639785950;
			client.anInt11188 = 0;
			Class534_Sub19 class534_sub19
			    = Class346.method6128(class404,
						  (client.aClass100_11264
						   .aClass13_1183),
						  1341391005);
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .method16569(i_93_, 1191730327);
			class534_sub19.aClass534_Sub40_Sub1_10513.method16559
			    (Class479.method7916(-877455222) ? 1 : 0,
			     523286128);
			client.aClass100_11264.method1863(class534_sub19,
							  (byte) 121);
			Class84.method1669((class654_sub1_sub5_sub1_sub1
					    .anIntArray11977[0]),
					   (class654_sub1_sub5_sub1_sub1
					    .anIntArray11978[0]),
					   -787566118);
		    }
		}
		if (i_92_ == 2) {
		    client.anInt11115 = i * -1077600287;
		    client.anInt11169 = i_89_ * 1219616153;
		    client.anInt11265 = 1639785950;
		    client.anInt11188 = 0;
		    Class534_Sub19 class534_sub19
			= Class346.method6128(Class404.aClass404_4174,
					      (client.aClass100_11264
					       .aClass13_1183),
					      1341391005);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16569
			(-985352023 * client.anInt11219, -1064886209);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16617
			((int) (l >>> 32) & 0x7fffffff, -1960982307);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16569
			(i_91_ + class597.anInt7861 * -1166289421, -819400635);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16687
			(-823724811 * client.anInt11170, 2114069664);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16559
			(Class479.method7916(-877455222) ? 1 : 0, 1776335530);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16579
			(Class130.anInt1525 * -1808298539, 30401931);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16569
			(i_90_ + -424199969 * class597.anInt7859, -312626830);
		    client.aClass100_11264.method1863(class534_sub19,
						      (byte) 27);
		    Class84.method1669(i_90_, i_91_, -787566118);
		}
		Class404 class404_94_ = null;
		if (i_92_ == 44)
		    class404_94_ = Class404.aClass404_4198;
		else if (45 == i_92_)
		    class404_94_ = Class404.aClass404_4237;
		else if (i_92_ == 46)
		    class404_94_ = Class404.aClass404_4261;
		else if (i_92_ == 47)
		    class404_94_ = Class404.aClass404_4215;
		else if (i_92_ == 48)
		    class404_94_ = Class404.aClass404_4202;
		else if (49 == i_92_)
		    class404_94_ = Class404.aClass404_4196;
		else if (50 == i_92_)
		    class404_94_ = Class404.aClass404_4264;
		else if (i_92_ == 51)
		    class404_94_ = Class404.aClass404_4162;
		else if (i_92_ == 52)
		    class404_94_ = Class404.aClass404_4232;
		else if (53 == i_92_)
		    class404_94_ = Class404.aClass404_4189;
		if (class404_94_ != null) {
		    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
			= (client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279
			   [i_93_]);
		    if (null != class654_sub1_sub5_sub1_sub2) {
			client.anInt11115 = i * -1077600287;
			client.anInt11169 = 1219616153 * i_89_;
			client.anInt11265 = 1639785950;
			client.anInt11188 = 0;
			Class534_Sub19 class534_sub19
			    = Class346.method6128(class404_94_,
						  (client.aClass100_11264
						   .aClass13_1183),
						  1341391005);
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .method16687(i_93_, 2038511057);
			class534_sub19.aClass534_Sub40_Sub1_10513.method16560
			    (Class479.method7916(-877455222) ? 1 : 0,
			     -904286430);
			client.aClass100_11264.method1863(class534_sub19,
							  (byte) 12);
			Class84.method1669((class654_sub1_sub5_sub1_sub2
					    .anIntArray11977[0]),
					   (class654_sub1_sub5_sub1_sub2
					    .anIntArray11978[0]),
					   -787566118);
		    }
		}
		if (i_92_ == 57 || 1007 == i_92_)
		    Class273.method5102(i_93_, i_91_, i_90_,
					class534_sub18_sub7.aString11708,
					(byte) -13);
		if (16 == i_92_) {
		    client.anInt11115 = -1077600287 * i;
		    client.anInt11169 = 1219616153 * i_89_;
		    client.anInt11265 = 1639785950;
		    client.anInt11188 = 0;
		    Class534_Sub19 class534_sub19
			= Class346.method6128(Class404.aClass404_4229,
					      (client.aClass100_11264
					       .aClass13_1183),
					      1341391005);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16687
			(client.anInt11170 * -823724811, 2003089475);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16506
			(Class479.method7916(-877455222) ? 1 : 0, 2115851122);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16579
			(-1808298539 * Class130.anInt1525, 754627530);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16507
			(-985352023 * client.anInt11219, 978472186);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16687
			(1126388985 * (Class322
				       .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				       .anInt11922),
			 2087444269);
		    client.aClass100_11264.method1863(class534_sub19,
						      (byte) 40);
		}
		if (8 == i_92_) {
		    Class534_Sub6 class534_sub6
			= ((Class534_Sub6)
			   client.aClass9_11331.method579((long) i_93_));
		    if (null != class534_sub6) {
			Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
			    = ((Class654_Sub1_Sub5_Sub1_Sub1)
			       class534_sub6.anObject10417);
			client.anInt11115 = -1077600287 * i;
			client.anInt11169 = i_89_ * 1219616153;
			client.anInt11265 = 1639785950;
			client.anInt11188 = 0;
			Class534_Sub19 class534_sub19
			    = Class346.method6128(Class404.aClass404_4274,
						  (client.aClass100_11264
						   .aClass13_1183),
						  1341391005);
			class534_sub19.aClass534_Sub40_Sub1_10513.method16507
			    (-823724811 * client.anInt11170, 1444336953);
			class534_sub19.aClass534_Sub40_Sub1_10513.method16568
			    (-985352023 * client.anInt11219, -873365293);
			class534_sub19.aClass534_Sub40_Sub1_10513.method16510
			    (Class130.anInt1525 * -1808298539, -462795189);
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .method16507(i_93_, 795797311);
			class534_sub19.aClass534_Sub40_Sub1_10513.method16559
			    (Class479.method7916(-877455222) ? 1 : 0,
			     695417449);
			client.aClass100_11264.method1863(class534_sub19,
							  (byte) 76);
			Class84.method1669((class654_sub1_sub5_sub1_sub1
					    .anIntArray11977[0]),
					   (class654_sub1_sub5_sub1_sub1
					    .anIntArray11978[0]),
					   -787566118);
		    }
		}
		if (i_92_ == 58) {
		    Class247 class247
			= Class81.method1637(i_91_, i_90_, 1910270284);
		    if (null != class247)
			Class392_Sub1.method15837(class247, -470833264);
		}
		Class404 class404_95_ = null;
		if (3 == i_92_)
		    class404_95_ = Class404.aClass404_4235;
		else if (4 == i_92_)
		    class404_95_ = Class404.aClass404_4244;
		else if (5 == i_92_)
		    class404_95_ = Class404.aClass404_4194;
		else if (i_92_ == 6)
		    class404_95_ = Class404.aClass404_4271;
		else if (i_92_ == 1001)
		    class404_95_ = Class404.aClass404_4181;
		else if (i_92_ == 1002)
		    class404_95_ = Class404.aClass404_4231;
		if (class404_95_ != null) {
		    client.anInt11115 = -1077600287 * i;
		    client.anInt11169 = i_89_ * 1219616153;
		    client.anInt11265 = 1639785950;
		    client.anInt11188 = 0;
		    Class534_Sub19 class534_sub19
			= Class346.method6128(class404_95_,
					      (client.aClass100_11264
					       .aClass13_1183),
					      1341391005);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16568
			(-1166289421 * class597.anInt7861 + i_91_,
			 -1031519002);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16687
			(i_90_ + -424199969 * class597.anInt7859, 2128501777);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16510
			((int) (l >>> 32) & 0x7fffffff, -110766428);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16506
			(Class479.method7916(-877455222) ? 1 : 0, 876222200);
		    client.aClass100_11264.method1863(class534_sub19,
						      (byte) 125);
		    Class84.method1669(i_90_, i_91_, -787566118);
		}
		Class404 class404_96_ = null;
		if (18 == i_92_)
		    class404_96_ = Class404.aClass404_4193;
		else if (i_92_ == 19)
		    class404_96_ = Class404.aClass404_4160;
		else if (20 == i_92_)
		    class404_96_ = Class404.aClass404_4268;
		else if (21 == i_92_)
		    class404_96_ = Class404.aClass404_4184;
		else if (i_92_ == 22)
		    class404_96_ = Class404.aClass404_4233;
		else if (1004 == i_92_)
		    class404_96_ = Class404.aClass404_4185;
		if (class404_96_ != null) {
		    client.anInt11115 = i * -1077600287;
		    client.anInt11169 = i_89_ * 1219616153;
		    client.anInt11265 = 1639785950;
		    client.anInt11188 = 0;
		    Class534_Sub19 class534_sub19
			= Class346.method6128(class404_96_,
					      (client.aClass100_11264
					       .aClass13_1183),
					      1341391005);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16569
			(i_90_ + class597.anInt7859 * -424199969, 748217489);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16635
			((bool ? 2 : 0) | (Class479.method7916(-877455222) ? 1
					   : 0),
			 1685290489);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16569
			(i_91_ + -1166289421 * class597.anInt7861,
			 -1226899645);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16687(i_93_, 2040236495);
		    client.aClass100_11264.method1863(class534_sub19,
						      (byte) 55);
		    Class84.method1669(i_90_, i_91_, -787566118);
		}
		if (client.aBool11218)
		    Exception_Sub3.method17943((byte) 1);
		if (null != Class236.aClass247_2372
		    && client.anInt11084 * 602951003 == 0)
		    Class454.method7416(Class236.aClass247_2372, -880958712);
	    }
	}
    }
    
    static void method1438(Class534_Sub18_Sub11 class534_sub18_sub11, int i) {
	if (aBool758) {
	    Class16 class16 = Class160.method2620(1770101340);
	    int i_97_ = 0;
	    for (Class534_Sub18_Sub7 class534_sub18_sub7
		     = (Class534_Sub18_Sub7) class534_sub18_sub11
						 .aClass696_11794
						 .method14078(1221951837);
		 null != class534_sub18_sub7;
		 class534_sub18_sub7
		     = (Class534_Sub18_Sub7) class534_sub18_sub11
						 .aClass696_11794
						 .method14080((byte) 50)) {
		int i_98_ = Class281.method5236(class534_sub18_sub7, class16,
						-1039387720);
		if (i_98_ > i_97_)
		    i_97_ = i_98_;
	    }
	    i_97_ += 8;
	    int i_99_
		= 21 + (-238165825 * anInt754
			* (-475442105 * class534_sub18_sub11.anInt11795));
	    Class281.anInt3062
		= (2050568967
		   * (-238165825 * anInt754 * (class534_sub18_sub11.anInt11795
					       * -475442105)
		      + (aBool784 ? 26 : 22)));
	    int i_100_ = (Class641.anInt8340 * -1739196959
			  + Class627.anInt8175 * -620506573);
	    if (i_100_ + i_97_ > 1771907305 * Class706_Sub4.anInt10994)
		i_100_ = -620506573 * Class627.anInt8175 - i_97_;
	    if (i_100_ < 0)
		i_100_ = 0;
	    int i_101_
		= aBool784 ? 1 + (102396103 * class16.anInt190 + 20) : 31;
	    int i_102_ = 1 + (i - i_101_ + 102396103 * class16.anInt190);
	    if (i_102_ + i_99_ > Class18.anInt205 * -1091172141)
		i_102_ = -1091172141 * Class18.anInt205 - i_99_;
	    if (i_102_ < 0)
		i_102_ = 0;
	    Class112.anInt1364 = -228643305 * i_100_;
	    Class150.anInt1699 = i_102_ * 1135371673;
	    Class536_Sub4.anInt10366 = i_97_ * 1938836795;
	    aClass534_Sub18_Sub11_760 = class534_sub18_sub11;
	}
    }
    
    static long method1439(Interface62 interface62, int i, int i_103_) {
	long l = 4194304L;
	long l_104_ = -9223372036854775808L;
	Class602 class602
	    = ((Class602)
	       client.aClass512_11100.method8428(-1486655428)
		   .method91(interface62.method56(748737910), -644842612));
	long l_105_
	    = (long) (i | i_103_ << 7
		      | interface62.method409(-1417862377) << 14
		      | interface62.method410(-1510559379) << 20 | 0x40000000);
	if (class602.anInt7907 * -2134171963 == 0)
	    l_105_ |= l_104_;
	if (1 == class602.anInt7940 * 1288889595)
	    l_105_ |= l;
	l_105_ |= (long) interface62.method56(300871169) << 32;
	return l_105_;
    }
    
    static void method1440(Class185 class185, int i, int i_106_) {
	if (i >= 0 && i_106_ >= 0 && aClass433_762 != null) {
	    Class597 class597 = client.aClass512_11100.method8416((byte) 77);
	    Class433 class433 = class185.method3518();
	    Class706_Sub5.method17347(class185, (byte) 0);
	    class433.method6916(aClass446_783);
	    class433.method6839(aClass433_762);
	    class433.method6847();
	    int i_107_ = i - 894945745 * anInt777;
	    int i_108_ = i_106_ - -655548783 * anInt778;
	    if (client.aClass512_11100.method8424((byte) 31) != null) {
		if (!client.aBool11218
		    || (460977285 * Class200_Sub14.anInt9950 & 0x40) != 0) {
		    int i_109_ = -1;
		    int i_110_ = -1;
		    float f = ((float) i_107_ * 2.0F / (float) (1852547097
								* anInt779)
			       - 1.0F);
		    float f_111_
			= (2.0F * (float) i_108_ / (float) (-1954074475
							    * anInt780)
			   - 1.0F);
		    class433.method6850(f, f_111_, -1.0F, aFloatArray769);
		    float f_112_ = aFloatArray769[0] / aFloatArray769[3];
		    float f_113_ = aFloatArray769[1] / aFloatArray769[3];
		    float f_114_ = aFloatArray769[2] / aFloatArray769[3];
		    class433.method6850(f, f_111_, 1.0F, aFloatArray769);
		    float f_115_ = aFloatArray769[0] / aFloatArray769[3];
		    float f_116_ = aFloatArray769[1] / aFloatArray769[3];
		    float f_117_ = aFloatArray769[2] / aFloatArray769[3];
		    float f_118_
			= Class33.method900(f_112_, f_113_, f_114_, f_115_,
					    f_116_, f_117_, 4, 286284420);
		    if (f_118_ > 0.0F) {
			float f_119_ = f_115_ - f_112_;
			float f_120_ = f_117_ - f_114_;
			int i_121_ = (int) (f_119_ * f_118_ + f_112_);
			int i_122_ = (int) (f_114_ + f_120_ * f_118_);
			i_109_
			    = i_121_ + (Class322
					    .aClass654_Sub1_Sub5_Sub1_Sub2_3419
					    .method18545((byte) 1) - 1
					<< 8) >> 9;
			i_110_
			    = i_122_ + (Class322
					    .aClass654_Sub1_Sub5_Sub1_Sub2_3419
					    .method18545((byte) 1) - 1
					<< 8) >> 9;
			int i_123_
			    = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			       .aByte10854);
			if (i_123_ < 3 && ((client.aClass512_11100.method8552
					    ((byte) 0).aByteArrayArrayArray5145
					    [1][i_121_ >> 9][i_122_ >> 9])
					   & 0x2) != 0)
			    i_123_++;
		    }
		    if (-1 != i_109_ && i_110_ != -1) {
			if (client.aBool11218
			    && ((460977285 * Class200_Sub14.anInt9950 & 0x40)
				!= 0)) {
			    Class247 class247
				= Class81.method1637((-1808298539
						      * Class130.anInt1525),
						     (-985352023
						      * client.anInt11219),
						     1345230965);
			    if (null != class247)
				Class112.method2016
				    (client.aString11221,
				     new StringBuilder().append(" ").append
					 (Class29.aString263).append
					 (" ").toString(),
				     -731032933 * Class460.anInt5069, 59, -1,
				     0L, i_109_, i_110_, true, false,
				     (long) (i_109_ << 0 | i_110_), true,
				     (short) 5081);
			    else
				Exception_Sub3.method17943((byte) 1);
			} else {
			    if (Class665.aBool8573)
				Class112.method2016((Class58.aClass58_636
							 .method1245
						     (Class539.aClass672_7171,
						      (byte) -44)),
						    "", -1, 60, -1, 0L, i_109_,
						    i_110_, true, false,
						    (long) (i_109_ << 0
							    | i_110_),
						    true, (short) 22782);
			    Class112.method2016(Class106.aString1311, "",
						1361725501 * client.anInt11356,
						23, -1, 0L, i_109_, i_110_,
						true, false,
						(long) (i_109_ << 0 | i_110_),
						true, (short) 28653);
			}
		    }
		}
		Class557 class557 = (client.aClass512_11100.method8424
				     ((byte) 96).aClass557_7478);
		int i_124_ = i;
		int i_125_ = i_106_;
		List list = class557.aList7484;
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
		    Class550 class550 = (Class550) iterator.next();
		    if ((client.aBool11057
			 || ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			      .aByte10854)
			     == class550.aClass654_Sub1_7303.aByte10854))
			&& class550.method9025(class185, i_124_, i_125_,
					       2088438307)) {
			boolean bool = false;
			boolean bool_126_ = false;
			int i_127_;
			int i_128_;
			if (class550.aClass654_Sub1_7303
			    instanceof Class654_Sub1_Sub5) {
			    i_127_
				= ((Class654_Sub1_Sub5)
				   class550.aClass654_Sub1_7303).aShort11900;
			    i_128_
				= ((Class654_Sub1_Sub5)
				   class550.aClass654_Sub1_7303).aShort11901;
			} else {
			    Class438 class438
				= (class550.aClass654_Sub1_7303.method10807()
				   .aClass438_4885);
			    i_127_ = (int) class438.aFloat4864 >> 9;
			    i_128_ = (int) class438.aFloat4865 >> 9;
			}
			if (class550.aClass654_Sub1_7303
			    instanceof Class654_Sub1_Sub5_Sub1_Sub2) {
			    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
				= ((Class654_Sub1_Sub5_Sub1_Sub2)
				   class550.aClass654_Sub1_7303);
			    int i_129_ = class654_sub1_sub5_sub1_sub2
					     .method18545((byte) 1);
			    Class438 class438
				= (class654_sub1_sub5_sub1_sub2.method10807()
				   .aClass438_4885);
			    if ((0 == (i_129_ & 0x1)
				 && 0 == ((int) class438.aFloat4864 & 0x1ff)
				 && ((int) class438.aFloat4865 & 0x1ff) == 0)
				|| (1 == (i_129_ & 0x1)
				    && 256 == ((int) class438.aFloat4864
					       & 0x1ff)
				    && 256 == ((int) class438.aFloat4865
					       & 0x1ff))) {
				int i_130_ = ((int) class438.aFloat4864
					      - (class654_sub1_sub5_sub1_sub2
						     .method18545((byte) 1) - 1
						 << 8));
				int i_131_ = ((int) class438.aFloat4865
					      - (class654_sub1_sub5_sub1_sub2
						     .method18545((byte) 1) - 1
						 << 8));
				for (int i_132_ = 0;
				     i_132_ < client.anInt11321 * -1125820437;
				     i_132_++) {
				    Class534_Sub6 class534_sub6
					= ((Class534_Sub6)
					   (client.aClass9_11331.method579
					    ((long) client.anIntArray11088
						    [i_132_])));
				    if (null != class534_sub6) {
					Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
					    = ((Class654_Sub1_Sub5_Sub1_Sub1)
					       class534_sub6.anObject10417);
					if ((client.anInt11101
					     != (class654_sub1_sub5_sub1_sub1
						 .anInt11969) * 1959487047)
					    && (class654_sub1_sub5_sub1_sub1
						.aBool11989)) {
					    Class438 class438_133_
						= (class654_sub1_sub5_sub1_sub1
						       .method10807
						   ().aClass438_4885);
					    int i_134_
						= ((int) (class438_133_
							  .aFloat4864)
						   - ((-1821838479
						       * (class654_sub1_sub5_sub1_sub1
							  .aClass307_12204
							  .anInt3328)) - 1
						      << 8));
					    int i_135_
						= ((int) (class438_133_
							  .aFloat4865)
						   - ((-1821838479
						       * (class654_sub1_sub5_sub1_sub1
							  .aClass307_12204
							  .anInt3328)) - 1
						      << 8));
					    if (i_134_ >= i_130_
						&& ((-1821838479
						     * (class654_sub1_sub5_sub1_sub1
							.aClass307_12204
							.anInt3328))
						    <= ((class654_sub1_sub5_sub1_sub2
							     .method18545
							 ((byte) 1))
							- (i_134_ - i_130_
							   >> 9)))
						&& i_135_ >= i_131_
						&& ((class654_sub1_sub5_sub1_sub1
						     .aClass307_12204
						     .anInt3328) * -1821838479
						    <= ((class654_sub1_sub5_sub1_sub2
							     .method18545
							 ((byte) 1))
							- (i_135_ - i_131_
							   >> 9)))) {
						Class276.method5155
						    (class654_sub1_sub5_sub1_sub1,
						     ((Class322
						       .aClass654_Sub1_Sub5_Sub1_Sub2_3419
						       .aByte10854)
						      != (class550
							  .aClass654_Sub1_7303
							  .aByte10854)),
						     1476365389);
						class654_sub1_sub5_sub1_sub1
						    .anInt11969
						    = (client.anInt11101
						       * -253074569);
					    }
					}
				    }
				}
				int i_136_ = -1843550713 * Class108.anInt1321;
				int[] is = Class108.anIntArray1322;
				for (int i_137_ = 0; i_137_ < i_136_;
				     i_137_++) {
				    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2_138_
					= (client
					   .aClass654_Sub1_Sub5_Sub1_Sub2Array11279
					   [is[i_137_]]);
				    if ((null
					 != class654_sub1_sub5_sub1_sub2_138_)
					&& ((class654_sub1_sub5_sub1_sub2_138_
					     .anInt11969) * 1959487047
					    != client.anInt11101)
					&& (class654_sub1_sub5_sub1_sub2_138_
					    != class654_sub1_sub5_sub1_sub2)
					&& (class654_sub1_sub5_sub1_sub2_138_
					    .aBool11989)) {
					Class438 class438_139_
					    = (class654_sub1_sub5_sub1_sub2_138_
						   .method10807
					       ().aClass438_4885);
					int i_140_
					    = ((int) class438_139_.aFloat4864
					       - (class654_sub1_sub5_sub1_sub2_138_
						      .method18545((byte) 1) - 1
						  << 8));
					int i_141_
					    = ((int) class438_139_.aFloat4865
					       - (class654_sub1_sub5_sub1_sub2_138_
						      .method18545((byte) 1) - 1
						  << 8));
					if (i_140_ >= i_130_
					    && (class654_sub1_sub5_sub1_sub2_138_
						    .method18545((byte) 1)
						<= (class654_sub1_sub5_sub1_sub2
							.method18545((byte) 1)
						    - (i_140_ - i_130_ >> 9)))
					    && i_141_ >= i_131_
					    && (class654_sub1_sub5_sub1_sub2_138_
						    .method18545((byte) 1)
						<= (class654_sub1_sub5_sub1_sub2
							.method18545((byte) 1)
						    - (i_141_ - i_131_
						       >> 9)))) {
					    Class294.method5319
						(class654_sub1_sub5_sub1_sub2_138_,
						 ((class550.aClass654_Sub1_7303
						   .aByte10854)
						  != (Class322
						      .aClass654_Sub1_Sub5_Sub1_Sub2_3419
						      .aByte10854)),
						 (byte) 61);
					    class654_sub1_sub5_sub1_sub2_138_
						.anInt11969
						= (-253074569
						   * client.anInt11101);
					}
				    }
				}
			    }
			    if (client.anInt11101
				== (class654_sub1_sub5_sub1_sub2.anInt11969
				    * 1959487047))
				continue;
			    Class294.method5319
				(class654_sub1_sub5_sub1_sub2,
				 (class550.aClass654_Sub1_7303.aByte10854
				  != (Class322
				      .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				      .aByte10854)),
				 (byte) 123);
			    class654_sub1_sub5_sub1_sub2.anInt11969
				= client.anInt11101 * -253074569;
			}
			if (class550.aClass654_Sub1_7303
			    instanceof Class654_Sub1_Sub5_Sub1_Sub1) {
			    Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
				= ((Class654_Sub1_Sub5_Sub1_Sub1)
				   class550.aClass654_Sub1_7303);
			    if (null != (class654_sub1_sub5_sub1_sub1
					 .aClass307_12204)) {
				Class438 class438
				    = (class654_sub1_sub5_sub1_sub1.method10807
				       ().aClass438_4885);
				if (((((class654_sub1_sub5_sub1_sub1
					.aClass307_12204.anInt3328)
				       * -1821838479)
				      & 0x1) == 0
				     && (((int) class438.aFloat4864 & 0x1ff)
					 == 0)
				     && (((int) class438.aFloat4865 & 0x1ff)
					 == 0))
				    || (1 == (((class654_sub1_sub5_sub1_sub1
						.aClass307_12204.anInt3328)
					       * -1821838479)
					      & 0x1)
					&& 256 == ((int) class438.aFloat4864
						   & 0x1ff)
					&& (((int) class438.aFloat4865 & 0x1ff)
					    == 256))) {
				    int i_142_
					= ((int) class438.aFloat4864
					   - (((class654_sub1_sub5_sub1_sub1
						.aClass307_12204.anInt3328)
					       * -1821838479) - 1
					      << 8));
				    int i_143_
					= ((int) class438.aFloat4865
					   - (((class654_sub1_sub5_sub1_sub1
						.aClass307_12204.anInt3328)
					       * -1821838479) - 1
					      << 8));
				    for (int i_144_ = 0;
					 (i_144_
					  < client.anInt11321 * -1125820437);
					 i_144_++) {
					Class534_Sub6 class534_sub6
					    = ((Class534_Sub6)
					       (client.aClass9_11331.method579
						((long) client.anIntArray11088
							[i_144_])));
					if (class534_sub6 != null) {
					    Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1_145_
						= ((Class654_Sub1_Sub5_Sub1_Sub1)
						   (class534_sub6
						    .anObject10417));
					    if ((client.anInt11101
						 != (1959487047
						     * (class654_sub1_sub5_sub1_sub1_145_
							.anInt11969)))
						&& (class654_sub1_sub5_sub1_sub1_145_
						    != class654_sub1_sub5_sub1_sub1)
						&& (class654_sub1_sub5_sub1_sub1_145_
						    .aBool11989)) {
						Class438 class438_146_
						    = (class654_sub1_sub5_sub1_sub1_145_
							   .method10807
						       ().aClass438_4885);
						int i_147_
						    = ((int) (class438_146_
							      .aFloat4864)
						       - (((class654_sub1_sub5_sub1_sub1_145_
							    .aClass307_12204
							    .anInt3328)
							   * -1821838479) - 1
							  << 8));
						int i_148_
						    = ((int) (class438_146_
							      .aFloat4865)
						       - ((-1821838479
							   * (class654_sub1_sub5_sub1_sub1_145_
							      .aClass307_12204
							      .anInt3328)) - 1
							  << 8));
						if (i_147_ >= i_142_
						    && (((class654_sub1_sub5_sub1_sub1_145_
							  .aClass307_12204
							  .anInt3328)
							 * -1821838479)
							<= (((class654_sub1_sub5_sub1_sub1
							      .aClass307_12204
							      .anInt3328)
							     * -1821838479)
							    - (i_147_ - i_142_
							       >> 9)))
						    && i_148_ >= i_143_
						    && (((class654_sub1_sub5_sub1_sub1_145_
							  .aClass307_12204
							  .anInt3328)
							 * -1821838479)
							<= ((-1821838479
							     * (class654_sub1_sub5_sub1_sub1
								.aClass307_12204
								.anInt3328))
							    - (i_148_ - i_143_
							       >> 9)))) {
						    Class276.method5155
							(class654_sub1_sub5_sub1_sub1_145_,
							 ((class550
							   .aClass654_Sub1_7303
							   .aByte10854)
							  != (Class322
							      .aClass654_Sub1_Sub5_Sub1_Sub2_3419
							      .aByte10854)),
							 1153164159);
						    class654_sub1_sub5_sub1_sub1_145_
							.anInt11969
							= (-253074569
							   * (client
							      .anInt11101));
						}
					    }
					}
				    }
				    int i_149_
					= -1843550713 * Class108.anInt1321;
				    int[] is = Class108.anIntArray1322;
				    for (int i_150_ = 0; i_150_ < i_149_;
					 i_150_++) {
					Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
					    = (client
					       .aClass654_Sub1_Sub5_Sub1_Sub2Array11279
					       [is[i_150_]]);
					if ((class654_sub1_sub5_sub1_sub2
					     != null)
					    && ((1959487047
						 * (class654_sub1_sub5_sub1_sub2
						    .anInt11969))
						!= client.anInt11101)
					    && (class654_sub1_sub5_sub1_sub2
						.aBool11989)) {
					    Class438 class438_151_
						= (class654_sub1_sub5_sub1_sub2
						       .method10807
						   ().aClass438_4885);
					    int i_152_
						= ((int) (class438_151_
							  .aFloat4864)
						   - ((class654_sub1_sub5_sub1_sub2
							   .method18545
						       ((byte) 1)) - 1
						      << 8));
					    int i_153_
						= ((int) (class438_151_
							  .aFloat4865)
						   - ((class654_sub1_sub5_sub1_sub2
							   .method18545
						       ((byte) 1)) - 1
						      << 8));
					    if (i_152_ >= i_142_
						&& (class654_sub1_sub5_sub1_sub2
							.method18545((byte) 1)
						    <= (((class654_sub1_sub5_sub1_sub1
							  .aClass307_12204
							  .anInt3328)
							 * -1821838479)
							- (i_152_ - i_142_
							   >> 9)))
						&& i_153_ >= i_143_
						&& (class654_sub1_sub5_sub1_sub2
							.method18545((byte) 1)
						    <= (((class654_sub1_sub5_sub1_sub1
							  .aClass307_12204
							  .anInt3328)
							 * -1821838479)
							- (i_153_ - i_143_
							   >> 9)))) {
						Class294.method5319
						    (class654_sub1_sub5_sub1_sub2,
						     ((Class322
						       .aClass654_Sub1_Sub5_Sub1_Sub2_3419
						       .aByte10854)
						      != (class550
							  .aClass654_Sub1_7303
							  .aByte10854)),
						     (byte) 36);
						class654_sub1_sub5_sub1_sub2
						    .anInt11969
						    = (-253074569
						       * client.anInt11101);
					    }
					}
				    }
				}
				if ((1959487047
				     * class654_sub1_sub5_sub1_sub1.anInt11969)
				    == client.anInt11101)
				    continue;
				Class276.method5155
				    (class654_sub1_sub5_sub1_sub1,
				     ((Class322
				       .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				       .aByte10854)
				      != (class550.aClass654_Sub1_7303
					  .aByte10854)),
				     1803733412);
				class654_sub1_sub5_sub1_sub1.anInt11969
				    = -253074569 * client.anInt11101;
			    }
			}
			if (class550.aClass654_Sub1_7303
			    instanceof Class654_Sub1_Sub4_Sub1) {
			    int i_154_
				= i_127_ + class597.anInt7859 * -424199969;
			    int i_155_
				= i_128_ + class597.anInt7861 * -1166289421;
			    Class534_Sub7 class534_sub7
				= ((Class534_Sub7)
				   (client.aClass9_11209.method579
				    ((long) ((class550.aClass654_Sub1_7303
					      .aByte10854) << 28
					     | i_155_ << 14 | i_154_))));
			    if (null != class534_sub7) {
				int i_156_ = 0;
				Class534_Sub23 class534_sub23
				    = ((Class534_Sub23)
				       class534_sub7.aClass700_10418
					   .method14137((byte) -30));
				while (class534_sub23 != null) {
				    Class15 class15
					= ((Class15)
					   (Class531.aClass44_Sub7_7135
						.method91
					    ((-400233975
					      * class534_sub23.anInt10548),
					     202409060)));
				    int i_157_;
				    if (class15.aBool181)
					i_157_ = 510229545 * class15.anInt182;
				    else if (class15.aBool106)
					i_157_ = 1376086885 * (Class700
							       .aClass638_8806
							       .anInt8306);
				    else
					i_157_ = (Class700.aClass638_8806
						  .anInt8314) * -629529995;
				    if (client.aBool11218
					&& ((class550.aClass654_Sub1_7303
					     .aByte10854)
					    == (Class322
						.aClass654_Sub1_Sub5_Sub1_Sub2_3419
						.aByte10854))) {
					Class90 class90
					    = ((Class90)
					       ((Class392_Sub1.anInt10224
						 * 410979031) != -1
						? (Class534_Sub11_Sub13
						       .aClass44_Sub22_11730
						       .method91
						   (410979031 * (Class392_Sub1
								 .anInt10224),
						    547894752))
						: null));
					if (((460977285
					      * Class200_Sub14.anInt9950)
					     & 0x1) != 0
					    && (class90 == null
						|| ((class15.method683
						     ((Class392_Sub1.anInt10224
						       * 410979031),
						      (class90.anInt888
						       * 263946597),
						      (byte) 50))
						    != (263946597
							* class90.anInt888))))
					    Class112.method2016
						(client.aString11221,
						 new StringBuilder().append
						     (client.aString11222)
						     .append
						     (" ").append
						     (Class29.aString263)
						     .append
						     (" ").append
						     (Class154.method2575
						      (i_157_, 12212878))
						     .append
						     (class15.aString122)
						     .toString(),
						 (-731032933
						  * Class460.anInt5069),
						 17, -1,
						 (long) (-400233975
							 * (class534_sub23
							    .anInt10548)),
						 i_127_, i_128_, true, false,
						 (long) i_156_, false,
						 (short) 9619);
				    }
				    if (class550.aClass654_Sub1_7303.aByte10854
					== (Class322
					    .aClass654_Sub1_Sub5_Sub1_Sub2_3419
					    .aByte10854)) {
					String[] strings
					    = class15.aStringArray133;
					for (int i_158_ = strings.length - 1;
					     i_158_ >= 0; i_158_--) {
					    if (null != strings[i_158_]) {
						int i_159_ = 0;
						int i_160_ = (client.anInt11216
							      * 2068410197);
						if (i_158_ == 0)
						    i_159_ = 18;
						if (i_158_ == 1)
						    i_159_ = 19;
						if (2 == i_158_)
						    i_159_ = 20;
						if (i_158_ == 3)
						    i_159_ = 21;
						if (i_158_ == 4)
						    i_159_ = 22;
						if (5 == i_158_)
						    i_159_ = 1004;
						int i_161_
						    = (class15.method701
						       (i_158_, 1163927313));
						if (i_161_ != -1)
						    i_160_ = i_161_;
						Class112.method2016
						    (strings[i_158_],
						     new StringBuilder().append
							 (Class154.method2575
							  (i_157_, 1554391552))
							 .append
							 (class15.aString122)
							 .toString(),
						     i_160_, i_159_, -1,
						     (long) (-400233975
							     * (class534_sub23
								.anInt10548)),
						     i_127_, i_128_, true,
						     false, (long) i_156_,
						     false, (short) 29791);
					    }
					}
				    }
				    class534_sub23
					= ((Class534_Sub23)
					   class534_sub7.aClass700_10418
					       .method14140((byte) 98));
				    i_156_++;
				}
			    }
			}
			if (class550.aClass654_Sub1_7303
			    instanceof Interface62) {
			    Interface62 interface62
				= (Interface62) class550.aClass654_Sub1_7303;
			    Class602 class602
				= (Class602) (client.aClass512_11100.method8428
						  (-1486655428).method91
					      (interface62.method56(208999021),
					       -1535173701));
			    if (null != class602.anIntArray7943)
				class602
				    = class602.method9988((Class78
							   .aClass103_825),
							  (Class78
							   .aClass103_825),
							  -758782446);
			    if (class602 != null) {
				if (client.aBool11218
				    && (class550.aClass654_Sub1_7303.aByte10854
					== (Class322
					    .aClass654_Sub1_Sub5_Sub1_Sub2_3419
					    .aByte10854))) {
				    Class90 class90
					= ((Class90)
					   ((Class392_Sub1.anInt10224
					     * 410979031) != -1
					    ? (Class534_Sub11_Sub13
						   .aClass44_Sub22_11730
						   .method91
					       ((Class392_Sub1.anInt10224
						 * 410979031),
						503453311))
					    : null));
				    if ((Class200_Sub14.anInt9950 * 460977285
					 & 0x4) != 0
					&& (null == class90
					    || ((class602.method9989
						 ((Class392_Sub1.anInt10224
						   * 410979031),
						  263946597 * class90.anInt888,
						  (byte) 38))
						!= (class90.anInt888
						    * 263946597))))
					Class112.method2016
					    (client.aString11221,
					     new StringBuilder().append
						 (client.aString11222).append
						 (" ").append
						 (Class29.aString263).append
						 (" ").append
						 (Class154.method2575
						  (65535, -1766460722))
						 .append
						 (class602.aString7892)
						 .toString(),
					     -731032933 * Class460.anInt5069,
					     2, -1,
					     Class551.method9046(interface62,
								 i_127_,
								 i_128_,
								 468659320),
					     i_127_, i_128_, true, false,
					     (long) interface62.hashCode(),
					     false, (short) 6225);
				}
				if ((Class322
				     .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				     .aByte10854)
				    == (class550.aClass654_Sub1_7303
					.aByte10854)) {
				    String[] strings
					= class602.aStringArray7920;
				    if (null != strings) {
					for (int i_162_ = strings.length - 1;
					     i_162_ >= 0; i_162_--) {
					    if (strings[i_162_] != null) {
						int i_163_ = 0;
						int i_164_ = (client.anInt11216
							      * 2068410197);
						if (0 == i_162_)
						    i_163_ = 3;
						if (i_162_ == 1)
						    i_163_ = 4;
						if (i_162_ == 2)
						    i_163_ = 5;
						if (i_162_ == 3)
						    i_163_ = 6;
						if (i_162_ == 4)
						    i_163_ = 1001;
						if (5 == i_162_)
						    i_163_ = 1002;
						int i_165_
						    = (class602.method9985
						       (i_162_, 1848117621));
						if (-1 != i_165_)
						    i_164_ = i_165_;
						Class112.method2016
						    (strings[i_162_],
						     new StringBuilder().append
							 (Class154.method2575
							  (65535, 1446726318))
							 .append
							 (class602.aString7892)
							 .toString(),
						     i_164_, i_163_, -1,
						     (Class551.method9046
						      (interface62, i_127_,
						       i_128_, 468659320)),
						     i_127_, i_128_, true,
						     false,
						     (long) interface62
								.hashCode(),
						     false, (short) 21385);
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
    }
    
    public static String method1441(Class534_Sub18_Sub7 class534_sub18_sub7) {
	if (aBool758 || null == class534_sub18_sub7)
	    return "";
	return class534_sub18_sub7.aString11699;
    }
    
    public static void method1442() {
	Class582.method9834((byte) 13);
	aBool758 = false;
	Class316.method5724(Class627.anInt8175 * -620506573,
			    anInt782 * -260575397,
			    -1739196959 * Class641.anInt8340,
			    -577412881 * Class327_Sub1.anInt9991, (byte) 1);
	Class251.aClass534_Sub18_Sub7_2653 = null;
	Class271.aClass534_Sub18_Sub7_2963 = null;
    }
    
    public static boolean method1443(int i, int i_166_) {
	if (!aBool758)
	    return false;
	int i_167_ = i >> 16;
	int i_168_ = i & 0xffff;
	if (null == Class44_Sub11.aClass243Array11006[i_167_]
	    || null == (Class44_Sub11.aClass243Array11006[i_167_]
			.aClass247Array2412[i_168_]))
	    return false;
	Class247 class247 = (Class44_Sub11.aClass243Array11006[i_167_]
			     .aClass247Array2412[i_168_]);
	if (-1 != i_166_ || 0 != class247.anInt2438 * -1960530827) {
	    for (Class534_Sub18_Sub7 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			aClass700_771.method14135((byte) -1));
		 null != class534_sub18_sub7;
		 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			aClass700_771.method14139(1754457920))) {
		if (i_166_ == class534_sub18_sub7.anInt11703 * 980750511
		    && (class534_sub18_sub7.anInt11704 * -1180225371
			== class247.anInt2454 * -1278450723)
		    && (class534_sub18_sub7.anInt11706 * -1986934021 == 58
			|| 1007 == class534_sub18_sub7.anInt11706 * -1986934021
			|| 25 == -1986934021 * class534_sub18_sub7.anInt11706
			|| 57 == class534_sub18_sub7.anInt11706 * -1986934021
			|| class534_sub18_sub7.anInt11706 * -1986934021 == 30))
		    return true;
	    }
	} else {
	    for (Class534_Sub18_Sub7 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			aClass700_771.method14135((byte) -1));
		 class534_sub18_sub7 != null;
		 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			aClass700_771.method14139(1202101401))) {
		if (58 == class534_sub18_sub7.anInt11706 * -1986934021
		    || class534_sub18_sub7.anInt11706 * -1986934021 == 1007
		    || 25 == class534_sub18_sub7.anInt11706 * -1986934021
		    || 57 == class534_sub18_sub7.anInt11706 * -1986934021
		    || 30 == -1986934021 * class534_sub18_sub7.anInt11706) {
		    for (Class247 class247_169_
			     = Class112.method2017((-1180225371
						    * (class534_sub18_sub7
						       .anInt11704)),
						   638191034);
			 class247_169_ != null;
			 class247_169_
			     = Class578.method9799((Class44_Sub11
						    .aClass243Array11006
						    [(-1278450723
						      * (class247_169_
							 .anInt2454)) >> 16]),
						   class247_169_,
						   -1495101509)) {
			if (-1278450723 * class247.anInt2454
			    == class247_169_.anInt2454 * -1278450723)
			    return true;
		    }
		}
	    }
	}
	return false;
    }
    
    public static void method1444() {
	for (Class534_Sub18_Sub11 class534_sub18_sub11
		 = ((Class534_Sub18_Sub11)
		    aClass696_772.method14078(1221951837));
	     class534_sub18_sub11 != null;
	     class534_sub18_sub11 = ((Class534_Sub18_Sub11)
				     aClass696_772.method14080((byte) 14))) {
	    if (class534_sub18_sub11.anInt11795 * -475442105 > 1) {
		class534_sub18_sub11.anInt11795 = 0;
		aClass203_794.method3893(class534_sub18_sub11,
					 (((Class534_Sub18_Sub7)
					   (class534_sub18_sub11
					    .aClass696_11794
					    .aClass534_Sub18_8785
					    .aClass534_Sub18_10510)).aLong11709
					  * -6387465159951953483L));
		class534_sub18_sub11.aClass696_11794.method14075(958896847);
	    }
	}
	anInt789 = 0;
	anInt765 = 0;
	aClass700_771.method14152(-2105062797);
	aClass9_768.method578((byte) 19);
	aClass696_772.method14075(958896847);
	aBool758 = false;
    }
    
    static void method1445(int i, int i_170_) {
	if (Class620.aClass632_8113.aBool8236
	    || (1 != 324852453 * anInt765
		&& (!Class665.aBool8573 || anInt765 * 324852453 != 2
		    || !(Class331.aClass534_Sub18_Sub7_3496.aString11699.equals
			 (Class58.aClass58_636.method1245((Class539
							   .aClass672_7171),
							  (byte) -51)))))) {
	    Class16 class16 = Class160.method2620(1770101340);
	    int i_171_
		= (class16.method728
		   (Class58.aClass58_468.method1245(Class539.aClass672_7171,
						    (byte) -23),
		    -1741284007));
	    int i_172_;
	    if (!aBool766) {
		for (Class534_Sub18_Sub7 class534_sub18_sub7
			 = ((Class534_Sub18_Sub7)
			    aClass700_771.method14135((byte) -1));
		     null != class534_sub18_sub7;
		     class534_sub18_sub7
			 = ((Class534_Sub18_Sub7)
			    aClass700_771.method14139(1522907953))) {
		    int i_173_ = Class281.method5236(class534_sub18_sub7,
						     class16, -220687097);
		    if (i_173_ > i_171_)
			i_171_ = i_173_;
		}
		i_171_ += 8;
		i_172_ = 324852453 * anInt765 * (-238165825 * anInt754) + 21;
		Class327_Sub1.anInt9991
		    = -441332209 * ((aBool784 ? 26 : 22)
				    + anInt765 * 324852453 * (anInt754
							      * -238165825));
	    } else {
		for (Class534_Sub18_Sub11 class534_sub18_sub11
			 = ((Class534_Sub18_Sub11)
			    aClass696_772.method14078(1221951837));
		     null != class534_sub18_sub11;
		     class534_sub18_sub11
			 = ((Class534_Sub18_Sub11)
			    aClass696_772.method14080((byte) 28))) {
		    int i_174_;
		    if (1 == class534_sub18_sub11.anInt11795 * -475442105)
			i_174_
			    = Class281.method5236(((Class534_Sub18_Sub7)
						   (class534_sub18_sub11
						    .aClass696_11794
						    .aClass534_Sub18_8785
						    .aClass534_Sub18_10510)),
						  class16, -642200390);
		    else
			i_174_
			    = Class583_Sub1.method16304(class534_sub18_sub11,
							class16, 2088438307);
		    if (i_174_ > i_171_)
			i_171_ = i_174_;
		}
		i_171_ += 8;
		i_172_ = 21 + -238165825 * anInt754 * (anInt789 * 1965634793);
		Class327_Sub1.anInt9991
		    = -441332209 * (-238165825 * anInt754 * (1965634793
							     * anInt789)
				    + (aBool784 ? 26 : 22));
	    }
	    i_171_ += 10;
	    int i_175_ = i - i_171_ / 2;
	    if (i_175_ + i_171_ > Class706_Sub4.anInt10994 * 1771907305)
		i_175_ = Class706_Sub4.anInt10994 * 1771907305 - i_171_;
	    if (i_175_ < 0)
		i_175_ = 0;
	    int i_176_ = i_170_;
	    if (i_176_ + i_172_ > -1091172141 * Class18.anInt205)
		i_176_ = Class18.anInt205 * -1091172141 - i_172_;
	    if (i_176_ < 0)
		i_176_ = 0;
	    Class627.anInt8175 = 358840571 * i_175_;
	    anInt782 = -1495881517 * i_176_;
	    Class641.anInt8340 = 1989742113 * i_171_;
	    anInt785 = (int) (Math.random() * 24.0) * -894020657;
	    aBool758 = true;
	}
    }
    
    static void method1446() {
	if (null != aClass534_Sub18_Sub11_760) {
	    aClass534_Sub18_Sub11_760 = null;
	    Class316.method5724(-1803884121 * Class112.anInt1364,
				Class150.anInt1699 * 892411561,
				-2123561997 * Class536_Sub4.anInt10366,
				-417346889 * Class281.anInt3062, (byte) 1);
	}
    }
    
    static void method1447() {
	if (null != aClass534_Sub18_Sub11_760) {
	    aClass534_Sub18_Sub11_760 = null;
	    Class316.method5724(-1803884121 * Class112.anInt1364,
				Class150.anInt1699 * 892411561,
				-2123561997 * Class536_Sub4.anInt10366,
				-417346889 * Class281.anInt3062, (byte) 1);
	}
    }
    
    static void method1448() {
	if (null != aClass534_Sub18_Sub11_760) {
	    aClass534_Sub18_Sub11_760 = null;
	    Class316.method5724(-1803884121 * Class112.anInt1364,
				Class150.anInt1699 * 892411561,
				-2123561997 * Class536_Sub4.anInt10366,
				-417346889 * Class281.anInt3062, (byte) 1);
	}
    }
    
    static int method1449() {
	if (null == client.aClass247_11044) {
	    if (!aBool758) {
		if (Class700.aClass638_8806.aBool8315) {
		    if (Class271.aClass534_Sub18_Sub7_2963 != null)
			return (Class271.aClass534_Sub18_Sub7_2963.anInt11700
				* -1664709445);
		} else if (Class251.aClass534_Sub18_Sub7_2653 != null)
		    return (-1664709445
			    * Class251.aClass534_Sub18_Sub7_2653.anInt11700);
	    } else {
		Class16 class16 = Class160.method2620(1770101340);
		int i = Class81.aClass563_834.method9493(-1611044861);
		int i_177_ = Class81.aClass563_834.method9477(1167018909);
		if (!aBool766) {
		    if (i > -620506573 * Class627.anInt8175
			&& i < (Class627.anInt8175 * -620506573
				+ -1739196959 * Class641.anInt8340)) {
			int i_178_ = -1;
			for (int i_179_ = 0; i_179_ < 324852453 * anInt765;
			     i_179_++) {
			    if (aBool784) {
				int i_180_
				    = ((-238165825 * anInt754
					* (anInt765 * 324852453 - 1 - i_179_))
				       + (1
					  + (-260575397 * anInt782 + 20
					     + 102396103 * class16.anInt190)));
				if (i_177_ > (i_180_
					      - class16.anInt190 * 102396103
					      - 1)
				    && i_177_ < (class16.anInt189 * 728893755
						 + i_180_))
				    i_178_ = i_179_;
			    } else {
				int i_181_ = (31 + anInt782 * -260575397
					      + (-238165825 * anInt754
						 * (anInt765 * 324852453 - 1
						    - i_179_)));
				if (i_177_ > (i_181_
					      - 102396103 * class16.anInt190
					      - 1)
				    && i_177_ < (728893755 * class16.anInt189
						 + i_181_))
				    i_178_ = i_179_;
			    }
			}
			if (-1 != i_178_) {
			    int i_182_ = 0;
			    Class710 class710 = new Class710(aClass700_771);
			    for (Class534_Sub18_Sub7 class534_sub18_sub7
				     = ((Class534_Sub18_Sub7)
					class710.method14308((byte) 21));
				 class534_sub18_sub7 != null;
				 class534_sub18_sub7
				     = (Class534_Sub18_Sub7) class710.next()) {
				if (i_182_++ == i_178_)
				    return (class534_sub18_sub7.anInt11700
					    * -1664709445);
			    }
			}
		    }
		} else if (i > -620506573 * Class627.anInt8175
			   && i < (Class627.anInt8175 * -620506573
				   + -1739196959 * Class641.anInt8340)) {
		    int i_183_ = -1;
		    for (int i_184_ = 0; i_184_ < 1965634793 * anInt789;
			 i_184_++) {
			if (aBool784) {
			    int i_185_ = (1
					  + (-260575397 * anInt782 + 20
					     + 102396103 * class16.anInt190)
					  + anInt754 * -238165825 * i_184_);
			    if ((i_177_
				 > i_185_ - class16.anInt190 * 102396103 - 1)
				&& (i_177_
				    < class16.anInt189 * 728893755 + i_185_))
				i_183_ = i_184_;
			} else {
			    int i_186_ = (31 + anInt782 * -260575397
					  + anInt754 * -238165825 * i_184_);
			    if ((i_177_
				 > i_186_ - class16.anInt190 * 102396103 - 1)
				&& (i_177_
				    < i_186_ + class16.anInt189 * 728893755))
				i_183_ = i_184_;
			}
		    }
		    if (-1 != i_183_) {
			int i_187_ = 0;
			Class694 class694 = new Class694(aClass696_772);
			for (Class534_Sub18_Sub11 class534_sub18_sub11
				 = ((Class534_Sub18_Sub11)
				    class694.method14068((byte) -101));
			     null != class534_sub18_sub11;
			     class534_sub18_sub11
				 = (Class534_Sub18_Sub11) class694.next()) {
			    if (i_187_++ == i_183_)
				return (((Class534_Sub18_Sub7)
					 (class534_sub18_sub11.aClass696_11794
					  .aClass534_Sub18_8785
					  .aClass534_Sub18_10510)).anInt11700
					* -1664709445);
			}
		    }
		} else if (null != aClass534_Sub18_Sub11_760
			   && i > Class112.anInt1364 * -1803884121
			   && i < (Class536_Sub4.anInt10366 * -2123561997
				   + Class112.anInt1364 * -1803884121)) {
		    int i_188_ = -1;
		    for (int i_189_ = 0;
			 (i_189_
			  < aClass534_Sub18_Sub11_760.anInt11795 * -475442105);
			 i_189_++) {
			if (aBool784) {
			    int i_190_
				= (-238165825 * anInt754 * i_189_
				   + (class16.anInt190 * 102396103
				      + (20 + Class150.anInt1699 * 892411561)
				      + 1));
			    if ((i_177_
				 > i_190_ - 102396103 * class16.anInt190 - 1)
				&& (i_177_
				    < i_190_ + class16.anInt189 * 728893755))
				i_188_ = i_189_;
			} else {
			    int i_191_
				= (-238165825 * anInt754 * i_189_
				   + (892411561 * Class150.anInt1699 + 31));
			    if ((i_177_
				 > i_191_ - 102396103 * class16.anInt190 - 1)
				&& (i_177_
				    < i_191_ + 728893755 * class16.anInt189))
				i_188_ = i_189_;
			}
		    }
		    if (i_188_ != -1) {
			int i_192_ = 0;
			Class694 class694
			    = new Class694(aClass534_Sub18_Sub11_760
					   .aClass696_11794);
			for (Class534_Sub18_Sub7 class534_sub18_sub7
				 = ((Class534_Sub18_Sub7)
				    class694.method14068((byte) 47));
			     class534_sub18_sub7 != null;
			     class534_sub18_sub7
				 = (Class534_Sub18_Sub7) class694.next()) {
			    if (i_192_++ == i_188_)
				return (-1664709445
					* class534_sub18_sub7.anInt11700);
			}
		    }
		}
	    }
	}
	return -1;
    }
    
    static void method1450(int i, int i_193_) {
	if (Class620.aClass632_8113.aBool8236
	    || (1 != 324852453 * anInt765
		&& (!Class665.aBool8573 || anInt765 * 324852453 != 2
		    || !(Class331.aClass534_Sub18_Sub7_3496.aString11699.equals
			 (Class58.aClass58_636.method1245((Class539
							   .aClass672_7171),
							  (byte) -59)))))) {
	    Class16 class16 = Class160.method2620(1770101340);
	    int i_194_
		= (class16.method728
		   (Class58.aClass58_468.method1245(Class539.aClass672_7171,
						    (byte) -18),
		    -1972034151));
	    int i_195_;
	    if (!aBool766) {
		for (Class534_Sub18_Sub7 class534_sub18_sub7
			 = ((Class534_Sub18_Sub7)
			    aClass700_771.method14135((byte) -1));
		     null != class534_sub18_sub7;
		     class534_sub18_sub7
			 = ((Class534_Sub18_Sub7)
			    aClass700_771.method14139(1799894687))) {
		    int i_196_ = Class281.method5236(class534_sub18_sub7,
						     class16, 3322635);
		    if (i_196_ > i_194_)
			i_194_ = i_196_;
		}
		i_194_ += 8;
		i_195_ = 324852453 * anInt765 * (-238165825 * anInt754) + 21;
		Class327_Sub1.anInt9991
		    = -441332209 * ((aBool784 ? 26 : 22)
				    + anInt765 * 324852453 * (anInt754
							      * -238165825));
	    } else {
		for (Class534_Sub18_Sub11 class534_sub18_sub11
			 = ((Class534_Sub18_Sub11)
			    aClass696_772.method14078(1221951837));
		     null != class534_sub18_sub11;
		     class534_sub18_sub11
			 = ((Class534_Sub18_Sub11)
			    aClass696_772.method14080((byte) 113))) {
		    int i_197_;
		    if (1 == class534_sub18_sub11.anInt11795 * -475442105)
			i_197_
			    = Class281.method5236(((Class534_Sub18_Sub7)
						   (class534_sub18_sub11
						    .aClass696_11794
						    .aClass534_Sub18_8785
						    .aClass534_Sub18_10510)),
						  class16, -243879894);
		    else
			i_197_
			    = Class583_Sub1.method16304(class534_sub18_sub11,
							class16, 2088438307);
		    if (i_197_ > i_194_)
			i_194_ = i_197_;
		}
		i_194_ += 8;
		i_195_ = 21 + -238165825 * anInt754 * (anInt789 * 1965634793);
		Class327_Sub1.anInt9991
		    = -441332209 * (-238165825 * anInt754 * (1965634793
							     * anInt789)
				    + (aBool784 ? 26 : 22));
	    }
	    i_194_ += 10;
	    int i_198_ = i - i_194_ / 2;
	    if (i_198_ + i_194_ > Class706_Sub4.anInt10994 * 1771907305)
		i_198_ = Class706_Sub4.anInt10994 * 1771907305 - i_194_;
	    if (i_198_ < 0)
		i_198_ = 0;
	    int i_199_ = i_193_;
	    if (i_199_ + i_195_ > -1091172141 * Class18.anInt205)
		i_199_ = Class18.anInt205 * -1091172141 - i_195_;
	    if (i_199_ < 0)
		i_199_ = 0;
	    Class627.anInt8175 = 358840571 * i_198_;
	    anInt782 = -1495881517 * i_199_;
	    Class641.anInt8340 = 1989742113 * i_194_;
	    anInt785 = (int) (Math.random() * 24.0) * -894020657;
	    aBool758 = true;
	}
    }
    
    Class72() throws Throwable {
	throw new Error();
    }
    
    static void method1451(Class534_Sub18_Sub7 class534_sub18_sub7) {
	if (class534_sub18_sub7 != null) {
	    aClass700_771.method14131(class534_sub18_sub7, (short) 789);
	    anInt765 += 914117357;
	    Object object = null;
	    Class534_Sub18_Sub11 class534_sub18_sub11;
	    if (!class534_sub18_sub7.aBool11707
		&& !"".equals(class534_sub18_sub7.aString11708)) {
		long l
		    = -6387465159951953483L * class534_sub18_sub7.aLong11709;
		for (class534_sub18_sub11
			 = (Class534_Sub18_Sub11) aClass9_768.method579(l);
		     (class534_sub18_sub11 != null
		      && !class534_sub18_sub11.aString11793
			      .equals(class534_sub18_sub7.aString11708));
		     class534_sub18_sub11
			 = ((Class534_Sub18_Sub11)
			    aClass9_768.method582(750887724))) {
		    /* empty */
		}
		if (null == class534_sub18_sub11) {
		    class534_sub18_sub11
			= (Class534_Sub18_Sub11) aClass203_794.method3871(l);
		    if (class534_sub18_sub11 != null
			&& !class534_sub18_sub11.aString11793
				.equals(class534_sub18_sub7.aString11708))
			class534_sub18_sub11 = null;
		    if (null == class534_sub18_sub11)
			class534_sub18_sub11
			    = new Class534_Sub18_Sub11(class534_sub18_sub7
						       .aString11708);
		    aClass9_768.method581(class534_sub18_sub11, l);
		    anInt789 += -210574503;
		}
	    } else {
		class534_sub18_sub11
		    = new Class534_Sub18_Sub11(class534_sub18_sub7
					       .aString11708);
		anInt789 += -210574503;
	    }
	    if (class534_sub18_sub11.method18343(class534_sub18_sub7,
						 2005653935))
		Class526.method8761(class534_sub18_sub11, -26193475);
	}
    }
    
    static void method1452(Class534_Sub18_Sub7 class534_sub18_sub7) {
	if (class534_sub18_sub7 != null) {
	    aClass700_771.method14131(class534_sub18_sub7, (short) 789);
	    anInt765 += 914117357;
	    Object object = null;
	    Class534_Sub18_Sub11 class534_sub18_sub11;
	    if (!class534_sub18_sub7.aBool11707
		&& !"".equals(class534_sub18_sub7.aString11708)) {
		long l
		    = -6387465159951953483L * class534_sub18_sub7.aLong11709;
		for (class534_sub18_sub11
			 = (Class534_Sub18_Sub11) aClass9_768.method579(l);
		     (class534_sub18_sub11 != null
		      && !class534_sub18_sub11.aString11793
			      .equals(class534_sub18_sub7.aString11708));
		     class534_sub18_sub11
			 = ((Class534_Sub18_Sub11)
			    aClass9_768.method582(749260074))) {
		    /* empty */
		}
		if (null == class534_sub18_sub11) {
		    class534_sub18_sub11
			= (Class534_Sub18_Sub11) aClass203_794.method3871(l);
		    if (class534_sub18_sub11 != null
			&& !class534_sub18_sub11.aString11793
				.equals(class534_sub18_sub7.aString11708))
			class534_sub18_sub11 = null;
		    if (null == class534_sub18_sub11)
			class534_sub18_sub11
			    = new Class534_Sub18_Sub11(class534_sub18_sub7
						       .aString11708);
		    aClass9_768.method581(class534_sub18_sub11, l);
		    anInt789 += -210574503;
		}
	    } else {
		class534_sub18_sub11
		    = new Class534_Sub18_Sub11(class534_sub18_sub7
					       .aString11708);
		anInt789 += -210574503;
	    }
	    if (class534_sub18_sub11.method18343(class534_sub18_sub7,
						 2005653935))
		Class526.method8761(class534_sub18_sub11, -26193475);
	}
    }
    
    static void method1453(Class534_Sub18_Sub7 class534_sub18_sub7) {
	if (class534_sub18_sub7 != null) {
	    aClass700_771.method14131(class534_sub18_sub7, (short) 789);
	    anInt765 += 914117357;
	    Object object = null;
	    Class534_Sub18_Sub11 class534_sub18_sub11;
	    if (!class534_sub18_sub7.aBool11707
		&& !"".equals(class534_sub18_sub7.aString11708)) {
		long l
		    = -6387465159951953483L * class534_sub18_sub7.aLong11709;
		for (class534_sub18_sub11
			 = (Class534_Sub18_Sub11) aClass9_768.method579(l);
		     (class534_sub18_sub11 != null
		      && !class534_sub18_sub11.aString11793
			      .equals(class534_sub18_sub7.aString11708));
		     class534_sub18_sub11
			 = ((Class534_Sub18_Sub11)
			    aClass9_768.method582(1039236378))) {
		    /* empty */
		}
		if (null == class534_sub18_sub11) {
		    class534_sub18_sub11
			= (Class534_Sub18_Sub11) aClass203_794.method3871(l);
		    if (class534_sub18_sub11 != null
			&& !class534_sub18_sub11.aString11793
				.equals(class534_sub18_sub7.aString11708))
			class534_sub18_sub11 = null;
		    if (null == class534_sub18_sub11)
			class534_sub18_sub11
			    = new Class534_Sub18_Sub11(class534_sub18_sub7
						       .aString11708);
		    aClass9_768.method581(class534_sub18_sub11, l);
		    anInt789 += -210574503;
		}
	    } else {
		class534_sub18_sub11
		    = new Class534_Sub18_Sub11(class534_sub18_sub7
					       .aString11708);
		anInt789 += -210574503;
	    }
	    if (class534_sub18_sub11.method18343(class534_sub18_sub7,
						 2005653935))
		Class526.method8761(class534_sub18_sub11, -26193475);
	}
    }
    
    static void method1454(Class433 class433) {
	aClass433_787.method6842(class433);
    }
    
    static boolean method1455(int i) {
	if (i == 3 || i == 4 || 5 == i || 6 == i || i == 1001 || i == 1002)
	    return true;
	if (i == 2)
	    return true;
	return false;
    }
    
    static void method1456(Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1) {
	if (class654_sub1_sub5_sub1 instanceof Class654_Sub1_Sub5_Sub1_Sub1) {
	    Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
		= (Class654_Sub1_Sub5_Sub1_Sub1) class654_sub1_sub5_sub1;
	    if (class654_sub1_sub5_sub1_sub1.aClass307_12204 != null)
		Class276.method5155(class654_sub1_sub5_sub1_sub1,
				    ((Class322
				      .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				      .aByte10854)
				     != (class654_sub1_sub5_sub1_sub1
					 .aByte10854)),
				    1072952927);
	} else if (class654_sub1_sub5_sub1
		   instanceof Class654_Sub1_Sub5_Sub1_Sub2) {
	    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		= (Class654_Sub1_Sub5_Sub1_Sub2) class654_sub1_sub5_sub1;
	    Class294.method5319(class654_sub1_sub5_sub1_sub2,
				((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
				  .aByte10854)
				 != class654_sub1_sub5_sub1_sub2.aByte10854),
				(byte) 87);
	}
    }
    
    static void method1457(Class185 class185) {
	if (aClass433_762 != null) {
	    class185.method3338(aClass433_762);
	    class185.method3335(aClass446_783);
	    class185.method3373(894945745 * anInt777, -655548783 * anInt778,
				1852547097 * anInt779 + anInt777 * 894945745,
				(anInt778 * -655548783
				 + anInt780 * -1954074475));
	    class185.method3318(894945745 * anInt777, -655548783 * anInt778,
				1852547097 * anInt779, -1954074475 * anInt780);
	}
    }
    
    static boolean method1458(Interface65 interface65,
			      Class534_Sub42 class534_sub42) {
	return (interface65 != null
		&& interface65.method437(class534_sub42,
					 client.anInterface63Array11070,
					 -2064179505 * client.anInt11199,
					 Class666.aClass547_8577,
					 -2087466213));
    }
    
    static void method1459(Class446 class446, Class433 class433, int i,
			   int i_200_) {
	if (aClass433_762 == null)
	    aClass433_762 = new Class433(class433);
	else
	    aClass433_762.method6842(class433);
	aClass446_783.method7236(class446);
	anInt779 = 1658436649 * i;
	anInt780 = -1631970627 * i_200_;
    }
    
    public static boolean method1460(int i) {
	for (Class534_Sub18_Sub7 class534_sub18_sub7
		 = (Class534_Sub18_Sub7) aClass700_771.method14135((byte) -1);
	     class534_sub18_sub7 != null;
	     class534_sub18_sub7 = ((Class534_Sub18_Sub7)
				    aClass700_771.method14139(1066206131))) {
	    if (Class534_Sub4.method16039((class534_sub18_sub7.anInt11706
					   * -1986934021),
					  -1992763111)
		&& ((long) i
		    == class534_sub18_sub7.aLong11702 * -7225575275964615095L))
		return true;
	}
	return false;
    }
    
    static int[] method1461(Class534_Sub18_Sub7 class534_sub18_sub7) {
	int[] is = null;
	if (Class698.method14124(-1986934021 * class534_sub18_sub7.anInt11706,
				 1024308122))
	    is = ((Class15) (Class531.aClass44_Sub7_7135.method91
			     ((int) (-7225575275964615095L
				     * class534_sub18_sub7.aLong11702),
			      -1723621562))).anIntArray177;
	else if (-1603986365 * class534_sub18_sub7.anInt11698 != -1)
	    is = (((Class15)
		   Class531.aClass44_Sub7_7135.method91(((class534_sub18_sub7
							  .anInt11698)
							 * -1603986365),
							-1945905295))
		  .anIntArray177);
	else if (Class534_Sub4.method16039((-1986934021
					    * class534_sub18_sub7.anInt11706),
					   -1409035839)) {
	    Class534_Sub6 class534_sub6
		= ((Class534_Sub6)
		   (client.aClass9_11331.method579
		    ((long) (int) (-7225575275964615095L
				   * class534_sub18_sub7.aLong11702))));
	    if (null != class534_sub6) {
		Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
		    = ((Class654_Sub1_Sub5_Sub1_Sub1)
		       class534_sub6.anObject10417);
		Class307 class307
		    = class654_sub1_sub5_sub1_sub1.aClass307_12204;
		if (null != class307.anIntArray3284)
		    class307 = class307.method5615(Class78.aClass103_825,
						   Class78.aClass103_825,
						   -1466068515);
		if (class307 != null)
		    is = class307.anIntArray3339;
	    }
	} else if (Class421.method6783((-1986934021
					* class534_sub18_sub7.anInt11706),
				       (byte) -59)) {
	    Class602 class602
		= ((Class602)
		   (client.aClass512_11100.method8428(-1486655428).method91
		    ((int) ((class534_sub18_sub7.aLong11702
			     * -7225575275964615095L) >>> 32
			    & 0x7fffffffL),
		     580601242)));
	    if (null != class602.anIntArray7943)
		class602
		    = class602.method9988(Class78.aClass103_825,
					  Class78.aClass103_825, 851266163);
	    if (null != class602)
		is = class602.anIntArray7958;
	}
	return is;
    }
    
    static void method1462(Class534_Sub18_Sub7 class534_sub18_sub7) {
	if (!aBool758) {
	    class534_sub18_sub7.method8892((byte) 1);
	    anInt765 -= 914117357;
	    if (!class534_sub18_sub7.aBool11707) {
		long l
		    = class534_sub18_sub7.aLong11709 * -6387465159951953483L;
		Class534_Sub18_Sub11 class534_sub18_sub11;
		for (class534_sub18_sub11
			 = (Class534_Sub18_Sub11) aClass9_768.method579(l);
		     (null != class534_sub18_sub11
		      && !class534_sub18_sub11.aString11793
			      .equals(class534_sub18_sub7.aString11708));
		     class534_sub18_sub11
			 = ((Class534_Sub18_Sub11)
			    aClass9_768.method582(1194713768))) {
		    /* empty */
		}
		if (class534_sub18_sub11 != null
		    && class534_sub18_sub11.method18347(class534_sub18_sub7,
							-1226459794))
		    Class526.method8761(class534_sub18_sub11, -26193475);
	    } else {
		for (Class534_Sub18_Sub11 class534_sub18_sub11
			 = ((Class534_Sub18_Sub11)
			    aClass696_772.method14078(1221951837));
		     null != class534_sub18_sub11;
		     class534_sub18_sub11
			 = ((Class534_Sub18_Sub11)
			    aClass696_772.method14080((byte) 120))) {
		    if (class534_sub18_sub11.aString11793
			    .equals(class534_sub18_sub7.aString11708)) {
			boolean bool = false;
			for (Class534_Sub18_Sub7 class534_sub18_sub7_201_
				 = ((Class534_Sub18_Sub7)
				    class534_sub18_sub11.aClass696_11794
					.method14078(1221951837));
			     null != class534_sub18_sub7_201_;
			     class534_sub18_sub7_201_
				 = ((Class534_Sub18_Sub7)
				    class534_sub18_sub11.aClass696_11794
					.method14080((byte) 12))) {
			    if (class534_sub18_sub7_201_
				== class534_sub18_sub7) {
				if (class534_sub18_sub11.method18347
				    (class534_sub18_sub7, -1226459794))
				    Class526.method8761(class534_sub18_sub11,
							-26193475);
				bool = true;
				break;
			    }
			}
			if (bool)
			    break;
		    }
		}
	    }
	}
    }
    
    static void method1463(Class534_Sub18_Sub11 class534_sub18_sub11, int i) {
	if (aBool758) {
	    Class16 class16 = Class160.method2620(1770101340);
	    int i_202_ = 0;
	    for (Class534_Sub18_Sub7 class534_sub18_sub7
		     = (Class534_Sub18_Sub7) class534_sub18_sub11
						 .aClass696_11794
						 .method14078(1221951837);
		 null != class534_sub18_sub7;
		 class534_sub18_sub7
		     = (Class534_Sub18_Sub7) class534_sub18_sub11
						 .aClass696_11794
						 .method14080((byte) 80)) {
		int i_203_ = Class281.method5236(class534_sub18_sub7, class16,
						 -1481029529);
		if (i_203_ > i_202_)
		    i_202_ = i_203_;
	    }
	    i_202_ += 8;
	    int i_204_
		= 21 + (-238165825 * anInt754
			* (-475442105 * class534_sub18_sub11.anInt11795));
	    Class281.anInt3062
		= (2050568967
		   * (-238165825 * anInt754 * (class534_sub18_sub11.anInt11795
					       * -475442105)
		      + (aBool784 ? 26 : 22)));
	    int i_205_ = (Class641.anInt8340 * -1739196959
			  + Class627.anInt8175 * -620506573);
	    if (i_205_ + i_202_ > 1771907305 * Class706_Sub4.anInt10994)
		i_205_ = -620506573 * Class627.anInt8175 - i_202_;
	    if (i_205_ < 0)
		i_205_ = 0;
	    int i_206_
		= aBool784 ? 1 + (102396103 * class16.anInt190 + 20) : 31;
	    int i_207_ = 1 + (i - i_206_ + 102396103 * class16.anInt190);
	    if (i_207_ + i_204_ > Class18.anInt205 * -1091172141)
		i_207_ = -1091172141 * Class18.anInt205 - i_204_;
	    if (i_207_ < 0)
		i_207_ = 0;
	    Class112.anInt1364 = -228643305 * i_205_;
	    Class150.anInt1699 = i_207_ * 1135371673;
	    Class536_Sub4.anInt10366 = i_202_ * 1938836795;
	    aClass534_Sub18_Sub11_760 = class534_sub18_sub11;
	}
    }
    
    static void method1464(int i) {
	for (Class534_Sub18_Sub7 class534_sub18_sub7
		 = (Class534_Sub18_Sub7) aClass700_771.method14135((byte) -1);
	     class534_sub18_sub7 != null;
	     class534_sub18_sub7 = ((Class534_Sub18_Sub7)
				    aClass700_771.method14139(849022880))) {
	    if (Class591.method9883((-1986934021
				     * class534_sub18_sub7.anInt11706),
				    (byte) 35)
		&& class534_sub18_sub7.anInt11704 * -1180225371 >> 16 == i)
		Class70.method1408(class534_sub18_sub7, 964453300);
	}
    }
    
    static void method1465(Class247 class247, int i, int i_208_) {
	aClass247_774 = class247;
	anInt759 = i * 1370224745;
	anInt776 = -590395525 * i_208_;
    }
    
    public static boolean method1466(int i) {
	for (Class534_Sub18_Sub7 class534_sub18_sub7
		 = (Class534_Sub18_Sub7) aClass700_771.method14135((byte) -1);
	     class534_sub18_sub7 != null;
	     class534_sub18_sub7 = ((Class534_Sub18_Sub7)
				    aClass700_771.method14139(2072188171))) {
	    if (Class534_Sub4.method16039((class534_sub18_sub7.anInt11706
					   * -1986934021),
					  -1484398241)
		&& ((long) i
		    == class534_sub18_sub7.aLong11702 * -7225575275964615095L))
		return true;
	}
	return false;
    }
    
    public static boolean method1467(int i) {
	for (Class534_Sub18_Sub7 class534_sub18_sub7
		 = (Class534_Sub18_Sub7) aClass700_771.method14135((byte) -1);
	     class534_sub18_sub7 != null;
	     class534_sub18_sub7 = ((Class534_Sub18_Sub7)
				    aClass700_771.method14139(1439814755))) {
	    if (Class534_Sub4.method16039((class534_sub18_sub7.anInt11706
					   * -1986934021),
					  -649246094)
		&& ((long) i
		    == class534_sub18_sub7.aLong11702 * -7225575275964615095L))
		return true;
	}
	return false;
    }
    
    public static boolean method1468(int i) {
	for (Class534_Sub18_Sub7 class534_sub18_sub7
		 = (Class534_Sub18_Sub7) aClass700_771.method14135((byte) -1);
	     class534_sub18_sub7 != null;
	     class534_sub18_sub7 = ((Class534_Sub18_Sub7)
				    aClass700_771.method14139(1686533079))) {
	    if (Class534_Sub4.method16039((class534_sub18_sub7.anInt11706
					   * -1986934021),
					  -738964895)
		&& ((long) i
		    == class534_sub18_sub7.aLong11702 * -7225575275964615095L))
		return true;
	}
	return false;
    }
    
    static void method1469() {
	Class62.aClass534_Sub18_Sub7_650
	    = new Class534_Sub18_Sub7((Class58.aClass58_554.method1245
				       (Class539.aClass672_7171, (byte) -1)),
				      "", 846725895 * client.anInt11215, 1006,
				      -1, 0L, 0, 0, true, false, 0L, true);
    }
    
    static boolean method1470(int i) {
	return (i == 44 || 45 == i || i == 46 || i == 47 || i == 48 || i == 49
		|| i == 50 || i == 51 || i == 52 || i == 53 || i == 15);
    }
    
    static boolean method1471() {
	return anInt765 * 324852453 > 0;
    }
    
    static boolean method1472() {
	return anInt765 * 324852453 > 0;
    }
    
    static void method1473(Class185 class185) {
	if (aBool758)
	    Class596.method9917(class185, (byte) -126);
	else
	    Class620.method10275(class185, 1806503966);
    }
    
    static void method1474(Class185 class185) {
	if (aBool758)
	    Class596.method9917(class185, (byte) -20);
	else
	    Class620.method10275(class185, -110313949);
    }
    
    static void method1475() {
	for (Class534_Sub18_Sub11 class534_sub18_sub11
		 = ((Class534_Sub18_Sub11)
		    aClass696_772.method14078(1221951837));
	     null != class534_sub18_sub11;
	     class534_sub18_sub11 = ((Class534_Sub18_Sub11)
				     aClass696_772.method14080((byte) 51))) {
	    if (class534_sub18_sub11.anInt11795 * -475442105 > 1) {
		class534_sub18_sub11.anInt11795 = 0;
		aClass203_794.method3893(class534_sub18_sub11,
					 (((Class534_Sub18_Sub7)
					   (class534_sub18_sub11
					    .aClass696_11794
					    .aClass534_Sub18_8785
					    .aClass534_Sub18_10510)).aLong11709
					  * -6387465159951953483L));
		class534_sub18_sub11.aClass696_11794.method14075(958896847);
	    }
	}
	anInt789 = 0;
	anInt765 = 0;
	aClass700_771.method14152(-2075475000);
	aClass9_768.method578((byte) 0);
	aClass696_772.method14075(958896847);
	Class517.method8636(Class62.aClass534_Sub18_Sub7_650, (byte) 0);
    }
    
    static void method1476() {
	for (Class534_Sub18_Sub11 class534_sub18_sub11
		 = ((Class534_Sub18_Sub11)
		    aClass696_772.method14078(1221951837));
	     null != class534_sub18_sub11;
	     class534_sub18_sub11 = ((Class534_Sub18_Sub11)
				     aClass696_772.method14080((byte) 31))) {
	    if (class534_sub18_sub11.anInt11795 * -475442105 > 1) {
		class534_sub18_sub11.anInt11795 = 0;
		aClass203_794.method3893(class534_sub18_sub11,
					 (((Class534_Sub18_Sub7)
					   (class534_sub18_sub11
					    .aClass696_11794
					    .aClass534_Sub18_8785
					    .aClass534_Sub18_10510)).aLong11709
					  * -6387465159951953483L));
		class534_sub18_sub11.aClass696_11794.method14075(958896847);
	    }
	}
	anInt789 = 0;
	anInt765 = 0;
	aClass700_771.method14152(-1023287104);
	aClass9_768.method578((byte) -100);
	aClass696_772.method14075(958896847);
	Class517.method8636(Class62.aClass534_Sub18_Sub7_650, (byte) 0);
    }
    
    static void method1477() {
	for (Class534_Sub18_Sub11 class534_sub18_sub11
		 = ((Class534_Sub18_Sub11)
		    aClass696_772.method14078(1221951837));
	     null != class534_sub18_sub11;
	     class534_sub18_sub11 = ((Class534_Sub18_Sub11)
				     aClass696_772.method14080((byte) 77))) {
	    if (class534_sub18_sub11.anInt11795 * -475442105 > 1) {
		class534_sub18_sub11.anInt11795 = 0;
		aClass203_794.method3893(class534_sub18_sub11,
					 (((Class534_Sub18_Sub7)
					   (class534_sub18_sub11
					    .aClass696_11794
					    .aClass534_Sub18_8785
					    .aClass534_Sub18_10510)).aLong11709
					  * -6387465159951953483L));
		class534_sub18_sub11.aClass696_11794.method14075(958896847);
	    }
	}
	anInt789 = 0;
	anInt765 = 0;
	aClass700_771.method14152(-1469986839);
	aClass9_768.method578((byte) -57);
	aClass696_772.method14075(958896847);
	Class517.method8636(Class62.aClass534_Sub18_Sub7_650, (byte) 0);
    }
    
    public static void method1478() {
	for (Class534_Sub18_Sub11 class534_sub18_sub11
		 = ((Class534_Sub18_Sub11)
		    aClass696_772.method14078(1221951837));
	     class534_sub18_sub11 != null;
	     class534_sub18_sub11 = ((Class534_Sub18_Sub11)
				     aClass696_772.method14080((byte) 13))) {
	    if (class534_sub18_sub11.anInt11795 * -475442105 > 1) {
		class534_sub18_sub11.anInt11795 = 0;
		aClass203_794.method3893(class534_sub18_sub11,
					 (((Class534_Sub18_Sub7)
					   (class534_sub18_sub11
					    .aClass696_11794
					    .aClass534_Sub18_8785
					    .aClass534_Sub18_10510)).aLong11709
					  * -6387465159951953483L));
		class534_sub18_sub11.aClass696_11794.method14075(958896847);
	    }
	}
	anInt789 = 0;
	anInt765 = 0;
	aClass700_771.method14152(-1930252540);
	aClass9_768.method578((byte) -49);
	aClass696_772.method14075(958896847);
	aBool758 = false;
    }
    
    public static void method1479() {
	for (Class534_Sub18_Sub11 class534_sub18_sub11
		 = ((Class534_Sub18_Sub11)
		    aClass696_772.method14078(1221951837));
	     class534_sub18_sub11 != null;
	     class534_sub18_sub11 = ((Class534_Sub18_Sub11)
				     aClass696_772.method14080((byte) 123))) {
	    if (class534_sub18_sub11.anInt11795 * -475442105 > 1) {
		class534_sub18_sub11.anInt11795 = 0;
		aClass203_794.method3893(class534_sub18_sub11,
					 (((Class534_Sub18_Sub7)
					   (class534_sub18_sub11
					    .aClass696_11794
					    .aClass534_Sub18_8785
					    .aClass534_Sub18_10510)).aLong11709
					  * -6387465159951953483L));
		class534_sub18_sub11.aClass696_11794.method14075(958896847);
	    }
	}
	anInt789 = 0;
	anInt765 = 0;
	aClass700_771.method14152(-1903290335);
	aClass9_768.method578((byte) 71);
	aClass696_772.method14075(958896847);
	aBool758 = false;
    }
    
    public static String method1480(Class534_Sub18_Sub7 class534_sub18_sub7) {
	if (aBool758 || null == class534_sub18_sub7)
	    return "";
	return class534_sub18_sub7.aString11699;
    }
    
    static void method1481
	(Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1,
	 boolean bool) {
	if (324852453 * anInt765 < 407) {
	    Class307 class307 = class654_sub1_sub5_sub1_sub1.aClass307_12204;
	    String string = class654_sub1_sub5_sub1_sub1.aString12201;
	    if (null != class307.anIntArray3284) {
		class307
		    = class307.method5615(Class78.aClass103_825,
					  Class78.aClass103_825, -1466068515);
		if (class307 == null)
		    return;
		string = class307.aString3337;
	    }
	    if (class307.aBool3313) {
		if (class654_sub1_sub5_sub1_sub1.anInt12192 * 1691897137
		    != 0) {
		    String string_209_
			= (client.aClass675_11016 == Class675.aClass675_8635
			   ? Class58.aClass58_597.method1245((Class539
							      .aClass672_7171),
							     (byte) -110)
			   : Class58.aClass58_595.method1245((Class539
							      .aClass672_7171),
							     (byte) -109));
		    string = new StringBuilder().append(string).append
				 (Class292.method5304
				  ((class654_sub1_sub5_sub1_sub1.anInt12192
				    * 1691897137),
				   (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
				    .anInt12210) * 1423663301,
				   -1870439872))
				 .append
				 (Class29.aString261).append
				 (string_209_).append
				 (1691897137
				  * class654_sub1_sub5_sub1_sub1.anInt12192)
				 .append
				 (Class29.aString259).toString();
		}
		if (client.aBool11218 && !bool) {
		    Class90 class90
			= (Class90) (-1 != 410979031 * Class392_Sub1.anInt10224
				     ? (Class534_Sub11_Sub13
					    .aClass44_Sub22_11730.method91
					(Class392_Sub1.anInt10224 * 410979031,
					 378045746))
				     : null);
		    if (0 != (Class200_Sub14.anInt9950 * 460977285 & 0x2)
			&& (class90 == null
			    || (class307.method5613((Class392_Sub1.anInt10224
						     * 410979031),
						    (class90.anInt888
						     * 263946597),
						    -1740620252)
				!= class90.anInt888 * 263946597)))
			Class112.method2016
			    (client.aString11221,
			     new StringBuilder().append
				 (client.aString11222).append
				 (" ").append
				 (Class29.aString263).append
				 (" ").append
				 (Class154.method2575(16776960, -715853477))
				 .append
				 (string).toString(),
			     Class460.anInt5069 * -731032933, 8, -1,
			     (long) (1126388985 * (class654_sub1_sub5_sub1_sub1
						   .anInt11922)),
			     0, 0, true, false,
			     (long) (1126388985 * (class654_sub1_sub5_sub1_sub1
						   .anInt11922)),
			     false, (short) 7324);
		}
		if (!bool) {
		    String[] strings = class307.aStringArray3286;
		    boolean bool_210_ = false;
		    if (client.aBool11230)
			strings = Class200.method3857(strings, (byte) 97);
		    if (strings != null) {
		    while_173_:
			for (int i = strings.length - 1; i >= 0; i--) {
			    if (strings[i] != null
				&& 0 == ((-1134759455
					  * (class654_sub1_sub5_sub1_sub1
					     .anInt12208))
					 & 1 << i)) {
				short i_211_ = client.aShortArray11286[i];
				int i_212_ = client.anInt11216 * 2068410197;
				int i_213_
				    = class307.method5617(i, 1332643458);
				if (i_213_ != -1)
				    i_212_ = i_213_;
				boolean bool_214_
				    = (strings[i].equalsIgnoreCase
				       (Class58.aClass58_590.method1245
					(Class539.aClass672_7171,
					 (byte) -77)));
				boolean bool_215_
				    = (strings[i].equalsIgnoreCase
				       (Class58.aClass58_589.method1245
					(Class539.aClass672_7171,
					 (byte) -14)));
				if (bool_214_ || bool_215_) {
				    if (bool_210_)
					continue;
				    switch (client.aClass635_11328.anInt8301
					    * 294429925) {
				    case 1:
					bool_210_ = true;
					continue while_173_;
				    case 2:
				    case 3:
					if (1 == class307.aByte3340)
					    bool_210_ = true;
					else
					    break;
					continue while_173_;
				    case 0:
					if (!bool_214_)
					    break;
					continue while_173_;
				    }
				    if (bool_214_)
					i_212_
					    = 235545833 * class307.anInt3299;
				}
				Class112.method2016
				    (strings[i],
				     new StringBuilder().append
					 (Class154.method2575(16776960,
							      756269021))
					 .append
					 (string).toString(),
				     i_212_, i_211_, -1,
				     (long) (1126388985
					     * (class654_sub1_sub5_sub1_sub1
						.anInt11922)),
				     0, 0, true, false,
				     (long) (1126388985
					     * (class654_sub1_sub5_sub1_sub1
						.anInt11922)),
				     false, (short) 30831);
			    }
			}
			if (bool_210_) {
			    for (int i = 0; i < strings.length; i++) {
				if (null != strings[i]
				    && ((class654_sub1_sub5_sub1_sub1
					 .anInt12208) * -1134759455
					& 1 << i) == 0) {
				    boolean bool_216_
					= (strings[i].equalsIgnoreCase
					   (Class58.aClass58_590.method1245
					    (Class539.aClass672_7171,
					     (byte) -14)));
				    boolean bool_217_
					= (strings[i].equalsIgnoreCase
					   (Class58.aClass58_589.method1245
					    (Class539.aClass672_7171,
					     (byte) -1)));
				    if (bool_216_ || bool_217_) {
					short i_218_
					    = client.aShortArray11286[i];
					int i_219_
					    = client.anInt11216 * 2068410197;
					int i_220_
					    = class307.method5617(i,
								  -1669588631);
					if (i_220_ != -1)
					    i_219_ = i_220_;
					if ((Class635.aClass635_8302
					     == client.aClass635_11328)
					    || ((Class635.aClass635_8298
						 == client.aClass635_11328)
						&& ((1691897137
						     * (class654_sub1_sub5_sub1_sub1
							.anInt12192))
						    > ((Class322
							.aClass654_Sub1_Sub5_Sub1_Sub2_3419
							.anInt12210)
						       * 1423663301))))
					    i_218_ += 2000;
					if (bool_216_)
					    i_219_ = (235545833
						      * class307.anInt3299);
					Class112.method2016
					    (strings[i],
					     new StringBuilder().append
						 (Class154.method2575
						  (16776960, -968692303))
						 .append
						 (string).toString(),
					     i_219_, i_218_, -1,
					     (long) (1126388985
						     * (class654_sub1_sub5_sub1_sub1
							.anInt11922)),
					     0, 0, true, false,
					     (long) ((class654_sub1_sub5_sub1_sub1
						      .anInt11922)
						     * 1126388985),
					     false, (short) 1605);
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public static void method1482() {
	Class391.method6546((byte) 116);
    }
    
    public static void method1483() {
	Class391.method6546((byte) 44);
    }
    
    public static void method1484() {
	Class391.method6546((byte) 62);
    }
    
    static Class16 method1485() {
	Class16 class16;
	if (aBool784) {
	    if (null != Class57.aClass171_458
		&& Class287.aClass16_3084 != null)
		class16 = Class287.aClass16_3084;
	    else
		class16 = Class322.aClass16_3420;
	} else
	    class16 = Class322.aClass16_3420;
	anInt754
	    = 1660152313 * class16.anInt190 + class16.anInt189 * -1129366907;
	return class16;
    }
    
    static long method1486(Interface62 interface62, int i, int i_221_) {
	long l = 4194304L;
	long l_222_ = -9223372036854775808L;
	Class602 class602
	    = ((Class602)
	       client.aClass512_11100.method8428(-1486655428)
		   .method91(interface62.method56(-145167926), -1424625606));
	long l_223_
	    = (long) (i | i_221_ << 7
		      | interface62.method409(-2099748500) << 14
		      | interface62.method410(-1714092090) << 20 | 0x40000000);
	if (class602.anInt7907 * -2134171963 == 0)
	    l_223_ |= l_222_;
	if (1 == class602.anInt7940 * 1288889595)
	    l_223_ |= l;
	l_223_ |= (long) interface62.method56(-1053495819) << 32;
	return l_223_;
    }
    
    static void method1487(int i, int i_224_) {
	anInt777 = -1105907919 * i;
	anInt778 = i_224_ * -1266523535;
    }
    
    static void method1488(int i, int i_225_) {
	anInt777 = -1105907919 * i;
	anInt778 = i_225_ * -1266523535;
    }
    
    static void method1489(Class247 class247, int i, int i_226_) {
	aClass247_774 = class247;
	anInt759 = i * 1370224745;
	anInt776 = -590395525 * i_226_;
    }
    
    static void method1490(Class247 class247, int i, int i_227_) {
	aClass247_774 = class247;
	anInt759 = i * 1370224745;
	anInt776 = -590395525 * i_227_;
    }
    
    static void method1491(Class247 class247, int i, int i_228_) {
	aClass247_774 = class247;
	anInt759 = i * 1370224745;
	anInt776 = -590395525 * i_228_;
    }
    
    static void method1492
	(int i, int i_229_, int i_230_, int i_231_, int i_232_, int i_233_,
	 int i_234_, Class534_Sub18_Sub7 class534_sub18_sub7,
	 Class171 class171, Class16 class16, int i_235_, int i_236_) {
	if (i > i_230_ && i < i_232_ + i_230_
	    && i_229_ > i_234_ - class16.anInt190 * 102396103 - 1
	    && i_229_ < 728893755 * class16.anInt189 + i_234_
	    && class534_sub18_sub7.aBool11705)
	    i_235_ = i_236_;
	int[] is = Class10.method607(class534_sub18_sub7, (short) 4000);
	String string = Class21.method813(class534_sub18_sub7, (byte) -62);
	if (null != is)
	    string = new StringBuilder().append(string).append
			 (Class44_Sub21.method17371(is, 54997350)).toString();
	class171.method2835(string, i_230_ + 3, i_234_, i_235_, 0,
			    client.aRandom11178, Class709.anInt8857,
			    Class658.aClass163Array8541, null, (byte) -50);
	if (class534_sub18_sub7.aBool11701)
	    Class657.aClass163_8538.method2656
		(i_230_ + 5 + class16.method748(string,
						Class658.aClass163Array8541,
						(byte) -8),
		 i_234_ - class16.anInt190 * 102396103);
    }
    
    static boolean method1493(int i) {
	return (i == 44 || 45 == i || i == 46 || i == 47 || i == 48 || i == 49
		|| i == 50 || i == 51 || i == 52 || i == 53 || i == 15);
    }
    
    static boolean method1494() {
	return Class677.method11142(Class700.aClass638_8806.aClass603_8311,
				    1264417144);
    }
    
    public static boolean method1495(int i, int i_237_) {
	if (!aBool758)
	    return false;
	int i_238_ = i >> 16;
	int i_239_ = i & 0xffff;
	if (null == Class44_Sub11.aClass243Array11006[i_238_]
	    || null == (Class44_Sub11.aClass243Array11006[i_238_]
			.aClass247Array2412[i_239_]))
	    return false;
	Class247 class247 = (Class44_Sub11.aClass243Array11006[i_238_]
			     .aClass247Array2412[i_239_]);
	if (-1 != i_237_ || 0 != class247.anInt2438 * -1960530827) {
	    for (Class534_Sub18_Sub7 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			aClass700_771.method14135((byte) -1));
		 null != class534_sub18_sub7;
		 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			aClass700_771.method14139(1945519994))) {
		if (i_237_ == class534_sub18_sub7.anInt11703 * 980750511
		    && (class534_sub18_sub7.anInt11704 * -1180225371
			== class247.anInt2454 * -1278450723)
		    && (class534_sub18_sub7.anInt11706 * -1986934021 == 58
			|| 1007 == class534_sub18_sub7.anInt11706 * -1986934021
			|| 25 == -1986934021 * class534_sub18_sub7.anInt11706
			|| 57 == class534_sub18_sub7.anInt11706 * -1986934021
			|| class534_sub18_sub7.anInt11706 * -1986934021 == 30))
		    return true;
	    }
	} else {
	    for (Class534_Sub18_Sub7 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			aClass700_771.method14135((byte) -1));
		 class534_sub18_sub7 != null;
		 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			aClass700_771.method14139(1422250302))) {
		if (58 == class534_sub18_sub7.anInt11706 * -1986934021
		    || class534_sub18_sub7.anInt11706 * -1986934021 == 1007
		    || 25 == class534_sub18_sub7.anInt11706 * -1986934021
		    || 57 == class534_sub18_sub7.anInt11706 * -1986934021
		    || 30 == -1986934021 * class534_sub18_sub7.anInt11706) {
		    for (Class247 class247_240_
			     = Class112.method2017((-1180225371
						    * (class534_sub18_sub7
						       .anInt11704)),
						   1513544646);
			 class247_240_ != null;
			 class247_240_
			     = Class578.method9799((Class44_Sub11
						    .aClass243Array11006
						    [(-1278450723
						      * (class247_240_
							 .anInt2454)) >> 16]),
						   class247_240_,
						   -1495101509)) {
			if (-1278450723 * class247.anInt2454
			    == class247_240_.anInt2454 * -1278450723)
			    return true;
		    }
		}
	    }
	}
	return false;
    }
    
    public static Class534_Sub18_Sub7 method1496() {
	return Class251.aClass534_Sub18_Sub7_2653;
    }
    
    static void method1497() {
	if (null != aClass534_Sub18_Sub11_760) {
	    aClass534_Sub18_Sub11_760 = null;
	    Class316.method5724(-1803884121 * Class112.anInt1364,
				Class150.anInt1699 * 892411561,
				-2123561997 * Class536_Sub4.anInt10366,
				-417346889 * Class281.anInt3062, (byte) 1);
	}
    }
    
    public static String method1498(Class534_Sub18_Sub7 class534_sub18_sub7) {
	if (aBool758 || null == class534_sub18_sub7)
	    return "";
	return class534_sub18_sub7.aString11699;
    }
    
    static void method1499(int i, int i_241_) {
	anInt777 = -1105907919 * i;
	anInt778 = i_241_ * -1266523535;
    }
    
    static boolean method1500(Interface65 interface65,
			      Class534_Sub42 class534_sub42) {
	return (interface65 != null
		&& interface65.method437(class534_sub42,
					 client.anInterface63Array11070,
					 -2064179505 * client.anInt11199,
					 Class666.aClass547_8577, -268004889));
    }
    
    public static String method1501(Class534_Sub18_Sub7 class534_sub18_sub7) {
	if (aBool758 || null == class534_sub18_sub7)
	    return "";
	return class534_sub18_sub7.aString11699;
    }
    
    public static String method1502(Class534_Sub18_Sub7 class534_sub18_sub7) {
	if (aBool758 || null == class534_sub18_sub7)
	    return "";
	return class534_sub18_sub7.aString11699;
    }
    
    public static String method1503(Class534_Sub18_Sub7 class534_sub18_sub7) {
	if (aBool758 || null == class534_sub18_sub7)
	    return "";
	return class534_sub18_sub7.aString11699;
    }
    
    public static String method1504(Class534_Sub18_Sub7 class534_sub18_sub7) {
	if (aBool758 || null == class534_sub18_sub7)
	    return "";
	if ((null == class534_sub18_sub7.aString11708
	     || class534_sub18_sub7.aString11708.length() == 0)
	    && class534_sub18_sub7.aString11710 != null
	    && class534_sub18_sub7.aString11710.length() > 0)
	    return class534_sub18_sub7.aString11710;
	return class534_sub18_sub7.aString11708;
    }
    
    public static int method1505(Class534_Sub18_Sub7 class534_sub18_sub7) {
	if (aBool758)
	    return 6;
	if (class534_sub18_sub7 == null)
	    return 0;
	int i = -1986934021 * class534_sub18_sub7.anInt11706;
	if (Class591.method9883(i, (byte) -29))
	    return 1;
	if (Class698.method14124(i, 1024308122))
	    return 2;
	if (Class421.method6783(i, (byte) -95))
	    return 3;
	if (Class534_Sub4.method16039(i, -763060754))
	    return 4;
	if (Class100.method1883(i, 1997641409))
	    return 7;
	if (16 == i)
	    return 8;
	return 5;
    }
    
    public static int method1506(Class534_Sub18_Sub7 class534_sub18_sub7) {
	if (aBool758)
	    return 6;
	if (class534_sub18_sub7 == null)
	    return 0;
	int i = -1986934021 * class534_sub18_sub7.anInt11706;
	if (Class591.method9883(i, (byte) -120))
	    return 1;
	if (Class698.method14124(i, 1024308122))
	    return 2;
	if (Class421.method6783(i, (byte) -77))
	    return 3;
	if (Class534_Sub4.method16039(i, -765282764))
	    return 4;
	if (Class100.method1883(i, -1852537209))
	    return 7;
	if (16 == i)
	    return 8;
	return 5;
    }
    
    public static String method1507(Class534_Sub18_Sub7 class534_sub18_sub7) {
	if (aBool758 || null == class534_sub18_sub7)
	    return "";
	int[] is = Class10.method607(class534_sub18_sub7, (short) 4000);
	if (null == is)
	    return "";
	return Class44_Sub21.method17371(is, 15055543);
    }
    
    static void method1508(Class446 class446, Class433 class433, int i,
			   int i_242_) {
	if (aClass433_762 == null)
	    aClass433_762 = new Class433(class433);
	else
	    aClass433_762.method6842(class433);
	aClass446_783.method7236(class446);
	anInt779 = 1658436649 * i;
	anInt780 = -1631970627 * i_242_;
    }
    
    static void method1509(String string, String string_243_, int i,
			   int i_244_, int i_245_, long l, int i_246_,
			   int i_247_, boolean bool, boolean bool_248_,
			   long l_249_, boolean bool_250_) {
	if (!aBool758 && anInt765 * 324852453 < 504) {
	    i = i != -1 ? i : 846725895 * client.anInt11215;
	    Class534_Sub18_Sub7 class534_sub18_sub7
		= new Class534_Sub18_Sub7(string, string_243_, i, i_244_,
					  i_245_, l, i_246_, i_247_, bool,
					  bool_248_, l_249_, bool_250_);
	    Class517.method8636(class534_sub18_sub7, (byte) 0);
	}
    }
    
    static String method1510(Class534_Sub18_Sub7 class534_sub18_sub7) {
	if (class534_sub18_sub7.aString11710 == null
	    || class534_sub18_sub7.aString11710.length() == 0) {
	    if (class534_sub18_sub7.aString11708 != null
		&& class534_sub18_sub7.aString11708.length() > 0)
		return new StringBuilder().append
			   (class534_sub18_sub7.aString11699).append
			   (Class58.aClass58_461.method1245((Class539
							     .aClass672_7171),
							    (byte) -56))
			   .append
			   (class534_sub18_sub7.aString11708).toString();
	    return class534_sub18_sub7.aString11699;
	}
	if (null != class534_sub18_sub7.aString11708
	    && class534_sub18_sub7.aString11708.length() > 0)
	    return new StringBuilder().append
		       (class534_sub18_sub7.aString11699).append
		       (Class58.aClass58_461
			    .method1245(Class539.aClass672_7171, (byte) -18))
		       .append
		       (class534_sub18_sub7.aString11708).append
		       (Class58.aClass58_461
			    .method1245(Class539.aClass672_7171, (byte) -80))
		       .append
		       (class534_sub18_sub7.aString11710).toString();
	return new StringBuilder().append(class534_sub18_sub7.aString11699)
		   .append
		   (Class58.aClass58_461.method1245(Class539.aClass672_7171,
						    (byte) -66))
		   .append
		   (class534_sub18_sub7.aString11710).toString();
    }
    
    static void method1511(Class185 class185) {
	if (!aBool784)
	    Class417.method6754(class185, (byte) 1);
	else
	    Class669.method11031(class185, -561696717);
    }
    
    static void method1512(Class185 class185) {
	if (!aBool784)
	    Class417.method6754(class185, (byte) 1);
	else
	    Class669.method11031(class185, 2098975705);
    }
    
    static void method1513(Class185 class185) {
	if ((324852453 * anInt765 >= 2 || client.aBool11218)
	    && client.aClass247_11044 == null) {
	    String string;
	    if (client.aBool11218 && anInt765 * 324852453 < 2)
		string
		    = new StringBuilder().append(client.aString11221).append
			  (Class58.aClass58_461.method1245((Class539
							    .aClass672_7171),
							   (byte) -120))
			  .append
			  (client.aString11222).append
			  (" ").append
			  (Class29.aString263).toString();
	    else if (Class418.method6761(-2005760565)
		     && anInt765 * 324852453 > 2)
		string = Class21.method813(Class251.aClass534_Sub18_Sub7_2653,
					   (byte) -50);
	    else {
		Class534_Sub18_Sub7 class534_sub18_sub7
		    = Class251.aClass534_Sub18_Sub7_2653;
		if (null == class534_sub18_sub7)
		    return;
		string = Class21.method813(class534_sub18_sub7, (byte) -2);
		int[] is
		    = Class10.method607(class534_sub18_sub7, (short) 4000);
		if (is != null)
		    string = new StringBuilder().append(string).append
				 (Class44_Sub21.method17371(is, -1122138696))
				 .toString();
	    }
	    if (324852453 * anInt765 > 2)
		string
		    = new StringBuilder().append(string).append
			  (Class154.method2575(16777215, -1408920646)).append
			  (" / ").append
			  (324852453 * anInt765 - 2).append
			  (Class58.aClass58_560.method1245((Class539
							    .aClass672_7171),
							   (byte) -60))
			  .toString();
	    if (null != aClass247_774) {
		Class171 class171
		    = aClass247_774.method4555(Class351.aClass406_3620,
					       client.anInterface52_11081,
					       (byte) -121);
		if (class171 == null)
		    class171 = Class231.aClass171_2325;
		class171.method2836(string, 1568741337 * anInt759,
				    -1017020493 * anInt776,
				    aClass247_774.anInt2468 * -881188269,
				    aClass247_774.anInt2469 * -1279656873,
				    290091559 * aClass247_774.anInt2482,
				    2071487835 * aClass247_774.anInt2587,
				    -1049814117 * aClass247_774.anInt2535,
				    183230983 * aClass247_774.anInt2534,
				    client.aRandom11178, Class709.anInt8857,
				    client.anIntArray11287,
				    Class658.aClass163Array8541, null,
				    (byte) -93);
		Class316.method5724(client.anIntArray11287[0],
				    client.anIntArray11287[1],
				    client.anIntArray11287[2],
				    client.anIntArray11287[3], (byte) 1);
	    }
	}
    }
    
    static void method1514(Class185 class185, int i, int i_251_, int i_252_,
			   int i_253_, int i_254_, int i_255_) {
	class185.method3292(i, i_251_, i_252_, i_253_, i_254_, -1921877711);
	class185.method3292(i + 1, i_251_ + 1, i_252_ - 2, 16, i_255_,
			    -1910266161);
	class185.method3425(i + 1, 18 + i_251_, i_252_ - 2, i_253_ - 19,
			    i_255_, -221217667);
    }
    
    static void method1515(Class185 class185, int i, int i_256_, int i_257_,
			   int i_258_, int i_259_, int i_260_) {
	class185.method3292(i, i_256_, i_257_, i_258_, i_259_, -2143426088);
	class185.method3292(i + 1, i_256_ + 1, i_257_ - 2, 16, i_260_,
			    -2079533934);
	class185.method3425(i + 1, 18 + i_256_, i_257_ - 2, i_258_ - 19,
			    i_260_, -902238282);
    }
    
    static void method1516(Class185 class185, int i, int i_261_, int i_262_,
			   int i_263_, int i_264_, int i_265_) {
	class185.method3292(i, i_261_, i_262_, i_263_, i_264_, -1570777187);
	class185.method3292(i + 1, i_261_ + 1, i_262_ - 2, 16, i_265_,
			    -2143490060);
	class185.method3425(i + 1, 18 + i_261_, i_262_ - 2, i_263_ - 19,
			    i_265_, -1862000523);
    }
    
    static boolean method1517(int i) {
	if (18 == i || i == 19 || 20 == i || 21 == i || 22 == i || i == 1004)
	    return true;
	if (17 == i)
	    return true;
	return false;
    }
    
    static void method1518
	(int i, int i_266_, int i_267_, int i_268_, int i_269_, int i_270_,
	 int i_271_, Class534_Sub18_Sub7 class534_sub18_sub7,
	 Class171 class171, Class16 class16, int i_272_, int i_273_) {
	if (i > i_267_ && i < i_269_ + i_267_
	    && i_266_ > i_271_ - class16.anInt190 * 102396103 - 1
	    && i_266_ < 728893755 * class16.anInt189 + i_271_
	    && class534_sub18_sub7.aBool11705)
	    i_272_ = i_273_;
	int[] is = Class10.method607(class534_sub18_sub7, (short) 4000);
	String string = Class21.method813(class534_sub18_sub7, (byte) -33);
	if (null != is)
	    string
		= new StringBuilder().append(string).append
		      (Class44_Sub21.method17371(is, -1769970401)).toString();
	class171.method2835(string, i_267_ + 3, i_271_, i_272_, 0,
			    client.aRandom11178, Class709.anInt8857,
			    Class658.aClass163Array8541, null, (byte) 10);
	if (class534_sub18_sub7.aBool11701)
	    Class657.aClass163_8538.method2656
		(i_267_ + 5 + class16.method748(string,
						Class658.aClass163Array8541,
						(byte) -99),
		 i_271_ - class16.anInt190 * 102396103);
    }
    
    static void method1519(Class534_Sub18_Sub7 class534_sub18_sub7, int i,
			   int i_274_, boolean bool) {
	if (null != class534_sub18_sub7
	    && class534_sub18_sub7 != aClass700_771.aClass534_8803) {
	    int i_275_ = class534_sub18_sub7.anInt11703 * 980750511;
	    int i_276_ = -1180225371 * class534_sub18_sub7.anInt11704;
	    int i_277_ = class534_sub18_sub7.anInt11706 * -1986934021;
	    int i_278_ = (int) (-7225575275964615095L
				* class534_sub18_sub7.aLong11702);
	    long l = -7225575275964615095L * class534_sub18_sub7.aLong11702;
	    if (i_277_ >= 2000)
		i_277_ -= 2000;
	    Class597 class597 = client.aClass512_11100.method8416((byte) 50);
	    if (i_277_ == 15) {
		Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		    = client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i_278_];
		if (null != class654_sub1_sub5_sub1_sub2) {
		    client.anInt11115 = -1077600287 * i;
		    client.anInt11169 = 1219616153 * i_274_;
		    client.anInt11265 = 1639785950;
		    client.anInt11188 = 0;
		    Class534_Sub19 class534_sub19
			= Class346.method6128(Class404.aClass404_4229,
					      (client.aClass100_11264
					       .aClass13_1183),
					      1341391005);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16687
			(-823724811 * client.anInt11170, 2114252148);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16506
			(Class479.method7916(-877455222) ? 1 : 0, 749437805);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16579
			(-1808298539 * Class130.anInt1525, 1439982902);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16507
			(-985352023 * client.anInt11219, 684442448);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16687(i_278_, 2106205678);
		    client.aClass100_11264.method1863(class534_sub19,
						      (byte) 61);
		    Class84.method1669((class654_sub1_sub5_sub1_sub2
					.anIntArray11977[0]),
				       (class654_sub1_sub5_sub1_sub2
					.anIntArray11978[0]),
				       -787566118);
		}
	    }
	    if (i_277_ == 25) {
		Class247 class247
		    = Class81.method1637(i_276_, i_275_, 2075013876);
		if (class247 != null) {
		    Exception_Sub3.method17943((byte) 1);
		    Class534_Sub25 class534_sub25
			= client.method17392(class247);
		    Class208.method3945(class247,
					class534_sub25.method16271((byte) 18),
					(class534_sub25.anInt10575
					 * -1799641075),
					-980051126);
		    client.aString11221
			= Class598.method9939(class247, 1314979768);
		    if (client.aString11221 == null)
			client.aString11221 = "Null";
		    client.aString11222
			= new StringBuilder().append(class247.aString2551)
			      .append
			      (Class154.method2575(16777215, 800952280))
			      .toString();
		}
	    } else {
		if (59 == i_277_) {
		    client.anInt11115 = i * -1077600287;
		    client.anInt11169 = 1219616153 * i_274_;
		    client.anInt11265 = -1327590673;
		    client.anInt11188 = 0;
		    Class534_Sub19 class534_sub19
			= Class346.method6128(Class404.aClass404_4157,
					      (client.aClass100_11264
					       .aClass13_1183),
					      1341391005);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16579
			(-1808298539 * Class130.anInt1525, 1378643751);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16569(client.anInt11170 * -823724811, 40325584);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16569
			(class597.anInt7861 * -1166289421 + i_276_,
			 1219314945);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16687
			(class597.anInt7859 * -424199969 + i_275_, 2144459935);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16568
			(-985352023 * client.anInt11219, 918080663);
		    client.aClass100_11264.method1863(class534_sub19,
						      (byte) 58);
		    Class84.method1669(i_275_, i_276_, -787566118);
		}
		if (i_277_ == 17) {
		    client.anInt11115 = -1077600287 * i;
		    client.anInt11169 = 1219616153 * i_274_;
		    client.anInt11265 = 1639785950;
		    client.anInt11188 = 0;
		    Class534_Sub19 class534_sub19
			= Class346.method6128(Class404.aClass404_4262,
					      (client.aClass100_11264
					       .aClass13_1183),
					      1341391005);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16510
			(-1808298539 * Class130.anInt1525, -33273622);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16687
			(client.anInt11170 * -823724811, 1964093902);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16560
			(Class479.method7916(-877455222) ? 1 : 0, -645224929);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16569(i_278_, 387809339);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16569
			(i_276_ + class597.anInt7861 * -1166289421, 457659618);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16568
			(i_275_ + class597.anInt7859 * -424199969, 902148530);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16569
			(client.anInt11219 * -985352023, -1836850882);
		    client.aClass100_11264.method1863(class534_sub19,
						      (byte) 44);
		    Class84.method1669(i_275_, i_276_, -787566118);
		}
		if (60 == i_277_) {
		    if (365872613 * client.anInt11194 > 0
			&& Class453_Sub5.method16010(2122926761))
			Class534_Sub18_Sub2.method17849
			    ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			      .aByte10854),
			     class597.anInt7859 * -424199969 + i_275_,
			     -1166289421 * class597.anInt7861 + i_276_,
			     -1773181222);
		    else {
			client.anInt11115 = -1077600287 * i;
			client.anInt11169 = i_274_ * 1219616153;
			client.anInt11265 = -1327590673;
			client.anInt11188 = 0;
			Class534_Sub19 class534_sub19
			    = Class346.method6128(Class404.aClass404_4179,
						  (client.aClass100_11264
						   .aClass13_1183),
						  1341391005);
			class534_sub19.aClass534_Sub40_Sub1_10513.method16687
			    (-424199969 * class597.anInt7859 + i_275_,
			     2004988568);
			class534_sub19.aClass534_Sub40_Sub1_10513.method16507
			    (-1166289421 * class597.anInt7861 + i_276_,
			     976366047);
			client.aClass100_11264.method1863(class534_sub19,
							  (byte) 101);
		    }
		}
		if (i_277_ == 30 && client.aClass247_11119 == null) {
		    Class536.method8908(i_276_, i_275_, -1465097289);
		    client.aClass247_11119
			= Class81.method1637(i_276_, i_275_, 628241425);
		    if (client.aClass247_11119 != null)
			Class454.method7416(client.aClass247_11119,
					    -769593134);
		}
		if (i_277_ == 1008 || i_277_ == 1009 || i_277_ == 1010
		    || 1011 == i_277_ || 1012 == i_277_)
		    Class536_Sub4.method15993(i_277_, i_278_, i_275_,
					      (byte) 50);
		if (i_277_ == 23) {
		    if (client.anInt11194 * 365872613 > 0
			&& Class453_Sub5.method16010(2140889283))
			Class534_Sub18_Sub2.method17849
			    ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			      .aByte10854),
			     i_275_ + -424199969 * class597.anInt7859,
			     i_276_ + class597.anInt7861 * -1166289421,
			     -139458378);
		    else {
			Class534_Sub19 class534_sub19
			    = Class711.method14415(i_275_, i_276_, i_278_,
						   1294038924);
			if (i_278_ == 1) {
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16506(-1, 782854688);
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16506(-1, 502812621);
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16507
				((int) client.aFloat11140, 1950807083);
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16506(57, 1554474612);
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16506
				(client.anInt11189 * -2045337339, 1118932166);
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16506
				(-2002513841 * client.anInt11022, 1005252872);
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16506(89, 1201716374);
			    Class438 class438
				= (Class322
				       .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				       .method10807
				   ().aClass438_4885);
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16507
				((int) class438.aFloat4864, 860153392);
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16507
				((int) class438.aFloat4865, 1907364416);
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16506(63, 2021108202);
			} else {
			    client.anInt11115 = -1077600287 * i;
			    client.anInt11169 = 1219616153 * i_274_;
			    client.anInt11265 = -1327590673;
			    client.anInt11188 = 0;
			}
			client.aClass100_11264.method1863(class534_sub19,
							  (byte) 20);
			Class84.method1669(i_275_, i_276_, -787566118);
		    }
		}
		Class404 class404 = null;
		if (9 == i_277_)
		    class404 = Class404.aClass404_4248;
		else if (i_277_ == 10)
		    class404 = Class404.aClass404_4266;
		else if (i_277_ == 11)
		    class404 = Class404.aClass404_4221;
		else if (12 == i_277_)
		    class404 = Class404.aClass404_4226;
		else if (13 == i_277_)
		    class404 = Class404.aClass404_4216;
		else if (i_277_ == 1003)
		    class404 = Class404.aClass404_4254;
		if (class404 != null) {
		    Class534_Sub6 class534_sub6
			= ((Class534_Sub6)
			   client.aClass9_11331.method579((long) i_278_));
		    if (null != class534_sub6) {
			Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
			    = ((Class654_Sub1_Sub5_Sub1_Sub1)
			       class534_sub6.anObject10417);
			client.anInt11115 = -1077600287 * i;
			client.anInt11169 = 1219616153 * i_274_;
			client.anInt11265 = 1639785950;
			client.anInt11188 = 0;
			Class534_Sub19 class534_sub19
			    = Class346.method6128(class404,
						  (client.aClass100_11264
						   .aClass13_1183),
						  1341391005);
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .method16569(i_278_, -1181746722);
			class534_sub19.aClass534_Sub40_Sub1_10513.method16559
			    (Class479.method7916(-877455222) ? 1 : 0,
			     200893501);
			client.aClass100_11264.method1863(class534_sub19,
							  (byte) 116);
			Class84.method1669((class654_sub1_sub5_sub1_sub1
					    .anIntArray11977[0]),
					   (class654_sub1_sub5_sub1_sub1
					    .anIntArray11978[0]),
					   -787566118);
		    }
		}
		if (i_277_ == 2) {
		    client.anInt11115 = i * -1077600287;
		    client.anInt11169 = i_274_ * 1219616153;
		    client.anInt11265 = 1639785950;
		    client.anInt11188 = 0;
		    Class534_Sub19 class534_sub19
			= Class346.method6128(Class404.aClass404_4174,
					      (client.aClass100_11264
					       .aClass13_1183),
					      1341391005);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16569
			(-985352023 * client.anInt11219, 972770763);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16617
			((int) (l >>> 32) & 0x7fffffff, -2101731175);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16569
			(i_276_ + class597.anInt7861 * -1166289421,
			 -1680365962);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16687
			(-823724811 * client.anInt11170, 2037755421);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16559
			(Class479.method7916(-877455222) ? 1 : 0, 885602615);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16579
			(Class130.anInt1525 * -1808298539, -551117725);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16569
			(i_275_ + -424199969 * class597.anInt7859, 1984551338);
		    client.aClass100_11264.method1863(class534_sub19,
						      (byte) 68);
		    Class84.method1669(i_275_, i_276_, -787566118);
		}
		Class404 class404_279_ = null;
		if (i_277_ == 44)
		    class404_279_ = Class404.aClass404_4198;
		else if (45 == i_277_)
		    class404_279_ = Class404.aClass404_4237;
		else if (i_277_ == 46)
		    class404_279_ = Class404.aClass404_4261;
		else if (i_277_ == 47)
		    class404_279_ = Class404.aClass404_4215;
		else if (i_277_ == 48)
		    class404_279_ = Class404.aClass404_4202;
		else if (49 == i_277_)
		    class404_279_ = Class404.aClass404_4196;
		else if (50 == i_277_)
		    class404_279_ = Class404.aClass404_4264;
		else if (i_277_ == 51)
		    class404_279_ = Class404.aClass404_4162;
		else if (i_277_ == 52)
		    class404_279_ = Class404.aClass404_4232;
		else if (53 == i_277_)
		    class404_279_ = Class404.aClass404_4189;
		if (class404_279_ != null) {
		    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
			= (client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279
			   [i_278_]);
		    if (null != class654_sub1_sub5_sub1_sub2) {
			client.anInt11115 = i * -1077600287;
			client.anInt11169 = 1219616153 * i_274_;
			client.anInt11265 = 1639785950;
			client.anInt11188 = 0;
			Class534_Sub19 class534_sub19
			    = Class346.method6128(class404_279_,
						  (client.aClass100_11264
						   .aClass13_1183),
						  1341391005);
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .method16687(i_278_, 2081997380);
			class534_sub19.aClass534_Sub40_Sub1_10513.method16560
			    (Class479.method7916(-877455222) ? 1 : 0,
			     916046027);
			client.aClass100_11264.method1863(class534_sub19,
							  (byte) 50);
			Class84.method1669((class654_sub1_sub5_sub1_sub2
					    .anIntArray11977[0]),
					   (class654_sub1_sub5_sub1_sub2
					    .anIntArray11978[0]),
					   -787566118);
		    }
		}
		if (i_277_ == 57 || 1007 == i_277_)
		    Class273.method5102(i_278_, i_276_, i_275_,
					class534_sub18_sub7.aString11708,
					(byte) -118);
		if (16 == i_277_) {
		    client.anInt11115 = -1077600287 * i;
		    client.anInt11169 = 1219616153 * i_274_;
		    client.anInt11265 = 1639785950;
		    client.anInt11188 = 0;
		    Class534_Sub19 class534_sub19
			= Class346.method6128(Class404.aClass404_4229,
					      (client.aClass100_11264
					       .aClass13_1183),
					      1341391005);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16687
			(client.anInt11170 * -823724811, 1940170865);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16506
			(Class479.method7916(-877455222) ? 1 : 0, 1121583389);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16579
			(-1808298539 * Class130.anInt1525, -187987083);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16507
			(-985352023 * client.anInt11219, 1081174629);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16687
			(1126388985 * (Class322
				       .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				       .anInt11922),
			 2036580956);
		    client.aClass100_11264.method1863(class534_sub19,
						      (byte) 114);
		}
		if (8 == i_277_) {
		    Class534_Sub6 class534_sub6
			= ((Class534_Sub6)
			   client.aClass9_11331.method579((long) i_278_));
		    if (null != class534_sub6) {
			Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
			    = ((Class654_Sub1_Sub5_Sub1_Sub1)
			       class534_sub6.anObject10417);
			client.anInt11115 = -1077600287 * i;
			client.anInt11169 = i_274_ * 1219616153;
			client.anInt11265 = 1639785950;
			client.anInt11188 = 0;
			Class534_Sub19 class534_sub19
			    = Class346.method6128(Class404.aClass404_4274,
						  (client.aClass100_11264
						   .aClass13_1183),
						  1341391005);
			class534_sub19.aClass534_Sub40_Sub1_10513.method16507
			    (-823724811 * client.anInt11170, 1233322179);
			class534_sub19.aClass534_Sub40_Sub1_10513.method16568
			    (-985352023 * client.anInt11219, 464963451);
			class534_sub19.aClass534_Sub40_Sub1_10513.method16510
			    (Class130.anInt1525 * -1808298539, -718791193);
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .method16507(i_278_, 1779618839);
			class534_sub19.aClass534_Sub40_Sub1_10513.method16559
			    (Class479.method7916(-877455222) ? 1 : 0,
			     1249007076);
			client.aClass100_11264.method1863(class534_sub19,
							  (byte) 27);
			Class84.method1669((class654_sub1_sub5_sub1_sub1
					    .anIntArray11977[0]),
					   (class654_sub1_sub5_sub1_sub1
					    .anIntArray11978[0]),
					   -787566118);
		    }
		}
		if (i_277_ == 58) {
		    Class247 class247
			= Class81.method1637(i_276_, i_275_, 1472487125);
		    if (null != class247)
			Class392_Sub1.method15837(class247, -1248887112);
		}
		Class404 class404_280_ = null;
		if (3 == i_277_)
		    class404_280_ = Class404.aClass404_4235;
		else if (4 == i_277_)
		    class404_280_ = Class404.aClass404_4244;
		else if (5 == i_277_)
		    class404_280_ = Class404.aClass404_4194;
		else if (i_277_ == 6)
		    class404_280_ = Class404.aClass404_4271;
		else if (i_277_ == 1001)
		    class404_280_ = Class404.aClass404_4181;
		else if (i_277_ == 1002)
		    class404_280_ = Class404.aClass404_4231;
		if (class404_280_ != null) {
		    client.anInt11115 = -1077600287 * i;
		    client.anInt11169 = i_274_ * 1219616153;
		    client.anInt11265 = 1639785950;
		    client.anInt11188 = 0;
		    Class534_Sub19 class534_sub19
			= Class346.method6128(class404_280_,
					      (client.aClass100_11264
					       .aClass13_1183),
					      1341391005);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16568
			(-1166289421 * class597.anInt7861 + i_276_,
			 1354304677);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16687
			(i_275_ + -424199969 * class597.anInt7859, 1987134352);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16510
			((int) (l >>> 32) & 0x7fffffff, -1288312146);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16506
			(Class479.method7916(-877455222) ? 1 : 0, 465352957);
		    client.aClass100_11264.method1863(class534_sub19,
						      (byte) 25);
		    Class84.method1669(i_275_, i_276_, -787566118);
		}
		Class404 class404_281_ = null;
		if (18 == i_277_)
		    class404_281_ = Class404.aClass404_4193;
		else if (i_277_ == 19)
		    class404_281_ = Class404.aClass404_4160;
		else if (20 == i_277_)
		    class404_281_ = Class404.aClass404_4268;
		else if (21 == i_277_)
		    class404_281_ = Class404.aClass404_4184;
		else if (i_277_ == 22)
		    class404_281_ = Class404.aClass404_4233;
		else if (1004 == i_277_)
		    class404_281_ = Class404.aClass404_4185;
		if (class404_281_ != null) {
		    client.anInt11115 = i * -1077600287;
		    client.anInt11169 = i_274_ * 1219616153;
		    client.anInt11265 = 1639785950;
		    client.anInt11188 = 0;
		    Class534_Sub19 class534_sub19
			= Class346.method6128(class404_281_,
					      (client.aClass100_11264
					       .aClass13_1183),
					      1341391005);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16569
			(i_275_ + class597.anInt7859 * -424199969, 119554187);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16635
			((bool ? 2 : 0) | (Class479.method7916(-877455222) ? 1
					   : 0),
			 1847959371);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16569
			(i_276_ + -1166289421 * class597.anInt7861, 979340233);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16687(i_278_, 1977460360);
		    client.aClass100_11264.method1863(class534_sub19,
						      (byte) 57);
		    Class84.method1669(i_275_, i_276_, -787566118);
		}
		if (client.aBool11218)
		    Exception_Sub3.method17943((byte) 1);
		if (null != Class236.aClass247_2372
		    && client.anInt11084 * 602951003 == 0)
		    Class454.method7416(Class236.aClass247_2372, -1186003571);
	    }
	}
    }
    
    static void method1520
	(int i, int i_282_, int i_283_, int i_284_, int i_285_, int i_286_,
	 int i_287_, Class534_Sub18_Sub7 class534_sub18_sub7,
	 Class171 class171, Class16 class16, int i_288_, int i_289_) {
	if (i > i_283_ && i < i_285_ + i_283_
	    && i_282_ > i_287_ - class16.anInt190 * 102396103 - 1
	    && i_282_ < 728893755 * class16.anInt189 + i_287_
	    && class534_sub18_sub7.aBool11705)
	    i_288_ = i_289_;
	int[] is = Class10.method607(class534_sub18_sub7, (short) 4000);
	String string = Class21.method813(class534_sub18_sub7, (byte) -20);
	if (null != is)
	    string
		= new StringBuilder().append(string).append
		      (Class44_Sub21.method17371(is, -1233601452)).toString();
	class171.method2835(string, i_283_ + 3, i_287_, i_288_, 0,
			    client.aRandom11178, Class709.anInt8857,
			    Class658.aClass163Array8541, null, (byte) 61);
	if (class534_sub18_sub7.aBool11701)
	    Class657.aClass163_8538.method2656
		(i_283_ + 5 + class16.method748(string,
						Class658.aClass163Array8541,
						(byte) -64),
		 i_287_ - class16.anInt190 * 102396103);
    }
    
    static void method1521(Class185 class185) {
	int i = -10660793;
	Class214.method4099(class185, Class627.anInt8175 * -620506573,
			    -260575397 * anInt782,
			    Class641.anInt8340 * -1739196959,
			    Class327_Sub1.anInt9991 * -577412881, i, -16777216,
			    (byte) -40);
	Class231.aClass171_2325.method2828
	    (Class58.aClass58_468.method1245(Class539.aClass672_7171,
					     (byte) -88),
	     3 + Class627.anInt8175 * -620506573, 14 + -260575397 * anInt782,
	     i, -1, (byte) 86);
	int i_290_ = Class81.aClass563_834.method9493(-1719628411);
	int i_291_ = Class81.aClass563_834.method9477(1920730715);
	if (!aBool766) {
	    int i_292_ = 0;
	    for (Class534_Sub18_Sub7 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			aClass700_771.method14135((byte) -1));
		 null != class534_sub18_sub7;
		 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			aClass700_771.method14139(596172006))) {
		int i_293_
		    = ((anInt765 * 324852453 - 1 - i_292_) * (-238165825
							      * anInt754)
		       + (31 + anInt782 * -260575397));
		Class87.method1709(i_290_, i_291_,
				   Class627.anInt8175 * -620506573,
				   anInt782 * -260575397,
				   -1739196959 * Class641.anInt8340,
				   Class327_Sub1.anInt9991 * -577412881,
				   i_293_, class534_sub18_sub7,
				   Class231.aClass171_2325,
				   Class322.aClass16_3420, -1, -256, (byte) 0);
		i_292_++;
	    }
	} else {
	    int i_294_ = 0;
	    for (Class534_Sub18_Sub11 class534_sub18_sub11
		     = ((Class534_Sub18_Sub11)
			aClass696_772.method14078(1221951837));
		 class534_sub18_sub11 != null;
		 class534_sub18_sub11
		     = ((Class534_Sub18_Sub11)
			aClass696_772.method14080((byte) 28))) {
		int i_295_ = (31 + anInt782 * -260575397
			      + -238165825 * anInt754 * i_294_);
		if (1 == class534_sub18_sub11.anInt11795 * -475442105)
		    Class87.method1709(i_290_, i_291_,
				       -620506573 * Class627.anInt8175,
				       anInt782 * -260575397,
				       -1739196959 * Class641.anInt8340,
				       -577412881 * Class327_Sub1.anInt9991,
				       i_295_,
				       ((Class534_Sub18_Sub7)
					(class534_sub18_sub11.aClass696_11794
					 .aClass534_Sub18_8785
					 .aClass534_Sub18_10510)),
				       Class231.aClass171_2325,
				       Class322.aClass16_3420, -1, -256,
				       (byte) 0);
		else
		    Class536_Sub4.method15994(i_290_, i_291_,
					      -620506573 * Class627.anInt8175,
					      anInt782 * -260575397,
					      Class641.anInt8340 * -1739196959,
					      (-577412881
					       * Class327_Sub1.anInt9991),
					      i_295_, class534_sub18_sub11,
					      Class231.aClass171_2325,
					      Class322.aClass16_3420, -1, -256,
					      (byte) 78);
		i_294_++;
	    }
	    if (null != aClass534_Sub18_Sub11_760) {
		Class214.method4099(class185, Class112.anInt1364 * -1803884121,
				    Class150.anInt1699 * 892411561,
				    Class536_Sub4.anInt10366 * -2123561997,
				    Class281.anInt3062 * -417346889, i,
				    -16777216, (byte) 1);
		Class231.aClass171_2325.method2828
		    (aClass534_Sub18_Sub11_760.aString11793,
		     Class112.anInt1364 * -1803884121 + 3,
		     Class150.anInt1699 * 892411561 + 14, i, -1, (byte) 116);
		i_294_ = 0;
		for (Class534_Sub18_Sub7 class534_sub18_sub7
			 = (Class534_Sub18_Sub7) aClass534_Sub18_Sub11_760
						     .aClass696_11794
						     .method14078(1221951837);
		     class534_sub18_sub7 != null;
		     class534_sub18_sub7
			 = ((Class534_Sub18_Sub7)
			    aClass534_Sub18_Sub11_760.aClass696_11794
				.method14080((byte) 125))) {
		    int i_296_ = (-238165825 * anInt754 * i_294_
				  + (Class150.anInt1699 * 892411561 + 31));
		    Class87.method1709(i_290_, i_291_,
				       Class112.anInt1364 * -1803884121,
				       Class150.anInt1699 * 892411561,
				       Class536_Sub4.anInt10366 * -2123561997,
				       Class281.anInt3062 * -417346889, i_296_,
				       class534_sub18_sub7,
				       Class231.aClass171_2325,
				       Class322.aClass16_3420, -1, -256,
				       (byte) 0);
		    i_294_++;
		}
	    }
	}
    }
    
    static void method1522(Class185 class185) {
	int i = -10660793;
	Class214.method4099(class185, Class627.anInt8175 * -620506573,
			    -260575397 * anInt782,
			    Class641.anInt8340 * -1739196959,
			    Class327_Sub1.anInt9991 * -577412881, i, -16777216,
			    (byte) -73);
	Class231.aClass171_2325.method2828
	    (Class58.aClass58_468.method1245(Class539.aClass672_7171,
					     (byte) -104),
	     3 + Class627.anInt8175 * -620506573, 14 + -260575397 * anInt782,
	     i, -1, (byte) 70);
	int i_297_ = Class81.aClass563_834.method9493(-2035659027);
	int i_298_ = Class81.aClass563_834.method9477(1343111770);
	if (!aBool766) {
	    int i_299_ = 0;
	    for (Class534_Sub18_Sub7 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			aClass700_771.method14135((byte) -1));
		 null != class534_sub18_sub7;
		 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			aClass700_771.method14139(2129119902))) {
		int i_300_
		    = ((anInt765 * 324852453 - 1 - i_299_) * (-238165825
							      * anInt754)
		       + (31 + anInt782 * -260575397));
		Class87.method1709(i_297_, i_298_,
				   Class627.anInt8175 * -620506573,
				   anInt782 * -260575397,
				   -1739196959 * Class641.anInt8340,
				   Class327_Sub1.anInt9991 * -577412881,
				   i_300_, class534_sub18_sub7,
				   Class231.aClass171_2325,
				   Class322.aClass16_3420, -1, -256, (byte) 0);
		i_299_++;
	    }
	} else {
	    int i_301_ = 0;
	    for (Class534_Sub18_Sub11 class534_sub18_sub11
		     = ((Class534_Sub18_Sub11)
			aClass696_772.method14078(1221951837));
		 class534_sub18_sub11 != null;
		 class534_sub18_sub11
		     = ((Class534_Sub18_Sub11)
			aClass696_772.method14080((byte) 72))) {
		int i_302_ = (31 + anInt782 * -260575397
			      + -238165825 * anInt754 * i_301_);
		if (1 == class534_sub18_sub11.anInt11795 * -475442105)
		    Class87.method1709(i_297_, i_298_,
				       -620506573 * Class627.anInt8175,
				       anInt782 * -260575397,
				       -1739196959 * Class641.anInt8340,
				       -577412881 * Class327_Sub1.anInt9991,
				       i_302_,
				       ((Class534_Sub18_Sub7)
					(class534_sub18_sub11.aClass696_11794
					 .aClass534_Sub18_8785
					 .aClass534_Sub18_10510)),
				       Class231.aClass171_2325,
				       Class322.aClass16_3420, -1, -256,
				       (byte) 0);
		else
		    Class536_Sub4.method15994(i_297_, i_298_,
					      -620506573 * Class627.anInt8175,
					      anInt782 * -260575397,
					      Class641.anInt8340 * -1739196959,
					      (-577412881
					       * Class327_Sub1.anInt9991),
					      i_302_, class534_sub18_sub11,
					      Class231.aClass171_2325,
					      Class322.aClass16_3420, -1, -256,
					      (byte) 45);
		i_301_++;
	    }
	    if (null != aClass534_Sub18_Sub11_760) {
		Class214.method4099(class185, Class112.anInt1364 * -1803884121,
				    Class150.anInt1699 * 892411561,
				    Class536_Sub4.anInt10366 * -2123561997,
				    Class281.anInt3062 * -417346889, i,
				    -16777216, (byte) 1);
		Class231.aClass171_2325.method2828
		    (aClass534_Sub18_Sub11_760.aString11793,
		     Class112.anInt1364 * -1803884121 + 3,
		     Class150.anInt1699 * 892411561 + 14, i, -1, (byte) 21);
		i_301_ = 0;
		for (Class534_Sub18_Sub7 class534_sub18_sub7
			 = (Class534_Sub18_Sub7) aClass534_Sub18_Sub11_760
						     .aClass696_11794
						     .method14078(1221951837);
		     class534_sub18_sub7 != null;
		     class534_sub18_sub7
			 = ((Class534_Sub18_Sub7)
			    aClass534_Sub18_Sub11_760.aClass696_11794
				.method14080((byte) 116))) {
		    int i_303_ = (-238165825 * anInt754 * i_301_
				  + (Class150.anInt1699 * 892411561 + 31));
		    Class87.method1709(i_297_, i_298_,
				       Class112.anInt1364 * -1803884121,
				       Class150.anInt1699 * 892411561,
				       Class536_Sub4.anInt10366 * -2123561997,
				       Class281.anInt3062 * -417346889, i_303_,
				       class534_sub18_sub7,
				       Class231.aClass171_2325,
				       Class322.aClass16_3420, -1, -256,
				       (byte) 0);
		    i_301_++;
		}
	    }
	}
    }
    
    static void method1523(Class534_Sub18_Sub7 class534_sub18_sub7) {
	if (class534_sub18_sub7 != null) {
	    aClass700_771.method14131(class534_sub18_sub7, (short) 789);
	    anInt765 += 914117357;
	    Object object = null;
	    Class534_Sub18_Sub11 class534_sub18_sub11;
	    if (!class534_sub18_sub7.aBool11707
		&& !"".equals(class534_sub18_sub7.aString11708)) {
		long l
		    = -6387465159951953483L * class534_sub18_sub7.aLong11709;
		for (class534_sub18_sub11
			 = (Class534_Sub18_Sub11) aClass9_768.method579(l);
		     (class534_sub18_sub11 != null
		      && !class534_sub18_sub11.aString11793
			      .equals(class534_sub18_sub7.aString11708));
		     class534_sub18_sub11
			 = ((Class534_Sub18_Sub11)
			    aClass9_768.method582(1050767164))) {
		    /* empty */
		}
		if (null == class534_sub18_sub11) {
		    class534_sub18_sub11
			= (Class534_Sub18_Sub11) aClass203_794.method3871(l);
		    if (class534_sub18_sub11 != null
			&& !class534_sub18_sub11.aString11793
				.equals(class534_sub18_sub7.aString11708))
			class534_sub18_sub11 = null;
		    if (null == class534_sub18_sub11)
			class534_sub18_sub11
			    = new Class534_Sub18_Sub11(class534_sub18_sub7
						       .aString11708);
		    aClass9_768.method581(class534_sub18_sub11, l);
		    anInt789 += -210574503;
		}
	    } else {
		class534_sub18_sub11
		    = new Class534_Sub18_Sub11(class534_sub18_sub7
					       .aString11708);
		anInt789 += -210574503;
	    }
	    if (class534_sub18_sub11.method18343(class534_sub18_sub7,
						 2005653935))
		Class526.method8761(class534_sub18_sub11, -26193475);
	}
    }
    
    static void method1524(Class185 class185, int i, int i_304_, int i_305_,
			   int i_306_, int i_307_) {
	if ((null == Class43.aClass163_324 || Class579.aClass163_7758 == null
	     || Class495.aClass163_5536 == null)
	    && Class464.aClass472_5113
		   .method7670(-746775241 * Class232.anInt2356, (byte) -63)
	    && Class464.aClass472_5113
		   .method7670(Class304.anInt3261 * -1368137493, (byte) -68)
	    && Class464.aClass472_5113
		   .method7670(Class423.anInt4790 * 842411465, (byte) -122)) {
	    Class169 class169
		= Class178.method2949(Class464.aClass472_5113,
				      -1368137493 * Class304.anInt3261, 0);
	    Class579.aClass163_7758 = class185.method3279(class169, true);
	    class169.method2806();
	    Class245.aClass163_2418 = class185.method3279(class169, true);
	    Class43.aClass163_324
		= (class185.method3279
		   (Class178.method2949(Class464.aClass472_5113,
					-746775241 * Class232.anInt2356, 0),
		    true));
	    Class169 class169_308_
		= Class178.method2949(Class464.aClass472_5113,
				      842411465 * Class423.anInt4790, 0);
	    Class495.aClass163_5536 = class185.method3279(class169_308_, true);
	    class169_308_.method2806();
	    Class573.aClass163_7673 = class185.method3279(class169_308_, true);
	}
	if (null != Class43.aClass163_324 && null != Class579.aClass163_7758
	    && null != Class495.aClass163_5536) {
	    int i_309_ = ((i_305_ - Class495.aClass163_5536.method2647() * 2)
			  / Class43.aClass163_324.method2647());
	    for (int i_310_ = 0; i_310_ < i_309_; i_310_++)
		Class43.aClass163_324.method2656
		    ((i + Class495.aClass163_5536.method2647()
		      + i_310_ * Class43.aClass163_324.method2647()),
		     i_304_ + i_306_ - Class43.aClass163_324.method2649());
	    int i_311_
		= ((i_306_ - i_307_ - Class495.aClass163_5536.method2649())
		   / Class579.aClass163_7758.method2649());
	    for (int i_312_ = 0; i_312_ < i_311_; i_312_++) {
		Class579.aClass163_7758.method2656
		    (i, (i_307_ + i_304_
			 + i_312_ * Class579.aClass163_7758.method2649()));
		Class245.aClass163_2418.method2656
		    (i_305_ + i - Class245.aClass163_2418.method2647(),
		     (i_307_ + i_304_
		      + i_312_ * Class579.aClass163_7758.method2649()));
	    }
	    Class495.aClass163_5536.method2656(i, (i_306_ + i_304_
						   - Class495
							 .aClass163_5536
							 .method2649()));
	    Class573.aClass163_7673.method2656
		(i + i_305_ - Class495.aClass163_5536.method2647(),
		 i_304_ + i_306_ - Class495.aClass163_5536.method2649());
	}
    }
    
    static void method1525(Class185 class185, int i, int i_313_, int i_314_,
			   int i_315_, int i_316_) {
	if ((null == Class43.aClass163_324 || Class579.aClass163_7758 == null
	     || Class495.aClass163_5536 == null)
	    && Class464.aClass472_5113
		   .method7670(-746775241 * Class232.anInt2356, (byte) -78)
	    && Class464.aClass472_5113
		   .method7670(Class304.anInt3261 * -1368137493, (byte) -77)
	    && Class464.aClass472_5113
		   .method7670(Class423.anInt4790 * 842411465, (byte) -58)) {
	    Class169 class169
		= Class178.method2949(Class464.aClass472_5113,
				      -1368137493 * Class304.anInt3261, 0);
	    Class579.aClass163_7758 = class185.method3279(class169, true);
	    class169.method2806();
	    Class245.aClass163_2418 = class185.method3279(class169, true);
	    Class43.aClass163_324
		= (class185.method3279
		   (Class178.method2949(Class464.aClass472_5113,
					-746775241 * Class232.anInt2356, 0),
		    true));
	    Class169 class169_317_
		= Class178.method2949(Class464.aClass472_5113,
				      842411465 * Class423.anInt4790, 0);
	    Class495.aClass163_5536 = class185.method3279(class169_317_, true);
	    class169_317_.method2806();
	    Class573.aClass163_7673 = class185.method3279(class169_317_, true);
	}
	if (null != Class43.aClass163_324 && null != Class579.aClass163_7758
	    && null != Class495.aClass163_5536) {
	    int i_318_ = ((i_314_ - Class495.aClass163_5536.method2647() * 2)
			  / Class43.aClass163_324.method2647());
	    for (int i_319_ = 0; i_319_ < i_318_; i_319_++)
		Class43.aClass163_324.method2656
		    ((i + Class495.aClass163_5536.method2647()
		      + i_319_ * Class43.aClass163_324.method2647()),
		     i_313_ + i_315_ - Class43.aClass163_324.method2649());
	    int i_320_
		= ((i_315_ - i_316_ - Class495.aClass163_5536.method2649())
		   / Class579.aClass163_7758.method2649());
	    for (int i_321_ = 0; i_321_ < i_320_; i_321_++) {
		Class579.aClass163_7758.method2656
		    (i, (i_316_ + i_313_
			 + i_321_ * Class579.aClass163_7758.method2649()));
		Class245.aClass163_2418.method2656
		    (i_314_ + i - Class245.aClass163_2418.method2647(),
		     (i_316_ + i_313_
		      + i_321_ * Class579.aClass163_7758.method2649()));
	    }
	    Class495.aClass163_5536.method2656(i, (i_315_ + i_313_
						   - Class495
							 .aClass163_5536
							 .method2649()));
	    Class573.aClass163_7673.method2656
		(i + i_314_ - Class495.aClass163_5536.method2647(),
		 i_313_ + i_315_ - Class495.aClass163_5536.method2649());
	}
    }
    
    static void method1526(Class185 class185, int i, int i_322_, int i_323_,
			   int i_324_, int i_325_) {
	if ((null == Class43.aClass163_324 || Class579.aClass163_7758 == null
	     || Class495.aClass163_5536 == null)
	    && Class464.aClass472_5113
		   .method7670(-746775241 * Class232.anInt2356, (byte) -118)
	    && Class464.aClass472_5113
		   .method7670(Class304.anInt3261 * -1368137493, (byte) -43)
	    && Class464.aClass472_5113
		   .method7670(Class423.anInt4790 * 842411465, (byte) -75)) {
	    Class169 class169
		= Class178.method2949(Class464.aClass472_5113,
				      -1368137493 * Class304.anInt3261, 0);
	    Class579.aClass163_7758 = class185.method3279(class169, true);
	    class169.method2806();
	    Class245.aClass163_2418 = class185.method3279(class169, true);
	    Class43.aClass163_324
		= (class185.method3279
		   (Class178.method2949(Class464.aClass472_5113,
					-746775241 * Class232.anInt2356, 0),
		    true));
	    Class169 class169_326_
		= Class178.method2949(Class464.aClass472_5113,
				      842411465 * Class423.anInt4790, 0);
	    Class495.aClass163_5536 = class185.method3279(class169_326_, true);
	    class169_326_.method2806();
	    Class573.aClass163_7673 = class185.method3279(class169_326_, true);
	}
	if (null != Class43.aClass163_324 && null != Class579.aClass163_7758
	    && null != Class495.aClass163_5536) {
	    int i_327_ = ((i_323_ - Class495.aClass163_5536.method2647() * 2)
			  / Class43.aClass163_324.method2647());
	    for (int i_328_ = 0; i_328_ < i_327_; i_328_++)
		Class43.aClass163_324.method2656
		    ((i + Class495.aClass163_5536.method2647()
		      + i_328_ * Class43.aClass163_324.method2647()),
		     i_322_ + i_324_ - Class43.aClass163_324.method2649());
	    int i_329_
		= ((i_324_ - i_325_ - Class495.aClass163_5536.method2649())
		   / Class579.aClass163_7758.method2649());
	    for (int i_330_ = 0; i_330_ < i_329_; i_330_++) {
		Class579.aClass163_7758.method2656
		    (i, (i_325_ + i_322_
			 + i_330_ * Class579.aClass163_7758.method2649()));
		Class245.aClass163_2418.method2656
		    (i_323_ + i - Class245.aClass163_2418.method2647(),
		     (i_325_ + i_322_
		      + i_330_ * Class579.aClass163_7758.method2649()));
	    }
	    Class495.aClass163_5536.method2656(i, (i_324_ + i_322_
						   - Class495
							 .aClass163_5536
							 .method2649()));
	    Class573.aClass163_7673.method2656
		(i + i_323_ - Class495.aClass163_5536.method2647(),
		 i_322_ + i_324_ - Class495.aClass163_5536.method2649());
	}
    }
    
    static void method1527(Class185 class185) {
	int i = Class627.anInt8175 * -620506573;
	int i_331_ = anInt782 * -260575397;
	int i_332_ = Class641.anInt8340 * -1739196959;
	int i_333_ = Class327_Sub1.anInt9991 * -577412881 - 3;
	int i_334_ = 20;
	if (null == Class57.aClass171_458 || Class287.aClass16_3084 == null) {
	    Class57.aClass171_458
		= (Class171) (Class351.aClass406_3620.method6650
			      (client.anInterface52_11081,
			       Class534_Sub34.anInt10732 * 1630972005, true,
			       true, (byte) 0));
	    Class287.aClass16_3084
		= (Class351.aClass406_3620.method6666
		   (client.anInterface52_11081,
		    1630972005 * Class534_Sub34.anInt10732, (byte) 124));
	    if (Class57.aClass171_458 != null
		&& null != Class287.aClass16_3084) {
		Class44_Sub16.method17357((byte) 77);
		int i_335_ = i + i_332_ / 2;
		if (i_332_ + i_335_ > 1771907305 * Class706_Sub4.anInt10994)
		    i_335_ = Class706_Sub4.anInt10994 * 1771907305 - i_332_;
		if (i_335_ < 0)
		    i_335_ = 0;
		Class43.method1073(i_335_, anInt782 * -260575397, 1543773986);
		return;
	    }
	}
	Class171 class171;
	if (null == Class57.aClass171_458 || Class287.aClass16_3084 == null)
	    class171 = Class231.aClass171_2325;
	else
	    class171 = Class57.aClass171_458;
	Class16 class16 = Class160.method2620(1770101340);
	Class48.method1136(class185, Class627.anInt8175 * -620506573,
			   -260575397 * anInt782,
			   Class641.anInt8340 * -1739196959,
			   -577412881 * Class327_Sub1.anInt9991, i_334_,
			   class171, class16,
			   Class58.aClass58_468.method1245((Class539
							    .aClass672_7171),
							   (byte) -65),
			   (byte) 65);
	int i_336_ = (255 - -692224873 * Class534_Sub27.anInt10588
		      - anInt785 * -1927425233);
	if (i_336_ < 0)
	    i_336_ = 0;
	int i_337_ = Class81.aClass563_834.method9493(-1588186489);
	int i_338_ = Class81.aClass563_834.method9477(748010966);
	if (!aBool766) {
	    int i_339_ = 0;
	    for (Class534_Sub18_Sub7 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			aClass700_771.method14135((byte) -1));
		 class534_sub18_sub7 != null;
		 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			aClass700_771.method14139(1441208300))) {
		int i_340_ = (-238165825 * anInt754 * (324852453 * anInt765 - 1
						       - i_339_)
			      + (1 + (102396103 * class16.anInt190
				      + (i_334_ + i_331_))));
		if (i_337_ > -620506573 * Class627.anInt8175
		    && i_337_ < (-620506573 * Class627.anInt8175
				 + Class641.anInt8340 * -1739196959)
		    && i_338_ > i_340_ - 102396103 * class16.anInt190 - 1
		    && i_338_ < class16.anInt189 * 728893755 + i_340_
		    && class534_sub18_sub7.aBool11705)
		    class185.method3298(-620506573 * Class627.anInt8175,
					i_340_ - 102396103 * class16.anInt190,
					-1739196959 * Class641.anInt8340,
					-238165825 * anInt754,
					(i_336_ << 24
					 | 1625251985 * Class392.anInt4082),
					1);
		i_339_++;
	    }
	} else {
	    int i_341_ = 0;
	    for (Class534_Sub18_Sub11 class534_sub18_sub11
		     = ((Class534_Sub18_Sub11)
			aClass696_772.method14078(1221951837));
		 null != class534_sub18_sub11;
		 class534_sub18_sub11
		     = ((Class534_Sub18_Sub11)
			aClass696_772.method14080((byte) 122))) {
		int i_342_ = (-238165825 * anInt754 * i_341_
			      + (1 + (class16.anInt190 * 102396103
				      + (i_334_ + i_331_))));
		if (i_337_ > -620506573 * Class627.anInt8175
		    && i_337_ < (Class627.anInt8175 * -620506573
				 + -1739196959 * Class641.anInt8340)
		    && i_338_ > i_342_ - 102396103 * class16.anInt190 - 1
		    && i_338_ < i_342_ + 728893755 * class16.anInt189
		    && (-475442105 * class534_sub18_sub11.anInt11795 > 1
			|| (((Class534_Sub18_Sub7)
			     (class534_sub18_sub11.aClass696_11794
			      .aClass534_Sub18_8785.aClass534_Sub18_10510))
			    .aBool11705)))
		    class185.method3298(-620506573 * Class627.anInt8175,
					i_342_ - 102396103 * class16.anInt190,
					Class641.anInt8340 * -1739196959,
					-238165825 * anInt754,
					(i_336_ << 24
					 | Class392.anInt4082 * 1625251985),
					1);
		i_341_++;
	    }
	    if (null != aClass534_Sub18_Sub11_760) {
		Class48.method1136(class185, -1803884121 * Class112.anInt1364,
				   892411561 * Class150.anInt1699,
				   Class536_Sub4.anInt10366 * -2123561997,
				   -417346889 * Class281.anInt3062, i_334_,
				   class171, class16,
				   aClass534_Sub18_Sub11_760.aString11793,
				   (byte) -17);
		i_341_ = 0;
		for (Class534_Sub18_Sub7 class534_sub18_sub7
			 = (Class534_Sub18_Sub7) aClass534_Sub18_Sub11_760
						     .aClass696_11794
						     .method14078(1221951837);
		     class534_sub18_sub7 != null;
		     class534_sub18_sub7
			 = (Class534_Sub18_Sub7) aClass534_Sub18_Sub11_760
						     .aClass696_11794
						     .method14080((byte) 62)) {
		    int i_343_
			= (anInt754 * -238165825 * i_341_
			   + (1 + (i_334_ + Class150.anInt1699 * 892411561
				   + 102396103 * class16.anInt190)));
		    if (i_337_ > Class112.anInt1364 * -1803884121
			&& i_337_ < (Class536_Sub4.anInt10366 * -2123561997
				     + Class112.anInt1364 * -1803884121)
			&& i_338_ > i_343_ - class16.anInt190 * 102396103 - 1
			&& i_338_ < i_343_ + 728893755 * class16.anInt189
			&& class534_sub18_sub7.aBool11705)
			class185.method3298
			    (Class112.anInt1364 * -1803884121,
			     i_343_ - 102396103 * class16.anInt190,
			     Class536_Sub4.anInt10366 * -2123561997,
			     -238165825 * anInt754,
			     i_336_ << 24 | Class392.anInt4082 * 1625251985,
			     1);
		    i_341_++;
		}
		Class614.method10121(class185,
				     Class112.anInt1364 * -1803884121,
				     892411561 * Class150.anInt1699,
				     -2123561997 * Class536_Sub4.anInt10366,
				     -417346889 * Class281.anInt3062, i_334_,
				     531343844);
	    }
	}
	Class614.method10121(class185, Class627.anInt8175 * -620506573,
			     -260575397 * anInt782,
			     -1739196959 * Class641.anInt8340,
			     Class327_Sub1.anInt9991 * -577412881, i_334_,
			     602127472);
	if (!aBool766) {
	    int i_344_ = 0;
	    for (Class534_Sub18_Sub7 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			aClass700_771.method14135((byte) -1));
		 null != class534_sub18_sub7;
		 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			aClass700_771.method14139(1305911697))) {
		int i_345_
		    = (102396103 * class16.anInt190 + (i_334_ + i_331_) + 1
		       + (324852453 * anInt765 - 1 - i_344_) * (anInt754
								* -238165825));
		Class87.method1709(i_337_, i_338_, i, i_331_, i_332_, i_333_,
				   i_345_, class534_sub18_sub7, class171,
				   class16,
				   (Class200_Sub5.anInt9903 * 1593226795
				    | ~0xffffff),
				   Class483.anInt5280 * 2009199567 | ~0xffffff,
				   (byte) 0);
		i_344_++;
	    }
	} else {
	    int i_346_ = 0;
	    for (Class534_Sub18_Sub11 class534_sub18_sub11
		     = ((Class534_Sub18_Sub11)
			aClass696_772.method14078(1221951837));
		 class534_sub18_sub11 != null;
		 class534_sub18_sub11
		     = ((Class534_Sub18_Sub11)
			aClass696_772.method14080((byte) 15))) {
		int i_347_ = (anInt754 * -238165825 * i_346_
			      + (-260575397 * anInt782 + i_334_
				 + 102396103 * class16.anInt190 + 1));
		if (-475442105 * class534_sub18_sub11.anInt11795 == 1)
		    Class87.method1709
			(i_337_, i_338_, Class627.anInt8175 * -620506573,
			 -260575397 * anInt782,
			 -1739196959 * Class641.anInt8340,
			 -577412881 * Class327_Sub1.anInt9991, i_347_,
			 ((Class534_Sub18_Sub7)
			  (class534_sub18_sub11.aClass696_11794
			   .aClass534_Sub18_8785.aClass534_Sub18_10510)),
			 class171, class16,
			 1593226795 * Class200_Sub5.anInt9903 | ~0xffffff,
			 Class483.anInt5280 * 2009199567 | ~0xffffff,
			 (byte) 0);
		else
		    Class536_Sub4.method15994
			(i_337_, i_338_, Class627.anInt8175 * -620506573,
			 -260575397 * anInt782,
			 -1739196959 * Class641.anInt8340,
			 -577412881 * Class327_Sub1.anInt9991, i_347_,
			 class534_sub18_sub11, class171, class16,
			 Class200_Sub5.anInt9903 * 1593226795 | ~0xffffff,
			 2009199567 * Class483.anInt5280 | ~0xffffff,
			 (byte) 36);
		i_346_++;
	    }
	    if (null != aClass534_Sub18_Sub11_760) {
		i_346_ = 0;
		for (Class534_Sub18_Sub7 class534_sub18_sub7
			 = (Class534_Sub18_Sub7) aClass534_Sub18_Sub11_760
						     .aClass696_11794
						     .method14078(1221951837);
		     class534_sub18_sub7 != null;
		     class534_sub18_sub7
			 = ((Class534_Sub18_Sub7)
			    aClass534_Sub18_Sub11_760.aClass696_11794
				.method14080((byte) 125))) {
		    int i_348_ = (-238165825 * anInt754 * i_346_
				  + (892411561 * Class150.anInt1699 + i_334_
				     + class16.anInt190 * 102396103 + 1));
		    Class87.method1709(i_337_, i_338_,
				       -1803884121 * Class112.anInt1364,
				       892411561 * Class150.anInt1699,
				       -2123561997 * Class536_Sub4.anInt10366,
				       Class281.anInt3062 * -417346889, i_348_,
				       class534_sub18_sub7, class171, class16,
				       (1593226795 * Class200_Sub5.anInt9903
					| ~0xffffff),
				       (Class483.anInt5280 * 2009199567
					| ~0xffffff),
				       (byte) 0);
		    i_346_++;
		}
	    }
	}
    }
    
    static boolean method1528() {
	if (null == Class331.aClass534_Sub18_Sub7_3496)
	    return false;
	if (-1986934021 * Class331.aClass534_Sub18_Sub7_3496.anInt11706
	    >= 2000)
	    Class331.aClass534_Sub18_Sub7_3496.anInt11706 -= 585141872;
	if (1007
	    == Class331.aClass534_Sub18_Sub7_3496.anInt11706 * -1986934021)
	    return true;
	return false;
    }
    
    public static Class534_Sub18_Sub7 method1529() {
	return Class271.aClass534_Sub18_Sub7_2963;
    }
    
    static String method1530(Class534_Sub18_Sub11 class534_sub18_sub11) {
	return new StringBuilder().append
		   (class534_sub18_sub11.aString11793).append
		   (Class154.method2575(16777215, 867965675)).append
		   (" >").toString();
    }
    
    static void method1531(Class185 class185, int i, int i_349_, int i_350_,
			   int i_351_, int i_352_, Class171 class171,
			   Class16 class16, String string) {
	int i_353_
	    = 255 - -1558940039 * Class303.anInt3253 - -1927425233 * anInt785;
	if (i_353_ < 0)
	    i_353_ = 0;
	if (null == Class47.aClass163_354 || null == Class489.aClass163_5313) {
	    if (Class464.aClass472_5113
		    .method7670(Class676.anInt8651 * -118519815, (byte) -44)
		&& Class464.aClass472_5113.method7670((1950013631
						       * Class331.anInt3499),
						      (byte) -36)) {
		Class47.aClass163_354
		    = (class185.method3279
		       (Class178.method2949(Class464.aClass472_5113,
					    -118519815 * Class676.anInt8651,
					    0),
			true));
		Class169 class169
		    = Class178.method2949(Class464.aClass472_5113,
					  1950013631 * Class331.anInt3499, 0);
		Class489.aClass163_5313 = class185.method3279(class169, true);
		class169.method2806();
		Class274.aClass163_3040 = class185.method3279(class169, true);
	    } else
		class185.method3298(i, i_349_, i_350_, i_352_,
				    (i_353_ << 24
				     | Class480.anInt5262 * 400215733),
				    1);
	}
	if (null != Class47.aClass163_354 && null != Class489.aClass163_5313) {
	    int i_354_ = ((i_350_ - Class489.aClass163_5313.method2647() * 2)
			  / Class47.aClass163_354.method2647());
	    for (int i_355_ = 0; i_355_ < i_354_; i_355_++)
		Class47.aClass163_354.method2656
		    ((i + Class489.aClass163_5313.method2647()
		      + i_355_ * Class47.aClass163_354.method2647()),
		     i_349_);
	    Class489.aClass163_5313.method2656(i, i_349_);
	    Class274.aClass163_3040.method2656(i_350_ + i - Class274
								.aClass163_3040
								.method2647(),
					       i_349_);
	}
	class171.method2828(string, i + 3,
			    ((20 - class16.anInt190 * 102396103) / 2
			     + (102396103 * class16.anInt190 + i_349_)),
			    Class200_Sub5.anInt9903 * 1593226795 | ~0xffffff,
			    -1, (byte) 36);
	class185.method3298(i, i_352_ + i_349_, i_350_, i_351_ - i_352_,
			    i_353_ << 24 | Class480.anInt5262 * 400215733, 1);
    }
    
    static String method1532(int[] is) {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i = 0; i < is.length; i++) {
	    Class273 class273
		= ((Class273)
		   Class223.aClass53_Sub2_2316.method91(is[i], -790288852));
	    if (-1 != 2044266729 * class273.anInt3015)
		stringbuilder.append(" <sprite=").append
		    (class273.anInt3015 * 2044266729).append(">");
	}
	return stringbuilder.toString();
    }
    
    static String method1533(int[] is) {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i = 0; i < is.length; i++) {
	    Class273 class273
		= ((Class273)
		   Class223.aClass53_Sub2_2316.method91(is[i], 1212400207));
	    if (-1 != 2044266729 * class273.anInt3015)
		stringbuilder.append(" <sprite=").append
		    (class273.anInt3015 * 2044266729).append(">");
	}
	return stringbuilder.toString();
    }
    
    static boolean method1534(int i) {
	return 57 == i || i == 58 || i == 1007 || i == 25 || 30 == i;
    }
    
    static boolean method1535(int i) {
	return 57 == i || i == 58 || i == 1007 || i == 25 || 30 == i;
    }
    
    static String method1536(Class247 class247, int i) {
	if (!client.method17392(class247).method16264(i, (byte) -80)
	    && class247.anObjectArray2619 == null)
	    return null;
	if (null == class247.aStringArray2487
	    || class247.aStringArray2487.length <= i
	    || null == class247.aStringArray2487[i]
	    || class247.aStringArray2487[i].trim().length() == 0) {
	    if (client.aBool11087)
		return new StringBuilder().append("Hidden-").append(i)
			   .toString();
	    return null;
	}
	return class247.aStringArray2487[i];
    }
    
    static boolean method1537(int i) {
	if (18 == i || i == 19 || 20 == i || 21 == i || 22 == i || i == 1004)
	    return true;
	if (17 == i)
	    return true;
	return false;
    }
    
    static boolean method1538(int i) {
	if (9 == i || 10 == i || i == 11 || 12 == i || 13 == i || 1003 == i)
	    return true;
	if (i == 8)
	    return true;
	return false;
    }
    
    static void method1539(int i) {
	for (Class534_Sub18_Sub7 class534_sub18_sub7
		 = (Class534_Sub18_Sub7) aClass700_771.method14135((byte) -1);
	     class534_sub18_sub7 != null;
	     class534_sub18_sub7 = ((Class534_Sub18_Sub7)
				    aClass700_771.method14139(670575692))) {
	    if (Class591.method9883((-1986934021
				     * class534_sub18_sub7.anInt11706),
				    (byte) -65)
		&& class534_sub18_sub7.anInt11704 * -1180225371 >> 16 == i)
		Class70.method1408(class534_sub18_sub7, 1212359242);
	}
    }
    
    public static void method1540() {
	Class582.method9834((byte) 123);
	aBool758 = false;
	Class316.method5724(Class627.anInt8175 * -620506573,
			    anInt782 * -260575397,
			    -1739196959 * Class641.anInt8340,
			    -577412881 * Class327_Sub1.anInt9991, (byte) 1);
	Class251.aClass534_Sub18_Sub7_2653 = null;
	Class271.aClass534_Sub18_Sub7_2963 = null;
    }
    
    static boolean method1541() {
	return anInt765 * 324852453 > 0;
    }
    
    public static void method1542() {
	Class582.method9834((byte) 71);
	aBool758 = false;
	Class316.method5724(Class627.anInt8175 * -620506573,
			    anInt782 * -260575397,
			    -1739196959 * Class641.anInt8340,
			    -577412881 * Class327_Sub1.anInt9991, (byte) 1);
	Class251.aClass534_Sub18_Sub7_2653 = null;
	Class271.aClass534_Sub18_Sub7_2963 = null;
    }
    
    public static void method1543() {
	Class489.aClass163_5313 = null;
	Class274.aClass163_3040 = null;
	Class47.aClass163_354 = null;
	Class579.aClass163_7758 = null;
	Class245.aClass163_2418 = null;
	Class43.aClass163_324 = null;
	Class495.aClass163_5536 = null;
	Class573.aClass163_7673 = null;
	Class57.aClass171_458 = null;
	Class287.aClass16_3084 = null;
    }
    
    static int method1544(Class534_Sub18_Sub11 class534_sub18_sub11,
			  Class16 class16) {
	String string = Class635.method10539(class534_sub18_sub11, 536757189);
	return class16.method748(string, Class658.aClass163Array8541,
				 (byte) 74);
    }
    
    static void method1545
	(Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1,
	 boolean bool) {
	if (324852453 * anInt765 < 407) {
	    Class307 class307 = class654_sub1_sub5_sub1_sub1.aClass307_12204;
	    String string = class654_sub1_sub5_sub1_sub1.aString12201;
	    if (null != class307.anIntArray3284) {
		class307
		    = class307.method5615(Class78.aClass103_825,
					  Class78.aClass103_825, -1466068515);
		if (class307 == null)
		    return;
		string = class307.aString3337;
	    }
	    if (class307.aBool3313) {
		if (class654_sub1_sub5_sub1_sub1.anInt12192 * 1691897137
		    != 0) {
		    String string_356_
			= (client.aClass675_11016 == Class675.aClass675_8635
			   ? Class58.aClass58_597.method1245((Class539
							      .aClass672_7171),
							     (byte) -84)
			   : Class58.aClass58_595.method1245((Class539
							      .aClass672_7171),
							     (byte) -104));
		    string = new StringBuilder().append(string).append
				 (Class292.method5304
				  ((class654_sub1_sub5_sub1_sub1.anInt12192
				    * 1691897137),
				   (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
				    .anInt12210) * 1423663301,
				   -1571810361))
				 .append
				 (Class29.aString261).append
				 (string_356_).append
				 (1691897137
				  * class654_sub1_sub5_sub1_sub1.anInt12192)
				 .append
				 (Class29.aString259).toString();
		}
		if (client.aBool11218 && !bool) {
		    Class90 class90
			= (Class90) (-1 != 410979031 * Class392_Sub1.anInt10224
				     ? (Class534_Sub11_Sub13
					    .aClass44_Sub22_11730.method91
					(Class392_Sub1.anInt10224 * 410979031,
					 728142134))
				     : null);
		    if (0 != (Class200_Sub14.anInt9950 * 460977285 & 0x2)
			&& (class90 == null
			    || (class307.method5613((Class392_Sub1.anInt10224
						     * 410979031),
						    (class90.anInt888
						     * 263946597),
						    -1442128732)
				!= class90.anInt888 * 263946597)))
			Class112.method2016
			    (client.aString11221,
			     new StringBuilder().append
				 (client.aString11222).append
				 (" ").append
				 (Class29.aString263).append
				 (" ").append
				 (Class154.method2575(16776960, -48825401))
				 .append
				 (string).toString(),
			     Class460.anInt5069 * -731032933, 8, -1,
			     (long) (1126388985 * (class654_sub1_sub5_sub1_sub1
						   .anInt11922)),
			     0, 0, true, false,
			     (long) (1126388985 * (class654_sub1_sub5_sub1_sub1
						   .anInt11922)),
			     false, (short) 5007);
		}
		if (!bool) {
		    String[] strings = class307.aStringArray3286;
		    boolean bool_357_ = false;
		    if (client.aBool11230)
			strings = Class200.method3857(strings, (byte) 87);
		    if (strings != null) {
		    while_175_:
			for (int i = strings.length - 1; i >= 0; i--) {
			    if (strings[i] != null
				&& 0 == ((-1134759455
					  * (class654_sub1_sub5_sub1_sub1
					     .anInt12208))
					 & 1 << i)) {
				short i_358_ = client.aShortArray11286[i];
				int i_359_ = client.anInt11216 * 2068410197;
				int i_360_
				    = class307.method5617(i, -1330090596);
				if (i_360_ != -1)
				    i_359_ = i_360_;
				boolean bool_361_
				    = (strings[i].equalsIgnoreCase
				       (Class58.aClass58_590.method1245
					(Class539.aClass672_7171,
					 (byte) -111)));
				boolean bool_362_
				    = (strings[i].equalsIgnoreCase
				       (Class58.aClass58_589.method1245
					(Class539.aClass672_7171,
					 (byte) -96)));
				if (bool_361_ || bool_362_) {
				    if (bool_357_)
					continue;
				    switch (client.aClass635_11328.anInt8301
					    * 294429925) {
				    case 1:
					bool_357_ = true;
					continue while_175_;
				    case 2:
				    case 3:
					if (1 == class307.aByte3340)
					    bool_357_ = true;
					else
					    break;
					continue while_175_;
				    case 0:
					if (!bool_361_)
					    break;
					continue while_175_;
				    }
				    if (bool_361_)
					i_359_
					    = 235545833 * class307.anInt3299;
				}
				Class112.method2016
				    (strings[i],
				     new StringBuilder().append
					 (Class154.method2575(16776960,
							      611311434))
					 .append
					 (string).toString(),
				     i_359_, i_358_, -1,
				     (long) (1126388985
					     * (class654_sub1_sub5_sub1_sub1
						.anInt11922)),
				     0, 0, true, false,
				     (long) (1126388985
					     * (class654_sub1_sub5_sub1_sub1
						.anInt11922)),
				     false, (short) 27077);
			    }
			}
			if (bool_357_) {
			    for (int i = 0; i < strings.length; i++) {
				if (null != strings[i]
				    && ((class654_sub1_sub5_sub1_sub1
					 .anInt12208) * -1134759455
					& 1 << i) == 0) {
				    boolean bool_363_
					= (strings[i].equalsIgnoreCase
					   (Class58.aClass58_590.method1245
					    (Class539.aClass672_7171,
					     (byte) -19)));
				    boolean bool_364_
					= (strings[i].equalsIgnoreCase
					   (Class58.aClass58_589.method1245
					    (Class539.aClass672_7171,
					     (byte) -84)));
				    if (bool_363_ || bool_364_) {
					short i_365_
					    = client.aShortArray11286[i];
					int i_366_
					    = client.anInt11216 * 2068410197;
					int i_367_
					    = class307.method5617(i,
								  113962908);
					if (i_367_ != -1)
					    i_366_ = i_367_;
					if ((Class635.aClass635_8302
					     == client.aClass635_11328)
					    || ((Class635.aClass635_8298
						 == client.aClass635_11328)
						&& ((1691897137
						     * (class654_sub1_sub5_sub1_sub1
							.anInt12192))
						    > ((Class322
							.aClass654_Sub1_Sub5_Sub1_Sub2_3419
							.anInt12210)
						       * 1423663301))))
					    i_365_ += 2000;
					if (bool_363_)
					    i_366_ = (235545833
						      * class307.anInt3299);
					Class112.method2016
					    (strings[i],
					     new StringBuilder().append
						 (Class154.method2575
						  (16776960, -1222592741))
						 .append
						 (string).toString(),
					     i_366_, i_365_, -1,
					     (long) (1126388985
						     * (class654_sub1_sub5_sub1_sub1
							.anInt11922)),
					     0, 0, true, false,
					     (long) ((class654_sub1_sub5_sub1_sub1
						      .anInt11922)
						     * 1126388985),
					     false, (short) 26655);
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    static void method1546
	(Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2,
	 boolean bool) {
	if (anInt765 * 324852453 < 407) {
	    if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
		== class654_sub1_sub5_sub1_sub2) {
		if (client.aBool11218
		    && (Class200_Sub14.anInt9950 * 460977285 & 0x10) != 0)
		    Class112.method2016
			(client.aString11221,
			 new StringBuilder().append(client.aString11222).append
			     (" ").append
			     (Class29.aString263).append
			     (" ").append
			     (Class154.method2575(16777215, -396382010)).append
			     (Class58.aClass58_568.method1245
			      (Class539.aClass672_7171, (byte) -20))
			     .toString(),
			 Class460.anInt5069 * -731032933, 16, -1, 0L, 0, 0,
			 true, false,
			 (long) (class654_sub1_sub5_sub1_sub2.anInt11922
				 * 1126388985),
			 false, (short) 22525);
	    } else {
		String string;
		if (0
		    == class654_sub1_sub5_sub1_sub2.anInt12221 * -825066439) {
		    boolean bool_368_ = true;
		    if ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.anInt12220
			 * 800727223) != -1
			&& (800727223 * class654_sub1_sub5_sub1_sub2.anInt12220
			    != -1)) {
			int i = (((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
				   .anInt12220) * 800727223
				  < (class654_sub1_sub5_sub1_sub2.anInt12220
				     * 800727223))
				 ? (800727223
				    * (Class322
				       .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				       .anInt12220))
				 : (class654_sub1_sub5_sub1_sub2.anInt12220
				    * 800727223));
			int i_369_
			    = ((1423663301
				* (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
				   .anInt12210))
			       - (1423663301
				  * class654_sub1_sub5_sub1_sub2.anInt12210));
			if (i_369_ < 0)
			    i_369_ = -i_369_;
			if (i_369_ > i)
			    bool_368_ = false;
		    }
		    String string_370_
			= (client.aClass675_11016 == Class675.aClass675_8635
			   ? Class58.aClass58_597.method1245((Class539
							      .aClass672_7171),
							     (byte) -36)
			   : Class58.aClass58_595.method1245((Class539
							      .aClass672_7171),
							     (byte) -70));
		    if (class654_sub1_sub5_sub1_sub2.anInt12210 * 1423663301
			>= (class654_sub1_sub5_sub1_sub2.anInt12219
			    * -2058823415))
			string
			    = new StringBuilder().append
				  (class654_sub1_sub5_sub1_sub2
				       .method18877(true, 2131648182))
				  .append
				  (bool_368_
				   ? (Class292.method5304
				      ((1423663301
					* (class654_sub1_sub5_sub1_sub2
					   .anInt12210)),
				       (Class322
					.aClass654_Sub1_Sub5_Sub1_Sub2_3419
					.anInt12210) * 1423663301,
				       -1300691990))
				   : Class154.method2575(16777215, 1863094932))
				  .append
				  (Class29.aString261).append
				  (string_370_).append
				  (class654_sub1_sub5_sub1_sub2.anInt12210
				   * 1423663301)
				  .append
				  (Class29.aString259).toString();
		    else
			string
			    = new StringBuilder().append
				  (class654_sub1_sub5_sub1_sub2
				       .method18877(true, 845914274))
				  .append
				  (bool_368_
				   ? (Class292.method5304
				      ((1423663301
					* (class654_sub1_sub5_sub1_sub2
					   .anInt12210)),
				       (Class322
					.aClass654_Sub1_Sub5_Sub1_Sub2_3419
					.anInt12210) * 1423663301,
				       -1805008861))
				   : Class154.method2575(16777215, 318007667))
				  .append
				  (Class29.aString261).append
				  (string_370_).append
				  (class654_sub1_sub5_sub1_sub2.anInt12210
				   * 1423663301)
				  .append
				  ("+").append
				  ((-2058823415
				    * class654_sub1_sub5_sub1_sub2.anInt12219)
				   - 1423663301 * (class654_sub1_sub5_sub1_sub2
						   .anInt12210))
				  .append
				  (Class29.aString259).toString();
		} else if (-825066439 * class654_sub1_sub5_sub1_sub2.anInt12221
			   == -1)
		    string
			= class654_sub1_sub5_sub1_sub2.method18877(true,
								   1154367507);
		else
		    string = new StringBuilder().append
				 (class654_sub1_sub5_sub1_sub2
				      .method18877(true, 2145177385))
				 .append
				 (Class29.aString261).append
				 (Class58.aClass58_596.method1245
				  (Class539.aClass672_7171, (byte) -81))
				 .append
				 (-825066439
				  * class654_sub1_sub5_sub1_sub2.anInt12221)
				 .append
				 (Class29.aString259).toString();
		boolean bool_371_ = false;
		if (null != class654_sub1_sub5_sub1_sub2.aClass631_12226
		    && (class654_sub1_sub5_sub1_sub2.aClass631_12226.anInt8212
			* 1568742735) != -1) {
		    Class307 class307
			= ((Class307)
			   (Class578.aClass44_Sub3_7743.method91
			    ((class654_sub1_sub5_sub1_sub2.aClass631_12226
			      .anInt8212) * 1568742735,
			     -747615559)));
		    if (class307.aBool3348) {
			bool_371_ = true;
			string = ((Class307)
				  (Class578.aClass44_Sub3_7743.method91
				   ((class654_sub1_sub5_sub1_sub2
				     .aClass631_12226.anInt8212) * 1568742735,
				    -400704106))).aString3337;
			if (0 != class307.anInt3301 * -927618257) {
			    String string_372_
				= ((Class675.aClass675_8635
				    == client.aClass675_11016)
				   ? (Class58.aClass58_597.method1245
				      (Class539.aClass672_7171, (byte) -19))
				   : (Class58.aClass58_595.method1245
				      (Class539.aClass672_7171, (byte) -57)));
			    string
				= new StringBuilder().append(string).append
				      (Class292.method5304
				       (class307.anInt3301 * -927618257,
					(1423663301
					 * (Class322
					    .aClass654_Sub1_Sub5_Sub1_Sub2_3419
					    .anInt12210)),
					-903902854))
				      .append
				      (Class29.aString261).append
				      (string_372_).append
				      (class307.anInt3301 * -927618257).append
				      (Class29.aString259).toString();
			}
		    }
		}
		if (client.aBool11218 && !bool
		    && (Class200_Sub14.anInt9950 * 460977285 & 0x8) != 0)
		    Class112.method2016
			(client.aString11221,
			 new StringBuilder().append(client.aString11222).append
			     (" ").append
			     (Class29.aString263).append
			     (" ").append
			     (Class154.method2575(16777215, -405894602)).append
			     (string).toString(),
			 Class460.anInt5069 * -731032933, 15, -1,
			 (long) (class654_sub1_sub5_sub1_sub2.anInt11922
				 * 1126388985),
			 0, 0, true, false,
			 (long) (1126388985
				 * class654_sub1_sub5_sub1_sub2.anInt11922),
			 false, (short) 6323);
		if (!bool) {
		    for (int i = 7; i >= 0; i--) {
			if (null != client.aStringArray11206[i]) {
			    short i_373_ = 0;
			    if (client.aStringArray11206[i].equalsIgnoreCase
				(Class58.aClass58_590.method1245
				 (Class539.aClass672_7171, (byte) -29))) {
				if (Class635.aClass635_8299
				    == client.aClass635_11117)
				    continue;
				if (client.aClass635_11117
				    == Class635.aClass635_8302)
				    i_373_ = (short) 2000;
				else if ((Class635.aClass635_8298
					  == client.aClass635_11117)
					 && ((class654_sub1_sub5_sub1_sub2
					      .anInt12210) * 1423663301
					     > (Class322
						.aClass654_Sub1_Sub5_Sub1_Sub2_3419
						.anInt12210) * 1423663301))
				    i_373_ = (short) 2000;
				if ((Class322
				     .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				     .anInt12224) * 676699829 != 0
				    && 0 != (676699829
					     * (class654_sub1_sub5_sub1_sub2
						.anInt12224))) {
				    if ((Class322
					 .aClass654_Sub1_Sub5_Sub1_Sub2_3419
					 .anInt12224) * 676699829
					== (class654_sub1_sub5_sub1_sub2
					    .anInt12224) * 676699829)
					i_373_ = (short) 2000;
				    else
					i_373_ = (short) 0;
				} else if (class654_sub1_sub5_sub1_sub2
					   .aBool12234)
				    i_373_ = (short) 2000;
			    } else if (client.aBoolArray11207[i])
				i_373_ = (short) 2000;
			    short i_374_
				= (short) (i_373_
					   + client.aShortArray11203[i]);
			    int i_375_ = (-1 != client.anIntArray11205[i]
					  ? client.anIntArray11205[i]
					  : client.anInt11216 * 2068410197);
			    int i_376_ = bool_371_ ? 16776960 : 16777215;
			    Class112.method2016
				(client.aStringArray11206[i],
				 new StringBuilder().append
				     (Class154.method2575(i_376_, -1677807914))
				     .append
				     (string).toString(),
				 i_375_, i_374_, -1,
				 (long) ((class654_sub1_sub5_sub1_sub2
					  .anInt11922)
					 * 1126388985),
				 0, 0, true, false,
				 (long) ((class654_sub1_sub5_sub1_sub2
					  .anInt11922)
					 * 1126388985),
				 false, (short) 28484);
			}
		    }
		} else if (!bool_371_)
		    Class112.method2016(new StringBuilder().append
					    (Class154.method2575(13421772,
								 -406341272))
					    .append
					    (string).toString(),
					"", -1, -1, 0, 0L, 0, 0, false, true,
					(long) ((class654_sub1_sub5_sub1_sub2
						 .anInt11922)
						* 1126388985),
					false, (short) 14849);
		if (!bool && !bool_371_) {
		    for (Class534_Sub18_Sub7 class534_sub18_sub7
			     = ((Class534_Sub18_Sub7)
				aClass700_771.method14135((byte) -1));
			 class534_sub18_sub7 != null;
			 class534_sub18_sub7
			     = ((Class534_Sub18_Sub7)
				aClass700_771.method14139(1604145653))) {
			if (23
			    == -1986934021 * class534_sub18_sub7.anInt11706) {
			    class534_sub18_sub7.aString11710
				= new StringBuilder().append
				      (Class154.method2575(16777215,
							   514510655))
				      .append
				      (string).toString();
			    break;
			}
		    }
		}
	    }
	}
    }
    
    static void method1547
	(Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2,
	 boolean bool) {
	if (anInt765 * 324852453 < 407) {
	    if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
		== class654_sub1_sub5_sub1_sub2) {
		if (client.aBool11218
		    && (Class200_Sub14.anInt9950 * 460977285 & 0x10) != 0)
		    Class112.method2016
			(client.aString11221,
			 new StringBuilder().append(client.aString11222).append
			     (" ").append
			     (Class29.aString263).append
			     (" ").append
			     (Class154.method2575(16777215, 1776898054)).append
			     (Class58.aClass58_568.method1245
			      (Class539.aClass672_7171, (byte) -127))
			     .toString(),
			 Class460.anInt5069 * -731032933, 16, -1, 0L, 0, 0,
			 true, false,
			 (long) (class654_sub1_sub5_sub1_sub2.anInt11922
				 * 1126388985),
			 false, (short) 10318);
	    } else {
		String string;
		if (0
		    == class654_sub1_sub5_sub1_sub2.anInt12221 * -825066439) {
		    boolean bool_377_ = true;
		    if ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.anInt12220
			 * 800727223) != -1
			&& (800727223 * class654_sub1_sub5_sub1_sub2.anInt12220
			    != -1)) {
			int i = (((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
				   .anInt12220) * 800727223
				  < (class654_sub1_sub5_sub1_sub2.anInt12220
				     * 800727223))
				 ? (800727223
				    * (Class322
				       .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				       .anInt12220))
				 : (class654_sub1_sub5_sub1_sub2.anInt12220
				    * 800727223));
			int i_378_
			    = ((1423663301
				* (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
				   .anInt12210))
			       - (1423663301
				  * class654_sub1_sub5_sub1_sub2.anInt12210));
			if (i_378_ < 0)
			    i_378_ = -i_378_;
			if (i_378_ > i)
			    bool_377_ = false;
		    }
		    String string_379_
			= (client.aClass675_11016 == Class675.aClass675_8635
			   ? Class58.aClass58_597.method1245((Class539
							      .aClass672_7171),
							     (byte) -12)
			   : Class58.aClass58_595.method1245((Class539
							      .aClass672_7171),
							     (byte) -118));
		    if (class654_sub1_sub5_sub1_sub2.anInt12210 * 1423663301
			>= (class654_sub1_sub5_sub1_sub2.anInt12219
			    * -2058823415))
			string = new StringBuilder().append
				     (class654_sub1_sub5_sub1_sub2
					  .method18877(true, 1124864060))
				     .append
				     (bool_377_
				      ? (Class292.method5304
					 ((1423663301
					   * (class654_sub1_sub5_sub1_sub2
					      .anInt12210)),
					  (Class322
					   .aClass654_Sub1_Sub5_Sub1_Sub2_3419
					   .anInt12210) * 1423663301,
					  -1932734955))
				      : Class154.method2575(16777215,
							    -2073434796))
				     .append
				     (Class29.aString261).append
				     (string_379_).append
				     (class654_sub1_sub5_sub1_sub2.anInt12210
				      * 1423663301)
				     .append
				     (Class29.aString259).toString();
		    else
			string
			    = new StringBuilder().append
				  (class654_sub1_sub5_sub1_sub2
				       .method18877(true, 1305813928))
				  .append
				  (bool_377_
				   ? (Class292.method5304
				      ((1423663301
					* (class654_sub1_sub5_sub1_sub2
					   .anInt12210)),
				       (Class322
					.aClass654_Sub1_Sub5_Sub1_Sub2_3419
					.anInt12210) * 1423663301,
				       -2018988792))
				   : Class154.method2575(16777215, 1756874856))
				  .append
				  (Class29.aString261).append
				  (string_379_).append
				  (class654_sub1_sub5_sub1_sub2.anInt12210
				   * 1423663301)
				  .append
				  ("+").append
				  ((-2058823415
				    * class654_sub1_sub5_sub1_sub2.anInt12219)
				   - 1423663301 * (class654_sub1_sub5_sub1_sub2
						   .anInt12210))
				  .append
				  (Class29.aString259).toString();
		} else if (-825066439 * class654_sub1_sub5_sub1_sub2.anInt12221
			   == -1)
		    string
			= class654_sub1_sub5_sub1_sub2.method18877(true,
								   1988335925);
		else
		    string = new StringBuilder().append
				 (class654_sub1_sub5_sub1_sub2
				      .method18877(true, 2040470646))
				 .append
				 (Class29.aString261).append
				 (Class58.aClass58_596.method1245
				  (Class539.aClass672_7171, (byte) -53))
				 .append
				 (-825066439
				  * class654_sub1_sub5_sub1_sub2.anInt12221)
				 .append
				 (Class29.aString259).toString();
		boolean bool_380_ = false;
		if (null != class654_sub1_sub5_sub1_sub2.aClass631_12226
		    && (class654_sub1_sub5_sub1_sub2.aClass631_12226.anInt8212
			* 1568742735) != -1) {
		    Class307 class307
			= ((Class307)
			   (Class578.aClass44_Sub3_7743.method91
			    ((class654_sub1_sub5_sub1_sub2.aClass631_12226
			      .anInt8212) * 1568742735,
			     -1785048219)));
		    if (class307.aBool3348) {
			bool_380_ = true;
			string = ((Class307)
				  (Class578.aClass44_Sub3_7743.method91
				   ((class654_sub1_sub5_sub1_sub2
				     .aClass631_12226.anInt8212) * 1568742735,
				    1079532108))).aString3337;
			if (0 != class307.anInt3301 * -927618257) {
			    String string_381_
				= ((Class675.aClass675_8635
				    == client.aClass675_11016)
				   ? (Class58.aClass58_597.method1245
				      (Class539.aClass672_7171, (byte) -20))
				   : (Class58.aClass58_595.method1245
				      (Class539.aClass672_7171, (byte) -5)));
			    string
				= new StringBuilder().append(string).append
				      (Class292.method5304
				       (class307.anInt3301 * -927618257,
					(1423663301
					 * (Class322
					    .aClass654_Sub1_Sub5_Sub1_Sub2_3419
					    .anInt12210)),
					-930113454))
				      .append
				      (Class29.aString261).append
				      (string_381_).append
				      (class307.anInt3301 * -927618257).append
				      (Class29.aString259).toString();
			}
		    }
		}
		if (client.aBool11218 && !bool
		    && (Class200_Sub14.anInt9950 * 460977285 & 0x8) != 0)
		    Class112.method2016
			(client.aString11221,
			 new StringBuilder().append(client.aString11222).append
			     (" ").append
			     (Class29.aString263).append
			     (" ").append
			     (Class154.method2575(16777215, -278944602)).append
			     (string).toString(),
			 Class460.anInt5069 * -731032933, 15, -1,
			 (long) (class654_sub1_sub5_sub1_sub2.anInt11922
				 * 1126388985),
			 0, 0, true, false,
			 (long) (1126388985
				 * class654_sub1_sub5_sub1_sub2.anInt11922),
			 false, (short) 30161);
		if (!bool) {
		    for (int i = 7; i >= 0; i--) {
			if (null != client.aStringArray11206[i]) {
			    short i_382_ = 0;
			    if (client.aStringArray11206[i].equalsIgnoreCase
				(Class58.aClass58_590.method1245
				 (Class539.aClass672_7171, (byte) -15))) {
				if (Class635.aClass635_8299
				    == client.aClass635_11117)
				    continue;
				if (client.aClass635_11117
				    == Class635.aClass635_8302)
				    i_382_ = (short) 2000;
				else if ((Class635.aClass635_8298
					  == client.aClass635_11117)
					 && ((class654_sub1_sub5_sub1_sub2
					      .anInt12210) * 1423663301
					     > (Class322
						.aClass654_Sub1_Sub5_Sub1_Sub2_3419
						.anInt12210) * 1423663301))
				    i_382_ = (short) 2000;
				if ((Class322
				     .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				     .anInt12224) * 676699829 != 0
				    && 0 != (676699829
					     * (class654_sub1_sub5_sub1_sub2
						.anInt12224))) {
				    if ((Class322
					 .aClass654_Sub1_Sub5_Sub1_Sub2_3419
					 .anInt12224) * 676699829
					== (class654_sub1_sub5_sub1_sub2
					    .anInt12224) * 676699829)
					i_382_ = (short) 2000;
				    else
					i_382_ = (short) 0;
				} else if (class654_sub1_sub5_sub1_sub2
					   .aBool12234)
				    i_382_ = (short) 2000;
			    } else if (client.aBoolArray11207[i])
				i_382_ = (short) 2000;
			    short i_383_
				= (short) (i_382_
					   + client.aShortArray11203[i]);
			    int i_384_ = (-1 != client.anIntArray11205[i]
					  ? client.anIntArray11205[i]
					  : client.anInt11216 * 2068410197);
			    int i_385_ = bool_380_ ? 16776960 : 16777215;
			    Class112.method2016
				(client.aStringArray11206[i],
				 new StringBuilder().append
				     (Class154.method2575(i_385_, 1162964603))
				     .append
				     (string).toString(),
				 i_384_, i_383_, -1,
				 (long) ((class654_sub1_sub5_sub1_sub2
					  .anInt11922)
					 * 1126388985),
				 0, 0, true, false,
				 (long) ((class654_sub1_sub5_sub1_sub2
					  .anInt11922)
					 * 1126388985),
				 false, (short) 32242);
			}
		    }
		} else if (!bool_380_)
		    Class112.method2016(new StringBuilder().append
					    (Class154.method2575(13421772,
								 592863040))
					    .append
					    (string).toString(),
					"", -1, -1, 0, 0L, 0, 0, false, true,
					(long) ((class654_sub1_sub5_sub1_sub2
						 .anInt11922)
						* 1126388985),
					false, (short) 6726);
		if (!bool && !bool_380_) {
		    for (Class534_Sub18_Sub7 class534_sub18_sub7
			     = ((Class534_Sub18_Sub7)
				aClass700_771.method14135((byte) -1));
			 class534_sub18_sub7 != null;
			 class534_sub18_sub7
			     = ((Class534_Sub18_Sub7)
				aClass700_771.method14139(1693910794))) {
			if (23
			    == -1986934021 * class534_sub18_sub7.anInt11706) {
			    class534_sub18_sub7.aString11710
				= new StringBuilder().append
				      (Class154.method2575(16777215,
							   -1313060920))
				      .append
				      (string).toString();
			    break;
			}
		    }
		}
	    }
	}
    }
    
    static boolean method1548(int i) {
	return (i == 44 || 45 == i || i == 46 || i == 47 || i == 48 || i == 49
		|| i == 50 || i == 51 || i == 52 || i == 53 || i == 15);
    }
    
    static String method1549(int i, int i_386_) {
	int i_387_ = i_386_ - i;
	if (i_387_ < -9)
	    return Class154.method2575(16711680, -255601614);
	if (i_387_ < -6)
	    return Class154.method2575(16723968, 2079354000);
	if (i_387_ < -3)
	    return Class154.method2575(16740352, -1987946711);
	if (i_387_ < 0)
	    return Class154.method2575(16756736, -1621827122);
	if (i_387_ > 9)
	    return Class154.method2575(65280, -1819614983);
	if (i_387_ > 6)
	    return Class154.method2575(4259584, -1380580269);
	if (i_387_ > 3)
	    return Class154.method2575(8453888, 1010145585);
	if (i_387_ > 0)
	    return Class154.method2575(12648192, 270374093);
	return Class154.method2575(16776960, 122644646);
    }
    
    static String method1550(int i, int i_388_) {
	int i_389_ = i_388_ - i;
	if (i_389_ < -9)
	    return Class154.method2575(16711680, 73757918);
	if (i_389_ < -6)
	    return Class154.method2575(16723968, -1314118391);
	if (i_389_ < -3)
	    return Class154.method2575(16740352, -690019031);
	if (i_389_ < 0)
	    return Class154.method2575(16756736, -406461072);
	if (i_389_ > 9)
	    return Class154.method2575(65280, -117762976);
	if (i_389_ > 6)
	    return Class154.method2575(4259584, -9236497);
	if (i_389_ > 3)
	    return Class154.method2575(8453888, -1619275944);
	if (i_389_ > 0)
	    return Class154.method2575(12648192, 549826592);
	return Class154.method2575(16776960, -177069548);
    }
    
    static String method1551(int i, int i_390_) {
	int i_391_ = i_390_ - i;
	if (i_391_ < -9)
	    return Class154.method2575(16711680, -1363171657);
	if (i_391_ < -6)
	    return Class154.method2575(16723968, 771766749);
	if (i_391_ < -3)
	    return Class154.method2575(16740352, 900743695);
	if (i_391_ < 0)
	    return Class154.method2575(16756736, 1722996807);
	if (i_391_ > 9)
	    return Class154.method2575(65280, 600362942);
	if (i_391_ > 6)
	    return Class154.method2575(4259584, 2139981);
	if (i_391_ > 3)
	    return Class154.method2575(8453888, 566146852);
	if (i_391_ > 0)
	    return Class154.method2575(12648192, -2089763242);
	return Class154.method2575(16776960, -1641370377);
    }
    
    static void method1552() {
	Class62.aClass534_Sub18_Sub7_650
	    = new Class534_Sub18_Sub7((Class58.aClass58_554.method1245
				       (Class539.aClass672_7171, (byte) -127)),
				      "", 846725895 * client.anInt11215, 1006,
				      -1, 0L, 0, 0, true, false, 0L, true);
    }
    
    static void method1553(Class534_Sub18_Sub11 class534_sub18_sub11, int i) {
	if (aBool758) {
	    Class16 class16 = Class160.method2620(1770101340);
	    int i_392_ = 0;
	    for (Class534_Sub18_Sub7 class534_sub18_sub7
		     = (Class534_Sub18_Sub7) class534_sub18_sub11
						 .aClass696_11794
						 .method14078(1221951837);
		 null != class534_sub18_sub7;
		 class534_sub18_sub7
		     = (Class534_Sub18_Sub7) class534_sub18_sub11
						 .aClass696_11794
						 .method14080((byte) 66)) {
		int i_393_ = Class281.method5236(class534_sub18_sub7, class16,
						 -233638796);
		if (i_393_ > i_392_)
		    i_392_ = i_393_;
	    }
	    i_392_ += 8;
	    int i_394_
		= 21 + (-238165825 * anInt754
			* (-475442105 * class534_sub18_sub11.anInt11795));
	    Class281.anInt3062
		= (2050568967
		   * (-238165825 * anInt754 * (class534_sub18_sub11.anInt11795
					       * -475442105)
		      + (aBool784 ? 26 : 22)));
	    int i_395_ = (Class641.anInt8340 * -1739196959
			  + Class627.anInt8175 * -620506573);
	    if (i_395_ + i_392_ > 1771907305 * Class706_Sub4.anInt10994)
		i_395_ = -620506573 * Class627.anInt8175 - i_392_;
	    if (i_395_ < 0)
		i_395_ = 0;
	    int i_396_
		= aBool784 ? 1 + (102396103 * class16.anInt190 + 20) : 31;
	    int i_397_ = 1 + (i - i_396_ + 102396103 * class16.anInt190);
	    if (i_397_ + i_394_ > Class18.anInt205 * -1091172141)
		i_397_ = -1091172141 * Class18.anInt205 - i_394_;
	    if (i_397_ < 0)
		i_397_ = 0;
	    Class112.anInt1364 = -228643305 * i_395_;
	    Class150.anInt1699 = i_397_ * 1135371673;
	    Class536_Sub4.anInt10366 = i_392_ * 1938836795;
	    aClass534_Sub18_Sub11_760 = class534_sub18_sub11;
	}
    }
    
    static Class534_Sub19 method1554(int i, int i_398_, int i_399_) {
	Class534_Sub19 class534_sub19 = null;
	if (i_399_ == 0)
	    class534_sub19
		= Class346.method6128(Class404.aClass404_4153,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	if (i_399_ == 1)
	    class534_sub19
		= Class346.method6128(Class404.aClass404_4195,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	Class597 class597 = client.aClass512_11100.method8416((byte) 70);
	class534_sub19.aClass534_Sub40_Sub1_10513
	    .method16569(-424199969 * class597.anInt7859 + i, -1056974294);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16687
	    (i_398_ + -1166289421 * class597.anInt7861, 2093975658);
	class534_sub19.aClass534_Sub40_Sub1_10513
	    .method16559(Class479.method7916(-877455222) ? 1 : 0, 821991625);
	Class113.anInt1375 = -1660827629 * i;
	Class113.anInt1376 = 517634255 * i_398_;
	Class113.aBool1373 = false;
	Class453_Sub3.method15985(-2008509083);
	return class534_sub19;
    }
    
    static boolean method1555(Class603 class603) {
	return Class479.method7919(class603, null, 941710601);
    }
    
    static boolean method1556(int i, int i_400_) {
	if (i_400_ >= 1000 && i < 1000)
	    return true;
	if (i_400_ < 1000 && i < 1000) {
	    if (Class255.method4651(i, 16777472))
		return true;
	    if (Class255.method4651(i_400_, 16777472))
		return false;
	    return true;
	}
	if (i_400_ >= 1000 && i >= 1000)
	    return true;
	return false;
    }
    
    static boolean method1557(int i) {
	return (59 == i || i == 2 || 8 == i || i == 17 || 15 == i || 16 == i
		|| i == 58);
    }
    
    static void method1558(Class534_Sub18_Sub11 class534_sub18_sub11) {
	boolean bool = false;
	class534_sub18_sub11.method16180(-421776830);
	for (Class534_Sub18_Sub11 class534_sub18_sub11_401_
		 = ((Class534_Sub18_Sub11)
		    aClass696_772.method14078(1221951837));
	     null != class534_sub18_sub11_401_;
	     class534_sub18_sub11_401_
		 = ((Class534_Sub18_Sub11)
		    aClass696_772.method14080((byte) 106))) {
	    if (Class260.method4805(class534_sub18_sub11
					.method18342((byte) -44),
				    class534_sub18_sub11_401_
					.method18342((byte) -39),
				    1181791465)) {
		Class51.method1180(class534_sub18_sub11,
				   class534_sub18_sub11_401_, (byte) -124);
		bool = true;
		break;
	    }
	}
	if (!bool)
	    aClass696_772.method14076(class534_sub18_sub11, (byte) 54);
    }
    
    public static boolean method1559(int i, int i_402_) {
	return i != 1 && i != 7;
    }
    
    public static Class401[] method1560(int i) {
	return (new Class401[]
		{ Class401.aClass401_4134, Class401.aClass401_4135,
		  Class401.aClass401_4136 });
    }
    
    public static void method1561(int i, int i_403_) {
	Class530.anInt7130 = i * 1372860039;
    }
    
    static void method1562(Class534_Sub40 class534_sub40, int i) {
	int i_404_ = class534_sub40.method16546(-1706829710);
	Class311.aClass610Array3363 = new Class610[i_404_];
	for (int i_405_ = 0; i_405_ < i_404_; i_405_++) {
	    Class311.aClass610Array3363[i_405_] = new Class610();
	    Class311.aClass610Array3363[i_405_].anInt8008
		= class534_sub40.method16546(-1706829710) * -1175230789;
	    Class311.aClass610Array3363[i_405_].aString8009
		= class534_sub40.method16523(-1440015616);
	}
	Class619.anInt8108
	    = class534_sub40.method16546(-1706829710) * 90345431;
	Class619.anInt8109
	    = class534_sub40.method16546(-1706829710) * 952023123;
	Class542.anInt7183
	    = class534_sub40.method16546(-1706829710) * -377175777;
	Class619.aClass606_Sub1Array8107
	    = new Class606_Sub1[1 + (-1664594981 * Class619.anInt8109
				     - Class619.anInt8108 * 206492647)];
	for (int i_406_ = 0; i_406_ < Class542.anInt7183 * 1699576543;
	     i_406_++) {
	    int i_407_ = class534_sub40.method16546(-1706829710);
	    Class606_Sub1 class606_sub1
		= (Class619.aClass606_Sub1Array8107[i_407_]
		   = new Class606_Sub1());
	    class606_sub1.anInt7986
		= class534_sub40.method16527(-869469290) * -1901546263;
	    class606_sub1.anInt7985
		= class534_sub40.method16533(-258848859) * -410670017;
	    class606_sub1.anInt10859
		= class534_sub40.method16546(-1706829710) * 75958393;
	    if (231268809 * class606_sub1.anInt10859 != 0)
		class606_sub1.aString10860
		    = class534_sub40.method16523(-2095133891);
	    class606_sub1.anInt10861
		= -446830881 * (i_407_ + 206492647 * Class619.anInt8108);
	    class606_sub1.aString10858
		= class534_sub40.method16523(-1721736788);
	    class606_sub1.aString10857
		= class534_sub40.method16523(-1878984567);
	}
	Class619.anInt8110
	    = class534_sub40.method16533(-258848859) * 482540011;
	Class619.aBool8106 = true;
    }
}
