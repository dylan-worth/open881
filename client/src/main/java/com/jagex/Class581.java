/* Class581 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class581
{
    Class203 aClass203_7763 = new Class203(20);
    Class472 aClass472_7764;
    static int anInt7765;
    
    void method9818() {
	synchronized (aClass203_7763) {
	    aClass203_7763.method3884((byte) -48);
	}
    }
    
    void method9819() {
	synchronized (aClass203_7763) {
	    aClass203_7763.method3877(-310105214);
	}
    }
    
    void method9820(byte i) {
	synchronized (aClass203_7763) {
	    aClass203_7763.method3877(-954962777);
	}
    }
    
    Class581(Class472 class472) {
	aClass472_7764 = class472;
    }
    
    void method9821(byte i) {
	synchronized (aClass203_7763) {
	    aClass203_7763.method3884((byte) -16);
	}
    }
    
    void method9822() {
	synchronized (aClass203_7763) {
	    aClass203_7763.method3877(-1083137208);
	}
    }
    
    void method9823(int i) {
	synchronized (aClass203_7763) {
	    aClass203_7763.method3876(i, (byte) 0);
	}
    }
    
    void method9824(int i, short i_0_) {
	synchronized (aClass203_7763) {
	    aClass203_7763.method3876(i, (byte) 0);
	}
    }
    
    static final void method9825(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	class247.aBool2601
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) == 1;
	Class454.method7416(class247, -346132619);
    }
    
    static final void method9826(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_1_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_2_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (-1999362577
	       * client.aClass492ArrayArray11027[i_2_][i_1_].anInt5338);
    }
    
    static final void method9827(Class669 class669, int i) {
	String string = null;
	if (null != Class376.aClass43_3911)
	    string = Class376.aClass43_3911.method1071((byte) 7);
	if (string == null)
	    string = "";
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = string;
    }
    
    static void method9828(int i, int i_3_, int i_4_, int i_5_, int i_6_) {
	Class534_Sub18_Sub6 class534_sub18_sub6
	    = Class447.method7308(20, (long) i_3_ << 32 | (long) i);
	class534_sub18_sub6.method18121(-150299104);
	class534_sub18_sub6.anInt11666 = 517206857 * i_4_;
	class534_sub18_sub6.anInt11660 = -1621355885 * i_5_;
    }
}
