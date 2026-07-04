/* Class387 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class387 implements Interface46
{
    Class472 aClass472_4048;
    Class203 aClass203_4049 = new Class203(64);
    static int anInt4050;
    
    public Class384 method346(int i) {
	Class384 class384 = (Class384) aClass203_4049.method3871((long) i);
	if (null != class384)
	    return class384;
	byte[] is = aClass472_4048.method7743(1, i, -763139024);
	class384 = new Class384();
	class384.anInt3966 = i * 297771901;
	if (is != null)
	    class384.method6463(new Class534_Sub40(is), 1607537293);
	class384.method6468((byte) 103);
	aClass203_4049.method3893(class384, (long) i);
	return class384;
    }
    
    public Class387(Class472 class472) {
	aClass472_4048 = class472;
    }
    
    public void method6499() {
	aClass203_4049.method3877(-1309561134);
    }
    
    public void method6500(int i) {
	aClass203_4049.method3877(1809489289);
    }
    
    public Class384 method347(int i) {
	Class384 class384 = (Class384) aClass203_4049.method3871((long) i);
	if (null != class384)
	    return class384;
	byte[] is = aClass472_4048.method7743(1, i, -894174079);
	class384 = new Class384();
	class384.anInt3966 = i * 297771901;
	if (is != null)
	    class384.method6463(new Class534_Sub40(is), 582868074);
	class384.method6468((byte) 116);
	aClass203_4049.method3893(class384, (long) i);
	return class384;
    }
    
    public Class384 method345(int i, int i_0_) {
	Class384 class384 = (Class384) aClass203_4049.method3871((long) i);
	if (null != class384)
	    return class384;
	byte[] is = aClass472_4048.method7743(1, i, -1326603029);
	class384 = new Class384();
	class384.anInt3966 = i * 297771901;
	if (is != null)
	    class384.method6463(new Class534_Sub40(is), 338103906);
	class384.method6468((byte) 85);
	aClass203_4049.method3893(class384, (long) i);
	return class384;
    }
    
    static final void method6501(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_1_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	float f = Class427.method6799(class669.anIntArray8595
				      [2088438307 * class669.anInt8600 + 1]);
	Class534_Sub18_Sub13 class534_sub18_sub13
	    = Class599.aClass298_Sub1_7871.method5375(i_1_, 1712138548);
	if (null == class534_sub18_sub13)
	    throw new RuntimeException("");
	if (!(class534_sub18_sub13 instanceof Class534_Sub18_Sub13_Sub1))
	    throw new RuntimeException("");
	((Class534_Sub18_Sub13_Sub1) class534_sub18_sub13)
	    .method18668(f, 1825307785);
    }
    
    static final void method6502(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class171_Sub1.method15495(665236578);
    }
    
    public static byte[] method6503(CharSequence charsequence, int i) {
	int i_2_ = charsequence.length();
	byte[] is = new byte[i_2_];
	for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
	    char c = charsequence.charAt(i_3_);
	    if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
		is[i_3_] = (byte) c;
	    else if (c == '\u20ac')
		is[i_3_] = (byte) -128;
	    else if ('\u201a' == c)
		is[i_3_] = (byte) -126;
	    else if ('\u0192' == c)
		is[i_3_] = (byte) -125;
	    else if (c == '\u201e')
		is[i_3_] = (byte) -124;
	    else if ('\u2026' == c)
		is[i_3_] = (byte) -123;
	    else if (c == '\u2020')
		is[i_3_] = (byte) -122;
	    else if ('\u2021' == c)
		is[i_3_] = (byte) -121;
	    else if ('\u02c6' == c)
		is[i_3_] = (byte) -120;
	    else if ('\u2030' == c)
		is[i_3_] = (byte) -119;
	    else if (c == '\u0160')
		is[i_3_] = (byte) -118;
	    else if (c == '\u2039')
		is[i_3_] = (byte) -117;
	    else if (c == '\u0152')
		is[i_3_] = (byte) -116;
	    else if ('\u017d' == c)
		is[i_3_] = (byte) -114;
	    else if (c == '\u2018')
		is[i_3_] = (byte) -111;
	    else if (c == '\u2019')
		is[i_3_] = (byte) -110;
	    else if ('\u201c' == c)
		is[i_3_] = (byte) -109;
	    else if (c == '\u201d')
		is[i_3_] = (byte) -108;
	    else if ('\u2022' == c)
		is[i_3_] = (byte) -107;
	    else if ('\u2013' == c)
		is[i_3_] = (byte) -106;
	    else if ('\u2014' == c)
		is[i_3_] = (byte) -105;
	    else if (c == '\u02dc')
		is[i_3_] = (byte) -104;
	    else if (c == '\u2122')
		is[i_3_] = (byte) -103;
	    else if ('\u0161' == c)
		is[i_3_] = (byte) -102;
	    else if (c == '\u203a')
		is[i_3_] = (byte) -101;
	    else if ('\u0153' == c)
		is[i_3_] = (byte) -100;
	    else if (c == '\u017e')
		is[i_3_] = (byte) -98;
	    else if ('\u0178' == c)
		is[i_3_] = (byte) -97;
	    else
		is[i_3_] = (byte) 63;
	}
	return is;
    }
    
    public static String[] method6504(String string, char c, int i) {
	int i_4_ = Class399.method6581(string, c, 275613890);
	String[] strings = new String[1 + i_4_];
	int i_5_ = 0;
	int i_6_ = 0;
	for (int i_7_ = 0; i_7_ < i_4_; i_7_++) {
	    int i_8_;
	    for (i_8_ = i_6_; string.charAt(i_8_) != c; i_8_++) {
		/* empty */
	    }
	    strings[i_5_++] = string.substring(i_6_, i_8_);
	    i_6_ = 1 + i_8_;
	}
	strings[i_4_] = string.substring(i_6_);
	return strings;
    }
    
    static String method6505(Class247 class247, int i, int i_9_) {
	if (!client.method17392(class247).method16264(i, (byte) -114)
	    && class247.anObjectArray2619 == null)
	    return null;
	if (null == class247.aStringArray2487
	    || class247.aStringArray2487.length <= i
	    || null == class247.aStringArray2487[i]
	    || class247.aStringArray2487[i].trim().length() == 0) {
	    if (client.aBool11087)
		return new StringBuilder().append("Hidden-").append(i)
			   .toString();
	    return null;
	}
	return class247.aStringArray2487[i];
    }
}
