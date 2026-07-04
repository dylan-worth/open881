/* Class146 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class146
{
    Class146() throws Throwable {
	throw new Error();
    }
    
    public static String method2450(String string) {
	int i = string.length();
	int i_0_ = 0;
	for (int i_1_ = 0; i_1_ < i; i_1_++) {
	    char c = string.charAt(i_1_);
	    if ('<' == c || '>' == c)
		i_0_ += 3;
	}
	StringBuilder stringbuilder = new StringBuilder(i + i_0_);
	for (int i_2_ = 0; i_2_ < i; i_2_++) {
	    char c = string.charAt(i_2_);
	    if ('<' == c)
		stringbuilder.append("<lt>");
	    else if (c == '>')
		stringbuilder.append("<gt>");
	    else
		stringbuilder.append(c);
	}
	return stringbuilder.toString();
    }
    
    static void method2451(int i) {
	if (client.anInt11023 * -1450626137 < 0) {
	    Class16 class16 = Class160.method2620(1770101340);
	    if (!Class72.aBool758)
		Class72.aBool766
		    = ((-1 != -1144644173 * Class72.anInt775
			&& (Class72.anInt765 * 324852453
			    >= Class72.anInt775 * -1144644173))
		       || ((324852453 * Class72.anInt765 * (Class72.anInt754
							    * -238165825)
			    + (Class72.aBool784 ? 26 : 22))
			   > -1091172141 * Class18.anInt205));
	    Class72.aClass700_770.method14152(-1737967550);
	    Class72.aClass700_763.method14152(-1142518256);
	    for (Class534_Sub18_Sub7 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			Class72.aClass700_771.method14135((byte) -1));
		 null != class534_sub18_sub7;
		 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			Class72.aClass700_771.method14139(1691921122))) {
		int i_3_ = -1986934021 * class534_sub18_sub7.anInt11706;
		if (i_3_ < 1000) {
		    class534_sub18_sub7.method8892((byte) 1);
		    if (59 == i_3_ || 2 == i_3_ || i_3_ == 8 || i_3_ == 17
			|| i_3_ == 15 || i_3_ == 16 || 58 == i_3_)
			Class72.aClass700_763.method14131(class534_sub18_sub7,
							  (short) 789);
		    else
			Class72.aClass700_770.method14131(class534_sub18_sub7,
							  (short) 789);
		}
	    }
	    Class72.aClass700_770.method14134(Class72.aClass700_771,
					      (short) 28667);
	    Class72.aClass700_763.method14134(Class72.aClass700_771,
					      (short) 29220);
	    if (324852453 * Class72.anInt765 > 1) {
		if (Class418.method6761(-543055604)
		    && Class72.anInt765 * 324852453 > 2)
		    Class251.aClass534_Sub18_Sub7_2653
			= (Class534_Sub18_Sub7) (Class72.aClass700_771
						 .aClass534_8803.aClass534_7157
						 .aClass534_7157);
		else
		    Class251.aClass534_Sub18_Sub7_2653
			= (Class534_Sub18_Sub7) (Class72.aClass700_771
						 .aClass534_8803
						 .aClass534_7157);
		Class331.aClass534_Sub18_Sub7_3496
		    = ((Class534_Sub18_Sub7)
		       Class72.aClass700_771.aClass534_8803.aClass534_7157);
		if (324852453 * Class72.anInt765 > 2)
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
	    int i_4_;
	    int i_5_;
	    if (class534_sub42 != null) {
		i_4_ = class534_sub42.method16799((byte) 64);
		i_5_ = class534_sub42.method16800(-441472324);
	    } else {
		i_4_ = Class81.aClass563_834.method9493(-2081718656);
		i_5_ = Class81.aClass563_834.method9477(1442331054);
	    }
	    if (Class72.aBool758) {
		if (Class479.method7919((Class700.aClass638_8806
					 .anInterface65_8313),
					class534_sub42, 941710601)) {
		    if (Class72.aClass534_Sub18_Sub11_760 != null
			&& i_4_ >= Class112.anInt1364 * -1803884121
			&& i_4_ <= (-2123561997 * Class536_Sub4.anInt10366
				    + Class112.anInt1364 * -1803884121)
			&& i_5_ >= Class150.anInt1699 * 892411561
			&& i_5_ <= (Class150.anInt1699 * 892411561
				    + -417346889 * Class281.anInt3062)) {
			int i_6_ = -1;
			for (int i_7_ = 0;
			     (i_7_
			      < -475442105 * (Class72.aClass534_Sub18_Sub11_760
					      .anInt11795));
			     i_7_++) {
			    if (Class72.aBool784) {
				int i_8_
				    = (i_7_ * (Class72.anInt754 * -238165825)
				       + (102396103 * class16.anInt190
					  + (892411561 * Class150.anInt1699
					     + 20)
					  + 1));
				if ((i_5_
				     > i_8_ - class16.anInt190 * 102396103 - 1)
				    && (i_5_
					< i_8_ + 728893755 * class16.anInt189))
				    i_6_ = i_7_;
			    } else {
				int i_9_
				    = (i_7_ * (Class72.anInt754 * -238165825)
				       + (892411561 * Class150.anInt1699
					  + 31));
				if (i_5_ > i_9_ - 13 && i_5_ < 3 + i_9_)
				    i_6_ = i_7_;
			    }
			}
			if (-1 != i_6_) {
			    int i_10_ = 0;
			    Class694 class694
				= new Class694(Class72
					       .aClass534_Sub18_Sub11_760
					       .aClass696_11794);
			    for (Class534_Sub18_Sub7 class534_sub18_sub7
				     = ((Class534_Sub18_Sub7)
					class694.method14068((byte) 13));
				 class534_sub18_sub7 != null;
				 class534_sub18_sub7
				     = (Class534_Sub18_Sub7) class694.next()) {
				if (i_10_ == i_6_) {
				    Class101.method1901(class534_sub18_sub7,
							i_4_, i_5_, true,
							-753104415);
				    break;
				}
				i_10_++;
			    }
			}
			Class44_Sub16.method17357((byte) 14);
		    } else if (i_4_ >= Class627.anInt8175 * -620506573
			       && i_4_ <= (-620506573 * Class627.anInt8175
					   + -1739196959 * Class641.anInt8340)
			       && i_5_ >= -260575397 * Class72.anInt782
			       && i_5_ <= (Class327_Sub1.anInt9991 * -577412881
					   + Class72.anInt782 * -260575397)) {
			if (!Class72.aBool766) {
			    int i_11_ = -1;
			    for (int i_12_ = 0;
				 i_12_ < Class72.anInt765 * 324852453;
				 i_12_++) {
				if (Class72.aBool784) {
				    int i_13_
					= (((324852453 * Class72.anInt765 - 1
					     - i_12_)
					    * (Class72.anInt754 * -238165825))
					   + (1
					      + (Class72.anInt782 * -260575397
						 + 20
						 + (102396103
						    * class16.anInt190))));
				    if (i_5_ > (i_13_
						- class16.anInt190 * 102396103
						- 1)
					&& i_5_ < i_13_ + (728893755
							   * class16.anInt189))
					i_11_ = i_12_;
				} else {
				    int i_14_
					= (((324852453 * Class72.anInt765 - 1
					     - i_12_)
					    * (-238165825 * Class72.anInt754))
					   + (31 + (Class72.anInt782
						    * -260575397)));
				    if (i_5_ > i_14_ - 13 && i_5_ < i_14_ + 3)
					i_11_ = i_12_;
				}
			    }
			    if (-1 != i_11_) {
				int i_15_ = 0;
				Class710 class710
				    = new Class710(Class72.aClass700_771);
				for (Class534_Sub18_Sub7 class534_sub18_sub7
					 = ((Class534_Sub18_Sub7)
					    class710.method14308((byte) 54));
				     class534_sub18_sub7 != null;
				     class534_sub18_sub7
					 = ((Class534_Sub18_Sub7)
					    class710.next())) {
				    if (i_11_ == i_15_) {
					Class101.method1901
					    (class534_sub18_sub7, i_4_, i_5_,
					     true, -1958919534);
					break;
				    }
				    i_15_++;
				}
			    }
			    Class44_Sub16.method17357((byte) 91);
			} else {
			    int i_16_ = -1;
			    for (int i_17_ = 0;
				 i_17_ < Class72.anInt789 * 1965634793;
				 i_17_++) {
				if (Class72.aBool784) {
				    int i_18_
					= (1
					   + (20
					      + Class72.anInt782 * -260575397
					      + 102396103 * class16.anInt190)
					   + i_17_ * (-238165825
						      * Class72.anInt754));
				    if (i_5_ > (i_18_
						- 102396103 * class16.anInt190
						- 1)
					&& i_5_ < i_18_ + (class16.anInt189
							   * 728893755)) {
					i_16_ = i_17_;
					break;
				    }
				} else {
				    int i_19_
					= (i_17_ * (Class72.anInt754
						    * -238165825)
					   + (-260575397 * Class72.anInt782
					      + 31));
				    if (i_5_ > i_19_ - 13
					&& i_5_ < 3 + i_19_) {
					i_16_ = i_17_;
					break;
				    }
				}
			    }
			    if (i_16_ != -1) {
				int i_20_ = 0;
				Class694 class694
				    = new Class694(Class72.aClass696_772);
				for (Class534_Sub18_Sub11 class534_sub18_sub11
					 = ((Class534_Sub18_Sub11)
					    class694.method14068((byte) 33));
				     null != class534_sub18_sub11;
				     class534_sub18_sub11
					 = ((Class534_Sub18_Sub11)
					    class694.next())) {
				    if (i_16_ == i_20_) {
					Class101.method1901
					    (((Class534_Sub18_Sub7)
					      (class534_sub18_sub11
					       .aClass696_11794
					       .aClass534_Sub18_8785
					       .aClass534_Sub18_10510)),
					     i_4_, i_5_, true, 221640761);
					Class44_Sub16.method17357((byte) 9);
					break;
				    }
				    i_20_++;
				}
			    }
			}
		    }
		} else {
		    boolean bool = false;
		    if (null != Class72.aClass534_Sub18_Sub11_760) {
			if (i_4_ < Class112.anInt1364 * -1803884121 - 10
			    || i_4_ > 10 + (-1803884121 * Class112.anInt1364
					    + (Class536_Sub4.anInt10366
					       * -2123561997))
			    || i_5_ < Class150.anInt1699 * 892411561 - 10
			    || i_5_ > 10 + (Class150.anInt1699 * 892411561
					    + -417346889 * Class281.anInt3062))
			    Class582.method9834((byte) 101);
			else
			    bool = true;
		    }
		    if (!bool) {
			if (i_4_ < -620506573 * Class627.anInt8175 - 10
			    || i_4_ > (-1739196959 * Class641.anInt8340
				       + -620506573 * Class627.anInt8175 + 10)
			    || i_5_ < Class72.anInt782 * -260575397 - 10
			    || (i_5_
				> 10 + (Class327_Sub1.anInt9991 * -577412881
					+ Class72.anInt782 * -260575397)))
			    Class44_Sub16.method17357((byte) 50);
			else if (Class72.aBool766) {
			    int i_21_ = -1;
			    int i_22_ = -1;
			    for (int i_23_ = 0;
				 i_23_ < Class72.anInt789 * 1965634793;
				 i_23_++) {
				if (Class72.aBool784) {
				    int i_24_
					= ((Class72.anInt754 * -238165825
					    * i_23_)
					   + (20
					      + Class72.anInt782 * -260575397
					      + class16.anInt190 * 102396103
					      + 1));
				    if (i_5_ > (i_24_
						- 102396103 * class16.anInt190
						- 1)
					&& i_5_ < (728893755 * class16.anInt189
						   + i_24_)) {
					i_21_ = i_23_;
					i_22_ = (i_24_
						 - class16.anInt190 * 102396103
						 - 1);
					break;
				    }
				} else {
				    int i_25_
					= (Class72.anInt782 * -260575397 + 31
					   + (-238165825 * Class72.anInt754
					      * i_23_));
				    if (i_5_ > i_25_ - 13
					&& i_5_ < 3 + i_25_) {
					i_21_ = i_23_;
					i_22_ = i_25_ - 13;
					break;
				    }
				}
			    }
			    if (-1 != i_21_) {
				int i_26_ = 0;
				Class694 class694
				    = new Class694(Class72.aClass696_772);
				for (Class534_Sub18_Sub11 class534_sub18_sub11
					 = ((Class534_Sub18_Sub11)
					    class694.method14068((byte) -73));
				     null != class534_sub18_sub11;
				     class534_sub18_sub11
					 = ((Class534_Sub18_Sub11)
					    class694.next())) {
				    if (i_26_ == i_21_) {
					if ((-475442105
					     * class534_sub18_sub11.anInt11795)
					    > 1)
					    Class263.method4835
						(class534_sub18_sub11, i_22_,
						 (byte) 15);
					break;
				    }
				    i_26_++;
				}
			    }
			}
		    }
		}
	    } else {
		boolean bool = Class479.method7919((Class700.aClass638_8806
						    .anInterface65_8312),
						   class534_sub42, 941710601);
		boolean bool_27_
		    = Class479.method7919((Class700.aClass638_8806
					   .anInterface65_8307),
					  class534_sub42, 941710601);
		boolean bool_28_
		    = Class479.method7919((Class700.aClass638_8806
					   .anInterface65_8308),
					  class534_sub42, 941710601);
		if ((bool || bool_27_)
		    && ((client.anInt11213 * 2117088631 == 1
			 && Class72.anInt765 * 324852453 > 2)
			|| Class331.method5856((byte) -66)))
		    bool_28_ = true;
		if (bool_28_ && 324852453 * Class72.anInt765 > 0) {
		    if (client.aClass247_11044 == null
			&& client.anInt11248 * 245333843 == 0)
			Class43.method1073(i_4_, i_5_, 1543773986);
		    else
			Class72.anInt757 = -1098055734;
		} else if (bool_27_) {
		    if (Class271.aClass534_Sub18_Sub7_2963 != null)
			Class101.method1901(Class271.aClass534_Sub18_Sub7_2963,
					    i_4_, i_5_, false, -1220884190);
		} else if (bool) {
		    if (null != Class251.aClass534_Sub18_Sub7_2653) {
			boolean bool_29_
			    = (null != client.aClass247_11044
			       || 245333843 * client.anInt11248 > 0);
			if (bool_29_) {
			    Class72.anInt757 = -549027867;
			    Class513.aClass534_Sub18_Sub7_5727
				= Class251.aClass534_Sub18_Sub7_2653;
			} else
			    Class101.method1901((Class251
						 .aClass534_Sub18_Sub7_2653),
						i_4_, i_5_, false, 932805139);
		    } else if (client.aBool11218)
			Exception_Sub3.method17943((byte) 1);
		}
		if (null == client.aClass247_11044
		    && 245333843 * client.anInt11248 == 0) {
		    Class72.anInt757 = 0;
		    Class513.aClass534_Sub18_Sub7_5727 = null;
		}
	    }
	}
    }
    
    public static int method2452(int i, int i_30_, int i_31_) {
	i_30_ = (i & 0x7f) * i_30_ >> 7;
	if (i_30_ < 2)
	    i_30_ = 2;
	else if (i_30_ > 126)
	    i_30_ = 126;
	return (i & 0xff80) + i_30_;
    }
    
    static final void method2453(Class669 class669, short i) {
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub6_10743,
	     (class669.anIntArray8595
	      [(class669.anInt8600 -= 308999563) * 2088438307]),
	     -245777992);
	client.aClass512_11100.method8441(-273552676);
	Class672.method11096((byte) 1);
	client.aBool11048 = false;
    }
    
    static final void method2454(Class669 class669, int i) {
	int i_32_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (Class554_Sub1.aClass9_10686 != null) {
	    Class534 class534
		= Class554_Sub1.aClass9_10686.method579((long) i_32_);
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= null != class534 ? 1 : 0;
	} else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
    
    static final void method2455(Class669 class669, byte i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	boolean bool = ((class669.anIntArray8595
			 [(class669.anInt8600 -= 308999563) * 2088438307])
			== 1);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class200_Sub13.method15588(string, bool, (byte) 113);
    }
}
