/* Class675 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class675
{
    public static Class675 aClass675_8634
	= new Class675("runescape", "RuneScape", 0, Class76.aClass76_810);
    public static Class675 aClass675_8635
	= new Class675("stellardawn", "Stellar Dawn", 1, Class76.aClass76_806);
    static Class675 aClass675_8636
	= new Class675("game3", "Game 3", 2, Class76.aClass76_810);
    static Class675 aClass675_8637
	= new Class675("game4", "Game 4", 3, Class76.aClass76_809);
    static Class675 aClass675_8638
	= new Class675("game5", "Game 5", 4, Class76.aClass76_807);
    static Class675 aClass675_8639
	= new Class675("oldscape", "RuneScape 2007", 5, Class76.aClass76_810);
    public String aString8640;
    public String aString8641;
    public int anInt8642;
    
    public static Class675 method11122(int i) {
	Class675[] class675s = Class536_Sub5.method16006((byte) -16);
	for (int i_0_ = 0; i_0_ < class675s.length; i_0_++) {
	    Class675 class675 = class675s[i_0_];
	    if (-1082924039 * class675.anInt8642 == i)
		return class675;
	}
	return null;
    }
    
    static Class675[] method11123() {
	return (new Class675[]
		{ aClass675_8639, aClass675_8636, aClass675_8635,
		  aClass675_8638, aClass675_8637, aClass675_8634 });
    }
    
    public static Class675 method11124(int i) {
	Class675[] class675s = Class536_Sub5.method16006((byte) -43);
	for (int i_1_ = 0; i_1_ < class675s.length; i_1_++) {
	    Class675 class675 = class675s[i_1_];
	    if (-1082924039 * class675.anInt8642 == i)
		return class675;
	}
	return null;
    }
    
    Class675(String string, String string_2_, int i, Class76 class76) {
	aString8640 = string;
	aString8641 = string_2_;
	anInt8642 = i * 230125129;
    }
    
    static final void method11125(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 0;
    }
    
    static final void method11126(Class247 class247, Class243 class243,
				  Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	class247.anInt2480
	    = (class669.anIntArray8595[2088438307 * class669.anInt8600]
	       * -468308361);
	class247.anInt2481
	    = (class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1]
	       * -599876415);
	Class454.method7416(class247, -1487167349);
	if (0 == class247.anInt2438 * -1960530827)
	    Class606.method10054(class243, class247, false, 1495249956);
    }
    
    public static Class397[] method11127(int i) {
	return (new Class397[]
		{ Class397.aClass397_4112, Class397.aClass397_4109,
		  Class397.aClass397_4110, Class397.aClass397_4111,
		  Class397.aClass397_4108, Class397.aClass397_4113,
		  Class397.aClass397_4114, Class397.aClass397_4116,
		  Class397.aClass397_4115, Class397.aClass397_4117,
		  Class397.aClass397_4118 });
    }
    
    static final void method11128(Class669 class669, byte i) {
	int i_3_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_3_, 2026852790);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 1943720095 * class247.anInt2484;
    }
    
    static final void method11129(Class247 class247, Class243 class243,
				  Class669 class669, int i) {
	class247.aBool2494
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) == 1;
	Class454.method7416(class247, -1952595431);
    }
}
