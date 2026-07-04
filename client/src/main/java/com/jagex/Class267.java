/* Class267 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.File;
import java.io.IOException;

public class Class267
{
    static Class699 aClass699_2940;
    byte[] aByteArray2941;
    int[] anIntArray2942;
    int[] anIntArray2943;
    
    int method4861(byte[] is, int i, byte[] is_0_, int i_1_, int i_2_,
		   int i_3_) {
	if (0 == i_2_)
	    return 0;
	int i_4_ = 0;
	i_2_ += i_1_;
	int i_5_ = i;
	for (;;) {
	    byte i_6_ = is[i_5_];
	    if (i_6_ < 0)
		i_4_ = anIntArray2943[i_4_];
	    else
		i_4_++;
	    int i_7_;
	    if ((i_7_ = anIntArray2943[i_4_]) < 0) {
		is_0_[i_1_++] = (byte) (i_7_ ^ 0xffffffff);
		if (i_1_ >= i_2_)
		    break;
		i_4_ = 0;
	    }
	    if (0 != (i_6_ & 0x40))
		i_4_ = anIntArray2943[i_4_];
	    else
		i_4_++;
	    if ((i_7_ = anIntArray2943[i_4_]) < 0) {
		is_0_[i_1_++] = (byte) (i_7_ ^ 0xffffffff);
		if (i_1_ >= i_2_)
		    break;
		i_4_ = 0;
	    }
	    if (0 != (i_6_ & 0x20))
		i_4_ = anIntArray2943[i_4_];
	    else
		i_4_++;
	    if ((i_7_ = anIntArray2943[i_4_]) < 0) {
		is_0_[i_1_++] = (byte) (i_7_ ^ 0xffffffff);
		if (i_1_ >= i_2_)
		    break;
		i_4_ = 0;
	    }
	    if ((i_6_ & 0x10) != 0)
		i_4_ = anIntArray2943[i_4_];
	    else
		i_4_++;
	    if ((i_7_ = anIntArray2943[i_4_]) < 0) {
		is_0_[i_1_++] = (byte) (i_7_ ^ 0xffffffff);
		if (i_1_ >= i_2_)
		    break;
		i_4_ = 0;
	    }
	    if ((i_6_ & 0x8) != 0)
		i_4_ = anIntArray2943[i_4_];
	    else
		i_4_++;
	    if ((i_7_ = anIntArray2943[i_4_]) < 0) {
		is_0_[i_1_++] = (byte) (i_7_ ^ 0xffffffff);
		if (i_1_ >= i_2_)
		    break;
		i_4_ = 0;
	    }
	    if ((i_6_ & 0x4) != 0)
		i_4_ = anIntArray2943[i_4_];
	    else
		i_4_++;
	    if ((i_7_ = anIntArray2943[i_4_]) < 0) {
		is_0_[i_1_++] = (byte) (i_7_ ^ 0xffffffff);
		if (i_1_ >= i_2_)
		    break;
		i_4_ = 0;
	    }
	    if (0 != (i_6_ & 0x2))
		i_4_ = anIntArray2943[i_4_];
	    else
		i_4_++;
	    if ((i_7_ = anIntArray2943[i_4_]) < 0) {
		is_0_[i_1_++] = (byte) (i_7_ ^ 0xffffffff);
		if (i_1_ >= i_2_)
		    break;
		i_4_ = 0;
	    }
	    if (0 != (i_6_ & 0x1))
		i_4_ = anIntArray2943[i_4_];
	    else
		i_4_++;
	    if ((i_7_ = anIntArray2943[i_4_]) < 0) {
		is_0_[i_1_++] = (byte) (i_7_ ^ 0xffffffff);
		if (i_1_ >= i_2_)
		    break;
		i_4_ = 0;
	    }
	    i_5_++;
	}
	return i_5_ + 1 - i;
    }
    
    int method4862(byte[] is, int i, int i_8_, byte[] is_9_, int i_10_,
		   int i_11_) {
	int i_12_ = 0;
	int i_13_ = i_10_ << 3;
	for (i_8_ += i; i < i_8_; i++) {
	    int i_14_ = is[i] & 0xff;
	    int i_15_ = anIntArray2942[i_14_];
	    int i_16_ = aByteArray2941[i_14_];
	    if (0 == i_16_)
		throw new RuntimeException(new StringBuilder().append("")
					       .append
					       (i_14_).toString());
	    int i_17_ = i_13_ >> 3;
	    int i_18_ = i_13_ & 0x7;
	    i_12_ &= -i_18_ >> 31;
	    int i_19_ = i_17_ + (i_16_ + i_18_ - 1 >> 3);
	    i_18_ += 24;
	    is_9_[i_17_] = (byte) (i_12_ |= i_15_ >>> i_18_);
	    if (i_17_ < i_19_) {
		i_17_++;
		i_18_ -= 8;
		is_9_[i_17_] = (byte) (i_12_ = i_15_ >>> i_18_);
		if (i_17_ < i_19_) {
		    i_17_++;
		    i_18_ -= 8;
		    is_9_[i_17_] = (byte) (i_12_ = i_15_ >>> i_18_);
		    if (i_17_ < i_19_) {
			i_17_++;
			i_18_ -= 8;
			is_9_[i_17_] = (byte) (i_12_ = i_15_ >>> i_18_);
			if (i_17_ < i_19_) {
			    i_17_++;
			    i_18_ -= 8;
			    is_9_[i_17_] = (byte) (i_12_ = i_15_ << -i_18_);
			}
		    }
		}
	    }
	    i_13_ += i_16_;
	}
	return (i_13_ + 7 >> 3) - i_10_;
    }
    
    int method4863(byte[] is, int i, int i_20_, byte[] is_21_, int i_22_) {
	int i_23_ = 0;
	int i_24_ = i_22_ << 3;
	for (i_20_ += i; i < i_20_; i++) {
	    int i_25_ = is[i] & 0xff;
	    int i_26_ = anIntArray2942[i_25_];
	    int i_27_ = aByteArray2941[i_25_];
	    if (0 == i_27_)
		throw new RuntimeException(new StringBuilder().append("")
					       .append
					       (i_25_).toString());
	    int i_28_ = i_24_ >> 3;
	    int i_29_ = i_24_ & 0x7;
	    i_23_ &= -i_29_ >> 31;
	    int i_30_ = i_28_ + (i_27_ + i_29_ - 1 >> 3);
	    i_29_ += 24;
	    is_21_[i_28_] = (byte) (i_23_ |= i_26_ >>> i_29_);
	    if (i_28_ < i_30_) {
		i_28_++;
		i_29_ -= 8;
		is_21_[i_28_] = (byte) (i_23_ = i_26_ >>> i_29_);
		if (i_28_ < i_30_) {
		    i_28_++;
		    i_29_ -= 8;
		    is_21_[i_28_] = (byte) (i_23_ = i_26_ >>> i_29_);
		    if (i_28_ < i_30_) {
			i_28_++;
			i_29_ -= 8;
			is_21_[i_28_] = (byte) (i_23_ = i_26_ >>> i_29_);
			if (i_28_ < i_30_) {
			    i_28_++;
			    i_29_ -= 8;
			    is_21_[i_28_] = (byte) (i_23_ = i_26_ << -i_29_);
			}
		    }
		}
	    }
	    i_24_ += i_27_;
	}
	return (i_24_ + 7 >> 3) - i_22_;
    }
    
    public Class267(byte[] is) {
	int i = is.length;
	anIntArray2942 = new int[i];
	aByteArray2941 = is;
	int[] is_31_ = new int[33];
	anIntArray2943 = new int[8];
	int i_32_ = 0;
	for (int i_33_ = 0; i_33_ < i; i_33_++) {
	    int i_34_ = is[i_33_];
	    if (i_34_ != 0) {
		int i_35_ = 1 << 32 - i_34_;
		int i_36_ = is_31_[i_34_];
		anIntArray2942[i_33_] = i_36_;
		int i_37_;
		if (0 != (i_36_ & i_35_))
		    i_37_ = is_31_[i_34_ - 1];
		else {
		    i_37_ = i_36_ | i_35_;
		    for (int i_38_ = i_34_ - 1; i_38_ >= 1; i_38_--) {
			int i_39_ = is_31_[i_38_];
			if (i_39_ != i_36_)
			    break;
			int i_40_ = 1 << 32 - i_38_;
			if ((i_39_ & i_40_) != 0) {
			    is_31_[i_38_] = is_31_[i_38_ - 1];
			    break;
			}
			is_31_[i_38_] = i_39_ | i_40_;
		    }
		}
		is_31_[i_34_] = i_37_;
		for (int i_41_ = i_34_ + 1; i_41_ <= 32; i_41_++) {
		    if (i_36_ == is_31_[i_41_])
			is_31_[i_41_] = i_37_;
		}
		int i_42_ = 0;
		for (int i_43_ = 0; i_43_ < i_34_; i_43_++) {
		    int i_44_ = -2147483648 >>> i_43_;
		    if ((i_36_ & i_44_) != 0) {
			if (anIntArray2943[i_42_] == 0)
			    anIntArray2943[i_42_] = i_32_;
			i_42_ = anIntArray2943[i_42_];
		    } else
			i_42_++;
		    if (i_42_ >= anIntArray2943.length) {
			int[] is_45_ = new int[2 * anIntArray2943.length];
			for (int i_46_ = 0; i_46_ < anIntArray2943.length;
			     i_46_++)
			    is_45_[i_46_] = anIntArray2943[i_46_];
			anIntArray2943 = is_45_;
		    }
		    i_44_ >>>= 1;
		}
		anIntArray2943[i_42_] = i_33_ ^ 0xffffffff;
		if (i_42_ >= i_32_)
		    i_32_ = i_42_ + 1;
	    }
	}
    }
    
    int method4864(byte[] is, int i, int i_47_, byte[] is_48_, int i_49_) {
	int i_50_ = 0;
	int i_51_ = i_49_ << 3;
	for (i_47_ += i; i < i_47_; i++) {
	    int i_52_ = is[i] & 0xff;
	    int i_53_ = anIntArray2942[i_52_];
	    int i_54_ = aByteArray2941[i_52_];
	    if (0 == i_54_)
		throw new RuntimeException(new StringBuilder().append("")
					       .append
					       (i_52_).toString());
	    int i_55_ = i_51_ >> 3;
	    int i_56_ = i_51_ & 0x7;
	    i_50_ &= -i_56_ >> 31;
	    int i_57_ = i_55_ + (i_54_ + i_56_ - 1 >> 3);
	    i_56_ += 24;
	    is_48_[i_55_] = (byte) (i_50_ |= i_53_ >>> i_56_);
	    if (i_55_ < i_57_) {
		i_55_++;
		i_56_ -= 8;
		is_48_[i_55_] = (byte) (i_50_ = i_53_ >>> i_56_);
		if (i_55_ < i_57_) {
		    i_55_++;
		    i_56_ -= 8;
		    is_48_[i_55_] = (byte) (i_50_ = i_53_ >>> i_56_);
		    if (i_55_ < i_57_) {
			i_55_++;
			i_56_ -= 8;
			is_48_[i_55_] = (byte) (i_50_ = i_53_ >>> i_56_);
			if (i_55_ < i_57_) {
			    i_55_++;
			    i_56_ -= 8;
			    is_48_[i_55_] = (byte) (i_50_ = i_53_ << -i_56_);
			}
		    }
		}
	    }
	    i_51_ += i_54_;
	}
	return (i_51_ + 7 >> 3) - i_49_;
    }
    
    int method4865(byte[] is, int i, byte[] is_58_, int i_59_, int i_60_) {
	if (0 == i_60_)
	    return 0;
	int i_61_ = 0;
	i_60_ += i_59_;
	int i_62_ = i;
	for (;;) {
	    byte i_63_ = is[i_62_];
	    if (i_63_ < 0)
		i_61_ = anIntArray2943[i_61_];
	    else
		i_61_++;
	    int i_64_;
	    if ((i_64_ = anIntArray2943[i_61_]) < 0) {
		is_58_[i_59_++] = (byte) (i_64_ ^ 0xffffffff);
		if (i_59_ >= i_60_)
		    break;
		i_61_ = 0;
	    }
	    if (0 != (i_63_ & 0x40))
		i_61_ = anIntArray2943[i_61_];
	    else
		i_61_++;
	    if ((i_64_ = anIntArray2943[i_61_]) < 0) {
		is_58_[i_59_++] = (byte) (i_64_ ^ 0xffffffff);
		if (i_59_ >= i_60_)
		    break;
		i_61_ = 0;
	    }
	    if (0 != (i_63_ & 0x20))
		i_61_ = anIntArray2943[i_61_];
	    else
		i_61_++;
	    if ((i_64_ = anIntArray2943[i_61_]) < 0) {
		is_58_[i_59_++] = (byte) (i_64_ ^ 0xffffffff);
		if (i_59_ >= i_60_)
		    break;
		i_61_ = 0;
	    }
	    if ((i_63_ & 0x10) != 0)
		i_61_ = anIntArray2943[i_61_];
	    else
		i_61_++;
	    if ((i_64_ = anIntArray2943[i_61_]) < 0) {
		is_58_[i_59_++] = (byte) (i_64_ ^ 0xffffffff);
		if (i_59_ >= i_60_)
		    break;
		i_61_ = 0;
	    }
	    if ((i_63_ & 0x8) != 0)
		i_61_ = anIntArray2943[i_61_];
	    else
		i_61_++;
	    if ((i_64_ = anIntArray2943[i_61_]) < 0) {
		is_58_[i_59_++] = (byte) (i_64_ ^ 0xffffffff);
		if (i_59_ >= i_60_)
		    break;
		i_61_ = 0;
	    }
	    if ((i_63_ & 0x4) != 0)
		i_61_ = anIntArray2943[i_61_];
	    else
		i_61_++;
	    if ((i_64_ = anIntArray2943[i_61_]) < 0) {
		is_58_[i_59_++] = (byte) (i_64_ ^ 0xffffffff);
		if (i_59_ >= i_60_)
		    break;
		i_61_ = 0;
	    }
	    if (0 != (i_63_ & 0x2))
		i_61_ = anIntArray2943[i_61_];
	    else
		i_61_++;
	    if ((i_64_ = anIntArray2943[i_61_]) < 0) {
		is_58_[i_59_++] = (byte) (i_64_ ^ 0xffffffff);
		if (i_59_ >= i_60_)
		    break;
		i_61_ = 0;
	    }
	    if (0 != (i_63_ & 0x1))
		i_61_ = anIntArray2943[i_61_];
	    else
		i_61_++;
	    if ((i_64_ = anIntArray2943[i_61_]) < 0) {
		is_58_[i_59_++] = (byte) (i_64_ ^ 0xffffffff);
		if (i_59_ >= i_60_)
		    break;
		i_61_ = 0;
	    }
	    i_62_++;
	}
	return i_62_ + 1 - i;
    }
    
    int method4866(byte[] is, int i, byte[] is_65_, int i_66_, int i_67_) {
	if (0 == i_67_)
	    return 0;
	int i_68_ = 0;
	i_67_ += i_66_;
	int i_69_ = i;
	for (;;) {
	    byte i_70_ = is[i_69_];
	    if (i_70_ < 0)
		i_68_ = anIntArray2943[i_68_];
	    else
		i_68_++;
	    int i_71_;
	    if ((i_71_ = anIntArray2943[i_68_]) < 0) {
		is_65_[i_66_++] = (byte) (i_71_ ^ 0xffffffff);
		if (i_66_ >= i_67_)
		    break;
		i_68_ = 0;
	    }
	    if (0 != (i_70_ & 0x40))
		i_68_ = anIntArray2943[i_68_];
	    else
		i_68_++;
	    if ((i_71_ = anIntArray2943[i_68_]) < 0) {
		is_65_[i_66_++] = (byte) (i_71_ ^ 0xffffffff);
		if (i_66_ >= i_67_)
		    break;
		i_68_ = 0;
	    }
	    if (0 != (i_70_ & 0x20))
		i_68_ = anIntArray2943[i_68_];
	    else
		i_68_++;
	    if ((i_71_ = anIntArray2943[i_68_]) < 0) {
		is_65_[i_66_++] = (byte) (i_71_ ^ 0xffffffff);
		if (i_66_ >= i_67_)
		    break;
		i_68_ = 0;
	    }
	    if ((i_70_ & 0x10) != 0)
		i_68_ = anIntArray2943[i_68_];
	    else
		i_68_++;
	    if ((i_71_ = anIntArray2943[i_68_]) < 0) {
		is_65_[i_66_++] = (byte) (i_71_ ^ 0xffffffff);
		if (i_66_ >= i_67_)
		    break;
		i_68_ = 0;
	    }
	    if ((i_70_ & 0x8) != 0)
		i_68_ = anIntArray2943[i_68_];
	    else
		i_68_++;
	    if ((i_71_ = anIntArray2943[i_68_]) < 0) {
		is_65_[i_66_++] = (byte) (i_71_ ^ 0xffffffff);
		if (i_66_ >= i_67_)
		    break;
		i_68_ = 0;
	    }
	    if ((i_70_ & 0x4) != 0)
		i_68_ = anIntArray2943[i_68_];
	    else
		i_68_++;
	    if ((i_71_ = anIntArray2943[i_68_]) < 0) {
		is_65_[i_66_++] = (byte) (i_71_ ^ 0xffffffff);
		if (i_66_ >= i_67_)
		    break;
		i_68_ = 0;
	    }
	    if (0 != (i_70_ & 0x2))
		i_68_ = anIntArray2943[i_68_];
	    else
		i_68_++;
	    if ((i_71_ = anIntArray2943[i_68_]) < 0) {
		is_65_[i_66_++] = (byte) (i_71_ ^ 0xffffffff);
		if (i_66_ >= i_67_)
		    break;
		i_68_ = 0;
	    }
	    if (0 != (i_70_ & 0x1))
		i_68_ = anIntArray2943[i_68_];
	    else
		i_68_++;
	    if ((i_71_ = anIntArray2943[i_68_]) < 0) {
		is_65_[i_66_++] = (byte) (i_71_ ^ 0xffffffff);
		if (i_66_ >= i_67_)
		    break;
		i_68_ = 0;
	    }
	    i_69_++;
	}
	return i_69_ + 1 - i;
    }
    
    static final void method4867(Class669 class669, int i) {
	int i_72_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_72_, -563488637);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_72_ >> 16];
	Class100.method1886(class247, class243, class669, (byte) -116);
    }
    
    static final void method4868(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	int[] is = Class546.method8989(string, class669, -219410121);
	if (null != is)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2579
	    = Class99.method1859(string, class669, 429397378);
	class247.anIntArray2574 = is;
	class247.aBool2561 = true;
    }
    
    static final void method4869(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class622.method10289(class247, class243, class669, 213305236);
    }
    
    public static void method4870(byte i) throws RuntimeException {
	if (Class503.aString5626.startsWith("win")) {
	    Class409.method6709(1768982251);
	    Object object = null;
	    String string = Class69.aString727;
	    File file = new File(string);
	    if (!file.isFile())
		throw new RuntimeException();
	    if (!file.canRead())
		throw new RuntimeException();
	    if (Class106.aClass106_1310 == Class69.aClass106_726)
		throw new RuntimeException();
	    try {
		Class228.aProcess2321
		    = new ProcessBuilder(new String[] { string }).start();
		Class69.aClass106_726 = Class106.aClass106_1310;
	    } catch (IOException ioexception) {
		throw new RuntimeException();
	    }
	}
    }
    
    static void method4871(int i, int i_73_, int i_74_, int i_75_, int i_76_,
			   int i_77_, Class596 class596, byte i_78_) {
	Class534_Sub4 class534_sub4 = null;
	for (Class534_Sub4 class534_sub4_79_
		 = ((Class534_Sub4)
		    Class534_Sub4.aClass700_10409.method14135((byte) -1));
	     class534_sub4_79_ != null;
	     class534_sub4_79_
		 = ((Class534_Sub4)
		    Class534_Sub4.aClass700_10409.method14139(1818307211))) {
	    if (i == class534_sub4_79_.anInt10402 * -511427777
		&& -1522052283 * class534_sub4_79_.anInt10397 == i_73_
		&& -1246362377 * class534_sub4_79_.anInt10400 == i_74_
		&& i_75_ == -1831835741 * class534_sub4_79_.anInt10405) {
		class534_sub4 = class534_sub4_79_;
		break;
	    }
	}
	if (null == class534_sub4) {
	    class534_sub4 = new Class534_Sub4();
	    class534_sub4.anInt10402 = -453954369 * i;
	    class534_sub4.anInt10405 = 2108621835 * i_75_;
	    class534_sub4.anInt10397 = 1402161037 * i_73_;
	    class534_sub4.anInt10400 = i_74_ * 2107243719;
	    Class534_Sub4.aClass700_10409.method14131(class534_sub4,
						      (short) 789);
	}
	class534_sub4.anInt10398 = -1796323797 * i_76_;
	class534_sub4.anInt10404 = -804529983 * i_77_;
	class534_sub4.aClass596_10399 = class596;
	class534_sub4.aBool10406 = true;
	class534_sub4.aBool10407 = false;
    }
    
    static void method4872(int i, byte i_80_) {
	int i_81_;
	if (i == 0)
	    i_81_ = 0;
	else if (1 == i)
	    i_81_ = 1;
	else if (i == 2)
	    i_81_ = 2;
	else
	    return;
	int i_82_;
	if ((double) Class554_Sub1.aFloat7409 == 2.0)
	    i_82_ = 0;
	else if ((double) Class554_Sub1.aFloat7409 == 3.0)
	    i_82_ = 1;
	else if ((double) Class554_Sub1.aFloat7409 == 4.0)
	    i_82_ = 2;
	else if ((double) Class554_Sub1.aFloat7409 == 6.0)
	    i_82_ = 3;
	else if ((double) Class554_Sub1.aFloat7409 >= 8.0)
	    i_82_ = 4;
	else
	    return;
	Class582.aClass171_7771
	    = Class554_Sub1.aClass171ArrayArray10678[i_81_][i_82_];
	Class236.aClass16_2373
	    = Class554_Sub1.aClass16ArrayArray10679[i_81_][i_82_];
    }
    
    static final void method4873(Class669 class669, int i) {
	class669.anInt8600 -= 926998689;
	long l
	    = (long) class669.anIntArray8595[class669.anInt8600 * 2088438307];
	long l_83_ = (long) (class669.anIntArray8595
			     [1 + class669.anInt8600 * 2088438307]);
	long l_84_ = (long) (class669.anIntArray8595
			     [2 + class669.anInt8600 * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (int) (l_84_ * l / l_83_);
    }
}
