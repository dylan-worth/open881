/* Exception_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Exception_Sub4 extends Exception
{
    public Exception_Sub4(String string) {
	super(string);
    }
    
    static final void method17944(Class669 class669, int i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class666 class666;
	if (class669.aBool8615)
	    class666 = class669.aClass666_8592;
	else
	    class666 = class669.aClass666_8599;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class666.method11012(i_0_, -1, -2076624106) ? 1 : 0;
    }
    
    static final void method17945(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 286863169 * Class473.anInt5174;
    }
}
