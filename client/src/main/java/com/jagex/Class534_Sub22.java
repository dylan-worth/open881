/* Class534_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public class Class534_Sub22 extends Class534
{
    Class129 aClass129_10537;
    Class166 aClass166_10538;
    int anInt10539;
    float aFloat10540;
    Class185_Sub3 aClass185_Sub3_10541;
    NativeHeapBuffer aNativeHeapBuffer10542;
    Class126_Sub2 aClass126_Sub2_10543;
    int[] anIntArray10544;
    Class151_Sub1 aClass151_Sub1_10545;
    Stream aStream10546;
    
    void method16241(int i, int i_0_, int i_1_, float f) {
	if (anInt10539 != -1) {
	    Class186 class186
		= aClass185_Sub3_10541.aClass177_2012.method2931(anInt10539,
								 (byte) 1);
	    int i_2_ = class186.aByte2074 & 0xff;
	    if (i_2_ != 0 && class186.aByte2067 != 4) {
		int i_3_;
		if (i_1_ < 0)
		    i_3_ = 0;
		else if (i_1_ > 127)
		    i_3_ = 16777215;
		else
		    i_3_ = 131586 * i_1_;
		if (i_2_ == 256)
		    i_0_ = i_3_;
		else {
		    int i_4_ = i_2_;
		    int i_5_ = 256 - i_2_;
		    i_0_
			= (((i_3_ & 0xff00ff) * i_4_ + (i_0_ & 0xff00ff) * i_5_
			    & ~0xff00ff)
			   + ((i_3_ & 0xff00) * i_4_ + (i_0_ & 0xff00) * i_5_
			      & 0xff0000)) >> 8;
		}
	    }
	    int i_6_ = class186.aByte2059 & 0xff;
	    if (i_6_ != 0) {
		i_6_ += 256;
		int i_7_ = ((i_0_ & 0xff0000) >> 16) * i_6_;
		if (i_7_ > 65535)
		    i_7_ = 65535;
		int i_8_ = ((i_0_ & 0xff00) >> 8) * i_6_;
		if (i_8_ > 65535)
		    i_8_ = 65535;
		int i_9_ = (i_0_ & 0xff) * i_6_;
		if (i_9_ > 65535)
		    i_9_ = 65535;
		i_0_ = (i_7_ << 8 & 0xff0000) + (i_8_ & 0xff00) + (i_9_ >> 8);
	    }
	}
	if (f != 1.0F) {
	    int i_10_ = i_0_ >> 16 & 0xff;
	    int i_11_ = i_0_ >> 8 & 0xff;
	    int i_12_ = i_0_ & 0xff;
	    i_10_ *= f;
	    if (i_10_ < 0)
		i_10_ = 0;
	    else if (i_10_ > 255)
		i_10_ = 255;
	    i_11_ *= f;
	    if (i_11_ < 0)
		i_11_ = 0;
	    else if (i_11_ > 255)
		i_11_ = 255;
	    i_12_ *= f;
	    if (i_12_ < 0)
		i_12_ = 0;
	    else if (i_12_ > 255)
		i_12_ = 255;
	    i_0_ = i_10_ << 16 | i_11_ << 8 | i_12_;
	}
	aStream10546.method1802(i * 4);
	aStream10546.method1803((byte) (i_0_ >> 16));
	aStream10546.method1803((byte) (i_0_ >> 8));
	aStream10546.method1803((byte) i_0_);
    }
    
    void method16242(int i) {
	aStream10546.method1806();
	Interface15 interface15
	    = aClass185_Sub3_10541.method15219(4, aNativeHeapBuffer10542,
					       i * 4, false);
	if (interface15 instanceof Class134_Sub1)
	    aNativeHeapBuffer10542.method1781();
	aClass129_10537 = new Class129(interface15, 5121, 4, 0);
	aNativeHeapBuffer10542 = null;
	aStream10546 = null;
    }
    
    Class534_Sub22(Class151_Sub1 class151_sub1, int i, int i_13_,
		   Class166 class166) {
	aClass151_Sub1_10545 = class151_sub1;
	aClass185_Sub3_10541 = aClass151_Sub1_10545.aClass185_Sub3_9326;
	anInt10539 = i;
	aFloat10540 = (float) i_13_;
	aClass166_10538 = class166;
	anIntArray10544
	    = new int[(aClass151_Sub1_10545.anInt1701 * -1924295585
		       * (aClass151_Sub1_10545.anInt1700 * -1466328823))];
	aClass126_Sub2_10543
	    = new Class126_Sub2(aClass185_Sub3_10541, 5123, null, 1);
    }
    
    void method16243(int i) {
	aStream10546.method1802(i * 4 + 3);
	aStream10546.method1803(-1);
    }
    
    void method16244(int i) {
	aNativeHeapBuffer10542
	    = aClass185_Sub3_10541.aNativeHeap9639.method1975(i * 4, true);
	aStream10546 = new Stream(aNativeHeapBuffer10542);
    }
    
    void method16245(int i) {
	aStream10546.method1806();
	Interface15 interface15
	    = aClass185_Sub3_10541.method15219(4, aNativeHeapBuffer10542,
					       i * 4, false);
	if (interface15 instanceof Class134_Sub1)
	    aNativeHeapBuffer10542.method1781();
	aClass129_10537 = new Class129(interface15, 5121, 4, 0);
	aNativeHeapBuffer10542 = null;
	aStream10546 = null;
    }
    
    void method16246(int i) {
	aStream10546.method1802(i * 4 + 3);
	aStream10546.method1803(-1);
    }
    
    void method16247(int i) {
	aNativeHeapBuffer10542
	    = aClass185_Sub3_10541.aNativeHeap9639.method1975(i * 4, true);
	aStream10546 = new Stream(aNativeHeapBuffer10542);
    }
    
    void method16248(int i) {
	aNativeHeapBuffer10542
	    = aClass185_Sub3_10541.aNativeHeap9639.method1975(i * 4, true);
	aStream10546 = new Stream(aNativeHeapBuffer10542);
    }
    
    void method16249(int i) {
	aNativeHeapBuffer10542
	    = aClass185_Sub3_10541.aNativeHeap9639.method1975(i * 4, true);
	aStream10546 = new Stream(aNativeHeapBuffer10542);
    }
    
    void method16250(int i, int i_14_, int i_15_, float f) {
	if (anInt10539 != -1) {
	    Class186 class186
		= aClass185_Sub3_10541.aClass177_2012.method2931(anInt10539,
								 (byte) 1);
	    int i_16_ = class186.aByte2074 & 0xff;
	    if (i_16_ != 0 && class186.aByte2067 != 4) {
		int i_17_;
		if (i_15_ < 0)
		    i_17_ = 0;
		else if (i_15_ > 127)
		    i_17_ = 16777215;
		else
		    i_17_ = 131586 * i_15_;
		if (i_16_ == 256)
		    i_14_ = i_17_;
		else {
		    int i_18_ = i_16_;
		    int i_19_ = 256 - i_16_;
		    i_14_ = ((((i_17_ & 0xff00ff) * i_18_
			       + (i_14_ & 0xff00ff) * i_19_)
			      & ~0xff00ff)
			     + (((i_17_ & 0xff00) * i_18_
				 + (i_14_ & 0xff00) * i_19_)
				& 0xff0000)) >> 8;
		}
	    }
	    int i_20_ = class186.aByte2059 & 0xff;
	    if (i_20_ != 0) {
		i_20_ += 256;
		int i_21_ = ((i_14_ & 0xff0000) >> 16) * i_20_;
		if (i_21_ > 65535)
		    i_21_ = 65535;
		int i_22_ = ((i_14_ & 0xff00) >> 8) * i_20_;
		if (i_22_ > 65535)
		    i_22_ = 65535;
		int i_23_ = (i_14_ & 0xff) * i_20_;
		if (i_23_ > 65535)
		    i_23_ = 65535;
		i_14_ = (i_21_ << 8 & 0xff0000) + (i_22_ & 0xff00) + (i_23_
								      >> 8);
	    }
	}
	if (f != 1.0F) {
	    int i_24_ = i_14_ >> 16 & 0xff;
	    int i_25_ = i_14_ >> 8 & 0xff;
	    int i_26_ = i_14_ & 0xff;
	    i_24_ *= f;
	    if (i_24_ < 0)
		i_24_ = 0;
	    else if (i_24_ > 255)
		i_24_ = 255;
	    i_25_ *= f;
	    if (i_25_ < 0)
		i_25_ = 0;
	    else if (i_25_ > 255)
		i_25_ = 255;
	    i_26_ *= f;
	    if (i_26_ < 0)
		i_26_ = 0;
	    else if (i_26_ > 255)
		i_26_ = 255;
	    i_14_ = i_24_ << 16 | i_25_ << 8 | i_26_;
	}
	aStream10546.method1802(i * 4);
	aStream10546.method1803((byte) (i_14_ >> 16));
	aStream10546.method1803((byte) (i_14_ >> 8));
	aStream10546.method1803((byte) i_14_);
    }
    
    void method16251(int[] is, int i) {
	int i_27_ = 0;
	Class534_Sub40_Sub2 class534_sub40_sub2
	    = aClass185_Sub3_10541.aClass534_Sub40_Sub2_9716;
	class534_sub40_sub2.anInt10811 = 0;
	if (aClass185_Sub3_10541.aBool9566) {
	    for (int i_28_ = 0; i_28_ < i; i_28_++) {
		int i_29_ = is[i_28_];
		short[] is_30_
		    = aClass151_Sub1_10545.aShortArrayArray9304[i_29_];
		int i_31_ = anIntArray10544[i_29_];
		if (i_31_ != 0 && is_30_ != null) {
		    int i_32_ = 0;
		    int i_33_ = 0;
		    while (i_33_ < is_30_.length) {
			if ((i_31_ & 1 << i_32_++) != 0) {
			    class534_sub40_sub2.method16507((is_30_[i_33_++]
							     & 0xffff),
							    666682794);
			    i_27_++;
			    class534_sub40_sub2.method16507((is_30_[i_33_++]
							     & 0xffff),
							    1254328036);
			    i_27_++;
			    class534_sub40_sub2.method16507((is_30_[i_33_++]
							     & 0xffff),
							    1860092608);
			    i_27_++;
			} else
			    i_33_ += 3;
		    }
		}
	    }
	} else {
	    for (int i_34_ = 0; i_34_ < i; i_34_++) {
		int i_35_ = is[i_34_];
		short[] is_36_
		    = aClass151_Sub1_10545.aShortArrayArray9304[i_35_];
		int i_37_ = anIntArray10544[i_35_];
		if (i_37_ != 0 && is_36_ != null) {
		    int i_38_ = 0;
		    int i_39_ = 0;
		    while (i_39_ < is_36_.length) {
			if ((i_37_ & 1 << i_38_++) != 0) {
			    class534_sub40_sub2.method16721((is_36_[i_39_++]
							     & 0xffff),
							    1203548667);
			    i_27_++;
			    class534_sub40_sub2.method16721((is_36_[i_39_++]
							     & 0xffff),
							    1203548667);
			    i_27_++;
			    class534_sub40_sub2.method16721((is_36_[i_39_++]
							     & 0xffff),
							    1203548667);
			    i_27_++;
			} else
			    i_39_ += 3;
		    }
		}
	    }
	}
	if (i_27_ > 0) {
	    aClass126_Sub2_10543.method101(5123,
					   class534_sub40_sub2.aByteArray10810,
					   (class534_sub40_sub2.anInt10811
					    * 31645619));
	    aClass185_Sub3_10541.method15221
		(aClass151_Sub1_10545.aClass129_9317,
		 aClass151_Sub1_10545.aClass129_9318, aClass129_10537,
		 aClass151_Sub1_10545.aClass129_9319);
	    aClass185_Sub3_10541.method15296(anInt10539,
					     (aClass151_Sub1_10545.anInt9301
					      & 0x7) != 0,
					     (aClass151_Sub1_10545.anInt9301
					      & 0x8) != 0);
	    if (aClass185_Sub3_10541.aBool9695)
		aClass185_Sub3_10541.method3364(2147483647, aClass166_10538);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glPushMatrix();
	    OpenGL.glScalef(1.0F / aFloat10540, 1.0F / aFloat10540, 1.0F);
	    OpenGL.glMatrixMode(5888);
	    aClass185_Sub3_10541.method15221
		(aClass151_Sub1_10545.aClass129_9317,
		 aClass151_Sub1_10545.aClass129_9318, aClass129_10537,
		 aClass151_Sub1_10545.aClass129_9319);
	    aClass185_Sub3_10541.method15222(aClass126_Sub2_10543, 4, 0,
					     i_27_);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glPopMatrix();
	    OpenGL.glMatrixMode(5888);
	}
    }
    
    void method16252(int i, int i_40_, int i_41_) {
	anIntArray10544[(i_40_ * (aClass151_Sub1_10545.anInt1701 * -1924295585)
			 + i)]
	    |= 1 << i_41_;
    }
    
    void method16253(int i, int i_42_, int i_43_) {
	anIntArray10544[(i_42_ * (aClass151_Sub1_10545.anInt1701 * -1924295585)
			 + i)]
	    |= 1 << i_43_;
    }
    
    void method16254(int i, int i_44_, int i_45_) {
	anIntArray10544[(i_44_ * (aClass151_Sub1_10545.anInt1701 * -1924295585)
			 + i)]
	    |= 1 << i_45_;
    }
    
    void method16255(int i, int i_46_, int i_47_, float f) {
	if (anInt10539 != -1) {
	    Class186 class186
		= aClass185_Sub3_10541.aClass177_2012.method2931(anInt10539,
								 (byte) 1);
	    int i_48_ = class186.aByte2074 & 0xff;
	    if (i_48_ != 0 && class186.aByte2067 != 4) {
		int i_49_;
		if (i_47_ < 0)
		    i_49_ = 0;
		else if (i_47_ > 127)
		    i_49_ = 16777215;
		else
		    i_49_ = 131586 * i_47_;
		if (i_48_ == 256)
		    i_46_ = i_49_;
		else {
		    int i_50_ = i_48_;
		    int i_51_ = 256 - i_48_;
		    i_46_ = ((((i_49_ & 0xff00ff) * i_50_
			       + (i_46_ & 0xff00ff) * i_51_)
			      & ~0xff00ff)
			     + (((i_49_ & 0xff00) * i_50_
				 + (i_46_ & 0xff00) * i_51_)
				& 0xff0000)) >> 8;
		}
	    }
	    int i_52_ = class186.aByte2059 & 0xff;
	    if (i_52_ != 0) {
		i_52_ += 256;
		int i_53_ = ((i_46_ & 0xff0000) >> 16) * i_52_;
		if (i_53_ > 65535)
		    i_53_ = 65535;
		int i_54_ = ((i_46_ & 0xff00) >> 8) * i_52_;
		if (i_54_ > 65535)
		    i_54_ = 65535;
		int i_55_ = (i_46_ & 0xff) * i_52_;
		if (i_55_ > 65535)
		    i_55_ = 65535;
		i_46_ = (i_53_ << 8 & 0xff0000) + (i_54_ & 0xff00) + (i_55_
								      >> 8);
	    }
	}
	if (f != 1.0F) {
	    int i_56_ = i_46_ >> 16 & 0xff;
	    int i_57_ = i_46_ >> 8 & 0xff;
	    int i_58_ = i_46_ & 0xff;
	    i_56_ *= f;
	    if (i_56_ < 0)
		i_56_ = 0;
	    else if (i_56_ > 255)
		i_56_ = 255;
	    i_57_ *= f;
	    if (i_57_ < 0)
		i_57_ = 0;
	    else if (i_57_ > 255)
		i_57_ = 255;
	    i_58_ *= f;
	    if (i_58_ < 0)
		i_58_ = 0;
	    else if (i_58_ > 255)
		i_58_ = 255;
	    i_46_ = i_56_ << 16 | i_57_ << 8 | i_58_;
	}
	aStream10546.method1802(i * 4);
	aStream10546.method1803((byte) (i_46_ >> 16));
	aStream10546.method1803((byte) (i_46_ >> 8));
	aStream10546.method1803((byte) i_46_);
    }
    
    void method16256(int i, int i_59_, int i_60_) {
	anIntArray10544[(i_59_ * (aClass151_Sub1_10545.anInt1701 * -1924295585)
			 + i)]
	    |= 1 << i_60_;
    }
    
    void method16257(int i, int i_61_, int i_62_, float f) {
	if (anInt10539 != -1) {
	    Class186 class186
		= aClass185_Sub3_10541.aClass177_2012.method2931(anInt10539,
								 (byte) 1);
	    int i_63_ = class186.aByte2074 & 0xff;
	    if (i_63_ != 0 && class186.aByte2067 != 4) {
		int i_64_;
		if (i_62_ < 0)
		    i_64_ = 0;
		else if (i_62_ > 127)
		    i_64_ = 16777215;
		else
		    i_64_ = 131586 * i_62_;
		if (i_63_ == 256)
		    i_61_ = i_64_;
		else {
		    int i_65_ = i_63_;
		    int i_66_ = 256 - i_63_;
		    i_61_ = ((((i_64_ & 0xff00ff) * i_65_
			       + (i_61_ & 0xff00ff) * i_66_)
			      & ~0xff00ff)
			     + (((i_64_ & 0xff00) * i_65_
				 + (i_61_ & 0xff00) * i_66_)
				& 0xff0000)) >> 8;
		}
	    }
	    int i_67_ = class186.aByte2059 & 0xff;
	    if (i_67_ != 0) {
		i_67_ += 256;
		int i_68_ = ((i_61_ & 0xff0000) >> 16) * i_67_;
		if (i_68_ > 65535)
		    i_68_ = 65535;
		int i_69_ = ((i_61_ & 0xff00) >> 8) * i_67_;
		if (i_69_ > 65535)
		    i_69_ = 65535;
		int i_70_ = (i_61_ & 0xff) * i_67_;
		if (i_70_ > 65535)
		    i_70_ = 65535;
		i_61_ = (i_68_ << 8 & 0xff0000) + (i_69_ & 0xff00) + (i_70_
								      >> 8);
	    }
	}
	if (f != 1.0F) {
	    int i_71_ = i_61_ >> 16 & 0xff;
	    int i_72_ = i_61_ >> 8 & 0xff;
	    int i_73_ = i_61_ & 0xff;
	    i_71_ *= f;
	    if (i_71_ < 0)
		i_71_ = 0;
	    else if (i_71_ > 255)
		i_71_ = 255;
	    i_72_ *= f;
	    if (i_72_ < 0)
		i_72_ = 0;
	    else if (i_72_ > 255)
		i_72_ = 255;
	    i_73_ *= f;
	    if (i_73_ < 0)
		i_73_ = 0;
	    else if (i_73_ > 255)
		i_73_ = 255;
	    i_61_ = i_71_ << 16 | i_72_ << 8 | i_73_;
	}
	aStream10546.method1802(i * 4);
	aStream10546.method1803((byte) (i_61_ >> 16));
	aStream10546.method1803((byte) (i_61_ >> 8));
	aStream10546.method1803((byte) i_61_);
    }
    
    void method16258(int i) {
	aStream10546.method1802(i * 4 + 3);
	aStream10546.method1803(-1);
    }
    
    void method16259(int[] is, int i) {
	int i_74_ = 0;
	Class534_Sub40_Sub2 class534_sub40_sub2
	    = aClass185_Sub3_10541.aClass534_Sub40_Sub2_9716;
	class534_sub40_sub2.anInt10811 = 0;
	if (aClass185_Sub3_10541.aBool9566) {
	    for (int i_75_ = 0; i_75_ < i; i_75_++) {
		int i_76_ = is[i_75_];
		short[] is_77_
		    = aClass151_Sub1_10545.aShortArrayArray9304[i_76_];
		int i_78_ = anIntArray10544[i_76_];
		if (i_78_ != 0 && is_77_ != null) {
		    int i_79_ = 0;
		    int i_80_ = 0;
		    while (i_80_ < is_77_.length) {
			if ((i_78_ & 1 << i_79_++) != 0) {
			    class534_sub40_sub2.method16507((is_77_[i_80_++]
							     & 0xffff),
							    524940641);
			    i_74_++;
			    class534_sub40_sub2.method16507((is_77_[i_80_++]
							     & 0xffff),
							    857892440);
			    i_74_++;
			    class534_sub40_sub2.method16507((is_77_[i_80_++]
							     & 0xffff),
							    1484632421);
			    i_74_++;
			} else
			    i_80_ += 3;
		    }
		}
	    }
	} else {
	    for (int i_81_ = 0; i_81_ < i; i_81_++) {
		int i_82_ = is[i_81_];
		short[] is_83_
		    = aClass151_Sub1_10545.aShortArrayArray9304[i_82_];
		int i_84_ = anIntArray10544[i_82_];
		if (i_84_ != 0 && is_83_ != null) {
		    int i_85_ = 0;
		    int i_86_ = 0;
		    while (i_86_ < is_83_.length) {
			if ((i_84_ & 1 << i_85_++) != 0) {
			    class534_sub40_sub2.method16721((is_83_[i_86_++]
							     & 0xffff),
							    1203548667);
			    i_74_++;
			    class534_sub40_sub2.method16721((is_83_[i_86_++]
							     & 0xffff),
							    1203548667);
			    i_74_++;
			    class534_sub40_sub2.method16721((is_83_[i_86_++]
							     & 0xffff),
							    1203548667);
			    i_74_++;
			} else
			    i_86_ += 3;
		    }
		}
	    }
	}
	if (i_74_ > 0) {
	    aClass126_Sub2_10543.method101(5123,
					   class534_sub40_sub2.aByteArray10810,
					   (class534_sub40_sub2.anInt10811
					    * 31645619));
	    aClass185_Sub3_10541.method15221
		(aClass151_Sub1_10545.aClass129_9317,
		 aClass151_Sub1_10545.aClass129_9318, aClass129_10537,
		 aClass151_Sub1_10545.aClass129_9319);
	    aClass185_Sub3_10541.method15296(anInt10539,
					     (aClass151_Sub1_10545.anInt9301
					      & 0x7) != 0,
					     (aClass151_Sub1_10545.anInt9301
					      & 0x8) != 0);
	    if (aClass185_Sub3_10541.aBool9695)
		aClass185_Sub3_10541.method3364(2147483647, aClass166_10538);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glPushMatrix();
	    OpenGL.glScalef(1.0F / aFloat10540, 1.0F / aFloat10540, 1.0F);
	    OpenGL.glMatrixMode(5888);
	    aClass185_Sub3_10541.method15221
		(aClass151_Sub1_10545.aClass129_9317,
		 aClass151_Sub1_10545.aClass129_9318, aClass129_10537,
		 aClass151_Sub1_10545.aClass129_9319);
	    aClass185_Sub3_10541.method15222(aClass126_Sub2_10543, 4, 0,
					     i_74_);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glPopMatrix();
	    OpenGL.glMatrixMode(5888);
	}
    }
    
    void method16260(int[] is, int i) {
	int i_87_ = 0;
	Class534_Sub40_Sub2 class534_sub40_sub2
	    = aClass185_Sub3_10541.aClass534_Sub40_Sub2_9716;
	class534_sub40_sub2.anInt10811 = 0;
	if (aClass185_Sub3_10541.aBool9566) {
	    for (int i_88_ = 0; i_88_ < i; i_88_++) {
		int i_89_ = is[i_88_];
		short[] is_90_
		    = aClass151_Sub1_10545.aShortArrayArray9304[i_89_];
		int i_91_ = anIntArray10544[i_89_];
		if (i_91_ != 0 && is_90_ != null) {
		    int i_92_ = 0;
		    int i_93_ = 0;
		    while (i_93_ < is_90_.length) {
			if ((i_91_ & 1 << i_92_++) != 0) {
			    class534_sub40_sub2.method16507((is_90_[i_93_++]
							     & 0xffff),
							    787148283);
			    i_87_++;
			    class534_sub40_sub2.method16507((is_90_[i_93_++]
							     & 0xffff),
							    514321004);
			    i_87_++;
			    class534_sub40_sub2.method16507((is_90_[i_93_++]
							     & 0xffff),
							    1863420642);
			    i_87_++;
			} else
			    i_93_ += 3;
		    }
		}
	    }
	} else {
	    for (int i_94_ = 0; i_94_ < i; i_94_++) {
		int i_95_ = is[i_94_];
		short[] is_96_
		    = aClass151_Sub1_10545.aShortArrayArray9304[i_95_];
		int i_97_ = anIntArray10544[i_95_];
		if (i_97_ != 0 && is_96_ != null) {
		    int i_98_ = 0;
		    int i_99_ = 0;
		    while (i_99_ < is_96_.length) {
			if ((i_97_ & 1 << i_98_++) != 0) {
			    class534_sub40_sub2.method16721((is_96_[i_99_++]
							     & 0xffff),
							    1203548667);
			    i_87_++;
			    class534_sub40_sub2.method16721((is_96_[i_99_++]
							     & 0xffff),
							    1203548667);
			    i_87_++;
			    class534_sub40_sub2.method16721((is_96_[i_99_++]
							     & 0xffff),
							    1203548667);
			    i_87_++;
			} else
			    i_99_ += 3;
		    }
		}
	    }
	}
	if (i_87_ > 0) {
	    aClass126_Sub2_10543.method101(5123,
					   class534_sub40_sub2.aByteArray10810,
					   (class534_sub40_sub2.anInt10811
					    * 31645619));
	    aClass185_Sub3_10541.method15221
		(aClass151_Sub1_10545.aClass129_9317,
		 aClass151_Sub1_10545.aClass129_9318, aClass129_10537,
		 aClass151_Sub1_10545.aClass129_9319);
	    aClass185_Sub3_10541.method15296(anInt10539,
					     (aClass151_Sub1_10545.anInt9301
					      & 0x7) != 0,
					     (aClass151_Sub1_10545.anInt9301
					      & 0x8) != 0);
	    if (aClass185_Sub3_10541.aBool9695)
		aClass185_Sub3_10541.method3364(2147483647, aClass166_10538);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glPushMatrix();
	    OpenGL.glScalef(1.0F / aFloat10540, 1.0F / aFloat10540, 1.0F);
	    OpenGL.glMatrixMode(5888);
	    aClass185_Sub3_10541.method15221
		(aClass151_Sub1_10545.aClass129_9317,
		 aClass151_Sub1_10545.aClass129_9318, aClass129_10537,
		 aClass151_Sub1_10545.aClass129_9319);
	    aClass185_Sub3_10541.method15222(aClass126_Sub2_10543, 4, 0,
					     i_87_);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glPopMatrix();
	    OpenGL.glMatrixMode(5888);
	}
    }
}
