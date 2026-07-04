/* Class170 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class170
{
    static short aShort1793;
    
    Class170() {
	/* empty */
    }
    
    static final void method2822(Class669 class669, int i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_0_, -11759210);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_0_ >> 16];
	Class171.method2882(class247, class243, class669, -271914077);
    }
    
    static final void method2823(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	int i_1_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_2_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	if (!Class303.method5577(string.charAt(0), (byte) 54))
	    throw new RuntimeException();
	if (string.isEmpty() || string.length() > 10)
	    throw new RuntimeException();
	if (!Class172.aClass268_1824.method4878(string, i_1_, i_2_,
						-1610598983))
	    throw new RuntimeException();
    }
    
    public static void method2824(int i, int i_3_, int i_4_) {
	Class554_Sub1.anInt10672 = (i - Class554_Sub1.anInt7368) * -1421361991;
	Class554_Sub1.anInt10673
	    = 2017528667 * (i_3_ - Class554_Sub1.anInt7369);
    }
    
    static final void method2825(Class247 class247, Class243 class243,
				 Class669 class669, byte i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (Class546.method8989(string, class669, -219410121) != null)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2584
	    = Class99.method1859(string, class669, 1924931798);
	class247.aBool2561 = true;
    }
    
    static int method2826(byte i) {
	return (Class274.anInt3035 += -1583824911) * 304107793 - 1;
    }
}
