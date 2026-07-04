/* Class171_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class171_Sub3 extends Class171
{
    Class141_Sub2_Sub1 aClass141_Sub2_Sub1_9917;
    Class185_Sub3 aClass185_Sub3_9918;
    Class125 aClass125_9919;
    boolean aBool9920;
    
    void method2847(char c, int i, int i_0_, int i_1_, boolean bool,
		    Class145 class145, int i_2_, int i_3_) {
	Class145_Sub3 class145_sub3 = (Class145_Sub3) class145;
	Class141_Sub2_Sub1 class141_sub2_sub1
	    = class145_sub3.aClass141_Sub2_Sub1_9876;
	aClass185_Sub3_9918.method15225();
	aClass185_Sub3_9918.method15231(aClass141_Sub2_Sub1_9917);
	if (aBool9920 || bool) {
	    aClass185_Sub3_9918.method15232(7681, 8448);
	    aClass185_Sub3_9918.method15325(0, 34168, 768);
	} else
	    aClass185_Sub3_9918.method15232(7681, 7681);
	aClass185_Sub3_9918.method15230(1);
	aClass185_Sub3_9918.method15231(class141_sub2_sub1);
	aClass185_Sub3_9918.method15232(7681, 8448);
	aClass185_Sub3_9918.method15325(0, 34168, 768);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glTexGeni(8193, 9472, 9216);
	float f = (class141_sub2_sub1.aFloat11378
		   / (float) class141_sub2_sub1.anInt11379);
	float f_4_ = (class141_sub2_sub1.aFloat11380
		      / (float) class141_sub2_sub1.anInt11381);
	OpenGL.glTexGenfv(8192, 9474,
			  new float[] { f, 0.0F, 0.0F, (float) -i_2_ * f }, 0);
	OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_4_, 0.0F,
						    (float) -i_3_ * f_4_ }, 0);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	OpenGL.glColor4ub((byte) (i_1_ >> 16), (byte) (i_1_ >> 8), (byte) i_1_,
			  (byte) (i_1_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_0_, 0.0F);
	aClass125_9919.method2184(c);
	OpenGL.glLoadIdentity();
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	aClass185_Sub3_9918.method15325(0, 5890, 768);
	aClass185_Sub3_9918.method15232(8448, 8448);
	aClass185_Sub3_9918.method15231(null);
	aClass185_Sub3_9918.method15230(0);
	if (aBool9920 || bool)
	    aClass185_Sub3_9918.method15325(0, 5890, 768);
    }
    
    void method2860(char c, int i, int i_5_, int i_6_, boolean bool) {
	aClass185_Sub3_9918.method15225();
	aClass185_Sub3_9918.method15231(aClass141_Sub2_Sub1_9917);
	if (aBool9920 || bool) {
	    aClass185_Sub3_9918.method15232(7681, 8448);
	    aClass185_Sub3_9918.method15325(0, 34168, 768);
	} else
	    aClass185_Sub3_9918.method15232(7681, 7681);
	OpenGL.glColor4ub((byte) (i_6_ >> 16), (byte) (i_6_ >> 8), (byte) i_6_,
			  (byte) (i_6_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_5_, 0.0F);
	aClass125_9919.method2184(c);
	OpenGL.glLoadIdentity();
	if (aBool9920 || bool)
	    aClass185_Sub3_9918.method15325(0, 5890, 768);
    }
    
    void method2877(char c, int i, int i_7_, int i_8_, boolean bool,
		    Class145 class145, int i_9_, int i_10_) {
	Class145_Sub3 class145_sub3 = (Class145_Sub3) class145;
	Class141_Sub2_Sub1 class141_sub2_sub1
	    = class145_sub3.aClass141_Sub2_Sub1_9876;
	aClass185_Sub3_9918.method15225();
	aClass185_Sub3_9918.method15231(aClass141_Sub2_Sub1_9917);
	if (aBool9920 || bool) {
	    aClass185_Sub3_9918.method15232(7681, 8448);
	    aClass185_Sub3_9918.method15325(0, 34168, 768);
	} else
	    aClass185_Sub3_9918.method15232(7681, 7681);
	aClass185_Sub3_9918.method15230(1);
	aClass185_Sub3_9918.method15231(class141_sub2_sub1);
	aClass185_Sub3_9918.method15232(7681, 8448);
	aClass185_Sub3_9918.method15325(0, 34168, 768);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glTexGeni(8193, 9472, 9216);
	float f = (class141_sub2_sub1.aFloat11378
		   / (float) class141_sub2_sub1.anInt11379);
	float f_11_ = (class141_sub2_sub1.aFloat11380
		       / (float) class141_sub2_sub1.anInt11381);
	OpenGL.glTexGenfv(8192, 9474,
			  new float[] { f, 0.0F, 0.0F, (float) -i_9_ * f }, 0);
	OpenGL.glTexGenfv(8193, 9474,
			  new float[] { 0.0F, f_11_, 0.0F,
					(float) -i_10_ * f_11_ },
			  0);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	OpenGL.glColor4ub((byte) (i_8_ >> 16), (byte) (i_8_ >> 8), (byte) i_8_,
			  (byte) (i_8_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_7_, 0.0F);
	aClass125_9919.method2184(c);
	OpenGL.glLoadIdentity();
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	aClass185_Sub3_9918.method15325(0, 5890, 768);
	aClass185_Sub3_9918.method15232(8448, 8448);
	aClass185_Sub3_9918.method15231(null);
	aClass185_Sub3_9918.method15230(0);
	if (aBool9920 || bool)
	    aClass185_Sub3_9918.method15325(0, 5890, 768);
    }
    
    void method2845(char c, int i, int i_12_, int i_13_, boolean bool) {
	aClass185_Sub3_9918.method15225();
	aClass185_Sub3_9918.method15231(aClass141_Sub2_Sub1_9917);
	if (aBool9920 || bool) {
	    aClass185_Sub3_9918.method15232(7681, 8448);
	    aClass185_Sub3_9918.method15325(0, 34168, 768);
	} else
	    aClass185_Sub3_9918.method15232(7681, 7681);
	OpenGL.glColor4ub((byte) (i_13_ >> 16), (byte) (i_13_ >> 8),
			  (byte) i_13_, (byte) (i_13_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_12_, 0.0F);
	aClass125_9919.method2184(c);
	OpenGL.glLoadIdentity();
	if (aBool9920 || bool)
	    aClass185_Sub3_9918.method15325(0, 5890, 768);
    }
    
    Class171_Sub3(Class185_Sub3 class185_sub3, Class16 class16,
		  Class169[] class169s, boolean bool) {
	super(class185_sub3, class16);
	aClass185_Sub3_9918 = class185_sub3;
	int i = 0;
	for (int i_14_ = 0; i_14_ < 256; i_14_++) {
	    Class169 class169 = class169s[i_14_];
	    if (class169.method2763() > i)
		i = class169.method2763();
	    if (class169.method2762() > i)
		i = class169.method2762();
	}
	int i_15_ = i * 16;
	if (bool) {
	    byte[] is = new byte[i_15_ * i_15_];
	    for (int i_16_ = 0; i_16_ < 256; i_16_++) {
		Class169 class169 = class169s[i_16_];
		int i_17_ = class169.method2763();
		int i_18_ = class169.method2762();
		int i_19_ = i_16_ % 16 * i;
		int i_20_ = i_16_ / 16 * i;
		int i_21_ = i_20_ * i_15_ + i_19_;
		int i_22_ = 0;
		if (class169.method2760()) {
		    Class169_Sub2 class169_sub2
			= (Class169_Sub2) class169s[i_16_];
		    if (!class169_sub2.method2773()) {
			byte[] is_23_ = class169_sub2.aByteArray9796;
			for (int i_24_ = 0; i_24_ < i_17_; i_24_++) {
			    for (int i_25_ = 0; i_25_ < i_18_; i_25_++)
				is[i_21_++]
				    = (byte) (is_23_[i_22_++] == 0 ? 0 : -1);
			    i_21_ += i_15_ - i_18_;
			}
		    } else {
			byte[] is_26_ = class169_sub2.aByteArray9791;
			for (int i_27_ = 0; i_27_ < i_17_; i_27_++) {
			    for (int i_28_ = 0; i_28_ < i_18_; i_28_++)
				is[i_21_++] = is_26_[i_22_++];
			    i_21_ += i_15_ - i_18_;
			}
		    }
		} else {
		    Class169_Sub1 class169_sub1
			= (Class169_Sub1) class169s[i_16_];
		    int[] is_29_ = class169_sub1.method2766(false);
		    if (!class169_sub1.method2773()) {
			for (int i_30_ = 0; i_30_ < i_17_; i_30_++) {
			    for (int i_31_ = 0; i_31_ < i_18_; i_31_++) {
				int i_32_ = is_29_[i_22_++];
				byte i_33_ = (byte) (((i_32_ >> 16 & 0xff) * 3
						      + (i_32_ >> 8 & 0xff) * 4
						      + (i_32_ & 0xff))
						     >> 3);
				is[i_21_++] = i_33_;
			    }
			    i_21_ += i_15_ - i_18_;
			}
		    } else {
			for (int i_34_ = 0; i_34_ < i_17_; i_34_++) {
			    for (int i_35_ = 0; i_35_ < i_18_; i_35_++)
				is[i_21_++]
				    = (byte) (is_29_[i_22_++] >> 24 & 0xff);
			    i_21_ += i_15_ - i_18_;
			}
		    }
		}
	    }
	    aClass141_Sub2_Sub1_9917
		= Class141_Sub2_Sub1.method17902(class185_sub3,
						 Class181.aClass181_1951,
						 Class173.aClass173_1830,
						 i_15_, i_15_, false, is,
						 Class181.aClass181_1951);
	    aBool9920 = true;
	} else {
	    int[] is = new int[i_15_ * i_15_];
	    for (int i_36_ = 0; i_36_ < 256; i_36_++) {
		Class169 class169 = class169s[i_36_];
		int i_37_ = class169.method2763();
		int i_38_ = class169.method2762();
		int i_39_ = i_36_ % 16 * i;
		int i_40_ = i_36_ / 16 * i;
		int i_41_ = i_40_ * i_15_ + i_39_;
		int i_42_ = 0;
		if (class169.method2760()) {
		    Class169_Sub2 class169_sub2
			= (Class169_Sub2) class169s[i_36_];
		    int[] is_43_ = class169_sub2.anIntArray9794;
		    byte[] is_44_ = class169_sub2.aByteArray9791;
		    byte[] is_45_ = class169_sub2.aByteArray9796;
		    if (is_44_ != null) {
			for (int i_46_ = 0; i_46_ < i_37_; i_46_++) {
			    for (int i_47_ = 0; i_47_ < i_38_; i_47_++) {
				is[i_41_++] = (is_44_[i_42_] << 24
					       | is_43_[is_45_[i_42_] & 0xff]);
				i_42_++;
			    }
			    i_41_ += i_15_ - i_38_;
			}
		    } else {
			for (int i_48_ = 0; i_48_ < i_37_; i_48_++) {
			    for (int i_49_ = 0; i_49_ < i_38_; i_49_++) {
				int i_50_;
				if ((i_50_ = is_45_[i_42_++]) != 0)
				    is[i_41_++]
					= ~0xffffff | is_43_[i_50_ & 0xff];
				else
				    i_41_++;
			    }
			    i_41_ += i_15_ - i_38_;
			}
		    }
		} else {
		    Class169_Sub1 class169_sub1
			= (Class169_Sub1) class169s[i_36_];
		    int[] is_51_ = class169_sub1.method2766(false);
		    if (!class169_sub1.method2773()) {
			for (int i_52_ = 0; i_52_ < i_37_; i_52_++) {
			    for (int i_53_ = 0; i_53_ < i_38_; i_53_++) {
				int i_54_ = is_51_[i_42_] & 0xffffff;
				is[i_41_++]
				    = (i_54_ == 0 ? 0 : 255) << 24 | i_54_;
				i_42_++;
			    }
			    i_41_ += i_15_ - i_38_;
			}
		    } else {
			for (int i_55_ = 0; i_55_ < i_37_; i_55_++) {
			    for (int i_56_ = 0; i_56_ < i_38_; i_56_++)
				is[i_41_++] = is_51_[i_42_++];
			    i_41_ += i_15_ - i_38_;
			}
		    }
		}
	    }
	    aClass141_Sub2_Sub1_9917
		= Class141_Sub2_Sub1.method17895(class185_sub3, i_15_, i_15_,
						 false, is, 0, 0);
	    aBool9920 = false;
	}
	aClass141_Sub2_Sub1_9917.method2382(false);
	aClass125_9919 = new Class125(class185_sub3, 256);
	float f = (aClass141_Sub2_Sub1_9917.aFloat11378
		   / (float) aClass141_Sub2_Sub1_9917.anInt11379);
	float f_57_ = (aClass141_Sub2_Sub1_9917.aFloat11380
		       / (float) aClass141_Sub2_Sub1_9917.anInt11381);
	for (int i_58_ = 0; i_58_ < 256; i_58_++) {
	    Class169 class169 = class169s[i_58_];
	    int i_59_ = class169.method2763();
	    int i_60_ = class169.method2762();
	    int i_61_ = class169.method2781();
	    int i_62_ = class169.method2764();
	    float f_63_ = (float) (i_58_ % 16 * i);
	    float f_64_ = (float) (i_58_ / 16 * i);
	    float f_65_ = f_63_ * f;
	    float f_66_ = f_64_ * f_57_;
	    float f_67_ = (f_63_ + (float) i_60_) * f;
	    float f_68_ = (f_64_ + (float) i_59_) * f_57_;
	    aClass125_9919.method2185(i_58_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(f_65_,
				aClass141_Sub2_Sub1_9917.aFloat11380 - f_66_);
	    OpenGL.glVertex2i(i_62_, i_61_);
	    OpenGL.glTexCoord2f(f_65_,
				aClass141_Sub2_Sub1_9917.aFloat11380 - f_68_);
	    OpenGL.glVertex2i(i_62_, i_61_ + i_59_);
	    OpenGL.glTexCoord2f(f_67_,
				aClass141_Sub2_Sub1_9917.aFloat11380 - f_68_);
	    OpenGL.glVertex2i(i_62_ + i_60_, i_61_ + i_59_);
	    OpenGL.glTexCoord2f(f_67_,
				aClass141_Sub2_Sub1_9917.aFloat11380 - f_66_);
	    OpenGL.glVertex2i(i_62_ + i_60_, i_61_);
	    OpenGL.glEnd();
	    aClass125_9919.method2186();
	}
    }
    
    void method2848(char c, int i, int i_69_, int i_70_, boolean bool,
		    Class145 class145, int i_71_, int i_72_) {
	Class145_Sub3 class145_sub3 = (Class145_Sub3) class145;
	Class141_Sub2_Sub1 class141_sub2_sub1
	    = class145_sub3.aClass141_Sub2_Sub1_9876;
	aClass185_Sub3_9918.method15225();
	aClass185_Sub3_9918.method15231(aClass141_Sub2_Sub1_9917);
	if (aBool9920 || bool) {
	    aClass185_Sub3_9918.method15232(7681, 8448);
	    aClass185_Sub3_9918.method15325(0, 34168, 768);
	} else
	    aClass185_Sub3_9918.method15232(7681, 7681);
	aClass185_Sub3_9918.method15230(1);
	aClass185_Sub3_9918.method15231(class141_sub2_sub1);
	aClass185_Sub3_9918.method15232(7681, 8448);
	aClass185_Sub3_9918.method15325(0, 34168, 768);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glTexGeni(8193, 9472, 9216);
	float f = (class141_sub2_sub1.aFloat11378
		   / (float) class141_sub2_sub1.anInt11379);
	float f_73_ = (class141_sub2_sub1.aFloat11380
		       / (float) class141_sub2_sub1.anInt11381);
	OpenGL.glTexGenfv(8192, 9474,
			  new float[] { f, 0.0F, 0.0F, (float) -i_71_ * f },
			  0);
	OpenGL.glTexGenfv(8193, 9474,
			  new float[] { 0.0F, f_73_, 0.0F,
					(float) -i_72_ * f_73_ },
			  0);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	OpenGL.glColor4ub((byte) (i_70_ >> 16), (byte) (i_70_ >> 8),
			  (byte) i_70_, (byte) (i_70_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_69_, 0.0F);
	aClass125_9919.method2184(c);
	OpenGL.glLoadIdentity();
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	aClass185_Sub3_9918.method15325(0, 5890, 768);
	aClass185_Sub3_9918.method15232(8448, 8448);
	aClass185_Sub3_9918.method15231(null);
	aClass185_Sub3_9918.method15230(0);
	if (aBool9920 || bool)
	    aClass185_Sub3_9918.method15325(0, 5890, 768);
    }
    
    void method2846(char c, int i, int i_74_, int i_75_, boolean bool) {
	aClass185_Sub3_9918.method15225();
	aClass185_Sub3_9918.method15231(aClass141_Sub2_Sub1_9917);
	if (aBool9920 || bool) {
	    aClass185_Sub3_9918.method15232(7681, 8448);
	    aClass185_Sub3_9918.method15325(0, 34168, 768);
	} else
	    aClass185_Sub3_9918.method15232(7681, 7681);
	OpenGL.glColor4ub((byte) (i_75_ >> 16), (byte) (i_75_ >> 8),
			  (byte) i_75_, (byte) (i_75_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_74_, 0.0F);
	aClass125_9919.method2184(c);
	OpenGL.glLoadIdentity();
	if (aBool9920 || bool)
	    aClass185_Sub3_9918.method15325(0, 5890, 768);
    }
}
