/* Class689 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class689
{
    int anInt8711;
    int anInt8712 = 16;
    int anInt8713 = 258;
    int anInt8714 = 6;
    int anInt8715 = 50;
    int anInt8716;
    byte[] aByteArray8717;
    int anInt8718;
    int anInt8719;
    byte aByte8720;
    int anInt8721;
    byte[][] aByteArrayArray8722;
    int anInt8723;
    byte[] aByteArray8724;
    int anInt8725 = 18002;
    int anInt8726;
    int anInt8727;
    int anInt8728;
    int anInt8729;
    int[] anIntArray8730;
    byte[] aByteArray8731;
    int[][] anIntArrayArray8732;
    int anInt8733;
    int[] anIntArray8734;
    int anInt8735;
    boolean[] aBoolArray8736;
    boolean[] aBoolArray8737;
    int anInt8738;
    byte[] aByteArray8739;
    byte[] aByteArray8740;
    byte[] aByteArray8741;
    int anInt8742;
    int[] anIntArray8743;
    int[][] anIntArrayArray8744;
    int[][] anIntArrayArray8745;
    int anInt8746 = 4096;
    int[] anIntArray8747;
    int anInt8748;
    
    Class689() {
	anInt8712 = 16;
	anInt8713 = 258;
	anInt8714 = 6;
	anInt8715 = 50;
	anInt8725 = 18002;
	anInt8718 = 0;
	anInt8721 = 0;
	anIntArray8730 = new int[256];
	anIntArray8734 = new int[257];
	aBoolArray8736 = new boolean[256];
	aBoolArray8737 = new boolean[16];
	aByteArray8724 = new byte[256];
	aByteArray8739 = new byte[4096];
	anIntArray8743 = new int[16];
	aByteArray8741 = new byte[18002];
	aByteArray8740 = new byte[18002];
	aByteArrayArray8722 = new byte[6][258];
	anIntArrayArray8744 = new int[6][258];
	anIntArrayArray8745 = new int[6][258];
	anIntArrayArray8732 = new int[6][258];
	anIntArray8747 = new int[6];
    }
    
    static final int method14014(Class185 class185, Class651 class651, int i) {
	if (class651.anInt8470 * 33386845 != -1)
	    return class651.anInt8470 * 33386845;
	if (-1 != class651.anInt8468 * 1884378951) {
	    Class186 class186
		= class185.aClass177_2012
		      .method2931(1884378951 * class651.anInt8468, (byte) 1);
	    if (!class186.aBool2072)
		return class186.aShort2060;
	}
	return -2044484027 * class651.anInt8467;
    }
    
    public static void method14015(String string, boolean bool,
				   Class185 class185, Class171 class171,
				   Class16 class16, byte i) {
	boolean bool_0_
	    = !Class499.aBool5603 || Class473.method7752(-1622617802);
	if (bool_0_) {
	    if (Class499.aBool5603 && bool_0_) {
		class16 = Class223.aClass16_2314;
		class171
		    = class185.method3325(class16,
					  Class192.aClass169_Sub2Array2146,
					  true);
		int i_1_ = class16.method747(string, 250, null, 58987994);
		int i_2_ = class16.method737(string, 250,
					     class16.anInt187 * -1062735011,
					     null, 2112849964);
		int i_3_ = Class199.aClass169_2176.method2762();
		int i_4_ = 4 + i_3_;
		i_1_ += 2 * i_4_;
		i_2_ += i_4_ * 2;
		if (i_1_ < Class130.anInt1523 * 2090728523)
		    i_1_ = 2090728523 * Class130.anInt1523;
		if (i_2_ < Class90.anInt891 * 1207520599)
		    i_2_ = 1207520599 * Class90.anInt891;
		int i_5_
		    = (Class105.aClass401_1305.method6586(i_1_,
							  (client.anInt11047
							   * -321474631),
							  -2043999701)
		       + 111236059 * Class105.anInt1300);
		int i_6_
		    = (Class105.aClass391_1299.method6544(i_2_,
							  (43072843
							   * (client
							      .anInt11192)),
							  (byte) 15)
		       + -1939452853 * Class105.anInt1302);
		class185.method3279(Class90.aClass169_892, false).method2663
		    (i_5_ + Class690_Sub22.aClass169_10914.method2762(),
		     i_6_ + Class690_Sub22.aClass169_10914.method2763(),
		     i_1_ - Class690_Sub22.aClass169_10914.method2762() * 2,
		     i_2_ - Class690_Sub22.aClass169_10914.method2763() * 2, 1,
		     -1, 0);
		class185.method3279(Class690_Sub22.aClass169_10914, true)
		    .method2656(i_5_, i_6_);
		Class690_Sub22.aClass169_10914.method2806();
		class185.method3279(Class690_Sub22.aClass169_10914, true)
		    .method2656(i_1_ + i_5_ - i_3_, i_6_);
		Class690_Sub22.aClass169_10914.method2779();
		class185.method3279(Class690_Sub22.aClass169_10914, true)
		    .method2656(i_1_ + i_5_ - i_3_, i_6_ + i_2_ - i_3_);
		Class690_Sub22.aClass169_10914.method2806();
		class185.method3279(Class690_Sub22.aClass169_10914, true)
		    .method2656(i_5_, i_6_ + i_2_ - i_3_);
		Class690_Sub22.aClass169_10914.method2779();
		class185.method3279(Class199.aClass169_2176, true).method2662
		    (i_5_, i_6_ + Class690_Sub22.aClass169_10914.method2763(),
		     i_3_,
		     i_2_ - Class690_Sub22.aClass169_10914.method2763() * 2);
		Class199.aClass169_2176.method2771();
		class185.method3279(Class199.aClass169_2176, true).method2662
		    (i_5_ + Class690_Sub22.aClass169_10914.method2762(), i_6_,
		     i_1_ - Class690_Sub22.aClass169_10914.method2762() * 2,
		     i_3_);
		Class199.aClass169_2176.method2771();
		class185.method3279(Class199.aClass169_2176, true).method2662
		    (i_1_ + i_5_ - i_3_,
		     i_6_ + Class690_Sub22.aClass169_10914.method2763(), i_3_,
		     i_2_ - Class690_Sub22.aClass169_10914.method2763() * 2);
		Class199.aClass169_2176.method2771();
		class185.method3279(Class199.aClass169_2176, true).method2662
		    (i_5_ + Class690_Sub22.aClass169_10914.method2762(),
		     i_2_ + i_6_ - i_3_,
		     i_1_ - Class690_Sub22.aClass169_10914.method2762() * 2,
		     i_3_);
		Class199.aClass169_2176.method2771();
		class171.method2844(string, i_5_ + i_4_, i_6_ + i_4_,
				    i_1_ - 2 * i_4_, i_2_ - 2 * i_4_,
				    (2043737895 * Class351.anInt3621
				     | ~0xffffff),
				    -1, 1, 1, 0, null, null, null, 0, 0,
				    202025040);
		Class316.method5724(i_5_, i_6_, i_1_, i_2_, (byte) 1);
	    } else {
		int i_7_ = class16.method747(string, 250, null, 1396315333);
		int i_8_
		    = class16.method733(string, 250, null, (byte) -21) * 13;
		int i_9_ = 4;
		int i_10_ = i_9_ + 6;
		int i_11_ = i_9_ + 6;
		class185.method3298(i_10_ - i_9_, i_11_ - i_9_,
				    i_9_ + i_7_ + i_9_, i_9_ + (i_9_ + i_8_),
				    -16777216, 0);
		class185.method3297(i_10_ - i_9_, i_11_ - i_9_,
				    i_9_ + (i_7_ + i_9_), i_9_ + (i_9_ + i_8_),
				    -1, 0);
		class171.method2844(string, i_10_, i_11_, i_7_, i_8_, -1, -1,
				    1, 1, 0, null, null, null, 0, 0,
				    202025040);
		Class316.method5724(i_10_ - i_9_, i_11_ - i_9_,
				    i_7_ + i_9_ + i_9_, i_9_ + i_8_ + i_9_,
				    (byte) 1);
	    }
	    if (bool) {
		try {
		    class185.method3581();
		    class185.method3289(2094833034);
		} catch (Exception_Sub7 exception_sub7) {
		    /* empty */
		}
	    }
	}
    }
    
    static final void method14016(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class181.method2980(class247, class243, class669, (byte) 90);
    }
}
