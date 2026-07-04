/* Class169_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class169_Sub1 extends Class169
{
    int anInt9417;
    int anInt9418;
    int anInt9419;
    boolean aBool9420 = false;
    int anInt9421;
    int anInt9422;
    int[] anIntArray9423;
    int anInt9424;
    
    public int method2784() {
	return anInt9418;
    }
    
    public boolean method2760() {
	return false;
    }
    
    public boolean method2773() {
	return aBool9420;
    }
    
    public int method2816(int i, int i_0_) {
	return anIntArray9423[i + i_0_ * anInt9417];
    }
    
    public void method2772(int i) {
	int i_1_ = method2804();
	int i_2_ = method2770();
	if (anInt9417 != i_1_ || anInt9418 != i_2_) {
	    int i_3_ = i;
	    if (i_3_ > anInt9419)
		i_3_ = anInt9419;
	    int i_4_ = i;
	    if (i_4_ + anInt9419 + anInt9417 > i_1_)
		i_4_ = i_1_ - anInt9419 - anInt9417;
	    int i_5_ = i;
	    if (i_5_ > anInt9421)
		i_5_ = anInt9421;
	    int i_6_ = i;
	    if (i_6_ + anInt9421 + anInt9418 > i_2_)
		i_6_ = i_2_ - anInt9421 - anInt9418;
	    int i_7_ = anInt9417 + i_3_ + i_4_;
	    int i_8_ = anInt9418 + i_5_ + i_6_;
	    int[] is = new int[i_7_ * i_8_];
	    aBool9420 = false;
	    for (int i_9_ = 0; i_9_ < anInt9418; i_9_++) {
		int i_10_ = i_9_ * anInt9417;
		int i_11_ = (i_9_ + i_5_) * i_7_ + i_3_;
		for (int i_12_ = 0; i_12_ < anInt9417; i_12_++) {
		    if ((anIntArray9423[i_10_] & ~0xffffff) != -16777216)
			aBool9420 = true;
		    is[i_11_++] = anIntArray9423[i_10_++];
		}
	    }
	    anInt9419 -= i_3_;
	    anInt9421 -= i_5_;
	    anInt9424 -= i_4_;
	    anInt9422 -= i_6_;
	    anInt9417 = i_7_;
	    anInt9418 = i_8_;
	    anIntArray9423 = is;
	}
    }
    
    public int method2804() {
	return anInt9417 + anInt9419 + anInt9424;
    }
    
    public int method2790() {
	return anInt9424;
    }
    
    public int method2781() {
	return anInt9421;
    }
    
    public int method2764() {
	return anInt9419;
    }
    
    public int method2782() {
	return anInt9417;
    }
    
    public void method2811(int i, int i_13_, int i_14_) {
	for (int i_15_ = 1; i_15_ < anIntArray9423.length; i_15_++) {
	    int i_16_ = anIntArray9423[i_15_] >> 16 & 0xff;
	    i_16_ += i;
	    if (i_16_ < 0)
		i_16_ = 0;
	    else if (i_16_ > 255)
		i_16_ = 255;
	    int i_17_ = anIntArray9423[i_15_] >> 8 & 0xff;
	    i_17_ += i_13_;
	    if (i_17_ < 0)
		i_17_ = 0;
	    else if (i_17_ > 255)
		i_17_ = 255;
	    int i_18_ = anIntArray9423[i_15_] >> 0 & 0xff;
	    i_18_ += i_14_;
	    if (i_18_ < 0)
		i_18_ = 0;
	    else if (i_18_ > 255)
		i_18_ = 255;
	    anIntArray9423[i_15_] = (anIntArray9423[i_15_] & ~0xffffff
				     | i_16_ << 16 | i_17_ << 8 | i_18_);
	}
    }
    
    public int method2783() {
	return anInt9418;
    }
    
    public int[] method2766(boolean bool) {
	if (bool && (method2804() != anInt9417 || method2770() != anInt9418)) {
	    int i = method2804();
	    int[] is = new int[i * method2770()];
	    for (int i_19_ = 0; i_19_ < anInt9418; i_19_++) {
		int i_20_ = i_19_ * anInt9417;
		int i_21_ = anInt9419 + (i_19_ + anInt9421) * i;
		for (int i_22_ = 0; i_22_ < anInt9417; i_22_++) {
		    is[i_21_++] = anIntArray9423[i_20_];
		    i_20_++;
		}
	    }
	    return is;
	}
	return anIntArray9423;
    }
    
    public void method2775(int i) {
	int i_23_ = 0;
	aBool9420 = false;
	int[] is = new int[anInt9417 * anInt9418];
	for (int i_24_ = 0; i_24_ < anInt9418; i_24_++) {
	    for (int i_25_ = 0; i_25_ < anInt9417; i_25_++) {
		int i_26_ = anIntArray9423[i_23_];
		if ((i_26_ & ~0xffffff) == 0) {
		    if (i_25_ > 0
			&& (anIntArray9423[i_23_ - 1] & ~0xffffff) != 0)
			i_26_ = i;
		    else if (i_24_ > 0 && (anIntArray9423[i_23_ - anInt9417]
					   & ~0xffffff) != 0)
			i_26_ = i;
		    else if (i_25_ < anInt9417 - 1
			     && (anIntArray9423[i_23_ + 1] & ~0xffffff) != 0)
			i_26_ = i;
		    else if (i_24_ < anInt9418 - 1
			     && (anIntArray9423[i_23_ + anInt9417]
				 & ~0xffffff) != 0)
			i_26_ = i;
		}
		if ((i_26_ & ~0xffffff) != -16777216)
		    aBool9420 = true;
		is[i_23_++] = i_26_;
	    }
	}
	anIntArray9423 = is;
    }
    
    public void method2792(int i) {
	for (int i_27_ = anInt9418 - 1; i_27_ > 0; i_27_--) {
	    int i_28_ = i_27_ * anInt9417;
	    for (int i_29_ = anInt9417 - 1; i_29_ > 0; i_29_--) {
		if ((anIntArray9423[i_29_ + i_28_] & ~0xffffff) == 0
		    && (anIntArray9423[i_29_ + i_28_ - 1 - anInt9417]
			& ~0xffffff) != 0)
		    anIntArray9423[i_29_ + i_28_] = i;
	    }
	}
    }
    
    public void method2796(int i) {
	int i_30_ = method2804();
	int i_31_ = method2770();
	if (anInt9417 != i_30_ || anInt9418 != i_31_) {
	    int i_32_ = i;
	    if (i_32_ > anInt9419)
		i_32_ = anInt9419;
	    int i_33_ = i;
	    if (i_33_ + anInt9419 + anInt9417 > i_30_)
		i_33_ = i_30_ - anInt9419 - anInt9417;
	    int i_34_ = i;
	    if (i_34_ > anInt9421)
		i_34_ = anInt9421;
	    int i_35_ = i;
	    if (i_35_ + anInt9421 + anInt9418 > i_31_)
		i_35_ = i_31_ - anInt9421 - anInt9418;
	    int i_36_ = anInt9417 + i_32_ + i_33_;
	    int i_37_ = anInt9418 + i_34_ + i_35_;
	    int[] is = new int[i_36_ * i_37_];
	    aBool9420 = false;
	    for (int i_38_ = 0; i_38_ < anInt9418; i_38_++) {
		int i_39_ = i_38_ * anInt9417;
		int i_40_ = (i_38_ + i_34_) * i_36_ + i_32_;
		for (int i_41_ = 0; i_41_ < anInt9417; i_41_++) {
		    if ((anIntArray9423[i_39_] & ~0xffffff) != -16777216)
			aBool9420 = true;
		    is[i_40_++] = anIntArray9423[i_39_++];
		}
	    }
	    anInt9419 -= i_32_;
	    anInt9421 -= i_34_;
	    anInt9424 -= i_33_;
	    anInt9422 -= i_35_;
	    anInt9417 = i_36_;
	    anInt9418 = i_37_;
	    anIntArray9423 = is;
	}
    }
    
    public void method2769(int i) {
	int i_42_ = method2804();
	int i_43_ = method2770();
	if (anInt9417 != i_42_ || anInt9418 != i_43_) {
	    int i_44_ = i;
	    if (i_44_ > anInt9419)
		i_44_ = anInt9419;
	    int i_45_ = i;
	    if (i_45_ + anInt9419 + anInt9417 > i_42_)
		i_45_ = i_42_ - anInt9419 - anInt9417;
	    int i_46_ = i;
	    if (i_46_ > anInt9421)
		i_46_ = anInt9421;
	    int i_47_ = i;
	    if (i_47_ + anInt9421 + anInt9418 > i_43_)
		i_47_ = i_43_ - anInt9421 - anInt9418;
	    int i_48_ = anInt9417 + i_44_ + i_45_;
	    int i_49_ = anInt9418 + i_46_ + i_47_;
	    int[] is = new int[i_48_ * i_49_];
	    aBool9420 = false;
	    for (int i_50_ = 0; i_50_ < anInt9418; i_50_++) {
		int i_51_ = i_50_ * anInt9417;
		int i_52_ = (i_50_ + i_46_) * i_48_ + i_44_;
		for (int i_53_ = 0; i_53_ < anInt9417; i_53_++) {
		    if ((anIntArray9423[i_51_] & ~0xffffff) != -16777216)
			aBool9420 = true;
		    is[i_52_++] = anIntArray9423[i_51_++];
		}
	    }
	    anInt9419 -= i_44_;
	    anInt9421 -= i_46_;
	    anInt9424 -= i_45_;
	    anInt9422 -= i_47_;
	    anInt9417 = i_48_;
	    anInt9418 = i_49_;
	    anIntArray9423 = is;
	}
    }
    
    public void method2771() {
	int[] is = new int[anInt9417 * anInt9418];
	int i = 0;
	for (int i_54_ = 0; i_54_ < anInt9417; i_54_++) {
	    for (int i_55_ = anInt9418 - 1; i_55_ >= 0; i_55_--)
		is[i++] = anIntArray9423[i_54_ + i_55_ * anInt9417];
	}
	anIntArray9423 = is;
	int i_56_ = anInt9421;
	anInt9421 = anInt9419;
	anInt9419 = anInt9422;
	anInt9422 = anInt9424;
	anInt9424 = i_56_;
	i_56_ = anInt9418;
	anInt9418 = anInt9417;
	anInt9417 = i_56_;
    }
    
    public int method2815(int i, int i_57_) {
	return anIntArray9423[i + i_57_ * anInt9417];
    }
    
    public void method2778(int i, int i_58_, int i_59_) {
	for (int i_60_ = 1; i_60_ < anIntArray9423.length; i_60_++) {
	    int i_61_ = anIntArray9423[i_60_] >> 16 & 0xff;
	    i_61_ += i;
	    if (i_61_ < 0)
		i_61_ = 0;
	    else if (i_61_ > 255)
		i_61_ = 255;
	    int i_62_ = anIntArray9423[i_60_] >> 8 & 0xff;
	    i_62_ += i_58_;
	    if (i_62_ < 0)
		i_62_ = 0;
	    else if (i_62_ > 255)
		i_62_ = 255;
	    int i_63_ = anIntArray9423[i_60_] >> 0 & 0xff;
	    i_63_ += i_59_;
	    if (i_63_ < 0)
		i_63_ = 0;
	    else if (i_63_ > 255)
		i_63_ = 255;
	    anIntArray9423[i_60_] = (anIntArray9423[i_60_] & ~0xffffff
				     | i_61_ << 16 | i_62_ << 8 | i_63_);
	}
    }
    
    public int method2777(int i, int i_64_) {
	return anIntArray9423[i + i_64_ * anInt9417];
    }
    
    public boolean method2780() {
	return aBool9420;
    }
    
    public int method2765() {
	return anInt9424;
    }
    
    public void method2819() {
	anInt9422 = 0;
	anInt9421 = 0;
	anInt9424 = 0;
	anInt9419 = 0;
    }
    
    public void method2801() {
	int[] is = new int[anInt9417 * anInt9418];
	int i = 0;
	for (int i_65_ = 0; i_65_ < anInt9417; i_65_++) {
	    for (int i_66_ = anInt9418 - 1; i_66_ >= 0; i_66_--)
		is[i++] = anIntArray9423[i_65_ + i_66_ * anInt9417];
	}
	anIntArray9423 = is;
	int i_67_ = anInt9421;
	anInt9421 = anInt9419;
	anInt9419 = anInt9422;
	anInt9422 = anInt9424;
	anInt9424 = i_67_;
	i_67_ = anInt9418;
	anInt9418 = anInt9417;
	anInt9417 = i_67_;
    }
    
    public int method2787() {
	return anInt9418 + anInt9421 + anInt9422;
    }
    
    public void method2768() {
	anInt9422 = 0;
	anInt9421 = 0;
	anInt9424 = 0;
	anInt9419 = 0;
    }
    
    public int method2786() {
	return anInt9417 + anInt9419 + anInt9424;
    }
    
    public int method2814() {
	return anInt9417 + anInt9419 + anInt9424;
    }
    
    public int method2763() {
	return anInt9418;
    }
    
    public int method2789() {
	return anInt9419;
    }
    
    Class169_Sub1(int i, int i_68_, int[] is) {
	anInt9417 = i;
	anInt9418 = i_68_;
	anIntArray9423 = is;
	for (int i_69_ = 0; i_69_ < anIntArray9423.length; i_69_++) {
	    if ((anIntArray9423[i_69_] & ~0xffffff) != -16777216) {
		aBool9420 = true;
		break;
	    }
	}
    }
    
    public int method2810() {
	return anInt9421;
    }
    
    public int method2774() {
	return anInt9421;
    }
    
    public int method2793() {
	return anInt9422;
    }
    
    public int method2794() {
	return anInt9422;
    }
    
    public void method2795(int i) {
	int i_70_ = method2804();
	int i_71_ = method2770();
	if (anInt9417 != i_70_ || anInt9418 != i_71_) {
	    int i_72_ = i;
	    if (i_72_ > anInt9419)
		i_72_ = anInt9419;
	    int i_73_ = i;
	    if (i_73_ + anInt9419 + anInt9417 > i_70_)
		i_73_ = i_70_ - anInt9419 - anInt9417;
	    int i_74_ = i;
	    if (i_74_ > anInt9421)
		i_74_ = anInt9421;
	    int i_75_ = i;
	    if (i_75_ + anInt9421 + anInt9418 > i_71_)
		i_75_ = i_71_ - anInt9421 - anInt9418;
	    int i_76_ = anInt9417 + i_72_ + i_73_;
	    int i_77_ = anInt9418 + i_74_ + i_75_;
	    int[] is = new int[i_76_ * i_77_];
	    aBool9420 = false;
	    for (int i_78_ = 0; i_78_ < anInt9418; i_78_++) {
		int i_79_ = i_78_ * anInt9417;
		int i_80_ = (i_78_ + i_74_) * i_76_ + i_72_;
		for (int i_81_ = 0; i_81_ < anInt9417; i_81_++) {
		    if ((anIntArray9423[i_79_] & ~0xffffff) != -16777216)
			aBool9420 = true;
		    is[i_80_++] = anIntArray9423[i_79_++];
		}
	    }
	    anInt9419 -= i_72_;
	    anInt9421 -= i_74_;
	    anInt9424 -= i_73_;
	    anInt9422 -= i_75_;
	    anInt9417 = i_76_;
	    anInt9418 = i_77_;
	    anIntArray9423 = is;
	}
    }
    
    public boolean method2817() {
	return false;
    }
    
    public boolean method2818() {
	return false;
    }
    
    public void method2798(int i) {
	int i_82_ = 0;
	aBool9420 = false;
	int[] is = new int[anInt9417 * anInt9418];
	for (int i_83_ = 0; i_83_ < anInt9418; i_83_++) {
	    for (int i_84_ = 0; i_84_ < anInt9417; i_84_++) {
		int i_85_ = anIntArray9423[i_82_];
		if ((i_85_ & ~0xffffff) == 0) {
		    if (i_84_ > 0
			&& (anIntArray9423[i_82_ - 1] & ~0xffffff) != 0)
			i_85_ = i;
		    else if (i_83_ > 0 && (anIntArray9423[i_82_ - anInt9417]
					   & ~0xffffff) != 0)
			i_85_ = i;
		    else if (i_84_ < anInt9417 - 1
			     && (anIntArray9423[i_82_ + 1] & ~0xffffff) != 0)
			i_85_ = i;
		    else if (i_83_ < anInt9418 - 1
			     && (anIntArray9423[i_82_ + anInt9417]
				 & ~0xffffff) != 0)
			i_85_ = i;
		}
		if ((i_85_ & ~0xffffff) != -16777216)
		    aBool9420 = true;
		is[i_82_++] = i_85_;
	    }
	}
	anIntArray9423 = is;
    }
    
    public void method2799(int i) {
	int i_86_ = 0;
	aBool9420 = false;
	int[] is = new int[anInt9417 * anInt9418];
	for (int i_87_ = 0; i_87_ < anInt9418; i_87_++) {
	    for (int i_88_ = 0; i_88_ < anInt9417; i_88_++) {
		int i_89_ = anIntArray9423[i_86_];
		if ((i_89_ & ~0xffffff) == 0) {
		    if (i_88_ > 0
			&& (anIntArray9423[i_86_ - 1] & ~0xffffff) != 0)
			i_89_ = i;
		    else if (i_87_ > 0 && (anIntArray9423[i_86_ - anInt9417]
					   & ~0xffffff) != 0)
			i_89_ = i;
		    else if (i_88_ < anInt9417 - 1
			     && (anIntArray9423[i_86_ + 1] & ~0xffffff) != 0)
			i_89_ = i;
		    else if (i_87_ < anInt9418 - 1
			     && (anIntArray9423[i_86_ + anInt9417]
				 & ~0xffffff) != 0)
			i_89_ = i;
		}
		if ((i_89_ & ~0xffffff) != -16777216)
		    aBool9420 = true;
		is[i_86_++] = i_89_;
	    }
	}
	anIntArray9423 = is;
    }
    
    public void method2800() {
	int[] is = anIntArray9423;
	for (int i = anInt9418 - 1; i >= 0; i--) {
	    int i_90_ = i * anInt9417;
	    for (int i_91_ = (i + 1) * anInt9417; i_90_ < i_91_; i_90_++) {
		i_91_--;
		int i_92_ = is[i_90_];
		is[i_90_] = is[i_91_];
		is[i_91_] = i_92_;
	    }
	}
	int i = anInt9419;
	anInt9419 = anInt9424;
	anInt9424 = i;
    }
    
    public void method2761() {
	int[] is = anIntArray9423;
	for (int i = anInt9418 - 1; i >= 0; i--) {
	    int i_93_ = i * anInt9417;
	    for (int i_94_ = (i + 1) * anInt9417; i_93_ < i_94_; i_93_++) {
		i_94_--;
		int i_95_ = is[i_93_];
		is[i_93_] = is[i_94_];
		is[i_94_] = i_95_;
	    }
	}
	int i = anInt9419;
	anInt9419 = anInt9424;
	anInt9424 = i;
    }
    
    public void method2802() {
	int[] is = anIntArray9423;
	for (int i = anInt9418 - 1; i >= 0; i--) {
	    int i_96_ = i * anInt9417;
	    for (int i_97_ = (i + 1) * anInt9417; i_96_ < i_97_; i_96_++) {
		i_97_--;
		int i_98_ = is[i_96_];
		is[i_96_] = is[i_97_];
		is[i_97_] = i_98_;
	    }
	}
	int i = anInt9419;
	anInt9419 = anInt9424;
	anInt9424 = i;
    }
    
    public void method2803() {
	int[] is = anIntArray9423;
	for (int i = (anInt9418 >> 1) - 1; i >= 0; i--) {
	    int i_99_ = i * anInt9417;
	    int i_100_ = (anInt9418 - i - 1) * anInt9417;
	    for (int i_101_ = -anInt9417; i_101_ < 0; i_101_++) {
		int i_102_ = is[i_99_];
		is[i_99_] = is[i_100_];
		is[i_100_] = i_102_;
		i_99_++;
		i_100_++;
	    }
	}
	int i = anInt9421;
	anInt9421 = anInt9422;
	anInt9422 = i;
    }
    
    public void method2808() {
	int[] is = anIntArray9423;
	for (int i = (anInt9418 >> 1) - 1; i >= 0; i--) {
	    int i_103_ = i * anInt9417;
	    int i_104_ = (anInt9418 - i - 1) * anInt9417;
	    for (int i_105_ = -anInt9417; i_105_ < 0; i_105_++) {
		int i_106_ = is[i_103_];
		is[i_103_] = is[i_104_];
		is[i_104_] = i_106_;
		i_103_++;
		i_104_++;
	    }
	}
	int i = anInt9421;
	anInt9421 = anInt9422;
	anInt9422 = i;
    }
    
    public void method2805() {
	int[] is = new int[anInt9417 * anInt9418];
	int i = 0;
	for (int i_107_ = 0; i_107_ < anInt9417; i_107_++) {
	    for (int i_108_ = anInt9418 - 1; i_108_ >= 0; i_108_--)
		is[i++] = anIntArray9423[i_107_ + i_108_ * anInt9417];
	}
	anIntArray9423 = is;
	int i_109_ = anInt9421;
	anInt9421 = anInt9419;
	anInt9419 = anInt9422;
	anInt9422 = anInt9424;
	anInt9424 = i_109_;
	i_109_ = anInt9418;
	anInt9418 = anInt9417;
	anInt9417 = i_109_;
    }
    
    public int method2770() {
	return anInt9418 + anInt9421 + anInt9422;
    }
    
    public int[] method2807(boolean bool) {
	if (bool && (method2804() != anInt9417 || method2770() != anInt9418)) {
	    int i = method2804();
	    int[] is = new int[i * method2770()];
	    for (int i_110_ = 0; i_110_ < anInt9418; i_110_++) {
		int i_111_ = i_110_ * anInt9417;
		int i_112_ = anInt9419 + (i_110_ + anInt9421) * i;
		for (int i_113_ = 0; i_113_ < anInt9417; i_113_++) {
		    is[i_112_++] = anIntArray9423[i_111_];
		    i_111_++;
		}
	    }
	    return is;
	}
	return anIntArray9423;
    }
    
    public int[] method2797(boolean bool) {
	if (bool && (method2804() != anInt9417 || method2770() != anInt9418)) {
	    int i = method2804();
	    int[] is = new int[i * method2770()];
	    for (int i_114_ = 0; i_114_ < anInt9418; i_114_++) {
		int i_115_ = i_114_ * anInt9417;
		int i_116_ = anInt9419 + (i_114_ + anInt9421) * i;
		for (int i_117_ = 0; i_117_ < anInt9417; i_117_++) {
		    is[i_116_++] = anIntArray9423[i_115_];
		    i_115_++;
		}
	    }
	    return is;
	}
	return anIntArray9423;
    }
    
    public void method2806() {
	int[] is = anIntArray9423;
	for (int i = anInt9418 - 1; i >= 0; i--) {
	    int i_118_ = i * anInt9417;
	    for (int i_119_ = (i + 1) * anInt9417; i_118_ < i_119_; i_118_++) {
		i_119_--;
		int i_120_ = is[i_118_];
		is[i_118_] = is[i_119_];
		is[i_119_] = i_120_;
	    }
	}
	int i = anInt9419;
	anInt9419 = anInt9424;
	anInt9424 = i;
    }
    
    public void method2776(int i, int i_121_, int i_122_) {
	for (int i_123_ = 1; i_123_ < anIntArray9423.length; i_123_++) {
	    int i_124_ = anIntArray9423[i_123_] >> 16 & 0xff;
	    i_124_ += i;
	    if (i_124_ < 0)
		i_124_ = 0;
	    else if (i_124_ > 255)
		i_124_ = 255;
	    int i_125_ = anIntArray9423[i_123_] >> 8 & 0xff;
	    i_125_ += i_121_;
	    if (i_125_ < 0)
		i_125_ = 0;
	    else if (i_125_ > 255)
		i_125_ = 255;
	    int i_126_ = anIntArray9423[i_123_] >> 0 & 0xff;
	    i_126_ += i_122_;
	    if (i_126_ < 0)
		i_126_ = 0;
	    else if (i_126_ > 255)
		i_126_ = 255;
	    anIntArray9423[i_123_] = (anIntArray9423[i_123_] & ~0xffffff
				      | i_124_ << 16 | i_125_ << 8 | i_126_);
	}
    }
    
    public int method2791() {
	return anInt9417 + anInt9419 + anInt9424;
    }
    
    public void method2812(int i, int i_127_, int i_128_) {
	for (int i_129_ = 1; i_129_ < anIntArray9423.length; i_129_++) {
	    int i_130_ = anIntArray9423[i_129_] >> 16 & 0xff;
	    i_130_ += i;
	    if (i_130_ < 0)
		i_130_ = 0;
	    else if (i_130_ > 255)
		i_130_ = 255;
	    int i_131_ = anIntArray9423[i_129_] >> 8 & 0xff;
	    i_131_ += i_127_;
	    if (i_131_ < 0)
		i_131_ = 0;
	    else if (i_131_ > 255)
		i_131_ = 255;
	    int i_132_ = anIntArray9423[i_129_] >> 0 & 0xff;
	    i_132_ += i_128_;
	    if (i_132_ < 0)
		i_132_ = 0;
	    else if (i_132_ > 255)
		i_132_ = 255;
	    anIntArray9423[i_129_] = (anIntArray9423[i_129_] & ~0xffffff
				      | i_130_ << 16 | i_131_ << 8 | i_132_);
	}
    }
    
    public void method2813(int i, int i_133_, int i_134_) {
	for (int i_135_ = 1; i_135_ < anIntArray9423.length; i_135_++) {
	    int i_136_ = anIntArray9423[i_135_] >> 16 & 0xff;
	    i_136_ += i;
	    if (i_136_ < 0)
		i_136_ = 0;
	    else if (i_136_ > 255)
		i_136_ = 255;
	    int i_137_ = anIntArray9423[i_135_] >> 8 & 0xff;
	    i_137_ += i_133_;
	    if (i_137_ < 0)
		i_137_ = 0;
	    else if (i_137_ > 255)
		i_137_ = 255;
	    int i_138_ = anIntArray9423[i_135_] >> 0 & 0xff;
	    i_138_ += i_134_;
	    if (i_138_ < 0)
		i_138_ = 0;
	    else if (i_138_ > 255)
		i_138_ = 255;
	    anIntArray9423[i_135_] = (anIntArray9423[i_135_] & ~0xffffff
				      | i_136_ << 16 | i_137_ << 8 | i_138_);
	}
    }
    
    public int method2785(int i, int i_139_) {
	return anIntArray9423[i + i_139_ * anInt9417];
    }
    
    public int method2788(int i, int i_140_) {
	return anIntArray9423[i + i_140_ * anInt9417];
    }
    
    public void method2779() {
	int[] is = anIntArray9423;
	for (int i = (anInt9418 >> 1) - 1; i >= 0; i--) {
	    int i_141_ = i * anInt9417;
	    int i_142_ = (anInt9418 - i - 1) * anInt9417;
	    for (int i_143_ = -anInt9417; i_143_ < 0; i_143_++) {
		int i_144_ = is[i_141_];
		is[i_141_] = is[i_142_];
		is[i_142_] = i_144_;
		i_141_++;
		i_142_++;
	    }
	}
	int i = anInt9421;
	anInt9421 = anInt9422;
	anInt9422 = i;
    }
    
    public int method2759() {
	return anInt9417;
    }
    
    public int method2767() {
	return anInt9422;
    }
    
    public int[] method2809(boolean bool) {
	if (bool && (method2804() != anInt9417 || method2770() != anInt9418)) {
	    int i = method2804();
	    int[] is = new int[i * method2770()];
	    for (int i_145_ = 0; i_145_ < anInt9418; i_145_++) {
		int i_146_ = i_145_ * anInt9417;
		int i_147_ = anInt9419 + (i_145_ + anInt9421) * i;
		for (int i_148_ = 0; i_148_ < anInt9417; i_148_++) {
		    is[i_147_++] = anIntArray9423[i_146_];
		    i_146_++;
		}
	    }
	    return is;
	}
	return anIntArray9423;
    }
    
    public int method2762() {
	return anInt9417;
    }
    
    public void method2820(int i) {
	for (int i_149_ = anInt9418 - 1; i_149_ > 0; i_149_--) {
	    int i_150_ = i_149_ * anInt9417;
	    for (int i_151_ = anInt9417 - 1; i_151_ > 0; i_151_--) {
		if ((anIntArray9423[i_151_ + i_150_] & ~0xffffff) == 0
		    && (anIntArray9423[i_151_ + i_150_ - 1 - anInt9417]
			& ~0xffffff) != 0)
		    anIntArray9423[i_151_ + i_150_] = i;
	    }
	}
    }
    
    public void method2821(int i) {
	for (int i_152_ = anInt9418 - 1; i_152_ > 0; i_152_--) {
	    int i_153_ = i_152_ * anInt9417;
	    for (int i_154_ = anInt9417 - 1; i_154_ > 0; i_154_--) {
		if ((anIntArray9423[i_154_ + i_153_] & ~0xffffff) == 0
		    && (anIntArray9423[i_154_ + i_153_ - 1 - anInt9417]
			& ~0xffffff) != 0)
		    anIntArray9423[i_154_ + i_153_] = i;
	    }
	}
    }
}
