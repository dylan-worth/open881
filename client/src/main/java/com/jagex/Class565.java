/* Class565 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class565
{
    int anInt7571;
    byte[] aByteArray7572;
    byte[] aByteArray7573;
    Class569 aClass569_7574;
    int anInt7575;
    int anInt7576;
    int anInt7577;
    float aFloat7578;
    int anInt7579;
    int anInt7580;
    Class367_Sub1 this$0;
    
    int method9521(int i) {
	return 1052763975 * anInt7576;
    }
    
    void method9522(byte[] is, int i, int i_0_, int i_1_) {
	int i_2_ = i;
	while (i_2_ < i + i_0_) {
	    aByteArray7572[2012015317 * anInt7575] = is[i_2_];
	    aByteArray7572[anInt7575 * 2012015317 + 1] = is[i_2_ + 1];
	    i_2_ += 2;
	    anInt7575 += -938083078;
	    anInt7575 = 1678442109 * (anInt7575 * 2012015317
				      % aByteArray7572.length);
	    anInt7576 -= 619128046;
	}
    }
    
    int method9523() {
	return 1052763975 * anInt7576;
    }
    
    void method9524(byte[] is, int i, int i_3_) {
	int i_4_ = i;
	while (i_4_ < i + i_3_) {
	    aByteArray7572[2012015317 * anInt7575] = is[i_4_];
	    aByteArray7572[anInt7575 * 2012015317 + 1] = is[i_4_ + 1];
	    i_4_ += 2;
	    anInt7575 += -938083078;
	    anInt7575 = 1678442109 * (anInt7575 * 2012015317
				      % aByteArray7572.length);
	    anInt7576 -= 619128046;
	}
    }
    
    int method9525() {
	return 1052763975 * anInt7576;
    }
    
    Class565(Class367_Sub1 class367_sub1, Class569 class569, int i, float f,
	     int i_5_, int i_6_, boolean bool, boolean bool_7_) {
	this$0 = class367_sub1;
	aClass569_7574 = class569;
	aByteArray7572 = new byte[i];
	aByteArray7573 = new byte[i_5_ / 8];
	anInt7576 = -1837919625 * aByteArray7572.length;
	aFloat7578 = f;
	anInt7571 = i_5_ * -2080613081;
	anInt7580 = 1147678945 * i_6_;
	anInt7575 = 0;
	anInt7579 = 0;
	anInt7577 = 0;
    }
    
    static final void method9526(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aClass214_11359.method4031(-1560750376);
    }
    
    static final void method9527(Class669 class669, int i) {
	class669.anIntArray8595[class669.anInt8600 * 2088438307 - 1]
	    = (class669.aClass352_8602.method6197((byte) -79)
	       [class669.anIntArray8595[2088438307 * class669.anInt8600 - 1]]);
    }
    
    static final void method9528(Class669 class669, int i) {
	int i_8_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class272 class272
	    = ((Class272)
	       Class222.aClass44_Sub9_2313.method91(i_8_, -811482916));
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class272.anInt2977 * -15128681;
    }
    
    static void method9529(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class521.method8686((byte) -16);
    }
}
