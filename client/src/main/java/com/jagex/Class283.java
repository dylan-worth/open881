/* Class283 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class283
{
    static Class267 aClass267_3067;
    public static Interface18 anInterface18_3068;
    
    Class283() throws Throwable {
	throw new Error();
    }
    
    public static void method5240(Class267 class267) {
	aClass267_3067 = class267;
    }
    
    public static void method5241(Class267 class267) {
	aClass267_3067 = class267;
    }
    
    public static int method5242(Class534_Sub40 class534_sub40,
				 String string) {
	int i = class534_sub40.anInt10811 * 31645619;
	byte[] is = Class387.method6503(string, -1404790391);
	class534_sub40.method16542(is.length, -512461177);
	class534_sub40.anInt10811
	    += aClass267_3067.method4862(is, 0, is.length,
					 class534_sub40.aByteArray10810,
					 class534_sub40.anInt10811 * 31645619,
					 1292419310) * -1387468933;
	return 31645619 * class534_sub40.anInt10811 - i;
    }
    
    public static int method5243(Class534_Sub40 class534_sub40,
				 String string) {
	int i = class534_sub40.anInt10811 * 31645619;
	byte[] is = Class387.method6503(string, -1929434143);
	class534_sub40.method16542(is.length, -512461177);
	class534_sub40.anInt10811
	    += aClass267_3067.method4862(is, 0, is.length,
					 class534_sub40.aByteArray10810,
					 class534_sub40.anInt10811 * 31645619,
					 1089319324) * -1387468933;
	return 31645619 * class534_sub40.anInt10811 - i;
    }
    
    static String method5244(Class534_Sub40 class534_sub40, int i) {
	String string;
	try {
	    int i_0_ = class534_sub40.method16546(-1706829710);
	    if (i_0_ > i)
		i_0_ = i;
	    byte[] is = new byte[i_0_];
	    class534_sub40.anInt10811
		+= (aClass267_3067.method4861(class534_sub40.aByteArray10810,
					      (31645619
					       * class534_sub40.anInt10811),
					      is, 0, i_0_, 143908383)
		    * -1387468933);
	    String string_1_ = Class376.method6418(is, 0, i_0_, -1826132771);
	    string = string_1_;
	} catch (Exception exception) {
	    return "Cabbage";
	}
	return string;
    }
    
    public static String method5245(Class534_Sub40 class534_sub40) {
	return Class394_Sub2.method15786(class534_sub40, 32767, 16777472);
    }
    
    public static String method5246(Class534_Sub40 class534_sub40) {
	return Class394_Sub2.method15786(class534_sub40, 32767, 16777472);
    }
    
    static String method5247(Class534_Sub40 class534_sub40, int i) {
	String string;
	try {
	    int i_2_ = class534_sub40.method16546(-1706829710);
	    if (i_2_ > i)
		i_2_ = i;
	    byte[] is = new byte[i_2_];
	    class534_sub40.anInt10811
		+= (aClass267_3067.method4861(class534_sub40.aByteArray10810,
					      (31645619
					       * class534_sub40.anInt10811),
					      is, 0, i_2_, 143908383)
		    * -1387468933);
	    String string_3_ = Class376.method6418(is, 0, i_2_, -1639588712);
	    string = string_3_;
	} catch (Exception exception) {
	    return "Cabbage";
	}
	return string;
    }
    
    static final void method5248(Class247 class247, Class243 class243,
				 Class669 class669, byte i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (Class546.method8989(string, class669, -219410121) != null)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2590
	    = Class99.method1859(string, class669, -467075686);
	class247.aBool2561 = true;
    }
    
    static final void method5249(Class669 class669, byte i) {
	int i_4_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = Integer.toString(i_4_);
    }
    
    static final void method5250(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = -1802869663 * Class65.anInt659;
    }
    
    public static Class534_Sub18_Sub13 method5251
	(int i, Class271 class271, Class534_Sub40 class534_sub40, int i_5_) {
	if (Class271.aClass271_2962 == class271)
	    return new Class534_Sub18_Sub13_Sub2(i, class534_sub40);
	if (Class271.aClass271_2961 == class271)
	    return new Class534_Sub18_Sub13_Sub1(i, class534_sub40);
	return null;
    }
}
