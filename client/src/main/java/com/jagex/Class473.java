/* Class473 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class473 implements Interface76
{
    static Class473 aClass473_5167;
    static Class473 aClass473_5168;
    static Class473 aClass473_5169;
    int anInt5170;
    String aString5171;
    static Class473 aClass473_5172 = new Class473("UNCOMPRESSED", 0);
    public static short[][][] aShortArrayArrayArray5173;
    public static int anInt5174;
    
    public int method93() {
	return 1124994259 * anInt5170;
    }
    
    Class473(String string, int i) {
	aString5171 = string;
	anInt5170 = -897701029 * i;
    }
    
    static Class473[] method7746() {
	return new Class473[] { aClass473_5172, aClass473_5169, aClass473_5168,
				aClass473_5167 };
    }
    
    static {
	aClass473_5169 = new Class473("BZIP2", 1);
	aClass473_5167 = new Class473("GZIP", 2);
	aClass473_5168 = new Class473("LZMA", 3);
    }
    
    public int method22() {
	return 1124994259 * anInt5170;
    }
    
    public int method53() {
	return 1124994259 * anInt5170;
    }
    
    static Class473[] method7747() {
	return new Class473[] { aClass473_5172, aClass473_5169, aClass473_5168,
				aClass473_5167 };
    }
    
    static Class473[] method7748() {
	return new Class473[] { aClass473_5172, aClass473_5169, aClass473_5168,
				aClass473_5167 };
    }
    
    static Class473[] method7749(int i) {
	return new Class473[] { aClass473_5172, aClass473_5169, aClass473_5168,
				aClass473_5167 };
    }
    
    static Class473[] method7750() {
	return new Class473[] { aClass473_5172, aClass473_5169, aClass473_5168,
				aClass473_5167 };
    }
    
    static Class473[] method7751() {
	return new Class473[] { aClass473_5172, aClass473_5169, aClass473_5168,
				aClass473_5167 };
    }
    
    static boolean method7752(int i) {
	boolean bool = true;
	if (Class690_Sub22.aClass169_10914 == null) {
	    if (Class464.aClass472_5113
		    .method7670(Class666.anInt8576 * -601155575, (byte) -8))
		Class690_Sub22.aClass169_10914
		    = Class178.method2945(Class464.aClass472_5113,
					  Class666.anInt8576 * -601155575);
	    else
		bool = false;
	}
	if (Class199.aClass169_2176 == null) {
	    if (Class464.aClass472_5113
		    .method7670(Class105.anInt1301 * -1404837183, (byte) -76))
		Class199.aClass169_2176
		    = Class178.method2945(Class464.aClass472_5113,
					  -1404837183 * Class105.anInt1301);
	    else
		bool = false;
	}
	if (Class90.aClass169_892 == null) {
	    if (Class464.aClass472_5113
		    .method7670(Class105.anInt1304 * -447372475, (byte) -78))
		Class90.aClass169_892
		    = Class178.method2945(Class464.aClass472_5113,
					  -447372475 * Class105.anInt1304);
	    else
		bool = false;
	}
	if (Class223.aClass16_2314 == null) {
	    if (Class606.aClass472_7988
		    .method7670(Class105.anInt1303 * 1917032215, (byte) -111))
		Class223.aClass16_2314
		    = (Class351.aClass406_3620.method6666
		       (client.anInterface52_11081,
			1917032215 * Class105.anInt1303, (byte) 47));
	    else
		bool = false;
	}
	if (Class192.aClass169_Sub2Array2146 == null) {
	    if (Class464.aClass472_5113
		    .method7670(1917032215 * Class105.anInt1303, (byte) -13))
		Class192.aClass169_Sub2Array2146
		    = ((Class169_Sub2[])
		       Class178.method2942(Class464.aClass472_5113,
					   Class105.anInt1303 * 1917032215));
	    else
		bool = false;
	}
	return bool;
    }
    
    public static String method7753(Class534_Sub18_Sub7 class534_sub18_sub7,
				    byte i) {
	if (Class72.aBool758 || null == class534_sub18_sub7)
	    return "";
	if ((null == class534_sub18_sub7.aString11708
	     || class534_sub18_sub7.aString11708.length() == 0)
	    && class534_sub18_sub7.aString11710 != null
	    && class534_sub18_sub7.aString11710.length() > 0)
	    return class534_sub18_sub7.aString11710;
	return class534_sub18_sub7.aString11708;
    }
    
    static final void method7754(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class247.anInt2469 * -1279656873;
    }
    
    static final void method7755(Class669 class669, byte i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_0_, -29146579);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = -806242263 * class247.anInt2503;
    }
    
    static final void method7756(Class669 class669, byte i) {
	boolean bool = ((class669.anIntArray8595
			 [(class669.anInt8600 -= 308999563) * 2088438307])
			== 1);
	Class376.method6420(bool, -1758831276);
    }
}
