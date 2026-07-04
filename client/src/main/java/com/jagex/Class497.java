/* Class497 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class497
{
    Class479 this$0;
    boolean aBool5548;
    int anInt5549;
    int anInt5550;
    Class534_Sub40 aClass534_Sub40_5551;
    
    void method8134(short i) {
	if (null != aClass534_Sub40_5551 && !aBool5548)
	    aClass534_Sub40_5551.method16538((byte) 39);
	anInt5549 = -572750523;
	anInt5550 = -1895045235;
    }
    
    void method8135() {
	if (null != aClass534_Sub40_5551 && !aBool5548)
	    aClass534_Sub40_5551.method16538((byte) 49);
	anInt5549 = -572750523;
	anInt5550 = -1895045235;
    }
    
    void method8136() {
	if (null != aClass534_Sub40_5551 && !aBool5548)
	    aClass534_Sub40_5551.method16538((byte) 100);
	anInt5549 = -572750523;
	anInt5550 = -1895045235;
    }
    
    Class497(Class479 class479, Class534_Sub40 class534_sub40, boolean bool) {
	this$0 = class479;
	aClass534_Sub40_5551 = class534_sub40;
	aBool5548 = bool;
	anInt5549 = -572750523;
	anInt5550 = -1895045235;
    }
    
    static final void method8137(Class247 class247, Class243 class243,
				 Class669 class669, short i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	int[] is = Class546.method8989(string, class669, -219410121);
	if (null != is)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2576
	    = Class99.method1859(string, class669, -1674488069);
	class247.anIntArray2577 = is;
	class247.aBool2561 = true;
    }
    
    static final void method8138(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_0_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_1_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class51.method1179(i_0_, i_1_, true, false, -1337285687);
    }
    
    static final void method8139(Class669 class669, int i) {
	if (Class703.anIntArray8823 == null
	    || 1404632205 * Class70.anInt743 >= Class703.anIntArray8823.length)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= ((Class703.anIntArray8823
		    [(Class70.anInt743 += 335750725) * 1404632205 - 1])
		   & 0xffff);
    }
    
    public static int method8140(int i, byte i_2_) {
	return i & 0xff;
    }
    
    public static Class475[] method8141(byte i) {
	return (new Class475[]
		{ Class475.aClass475_5176, Class475.aClass475_5177,
		  Class475.aClass475_5178 });
    }
    
    static final void method8142(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.anInt11227 * 423999123;
    }
}
