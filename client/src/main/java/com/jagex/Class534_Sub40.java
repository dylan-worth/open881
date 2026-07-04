/* Class534_Sub40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.math.BigInteger;

public class Class534_Sub40 extends Class534
{
    public static final int anInt10808 = 100;
    public static final int anInt10809 = 5000;
    public byte[] aByteArray10810;
    public int anInt10811;
    public static long[] aLongArray10812;
    static final int anInt10813 = -306674912;
    static int[] anIntArray10814 = new int[256];
    static final long aLong10815 = -3932672073523589310L;
    
    public int method16503() {
	anInt10811 += -1254908436;
	return ((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff)
		+ (((aByteArray10810[anInt10811 * 31645619 - 3] & 0xff) << 24)
		   + ((aByteArray10810[31645619 * anInt10811 - 4] & 0xff)
		      << 16)
		   + ((aByteArray10810[anInt10811 * 31645619 - 1] & 0xff)
		      << 8)));
    }
    
    public byte method16504() {
	return (byte) ((aByteArray10810
			[(anInt10811 += -1387468933) * 31645619 - 1])
		       - 128);
    }
    
    public Class534_Sub40(byte[] is) {
	aByteArray10810 = is;
	anInt10811 = 0;
    }
    
    public void method16505(long l) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 56);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 48);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 40);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 32);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 24);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) l;
    }
    
    public void method16506(int i, int i_0_) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
    }
    
    public void method16507(int i, int i_1_) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
    }
    
    public int method16508() {
	anInt10811 += -1254908436;
	return ((aByteArray10810[31645619 * anInt10811 - 4] & 0xff)
		+ (((aByteArray10810[anInt10811 * 31645619 - 3] & 0xff) << 8)
		   + (((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff)
		       << 16)
		      + ((aByteArray10810[anInt10811 * 31645619 - 1] & 0xff)
			 << 24))));
    }
    
    public void method16509(int i, int i_2_) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
    }
    
    public void method16510(int i, int i_3_) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 24);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
    }
    
    public void method16511(int i, int i_4_) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 24);
    }
    
    public int method16512() {
	anInt10811 += 1520029430;
	int i = ((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff)
		 + ((aByteArray10810[31645619 * anInt10811 - 1] & 0xff) << 8));
	if (i > 32767)
	    i -= 65536;
	return i;
    }
    
    public String method16513() {
	int i = anInt10811 * 31645619;
	while (aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	       != 0) {
	    /* empty */
	}
	int i_5_ = 31645619 * anInt10811 - i - 1;
	if (0 == i_5_)
	    return "";
	return Class376.method6418(aByteArray10810, i, i_5_, -1886480526);
    }
    
    public int method16514(short i) {
	anInt10811 += -1254908436;
	return (((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff) << 16)
		+ ((aByteArray10810[31645619 * anInt10811 - 1] & 0xff) << 24)
		+ ((aByteArray10810[31645619 * anInt10811 - 3] & 0xff) << 8)
		+ (aByteArray10810[31645619 * anInt10811 - 4] & 0xff));
    }
    
    public void method16515(long l, int i, int i_6_) {
	if (--i < 0 || i > 7)
	    throw new IllegalArgumentException();
	for (int i_7_ = i * 8; i_7_ >= 0; i_7_ -= 8)
	    aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		= (byte) (int) (l >> i_7_);
    }
    
    public int method16516() {
	int i = aByteArray10810[anInt10811 * 31645619] & 0xff;
	if (i < 128)
	    return method16527(-1550617284) - 1;
	return method16529((byte) 1) - 32769;
    }
    
    public void method16517(String string, byte i) {
	int i_8_ = string.indexOf('\0');
	if (i_8_ >= 0)
	    throw new IllegalArgumentException("");
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) 0;
	anInt10811 += Class171_Sub4.method15603(string, 0, string.length(),
						aByteArray10810,
						anInt10811 * 31645619,
						-1640378486) * -1387468933;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) 0;
    }
    
    public void method16518(CharSequence charsequence, int i) {
	int i_9_ = Class316.method5720(charsequence, 1633839511);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) 0;
	method16526(i_9_, 1693324453);
	anInt10811
	    += Class536.method8905(aByteArray10810, anInt10811 * 31645619,
				   charsequence, -1954727156) * -1387468933;
    }
    
    public void method16519(byte[] is, int i, int i_10_, int i_11_) {
	for (int i_12_ = i; i_12_ < i_10_ + i; i_12_++)
	    aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		= is[i_12_];
    }
    
    public void method16520(Class534_Sub40 class534_sub40_13_, int i) {
	method16519(class534_sub40_13_.aByteArray10810, 0,
		    31645619 * class534_sub40_13_.anInt10811, 1703421556);
    }
    
    public void method16521(String string) {
	int i = string.indexOf('\0');
	if (i >= 0)
	    throw new IllegalArgumentException("");
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) 0;
	anInt10811 += Class171_Sub4.method15603(string, 0, string.length(),
						aByteArray10810,
						anInt10811 * 31645619,
						-2132357518) * -1387468933;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) 0;
    }
    
    public boolean method16522() {
	anInt10811 -= -1254908436;
	int i = Class60.method1258(aByteArray10810, 0, anInt10811 * 31645619,
				   -1094127016);
	int i_14_ = method16533(-258848859);
	if (i_14_ == i)
	    return true;
	return false;
    }
    
    public String method16523(int i) {
	byte i_15_
	    = aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1];
	if (i_15_ != 0)
	    throw new IllegalStateException("");
	int i_16_ = 31645619 * anInt10811;
	while (aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	       != 0) {
	    /* empty */
	}
	int i_17_ = 31645619 * anInt10811 - i_16_ - 1;
	if (i_17_ == 0)
	    return "";
	return Class376.method6418(aByteArray10810, i_16_, i_17_, -1872738250);
    }
    
    public int method16524() {
	int i = 0;
	int i_18_ = 0;
	int i_19_;
	do {
	    i_19_ = method16527(-594606850);
	    i |= (i_19_ & 0x7f) << i_18_;
	    i_18_ += 7;
	} while (i_19_ > 127);
	return i;
    }
    
    public int method16525() {
	return ((128
		 - aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1])
		& 0xff);
    }
    
    void method16526(int i, int i_20_) {
	if (0 != (i & ~0x7f)) {
	    if (0 != (i & ~0x3fff)) {
		if ((i & ~0x1fffff) != 0) {
		    if ((i & ~0xfffffff) != 0)
			method16506(i >>> 28 | 0x80, 1114116735);
		    method16506(i >>> 21 | 0x80, 856906271);
		}
		method16506(i >>> 14 | 0x80, 1532352384);
	    }
	    method16506(i >>> 7 | 0x80, 1568318872);
	}
	method16506(i & 0x7f, 1951771559);
    }
    
    public int method16527(int i) {
	return (aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		& 0xff);
    }
    
    public void method16528(int i, int i_21_) {
	if (i < 0 || i > 255)
	    throw new IllegalArgumentException();
	aByteArray10810[31645619 * anInt10811 - i - 1] = (byte) i;
    }
    
    public int method16529(byte i) {
	anInt10811 += 1520029430;
	return (((aByteArray10810[31645619 * anInt10811 - 2] & 0xff) << 8)
		+ (aByteArray10810[31645619 * anInt10811 - 1] & 0xff));
    }
    
    public int method16530(byte i) {
	anInt10811 += 1520029430;
	int i_22_
	    = ((aByteArray10810[anInt10811 * 31645619 - 1] & 0xff)
	       + ((aByteArray10810[31645619 * anInt10811 - 2] & 0xff) << 8));
	if (i_22_ > 32767)
	    i_22_ -= 65536;
	return i_22_;
    }
    
    public int method16531(int i) {
	anInt10811 += 132560497;
	return ((aByteArray10810[31645619 * anInt10811 - 1] & 0xff)
		+ (((aByteArray10810[anInt10811 * 31645619 - 3] & 0xff) << 16)
		   + ((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff)
		      << 8)));
    }
    
    public int method16532(int i) {
	anInt10811 += 132560497;
	int i_23_
	    = ((aByteArray10810[anInt10811 * 31645619 - 1] & 0xff)
	       + (((aByteArray10810[31645619 * anInt10811 - 3] & 0xff) << 16)
		  + ((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff)
		     << 8)));
	if (i_23_ > 8388607)
	    i_23_ -= 16777216;
	return i_23_;
    }
    
    public int method16533(int i) {
	anInt10811 += -1254908436;
	return ((aByteArray10810[anInt10811 * 31645619 - 1] & 0xff)
		+ (((aByteArray10810[anInt10811 * 31645619 - 3] & 0xff) << 16)
		   + ((aByteArray10810[anInt10811 * 31645619 - 4] & 0xff)
		      << 24)
		   + ((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff)
		      << 8)));
    }
    
    public int method16534(int i) {
	anInt10811 += -1254908436;
	return ((aByteArray10810[31645619 * anInt10811 - 4] & 0xff)
		+ (((aByteArray10810[anInt10811 * 31645619 - 3] & 0xff) << 8)
		   + (((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff)
		       << 16)
		      + ((aByteArray10810[anInt10811 * 31645619 - 1] & 0xff)
			 << 24))));
    }
    
    public long method16535(int i) {
	long l = (long) method16527(812361948) & 0xffffffffL;
	long l_24_ = (long) method16533(-258848859) & 0xffffffffL;
	return l_24_ + (l << 32);
    }
    
    public void method16536(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 24);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
    }
    
    public long method16537(int i) {
	long l = (long) method16533(-258848859) & 0xffffffffL;
	long l_25_ = (long) method16533(-258848859) & 0xffffffffL;
	return (l << 32) + l_25_;
    }
    
    public void method16538(byte i) {
	if (null != aByteArray10810)
	    Class691.method14033(aByteArray10810, (short) -32390);
	aByteArray10810 = null;
    }
    
    public float method16539(int i) {
	return Float.intBitsToFloat(method16533(-258848859));
    }
    
    public String method16540(int i) {
	if (aByteArray10810[31645619 * anInt10811] == 0) {
	    anInt10811 += -1387468933;
	    return null;
	}
	return method16541((byte) -125);
    }
    
    public String method16541(byte i) {
	int i_26_ = anInt10811 * 31645619;
	while (aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	       != 0) {
	    /* empty */
	}
	int i_27_ = 31645619 * anInt10811 - i_26_ - 1;
	if (0 == i_27_)
	    return "";
	return Class376.method6418(aByteArray10810, i_26_, i_27_, -1664888293);
    }
    
    public void method16542(int i, int i_28_) {
	if (i >= 0 && i < 128)
	    method16506(i, 2112044800);
	else if (i >= 0 && i < 32768)
	    method16507(32768 + i, 925172030);
	else
	    throw new IllegalArgumentException();
    }
    
    public String method16543(int i) {
	byte i_29_
	    = aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1];
	if (0 != i_29_)
	    throw new IllegalStateException("");
	int i_30_ = method16551((short) -23130);
	if (anInt10811 * 31645619 + i_30_ > aByteArray10810.length)
	    throw new IllegalStateException("");
	String string
	    = Class477.method7782(aByteArray10810, 31645619 * anInt10811,
				  i_30_, (byte) 71);
	anInt10811 += -1387468933 * i_30_;
	return string;
    }
    
    void method16544(int i) {
	if (0 != (i & ~0x7f)) {
	    if (0 != (i & ~0x3fff)) {
		if ((i & ~0x1fffff) != 0) {
		    if ((i & ~0xfffffff) != 0)
			method16506(i >>> 28 | 0x80, 1342439776);
		    method16506(i >>> 21 | 0x80, 594767991);
		}
		method16506(i >>> 14 | 0x80, 700081411);
	    }
	    method16506(i >>> 7 | 0x80, 1849036239);
	}
	method16506(i & 0x7f, 259576475);
    }
    
    public int method16545(byte i) {
	int i_31_ = aByteArray10810[anInt10811 * 31645619] & 0xff;
	if (i_31_ < 128)
	    return method16527(-941386773) - 64;
	return method16529((byte) 1) - 49152;
    }
    
    public int method16546(int i) {
	int i_32_ = aByteArray10810[31645619 * anInt10811] & 0xff;
	if (i_32_ < 128)
	    return method16527(-329843382);
	return method16529((byte) 1) - 32768;
    }
    
    public int method16547(int i) {
	int i_33_ = aByteArray10810[anInt10811 * 31645619] & 0xff;
	if (i_33_ < 128)
	    return method16527(1036111238) - 1;
	return method16529((byte) 1) - 32769;
    }
    
    public int method16548() {
	anInt10811 += 1520029430;
	int i = ((aByteArray10810[anInt10811 * 31645619 - 1] & 0xff)
		 + ((aByteArray10810[31645619 * anInt10811 - 2] & 0xff) << 8));
	if (i > 32767)
	    i -= 65536;
	return i;
    }
    
    public int method16549(int i) {
	if (aByteArray10810[31645619 * anInt10811] < 0)
	    return method16533(-258848859) & 0x7fffffff;
	return method16529((byte) 1);
    }
    
    public int method16550(byte i) {
	if (aByteArray10810[31645619 * anInt10811] < 0)
	    return method16533(-258848859) & 0x7fffffff;
	int i_34_ = method16529((byte) 1);
	if (32767 == i_34_)
	    return -1;
	return i_34_;
    }
    
    int method16551(short i) {
	int i_35_
	    = aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1];
	int i_36_ = 0;
	for (/**/; i_35_ < 0;
	     i_35_
		 = aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1])
	    i_36_ = (i_36_ | i_35_ & 0x7f) << 7;
	return i_36_ | i_35_;
    }
    
    public Class534_Sub40(int i) {
	aByteArray10810 = Class691.method14036(i, -1408450801);
	anInt10811 = 0;
    }
    
    public void method16552(int[] is, int i) {
	int i_37_ = 31645619 * anInt10811 / 8;
	anInt10811 = 0;
	for (int i_38_ = 0; i_38_ < i_37_; i_38_++) {
	    int i_39_ = method16533(-258848859);
	    int i_40_ = method16533(-258848859);
	    int i_41_ = 0;
	    int i_42_ = -1640531527;
	    int i_43_ = 32;
	    while (i_43_-- > 0) {
		i_39_ += ((i_40_ << 4 ^ i_40_ >>> 5) + i_40_
			  ^ i_41_ + is[i_41_ & 0x3]);
		i_41_ += i_42_;
		i_40_ += ((i_39_ << 4 ^ i_39_ >>> 5) + i_39_
			  ^ i_41_ + is[i_41_ >>> 11 & 0x3]);
	    }
	    anInt10811 -= 1785150424;
	    method16510(i_39_, -474250261);
	    method16510(i_40_, -1838807412);
	}
    }
    
    public void method16553(int[] is, byte i) {
	int i_44_ = anInt10811 * 31645619 / 8;
	anInt10811 = 0;
	for (int i_45_ = 0; i_45_ < i_44_; i_45_++) {
	    int i_46_ = method16533(-258848859);
	    int i_47_ = method16533(-258848859);
	    int i_48_ = -957401312;
	    int i_49_ = -1640531527;
	    int i_50_ = 32;
	    while (i_50_-- > 0) {
		i_47_ -= ((i_46_ << 4 ^ i_46_ >>> 5) + i_46_
			  ^ is[i_48_ >>> 11 & 0x3] + i_48_);
		i_48_ -= i_49_;
		i_46_ -= ((i_47_ << 4 ^ i_47_ >>> 5) + i_47_
			  ^ is[i_48_ & 0x3] + i_48_);
	    }
	    anInt10811 -= 1785150424;
	    method16510(i_46_, -205277857);
	    method16510(i_47_, -1747556964);
	}
    }
    
    public static int method16554(String string) {
	return string.length() + 2;
    }
    
    public void method16555(int[] is, int i, int i_51_, int i_52_) {
	int i_53_ = 31645619 * anInt10811;
	anInt10811 = i * -1387468933;
	int i_54_ = (i_51_ - i) / 8;
	for (int i_55_ = 0; i_55_ < i_54_; i_55_++) {
	    int i_56_ = method16533(-258848859);
	    int i_57_ = method16533(-258848859);
	    int i_58_ = -957401312;
	    int i_59_ = -1640531527;
	    int i_60_ = 32;
	    while (i_60_-- > 0) {
		i_57_ -= ((i_56_ << 4 ^ i_56_ >>> 5) + i_56_
			  ^ is[i_58_ >>> 11 & 0x3] + i_58_);
		i_58_ -= i_59_;
		i_56_ -= (i_57_ + (i_57_ << 4 ^ i_57_ >>> 5)
			  ^ is[i_58_ & 0x3] + i_58_);
	    }
	    anInt10811 -= 1785150424;
	    method16510(i_56_, -184997518);
	    method16510(i_57_, -444414709);
	}
	anInt10811 = -1387468933 * i_53_;
    }
    
    public void method16556(BigInteger biginteger, BigInteger biginteger_61_,
			    int i) {
	int i_62_ = anInt10811 * 31645619;
	anInt10811 = 0;
	byte[] is = new byte[i_62_];
	method16735(is, 0, i_62_, (short) -31528);
	BigInteger biginteger_63_ = new BigInteger(is);
	BigInteger biginteger_64_
	    = biginteger_63_.modPow(biginteger, biginteger_61_);
	byte[] is_65_ = biginteger_64_.toByteArray();
	anInt10811 = 0;
	method16507(is_65_.length, 1239544534);
	method16519(is_65_, 0, is_65_.length, -140020670);
    }
    
    public int method16557(int i, int i_66_) {
	int i_67_ = Class60.method1258(aByteArray10810, i,
				       31645619 * anInt10811, -1094127016);
	method16510(i_67_, -1832762990);
	return i_67_;
    }
    
    public boolean method16558(int i) {
	anInt10811 -= -1254908436;
	int i_68_ = Class60.method1258(aByteArray10810, 0,
				       anInt10811 * 31645619, -1094127016);
	int i_69_ = method16533(-258848859);
	if (i_69_ == i_68_)
	    return true;
	return false;
    }
    
    public void method16559(int i, int i_70_) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (128 + i);
    }
    
    public void method16560(int i, int i_71_) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (0 - i);
    }
    
    public long method16561() {
	long l = (long) method16533(-258848859) & 0xffffffffL;
	long l_72_ = (long) method16533(-258848859) & 0xffffffffL;
	return (l << 32) + l_72_;
    }
    
    int method16562() {
	int i = aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1];
	int i_73_ = 0;
	for (/**/; i < 0;
	     i = aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1])
	    i_73_ = (i_73_ | i & 0x7f) << 7;
	return i_73_ | i;
    }
    
    public int method16563(byte i) {
	return (0 - aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		& 0xff);
    }
    
    public void method16564(long l) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 40);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 32);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 24);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) l;
    }
    
    public byte method16565(int i) {
	return (byte) ((aByteArray10810
			[(anInt10811 += -1387468933) * 31645619 - 1])
		       - 128);
    }
    
    public byte method16566(int i) {
	return (byte) (0 - (aByteArray10810
			    [(anInt10811 += -1387468933) * 31645619 - 1]));
    }
    
    public byte method16567(byte i) {
	return (byte) (128 - (aByteArray10810
			      [(anInt10811 += -1387468933) * 31645619 - 1]));
    }
    
    public void method16568(int i, int i_74_) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
    }
    
    public void method16569(int i, int i_75_) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (128 + i);
    }
    
    public void method16570(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (128 - i);
    }
    
    public int method16571(int i) {
	anInt10811 += 1520029430;
	return (((aByteArray10810[anInt10811 * 31645619 - 1] & 0xff) << 8)
		+ (aByteArray10810[anInt10811 * 31645619 - 2] & 0xff));
    }
    
    public int method16572(byte i) {
	anInt10811 += 1520029430;
	return (((aByteArray10810[31645619 * anInt10811 - 2] & 0xff) << 8)
		+ (aByteArray10810[anInt10811 * 31645619 - 1] - 128 & 0xff));
    }
    
    public int method16573(int i) {
	anInt10811 += 1520029430;
	return ((aByteArray10810[anInt10811 * 31645619 - 2] - 128 & 0xff)
		+ ((aByteArray10810[anInt10811 * 31645619 - 1] & 0xff) << 8));
    }
    
    public void method16574(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (0 - i);
    }
    
    public int method16575(byte i) {
	anInt10811 += 1520029430;
	int i_76_
	    = ((aByteArray10810[anInt10811 * 31645619 - 2] - 128 & 0xff)
	       + ((aByteArray10810[31645619 * anInt10811 - 1] & 0xff) << 8));
	if (i_76_ > 32767)
	    i_76_ -= 65536;
	return i_76_;
    }
    
    static {
	for (int i = 0; i < 256; i++) {
	    int i_77_ = i;
	    for (int i_78_ = 0; i_78_ < 8; i_78_++) {
		if ((i_77_ & 0x1) == 1)
		    i_77_ = i_77_ >>> 1 ^ ~0x12477cdf;
		else
		    i_77_ >>>= 1;
	    }
	    anIntArray10814[i] = i_77_;
	}
	aLongArray10812 = new long[256];
	for (int i = 0; i < 256; i++) {
	    long l = (long) i;
	    for (int i_79_ = 0; i_79_ < 8; i_79_++) {
		if ((l & 0x1L) == 1L)
		    l = l >>> 1 ^ ~0x3693a86a2878f0bdL;
		else
		    l >>>= 1;
	    }
	    aLongArray10812[i] = l;
	}
    }
    
    public int method16576(int i) {
	anInt10811 += 132560497;
	return (((aByteArray10810[31645619 * anInt10811 - 2] & 0xff) << 16)
		+ ((aByteArray10810[anInt10811 * 31645619 - 3] & 0xff) << 8)
		+ (aByteArray10810[anInt10811 * 31645619 - 1] & 0xff));
    }
    
    public int method16577() {
	anInt10811 += 1520029430;
	return (((aByteArray10810[31645619 * anInt10811 - 2] & 0xff) << 8)
		+ (aByteArray10810[anInt10811 * 31645619 - 1] - 128 & 0xff));
    }
    
    public void method16578(int i, int i_80_) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 24);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 16);
    }
    
    public void method16579(int i, int i_81_) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 24);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
    }
    
    public static int method16580(byte[] is, int i) {
	return Class60.method1258(is, 0, i, -1094127016);
    }
    
    public int method16581(int i) {
	anInt10811 += -1254908436;
	return ((aByteArray10810[anInt10811 * 31645619 - 3] & 0xff)
		+ (((aByteArray10810[31645619 * anInt10811 - 1] & 0xff) << 16)
		   + ((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff)
		      << 24)
		   + ((aByteArray10810[31645619 * anInt10811 - 4] & 0xff)
		      << 8)));
    }
    
    public int method16582(int i) {
	anInt10811 += -1254908436;
	return ((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff)
		+ (((aByteArray10810[anInt10811 * 31645619 - 3] & 0xff) << 24)
		   + ((aByteArray10810[31645619 * anInt10811 - 4] & 0xff)
		      << 16)
		   + ((aByteArray10810[anInt10811 * 31645619 - 1] & 0xff)
		      << 8)));
    }
    
    public int method16583() {
	anInt10811 += -1254908436;
	return (((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff) << 16)
		+ ((aByteArray10810[31645619 * anInt10811 - 1] & 0xff) << 24)
		+ ((aByteArray10810[31645619 * anInt10811 - 3] & 0xff) << 8)
		+ (aByteArray10810[31645619 * anInt10811 - 4] & 0xff));
    }
    
    public void method16584(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (128 + i);
    }
    
    static int method16585(byte[] is, int i, int i_82_) {
	int i_83_ = -1;
	for (int i_84_ = i; i_84_ < i_82_; i_84_++)
	    i_83_ = i_83_ >>> 8 ^ anIntArray10814[(i_83_ ^ is[i_84_]) & 0xff];
	i_83_ ^= 0xffffffff;
	return i_83_;
    }
    
    public byte method16586(byte i) {
	return aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1];
    }
    
    public static int method16587(byte[] is, int i) {
	return Class60.method1258(is, 0, i, -1094127016);
    }
    
    public int method16588(short i) {
	int i_85_ = 0;
	int i_86_ = 0;
	int i_87_;
	do {
	    i_87_ = method16527(-875255672);
	    i_85_ |= (i_87_ & 0x7f) << i_86_;
	    i_86_ += 7;
	} while (i_87_ > 127);
	return i_85_;
    }
    
    public void method16589(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 24);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 16);
    }
    
    public void method16590(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
    }
    
    public void method16591(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
    }
    
    public void method16592(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
    }
    
    public void method16593(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
    }
    
    public void method16594(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
    }
    
    public void method16595(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
    }
    
    public void method16596(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
    }
    
    public void method16597(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
    }
    
    public int method16598(byte i) {
	int i_88_ = 0;
	int i_89_;
	for (i_89_ = method16546(-1706829710); 32767 == i_89_;
	     i_89_ = method16546(-1706829710))
	    i_88_ += 32767;
	i_88_ += i_89_;
	return i_88_;
    }
    
    public void method16599(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
    }
    
    public Class534_Sub40(int i, boolean bool) {
	aByteArray10810 = Class691.method14034(i, bool, 2136090260);
    }
    
    public void method16600(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 24);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
    }
    
    public void method16601(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 24);
    }
    
    public int method16602(byte i) {
	anInt10811 += 1520029430;
	int i_90_
	    = ((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff)
	       + ((aByteArray10810[31645619 * anInt10811 - 1] & 0xff) << 8));
	if (i_90_ > 32767)
	    i_90_ -= 65536;
	return i_90_;
    }
    
    public void method16603(int[] is, int i, int i_91_) {
	int i_92_ = 31645619 * anInt10811;
	anInt10811 = i * -1387468933;
	int i_93_ = (i_91_ - i) / 8;
	for (int i_94_ = 0; i_94_ < i_93_; i_94_++) {
	    int i_95_ = method16533(-258848859);
	    int i_96_ = method16533(-258848859);
	    int i_97_ = -957401312;
	    int i_98_ = -1640531527;
	    int i_99_ = 32;
	    while (i_99_-- > 0) {
		i_96_ -= ((i_95_ << 4 ^ i_95_ >>> 5) + i_95_
			  ^ is[i_97_ >>> 11 & 0x3] + i_97_);
		i_97_ -= i_98_;
		i_95_ -= (i_96_ + (i_96_ << 4 ^ i_96_ >>> 5)
			  ^ is[i_97_ & 0x3] + i_97_);
	    }
	    anInt10811 -= 1785150424;
	    method16510(i_95_, -1354803596);
	    method16510(i_96_, -797612627);
	}
	anInt10811 = -1387468933 * i_92_;
    }
    
    public void method16604(long l) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 32);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 24);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) l;
    }
    
    public void method16605(long l) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 32);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 24);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) l;
    }
    
    public void method16606(long l) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 56);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 48);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 40);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 32);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 24);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) l;
    }
    
    public static int method16607(String string) {
	return string.length() + 1;
    }
    
    public void method16608(long l) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 56);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 48);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 40);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 32);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 24);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) l;
    }
    
    public void method16609(long l, int i) {
	if (--i < 0 || i > 7)
	    throw new IllegalArgumentException();
	for (int i_100_ = i * 8; i_100_ >= 0; i_100_ -= 8)
	    aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		= (byte) (int) (l >> i_100_);
    }
    
    public void method16610(long l, int i) {
	if (--i < 0 || i > 7)
	    throw new IllegalArgumentException();
	for (int i_101_ = i * 8; i_101_ >= 0; i_101_ -= 8)
	    aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		= (byte) (int) (l >> i_101_);
    }
    
    public void method16611(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 24);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
    }
    
    public static int method16612(String string) {
	return string.length() + 1;
    }
    
    public String method16613() {
	int i = anInt10811 * 31645619;
	while (aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	       != 0) {
	    /* empty */
	}
	int i_102_ = 31645619 * anInt10811 - i - 1;
	if (0 == i_102_)
	    return "";
	return Class376.method6418(aByteArray10810, i, i_102_, -1991486756);
    }
    
    public void method16614(String string) {
	int i = string.indexOf('\0');
	if (i >= 0)
	    throw new IllegalArgumentException("");
	anInt10811 += Class171_Sub4.method15603(string, 0, string.length(),
						aByteArray10810,
						anInt10811 * 31645619,
						1014398180) * -1387468933;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) 0;
    }
    
    public void method16615(String string) {
	int i = string.indexOf('\0');
	if (i >= 0)
	    throw new IllegalArgumentException("");
	anInt10811 += Class171_Sub4.method15603(string, 0, string.length(),
						aByteArray10810,
						anInt10811 * 31645619,
						974939733) * -1387468933;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) 0;
    }
    
    public static int method16616(String string) {
	return string.length() + 2;
    }
    
    public void method16617(int i, int i_103_) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 24);
    }
    
    public void method16618(int i) {
	if (i < 0 || i > 255)
	    throw new IllegalArgumentException();
	aByteArray10810[31645619 * anInt10811 - i - 1] = (byte) i;
    }
    
    public void method16619(int[] is) {
	int i = 31645619 * anInt10811 / 8;
	anInt10811 = 0;
	for (int i_104_ = 0; i_104_ < i; i_104_++) {
	    int i_105_ = method16533(-258848859);
	    int i_106_ = method16533(-258848859);
	    int i_107_ = 0;
	    int i_108_ = -1640531527;
	    int i_109_ = 32;
	    while (i_109_-- > 0) {
		i_105_ += ((i_106_ << 4 ^ i_106_ >>> 5) + i_106_
			   ^ i_107_ + is[i_107_ & 0x3]);
		i_107_ += i_108_;
		i_106_ += ((i_105_ << 4 ^ i_105_ >>> 5) + i_105_
			   ^ i_107_ + is[i_107_ >>> 11 & 0x3]);
	    }
	    anInt10811 -= 1785150424;
	    method16510(i_105_, -1727694655);
	    method16510(i_106_, -1258046762);
	}
    }
    
    public void method16620(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 24);
    }
    
    public void method16621(String string) {
	int i = string.indexOf('\0');
	if (i >= 0)
	    throw new IllegalArgumentException("");
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) 0;
	anInt10811 += Class171_Sub4.method15603(string, 0, string.length(),
						aByteArray10810,
						anInt10811 * 31645619,
						1772561616) * -1387468933;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) 0;
    }
    
    public int method16622() {
	anInt10811 += 1520029430;
	return (((aByteArray10810[31645619 * anInt10811 - 2] & 0xff) << 8)
		+ (aByteArray10810[anInt10811 * 31645619 - 1] - 128 & 0xff));
    }
    
    public void method16623(CharSequence charsequence) {
	int i = Class316.method5720(charsequence, 984667584);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) 0;
	method16526(i, 1131297142);
	anInt10811
	    += Class536.method8905(aByteArray10810, anInt10811 * 31645619,
				   charsequence, -602124863) * -1387468933;
    }
    
    public void method16624(CharSequence charsequence) {
	int i = Class316.method5720(charsequence, 355549059);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) 0;
	method16526(i, 1220265856);
	anInt10811
	    += Class536.method8905(aByteArray10810, anInt10811 * 31645619,
				   charsequence, -2068215509) * -1387468933;
    }
    
    public void method16625(byte[] is, int i, int i_110_) {
	for (int i_111_ = i; i_111_ < i_110_ + i; i_111_++)
	    aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		= is[i_111_];
    }
    
    public void method16626(byte[] is, int i, int i_112_) {
	for (int i_113_ = i; i_113_ < i_112_ + i; i_113_++)
	    aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		= is[i_113_];
    }
    
    public void method16627(byte[] is, int i, int i_114_) {
	for (int i_115_ = i; i_115_ < i_114_ + i; i_115_++)
	    aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		= is[i_115_];
    }
    
    public void method16628(byte[] is, int i, int i_116_) {
	for (int i_117_ = i; i_117_ < i_116_ + i; i_117_++)
	    aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		= is[i_117_];
    }
    
    public void method16629(Class534_Sub40 class534_sub40_118_) {
	method16519(class534_sub40_118_.aByteArray10810, 0,
		    31645619 * class534_sub40_118_.anInt10811, 97123001);
    }
    
    public void method16630(Class534_Sub40 class534_sub40_119_) {
	method16519(class534_sub40_119_.aByteArray10810, 0,
		    31645619 * class534_sub40_119_.anInt10811, -650499457);
    }
    
    public void method16631(Class534_Sub40 class534_sub40_120_) {
	method16519(class534_sub40_120_.aByteArray10810, 0,
		    31645619 * class534_sub40_120_.anInt10811, 120670286);
    }
    
    public void method16632(int i) {
	if (i < 0 || i > 65535)
	    throw new IllegalArgumentException();
	aByteArray10810[31645619 * anInt10811 - i - 2] = (byte) (i >> 8);
	aByteArray10810[31645619 * anInt10811 - i - 1] = (byte) i;
    }
    
    public void method16633(int i) {
	if (i < 0 || i > 255)
	    throw new IllegalArgumentException();
	aByteArray10810[31645619 * anInt10811 - i - 1] = (byte) i;
    }
    
    public void method16634(int i) {
	if (i < 0 || i > 255)
	    throw new IllegalArgumentException();
	aByteArray10810[31645619 * anInt10811 - i - 1] = (byte) i;
    }
    
    public void method16635(int i, int i_121_) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (128 - i);
    }
    
    public void method16636(int i) {
	if (i < 64 && i >= -64)
	    method16506(i + 64, 1484434736);
	else if (i < 16384 && i >= -16384)
	    method16507(49152 + i, 1133454643);
	else
	    throw new IllegalArgumentException();
    }
    
    public void method16637(int i) {
	if (i < 64 && i >= -64)
	    method16506(i + 64, 279615302);
	else if (i < 16384 && i >= -16384)
	    method16507(49152 + i, 874738278);
	else
	    throw new IllegalArgumentException();
    }
    
    public int method16638() {
	return ((128
		 - aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1])
		& 0xff);
    }
    
    public int method16639() {
	return ((128
		 - aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1])
		& 0xff);
    }
    
    public void method16640(int i) {
	if (i < -1)
	    throw new IllegalArgumentException();
	if (-1 == i)
	    method16507(32767, 1742167335);
	else if (i < 32767)
	    method16507(i, 1727373432);
	else {
	    method16510(i, -1082517397);
	    aByteArray10810[31645619 * anInt10811 - 4] |= 0x80;
	}
    }
    
    public void method16641(int[] is) {
	int i = anInt10811 * 31645619 / 8;
	anInt10811 = 0;
	for (int i_122_ = 0; i_122_ < i; i_122_++) {
	    int i_123_ = method16533(-258848859);
	    int i_124_ = method16533(-258848859);
	    int i_125_ = -957401312;
	    int i_126_ = -1640531527;
	    int i_127_ = 32;
	    while (i_127_-- > 0) {
		i_124_ -= ((i_123_ << 4 ^ i_123_ >>> 5) + i_123_
			   ^ is[i_125_ >>> 11 & 0x3] + i_125_);
		i_125_ -= i_126_;
		i_123_ -= ((i_124_ << 4 ^ i_124_ >>> 5) + i_124_
			   ^ is[i_125_ & 0x3] + i_125_);
	    }
	    anInt10811 -= 1785150424;
	    method16510(i_123_, -2130436810);
	    method16510(i_124_, -387434015);
	}
    }
    
    public void method16642(int i, int i_128_) {
	if (i < 64 && i >= -64)
	    method16506(i + 64, 1241287245);
	else if (i < 16384 && i >= -16384)
	    method16507(49152 + i, 1188380264);
	else
	    throw new IllegalArgumentException();
    }
    
    public int method16643(int i) {
	return ((aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		 - 128)
		& 0xff);
    }
    
    public int method16644() {
	return (aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		& 0xff);
    }
    
    public byte method16645() {
	return aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1];
    }
    
    public int method16646() {
	anInt10811 += 1520029430;
	return (((aByteArray10810[31645619 * anInt10811 - 2] & 0xff) << 8)
		+ (aByteArray10810[31645619 * anInt10811 - 1] & 0xff));
    }
    
    public int method16647() {
	anInt10811 += 1520029430;
	return (((aByteArray10810[31645619 * anInt10811 - 2] & 0xff) << 8)
		+ (aByteArray10810[31645619 * anInt10811 - 1] & 0xff));
    }
    
    public int method16648() {
	anInt10811 += 1520029430;
	return (((aByteArray10810[31645619 * anInt10811 - 2] & 0xff) << 8)
		+ (aByteArray10810[31645619 * anInt10811 - 1] & 0xff));
    }
    
    void method16649(int i) {
	if (0 != (i & ~0x7f)) {
	    if (0 != (i & ~0x3fff)) {
		if ((i & ~0x1fffff) != 0) {
		    if ((i & ~0xfffffff) != 0)
			method16506(i >>> 28 | 0x80, 464330379);
		    method16506(i >>> 21 | 0x80, 1666422732);
		}
		method16506(i >>> 14 | 0x80, 505122292);
	    }
	    method16506(i >>> 7 | 0x80, 1523080996);
	}
	method16506(i & 0x7f, 1910570258);
    }
    
    public int method16650() {
	anInt10811 += 1520029430;
	int i = ((aByteArray10810[anInt10811 * 31645619 - 1] & 0xff)
		 + ((aByteArray10810[31645619 * anInt10811 - 2] & 0xff) << 8));
	if (i > 32767)
	    i -= 65536;
	return i;
    }
    
    public int method16651() {
	anInt10811 += 1520029430;
	int i = ((aByteArray10810[anInt10811 * 31645619 - 1] & 0xff)
		 + ((aByteArray10810[31645619 * anInt10811 - 2] & 0xff) << 8));
	if (i > 32767)
	    i -= 65536;
	return i;
    }
    
    public int method16652() {
	anInt10811 += 1520029430;
	int i = ((aByteArray10810[anInt10811 * 31645619 - 1] & 0xff)
		 + ((aByteArray10810[31645619 * anInt10811 - 2] & 0xff) << 8));
	if (i > 32767)
	    i -= 65536;
	return i;
    }
    
    public int method16653() {
	return (aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		& 0xff);
    }
    
    public int method16654() {
	anInt10811 += 132560497;
	return ((aByteArray10810[31645619 * anInt10811 - 1] & 0xff)
		+ (((aByteArray10810[anInt10811 * 31645619 - 3] & 0xff) << 16)
		   + ((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff)
		      << 8)));
    }
    
    public int method16655() {
	anInt10811 += 132560497;
	return ((aByteArray10810[31645619 * anInt10811 - 1] & 0xff)
		+ (((aByteArray10810[anInt10811 * 31645619 - 3] & 0xff) << 16)
		   + ((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff)
		      << 8)));
    }
    
    public int method16656() {
	anInt10811 += 132560497;
	int i = ((aByteArray10810[anInt10811 * 31645619 - 1] & 0xff)
		 + (((aByteArray10810[31645619 * anInt10811 - 3] & 0xff) << 16)
		    + ((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff)
		       << 8)));
	if (i > 8388607)
	    i -= 16777216;
	return i;
    }
    
    public int method16657() {
	anInt10811 += 132560497;
	int i = ((aByteArray10810[anInt10811 * 31645619 - 1] & 0xff)
		 + (((aByteArray10810[31645619 * anInt10811 - 3] & 0xff) << 16)
		    + ((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff)
		       << 8)));
	if (i > 8388607)
	    i -= 16777216;
	return i;
    }
    
    public int method16658() {
	anInt10811 += 132560497;
	int i = ((aByteArray10810[anInt10811 * 31645619 - 1] & 0xff)
		 + (((aByteArray10810[31645619 * anInt10811 - 3] & 0xff) << 16)
		    + ((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff)
		       << 8)));
	if (i > 8388607)
	    i -= 16777216;
	return i;
    }
    
    public int method16659() {
	int i = aByteArray10810[anInt10811 * 31645619] & 0xff;
	if (i < 128)
	    return method16527(937596329) - 64;
	return method16529((byte) 1) - 49152;
    }
    
    public int method16660() {
	anInt10811 += -1254908436;
	return ((aByteArray10810[anInt10811 * 31645619 - 1] & 0xff)
		+ (((aByteArray10810[anInt10811 * 31645619 - 3] & 0xff) << 16)
		   + ((aByteArray10810[anInt10811 * 31645619 - 4] & 0xff)
		      << 24)
		   + ((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff)
		      << 8)));
    }
    
    public long method16661(int i, byte i_129_) {
	if (--i < 0 || i > 7)
	    throw new IllegalArgumentException();
	int i_130_ = i * 8;
	long l = 0L;
	for (/**/; i_130_ >= 0; i_130_ -= 8)
	    l |= ((long) (aByteArray10810
			  [(anInt10811 += -1387468933) * 31645619 - 1])
		  & 0xffL) << i_130_;
	return l;
    }
    
    public long method16662() {
	long l = (long) method16527(197176173) & 0xffffffffL;
	long l_131_ = (long) method16533(-258848859) & 0xffffffffL;
	return l_131_ + (l << 32);
    }
    
    public long method16663() {
	long l = (long) method16529((byte) 1) & 0xffffffffL;
	long l_132_ = (long) method16533(-258848859) & 0xffffffffL;
	return (l << 32) + l_132_;
    }
    
    public long method16664() {
	long l = (long) method16529((byte) 1) & 0xffffffffL;
	long l_133_ = (long) method16533(-258848859) & 0xffffffffL;
	return (l << 32) + l_133_;
    }
    
    public long method16665() {
	long l = (long) method16533(-258848859) & 0xffffffffL;
	long l_134_ = (long) method16533(-258848859) & 0xffffffffL;
	return (l << 32) + l_134_;
    }
    
    public long method16666() {
	long l = (long) method16533(-258848859) & 0xffffffffL;
	long l_135_ = (long) method16533(-258848859) & 0xffffffffL;
	return (l << 32) + l_135_;
    }
    
    public long method16667() {
	long l = (long) method16533(-258848859) & 0xffffffffL;
	long l_136_ = (long) method16533(-258848859) & 0xffffffffL;
	return (l << 32) + l_136_;
    }
    
    public int method16668() {
	return (0 - aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		& 0xff);
    }
    
    public long method16669(int i) {
	if (--i < 0 || i > 7)
	    throw new IllegalArgumentException();
	int i_137_ = i * 8;
	long l = 0L;
	for (/**/; i_137_ >= 0; i_137_ -= 8)
	    l |= ((long) (aByteArray10810
			  [(anInt10811 += -1387468933) * 31645619 - 1])
		  & 0xffL) << i_137_;
	return l;
    }
    
    public float method16670() {
	return Float.intBitsToFloat(method16533(-258848859));
    }
    
    public float method16671() {
	return Float.intBitsToFloat(method16533(-258848859));
    }
    
    public int method16672() {
	anInt10811 += 132560497;
	return ((aByteArray10810[31645619 * anInt10811 - 1] & 0xff)
		+ (((aByteArray10810[anInt10811 * 31645619 - 3] & 0xff) << 16)
		   + ((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff)
		      << 8)));
    }
    
    public int method16673() {
	anInt10811 += -1254908436;
	return ((aByteArray10810[anInt10811 * 31645619 - 1] & 0xff)
		+ (((aByteArray10810[anInt10811 * 31645619 - 3] & 0xff) << 16)
		   + ((aByteArray10810[anInt10811 * 31645619 - 4] & 0xff)
		      << 24)
		   + ((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff)
		      << 8)));
    }
    
    public static int method16674(String string) {
	return string.length() + 2;
    }
    
    public void method16675(String string) {
	int i = string.indexOf('\0');
	if (i >= 0)
	    throw new IllegalArgumentException("");
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) 0;
	anInt10811 += Class171_Sub4.method15603(string, 0, string.length(),
						aByteArray10810,
						anInt10811 * 31645619,
						1581662983) * -1387468933;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) 0;
    }
    
    public String method16676() {
	byte i = aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1];
	if (i != 0)
	    throw new IllegalStateException("");
	int i_138_ = 31645619 * anInt10811;
	while (aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	       != 0) {
	    /* empty */
	}
	int i_139_ = 31645619 * anInt10811 - i_138_ - 1;
	if (i_139_ == 0)
	    return "";
	return Class376.method6418(aByteArray10810, i_138_, i_139_,
				   -1717116342);
    }
    
    public String method16677() {
	byte i = aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1];
	if (i != 0)
	    throw new IllegalStateException("");
	int i_140_ = 31645619 * anInt10811;
	while (aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	       != 0) {
	    /* empty */
	}
	int i_141_ = 31645619 * anInt10811 - i_140_ - 1;
	if (i_141_ == 0)
	    return "";
	return Class376.method6418(aByteArray10810, i_140_, i_141_,
				   -2101758073);
    }
    
    public String method16678() {
	byte i = aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1];
	if (0 != i)
	    throw new IllegalStateException("");
	int i_142_ = method16551((short) -10447);
	if (anInt10811 * 31645619 + i_142_ > aByteArray10810.length)
	    throw new IllegalStateException("");
	String string
	    = Class477.method7782(aByteArray10810, 31645619 * anInt10811,
				  i_142_, (byte) 125);
	anInt10811 += -1387468933 * i_142_;
	return string;
    }
    
    public String method16679() {
	byte i = aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1];
	if (0 != i)
	    throw new IllegalStateException("");
	int i_143_ = method16551((short) -15624);
	if (anInt10811 * 31645619 + i_143_ > aByteArray10810.length)
	    throw new IllegalStateException("");
	String string
	    = Class477.method7782(aByteArray10810, 31645619 * anInt10811,
				  i_143_, (byte) 64);
	anInt10811 += -1387468933 * i_143_;
	return string;
    }
    
    public int method16680() {
	anInt10811 += 1520029430;
	return (((aByteArray10810[anInt10811 * 31645619 - 1] & 0xff) << 8)
		+ (aByteArray10810[anInt10811 * 31645619 - 2] & 0xff));
    }
    
    public String method16681() {
	if (aByteArray10810[31645619 * anInt10811] == 0) {
	    anInt10811 += -1387468933;
	    return null;
	}
	return method16541((byte) -91);
    }
    
    public int method16682() {
	anInt10811 += 1520029430;
	int i = ((aByteArray10810[anInt10811 * 31645619 - 2] - 128 & 0xff)
		 + ((aByteArray10810[31645619 * anInt10811 - 1] & 0xff) << 8));
	if (i > 32767)
	    i -= 65536;
	return i;
    }
    
    public void method16683(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (128 + i);
    }
    
    public int method16684() {
	int i = aByteArray10810[31645619 * anInt10811] & 0xff;
	if (i < 128)
	    return method16527(-1960026632);
	return method16529((byte) 1) - 32768;
    }
    
    public void method16685(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (128 + i);
    }
    
    public int method16686() {
	int i = aByteArray10810[anInt10811 * 31645619] & 0xff;
	if (i < 128)
	    return method16527(-301281326) - 1;
	return method16529((byte) 1) - 32769;
    }
    
    public void method16687(int i, int i_144_) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (128 + i);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
    }
    
    public int method16688() {
	int i = aByteArray10810[anInt10811 * 31645619] & 0xff;
	if (i < 128)
	    return method16527(-1589439889) - 1;
	return method16529((byte) 1) - 32769;
    }
    
    public int method16689() {
	int i = 0;
	int i_145_;
	for (i_145_ = method16546(-1706829710); 32767 == i_145_;
	     i_145_ = method16546(-1706829710))
	    i += 32767;
	i += i_145_;
	return i;
    }
    
    public int method16690() {
	if (aByteArray10810[31645619 * anInt10811] < 0)
	    return method16533(-258848859) & 0x7fffffff;
	return method16529((byte) 1);
    }
    
    public int method16691() {
	if (aByteArray10810[31645619 * anInt10811] < 0)
	    return method16533(-258848859) & 0x7fffffff;
	int i = method16529((byte) 1);
	if (32767 == i)
	    return -1;
	return i;
    }
    
    public void method16692(long l) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 32);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 24);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) l;
    }
    
    public long method16693(int i) {
	long l = (long) method16529((byte) 1) & 0xffffffffL;
	long l_146_ = (long) method16533(-258848859) & 0xffffffffL;
	return (l << 32) + l_146_;
    }
    
    public int method16694() {
	int i = 0;
	int i_147_ = 0;
	int i_148_;
	do {
	    i_148_ = method16527(-996764001);
	    i |= (i_148_ & 0x7f) << i_147_;
	    i_147_ += 7;
	} while (i_148_ > 127);
	return i;
    }
    
    public byte method16695() {
	return (byte) (0 - (aByteArray10810
			    [(anInt10811 += -1387468933) * 31645619 - 1]));
    }
    
    public int method16696() {
	int i = 0;
	int i_149_ = 0;
	int i_150_;
	do {
	    i_150_ = method16527(407807081);
	    i |= (i_150_ & 0x7f) << i_149_;
	    i_149_ += 7;
	} while (i_150_ > 127);
	return i;
    }
    
    public void method16697(int[] is) {
	int i = anInt10811 * 31645619 / 8;
	anInt10811 = 0;
	for (int i_151_ = 0; i_151_ < i; i_151_++) {
	    int i_152_ = method16533(-258848859);
	    int i_153_ = method16533(-258848859);
	    int i_154_ = -957401312;
	    int i_155_ = -1640531527;
	    int i_156_ = 32;
	    while (i_156_-- > 0) {
		i_153_ -= ((i_152_ << 4 ^ i_152_ >>> 5) + i_152_
			   ^ is[i_154_ >>> 11 & 0x3] + i_154_);
		i_154_ -= i_155_;
		i_152_ -= ((i_153_ << 4 ^ i_153_ >>> 5) + i_153_
			   ^ is[i_154_ & 0x3] + i_154_);
	    }
	    anInt10811 -= 1785150424;
	    method16510(i_152_, -596993852);
	    method16510(i_153_, -1334057325);
	}
    }
    
    public int method16698() {
	int i = aByteArray10810[31645619 * anInt10811] & 0xff;
	if (i < 128)
	    return method16527(633487271);
	return method16529((byte) 1) - 32768;
    }
    
    int method16699() {
	int i = aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1];
	int i_157_ = 0;
	for (/**/; i < 0;
	     i = aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1])
	    i_157_ = (i_157_ | i & 0x7f) << 7;
	return i_157_ | i;
    }
    
    public void method16700(byte[] is, int i, int i_158_) {
	for (int i_159_ = i + i_158_ - 1; i_159_ >= i; i_159_--)
	    is[i_159_] = (byte) ((aByteArray10810
				  [(anInt10811 += -1387468933) * 31645619 - 1])
				 - 128);
    }
    
    public int method16701() {
	anInt10811 += -1254908436;
	return ((aByteArray10810[anInt10811 * 31645619 - 3] & 0xff)
		+ (((aByteArray10810[31645619 * anInt10811 - 1] & 0xff) << 16)
		   + ((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff)
		      << 24)
		   + ((aByteArray10810[31645619 * anInt10811 - 4] & 0xff)
		      << 8)));
    }
    
    public void method16702(int[] is) {
	int i = anInt10811 * 31645619 / 8;
	anInt10811 = 0;
	for (int i_160_ = 0; i_160_ < i; i_160_++) {
	    int i_161_ = method16533(-258848859);
	    int i_162_ = method16533(-258848859);
	    int i_163_ = -957401312;
	    int i_164_ = -1640531527;
	    int i_165_ = 32;
	    while (i_165_-- > 0) {
		i_162_ -= ((i_161_ << 4 ^ i_161_ >>> 5) + i_161_
			   ^ is[i_163_ >>> 11 & 0x3] + i_163_);
		i_163_ -= i_164_;
		i_161_ -= ((i_162_ << 4 ^ i_162_ >>> 5) + i_162_
			   ^ is[i_163_ & 0x3] + i_163_);
	    }
	    anInt10811 -= 1785150424;
	    method16510(i_161_, -97585071);
	    method16510(i_162_, -2087222043);
	}
    }
    
    public void method16703(int[] is, int i, int i_166_) {
	int i_167_ = 31645619 * anInt10811;
	anInt10811 = i * -1387468933;
	int i_168_ = (i_166_ - i) / 8;
	for (int i_169_ = 0; i_169_ < i_168_; i_169_++) {
	    int i_170_ = method16533(-258848859);
	    int i_171_ = method16533(-258848859);
	    int i_172_ = 0;
	    int i_173_ = -1640531527;
	    int i_174_ = 32;
	    while (i_174_-- > 0) {
		i_170_ += (i_171_ + (i_171_ << 4 ^ i_171_ >>> 5)
			   ^ i_172_ + is[i_172_ & 0x3]);
		i_172_ += i_173_;
		i_171_ += ((i_170_ << 4 ^ i_170_ >>> 5) + i_170_
			   ^ is[i_172_ >>> 11 & 0x3] + i_172_);
	    }
	    anInt10811 -= 1785150424;
	    method16510(i_170_, -2023721170);
	    method16510(i_171_, -1256574292);
	}
	anInt10811 = -1387468933 * i_167_;
    }
    
    public void method16704(int[] is, int i, int i_175_) {
	int i_176_ = 31645619 * anInt10811;
	anInt10811 = i * -1387468933;
	int i_177_ = (i_175_ - i) / 8;
	for (int i_178_ = 0; i_178_ < i_177_; i_178_++) {
	    int i_179_ = method16533(-258848859);
	    int i_180_ = method16533(-258848859);
	    int i_181_ = -957401312;
	    int i_182_ = -1640531527;
	    int i_183_ = 32;
	    while (i_183_-- > 0) {
		i_180_ -= ((i_179_ << 4 ^ i_179_ >>> 5) + i_179_
			   ^ is[i_181_ >>> 11 & 0x3] + i_181_);
		i_181_ -= i_182_;
		i_179_ -= (i_180_ + (i_180_ << 4 ^ i_180_ >>> 5)
			   ^ is[i_181_ & 0x3] + i_181_);
	    }
	    anInt10811 -= 1785150424;
	    method16510(i_179_, -662175068);
	    method16510(i_180_, -1553440385);
	}
	anInt10811 = -1387468933 * i_176_;
    }
    
    public void method16705(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (128 + i);
    }
    
    public void method16706(long l) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 56);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 48);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 40);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 32);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 24);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) l;
    }
    
    public int method16707(int i) {
	int i_184_ = Class60.method1258(aByteArray10810, i,
					31645619 * anInt10811, -1094127016);
	method16510(i_184_, -1257953092);
	return i_184_;
    }
    
    public boolean method16708() {
	anInt10811 -= -1254908436;
	int i = Class60.method1258(aByteArray10810, 0, anInt10811 * 31645619,
				   -1094127016);
	int i_185_ = method16533(-258848859);
	if (i_185_ == i)
	    return true;
	return false;
    }
    
    public int method16709() {
	anInt10811 += 1520029430;
	return (((aByteArray10810[anInt10811 * 31645619 - 1] & 0xff) << 8)
		+ (aByteArray10810[anInt10811 * 31645619 - 2] & 0xff));
    }
    
    public static int method16710(byte[] is, int i) {
	return Class60.method1258(is, 0, i, -1094127016);
    }
    
    public int method16711() {
	anInt10811 += -1254908436;
	return (((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff) << 16)
		+ ((aByteArray10810[31645619 * anInt10811 - 1] & 0xff) << 24)
		+ ((aByteArray10810[31645619 * anInt10811 - 3] & 0xff) << 8)
		+ (aByteArray10810[31645619 * anInt10811 - 4] & 0xff));
    }
    
    public void method16712(int i, byte i_186_) {
	if (i < -1)
	    throw new IllegalArgumentException();
	if (-1 == i)
	    method16507(32767, 962034653);
	else if (i < 32767)
	    method16507(i, 866992134);
	else {
	    method16510(i, -2134049055);
	    aByteArray10810[31645619 * anInt10811 - 4] |= 0x80;
	}
    }
    
    public void method16713(String string, int i) {
	int i_187_ = string.indexOf('\0');
	if (i_187_ >= 0)
	    throw new IllegalArgumentException("");
	anInt10811 += Class171_Sub4.method15603(string, 0, string.length(),
						aByteArray10810,
						anInt10811 * 31645619,
						116885893) * -1387468933;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) 0;
    }
    
    public void method16714(int i) {
	if (i < 64 && i >= -64)
	    method16506(i + 64, 1910517463);
	else if (i < 16384 && i >= -16384)
	    method16507(49152 + i, 1021245084);
	else
	    throw new IllegalArgumentException();
    }
    
    public void method16715(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (0 - i);
    }
    
    public void method16716(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (128 - i);
    }
    
    public void method16717(int i) {
	if (i >= 0 && i < 128)
	    method16506(i, 686588120);
	else if (i >= 0 && i < 32768)
	    method16507(32768 + i, 1558464395);
	else
	    throw new IllegalArgumentException();
    }
    
    public int method16718() {
	return ((aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		 - 128)
		& 0xff);
    }
    
    public int method16719() {
	anInt10811 += 1520029430;
	return (((aByteArray10810[anInt10811 * 31645619 - 1] & 0xff) << 8)
		+ (aByteArray10810[anInt10811 * 31645619 - 2] & 0xff));
    }
    
    public int method16720() {
	return ((128
		 - aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1])
		& 0xff);
    }
    
    public void method16721(int i, int i_188_) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
    }
    
    public void method16722(byte[] is, int i, int i_189_) {
	for (int i_190_ = i; i_190_ < i + i_189_; i_190_++)
	    is[i_190_]
		= aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1];
    }
    
    public int method16723() {
	return ((128
		 - aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1])
		& 0xff);
    }
    
    public void method16724(int i, byte i_191_) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
    }
    
    public int method16725() {
	anInt10811 += 1520029430;
	int i = ((aByteArray10810[anInt10811 * 31645619 - 2] - 128 & 0xff)
		 + ((aByteArray10810[31645619 * anInt10811 - 1] & 0xff) << 8));
	if (i > 32767)
	    i -= 65536;
	return i;
    }
    
    public void method16726(int[] is, int i, int i_192_) {
	int i_193_ = 31645619 * anInt10811;
	anInt10811 = i * -1387468933;
	int i_194_ = (i_192_ - i) / 8;
	for (int i_195_ = 0; i_195_ < i_194_; i_195_++) {
	    int i_196_ = method16533(-258848859);
	    int i_197_ = method16533(-258848859);
	    int i_198_ = -957401312;
	    int i_199_ = -1640531527;
	    int i_200_ = 32;
	    while (i_200_-- > 0) {
		i_197_ -= ((i_196_ << 4 ^ i_196_ >>> 5) + i_196_
			   ^ is[i_198_ >>> 11 & 0x3] + i_198_);
		i_198_ -= i_199_;
		i_196_ -= (i_197_ + (i_197_ << 4 ^ i_197_ >>> 5)
			   ^ is[i_198_ & 0x3] + i_198_);
	    }
	    anInt10811 -= 1785150424;
	    method16510(i_196_, -616213803);
	    method16510(i_197_, -514040557);
	}
	anInt10811 = -1387468933 * i_193_;
    }
    
    public byte method16727() {
	return (byte) (128 - (aByteArray10810
			      [(anInt10811 += -1387468933) * 31645619 - 1]));
    }
    
    public void method16728(long l) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 32);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 24);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) l;
    }
    
    public void method16729(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
    }
    
    public void method16730(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
    }
    
    public void method16731(int[] is) {
	int i = anInt10811 * 31645619 / 8;
	anInt10811 = 0;
	for (int i_201_ = 0; i_201_ < i; i_201_++) {
	    int i_202_ = method16533(-258848859);
	    int i_203_ = method16533(-258848859);
	    int i_204_ = -957401312;
	    int i_205_ = -1640531527;
	    int i_206_ = 32;
	    while (i_206_-- > 0) {
		i_203_ -= ((i_202_ << 4 ^ i_202_ >>> 5) + i_202_
			   ^ is[i_204_ >>> 11 & 0x3] + i_204_);
		i_204_ -= i_205_;
		i_202_ -= ((i_203_ << 4 ^ i_203_ >>> 5) + i_203_
			   ^ is[i_204_ & 0x3] + i_204_);
	    }
	    anInt10811 -= 1785150424;
	    method16510(i_202_, -84308703);
	    method16510(i_203_, -1112019836);
	}
    }
    
    public int method16732() {
	int i = 0;
	int i_207_ = 0;
	int i_208_;
	do {
	    i_208_ = method16527(-1161677133);
	    i |= (i_208_ & 0x7f) << i_207_;
	    i_207_ += 7;
	} while (i_208_ > 127);
	return i;
    }
    
    public void method16733(int i, int i_209_) {
	if (i < 0 || i > 65535)
	    throw new IllegalArgumentException();
	aByteArray10810[31645619 * anInt10811 - i - 2] = (byte) (i >> 8);
	aByteArray10810[31645619 * anInt10811 - i - 1] = (byte) i;
    }
    
    public int method16734() {
	anInt10811 += 1520029430;
	return (((aByteArray10810[anInt10811 * 31645619 - 1] & 0xff) << 8)
		+ (aByteArray10810[anInt10811 * 31645619 - 2] & 0xff));
    }
    
    public void method16735(byte[] is, int i, int i_210_, short i_211_) {
	for (int i_212_ = i; i_212_ < i + i_210_; i_212_++)
	    is[i_212_]
		= aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1];
    }
    
    public int method16736() {
	anInt10811 += 1520029430;
	return (((aByteArray10810[31645619 * anInt10811 - 2] & 0xff) << 8)
		+ (aByteArray10810[anInt10811 * 31645619 - 1] - 128 & 0xff));
    }
    
    public void method16737(long l) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 32);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 24);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) (l >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (int) l;
    }
    
    public String method16738() {
	int i = anInt10811 * 31645619;
	while (aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	       != 0) {
	    /* empty */
	}
	int i_213_ = 31645619 * anInt10811 - i - 1;
	if (0 == i_213_)
	    return "";
	return Class376.method6418(aByteArray10810, i, i_213_, -2022899290);
    }
    
    public int method16739() {
	anInt10811 += 1520029430;
	return ((aByteArray10810[anInt10811 * 31645619 - 2] - 128 & 0xff)
		+ ((aByteArray10810[anInt10811 * 31645619 - 1] & 0xff) << 8));
    }
    
    public int method16740() {
	anInt10811 += 1520029430;
	return ((aByteArray10810[anInt10811 * 31645619 - 2] - 128 & 0xff)
		+ ((aByteArray10810[anInt10811 * 31645619 - 1] & 0xff) << 8));
    }
    
    public int method16741() {
	anInt10811 += 1520029430;
	int i = ((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff)
		 + ((aByteArray10810[31645619 * anInt10811 - 1] & 0xff) << 8));
	if (i > 32767)
	    i -= 65536;
	return i;
    }
    
    public void method16742(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (128 + i);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
    }
    
    public int method16743() {
	anInt10811 += 1520029430;
	int i = ((aByteArray10810[anInt10811 * 31645619 - 2] - 128 & 0xff)
		 + ((aByteArray10810[31645619 * anInt10811 - 1] & 0xff) << 8));
	if (i > 32767)
	    i -= 65536;
	return i;
    }
    
    public void method16744() {
	if (null != aByteArray10810)
	    Class691.method14033(aByteArray10810, (short) -10434);
	aByteArray10810 = null;
    }
    
    public int method16745(int i) {
	return ((128
		 - aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1])
		& 0xff);
    }
    
    public void method16746(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
    }
    
    public int method16747() {
	anInt10811 += 132560497;
	return (((aByteArray10810[31645619 * anInt10811 - 2] & 0xff) << 16)
		+ ((aByteArray10810[anInt10811 * 31645619 - 3] & 0xff) << 8)
		+ (aByteArray10810[anInt10811 * 31645619 - 1] & 0xff));
    }
    
    public void method16748(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 24);
    }
    
    public void method16749(String string) {
	int i = string.indexOf('\0');
	if (i >= 0)
	    throw new IllegalArgumentException("");
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) 0;
	anInt10811 += Class171_Sub4.method15603(string, 0, string.length(),
						aByteArray10810,
						anInt10811 * 31645619,
						-1164557714) * -1387468933;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) 0;
    }
    
    public void method16750(byte[] is, int i, int i_214_) {
	for (int i_215_ = i; i_215_ < i + i_214_; i_215_++)
	    is[i_215_]
		= aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1];
    }
    
    public void method16751(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 24);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 16);
    }
    
    public void method16752(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 24);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
    }
    
    public void method16753(byte[] is, int i, int i_216_, int i_217_) {
	for (int i_218_ = i + i_216_ - 1; i_218_ >= i; i_218_--)
	    is[i_218_] = (byte) ((aByteArray10810
				  [(anInt10811 += -1387468933) * 31645619 - 1])
				 - 128);
    }
    
    public void method16754(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 24);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
    }
    
    public static int method16755(String string) {
	return string.length() + 1;
    }
    
    public void method16756(int[] is, int i, int i_219_, byte i_220_) {
	int i_221_ = 31645619 * anInt10811;
	anInt10811 = i * -1387468933;
	int i_222_ = (i_219_ - i) / 8;
	for (int i_223_ = 0; i_223_ < i_222_; i_223_++) {
	    int i_224_ = method16533(-258848859);
	    int i_225_ = method16533(-258848859);
	    int i_226_ = 0;
	    int i_227_ = -1640531527;
	    int i_228_ = 32;
	    while (i_228_-- > 0) {
		i_224_ += (i_225_ + (i_225_ << 4 ^ i_225_ >>> 5)
			   ^ i_226_ + is[i_226_ & 0x3]);
		i_226_ += i_227_;
		i_225_ += ((i_224_ << 4 ^ i_224_ >>> 5) + i_224_
			   ^ is[i_226_ >>> 11 & 0x3] + i_226_);
	    }
	    anInt10811 -= 1785150424;
	    method16510(i_224_, -1356904388);
	    method16510(i_225_, -718989485);
	}
	anInt10811 = -1387468933 * i_221_;
    }
    
    public int method16757() {
	anInt10811 += -1254908436;
	return ((aByteArray10810[anInt10811 * 31645619 - 3] & 0xff)
		+ (((aByteArray10810[31645619 * anInt10811 - 1] & 0xff) << 16)
		   + ((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff)
		      << 24)
		   + ((aByteArray10810[31645619 * anInt10811 - 4] & 0xff)
		      << 8)));
    }
    
    public int method16758() {
	anInt10811 += -1254908436;
	return ((aByteArray10810[anInt10811 * 31645619 - 3] & 0xff)
		+ (((aByteArray10810[31645619 * anInt10811 - 1] & 0xff) << 16)
		   + ((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff)
		      << 24)
		   + ((aByteArray10810[31645619 * anInt10811 - 4] & 0xff)
		      << 8)));
    }
    
    public void method16759(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 16);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
    }
    
    public int method16760() {
	int i = aByteArray10810[anInt10811 * 31645619] & 0xff;
	if (i < 128)
	    return method16527(-973177971) - 1;
	return method16529((byte) 1) - 32769;
    }
    
    public int method16761() {
	anInt10811 += -1254908436;
	return ((aByteArray10810[anInt10811 * 31645619 - 2] & 0xff)
		+ (((aByteArray10810[anInt10811 * 31645619 - 3] & 0xff) << 24)
		   + ((aByteArray10810[31645619 * anInt10811 - 4] & 0xff)
		      << 16)
		   + ((aByteArray10810[anInt10811 * 31645619 - 1] & 0xff)
		      << 8)));
    }
    
    public void method16762(byte[] is, int i, int i_229_) {
	for (int i_230_ = i + i_229_ - 1; i_230_ >= i; i_230_--)
	    is[i_230_] = (byte) ((aByteArray10810
				  [(anInt10811 += -1387468933) * 31645619 - 1])
				 - 128);
    }
    
    public void method16763(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1] = (byte) i;
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i >> 8);
    }
    
    static final void method16764(Class669 class669, int i) {
	Class103.method1920((Class654_Sub1) class669.anInterface62_8603,
			    class669, (byte) 24);
    }
}
