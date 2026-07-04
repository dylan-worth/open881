/* Class561 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class561
{
    public int anInt7519;
    static final int anInt7520 = 4;
    static final int anInt7521 = 13;
    static final int anInt7522 = 3;
    static final int anInt7523 = 2;
    static final int anInt7524 = 5;
    static final int anInt7525 = 2;
    static final int anInt7526 = 3;
    static final int anInt7527 = 4;
    static final int anInt7528 = 5;
    int anInt7529;
    static final int anInt7530 = 7;
    short[] aShortArray7531;
    static final int anInt7532 = 9;
    int anInt7533;
    static final int anInt7534 = 11;
    static final int anInt7535 = 10;
    static final int anInt7536 = 6;
    static final int anInt7537 = 14;
    static final int anInt7538 = 15;
    static final int anInt7539 = 16;
    public static final int anInt7540 = 31;
    public Class534_Sub21 aClass534_Sub21_7541;
    boolean aBool7542;
    boolean aBool7543;
    public int anInt7544;
    static final int anInt7545 = 1;
    int anInt7546 = -1682295449;
    public static final int anInt7547 = 0;
    int anInt7548;
    int anInt7549;
    int anInt7550;
    static final int anInt7551 = 8;
    static final int anInt7552 = 12;
    
    static void method9435() {
	Class540.anIntArray7174
	    = Class200_Sub1.method15567(2048, 35, 8, 8, 4, 0.4F, true,
					1255994528);
    }
    
    void method9436(int i, boolean bool, int i_0_) {
	int i_1_;
	if (!bool) {
	    int i_2_ = (anInt7548 * 1285866109 * i / 50 + 765198623 * anInt7549
			& 0x7ff);
	    switch (-1278600401 * anInt7533) {
	    case 3:
		i_1_ = Class540.anIntArray7174[i_2_] >> 1;
		break;
	    case 4:
		i_1_ = i_2_ >> 10 << 11;
		break;
	    default:
		i_1_ = 2048;
		break;
	    case 2:
		i_1_ = i_2_;
		break;
	    case 5:
		i_1_ = (i_2_ < 1024 ? i_2_ : 2048 - i_2_) << 1;
		break;
	    case 1:
		i_1_ = 1024 + (Class427.anIntArray4806[i_2_ << 3] >> 4);
	    }
	} else
	    i_1_ = 2048;
	aClass534_Sub21_7541.method16203(((float) ((i_1_ * (anInt7550
							    * 1187953771)
						    >> 11)
						   + 1109127889 * anInt7529)
					  / 2048.0F),
					 (byte) -89);
	aClass534_Sub21_7541.method16209(251744543);
    }
    
    public void method9437(int i, int i_3_, int i_4_, int i_5_, int i_6_) {
	anInt7533 = -404288561 * i;
	anInt7529 = 79930929 * i_5_;
	anInt7550 = -1948643261 * i_4_;
	anInt7548 = 1970030293 * i_3_;
    }
    
    void method9438(Class185 class185, int i, int i_7_, int i_8_, int i_9_,
		    int i_10_) {
	aClass534_Sub21_7541
	    = class185.method3345(i, i_7_, i_8_, i_9_, i_10_, 1.0F);
    }
    
    void method9439(Class185 class185, int i, int i_11_, int i_12_, int i_13_,
		    int i_14_, short i_15_) {
	aClass534_Sub21_7541
	    = class185.method3345(i, i_11_, i_12_, i_13_, i_14_, 1.0F);
    }
    
    public Class561(Class185 class185, int i, Class534_Sub40 class534_sub40,
		    int i_16_) {
	if (null == Class540.anIntArray7174)
	    Class351.method6186((byte) -57);
	anInt7544 = class534_sub40.method16527(469098922) * 725934419;
	aBool7542 = (551684827 * anInt7544 & 0x8) != 0;
	aBool7543 = (551684827 * anInt7544 & 0x10) != 0;
	anInt7544 = 725934419 * (551684827 * anInt7544 & 0x7);
	int i_17_ = class534_sub40.method16529((byte) 1) << i_16_;
	int i_18_ = class534_sub40.method16529((byte) 1) << i_16_;
	int i_19_ = class534_sub40.method16529((byte) 1) << i_16_;
	int i_20_ = class534_sub40.method16527(830658666);
	int i_21_ = 1 + 2 * i_20_;
	aShortArray7531 = new short[i_21_];
	for (int i_22_ = 0; i_22_ < aShortArray7531.length; i_22_++) {
	    int i_23_ = (short) class534_sub40.method16529((byte) 1);
	    int i_24_ = i_23_ >>> 8;
	    int i_25_ = i_23_ & 0xff;
	    if (i_24_ >= i_21_)
		i_24_ = i_21_ - 1;
	    if (i_25_ > i_21_ - i_24_)
		i_25_ = i_21_ - i_24_;
	    aShortArray7531[i_22_] = (short) (i_24_ << 8 | i_25_);
	}
	i_20_ = (i_20_ << i) + (1 << i >> 1);
	int i_26_
	    = (null != Class661.anIntArray8549
	       ? Class661.anIntArray8549[class534_sub40.method16529((byte) 1)]
	       : (Class415.anIntArray4666
		  [Class315.method5705(class534_sub40.method16529((byte) 1),
				       -36508181) & 0xffff]));
	int i_27_ = class534_sub40.method16527(1008892043);
	anInt7519 = (i_27_ & 0x1f) * -1397346521;
	anInt7549 = -1243202849 * ((i_27_ & 0xe0) << 3);
	if (anInt7519 * -1065201513 != 31)
	    method9442(1485124670);
	anInt7546 = class534_sub40.method16530((byte) -80) * 1682295449;
	method9439(class185, i_17_, i_19_, i_18_, i_20_, i_26_,
		   (short) -10299);
    }
    
    public void method9440(int i, int i_28_, int i_29_, int i_30_) {
	anInt7533 = -404288561 * i;
	anInt7529 = 79930929 * i_30_;
	anInt7550 = -1948643261 * i_29_;
	anInt7548 = 1970030293 * i_28_;
    }
    
    public void method9441(int i, int i_31_, int i_32_, int i_33_) {
	anInt7533 = -404288561 * i;
	anInt7529 = 79930929 * i_33_;
	anInt7550 = -1948643261 * i_32_;
	anInt7548 = 1970030293 * i_31_;
    }
    
    void method9442(int i) {
	switch (-1065201513 * anInt7519) {
	case 5:
	    anInt7533 = -1617154244;
	    anInt7529 = 0;
	    anInt7550 = -796780544;
	    anInt7548 = -1998938112;
	    break;
	default:
	    anInt7529 = 0;
	    anInt7533 = 0;
	    anInt7550 = -796780544;
	    anInt7548 = 1647749120;
	    break;
	case 16:
	    anInt7533 = -404288561;
	    anInt7529 = 1502304000;
	    anInt7550 = -636468480;
	    anInt7548 = -1998938112;
	    break;
	case 4:
	    anInt7533 = -1617154244;
	    anInt7529 = 0;
	    anInt7550 = -796780544;
	    anInt7548 = 1647749120;
	    break;
	case 9:
	    anInt7533 = -1212865683;
	    anInt7529 = 244892672;
	    anInt7550 = 1749093376;
	    anInt7548 = -999469056;
	    break;
	case 14:
	    anInt7533 = -404288561;
	    anInt7529 = -767625984;
	    anInt7550 = -1909405440;
	    anInt7548 = 1647749120;
	    break;
	case 11:
	    anInt7533 = -1212865683;
	    anInt7529 = -1780144640;
	    anInt7550 = -1272936960;
	    anInt7548 = -999469056;
	    break;
	case 15:
	    anInt7533 = -404288561;
	    anInt7529 = -1780144640;
	    anInt7550 = -1272936960;
	    anInt7548 = -999469056;
	    break;
	case 7:
	    anInt7533 = -1212865683;
	    anInt7529 = -767625984;
	    anInt7550 = -1909405440;
	    anInt7548 = -999469056;
	    break;
	case 6:
	    anInt7533 = -1212865683;
	    anInt7529 = -767625984;
	    anInt7550 = -1909405440;
	    anInt7548 = 1647749120;
	    break;
	case 2:
	    anInt7533 = -404288561;
	    anInt7529 = 0;
	    anInt7550 = -796780544;
	    anInt7548 = 1647749120;
	    break;
	case 8:
	    anInt7533 = -1212865683;
	    anInt7529 = 244892672;
	    anInt7550 = 1749093376;
	    anInt7548 = 1647749120;
	    break;
	case 13:
	    anInt7533 = -808577122;
	    anInt7529 = 0;
	    anInt7550 = -796780544;
	    anInt7548 = -1998938112;
	    break;
	case 10:
	    anInt7533 = -1212865683;
	    anInt7529 = -1780144640;
	    anInt7550 = -1272936960;
	    anInt7548 = 1647749120;
	    break;
	case 12:
	    anInt7533 = -808577122;
	    anInt7529 = 0;
	    anInt7550 = -796780544;
	    anInt7548 = 1647749120;
	    break;
	case 3:
	    anInt7533 = -404288561;
	    anInt7529 = 0;
	    anInt7550 = -796780544;
	    anInt7548 = -999469056;
	}
    }
    
    static void method9443() {
	Class540.anIntArray7174
	    = Class200_Sub1.method15567(2048, 35, 8, 8, 4, 0.4F, true,
					-952106010);
    }
    
    public static void method9444(byte i) {
	Class613.aClass163_8025 = null;
	Class113.anInt1381 = 1312565957;
    }
    
    static void method9445(Class669 class669, short i) {
	class669.anIntArray8595[2088438307 * class669.anInt8600 - 1]
	    = ((Class273)
	       Class223.aClass53_Sub2_2316.method91((class669.anIntArray8595
						     [((2088438307
							* class669.anInt8600)
						       - 1)]),
						    -51215399))
		  .method5077(Class78.aClass103_825, -625377557) ? 1 : 0;
    }
    
    static final void method9446(Class669 class669, int i) {
	int i_34_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_34_, 1573757450);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_34_ >> 16];
	Class562.method9469(class247, class243, class669, -1441612197);
    }
    
    static final void method9447(Class669 class669, byte i) {
	class669.anInt8600 -= 926998689;
	int i_35_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	boolean bool
	    = (class669.anIntArray8595[2088438307 * class669.anInt8600 + 1]
	       == 1);
	int i_36_
	    = class669.anIntArray8595[2 + class669.anInt8600 * 2088438307];
	Class212 class212
	    = client.aClass214_11359.method4044(i_35_, 1481307617);
	if (class212.method3977(498961283) == null)
	    class212.method3976(client.anInterface27_11083, 121817145);
	if (bool) {
	    Class150_Sub2 class150_sub2
		= ((Class150_Sub2)
		   Class562.aClass110_Sub1_Sub1_7560.method91(i_36_,
							      -1846339121));
	    switch (973874463
		    * class150_sub2.aClass493_1696.aClass483_5522.anInt5276) {
	    case 4:
		class669.anIntArray8595
		    [(class669.anInt8600 += 308999563) * 2088438307 - 1]
		    = class212.method3977(84521648).method32((-1270946121
							      * (class150_sub2
								 .anInt1694)),
							     1858648044);
		break;
	    default:
		class669.anObjectArray8593
		    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		    = (class212.method3977(-1409918428).method45
		       (class150_sub2.anInt1694 * -1270946121, -1963306287));
		break;
	    case 3:
		class669.aLongArray8587
		    [(class669.anInt8596 += 1091885681) * 1572578961 - 1]
		    = class212.method3977(294526877).method26((-1270946121
							       * (class150_sub2
								  .anInt1694)),
							      673320982);
	    }
	} else {
	    Class318 class318
		= ((Class318)
		   Class84.aClass44_Sub11_840.method91(i_36_, -618608844));
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= class318.method5750((class212.method3977(-695739325).method32
				       ((class318.aClass150_3392.anInt1694
					 * -1270946121),
					-1261699517)),
				      1160112048);
	}
    }
    
    static final void method9448(Class669 class669, int i) {
	int i_37_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class106.method1949((char) i_37_, (byte) 0) ? 1 : 0;
    }
    
    static final void method9449(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub14_10755
		  .method17001(-1942590267);
    }
}
