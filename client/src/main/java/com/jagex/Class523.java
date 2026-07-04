/* Class523 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import com.jagex.twitchtv.TwitchTV;

public class Class523
{
    public int[] anIntArray7084;
    public int[] anIntArray7085;
    public int anInt7086;
    static int anInt7087;
    static TwitchTV aTwitchTV7088;
    
    public Class523(int i) {
	anInt7086 = -1704772327 * i;
	anIntArray7085 = new int[anInt7086 * -942354647];
	anIntArray7084 = new int[-942354647 * anInt7086];
    }
    
    public static Class523 method8721(Class472 class472, String string,
				      boolean bool) {
	int i = class472.method7683(string, (byte) 1);
	if (-1 == i)
	    return new Class523(0);
	byte[] is = class472.method7743(i, 1, -414610975);
	if (is == null)
	    return new Class523(0);
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	int i_0_ = class534_sub40.method16529((byte) 1);
	Class523 class523 = new Class523(i_0_);
	int i_1_ = 0;
	while (i_1_ < class523.anInt7086 * -942354647) {
	    int i_2_ = class534_sub40.method16533(-258848859);
	    int i_3_ = class534_sub40.method16529((byte) 1);
	    int i_4_ = class534_sub40.method16527(-954376986);
	    if (bool || i_4_ != 1) {
		class523.anIntArray7085[i_1_] = i_2_;
		class523.anIntArray7084[i_1_] = i_3_;
		i_1_++;
	    } else
		class523.anInt7086 -= -1704772327;
	}
	return class523;
    }
    
    public static Class523 method8722(Class472 class472, String string,
				      boolean bool) {
	int i = class472.method7683(string, (byte) 1);
	if (-1 == i)
	    return new Class523(0);
	byte[] is = class472.method7743(i, 1, -1487130883);
	if (is == null)
	    return new Class523(0);
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	int i_5_ = class534_sub40.method16529((byte) 1);
	Class523 class523 = new Class523(i_5_);
	int i_6_ = 0;
	while (i_6_ < class523.anInt7086 * -942354647) {
	    int i_7_ = class534_sub40.method16533(-258848859);
	    int i_8_ = class534_sub40.method16529((byte) 1);
	    int i_9_ = class534_sub40.method16527(1809178452);
	    if (bool || i_9_ != 1) {
		class523.anIntArray7085[i_6_] = i_7_;
		class523.anIntArray7084[i_6_] = i_8_;
		i_6_++;
	    } else
		class523.anInt7086 -= -1704772327;
	}
	return class523;
    }
    
    static final void method8723(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (Class546.method8989(string, class669, -219410121) != null)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2568
	    = Class99.method1859(string, class669, 1864771628);
	class247.aBool2561 = true;
    }
    
    static final void method8724(Class669 class669, int i) {
	int i_10_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_10_, 1335252121);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_10_ >> 16];
	Class110_Sub1_Sub1.method17865(class247, class243, class669,
				       1732786021);
    }
    
    static final void method8725(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class247.anInt2508 * -1230478387;
    }
    
    static void method8726(Class534_Sub40_Sub1 class534_sub40_sub1, byte i) {
	Class50[] class50s = Class24.method853(-159424375);
	for (int i_11_ = 0; i_11_ < class50s.length; i_11_++) {
	    Class50 class50 = class50s[i_11_];
	    if (class50 != Class50.aClass50_393) {
		Class472 class472 = (Class472) Class594.aMap7828.get(class50);
		if (class472 == null)
		    class534_sub40_sub1.method16510(0, -101318330);
		else
		    class534_sub40_sub1.method16510(class472
							.method7662((byte) -1),
						    -522877264);
	    }
	}
    }
    
    static final void method8727(Class247 class247, Class243 class243,
				 Class669 class669, byte i) {
	class247.anInt2485
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) * -2004398725;
	Class454.method7416(class247, -1160954359);
    }
    
    static boolean method8728(int i, int i_12_) {
	return 15 == i || 9 == i || i == 7 || i == 16;
    }
    
    static final void method8729(int i) {
	for (int i_13_ = 0; i_13_ < client.anInt11321 * -1125820437; i_13_++) {
	    int i_14_ = client.anIntArray11088[i_13_];
	    Class534_Sub6 class534_sub6
		= (Class534_Sub6) client.aClass9_11331.method579((long) i_14_);
	    if (null != class534_sub6) {
		Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
		    = ((Class654_Sub1_Sub5_Sub1_Sub1)
		       class534_sub6.anObject10417);
		Class40.method1034(class654_sub1_sub5_sub1_sub1, false,
				   -1611079329);
	    }
	}
    }
}
