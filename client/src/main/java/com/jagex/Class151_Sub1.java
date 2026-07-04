/* Class151_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public class Class151_Sub1 extends Class151
{
    float[][] aFloatArrayArray9295;
    static final int anInt9296 = 74;
    int anInt9297;
    Class129 aClass129_9298;
    int anInt9299;
    static final int anInt9300 = 1;
    int anInt9301;
    float[][] aFloatArrayArray9302;
    int anInt9303;
    short[][] aShortArrayArray9304;
    Class534_Sub22[][][] aClass534_Sub22ArrayArrayArray9305;
    int[][][] anIntArrayArrayArray9306;
    int anInt9307;
    int[][][] anIntArrayArrayArray9308;
    int[][][] anIntArrayArrayArray9309;
    int[][][] anIntArrayArrayArray9310;
    int[][][] anIntArrayArrayArray9311;
    byte[][] aByteArrayArray9312;
    Class144 aClass144_9313;
    Class700 aClass700_9314 = new Class700();
    Class534[] aClass534Array9315;
    Interface15 anInterface15_9316;
    Class129 aClass129_9317;
    Class129 aClass129_9318;
    Class129 aClass129_9319;
    int[][][] anIntArrayArrayArray9320;
    int anInt9321;
    int anInt9322;
    byte[][] aByteArrayArray9323;
    float[][] aFloatArrayArray9324;
    int anInt9325;
    Class185_Sub3 aClass185_Sub3_9326;
    Class9 aClass9_9327;
    static float[] aFloatArray9328 = new float[16];
    
    public void method2502(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			   int i_0_, int i_1_, int i_2_, boolean bool) {
	if (aClass144_9313 != null && class534_sub18_sub16 != null) {
	    int i_3_ = (i - (i_0_ * aClass185_Sub3_9326.anInt9652 >> 8)
			>> aClass185_Sub3_9326.anInt9574);
	    int i_4_ = (i_1_ - (i_0_ * aClass185_Sub3_9326.anInt9647 >> 8)
			>> aClass185_Sub3_9326.anInt9574);
	    aClass144_9313.method2427(class534_sub18_sub16, i_3_, i_4_);
	}
    }
    
    public Class534_Sub18_Sub16 method2526
	(int i, int i_5_, Class534_Sub18_Sub16 class534_sub18_sub16) {
	if ((aByteArrayArray9312[i][i_5_] & 0x1) == 0)
	    return null;
	int i_6_ = anInt1702 * 127780559 >> aClass185_Sub3_9326.anInt9574;
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1
	    = (Class534_Sub18_Sub16_Sub1) class534_sub18_sub16;
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1_7_;
	if (class534_sub18_sub16_sub1 != null
	    && class534_sub18_sub16_sub1.method18681(i_6_, i_6_)) {
	    class534_sub18_sub16_sub1_7_ = class534_sub18_sub16_sub1;
	    class534_sub18_sub16_sub1_7_.method18672();
	} else
	    class534_sub18_sub16_sub1_7_
		= new Class534_Sub18_Sub16_Sub1(aClass185_Sub3_9326, i_6_,
						i_6_);
	class534_sub18_sub16_sub1_7_.method18682(0, 0, i_6_, i_6_);
	method14975(class534_sub18_sub16_sub1_7_, i, i_5_);
	return class534_sub18_sub16_sub1_7_;
    }
    
    Class151_Sub1(Class185_Sub3 class185_sub3, int i, int i_8_, int i_9_,
		  int i_10_, int[][] is, int[][] is_11_, int i_12_) {
	super(i_9_, i_10_, i_12_, is);
	aClass185_Sub3_9326 = class185_sub3;
	anInt9303 = anInt1703 * -1495101509 - 2;
	anInt9325 = 1 << anInt9303;
	anInt9297 = i;
	anInt9301 = i_8_;
	anIntArrayArrayArray9310 = new int[i_9_][i_10_][];
	aClass534_Sub22ArrayArrayArray9305 = new Class534_Sub22[i_9_][i_10_][];
	anIntArrayArrayArray9308 = new int[i_9_][i_10_][];
	anIntArrayArrayArray9309 = new int[i_9_][i_10_][];
	anIntArrayArrayArray9306 = new int[i_9_][i_10_][];
	anIntArrayArrayArray9320 = new int[i_9_][i_10_][];
	aShortArrayArray9304 = new short[i_9_ * i_10_][];
	aByteArrayArray9312 = new byte[i_9_][i_10_];
	aByteArrayArray9323 = new byte[i_9_ + 1][i_10_ + 1];
	aFloatArrayArray9324 = (new float[anInt1701 * -1924295585 + 1]
				[anInt1700 * -1466328823 + 1]);
	aFloatArrayArray9295 = (new float[anInt1701 * -1924295585 + 1]
				[anInt1700 * -1466328823 + 1]);
	aFloatArrayArray9302 = (new float[anInt1701 * -1924295585 + 1]
				[anInt1700 * -1466328823 + 1]);
	for (int i_13_ = 1; i_13_ < anInt1700 * -1466328823; i_13_++) {
	    for (int i_14_ = 1; i_14_ < anInt1701 * -1924295585; i_14_++) {
		int i_15_
		    = is_11_[i_14_ + 1][i_13_] - is_11_[i_14_ - 1][i_13_];
		int i_16_
		    = is_11_[i_14_][i_13_ + 1] - is_11_[i_14_][i_13_ - 1];
		float f
		    = (float) (1.0 / Math.sqrt((double) (i_15_ * i_15_
							 + 4 * i_12_ * i_12_
							 + i_16_ * i_16_)));
		aFloatArrayArray9324[i_14_][i_13_] = (float) i_15_ * f;
		aFloatArrayArray9295[i_14_][i_13_] = (float) (-i_12_ * 2) * f;
		aFloatArrayArray9302[i_14_][i_13_] = (float) i_16_ * f;
	    }
	}
	aClass9_9327 = new Class9(128);
	if ((anInt9301 & 0x10) != 0)
	    aClass144_9313 = new Class144(aClass185_Sub3_9326, this);
    }
    
    public void method2531(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			   int i_17_, int i_18_, int i_19_, boolean bool) {
	if (aClass144_9313 != null && class534_sub18_sub16 != null) {
	    int i_20_ = (i - (i_17_ * aClass185_Sub3_9326.anInt9652 >> 8)
			 >> aClass185_Sub3_9326.anInt9574);
	    int i_21_ = (i_18_ - (i_17_ * aClass185_Sub3_9326.anInt9647 >> 8)
			 >> aClass185_Sub3_9326.anInt9574);
	    aClass144_9313.method2428(class534_sub18_sub16, i_20_, i_21_);
	}
    }
    
    public Class534_Sub18_Sub16 method2520
	(int i, int i_22_, Class534_Sub18_Sub16 class534_sub18_sub16) {
	if ((aByteArrayArray9312[i][i_22_] & 0x1) == 0)
	    return null;
	int i_23_ = anInt1702 * 127780559 >> aClass185_Sub3_9326.anInt9574;
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1
	    = (Class534_Sub18_Sub16_Sub1) class534_sub18_sub16;
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1_24_;
	if (class534_sub18_sub16_sub1 != null
	    && class534_sub18_sub16_sub1.method18681(i_23_, i_23_)) {
	    class534_sub18_sub16_sub1_24_ = class534_sub18_sub16_sub1;
	    class534_sub18_sub16_sub1_24_.method18672();
	} else
	    class534_sub18_sub16_sub1_24_
		= new Class534_Sub18_Sub16_Sub1(aClass185_Sub3_9326, i_23_,
						i_23_);
	class534_sub18_sub16_sub1_24_.method18682(0, 0, i_23_, i_23_);
	method14975(class534_sub18_sub16_sub1_24_, i, i_22_);
	return class534_sub18_sub16_sub1_24_;
    }
    
    public void method2506(int i, int i_25_, int i_26_, boolean[][] bools,
			   boolean bool, int i_27_) {
	method14978(i, i_25_, i_26_, bools, bool, i_27_);
    }
    
    public void method2518(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			   int i_28_, int i_29_, int i_30_, boolean bool) {
	if (aClass144_9313 != null && class534_sub18_sub16 != null) {
	    int i_31_ = (i - (i_28_ * aClass185_Sub3_9326.anInt9652 >> 8)
			 >> aClass185_Sub3_9326.anInt9574);
	    int i_32_ = (i_29_ - (i_28_ * aClass185_Sub3_9326.anInt9647 >> 8)
			 >> aClass185_Sub3_9326.anInt9574);
	    aClass144_9313.method2427(class534_sub18_sub16, i_31_, i_32_);
	}
    }
    
    public void method2527(int i, int i_33_, int i_34_, int i_35_, int i_36_,
			   int i_37_, int i_38_, boolean[][] bools) {
	Class175 class175 = aClass185_Sub3_9326.method3253(-1526657880);
	if (anInt9321 > 0 && class175 != null) {
	    aClass185_Sub3_9326.method15203();
	    aClass185_Sub3_9326.method15344(false);
	    aClass185_Sub3_9326.method15432(false);
	    aClass185_Sub3_9326.method15242(false);
	    aClass185_Sub3_9326.method15193(false);
	    aClass185_Sub3_9326.method15246(0);
	    aClass185_Sub3_9326.method15227(-2);
	    aClass185_Sub3_9326.method15231(null);
	    aFloatArray9328[0]
		= (float) i_34_ / (128.0F * (float) (anInt1702 * 127780559)
				   * (float) class175.method2910());
	    aFloatArray9328[1] = 0.0F;
	    aFloatArray9328[2] = 0.0F;
	    aFloatArray9328[3] = 0.0F;
	    aFloatArray9328[4] = 0.0F;
	    aFloatArray9328[5]
		= (float) i_34_ / (128.0F * (float) (anInt1702 * 127780559)
				   * (float) class175.method2911());
	    aFloatArray9328[6] = 0.0F;
	    aFloatArray9328[7] = 0.0F;
	    aFloatArray9328[8] = 0.0F;
	    aFloatArray9328[9] = 0.0F;
	    aFloatArray9328[10] = 0.0F;
	    aFloatArray9328[11] = 0.0F;
	    aFloatArray9328[12]
		= -1.0F - (((float) (i_35_ * i_34_) / 128.0F - (float) (i * 2))
			   / (float) class175.method2910());
	    aFloatArray9328[13] = 1.0F - (((float) (2 * i_33_)
					   + (float) (i_38_ * i_34_) / 128.0F)
					  / (float) class175.method2911());
	    aFloatArray9328[14] = 0.0F;
	    aFloatArray9328[15] = 1.0F;
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glLoadMatrixf(aFloatArray9328, 0);
	    aFloatArray9328[0] = 1.0F;
	    aFloatArray9328[1] = 0.0F;
	    aFloatArray9328[2] = 0.0F;
	    aFloatArray9328[3] = 0.0F;
	    aFloatArray9328[4] = 0.0F;
	    aFloatArray9328[5] = 0.0F;
	    aFloatArray9328[6] = 1.0F;
	    aFloatArray9328[7] = 0.0F;
	    aFloatArray9328[8] = 0.0F;
	    aFloatArray9328[9] = 1.0F;
	    aFloatArray9328[10] = 0.0F;
	    aFloatArray9328[11] = 0.0F;
	    aFloatArray9328[12] = 0.0F;
	    aFloatArray9328[13] = 0.0F;
	    aFloatArray9328[14] = 0.0F;
	    aFloatArray9328[15] = 1.0F;
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glLoadMatrixf(aFloatArray9328, 0);
	    if ((anInt9301 & 0x7) != 0) {
		aClass185_Sub3_9326.method15432(true);
		aClass185_Sub3_9326.method15184();
	    } else
		aClass185_Sub3_9326.method15432(false);
	    aClass185_Sub3_9326.method15221(aClass129_9317, aClass129_9318,
					    aClass129_9298, aClass129_9319);
	    if ((aClass185_Sub3_9326.aClass534_Sub40_Sub2_9716
		 .aByteArray10810).length
		< anInt9307 * 2)
		aClass185_Sub3_9326.aClass534_Sub40_Sub2_9716
		    = new Class534_Sub40_Sub2(anInt9307 * 2);
	    else
		aClass185_Sub3_9326.aClass534_Sub40_Sub2_9716.anInt10811 = 0;
	    int i_39_ = 0;
	    Class534_Sub40_Sub2 class534_sub40_sub2
		= aClass185_Sub3_9326.aClass534_Sub40_Sub2_9716;
	    if (aClass185_Sub3_9326.aBool9566) {
		for (int i_40_ = i_36_; i_40_ < i_38_; i_40_++) {
		    int i_41_ = i_40_ * (anInt1701 * -1924295585) + i_35_;
		    for (int i_42_ = i_35_; i_42_ < i_37_; i_42_++) {
			if (bools[i_42_ - i_35_][i_40_ - i_36_]) {
			    short[] is = aShortArrayArray9304[i_41_];
			    if (is != null) {
				for (int i_43_ = 0; i_43_ < is.length;
				     i_43_++) {
				    class534_sub40_sub2.method16507
					(is[i_43_] & 0xffff, 1916480878);
				    i_39_++;
				}
			    }
			}
			i_41_++;
		    }
		}
	    } else {
		for (int i_44_ = i_36_; i_44_ < i_38_; i_44_++) {
		    int i_45_ = i_44_ * (anInt1701 * -1924295585) + i_35_;
		    for (int i_46_ = i_35_; i_46_ < i_37_; i_46_++) {
			if (bools[i_46_ - i_35_][i_44_ - i_36_]) {
			    short[] is = aShortArrayArray9304[i_45_];
			    if (is != null) {
				for (int i_47_ = 0; i_47_ < is.length;
				     i_47_++) {
				    class534_sub40_sub2.method16721
					(is[i_47_] & 0xffff, 1203548667);
				    i_39_++;
				}
			    }
			}
			i_45_++;
		    }
		}
	    }
	    if (i_39_ > 0) {
		Class126_Sub2 class126_sub2
		    = new Class126_Sub2(aClass185_Sub3_9326, 5123,
					class534_sub40_sub2.aByteArray10810,
					(class534_sub40_sub2.anInt10811
					 * 31645619));
		aClass185_Sub3_9326.method15222(class126_sub2, 4, 0, i_39_);
	    }
	}
    }
    
    public void method2515(int i, int i_48_, int i_49_, boolean[][] bools,
			   boolean bool, int i_50_) {
	method14978(i, i_48_, i_49_, bools, bool, i_50_);
    }
    
    void method14975(Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1,
		     int i, int i_51_) {
	int[] is = anIntArrayArrayArray9308[i][i_51_];
	int[] is_52_ = anIntArrayArrayArray9309[i][i_51_];
	int i_53_ = is.length;
	if (aClass185_Sub3_9326.anIntArray9717.length < i_53_) {
	    aClass185_Sub3_9326.anIntArray9717 = new int[i_53_];
	    aClass185_Sub3_9326.anIntArray9718 = new int[i_53_];
	}
	int[] is_54_ = aClass185_Sub3_9326.anIntArray9717;
	int[] is_55_ = aClass185_Sub3_9326.anIntArray9718;
	for (int i_56_ = 0; i_56_ < i_53_; i_56_++) {
	    is_54_[i_56_] = is[i_56_] >> aClass185_Sub3_9326.anInt9574;
	    is_55_[i_56_] = is_52_[i_56_] >> aClass185_Sub3_9326.anInt9574;
	}
	int i_57_ = 0;
	while (i_57_ < i_53_) {
	    int i_58_ = is_54_[i_57_];
	    int i_59_ = is_55_[i_57_++];
	    int i_60_ = is_54_[i_57_];
	    int i_61_ = is_55_[i_57_++];
	    int i_62_ = is_54_[i_57_];
	    int i_63_ = is_55_[i_57_++];
	    if ((i_58_ - i_60_) * (i_61_ - i_63_) - (i_61_ - i_59_) * (i_62_
								       - i_60_)
		> 0)
		class534_sub18_sub16_sub1.method18675(i_59_, i_61_, i_63_,
						      i_58_, i_60_, i_62_);
	}
    }
    
    public boolean method2497(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			      int i_64_, int i_65_, int i_66_, boolean bool) {
	if (aClass144_9313 == null || class534_sub18_sub16 == null)
	    return false;
	int i_67_ = (i - (i_64_ * aClass185_Sub3_9326.anInt9652 >> 8)
		     >> aClass185_Sub3_9326.anInt9574);
	int i_68_ = (i_65_ - (i_64_ * aClass185_Sub3_9326.anInt9647 >> 8)
		     >> aClass185_Sub3_9326.anInt9574);
	return aClass144_9313.method2429(class534_sub18_sub16, i_67_, i_68_);
    }
    
    public Class534_Sub18_Sub16 method2522
	(int i, int i_69_, Class534_Sub18_Sub16 class534_sub18_sub16) {
	if ((aByteArrayArray9312[i][i_69_] & 0x1) == 0)
	    return null;
	int i_70_ = anInt1702 * 127780559 >> aClass185_Sub3_9326.anInt9574;
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1
	    = (Class534_Sub18_Sub16_Sub1) class534_sub18_sub16;
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1_71_;
	if (class534_sub18_sub16_sub1 != null
	    && class534_sub18_sub16_sub1.method18681(i_70_, i_70_)) {
	    class534_sub18_sub16_sub1_71_ = class534_sub18_sub16_sub1;
	    class534_sub18_sub16_sub1_71_.method18672();
	} else
	    class534_sub18_sub16_sub1_71_
		= new Class534_Sub18_Sub16_Sub1(aClass185_Sub3_9326, i_70_,
						i_70_);
	class534_sub18_sub16_sub1_71_.method18682(0, 0, i_70_, i_70_);
	method14975(class534_sub18_sub16_sub1_71_, i, i_69_);
	return class534_sub18_sub16_sub1_71_;
    }
    
    public void method2503(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			   int i_72_, int i_73_, int i_74_, boolean bool) {
	if (aClass144_9313 != null && class534_sub18_sub16 != null) {
	    int i_75_ = (i - (i_72_ * aClass185_Sub3_9326.anInt9652 >> 8)
			 >> aClass185_Sub3_9326.anInt9574);
	    int i_76_ = (i_73_ - (i_72_ * aClass185_Sub3_9326.anInt9647 >> 8)
			 >> aClass185_Sub3_9326.anInt9574);
	    aClass144_9313.method2428(class534_sub18_sub16, i_75_, i_76_);
	}
    }
    
    public void method2530(Class534_Sub21 class534_sub21, int[] is) {
	aClass700_9314.method14131(new Class534_Sub3(aClass185_Sub3_9326, this,
						     class534_sub21, is),
				   (short) 789);
    }
    
    public void method2492(int i, int i_77_, int i_78_) {
	i = Math.min(aByteArrayArray9323.length - 1, Math.max(0, i));
	i_77_
	    = Math.min(aByteArrayArray9323[i].length - 1, Math.max(0, i_77_));
	if ((aByteArrayArray9323[i][i_77_] & 0xff) < i_78_)
	    aByteArrayArray9323[i][i_77_] = (byte) i_78_;
    }
    
    public void method2511(int i, int i_79_, int i_80_) {
	i = Math.min(aByteArrayArray9323.length - 1, Math.max(0, i));
	i_79_
	    = Math.min(aByteArrayArray9323[i].length - 1, Math.max(0, i_79_));
	if ((aByteArrayArray9323[i][i_79_] & 0xff) < i_80_)
	    aByteArrayArray9323[i][i_79_] = (byte) i_80_;
    }
    
    public void method2507(int i, int i_81_, int i_82_) {
	i = Math.min(aByteArrayArray9323.length - 1, Math.max(0, i));
	i_81_
	    = Math.min(aByteArrayArray9323[i].length - 1, Math.max(0, i_81_));
	if ((aByteArrayArray9323[i][i_81_] & 0xff) < i_82_)
	    aByteArrayArray9323[i][i_81_] = (byte) i_82_;
    }
    
    public void method2508(int i, int i_83_, int i_84_) {
	i = Math.min(aByteArrayArray9323.length - 1, Math.max(0, i));
	i_83_
	    = Math.min(aByteArrayArray9323[i].length - 1, Math.max(0, i_83_));
	if ((aByteArrayArray9323[i][i_83_] & 0xff) < i_84_)
	    aByteArrayArray9323[i][i_83_] = (byte) i_84_;
    }
    
    public void method2509(int i, int i_85_, int i_86_) {
	i = Math.min(aByteArrayArray9323.length - 1, Math.max(0, i));
	i_85_
	    = Math.min(aByteArrayArray9323[i].length - 1, Math.max(0, i_85_));
	if ((aByteArrayArray9323[i][i_85_] & 0xff) < i_86_)
	    aByteArrayArray9323[i][i_85_] = (byte) i_86_;
    }
    
    public void method2494
	(int i, int i_87_, int[] is, int[] is_88_, int[] is_89_, int[] is_90_,
	 int[] is_91_, int[] is_92_, int[] is_93_, int[] is_94_, int[] is_95_,
	 int[] is_96_, int[] is_97_, Class166 class166, boolean bool) {
	int i_98_ = is_94_.length;
	int[] is_99_ = new int[i_98_ * 3];
	int[] is_100_ = new int[i_98_ * 3];
	int[] is_101_ = new int[i_98_ * 3];
	int[] is_102_ = is_95_ != null ? new int[i_98_ * 3] : null;
	int[] is_103_ = new int[i_98_ * 3];
	int[] is_104_ = new int[i_98_ * 3];
	int[] is_105_ = is_88_ != null ? new int[i_98_ * 3] : null;
	int[] is_106_ = is_90_ != null ? new int[i_98_ * 3] : null;
	int i_107_ = 0;
	for (int i_108_ = 0; i_108_ < i_98_; i_108_++) {
	    int i_109_ = is_91_[i_108_];
	    int i_110_ = is_92_[i_108_];
	    int i_111_ = is_93_[i_108_];
	    is_99_[i_107_] = is[i_109_];
	    is_100_[i_107_] = is_89_[i_109_];
	    is_101_[i_107_] = is_94_[i_108_];
	    is_103_[i_107_] = is_96_[i_108_];
	    is_104_[i_107_] = is_97_[i_108_];
	    if (is_95_ != null)
		is_102_[i_107_] = is_95_[i_108_];
	    if (is_88_ != null)
		is_105_[i_107_] = is_88_[i_109_];
	    if (is_90_ != null)
		is_106_[i_107_] = is_90_[i_109_];
	    i_107_++;
	    is_99_[i_107_] = is[i_110_];
	    is_100_[i_107_] = is_89_[i_110_];
	    is_101_[i_107_] = is_94_[i_108_];
	    is_103_[i_107_] = is_96_[i_108_];
	    is_104_[i_107_] = is_97_[i_108_];
	    if (is_95_ != null)
		is_102_[i_107_] = is_95_[i_108_];
	    if (is_88_ != null)
		is_105_[i_107_] = is_88_[i_110_];
	    if (is_90_ != null)
		is_106_[i_107_] = is_90_[i_110_];
	    i_107_++;
	    is_99_[i_107_] = is[i_111_];
	    is_100_[i_107_] = is_89_[i_111_];
	    is_101_[i_107_] = is_94_[i_108_];
	    is_103_[i_107_] = is_96_[i_108_];
	    is_104_[i_107_] = is_97_[i_108_];
	    if (is_95_ != null)
		is_102_[i_107_] = is_95_[i_108_];
	    if (is_88_ != null)
		is_105_[i_107_] = is_88_[i_111_];
	    if (is_90_ != null)
		is_106_[i_107_] = is_90_[i_111_];
	    i_107_++;
	}
	method2493(i, i_87_, is_99_, is_105_, is_100_, is_106_, is_101_,
		   is_102_, is_103_, is_104_, class166, bool);
    }
    
    public void method2523(int i, int i_112_, int[] is, int[] is_113_,
			   int[] is_114_, int[] is_115_, int[] is_116_,
			   int[] is_117_, int[] is_118_, int[] is_119_,
			   Class166 class166, boolean bool) {
	Class177 class177 = aClass185_Sub3_9326.aClass177_2012;
	if (is_115_ != null && anIntArrayArrayArray9311 == null)
	    anIntArrayArrayArray9311
		= new int[anInt1701 * -1924295585][anInt1700 * -1466328823][];
	if (is_113_ != null && anIntArrayArrayArray9310 == null)
	    anIntArrayArrayArray9310
		= new int[anInt1701 * -1924295585][anInt1700 * -1466328823][];
	anIntArrayArrayArray9308[i][i_112_] = is;
	anIntArrayArrayArray9309[i][i_112_] = is_114_;
	anIntArrayArrayArray9306[i][i_112_] = is_116_;
	anIntArrayArrayArray9320[i][i_112_] = is_117_;
	if (anIntArrayArrayArray9311 != null)
	    anIntArrayArrayArray9311[i][i_112_] = is_115_;
	if (anIntArrayArrayArray9310 != null)
	    anIntArrayArrayArray9310[i][i_112_] = is_113_;
	Class534_Sub22[] class534_sub22s
	    = (aClass534_Sub22ArrayArrayArray9305[i][i_112_]
	       = new Class534_Sub22[is_116_.length]);
	for (int i_120_ = 0; i_120_ < is_116_.length; i_120_++) {
	    int i_121_ = is_118_[i_120_];
	    int i_122_ = is_119_[i_120_];
	    if ((anInt9301 & 0x20) != 0 && i_121_ != -1
		&& class177.method2931(i_121_, (byte) 1).aBool2072) {
		i_122_ = 128;
		i_121_ = -1;
	    }
	    long l = ((long) (class166.anInt1764 * 1446227271) << 48
		      | (long) (class166.anInt1762 * -1095140607) << 42
		      | (long) (class166.anInt1763 * 2113275141) << 28
		      | (long) (i_122_ << 14) | (long) i_121_);
	    Class534 class534;
	    for (class534 = aClass9_9327.method579(l); class534 != null;
		 class534 = aClass9_9327.method582(1418036341)) {
		Class534_Sub22 class534_sub22 = (Class534_Sub22) class534;
		if (class534_sub22.anInt10539 == i_121_
		    && class534_sub22.aFloat10540 == (float) i_122_
		    && class534_sub22.aClass166_10538.method2745(class166,
								 (byte) -24))
		    break;
	    }
	    if (class534 == null) {
		class534_sub22s[i_120_]
		    = new Class534_Sub22(this, i_121_, i_122_, class166);
		aClass9_9327.method581(class534_sub22s[i_120_], l);
	    } else
		class534_sub22s[i_120_] = (Class534_Sub22) class534;
	}
	if (bool)
	    aByteArrayArray9312[i][i_112_] |= 0x1;
	if (is_116_.length > anInt9322)
	    anInt9322 = is_116_.length;
	anInt9321 += is_116_.length;
    }
    
    public void method2512() {
	if (anInt9321 > 0) {
	    byte[][] is = (new byte[anInt1701 * -1924295585 + 1]
			   [anInt1700 * -1466328823 + 1]);
	    for (int i = 1; i < anInt1701 * -1924295585; i++) {
		for (int i_123_ = 1; i_123_ < anInt1700 * -1466328823;
		     i_123_++)
		    is[i][i_123_]
			= (byte) ((aByteArrayArray9323[i - 1][i_123_] >> 2)
				  + (aByteArrayArray9323[i + 1][i_123_] >> 3)
				  + (aByteArrayArray9323[i][i_123_ - 1] >> 2)
				  + (aByteArrayArray9323[i][i_123_ + 1] >> 3)
				  + (aByteArrayArray9323[i][i_123_] >> 1));
	    }
	    aClass534Array9315
		= new Class534[aClass9_9327.method600(-586475407)];
	    aClass9_9327.method580(aClass534Array9315, (byte) -43);
	    for (int i = 0; i < aClass534Array9315.length; i++)
		((Class534_Sub22) aClass534Array9315[i])
		    .method16244(anInt9321);
	    int i = 24;
	    if (anIntArrayArrayArray9311 != null)
		i += 4;
	    if ((anInt9301 & 0x7) != 0)
		i += 12;
	    NativeHeapBuffer nativeheapbuffer
		= aClass185_Sub3_9326.aNativeHeap9639.method1975(anInt9321 * i,
								 false);
	    Stream stream = new Stream(nativeheapbuffer);
	    Class534_Sub22[] class534_sub22s = new Class534_Sub22[anInt9321];
	    int i_124_ = Class455.method7422(anInt9321 / 4, 374272954);
	    if (i_124_ < 1)
		i_124_ = 1;
	    Class9 class9 = new Class9(i_124_);
	    Class534_Sub22[] class534_sub22s_125_
		= new Class534_Sub22[anInt9322];
	    for (int i_126_ = 0; i_126_ < anInt1701 * -1924295585; i_126_++) {
		for (int i_127_ = 0; i_127_ < anInt1700 * -1466328823;
		     i_127_++) {
		    if (anIntArrayArrayArray9306[i_126_][i_127_] != null) {
			Class534_Sub22[] class534_sub22s_128_
			    = (aClass534_Sub22ArrayArrayArray9305[i_126_]
			       [i_127_]);
			int[] is_129_
			    = anIntArrayArrayArray9308[i_126_][i_127_];
			int[] is_130_
			    = anIntArrayArrayArray9309[i_126_][i_127_];
			int[] is_131_
			    = anIntArrayArrayArray9320[i_126_][i_127_];
			int[] is_132_
			    = anIntArrayArrayArray9306[i_126_][i_127_];
			int[] is_133_
			    = (anIntArrayArrayArray9310 != null
			       ? anIntArrayArrayArray9310[i_126_][i_127_]
			       : null);
			int[] is_134_
			    = (anIntArrayArrayArray9311 != null
			       ? anIntArrayArrayArray9311[i_126_][i_127_]
			       : null);
			if (is_131_ == null)
			    is_131_ = is_132_;
			float f = aFloatArrayArray9324[i_126_][i_127_];
			float f_135_ = aFloatArrayArray9295[i_126_][i_127_];
			float f_136_ = aFloatArrayArray9302[i_126_][i_127_];
			float f_137_
			    = aFloatArrayArray9324[i_126_][i_127_ + 1];
			float f_138_
			    = aFloatArrayArray9295[i_126_][i_127_ + 1];
			float f_139_
			    = aFloatArrayArray9302[i_126_][i_127_ + 1];
			float f_140_
			    = aFloatArrayArray9324[i_126_ + 1][i_127_ + 1];
			float f_141_
			    = aFloatArrayArray9295[i_126_ + 1][i_127_ + 1];
			float f_142_
			    = aFloatArrayArray9302[i_126_ + 1][i_127_ + 1];
			float f_143_
			    = aFloatArrayArray9324[i_126_ + 1][i_127_];
			float f_144_
			    = aFloatArrayArray9295[i_126_ + 1][i_127_];
			float f_145_
			    = aFloatArrayArray9302[i_126_ + 1][i_127_];
			int i_146_ = is[i_126_][i_127_] & 0xff;
			int i_147_ = is[i_126_][i_127_ + 1] & 0xff;
			int i_148_ = is[i_126_ + 1][i_127_ + 1] & 0xff;
			int i_149_ = is[i_126_ + 1][i_127_] & 0xff;
			int i_150_ = 0;
		    while_28_:
			for (int i_151_ = 0; i_151_ < is_132_.length;
			     i_151_++) {
			    Class534_Sub22 class534_sub22
				= class534_sub22s_128_[i_151_];
			    for (int i_152_ = 0; i_152_ < i_150_; i_152_++) {
				if (class534_sub22s_125_[i_152_]
				    == class534_sub22)
				    continue while_28_;
			    }
			    class534_sub22s_125_[i_150_++] = class534_sub22;
			}
			short[] is_153_
			    = (aShortArrayArray9304[(i_127_ * (anInt1701
							       * -1924295585)
						     + i_126_)]
			       = new short[is_132_.length]);
			for (int i_154_ = 0; i_154_ < is_132_.length;
			     i_154_++) {
			    int i_155_ = ((i_126_ << anInt1703 * -1495101509)
					  + is_129_[i_154_]);
			    int i_156_ = ((i_127_ << anInt1703 * -1495101509)
					  + is_130_[i_154_]);
			    int i_157_ = i_155_ >> anInt9303;
			    int i_158_ = i_156_ >> anInt9303;
			    int i_159_ = is_132_[i_154_];
			    int i_160_ = is_131_[i_154_];
			    int i_161_ = is_133_ != null ? is_133_[i_154_] : 0;
			    long l = ((long) i_160_ << 48 | (long) i_159_ << 32
				      | (long) (i_157_ << 16) | (long) i_158_);
			    int i_162_ = is_129_[i_154_];
			    int i_163_ = is_130_[i_154_];
			    int i_164_ = 74;
			    int i_165_ = 0;
			    float f_166_ = 1.0F;
			    float f_167_;
			    float f_168_;
			    float f_169_;
			    if (i_162_ == 0 && i_163_ == 0) {
				f_167_ = f;
				f_168_ = f_135_;
				f_169_ = f_136_;
				i_164_ -= i_146_;
			    } else if (i_162_ == 0
				       && i_163_ == anInt1702 * 127780559) {
				f_167_ = f_137_;
				f_168_ = f_138_;
				f_169_ = f_139_;
				i_164_ -= i_147_;
			    } else if (i_162_ == anInt1702 * 127780559
				       && i_163_ == anInt1702 * 127780559) {
				f_167_ = f_140_;
				f_168_ = f_141_;
				f_169_ = f_142_;
				i_164_ -= i_148_;
			    } else if (i_162_ == anInt1702 * 127780559
				       && i_163_ == 0) {
				f_167_ = f_143_;
				f_168_ = f_144_;
				f_169_ = f_145_;
				i_164_ -= i_149_;
			    } else {
				float f_170_
				    = ((float) i_162_
				       / (float) (anInt1702 * 127780559));
				float f_171_
				    = ((float) i_163_
				       / (float) (anInt1702 * 127780559));
				float f_172_ = f + (f_143_ - f) * f_170_;
				float f_173_
				    = f_135_ + (f_144_ - f_135_) * f_170_;
				float f_174_
				    = f_136_ + (f_145_ - f_136_) * f_170_;
				float f_175_
				    = f_137_ + (f_140_ - f_137_) * f_170_;
				float f_176_
				    = f_138_ + (f_141_ - f_138_) * f_170_;
				float f_177_
				    = f_139_ + (f_142_ - f_139_) * f_170_;
				f_167_ = f_172_ + (f_175_ - f_172_) * f_171_;
				f_168_ = f_173_ + (f_176_ - f_173_) * f_171_;
				f_169_ = f_174_ + (f_177_ - f_174_) * f_171_;
				int i_178_
				    = i_146_ + ((i_149_ - i_146_) * i_162_
						>> anInt1703 * -1495101509);
				int i_179_
				    = i_147_ + ((i_148_ - i_147_) * i_162_
						>> anInt1703 * -1495101509);
				i_164_
				    -= i_178_ + ((i_179_ - i_178_) * i_163_
						 >> anInt1703 * -1495101509);
			    }
			    if (i_159_ != -1) {
				int i_180_ = (i_159_ & 0x7f) * i_164_ >> 7;
				if (i_180_ < 2)
				    i_180_ = 2;
				else if (i_180_ > 126)
				    i_180_ = 126;
				i_165_ = (Class661.anIntArray8549
					  [i_159_ & 0xff80 | i_180_]);
				if ((anInt9301 & 0x7) == 0) {
				    f_166_
					= ((aClass185_Sub3_9326.aFloatArray9640
					    [0]) * f_167_
					   + (aClass185_Sub3_9326
					      .aFloatArray9640[1]) * f_168_
					   + (aClass185_Sub3_9326
					      .aFloatArray9640[2]) * f_169_);
				    f_166_
					= (aClass185_Sub3_9326.aFloat9646
					   + f_166_ * (f_166_ > 0.0F
						       ? (aClass185_Sub3_9326
							  .aFloat9686)
						       : (aClass185_Sub3_9326
							  .aFloat9587)));
				}
			    }
			    Class534 class534 = null;
			    if ((i_155_ & anInt9325 - 1) == 0
				&& (i_156_ & anInt9325 - 1) == 0)
				class534 = class9.method579(l);
			    int i_181_;
			    if (class534 == null) {
				int i_182_;
				if (i_160_ != i_159_) {
				    int i_183_ = (i_160_ & 0x7f) * i_164_ >> 7;
				    if (i_183_ < 2)
					i_183_ = 2;
				    else if (i_183_ > 126)
					i_183_ = 126;
				    i_182_ = (Class661.anIntArray8549
					      [i_160_ & 0xff80 | i_183_]);
				    if ((anInt9301 & 0x7) == 0) {
					float f_184_
					    = ((aClass185_Sub3_9326
						.aFloatArray9640[0]) * f_167_
					       + (aClass185_Sub3_9326
						  .aFloatArray9640[1]) * f_168_
					       + ((aClass185_Sub3_9326
						   .aFloatArray9640[2])
						  * f_169_));
					f_184_
					    = (aClass185_Sub3_9326.aFloat9646
					       + (f_166_
						  * (f_166_ > 0.0F
						     ? (aClass185_Sub3_9326
							.aFloat9686)
						     : (aClass185_Sub3_9326
							.aFloat9587))));
					int i_185_ = i_182_ >> 16 & 0xff;
					int i_186_ = i_182_ >> 8 & 0xff;
					int i_187_ = i_182_ & 0xff;
					i_185_ *= f_184_;
					if (i_185_ < 0)
					    i_185_ = 0;
					else if (i_185_ > 255)
					    i_185_ = 255;
					i_186_ *= f_184_;
					if (i_186_ < 0)
					    i_186_ = 0;
					else if (i_186_ > 255)
					    i_186_ = 255;
					i_187_ *= f_184_;
					if (i_187_ < 0)
					    i_187_ = 0;
					else if (i_187_ > 255)
					    i_187_ = 255;
					i_182_ = (i_185_ << 16 | i_186_ << 8
						  | i_187_);
				    }
				} else
				    i_182_ = i_165_;
				if (aClass185_Sub3_9326.aBool9566) {
				    stream.method1804((float) i_155_);
				    stream.method1804
					((float) (method2498(i_155_, i_156_,
							     -1480272740)
						  + i_161_));
				    stream.method1804((float) i_156_);
				    stream.method1803((byte) (i_182_ >> 16));
				    stream.method1803((byte) (i_182_ >> 8));
				    stream.method1803((byte) i_182_);
				    stream.method1803(-1);
				    stream.method1804((float) i_155_);
				    stream.method1804((float) i_156_);
				    if (anIntArrayArrayArray9311 != null)
					stream.method1804(is_134_ != null
							  ? (float) ((is_134_
								      [i_154_])
								     - 1)
							  : 0.0F);
				    if ((anInt9301 & 0x7) != 0) {
					stream.method1804(f_167_);
					stream.method1804(f_168_);
					stream.method1804(f_169_);
				    }
				} else {
				    stream.method1805((float) i_155_);
				    stream.method1805
					((float) (method2498(i_155_, i_156_,
							     -1090217028)
						  + i_161_));
				    stream.method1805((float) i_156_);
				    stream.method1803((byte) (i_182_ >> 16));
				    stream.method1803((byte) (i_182_ >> 8));
				    stream.method1803((byte) i_182_);
				    stream.method1803(-1);
				    stream.method1805((float) i_155_);
				    stream.method1805((float) i_156_);
				    if (anIntArrayArrayArray9311 != null)
					stream.method1805(is_134_ != null
							  ? (float) ((is_134_
								      [i_154_])
								     - 1)
							  : 0.0F);
				    if ((anInt9301 & 0x7) != 0) {
					stream.method1805(f_167_);
					stream.method1805(f_168_);
					stream.method1805(f_169_);
				    }
				}
				i_181_ = anInt9299++;
				is_153_[i_154_] = (short) i_181_;
				if (i_159_ != -1)
				    class534_sub22s[i_181_]
					= class534_sub22s_128_[i_154_];
				class9.method581(new Class534_Sub15(is_153_
								    [i_154_]),
						 l);
			    } else {
				is_153_[i_154_]
				    = ((Class534_Sub15) class534).aShort10466;
				i_181_ = is_153_[i_154_] & 0xffff;
				if (i_159_ != -1
				    && ((class534_sub22s_128_[i_154_].aLong7158
					 * 8258869577519436579L)
					< (class534_sub22s[i_181_].aLong7158
					   * 8258869577519436579L)))
				    class534_sub22s[i_181_]
					= class534_sub22s_128_[i_154_];
			    }
			    for (int i_188_ = 0; i_188_ < i_150_; i_188_++)
				class534_sub22s_125_[i_188_].method16241
				    (i_181_, i_165_, i_164_, f_166_);
			    anInt9307++;
			}
		    }
		}
	    }
	    for (int i_189_ = 0; i_189_ < anInt9299; i_189_++) {
		Class534_Sub22 class534_sub22 = class534_sub22s[i_189_];
		if (class534_sub22 != null)
		    class534_sub22.method16246(i_189_);
	    }
	    for (int i_190_ = 0; i_190_ < anInt1701 * -1924295585; i_190_++) {
		for (int i_191_ = 0; i_191_ < anInt1700 * -1466328823;
		     i_191_++) {
		    short[] is_192_
			= (aShortArrayArray9304
			   [i_191_ * (anInt1701 * -1924295585) + i_190_]);
		    if (is_192_ != null) {
			int i_193_ = 0;
			int i_194_ = 0;
			while (i_194_ < is_192_.length) {
			    int i_195_ = is_192_[i_194_++] & 0xffff;
			    int i_196_ = is_192_[i_194_++] & 0xffff;
			    int i_197_ = is_192_[i_194_++] & 0xffff;
			    Class534_Sub22 class534_sub22
				= class534_sub22s[i_195_];
			    Class534_Sub22 class534_sub22_198_
				= class534_sub22s[i_196_];
			    Class534_Sub22 class534_sub22_199_
				= class534_sub22s[i_197_];
			    Class534_Sub22 class534_sub22_200_ = null;
			    if (class534_sub22 != null) {
				class534_sub22.method16256(i_190_, i_191_,
							   i_193_);
				class534_sub22_200_ = class534_sub22;
			    }
			    if (class534_sub22_198_ != null) {
				class534_sub22_198_.method16256(i_190_, i_191_,
								i_193_);
				if (class534_sub22_200_ == null
				    || ((class534_sub22_198_.aLong7158
					 * 8258869577519436579L)
					< (class534_sub22_200_.aLong7158
					   * 8258869577519436579L)))
				    class534_sub22_200_ = class534_sub22_198_;
			    }
			    if (class534_sub22_199_ != null) {
				class534_sub22_199_.method16256(i_190_, i_191_,
								i_193_);
				if (class534_sub22_200_ == null
				    || ((class534_sub22_199_.aLong7158
					 * 8258869577519436579L)
					< (class534_sub22_200_.aLong7158
					   * 8258869577519436579L)))
				    class534_sub22_200_ = class534_sub22_199_;
			    }
			    if (class534_sub22_200_ != null) {
				if (class534_sub22 != null)
				    class534_sub22_200_.method16246(i_195_);
				if (class534_sub22_198_ != null)
				    class534_sub22_200_.method16246(i_196_);
				if (class534_sub22_199_ != null)
				    class534_sub22_200_.method16246(i_197_);
				class534_sub22_200_.method16256(i_190_, i_191_,
								i_193_);
			    }
			    i_193_++;
			}
		    }
		}
	    }
	    stream.method1806();
	    anInterface15_9316
		= aClass185_Sub3_9326.method15219(i, nativeheapbuffer,
						  stream.method1801(), false);
	    if (anInterface15_9316 instanceof Class134_Sub1)
		nativeheapbuffer.method1781();
	    aClass129_9317 = new Class129(anInterface15_9316, 5126, 3, 0);
	    aClass129_9298 = new Class129(anInterface15_9316, 5121, 4, 12);
	    int i_201_;
	    if (anIntArrayArrayArray9311 != null) {
		aClass129_9319 = new Class129(anInterface15_9316, 5126, 3, 16);
		i_201_ = 28;
	    } else {
		aClass129_9319 = new Class129(anInterface15_9316, 5126, 2, 16);
		i_201_ = 24;
	    }
	    if ((anInt9301 & 0x7) != 0)
		aClass129_9318
		    = new Class129(anInterface15_9316, 5126, 3, i_201_);
	    long[] ls = new long[aClass534Array9315.length];
	    for (int i_202_ = 0; i_202_ < aClass534Array9315.length;
		 i_202_++) {
		Class534_Sub22 class534_sub22
		    = (Class534_Sub22) aClass534Array9315[i_202_];
		ls[i_202_] = class534_sub22.aLong7158 * 8258869577519436579L;
		class534_sub22.method16245(anInt9299);
	    }
	    Class411.method6716(ls, aClass534Array9315, 1407123817);
	    if (aClass144_9313 != null)
		aClass144_9313.method2430();
	} else
	    aClass144_9313 = null;
	if ((anInt9297 & 0x2) == 0) {
	    anIntArrayArrayArray9309 = null;
	    anIntArrayArrayArray9308 = null;
	    anIntArrayArrayArray9306 = null;
	}
	anIntArrayArrayArray9311 = null;
	anIntArrayArrayArray9320 = null;
	anIntArrayArrayArray9310 = null;
	aClass534_Sub22ArrayArrayArray9305 = null;
	aByteArrayArray9323 = null;
	aClass9_9327 = null;
	aFloatArrayArray9302 = null;
	aFloatArrayArray9295 = null;
	aFloatArrayArray9324 = null;
    }
    
    public void method2500(int i, int i_203_, int i_204_, boolean[][] bools,
			   boolean bool, int i_205_) {
	method14978(i, i_203_, i_204_, bools, bool, i_205_);
    }
    
    public void method2514(int i, int i_206_, int i_207_, boolean[][] bools,
			   boolean bool, int i_208_) {
	method14978(i, i_206_, i_207_, bools, bool, i_208_);
    }
    
    public void method2516(int i, int i_209_, int i_210_, boolean[][] bools,
			   boolean bool, int i_211_) {
	method14978(i, i_209_, i_210_, bools, bool, i_211_);
    }
    
    public void method2517(int i, int i_212_, int i_213_, boolean[][] bools,
			   boolean bool, int i_214_) {
	method14978(i, i_212_, i_213_, bools, bool, i_214_);
    }
    
    public boolean method2504(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			      int i_215_, int i_216_, int i_217_,
			      boolean bool) {
	if (aClass144_9313 == null || class534_sub18_sub16 == null)
	    return false;
	int i_218_ = (i - (i_215_ * aClass185_Sub3_9326.anInt9652 >> 8)
		      >> aClass185_Sub3_9326.anInt9574);
	int i_219_ = (i_216_ - (i_215_ * aClass185_Sub3_9326.anInt9647 >> 8)
		      >> aClass185_Sub3_9326.anInt9574);
	return aClass144_9313.method2429(class534_sub18_sub16, i_218_, i_219_);
    }
    
    public void method2519(int i, int i_220_, int i_221_, int i_222_,
			   int i_223_, int i_224_, int i_225_,
			   boolean[][] bools) {
	Class175 class175 = aClass185_Sub3_9326.method3253(-1758024225);
	if (anInt9321 > 0 && class175 != null) {
	    aClass185_Sub3_9326.method15203();
	    aClass185_Sub3_9326.method15344(false);
	    aClass185_Sub3_9326.method15432(false);
	    aClass185_Sub3_9326.method15242(false);
	    aClass185_Sub3_9326.method15193(false);
	    aClass185_Sub3_9326.method15246(0);
	    aClass185_Sub3_9326.method15227(-2);
	    aClass185_Sub3_9326.method15231(null);
	    aFloatArray9328[0]
		= (float) i_221_ / (128.0F * (float) (anInt1702 * 127780559)
				    * (float) class175.method2910());
	    aFloatArray9328[1] = 0.0F;
	    aFloatArray9328[2] = 0.0F;
	    aFloatArray9328[3] = 0.0F;
	    aFloatArray9328[4] = 0.0F;
	    aFloatArray9328[5]
		= (float) i_221_ / (128.0F * (float) (anInt1702 * 127780559)
				    * (float) class175.method2911());
	    aFloatArray9328[6] = 0.0F;
	    aFloatArray9328[7] = 0.0F;
	    aFloatArray9328[8] = 0.0F;
	    aFloatArray9328[9] = 0.0F;
	    aFloatArray9328[10] = 0.0F;
	    aFloatArray9328[11] = 0.0F;
	    aFloatArray9328[12]
		= -1.0F - ((float) (i_222_ * i_221_) / 128.0F
			   - (float) (i * 2)) / (float) class175.method2910();
	    aFloatArray9328[13]
		= 1.0F - (((float) (2 * i_220_)
			   + (float) (i_225_ * i_221_) / 128.0F)
			  / (float) class175.method2911());
	    aFloatArray9328[14] = 0.0F;
	    aFloatArray9328[15] = 1.0F;
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glLoadMatrixf(aFloatArray9328, 0);
	    aFloatArray9328[0] = 1.0F;
	    aFloatArray9328[1] = 0.0F;
	    aFloatArray9328[2] = 0.0F;
	    aFloatArray9328[3] = 0.0F;
	    aFloatArray9328[4] = 0.0F;
	    aFloatArray9328[5] = 0.0F;
	    aFloatArray9328[6] = 1.0F;
	    aFloatArray9328[7] = 0.0F;
	    aFloatArray9328[8] = 0.0F;
	    aFloatArray9328[9] = 1.0F;
	    aFloatArray9328[10] = 0.0F;
	    aFloatArray9328[11] = 0.0F;
	    aFloatArray9328[12] = 0.0F;
	    aFloatArray9328[13] = 0.0F;
	    aFloatArray9328[14] = 0.0F;
	    aFloatArray9328[15] = 1.0F;
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glLoadMatrixf(aFloatArray9328, 0);
	    if ((anInt9301 & 0x7) != 0) {
		aClass185_Sub3_9326.method15432(true);
		aClass185_Sub3_9326.method15184();
	    } else
		aClass185_Sub3_9326.method15432(false);
	    aClass185_Sub3_9326.method15221(aClass129_9317, aClass129_9318,
					    aClass129_9298, aClass129_9319);
	    if ((aClass185_Sub3_9326.aClass534_Sub40_Sub2_9716
		 .aByteArray10810).length
		< anInt9307 * 2)
		aClass185_Sub3_9326.aClass534_Sub40_Sub2_9716
		    = new Class534_Sub40_Sub2(anInt9307 * 2);
	    else
		aClass185_Sub3_9326.aClass534_Sub40_Sub2_9716.anInt10811 = 0;
	    int i_226_ = 0;
	    Class534_Sub40_Sub2 class534_sub40_sub2
		= aClass185_Sub3_9326.aClass534_Sub40_Sub2_9716;
	    if (aClass185_Sub3_9326.aBool9566) {
		for (int i_227_ = i_223_; i_227_ < i_225_; i_227_++) {
		    int i_228_ = i_227_ * (anInt1701 * -1924295585) + i_222_;
		    for (int i_229_ = i_222_; i_229_ < i_224_; i_229_++) {
			if (bools[i_229_ - i_222_][i_227_ - i_223_]) {
			    short[] is = aShortArrayArray9304[i_228_];
			    if (is != null) {
				for (int i_230_ = 0; i_230_ < is.length;
				     i_230_++) {
				    class534_sub40_sub2.method16507
					(is[i_230_] & 0xffff, 1318152499);
				    i_226_++;
				}
			    }
			}
			i_228_++;
		    }
		}
	    } else {
		for (int i_231_ = i_223_; i_231_ < i_225_; i_231_++) {
		    int i_232_ = i_231_ * (anInt1701 * -1924295585) + i_222_;
		    for (int i_233_ = i_222_; i_233_ < i_224_; i_233_++) {
			if (bools[i_233_ - i_222_][i_231_ - i_223_]) {
			    short[] is = aShortArrayArray9304[i_232_];
			    if (is != null) {
				for (int i_234_ = 0; i_234_ < is.length;
				     i_234_++) {
				    class534_sub40_sub2.method16721
					(is[i_234_] & 0xffff, 1203548667);
				    i_226_++;
				}
			    }
			}
			i_232_++;
		    }
		}
	    }
	    if (i_226_ > 0) {
		Class126_Sub2 class126_sub2
		    = new Class126_Sub2(aClass185_Sub3_9326, 5123,
					class534_sub40_sub2.aByteArray10810,
					(class534_sub40_sub2.anInt10811
					 * 31645619));
		aClass185_Sub3_9326.method15222(class126_sub2, 4, 0, i_226_);
	    }
	}
    }
    
    void method14976(int i, int i_235_, int i_236_, boolean[][] bools,
		     boolean bool, int i_237_) {
	if (aClass534Array9315 != null) {
	    int i_238_ = i_236_ + i_236_ + 1;
	    i_238_ *= i_238_;
	    if (aClass185_Sub3_9326.anIntArray9719.length < i_238_)
		aClass185_Sub3_9326.anIntArray9719 = new int[i_238_];
	    if ((aClass185_Sub3_9326.aClass534_Sub40_Sub2_9716
		 .aByteArray10810).length
		< anInt9307 * 2)
		aClass185_Sub3_9326.aClass534_Sub40_Sub2_9716
		    = new Class534_Sub40_Sub2(anInt9307 * 2);
	    int i_239_ = i - i_236_;
	    int i_240_ = i_239_;
	    if (i_239_ < 0)
		i_239_ = 0;
	    int i_241_ = i_235_ - i_236_;
	    int i_242_ = i_241_;
	    if (i_241_ < 0)
		i_241_ = 0;
	    int i_243_ = i + i_236_;
	    if (i_243_ > anInt1701 * -1924295585 - 1)
		i_243_ = anInt1701 * -1924295585 - 1;
	    int i_244_ = i_235_ + i_236_;
	    if (i_244_ > anInt1700 * -1466328823 - 1)
		i_244_ = anInt1700 * -1466328823 - 1;
	    int i_245_ = 0;
	    int[] is = aClass185_Sub3_9326.anIntArray9719;
	    for (int i_246_ = i_239_; i_246_ <= i_243_; i_246_++) {
		boolean[] bools_247_ = bools[i_246_ - i_240_];
		for (int i_248_ = i_241_; i_248_ <= i_244_; i_248_++) {
		    if (bools_247_[i_248_ - i_242_])
			is[i_245_++]
			    = i_248_ * (anInt1701 * -1924295585) + i_246_;
		}
	    }
	    aClass185_Sub3_9326.method15226();
	    aClass185_Sub3_9326.method15432((anInt9301 & 0x7) != 0);
	    for (int i_249_ = 0; i_249_ < aClass534Array9315.length - 0;
		 i_249_++)
		((Class534_Sub22) aClass534Array9315[i_249_])
		    .method16251(is, i_245_);
	    if (!aClass700_9314.method14142(-345032827)) {
		int i_250_ = aClass185_Sub3_9326.anInt9687;
		int i_251_ = aClass185_Sub3_9326.anInt9675;
		aClass185_Sub3_9326.method3463(0, i_251_,
					       aClass185_Sub3_9326.anInt9657);
		aClass185_Sub3_9326.method15432(false);
		aClass185_Sub3_9326.method15193(false);
		aClass185_Sub3_9326.method15246(128);
		aClass185_Sub3_9326.method15227(-2);
		aClass185_Sub3_9326
		    .method15231(aClass185_Sub3_9326.aClass141_Sub2_9528);
		aClass185_Sub3_9326.method15232(8448, 7681);
		aClass185_Sub3_9326.method15325(0, 34166, 770);
		aClass185_Sub3_9326.method15239(0, 34167, 770);
		for (Class534 class534 = aClass700_9314.method14135((byte) -1);
		     class534 != null;
		     class534 = aClass700_9314.method14139(1780039748)) {
		    Class534_Sub3 class534_sub3 = (Class534_Sub3) class534;
		    class534_sub3.method16021(i, i_235_, i_236_, bools);
		}
		aClass185_Sub3_9326.method15325(0, 5890, 768);
		aClass185_Sub3_9326.method15239(0, 5890, 770);
		aClass185_Sub3_9326.method15231(null);
		aClass185_Sub3_9326.method3463(i_250_, i_251_,
					       aClass185_Sub3_9326.anInt9657);
	    }
	    if (aClass144_9313 != null) {
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		aClass185_Sub3_9326.method15221(aClass129_9317, null, null,
						aClass129_9319);
		aClass144_9313.method2437(i, i_235_, i_236_, bools, bool);
		OpenGL.glPopMatrix();
	    }
	}
    }
    
    public Class534_Sub18_Sub16 method2528
	(int i, int i_252_, Class534_Sub18_Sub16 class534_sub18_sub16) {
	if ((aByteArrayArray9312[i][i_252_] & 0x1) == 0)
	    return null;
	int i_253_ = anInt1702 * 127780559 >> aClass185_Sub3_9326.anInt9574;
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1
	    = (Class534_Sub18_Sub16_Sub1) class534_sub18_sub16;
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1_254_;
	if (class534_sub18_sub16_sub1 != null
	    && class534_sub18_sub16_sub1.method18681(i_253_, i_253_)) {
	    class534_sub18_sub16_sub1_254_ = class534_sub18_sub16_sub1;
	    class534_sub18_sub16_sub1_254_.method18672();
	} else
	    class534_sub18_sub16_sub1_254_
		= new Class534_Sub18_Sub16_Sub1(aClass185_Sub3_9326, i_253_,
						i_253_);
	class534_sub18_sub16_sub1_254_.method18682(0, 0, i_253_, i_253_);
	method14975(class534_sub18_sub16_sub1_254_, i, i_252_);
	return class534_sub18_sub16_sub1_254_;
    }
    
    public void method2510(int i, int i_255_, int[] is, int[] is_256_,
			   int[] is_257_, int[] is_258_, int[] is_259_,
			   int[] is_260_, int[] is_261_, int[] is_262_,
			   int[] is_263_, int[] is_264_, int[] is_265_,
			   Class166 class166, boolean bool) {
	int i_266_ = is_262_.length;
	int[] is_267_ = new int[i_266_ * 3];
	int[] is_268_ = new int[i_266_ * 3];
	int[] is_269_ = new int[i_266_ * 3];
	int[] is_270_ = is_263_ != null ? new int[i_266_ * 3] : null;
	int[] is_271_ = new int[i_266_ * 3];
	int[] is_272_ = new int[i_266_ * 3];
	int[] is_273_ = is_256_ != null ? new int[i_266_ * 3] : null;
	int[] is_274_ = is_258_ != null ? new int[i_266_ * 3] : null;
	int i_275_ = 0;
	for (int i_276_ = 0; i_276_ < i_266_; i_276_++) {
	    int i_277_ = is_259_[i_276_];
	    int i_278_ = is_260_[i_276_];
	    int i_279_ = is_261_[i_276_];
	    is_267_[i_275_] = is[i_277_];
	    is_268_[i_275_] = is_257_[i_277_];
	    is_269_[i_275_] = is_262_[i_276_];
	    is_271_[i_275_] = is_264_[i_276_];
	    is_272_[i_275_] = is_265_[i_276_];
	    if (is_263_ != null)
		is_270_[i_275_] = is_263_[i_276_];
	    if (is_256_ != null)
		is_273_[i_275_] = is_256_[i_277_];
	    if (is_258_ != null)
		is_274_[i_275_] = is_258_[i_277_];
	    i_275_++;
	    is_267_[i_275_] = is[i_278_];
	    is_268_[i_275_] = is_257_[i_278_];
	    is_269_[i_275_] = is_262_[i_276_];
	    is_271_[i_275_] = is_264_[i_276_];
	    is_272_[i_275_] = is_265_[i_276_];
	    if (is_263_ != null)
		is_270_[i_275_] = is_263_[i_276_];
	    if (is_256_ != null)
		is_273_[i_275_] = is_256_[i_278_];
	    if (is_258_ != null)
		is_274_[i_275_] = is_258_[i_278_];
	    i_275_++;
	    is_267_[i_275_] = is[i_279_];
	    is_268_[i_275_] = is_257_[i_279_];
	    is_269_[i_275_] = is_262_[i_276_];
	    is_271_[i_275_] = is_264_[i_276_];
	    is_272_[i_275_] = is_265_[i_276_];
	    if (is_263_ != null)
		is_270_[i_275_] = is_263_[i_276_];
	    if (is_256_ != null)
		is_273_[i_275_] = is_256_[i_279_];
	    if (is_258_ != null)
		is_274_[i_275_] = is_258_[i_279_];
	    i_275_++;
	}
	method2493(i, i_255_, is_267_, is_273_, is_268_, is_274_, is_269_,
		   is_270_, is_271_, is_272_, class166, bool);
    }
    
    public Class534_Sub18_Sub16 method2501
	(int i, int i_280_, Class534_Sub18_Sub16 class534_sub18_sub16) {
	if ((aByteArrayArray9312[i][i_280_] & 0x1) == 0)
	    return null;
	int i_281_ = anInt1702 * 127780559 >> aClass185_Sub3_9326.anInt9574;
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1
	    = (Class534_Sub18_Sub16_Sub1) class534_sub18_sub16;
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1_282_;
	if (class534_sub18_sub16_sub1 != null
	    && class534_sub18_sub16_sub1.method18681(i_281_, i_281_)) {
	    class534_sub18_sub16_sub1_282_ = class534_sub18_sub16_sub1;
	    class534_sub18_sub16_sub1_282_.method18672();
	} else
	    class534_sub18_sub16_sub1_282_
		= new Class534_Sub18_Sub16_Sub1(aClass185_Sub3_9326, i_281_,
						i_281_);
	class534_sub18_sub16_sub1_282_.method18682(0, 0, i_281_, i_281_);
	method14975(class534_sub18_sub16_sub1_282_, i, i_280_);
	return class534_sub18_sub16_sub1_282_;
    }
    
    public Class534_Sub18_Sub16 method2524
	(int i, int i_283_, Class534_Sub18_Sub16 class534_sub18_sub16) {
	if ((aByteArrayArray9312[i][i_283_] & 0x1) == 0)
	    return null;
	int i_284_ = anInt1702 * 127780559 >> aClass185_Sub3_9326.anInt9574;
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1
	    = (Class534_Sub18_Sub16_Sub1) class534_sub18_sub16;
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1_285_;
	if (class534_sub18_sub16_sub1 != null
	    && class534_sub18_sub16_sub1.method18681(i_284_, i_284_)) {
	    class534_sub18_sub16_sub1_285_ = class534_sub18_sub16_sub1;
	    class534_sub18_sub16_sub1_285_.method18672();
	} else
	    class534_sub18_sub16_sub1_285_
		= new Class534_Sub18_Sub16_Sub1(aClass185_Sub3_9326, i_284_,
						i_284_);
	class534_sub18_sub16_sub1_285_.method18682(0, 0, i_284_, i_284_);
	method14975(class534_sub18_sub16_sub1_285_, i, i_283_);
	return class534_sub18_sub16_sub1_285_;
    }
    
    public Class534_Sub18_Sub16 method2525
	(int i, int i_286_, Class534_Sub18_Sub16 class534_sub18_sub16) {
	if ((aByteArrayArray9312[i][i_286_] & 0x1) == 0)
	    return null;
	int i_287_ = anInt1702 * 127780559 >> aClass185_Sub3_9326.anInt9574;
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1
	    = (Class534_Sub18_Sub16_Sub1) class534_sub18_sub16;
	Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1_288_;
	if (class534_sub18_sub16_sub1 != null
	    && class534_sub18_sub16_sub1.method18681(i_287_, i_287_)) {
	    class534_sub18_sub16_sub1_288_ = class534_sub18_sub16_sub1;
	    class534_sub18_sub16_sub1_288_.method18672();
	} else
	    class534_sub18_sub16_sub1_288_
		= new Class534_Sub18_Sub16_Sub1(aClass185_Sub3_9326, i_287_,
						i_287_);
	class534_sub18_sub16_sub1_288_.method18682(0, 0, i_287_, i_287_);
	method14975(class534_sub18_sub16_sub1_288_, i, i_286_);
	return class534_sub18_sub16_sub1_288_;
    }
    
    public void method2513(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			   int i_289_, int i_290_, int i_291_, boolean bool) {
	if (aClass144_9313 != null && class534_sub18_sub16 != null) {
	    int i_292_ = (i - (i_289_ * aClass185_Sub3_9326.anInt9652 >> 8)
			  >> aClass185_Sub3_9326.anInt9574);
	    int i_293_
		= (i_290_ - (i_289_ * aClass185_Sub3_9326.anInt9647 >> 8)
		   >> aClass185_Sub3_9326.anInt9574);
	    aClass144_9313.method2427(class534_sub18_sub16, i_292_, i_293_);
	}
    }
    
    public void method2533(int i, int i_294_, int i_295_, boolean[][] bools,
			   boolean bool, int i_296_) {
	method14978(i, i_294_, i_295_, bools, bool, i_296_);
    }
    
    public void method2505(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			   int i_297_, int i_298_, int i_299_, boolean bool) {
	if (aClass144_9313 != null && class534_sub18_sub16 != null) {
	    int i_300_ = (i - (i_297_ * aClass185_Sub3_9326.anInt9652 >> 8)
			  >> aClass185_Sub3_9326.anInt9574);
	    int i_301_
		= (i_298_ - (i_297_ * aClass185_Sub3_9326.anInt9647 >> 8)
		   >> aClass185_Sub3_9326.anInt9574);
	    aClass144_9313.method2427(class534_sub18_sub16, i_300_, i_301_);
	}
    }
    
    public void method2529(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			   int i_302_, int i_303_, int i_304_, boolean bool) {
	if (aClass144_9313 != null && class534_sub18_sub16 != null) {
	    int i_305_ = (i - (i_302_ * aClass185_Sub3_9326.anInt9652 >> 8)
			  >> aClass185_Sub3_9326.anInt9574);
	    int i_306_
		= (i_303_ - (i_302_ * aClass185_Sub3_9326.anInt9647 >> 8)
		   >> aClass185_Sub3_9326.anInt9574);
	    aClass144_9313.method2427(class534_sub18_sub16, i_305_, i_306_);
	}
    }
    
    public void method2532(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			   int i_307_, int i_308_, int i_309_, boolean bool) {
	if (aClass144_9313 != null && class534_sub18_sub16 != null) {
	    int i_310_ = (i - (i_307_ * aClass185_Sub3_9326.anInt9652 >> 8)
			  >> aClass185_Sub3_9326.anInt9574);
	    int i_311_
		= (i_308_ - (i_307_ * aClass185_Sub3_9326.anInt9647 >> 8)
		   >> aClass185_Sub3_9326.anInt9574);
	    aClass144_9313.method2428(class534_sub18_sub16, i_310_, i_311_);
	}
    }
    
    public void method2495() {
	if (anInt9321 > 0) {
	    byte[][] is = (new byte[anInt1701 * -1924295585 + 1]
			   [anInt1700 * -1466328823 + 1]);
	    for (int i = 1; i < anInt1701 * -1924295585; i++) {
		for (int i_312_ = 1; i_312_ < anInt1700 * -1466328823;
		     i_312_++)
		    is[i][i_312_]
			= (byte) ((aByteArrayArray9323[i - 1][i_312_] >> 2)
				  + (aByteArrayArray9323[i + 1][i_312_] >> 3)
				  + (aByteArrayArray9323[i][i_312_ - 1] >> 2)
				  + (aByteArrayArray9323[i][i_312_ + 1] >> 3)
				  + (aByteArrayArray9323[i][i_312_] >> 1));
	    }
	    aClass534Array9315
		= new Class534[aClass9_9327.method600(1285133531)];
	    aClass9_9327.method580(aClass534Array9315, (byte) 23);
	    for (int i = 0; i < aClass534Array9315.length; i++)
		((Class534_Sub22) aClass534Array9315[i])
		    .method16244(anInt9321);
	    int i = 24;
	    if (anIntArrayArrayArray9311 != null)
		i += 4;
	    if ((anInt9301 & 0x7) != 0)
		i += 12;
	    NativeHeapBuffer nativeheapbuffer
		= aClass185_Sub3_9326.aNativeHeap9639.method1975(anInt9321 * i,
								 false);
	    Stream stream = new Stream(nativeheapbuffer);
	    Class534_Sub22[] class534_sub22s = new Class534_Sub22[anInt9321];
	    int i_313_ = Class455.method7422(anInt9321 / 4, -875738259);
	    if (i_313_ < 1)
		i_313_ = 1;
	    Class9 class9 = new Class9(i_313_);
	    Class534_Sub22[] class534_sub22s_314_
		= new Class534_Sub22[anInt9322];
	    for (int i_315_ = 0; i_315_ < anInt1701 * -1924295585; i_315_++) {
		for (int i_316_ = 0; i_316_ < anInt1700 * -1466328823;
		     i_316_++) {
		    if (anIntArrayArrayArray9306[i_315_][i_316_] != null) {
			Class534_Sub22[] class534_sub22s_317_
			    = (aClass534_Sub22ArrayArrayArray9305[i_315_]
			       [i_316_]);
			int[] is_318_
			    = anIntArrayArrayArray9308[i_315_][i_316_];
			int[] is_319_
			    = anIntArrayArrayArray9309[i_315_][i_316_];
			int[] is_320_
			    = anIntArrayArrayArray9320[i_315_][i_316_];
			int[] is_321_
			    = anIntArrayArrayArray9306[i_315_][i_316_];
			int[] is_322_
			    = (anIntArrayArrayArray9310 != null
			       ? anIntArrayArrayArray9310[i_315_][i_316_]
			       : null);
			int[] is_323_
			    = (anIntArrayArrayArray9311 != null
			       ? anIntArrayArrayArray9311[i_315_][i_316_]
			       : null);
			if (is_320_ == null)
			    is_320_ = is_321_;
			float f = aFloatArrayArray9324[i_315_][i_316_];
			float f_324_ = aFloatArrayArray9295[i_315_][i_316_];
			float f_325_ = aFloatArrayArray9302[i_315_][i_316_];
			float f_326_
			    = aFloatArrayArray9324[i_315_][i_316_ + 1];
			float f_327_
			    = aFloatArrayArray9295[i_315_][i_316_ + 1];
			float f_328_
			    = aFloatArrayArray9302[i_315_][i_316_ + 1];
			float f_329_
			    = aFloatArrayArray9324[i_315_ + 1][i_316_ + 1];
			float f_330_
			    = aFloatArrayArray9295[i_315_ + 1][i_316_ + 1];
			float f_331_
			    = aFloatArrayArray9302[i_315_ + 1][i_316_ + 1];
			float f_332_
			    = aFloatArrayArray9324[i_315_ + 1][i_316_];
			float f_333_
			    = aFloatArrayArray9295[i_315_ + 1][i_316_];
			float f_334_
			    = aFloatArrayArray9302[i_315_ + 1][i_316_];
			int i_335_ = is[i_315_][i_316_] & 0xff;
			int i_336_ = is[i_315_][i_316_ + 1] & 0xff;
			int i_337_ = is[i_315_ + 1][i_316_ + 1] & 0xff;
			int i_338_ = is[i_315_ + 1][i_316_] & 0xff;
			int i_339_ = 0;
		    while_30_:
			for (int i_340_ = 0; i_340_ < is_321_.length;
			     i_340_++) {
			    Class534_Sub22 class534_sub22
				= class534_sub22s_317_[i_340_];
			    for (int i_341_ = 0; i_341_ < i_339_; i_341_++) {
				if (class534_sub22s_314_[i_341_]
				    == class534_sub22)
				    continue while_30_;
			    }
			    class534_sub22s_314_[i_339_++] = class534_sub22;
			}
			short[] is_342_
			    = (aShortArrayArray9304[(i_316_ * (anInt1701
							       * -1924295585)
						     + i_315_)]
			       = new short[is_321_.length]);
			for (int i_343_ = 0; i_343_ < is_321_.length;
			     i_343_++) {
			    int i_344_ = ((i_315_ << anInt1703 * -1495101509)
					  + is_318_[i_343_]);
			    int i_345_ = ((i_316_ << anInt1703 * -1495101509)
					  + is_319_[i_343_]);
			    int i_346_ = i_344_ >> anInt9303;
			    int i_347_ = i_345_ >> anInt9303;
			    int i_348_ = is_321_[i_343_];
			    int i_349_ = is_320_[i_343_];
			    int i_350_ = is_322_ != null ? is_322_[i_343_] : 0;
			    long l = ((long) i_349_ << 48 | (long) i_348_ << 32
				      | (long) (i_346_ << 16) | (long) i_347_);
			    int i_351_ = is_318_[i_343_];
			    int i_352_ = is_319_[i_343_];
			    int i_353_ = 74;
			    int i_354_ = 0;
			    float f_355_ = 1.0F;
			    float f_356_;
			    float f_357_;
			    float f_358_;
			    if (i_351_ == 0 && i_352_ == 0) {
				f_356_ = f;
				f_357_ = f_324_;
				f_358_ = f_325_;
				i_353_ -= i_335_;
			    } else if (i_351_ == 0
				       && i_352_ == anInt1702 * 127780559) {
				f_356_ = f_326_;
				f_357_ = f_327_;
				f_358_ = f_328_;
				i_353_ -= i_336_;
			    } else if (i_351_ == anInt1702 * 127780559
				       && i_352_ == anInt1702 * 127780559) {
				f_356_ = f_329_;
				f_357_ = f_330_;
				f_358_ = f_331_;
				i_353_ -= i_337_;
			    } else if (i_351_ == anInt1702 * 127780559
				       && i_352_ == 0) {
				f_356_ = f_332_;
				f_357_ = f_333_;
				f_358_ = f_334_;
				i_353_ -= i_338_;
			    } else {
				float f_359_
				    = ((float) i_351_
				       / (float) (anInt1702 * 127780559));
				float f_360_
				    = ((float) i_352_
				       / (float) (anInt1702 * 127780559));
				float f_361_ = f + (f_332_ - f) * f_359_;
				float f_362_
				    = f_324_ + (f_333_ - f_324_) * f_359_;
				float f_363_
				    = f_325_ + (f_334_ - f_325_) * f_359_;
				float f_364_
				    = f_326_ + (f_329_ - f_326_) * f_359_;
				float f_365_
				    = f_327_ + (f_330_ - f_327_) * f_359_;
				float f_366_
				    = f_328_ + (f_331_ - f_328_) * f_359_;
				f_356_ = f_361_ + (f_364_ - f_361_) * f_360_;
				f_357_ = f_362_ + (f_365_ - f_362_) * f_360_;
				f_358_ = f_363_ + (f_366_ - f_363_) * f_360_;
				int i_367_
				    = i_335_ + ((i_338_ - i_335_) * i_351_
						>> anInt1703 * -1495101509);
				int i_368_
				    = i_336_ + ((i_337_ - i_336_) * i_351_
						>> anInt1703 * -1495101509);
				i_353_
				    -= i_367_ + ((i_368_ - i_367_) * i_352_
						 >> anInt1703 * -1495101509);
			    }
			    if (i_348_ != -1) {
				int i_369_ = (i_348_ & 0x7f) * i_353_ >> 7;
				if (i_369_ < 2)
				    i_369_ = 2;
				else if (i_369_ > 126)
				    i_369_ = 126;
				i_354_ = (Class661.anIntArray8549
					  [i_348_ & 0xff80 | i_369_]);
				if ((anInt9301 & 0x7) == 0) {
				    f_355_
					= ((aClass185_Sub3_9326.aFloatArray9640
					    [0]) * f_356_
					   + (aClass185_Sub3_9326
					      .aFloatArray9640[1]) * f_357_
					   + (aClass185_Sub3_9326
					      .aFloatArray9640[2]) * f_358_);
				    f_355_
					= (aClass185_Sub3_9326.aFloat9646
					   + f_355_ * (f_355_ > 0.0F
						       ? (aClass185_Sub3_9326
							  .aFloat9686)
						       : (aClass185_Sub3_9326
							  .aFloat9587)));
				}
			    }
			    Class534 class534 = null;
			    if ((i_344_ & anInt9325 - 1) == 0
				&& (i_345_ & anInt9325 - 1) == 0)
				class534 = class9.method579(l);
			    int i_370_;
			    if (class534 == null) {
				int i_371_;
				if (i_349_ != i_348_) {
				    int i_372_ = (i_349_ & 0x7f) * i_353_ >> 7;
				    if (i_372_ < 2)
					i_372_ = 2;
				    else if (i_372_ > 126)
					i_372_ = 126;
				    i_371_ = (Class661.anIntArray8549
					      [i_349_ & 0xff80 | i_372_]);
				    if ((anInt9301 & 0x7) == 0) {
					float f_373_
					    = ((aClass185_Sub3_9326
						.aFloatArray9640[0]) * f_356_
					       + (aClass185_Sub3_9326
						  .aFloatArray9640[1]) * f_357_
					       + ((aClass185_Sub3_9326
						   .aFloatArray9640[2])
						  * f_358_));
					f_373_
					    = (aClass185_Sub3_9326.aFloat9646
					       + (f_355_
						  * (f_355_ > 0.0F
						     ? (aClass185_Sub3_9326
							.aFloat9686)
						     : (aClass185_Sub3_9326
							.aFloat9587))));
					int i_374_ = i_371_ >> 16 & 0xff;
					int i_375_ = i_371_ >> 8 & 0xff;
					int i_376_ = i_371_ & 0xff;
					i_374_ *= f_373_;
					if (i_374_ < 0)
					    i_374_ = 0;
					else if (i_374_ > 255)
					    i_374_ = 255;
					i_375_ *= f_373_;
					if (i_375_ < 0)
					    i_375_ = 0;
					else if (i_375_ > 255)
					    i_375_ = 255;
					i_376_ *= f_373_;
					if (i_376_ < 0)
					    i_376_ = 0;
					else if (i_376_ > 255)
					    i_376_ = 255;
					i_371_ = (i_374_ << 16 | i_375_ << 8
						  | i_376_);
				    }
				} else
				    i_371_ = i_354_;
				if (aClass185_Sub3_9326.aBool9566) {
				    stream.method1804((float) i_344_);
				    stream.method1804
					((float) (method2498(i_344_, i_345_,
							     -2112952705)
						  + i_350_));
				    stream.method1804((float) i_345_);
				    stream.method1803((byte) (i_371_ >> 16));
				    stream.method1803((byte) (i_371_ >> 8));
				    stream.method1803((byte) i_371_);
				    stream.method1803(-1);
				    stream.method1804((float) i_344_);
				    stream.method1804((float) i_345_);
				    if (anIntArrayArrayArray9311 != null)
					stream.method1804(is_323_ != null
							  ? (float) ((is_323_
								      [i_343_])
								     - 1)
							  : 0.0F);
				    if ((anInt9301 & 0x7) != 0) {
					stream.method1804(f_356_);
					stream.method1804(f_357_);
					stream.method1804(f_358_);
				    }
				} else {
				    stream.method1805((float) i_344_);
				    stream.method1805
					((float) (method2498(i_344_, i_345_,
							     -1653331503)
						  + i_350_));
				    stream.method1805((float) i_345_);
				    stream.method1803((byte) (i_371_ >> 16));
				    stream.method1803((byte) (i_371_ >> 8));
				    stream.method1803((byte) i_371_);
				    stream.method1803(-1);
				    stream.method1805((float) i_344_);
				    stream.method1805((float) i_345_);
				    if (anIntArrayArrayArray9311 != null)
					stream.method1805(is_323_ != null
							  ? (float) ((is_323_
								      [i_343_])
								     - 1)
							  : 0.0F);
				    if ((anInt9301 & 0x7) != 0) {
					stream.method1805(f_356_);
					stream.method1805(f_357_);
					stream.method1805(f_358_);
				    }
				}
				i_370_ = anInt9299++;
				is_342_[i_343_] = (short) i_370_;
				if (i_348_ != -1)
				    class534_sub22s[i_370_]
					= class534_sub22s_317_[i_343_];
				class9.method581(new Class534_Sub15(is_342_
								    [i_343_]),
						 l);
			    } else {
				is_342_[i_343_]
				    = ((Class534_Sub15) class534).aShort10466;
				i_370_ = is_342_[i_343_] & 0xffff;
				if (i_348_ != -1
				    && ((class534_sub22s_317_[i_343_].aLong7158
					 * 8258869577519436579L)
					< (class534_sub22s[i_370_].aLong7158
					   * 8258869577519436579L)))
				    class534_sub22s[i_370_]
					= class534_sub22s_317_[i_343_];
			    }
			    for (int i_377_ = 0; i_377_ < i_339_; i_377_++)
				class534_sub22s_314_[i_377_].method16241
				    (i_370_, i_354_, i_353_, f_355_);
			    anInt9307++;
			}
		    }
		}
	    }
	    for (int i_378_ = 0; i_378_ < anInt9299; i_378_++) {
		Class534_Sub22 class534_sub22 = class534_sub22s[i_378_];
		if (class534_sub22 != null)
		    class534_sub22.method16246(i_378_);
	    }
	    for (int i_379_ = 0; i_379_ < anInt1701 * -1924295585; i_379_++) {
		for (int i_380_ = 0; i_380_ < anInt1700 * -1466328823;
		     i_380_++) {
		    short[] is_381_
			= (aShortArrayArray9304
			   [i_380_ * (anInt1701 * -1924295585) + i_379_]);
		    if (is_381_ != null) {
			int i_382_ = 0;
			int i_383_ = 0;
			while (i_383_ < is_381_.length) {
			    int i_384_ = is_381_[i_383_++] & 0xffff;
			    int i_385_ = is_381_[i_383_++] & 0xffff;
			    int i_386_ = is_381_[i_383_++] & 0xffff;
			    Class534_Sub22 class534_sub22
				= class534_sub22s[i_384_];
			    Class534_Sub22 class534_sub22_387_
				= class534_sub22s[i_385_];
			    Class534_Sub22 class534_sub22_388_
				= class534_sub22s[i_386_];
			    Class534_Sub22 class534_sub22_389_ = null;
			    if (class534_sub22 != null) {
				class534_sub22.method16256(i_379_, i_380_,
							   i_382_);
				class534_sub22_389_ = class534_sub22;
			    }
			    if (class534_sub22_387_ != null) {
				class534_sub22_387_.method16256(i_379_, i_380_,
								i_382_);
				if (class534_sub22_389_ == null
				    || ((class534_sub22_387_.aLong7158
					 * 8258869577519436579L)
					< (class534_sub22_389_.aLong7158
					   * 8258869577519436579L)))
				    class534_sub22_389_ = class534_sub22_387_;
			    }
			    if (class534_sub22_388_ != null) {
				class534_sub22_388_.method16256(i_379_, i_380_,
								i_382_);
				if (class534_sub22_389_ == null
				    || ((class534_sub22_388_.aLong7158
					 * 8258869577519436579L)
					< (class534_sub22_389_.aLong7158
					   * 8258869577519436579L)))
				    class534_sub22_389_ = class534_sub22_388_;
			    }
			    if (class534_sub22_389_ != null) {
				if (class534_sub22 != null)
				    class534_sub22_389_.method16246(i_384_);
				if (class534_sub22_387_ != null)
				    class534_sub22_389_.method16246(i_385_);
				if (class534_sub22_388_ != null)
				    class534_sub22_389_.method16246(i_386_);
				class534_sub22_389_.method16256(i_379_, i_380_,
								i_382_);
			    }
			    i_382_++;
			}
		    }
		}
	    }
	    stream.method1806();
	    anInterface15_9316
		= aClass185_Sub3_9326.method15219(i, nativeheapbuffer,
						  stream.method1801(), false);
	    if (anInterface15_9316 instanceof Class134_Sub1)
		nativeheapbuffer.method1781();
	    aClass129_9317 = new Class129(anInterface15_9316, 5126, 3, 0);
	    aClass129_9298 = new Class129(anInterface15_9316, 5121, 4, 12);
	    int i_390_;
	    if (anIntArrayArrayArray9311 != null) {
		aClass129_9319 = new Class129(anInterface15_9316, 5126, 3, 16);
		i_390_ = 28;
	    } else {
		aClass129_9319 = new Class129(anInterface15_9316, 5126, 2, 16);
		i_390_ = 24;
	    }
	    if ((anInt9301 & 0x7) != 0)
		aClass129_9318
		    = new Class129(anInterface15_9316, 5126, 3, i_390_);
	    long[] ls = new long[aClass534Array9315.length];
	    for (int i_391_ = 0; i_391_ < aClass534Array9315.length;
		 i_391_++) {
		Class534_Sub22 class534_sub22
		    = (Class534_Sub22) aClass534Array9315[i_391_];
		ls[i_391_] = class534_sub22.aLong7158 * 8258869577519436579L;
		class534_sub22.method16245(anInt9299);
	    }
	    Class411.method6716(ls, aClass534Array9315, 1133858934);
	    if (aClass144_9313 != null)
		aClass144_9313.method2430();
	} else
	    aClass144_9313 = null;
	if ((anInt9297 & 0x2) == 0) {
	    anIntArrayArrayArray9309 = null;
	    anIntArrayArrayArray9308 = null;
	    anIntArrayArrayArray9306 = null;
	}
	anIntArrayArrayArray9311 = null;
	anIntArrayArrayArray9320 = null;
	anIntArrayArrayArray9310 = null;
	aClass534_Sub22ArrayArrayArray9305 = null;
	aByteArrayArray9323 = null;
	aClass9_9327 = null;
	aFloatArrayArray9302 = null;
	aFloatArrayArray9295 = null;
	aFloatArrayArray9324 = null;
    }
    
    public void method2493(int i, int i_392_, int[] is, int[] is_393_,
			   int[] is_394_, int[] is_395_, int[] is_396_,
			   int[] is_397_, int[] is_398_, int[] is_399_,
			   Class166 class166, boolean bool) {
	Class177 class177 = aClass185_Sub3_9326.aClass177_2012;
	if (is_395_ != null && anIntArrayArrayArray9311 == null)
	    anIntArrayArrayArray9311
		= new int[anInt1701 * -1924295585][anInt1700 * -1466328823][];
	if (is_393_ != null && anIntArrayArrayArray9310 == null)
	    anIntArrayArrayArray9310
		= new int[anInt1701 * -1924295585][anInt1700 * -1466328823][];
	anIntArrayArrayArray9308[i][i_392_] = is;
	anIntArrayArrayArray9309[i][i_392_] = is_394_;
	anIntArrayArrayArray9306[i][i_392_] = is_396_;
	anIntArrayArrayArray9320[i][i_392_] = is_397_;
	if (anIntArrayArrayArray9311 != null)
	    anIntArrayArrayArray9311[i][i_392_] = is_395_;
	if (anIntArrayArrayArray9310 != null)
	    anIntArrayArrayArray9310[i][i_392_] = is_393_;
	Class534_Sub22[] class534_sub22s
	    = (aClass534_Sub22ArrayArrayArray9305[i][i_392_]
	       = new Class534_Sub22[is_396_.length]);
	for (int i_400_ = 0; i_400_ < is_396_.length; i_400_++) {
	    int i_401_ = is_398_[i_400_];
	    int i_402_ = is_399_[i_400_];
	    if ((anInt9301 & 0x20) != 0 && i_401_ != -1
		&& class177.method2931(i_401_, (byte) 1).aBool2072) {
		i_402_ = 128;
		i_401_ = -1;
	    }
	    long l = ((long) (class166.anInt1764 * 1446227271) << 48
		      | (long) (class166.anInt1762 * -1095140607) << 42
		      | (long) (class166.anInt1763 * 2113275141) << 28
		      | (long) (i_402_ << 14) | (long) i_401_);
	    Class534 class534;
	    for (class534 = aClass9_9327.method579(l); class534 != null;
		 class534 = aClass9_9327.method582(1941588940)) {
		Class534_Sub22 class534_sub22 = (Class534_Sub22) class534;
		if (class534_sub22.anInt10539 == i_401_
		    && class534_sub22.aFloat10540 == (float) i_402_
		    && class534_sub22.aClass166_10538.method2745(class166,
								 (byte) -50))
		    break;
	    }
	    if (class534 == null) {
		class534_sub22s[i_400_]
		    = new Class534_Sub22(this, i_401_, i_402_, class166);
		aClass9_9327.method581(class534_sub22s[i_400_], l);
	    } else
		class534_sub22s[i_400_] = (Class534_Sub22) class534;
	}
	if (bool)
	    aByteArrayArray9312[i][i_392_] |= 0x1;
	if (is_396_.length > anInt9322)
	    anInt9322 = is_396_.length;
	anInt9321 += is_396_.length;
    }
    
    void method14977(int i, int i_403_, int i_404_, boolean[][] bools,
		     boolean bool, int i_405_) {
	if (aClass534Array9315 != null) {
	    int i_406_ = i_404_ + i_404_ + 1;
	    i_406_ *= i_406_;
	    if (aClass185_Sub3_9326.anIntArray9719.length < i_406_)
		aClass185_Sub3_9326.anIntArray9719 = new int[i_406_];
	    if ((aClass185_Sub3_9326.aClass534_Sub40_Sub2_9716
		 .aByteArray10810).length
		< anInt9307 * 2)
		aClass185_Sub3_9326.aClass534_Sub40_Sub2_9716
		    = new Class534_Sub40_Sub2(anInt9307 * 2);
	    int i_407_ = i - i_404_;
	    int i_408_ = i_407_;
	    if (i_407_ < 0)
		i_407_ = 0;
	    int i_409_ = i_403_ - i_404_;
	    int i_410_ = i_409_;
	    if (i_409_ < 0)
		i_409_ = 0;
	    int i_411_ = i + i_404_;
	    if (i_411_ > anInt1701 * -1924295585 - 1)
		i_411_ = anInt1701 * -1924295585 - 1;
	    int i_412_ = i_403_ + i_404_;
	    if (i_412_ > anInt1700 * -1466328823 - 1)
		i_412_ = anInt1700 * -1466328823 - 1;
	    int i_413_ = 0;
	    int[] is = aClass185_Sub3_9326.anIntArray9719;
	    for (int i_414_ = i_407_; i_414_ <= i_411_; i_414_++) {
		boolean[] bools_415_ = bools[i_414_ - i_408_];
		for (int i_416_ = i_409_; i_416_ <= i_412_; i_416_++) {
		    if (bools_415_[i_416_ - i_410_])
			is[i_413_++]
			    = i_416_ * (anInt1701 * -1924295585) + i_414_;
		}
	    }
	    aClass185_Sub3_9326.method15226();
	    aClass185_Sub3_9326.method15432((anInt9301 & 0x7) != 0);
	    for (int i_417_ = 0; i_417_ < aClass534Array9315.length - 0;
		 i_417_++)
		((Class534_Sub22) aClass534Array9315[i_417_])
		    .method16251(is, i_413_);
	    if (!aClass700_9314.method14142(-1094689268)) {
		int i_418_ = aClass185_Sub3_9326.anInt9687;
		int i_419_ = aClass185_Sub3_9326.anInt9675;
		aClass185_Sub3_9326.method3463(0, i_419_,
					       aClass185_Sub3_9326.anInt9657);
		aClass185_Sub3_9326.method15432(false);
		aClass185_Sub3_9326.method15193(false);
		aClass185_Sub3_9326.method15246(128);
		aClass185_Sub3_9326.method15227(-2);
		aClass185_Sub3_9326
		    .method15231(aClass185_Sub3_9326.aClass141_Sub2_9528);
		aClass185_Sub3_9326.method15232(8448, 7681);
		aClass185_Sub3_9326.method15325(0, 34166, 770);
		aClass185_Sub3_9326.method15239(0, 34167, 770);
		for (Class534 class534 = aClass700_9314.method14135((byte) -1);
		     class534 != null;
		     class534 = aClass700_9314.method14139(1557425313)) {
		    Class534_Sub3 class534_sub3 = (Class534_Sub3) class534;
		    class534_sub3.method16021(i, i_403_, i_404_, bools);
		}
		aClass185_Sub3_9326.method15325(0, 5890, 768);
		aClass185_Sub3_9326.method15239(0, 5890, 770);
		aClass185_Sub3_9326.method15231(null);
		aClass185_Sub3_9326.method3463(i_418_, i_419_,
					       aClass185_Sub3_9326.anInt9657);
	    }
	    if (aClass144_9313 != null) {
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		aClass185_Sub3_9326.method15221(aClass129_9317, null, null,
						aClass129_9319);
		aClass144_9313.method2437(i, i_403_, i_404_, bools, bool);
		OpenGL.glPopMatrix();
	    }
	}
    }
    
    void method14978(int i, int i_420_, int i_421_, boolean[][] bools,
		     boolean bool, int i_422_) {
	if (aClass534Array9315 != null) {
	    int i_423_ = i_421_ + i_421_ + 1;
	    i_423_ *= i_423_;
	    if (aClass185_Sub3_9326.anIntArray9719.length < i_423_)
		aClass185_Sub3_9326.anIntArray9719 = new int[i_423_];
	    if ((aClass185_Sub3_9326.aClass534_Sub40_Sub2_9716
		 .aByteArray10810).length
		< anInt9307 * 2)
		aClass185_Sub3_9326.aClass534_Sub40_Sub2_9716
		    = new Class534_Sub40_Sub2(anInt9307 * 2);
	    int i_424_ = i - i_421_;
	    int i_425_ = i_424_;
	    if (i_424_ < 0)
		i_424_ = 0;
	    int i_426_ = i_420_ - i_421_;
	    int i_427_ = i_426_;
	    if (i_426_ < 0)
		i_426_ = 0;
	    int i_428_ = i + i_421_;
	    if (i_428_ > anInt1701 * -1924295585 - 1)
		i_428_ = anInt1701 * -1924295585 - 1;
	    int i_429_ = i_420_ + i_421_;
	    if (i_429_ > anInt1700 * -1466328823 - 1)
		i_429_ = anInt1700 * -1466328823 - 1;
	    int i_430_ = 0;
	    int[] is = aClass185_Sub3_9326.anIntArray9719;
	    for (int i_431_ = i_424_; i_431_ <= i_428_; i_431_++) {
		boolean[] bools_432_ = bools[i_431_ - i_425_];
		for (int i_433_ = i_426_; i_433_ <= i_429_; i_433_++) {
		    if (bools_432_[i_433_ - i_427_])
			is[i_430_++]
			    = i_433_ * (anInt1701 * -1924295585) + i_431_;
		}
	    }
	    aClass185_Sub3_9326.method15226();
	    aClass185_Sub3_9326.method15432((anInt9301 & 0x7) != 0);
	    for (int i_434_ = 0; i_434_ < aClass534Array9315.length - 0;
		 i_434_++)
		((Class534_Sub22) aClass534Array9315[i_434_])
		    .method16251(is, i_430_);
	    if (!aClass700_9314.method14142(1684071776)) {
		int i_435_ = aClass185_Sub3_9326.anInt9687;
		int i_436_ = aClass185_Sub3_9326.anInt9675;
		aClass185_Sub3_9326.method3463(0, i_436_,
					       aClass185_Sub3_9326.anInt9657);
		aClass185_Sub3_9326.method15432(false);
		aClass185_Sub3_9326.method15193(false);
		aClass185_Sub3_9326.method15246(128);
		aClass185_Sub3_9326.method15227(-2);
		aClass185_Sub3_9326
		    .method15231(aClass185_Sub3_9326.aClass141_Sub2_9528);
		aClass185_Sub3_9326.method15232(8448, 7681);
		aClass185_Sub3_9326.method15325(0, 34166, 770);
		aClass185_Sub3_9326.method15239(0, 34167, 770);
		for (Class534 class534 = aClass700_9314.method14135((byte) -1);
		     class534 != null;
		     class534 = aClass700_9314.method14139(736409387)) {
		    Class534_Sub3 class534_sub3 = (Class534_Sub3) class534;
		    class534_sub3.method16021(i, i_420_, i_421_, bools);
		}
		aClass185_Sub3_9326.method15325(0, 5890, 768);
		aClass185_Sub3_9326.method15239(0, 5890, 770);
		aClass185_Sub3_9326.method15231(null);
		aClass185_Sub3_9326.method3463(i_435_, i_436_,
					       aClass185_Sub3_9326.anInt9657);
	    }
	    if (aClass144_9313 != null) {
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		aClass185_Sub3_9326.method15221(aClass129_9317, null, null,
						aClass129_9319);
		aClass144_9313.method2437(i, i_420_, i_421_, bools, bool);
		OpenGL.glPopMatrix();
	    }
	}
    }
    
    void method14979(Class534_Sub18_Sub16_Sub1 class534_sub18_sub16_sub1,
		     int i, int i_437_) {
	int[] is = anIntArrayArrayArray9308[i][i_437_];
	int[] is_438_ = anIntArrayArrayArray9309[i][i_437_];
	int i_439_ = is.length;
	if (aClass185_Sub3_9326.anIntArray9717.length < i_439_) {
	    aClass185_Sub3_9326.anIntArray9717 = new int[i_439_];
	    aClass185_Sub3_9326.anIntArray9718 = new int[i_439_];
	}
	int[] is_440_ = aClass185_Sub3_9326.anIntArray9717;
	int[] is_441_ = aClass185_Sub3_9326.anIntArray9718;
	for (int i_442_ = 0; i_442_ < i_439_; i_442_++) {
	    is_440_[i_442_] = is[i_442_] >> aClass185_Sub3_9326.anInt9574;
	    is_441_[i_442_] = is_438_[i_442_] >> aClass185_Sub3_9326.anInt9574;
	}
	int i_443_ = 0;
	while (i_443_ < i_439_) {
	    int i_444_ = is_440_[i_443_];
	    int i_445_ = is_441_[i_443_++];
	    int i_446_ = is_440_[i_443_];
	    int i_447_ = is_441_[i_443_++];
	    int i_448_ = is_440_[i_443_];
	    int i_449_ = is_441_[i_443_++];
	    if (((i_444_ - i_446_) * (i_447_ - i_449_)
		 - (i_447_ - i_445_) * (i_448_ - i_446_))
		> 0)
		class534_sub18_sub16_sub1.method18675(i_445_, i_447_, i_449_,
						      i_444_, i_446_, i_448_);
	}
    }
    
    public void method2496(Class534_Sub21 class534_sub21, int[] is) {
	aClass700_9314.method14131(new Class534_Sub3(aClass185_Sub3_9326, this,
						     class534_sub21, is),
				   (short) 789);
    }
}
