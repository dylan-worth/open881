/* Class202 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class202
{
    static Class202 aClass202_2189;
    static Class202 aClass202_2190 = new Class202();
    static Class202 aClass202_2191 = new Class202();
    static int anInt2192;
    
    Class202() {
	/* empty */
    }
    
    static {
	aClass202_2189 = new Class202();
    }
    
    public static final boolean method3865(byte i) {
	return 2 != 1114067909 * Class65.anInt692;
    }
    
    static final void method3866(Class669 class669, byte i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_0_, 555631408);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_0_ >> 16];
	Class410.method6711(class247, class243, class669, (byte) 89);
    }
    
    static final void method3867(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	int i_1_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_2_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	if (i_1_ >= 0 && i_1_ < 2)
	    client.anIntArrayArrayArray11151[i_1_] = new int[i_2_ << 1][4];
    }
    
    static final void method3868(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	client.aShort11313
	    = (short) class669.anIntArray8595[class669.anInt8600 * 2088438307];
	if (client.aShort11313 <= 0)
	    client.aShort11313 = (short) 256;
	client.aShort11314 = (short) (class669.anIntArray8595
				      [1 + class669.anInt8600 * 2088438307]);
	if (client.aShort11314 <= 0)
	    client.aShort11314 = (short) 320;
    }
}
