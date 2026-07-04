/* Class169_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class169_Sub2 extends Class169
{
    int anInt9788;
    int anInt9789;
    public int anInt9790;
    public byte[] aByteArray9791;
    public int anInt9792;
    int anInt9793;
    public int[] anIntArray9794;
    int anInt9795;
    public byte[] aByteArray9796;
    
    public void method2768() {
	anInt9793 = 0;
	anInt9792 = 0;
	anInt9795 = 0;
	anInt9790 = 0;
    }
    
    public int method2815(int i, int i_0_) {
	return anIntArray9794[aByteArray9796[i + i_0_ * anInt9788] & 0xff];
    }
    
    public boolean method2773() {
	return aByteArray9791 != null;
    }
    
    public int method2762() {
	return anInt9788;
    }
    
    public int method2763() {
	return anInt9789;
    }
    
    public int method2804() {
	return anInt9788 + anInt9790 + anInt9795;
    }
    
    public int[] method2807(boolean bool) {
	int[] is;
	if (bool) {
	    int i = method2804();
	    is = new int[i * method2770()];
	    if (aByteArray9791 != null) {
		for (int i_1_ = 0; i_1_ < anInt9789; i_1_++) {
		    int i_2_ = i_1_ * anInt9788;
		    int i_3_ = anInt9790 + (i_1_ + anInt9792) * i;
		    for (int i_4_ = 0; i_4_ < anInt9788; i_4_++) {
			is[i_3_++]
			    = (aByteArray9791[i_2_] << 24
			       | anIntArray9794[aByteArray9796[i_2_] & 0xff]);
			i_2_++;
		    }
		}
	    } else {
		for (int i_5_ = 0; i_5_ < anInt9789; i_5_++) {
		    int i_6_ = i_5_ * anInt9788;
		    int i_7_ = anInt9790 + (i_5_ + anInt9792) * i;
		    for (int i_8_ = 0; i_8_ < anInt9788; i_8_++) {
			int i_9_
			    = anIntArray9794[aByteArray9796[i_6_++] & 0xff];
			if (i_9_ != 0)
			    is[i_7_++] = ~0xffffff | i_9_;
			else
			    is[i_7_++] = 0;
		    }
		}
	    }
	} else {
	    is = new int[anInt9788 * anInt9789];
	    int i = 0;
	    int i_10_ = 0;
	    if (aByteArray9791 != null) {
		for (int i_11_ = 0; i_11_ < anInt9789; i_11_++) {
		    for (int i_12_ = 0; i_12_ < anInt9788; i_12_++) {
			is[i_10_++]
			    = (aByteArray9791[i] << 24
			       | anIntArray9794[aByteArray9796[i] & 0xff]);
			i++;
		    }
		}
	    } else {
		for (int i_13_ = 0; i_13_ < anInt9789; i_13_++) {
		    for (int i_14_ = 0; i_14_ < anInt9788; i_14_++) {
			int i_15_ = anIntArray9794[aByteArray9796[i++] & 0xff];
			is[i_10_++] = i_15_ != 0 ? ~0xffffff | i_15_ : 0;
		    }
		}
	    }
	}
	return is;
    }
    
    public int method2764() {
	return anInt9790;
    }
    
    public int method2790() {
	return anInt9795;
    }
    
    public int method2781() {
	return anInt9792;
    }
    
    public int[] method2797(boolean bool) {
	int[] is;
	if (bool) {
	    int i = method2804();
	    is = new int[i * method2770()];
	    if (aByteArray9791 != null) {
		for (int i_16_ = 0; i_16_ < anInt9789; i_16_++) {
		    int i_17_ = i_16_ * anInt9788;
		    int i_18_ = anInt9790 + (i_16_ + anInt9792) * i;
		    for (int i_19_ = 0; i_19_ < anInt9788; i_19_++) {
			is[i_18_++]
			    = (aByteArray9791[i_17_] << 24
			       | anIntArray9794[aByteArray9796[i_17_] & 0xff]);
			i_17_++;
		    }
		}
	    } else {
		for (int i_20_ = 0; i_20_ < anInt9789; i_20_++) {
		    int i_21_ = i_20_ * anInt9788;
		    int i_22_ = anInt9790 + (i_20_ + anInt9792) * i;
		    for (int i_23_ = 0; i_23_ < anInt9788; i_23_++) {
			int i_24_
			    = anIntArray9794[aByteArray9796[i_21_++] & 0xff];
			if (i_24_ != 0)
			    is[i_22_++] = ~0xffffff | i_24_;
			else
			    is[i_22_++] = 0;
		    }
		}
	    }
	} else {
	    is = new int[anInt9788 * anInt9789];
	    int i = 0;
	    int i_25_ = 0;
	    if (aByteArray9791 != null) {
		for (int i_26_ = 0; i_26_ < anInt9789; i_26_++) {
		    for (int i_27_ = 0; i_27_ < anInt9788; i_27_++) {
			is[i_25_++]
			    = (aByteArray9791[i] << 24
			       | anIntArray9794[aByteArray9796[i] & 0xff]);
			i++;
		    }
		}
	    } else {
		for (int i_28_ = 0; i_28_ < anInt9789; i_28_++) {
		    for (int i_29_ = 0; i_29_ < anInt9788; i_29_++) {
			int i_30_ = anIntArray9794[aByteArray9796[i++] & 0xff];
			is[i_25_++] = i_30_ != 0 ? ~0xffffff | i_30_ : 0;
		    }
		}
	    }
	}
	return is;
    }
    
    public void method2799(int i) {
	int i_31_ = -1;
	if (anIntArray9794.length < 255) {
	    for (int i_32_ = 0; i_32_ < anIntArray9794.length; i_32_++) {
		if (anIntArray9794[i_32_] == i) {
		    i_31_ = i_32_;
		    break;
		}
	    }
	    if (i_31_ == -1) {
		i_31_ = anIntArray9794.length;
		int[] is = new int[anIntArray9794.length + 1];
		System.arraycopy(anIntArray9794, 0, is, 0,
				 anIntArray9794.length);
		anIntArray9794 = is;
		is[i_31_] = i;
	    }
	} else {
	    int i_33_ = 2147483647;
	    int i_34_ = i >> 16 & 0xff;
	    int i_35_ = i >> 8 & 0xff;
	    int i_36_ = i & 0xff;
	    for (int i_37_ = 0; i_37_ < anIntArray9794.length; i_37_++) {
		int i_38_ = anIntArray9794[i_37_];
		int i_39_ = i_38_ >> 16 & 0xff;
		int i_40_ = i_38_ >> 8 & 0xff;
		int i_41_ = i_38_ & 0xff;
		int i_42_ = i_34_ - i_39_;
		if (i_42_ < 0)
		    i_42_ = -i_42_;
		int i_43_ = i_35_ - i_40_;
		if (i_43_ < 0)
		    i_43_ = -i_43_;
		int i_44_ = i_36_ - i_41_;
		if (i_44_ < 0)
		    i_44_ = -i_44_;
		int i_45_ = i_42_ + i_43_ + i_44_;
		if (i_45_ < i_33_) {
		    i_33_ = i_45_;
		    i_31_ = i_37_;
		}
	    }
	}
	int i_46_ = 0;
	byte[] is = new byte[anInt9788 * anInt9789];
	for (int i_47_ = 0; i_47_ < anInt9789; i_47_++) {
	    for (int i_48_ = 0; i_48_ < anInt9788; i_48_++) {
		int i_49_ = aByteArray9796[i_46_] & 0xff;
		if (anIntArray9794[i_49_] == 0) {
		    if (i_48_ > 0
			&& (anIntArray9794[aByteArray9796[i_46_ - 1] & 0xff]
			    != 0))
			i_49_ = i_31_;
		    else if (i_47_ > 0
			     && ((anIntArray9794
				  [aByteArray9796[i_46_ - anInt9788] & 0xff])
				 != 0))
			i_49_ = i_31_;
		    else if (i_48_ < anInt9788 - 1
			     && (anIntArray9794
				 [aByteArray9796[i_46_ + 1] & 0xff]) != 0)
			i_49_ = i_31_;
		    else if (i_47_ < anInt9789 - 1
			     && ((anIntArray9794
				  [aByteArray9796[i_46_ + anInt9788] & 0xff])
				 != 0))
			i_49_ = i_31_;
		}
		is[i_46_++] = (byte) i_49_;
	    }
	}
	aByteArray9796 = is;
    }
    
    public void method2769(int i) {
	int i_50_ = method2804();
	int i_51_ = method2770();
	if (anInt9788 != i_50_ || anInt9789 != i_51_) {
	    int i_52_ = i;
	    if (i_52_ > anInt9790)
		i_52_ = anInt9790;
	    int i_53_ = i;
	    if (i_53_ + anInt9790 + anInt9788 > i_50_)
		i_53_ = i_50_ - anInt9790 - anInt9788;
	    int i_54_ = i;
	    if (i_54_ > anInt9792)
		i_54_ = anInt9792;
	    int i_55_ = i;
	    if (i_55_ + anInt9792 + anInt9789 > i_51_)
		i_55_ = i_51_ - anInt9792 - anInt9789;
	    int i_56_ = anInt9788 + i_52_ + i_53_;
	    int i_57_ = anInt9789 + i_54_ + i_55_;
	    byte[] is = new byte[i_56_ * i_57_];
	    if (aByteArray9791 == null) {
		for (int i_58_ = 0; i_58_ < anInt9789; i_58_++) {
		    int i_59_ = i_58_ * anInt9788;
		    int i_60_ = (i_58_ + i_54_) * i_56_ + i_52_;
		    for (int i_61_ = 0; i_61_ < anInt9788; i_61_++)
			is[i_60_++] = aByteArray9796[i_59_++];
		}
	    } else {
		byte[] is_62_ = new byte[i_56_ * i_57_];
		for (int i_63_ = 0; i_63_ < anInt9789; i_63_++) {
		    int i_64_ = i_63_ * anInt9788;
		    int i_65_ = (i_63_ + i_54_) * i_56_ + i_52_;
		    for (int i_66_ = 0; i_66_ < anInt9788; i_66_++) {
			is_62_[i_65_] = aByteArray9791[i_64_];
			is[i_65_++] = aByteArray9796[i_64_++];
		    }
		}
		aByteArray9791 = is_62_;
	    }
	    anInt9790 -= i_52_;
	    anInt9792 -= i_54_;
	    anInt9795 -= i_53_;
	    anInt9793 -= i_55_;
	    anInt9788 = i_56_;
	    anInt9789 = i_57_;
	    aByteArray9796 = is;
	}
    }
    
    public void method2775(int i) {
	int i_67_ = -1;
	if (anIntArray9794.length < 255) {
	    for (int i_68_ = 0; i_68_ < anIntArray9794.length; i_68_++) {
		if (anIntArray9794[i_68_] == i) {
		    i_67_ = i_68_;
		    break;
		}
	    }
	    if (i_67_ == -1) {
		i_67_ = anIntArray9794.length;
		int[] is = new int[anIntArray9794.length + 1];
		System.arraycopy(anIntArray9794, 0, is, 0,
				 anIntArray9794.length);
		anIntArray9794 = is;
		is[i_67_] = i;
	    }
	} else {
	    int i_69_ = 2147483647;
	    int i_70_ = i >> 16 & 0xff;
	    int i_71_ = i >> 8 & 0xff;
	    int i_72_ = i & 0xff;
	    for (int i_73_ = 0; i_73_ < anIntArray9794.length; i_73_++) {
		int i_74_ = anIntArray9794[i_73_];
		int i_75_ = i_74_ >> 16 & 0xff;
		int i_76_ = i_74_ >> 8 & 0xff;
		int i_77_ = i_74_ & 0xff;
		int i_78_ = i_70_ - i_75_;
		if (i_78_ < 0)
		    i_78_ = -i_78_;
		int i_79_ = i_71_ - i_76_;
		if (i_79_ < 0)
		    i_79_ = -i_79_;
		int i_80_ = i_72_ - i_77_;
		if (i_80_ < 0)
		    i_80_ = -i_80_;
		int i_81_ = i_78_ + i_79_ + i_80_;
		if (i_81_ < i_69_) {
		    i_69_ = i_81_;
		    i_67_ = i_73_;
		}
	    }
	}
	int i_82_ = 0;
	byte[] is = new byte[anInt9788 * anInt9789];
	for (int i_83_ = 0; i_83_ < anInt9789; i_83_++) {
	    for (int i_84_ = 0; i_84_ < anInt9788; i_84_++) {
		int i_85_ = aByteArray9796[i_82_] & 0xff;
		if (anIntArray9794[i_85_] == 0) {
		    if (i_84_ > 0
			&& (anIntArray9794[aByteArray9796[i_82_ - 1] & 0xff]
			    != 0))
			i_85_ = i_67_;
		    else if (i_83_ > 0
			     && ((anIntArray9794
				  [aByteArray9796[i_82_ - anInt9788] & 0xff])
				 != 0))
			i_85_ = i_67_;
		    else if (i_84_ < anInt9788 - 1
			     && (anIntArray9794
				 [aByteArray9796[i_82_ + 1] & 0xff]) != 0)
			i_85_ = i_67_;
		    else if (i_83_ < anInt9789 - 1
			     && ((anIntArray9794
				  [aByteArray9796[i_82_ + anInt9788] & 0xff])
				 != 0))
			i_85_ = i_67_;
		}
		is[i_82_++] = (byte) i_85_;
	    }
	}
	aByteArray9796 = is;
    }
    
    public void method2792(int i) {
	int i_86_ = -1;
	if (anIntArray9794.length < 255) {
	    for (int i_87_ = 0; i_87_ < anIntArray9794.length; i_87_++) {
		if (anIntArray9794[i_87_] == i) {
		    i_86_ = i_87_;
		    break;
		}
	    }
	    if (i_86_ == -1) {
		i_86_ = anIntArray9794.length;
		int[] is = new int[anIntArray9794.length + 1];
		System.arraycopy(anIntArray9794, 0, is, 0,
				 anIntArray9794.length);
		anIntArray9794 = is;
		is[i_86_] = i;
	    }
	} else {
	    int i_88_ = 2147483647;
	    int i_89_ = i >> 16 & 0xff;
	    int i_90_ = i >> 8 & 0xff;
	    int i_91_ = i & 0xff;
	    for (int i_92_ = 0; i_92_ < anIntArray9794.length; i_92_++) {
		int i_93_ = anIntArray9794[i_92_];
		int i_94_ = i_93_ >> 16 & 0xff;
		int i_95_ = i_93_ >> 8 & 0xff;
		int i_96_ = i_93_ & 0xff;
		int i_97_ = i_89_ - i_94_;
		if (i_97_ < 0)
		    i_97_ = -i_97_;
		int i_98_ = i_90_ - i_95_;
		if (i_98_ < 0)
		    i_98_ = -i_98_;
		int i_99_ = i_91_ - i_96_;
		if (i_99_ < 0)
		    i_99_ = -i_99_;
		int i_100_ = i_97_ + i_98_ + i_99_;
		if (i_100_ < i_88_) {
		    i_88_ = i_100_;
		    i_86_ = i_92_;
		}
	    }
	}
	for (int i_101_ = anInt9789 - 1; i_101_ > 0; i_101_--) {
	    int i_102_ = i_101_ * anInt9788;
	    for (int i_103_ = anInt9788 - 1; i_103_ > 0; i_103_--) {
		if (anIntArray9794[aByteArray9796[i_103_ + i_102_] & 0xff] == 0
		    && (anIntArray9794[aByteArray9796[(i_103_ + i_102_ - 1
						       - anInt9788)] & 0xff]
			!= 0))
		    aByteArray9796[i_103_ + i_102_] = (byte) i_86_;
	    }
	}
    }
    
    public int method2770() {
	return anInt9789 + anInt9792 + anInt9793;
    }
    
    public void method2779() {
	byte[] is = aByteArray9796;
	if (aByteArray9791 == null) {
	    for (int i = (anInt9789 >> 1) - 1; i >= 0; i--) {
		int i_104_ = i * anInt9788;
		int i_105_ = (anInt9789 - i - 1) * anInt9788;
		for (int i_106_ = -anInt9788; i_106_ < 0; i_106_++) {
		    byte i_107_ = is[i_104_];
		    is[i_104_] = is[i_105_];
		    is[i_105_] = i_107_;
		    i_104_++;
		    i_105_++;
		}
	    }
	} else {
	    byte[] is_108_ = aByteArray9791;
	    for (int i = (anInt9789 >> 1) - 1; i >= 0; i--) {
		int i_109_ = i * anInt9788;
		int i_110_ = (anInt9789 - i - 1) * anInt9788;
		for (int i_111_ = -anInt9788; i_111_ < 0; i_111_++) {
		    byte i_112_ = is[i_109_];
		    is[i_109_] = is[i_110_];
		    is[i_110_] = i_112_;
		    i_112_ = is_108_[i_109_];
		    is_108_[i_109_] = is_108_[i_110_];
		    is_108_[i_110_] = i_112_;
		    i_109_++;
		    i_110_++;
		}
	    }
	}
	int i = anInt9792;
	anInt9792 = anInt9793;
	anInt9793 = i;
    }
    
    public void method2771() {
	byte[] is = new byte[anInt9788 * anInt9789];
	int i = 0;
	if (aByteArray9791 == null) {
	    for (int i_113_ = 0; i_113_ < anInt9788; i_113_++) {
		for (int i_114_ = anInt9789 - 1; i_114_ >= 0; i_114_--)
		    is[i++] = aByteArray9796[i_113_ + i_114_ * anInt9788];
	    }
	    aByteArray9796 = is;
	} else {
	    byte[] is_115_ = new byte[anInt9788 * anInt9789];
	    for (int i_116_ = 0; i_116_ < anInt9788; i_116_++) {
		for (int i_117_ = anInt9789 - 1; i_117_ >= 0; i_117_--) {
		    is[i] = aByteArray9796[i_116_ + i_117_ * anInt9788];
		    is_115_[i++] = aByteArray9791[i_116_ + i_117_ * anInt9788];
		}
	    }
	    aByteArray9796 = is;
	    aByteArray9791 = is_115_;
	}
	int i_118_ = anInt9792;
	anInt9792 = anInt9790;
	anInt9790 = anInt9793;
	anInt9793 = anInt9795;
	anInt9795 = i_118_;
	i_118_ = anInt9789;
	anInt9789 = anInt9788;
	anInt9788 = i_118_;
    }
    
    public int[] method2766(boolean bool) {
	int[] is;
	if (bool) {
	    int i = method2804();
	    is = new int[i * method2770()];
	    if (aByteArray9791 != null) {
		for (int i_119_ = 0; i_119_ < anInt9789; i_119_++) {
		    int i_120_ = i_119_ * anInt9788;
		    int i_121_ = anInt9790 + (i_119_ + anInt9792) * i;
		    for (int i_122_ = 0; i_122_ < anInt9788; i_122_++) {
			is[i_121_++] = (aByteArray9791[i_120_] << 24
					| (anIntArray9794
					   [aByteArray9796[i_120_] & 0xff]));
			i_120_++;
		    }
		}
	    } else {
		for (int i_123_ = 0; i_123_ < anInt9789; i_123_++) {
		    int i_124_ = i_123_ * anInt9788;
		    int i_125_ = anInt9790 + (i_123_ + anInt9792) * i;
		    for (int i_126_ = 0; i_126_ < anInt9788; i_126_++) {
			int i_127_
			    = anIntArray9794[aByteArray9796[i_124_++] & 0xff];
			if (i_127_ != 0)
			    is[i_125_++] = ~0xffffff | i_127_;
			else
			    is[i_125_++] = 0;
		    }
		}
	    }
	} else {
	    is = new int[anInt9788 * anInt9789];
	    int i = 0;
	    int i_128_ = 0;
	    if (aByteArray9791 != null) {
		for (int i_129_ = 0; i_129_ < anInt9789; i_129_++) {
		    for (int i_130_ = 0; i_130_ < anInt9788; i_130_++) {
			is[i_128_++]
			    = (aByteArray9791[i] << 24
			       | anIntArray9794[aByteArray9796[i] & 0xff]);
			i++;
		    }
		}
	    } else {
		for (int i_131_ = 0; i_131_ < anInt9789; i_131_++) {
		    for (int i_132_ = 0; i_132_ < anInt9788; i_132_++) {
			int i_133_
			    = anIntArray9794[aByteArray9796[i++] & 0xff];
			is[i_128_++] = i_133_ != 0 ? ~0xffffff | i_133_ : 0;
		    }
		}
	    }
	}
	return is;
    }
    
    public int method2765() {
	return anInt9795;
    }
    
    public int method2777(int i, int i_134_) {
	return anIntArray9794[aByteArray9796[i + i_134_ * anInt9788] & 0xff];
    }
    
    public void method2811(int i, int i_135_, int i_136_) {
	for (int i_137_ = 1; i_137_ < anIntArray9794.length; i_137_++) {
	    if (anIntArray9794[i_137_] != 1
		&& anIntArray9794[i_137_] != 16711935) {
		int i_138_ = anIntArray9794[i_137_] >> 16 & 0xff;
		i_138_ += i;
		if (i_138_ < 0)
		    i_138_ = 0;
		else if (i_138_ > 255)
		    i_138_ = 255;
		int i_139_ = anIntArray9794[i_137_] >> 8 & 0xff;
		i_139_ += i_135_;
		if (i_139_ < 0)
		    i_139_ = 0;
		else if (i_139_ > 255)
		    i_139_ = 255;
		int i_140_ = anIntArray9794[i_137_] >> 0 & 0xff;
		i_140_ += i_136_;
		if (i_140_ < 0)
		    i_140_ = 0;
		else if (i_140_ > 255)
		    i_140_ = 255;
		anIntArray9794[i_137_] = i_138_ << 16 | i_139_ << 8 | i_140_;
	    }
	}
    }
    
    public int method2759() {
	return anInt9788;
    }
    
    public int method2793() {
	return anInt9793;
    }
    
    public boolean method2760() {
	return true;
    }
    
    public int method2784() {
	return anInt9789;
    }
    
    public int method2791() {
	return anInt9788 + anInt9790 + anInt9795;
    }
    
    public int method2786() {
	return anInt9788 + anInt9790 + anInt9795;
    }
    
    public int method2814() {
	return anInt9788 + anInt9790 + anInt9795;
    }
    
    public int method2787() {
	return anInt9789 + anInt9792 + anInt9793;
    }
    
    public void method2812(int i, int i_141_, int i_142_) {
	for (int i_143_ = 1; i_143_ < anIntArray9794.length; i_143_++) {
	    if (anIntArray9794[i_143_] != 1
		&& anIntArray9794[i_143_] != 16711935) {
		int i_144_ = anIntArray9794[i_143_] >> 16 & 0xff;
		i_144_ += i;
		if (i_144_ < 0)
		    i_144_ = 0;
		else if (i_144_ > 255)
		    i_144_ = 255;
		int i_145_ = anIntArray9794[i_143_] >> 8 & 0xff;
		i_145_ += i_141_;
		if (i_145_ < 0)
		    i_145_ = 0;
		else if (i_145_ > 255)
		    i_145_ = 255;
		int i_146_ = anIntArray9794[i_143_] >> 0 & 0xff;
		i_146_ += i_142_;
		if (i_146_ < 0)
		    i_146_ = 0;
		else if (i_146_ > 255)
		    i_146_ = 255;
		anIntArray9794[i_143_] = i_144_ << 16 | i_145_ << 8 | i_146_;
	    }
	}
    }
    
    public void method2778(int i, int i_147_, int i_148_) {
	for (int i_149_ = 1; i_149_ < anIntArray9794.length; i_149_++) {
	    if (anIntArray9794[i_149_] != 1
		&& anIntArray9794[i_149_] != 16711935) {
		int i_150_ = anIntArray9794[i_149_] >> 16 & 0xff;
		i_150_ += i;
		if (i_150_ < 0)
		    i_150_ = 0;
		else if (i_150_ > 255)
		    i_150_ = 255;
		int i_151_ = anIntArray9794[i_149_] >> 8 & 0xff;
		i_151_ += i_147_;
		if (i_151_ < 0)
		    i_151_ = 0;
		else if (i_151_ > 255)
		    i_151_ = 255;
		int i_152_ = anIntArray9794[i_149_] >> 0 & 0xff;
		i_152_ += i_148_;
		if (i_152_ < 0)
		    i_152_ = 0;
		else if (i_152_ > 255)
		    i_152_ = 255;
		anIntArray9794[i_149_] = i_150_ << 16 | i_151_ << 8 | i_152_;
	    }
	}
    }
    
    public boolean method2817() {
	return true;
    }
    
    public int method2774() {
	return anInt9792;
    }
    
    public int method2782() {
	return anInt9788;
    }
    
    public void method2813(int i, int i_153_, int i_154_) {
	for (int i_155_ = 1; i_155_ < anIntArray9794.length; i_155_++) {
	    if (anIntArray9794[i_155_] != 1
		&& anIntArray9794[i_155_] != 16711935) {
		int i_156_ = anIntArray9794[i_155_] >> 16 & 0xff;
		i_156_ += i;
		if (i_156_ < 0)
		    i_156_ = 0;
		else if (i_156_ > 255)
		    i_156_ = 255;
		int i_157_ = anIntArray9794[i_155_] >> 8 & 0xff;
		i_157_ += i_153_;
		if (i_157_ < 0)
		    i_157_ = 0;
		else if (i_157_ > 255)
		    i_157_ = 255;
		int i_158_ = anIntArray9794[i_155_] >> 0 & 0xff;
		i_158_ += i_154_;
		if (i_158_ < 0)
		    i_158_ = 0;
		else if (i_158_ > 255)
		    i_158_ = 255;
		anIntArray9794[i_155_] = i_156_ << 16 | i_157_ << 8 | i_158_;
	    }
	}
    }
    
    public void method2795(int i) {
	int i_159_ = method2804();
	int i_160_ = method2770();
	if (anInt9788 != i_159_ || anInt9789 != i_160_) {
	    int i_161_ = i;
	    if (i_161_ > anInt9790)
		i_161_ = anInt9790;
	    int i_162_ = i;
	    if (i_162_ + anInt9790 + anInt9788 > i_159_)
		i_162_ = i_159_ - anInt9790 - anInt9788;
	    int i_163_ = i;
	    if (i_163_ > anInt9792)
		i_163_ = anInt9792;
	    int i_164_ = i;
	    if (i_164_ + anInt9792 + anInt9789 > i_160_)
		i_164_ = i_160_ - anInt9792 - anInt9789;
	    int i_165_ = anInt9788 + i_161_ + i_162_;
	    int i_166_ = anInt9789 + i_163_ + i_164_;
	    byte[] is = new byte[i_165_ * i_166_];
	    if (aByteArray9791 == null) {
		for (int i_167_ = 0; i_167_ < anInt9789; i_167_++) {
		    int i_168_ = i_167_ * anInt9788;
		    int i_169_ = (i_167_ + i_163_) * i_165_ + i_161_;
		    for (int i_170_ = 0; i_170_ < anInt9788; i_170_++)
			is[i_169_++] = aByteArray9796[i_168_++];
		}
	    } else {
		byte[] is_171_ = new byte[i_165_ * i_166_];
		for (int i_172_ = 0; i_172_ < anInt9789; i_172_++) {
		    int i_173_ = i_172_ * anInt9788;
		    int i_174_ = (i_172_ + i_163_) * i_165_ + i_161_;
		    for (int i_175_ = 0; i_175_ < anInt9788; i_175_++) {
			is_171_[i_174_] = aByteArray9791[i_173_];
			is[i_174_++] = aByteArray9796[i_173_++];
		    }
		}
		aByteArray9791 = is_171_;
	    }
	    anInt9790 -= i_161_;
	    anInt9792 -= i_163_;
	    anInt9795 -= i_162_;
	    anInt9793 -= i_164_;
	    anInt9788 = i_165_;
	    anInt9789 = i_166_;
	    aByteArray9796 = is;
	}
    }
    
    public void method2796(int i) {
	int i_176_ = method2804();
	int i_177_ = method2770();
	if (anInt9788 != i_176_ || anInt9789 != i_177_) {
	    int i_178_ = i;
	    if (i_178_ > anInt9790)
		i_178_ = anInt9790;
	    int i_179_ = i;
	    if (i_179_ + anInt9790 + anInt9788 > i_176_)
		i_179_ = i_176_ - anInt9790 - anInt9788;
	    int i_180_ = i;
	    if (i_180_ > anInt9792)
		i_180_ = anInt9792;
	    int i_181_ = i;
	    if (i_181_ + anInt9792 + anInt9789 > i_177_)
		i_181_ = i_177_ - anInt9792 - anInt9789;
	    int i_182_ = anInt9788 + i_178_ + i_179_;
	    int i_183_ = anInt9789 + i_180_ + i_181_;
	    byte[] is = new byte[i_182_ * i_183_];
	    if (aByteArray9791 == null) {
		for (int i_184_ = 0; i_184_ < anInt9789; i_184_++) {
		    int i_185_ = i_184_ * anInt9788;
		    int i_186_ = (i_184_ + i_180_) * i_182_ + i_178_;
		    for (int i_187_ = 0; i_187_ < anInt9788; i_187_++)
			is[i_186_++] = aByteArray9796[i_185_++];
		}
	    } else {
		byte[] is_188_ = new byte[i_182_ * i_183_];
		for (int i_189_ = 0; i_189_ < anInt9789; i_189_++) {
		    int i_190_ = i_189_ * anInt9788;
		    int i_191_ = (i_189_ + i_180_) * i_182_ + i_178_;
		    for (int i_192_ = 0; i_192_ < anInt9788; i_192_++) {
			is_188_[i_191_] = aByteArray9791[i_190_];
			is[i_191_++] = aByteArray9796[i_190_++];
		    }
		}
		aByteArray9791 = is_188_;
	    }
	    anInt9790 -= i_178_;
	    anInt9792 -= i_180_;
	    anInt9795 -= i_179_;
	    anInt9793 -= i_181_;
	    anInt9788 = i_182_;
	    anInt9789 = i_183_;
	    aByteArray9796 = is;
	}
    }
    
    public void method2772(int i) {
	int i_193_ = method2804();
	int i_194_ = method2770();
	if (anInt9788 != i_193_ || anInt9789 != i_194_) {
	    int i_195_ = i;
	    if (i_195_ > anInt9790)
		i_195_ = anInt9790;
	    int i_196_ = i;
	    if (i_196_ + anInt9790 + anInt9788 > i_193_)
		i_196_ = i_193_ - anInt9790 - anInt9788;
	    int i_197_ = i;
	    if (i_197_ > anInt9792)
		i_197_ = anInt9792;
	    int i_198_ = i;
	    if (i_198_ + anInt9792 + anInt9789 > i_194_)
		i_198_ = i_194_ - anInt9792 - anInt9789;
	    int i_199_ = anInt9788 + i_195_ + i_196_;
	    int i_200_ = anInt9789 + i_197_ + i_198_;
	    byte[] is = new byte[i_199_ * i_200_];
	    if (aByteArray9791 == null) {
		for (int i_201_ = 0; i_201_ < anInt9789; i_201_++) {
		    int i_202_ = i_201_ * anInt9788;
		    int i_203_ = (i_201_ + i_197_) * i_199_ + i_195_;
		    for (int i_204_ = 0; i_204_ < anInt9788; i_204_++)
			is[i_203_++] = aByteArray9796[i_202_++];
		}
	    } else {
		byte[] is_205_ = new byte[i_199_ * i_200_];
		for (int i_206_ = 0; i_206_ < anInt9789; i_206_++) {
		    int i_207_ = i_206_ * anInt9788;
		    int i_208_ = (i_206_ + i_197_) * i_199_ + i_195_;
		    for (int i_209_ = 0; i_209_ < anInt9788; i_209_++) {
			is_205_[i_208_] = aByteArray9791[i_207_];
			is[i_208_++] = aByteArray9796[i_207_++];
		    }
		}
		aByteArray9791 = is_205_;
	    }
	    anInt9790 -= i_195_;
	    anInt9792 -= i_197_;
	    anInt9795 -= i_196_;
	    anInt9793 -= i_198_;
	    anInt9788 = i_199_;
	    anInt9789 = i_200_;
	    aByteArray9796 = is;
	}
    }
    
    public void method2805() {
	byte[] is = new byte[anInt9788 * anInt9789];
	int i = 0;
	if (aByteArray9791 == null) {
	    for (int i_210_ = 0; i_210_ < anInt9788; i_210_++) {
		for (int i_211_ = anInt9789 - 1; i_211_ >= 0; i_211_--)
		    is[i++] = aByteArray9796[i_210_ + i_211_ * anInt9788];
	    }
	    aByteArray9796 = is;
	} else {
	    byte[] is_212_ = new byte[anInt9788 * anInt9789];
	    for (int i_213_ = 0; i_213_ < anInt9788; i_213_++) {
		for (int i_214_ = anInt9789 - 1; i_214_ >= 0; i_214_--) {
		    is[i] = aByteArray9796[i_213_ + i_214_ * anInt9788];
		    is_212_[i++] = aByteArray9791[i_213_ + i_214_ * anInt9788];
		}
	    }
	    aByteArray9796 = is;
	    aByteArray9791 = is_212_;
	}
	int i_215_ = anInt9792;
	anInt9792 = anInt9790;
	anInt9790 = anInt9793;
	anInt9793 = anInt9795;
	anInt9795 = i_215_;
	i_215_ = anInt9789;
	anInt9789 = anInt9788;
	anInt9788 = i_215_;
    }
    
    public int method2789() {
	return anInt9790;
    }
    
    public void method2800() {
	byte[] is = aByteArray9796;
	if (aByteArray9791 == null) {
	    for (int i = anInt9789 - 1; i >= 0; i--) {
		int i_216_ = i * anInt9788;
		for (int i_217_ = (i + 1) * anInt9788; i_216_ < i_217_;
		     i_216_++) {
		    i_217_--;
		    byte i_218_ = is[i_216_];
		    is[i_216_] = is[i_217_];
		    is[i_217_] = i_218_;
		}
	    }
	} else {
	    byte[] is_219_ = aByteArray9791;
	    for (int i = anInt9789 - 1; i >= 0; i--) {
		int i_220_ = i * anInt9788;
		for (int i_221_ = (i + 1) * anInt9788; i_220_ < i_221_;
		     i_220_++) {
		    i_221_--;
		    byte i_222_ = is[i_220_];
		    is[i_220_] = is[i_221_];
		    is[i_221_] = i_222_;
		    i_222_ = is_219_[i_220_];
		    is_219_[i_220_] = is_219_[i_221_];
		    is_219_[i_221_] = i_222_;
		}
	    }
	}
	int i = anInt9790;
	anInt9790 = anInt9795;
	anInt9795 = i;
    }
    
    public void method2761() {
	byte[] is = aByteArray9796;
	if (aByteArray9791 == null) {
	    for (int i = anInt9789 - 1; i >= 0; i--) {
		int i_223_ = i * anInt9788;
		for (int i_224_ = (i + 1) * anInt9788; i_223_ < i_224_;
		     i_223_++) {
		    i_224_--;
		    byte i_225_ = is[i_223_];
		    is[i_223_] = is[i_224_];
		    is[i_224_] = i_225_;
		}
	    }
	} else {
	    byte[] is_226_ = aByteArray9791;
	    for (int i = anInt9789 - 1; i >= 0; i--) {
		int i_227_ = i * anInt9788;
		for (int i_228_ = (i + 1) * anInt9788; i_227_ < i_228_;
		     i_227_++) {
		    i_228_--;
		    byte i_229_ = is[i_227_];
		    is[i_227_] = is[i_228_];
		    is[i_228_] = i_229_;
		    i_229_ = is_226_[i_227_];
		    is_226_[i_227_] = is_226_[i_228_];
		    is_226_[i_228_] = i_229_;
		}
	    }
	}
	int i = anInt9790;
	anInt9790 = anInt9795;
	anInt9795 = i;
    }
    
    public void method2802() {
	byte[] is = aByteArray9796;
	if (aByteArray9791 == null) {
	    for (int i = anInt9789 - 1; i >= 0; i--) {
		int i_230_ = i * anInt9788;
		for (int i_231_ = (i + 1) * anInt9788; i_230_ < i_231_;
		     i_230_++) {
		    i_231_--;
		    byte i_232_ = is[i_230_];
		    is[i_230_] = is[i_231_];
		    is[i_231_] = i_232_;
		}
	    }
	} else {
	    byte[] is_233_ = aByteArray9791;
	    for (int i = anInt9789 - 1; i >= 0; i--) {
		int i_234_ = i * anInt9788;
		for (int i_235_ = (i + 1) * anInt9788; i_234_ < i_235_;
		     i_234_++) {
		    i_235_--;
		    byte i_236_ = is[i_234_];
		    is[i_234_] = is[i_235_];
		    is[i_235_] = i_236_;
		    i_236_ = is_233_[i_234_];
		    is_233_[i_234_] = is_233_[i_235_];
		    is_233_[i_235_] = i_236_;
		}
	    }
	}
	int i = anInt9790;
	anInt9790 = anInt9795;
	anInt9795 = i;
    }
    
    public void method2803() {
	byte[] is = aByteArray9796;
	if (aByteArray9791 == null) {
	    for (int i = (anInt9789 >> 1) - 1; i >= 0; i--) {
		int i_237_ = i * anInt9788;
		int i_238_ = (anInt9789 - i - 1) * anInt9788;
		for (int i_239_ = -anInt9788; i_239_ < 0; i_239_++) {
		    byte i_240_ = is[i_237_];
		    is[i_237_] = is[i_238_];
		    is[i_238_] = i_240_;
		    i_237_++;
		    i_238_++;
		}
	    }
	} else {
	    byte[] is_241_ = aByteArray9791;
	    for (int i = (anInt9789 >> 1) - 1; i >= 0; i--) {
		int i_242_ = i * anInt9788;
		int i_243_ = (anInt9789 - i - 1) * anInt9788;
		for (int i_244_ = -anInt9788; i_244_ < 0; i_244_++) {
		    byte i_245_ = is[i_242_];
		    is[i_242_] = is[i_243_];
		    is[i_243_] = i_245_;
		    i_245_ = is_241_[i_242_];
		    is_241_[i_242_] = is_241_[i_243_];
		    is_241_[i_243_] = i_245_;
		    i_242_++;
		    i_243_++;
		}
	    }
	}
	int i = anInt9792;
	anInt9792 = anInt9793;
	anInt9793 = i;
    }
    
    public void method2808() {
	byte[] is = aByteArray9796;
	if (aByteArray9791 == null) {
	    for (int i = (anInt9789 >> 1) - 1; i >= 0; i--) {
		int i_246_ = i * anInt9788;
		int i_247_ = (anInt9789 - i - 1) * anInt9788;
		for (int i_248_ = -anInt9788; i_248_ < 0; i_248_++) {
		    byte i_249_ = is[i_246_];
		    is[i_246_] = is[i_247_];
		    is[i_247_] = i_249_;
		    i_246_++;
		    i_247_++;
		}
	    }
	} else {
	    byte[] is_250_ = aByteArray9791;
	    for (int i = (anInt9789 >> 1) - 1; i >= 0; i--) {
		int i_251_ = i * anInt9788;
		int i_252_ = (anInt9789 - i - 1) * anInt9788;
		for (int i_253_ = -anInt9788; i_253_ < 0; i_253_++) {
		    byte i_254_ = is[i_251_];
		    is[i_251_] = is[i_252_];
		    is[i_252_] = i_254_;
		    i_254_ = is_250_[i_251_];
		    is_250_[i_251_] = is_250_[i_252_];
		    is_250_[i_252_] = i_254_;
		    i_251_++;
		    i_252_++;
		}
	    }
	}
	int i = anInt9792;
	anInt9792 = anInt9793;
	anInt9793 = i;
    }
    
    public int method2767() {
	return anInt9793;
    }
    
    public void method2801() {
	byte[] is = new byte[anInt9788 * anInt9789];
	int i = 0;
	if (aByteArray9791 == null) {
	    for (int i_255_ = 0; i_255_ < anInt9788; i_255_++) {
		for (int i_256_ = anInt9789 - 1; i_256_ >= 0; i_256_--)
		    is[i++] = aByteArray9796[i_255_ + i_256_ * anInt9788];
	    }
	    aByteArray9796 = is;
	} else {
	    byte[] is_257_ = new byte[anInt9788 * anInt9789];
	    for (int i_258_ = 0; i_258_ < anInt9788; i_258_++) {
		for (int i_259_ = anInt9789 - 1; i_259_ >= 0; i_259_--) {
		    is[i] = aByteArray9796[i_258_ + i_259_ * anInt9788];
		    is_257_[i++] = aByteArray9791[i_258_ + i_259_ * anInt9788];
		}
	    }
	    aByteArray9796 = is;
	    aByteArray9791 = is_257_;
	}
	int i_260_ = anInt9792;
	anInt9792 = anInt9790;
	anInt9790 = anInt9793;
	anInt9793 = anInt9795;
	anInt9795 = i_260_;
	i_260_ = anInt9789;
	anInt9789 = anInt9788;
	anInt9788 = i_260_;
    }
    
    Class169_Sub2() {
	/* empty */
    }
    
    public boolean method2780() {
	return aByteArray9791 != null;
    }
    
    public int method2794() {
	return anInt9793;
    }
    
    public void method2806() {
	byte[] is = aByteArray9796;
	if (aByteArray9791 == null) {
	    for (int i = anInt9789 - 1; i >= 0; i--) {
		int i_261_ = i * anInt9788;
		for (int i_262_ = (i + 1) * anInt9788; i_261_ < i_262_;
		     i_261_++) {
		    i_262_--;
		    byte i_263_ = is[i_261_];
		    is[i_261_] = is[i_262_];
		    is[i_262_] = i_263_;
		}
	    }
	} else {
	    byte[] is_264_ = aByteArray9791;
	    for (int i = anInt9789 - 1; i >= 0; i--) {
		int i_265_ = i * anInt9788;
		for (int i_266_ = (i + 1) * anInt9788; i_265_ < i_266_;
		     i_265_++) {
		    i_266_--;
		    byte i_267_ = is[i_265_];
		    is[i_265_] = is[i_266_];
		    is[i_266_] = i_267_;
		    i_267_ = is_264_[i_265_];
		    is_264_[i_265_] = is_264_[i_266_];
		    is_264_[i_266_] = i_267_;
		}
	    }
	}
	int i = anInt9790;
	anInt9790 = anInt9795;
	anInt9795 = i;
    }
    
    public int method2810() {
	return anInt9792;
    }
    
    public boolean method2818() {
	return true;
    }
    
    public void method2798(int i) {
	int i_268_ = -1;
	if (anIntArray9794.length < 255) {
	    for (int i_269_ = 0; i_269_ < anIntArray9794.length; i_269_++) {
		if (anIntArray9794[i_269_] == i) {
		    i_268_ = i_269_;
		    break;
		}
	    }
	    if (i_268_ == -1) {
		i_268_ = anIntArray9794.length;
		int[] is = new int[anIntArray9794.length + 1];
		System.arraycopy(anIntArray9794, 0, is, 0,
				 anIntArray9794.length);
		anIntArray9794 = is;
		is[i_268_] = i;
	    }
	} else {
	    int i_270_ = 2147483647;
	    int i_271_ = i >> 16 & 0xff;
	    int i_272_ = i >> 8 & 0xff;
	    int i_273_ = i & 0xff;
	    for (int i_274_ = 0; i_274_ < anIntArray9794.length; i_274_++) {
		int i_275_ = anIntArray9794[i_274_];
		int i_276_ = i_275_ >> 16 & 0xff;
		int i_277_ = i_275_ >> 8 & 0xff;
		int i_278_ = i_275_ & 0xff;
		int i_279_ = i_271_ - i_276_;
		if (i_279_ < 0)
		    i_279_ = -i_279_;
		int i_280_ = i_272_ - i_277_;
		if (i_280_ < 0)
		    i_280_ = -i_280_;
		int i_281_ = i_273_ - i_278_;
		if (i_281_ < 0)
		    i_281_ = -i_281_;
		int i_282_ = i_279_ + i_280_ + i_281_;
		if (i_282_ < i_270_) {
		    i_270_ = i_282_;
		    i_268_ = i_274_;
		}
	    }
	}
	int i_283_ = 0;
	byte[] is = new byte[anInt9788 * anInt9789];
	for (int i_284_ = 0; i_284_ < anInt9789; i_284_++) {
	    for (int i_285_ = 0; i_285_ < anInt9788; i_285_++) {
		int i_286_ = aByteArray9796[i_283_] & 0xff;
		if (anIntArray9794[i_286_] == 0) {
		    if (i_285_ > 0
			&& (anIntArray9794[aByteArray9796[i_283_ - 1] & 0xff]
			    != 0))
			i_286_ = i_268_;
		    else if (i_284_ > 0
			     && ((anIntArray9794
				  [aByteArray9796[i_283_ - anInt9788] & 0xff])
				 != 0))
			i_286_ = i_268_;
		    else if (i_285_ < anInt9788 - 1
			     && (anIntArray9794
				 [aByteArray9796[i_283_ + 1] & 0xff]) != 0)
			i_286_ = i_268_;
		    else if (i_284_ < anInt9789 - 1
			     && ((anIntArray9794
				  [aByteArray9796[i_283_ + anInt9788] & 0xff])
				 != 0))
			i_286_ = i_268_;
		}
		is[i_283_++] = (byte) i_286_;
	    }
	}
	aByteArray9796 = is;
    }
    
    public int method2785(int i, int i_287_) {
	return anIntArray9794[aByteArray9796[i + i_287_ * anInt9788] & 0xff];
    }
    
    public int method2788(int i, int i_288_) {
	return anIntArray9794[aByteArray9796[i + i_288_ * anInt9788] & 0xff];
    }
    
    public int method2783() {
	return anInt9789;
    }
    
    public int method2816(int i, int i_289_) {
	return anIntArray9794[aByteArray9796[i + i_289_ * anInt9788] & 0xff];
    }
    
    public void method2776(int i, int i_290_, int i_291_) {
	for (int i_292_ = 1; i_292_ < anIntArray9794.length; i_292_++) {
	    if (anIntArray9794[i_292_] != 1
		&& anIntArray9794[i_292_] != 16711935) {
		int i_293_ = anIntArray9794[i_292_] >> 16 & 0xff;
		i_293_ += i;
		if (i_293_ < 0)
		    i_293_ = 0;
		else if (i_293_ > 255)
		    i_293_ = 255;
		int i_294_ = anIntArray9794[i_292_] >> 8 & 0xff;
		i_294_ += i_290_;
		if (i_294_ < 0)
		    i_294_ = 0;
		else if (i_294_ > 255)
		    i_294_ = 255;
		int i_295_ = anIntArray9794[i_292_] >> 0 & 0xff;
		i_295_ += i_291_;
		if (i_295_ < 0)
		    i_295_ = 0;
		else if (i_295_ > 255)
		    i_295_ = 255;
		anIntArray9794[i_292_] = i_293_ << 16 | i_294_ << 8 | i_295_;
	    }
	}
    }
    
    public int[] method2809(boolean bool) {
	int[] is;
	if (bool) {
	    int i = method2804();
	    is = new int[i * method2770()];
	    if (aByteArray9791 != null) {
		for (int i_296_ = 0; i_296_ < anInt9789; i_296_++) {
		    int i_297_ = i_296_ * anInt9788;
		    int i_298_ = anInt9790 + (i_296_ + anInt9792) * i;
		    for (int i_299_ = 0; i_299_ < anInt9788; i_299_++) {
			is[i_298_++] = (aByteArray9791[i_297_] << 24
					| (anIntArray9794
					   [aByteArray9796[i_297_] & 0xff]));
			i_297_++;
		    }
		}
	    } else {
		for (int i_300_ = 0; i_300_ < anInt9789; i_300_++) {
		    int i_301_ = i_300_ * anInt9788;
		    int i_302_ = anInt9790 + (i_300_ + anInt9792) * i;
		    for (int i_303_ = 0; i_303_ < anInt9788; i_303_++) {
			int i_304_
			    = anIntArray9794[aByteArray9796[i_301_++] & 0xff];
			if (i_304_ != 0)
			    is[i_302_++] = ~0xffffff | i_304_;
			else
			    is[i_302_++] = 0;
		    }
		}
	    }
	} else {
	    is = new int[anInt9788 * anInt9789];
	    int i = 0;
	    int i_305_ = 0;
	    if (aByteArray9791 != null) {
		for (int i_306_ = 0; i_306_ < anInt9789; i_306_++) {
		    for (int i_307_ = 0; i_307_ < anInt9788; i_307_++) {
			is[i_305_++]
			    = (aByteArray9791[i] << 24
			       | anIntArray9794[aByteArray9796[i] & 0xff]);
			i++;
		    }
		}
	    } else {
		for (int i_308_ = 0; i_308_ < anInt9789; i_308_++) {
		    for (int i_309_ = 0; i_309_ < anInt9788; i_309_++) {
			int i_310_
			    = anIntArray9794[aByteArray9796[i++] & 0xff];
			is[i_305_++] = i_310_ != 0 ? ~0xffffff | i_310_ : 0;
		    }
		}
	    }
	}
	return is;
    }
    
    public void method2819() {
	anInt9793 = 0;
	anInt9792 = 0;
	anInt9795 = 0;
	anInt9790 = 0;
    }
    
    public void method2820(int i) {
	int i_311_ = -1;
	if (anIntArray9794.length < 255) {
	    for (int i_312_ = 0; i_312_ < anIntArray9794.length; i_312_++) {
		if (anIntArray9794[i_312_] == i) {
		    i_311_ = i_312_;
		    break;
		}
	    }
	    if (i_311_ == -1) {
		i_311_ = anIntArray9794.length;
		int[] is = new int[anIntArray9794.length + 1];
		System.arraycopy(anIntArray9794, 0, is, 0,
				 anIntArray9794.length);
		anIntArray9794 = is;
		is[i_311_] = i;
	    }
	} else {
	    int i_313_ = 2147483647;
	    int i_314_ = i >> 16 & 0xff;
	    int i_315_ = i >> 8 & 0xff;
	    int i_316_ = i & 0xff;
	    for (int i_317_ = 0; i_317_ < anIntArray9794.length; i_317_++) {
		int i_318_ = anIntArray9794[i_317_];
		int i_319_ = i_318_ >> 16 & 0xff;
		int i_320_ = i_318_ >> 8 & 0xff;
		int i_321_ = i_318_ & 0xff;
		int i_322_ = i_314_ - i_319_;
		if (i_322_ < 0)
		    i_322_ = -i_322_;
		int i_323_ = i_315_ - i_320_;
		if (i_323_ < 0)
		    i_323_ = -i_323_;
		int i_324_ = i_316_ - i_321_;
		if (i_324_ < 0)
		    i_324_ = -i_324_;
		int i_325_ = i_322_ + i_323_ + i_324_;
		if (i_325_ < i_313_) {
		    i_313_ = i_325_;
		    i_311_ = i_317_;
		}
	    }
	}
	for (int i_326_ = anInt9789 - 1; i_326_ > 0; i_326_--) {
	    int i_327_ = i_326_ * anInt9788;
	    for (int i_328_ = anInt9788 - 1; i_328_ > 0; i_328_--) {
		if (anIntArray9794[aByteArray9796[i_328_ + i_327_] & 0xff] == 0
		    && (anIntArray9794[aByteArray9796[(i_328_ + i_327_ - 1
						       - anInt9788)] & 0xff]
			!= 0))
		    aByteArray9796[i_328_ + i_327_] = (byte) i_311_;
	    }
	}
    }
    
    public void method2821(int i) {
	int i_329_ = -1;
	if (anIntArray9794.length < 255) {
	    for (int i_330_ = 0; i_330_ < anIntArray9794.length; i_330_++) {
		if (anIntArray9794[i_330_] == i) {
		    i_329_ = i_330_;
		    break;
		}
	    }
	    if (i_329_ == -1) {
		i_329_ = anIntArray9794.length;
		int[] is = new int[anIntArray9794.length + 1];
		System.arraycopy(anIntArray9794, 0, is, 0,
				 anIntArray9794.length);
		anIntArray9794 = is;
		is[i_329_] = i;
	    }
	} else {
	    int i_331_ = 2147483647;
	    int i_332_ = i >> 16 & 0xff;
	    int i_333_ = i >> 8 & 0xff;
	    int i_334_ = i & 0xff;
	    for (int i_335_ = 0; i_335_ < anIntArray9794.length; i_335_++) {
		int i_336_ = anIntArray9794[i_335_];
		int i_337_ = i_336_ >> 16 & 0xff;
		int i_338_ = i_336_ >> 8 & 0xff;
		int i_339_ = i_336_ & 0xff;
		int i_340_ = i_332_ - i_337_;
		if (i_340_ < 0)
		    i_340_ = -i_340_;
		int i_341_ = i_333_ - i_338_;
		if (i_341_ < 0)
		    i_341_ = -i_341_;
		int i_342_ = i_334_ - i_339_;
		if (i_342_ < 0)
		    i_342_ = -i_342_;
		int i_343_ = i_340_ + i_341_ + i_342_;
		if (i_343_ < i_331_) {
		    i_331_ = i_343_;
		    i_329_ = i_335_;
		}
	    }
	}
	for (int i_344_ = anInt9789 - 1; i_344_ > 0; i_344_--) {
	    int i_345_ = i_344_ * anInt9788;
	    for (int i_346_ = anInt9788 - 1; i_346_ > 0; i_346_--) {
		if (anIntArray9794[aByteArray9796[i_346_ + i_345_] & 0xff] == 0
		    && (anIntArray9794[aByteArray9796[(i_346_ + i_345_ - 1
						       - anInt9788)] & 0xff]
			!= 0))
		    aByteArray9796[i_346_ + i_345_] = (byte) i_329_;
	    }
	}
    }
}
