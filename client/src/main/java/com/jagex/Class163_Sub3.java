/* Class163_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class163_Sub3 extends Class163
{
    int anInt9772;
    Class185_Sub3 aClass185_Sub3_9773;
    Class141_Sub2_Sub1 aClass141_Sub2_Sub1_9774;
    int anInt9775 = 0;
    boolean aBool9776 = false;
    int anInt9777 = 0;
    int anInt9778;
    int anInt9779;
    Class141_Sub2_Sub1 aClass141_Sub2_Sub1_9780;
    
    public void method2706(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			   int i_4_, int i_5_) {
	int i_6_ = i + i_1_;
	int i_7_ = i_0_ + i_2_;
	aClass141_Sub2_Sub1_9774.method2382(false);
	aClass185_Sub3_9773.method15224();
	aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
	aClass185_Sub3_9773.method15246(i_5_);
	aClass185_Sub3_9773.method15214(i_3_);
	OpenGL.glColor4ub((byte) (i_4_ >> 16), (byte) (i_4_ >> 8), (byte) i_4_,
			  (byte) (i_4_ >> 24));
	if (aClass141_Sub2_Sub1_9774.aBool11382 && !aBool9776
	    && i_2_ >= aClass141_Sub2_Sub1_9774.anInt11381
	    && i_1_ >= aClass141_Sub2_Sub1_9774.anInt11379) {
	    float f = (aClass141_Sub2_Sub1_9774.aFloat11380 * (float) i_2_
		       / (float) aClass141_Sub2_Sub1_9774.anInt11381);
	    float f_8_ = (aClass141_Sub2_Sub1_9774.aFloat11378 * (float) i_1_
			  / (float) aClass141_Sub2_Sub1_9774.anInt11379);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, f);
	    OpenGL.glVertex2i(i, i_0_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_7_);
	    OpenGL.glTexCoord2f(f_8_, 0.0F);
	    OpenGL.glVertex2i(i_6_, i_7_);
	    OpenGL.glTexCoord2f(f_8_, f);
	    OpenGL.glVertex2i(i_6_, i_0_);
	    OpenGL.glEnd();
	} else {
	    OpenGL.glPushMatrix();
	    OpenGL.glTranslatef((float) anInt9772, (float) anInt9777, 0.0F);
	    int i_9_ = method22();
	    int i_10_ = method2692();
	    int i_11_ = i_0_ + aClass141_Sub2_Sub1_9774.anInt11381;
	    OpenGL.glBegin(7);
	    int i_12_ = i_0_;
	    for (/**/; i_11_ <= i_7_; i_11_ += i_10_) {
		int i_13_ = i + aClass141_Sub2_Sub1_9774.anInt11379;
		int i_14_ = i;
		while (i_13_ <= i_6_) {
		    OpenGL.glTexCoord2f(0.0F,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_14_, i_12_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(i_14_, i_11_);
		    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
					0.0F);
		    OpenGL.glVertex2i(i_13_, i_11_);
		    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_13_, i_12_);
		    i_13_ += i_9_;
		    i_14_ += i_9_;
		}
		if (i_14_ < i_6_) {
		    float f = (aClass141_Sub2_Sub1_9774.aFloat11378
			       * (float) (i_6_ - i_14_)
			       / (float) aClass141_Sub2_Sub1_9774.anInt11379);
		    OpenGL.glTexCoord2f(0.0F,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_14_, i_12_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(i_14_, i_11_);
		    OpenGL.glTexCoord2f(f, 0.0F);
		    OpenGL.glVertex2i(i_6_, i_11_);
		    OpenGL.glTexCoord2f(f,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_6_, i_12_);
		}
		i_12_ += i_10_;
	    }
	    if (i_12_ < i_7_) {
		float f = (aClass141_Sub2_Sub1_9774.aFloat11380
			   * (float) (aClass141_Sub2_Sub1_9774.anInt11381
				      - (i_7_ - i_12_))
			   / (float) aClass141_Sub2_Sub1_9774.anInt11381);
		int i_15_ = i + aClass141_Sub2_Sub1_9774.anInt11379;
		int i_16_ = i;
		while (i_15_ <= i_6_) {
		    OpenGL.glTexCoord2f(0.0F,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_16_, i_12_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(i_16_, i_7_);
		    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
					f);
		    OpenGL.glVertex2i(i_15_, i_7_);
		    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_15_, i_12_);
		    i_15_ += i_9_;
		    i_16_ += i_9_;
		}
		if (i_16_ < i_6_) {
		    float f_17_
			= (aClass141_Sub2_Sub1_9774.aFloat11378
			   * (float) (i_6_ - i_16_)
			   / (float) aClass141_Sub2_Sub1_9774.anInt11379);
		    OpenGL.glTexCoord2f(0.0F,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_16_, i_12_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(i_16_, i_7_);
		    OpenGL.glTexCoord2f(f_17_, f);
		    OpenGL.glVertex2i(i_6_, i_7_);
		    OpenGL.glTexCoord2f(f_17_,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_6_, i_12_);
		}
	    }
	    OpenGL.glEnd();
	    OpenGL.glPopMatrix();
	}
    }
    
    Class163_Sub3(Class185_Sub3 class185_sub3, int i, int i_18_, int i_19_,
		  int i_20_) {
	anInt9772 = 0;
	anInt9779 = 0;
	anInt9778 = 0;
	aClass185_Sub3_9773 = class185_sub3;
	aClass141_Sub2_Sub1_9774
	    = Class141_Sub2_Sub1.method17896(class185_sub3, i, i_18_, i_19_,
					     i_20_);
    }
    
    public void method2699(int i, int i_21_, int i_22_) {
	OpenGL.glPixelTransferf(3348, 0.5F);
	OpenGL.glPixelTransferf(3349, 0.499F);
	OpenGL.glPixelTransferf(3352, 0.5F);
	OpenGL.glPixelTransferf(3353, 0.499F);
	OpenGL.glPixelTransferf(3354, 0.5F);
	OpenGL.glPixelTransferf(3355, 0.499F);
	aClass141_Sub2_Sub1_9780
	    = Class141_Sub2_Sub1.method17896(aClass185_Sub3_9773, i, i_21_,
					     (aClass141_Sub2_Sub1_9774
					      .anInt11379),
					     (aClass141_Sub2_Sub1_9774
					      .anInt11381));
	anInt9775 = i_22_;
	OpenGL.glPixelTransferf(3348, 1.0F);
	OpenGL.glPixelTransferf(3349, 0.0F);
	OpenGL.glPixelTransferf(3352, 1.0F);
	OpenGL.glPixelTransferf(3353, 0.0F);
	OpenGL.glPixelTransferf(3354, 1.0F);
	OpenGL.glPixelTransferf(3355, 0.0F);
    }
    
    void method15484() {
	aClass185_Sub3_9773.method15230(1);
	aClass185_Sub3_9773.method15231(null);
	aClass185_Sub3_9773.method15232(8448, 8448);
	aClass185_Sub3_9773.method15325(1, 34168, 768);
	aClass185_Sub3_9773.method15239(0, 5890, 770);
	aClass185_Sub3_9773.method15230(0);
	aClass185_Sub3_9773.method15325(1, 34168, 768);
    }
    
    public void method2646(int[] is) {
	is[0] = anInt9772;
	is[1] = anInt9777;
	is[2] = anInt9778;
	is[3] = anInt9779;
    }
    
    public int method2647() {
	return aClass141_Sub2_Sub1_9774.anInt11379;
    }
    
    void method2719(float f, float f_23_, float f_24_, float f_25_,
		    float f_26_, float f_27_, int i, int i_28_, int i_29_,
		    int i_30_) {
	if (aBool9776) {
	    float f_31_ = (float) method22();
	    float f_32_ = (float) method2692();
	    float f_33_ = (f_24_ - f) / f_31_;
	    float f_34_ = (f_25_ - f_23_) / f_31_;
	    float f_35_ = (f_26_ - f) / f_32_;
	    float f_36_ = (f_27_ - f_23_) / f_32_;
	    float f_37_ = f_35_ * (float) anInt9777;
	    float f_38_ = f_36_ * (float) anInt9777;
	    float f_39_ = f_33_ * (float) anInt9772;
	    float f_40_ = f_34_ * (float) anInt9772;
	    float f_41_ = -f_33_ * (float) anInt9778;
	    float f_42_ = -f_34_ * (float) anInt9778;
	    float f_43_ = -f_35_ * (float) anInt9779;
	    float f_44_ = -f_36_ * (float) anInt9779;
	    f = f + f_39_ + f_37_;
	    f_23_ = f_23_ + f_40_ + f_38_;
	    f_24_ = f_24_ + f_41_ + f_37_;
	    f_25_ = f_25_ + f_42_ + f_38_;
	    f_26_ = f_26_ + f_39_ + f_43_;
	    f_27_ = f_27_ + f_40_ + f_44_;
	}
	float f_45_ = f_26_ + (f_24_ - f);
	float f_46_ = f_25_ + (f_27_ - f_23_);
	aClass141_Sub2_Sub1_9774.method2382((i_30_ & 0x1) != 0);
	aClass185_Sub3_9773.method15224();
	aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
	aClass185_Sub3_9773.method15246(i_29_);
	aClass185_Sub3_9773.method15214(i);
	OpenGL.glColor4ub((byte) (i_28_ >> 16), (byte) (i_28_ >> 8),
			  (byte) i_28_, (byte) (i_28_ >> 24));
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, aClass141_Sub2_Sub1_9774.aFloat11380);
	OpenGL.glVertex2f(f, f_23_);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2f(f_26_, f_27_);
	OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378, 0.0F);
	OpenGL.glVertex2f(f_45_, f_46_);
	OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
			    aClass141_Sub2_Sub1_9774.aFloat11380);
	OpenGL.glVertex2f(f_24_, f_25_);
	OpenGL.glEnd();
    }
    
    public int method2649() {
	return aClass141_Sub2_Sub1_9774.anInt11381;
    }
    
    public int method2692() {
	return aClass141_Sub2_Sub1_9774.anInt11381 + anInt9777 + anInt9779;
    }
    
    public Interface22 method2651() {
	return aClass141_Sub2_Sub1_9774.method14451(0);
    }
    
    public void method2717(int i, int i_47_, int i_48_, int i_49_, int i_50_,
			   int i_51_) {
	method15485(i, i_47_, i_48_, i_49_, i_50_, i_51_, false);
    }
    
    void method15485(int i, int i_52_, int i_53_, int i_54_, int i_55_,
		     int i_56_, boolean bool) {
	if (aClass185_Sub3_9773.aBool9582 && !bool) {
	    int[] is
		= aClass185_Sub3_9773.method3267(i_55_, i_56_, i_53_, i_54_);
	    if (is != null) {
		for (int i_57_ = 0; i_57_ < is.length; i_57_++)
		    is[i_57_] |= ~0xffffff;
		method2652(i, i_52_, i_53_, i_54_, is, 0, i_53_);
	    }
	} else
	    aClass141_Sub2_Sub1_9774.method14452(i, i_52_, i_53_, i_54_, i_55_,
						 i_56_);
    }
    
    public void method2655(int i, int i_58_, int i_59_) {
	OpenGL.glPixelTransferf(3348, 0.5F);
	OpenGL.glPixelTransferf(3349, 0.499F);
	OpenGL.glPixelTransferf(3352, 0.5F);
	OpenGL.glPixelTransferf(3353, 0.499F);
	OpenGL.glPixelTransferf(3354, 0.5F);
	OpenGL.glPixelTransferf(3355, 0.499F);
	aClass141_Sub2_Sub1_9780
	    = Class141_Sub2_Sub1.method17896(aClass185_Sub3_9773, i, i_58_,
					     (aClass141_Sub2_Sub1_9774
					      .anInt11379),
					     (aClass141_Sub2_Sub1_9774
					      .anInt11381));
	anInt9775 = i_59_;
	OpenGL.glPixelTransferf(3348, 1.0F);
	OpenGL.glPixelTransferf(3349, 0.0F);
	OpenGL.glPixelTransferf(3352, 1.0F);
	OpenGL.glPixelTransferf(3353, 0.0F);
	OpenGL.glPixelTransferf(3354, 1.0F);
	OpenGL.glPixelTransferf(3355, 0.0F);
    }
    
    public void method2663(int i, int i_60_, int i_61_, int i_62_, int i_63_,
			   int i_64_, int i_65_) {
	int i_66_ = i + i_61_;
	int i_67_ = i_60_ + i_62_;
	aClass141_Sub2_Sub1_9774.method2382(false);
	aClass185_Sub3_9773.method15224();
	aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
	aClass185_Sub3_9773.method15246(i_65_);
	aClass185_Sub3_9773.method15214(i_63_);
	OpenGL.glColor4ub((byte) (i_64_ >> 16), (byte) (i_64_ >> 8),
			  (byte) i_64_, (byte) (i_64_ >> 24));
	if (aClass141_Sub2_Sub1_9774.aBool11382 && !aBool9776
	    && i_62_ >= aClass141_Sub2_Sub1_9774.anInt11381
	    && i_61_ >= aClass141_Sub2_Sub1_9774.anInt11379) {
	    float f = (aClass141_Sub2_Sub1_9774.aFloat11380 * (float) i_62_
		       / (float) aClass141_Sub2_Sub1_9774.anInt11381);
	    float f_68_ = (aClass141_Sub2_Sub1_9774.aFloat11378 * (float) i_61_
			   / (float) aClass141_Sub2_Sub1_9774.anInt11379);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, f);
	    OpenGL.glVertex2i(i, i_60_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_67_);
	    OpenGL.glTexCoord2f(f_68_, 0.0F);
	    OpenGL.glVertex2i(i_66_, i_67_);
	    OpenGL.glTexCoord2f(f_68_, f);
	    OpenGL.glVertex2i(i_66_, i_60_);
	    OpenGL.glEnd();
	} else {
	    OpenGL.glPushMatrix();
	    OpenGL.glTranslatef((float) anInt9772, (float) anInt9777, 0.0F);
	    int i_69_ = method22();
	    int i_70_ = method2692();
	    int i_71_ = i_60_ + aClass141_Sub2_Sub1_9774.anInt11381;
	    OpenGL.glBegin(7);
	    int i_72_ = i_60_;
	    for (/**/; i_71_ <= i_67_; i_71_ += i_70_) {
		int i_73_ = i + aClass141_Sub2_Sub1_9774.anInt11379;
		int i_74_ = i;
		while (i_73_ <= i_66_) {
		    OpenGL.glTexCoord2f(0.0F,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_74_, i_72_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(i_74_, i_71_);
		    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
					0.0F);
		    OpenGL.glVertex2i(i_73_, i_71_);
		    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_73_, i_72_);
		    i_73_ += i_69_;
		    i_74_ += i_69_;
		}
		if (i_74_ < i_66_) {
		    float f = (aClass141_Sub2_Sub1_9774.aFloat11378
			       * (float) (i_66_ - i_74_)
			       / (float) aClass141_Sub2_Sub1_9774.anInt11379);
		    OpenGL.glTexCoord2f(0.0F,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_74_, i_72_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(i_74_, i_71_);
		    OpenGL.glTexCoord2f(f, 0.0F);
		    OpenGL.glVertex2i(i_66_, i_71_);
		    OpenGL.glTexCoord2f(f,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_66_, i_72_);
		}
		i_72_ += i_70_;
	    }
	    if (i_72_ < i_67_) {
		float f = (aClass141_Sub2_Sub1_9774.aFloat11380
			   * (float) (aClass141_Sub2_Sub1_9774.anInt11381
				      - (i_67_ - i_72_))
			   / (float) aClass141_Sub2_Sub1_9774.anInt11381);
		int i_75_ = i + aClass141_Sub2_Sub1_9774.anInt11379;
		int i_76_ = i;
		while (i_75_ <= i_66_) {
		    OpenGL.glTexCoord2f(0.0F,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_76_, i_72_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(i_76_, i_67_);
		    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
					f);
		    OpenGL.glVertex2i(i_75_, i_67_);
		    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_75_, i_72_);
		    i_75_ += i_69_;
		    i_76_ += i_69_;
		}
		if (i_76_ < i_66_) {
		    float f_77_
			= (aClass141_Sub2_Sub1_9774.aFloat11378
			   * (float) (i_66_ - i_76_)
			   / (float) aClass141_Sub2_Sub1_9774.anInt11379);
		    OpenGL.glTexCoord2f(0.0F,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_76_, i_72_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(i_76_, i_67_);
		    OpenGL.glTexCoord2f(f_77_, f);
		    OpenGL.glVertex2i(i_66_, i_67_);
		    OpenGL.glTexCoord2f(f_77_,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_66_, i_72_);
		}
	    }
	    OpenGL.glEnd();
	    OpenGL.glPopMatrix();
	}
    }
    
    public void method2653(int i, int i_78_, int i_79_, int i_80_, int[] is,
			   int[] is_81_, int i_82_, int i_83_) {
	aClass141_Sub2_Sub1_9774.method14446(i, i_78_, i_79_, i_80_, is,
					     is_81_, i_82_);
    }
    
    void method15486(int i) {
	aClass185_Sub3_9773.method15230(1);
	aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
	aClass185_Sub3_9773.method15232(aClass185_Sub3_9773.method15298(i),
					7681);
	aClass185_Sub3_9773.method15325(1, 34167, 768);
	aClass185_Sub3_9773.method15239(0, 34168, 770);
	aClass185_Sub3_9773.method15230(0);
	aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9780);
	aClass185_Sub3_9773.method15232(34479, 7681);
	aClass185_Sub3_9773.method15325(1, 34166, 768);
	if (anInt9775 == 0)
	    aClass185_Sub3_9773.method15236(1.0F, 0.5F, 0.5F, 0.0F);
	else if (anInt9775 == 1)
	    aClass185_Sub3_9773.method15236(0.5F, 1.0F, 0.5F, 0.0F);
	else if (anInt9775 == 2)
	    aClass185_Sub3_9773.method15236(0.5F, 0.5F, 1.0F, 0.0F);
	else if (anInt9775 == 3)
	    aClass185_Sub3_9773.method15236(128.5F, 128.5F, 128.5F, 0.0F);
    }
    
    public void method2679(int i, int i_84_, int i_85_, int i_86_) {
	anInt9772 = i;
	anInt9777 = i_84_;
	anInt9778 = i_85_;
	anInt9779 = i_86_;
	aBool9776 = (anInt9772 != 0 || anInt9777 != 0 || anInt9778 != 0
		     || anInt9779 != 0);
    }
    
    public void method2657(int i, int i_87_, int i_88_, int i_89_, int i_90_) {
	aClass141_Sub2_Sub1_9774.method2382(false);
	aClass185_Sub3_9773.method15224();
	aClass185_Sub3_9773.method15246(i_90_);
	OpenGL.glColor4ub((byte) (i_89_ >> 16), (byte) (i_89_ >> 8),
			  (byte) i_89_, (byte) (i_89_ >> 24));
	i += anInt9772;
	i_87_ += anInt9777;
	if (aClass141_Sub2_Sub1_9780 == null) {
	    aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
	    aClass185_Sub3_9773.method15214(i_88_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i, i_87_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_87_ + aClass141_Sub2_Sub1_9774.anInt11381);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378, 0.0F);
	    OpenGL.glVertex2i(i + aClass141_Sub2_Sub1_9774.anInt11379,
			      i_87_ + aClass141_Sub2_Sub1_9774.anInt11381);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i + aClass141_Sub2_Sub1_9774.anInt11379, i_87_);
	    OpenGL.glEnd();
	} else {
	    method15486(i_88_);
	    aClass141_Sub2_Sub1_9780.method2382(false);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glTexCoord2f(0.0F, aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i, i_87_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_87_ + aClass141_Sub2_Sub1_9774.anInt11381);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass141_Sub2_Sub1_9774.aFloat11378,
				     0.0F);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378, 0.0F);
	    OpenGL.glVertex2i(i + aClass141_Sub2_Sub1_9774.anInt11379,
			      i_87_ + aClass141_Sub2_Sub1_9774.anInt11381);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass141_Sub2_Sub1_9774.aFloat11378,
				     aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i + aClass141_Sub2_Sub1_9774.anInt11379, i_87_);
	    OpenGL.glEnd();
	    method15488();
	}
    }
    
    public void method2729(int i, int i_91_, int i_92_) {
	OpenGL.glPixelTransferf(3348, 0.5F);
	OpenGL.glPixelTransferf(3349, 0.499F);
	OpenGL.glPixelTransferf(3352, 0.5F);
	OpenGL.glPixelTransferf(3353, 0.499F);
	OpenGL.glPixelTransferf(3354, 0.5F);
	OpenGL.glPixelTransferf(3355, 0.499F);
	aClass141_Sub2_Sub1_9780
	    = Class141_Sub2_Sub1.method17896(aClass185_Sub3_9773, i, i_91_,
					     (aClass141_Sub2_Sub1_9774
					      .anInt11379),
					     (aClass141_Sub2_Sub1_9774
					      .anInt11381));
	anInt9775 = i_92_;
	OpenGL.glPixelTransferf(3348, 1.0F);
	OpenGL.glPixelTransferf(3349, 0.0F);
	OpenGL.glPixelTransferf(3352, 1.0F);
	OpenGL.glPixelTransferf(3353, 0.0F);
	OpenGL.glPixelTransferf(3354, 1.0F);
	OpenGL.glPixelTransferf(3355, 0.0F);
    }
    
    void method2661(int i, int i_93_, int i_94_, int i_95_, int i_96_,
		    int i_97_, int i_98_, int i_99_) {
	aClass141_Sub2_Sub1_9774.method2382((i_99_ & 0x1) != 0);
	aClass185_Sub3_9773.method15224();
	aClass185_Sub3_9773.method15246(i_98_);
	OpenGL.glColor4ub((byte) (i_97_ >> 16), (byte) (i_97_ >> 8),
			  (byte) i_97_, (byte) (i_97_ >> 24));
	if (aBool9776) {
	    float f = (float) i_94_ / (float) method22();
	    float f_100_ = (float) i_95_ / (float) method2692();
	    float f_101_ = (float) i + (float) anInt9772 * f;
	    float f_102_ = (float) i_93_ + (float) anInt9777 * f_100_;
	    float f_103_
		= f_101_ + (float) aClass141_Sub2_Sub1_9774.anInt11379 * f;
	    float f_104_
		= (f_102_
		   + (float) aClass141_Sub2_Sub1_9774.anInt11381 * f_100_);
	    if (aClass141_Sub2_Sub1_9780 == null) {
		aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
		aClass185_Sub3_9773.method15214(i_96_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F,
				    aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glVertex2f(f_101_, f_102_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_101_, f_104_);
		OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				    0.0F);
		OpenGL.glVertex2f(f_103_, f_104_);
		OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				    aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glVertex2f(f_103_, f_102_);
		OpenGL.glEnd();
	    } else {
		method15486(i_96_);
		aClass141_Sub2_Sub1_9780.method2382(true);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F,
					 aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glTexCoord2f(0.0F,
				    aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glVertex2f(f_101_, f_102_);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_101_, f_104_);
		OpenGL.glMultiTexCoord2f(33985,
					 aClass141_Sub2_Sub1_9774.aFloat11378,
					 0.0F);
		OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				    0.0F);
		OpenGL.glVertex2f(f_103_, f_104_);
		OpenGL.glMultiTexCoord2f(33985,
					 aClass141_Sub2_Sub1_9774.aFloat11378,
					 aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				    aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glVertex2f(f_103_, f_102_);
		OpenGL.glEnd();
		method15488();
	    }
	} else if (aClass141_Sub2_Sub1_9780 == null) {
	    aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
	    aClass185_Sub3_9773.method15214(i_96_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i, i_93_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_93_ + i_95_);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378, 0.0F);
	    OpenGL.glVertex2i(i + i_94_, i_93_ + i_95_);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i + i_94_, i_93_);
	    OpenGL.glEnd();
	} else {
	    method15486(i_96_);
	    aClass141_Sub2_Sub1_9780.method2382(true);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glTexCoord2f(0.0F, aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i, i_93_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_93_ + i_95_);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass141_Sub2_Sub1_9774.aFloat11378,
				     0.0F);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378, 0.0F);
	    OpenGL.glVertex2i(i + i_94_, i_93_ + i_95_);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass141_Sub2_Sub1_9774.aFloat11378,
				     aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i + i_94_, i_93_);
	    OpenGL.glEnd();
	    method15488();
	}
    }
    
    public void method2645(int i, int i_105_, int i_106_, int i_107_) {
	anInt9772 = i;
	anInt9777 = i_105_;
	anInt9778 = i_106_;
	anInt9779 = i_107_;
	aBool9776 = (anInt9772 != 0 || anInt9777 != 0 || anInt9778 != 0
		     || anInt9779 != 0);
    }
    
    void method2671(float f, float f_108_, float f_109_, float f_110_,
		    float f_111_, float f_112_, int i, int i_113_, int i_114_,
		    int i_115_) {
	if (aBool9776) {
	    float f_116_ = (float) method22();
	    float f_117_ = (float) method2692();
	    float f_118_ = (f_109_ - f) / f_116_;
	    float f_119_ = (f_110_ - f_108_) / f_116_;
	    float f_120_ = (f_111_ - f) / f_117_;
	    float f_121_ = (f_112_ - f_108_) / f_117_;
	    float f_122_ = f_120_ * (float) anInt9777;
	    float f_123_ = f_121_ * (float) anInt9777;
	    float f_124_ = f_118_ * (float) anInt9772;
	    float f_125_ = f_119_ * (float) anInt9772;
	    float f_126_ = -f_118_ * (float) anInt9778;
	    float f_127_ = -f_119_ * (float) anInt9778;
	    float f_128_ = -f_120_ * (float) anInt9779;
	    float f_129_ = -f_121_ * (float) anInt9779;
	    f = f + f_124_ + f_122_;
	    f_108_ = f_108_ + f_125_ + f_123_;
	    f_109_ = f_109_ + f_126_ + f_122_;
	    f_110_ = f_110_ + f_127_ + f_123_;
	    f_111_ = f_111_ + f_124_ + f_128_;
	    f_112_ = f_112_ + f_125_ + f_129_;
	}
	float f_130_ = f_111_ + (f_109_ - f);
	float f_131_ = f_110_ + (f_112_ - f_108_);
	aClass141_Sub2_Sub1_9774.method2382((i_115_ & 0x1) != 0);
	aClass185_Sub3_9773.method15224();
	aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
	aClass185_Sub3_9773.method15246(i_114_);
	aClass185_Sub3_9773.method15214(i);
	OpenGL.glColor4ub((byte) (i_113_ >> 16), (byte) (i_113_ >> 8),
			  (byte) i_113_, (byte) (i_113_ >> 24));
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, aClass141_Sub2_Sub1_9774.aFloat11380);
	OpenGL.glVertex2f(f, f_108_);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2f(f_111_, f_112_);
	OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378, 0.0F);
	OpenGL.glVertex2f(f_130_, f_131_);
	OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
			    aClass141_Sub2_Sub1_9774.aFloat11380);
	OpenGL.glVertex2f(f_109_, f_110_);
	OpenGL.glEnd();
    }
    
    void method2673(float f, float f_132_, float f_133_, float f_134_,
		    float f_135_, float f_136_, int i, Class145 class145,
		    int i_137_, int i_138_) {
	Class141_Sub2_Sub1 class141_sub2_sub1
	    = ((Class145_Sub3) class145).aClass141_Sub2_Sub1_9876;
	if (aBool9776) {
	    float f_139_ = (float) method22();
	    float f_140_ = (float) method2692();
	    float f_141_ = (f_133_ - f) / f_139_;
	    float f_142_ = (f_134_ - f_132_) / f_139_;
	    float f_143_ = (f_135_ - f) / f_140_;
	    float f_144_ = (f_136_ - f_132_) / f_140_;
	    float f_145_ = f_143_ * (float) anInt9777;
	    float f_146_ = f_144_ * (float) anInt9777;
	    float f_147_ = f_141_ * (float) anInt9772;
	    float f_148_ = f_142_ * (float) anInt9772;
	    float f_149_ = -f_141_ * (float) anInt9778;
	    float f_150_ = -f_142_ * (float) anInt9778;
	    float f_151_ = -f_143_ * (float) anInt9779;
	    float f_152_ = -f_144_ * (float) anInt9779;
	    f = f + f_147_ + f_145_;
	    f_132_ = f_132_ + f_148_ + f_146_;
	    f_133_ = f_133_ + f_149_ + f_145_;
	    f_134_ = f_134_ + f_150_ + f_146_;
	    f_135_ = f_135_ + f_147_ + f_151_;
	    f_136_ = f_136_ + f_148_ + f_152_;
	}
	float f_153_ = f_135_ + (f_133_ - f);
	float f_154_ = f_134_ + (f_136_ - f_132_);
	aClass141_Sub2_Sub1_9774.method2382((i & 0x1) != 0);
	aClass185_Sub3_9773.method15224();
	aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
	aClass185_Sub3_9773.method15214(1);
	aClass185_Sub3_9773.method15230(1);
	aClass185_Sub3_9773.method15231(class141_sub2_sub1);
	aClass185_Sub3_9773.method15232(7681, 8448);
	aClass185_Sub3_9773.method15325(0, 34168, 768);
	aClass185_Sub3_9773.method15246(1);
	float f_155_ = (class141_sub2_sub1.aFloat11378
			/ (float) class141_sub2_sub1.anInt11379);
	float f_156_ = (class141_sub2_sub1.aFloat11380
			/ (float) class141_sub2_sub1.anInt11381);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 aClass141_Sub2_Sub1_9774.aFloat11380);
	OpenGL.glMultiTexCoord2f(33985, f_155_ * (f - (float) i_137_),
				 (class141_sub2_sub1.aFloat11380
				  - f_156_ * (f_132_ - (float) i_138_)));
	OpenGL.glVertex2f(f, f_132_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_155_ * (f_135_ - (float) i_137_),
				 (class141_sub2_sub1.aFloat11380
				  - f_156_ * (f_136_ - (float) i_138_)));
	OpenGL.glVertex2f(f_135_, f_136_);
	OpenGL.glMultiTexCoord2f(33984, aClass141_Sub2_Sub1_9774.aFloat11378,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_155_ * (f_153_ - (float) i_137_),
				 (class141_sub2_sub1.aFloat11380
				  - f_156_ * (f_154_ - (float) i_138_)));
	OpenGL.glVertex2f(f_153_, f_154_);
	OpenGL.glMultiTexCoord2f(33984, aClass141_Sub2_Sub1_9774.aFloat11378,
				 aClass141_Sub2_Sub1_9774.aFloat11380);
	OpenGL.glMultiTexCoord2f(33985, f_155_ * (f_133_ - (float) i_137_),
				 (class141_sub2_sub1.aFloat11380
				  - f_156_ * (f_134_ - (float) i_138_)));
	OpenGL.glVertex2f(f_133_, f_134_);
	OpenGL.glEnd();
	aClass185_Sub3_9773.method15325(0, 5890, 768);
	aClass185_Sub3_9773.method15214(0);
	aClass185_Sub3_9773.method15231(null);
	aClass185_Sub3_9773.method15230(0);
    }
    
    public void method2648(int i, int i_157_, int i_158_, int i_159_, int[] is,
			   int[] is_160_, int i_161_, int i_162_) {
	aClass141_Sub2_Sub1_9774.method14446(i, i_157_, i_158_, i_159_, is,
					     is_160_, i_161_);
    }
    
    public void method2733(int[] is) {
	is[0] = anInt9772;
	is[1] = anInt9777;
	is[2] = anInt9778;
	is[3] = anInt9779;
    }
    
    public void method2676(int i, int i_163_, int i_164_, int i_165_, int[] is,
			   int[] is_166_, int i_167_, int i_168_) {
	aClass141_Sub2_Sub1_9774.method14446(i, i_163_, i_164_, i_165_, is,
					     is_166_, i_167_);
    }
    
    public void method2693(int i, int i_169_, int i_170_, int i_171_, int[] is,
			   int[] is_172_, int i_173_, int i_174_) {
	aClass141_Sub2_Sub1_9774.method14446(i, i_169_, i_170_, i_171_, is,
					     is_172_, i_173_);
    }
    
    public void method2678(int i, int i_175_, int i_176_, int i_177_,
			   int i_178_, int i_179_) {
	method15485(i, i_175_, i_176_, i_177_, i_178_, i_179_, false);
    }
    
    void method2687(int i, int i_180_, int i_181_, int i_182_, int i_183_,
		    int i_184_, int i_185_, int i_186_) {
	aClass141_Sub2_Sub1_9774.method2382((i_186_ & 0x1) != 0);
	aClass185_Sub3_9773.method15224();
	aClass185_Sub3_9773.method15246(i_185_);
	OpenGL.glColor4ub((byte) (i_184_ >> 16), (byte) (i_184_ >> 8),
			  (byte) i_184_, (byte) (i_184_ >> 24));
	if (aBool9776) {
	    float f = (float) i_181_ / (float) method22();
	    float f_187_ = (float) i_182_ / (float) method2692();
	    float f_188_ = (float) i + (float) anInt9772 * f;
	    float f_189_ = (float) i_180_ + (float) anInt9777 * f_187_;
	    float f_190_
		= f_188_ + (float) aClass141_Sub2_Sub1_9774.anInt11379 * f;
	    float f_191_
		= (f_189_
		   + (float) aClass141_Sub2_Sub1_9774.anInt11381 * f_187_);
	    if (aClass141_Sub2_Sub1_9780 == null) {
		aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
		aClass185_Sub3_9773.method15214(i_183_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F,
				    aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glVertex2f(f_188_, f_189_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_188_, f_191_);
		OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				    0.0F);
		OpenGL.glVertex2f(f_190_, f_191_);
		OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				    aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glVertex2f(f_190_, f_189_);
		OpenGL.glEnd();
	    } else {
		method15486(i_183_);
		aClass141_Sub2_Sub1_9780.method2382(true);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F,
					 aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glTexCoord2f(0.0F,
				    aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glVertex2f(f_188_, f_189_);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_188_, f_191_);
		OpenGL.glMultiTexCoord2f(33985,
					 aClass141_Sub2_Sub1_9774.aFloat11378,
					 0.0F);
		OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				    0.0F);
		OpenGL.glVertex2f(f_190_, f_191_);
		OpenGL.glMultiTexCoord2f(33985,
					 aClass141_Sub2_Sub1_9774.aFloat11378,
					 aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				    aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glVertex2f(f_190_, f_189_);
		OpenGL.glEnd();
		method15488();
	    }
	} else if (aClass141_Sub2_Sub1_9780 == null) {
	    aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
	    aClass185_Sub3_9773.method15214(i_183_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i, i_180_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_180_ + i_182_);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378, 0.0F);
	    OpenGL.glVertex2i(i + i_181_, i_180_ + i_182_);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i + i_181_, i_180_);
	    OpenGL.glEnd();
	} else {
	    method15486(i_183_);
	    aClass141_Sub2_Sub1_9780.method2382(true);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glTexCoord2f(0.0F, aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i, i_180_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_180_ + i_182_);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass141_Sub2_Sub1_9774.aFloat11378,
				     0.0F);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378, 0.0F);
	    OpenGL.glVertex2i(i + i_181_, i_180_ + i_182_);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass141_Sub2_Sub1_9774.aFloat11378,
				     aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i + i_181_, i_180_);
	    OpenGL.glEnd();
	    method15488();
	}
    }
    
    public Interface22 method2688() {
	return aClass141_Sub2_Sub1_9774.method14451(0);
    }
    
    void method2702(int i, int i_192_, int i_193_, int i_194_, int i_195_,
		    int i_196_, int i_197_, int i_198_) {
	aClass141_Sub2_Sub1_9774.method2382((i_198_ & 0x1) != 0);
	aClass185_Sub3_9773.method15224();
	aClass185_Sub3_9773.method15246(i_197_);
	OpenGL.glColor4ub((byte) (i_196_ >> 16), (byte) (i_196_ >> 8),
			  (byte) i_196_, (byte) (i_196_ >> 24));
	if (aBool9776) {
	    float f = (float) i_193_ / (float) method22();
	    float f_199_ = (float) i_194_ / (float) method2692();
	    float f_200_ = (float) i + (float) anInt9772 * f;
	    float f_201_ = (float) i_192_ + (float) anInt9777 * f_199_;
	    float f_202_
		= f_200_ + (float) aClass141_Sub2_Sub1_9774.anInt11379 * f;
	    float f_203_
		= (f_201_
		   + (float) aClass141_Sub2_Sub1_9774.anInt11381 * f_199_);
	    if (aClass141_Sub2_Sub1_9780 == null) {
		aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
		aClass185_Sub3_9773.method15214(i_195_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F,
				    aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glVertex2f(f_200_, f_201_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_200_, f_203_);
		OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				    0.0F);
		OpenGL.glVertex2f(f_202_, f_203_);
		OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				    aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glVertex2f(f_202_, f_201_);
		OpenGL.glEnd();
	    } else {
		method15486(i_195_);
		aClass141_Sub2_Sub1_9780.method2382(true);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F,
					 aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glTexCoord2f(0.0F,
				    aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glVertex2f(f_200_, f_201_);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_200_, f_203_);
		OpenGL.glMultiTexCoord2f(33985,
					 aClass141_Sub2_Sub1_9774.aFloat11378,
					 0.0F);
		OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				    0.0F);
		OpenGL.glVertex2f(f_202_, f_203_);
		OpenGL.glMultiTexCoord2f(33985,
					 aClass141_Sub2_Sub1_9774.aFloat11378,
					 aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				    aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glVertex2f(f_202_, f_201_);
		OpenGL.glEnd();
		method15488();
	    }
	} else if (aClass141_Sub2_Sub1_9780 == null) {
	    aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
	    aClass185_Sub3_9773.method15214(i_195_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i, i_192_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_192_ + i_194_);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378, 0.0F);
	    OpenGL.glVertex2i(i + i_193_, i_192_ + i_194_);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i + i_193_, i_192_);
	    OpenGL.glEnd();
	} else {
	    method15486(i_195_);
	    aClass141_Sub2_Sub1_9780.method2382(true);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glTexCoord2f(0.0F, aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i, i_192_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_192_ + i_194_);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass141_Sub2_Sub1_9774.aFloat11378,
				     0.0F);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378, 0.0F);
	    OpenGL.glVertex2i(i + i_193_, i_192_ + i_194_);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass141_Sub2_Sub1_9774.aFloat11378,
				     aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i + i_193_, i_192_);
	    OpenGL.glEnd();
	    method15488();
	}
    }
    
    public Interface22 method2682() {
	return aClass141_Sub2_Sub1_9774.method14451(0);
    }
    
    public Interface22 method2683() {
	return aClass141_Sub2_Sub1_9774.method14451(0);
    }
    
    void method15487(int i, int i_204_, int i_205_, int i_206_, int i_207_,
		     int i_208_, boolean bool) {
	if (aClass185_Sub3_9773.aBool9582 && !bool) {
	    int[] is = aClass185_Sub3_9773.method3267(i_207_, i_208_, i_205_,
						      i_206_);
	    if (is != null) {
		for (int i_209_ = 0; i_209_ < is.length; i_209_++)
		    is[i_209_] |= ~0xffffff;
		method2652(i, i_204_, i_205_, i_206_, is, 0, i_205_);
	    }
	} else
	    aClass141_Sub2_Sub1_9774.method14452(i, i_204_, i_205_, i_206_,
						 i_207_, i_208_);
    }
    
    Class163_Sub3(Class185_Sub3 class185_sub3, int i, int i_210_, int[] is,
		  int i_211_, int i_212_) {
	anInt9772 = 0;
	anInt9779 = 0;
	anInt9778 = 0;
	aClass185_Sub3_9773 = class185_sub3;
	aClass141_Sub2_Sub1_9774
	    = Class141_Sub2_Sub1.method17895(class185_sub3, i, i_210_, false,
					     is, i_212_, i_211_);
    }
    
    void method2686(int i, int i_213_, int i_214_, int i_215_, int i_216_,
		    int i_217_, int i_218_, int i_219_) {
	aClass141_Sub2_Sub1_9774.method2382((i_219_ & 0x1) != 0);
	aClass185_Sub3_9773.method15224();
	aClass185_Sub3_9773.method15246(i_218_);
	OpenGL.glColor4ub((byte) (i_217_ >> 16), (byte) (i_217_ >> 8),
			  (byte) i_217_, (byte) (i_217_ >> 24));
	if (aBool9776) {
	    float f = (float) i_214_ / (float) method22();
	    float f_220_ = (float) i_215_ / (float) method2692();
	    float f_221_ = (float) i + (float) anInt9772 * f;
	    float f_222_ = (float) i_213_ + (float) anInt9777 * f_220_;
	    float f_223_
		= f_221_ + (float) aClass141_Sub2_Sub1_9774.anInt11379 * f;
	    float f_224_
		= (f_222_
		   + (float) aClass141_Sub2_Sub1_9774.anInt11381 * f_220_);
	    if (aClass141_Sub2_Sub1_9780 == null) {
		aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
		aClass185_Sub3_9773.method15214(i_216_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F,
				    aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glVertex2f(f_221_, f_222_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_221_, f_224_);
		OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				    0.0F);
		OpenGL.glVertex2f(f_223_, f_224_);
		OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				    aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glVertex2f(f_223_, f_222_);
		OpenGL.glEnd();
	    } else {
		method15486(i_216_);
		aClass141_Sub2_Sub1_9780.method2382(true);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F,
					 aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glTexCoord2f(0.0F,
				    aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glVertex2f(f_221_, f_222_);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_221_, f_224_);
		OpenGL.glMultiTexCoord2f(33985,
					 aClass141_Sub2_Sub1_9774.aFloat11378,
					 0.0F);
		OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				    0.0F);
		OpenGL.glVertex2f(f_223_, f_224_);
		OpenGL.glMultiTexCoord2f(33985,
					 aClass141_Sub2_Sub1_9774.aFloat11378,
					 aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				    aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glVertex2f(f_223_, f_222_);
		OpenGL.glEnd();
		method15488();
	    }
	} else if (aClass141_Sub2_Sub1_9780 == null) {
	    aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
	    aClass185_Sub3_9773.method15214(i_216_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i, i_213_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_213_ + i_215_);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378, 0.0F);
	    OpenGL.glVertex2i(i + i_214_, i_213_ + i_215_);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i + i_214_, i_213_);
	    OpenGL.glEnd();
	} else {
	    method15486(i_216_);
	    aClass141_Sub2_Sub1_9780.method2382(true);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glTexCoord2f(0.0F, aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i, i_213_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_213_ + i_215_);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass141_Sub2_Sub1_9774.aFloat11378,
				     0.0F);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378, 0.0F);
	    OpenGL.glVertex2i(i + i_214_, i_213_ + i_215_);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass141_Sub2_Sub1_9774.aFloat11378,
				     aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i + i_214_, i_213_);
	    OpenGL.glEnd();
	    method15488();
	}
    }
    
    void method15488() {
	aClass185_Sub3_9773.method15230(1);
	aClass185_Sub3_9773.method15231(null);
	aClass185_Sub3_9773.method15232(8448, 8448);
	aClass185_Sub3_9773.method15325(1, 34168, 768);
	aClass185_Sub3_9773.method15239(0, 5890, 770);
	aClass185_Sub3_9773.method15230(0);
	aClass185_Sub3_9773.method15325(1, 34168, 768);
    }
    
    public int method2700() {
	return aClass141_Sub2_Sub1_9774.anInt11379;
    }
    
    void method2718(int i, int i_225_, int i_226_, int i_227_, int i_228_,
		    int i_229_, int i_230_, int i_231_) {
	aClass141_Sub2_Sub1_9774.method2382((i_231_ & 0x1) != 0);
	aClass185_Sub3_9773.method15224();
	aClass185_Sub3_9773.method15246(i_230_);
	OpenGL.glColor4ub((byte) (i_229_ >> 16), (byte) (i_229_ >> 8),
			  (byte) i_229_, (byte) (i_229_ >> 24));
	if (aBool9776) {
	    float f = (float) i_226_ / (float) method22();
	    float f_232_ = (float) i_227_ / (float) method2692();
	    float f_233_ = (float) i + (float) anInt9772 * f;
	    float f_234_ = (float) i_225_ + (float) anInt9777 * f_232_;
	    float f_235_
		= f_233_ + (float) aClass141_Sub2_Sub1_9774.anInt11379 * f;
	    float f_236_
		= (f_234_
		   + (float) aClass141_Sub2_Sub1_9774.anInt11381 * f_232_);
	    if (aClass141_Sub2_Sub1_9780 == null) {
		aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
		aClass185_Sub3_9773.method15214(i_228_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F,
				    aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glVertex2f(f_233_, f_234_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_233_, f_236_);
		OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				    0.0F);
		OpenGL.glVertex2f(f_235_, f_236_);
		OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				    aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glVertex2f(f_235_, f_234_);
		OpenGL.glEnd();
	    } else {
		method15486(i_228_);
		aClass141_Sub2_Sub1_9780.method2382(true);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F,
					 aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glTexCoord2f(0.0F,
				    aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glVertex2f(f_233_, f_234_);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_233_, f_236_);
		OpenGL.glMultiTexCoord2f(33985,
					 aClass141_Sub2_Sub1_9774.aFloat11378,
					 0.0F);
		OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				    0.0F);
		OpenGL.glVertex2f(f_235_, f_236_);
		OpenGL.glMultiTexCoord2f(33985,
					 aClass141_Sub2_Sub1_9774.aFloat11378,
					 aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				    aClass141_Sub2_Sub1_9774.aFloat11380);
		OpenGL.glVertex2f(f_235_, f_234_);
		OpenGL.glEnd();
		method15488();
	    }
	} else if (aClass141_Sub2_Sub1_9780 == null) {
	    aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
	    aClass185_Sub3_9773.method15214(i_228_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i, i_225_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_225_ + i_227_);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378, 0.0F);
	    OpenGL.glVertex2i(i + i_226_, i_225_ + i_227_);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i + i_226_, i_225_);
	    OpenGL.glEnd();
	} else {
	    method15486(i_228_);
	    aClass141_Sub2_Sub1_9780.method2382(true);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glTexCoord2f(0.0F, aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i, i_225_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_225_ + i_227_);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass141_Sub2_Sub1_9774.aFloat11378,
				     0.0F);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378, 0.0F);
	    OpenGL.glVertex2i(i + i_226_, i_225_ + i_227_);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass141_Sub2_Sub1_9774.aFloat11378,
				     aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i + i_226_, i_225_);
	    OpenGL.glEnd();
	    method15488();
	}
    }
    
    public void method2737(int i, int i_237_, int i_238_, int i_239_, int[] is,
			   int i_240_, int i_241_) {
	aClass141_Sub2_Sub1_9774.method14468(i, i_237_, i_238_, i_239_, is,
					     i_240_, i_241_, true);
    }
    
    public void method2691(int i, int i_242_, Class145 class145, int i_243_,
			   int i_244_) {
	Class145_Sub3 class145_sub3 = (Class145_Sub3) class145;
	Class141_Sub2_Sub1 class141_sub2_sub1
	    = class145_sub3.aClass141_Sub2_Sub1_9876;
	aClass141_Sub2_Sub1_9774.method2382(false);
	aClass185_Sub3_9773.method15224();
	aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
	aClass185_Sub3_9773.method15214(1);
	aClass185_Sub3_9773.method15230(1);
	aClass185_Sub3_9773.method15231(class141_sub2_sub1);
	aClass185_Sub3_9773.method15232(7681, 8448);
	aClass185_Sub3_9773.method15325(0, 34168, 768);
	aClass185_Sub3_9773.method15246(1);
	i += anInt9772;
	i_242_ += anInt9777;
	int i_245_ = i + aClass141_Sub2_Sub1_9774.anInt11379;
	int i_246_ = i_242_ + aClass141_Sub2_Sub1_9774.anInt11381;
	float f = (class141_sub2_sub1.aFloat11378
		   / (float) class141_sub2_sub1.anInt11379);
	float f_247_ = (class141_sub2_sub1.aFloat11380
			/ (float) class141_sub2_sub1.anInt11381);
	float f_248_ = (float) (i - i_243_) * f;
	float f_249_ = (float) (i_245_ - i_243_) * f;
	float f_250_ = (class141_sub2_sub1.aFloat11380
			- (float) (i_242_ - i_244_) * f_247_);
	float f_251_ = (class141_sub2_sub1.aFloat11380
			- (float) (i_246_ - i_244_) * f_247_);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 aClass141_Sub2_Sub1_9774.aFloat11380);
	OpenGL.glMultiTexCoord2f(33985, f_248_, f_250_);
	OpenGL.glVertex2i(i, i_242_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_248_, f_251_);
	OpenGL.glVertex2i(i, i_242_ + aClass141_Sub2_Sub1_9774.anInt11381);
	OpenGL.glMultiTexCoord2f(33984, aClass141_Sub2_Sub1_9774.aFloat11378,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_249_, f_251_);
	OpenGL.glVertex2i(i + aClass141_Sub2_Sub1_9774.anInt11379,
			  i_242_ + aClass141_Sub2_Sub1_9774.anInt11381);
	OpenGL.glMultiTexCoord2f(33984, aClass141_Sub2_Sub1_9774.aFloat11378,
				 aClass141_Sub2_Sub1_9774.aFloat11380);
	OpenGL.glMultiTexCoord2f(33985, f_249_, f_250_);
	OpenGL.glVertex2i(i + aClass141_Sub2_Sub1_9774.anInt11379, i_242_);
	OpenGL.glEnd();
	aClass185_Sub3_9773.method15325(0, 5890, 768);
	aClass185_Sub3_9773.method15214(0);
	aClass185_Sub3_9773.method15231(null);
	aClass185_Sub3_9773.method15230(0);
    }
    
    Class163_Sub3(Class185_Sub3 class185_sub3, int i, int i_252_,
		  boolean bool) {
	anInt9772 = 0;
	anInt9779 = 0;
	anInt9778 = 0;
	aClass185_Sub3_9773 = class185_sub3;
	aClass141_Sub2_Sub1_9774
	    = Class141_Sub2_Sub1.method17898(class185_sub3,
					     (bool ? Class181.aClass181_1952
					      : Class181.aClass181_1959),
					     Class173.aClass173_1830, i,
					     i_252_);
    }
    
    public void method2685(int i, int i_253_, Class145 class145, int i_254_,
			   int i_255_) {
	Class145_Sub3 class145_sub3 = (Class145_Sub3) class145;
	Class141_Sub2_Sub1 class141_sub2_sub1
	    = class145_sub3.aClass141_Sub2_Sub1_9876;
	aClass141_Sub2_Sub1_9774.method2382(false);
	aClass185_Sub3_9773.method15224();
	aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
	aClass185_Sub3_9773.method15214(1);
	aClass185_Sub3_9773.method15230(1);
	aClass185_Sub3_9773.method15231(class141_sub2_sub1);
	aClass185_Sub3_9773.method15232(7681, 8448);
	aClass185_Sub3_9773.method15325(0, 34168, 768);
	aClass185_Sub3_9773.method15246(1);
	i += anInt9772;
	i_253_ += anInt9777;
	int i_256_ = i + aClass141_Sub2_Sub1_9774.anInt11379;
	int i_257_ = i_253_ + aClass141_Sub2_Sub1_9774.anInt11381;
	float f = (class141_sub2_sub1.aFloat11378
		   / (float) class141_sub2_sub1.anInt11379);
	float f_258_ = (class141_sub2_sub1.aFloat11380
			/ (float) class141_sub2_sub1.anInt11381);
	float f_259_ = (float) (i - i_254_) * f;
	float f_260_ = (float) (i_256_ - i_254_) * f;
	float f_261_ = (class141_sub2_sub1.aFloat11380
			- (float) (i_253_ - i_255_) * f_258_);
	float f_262_ = (class141_sub2_sub1.aFloat11380
			- (float) (i_257_ - i_255_) * f_258_);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 aClass141_Sub2_Sub1_9774.aFloat11380);
	OpenGL.glMultiTexCoord2f(33985, f_259_, f_261_);
	OpenGL.glVertex2i(i, i_253_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_259_, f_262_);
	OpenGL.glVertex2i(i, i_253_ + aClass141_Sub2_Sub1_9774.anInt11381);
	OpenGL.glMultiTexCoord2f(33984, aClass141_Sub2_Sub1_9774.aFloat11378,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_260_, f_262_);
	OpenGL.glVertex2i(i + aClass141_Sub2_Sub1_9774.anInt11379,
			  i_253_ + aClass141_Sub2_Sub1_9774.anInt11381);
	OpenGL.glMultiTexCoord2f(33984, aClass141_Sub2_Sub1_9774.aFloat11378,
				 aClass141_Sub2_Sub1_9774.aFloat11380);
	OpenGL.glMultiTexCoord2f(33985, f_260_, f_261_);
	OpenGL.glVertex2i(i + aClass141_Sub2_Sub1_9774.anInt11379, i_253_);
	OpenGL.glEnd();
	aClass185_Sub3_9773.method15325(0, 5890, 768);
	aClass185_Sub3_9773.method15214(0);
	aClass185_Sub3_9773.method15231(null);
	aClass185_Sub3_9773.method15230(0);
    }
    
    public Interface22 method2650() {
	return aClass141_Sub2_Sub1_9774.method14451(0);
    }
    
    public void method2695(int[] is) {
	is[0] = anInt9772;
	is[1] = anInt9777;
	is[2] = anInt9778;
	is[3] = anInt9779;
    }
    
    public void method2741(int[] is) {
	is[0] = anInt9772;
	is[1] = anInt9777;
	is[2] = anInt9778;
	is[3] = anInt9779;
    }
    
    public void method2684(int i, int i_263_, int i_264_, int i_265_,
			   int i_266_) {
	aClass141_Sub2_Sub1_9774.method2382(false);
	aClass185_Sub3_9773.method15224();
	aClass185_Sub3_9773.method15246(i_266_);
	OpenGL.glColor4ub((byte) (i_265_ >> 16), (byte) (i_265_ >> 8),
			  (byte) i_265_, (byte) (i_265_ >> 24));
	i += anInt9772;
	i_263_ += anInt9777;
	if (aClass141_Sub2_Sub1_9780 == null) {
	    aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
	    aClass185_Sub3_9773.method15214(i_264_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i, i_263_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_263_ + aClass141_Sub2_Sub1_9774.anInt11381);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378, 0.0F);
	    OpenGL.glVertex2i(i + aClass141_Sub2_Sub1_9774.anInt11379,
			      i_263_ + aClass141_Sub2_Sub1_9774.anInt11381);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i + aClass141_Sub2_Sub1_9774.anInt11379, i_263_);
	    OpenGL.glEnd();
	} else {
	    method15486(i_264_);
	    aClass141_Sub2_Sub1_9780.method2382(false);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glTexCoord2f(0.0F, aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i, i_263_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_263_ + aClass141_Sub2_Sub1_9774.anInt11381);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass141_Sub2_Sub1_9774.aFloat11378,
				     0.0F);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378, 0.0F);
	    OpenGL.glVertex2i(i + aClass141_Sub2_Sub1_9774.anInt11379,
			      i_263_ + aClass141_Sub2_Sub1_9774.anInt11381);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass141_Sub2_Sub1_9774.aFloat11378,
				     aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
				aClass141_Sub2_Sub1_9774.aFloat11380);
	    OpenGL.glVertex2i(i + aClass141_Sub2_Sub1_9774.anInt11379, i_263_);
	    OpenGL.glEnd();
	    method15488();
	}
    }
    
    public int method2698() {
	return aClass141_Sub2_Sub1_9774.anInt11379;
    }
    
    public int method2709() {
	return aClass141_Sub2_Sub1_9774.anInt11379;
    }
    
    public void method2672(int i, int i_267_, int i_268_) {
	OpenGL.glPixelTransferf(3348, 0.5F);
	OpenGL.glPixelTransferf(3349, 0.499F);
	OpenGL.glPixelTransferf(3352, 0.5F);
	OpenGL.glPixelTransferf(3353, 0.499F);
	OpenGL.glPixelTransferf(3354, 0.5F);
	OpenGL.glPixelTransferf(3355, 0.499F);
	aClass141_Sub2_Sub1_9780
	    = Class141_Sub2_Sub1.method17896(aClass185_Sub3_9773, i, i_267_,
					     (aClass141_Sub2_Sub1_9774
					      .anInt11379),
					     (aClass141_Sub2_Sub1_9774
					      .anInt11381));
	anInt9775 = i_268_;
	OpenGL.glPixelTransferf(3348, 1.0F);
	OpenGL.glPixelTransferf(3349, 0.0F);
	OpenGL.glPixelTransferf(3352, 1.0F);
	OpenGL.glPixelTransferf(3353, 0.0F);
	OpenGL.glPixelTransferf(3354, 1.0F);
	OpenGL.glPixelTransferf(3355, 0.0F);
    }
    
    public int method2701() {
	return aClass141_Sub2_Sub1_9774.anInt11381;
    }
    
    public int method21() {
	return aClass141_Sub2_Sub1_9774.anInt11379 + anInt9772 + anInt9778;
    }
    
    public int method20() {
	return aClass141_Sub2_Sub1_9774.anInt11379 + anInt9772 + anInt9778;
    }
    
    public void method2652(int i, int i_269_, int i_270_, int i_271_, int[] is,
			   int i_272_, int i_273_) {
	aClass141_Sub2_Sub1_9774.method14468(i, i_269_, i_270_, i_271_, is,
					     i_272_, i_273_, true);
    }
    
    public int method2669() {
	return aClass141_Sub2_Sub1_9774.anInt11381 + anInt9777 + anInt9779;
    }
    
    void method2708(float f, float f_274_, float f_275_, float f_276_,
		    float f_277_, float f_278_, int i, Class145 class145,
		    int i_279_, int i_280_) {
	Class141_Sub2_Sub1 class141_sub2_sub1
	    = ((Class145_Sub3) class145).aClass141_Sub2_Sub1_9876;
	if (aBool9776) {
	    float f_281_ = (float) method22();
	    float f_282_ = (float) method2692();
	    float f_283_ = (f_275_ - f) / f_281_;
	    float f_284_ = (f_276_ - f_274_) / f_281_;
	    float f_285_ = (f_277_ - f) / f_282_;
	    float f_286_ = (f_278_ - f_274_) / f_282_;
	    float f_287_ = f_285_ * (float) anInt9777;
	    float f_288_ = f_286_ * (float) anInt9777;
	    float f_289_ = f_283_ * (float) anInt9772;
	    float f_290_ = f_284_ * (float) anInt9772;
	    float f_291_ = -f_283_ * (float) anInt9778;
	    float f_292_ = -f_284_ * (float) anInt9778;
	    float f_293_ = -f_285_ * (float) anInt9779;
	    float f_294_ = -f_286_ * (float) anInt9779;
	    f = f + f_289_ + f_287_;
	    f_274_ = f_274_ + f_290_ + f_288_;
	    f_275_ = f_275_ + f_291_ + f_287_;
	    f_276_ = f_276_ + f_292_ + f_288_;
	    f_277_ = f_277_ + f_289_ + f_293_;
	    f_278_ = f_278_ + f_290_ + f_294_;
	}
	float f_295_ = f_277_ + (f_275_ - f);
	float f_296_ = f_276_ + (f_278_ - f_274_);
	aClass141_Sub2_Sub1_9774.method2382((i & 0x1) != 0);
	aClass185_Sub3_9773.method15224();
	aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
	aClass185_Sub3_9773.method15214(1);
	aClass185_Sub3_9773.method15230(1);
	aClass185_Sub3_9773.method15231(class141_sub2_sub1);
	aClass185_Sub3_9773.method15232(7681, 8448);
	aClass185_Sub3_9773.method15325(0, 34168, 768);
	aClass185_Sub3_9773.method15246(1);
	float f_297_ = (class141_sub2_sub1.aFloat11378
			/ (float) class141_sub2_sub1.anInt11379);
	float f_298_ = (class141_sub2_sub1.aFloat11380
			/ (float) class141_sub2_sub1.anInt11381);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 aClass141_Sub2_Sub1_9774.aFloat11380);
	OpenGL.glMultiTexCoord2f(33985, f_297_ * (f - (float) i_279_),
				 (class141_sub2_sub1.aFloat11380
				  - f_298_ * (f_274_ - (float) i_280_)));
	OpenGL.glVertex2f(f, f_274_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_297_ * (f_277_ - (float) i_279_),
				 (class141_sub2_sub1.aFloat11380
				  - f_298_ * (f_278_ - (float) i_280_)));
	OpenGL.glVertex2f(f_277_, f_278_);
	OpenGL.glMultiTexCoord2f(33984, aClass141_Sub2_Sub1_9774.aFloat11378,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_297_ * (f_295_ - (float) i_279_),
				 (class141_sub2_sub1.aFloat11380
				  - f_298_ * (f_296_ - (float) i_280_)));
	OpenGL.glVertex2f(f_295_, f_296_);
	OpenGL.glMultiTexCoord2f(33984, aClass141_Sub2_Sub1_9774.aFloat11378,
				 aClass141_Sub2_Sub1_9774.aFloat11380);
	OpenGL.glMultiTexCoord2f(33985, f_297_ * (f_275_ - (float) i_279_),
				 (class141_sub2_sub1.aFloat11380
				  - f_298_ * (f_276_ - (float) i_280_)));
	OpenGL.glVertex2f(f_275_, f_276_);
	OpenGL.glEnd();
	aClass185_Sub3_9773.method15325(0, 5890, 768);
	aClass185_Sub3_9773.method15214(0);
	aClass185_Sub3_9773.method15231(null);
	aClass185_Sub3_9773.method15230(0);
    }
    
    public void method2705(int i, int i_299_, int i_300_, int i_301_,
			   int i_302_, int i_303_, int i_304_) {
	int i_305_ = i + i_300_;
	int i_306_ = i_299_ + i_301_;
	aClass141_Sub2_Sub1_9774.method2382(false);
	aClass185_Sub3_9773.method15224();
	aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
	aClass185_Sub3_9773.method15246(i_304_);
	aClass185_Sub3_9773.method15214(i_302_);
	OpenGL.glColor4ub((byte) (i_303_ >> 16), (byte) (i_303_ >> 8),
			  (byte) i_303_, (byte) (i_303_ >> 24));
	if (aClass141_Sub2_Sub1_9774.aBool11382 && !aBool9776
	    && i_301_ >= aClass141_Sub2_Sub1_9774.anInt11381
	    && i_300_ >= aClass141_Sub2_Sub1_9774.anInt11379) {
	    float f = (aClass141_Sub2_Sub1_9774.aFloat11380 * (float) i_301_
		       / (float) aClass141_Sub2_Sub1_9774.anInt11381);
	    float f_307_
		= (aClass141_Sub2_Sub1_9774.aFloat11378 * (float) i_300_
		   / (float) aClass141_Sub2_Sub1_9774.anInt11379);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, f);
	    OpenGL.glVertex2i(i, i_299_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_306_);
	    OpenGL.glTexCoord2f(f_307_, 0.0F);
	    OpenGL.glVertex2i(i_305_, i_306_);
	    OpenGL.glTexCoord2f(f_307_, f);
	    OpenGL.glVertex2i(i_305_, i_299_);
	    OpenGL.glEnd();
	} else {
	    OpenGL.glPushMatrix();
	    OpenGL.glTranslatef((float) anInt9772, (float) anInt9777, 0.0F);
	    int i_308_ = method22();
	    int i_309_ = method2692();
	    int i_310_ = i_299_ + aClass141_Sub2_Sub1_9774.anInt11381;
	    OpenGL.glBegin(7);
	    int i_311_ = i_299_;
	    for (/**/; i_310_ <= i_306_; i_310_ += i_309_) {
		int i_312_ = i + aClass141_Sub2_Sub1_9774.anInt11379;
		int i_313_ = i;
		while (i_312_ <= i_305_) {
		    OpenGL.glTexCoord2f(0.0F,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_313_, i_311_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(i_313_, i_310_);
		    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
					0.0F);
		    OpenGL.glVertex2i(i_312_, i_310_);
		    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_312_, i_311_);
		    i_312_ += i_308_;
		    i_313_ += i_308_;
		}
		if (i_313_ < i_305_) {
		    float f = (aClass141_Sub2_Sub1_9774.aFloat11378
			       * (float) (i_305_ - i_313_)
			       / (float) aClass141_Sub2_Sub1_9774.anInt11379);
		    OpenGL.glTexCoord2f(0.0F,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_313_, i_311_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(i_313_, i_310_);
		    OpenGL.glTexCoord2f(f, 0.0F);
		    OpenGL.glVertex2i(i_305_, i_310_);
		    OpenGL.glTexCoord2f(f,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_305_, i_311_);
		}
		i_311_ += i_309_;
	    }
	    if (i_311_ < i_306_) {
		float f = (aClass141_Sub2_Sub1_9774.aFloat11380
			   * (float) (aClass141_Sub2_Sub1_9774.anInt11381
				      - (i_306_ - i_311_))
			   / (float) aClass141_Sub2_Sub1_9774.anInt11381);
		int i_314_ = i + aClass141_Sub2_Sub1_9774.anInt11379;
		int i_315_ = i;
		while (i_314_ <= i_305_) {
		    OpenGL.glTexCoord2f(0.0F,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_315_, i_311_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(i_315_, i_306_);
		    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
					f);
		    OpenGL.glVertex2i(i_314_, i_306_);
		    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_314_, i_311_);
		    i_314_ += i_308_;
		    i_315_ += i_308_;
		}
		if (i_315_ < i_305_) {
		    float f_316_
			= (aClass141_Sub2_Sub1_9774.aFloat11378
			   * (float) (i_305_ - i_315_)
			   / (float) aClass141_Sub2_Sub1_9774.anInt11379);
		    OpenGL.glTexCoord2f(0.0F,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_315_, i_311_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(i_315_, i_306_);
		    OpenGL.glTexCoord2f(f_316_, f);
		    OpenGL.glVertex2i(i_305_, i_306_);
		    OpenGL.glTexCoord2f(f_316_,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_305_, i_311_);
		}
	    }
	    OpenGL.glEnd();
	    OpenGL.glPopMatrix();
	}
    }
    
    public int method22() {
	return aClass141_Sub2_Sub1_9774.anInt11379 + anInt9772 + anInt9778;
    }
    
    void method2707(float f, float f_317_, float f_318_, float f_319_,
		    float f_320_, float f_321_, int i, Class145 class145,
		    int i_322_, int i_323_) {
	Class141_Sub2_Sub1 class141_sub2_sub1
	    = ((Class145_Sub3) class145).aClass141_Sub2_Sub1_9876;
	if (aBool9776) {
	    float f_324_ = (float) method22();
	    float f_325_ = (float) method2692();
	    float f_326_ = (f_318_ - f) / f_324_;
	    float f_327_ = (f_319_ - f_317_) / f_324_;
	    float f_328_ = (f_320_ - f) / f_325_;
	    float f_329_ = (f_321_ - f_317_) / f_325_;
	    float f_330_ = f_328_ * (float) anInt9777;
	    float f_331_ = f_329_ * (float) anInt9777;
	    float f_332_ = f_326_ * (float) anInt9772;
	    float f_333_ = f_327_ * (float) anInt9772;
	    float f_334_ = -f_326_ * (float) anInt9778;
	    float f_335_ = -f_327_ * (float) anInt9778;
	    float f_336_ = -f_328_ * (float) anInt9779;
	    float f_337_ = -f_329_ * (float) anInt9779;
	    f = f + f_332_ + f_330_;
	    f_317_ = f_317_ + f_333_ + f_331_;
	    f_318_ = f_318_ + f_334_ + f_330_;
	    f_319_ = f_319_ + f_335_ + f_331_;
	    f_320_ = f_320_ + f_332_ + f_336_;
	    f_321_ = f_321_ + f_333_ + f_337_;
	}
	float f_338_ = f_320_ + (f_318_ - f);
	float f_339_ = f_319_ + (f_321_ - f_317_);
	aClass141_Sub2_Sub1_9774.method2382((i & 0x1) != 0);
	aClass185_Sub3_9773.method15224();
	aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
	aClass185_Sub3_9773.method15214(1);
	aClass185_Sub3_9773.method15230(1);
	aClass185_Sub3_9773.method15231(class141_sub2_sub1);
	aClass185_Sub3_9773.method15232(7681, 8448);
	aClass185_Sub3_9773.method15325(0, 34168, 768);
	aClass185_Sub3_9773.method15246(1);
	float f_340_ = (class141_sub2_sub1.aFloat11378
			/ (float) class141_sub2_sub1.anInt11379);
	float f_341_ = (class141_sub2_sub1.aFloat11380
			/ (float) class141_sub2_sub1.anInt11381);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 aClass141_Sub2_Sub1_9774.aFloat11380);
	OpenGL.glMultiTexCoord2f(33985, f_340_ * (f - (float) i_322_),
				 (class141_sub2_sub1.aFloat11380
				  - f_341_ * (f_317_ - (float) i_323_)));
	OpenGL.glVertex2f(f, f_317_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_340_ * (f_320_ - (float) i_322_),
				 (class141_sub2_sub1.aFloat11380
				  - f_341_ * (f_321_ - (float) i_323_)));
	OpenGL.glVertex2f(f_320_, f_321_);
	OpenGL.glMultiTexCoord2f(33984, aClass141_Sub2_Sub1_9774.aFloat11378,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_340_ * (f_338_ - (float) i_322_),
				 (class141_sub2_sub1.aFloat11380
				  - f_341_ * (f_339_ - (float) i_323_)));
	OpenGL.glVertex2f(f_338_, f_339_);
	OpenGL.glMultiTexCoord2f(33984, aClass141_Sub2_Sub1_9774.aFloat11378,
				 aClass141_Sub2_Sub1_9774.aFloat11380);
	OpenGL.glMultiTexCoord2f(33985, f_340_ * (f_318_ - (float) i_322_),
				 (class141_sub2_sub1.aFloat11380
				  - f_341_ * (f_319_ - (float) i_323_)));
	OpenGL.glVertex2f(f_318_, f_319_);
	OpenGL.glEnd();
	aClass185_Sub3_9773.method15325(0, 5890, 768);
	aClass185_Sub3_9773.method15214(0);
	aClass185_Sub3_9773.method15231(null);
	aClass185_Sub3_9773.method15230(0);
    }
    
    public Interface22 method2681() {
	return aClass141_Sub2_Sub1_9774.method14451(0);
    }
    
    void method2710(float f, float f_342_, float f_343_, float f_344_,
		    float f_345_, float f_346_, int i, int i_347_, int i_348_,
		    int i_349_) {
	if (aBool9776) {
	    float f_350_ = (float) method22();
	    float f_351_ = (float) method2692();
	    float f_352_ = (f_343_ - f) / f_350_;
	    float f_353_ = (f_344_ - f_342_) / f_350_;
	    float f_354_ = (f_345_ - f) / f_351_;
	    float f_355_ = (f_346_ - f_342_) / f_351_;
	    float f_356_ = f_354_ * (float) anInt9777;
	    float f_357_ = f_355_ * (float) anInt9777;
	    float f_358_ = f_352_ * (float) anInt9772;
	    float f_359_ = f_353_ * (float) anInt9772;
	    float f_360_ = -f_352_ * (float) anInt9778;
	    float f_361_ = -f_353_ * (float) anInt9778;
	    float f_362_ = -f_354_ * (float) anInt9779;
	    float f_363_ = -f_355_ * (float) anInt9779;
	    f = f + f_358_ + f_356_;
	    f_342_ = f_342_ + f_359_ + f_357_;
	    f_343_ = f_343_ + f_360_ + f_356_;
	    f_344_ = f_344_ + f_361_ + f_357_;
	    f_345_ = f_345_ + f_358_ + f_362_;
	    f_346_ = f_346_ + f_359_ + f_363_;
	}
	float f_364_ = f_345_ + (f_343_ - f);
	float f_365_ = f_344_ + (f_346_ - f_342_);
	aClass141_Sub2_Sub1_9774.method2382((i_349_ & 0x1) != 0);
	aClass185_Sub3_9773.method15224();
	aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
	aClass185_Sub3_9773.method15246(i_348_);
	aClass185_Sub3_9773.method15214(i);
	OpenGL.glColor4ub((byte) (i_347_ >> 16), (byte) (i_347_ >> 8),
			  (byte) i_347_, (byte) (i_347_ >> 24));
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, aClass141_Sub2_Sub1_9774.aFloat11380);
	OpenGL.glVertex2f(f, f_342_);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2f(f_345_, f_346_);
	OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378, 0.0F);
	OpenGL.glVertex2f(f_364_, f_365_);
	OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
			    aClass141_Sub2_Sub1_9774.aFloat11380);
	OpenGL.glVertex2f(f_343_, f_344_);
	OpenGL.glEnd();
    }
    
    void method15489(int i, int i_366_, int i_367_, int i_368_, int i_369_,
		     int i_370_, boolean bool) {
	if (aClass185_Sub3_9773.aBool9582 && !bool) {
	    int[] is = aClass185_Sub3_9773.method3267(i_369_, i_370_, i_367_,
						      i_368_);
	    if (is != null) {
		for (int i_371_ = 0; i_371_ < is.length; i_371_++)
		    is[i_371_] |= ~0xffffff;
		method2652(i, i_366_, i_367_, i_368_, is, 0, i_367_);
	    }
	} else
	    aClass141_Sub2_Sub1_9774.method14452(i, i_366_, i_367_, i_368_,
						 i_369_, i_370_);
    }
    
    void method15490(int i, int i_372_, int i_373_, int i_374_, int i_375_,
		     int i_376_, boolean bool) {
	if (aClass185_Sub3_9773.aBool9582 && !bool) {
	    int[] is = aClass185_Sub3_9773.method3267(i_375_, i_376_, i_373_,
						      i_374_);
	    if (is != null) {
		for (int i_377_ = 0; i_377_ < is.length; i_377_++)
		    is[i_377_] |= ~0xffffff;
		method2652(i, i_372_, i_373_, i_374_, is, 0, i_373_);
	    }
	} else
	    aClass141_Sub2_Sub1_9774.method14452(i, i_372_, i_373_, i_374_,
						 i_375_, i_376_);
    }
    
    void method15491(int i) {
	aClass185_Sub3_9773.method15230(1);
	aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
	aClass185_Sub3_9773.method15232(aClass185_Sub3_9773.method15298(i),
					7681);
	aClass185_Sub3_9773.method15325(1, 34167, 768);
	aClass185_Sub3_9773.method15239(0, 34168, 770);
	aClass185_Sub3_9773.method15230(0);
	aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9780);
	aClass185_Sub3_9773.method15232(34479, 7681);
	aClass185_Sub3_9773.method15325(1, 34166, 768);
	if (anInt9775 == 0)
	    aClass185_Sub3_9773.method15236(1.0F, 0.5F, 0.5F, 0.0F);
	else if (anInt9775 == 1)
	    aClass185_Sub3_9773.method15236(0.5F, 1.0F, 0.5F, 0.0F);
	else if (anInt9775 == 2)
	    aClass185_Sub3_9773.method15236(0.5F, 0.5F, 1.0F, 0.0F);
	else if (anInt9775 == 3)
	    aClass185_Sub3_9773.method15236(128.5F, 128.5F, 128.5F, 0.0F);
    }
    
    void method15492() {
	aClass185_Sub3_9773.method15230(1);
	aClass185_Sub3_9773.method15231(null);
	aClass185_Sub3_9773.method15232(8448, 8448);
	aClass185_Sub3_9773.method15325(1, 34168, 768);
	aClass185_Sub3_9773.method15239(0, 5890, 770);
	aClass185_Sub3_9773.method15230(0);
	aClass185_Sub3_9773.method15325(1, 34168, 768);
    }
    
    void method15493() {
	aClass185_Sub3_9773.method15230(1);
	aClass185_Sub3_9773.method15231(null);
	aClass185_Sub3_9773.method15232(8448, 8448);
	aClass185_Sub3_9773.method15325(1, 34168, 768);
	aClass185_Sub3_9773.method15239(0, 5890, 770);
	aClass185_Sub3_9773.method15230(0);
	aClass185_Sub3_9773.method15325(1, 34168, 768);
    }
    
    void method15494() {
	aClass185_Sub3_9773.method15230(1);
	aClass185_Sub3_9773.method15231(null);
	aClass185_Sub3_9773.method15232(8448, 8448);
	aClass185_Sub3_9773.method15325(1, 34168, 768);
	aClass185_Sub3_9773.method15239(0, 5890, 770);
	aClass185_Sub3_9773.method15230(0);
	aClass185_Sub3_9773.method15325(1, 34168, 768);
    }
    
    public void method2720(int i, int i_378_, int i_379_, int i_380_,
			   int i_381_, int i_382_, int i_383_) {
	int i_384_ = i + i_379_;
	int i_385_ = i_378_ + i_380_;
	aClass141_Sub2_Sub1_9774.method2382(false);
	aClass185_Sub3_9773.method15224();
	aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
	aClass185_Sub3_9773.method15246(i_383_);
	aClass185_Sub3_9773.method15214(i_381_);
	OpenGL.glColor4ub((byte) (i_382_ >> 16), (byte) (i_382_ >> 8),
			  (byte) i_382_, (byte) (i_382_ >> 24));
	if (aClass141_Sub2_Sub1_9774.aBool11382 && !aBool9776
	    && i_380_ >= aClass141_Sub2_Sub1_9774.anInt11381
	    && i_379_ >= aClass141_Sub2_Sub1_9774.anInt11379) {
	    float f = (aClass141_Sub2_Sub1_9774.aFloat11380 * (float) i_380_
		       / (float) aClass141_Sub2_Sub1_9774.anInt11381);
	    float f_386_
		= (aClass141_Sub2_Sub1_9774.aFloat11378 * (float) i_379_
		   / (float) aClass141_Sub2_Sub1_9774.anInt11379);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, f);
	    OpenGL.glVertex2i(i, i_378_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_385_);
	    OpenGL.glTexCoord2f(f_386_, 0.0F);
	    OpenGL.glVertex2i(i_384_, i_385_);
	    OpenGL.glTexCoord2f(f_386_, f);
	    OpenGL.glVertex2i(i_384_, i_378_);
	    OpenGL.glEnd();
	} else {
	    OpenGL.glPushMatrix();
	    OpenGL.glTranslatef((float) anInt9772, (float) anInt9777, 0.0F);
	    int i_387_ = method22();
	    int i_388_ = method2692();
	    int i_389_ = i_378_ + aClass141_Sub2_Sub1_9774.anInt11381;
	    OpenGL.glBegin(7);
	    int i_390_ = i_378_;
	    for (/**/; i_389_ <= i_385_; i_389_ += i_388_) {
		int i_391_ = i + aClass141_Sub2_Sub1_9774.anInt11379;
		int i_392_ = i;
		while (i_391_ <= i_384_) {
		    OpenGL.glTexCoord2f(0.0F,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_392_, i_390_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(i_392_, i_389_);
		    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
					0.0F);
		    OpenGL.glVertex2i(i_391_, i_389_);
		    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_391_, i_390_);
		    i_391_ += i_387_;
		    i_392_ += i_387_;
		}
		if (i_392_ < i_384_) {
		    float f = (aClass141_Sub2_Sub1_9774.aFloat11378
			       * (float) (i_384_ - i_392_)
			       / (float) aClass141_Sub2_Sub1_9774.anInt11379);
		    OpenGL.glTexCoord2f(0.0F,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_392_, i_390_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(i_392_, i_389_);
		    OpenGL.glTexCoord2f(f, 0.0F);
		    OpenGL.glVertex2i(i_384_, i_389_);
		    OpenGL.glTexCoord2f(f,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_384_, i_390_);
		}
		i_390_ += i_388_;
	    }
	    if (i_390_ < i_385_) {
		float f = (aClass141_Sub2_Sub1_9774.aFloat11380
			   * (float) (aClass141_Sub2_Sub1_9774.anInt11381
				      - (i_385_ - i_390_))
			   / (float) aClass141_Sub2_Sub1_9774.anInt11381);
		int i_393_ = i + aClass141_Sub2_Sub1_9774.anInt11379;
		int i_394_ = i;
		while (i_393_ <= i_384_) {
		    OpenGL.glTexCoord2f(0.0F,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_394_, i_390_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(i_394_, i_385_);
		    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
					f);
		    OpenGL.glVertex2i(i_393_, i_385_);
		    OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_393_, i_390_);
		    i_393_ += i_387_;
		    i_394_ += i_387_;
		}
		if (i_394_ < i_384_) {
		    float f_395_
			= (aClass141_Sub2_Sub1_9774.aFloat11378
			   * (float) (i_384_ - i_394_)
			   / (float) aClass141_Sub2_Sub1_9774.anInt11379);
		    OpenGL.glTexCoord2f(0.0F,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_394_, i_390_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(i_394_, i_385_);
		    OpenGL.glTexCoord2f(f_395_, f);
		    OpenGL.glVertex2i(i_384_, i_385_);
		    OpenGL.glTexCoord2f(f_395_,
					aClass141_Sub2_Sub1_9774.aFloat11380);
		    OpenGL.glVertex2i(i_384_, i_390_);
		}
	    }
	    OpenGL.glEnd();
	    OpenGL.glPopMatrix();
	}
    }
    
    public void method2674(int i, int i_396_, int i_397_, int i_398_, int[] is,
			   int[] is_399_, int i_400_, int i_401_) {
	aClass141_Sub2_Sub1_9774.method14446(i, i_396_, i_397_, i_398_, is,
					     is_399_, i_400_);
    }
    
    public int method23() {
	return aClass141_Sub2_Sub1_9774.anInt11379 + anInt9772 + anInt9778;
    }
    
    void method2711(float f, float f_402_, float f_403_, float f_404_,
		    float f_405_, float f_406_, int i, int i_407_, int i_408_,
		    int i_409_) {
	if (aBool9776) {
	    float f_410_ = (float) method22();
	    float f_411_ = (float) method2692();
	    float f_412_ = (f_403_ - f) / f_410_;
	    float f_413_ = (f_404_ - f_402_) / f_410_;
	    float f_414_ = (f_405_ - f) / f_411_;
	    float f_415_ = (f_406_ - f_402_) / f_411_;
	    float f_416_ = f_414_ * (float) anInt9777;
	    float f_417_ = f_415_ * (float) anInt9777;
	    float f_418_ = f_412_ * (float) anInt9772;
	    float f_419_ = f_413_ * (float) anInt9772;
	    float f_420_ = -f_412_ * (float) anInt9778;
	    float f_421_ = -f_413_ * (float) anInt9778;
	    float f_422_ = -f_414_ * (float) anInt9779;
	    float f_423_ = -f_415_ * (float) anInt9779;
	    f = f + f_418_ + f_416_;
	    f_402_ = f_402_ + f_419_ + f_417_;
	    f_403_ = f_403_ + f_420_ + f_416_;
	    f_404_ = f_404_ + f_421_ + f_417_;
	    f_405_ = f_405_ + f_418_ + f_422_;
	    f_406_ = f_406_ + f_419_ + f_423_;
	}
	float f_424_ = f_405_ + (f_403_ - f);
	float f_425_ = f_404_ + (f_406_ - f_402_);
	aClass141_Sub2_Sub1_9774.method2382((i_409_ & 0x1) != 0);
	aClass185_Sub3_9773.method15224();
	aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
	aClass185_Sub3_9773.method15246(i_408_);
	aClass185_Sub3_9773.method15214(i);
	OpenGL.glColor4ub((byte) (i_407_ >> 16), (byte) (i_407_ >> 8),
			  (byte) i_407_, (byte) (i_407_ >> 24));
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, aClass141_Sub2_Sub1_9774.aFloat11380);
	OpenGL.glVertex2f(f, f_402_);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2f(f_405_, f_406_);
	OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378, 0.0F);
	OpenGL.glVertex2f(f_424_, f_425_);
	OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
			    aClass141_Sub2_Sub1_9774.aFloat11380);
	OpenGL.glVertex2f(f_403_, f_404_);
	OpenGL.glEnd();
    }
    
    void method2677(float f, float f_426_, float f_427_, float f_428_,
		    float f_429_, float f_430_, int i, int i_431_, int i_432_,
		    int i_433_) {
	if (aBool9776) {
	    float f_434_ = (float) method22();
	    float f_435_ = (float) method2692();
	    float f_436_ = (f_427_ - f) / f_434_;
	    float f_437_ = (f_428_ - f_426_) / f_434_;
	    float f_438_ = (f_429_ - f) / f_435_;
	    float f_439_ = (f_430_ - f_426_) / f_435_;
	    float f_440_ = f_438_ * (float) anInt9777;
	    float f_441_ = f_439_ * (float) anInt9777;
	    float f_442_ = f_436_ * (float) anInt9772;
	    float f_443_ = f_437_ * (float) anInt9772;
	    float f_444_ = -f_436_ * (float) anInt9778;
	    float f_445_ = -f_437_ * (float) anInt9778;
	    float f_446_ = -f_438_ * (float) anInt9779;
	    float f_447_ = -f_439_ * (float) anInt9779;
	    f = f + f_442_ + f_440_;
	    f_426_ = f_426_ + f_443_ + f_441_;
	    f_427_ = f_427_ + f_444_ + f_440_;
	    f_428_ = f_428_ + f_445_ + f_441_;
	    f_429_ = f_429_ + f_442_ + f_446_;
	    f_430_ = f_430_ + f_443_ + f_447_;
	}
	float f_448_ = f_429_ + (f_427_ - f);
	float f_449_ = f_428_ + (f_430_ - f_426_);
	aClass141_Sub2_Sub1_9774.method2382((i_433_ & 0x1) != 0);
	aClass185_Sub3_9773.method15224();
	aClass185_Sub3_9773.method15231(aClass141_Sub2_Sub1_9774);
	aClass185_Sub3_9773.method15246(i_432_);
	aClass185_Sub3_9773.method15214(i);
	OpenGL.glColor4ub((byte) (i_431_ >> 16), (byte) (i_431_ >> 8),
			  (byte) i_431_, (byte) (i_431_ >> 24));
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, aClass141_Sub2_Sub1_9774.aFloat11380);
	OpenGL.glVertex2f(f, f_426_);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2f(f_429_, f_430_);
	OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378, 0.0F);
	OpenGL.glVertex2f(f_448_, f_449_);
	OpenGL.glTexCoord2f(aClass141_Sub2_Sub1_9774.aFloat11378,
			    aClass141_Sub2_Sub1_9774.aFloat11380);
	OpenGL.glVertex2f(f_427_, f_428_);
	OpenGL.glEnd();
    }
}
