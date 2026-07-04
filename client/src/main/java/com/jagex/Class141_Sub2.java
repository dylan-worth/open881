/* Class141_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class141_Sub2 extends Class141
{
    int anInt8918;
    int anInt8919;
    
    Class141_Sub2(Class185_Sub3 class185_sub3, int i, Class181 class181,
		  Class173 class173, int i_0_, int i_1_, boolean bool,
		  float[] fs, Class181 class181_2_) {
	super(class185_sub3, i, class181, class173, i_0_ * i_1_, bool);
	anInt8918 = i_0_;
	anInt8919 = i_1_;
	aClass185_Sub3_1626.method15231(this);
	if (bool && anInt1628 != 34037) {
	    method2374(i,
		       Class185_Sub3.method15257(aClass181_1629,
						 aClass173_1630),
		       i_0_, i_1_, class181_2_, fs);
	    method2367(true);
	} else {
	    OpenGL.glTexImage2Df(anInt1628, 0,
				 Class185_Sub3.method15257(aClass181_1629,
							   aClass173_1630),
				 anInt8918, anInt8919, 0,
				 Class185_Sub3.method15256(class181_2_), 5126,
				 fs, 0);
	    method2367(false);
	}
	method2382(true);
    }
    
    void method14446(int i, int i_3_, int i_4_, int i_5_, int[] is,
		     int[] is_6_, int i_7_) {
	int[] is_8_ = is_6_ == null ? new int[anInt8918 * anInt8919] : is_6_;
	aClass185_Sub3_1626.method15231(this);
	OpenGL.glGetTexImagei(anInt1628, 0, 32993, 5121, is_8_, 0);
	for (int i_9_ = 0; i_9_ < i_5_; i_9_++)
	    System.arraycopy(is_8_, (i_3_ + (i_5_ - 1) - i_9_) * anInt8918, is,
			     i_7_ + i_9_ * i_4_, i_4_);
    }
    
    Class141_Sub2(Class185_Sub3 class185_sub3, int i, int i_10_, int i_11_,
		  boolean bool, int[] is, int i_12_, int i_13_,
		  boolean bool_14_) {
	super(class185_sub3, i, Class181.aClass181_1952,
	      Class173.aClass173_1830, i_10_ * i_11_, bool);
	anInt8918 = i_10_;
	anInt8919 = i_11_;
	if (bool_14_) {
	    int[] is_15_ = new int[is.length];
	    for (int i_16_ = 0; i_16_ < i_11_; i_16_++) {
		int i_17_ = i_16_ * i_10_;
		int i_18_ = (i_11_ - i_16_ - 1) * i_10_;
		for (int i_19_ = 0; i_19_ < i_10_; i_19_++)
		    is_15_[i_17_++] = is[i_18_++];
	    }
	    is = is_15_;
	}
	aClass185_Sub3_1626.method15231(this);
	if (anInt1628 == 34037 || !bool || i_12_ != 0 || i_13_ != 0) {
	    OpenGL.glPixelStorei(3314, i_12_);
	    OpenGL.glTexImage2Di(anInt1628, 0,
				 Class185_Sub3.method15257(aClass181_1629,
							   aClass173_1630),
				 anInt8918, anInt8919, 0, 32993,
				 aClass185_Sub3_1626.anInt9620, is, i_13_ * 4);
	    OpenGL.glPixelStorei(3314, 0);
	    method2367(false);
	} else {
	    method2372(anInt1628,
		       Class185_Sub3.method15257(aClass181_1629,
						 aClass173_1630),
		       anInt8918, anInt8919, 32993,
		       aClass185_Sub3_1626.anInt9620, is);
	    method2367(true);
	}
	method2382(true);
    }
    
    Interface21 method14447(int i) {
	return new Class164(this, i);
    }
    
    Interface21 method14448(int i) {
	return new Class164(this, i);
    }
    
    void method14449(int i, int i_20_, int i_21_, int i_22_, int[] is,
		     int i_23_, int i_24_, boolean bool) {
	if (i_24_ == 0)
	    i_24_ = i_21_;
	if (bool) {
	    int[] is_25_ = new int[i_21_ * i_22_];
	    for (int i_26_ = 0; i_26_ < i_22_; i_26_++) {
		int i_27_ = i_26_ * i_21_;
		int i_28_ = (i_22_ - i_26_ - 1) * i_24_ + i_23_;
		for (int i_29_ = 0; i_29_ < i_21_; i_29_++)
		    is_25_[i_27_++] = is[i_28_++];
	    }
	    is = is_25_;
	}
	aClass185_Sub3_1626.method15231(this);
	if (i_21_ != i_24_)
	    OpenGL.glPixelStorei(3314, i_24_);
	OpenGL.glTexSubImage2Di(anInt1628, 0, i, anInt8919 - i_20_ - i_22_,
				i_21_, i_22_, 32993,
				aClass185_Sub3_1626.anInt9620, is, i_23_);
	if (i_21_ != i_24_)
	    OpenGL.glPixelStorei(3314, 0);
    }
    
    Class141_Sub2(Class185_Sub3 class185_sub3, int i, int i_30_, int i_31_,
		  int i_32_, int i_33_) {
	super(class185_sub3, i, Class181.aClass181_1959,
	      Class173.aClass173_1830, i_32_ * i_33_, false);
	anInt8918 = i_32_;
	anInt8919 = i_33_;
	aClass185_Sub3_1626.method15231(this);
	Class175 class175 = aClass185_Sub3_1626.method3253(-746973407);
	if (class175 != null) {
	    int i_34_ = class175.method2911() - (i_31_ + i_33_);
	    int i_35_
		= Class185_Sub3.method15257(aClass181_1629, aClass173_1630);
	    OpenGL.glCopyTexImage2D(anInt1628, 0, i_35_, i_30_, i_34_, i_32_,
				    i_33_, 0);
	}
	method2382(true);
    }
    
    void method14450(int i, int i_36_, int i_37_, int i_38_, byte[] is,
		     Class181 class181, int i_39_, int i_40_, boolean bool) {
	if (i_40_ == 0)
	    i_40_ = i_37_;
	if (bool) {
	    int i_41_ = class181.anInt1962 * 1676120375;
	    int i_42_ = i_41_ * i_37_;
	    int i_43_ = i_41_ * i_40_;
	    byte[] is_44_ = new byte[i_42_ * i_38_];
	    for (int i_45_ = 0; i_45_ < i_38_; i_45_++) {
		int i_46_ = i_45_ * i_42_;
		int i_47_ = (i_38_ - i_45_ - 1) * i_43_ + i_39_;
		for (int i_48_ = 0; i_48_ < i_42_; i_48_++)
		    is_44_[i_46_++] = is[i_47_++];
	    }
	    is = is_44_;
	}
	aClass185_Sub3_1626.method15231(this);
	OpenGL.glPixelStorei(3317, 1);
	if (i_40_ != i_37_)
	    OpenGL.glPixelStorei(3314, i_40_);
	OpenGL.glTexSubImage2Dub(anInt1628, 0, i, anInt8919 - i_36_ - i_38_,
				 i_37_, i_38_,
				 Class185_Sub3.method15256(class181), 5121, is,
				 i_39_);
	if (i_40_ != i_37_)
	    OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    Interface22 method14451(int i) {
	return new Class164(this, i);
    }
    
    void method14452(int i, int i_49_, int i_50_, int i_51_, int i_52_,
		     int i_53_) {
	Class175 class175 = aClass185_Sub3_1626.method3253(-1571674144);
	if (class175 != null) {
	    int i_54_ = class175.method2911() - (i_53_ + i_51_);
	    aClass185_Sub3_1626.method15231(this);
	    OpenGL.glCopyTexSubImage2D(anInt1628, 0, i,
				       anInt8919 - (i_49_ + i_51_), i_52_,
				       i_54_, i_50_, i_51_);
	    OpenGL.glFlush();
	}
    }
    
    void method14453(int i, int i_55_, int i_56_, int i_57_, byte[] is,
		     Class181 class181, int i_58_, int i_59_, boolean bool) {
	if (i_59_ == 0)
	    i_59_ = i_56_;
	if (bool) {
	    int i_60_ = class181.anInt1962 * 1676120375;
	    int i_61_ = i_60_ * i_56_;
	    int i_62_ = i_60_ * i_59_;
	    byte[] is_63_ = new byte[i_61_ * i_57_];
	    for (int i_64_ = 0; i_64_ < i_57_; i_64_++) {
		int i_65_ = i_64_ * i_61_;
		int i_66_ = (i_57_ - i_64_ - 1) * i_62_ + i_58_;
		for (int i_67_ = 0; i_67_ < i_61_; i_67_++)
		    is_63_[i_65_++] = is[i_66_++];
	    }
	    is = is_63_;
	}
	aClass185_Sub3_1626.method15231(this);
	OpenGL.glPixelStorei(3317, 1);
	if (i_59_ != i_56_)
	    OpenGL.glPixelStorei(3314, i_59_);
	OpenGL.glTexSubImage2Dub(anInt1628, 0, i, anInt8919 - i_55_ - i_57_,
				 i_56_, i_57_,
				 Class185_Sub3.method15256(class181), 5121, is,
				 i_58_);
	if (i_59_ != i_56_)
	    OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    void method14454(boolean bool, boolean bool_68_) {
	if (anInt1628 == 3553) {
	    aClass185_Sub3_1626.method15231(this);
	    OpenGL.glTexParameteri(anInt1628, 10242, bool ? 10497 : 33071);
	    OpenGL.glTexParameteri(anInt1628, 10243, bool_68_ ? 10497 : 33071);
	}
    }
    
    void method14455(boolean bool, boolean bool_69_) {
	if (anInt1628 == 3553) {
	    aClass185_Sub3_1626.method15231(this);
	    OpenGL.glTexParameteri(anInt1628, 10242, bool ? 10497 : 33071);
	    OpenGL.glTexParameteri(anInt1628, 10243, bool_69_ ? 10497 : 33071);
	}
    }
    
    void method14456(int i, int i_70_, int i_71_, int i_72_, int i_73_,
		     int i_74_) {
	Class175 class175 = aClass185_Sub3_1626.method3253(-626924092);
	if (class175 != null) {
	    int i_75_ = class175.method2911() - (i_74_ + i_72_);
	    aClass185_Sub3_1626.method15231(this);
	    OpenGL.glCopyTexSubImage2D(anInt1628, 0, i,
				       anInt8919 - (i_70_ + i_72_), i_73_,
				       i_75_, i_71_, i_72_);
	    OpenGL.glFlush();
	}
    }
    
    void method14457(int i, int i_76_, int i_77_, int i_78_, int[] is,
		     int i_79_, int i_80_, boolean bool) {
	if (i_80_ == 0)
	    i_80_ = i_77_;
	if (bool) {
	    int[] is_81_ = new int[i_77_ * i_78_];
	    for (int i_82_ = 0; i_82_ < i_78_; i_82_++) {
		int i_83_ = i_82_ * i_77_;
		int i_84_ = (i_78_ - i_82_ - 1) * i_80_ + i_79_;
		for (int i_85_ = 0; i_85_ < i_77_; i_85_++)
		    is_81_[i_83_++] = is[i_84_++];
	    }
	    is = is_81_;
	}
	aClass185_Sub3_1626.method15231(this);
	if (i_77_ != i_80_)
	    OpenGL.glPixelStorei(3314, i_80_);
	OpenGL.glTexSubImage2Di(anInt1628, 0, i, anInt8919 - i_76_ - i_78_,
				i_77_, i_78_, 32993,
				aClass185_Sub3_1626.anInt9620, is, i_79_);
	if (i_77_ != i_80_)
	    OpenGL.glPixelStorei(3314, 0);
    }
    
    void method14458(int i, int i_86_, int i_87_, int i_88_, int i_89_,
		     int i_90_) {
	Class175 class175 = aClass185_Sub3_1626.method3253(-270162423);
	if (class175 != null) {
	    int i_91_ = class175.method2911() - (i_90_ + i_88_);
	    aClass185_Sub3_1626.method15231(this);
	    OpenGL.glCopyTexSubImage2D(anInt1628, 0, i,
				       anInt8919 - (i_86_ + i_88_), i_89_,
				       i_91_, i_87_, i_88_);
	    OpenGL.glFlush();
	}
    }
    
    void method14459(int i, int i_92_, int i_93_, int i_94_, int[] is,
		     int i_95_, int i_96_, boolean bool) {
	if (i_96_ == 0)
	    i_96_ = i_93_;
	if (bool) {
	    int[] is_97_ = new int[i_93_ * i_94_];
	    for (int i_98_ = 0; i_98_ < i_94_; i_98_++) {
		int i_99_ = i_98_ * i_93_;
		int i_100_ = (i_94_ - i_98_ - 1) * i_96_ + i_95_;
		for (int i_101_ = 0; i_101_ < i_93_; i_101_++)
		    is_97_[i_99_++] = is[i_100_++];
	    }
	    is = is_97_;
	}
	aClass185_Sub3_1626.method15231(this);
	if (i_93_ != i_96_)
	    OpenGL.glPixelStorei(3314, i_96_);
	OpenGL.glTexSubImage2Di(anInt1628, 0, i, anInt8919 - i_92_ - i_94_,
				i_93_, i_94_, 32993,
				aClass185_Sub3_1626.anInt9620, is, i_95_);
	if (i_93_ != i_96_)
	    OpenGL.glPixelStorei(3314, 0);
    }
    
    void method14460(int i, int i_102_, int i_103_, int i_104_, int[] is,
		     int[] is_105_, int i_106_) {
	int[] is_107_
	    = is_105_ == null ? new int[anInt8918 * anInt8919] : is_105_;
	aClass185_Sub3_1626.method15231(this);
	OpenGL.glGetTexImagei(anInt1628, 0, 32993, 5121, is_107_, 0);
	for (int i_108_ = 0; i_108_ < i_104_; i_108_++)
	    System.arraycopy(is_107_,
			     (i_102_ + (i_104_ - 1) - i_108_) * anInt8918, is,
			     i_106_ + i_108_ * i_103_, i_103_);
    }
    
    void method14461(int i, int i_109_, int i_110_, int i_111_, int[] is,
		     int[] is_112_, int i_113_) {
	int[] is_114_
	    = is_112_ == null ? new int[anInt8918 * anInt8919] : is_112_;
	aClass185_Sub3_1626.method15231(this);
	OpenGL.glGetTexImagei(anInt1628, 0, 32993, 5121, is_114_, 0);
	for (int i_115_ = 0; i_115_ < i_111_; i_115_++)
	    System.arraycopy(is_114_,
			     (i_109_ + (i_111_ - 1) - i_115_) * anInt8918, is,
			     i_113_ + i_115_ * i_110_, i_110_);
    }
    
    void method14462(int i, int i_116_, int i_117_, int i_118_, int[] is,
		     int[] is_119_, int i_120_) {
	int[] is_121_
	    = is_119_ == null ? new int[anInt8918 * anInt8919] : is_119_;
	aClass185_Sub3_1626.method15231(this);
	OpenGL.glGetTexImagei(anInt1628, 0, 32993, 5121, is_121_, 0);
	for (int i_122_ = 0; i_122_ < i_118_; i_122_++)
	    System.arraycopy(is_121_,
			     (i_116_ + (i_118_ - 1) - i_122_) * anInt8918, is,
			     i_120_ + i_122_ * i_117_, i_117_);
    }
    
    Interface22 method14463(int i) {
	return new Class164(this, i);
    }
    
    Class141_Sub2(Class185_Sub3 class185_sub3, int i, Class181 class181,
		  Class173 class173, int i_123_, int i_124_, boolean bool,
		  byte[] is, Class181 class181_125_, boolean bool_126_) {
	super(class185_sub3, i, class181, class173, i_123_ * i_124_, bool);
	anInt8918 = i_123_;
	anInt8919 = i_124_;
	if (bool_126_) {
	    byte[] is_127_ = new byte[is.length];
	    for (int i_128_ = 0; i_128_ < i_124_; i_128_++) {
		int i_129_ = i_128_ * i_123_;
		int i_130_ = (i_124_ - i_128_ - 1) * i_123_;
		for (int i_131_ = 0; i_131_ < i_123_; i_131_++)
		    is_127_[i_129_++] = is[i_130_++];
	    }
	    is = is_127_;
	}
	aClass185_Sub3_1626.method15231(this);
	OpenGL.glPixelStorei(3317, 1);
	if (bool && anInt1628 != 34037) {
	    method2373(i,
		       Class185_Sub3.method15257(aClass181_1629,
						 aClass173_1630),
		       i_123_, i_124_, class181_125_, is);
	    method2367(true);
	} else {
	    OpenGL.glTexImage2Dub(anInt1628, 0,
				  Class185_Sub3.method15257(aClass181_1629,
							    aClass173_1630),
				  anInt8918, anInt8919, 0,
				  Class185_Sub3.method15256(class181_125_),
				  5121, is, 0);
	    method2367(false);
	}
	OpenGL.glPixelStorei(3317, 4);
	method2382(true);
    }
    
    void method14464(int i, int i_132_, int i_133_, int i_134_, int i_135_,
		     int i_136_) {
	Class175 class175 = aClass185_Sub3_1626.method3253(-926889202);
	if (class175 != null) {
	    int i_137_ = class175.method2911() - (i_136_ + i_134_);
	    aClass185_Sub3_1626.method15231(this);
	    OpenGL.glCopyTexSubImage2D(anInt1628, 0, i,
				       anInt8919 - (i_132_ + i_134_), i_135_,
				       i_137_, i_133_, i_134_);
	    OpenGL.glFlush();
	}
    }
    
    Interface21 method14465(int i) {
	return new Class164(this, i);
    }
    
    Class141_Sub2(Class185_Sub3 class185_sub3, int i, Class181 class181,
		  Class173 class173, int i_138_, int i_139_) {
	super(class185_sub3, i, class181, class173, i_138_ * i_139_, false);
	anInt8918 = i_138_;
	anInt8919 = i_139_;
	aClass185_Sub3_1626.method15231(this);
	OpenGL.glTexImage2Dub(anInt1628, 0,
			      Class185_Sub3.method15257(aClass181_1629,
							aClass173_1630),
			      i_138_, i_139_, 0,
			      Class185_Sub3.method15256(aClass181_1629), 5121,
			      null, 0);
	method2382(true);
    }
    
    Interface21 method14466(int i) {
	return new Class164(this, i);
    }
    
    Interface22 method14467(int i) {
	return new Class164(this, i);
    }
    
    void method14468(int i, int i_140_, int i_141_, int i_142_, int[] is,
		     int i_143_, int i_144_, boolean bool) {
	if (i_144_ == 0)
	    i_144_ = i_141_;
	if (bool) {
	    int[] is_145_ = new int[i_141_ * i_142_];
	    for (int i_146_ = 0; i_146_ < i_142_; i_146_++) {
		int i_147_ = i_146_ * i_141_;
		int i_148_ = (i_142_ - i_146_ - 1) * i_144_ + i_143_;
		for (int i_149_ = 0; i_149_ < i_141_; i_149_++)
		    is_145_[i_147_++] = is[i_148_++];
	    }
	    is = is_145_;
	}
	aClass185_Sub3_1626.method15231(this);
	if (i_141_ != i_144_)
	    OpenGL.glPixelStorei(3314, i_144_);
	OpenGL.glTexSubImage2Di(anInt1628, 0, i, anInt8919 - i_140_ - i_142_,
				i_141_, i_142_, 32993,
				aClass185_Sub3_1626.anInt9620, is, i_143_);
	if (i_141_ != i_144_)
	    OpenGL.glPixelStorei(3314, 0);
    }
    
    Interface22 method14469(int i) {
	return new Class164(this, i);
    }
    
    Interface22 method14470(int i) {
	return new Class164(this, i);
    }
}
