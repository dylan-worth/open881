/* Class704 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class704 implements Interface76
{
    int anInt8824;
    public static Class704 aClass704_8825;
    static Class704 aClass704_8826;
    public static Class704 aClass704_8827;
    public static Class704 aClass704_8828 = new Class704(-2);
    static Class704 aClass704_8829;
    static Class704 aClass704_8830;
    static Class704 aClass704_8831;
    static Class704 aClass704_8832;
    static Class704 aClass704_8833;
    static Class704 aClass704_8834;
    static Class704 aClass704_8835;
    static Class704 aClass704_8836;
    static Class704 aClass704_8837;
    static Class704 aClass704_8838;
    static Class704 aClass704_8839;
    static Class704 aClass704_8840;
    static Class704 aClass704_8841;
    static Class704 aClass704_8842;
    static Class704 aClass704_8843;
    
    Class704(int i) {
	anInt8824 = i * -1477203655;
    }
    
    public int method93() {
	return -1797753591 * anInt8824;
    }
    
    static {
	aClass704_8825 = new Class704(-3);
	aClass704_8826 = new Class704(2);
	aClass704_8827 = new Class704(3);
	aClass704_8829 = new Class704(4);
	aClass704_8837 = new Class704(5);
	aClass704_8830 = new Class704(6);
	aClass704_8831 = new Class704(7);
	aClass704_8836 = new Class704(8);
	aClass704_8833 = new Class704(9);
	aClass704_8834 = new Class704(10);
	aClass704_8835 = new Class704(20);
	aClass704_8841 = new Class704(21);
	aClass704_8840 = new Class704(30);
	aClass704_8838 = new Class704(31);
	aClass704_8839 = new Class704(32);
	aClass704_8832 = new Class704(33);
	aClass704_8843 = new Class704(34);
	aClass704_8842 = new Class704(38);
    }
    
    public int method22() {
	return -1797753591 * anInt8824;
    }
    
    public int method53() {
	return -1797753591 * anInt8824;
    }
    
    static final void method14221(Class669 class669, int i) {
	class669.anInt8600 -= 1544997815;
	int i_0_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_1_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	int i_2_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 2];
	int i_3_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 3];
	int i_4_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 4];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (i_1_ - i_0_) * (i_4_ - i_2_) / (i_3_ - i_2_) + i_0_;
    }
    
    static final void method14222(Class419 class419, int i) {
	Class534_Sub40_Sub1 class534_sub40_sub1
	    = client.aClass100_11264.aClass534_Sub40_Sub1_1179;
	if (class419 == Class419.aClass419_4692) {
	    int i_5_ = class534_sub40_sub1.method16527(563493327);
	    int i_6_ = (i_5_ >> 4 & 0xf) + -740028054 * Class462.anInt5094;
	    int i_7_ = -1531537914 * Class185.anInt2023 + (i_5_ & 0xf);
	    int i_8_ = class534_sub40_sub1.method16527(1019612005);
	    boolean bool = 0 != (i_8_ & 0x1);
	    boolean bool_9_ = 0 != (i_8_ & 0x2);
	    int i_10_ = bool_9_ ? i_8_ >> 2 : -1;
	    int i_11_ = i_6_ + class534_sub40_sub1.method16586((byte) 1);
	    int i_12_ = i_7_ + class534_sub40_sub1.method16586((byte) 1);
	    int i_13_ = class534_sub40_sub1.method16530((byte) -31);
	    int i_14_ = class534_sub40_sub1.method16530((byte) -72);
	    int i_15_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_16_ = class534_sub40_sub1.method16527(-1456244369);
	    if (bool_9_)
		i_16_ = (byte) i_16_;
	    else
		i_16_ *= 4;
	    int i_17_ = class534_sub40_sub1.method16527(1336075124) * 4;
	    int i_18_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_19_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_20_ = class534_sub40_sub1.method16527(1872847340);
	    int i_21_ = class534_sub40_sub1.method16529((byte) 1);
	    if (255 == i_20_)
		i_20_ = -1;
	    int i_22_ = class534_sub40_sub1.method16530((byte) -57);
	    if (client.aClass512_11100.method8412(-760856544)
		!= Class499.aClass499_5594) {
		if (i_6_ >= 0 && i_7_ >= 0
		    && i_6_ < client.aClass512_11100.method8417(-606259316) * 2
		    && i_7_ < client.aClass512_11100.method8417(1382884521) * 2
		    && i_11_ >= 0 && i_12_ >= 0
		    && (i_11_
			< client.aClass512_11100.method8418(-1533611049) * 2)
		    && (i_12_
			< client.aClass512_11100.method8418(-1533611049) * 2)
		    && 65535 != i_15_) {
		    i_6_ *= 256;
		    i_7_ = 256 * i_7_;
		    i_11_ *= 256;
		    i_12_ = 256 * i_12_;
		    i_16_ <<= 2;
		    i_17_ <<= 2;
		    i_21_ <<= 2;
		    Class418.method6759(i_15_, i_13_, i_14_, i_10_, i_16_,
					i_17_, i_6_, i_7_, i_11_, i_12_, i_18_,
					i_19_, i_20_, i_21_, bool, i_22_,
					(short) 16383);
		}
	    }
	} else if (Class419.aClass419_4690 == class419) {
	    int i_23_ = class534_sub40_sub1.method16533(-258848859);
	    int i_24_ = class534_sub40_sub1.method16527(-1870168305);
	    ((Class602) client.aClass512_11100.method8428(-1486655428)
			    .method91(i_23_, -2087341015))
		.method10000(i_24_, (byte) 76);
	} else if (Class419.aClass419_4699 == class419) {
	    int i_25_ = class534_sub40_sub1.method16527(-1140926960);
	    int i_26_ = (i_25_ >> 4 & 0x7) + -370014027 * Class462.anInt5094;
	    int i_27_ = (i_25_ & 0x7) + Class185.anInt2023 * -765768957;
	    int i_28_ = class534_sub40_sub1.method16563((byte) -22);
	    int i_29_ = i_28_ >> 2;
	    int i_30_ = i_28_ & 0x3;
	    int i_31_ = client.anIntArray11136[i_29_];
	    if (client.aClass512_11100.method8412(-1676463353)
		    .method8265((byte) -23)
		|| (i_26_ >= 0 && i_27_ >= 0
		    && i_26_ < client.aClass512_11100.method8417(1847599398)
		    && i_27_ < client.aClass512_11100.method8418(-1533611049)))
		Class482.method7930(-1729998935 * Class412.anInt4643, i_26_,
				    i_27_, i_31_, -1, i_29_, i_30_, 946753643);
	} else if (Class419.aClass419_4693 == class419) {
	    int i_32_ = class534_sub40_sub1.method16527(-138887191);
	    int i_33_ = (i_32_ >> 4 & 0x7) + Class462.anInt5094 * -370014027;
	    int i_34_ = -765768957 * Class185.anInt2023 + (i_32_ & 0x7);
	    int i_35_ = class534_sub40_sub1.method16529((byte) 1);
	    if (i_35_ == 65535)
		i_35_ = -1;
	    int i_36_ = class534_sub40_sub1.method16527(-1135912473);
	    int i_37_ = i_36_ >> 4 & 0xf;
	    int i_38_ = i_36_ & 0x7;
	    int i_39_ = class534_sub40_sub1.method16527(-204841218);
	    int i_40_ = class534_sub40_sub1.method16527(438682135);
	    int i_41_ = class534_sub40_sub1.method16529((byte) 1);
	    boolean bool = class534_sub40_sub1.method16527(-592579475) == 1;
	    if (client.aClass512_11100.method8412(-822577003)
		!= Class499.aClass499_5594) {
		if (i_33_ >= 0 && i_34_ >= 0
		    && i_33_ < client.aClass512_11100.method8417(1766293319)
		    && (i_34_
			< client.aClass512_11100.method8418(-1533611049))) {
		    int i_42_ = 1 + i_37_;
		    if ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			 .anIntArray11977[0]) >= i_33_ - i_42_
			&& (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			    .anIntArray11977[0]) <= i_42_ + i_33_
			&& (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			    .anIntArray11978[0]) >= i_34_ - i_42_
			&& (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			    .anIntArray11978[0]) <= i_42_ + i_34_) {
			Class438 class438
			    = new Class438((float) (i_33_ << 9), 0.0F,
					   (float) (i_34_ << 9));
			int i_43_ = -1729998935 * Class412.anInt4643;
			int i_44_ = (bool
				     ? Class190.aClass190_2128
					   .method3763(-2115044879)
				     : Class190.aClass190_2134
					   .method3763(1574202331));
			Class171_Sub4.aClass232_9944.method4237
			    (Class211.aClass211_2256, i_35_, i_38_, i_40_,
			     i_44_, Class207.aClass207_2236, 0.0F,
			     (float) (i_37_ << 9), class438, i_43_, i_41_,
			     i_39_, (byte) 1);
		    }
		}
	    }
	} else if (Class419.aClass419_4694 == class419) {
	    int i_45_ = class534_sub40_sub1.method16527(-263944154);
	    boolean bool = (i_45_ & 0x80) != 0;
	    int i_46_ = Class462.anInt5094 * -370014027 + (i_45_ >> 3 & 0x7);
	    int i_47_ = -765768957 * Class185.anInt2023 + (i_45_ & 0x7);
	    int i_48_ = i_46_ + class534_sub40_sub1.method16586((byte) 1);
	    int i_49_ = i_47_ + class534_sub40_sub1.method16586((byte) 1);
	    int i_50_ = class534_sub40_sub1.method16530((byte) -118);
	    int i_51_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_52_ = class534_sub40_sub1.method16527(861449276) * 4;
	    int i_53_ = class534_sub40_sub1.method16527(1820136403) * 4;
	    int i_54_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_55_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_56_ = class534_sub40_sub1.method16527(496859186);
	    int i_57_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_58_ = class534_sub40_sub1.method16530((byte) -61);
	    if (i_56_ == 255)
		i_56_ = -1;
	    if (client.aClass512_11100.method8412(-1674724306)
		!= Class499.aClass499_5594) {
		if (i_46_ >= 0 && i_47_ >= 0
		    && i_46_ < client.aClass512_11100.method8417(425642919)
		    && i_47_ < client.aClass512_11100.method8418(-1533611049)
		    && i_48_ >= 0 && i_49_ >= 0
		    && i_48_ < client.aClass512_11100.method8417(-642163682)
		    && i_49_ < client.aClass512_11100.method8418(-1533611049)
		    && 65535 != i_51_) {
		    i_46_ = 256 + i_46_ * 512;
		    i_47_ = 256 + 512 * i_47_;
		    i_48_ = 512 * i_48_ + 256;
		    i_49_ = 256 + i_49_ * 512;
		    i_52_ <<= 2;
		    i_53_ <<= 2;
		    i_57_ <<= 2;
		    Class654_Sub1_Sub5_Sub6 class654_sub1_sub5_sub6
			= (new Class654_Sub1_Sub5_Sub6
			   (client.aClass512_11100.method8424((byte) 108),
			    i_51_, Class412.anInt4643 * -1729998935,
			    -1729998935 * Class412.anInt4643, i_46_, i_47_,
			    i_52_, client.anInt11101 + i_54_,
			    client.anInt11101 + i_55_, i_56_, i_57_, 0, i_50_,
			    i_53_, bool, -1, i_58_));
		    class654_sub1_sub5_sub6.method18799
			(i_48_, i_49_,
			 Class247.method4595(i_48_, i_49_,
					     -1729998935 * Class412.anInt4643,
					     -861538727) - i_53_,
			 client.anInt11101 + i_54_, 16711935);
		    client.aClass700_11210.method14131
			(new Class534_Sub18_Sub4(class654_sub1_sub5_sub6),
			 (short) 789);
		}
	    }
	} else if (class419 == Class419.aClass419_4701) {
	    int i_59_ = class534_sub40_sub1.method16571(-1710671343);
	    int i_60_ = class534_sub40_sub1.method16573(-1982766353);
	    int i_61_ = class534_sub40_sub1.method16745(-891094135);
	    Class597 class597 = client.aClass512_11100.method8416((byte) 2);
	    int i_62_ = (i_61_ & 0x7) + Class185.anInt2023 * -765768957;
	    int i_63_ = class597.anInt7861 * -1166289421 + i_62_;
	    int i_64_ = -370014027 * Class462.anInt5094 + (i_61_ >> 4 & 0x7);
	    int i_65_ = i_64_ + class597.anInt7859 * -424199969;
	    boolean bool
		= (i_64_ >= 0 && i_62_ >= 0
		   && i_64_ < client.aClass512_11100.method8417(843390004)
		   && i_62_ < client.aClass512_11100.method8418(-1533611049));
	    if (bool || client.aClass512_11100.method8412(-1254036058)
			    .method8265((byte) -59)) {
		Class496.method8132(Class412.anInt4643 * -1729998935, i_65_,
				    i_63_, new Class534_Sub23(i_60_, i_59_),
				    (byte) 54);
		if (bool)
		    Class563.method9510(-1729998935 * Class412.anInt4643,
					i_64_, i_62_, (short) 24496);
	    }
	} else if (class419 == Class419.aClass419_4698) {
	    int i_66_ = class534_sub40_sub1.method16573(-1982766353);
	    int i_67_ = class534_sub40_sub1.method16527(271862113);
	    Class597 class597 = client.aClass512_11100.method8416((byte) 105);
	    int i_68_ = -765768957 * Class185.anInt2023 + (i_67_ & 0x7);
	    int i_69_ = i_68_ + class597.anInt7861 * -1166289421;
	    int i_70_ = (i_67_ >> 4 & 0x7) + -370014027 * Class462.anInt5094;
	    int i_71_ = i_70_ + -424199969 * class597.anInt7859;
	    Class534_Sub7 class534_sub7
		= ((Class534_Sub7)
		   client.aClass9_11209.method579((long) ((Class412.anInt4643
							   * -1729998935) << 28
							  | i_69_ << 14
							  | i_71_)));
	    if (null != class534_sub7) {
		for (Class534_Sub23 class534_sub23
			 = (Class534_Sub23) class534_sub7.aClass700_10418
						.method14135((byte) -1);
		     null != class534_sub23;
		     class534_sub23
			 = (Class534_Sub23) class534_sub7.aClass700_10418
						.method14139(1758492500)) {
		    if (i_66_ == class534_sub23.anInt10548 * -400233975) {
			class534_sub23.method8892((byte) 1);
			break;
		    }
		}
		if (class534_sub7.aClass700_10418.method14142(-6747663))
		    class534_sub7.method8892((byte) 1);
		if (i_70_ >= 0 && i_68_ >= 0
		    && i_70_ < client.aClass512_11100.method8417(1297351824)
		    && i_68_ < client.aClass512_11100.method8418(-1533611049))
		    Class563.method9510(-1729998935 * Class412.anInt4643,
					i_70_, i_68_, (short) 19141);
	    }
	} else if (class419 == Class419.aClass419_4703) {
	    int i_72_ = class534_sub40_sub1.method16527(-672756061);
	    Class597 class597 = client.aClass512_11100.method8416((byte) 86);
	    int i_73_ = (i_72_ & 0x7) + -765768957 * Class185.anInt2023;
	    int i_74_ = -1166289421 * class597.anInt7861 + i_73_;
	    int i_75_ = Class462.anInt5094 * -370014027 + (i_72_ >> 4 & 0x7);
	    int i_76_ = i_75_ + -424199969 * class597.anInt7859;
	    int i_77_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_78_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_79_ = class534_sub40_sub1.method16571(-1226601480);
	    if (i_78_ != client.anInt11037 * -643758853) {
		boolean bool
		    = (i_75_ >= 0 && i_73_ >= 0
		       && i_75_ < client.aClass512_11100.method8417(1635874809)
		       && (i_73_
			   < client.aClass512_11100.method8418(-1533611049)));
		if (bool || client.aClass512_11100.method8412(-715737783)
				.method8265((byte) -90)) {
		    Class496.method8132(Class412.anInt4643 * -1729998935,
					i_76_, i_74_,
					new Class534_Sub23(i_79_, i_77_),
					(byte) 65);
		    if (bool)
			Class563.method9510(Class412.anInt4643 * -1729998935,
					    i_75_, i_73_, (short) 10971);
		}
	    }
	} else if (class419 == Class419.aClass419_4691) {
	    int i_80_ = class534_sub40_sub1.method16581(-245346297);
	    int i_81_ = class534_sub40_sub1.method16643(-2078566420);
	    int i_82_ = i_81_ >> 2;
	    int i_83_ = i_81_ & 0x3;
	    int i_84_ = client.anIntArray11136[i_82_];
	    int i_85_ = class534_sub40_sub1.method16527(1650961637);
	    int i_86_ = -370014027 * Class462.anInt5094 + (i_85_ >> 4 & 0x7);
	    int i_87_ = (i_85_ & 0x7) + Class185.anInt2023 * -765768957;
	    if (client.aClass512_11100.method8412(-1017107169)
		    .method8265((byte) -38)
		|| (i_86_ >= 0 && i_87_ >= 0
		    && i_86_ < client.aClass512_11100.method8417(1708437076)
		    && i_87_ < client.aClass512_11100.method8418(-1533611049)))
		Class482.method7930(Class412.anInt4643 * -1729998935, i_86_,
				    i_87_, i_84_, i_80_, i_82_, i_83_,
				    -79817171);
	} else if (class419 == Class419.aClass419_4695) {
	    int i_88_ = class534_sub40_sub1.method16527(-1806301636);
	    int i_89_ = -370014027 * Class462.anInt5094 + (i_88_ >> 4 & 0x7);
	    int i_90_ = (i_88_ & 0x7) + Class185.anInt2023 * -765768957;
	    int i_91_ = class534_sub40_sub1.method16529((byte) 1);
	    if (i_91_ == 65535)
		i_91_ = -1;
	    int i_92_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_93_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_94_ = class534_sub40_sub1.method16527(1747151516);
	    int i_95_ = class534_sub40_sub1.method16530((byte) -6);
	    if (client.aClass512_11100.method8412(-2030642191)
		!= Class499.aClass499_5594) {
		if (i_89_ >= 0 && i_90_ >= 0
		    && i_89_ < client.aClass512_11100.method8417(797549583)
		    && (i_90_
			< client.aClass512_11100.method8418(-1533611049))) {
		    if (-1 == i_91_) {
			Class534_Sub18_Sub5 class534_sub18_sub5
			    = ((Class534_Sub18_Sub5)
			       client.aClass9_11322
				   .method579((long) (i_89_ << 16 | i_90_)));
			if (class534_sub18_sub5 != null) {
			    class534_sub18_sub5
				.aClass654_Sub1_Sub5_Sub5_11651
				.method18781((byte) 95);
			    class534_sub18_sub5.method8892((byte) 1);
			}
		    } else {
			int i_96_ = i_89_ * 512 + 256;
			int i_97_ = i_90_ * 512 + 256;
			int i_98_ = -1729998935 * Class412.anInt4643;
			if (i_98_ < 3
			    && client.aClass512_11100.method8552((byte) 0)
				   .method7612(i_89_, i_90_, (byte) 0))
			    i_98_++;
			Class654_Sub1_Sub5_Sub5 class654_sub1_sub5_sub5
			    = (new Class654_Sub1_Sub5_Sub5
			       (client.aClass512_11100.method8424((byte) 116),
				i_91_, i_93_, Class412.anInt4643 * -1729998935,
				i_98_, i_96_,
				Class247.method4595(i_96_, i_97_,
						    (Class412.anInt4643
						     * -1729998935),
						    -716410374) - i_92_,
				i_97_, i_89_, i_89_, i_90_, i_90_, i_94_,
				false, i_95_));
			client.aClass9_11322.method581
			    (new Class534_Sub18_Sub5(class654_sub1_sub5_sub5),
			     (long) (i_89_ << 16 | i_90_));
		    }
		}
	    }
	} else if (Class419.aClass419_4700 == class419) {
	    int i_99_ = class534_sub40_sub1.method16563((byte) -48);
	    int i_100_ = (i_99_ >> 4 & 0x7) + Class462.anInt5094 * -370014027;
	    int i_101_ = Class185.anInt2023 * -765768957 + (i_99_ & 0x7);
	    int i_102_ = class534_sub40_sub1.method16527(-578658596);
	    int i_103_ = class534_sub40_sub1.method16533(-258848859);
	    int i_104_ = class534_sub40_sub1.method16643(-2119641407);
	    int i_105_ = i_104_ >> 2;
	    int i_106_ = i_104_ & 0x3;
	    int i_107_ = client.anIntArray11136[i_105_];
	    if (client.aClass512_11100.method8412(-1350759939)
		!= Class499.aClass499_5594)
		Class50.method1163(-1729998935 * Class412.anInt4643, i_100_,
				   i_101_, i_107_, i_105_, i_106_, i_103_,
				   i_102_, (byte) -122);
	} else if (class419 == Class419.aClass419_4689) {
	    int i_108_ = class534_sub40_sub1.method16527(254710840);
	    int i_109_ = Class462.anInt5094 * -370014027 + (i_108_ >> 4 & 0x7);
	    int i_110_ = -765768957 * Class185.anInt2023 + (i_108_ & 0x7);
	    int i_111_ = class534_sub40_sub1.method16529((byte) 1);
	    if (i_111_ == 65535)
		i_111_ = -1;
	    int i_112_ = class534_sub40_sub1.method16527(1333839709);
	    int i_113_ = i_112_ >> 4 & 0xf;
	    int i_114_ = i_112_ & 0x7;
	    int i_115_ = class534_sub40_sub1.method16527(-402922704);
	    int i_116_ = class534_sub40_sub1.method16527(1631318116);
	    int i_117_ = class534_sub40_sub1.method16529((byte) 1);
	    if (client.aClass512_11100.method8412(-1834155134)
		!= Class499.aClass499_5594) {
		if (i_109_ >= 0 && i_110_ >= 0
		    && i_109_ < client.aClass512_11100.method8417(-420371668)
		    && (i_110_
			< client.aClass512_11100.method8418(-1533611049))) {
		    int i_118_ = i_113_ + 1;
		    if ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			 .anIntArray11977[0]) >= i_109_ - i_118_
			&& (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			    .anIntArray11977[0]) <= i_109_ + i_118_
			&& (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			    .anIntArray11978[0]) >= i_110_ - i_118_
			&& (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			    .anIntArray11978[0]) <= i_110_ + i_118_) {
			Class438 class438
			    = new Class438((float) (i_109_ << 9), 0.0F,
					   (float) (i_110_ << 9));
			int i_119_ = Class412.anInt4643 * -1729998935;
			Class171_Sub4.aClass232_9944.method4237
			    (Class211.aClass211_2256, i_111_, i_114_, i_116_,
			     Class190.aClass190_2134.method3763(-1018402782),
			     Class207.aClass207_2236, 0.0F,
			     (float) (i_113_ << 9), class438, i_119_, i_117_,
			     i_115_, (byte) 41);
		    }
		}
	    }
	} else if (class419 == Class419.aClass419_4697) {
	    int i_120_ = class534_sub40_sub1.method16563((byte) -57);
	    int i_121_ = Class462.anInt5094 * -370014027 + (i_120_ >> 4 & 0x7);
	    int i_122_ = (i_120_ & 0x7) + -765768957 * Class185.anInt2023;
	    int i_123_ = class534_sub40_sub1.method16581(1067569522);
	    int i_124_ = class534_sub40_sub1.method16643(-2081405079);
	    int i_125_ = class534_sub40_sub1.method16563((byte) -44);
	    int i_126_ = i_125_ >> 2;
	    int i_127_ = client.anIntArray11136[i_126_];
	    if (847393323 * Class595.aClass595_7850.anInt7852 == i_126_)
		i_126_ = 847393323 * Class595.aClass595_7836.anInt7852;
	    if (1 == (i_124_ & 0x1))
		Class267.method4871(Class412.anInt4643 * -1729998935, i_121_,
				    i_122_, i_127_, i_123_, i_126_, null,
				    (byte) 0);
	    else {
		int[] is = null;
		if ((i_124_ & 0x2) == 2) {
		    int i_128_ = class534_sub40_sub1.method16527(1820479501);
		    is = new int[i_128_];
		    for (int i_129_ = 0; i_129_ < i_128_; i_129_++)
			is[i_129_]
			    = class534_sub40_sub1.method16533(-258848859);
		}
		short[] is_130_ = null;
		if (4 == (i_124_ & 0x4)) {
		    int i_131_ = class534_sub40_sub1.method16527(-416072650);
		    is_130_ = new short[i_131_];
		    for (int i_132_ = 0; i_132_ < i_131_; i_132_++)
			is_130_[i_132_] = (short) class534_sub40_sub1
						      .method16529((byte) 1);
		}
		short[] is_133_ = null;
		if (8 == (i_124_ & 0x8)) {
		    int i_134_ = class534_sub40_sub1.method16527(1183174337);
		    is_133_ = new short[i_134_];
		    for (int i_135_ = 0; i_135_ < i_134_; i_135_++)
			is_133_[i_135_] = (short) class534_sub40_sub1
						      .method16529((byte) 1);
		}
		Class267.method4871(Class412.anInt4643 * -1729998935, i_121_,
				    i_122_, i_127_, i_123_, i_126_,
				    new Class596((611374076583165065L
						  * Class534_Sub4.aLong10410),
						 is, is_130_, is_133_),
				    (byte) 0);
		Class534_Sub4.aLong10410 += 4551746311500396985L;
	    }
	} else if (class419 == Class419.aClass419_4702) {
	    int i_136_ = class534_sub40_sub1.method16527(-1666507900);
	    Class597 class597 = client.aClass512_11100.method8416((byte) 97);
	    int i_137_ = -765768957 * Class185.anInt2023 + (i_136_ & 0x7);
	    int i_138_ = -1166289421 * class597.anInt7861 + i_137_;
	    int i_139_ = Class462.anInt5094 * -370014027 + (i_136_ >> 4 & 0x7);
	    int i_140_ = -424199969 * class597.anInt7859 + i_139_;
	    int i_141_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_142_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_143_ = class534_sub40_sub1.method16529((byte) 1);
	    if (null != client.aClass9_11209) {
		Class534_Sub7 class534_sub7
		    = ((Class534_Sub7)
		       (client.aClass9_11209.method579
			((long) (Class412.anInt4643 * -1729998935 << 28
				 | i_138_ << 14 | i_140_))));
		if (class534_sub7 != null) {
		    for (Class534_Sub23 class534_sub23
			     = (Class534_Sub23) class534_sub7
						    .aClass700_10418
						    .method14135((byte) -1);
			 null != class534_sub23;
			 class534_sub23
			     = (Class534_Sub23) class534_sub7
						    .aClass700_10418
						    .method14139(1624006571)) {
			if (i_141_ == -400233975 * class534_sub23.anInt10548
			    && (-491988633 * class534_sub23.anInt10547
				== i_142_)) {
			    class534_sub23.method8892((byte) 1);
			    class534_sub23.anInt10547 = -917228969 * i_143_;
			    Class496.method8132((Class412.anInt4643
						 * -1729998935),
						i_140_, i_138_, class534_sub23,
						(byte) 86);
			    break;
			}
		    }
		    if (i_139_ >= 0 && i_137_ >= 0
			&& (i_139_
			    < client.aClass512_11100.method8417(1445917842))
			&& (i_137_
			    < client.aClass512_11100.method8418(-1533611049)))
			Class563.method9510(-1729998935 * Class412.anInt4643,
					    i_139_, i_137_, (short) 15330);
		}
	    }
	} else if (class419 == Class419.aClass419_4696) {
	    class534_sub40_sub1.method16527(-2045935631);
	    int i_144_ = class534_sub40_sub1.method16527(-703305923);
	    int i_145_ = (i_144_ >> 4 & 0x7) + -370014027 * Class462.anInt5094;
	    int i_146_ = (i_144_ & 0x7) + Class185.anInt2023 * -765768957;
	    int i_147_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_148_ = class534_sub40_sub1.method16527(-985028793);
	    int i_149_ = class534_sub40_sub1.method16531(2124981198);
	    String string = class534_sub40_sub1.method16541((byte) -90);
	    if (client.aClass512_11100.method8412(-1529058512)
		!= Class499.aClass499_5594)
		Class386.method6496(Class412.anInt4643 * -1729998935, i_145_,
				    i_146_, i_148_, i_147_, i_149_, string,
				    1567399823);
	} else {
	    Class262.method4824(new StringBuilder().append("").append
				    (class419).toString(),
				new RuntimeException(), (byte) -13);
	    Class622.method10291(false, 1640644982);
	}
    }
}
