/* Class542 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;

public class Class542
{
    short[] aShortArray7182;
    Class543 this$1;
    public static int anInt7183;
    public static Class623 aClass623_7184;
    
    byte method8942(Class317 class317, byte i) throws IOException {
	int i_0_ = 1;
	do {
	    int i_1_ = i >> 7 & 0x1;
	    i <<= 1;
	    int i_2_ = class317.method5740(aShortArray7182,
					   i_0_ + (1 + i_1_ << 8), 742525310);
	    i_0_ = i_0_ << 1 | i_2_;
	    if (i_2_ != i_1_) {
		for (/**/; i_0_ < 256;
		     i_0_
			 = i_0_ << 1 | class317.method5740(aShortArray7182,
							   i_0_, 1401683638)) {
		    /* empty */
		}
		break;
	    }
	} while (i_0_ < 256);
	return (byte) i_0_;
    }
    
    void method8943(int i) {
	Class329.method5834(aShortArray7182, -1655095972);
    }
    
    void method8944() {
	Class329.method5834(aShortArray7182, 391678175);
    }
    
    byte method8945(Class317 class317, byte i, int i_3_) throws IOException {
	int i_4_ = 1;
	do {
	    int i_5_ = i >> 7 & 0x1;
	    i <<= 1;
	    int i_6_ = class317.method5740(aShortArray7182,
					   i_4_ + (1 + i_5_ << 8), -769204585);
	    i_4_ = i_4_ << 1 | i_6_;
	    if (i_6_ != i_5_) {
		for (/**/; i_4_ < 256;
		     i_4_ = i_4_ << 1 | class317.method5740(aShortArray7182,
							    i_4_,
							    -1599991824)) {
		    /* empty */
		}
		break;
	    }
	} while (i_4_ < 256);
	return (byte) i_4_;
    }
    
    byte method8946(Class317 class317, byte i) throws IOException {
	int i_7_ = 1;
	do {
	    int i_8_ = i >> 7 & 0x1;
	    i <<= 1;
	    int i_9_ = class317.method5740(aShortArray7182,
					   i_7_ + (1 + i_8_ << 8), -918691133);
	    i_7_ = i_7_ << 1 | i_9_;
	    if (i_9_ != i_8_) {
		for (/**/; i_7_ < 256;
		     i_7_
			 = i_7_ << 1 | class317.method5740(aShortArray7182,
							   i_7_, 1499966017)) {
		    /* empty */
		}
		break;
	    }
	} while (i_7_ < 256);
	return (byte) i_7_;
    }
    
    byte method8947(Class317 class317, int i) throws IOException {
	int i_10_ = 1;
	do
	    i_10_ = i_10_ << 1 | class317.method5740(aShortArray7182, i_10_,
						     -903703932);
	while (i_10_ < 256);
	return (byte) i_10_;
    }
    
    byte method8948(Class317 class317) throws IOException {
	int i = 1;
	do
	    i = i << 1 | class317.method5740(aShortArray7182, i, 150839333);
	while (i < 256);
	return (byte) i;
    }
    
    void method8949() {
	Class329.method5834(aShortArray7182, 1366918515);
    }
    
    Class542(Class543 class543) {
	this$1 = class543;
	aShortArray7182 = new short[768];
    }
    
    public static byte method8950(char c, int i) {
	byte i_11_;
	if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
	    i_11_ = (byte) c;
	else if (c == '\u20ac')
	    i_11_ = (byte) -128;
	else if ('\u201a' == c)
	    i_11_ = (byte) -126;
	else if (c == '\u0192')
	    i_11_ = (byte) -125;
	else if ('\u201e' == c)
	    i_11_ = (byte) -124;
	else if (c == '\u2026')
	    i_11_ = (byte) -123;
	else if ('\u2020' == c)
	    i_11_ = (byte) -122;
	else if (c == '\u2021')
	    i_11_ = (byte) -121;
	else if ('\u02c6' == c)
	    i_11_ = (byte) -120;
	else if ('\u2030' == c)
	    i_11_ = (byte) -119;
	else if ('\u0160' == c)
	    i_11_ = (byte) -118;
	else if ('\u2039' == c)
	    i_11_ = (byte) -117;
	else if (c == '\u0152')
	    i_11_ = (byte) -116;
	else if (c == '\u017d')
	    i_11_ = (byte) -114;
	else if ('\u2018' == c)
	    i_11_ = (byte) -111;
	else if (c == '\u2019')
	    i_11_ = (byte) -110;
	else if (c == '\u201c')
	    i_11_ = (byte) -109;
	else if ('\u201d' == c)
	    i_11_ = (byte) -108;
	else if ('\u2022' == c)
	    i_11_ = (byte) -107;
	else if (c == '\u2013')
	    i_11_ = (byte) -106;
	else if (c == '\u2014')
	    i_11_ = (byte) -105;
	else if ('\u02dc' == c)
	    i_11_ = (byte) -104;
	else if ('\u2122' == c)
	    i_11_ = (byte) -103;
	else if ('\u0161' == c)
	    i_11_ = (byte) -102;
	else if ('\u203a' == c)
	    i_11_ = (byte) -101;
	else if ('\u0153' == c)
	    i_11_ = (byte) -100;
	else if ('\u017e' == c)
	    i_11_ = (byte) -98;
	else if (c == '\u0178')
	    i_11_ = (byte) -97;
	else
	    i_11_ = (byte) 63;
	return i_11_;
    }
}
