/* Class405_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class405_Sub2 extends Class405
{
    int anInt10261;
    int anInt10262;
    byte[] aByteArray10263;
    int[] anIntArray10264 = new int[anInt4287];
    
    Class405_Sub2(int i, int i_0_, int i_1_, int i_2_, int i_3_, float f) {
	super(i, i_0_, i_1_, i_2_, i_3_);
	for (int i_4_ = 0; i_4_ < anInt4287; i_4_++)
	    anIntArray10264[i_4_]
		= (short) (int) (Math.pow((double) f, (double) i_4_) * 4096.0);
    }
    
    void method6624() {
	anInt10261 = 0;
	anInt10262 = 0;
    }
    
    void method6622(int i, int i_5_) {
	anInt10262 += i_5_ * anIntArray10264[i] >> 12;
    }
    
    void method6633() {
	anInt10261 = 0;
	anInt10262 = 0;
    }
    
    void method6625() {
	anInt10262 = Math.abs(anInt10262);
	if (anInt10262 >= 4096)
	    anInt10262 = 4095;
	method15871(anInt10261++, (byte) (anInt10262 >> 4));
	anInt10262 = 0;
    }
    
    void method15871(int i, byte i_6_) {
	aByteArray10263[anInt10261++] = (byte) (127 + ((i_6_ & 0xff) >> 1));
    }
    
    void method15872(int i, byte i_7_) {
	aByteArray10263[anInt10261++] = (byte) (127 + ((i_7_ & 0xff) >> 1));
    }
    
    void method6634() {
	anInt10262 = Math.abs(anInt10262);
	if (anInt10262 >= 4096)
	    anInt10262 = 4095;
	method15871(anInt10261++, (byte) (anInt10262 >> 4));
	anInt10262 = 0;
    }
    
    void method6635(int i, int i_8_) {
	anInt10262 += i_8_ * anIntArray10264[i] >> 12;
    }
    
    void method6636(int i, int i_9_) {
	anInt10262 += i_9_ * anIntArray10264[i] >> 12;
    }
}
