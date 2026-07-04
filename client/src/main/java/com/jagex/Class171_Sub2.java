/* Class171_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;

public class Class171_Sub2 extends Class171
{
    Class185_Sub1 aClass185_Sub1_9910;
    Interface38 anInterface38_9911;
    Interface37 anInterface37_9912;
    byte[] aByteArray9913 = new byte[512];
    int anInt9914;
    int anInt9915;
    
    Class171_Sub2(Class185_Sub1 class185_sub1, Class16 class16,
		  Class169[] class169s, boolean bool) {
	super(class185_sub1, class16);
	aClass185_Sub1_9910 = class185_sub1;
	anInt9914 = 0;
	for (int i = 0; i < 256; i++) {
	    Class169 class169 = class169s[i];
	    if (class169.method2763() > anInt9914)
		anInt9914 = class169.method2763();
	    if (class169.method2762() > anInt9914)
		anInt9914 = class169.method2762();
	}
	anInt9915 = anInt9914 * 16;
	if (bool) {
	    byte[] is = new byte[anInt9915 * anInt9915];
	    for (int i = 0; i < 256; i++) {
		Class169 class169 = class169s[i];
		int i_0_ = class169.method2763();
		int i_1_ = class169.method2762();
		int i_2_ = i % 16 * anInt9914;
		int i_3_ = i / 16 * anInt9914;
		int i_4_ = i_3_ * anInt9915 + i_2_;
		int i_5_ = 0;
		if (class169.method2760()) {
		    Class169_Sub2 class169_sub2 = (Class169_Sub2) class169s[i];
		    if (!class169_sub2.method2773()) {
			byte[] is_6_ = class169_sub2.aByteArray9796;
			for (int i_7_ = 0; i_7_ < i_0_; i_7_++) {
			    for (int i_8_ = 0; i_8_ < i_1_; i_8_++)
				is[i_4_++]
				    = (byte) (is_6_[i_5_++] == 0 ? 0 : -1);
			    i_4_ += anInt9915 - i_1_;
			}
		    } else {
			byte[] is_9_ = class169_sub2.aByteArray9791;
			for (int i_10_ = 0; i_10_ < i_0_; i_10_++) {
			    for (int i_11_ = 0; i_11_ < i_1_; i_11_++)
				is[i_4_++] = is_9_[i_5_++];
			    i_4_ += anInt9915 - i_1_;
			}
		    }
		} else {
		    Class169_Sub1 class169_sub1 = (Class169_Sub1) class169s[i];
		    int[] is_12_ = class169_sub1.method2766(false);
		    if (!class169_sub1.method2773()) {
			for (int i_13_ = 0; i_13_ < i_0_; i_13_++) {
			    for (int i_14_ = 0; i_14_ < i_1_; i_14_++) {
				int i_15_ = is_12_[i_5_++];
				byte i_16_ = (byte) (((i_15_ >> 16 & 0xff) * 3
						      + (i_15_ >> 8 & 0xff) * 4
						      + (i_15_ & 0xff))
						     >> 3);
				is[i_4_++] = i_16_;
			    }
			    i_4_ += anInt9915 - i_1_;
			}
		    } else {
			for (int i_17_ = 0; i_17_ < i_0_; i_17_++) {
			    for (int i_18_ = 0; i_18_ < i_1_; i_18_++)
				is[i_4_++]
				    = (byte) (is_12_[i_5_++] >> 24 & 0xff);
			    i_4_ += anInt9915 - i_1_;
			}
		    }
		}
	    }
	    int[] is_19_ = new int[is.length];
	    for (int i = 0; i < is.length; i++)
		is_19_[i] = is[i] << 24 | 0xffffff;
	    anInterface38_9911
		= class185_sub1.method14658(anInt9915, anInt9915, false,
					    is_19_);
	} else {
	    int[] is = new int[anInt9915 * anInt9915];
	    for (int i = 0; i < 256; i++) {
		Class169 class169 = class169s[i];
		int i_20_ = class169.method2763();
		int i_21_ = class169.method2762();
		int i_22_ = i % 16 * anInt9914;
		int i_23_ = i / 16 * anInt9914;
		int i_24_ = i_23_ * anInt9915 + i_22_;
		int i_25_ = 0;
		if (class169.method2760()) {
		    Class169_Sub2 class169_sub2 = (Class169_Sub2) class169s[i];
		    int[] is_26_ = class169_sub2.anIntArray9794;
		    byte[] is_27_ = class169_sub2.aByteArray9791;
		    byte[] is_28_ = class169_sub2.aByteArray9796;
		    if (is_27_ != null) {
			for (int i_29_ = 0; i_29_ < i_20_; i_29_++) {
			    for (int i_30_ = 0; i_30_ < i_21_; i_30_++) {
				is[i_24_++] = (is_27_[i_25_] << 24
					       | is_26_[is_28_[i_25_] & 0xff]);
				i_25_++;
			    }
			    i_24_ += anInt9915 - i_21_;
			}
		    } else {
			for (int i_31_ = 0; i_31_ < i_20_; i_31_++) {
			    for (int i_32_ = 0; i_32_ < i_21_; i_32_++) {
				int i_33_;
				if ((i_33_ = is_28_[i_25_++]) != 0)
				    is[i_24_++]
					= ~0xffffff | is_26_[i_33_ & 0xff];
				else
				    i_24_++;
			    }
			    i_24_ += anInt9915 - i_21_;
			}
		    }
		} else {
		    Class169_Sub1 class169_sub1 = (Class169_Sub1) class169s[i];
		    int[] is_34_ = class169_sub1.method2766(false);
		    if (!class169_sub1.method2773()) {
			for (int i_35_ = 0; i_35_ < i_20_; i_35_++) {
			    for (int i_36_ = 0; i_36_ < i_21_; i_36_++) {
				int i_37_ = is_34_[i_25_] & 0xffffff;
				is[i_24_++]
				    = (i_37_ == 0 ? 0 : 255) << 24 | i_37_;
				i_25_++;
			    }
			    i_24_ += anInt9915 - i_21_;
			}
		    } else {
			for (int i_38_ = 0; i_38_ < i_20_; i_38_++) {
			    for (int i_39_ = 0; i_39_ < i_21_; i_39_++)
				is[i_24_++] = is_34_[i_25_++];
			    i_24_ += anInt9915 - i_21_;
			}
		    }
		}
	    }
	    anInterface38_9911
		= class185_sub1.method14658(anInt9915, anInt9915, false, is);
	}
	anInterface38_9911.method339(Class372.aClass372_3889);
	anInterface37_9912 = class185_sub1.method14698(false);
	anInterface37_9912.method236(20480, 20);
	ByteBuffer bytebuffer = aClass185_Sub1_9910.aByteBuffer9266;
	bytebuffer.clear();
	float f = (anInterface38_9911.method241((float) anInt9915)
		   / (float) anInt9915);
	float f_40_ = (anInterface38_9911.method245((float) anInt9915)
		       / (float) anInt9915);
	for (int i = 0; i < 256; i++) {
	    Class169 class169 = class169s[i];
	    int i_41_ = class169.method2763();
	    int i_42_ = class169.method2762();
	    int i_43_ = class169.method2781();
	    int i_44_ = class169.method2764();
	    float f_45_ = (float) (i % 16 * anInt9914);
	    float f_46_ = (float) (i / 16 * anInt9914);
	    float f_47_ = f_45_ * f;
	    float f_48_ = f_46_ * f_40_;
	    float f_49_ = (f_45_ + (float) i_42_) * f;
	    float f_50_ = (f_46_ + (float) i_41_) * f_40_;
	    bytebuffer.putFloat((float) i_44_);
	    bytebuffer.putFloat((float) i_43_);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(f_47_);
	    bytebuffer.putFloat(f_48_);
	    bytebuffer.putFloat((float) i_44_);
	    bytebuffer.putFloat((float) (i_43_ + i_41_));
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(f_47_);
	    bytebuffer.putFloat(f_50_);
	    bytebuffer.putFloat((float) (i_44_ + i_42_));
	    bytebuffer.putFloat((float) (i_43_ + i_41_));
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(f_49_);
	    bytebuffer.putFloat(f_50_);
	    bytebuffer.putFloat((float) (i_44_ + i_42_));
	    bytebuffer.putFloat((float) i_43_);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(f_49_);
	    bytebuffer.putFloat(f_48_);
	}
	anInterface37_9912.method235(0, bytebuffer.position(),
				     aClass185_Sub1_9910.aLong9139);
	for (int i = 0; i < 256; i++) {
	    Class169 class169 = class169s[i];
	    aByteArray9913[i * 2] = (byte) class169.method2764();
	    aByteArray9913[i * 2 + 1] = (byte) class169.method2781();
	}
    }
    
    void method2860(char c, int i, int i_51_, int i_52_, boolean bool) {
	if (aClass185_Sub1_9910.method14703() != Class353.aClass353_3655) {
	    i += aByteArray9913[c * '\002'];
	    i_51_ += aByteArray9913[c * '\002' + '\001'];
	    aClass185_Sub1_9910.aClass371_9147.method6384
		((float) i, (float) i_51_, (float) (i + anInt9914),
		 (float) (i_51_ + anInt9914),
		 (float) (c % '\020') / 16.0F * anInterface38_9911.method250(),
		 (float) (c / '\020') / 16.0F * anInterface38_9911.method249(),
		 ((float) (c % '\020' + '\001') / 16.0F
		  * anInterface38_9911.method250()),
		 ((float) (c / '\020' + '\001') / 16.0F
		  * anInterface38_9911.method249()),
		 anInterface38_9911, i_52_);
	} else {
	    aClass185_Sub1_9910.method14593();
	    aClass185_Sub1_9910.method14687(1);
	    Class320 class320 = aClass185_Sub1_9910.aClass320_9232;
	    class320.anInterface38_3403 = anInterface38_9911;
	    class320.method5765(0, i_52_);
	    float f = (float) aClass185_Sub1_9910.method3253(-1653799871)
				  .method2910();
	    float f_53_ = (float) aClass185_Sub1_9910.method3253
				      (-926177208).method2911();
	    class320.aClass433_3409.method6952(2.0F / f, 2.0F / f_53_, 1.0F,
					       1.0F);
	    class320.aClass433_3409.aFloatArray4853[12]
		= (((float) i + aClass185_Sub1_9910.method14715()) * 2.0F / f
		   - 1.0F);
	    class320.aClass433_3409.aFloatArray4853[13]
		= (((float) i_51_ + aClass185_Sub1_9910.method14715()) * 2.0F
		   / f_53_) - 1.0F;
	    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
	    class320.aClass433_3406.method6840();
	    class320.anInterface37_3410 = anInterface37_9912;
	    class320.anInt3404 = c * '\004';
	    class320.aClass349_3411 = aClass185_Sub1_9910.aClass349_9286;
	    class320.method5767();
	}
    }
    
    void method2846(char c, int i, int i_54_, int i_55_, boolean bool) {
	if (aClass185_Sub1_9910.method14703() != Class353.aClass353_3655) {
	    i += aByteArray9913[c * '\002'];
	    i_54_ += aByteArray9913[c * '\002' + '\001'];
	    aClass185_Sub1_9910.aClass371_9147.method6384
		((float) i, (float) i_54_, (float) (i + anInt9914),
		 (float) (i_54_ + anInt9914),
		 (float) (c % '\020') / 16.0F * anInterface38_9911.method250(),
		 (float) (c / '\020') / 16.0F * anInterface38_9911.method249(),
		 ((float) (c % '\020' + '\001') / 16.0F
		  * anInterface38_9911.method250()),
		 ((float) (c / '\020' + '\001') / 16.0F
		  * anInterface38_9911.method249()),
		 anInterface38_9911, i_55_);
	} else {
	    aClass185_Sub1_9910.method14593();
	    aClass185_Sub1_9910.method14687(1);
	    Class320 class320 = aClass185_Sub1_9910.aClass320_9232;
	    class320.anInterface38_3403 = anInterface38_9911;
	    class320.method5765(0, i_55_);
	    float f = (float) aClass185_Sub1_9910.method3253(-1320861506)
				  .method2910();
	    float f_56_ = (float) aClass185_Sub1_9910.method3253
				      (-1693001869).method2911();
	    class320.aClass433_3409.method6952(2.0F / f, 2.0F / f_56_, 1.0F,
					       1.0F);
	    class320.aClass433_3409.aFloatArray4853[12]
		= (((float) i + aClass185_Sub1_9910.method14715()) * 2.0F / f
		   - 1.0F);
	    class320.aClass433_3409.aFloatArray4853[13]
		= (((float) i_54_ + aClass185_Sub1_9910.method14715()) * 2.0F
		   / f_56_) - 1.0F;
	    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
	    class320.aClass433_3406.method6840();
	    class320.anInterface37_3410 = anInterface37_9912;
	    class320.anInt3404 = c * '\004';
	    class320.aClass349_3411 = aClass185_Sub1_9910.aClass349_9286;
	    class320.method5767();
	}
    }
    
    void method2877(char c, int i, int i_57_, int i_58_, boolean bool,
		    Class145 class145, int i_59_, int i_60_) {
	/* empty */
    }
    
    void method2845(char c, int i, int i_61_, int i_62_, boolean bool) {
	if (aClass185_Sub1_9910.method14703() != Class353.aClass353_3655) {
	    i += aByteArray9913[c * '\002'];
	    i_61_ += aByteArray9913[c * '\002' + '\001'];
	    aClass185_Sub1_9910.aClass371_9147.method6384
		((float) i, (float) i_61_, (float) (i + anInt9914),
		 (float) (i_61_ + anInt9914),
		 (float) (c % '\020') / 16.0F * anInterface38_9911.method250(),
		 (float) (c / '\020') / 16.0F * anInterface38_9911.method249(),
		 ((float) (c % '\020' + '\001') / 16.0F
		  * anInterface38_9911.method250()),
		 ((float) (c / '\020' + '\001') / 16.0F
		  * anInterface38_9911.method249()),
		 anInterface38_9911, i_62_);
	} else {
	    aClass185_Sub1_9910.method14593();
	    aClass185_Sub1_9910.method14687(1);
	    Class320 class320 = aClass185_Sub1_9910.aClass320_9232;
	    class320.anInterface38_3403 = anInterface38_9911;
	    class320.method5765(0, i_62_);
	    float f = (float) aClass185_Sub1_9910.method3253(-341930305)
				  .method2910();
	    float f_63_ = (float) aClass185_Sub1_9910.method3253
				      (-1764321522).method2911();
	    class320.aClass433_3409.method6952(2.0F / f, 2.0F / f_63_, 1.0F,
					       1.0F);
	    class320.aClass433_3409.aFloatArray4853[12]
		= (((float) i + aClass185_Sub1_9910.method14715()) * 2.0F / f
		   - 1.0F);
	    class320.aClass433_3409.aFloatArray4853[13]
		= (((float) i_61_ + aClass185_Sub1_9910.method14715()) * 2.0F
		   / f_63_) - 1.0F;
	    class320.aClass433_3409.aFloatArray4853[14] = -1.0F;
	    class320.aClass433_3406.method6840();
	    class320.anInterface37_3410 = anInterface37_9912;
	    class320.anInt3404 = c * '\004';
	    class320.aClass349_3411 = aClass185_Sub1_9910.aClass349_9286;
	    class320.method5767();
	}
    }
    
    void method2847(char c, int i, int i_64_, int i_65_, boolean bool,
		    Class145 class145, int i_66_, int i_67_) {
	/* empty */
    }
    
    void method2848(char c, int i, int i_68_, int i_69_, boolean bool,
		    Class145 class145, int i_70_, int i_71_) {
	/* empty */
    }
}
