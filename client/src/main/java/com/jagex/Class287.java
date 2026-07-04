/* Class287 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class287
{
    public int anInt3081;
    public int anInt3082;
    public int anInt3083;
    static Class16 aClass16_3084;
    
    static final void method5268(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_0_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_1_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_0_ > i_1_ ? i_0_ : i_1_;
    }
    
    static char method5269(char c, int i) {
	if (c == '\u00c6')
	    return 'E';
	if ('\u00e6' == c)
	    return 'e';
	if ('\u00df' == c)
	    return 's';
	if ('\u0152' == c)
	    return 'E';
	if ('\u0153' == c)
	    return 'e';
	return '\0';
    }
    
    static final void method5270(Class669 class669, int i) {
	int i_2_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (2 == client.anInt11171 * -1050164879
	    && i_2_ < -1979292205 * client.anInt11324)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= client.aClass28Array11327[i_2_].anInt251 * -721928209;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
    
    static final void method5271(Class669 class669, int i) {
	Class307.method5649(Class554_Sub1.anInt10669 * 895091827, 1911546269);
    }
}
