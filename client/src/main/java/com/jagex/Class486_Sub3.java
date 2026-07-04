/* Class486_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class486_Sub3 extends Class486 implements Interface44
{
    float aFloat10238;
    int anInt10239;
    int anInt10240;
    float aFloat10241;
    
    public int method93() {
	return anInt10239;
    }
    
    public void method337(Class372 class372) {
	super.method339(class372);
    }
    
    public void method269(int i, int i_0_, int i_1_, int i_2_, int[] is,
			  int i_3_, int i_4_) {
	aClass185_Sub1_Sub2_5295.method14669(this);
	OpenGL.glPixelStorei(3314, i_4_);
	OpenGL.glTexSubImage2Di(anInt5303, 0, i, i_0_, i_1_, i_2_, 32993,
				aClass185_Sub1_Sub2_5295.anInt11590, is, i_3_);
	OpenGL.glPixelStorei(3314, 0);
    }
    
    public float method255(float f) {
	return f / (float) anInt10240;
    }
    
    Class486_Sub3(Class185_Sub1_Sub2 class185_sub1_sub2, Class181 class181,
		  int i, int i_5_, boolean bool, byte[] is, int i_6_,
		  int i_7_) {
	super(class185_sub1_sub2, 3553, class181, Class173.aClass173_1830,
	      i * i_5_, bool);
	if (!aClass185_Sub1_Sub2_5295.aBool11588) {
	    anInt10240 = Class162.method2640(i, (byte) 90);
	    anInt10239 = Class162.method2640(i_5_, (byte) 122);
	    aFloat10238 = (float) i / (float) anInt10240;
	    aFloat10241 = (float) i_5_ / (float) anInt10239;
	    if (i != anInt10240 || i_5_ != anInt10239) {
		is = aClass185_Sub1_Sub2_5295.method3370(i, i_5_, anInt10240,
							 anInt10239, is, i_6_,
							 i_7_,
							 (class181.anInt1962
							  * 1676120375),
							 (byte) 10);
		i_6_ = 0;
		i_7_ = anInt10240;
	    }
	} else {
	    anInt10240 = i;
	    anInt10239 = i_5_;
	    aFloat10238 = 1.0F;
	    aFloat10241 = 1.0F;
	}
	aClass185_Sub1_Sub2_5295.method14669(this);
	OpenGL.glPixelStorei(3317, 1);
	if (!bool || i_7_ != 0 || i_6_ != 0) {
	    OpenGL.glPixelStorei(3314, i_7_);
	    if (aClass181_5292 == Class181.aClass181_1958)
		OpenGL.glCompressedTexImage2Dub(anInt5303, 0, 33777, i, i_5_,
						0, i * i_5_ / 2, is, i_6_);
	    else if (aClass181_5292 == Class181.aClass181_1960)
		OpenGL.glCompressedTexImage2Dub(anInt5303, 0, 33779, i, i_5_,
						0, i * i_5_, is, i_6_);
	    else
		OpenGL.glTexImage2Dub
		    (anInt5303, 0,
		     Class185_Sub1_Sub2.method18075(aClass181_5292,
						    aClass173_5291),
		     i, i_5_, 0,
		     Class185_Sub1_Sub2.method18097(aClass181_5292), 5121, is,
		     i_6_);
	    OpenGL.glPixelStorei(3314, 0);
	} else
	    method7988(anInt5303, i, i_5_, is);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    public void method333() {
	super.method333();
    }
    
    public float method241(float f) {
	return f / (float) anInt10240;
    }
    
    public float method245(float f) {
	return f / (float) anInt10239;
    }
    
    public float method250() {
	return aFloat10238;
    }
    
    public int method251() {
	return anInt10240;
    }
    
    public boolean method204() {
	return true;
    }
    
    public void method257(boolean bool, boolean bool_8_) {
	aClass185_Sub1_Sub2_5295.method14669(this);
	OpenGL.glTexParameteri(anInt5303, 10242, bool ? 10497 : 33071);
	OpenGL.glTexParameteri(anInt5303, 10243, bool_8_ ? 10497 : 33071);
    }
    
    public Interface22 method341(int i) {
	return new Class490(this, i);
    }
    
    public void method244(int i, int i_9_, int i_10_, int i_11_, byte[] is,
			  Class181 class181, int i_12_, int i_13_) {
	aClass185_Sub1_Sub2_5295.method14669(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glPixelStorei(3314, i_13_);
	OpenGL.glTexSubImage2Dub(anInt5303, 0, i, i_9_, i_10_, i_11_,
				 Class185_Sub1_Sub2.method18097(class181),
				 5121, is, i_12_);
	OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    public void method246(int i, int i_14_, int i_15_, int i_16_, int[] is,
			  int i_17_) {
	method262(i, i_14_, i_15_, i_16_, is, null, i_17_);
    }
    
    public void method262(int i, int i_18_, int i_19_, int i_20_, int[] is,
			  int[] is_21_, int i_22_) {
	int[] is_23_
	    = is_21_ == null ? new int[anInt10240 * anInt10239] : is_21_;
	aClass185_Sub1_Sub2_5295.method14669(this);
	OpenGL.glGetTexImagei(anInt5303, 0, 32993, 5121, is_23_, 0);
	for (int i_24_ = 0; i_24_ < i_20_; i_24_++)
	    System.arraycopy(is_23_, i_24_ * anInt10240, is,
			     i_22_ + i_24_ * i_19_, i_19_);
    }
    
    public void method247(int i, int i_25_, int i_26_, int i_27_, int i_28_,
			  int i_29_) {
	aClass185_Sub1_Sub2_5295.method14669(this);
	Class175 class175 = aClass185_Sub1_Sub2_5295.method3253(-768628479);
	if (class175 != null) {
	    int i_30_ = class175.method2911() - (i_29_ + i_27_);
	    int i_31_ = Class185_Sub1_Sub2.method18075(aClass181_5292,
						       aClass173_5291);
	    OpenGL.glCopyTexImage2D(anInt5303, 0, i_31_, i_28_, i_30_, i_26_,
				    i_27_, 0);
	}
    }
    
    public Interface22 method342(int i) {
	return new Class490(this, i);
    }
    
    public boolean method270() {
	return super.method270();
    }
    
    Class486_Sub3(Class185_Sub1_Sub2 class185_sub1_sub2, int i, int i_32_,
		  boolean bool, int[] is, int i_33_, int i_34_) {
	super(class185_sub1_sub2, 3553, Class181.aClass181_1952,
	      Class173.aClass173_1830, i * i_32_, bool);
	if (!aClass185_Sub1_Sub2_5295.aBool11588) {
	    anInt10240 = Class162.method2640(i, (byte) 121);
	    anInt10239 = Class162.method2640(i_32_, (byte) 52);
	    aFloat10238 = (float) i / (float) anInt10240;
	    aFloat10241 = (float) i_32_ / (float) anInt10239;
	    if (i != anInt10240 || i_32_ != anInt10239) {
		is = aClass185_Sub1_Sub2_5295.method3368(i, i_32_, anInt10240,
							 anInt10239, is, i_33_,
							 i_34_, (byte) 69);
		i_33_ = 0;
		i_34_ = anInt10240;
	    }
	} else {
	    anInt10240 = i;
	    anInt10239 = i_32_;
	    aFloat10238 = 1.0F;
	    aFloat10241 = 1.0F;
	}
	aClass185_Sub1_Sub2_5295.method14669(this);
	if (!bool || i_34_ != 0 || i_33_ != 0) {
	    OpenGL.glPixelStorei(3314, i_34_);
	    OpenGL.glTexImage2Di(anInt5303, 0, 6408, anInt10240, anInt10239, 0,
				 32993, aClass185_Sub1_Sub2_5295.anInt11590,
				 is, i_33_ * 4);
	    OpenGL.glPixelStorei(3314, 0);
	} else
	    method7964(anInt5303, i, i_32_, is);
    }
    
    public void method339(Class372 class372) {
	super.method339(class372);
    }
    
    public void method334() {
	super.method333();
    }
    
    public void method142() {
	super.method142();
    }
    
    public void method141() {
	super.method142();
    }
    
    public void method144() {
	super.method142();
    }
    
    public float method239() {
	return aFloat10241;
    }
    
    public int method252() {
	return anInt10240;
    }
    
    public int method253() {
	return anInt10239;
    }
    
    public int method254() {
	return anInt10239;
    }
    
    public Interface22 method340(int i) {
	return new Class490(this, i);
    }
    
    public float method256(float f) {
	return f / (float) anInt10239;
    }
    
    public void method259(int i, int i_35_, int i_36_, int i_37_, int[] is,
			  int i_38_, int i_39_) {
	aClass185_Sub1_Sub2_5295.method14669(this);
	OpenGL.glPixelStorei(3314, i_39_);
	OpenGL.glTexSubImage2Di(anInt5303, 0, i, i_35_, i_36_, i_37_, 32993,
				aClass185_Sub1_Sub2_5295.anInt11590, is,
				i_38_);
	OpenGL.glPixelStorei(3314, 0);
    }
    
    public void method242(boolean bool, boolean bool_40_) {
	aClass185_Sub1_Sub2_5295.method14669(this);
	OpenGL.glTexParameteri(anInt5303, 10242, bool ? 10497 : 33071);
	OpenGL.glTexParameteri(anInt5303, 10243, bool_40_ ? 10497 : 33071);
    }
    
    Class486_Sub3(Class185_Sub1_Sub2 class185_sub1_sub2, Class181 class181,
		  int i, int i_41_, boolean bool, float[] fs, int i_42_,
		  int i_43_) {
	super(class185_sub1_sub2, 3553, class181, Class173.aClass173_1826,
	      i * i_41_, bool);
	if (!aClass185_Sub1_Sub2_5295.aBool11588) {
	    anInt10240 = Class162.method2640(i, (byte) 83);
	    anInt10239 = Class162.method2640(i_41_, (byte) 31);
	    aFloat10238 = (float) i / (float) anInt10240;
	    aFloat10241 = (float) i_41_ / (float) anInt10239;
	    if (i != anInt10240 || i_41_ != anInt10239) {
		fs = aClass185_Sub1_Sub2_5295.method3369(i, i_41_, anInt10240,
							 anInt10239, fs, i_42_,
							 i_43_,
							 (class181.anInt1962
							  * 1676120375),
							 639238427);
		i_42_ = 0;
		i_43_ = anInt10240;
	    }
	} else {
	    anInt10240 = i;
	    anInt10239 = i_41_;
	    aFloat10238 = 1.0F;
	    aFloat10241 = 1.0F;
	}
	aClass185_Sub1_Sub2_5295.method14669(this);
	if (!bool || i_43_ != 0 || i_42_ != 0) {
	    OpenGL.glPixelStorei(3314, i_43_);
	    OpenGL.glTexImage2Df
		(anInt5303, 0,
		 Class185_Sub1_Sub2.method18075(aClass181_5292,
						aClass173_5291),
		 i, i_41_, 0, Class185_Sub1_Sub2.method18097(aClass181_5292),
		 5126, fs, i_42_ * 4);
	    OpenGL.glPixelStorei(3314, 0);
	} else
	    method7966(anInt5303, i, i_41_, fs);
    }
    
    public void method265(int i, int i_44_, int i_45_, int i_46_, byte[] is,
			  Class181 class181, int i_47_, int i_48_) {
	aClass185_Sub1_Sub2_5295.method14669(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glPixelStorei(3314, i_48_);
	OpenGL.glTexSubImage2Dub(anInt5303, 0, i, i_44_, i_45_, i_46_,
				 Class185_Sub1_Sub2.method18097(class181),
				 5121, is, i_47_);
	OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    public void method261(int i, int i_49_, int i_50_, int i_51_, byte[] is,
			  Class181 class181, int i_52_, int i_53_) {
	aClass185_Sub1_Sub2_5295.method14669(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glPixelStorei(3314, i_53_);
	OpenGL.glTexSubImage2Dub(anInt5303, 0, i, i_49_, i_50_, i_51_,
				 Class185_Sub1_Sub2.method18097(class181),
				 5121, is, i_52_);
	OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    public void method258(int i, int i_54_, int i_55_, int i_56_, byte[] is,
			  Class181 class181, int i_57_, int i_58_) {
	aClass185_Sub1_Sub2_5295.method14669(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glPixelStorei(3314, i_58_);
	OpenGL.glTexSubImage2Dub(anInt5303, 0, i, i_54_, i_55_, i_56_,
				 Class185_Sub1_Sub2.method18097(class181),
				 5121, is, i_57_);
	OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    public void method263(int i, int i_59_, int i_60_, int i_61_, byte[] is,
			  Class181 class181, int i_62_, int i_63_) {
	aClass185_Sub1_Sub2_5295.method14669(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glPixelStorei(3314, i_63_);
	OpenGL.glTexSubImage2Dub(anInt5303, 0, i, i_59_, i_60_, i_61_,
				 Class185_Sub1_Sub2.method18097(class181),
				 5121, is, i_62_);
	OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    Class486_Sub3(Class185_Sub1_Sub2 class185_sub1_sub2, Class181 class181,
		  Class173 class173, int i, int i_64_) {
	super(class185_sub1_sub2, 3553, class181, class173, i * i_64_, false);
	if (!aClass185_Sub1_Sub2_5295.aBool11588) {
	    anInt10240 = Class162.method2640(i, (byte) 92);
	    anInt10239 = Class162.method2640(i_64_, (byte) 12);
	    aFloat10238 = (float) i / (float) anInt10240;
	    aFloat10241 = (float) i_64_ / (float) anInt10239;
	} else {
	    anInt10240 = i;
	    anInt10239 = i_64_;
	    aFloat10238 = 1.0F;
	    aFloat10241 = 1.0F;
	}
	aClass185_Sub1_Sub2_5295.method14669(this);
	OpenGL.glTexImage2Dub(anInt5303, 0,
			      Class185_Sub1_Sub2.method18075(aClass181_5292,
							     aClass173_5291),
			      i, i_64_, 0,
			      Class185_Sub1_Sub2.method18097(aClass181_5292),
			      Class185_Sub1_Sub2.method18074(aClass173_5291),
			      null, 0);
    }
    
    public void method243(int i, int i_65_, int i_66_, int i_67_, int[] is,
			  int i_68_) {
	method262(i, i_65_, i_66_, i_67_, is, null, i_68_);
    }
    
    public void method266(int i, int i_69_, int i_70_, int i_71_, int[] is,
			  int i_72_) {
	method262(i, i_69_, i_70_, i_71_, is, null, i_72_);
    }
    
    public void method267(int i, int i_73_, int i_74_, int i_75_, int[] is,
			  int i_76_) {
	method262(i, i_73_, i_74_, i_75_, is, null, i_76_);
    }
    
    public void method268(int i, int i_77_, int i_78_, int i_79_, int[] is,
			  int[] is_80_, int i_81_) {
	int[] is_82_
	    = is_80_ == null ? new int[anInt10240 * anInt10239] : is_80_;
	aClass185_Sub1_Sub2_5295.method14669(this);
	OpenGL.glGetTexImagei(anInt5303, 0, 32993, 5121, is_82_, 0);
	for (int i_83_ = 0; i_83_ < i_79_; i_83_++)
	    System.arraycopy(is_82_, i_83_ * anInt10240, is,
			     i_81_ + i_83_ * i_78_, i_78_);
    }
    
    public void method274(int i, int i_84_, int i_85_, int i_86_, int i_87_,
			  int i_88_) {
	aClass185_Sub1_Sub2_5295.method14669(this);
	Class175 class175 = aClass185_Sub1_Sub2_5295.method3253(-312180070);
	if (class175 != null) {
	    int i_89_ = class175.method2911() - (i_88_ + i_86_);
	    int i_90_ = Class185_Sub1_Sub2.method18075(aClass181_5292,
						       aClass173_5291);
	    OpenGL.glCopyTexImage2D(anInt5303, 0, i_90_, i_87_, i_89_, i_85_,
				    i_86_, 0);
	}
    }
    
    public float method249() {
	return aFloat10241;
    }
    
    public float method248() {
	return aFloat10238;
    }
    
    public void method143() {
	super.method142();
    }
    
    public boolean method260() {
	return true;
    }
    
    public boolean method273() {
	return super.method270();
    }
    
    public boolean method271() {
	return super.method270();
    }
    
    public void method264(int i, int i_91_, int i_92_, int i_93_, byte[] is,
			  Class181 class181, int i_94_, int i_95_) {
	aClass185_Sub1_Sub2_5295.method14669(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glPixelStorei(3314, i_95_);
	OpenGL.glTexSubImage2Dub(anInt5303, 0, i, i_91_, i_92_, i_93_,
				 Class185_Sub1_Sub2.method18097(class181),
				 5121, is, i_94_);
	OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    public void method335() {
	super.method333();
    }
    
    public void method332() {
	super.method333();
    }
    
    public float method272() {
	return aFloat10241;
    }
    
    public int method1() {
	return anInt10240;
    }
    
    public void method338(Class372 class372) {
	super.method339(class372);
    }
    
    public void method240(int i, int i_96_, int i_97_, int i_98_, int i_99_,
			  int i_100_) {
	aClass185_Sub1_Sub2_5295.method14669(this);
	Class175 class175 = aClass185_Sub1_Sub2_5295.method3253(-2110333119);
	if (class175 != null) {
	    int i_101_ = class175.method2911() - (i_100_ + i_98_);
	    int i_102_ = Class185_Sub1_Sub2.method18075(aClass181_5292,
							aClass173_5291);
	    OpenGL.glCopyTexImage2D(anInt5303, 0, i_102_, i_99_, i_101_, i_97_,
				    i_98_, 0);
	}
    }
    
    public boolean method275() {
	return super.method270();
    }
    
    public void method336() {
	super.method333();
    }
}
