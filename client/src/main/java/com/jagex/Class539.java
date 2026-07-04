/* Class539 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class539
{
    Class544 this$0;
    Class332[] aClass332Array7169;
    Class332[] aClass332Array7170;
    public static Class672 aClass672_7171;
    
    Class539(Class544 class544) {
	this$0 = class544;
	aClass332Array7170 = new Class332[16];
	aClass332Array7169 = new Class332[16];
	new Class332(8);
	for (int i = 0; i < 16; i++) {
	    aClass332Array7170[i] = new Class332(3);
	    aClass332Array7169[i] = new Class332(3);
	}
    }
    
    static final void method8925(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class562.method9469(class247, class243, class669, -1441612197);
    }
    
    static final void method8926(Class669 class669, byte i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_0_, 1202300585);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_0_ >> 16];
	Class170.method2825(class247, class243, class669, (byte) -108);
    }
    
    static final void method8927(Class669 class669, int i) {
	class669.anInt8600 -= 1235998252;
	int i_1_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_2_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	int i_3_
	    = class669.anIntArray8595[2 + 2088438307 * class669.anInt8600];
	int i_4_
	    = class669.anIntArray8595[3 + class669.anInt8600 * 2088438307];
	Class597 class597 = client.aClass512_11100.method8416((byte) 14);
	Class603.method10027(((i_1_ >> 14 & 0x3fff)
			      - -424199969 * class597.anInt7859),
			     ((i_1_ & 0x3fff)
			      - -1166289421 * class597.anInt7861),
			     i_2_ << 2, i_3_, i_4_, 1725288326);
	client.aBool11147 = true;
    }
    
    public static void method8928(int i) {
	if ((16 == client.anInt11039 * -1850530127
	     || -1850530127 * client.anInt11039 == 3)
	    && null != client.aClass100_11264) {
	    for (;;) {
		Interface68 interface68
		    = (Interface68) Class575.aLinkedList7711.poll();
		if (null == interface68)
		    break;
		interface68.method356(2136566573);
	    }
	}
    }
    
    static final void method8929(Class669 class669, byte i) {
	class669.anInt8600 -= 1235998252;
	int i_5_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_6_
	    = class669.anIntArray8595[1 + 2088438307 * class669.anInt8600];
	int i_7_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 2];
	int i_8_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 3];
	int i_9_ = 256;
	Class171_Sub4.aClass232_9944.method4237(Class211.aClass211_2255, i_5_,
						i_6_, i_8_,
						Class190.aClass190_2134
						    .method3763(-1342914477),
						Class207.aClass207_2235, 0.0F,
						0.0F, null, 0, i_9_, i_7_,
						(byte) 64);
    }
}
