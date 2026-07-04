/* Class321 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;
import java.awt.Dimension;

public class Class321 implements Interface6
{
    Class472 aClass472_3412;
    
    public Class method59(short i) {
	return com.jagex.Class330.class;
    }
    
    public Class method61() {
	return com.jagex.Class330.class;
    }
    
    public Interface13 method62(int i, Interface14 interface14) {
	return new Class330(i, aClass472_3412);
    }
    
    public Interface13 method64(int i, Interface14 interface14) {
	return new Class330(i, aClass472_3412);
    }
    
    public Interface13 method60(int i, Interface14 interface14) {
	return new Class330(i, aClass472_3412);
    }
    
    Class321(Class472 class472) {
	aClass472_3412 = class472;
    }
    
    public Interface13 method63(int i, Interface14 interface14) {
	return new Class330(i, aClass472_3412);
    }
    
    public Interface13 method58(int i, Interface14 interface14, byte i_0_) {
	return new Class330(i, aClass472_3412);
    }
    
    static final void method5772(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class534_Sub11.method16133(class247, class243, class669, (short) 287);
    }
    
    static final void method5773(Class669 class669, byte i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	class669.anInt8600 -= 617999126;
	int i_1_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_2_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = string.indexOf(i_1_, i_2_);
    }
    
    public static void method5774(byte i) {
	if (-1664252895 * Class5.aClass23_43.anInt227 != -1)
	    Class312_Sub1_Sub1.method18102
		(-1664252895 * Class5.aClass23_43.anInt227,
		 Class5.aClass23_43.aString223,
		 Class5.aClass23_43.anInt222 * 606493275,
		 1001670253 * Class5.aClass23_43.anInt225, (byte) -64);
    }
    
    static final void method5775(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	class247.anInt2498 = -485232977 * (class669.anIntArray8595
					   [class669.anInt8600 * 2088438307]);
	class247.anInt2464
	    = (class669.anIntArray8595[2088438307 * class669.anInt8600 + 1]
	       * -730624423);
	Class454.method7416(class247, -646180774);
	Class519.method8649(class243, class247, 547735232);
	if (-1960530827 * class247.anInt2438 == 0)
	    Class606.method10054(class243, class247, false, -1055243607);
    }
    
    static final void method5776(Class247 class247, Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_3_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600] - 1;
	int i_4_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	if (i_3_ < 0 || i_3_ > 9)
	    throw new RuntimeException();
	Class568.method9569(class247, i_3_, i_4_, class669, -80543115);
    }
    
    public static Class185 method5777
	(int i, Canvas canvas, Class177 class177, Interface25 interface25,
	 Interface45 interface45, Interface48 interface48,
	 Interface46 interface46, Class472 class472, int i_5_, int i_6_) {
	int i_7_ = 0;
	int i_8_ = 0;
	if (canvas != null) {
	    Dimension dimension = canvas.getSize();
	    i_7_ = dimension.width;
	    i_8_ = dimension.height;
	}
	return Class185.method3547(i, canvas, class177, interface25,
				   interface45, interface48, interface46,
				   class472, i_5_, i_7_, i_8_, 781716330);
    }
}
