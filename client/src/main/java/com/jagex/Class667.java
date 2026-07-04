/* Class667 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class667
{
    static int[] anIntArray8578;
    static char[] aCharArray8579;
    static char[] aCharArray8580;
    static char[] aCharArray8581 = new char[64];
    public static Class44_Sub21 aClass44_Sub21_8582;
    
    Class667() throws Throwable {
	throw new Error();
    }
    
    static {
	for (int i = 0; i < 26; i++)
	    aCharArray8581[i] = (char) (65 + i);
	for (int i = 26; i < 52; i++)
	    aCharArray8581[i] = (char) (i + 97 - 26);
	for (int i = 52; i < 62; i++)
	    aCharArray8581[i] = (char) (48 + i - 52);
	aCharArray8581[62] = '+';
	aCharArray8581[63] = '/';
	aCharArray8579 = new char[64];
	for (int i = 0; i < 26; i++)
	    aCharArray8579[i] = (char) (i + 65);
	for (int i = 26; i < 52; i++)
	    aCharArray8579[i] = (char) (i + 97 - 26);
	for (int i = 52; i < 62; i++)
	    aCharArray8579[i] = (char) (48 + i - 52);
	aCharArray8579[62] = '*';
	aCharArray8579[63] = '-';
	aCharArray8580 = new char[64];
	for (int i = 0; i < 26; i++)
	    aCharArray8580[i] = (char) (65 + i);
	for (int i = 26; i < 52; i++)
	    aCharArray8580[i] = (char) (i + 97 - 26);
	for (int i = 52; i < 62; i++)
	    aCharArray8580[i] = (char) (48 + i - 52);
	aCharArray8580[62] = '-';
	aCharArray8580[63] = '_';
	anIntArray8578 = new int[128];
	for (int i = 0; i < anIntArray8578.length; i++)
	    anIntArray8578[i] = -1;
	for (int i = 65; i <= 90; i++)
	    anIntArray8578[i] = i - 65;
	for (int i = 97; i <= 122; i++)
	    anIntArray8578[i] = i - 97 + 26;
	for (int i = 48; i <= 57; i++)
	    anIntArray8578[i] = i - 48 + 52;
	int[] is = anIntArray8578;
	anIntArray8578[43] = 62;
	is[42] = 62;
	int[] is_0_ = anIntArray8578;
	anIntArray8578[47] = 63;
	is_0_[45] = 63;
    }
    
    public static String method11022(byte[] is) {
	return Class337.method5906(is, 0, is.length, -1842111827);
    }
    
    static String method11023(byte[] is, int i, int i_1_) {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i_2_ = i; i_2_ < i_1_ + i; i_2_ += 3) {
	    int i_3_ = is[i_2_] & 0xff;
	    stringbuilder.append(aCharArray8581[i_3_ >>> 2]);
	    if (i_2_ < i_1_ - 1) {
		int i_4_ = is[1 + i_2_] & 0xff;
		stringbuilder
		    .append(aCharArray8581[(i_3_ & 0x3) << 4 | i_4_ >>> 4]);
		if (i_2_ < i_1_ - 2) {
		    int i_5_ = is[i_2_ + 2] & 0xff;
		    stringbuilder.append
			(aCharArray8581[(i_4_ & 0xf) << 2 | i_5_ >>> 6])
			.append(aCharArray8581[i_5_ & 0x3f]);
		} else
		    stringbuilder.append(aCharArray8581[(i_4_ & 0xf) << 2])
			.append('=');
	    } else
		stringbuilder.append(aCharArray8581[(i_3_ & 0x3) << 4]).append
		    ('=').append('=');
	}
	return stringbuilder.toString();
    }
    
    public static String method11024(byte[] is) {
	return Class337.method5906(is, 0, is.length, -1842111827);
    }
    
    public static String method11025(byte[] is) {
	return Class337.method5906(is, 0, is.length, -1842111827);
    }
    
    public static String method11026(byte[] is) {
	return Class337.method5906(is, 0, is.length, -1842111827);
    }
    
    static String method11027(byte[] is, int i, int i_6_) {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i_7_ = i; i_7_ < i_6_ + i; i_7_ += 3) {
	    int i_8_ = is[i_7_] & 0xff;
	    stringbuilder.append(aCharArray8581[i_8_ >>> 2]);
	    if (i_7_ < i_6_ - 1) {
		int i_9_ = is[1 + i_7_] & 0xff;
		stringbuilder
		    .append(aCharArray8581[(i_8_ & 0x3) << 4 | i_9_ >>> 4]);
		if (i_7_ < i_6_ - 2) {
		    int i_10_ = is[i_7_ + 2] & 0xff;
		    stringbuilder.append
			(aCharArray8581[(i_9_ & 0xf) << 2 | i_10_ >>> 6])
			.append(aCharArray8581[i_10_ & 0x3f]);
		} else
		    stringbuilder.append(aCharArray8581[(i_9_ & 0xf) << 2])
			.append('=');
	    } else
		stringbuilder.append(aCharArray8581[(i_8_ & 0x3) << 4]).append
		    ('=').append('=');
	}
	return stringbuilder.toString();
    }
    
    static String method11028(byte[] is, int i, int i_11_) {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i_12_ = i; i_12_ < i_11_ + i; i_12_ += 3) {
	    int i_13_ = is[i_12_] & 0xff;
	    stringbuilder.append(aCharArray8581[i_13_ >>> 2]);
	    if (i_12_ < i_11_ - 1) {
		int i_14_ = is[1 + i_12_] & 0xff;
		stringbuilder
		    .append(aCharArray8581[(i_13_ & 0x3) << 4 | i_14_ >>> 4]);
		if (i_12_ < i_11_ - 2) {
		    int i_15_ = is[i_12_ + 2] & 0xff;
		    stringbuilder.append
			(aCharArray8581[(i_14_ & 0xf) << 2 | i_15_ >>> 6])
			.append(aCharArray8581[i_15_ & 0x3f]);
		} else
		    stringbuilder.append
			(aCharArray8581[(i_14_ & 0xf) << 2]).append('=');
	    } else
		stringbuilder.append(aCharArray8581[(i_13_ & 0x3) << 4]).append
		    ('=').append('=');
	}
	return stringbuilder.toString();
    }
}
