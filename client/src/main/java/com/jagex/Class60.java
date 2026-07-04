/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class60
{
    boolean aBool642;
    int anInt643;
    int anInt644;
    Class252 aClass252_645 = Class252.aClass252_2658;
    int anInt646;
    
    Class60() {
	/* empty */
    }
    
    public static void method1254(Class472 class472, Class177 class177,
				  Interface25 interface25, byte i) {
	Class459.aClass472_4980 = class472;
	Class154.aClass177_1741 = class177;
	Class304.anInterface25_3263 = interface25;
    }
    
    static final void method1255(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	class247.aBool2471
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) == 1;
	Class454.method7416(class247, -1327922508);
	if (-1 == 1365669833 * class247.anInt2580 && !class243.aBool2413)
	    Exception_Sub1.method17927(class247.anInt2454 * -1278450723,
				       (short) 14498);
    }
    
    static final void method1256(Class669 class669, short i) {
	if (null != Class19.aClass352_211) {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 1;
	    class669.aClass352_8602 = Class19.aClass352_211;
	    class669.aMap8607.put(Class453.aClass453_4954,
				  Class175.method2924(class669.aClass352_8602,
						      -1468586996));
	} else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
    
    static int method1257(CharSequence charsequence, int i, boolean bool,
			  int i_0_) {
	if (i < 2 || i > 36)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (i).toString());
	boolean bool_1_ = false;
	boolean bool_2_ = false;
	int i_3_ = 0;
	int i_4_ = charsequence.length();
	for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
	    int i_6_ = charsequence.charAt(i_5_);
	    if (0 == i_5_) {
		if (45 == i_6_) {
		    bool_1_ = true;
		    continue;
		}
		if (43 == i_6_ && bool)
		    continue;
	    }
	    if (i_6_ >= 48 && i_6_ <= 57)
		i_6_ -= 48;
	    else if (i_6_ >= 65 && i_6_ <= 90)
		i_6_ -= 55;
	    else if (i_6_ >= 97 && i_6_ <= 122)
		i_6_ -= 87;
	    else
		throw new NumberFormatException();
	    if (i_6_ >= i)
		throw new NumberFormatException();
	    if (bool_1_)
		i_6_ = -i_6_;
	    int i_7_ = i_6_ + i * i_3_;
	    if (i_3_ != i_7_ / i)
		throw new NumberFormatException();
	    i_3_ = i_7_;
	    bool_2_ = true;
	}
	if (!bool_2_)
	    throw new NumberFormatException();
	return i_3_;
    }
    
    static int method1258(byte[] is, int i, int i_8_, int i_9_) {
	int i_10_ = -1;
	for (int i_11_ = i; i_11_ < i_8_; i_11_++)
	    i_10_ = i_10_ >>> 8 ^ (Class534_Sub40.anIntArray10814
				   [(i_10_ ^ is[i_11_]) & 0xff]);
	i_10_ ^= 0xffffffff;
	return i_10_;
    }
    
    static final void method1259(Class669 class669, byte i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (string.startsWith(Class108.method1965(0, 1100891015))
	    || string.startsWith(Class108.method1965(1, 955109250)))
	    string = string.substring(7);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class46.method1112(string, (byte) 19) ? 1 : 0;
    }
}
