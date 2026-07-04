/* Class405_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class405_Sub1_Sub2 extends Class405_Sub1
{
    byte[] aByteArray11638;
    
    Class405_Sub1_Sub2() {
	super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
    
    byte[] method18109(int i, int i_0_, int i_1_) {
	aByteArray11638 = new byte[i * i_0_ * i_1_ * 2];
	method6623(i, i_0_, i_1_);
	return aByteArray11638;
    }
    
    void method15802(int i, byte i_2_) {
	int i_3_ = i * 2;
	int i_4_ = i_2_ & 0xff;
	aByteArray11638[i_3_++] = (byte) -1;
	aByteArray11638[i_3_] = (byte) (3 * i_4_ >> 5);
    }
    
    void method15801(int i, byte i_5_) {
	int i_6_ = i * 2;
	int i_7_ = i_5_ & 0xff;
	aByteArray11638[i_6_++] = (byte) -1;
	aByteArray11638[i_6_] = (byte) (3 * i_7_ >> 5);
    }
    
    byte[] method18110(int i, int i_8_, int i_9_) {
	aByteArray11638 = new byte[i * i_8_ * i_9_ * 2];
	method6623(i, i_8_, i_9_);
	return aByteArray11638;
    }
}
