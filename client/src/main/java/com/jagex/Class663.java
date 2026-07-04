/* Class663 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class663
{
    Class663() throws Throwable {
	throw new Error();
    }
    
    public static int method10995(CharSequence charsequence) {
	int i = charsequence.length();
	int i_0_ = 0;
	for (int i_1_ = 0; i_1_ < i; i_1_++) {
	    char c = charsequence.charAt(i_1_);
	    if (c <= '\u007f')
		i_0_++;
	    else if (c <= '\u07ff')
		i_0_ += 2;
	    else
		i_0_ += 3;
	}
	return i_0_;
    }
    
    static final void method10996(Class247 class247, Class243 class243,
				  Class669 class669, int i) {
	class247.anInt2496 = -1070830455;
	class247.anInt2497 = 2118781167 * client.anInt11037;
	class247.anInt2550 = 0;
	if (-1 == 1365669833 * class247.anInt2580 && !class243.aBool2413)
	    Class626.method10366(-1278450723 * class247.anInt2454, 2045314402);
    }
    
    public static void method10997(int i) {
	synchronized (Class631.aClass203_8220) {
	    Class631.aClass203_8220.method3877(580253663);
	}
	synchronized (Class631.aClass203_8221) {
	    Class631.aClass203_8221.method3877(-1671444083);
	}
    }
}
