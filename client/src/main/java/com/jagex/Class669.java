/* Class669 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;
import java.util.Map;

public class Class669
{
    long[] aLongArray8586;
    long[] aLongArray8587;
    int anInt8588;
    int[] anIntArray8589 = new int[5];
    int[][] anIntArrayArray8590 = new int[5][5000];
    int[] anIntArray8591;
    Class666 aClass666_8592;
    Object[] anObjectArray8593;
    int anInt8594;
    int[] anIntArray8595 = new int[1000];
    int anInt8596;
    int anInt8597;
    Class659[] aClass659Array8598;
    Class666 aClass666_8599;
    int anInt8600 = 0;
    Class395 aClass395_8601;
    Class352 aClass352_8602;
    Interface62 anInterface62_8603;
    Class654_Sub1_Sub5_Sub1 aClass654_Sub1_Sub5_Sub1_8604;
    int[] anIntArray8605;
    Class534_Sub26 aClass534_Sub26_8606;
    Map aMap8607;
    Map aMap8608;
    Class654_Sub1_Sub4_Sub1 aClass654_Sub1_Sub4_Sub1_8609;
    int anInt8610;
    Object[] anObjectArray8611;
    Class515[] aClass515Array8612;
    int anInt8613;
    Class534_Sub18_Sub8 aClass534_Sub18_Sub8_8614;
    boolean aBool8615;
    static int anInt8616;
    
    Class669() {
	anObjectArray8593 = new Object[1000];
	anInt8594 = 0;
	aLongArray8587 = new long[1000];
	anInt8596 = 0;
	anInt8597 = 0;
	aClass659Array8598 = new Class659[50];
	aClass666_8599 = new Class666();
	aClass666_8592 = new Class666();
	aMap8607 = new HashMap();
	aMap8608 = new HashMap();
	anInt8588 = 0;
	anInt8613 = 793595371;
    }
    
    static void method11031(Class185 class185, int i) {
	int i_0_ = Class627.anInt8175 * -620506573;
	int i_1_ = Class72.anInt782 * -260575397;
	int i_2_ = Class641.anInt8340 * -1739196959;
	int i_3_ = Class327_Sub1.anInt9991 * -577412881 - 3;
	int i_4_ = 20;
	if (null == Class57.aClass171_458 || Class287.aClass16_3084 == null) {
	    Class57.aClass171_458
		= (Class171) (Class351.aClass406_3620.method6650
			      (client.anInterface52_11081,
			       Class534_Sub34.anInt10732 * 1630972005, true,
			       true, (byte) 0));
	    Class287.aClass16_3084
		= (Class351.aClass406_3620.method6666
		   (client.anInterface52_11081,
		    1630972005 * Class534_Sub34.anInt10732, (byte) 41));
	    if (Class57.aClass171_458 != null
		&& null != Class287.aClass16_3084) {
		Class44_Sub16.method17357((byte) 75);
		int i_5_ = i_0_ + i_2_ / 2;
		if (i_2_ + i_5_ > 1771907305 * Class706_Sub4.anInt10994)
		    i_5_ = Class706_Sub4.anInt10994 * 1771907305 - i_2_;
		if (i_5_ < 0)
		    i_5_ = 0;
		Class43.method1073(i_5_, Class72.anInt782 * -260575397,
				   1543773986);
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
			   -260575397 * Class72.anInt782,
			   Class641.anInt8340 * -1739196959,
			   -577412881 * Class327_Sub1.anInt9991, i_4_,
			   class171, class16,
			   Class58.aClass58_468.method1245((Class539
							    .aClass672_7171),
							   (byte) -123),
			   (byte) -62);
	int i_6_ = (255 - -692224873 * Class534_Sub27.anInt10588
		    - Class72.anInt785 * -1927425233);
	if (i_6_ < 0)
	    i_6_ = 0;
	int i_7_ = Class81.aClass563_834.method9493(-1721593172);
	int i_8_ = Class81.aClass563_834.method9477(1123936655);
	if (!Class72.aBool766) {
	    int i_9_ = 0;
	    for (Class534_Sub18_Sub7 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			Class72.aClass700_771.method14135((byte) -1));
		 class534_sub18_sub7 != null;
		 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			Class72.aClass700_771.method14139(1961802707))) {
		int i_10_
		    = ((-238165825 * Class72.anInt754
			* (324852453 * Class72.anInt765 - 1 - i_9_))
		       + (1 + (102396103 * class16.anInt190 + (i_4_ + i_1_))));
		if (i_7_ > -620506573 * Class627.anInt8175
		    && i_7_ < (-620506573 * Class627.anInt8175
			       + Class641.anInt8340 * -1739196959)
		    && i_8_ > i_10_ - 102396103 * class16.anInt190 - 1
		    && i_8_ < class16.anInt189 * 728893755 + i_10_
		    && class534_sub18_sub7.aBool11705)
		    class185.method3298(-620506573 * Class627.anInt8175,
					i_10_ - 102396103 * class16.anInt190,
					-1739196959 * Class641.anInt8340,
					-238165825 * Class72.anInt754,
					(i_6_ << 24
					 | 1625251985 * Class392.anInt4082),
					1);
		i_9_++;
	    }
	} else {
	    int i_11_ = 0;
	    for (Class534_Sub18_Sub11 class534_sub18_sub11
		     = ((Class534_Sub18_Sub11)
			Class72.aClass696_772.method14078(1221951837));
		 null != class534_sub18_sub11;
		 class534_sub18_sub11
		     = ((Class534_Sub18_Sub11)
			Class72.aClass696_772.method14080((byte) 45))) {
		int i_12_
		    = (-238165825 * Class72.anInt754 * i_11_
		       + (1 + (class16.anInt190 * 102396103 + (i_4_ + i_1_))));
		if (i_7_ > -620506573 * Class627.anInt8175
		    && i_7_ < (Class627.anInt8175 * -620506573
			       + -1739196959 * Class641.anInt8340)
		    && i_8_ > i_12_ - 102396103 * class16.anInt190 - 1
		    && i_8_ < i_12_ + 728893755 * class16.anInt189
		    && (-475442105 * class534_sub18_sub11.anInt11795 > 1
			|| (((Class534_Sub18_Sub7)
			     (class534_sub18_sub11.aClass696_11794
			      .aClass534_Sub18_8785.aClass534_Sub18_10510))
			    .aBool11705)))
		    class185.method3298(-620506573 * Class627.anInt8175,
					i_12_ - 102396103 * class16.anInt190,
					Class641.anInt8340 * -1739196959,
					-238165825 * Class72.anInt754,
					(i_6_ << 24
					 | Class392.anInt4082 * 1625251985),
					1);
		i_11_++;
	    }
	    if (null != Class72.aClass534_Sub18_Sub11_760) {
		Class48.method1136(class185, -1803884121 * Class112.anInt1364,
				   892411561 * Class150.anInt1699,
				   Class536_Sub4.anInt10366 * -2123561997,
				   -417346889 * Class281.anInt3062, i_4_,
				   class171, class16,
				   (Class72.aClass534_Sub18_Sub11_760
				    .aString11793),
				   (byte) -34);
		i_11_ = 0;
		for (Class534_Sub18_Sub7 class534_sub18_sub7
			 = ((Class534_Sub18_Sub7)
			    Class72.aClass534_Sub18_Sub11_760
				.aClass696_11794.method14078(1221951837));
		     class534_sub18_sub7 != null;
		     class534_sub18_sub7
			 = ((Class534_Sub18_Sub7)
			    Class72.aClass534_Sub18_Sub11_760
				.aClass696_11794.method14080((byte) 80))) {
		    int i_13_ = (Class72.anInt754 * -238165825 * i_11_
				 + (1 + (i_4_ + Class150.anInt1699 * 892411561
					 + 102396103 * class16.anInt190)));
		    if (i_7_ > Class112.anInt1364 * -1803884121
			&& i_7_ < (Class536_Sub4.anInt10366 * -2123561997
				   + Class112.anInt1364 * -1803884121)
			&& i_8_ > i_13_ - class16.anInt190 * 102396103 - 1
			&& i_8_ < i_13_ + 728893755 * class16.anInt189
			&& class534_sub18_sub7.aBool11705)
			class185.method3298
			    (Class112.anInt1364 * -1803884121,
			     i_13_ - 102396103 * class16.anInt190,
			     Class536_Sub4.anInt10366 * -2123561997,
			     -238165825 * Class72.anInt754,
			     i_6_ << 24 | Class392.anInt4082 * 1625251985, 1);
		    i_11_++;
		}
		Class614.method10121(class185,
				     Class112.anInt1364 * -1803884121,
				     892411561 * Class150.anInt1699,
				     -2123561997 * Class536_Sub4.anInt10366,
				     -417346889 * Class281.anInt3062, i_4_,
				     -532842949);
	    }
	}
	Class614.method10121(class185, Class627.anInt8175 * -620506573,
			     -260575397 * Class72.anInt782,
			     -1739196959 * Class641.anInt8340,
			     Class327_Sub1.anInt9991 * -577412881, i_4_,
			     3044440);
	if (!Class72.aBool766) {
	    int i_14_ = 0;
	    for (Class534_Sub18_Sub7 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			Class72.aClass700_771.method14135((byte) -1));
		 null != class534_sub18_sub7;
		 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			Class72.aClass700_771.method14139(1373174300))) {
		int i_15_ = (102396103 * class16.anInt190 + (i_4_ + i_1_) + 1
			     + ((324852453 * Class72.anInt765 - 1 - i_14_)
				* (Class72.anInt754 * -238165825)));
		Class87.method1709(i_7_, i_8_, i_0_, i_1_, i_2_, i_3_, i_15_,
				   class534_sub18_sub7, class171, class16,
				   (Class200_Sub5.anInt9903 * 1593226795
				    | ~0xffffff),
				   Class483.anInt5280 * 2009199567 | ~0xffffff,
				   (byte) 0);
		i_14_++;
	    }
	} else {
	    int i_16_ = 0;
	    for (Class534_Sub18_Sub11 class534_sub18_sub11
		     = ((Class534_Sub18_Sub11)
			Class72.aClass696_772.method14078(1221951837));
		 class534_sub18_sub11 != null;
		 class534_sub18_sub11
		     = ((Class534_Sub18_Sub11)
			Class72.aClass696_772.method14080((byte) 60))) {
		int i_17_ = (Class72.anInt754 * -238165825 * i_16_
			     + (-260575397 * Class72.anInt782 + i_4_
				+ 102396103 * class16.anInt190 + 1));
		if (-475442105 * class534_sub18_sub11.anInt11795 == 1)
		    Class87.method1709
			(i_7_, i_8_, Class627.anInt8175 * -620506573,
			 -260575397 * Class72.anInt782,
			 -1739196959 * Class641.anInt8340,
			 -577412881 * Class327_Sub1.anInt9991, i_17_,
			 ((Class534_Sub18_Sub7)
			  (class534_sub18_sub11.aClass696_11794
			   .aClass534_Sub18_8785.aClass534_Sub18_10510)),
			 class171, class16,
			 1593226795 * Class200_Sub5.anInt9903 | ~0xffffff,
			 Class483.anInt5280 * 2009199567 | ~0xffffff,
			 (byte) 0);
		else
		    Class536_Sub4.method15994
			(i_7_, i_8_, Class627.anInt8175 * -620506573,
			 -260575397 * Class72.anInt782,
			 -1739196959 * Class641.anInt8340,
			 -577412881 * Class327_Sub1.anInt9991, i_17_,
			 class534_sub18_sub11, class171, class16,
			 Class200_Sub5.anInt9903 * 1593226795 | ~0xffffff,
			 2009199567 * Class483.anInt5280 | ~0xffffff,
			 (byte) 32);
		i_16_++;
	    }
	    if (null != Class72.aClass534_Sub18_Sub11_760) {
		i_16_ = 0;
		for (Class534_Sub18_Sub7 class534_sub18_sub7
			 = ((Class534_Sub18_Sub7)
			    Class72.aClass534_Sub18_Sub11_760
				.aClass696_11794.method14078(1221951837));
		     class534_sub18_sub7 != null;
		     class534_sub18_sub7
			 = ((Class534_Sub18_Sub7)
			    Class72.aClass534_Sub18_Sub11_760
				.aClass696_11794.method14080((byte) 49))) {
		    int i_18_ = (-238165825 * Class72.anInt754 * i_16_
				 + (892411561 * Class150.anInt1699 + i_4_
				    + class16.anInt190 * 102396103 + 1));
		    Class87.method1709(i_7_, i_8_,
				       -1803884121 * Class112.anInt1364,
				       892411561 * Class150.anInt1699,
				       -2123561997 * Class536_Sub4.anInt10366,
				       Class281.anInt3062 * -417346889, i_18_,
				       class534_sub18_sub7, class171, class16,
				       (1593226795 * Class200_Sub5.anInt9903
					| ~0xffffff),
				       (Class483.anInt5280 * 2009199567
					| ~0xffffff),
				       (byte) 0);
		    i_16_++;
		}
	    }
	}
    }
}
