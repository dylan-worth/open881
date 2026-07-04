/* Class242 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class242
{
    static final String aString2409 = "#";
    public static Class472 aClass472_2410;
    
    public static final boolean method4464
	(String string, String string_0_, String string_1_, String string_2_) {
	if (null == string || string_1_ == null)
	    return false;
	if (string.startsWith("#") || string_1_.startsWith("#"))
	    return string.equals(string_1_);
	return string_0_.equals(string_2_);
    }
    
    public static final boolean method4465
	(String string, String string_3_, String string_4_, String string_5_) {
	if (null == string || string_4_ == null)
	    return false;
	if (string.startsWith("#") || string_4_.startsWith("#"))
	    return string.equals(string_4_);
	return string_3_.equals(string_5_);
    }
    
    Class242() throws Throwable {
	throw new Error();
    }
    
    static void method4466(Class185 class185, int i, int i_6_,
			   Class247 class247, int i_7_, int i_8_) {
	for (int i_9_ = 7; i_9_ >= 0; i_9_--) {
	    for (int i_10_ = 127; i_10_ >= 0; i_10_--) {
		int i_11_
		    = (i_7_ & 0x3f) << 10 | (i_9_ & 0x7) << 7 | i_10_ & 0x7f;
		Class456.method7426(false, true, 1739452007);
		int i_12_ = Class415.anIntArray4666[i_11_];
		Class54.method1212(false, true, -1640628467);
		class185.method3298
		    ((-881188269 * class247.anInt2468 * i_10_ >> 7) + i,
		     i_6_ + (class247.anInt2469 * -1279656873 * (7 - i_9_)
			     >> 3),
		     1 + (class247.anInt2468 * -881188269 >> 7),
		     (-1279656873 * class247.anInt2469 >> 3) + 1,
		     ~0xffffff | i_12_, 0);
	    }
	}
    }
    
    static final void method4467(Class669 class669, byte i) {
	int i_13_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (0 != -1050164879 * client.anInt11171
	    && i_13_ < 2103713403 * client.anInt11329)
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= client.aClass33Array11299[i_13_].aString273;
	else
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
    }
    
    static final void method4468(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_14_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_15_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	Class90 class90 = (Class90) Class534_Sub11_Sub13
					.aClass44_Sub22_11730
					.method91(i_15_, -1242245169);
	if (class90.method1718(-1230058541))
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= ((Class272)
		   Class222.aClass44_Sub9_2313.method91(i_14_, -1570926842))
		      .method5051(i_15_, class90.aString889, 435936651);
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= (((Class272)
		    Class222.aClass44_Sub9_2313.method91(i_14_, 1206570930))
		       .method5046
		   (i_15_, class90.anInt888 * 263946597, 1142824847));
    }
    
    static final void method4469(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub30_10739
		  .method17142(-195852598) ? 1 : 0;
    }
    
    static final void method4470(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	int i_16_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_17_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aClass219_11338.method4120(i_16_, (byte) 16)
		  .method4348(i_17_, 766336471);
    }
    
    static boolean method4471(byte i) {
	return Class51.aBool414;
    }
    
    static final void method4472(Class669 class669, int i) {
	int i_18_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_18_, 497200120);
	Class76.method1591(class247, class669, 439517725);
    }
}
