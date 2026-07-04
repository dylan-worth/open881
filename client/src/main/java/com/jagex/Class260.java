/* Class260 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class260 implements Interface76
{
    static Class260 aClass260_2784;
    int anInt2785;
    static Class260 aClass260_2786;
    static Class260 aClass260_2787 = new Class260(2, 0);
    int anInt2788;
    static Class260 aClass260_2789;
    
    public int method93() {
	return anInt2785 * 2105085231;
    }
    
    Class260(int i, int i_0_) {
	anInt2788 = i * -440668325;
	anInt2785 = -1429775921 * i_0_;
    }
    
    static Class260[] method4802(int i) {
	return new Class260[] { aClass260_2784, aClass260_2789, aClass260_2787,
				aClass260_2786 };
    }
    
    public int method22() {
	return anInt2785 * 2105085231;
    }
    
    public int method53() {
	return anInt2785 * 2105085231;
    }
    
    static {
	aClass260_2784 = new Class260(0, 1);
	aClass260_2786 = new Class260(3, 2);
	aClass260_2789 = new Class260(1, 3);
    }
    
    static Class260[] method4803() {
	return new Class260[] { aClass260_2784, aClass260_2789, aClass260_2787,
				aClass260_2786 };
    }
    
    static Class260[] method4804() {
	return new Class260[] { aClass260_2784, aClass260_2789, aClass260_2787,
				aClass260_2786 };
    }
    
    static boolean method4805(int i, int i_1_, int i_2_) {
	if (i_1_ >= 1000 && i < 1000)
	    return true;
	if (i_1_ < 1000 && i < 1000) {
	    if (Class255.method4651(i, 16777472))
		return true;
	    if (Class255.method4651(i_1_, 16777472))
		return false;
	    return true;
	}
	if (i_1_ >= 1000 && i >= 1000)
	    return true;
	return false;
    }
    
    static boolean method4806(int i, int i_3_, int i_4_, int i_5_) {
	Class556 class556 = client.aClass512_11100.method8424((byte) 72);
	boolean bool = true;
	Interface62 interface62
	    = (Interface62) class556.method9258(i, i_3_, i_4_, (byte) -103);
	if (null != interface62)
	    bool &= Class429.method6813(interface62, 727802693);
	interface62
	    = (Interface62) class556.method9262(i, i_3_, i_4_,
						client.anInterface64_11333,
						(byte) 15);
	if (interface62 != null)
	    bool &= Class429.method6813(interface62, 1168211939);
	interface62
	    = (Interface62) class556.method9264(i, i_3_, i_4_, (byte) 48);
	if (null != interface62)
	    bool &= Class429.method6813(interface62, 2003729005);
	return bool;
    }
    
    static final void method4807(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class534_Sub20.method16195(class247, class243, true, 2, class669,
				   -1125496385);
    }
    
    static final void method4808(Class669 class669, int i) {
	if (null != Class162.aClass352_1758) {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 1;
	    class669.aClass352_8602 = Class162.aClass352_1758;
	    class669.aMap8607.put(Class453.aClass453_4954,
				  Class175.method2924(class669.aClass352_8602,
						      -2106882359));
	} else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
    
    static final void method4809(Class669 class669, int i) {
	class669.anIntArray8595[class669.anInt8600 * 2088438307 - 1]
	    = Class402.method6595((class669.anIntArray8595
				   [class669.anInt8600 * 2088438307 - 1]),
				  -1269629064);
    }
    
    static final void method4810(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class618.anInt8102 * 1332349073;
    }
    
    static final void method4811(Class669 class669, int i) {
	int i_6_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aClass219_11338.method4134(i_6_, (byte) -112);
    }
    
    public static long method4812(int i, byte i_7_) {
	return 86400000L * (long) (i + 11745);
    }
    
    static final void method4813(boolean bool, short i) {
	Class515.method8590(-993629849 * client.anInt11185,
			    1771907305 * Class706_Sub4.anInt10994,
			    Class18.anInt205 * -1091172141, bool, -1716896679);
    }
}
