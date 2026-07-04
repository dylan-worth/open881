/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Point;

public class Class76 implements Interface76
{
    static Class76 aClass76_803;
    int anInt804;
    static Class76 aClass76_805;
    public static Class76 aClass76_806;
    public static Class76 aClass76_807;
    static Class76 aClass76_808;
    public static Class76 aClass76_809;
    public static Class76 aClass76_810 = new Class76(2, 0, "", "");
    public static Class76 aClass76_811;
    static Class76 aClass76_812;
    int anInt813;
    String aString814;
    
    public String toString() {
	return aString814;
    }
    
    Class76(int i, int i_0_, String string, String string_1_, boolean bool,
	    Class76[] class76s) {
	anInt813 = i * -864842895;
	anInt804 = 425623215 * i_0_;
	aString814 = string_1_;
    }
    
    public int method93() {
	return -1995335601 * anInt804;
    }
    
    Class76(int i, int i_2_, String string, String string_3_) {
	anInt813 = i * -864842895;
	anInt804 = 425623215 * i_2_;
	aString814 = string_3_;
    }
    
    static {
	aClass76_803 = new Class76(1, 1, "", "");
	aClass76_805 = new Class76(5, 2, "", "");
	aClass76_806 = new Class76(6, 3, "", "");
	aClass76_812 = new Class76(8, 4, "", "");
	aClass76_809 = new Class76(7, 5, "", "");
	aClass76_807 = new Class76(4, 6, "", "");
	aClass76_808 = new Class76(3, 7, "", "");
	aClass76_811 = new Class76(0, -1, "", "", true,
				   new Class76[] { aClass76_810, aClass76_803,
						   aClass76_805, aClass76_812,
						   aClass76_806 });
    }
    
    public int method22() {
	return -1995335601 * anInt804;
    }
    
    public int method53() {
	return -1995335601 * anInt804;
    }
    
    public String method1589() {
	return aString814;
    }
    
    public String method1590() {
	return aString814;
    }
    
    static final void method1591(Class247 class247, Class669 class669, int i) {
	Class16 class16
	    = class247.method4518(Class351.aClass406_3620,
				  client.anInterface52_11081, 881628255);
	int i_4_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Point point
	    = class16.method736(class247.aString2533,
				class247.anInt2468 * -881188269,
				-1959194819 * class247.anInt2528, i_4_,
				Class658.aClass163Array8541, 746253234);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = point.x;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = point.y;
    }
}
