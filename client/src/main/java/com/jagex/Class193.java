/* Class193 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class193 implements Interface58
{
    Class232 this$0;
    
    public void method379(Object object, float[] fs, Object[] objects, int i) {
	Class491 class491 = (Class491) object;
	Class438 class438 = class491.method8029((byte) -114);
	float f = class491.method8020((short) 28065);
	float f_0_ = class491.method8031(2142678060);
	Class438 class438_1_ = this$0.method4245(1922781923);
	Class438 class438_2_ = Class438.method7055(class438, class438_1_);
	float f_3_ = 0.0F;
	int i_4_ = 8192;
	float f_5_ = class438_2_.method7012();
	float f_6_ = 0.0F;
	if (f_5_ >= f_0_)
	    f_3_ = 0.0F;
	else {
	    float f_7_ = ((Float) objects[0]).floatValue();
	    float f_8_ = ((Float) objects[1]).floatValue();
	    if (class438_1_.aFloat4864 > class438.aFloat4864 - f_7_ / 2.0F
		&& class438_1_.aFloat4864 < class438.aFloat4864 + f_7_ / 2.0F
		&& class438_1_.aFloat4865 > class438.aFloat4865 - f_8_ / 2.0F
		&& (class438_1_.aFloat4865
		    < class438.aFloat4865 + f_8_ / 2.0F)) {
		float f_9_
		    = Math.abs(class438_1_.aFloat4864 - (class438.aFloat4864
							 + f_7_ / 2.0F));
		float f_10_
		    = Math.abs(class438_1_.aFloat4864 - (class438.aFloat4864
							 - f_7_ / 2.0F));
		float f_11_ = Math.abs(class438_1_.aFloat4865
				       - (f_8_ / 2.0F + class438.aFloat4864));
		float f_12_
		    = Math.abs(class438_1_.aFloat4865 - (class438.aFloat4864
							 - f_8_ / 2.0F));
		float f_13_ = f_0_ - f;
		float f_14_ = Math.min(f_9_, f_10_);
		float f_15_ = Math.min(f_11_, f_12_);
		float f_16_ = 1.0F / f_13_ * f_14_;
		float f_17_ = f_15_ * (1.0F / f_13_);
		f_16_ = Math.min(Math.max(f_16_, 0.0F), 1.0F);
		f_17_ = Math.min(Math.max(f_17_, 0.0F), 1.0F);
		f_3_ = Math.min(f_16_, f_17_);
	    }
	    if (0.0F != class438_2_.aFloat4864
		|| 0.0F != class438_2_.aFloat4865) {
		if (3 == -891094135 * Class10.anInt75) {
		    float f_18_
			= Class599.aClass298_Sub1_7871.method5389(-495307092);
		    if (class438_2_.aFloat4864 != 0.0F
			|| class438_2_.aFloat4865 != 0.0F) {
			int i_19_
			    = (((int) (2607.5945876176133
				       * (double) (-1.0F * f_18_))
				- (int) (Math.atan2((double) (class438_2_
							      .aFloat4864),
						    (double) (class438_2_
							      .aFloat4865))
					 * 2607.5945876176133)
				- 4096)
			       & 0x3fff);
			if (i_19_ > 8192)
			    i_19_ = 16384 - i_19_;
			int i_20_;
			if (f_5_ <= 0.0F)
			    i_20_ = 8192;
			else if (f_5_ >= 4096.0F)
			    i_20_ = 16384;
			else
			    i_20_ = (int) (8192.0F + 8192.0F * f_5_ / 4096.0F);
			i_4_ = i_19_ * i_20_ / 8192 + (16384 - i_20_ >> 1);
		    }
		    f_6_ = 6.1035156E-5F * (float) i_4_;
		} else {
		    int i_21_
			= (-(Class641.anInt8341 * -890112543)
			   - (int) (Math.atan2((double) class438_2_.aFloat4864,
					       (double) class438_2_.aFloat4865)
				    * 2607.5945876176133)
			   - 4096) & 0x3fff;
		    if (i_21_ > 8192)
			i_21_ = 16384 - i_21_;
		    int i_22_;
		    if (f_5_ <= 0.0F)
			i_22_ = 8192;
		    else if (f_5_ >= 4096.0F)
			i_22_ = 16384;
		    else
			i_22_ = (int) (8192.0F * f_5_ / 4096.0F + 8192.0F);
		    i_4_ = (16384 - i_22_ >> 1) + i_22_ * i_21_ / 8192;
		    f_6_ = (float) i_4_ * 6.1035156E-5F;
		}
	    }
	}
	fs[0] = (float) (i_4_ < 0 ? (double) f_3_
			 : (double) f_3_ * Math.sqrt((double) (1.0F - f_6_)));
	fs[1] = (float) (i_4_ < 0 ? (double) -f_3_
			 : (double) f_3_ * Math.sqrt((double) f_6_));
    }
    
    Class193(Class232 class232) {
	this$0 = class232;
    }
    
    public void method380(Object object, float[] fs, Object[] objects) {
	Class491 class491 = (Class491) object;
	Class438 class438 = class491.method8029((byte) -84);
	float f = class491.method8020((short) -14298);
	float f_23_ = class491.method8031(2056499972);
	Class438 class438_24_ = this$0.method4245(288781959);
	Class438 class438_25_ = Class438.method7055(class438, class438_24_);
	float f_26_ = 0.0F;
	int i = 8192;
	float f_27_ = class438_25_.method7012();
	float f_28_ = 0.0F;
	if (f_27_ >= f_23_)
	    f_26_ = 0.0F;
	else {
	    float f_29_ = ((Float) objects[0]).floatValue();
	    float f_30_ = ((Float) objects[1]).floatValue();
	    if (class438_24_.aFloat4864 > class438.aFloat4864 - f_29_ / 2.0F
		&& class438_24_.aFloat4864 < class438.aFloat4864 + f_29_ / 2.0F
		&& class438_24_.aFloat4865 > class438.aFloat4865 - f_30_ / 2.0F
		&& (class438_24_.aFloat4865
		    < class438.aFloat4865 + f_30_ / 2.0F)) {
		float f_31_
		    = Math.abs(class438_24_.aFloat4864 - (class438.aFloat4864
							  + f_29_ / 2.0F));
		float f_32_
		    = Math.abs(class438_24_.aFloat4864 - (class438.aFloat4864
							  - f_29_ / 2.0F));
		float f_33_ = Math.abs(class438_24_.aFloat4865
				       - (f_30_ / 2.0F + class438.aFloat4864));
		float f_34_
		    = Math.abs(class438_24_.aFloat4865 - (class438.aFloat4864
							  - f_30_ / 2.0F));
		float f_35_ = f_23_ - f;
		float f_36_ = Math.min(f_31_, f_32_);
		float f_37_ = Math.min(f_33_, f_34_);
		float f_38_ = 1.0F / f_35_ * f_36_;
		float f_39_ = f_37_ * (1.0F / f_35_);
		f_38_ = Math.min(Math.max(f_38_, 0.0F), 1.0F);
		f_39_ = Math.min(Math.max(f_39_, 0.0F), 1.0F);
		f_26_ = Math.min(f_38_, f_39_);
	    }
	    if (0.0F != class438_25_.aFloat4864
		|| 0.0F != class438_25_.aFloat4865) {
		if (3 == -891094135 * Class10.anInt75) {
		    float f_40_
			= Class599.aClass298_Sub1_7871.method5389(-1086335206);
		    if (class438_25_.aFloat4864 != 0.0F
			|| class438_25_.aFloat4865 != 0.0F) {
			int i_41_
			    = (((int) (2607.5945876176133
				       * (double) (-1.0F * f_40_))
				- (int) (Math.atan2((double) (class438_25_
							      .aFloat4864),
						    (double) (class438_25_
							      .aFloat4865))
					 * 2607.5945876176133)
				- 4096)
			       & 0x3fff);
			if (i_41_ > 8192)
			    i_41_ = 16384 - i_41_;
			int i_42_;
			if (f_27_ <= 0.0F)
			    i_42_ = 8192;
			else if (f_27_ >= 4096.0F)
			    i_42_ = 16384;
			else
			    i_42_
				= (int) (8192.0F + 8192.0F * f_27_ / 4096.0F);
			i = i_41_ * i_42_ / 8192 + (16384 - i_42_ >> 1);
		    }
		    f_28_ = 6.1035156E-5F * (float) i;
		} else {
		    int i_43_ = ((-(Class641.anInt8341 * -890112543)
				  - (int) (Math.atan2((double) (class438_25_
								.aFloat4864),
						      (double) (class438_25_
								.aFloat4865))
					   * 2607.5945876176133)
				  - 4096)
				 & 0x3fff);
		    if (i_43_ > 8192)
			i_43_ = 16384 - i_43_;
		    int i_44_;
		    if (f_27_ <= 0.0F)
			i_44_ = 8192;
		    else if (f_27_ >= 4096.0F)
			i_44_ = 16384;
		    else
			i_44_ = (int) (8192.0F * f_27_ / 4096.0F + 8192.0F);
		    i = (16384 - i_44_ >> 1) + i_44_ * i_43_ / 8192;
		    f_28_ = (float) i * 6.1035156E-5F;
		}
	    }
	}
	fs[0]
	    = (float) (i < 0 ? (double) f_26_
		       : (double) f_26_ * Math.sqrt((double) (1.0F - f_28_)));
	fs[1] = (float) (i < 0 ? (double) -f_26_
			 : (double) f_26_ * Math.sqrt((double) f_28_));
    }
    
    public void method381(Object object, float[] fs, Object[] objects) {
	Class491 class491 = (Class491) object;
	Class438 class438 = class491.method8029((byte) -86);
	float f = class491.method8020((short) 251);
	float f_45_ = class491.method8031(2051030026);
	Class438 class438_46_ = this$0.method4245(2119039634);
	Class438 class438_47_ = Class438.method7055(class438, class438_46_);
	float f_48_ = 0.0F;
	int i = 8192;
	float f_49_ = class438_47_.method7012();
	float f_50_ = 0.0F;
	if (f_49_ >= f_45_)
	    f_48_ = 0.0F;
	else {
	    float f_51_ = ((Float) objects[0]).floatValue();
	    float f_52_ = ((Float) objects[1]).floatValue();
	    if (class438_46_.aFloat4864 > class438.aFloat4864 - f_51_ / 2.0F
		&& class438_46_.aFloat4864 < class438.aFloat4864 + f_51_ / 2.0F
		&& class438_46_.aFloat4865 > class438.aFloat4865 - f_52_ / 2.0F
		&& (class438_46_.aFloat4865
		    < class438.aFloat4865 + f_52_ / 2.0F)) {
		float f_53_
		    = Math.abs(class438_46_.aFloat4864 - (class438.aFloat4864
							  + f_51_ / 2.0F));
		float f_54_
		    = Math.abs(class438_46_.aFloat4864 - (class438.aFloat4864
							  - f_51_ / 2.0F));
		float f_55_ = Math.abs(class438_46_.aFloat4865
				       - (f_52_ / 2.0F + class438.aFloat4864));
		float f_56_
		    = Math.abs(class438_46_.aFloat4865 - (class438.aFloat4864
							  - f_52_ / 2.0F));
		float f_57_ = f_45_ - f;
		float f_58_ = Math.min(f_53_, f_54_);
		float f_59_ = Math.min(f_55_, f_56_);
		float f_60_ = 1.0F / f_57_ * f_58_;
		float f_61_ = f_59_ * (1.0F / f_57_);
		f_60_ = Math.min(Math.max(f_60_, 0.0F), 1.0F);
		f_61_ = Math.min(Math.max(f_61_, 0.0F), 1.0F);
		f_48_ = Math.min(f_60_, f_61_);
	    }
	    if (0.0F != class438_47_.aFloat4864
		|| 0.0F != class438_47_.aFloat4865) {
		if (3 == -891094135 * Class10.anInt75) {
		    float f_62_
			= Class599.aClass298_Sub1_7871.method5389(-86619045);
		    if (class438_47_.aFloat4864 != 0.0F
			|| class438_47_.aFloat4865 != 0.0F) {
			int i_63_
			    = (((int) (2607.5945876176133
				       * (double) (-1.0F * f_62_))
				- (int) (Math.atan2((double) (class438_47_
							      .aFloat4864),
						    (double) (class438_47_
							      .aFloat4865))
					 * 2607.5945876176133)
				- 4096)
			       & 0x3fff);
			if (i_63_ > 8192)
			    i_63_ = 16384 - i_63_;
			int i_64_;
			if (f_49_ <= 0.0F)
			    i_64_ = 8192;
			else if (f_49_ >= 4096.0F)
			    i_64_ = 16384;
			else
			    i_64_
				= (int) (8192.0F + 8192.0F * f_49_ / 4096.0F);
			i = i_63_ * i_64_ / 8192 + (16384 - i_64_ >> 1);
		    }
		    f_50_ = 6.1035156E-5F * (float) i;
		} else {
		    int i_65_ = ((-(Class641.anInt8341 * -890112543)
				  - (int) (Math.atan2((double) (class438_47_
								.aFloat4864),
						      (double) (class438_47_
								.aFloat4865))
					   * 2607.5945876176133)
				  - 4096)
				 & 0x3fff);
		    if (i_65_ > 8192)
			i_65_ = 16384 - i_65_;
		    int i_66_;
		    if (f_49_ <= 0.0F)
			i_66_ = 8192;
		    else if (f_49_ >= 4096.0F)
			i_66_ = 16384;
		    else
			i_66_ = (int) (8192.0F * f_49_ / 4096.0F + 8192.0F);
		    i = (16384 - i_66_ >> 1) + i_66_ * i_65_ / 8192;
		    f_50_ = (float) i * 6.1035156E-5F;
		}
	    }
	}
	fs[0]
	    = (float) (i < 0 ? (double) f_48_
		       : (double) f_48_ * Math.sqrt((double) (1.0F - f_50_)));
	fs[1] = (float) (i < 0 ? (double) -f_48_
			 : (double) f_48_ * Math.sqrt((double) f_50_));
    }
    
    static final void method3792(Class669 class669, short i) {
	int i_67_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_67_, 1101531768);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_67_ >> 16];
	Class631.method10467(class247, class243, class669, (short) -23419);
    }
    
    static final void method3793(Class247 class247, Class243 class243,
				 Class669 class669, byte i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (Class546.method8989(string, class669, -219410121) != null)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2564
	    = Class99.method1859(string, class669, 1778799317);
	class247.aBool2561 = true;
    }
    
    public static int method3794(int i, int i_68_, int i_69_, int i_70_) {
	int i_71_ = Class211.method3958(i_69_ - i_68_ + 1, (byte) 2);
	i_71_ <<= i_68_;
	return i &= i_71_ ^ 0xffffffff;
    }
    
    public static void method3795(int i) {
	if (Class574.aBool7696) {
	    int i_72_ = Class523.aTwitchTV7088.ShutdownTTV();
	    if (0 == i_72_) {
		Class523.aTwitchTV7088 = null;
		Class574.aBool7696 = false;
	    }
	}
    }
    
    static final void method3796(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class246.method4505(class247, class243, class669, (byte) 58);
    }
    
    static final void method3797(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = class247.aString2533;
    }
}
