/* Class405_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class405_Sub2_Sub1 extends Class405_Sub2
{
    byte[] aByteArray11431;
    
    Class405_Sub2_Sub1() {
	super(12, 5, 16, 2, 2, 0.45F);
    }
    
    void method15872(int i, byte i_0_) {
	int i_1_ = i * 2;
	i_0_ = (byte) (127 + ((i_0_ & 0xff) >> 1));
	aByteArray11431[i_1_++] = i_0_;
	aByteArray11431[i_1_] = i_0_;
    }
    
    byte[] method17971(int i, int i_2_, int i_3_) {
	aByteArray11431 = new byte[i * i_2_ * i_3_ * 2];
	method6623(i, i_2_, i_3_);
	return aByteArray11431;
    }
    
    byte[] method17972(int i, int i_4_, int i_5_) {
	aByteArray11431 = new byte[i * i_4_ * i_5_ * 2];
	method6623(i, i_4_, i_5_);
	return aByteArray11431;
    }
    
    byte[] method17973(int i, int i_6_, int i_7_) {
	aByteArray11431 = new byte[i * i_6_ * i_7_ * 2];
	method6623(i, i_6_, i_7_);
	return aByteArray11431;
    }
    
    void method15871(int i, byte i_8_) {
	int i_9_ = i * 2;
	i_8_ = (byte) (127 + ((i_8_ & 0xff) >> 1));
	aByteArray11431[i_9_++] = i_8_;
	aByteArray11431[i_9_] = i_8_;
    }
}
