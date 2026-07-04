/* Class676 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class676 implements Interface76
{
    public static final int anInt8643 = 4;
    public static Class676 aClass676_8644;
    public int anInt8645;
    public static Class676 aClass676_8646 = new Class676(0, (byte) -1);
    public static Class676 aClass676_8647;
    public byte aByte8648;
    public static Class676 aClass676_8649;
    public static Class676 aClass676_8650;
    public static int anInt8651;
    
    Class676(int i, byte i_0_) {
	anInt8645 = 630869325 * i;
	aByte8648 = i_0_;
    }
    
    public int method53() {
	return aByte8648;
    }
    
    public static Class676[] method11130(byte i) {
	return new Class676[] { aClass676_8646, aClass676_8644, aClass676_8649,
				aClass676_8650, aClass676_8647 };
    }
    
    public int method11131(byte i) {
	return 1 + aByte8648;
    }
    
    static {
	aClass676_8644 = new Class676(1, (byte) 0);
	aClass676_8649 = new Class676(2, (byte) 1);
	aClass676_8650 = new Class676(3, (byte) 2);
	aClass676_8647 = new Class676(4, (byte) 3);
    }
    
    public int method22() {
	return aByte8648;
    }
    
    public int method11132() {
	return 1 + aByte8648;
    }
    
    public static Class676[] method11133() {
	return new Class676[] { aClass676_8646, aClass676_8644, aClass676_8649,
				aClass676_8650, aClass676_8647 };
    }
    
    public int method93() {
	return aByte8648;
    }
    
    static final void method11134(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_1_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_2_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class19.method798(i_1_, i_2_, false, (byte) -66);
    }
}
