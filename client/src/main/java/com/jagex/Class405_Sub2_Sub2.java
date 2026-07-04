/* Class405_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class405_Sub2_Sub2 extends Class405_Sub2
{
    byte[] aByteArray11458;
    
    Class405_Sub2_Sub2() {
	super(12, 5, 16, 2, 2, 0.45F);
    }
    
    void method15871(int i, byte i_0_) {
	int i_1_ = i * 2;
	i_0_ = (byte) (127 + ((i_0_ & 0xff) >> 1));
	aByteArray11458[i_1_++] = i_0_;
	aByteArray11458[i_1_] = i_0_;
    }
    
    byte[] method17981(int i, int i_2_, int i_3_) {
	aByteArray11458 = new byte[i * i_2_ * i_3_ * 2];
	method6623(i, i_2_, i_3_);
	return aByteArray11458;
    }
    
    void method15872(int i, byte i_4_) {
	int i_5_ = i * 2;
	i_4_ = (byte) (127 + ((i_4_ & 0xff) >> 1));
	aByteArray11458[i_5_++] = i_4_;
	aByteArray11458[i_5_] = i_4_;
    }
    
    byte[] method17982(int i, int i_6_, int i_7_) {
	aByteArray11458 = new byte[i * i_6_ * i_7_ * 2];
	method6623(i, i_6_, i_7_);
	return aByteArray11458;
    }
}
