/* Class405_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class405_Sub1 extends Class405
{
    int anInt10165;
    int anInt10166;
    int anInt10167;
    int anInt10168;
    int anInt10169;
    int anInt10170;
    int anInt10171;
    byte[] aByteArray10172;
    int anInt10173;
    
    void method6634() {
	anInt10170 = anInt10168;
	anInt10165 >>= 4;
	if (anInt10165 < 0)
	    anInt10165 = 0;
	else if (anInt10165 > 255)
	    anInt10165 = 255;
	method15802(anInt10169++, (byte) anInt10165);
	anInt10165 = 0;
    }
    
    void method6624() {
	anInt10169 = 0;
	anInt10165 = 0;
    }
    
    void method6622(int i, int i_0_) {
	if (i != 0) {
	    anInt10167 = anInt10166 * anInt10171 >> 12;
	    if (anInt10167 < 0)
		anInt10167 = 0;
	    else if (anInt10167 > 4096)
		anInt10167 = 4096;
	    anInt10166 = anInt10173 - (i_0_ < 0 ? -i_0_ : i_0_);
	    anInt10166 = anInt10166 * anInt10166 >> 12;
	    anInt10166 = anInt10166 * anInt10167 >> 12;
	    anInt10165 += anInt10166 * anInt10170 >> 12;
	    anInt10170 = anInt10170 * anInt10168 >> 12;
	} else {
	    anInt10166 = anInt10173 - (i_0_ < 0 ? -i_0_ : i_0_);
	    anInt10166 = anInt10166 * anInt10166 >> 12;
	    anInt10167 = 4096;
	    anInt10165 = anInt10166;
	}
    }
    
    void method6625() {
	anInt10170 = anInt10168;
	anInt10165 >>= 4;
	if (anInt10165 < 0)
	    anInt10165 = 0;
	else if (anInt10165 > 255)
	    anInt10165 = 255;
	method15802(anInt10169++, (byte) anInt10165);
	anInt10165 = 0;
    }
    
    void method6636(int i, int i_1_) {
	if (i != 0) {
	    anInt10167 = anInt10166 * anInt10171 >> 12;
	    if (anInt10167 < 0)
		anInt10167 = 0;
	    else if (anInt10167 > 4096)
		anInt10167 = 4096;
	    anInt10166 = anInt10173 - (i_1_ < 0 ? -i_1_ : i_1_);
	    anInt10166 = anInt10166 * anInt10166 >> 12;
	    anInt10166 = anInt10166 * anInt10167 >> 12;
	    anInt10165 += anInt10166 * anInt10170 >> 12;
	    anInt10170 = anInt10170 * anInt10168 >> 12;
	} else {
	    anInt10166 = anInt10173 - (i_1_ < 0 ? -i_1_ : i_1_);
	    anInt10166 = anInt10166 * anInt10166 >> 12;
	    anInt10167 = 4096;
	    anInt10165 = anInt10166;
	}
    }
    
    void method15801(int i, byte i_2_) {
	aByteArray10172[i] = i_2_;
    }
    
    void method6633() {
	anInt10169 = 0;
	anInt10165 = 0;
    }
    
    void method6635(int i, int i_3_) {
	if (i != 0) {
	    anInt10167 = anInt10166 * anInt10171 >> 12;
	    if (anInt10167 < 0)
		anInt10167 = 0;
	    else if (anInt10167 > 4096)
		anInt10167 = 4096;
	    anInt10166 = anInt10173 - (i_3_ < 0 ? -i_3_ : i_3_);
	    anInt10166 = anInt10166 * anInt10166 >> 12;
	    anInt10166 = anInt10166 * anInt10167 >> 12;
	    anInt10165 += anInt10166 * anInt10170 >> 12;
	    anInt10170 = anInt10170 * anInt10168 >> 12;
	} else {
	    anInt10166 = anInt10173 - (i_3_ < 0 ? -i_3_ : i_3_);
	    anInt10166 = anInt10166 * anInt10166 >> 12;
	    anInt10167 = 4096;
	    anInt10165 = anInt10166;
	}
    }
    
    void method15802(int i, byte i_4_) {
	aByteArray10172[i] = i_4_;
    }
    
    Class405_Sub1(int i, int i_5_, int i_6_, int i_7_, int i_8_, float f,
		  float f_9_, float f_10_) {
	super(i, i_5_, i_6_, i_7_, i_8_);
	anInt10171 = (int) (f_10_ * 4096.0F);
	anInt10173 = (int) (f_9_ * 4096.0F);
	anInt10170 = anInt10168 = (int) (Math.pow(0.5, (double) -f) * 4096.0);
    }
}
