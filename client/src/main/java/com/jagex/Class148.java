/* Class148 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class148
{
    int[] anIntArray1666;
    int anInt1667 = 64;
    Class536_Sub2_Sub1[][] aClass536_Sub2_Sub1ArrayArray1668;
    Class129 aClass129_1669;
    Class129 aClass129_1670;
    Class129 aClass129_1671;
    int anInt1672 = 64;
    Class534_Sub40_Sub2 aClass534_Sub40_Sub2_1673;
    int anInt1674 = 1600;
    float[] aFloatArray1675 = new float[16];
    int anInt1676;
    int[] anIntArray1677;
    Class536_Sub2_Sub1[][] aClass536_Sub2_Sub1ArrayArray1678;
    int[] anIntArray1679;
    int anInt1680 = 768;
    Interface15 anInterface15_1681;
    int anInt1682;
    static float aFloat1683;
    
    void method2456(Class185_Sub3 class185_sub3) {
	class185_sub3.method15193(true);
	OpenGL.glEnable(16384);
	OpenGL.glEnable(16385);
	if (class185_sub3.aFloat9646 != aFloat1683)
	    class185_sub3.method3489(aFloat1683);
    }
    
    void method2457(Class185_Sub3 class185_sub3) {
	anInterface15_1681 = class185_sub3.method15218(24, null, 196584, true);
	aClass129_1671 = new Class129(anInterface15_1681, 5126, 2, 0);
	aClass129_1669 = new Class129(anInterface15_1681, 5126, 3, 8);
	aClass129_1670 = new Class129(anInterface15_1681, 5121, 4, 20);
    }
    
    void method2458(Class185_Sub3 class185_sub3, Class174 class174) {
	if (class185_sub3.aClass433_9533 != null) {
	    method2465(class185_sub3);
	    float f = class185_sub3.aClass433_9533.aFloatArray4853[2];
	    float f_0_ = class185_sub3.aClass433_9533.aFloatArray4853[6];
	    float f_1_ = class185_sub3.aClass433_9533.aFloatArray4853[10];
	    float f_2_ = class185_sub3.aClass433_9533.aFloatArray4853[14];
	    try {
		int i = 0;
		int i_3_ = 2147483647;
		int i_4_ = 0;
		Class536_Sub2 class536_sub2
		    = class174.aClass701_1837.aClass536_Sub2_8809;
		for (Class536_Sub2 class536_sub2_5_
			 = class536_sub2.aClass536_Sub2_10349;
		     class536_sub2_5_ != class536_sub2;
		     class536_sub2_5_
			 = class536_sub2_5_.aClass536_Sub2_10349) {
		    Class536_Sub2_Sub1 class536_sub2_sub1
			= (Class536_Sub2_Sub1) class536_sub2_5_;
		    int i_6_
			= (int) (f * (float) (class536_sub2_sub1.anInt11491
					      >> 12)
				 + (f_0_
				    * (float) (class536_sub2_sub1.anInt11495
					       >> 12))
				 + (f_1_
				    * (float) (class536_sub2_sub1.anInt11496
					       >> 12))
				 + f_2_);
		    if (i_6_ > i_4_)
			i_4_ = i_6_;
		    if (i_6_ < i_3_)
			i_3_ = i_6_;
		    anIntArray1677[i++] = i_6_;
		}
		int i_7_ = i_4_ - i_3_;
		int i_8_;
		if (i_7_ + 2 > 1600) {
		    i_8_ = (1 + Class695.method14072(i_7_, (byte) 11)
			    - anInt1676);
		    i_7_ = (i_7_ >> i_8_) + 2;
		} else {
		    i_8_ = 0;
		    i_7_ += 2;
		}
		Class536_Sub2 class536_sub2_9_
		    = class536_sub2.aClass536_Sub2_10349;
		i = 0;
		int i_10_ = -2;
		boolean bool = true;
		boolean bool_11_ = true;
		while (class536_sub2_9_ != class536_sub2) {
		    anInt1682 = 0;
		    for (int i_12_ = 0; i_12_ < i_7_; i_12_++)
			anIntArray1666[i_12_] = 0;
		    for (int i_13_ = 0; i_13_ < 64; i_13_++)
			anIntArray1679[i_13_] = 0;
		    for (/**/; class536_sub2_9_ != class536_sub2;
			 class536_sub2_9_
			     = class536_sub2_9_.aClass536_Sub2_10349) {
			Class536_Sub2_Sub1 class536_sub2_sub1
			    = (Class536_Sub2_Sub1) class536_sub2_9_;
			if (bool_11_) {
			    i_10_ = class536_sub2_sub1.anInt11498;
			    bool = class536_sub2_sub1.aBool11494;
			    bool_11_ = false;
			}
			if (i > 0
			    && (i_10_ != class536_sub2_sub1.anInt11498
				|| bool != class536_sub2_sub1.aBool11494)) {
			    bool_11_ = true;
			    break;
			}
			int i_14_ = anIntArray1677[i++] - i_3_ >> i_8_;
			if (i_14_ < 1600) {
			    if (anIntArray1666[i_14_] < 64)
				aClass536_Sub2_Sub1ArrayArray1668[i_14_]
				    [anIntArray1666[i_14_]++]
				    = class536_sub2_sub1;
			    else {
				if (anIntArray1666[i_14_] == 64) {
				    if (anInt1682 == 64)
					continue;
				    anIntArray1666[i_14_] += 1 + anInt1682++;
				}
				aClass536_Sub2_Sub1ArrayArray1678
				    [anIntArray1666[i_14_] - 64 - 1]
				    [anIntArray1679[(anIntArray1666[i_14_] - 64
						     - 1)]++]
				    = class536_sub2_sub1;
			    }
			}
		    }
		    if (i_10_ >= 0)
			class185_sub3.method15227(i_10_);
		    else
			class185_sub3.method15227(-1);
		    if (bool && class185_sub3.aFloat9646 != aFloat1683)
			class185_sub3.method3489(aFloat1683);
		    else if (class185_sub3.aFloat9646 != 1.0F)
			class185_sub3.method3489(1.0F);
		    method2459(class185_sub3, i_7_);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    method2475(class185_sub3);
	}
    }
    
    void method2459(Class185_Sub3 class185_sub3, int i) {
	OpenGL.glGetFloatv(2982, aFloatArray1675, 0);
	float f = aFloatArray1675[0];
	float f_15_ = aFloatArray1675[4];
	float f_16_ = aFloatArray1675[8];
	float f_17_ = aFloatArray1675[1];
	float f_18_ = aFloatArray1675[5];
	float f_19_ = aFloatArray1675[9];
	float f_20_ = f + f_17_;
	float f_21_ = f_15_ + f_18_;
	float f_22_ = f_16_ + f_19_;
	float f_23_ = f - f_17_;
	float f_24_ = f_15_ - f_18_;
	float f_25_ = f_16_ - f_19_;
	float f_26_ = f_17_ - f;
	float f_27_ = f_18_ - f_15_;
	float f_28_ = f_19_ - f_16_;
	float[] fs = new float[3];
	float[] fs_29_ = new float[3];
	class185_sub3.aClass433_9530.method6843(class185_sub3.aClass433_9604);
	aClass534_Sub40_Sub2_1673.anInt10811 = 0;
	if (class185_sub3.aBool9566) {
	    for (int i_30_ = i - 1; i_30_ >= 0; i_30_--) {
		int i_31_
		    = anIntArray1666[i_30_] > 64 ? 64 : anIntArray1666[i_30_];
		if (i_31_ > 0) {
		    for (int i_32_ = i_31_ - 1; i_32_ >= 0; i_32_--) {
			Class536_Sub2_Sub1 class536_sub2_sub1
			    = aClass536_Sub2_Sub1ArrayArray1668[i_30_][i_32_];
			int i_33_ = class536_sub2_sub1.anInt11492;
			byte i_34_ = (byte) (i_33_ >> 16);
			byte i_35_ = (byte) (i_33_ >> 8);
			byte i_36_ = (byte) i_33_;
			byte i_37_ = (byte) (i_33_ >>> 24);
			float f_38_
			    = (float) (class536_sub2_sub1.anInt11491 >> 12);
			float f_39_
			    = (float) (class536_sub2_sub1.anInt11495 >> 12);
			float f_40_
			    = (float) (class536_sub2_sub1.anInt11496 >> 12);
			int i_41_ = class536_sub2_sub1.anInt11497 >> 12;
			if (class536_sub2_sub1.aShort11499 != 0) {
			    class185_sub3.aClass433_9552.method6935
				(class536_sub2_sub1.aShort11499, i_41_, i_41_,
				 0.0F, 0.0F, 0.0F);
			    class185_sub3.aClass433_9552
				.method6839(class185_sub3.aClass433_9530);
			    class185_sub3.aClass433_9552.method6850(1.0F, 0.0F,
								    0.0F, fs);
			    class185_sub3.aClass433_9552
				.method6850(0.0F, 1.0F, 0.0F, fs_29_);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_38_ - fs[0] - fs_29_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_39_ - fs[1] - fs_29_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_40_ - fs[2] - fs_29_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_34_,
								  350096326);
			    aClass534_Sub40_Sub2_1673.method16506(i_35_,
								  813076759);
			    aClass534_Sub40_Sub2_1673.method16506(i_36_,
								  904428807);
			    aClass534_Sub40_Sub2_1673.method16506(i_37_,
								  583497002);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_38_ - fs[0] + fs_29_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_39_ - fs[1] + fs_29_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_40_ - fs[2] + fs_29_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_34_,
								  610575561);
			    aClass534_Sub40_Sub2_1673.method16506(i_35_,
								  1844414356);
			    aClass534_Sub40_Sub2_1673.method16506(i_36_,
								  392145698);
			    aClass534_Sub40_Sub2_1673.method16506(i_37_,
								  1857004722);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_38_ + fs[0] + fs_29_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_39_ + fs[1] + fs_29_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_40_ + fs[2] + fs_29_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_34_,
								  444108196);
			    aClass534_Sub40_Sub2_1673.method16506(i_35_,
								  856276241);
			    aClass534_Sub40_Sub2_1673.method16506(i_36_,
								  662702382);
			    aClass534_Sub40_Sub2_1673.method16506(i_37_,
								  1830503071);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_38_ + fs[0] - fs_29_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_39_ + fs[1] - fs_29_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_40_ + fs[2] - fs_29_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_34_,
								  348895776);
			    aClass534_Sub40_Sub2_1673.method16506(i_35_,
								  1503871106);
			    aClass534_Sub40_Sub2_1673.method16506(i_36_,
								  1869376205);
			    aClass534_Sub40_Sub2_1673.method16506(i_37_,
								  827796195);
			} else {
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_38_ + f_20_ * (float) -i_41_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_39_ + f_21_ * (float) -i_41_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_40_ + f_22_ * (float) -i_41_);
			    aClass534_Sub40_Sub2_1673.method16506(i_34_,
								  808245634);
			    aClass534_Sub40_Sub2_1673.method16506(i_35_,
								  1346997529);
			    aClass534_Sub40_Sub2_1673.method16506(i_36_,
								  1368445664);
			    aClass534_Sub40_Sub2_1673.method16506(i_37_,
								  465951342);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_38_ + f_26_ * (float) i_41_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_39_ + f_27_ * (float) i_41_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_40_ + f_28_ * (float) i_41_);
			    aClass534_Sub40_Sub2_1673.method16506(i_34_,
								  743235741);
			    aClass534_Sub40_Sub2_1673.method16506(i_35_,
								  1517221648);
			    aClass534_Sub40_Sub2_1673.method16506(i_36_,
								  984332556);
			    aClass534_Sub40_Sub2_1673.method16506(i_37_,
								  853506571);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_38_ + f_20_ * (float) i_41_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_39_ + f_21_ * (float) i_41_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_40_ + f_22_ * (float) i_41_);
			    aClass534_Sub40_Sub2_1673.method16506(i_34_,
								  2142658694);
			    aClass534_Sub40_Sub2_1673.method16506(i_35_,
								  270911288);
			    aClass534_Sub40_Sub2_1673.method16506(i_36_,
								  1076632077);
			    aClass534_Sub40_Sub2_1673.method16506(i_37_,
								  1427270784);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_38_ + f_23_ * (float) i_41_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_39_ + f_24_ * (float) i_41_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_40_ + f_25_ * (float) i_41_);
			    aClass534_Sub40_Sub2_1673.method16506(i_34_,
								  1806119516);
			    aClass534_Sub40_Sub2_1673.method16506(i_35_,
								  1689639987);
			    aClass534_Sub40_Sub2_1673.method16506(i_36_,
								  1695120919);
			    aClass534_Sub40_Sub2_1673.method16506(i_37_,
								  2006950793);
			}
		    }
		    if (anIntArray1666[i_30_] > 64) {
			int i_42_ = anIntArray1666[i_30_] - 64 - 1;
			for (int i_43_ = anIntArray1679[i_42_] - 1; i_43_ >= 0;
			     i_43_--) {
			    Class536_Sub2_Sub1 class536_sub2_sub1
				= (aClass536_Sub2_Sub1ArrayArray1678[i_42_]
				   [i_43_]);
			    int i_44_ = class536_sub2_sub1.anInt11492;
			    byte i_45_ = (byte) (i_44_ >> 16);
			    byte i_46_ = (byte) (i_44_ >> 8);
			    byte i_47_ = (byte) i_44_;
			    byte i_48_ = (byte) (i_44_ >>> 24);
			    float f_49_
				= (float) (class536_sub2_sub1.anInt11491
					   >> 12);
			    float f_50_
				= (float) (class536_sub2_sub1.anInt11495
					   >> 12);
			    float f_51_
				= (float) (class536_sub2_sub1.anInt11496
					   >> 12);
			    int i_52_ = class536_sub2_sub1.anInt11497 >> 12;
			    if (class536_sub2_sub1.aShort11499 != 0) {
				class185_sub3.aClass433_9552.method6935
				    (class536_sub2_sub1.aShort11499, i_52_,
				     i_52_, 0.0F, 0.0F, 0.0F);
				class185_sub3.aClass433_9552
				    .method6839(class185_sub3.aClass433_9530);
				class185_sub3.aClass433_9552
				    .method6850(1.0F, 0.0F, 0.0F, fs);
				class185_sub3.aClass433_9552
				    .method6850(0.0F, 1.0F, 0.0F, fs_29_);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_49_ - fs[0] - fs_29_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_50_ - fs[1] - fs_29_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_51_ - fs[2] - fs_29_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_45_, 1825129272);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_46_, 1132326741);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_47_, 1382264353);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_48_, 625663413);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_49_ - fs[0] + fs_29_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_50_ - fs[1] + fs_29_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_51_ - fs[2] + fs_29_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_45_, 200112210);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_46_, 833375949);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_47_, 2071042930);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_48_, 1242946028);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_49_ + fs[0] + fs_29_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_50_ + fs[1] + fs_29_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_51_ + fs[2] + fs_29_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_45_, 1891866562);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_46_, 1563069574);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_47_, 1386445895);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_48_, 691478550);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_49_ + fs[0] - fs_29_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_50_ + fs[1] - fs_29_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_51_ + fs[2] - fs_29_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_45_, 1283869779);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_46_, 1773418892);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_47_, 1730051870);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_48_, 1492418959);
			    } else {
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_49_ + f_20_ * (float) -i_52_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_50_ + f_21_ * (float) -i_52_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_51_ + f_22_ * (float) -i_52_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_45_, 2028575364);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_46_, 736523541);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_47_, 1552339353);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_48_, 1800149704);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_49_ + f_26_ * (float) i_52_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_50_ + f_27_ * (float) i_52_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_51_ + f_28_ * (float) i_52_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_45_, 295556279);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_46_, 590577421);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_47_, 644498466);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_48_, 506936409);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_49_ + f_20_ * (float) i_52_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_50_ + f_21_ * (float) i_52_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_51_ + f_22_ * (float) i_52_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_45_, 647759801);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_46_, 431956101);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_47_, 1720551549);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_48_, 1187830443);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_49_ + f_23_ * (float) i_52_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_50_ + f_24_ * (float) i_52_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_51_ + f_25_ * (float) i_52_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_45_, 346180609);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_46_, 1226006383);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_47_, 441214630);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_48_, 208105575);
			    }
			}
		    }
		}
	    }
	} else {
	    for (int i_53_ = i - 1; i_53_ >= 0; i_53_--) {
		int i_54_
		    = anIntArray1666[i_53_] > 64 ? 64 : anIntArray1666[i_53_];
		if (i_54_ > 0) {
		    for (int i_55_ = i_54_ - 1; i_55_ >= 0; i_55_--) {
			Class536_Sub2_Sub1 class536_sub2_sub1
			    = aClass536_Sub2_Sub1ArrayArray1668[i_53_][i_55_];
			int i_56_ = class536_sub2_sub1.anInt11492;
			byte i_57_ = (byte) (i_56_ >> 16);
			byte i_58_ = (byte) (i_56_ >> 8);
			byte i_59_ = (byte) i_56_;
			byte i_60_ = (byte) (i_56_ >>> 24);
			float f_61_
			    = (float) (class536_sub2_sub1.anInt11491 >> 12);
			float f_62_
			    = (float) (class536_sub2_sub1.anInt11495 >> 12);
			float f_63_
			    = (float) (class536_sub2_sub1.anInt11496 >> 12);
			int i_64_ = class536_sub2_sub1.anInt11497 >> 12;
			if (class536_sub2_sub1.aShort11499 != 0) {
			    class185_sub3.aClass433_9552.method6935
				(class536_sub2_sub1.aShort11499, i_64_, i_64_,
				 0.0F, 0.0F, 0.0F);
			    class185_sub3.aClass433_9552
				.method6839(class185_sub3.aClass433_9530);
			    class185_sub3.aClass433_9552.method6850(1.0F, 0.0F,
								    0.0F, fs);
			    class185_sub3.aClass433_9552
				.method6850(0.0F, 1.0F, 0.0F, fs_29_);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_61_ - fs[0] - fs_29_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_62_ - fs[1] - fs_29_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_63_ - fs[2] - fs_29_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_57_,
								  1996446744);
			    aClass534_Sub40_Sub2_1673.method16506(i_58_,
								  711589690);
			    aClass534_Sub40_Sub2_1673.method16506(i_59_,
								  1699702967);
			    aClass534_Sub40_Sub2_1673.method16506(i_60_,
								  1949605168);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_61_ - fs[0] + fs_29_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_62_ - fs[1] + fs_29_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_63_ - fs[2] + fs_29_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_57_,
								  1352026891);
			    aClass534_Sub40_Sub2_1673.method16506(i_58_,
								  479112091);
			    aClass534_Sub40_Sub2_1673.method16506(i_59_,
								  2074683144);
			    aClass534_Sub40_Sub2_1673.method16506(i_60_,
								  915389159);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_61_ + fs[0] + fs_29_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_62_ + fs[1] + fs_29_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_63_ + fs[2] + fs_29_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_57_,
								  2106731811);
			    aClass534_Sub40_Sub2_1673.method16506(i_58_,
								  1521258561);
			    aClass534_Sub40_Sub2_1673.method16506(i_59_,
								  1514000022);
			    aClass534_Sub40_Sub2_1673.method16506(i_60_,
								  668010624);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_61_ + fs[0] - fs_29_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_62_ + fs[1] - fs_29_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_63_ + fs[2] - fs_29_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_57_,
								  968611989);
			    aClass534_Sub40_Sub2_1673.method16506(i_58_,
								  1277386557);
			    aClass534_Sub40_Sub2_1673.method16506(i_59_,
								  2129302212);
			    aClass534_Sub40_Sub2_1673.method16506(i_60_,
								  510022080);
			} else {
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_61_ + f_20_ * (float) -i_64_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_62_ + f_21_ * (float) -i_64_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_63_ + f_22_ * (float) -i_64_);
			    aClass534_Sub40_Sub2_1673.method16506(i_57_,
								  1796891534);
			    aClass534_Sub40_Sub2_1673.method16506(i_58_,
								  335953081);
			    aClass534_Sub40_Sub2_1673.method16506(i_59_,
								  853528970);
			    aClass534_Sub40_Sub2_1673.method16506(i_60_,
								  786063981);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_61_ + f_26_ * (float) i_64_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_62_ + f_27_ * (float) i_64_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_63_ + f_28_ * (float) i_64_);
			    aClass534_Sub40_Sub2_1673.method16506(i_57_,
								  1774503479);
			    aClass534_Sub40_Sub2_1673.method16506(i_58_,
								  235661932);
			    aClass534_Sub40_Sub2_1673.method16506(i_59_,
								  355133284);
			    aClass534_Sub40_Sub2_1673.method16506(i_60_,
								  1345415299);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_61_ + f_20_ * (float) i_64_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_62_ + f_21_ * (float) i_64_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_63_ + f_22_ * (float) i_64_);
			    aClass534_Sub40_Sub2_1673.method16506(i_57_,
								  809825153);
			    aClass534_Sub40_Sub2_1673.method16506(i_58_,
								  2088892081);
			    aClass534_Sub40_Sub2_1673.method16506(i_59_,
								  1708009527);
			    aClass534_Sub40_Sub2_1673.method16506(i_60_,
								  575773633);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_61_ + f_23_ * (float) i_64_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_62_ + f_24_ * (float) i_64_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_63_ + f_25_ * (float) i_64_);
			    aClass534_Sub40_Sub2_1673.method16506(i_57_,
								  1706031020);
			    aClass534_Sub40_Sub2_1673.method16506(i_58_,
								  484415804);
			    aClass534_Sub40_Sub2_1673.method16506(i_59_,
								  1967500249);
			    aClass534_Sub40_Sub2_1673.method16506(i_60_,
								  611532444);
			}
		    }
		    if (anIntArray1666[i_53_] > 64) {
			int i_65_ = anIntArray1666[i_53_] - 64 - 1;
			for (int i_66_ = anIntArray1679[i_65_] - 1; i_66_ >= 0;
			     i_66_--) {
			    Class536_Sub2_Sub1 class536_sub2_sub1
				= (aClass536_Sub2_Sub1ArrayArray1678[i_65_]
				   [i_66_]);
			    int i_67_ = class536_sub2_sub1.anInt11492;
			    byte i_68_ = (byte) (i_67_ >> 16);
			    byte i_69_ = (byte) (i_67_ >> 8);
			    byte i_70_ = (byte) i_67_;
			    byte i_71_ = (byte) (i_67_ >>> 24);
			    float f_72_
				= (float) (class536_sub2_sub1.anInt11491
					   >> 12);
			    float f_73_
				= (float) (class536_sub2_sub1.anInt11495
					   >> 12);
			    float f_74_
				= (float) (class536_sub2_sub1.anInt11496
					   >> 12);
			    int i_75_ = class536_sub2_sub1.anInt11497 >> 12;
			    if (class536_sub2_sub1.aShort11499 != 0) {
				class185_sub3.aClass433_9552.method6935
				    (class536_sub2_sub1.aShort11499, i_75_,
				     i_75_, 0.0F, 0.0F, 0.0F);
				class185_sub3.aClass433_9552
				    .method6839(class185_sub3.aClass433_9530);
				class185_sub3.aClass433_9552
				    .method6850(1.0F, 0.0F, 0.0F, fs);
				class185_sub3.aClass433_9552
				    .method6850(0.0F, 1.0F, 0.0F, fs_29_);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_72_ - fs[0] - fs_29_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_73_ - fs[1] - fs_29_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_74_ - fs[2] - fs_29_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_68_, 599809653);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_69_, 953063931);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_70_, 917446894);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_71_, 1630768597);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_72_ - fs[0] + fs_29_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_73_ - fs[1] + fs_29_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_74_ - fs[2] + fs_29_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_68_, 428065634);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_69_, 712418497);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_70_, 704708676);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_71_, 1458225809);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_72_ + fs[0] + fs_29_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_73_ + fs[1] + fs_29_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_74_ + fs[2] + fs_29_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_68_, 406690960);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_69_, 477437653);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_70_, 1259420415);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_71_, 1517422330);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_72_ + fs[0] - fs_29_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_73_ + fs[1] - fs_29_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_74_ + fs[2] - fs_29_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_68_, 1598579193);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_69_, 562193301);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_70_, 2062373667);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_71_, 1859377190);
			    } else {
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_72_ + f_20_ * (float) -i_75_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_73_ + f_21_ * (float) -i_75_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_74_ + f_22_ * (float) -i_75_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_68_, 1316215380);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_69_, 1094424901);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_70_, 1196327567);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_71_, 1729707226);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_72_ + f_26_ * (float) i_75_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_73_ + f_27_ * (float) i_75_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_74_ + f_28_ * (float) i_75_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_68_, 1333078215);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_69_, 1904820198);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_70_, 752744317);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_71_, 1479509672);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_72_ + f_20_ * (float) i_75_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_73_ + f_21_ * (float) i_75_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_74_ + f_22_ * (float) i_75_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_68_, 1960064363);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_69_, 804033579);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_70_, 772361202);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_71_, 1481075125);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_72_ + f_23_ * (float) i_75_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_73_ + f_24_ * (float) i_75_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_74_ + f_25_ * (float) i_75_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_68_, 974665551);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_69_, 1782354756);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_70_, 388753931);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_71_, 279236170);
			    }
			}
		    }
		}
	    }
	}
	if (aClass534_Sub40_Sub2_1673.anInt10811 * 31645619 != 0) {
	    anInterface15_1681.method95(24,
					(aClass534_Sub40_Sub2_1673
					 .aByteArray10810),
					(aClass534_Sub40_Sub2_1673.anInt10811
					 * 31645619));
	    class185_sub3.method15221(aClass129_1669, null, aClass129_1670,
				      aClass129_1671);
	    class185_sub3.method15274(7, 0,
				      (aClass534_Sub40_Sub2_1673.anInt10811
				       * 31645619 / 24));
	}
    }
    
    void method2460(Class185_Sub3 class185_sub3, int i) {
	OpenGL.glGetFloatv(2982, aFloatArray1675, 0);
	float f = aFloatArray1675[0];
	float f_76_ = aFloatArray1675[4];
	float f_77_ = aFloatArray1675[8];
	float f_78_ = aFloatArray1675[1];
	float f_79_ = aFloatArray1675[5];
	float f_80_ = aFloatArray1675[9];
	float f_81_ = f + f_78_;
	float f_82_ = f_76_ + f_79_;
	float f_83_ = f_77_ + f_80_;
	float f_84_ = f - f_78_;
	float f_85_ = f_76_ - f_79_;
	float f_86_ = f_77_ - f_80_;
	float f_87_ = f_78_ - f;
	float f_88_ = f_79_ - f_76_;
	float f_89_ = f_80_ - f_77_;
	float[] fs = new float[3];
	float[] fs_90_ = new float[3];
	class185_sub3.aClass433_9530.method6843(class185_sub3.aClass433_9604);
	aClass534_Sub40_Sub2_1673.anInt10811 = 0;
	if (class185_sub3.aBool9566) {
	    for (int i_91_ = i - 1; i_91_ >= 0; i_91_--) {
		int i_92_
		    = anIntArray1666[i_91_] > 64 ? 64 : anIntArray1666[i_91_];
		if (i_92_ > 0) {
		    for (int i_93_ = i_92_ - 1; i_93_ >= 0; i_93_--) {
			Class536_Sub2_Sub1 class536_sub2_sub1
			    = aClass536_Sub2_Sub1ArrayArray1668[i_91_][i_93_];
			int i_94_ = class536_sub2_sub1.anInt11492;
			byte i_95_ = (byte) (i_94_ >> 16);
			byte i_96_ = (byte) (i_94_ >> 8);
			byte i_97_ = (byte) i_94_;
			byte i_98_ = (byte) (i_94_ >>> 24);
			float f_99_
			    = (float) (class536_sub2_sub1.anInt11491 >> 12);
			float f_100_
			    = (float) (class536_sub2_sub1.anInt11495 >> 12);
			float f_101_
			    = (float) (class536_sub2_sub1.anInt11496 >> 12);
			int i_102_ = class536_sub2_sub1.anInt11497 >> 12;
			if (class536_sub2_sub1.aShort11499 != 0) {
			    class185_sub3.aClass433_9552.method6935
				(class536_sub2_sub1.aShort11499, i_102_,
				 i_102_, 0.0F, 0.0F, 0.0F);
			    class185_sub3.aClass433_9552
				.method6839(class185_sub3.aClass433_9530);
			    class185_sub3.aClass433_9552.method6850(1.0F, 0.0F,
								    0.0F, fs);
			    class185_sub3.aClass433_9552
				.method6850(0.0F, 1.0F, 0.0F, fs_90_);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_99_ - fs[0] - fs_90_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_100_ - fs[1] - fs_90_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_101_ - fs[2] - fs_90_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_95_,
								  1565152629);
			    aClass534_Sub40_Sub2_1673.method16506(i_96_,
								  553419685);
			    aClass534_Sub40_Sub2_1673.method16506(i_97_,
								  233109197);
			    aClass534_Sub40_Sub2_1673.method16506(i_98_,
								  398342497);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_99_ - fs[0] + fs_90_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_100_ - fs[1] + fs_90_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_101_ - fs[2] + fs_90_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_95_,
								  897538378);
			    aClass534_Sub40_Sub2_1673.method16506(i_96_,
								  1648521210);
			    aClass534_Sub40_Sub2_1673.method16506(i_97_,
								  1291828584);
			    aClass534_Sub40_Sub2_1673.method16506(i_98_,
								  1020995364);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_99_ + fs[0] + fs_90_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_100_ + fs[1] + fs_90_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_101_ + fs[2] + fs_90_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_95_,
								  1323252319);
			    aClass534_Sub40_Sub2_1673.method16506(i_96_,
								  1962716575);
			    aClass534_Sub40_Sub2_1673.method16506(i_97_,
								  466551751);
			    aClass534_Sub40_Sub2_1673.method16506(i_98_,
								  272225029);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_99_ + fs[0] - fs_90_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_100_ + fs[1] - fs_90_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_101_ + fs[2] - fs_90_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_95_,
								  194737834);
			    aClass534_Sub40_Sub2_1673.method16506(i_96_,
								  1553112401);
			    aClass534_Sub40_Sub2_1673.method16506(i_97_,
								  2040182261);
			    aClass534_Sub40_Sub2_1673.method16506(i_98_,
								  1753538576);
			} else {
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_99_ + f_81_ * (float) -i_102_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_100_ + f_82_ * (float) -i_102_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_101_ + f_83_ * (float) -i_102_);
			    aClass534_Sub40_Sub2_1673.method16506(i_95_,
								  642504553);
			    aClass534_Sub40_Sub2_1673.method16506(i_96_,
								  722051022);
			    aClass534_Sub40_Sub2_1673.method16506(i_97_,
								  994191396);
			    aClass534_Sub40_Sub2_1673.method16506(i_98_,
								  218900140);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_99_ + f_87_ * (float) i_102_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_100_ + f_88_ * (float) i_102_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_101_ + f_89_ * (float) i_102_);
			    aClass534_Sub40_Sub2_1673.method16506(i_95_,
								  1070590001);
			    aClass534_Sub40_Sub2_1673.method16506(i_96_,
								  1117362953);
			    aClass534_Sub40_Sub2_1673.method16506(i_97_,
								  757306344);
			    aClass534_Sub40_Sub2_1673.method16506(i_98_,
								  449423470);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_99_ + f_81_ * (float) i_102_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_100_ + f_82_ * (float) i_102_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_101_ + f_83_ * (float) i_102_);
			    aClass534_Sub40_Sub2_1673.method16506(i_95_,
								  1976523586);
			    aClass534_Sub40_Sub2_1673.method16506(i_96_,
								  1172726738);
			    aClass534_Sub40_Sub2_1673.method16506(i_97_,
								  784049440);
			    aClass534_Sub40_Sub2_1673.method16506(i_98_,
								  1158499355);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_99_ + f_84_ * (float) i_102_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_100_ + f_85_ * (float) i_102_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_101_ + f_86_ * (float) i_102_);
			    aClass534_Sub40_Sub2_1673.method16506(i_95_,
								  1607249012);
			    aClass534_Sub40_Sub2_1673.method16506(i_96_,
								  1319092201);
			    aClass534_Sub40_Sub2_1673.method16506(i_97_,
								  1290522141);
			    aClass534_Sub40_Sub2_1673.method16506(i_98_,
								  564153817);
			}
		    }
		    if (anIntArray1666[i_91_] > 64) {
			int i_103_ = anIntArray1666[i_91_] - 64 - 1;
			for (int i_104_ = anIntArray1679[i_103_] - 1;
			     i_104_ >= 0; i_104_--) {
			    Class536_Sub2_Sub1 class536_sub2_sub1
				= (aClass536_Sub2_Sub1ArrayArray1678[i_103_]
				   [i_104_]);
			    int i_105_ = class536_sub2_sub1.anInt11492;
			    byte i_106_ = (byte) (i_105_ >> 16);
			    byte i_107_ = (byte) (i_105_ >> 8);
			    byte i_108_ = (byte) i_105_;
			    byte i_109_ = (byte) (i_105_ >>> 24);
			    float f_110_
				= (float) (class536_sub2_sub1.anInt11491
					   >> 12);
			    float f_111_
				= (float) (class536_sub2_sub1.anInt11495
					   >> 12);
			    float f_112_
				= (float) (class536_sub2_sub1.anInt11496
					   >> 12);
			    int i_113_ = class536_sub2_sub1.anInt11497 >> 12;
			    if (class536_sub2_sub1.aShort11499 != 0) {
				class185_sub3.aClass433_9552.method6935
				    (class536_sub2_sub1.aShort11499, i_113_,
				     i_113_, 0.0F, 0.0F, 0.0F);
				class185_sub3.aClass433_9552
				    .method6839(class185_sub3.aClass433_9530);
				class185_sub3.aClass433_9552
				    .method6850(1.0F, 0.0F, 0.0F, fs);
				class185_sub3.aClass433_9552
				    .method6850(0.0F, 1.0F, 0.0F, fs_90_);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_110_ - fs[0] - fs_90_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_111_ - fs[1] - fs_90_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_112_ - fs[2] - fs_90_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_106_, 680310080);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_107_, 221134540);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_108_, 1354736615);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_109_, 1399458864);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_110_ - fs[0] + fs_90_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_111_ - fs[1] + fs_90_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_112_ - fs[2] + fs_90_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_106_, 1652840842);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_107_, 1862367289);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_108_, 246058517);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_109_, 1795890817);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_110_ + fs[0] + fs_90_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_111_ + fs[1] + fs_90_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_112_ + fs[2] + fs_90_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_106_, 1874560812);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_107_, 1015888129);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_108_, 477809999);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_109_, 1448412246);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_110_ + fs[0] - fs_90_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_111_ + fs[1] - fs_90_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_112_ + fs[2] - fs_90_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_106_, 1021550573);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_107_, 2115807047);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_108_, 1985676556);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_109_, 1631941772);
			    } else {
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_110_ + f_81_ * (float) -i_113_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_111_ + f_82_ * (float) -i_113_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_112_ + f_83_ * (float) -i_113_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_106_, 514736419);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_107_, 956728252);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_108_, 1560182446);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_109_, 531971543);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_110_ + f_87_ * (float) i_113_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_111_ + f_88_ * (float) i_113_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_112_ + f_89_ * (float) i_113_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_106_, 216921179);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_107_, 948506464);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_108_, 1214948605);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_109_, 1161476988);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_110_ + f_81_ * (float) i_113_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_111_ + f_82_ * (float) i_113_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_112_ + f_83_ * (float) i_113_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_106_, 961089740);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_107_, 1811755881);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_108_, 1293803276);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_109_, 699451711);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_110_ + f_84_ * (float) i_113_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_111_ + f_85_ * (float) i_113_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_112_ + f_86_ * (float) i_113_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_106_, 390597357);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_107_, 1107454057);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_108_, 1451719986);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_109_, 717561460);
			    }
			}
		    }
		}
	    }
	} else {
	    for (int i_114_ = i - 1; i_114_ >= 0; i_114_--) {
		int i_115_ = (anIntArray1666[i_114_] > 64 ? 64
			      : anIntArray1666[i_114_]);
		if (i_115_ > 0) {
		    for (int i_116_ = i_115_ - 1; i_116_ >= 0; i_116_--) {
			Class536_Sub2_Sub1 class536_sub2_sub1
			    = (aClass536_Sub2_Sub1ArrayArray1668[i_114_]
			       [i_116_]);
			int i_117_ = class536_sub2_sub1.anInt11492;
			byte i_118_ = (byte) (i_117_ >> 16);
			byte i_119_ = (byte) (i_117_ >> 8);
			byte i_120_ = (byte) i_117_;
			byte i_121_ = (byte) (i_117_ >>> 24);
			float f_122_
			    = (float) (class536_sub2_sub1.anInt11491 >> 12);
			float f_123_
			    = (float) (class536_sub2_sub1.anInt11495 >> 12);
			float f_124_
			    = (float) (class536_sub2_sub1.anInt11496 >> 12);
			int i_125_ = class536_sub2_sub1.anInt11497 >> 12;
			if (class536_sub2_sub1.aShort11499 != 0) {
			    class185_sub3.aClass433_9552.method6935
				(class536_sub2_sub1.aShort11499, i_125_,
				 i_125_, 0.0F, 0.0F, 0.0F);
			    class185_sub3.aClass433_9552
				.method6839(class185_sub3.aClass433_9530);
			    class185_sub3.aClass433_9552.method6850(1.0F, 0.0F,
								    0.0F, fs);
			    class185_sub3.aClass433_9552
				.method6850(0.0F, 1.0F, 0.0F, fs_90_);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_122_ - fs[0] - fs_90_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_123_ - fs[1] - fs_90_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_124_ - fs[2] - fs_90_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_118_,
								  1062398677);
			    aClass534_Sub40_Sub2_1673.method16506(i_119_,
								  1511935963);
			    aClass534_Sub40_Sub2_1673.method16506(i_120_,
								  1439648194);
			    aClass534_Sub40_Sub2_1673.method16506(i_121_,
								  1359335373);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_122_ - fs[0] + fs_90_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_123_ - fs[1] + fs_90_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_124_ - fs[2] + fs_90_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_118_,
								  1712647968);
			    aClass534_Sub40_Sub2_1673.method16506(i_119_,
								  619652011);
			    aClass534_Sub40_Sub2_1673.method16506(i_120_,
								  177662001);
			    aClass534_Sub40_Sub2_1673.method16506(i_121_,
								  971166224);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_122_ + fs[0] + fs_90_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_123_ + fs[1] + fs_90_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_124_ + fs[2] + fs_90_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_118_,
								  295086450);
			    aClass534_Sub40_Sub2_1673.method16506(i_119_,
								  616032000);
			    aClass534_Sub40_Sub2_1673.method16506(i_120_,
								  434317515);
			    aClass534_Sub40_Sub2_1673.method16506(i_121_,
								  1104092961);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_122_ + fs[0] - fs_90_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_123_ + fs[1] - fs_90_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_124_ + fs[2] - fs_90_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_118_,
								  1793500381);
			    aClass534_Sub40_Sub2_1673.method16506(i_119_,
								  1501810590);
			    aClass534_Sub40_Sub2_1673.method16506(i_120_,
								  2062524851);
			    aClass534_Sub40_Sub2_1673.method16506(i_121_,
								  1939166393);
			} else {
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_122_ + f_81_ * (float) -i_125_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_123_ + f_82_ * (float) -i_125_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_124_ + f_83_ * (float) -i_125_);
			    aClass534_Sub40_Sub2_1673.method16506(i_118_,
								  1320673402);
			    aClass534_Sub40_Sub2_1673.method16506(i_119_,
								  1740552909);
			    aClass534_Sub40_Sub2_1673.method16506(i_120_,
								  1816240742);
			    aClass534_Sub40_Sub2_1673.method16506(i_121_,
								  517314879);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_122_ + f_87_ * (float) i_125_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_123_ + f_88_ * (float) i_125_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_124_ + f_89_ * (float) i_125_);
			    aClass534_Sub40_Sub2_1673.method16506(i_118_,
								  232540324);
			    aClass534_Sub40_Sub2_1673.method16506(i_119_,
								  1506307600);
			    aClass534_Sub40_Sub2_1673.method16506(i_120_,
								  1905158362);
			    aClass534_Sub40_Sub2_1673.method16506(i_121_,
								  745591259);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_122_ + f_81_ * (float) i_125_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_123_ + f_82_ * (float) i_125_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_124_ + f_83_ * (float) i_125_);
			    aClass534_Sub40_Sub2_1673.method16506(i_118_,
								  441843237);
			    aClass534_Sub40_Sub2_1673.method16506(i_119_,
								  453272771);
			    aClass534_Sub40_Sub2_1673.method16506(i_120_,
								  2058705742);
			    aClass534_Sub40_Sub2_1673.method16506(i_121_,
								  2121010997);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_122_ + f_84_ * (float) i_125_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_123_ + f_85_ * (float) i_125_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_124_ + f_86_ * (float) i_125_);
			    aClass534_Sub40_Sub2_1673.method16506(i_118_,
								  2063370544);
			    aClass534_Sub40_Sub2_1673.method16506(i_119_,
								  2142963752);
			    aClass534_Sub40_Sub2_1673.method16506(i_120_,
								  1637589562);
			    aClass534_Sub40_Sub2_1673.method16506(i_121_,
								  1294892452);
			}
		    }
		    if (anIntArray1666[i_114_] > 64) {
			int i_126_ = anIntArray1666[i_114_] - 64 - 1;
			for (int i_127_ = anIntArray1679[i_126_] - 1;
			     i_127_ >= 0; i_127_--) {
			    Class536_Sub2_Sub1 class536_sub2_sub1
				= (aClass536_Sub2_Sub1ArrayArray1678[i_126_]
				   [i_127_]);
			    int i_128_ = class536_sub2_sub1.anInt11492;
			    byte i_129_ = (byte) (i_128_ >> 16);
			    byte i_130_ = (byte) (i_128_ >> 8);
			    byte i_131_ = (byte) i_128_;
			    byte i_132_ = (byte) (i_128_ >>> 24);
			    float f_133_
				= (float) (class536_sub2_sub1.anInt11491
					   >> 12);
			    float f_134_
				= (float) (class536_sub2_sub1.anInt11495
					   >> 12);
			    float f_135_
				= (float) (class536_sub2_sub1.anInt11496
					   >> 12);
			    int i_136_ = class536_sub2_sub1.anInt11497 >> 12;
			    if (class536_sub2_sub1.aShort11499 != 0) {
				class185_sub3.aClass433_9552.method6935
				    (class536_sub2_sub1.aShort11499, i_136_,
				     i_136_, 0.0F, 0.0F, 0.0F);
				class185_sub3.aClass433_9552
				    .method6839(class185_sub3.aClass433_9530);
				class185_sub3.aClass433_9552
				    .method6850(1.0F, 0.0F, 0.0F, fs);
				class185_sub3.aClass433_9552
				    .method6850(0.0F, 1.0F, 0.0F, fs_90_);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_133_ - fs[0] - fs_90_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_134_ - fs[1] - fs_90_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_135_ - fs[2] - fs_90_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_129_, 381467381);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_130_, 2101824690);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_131_, 1705631633);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_132_, 2142593844);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_133_ - fs[0] + fs_90_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_134_ - fs[1] + fs_90_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_135_ - fs[2] + fs_90_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_129_, 1531781556);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_130_, 1662005080);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_131_, 2050665123);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_132_, 230776087);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_133_ + fs[0] + fs_90_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_134_ + fs[1] + fs_90_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_135_ + fs[2] + fs_90_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_129_, 456910769);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_130_, 985649448);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_131_, 1411743062);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_132_, 811761373);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_133_ + fs[0] - fs_90_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_134_ + fs[1] - fs_90_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_135_ + fs[2] - fs_90_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_129_, 1066708485);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_130_, 1309963200);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_131_, 1064067282);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_132_, 776205008);
			    } else {
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_133_ + f_81_ * (float) -i_136_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_134_ + f_82_ * (float) -i_136_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_135_ + f_83_ * (float) -i_136_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_129_, 530642702);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_130_, 692999944);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_131_, 2144064923);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_132_, 1227795100);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_133_ + f_87_ * (float) i_136_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_134_ + f_88_ * (float) i_136_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_135_ + f_89_ * (float) i_136_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_129_, 558906747);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_130_, 442804243);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_131_, 1289491800);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_132_, 2073596803);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_133_ + f_81_ * (float) i_136_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_134_ + f_82_ * (float) i_136_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_135_ + f_83_ * (float) i_136_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_129_, 419595870);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_130_, 1170122486);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_131_, 1698755348);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_132_, 839609595);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_133_ + f_84_ * (float) i_136_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_134_ + f_85_ * (float) i_136_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_135_ + f_86_ * (float) i_136_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_129_, 966460412);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_130_, 1909117590);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_131_, 561755956);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_132_, 837423849);
			    }
			}
		    }
		}
	    }
	}
	if (aClass534_Sub40_Sub2_1673.anInt10811 * 31645619 != 0) {
	    anInterface15_1681.method95(24,
					(aClass534_Sub40_Sub2_1673
					 .aByteArray10810),
					(aClass534_Sub40_Sub2_1673.anInt10811
					 * 31645619));
	    class185_sub3.method15221(aClass129_1669, null, aClass129_1670,
				      aClass129_1671);
	    class185_sub3.method15274(7, 0,
				      (aClass534_Sub40_Sub2_1673.anInt10811
				       * 31645619 / 24));
	}
    }
    
    void method2461(Class185_Sub3 class185_sub3) {
	aFloat1683 = class185_sub3.aFloat9646;
	class185_sub3.method15226();
	OpenGL.glDisable(16384);
	OpenGL.glDisable(16385);
	class185_sub3.method15193(false);
	OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }
    
    void method2462(Class185_Sub3 class185_sub3) {
	anInterface15_1681 = class185_sub3.method15218(24, null, 196584, true);
	aClass129_1671 = new Class129(anInterface15_1681, 5126, 2, 0);
	aClass129_1669 = new Class129(anInterface15_1681, 5126, 3, 8);
	aClass129_1670 = new Class129(anInterface15_1681, 5121, 4, 20);
    }
    
    void method2463(Class185_Sub3 class185_sub3, Class174 class174) {
	if (class185_sub3.aClass433_9533 != null) {
	    method2465(class185_sub3);
	    float f = class185_sub3.aClass433_9533.aFloatArray4853[2];
	    float f_137_ = class185_sub3.aClass433_9533.aFloatArray4853[6];
	    float f_138_ = class185_sub3.aClass433_9533.aFloatArray4853[10];
	    float f_139_ = class185_sub3.aClass433_9533.aFloatArray4853[14];
	    try {
		int i = 0;
		int i_140_ = 2147483647;
		int i_141_ = 0;
		Class536_Sub2 class536_sub2
		    = class174.aClass701_1837.aClass536_Sub2_8809;
		for (Class536_Sub2 class536_sub2_142_
			 = class536_sub2.aClass536_Sub2_10349;
		     class536_sub2_142_ != class536_sub2;
		     class536_sub2_142_
			 = class536_sub2_142_.aClass536_Sub2_10349) {
		    Class536_Sub2_Sub1 class536_sub2_sub1
			= (Class536_Sub2_Sub1) class536_sub2_142_;
		    int i_143_
			= (int) (f * (float) (class536_sub2_sub1.anInt11491
					      >> 12)
				 + (f_137_
				    * (float) (class536_sub2_sub1.anInt11495
					       >> 12))
				 + (f_138_
				    * (float) (class536_sub2_sub1.anInt11496
					       >> 12))
				 + f_139_);
		    if (i_143_ > i_141_)
			i_141_ = i_143_;
		    if (i_143_ < i_140_)
			i_140_ = i_143_;
		    anIntArray1677[i++] = i_143_;
		}
		int i_144_ = i_141_ - i_140_;
		int i_145_;
		if (i_144_ + 2 > 1600) {
		    i_145_ = (1 + Class695.method14072(i_144_, (byte) 99)
			      - anInt1676);
		    i_144_ = (i_144_ >> i_145_) + 2;
		} else {
		    i_145_ = 0;
		    i_144_ += 2;
		}
		Class536_Sub2 class536_sub2_146_
		    = class536_sub2.aClass536_Sub2_10349;
		i = 0;
		int i_147_ = -2;
		boolean bool = true;
		boolean bool_148_ = true;
		while (class536_sub2_146_ != class536_sub2) {
		    anInt1682 = 0;
		    for (int i_149_ = 0; i_149_ < i_144_; i_149_++)
			anIntArray1666[i_149_] = 0;
		    for (int i_150_ = 0; i_150_ < 64; i_150_++)
			anIntArray1679[i_150_] = 0;
		    for (/**/; class536_sub2_146_ != class536_sub2;
			 class536_sub2_146_
			     = class536_sub2_146_.aClass536_Sub2_10349) {
			Class536_Sub2_Sub1 class536_sub2_sub1
			    = (Class536_Sub2_Sub1) class536_sub2_146_;
			if (bool_148_) {
			    i_147_ = class536_sub2_sub1.anInt11498;
			    bool = class536_sub2_sub1.aBool11494;
			    bool_148_ = false;
			}
			if (i > 0
			    && (i_147_ != class536_sub2_sub1.anInt11498
				|| bool != class536_sub2_sub1.aBool11494)) {
			    bool_148_ = true;
			    break;
			}
			int i_151_ = anIntArray1677[i++] - i_140_ >> i_145_;
			if (i_151_ < 1600) {
			    if (anIntArray1666[i_151_] < 64)
				aClass536_Sub2_Sub1ArrayArray1668[i_151_]
				    [anIntArray1666[i_151_]++]
				    = class536_sub2_sub1;
			    else {
				if (anIntArray1666[i_151_] == 64) {
				    if (anInt1682 == 64)
					continue;
				    anIntArray1666[i_151_] += 1 + anInt1682++;
				}
				aClass536_Sub2_Sub1ArrayArray1678
				    [anIntArray1666[i_151_] - 64 - 1]
				    [anIntArray1679[(anIntArray1666[i_151_]
						     - 64 - 1)]++]
				    = class536_sub2_sub1;
			    }
			}
		    }
		    if (i_147_ >= 0)
			class185_sub3.method15227(i_147_);
		    else
			class185_sub3.method15227(-1);
		    if (bool && class185_sub3.aFloat9646 != aFloat1683)
			class185_sub3.method3489(aFloat1683);
		    else if (class185_sub3.aFloat9646 != 1.0F)
			class185_sub3.method3489(1.0F);
		    method2459(class185_sub3, i_144_);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    method2475(class185_sub3);
	}
    }
    
    void method2464(Class185_Sub3 class185_sub3, Class174 class174) {
	if (class185_sub3.aClass433_9533 != null) {
	    method2465(class185_sub3);
	    float f = class185_sub3.aClass433_9533.aFloatArray4853[2];
	    float f_152_ = class185_sub3.aClass433_9533.aFloatArray4853[6];
	    float f_153_ = class185_sub3.aClass433_9533.aFloatArray4853[10];
	    float f_154_ = class185_sub3.aClass433_9533.aFloatArray4853[14];
	    try {
		int i = 0;
		int i_155_ = 2147483647;
		int i_156_ = 0;
		Class536_Sub2 class536_sub2
		    = class174.aClass701_1837.aClass536_Sub2_8809;
		for (Class536_Sub2 class536_sub2_157_
			 = class536_sub2.aClass536_Sub2_10349;
		     class536_sub2_157_ != class536_sub2;
		     class536_sub2_157_
			 = class536_sub2_157_.aClass536_Sub2_10349) {
		    Class536_Sub2_Sub1 class536_sub2_sub1
			= (Class536_Sub2_Sub1) class536_sub2_157_;
		    int i_158_
			= (int) (f * (float) (class536_sub2_sub1.anInt11491
					      >> 12)
				 + (f_152_
				    * (float) (class536_sub2_sub1.anInt11495
					       >> 12))
				 + (f_153_
				    * (float) (class536_sub2_sub1.anInt11496
					       >> 12))
				 + f_154_);
		    if (i_158_ > i_156_)
			i_156_ = i_158_;
		    if (i_158_ < i_155_)
			i_155_ = i_158_;
		    anIntArray1677[i++] = i_158_;
		}
		int i_159_ = i_156_ - i_155_;
		int i_160_;
		if (i_159_ + 2 > 1600) {
		    i_160_ = (1 + Class695.method14072(i_159_, (byte) -2)
			      - anInt1676);
		    i_159_ = (i_159_ >> i_160_) + 2;
		} else {
		    i_160_ = 0;
		    i_159_ += 2;
		}
		Class536_Sub2 class536_sub2_161_
		    = class536_sub2.aClass536_Sub2_10349;
		i = 0;
		int i_162_ = -2;
		boolean bool = true;
		boolean bool_163_ = true;
		while (class536_sub2_161_ != class536_sub2) {
		    anInt1682 = 0;
		    for (int i_164_ = 0; i_164_ < i_159_; i_164_++)
			anIntArray1666[i_164_] = 0;
		    for (int i_165_ = 0; i_165_ < 64; i_165_++)
			anIntArray1679[i_165_] = 0;
		    for (/**/; class536_sub2_161_ != class536_sub2;
			 class536_sub2_161_
			     = class536_sub2_161_.aClass536_Sub2_10349) {
			Class536_Sub2_Sub1 class536_sub2_sub1
			    = (Class536_Sub2_Sub1) class536_sub2_161_;
			if (bool_163_) {
			    i_162_ = class536_sub2_sub1.anInt11498;
			    bool = class536_sub2_sub1.aBool11494;
			    bool_163_ = false;
			}
			if (i > 0
			    && (i_162_ != class536_sub2_sub1.anInt11498
				|| bool != class536_sub2_sub1.aBool11494)) {
			    bool_163_ = true;
			    break;
			}
			int i_166_ = anIntArray1677[i++] - i_155_ >> i_160_;
			if (i_166_ < 1600) {
			    if (anIntArray1666[i_166_] < 64)
				aClass536_Sub2_Sub1ArrayArray1668[i_166_]
				    [anIntArray1666[i_166_]++]
				    = class536_sub2_sub1;
			    else {
				if (anIntArray1666[i_166_] == 64) {
				    if (anInt1682 == 64)
					continue;
				    anIntArray1666[i_166_] += 1 + anInt1682++;
				}
				aClass536_Sub2_Sub1ArrayArray1678
				    [anIntArray1666[i_166_] - 64 - 1]
				    [anIntArray1679[(anIntArray1666[i_166_]
						     - 64 - 1)]++]
				    = class536_sub2_sub1;
			    }
			}
		    }
		    if (i_162_ >= 0)
			class185_sub3.method15227(i_162_);
		    else
			class185_sub3.method15227(-1);
		    if (bool && class185_sub3.aFloat9646 != aFloat1683)
			class185_sub3.method3489(aFloat1683);
		    else if (class185_sub3.aFloat9646 != 1.0F)
			class185_sub3.method3489(1.0F);
		    method2459(class185_sub3, i_159_);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    method2475(class185_sub3);
	}
    }
    
    void method2465(Class185_Sub3 class185_sub3) {
	aFloat1683 = class185_sub3.aFloat9646;
	class185_sub3.method15226();
	OpenGL.glDisable(16384);
	OpenGL.glDisable(16385);
	class185_sub3.method15193(false);
	OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }
    
    void method2466(Class185_Sub3 class185_sub3) {
	anInterface15_1681 = class185_sub3.method15218(24, null, 196584, true);
	aClass129_1671 = new Class129(anInterface15_1681, 5126, 2, 0);
	aClass129_1669 = new Class129(anInterface15_1681, 5126, 3, 8);
	aClass129_1670 = new Class129(anInterface15_1681, 5121, 4, 20);
    }
    
    void method2467(Class185_Sub3 class185_sub3, int i) {
	OpenGL.glGetFloatv(2982, aFloatArray1675, 0);
	float f = aFloatArray1675[0];
	float f_167_ = aFloatArray1675[4];
	float f_168_ = aFloatArray1675[8];
	float f_169_ = aFloatArray1675[1];
	float f_170_ = aFloatArray1675[5];
	float f_171_ = aFloatArray1675[9];
	float f_172_ = f + f_169_;
	float f_173_ = f_167_ + f_170_;
	float f_174_ = f_168_ + f_171_;
	float f_175_ = f - f_169_;
	float f_176_ = f_167_ - f_170_;
	float f_177_ = f_168_ - f_171_;
	float f_178_ = f_169_ - f;
	float f_179_ = f_170_ - f_167_;
	float f_180_ = f_171_ - f_168_;
	float[] fs = new float[3];
	float[] fs_181_ = new float[3];
	class185_sub3.aClass433_9530.method6843(class185_sub3.aClass433_9604);
	aClass534_Sub40_Sub2_1673.anInt10811 = 0;
	if (class185_sub3.aBool9566) {
	    for (int i_182_ = i - 1; i_182_ >= 0; i_182_--) {
		int i_183_ = (anIntArray1666[i_182_] > 64 ? 64
			      : anIntArray1666[i_182_]);
		if (i_183_ > 0) {
		    for (int i_184_ = i_183_ - 1; i_184_ >= 0; i_184_--) {
			Class536_Sub2_Sub1 class536_sub2_sub1
			    = (aClass536_Sub2_Sub1ArrayArray1668[i_182_]
			       [i_184_]);
			int i_185_ = class536_sub2_sub1.anInt11492;
			byte i_186_ = (byte) (i_185_ >> 16);
			byte i_187_ = (byte) (i_185_ >> 8);
			byte i_188_ = (byte) i_185_;
			byte i_189_ = (byte) (i_185_ >>> 24);
			float f_190_
			    = (float) (class536_sub2_sub1.anInt11491 >> 12);
			float f_191_
			    = (float) (class536_sub2_sub1.anInt11495 >> 12);
			float f_192_
			    = (float) (class536_sub2_sub1.anInt11496 >> 12);
			int i_193_ = class536_sub2_sub1.anInt11497 >> 12;
			if (class536_sub2_sub1.aShort11499 != 0) {
			    class185_sub3.aClass433_9552.method6935
				(class536_sub2_sub1.aShort11499, i_193_,
				 i_193_, 0.0F, 0.0F, 0.0F);
			    class185_sub3.aClass433_9552
				.method6839(class185_sub3.aClass433_9530);
			    class185_sub3.aClass433_9552.method6850(1.0F, 0.0F,
								    0.0F, fs);
			    class185_sub3.aClass433_9552
				.method6850(0.0F, 1.0F, 0.0F, fs_181_);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_190_ - fs[0] - fs_181_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_191_ - fs[1] - fs_181_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_192_ - fs[2] - fs_181_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_186_,
								  1539855864);
			    aClass534_Sub40_Sub2_1673.method16506(i_187_,
								  2112694393);
			    aClass534_Sub40_Sub2_1673.method16506(i_188_,
								  538059407);
			    aClass534_Sub40_Sub2_1673.method16506(i_189_,
								  1579680301);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_190_ - fs[0] + fs_181_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_191_ - fs[1] + fs_181_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_192_ - fs[2] + fs_181_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_186_,
								  1952342493);
			    aClass534_Sub40_Sub2_1673.method16506(i_187_,
								  894592413);
			    aClass534_Sub40_Sub2_1673.method16506(i_188_,
								  282343373);
			    aClass534_Sub40_Sub2_1673.method16506(i_189_,
								  539970934);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_190_ + fs[0] + fs_181_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_191_ + fs[1] + fs_181_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_192_ + fs[2] + fs_181_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_186_,
								  727596087);
			    aClass534_Sub40_Sub2_1673.method16506(i_187_,
								  1057440824);
			    aClass534_Sub40_Sub2_1673.method16506(i_188_,
								  439845236);
			    aClass534_Sub40_Sub2_1673.method16506(i_189_,
								  1732520853);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_190_ + fs[0] - fs_181_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_191_ + fs[1] - fs_181_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_192_ + fs[2] - fs_181_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_186_,
								  2107665982);
			    aClass534_Sub40_Sub2_1673.method16506(i_187_,
								  750569522);
			    aClass534_Sub40_Sub2_1673.method16506(i_188_,
								  891067359);
			    aClass534_Sub40_Sub2_1673.method16506(i_189_,
								  827669645);
			} else {
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673.method18397
				(f_190_ + f_172_ * (float) -i_193_);
			    aClass534_Sub40_Sub2_1673.method18397
				(f_191_ + f_173_ * (float) -i_193_);
			    aClass534_Sub40_Sub2_1673.method18397
				(f_192_ + f_174_ * (float) -i_193_);
			    aClass534_Sub40_Sub2_1673.method16506(i_186_,
								  1343445142);
			    aClass534_Sub40_Sub2_1673.method16506(i_187_,
								  1656983664);
			    aClass534_Sub40_Sub2_1673.method16506(i_188_,
								  191395867);
			    aClass534_Sub40_Sub2_1673.method16506(i_189_,
								  741414303);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_190_ + f_178_ * (float) i_193_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_191_ + f_179_ * (float) i_193_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_192_ + f_180_ * (float) i_193_);
			    aClass534_Sub40_Sub2_1673.method16506(i_186_,
								  1535933228);
			    aClass534_Sub40_Sub2_1673.method16506(i_187_,
								  549251824);
			    aClass534_Sub40_Sub2_1673.method16506(i_188_,
								  1094970804);
			    aClass534_Sub40_Sub2_1673.method16506(i_189_,
								  474944099);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_190_ + f_172_ * (float) i_193_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_191_ + f_173_ * (float) i_193_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_192_ + f_174_ * (float) i_193_);
			    aClass534_Sub40_Sub2_1673.method16506(i_186_,
								  291079482);
			    aClass534_Sub40_Sub2_1673.method16506(i_187_,
								  1068001414);
			    aClass534_Sub40_Sub2_1673.method16506(i_188_,
								  1165338634);
			    aClass534_Sub40_Sub2_1673.method16506(i_189_,
								  1662022769);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_190_ + f_175_ * (float) i_193_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_191_ + f_176_ * (float) i_193_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_192_ + f_177_ * (float) i_193_);
			    aClass534_Sub40_Sub2_1673.method16506(i_186_,
								  856288025);
			    aClass534_Sub40_Sub2_1673.method16506(i_187_,
								  1404401514);
			    aClass534_Sub40_Sub2_1673.method16506(i_188_,
								  400904472);
			    aClass534_Sub40_Sub2_1673.method16506(i_189_,
								  2115757832);
			}
		    }
		    if (anIntArray1666[i_182_] > 64) {
			int i_194_ = anIntArray1666[i_182_] - 64 - 1;
			for (int i_195_ = anIntArray1679[i_194_] - 1;
			     i_195_ >= 0; i_195_--) {
			    Class536_Sub2_Sub1 class536_sub2_sub1
				= (aClass536_Sub2_Sub1ArrayArray1678[i_194_]
				   [i_195_]);
			    int i_196_ = class536_sub2_sub1.anInt11492;
			    byte i_197_ = (byte) (i_196_ >> 16);
			    byte i_198_ = (byte) (i_196_ >> 8);
			    byte i_199_ = (byte) i_196_;
			    byte i_200_ = (byte) (i_196_ >>> 24);
			    float f_201_
				= (float) (class536_sub2_sub1.anInt11491
					   >> 12);
			    float f_202_
				= (float) (class536_sub2_sub1.anInt11495
					   >> 12);
			    float f_203_
				= (float) (class536_sub2_sub1.anInt11496
					   >> 12);
			    int i_204_ = class536_sub2_sub1.anInt11497 >> 12;
			    if (class536_sub2_sub1.aShort11499 != 0) {
				class185_sub3.aClass433_9552.method6935
				    (class536_sub2_sub1.aShort11499, i_204_,
				     i_204_, 0.0F, 0.0F, 0.0F);
				class185_sub3.aClass433_9552
				    .method6839(class185_sub3.aClass433_9530);
				class185_sub3.aClass433_9552
				    .method6850(1.0F, 0.0F, 0.0F, fs);
				class185_sub3.aClass433_9552
				    .method6850(0.0F, 1.0F, 0.0F, fs_181_);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_201_ - fs[0] - fs_181_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_202_ - fs[1] - fs_181_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_203_ - fs[2] - fs_181_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_197_, 1319394899);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_198_, 1600466724);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_199_, 480953389);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_200_, 836485158);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_201_ - fs[0] + fs_181_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_202_ - fs[1] + fs_181_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_203_ - fs[2] + fs_181_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_197_, 942481684);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_198_, 396833686);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_199_, 1924148218);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_200_, 299687771);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_201_ + fs[0] + fs_181_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_202_ + fs[1] + fs_181_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_203_ + fs[2] + fs_181_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_197_, 1653993964);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_198_, 1769250534);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_199_, 1965378684);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_200_, 1307710400);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_201_ + fs[0] - fs_181_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_202_ + fs[1] - fs_181_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_203_ + fs[2] - fs_181_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_197_, 1812082124);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_198_, 794693117);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_199_, 663270040);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_200_, 1867998870);
			    } else {
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_201_ + f_172_ * (float) -i_204_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_202_ + f_173_ * (float) -i_204_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_203_ + f_174_ * (float) -i_204_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_197_, 1706200342);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_198_, 1839064299);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_199_, 2140520847);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_200_, 944649440);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_201_ + f_178_ * (float) i_204_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_202_ + f_179_ * (float) i_204_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_203_ + f_180_ * (float) i_204_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_197_, 835824717);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_198_, 228202491);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_199_, 1210529519);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_200_, 2057116822);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_201_ + f_172_ * (float) i_204_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_202_ + f_173_ * (float) i_204_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_203_ + f_174_ * (float) i_204_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_197_, 1801964284);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_198_, 678981861);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_199_, 552163922);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_200_, 714400314);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_201_ + f_175_ * (float) i_204_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_202_ + f_176_ * (float) i_204_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_203_ + f_177_ * (float) i_204_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_197_, 777178330);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_198_, 1885152761);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_199_, 1121314271);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_200_, 448585224);
			    }
			}
		    }
		}
	    }
	} else {
	    for (int i_205_ = i - 1; i_205_ >= 0; i_205_--) {
		int i_206_ = (anIntArray1666[i_205_] > 64 ? 64
			      : anIntArray1666[i_205_]);
		if (i_206_ > 0) {
		    for (int i_207_ = i_206_ - 1; i_207_ >= 0; i_207_--) {
			Class536_Sub2_Sub1 class536_sub2_sub1
			    = (aClass536_Sub2_Sub1ArrayArray1668[i_205_]
			       [i_207_]);
			int i_208_ = class536_sub2_sub1.anInt11492;
			byte i_209_ = (byte) (i_208_ >> 16);
			byte i_210_ = (byte) (i_208_ >> 8);
			byte i_211_ = (byte) i_208_;
			byte i_212_ = (byte) (i_208_ >>> 24);
			float f_213_
			    = (float) (class536_sub2_sub1.anInt11491 >> 12);
			float f_214_
			    = (float) (class536_sub2_sub1.anInt11495 >> 12);
			float f_215_
			    = (float) (class536_sub2_sub1.anInt11496 >> 12);
			int i_216_ = class536_sub2_sub1.anInt11497 >> 12;
			if (class536_sub2_sub1.aShort11499 != 0) {
			    class185_sub3.aClass433_9552.method6935
				(class536_sub2_sub1.aShort11499, i_216_,
				 i_216_, 0.0F, 0.0F, 0.0F);
			    class185_sub3.aClass433_9552
				.method6839(class185_sub3.aClass433_9530);
			    class185_sub3.aClass433_9552.method6850(1.0F, 0.0F,
								    0.0F, fs);
			    class185_sub3.aClass433_9552
				.method6850(0.0F, 1.0F, 0.0F, fs_181_);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_213_ - fs[0] - fs_181_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_214_ - fs[1] - fs_181_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_215_ - fs[2] - fs_181_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_209_,
								  1614922528);
			    aClass534_Sub40_Sub2_1673.method16506(i_210_,
								  657961007);
			    aClass534_Sub40_Sub2_1673.method16506(i_211_,
								  1463519526);
			    aClass534_Sub40_Sub2_1673.method16506(i_212_,
								  184983961);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_213_ - fs[0] + fs_181_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_214_ - fs[1] + fs_181_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_215_ - fs[2] + fs_181_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_209_,
								  1213699636);
			    aClass534_Sub40_Sub2_1673.method16506(i_210_,
								  1643546532);
			    aClass534_Sub40_Sub2_1673.method16506(i_211_,
								  839437407);
			    aClass534_Sub40_Sub2_1673.method16506(i_212_,
								  1427853147);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_213_ + fs[0] + fs_181_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_214_ + fs[1] + fs_181_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_215_ + fs[2] + fs_181_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_209_,
								  740575541);
			    aClass534_Sub40_Sub2_1673.method16506(i_210_,
								  354286651);
			    aClass534_Sub40_Sub2_1673.method16506(i_211_,
								  2023914280);
			    aClass534_Sub40_Sub2_1673.method16506(i_212_,
								  1055644921);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_213_ + fs[0] - fs_181_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_214_ + fs[1] - fs_181_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_215_ + fs[2] - fs_181_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_209_,
								  604769478);
			    aClass534_Sub40_Sub2_1673.method16506(i_210_,
								  1135465961);
			    aClass534_Sub40_Sub2_1673.method16506(i_211_,
								  1040784915);
			    aClass534_Sub40_Sub2_1673.method16506(i_212_,
								  1469498577);
			} else {
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673.method18400
				(f_213_ + f_172_ * (float) -i_216_);
			    aClass534_Sub40_Sub2_1673.method18400
				(f_214_ + f_173_ * (float) -i_216_);
			    aClass534_Sub40_Sub2_1673.method18400
				(f_215_ + f_174_ * (float) -i_216_);
			    aClass534_Sub40_Sub2_1673.method16506(i_209_,
								  1312446486);
			    aClass534_Sub40_Sub2_1673.method16506(i_210_,
								  680395782);
			    aClass534_Sub40_Sub2_1673.method16506(i_211_,
								  1938494085);
			    aClass534_Sub40_Sub2_1673.method16506(i_212_,
								  581914273);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_213_ + f_178_ * (float) i_216_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_214_ + f_179_ * (float) i_216_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_215_ + f_180_ * (float) i_216_);
			    aClass534_Sub40_Sub2_1673.method16506(i_209_,
								  1282924888);
			    aClass534_Sub40_Sub2_1673.method16506(i_210_,
								  644135372);
			    aClass534_Sub40_Sub2_1673.method16506(i_211_,
								  1970820979);
			    aClass534_Sub40_Sub2_1673.method16506(i_212_,
								  1539434575);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_213_ + f_172_ * (float) i_216_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_214_ + f_173_ * (float) i_216_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_215_ + f_174_ * (float) i_216_);
			    aClass534_Sub40_Sub2_1673.method16506(i_209_,
								  256024305);
			    aClass534_Sub40_Sub2_1673.method16506(i_210_,
								  1239325710);
			    aClass534_Sub40_Sub2_1673.method16506(i_211_,
								  1168402854);
			    aClass534_Sub40_Sub2_1673.method16506(i_212_,
								  620090015);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_213_ + f_175_ * (float) i_216_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_214_ + f_176_ * (float) i_216_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_215_ + f_177_ * (float) i_216_);
			    aClass534_Sub40_Sub2_1673.method16506(i_209_,
								  283179629);
			    aClass534_Sub40_Sub2_1673.method16506(i_210_,
								  1131489819);
			    aClass534_Sub40_Sub2_1673.method16506(i_211_,
								  2104160110);
			    aClass534_Sub40_Sub2_1673.method16506(i_212_,
								  610383027);
			}
		    }
		    if (anIntArray1666[i_205_] > 64) {
			int i_217_ = anIntArray1666[i_205_] - 64 - 1;
			for (int i_218_ = anIntArray1679[i_217_] - 1;
			     i_218_ >= 0; i_218_--) {
			    Class536_Sub2_Sub1 class536_sub2_sub1
				= (aClass536_Sub2_Sub1ArrayArray1678[i_217_]
				   [i_218_]);
			    int i_219_ = class536_sub2_sub1.anInt11492;
			    byte i_220_ = (byte) (i_219_ >> 16);
			    byte i_221_ = (byte) (i_219_ >> 8);
			    byte i_222_ = (byte) i_219_;
			    byte i_223_ = (byte) (i_219_ >>> 24);
			    float f_224_
				= (float) (class536_sub2_sub1.anInt11491
					   >> 12);
			    float f_225_
				= (float) (class536_sub2_sub1.anInt11495
					   >> 12);
			    float f_226_
				= (float) (class536_sub2_sub1.anInt11496
					   >> 12);
			    int i_227_ = class536_sub2_sub1.anInt11497 >> 12;
			    if (class536_sub2_sub1.aShort11499 != 0) {
				class185_sub3.aClass433_9552.method6935
				    (class536_sub2_sub1.aShort11499, i_227_,
				     i_227_, 0.0F, 0.0F, 0.0F);
				class185_sub3.aClass433_9552
				    .method6839(class185_sub3.aClass433_9530);
				class185_sub3.aClass433_9552
				    .method6850(1.0F, 0.0F, 0.0F, fs);
				class185_sub3.aClass433_9552
				    .method6850(0.0F, 1.0F, 0.0F, fs_181_);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_224_ - fs[0] - fs_181_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_225_ - fs[1] - fs_181_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_226_ - fs[2] - fs_181_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_220_, 662595228);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_221_, 1673086012);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_222_, 1961674738);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_223_, 1346091063);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_224_ - fs[0] + fs_181_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_225_ - fs[1] + fs_181_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_226_ - fs[2] + fs_181_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_220_, 666627150);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_221_, 1821701043);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_222_, 1831674097);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_223_, 1682242618);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_224_ + fs[0] + fs_181_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_225_ + fs[1] + fs_181_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_226_ + fs[2] + fs_181_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_220_, 1297525638);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_221_, 1573715511);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_222_, 469938202);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_223_, 445540637);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_224_ + fs[0] - fs_181_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_225_ + fs[1] - fs_181_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_226_ + fs[2] - fs_181_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_220_, 1613719210);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_221_, 1941210630);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_222_, 633302515);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_223_, 1087036886);
			    } else {
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_224_ + f_172_ * (float) -i_227_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_225_ + f_173_ * (float) -i_227_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_226_ + f_174_ * (float) -i_227_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_220_, 624019797);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_221_, 905045062);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_222_, 1005690004);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_223_, 1324635383);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_224_ + f_178_ * (float) i_227_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_225_ + f_179_ * (float) i_227_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_226_ + f_180_ * (float) i_227_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_220_, 957953766);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_221_, 1910762648);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_222_, 340954991);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_223_, 1340108113);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_224_ + f_172_ * (float) i_227_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_225_ + f_173_ * (float) i_227_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_226_ + f_174_ * (float) i_227_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_220_, 967036065);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_221_, 1404847153);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_222_, 1729517915);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_223_, 875095428);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_224_ + f_175_ * (float) i_227_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_225_ + f_176_ * (float) i_227_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_226_ + f_177_ * (float) i_227_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_220_, 958845345);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_221_, 1748825449);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_222_, 1964113995);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_223_, 1562722928);
			    }
			}
		    }
		}
	    }
	}
	if (aClass534_Sub40_Sub2_1673.anInt10811 * 31645619 != 0) {
	    anInterface15_1681.method95(24,
					(aClass534_Sub40_Sub2_1673
					 .aByteArray10810),
					(aClass534_Sub40_Sub2_1673.anInt10811
					 * 31645619));
	    class185_sub3.method15221(aClass129_1669, null, aClass129_1670,
				      aClass129_1671);
	    class185_sub3.method15274(7, 0,
				      (aClass534_Sub40_Sub2_1673.anInt10811
				       * 31645619 / 24));
	}
    }
    
    void method2468(Class185_Sub3 class185_sub3, int i) {
	OpenGL.glGetFloatv(2982, aFloatArray1675, 0);
	float f = aFloatArray1675[0];
	float f_228_ = aFloatArray1675[4];
	float f_229_ = aFloatArray1675[8];
	float f_230_ = aFloatArray1675[1];
	float f_231_ = aFloatArray1675[5];
	float f_232_ = aFloatArray1675[9];
	float f_233_ = f + f_230_;
	float f_234_ = f_228_ + f_231_;
	float f_235_ = f_229_ + f_232_;
	float f_236_ = f - f_230_;
	float f_237_ = f_228_ - f_231_;
	float f_238_ = f_229_ - f_232_;
	float f_239_ = f_230_ - f;
	float f_240_ = f_231_ - f_228_;
	float f_241_ = f_232_ - f_229_;
	float[] fs = new float[3];
	float[] fs_242_ = new float[3];
	class185_sub3.aClass433_9530.method6843(class185_sub3.aClass433_9604);
	aClass534_Sub40_Sub2_1673.anInt10811 = 0;
	if (class185_sub3.aBool9566) {
	    for (int i_243_ = i - 1; i_243_ >= 0; i_243_--) {
		int i_244_ = (anIntArray1666[i_243_] > 64 ? 64
			      : anIntArray1666[i_243_]);
		if (i_244_ > 0) {
		    for (int i_245_ = i_244_ - 1; i_245_ >= 0; i_245_--) {
			Class536_Sub2_Sub1 class536_sub2_sub1
			    = (aClass536_Sub2_Sub1ArrayArray1668[i_243_]
			       [i_245_]);
			int i_246_ = class536_sub2_sub1.anInt11492;
			byte i_247_ = (byte) (i_246_ >> 16);
			byte i_248_ = (byte) (i_246_ >> 8);
			byte i_249_ = (byte) i_246_;
			byte i_250_ = (byte) (i_246_ >>> 24);
			float f_251_
			    = (float) (class536_sub2_sub1.anInt11491 >> 12);
			float f_252_
			    = (float) (class536_sub2_sub1.anInt11495 >> 12);
			float f_253_
			    = (float) (class536_sub2_sub1.anInt11496 >> 12);
			int i_254_ = class536_sub2_sub1.anInt11497 >> 12;
			if (class536_sub2_sub1.aShort11499 != 0) {
			    class185_sub3.aClass433_9552.method6935
				(class536_sub2_sub1.aShort11499, i_254_,
				 i_254_, 0.0F, 0.0F, 0.0F);
			    class185_sub3.aClass433_9552
				.method6839(class185_sub3.aClass433_9530);
			    class185_sub3.aClass433_9552.method6850(1.0F, 0.0F,
								    0.0F, fs);
			    class185_sub3.aClass433_9552
				.method6850(0.0F, 1.0F, 0.0F, fs_242_);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_251_ - fs[0] - fs_242_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_252_ - fs[1] - fs_242_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_253_ - fs[2] - fs_242_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_247_,
								  905945046);
			    aClass534_Sub40_Sub2_1673.method16506(i_248_,
								  2045353061);
			    aClass534_Sub40_Sub2_1673.method16506(i_249_,
								  1576550584);
			    aClass534_Sub40_Sub2_1673.method16506(i_250_,
								  750712195);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_251_ - fs[0] + fs_242_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_252_ - fs[1] + fs_242_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_253_ - fs[2] + fs_242_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_247_,
								  721351522);
			    aClass534_Sub40_Sub2_1673.method16506(i_248_,
								  851934460);
			    aClass534_Sub40_Sub2_1673.method16506(i_249_,
								  1783606331);
			    aClass534_Sub40_Sub2_1673.method16506(i_250_,
								  809955925);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_251_ + fs[0] + fs_242_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_252_ + fs[1] + fs_242_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_253_ + fs[2] + fs_242_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_247_,
								  1928572486);
			    aClass534_Sub40_Sub2_1673.method16506(i_248_,
								  1834098947);
			    aClass534_Sub40_Sub2_1673.method16506(i_249_,
								  1850512745);
			    aClass534_Sub40_Sub2_1673.method16506(i_250_,
								  1847629166);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_251_ + fs[0] - fs_242_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_252_ + fs[1] - fs_242_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_253_ + fs[2] - fs_242_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_247_,
								  555228794);
			    aClass534_Sub40_Sub2_1673.method16506(i_248_,
								  1839146600);
			    aClass534_Sub40_Sub2_1673.method16506(i_249_,
								  796271601);
			    aClass534_Sub40_Sub2_1673.method16506(i_250_,
								  852496776);
			} else {
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673.method18397
				(f_251_ + f_233_ * (float) -i_254_);
			    aClass534_Sub40_Sub2_1673.method18397
				(f_252_ + f_234_ * (float) -i_254_);
			    aClass534_Sub40_Sub2_1673.method18397
				(f_253_ + f_235_ * (float) -i_254_);
			    aClass534_Sub40_Sub2_1673.method16506(i_247_,
								  680691666);
			    aClass534_Sub40_Sub2_1673.method16506(i_248_,
								  2047521289);
			    aClass534_Sub40_Sub2_1673.method16506(i_249_,
								  2031104286);
			    aClass534_Sub40_Sub2_1673.method16506(i_250_,
								  1306872148);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_251_ + f_239_ * (float) i_254_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_252_ + f_240_ * (float) i_254_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_253_ + f_241_ * (float) i_254_);
			    aClass534_Sub40_Sub2_1673.method16506(i_247_,
								  695931376);
			    aClass534_Sub40_Sub2_1673.method16506(i_248_,
								  1929377156);
			    aClass534_Sub40_Sub2_1673.method16506(i_249_,
								  692516708);
			    aClass534_Sub40_Sub2_1673.method16506(i_250_,
								  1367167374);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_251_ + f_233_ * (float) i_254_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_252_ + f_234_ * (float) i_254_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_253_ + f_235_ * (float) i_254_);
			    aClass534_Sub40_Sub2_1673.method16506(i_247_,
								  1713646954);
			    aClass534_Sub40_Sub2_1673.method16506(i_248_,
								  482502729);
			    aClass534_Sub40_Sub2_1673.method16506(i_249_,
								  1659921925);
			    aClass534_Sub40_Sub2_1673.method16506(i_250_,
								  1994824187);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_251_ + f_236_ * (float) i_254_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_252_ + f_237_ * (float) i_254_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_253_ + f_238_ * (float) i_254_);
			    aClass534_Sub40_Sub2_1673.method16506(i_247_,
								  954886319);
			    aClass534_Sub40_Sub2_1673.method16506(i_248_,
								  1148930043);
			    aClass534_Sub40_Sub2_1673.method16506(i_249_,
								  1435044121);
			    aClass534_Sub40_Sub2_1673.method16506(i_250_,
								  694914092);
			}
		    }
		    if (anIntArray1666[i_243_] > 64) {
			int i_255_ = anIntArray1666[i_243_] - 64 - 1;
			for (int i_256_ = anIntArray1679[i_255_] - 1;
			     i_256_ >= 0; i_256_--) {
			    Class536_Sub2_Sub1 class536_sub2_sub1
				= (aClass536_Sub2_Sub1ArrayArray1678[i_255_]
				   [i_256_]);
			    int i_257_ = class536_sub2_sub1.anInt11492;
			    byte i_258_ = (byte) (i_257_ >> 16);
			    byte i_259_ = (byte) (i_257_ >> 8);
			    byte i_260_ = (byte) i_257_;
			    byte i_261_ = (byte) (i_257_ >>> 24);
			    float f_262_
				= (float) (class536_sub2_sub1.anInt11491
					   >> 12);
			    float f_263_
				= (float) (class536_sub2_sub1.anInt11495
					   >> 12);
			    float f_264_
				= (float) (class536_sub2_sub1.anInt11496
					   >> 12);
			    int i_265_ = class536_sub2_sub1.anInt11497 >> 12;
			    if (class536_sub2_sub1.aShort11499 != 0) {
				class185_sub3.aClass433_9552.method6935
				    (class536_sub2_sub1.aShort11499, i_265_,
				     i_265_, 0.0F, 0.0F, 0.0F);
				class185_sub3.aClass433_9552
				    .method6839(class185_sub3.aClass433_9530);
				class185_sub3.aClass433_9552
				    .method6850(1.0F, 0.0F, 0.0F, fs);
				class185_sub3.aClass433_9552
				    .method6850(0.0F, 1.0F, 0.0F, fs_242_);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_262_ - fs[0] - fs_242_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_263_ - fs[1] - fs_242_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_264_ - fs[2] - fs_242_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_258_, 1367413925);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_259_, 370649918);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_260_, 951721537);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_261_, 1545482168);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_262_ - fs[0] + fs_242_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_263_ - fs[1] + fs_242_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_264_ - fs[2] + fs_242_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_258_, 475278657);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_259_, 1967952898);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_260_, 230862802);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_261_, 2019981969);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_262_ + fs[0] + fs_242_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_263_ + fs[1] + fs_242_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_264_ + fs[2] + fs_242_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_258_, 359657494);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_259_, 1901503102);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_260_, 1155079503);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_261_, 1472549878);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_262_ + fs[0] - fs_242_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_263_ + fs[1] - fs_242_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_264_ + fs[2] - fs_242_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_258_, 1204499286);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_259_, 1081886869);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_260_, 2037069953);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_261_, 1663316088);
			    } else {
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_262_ + f_233_ * (float) -i_265_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_263_ + f_234_ * (float) -i_265_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_264_ + f_235_ * (float) -i_265_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_258_, 645893370);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_259_, 1956139437);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_260_, 265932244);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_261_, 478524263);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_262_ + f_239_ * (float) i_265_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_263_ + f_240_ * (float) i_265_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_264_ + f_241_ * (float) i_265_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_258_, 1447109929);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_259_, 2142443539);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_260_, 984552420);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_261_, 1722976659);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_262_ + f_233_ * (float) i_265_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_263_ + f_234_ * (float) i_265_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_264_ + f_235_ * (float) i_265_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_258_, 1742234712);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_259_, 549730510);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_260_, 1872571268);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_261_, 1627670690);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_262_ + f_236_ * (float) i_265_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_263_ + f_237_ * (float) i_265_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_264_ + f_238_ * (float) i_265_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_258_, 1835118048);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_259_, 1861738348);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_260_, 1008135614);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_261_, 1086733227);
			    }
			}
		    }
		}
	    }
	} else {
	    for (int i_266_ = i - 1; i_266_ >= 0; i_266_--) {
		int i_267_ = (anIntArray1666[i_266_] > 64 ? 64
			      : anIntArray1666[i_266_]);
		if (i_267_ > 0) {
		    for (int i_268_ = i_267_ - 1; i_268_ >= 0; i_268_--) {
			Class536_Sub2_Sub1 class536_sub2_sub1
			    = (aClass536_Sub2_Sub1ArrayArray1668[i_266_]
			       [i_268_]);
			int i_269_ = class536_sub2_sub1.anInt11492;
			byte i_270_ = (byte) (i_269_ >> 16);
			byte i_271_ = (byte) (i_269_ >> 8);
			byte i_272_ = (byte) i_269_;
			byte i_273_ = (byte) (i_269_ >>> 24);
			float f_274_
			    = (float) (class536_sub2_sub1.anInt11491 >> 12);
			float f_275_
			    = (float) (class536_sub2_sub1.anInt11495 >> 12);
			float f_276_
			    = (float) (class536_sub2_sub1.anInt11496 >> 12);
			int i_277_ = class536_sub2_sub1.anInt11497 >> 12;
			if (class536_sub2_sub1.aShort11499 != 0) {
			    class185_sub3.aClass433_9552.method6935
				(class536_sub2_sub1.aShort11499, i_277_,
				 i_277_, 0.0F, 0.0F, 0.0F);
			    class185_sub3.aClass433_9552
				.method6839(class185_sub3.aClass433_9530);
			    class185_sub3.aClass433_9552.method6850(1.0F, 0.0F,
								    0.0F, fs);
			    class185_sub3.aClass433_9552
				.method6850(0.0F, 1.0F, 0.0F, fs_242_);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_274_ - fs[0] - fs_242_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_275_ - fs[1] - fs_242_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_276_ - fs[2] - fs_242_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_270_,
								  368268523);
			    aClass534_Sub40_Sub2_1673.method16506(i_271_,
								  1147675003);
			    aClass534_Sub40_Sub2_1673.method16506(i_272_,
								  212093283);
			    aClass534_Sub40_Sub2_1673.method16506(i_273_,
								  466722699);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_274_ - fs[0] + fs_242_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_275_ - fs[1] + fs_242_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_276_ - fs[2] + fs_242_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_270_,
								  1209375117);
			    aClass534_Sub40_Sub2_1673.method16506(i_271_,
								  961992587);
			    aClass534_Sub40_Sub2_1673.method16506(i_272_,
								  572728810);
			    aClass534_Sub40_Sub2_1673.method16506(i_273_,
								  2121824246);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_274_ + fs[0] + fs_242_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_275_ + fs[1] + fs_242_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_276_ + fs[2] + fs_242_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_270_,
								  1702624588);
			    aClass534_Sub40_Sub2_1673.method16506(i_271_,
								  397187548);
			    aClass534_Sub40_Sub2_1673.method16506(i_272_,
								  1595962970);
			    aClass534_Sub40_Sub2_1673.method16506(i_273_,
								  514722781);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_274_ + fs[0] - fs_242_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_275_ + fs[1] - fs_242_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_276_ + fs[2] - fs_242_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_270_,
								  1792212307);
			    aClass534_Sub40_Sub2_1673.method16506(i_271_,
								  1264474437);
			    aClass534_Sub40_Sub2_1673.method16506(i_272_,
								  913955261);
			    aClass534_Sub40_Sub2_1673.method16506(i_273_,
								  1850447851);
			} else {
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673.method18400
				(f_274_ + f_233_ * (float) -i_277_);
			    aClass534_Sub40_Sub2_1673.method18400
				(f_275_ + f_234_ * (float) -i_277_);
			    aClass534_Sub40_Sub2_1673.method18400
				(f_276_ + f_235_ * (float) -i_277_);
			    aClass534_Sub40_Sub2_1673.method16506(i_270_,
								  1758580596);
			    aClass534_Sub40_Sub2_1673.method16506(i_271_,
								  760284696);
			    aClass534_Sub40_Sub2_1673.method16506(i_272_,
								  934487187);
			    aClass534_Sub40_Sub2_1673.method16506(i_273_,
								  537959790);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_274_ + f_239_ * (float) i_277_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_275_ + f_240_ * (float) i_277_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_276_ + f_241_ * (float) i_277_);
			    aClass534_Sub40_Sub2_1673.method16506(i_270_,
								  2130685951);
			    aClass534_Sub40_Sub2_1673.method16506(i_271_,
								  1953250140);
			    aClass534_Sub40_Sub2_1673.method16506(i_272_,
								  1119655384);
			    aClass534_Sub40_Sub2_1673.method16506(i_273_,
								  1959289871);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_274_ + f_233_ * (float) i_277_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_275_ + f_234_ * (float) i_277_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_276_ + f_235_ * (float) i_277_);
			    aClass534_Sub40_Sub2_1673.method16506(i_270_,
								  1406947000);
			    aClass534_Sub40_Sub2_1673.method16506(i_271_,
								  1182088840);
			    aClass534_Sub40_Sub2_1673.method16506(i_272_,
								  2099099275);
			    aClass534_Sub40_Sub2_1673.method16506(i_273_,
								  1016978809);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_274_ + f_236_ * (float) i_277_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_275_ + f_237_ * (float) i_277_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_276_ + f_238_ * (float) i_277_);
			    aClass534_Sub40_Sub2_1673.method16506(i_270_,
								  2118347503);
			    aClass534_Sub40_Sub2_1673.method16506(i_271_,
								  657615787);
			    aClass534_Sub40_Sub2_1673.method16506(i_272_,
								  1033911393);
			    aClass534_Sub40_Sub2_1673.method16506(i_273_,
								  1523854796);
			}
		    }
		    if (anIntArray1666[i_266_] > 64) {
			int i_278_ = anIntArray1666[i_266_] - 64 - 1;
			for (int i_279_ = anIntArray1679[i_278_] - 1;
			     i_279_ >= 0; i_279_--) {
			    Class536_Sub2_Sub1 class536_sub2_sub1
				= (aClass536_Sub2_Sub1ArrayArray1678[i_278_]
				   [i_279_]);
			    int i_280_ = class536_sub2_sub1.anInt11492;
			    byte i_281_ = (byte) (i_280_ >> 16);
			    byte i_282_ = (byte) (i_280_ >> 8);
			    byte i_283_ = (byte) i_280_;
			    byte i_284_ = (byte) (i_280_ >>> 24);
			    float f_285_
				= (float) (class536_sub2_sub1.anInt11491
					   >> 12);
			    float f_286_
				= (float) (class536_sub2_sub1.anInt11495
					   >> 12);
			    float f_287_
				= (float) (class536_sub2_sub1.anInt11496
					   >> 12);
			    int i_288_ = class536_sub2_sub1.anInt11497 >> 12;
			    if (class536_sub2_sub1.aShort11499 != 0) {
				class185_sub3.aClass433_9552.method6935
				    (class536_sub2_sub1.aShort11499, i_288_,
				     i_288_, 0.0F, 0.0F, 0.0F);
				class185_sub3.aClass433_9552
				    .method6839(class185_sub3.aClass433_9530);
				class185_sub3.aClass433_9552
				    .method6850(1.0F, 0.0F, 0.0F, fs);
				class185_sub3.aClass433_9552
				    .method6850(0.0F, 1.0F, 0.0F, fs_242_);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_285_ - fs[0] - fs_242_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_286_ - fs[1] - fs_242_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_287_ - fs[2] - fs_242_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_281_, 712414829);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_282_, 265951128);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_283_, 1837811395);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_284_, 831739952);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_285_ - fs[0] + fs_242_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_286_ - fs[1] + fs_242_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_287_ - fs[2] + fs_242_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_281_, 1531590252);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_282_, 1547621635);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_283_, 1920102049);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_284_, 1868105954);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_285_ + fs[0] + fs_242_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_286_ + fs[1] + fs_242_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_287_ + fs[2] + fs_242_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_281_, 1587130143);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_282_, 1583914250);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_283_, 1343733715);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_284_, 1019541339);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_285_ + fs[0] - fs_242_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_286_ + fs[1] - fs_242_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_287_ + fs[2] - fs_242_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_281_, 1605087118);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_282_, 1591958820);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_283_, 1225635999);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_284_, 252460624);
			    } else {
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_285_ + f_233_ * (float) -i_288_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_286_ + f_234_ * (float) -i_288_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_287_ + f_235_ * (float) -i_288_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_281_, 1922278173);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_282_, 1388216203);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_283_, 1657738801);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_284_, 1415182542);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_285_ + f_239_ * (float) i_288_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_286_ + f_240_ * (float) i_288_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_287_ + f_241_ * (float) i_288_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_281_, 1923532219);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_282_, 1522820049);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_283_, 1937231765);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_284_, 825085829);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_285_ + f_233_ * (float) i_288_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_286_ + f_234_ * (float) i_288_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_287_ + f_235_ * (float) i_288_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_281_, 331401146);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_282_, 587035565);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_283_, 683849557);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_284_, 2100184650);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_285_ + f_236_ * (float) i_288_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_286_ + f_237_ * (float) i_288_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_287_ + f_238_ * (float) i_288_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_281_, 1168640589);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_282_, 1815844941);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_283_, 345913155);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_284_, 803901383);
			    }
			}
		    }
		}
	    }
	}
	if (aClass534_Sub40_Sub2_1673.anInt10811 * 31645619 != 0) {
	    anInterface15_1681.method95(24,
					(aClass534_Sub40_Sub2_1673
					 .aByteArray10810),
					(aClass534_Sub40_Sub2_1673.anInt10811
					 * 31645619));
	    class185_sub3.method15221(aClass129_1669, null, aClass129_1670,
				      aClass129_1671);
	    class185_sub3.method15274(7, 0,
				      (aClass534_Sub40_Sub2_1673.anInt10811
				       * 31645619 / 24));
	}
    }
    
    Class148() {
	aClass534_Sub40_Sub2_1673 = new Class534_Sub40_Sub2(786336);
	anInt1672 = 64;
	anInt1680 = 768;
	anInt1674 = 1600;
	anInt1676 = Class695.method14072(1600, (byte) 25);
	anInt1667 = 64;
	anIntArray1677 = new int[8191];
	anIntArray1666 = new int[1600];
	anIntArray1679 = new int[64];
	aClass536_Sub2_Sub1ArrayArray1668 = new Class536_Sub2_Sub1[1600][64];
	aClass536_Sub2_Sub1ArrayArray1678 = new Class536_Sub2_Sub1[64][768];
	anInt1682 = 0;
    }
    
    void method2469(Class185_Sub3 class185_sub3, int i) {
	OpenGL.glGetFloatv(2982, aFloatArray1675, 0);
	float f = aFloatArray1675[0];
	float f_289_ = aFloatArray1675[4];
	float f_290_ = aFloatArray1675[8];
	float f_291_ = aFloatArray1675[1];
	float f_292_ = aFloatArray1675[5];
	float f_293_ = aFloatArray1675[9];
	float f_294_ = f + f_291_;
	float f_295_ = f_289_ + f_292_;
	float f_296_ = f_290_ + f_293_;
	float f_297_ = f - f_291_;
	float f_298_ = f_289_ - f_292_;
	float f_299_ = f_290_ - f_293_;
	float f_300_ = f_291_ - f;
	float f_301_ = f_292_ - f_289_;
	float f_302_ = f_293_ - f_290_;
	float[] fs = new float[3];
	float[] fs_303_ = new float[3];
	class185_sub3.aClass433_9530.method6843(class185_sub3.aClass433_9604);
	aClass534_Sub40_Sub2_1673.anInt10811 = 0;
	if (class185_sub3.aBool9566) {
	    for (int i_304_ = i - 1; i_304_ >= 0; i_304_--) {
		int i_305_ = (anIntArray1666[i_304_] > 64 ? 64
			      : anIntArray1666[i_304_]);
		if (i_305_ > 0) {
		    for (int i_306_ = i_305_ - 1; i_306_ >= 0; i_306_--) {
			Class536_Sub2_Sub1 class536_sub2_sub1
			    = (aClass536_Sub2_Sub1ArrayArray1668[i_304_]
			       [i_306_]);
			int i_307_ = class536_sub2_sub1.anInt11492;
			byte i_308_ = (byte) (i_307_ >> 16);
			byte i_309_ = (byte) (i_307_ >> 8);
			byte i_310_ = (byte) i_307_;
			byte i_311_ = (byte) (i_307_ >>> 24);
			float f_312_
			    = (float) (class536_sub2_sub1.anInt11491 >> 12);
			float f_313_
			    = (float) (class536_sub2_sub1.anInt11495 >> 12);
			float f_314_
			    = (float) (class536_sub2_sub1.anInt11496 >> 12);
			int i_315_ = class536_sub2_sub1.anInt11497 >> 12;
			if (class536_sub2_sub1.aShort11499 != 0) {
			    class185_sub3.aClass433_9552.method6935
				(class536_sub2_sub1.aShort11499, i_315_,
				 i_315_, 0.0F, 0.0F, 0.0F);
			    class185_sub3.aClass433_9552
				.method6839(class185_sub3.aClass433_9530);
			    class185_sub3.aClass433_9552.method6850(1.0F, 0.0F,
								    0.0F, fs);
			    class185_sub3.aClass433_9552
				.method6850(0.0F, 1.0F, 0.0F, fs_303_);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_312_ - fs[0] - fs_303_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_313_ - fs[1] - fs_303_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_314_ - fs[2] - fs_303_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_308_,
								  591937579);
			    aClass534_Sub40_Sub2_1673.method16506(i_309_,
								  791955983);
			    aClass534_Sub40_Sub2_1673.method16506(i_310_,
								  1862396069);
			    aClass534_Sub40_Sub2_1673.method16506(i_311_,
								  1755989331);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_312_ - fs[0] + fs_303_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_313_ - fs[1] + fs_303_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_314_ - fs[2] + fs_303_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_308_,
								  1712056576);
			    aClass534_Sub40_Sub2_1673.method16506(i_309_,
								  330975514);
			    aClass534_Sub40_Sub2_1673.method16506(i_310_,
								  710105516);
			    aClass534_Sub40_Sub2_1673.method16506(i_311_,
								  1230680950);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_312_ + fs[0] + fs_303_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_313_ + fs[1] + fs_303_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_314_ + fs[2] + fs_303_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_308_,
								  617095645);
			    aClass534_Sub40_Sub2_1673.method16506(i_309_,
								  1091749158);
			    aClass534_Sub40_Sub2_1673.method16506(i_310_,
								  1617238207);
			    aClass534_Sub40_Sub2_1673.method16506(i_311_,
								  1549268795);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_312_ + fs[0] - fs_303_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_313_ + fs[1] - fs_303_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_314_ + fs[2] - fs_303_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_308_,
								  1396539393);
			    aClass534_Sub40_Sub2_1673.method16506(i_309_,
								  1305414051);
			    aClass534_Sub40_Sub2_1673.method16506(i_310_,
								  1345569010);
			    aClass534_Sub40_Sub2_1673.method16506(i_311_,
								  1773786868);
			} else {
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673.method18397
				(f_312_ + f_294_ * (float) -i_315_);
			    aClass534_Sub40_Sub2_1673.method18397
				(f_313_ + f_295_ * (float) -i_315_);
			    aClass534_Sub40_Sub2_1673.method18397
				(f_314_ + f_296_ * (float) -i_315_);
			    aClass534_Sub40_Sub2_1673.method16506(i_308_,
								  212143456);
			    aClass534_Sub40_Sub2_1673.method16506(i_309_,
								  328658276);
			    aClass534_Sub40_Sub2_1673.method16506(i_310_,
								  1560681736);
			    aClass534_Sub40_Sub2_1673.method16506(i_311_,
								  1611051807);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_312_ + f_300_ * (float) i_315_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_313_ + f_301_ * (float) i_315_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_314_ + f_302_ * (float) i_315_);
			    aClass534_Sub40_Sub2_1673.method16506(i_308_,
								  1990436738);
			    aClass534_Sub40_Sub2_1673.method16506(i_309_,
								  1775066703);
			    aClass534_Sub40_Sub2_1673.method16506(i_310_,
								  1124347187);
			    aClass534_Sub40_Sub2_1673.method16506(i_311_,
								  1518705349);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_312_ + f_294_ * (float) i_315_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_313_ + f_295_ * (float) i_315_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_314_ + f_296_ * (float) i_315_);
			    aClass534_Sub40_Sub2_1673.method16506(i_308_,
								  335947054);
			    aClass534_Sub40_Sub2_1673.method16506(i_309_,
								  1987564517);
			    aClass534_Sub40_Sub2_1673.method16506(i_310_,
								  1837407607);
			    aClass534_Sub40_Sub2_1673.method16506(i_311_,
								  1622145926);
			    aClass534_Sub40_Sub2_1673.method18397(1.0F);
			    aClass534_Sub40_Sub2_1673.method18397(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_312_ + f_297_ * (float) i_315_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_313_ + f_298_ * (float) i_315_);
			    aClass534_Sub40_Sub2_1673
				.method18397(f_314_ + f_299_ * (float) i_315_);
			    aClass534_Sub40_Sub2_1673.method16506(i_308_,
								  1388973308);
			    aClass534_Sub40_Sub2_1673.method16506(i_309_,
								  287661561);
			    aClass534_Sub40_Sub2_1673.method16506(i_310_,
								  1844327184);
			    aClass534_Sub40_Sub2_1673.method16506(i_311_,
								  1195772034);
			}
		    }
		    if (anIntArray1666[i_304_] > 64) {
			int i_316_ = anIntArray1666[i_304_] - 64 - 1;
			for (int i_317_ = anIntArray1679[i_316_] - 1;
			     i_317_ >= 0; i_317_--) {
			    Class536_Sub2_Sub1 class536_sub2_sub1
				= (aClass536_Sub2_Sub1ArrayArray1678[i_316_]
				   [i_317_]);
			    int i_318_ = class536_sub2_sub1.anInt11492;
			    byte i_319_ = (byte) (i_318_ >> 16);
			    byte i_320_ = (byte) (i_318_ >> 8);
			    byte i_321_ = (byte) i_318_;
			    byte i_322_ = (byte) (i_318_ >>> 24);
			    float f_323_
				= (float) (class536_sub2_sub1.anInt11491
					   >> 12);
			    float f_324_
				= (float) (class536_sub2_sub1.anInt11495
					   >> 12);
			    float f_325_
				= (float) (class536_sub2_sub1.anInt11496
					   >> 12);
			    int i_326_ = class536_sub2_sub1.anInt11497 >> 12;
			    if (class536_sub2_sub1.aShort11499 != 0) {
				class185_sub3.aClass433_9552.method6935
				    (class536_sub2_sub1.aShort11499, i_326_,
				     i_326_, 0.0F, 0.0F, 0.0F);
				class185_sub3.aClass433_9552
				    .method6839(class185_sub3.aClass433_9530);
				class185_sub3.aClass433_9552
				    .method6850(1.0F, 0.0F, 0.0F, fs);
				class185_sub3.aClass433_9552
				    .method6850(0.0F, 1.0F, 0.0F, fs_303_);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_323_ - fs[0] - fs_303_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_324_ - fs[1] - fs_303_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_325_ - fs[2] - fs_303_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_319_, 304137555);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_320_, 1722293338);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_321_, 1999920465);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_322_, 440787872);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_323_ - fs[0] + fs_303_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_324_ - fs[1] + fs_303_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_325_ - fs[2] + fs_303_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_319_, 1102383593);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_320_, 1887512805);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_321_, 1368988629);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_322_, 1158052430);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_323_ + fs[0] + fs_303_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_324_ + fs[1] + fs_303_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_325_ + fs[2] + fs_303_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_319_, 1188592853);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_320_, 1504356044);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_321_, 1850440816);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_322_, 552576309);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_323_ + fs[0] - fs_303_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_324_ + fs[1] - fs_303_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18397(f_325_ + fs[2] - fs_303_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_319_, 1154757970);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_320_, 614997559);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_321_, 1288151149);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_322_, 411957952);
			    } else {
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_323_ + f_294_ * (float) -i_326_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_324_ + f_295_ * (float) -i_326_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_325_ + f_296_ * (float) -i_326_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_319_, 633331658);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_320_, 1676114702);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_321_, 838744458);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_322_, 1891586890);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_323_ + f_300_ * (float) i_326_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_324_ + f_301_ * (float) i_326_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_325_ + f_302_ * (float) i_326_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_319_, 2064315539);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_320_, 1927589206);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_321_, 526430888);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_322_, 1515624827);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_323_ + f_294_ * (float) i_326_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_324_ + f_295_ * (float) i_326_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_325_ + f_296_ * (float) i_326_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_319_, 191663337);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_320_, 944851478);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_321_, 1967808582);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_322_, 901726890);
				aClass534_Sub40_Sub2_1673.method18397(1.0F);
				aClass534_Sub40_Sub2_1673.method18397(0.0F);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_323_ + f_297_ * (float) i_326_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_324_ + f_298_ * (float) i_326_);
				aClass534_Sub40_Sub2_1673.method18397
				    (f_325_ + f_299_ * (float) i_326_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_319_, 761736869);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_320_, 1985917820);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_321_, 1794415179);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_322_, 994782736);
			    }
			}
		    }
		}
	    }
	} else {
	    for (int i_327_ = i - 1; i_327_ >= 0; i_327_--) {
		int i_328_ = (anIntArray1666[i_327_] > 64 ? 64
			      : anIntArray1666[i_327_]);
		if (i_328_ > 0) {
		    for (int i_329_ = i_328_ - 1; i_329_ >= 0; i_329_--) {
			Class536_Sub2_Sub1 class536_sub2_sub1
			    = (aClass536_Sub2_Sub1ArrayArray1668[i_327_]
			       [i_329_]);
			int i_330_ = class536_sub2_sub1.anInt11492;
			byte i_331_ = (byte) (i_330_ >> 16);
			byte i_332_ = (byte) (i_330_ >> 8);
			byte i_333_ = (byte) i_330_;
			byte i_334_ = (byte) (i_330_ >>> 24);
			float f_335_
			    = (float) (class536_sub2_sub1.anInt11491 >> 12);
			float f_336_
			    = (float) (class536_sub2_sub1.anInt11495 >> 12);
			float f_337_
			    = (float) (class536_sub2_sub1.anInt11496 >> 12);
			int i_338_ = class536_sub2_sub1.anInt11497 >> 12;
			if (class536_sub2_sub1.aShort11499 != 0) {
			    class185_sub3.aClass433_9552.method6935
				(class536_sub2_sub1.aShort11499, i_338_,
				 i_338_, 0.0F, 0.0F, 0.0F);
			    class185_sub3.aClass433_9552
				.method6839(class185_sub3.aClass433_9530);
			    class185_sub3.aClass433_9552.method6850(1.0F, 0.0F,
								    0.0F, fs);
			    class185_sub3.aClass433_9552
				.method6850(0.0F, 1.0F, 0.0F, fs_303_);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_335_ - fs[0] - fs_303_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_336_ - fs[1] - fs_303_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_337_ - fs[2] - fs_303_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_331_,
								  1446457046);
			    aClass534_Sub40_Sub2_1673.method16506(i_332_,
								  1337962800);
			    aClass534_Sub40_Sub2_1673.method16506(i_333_,
								  1027342004);
			    aClass534_Sub40_Sub2_1673.method16506(i_334_,
								  1344564242);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_335_ - fs[0] + fs_303_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_336_ - fs[1] + fs_303_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_337_ - fs[2] + fs_303_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_331_,
								  1305010567);
			    aClass534_Sub40_Sub2_1673.method16506(i_332_,
								  901828676);
			    aClass534_Sub40_Sub2_1673.method16506(i_333_,
								  1107863194);
			    aClass534_Sub40_Sub2_1673.method16506(i_334_,
								  609978573);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_335_ + fs[0] + fs_303_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_336_ + fs[1] + fs_303_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_337_ + fs[2] + fs_303_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_331_,
								  1177213810);
			    aClass534_Sub40_Sub2_1673.method16506(i_332_,
								  1834440285);
			    aClass534_Sub40_Sub2_1673.method16506(i_333_,
								  1601658371);
			    aClass534_Sub40_Sub2_1673.method16506(i_334_,
								  488007499);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_335_ + fs[0] - fs_303_[0]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_336_ + fs[1] - fs_303_[1]);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_337_ + fs[2] - fs_303_[2]);
			    aClass534_Sub40_Sub2_1673.method16506(i_331_,
								  637306442);
			    aClass534_Sub40_Sub2_1673.method16506(i_332_,
								  1386510076);
			    aClass534_Sub40_Sub2_1673.method16506(i_333_,
								  2053341638);
			    aClass534_Sub40_Sub2_1673.method16506(i_334_,
								  399241367);
			} else {
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673.method18400
				(f_335_ + f_294_ * (float) -i_338_);
			    aClass534_Sub40_Sub2_1673.method18400
				(f_336_ + f_295_ * (float) -i_338_);
			    aClass534_Sub40_Sub2_1673.method18400
				(f_337_ + f_296_ * (float) -i_338_);
			    aClass534_Sub40_Sub2_1673.method16506(i_331_,
								  272644648);
			    aClass534_Sub40_Sub2_1673.method16506(i_332_,
								  360737929);
			    aClass534_Sub40_Sub2_1673.method16506(i_333_,
								  206251177);
			    aClass534_Sub40_Sub2_1673.method16506(i_334_,
								  1532272335);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_335_ + f_300_ * (float) i_338_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_336_ + f_301_ * (float) i_338_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_337_ + f_302_ * (float) i_338_);
			    aClass534_Sub40_Sub2_1673.method16506(i_331_,
								  798689484);
			    aClass534_Sub40_Sub2_1673.method16506(i_332_,
								  1892021276);
			    aClass534_Sub40_Sub2_1673.method16506(i_333_,
								  386603067);
			    aClass534_Sub40_Sub2_1673.method16506(i_334_,
								  1931134658);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_335_ + f_294_ * (float) i_338_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_336_ + f_295_ * (float) i_338_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_337_ + f_296_ * (float) i_338_);
			    aClass534_Sub40_Sub2_1673.method16506(i_331_,
								  186718316);
			    aClass534_Sub40_Sub2_1673.method16506(i_332_,
								  678468335);
			    aClass534_Sub40_Sub2_1673.method16506(i_333_,
								  725168156);
			    aClass534_Sub40_Sub2_1673.method16506(i_334_,
								  1124110906);
			    aClass534_Sub40_Sub2_1673.method18400(1.0F);
			    aClass534_Sub40_Sub2_1673.method18400(0.0F);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_335_ + f_297_ * (float) i_338_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_336_ + f_298_ * (float) i_338_);
			    aClass534_Sub40_Sub2_1673
				.method18400(f_337_ + f_299_ * (float) i_338_);
			    aClass534_Sub40_Sub2_1673.method16506(i_331_,
								  939267352);
			    aClass534_Sub40_Sub2_1673.method16506(i_332_,
								  1716811007);
			    aClass534_Sub40_Sub2_1673.method16506(i_333_,
								  1338876521);
			    aClass534_Sub40_Sub2_1673.method16506(i_334_,
								  1417921469);
			}
		    }
		    if (anIntArray1666[i_327_] > 64) {
			int i_339_ = anIntArray1666[i_327_] - 64 - 1;
			for (int i_340_ = anIntArray1679[i_339_] - 1;
			     i_340_ >= 0; i_340_--) {
			    Class536_Sub2_Sub1 class536_sub2_sub1
				= (aClass536_Sub2_Sub1ArrayArray1678[i_339_]
				   [i_340_]);
			    int i_341_ = class536_sub2_sub1.anInt11492;
			    byte i_342_ = (byte) (i_341_ >> 16);
			    byte i_343_ = (byte) (i_341_ >> 8);
			    byte i_344_ = (byte) i_341_;
			    byte i_345_ = (byte) (i_341_ >>> 24);
			    float f_346_
				= (float) (class536_sub2_sub1.anInt11491
					   >> 12);
			    float f_347_
				= (float) (class536_sub2_sub1.anInt11495
					   >> 12);
			    float f_348_
				= (float) (class536_sub2_sub1.anInt11496
					   >> 12);
			    int i_349_ = class536_sub2_sub1.anInt11497 >> 12;
			    if (class536_sub2_sub1.aShort11499 != 0) {
				class185_sub3.aClass433_9552.method6935
				    (class536_sub2_sub1.aShort11499, i_349_,
				     i_349_, 0.0F, 0.0F, 0.0F);
				class185_sub3.aClass433_9552
				    .method6839(class185_sub3.aClass433_9530);
				class185_sub3.aClass433_9552
				    .method6850(1.0F, 0.0F, 0.0F, fs);
				class185_sub3.aClass433_9552
				    .method6850(0.0F, 1.0F, 0.0F, fs_303_);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_346_ - fs[0] - fs_303_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_347_ - fs[1] - fs_303_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_348_ - fs[2] - fs_303_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_342_, 651322051);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_343_, 1472946817);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_344_, 1517984316);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_345_, 1830179533);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_346_ - fs[0] + fs_303_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_347_ - fs[1] + fs_303_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_348_ - fs[2] + fs_303_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_342_, 1818945286);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_343_, 558438345);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_344_, 433977268);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_345_, 2109348958);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_346_ + fs[0] + fs_303_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_347_ + fs[1] + fs_303_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_348_ + fs[2] + fs_303_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_342_, 1024739024);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_343_, 635746305);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_344_, 1556191483);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_345_, 1377201180);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_346_ + fs[0] - fs_303_[0]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_347_ + fs[1] - fs_303_[1]);
				aClass534_Sub40_Sub2_1673
				    .method18400(f_348_ + fs[2] - fs_303_[2]);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_342_, 780381813);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_343_, 1114046333);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_344_, 1032565921);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_345_, 977777531);
			    } else {
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_346_ + f_294_ * (float) -i_349_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_347_ + f_295_ * (float) -i_349_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_348_ + f_296_ * (float) -i_349_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_342_, 263445621);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_343_, 920322550);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_344_, 1481283284);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_345_, 1630877968);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_346_ + f_300_ * (float) i_349_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_347_ + f_301_ * (float) i_349_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_348_ + f_302_ * (float) i_349_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_342_, 1010278290);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_343_, 2139599299);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_344_, 392023688);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_345_, 1783040974);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_346_ + f_294_ * (float) i_349_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_347_ + f_295_ * (float) i_349_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_348_ + f_296_ * (float) i_349_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_342_, 853111862);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_343_, 1671431265);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_344_, 1594153369);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_345_, 1933490460);
				aClass534_Sub40_Sub2_1673.method18400(1.0F);
				aClass534_Sub40_Sub2_1673.method18400(0.0F);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_346_ + f_297_ * (float) i_349_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_347_ + f_298_ * (float) i_349_);
				aClass534_Sub40_Sub2_1673.method18400
				    (f_348_ + f_299_ * (float) i_349_);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_342_, 263316640);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_343_, 1409594961);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_344_, 703753391);
				aClass534_Sub40_Sub2_1673
				    .method16506(i_345_, 657723590);
			    }
			}
		    }
		}
	    }
	}
	if (aClass534_Sub40_Sub2_1673.anInt10811 * 31645619 != 0) {
	    anInterface15_1681.method95(24,
					(aClass534_Sub40_Sub2_1673
					 .aByteArray10810),
					(aClass534_Sub40_Sub2_1673.anInt10811
					 * 31645619));
	    class185_sub3.method15221(aClass129_1669, null, aClass129_1670,
				      aClass129_1671);
	    class185_sub3.method15274(7, 0,
				      (aClass534_Sub40_Sub2_1673.anInt10811
				       * 31645619 / 24));
	}
    }
    
    void method2470(Class185_Sub3 class185_sub3) {
	aFloat1683 = class185_sub3.aFloat9646;
	class185_sub3.method15226();
	OpenGL.glDisable(16384);
	OpenGL.glDisable(16385);
	class185_sub3.method15193(false);
	OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }
    
    void method2471(Class185_Sub3 class185_sub3, Class174 class174) {
	if (class185_sub3.aClass433_9533 != null) {
	    method2465(class185_sub3);
	    float f = class185_sub3.aClass433_9533.aFloatArray4853[2];
	    float f_350_ = class185_sub3.aClass433_9533.aFloatArray4853[6];
	    float f_351_ = class185_sub3.aClass433_9533.aFloatArray4853[10];
	    float f_352_ = class185_sub3.aClass433_9533.aFloatArray4853[14];
	    try {
		int i = 0;
		int i_353_ = 2147483647;
		int i_354_ = 0;
		Class536_Sub2 class536_sub2
		    = class174.aClass701_1837.aClass536_Sub2_8809;
		for (Class536_Sub2 class536_sub2_355_
			 = class536_sub2.aClass536_Sub2_10349;
		     class536_sub2_355_ != class536_sub2;
		     class536_sub2_355_
			 = class536_sub2_355_.aClass536_Sub2_10349) {
		    Class536_Sub2_Sub1 class536_sub2_sub1
			= (Class536_Sub2_Sub1) class536_sub2_355_;
		    int i_356_
			= (int) (f * (float) (class536_sub2_sub1.anInt11491
					      >> 12)
				 + (f_350_
				    * (float) (class536_sub2_sub1.anInt11495
					       >> 12))
				 + (f_351_
				    * (float) (class536_sub2_sub1.anInt11496
					       >> 12))
				 + f_352_);
		    if (i_356_ > i_354_)
			i_354_ = i_356_;
		    if (i_356_ < i_353_)
			i_353_ = i_356_;
		    anIntArray1677[i++] = i_356_;
		}
		int i_357_ = i_354_ - i_353_;
		int i_358_;
		if (i_357_ + 2 > 1600) {
		    i_358_ = (1 + Class695.method14072(i_357_, (byte) -43)
			      - anInt1676);
		    i_357_ = (i_357_ >> i_358_) + 2;
		} else {
		    i_358_ = 0;
		    i_357_ += 2;
		}
		Class536_Sub2 class536_sub2_359_
		    = class536_sub2.aClass536_Sub2_10349;
		i = 0;
		int i_360_ = -2;
		boolean bool = true;
		boolean bool_361_ = true;
		while (class536_sub2_359_ != class536_sub2) {
		    anInt1682 = 0;
		    for (int i_362_ = 0; i_362_ < i_357_; i_362_++)
			anIntArray1666[i_362_] = 0;
		    for (int i_363_ = 0; i_363_ < 64; i_363_++)
			anIntArray1679[i_363_] = 0;
		    for (/**/; class536_sub2_359_ != class536_sub2;
			 class536_sub2_359_
			     = class536_sub2_359_.aClass536_Sub2_10349) {
			Class536_Sub2_Sub1 class536_sub2_sub1
			    = (Class536_Sub2_Sub1) class536_sub2_359_;
			if (bool_361_) {
			    i_360_ = class536_sub2_sub1.anInt11498;
			    bool = class536_sub2_sub1.aBool11494;
			    bool_361_ = false;
			}
			if (i > 0
			    && (i_360_ != class536_sub2_sub1.anInt11498
				|| bool != class536_sub2_sub1.aBool11494)) {
			    bool_361_ = true;
			    break;
			}
			int i_364_ = anIntArray1677[i++] - i_353_ >> i_358_;
			if (i_364_ < 1600) {
			    if (anIntArray1666[i_364_] < 64)
				aClass536_Sub2_Sub1ArrayArray1668[i_364_]
				    [anIntArray1666[i_364_]++]
				    = class536_sub2_sub1;
			    else {
				if (anIntArray1666[i_364_] == 64) {
				    if (anInt1682 == 64)
					continue;
				    anIntArray1666[i_364_] += 1 + anInt1682++;
				}
				aClass536_Sub2_Sub1ArrayArray1678
				    [anIntArray1666[i_364_] - 64 - 1]
				    [anIntArray1679[(anIntArray1666[i_364_]
						     - 64 - 1)]++]
				    = class536_sub2_sub1;
			    }
			}
		    }
		    if (i_360_ >= 0)
			class185_sub3.method15227(i_360_);
		    else
			class185_sub3.method15227(-1);
		    if (bool && class185_sub3.aFloat9646 != aFloat1683)
			class185_sub3.method3489(aFloat1683);
		    else if (class185_sub3.aFloat9646 != 1.0F)
			class185_sub3.method3489(1.0F);
		    method2459(class185_sub3, i_357_);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    method2475(class185_sub3);
	}
    }
    
    void method2472(Class185_Sub3 class185_sub3) {
	class185_sub3.method15193(true);
	OpenGL.glEnable(16384);
	OpenGL.glEnable(16385);
	if (class185_sub3.aFloat9646 != aFloat1683)
	    class185_sub3.method3489(aFloat1683);
    }
    
    void method2473(Class185_Sub3 class185_sub3) {
	class185_sub3.method15193(true);
	OpenGL.glEnable(16384);
	OpenGL.glEnable(16385);
	if (class185_sub3.aFloat9646 != aFloat1683)
	    class185_sub3.method3489(aFloat1683);
    }
    
    void method2474(Class185_Sub3 class185_sub3) {
	class185_sub3.method15193(true);
	OpenGL.glEnable(16384);
	OpenGL.glEnable(16385);
	if (class185_sub3.aFloat9646 != aFloat1683)
	    class185_sub3.method3489(aFloat1683);
    }
    
    void method2475(Class185_Sub3 class185_sub3) {
	class185_sub3.method15193(true);
	OpenGL.glEnable(16384);
	OpenGL.glEnable(16385);
	if (class185_sub3.aFloat9646 != aFloat1683)
	    class185_sub3.method3489(aFloat1683);
    }
}
