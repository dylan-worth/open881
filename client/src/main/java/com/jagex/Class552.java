/* Class552 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class552
{
    int anInt7309;
    boolean aBool7310;
    Class560[] aClass560Array7311;
    static final float aFloat7312 = 3.0F;
    static final int anInt7313 = 101;
    Class556 aClass556_7314;
    Class558 aClass558_7315;
    boolean aBool7316;
    int anInt7317;
    static final int anInt7318 = 10;
    int[] anIntArray7319;
    int anInt7320;
    Class560[] aClass560Array7321;
    int anInt7322;
    Class560[] aClass560Array7323;
    public boolean aBool7324 = true;
    Class560[] aClass560Array7325;
    int anInt7326;
    int[][][] anIntArrayArrayArray7327;
    int[] anIntArray7328;
    int[] anIntArray7329;
    int[] anIntArray7330;
    int[] anIntArray7331;
    int anInt7332;
    int[] anIntArray7333;
    static Class185 aClass185_7334;
    float[] aFloatArray7335;
    int[] anIntArray7336;
    int anInt7337;
    int anInt7338;
    boolean aBool7339;
    
    final boolean method9053(int i, int i_0_, int i_1_) {
	aClass185_7334.method3367((float) i, (float) i_0_, (float) i_1_,
				  aFloatArray7335);
	if (aFloatArray7335[2] < 50.0F)
	    return false;
	aFloatArray7335[0] /= 3.0F;
	aFloatArray7335[1] /= 3.0F;
	return true;
    }
    
    public void method9054(int i, int i_2_, int i_3_, int i_4_, int i_5_,
			   int i_6_) {
	if (i == 8 || i == 16) {
	    if (i == 8) {
		int i_7_ = i_3_ << aClass556_7314.anInt7422 * 941710601;
		int i_8_ = i_7_ + aClass556_7314.anInt7420 * -1935734157;
		int i_9_ = i_4_ << aClass556_7314.anInt7422 * 941710601;
		int i_10_ = i_9_ + aClass556_7314.anInt7420 * -1935734157;
		int i_11_ = aClass556_7314.aClass151Array7434[i_2_]
				.method2491(i_3_, i_4_, -2035410133);
		int i_12_ = aClass556_7314.aClass151Array7434[i_2_]
				.method2491(i_3_ + 1, i_4_ + 1, 799607133);
		aClass560Array7325[anInt7320++]
		    = new Class560(aClass556_7314, i, i_2_, i_7_, i_8_, i_8_,
				   i_7_, i_11_, i_12_, i_12_ - i_5_,
				   i_11_ - i_5_, i_9_, i_10_, i_10_, i_9_);
	    } else {
		int i_13_ = ((i_3_ << aClass556_7314.anInt7422 * 941710601)
			     + aClass556_7314.anInt7420 * -1935734157);
		int i_14_ = i_13_ - aClass556_7314.anInt7420 * -1935734157;
		int i_15_ = i_4_ << aClass556_7314.anInt7422 * 941710601;
		int i_16_ = i_15_ + aClass556_7314.anInt7420 * -1935734157;
		int i_17_ = aClass556_7314.aClass151Array7434[i_2_]
				.method2491(i_3_ + 1, i_4_, -46132075);
		int i_18_ = aClass556_7314.aClass151Array7434[i_2_]
				.method2491(i_3_, i_4_ + 1, -1144032029);
		aClass560Array7325[anInt7320++]
		    = new Class560(aClass556_7314, i, i_2_, i_13_, i_14_,
				   i_14_, i_13_, i_17_, i_18_, i_18_ - i_5_,
				   i_17_ - i_5_, i_15_, i_16_, i_16_, i_15_);
	    }
	} else {
	    Class568 class568 = (aClass556_7314.aClass568ArrayArrayArray7431
				 [i_2_][i_3_][i_4_]);
	    if (class568 == null)
		aClass556_7314.aClass568ArrayArrayArray7431[i_2_][i_3_][i_4_]
		    = class568 = new Class568(i_2_);
	    if (i == 1) {
		class568.aShort7603 = (short) i_5_;
		class568.aShort7606 = (short) i_6_;
	    } else if (i == 2) {
		class568.aShort7596 = (short) i_5_;
		class568.aShort7608 = (short) i_6_;
	    }
	    if (aBool7316)
		method9060();
	}
    }
    
    Class552(Class556 class556) {
	aBool7310 = true;
	aBool7316 = false;
	anInt7326 = 0;
	aFloatArray7335 = new float[3];
	anIntArray7319 = new int[2];
	anInt7337 = -1;
	anInt7309 = -1;
	aBool7339 = true;
	anInt7338 = class556.anInt7420 * -1935734157;
	anInt7317 = class556.anInt7420 * -1935734157;
	aClass556_7314 = class556;
	aClass560Array7311 = new Class560[545];
	anInt7332 = 0;
	aClass560Array7323 = new Class560[2017];
	anInt7322 = 0;
	aClass560Array7325 = new Class560[1040];
	anInt7320 = 0;
	aClass560Array7321 = new Class560[1020];
	anInt7326 = 0;
	anIntArrayArrayArray7327
	    = (new int[aClass556_7314.anInt7418 * -1381097937]
	       [aClass556_7314.anInt7435 * 1183912005 + 1]
	       [aClass556_7314.anInt7470 * 60330541 + 1]);
	aBool7316 = false;
	aBool7324 = true;
	if (aBool7324)
	    aClass558_7315 = new Class558(this);
    }
    
    public void method9055(int i, int i_19_, int i_20_, int i_21_, int i_22_,
			   int i_23_, int i_24_, int i_25_) {
	aClass560Array7311[anInt7332++]
	    = new Class560(aClass556_7314, i, i_19_, i_20_, i_21_, i_21_,
			   i_20_, i_24_, i_25_, i_25_, i_24_, i_22_, i_22_,
			   i_23_, i_23_);
    }
    
    void method9056() {
	for (int i = 0; i < anInt7322; i++)
	    aClass560Array7323[i] = null;
	anInt7322 = 0;
	for (int i = 0; i < aClass556_7314.anInt7418 * -1381097937; i++) {
	    for (int i_26_ = 0; i_26_ < aClass556_7314.anInt7435 * 1183912005;
		 i_26_++) {
		for (int i_27_ = 0;
		     i_27_ < aClass556_7314.anInt7470 * 60330541; i_27_++) {
		    Class568 class568
			= (aClass556_7314.aClass568ArrayArrayArray7431[i]
			   [i_27_][i_26_]);
		    if (class568 != null) {
			if (class568.aShort7603 > 0)
			    class568.aShort7603 *= -1;
			if (class568.aShort7596 > 0)
			    class568.aShort7596 *= -1;
		    }
		}
	    }
	}
	for (int i = 0; i < aClass556_7314.anInt7418 * -1381097937; i++) {
	    for (int i_28_ = 0; i_28_ < aClass556_7314.anInt7435 * 1183912005;
		 i_28_++) {
		for (int i_29_ = 0;
		     i_29_ < aClass556_7314.anInt7470 * 60330541; i_29_++) {
		    Class568 class568
			= (aClass556_7314.aClass568ArrayArrayArray7431[i]
			   [i_29_][i_28_]);
		    if (class568 != null) {
			boolean bool
			    = ((aClass556_7314.aClass568ArrayArrayArray7431[0]
				[i_29_][i_28_]) != null
			       && (aClass556_7314.aClass568ArrayArrayArray7431
				   [0][i_29_][i_28_].aClass568_7605) != null);
			if (class568.aShort7603 < 0) {
			    int i_30_ = i_28_;
			    int i_31_ = i_28_;
			    int i_32_ = i;
			    int i_33_ = i;
			    Class568 class568_34_
				= (aClass556_7314.aClass568ArrayArrayArray7431
				   [i][i_29_][i_30_ - 1]);
			    int i_35_;
			    for (i_35_ = (aClass556_7314.aClass151Array7434
					      [i].method2491
					  (i_29_, i_28_, 424956268));
				 (i_30_ > 0 && class568_34_ != null
				  && class568_34_.aShort7603 < 0
				  && (class568_34_.aShort7603
				      == class568.aShort7603)
				  && (class568_34_.aShort7606
				      == class568.aShort7606)
				  && i_35_ == (aClass556_7314
						   .aClass151Array7434[i]
						   .method2491
					       (i_29_, i_30_ - 1, 364623219))
				  && (i_30_ - 1 <= 0
				      || (i_35_
					  == (aClass556_7314
						  .aClass151Array7434[i]
						  .method2491
					      (i_29_, i_30_ - 2, 524786421))))
				  && i_31_ - i_30_ <= 10);
				 class568_34_ = (aClass556_7314
						 .aClass568ArrayArrayArray7431
						 [i][i_29_][i_30_ - 1]))
				i_30_--;
			    for (class568_34_ = (aClass556_7314
						 .aClass568ArrayArrayArray7431
						 [i][i_29_][i_31_ + 1]);
				 (i_31_ < aClass556_7314.anInt7470 * 60330541
				  && class568_34_ != null
				  && class568_34_.aShort7603 < 0
				  && (class568_34_.aShort7603
				      == class568.aShort7603)
				  && (class568_34_.aShort7606
				      == class568.aShort7606)
				  && i_35_ == (aClass556_7314
						   .aClass151Array7434[i]
						   .method2491
					       (i_29_, i_31_ + 1, -1379069123))
				  && ((i_31_ + 1
				       >= aClass556_7314.anInt7470 * 60330541)
				      || (i_35_
					  == (aClass556_7314
						  .aClass151Array7434[i]
						  .method2491
					      (i_29_, i_31_ + 2, -977272134))))
				  && i_31_ - i_30_ <= 10);
				 class568_34_ = (aClass556_7314
						 .aClass568ArrayArrayArray7431
						 [i][i_29_][i_31_ + 1]))
				i_31_++;
			    int i_36_ = i_33_ - i_32_ + 1;
			    int i_37_
				= aClass556_7314.aClass151Array7434
				      [bool ? i_32_ + 1 : i_32_]
				      .method2491(i_29_, i_30_, -929688475);
			    int i_38_ = i_37_ + class568.aShort7603 * i_36_;
			    int i_39_
				= aClass556_7314.aClass151Array7434
				      [bool ? i_32_ + 1 : i_32_]
				      .method2491(i_29_, i_31_ + 1, 789510125);
			    int i_40_ = i_39_ + class568.aShort7603 * i_36_;
			    int i_41_
				= (i_29_
				   << aClass556_7314.anInt7422 * 941710601);
			    int i_42_
				= (i_30_
				   << aClass556_7314.anInt7422 * 941710601);
			    int i_43_
				= ((i_31_
				    << aClass556_7314.anInt7422 * 941710601)
				   + aClass556_7314.anInt7420 * -1935734157);
			    aClass560Array7323[anInt7322++]
				= new Class560(aClass556_7314, 1, i_33_,
					       i_41_ + class568.aShort7606,
					       i_41_ + class568.aShort7606,
					       i_41_ + class568.aShort7606,
					       i_41_ + class568.aShort7606,
					       i_37_, i_39_, i_40_, i_38_,
					       i_42_, i_43_, i_43_, i_42_);
			    for (int i_44_ = i_32_; i_44_ <= i_33_; i_44_++) {
				for (int i_45_ = i_30_; i_45_ <= i_31_;
				     i_45_++)
				    aClass556_7314
					.aClass568ArrayArrayArray7431[i_44_]
					[i_29_][i_45_].aShort7603
					*= -1;
			    }
			}
			if (class568.aShort7596 < 0) {
			    int i_46_ = i_29_;
			    int i_47_ = i_29_;
			    int i_48_ = i;
			    int i_49_ = i;
			    Class568 class568_50_
				= (aClass556_7314.aClass568ArrayArrayArray7431
				   [i][i_46_ - 1][i_28_]);
			    int i_51_;
			    for (i_51_ = (aClass556_7314.aClass151Array7434
					      [i].method2491
					  (i_29_, i_28_, -1158460498));
				 (i_46_ > 0 && class568_50_ != null
				  && class568_50_.aShort7596 < 0
				  && (class568_50_.aShort7596
				      == class568.aShort7596)
				  && (class568_50_.aShort7608
				      == class568.aShort7608)
				  && i_51_ == (aClass556_7314
						   .aClass151Array7434[i]
						   .method2491
					       (i_46_ - 1, i_28_, -894023528))
				  && (i_46_ - 1 <= 0
				      || i_51_ == (aClass556_7314
						       .aClass151Array7434[i]
						       .method2491
						   (i_46_ - 2, i_28_,
						    -1171487945)))
				  && i_47_ - i_46_ <= 10);
				 class568_50_ = (aClass556_7314
						 .aClass568ArrayArrayArray7431
						 [i][i_46_ - 1][i_28_]))
				i_46_--;
			    for (class568_50_ = (aClass556_7314
						 .aClass568ArrayArrayArray7431
						 [i][i_47_ + 1][i_28_]);
				 (i_47_ < aClass556_7314.anInt7435 * 1183912005
				  && class568_50_ != null
				  && class568_50_.aShort7596 < 0
				  && (class568_50_.aShort7596
				      == class568.aShort7596)
				  && (class568_50_.aShort7608
				      == class568.aShort7608)
				  && i_51_ == (aClass556_7314
						   .aClass151Array7434[i]
						   .method2491
					       (i_47_ + 1, i_28_, 1799035364))
				  && (i_47_ + 1 >= (aClass556_7314.anInt7435
						    * 1183912005)
				      || (i_51_
					  == (aClass556_7314
						  .aClass151Array7434[i]
						  .method2491
					      (i_47_ + 2, i_28_, 1798288717))))
				  && i_47_ - i_46_ <= 10);
				 class568_50_ = (aClass556_7314
						 .aClass568ArrayArrayArray7431
						 [i][i_47_ + 1][i_28_]))
				i_47_++;
			    int i_52_ = i_49_ - i_48_ + 1;
			    int i_53_
				= aClass556_7314.aClass151Array7434
				      [bool ? i_48_ + 1 : i_48_]
				      .method2491(i_46_, i_28_, -519170700);
			    int i_54_ = i_53_ + class568.aShort7596 * i_52_;
			    int i_55_
				= (aClass556_7314.aClass151Array7434
				       [bool ? i_48_ + 1 : i_48_].method2491
				   (i_47_ + 1, i_28_, -1148140996));
			    int i_56_ = i_55_ + class568.aShort7596 * i_52_;
			    int i_57_
				= (i_46_
				   << aClass556_7314.anInt7422 * 941710601);
			    int i_58_
				= ((i_47_
				    << aClass556_7314.anInt7422 * 941710601)
				   + aClass556_7314.anInt7420 * -1935734157);
			    int i_59_
				= (i_28_
				   << aClass556_7314.anInt7422 * 941710601);
			    aClass560Array7323[anInt7322++]
				= new Class560(aClass556_7314, 2, i_49_, i_57_,
					       i_58_, i_58_, i_57_, i_53_,
					       i_55_, i_56_, i_54_,
					       i_59_ + class568.aShort7608,
					       i_59_ + class568.aShort7608,
					       i_59_ + class568.aShort7608,
					       i_59_ + class568.aShort7608);
			    for (int i_60_ = i_48_; i_60_ <= i_49_; i_60_++) {
				for (int i_61_ = i_46_; i_61_ <= i_47_;
				     i_61_++)
				    aClass556_7314
					.aClass568ArrayArrayArray7431[i_60_]
					[i_61_][i_28_].aShort7596
					*= -1;
			    }
			}
		    }
		}
	    }
	}
	aBool7316 = true;
    }
    
    boolean method9057(int i, int i_62_, int i_63_, int i_64_) {
	if (!aBool7324 || !aBool7310)
	    return false;
	if (aClass558_7315.anInt7494 < 101)
	    return false;
	if (!method9062(i, i_62_, i_63_))
	    return false;
	int i_65_ = i_62_ << aClass556_7314.anInt7422 * 941710601;
	int i_66_ = i_63_ << aClass556_7314.anInt7422 * 941710601;
	if (method9092(i_65_,
		       aClass556_7314.aClass151Array7432[i]
			   .method2491(i_62_, i_63_, 787435122),
		       i_66_, aClass556_7314.anInt7420 * -1935734157, i_64_,
		       aClass556_7314.anInt7420 * -1935734157))
	    return true;
	return false;
    }
    
    void method9058(Class185 class185, int i) {
	aClass185_7334 = class185;
	if (!aBool7324 || !aBool7310)
	    anInt7326 = 0;
	else {
	    if (aBool7339)
		aClass556_7314.aClass27_7466.method859(-1063456719);
	    aClass185_7334.method3252(anIntArray7319);
	    if (anInt7337 != (int) ((float) anIntArray7319[0] / 3.0F)
		|| anInt7309 != (int) ((float) anIntArray7319[1] / 3.0F)) {
		anInt7337 = (int) ((float) anIntArray7319[0] / 3.0F);
		anInt7309 = (int) ((float) anIntArray7319[1] / 3.0F);
		anIntArray7333 = new int[anInt7337 * anInt7309];
	    }
	    anInt7326 = 0;
	    for (int i_67_ = 0; i_67_ < anInt7332; i_67_++)
		method9059(aClass185_7334, aClass560Array7311[i_67_], i);
	    for (int i_68_ = 0; i_68_ < anInt7322; i_68_++)
		method9059(aClass185_7334, aClass560Array7323[i_68_], i);
	    for (int i_69_ = 0; i_69_ < anInt7320; i_69_++)
		method9059(aClass185_7334, aClass560Array7325[i_69_], i);
	    aClass558_7315.anInt7494 = 0;
	    if (anInt7326 > 0) {
		int i_70_ = anIntArray7333.length;
		int i_71_ = i_70_ - i_70_ & 0x7;
		int i_72_ = 0;
		while (i_72_ < i_71_) {
		    anIntArray7333[i_72_++] = 2147483647;
		    anIntArray7333[i_72_++] = 2147483647;
		    anIntArray7333[i_72_++] = 2147483647;
		    anIntArray7333[i_72_++] = 2147483647;
		    anIntArray7333[i_72_++] = 2147483647;
		    anIntArray7333[i_72_++] = 2147483647;
		    anIntArray7333[i_72_++] = 2147483647;
		    anIntArray7333[i_72_++] = 2147483647;
		}
		while (i_72_ < i_70_)
		    anIntArray7333[i_72_++] = 2147483647;
		aClass558_7315.anInt7493 = 1;
		for (int i_73_ = 0; i_73_ < anInt7326; i_73_++) {
		    Class560 class560 = aClass560Array7321[i_73_];
		    aClass558_7315.method9413(class560.aShortArray7517[0],
					      class560.aShortArray7517[1],
					      class560.aShortArray7517[3],
					      class560.aShortArray7514[0],
					      class560.aShortArray7514[1],
					      class560.aShortArray7514[3],
					      class560.aShortArray7515[0],
					      class560.aShortArray7515[1],
					      class560.aShortArray7515[3]);
		    aClass558_7315.method9413(class560.aShortArray7517[1],
					      class560.aShortArray7517[2],
					      class560.aShortArray7517[3],
					      class560.aShortArray7514[1],
					      class560.aShortArray7514[2],
					      class560.aShortArray7514[3],
					      class560.aShortArray7515[1],
					      class560.aShortArray7515[2],
					      class560.aShortArray7515[3]);
		}
		aClass558_7315.anInt7493 = 2;
	    }
	    if (aBool7339)
		aClass556_7314.aClass27_7466.method859(-1063456719);
	}
    }
    
    void method9059(Class185 class185, Class560 class560, int i) {
	aClass185_7334 = class185;
	if (anIntArray7328 != null && class560.aByte7508 >= i) {
	    for (int i_74_ = 0; i_74_ < anIntArray7328.length; i_74_++) {
		if (anIntArray7328[i_74_] != -1000000
		    && (class560.anIntArray7502[0] <= anIntArray7328[i_74_]
			|| class560.anIntArray7502[1] <= anIntArray7328[i_74_]
			|| class560.anIntArray7502[2] <= anIntArray7328[i_74_]
			|| class560.anIntArray7502[3] <= anIntArray7328[i_74_])
		    && (class560.anIntArray7513[0] <= anIntArray7330[i_74_]
			|| class560.anIntArray7513[1] <= anIntArray7330[i_74_]
			|| class560.anIntArray7513[2] <= anIntArray7330[i_74_]
			|| class560.anIntArray7513[3] <= anIntArray7330[i_74_])
		    && (class560.anIntArray7513[0] >= anIntArray7329[i_74_]
			|| class560.anIntArray7513[1] >= anIntArray7329[i_74_]
			|| class560.anIntArray7513[2] >= anIntArray7329[i_74_]
			|| class560.anIntArray7513[3] >= anIntArray7329[i_74_])
		    && (class560.anIntArray7504[0] <= anIntArray7331[i_74_]
			|| class560.anIntArray7504[1] <= anIntArray7331[i_74_]
			|| class560.anIntArray7504[2] <= anIntArray7331[i_74_]
			|| class560.anIntArray7504[3] <= anIntArray7331[i_74_])
		    && (class560.anIntArray7504[0] >= anIntArray7336[i_74_]
			|| class560.anIntArray7504[1] >= anIntArray7336[i_74_]
			|| class560.anIntArray7504[2] >= anIntArray7336[i_74_]
			|| (class560.anIntArray7504[3]
			    >= anIntArray7336[i_74_])))
		    return;
	    }
	}
	if (class560.aByte7507 == 1) {
	    int i_75_
		= (class560.aShort7509 - aClass556_7314.anInt7455 * -380604831
		   + aClass556_7314.anInt7461 * -1213435377);
	    if (i_75_ >= 0
		&& i_75_ <= (aClass556_7314.anInt7461 * -1213435377
			     + aClass556_7314.anInt7461 * -1213435377)) {
		int i_76_ = (class560.aShort7511
			     - aClass556_7314.anInt7459 * -1709472547
			     + aClass556_7314.anInt7461 * -1213435377);
		if (i_76_ < 0)
		    i_76_ = 0;
		else if (i_76_ > (aClass556_7314.anInt7461 * -1213435377
				  + aClass556_7314.anInt7461 * -1213435377))
		    return;
		int i_77_ = (class560.aShort7512
			     - aClass556_7314.anInt7459 * -1709472547
			     + aClass556_7314.anInt7461 * -1213435377);
		if (i_77_ > (aClass556_7314.anInt7461 * -1213435377
			     + aClass556_7314.anInt7461 * -1213435377))
		    i_77_ = (aClass556_7314.anInt7461 * -1213435377
			     + aClass556_7314.anInt7461 * -1213435377);
		else if (i_77_ < 0)
		    return;
		boolean bool = false;
	    while_42_:
		do {
		    do {
			if (i_76_ > i_77_)
			    break while_42_;
		    } while (!aClass556_7314.aBoolArrayArray7481[i_75_]
			      [i_76_++]);
		    bool = true;
		} while (false);
		if (bool) {
		    float f = (float) (aClass556_7314.anInt7457 * -1983059883
				       - class560.anIntArray7513[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    if (!(f < (float) anInt7338) && method9067(class560, 0)
			&& method9067(class560, 1) && method9067(class560, 2)
			&& method9067(class560, 3))
			aClass560Array7321[anInt7326++] = class560;
		}
	    }
	} else if (class560.aByte7507 == 2) {
	    int i_78_
		= (class560.aShort7511 - aClass556_7314.anInt7459 * -1709472547
		   + aClass556_7314.anInt7461 * -1213435377);
	    if (i_78_ >= 0
		&& i_78_ <= (aClass556_7314.anInt7461 * -1213435377
			     + aClass556_7314.anInt7461 * -1213435377)) {
		int i_79_ = (class560.aShort7509
			     - aClass556_7314.anInt7455 * -380604831
			     + aClass556_7314.anInt7461 * -1213435377);
		if (i_79_ < 0)
		    i_79_ = 0;
		else if (i_79_ > (aClass556_7314.anInt7461 * -1213435377
				  + aClass556_7314.anInt7461 * -1213435377))
		    return;
		int i_80_ = (class560.aShort7510
			     - aClass556_7314.anInt7455 * -380604831
			     + aClass556_7314.anInt7461 * -1213435377);
		if (i_80_ > (aClass556_7314.anInt7461 * -1213435377
			     + aClass556_7314.anInt7461 * -1213435377))
		    i_80_ = (aClass556_7314.anInt7461 * -1213435377
			     + aClass556_7314.anInt7461 * -1213435377);
		else if (i_80_ < 0)
		    return;
		boolean bool = false;
	    while_43_:
		do {
		    do {
			if (i_79_ > i_80_)
			    break while_43_;
		    } while (!aClass556_7314.aBoolArrayArray7481[i_79_++]
			      [i_78_]);
		    bool = true;
		} while (false);
		if (bool) {
		    float f = (float) (aClass556_7314.anInt7458 * 2104525499
				       - class560.anIntArray7504[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    if (!(f < (float) anInt7338) && method9067(class560, 0)
			&& method9067(class560, 1) && method9067(class560, 2)
			&& method9067(class560, 3))
			aClass560Array7321[anInt7326++] = class560;
		}
	    }
	} else if (class560.aByte7507 == 16 || class560.aByte7507 == 8) {
	    int i_81_
		= (class560.aShort7509 - aClass556_7314.anInt7455 * -380604831
		   + aClass556_7314.anInt7461 * -1213435377);
	    if (i_81_ >= 0
		&& i_81_ <= (aClass556_7314.anInt7461 * -1213435377
			     + aClass556_7314.anInt7461 * -1213435377)) {
		int i_82_ = (class560.aShort7511
			     - aClass556_7314.anInt7459 * -1709472547
			     + aClass556_7314.anInt7461 * -1213435377);
		if (i_82_ >= 0
		    && i_82_ <= (aClass556_7314.anInt7461 * -1213435377
				 + aClass556_7314.anInt7461 * -1213435377)
		    && aClass556_7314.aBoolArrayArray7481[i_81_][i_82_]) {
		    float f = (float) (aClass556_7314.anInt7457 * -1983059883
				       - class560.anIntArray7513[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    float f_83_
			= (float) (aClass556_7314.anInt7458 * 2104525499
				   - class560.anIntArray7504[0]);
		    if (f_83_ < 0.0F)
			f_83_ *= -1.0F;
		    if ((!(f < (float) anInt7338)
			 || !(f_83_ < (float) anInt7338))
			&& method9067(class560, 0) && method9067(class560, 1)
			&& method9067(class560, 2) && method9067(class560, 3))
			aClass560Array7321[anInt7326++] = class560;
		}
	    }
	} else if (class560.aByte7507 == 4) {
	    float f = (float) (class560.anIntArray7502[0]
			       - aClass556_7314.anInt7462 * -1172756367);
	    if (!(f <= (float) anInt7317)) {
		int i_84_ = (class560.aShort7511
			     - aClass556_7314.anInt7459 * -1709472547
			     + aClass556_7314.anInt7461 * -1213435377);
		if (i_84_ < 0)
		    i_84_ = 0;
		else if (i_84_ > (aClass556_7314.anInt7461 * -1213435377
				  + aClass556_7314.anInt7461 * -1213435377))
		    return;
		int i_85_ = (class560.aShort7512
			     - aClass556_7314.anInt7459 * -1709472547
			     + aClass556_7314.anInt7461 * -1213435377);
		if (i_85_ > (aClass556_7314.anInt7461 * -1213435377
			     + aClass556_7314.anInt7461 * -1213435377))
		    i_85_ = (aClass556_7314.anInt7461 * -1213435377
			     + aClass556_7314.anInt7461 * -1213435377);
		else if (i_85_ < 0)
		    return;
		int i_86_ = (class560.aShort7509
			     - aClass556_7314.anInt7455 * -380604831
			     + aClass556_7314.anInt7461 * -1213435377);
		if (i_86_ < 0)
		    i_86_ = 0;
		else if (i_86_ > (aClass556_7314.anInt7461 * -1213435377
				  + aClass556_7314.anInt7461 * -1213435377))
		    return;
		int i_87_ = (class560.aShort7510
			     - aClass556_7314.anInt7455 * -380604831
			     + aClass556_7314.anInt7461 * -1213435377);
		if (i_87_ > (aClass556_7314.anInt7461 * -1213435377
			     + aClass556_7314.anInt7461 * -1213435377))
		    i_87_ = (aClass556_7314.anInt7461 * -1213435377
			     + aClass556_7314.anInt7461 * -1213435377);
		else if (i_87_ < 0)
		    return;
		boolean bool = false;
	    while_44_:
		for (int i_88_ = i_86_; i_88_ <= i_87_; i_88_++) {
		    for (int i_89_ = i_84_; i_89_ <= i_85_; i_89_++) {
			if (aClass556_7314.aBoolArrayArray7481[i_88_][i_89_]) {
			    bool = true;
			    break while_44_;
			}
		    }
		}
		if (bool && method9067(class560, 0) && method9067(class560, 1)
		    && method9067(class560, 2) && method9067(class560, 3))
		    aClass560Array7321[anInt7326++] = class560;
	    }
	}
    }
    
    void method9060() {
	for (int i = 0; i < anInt7322; i++)
	    aClass560Array7323[i] = null;
	anInt7322 = 0;
	for (int i = 0; i < aClass556_7314.anInt7418 * -1381097937; i++) {
	    for (int i_90_ = 0; i_90_ < aClass556_7314.anInt7435 * 1183912005;
		 i_90_++) {
		for (int i_91_ = 0;
		     i_91_ < aClass556_7314.anInt7470 * 60330541; i_91_++) {
		    Class568 class568
			= (aClass556_7314.aClass568ArrayArrayArray7431[i]
			   [i_91_][i_90_]);
		    if (class568 != null) {
			if (class568.aShort7603 > 0)
			    class568.aShort7603 *= -1;
			if (class568.aShort7596 > 0)
			    class568.aShort7596 *= -1;
		    }
		}
	    }
	}
	for (int i = 0; i < aClass556_7314.anInt7418 * -1381097937; i++) {
	    for (int i_92_ = 0; i_92_ < aClass556_7314.anInt7435 * 1183912005;
		 i_92_++) {
		for (int i_93_ = 0;
		     i_93_ < aClass556_7314.anInt7470 * 60330541; i_93_++) {
		    Class568 class568
			= (aClass556_7314.aClass568ArrayArrayArray7431[i]
			   [i_93_][i_92_]);
		    if (class568 != null) {
			boolean bool
			    = ((aClass556_7314.aClass568ArrayArrayArray7431[0]
				[i_93_][i_92_]) != null
			       && (aClass556_7314.aClass568ArrayArrayArray7431
				   [0][i_93_][i_92_].aClass568_7605) != null);
			if (class568.aShort7603 < 0) {
			    int i_94_ = i_92_;
			    int i_95_ = i_92_;
			    int i_96_ = i;
			    int i_97_ = i;
			    Class568 class568_98_
				= (aClass556_7314.aClass568ArrayArrayArray7431
				   [i][i_93_][i_94_ - 1]);
			    int i_99_;
			    for (i_99_ = (aClass556_7314.aClass151Array7434
					      [i].method2491
					  (i_93_, i_92_, -246312607));
				 (i_94_ > 0 && class568_98_ != null
				  && class568_98_.aShort7603 < 0
				  && (class568_98_.aShort7603
				      == class568.aShort7603)
				  && (class568_98_.aShort7606
				      == class568.aShort7606)
				  && i_99_ == (aClass556_7314
						   .aClass151Array7434[i]
						   .method2491
					       (i_93_, i_94_ - 1, -1556711141))
				  && (i_94_ - 1 <= 0
				      || i_99_ == (aClass556_7314
						       .aClass151Array7434[i]
						       .method2491
						   (i_93_, i_94_ - 2,
						    -1213362325)))
				  && i_95_ - i_94_ <= 10);
				 class568_98_ = (aClass556_7314
						 .aClass568ArrayArrayArray7431
						 [i][i_93_][i_94_ - 1]))
				i_94_--;
			    for (class568_98_ = (aClass556_7314
						 .aClass568ArrayArrayArray7431
						 [i][i_93_][i_95_ + 1]);
				 (i_95_ < aClass556_7314.anInt7470 * 60330541
				  && class568_98_ != null
				  && class568_98_.aShort7603 < 0
				  && (class568_98_.aShort7603
				      == class568.aShort7603)
				  && (class568_98_.aShort7606
				      == class568.aShort7606)
				  && i_99_ == (aClass556_7314
						   .aClass151Array7434[i]
						   .method2491
					       (i_93_, i_95_ + 1, 1783159532))
				  && ((i_95_ + 1
				       >= aClass556_7314.anInt7470 * 60330541)
				      || (i_99_
					  == (aClass556_7314
						  .aClass151Array7434[i]
						  .method2491
					      (i_93_, i_95_ + 2, 943573785))))
				  && i_95_ - i_94_ <= 10);
				 class568_98_ = (aClass556_7314
						 .aClass568ArrayArrayArray7431
						 [i][i_93_][i_95_ + 1]))
				i_95_++;
			    int i_100_ = i_97_ - i_96_ + 1;
			    int i_101_
				= aClass556_7314.aClass151Array7434
				      [bool ? i_96_ + 1 : i_96_]
				      .method2491(i_93_, i_94_, 375305673);
			    int i_102_ = i_101_ + class568.aShort7603 * i_100_;
			    int i_103_
				= aClass556_7314.aClass151Array7434
				      [bool ? i_96_ + 1 : i_96_]
				      .method2491(i_93_, i_95_ + 1, 444990111);
			    int i_104_ = i_103_ + class568.aShort7603 * i_100_;
			    int i_105_
				= (i_93_
				   << aClass556_7314.anInt7422 * 941710601);
			    int i_106_
				= (i_94_
				   << aClass556_7314.anInt7422 * 941710601);
			    int i_107_
				= ((i_95_
				    << aClass556_7314.anInt7422 * 941710601)
				   + aClass556_7314.anInt7420 * -1935734157);
			    aClass560Array7323[anInt7322++]
				= new Class560(aClass556_7314, 1, i_97_,
					       i_105_ + class568.aShort7606,
					       i_105_ + class568.aShort7606,
					       i_105_ + class568.aShort7606,
					       i_105_ + class568.aShort7606,
					       i_101_, i_103_, i_104_, i_102_,
					       i_106_, i_107_, i_107_, i_106_);
			    for (int i_108_ = i_96_; i_108_ <= i_97_;
				 i_108_++) {
				for (int i_109_ = i_94_; i_109_ <= i_95_;
				     i_109_++)
				    aClass556_7314
					.aClass568ArrayArrayArray7431[i_108_]
					[i_93_][i_109_].aShort7603
					*= -1;
			    }
			}
			if (class568.aShort7596 < 0) {
			    int i_110_ = i_93_;
			    int i_111_ = i_93_;
			    int i_112_ = i;
			    int i_113_ = i;
			    Class568 class568_114_
				= (aClass556_7314.aClass568ArrayArrayArray7431
				   [i][i_110_ - 1][i_92_]);
			    int i_115_;
			    for (i_115_ = (aClass556_7314
					       .aClass151Array7434[i]
					       .method2491
					   (i_93_, i_92_, -1158858877));
				 (i_110_ > 0 && class568_114_ != null
				  && class568_114_.aShort7596 < 0
				  && (class568_114_.aShort7596
				      == class568.aShort7596)
				  && (class568_114_.aShort7608
				      == class568.aShort7608)
				  && i_115_ == (aClass556_7314
						    .aClass151Array7434[i]
						    .method2491
						(i_110_ - 1, i_92_, 965615195))
				  && (i_110_ - 1 <= 0
				      || i_115_ == (aClass556_7314
							.aClass151Array7434[i]
							.method2491
						    (i_110_ - 2, i_92_,
						     -2010887917)))
				  && i_111_ - i_110_ <= 10);
				 class568_114_ = (aClass556_7314
						  .aClass568ArrayArrayArray7431
						  [i][i_110_ - 1][i_92_]))
				i_110_--;
			    for (class568_114_ = (aClass556_7314
						  .aClass568ArrayArrayArray7431
						  [i][i_111_ + 1][i_92_]);
				 ((i_111_
				   < aClass556_7314.anInt7435 * 1183912005)
				  && class568_114_ != null
				  && class568_114_.aShort7596 < 0
				  && (class568_114_.aShort7596
				      == class568.aShort7596)
				  && (class568_114_.aShort7608
				      == class568.aShort7608)
				  && (i_115_
				      == (aClass556_7314.aClass151Array7434
					      [i].method2491
					  (i_111_ + 1, i_92_, 1495567901)))
				  && (i_111_ + 1 >= (aClass556_7314.anInt7435
						     * 1183912005)
				      || i_115_ == (aClass556_7314
							.aClass151Array7434[i]
							.method2491
						    (i_111_ + 2, i_92_,
						     -120851337)))
				  && i_111_ - i_110_ <= 10);
				 class568_114_ = (aClass556_7314
						  .aClass568ArrayArrayArray7431
						  [i][i_111_ + 1][i_92_]))
				i_111_++;
			    int i_116_ = i_113_ - i_112_ + 1;
			    int i_117_
				= aClass556_7314.aClass151Array7434
				      [bool ? i_112_ + 1 : i_112_]
				      .method2491(i_110_, i_92_, 161950588);
			    int i_118_ = i_117_ + class568.aShort7596 * i_116_;
			    int i_119_
				= (aClass556_7314.aClass151Array7434
				       [bool ? i_112_ + 1 : i_112_].method2491
				   (i_111_ + 1, i_92_, 914380660));
			    int i_120_ = i_119_ + class568.aShort7596 * i_116_;
			    int i_121_
				= (i_110_
				   << aClass556_7314.anInt7422 * 941710601);
			    int i_122_
				= ((i_111_
				    << aClass556_7314.anInt7422 * 941710601)
				   + aClass556_7314.anInt7420 * -1935734157);
			    int i_123_
				= (i_92_
				   << aClass556_7314.anInt7422 * 941710601);
			    aClass560Array7323[anInt7322++]
				= new Class560(aClass556_7314, 2, i_113_,
					       i_121_, i_122_, i_122_, i_121_,
					       i_117_, i_119_, i_120_, i_118_,
					       i_123_ + class568.aShort7608,
					       i_123_ + class568.aShort7608,
					       i_123_ + class568.aShort7608,
					       i_123_ + class568.aShort7608);
			    for (int i_124_ = i_112_; i_124_ <= i_113_;
				 i_124_++) {
				for (int i_125_ = i_110_; i_125_ <= i_111_;
				     i_125_++)
				    aClass556_7314
					.aClass568ArrayArrayArray7431[i_124_]
					[i_125_][i_92_].aShort7596
					*= -1;
			    }
			}
		    }
		}
	    }
	}
	aBool7316 = true;
    }
    
    final boolean method9061(int i, int i_126_, int i_127_) {
	aClass185_7334.method3367((float) i, (float) i_126_, (float) i_127_,
				  aFloatArray7335);
	if (aFloatArray7335[2] < 50.0F)
	    return false;
	aFloatArray7335[0] /= 3.0F;
	aFloatArray7335[1] /= 3.0F;
	return true;
    }
    
    boolean method9062(int i, int i_128_, int i_129_) {
	if (!aBool7324 || !aBool7310)
	    return false;
	if (aClass558_7315.anInt7494 < 101)
	    return false;
	int i_130_ = anIntArrayArrayArray7327[i][i_128_][i_129_];
	if (i_130_ == -(aClass556_7314.anInt7428 * 183737403))
	    return false;
	if (i_130_ == aClass556_7314.anInt7428 * 183737403)
	    return true;
	if (aClass556_7314.aClass151Array7432
	    == aClass556_7314.aClass151Array7436)
	    return false;
	int i_131_ = i_128_ << aClass556_7314.anInt7422 * 941710601;
	int i_132_ = i_129_ << aClass556_7314.anInt7422 * 941710601;
	if (method9068(i_131_ + 1,
		       aClass556_7314.aClass151Array7432[i]
			   .method2491(i_128_, i_129_, 1779822883),
		       i_132_ + 1,
		       i_131_ + aClass556_7314.anInt7420 * -1935734157 - 1,
		       aClass556_7314.aClass151Array7432[i]
			   .method2491(i_128_ + 1, i_129_ + 1, 1820849005),
		       i_132_ + aClass556_7314.anInt7420 * -1935734157 - 1,
		       i_131_ + 1,
		       aClass556_7314.aClass151Array7432[i]
			   .method2491(i_128_, i_129_ + 1, -1357392092),
		       i_132_ + aClass556_7314.anInt7420 * -1935734157 - 1)
	    && method9068(i_131_ + 1,
			  aClass556_7314.aClass151Array7432[i]
			      .method2491(i_128_, i_129_, 929901109),
			  i_132_ + 1,
			  i_131_ + aClass556_7314.anInt7420 * -1935734157 - 1,
			  aClass556_7314.aClass151Array7432[i]
			      .method2491(i_128_ + 1, i_129_, -170974142),
			  i_132_ + 1,
			  i_131_ + aClass556_7314.anInt7420 * -1935734157 - 1,
			  aClass556_7314.aClass151Array7432[i]
			      .method2491(i_128_ + 1, i_129_ + 1, 658552791),
			  (i_132_ + aClass556_7314.anInt7420 * -1935734157
			   - 1))) {
	    anIntArrayArrayArray7327[i][i_128_][i_129_]
		= aClass556_7314.anInt7428 * 183737403;
	    return true;
	}
	anIntArrayArrayArray7327[i][i_128_][i_129_]
	    = -(aClass556_7314.anInt7428 * 183737403);
	return false;
    }
    
    void method9063(Class185 class185, Class560 class560, int i) {
	aClass185_7334 = class185;
	if (anIntArray7328 != null && class560.aByte7508 >= i) {
	    for (int i_133_ = 0; i_133_ < anIntArray7328.length; i_133_++) {
		if (anIntArray7328[i_133_] != -1000000
		    && (class560.anIntArray7502[0] <= anIntArray7328[i_133_]
			|| class560.anIntArray7502[1] <= anIntArray7328[i_133_]
			|| class560.anIntArray7502[2] <= anIntArray7328[i_133_]
			|| (class560.anIntArray7502[3]
			    <= anIntArray7328[i_133_]))
		    && (class560.anIntArray7513[0] <= anIntArray7330[i_133_]
			|| class560.anIntArray7513[1] <= anIntArray7330[i_133_]
			|| class560.anIntArray7513[2] <= anIntArray7330[i_133_]
			|| (class560.anIntArray7513[3]
			    <= anIntArray7330[i_133_]))
		    && (class560.anIntArray7513[0] >= anIntArray7329[i_133_]
			|| class560.anIntArray7513[1] >= anIntArray7329[i_133_]
			|| class560.anIntArray7513[2] >= anIntArray7329[i_133_]
			|| (class560.anIntArray7513[3]
			    >= anIntArray7329[i_133_]))
		    && (class560.anIntArray7504[0] <= anIntArray7331[i_133_]
			|| class560.anIntArray7504[1] <= anIntArray7331[i_133_]
			|| class560.anIntArray7504[2] <= anIntArray7331[i_133_]
			|| (class560.anIntArray7504[3]
			    <= anIntArray7331[i_133_]))
		    && (class560.anIntArray7504[0] >= anIntArray7336[i_133_]
			|| class560.anIntArray7504[1] >= anIntArray7336[i_133_]
			|| class560.anIntArray7504[2] >= anIntArray7336[i_133_]
			|| (class560.anIntArray7504[3]
			    >= anIntArray7336[i_133_])))
		    return;
	    }
	}
	if (class560.aByte7507 == 1) {
	    int i_134_
		= (class560.aShort7509 - aClass556_7314.anInt7455 * -380604831
		   + aClass556_7314.anInt7461 * -1213435377);
	    if (i_134_ >= 0
		&& i_134_ <= (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377)) {
		int i_135_ = (class560.aShort7511
			      - aClass556_7314.anInt7459 * -1709472547
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_135_ < 0)
		    i_135_ = 0;
		else if (i_135_ > (aClass556_7314.anInt7461 * -1213435377
				   + aClass556_7314.anInt7461 * -1213435377))
		    return;
		int i_136_ = (class560.aShort7512
			      - aClass556_7314.anInt7459 * -1709472547
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_136_ > (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377))
		    i_136_ = (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377);
		else if (i_136_ < 0)
		    return;
		boolean bool = false;
	    while_45_:
		do {
		    do {
			if (i_135_ > i_136_)
			    break while_45_;
		    } while (!aClass556_7314.aBoolArrayArray7481[i_134_]
			      [i_135_++]);
		    bool = true;
		} while (false);
		if (bool) {
		    float f = (float) (aClass556_7314.anInt7457 * -1983059883
				       - class560.anIntArray7513[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    if (!(f < (float) anInt7338) && method9067(class560, 0)
			&& method9067(class560, 1) && method9067(class560, 2)
			&& method9067(class560, 3))
			aClass560Array7321[anInt7326++] = class560;
		}
	    }
	} else if (class560.aByte7507 == 2) {
	    int i_137_
		= (class560.aShort7511 - aClass556_7314.anInt7459 * -1709472547
		   + aClass556_7314.anInt7461 * -1213435377);
	    if (i_137_ >= 0
		&& i_137_ <= (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377)) {
		int i_138_ = (class560.aShort7509
			      - aClass556_7314.anInt7455 * -380604831
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_138_ < 0)
		    i_138_ = 0;
		else if (i_138_ > (aClass556_7314.anInt7461 * -1213435377
				   + aClass556_7314.anInt7461 * -1213435377))
		    return;
		int i_139_ = (class560.aShort7510
			      - aClass556_7314.anInt7455 * -380604831
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_139_ > (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377))
		    i_139_ = (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377);
		else if (i_139_ < 0)
		    return;
		boolean bool = false;
	    while_46_:
		do {
		    do {
			if (i_138_ > i_139_)
			    break while_46_;
		    } while (!aClass556_7314.aBoolArrayArray7481[i_138_++]
			      [i_137_]);
		    bool = true;
		} while (false);
		if (bool) {
		    float f = (float) (aClass556_7314.anInt7458 * 2104525499
				       - class560.anIntArray7504[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    if (!(f < (float) anInt7338) && method9067(class560, 0)
			&& method9067(class560, 1) && method9067(class560, 2)
			&& method9067(class560, 3))
			aClass560Array7321[anInt7326++] = class560;
		}
	    }
	} else if (class560.aByte7507 == 16 || class560.aByte7507 == 8) {
	    int i_140_
		= (class560.aShort7509 - aClass556_7314.anInt7455 * -380604831
		   + aClass556_7314.anInt7461 * -1213435377);
	    if (i_140_ >= 0
		&& i_140_ <= (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377)) {
		int i_141_ = (class560.aShort7511
			      - aClass556_7314.anInt7459 * -1709472547
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_141_ >= 0
		    && i_141_ <= (aClass556_7314.anInt7461 * -1213435377
				  + aClass556_7314.anInt7461 * -1213435377)
		    && aClass556_7314.aBoolArrayArray7481[i_140_][i_141_]) {
		    float f = (float) (aClass556_7314.anInt7457 * -1983059883
				       - class560.anIntArray7513[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    float f_142_
			= (float) (aClass556_7314.anInt7458 * 2104525499
				   - class560.anIntArray7504[0]);
		    if (f_142_ < 0.0F)
			f_142_ *= -1.0F;
		    if ((!(f < (float) anInt7338)
			 || !(f_142_ < (float) anInt7338))
			&& method9067(class560, 0) && method9067(class560, 1)
			&& method9067(class560, 2) && method9067(class560, 3))
			aClass560Array7321[anInt7326++] = class560;
		}
	    }
	} else if (class560.aByte7507 == 4) {
	    float f = (float) (class560.anIntArray7502[0]
			       - aClass556_7314.anInt7462 * -1172756367);
	    if (!(f <= (float) anInt7317)) {
		int i_143_ = (class560.aShort7511
			      - aClass556_7314.anInt7459 * -1709472547
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_143_ < 0)
		    i_143_ = 0;
		else if (i_143_ > (aClass556_7314.anInt7461 * -1213435377
				   + aClass556_7314.anInt7461 * -1213435377))
		    return;
		int i_144_ = (class560.aShort7512
			      - aClass556_7314.anInt7459 * -1709472547
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_144_ > (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377))
		    i_144_ = (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377);
		else if (i_144_ < 0)
		    return;
		int i_145_ = (class560.aShort7509
			      - aClass556_7314.anInt7455 * -380604831
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_145_ < 0)
		    i_145_ = 0;
		else if (i_145_ > (aClass556_7314.anInt7461 * -1213435377
				   + aClass556_7314.anInt7461 * -1213435377))
		    return;
		int i_146_ = (class560.aShort7510
			      - aClass556_7314.anInt7455 * -380604831
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_146_ > (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377))
		    i_146_ = (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377);
		else if (i_146_ < 0)
		    return;
		boolean bool = false;
	    while_47_:
		for (int i_147_ = i_145_; i_147_ <= i_146_; i_147_++) {
		    for (int i_148_ = i_143_; i_148_ <= i_144_; i_148_++) {
			if (aClass556_7314.aBoolArrayArray7481[i_147_]
			    [i_148_]) {
			    bool = true;
			    break while_47_;
			}
		    }
		}
		if (bool && method9067(class560, 0) && method9067(class560, 1)
		    && method9067(class560, 2) && method9067(class560, 3))
		    aClass560Array7321[anInt7326++] = class560;
	    }
	}
    }
    
    boolean method9064(int i, int i_149_, int i_150_, int i_151_) {
	if (!aBool7324 || !aBool7310)
	    return false;
	if (aClass558_7315.anInt7494 < 101)
	    return false;
	if (!method9062(i, i_149_, i_150_))
	    return false;
	int i_152_ = i_149_ << aClass556_7314.anInt7422 * 941710601;
	int i_153_ = i_150_ << aClass556_7314.anInt7422 * 941710601;
	if (method9092(i_152_,
		       aClass556_7314.aClass151Array7432[i]
			   .method2491(i_149_, i_150_, -1325926032),
		       i_153_, aClass556_7314.anInt7420 * -1935734157, i_151_,
		       aClass556_7314.anInt7420 * -1935734157))
	    return true;
	return false;
    }
    
    boolean method9065(int i, int i_154_, int i_155_, int i_156_, int i_157_,
		       Class564 class564) {
	if (!aBool7324 || !aBool7310)
	    return false;
	if (aClass558_7315.anInt7494 < 101)
	    return false;
	if (i_154_ < 0 || i_156_ < 0
	    || i_155_ >= anIntArrayArrayArray7327[i].length
	    || i_157_ >= anIntArrayArrayArray7327[i][i_154_].length)
	    return false;
	if (i_154_ == i_155_ && i_156_ == i_157_) {
	    if (!method9062(i, i_154_, i_156_))
		return false;
	    if (method9066(class564))
		return true;
	    return false;
	}
	for (int i_158_ = i_154_; i_158_ <= i_155_; i_158_++) {
	    for (int i_159_ = i_156_; i_159_ <= i_157_; i_159_++) {
		if (anIntArrayArrayArray7327[i][i_158_][i_159_]
		    == -(aClass556_7314.anInt7428 * 183737403))
		    return false;
	    }
	}
	if (!method9066(class564))
	    return false;
	return true;
    }
    
    final boolean method9066(Class564 class564) {
	if (class564 == null)
	    return false;
	return method9092(class564.anInt7565, class564.anInt7567,
			  class564.anInt7569,
			  class564.anInt7566 - class564.anInt7565,
			  class564.anInt7568 - class564.anInt7567,
			  class564.anInt7570 - class564.anInt7569);
    }
    
    boolean method9067(Class560 class560, int i) {
	if (!method9061(class560.anIntArray7513[i], class560.anIntArray7502[i],
			class560.anIntArray7504[i]))
	    return false;
	class560.aShortArray7514[i] = (short) (int) aFloatArray7335[0];
	class560.aShortArray7517[i] = (short) (int) aFloatArray7335[1];
	class560.aShortArray7515[i] = (short) (int) aFloatArray7335[2];
	return true;
    }
    
    final boolean method9068(int i, int i_160_, int i_161_, int i_162_,
			     int i_163_, int i_164_, int i_165_, int i_166_,
			     int i_167_) {
	if (!method9061(i, i_160_, i_161_))
	    return false;
	i = (int) aFloatArray7335[0];
	i_160_ = (int) aFloatArray7335[1];
	i_161_ = (int) aFloatArray7335[2];
	if (!method9061(i_162_, i_163_, i_164_))
	    return false;
	i_162_ = (int) aFloatArray7335[0];
	i_163_ = (int) aFloatArray7335[1];
	i_164_ = (int) aFloatArray7335[2];
	if (!method9061(i_165_, i_166_, i_167_))
	    return false;
	i_165_ = (int) aFloatArray7335[0];
	i_166_ = (int) aFloatArray7335[1];
	i_167_ = (int) aFloatArray7335[2];
	return aClass558_7315.method9413(i_160_, i_163_, i_166_, i, i_162_,
					 i_165_, i_161_, i_164_, i_167_);
    }
    
    public void method9069(int i, int i_168_, int i_169_, int i_170_,
			   int i_171_, int i_172_) {
	if (i == 8 || i == 16) {
	    if (i == 8) {
		int i_173_ = i_169_ << aClass556_7314.anInt7422 * 941710601;
		int i_174_ = i_173_ + aClass556_7314.anInt7420 * -1935734157;
		int i_175_ = i_170_ << aClass556_7314.anInt7422 * 941710601;
		int i_176_ = i_175_ + aClass556_7314.anInt7420 * -1935734157;
		int i_177_ = aClass556_7314.aClass151Array7434[i_168_]
				 .method2491(i_169_, i_170_, -941804713);
		int i_178_
		    = aClass556_7314.aClass151Array7434[i_168_]
			  .method2491(i_169_ + 1, i_170_ + 1, 230084855);
		aClass560Array7325[anInt7320++]
		    = new Class560(aClass556_7314, i, i_168_, i_173_, i_174_,
				   i_174_, i_173_, i_177_, i_178_,
				   i_178_ - i_171_, i_177_ - i_171_, i_175_,
				   i_176_, i_176_, i_175_);
	    } else {
		int i_179_ = ((i_169_ << aClass556_7314.anInt7422 * 941710601)
			      + aClass556_7314.anInt7420 * -1935734157);
		int i_180_ = i_179_ - aClass556_7314.anInt7420 * -1935734157;
		int i_181_ = i_170_ << aClass556_7314.anInt7422 * 941710601;
		int i_182_ = i_181_ + aClass556_7314.anInt7420 * -1935734157;
		int i_183_ = aClass556_7314.aClass151Array7434[i_168_]
				 .method2491(i_169_ + 1, i_170_, 2004979249);
		int i_184_ = aClass556_7314.aClass151Array7434[i_168_]
				 .method2491(i_169_, i_170_ + 1, 1375860241);
		aClass560Array7325[anInt7320++]
		    = new Class560(aClass556_7314, i, i_168_, i_179_, i_180_,
				   i_180_, i_179_, i_183_, i_184_,
				   i_184_ - i_171_, i_183_ - i_171_, i_181_,
				   i_182_, i_182_, i_181_);
	    }
	} else {
	    Class568 class568 = (aClass556_7314.aClass568ArrayArrayArray7431
				 [i_168_][i_169_][i_170_]);
	    if (class568 == null)
		aClass556_7314.aClass568ArrayArrayArray7431[i_168_][i_169_]
		    [i_170_]
		    = class568 = new Class568(i_168_);
	    if (i == 1) {
		class568.aShort7603 = (short) i_171_;
		class568.aShort7606 = (short) i_172_;
	    } else if (i == 2) {
		class568.aShort7596 = (short) i_171_;
		class568.aShort7608 = (short) i_172_;
	    }
	    if (aBool7316)
		method9060();
	}
    }
    
    public void method9070(int i, int i_185_, int i_186_, int i_187_) {
	if (i == 8 || i == 16) {
	    for (int i_188_ = 0; i_188_ < anInt7320; i_188_++) {
		Class560 class560 = aClass560Array7325[i_188_];
		if (class560.aByte7507 == i && class560.aByte7508 == i_185_
		    && ((class560.aShort7509 == i_186_
			 && class560.aShort7511 == i_187_)
			|| (class560.aShort7510 == i_186_
			    && class560.aShort7512 == i_187_))) {
		    if (i_188_ != anInt7320)
			System.arraycopy(aClass560Array7325, i_188_ + 1,
					 aClass560Array7325, i_188_,
					 aClass560Array7325.length - (i_188_
								      + 1));
		    anInt7320--;
		    break;
		}
	    }
	} else {
	    Class568 class568 = (aClass556_7314.aClass568ArrayArrayArray7431
				 [i_185_][i_186_][i_187_]);
	    if (class568 != null) {
		if (i == 1)
		    class568.aShort7603 = (short) 0;
		else if (i == 2)
		    class568.aShort7596 = (short) 0;
	    }
	    method9060();
	}
    }
    
    boolean method9071(int i, int i_189_, int i_190_) {
	if (!aBool7324 || !aBool7310)
	    return false;
	if (aClass558_7315.anInt7494 < 101)
	    return false;
	int i_191_ = anIntArrayArrayArray7327[i][i_189_][i_190_];
	if (i_191_ == -(aClass556_7314.anInt7428 * 183737403))
	    return false;
	if (i_191_ == aClass556_7314.anInt7428 * 183737403)
	    return true;
	if (aClass556_7314.aClass151Array7432
	    == aClass556_7314.aClass151Array7436)
	    return false;
	int i_192_ = i_189_ << aClass556_7314.anInt7422 * 941710601;
	int i_193_ = i_190_ << aClass556_7314.anInt7422 * 941710601;
	if (method9068(i_192_ + 1,
		       aClass556_7314.aClass151Array7432[i]
			   .method2491(i_189_, i_190_, 1720130478),
		       i_193_ + 1,
		       i_192_ + aClass556_7314.anInt7420 * -1935734157 - 1,
		       aClass556_7314.aClass151Array7432[i]
			   .method2491(i_189_ + 1, i_190_ + 1, 515683095),
		       i_193_ + aClass556_7314.anInt7420 * -1935734157 - 1,
		       i_192_ + 1,
		       aClass556_7314.aClass151Array7432[i]
			   .method2491(i_189_, i_190_ + 1, 143117070),
		       i_193_ + aClass556_7314.anInt7420 * -1935734157 - 1)
	    && method9068(i_192_ + 1,
			  aClass556_7314.aClass151Array7432[i]
			      .method2491(i_189_, i_190_, -806594155),
			  i_193_ + 1,
			  i_192_ + aClass556_7314.anInt7420 * -1935734157 - 1,
			  aClass556_7314.aClass151Array7432[i]
			      .method2491(i_189_ + 1, i_190_, 1530735731),
			  i_193_ + 1,
			  i_192_ + aClass556_7314.anInt7420 * -1935734157 - 1,
			  aClass556_7314.aClass151Array7432[i]
			      .method2491(i_189_ + 1, i_190_ + 1, 1682906325),
			  (i_193_ + aClass556_7314.anInt7420 * -1935734157
			   - 1))) {
	    anIntArrayArrayArray7327[i][i_189_][i_190_]
		= aClass556_7314.anInt7428 * 183737403;
	    return true;
	}
	anIntArrayArrayArray7327[i][i_189_][i_190_]
	    = -(aClass556_7314.anInt7428 * 183737403);
	return false;
    }
    
    public void method9072(int i, int i_194_, int i_195_, int i_196_) {
	if (i == 8 || i == 16) {
	    for (int i_197_ = 0; i_197_ < anInt7320; i_197_++) {
		Class560 class560 = aClass560Array7325[i_197_];
		if (class560.aByte7507 == i && class560.aByte7508 == i_194_
		    && ((class560.aShort7509 == i_195_
			 && class560.aShort7511 == i_196_)
			|| (class560.aShort7510 == i_195_
			    && class560.aShort7512 == i_196_))) {
		    if (i_197_ != anInt7320)
			System.arraycopy(aClass560Array7325, i_197_ + 1,
					 aClass560Array7325, i_197_,
					 aClass560Array7325.length - (i_197_
								      + 1));
		    anInt7320--;
		    break;
		}
	    }
	} else {
	    Class568 class568 = (aClass556_7314.aClass568ArrayArrayArray7431
				 [i_194_][i_195_][i_196_]);
	    if (class568 != null) {
		if (i == 1)
		    class568.aShort7603 = (short) 0;
		else if (i == 2)
		    class568.aShort7596 = (short) 0;
	    }
	    method9060();
	}
    }
    
    public void method9073() {
	method9060();
    }
    
    public void method9074() {
	method9060();
    }
    
    public void method9075() {
	method9060();
    }
    
    public void method9076(int i, int i_198_, int i_199_, int i_200_,
			   int i_201_, int i_202_) {
	if (i == 8 || i == 16) {
	    if (i == 8) {
		int i_203_ = i_199_ << aClass556_7314.anInt7422 * 941710601;
		int i_204_ = i_203_ + aClass556_7314.anInt7420 * -1935734157;
		int i_205_ = i_200_ << aClass556_7314.anInt7422 * 941710601;
		int i_206_ = i_205_ + aClass556_7314.anInt7420 * -1935734157;
		int i_207_ = aClass556_7314.aClass151Array7434[i_198_]
				 .method2491(i_199_, i_200_, -1602857072);
		int i_208_
		    = aClass556_7314.aClass151Array7434[i_198_]
			  .method2491(i_199_ + 1, i_200_ + 1, 936608736);
		aClass560Array7325[anInt7320++]
		    = new Class560(aClass556_7314, i, i_198_, i_203_, i_204_,
				   i_204_, i_203_, i_207_, i_208_,
				   i_208_ - i_201_, i_207_ - i_201_, i_205_,
				   i_206_, i_206_, i_205_);
	    } else {
		int i_209_ = ((i_199_ << aClass556_7314.anInt7422 * 941710601)
			      + aClass556_7314.anInt7420 * -1935734157);
		int i_210_ = i_209_ - aClass556_7314.anInt7420 * -1935734157;
		int i_211_ = i_200_ << aClass556_7314.anInt7422 * 941710601;
		int i_212_ = i_211_ + aClass556_7314.anInt7420 * -1935734157;
		int i_213_ = aClass556_7314.aClass151Array7434[i_198_]
				 .method2491(i_199_ + 1, i_200_, 1112408690);
		int i_214_ = aClass556_7314.aClass151Array7434[i_198_]
				 .method2491(i_199_, i_200_ + 1, 978883538);
		aClass560Array7325[anInt7320++]
		    = new Class560(aClass556_7314, i, i_198_, i_209_, i_210_,
				   i_210_, i_209_, i_213_, i_214_,
				   i_214_ - i_201_, i_213_ - i_201_, i_211_,
				   i_212_, i_212_, i_211_);
	    }
	} else {
	    Class568 class568 = (aClass556_7314.aClass568ArrayArrayArray7431
				 [i_198_][i_199_][i_200_]);
	    if (class568 == null)
		aClass556_7314.aClass568ArrayArrayArray7431[i_198_][i_199_]
		    [i_200_]
		    = class568 = new Class568(i_198_);
	    if (i == 1) {
		class568.aShort7603 = (short) i_201_;
		class568.aShort7606 = (short) i_202_;
	    } else if (i == 2) {
		class568.aShort7596 = (short) i_201_;
		class568.aShort7608 = (short) i_202_;
	    }
	    if (aBool7316)
		method9060();
	}
    }
    
    public void method9077(int i, int i_215_, int i_216_, int i_217_,
			   int i_218_, int i_219_, int i_220_, int i_221_) {
	aClass560Array7311[anInt7332++]
	    = new Class560(aClass556_7314, i, i_215_, i_216_, i_217_, i_217_,
			   i_216_, i_220_, i_221_, i_221_, i_220_, i_218_,
			   i_218_, i_219_, i_219_);
    }
    
    final boolean method9078(int i, int i_222_, int i_223_) {
	aClass185_7334.method3367((float) i, (float) i_222_, (float) i_223_,
				  aFloatArray7335);
	if (aFloatArray7335[2] < 50.0F)
	    return false;
	aFloatArray7335[0] /= 3.0F;
	aFloatArray7335[1] /= 3.0F;
	return true;
    }
    
    boolean method9079(int i, int i_224_, int i_225_) {
	if (!aBool7324 || !aBool7310)
	    return false;
	if (aClass558_7315.anInt7494 < 101)
	    return false;
	int i_226_ = anIntArrayArrayArray7327[i][i_224_][i_225_];
	if (i_226_ == -(aClass556_7314.anInt7428 * 183737403))
	    return false;
	if (i_226_ == aClass556_7314.anInt7428 * 183737403)
	    return true;
	if (aClass556_7314.aClass151Array7432
	    == aClass556_7314.aClass151Array7436)
	    return false;
	int i_227_ = i_224_ << aClass556_7314.anInt7422 * 941710601;
	int i_228_ = i_225_ << aClass556_7314.anInt7422 * 941710601;
	if (method9068(i_227_ + 1,
		       aClass556_7314.aClass151Array7432[i]
			   .method2491(i_224_, i_225_, 665703539),
		       i_228_ + 1,
		       i_227_ + aClass556_7314.anInt7420 * -1935734157 - 1,
		       aClass556_7314.aClass151Array7432[i]
			   .method2491(i_224_ + 1, i_225_ + 1, 1168360247),
		       i_228_ + aClass556_7314.anInt7420 * -1935734157 - 1,
		       i_227_ + 1,
		       aClass556_7314.aClass151Array7432[i]
			   .method2491(i_224_, i_225_ + 1, -1706636887),
		       i_228_ + aClass556_7314.anInt7420 * -1935734157 - 1)
	    && method9068(i_227_ + 1,
			  aClass556_7314.aClass151Array7432[i]
			      .method2491(i_224_, i_225_, -385742557),
			  i_228_ + 1,
			  i_227_ + aClass556_7314.anInt7420 * -1935734157 - 1,
			  aClass556_7314.aClass151Array7432[i]
			      .method2491(i_224_ + 1, i_225_, 1768849410),
			  i_228_ + 1,
			  i_227_ + aClass556_7314.anInt7420 * -1935734157 - 1,
			  aClass556_7314.aClass151Array7432[i]
			      .method2491(i_224_ + 1, i_225_ + 1, -587934494),
			  (i_228_ + aClass556_7314.anInt7420 * -1935734157
			   - 1))) {
	    anIntArrayArrayArray7327[i][i_224_][i_225_]
		= aClass556_7314.anInt7428 * 183737403;
	    return true;
	}
	anIntArrayArrayArray7327[i][i_224_][i_225_]
	    = -(aClass556_7314.anInt7428 * 183737403);
	return false;
    }
    
    boolean method9080(Class654_Sub1_Sub1 class654_sub1_sub1, int i,
		       int i_229_, int i_230_) {
	if (!aBool7324 || !aBool7310)
	    return false;
	if (aClass558_7315.anInt7494 < 101)
	    return false;
	if (!method9062(i, i_229_, i_230_))
	    return false;
	int i_231_ = i_229_ << aClass556_7314.anInt7422 * 941710601;
	int i_232_ = i_230_ << aClass556_7314.anInt7422 * 941710601;
	int i_233_
	    = (aClass556_7314.aClass151Array7432[i].method2491(i_229_, i_230_,
							       937395272)
	       - 1);
	int i_234_ = i_233_ + class654_sub1_sub1.method16876(-984313820);
	if (class654_sub1_sub1.aShort11823 == 1) {
	    if (!method9068(i_231_, i_233_, i_232_, i_231_, i_234_, i_232_,
			    i_231_, i_234_,
			    i_232_ + aClass556_7314.anInt7420 * -1935734157))
		return false;
	    if (!method9068(i_231_, i_233_, i_232_, i_231_, i_234_,
			    i_232_ + aClass556_7314.anInt7420 * -1935734157,
			    i_231_, i_233_,
			    i_232_ + aClass556_7314.anInt7420 * -1935734157))
		return false;
	    return true;
	}
	if (class654_sub1_sub1.aShort11823 == 2) {
	    if (!method9068(i_231_, i_233_,
			    i_232_ + aClass556_7314.anInt7420 * -1935734157,
			    i_231_ + aClass556_7314.anInt7420 * -1935734157,
			    i_234_,
			    i_232_ + aClass556_7314.anInt7420 * -1935734157,
			    i_231_, i_234_,
			    i_232_ + aClass556_7314.anInt7420 * -1935734157))
		return false;
	    if (!method9068(i_231_, i_233_,
			    i_232_ + aClass556_7314.anInt7420 * -1935734157,
			    i_231_ + aClass556_7314.anInt7420 * -1935734157,
			    i_233_,
			    i_232_ + aClass556_7314.anInt7420 * -1935734157,
			    i_231_ + aClass556_7314.anInt7420 * -1935734157,
			    i_234_,
			    i_232_ + aClass556_7314.anInt7420 * -1935734157))
		return false;
	    return true;
	}
	if (class654_sub1_sub1.aShort11823 == 4) {
	    if (!method9068(i_231_ + aClass556_7314.anInt7420 * -1935734157,
			    i_233_, i_232_,
			    i_231_ + aClass556_7314.anInt7420 * -1935734157,
			    i_234_, i_232_,
			    i_231_ + aClass556_7314.anInt7420 * -1935734157,
			    i_234_,
			    i_232_ + aClass556_7314.anInt7420 * -1935734157))
		return false;
	    if (!method9068(i_231_ + aClass556_7314.anInt7420 * -1935734157,
			    i_233_, i_232_,
			    i_231_ + aClass556_7314.anInt7420 * -1935734157,
			    i_234_,
			    i_232_ + aClass556_7314.anInt7420 * -1935734157,
			    i_231_ + aClass556_7314.anInt7420 * -1935734157,
			    i_233_,
			    i_232_ + aClass556_7314.anInt7420 * -1935734157))
		return false;
	    return true;
	}
	if (class654_sub1_sub1.aShort11823 == 8) {
	    if (!method9068(i_231_, i_233_, i_232_,
			    i_231_ + aClass556_7314.anInt7420 * -1935734157,
			    i_234_, i_232_, i_231_, i_234_, i_232_))
		return false;
	    if (!method9068(i_231_, i_233_, i_232_,
			    i_231_ + aClass556_7314.anInt7420 * -1935734157,
			    i_233_, i_232_,
			    i_231_ + aClass556_7314.anInt7420 * -1935734157,
			    i_234_, i_232_))
		return false;
	    return true;
	}
	if (class654_sub1_sub1.aShort11823 == 16) {
	    if (!method9092(i_231_, i_233_,
			    i_232_ + aClass556_7314.anInt7421 * -1978691487,
			    aClass556_7314.anInt7421 * -1978691487, i_234_,
			    aClass556_7314.anInt7421 * -1978691487))
		return false;
	    return true;
	}
	if (class654_sub1_sub1.aShort11823 == 32) {
	    if (!method9092(i_231_ + aClass556_7314.anInt7421 * -1978691487,
			    i_233_,
			    i_232_ + aClass556_7314.anInt7421 * -1978691487,
			    aClass556_7314.anInt7421 * -1978691487, i_234_,
			    aClass556_7314.anInt7421 * -1978691487))
		return false;
	    return true;
	}
	if (class654_sub1_sub1.aShort11823 == 64) {
	    if (!method9092(i_231_ + aClass556_7314.anInt7421 * -1978691487,
			    i_233_, i_232_,
			    aClass556_7314.anInt7421 * -1978691487, i_234_,
			    aClass556_7314.anInt7421 * -1978691487))
		return false;
	    return true;
	}
	if (class654_sub1_sub1.aShort11823 == 128) {
	    if (!method9092(i_231_, i_233_, i_232_,
			    aClass556_7314.anInt7421 * -1978691487, i_234_,
			    aClass556_7314.anInt7421 * -1978691487))
		return false;
	    return true;
	}
	return true;
    }
    
    void method9081(Class185 class185, int i) {
	aClass185_7334 = class185;
	if (!aBool7324 || !aBool7310)
	    anInt7326 = 0;
	else {
	    if (aBool7339)
		aClass556_7314.aClass27_7466.method859(-1063456719);
	    aClass185_7334.method3252(anIntArray7319);
	    if (anInt7337 != (int) ((float) anIntArray7319[0] / 3.0F)
		|| anInt7309 != (int) ((float) anIntArray7319[1] / 3.0F)) {
		anInt7337 = (int) ((float) anIntArray7319[0] / 3.0F);
		anInt7309 = (int) ((float) anIntArray7319[1] / 3.0F);
		anIntArray7333 = new int[anInt7337 * anInt7309];
	    }
	    anInt7326 = 0;
	    for (int i_235_ = 0; i_235_ < anInt7332; i_235_++)
		method9059(aClass185_7334, aClass560Array7311[i_235_], i);
	    for (int i_236_ = 0; i_236_ < anInt7322; i_236_++)
		method9059(aClass185_7334, aClass560Array7323[i_236_], i);
	    for (int i_237_ = 0; i_237_ < anInt7320; i_237_++)
		method9059(aClass185_7334, aClass560Array7325[i_237_], i);
	    aClass558_7315.anInt7494 = 0;
	    if (anInt7326 > 0) {
		int i_238_ = anIntArray7333.length;
		int i_239_ = i_238_ - i_238_ & 0x7;
		int i_240_ = 0;
		while (i_240_ < i_239_) {
		    anIntArray7333[i_240_++] = 2147483647;
		    anIntArray7333[i_240_++] = 2147483647;
		    anIntArray7333[i_240_++] = 2147483647;
		    anIntArray7333[i_240_++] = 2147483647;
		    anIntArray7333[i_240_++] = 2147483647;
		    anIntArray7333[i_240_++] = 2147483647;
		    anIntArray7333[i_240_++] = 2147483647;
		    anIntArray7333[i_240_++] = 2147483647;
		}
		while (i_240_ < i_238_)
		    anIntArray7333[i_240_++] = 2147483647;
		aClass558_7315.anInt7493 = 1;
		for (int i_241_ = 0; i_241_ < anInt7326; i_241_++) {
		    Class560 class560 = aClass560Array7321[i_241_];
		    aClass558_7315.method9413(class560.aShortArray7517[0],
					      class560.aShortArray7517[1],
					      class560.aShortArray7517[3],
					      class560.aShortArray7514[0],
					      class560.aShortArray7514[1],
					      class560.aShortArray7514[3],
					      class560.aShortArray7515[0],
					      class560.aShortArray7515[1],
					      class560.aShortArray7515[3]);
		    aClass558_7315.method9413(class560.aShortArray7517[1],
					      class560.aShortArray7517[2],
					      class560.aShortArray7517[3],
					      class560.aShortArray7514[1],
					      class560.aShortArray7514[2],
					      class560.aShortArray7514[3],
					      class560.aShortArray7515[1],
					      class560.aShortArray7515[2],
					      class560.aShortArray7515[3]);
		}
		aClass558_7315.anInt7493 = 2;
	    }
	    if (aBool7339)
		aClass556_7314.aClass27_7466.method859(-1063456719);
	}
    }
    
    void method9082(Class185 class185, Class560 class560, int i) {
	aClass185_7334 = class185;
	if (anIntArray7328 != null && class560.aByte7508 >= i) {
	    for (int i_242_ = 0; i_242_ < anIntArray7328.length; i_242_++) {
		if (anIntArray7328[i_242_] != -1000000
		    && (class560.anIntArray7502[0] <= anIntArray7328[i_242_]
			|| class560.anIntArray7502[1] <= anIntArray7328[i_242_]
			|| class560.anIntArray7502[2] <= anIntArray7328[i_242_]
			|| (class560.anIntArray7502[3]
			    <= anIntArray7328[i_242_]))
		    && (class560.anIntArray7513[0] <= anIntArray7330[i_242_]
			|| class560.anIntArray7513[1] <= anIntArray7330[i_242_]
			|| class560.anIntArray7513[2] <= anIntArray7330[i_242_]
			|| (class560.anIntArray7513[3]
			    <= anIntArray7330[i_242_]))
		    && (class560.anIntArray7513[0] >= anIntArray7329[i_242_]
			|| class560.anIntArray7513[1] >= anIntArray7329[i_242_]
			|| class560.anIntArray7513[2] >= anIntArray7329[i_242_]
			|| (class560.anIntArray7513[3]
			    >= anIntArray7329[i_242_]))
		    && (class560.anIntArray7504[0] <= anIntArray7331[i_242_]
			|| class560.anIntArray7504[1] <= anIntArray7331[i_242_]
			|| class560.anIntArray7504[2] <= anIntArray7331[i_242_]
			|| (class560.anIntArray7504[3]
			    <= anIntArray7331[i_242_]))
		    && (class560.anIntArray7504[0] >= anIntArray7336[i_242_]
			|| class560.anIntArray7504[1] >= anIntArray7336[i_242_]
			|| class560.anIntArray7504[2] >= anIntArray7336[i_242_]
			|| (class560.anIntArray7504[3]
			    >= anIntArray7336[i_242_])))
		    return;
	    }
	}
	if (class560.aByte7507 == 1) {
	    int i_243_
		= (class560.aShort7509 - aClass556_7314.anInt7455 * -380604831
		   + aClass556_7314.anInt7461 * -1213435377);
	    if (i_243_ >= 0
		&& i_243_ <= (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377)) {
		int i_244_ = (class560.aShort7511
			      - aClass556_7314.anInt7459 * -1709472547
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_244_ < 0)
		    i_244_ = 0;
		else if (i_244_ > (aClass556_7314.anInt7461 * -1213435377
				   + aClass556_7314.anInt7461 * -1213435377))
		    return;
		int i_245_ = (class560.aShort7512
			      - aClass556_7314.anInt7459 * -1709472547
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_245_ > (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377))
		    i_245_ = (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377);
		else if (i_245_ < 0)
		    return;
		boolean bool = false;
	    while_48_:
		do {
		    do {
			if (i_244_ > i_245_)
			    break while_48_;
		    } while (!aClass556_7314.aBoolArrayArray7481[i_243_]
			      [i_244_++]);
		    bool = true;
		} while (false);
		if (bool) {
		    float f = (float) (aClass556_7314.anInt7457 * -1983059883
				       - class560.anIntArray7513[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    if (!(f < (float) anInt7338) && method9067(class560, 0)
			&& method9067(class560, 1) && method9067(class560, 2)
			&& method9067(class560, 3))
			aClass560Array7321[anInt7326++] = class560;
		}
	    }
	} else if (class560.aByte7507 == 2) {
	    int i_246_
		= (class560.aShort7511 - aClass556_7314.anInt7459 * -1709472547
		   + aClass556_7314.anInt7461 * -1213435377);
	    if (i_246_ >= 0
		&& i_246_ <= (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377)) {
		int i_247_ = (class560.aShort7509
			      - aClass556_7314.anInt7455 * -380604831
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_247_ < 0)
		    i_247_ = 0;
		else if (i_247_ > (aClass556_7314.anInt7461 * -1213435377
				   + aClass556_7314.anInt7461 * -1213435377))
		    return;
		int i_248_ = (class560.aShort7510
			      - aClass556_7314.anInt7455 * -380604831
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_248_ > (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377))
		    i_248_ = (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377);
		else if (i_248_ < 0)
		    return;
		boolean bool = false;
	    while_49_:
		do {
		    do {
			if (i_247_ > i_248_)
			    break while_49_;
		    } while (!aClass556_7314.aBoolArrayArray7481[i_247_++]
			      [i_246_]);
		    bool = true;
		} while (false);
		if (bool) {
		    float f = (float) (aClass556_7314.anInt7458 * 2104525499
				       - class560.anIntArray7504[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    if (!(f < (float) anInt7338) && method9067(class560, 0)
			&& method9067(class560, 1) && method9067(class560, 2)
			&& method9067(class560, 3))
			aClass560Array7321[anInt7326++] = class560;
		}
	    }
	} else if (class560.aByte7507 == 16 || class560.aByte7507 == 8) {
	    int i_249_
		= (class560.aShort7509 - aClass556_7314.anInt7455 * -380604831
		   + aClass556_7314.anInt7461 * -1213435377);
	    if (i_249_ >= 0
		&& i_249_ <= (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377)) {
		int i_250_ = (class560.aShort7511
			      - aClass556_7314.anInt7459 * -1709472547
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_250_ >= 0
		    && i_250_ <= (aClass556_7314.anInt7461 * -1213435377
				  + aClass556_7314.anInt7461 * -1213435377)
		    && aClass556_7314.aBoolArrayArray7481[i_249_][i_250_]) {
		    float f = (float) (aClass556_7314.anInt7457 * -1983059883
				       - class560.anIntArray7513[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    float f_251_
			= (float) (aClass556_7314.anInt7458 * 2104525499
				   - class560.anIntArray7504[0]);
		    if (f_251_ < 0.0F)
			f_251_ *= -1.0F;
		    if ((!(f < (float) anInt7338)
			 || !(f_251_ < (float) anInt7338))
			&& method9067(class560, 0) && method9067(class560, 1)
			&& method9067(class560, 2) && method9067(class560, 3))
			aClass560Array7321[anInt7326++] = class560;
		}
	    }
	} else if (class560.aByte7507 == 4) {
	    float f = (float) (class560.anIntArray7502[0]
			       - aClass556_7314.anInt7462 * -1172756367);
	    if (!(f <= (float) anInt7317)) {
		int i_252_ = (class560.aShort7511
			      - aClass556_7314.anInt7459 * -1709472547
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_252_ < 0)
		    i_252_ = 0;
		else if (i_252_ > (aClass556_7314.anInt7461 * -1213435377
				   + aClass556_7314.anInt7461 * -1213435377))
		    return;
		int i_253_ = (class560.aShort7512
			      - aClass556_7314.anInt7459 * -1709472547
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_253_ > (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377))
		    i_253_ = (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377);
		else if (i_253_ < 0)
		    return;
		int i_254_ = (class560.aShort7509
			      - aClass556_7314.anInt7455 * -380604831
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_254_ < 0)
		    i_254_ = 0;
		else if (i_254_ > (aClass556_7314.anInt7461 * -1213435377
				   + aClass556_7314.anInt7461 * -1213435377))
		    return;
		int i_255_ = (class560.aShort7510
			      - aClass556_7314.anInt7455 * -380604831
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_255_ > (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377))
		    i_255_ = (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377);
		else if (i_255_ < 0)
		    return;
		boolean bool = false;
	    while_50_:
		for (int i_256_ = i_254_; i_256_ <= i_255_; i_256_++) {
		    for (int i_257_ = i_252_; i_257_ <= i_253_; i_257_++) {
			if (aClass556_7314.aBoolArrayArray7481[i_256_]
			    [i_257_]) {
			    bool = true;
			    break while_50_;
			}
		    }
		}
		if (bool && method9067(class560, 0) && method9067(class560, 1)
		    && method9067(class560, 2) && method9067(class560, 3))
		    aClass560Array7321[anInt7326++] = class560;
	    }
	}
    }
    
    void method9083(Class185 class185, int i) {
	aClass185_7334 = class185;
	if (!aBool7324 || !aBool7310)
	    anInt7326 = 0;
	else {
	    if (aBool7339)
		aClass556_7314.aClass27_7466.method859(-1063456719);
	    aClass185_7334.method3252(anIntArray7319);
	    if (anInt7337 != (int) ((float) anIntArray7319[0] / 3.0F)
		|| anInt7309 != (int) ((float) anIntArray7319[1] / 3.0F)) {
		anInt7337 = (int) ((float) anIntArray7319[0] / 3.0F);
		anInt7309 = (int) ((float) anIntArray7319[1] / 3.0F);
		anIntArray7333 = new int[anInt7337 * anInt7309];
	    }
	    anInt7326 = 0;
	    for (int i_258_ = 0; i_258_ < anInt7332; i_258_++)
		method9059(aClass185_7334, aClass560Array7311[i_258_], i);
	    for (int i_259_ = 0; i_259_ < anInt7322; i_259_++)
		method9059(aClass185_7334, aClass560Array7323[i_259_], i);
	    for (int i_260_ = 0; i_260_ < anInt7320; i_260_++)
		method9059(aClass185_7334, aClass560Array7325[i_260_], i);
	    aClass558_7315.anInt7494 = 0;
	    if (anInt7326 > 0) {
		int i_261_ = anIntArray7333.length;
		int i_262_ = i_261_ - i_261_ & 0x7;
		int i_263_ = 0;
		while (i_263_ < i_262_) {
		    anIntArray7333[i_263_++] = 2147483647;
		    anIntArray7333[i_263_++] = 2147483647;
		    anIntArray7333[i_263_++] = 2147483647;
		    anIntArray7333[i_263_++] = 2147483647;
		    anIntArray7333[i_263_++] = 2147483647;
		    anIntArray7333[i_263_++] = 2147483647;
		    anIntArray7333[i_263_++] = 2147483647;
		    anIntArray7333[i_263_++] = 2147483647;
		}
		while (i_263_ < i_261_)
		    anIntArray7333[i_263_++] = 2147483647;
		aClass558_7315.anInt7493 = 1;
		for (int i_264_ = 0; i_264_ < anInt7326; i_264_++) {
		    Class560 class560 = aClass560Array7321[i_264_];
		    aClass558_7315.method9413(class560.aShortArray7517[0],
					      class560.aShortArray7517[1],
					      class560.aShortArray7517[3],
					      class560.aShortArray7514[0],
					      class560.aShortArray7514[1],
					      class560.aShortArray7514[3],
					      class560.aShortArray7515[0],
					      class560.aShortArray7515[1],
					      class560.aShortArray7515[3]);
		    aClass558_7315.method9413(class560.aShortArray7517[1],
					      class560.aShortArray7517[2],
					      class560.aShortArray7517[3],
					      class560.aShortArray7514[1],
					      class560.aShortArray7514[2],
					      class560.aShortArray7514[3],
					      class560.aShortArray7515[1],
					      class560.aShortArray7515[2],
					      class560.aShortArray7515[3]);
		}
		aClass558_7315.anInt7493 = 2;
	    }
	    if (aBool7339)
		aClass556_7314.aClass27_7466.method859(-1063456719);
	}
    }
    
    void method9084(Class185 class185, Class560 class560, int i) {
	aClass185_7334 = class185;
	if (anIntArray7328 != null && class560.aByte7508 >= i) {
	    for (int i_265_ = 0; i_265_ < anIntArray7328.length; i_265_++) {
		if (anIntArray7328[i_265_] != -1000000
		    && (class560.anIntArray7502[0] <= anIntArray7328[i_265_]
			|| class560.anIntArray7502[1] <= anIntArray7328[i_265_]
			|| class560.anIntArray7502[2] <= anIntArray7328[i_265_]
			|| (class560.anIntArray7502[3]
			    <= anIntArray7328[i_265_]))
		    && (class560.anIntArray7513[0] <= anIntArray7330[i_265_]
			|| class560.anIntArray7513[1] <= anIntArray7330[i_265_]
			|| class560.anIntArray7513[2] <= anIntArray7330[i_265_]
			|| (class560.anIntArray7513[3]
			    <= anIntArray7330[i_265_]))
		    && (class560.anIntArray7513[0] >= anIntArray7329[i_265_]
			|| class560.anIntArray7513[1] >= anIntArray7329[i_265_]
			|| class560.anIntArray7513[2] >= anIntArray7329[i_265_]
			|| (class560.anIntArray7513[3]
			    >= anIntArray7329[i_265_]))
		    && (class560.anIntArray7504[0] <= anIntArray7331[i_265_]
			|| class560.anIntArray7504[1] <= anIntArray7331[i_265_]
			|| class560.anIntArray7504[2] <= anIntArray7331[i_265_]
			|| (class560.anIntArray7504[3]
			    <= anIntArray7331[i_265_]))
		    && (class560.anIntArray7504[0] >= anIntArray7336[i_265_]
			|| class560.anIntArray7504[1] >= anIntArray7336[i_265_]
			|| class560.anIntArray7504[2] >= anIntArray7336[i_265_]
			|| (class560.anIntArray7504[3]
			    >= anIntArray7336[i_265_])))
		    return;
	    }
	}
	if (class560.aByte7507 == 1) {
	    int i_266_
		= (class560.aShort7509 - aClass556_7314.anInt7455 * -380604831
		   + aClass556_7314.anInt7461 * -1213435377);
	    if (i_266_ >= 0
		&& i_266_ <= (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377)) {
		int i_267_ = (class560.aShort7511
			      - aClass556_7314.anInt7459 * -1709472547
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_267_ < 0)
		    i_267_ = 0;
		else if (i_267_ > (aClass556_7314.anInt7461 * -1213435377
				   + aClass556_7314.anInt7461 * -1213435377))
		    return;
		int i_268_ = (class560.aShort7512
			      - aClass556_7314.anInt7459 * -1709472547
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_268_ > (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377))
		    i_268_ = (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377);
		else if (i_268_ < 0)
		    return;
		boolean bool = false;
	    while_51_:
		do {
		    do {
			if (i_267_ > i_268_)
			    break while_51_;
		    } while (!aClass556_7314.aBoolArrayArray7481[i_266_]
			      [i_267_++]);
		    bool = true;
		} while (false);
		if (bool) {
		    float f = (float) (aClass556_7314.anInt7457 * -1983059883
				       - class560.anIntArray7513[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    if (!(f < (float) anInt7338) && method9067(class560, 0)
			&& method9067(class560, 1) && method9067(class560, 2)
			&& method9067(class560, 3))
			aClass560Array7321[anInt7326++] = class560;
		}
	    }
	} else if (class560.aByte7507 == 2) {
	    int i_269_
		= (class560.aShort7511 - aClass556_7314.anInt7459 * -1709472547
		   + aClass556_7314.anInt7461 * -1213435377);
	    if (i_269_ >= 0
		&& i_269_ <= (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377)) {
		int i_270_ = (class560.aShort7509
			      - aClass556_7314.anInt7455 * -380604831
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_270_ < 0)
		    i_270_ = 0;
		else if (i_270_ > (aClass556_7314.anInt7461 * -1213435377
				   + aClass556_7314.anInt7461 * -1213435377))
		    return;
		int i_271_ = (class560.aShort7510
			      - aClass556_7314.anInt7455 * -380604831
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_271_ > (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377))
		    i_271_ = (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377);
		else if (i_271_ < 0)
		    return;
		boolean bool = false;
	    while_52_:
		do {
		    do {
			if (i_270_ > i_271_)
			    break while_52_;
		    } while (!aClass556_7314.aBoolArrayArray7481[i_270_++]
			      [i_269_]);
		    bool = true;
		} while (false);
		if (bool) {
		    float f = (float) (aClass556_7314.anInt7458 * 2104525499
				       - class560.anIntArray7504[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    if (!(f < (float) anInt7338) && method9067(class560, 0)
			&& method9067(class560, 1) && method9067(class560, 2)
			&& method9067(class560, 3))
			aClass560Array7321[anInt7326++] = class560;
		}
	    }
	} else if (class560.aByte7507 == 16 || class560.aByte7507 == 8) {
	    int i_272_
		= (class560.aShort7509 - aClass556_7314.anInt7455 * -380604831
		   + aClass556_7314.anInt7461 * -1213435377);
	    if (i_272_ >= 0
		&& i_272_ <= (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377)) {
		int i_273_ = (class560.aShort7511
			      - aClass556_7314.anInt7459 * -1709472547
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_273_ >= 0
		    && i_273_ <= (aClass556_7314.anInt7461 * -1213435377
				  + aClass556_7314.anInt7461 * -1213435377)
		    && aClass556_7314.aBoolArrayArray7481[i_272_][i_273_]) {
		    float f = (float) (aClass556_7314.anInt7457 * -1983059883
				       - class560.anIntArray7513[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    float f_274_
			= (float) (aClass556_7314.anInt7458 * 2104525499
				   - class560.anIntArray7504[0]);
		    if (f_274_ < 0.0F)
			f_274_ *= -1.0F;
		    if ((!(f < (float) anInt7338)
			 || !(f_274_ < (float) anInt7338))
			&& method9067(class560, 0) && method9067(class560, 1)
			&& method9067(class560, 2) && method9067(class560, 3))
			aClass560Array7321[anInt7326++] = class560;
		}
	    }
	} else if (class560.aByte7507 == 4) {
	    float f = (float) (class560.anIntArray7502[0]
			       - aClass556_7314.anInt7462 * -1172756367);
	    if (!(f <= (float) anInt7317)) {
		int i_275_ = (class560.aShort7511
			      - aClass556_7314.anInt7459 * -1709472547
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_275_ < 0)
		    i_275_ = 0;
		else if (i_275_ > (aClass556_7314.anInt7461 * -1213435377
				   + aClass556_7314.anInt7461 * -1213435377))
		    return;
		int i_276_ = (class560.aShort7512
			      - aClass556_7314.anInt7459 * -1709472547
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_276_ > (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377))
		    i_276_ = (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377);
		else if (i_276_ < 0)
		    return;
		int i_277_ = (class560.aShort7509
			      - aClass556_7314.anInt7455 * -380604831
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_277_ < 0)
		    i_277_ = 0;
		else if (i_277_ > (aClass556_7314.anInt7461 * -1213435377
				   + aClass556_7314.anInt7461 * -1213435377))
		    return;
		int i_278_ = (class560.aShort7510
			      - aClass556_7314.anInt7455 * -380604831
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_278_ > (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377))
		    i_278_ = (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377);
		else if (i_278_ < 0)
		    return;
		boolean bool = false;
	    while_53_:
		for (int i_279_ = i_277_; i_279_ <= i_278_; i_279_++) {
		    for (int i_280_ = i_275_; i_280_ <= i_276_; i_280_++) {
			if (aClass556_7314.aBoolArrayArray7481[i_279_]
			    [i_280_]) {
			    bool = true;
			    break while_53_;
			}
		    }
		}
		if (bool && method9067(class560, 0) && method9067(class560, 1)
		    && method9067(class560, 2) && method9067(class560, 3))
		    aClass560Array7321[anInt7326++] = class560;
	    }
	}
    }
    
    void method9085(Class185 class185, Class560 class560, int i) {
	aClass185_7334 = class185;
	if (anIntArray7328 != null && class560.aByte7508 >= i) {
	    for (int i_281_ = 0; i_281_ < anIntArray7328.length; i_281_++) {
		if (anIntArray7328[i_281_] != -1000000
		    && (class560.anIntArray7502[0] <= anIntArray7328[i_281_]
			|| class560.anIntArray7502[1] <= anIntArray7328[i_281_]
			|| class560.anIntArray7502[2] <= anIntArray7328[i_281_]
			|| (class560.anIntArray7502[3]
			    <= anIntArray7328[i_281_]))
		    && (class560.anIntArray7513[0] <= anIntArray7330[i_281_]
			|| class560.anIntArray7513[1] <= anIntArray7330[i_281_]
			|| class560.anIntArray7513[2] <= anIntArray7330[i_281_]
			|| (class560.anIntArray7513[3]
			    <= anIntArray7330[i_281_]))
		    && (class560.anIntArray7513[0] >= anIntArray7329[i_281_]
			|| class560.anIntArray7513[1] >= anIntArray7329[i_281_]
			|| class560.anIntArray7513[2] >= anIntArray7329[i_281_]
			|| (class560.anIntArray7513[3]
			    >= anIntArray7329[i_281_]))
		    && (class560.anIntArray7504[0] <= anIntArray7331[i_281_]
			|| class560.anIntArray7504[1] <= anIntArray7331[i_281_]
			|| class560.anIntArray7504[2] <= anIntArray7331[i_281_]
			|| (class560.anIntArray7504[3]
			    <= anIntArray7331[i_281_]))
		    && (class560.anIntArray7504[0] >= anIntArray7336[i_281_]
			|| class560.anIntArray7504[1] >= anIntArray7336[i_281_]
			|| class560.anIntArray7504[2] >= anIntArray7336[i_281_]
			|| (class560.anIntArray7504[3]
			    >= anIntArray7336[i_281_])))
		    return;
	    }
	}
	if (class560.aByte7507 == 1) {
	    int i_282_
		= (class560.aShort7509 - aClass556_7314.anInt7455 * -380604831
		   + aClass556_7314.anInt7461 * -1213435377);
	    if (i_282_ >= 0
		&& i_282_ <= (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377)) {
		int i_283_ = (class560.aShort7511
			      - aClass556_7314.anInt7459 * -1709472547
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_283_ < 0)
		    i_283_ = 0;
		else if (i_283_ > (aClass556_7314.anInt7461 * -1213435377
				   + aClass556_7314.anInt7461 * -1213435377))
		    return;
		int i_284_ = (class560.aShort7512
			      - aClass556_7314.anInt7459 * -1709472547
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_284_ > (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377))
		    i_284_ = (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377);
		else if (i_284_ < 0)
		    return;
		boolean bool = false;
	    while_54_:
		do {
		    do {
			if (i_283_ > i_284_)
			    break while_54_;
		    } while (!aClass556_7314.aBoolArrayArray7481[i_282_]
			      [i_283_++]);
		    bool = true;
		} while (false);
		if (bool) {
		    float f = (float) (aClass556_7314.anInt7457 * -1983059883
				       - class560.anIntArray7513[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    if (!(f < (float) anInt7338) && method9067(class560, 0)
			&& method9067(class560, 1) && method9067(class560, 2)
			&& method9067(class560, 3))
			aClass560Array7321[anInt7326++] = class560;
		}
	    }
	} else if (class560.aByte7507 == 2) {
	    int i_285_
		= (class560.aShort7511 - aClass556_7314.anInt7459 * -1709472547
		   + aClass556_7314.anInt7461 * -1213435377);
	    if (i_285_ >= 0
		&& i_285_ <= (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377)) {
		int i_286_ = (class560.aShort7509
			      - aClass556_7314.anInt7455 * -380604831
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_286_ < 0)
		    i_286_ = 0;
		else if (i_286_ > (aClass556_7314.anInt7461 * -1213435377
				   + aClass556_7314.anInt7461 * -1213435377))
		    return;
		int i_287_ = (class560.aShort7510
			      - aClass556_7314.anInt7455 * -380604831
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_287_ > (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377))
		    i_287_ = (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377);
		else if (i_287_ < 0)
		    return;
		boolean bool = false;
	    while_55_:
		do {
		    do {
			if (i_286_ > i_287_)
			    break while_55_;
		    } while (!aClass556_7314.aBoolArrayArray7481[i_286_++]
			      [i_285_]);
		    bool = true;
		} while (false);
		if (bool) {
		    float f = (float) (aClass556_7314.anInt7458 * 2104525499
				       - class560.anIntArray7504[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    if (!(f < (float) anInt7338) && method9067(class560, 0)
			&& method9067(class560, 1) && method9067(class560, 2)
			&& method9067(class560, 3))
			aClass560Array7321[anInt7326++] = class560;
		}
	    }
	} else if (class560.aByte7507 == 16 || class560.aByte7507 == 8) {
	    int i_288_
		= (class560.aShort7509 - aClass556_7314.anInt7455 * -380604831
		   + aClass556_7314.anInt7461 * -1213435377);
	    if (i_288_ >= 0
		&& i_288_ <= (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377)) {
		int i_289_ = (class560.aShort7511
			      - aClass556_7314.anInt7459 * -1709472547
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_289_ >= 0
		    && i_289_ <= (aClass556_7314.anInt7461 * -1213435377
				  + aClass556_7314.anInt7461 * -1213435377)
		    && aClass556_7314.aBoolArrayArray7481[i_288_][i_289_]) {
		    float f = (float) (aClass556_7314.anInt7457 * -1983059883
				       - class560.anIntArray7513[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    float f_290_
			= (float) (aClass556_7314.anInt7458 * 2104525499
				   - class560.anIntArray7504[0]);
		    if (f_290_ < 0.0F)
			f_290_ *= -1.0F;
		    if ((!(f < (float) anInt7338)
			 || !(f_290_ < (float) anInt7338))
			&& method9067(class560, 0) && method9067(class560, 1)
			&& method9067(class560, 2) && method9067(class560, 3))
			aClass560Array7321[anInt7326++] = class560;
		}
	    }
	} else if (class560.aByte7507 == 4) {
	    float f = (float) (class560.anIntArray7502[0]
			       - aClass556_7314.anInt7462 * -1172756367);
	    if (!(f <= (float) anInt7317)) {
		int i_291_ = (class560.aShort7511
			      - aClass556_7314.anInt7459 * -1709472547
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_291_ < 0)
		    i_291_ = 0;
		else if (i_291_ > (aClass556_7314.anInt7461 * -1213435377
				   + aClass556_7314.anInt7461 * -1213435377))
		    return;
		int i_292_ = (class560.aShort7512
			      - aClass556_7314.anInt7459 * -1709472547
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_292_ > (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377))
		    i_292_ = (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377);
		else if (i_292_ < 0)
		    return;
		int i_293_ = (class560.aShort7509
			      - aClass556_7314.anInt7455 * -380604831
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_293_ < 0)
		    i_293_ = 0;
		else if (i_293_ > (aClass556_7314.anInt7461 * -1213435377
				   + aClass556_7314.anInt7461 * -1213435377))
		    return;
		int i_294_ = (class560.aShort7510
			      - aClass556_7314.anInt7455 * -380604831
			      + aClass556_7314.anInt7461 * -1213435377);
		if (i_294_ > (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377))
		    i_294_ = (aClass556_7314.anInt7461 * -1213435377
			      + aClass556_7314.anInt7461 * -1213435377);
		else if (i_294_ < 0)
		    return;
		boolean bool = false;
	    while_56_:
		for (int i_295_ = i_293_; i_295_ <= i_294_; i_295_++) {
		    for (int i_296_ = i_291_; i_296_ <= i_292_; i_296_++) {
			if (aClass556_7314.aBoolArrayArray7481[i_295_]
			    [i_296_]) {
			    bool = true;
			    break while_56_;
			}
		    }
		}
		if (bool && method9067(class560, 0) && method9067(class560, 1)
		    && method9067(class560, 2) && method9067(class560, 3))
		    aClass560Array7321[anInt7326++] = class560;
	    }
	}
    }
    
    boolean method9086(Class560 class560, int i) {
	if (!method9061(class560.anIntArray7513[i], class560.anIntArray7502[i],
			class560.anIntArray7504[i]))
	    return false;
	class560.aShortArray7514[i] = (short) (int) aFloatArray7335[0];
	class560.aShortArray7517[i] = (short) (int) aFloatArray7335[1];
	class560.aShortArray7515[i] = (short) (int) aFloatArray7335[2];
	return true;
    }
    
    void method9087(Class185 class185, int i) {
	aClass185_7334 = class185;
	if (!aBool7324 || !aBool7310)
	    anInt7326 = 0;
	else {
	    if (aBool7339)
		aClass556_7314.aClass27_7466.method859(-1063456719);
	    aClass185_7334.method3252(anIntArray7319);
	    if (anInt7337 != (int) ((float) anIntArray7319[0] / 3.0F)
		|| anInt7309 != (int) ((float) anIntArray7319[1] / 3.0F)) {
		anInt7337 = (int) ((float) anIntArray7319[0] / 3.0F);
		anInt7309 = (int) ((float) anIntArray7319[1] / 3.0F);
		anIntArray7333 = new int[anInt7337 * anInt7309];
	    }
	    anInt7326 = 0;
	    for (int i_297_ = 0; i_297_ < anInt7332; i_297_++)
		method9059(aClass185_7334, aClass560Array7311[i_297_], i);
	    for (int i_298_ = 0; i_298_ < anInt7322; i_298_++)
		method9059(aClass185_7334, aClass560Array7323[i_298_], i);
	    for (int i_299_ = 0; i_299_ < anInt7320; i_299_++)
		method9059(aClass185_7334, aClass560Array7325[i_299_], i);
	    aClass558_7315.anInt7494 = 0;
	    if (anInt7326 > 0) {
		int i_300_ = anIntArray7333.length;
		int i_301_ = i_300_ - i_300_ & 0x7;
		int i_302_ = 0;
		while (i_302_ < i_301_) {
		    anIntArray7333[i_302_++] = 2147483647;
		    anIntArray7333[i_302_++] = 2147483647;
		    anIntArray7333[i_302_++] = 2147483647;
		    anIntArray7333[i_302_++] = 2147483647;
		    anIntArray7333[i_302_++] = 2147483647;
		    anIntArray7333[i_302_++] = 2147483647;
		    anIntArray7333[i_302_++] = 2147483647;
		    anIntArray7333[i_302_++] = 2147483647;
		}
		while (i_302_ < i_300_)
		    anIntArray7333[i_302_++] = 2147483647;
		aClass558_7315.anInt7493 = 1;
		for (int i_303_ = 0; i_303_ < anInt7326; i_303_++) {
		    Class560 class560 = aClass560Array7321[i_303_];
		    aClass558_7315.method9413(class560.aShortArray7517[0],
					      class560.aShortArray7517[1],
					      class560.aShortArray7517[3],
					      class560.aShortArray7514[0],
					      class560.aShortArray7514[1],
					      class560.aShortArray7514[3],
					      class560.aShortArray7515[0],
					      class560.aShortArray7515[1],
					      class560.aShortArray7515[3]);
		    aClass558_7315.method9413(class560.aShortArray7517[1],
					      class560.aShortArray7517[2],
					      class560.aShortArray7517[3],
					      class560.aShortArray7514[1],
					      class560.aShortArray7514[2],
					      class560.aShortArray7514[3],
					      class560.aShortArray7515[1],
					      class560.aShortArray7515[2],
					      class560.aShortArray7515[3]);
		}
		aClass558_7315.anInt7493 = 2;
	    }
	    if (aBool7339)
		aClass556_7314.aClass27_7466.method859(-1063456719);
	}
    }
    
    final boolean method9088(int i, int i_304_, int i_305_) {
	aClass185_7334.method3367((float) i, (float) i_304_, (float) i_305_,
				  aFloatArray7335);
	if (aFloatArray7335[2] < 50.0F)
	    return false;
	aFloatArray7335[0] /= 3.0F;
	aFloatArray7335[1] /= 3.0F;
	return true;
    }
    
    final boolean method9089(int i, int i_306_, int i_307_) {
	aClass185_7334.method3367((float) i, (float) i_306_, (float) i_307_,
				  aFloatArray7335);
	if (aFloatArray7335[2] < 50.0F)
	    return false;
	aFloatArray7335[0] /= 3.0F;
	aFloatArray7335[1] /= 3.0F;
	return true;
    }
    
    public void method9090() {
	method9060();
    }
    
    void method9091(Class185 class185, int i) {
	aClass185_7334 = class185;
	if (!aBool7324 || !aBool7310)
	    anInt7326 = 0;
	else {
	    if (aBool7339)
		aClass556_7314.aClass27_7466.method859(-1063456719);
	    aClass185_7334.method3252(anIntArray7319);
	    if (anInt7337 != (int) ((float) anIntArray7319[0] / 3.0F)
		|| anInt7309 != (int) ((float) anIntArray7319[1] / 3.0F)) {
		anInt7337 = (int) ((float) anIntArray7319[0] / 3.0F);
		anInt7309 = (int) ((float) anIntArray7319[1] / 3.0F);
		anIntArray7333 = new int[anInt7337 * anInt7309];
	    }
	    anInt7326 = 0;
	    for (int i_308_ = 0; i_308_ < anInt7332; i_308_++)
		method9059(aClass185_7334, aClass560Array7311[i_308_], i);
	    for (int i_309_ = 0; i_309_ < anInt7322; i_309_++)
		method9059(aClass185_7334, aClass560Array7323[i_309_], i);
	    for (int i_310_ = 0; i_310_ < anInt7320; i_310_++)
		method9059(aClass185_7334, aClass560Array7325[i_310_], i);
	    aClass558_7315.anInt7494 = 0;
	    if (anInt7326 > 0) {
		int i_311_ = anIntArray7333.length;
		int i_312_ = i_311_ - i_311_ & 0x7;
		int i_313_ = 0;
		while (i_313_ < i_312_) {
		    anIntArray7333[i_313_++] = 2147483647;
		    anIntArray7333[i_313_++] = 2147483647;
		    anIntArray7333[i_313_++] = 2147483647;
		    anIntArray7333[i_313_++] = 2147483647;
		    anIntArray7333[i_313_++] = 2147483647;
		    anIntArray7333[i_313_++] = 2147483647;
		    anIntArray7333[i_313_++] = 2147483647;
		    anIntArray7333[i_313_++] = 2147483647;
		}
		while (i_313_ < i_311_)
		    anIntArray7333[i_313_++] = 2147483647;
		aClass558_7315.anInt7493 = 1;
		for (int i_314_ = 0; i_314_ < anInt7326; i_314_++) {
		    Class560 class560 = aClass560Array7321[i_314_];
		    aClass558_7315.method9413(class560.aShortArray7517[0],
					      class560.aShortArray7517[1],
					      class560.aShortArray7517[3],
					      class560.aShortArray7514[0],
					      class560.aShortArray7514[1],
					      class560.aShortArray7514[3],
					      class560.aShortArray7515[0],
					      class560.aShortArray7515[1],
					      class560.aShortArray7515[3]);
		    aClass558_7315.method9413(class560.aShortArray7517[1],
					      class560.aShortArray7517[2],
					      class560.aShortArray7517[3],
					      class560.aShortArray7514[1],
					      class560.aShortArray7514[2],
					      class560.aShortArray7514[3],
					      class560.aShortArray7515[1],
					      class560.aShortArray7515[2],
					      class560.aShortArray7515[3]);
		}
		aClass558_7315.anInt7493 = 2;
	    }
	    if (aBool7339)
		aClass556_7314.aClass27_7466.method859(-1063456719);
	}
    }
    
    final boolean method9092(int i, int i_315_, int i_316_, int i_317_,
			     int i_318_, int i_319_) {
	int i_320_ = i + i_317_;
	int i_321_ = i_315_ + i_318_;
	int i_322_ = i_316_ + i_319_;
	if (!method9068(i, i_321_, i_316_, i_320_, i_321_, i_322_, i, i_321_,
			i_322_))
	    return false;
	if (!method9068(i, i_321_, i_316_, i_320_, i_321_, i_316_, i_320_,
			i_321_, i_322_))
	    return false;
	if (i < aClass556_7314.anInt7457 * -1983059883) {
	    if (!method9068(i, i_315_, i_322_, i, i_321_, i_316_, i, i_321_,
			    i_322_))
		return false;
	    if (!method9068(i, i_315_, i_322_, i, i_315_, i_316_, i, i_321_,
			    i_316_))
		return false;
	} else {
	    if (!method9068(i_320_, i_315_, i_322_, i_320_, i_321_, i_316_,
			    i_320_, i_321_, i_322_))
		return false;
	    if (!method9068(i_320_, i_315_, i_322_, i_320_, i_315_, i_316_,
			    i_320_, i_321_, i_316_))
		return false;
	}
	if (i_316_ < aClass556_7314.anInt7458 * 2104525499) {
	    if (!method9068(i, i_315_, i_316_, i_320_, i_321_, i_316_, i,
			    i_321_, i_316_))
		return false;
	    if (!method9068(i, i_315_, i_316_, i_320_, i_315_, i_316_, i_320_,
			    i_321_, i_316_))
		return false;
	} else {
	    if (!method9068(i, i_315_, i_322_, i_320_, i_321_, i_322_, i,
			    i_321_, i_322_))
		return false;
	    if (!method9068(i, i_315_, i_322_, i_320_, i_315_, i_322_, i_320_,
			    i_321_, i_322_))
		return false;
	}
	return true;
    }
    
    boolean method9093(int i, int i_323_, int i_324_) {
	if (!aBool7324 || !aBool7310)
	    return false;
	if (aClass558_7315.anInt7494 < 101)
	    return false;
	int i_325_ = anIntArrayArrayArray7327[i][i_323_][i_324_];
	if (i_325_ == -(aClass556_7314.anInt7428 * 183737403))
	    return false;
	if (i_325_ == aClass556_7314.anInt7428 * 183737403)
	    return true;
	if (aClass556_7314.aClass151Array7432
	    == aClass556_7314.aClass151Array7436)
	    return false;
	int i_326_ = i_323_ << aClass556_7314.anInt7422 * 941710601;
	int i_327_ = i_324_ << aClass556_7314.anInt7422 * 941710601;
	if (method9068(i_326_ + 1,
		       aClass556_7314.aClass151Array7432[i]
			   .method2491(i_323_, i_324_, 1380595989),
		       i_327_ + 1,
		       i_326_ + aClass556_7314.anInt7420 * -1935734157 - 1,
		       aClass556_7314.aClass151Array7432[i]
			   .method2491(i_323_ + 1, i_324_ + 1, 171038569),
		       i_327_ + aClass556_7314.anInt7420 * -1935734157 - 1,
		       i_326_ + 1,
		       aClass556_7314.aClass151Array7432[i]
			   .method2491(i_323_, i_324_ + 1, 1582766442),
		       i_327_ + aClass556_7314.anInt7420 * -1935734157 - 1)
	    && method9068(i_326_ + 1,
			  aClass556_7314.aClass151Array7432[i]
			      .method2491(i_323_, i_324_, 2016963115),
			  i_327_ + 1,
			  i_326_ + aClass556_7314.anInt7420 * -1935734157 - 1,
			  aClass556_7314.aClass151Array7432[i]
			      .method2491(i_323_ + 1, i_324_, 725435087),
			  i_327_ + 1,
			  i_326_ + aClass556_7314.anInt7420 * -1935734157 - 1,
			  aClass556_7314.aClass151Array7432[i]
			      .method2491(i_323_ + 1, i_324_ + 1, 535722468),
			  (i_327_ + aClass556_7314.anInt7420 * -1935734157
			   - 1))) {
	    anIntArrayArrayArray7327[i][i_323_][i_324_]
		= aClass556_7314.anInt7428 * 183737403;
	    return true;
	}
	anIntArrayArrayArray7327[i][i_323_][i_324_]
	    = -(aClass556_7314.anInt7428 * 183737403);
	return false;
    }
    
    boolean method9094(Class654_Sub1_Sub1 class654_sub1_sub1, int i,
		       int i_328_, int i_329_) {
	if (!aBool7324 || !aBool7310)
	    return false;
	if (aClass558_7315.anInt7494 < 101)
	    return false;
	if (!method9062(i, i_328_, i_329_))
	    return false;
	int i_330_ = i_328_ << aClass556_7314.anInt7422 * 941710601;
	int i_331_ = i_329_ << aClass556_7314.anInt7422 * 941710601;
	int i_332_
	    = (aClass556_7314.aClass151Array7432[i].method2491(i_328_, i_329_,
							       -1135066200)
	       - 1);
	int i_333_ = i_332_ + class654_sub1_sub1.method16876(-1673713584);
	if (class654_sub1_sub1.aShort11823 == 1) {
	    if (!method9068(i_330_, i_332_, i_331_, i_330_, i_333_, i_331_,
			    i_330_, i_333_,
			    i_331_ + aClass556_7314.anInt7420 * -1935734157))
		return false;
	    if (!method9068(i_330_, i_332_, i_331_, i_330_, i_333_,
			    i_331_ + aClass556_7314.anInt7420 * -1935734157,
			    i_330_, i_332_,
			    i_331_ + aClass556_7314.anInt7420 * -1935734157))
		return false;
	    return true;
	}
	if (class654_sub1_sub1.aShort11823 == 2) {
	    if (!method9068(i_330_, i_332_,
			    i_331_ + aClass556_7314.anInt7420 * -1935734157,
			    i_330_ + aClass556_7314.anInt7420 * -1935734157,
			    i_333_,
			    i_331_ + aClass556_7314.anInt7420 * -1935734157,
			    i_330_, i_333_,
			    i_331_ + aClass556_7314.anInt7420 * -1935734157))
		return false;
	    if (!method9068(i_330_, i_332_,
			    i_331_ + aClass556_7314.anInt7420 * -1935734157,
			    i_330_ + aClass556_7314.anInt7420 * -1935734157,
			    i_332_,
			    i_331_ + aClass556_7314.anInt7420 * -1935734157,
			    i_330_ + aClass556_7314.anInt7420 * -1935734157,
			    i_333_,
			    i_331_ + aClass556_7314.anInt7420 * -1935734157))
		return false;
	    return true;
	}
	if (class654_sub1_sub1.aShort11823 == 4) {
	    if (!method9068(i_330_ + aClass556_7314.anInt7420 * -1935734157,
			    i_332_, i_331_,
			    i_330_ + aClass556_7314.anInt7420 * -1935734157,
			    i_333_, i_331_,
			    i_330_ + aClass556_7314.anInt7420 * -1935734157,
			    i_333_,
			    i_331_ + aClass556_7314.anInt7420 * -1935734157))
		return false;
	    if (!method9068(i_330_ + aClass556_7314.anInt7420 * -1935734157,
			    i_332_, i_331_,
			    i_330_ + aClass556_7314.anInt7420 * -1935734157,
			    i_333_,
			    i_331_ + aClass556_7314.anInt7420 * -1935734157,
			    i_330_ + aClass556_7314.anInt7420 * -1935734157,
			    i_332_,
			    i_331_ + aClass556_7314.anInt7420 * -1935734157))
		return false;
	    return true;
	}
	if (class654_sub1_sub1.aShort11823 == 8) {
	    if (!method9068(i_330_, i_332_, i_331_,
			    i_330_ + aClass556_7314.anInt7420 * -1935734157,
			    i_333_, i_331_, i_330_, i_333_, i_331_))
		return false;
	    if (!method9068(i_330_, i_332_, i_331_,
			    i_330_ + aClass556_7314.anInt7420 * -1935734157,
			    i_332_, i_331_,
			    i_330_ + aClass556_7314.anInt7420 * -1935734157,
			    i_333_, i_331_))
		return false;
	    return true;
	}
	if (class654_sub1_sub1.aShort11823 == 16) {
	    if (!method9092(i_330_, i_332_,
			    i_331_ + aClass556_7314.anInt7421 * -1978691487,
			    aClass556_7314.anInt7421 * -1978691487, i_333_,
			    aClass556_7314.anInt7421 * -1978691487))
		return false;
	    return true;
	}
	if (class654_sub1_sub1.aShort11823 == 32) {
	    if (!method9092(i_330_ + aClass556_7314.anInt7421 * -1978691487,
			    i_332_,
			    i_331_ + aClass556_7314.anInt7421 * -1978691487,
			    aClass556_7314.anInt7421 * -1978691487, i_333_,
			    aClass556_7314.anInt7421 * -1978691487))
		return false;
	    return true;
	}
	if (class654_sub1_sub1.aShort11823 == 64) {
	    if (!method9092(i_330_ + aClass556_7314.anInt7421 * -1978691487,
			    i_332_, i_331_,
			    aClass556_7314.anInt7421 * -1978691487, i_333_,
			    aClass556_7314.anInt7421 * -1978691487))
		return false;
	    return true;
	}
	if (class654_sub1_sub1.aShort11823 == 128) {
	    if (!method9092(i_330_, i_332_, i_331_,
			    aClass556_7314.anInt7421 * -1978691487, i_333_,
			    aClass556_7314.anInt7421 * -1978691487))
		return false;
	    return true;
	}
	return true;
    }
    
    public void method9095(int i, int i_334_, int i_335_, int i_336_) {
	if (i == 8 || i == 16) {
	    for (int i_337_ = 0; i_337_ < anInt7320; i_337_++) {
		Class560 class560 = aClass560Array7325[i_337_];
		if (class560.aByte7507 == i && class560.aByte7508 == i_334_
		    && ((class560.aShort7509 == i_335_
			 && class560.aShort7511 == i_336_)
			|| (class560.aShort7510 == i_335_
			    && class560.aShort7512 == i_336_))) {
		    if (i_337_ != anInt7320)
			System.arraycopy(aClass560Array7325, i_337_ + 1,
					 aClass560Array7325, i_337_,
					 aClass560Array7325.length - (i_337_
								      + 1));
		    anInt7320--;
		    break;
		}
	    }
	} else {
	    Class568 class568 = (aClass556_7314.aClass568ArrayArrayArray7431
				 [i_334_][i_335_][i_336_]);
	    if (class568 != null) {
		if (i == 1)
		    class568.aShort7603 = (short) 0;
		else if (i == 2)
		    class568.aShort7596 = (short) 0;
	    }
	    method9060();
	}
    }
    
    boolean method9096(int i, int i_338_, int i_339_, int i_340_) {
	if (!aBool7324 || !aBool7310)
	    return false;
	if (aClass558_7315.anInt7494 < 101)
	    return false;
	if (!method9062(i, i_338_, i_339_))
	    return false;
	int i_341_ = i_338_ << aClass556_7314.anInt7422 * 941710601;
	int i_342_ = i_339_ << aClass556_7314.anInt7422 * 941710601;
	if (method9092(i_341_,
		       aClass556_7314.aClass151Array7432[i]
			   .method2491(i_338_, i_339_, 1473588031),
		       i_342_, aClass556_7314.anInt7420 * -1935734157, i_340_,
		       aClass556_7314.anInt7420 * -1935734157))
	    return true;
	return false;
    }
    
    boolean method9097(int i, int i_343_, int i_344_, int i_345_, int i_346_,
		       Class564 class564) {
	if (!aBool7324 || !aBool7310)
	    return false;
	if (aClass558_7315.anInt7494 < 101)
	    return false;
	if (i_343_ < 0 || i_345_ < 0
	    || i_344_ >= anIntArrayArrayArray7327[i].length
	    || i_346_ >= anIntArrayArrayArray7327[i][i_343_].length)
	    return false;
	if (i_343_ == i_344_ && i_345_ == i_346_) {
	    if (!method9062(i, i_343_, i_345_))
		return false;
	    if (method9066(class564))
		return true;
	    return false;
	}
	for (int i_347_ = i_343_; i_347_ <= i_344_; i_347_++) {
	    for (int i_348_ = i_345_; i_348_ <= i_346_; i_348_++) {
		if (anIntArrayArrayArray7327[i][i_347_][i_348_]
		    == -(aClass556_7314.anInt7428 * 183737403))
		    return false;
	    }
	}
	if (!method9066(class564))
	    return false;
	return true;
    }
    
    final boolean method9098(int i, int i_349_, int i_350_, int i_351_,
			     int i_352_, int i_353_) {
	int i_354_ = i + i_351_;
	int i_355_ = i_349_ + i_352_;
	int i_356_ = i_350_ + i_353_;
	if (!method9068(i, i_355_, i_350_, i_354_, i_355_, i_356_, i, i_355_,
			i_356_))
	    return false;
	if (!method9068(i, i_355_, i_350_, i_354_, i_355_, i_350_, i_354_,
			i_355_, i_356_))
	    return false;
	if (i < aClass556_7314.anInt7457 * -1983059883) {
	    if (!method9068(i, i_349_, i_356_, i, i_355_, i_350_, i, i_355_,
			    i_356_))
		return false;
	    if (!method9068(i, i_349_, i_356_, i, i_349_, i_350_, i, i_355_,
			    i_350_))
		return false;
	} else {
	    if (!method9068(i_354_, i_349_, i_356_, i_354_, i_355_, i_350_,
			    i_354_, i_355_, i_356_))
		return false;
	    if (!method9068(i_354_, i_349_, i_356_, i_354_, i_349_, i_350_,
			    i_354_, i_355_, i_350_))
		return false;
	}
	if (i_350_ < aClass556_7314.anInt7458 * 2104525499) {
	    if (!method9068(i, i_349_, i_350_, i_354_, i_355_, i_350_, i,
			    i_355_, i_350_))
		return false;
	    if (!method9068(i, i_349_, i_350_, i_354_, i_349_, i_350_, i_354_,
			    i_355_, i_350_))
		return false;
	} else {
	    if (!method9068(i, i_349_, i_356_, i_354_, i_355_, i_356_, i,
			    i_355_, i_356_))
		return false;
	    if (!method9068(i, i_349_, i_356_, i_354_, i_349_, i_356_, i_354_,
			    i_355_, i_356_))
		return false;
	}
	return true;
    }
    
    final boolean method9099(int i, int i_357_, int i_358_, int i_359_,
			     int i_360_, int i_361_) {
	int i_362_ = i + i_359_;
	int i_363_ = i_357_ + i_360_;
	int i_364_ = i_358_ + i_361_;
	if (!method9068(i, i_363_, i_358_, i_362_, i_363_, i_364_, i, i_363_,
			i_364_))
	    return false;
	if (!method9068(i, i_363_, i_358_, i_362_, i_363_, i_358_, i_362_,
			i_363_, i_364_))
	    return false;
	if (i < aClass556_7314.anInt7457 * -1983059883) {
	    if (!method9068(i, i_357_, i_364_, i, i_363_, i_358_, i, i_363_,
			    i_364_))
		return false;
	    if (!method9068(i, i_357_, i_364_, i, i_357_, i_358_, i, i_363_,
			    i_358_))
		return false;
	} else {
	    if (!method9068(i_362_, i_357_, i_364_, i_362_, i_363_, i_358_,
			    i_362_, i_363_, i_364_))
		return false;
	    if (!method9068(i_362_, i_357_, i_364_, i_362_, i_357_, i_358_,
			    i_362_, i_363_, i_358_))
		return false;
	}
	if (i_358_ < aClass556_7314.anInt7458 * 2104525499) {
	    if (!method9068(i, i_357_, i_358_, i_362_, i_363_, i_358_, i,
			    i_363_, i_358_))
		return false;
	    if (!method9068(i, i_357_, i_358_, i_362_, i_357_, i_358_, i_362_,
			    i_363_, i_358_))
		return false;
	} else {
	    if (!method9068(i, i_357_, i_364_, i_362_, i_363_, i_364_, i,
			    i_363_, i_364_))
		return false;
	    if (!method9068(i, i_357_, i_364_, i_362_, i_357_, i_364_, i_362_,
			    i_363_, i_364_))
		return false;
	}
	return true;
    }
    
    final boolean method9100(int i, int i_365_, int i_366_, int i_367_,
			     int i_368_, int i_369_) {
	int i_370_ = i + i_367_;
	int i_371_ = i_365_ + i_368_;
	int i_372_ = i_366_ + i_369_;
	if (!method9068(i, i_371_, i_366_, i_370_, i_371_, i_372_, i, i_371_,
			i_372_))
	    return false;
	if (!method9068(i, i_371_, i_366_, i_370_, i_371_, i_366_, i_370_,
			i_371_, i_372_))
	    return false;
	if (i < aClass556_7314.anInt7457 * -1983059883) {
	    if (!method9068(i, i_365_, i_372_, i, i_371_, i_366_, i, i_371_,
			    i_372_))
		return false;
	    if (!method9068(i, i_365_, i_372_, i, i_365_, i_366_, i, i_371_,
			    i_366_))
		return false;
	} else {
	    if (!method9068(i_370_, i_365_, i_372_, i_370_, i_371_, i_366_,
			    i_370_, i_371_, i_372_))
		return false;
	    if (!method9068(i_370_, i_365_, i_372_, i_370_, i_365_, i_366_,
			    i_370_, i_371_, i_366_))
		return false;
	}
	if (i_366_ < aClass556_7314.anInt7458 * 2104525499) {
	    if (!method9068(i, i_365_, i_366_, i_370_, i_371_, i_366_, i,
			    i_371_, i_366_))
		return false;
	    if (!method9068(i, i_365_, i_366_, i_370_, i_365_, i_366_, i_370_,
			    i_371_, i_366_))
		return false;
	} else {
	    if (!method9068(i, i_365_, i_372_, i_370_, i_371_, i_372_, i,
			    i_371_, i_372_))
		return false;
	    if (!method9068(i, i_365_, i_372_, i_370_, i_365_, i_372_, i_370_,
			    i_371_, i_372_))
		return false;
	}
	return true;
    }
    
    final boolean method9101(int i, int i_373_, int i_374_, int i_375_,
			     int i_376_, int i_377_, int i_378_, int i_379_,
			     int i_380_) {
	if (!method9061(i, i_373_, i_374_))
	    return false;
	i = (int) aFloatArray7335[0];
	i_373_ = (int) aFloatArray7335[1];
	i_374_ = (int) aFloatArray7335[2];
	if (!method9061(i_375_, i_376_, i_377_))
	    return false;
	i_375_ = (int) aFloatArray7335[0];
	i_376_ = (int) aFloatArray7335[1];
	i_377_ = (int) aFloatArray7335[2];
	if (!method9061(i_378_, i_379_, i_380_))
	    return false;
	i_378_ = (int) aFloatArray7335[0];
	i_379_ = (int) aFloatArray7335[1];
	i_380_ = (int) aFloatArray7335[2];
	return aClass558_7315.method9413(i_373_, i_376_, i_379_, i, i_375_,
					 i_378_, i_374_, i_377_, i_380_);
    }
}
