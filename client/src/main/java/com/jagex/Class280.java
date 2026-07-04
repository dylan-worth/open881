/* Class280 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class280 implements Interface76
{
    static Class280 aClass280_3054;
    public static Class280 aClass280_3055 = new Class280(1, 0);
    public static Class280 aClass280_3056 = new Class280(2, 1);
    public int anInt3057;
    int anInt3058;
    public static int anInt3059;
    
    static Class280[] method5229() {
	return (new Class280[]
		{ aClass280_3054, aClass280_3055, aClass280_3056 });
    }
    
    public int method93() {
	return anInt3058 * 645205957;
    }
    
    Class280(int i, int i_0_) {
	anInt3057 = i * -110775443;
	anInt3058 = i_0_ * -741501171;
    }
    
    static {
	aClass280_3054 = new Class280(0, 2);
    }
    
    public int method53() {
	return anInt3058 * 645205957;
    }
    
    public int method22() {
	return anInt3058 * 645205957;
    }
    
    static Class280[] method5230() {
	return (new Class280[]
		{ aClass280_3054, aClass280_3055, aClass280_3056 });
    }
    
    static final void method5231(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class685.aClass23_8698.anInt227 * -1664252895;
    }
    
    static final void method5232(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	class669.anInt8600 -= 617999126;
	int i_1_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_2_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	Class90 class90 = (Class90) Class534_Sub11_Sub13
					.aClass44_Sub22_11730
					.method91(i_1_, 1523900537);
	if (i_2_ != 263946597 * class90.anInt888)
	    class247.method4567(i_1_, i_2_, (byte) -15);
	else
	    class247.method4549(i_1_, 2006067238);
    }
    
    static void method5233(Class704 class704, int i) {
	Class44_Sub20.aClass704_11014 = class704;
    }
    
    public static boolean method5234(int i) {
	if (Class503.aString5626.startsWith("win"))
	    return true;
	return false;
    }
}
