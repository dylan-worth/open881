/* Class194 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class194
{
    public int anInt2147;
    public int anInt2148;
    public int anInt2149;
    public boolean aBool2150 = false;
    public int anInt2151;
    public int anInt2152;
    
    public boolean method3798(int i, int i_0_) {
	if (!aBool2150)
	    return false;
	int i_1_ = anInt2152 - anInt2148;
	int i_2_ = anInt2151 - anInt2149;
	int i_3_ = i_1_ * i_1_ + i_2_ * i_2_;
	int i_4_
	    = i * i_1_ + i_0_ * i_2_ - (anInt2148 * i_1_ + anInt2149 * i_2_);
	if (i_4_ <= 0) {
	    int i_5_ = anInt2148 - i;
	    int i_6_ = anInt2149 - i_0_;
	    return i_5_ * i_5_ + i_6_ * i_6_ < anInt2147 * anInt2147;
	}
	if (i_4_ > i_3_) {
	    int i_7_ = anInt2152 - i;
	    int i_8_ = anInt2151 - i_0_;
	    return i_7_ * i_7_ + i_8_ * i_8_ < anInt2147 * anInt2147;
	}
	int i_9_ = 10;
	if (i_4_ != (i_4_ & 0x1fffff))
	    i_9_ = 5;
	i_4_ = (i_4_ << i_9_) / i_3_;
	int i_10_ = anInt2148 + (i_1_ * i_4_ >> i_9_) - i;
	int i_11_ = anInt2149 + (i_2_ * i_4_ >> i_9_) - i_0_;
	return i_10_ * i_10_ + i_11_ * i_11_ < anInt2147 * anInt2147;
    }
    
    public boolean method3799(int i, int i_12_) {
	if (!aBool2150)
	    return false;
	int i_13_ = anInt2152 - anInt2148;
	int i_14_ = anInt2151 - anInt2149;
	int i_15_ = i_13_ * i_13_ + i_14_ * i_14_;
	int i_16_ = (i * i_13_ + i_12_ * i_14_
		     - (anInt2148 * i_13_ + anInt2149 * i_14_));
	if (i_16_ <= 0) {
	    int i_17_ = anInt2148 - i;
	    int i_18_ = anInt2149 - i_12_;
	    return i_17_ * i_17_ + i_18_ * i_18_ < anInt2147 * anInt2147;
	}
	if (i_16_ > i_15_) {
	    int i_19_ = anInt2152 - i;
	    int i_20_ = anInt2151 - i_12_;
	    return i_19_ * i_19_ + i_20_ * i_20_ < anInt2147 * anInt2147;
	}
	int i_21_ = 10;
	if (i_16_ != (i_16_ & 0x1fffff))
	    i_21_ = 5;
	i_16_ = (i_16_ << i_21_) / i_15_;
	int i_22_ = anInt2148 + (i_13_ * i_16_ >> i_21_) - i;
	int i_23_ = anInt2149 + (i_14_ * i_16_ >> i_21_) - i_12_;
	return i_22_ * i_22_ + i_23_ * i_23_ < anInt2147 * anInt2147;
    }
    
    public void method3800(Class432 class432, Class433 class433,
			   Class433 class433_24_, float f, float f_25_,
			   float f_26_, float f_27_) {
	boolean bool = false;
	aBool2150 = true;
	int i = (int) (class432.aFloat4847 + class432.aFloat4848) >> 1;
	int i_28_ = (int) (class432.aFloat4844 + class432.aFloat4849) >> 1;
	int i_29_ = i;
	int i_30_ = (int) class432.aFloat4845;
	int i_31_ = i_28_;
	float f_32_ = (class433_24_.aFloatArray4853[0] * (float) i_29_
		       + class433_24_.aFloatArray4853[4] * (float) i_30_
		       + class433_24_.aFloatArray4853[8] * (float) i_31_
		       + class433_24_.aFloatArray4853[12]);
	float f_33_ = (class433_24_.aFloatArray4853[1] * (float) i_29_
		       + class433_24_.aFloatArray4853[5] * (float) i_30_
		       + class433_24_.aFloatArray4853[9] * (float) i_31_
		       + class433_24_.aFloatArray4853[13]);
	float f_34_ = (class433_24_.aFloatArray4853[2] * (float) i_29_
		       + class433_24_.aFloatArray4853[6] * (float) i_30_
		       + class433_24_.aFloatArray4853[10] * (float) i_31_
		       + class433_24_.aFloatArray4853[14]);
	float f_35_ = (class433_24_.aFloatArray4853[3] * (float) i_29_
		       + class433_24_.aFloatArray4853[7] * (float) i_30_
		       + class433_24_.aFloatArray4853[11] * (float) i_31_
		       + class433_24_.aFloatArray4853[15]);
	if (f_34_ >= -f_35_) {
	    anInt2148 = (int) (f + f_26_ * f_32_ / f_35_);
	    anInt2149 = (int) (f_25_ + f_27_ * f_33_ / f_35_);
	} else
	    bool = true;
	i_29_ = i;
	i_30_ = (int) class432.aFloat4850;
	i_31_ = i_28_;
	float f_36_ = (class433_24_.aFloatArray4853[0] * (float) i_29_
		       + class433_24_.aFloatArray4853[4] * (float) i_30_
		       + class433_24_.aFloatArray4853[8] * (float) i_31_
		       + class433_24_.aFloatArray4853[12]);
	float f_37_ = (class433_24_.aFloatArray4853[1] * (float) i_29_
		       + class433_24_.aFloatArray4853[5] * (float) i_30_
		       + class433_24_.aFloatArray4853[9] * (float) i_31_
		       + class433_24_.aFloatArray4853[13]);
	float f_38_ = (class433_24_.aFloatArray4853[2] * (float) i_29_
		       + class433_24_.aFloatArray4853[6] * (float) i_30_
		       + class433_24_.aFloatArray4853[10] * (float) i_31_
		       + class433_24_.aFloatArray4853[14]);
	float f_39_ = (class433_24_.aFloatArray4853[3] * (float) i_29_
		       + class433_24_.aFloatArray4853[7] * (float) i_30_
		       + class433_24_.aFloatArray4853[11] * (float) i_31_
		       + class433_24_.aFloatArray4853[15]);
	if (f_38_ >= -f_39_) {
	    anInt2152 = (int) (f + f_26_ * f_36_ / f_39_);
	    anInt2151 = (int) (f_25_ + f_27_ * f_37_ / f_39_);
	} else
	    bool = true;
	if (bool) {
	    if (f_34_ < -f_35_ && f_38_ < -f_39_)
		aBool2150 = false;
	    else if (f_34_ < -f_35_) {
		float f_40_ = (f_34_ + f_35_) / (f_38_ + f_39_) - 1.0F;
		float f_41_ = f_32_ + f_40_ * (f_36_ - f_32_);
		float f_42_ = f_33_ + f_40_ * (f_37_ - f_33_);
		float f_43_ = f_35_ + f_40_ * (f_39_ - f_35_);
		anInt2148 = (int) (f + f_26_ * f_41_ / f_43_);
		anInt2149 = (int) (f_25_ + f_27_ * f_42_ / f_43_);
	    } else if (f_38_ < -f_39_) {
		float f_44_ = (f_38_ + f_39_) / (f_34_ + f_35_) - 1.0F;
		float f_45_ = f_36_ + f_44_ * (f_32_ - f_36_);
		float f_46_ = f_37_ + f_44_ * (f_33_ - f_37_);
		float f_47_ = f_39_ + f_44_ * (f_35_ - f_39_);
		anInt2152 = (int) (f + f_26_ * f_45_ / f_47_);
		anInt2151 = (int) (f_25_ + f_27_ * f_46_ / f_47_);
	    }
	}
	if (aBool2150) {
	    float f_48_
		= ((float) Math.sqrt(Math.pow((double) (class432.aFloat4848
							- class432.aFloat4847),
					      2.0)
				     + Math.pow((double) (class432.aFloat4849
							  - (class432
							     .aFloat4844)),
						2.0))
		   / 2.0F);
	    if (f_34_ / f_35_ > f_38_ / f_39_) {
		float f_49_ = (f_32_ + class433.aFloatArray4853[0] * f_48_
			       + class433.aFloatArray4853[12]);
		float f_50_ = (f_35_ + class433.aFloatArray4853[3] * f_48_
			       + class433.aFloatArray4853[15]);
		anInt2147
		    = (int) (f - (float) anInt2148 + f_26_ * f_49_ / f_50_);
	    } else {
		float f_51_ = (f_36_ + class433.aFloatArray4853[0] * f_48_
			       + class433.aFloatArray4853[12]);
		float f_52_ = (f_39_ + class433.aFloatArray4853[3] * f_48_
			       + class433.aFloatArray4853[15]);
		anInt2147
		    = (int) (f - (float) anInt2152 + f_26_ * f_51_ / f_52_);
	    }
	    aBool2150 = true;
	}
    }
    
    public void method3801(Class432 class432, Class433 class433,
			   Class433 class433_53_, float f, float f_54_,
			   float f_55_, float f_56_) {
	boolean bool = false;
	aBool2150 = true;
	int i = (int) (class432.aFloat4847 + class432.aFloat4848) >> 1;
	int i_57_ = (int) (class432.aFloat4844 + class432.aFloat4849) >> 1;
	int i_58_ = i;
	int i_59_ = (int) class432.aFloat4845;
	int i_60_ = i_57_;
	float f_61_ = (class433_53_.aFloatArray4853[0] * (float) i_58_
		       + class433_53_.aFloatArray4853[4] * (float) i_59_
		       + class433_53_.aFloatArray4853[8] * (float) i_60_
		       + class433_53_.aFloatArray4853[12]);
	float f_62_ = (class433_53_.aFloatArray4853[1] * (float) i_58_
		       + class433_53_.aFloatArray4853[5] * (float) i_59_
		       + class433_53_.aFloatArray4853[9] * (float) i_60_
		       + class433_53_.aFloatArray4853[13]);
	float f_63_ = (class433_53_.aFloatArray4853[2] * (float) i_58_
		       + class433_53_.aFloatArray4853[6] * (float) i_59_
		       + class433_53_.aFloatArray4853[10] * (float) i_60_
		       + class433_53_.aFloatArray4853[14]);
	float f_64_ = (class433_53_.aFloatArray4853[3] * (float) i_58_
		       + class433_53_.aFloatArray4853[7] * (float) i_59_
		       + class433_53_.aFloatArray4853[11] * (float) i_60_
		       + class433_53_.aFloatArray4853[15]);
	if (f_63_ >= -f_64_) {
	    anInt2148 = (int) (f + f_55_ * f_61_ / f_64_);
	    anInt2149 = (int) (f_54_ + f_56_ * f_62_ / f_64_);
	} else
	    bool = true;
	i_58_ = i;
	i_59_ = (int) class432.aFloat4850;
	i_60_ = i_57_;
	float f_65_ = (class433_53_.aFloatArray4853[0] * (float) i_58_
		       + class433_53_.aFloatArray4853[4] * (float) i_59_
		       + class433_53_.aFloatArray4853[8] * (float) i_60_
		       + class433_53_.aFloatArray4853[12]);
	float f_66_ = (class433_53_.aFloatArray4853[1] * (float) i_58_
		       + class433_53_.aFloatArray4853[5] * (float) i_59_
		       + class433_53_.aFloatArray4853[9] * (float) i_60_
		       + class433_53_.aFloatArray4853[13]);
	float f_67_ = (class433_53_.aFloatArray4853[2] * (float) i_58_
		       + class433_53_.aFloatArray4853[6] * (float) i_59_
		       + class433_53_.aFloatArray4853[10] * (float) i_60_
		       + class433_53_.aFloatArray4853[14]);
	float f_68_ = (class433_53_.aFloatArray4853[3] * (float) i_58_
		       + class433_53_.aFloatArray4853[7] * (float) i_59_
		       + class433_53_.aFloatArray4853[11] * (float) i_60_
		       + class433_53_.aFloatArray4853[15]);
	if (f_67_ >= -f_68_) {
	    anInt2152 = (int) (f + f_55_ * f_65_ / f_68_);
	    anInt2151 = (int) (f_54_ + f_56_ * f_66_ / f_68_);
	} else
	    bool = true;
	if (bool) {
	    if (f_63_ < -f_64_ && f_67_ < -f_68_)
		aBool2150 = false;
	    else if (f_63_ < -f_64_) {
		float f_69_ = (f_63_ + f_64_) / (f_67_ + f_68_) - 1.0F;
		float f_70_ = f_61_ + f_69_ * (f_65_ - f_61_);
		float f_71_ = f_62_ + f_69_ * (f_66_ - f_62_);
		float f_72_ = f_64_ + f_69_ * (f_68_ - f_64_);
		anInt2148 = (int) (f + f_55_ * f_70_ / f_72_);
		anInt2149 = (int) (f_54_ + f_56_ * f_71_ / f_72_);
	    } else if (f_67_ < -f_68_) {
		float f_73_ = (f_67_ + f_68_) / (f_63_ + f_64_) - 1.0F;
		float f_74_ = f_65_ + f_73_ * (f_61_ - f_65_);
		float f_75_ = f_66_ + f_73_ * (f_62_ - f_66_);
		float f_76_ = f_68_ + f_73_ * (f_64_ - f_68_);
		anInt2152 = (int) (f + f_55_ * f_74_ / f_76_);
		anInt2151 = (int) (f_54_ + f_56_ * f_75_ / f_76_);
	    }
	}
	if (aBool2150) {
	    float f_77_
		= ((float) Math.sqrt(Math.pow((double) (class432.aFloat4848
							- class432.aFloat4847),
					      2.0)
				     + Math.pow((double) (class432.aFloat4849
							  - (class432
							     .aFloat4844)),
						2.0))
		   / 2.0F);
	    if (f_63_ / f_64_ > f_67_ / f_68_) {
		float f_78_ = (f_61_ + class433.aFloatArray4853[0] * f_77_
			       + class433.aFloatArray4853[12]);
		float f_79_ = (f_64_ + class433.aFloatArray4853[3] * f_77_
			       + class433.aFloatArray4853[15]);
		anInt2147
		    = (int) (f - (float) anInt2148 + f_55_ * f_78_ / f_79_);
	    } else {
		float f_80_ = (f_65_ + class433.aFloatArray4853[0] * f_77_
			       + class433.aFloatArray4853[12]);
		float f_81_ = (f_68_ + class433.aFloatArray4853[3] * f_77_
			       + class433.aFloatArray4853[15]);
		anInt2147
		    = (int) (f - (float) anInt2152 + f_55_ * f_80_ / f_81_);
	    }
	    aBool2150 = true;
	}
    }
}
