/* Class210 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class210 implements Interface58
{
    Class232 this$0;
    static int anInt2246;
    
    Class210(Class232 class232) {
	this$0 = class232;
    }
    
    public void method379(Object object, float[] fs, Object[] objects, int i) {
	Class491 class491 = (Class491) object;
	Class438 class438 = class491.method8029((byte) -48);
	float f = class491.method8020((short) -7105);
	float f_0_ = class491.method8031(2127201659);
	Class438 class438_1_
	    = Class438.method7055(class438, this$0.method4245(313353416));
	float f_2_ = 0.0F;
	float f_3_ = class438_1_.method7012();
	if (f_3_ >= f_0_)
	    f_2_ = 0.0F;
	if (f_3_ <= f)
	    f_2_ = 1.0F;
	else {
	    float f_4_ = 1.0F - 1.0F / (f_0_ - f) * (f_3_ - f);
	    if ((double) f_4_ < 0.0 || (double) f_4_ > 1.0)
		f_4_ = Math.min(Math.max(f_4_, 0.0F), 1.0F);
	    f_2_ = f_4_;
	}
	int i_5_ = 8192;
	float f_6_ = 0.0F;
	if (Class10.anInt75 * -891094135 == 3) {
	    float f_7_ = Class599.aClass298_Sub1_7871.method5389(-1015910701);
	    if (0.0F != class438_1_.aFloat4864
		|| 0.0F != class438_1_.aFloat4865) {
		int i_8_
		    = (((int) (2607.5945876176133 * (double) (-1.0F * f_7_))
			- (int) (Math.atan2((double) class438_1_.aFloat4864,
					    (double) class438_1_.aFloat4865)
				 * 2607.5945876176133)
			- 4096)
		       & 0x3fff);
		if (i_8_ > 8192)
		    i_8_ = 16384 - i_8_;
		int i_9_;
		if (f_3_ <= 0.0F)
		    i_9_ = 8192;
		else if (f_3_ >= 4096.0F)
		    i_9_ = 16384;
		else
		    i_9_ = (int) (8192.0F + 8192.0F * f_3_ / 4096.0F);
		i_5_ = (16384 - i_9_ >> 1) + i_9_ * i_8_ / 8192;
	    }
	    f_6_ = (float) i_5_ * 6.1035156E-5F;
	} else {
	    if (class438_1_.aFloat4864 != 0.0F
		|| class438_1_.aFloat4865 != 0.0F) {
		int i_10_
		    = ((-(-890112543 * Class641.anInt8341)
			- (int) (Math.atan2((double) class438_1_.aFloat4864,
					    (double) class438_1_.aFloat4865)
				 * 2607.5945876176133)
			- 4096)
		       & 0x3fff);
		if (i_10_ > 8192)
		    i_10_ = 16384 - i_10_;
		int i_11_;
		if (f_3_ <= 0.0F)
		    i_11_ = 8192;
		else if (f_3_ >= 4096.0F)
		    i_11_ = 16384;
		else
		    i_11_ = (int) (f_3_ * 8192.0F / 4096.0F + 8192.0F);
		i_5_ = i_10_ * i_11_ / 8192 + (16384 - i_11_ >> 1);
	    }
	    f_6_ = 6.1035156E-5F * (float) i_5_;
	}
	fs[0] = (float) (i_5_ < 0 ? (double) f_2_
			 : ((double) f_2_
			    * Math.sqrt((double) (2.0F * (1.0F - f_6_)))));
	fs[1] = (float) (i_5_ < 0 ? (double) -f_2_
			 : (double) f_2_ * Math.sqrt((double) (2.0F * f_6_)));
    }
    
    public void method380(Object object, float[] fs, Object[] objects) {
	Class491 class491 = (Class491) object;
	Class438 class438 = class491.method8029((byte) -118);
	float f = class491.method8020((short) 11512);
	float f_12_ = class491.method8031(2065928796);
	Class438 class438_13_
	    = Class438.method7055(class438, this$0.method4245(1764259577));
	float f_14_ = 0.0F;
	float f_15_ = class438_13_.method7012();
	if (f_15_ >= f_12_)
	    f_14_ = 0.0F;
	if (f_15_ <= f)
	    f_14_ = 1.0F;
	else {
	    float f_16_ = 1.0F - 1.0F / (f_12_ - f) * (f_15_ - f);
	    if ((double) f_16_ < 0.0 || (double) f_16_ > 1.0)
		f_16_ = Math.min(Math.max(f_16_, 0.0F), 1.0F);
	    f_14_ = f_16_;
	}
	int i = 8192;
	float f_17_ = 0.0F;
	if (Class10.anInt75 * -891094135 == 3) {
	    float f_18_ = Class599.aClass298_Sub1_7871.method5389(-2070655863);
	    if (0.0F != class438_13_.aFloat4864
		|| 0.0F != class438_13_.aFloat4865) {
		int i_19_
		    = (((int) (2607.5945876176133 * (double) (-1.0F * f_18_))
			- (int) (Math.atan2((double) class438_13_.aFloat4864,
					    (double) class438_13_.aFloat4865)
				 * 2607.5945876176133)
			- 4096)
		       & 0x3fff);
		if (i_19_ > 8192)
		    i_19_ = 16384 - i_19_;
		int i_20_;
		if (f_15_ <= 0.0F)
		    i_20_ = 8192;
		else if (f_15_ >= 4096.0F)
		    i_20_ = 16384;
		else
		    i_20_ = (int) (8192.0F + 8192.0F * f_15_ / 4096.0F);
		i = (16384 - i_20_ >> 1) + i_20_ * i_19_ / 8192;
	    }
	    f_17_ = (float) i * 6.1035156E-5F;
	} else {
	    if (class438_13_.aFloat4864 != 0.0F
		|| class438_13_.aFloat4865 != 0.0F) {
		int i_21_
		    = ((-(-890112543 * Class641.anInt8341)
			- (int) (Math.atan2((double) class438_13_.aFloat4864,
					    (double) class438_13_.aFloat4865)
				 * 2607.5945876176133)
			- 4096)
		       & 0x3fff);
		if (i_21_ > 8192)
		    i_21_ = 16384 - i_21_;
		int i_22_;
		if (f_15_ <= 0.0F)
		    i_22_ = 8192;
		else if (f_15_ >= 4096.0F)
		    i_22_ = 16384;
		else
		    i_22_ = (int) (f_15_ * 8192.0F / 4096.0F + 8192.0F);
		i = i_21_ * i_22_ / 8192 + (16384 - i_22_ >> 1);
	    }
	    f_17_ = 6.1035156E-5F * (float) i;
	}
	fs[0] = (float) (i < 0 ? (double) f_14_
			 : ((double) f_14_
			    * Math.sqrt((double) (2.0F * (1.0F - f_17_)))));
	fs[1]
	    = (float) (i < 0 ? (double) -f_14_
		       : (double) f_14_ * Math.sqrt((double) (2.0F * f_17_)));
    }
    
    public void method381(Object object, float[] fs, Object[] objects) {
	Class491 class491 = (Class491) object;
	Class438 class438 = class491.method8029((byte) -21);
	float f = class491.method8020((short) 10710);
	float f_23_ = class491.method8031(2080140851);
	Class438 class438_24_
	    = Class438.method7055(class438, this$0.method4245(607425469));
	float f_25_ = 0.0F;
	float f_26_ = class438_24_.method7012();
	if (f_26_ >= f_23_)
	    f_25_ = 0.0F;
	if (f_26_ <= f)
	    f_25_ = 1.0F;
	else {
	    float f_27_ = 1.0F - 1.0F / (f_23_ - f) * (f_26_ - f);
	    if ((double) f_27_ < 0.0 || (double) f_27_ > 1.0)
		f_27_ = Math.min(Math.max(f_27_, 0.0F), 1.0F);
	    f_25_ = f_27_;
	}
	int i = 8192;
	float f_28_ = 0.0F;
	if (Class10.anInt75 * -891094135 == 3) {
	    float f_29_ = Class599.aClass298_Sub1_7871.method5389(154142419);
	    if (0.0F != class438_24_.aFloat4864
		|| 0.0F != class438_24_.aFloat4865) {
		int i_30_
		    = (((int) (2607.5945876176133 * (double) (-1.0F * f_29_))
			- (int) (Math.atan2((double) class438_24_.aFloat4864,
					    (double) class438_24_.aFloat4865)
				 * 2607.5945876176133)
			- 4096)
		       & 0x3fff);
		if (i_30_ > 8192)
		    i_30_ = 16384 - i_30_;
		int i_31_;
		if (f_26_ <= 0.0F)
		    i_31_ = 8192;
		else if (f_26_ >= 4096.0F)
		    i_31_ = 16384;
		else
		    i_31_ = (int) (8192.0F + 8192.0F * f_26_ / 4096.0F);
		i = (16384 - i_31_ >> 1) + i_31_ * i_30_ / 8192;
	    }
	    f_28_ = (float) i * 6.1035156E-5F;
	} else {
	    if (class438_24_.aFloat4864 != 0.0F
		|| class438_24_.aFloat4865 != 0.0F) {
		int i_32_
		    = ((-(-890112543 * Class641.anInt8341)
			- (int) (Math.atan2((double) class438_24_.aFloat4864,
					    (double) class438_24_.aFloat4865)
				 * 2607.5945876176133)
			- 4096)
		       & 0x3fff);
		if (i_32_ > 8192)
		    i_32_ = 16384 - i_32_;
		int i_33_;
		if (f_26_ <= 0.0F)
		    i_33_ = 8192;
		else if (f_26_ >= 4096.0F)
		    i_33_ = 16384;
		else
		    i_33_ = (int) (f_26_ * 8192.0F / 4096.0F + 8192.0F);
		i = i_32_ * i_33_ / 8192 + (16384 - i_33_ >> 1);
	    }
	    f_28_ = 6.1035156E-5F * (float) i;
	}
	fs[0] = (float) (i < 0 ? (double) f_25_
			 : ((double) f_25_
			    * Math.sqrt((double) (2.0F * (1.0F - f_28_)))));
	fs[1]
	    = (float) (i < 0 ? (double) -f_25_
		       : (double) f_25_ * Math.sqrt((double) (2.0F * f_28_)));
    }
    
    public static void method3953(byte i) {
	Class574.aClass163_7706 = null;
    }
    
    static final void method3954(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class469.method7637(class247, class243, class669, -1079741811);
    }
    
    static final void method3955(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class280.anInt3059 * -270195941;
    }
    
    static final void method3956(int i, int i_34_) {
	if (Class180.method2978(i, null, 534807431))
	    Class341.method5949((Class44_Sub11.aClass243Array11006[i]
				 .aClass247Array2412),
				-1, -1935696665);
    }
}
