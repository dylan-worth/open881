/* Class145_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class145_Sub2 extends Class145
{
    int[] anIntArray9797;
    int[] anIntArray9798;
    
    Class145_Sub2(int i, int i_0_, int[] is, int[] is_1_) {
	anIntArray9797 = is;
	anIntArray9798 = is_1_;
    }
    
    static final void method15496(Class669 class669, byte i)
	throws Exception_Sub6 {
	Class318 class318
	    = (Class318) (class669.aClass534_Sub18_Sub8_8614.anObjectArray11753
			  [class669.anInt8613 * 662605117]);
	Interface19 interface19
	    = ((Interface19)
	       (0 == class669.anIntArray8591[class669.anInt8613 * 662605117]
		? class669.aMap8607.get(class318.aClass150_3392.aClass453_1695)
		: class669.aMap8608
		      .get(class318.aClass150_3392.aClass453_1695)));
	try {
	    interface19.method122(class318,
				  class669.anIntArray8595[((class669.anInt8600
							    -= 308999563)
							   * 2088438307)],
				  (byte) 97);
	} catch (Exception_Sub6 exception_sub6) {
	    if (interface19 instanceof Class612)
		Class98.method1834(class669, Class515.aClass515_5736,
				   exception_sub6, "VO", -1152577469);
	    else
		throw exception_sub6;
	}
    }
    
    static final int method15497(int i, int i_2_) {
	return i < 7 ? 8 : 11;
    }
}
