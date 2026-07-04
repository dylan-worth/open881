/* Class534_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class534_Sub3 extends Class534
{
    Class9 aClass9_10376;
    Class151_Sub1 aClass151_Sub1_10377;
    Class534_Sub21 aClass534_Sub21_10378;
    int anInt10379;
    int anInt10380;
    int anInt10381;
    Class534_Sub40_Sub2 aClass534_Sub40_Sub2_10382;
    Class129 aClass129_10383;
    int anInt10384;
    Interface16 anInterface16_10385;
    Class185_Sub3 aClass185_Sub3_10386;
    Class129 aClass129_10387;
    float[][] aFloatArrayArray10388;
    float[][] aFloatArrayArray10389;
    int anInt10390;
    float[][] aFloatArrayArray10391;
    int anInt10392;
    Interface15 anInterface15_10393;
    Class534_Sub40 aClass534_Sub40_10394;
    
    void method16019(short i) {
	if (aClass185_Sub3_10386.aBool9566)
	    aClass534_Sub40_10394.method16507(i, 1756142812);
	else
	    aClass534_Sub40_10394.method16721(i, 1203548667);
    }
    
    Class534_Sub3(Class185_Sub3 class185_sub3, Class151_Sub1 class151_sub1,
		  Class534_Sub21 class534_sub21, int[] is) {
	aClass185_Sub3_10386 = class185_sub3;
	aClass534_Sub21_10378 = class534_sub21;
	aClass151_Sub1_10377 = class151_sub1;
	int i = (aClass534_Sub21_10378.method16233(-1818477715)
		 - (class151_sub1.anInt1702 * 127780559 >> 1));
	anInt10379 = (aClass534_Sub21_10378.method16197(-1554958560) - i
		      >> class151_sub1.anInt1703 * -1495101509);
	anInt10380 = (aClass534_Sub21_10378.method16197(-1368948751) + i
		      >> class151_sub1.anInt1703 * -1495101509);
	anInt10392 = (aClass534_Sub21_10378.method16199((byte) -29) - i
		      >> class151_sub1.anInt1703 * -1495101509);
	anInt10381 = (aClass534_Sub21_10378.method16199((byte) -107) + i
		      >> class151_sub1.anInt1703 * -1495101509);
	int i_0_ = anInt10380 - anInt10379 + 1;
	int i_1_ = anInt10381 - anInt10392 + 1;
	aFloatArrayArray10389 = new float[i_0_ + 1][i_1_ + 1];
	aFloatArrayArray10388 = new float[i_0_ + 1][i_1_ + 1];
	aFloatArrayArray10391 = new float[i_0_ + 1][i_1_ + 1];
	for (int i_2_ = 0; i_2_ <= i_1_; i_2_++) {
	    int i_3_ = i_2_ + anInt10392;
	    if (i_3_ > 0
		&& i_3_ < aClass151_Sub1_10377.anInt1700 * -1466328823 - 1) {
		for (int i_4_ = 0; i_4_ <= i_0_; i_4_++) {
		    int i_5_ = i_4_ + anInt10379;
		    if (i_5_ > 0
			&& i_5_ < (aClass151_Sub1_10377.anInt1701 * -1924295585
				   - 1)) {
			int i_6_ = (class151_sub1.method2491(i_5_ + 1, i_3_,
							     32326344)
				    - class151_sub1.method2491(i_5_ - 1, i_3_,
							       396356831));
			int i_7_ = (class151_sub1.method2491(i_5_, i_3_ + 1,
							     978713681)
				    - class151_sub1.method2491(i_5_, i_3_ - 1,
							       -1928045130));
			float f
			    = (float) (1.0
				       / Math.sqrt((double) (i_6_ * i_6_
							     + 65536
							     + i_7_ * i_7_)));
			aFloatArrayArray10389[i_4_][i_2_] = (float) i_6_ * f;
			aFloatArrayArray10388[i_4_][i_2_] = -256.0F * f;
			aFloatArrayArray10391[i_4_][i_2_] = (float) i_7_ * f;
		    }
		}
	    }
	}
	int i_8_ = 0;
	for (int i_9_ = anInt10392; i_9_ <= anInt10381; i_9_++) {
	    if (i_9_ >= 0 && i_9_ < class151_sub1.anInt1700 * -1466328823) {
		for (int i_10_ = anInt10379; i_10_ <= anInt10380; i_10_++) {
		    if (i_10_ >= 0
			&& i_10_ < class151_sub1.anInt1701 * -1924295585) {
			int i_11_ = is[i_8_];
			int[] is_12_ = (class151_sub1.anIntArrayArrayArray9306
					[i_10_][i_9_]);
			if (is_12_ != null && i_11_ != 0) {
			    if (i_11_ == 1) {
				for (int i_13_ = 0; i_13_ < is_12_.length;
				     i_13_ += 3) {
				    if (is_12_[i_13_] != -1
					&& is_12_[i_13_ + 1] != -1
					&& is_12_[i_13_ + 2] != -1)
					anInt10384 += 3;
				}
			    } else
				anInt10384 += 3;
			}
		    }
		    i_8_++;
		}
	    } else
		i_8_ += anInt10380 - anInt10379;
	}
	if (anInt10384 > 0) {
	    aClass534_Sub40_10394 = new Class534_Sub40(anInt10384 * 2);
	    aClass534_Sub40_Sub2_10382
		= new Class534_Sub40_Sub2(anInt10384 * 16);
	    aClass9_10376
		= new Class9(Class162.method2640(anInt10384, (byte) 62));
	    int i_14_ = 0;
	    i_8_ = 0;
	    for (int i_15_ = anInt10392; i_15_ <= anInt10381; i_15_++) {
		if (i_15_ >= 0
		    && i_15_ < class151_sub1.anInt1700 * -1466328823) {
		    int i_16_ = 0;
		    for (int i_17_ = anInt10379; i_17_ <= anInt10380;
			 i_17_++) {
			if (i_17_ >= 0
			    && i_17_ < class151_sub1.anInt1701 * -1924295585) {
			    int i_18_ = is[i_8_];
			    int[] is_19_
				= (class151_sub1.anIntArrayArrayArray9306
				   [i_17_][i_15_]);
			    if (is_19_ != null && i_18_ != 0) {
				if (i_18_ == 1) {
				    int[] is_20_ = (class151_sub1
						    .anIntArrayArrayArray9308
						    [i_17_][i_15_]);
				    int[] is_21_ = (class151_sub1
						    .anIntArrayArrayArray9309
						    [i_17_][i_15_]);
				    int i_22_ = 0;
				    while (i_22_ < is_19_.length) {
					if (is_19_[i_22_] != -1
					    && is_19_[i_22_ + 1] != -1
					    && is_19_[i_22_ + 2] != -1) {
					    method16020(i_16_, i_14_, i_17_,
							i_15_, is_20_[i_22_],
							is_21_[i_22_]);
					    i_22_++;
					    method16020(i_16_, i_14_, i_17_,
							i_15_, is_20_[i_22_],
							is_21_[i_22_]);
					    i_22_++;
					    method16020(i_16_, i_14_, i_17_,
							i_15_, is_20_[i_22_],
							is_21_[i_22_]);
					    i_22_++;
					} else
					    i_22_ += 3;
				    }
				} else if (i_18_ == 3) {
				    method16020(i_16_, i_14_, i_17_, i_15_, 0,
						0);
				    method16020(i_16_, i_14_, i_17_, i_15_,
						(class151_sub1.anInt1702
						 * 127780559),
						0);
				    method16020(i_16_, i_14_, i_17_, i_15_, 0,
						(class151_sub1.anInt1702
						 * 127780559));
				} else if (i_18_ == 2) {
				    method16020(i_16_, i_14_, i_17_, i_15_,
						(class151_sub1.anInt1702
						 * 127780559),
						0);
				    method16020(i_16_, i_14_, i_17_, i_15_,
						(class151_sub1.anInt1702
						 * 127780559),
						(class151_sub1.anInt1702
						 * 127780559));
				    method16020(i_16_, i_14_, i_17_, i_15_, 0,
						0);
				} else if (i_18_ == 5) {
				    method16020(i_16_, i_14_, i_17_, i_15_,
						(class151_sub1.anInt1702
						 * 127780559),
						(class151_sub1.anInt1702
						 * 127780559));
				    method16020(i_16_, i_14_, i_17_, i_15_, 0,
						(class151_sub1.anInt1702
						 * 127780559));
				    method16020(i_16_, i_14_, i_17_, i_15_,
						(class151_sub1.anInt1702
						 * 127780559),
						0);
				} else if (i_18_ == 4) {
				    method16020(i_16_, i_14_, i_17_, i_15_, 0,
						(class151_sub1.anInt1702
						 * 127780559));
				    method16020(i_16_, i_14_, i_17_, i_15_, 0,
						0);
				    method16020(i_16_, i_14_, i_17_, i_15_,
						(class151_sub1.anInt1702
						 * 127780559),
						(class151_sub1.anInt1702
						 * 127780559));
				}
			    }
			}
			i_8_++;
			i_16_++;
		    }
		} else
		    i_8_ += anInt10380 - anInt10379;
		i_14_++;
	    }
	    anInterface16_10385
		= (aClass185_Sub3_10386.method15217
		   (5123, aClass534_Sub40_10394.aByteArray10810,
		    aClass534_Sub40_10394.anInt10811 * 31645619, false));
	    anInterface15_10393
		= (aClass185_Sub3_10386.method15218
		   (16, aClass534_Sub40_Sub2_10382.aByteArray10810,
		    aClass534_Sub40_Sub2_10382.anInt10811 * 31645619, false));
	    aClass129_10387 = new Class129(anInterface15_10393, 5126, 3, 0);
	    aClass129_10383 = new Class129(anInterface15_10393, 5121, 4, 12);
	} else {
	    anInterface16_10385 = null;
	    anInterface15_10393 = null;
	    aClass129_10387 = null;
	    aClass129_10383 = null;
	}
	aClass534_Sub40_Sub2_10382 = null;
	aClass534_Sub40_10394 = null;
	aClass9_10376 = null;
	aFloatArrayArray10391 = null;
	aFloatArrayArray10388 = null;
	aFloatArrayArray10389 = null;
    }
    
    void method16020(int i, int i_23_, int i_24_, int i_25_, int i_26_,
		     int i_27_) {
	long l = -1L;
	int i_28_
	    = i_26_ + (i_24_ << aClass151_Sub1_10377.anInt1703 * -1495101509);
	int i_29_
	    = i_27_ + (i_25_ << aClass151_Sub1_10377.anInt1703 * -1495101509);
	int i_30_ = aClass151_Sub1_10377.method2498(i_28_, i_29_, -689506204);
	if ((i_26_ & 0x7f) == 0 || (i_27_ & 0x7f) == 0) {
	    l = ((long) i_29_ & 0xffffL) << 16 | (long) i_28_ & 0xffffL;
	    Class534_Sub15 class534_sub15
		= (Class534_Sub15) aClass9_10376.method579(l);
	    if (class534_sub15 != null) {
		method16024(class534_sub15.aShort10466);
		return;
	    }
	}
	short i_31_ = (short) anInt10390++;
	if (l != -1L)
	    aClass9_10376.method581(new Class534_Sub15(i_31_), l);
	float f;
	float f_32_;
	float f_33_;
	if (i_26_ == 0 && i_27_ == 0) {
	    f = aFloatArrayArray10389[i][i_23_];
	    f_32_ = aFloatArrayArray10388[i][i_23_];
	    f_33_ = aFloatArrayArray10391[i][i_23_];
	} else if (i_26_ == aClass151_Sub1_10377.anInt1702 * 127780559
		   && i_27_ == 0) {
	    f = aFloatArrayArray10389[i + 1][i_23_];
	    f_32_ = aFloatArrayArray10388[i + 1][i_23_];
	    f_33_ = aFloatArrayArray10391[i + 1][i_23_];
	} else if (i_26_ == aClass151_Sub1_10377.anInt1702 * 127780559
		   && i_27_ == aClass151_Sub1_10377.anInt1702 * 127780559) {
	    f = aFloatArrayArray10389[i + 1][i_23_ + 1];
	    f_32_ = aFloatArrayArray10388[i + 1][i_23_ + 1];
	    f_33_ = aFloatArrayArray10391[i + 1][i_23_ + 1];
	} else if (i_26_ == 0
		   && i_27_ == aClass151_Sub1_10377.anInt1702 * 127780559) {
	    f = aFloatArrayArray10389[i][i_23_ + 1];
	    f_32_ = aFloatArrayArray10388[i][i_23_ + 1];
	    f_33_ = aFloatArrayArray10391[i][i_23_ + 1];
	} else {
	    float f_34_
		= ((float) i_26_
		   / (float) (aClass151_Sub1_10377.anInt1702 * 127780559));
	    float f_35_
		= ((float) i_27_
		   / (float) (aClass151_Sub1_10377.anInt1702 * 127780559));
	    float f_36_ = aFloatArrayArray10389[i][i_23_];
	    float f_37_ = aFloatArrayArray10388[i][i_23_];
	    float f_38_ = aFloatArrayArray10391[i][i_23_];
	    float f_39_ = aFloatArrayArray10389[i + 1][i_23_];
	    float f_40_ = aFloatArrayArray10388[i + 1][i_23_];
	    float f_41_ = aFloatArrayArray10391[i + 1][i_23_];
	    f_36_ += (aFloatArrayArray10389[i][i_23_ + 1] - f_36_) * f_34_;
	    f_37_ += (aFloatArrayArray10388[i][i_23_ + 1] - f_37_) * f_34_;
	    f_38_ += (aFloatArrayArray10391[i][i_23_ + 1] - f_38_) * f_34_;
	    f_39_ += (aFloatArrayArray10389[i + 1][i_23_ + 1] - f_39_) * f_34_;
	    f_40_ += (aFloatArrayArray10388[i + 1][i_23_ + 1] - f_40_) * f_34_;
	    f_41_ += (aFloatArrayArray10391[i + 1][i_23_ + 1] - f_41_) * f_34_;
	    f = f_36_ + (f_39_ - f_36_) * f_35_;
	    f_32_ = f_37_ + (f_40_ - f_37_) * f_35_;
	    f_33_ = f_38_ + (f_41_ - f_38_) * f_35_;
	}
	float f_42_
	    = (float) (aClass534_Sub21_10378.method16197(1566784060) - i_28_);
	float f_43_
	    = (float) (aClass534_Sub21_10378.method16226(844451817) - i_30_);
	float f_44_
	    = (float) (aClass534_Sub21_10378.method16199((byte) -71) - i_29_);
	float f_45_ = (float) Math.sqrt((double) (f_42_ * f_42_ + f_43_ * f_43_
						  + f_44_ * f_44_));
	float f_46_ = 1.0F / f_45_;
	f_42_ *= f_46_;
	f_43_ *= f_46_;
	f_44_ *= f_46_;
	float f_47_
	    = f_45_ / (float) aClass534_Sub21_10378.method16233(-1546270319);
	float f_48_ = 1.0F - f_47_ * f_47_;
	if (f_48_ < 0.0F)
	    f_48_ = 0.0F;
	float f_49_ = f_42_ * f + f_43_ * f_32_ + f_44_ * f_33_;
	if (f_49_ < 0.0F)
	    f_49_ = 0.0F;
	float f_50_ = f_49_ * f_48_ * 2.0F;
	if (f_50_ > 1.0F)
	    f_50_ = 1.0F;
	int i_51_ = aClass534_Sub21_10378.method16201((byte) 37);
	int i_52_ = (int) (f_50_ * (float) (i_51_ >> 16 & 0xff));
	if (i_52_ > 255)
	    i_52_ = 255;
	int i_53_ = (int) (f_50_ * (float) (i_51_ >> 8 & 0xff));
	if (i_53_ > 255)
	    i_53_ = 255;
	int i_54_ = (int) (f_50_ * (float) (i_51_ & 0xff));
	if (i_54_ > 255)
	    i_54_ = 255;
	if (aClass185_Sub3_10386.aBool9566) {
	    aClass534_Sub40_Sub2_10382.method18397((float) i_28_);
	    aClass534_Sub40_Sub2_10382.method18397((float) i_30_);
	    aClass534_Sub40_Sub2_10382.method18397((float) i_29_);
	} else {
	    aClass534_Sub40_Sub2_10382.method18400((float) i_28_);
	    aClass534_Sub40_Sub2_10382.method18400((float) i_30_);
	    aClass534_Sub40_Sub2_10382.method18400((float) i_29_);
	}
	aClass534_Sub40_Sub2_10382.method16506(i_52_, 1142910327);
	aClass534_Sub40_Sub2_10382.method16506(i_53_, 1952573032);
	aClass534_Sub40_Sub2_10382.method16506(i_54_, 334983116);
	aClass534_Sub40_Sub2_10382.method16506(255, 2054897950);
	method16024(i_31_);
    }
    
    void method16021(int i, int i_55_, int i_56_, boolean[][] bools) {
	if (anInterface16_10385 != null && anInt10379 <= i + i_56_
	    && anInt10380 >= i - i_56_ && anInt10392 <= i_55_ + i_56_
	    && anInt10381 >= i_55_ - i_56_) {
	    for (int i_57_ = anInt10392; i_57_ <= anInt10381; i_57_++) {
		for (int i_58_ = anInt10379; i_58_ <= anInt10380; i_58_++) {
		    int i_59_ = i_58_ - i;
		    int i_60_ = i_57_ - i_55_;
		    if (i_59_ > -i_56_ && i_59_ < i_56_ && i_60_ > -i_56_
			&& i_60_ < i_56_
			&& bools[i_59_ + i_56_][i_60_ + i_56_]) {
			aClass185_Sub3_10386.method15235
			    ((int) (aClass534_Sub21_10378
					.method16202(-693604944)
				    * 255.0F) << 24);
			aClass185_Sub3_10386.method15221(aClass129_10387, null,
							 aClass129_10383,
							 null);
			aClass185_Sub3_10386.method15222(anInterface16_10385,
							 4, 0, anInt10384);
			return;
		    }
		}
	    }
	}
    }
    
    void method16022(short i) {
	if (aClass185_Sub3_10386.aBool9566)
	    aClass534_Sub40_10394.method16507(i, 1773888217);
	else
	    aClass534_Sub40_10394.method16721(i, 1203548667);
    }
    
    void method16023(int i, int i_61_, int i_62_, int i_63_, int i_64_,
		     int i_65_) {
	long l = -1L;
	int i_66_
	    = i_64_ + (i_62_ << aClass151_Sub1_10377.anInt1703 * -1495101509);
	int i_67_
	    = i_65_ + (i_63_ << aClass151_Sub1_10377.anInt1703 * -1495101509);
	int i_68_ = aClass151_Sub1_10377.method2498(i_66_, i_67_, -390054469);
	if ((i_64_ & 0x7f) == 0 || (i_65_ & 0x7f) == 0) {
	    l = ((long) i_67_ & 0xffffL) << 16 | (long) i_66_ & 0xffffL;
	    Class534_Sub15 class534_sub15
		= (Class534_Sub15) aClass9_10376.method579(l);
	    if (class534_sub15 != null) {
		method16024(class534_sub15.aShort10466);
		return;
	    }
	}
	short i_69_ = (short) anInt10390++;
	if (l != -1L)
	    aClass9_10376.method581(new Class534_Sub15(i_69_), l);
	float f;
	float f_70_;
	float f_71_;
	if (i_64_ == 0 && i_65_ == 0) {
	    f = aFloatArrayArray10389[i][i_61_];
	    f_70_ = aFloatArrayArray10388[i][i_61_];
	    f_71_ = aFloatArrayArray10391[i][i_61_];
	} else if (i_64_ == aClass151_Sub1_10377.anInt1702 * 127780559
		   && i_65_ == 0) {
	    f = aFloatArrayArray10389[i + 1][i_61_];
	    f_70_ = aFloatArrayArray10388[i + 1][i_61_];
	    f_71_ = aFloatArrayArray10391[i + 1][i_61_];
	} else if (i_64_ == aClass151_Sub1_10377.anInt1702 * 127780559
		   && i_65_ == aClass151_Sub1_10377.anInt1702 * 127780559) {
	    f = aFloatArrayArray10389[i + 1][i_61_ + 1];
	    f_70_ = aFloatArrayArray10388[i + 1][i_61_ + 1];
	    f_71_ = aFloatArrayArray10391[i + 1][i_61_ + 1];
	} else if (i_64_ == 0
		   && i_65_ == aClass151_Sub1_10377.anInt1702 * 127780559) {
	    f = aFloatArrayArray10389[i][i_61_ + 1];
	    f_70_ = aFloatArrayArray10388[i][i_61_ + 1];
	    f_71_ = aFloatArrayArray10391[i][i_61_ + 1];
	} else {
	    float f_72_
		= ((float) i_64_
		   / (float) (aClass151_Sub1_10377.anInt1702 * 127780559));
	    float f_73_
		= ((float) i_65_
		   / (float) (aClass151_Sub1_10377.anInt1702 * 127780559));
	    float f_74_ = aFloatArrayArray10389[i][i_61_];
	    float f_75_ = aFloatArrayArray10388[i][i_61_];
	    float f_76_ = aFloatArrayArray10391[i][i_61_];
	    float f_77_ = aFloatArrayArray10389[i + 1][i_61_];
	    float f_78_ = aFloatArrayArray10388[i + 1][i_61_];
	    float f_79_ = aFloatArrayArray10391[i + 1][i_61_];
	    f_74_ += (aFloatArrayArray10389[i][i_61_ + 1] - f_74_) * f_72_;
	    f_75_ += (aFloatArrayArray10388[i][i_61_ + 1] - f_75_) * f_72_;
	    f_76_ += (aFloatArrayArray10391[i][i_61_ + 1] - f_76_) * f_72_;
	    f_77_ += (aFloatArrayArray10389[i + 1][i_61_ + 1] - f_77_) * f_72_;
	    f_78_ += (aFloatArrayArray10388[i + 1][i_61_ + 1] - f_78_) * f_72_;
	    f_79_ += (aFloatArrayArray10391[i + 1][i_61_ + 1] - f_79_) * f_72_;
	    f = f_74_ + (f_77_ - f_74_) * f_73_;
	    f_70_ = f_75_ + (f_78_ - f_75_) * f_73_;
	    f_71_ = f_76_ + (f_79_ - f_76_) * f_73_;
	}
	float f_80_
	    = (float) (aClass534_Sub21_10378.method16197(-121108838) - i_66_);
	float f_81_
	    = (float) (aClass534_Sub21_10378.method16226(-503680660) - i_68_);
	float f_82_
	    = (float) (aClass534_Sub21_10378.method16199((byte) -77) - i_67_);
	float f_83_ = (float) Math.sqrt((double) (f_80_ * f_80_ + f_81_ * f_81_
						  + f_82_ * f_82_));
	float f_84_ = 1.0F / f_83_;
	f_80_ *= f_84_;
	f_81_ *= f_84_;
	f_82_ *= f_84_;
	float f_85_
	    = f_83_ / (float) aClass534_Sub21_10378.method16233(-806866664);
	float f_86_ = 1.0F - f_85_ * f_85_;
	if (f_86_ < 0.0F)
	    f_86_ = 0.0F;
	float f_87_ = f_80_ * f + f_81_ * f_70_ + f_82_ * f_71_;
	if (f_87_ < 0.0F)
	    f_87_ = 0.0F;
	float f_88_ = f_87_ * f_86_ * 2.0F;
	if (f_88_ > 1.0F)
	    f_88_ = 1.0F;
	int i_89_ = aClass534_Sub21_10378.method16201((byte) -76);
	int i_90_ = (int) (f_88_ * (float) (i_89_ >> 16 & 0xff));
	if (i_90_ > 255)
	    i_90_ = 255;
	int i_91_ = (int) (f_88_ * (float) (i_89_ >> 8 & 0xff));
	if (i_91_ > 255)
	    i_91_ = 255;
	int i_92_ = (int) (f_88_ * (float) (i_89_ & 0xff));
	if (i_92_ > 255)
	    i_92_ = 255;
	if (aClass185_Sub3_10386.aBool9566) {
	    aClass534_Sub40_Sub2_10382.method18397((float) i_66_);
	    aClass534_Sub40_Sub2_10382.method18397((float) i_68_);
	    aClass534_Sub40_Sub2_10382.method18397((float) i_67_);
	} else {
	    aClass534_Sub40_Sub2_10382.method18400((float) i_66_);
	    aClass534_Sub40_Sub2_10382.method18400((float) i_68_);
	    aClass534_Sub40_Sub2_10382.method18400((float) i_67_);
	}
	aClass534_Sub40_Sub2_10382.method16506(i_90_, 944215523);
	aClass534_Sub40_Sub2_10382.method16506(i_91_, 1937110639);
	aClass534_Sub40_Sub2_10382.method16506(i_92_, 1009783417);
	aClass534_Sub40_Sub2_10382.method16506(255, 1146008543);
	method16024(i_69_);
    }
    
    void method16024(short i) {
	if (aClass185_Sub3_10386.aBool9566)
	    aClass534_Sub40_10394.method16507(i, 2081959268);
	else
	    aClass534_Sub40_10394.method16721(i, 1203548667);
    }
    
    void method16025(int i, int i_93_, int i_94_, int i_95_, int i_96_,
		     int i_97_) {
	long l = -1L;
	int i_98_
	    = i_96_ + (i_94_ << aClass151_Sub1_10377.anInt1703 * -1495101509);
	int i_99_
	    = i_97_ + (i_95_ << aClass151_Sub1_10377.anInt1703 * -1495101509);
	int i_100_ = aClass151_Sub1_10377.method2498(i_98_, i_99_, -533253620);
	if ((i_96_ & 0x7f) == 0 || (i_97_ & 0x7f) == 0) {
	    l = ((long) i_99_ & 0xffffL) << 16 | (long) i_98_ & 0xffffL;
	    Class534_Sub15 class534_sub15
		= (Class534_Sub15) aClass9_10376.method579(l);
	    if (class534_sub15 != null) {
		method16024(class534_sub15.aShort10466);
		return;
	    }
	}
	short i_101_ = (short) anInt10390++;
	if (l != -1L)
	    aClass9_10376.method581(new Class534_Sub15(i_101_), l);
	float f;
	float f_102_;
	float f_103_;
	if (i_96_ == 0 && i_97_ == 0) {
	    f = aFloatArrayArray10389[i][i_93_];
	    f_102_ = aFloatArrayArray10388[i][i_93_];
	    f_103_ = aFloatArrayArray10391[i][i_93_];
	} else if (i_96_ == aClass151_Sub1_10377.anInt1702 * 127780559
		   && i_97_ == 0) {
	    f = aFloatArrayArray10389[i + 1][i_93_];
	    f_102_ = aFloatArrayArray10388[i + 1][i_93_];
	    f_103_ = aFloatArrayArray10391[i + 1][i_93_];
	} else if (i_96_ == aClass151_Sub1_10377.anInt1702 * 127780559
		   && i_97_ == aClass151_Sub1_10377.anInt1702 * 127780559) {
	    f = aFloatArrayArray10389[i + 1][i_93_ + 1];
	    f_102_ = aFloatArrayArray10388[i + 1][i_93_ + 1];
	    f_103_ = aFloatArrayArray10391[i + 1][i_93_ + 1];
	} else if (i_96_ == 0
		   && i_97_ == aClass151_Sub1_10377.anInt1702 * 127780559) {
	    f = aFloatArrayArray10389[i][i_93_ + 1];
	    f_102_ = aFloatArrayArray10388[i][i_93_ + 1];
	    f_103_ = aFloatArrayArray10391[i][i_93_ + 1];
	} else {
	    float f_104_
		= ((float) i_96_
		   / (float) (aClass151_Sub1_10377.anInt1702 * 127780559));
	    float f_105_
		= ((float) i_97_
		   / (float) (aClass151_Sub1_10377.anInt1702 * 127780559));
	    float f_106_ = aFloatArrayArray10389[i][i_93_];
	    float f_107_ = aFloatArrayArray10388[i][i_93_];
	    float f_108_ = aFloatArrayArray10391[i][i_93_];
	    float f_109_ = aFloatArrayArray10389[i + 1][i_93_];
	    float f_110_ = aFloatArrayArray10388[i + 1][i_93_];
	    float f_111_ = aFloatArrayArray10391[i + 1][i_93_];
	    f_106_ += (aFloatArrayArray10389[i][i_93_ + 1] - f_106_) * f_104_;
	    f_107_ += (aFloatArrayArray10388[i][i_93_ + 1] - f_107_) * f_104_;
	    f_108_ += (aFloatArrayArray10391[i][i_93_ + 1] - f_108_) * f_104_;
	    f_109_
		+= (aFloatArrayArray10389[i + 1][i_93_ + 1] - f_109_) * f_104_;
	    f_110_
		+= (aFloatArrayArray10388[i + 1][i_93_ + 1] - f_110_) * f_104_;
	    f_111_
		+= (aFloatArrayArray10391[i + 1][i_93_ + 1] - f_111_) * f_104_;
	    f = f_106_ + (f_109_ - f_106_) * f_105_;
	    f_102_ = f_107_ + (f_110_ - f_107_) * f_105_;
	    f_103_ = f_108_ + (f_111_ - f_108_) * f_105_;
	}
	float f_112_
	    = (float) (aClass534_Sub21_10378.method16197(-796695091) - i_98_);
	float f_113_ = (float) (aClass534_Sub21_10378.method16226(-1029393237)
				- i_100_);
	float f_114_
	    = (float) (aClass534_Sub21_10378.method16199((byte) -96) - i_99_);
	float f_115_
	    = (float) Math.sqrt((double) (f_112_ * f_112_ + f_113_ * f_113_
					  + f_114_ * f_114_));
	float f_116_ = 1.0F / f_115_;
	f_112_ *= f_116_;
	f_113_ *= f_116_;
	f_114_ *= f_116_;
	float f_117_
	    = f_115_ / (float) aClass534_Sub21_10378.method16233(95154197);
	float f_118_ = 1.0F - f_117_ * f_117_;
	if (f_118_ < 0.0F)
	    f_118_ = 0.0F;
	float f_119_ = f_112_ * f + f_113_ * f_102_ + f_114_ * f_103_;
	if (f_119_ < 0.0F)
	    f_119_ = 0.0F;
	float f_120_ = f_119_ * f_118_ * 2.0F;
	if (f_120_ > 1.0F)
	    f_120_ = 1.0F;
	int i_121_ = aClass534_Sub21_10378.method16201((byte) -16);
	int i_122_ = (int) (f_120_ * (float) (i_121_ >> 16 & 0xff));
	if (i_122_ > 255)
	    i_122_ = 255;
	int i_123_ = (int) (f_120_ * (float) (i_121_ >> 8 & 0xff));
	if (i_123_ > 255)
	    i_123_ = 255;
	int i_124_ = (int) (f_120_ * (float) (i_121_ & 0xff));
	if (i_124_ > 255)
	    i_124_ = 255;
	if (aClass185_Sub3_10386.aBool9566) {
	    aClass534_Sub40_Sub2_10382.method18397((float) i_98_);
	    aClass534_Sub40_Sub2_10382.method18397((float) i_100_);
	    aClass534_Sub40_Sub2_10382.method18397((float) i_99_);
	} else {
	    aClass534_Sub40_Sub2_10382.method18400((float) i_98_);
	    aClass534_Sub40_Sub2_10382.method18400((float) i_100_);
	    aClass534_Sub40_Sub2_10382.method18400((float) i_99_);
	}
	aClass534_Sub40_Sub2_10382.method16506(i_122_, 406255789);
	aClass534_Sub40_Sub2_10382.method16506(i_123_, 920032717);
	aClass534_Sub40_Sub2_10382.method16506(i_124_, 2089081935);
	aClass534_Sub40_Sub2_10382.method16506(255, 1301443646);
	method16024(i_101_);
    }
}
