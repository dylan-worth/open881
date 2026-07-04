/* Class687 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class687
{
    static long[] aLongArray8709;
    static char[] aCharArray8710
	= { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
	    'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
	    'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    
    static String method13973(long l) {
	if (l <= 0L || l >= 6582952005840035281L)
	    return null;
	if (l % 37L == 0L)
	    return null;
	int i = 0;
	for (long l_0_ = l; 0L != l_0_; l_0_ /= 37L)
	    i++;
	StringBuilder stringbuilder = new StringBuilder(i);
	while (0L != l) {
	    long l_1_ = l;
	    l /= 37L;
	    char c = aCharArray8710[(int) (l_1_ - l * 37L)];
	    if (c == '_') {
		int i_2_ = stringbuilder.length() - 1;
		stringbuilder.setCharAt
		    (i_2_, Character.toUpperCase(stringbuilder.charAt(i_2_)));
		c = '\u00a0';
	    }
	    stringbuilder.append(c);
	}
	stringbuilder.reverse();
	stringbuilder
	    .setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
	return stringbuilder.toString();
    }
    
    static {
	aLongArray8709 = new long[12];
	for (int i = 0; i < aLongArray8709.length; i++)
	    aLongArray8709[i] = (long) Math.pow(37.0, (double) i);
    }
    
    static String method13974(long l) {
	if (l <= 0L || l >= 6582952005840035281L)
	    return null;
	if (l % 37L == 0L)
	    return null;
	int i = 0;
	for (long l_3_ = l; 0L != l_3_; l_3_ /= 37L)
	    i++;
	StringBuilder stringbuilder = new StringBuilder(i);
	while (0L != l) {
	    long l_4_ = l;
	    l /= 37L;
	    char c = aCharArray8710[(int) (l_4_ - l * 37L)];
	    if (c == '_') {
		int i_5_ = stringbuilder.length() - 1;
		stringbuilder.setCharAt
		    (i_5_, Character.toUpperCase(stringbuilder.charAt(i_5_)));
		c = '\u00a0';
	    }
	    stringbuilder.append(c);
	}
	stringbuilder.reverse();
	stringbuilder
	    .setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
	return stringbuilder.toString();
    }
    
    static long method13975(CharSequence charsequence) {
	long l = 0L;
	int i = charsequence.length();
	for (int i_6_ = 0; i_6_ < i; i_6_++) {
	    l *= 37L;
	    char c = charsequence.charAt(i_6_);
	    if (c >= 'A' && c <= 'Z')
		l += (long) ('\001' + c - 'A');
	    else if (c >= 'a' && c <= 'z')
		l += (long) ('\001' + c - 'a');
	    else if (c >= '0' && c <= '9')
		l += (long) (c + '\033' - '0');
	    if (l >= 177917621779460413L)
		break;
	}
	for (/**/; l % 37L == 0L && 0L != l; l /= 37L) {
	    /* empty */
	}
	return l;
    }
    
    static long method13976(CharSequence charsequence) {
	long l = 0L;
	int i = charsequence.length();
	for (int i_7_ = 0; i_7_ < i; i_7_++) {
	    l *= 37L;
	    char c = charsequence.charAt(i_7_);
	    if (c >= 'A' && c <= 'Z')
		l += (long) ('\001' + c - 'A');
	    else if (c >= 'a' && c <= 'z')
		l += (long) ('\001' + c - 'a');
	    else if (c >= '0' && c <= '9')
		l += (long) (c + '\033' - '0');
	    if (l >= 177917621779460413L)
		break;
	}
	for (/**/; l % 37L == 0L && 0L != l; l /= 37L) {
	    /* empty */
	}
	return l;
    }
    
    Class687() throws Throwable {
	throw new Error();
    }
    
    public static String method13977(CharSequence charsequence) {
	String string = Class556.method9396(Class666.method11019(charsequence,
								 2088438307));
	if (string == null)
	    string = "";
	return string;
    }
    
    public static String method13978(CharSequence charsequence) {
	String string = Class556.method9396(Class666.method11019(charsequence,
								 2088438307));
	if (string == null)
	    string = "";
	return string;
    }
    
    static final void method13979(Class669 class669, int i) {
	int i_8_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class15 class15
	    = (Class15) Class531.aClass44_Sub7_7135.method91(i_8_, 12204239);
	if (-667959667 * class15.anInt163 >= 0
	    && class15.anInt162 * 344178797 >= 0)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 344178797 * class15.anInt162;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= i_8_;
    }
    
    static final void method13980(Class669 class669, int i) {
	class669.anIntArray8595[class669.anInt8600 * 2088438307 - 1]
	    = (class669.aClass534_Sub26_8606.method16283(1730654827)
	       [class669.anIntArray8595[class669.anInt8600 * 2088438307 - 1]]);
    }
}
