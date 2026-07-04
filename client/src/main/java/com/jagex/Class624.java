/* Class624 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class624
{
    public static final int anInt8150 = 6;
    
    Class624() throws Throwable {
	throw new Error();
    }
    
    static final void method10310(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	if (403396513 * class247.anInt2606 != -1)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -148110895 * class247.anInt2602;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
    
    static final void method10311(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	int i_0_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_1_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	class669.aClass395_8601.anIntArray4102[i_0_] = i_1_;
    }
    
    static final void method10312(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_2_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_3_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	Class666 class666;
	if (class669.aBool8615)
	    class666 = class669.aClass666_8592;
	else
	    class666 = class669.aClass666_8599;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (-1 != i_3_ && class666.method11012(i_2_, i_3_, -1967726013) ? 1
	       : 0);
    }
}
