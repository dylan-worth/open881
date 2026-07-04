/* Class661 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class661
{
    static int anInt8547 = 0;
    public static int[] anIntArray8548;
    public static int[] anIntArray8549;
    static int anInt8550 = 0;
    
    public static void method10951(boolean bool, boolean bool_0_) {
	if (bool) {
	    anInt8547 -= 194044063;
	    if (0 == -477611169 * anInt8547)
		Class415.anIntArray4666 = null;
	}
	if (bool_0_) {
	    anInt8550 -= 555410307;
	    if (0 == anInt8550 * -68828373)
		anIntArray8549 = null;
	}
    }
    
    public static int method10952(int i, int i_1_, float f) {
	return Class197.method3817(i, i_1_, (int) f, 1631769621);
    }
    
    public static void method10953(boolean bool, boolean bool_2_) {
	if (bool) {
	    anInt8547 += 194044063;
	    Class504.method8319(487883364);
	}
	if (bool_2_) {
	    anInt8550 += 555410307;
	    Class655.method10852((byte) 19);
	}
    }
    
    public static void method10954(boolean bool, boolean bool_3_) {
	if (bool) {
	    anInt8547 -= 194044063;
	    if (0 == -477611169 * anInt8547)
		Class415.anIntArray4666 = null;
	}
	if (bool_3_) {
	    anInt8550 -= 555410307;
	    if (0 == anInt8550 * -68828373)
		anIntArray8549 = null;
	}
    }
    
    public static final int method10955(int i, int i_4_) {
	if (-1 == i)
	    return 12345678;
	i_4_ = i_4_ * (i & 0x7f) >> 7;
	if (i_4_ < 2)
	    i_4_ = 2;
	else if (i_4_ > 126)
	    i_4_ = 126;
	return i_4_ + (i & 0xff80);
    }
    
    public static void method10956(boolean bool, boolean bool_5_) {
	if (bool) {
	    anInt8547 -= 194044063;
	    if (0 == -477611169 * anInt8547)
		Class415.anIntArray4666 = null;
	}
	if (bool_5_) {
	    anInt8550 -= 555410307;
	    if (0 == anInt8550 * -68828373)
		anIntArray8549 = null;
	}
    }
    
    public static int method10957(int i, int i_6_) {
	i_6_ = (i & 0x7f) * i_6_ >> 7;
	if (i_6_ < 2)
	    i_6_ = 2;
	else if (i_6_ > 126)
	    i_6_ = 126;
	return (i & 0xff80) + i_6_;
    }
    
    static void method10958() {
	if (Class415.anIntArray4666 == null)
	    Class415.anIntArray4666 = new int[65536];
	else
	    return;
	double d = 0.7;
	int i = 0;
	for (int i_7_ = 0; i_7_ < 512; i_7_++) {
	    float f = 360.0F * (0.0078125F + (float) (i_7_ >> 3) / 64.0F);
	    float f_8_ = 0.0625F + (float) (i_7_ & 0x7) / 8.0F;
	    for (int i_9_ = 0; i_9_ < 128; i_9_++) {
		float f_10_ = (float) i_9_ / 128.0F;
		float f_11_ = 0.0F;
		float f_12_ = 0.0F;
		float f_13_ = 0.0F;
		float f_14_ = f / 60.0F;
		int i_15_ = (int) f_14_;
		int i_16_ = i_15_ % 6;
		float f_17_ = f_14_ - (float) i_15_;
		float f_18_ = (1.0F - f_8_) * f_10_;
		float f_19_ = f_10_ * (1.0F - f_17_ * f_8_);
		float f_20_ = f_10_ * (1.0F - f_8_ * (1.0F - f_17_));
		if (0 == i_16_) {
		    f_11_ = f_10_;
		    f_12_ = f_20_;
		    f_13_ = f_18_;
		} else if (1 == i_16_) {
		    f_11_ = f_19_;
		    f_12_ = f_10_;
		    f_13_ = f_18_;
		} else if (i_16_ == 2) {
		    f_11_ = f_18_;
		    f_12_ = f_10_;
		    f_13_ = f_20_;
		} else if (i_16_ == 3) {
		    f_11_ = f_18_;
		    f_12_ = f_19_;
		    f_13_ = f_10_;
		} else if (4 == i_16_) {
		    f_11_ = f_20_;
		    f_12_ = f_18_;
		    f_13_ = f_10_;
		} else if (5 == i_16_) {
		    f_11_ = f_10_;
		    f_12_ = f_18_;
		    f_13_ = f_19_;
		}
		f_11_ = (float) Math.pow((double) f_11_, d);
		f_12_ = (float) Math.pow((double) f_12_, d);
		f_13_ = (float) Math.pow((double) f_13_, d);
		int i_21_ = (int) (256.0F * f_11_);
		int i_22_ = (int) (f_12_ * 256.0F);
		int i_23_ = (int) (256.0F * f_13_);
		int i_24_
		    = i_23_ + ((i_22_ << 8) + (-16777216 + (i_21_ << 16)));
		Class415.anIntArray4666[i++] = i_24_;
	    }
	}
    }
    
    static void method10959() {
	if (Class415.anIntArray4666 == null)
	    Class415.anIntArray4666 = new int[65536];
	else
	    return;
	double d = 0.7;
	int i = 0;
	for (int i_25_ = 0; i_25_ < 512; i_25_++) {
	    float f = 360.0F * (0.0078125F + (float) (i_25_ >> 3) / 64.0F);
	    float f_26_ = 0.0625F + (float) (i_25_ & 0x7) / 8.0F;
	    for (int i_27_ = 0; i_27_ < 128; i_27_++) {
		float f_28_ = (float) i_27_ / 128.0F;
		float f_29_ = 0.0F;
		float f_30_ = 0.0F;
		float f_31_ = 0.0F;
		float f_32_ = f / 60.0F;
		int i_33_ = (int) f_32_;
		int i_34_ = i_33_ % 6;
		float f_35_ = f_32_ - (float) i_33_;
		float f_36_ = (1.0F - f_26_) * f_28_;
		float f_37_ = f_28_ * (1.0F - f_35_ * f_26_);
		float f_38_ = f_28_ * (1.0F - f_26_ * (1.0F - f_35_));
		if (0 == i_34_) {
		    f_29_ = f_28_;
		    f_30_ = f_38_;
		    f_31_ = f_36_;
		} else if (1 == i_34_) {
		    f_29_ = f_37_;
		    f_30_ = f_28_;
		    f_31_ = f_36_;
		} else if (i_34_ == 2) {
		    f_29_ = f_36_;
		    f_30_ = f_28_;
		    f_31_ = f_38_;
		} else if (i_34_ == 3) {
		    f_29_ = f_36_;
		    f_30_ = f_37_;
		    f_31_ = f_28_;
		} else if (4 == i_34_) {
		    f_29_ = f_38_;
		    f_30_ = f_36_;
		    f_31_ = f_28_;
		} else if (5 == i_34_) {
		    f_29_ = f_28_;
		    f_30_ = f_36_;
		    f_31_ = f_37_;
		}
		f_29_ = (float) Math.pow((double) f_29_, d);
		f_30_ = (float) Math.pow((double) f_30_, d);
		f_31_ = (float) Math.pow((double) f_31_, d);
		int i_39_ = (int) (256.0F * f_29_);
		int i_40_ = (int) (f_30_ * 256.0F);
		int i_41_ = (int) (256.0F * f_31_);
		int i_42_
		    = i_41_ + ((i_40_ << 8) + (-16777216 + (i_39_ << 16)));
		Class415.anIntArray4666[i++] = i_42_;
	    }
	}
    }
    
    static void method10960() {
	if (Class415.anIntArray4666 == null)
	    Class415.anIntArray4666 = new int[65536];
	else
	    return;
	double d = 0.7;
	int i = 0;
	for (int i_43_ = 0; i_43_ < 512; i_43_++) {
	    float f = 360.0F * (0.0078125F + (float) (i_43_ >> 3) / 64.0F);
	    float f_44_ = 0.0625F + (float) (i_43_ & 0x7) / 8.0F;
	    for (int i_45_ = 0; i_45_ < 128; i_45_++) {
		float f_46_ = (float) i_45_ / 128.0F;
		float f_47_ = 0.0F;
		float f_48_ = 0.0F;
		float f_49_ = 0.0F;
		float f_50_ = f / 60.0F;
		int i_51_ = (int) f_50_;
		int i_52_ = i_51_ % 6;
		float f_53_ = f_50_ - (float) i_51_;
		float f_54_ = (1.0F - f_44_) * f_46_;
		float f_55_ = f_46_ * (1.0F - f_53_ * f_44_);
		float f_56_ = f_46_ * (1.0F - f_44_ * (1.0F - f_53_));
		if (0 == i_52_) {
		    f_47_ = f_46_;
		    f_48_ = f_56_;
		    f_49_ = f_54_;
		} else if (1 == i_52_) {
		    f_47_ = f_55_;
		    f_48_ = f_46_;
		    f_49_ = f_54_;
		} else if (i_52_ == 2) {
		    f_47_ = f_54_;
		    f_48_ = f_46_;
		    f_49_ = f_56_;
		} else if (i_52_ == 3) {
		    f_47_ = f_54_;
		    f_48_ = f_55_;
		    f_49_ = f_46_;
		} else if (4 == i_52_) {
		    f_47_ = f_56_;
		    f_48_ = f_54_;
		    f_49_ = f_46_;
		} else if (5 == i_52_) {
		    f_47_ = f_46_;
		    f_48_ = f_54_;
		    f_49_ = f_55_;
		}
		f_47_ = (float) Math.pow((double) f_47_, d);
		f_48_ = (float) Math.pow((double) f_48_, d);
		f_49_ = (float) Math.pow((double) f_49_, d);
		int i_57_ = (int) (256.0F * f_47_);
		int i_58_ = (int) (f_48_ * 256.0F);
		int i_59_ = (int) (256.0F * f_49_);
		int i_60_
		    = i_59_ + ((i_58_ << 8) + (-16777216 + (i_57_ << 16)));
		Class415.anIntArray4666[i++] = i_60_;
	    }
	}
    }
    
    static void method10961() {
	if (null == anIntArray8549) {
	    anIntArray8549 = new int[65536];
	    anIntArray8548 = new int[65536];
	    double d = 0.7;
	    for (int i = 0; i < 65536; i++) {
		double d_61_ = (double) (i >> 10 & 0x3f) / 64.0 + 0.0078125;
		double d_62_ = (double) (i >> 7 & 0x7) / 8.0 + 0.0625;
		double d_63_ = (double) (i & 0x7f) / 128.0;
		double d_64_ = d_63_;
		double d_65_ = d_63_;
		double d_66_ = d_63_;
		if (0.0 != d_62_) {
		    double d_67_;
		    if (d_63_ < 0.5)
			d_67_ = d_63_ * (1.0 + d_62_);
		    else
			d_67_ = d_62_ + d_63_ - d_63_ * d_62_;
		    double d_68_ = 2.0 * d_63_ - d_67_;
		    double d_69_ = d_61_ + 0.3333333333333333;
		    if (d_69_ > 1.0)
			d_69_--;
		    double d_70_ = d_61_;
		    double d_71_ = d_61_ - 0.3333333333333333;
		    if (d_71_ < 0.0)
			d_71_++;
		    if (6.0 * d_69_ < 1.0)
			d_64_ = (d_67_ - d_68_) * 6.0 * d_69_ + d_68_;
		    else if (2.0 * d_69_ < 1.0)
			d_64_ = d_67_;
		    else if (d_69_ * 3.0 < 2.0)
			d_64_ = 6.0 * ((0.6666666666666666 - d_69_)
				       * (d_67_ - d_68_)) + d_68_;
		    else
			d_64_ = d_68_;
		    if (d_70_ * 6.0 < 1.0)
			d_65_ = d_68_ + d_70_ * ((d_67_ - d_68_) * 6.0);
		    else if (2.0 * d_70_ < 1.0)
			d_65_ = d_67_;
		    else if (3.0 * d_70_ < 2.0)
			d_65_ = ((0.6666666666666666 - d_70_) * (d_67_ - d_68_)
				 * 6.0) + d_68_;
		    else
			d_65_ = d_68_;
		    if (d_71_ * 6.0 < 1.0)
			d_66_ = d_71_ * ((d_67_ - d_68_) * 6.0) + d_68_;
		    else if (d_71_ * 2.0 < 1.0)
			d_66_ = d_67_;
		    else if (3.0 * d_71_ < 2.0)
			d_66_ = ((0.6666666666666666 - d_71_) * (d_67_ - d_68_)
				 * 6.0) + d_68_;
		    else
			d_66_ = d_68_;
		}
		d_64_ = Math.pow(d_64_, d);
		d_65_ = Math.pow(d_65_, d);
		d_66_ = Math.pow(d_66_, d);
		int i_72_ = (int) (d_64_ * 256.0);
		int i_73_ = (int) (256.0 * d_65_);
		int i_74_ = (int) (d_66_ * 256.0);
		int i_75_ = i_74_ + ((i_73_ << 8) + (i_72_ << 16));
		anIntArray8549[i] = i_75_ & 0xffffff;
		int i_76_ = (i_74_ << 16) + (i_73_ << 8) + i_72_;
		anIntArray8548[i] = i_76_;
	    }
	}
    }
    
    public static int method10962(int i, int i_77_) {
	i_77_ = (i & 0x7f) * i_77_ >> 7;
	if (i_77_ < 2)
	    i_77_ = 2;
	else if (i_77_ > 126)
	    i_77_ = 126;
	return (i & 0xff80) + i_77_;
    }
    
    static void method10963() {
	if (Class415.anIntArray4666 == null)
	    Class415.anIntArray4666 = new int[65536];
	else
	    return;
	double d = 0.7;
	int i = 0;
	for (int i_78_ = 0; i_78_ < 512; i_78_++) {
	    float f = 360.0F * (0.0078125F + (float) (i_78_ >> 3) / 64.0F);
	    float f_79_ = 0.0625F + (float) (i_78_ & 0x7) / 8.0F;
	    for (int i_80_ = 0; i_80_ < 128; i_80_++) {
		float f_81_ = (float) i_80_ / 128.0F;
		float f_82_ = 0.0F;
		float f_83_ = 0.0F;
		float f_84_ = 0.0F;
		float f_85_ = f / 60.0F;
		int i_86_ = (int) f_85_;
		int i_87_ = i_86_ % 6;
		float f_88_ = f_85_ - (float) i_86_;
		float f_89_ = (1.0F - f_79_) * f_81_;
		float f_90_ = f_81_ * (1.0F - f_88_ * f_79_);
		float f_91_ = f_81_ * (1.0F - f_79_ * (1.0F - f_88_));
		if (0 == i_87_) {
		    f_82_ = f_81_;
		    f_83_ = f_91_;
		    f_84_ = f_89_;
		} else if (1 == i_87_) {
		    f_82_ = f_90_;
		    f_83_ = f_81_;
		    f_84_ = f_89_;
		} else if (i_87_ == 2) {
		    f_82_ = f_89_;
		    f_83_ = f_81_;
		    f_84_ = f_91_;
		} else if (i_87_ == 3) {
		    f_82_ = f_89_;
		    f_83_ = f_90_;
		    f_84_ = f_81_;
		} else if (4 == i_87_) {
		    f_82_ = f_91_;
		    f_83_ = f_89_;
		    f_84_ = f_81_;
		} else if (5 == i_87_) {
		    f_82_ = f_81_;
		    f_83_ = f_89_;
		    f_84_ = f_90_;
		}
		f_82_ = (float) Math.pow((double) f_82_, d);
		f_83_ = (float) Math.pow((double) f_83_, d);
		f_84_ = (float) Math.pow((double) f_84_, d);
		int i_92_ = (int) (256.0F * f_82_);
		int i_93_ = (int) (f_83_ * 256.0F);
		int i_94_ = (int) (256.0F * f_84_);
		int i_95_
		    = i_94_ + ((i_93_ << 8) + (-16777216 + (i_92_ << 16)));
		Class415.anIntArray4666[i++] = i_95_;
	    }
	}
    }
    
    public static int method10964(int i, int i_96_) {
	int i_97_ = i_96_ >>> 24;
	int i_98_ = 255 - i_97_;
	i_96_ = (i_97_ * (i_96_ & 0xff00ff) & ~0xff00ff
		 | i_97_ * (i_96_ & 0xff00) & 0xff0000) >>> 8;
	return ((((i & 0xff00ff) * i_98_ & ~0xff00ff
		  | i_98_ * (i & 0xff00) & 0xff0000)
		 >>> 8)
		+ i_96_);
    }
    
    public static int method10965(int i, int i_99_, int i_100_) {
	int i_101_ = 255 - i_100_;
	i_99_ = (i_100_ * (i_99_ & 0xff00ff) & ~0xff00ff
		 | (i_99_ & 0xff00) * i_100_ & 0xff0000) >>> 8;
	return i_99_ + ((i_101_ * (i & 0xff00ff) & ~0xff00ff
			 | (i & 0xff00) * i_101_ & 0xff0000)
			>>> 8);
    }
    
    public static int method10966(int i, int i_102_, int i_103_) {
	int i_104_ = 255 - i_103_;
	i_102_ = (i_103_ * (i_102_ & 0xff00ff) & ~0xff00ff
		  | (i_102_ & 0xff00) * i_103_ & 0xff0000) >>> 8;
	return i_102_ + ((i_104_ * (i & 0xff00ff) & ~0xff00ff
			  | (i & 0xff00) * i_104_ & 0xff0000)
			 >>> 8);
    }
    
    Class661() throws Throwable {
	throw new Error();
    }
    
    static void method10967() {
	if (Class415.anIntArray4666 == null)
	    Class415.anIntArray4666 = new int[65536];
	else
	    return;
	double d = 0.7;
	int i = 0;
	for (int i_105_ = 0; i_105_ < 512; i_105_++) {
	    float f = 360.0F * (0.0078125F + (float) (i_105_ >> 3) / 64.0F);
	    float f_106_ = 0.0625F + (float) (i_105_ & 0x7) / 8.0F;
	    for (int i_107_ = 0; i_107_ < 128; i_107_++) {
		float f_108_ = (float) i_107_ / 128.0F;
		float f_109_ = 0.0F;
		float f_110_ = 0.0F;
		float f_111_ = 0.0F;
		float f_112_ = f / 60.0F;
		int i_113_ = (int) f_112_;
		int i_114_ = i_113_ % 6;
		float f_115_ = f_112_ - (float) i_113_;
		float f_116_ = (1.0F - f_106_) * f_108_;
		float f_117_ = f_108_ * (1.0F - f_115_ * f_106_);
		float f_118_ = f_108_ * (1.0F - f_106_ * (1.0F - f_115_));
		if (0 == i_114_) {
		    f_109_ = f_108_;
		    f_110_ = f_118_;
		    f_111_ = f_116_;
		} else if (1 == i_114_) {
		    f_109_ = f_117_;
		    f_110_ = f_108_;
		    f_111_ = f_116_;
		} else if (i_114_ == 2) {
		    f_109_ = f_116_;
		    f_110_ = f_108_;
		    f_111_ = f_118_;
		} else if (i_114_ == 3) {
		    f_109_ = f_116_;
		    f_110_ = f_117_;
		    f_111_ = f_108_;
		} else if (4 == i_114_) {
		    f_109_ = f_118_;
		    f_110_ = f_116_;
		    f_111_ = f_108_;
		} else if (5 == i_114_) {
		    f_109_ = f_108_;
		    f_110_ = f_116_;
		    f_111_ = f_117_;
		}
		f_109_ = (float) Math.pow((double) f_109_, d);
		f_110_ = (float) Math.pow((double) f_110_, d);
		f_111_ = (float) Math.pow((double) f_111_, d);
		int i_119_ = (int) (256.0F * f_109_);
		int i_120_ = (int) (f_110_ * 256.0F);
		int i_121_ = (int) (256.0F * f_111_);
		int i_122_
		    = i_121_ + ((i_120_ << 8) + (-16777216 + (i_119_ << 16)));
		Class415.anIntArray4666[i++] = i_122_;
	    }
	}
    }
    
    public static int method10968(int i) {
	double d = (double) (i >> 16 & 0xff) / 256.0;
	double d_123_ = (double) (i >> 8 & 0xff) / 256.0;
	double d_124_ = (double) (i & 0xff) / 256.0;
	double d_125_ = d;
	if (d_123_ < d_125_)
	    d_125_ = d_123_;
	if (d_124_ < d_125_)
	    d_125_ = d_124_;
	double d_126_ = d;
	if (d_123_ > d_126_)
	    d_126_ = d_123_;
	if (d_124_ > d_126_)
	    d_126_ = d_124_;
	double d_127_ = 0.0;
	double d_128_ = 0.0;
	double d_129_ = (d_126_ + d_125_) / 2.0;
	if (d_126_ != d_125_) {
	    if (d_129_ < 0.5)
		d_128_ = (d_126_ - d_125_) / (d_126_ + d_125_);
	    if (d_129_ >= 0.5)
		d_128_ = (d_126_ - d_125_) / (2.0 - d_126_ - d_125_);
	    if (d_126_ == d)
		d_127_ = (d_123_ - d_124_) / (d_126_ - d_125_);
	    else if (d_126_ == d_123_)
		d_127_ = (d_124_ - d) / (d_126_ - d_125_) + 2.0;
	    else if (d_124_ == d_126_)
		d_127_ = (d - d_123_) / (d_126_ - d_125_) + 4.0;
	}
	d_127_ /= 6.0;
	int i_130_ = (int) (d_127_ * 256.0);
	int i_131_ = (int) (d_128_ * 256.0);
	int i_132_ = (int) (d_129_ * 256.0);
	if (i_131_ < 0)
	    i_131_ = 0;
	else if (i_131_ > 255)
	    i_131_ = 255;
	if (i_132_ < 0)
	    i_132_ = 0;
	else if (i_132_ > 255)
	    i_132_ = 255;
	if (i_132_ > 243)
	    i_131_ >>= 4;
	else if (i_132_ > 217)
	    i_131_ >>= 3;
	else if (i_132_ > 192)
	    i_131_ >>= 2;
	else if (i_132_ > 179)
	    i_131_ >>= 1;
	return ((i_132_ >> 1)
		+ (((i_130_ & 0xff) >> 2 << 10) + (i_131_ >> 5 << 7)));
    }
    
    public static int method10969(int i, int i_133_, int i_134_) {
	int i_135_ = 255 - i_134_;
	i_133_ = (i_134_ * (i_133_ & 0xff00ff) & ~0xff00ff
		  | (i_133_ & 0xff00) * i_134_ & 0xff0000) >>> 8;
	return i_133_ + ((i_135_ * (i & 0xff00ff) & ~0xff00ff
			  | (i & 0xff00) * i_135_ & 0xff0000)
			 >>> 8);
    }
    
    public static final int method10970(int i, int i_136_) {
	if (i == -2)
	    return 12345678;
	if (-1 == i) {
	    if (i_136_ < 2)
		i_136_ = 2;
	    else if (i_136_ > 126)
		i_136_ = 126;
	    return i_136_;
	}
	i_136_ = i_136_ * (i & 0x7f) >> 7;
	if (i_136_ < 2)
	    i_136_ = 2;
	else if (i_136_ > 126)
	    i_136_ = 126;
	return i_136_ + (i & 0xff80);
    }
    
    static final void method10971(Class247 class247, Class243 class243,
				  Class669 class669, byte i) {
	class247.anInt2538
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) * -156381549;
	Class454.method7416(class247, -1430522310);
    }
    
    static final void method10972(Class247 class247, Class243 class243,
				  Class669 class669, byte i) {
	int i_137_ = ((class669.anIntArray8595
		       [(class669.anInt8600 -= 308999563) * 2088438307])
		      - 1);
	if (i_137_ < 0 || i_137_ > 9)
	    class669.anInt8594 -= 1460193483;
	else
	    class247.method4528(i_137_,
				(String) (class669.anObjectArray8593
					  [((class669.anInt8594 -= 1460193483)
					    * 1485266147)]),
				(short) -6952);
    }
    
    static final void method10973(Class669 class669, byte i) {
	Class534_Sub18_Sub7 class534_sub18_sub7
	    = Class641.method10603((byte) 15);
	if (Class505.method8358(class534_sub18_sub7, (byte) -5) == 7) {
	    int i_138_ = (int) class534_sub18_sub7.method18228((byte) -84);
	    if (i_138_ >= 0 && i_138_ <= -1843550713 * Class108.anInt1321) {
		Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		    = client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i_138_];
		if (class654_sub1_sub5_sub1_sub2 != null) {
		    class669.aClass654_Sub1_Sub5_Sub1_8604
			= class654_sub1_sub5_sub1_sub2;
		    class669.anIntArray8595
			[(class669.anInt8600 += 308999563) * 2088438307 - 1]
			= 1;
		    return;
		}
	    }
	}
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 0;
    }
    
    static final void method10974(Class669 class669, byte i) {
	int i_139_ = (class669.anIntArray8595
		      [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = Class154.method2575(i_139_, -574539090);
    }
    
    static final void method10975(Class669 class669, byte i) {
	int i_140_ = (class669.anIntArray8595
		      [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_140_, 112470865);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_140_ >> 16];
	Class485.method7960(class247, class243, class669, 856982529);
    }
    
    static int method10976(int i) {
	if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub42_10777
		.method17227(-1784954723)
	    == 0) {
	    for (int i_141_ = 0; i_141_ < client.anInt11066 * 1779655715;
		 i_141_++) {
		if ((client.anInterface63Array11067[i_141_].method424((byte) 1)
		     == 's')
		    || client.anInterface63Array11067[i_141_]
			   .method424((byte) 1) == 'S') {
		    Class44_Sub6.aClass534_Sub35_10989.method16438
			((Class44_Sub6.aClass534_Sub35_10989
			  .aClass690_Sub42_10777),
			 1, 981838889);
		    client.aBool11028 = true;
		    Class325.method5818(Class26.aClass26_241, (byte) -38);
		    break;
		}
	    }
	}
	if (Class294.aClass294_3142 == Class110.aClass294_1344) {
	    if (null == Class522.aClass467_7082)
		Class522.aClass467_7082
		    = new Class467(Class6.aClass450_56, Class66.aClass464_713,
				   Class645.aClass463_8374,
				   Class37.LOGIN_EXPONENT,
				   Class37.RSA_UPDATE_MODULUS);
	    if (!Class522.aClass467_7082.method7586(1729242678))
		return 0;
	    Class150.method2490(0, null, true, (byte) -43);
	    Class223.aBool2315 = !Class281.method5237((short) 26552);
	    Class334.aClass472_3508
		= Class467.method7602((Class223.aBool2315
				       ? Class50.aClass50_395
				       : Class50.aClass50_393),
				      false, 1, true, true, -1747764863);
	    Class334.aClass472_3507
		= Class467.method7602(Class50.aClass50_394, false, 1, true,
				      true, -1747764863);
	    Class606.aClass472_7988
		= Class467.method7602(Class50.aClass50_376, false, 1, true,
				      true, -1747764863);
	    Class588.aClass472_7807
		= Class467.method7602(Class50.aClass50_405, true, 1, true,
				      true, -1747764863);
	}
	if (Class110.aClass294_1344 == Class294.aClass294_3140) {
	    boolean bool = Class334.aClass472_3507.method7672(1149416431);
	    boolean bool_142_ = Class588.aClass472_7807.method7672(11184034);
	    int i_143_ = Class57.aClass451_Sub1Array459
			     [Class50.aClass50_394.method1155(1311407359)]
			     .method15885(167884025);
	    i_143_ = (i_143_
		      + Class57.aClass451_Sub1Array459
			    [(Class223.aBool2315
			      ? Class50.aClass50_395.method1155(1311407359)
			      : Class50.aClass50_393.method1155(1311407359))]
			    .method15885(-2081063168));
	    i_143_ += Class57.aClass451_Sub1Array459
			  [Class50.aClass50_376.method1155(1311407359)]
			  .method15885(993462563);
	    i_143_
		= i_143_ + (bool_142_ ? 100
			    : Class588.aClass472_7807.method7674(-1582434531));
	    i_143_
		= i_143_ + (bool ? 100
			    : Class334.aClass472_3507.method7674(1568055044));
	    if (i_143_ != 500)
		return i_143_ / 5;
	    Class620.aClass632_8113 = new Class632(Class588.aClass472_7807);
	    Class569.method9597(Class620.aClass632_8113, (byte) 12);
	    int i_144_ = Class44_Sub6.aClass534_Sub35_10989
			     .aClass690_Sub43_10780.method17236(1339111786);
	    Class334.aClass87_3505
		= new Class87(client.aClass675_11016, Class539.aClass672_7171,
			      Class334.aClass472_3507);
	    Class94[] class94s
		= Class334.aClass87_3505.method1703(i_144_, (byte) 27);
	    if (class94s.length == 0)
		class94s = Class334.aClass87_3505.method1703(0, (byte) 74);
	    Class313 class313 = new Class313(Class334.aClass472_3508,
					     Class606.aClass472_7988);
	    if (class94s.length > 0) {
		Class334.anInterface33Array3502
		    = new Interface33[class94s.length];
		for (int i_145_ = 0;
		     i_145_ < Class334.anInterface33Array3502.length; i_145_++)
		    Class334.anInterface33Array3502[i_145_]
			= new Class291((Class334.aClass87_3505.method1702
					((1064408419
					  * class94s[i_145_].anInt904),
					 -1085917262)),
				       class94s[i_145_].anInt903 * -2060664041,
				       -336114669 * class94s[i_145_].anInt902,
				       class313);
	    }
	}
	if (Class294.aClass294_3136 == Class110.aClass294_1344)
	    Class351.aClass406_3620
		= new Class406(Class254.aClass185_2683,
			       Class334.aClass472_3508,
			       Class606.aClass472_7988,
			       Class97.method1832((byte) -94));
	if (Class294.aClass294_3139 == Class110.aClass294_1344) {
	    int i_146_ = Class351.aClass406_3620.method6644((byte) 23);
	    int i_147_ = Class351.aClass406_3620.method6649((byte) 0);
	    if (i_146_ < i_147_)
		return 100 * i_146_ / i_147_;
	}
	if (Class110.aClass294_1344 == Class294.aClass294_3137) {
	    if (Class334.anInterface33Array3502 != null
		&& Class334.anInterface33Array3502.length > 0) {
		if (Class334.anInterface33Array3502[0].method217((byte) -24)
		    < 100)
		    return 0;
		if (Class334.anInterface33Array3502.length > 1
		    && Class334.aClass87_3505.method1701((byte) 22)
		    && (Class334.anInterface33Array3502[1].method217((byte) -3)
			< 100))
		    return 0;
	    }
	    Class351.aClass406_3620.method6645(client.anInterface52_11081,
					       -1147905053);
	    Class78.method1620(Class254.aClass185_2683, 989401592);
	    Class673.method11110(11, 590748971);
	}
	if (Class294.aClass294_3133 == Class110.aClass294_1344) {
	    Class464.aClass472_5113
		= Class467.method7602(Class50.aClass50_389, false, 1, false,
				      true, -1747764863);
	    Class180.aClass472_1950
		= Class467.method7602(Class50.aClass50_378, false, 1, false,
				      true, -1747764863);
	    Class384.aClass472_3967
		= Class467.method7602(Class50.aClass50_367, false, 1, false,
				      true, -1747764863);
	    Class233.aClass472_2358
		= Class467.method7602(Class50.aClass50_368, false, 1, true,
				      true, -1747764863);
	    Class6.aClass472_57
		= Class467.method7602(Class50.aClass50_406, false, 1, true,
				      true, -1747764863);
	    Class289.aClass472_3106
		= Class467.method7602(Class50.aClass50_369, false, 1, true,
				      true, -1747764863);
	    Class298_Sub1.aClass472_10064
		= Class467.method7602(Class50.aClass50_370, true, 1, false,
				      true, -1747764863);
	    Class130.aClass472_1524
		= Class467.method7602(Class50.aClass50_371, false, 1, false,
				      true, -1747764863);
	    Class2.aClass472_23
		= Class467.method7602(Class50.aClass50_407, true, 1, false,
				      true, -1747764863);
	    Class509.aClass472_5675
		= Class467.method7602(Class50.aClass50_401, true, 1, false,
				      true, -1747764863);
	    Class631.aClass472_8222
		= Class467.method7602(Class50.aClass50_403, false, 1, false,
				      true, -1747764863);
	    Class294.aClass472_3158
		= Class467.method7602(Class50.aClass50_374, false, 1, true,
				      true, -1747764863);
	    Class601_Sub1.aClass472_10877
		= Class467.method7602(Class50.aClass50_375, true, 1, false,
				      false, -1747764863);
	    Class63.aClass472_654
		= Class467.method7602(Class50.aClass50_397, true, 1, false,
				      false, -1747764863);
	    Class190.aClass472_2137
		= Class467.method7602(Class50.aClass50_377, false, 1, true,
				      true, -1747764863);
	    Class242.aClass472_2410
		= Class467.method7602(Class50.aClass50_382, false, 1, true,
				      true, -1747764863);
	    Class200_Sub6.aClass472_9906
		= Class467.method7602(Class50.aClass50_366, false, 1, true,
				      true, -1747764863);
	    Class711_Sub3_Sub1.aClass472_11919
		= Class467.method7602(Class50.aClass50_380, false, 1, true,
				      true, -1747764863);
	    Class347_Sub3.aClass472_10254
		= Class467.method7602(Class50.aClass50_381, false, 1, true,
				      true, -1747764863);
	    Class311.aClass472_3364
		= Class467.method7602(Class50.aClass50_392, false, 1, true,
				      true, -1747764863);
	    Class52.aClass472_435
		= Class467.method7602(Class50.aClass50_390, false, 1, true,
				      true, -1747764863);
	    Class693.aClass472_8770
		= Class467.method7602(Class50.aClass50_384, true, 1, false,
				      false, -1747764863);
	    Class74.aClass472_800
		= Class467.method7602(Class50.aClass50_398, true, 1, false,
				      true, -1747764863);
	    Class494.aClass472_5535
		= Class467.method7602(Class50.aClass50_385, false, 1, true,
				      true, -1747764863);
	    Class369.aClass472_3868
		= Class467.method7602(Class50.aClass50_386, false, 1, true,
				      true, -1747764863);
	    Class699.aClass472_8802
		= Class467.method7602(Class50.aClass50_387, true, 1, true,
				      true, -1747764863);
	    Class680.aClass472_8669
		= Class467.method7602(Class50.aClass50_388, false, 1, true,
				      true, -1747764863);
	    Class397.aClass472_4120
		= Class467.method7602(Class50.aClass50_396, false, 1, true,
				      true, -1747764863);
	    client.aClass472_11237
		= Class467.method7602(Class50.aClass50_400, true, 1, false,
				      true, -1747764863);
	    Class512.aClass472_5726
		= Class467.method7602(Class50.aClass50_391, true, 1, false,
				      true, -1747764863);
	    Class295.aClass472_3161
		= Class467.method7602(Class50.aClass50_408, true, 1, true,
				      true, -1747764863);
	}
	if (Class294.aClass294_3153 == Class110.aClass294_1344) {
	    int i_148_ = 0;
	    int i_149_ = 0;
	    for (int i_150_ = 0;
		 i_150_ < Class57.aClass451_Sub1Array459.length; i_150_++) {
		if (Class57.aClass451_Sub1Array459[i_150_] != null) {
		    i_148_ += Class57.aClass451_Sub1Array459[i_150_]
				  .method15885(35800283);
		    i_149_++;
		}
	    }
	    if (i_149_ > 0)
		i_148_ /= i_149_;
	    if (i_148_ != 100) {
		if (-1948226033 * Class334.anInt3503 < 0)
		    Class334.anInt3503 = i_148_ * -399326993;
		return (100 * (i_148_ - -1948226033 * Class334.anInt3503)
			/ (100 - -1948226033 * Class334.anInt3503));
	    }
	    Class150_Sub1.method14442(Class620.aClass632_8113, (byte) 50);
	    Class351.aClass406_3620
		= new Class406(Class254.aClass185_2683,
			       Class464.aClass472_5113,
			       Class606.aClass472_7988,
			       Class97.method1832((byte) -105));
	}
	if (Class294.aClass294_3146 == Class110.aClass294_1344) {
	    byte[] is
		= Class588.aClass472_7807.method7738((Class617.aClass617_8088
						      .anInt8096) * -448671533,
						     (byte) -11);
	    if (is == null)
		return 0;
	    Class171_Sub4.aClass232_9944 = new Class232();
	    Class171_Sub4.aClass232_9944.method4285(50, 7340032, (byte) 83);
	    Class649.method10714(is, -2066455493);
	    Class673.method11110(4, 334714712);
	}
	if (Class110.aClass294_1344 == Class294.aClass294_3141
	    && null == Class632.aClass538_8269) {
	    Class632.aClass538_8269 = new Class538(Class512.aClass472_5726);
	    Class670.method11043(Class632.aClass538_8269, 345711004);
	}
	if (Class294.aClass294_3135 == Class110.aClass294_1344) {
	    int i_151_ = Class83.method1651((byte) -80);
	    if (i_151_ < 100)
		return i_151_;
	    Class299.method5512
		(Class588.aClass472_7807.method7738((Class617.aClass617_8086
						     .anInt8096) * -448671533,
						    (byte) -125),
		 1872240483);
	    Class631.aShortArrayArray8218
		= Class620.aClass632_8113.aShortArrayArray8240;
	    Class312.aShortArrayArrayArray3371
		= Class620.aClass632_8113.aShortArrayArrayArray8254;
	    Class580.aShortArrayArray7762
		= Class620.aClass632_8113.aShortArrayArray8242;
	    Class473.aShortArrayArrayArray5173
		= Class620.aClass632_8113.aShortArrayArrayArray8262;
	    if (Class620.aClass632_8113.anInt8234 * 1576674457 != -1
		&& Class620.aClass632_8113.anInt8249 * -1351281821 != -1) {
		client.anInt11047
		    = Class620.aClass632_8113.anInt8234 * -1669149727;
		client.anInt11192
		    = Class620.aClass632_8113.anInt8249 * -807589047;
	    }
	    Class69.aClass630_728 = new Class630(Class588.aClass472_7807);
	    Class542.aClass623_7184 = new Class623(Class588.aClass472_7807);
	    Class700.aClass638_8806 = new Class638(Class588.aClass472_7807);
	    Class200_Sub16.aClass628_9965
		= new Class628(Class588.aClass472_7807);
	    Class554.aClass622_7353 = new Class622(Class588.aClass472_7807);
	}
	if (Class110.aClass294_1344 == Class294.aClass294_3143) {
	    if (Class620.aClass632_8113.anInt8259 * -1085389923 != -1
		&& !Class130.aClass472_1524.method7669((-1085389923
							* (Class620
							   .aClass632_8113
							   .anInt8259)),
						       0, 1804616883))
		return 99;
	    Class656.aClass177_8524 = new Class177(Class699.aClass472_8802);
	    Class534.anInterface25_7160
		= new Class179_Sub1(Class2.aClass472_23,
				    Class509.aClass472_5675);
	    Class534_Sub11_Sub13.aClass44_Sub22_11730
		= new Class44_Sub22(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class200_Sub23.aClass44_Sub14_10041
		= new Class44_Sub14(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class650.aClass44_Sub5_8464
		= new Class44_Sub5(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class233.aClass472_2358,
				   Class464.aClass472_5113);
	    Class150_Sub1.aClass44_8902
		= new Class44(client.aClass675_11016, Class539.aClass672_7171,
			      Class233.aClass472_2358, Class649.aClass649_8419,
			      64, new Class61(com.jagex.Class21.class));
	    Class706.aClass44_8845
		= new Class44(client.aClass675_11016, Class539.aClass672_7171,
			      Class233.aClass472_2358, Class649.aClass649_8396,
			      16, new Class61(com.jagex.Class74.class));
	    Class667.aClass44_Sub21_8582
		= new Class44_Sub21(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class242.aClass472_2410);
	    Class555.aClass44_Sub16_7417
		= new Class44_Sub16(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class88.aClass44_Sub12_884
		= new Class44_Sub12(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class632.aClass44_Sub2_8270
		= new Class44_Sub2(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class233.aClass472_2358,
				   Class464.aClass472_5113);
	    Class470.aClass44_Sub17_5153
		= new Class44_Sub17(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358,
				    Class464.aClass472_5113);
	    Class307.aClass44_Sub15_3349
		= new Class44_Sub15(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358,
				    Class130.aClass472_1524);
	    Class219.aClass44_Sub19_2306
		= new Class44_Sub19(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class200_Sub10.aClass44_Sub20_9926
		= new Class44_Sub20(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class175_Sub1.aClass44_Sub13_9427
		= new Class44_Sub13(client.aClass675_11016,
				    Class539.aClass672_7171, true,
				    Class190.aClass472_2137,
				    Class130.aClass472_1524);
	    client.aClass512_11100
		.method8435(Class175_Sub1.aClass44_Sub13_9427, 82258576);
	    Class159.aClass509_1754.method8372
		(new Class44_Sub13(client.aClass675_11016,
				   Class539.aClass672_7171, true,
				   Class190.aClass472_2137,
				   Class130.aClass472_1524),
		 235262924);
	    Class222.aClass44_Sub9_2313
		= new Class44_Sub9(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class233.aClass472_2358,
				   Class464.aClass472_5113);
	    Class394_Sub1.aClass44_Sub18_10148
		= new Class44_Sub18(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358,
				    Class464.aClass472_5113);
	    Class578.aClass44_Sub3_7743
		= new Class44_Sub3(client.aClass675_11016,
				   Class539.aClass672_7171, true,
				   Class200_Sub6.aClass472_9906,
				   Class130.aClass472_1524);
	    Class531.aClass44_Sub7_7135
		= new Class44_Sub7(client.aClass675_11016,
				   Class539.aClass672_7171, true,
				   Class534_Sub11_Sub13.aClass44_Sub22_11730,
				   Class711_Sub3_Sub1.aClass472_11919,
				   Class130.aClass472_1524);
	    Class223.aClass53_Sub2_2316
		= new Class53_Sub2(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class233.aClass472_2358, true);
	    Class337.aClass44_Sub8_3524
		= new Class44_Sub8(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class233.aClass472_2358);
	    Class200_Sub12.aClass44_Sub1_9934
		= new Class44_Sub1(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class347_Sub3.aClass472_10254,
				   Class180.aClass472_1950,
				   Class384.aClass472_3967,
				   Class337.aClass44_Sub8_3524);
	    Class184.aClass44_Sub6_1988
		= new Class44_Sub6(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class233.aClass472_2358);
	    Class492.aClass44_Sub10_5341
		= new Class44_Sub10(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358);
	    Class55.aClass44_Sub4_447
		= new Class44_Sub4(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class311.aClass472_3364,
				   Class130.aClass472_1524);
	    Class684.aClass53_Sub1_8696
		= new Class53_Sub1(client.aClass675_11016,
				   Class539.aClass672_7171,
				   Class52.aClass472_435, true);
	    Class407.aClass110_Sub1_Sub2_4312
		= new Class110_Sub1_Sub2(client.aClass675_11016,
					 Class453.aClass453_4947,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class562.aClass110_Sub1_Sub1_7560
		= new Class110_Sub1_Sub1(client.aClass675_11016,
					 Class453.aClass453_4946,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class535.aClass110_Sub1_Sub2_7162
		= new Class110_Sub1_Sub2(client.aClass675_11016,
					 Class453.aClass453_4951,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class78.aClass110_Sub1_Sub2_826
		= new Class110_Sub1_Sub2(client.aClass675_11016,
					 Class453.aClass453_4953,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class279.aClass110_Sub1_Sub2_3053
		= new Class110_Sub1_Sub2(client.aClass675_11016,
					 Class453.aClass453_4954,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class522.aClass110_Sub1_Sub2_7083
		= new Class110_Sub1_Sub2(client.aClass675_11016,
					 Class453.aClass453_4950,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class534_Sub24.aClass110_Sub1_Sub2_10565
		= new Class110_Sub1_Sub2(client.aClass675_11016,
					 Class453.aClass453_4952,
					 Class539.aClass672_7171,
					 Class233.aClass472_2358);
	    Class179_Sub1.aMap9331
		= Class395.method6565((new Class110_Sub1[]
				       { Class407.aClass110_Sub1_Sub2_4312,
					 Class562.aClass110_Sub1_Sub1_7560,
					 Class535.aClass110_Sub1_Sub2_7162,
					 Class78.aClass110_Sub1_Sub2_826,
					 Class279.aClass110_Sub1_Sub2_3053,
					 Class522.aClass110_Sub1_Sub2_7083,
					 (Class534_Sub24
					  .aClass110_Sub1_Sub2_10565) }),
				      (byte) -103);
	    Class84.aClass44_Sub11_840
		= new Class44_Sub11(client.aClass675_11016,
				    Class539.aClass672_7171,
				    Class233.aClass472_2358,
				    Class179_Sub1.aMap9331);
	    Class283.anInterface18_3068 = new Class306();
	    Class150_Sub1.method14443(Class289.aClass472_3106,
				      Class130.aClass472_1524,
				      Class464.aClass472_5113,
				      Class606.aClass472_7988, -972014688);
	    Class334.aClass402_3513 = new Class402(Class397.aClass472_4120);
	    Class48.aClass387_363 = new Class387(Class680.aClass472_8669);
	    Class269.aClass396_2956 = new Class396(Class680.aClass472_8669);
	    Class618.aClass458_8101 = new Class458(Class539.aClass672_7171,
						   Class494.aClass472_5535,
						   Class369.aClass472_3868);
	    RuntimeException_Sub4.aClass56_12127
		= new Class56(Class539.aClass672_7171, Class494.aClass472_5535,
			      Class369.aClass472_3868, new Class399());
	    Class78.aClass103_825
		= new Class103(Class562.aClass110_Sub1_Sub1_7560,
			       Class84.aClass44_Sub11_840,
			       Class542.aClass623_7184
				   .method10296(-1964027040));
	    Class635.method10538(1699151096);
	    Class179_Sub1.method14982(Class200_Sub12.aClass44_Sub1_9934,
				      (byte) 5);
	    Class408.method6692(Class269.aClass396_2956, Class48.aClass387_363,
				(byte) -46);
	    Class60.method1254(Class130.aClass472_1524,
			       Class656.aClass177_8524,
			       Class534.anInterface25_7160, (byte) 20);
	    Class267 class267
		= new Class267(Class631.aClass472_8222
				   .method7687("huffman", "", 1319730262));
	    Class175.method2919(class267, (byte) -53);
	    Class498.aClass502_5556
		= Class348_Sub1_Sub2.method17995(-1113045676);
	    Class200_Sub23.aClass534_Sub28_10040 = new Class534_Sub28(true);
	}
	if (Class110.aClass294_1344 == Class294.aClass294_3144) {
	    int i_152_
		= (Class633.method10499(Class464.aClass472_5113, (byte) -84)
		   + Class351.aClass406_3620.method6648(true, (byte) 97));
	    int i_153_ = (Class228.method4189((byte) 82)
			  + Class351.aClass406_3620.method6649((byte) 0));
	    if (i_152_ < i_153_)
		return i_152_ * 100 / i_153_;
	}
	if (Class110.aClass294_1344 == Class294.aClass294_3145)
	    Class554.method9108(Class693.aClass472_8770, Class74.aClass472_800,
				Class555.aClass44_Sub16_7417,
				Class88.aClass44_Sub12_884,
				client.aClass512_11100.method8428(-1486655428),
				Class222.aClass44_Sub9_2313,
				Class394_Sub1.aClass44_Sub18_10148,
				Class78.aClass103_825, Class78.aClass103_825);
	if (Class294.aClass294_3138 == Class110.aClass294_1344) {
	    Class77.aClass155_Sub1_819
		= new Class155_Sub1(Class407.aClass110_Sub1_Sub2_4312);
	    Class407.method6687(1766429564);
	    Class640.aClass34_8337 = Class534_Sub31.method16387((byte) -3);
	    Class298_Sub1.aClass472_10064.method7692(false, true, 1891348506);
	    Class464.aClass472_5113.method7692(true, true, 1891348506);
	    Class606.aClass472_7988.method7692(true, true, 1891348506);
	    Class631.aClass472_8222.method7692(true, true, 1891348506);
	    client.aBool11263 = true;
	}
	if (Class294.aClass294_3147 == Class110.aClass294_1344
	    && Class620.aClass632_8113.anInt8225 * 143908383 != -1) {
	    if (!Class180.method2978((Class620.aClass632_8113.anInt8225
				      * 143908383),
				     null, -1925651698))
		return 0;
	    boolean bool = true;
	    for (int i_154_ = 0;
		 i_154_ < (Class44_Sub11.aClass243Array11006
			   [143908383 * Class620.aClass632_8113.anInt8225]
			   .aClass247Array2412).length;
		 i_154_++) {
		Class247 class247
		    = (Class44_Sub11.aClass243Array11006
		       [143908383 * Class620.aClass632_8113.anInt8225]
		       .aClass247Array2412[i_154_]);
		if (-1960530827 * class247.anInt2438 == 5
		    && -1 != 2083357573 * class247.anInt2634
		    && !Class464.aClass472_5113.method7669((class247.anInt2634
							    * 2083357573),
							   0, 1804616883))
		    bool = false;
	    }
	    if (!bool)
		return 0;
	}
	if (Class294.aClass294_3154 == Class110.aClass294_1344)
	    Class706.method14252(true, 1773505533);
	if (Class294.aClass294_3134 == Class110.aClass294_1344) {
	    Class277.aClass300_3049.method5530((byte) 0);
	    try {
		Class334.aThread3512.join();
	    } catch (InterruptedException interruptedexception) {
		return 0;
	    }
	    Class277.aClass300_3049 = null;
	    Class334.aThread3512 = null;
	    Class334.aClass472_3508 = null;
	    Class334.aClass472_3507 = null;
	    Class334.aClass87_3505 = null;
	    Class334.anInterface33Array3502 = null;
	    Class594.aMap7828.remove(Class50.aClass50_394);
	    Class594.aMap7828.remove(Class50.aClass50_393);
	    Class594.aMap7828.remove(Class50.aClass50_395);
	    Class304.method5593(1583421679);
	    client.aBool11050
		= Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub42_10777
		      .method17227(736832919) == 1;
	    Class44_Sub6.aClass534_Sub35_10989.method16438
		(Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub42_10777, 1,
		 -39891847);
	    if (client.aBool11050)
		Class44_Sub6.aClass534_Sub35_10989.method16438
		    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10764,
		     0, -1021237065);
	    else if ((Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10764
		      .aBool10869)
		     && -686202593 * (Class200_Sub23.aClass534_Sub28_10040
				      .anInt10635) < 512
		     && 0 != (Class200_Sub23.aClass534_Sub28_10040.anInt10635
			      * -686202593))
		Class44_Sub6.aClass534_Sub35_10989.method16438
		    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10764,
		     0, 1941780056);
	    Class672.method11096((byte) 1);
	    if (client.aBool11050) {
		Class527.method8778(0, false, -763779300);
		if (!client.aBool11028)
		    Class325.method5818(Class26.aClass26_242, (byte) -106);
	    } else {
		Class527.method8778(Class44_Sub6.aClass534_Sub35_10989
					.aClass690_Sub7_10764
					.method16935(-1807368365),
				    false, 1154945655);
		if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10764
			.method16935(-1807368365)
		    == 0)
		    Class325.method5818(Class26.aClass26_245, (byte) -31);
	    }
	    Class159.method2611(Class44_Sub6.aClass534_Sub35_10989
				    .aClass690_Sub8_10775
				    .method16947(-683179456),
				-1, -1, false, -1682087395);
	    Class351.aClass406_3620.method6645(client.anInterface52_11081,
					       -64435745);
	    Class78.method1620(Class254.aClass185_2683, 477803238);
	    Class603.method10028(Class254.aClass185_2683,
				 Class464.aClass472_5113, -348434818);
	}
	return Class551.method9047((byte) -38);
    }
    
    static final void method10977(Class669 class669, int i) {
	int i_155_ = (class669.anIntArray8595
		      [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (-1 != client.anInt11185 * -993629849) {
	    if (0 == i_155_) {
		class669.anIntArray8595
		    [(class669.anInt8600 += 308999563) * 2088438307 - 1]
		    = -993629849 * client.anInt11185;
		return;
	    }
	    i_155_--;
	}
	Class534_Sub37 class534_sub37
	    = (Class534_Sub37) client.aClass9_11224.method583(-1744437830);
	while (i_155_-- > 0)
	    class534_sub37
		= (Class534_Sub37) client.aClass9_11224.method584((byte) -18);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 1225863589 * class534_sub37.anInt10803;
    }
}
