/* Class536_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub4 extends Class536
{
    short aShort10363;
    int anInt10364
	= (int) (Class250.method4604((byte) -52) / 1000L) * -1664898365;
    String aString10365;
    static int anInt10366;
    
    Class536_Sub4(String string, int i) {
	aString10365 = string;
	aShort10363 = (short) i;
    }
    
    static void method15993(int i, int i_0_, int i_1_, byte i_2_) {
	if (i == 1008)
	    Class680.method13862(Class583.aClass583_7773, i_0_, i_1_,
				 (byte) 33);
	else if (1009 == i)
	    Class680.method13862(Class583.aClass583_7783, i_0_, i_1_,
				 (byte) 119);
	else if (1010 == i)
	    Class680.method13862(Class583.aClass583_7774, i_0_, i_1_,
				 (byte) 20);
	else if (i == 1011)
	    Class680.method13862(Class583.aClass583_7772, i_0_, i_1_,
				 (byte) 10);
	else if (1012 == i)
	    Class680.method13862(Class583.aClass583_7792, i_0_, i_1_,
				 (byte) 93);
    }
    
    static void method15994
	(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_,
	 Class534_Sub18_Sub11 class534_sub18_sub11, Class171 class171,
	 Class16 class16, int i_9_, int i_10_, byte i_11_) {
	if (i > i_4_ && i < i_6_ + i_4_
	    && i_3_ > i_8_ - 102396103 * class16.anInt190 - 1
	    && i_3_ < i_8_ + class16.anInt189 * 728893755)
	    i_9_ = i_10_;
	String string = Class635.method10539(class534_sub18_sub11, 1213337332);
	class171.method2835(string, 3 + i_4_, i_8_, i_9_, 0,
			    client.aRandom11178, Class709.anInt8857,
			    Class658.aClass163Array8541, null, (byte) 37);
    }
    
    static final void method15995(Class669 class669, int i) {
	int i_12_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = class669.aClass352_8602.aStringArray3645[i_12_];
    }
}
