/* Class292 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

public class Class292
{
    public int anInt3119;
    static Class292 aClass292_3120 = new Class292(0, 4);
    static Class292 aClass292_3121;
    int anInt3122;
    static Class292 aClass292_3123 = new Class292(1, 5);
    
    Class292(int i, int i_0_) {
	anInt3122 = 1329738309 * i;
	anInt3119 = -1753174611 * i_0_;
    }
    
    static {
	aClass292_3121 = new Class292(2, 6);
    }
    
    static Class292[] method5299() {
	return (new Class292[]
		{ aClass292_3121, aClass292_3123, aClass292_3120 });
    }
    
    static Class292[] method5300() {
	return (new Class292[]
		{ aClass292_3121, aClass292_3123, aClass292_3120 });
    }
    
    static Class292[] method5301() {
	return (new Class292[]
		{ aClass292_3121, aClass292_3123, aClass292_3120 });
    }
    
    public static Class292 method5302(int i) {
	Class292[] class292s = Class298.method5508(1154038654);
	for (int i_1_ = 0; i_1_ < class292s.length; i_1_++) {
	    Class292 class292 = class292s[i_1_];
	    if (i == class292.anInt3122 * -919727987)
		return class292;
	}
	return null;
    }
    
    static void method5303(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_2_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_3_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	Class90 class90 = (Class90) Class534_Sub11_Sub13
					.aClass44_Sub22_11730
					.method91(i_3_, -965846522);
	if (class90.method1718(-1235073674)) {
	    String string = class90.aString889;
	    if (-1 == i_2_)
		class669.anObjectArray8593
		    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		    = string;
	    else
		class669.anObjectArray8593
		    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		    = ((Class273)
		       Class223.aClass53_Sub2_2316.method91(i_2_, -1235208163))
			  .method5073(i_3_, string, -2055514416);
	} else {
	    int i_4_ = 263946597 * class90.anInt888;
	    if (-1 == i_2_)
		class669.anIntArray8595
		    [(class669.anInt8600 += 308999563) * 2088438307 - 1]
		    = i_4_;
	    else
		class669.anIntArray8595
		    [(class669.anInt8600 += 308999563) * 2088438307 - 1]
		    = ((Class273)
		       Class223.aClass53_Sub2_2316.method91(i_2_, 481044291))
			  .method5072(i_3_, i_4_, (byte) 81);
	}
    }
    
    static String method5304(int i, int i_5_, int i_6_) {
	int i_7_ = i_5_ - i;
	if (i_7_ < -9)
	    return Class154.method2575(16711680, 715685741);
	if (i_7_ < -6)
	    return Class154.method2575(16723968, 962891624);
	if (i_7_ < -3)
	    return Class154.method2575(16740352, -1801007834);
	if (i_7_ < 0)
	    return Class154.method2575(16756736, -1151074256);
	if (i_7_ > 9)
	    return Class154.method2575(65280, 976953672);
	if (i_7_ > 6)
	    return Class154.method2575(4259584, 1687913624);
	if (i_7_ > 3)
	    return Class154.method2575(8453888, 402792813);
	if (i_7_ > 0)
	    return Class154.method2575(12648192, 1801002253);
	return Class154.method2575(16776960, 209995610);
    }
    
    public static void method5305(int i) {
	if (Class29.aFrame266 == null) {
	    int i_8_ = client.anInt5562 * -721302779;
	    int i_9_ = -350211099 * client.anInt5563;
	    int i_10_ = (Class391.anInt4076 * -166028671
			 - Class706_Sub4.anInt10994 * 1771907305 - i_8_);
	    int i_11_ = (client.anInt5561 * 8272787
			 - -1091172141 * Class18.anInt205 - i_9_);
	    if (i_8_ > 0 || i_10_ > 0 || i_9_ > 0 || i_11_ > 0) {
		try {
		    Container container = Class171.method2880((short) 13164);
		    int i_12_ = 0;
		    int i_13_ = 0;
		    if (container == Class452.aFrame4943) {
			Insets insets = Class452.aFrame4943.getInsets();
			i_12_ = insets.left;
			i_13_ = insets.top;
		    }
		    Graphics graphics = container.getGraphics();
		    graphics.setColor(Color.black);
		    if (i_8_ > 0)
			graphics.fillRect(i_12_, i_13_, i_8_,
					  client.anInt5561 * 8272787);
		    if (i_9_ > 0)
			graphics.fillRect(i_12_, i_13_,
					  -166028671 * Class391.anInt4076,
					  i_9_);
		    if (i_10_ > 0)
			graphics.fillRect((Class391.anInt4076 * -166028671
					   + i_12_ - i_10_),
					  i_13_, i_10_,
					  8272787 * client.anInt5561);
		    if (i_11_ > 0)
			graphics.fillRect(i_12_,
					  (i_13_ + 8272787 * client.anInt5561
					   - i_11_),
					  Class391.anInt4076 * -166028671,
					  i_11_);
		} catch (Exception exception) {
		    /* empty */
		}
	    }
	}
    }
    
    public static final void method5306(int i, int i_14_, int i_15_, int i_16_,
					boolean bool, byte i_17_) {
	if (i_15_ < 1)
	    i_15_ = 1;
	if (i_16_ < 1)
	    i_16_ = 1;
	int i_18_ = i_16_ - 334;
	if (i_18_ < 0)
	    i_18_ = 0;
	else if (i_18_ > 100)
	    i_18_ = 100;
	int i_19_
	    = (client.aShort11311
	       + i_18_ * (client.aShort11312 - client.aShort11311) / 100);
	int i_20_ = 512 * (i_19_ * i_16_) / (334 * i_15_);
	if (i_20_ < client.aShort11317) {
	    i_20_ = client.aShort11317;
	    i_19_ = 334 * (i_15_ * i_20_) / (512 * i_16_);
	    if (i_19_ > client.aShort11316) {
		i_19_ = client.aShort11316;
		int i_21_ = i_16_ * i_19_ * 512 / (i_20_ * 334);
		int i_22_ = (i_15_ - i_21_) / 2;
		if (bool) {
		    Class254.aClass185_2683.method3537();
		    Class254.aClass185_2683.method3292(i, i_14_, i_22_, i_16_,
						       -16777216, -1991418906);
		    Class254.aClass185_2683.method3292(i_15_ + i - i_22_,
						       i_14_, i_22_, i_16_,
						       -16777216, -1613152255);
		}
		i += i_22_;
		i_15_ -= i_22_ * 2;
	    }
	} else if (i_20_ > client.aShort11318) {
	    i_20_ = client.aShort11318;
	    i_19_ = 334 * (i_20_ * i_15_) / (512 * i_16_);
	    if (i_19_ < client.aShort11315) {
		i_19_ = client.aShort11315;
		int i_23_ = 334 * (i_20_ * i_15_) / (i_19_ * 512);
		int i_24_ = (i_16_ - i_23_) / 2;
		if (bool) {
		    Class254.aClass185_2683.method3537();
		    Class254.aClass185_2683.method3292(i, i_14_, i_15_, i_24_,
						       -16777216, -2056960767);
		    Class254.aClass185_2683.method3292(i,
						       i_14_ + i_16_ - i_24_,
						       i_15_, i_24_, -16777216,
						       -2033882941);
		}
		i_14_ += i_24_;
		i_16_ -= i_24_ * 2;
	    }
	}
	client.anInt11323 = i_16_ * i_19_ / 334 * 574465361;
	client.anInt11319 = i * 521583301;
	client.anInt11320 = i_14_ * -977152555;
	client.anInt11234 = (short) i_15_ * -1885059811;
	client.anInt11190 = -2005869579 * (short) i_16_;
    }
    
    static void method5307(Class534_Sub18_Sub8 class534_sub18_sub8, int i,
			   Class669 class669, int i_25_) {
	class669.anInt8600 = 0;
	class669.anInt8594 = 0;
	class669.anInt8613 = 793595371;
	class669.aClass534_Sub18_Sub8_8614 = class534_sub18_sub8;
	class669.aClass515Array8612
	    = class669.aClass534_Sub18_Sub8_8614.aClass515Array11760;
	class669.anIntArray8591
	    = class669.aClass534_Sub18_Sub8_8614.anIntArray11752;
	Class515 class515 = null;
	class669.anInt8597 = 0;
	class669.aMap8607.clear();
	class669.aMap8607.put(Class453.aClass453_4946,
			      Class78.aClass103_825.aClass612_1294);
	class669.aMap8607.put(Class453.aClass453_4947,
			      Class77.aClass155_Sub1_819);
	class669.aMap8607.put(Class453.aClass453_4953,
			      Class246.aClass155_2425);
	if (null != class669.aClass352_8602)
	    class669.aMap8607.put(Class453.aClass453_4954,
				  Class175.method2924(class669.aClass352_8602,
						      -2140900471));
	if (class669.aClass654_Sub1_Sub5_Sub1_8604
	    instanceof Class654_Sub1_Sub5_Sub1_Sub1)
	    class669.aMap8607.put(Class453.aClass453_4951,
				  (class669.aClass654_Sub1_Sub5_Sub1_8604
				   .anInterface19_11991));
	if (class669.aClass654_Sub1_Sub5_Sub1_8604
	    instanceof Class654_Sub1_Sub5_Sub1_Sub2)
	    class669.aMap8608.put(Class453.aClass453_4946,
				  (class669.aClass654_Sub1_Sub5_Sub1_8604
				   .anInterface19_11991));
	if (null != client.aClass214_11359)
	    class669.aMap8607.put(Class453.aClass453_4950,
				  client.aClass214_11359
				      .method4042(1532850764));
	try {
	    try {
		Class679.anInt8666 = 0;
		for (;;) {
		    Class679.anInt8666 += 1572408215;
		    if (Class679.anInt8666 * -1006492633 > i)
			throw new RuntimeException("");
		    class515
			= (class669.aClass515Array8612
			   [(class669.anInt8613 += -793595371) * 662605117]);
		    if (Class679.aBool8662
			&& (Class679.aString8663 == null
			    || ((class669.aClass534_Sub18_Sub8_8614
				 .aString11751) != null
				&& class669.aClass534_Sub18_Sub8_8614
				       .aString11751
				       .indexOf(Class679.aString8663) != -1)))
			System.out.println(new StringBuilder().append
					       (class669
						.aClass534_Sub18_Sub8_8614
						.aString11751)
					       .append
					       (": ").append
					       (class515).toString());
		    if (class669.anIntArray8591[class669.anInt8613 * 662605117]
			== 1)
			class669.aBool8615 = true;
		    else
			class669.aBool8615 = false;
		    if (Class515.aClass515_6037 == class515
			&& -1712769137 * class669.anInt8597 == 0) {
			Class532.method8880(1120399608);
			break;
		    }
		    Class635.method10537(class515, class669, 648952856);
		}
	    } catch (Exception exception) {
		Class98.method1834(class669, class515, exception, "S",
				   -1152577469);
		Class532.method8880(1120399608);
	    }
	} catch (Exception object) {
	    Class532.method8880(1120399608);
	    throw object;
	}
    }
}
