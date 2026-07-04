/* Class261 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;

public class Class261
{
    String aString2790;
    static final int anInt2791 = 4;
    static final int anInt2792 = 256;
    Class266[] aClass266Array2793;
    Class266[] aClass266Array2794;
    Class277[] aClass277Array2795;
    static final int anInt2796 = 2;
    
    public Class261(byte[] is) throws Exception_Sub5 {
	method4814(is, (byte) -57);
    }
    
    void method4814(byte[] is, byte i) throws Exception_Sub5 {
	Class263 class263 = new Class263(is);
	int i_0_ = class263.method4830(2088438307);
	if (4 != i_0_)
	    throw new Exception_Sub5(this, i_0_, 4);
	aString2790 = class263.method4826(1609535077);
	aClass266Array2793 = new Class266[class263.method4830(2088438307)];
	aClass266Array2794 = new Class266[class263.method4830(2088438307)];
	aClass277Array2795 = new Class277[class263.method4830(2088438307)];
	for (int i_1_ = 0; i_1_ < aClass266Array2793.length; i_1_++) {
	    aClass266Array2793[i_1_] = new Class266();
	    aClass266Array2793[i_1_].method4858(class263, -1902759745);
	}
	for (int i_2_ = 0; i_2_ < aClass266Array2794.length; i_2_++) {
	    aClass266Array2794[i_2_] = new Class266();
	    aClass266Array2794[i_2_].method4858(class263, -2044692365);
	}
	for (int i_3_ = 0; i_3_ < aClass277Array2795.length; i_3_++) {
	    aClass277Array2795[i_3_] = new Class277();
	    aClass277Array2795[i_3_].method5160(class263, 1869436365);
	}
    }
    
    void method4815(byte[] is) throws Exception_Sub5 {
	Class263 class263 = new Class263(is);
	int i = class263.method4830(2088438307);
	if (4 != i)
	    throw new Exception_Sub5(this, i, 4);
	aString2790 = class263.method4826(1462404149);
	aClass266Array2793 = new Class266[class263.method4830(2088438307)];
	aClass266Array2794 = new Class266[class263.method4830(2088438307)];
	aClass277Array2795 = new Class277[class263.method4830(2088438307)];
	for (int i_4_ = 0; i_4_ < aClass266Array2793.length; i_4_++) {
	    aClass266Array2793[i_4_] = new Class266();
	    aClass266Array2793[i_4_].method4858(class263, -2061157717);
	}
	for (int i_5_ = 0; i_5_ < aClass266Array2794.length; i_5_++) {
	    aClass266Array2794[i_5_] = new Class266();
	    aClass266Array2794[i_5_].method4858(class263, -1859381413);
	}
	for (int i_6_ = 0; i_6_ < aClass277Array2795.length; i_6_++) {
	    aClass277Array2795[i_6_] = new Class277();
	    aClass277Array2795[i_6_].method5160(class263, 1190827731);
	}
    }
    
    static void method4816(Class534_Sub40_Sub1 class534_sub40_sub1, int i,
			   int i_7_) {
	Class597 class597 = client.aClass512_11100.method8416((byte) 73);
	boolean bool = class534_sub40_sub1.method18295(1, -761815447) == 1;
	if (bool)
	    Class108.anIntArray1327
		[(Class108.anInt1326 += 375555833) * -1852482743 - 1]
		= i;
	int i_8_ = class534_sub40_sub1.method18295(2, -761815447);
	Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
	    = client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i];
	if (i_8_ == 0) {
	    if (!bool) {
		if (client.anInt11037 * -643758853 == i)
		    throw new RuntimeException();
		Class60 class60
		    = Class108.aClass60Array1320[i] = new Class60();
		Class676.method11130((byte) -9);
		class60.anInt646
		    = (186312257
		       * (((class654_sub1_sub5_sub1_sub2.anIntArray11978[0]
			    + -1166289421 * class597.anInt7861)
			   >> 6)
			  + ((class654_sub1_sub5_sub1_sub2.aByte10854 << 28)
			     + ((-424199969 * class597.anInt7859
				 + (class654_sub1_sub5_sub1_sub2
				    .anIntArray11977[0]))
				>> 6 << 14))));
		if (class654_sub1_sub5_sub1_sub2.anInt12223 * -2025203045
		    != -1)
		    class60.anInt643
			= class654_sub1_sub5_sub1_sub2.anInt12223 * -982249813;
		else
		    class60.anInt643
			= class654_sub1_sub5_sub1_sub2.aClass57_11973
			      .method1231(1292063871) * 252679473;
		class60.anInt644
		    = class654_sub1_sub5_sub1_sub2.anInt11944 * 101449423;
		class60.aClass252_645
		    = class654_sub1_sub5_sub1_sub2.aClass252_12232;
		class60.aBool642 = class654_sub1_sub5_sub1_sub2.aBool12234;
		if (class654_sub1_sub5_sub1_sub2.anInt12229 * -785793877 > 0)
		    Class576.method9763(class654_sub1_sub5_sub1_sub2,
					-412140583);
		client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i] = null;
		if (class534_sub40_sub1.method18295(1, -761815447) != 0)
		    Class220.method4145(class534_sub40_sub1, i, (byte) -18);
	    }
	} else if (1 == i_8_) {
	    int i_9_ = class534_sub40_sub1.method18295(3, -761815447);
	    int i_10_ = class534_sub40_sub1.method18295(1, -761815447);
	    int i_11_ = class654_sub1_sub5_sub1_sub2.anIntArray11977[0];
	    int i_12_ = class654_sub1_sub5_sub1_sub2.anIntArray11978[0];
	    if (i_10_ == 1) {
		Class108.aByteArray1325[i] = Class676.aClass676_8650.aByte8648;
		int i_13_ = class534_sub40_sub1.method18295(2, -761815447);
		switch (i_13_) {
		case 1:
		    class654_sub1_sub5_sub1_sub2.method18872(i_11_ - 1, i_12_,
							     (Class108
							      .aByteArray1325
							      [i]),
							     (byte) -76);
		    break;
		case 3:
		    class654_sub1_sub5_sub1_sub2.method18872(i_11_, i_12_ - 1,
							     (Class108
							      .aByteArray1325
							      [i]),
							     (byte) -30);
		    break;
		case 0:
		    class654_sub1_sub5_sub1_sub2.method18872(i_11_, i_12_ + 1,
							     (Class108
							      .aByteArray1325
							      [i]),
							     (byte) -120);
		    break;
		case 2:
		    class654_sub1_sub5_sub1_sub2.method18872(i_11_ + 1, i_12_,
							     (Class108
							      .aByteArray1325
							      [i]),
							     (byte) -77);
		    break;
		}
	    }
	    if (i_9_ == 0) {
		i_11_--;
		i_12_--;
	    } else if (1 == i_9_)
		i_12_--;
	    else if (2 == i_9_) {
		i_11_++;
		i_12_--;
	    } else if (3 == i_9_)
		i_11_--;
	    else if (i_9_ == 4)
		i_11_++;
	    else if (i_9_ == 5) {
		i_11_--;
		i_12_++;
	    } else if (6 == i_9_)
		i_12_++;
	    else if (7 == i_9_) {
		i_11_++;
		i_12_++;
	    }
	    class654_sub1_sub5_sub1_sub2.method18872(i_11_, i_12_,
						     (Class108.aByteArray1325
						      [i]),
						     (byte) -20);
	} else if (i_8_ == 2) {
	    int i_14_ = class534_sub40_sub1.method18295(4, -761815447);
	    int i_15_ = class654_sub1_sub5_sub1_sub2.anIntArray11977[0];
	    int i_16_ = class654_sub1_sub5_sub1_sub2.anIntArray11978[0];
	    if (0 == i_14_) {
		i_15_ -= 2;
		i_16_ -= 2;
	    } else if (i_14_ == 1) {
		i_15_--;
		i_16_ -= 2;
	    } else if (2 == i_14_)
		i_16_ -= 2;
	    else if (3 == i_14_) {
		i_15_++;
		i_16_ -= 2;
	    } else if (4 == i_14_) {
		i_15_ += 2;
		i_16_ -= 2;
	    } else if (5 == i_14_) {
		i_15_ -= 2;
		i_16_--;
	    } else if (6 == i_14_) {
		i_15_ += 2;
		i_16_--;
	    } else if (7 == i_14_)
		i_15_ -= 2;
	    else if (i_14_ == 8)
		i_15_ += 2;
	    else if (9 == i_14_) {
		i_15_ -= 2;
		i_16_++;
	    } else if (10 == i_14_) {
		i_15_ += 2;
		i_16_++;
	    } else if (i_14_ == 11) {
		i_15_ -= 2;
		i_16_ += 2;
	    } else if (12 == i_14_) {
		i_15_--;
		i_16_ += 2;
	    } else if (13 == i_14_)
		i_16_ += 2;
	    else if (i_14_ == 14) {
		i_15_++;
		i_16_ += 2;
	    } else if (i_14_ == 15) {
		i_15_ += 2;
		i_16_ += 2;
	    }
	    class654_sub1_sub5_sub1_sub2.method18872(i_15_, i_16_,
						     (Class108.aByteArray1325
						      [i]),
						     (byte) -86);
	} else {
	    int i_17_ = class534_sub40_sub1.method18295(1, -761815447);
	    if (i_17_ == 0) {
		int i_18_ = class534_sub40_sub1.method18295(15, -761815447);
		int i_19_ = i_18_ >> 12 & 0x7;
		int i_20_ = (byte) (i_18_ >> 10) & 0x3;
		int i_21_ = i_18_ >> 5 & 0x1f;
		if (i_21_ > 15)
		    i_21_ -= 32;
		int i_22_ = i_18_ & 0x1f;
		if (i_22_ > 15)
		    i_22_ -= 32;
		int i_23_
		    = i_21_ + class654_sub1_sub5_sub1_sub2.anIntArray11977[0];
		int i_24_
		    = i_22_ + class654_sub1_sub5_sub1_sub2.anIntArray11978[0];
		if (i_19_ == Class676.aClass676_8647.anInt8645 * -848448635)
		    class654_sub1_sub5_sub1_sub2.method18871(i_23_, i_24_,
							     -2095027900);
		else {
		    Class108.aByteArray1325[i] = (byte) (i_19_ - 1);
		    class654_sub1_sub5_sub1_sub2.method18872(i_23_, i_24_,
							     (Class108
							      .aByteArray1325
							      [i]),
							     (byte) -82);
		}
		class654_sub1_sub5_sub1_sub2.aByte10854
		    = class654_sub1_sub5_sub1_sub2.aByte10853
		    = (byte) (i_20_ + class654_sub1_sub5_sub1_sub2.aByte10854
			      & 0x3);
		if (client.aClass512_11100.method8552((byte) 0)
			.method7612(i_23_, i_24_, (byte) 0))
		    class654_sub1_sub5_sub1_sub2.aByte10853++;
		if (i == client.anInt11037 * -643758853
		    && (class654_sub1_sub5_sub1_sub2.aByte10854
			!= -878424575 * Class674.anInt8633))
		    Class674.anInt8633
			= (class654_sub1_sub5_sub1_sub2.aByte10854
			   * -2078297599);
	    } else {
		int i_25_ = class534_sub40_sub1.method18295(3, -761815447);
		int i_26_ = class534_sub40_sub1.method18295(30, -761815447);
		int i_27_ = i_26_ >> 28 & 0x3;
		int i_28_ = i_26_ >> 14 & 0x3fff;
		int i_29_ = i_26_ & 0x3fff;
		int i_30_ = ((i_28_ + (class597.anInt7859 * -424199969
				       + (class654_sub1_sub5_sub1_sub2
					  .anIntArray11977[0]))
			      & 0x3fff)
			     - class597.anInt7859 * -424199969);
		int i_31_ = (((class654_sub1_sub5_sub1_sub2.anIntArray11978[0]
			       + class597.anInt7861 * -1166289421 + i_29_)
			      & 0x3fff)
			     - -1166289421 * class597.anInt7861);
		if (Class676.aClass676_8647.anInt8645 * -848448635 == i_25_)
		    class654_sub1_sub5_sub1_sub2.method18871(i_30_, i_31_,
							     -1593188819);
		else {
		    Class108.aByteArray1325[i] = (byte) (i_25_ - 1);
		    class654_sub1_sub5_sub1_sub2.method18872(i_30_, i_31_,
							     (Class108
							      .aByteArray1325
							      [i]),
							     (byte) -50);
		}
		class654_sub1_sub5_sub1_sub2.aByte10854
		    = class654_sub1_sub5_sub1_sub2.aByte10853
		    = (byte) (i_27_ + class654_sub1_sub5_sub1_sub2.aByte10854
			      & 0x3);
		if (client.aClass512_11100.method8552((byte) 0)
			.method7612(i_30_, i_31_, (byte) 0))
		    class654_sub1_sub5_sub1_sub2.aByte10853++;
		if (i == client.anInt11037 * -643758853)
		    Class674.anInt8633
			= (class654_sub1_sub5_sub1_sub2.aByte10854
			   * -2078297599);
	    }
	}
    }
    
    public static int method4817(short[] is, int i, Class317 class317,
				 int i_32_, int i_33_) throws IOException {
	int i_34_ = 1;
	int i_35_ = 0;
	for (int i_36_ = 0; i_36_ < i_32_; i_36_++) {
	    int i_37_ = class317.method5740(is, i_34_ + i, -2020892419);
	    i_34_ <<= 1;
	    i_34_ += i_37_;
	    i_35_ |= i_37_ << i_36_;
	}
	return i_35_;
    }
    
    static final void method4818(Class669 class669, int i) {
	int i_38_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class78.aClass103_825.method1908(i_38_, -1942123704);
    }
    
    static final void method4819(Class669 class669, int i) {
	class669.anInt8600 -= 926998689;
	int i_39_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_40_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	int i_41_
	    = class669.anIntArray8595[2 + class669.anInt8600 * 2088438307];
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (-1 == i_40_)
	    throw new RuntimeException();
	Class41 class41
	    = ((Class41)
	       Class667.aClass44_Sub21_8582.method91(i_40_, -1078559237));
	if (class41.aClass493_317.method93() != i_39_)
	    throw new RuntimeException();
	if (class41.aClass493_314.method93()
	    != Class493.aClass493_5496.method93())
	    throw new RuntimeException();
	int[] is = class41.method1042(string, (short) -14578);
	if (i_41_ < 0 || is == null || is.length <= i_41_)
	    throw new RuntimeException();
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = is[i_41_];
    }
}
