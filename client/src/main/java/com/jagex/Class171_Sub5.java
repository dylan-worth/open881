/* Class171_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class171_Sub5 extends Class171
{
    int[] anIntArray9954;
    byte[][] aByteArrayArray9955;
    int[] anIntArray9956;
    int[] anIntArray9957;
    int[] anIntArray9958;
    Class185_Sub2 aClass185_Sub2_9959;
    
    void method2845(char c, int i, int i_0_, int i_1_, boolean bool) {
	if (null != aClass185_Sub2_9959.anIntArray9338) {
	    i += anIntArray9954[c];
	    i_0_ += anIntArray9957[c];
	    int i_2_ = anIntArray9956[c];
	    int i_3_ = anIntArray9958[c];
	    int i_4_ = 356365251 * aClass185_Sub2_9959.anInt9356;
	    int i_5_ = i + i_0_ * i_4_;
	    int i_6_ = i_4_ - i_2_;
	    int i_7_ = 0;
	    int i_8_ = 0;
	    if (i_0_ < 9823353 * aClass185_Sub2_9959.anInt9344) {
		int i_9_ = aClass185_Sub2_9959.anInt9344 * 9823353 - i_0_;
		i_3_ -= i_9_;
		i_0_ = aClass185_Sub2_9959.anInt9344 * 9823353;
		i_8_ += i_9_ * i_2_;
		i_5_ += i_4_ * i_9_;
	    }
	    if (i_3_ + i_0_ > aClass185_Sub2_9959.anInt9345 * 639238427)
		i_3_
		    -= i_3_ + i_0_ - 639238427 * aClass185_Sub2_9959.anInt9345;
	    if (i < 1709859847 * aClass185_Sub2_9959.anInt9365) {
		int i_10_ = 1709859847 * aClass185_Sub2_9959.anInt9365 - i;
		i_2_ -= i_10_;
		i = aClass185_Sub2_9959.anInt9365 * 1709859847;
		i_8_ += i_10_;
		i_5_ += i_10_;
		i_7_ += i_10_;
		i_6_ += i_10_;
	    }
	    if (i + i_2_ > -1807368365 * aClass185_Sub2_9959.anInt9343) {
		int i_11_
		    = i + i_2_ - aClass185_Sub2_9959.anInt9343 * -1807368365;
		i_2_ -= i_11_;
		i_7_ += i_11_;
		i_6_ += i_11_;
	    }
	    if (i_2_ > 0 && i_3_ > 0)
		method15608(aByteArrayArray9955[c],
			    aClass185_Sub2_9959.anIntArray9338, i_1_, i_8_,
			    i_5_, i_2_, i_3_, i_6_, i_7_);
	}
    }
    
    Class171_Sub5(Class185_Sub2 class185_sub2, Class16 class16,
		  Class169_Sub1[] class169_sub1s, int[] is, int[] is_12_) {
	super(class185_sub2, class16);
	aClass185_Sub2_9959 = class185_sub2;
	aClass185_Sub2_9959 = class185_sub2;
	anIntArray9956 = is;
	anIntArray9958 = is_12_;
	aByteArrayArray9955 = new byte[class169_sub1s.length][];
	anIntArray9957 = new int[class169_sub1s.length];
	anIntArray9954 = new int[class169_sub1s.length];
	for (int i = 0; i < class169_sub1s.length; i++) {
	    Class169_Sub1 class169_sub1 = class169_sub1s[i];
	    int[] is_13_ = class169_sub1.method2766(false);
	    byte[] is_14_ = aByteArrayArray9955[i] = new byte[is_13_.length];
	    for (int i_15_ = 0; i_15_ < is_13_.length; i_15_++)
		is_14_[i_15_] = (byte) (is_13_[i_15_] >> 24 & 0xff);
	    anIntArray9957[i] = class169_sub1.method2781();
	    anIntArray9954[i] = class169_sub1.method2764();
	}
    }
    
    void method15607(byte[] is, int[] is_16_, int i, int i_17_, int i_18_,
		     int i_19_, int i_20_, int i_21_, int i_22_, int i_23_,
		     int i_24_, int i_25_, Class145 class145, int i_26_,
		     int i_27_) {
	Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
	int[] is_28_ = class145_sub2.anIntArray9797;
	int[] is_29_ = class145_sub2.anIntArray9798;
	int i_30_ = i_23_ - aClass185_Sub2_9959.anInt9365 * 1709859847;
	int i_31_ = i_24_;
	if (i_27_ > i_31_) {
	    i_31_ = i_27_;
	    i_18_
		+= aClass185_Sub2_9959.anInt9356 * 356365251 * (i_27_ - i_24_);
	    i_17_ += (i_27_ - i_24_) * i_25_;
	}
	int i_32_ = (i_27_ + is_28_.length < i_20_ + i_24_
		     ? is_28_.length + i_27_ : i_24_ + i_20_);
	for (int i_33_ = i_31_; i_33_ < i_32_; i_33_++) {
	    int i_34_ = i_26_ + is_28_[i_33_ - i_27_];
	    int i_35_ = is_29_[i_33_ - i_27_];
	    int i_36_ = i_19_;
	    if (i_30_ > i_34_) {
		int i_37_ = i_30_ - i_34_;
		if (i_37_ >= i_35_) {
		    i_17_ += i_19_ + i_22_;
		    i_18_ += i_21_ + i_19_;
		    continue;
		}
		i_35_ -= i_37_;
	    } else {
		int i_38_ = i_34_ - i_30_;
		if (i_38_ >= i_19_) {
		    i_17_ += i_22_ + i_19_;
		    i_18_ += i_19_ + i_21_;
		    continue;
		}
		i_17_ += i_38_;
		i_36_ -= i_38_;
		i_18_ += i_38_;
	    }
	    int i_39_ = 0;
	    if (i_36_ < i_35_)
		i_35_ = i_36_;
	    else
		i_39_ = i_36_ - i_35_;
	    for (int i_40_ = -i_35_; i_40_ < 0; i_40_++) {
		int i_41_ = is[i_17_++] & 0xff;
		if (i_41_ != 0) {
		    int i_42_ = (((i_41_ * (i & 0xff00) & 0xff0000)
				  + ((i & 0xff00ff) * i_41_ & ~0xff00ff))
				 >> 8);
		    i_41_ = 256 - i_41_;
		    int i_43_ = is_16_[i_18_];
		    is_16_[i_18_++]
			= ((((i_43_ & 0xff00) * i_41_ & 0xff0000)
			    + ((i_43_ & 0xff00ff) * i_41_ & ~0xff00ff))
			   >> 8) + i_42_;
		} else
		    i_18_++;
	    }
	    i_17_ += i_39_ + i_22_;
	    i_18_ += i_39_ + i_21_;
	}
    }
    
    void method2860(char c, int i, int i_44_, int i_45_, boolean bool) {
	if (null != aClass185_Sub2_9959.anIntArray9338) {
	    i += anIntArray9954[c];
	    i_44_ += anIntArray9957[c];
	    int i_46_ = anIntArray9956[c];
	    int i_47_ = anIntArray9958[c];
	    int i_48_ = 356365251 * aClass185_Sub2_9959.anInt9356;
	    int i_49_ = i + i_44_ * i_48_;
	    int i_50_ = i_48_ - i_46_;
	    int i_51_ = 0;
	    int i_52_ = 0;
	    if (i_44_ < 9823353 * aClass185_Sub2_9959.anInt9344) {
		int i_53_ = aClass185_Sub2_9959.anInt9344 * 9823353 - i_44_;
		i_47_ -= i_53_;
		i_44_ = aClass185_Sub2_9959.anInt9344 * 9823353;
		i_52_ += i_53_ * i_46_;
		i_49_ += i_48_ * i_53_;
	    }
	    if (i_47_ + i_44_ > aClass185_Sub2_9959.anInt9345 * 639238427)
		i_47_ -= (i_47_ + i_44_
			  - 639238427 * aClass185_Sub2_9959.anInt9345);
	    if (i < 1709859847 * aClass185_Sub2_9959.anInt9365) {
		int i_54_ = 1709859847 * aClass185_Sub2_9959.anInt9365 - i;
		i_46_ -= i_54_;
		i = aClass185_Sub2_9959.anInt9365 * 1709859847;
		i_52_ += i_54_;
		i_49_ += i_54_;
		i_51_ += i_54_;
		i_50_ += i_54_;
	    }
	    if (i + i_46_ > -1807368365 * aClass185_Sub2_9959.anInt9343) {
		int i_55_
		    = i + i_46_ - aClass185_Sub2_9959.anInt9343 * -1807368365;
		i_46_ -= i_55_;
		i_51_ += i_55_;
		i_50_ += i_55_;
	    }
	    if (i_46_ > 0 && i_47_ > 0)
		method15608(aByteArrayArray9955[c],
			    aClass185_Sub2_9959.anIntArray9338, i_45_, i_52_,
			    i_49_, i_46_, i_47_, i_50_, i_51_);
	}
    }
    
    void method15608(byte[] is, int[] is_56_, int i, int i_57_, int i_58_,
		     int i_59_, int i_60_, int i_61_, int i_62_) {
	for (int i_63_ = -i_60_; i_63_ < 0; i_63_++) {
	    for (int i_64_ = -i_59_; i_64_ < 0; i_64_++) {
		int i_65_ = is[i_57_++] & 0xff;
		if (0 != i_65_) {
		    int i_66_ = (((i_65_ * (i & 0xff00) & 0xff0000)
				  + (i_65_ * (i & 0xff00ff) & ~0xff00ff))
				 >> 8);
		    i_65_ = 256 - i_65_;
		    int i_67_ = is_56_[i_58_];
		    is_56_[i_58_++]
			= i_66_ + (((i_65_ * (i_67_ & 0xff00) & 0xff0000)
				    + (i_65_ * (i_67_ & 0xff00ff) & ~0xff00ff))
				   >> 8);
		} else
		    i_58_++;
	    }
	    i_58_ += i_61_;
	    i_57_ += i_62_;
	}
    }
    
    Class171_Sub5(Class185_Sub2 class185_sub2, Class16 class16,
		  Class169_Sub2[] class169_sub2s, int[] is, int[] is_68_) {
	super(class185_sub2, class16);
	aClass185_Sub2_9959 = class185_sub2;
	aClass185_Sub2_9959 = class185_sub2;
	anIntArray9956 = is;
	anIntArray9958 = is_68_;
	aByteArrayArray9955 = new byte[class169_sub2s.length][];
	anIntArray9957 = new int[class169_sub2s.length];
	anIntArray9954 = new int[class169_sub2s.length];
	for (int i = 0; i < class169_sub2s.length; i++) {
	    Class169_Sub2 class169_sub2 = class169_sub2s[i];
	    if (class169_sub2.aByteArray9791 != null)
		aByteArrayArray9955[i] = class169_sub2.aByteArray9791;
	    else {
		byte[] is_69_ = class169_sub2.aByteArray9796;
		byte[] is_70_
		    = aByteArrayArray9955[i] = new byte[is_69_.length];
		for (int i_71_ = 0; i_71_ < is_69_.length; i_71_++)
		    is_70_[i_71_] = (byte) (is_69_[i_71_] == 0 ? 0 : -1);
	    }
	    anIntArray9957[i] = class169_sub2.anInt9792;
	    anIntArray9954[i] = class169_sub2.anInt9790;
	}
    }
    
    void method2877(char c, int i, int i_72_, int i_73_, boolean bool,
		    Class145 class145, int i_74_, int i_75_) {
	if (null != aClass185_Sub2_9959.anIntArray9338) {
	    if (class145 == null)
		method2860(c, i, i_72_, i_73_, bool);
	    else {
		i += anIntArray9954[c];
		i_72_ += anIntArray9957[c];
		int i_76_ = anIntArray9956[c];
		int i_77_ = anIntArray9958[c];
		int i_78_ = 356365251 * aClass185_Sub2_9959.anInt9356;
		int i_79_ = i + i_72_ * i_78_;
		int i_80_ = i_78_ - i_76_;
		int i_81_ = 0;
		int i_82_ = 0;
		if (i_72_ < aClass185_Sub2_9959.anInt9344 * 9823353) {
		    int i_83_
			= 9823353 * aClass185_Sub2_9959.anInt9344 - i_72_;
		    i_77_ -= i_83_;
		    i_72_ = aClass185_Sub2_9959.anInt9344 * 9823353;
		    i_82_ += i_83_ * i_76_;
		    i_79_ += i_78_ * i_83_;
		}
		if (i_77_ + i_72_ > aClass185_Sub2_9959.anInt9345 * 639238427)
		    i_77_ -= (i_77_ + i_72_
			      - 639238427 * aClass185_Sub2_9959.anInt9345);
		if (i < 1709859847 * aClass185_Sub2_9959.anInt9365) {
		    int i_84_ = aClass185_Sub2_9959.anInt9365 * 1709859847 - i;
		    i_76_ -= i_84_;
		    i = aClass185_Sub2_9959.anInt9365 * 1709859847;
		    i_82_ += i_84_;
		    i_79_ += i_84_;
		    i_81_ += i_84_;
		    i_80_ += i_84_;
		}
		if (i + i_76_ > -1807368365 * aClass185_Sub2_9959.anInt9343) {
		    int i_85_
			= (i + i_76_
			   - aClass185_Sub2_9959.anInt9343 * -1807368365);
		    i_76_ -= i_85_;
		    i_81_ += i_85_;
		    i_80_ += i_85_;
		}
		if (i_76_ > 0 && i_77_ > 0)
		    method15607(aByteArrayArray9955[c],
				aClass185_Sub2_9959.anIntArray9338, i_73_,
				i_82_, i_79_, i_76_, i_77_, i_80_, i_81_, i,
				i_72_, anIntArray9956[c], class145, i_74_,
				i_75_);
	    }
	}
    }
    
    void method2846(char c, int i, int i_86_, int i_87_, boolean bool) {
	if (null != aClass185_Sub2_9959.anIntArray9338) {
	    i += anIntArray9954[c];
	    i_86_ += anIntArray9957[c];
	    int i_88_ = anIntArray9956[c];
	    int i_89_ = anIntArray9958[c];
	    int i_90_ = 356365251 * aClass185_Sub2_9959.anInt9356;
	    int i_91_ = i + i_86_ * i_90_;
	    int i_92_ = i_90_ - i_88_;
	    int i_93_ = 0;
	    int i_94_ = 0;
	    if (i_86_ < 9823353 * aClass185_Sub2_9959.anInt9344) {
		int i_95_ = aClass185_Sub2_9959.anInt9344 * 9823353 - i_86_;
		i_89_ -= i_95_;
		i_86_ = aClass185_Sub2_9959.anInt9344 * 9823353;
		i_94_ += i_95_ * i_88_;
		i_91_ += i_90_ * i_95_;
	    }
	    if (i_89_ + i_86_ > aClass185_Sub2_9959.anInt9345 * 639238427)
		i_89_ -= (i_89_ + i_86_
			  - 639238427 * aClass185_Sub2_9959.anInt9345);
	    if (i < 1709859847 * aClass185_Sub2_9959.anInt9365) {
		int i_96_ = 1709859847 * aClass185_Sub2_9959.anInt9365 - i;
		i_88_ -= i_96_;
		i = aClass185_Sub2_9959.anInt9365 * 1709859847;
		i_94_ += i_96_;
		i_91_ += i_96_;
		i_93_ += i_96_;
		i_92_ += i_96_;
	    }
	    if (i + i_88_ > -1807368365 * aClass185_Sub2_9959.anInt9343) {
		int i_97_
		    = i + i_88_ - aClass185_Sub2_9959.anInt9343 * -1807368365;
		i_88_ -= i_97_;
		i_93_ += i_97_;
		i_92_ += i_97_;
	    }
	    if (i_88_ > 0 && i_89_ > 0)
		method15608(aByteArrayArray9955[c],
			    aClass185_Sub2_9959.anIntArray9338, i_87_, i_94_,
			    i_91_, i_88_, i_89_, i_92_, i_93_);
	}
    }
    
    void method2847(char c, int i, int i_98_, int i_99_, boolean bool,
		    Class145 class145, int i_100_, int i_101_) {
	if (null != aClass185_Sub2_9959.anIntArray9338) {
	    if (class145 == null)
		method2860(c, i, i_98_, i_99_, bool);
	    else {
		i += anIntArray9954[c];
		i_98_ += anIntArray9957[c];
		int i_102_ = anIntArray9956[c];
		int i_103_ = anIntArray9958[c];
		int i_104_ = 356365251 * aClass185_Sub2_9959.anInt9356;
		int i_105_ = i + i_98_ * i_104_;
		int i_106_ = i_104_ - i_102_;
		int i_107_ = 0;
		int i_108_ = 0;
		if (i_98_ < aClass185_Sub2_9959.anInt9344 * 9823353) {
		    int i_109_
			= 9823353 * aClass185_Sub2_9959.anInt9344 - i_98_;
		    i_103_ -= i_109_;
		    i_98_ = aClass185_Sub2_9959.anInt9344 * 9823353;
		    i_108_ += i_109_ * i_102_;
		    i_105_ += i_104_ * i_109_;
		}
		if (i_103_ + i_98_ > aClass185_Sub2_9959.anInt9345 * 639238427)
		    i_103_ -= (i_103_ + i_98_
			       - 639238427 * aClass185_Sub2_9959.anInt9345);
		if (i < 1709859847 * aClass185_Sub2_9959.anInt9365) {
		    int i_110_
			= aClass185_Sub2_9959.anInt9365 * 1709859847 - i;
		    i_102_ -= i_110_;
		    i = aClass185_Sub2_9959.anInt9365 * 1709859847;
		    i_108_ += i_110_;
		    i_105_ += i_110_;
		    i_107_ += i_110_;
		    i_106_ += i_110_;
		}
		if (i + i_102_ > -1807368365 * aClass185_Sub2_9959.anInt9343) {
		    int i_111_
			= (i + i_102_
			   - aClass185_Sub2_9959.anInt9343 * -1807368365);
		    i_102_ -= i_111_;
		    i_107_ += i_111_;
		    i_106_ += i_111_;
		}
		if (i_102_ > 0 && i_103_ > 0)
		    method15607(aByteArrayArray9955[c],
				aClass185_Sub2_9959.anIntArray9338, i_99_,
				i_108_, i_105_, i_102_, i_103_, i_106_, i_107_,
				i, i_98_, anIntArray9956[c], class145, i_100_,
				i_101_);
	    }
	}
    }
    
    void method2848(char c, int i, int i_112_, int i_113_, boolean bool,
		    Class145 class145, int i_114_, int i_115_) {
	if (null != aClass185_Sub2_9959.anIntArray9338) {
	    if (class145 == null)
		method2860(c, i, i_112_, i_113_, bool);
	    else {
		i += anIntArray9954[c];
		i_112_ += anIntArray9957[c];
		int i_116_ = anIntArray9956[c];
		int i_117_ = anIntArray9958[c];
		int i_118_ = 356365251 * aClass185_Sub2_9959.anInt9356;
		int i_119_ = i + i_112_ * i_118_;
		int i_120_ = i_118_ - i_116_;
		int i_121_ = 0;
		int i_122_ = 0;
		if (i_112_ < aClass185_Sub2_9959.anInt9344 * 9823353) {
		    int i_123_
			= 9823353 * aClass185_Sub2_9959.anInt9344 - i_112_;
		    i_117_ -= i_123_;
		    i_112_ = aClass185_Sub2_9959.anInt9344 * 9823353;
		    i_122_ += i_123_ * i_116_;
		    i_119_ += i_118_ * i_123_;
		}
		if (i_117_ + i_112_
		    > aClass185_Sub2_9959.anInt9345 * 639238427)
		    i_117_ -= (i_117_ + i_112_
			       - 639238427 * aClass185_Sub2_9959.anInt9345);
		if (i < 1709859847 * aClass185_Sub2_9959.anInt9365) {
		    int i_124_
			= aClass185_Sub2_9959.anInt9365 * 1709859847 - i;
		    i_116_ -= i_124_;
		    i = aClass185_Sub2_9959.anInt9365 * 1709859847;
		    i_122_ += i_124_;
		    i_119_ += i_124_;
		    i_121_ += i_124_;
		    i_120_ += i_124_;
		}
		if (i + i_116_ > -1807368365 * aClass185_Sub2_9959.anInt9343) {
		    int i_125_
			= (i + i_116_
			   - aClass185_Sub2_9959.anInt9343 * -1807368365);
		    i_116_ -= i_125_;
		    i_121_ += i_125_;
		    i_120_ += i_125_;
		}
		if (i_116_ > 0 && i_117_ > 0)
		    method15607(aByteArrayArray9955[c],
				aClass185_Sub2_9959.anIntArray9338, i_113_,
				i_122_, i_119_, i_116_, i_117_, i_120_, i_121_,
				i, i_112_, anIntArray9956[c], class145, i_114_,
				i_115_);
	    }
	}
    }
    
    void method15609(byte[] is, int[] is_126_, int i, int i_127_, int i_128_,
		     int i_129_, int i_130_, int i_131_, int i_132_) {
	for (int i_133_ = -i_130_; i_133_ < 0; i_133_++) {
	    for (int i_134_ = -i_129_; i_134_ < 0; i_134_++) {
		int i_135_ = is[i_127_++] & 0xff;
		if (0 != i_135_) {
		    int i_136_ = (((i_135_ * (i & 0xff00) & 0xff0000)
				   + (i_135_ * (i & 0xff00ff) & ~0xff00ff))
				  >> 8);
		    i_135_ = 256 - i_135_;
		    int i_137_ = is_126_[i_128_];
		    is_126_[i_128_++]
			= i_136_ + (((i_135_ * (i_137_ & 0xff00) & 0xff0000)
				     + (i_135_ * (i_137_ & 0xff00ff)
					& ~0xff00ff))
				    >> 8);
		} else
		    i_128_++;
	    }
	    i_128_ += i_131_;
	    i_127_ += i_132_;
	}
    }
    
    void method15610(byte[] is, int[] is_138_, int i, int i_139_, int i_140_,
		     int i_141_, int i_142_, int i_143_, int i_144_) {
	for (int i_145_ = -i_142_; i_145_ < 0; i_145_++) {
	    for (int i_146_ = -i_141_; i_146_ < 0; i_146_++) {
		int i_147_ = is[i_139_++] & 0xff;
		if (0 != i_147_) {
		    int i_148_ = (((i_147_ * (i & 0xff00) & 0xff0000)
				   + (i_147_ * (i & 0xff00ff) & ~0xff00ff))
				  >> 8);
		    i_147_ = 256 - i_147_;
		    int i_149_ = is_138_[i_140_];
		    is_138_[i_140_++]
			= i_148_ + (((i_147_ * (i_149_ & 0xff00) & 0xff0000)
				     + (i_147_ * (i_149_ & 0xff00ff)
					& ~0xff00ff))
				    >> 8);
		} else
		    i_140_++;
	    }
	    i_140_ += i_143_;
	    i_139_ += i_144_;
	}
    }
    
    void method15611(byte[] is, int[] is_150_, int i, int i_151_, int i_152_,
		     int i_153_, int i_154_, int i_155_, int i_156_,
		     int i_157_, int i_158_, int i_159_, Class145 class145,
		     int i_160_, int i_161_) {
	Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
	int[] is_162_ = class145_sub2.anIntArray9797;
	int[] is_163_ = class145_sub2.anIntArray9798;
	int i_164_ = i_157_ - aClass185_Sub2_9959.anInt9365 * 1709859847;
	int i_165_ = i_158_;
	if (i_161_ > i_165_) {
	    i_165_ = i_161_;
	    i_152_ += aClass185_Sub2_9959.anInt9356 * 356365251 * (i_161_
								   - i_158_);
	    i_151_ += (i_161_ - i_158_) * i_159_;
	}
	int i_166_ = (i_161_ + is_162_.length < i_154_ + i_158_
		      ? is_162_.length + i_161_ : i_158_ + i_154_);
	for (int i_167_ = i_165_; i_167_ < i_166_; i_167_++) {
	    int i_168_ = i_160_ + is_162_[i_167_ - i_161_];
	    int i_169_ = is_163_[i_167_ - i_161_];
	    int i_170_ = i_153_;
	    if (i_164_ > i_168_) {
		int i_171_ = i_164_ - i_168_;
		if (i_171_ >= i_169_) {
		    i_151_ += i_153_ + i_156_;
		    i_152_ += i_155_ + i_153_;
		    continue;
		}
		i_169_ -= i_171_;
	    } else {
		int i_172_ = i_168_ - i_164_;
		if (i_172_ >= i_153_) {
		    i_151_ += i_156_ + i_153_;
		    i_152_ += i_153_ + i_155_;
		    continue;
		}
		i_151_ += i_172_;
		i_170_ -= i_172_;
		i_152_ += i_172_;
	    }
	    int i_173_ = 0;
	    if (i_170_ < i_169_)
		i_169_ = i_170_;
	    else
		i_173_ = i_170_ - i_169_;
	    for (int i_174_ = -i_169_; i_174_ < 0; i_174_++) {
		int i_175_ = is[i_151_++] & 0xff;
		if (i_175_ != 0) {
		    int i_176_ = (((i_175_ * (i & 0xff00) & 0xff0000)
				   + ((i & 0xff00ff) * i_175_ & ~0xff00ff))
				  >> 8);
		    i_175_ = 256 - i_175_;
		    int i_177_ = is_150_[i_152_];
		    is_150_[i_152_++]
			= ((((i_177_ & 0xff00) * i_175_ & 0xff0000)
			    + ((i_177_ & 0xff00ff) * i_175_ & ~0xff00ff))
			   >> 8) + i_176_;
		} else
		    i_152_++;
	    }
	    i_151_ += i_173_ + i_156_;
	    i_152_ += i_173_ + i_155_;
	}
    }
    
    void method15612(byte[] is, int[] is_178_, int i, int i_179_, int i_180_,
		     int i_181_, int i_182_, int i_183_, int i_184_,
		     int i_185_, int i_186_, int i_187_, Class145 class145,
		     int i_188_, int i_189_) {
	Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
	int[] is_190_ = class145_sub2.anIntArray9797;
	int[] is_191_ = class145_sub2.anIntArray9798;
	int i_192_ = i_185_ - aClass185_Sub2_9959.anInt9365 * 1709859847;
	int i_193_ = i_186_;
	if (i_189_ > i_193_) {
	    i_193_ = i_189_;
	    i_180_ += aClass185_Sub2_9959.anInt9356 * 356365251 * (i_189_
								   - i_186_);
	    i_179_ += (i_189_ - i_186_) * i_187_;
	}
	int i_194_ = (i_189_ + is_190_.length < i_182_ + i_186_
		      ? is_190_.length + i_189_ : i_186_ + i_182_);
	for (int i_195_ = i_193_; i_195_ < i_194_; i_195_++) {
	    int i_196_ = i_188_ + is_190_[i_195_ - i_189_];
	    int i_197_ = is_191_[i_195_ - i_189_];
	    int i_198_ = i_181_;
	    if (i_192_ > i_196_) {
		int i_199_ = i_192_ - i_196_;
		if (i_199_ >= i_197_) {
		    i_179_ += i_181_ + i_184_;
		    i_180_ += i_183_ + i_181_;
		    continue;
		}
		i_197_ -= i_199_;
	    } else {
		int i_200_ = i_196_ - i_192_;
		if (i_200_ >= i_181_) {
		    i_179_ += i_184_ + i_181_;
		    i_180_ += i_181_ + i_183_;
		    continue;
		}
		i_179_ += i_200_;
		i_198_ -= i_200_;
		i_180_ += i_200_;
	    }
	    int i_201_ = 0;
	    if (i_198_ < i_197_)
		i_197_ = i_198_;
	    else
		i_201_ = i_198_ - i_197_;
	    for (int i_202_ = -i_197_; i_202_ < 0; i_202_++) {
		int i_203_ = is[i_179_++] & 0xff;
		if (i_203_ != 0) {
		    int i_204_ = (((i_203_ * (i & 0xff00) & 0xff0000)
				   + ((i & 0xff00ff) * i_203_ & ~0xff00ff))
				  >> 8);
		    i_203_ = 256 - i_203_;
		    int i_205_ = is_178_[i_180_];
		    is_178_[i_180_++]
			= ((((i_205_ & 0xff00) * i_203_ & 0xff0000)
			    + ((i_205_ & 0xff00ff) * i_203_ & ~0xff00ff))
			   >> 8) + i_204_;
		} else
		    i_180_++;
	    }
	    i_179_ += i_201_ + i_184_;
	    i_180_ += i_201_ + i_183_;
	}
    }
    
    void method15613(byte[] is, int[] is_206_, int i, int i_207_, int i_208_,
		     int i_209_, int i_210_, int i_211_, int i_212_,
		     int i_213_, int i_214_, int i_215_, Class145 class145,
		     int i_216_, int i_217_) {
	Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
	int[] is_218_ = class145_sub2.anIntArray9797;
	int[] is_219_ = class145_sub2.anIntArray9798;
	int i_220_ = i_213_ - aClass185_Sub2_9959.anInt9365 * 1709859847;
	int i_221_ = i_214_;
	if (i_217_ > i_221_) {
	    i_221_ = i_217_;
	    i_208_ += aClass185_Sub2_9959.anInt9356 * 356365251 * (i_217_
								   - i_214_);
	    i_207_ += (i_217_ - i_214_) * i_215_;
	}
	int i_222_ = (i_217_ + is_218_.length < i_210_ + i_214_
		      ? is_218_.length + i_217_ : i_214_ + i_210_);
	for (int i_223_ = i_221_; i_223_ < i_222_; i_223_++) {
	    int i_224_ = i_216_ + is_218_[i_223_ - i_217_];
	    int i_225_ = is_219_[i_223_ - i_217_];
	    int i_226_ = i_209_;
	    if (i_220_ > i_224_) {
		int i_227_ = i_220_ - i_224_;
		if (i_227_ >= i_225_) {
		    i_207_ += i_209_ + i_212_;
		    i_208_ += i_211_ + i_209_;
		    continue;
		}
		i_225_ -= i_227_;
	    } else {
		int i_228_ = i_224_ - i_220_;
		if (i_228_ >= i_209_) {
		    i_207_ += i_212_ + i_209_;
		    i_208_ += i_209_ + i_211_;
		    continue;
		}
		i_207_ += i_228_;
		i_226_ -= i_228_;
		i_208_ += i_228_;
	    }
	    int i_229_ = 0;
	    if (i_226_ < i_225_)
		i_225_ = i_226_;
	    else
		i_229_ = i_226_ - i_225_;
	    for (int i_230_ = -i_225_; i_230_ < 0; i_230_++) {
		int i_231_ = is[i_207_++] & 0xff;
		if (i_231_ != 0) {
		    int i_232_ = (((i_231_ * (i & 0xff00) & 0xff0000)
				   + ((i & 0xff00ff) * i_231_ & ~0xff00ff))
				  >> 8);
		    i_231_ = 256 - i_231_;
		    int i_233_ = is_206_[i_208_];
		    is_206_[i_208_++]
			= ((((i_233_ & 0xff00) * i_231_ & 0xff0000)
			    + ((i_233_ & 0xff00ff) * i_231_ & ~0xff00ff))
			   >> 8) + i_232_;
		} else
		    i_208_++;
	    }
	    i_207_ += i_229_ + i_212_;
	    i_208_ += i_229_ + i_211_;
	}
    }
    
    static final void method15614(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	long l
	    = (long) class669.anIntArray8595[2088438307 * class669.anInt8600];
	long l_234_ = (long) (class669.anIntArray8595
			      [1 + 2088438307 * class669.anInt8600]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (int) (l + l_234_ * l / 100L);
    }
}
