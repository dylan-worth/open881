/* Class437 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class437 implements Interface5
{
    int anInt4858;
    Class472 aClass472_4859;
    static long aLong4860;
    
    public int method56(int i) {
	if (aClass472_4859.method7681(anInt4858 * -1124309553, 2144019812))
	    return 100;
	return aClass472_4859.method7684(anInt4858 * -1124309553, (short) 920);
    }
    
    public Class30 method57() {
	return Class30.aClass30_270;
    }
    
    public Class30 method51(int i) {
	return Class30.aClass30_270;
    }
    
    public int method52() {
	if (aClass472_4859.method7681(anInt4858 * -1124309553, 1329627369))
	    return 100;
	return aClass472_4859.method7684(anInt4858 * -1124309553, (short) 920);
    }
    
    public int method22() {
	if (aClass472_4859.method7681(anInt4858 * -1124309553, -1693417371))
	    return 100;
	return aClass472_4859.method7684(anInt4858 * -1124309553, (short) 920);
    }
    
    public int method53() {
	if (aClass472_4859.method7681(anInt4858 * -1124309553, 1002349864))
	    return 100;
	return aClass472_4859.method7684(anInt4858 * -1124309553, (short) 920);
    }
    
    public Class30 method55() {
	return Class30.aClass30_270;
    }
    
    public Class30 method50() {
	return Class30.aClass30_270;
    }
    
    public Class30 method54() {
	return Class30.aClass30_270;
    }
    
    Class437(Class472 class472, int i) {
	aClass472_4859 = class472;
	anInt4858 = i * -287014609;
    }
    
    static final int method6986(int i, int i_0_, int i_1_, int i_2_) {
	if (i == i_0_)
	    return i;
	int i_3_ = 128 - i_1_;
	int i_4_ = i_3_ * (i & 0x7f) + (i_0_ & 0x7f) * i_1_ >> 7;
	int i_5_ = (i & 0x380) * i_3_ + (i_0_ & 0x380) * i_1_ >> 7;
	int i_6_ = i_3_ * (i & 0xfc00) + (i_0_ & 0xfc00) * i_1_ >> 7;
	return i_6_ & 0xfc00 | i_5_ & 0x380 | i_4_ & 0x7f;
    }
    
    static final void method6987(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_7_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_8_
	    = class669.anIntArray8595[1 + 2088438307 * class669.anInt8600];
	Class273.method5102(5, i_7_, i_8_, "", (byte) -52);
    }
    
    static void method6988(Class446 class446, Class433 class433, int i,
			   int i_9_, short i_10_) {
	if (Class72.aClass433_762 == null)
	    Class72.aClass433_762 = new Class433(class433);
	else
	    Class72.aClass433_762.method6842(class433);
	Class72.aClass446_783.method7236(class446);
	Class72.anInt779 = 1658436649 * i;
	Class72.anInt780 = -1631970627 * i_9_;
    }
    
    static void method6989(int i) {
	if (Class665.aClass665_8559 != client.aClass665_11211)
	    Class403.aClass403_4140.method6601(421734097);
    }
    
    static final void method6990(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	IcmpService_Sub1.method17016(class247, class669, (byte) -92);
    }
}
