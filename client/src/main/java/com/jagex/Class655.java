/* Class655 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class655 implements Interface13
{
    public int anInt8515;
    int anInt8516;
    public int anInt8517;
    Class658 aClass658_8518;
    
    public void method84() {
	/* empty */
    }
    
    public void method79(Class534_Sub40 class534_sub40, byte i) {
	for (;;) {
	    int i_0_ = class534_sub40.method16527(-226047116);
	    if (0 == i_0_)
		break;
	    method10846(class534_sub40, i_0_, (byte) 20);
	}
    }
    
    void method10846(Class534_Sub40 class534_sub40, int i, byte i_1_) {
	if (1 == i)
	    anInt8516 = class534_sub40.method16550((byte) 46) * -225755655;
	else if (i == 2) {
	    anInt8517 = class534_sub40.method16527(-1187866511) * -1505855131;
	    anInt8515 = class534_sub40.method16527(1034473362) * -246792169;
	}
    }
    
    public synchronized Class169 method10847(byte i) {
	Class169 class169
	    = ((Class169)
	       aClass658_8518.aClass203_8539.method3871((long) (anInt8516
								* 797635657)));
	if (null != class169)
	    return class169;
	class169 = Class178.method2949(aClass658_8518.aClass472_8540,
				       anInt8516 * 797635657, 0);
	if (null != class169)
	    aClass658_8518.aClass203_8539
		.method3893(class169, (long) (anInt8516 * 797635657));
	return class169;
    }
    
    void method10848(Class534_Sub40 class534_sub40, int i) {
	if (1 == i)
	    anInt8516 = class534_sub40.method16550((byte) 44) * -225755655;
	else if (i == 2) {
	    anInt8517 = class534_sub40.method16527(1791994570) * -1505855131;
	    anInt8515 = class534_sub40.method16527(1209959175) * -246792169;
	}
    }
    
    Class655(int i, Class658 class658) {
	aClass658_8518 = class658;
    }
    
    public void method80(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(-713564728);
	    if (0 == i)
		break;
	    method10846(class534_sub40, i, (byte) 17);
	}
    }
    
    public void method81(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(270006553);
	    if (0 == i)
		break;
	    method10846(class534_sub40, i, (byte) -2);
	}
    }
    
    public void method83() {
	/* empty */
    }
    
    public void method82(int i) {
	/* empty */
    }
    
    void method10849(Class534_Sub40 class534_sub40, int i) {
	if (1 == i)
	    anInt8516 = class534_sub40.method16550((byte) -16) * -225755655;
	else if (i == 2) {
	    anInt8517 = class534_sub40.method16527(796532458) * -1505855131;
	    anInt8515 = class534_sub40.method16527(1651792432) * -246792169;
	}
    }
    
    public void method78(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(-1096238608);
	    if (0 == i)
		break;
	    method10846(class534_sub40, i, (byte) -10);
	}
    }
    
    public synchronized Class169 method10850() {
	Class169 class169
	    = ((Class169)
	       aClass658_8518.aClass203_8539.method3871((long) (anInt8516
								* 797635657)));
	if (null != class169)
	    return class169;
	class169 = Class178.method2949(aClass658_8518.aClass472_8540,
				       anInt8516 * 797635657, 0);
	if (null != class169)
	    aClass658_8518.aClass203_8539
		.method3893(class169, (long) (anInt8516 * 797635657));
	return class169;
    }
    
    public synchronized Class169 method10851() {
	Class169 class169
	    = ((Class169)
	       aClass658_8518.aClass203_8539.method3871((long) (anInt8516
								* 797635657)));
	if (null != class169)
	    return class169;
	class169 = Class178.method2949(aClass658_8518.aClass472_8540,
				       anInt8516 * 797635657, 0);
	if (null != class169)
	    aClass658_8518.aClass203_8539
		.method3893(class169, (long) (anInt8516 * 797635657));
	return class169;
    }
    
    static void method10852(byte i) {
	if (null == Class661.anIntArray8549) {
	    Class661.anIntArray8549 = new int[65536];
	    Class661.anIntArray8548 = new int[65536];
	    double d = 0.7;
	    for (int i_2_ = 0; i_2_ < 65536; i_2_++) {
		double d_3_ = (double) (i_2_ >> 10 & 0x3f) / 64.0 + 0.0078125;
		double d_4_ = (double) (i_2_ >> 7 & 0x7) / 8.0 + 0.0625;
		double d_5_ = (double) (i_2_ & 0x7f) / 128.0;
		double d_6_ = d_5_;
		double d_7_ = d_5_;
		double d_8_ = d_5_;
		if (0.0 != d_4_) {
		    double d_9_;
		    if (d_5_ < 0.5)
			d_9_ = d_5_ * (1.0 + d_4_);
		    else
			d_9_ = d_4_ + d_5_ - d_5_ * d_4_;
		    double d_10_ = 2.0 * d_5_ - d_9_;
		    double d_11_ = d_3_ + 0.3333333333333333;
		    if (d_11_ > 1.0)
			d_11_--;
		    double d_12_ = d_3_;
		    double d_13_ = d_3_ - 0.3333333333333333;
		    if (d_13_ < 0.0)
			d_13_++;
		    if (6.0 * d_11_ < 1.0)
			d_6_ = (d_9_ - d_10_) * 6.0 * d_11_ + d_10_;
		    else if (2.0 * d_11_ < 1.0)
			d_6_ = d_9_;
		    else if (d_11_ * 3.0 < 2.0)
			d_6_ = 6.0 * ((0.6666666666666666 - d_11_)
				      * (d_9_ - d_10_)) + d_10_;
		    else
			d_6_ = d_10_;
		    if (d_12_ * 6.0 < 1.0)
			d_7_ = d_10_ + d_12_ * ((d_9_ - d_10_) * 6.0);
		    else if (2.0 * d_12_ < 1.0)
			d_7_ = d_9_;
		    else if (3.0 * d_12_ < 2.0)
			d_7_ = ((0.6666666666666666 - d_12_) * (d_9_ - d_10_)
				* 6.0) + d_10_;
		    else
			d_7_ = d_10_;
		    if (d_13_ * 6.0 < 1.0)
			d_8_ = d_13_ * ((d_9_ - d_10_) * 6.0) + d_10_;
		    else if (d_13_ * 2.0 < 1.0)
			d_8_ = d_9_;
		    else if (3.0 * d_13_ < 2.0)
			d_8_ = ((0.6666666666666666 - d_13_) * (d_9_ - d_10_)
				* 6.0) + d_10_;
		    else
			d_8_ = d_10_;
		}
		d_6_ = Math.pow(d_6_, d);
		d_7_ = Math.pow(d_7_, d);
		d_8_ = Math.pow(d_8_, d);
		int i_14_ = (int) (d_6_ * 256.0);
		int i_15_ = (int) (256.0 * d_7_);
		int i_16_ = (int) (d_8_ * 256.0);
		int i_17_ = i_16_ + ((i_15_ << 8) + (i_14_ << 16));
		Class661.anIntArray8549[i_2_] = i_17_ & 0xffffff;
		int i_18_ = (i_16_ << 16) + (i_15_ << 8) + i_14_;
		Class661.anIntArray8548[i_2_] = i_18_;
	    }
	}
    }
    
    static final void method10853(Class669 class669, byte i) {
	int i_19_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (i_19_ < 0 || i_19_ > 1)
	    i_19_ = 0;
	Class172.method2902(i_19_ == 1, -1896658539);
    }
    
    static final void method10854(byte i, byte i_20_) {
	byte[][][] is = client.aClass512_11100.method8411((byte) -38);
	if (null == is) {
	    is = (new byte[4][client.aClass512_11100.method8417(1833141501)]
		  [client.aClass512_11100.method8418(-1533611049)]);
	    client.aClass512_11100.method8567(is, (byte) 36);
	}
	for (int i_21_ = 0; i_21_ < 4; i_21_++) {
	    for (int i_22_ = 0;
		 i_22_ < client.aClass512_11100.method8417(2085203122);
		 i_22_++) {
		for (int i_23_ = 0;
		     i_23_ < client.aClass512_11100.method8418(-1533611049);
		     i_23_++)
		    is[i_21_][i_22_][i_23_] = i;
	    }
	}
    }
    
    static Class88[] method10855(int i) {
	return new Class88[] { Class88.aClass88_873, Class88.aClass88_875,
			       Class88.aClass88_857, Class88.aClass88_853,
			       Class88.aClass88_876, Class88.aClass88_862,
			       Class88.aClass88_861, Class88.aClass88_856,
			       Class88.aClass88_872, Class88.aClass88_880,
			       Class88.aClass88_858, Class88.aClass88_855,
			       Class88.aClass88_859, Class88.aClass88_867,
			       Class88.aClass88_863, Class88.aClass88_874,
			       Class88.aClass88_866, Class88.aClass88_871,
			       Class88.aClass88_869, Class88.aClass88_870,
			       Class88.aClass88_854, Class88.aClass88_851,
			       Class88.aClass88_879, Class88.aClass88_881,
			       Class88.aClass88_852, Class88.aClass88_864,
			       Class88.aClass88_877, Class88.aClass88_882,
			       Class88.aClass88_865, Class88.aClass88_878,
			       Class88.aClass88_868 };
    }
    
    public static void method10856(String string, int i) {
	if (18 == -1850530127 * client.anInt11039) {
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4204,
				      client.aClass100_11094.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16506(0,
								  1217155632);
	    int i_24_
		= (31645619
		   * class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16713(string,
								  240163681);
	    class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
		+= -1122347939;
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16756
		(Class40.anIntArray309, i_24_,
		 (class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
		  * 31645619),
		 (byte) 16);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16528
		(31645619 * (class534_sub19.aClass534_Sub40_Sub1_10513
			     .anInt10811) - i_24_,
		 1919553795);
	    client.aClass100_11094.method1863(class534_sub19, (byte) 10);
	    Class267.aClass699_2940 = Class699.aClass699_8793;
	}
    }
    
    static final void method10857(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class661.method10971(class247, class243, class669, (byte) 117);
    }
}
