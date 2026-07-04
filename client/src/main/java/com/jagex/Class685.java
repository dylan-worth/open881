/* Class685 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class685
{
    static char[] aCharArray8697
	= { '\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020',
	    '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0',
	    '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c', '\u201d',
	    '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161',
	    '\u203a', '\u0153', '\0', '\u017e', '\u0178' };
    public static RSSocket aClass23_8698;
    
    public static byte method13951(char c) {
	byte i;
	if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
	    i = (byte) c;
	else if (c == '\u20ac')
	    i = (byte) -128;
	else if ('\u201a' == c)
	    i = (byte) -126;
	else if (c == '\u0192')
	    i = (byte) -125;
	else if ('\u201e' == c)
	    i = (byte) -124;
	else if (c == '\u2026')
	    i = (byte) -123;
	else if ('\u2020' == c)
	    i = (byte) -122;
	else if (c == '\u2021')
	    i = (byte) -121;
	else if ('\u02c6' == c)
	    i = (byte) -120;
	else if ('\u2030' == c)
	    i = (byte) -119;
	else if ('\u0160' == c)
	    i = (byte) -118;
	else if ('\u2039' == c)
	    i = (byte) -117;
	else if (c == '\u0152')
	    i = (byte) -116;
	else if (c == '\u017d')
	    i = (byte) -114;
	else if ('\u2018' == c)
	    i = (byte) -111;
	else if (c == '\u2019')
	    i = (byte) -110;
	else if (c == '\u201c')
	    i = (byte) -109;
	else if ('\u201d' == c)
	    i = (byte) -108;
	else if ('\u2022' == c)
	    i = (byte) -107;
	else if (c == '\u2013')
	    i = (byte) -106;
	else if (c == '\u2014')
	    i = (byte) -105;
	else if ('\u02dc' == c)
	    i = (byte) -104;
	else if ('\u2122' == c)
	    i = (byte) -103;
	else if ('\u0161' == c)
	    i = (byte) -102;
	else if ('\u203a' == c)
	    i = (byte) -101;
	else if ('\u0153' == c)
	    i = (byte) -100;
	else if ('\u017e' == c)
	    i = (byte) -98;
	else if (c == '\u0178')
	    i = (byte) -97;
	else
	    i = (byte) 63;
	return i;
    }
    
    public static char method13952(byte i) {
	int i_0_ = i & 0xff;
	if (i_0_ == 0)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (Integer.toString(i_0_, 16))
						   .toString());
	if (i_0_ >= 128 && i_0_ < 160) {
	    int i_1_ = aCharArray8697[i_0_ - 128];
	    if (0 == i_1_)
		i_1_ = 63;
	    i_0_ = i_1_;
	}
	return (char) i_0_;
    }
    
    Class685() throws Throwable {
	throw new Error();
    }
    
    public static boolean method13953(char c) {
	if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
	    return true;
	if ('\0' != c) {
	    char[] cs = aCharArray8697;
	    for (int i = 0; i < cs.length; i++) {
		char c_2_ = cs[i];
		if (c == c_2_)
		    return true;
	    }
	}
	return false;
    }
    
    public static boolean method13954(char c) {
	if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
	    return true;
	if ('\0' != c) {
	    char[] cs = aCharArray8697;
	    for (int i = 0; i < cs.length; i++) {
		char c_3_ = cs[i];
		if (c == c_3_)
		    return true;
	    }
	}
	return false;
    }
    
    public static char method13955(byte i) {
	int i_4_ = i & 0xff;
	if (i_4_ == 0)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (Integer.toString(i_4_, 16))
						   .toString());
	if (i_4_ >= 128 && i_4_ < 160) {
	    int i_5_ = aCharArray8697[i_4_ - 128];
	    if (0 == i_5_)
		i_5_ = 63;
	    i_4_ = i_5_;
	}
	return (char) i_4_;
    }
    
    public static char method13956(byte i) {
	int i_6_ = i & 0xff;
	if (i_6_ == 0)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (Integer.toString(i_6_, 16))
						   .toString());
	if (i_6_ >= 128 && i_6_ < 160) {
	    int i_7_ = aCharArray8697[i_6_ - 128];
	    if (0 == i_7_)
		i_7_ = 63;
	    i_6_ = i_7_;
	}
	return (char) i_6_;
    }
    
    public static int method13957(CharSequence charsequence, int i, int i_8_,
				  byte[] is, int i_9_) {
	int i_10_ = i_8_ - i;
	for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
	    char c = charsequence.charAt(i + i_11_);
	    if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
		is[i_9_ + i_11_] = (byte) c;
	    else if ('\u20ac' == c)
		is[i_9_ + i_11_] = (byte) -128;
	    else if (c == '\u201a')
		is[i_11_ + i_9_] = (byte) -126;
	    else if (c == '\u0192')
		is[i_9_ + i_11_] = (byte) -125;
	    else if (c == '\u201e')
		is[i_11_ + i_9_] = (byte) -124;
	    else if (c == '\u2026')
		is[i_11_ + i_9_] = (byte) -123;
	    else if (c == '\u2020')
		is[i_9_ + i_11_] = (byte) -122;
	    else if ('\u2021' == c)
		is[i_9_ + i_11_] = (byte) -121;
	    else if ('\u02c6' == c)
		is[i_11_ + i_9_] = (byte) -120;
	    else if (c == '\u2030')
		is[i_11_ + i_9_] = (byte) -119;
	    else if ('\u0160' == c)
		is[i_9_ + i_11_] = (byte) -118;
	    else if (c == '\u2039')
		is[i_11_ + i_9_] = (byte) -117;
	    else if (c == '\u0152')
		is[i_11_ + i_9_] = (byte) -116;
	    else if (c == '\u017d')
		is[i_9_ + i_11_] = (byte) -114;
	    else if ('\u2018' == c)
		is[i_11_ + i_9_] = (byte) -111;
	    else if ('\u2019' == c)
		is[i_11_ + i_9_] = (byte) -110;
	    else if ('\u201c' == c)
		is[i_11_ + i_9_] = (byte) -109;
	    else if (c == '\u201d')
		is[i_11_ + i_9_] = (byte) -108;
	    else if (c == '\u2022')
		is[i_9_ + i_11_] = (byte) -107;
	    else if (c == '\u2013')
		is[i_9_ + i_11_] = (byte) -106;
	    else if (c == '\u2014')
		is[i_11_ + i_9_] = (byte) -105;
	    else if (c == '\u02dc')
		is[i_9_ + i_11_] = (byte) -104;
	    else if ('\u2122' == c)
		is[i_11_ + i_9_] = (byte) -103;
	    else if ('\u0161' == c)
		is[i_9_ + i_11_] = (byte) -102;
	    else if ('\u203a' == c)
		is[i_11_ + i_9_] = (byte) -101;
	    else if ('\u0153' == c)
		is[i_9_ + i_11_] = (byte) -100;
	    else if ('\u017e' == c)
		is[i_11_ + i_9_] = (byte) -98;
	    else if (c == '\u0178')
		is[i_11_ + i_9_] = (byte) -97;
	    else
		is[i_9_ + i_11_] = (byte) 63;
	}
	return i_10_;
    }
    
    public static String method13958(byte[] is, int i, int i_12_) {
	char[] cs = new char[i_12_];
	int i_13_ = 0;
	for (int i_14_ = 0; i_14_ < i_12_; i_14_++) {
	    int i_15_ = is[i_14_ + i] & 0xff;
	    if (i_15_ != 0) {
		if (i_15_ >= 128 && i_15_ < 160) {
		    int i_16_ = aCharArray8697[i_15_ - 128];
		    if (i_16_ == 0)
			i_16_ = 63;
		    i_15_ = i_16_;
		}
		cs[i_13_++] = (char) i_15_;
	    }
	}
	return new String(cs, 0, i_13_);
    }
    
    static final void method13959(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_17_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_18_
	    = class669.anIntArray8595[1 + 2088438307 * class669.anInt8600];
	if (Class713.aBool8884) {
	    Class159.method2611(3, i_17_, i_18_, false, 681925747);
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= Class29.aFrame266 != null ? 1 : 0;
	} else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
    
    public static int method13960(CharSequence charsequence,
				  CharSequence charsequence_19_, int i) {
	int i_20_ = charsequence.length();
	int i_21_ = charsequence_19_.length();
	if (0 == i_20_)
	    return i_21_;
	if (0 == i_21_)
	    return i_20_;
	int[] is = new int[i_20_ + 1];
	int[] is_22_ = new int[i_20_ + 1];
	for (int i_23_ = 0; i_23_ <= i_20_; i_23_++)
	    is[i_23_] = i_23_;
	for (int i_24_ = 1; i_24_ <= i_21_; i_24_++) {
	    is_22_[0] = i_24_;
	    char c = charsequence_19_.charAt(i_24_ - 1);
	    for (int i_25_ = 1; i_25_ <= i_20_; i_25_++)
		is_22_[i_25_]
		    = Math.min(Math.min(1 + is_22_[i_25_ - 1], 1 + is[i_25_]),
			       (is[i_25_ - 1]
				+ (charsequence.charAt(i_25_ - 1) == c ? 0
				   : 1)));
	    int[] is_26_ = is;
	    is = is_22_;
	    is_22_ = is_26_;
	}
	return is[i_20_];
    }
    
    static void method13961(Class534_Sub40 class534_sub40, byte i) {
	for (int i_27_ = 0; i_27_ < Class542.anInt7183 * 1699576543; i_27_++) {
	    int i_28_ = class534_sub40.method16546(-1706829710);
	    int i_29_ = class534_sub40.method16529((byte) 1);
	    if (i_29_ == 65535)
		i_29_ = -1;
	    if (Class619.aClass606_Sub1Array8107[i_28_] != null)
		Class619.aClass606_Sub1Array8107[i_28_].anInt7981
		    = 734920847 * i_29_;
	}
    }
}
