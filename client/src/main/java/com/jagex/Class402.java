/* Class402 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class402 implements Interface45
{
    Class203 aClass203_4137 = new Class203(64);
    Class472 aClass472_4138;
    
    public Class383 method343(int i) {
	Class383 class383 = (Class383) aClass203_4137.method3871((long) i);
	if (null != class383)
	    return class383;
	byte[] is = aClass472_4138.method7743(0, i, -2002024165);
	class383 = new Class383();
	if (is != null)
	    class383.method6451(new Class534_Sub40(is), i, -1192425058);
	aClass203_4137.method3893(class383, (long) i);
	return class383;
    }
    
    public Class383 method344(int i, int i_0_) {
	Class383 class383 = (Class383) aClass203_4137.method3871((long) i);
	if (null != class383)
	    return class383;
	byte[] is = aClass472_4138.method7743(0, i, -1453337422);
	class383 = new Class383();
	if (is != null)
	    class383.method6451(new Class534_Sub40(is), i, -1685846622);
	aClass203_4137.method3893(class383, (long) i);
	return class383;
    }
    
    public Class402(Class472 class472) {
	aClass472_4138 = class472;
    }
    
    static final void method6593(Class669 class669, boolean bool,
				 boolean bool_1_, int i) {
	int i_2_ = class669.anIntArray8591[class669.anInt8613 * 662605117];
	int i_3_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (i_3_ < 0 || i_3_ >= class669.anIntArray8589[i_2_])
	    throw new RuntimeException();
	if (!bool)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= class669.anIntArrayArray8590[i_2_][i_3_];
	else if (bool_1_) {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= class669.anIntArrayArray8590[i_2_][i_3_];
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= i_3_;
	} else {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= i_3_;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= class669.anIntArrayArray8590[i_2_][i_3_];
	}
    }
    
    static final void method6594(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class460.method7509(class247, class669, (byte) 10);
    }
    
    public static int method6595(int i, int i_4_) {
	i = (i >>> 1 & 0x55555555) + (i & 0x55555555);
	i = (i & 0x33333333) + (i >>> 2 & 0x33333333);
	i = i + (i >>> 4) & 0xf0f0f0f;
	i += i >>> 8;
	i += i >>> 16;
	return i & 0xff;
    }
}
