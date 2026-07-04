/* Class359 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;

public class Class359
{
    Class536_Sub2_Sub1[][] aClass536_Sub2_Sub1ArrayArray3695;
    int[] anIntArray3696;
    Class349 aClass349_3697;
    int anInt3698 = 768;
    int anInt3699 = 64;
    int[] anIntArray3700;
    int anInt3701 = 1600;
    int anInt3702;
    Interface39 anInterface39_3703;
    int anInt3704 = 64;
    Interface37 anInterface37_3705;
    int[] anIntArray3706;
    Interface37 anInterface37_3707;
    Class536_Sub2_Sub1[][] aClass536_Sub2_Sub1ArrayArray3708;
    int anInt3709;
    static float aFloat3710;
    
    void method6313(Class185_Sub1 class185_sub1, Class536_Sub2 class536_sub2,
		    int i, int i_0_, int i_1_, Class323 class323,
		    boolean bool) {
	Class536_Sub2 class536_sub2_2_ = class536_sub2.aClass536_Sub2_10349;
	int i_3_ = 0;
	int i_4_ = -2;
	boolean bool_5_ = true;
	boolean bool_6_ = true;
	while (class536_sub2_2_ != class536_sub2) {
	    anInt3709 = 0;
	    for (int i_7_ = 0; i_7_ < i; i_7_++)
		anIntArray3696[i_7_] = 0;
	    for (int i_8_ = 0; i_8_ < 64; i_8_++)
		anIntArray3706[i_8_] = 0;
	    for (/**/; class536_sub2_2_ != class536_sub2;
		 class536_sub2_2_ = class536_sub2_2_.aClass536_Sub2_10349) {
		Class536_Sub2_Sub1 class536_sub2_sub1
		    = (Class536_Sub2_Sub1) class536_sub2_2_;
		if (bool_6_) {
		    i_4_ = class536_sub2_sub1.anInt11498;
		    bool_5_ = class536_sub2_sub1.aBool11494;
		    bool_6_ = false;
		}
		if (i_3_ > 0
		    && (i_4_ != class536_sub2_sub1.anInt11498
			|| bool_5_ != class536_sub2_sub1.aBool11494)) {
		    bool_6_ = true;
		    break;
		}
		method6314(anIntArray3700[i_3_++] - i_0_ >> i_1_,
			   class536_sub2_sub1);
	    }
	    class323.anInterface38_3426 = null;
	    if (i_4_ >= 0) {
		Class186 class186
		    = class185_sub1.aClass177_2012.method2931(i_4_, (byte) 1);
		if (class186.aBool2043)
		    class323.anInterface38_3426
			= class185_sub1.aClass354_9211.method6267(class186);
		byte i_9_ = 0;
		if (class186.aClass599_2064 == Class599.aClass599_7868)
		    i_9_ = class186.aByte2051;
		class185_sub1.method14959(i_9_);
	    }
	    if (bool_5_ && class185_sub1.aFloat9205 != aFloat3710)
		class185_sub1.method3489(aFloat3710);
	    else if (class185_sub1.aFloat9205 != 1.0F)
		class185_sub1.method3489(1.0F);
	    method6319(class185_sub1, i, bool);
	}
    }
    
    void method6314(int i, Class536_Sub2_Sub1 class536_sub2_sub1) {
	if (i < 1600) {
	    if (anIntArray3696[i] < 64)
		aClass536_Sub2_Sub1ArrayArray3708[i][anIntArray3696[i]++]
		    = class536_sub2_sub1;
	    else {
		if (anIntArray3696[i] == 64) {
		    if (anInt3709 == 64)
			return;
		    anIntArray3696[i] += 1 + anInt3709++;
		}
		aClass536_Sub2_Sub1ArrayArray3695
		    [anIntArray3696[i] - 64 - 1]
		    [anIntArray3706[anIntArray3696[i] - 64 - 1]++]
		    = class536_sub2_sub1;
	    }
	}
    }
    
    void method6315(Class185_Sub1 class185_sub1, int i, boolean bool) {
	int i_10_ = 0;
	Class433 class433 = class185_sub1.aClass433_9142;
	float f = class433.aFloatArray4853[0];
	float f_11_ = class433.aFloatArray4853[4];
	float f_12_ = class433.aFloatArray4853[8];
	float f_13_ = class433.aFloatArray4853[1];
	float f_14_ = class433.aFloatArray4853[5];
	float f_15_ = class433.aFloatArray4853[9];
	float f_16_ = f + f_13_;
	float f_17_ = f_11_ + f_14_;
	float f_18_ = f_12_ + f_15_;
	float f_19_ = f - f_13_;
	float f_20_ = f_11_ - f_14_;
	float f_21_ = f_12_ - f_15_;
	float f_22_ = f_13_ - f;
	float f_23_ = f_14_ - f_11_;
	float f_24_ = f_15_ - f_12_;
	float[] fs = new float[3];
	float[] fs_25_ = new float[3];
	class185_sub1.aClass433_9194.method6843(class185_sub1.aClass433_9118);
	ByteBuffer bytebuffer = class185_sub1.aByteBuffer9266;
	bytebuffer.clear();
	for (int i_26_ = i - 1; i_26_ >= 0; i_26_--) {
	    int i_27_
		= anIntArray3696[i_26_] > 64 ? 64 : anIntArray3696[i_26_];
	    if (i_27_ > 0) {
		for (int i_28_ = i_27_ - 1; i_28_ >= 0; i_28_--) {
		    Class536_Sub2_Sub1 class536_sub2_sub1
			= aClass536_Sub2_Sub1ArrayArray3708[i_26_][i_28_];
		    int i_29_ = class536_sub2_sub1.anInt11492;
		    byte i_30_ = (byte) (i_29_ >> 16);
		    byte i_31_ = (byte) (i_29_ >> 8);
		    byte i_32_ = (byte) i_29_;
		    byte i_33_ = (byte) (i_29_ >>> 24);
		    if (class185_sub1.anInt9268 == 0) {
			byte i_34_ = i_30_;
			i_30_ = i_32_;
			i_32_ = i_34_;
		    }
		    float f_35_
			= (float) (class536_sub2_sub1.anInt11491 >> 12);
		    float f_36_
			= (float) (class536_sub2_sub1.anInt11495 >> 12);
		    float f_37_
			= (float) (class536_sub2_sub1.anInt11496 >> 12);
		    int i_38_ = class536_sub2_sub1.anInt11497 >> 12;
		    if (class536_sub2_sub1.aShort11499 != 0) {
			class185_sub1.aClass433_9150.method6935
			    (class536_sub2_sub1.aShort11499, i_38_, i_38_,
			     0.0F, 0.0F, 0.0F);
			class185_sub1.aClass433_9150
			    .method6839(class185_sub1.aClass433_9194);
			class185_sub1.aClass433_9150.method6850(1.0F, 0.0F,
								0.0F, fs);
			class185_sub1.aClass433_9150.method6850(0.0F, 1.0F,
								0.0F, fs_25_);
			bytebuffer.putFloat(f_35_ - fs[0] - fs_25_[0]);
			bytebuffer.putFloat(f_36_ - fs[1] - fs_25_[1]);
			bytebuffer.putFloat(f_37_ - fs[2] - fs_25_[2]);
			bytebuffer.put(i_30_);
			bytebuffer.put(i_31_);
			bytebuffer.put(i_32_);
			bytebuffer.put(i_33_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_35_ - fs[0] + fs_25_[0]);
			bytebuffer.putFloat(f_36_ - fs[1] + fs_25_[1]);
			bytebuffer.putFloat(f_37_ - fs[2] + fs_25_[2]);
			bytebuffer.put(i_30_);
			bytebuffer.put(i_31_);
			bytebuffer.put(i_32_);
			bytebuffer.put(i_33_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_35_ + fs[0] + fs_25_[0]);
			bytebuffer.putFloat(f_36_ + fs[1] + fs_25_[1]);
			bytebuffer.putFloat(f_37_ + fs[2] + fs_25_[2]);
			bytebuffer.put(i_30_);
			bytebuffer.put(i_31_);
			bytebuffer.put(i_32_);
			bytebuffer.put(i_33_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_35_ + fs[0] - fs_25_[0]);
			bytebuffer.putFloat(f_36_ + fs[1] - fs_25_[1]);
			bytebuffer.putFloat(f_37_ + fs[2] - fs_25_[2]);
			bytebuffer.put(i_30_);
			bytebuffer.put(i_31_);
			bytebuffer.put(i_32_);
			bytebuffer.put(i_33_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(0.0F);
		    } else {
			bytebuffer.putFloat(f_35_ + f_16_ * (float) -i_38_);
			bytebuffer.putFloat(f_36_ + f_17_ * (float) -i_38_);
			bytebuffer.putFloat(f_37_ + f_18_ * (float) -i_38_);
			bytebuffer.put(i_30_);
			bytebuffer.put(i_31_);
			bytebuffer.put(i_32_);
			bytebuffer.put(i_33_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_35_ + f_22_ * (float) i_38_);
			bytebuffer.putFloat(f_36_ + f_23_ * (float) i_38_);
			bytebuffer.putFloat(f_37_ + f_24_ * (float) i_38_);
			bytebuffer.put(i_30_);
			bytebuffer.put(i_31_);
			bytebuffer.put(i_32_);
			bytebuffer.put(i_33_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_35_ + f_16_ * (float) i_38_);
			bytebuffer.putFloat(f_36_ + f_17_ * (float) i_38_);
			bytebuffer.putFloat(f_37_ + f_18_ * (float) i_38_);
			bytebuffer.put(i_30_);
			bytebuffer.put(i_31_);
			bytebuffer.put(i_32_);
			bytebuffer.put(i_33_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_35_ + f_19_ * (float) i_38_);
			bytebuffer.putFloat(f_36_ + f_20_ * (float) i_38_);
			bytebuffer.putFloat(f_37_ + f_21_ * (float) i_38_);
			bytebuffer.put(i_30_);
			bytebuffer.put(i_31_);
			bytebuffer.put(i_32_);
			bytebuffer.put(i_33_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(0.0F);
		    }
		    i_10_++;
		}
		if (anIntArray3696[i_26_] > 64) {
		    int i_39_ = anIntArray3696[i_26_] - 64 - 1;
		    for (int i_40_ = anIntArray3706[i_39_] - 1; i_40_ >= 0;
			 i_40_--) {
			Class536_Sub2_Sub1 class536_sub2_sub1
			    = aClass536_Sub2_Sub1ArrayArray3695[i_39_][i_40_];
			int i_41_ = class536_sub2_sub1.anInt11492;
			byte i_42_ = (byte) (i_41_ >> 16);
			byte i_43_ = (byte) (i_41_ >> 8);
			byte i_44_ = (byte) i_41_;
			byte i_45_ = (byte) (i_41_ >>> 24);
			float f_46_
			    = (float) (class536_sub2_sub1.anInt11491 >> 12);
			float f_47_
			    = (float) (class536_sub2_sub1.anInt11495 >> 12);
			float f_48_
			    = (float) (class536_sub2_sub1.anInt11496 >> 12);
			int i_49_ = class536_sub2_sub1.anInt11497 >> 12;
			if (class185_sub1.anInt9268 == 0) {
			    byte i_50_ = i_42_;
			    i_42_ = i_44_;
			    i_44_ = i_50_;
			}
			if (class536_sub2_sub1.aShort11499 != 0) {
			    class185_sub1.aClass433_9150.method6935
				(class536_sub2_sub1.aShort11499, i_49_, i_49_,
				 0.0F, 0.0F, 0.0F);
			    class185_sub1.aClass433_9150
				.method6839(class185_sub1.aClass433_9194);
			    class185_sub1.aClass433_9150.method6850(1.0F, 0.0F,
								    0.0F, fs);
			    class185_sub1.aClass433_9150
				.method6850(0.0F, 1.0F, 0.0F, fs_25_);
			    bytebuffer.putFloat(f_46_ - fs[0] - fs_25_[0]);
			    bytebuffer.putFloat(f_47_ - fs[1] - fs_25_[1]);
			    bytebuffer.putFloat(f_48_ - fs[2] - fs_25_[2]);
			    bytebuffer.put(i_42_);
			    bytebuffer.put(i_43_);
			    bytebuffer.put(i_44_);
			    bytebuffer.put(i_45_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(f_46_ - fs[0] + fs_25_[0]);
			    bytebuffer.putFloat(f_47_ - fs[1] + fs_25_[1]);
			    bytebuffer.putFloat(f_48_ - fs[2] + fs_25_[2]);
			    bytebuffer.put(i_42_);
			    bytebuffer.put(i_43_);
			    bytebuffer.put(i_44_);
			    bytebuffer.put(i_45_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_46_ + fs[0] + fs_25_[0]);
			    bytebuffer.putFloat(f_47_ + fs[1] + fs_25_[1]);
			    bytebuffer.putFloat(f_48_ + fs[2] + fs_25_[2]);
			    bytebuffer.put(i_42_);
			    bytebuffer.put(i_43_);
			    bytebuffer.put(i_44_);
			    bytebuffer.put(i_45_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_46_ + fs[0] - fs_25_[0]);
			    bytebuffer.putFloat(f_47_ + fs[1] - fs_25_[1]);
			    bytebuffer.putFloat(f_48_ + fs[2] - fs_25_[2]);
			    bytebuffer.put(i_42_);
			    bytebuffer.put(i_43_);
			    bytebuffer.put(i_44_);
			    bytebuffer.put(i_45_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(0.0F);
			} else {
			    bytebuffer
				.putFloat(f_46_ + f_16_ * (float) -i_49_);
			    bytebuffer
				.putFloat(f_47_ + f_17_ * (float) -i_49_);
			    bytebuffer
				.putFloat(f_48_ + f_18_ * (float) -i_49_);
			    bytebuffer.put(i_42_);
			    bytebuffer.put(i_43_);
			    bytebuffer.put(i_44_);
			    bytebuffer.put(i_45_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(f_46_ + f_22_ * (float) i_49_);
			    bytebuffer.putFloat(f_47_ + f_23_ * (float) i_49_);
			    bytebuffer.putFloat(f_48_ + f_24_ * (float) i_49_);
			    bytebuffer.put(i_42_);
			    bytebuffer.put(i_43_);
			    bytebuffer.put(i_44_);
			    bytebuffer.put(i_45_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_46_ + f_16_ * (float) i_49_);
			    bytebuffer.putFloat(f_47_ + f_17_ * (float) i_49_);
			    bytebuffer.putFloat(f_48_ + f_18_ * (float) i_49_);
			    bytebuffer.put(i_42_);
			    bytebuffer.put(i_43_);
			    bytebuffer.put(i_44_);
			    bytebuffer.put(i_45_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_46_ + f_19_ * (float) i_49_);
			    bytebuffer.putFloat(f_47_ + f_20_ * (float) i_49_);
			    bytebuffer.putFloat(f_48_ + f_21_ * (float) i_49_);
			    bytebuffer.put(i_42_);
			    bytebuffer.put(i_43_);
			    bytebuffer.put(i_44_);
			    bytebuffer.put(i_45_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(0.0F);
			}
			i_10_++;
		    }
		}
	    }
	}
	anInterface37_3705.method235(0, bytebuffer.position(),
				     class185_sub1.aLong9139);
	class185_sub1.method14733(0, anInterface37_3705);
	class185_sub1.method14733(1, anInterface37_3707);
	class185_sub1.method14700(aClass349_3697);
	Class323 class323 = class185_sub1.aClass323_9234;
	class323.method5786(i_10_, bool);
    }
    
    void method6316(Class185_Sub1 class185_sub1, Class174 class174) {
	class185_sub1.method3461(false);
	aFloat3710 = class185_sub1.aFloat9205;
	float f = class185_sub1.aClass433_9142.aFloatArray4853[2];
	float f_51_ = class185_sub1.aClass433_9142.aFloatArray4853[6];
	float f_52_ = class185_sub1.aClass433_9142.aFloatArray4853[10];
	float f_53_ = class185_sub1.aClass433_9142.aFloatArray4853[14];
	int i = 0;
	int i_54_ = 2147483647;
	int i_55_ = 0;
	Class536_Sub2 class536_sub2
	    = class174.aClass701_1837.aClass536_Sub2_8809;
	for (Class536_Sub2 class536_sub2_56_
		 = class536_sub2.aClass536_Sub2_10349;
	     class536_sub2_56_ != class536_sub2;
	     class536_sub2_56_ = class536_sub2_56_.aClass536_Sub2_10349) {
	    Class536_Sub2_Sub1 class536_sub2_sub1
		= (Class536_Sub2_Sub1) class536_sub2_56_;
	    int i_57_
		= (int) (f * (float) (class536_sub2_sub1.anInt11491 >> 12)
			 + f_51_ * (float) (class536_sub2_sub1.anInt11495
					    >> 12)
			 + f_52_ * (float) (class536_sub2_sub1.anInt11496
					    >> 12)
			 + f_53_);
	    if (i_57_ > i_55_)
		i_55_ = i_57_;
	    if (i_57_ < i_54_)
		i_54_ = i_57_;
	    anIntArray3700[i++] = i_57_;
	}
	int i_58_ = i_55_ - i_54_;
	int i_59_;
	if (i_58_ + 2 > 1600) {
	    i_59_ = 1 + Class695.method14072(i_58_, (byte) -102) - anInt3702;
	    i_58_ = (i_58_ >> i_59_) + 2;
	} else {
	    i_59_ = 0;
	    i_58_ += 2;
	}
	class185_sub1.method14701(anInterface39_3703);
	Class323 class323 = class185_sub1.aClass323_9234;
	class323.method5784(Class433.aClass433_4854);
	class323.aClass433_3423.method6840();
	class323.anInt3427 = -1;
	boolean bool = class185_sub1.anInt9252 > 0;
	if (bool) {
	    class323.aClass441_3425.method7105(0.0F, 0.0F, 1.0F,
					       -class185_sub1.aFloat9254);
	    class323.aClass438_3424.method6997
		((float) (class185_sub1.anInt9251 >> 16 & 0xff) / 255.0F,
		 (float) (class185_sub1.anInt9251 >> 8 & 0xff) / 255.0F,
		 (float) (class185_sub1.anInt9251 >> 0 & 0xff) / 255.0F);
	    class323.aClass441_3425.method7111(class185_sub1.aClass433_9144);
	    class323.aClass441_3425.method7110(1.0F
					       / (class185_sub1.aFloat9255
						  - class185_sub1.aFloat9254));
	} else {
	    class323.aClass441_3425.method7105(0.0F, 0.0F, 0.0F, 0.0F);
	    class323.aClass438_3424.method6997(0.0F, 0.0F, 0.0F);
	}
	method6313(class185_sub1, class536_sub2, i_58_, i_54_, i_59_, class323,
		   bool);
	if (class185_sub1.aFloat9205 != aFloat3710)
	    class185_sub1.method3489(aFloat3710);
	class185_sub1.method3461(true);
    }
    
    void method6317() {
	anInterface37_3705.method142();
    }
    
    void method6318(Class185_Sub1 class185_sub1) {
	anInterface37_3705.method236(786336, 24);
    }
    
    void method6319(Class185_Sub1 class185_sub1, int i, boolean bool) {
	int i_60_ = 0;
	Class433 class433 = class185_sub1.aClass433_9142;
	float f = class433.aFloatArray4853[0];
	float f_61_ = class433.aFloatArray4853[4];
	float f_62_ = class433.aFloatArray4853[8];
	float f_63_ = class433.aFloatArray4853[1];
	float f_64_ = class433.aFloatArray4853[5];
	float f_65_ = class433.aFloatArray4853[9];
	float f_66_ = f + f_63_;
	float f_67_ = f_61_ + f_64_;
	float f_68_ = f_62_ + f_65_;
	float f_69_ = f - f_63_;
	float f_70_ = f_61_ - f_64_;
	float f_71_ = f_62_ - f_65_;
	float f_72_ = f_63_ - f;
	float f_73_ = f_64_ - f_61_;
	float f_74_ = f_65_ - f_62_;
	float[] fs = new float[3];
	float[] fs_75_ = new float[3];
	class185_sub1.aClass433_9194.method6843(class185_sub1.aClass433_9118);
	ByteBuffer bytebuffer = class185_sub1.aByteBuffer9266;
	bytebuffer.clear();
	for (int i_76_ = i - 1; i_76_ >= 0; i_76_--) {
	    int i_77_
		= anIntArray3696[i_76_] > 64 ? 64 : anIntArray3696[i_76_];
	    if (i_77_ > 0) {
		for (int i_78_ = i_77_ - 1; i_78_ >= 0; i_78_--) {
		    Class536_Sub2_Sub1 class536_sub2_sub1
			= aClass536_Sub2_Sub1ArrayArray3708[i_76_][i_78_];
		    int i_79_ = class536_sub2_sub1.anInt11492;
		    byte i_80_ = (byte) (i_79_ >> 16);
		    byte i_81_ = (byte) (i_79_ >> 8);
		    byte i_82_ = (byte) i_79_;
		    byte i_83_ = (byte) (i_79_ >>> 24);
		    if (class185_sub1.anInt9268 == 0) {
			byte i_84_ = i_80_;
			i_80_ = i_82_;
			i_82_ = i_84_;
		    }
		    float f_85_
			= (float) (class536_sub2_sub1.anInt11491 >> 12);
		    float f_86_
			= (float) (class536_sub2_sub1.anInt11495 >> 12);
		    float f_87_
			= (float) (class536_sub2_sub1.anInt11496 >> 12);
		    int i_88_ = class536_sub2_sub1.anInt11497 >> 12;
		    if (class536_sub2_sub1.aShort11499 != 0) {
			class185_sub1.aClass433_9150.method6935
			    (class536_sub2_sub1.aShort11499, i_88_, i_88_,
			     0.0F, 0.0F, 0.0F);
			class185_sub1.aClass433_9150
			    .method6839(class185_sub1.aClass433_9194);
			class185_sub1.aClass433_9150.method6850(1.0F, 0.0F,
								0.0F, fs);
			class185_sub1.aClass433_9150.method6850(0.0F, 1.0F,
								0.0F, fs_75_);
			bytebuffer.putFloat(f_85_ - fs[0] - fs_75_[0]);
			bytebuffer.putFloat(f_86_ - fs[1] - fs_75_[1]);
			bytebuffer.putFloat(f_87_ - fs[2] - fs_75_[2]);
			bytebuffer.put(i_80_);
			bytebuffer.put(i_81_);
			bytebuffer.put(i_82_);
			bytebuffer.put(i_83_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_85_ - fs[0] + fs_75_[0]);
			bytebuffer.putFloat(f_86_ - fs[1] + fs_75_[1]);
			bytebuffer.putFloat(f_87_ - fs[2] + fs_75_[2]);
			bytebuffer.put(i_80_);
			bytebuffer.put(i_81_);
			bytebuffer.put(i_82_);
			bytebuffer.put(i_83_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_85_ + fs[0] + fs_75_[0]);
			bytebuffer.putFloat(f_86_ + fs[1] + fs_75_[1]);
			bytebuffer.putFloat(f_87_ + fs[2] + fs_75_[2]);
			bytebuffer.put(i_80_);
			bytebuffer.put(i_81_);
			bytebuffer.put(i_82_);
			bytebuffer.put(i_83_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_85_ + fs[0] - fs_75_[0]);
			bytebuffer.putFloat(f_86_ + fs[1] - fs_75_[1]);
			bytebuffer.putFloat(f_87_ + fs[2] - fs_75_[2]);
			bytebuffer.put(i_80_);
			bytebuffer.put(i_81_);
			bytebuffer.put(i_82_);
			bytebuffer.put(i_83_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(0.0F);
		    } else {
			bytebuffer.putFloat(f_85_ + f_66_ * (float) -i_88_);
			bytebuffer.putFloat(f_86_ + f_67_ * (float) -i_88_);
			bytebuffer.putFloat(f_87_ + f_68_ * (float) -i_88_);
			bytebuffer.put(i_80_);
			bytebuffer.put(i_81_);
			bytebuffer.put(i_82_);
			bytebuffer.put(i_83_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_85_ + f_72_ * (float) i_88_);
			bytebuffer.putFloat(f_86_ + f_73_ * (float) i_88_);
			bytebuffer.putFloat(f_87_ + f_74_ * (float) i_88_);
			bytebuffer.put(i_80_);
			bytebuffer.put(i_81_);
			bytebuffer.put(i_82_);
			bytebuffer.put(i_83_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_85_ + f_66_ * (float) i_88_);
			bytebuffer.putFloat(f_86_ + f_67_ * (float) i_88_);
			bytebuffer.putFloat(f_87_ + f_68_ * (float) i_88_);
			bytebuffer.put(i_80_);
			bytebuffer.put(i_81_);
			bytebuffer.put(i_82_);
			bytebuffer.put(i_83_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_85_ + f_69_ * (float) i_88_);
			bytebuffer.putFloat(f_86_ + f_70_ * (float) i_88_);
			bytebuffer.putFloat(f_87_ + f_71_ * (float) i_88_);
			bytebuffer.put(i_80_);
			bytebuffer.put(i_81_);
			bytebuffer.put(i_82_);
			bytebuffer.put(i_83_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(0.0F);
		    }
		    i_60_++;
		}
		if (anIntArray3696[i_76_] > 64) {
		    int i_89_ = anIntArray3696[i_76_] - 64 - 1;
		    for (int i_90_ = anIntArray3706[i_89_] - 1; i_90_ >= 0;
			 i_90_--) {
			Class536_Sub2_Sub1 class536_sub2_sub1
			    = aClass536_Sub2_Sub1ArrayArray3695[i_89_][i_90_];
			int i_91_ = class536_sub2_sub1.anInt11492;
			byte i_92_ = (byte) (i_91_ >> 16);
			byte i_93_ = (byte) (i_91_ >> 8);
			byte i_94_ = (byte) i_91_;
			byte i_95_ = (byte) (i_91_ >>> 24);
			float f_96_
			    = (float) (class536_sub2_sub1.anInt11491 >> 12);
			float f_97_
			    = (float) (class536_sub2_sub1.anInt11495 >> 12);
			float f_98_
			    = (float) (class536_sub2_sub1.anInt11496 >> 12);
			int i_99_ = class536_sub2_sub1.anInt11497 >> 12;
			if (class185_sub1.anInt9268 == 0) {
			    byte i_100_ = i_92_;
			    i_92_ = i_94_;
			    i_94_ = i_100_;
			}
			if (class536_sub2_sub1.aShort11499 != 0) {
			    class185_sub1.aClass433_9150.method6935
				(class536_sub2_sub1.aShort11499, i_99_, i_99_,
				 0.0F, 0.0F, 0.0F);
			    class185_sub1.aClass433_9150
				.method6839(class185_sub1.aClass433_9194);
			    class185_sub1.aClass433_9150.method6850(1.0F, 0.0F,
								    0.0F, fs);
			    class185_sub1.aClass433_9150
				.method6850(0.0F, 1.0F, 0.0F, fs_75_);
			    bytebuffer.putFloat(f_96_ - fs[0] - fs_75_[0]);
			    bytebuffer.putFloat(f_97_ - fs[1] - fs_75_[1]);
			    bytebuffer.putFloat(f_98_ - fs[2] - fs_75_[2]);
			    bytebuffer.put(i_92_);
			    bytebuffer.put(i_93_);
			    bytebuffer.put(i_94_);
			    bytebuffer.put(i_95_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(f_96_ - fs[0] + fs_75_[0]);
			    bytebuffer.putFloat(f_97_ - fs[1] + fs_75_[1]);
			    bytebuffer.putFloat(f_98_ - fs[2] + fs_75_[2]);
			    bytebuffer.put(i_92_);
			    bytebuffer.put(i_93_);
			    bytebuffer.put(i_94_);
			    bytebuffer.put(i_95_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_96_ + fs[0] + fs_75_[0]);
			    bytebuffer.putFloat(f_97_ + fs[1] + fs_75_[1]);
			    bytebuffer.putFloat(f_98_ + fs[2] + fs_75_[2]);
			    bytebuffer.put(i_92_);
			    bytebuffer.put(i_93_);
			    bytebuffer.put(i_94_);
			    bytebuffer.put(i_95_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_96_ + fs[0] - fs_75_[0]);
			    bytebuffer.putFloat(f_97_ + fs[1] - fs_75_[1]);
			    bytebuffer.putFloat(f_98_ + fs[2] - fs_75_[2]);
			    bytebuffer.put(i_92_);
			    bytebuffer.put(i_93_);
			    bytebuffer.put(i_94_);
			    bytebuffer.put(i_95_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(0.0F);
			} else {
			    bytebuffer
				.putFloat(f_96_ + f_66_ * (float) -i_99_);
			    bytebuffer
				.putFloat(f_97_ + f_67_ * (float) -i_99_);
			    bytebuffer
				.putFloat(f_98_ + f_68_ * (float) -i_99_);
			    bytebuffer.put(i_92_);
			    bytebuffer.put(i_93_);
			    bytebuffer.put(i_94_);
			    bytebuffer.put(i_95_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(f_96_ + f_72_ * (float) i_99_);
			    bytebuffer.putFloat(f_97_ + f_73_ * (float) i_99_);
			    bytebuffer.putFloat(f_98_ + f_74_ * (float) i_99_);
			    bytebuffer.put(i_92_);
			    bytebuffer.put(i_93_);
			    bytebuffer.put(i_94_);
			    bytebuffer.put(i_95_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_96_ + f_66_ * (float) i_99_);
			    bytebuffer.putFloat(f_97_ + f_67_ * (float) i_99_);
			    bytebuffer.putFloat(f_98_ + f_68_ * (float) i_99_);
			    bytebuffer.put(i_92_);
			    bytebuffer.put(i_93_);
			    bytebuffer.put(i_94_);
			    bytebuffer.put(i_95_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_96_ + f_69_ * (float) i_99_);
			    bytebuffer.putFloat(f_97_ + f_70_ * (float) i_99_);
			    bytebuffer.putFloat(f_98_ + f_71_ * (float) i_99_);
			    bytebuffer.put(i_92_);
			    bytebuffer.put(i_93_);
			    bytebuffer.put(i_94_);
			    bytebuffer.put(i_95_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(0.0F);
			}
			i_60_++;
		    }
		}
	    }
	}
	anInterface37_3705.method235(0, bytebuffer.position(),
				     class185_sub1.aLong9139);
	class185_sub1.method14733(0, anInterface37_3705);
	class185_sub1.method14733(1, anInterface37_3707);
	class185_sub1.method14700(aClass349_3697);
	Class323 class323 = class185_sub1.aClass323_9234;
	class323.method5786(i_60_, bool);
    }
    
    void method6320(Class185_Sub1 class185_sub1) {
	anInterface37_3705.method236(786336, 24);
    }
    
    void method6321(Class185_Sub1 class185_sub1) {
	anInterface37_3705.method236(786336, 24);
    }
    
    void method6322(Class185_Sub1 class185_sub1) {
	anInterface37_3705.method236(786336, 24);
    }
    
    Class359(Class185_Sub1 class185_sub1) {
	anInt3698 = 768;
	anInt3701 = 1600;
	anInt3702 = Class695.method14072(1600, (byte) -23);
	anInt3704 = 64;
	anIntArray3700 = new int[8191];
	anIntArray3696 = new int[1600];
	anIntArray3706 = new int[64];
	aClass536_Sub2_Sub1ArrayArray3708 = new Class536_Sub2_Sub1[1600][64];
	aClass536_Sub2_Sub1ArrayArray3695 = new Class536_Sub2_Sub1[64][768];
	anInt3709 = 0;
	aClass349_3697
	    = (class185_sub1.method14699
	       (new Class381[]
		{ new Class381(new Class350[] { Class350.aClass350_3610,
						Class350.aClass350_3595,
						Class350.aClass350_3597 }),
		  new Class381(Class350.aClass350_3594) }));
	anInterface37_3705 = class185_sub1.method14698(true);
	anInterface37_3707 = class185_sub1.method14698(false);
	anInterface37_3707.method236(393168, 12);
	anInterface39_3703 = class185_sub1.method14971(false);
	anInterface39_3703.method277(49146);
	ByteBuffer bytebuffer = class185_sub1.aByteBuffer9266;
	bytebuffer.clear();
	for (int i = 0; i < 8191; i++) {
	    int i_101_ = i * 4;
	    bytebuffer.putShort((short) i_101_);
	    bytebuffer.putShort((short) (i_101_ + 1));
	    bytebuffer.putShort((short) (i_101_ + 2));
	    bytebuffer.putShort((short) (i_101_ + 2));
	    bytebuffer.putShort((short) (i_101_ + 3));
	    bytebuffer.putShort((short) i_101_);
	}
	anInterface39_3703.method235(0, bytebuffer.position(),
				     class185_sub1.aLong9139);
	bytebuffer.clear();
	for (int i = 0; i < 8191; i++) {
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(-1.0F);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(-1.0F);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(-1.0F);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(-1.0F);
	    bytebuffer.putFloat(0.0F);
	}
	anInterface37_3707.method235(0, bytebuffer.position(),
				     class185_sub1.aLong9139);
    }
    
    void method6323(Class185_Sub1 class185_sub1) {
	anInterface37_3705.method236(786336, 24);
    }
    
    void method6324() {
	anInterface37_3705.method142();
    }
    
    void method6325() {
	anInterface37_3705.method142();
    }
    
    void method6326() {
	anInterface37_3705.method142();
    }
    
    void method6327(Class185_Sub1 class185_sub1, Class174 class174) {
	class185_sub1.method3461(false);
	aFloat3710 = class185_sub1.aFloat9205;
	float f = class185_sub1.aClass433_9142.aFloatArray4853[2];
	float f_102_ = class185_sub1.aClass433_9142.aFloatArray4853[6];
	float f_103_ = class185_sub1.aClass433_9142.aFloatArray4853[10];
	float f_104_ = class185_sub1.aClass433_9142.aFloatArray4853[14];
	int i = 0;
	int i_105_ = 2147483647;
	int i_106_ = 0;
	Class536_Sub2 class536_sub2
	    = class174.aClass701_1837.aClass536_Sub2_8809;
	for (Class536_Sub2 class536_sub2_107_
		 = class536_sub2.aClass536_Sub2_10349;
	     class536_sub2_107_ != class536_sub2;
	     class536_sub2_107_ = class536_sub2_107_.aClass536_Sub2_10349) {
	    Class536_Sub2_Sub1 class536_sub2_sub1
		= (Class536_Sub2_Sub1) class536_sub2_107_;
	    int i_108_
		= (int) (f * (float) (class536_sub2_sub1.anInt11491 >> 12)
			 + f_102_ * (float) (class536_sub2_sub1.anInt11495
					     >> 12)
			 + f_103_ * (float) (class536_sub2_sub1.anInt11496
					     >> 12)
			 + f_104_);
	    if (i_108_ > i_106_)
		i_106_ = i_108_;
	    if (i_108_ < i_105_)
		i_105_ = i_108_;
	    anIntArray3700[i++] = i_108_;
	}
	int i_109_ = i_106_ - i_105_;
	int i_110_;
	if (i_109_ + 2 > 1600) {
	    i_110_ = 1 + Class695.method14072(i_109_, (byte) -64) - anInt3702;
	    i_109_ = (i_109_ >> i_110_) + 2;
	} else {
	    i_110_ = 0;
	    i_109_ += 2;
	}
	class185_sub1.method14701(anInterface39_3703);
	Class323 class323 = class185_sub1.aClass323_9234;
	class323.method5784(Class433.aClass433_4854);
	class323.aClass433_3423.method6840();
	class323.anInt3427 = -1;
	boolean bool = class185_sub1.anInt9252 > 0;
	if (bool) {
	    class323.aClass441_3425.method7105(0.0F, 0.0F, 1.0F,
					       -class185_sub1.aFloat9254);
	    class323.aClass438_3424.method6997
		((float) (class185_sub1.anInt9251 >> 16 & 0xff) / 255.0F,
		 (float) (class185_sub1.anInt9251 >> 8 & 0xff) / 255.0F,
		 (float) (class185_sub1.anInt9251 >> 0 & 0xff) / 255.0F);
	    class323.aClass441_3425.method7111(class185_sub1.aClass433_9144);
	    class323.aClass441_3425.method7110(1.0F
					       / (class185_sub1.aFloat9255
						  - class185_sub1.aFloat9254));
	} else {
	    class323.aClass441_3425.method7105(0.0F, 0.0F, 0.0F, 0.0F);
	    class323.aClass438_3424.method6997(0.0F, 0.0F, 0.0F);
	}
	method6313(class185_sub1, class536_sub2, i_109_, i_105_, i_110_,
		   class323, bool);
	if (class185_sub1.aFloat9205 != aFloat3710)
	    class185_sub1.method3489(aFloat3710);
	class185_sub1.method3461(true);
    }
    
    void method6328(Class185_Sub1 class185_sub1) {
	anInterface37_3705.method236(786336, 24);
    }
    
    void method6329(int i, Class536_Sub2_Sub1 class536_sub2_sub1) {
	if (i < 1600) {
	    if (anIntArray3696[i] < 64)
		aClass536_Sub2_Sub1ArrayArray3708[i][anIntArray3696[i]++]
		    = class536_sub2_sub1;
	    else {
		if (anIntArray3696[i] == 64) {
		    if (anInt3709 == 64)
			return;
		    anIntArray3696[i] += 1 + anInt3709++;
		}
		aClass536_Sub2_Sub1ArrayArray3695
		    [anIntArray3696[i] - 64 - 1]
		    [anIntArray3706[anIntArray3696[i] - 64 - 1]++]
		    = class536_sub2_sub1;
	    }
	}
    }
    
    void method6330(Class185_Sub1 class185_sub1, Class174 class174) {
	class185_sub1.method3461(false);
	aFloat3710 = class185_sub1.aFloat9205;
	float f = class185_sub1.aClass433_9142.aFloatArray4853[2];
	float f_111_ = class185_sub1.aClass433_9142.aFloatArray4853[6];
	float f_112_ = class185_sub1.aClass433_9142.aFloatArray4853[10];
	float f_113_ = class185_sub1.aClass433_9142.aFloatArray4853[14];
	int i = 0;
	int i_114_ = 2147483647;
	int i_115_ = 0;
	Class536_Sub2 class536_sub2
	    = class174.aClass701_1837.aClass536_Sub2_8809;
	for (Class536_Sub2 class536_sub2_116_
		 = class536_sub2.aClass536_Sub2_10349;
	     class536_sub2_116_ != class536_sub2;
	     class536_sub2_116_ = class536_sub2_116_.aClass536_Sub2_10349) {
	    Class536_Sub2_Sub1 class536_sub2_sub1
		= (Class536_Sub2_Sub1) class536_sub2_116_;
	    int i_117_
		= (int) (f * (float) (class536_sub2_sub1.anInt11491 >> 12)
			 + f_111_ * (float) (class536_sub2_sub1.anInt11495
					     >> 12)
			 + f_112_ * (float) (class536_sub2_sub1.anInt11496
					     >> 12)
			 + f_113_);
	    if (i_117_ > i_115_)
		i_115_ = i_117_;
	    if (i_117_ < i_114_)
		i_114_ = i_117_;
	    anIntArray3700[i++] = i_117_;
	}
	int i_118_ = i_115_ - i_114_;
	int i_119_;
	if (i_118_ + 2 > 1600) {
	    i_119_ = 1 + Class695.method14072(i_118_, (byte) 66) - anInt3702;
	    i_118_ = (i_118_ >> i_119_) + 2;
	} else {
	    i_119_ = 0;
	    i_118_ += 2;
	}
	class185_sub1.method14701(anInterface39_3703);
	Class323 class323 = class185_sub1.aClass323_9234;
	class323.method5784(Class433.aClass433_4854);
	class323.aClass433_3423.method6840();
	class323.anInt3427 = -1;
	boolean bool = class185_sub1.anInt9252 > 0;
	if (bool) {
	    class323.aClass441_3425.method7105(0.0F, 0.0F, 1.0F,
					       -class185_sub1.aFloat9254);
	    class323.aClass438_3424.method6997
		((float) (class185_sub1.anInt9251 >> 16 & 0xff) / 255.0F,
		 (float) (class185_sub1.anInt9251 >> 8 & 0xff) / 255.0F,
		 (float) (class185_sub1.anInt9251 >> 0 & 0xff) / 255.0F);
	    class323.aClass441_3425.method7111(class185_sub1.aClass433_9144);
	    class323.aClass441_3425.method7110(1.0F
					       / (class185_sub1.aFloat9255
						  - class185_sub1.aFloat9254));
	} else {
	    class323.aClass441_3425.method7105(0.0F, 0.0F, 0.0F, 0.0F);
	    class323.aClass438_3424.method6997(0.0F, 0.0F, 0.0F);
	}
	method6313(class185_sub1, class536_sub2, i_118_, i_114_, i_119_,
		   class323, bool);
	if (class185_sub1.aFloat9205 != aFloat3710)
	    class185_sub1.method3489(aFloat3710);
	class185_sub1.method3461(true);
    }
}
