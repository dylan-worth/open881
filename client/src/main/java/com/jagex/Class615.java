/* Class615 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class615
{
    int anInt8036;
    Class385 aClass385_8037;
    Class629 aClass629_8038;
    int anInt8039;
    Class709 aClass709_8040;
    int anInt8041;
    int anInt8042;
    long aLong8043;
    Class621 aClass621_8044;
    Class621 aClass621_8045;
    boolean aBool8046;
    int anInt8047;
    int anInt8048;
    boolean aBool8049;
    Class172 aClass172_8050;
    int anInt8051 = 0;
    int anInt8052;
    boolean aBool8053;
    int anInt8054;
    static Class700 aClass700_8055;
    
    void method10130(Class185 class185, long l, int i, boolean bool,
		     int i_0_) {
	if (aBool8046)
	    bool = false;
	else if (Class625.anInt8164 * -1429983313
		 < -1051395639 * aClass385_8037.anInt4041)
	    bool = false;
	else if (-1132039491 * Class625.anInt8158
		 > Class184.anIntArray1975[-1429983313 * Class625.anInt8164])
	    bool = false;
	else if (aBool8053)
	    bool = false;
	else if (920535697 * aClass385_8037.anInt3993 != -1) {
	    int i_1_ = (int) (l - 5061989693938274999L * aLong8043);
	    if (!aClass385_8037.aBool3975
		&& i_1_ > 920535697 * aClass385_8037.anInt3993)
		bool = false;
	    else
		i_1_ %= aClass385_8037.anInt3993 * 920535697;
	    if (!aClass385_8037.aBool4004
		&& i_1_ < -73618117 * aClass385_8037.anInt4006)
		bool = false;
	    if (aClass385_8037.aBool4004
		&& i_1_ >= aClass385_8037.anInt4006 * -73618117)
		bool = false;
	}
	anInt8054 = 0;
	for (Class536_Sub2_Sub1_Sub1 class536_sub2_sub1_sub1
		 = ((Class536_Sub2_Sub1_Sub1)
		    aClass709_8040.method14301(764908544));
	     null != class536_sub2_sub1_sub1;
	     class536_sub2_sub1_sub1
		 = ((Class536_Sub2_Sub1_Sub1)
		    aClass709_8040.method14282(886591301))) {
	    class536_sub2_sub1_sub1.method18688(l, i);
	    anInt8054 += -969308481;
	}
	if (bool) {
	    int i_2_ = ((2014210293 * aClass621_8044.anInt8120
			 + (aClass621_8044.anInt8117 * -948931075
			    + -1650142075 * aClass621_8044.anInt8114))
			/ 3);
	    int i_3_ = ((-2117433821 * aClass621_8044.anInt8118
			 + 1507124323 * aClass621_8044.anInt8115
			 + -1688810245 * aClass621_8044.anInt8124)
			/ 3);
	    int i_4_ = ((aClass621_8044.anInt8116 * -738400327
			 + 893372357 * aClass621_8044.anInt8119
			 + -820452715 * aClass621_8044.anInt8122)
			/ 3);
	    if (i_2_ != -1481682457 * aClass621_8044.anInt8123
		|| 379767745 * aClass621_8044.anInt8125 != i_3_
		|| aClass621_8044.anInt8121 * 702655677 != i_4_
		|| !aBool8049) {
		aClass621_8044.anInt8123 = i_2_ * -240963113;
		aClass621_8044.anInt8125 = -1857338303 * i_3_;
		aClass621_8044.anInt8121 = i_4_ * 873901717;
		int i_5_ = (aClass621_8044.anInt8117 * -948931075
			    - aClass621_8044.anInt8114 * -1650142075);
		int i_6_ = (aClass621_8044.anInt8118 * -2117433821
			    - aClass621_8044.anInt8115 * 1507124323);
		int i_7_ = (-738400327 * aClass621_8044.anInt8116
			    - aClass621_8044.anInt8119 * 893372357);
		int i_8_ = (2014210293 * aClass621_8044.anInt8120
			    - aClass621_8044.anInt8114 * -1650142075);
		int i_9_ = (aClass621_8044.anInt8124 * -1688810245
			    - 1507124323 * aClass621_8044.anInt8115);
		int i_10_ = (-820452715 * aClass621_8044.anInt8122
			     - 893372357 * aClass621_8044.anInt8119);
		anInt8039 = 474332711 * (i_6_ * i_10_ - i_7_ * i_9_);
		anInt8047 = -1327782413 * (i_8_ * i_7_ - i_10_ * i_5_);
		for (anInt8048 = (i_9_ * i_5_ - i_8_ * i_6_) * -2021483899;
		     (-87436905 * anInt8039 > 32767
		      || -385385669 * anInt8047 > 32767
		      || anInt8048 * 621235789 > 32767
		      || -87436905 * anInt8039 < -32767
		      || -385385669 * anInt8047 < -32767
		      || 621235789 * anInt8048 < -32767);
		     anInt8048 = -2021483899 * (anInt8048 * 621235789 >> 1)) {
		    anInt8039 = (-87436905 * anInt8039 >> 1) * 474332711;
		    anInt8047 = (anInt8047 * -385385669 >> 1) * -1327782413;
		}
		int i_11_
		    = (int) Math.sqrt((double) ((-87436905 * anInt8039
						 * (-87436905 * anInt8039))
						+ (-385385669 * anInt8047
						   * (-385385669 * anInt8047))
						+ (621235789 * anInt8048
						   * (anInt8048
						      * 621235789))));
		if (i_11_ <= 0)
		    i_11_ = 1;
		anInt8039 = anInt8039 * -301879703 / i_11_ * 474332711;
		anInt8047 = -1327782413 * (-728365883 * anInt8047 / i_11_);
		anInt8048 = anInt8048 * -2111884877 / i_11_ * -2021483899;
		if (aClass385_8037.aShort4008 > 0
		    || aClass385_8037.aShort3999 > 0) {
		    int i_12_
			= (int) (Math.atan2((double) (621235789 * anInt8048),
					    (double) (anInt8039 * -87436905))
				 * 2607.5945876176133);
		    int i_13_
			= (int) ((Math.atan2
				  ((double) (-385385669 * anInt8047),
				   Math.sqrt((double) ((-87436905 * anInt8039
							* (-87436905
							   * anInt8039))
						       + (621235789 * anInt8048
							  * (621235789
							     * anInt8048))))))
				 * 2607.5945876176133);
		    anInt8041 = -358712291 * (aClass385_8037.aShort4008
					      - aClass385_8037.aShort3971);
		    anInt8036 = 1171033591 * (i_12_ + aClass385_8037.aShort3971
					      - (-560716235 * anInt8041 >> 1));
		    anInt8052 = 446083641 * (aClass385_8037.aShort3999
					     - aClass385_8037.aShort3973);
		    anInt8042 = 613595345 * (aClass385_8037.aShort3973 + i_13_
					     - (anInt8052 * 1491180553 >> 1));
		}
		aBool8049 = true;
	    }
	    anInt8051
		+= ((int) ((double) i
			   * ((double) (aClass385_8037.anInt3994 * -318956953)
			      + (Math.random()
				 * (double) ((-1781600381
					      * aClass385_8037.anInt4023)
					     - (-318956953
						* aClass385_8037.anInt3994)))))
		    * 65358595);
	    if (anInt8051 * 780007339 > 63) {
		int i_14_ = anInt8051 * 780007339 >> 6;
		anInt8051 = 65358595 * (anInt8051 * 780007339 & 0x3f);
		int i_15_ = (i << 8) / i_14_;
		int i_16_ = 0;
		int i_17_ = 0;
		while (i_17_ < i_14_) {
		    int i_18_;
		    int i_19_;
		    int i_20_;
		    if (aClass385_8037.aShort4008 > 0
			|| aClass385_8037.aShort3999 > 0) {
			int i_21_ = (341459911 * anInt8036
				     + (int) ((double) (anInt8041 * -560716235)
					      * Math.random()));
			i_21_ &= 0x3fff;
			int i_22_ = Class427.anIntArray4806[i_21_];
			int i_23_ = Class427.anIntArray4805[i_21_];
			int i_24_ = (anInt8042 * -1612144591
				     + (int) ((double) (1491180553 * anInt8052)
					      * Math.random()));
			i_24_ &= 0x1fff;
			int i_25_ = Class427.anIntArray4806[i_24_];
			int i_26_ = Class427.anIntArray4805[i_24_];
			int i_27_ = 13;
			i_18_ = i_25_ * i_23_ >> i_27_;
			i_19_ = -1 * (i_26_ << 1);
			i_20_ = i_22_ * i_25_ >> i_27_;
		    } else {
			i_18_ = -87436905 * anInt8039;
			i_19_ = -385385669 * anInt8047;
			i_20_ = 621235789 * anInt8048;
		    }
		    float f = (float) Math.random();
		    float f_28_ = (float) Math.random();
		    if (f_28_ + f > 1.0F) {
			f = 1.0F - f;
			f_28_ = 1.0F - f_28_;
		    }
		    float f_29_ = 1.0F - (f_28_ + f);
		    int i_30_
			= (int) ((float) (2014210293
					  * aClass621_8044.anInt8120) * f_29_
				 + (((float) (-948931075
					      * aClass621_8044.anInt8117)
				     * f_28_)
				    + f * (float) (aClass621_8044.anInt8114
						   * -1650142075)));
		    int i_31_
			= (int) ((float) (aClass621_8044.anInt8115
					  * 1507124323) * f
				 + f_28_ * (float) (-2117433821
						    * aClass621_8044.anInt8118)
				 + (float) (aClass621_8044.anInt8124
					    * -1688810245) * f_29_);
		    int i_32_
			= (int) (f * (float) (893372357
					      * aClass621_8044.anInt8119)
				 + (float) (-738400327
					    * aClass621_8044.anInt8116) * f_28_
				 + (f_29_
				    * (float) (-820452715
					       * aClass621_8044.anInt8122)));
		    int i_33_
			= (aClass385_8037.anInt3972 * 579777191
			   + (int) (Math.random()
				    * (double) ((770148019
						 * aClass385_8037.anInt4005)
						- (aClass385_8037.anInt3972
						   * 579777191))));
		    int i_34_
			= (aClass385_8037.anInt4042 * -1714996053
			   + (int) (Math.random()
				    * (double) ((aClass385_8037.anInt4034
						 * 1843131803)
						- (aClass385_8037.anInt4042
						   * -1714996053))));
		    int i_35_
			= (1362111377 * aClass385_8037.anInt3981
			   + (int) (Math.random()
				    * (double) ((-1082478985
						 * aClass385_8037.anInt3982)
						- (aClass385_8037.anInt3981
						   * 1362111377))));
		    int i_36_ = -200780283 * aClass385_8037.anInt3976;
		    if (0 != -1520113663 * aClass385_8037.anInt4044) {
			if (aClass385_8037.anInt4013 * 908744515 == 0)
			    i_36_
				+= (int) (Math.random()
					  * (double) ((aClass385_8037.anInt4044
						       * -1520113663)
						      + 1));
			else
			    i_36_ += ((int) (Math.random()
					     * (double) (1 + ((aClass385_8037
							       .anInt4013)
							      * 908744515)))
				      * (aClass385_8037.anInt4044 * -1520113663
					 / (908744515
					    * aClass385_8037.anInt4013)));
		    }
		    int i_37_ = aClass385_8037.anInt4026 * 1082557415;
		    if (aClass385_8037.anInt4045 * -831517883 != 0)
			i_37_ += (int) (Math.random()
					* (double) (1 + (-831517883
							 * (aClass385_8037
							    .anInt4045))));
		    int i_38_;
		    if (aClass385_8037.aBool3987) {
			double d = Math.random();
			i_38_
			    = ((int) ((double) (-1590427409
						* aClass385_8037.anInt4022)
				      + d * (double) (-467462389
						      * (aClass385_8037
							 .anInt4024))) << 16
			       | (int) ((double) (aClass385_8037.anInt4029
						  * 1164973449)
					+ (d
					   * (double) (aClass385_8037.anInt4027
						       * 2123356127))) << 8
			       | (int) (((double) (-1708133081
						   * aClass385_8037.anInt4025)
					 * d)
					+ (double) (aClass385_8037.anInt3974
						    * 1719532367))
			       | ((int) ((double) (aClass385_8037.anInt4031
						   * 915869921)
					 + (Math.random()
					    * (double) (1298659105
							* (aClass385_8037
							   .anInt4030))))
				  << 24));
		    } else
			i_38_ = ((int) ((double) (-1590427409
						  * aClass385_8037.anInt4022)
					+ (Math.random()
					   * (double) (-467462389
						       * (aClass385_8037
							  .anInt4024)))) << 16
				 | (int) ((double) (1164973449
						    * aClass385_8037.anInt4029)
					  + (Math.random()
					     * (double) (2123356127
							 * (aClass385_8037
							    .anInt4027)))) << 8
				 | (int) ((double) (1719532367
						    * aClass385_8037.anInt3974)
					  + (Math.random()
					     * (double) (-1708133081
							 * (aClass385_8037
							    .anInt4025))))
				 | ((int) ((double) (aClass385_8037.anInt4031
						     * 915869921)
					   + (Math.random()
					      * (double) (1298659105
							  * (aClass385_8037
							     .anInt4030))))
				    << 24));
		    int i_39_ = 1995753329 * aClass385_8037.anInt3991;
		    if (!class185.method3247() && !aClass385_8037.aBool4033)
			i_39_ = -1;
		    Class536_Sub2_Sub1_Sub1 class536_sub2_sub1_sub1;
		    if (Class625.anInt8153 * -1398895791
			!= -676793059 * Class625.anInt8157) {
			class536_sub2_sub1_sub1
			    = (Class625.aClass536_Sub2_Sub1_Sub1Array8152
			       [Class625.anInt8153 * -1398895791]);
			Class625.anInt8153
			    = (-1113481807
			       * (1 + Class625.anInt8153 * -1398895791
				  & 0x3ff));
			class536_sub2_sub1_sub1.method18692
			    (this, i_30_, i_31_, i_32_, i_18_, i_19_, i_20_,
			     i_33_, i_34_, i_38_, i_35_, i_36_, i_37_, i_39_,
			     aClass385_8037.aBool4009,
			     aClass385_8037.aBool3986);
		    } else
			class536_sub2_sub1_sub1
			    = (new Class536_Sub2_Sub1_Sub1
			       (this, i_30_, i_31_, i_32_, i_18_, i_19_, i_20_,
				i_33_, i_34_, i_38_, i_35_, i_36_, i_37_,
				i_39_, aClass385_8037.aBool4009,
				aClass385_8037.aBool3986));
		    if (i_16_ > 256)
			class536_sub2_sub1_sub1.method18688(l, i_16_ >> 8);
		    anInt8054 += -969308481;
		    i_17_++;
		    i_16_ += i_15_;
		}
	    }
	}
	if (!aClass621_8044.method10277(aClass621_8045, (byte) 81)) {
	    Class621 class621 = aClass621_8045;
	    aClass621_8045 = aClass621_8044;
	    aClass621_8044 = class621;
	    aClass621_8044.anInt8114 = aClass172_8050.anInt1815 * 720651617;
	    aClass621_8044.anInt8115 = aClass172_8050.anInt1823 * -1609415377;
	    aClass621_8044.anInt8119 = aClass172_8050.anInt1817 * 1967664537;
	    aClass621_8044.anInt8117 = aClass172_8050.anInt1818 * 644414993;
	    aClass621_8044.anInt8118 = aClass172_8050.anInt1808 * -649875913;
	    aClass621_8044.anInt8116 = aClass172_8050.anInt1819 * 1986510425;
	    aClass621_8044.anInt8120 = -1134895951 * aClass172_8050.anInt1821;
	    aClass621_8044.anInt8124 = -1110900119 * aClass172_8050.anInt1822;
	    aClass621_8044.anInt8122 = 1399265027 * aClass172_8050.anInt1820;
	    aClass621_8044.anInt8123 = aClass621_8045.anInt8123 * 1;
	    aClass621_8044.anInt8125 = aClass621_8045.anInt8125 * 1;
	    aClass621_8044.anInt8121 = aClass621_8045.anInt8121 * 1;
	}
	Class625.anInt8163 += -1634087595 * anInt8054;
    }
    
    void method10131(Class556 class556, Class185 class185, long l) {
	for (Class536_Sub2_Sub1_Sub1 class536_sub2_sub1_sub1
		 = ((Class536_Sub2_Sub1_Sub1)
		    aClass709_8040.method14301(764908544));
	     class536_sub2_sub1_sub1 != null;
	     class536_sub2_sub1_sub1
		 = ((Class536_Sub2_Sub1_Sub1)
		    aClass709_8040.method14282(-1777310328)))
	    class536_sub2_sub1_sub1.method18699(class556, class185, l);
    }
    
    void method10132(int i) {
	aClass621_8044.anInt8114 = aClass172_8050.anInt1815 * 720651617;
	aClass621_8044.anInt8115 = -1609415377 * aClass172_8050.anInt1823;
	aClass621_8044.anInt8119 = 1967664537 * aClass172_8050.anInt1817;
	aClass621_8044.anInt8117 = 644414993 * aClass172_8050.anInt1818;
	aClass621_8044.anInt8118 = aClass172_8050.anInt1808 * -649875913;
	aClass621_8044.anInt8116 = aClass172_8050.anInt1819 * 1986510425;
	aClass621_8044.anInt8120 = aClass172_8050.anInt1821 * -1134895951;
	aClass621_8044.anInt8124 = -1110900119 * aClass172_8050.anInt1822;
	aClass621_8044.anInt8122 = 1399265027 * aClass172_8050.anInt1820;
	if ((-1650142075 * aClass621_8044.anInt8114
	     == aClass621_8044.anInt8117 * -948931075)
	    && (aClass621_8044.anInt8117 * -948931075
		== aClass621_8044.anInt8120 * 2014210293)
	    && (aClass621_8044.anInt8118 * -2117433821
		== aClass621_8044.anInt8115 * 1507124323)
	    && (-1688810245 * aClass621_8044.anInt8124
		== -2117433821 * aClass621_8044.anInt8118)
	    && (893372357 * aClass621_8044.anInt8119
		== -738400327 * aClass621_8044.anInt8116)
	    && (-820452715 * aClass621_8044.anInt8122
		== aClass621_8044.anInt8116 * -738400327))
	    aBool8053 = true;
	else if (aBool8053) {
	    aBool8053 = false;
	    aClass621_8045.anInt8114 = aClass621_8044.anInt8114 * 1;
	    aClass621_8045.anInt8115 = aClass621_8044.anInt8115 * 1;
	    aClass621_8045.anInt8119 = 1 * aClass621_8044.anInt8119;
	    aClass621_8045.anInt8117 = aClass621_8044.anInt8117 * 1;
	    aClass621_8045.anInt8118 = aClass621_8044.anInt8118 * 1;
	    aClass621_8045.anInt8116 = aClass621_8044.anInt8116 * 1;
	    aClass621_8045.anInt8120 = aClass621_8044.anInt8120 * 1;
	    aClass621_8045.anInt8124 = aClass621_8044.anInt8124 * 1;
	    aClass621_8045.anInt8122 = 1 * aClass621_8044.anInt8122;
	}
    }
    
    Class615(Class185 class185, Class172 class172, Class629 class629, long l) {
	aBool8046 = false;
	aClass621_8044 = new Class621();
	aClass621_8045 = new Class621();
	aBool8053 = false;
	aBool8049 = false;
	aClass172_8050 = class172;
	aClass629_8038 = class629;
	aLong8043 = l * 1061249100544633607L;
	aClass385_8037
	    = aClass172_8050.method2888(class185.anInterface48_2000, (byte) 0);
	if (!class185.method3247()
	    && -1 != aClass385_8037.anInt4010 * -545982847)
	    aClass385_8037
		= class185.anInterface48_2000.method354((-545982847
							 * (aClass385_8037
							    .anInt4010)),
							-620609529);
	aClass709_8040 = new Class709();
	anInt8051 = (int) ((double) (anInt8051 * 780007339)
			   + Math.random() * 64.0) * 65358595;
	method10132(-847112588);
	aClass621_8045.anInt8114 = aClass621_8044.anInt8114 * 1;
	aClass621_8045.anInt8115 = 1 * aClass621_8044.anInt8115;
	aClass621_8045.anInt8119 = aClass621_8044.anInt8119 * 1;
	aClass621_8045.anInt8117 = aClass621_8044.anInt8117 * 1;
	aClass621_8045.anInt8118 = aClass621_8044.anInt8118 * 1;
	aClass621_8045.anInt8116 = aClass621_8044.anInt8116 * 1;
	aClass621_8045.anInt8120 = aClass621_8044.anInt8120 * 1;
	aClass621_8045.anInt8124 = aClass621_8044.anInt8124 * 1;
	aClass621_8045.anInt8122 = aClass621_8044.anInt8122 * 1;
    }
    
    void method10133(Class556 class556, Class185 class185, long l) {
	for (Class536_Sub2_Sub1_Sub1 class536_sub2_sub1_sub1
		 = ((Class536_Sub2_Sub1_Sub1)
		    aClass709_8040.method14301(764908544));
	     class536_sub2_sub1_sub1 != null;
	     class536_sub2_sub1_sub1 = ((Class536_Sub2_Sub1_Sub1)
					aClass709_8040.method14282(814207721)))
	    class536_sub2_sub1_sub1.method18699(class556, class185, l);
    }
    
    void method10134() {
	aClass621_8044.anInt8114 = aClass172_8050.anInt1815 * 720651617;
	aClass621_8044.anInt8115 = -1609415377 * aClass172_8050.anInt1823;
	aClass621_8044.anInt8119 = 1967664537 * aClass172_8050.anInt1817;
	aClass621_8044.anInt8117 = 644414993 * aClass172_8050.anInt1818;
	aClass621_8044.anInt8118 = aClass172_8050.anInt1808 * -649875913;
	aClass621_8044.anInt8116 = aClass172_8050.anInt1819 * 1986510425;
	aClass621_8044.anInt8120 = aClass172_8050.anInt1821 * -1134895951;
	aClass621_8044.anInt8124 = -1110900119 * aClass172_8050.anInt1822;
	aClass621_8044.anInt8122 = 1399265027 * aClass172_8050.anInt1820;
	if ((-1650142075 * aClass621_8044.anInt8114
	     == aClass621_8044.anInt8117 * -948931075)
	    && (aClass621_8044.anInt8117 * -948931075
		== aClass621_8044.anInt8120 * 2014210293)
	    && (aClass621_8044.anInt8118 * -2117433821
		== aClass621_8044.anInt8115 * 1507124323)
	    && (-1688810245 * aClass621_8044.anInt8124
		== -2117433821 * aClass621_8044.anInt8118)
	    && (893372357 * aClass621_8044.anInt8119
		== -738400327 * aClass621_8044.anInt8116)
	    && (-820452715 * aClass621_8044.anInt8122
		== aClass621_8044.anInt8116 * -738400327))
	    aBool8053 = true;
	else if (aBool8053) {
	    aBool8053 = false;
	    aClass621_8045.anInt8114 = aClass621_8044.anInt8114 * 1;
	    aClass621_8045.anInt8115 = aClass621_8044.anInt8115 * 1;
	    aClass621_8045.anInt8119 = 1 * aClass621_8044.anInt8119;
	    aClass621_8045.anInt8117 = aClass621_8044.anInt8117 * 1;
	    aClass621_8045.anInt8118 = aClass621_8044.anInt8118 * 1;
	    aClass621_8045.anInt8116 = aClass621_8044.anInt8116 * 1;
	    aClass621_8045.anInt8120 = aClass621_8044.anInt8120 * 1;
	    aClass621_8045.anInt8124 = aClass621_8044.anInt8124 * 1;
	    aClass621_8045.anInt8122 = 1 * aClass621_8044.anInt8122;
	}
    }
    
    void method10135(Class185 class185, long l, int i, boolean bool) {
	if (aBool8046)
	    bool = false;
	else if (Class625.anInt8164 * -1429983313
		 < -1051395639 * aClass385_8037.anInt4041)
	    bool = false;
	else if (-1132039491 * Class625.anInt8158
		 > Class184.anIntArray1975[-1429983313 * Class625.anInt8164])
	    bool = false;
	else if (aBool8053)
	    bool = false;
	else if (920535697 * aClass385_8037.anInt3993 != -1) {
	    int i_40_ = (int) (l - 5061989693938274999L * aLong8043);
	    if (!aClass385_8037.aBool3975
		&& i_40_ > 920535697 * aClass385_8037.anInt3993)
		bool = false;
	    else
		i_40_ %= aClass385_8037.anInt3993 * 920535697;
	    if (!aClass385_8037.aBool4004
		&& i_40_ < -73618117 * aClass385_8037.anInt4006)
		bool = false;
	    if (aClass385_8037.aBool4004
		&& i_40_ >= aClass385_8037.anInt4006 * -73618117)
		bool = false;
	}
	anInt8054 = 0;
	for (Class536_Sub2_Sub1_Sub1 class536_sub2_sub1_sub1
		 = ((Class536_Sub2_Sub1_Sub1)
		    aClass709_8040.method14301(764908544));
	     null != class536_sub2_sub1_sub1;
	     class536_sub2_sub1_sub1
		 = ((Class536_Sub2_Sub1_Sub1)
		    aClass709_8040.method14282(739704844))) {
	    class536_sub2_sub1_sub1.method18688(l, i);
	    anInt8054 += -969308481;
	}
	if (bool) {
	    int i_41_ = ((2014210293 * aClass621_8044.anInt8120
			  + (aClass621_8044.anInt8117 * -948931075
			     + -1650142075 * aClass621_8044.anInt8114))
			 / 3);
	    int i_42_ = ((-2117433821 * aClass621_8044.anInt8118
			  + 1507124323 * aClass621_8044.anInt8115
			  + -1688810245 * aClass621_8044.anInt8124)
			 / 3);
	    int i_43_ = ((aClass621_8044.anInt8116 * -738400327
			  + 893372357 * aClass621_8044.anInt8119
			  + -820452715 * aClass621_8044.anInt8122)
			 / 3);
	    if (i_41_ != -1481682457 * aClass621_8044.anInt8123
		|| 379767745 * aClass621_8044.anInt8125 != i_42_
		|| aClass621_8044.anInt8121 * 702655677 != i_43_
		|| !aBool8049) {
		aClass621_8044.anInt8123 = i_41_ * -240963113;
		aClass621_8044.anInt8125 = -1857338303 * i_42_;
		aClass621_8044.anInt8121 = i_43_ * 873901717;
		int i_44_ = (aClass621_8044.anInt8117 * -948931075
			     - aClass621_8044.anInt8114 * -1650142075);
		int i_45_ = (aClass621_8044.anInt8118 * -2117433821
			     - aClass621_8044.anInt8115 * 1507124323);
		int i_46_ = (-738400327 * aClass621_8044.anInt8116
			     - aClass621_8044.anInt8119 * 893372357);
		int i_47_ = (2014210293 * aClass621_8044.anInt8120
			     - aClass621_8044.anInt8114 * -1650142075);
		int i_48_ = (aClass621_8044.anInt8124 * -1688810245
			     - 1507124323 * aClass621_8044.anInt8115);
		int i_49_ = (-820452715 * aClass621_8044.anInt8122
			     - 893372357 * aClass621_8044.anInt8119);
		anInt8039 = 474332711 * (i_45_ * i_49_ - i_46_ * i_48_);
		anInt8047 = -1327782413 * (i_47_ * i_46_ - i_49_ * i_44_);
		for (anInt8048 = (i_48_ * i_44_ - i_47_ * i_45_) * -2021483899;
		     (-87436905 * anInt8039 > 32767
		      || -385385669 * anInt8047 > 32767
		      || anInt8048 * 621235789 > 32767
		      || -87436905 * anInt8039 < -32767
		      || -385385669 * anInt8047 < -32767
		      || 621235789 * anInt8048 < -32767);
		     anInt8048 = -2021483899 * (anInt8048 * 621235789 >> 1)) {
		    anInt8039 = (-87436905 * anInt8039 >> 1) * 474332711;
		    anInt8047 = (anInt8047 * -385385669 >> 1) * -1327782413;
		}
		int i_50_
		    = (int) Math.sqrt((double) ((-87436905 * anInt8039
						 * (-87436905 * anInt8039))
						+ (-385385669 * anInt8047
						   * (-385385669 * anInt8047))
						+ (621235789 * anInt8048
						   * (anInt8048
						      * 621235789))));
		if (i_50_ <= 0)
		    i_50_ = 1;
		anInt8039 = anInt8039 * -301879703 / i_50_ * 474332711;
		anInt8047 = -1327782413 * (-728365883 * anInt8047 / i_50_);
		anInt8048 = anInt8048 * -2111884877 / i_50_ * -2021483899;
		if (aClass385_8037.aShort4008 > 0
		    || aClass385_8037.aShort3999 > 0) {
		    int i_51_
			= (int) (Math.atan2((double) (621235789 * anInt8048),
					    (double) (anInt8039 * -87436905))
				 * 2607.5945876176133);
		    int i_52_
			= (int) ((Math.atan2
				  ((double) (-385385669 * anInt8047),
				   Math.sqrt((double) ((-87436905 * anInt8039
							* (-87436905
							   * anInt8039))
						       + (621235789 * anInt8048
							  * (621235789
							     * anInt8048))))))
				 * 2607.5945876176133);
		    anInt8041 = -358712291 * (aClass385_8037.aShort4008
					      - aClass385_8037.aShort3971);
		    anInt8036 = 1171033591 * (i_51_ + aClass385_8037.aShort3971
					      - (-560716235 * anInt8041 >> 1));
		    anInt8052 = 446083641 * (aClass385_8037.aShort3999
					     - aClass385_8037.aShort3973);
		    anInt8042 = 613595345 * (aClass385_8037.aShort3973 + i_52_
					     - (anInt8052 * 1491180553 >> 1));
		}
		aBool8049 = true;
	    }
	    anInt8051
		+= ((int) ((double) i
			   * ((double) (aClass385_8037.anInt3994 * -318956953)
			      + (Math.random()
				 * (double) ((-1781600381
					      * aClass385_8037.anInt4023)
					     - (-318956953
						* aClass385_8037.anInt3994)))))
		    * 65358595);
	    if (anInt8051 * 780007339 > 63) {
		int i_53_ = anInt8051 * 780007339 >> 6;
		anInt8051 = 65358595 * (anInt8051 * 780007339 & 0x3f);
		int i_54_ = (i << 8) / i_53_;
		int i_55_ = 0;
		int i_56_ = 0;
		while (i_56_ < i_53_) {
		    int i_57_;
		    int i_58_;
		    int i_59_;
		    if (aClass385_8037.aShort4008 > 0
			|| aClass385_8037.aShort3999 > 0) {
			int i_60_ = (341459911 * anInt8036
				     + (int) ((double) (anInt8041 * -560716235)
					      * Math.random()));
			i_60_ &= 0x3fff;
			int i_61_ = Class427.anIntArray4806[i_60_];
			int i_62_ = Class427.anIntArray4805[i_60_];
			int i_63_ = (anInt8042 * -1612144591
				     + (int) ((double) (1491180553 * anInt8052)
					      * Math.random()));
			i_63_ &= 0x1fff;
			int i_64_ = Class427.anIntArray4806[i_63_];
			int i_65_ = Class427.anIntArray4805[i_63_];
			int i_66_ = 13;
			i_57_ = i_64_ * i_62_ >> i_66_;
			i_58_ = -1 * (i_65_ << 1);
			i_59_ = i_61_ * i_64_ >> i_66_;
		    } else {
			i_57_ = -87436905 * anInt8039;
			i_58_ = -385385669 * anInt8047;
			i_59_ = 621235789 * anInt8048;
		    }
		    float f = (float) Math.random();
		    float f_67_ = (float) Math.random();
		    if (f_67_ + f > 1.0F) {
			f = 1.0F - f;
			f_67_ = 1.0F - f_67_;
		    }
		    float f_68_ = 1.0F - (f_67_ + f);
		    int i_69_
			= (int) ((float) (2014210293
					  * aClass621_8044.anInt8120) * f_68_
				 + (((float) (-948931075
					      * aClass621_8044.anInt8117)
				     * f_67_)
				    + f * (float) (aClass621_8044.anInt8114
						   * -1650142075)));
		    int i_70_
			= (int) ((float) (aClass621_8044.anInt8115
					  * 1507124323) * f
				 + f_67_ * (float) (-2117433821
						    * aClass621_8044.anInt8118)
				 + (float) (aClass621_8044.anInt8124
					    * -1688810245) * f_68_);
		    int i_71_
			= (int) (f * (float) (893372357
					      * aClass621_8044.anInt8119)
				 + (float) (-738400327
					    * aClass621_8044.anInt8116) * f_67_
				 + (f_68_
				    * (float) (-820452715
					       * aClass621_8044.anInt8122)));
		    int i_72_
			= (aClass385_8037.anInt3972 * 579777191
			   + (int) (Math.random()
				    * (double) ((770148019
						 * aClass385_8037.anInt4005)
						- (aClass385_8037.anInt3972
						   * 579777191))));
		    int i_73_
			= (aClass385_8037.anInt4042 * -1714996053
			   + (int) (Math.random()
				    * (double) ((aClass385_8037.anInt4034
						 * 1843131803)
						- (aClass385_8037.anInt4042
						   * -1714996053))));
		    int i_74_
			= (1362111377 * aClass385_8037.anInt3981
			   + (int) (Math.random()
				    * (double) ((-1082478985
						 * aClass385_8037.anInt3982)
						- (aClass385_8037.anInt3981
						   * 1362111377))));
		    int i_75_ = -200780283 * aClass385_8037.anInt3976;
		    if (0 != -1520113663 * aClass385_8037.anInt4044) {
			if (aClass385_8037.anInt4013 * 908744515 == 0)
			    i_75_
				+= (int) (Math.random()
					  * (double) ((aClass385_8037.anInt4044
						       * -1520113663)
						      + 1));
			else
			    i_75_ += ((int) (Math.random()
					     * (double) (1 + ((aClass385_8037
							       .anInt4013)
							      * 908744515)))
				      * (aClass385_8037.anInt4044 * -1520113663
					 / (908744515
					    * aClass385_8037.anInt4013)));
		    }
		    int i_76_ = aClass385_8037.anInt4026 * 1082557415;
		    if (aClass385_8037.anInt4045 * -831517883 != 0)
			i_76_ += (int) (Math.random()
					* (double) (1 + (-831517883
							 * (aClass385_8037
							    .anInt4045))));
		    int i_77_;
		    if (aClass385_8037.aBool3987) {
			double d = Math.random();
			i_77_
			    = ((int) ((double) (-1590427409
						* aClass385_8037.anInt4022)
				      + d * (double) (-467462389
						      * (aClass385_8037
							 .anInt4024))) << 16
			       | (int) ((double) (aClass385_8037.anInt4029
						  * 1164973449)
					+ (d
					   * (double) (aClass385_8037.anInt4027
						       * 2123356127))) << 8
			       | (int) (((double) (-1708133081
						   * aClass385_8037.anInt4025)
					 * d)
					+ (double) (aClass385_8037.anInt3974
						    * 1719532367))
			       | ((int) ((double) (aClass385_8037.anInt4031
						   * 915869921)
					 + (Math.random()
					    * (double) (1298659105
							* (aClass385_8037
							   .anInt4030))))
				  << 24));
		    } else
			i_77_ = ((int) ((double) (-1590427409
						  * aClass385_8037.anInt4022)
					+ (Math.random()
					   * (double) (-467462389
						       * (aClass385_8037
							  .anInt4024)))) << 16
				 | (int) ((double) (1164973449
						    * aClass385_8037.anInt4029)
					  + (Math.random()
					     * (double) (2123356127
							 * (aClass385_8037
							    .anInt4027)))) << 8
				 | (int) ((double) (1719532367
						    * aClass385_8037.anInt3974)
					  + (Math.random()
					     * (double) (-1708133081
							 * (aClass385_8037
							    .anInt4025))))
				 | ((int) ((double) (aClass385_8037.anInt4031
						     * 915869921)
					   + (Math.random()
					      * (double) (1298659105
							  * (aClass385_8037
							     .anInt4030))))
				    << 24));
		    int i_78_ = 1995753329 * aClass385_8037.anInt3991;
		    if (!class185.method3247() && !aClass385_8037.aBool4033)
			i_78_ = -1;
		    Class536_Sub2_Sub1_Sub1 class536_sub2_sub1_sub1;
		    if (Class625.anInt8153 * -1398895791
			!= -676793059 * Class625.anInt8157) {
			class536_sub2_sub1_sub1
			    = (Class625.aClass536_Sub2_Sub1_Sub1Array8152
			       [Class625.anInt8153 * -1398895791]);
			Class625.anInt8153
			    = (-1113481807
			       * (1 + Class625.anInt8153 * -1398895791
				  & 0x3ff));
			class536_sub2_sub1_sub1.method18692
			    (this, i_69_, i_70_, i_71_, i_57_, i_58_, i_59_,
			     i_72_, i_73_, i_77_, i_74_, i_75_, i_76_, i_78_,
			     aClass385_8037.aBool4009,
			     aClass385_8037.aBool3986);
		    } else
			class536_sub2_sub1_sub1
			    = (new Class536_Sub2_Sub1_Sub1
			       (this, i_69_, i_70_, i_71_, i_57_, i_58_, i_59_,
				i_72_, i_73_, i_77_, i_74_, i_75_, i_76_,
				i_78_, aClass385_8037.aBool4009,
				aClass385_8037.aBool3986));
		    if (i_55_ > 256)
			class536_sub2_sub1_sub1.method18688(l, i_55_ >> 8);
		    anInt8054 += -969308481;
		    i_56_++;
		    i_55_ += i_54_;
		}
	    }
	}
	if (!aClass621_8044.method10277(aClass621_8045, (byte) -32)) {
	    Class621 class621 = aClass621_8045;
	    aClass621_8045 = aClass621_8044;
	    aClass621_8044 = class621;
	    aClass621_8044.anInt8114 = aClass172_8050.anInt1815 * 720651617;
	    aClass621_8044.anInt8115 = aClass172_8050.anInt1823 * -1609415377;
	    aClass621_8044.anInt8119 = aClass172_8050.anInt1817 * 1967664537;
	    aClass621_8044.anInt8117 = aClass172_8050.anInt1818 * 644414993;
	    aClass621_8044.anInt8118 = aClass172_8050.anInt1808 * -649875913;
	    aClass621_8044.anInt8116 = aClass172_8050.anInt1819 * 1986510425;
	    aClass621_8044.anInt8120 = -1134895951 * aClass172_8050.anInt1821;
	    aClass621_8044.anInt8124 = -1110900119 * aClass172_8050.anInt1822;
	    aClass621_8044.anInt8122 = 1399265027 * aClass172_8050.anInt1820;
	    aClass621_8044.anInt8123 = aClass621_8045.anInt8123 * 1;
	    aClass621_8044.anInt8125 = aClass621_8045.anInt8125 * 1;
	    aClass621_8044.anInt8121 = aClass621_8045.anInt8121 * 1;
	}
	Class625.anInt8163 += -1634087595 * anInt8054;
    }
    
    void method10136(Class556 class556, Class185 class185, long l) {
	for (Class536_Sub2_Sub1_Sub1 class536_sub2_sub1_sub1
		 = ((Class536_Sub2_Sub1_Sub1)
		    aClass709_8040.method14301(764908544));
	     class536_sub2_sub1_sub1 != null;
	     class536_sub2_sub1_sub1
		 = ((Class536_Sub2_Sub1_Sub1)
		    aClass709_8040.method14282(-423796200)))
	    class536_sub2_sub1_sub1.method18699(class556, class185, l);
    }
    
    void method10137(Class556 class556, Class185 class185, long l) {
	for (Class536_Sub2_Sub1_Sub1 class536_sub2_sub1_sub1
		 = ((Class536_Sub2_Sub1_Sub1)
		    aClass709_8040.method14301(764908544));
	     class536_sub2_sub1_sub1 != null;
	     class536_sub2_sub1_sub1 = ((Class536_Sub2_Sub1_Sub1)
					aClass709_8040.method14282(450088291)))
	    class536_sub2_sub1_sub1.method18699(class556, class185, l);
    }
    
    void method10138() {
	aClass621_8044.anInt8114 = aClass172_8050.anInt1815 * 720651617;
	aClass621_8044.anInt8115 = -1609415377 * aClass172_8050.anInt1823;
	aClass621_8044.anInt8119 = 1967664537 * aClass172_8050.anInt1817;
	aClass621_8044.anInt8117 = 644414993 * aClass172_8050.anInt1818;
	aClass621_8044.anInt8118 = aClass172_8050.anInt1808 * -649875913;
	aClass621_8044.anInt8116 = aClass172_8050.anInt1819 * 1986510425;
	aClass621_8044.anInt8120 = aClass172_8050.anInt1821 * -1134895951;
	aClass621_8044.anInt8124 = -1110900119 * aClass172_8050.anInt1822;
	aClass621_8044.anInt8122 = 1399265027 * aClass172_8050.anInt1820;
	if ((-1650142075 * aClass621_8044.anInt8114
	     == aClass621_8044.anInt8117 * -948931075)
	    && (aClass621_8044.anInt8117 * -948931075
		== aClass621_8044.anInt8120 * 2014210293)
	    && (aClass621_8044.anInt8118 * -2117433821
		== aClass621_8044.anInt8115 * 1507124323)
	    && (-1688810245 * aClass621_8044.anInt8124
		== -2117433821 * aClass621_8044.anInt8118)
	    && (893372357 * aClass621_8044.anInt8119
		== -738400327 * aClass621_8044.anInt8116)
	    && (-820452715 * aClass621_8044.anInt8122
		== aClass621_8044.anInt8116 * -738400327))
	    aBool8053 = true;
	else if (aBool8053) {
	    aBool8053 = false;
	    aClass621_8045.anInt8114 = aClass621_8044.anInt8114 * 1;
	    aClass621_8045.anInt8115 = aClass621_8044.anInt8115 * 1;
	    aClass621_8045.anInt8119 = 1 * aClass621_8044.anInt8119;
	    aClass621_8045.anInt8117 = aClass621_8044.anInt8117 * 1;
	    aClass621_8045.anInt8118 = aClass621_8044.anInt8118 * 1;
	    aClass621_8045.anInt8116 = aClass621_8044.anInt8116 * 1;
	    aClass621_8045.anInt8120 = aClass621_8044.anInt8120 * 1;
	    aClass621_8045.anInt8124 = aClass621_8044.anInt8124 * 1;
	    aClass621_8045.anInt8122 = 1 * aClass621_8044.anInt8122;
	}
    }
    
    public static boolean method10139(int i) {
	return Class510.anInterface60_5677 != null;
    }
}
