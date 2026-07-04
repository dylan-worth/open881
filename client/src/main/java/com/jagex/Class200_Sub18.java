/* Class200_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Arrays;

public class Class200_Sub18 extends Class200
{
    int anInt9975;
    int anInt9976;
    int anInt9977;
    int[] anIntArray9978;
    
    public void method3846() {
	Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1
	    = Class65.aClass192Array712[anInt9975 * 2045545929]
		  .method3775(2088438307);
	if (0 == -1245155003 * anInt9976)
	    Class200_Sub6.method15575(class654_sub1_sub5_sub1, anIntArray9978,
				      0, false, (byte) -96);
	else
	    Class640.method10598(class654_sub1_sub5_sub1,
				 new int[] { -1744842825 * anInt9977 },
				 new int[] { 0 },
				 new int[] { anInt9976 * -1245155003 },
				 (byte) -115);
    }
    
    public void method3845(int i) {
	Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1
	    = Class65.aClass192Array712[anInt9975 * 2045545929]
		  .method3775(2088438307);
	if (0 == -1245155003 * anInt9976)
	    Class200_Sub6.method15575(class654_sub1_sub5_sub1, anIntArray9978,
				      0, false, (byte) -41);
	else
	    Class640.method10598(class654_sub1_sub5_sub1,
				 new int[] { -1744842825 * anInt9977 },
				 new int[] { 0 },
				 new int[] { anInt9976 * -1245155003 },
				 (byte) -111);
    }
    
    Class200_Sub18(Class534_Sub40 class534_sub40) {
	super(class534_sub40);
	anInt9975 = class534_sub40.method16529((byte) 1) * 2109152377;
	anIntArray9978 = new int[4];
	anInt9977 = class534_sub40.method16550((byte) 22) * -1813692921;
	Arrays.fill(anIntArray9978, 0, anIntArray9978.length,
		    -1744842825 * anInt9977);
	anInt9976 = class534_sub40.method16533(-258848859) * -539985523;
    }
    
    boolean method3844(int i) {
	Class205 class205
	    = (Class205) Class200_Sub12.aClass44_Sub1_9934
			     .method91(-1744842825 * anInt9977, 444484753);
	return class205.method3913(1690977923);
    }
    
    public void method3847() {
	Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1
	    = Class65.aClass192Array712[anInt9975 * 2045545929]
		  .method3775(2088438307);
	if (0 == -1245155003 * anInt9976)
	    Class200_Sub6.method15575(class654_sub1_sub5_sub1, anIntArray9978,
				      0, false, (byte) -107);
	else
	    Class640.method10598(class654_sub1_sub5_sub1,
				 new int[] { -1744842825 * anInt9977 },
				 new int[] { 0 },
				 new int[] { anInt9976 * -1245155003 },
				 (byte) -86);
    }
    
    boolean method3848() {
	Class205 class205
	    = (Class205) Class200_Sub12.aClass44_Sub1_9934
			     .method91(-1744842825 * anInt9977, -664737602);
	return class205.method3913(1734366497);
    }
    
    boolean method3849() {
	Class205 class205
	    = (Class205) Class200_Sub12.aClass44_Sub1_9934
			     .method91(-1744842825 * anInt9977, -1483621193);
	return class205.method3913(374472470);
    }
    
    static final void method15630(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_0_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_1_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	Class536_Sub1.method15934(i_0_, i_1_ >> 14 & 0x3fff, i_1_ & 0x3fff,
				  false, 1909499025);
    }
    
    static final void method15631(Class669 class669, int i) {
	class669.anInt8600 -= 1235998252;
	int i_2_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	boolean bool
	    = (class669.anIntArray8595[1 + class669.anInt8600 * 2088438307]
	       == 1);
	int i_3_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 2];
	boolean bool_4_ = 1 == (class669.anIntArray8595
				[class669.anInt8600 * 2088438307 + 3]);
	Class640.method10599(i_2_, bool, i_3_, bool_4_, (byte) -9);
    }
    
    public static byte[][][] method15632(int i, int i_5_) {
	byte[][][] is = new byte[8][4][];
	int i_6_ = i;
	int i_7_ = i;
	byte[] is_8_ = new byte[i_6_ * i_7_];
	int i_9_ = 0;
	for (int i_10_ = 0; i_10_ < i_7_; i_10_++) {
	    for (int i_11_ = 0; i_11_ < i_6_; i_11_++) {
		if (i_11_ <= i_10_)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[0][0] = is_8_;
	is_8_ = new byte[i_7_ * i_6_];
	i_9_ = 0;
	for (int i_12_ = i_7_ - 1; i_12_ >= 0; i_12_--) {
	    for (int i_13_ = 0; i_13_ < i_7_; i_13_++) {
		if (i_13_ <= i_12_)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[0][1] = is_8_;
	is_8_ = new byte[i_7_ * i_6_];
	i_9_ = 0;
	for (int i_14_ = 0; i_14_ < i_7_; i_14_++) {
	    for (int i_15_ = 0; i_15_ < i_6_; i_15_++) {
		if (i_15_ >= i_14_)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[0][2] = is_8_;
	is_8_ = new byte[i_7_ * i_6_];
	i_9_ = 0;
	for (int i_16_ = i_7_ - 1; i_16_ >= 0; i_16_--) {
	    for (int i_17_ = 0; i_17_ < i_6_; i_17_++) {
		if (i_17_ >= i_16_)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[0][3] = is_8_;
	is_8_ = new byte[i_6_ * i_7_];
	i_9_ = 0;
	for (int i_18_ = i_7_ - 1; i_18_ >= 0; i_18_--) {
	    for (int i_19_ = 0; i_19_ < i_6_; i_19_++) {
		if (i_19_ <= i_18_ >> 1)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[1][0] = is_8_;
	is_8_ = new byte[i_7_ * i_6_];
	i_9_ = 0;
	for (int i_20_ = 0; i_20_ < i_7_; i_20_++) {
	    for (int i_21_ = 0; i_21_ < i_6_; i_21_++) {
		if (i_9_ < 0 || i_9_ >= is_8_.length)
		    i_9_++;
		else {
		    if (i_21_ >= i_20_ << 1)
			is_8_[i_9_] = (byte) -1;
		    i_9_++;
		}
	    }
	}
	is[1][1] = is_8_;
	is_8_ = new byte[i_6_ * i_7_];
	i_9_ = 0;
	for (int i_22_ = 0; i_22_ < i_7_; i_22_++) {
	    for (int i_23_ = i_6_ - 1; i_23_ >= 0; i_23_--) {
		if (i_23_ <= i_22_ >> 1)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[1][2] = is_8_;
	is_8_ = new byte[i_7_ * i_6_];
	i_9_ = 0;
	for (int i_24_ = i_7_ - 1; i_24_ >= 0; i_24_--) {
	    for (int i_25_ = i_6_ - 1; i_25_ >= 0; i_25_--) {
		if (i_25_ >= i_24_ << 1)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[1][3] = is_8_;
	is_8_ = new byte[i_6_ * i_7_];
	i_9_ = 0;
	for (int i_26_ = i_7_ - 1; i_26_ >= 0; i_26_--) {
	    for (int i_27_ = i_6_ - 1; i_27_ >= 0; i_27_--) {
		if (i_27_ <= i_26_ >> 1)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[2][0] = is_8_;
	is_8_ = new byte[i_6_ * i_7_];
	i_9_ = 0;
	for (int i_28_ = i_7_ - 1; i_28_ >= 0; i_28_--) {
	    for (int i_29_ = 0; i_29_ < i_6_; i_29_++) {
		if (i_29_ >= i_28_ << 1)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[2][1] = is_8_;
	is_8_ = new byte[i_7_ * i_6_];
	i_9_ = 0;
	for (int i_30_ = 0; i_30_ < i_7_; i_30_++) {
	    for (int i_31_ = 0; i_31_ < i_6_; i_31_++) {
		if (i_31_ <= i_30_ >> 1)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[2][2] = is_8_;
	is_8_ = new byte[i_6_ * i_7_];
	i_9_ = 0;
	for (int i_32_ = 0; i_32_ < i_7_; i_32_++) {
	    for (int i_33_ = i_6_ - 1; i_33_ >= 0; i_33_--) {
		if (i_33_ >= i_32_ << 1)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[2][3] = is_8_;
	is_8_ = new byte[i_6_ * i_7_];
	i_9_ = 0;
	for (int i_34_ = i_7_ - 1; i_34_ >= 0; i_34_--) {
	    for (int i_35_ = 0; i_35_ < i_6_; i_35_++) {
		if (i_35_ >= i_34_ >> 1)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[3][0] = is_8_;
	is_8_ = new byte[i_6_ * i_7_];
	i_9_ = 0;
	for (int i_36_ = 0; i_36_ < i_7_; i_36_++) {
	    for (int i_37_ = 0; i_37_ < i_6_; i_37_++) {
		if (i_37_ <= i_36_ << 1)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[3][1] = is_8_;
	is_8_ = new byte[i_7_ * i_6_];
	i_9_ = 0;
	for (int i_38_ = 0; i_38_ < i_7_; i_38_++) {
	    for (int i_39_ = i_6_ - 1; i_39_ >= 0; i_39_--) {
		if (i_39_ >= i_38_ >> 1)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[3][2] = is_8_;
	is_8_ = new byte[i_7_ * i_6_];
	i_9_ = 0;
	for (int i_40_ = i_7_ - 1; i_40_ >= 0; i_40_--) {
	    for (int i_41_ = i_6_ - 1; i_41_ >= 0; i_41_--) {
		if (i_41_ <= i_40_ << 1)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[3][3] = is_8_;
	is_8_ = new byte[i_6_ * i_7_];
	i_9_ = 0;
	for (int i_42_ = i_7_ - 1; i_42_ >= 0; i_42_--) {
	    for (int i_43_ = i_6_ - 1; i_43_ >= 0; i_43_--) {
		if (i_43_ >= i_42_ >> 1)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[4][0] = is_8_;
	is_8_ = new byte[i_7_ * i_6_];
	i_9_ = 0;
	for (int i_44_ = i_7_ - 1; i_44_ >= 0; i_44_--) {
	    for (int i_45_ = 0; i_45_ < i_6_; i_45_++) {
		if (i_45_ <= i_44_ << 1)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[4][1] = is_8_;
	is_8_ = new byte[i_7_ * i_6_];
	i_9_ = 0;
	for (int i_46_ = 0; i_46_ < i_7_; i_46_++) {
	    for (int i_47_ = 0; i_47_ < i_6_; i_47_++) {
		if (i_47_ >= i_46_ >> 1)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[4][2] = is_8_;
	is_8_ = new byte[i_6_ * i_7_];
	i_9_ = 0;
	for (int i_48_ = 0; i_48_ < i_7_; i_48_++) {
	    for (int i_49_ = i_6_ - 1; i_49_ >= 0; i_49_--) {
		if (i_49_ <= i_48_ << 1)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[4][3] = is_8_;
	is_8_ = new byte[i_6_ * i_7_];
	i_9_ = 0;
	for (int i_50_ = 0; i_50_ < i_7_; i_50_++) {
	    for (int i_51_ = 0; i_51_ < i_6_; i_51_++) {
		if (i_51_ <= i_6_ / 2)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[5][0] = is_8_;
	is_8_ = new byte[i_7_ * i_6_];
	i_9_ = 0;
	for (int i_52_ = 0; i_52_ < i_7_; i_52_++) {
	    for (int i_53_ = 0; i_53_ < i_6_; i_53_++) {
		if (i_52_ <= i_7_ / 2)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[5][1] = is_8_;
	is_8_ = new byte[i_7_ * i_6_];
	i_9_ = 0;
	for (int i_54_ = 0; i_54_ < i_7_; i_54_++) {
	    for (int i_55_ = 0; i_55_ < i_6_; i_55_++) {
		if (i_55_ >= i_6_ / 2)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[5][2] = is_8_;
	is_8_ = new byte[i_6_ * i_7_];
	i_9_ = 0;
	for (int i_56_ = 0; i_56_ < i_7_; i_56_++) {
	    for (int i_57_ = 0; i_57_ < i_6_; i_57_++) {
		if (i_56_ >= i_7_ / 2)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[5][3] = is_8_;
	is_8_ = new byte[i_7_ * i_6_];
	i_9_ = 0;
	for (int i_58_ = 0; i_58_ < i_7_; i_58_++) {
	    for (int i_59_ = 0; i_59_ < i_6_; i_59_++) {
		if (i_59_ <= i_58_ - i_7_ / 2)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[6][0] = is_8_;
	is_8_ = new byte[i_6_ * i_7_];
	i_9_ = 0;
	for (int i_60_ = i_7_ - 1; i_60_ >= 0; i_60_--) {
	    for (int i_61_ = 0; i_61_ < i_6_; i_61_++) {
		if (i_61_ <= i_60_ - i_7_ / 2)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[6][1] = is_8_;
	is_8_ = new byte[i_7_ * i_6_];
	i_9_ = 0;
	for (int i_62_ = i_7_ - 1; i_62_ >= 0; i_62_--) {
	    for (int i_63_ = i_6_ - 1; i_63_ >= 0; i_63_--) {
		if (i_63_ <= i_62_ - i_7_ / 2)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[6][2] = is_8_;
	is_8_ = new byte[i_7_ * i_6_];
	i_9_ = 0;
	for (int i_64_ = 0; i_64_ < i_7_; i_64_++) {
	    for (int i_65_ = i_6_ - 1; i_65_ >= 0; i_65_--) {
		if (i_65_ <= i_64_ - i_7_ / 2)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[6][3] = is_8_;
	is_8_ = new byte[i_7_ * i_6_];
	i_9_ = 0;
	for (int i_66_ = 0; i_66_ < i_7_; i_66_++) {
	    for (int i_67_ = 0; i_67_ < i_6_; i_67_++) {
		if (i_67_ >= i_66_ - i_7_ / 2)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[7][0] = is_8_;
	is_8_ = new byte[i_7_ * i_6_];
	i_9_ = 0;
	for (int i_68_ = i_7_ - 1; i_68_ >= 0; i_68_--) {
	    for (int i_69_ = 0; i_69_ < i_6_; i_69_++) {
		if (i_69_ >= i_68_ - i_7_ / 2)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[7][1] = is_8_;
	is_8_ = new byte[i_7_ * i_6_];
	i_9_ = 0;
	for (int i_70_ = i_7_ - 1; i_70_ >= 0; i_70_--) {
	    for (int i_71_ = i_6_ - 1; i_71_ >= 0; i_71_--) {
		if (i_71_ >= i_70_ - i_7_ / 2)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[7][2] = is_8_;
	is_8_ = new byte[i_7_ * i_6_];
	i_9_ = 0;
	for (int i_72_ = 0; i_72_ < i_7_; i_72_++) {
	    for (int i_73_ = i_6_ - 1; i_73_ >= 0; i_73_--) {
		if (i_73_ >= i_72_ - i_7_ / 2)
		    is_8_[i_9_] = (byte) -1;
		i_9_++;
	    }
	}
	is[7][3] = is_8_;
	return is;
    }
}
