/* Class521 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public class Class521
{
    Class544 this$0;
    public static Iterator anIterator7064;
    
    Class521(Class544 class544) {
	this$0 = class544;
    }
    
    public static int method8686(byte i) {
	return Class523.aTwitchTV7088.GetWebcamState();
    }
    
    static int method8687(int i, byte i_0_) {
	if (16711935 == i)
	    return -1;
	return Class466.method7583(i, 1447452631);
    }
    
    public static Class606_Sub1 method8688(int i, int i_1_) {
	if (!Class619.aBool8106 || i < 206492647 * Class619.anInt8108
	    || i > Class619.anInt8109 * -1664594981)
	    return null;
	return (Class619.aClass606_Sub1Array8107
		[i - Class619.anInt8108 * 206492647]);
    }
    
    static final void method8689(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class60.method1255(class247, class243, class669, -124082767);
    }
    
    static final void method8690(Class669 class669, byte i) {
	int i_2_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (Class713.aBool8884) {
	    Class6[] class6s = Class264.method4841((byte) -43);
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= class6s[i_2_].anInt52 * -1991181227;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= class6s[i_2_].anInt53 * -778390023;
	} else {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	}
    }
    
    static final void method8691(Class669 class669, int i) {
	int i_3_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_3_, 716640738);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_3_ >> 16];
	Class118.method2132(class247, class243, class669, -54290510);
    }
    
    static int method8692(int i) {
	return 13;
    }
}
