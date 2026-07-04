/* Class543 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class543
{
    Class542[] aClass542Array7185;
    int anInt7186;
    int anInt7187;
    int anInt7188;
    Class522 this$0;
    
    Class542 method8951(int i, byte i_0_) {
	return (aClass542Array7185
		[(((i & 417458941 * anInt7188) << -806913965 * anInt7186)
		  + ((i_0_ & 0xff) >>> 8 - -806913965 * anInt7186))]);
    }
    
    void method8952(int i, int i_1_, int i_2_) {
	if (aClass542Array7185 == null || anInt7186 * -806913965 != i_1_
	    || i != anInt7187 * -764843529) {
	    anInt7187 = -68802617 * i;
	    anInt7188 = 133366357 * ((1 << i) - 1);
	    anInt7186 = 769493979 * i_1_;
	    int i_3_ = 1 << -806913965 * anInt7186 + -764843529 * anInt7187;
	    aClass542Array7185 = new Class542[i_3_];
	    for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
		aClass542Array7185[i_4_] = new Class542(this);
	}
    }
    
    Class543(Class522 class522) {
	this$0 = class522;
    }
    
    Class542 method8953(int i, byte i_5_, byte i_6_) {
	return (aClass542Array7185
		[(((i & 417458941 * anInt7188) << -806913965 * anInt7186)
		  + ((i_5_ & 0xff) >>> 8 - -806913965 * anInt7186))]);
    }
    
    void method8954() {
	int i = 1 << anInt7186 * -806913965 + anInt7187 * -764843529;
	for (int i_7_ = 0; i_7_ < i; i_7_++)
	    aClass542Array7185[i_7_].method8943(-2092217623);
    }
    
    void method8955() {
	int i = 1 << anInt7186 * -806913965 + anInt7187 * -764843529;
	for (int i_8_ = 0; i_8_ < i; i_8_++)
	    aClass542Array7185[i_8_].method8943(-2131663815);
    }
    
    void method8956(byte i) {
	int i_9_ = 1 << anInt7186 * -806913965 + anInt7187 * -764843529;
	for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
	    aClass542Array7185[i_10_].method8943(-2142754211);
    }
    
    static final void method8957(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class523.method8727(class247, class243, class669, (byte) 100);
    }
    
    static final void method8958(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (Class546.method8989(string, class669, -219410121) != null)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2532
	    = Class99.method1859(string, class669, 1229655820);
	class247.aBool2561 = true;
    }
    
    static final void method8959(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_11_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_12_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1] - 1;
	Class15 class15
	    = (Class15) Class531.aClass44_Sub7_7135.method91(i_11_, -7902105);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class15.method686(i_12_, -859924622);
    }
    
    static final void method8960(Class669 class669, byte i) {
	int i_13_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (2 == client.anInt11171 * -1050164879
	    && i_13_ < -1979292205 * client.anInt11324)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= client.aClass28Array11327[i_13_].aBool256 ? 1 : 0;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
    
    static void method8961(int i, int i_14_, int i_15_, int i_16_, int i_17_) {
	float f = ((float) Class554_Sub1.anInt7371
		   / (float) Class554_Sub1.anInt7370);
	int i_18_ = i_15_;
	int i_19_ = i_16_;
	if (f < 1.0F)
	    i_19_ = (int) ((float) i_15_ * f);
	else
	    i_18_ = (int) ((float) i_16_ / f);
	i -= (i_15_ - i_18_) / 2;
	i_14_ -= (i_16_ - i_19_) / 2;
	Class151.anInt1705 = 704227181 * (i * Class554_Sub1.anInt7370 / i_18_);
	Class328.anInt3479
	    = 980626489 * (Class554_Sub1.anInt7371
			   - Class554_Sub1.anInt7371 * i_14_ / i_19_);
	Class554_Sub1.anInt10672 = 1421361991;
	Class554_Sub1.anInt10673 = -2017528667;
	Class612.method10108(65280);
    }
}
