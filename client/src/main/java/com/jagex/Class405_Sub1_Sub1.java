/* Class405_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class405_Sub1_Sub1 extends Class405_Sub1
{
    byte[] aByteArray11430;
    
    byte[] method17969(int i, int i_0_, int i_1_) {
	aByteArray11430 = new byte[i * i_0_ * i_1_ * 2];
	method6623(i, i_0_, i_1_);
	return aByteArray11430;
    }
    
    Class405_Sub1_Sub1() {
	super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
    
    void method15802(int i, byte i_2_) {
	int i_3_ = i * 2;
	int i_4_ = i_2_ & 0xff;
	aByteArray11430[i_3_++] = (byte) (3 * i_4_ >> 5);
	aByteArray11430[i_3_] = (byte) (3 * i_4_ >> 5);
    }
    
    byte[] method17970(int i, int i_5_, int i_6_) {
	aByteArray11430 = new byte[i * i_5_ * i_6_ * 2];
	method6623(i, i_5_, i_6_);
	return aByteArray11430;
    }
    
    void method15801(int i, byte i_7_) {
	int i_8_ = i * 2;
	int i_9_ = i_7_ & 0xff;
	aByteArray11430[i_8_++] = (byte) (3 * i_9_ >> 5);
	aByteArray11430[i_8_] = (byte) (3 * i_9_ >> 5);
    }
}
