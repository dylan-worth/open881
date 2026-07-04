/* Class466 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class466
{
    int anInt5124;
    int anInt5125;
    Class473 aClass473_5126;
    
    int method7574() {
	return -1009297175 * anInt5124;
    }
    
    int method7575() {
	return anInt5125 * -250465485;
    }
    
    int method7576(byte i) {
	return anInt5125 * -250465485;
    }
    
    int method7577(int i) {
	return -1009297175 * anInt5124;
    }
    
    Class473 method7578(int i) {
	return aClass473_5126;
    }
    
    int method7579() {
	return anInt5125 * -250465485;
    }
    
    int method7580() {
	return anInt5125 * -250465485;
    }
    
    Class466(Class534_Sub40 class534_sub40) {
	aClass473_5126
	    = ((Class473)
	       Class448.method7319(Class473.method7749(835264461),
				   class534_sub40.method16527(1966475500),
				   2088438307));
	anInt5125 = class534_sub40.method16533(-258848859) * 1966669819;
	if (Class473.aClass473_5172 != aClass473_5126)
	    anInt5124 = class534_sub40.method16533(-258848859) * -926744743;
	else
	    anInt5124 = anInt5125 * -1795581509;
    }
    
    int method7581() {
	return anInt5125 * -250465485;
    }
    
    Class473 method7582() {
	return aClass473_5126;
    }
    
    public static int method7583(int i, int i_0_) {
	double d = (double) (i >> 16 & 0xff) / 256.0;
	double d_1_ = (double) (i >> 8 & 0xff) / 256.0;
	double d_2_ = (double) (i & 0xff) / 256.0;
	double d_3_ = d;
	if (d_1_ < d_3_)
	    d_3_ = d_1_;
	if (d_2_ < d_3_)
	    d_3_ = d_2_;
	double d_4_ = d;
	if (d_1_ > d_4_)
	    d_4_ = d_1_;
	if (d_2_ > d_4_)
	    d_4_ = d_2_;
	double d_5_ = 0.0;
	double d_6_ = 0.0;
	double d_7_ = (d_4_ + d_3_) / 2.0;
	if (d_4_ != d_3_) {
	    if (d_7_ < 0.5)
		d_6_ = (d_4_ - d_3_) / (d_4_ + d_3_);
	    if (d_7_ >= 0.5)
		d_6_ = (d_4_ - d_3_) / (2.0 - d_4_ - d_3_);
	    if (d_4_ == d)
		d_5_ = (d_1_ - d_2_) / (d_4_ - d_3_);
	    else if (d_4_ == d_1_)
		d_5_ = (d_2_ - d) / (d_4_ - d_3_) + 2.0;
	    else if (d_2_ == d_4_)
		d_5_ = (d - d_1_) / (d_4_ - d_3_) + 4.0;
	}
	d_5_ /= 6.0;
	int i_8_ = (int) (d_5_ * 256.0);
	int i_9_ = (int) (d_6_ * 256.0);
	int i_10_ = (int) (d_7_ * 256.0);
	if (i_9_ < 0)
	    i_9_ = 0;
	else if (i_9_ > 255)
	    i_9_ = 255;
	if (i_10_ < 0)
	    i_10_ = 0;
	else if (i_10_ > 255)
	    i_10_ = 255;
	if (i_10_ > 243)
	    i_9_ >>= 4;
	else if (i_10_ > 217)
	    i_9_ >>= 3;
	else if (i_10_ > 192)
	    i_9_ >>= 2;
	else if (i_10_ > 179)
	    i_9_ >>= 1;
	return (i_10_ >> 1) + (((i_8_ & 0xff) >> 2 << 10) + (i_9_ >> 5 << 7));
    }
    
    static final void method7584(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub3_10767
		  .method16839(1005428894) == 2 ? 1 : 0;
    }
}
