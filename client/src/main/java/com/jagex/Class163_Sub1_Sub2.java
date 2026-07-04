/* Class163_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class163_Sub1_Sub2 extends Class163_Sub1
{
    byte[] aByteArray11407;
    int[] anIntArray11408;
    
    void method2687(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_,
		    int i_5_, int i_6_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (i_1_ > 0 && i_2_ > 0) {
	    int[] is = aClass185_Sub2_9016.anIntArray9338;
	    if (is != null) {
		int i_7_ = 0;
		int i_8_ = 0;
		int i_9_ = aClass185_Sub2_9016.anInt9356 * 356365251;
		int i_10_ = anInt8987 + anInt8985 + anInt8992;
		int i_11_ = anInt8989 + anInt9002 + anInt8990;
		int i_12_ = (i_10_ << 16) / i_1_;
		int i_13_ = (i_11_ << 16) / i_2_;
		if (anInt8987 > 0) {
		    int i_14_ = ((anInt8987 << 16) + i_12_ - 1) / i_12_;
		    i += i_14_;
		    i_7_ += i_14_ * i_12_ - (anInt8987 << 16);
		}
		if (anInt8989 > 0) {
		    int i_15_ = ((anInt8989 << 16) + i_13_ - 1) / i_13_;
		    i_0_ += i_15_;
		    i_8_ += i_15_ * i_13_ - (anInt8989 << 16);
		}
		if (anInt8985 < i_10_)
		    i_1_ = ((anInt8985 << 16) - i_7_ + i_12_ - 1) / i_12_;
		if (anInt9002 < i_11_)
		    i_2_ = ((anInt9002 << 16) - i_8_ + i_13_ - 1) / i_13_;
		int i_16_ = i + i_0_ * i_9_;
		int i_17_ = i_9_ - i_1_;
		if (i_0_ + i_2_ > aClass185_Sub2_9016.anInt9345 * 639238427)
		    i_2_ -= (i_0_ + i_2_
			     - aClass185_Sub2_9016.anInt9345 * 639238427);
		if (i_0_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		    int i_18_ = aClass185_Sub2_9016.anInt9344 * 9823353 - i_0_;
		    i_2_ -= i_18_;
		    i_16_ += i_18_ * i_9_;
		    i_8_ += i_13_ * i_18_;
		}
		if (i + i_1_ > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		    int i_19_
			= (i + i_1_
			   - aClass185_Sub2_9016.anInt9343 * -1807368365);
		    i_1_ -= i_19_;
		    i_17_ += i_19_;
		}
		if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		    int i_20_ = aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		    i_1_ -= i_20_;
		    i_16_ += i_20_;
		    i_7_ += i_12_ * i_20_;
		    i_17_ += i_20_;
		}
		if (i_5_ == 0) {
		    if (i_3_ == 1) {
			int i_21_ = i_7_;
			for (int i_22_ = -i_2_; i_22_ < 0; i_22_++) {
			    int i_23_ = (i_8_ >> 16) * anInt8985;
			    for (int i_24_ = -i_1_; i_24_ < 0; i_24_++) {
				is[i_16_++]
				    = (anIntArray11408
				       [(aByteArray11407[(i_7_ >> 16) + i_23_]
					 & 0xff)]);
				i_7_ += i_12_;
			    }
			    i_8_ += i_13_;
			    i_7_ = i_21_;
			    i_16_ += i_17_;
			}
		    } else if (i_3_ == 0) {
			int i_25_ = (i_4_ & 0xff0000) >> 16;
			int i_26_ = (i_4_ & 0xff00) >> 8;
			int i_27_ = i_4_ & 0xff;
			int i_28_ = i_7_;
			for (int i_29_ = -i_2_; i_29_ < 0; i_29_++) {
			    int i_30_ = (i_8_ >> 16) * anInt8985;
			    for (int i_31_ = -i_1_; i_31_ < 0; i_31_++) {
				int i_32_
				    = (anIntArray11408
				       [(aByteArray11407[(i_7_ >> 16) + i_30_]
					 & 0xff)]);
				int i_33_
				    = (i_32_ & 0xff0000) * i_25_ & ~0xffffff;
				int i_34_
				    = (i_32_ & 0xff00) * i_26_ & 0xff0000;
				int i_35_ = (i_32_ & 0xff) * i_27_ & 0xff00;
				is[i_16_++] = (i_33_ | i_34_ | i_35_) >>> 8;
				i_7_ += i_12_;
			    }
			    i_8_ += i_13_;
			    i_7_ = i_28_;
			    i_16_ += i_17_;
			}
		    } else if (i_3_ == 3) {
			int i_36_ = i_7_;
			for (int i_37_ = -i_2_; i_37_ < 0; i_37_++) {
			    int i_38_ = (i_8_ >> 16) * anInt8985;
			    for (int i_39_ = -i_1_; i_39_ < 0; i_39_++) {
				byte i_40_
				    = aByteArray11407[(i_7_ >> 16) + i_38_];
				int i_41_
				    = i_40_ > 0 ? anIntArray11408[i_40_] : 0;
				int i_42_ = i_41_ + i_4_;
				int i_43_
				    = (i_41_ & 0xff00ff) + (i_4_ & 0xff00ff);
				int i_44_ = ((i_43_ & 0x1000100)
					     + (i_42_ - i_43_ & 0x10000));
				is[i_16_++]
				    = i_42_ - i_44_ | i_44_ - (i_44_ >>> 8);
				i_7_ += i_12_;
			    }
			    i_8_ += i_13_;
			    i_7_ = i_36_;
			    i_16_ += i_17_;
			}
		    } else if (i_3_ == 2) {
			int i_45_ = i_4_ >>> 24;
			int i_46_ = 256 - i_45_;
			int i_47_ = (i_4_ & 0xff00ff) * i_46_ & ~0xff00ff;
			int i_48_ = (i_4_ & 0xff00) * i_46_ & 0xff0000;
			i_4_ = (i_47_ | i_48_) >>> 8;
			int i_49_ = i_7_;
			for (int i_50_ = -i_2_; i_50_ < 0; i_50_++) {
			    int i_51_ = (i_8_ >> 16) * anInt8985;
			    for (int i_52_ = -i_1_; i_52_ < 0; i_52_++) {
				int i_53_
				    = (anIntArray11408
				       [(aByteArray11407[(i_7_ >> 16) + i_51_]
					 & 0xff)]);
				i_47_ = (i_53_ & 0xff00ff) * i_45_ & ~0xff00ff;
				i_48_ = (i_53_ & 0xff00) * i_45_ & 0xff0000;
				is[i_16_++] = ((i_47_ | i_48_) >>> 8) + i_4_;
				i_7_ += i_12_;
			    }
			    i_8_ += i_13_;
			    i_7_ = i_49_;
			    i_16_ += i_17_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_5_ == 1) {
		    if (i_3_ == 1) {
			int i_54_ = i_7_;
			for (int i_55_ = -i_2_; i_55_ < 0; i_55_++) {
			    int i_56_ = (i_8_ >> 16) * anInt8985;
			    for (int i_57_ = -i_1_; i_57_ < 0; i_57_++) {
				int i_58_
				    = aByteArray11407[(i_7_ >> 16) + i_56_];
				if (i_58_ != 0)
				    is[i_16_++]
					= anIntArray11408[i_58_ & 0xff];
				else
				    i_16_++;
				i_7_ += i_12_;
			    }
			    i_8_ += i_13_;
			    i_7_ = i_54_;
			    i_16_ += i_17_;
			}
		    } else if (i_3_ == 0) {
			int i_59_ = i_7_;
			if ((i_4_ & 0xffffff) == 16777215) {
			    int i_60_ = i_4_ >>> 24;
			    int i_61_ = 256 - i_60_;
			    for (int i_62_ = -i_2_; i_62_ < 0; i_62_++) {
				int i_63_ = (i_8_ >> 16) * anInt8985;
				for (int i_64_ = -i_1_; i_64_ < 0; i_64_++) {
				    int i_65_ = (aByteArray11407
						 [(i_7_ >> 16) + i_63_]);
				    if (i_65_ != 0) {
					int i_66_
					    = anIntArray11408[i_65_ & 0xff];
					int i_67_ = is[i_16_];
					is[i_16_++]
					    = ((((i_66_ & 0xff00ff) * i_60_
						 + (i_67_ & 0xff00ff) * i_61_)
						& ~0xff00ff)
					       + (((i_66_ & 0xff00) * i_60_
						   + (i_67_ & 0xff00) * i_61_)
						  & 0xff0000)) >> 8;
				    } else
					i_16_++;
				    i_7_ += i_12_;
				}
				i_8_ += i_13_;
				i_7_ = i_59_;
				i_16_ += i_17_;
			    }
			} else {
			    int i_68_ = (i_4_ & 0xff0000) >> 16;
			    int i_69_ = (i_4_ & 0xff00) >> 8;
			    int i_70_ = i_4_ & 0xff;
			    int i_71_ = i_4_ >>> 24;
			    int i_72_ = 256 - i_71_;
			    for (int i_73_ = -i_2_; i_73_ < 0; i_73_++) {
				int i_74_ = (i_8_ >> 16) * anInt8985;
				for (int i_75_ = -i_1_; i_75_ < 0; i_75_++) {
				    int i_76_ = (aByteArray11407
						 [(i_7_ >> 16) + i_74_]);
				    if (i_76_ != 0) {
					int i_77_
					    = anIntArray11408[i_76_ & 0xff];
					if (i_71_ != 255) {
					    int i_78_
						= ((i_77_ & 0xff0000) * i_68_
						   & ~0xffffff);
					    int i_79_
						= ((i_77_ & 0xff00) * i_69_
						   & 0xff0000);
					    int i_80_ = ((i_77_ & 0xff) * i_70_
							 & 0xff00);
					    i_77_ = ((i_78_ | i_79_ | i_80_)
						     >>> 8);
					    int i_81_ = is[i_16_];
					    is[i_16_++]
						= ((((i_77_ & 0xff00ff) * i_71_
						     + ((i_81_ & 0xff00ff)
							* i_72_))
						    & ~0xff00ff)
						   + (((i_77_ & 0xff00) * i_71_
						       + ((i_81_ & 0xff00)
							  * i_72_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_82_
						= ((i_77_ & 0xff0000) * i_68_
						   & ~0xffffff);
					    int i_83_
						= ((i_77_ & 0xff00) * i_69_
						   & 0xff0000);
					    int i_84_ = ((i_77_ & 0xff) * i_70_
							 & 0xff00);
					    is[i_16_++] = (i_82_ | i_83_
							   | i_84_) >>> 8;
					}
				    } else
					i_16_++;
				    i_7_ += i_12_;
				}
				i_8_ += i_13_;
				i_7_ = i_59_;
				i_16_ += i_17_;
			    }
			}
		    } else if (i_3_ == 3) {
			int i_85_ = i_7_;
			int i_86_ = i_4_ >>> 24;
			int i_87_ = 256 - i_86_;
			for (int i_88_ = -i_2_; i_88_ < 0; i_88_++) {
			    int i_89_ = (i_8_ >> 16) * anInt8985;
			    for (int i_90_ = -i_1_; i_90_ < 0; i_90_++) {
				byte i_91_
				    = aByteArray11407[(i_7_ >> 16) + i_89_];
				int i_92_
				    = i_91_ > 0 ? anIntArray11408[i_91_] : 0;
				int i_93_ = i_92_ + i_4_;
				int i_94_
				    = (i_92_ & 0xff00ff) + (i_4_ & 0xff00ff);
				int i_95_ = ((i_94_ & 0x1000100)
					     + (i_93_ - i_94_ & 0x10000));
				i_95_ = i_93_ - i_95_ | i_95_ - (i_95_ >>> 8);
				if (i_92_ == 0 && i_86_ != 255) {
				    i_92_ = i_95_;
				    i_95_ = is[i_16_];
				    i_95_ = ((((i_92_ & 0xff00ff) * i_86_
					       + (i_95_ & 0xff00ff) * i_87_)
					      & ~0xff00ff)
					     + (((i_92_ & 0xff00) * i_86_
						 + (i_95_ & 0xff00) * i_87_)
						& 0xff0000)) >> 8;
				}
				is[i_16_++] = i_95_;
				i_7_ += i_12_;
			    }
			    i_8_ += i_13_;
			    i_7_ = i_85_;
			    i_16_ += i_17_;
			}
		    } else if (i_3_ == 2) {
			int i_96_ = i_4_ >>> 24;
			int i_97_ = 256 - i_96_;
			int i_98_ = (i_4_ & 0xff00ff) * i_97_ & ~0xff00ff;
			int i_99_ = (i_4_ & 0xff00) * i_97_ & 0xff0000;
			i_4_ = (i_98_ | i_99_) >>> 8;
			int i_100_ = i_7_;
			for (int i_101_ = -i_2_; i_101_ < 0; i_101_++) {
			    int i_102_ = (i_8_ >> 16) * anInt8985;
			    for (int i_103_ = -i_1_; i_103_ < 0; i_103_++) {
				int i_104_
				    = aByteArray11407[(i_7_ >> 16) + i_102_];
				if (i_104_ != 0) {
				    int i_105_
					= anIntArray11408[i_104_ & 0xff];
				    i_98_ = ((i_105_ & 0xff00ff) * i_96_
					     & ~0xff00ff);
				    i_99_
					= (i_105_ & 0xff00) * i_96_ & 0xff0000;
				    is[i_16_++]
					= ((i_98_ | i_99_) >>> 8) + i_4_;
				} else
				    i_16_++;
				i_7_ += i_12_;
			    }
			    i_8_ += i_13_;
			    i_7_ = i_100_;
			    i_16_ += i_17_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_5_ == 2) {
		    if (i_3_ == 1) {
			int i_106_ = i_7_;
			for (int i_107_ = -i_2_; i_107_ < 0; i_107_++) {
			    int i_108_ = (i_8_ >> 16) * anInt8985;
			    for (int i_109_ = -i_1_; i_109_ < 0; i_109_++) {
				int i_110_
				    = aByteArray11407[(i_7_ >> 16) + i_108_];
				if (i_110_ != 0) {
				    int i_111_
					= anIntArray11408[i_110_ & 0xff];
				    int i_112_ = is[i_16_];
				    int i_113_ = i_111_ + i_112_;
				    int i_114_ = ((i_111_ & 0xff00ff)
						  + (i_112_ & 0xff00ff));
				    i_112_ = ((i_114_ & 0x1000100)
					      + (i_113_ - i_114_ & 0x10000));
				    is[i_16_++]
					= i_113_ - i_112_ | i_112_ - (i_112_
								      >>> 8);
				} else
				    i_16_++;
				i_7_ += i_12_;
			    }
			    i_8_ += i_13_;
			    i_7_ = i_106_;
			    i_16_ += i_17_;
			}
		    } else if (i_3_ == 0) {
			int i_115_ = i_7_;
			int i_116_ = (i_4_ & 0xff0000) >> 16;
			int i_117_ = (i_4_ & 0xff00) >> 8;
			int i_118_ = i_4_ & 0xff;
			for (int i_119_ = -i_2_; i_119_ < 0; i_119_++) {
			    int i_120_ = (i_8_ >> 16) * anInt8985;
			    for (int i_121_ = -i_1_; i_121_ < 0; i_121_++) {
				int i_122_
				    = aByteArray11407[(i_7_ >> 16) + i_120_];
				if (i_122_ != 0) {
				    int i_123_
					= anIntArray11408[i_122_ & 0xff];
				    int i_124_ = ((i_123_ & 0xff0000) * i_116_
						  & ~0xffffff);
				    int i_125_ = ((i_123_ & 0xff00) * i_117_
						  & 0xff0000);
				    int i_126_
					= (i_123_ & 0xff) * i_118_ & 0xff00;
				    i_123_ = (i_124_ | i_125_ | i_126_) >>> 8;
				    int i_127_ = is[i_16_];
				    int i_128_ = i_123_ + i_127_;
				    int i_129_ = ((i_123_ & 0xff00ff)
						  + (i_127_ & 0xff00ff));
				    i_127_ = ((i_129_ & 0x1000100)
					      + (i_128_ - i_129_ & 0x10000));
				    is[i_16_++]
					= i_128_ - i_127_ | i_127_ - (i_127_
								      >>> 8);
				} else
				    i_16_++;
				i_7_ += i_12_;
			    }
			    i_8_ += i_13_;
			    i_7_ = i_115_;
			    i_16_ += i_17_;
			}
		    } else if (i_3_ == 3) {
			int i_130_ = i_7_;
			for (int i_131_ = -i_2_; i_131_ < 0; i_131_++) {
			    int i_132_ = (i_8_ >> 16) * anInt8985;
			    for (int i_133_ = -i_1_; i_133_ < 0; i_133_++) {
				byte i_134_
				    = aByteArray11407[(i_7_ >> 16) + i_132_];
				int i_135_
				    = i_134_ > 0 ? anIntArray11408[i_134_] : 0;
				int i_136_ = i_135_ + i_4_;
				int i_137_
				    = (i_135_ & 0xff00ff) + (i_4_ & 0xff00ff);
				int i_138_ = ((i_137_ & 0x1000100)
					      + (i_136_ - i_137_ & 0x10000));
				i_135_ = i_136_ - i_138_ | i_138_ - (i_138_
								     >>> 8);
				i_138_ = is[i_16_];
				i_136_ = i_135_ + i_138_;
				i_137_ = (i_135_ & 0xff00ff) + (i_138_
								& 0xff00ff);
				i_138_
				    = (i_137_ & 0x1000100) + (i_136_ - i_137_
							      & 0x10000);
				is[i_16_++]
				    = i_136_ - i_138_ | i_138_ - (i_138_
								  >>> 8);
				i_7_ += i_12_;
			    }
			    i_8_ += i_13_;
			    i_7_ = i_130_;
			    i_16_ += i_17_;
			}
		    } else if (i_3_ == 2) {
			int i_139_ = i_4_ >>> 24;
			int i_140_ = 256 - i_139_;
			int i_141_ = (i_4_ & 0xff00ff) * i_140_ & ~0xff00ff;
			int i_142_ = (i_4_ & 0xff00) * i_140_ & 0xff0000;
			i_4_ = (i_141_ | i_142_) >>> 8;
			int i_143_ = i_7_;
			for (int i_144_ = -i_2_; i_144_ < 0; i_144_++) {
			    int i_145_ = (i_8_ >> 16) * anInt8985;
			    for (int i_146_ = -i_1_; i_146_ < 0; i_146_++) {
				int i_147_
				    = aByteArray11407[(i_7_ >> 16) + i_145_];
				if (i_147_ != 0) {
				    int i_148_
					= anIntArray11408[i_147_ & 0xff];
				    i_141_ = ((i_148_ & 0xff00ff) * i_139_
					      & ~0xff00ff);
				    i_142_ = ((i_148_ & 0xff00) * i_139_
					      & 0xff0000);
				    i_148_ = ((i_141_ | i_142_) >>> 8) + i_4_;
				    int i_149_ = is[i_16_];
				    int i_150_ = i_148_ + i_149_;
				    int i_151_ = ((i_148_ & 0xff00ff)
						  + (i_149_ & 0xff00ff));
				    i_149_ = ((i_151_ & 0x1000100)
					      + (i_150_ - i_151_ & 0x10000));
				    is[i_16_++]
					= i_150_ - i_149_ | i_149_ - (i_149_
								      >>> 8);
				} else
				    i_16_++;
				i_7_ += i_12_;
			    }
			    i_8_ += i_13_;
			    i_7_ = i_143_;
			    i_16_ += i_17_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2717(int i, int i_152_, int i_153_, int i_154_,
			   int i_155_, int i_156_) {
	throw new IllegalStateException();
    }
    
    public void method2653(int i, int i_157_, int i_158_, int i_159_, int[] is,
			   int[] is_160_, int i_161_, int i_162_) {
	throw new IllegalStateException();
    }
    
    public Interface22 method2651() {
	throw new IllegalStateException();
    }
    
    public void method2655(int i, int i_163_, int i_164_) {
	throw new IllegalStateException();
    }
    
    Class163_Sub1_Sub2(Class185_Sub2 class185_sub2, byte[] is, int[] is_165_,
		       int i, int i_166_) {
	super(class185_sub2, i, i_166_);
	aByteArray11407 = is;
	anIntArray11408 = is_165_;
    }
    
    public void method2657(int i, int i_167_, int i_168_, int i_169_,
			   int i_170_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    int i_171_ = aClass185_Sub2_9016.anInt9356 * 356365251;
	    i += anInt8987;
	    i_167_ += anInt8989;
	    int i_172_ = i_167_ * i_171_ + i;
	    int i_173_ = 0;
	    int i_174_ = anInt9002;
	    int i_175_ = anInt8985;
	    int i_176_ = i_171_ - i_175_;
	    int i_177_ = 0;
	    if (i_167_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		int i_178_ = aClass185_Sub2_9016.anInt9344 * 9823353 - i_167_;
		i_174_ -= i_178_;
		i_167_ = aClass185_Sub2_9016.anInt9344 * 9823353;
		i_173_ += i_178_ * i_175_;
		i_172_ += i_178_ * i_171_;
	    }
	    if (i_167_ + i_174_ > aClass185_Sub2_9016.anInt9345 * 639238427)
		i_174_ -= (i_167_ + i_174_
			   - aClass185_Sub2_9016.anInt9345 * 639238427);
	    if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		int i_179_ = aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		i_175_ -= i_179_;
		i = aClass185_Sub2_9016.anInt9365 * 1709859847;
		i_173_ += i_179_;
		i_172_ += i_179_;
		i_177_ += i_179_;
		i_176_ += i_179_;
	    }
	    if (i + i_175_ > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		int i_180_
		    = i + i_175_ - aClass185_Sub2_9016.anInt9343 * -1807368365;
		i_175_ -= i_180_;
		i_177_ += i_180_;
		i_176_ += i_180_;
	    }
	    if (i_175_ > 0 && i_174_ > 0) {
		if (i_170_ == 0) {
		    if (i_168_ == 1) {
			for (int i_181_ = -i_174_; i_181_ < 0; i_181_++) {
			    int i_182_ = i_172_ + i_175_ - 3;
			    while (i_172_ < i_182_) {
				is[i_172_++]
				    = (anIntArray11408
				       [aByteArray11407[i_173_++] & 0xff]);
				is[i_172_++]
				    = (anIntArray11408
				       [aByteArray11407[i_173_++] & 0xff]);
				is[i_172_++]
				    = (anIntArray11408
				       [aByteArray11407[i_173_++] & 0xff]);
				is[i_172_++]
				    = (anIntArray11408
				       [aByteArray11407[i_173_++] & 0xff]);
			    }
			    i_182_ += 3;
			    while (i_172_ < i_182_)
				is[i_172_++]
				    = (anIntArray11408
				       [aByteArray11407[i_173_++] & 0xff]);
			    i_172_ += i_176_;
			    i_173_ += i_177_;
			}
		    } else if (i_168_ == 0) {
			int i_183_ = (i_169_ & 0xff0000) >> 16;
			int i_184_ = (i_169_ & 0xff00) >> 8;
			int i_185_ = i_169_ & 0xff;
			for (int i_186_ = -i_174_; i_186_ < 0; i_186_++) {
			    for (int i_187_ = -i_175_; i_187_ < 0; i_187_++) {
				int i_188_
				    = (anIntArray11408
				       [aByteArray11407[i_173_++] & 0xff]);
				int i_189_
				    = (i_188_ & 0xff0000) * i_183_ & ~0xffffff;
				int i_190_
				    = (i_188_ & 0xff00) * i_184_ & 0xff0000;
				int i_191_ = (i_188_ & 0xff) * i_185_ & 0xff00;
				is[i_172_++]
				    = (i_189_ | i_190_ | i_191_) >>> 8;
			    }
			    i_172_ += i_176_;
			    i_173_ += i_177_;
			}
		    } else if (i_168_ == 3) {
			for (int i_192_ = -i_174_; i_192_ < 0; i_192_++) {
			    for (int i_193_ = -i_175_; i_193_ < 0; i_193_++) {
				int i_194_
				    = (anIntArray11408
				       [aByteArray11407[i_173_++] & 0xff]);
				int i_195_ = i_194_ + i_169_;
				int i_196_ = ((i_194_ & 0xff00ff)
					      + (i_169_ & 0xff00ff));
				int i_197_ = ((i_196_ & 0x1000100)
					      + (i_195_ - i_196_ & 0x10000));
				is[i_172_++]
				    = i_195_ - i_197_ | i_197_ - (i_197_
								  >>> 8);
			    }
			    i_172_ += i_176_;
			    i_173_ += i_177_;
			}
		    } else if (i_168_ == 2) {
			int i_198_ = i_169_ >>> 24;
			int i_199_ = 256 - i_198_;
			int i_200_ = (i_169_ & 0xff00ff) * i_199_ & ~0xff00ff;
			int i_201_ = (i_169_ & 0xff00) * i_199_ & 0xff0000;
			i_169_ = (i_200_ | i_201_) >>> 8;
			for (int i_202_ = -i_174_; i_202_ < 0; i_202_++) {
			    for (int i_203_ = -i_175_; i_203_ < 0; i_203_++) {
				int i_204_
				    = (anIntArray11408
				       [aByteArray11407[i_173_++] & 0xff]);
				i_200_
				    = (i_204_ & 0xff00ff) * i_198_ & ~0xff00ff;
				i_201_ = (i_204_ & 0xff00) * i_198_ & 0xff0000;
				is[i_172_++]
				    = ((i_200_ | i_201_) >>> 8) + i_169_;
			    }
			    i_172_ += i_176_;
			    i_173_ += i_177_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_170_ == 1) {
		    if (i_168_ == 1) {
			for (int i_205_ = -i_174_; i_205_ < 0; i_205_++) {
			    for (int i_206_ = -i_175_; i_206_ < 0; i_206_++) {
				int i_207_ = aByteArray11407[i_173_++];
				if (i_207_ != 0) {
				    int i_208_
					= (anIntArray11408[i_207_ & 0xff]
					   | ~0xffffff);
				    int i_209_ = 255;
				    int i_210_ = 0;
				    int i_211_ = is[i_172_];
				    is[i_172_++]
					= (((((i_208_ & 0xff00ff) * i_209_
					      + (i_211_ & 0xff00ff) * i_210_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_208_ & ~0xff00ff) >>> 8)
						* i_209_)
					       + (((i_211_ & ~0xff00ff) >>> 8)
						  * i_210_))
					      & ~0xff00ff));
				} else
				    i_172_++;
			    }
			    i_172_ += i_176_;
			    i_173_ += i_177_;
			}
		    } else if (i_168_ == 0) {
			if ((i_169_ & 0xffffff) == 16777215) {
			    int i_212_ = i_169_ >>> 24;
			    int i_213_ = 256 - i_212_;
			    for (int i_214_ = -i_174_; i_214_ < 0; i_214_++) {
				for (int i_215_ = -i_175_; i_215_ < 0;
				     i_215_++) {
				    int i_216_ = aByteArray11407[i_173_++];
				    if (i_216_ != 0) {
					int i_217_
					    = anIntArray11408[i_216_ & 0xff];
					int i_218_ = is[i_172_];
					is[i_172_++]
					    = ((((i_217_ & 0xff00ff) * i_212_
						 + ((i_218_ & 0xff00ff)
						    * i_213_))
						& ~0xff00ff)
					       + (((i_217_ & 0xff00) * i_212_
						   + ((i_218_ & 0xff00)
						      * i_213_))
						  & 0xff0000)) >> 8;
				    } else
					i_172_++;
				}
				i_172_ += i_176_;
				i_173_ += i_177_;
			    }
			} else {
			    int i_219_ = (i_169_ & 0xff0000) >> 16;
			    int i_220_ = (i_169_ & 0xff00) >> 8;
			    int i_221_ = i_169_ & 0xff;
			    int i_222_ = i_169_ >>> 24;
			    int i_223_ = 256 - i_222_;
			    for (int i_224_ = -i_174_; i_224_ < 0; i_224_++) {
				for (int i_225_ = -i_175_; i_225_ < 0;
				     i_225_++) {
				    int i_226_ = aByteArray11407[i_173_++];
				    if (i_226_ != 0) {
					int i_227_
					    = anIntArray11408[i_226_ & 0xff];
					if (i_222_ != 255) {
					    int i_228_
						= ((i_227_ & 0xff0000) * i_219_
						   & ~0xffffff);
					    int i_229_
						= ((i_227_ & 0xff00) * i_220_
						   & 0xff0000);
					    int i_230_
						= ((i_227_ & 0xff) * i_221_
						   & 0xff00);
					    i_227_ = (i_228_ | i_229_
						      | i_230_) >>> 8;
					    int i_231_ = is[i_172_];
					    is[i_172_++]
						= (((((i_227_ & 0xff00ff)
						      * i_222_)
						     + ((i_231_ & 0xff00ff)
							* i_223_))
						    & ~0xff00ff)
						   + ((((i_227_ & 0xff00)
							* i_222_)
						       + ((i_231_ & 0xff00)
							  * i_223_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_232_
						= ((i_227_ & 0xff0000) * i_219_
						   & ~0xffffff);
					    int i_233_
						= ((i_227_ & 0xff00) * i_220_
						   & 0xff0000);
					    int i_234_
						= ((i_227_ & 0xff) * i_221_
						   & 0xff00);
					    is[i_172_++] = (i_232_ | i_233_
							    | i_234_) >>> 8;
					}
				    } else
					i_172_++;
				}
				i_172_ += i_176_;
				i_173_ += i_177_;
			    }
			}
		    } else if (i_168_ == 3) {
			int i_235_ = i_169_ >>> 24;
			int i_236_ = 256 - i_235_;
			for (int i_237_ = -i_174_; i_237_ < 0; i_237_++) {
			    for (int i_238_ = -i_175_; i_238_ < 0; i_238_++) {
				byte i_239_ = aByteArray11407[i_173_++];
				int i_240_
				    = i_239_ > 0 ? anIntArray11408[i_239_] : 0;
				int i_241_ = i_240_ + i_169_;
				int i_242_ = ((i_240_ & 0xff00ff)
					      + (i_169_ & 0xff00ff));
				int i_243_ = ((i_242_ & 0x1000100)
					      + (i_241_ - i_242_ & 0x10000));
				i_243_ = i_241_ - i_243_ | i_243_ - (i_243_
								     >>> 8);
				if (i_240_ == 0 && i_235_ != 255) {
				    i_240_ = i_243_;
				    i_243_ = is[i_172_];
				    i_243_ = ((((i_240_ & 0xff00ff) * i_235_
						+ (i_243_ & 0xff00ff) * i_236_)
					       & ~0xff00ff)
					      + (((i_240_ & 0xff00) * i_235_
						  + (i_243_ & 0xff00) * i_236_)
						 & 0xff0000)) >> 8;
				}
				is[i_172_++] = i_243_;
			    }
			    i_172_ += i_176_;
			    i_173_ += i_177_;
			}
		    } else if (i_168_ == 2) {
			int i_244_ = i_169_ >>> 24;
			int i_245_ = 256 - i_244_;
			int i_246_ = (i_169_ & 0xff00ff) * i_245_ & ~0xff00ff;
			int i_247_ = (i_169_ & 0xff00) * i_245_ & 0xff0000;
			i_169_ = (i_246_ | i_247_) >>> 8;
			for (int i_248_ = -i_174_; i_248_ < 0; i_248_++) {
			    for (int i_249_ = -i_175_; i_249_ < 0; i_249_++) {
				int i_250_ = aByteArray11407[i_173_++];
				if (i_250_ != 0) {
				    int i_251_
					= anIntArray11408[i_250_ & 0xff];
				    i_246_ = ((i_251_ & 0xff00ff) * i_244_
					      & ~0xff00ff);
				    i_247_ = ((i_251_ & 0xff00) * i_244_
					      & 0xff0000);
				    is[i_172_++]
					= ((i_246_ | i_247_) >>> 8) + i_169_;
				} else
				    i_172_++;
			    }
			    i_172_ += i_176_;
			    i_173_ += i_177_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_170_ == 2) {
		    if (i_168_ == 1) {
			for (int i_252_ = -i_174_; i_252_ < 0; i_252_++) {
			    for (int i_253_ = -i_175_; i_253_ < 0; i_253_++) {
				int i_254_ = aByteArray11407[i_173_++];
				if (i_254_ != 0) {
				    int i_255_
					= anIntArray11408[i_254_ & 0xff];
				    int i_256_ = is[i_172_];
				    int i_257_ = i_255_ + i_256_;
				    int i_258_ = ((i_255_ & 0xff00ff)
						  + (i_256_ & 0xff00ff));
				    i_256_ = ((i_258_ & 0x1000100)
					      + (i_257_ - i_258_ & 0x10000));
				    is[i_172_++]
					= i_257_ - i_256_ | i_256_ - (i_256_
								      >>> 8);
				} else
				    i_172_++;
			    }
			    i_172_ += i_176_;
			    i_173_ += i_177_;
			}
		    } else if (i_168_ == 0) {
			int i_259_ = (i_169_ & 0xff0000) >> 16;
			int i_260_ = (i_169_ & 0xff00) >> 8;
			int i_261_ = i_169_ & 0xff;
			for (int i_262_ = -i_174_; i_262_ < 0; i_262_++) {
			    for (int i_263_ = -i_175_; i_263_ < 0; i_263_++) {
				int i_264_ = aByteArray11407[i_173_++];
				if (i_264_ != 0) {
				    int i_265_
					= anIntArray11408[i_264_ & 0xff];
				    int i_266_ = ((i_265_ & 0xff0000) * i_259_
						  & ~0xffffff);
				    int i_267_ = ((i_265_ & 0xff00) * i_260_
						  & 0xff0000);
				    int i_268_
					= (i_265_ & 0xff) * i_261_ & 0xff00;
				    i_265_ = (i_266_ | i_267_ | i_268_) >>> 8;
				    int i_269_ = is[i_172_];
				    int i_270_ = i_265_ + i_269_;
				    int i_271_ = ((i_265_ & 0xff00ff)
						  + (i_269_ & 0xff00ff));
				    i_269_ = ((i_271_ & 0x1000100)
					      + (i_270_ - i_271_ & 0x10000));
				    is[i_172_++]
					= i_270_ - i_269_ | i_269_ - (i_269_
								      >>> 8);
				} else
				    i_172_++;
			    }
			    i_172_ += i_176_;
			    i_173_ += i_177_;
			}
		    } else if (i_168_ == 3) {
			for (int i_272_ = -i_174_; i_272_ < 0; i_272_++) {
			    for (int i_273_ = -i_175_; i_273_ < 0; i_273_++) {
				byte i_274_ = aByteArray11407[i_173_++];
				int i_275_
				    = i_274_ > 0 ? anIntArray11408[i_274_] : 0;
				int i_276_ = i_275_ + i_169_;
				int i_277_ = ((i_275_ & 0xff00ff)
					      + (i_169_ & 0xff00ff));
				int i_278_ = ((i_277_ & 0x1000100)
					      + (i_276_ - i_277_ & 0x10000));
				i_275_ = i_276_ - i_278_ | i_278_ - (i_278_
								     >>> 8);
				i_278_ = is[i_172_];
				i_276_ = i_275_ + i_278_;
				i_277_ = (i_275_ & 0xff00ff) + (i_278_
								& 0xff00ff);
				i_278_
				    = (i_277_ & 0x1000100) + (i_276_ - i_277_
							      & 0x10000);
				is[i_172_++]
				    = i_276_ - i_278_ | i_278_ - (i_278_
								  >>> 8);
			    }
			    i_172_ += i_176_;
			    i_173_ += i_177_;
			}
		    } else if (i_168_ == 2) {
			int i_279_ = i_169_ >>> 24;
			int i_280_ = 256 - i_279_;
			int i_281_ = (i_169_ & 0xff00ff) * i_280_ & ~0xff00ff;
			int i_282_ = (i_169_ & 0xff00) * i_280_ & 0xff0000;
			i_169_ = (i_281_ | i_282_) >>> 8;
			for (int i_283_ = -i_174_; i_283_ < 0; i_283_++) {
			    for (int i_284_ = -i_175_; i_284_ < 0; i_284_++) {
				int i_285_ = aByteArray11407[i_173_++];
				if (i_285_ != 0) {
				    int i_286_
					= anIntArray11408[i_285_ & 0xff];
				    i_281_ = ((i_286_ & 0xff00ff) * i_279_
					      & ~0xff00ff);
				    i_282_ = ((i_286_ & 0xff00) * i_279_
					      & 0xff0000);
				    i_286_
					= ((i_281_ | i_282_) >>> 8) + i_169_;
				    int i_287_ = is[i_172_];
				    int i_288_ = i_286_ + i_287_;
				    int i_289_ = ((i_286_ & 0xff00ff)
						  + (i_287_ & 0xff00ff));
				    i_287_ = ((i_289_ & 0x1000100)
					      + (i_288_ - i_289_ & 0x10000));
				    is[i_172_++]
					= i_288_ - i_287_ | i_287_ - (i_287_
								      >>> 8);
				} else
				    i_172_++;
			    }
			    i_172_ += i_176_;
			    i_173_ += i_177_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2691(int i, int i_290_, Class145 class145, int i_291_,
			   int i_292_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    i += anInt8987;
	    i_290_ += anInt8989;
	    int i_293_ = 0;
	    int i_294_ = aClass185_Sub2_9016.anInt9356 * 356365251;
	    int i_295_ = anInt8985;
	    int i_296_ = anInt9002;
	    int i_297_ = i_294_ - i_295_;
	    int i_298_ = 0;
	    int i_299_ = i + i_290_ * i_294_;
	    if (i_290_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		int i_300_ = aClass185_Sub2_9016.anInt9344 * 9823353 - i_290_;
		i_296_ -= i_300_;
		i_290_ = aClass185_Sub2_9016.anInt9344 * 9823353;
		i_293_ += i_300_ * i_295_;
		i_299_ += i_300_ * i_294_;
	    }
	    if (i_290_ + i_296_ > aClass185_Sub2_9016.anInt9345 * 639238427)
		i_296_ -= (i_290_ + i_296_
			   - aClass185_Sub2_9016.anInt9345 * 639238427);
	    if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		int i_301_ = aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		i_295_ -= i_301_;
		i = aClass185_Sub2_9016.anInt9365 * 1709859847;
		i_293_ += i_301_;
		i_299_ += i_301_;
		i_298_ += i_301_;
		i_297_ += i_301_;
	    }
	    if (i + i_295_ > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		int i_302_
		    = i + i_295_ - aClass185_Sub2_9016.anInt9343 * -1807368365;
		i_295_ -= i_302_;
		i_298_ += i_302_;
		i_297_ += i_302_;
	    }
	    if (i_295_ > 0 && i_296_ > 0) {
		Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
		int[] is_303_ = class145_sub2.anIntArray9797;
		int[] is_304_ = class145_sub2.anIntArray9798;
		int i_305_ = i_290_;
		if (i_292_ > i_305_) {
		    i_305_ = i_292_;
		    i_299_ += (i_292_ - i_290_) * i_294_;
		    i_293_ += (i_292_ - i_290_) * anInt8985;
		}
		int i_306_ = (i_292_ + is_303_.length < i_290_ + i_296_
			      ? i_292_ + is_303_.length : i_290_ + i_296_);
		for (int i_307_ = i_305_; i_307_ < i_306_; i_307_++) {
		    int i_308_ = is_303_[i_307_ - i_292_] + i_291_;
		    int i_309_ = is_304_[i_307_ - i_292_];
		    int i_310_ = i_295_;
		    if (i > i_308_) {
			int i_311_ = i - i_308_;
			if (i_311_ >= i_309_) {
			    i_293_ += i_295_ + i_298_;
			    i_299_ += i_295_ + i_297_;
			    continue;
			}
			i_309_ -= i_311_;
		    } else {
			int i_312_ = i_308_ - i;
			if (i_312_ >= i_295_) {
			    i_293_ += i_295_ + i_298_;
			    i_299_ += i_295_ + i_297_;
			    continue;
			}
			i_293_ += i_312_;
			i_310_ -= i_312_;
			i_299_ += i_312_;
		    }
		    int i_313_ = 0;
		    if (i_310_ < i_309_)
			i_309_ = i_310_;
		    else
			i_313_ = i_310_ - i_309_;
		    for (int i_314_ = -i_309_; i_314_ < 0; i_314_++) {
			int i_315_ = aByteArray11407[i_293_++];
			if (i_315_ != 0)
			    is[i_299_++] = anIntArray11408[i_315_ & 0xff];
			else
			    i_299_++;
		    }
		    i_293_ += i_313_ + i_298_;
		    i_299_ += i_313_ + i_297_;
		}
	    }
	}
    }
    
    public void method2729(int i, int i_316_, int i_317_) {
	throw new IllegalStateException();
    }
    
    public void method2684(int i, int i_318_, int i_319_, int i_320_,
			   int i_321_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    int i_322_ = aClass185_Sub2_9016.anInt9356 * 356365251;
	    i += anInt8987;
	    i_318_ += anInt8989;
	    int i_323_ = i_318_ * i_322_ + i;
	    int i_324_ = 0;
	    int i_325_ = anInt9002;
	    int i_326_ = anInt8985;
	    int i_327_ = i_322_ - i_326_;
	    int i_328_ = 0;
	    if (i_318_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		int i_329_ = aClass185_Sub2_9016.anInt9344 * 9823353 - i_318_;
		i_325_ -= i_329_;
		i_318_ = aClass185_Sub2_9016.anInt9344 * 9823353;
		i_324_ += i_329_ * i_326_;
		i_323_ += i_329_ * i_322_;
	    }
	    if (i_318_ + i_325_ > aClass185_Sub2_9016.anInt9345 * 639238427)
		i_325_ -= (i_318_ + i_325_
			   - aClass185_Sub2_9016.anInt9345 * 639238427);
	    if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		int i_330_ = aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		i_326_ -= i_330_;
		i = aClass185_Sub2_9016.anInt9365 * 1709859847;
		i_324_ += i_330_;
		i_323_ += i_330_;
		i_328_ += i_330_;
		i_327_ += i_330_;
	    }
	    if (i + i_326_ > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		int i_331_
		    = i + i_326_ - aClass185_Sub2_9016.anInt9343 * -1807368365;
		i_326_ -= i_331_;
		i_328_ += i_331_;
		i_327_ += i_331_;
	    }
	    if (i_326_ > 0 && i_325_ > 0) {
		if (i_321_ == 0) {
		    if (i_319_ == 1) {
			for (int i_332_ = -i_325_; i_332_ < 0; i_332_++) {
			    int i_333_ = i_323_ + i_326_ - 3;
			    while (i_323_ < i_333_) {
				is[i_323_++]
				    = (anIntArray11408
				       [aByteArray11407[i_324_++] & 0xff]);
				is[i_323_++]
				    = (anIntArray11408
				       [aByteArray11407[i_324_++] & 0xff]);
				is[i_323_++]
				    = (anIntArray11408
				       [aByteArray11407[i_324_++] & 0xff]);
				is[i_323_++]
				    = (anIntArray11408
				       [aByteArray11407[i_324_++] & 0xff]);
			    }
			    i_333_ += 3;
			    while (i_323_ < i_333_)
				is[i_323_++]
				    = (anIntArray11408
				       [aByteArray11407[i_324_++] & 0xff]);
			    i_323_ += i_327_;
			    i_324_ += i_328_;
			}
		    } else if (i_319_ == 0) {
			int i_334_ = (i_320_ & 0xff0000) >> 16;
			int i_335_ = (i_320_ & 0xff00) >> 8;
			int i_336_ = i_320_ & 0xff;
			for (int i_337_ = -i_325_; i_337_ < 0; i_337_++) {
			    for (int i_338_ = -i_326_; i_338_ < 0; i_338_++) {
				int i_339_
				    = (anIntArray11408
				       [aByteArray11407[i_324_++] & 0xff]);
				int i_340_
				    = (i_339_ & 0xff0000) * i_334_ & ~0xffffff;
				int i_341_
				    = (i_339_ & 0xff00) * i_335_ & 0xff0000;
				int i_342_ = (i_339_ & 0xff) * i_336_ & 0xff00;
				is[i_323_++]
				    = (i_340_ | i_341_ | i_342_) >>> 8;
			    }
			    i_323_ += i_327_;
			    i_324_ += i_328_;
			}
		    } else if (i_319_ == 3) {
			for (int i_343_ = -i_325_; i_343_ < 0; i_343_++) {
			    for (int i_344_ = -i_326_; i_344_ < 0; i_344_++) {
				int i_345_
				    = (anIntArray11408
				       [aByteArray11407[i_324_++] & 0xff]);
				int i_346_ = i_345_ + i_320_;
				int i_347_ = ((i_345_ & 0xff00ff)
					      + (i_320_ & 0xff00ff));
				int i_348_ = ((i_347_ & 0x1000100)
					      + (i_346_ - i_347_ & 0x10000));
				is[i_323_++]
				    = i_346_ - i_348_ | i_348_ - (i_348_
								  >>> 8);
			    }
			    i_323_ += i_327_;
			    i_324_ += i_328_;
			}
		    } else if (i_319_ == 2) {
			int i_349_ = i_320_ >>> 24;
			int i_350_ = 256 - i_349_;
			int i_351_ = (i_320_ & 0xff00ff) * i_350_ & ~0xff00ff;
			int i_352_ = (i_320_ & 0xff00) * i_350_ & 0xff0000;
			i_320_ = (i_351_ | i_352_) >>> 8;
			for (int i_353_ = -i_325_; i_353_ < 0; i_353_++) {
			    for (int i_354_ = -i_326_; i_354_ < 0; i_354_++) {
				int i_355_
				    = (anIntArray11408
				       [aByteArray11407[i_324_++] & 0xff]);
				i_351_
				    = (i_355_ & 0xff00ff) * i_349_ & ~0xff00ff;
				i_352_ = (i_355_ & 0xff00) * i_349_ & 0xff0000;
				is[i_323_++]
				    = ((i_351_ | i_352_) >>> 8) + i_320_;
			    }
			    i_323_ += i_327_;
			    i_324_ += i_328_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_321_ == 1) {
		    if (i_319_ == 1) {
			for (int i_356_ = -i_325_; i_356_ < 0; i_356_++) {
			    for (int i_357_ = -i_326_; i_357_ < 0; i_357_++) {
				int i_358_ = aByteArray11407[i_324_++];
				if (i_358_ != 0) {
				    int i_359_
					= (anIntArray11408[i_358_ & 0xff]
					   | ~0xffffff);
				    int i_360_ = 255;
				    int i_361_ = 0;
				    int i_362_ = is[i_323_];
				    is[i_323_++]
					= (((((i_359_ & 0xff00ff) * i_360_
					      + (i_362_ & 0xff00ff) * i_361_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_359_ & ~0xff00ff) >>> 8)
						* i_360_)
					       + (((i_362_ & ~0xff00ff) >>> 8)
						  * i_361_))
					      & ~0xff00ff));
				} else
				    i_323_++;
			    }
			    i_323_ += i_327_;
			    i_324_ += i_328_;
			}
		    } else if (i_319_ == 0) {
			if ((i_320_ & 0xffffff) == 16777215) {
			    int i_363_ = i_320_ >>> 24;
			    int i_364_ = 256 - i_363_;
			    for (int i_365_ = -i_325_; i_365_ < 0; i_365_++) {
				for (int i_366_ = -i_326_; i_366_ < 0;
				     i_366_++) {
				    int i_367_ = aByteArray11407[i_324_++];
				    if (i_367_ != 0) {
					int i_368_
					    = anIntArray11408[i_367_ & 0xff];
					int i_369_ = is[i_323_];
					is[i_323_++]
					    = ((((i_368_ & 0xff00ff) * i_363_
						 + ((i_369_ & 0xff00ff)
						    * i_364_))
						& ~0xff00ff)
					       + (((i_368_ & 0xff00) * i_363_
						   + ((i_369_ & 0xff00)
						      * i_364_))
						  & 0xff0000)) >> 8;
				    } else
					i_323_++;
				}
				i_323_ += i_327_;
				i_324_ += i_328_;
			    }
			} else {
			    int i_370_ = (i_320_ & 0xff0000) >> 16;
			    int i_371_ = (i_320_ & 0xff00) >> 8;
			    int i_372_ = i_320_ & 0xff;
			    int i_373_ = i_320_ >>> 24;
			    int i_374_ = 256 - i_373_;
			    for (int i_375_ = -i_325_; i_375_ < 0; i_375_++) {
				for (int i_376_ = -i_326_; i_376_ < 0;
				     i_376_++) {
				    int i_377_ = aByteArray11407[i_324_++];
				    if (i_377_ != 0) {
					int i_378_
					    = anIntArray11408[i_377_ & 0xff];
					if (i_373_ != 255) {
					    int i_379_
						= ((i_378_ & 0xff0000) * i_370_
						   & ~0xffffff);
					    int i_380_
						= ((i_378_ & 0xff00) * i_371_
						   & 0xff0000);
					    int i_381_
						= ((i_378_ & 0xff) * i_372_
						   & 0xff00);
					    i_378_ = (i_379_ | i_380_
						      | i_381_) >>> 8;
					    int i_382_ = is[i_323_];
					    is[i_323_++]
						= (((((i_378_ & 0xff00ff)
						      * i_373_)
						     + ((i_382_ & 0xff00ff)
							* i_374_))
						    & ~0xff00ff)
						   + ((((i_378_ & 0xff00)
							* i_373_)
						       + ((i_382_ & 0xff00)
							  * i_374_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_383_
						= ((i_378_ & 0xff0000) * i_370_
						   & ~0xffffff);
					    int i_384_
						= ((i_378_ & 0xff00) * i_371_
						   & 0xff0000);
					    int i_385_
						= ((i_378_ & 0xff) * i_372_
						   & 0xff00);
					    is[i_323_++] = (i_383_ | i_384_
							    | i_385_) >>> 8;
					}
				    } else
					i_323_++;
				}
				i_323_ += i_327_;
				i_324_ += i_328_;
			    }
			}
		    } else if (i_319_ == 3) {
			int i_386_ = i_320_ >>> 24;
			int i_387_ = 256 - i_386_;
			for (int i_388_ = -i_325_; i_388_ < 0; i_388_++) {
			    for (int i_389_ = -i_326_; i_389_ < 0; i_389_++) {
				byte i_390_ = aByteArray11407[i_324_++];
				int i_391_
				    = i_390_ > 0 ? anIntArray11408[i_390_] : 0;
				int i_392_ = i_391_ + i_320_;
				int i_393_ = ((i_391_ & 0xff00ff)
					      + (i_320_ & 0xff00ff));
				int i_394_ = ((i_393_ & 0x1000100)
					      + (i_392_ - i_393_ & 0x10000));
				i_394_ = i_392_ - i_394_ | i_394_ - (i_394_
								     >>> 8);
				if (i_391_ == 0 && i_386_ != 255) {
				    i_391_ = i_394_;
				    i_394_ = is[i_323_];
				    i_394_ = ((((i_391_ & 0xff00ff) * i_386_
						+ (i_394_ & 0xff00ff) * i_387_)
					       & ~0xff00ff)
					      + (((i_391_ & 0xff00) * i_386_
						  + (i_394_ & 0xff00) * i_387_)
						 & 0xff0000)) >> 8;
				}
				is[i_323_++] = i_394_;
			    }
			    i_323_ += i_327_;
			    i_324_ += i_328_;
			}
		    } else if (i_319_ == 2) {
			int i_395_ = i_320_ >>> 24;
			int i_396_ = 256 - i_395_;
			int i_397_ = (i_320_ & 0xff00ff) * i_396_ & ~0xff00ff;
			int i_398_ = (i_320_ & 0xff00) * i_396_ & 0xff0000;
			i_320_ = (i_397_ | i_398_) >>> 8;
			for (int i_399_ = -i_325_; i_399_ < 0; i_399_++) {
			    for (int i_400_ = -i_326_; i_400_ < 0; i_400_++) {
				int i_401_ = aByteArray11407[i_324_++];
				if (i_401_ != 0) {
				    int i_402_
					= anIntArray11408[i_401_ & 0xff];
				    i_397_ = ((i_402_ & 0xff00ff) * i_395_
					      & ~0xff00ff);
				    i_398_ = ((i_402_ & 0xff00) * i_395_
					      & 0xff0000);
				    is[i_323_++]
					= ((i_397_ | i_398_) >>> 8) + i_320_;
				} else
				    i_323_++;
			    }
			    i_323_ += i_327_;
			    i_324_ += i_328_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_321_ == 2) {
		    if (i_319_ == 1) {
			for (int i_403_ = -i_325_; i_403_ < 0; i_403_++) {
			    for (int i_404_ = -i_326_; i_404_ < 0; i_404_++) {
				int i_405_ = aByteArray11407[i_324_++];
				if (i_405_ != 0) {
				    int i_406_
					= anIntArray11408[i_405_ & 0xff];
				    int i_407_ = is[i_323_];
				    int i_408_ = i_406_ + i_407_;
				    int i_409_ = ((i_406_ & 0xff00ff)
						  + (i_407_ & 0xff00ff));
				    i_407_ = ((i_409_ & 0x1000100)
					      + (i_408_ - i_409_ & 0x10000));
				    is[i_323_++]
					= i_408_ - i_407_ | i_407_ - (i_407_
								      >>> 8);
				} else
				    i_323_++;
			    }
			    i_323_ += i_327_;
			    i_324_ += i_328_;
			}
		    } else if (i_319_ == 0) {
			int i_410_ = (i_320_ & 0xff0000) >> 16;
			int i_411_ = (i_320_ & 0xff00) >> 8;
			int i_412_ = i_320_ & 0xff;
			for (int i_413_ = -i_325_; i_413_ < 0; i_413_++) {
			    for (int i_414_ = -i_326_; i_414_ < 0; i_414_++) {
				int i_415_ = aByteArray11407[i_324_++];
				if (i_415_ != 0) {
				    int i_416_
					= anIntArray11408[i_415_ & 0xff];
				    int i_417_ = ((i_416_ & 0xff0000) * i_410_
						  & ~0xffffff);
				    int i_418_ = ((i_416_ & 0xff00) * i_411_
						  & 0xff0000);
				    int i_419_
					= (i_416_ & 0xff) * i_412_ & 0xff00;
				    i_416_ = (i_417_ | i_418_ | i_419_) >>> 8;
				    int i_420_ = is[i_323_];
				    int i_421_ = i_416_ + i_420_;
				    int i_422_ = ((i_416_ & 0xff00ff)
						  + (i_420_ & 0xff00ff));
				    i_420_ = ((i_422_ & 0x1000100)
					      + (i_421_ - i_422_ & 0x10000));
				    is[i_323_++]
					= i_421_ - i_420_ | i_420_ - (i_420_
								      >>> 8);
				} else
				    i_323_++;
			    }
			    i_323_ += i_327_;
			    i_324_ += i_328_;
			}
		    } else if (i_319_ == 3) {
			for (int i_423_ = -i_325_; i_423_ < 0; i_423_++) {
			    for (int i_424_ = -i_326_; i_424_ < 0; i_424_++) {
				byte i_425_ = aByteArray11407[i_324_++];
				int i_426_
				    = i_425_ > 0 ? anIntArray11408[i_425_] : 0;
				int i_427_ = i_426_ + i_320_;
				int i_428_ = ((i_426_ & 0xff00ff)
					      + (i_320_ & 0xff00ff));
				int i_429_ = ((i_428_ & 0x1000100)
					      + (i_427_ - i_428_ & 0x10000));
				i_426_ = i_427_ - i_429_ | i_429_ - (i_429_
								     >>> 8);
				i_429_ = is[i_323_];
				i_427_ = i_426_ + i_429_;
				i_428_ = (i_426_ & 0xff00ff) + (i_429_
								& 0xff00ff);
				i_429_
				    = (i_428_ & 0x1000100) + (i_427_ - i_428_
							      & 0x10000);
				is[i_323_++]
				    = i_427_ - i_429_ | i_429_ - (i_429_
								  >>> 8);
			    }
			    i_323_ += i_327_;
			    i_324_ += i_328_;
			}
		    } else if (i_319_ == 2) {
			int i_430_ = i_320_ >>> 24;
			int i_431_ = 256 - i_430_;
			int i_432_ = (i_320_ & 0xff00ff) * i_431_ & ~0xff00ff;
			int i_433_ = (i_320_ & 0xff00) * i_431_ & 0xff0000;
			i_320_ = (i_432_ | i_433_) >>> 8;
			for (int i_434_ = -i_325_; i_434_ < 0; i_434_++) {
			    for (int i_435_ = -i_326_; i_435_ < 0; i_435_++) {
				int i_436_ = aByteArray11407[i_324_++];
				if (i_436_ != 0) {
				    int i_437_
					= anIntArray11408[i_436_ & 0xff];
				    i_432_ = ((i_437_ & 0xff00ff) * i_430_
					      & ~0xff00ff);
				    i_433_ = ((i_437_ & 0xff00) * i_430_
					      & 0xff0000);
				    i_437_
					= ((i_432_ | i_433_) >>> 8) + i_320_;
				    int i_438_ = is[i_323_];
				    int i_439_ = i_437_ + i_438_;
				    int i_440_ = ((i_437_ & 0xff00ff)
						  + (i_438_ & 0xff00ff));
				    i_438_ = ((i_440_ & 0x1000100)
					      + (i_439_ - i_440_ & 0x10000));
				    is[i_323_++]
					= i_439_ - i_438_ | i_438_ - (i_438_
								      >>> 8);
				} else
				    i_323_++;
			    }
			    i_323_ += i_327_;
			    i_324_ += i_328_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method14512(int i, int i_441_) {
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    if (anInt9001 == 0) {
		if (anInt9000 == 0) {
		    int i_442_ = anInt8998;
		    while (i_442_ < 0) {
			int i_443_ = anInt8988;
			int i_444_ = anInt9007;
			int i_445_ = anInt9003;
			int i_446_ = anInt8999;
			if (i_444_ >= 0 && i_445_ >= 0
			    && i_444_ - (anInt8985 << 12) < 0
			    && i_445_ - (anInt9002 << 12) < 0) {
			    for (/**/; i_446_ < 0; i_446_++) {
				int i_447_ = ((i_445_ >> 12) * anInt8985
					      + (i_444_ >> 12));
				int i_448_ = i_443_++;
				if (i_441_ == 0) {
				    if (i == 1)
					is[i_448_] = (anIntArray11408
						      [(aByteArray11407[i_447_]
							& 0xff)]);
				    else if (i == 0) {
					int i_449_ = (anIntArray11408
						      [(aByteArray11407[i_447_]
							& 0xff)]);
					int i_450_
					    = ((i_449_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_451_
					    = ((i_449_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_452_
					    = ((i_449_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_448_]
					    = (i_450_ | i_451_ | i_452_) >>> 8;
				    } else if (i == 3) {
					int i_453_ = (anIntArray11408
						      [(aByteArray11407[i_447_]
							& 0xff)]);
					int i_454_ = anInt9011;
					int i_455_ = i_453_ + i_454_;
					int i_456_ = ((i_453_ & 0xff00ff)
						      + (i_454_ & 0xff00ff));
					int i_457_
					    = ((i_456_ & 0x1000100)
					       + (i_455_ - i_456_ & 0x10000));
					is[i_448_]
					    = (i_455_ - i_457_
					       | i_457_ - (i_457_ >>> 8));
				    } else if (i == 2) {
					int i_458_ = (anIntArray11408
						      [(aByteArray11407[i_447_]
							& 0xff)]);
					int i_459_
					    = ((i_458_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_460_
					    = ((i_458_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_448_] = (((i_459_ | i_460_) >>> 8)
						      + anInt9019);
				    } else
					throw new IllegalArgumentException();
				} else if (i_441_ == 1) {
				    if (i == 1) {
					int i_461_ = aByteArray11407[i_447_];
					if (i_461_ != 0)
					    is[i_448_] = (anIntArray11408
							  [i_461_ & 0xff]);
				    } else if (i == 0) {
					int i_462_ = aByteArray11407[i_447_];
					if (i_462_ != 0) {
					    int i_463_ = (anIntArray11408
							  [i_462_ & 0xff]);
					    if ((anInt9011 & 0xffffff)
						== 16777215) {
						int i_464_ = anInt9011 >>> 24;
						int i_465_ = 256 - i_464_;
						int i_466_ = is[i_448_];
						is[i_448_]
						    = (((((i_463_ & 0xff00ff)
							  * i_464_)
							 + ((i_466_ & 0xff00ff)
							    * i_465_))
							& ~0xff00ff)
						       + ((((i_463_ & 0xff00)
							    * i_464_)
							   + ((i_466_ & 0xff00)
							      * i_465_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9012 != 255) {
						int i_467_
						    = (((i_463_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_468_
						    = (((i_463_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_469_ = (((i_463_ & 0xff)
							       * anInt9018)
							      & 0xff00);
						i_463_ = (i_467_ | i_468_
							  | i_469_) >>> 8;
						int i_470_ = is[i_448_];
						is[i_448_]
						    = (((((i_463_ & 0xff00ff)
							  * anInt9012)
							 + ((i_470_ & 0xff00ff)
							    * anInt9013))
							& ~0xff00ff)
						       + ((((i_463_ & 0xff00)
							    * anInt9012)
							   + ((i_470_ & 0xff00)
							      * anInt9013))
							  & 0xff0000)) >> 8;
					    } else {
						int i_471_
						    = (((i_463_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_472_
						    = (((i_463_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_473_ = (((i_463_ & 0xff)
							       * anInt9018)
							      & 0xff00);
						is[i_448_] = (i_471_ | i_472_
							      | i_473_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_474_ = aByteArray11407[i_447_];
					int i_475_
					    = (i_474_ > 0
					       ? anIntArray11408[i_474_] : 0);
					int i_476_ = anInt9011;
					int i_477_ = i_475_ + i_476_;
					int i_478_ = ((i_475_ & 0xff00ff)
						      + (i_476_ & 0xff00ff));
					int i_479_
					    = ((i_478_ & 0x1000100)
					       + (i_477_ - i_478_ & 0x10000));
					i_479_ = (i_477_ - i_479_
						  | i_479_ - (i_479_ >>> 8));
					if (i_475_ == 0 && anInt9012 != 255) {
					    i_475_ = i_479_;
					    i_479_ = is[i_448_];
					    i_479_ = (((((i_475_ & 0xff00ff)
							 * anInt9012)
							+ ((i_479_ & 0xff00ff)
							   * anInt9013))
						       & ~0xff00ff)
						      + ((((i_475_ & 0xff00)
							   * anInt9012)
							  + ((i_479_ & 0xff00)
							     * anInt9013))
							 & 0xff0000)) >> 8;
					}
					is[i_448_] = i_479_;
				    } else if (i == 2) {
					int i_480_ = aByteArray11407[i_447_];
					if (i_480_ != 0) {
					    int i_481_ = (anIntArray11408
							  [i_480_ & 0xff]);
					    int i_482_ = (((i_481_ & 0xff00ff)
							   * anInt9012)
							  & ~0xff00ff);
					    int i_483_ = (((i_481_ & 0xff00)
							   * anInt9012)
							  & 0xff0000);
					    is[i_448_++] = ((i_482_ | i_483_)
							    >>> 8) + anInt9019;
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_441_ == 2) {
				    if (i == 1) {
					int i_484_ = aByteArray11407[i_447_];
					if (i_484_ != 0) {
					    int i_485_ = (anIntArray11408
							  [i_484_ & 0xff]);
					    int i_486_ = is[i_448_];
					    int i_487_ = i_485_ + i_486_;
					    int i_488_
						= ((i_485_ & 0xff00ff)
						   + (i_486_ & 0xff00ff));
					    i_486_ = ((i_488_ & 0x1000100)
						      + (i_487_ - i_488_
							 & 0x10000));
					    is[i_448_]
						= (i_487_ - i_486_
						   | i_486_ - (i_486_ >>> 8));
					}
				    } else if (i == 0) {
					int i_489_ = aByteArray11407[i_447_];
					if (i_489_ != 0) {
					    int i_490_ = (anIntArray11408
							  [i_489_ & 0xff]);
					    int i_491_ = (((i_490_ & 0xff0000)
							   * anInt9014)
							  & ~0xffffff);
					    int i_492_ = (((i_490_ & 0xff00)
							   * anInt9015)
							  & 0xff0000);
					    int i_493_
						= ((i_490_ & 0xff) * anInt9018
						   & 0xff00);
					    i_490_ = (i_491_ | i_492_
						      | i_493_) >>> 8;
					    int i_494_ = is[i_448_];
					    int i_495_ = i_490_ + i_494_;
					    int i_496_
						= ((i_490_ & 0xff00ff)
						   + (i_494_ & 0xff00ff));
					    i_494_ = ((i_496_ & 0x1000100)
						      + (i_495_ - i_496_
							 & 0x10000));
					    is[i_448_]
						= (i_495_ - i_494_
						   | i_494_ - (i_494_ >>> 8));
					}
				    } else if (i == 3) {
					byte i_497_ = aByteArray11407[i_447_];
					int i_498_
					    = (i_497_ > 0
					       ? anIntArray11408[i_497_] : 0);
					int i_499_ = anInt9011;
					int i_500_ = i_498_ + i_499_;
					int i_501_ = ((i_498_ & 0xff00ff)
						      + (i_499_ & 0xff00ff));
					int i_502_
					    = ((i_501_ & 0x1000100)
					       + (i_500_ - i_501_ & 0x10000));
					i_502_ = (i_500_ - i_502_
						  | i_502_ - (i_502_ >>> 8));
					if (i_498_ == 0 && anInt9012 != 255) {
					    i_498_ = i_502_;
					    i_502_ = is[i_448_];
					    i_502_ = (((((i_498_ & 0xff00ff)
							 * anInt9012)
							+ ((i_502_ & 0xff00ff)
							   * anInt9013))
						       & ~0xff00ff)
						      + ((((i_498_ & 0xff00)
							   * anInt9012)
							  + ((i_502_ & 0xff00)
							     * anInt9013))
							 & 0xff0000)) >> 8;
					}
					is[i_448_] = i_502_;
				    } else if (i == 2) {
					int i_503_ = aByteArray11407[i_447_];
					if (i_503_ != 0) {
					    int i_504_ = (anIntArray11408
							  [i_503_ & 0xff]);
					    int i_505_ = (((i_504_ & 0xff00ff)
							   * anInt9012)
							  & ~0xff00ff);
					    int i_506_ = (((i_504_ & 0xff00)
							   * anInt9012)
							  & 0xff0000);
					    i_504_ = (((i_505_ | i_506_) >>> 8)
						      + anInt9019);
					    int i_507_ = is[i_448_];
					    int i_508_ = i_504_ + i_507_;
					    int i_509_
						= ((i_504_ & 0xff00ff)
						   + (i_507_ & 0xff00ff));
					    i_507_ = ((i_509_ & 0x1000100)
						      + (i_508_ - i_509_
							 & 0x10000));
					    is[i_448_]
						= (i_508_ - i_507_
						   | i_507_ - (i_507_ >>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
			    }
			}
			i_442_++;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_510_ = anInt8998;
		    while (i_510_ < 0) {
			int i_511_ = anInt8988;
			int i_512_ = anInt9007;
			int i_513_ = anInt9003 + anInt9010;
			int i_514_ = anInt8999;
			if (i_512_ >= 0 && i_512_ - (anInt8985 << 12) < 0) {
			    int i_515_;
			    if ((i_515_ = i_513_ - (anInt9002 << 12)) >= 0) {
				i_515_ = (anInt9000 - i_515_) / anInt9000;
				i_514_ += i_515_;
				i_513_ += anInt9000 * i_515_;
				i_511_ += i_515_;
			    }
			    if ((i_515_ = (i_513_ - anInt9000) / anInt9000)
				> i_514_)
				i_514_ = i_515_;
			    for (/**/; i_514_ < 0; i_514_++) {
				int i_516_ = ((i_513_ >> 12) * anInt8985
					      + (i_512_ >> 12));
				int i_517_ = i_511_++;
				if (i_441_ == 0) {
				    if (i == 1)
					is[i_517_] = (anIntArray11408
						      [(aByteArray11407[i_516_]
							& 0xff)]);
				    else if (i == 0) {
					int i_518_ = (anIntArray11408
						      [(aByteArray11407[i_516_]
							& 0xff)]);
					int i_519_
					    = ((i_518_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_520_
					    = ((i_518_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_521_
					    = ((i_518_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_517_]
					    = (i_519_ | i_520_ | i_521_) >>> 8;
				    } else if (i == 3) {
					int i_522_ = (anIntArray11408
						      [(aByteArray11407[i_516_]
							& 0xff)]);
					int i_523_ = anInt9011;
					int i_524_ = i_522_ + i_523_;
					int i_525_ = ((i_522_ & 0xff00ff)
						      + (i_523_ & 0xff00ff));
					int i_526_
					    = ((i_525_ & 0x1000100)
					       + (i_524_ - i_525_ & 0x10000));
					is[i_517_]
					    = (i_524_ - i_526_
					       | i_526_ - (i_526_ >>> 8));
				    } else if (i == 2) {
					int i_527_ = (anIntArray11408
						      [(aByteArray11407[i_516_]
							& 0xff)]);
					int i_528_
					    = ((i_527_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_529_
					    = ((i_527_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_517_] = (((i_528_ | i_529_) >>> 8)
						      + anInt9019);
				    } else
					throw new IllegalArgumentException();
				} else if (i_441_ == 1) {
				    if (i == 1) {
					int i_530_ = aByteArray11407[i_516_];
					if (i_530_ != 0)
					    is[i_517_] = (anIntArray11408
							  [i_530_ & 0xff]);
				    } else if (i == 0) {
					int i_531_ = aByteArray11407[i_516_];
					if (i_531_ != 0) {
					    int i_532_ = (anIntArray11408
							  [i_531_ & 0xff]);
					    if ((anInt9011 & 0xffffff)
						== 16777215) {
						int i_533_ = anInt9011 >>> 24;
						int i_534_ = 256 - i_533_;
						int i_535_ = is[i_517_];
						is[i_517_]
						    = (((((i_532_ & 0xff00ff)
							  * i_533_)
							 + ((i_535_ & 0xff00ff)
							    * i_534_))
							& ~0xff00ff)
						       + ((((i_532_ & 0xff00)
							    * i_533_)
							   + ((i_535_ & 0xff00)
							      * i_534_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9012 != 255) {
						int i_536_
						    = (((i_532_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_537_
						    = (((i_532_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_538_ = (((i_532_ & 0xff)
							       * anInt9018)
							      & 0xff00);
						i_532_ = (i_536_ | i_537_
							  | i_538_) >>> 8;
						int i_539_ = is[i_517_];
						is[i_517_]
						    = (((((i_532_ & 0xff00ff)
							  * anInt9012)
							 + ((i_539_ & 0xff00ff)
							    * anInt9013))
							& ~0xff00ff)
						       + ((((i_532_ & 0xff00)
							    * anInt9012)
							   + ((i_539_ & 0xff00)
							      * anInt9013))
							  & 0xff0000)) >> 8;
					    } else {
						int i_540_
						    = (((i_532_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_541_
						    = (((i_532_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_542_ = (((i_532_ & 0xff)
							       * anInt9018)
							      & 0xff00);
						is[i_517_] = (i_540_ | i_541_
							      | i_542_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_543_ = aByteArray11407[i_516_];
					int i_544_
					    = (i_543_ > 0
					       ? anIntArray11408[i_543_] : 0);
					int i_545_ = anInt9011;
					int i_546_ = i_544_ + i_545_;
					int i_547_ = ((i_544_ & 0xff00ff)
						      + (i_545_ & 0xff00ff));
					int i_548_
					    = ((i_547_ & 0x1000100)
					       + (i_546_ - i_547_ & 0x10000));
					i_548_ = (i_546_ - i_548_
						  | i_548_ - (i_548_ >>> 8));
					if (i_544_ == 0 && anInt9012 != 255) {
					    i_544_ = i_548_;
					    i_548_ = is[i_517_];
					    i_548_ = (((((i_544_ & 0xff00ff)
							 * anInt9012)
							+ ((i_548_ & 0xff00ff)
							   * anInt9013))
						       & ~0xff00ff)
						      + ((((i_544_ & 0xff00)
							   * anInt9012)
							  + ((i_548_ & 0xff00)
							     * anInt9013))
							 & 0xff0000)) >> 8;
					}
					is[i_517_] = i_548_;
				    } else if (i == 2) {
					int i_549_ = aByteArray11407[i_516_];
					if (i_549_ != 0) {
					    int i_550_ = (anIntArray11408
							  [i_549_ & 0xff]);
					    int i_551_ = (((i_550_ & 0xff00ff)
							   * anInt9012)
							  & ~0xff00ff);
					    int i_552_ = (((i_550_ & 0xff00)
							   * anInt9012)
							  & 0xff0000);
					    is[i_517_++] = ((i_551_ | i_552_)
							    >>> 8) + anInt9019;
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_441_ == 2) {
				    if (i == 1) {
					int i_553_ = aByteArray11407[i_516_];
					if (i_553_ != 0) {
					    int i_554_ = (anIntArray11408
							  [i_553_ & 0xff]);
					    int i_555_ = is[i_517_];
					    int i_556_ = i_554_ + i_555_;
					    int i_557_
						= ((i_554_ & 0xff00ff)
						   + (i_555_ & 0xff00ff));
					    i_555_ = ((i_557_ & 0x1000100)
						      + (i_556_ - i_557_
							 & 0x10000));
					    is[i_517_]
						= (i_556_ - i_555_
						   | i_555_ - (i_555_ >>> 8));
					}
				    } else if (i == 0) {
					int i_558_ = aByteArray11407[i_516_];
					if (i_558_ != 0) {
					    int i_559_ = (anIntArray11408
							  [i_558_ & 0xff]);
					    int i_560_ = (((i_559_ & 0xff0000)
							   * anInt9014)
							  & ~0xffffff);
					    int i_561_ = (((i_559_ & 0xff00)
							   * anInt9015)
							  & 0xff0000);
					    int i_562_
						= ((i_559_ & 0xff) * anInt9018
						   & 0xff00);
					    i_559_ = (i_560_ | i_561_
						      | i_562_) >>> 8;
					    int i_563_ = is[i_517_];
					    int i_564_ = i_559_ + i_563_;
					    int i_565_
						= ((i_559_ & 0xff00ff)
						   + (i_563_ & 0xff00ff));
					    i_563_ = ((i_565_ & 0x1000100)
						      + (i_564_ - i_565_
							 & 0x10000));
					    is[i_517_]
						= (i_564_ - i_563_
						   | i_563_ - (i_563_ >>> 8));
					}
				    } else if (i == 3) {
					byte i_566_ = aByteArray11407[i_516_];
					int i_567_
					    = (i_566_ > 0
					       ? anIntArray11408[i_566_] : 0);
					int i_568_ = anInt9011;
					int i_569_ = i_567_ + i_568_;
					int i_570_ = ((i_567_ & 0xff00ff)
						      + (i_568_ & 0xff00ff));
					int i_571_
					    = ((i_570_ & 0x1000100)
					       + (i_569_ - i_570_ & 0x10000));
					i_571_ = (i_569_ - i_571_
						  | i_571_ - (i_571_ >>> 8));
					if (i_567_ == 0 && anInt9012 != 255) {
					    i_567_ = i_571_;
					    i_571_ = is[i_517_];
					    i_571_ = (((((i_567_ & 0xff00ff)
							 * anInt9012)
							+ ((i_571_ & 0xff00ff)
							   * anInt9013))
						       & ~0xff00ff)
						      + ((((i_567_ & 0xff00)
							   * anInt9012)
							  + ((i_571_ & 0xff00)
							     * anInt9013))
							 & 0xff0000)) >> 8;
					}
					is[i_517_] = i_571_;
				    } else if (i == 2) {
					int i_572_ = aByteArray11407[i_516_];
					if (i_572_ != 0) {
					    int i_573_ = (anIntArray11408
							  [i_572_ & 0xff]);
					    int i_574_ = (((i_573_ & 0xff00ff)
							   * anInt9012)
							  & ~0xff00ff);
					    int i_575_ = (((i_573_ & 0xff00)
							   * anInt9012)
							  & 0xff0000);
					    i_573_ = (((i_574_ | i_575_) >>> 8)
						      + anInt9019);
					    int i_576_ = is[i_517_];
					    int i_577_ = i_573_ + i_576_;
					    int i_578_
						= ((i_573_ & 0xff00ff)
						   + (i_576_ & 0xff00ff));
					    i_576_ = ((i_578_ & 0x1000100)
						      + (i_577_ - i_578_
							 & 0x10000));
					    is[i_517_]
						= (i_577_ - i_576_
						   | i_576_ - (i_576_ >>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_513_ += anInt9000;
			    }
			}
			i_510_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_579_ = anInt8998;
		    while (i_579_ < 0) {
			int i_580_ = anInt8988;
			int i_581_ = anInt9007;
			int i_582_ = anInt9003 + anInt9010;
			int i_583_ = anInt8999;
			if (i_581_ >= 0 && i_581_ - (anInt8985 << 12) < 0) {
			    if (i_582_ < 0) {
				int i_584_
				    = (anInt9000 - 1 - i_582_) / anInt9000;
				i_583_ += i_584_;
				i_582_ += anInt9000 * i_584_;
				i_580_ += i_584_;
			    }
			    int i_585_;
			    if ((i_585_ = (1 + i_582_ - (anInt9002 << 12)
					   - anInt9000) / anInt9000)
				> i_583_)
				i_583_ = i_585_;
			    for (/**/; i_583_ < 0; i_583_++) {
				int i_586_ = ((i_582_ >> 12) * anInt8985
					      + (i_581_ >> 12));
				int i_587_ = i_580_++;
				if (i_441_ == 0) {
				    if (i == 1)
					is[i_587_] = (anIntArray11408
						      [(aByteArray11407[i_586_]
							& 0xff)]);
				    else if (i == 0) {
					int i_588_ = (anIntArray11408
						      [(aByteArray11407[i_586_]
							& 0xff)]);
					int i_589_
					    = ((i_588_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_590_
					    = ((i_588_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_591_
					    = ((i_588_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_587_]
					    = (i_589_ | i_590_ | i_591_) >>> 8;
				    } else if (i == 3) {
					int i_592_ = (anIntArray11408
						      [(aByteArray11407[i_586_]
							& 0xff)]);
					int i_593_ = anInt9011;
					int i_594_ = i_592_ + i_593_;
					int i_595_ = ((i_592_ & 0xff00ff)
						      + (i_593_ & 0xff00ff));
					int i_596_
					    = ((i_595_ & 0x1000100)
					       + (i_594_ - i_595_ & 0x10000));
					is[i_587_]
					    = (i_594_ - i_596_
					       | i_596_ - (i_596_ >>> 8));
				    } else if (i == 2) {
					int i_597_ = (anIntArray11408
						      [(aByteArray11407[i_586_]
							& 0xff)]);
					int i_598_
					    = ((i_597_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_599_
					    = ((i_597_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_587_] = (((i_598_ | i_599_) >>> 8)
						      + anInt9019);
				    } else
					throw new IllegalArgumentException();
				} else if (i_441_ == 1) {
				    if (i == 1) {
					int i_600_ = aByteArray11407[i_586_];
					if (i_600_ != 0)
					    is[i_587_] = (anIntArray11408
							  [i_600_ & 0xff]);
				    } else if (i == 0) {
					int i_601_ = aByteArray11407[i_586_];
					if (i_601_ != 0) {
					    int i_602_ = (anIntArray11408
							  [i_601_ & 0xff]);
					    if ((anInt9011 & 0xffffff)
						== 16777215) {
						int i_603_ = anInt9011 >>> 24;
						int i_604_ = 256 - i_603_;
						int i_605_ = is[i_587_];
						is[i_587_]
						    = (((((i_602_ & 0xff00ff)
							  * i_603_)
							 + ((i_605_ & 0xff00ff)
							    * i_604_))
							& ~0xff00ff)
						       + ((((i_602_ & 0xff00)
							    * i_603_)
							   + ((i_605_ & 0xff00)
							      * i_604_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9012 != 255) {
						int i_606_
						    = (((i_602_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_607_
						    = (((i_602_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_608_ = (((i_602_ & 0xff)
							       * anInt9018)
							      & 0xff00);
						i_602_ = (i_606_ | i_607_
							  | i_608_) >>> 8;
						int i_609_ = is[i_587_];
						is[i_587_]
						    = (((((i_602_ & 0xff00ff)
							  * anInt9012)
							 + ((i_609_ & 0xff00ff)
							    * anInt9013))
							& ~0xff00ff)
						       + ((((i_602_ & 0xff00)
							    * anInt9012)
							   + ((i_609_ & 0xff00)
							      * anInt9013))
							  & 0xff0000)) >> 8;
					    } else {
						int i_610_
						    = (((i_602_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_611_
						    = (((i_602_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_612_ = (((i_602_ & 0xff)
							       * anInt9018)
							      & 0xff00);
						is[i_587_] = (i_610_ | i_611_
							      | i_612_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_613_ = aByteArray11407[i_586_];
					int i_614_
					    = (i_613_ > 0
					       ? anIntArray11408[i_613_] : 0);
					int i_615_ = anInt9011;
					int i_616_ = i_614_ + i_615_;
					int i_617_ = ((i_614_ & 0xff00ff)
						      + (i_615_ & 0xff00ff));
					int i_618_
					    = ((i_617_ & 0x1000100)
					       + (i_616_ - i_617_ & 0x10000));
					i_618_ = (i_616_ - i_618_
						  | i_618_ - (i_618_ >>> 8));
					if (i_614_ == 0 && anInt9012 != 255) {
					    i_614_ = i_618_;
					    i_618_ = is[i_587_];
					    i_618_ = (((((i_614_ & 0xff00ff)
							 * anInt9012)
							+ ((i_618_ & 0xff00ff)
							   * anInt9013))
						       & ~0xff00ff)
						      + ((((i_614_ & 0xff00)
							   * anInt9012)
							  + ((i_618_ & 0xff00)
							     * anInt9013))
							 & 0xff0000)) >> 8;
					}
					is[i_587_] = i_618_;
				    } else if (i == 2) {
					int i_619_ = aByteArray11407[i_586_];
					if (i_619_ != 0) {
					    int i_620_ = (anIntArray11408
							  [i_619_ & 0xff]);
					    int i_621_ = (((i_620_ & 0xff00ff)
							   * anInt9012)
							  & ~0xff00ff);
					    int i_622_ = (((i_620_ & 0xff00)
							   * anInt9012)
							  & 0xff0000);
					    is[i_587_++] = ((i_621_ | i_622_)
							    >>> 8) + anInt9019;
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_441_ == 2) {
				    if (i == 1) {
					int i_623_ = aByteArray11407[i_586_];
					if (i_623_ != 0) {
					    int i_624_ = (anIntArray11408
							  [i_623_ & 0xff]);
					    int i_625_ = is[i_587_];
					    int i_626_ = i_624_ + i_625_;
					    int i_627_
						= ((i_624_ & 0xff00ff)
						   + (i_625_ & 0xff00ff));
					    i_625_ = ((i_627_ & 0x1000100)
						      + (i_626_ - i_627_
							 & 0x10000));
					    is[i_587_]
						= (i_626_ - i_625_
						   | i_625_ - (i_625_ >>> 8));
					}
				    } else if (i == 0) {
					int i_628_ = aByteArray11407[i_586_];
					if (i_628_ != 0) {
					    int i_629_ = (anIntArray11408
							  [i_628_ & 0xff]);
					    int i_630_ = (((i_629_ & 0xff0000)
							   * anInt9014)
							  & ~0xffffff);
					    int i_631_ = (((i_629_ & 0xff00)
							   * anInt9015)
							  & 0xff0000);
					    int i_632_
						= ((i_629_ & 0xff) * anInt9018
						   & 0xff00);
					    i_629_ = (i_630_ | i_631_
						      | i_632_) >>> 8;
					    int i_633_ = is[i_587_];
					    int i_634_ = i_629_ + i_633_;
					    int i_635_
						= ((i_629_ & 0xff00ff)
						   + (i_633_ & 0xff00ff));
					    i_633_ = ((i_635_ & 0x1000100)
						      + (i_634_ - i_635_
							 & 0x10000));
					    is[i_587_]
						= (i_634_ - i_633_
						   | i_633_ - (i_633_ >>> 8));
					}
				    } else if (i == 3) {
					byte i_636_ = aByteArray11407[i_586_];
					int i_637_
					    = (i_636_ > 0
					       ? anIntArray11408[i_636_] : 0);
					int i_638_ = anInt9011;
					int i_639_ = i_637_ + i_638_;
					int i_640_ = ((i_637_ & 0xff00ff)
						      + (i_638_ & 0xff00ff));
					int i_641_
					    = ((i_640_ & 0x1000100)
					       + (i_639_ - i_640_ & 0x10000));
					i_641_ = (i_639_ - i_641_
						  | i_641_ - (i_641_ >>> 8));
					if (i_637_ == 0 && anInt9012 != 255) {
					    i_637_ = i_641_;
					    i_641_ = is[i_587_];
					    i_641_ = (((((i_637_ & 0xff00ff)
							 * anInt9012)
							+ ((i_641_ & 0xff00ff)
							   * anInt9013))
						       & ~0xff00ff)
						      + ((((i_637_ & 0xff00)
							   * anInt9012)
							  + ((i_641_ & 0xff00)
							     * anInt9013))
							 & 0xff0000)) >> 8;
					}
					is[i_587_] = i_641_;
				    } else if (i == 2) {
					int i_642_ = aByteArray11407[i_586_];
					if (i_642_ != 0) {
					    int i_643_ = (anIntArray11408
							  [i_642_ & 0xff]);
					    int i_644_ = (((i_643_ & 0xff00ff)
							   * anInt9012)
							  & ~0xff00ff);
					    int i_645_ = (((i_643_ & 0xff00)
							   * anInt9012)
							  & 0xff0000);
					    i_643_ = (((i_644_ | i_645_) >>> 8)
						      + anInt9019);
					    int i_646_ = is[i_587_];
					    int i_647_ = i_643_ + i_646_;
					    int i_648_
						= ((i_643_ & 0xff00ff)
						   + (i_646_ & 0xff00ff));
					    i_646_ = ((i_648_ & 0x1000100)
						      + (i_647_ - i_648_
							 & 0x10000));
					    is[i_587_]
						= (i_647_ - i_646_
						   | i_646_ - (i_646_ >>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_582_ += anInt9000;
			    }
			}
			i_579_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9001 < 0) {
		if (anInt9000 == 0) {
		    int i_649_ = anInt8998;
		    while (i_649_ < 0) {
			int i_650_ = anInt8988;
			int i_651_ = anInt9007 + anInt9009;
			int i_652_ = anInt9003;
			int i_653_ = anInt8999;
			if (i_652_ >= 0 && i_652_ - (anInt9002 << 12) < 0) {
			    int i_654_;
			    if ((i_654_ = i_651_ - (anInt8985 << 12)) >= 0) {
				i_654_ = (anInt9001 - i_654_) / anInt9001;
				i_653_ += i_654_;
				i_651_ += anInt9001 * i_654_;
				i_650_ += i_654_;
			    }
			    if ((i_654_ = (i_651_ - anInt9001) / anInt9001)
				> i_653_)
				i_653_ = i_654_;
			    for (/**/; i_653_ < 0; i_653_++) {
				int i_655_ = ((i_652_ >> 12) * anInt8985
					      + (i_651_ >> 12));
				int i_656_ = i_650_++;
				if (i_441_ == 0) {
				    if (i == 1)
					is[i_656_] = (anIntArray11408
						      [(aByteArray11407[i_655_]
							& 0xff)]);
				    else if (i == 0) {
					int i_657_ = (anIntArray11408
						      [(aByteArray11407[i_655_]
							& 0xff)]);
					int i_658_
					    = ((i_657_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_659_
					    = ((i_657_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_660_
					    = ((i_657_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_656_]
					    = (i_658_ | i_659_ | i_660_) >>> 8;
				    } else if (i == 3) {
					int i_661_ = (anIntArray11408
						      [(aByteArray11407[i_655_]
							& 0xff)]);
					int i_662_ = anInt9011;
					int i_663_ = i_661_ + i_662_;
					int i_664_ = ((i_661_ & 0xff00ff)
						      + (i_662_ & 0xff00ff));
					int i_665_
					    = ((i_664_ & 0x1000100)
					       + (i_663_ - i_664_ & 0x10000));
					is[i_656_]
					    = (i_663_ - i_665_
					       | i_665_ - (i_665_ >>> 8));
				    } else if (i == 2) {
					int i_666_ = (anIntArray11408
						      [(aByteArray11407[i_655_]
							& 0xff)]);
					int i_667_
					    = ((i_666_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_668_
					    = ((i_666_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_656_] = (((i_667_ | i_668_) >>> 8)
						      + anInt9019);
				    } else
					throw new IllegalArgumentException();
				} else if (i_441_ == 1) {
				    if (i == 1) {
					int i_669_ = aByteArray11407[i_655_];
					if (i_669_ != 0)
					    is[i_656_] = (anIntArray11408
							  [i_669_ & 0xff]);
				    } else if (i == 0) {
					int i_670_ = aByteArray11407[i_655_];
					if (i_670_ != 0) {
					    int i_671_ = (anIntArray11408
							  [i_670_ & 0xff]);
					    if ((anInt9011 & 0xffffff)
						== 16777215) {
						int i_672_ = anInt9011 >>> 24;
						int i_673_ = 256 - i_672_;
						int i_674_ = is[i_656_];
						is[i_656_]
						    = (((((i_671_ & 0xff00ff)
							  * i_672_)
							 + ((i_674_ & 0xff00ff)
							    * i_673_))
							& ~0xff00ff)
						       + ((((i_671_ & 0xff00)
							    * i_672_)
							   + ((i_674_ & 0xff00)
							      * i_673_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9012 != 255) {
						int i_675_
						    = (((i_671_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_676_
						    = (((i_671_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_677_ = (((i_671_ & 0xff)
							       * anInt9018)
							      & 0xff00);
						i_671_ = (i_675_ | i_676_
							  | i_677_) >>> 8;
						int i_678_ = is[i_656_];
						is[i_656_]
						    = (((((i_671_ & 0xff00ff)
							  * anInt9012)
							 + ((i_678_ & 0xff00ff)
							    * anInt9013))
							& ~0xff00ff)
						       + ((((i_671_ & 0xff00)
							    * anInt9012)
							   + ((i_678_ & 0xff00)
							      * anInt9013))
							  & 0xff0000)) >> 8;
					    } else {
						int i_679_
						    = (((i_671_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_680_
						    = (((i_671_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_681_ = (((i_671_ & 0xff)
							       * anInt9018)
							      & 0xff00);
						is[i_656_] = (i_679_ | i_680_
							      | i_681_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_682_ = aByteArray11407[i_655_];
					int i_683_
					    = (i_682_ > 0
					       ? anIntArray11408[i_682_] : 0);
					int i_684_ = anInt9011;
					int i_685_ = i_683_ + i_684_;
					int i_686_ = ((i_683_ & 0xff00ff)
						      + (i_684_ & 0xff00ff));
					int i_687_
					    = ((i_686_ & 0x1000100)
					       + (i_685_ - i_686_ & 0x10000));
					i_687_ = (i_685_ - i_687_
						  | i_687_ - (i_687_ >>> 8));
					if (i_683_ == 0 && anInt9012 != 255) {
					    i_683_ = i_687_;
					    i_687_ = is[i_656_];
					    i_687_ = (((((i_683_ & 0xff00ff)
							 * anInt9012)
							+ ((i_687_ & 0xff00ff)
							   * anInt9013))
						       & ~0xff00ff)
						      + ((((i_683_ & 0xff00)
							   * anInt9012)
							  + ((i_687_ & 0xff00)
							     * anInt9013))
							 & 0xff0000)) >> 8;
					}
					is[i_656_] = i_687_;
				    } else if (i == 2) {
					int i_688_ = aByteArray11407[i_655_];
					if (i_688_ != 0) {
					    int i_689_ = (anIntArray11408
							  [i_688_ & 0xff]);
					    int i_690_ = (((i_689_ & 0xff00ff)
							   * anInt9012)
							  & ~0xff00ff);
					    int i_691_ = (((i_689_ & 0xff00)
							   * anInt9012)
							  & 0xff0000);
					    is[i_656_++] = ((i_690_ | i_691_)
							    >>> 8) + anInt9019;
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_441_ == 2) {
				    if (i == 1) {
					int i_692_ = aByteArray11407[i_655_];
					if (i_692_ != 0) {
					    int i_693_ = (anIntArray11408
							  [i_692_ & 0xff]);
					    int i_694_ = is[i_656_];
					    int i_695_ = i_693_ + i_694_;
					    int i_696_
						= ((i_693_ & 0xff00ff)
						   + (i_694_ & 0xff00ff));
					    i_694_ = ((i_696_ & 0x1000100)
						      + (i_695_ - i_696_
							 & 0x10000));
					    is[i_656_]
						= (i_695_ - i_694_
						   | i_694_ - (i_694_ >>> 8));
					}
				    } else if (i == 0) {
					int i_697_ = aByteArray11407[i_655_];
					if (i_697_ != 0) {
					    int i_698_ = (anIntArray11408
							  [i_697_ & 0xff]);
					    int i_699_ = (((i_698_ & 0xff0000)
							   * anInt9014)
							  & ~0xffffff);
					    int i_700_ = (((i_698_ & 0xff00)
							   * anInt9015)
							  & 0xff0000);
					    int i_701_
						= ((i_698_ & 0xff) * anInt9018
						   & 0xff00);
					    i_698_ = (i_699_ | i_700_
						      | i_701_) >>> 8;
					    int i_702_ = is[i_656_];
					    int i_703_ = i_698_ + i_702_;
					    int i_704_
						= ((i_698_ & 0xff00ff)
						   + (i_702_ & 0xff00ff));
					    i_702_ = ((i_704_ & 0x1000100)
						      + (i_703_ - i_704_
							 & 0x10000));
					    is[i_656_]
						= (i_703_ - i_702_
						   | i_702_ - (i_702_ >>> 8));
					}
				    } else if (i == 3) {
					byte i_705_ = aByteArray11407[i_655_];
					int i_706_
					    = (i_705_ > 0
					       ? anIntArray11408[i_705_] : 0);
					int i_707_ = anInt9011;
					int i_708_ = i_706_ + i_707_;
					int i_709_ = ((i_706_ & 0xff00ff)
						      + (i_707_ & 0xff00ff));
					int i_710_
					    = ((i_709_ & 0x1000100)
					       + (i_708_ - i_709_ & 0x10000));
					i_710_ = (i_708_ - i_710_
						  | i_710_ - (i_710_ >>> 8));
					if (i_706_ == 0 && anInt9012 != 255) {
					    i_706_ = i_710_;
					    i_710_ = is[i_656_];
					    i_710_ = (((((i_706_ & 0xff00ff)
							 * anInt9012)
							+ ((i_710_ & 0xff00ff)
							   * anInt9013))
						       & ~0xff00ff)
						      + ((((i_706_ & 0xff00)
							   * anInt9012)
							  + ((i_710_ & 0xff00)
							     * anInt9013))
							 & 0xff0000)) >> 8;
					}
					is[i_656_] = i_710_;
				    } else if (i == 2) {
					int i_711_ = aByteArray11407[i_655_];
					if (i_711_ != 0) {
					    int i_712_ = (anIntArray11408
							  [i_711_ & 0xff]);
					    int i_713_ = (((i_712_ & 0xff00ff)
							   * anInt9012)
							  & ~0xff00ff);
					    int i_714_ = (((i_712_ & 0xff00)
							   * anInt9012)
							  & 0xff0000);
					    i_712_ = (((i_713_ | i_714_) >>> 8)
						      + anInt9019);
					    int i_715_ = is[i_656_];
					    int i_716_ = i_712_ + i_715_;
					    int i_717_
						= ((i_712_ & 0xff00ff)
						   + (i_715_ & 0xff00ff));
					    i_715_ = ((i_717_ & 0x1000100)
						      + (i_716_ - i_717_
							 & 0x10000));
					    is[i_656_]
						= (i_716_ - i_715_
						   | i_715_ - (i_715_ >>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_651_ += anInt9001;
			    }
			}
			i_649_++;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_718_ = anInt8998;
		    while (i_718_ < 0) {
			int i_719_ = anInt8988;
			int i_720_ = anInt9007 + anInt9009;
			int i_721_ = anInt9003 + anInt9010;
			int i_722_ = anInt8999;
			int i_723_;
			if ((i_723_ = i_720_ - (anInt8985 << 12)) >= 0) {
			    i_723_ = (anInt9001 - i_723_) / anInt9001;
			    i_722_ += i_723_;
			    i_720_ += anInt9001 * i_723_;
			    i_721_ += anInt9000 * i_723_;
			    i_719_ += i_723_;
			}
			if ((i_723_ = (i_720_ - anInt9001) / anInt9001)
			    > i_722_)
			    i_722_ = i_723_;
			if ((i_723_ = i_721_ - (anInt9002 << 12)) >= 0) {
			    i_723_ = (anInt9000 - i_723_) / anInt9000;
			    i_722_ += i_723_;
			    i_720_ += anInt9001 * i_723_;
			    i_721_ += anInt9000 * i_723_;
			    i_719_ += i_723_;
			}
			if ((i_723_ = (i_721_ - anInt9000) / anInt9000)
			    > i_722_)
			    i_722_ = i_723_;
			for (/**/; i_722_ < 0; i_722_++) {
			    int i_724_
				= (i_721_ >> 12) * anInt8985 + (i_720_ >> 12);
			    int i_725_ = i_719_++;
			    if (i_441_ == 0) {
				if (i == 1)
				    is[i_725_]
					= (anIntArray11408
					   [aByteArray11407[i_724_] & 0xff]);
				else if (i == 0) {
				    int i_726_
					= (anIntArray11408
					   [aByteArray11407[i_724_] & 0xff]);
				    int i_727_
					= ((i_726_ & 0xff0000) * anInt9014
					   & ~0xffffff);
				    int i_728_ = ((i_726_ & 0xff00) * anInt9015
						  & 0xff0000);
				    int i_729_
					= (i_726_ & 0xff) * anInt9018 & 0xff00;
				    is[i_725_]
					= (i_727_ | i_728_ | i_729_) >>> 8;
				} else if (i == 3) {
				    int i_730_
					= (anIntArray11408
					   [aByteArray11407[i_724_] & 0xff]);
				    int i_731_ = anInt9011;
				    int i_732_ = i_730_ + i_731_;
				    int i_733_ = ((i_730_ & 0xff00ff)
						  + (i_731_ & 0xff00ff));
				    int i_734_
					= ((i_733_ & 0x1000100)
					   + (i_732_ - i_733_ & 0x10000));
				    is[i_725_]
					= i_732_ - i_734_ | i_734_ - (i_734_
								      >>> 8);
				} else if (i == 2) {
				    int i_735_
					= (anIntArray11408
					   [aByteArray11407[i_724_] & 0xff]);
				    int i_736_
					= ((i_735_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_737_ = ((i_735_ & 0xff00) * anInt9012
						  & 0xff0000);
				    is[i_725_] = (((i_736_ | i_737_) >>> 8)
						  + anInt9019);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_441_ == 1) {
				if (i == 1) {
				    int i_738_ = aByteArray11407[i_724_];
				    if (i_738_ != 0)
					is[i_725_]
					    = anIntArray11408[i_738_ & 0xff];
				} else if (i == 0) {
				    int i_739_ = aByteArray11407[i_724_];
				    if (i_739_ != 0) {
					int i_740_
					    = anIntArray11408[i_739_ & 0xff];
					if ((anInt9011 & 0xffffff)
					    == 16777215) {
					    int i_741_ = anInt9011 >>> 24;
					    int i_742_ = 256 - i_741_;
					    int i_743_ = is[i_725_];
					    is[i_725_]
						= (((((i_740_ & 0xff00ff)
						      * i_741_)
						     + ((i_743_ & 0xff00ff)
							* i_742_))
						    & ~0xff00ff)
						   + ((((i_740_ & 0xff00)
							* i_741_)
						       + ((i_743_ & 0xff00)
							  * i_742_))
						      & 0xff0000)) >> 8;
					} else if (anInt9012 != 255) {
					    int i_744_ = (((i_740_ & 0xff0000)
							   * anInt9014)
							  & ~0xffffff);
					    int i_745_ = (((i_740_ & 0xff00)
							   * anInt9015)
							  & 0xff0000);
					    int i_746_
						= ((i_740_ & 0xff) * anInt9018
						   & 0xff00);
					    i_740_ = (i_744_ | i_745_
						      | i_746_) >>> 8;
					    int i_747_ = is[i_725_];
					    is[i_725_]
						= (((((i_740_ & 0xff00ff)
						      * anInt9012)
						     + ((i_747_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_740_ & 0xff00)
							* anInt9012)
						       + ((i_747_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					} else {
					    int i_748_ = (((i_740_ & 0xff0000)
							   * anInt9014)
							  & ~0xffffff);
					    int i_749_ = (((i_740_ & 0xff00)
							   * anInt9015)
							  & 0xff0000);
					    int i_750_
						= ((i_740_ & 0xff) * anInt9018
						   & 0xff00);
					    is[i_725_] = (i_748_ | i_749_
							  | i_750_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_751_ = aByteArray11407[i_724_];
				    int i_752_
					= (i_751_ > 0 ? anIntArray11408[i_751_]
					   : 0);
				    int i_753_ = anInt9011;
				    int i_754_ = i_752_ + i_753_;
				    int i_755_ = ((i_752_ & 0xff00ff)
						  + (i_753_ & 0xff00ff));
				    int i_756_
					= ((i_755_ & 0x1000100)
					   + (i_754_ - i_755_ & 0x10000));
				    i_756_
					= i_754_ - i_756_ | i_756_ - (i_756_
								      >>> 8);
				    if (i_752_ == 0 && anInt9012 != 255) {
					i_752_ = i_756_;
					i_756_ = is[i_725_];
					i_756_ = (((((i_752_ & 0xff00ff)
						     * anInt9012)
						    + ((i_756_ & 0xff00ff)
						       * anInt9013))
						   & ~0xff00ff)
						  + ((((i_752_ & 0xff00)
						       * anInt9012)
						      + ((i_756_ & 0xff00)
							 * anInt9013))
						     & 0xff0000)) >> 8;
				    }
				    is[i_725_] = i_756_;
				} else if (i == 2) {
				    int i_757_ = aByteArray11407[i_724_];
				    if (i_757_ != 0) {
					int i_758_
					    = anIntArray11408[i_757_ & 0xff];
					int i_759_
					    = ((i_758_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_760_
					    = ((i_758_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_725_++] = ((i_759_ | i_760_)
							>>> 8) + anInt9019;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_441_ == 2) {
				if (i == 1) {
				    int i_761_ = aByteArray11407[i_724_];
				    if (i_761_ != 0) {
					int i_762_
					    = anIntArray11408[i_761_ & 0xff];
					int i_763_ = is[i_725_];
					int i_764_ = i_762_ + i_763_;
					int i_765_ = ((i_762_ & 0xff00ff)
						      + (i_763_ & 0xff00ff));
					i_763_
					    = ((i_765_ & 0x1000100)
					       + (i_764_ - i_765_ & 0x10000));
					is[i_725_]
					    = (i_764_ - i_763_
					       | i_763_ - (i_763_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_766_ = aByteArray11407[i_724_];
				    if (i_766_ != 0) {
					int i_767_
					    = anIntArray11408[i_766_ & 0xff];
					int i_768_
					    = ((i_767_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_769_
					    = ((i_767_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_770_
					    = ((i_767_ & 0xff) * anInt9018
					       & 0xff00);
					i_767_
					    = (i_768_ | i_769_ | i_770_) >>> 8;
					int i_771_ = is[i_725_];
					int i_772_ = i_767_ + i_771_;
					int i_773_ = ((i_767_ & 0xff00ff)
						      + (i_771_ & 0xff00ff));
					i_771_
					    = ((i_773_ & 0x1000100)
					       + (i_772_ - i_773_ & 0x10000));
					is[i_725_]
					    = (i_772_ - i_771_
					       | i_771_ - (i_771_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_774_ = aByteArray11407[i_724_];
				    int i_775_
					= (i_774_ > 0 ? anIntArray11408[i_774_]
					   : 0);
				    int i_776_ = anInt9011;
				    int i_777_ = i_775_ + i_776_;
				    int i_778_ = ((i_775_ & 0xff00ff)
						  + (i_776_ & 0xff00ff));
				    int i_779_
					= ((i_778_ & 0x1000100)
					   + (i_777_ - i_778_ & 0x10000));
				    i_779_
					= i_777_ - i_779_ | i_779_ - (i_779_
								      >>> 8);
				    if (i_775_ == 0 && anInt9012 != 255) {
					i_775_ = i_779_;
					i_779_ = is[i_725_];
					i_779_ = (((((i_775_ & 0xff00ff)
						     * anInt9012)
						    + ((i_779_ & 0xff00ff)
						       * anInt9013))
						   & ~0xff00ff)
						  + ((((i_775_ & 0xff00)
						       * anInt9012)
						      + ((i_779_ & 0xff00)
							 * anInt9013))
						     & 0xff0000)) >> 8;
				    }
				    is[i_725_] = i_779_;
				} else if (i == 2) {
				    int i_780_ = aByteArray11407[i_724_];
				    if (i_780_ != 0) {
					int i_781_
					    = anIntArray11408[i_780_ & 0xff];
					int i_782_
					    = ((i_781_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_783_
					    = ((i_781_ & 0xff00) * anInt9012
					       & 0xff0000);
					i_781_ = (((i_782_ | i_783_) >>> 8)
						  + anInt9019);
					int i_784_ = is[i_725_];
					int i_785_ = i_781_ + i_784_;
					int i_786_ = ((i_781_ & 0xff00ff)
						      + (i_784_ & 0xff00ff));
					i_784_
					    = ((i_786_ & 0x1000100)
					       + (i_785_ - i_786_ & 0x10000));
					is[i_725_]
					    = (i_785_ - i_784_
					       | i_784_ - (i_784_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_720_ += anInt9001;
			    i_721_ += anInt9000;
			}
			i_718_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_787_ = anInt8998;
		    while (i_787_ < 0) {
			int i_788_ = anInt8988;
			int i_789_ = anInt9007 + anInt9009;
			int i_790_ = anInt9003 + anInt9010;
			int i_791_ = anInt8999;
			int i_792_;
			if ((i_792_ = i_789_ - (anInt8985 << 12)) >= 0) {
			    i_792_ = (anInt9001 - i_792_) / anInt9001;
			    i_791_ += i_792_;
			    i_789_ += anInt9001 * i_792_;
			    i_790_ += anInt9000 * i_792_;
			    i_788_ += i_792_;
			}
			if ((i_792_ = (i_789_ - anInt9001) / anInt9001)
			    > i_791_)
			    i_791_ = i_792_;
			if (i_790_ < 0) {
			    i_792_ = (anInt9000 - 1 - i_790_) / anInt9000;
			    i_791_ += i_792_;
			    i_789_ += anInt9001 * i_792_;
			    i_790_ += anInt9000 * i_792_;
			    i_788_ += i_792_;
			}
			if ((i_792_ = (1 + i_790_ - (anInt9002 << 12)
				       - anInt9000) / anInt9000)
			    > i_791_)
			    i_791_ = i_792_;
			for (/**/; i_791_ < 0; i_791_++) {
			    int i_793_
				= (i_790_ >> 12) * anInt8985 + (i_789_ >> 12);
			    int i_794_ = i_788_++;
			    if (i_441_ == 0) {
				if (i == 1)
				    is[i_794_]
					= (anIntArray11408
					   [aByteArray11407[i_793_] & 0xff]);
				else if (i == 0) {
				    int i_795_
					= (anIntArray11408
					   [aByteArray11407[i_793_] & 0xff]);
				    int i_796_
					= ((i_795_ & 0xff0000) * anInt9014
					   & ~0xffffff);
				    int i_797_ = ((i_795_ & 0xff00) * anInt9015
						  & 0xff0000);
				    int i_798_
					= (i_795_ & 0xff) * anInt9018 & 0xff00;
				    is[i_794_]
					= (i_796_ | i_797_ | i_798_) >>> 8;
				} else if (i == 3) {
				    int i_799_
					= (anIntArray11408
					   [aByteArray11407[i_793_] & 0xff]);
				    int i_800_ = anInt9011;
				    int i_801_ = i_799_ + i_800_;
				    int i_802_ = ((i_799_ & 0xff00ff)
						  + (i_800_ & 0xff00ff));
				    int i_803_
					= ((i_802_ & 0x1000100)
					   + (i_801_ - i_802_ & 0x10000));
				    is[i_794_]
					= i_801_ - i_803_ | i_803_ - (i_803_
								      >>> 8);
				} else if (i == 2) {
				    int i_804_
					= (anIntArray11408
					   [aByteArray11407[i_793_] & 0xff]);
				    int i_805_
					= ((i_804_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_806_ = ((i_804_ & 0xff00) * anInt9012
						  & 0xff0000);
				    is[i_794_] = (((i_805_ | i_806_) >>> 8)
						  + anInt9019);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_441_ == 1) {
				if (i == 1) {
				    int i_807_ = aByteArray11407[i_793_];
				    if (i_807_ != 0)
					is[i_794_]
					    = anIntArray11408[i_807_ & 0xff];
				} else if (i == 0) {
				    int i_808_ = aByteArray11407[i_793_];
				    if (i_808_ != 0) {
					int i_809_
					    = anIntArray11408[i_808_ & 0xff];
					if ((anInt9011 & 0xffffff)
					    == 16777215) {
					    int i_810_ = anInt9011 >>> 24;
					    int i_811_ = 256 - i_810_;
					    int i_812_ = is[i_794_];
					    is[i_794_]
						= (((((i_809_ & 0xff00ff)
						      * i_810_)
						     + ((i_812_ & 0xff00ff)
							* i_811_))
						    & ~0xff00ff)
						   + ((((i_809_ & 0xff00)
							* i_810_)
						       + ((i_812_ & 0xff00)
							  * i_811_))
						      & 0xff0000)) >> 8;
					} else if (anInt9012 != 255) {
					    int i_813_ = (((i_809_ & 0xff0000)
							   * anInt9014)
							  & ~0xffffff);
					    int i_814_ = (((i_809_ & 0xff00)
							   * anInt9015)
							  & 0xff0000);
					    int i_815_
						= ((i_809_ & 0xff) * anInt9018
						   & 0xff00);
					    i_809_ = (i_813_ | i_814_
						      | i_815_) >>> 8;
					    int i_816_ = is[i_794_];
					    is[i_794_]
						= (((((i_809_ & 0xff00ff)
						      * anInt9012)
						     + ((i_816_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_809_ & 0xff00)
							* anInt9012)
						       + ((i_816_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					} else {
					    int i_817_ = (((i_809_ & 0xff0000)
							   * anInt9014)
							  & ~0xffffff);
					    int i_818_ = (((i_809_ & 0xff00)
							   * anInt9015)
							  & 0xff0000);
					    int i_819_
						= ((i_809_ & 0xff) * anInt9018
						   & 0xff00);
					    is[i_794_] = (i_817_ | i_818_
							  | i_819_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_820_ = aByteArray11407[i_793_];
				    int i_821_
					= (i_820_ > 0 ? anIntArray11408[i_820_]
					   : 0);
				    int i_822_ = anInt9011;
				    int i_823_ = i_821_ + i_822_;
				    int i_824_ = ((i_821_ & 0xff00ff)
						  + (i_822_ & 0xff00ff));
				    int i_825_
					= ((i_824_ & 0x1000100)
					   + (i_823_ - i_824_ & 0x10000));
				    i_825_
					= i_823_ - i_825_ | i_825_ - (i_825_
								      >>> 8);
				    if (i_821_ == 0 && anInt9012 != 255) {
					i_821_ = i_825_;
					i_825_ = is[i_794_];
					i_825_ = (((((i_821_ & 0xff00ff)
						     * anInt9012)
						    + ((i_825_ & 0xff00ff)
						       * anInt9013))
						   & ~0xff00ff)
						  + ((((i_821_ & 0xff00)
						       * anInt9012)
						      + ((i_825_ & 0xff00)
							 * anInt9013))
						     & 0xff0000)) >> 8;
				    }
				    is[i_794_] = i_825_;
				} else if (i == 2) {
				    int i_826_ = aByteArray11407[i_793_];
				    if (i_826_ != 0) {
					int i_827_
					    = anIntArray11408[i_826_ & 0xff];
					int i_828_
					    = ((i_827_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_829_
					    = ((i_827_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_794_++] = ((i_828_ | i_829_)
							>>> 8) + anInt9019;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_441_ == 2) {
				if (i == 1) {
				    int i_830_ = aByteArray11407[i_793_];
				    if (i_830_ != 0) {
					int i_831_
					    = anIntArray11408[i_830_ & 0xff];
					int i_832_ = is[i_794_];
					int i_833_ = i_831_ + i_832_;
					int i_834_ = ((i_831_ & 0xff00ff)
						      + (i_832_ & 0xff00ff));
					i_832_
					    = ((i_834_ & 0x1000100)
					       + (i_833_ - i_834_ & 0x10000));
					is[i_794_]
					    = (i_833_ - i_832_
					       | i_832_ - (i_832_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_835_ = aByteArray11407[i_793_];
				    if (i_835_ != 0) {
					int i_836_
					    = anIntArray11408[i_835_ & 0xff];
					int i_837_
					    = ((i_836_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_838_
					    = ((i_836_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_839_
					    = ((i_836_ & 0xff) * anInt9018
					       & 0xff00);
					i_836_
					    = (i_837_ | i_838_ | i_839_) >>> 8;
					int i_840_ = is[i_794_];
					int i_841_ = i_836_ + i_840_;
					int i_842_ = ((i_836_ & 0xff00ff)
						      + (i_840_ & 0xff00ff));
					i_840_
					    = ((i_842_ & 0x1000100)
					       + (i_841_ - i_842_ & 0x10000));
					is[i_794_]
					    = (i_841_ - i_840_
					       | i_840_ - (i_840_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_843_ = aByteArray11407[i_793_];
				    int i_844_
					= (i_843_ > 0 ? anIntArray11408[i_843_]
					   : 0);
				    int i_845_ = anInt9011;
				    int i_846_ = i_844_ + i_845_;
				    int i_847_ = ((i_844_ & 0xff00ff)
						  + (i_845_ & 0xff00ff));
				    int i_848_
					= ((i_847_ & 0x1000100)
					   + (i_846_ - i_847_ & 0x10000));
				    i_848_
					= i_846_ - i_848_ | i_848_ - (i_848_
								      >>> 8);
				    if (i_844_ == 0 && anInt9012 != 255) {
					i_844_ = i_848_;
					i_848_ = is[i_794_];
					i_848_ = (((((i_844_ & 0xff00ff)
						     * anInt9012)
						    + ((i_848_ & 0xff00ff)
						       * anInt9013))
						   & ~0xff00ff)
						  + ((((i_844_ & 0xff00)
						       * anInt9012)
						      + ((i_848_ & 0xff00)
							 * anInt9013))
						     & 0xff0000)) >> 8;
				    }
				    is[i_794_] = i_848_;
				} else if (i == 2) {
				    int i_849_ = aByteArray11407[i_793_];
				    if (i_849_ != 0) {
					int i_850_
					    = anIntArray11408[i_849_ & 0xff];
					int i_851_
					    = ((i_850_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_852_
					    = ((i_850_ & 0xff00) * anInt9012
					       & 0xff0000);
					i_850_ = (((i_851_ | i_852_) >>> 8)
						  + anInt9019);
					int i_853_ = is[i_794_];
					int i_854_ = i_850_ + i_853_;
					int i_855_ = ((i_850_ & 0xff00ff)
						      + (i_853_ & 0xff00ff));
					i_853_
					    = ((i_855_ & 0x1000100)
					       + (i_854_ - i_855_ & 0x10000));
					is[i_794_]
					    = (i_854_ - i_853_
					       | i_853_ - (i_853_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_789_ += anInt9001;
			    i_790_ += anInt9000;
			}
			i_787_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9000 == 0) {
		int i_856_ = anInt8998;
		while (i_856_ < 0) {
		    int i_857_ = anInt8988;
		    int i_858_ = anInt9007 + anInt9009;
		    int i_859_ = anInt9003;
		    int i_860_ = anInt8999;
		    if (i_859_ >= 0 && i_859_ - (anInt9002 << 12) < 0) {
			if (i_858_ < 0) {
			    int i_861_ = (anInt9001 - 1 - i_858_) / anInt9001;
			    i_860_ += i_861_;
			    i_858_ += anInt9001 * i_861_;
			    i_857_ += i_861_;
			}
			int i_862_;
			if ((i_862_ = (1 + i_858_ - (anInt8985 << 12)
				       - anInt9001) / anInt9001)
			    > i_860_)
			    i_860_ = i_862_;
			for (/**/; i_860_ < 0; i_860_++) {
			    int i_863_
				= (i_859_ >> 12) * anInt8985 + (i_858_ >> 12);
			    int i_864_ = i_857_++;
			    if (i_441_ == 0) {
				if (i == 1)
				    is[i_864_]
					= (anIntArray11408
					   [aByteArray11407[i_863_] & 0xff]);
				else if (i == 0) {
				    int i_865_
					= (anIntArray11408
					   [aByteArray11407[i_863_] & 0xff]);
				    int i_866_
					= ((i_865_ & 0xff0000) * anInt9014
					   & ~0xffffff);
				    int i_867_ = ((i_865_ & 0xff00) * anInt9015
						  & 0xff0000);
				    int i_868_
					= (i_865_ & 0xff) * anInt9018 & 0xff00;
				    is[i_864_]
					= (i_866_ | i_867_ | i_868_) >>> 8;
				} else if (i == 3) {
				    int i_869_
					= (anIntArray11408
					   [aByteArray11407[i_863_] & 0xff]);
				    int i_870_ = anInt9011;
				    int i_871_ = i_869_ + i_870_;
				    int i_872_ = ((i_869_ & 0xff00ff)
						  + (i_870_ & 0xff00ff));
				    int i_873_
					= ((i_872_ & 0x1000100)
					   + (i_871_ - i_872_ & 0x10000));
				    is[i_864_]
					= i_871_ - i_873_ | i_873_ - (i_873_
								      >>> 8);
				} else if (i == 2) {
				    int i_874_
					= (anIntArray11408
					   [aByteArray11407[i_863_] & 0xff]);
				    int i_875_
					= ((i_874_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_876_ = ((i_874_ & 0xff00) * anInt9012
						  & 0xff0000);
				    is[i_864_] = (((i_875_ | i_876_) >>> 8)
						  + anInt9019);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_441_ == 1) {
				if (i == 1) {
				    int i_877_ = aByteArray11407[i_863_];
				    if (i_877_ != 0)
					is[i_864_]
					    = anIntArray11408[i_877_ & 0xff];
				} else if (i == 0) {
				    int i_878_ = aByteArray11407[i_863_];
				    if (i_878_ != 0) {
					int i_879_
					    = anIntArray11408[i_878_ & 0xff];
					if ((anInt9011 & 0xffffff)
					    == 16777215) {
					    int i_880_ = anInt9011 >>> 24;
					    int i_881_ = 256 - i_880_;
					    int i_882_ = is[i_864_];
					    is[i_864_]
						= (((((i_879_ & 0xff00ff)
						      * i_880_)
						     + ((i_882_ & 0xff00ff)
							* i_881_))
						    & ~0xff00ff)
						   + ((((i_879_ & 0xff00)
							* i_880_)
						       + ((i_882_ & 0xff00)
							  * i_881_))
						      & 0xff0000)) >> 8;
					} else if (anInt9012 != 255) {
					    int i_883_ = (((i_879_ & 0xff0000)
							   * anInt9014)
							  & ~0xffffff);
					    int i_884_ = (((i_879_ & 0xff00)
							   * anInt9015)
							  & 0xff0000);
					    int i_885_
						= ((i_879_ & 0xff) * anInt9018
						   & 0xff00);
					    i_879_ = (i_883_ | i_884_
						      | i_885_) >>> 8;
					    int i_886_ = is[i_864_];
					    is[i_864_]
						= (((((i_879_ & 0xff00ff)
						      * anInt9012)
						     + ((i_886_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_879_ & 0xff00)
							* anInt9012)
						       + ((i_886_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					} else {
					    int i_887_ = (((i_879_ & 0xff0000)
							   * anInt9014)
							  & ~0xffffff);
					    int i_888_ = (((i_879_ & 0xff00)
							   * anInt9015)
							  & 0xff0000);
					    int i_889_
						= ((i_879_ & 0xff) * anInt9018
						   & 0xff00);
					    is[i_864_] = (i_887_ | i_888_
							  | i_889_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_890_ = aByteArray11407[i_863_];
				    int i_891_
					= (i_890_ > 0 ? anIntArray11408[i_890_]
					   : 0);
				    int i_892_ = anInt9011;
				    int i_893_ = i_891_ + i_892_;
				    int i_894_ = ((i_891_ & 0xff00ff)
						  + (i_892_ & 0xff00ff));
				    int i_895_
					= ((i_894_ & 0x1000100)
					   + (i_893_ - i_894_ & 0x10000));
				    i_895_
					= i_893_ - i_895_ | i_895_ - (i_895_
								      >>> 8);
				    if (i_891_ == 0 && anInt9012 != 255) {
					i_891_ = i_895_;
					i_895_ = is[i_864_];
					i_895_ = (((((i_891_ & 0xff00ff)
						     * anInt9012)
						    + ((i_895_ & 0xff00ff)
						       * anInt9013))
						   & ~0xff00ff)
						  + ((((i_891_ & 0xff00)
						       * anInt9012)
						      + ((i_895_ & 0xff00)
							 * anInt9013))
						     & 0xff0000)) >> 8;
				    }
				    is[i_864_] = i_895_;
				} else if (i == 2) {
				    int i_896_ = aByteArray11407[i_863_];
				    if (i_896_ != 0) {
					int i_897_
					    = anIntArray11408[i_896_ & 0xff];
					int i_898_
					    = ((i_897_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_899_
					    = ((i_897_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_864_++] = ((i_898_ | i_899_)
							>>> 8) + anInt9019;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_441_ == 2) {
				if (i == 1) {
				    int i_900_ = aByteArray11407[i_863_];
				    if (i_900_ != 0) {
					int i_901_
					    = anIntArray11408[i_900_ & 0xff];
					int i_902_ = is[i_864_];
					int i_903_ = i_901_ + i_902_;
					int i_904_ = ((i_901_ & 0xff00ff)
						      + (i_902_ & 0xff00ff));
					i_902_
					    = ((i_904_ & 0x1000100)
					       + (i_903_ - i_904_ & 0x10000));
					is[i_864_]
					    = (i_903_ - i_902_
					       | i_902_ - (i_902_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_905_ = aByteArray11407[i_863_];
				    if (i_905_ != 0) {
					int i_906_
					    = anIntArray11408[i_905_ & 0xff];
					int i_907_
					    = ((i_906_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_908_
					    = ((i_906_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_909_
					    = ((i_906_ & 0xff) * anInt9018
					       & 0xff00);
					i_906_
					    = (i_907_ | i_908_ | i_909_) >>> 8;
					int i_910_ = is[i_864_];
					int i_911_ = i_906_ + i_910_;
					int i_912_ = ((i_906_ & 0xff00ff)
						      + (i_910_ & 0xff00ff));
					i_910_
					    = ((i_912_ & 0x1000100)
					       + (i_911_ - i_912_ & 0x10000));
					is[i_864_]
					    = (i_911_ - i_910_
					       | i_910_ - (i_910_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_913_ = aByteArray11407[i_863_];
				    int i_914_
					= (i_913_ > 0 ? anIntArray11408[i_913_]
					   : 0);
				    int i_915_ = anInt9011;
				    int i_916_ = i_914_ + i_915_;
				    int i_917_ = ((i_914_ & 0xff00ff)
						  + (i_915_ & 0xff00ff));
				    int i_918_
					= ((i_917_ & 0x1000100)
					   + (i_916_ - i_917_ & 0x10000));
				    i_918_
					= i_916_ - i_918_ | i_918_ - (i_918_
								      >>> 8);
				    if (i_914_ == 0 && anInt9012 != 255) {
					i_914_ = i_918_;
					i_918_ = is[i_864_];
					i_918_ = (((((i_914_ & 0xff00ff)
						     * anInt9012)
						    + ((i_918_ & 0xff00ff)
						       * anInt9013))
						   & ~0xff00ff)
						  + ((((i_914_ & 0xff00)
						       * anInt9012)
						      + ((i_918_ & 0xff00)
							 * anInt9013))
						     & 0xff0000)) >> 8;
				    }
				    is[i_864_] = i_918_;
				} else if (i == 2) {
				    int i_919_ = aByteArray11407[i_863_];
				    if (i_919_ != 0) {
					int i_920_
					    = anIntArray11408[i_919_ & 0xff];
					int i_921_
					    = ((i_920_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_922_
					    = ((i_920_ & 0xff00) * anInt9012
					       & 0xff0000);
					i_920_ = (((i_921_ | i_922_) >>> 8)
						  + anInt9019);
					int i_923_ = is[i_864_];
					int i_924_ = i_920_ + i_923_;
					int i_925_ = ((i_920_ & 0xff00ff)
						      + (i_923_ & 0xff00ff));
					i_923_
					    = ((i_925_ & 0x1000100)
					       + (i_924_ - i_925_ & 0x10000));
					is[i_864_]
					    = (i_924_ - i_923_
					       | i_923_ - (i_923_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_858_ += anInt9001;
			}
		    }
		    i_856_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else if (anInt9000 < 0) {
		for (int i_926_ = anInt8998; i_926_ < 0; i_926_++) {
		    int i_927_ = anInt8988;
		    int i_928_ = anInt9007 + anInt9009;
		    int i_929_ = anInt9003 + anInt9010;
		    int i_930_ = anInt8999;
		    if (i_928_ < 0) {
			int i_931_ = (anInt9001 - 1 - i_928_) / anInt9001;
			i_930_ += i_931_;
			i_928_ += anInt9001 * i_931_;
			i_929_ += anInt9000 * i_931_;
			i_927_ += i_931_;
		    }
		    int i_932_;
		    if ((i_932_ = ((1 + i_928_ - (anInt8985 << 12) - anInt9001)
				   / anInt9001))
			> i_930_)
			i_930_ = i_932_;
		    if ((i_932_ = i_929_ - (anInt9002 << 12)) >= 0) {
			i_932_ = (anInt9000 - i_932_) / anInt9000;
			i_930_ += i_932_;
			i_928_ += anInt9001 * i_932_;
			i_929_ += anInt9000 * i_932_;
			i_927_ += i_932_;
		    }
		    if ((i_932_ = (i_929_ - anInt9000) / anInt9000) > i_930_)
			i_930_ = i_932_;
		    for (/**/; i_930_ < 0; i_930_++) {
			int i_933_
			    = (i_929_ >> 12) * anInt8985 + (i_928_ >> 12);
			int i_934_ = i_927_++;
			if (i_441_ == 0) {
			    if (i == 1)
				is[i_934_]
				    = (anIntArray11408
				       [aByteArray11407[i_933_] & 0xff]);
			    else if (i == 0) {
				int i_935_
				    = (anIntArray11408
				       [aByteArray11407[i_933_] & 0xff]);
				int i_936_ = ((i_935_ & 0xff0000) * anInt9014
					      & ~0xffffff);
				int i_937_
				    = (i_935_ & 0xff00) * anInt9015 & 0xff0000;
				int i_938_
				    = (i_935_ & 0xff) * anInt9018 & 0xff00;
				is[i_934_] = (i_936_ | i_937_ | i_938_) >>> 8;
			    } else if (i == 3) {
				int i_939_
				    = (anIntArray11408
				       [aByteArray11407[i_933_] & 0xff]);
				int i_940_ = anInt9011;
				int i_941_ = i_939_ + i_940_;
				int i_942_ = ((i_939_ & 0xff00ff)
					      + (i_940_ & 0xff00ff));
				int i_943_ = ((i_942_ & 0x1000100)
					      + (i_941_ - i_942_ & 0x10000));
				is[i_934_]
				    = i_941_ - i_943_ | i_943_ - (i_943_
								  >>> 8);
			    } else if (i == 2) {
				int i_944_
				    = (anIntArray11408
				       [aByteArray11407[i_933_] & 0xff]);
				int i_945_ = ((i_944_ & 0xff00ff) * anInt9012
					      & ~0xff00ff);
				int i_946_
				    = (i_944_ & 0xff00) * anInt9012 & 0xff0000;
				is[i_934_]
				    = ((i_945_ | i_946_) >>> 8) + anInt9019;
			    } else
				throw new IllegalArgumentException();
			} else if (i_441_ == 1) {
			    if (i == 1) {
				int i_947_ = aByteArray11407[i_933_];
				if (i_947_ != 0)
				    is[i_934_]
					= anIntArray11408[i_947_ & 0xff];
			    } else if (i == 0) {
				int i_948_ = aByteArray11407[i_933_];
				if (i_948_ != 0) {
				    int i_949_
					= anIntArray11408[i_948_ & 0xff];
				    if ((anInt9011 & 0xffffff) == 16777215) {
					int i_950_ = anInt9011 >>> 24;
					int i_951_ = 256 - i_950_;
					int i_952_ = is[i_934_];
					is[i_934_]
					    = ((((i_949_ & 0xff00ff) * i_950_
						 + ((i_952_ & 0xff00ff)
						    * i_951_))
						& ~0xff00ff)
					       + (((i_949_ & 0xff00) * i_950_
						   + ((i_952_ & 0xff00)
						      * i_951_))
						  & 0xff0000)) >> 8;
				    } else if (anInt9012 != 255) {
					int i_953_
					    = ((i_949_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_954_
					    = ((i_949_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_955_
					    = ((i_949_ & 0xff) * anInt9018
					       & 0xff00);
					i_949_
					    = (i_953_ | i_954_ | i_955_) >>> 8;
					int i_956_ = is[i_934_];
					is[i_934_] = (((((i_949_ & 0xff00ff)
							 * anInt9012)
							+ ((i_956_ & 0xff00ff)
							   * anInt9013))
						       & ~0xff00ff)
						      + ((((i_949_ & 0xff00)
							   * anInt9012)
							  + ((i_956_ & 0xff00)
							     * anInt9013))
							 & 0xff0000)) >> 8;
				    } else {
					int i_957_
					    = ((i_949_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_958_
					    = ((i_949_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_959_
					    = ((i_949_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_934_]
					    = (i_957_ | i_958_ | i_959_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_960_ = aByteArray11407[i_933_];
				int i_961_
				    = i_960_ > 0 ? anIntArray11408[i_960_] : 0;
				int i_962_ = anInt9011;
				int i_963_ = i_961_ + i_962_;
				int i_964_ = ((i_961_ & 0xff00ff)
					      + (i_962_ & 0xff00ff));
				int i_965_ = ((i_964_ & 0x1000100)
					      + (i_963_ - i_964_ & 0x10000));
				i_965_ = i_963_ - i_965_ | i_965_ - (i_965_
								     >>> 8);
				if (i_961_ == 0 && anInt9012 != 255) {
				    i_961_ = i_965_;
				    i_965_ = is[i_934_];
				    i_965_
					= ((((i_961_ & 0xff00ff) * anInt9012
					     + (i_965_ & 0xff00ff) * anInt9013)
					    & ~0xff00ff)
					   + (((i_961_ & 0xff00) * anInt9012
					       + (i_965_ & 0xff00) * anInt9013)
					      & 0xff0000)) >> 8;
				}
				is[i_934_] = i_965_;
			    } else if (i == 2) {
				int i_966_ = aByteArray11407[i_933_];
				if (i_966_ != 0) {
				    int i_967_
					= anIntArray11408[i_966_ & 0xff];
				    int i_968_
					= ((i_967_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_969_ = ((i_967_ & 0xff00) * anInt9012
						  & 0xff0000);
				    is[i_934_++] = (((i_968_ | i_969_) >>> 8)
						    + anInt9019);
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_441_ == 2) {
			    if (i == 1) {
				int i_970_ = aByteArray11407[i_933_];
				if (i_970_ != 0) {
				    int i_971_
					= anIntArray11408[i_970_ & 0xff];
				    int i_972_ = is[i_934_];
				    int i_973_ = i_971_ + i_972_;
				    int i_974_ = ((i_971_ & 0xff00ff)
						  + (i_972_ & 0xff00ff));
				    i_972_ = ((i_974_ & 0x1000100)
					      + (i_973_ - i_974_ & 0x10000));
				    is[i_934_]
					= i_973_ - i_972_ | i_972_ - (i_972_
								      >>> 8);
				}
			    } else if (i == 0) {
				int i_975_ = aByteArray11407[i_933_];
				if (i_975_ != 0) {
				    int i_976_
					= anIntArray11408[i_975_ & 0xff];
				    int i_977_
					= ((i_976_ & 0xff0000) * anInt9014
					   & ~0xffffff);
				    int i_978_ = ((i_976_ & 0xff00) * anInt9015
						  & 0xff0000);
				    int i_979_
					= (i_976_ & 0xff) * anInt9018 & 0xff00;
				    i_976_ = (i_977_ | i_978_ | i_979_) >>> 8;
				    int i_980_ = is[i_934_];
				    int i_981_ = i_976_ + i_980_;
				    int i_982_ = ((i_976_ & 0xff00ff)
						  + (i_980_ & 0xff00ff));
				    i_980_ = ((i_982_ & 0x1000100)
					      + (i_981_ - i_982_ & 0x10000));
				    is[i_934_]
					= i_981_ - i_980_ | i_980_ - (i_980_
								      >>> 8);
				}
			    } else if (i == 3) {
				byte i_983_ = aByteArray11407[i_933_];
				int i_984_
				    = i_983_ > 0 ? anIntArray11408[i_983_] : 0;
				int i_985_ = anInt9011;
				int i_986_ = i_984_ + i_985_;
				int i_987_ = ((i_984_ & 0xff00ff)
					      + (i_985_ & 0xff00ff));
				int i_988_ = ((i_987_ & 0x1000100)
					      + (i_986_ - i_987_ & 0x10000));
				i_988_ = i_986_ - i_988_ | i_988_ - (i_988_
								     >>> 8);
				if (i_984_ == 0 && anInt9012 != 255) {
				    i_984_ = i_988_;
				    i_988_ = is[i_934_];
				    i_988_
					= ((((i_984_ & 0xff00ff) * anInt9012
					     + (i_988_ & 0xff00ff) * anInt9013)
					    & ~0xff00ff)
					   + (((i_984_ & 0xff00) * anInt9012
					       + (i_988_ & 0xff00) * anInt9013)
					      & 0xff0000)) >> 8;
				}
				is[i_934_] = i_988_;
			    } else if (i == 2) {
				int i_989_ = aByteArray11407[i_933_];
				if (i_989_ != 0) {
				    int i_990_
					= anIntArray11408[i_989_ & 0xff];
				    int i_991_
					= ((i_990_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_992_ = ((i_990_ & 0xff00) * anInt9012
						  & 0xff0000);
				    i_990_ = (((i_991_ | i_992_) >>> 8)
					      + anInt9019);
				    int i_993_ = is[i_934_];
				    int i_994_ = i_990_ + i_993_;
				    int i_995_ = ((i_990_ & 0xff00ff)
						  + (i_993_ & 0xff00ff));
				    i_993_ = ((i_995_ & 0x1000100)
					      + (i_994_ - i_995_ & 0x10000));
				    is[i_934_]
					= i_994_ - i_993_ | i_993_ - (i_993_
								      >>> 8);
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_928_ += anInt9001;
			i_929_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else {
		for (int i_996_ = anInt8998; i_996_ < 0; i_996_++) {
		    int i_997_ = anInt8988;
		    int i_998_ = anInt9007 + anInt9009;
		    int i_999_ = anInt9003 + anInt9010;
		    int i_1000_ = anInt8999;
		    if (i_998_ < 0) {
			int i_1001_ = (anInt9001 - 1 - i_998_) / anInt9001;
			i_1000_ += i_1001_;
			i_998_ += anInt9001 * i_1001_;
			i_999_ += anInt9000 * i_1001_;
			i_997_ += i_1001_;
		    }
		    int i_1002_;
		    if ((i_1002_ = (1 + i_998_ - (anInt8985 << 12)
				    - anInt9001) / anInt9001)
			> i_1000_)
			i_1000_ = i_1002_;
		    if (i_999_ < 0) {
			i_1002_ = (anInt9000 - 1 - i_999_) / anInt9000;
			i_1000_ += i_1002_;
			i_998_ += anInt9001 * i_1002_;
			i_999_ += anInt9000 * i_1002_;
			i_997_ += i_1002_;
		    }
		    if ((i_1002_ = (1 + i_999_ - (anInt9002 << 12)
				    - anInt9000) / anInt9000)
			> i_1000_)
			i_1000_ = i_1002_;
		    for (/**/; i_1000_ < 0; i_1000_++) {
			int i_1003_
			    = (i_999_ >> 12) * anInt8985 + (i_998_ >> 12);
			int i_1004_ = i_997_++;
			if (i_441_ == 0) {
			    if (i == 1)
				is[i_1004_]
				    = (anIntArray11408
				       [aByteArray11407[i_1003_] & 0xff]);
			    else if (i == 0) {
				int i_1005_
				    = (anIntArray11408
				       [aByteArray11407[i_1003_] & 0xff]);
				int i_1006_ = ((i_1005_ & 0xff0000) * anInt9014
					       & ~0xffffff);
				int i_1007_ = ((i_1005_ & 0xff00) * anInt9015
					       & 0xff0000);
				int i_1008_
				    = (i_1005_ & 0xff) * anInt9018 & 0xff00;
				is[i_1004_]
				    = (i_1006_ | i_1007_ | i_1008_) >>> 8;
			    } else if (i == 3) {
				int i_1009_
				    = (anIntArray11408
				       [aByteArray11407[i_1003_] & 0xff]);
				int i_1010_ = anInt9011;
				int i_1011_ = i_1009_ + i_1010_;
				int i_1012_ = ((i_1009_ & 0xff00ff)
					       + (i_1010_ & 0xff00ff));
				int i_1013_
				    = ((i_1012_ & 0x1000100)
				       + (i_1011_ - i_1012_ & 0x10000));
				is[i_1004_]
				    = i_1011_ - i_1013_ | i_1013_ - (i_1013_
								     >>> 8);
			    } else if (i == 2) {
				int i_1014_
				    = (anIntArray11408
				       [aByteArray11407[i_1003_] & 0xff]);
				int i_1015_ = ((i_1014_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
				int i_1016_ = ((i_1014_ & 0xff00) * anInt9012
					       & 0xff0000);
				is[i_1004_]
				    = ((i_1015_ | i_1016_) >>> 8) + anInt9019;
			    } else
				throw new IllegalArgumentException();
			} else if (i_441_ == 1) {
			    if (i == 1) {
				int i_1017_ = aByteArray11407[i_1003_];
				if (i_1017_ != 0)
				    is[i_1004_]
					= anIntArray11408[i_1017_ & 0xff];
			    } else if (i == 0) {
				int i_1018_ = aByteArray11407[i_1003_];
				if (i_1018_ != 0) {
				    int i_1019_
					= anIntArray11408[i_1018_ & 0xff];
				    if ((anInt9011 & 0xffffff) == 16777215) {
					int i_1020_ = anInt9011 >>> 24;
					int i_1021_ = 256 - i_1020_;
					int i_1022_ = is[i_1004_];
					is[i_1004_]
					    = ((((i_1019_ & 0xff00ff) * i_1020_
						 + ((i_1022_ & 0xff00ff)
						    * i_1021_))
						& ~0xff00ff)
					       + (((i_1019_ & 0xff00) * i_1020_
						   + ((i_1022_ & 0xff00)
						      * i_1021_))
						  & 0xff0000)) >> 8;
				    } else if (anInt9012 != 255) {
					int i_1023_
					    = ((i_1019_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_1024_
					    = ((i_1019_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_1025_
					    = ((i_1019_ & 0xff) * anInt9018
					       & 0xff00);
					i_1019_ = (i_1023_ | i_1024_
						   | i_1025_) >>> 8;
					int i_1026_ = is[i_1004_];
					is[i_1004_]
					    = (((((i_1019_ & 0xff00ff)
						  * anInt9012)
						 + ((i_1026_ & 0xff00ff)
						    * anInt9013))
						& ~0xff00ff)
					       + ((((i_1019_ & 0xff00)
						    * anInt9012)
						   + ((i_1026_ & 0xff00)
						      * anInt9013))
						  & 0xff0000)) >> 8;
				    } else {
					int i_1027_
					    = ((i_1019_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_1028_
					    = ((i_1019_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_1029_
					    = ((i_1019_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_1004_] = (i_1027_ | i_1028_
						       | i_1029_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_1030_ = aByteArray11407[i_1003_];
				int i_1031_ = (i_1030_ > 0
					       ? anIntArray11408[i_1030_] : 0);
				int i_1032_ = anInt9011;
				int i_1033_ = i_1031_ + i_1032_;
				int i_1034_ = ((i_1031_ & 0xff00ff)
					       + (i_1032_ & 0xff00ff));
				int i_1035_
				    = ((i_1034_ & 0x1000100)
				       + (i_1033_ - i_1034_ & 0x10000));
				i_1035_
				    = i_1033_ - i_1035_ | i_1035_ - (i_1035_
								     >>> 8);
				if (i_1031_ == 0 && anInt9012 != 255) {
				    i_1031_ = i_1035_;
				    i_1035_ = is[i_1004_];
				    i_1035_
					= ((((i_1031_ & 0xff00ff) * anInt9012
					     + ((i_1035_ & 0xff00ff)
						* anInt9013))
					    & ~0xff00ff)
					   + (((i_1031_ & 0xff00) * anInt9012
					       + ((i_1035_ & 0xff00)
						  * anInt9013))
					      & 0xff0000)) >> 8;
				}
				is[i_1004_] = i_1035_;
			    } else if (i == 2) {
				int i_1036_ = aByteArray11407[i_1003_];
				if (i_1036_ != 0) {
				    int i_1037_
					= anIntArray11408[i_1036_ & 0xff];
				    int i_1038_
					= ((i_1037_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_1039_
					= ((i_1037_ & 0xff00) * anInt9012
					   & 0xff0000);
				    is[i_1004_++] = ((i_1038_ | i_1039_)
						     >>> 8) + anInt9019;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_441_ == 2) {
			    if (i == 1) {
				int i_1040_ = aByteArray11407[i_1003_];
				if (i_1040_ != 0) {
				    int i_1041_
					= anIntArray11408[i_1040_ & 0xff];
				    int i_1042_ = is[i_1004_];
				    int i_1043_ = i_1041_ + i_1042_;
				    int i_1044_ = ((i_1041_ & 0xff00ff)
						   + (i_1042_ & 0xff00ff));
				    i_1042_
					= ((i_1044_ & 0x1000100)
					   + (i_1043_ - i_1044_ & 0x10000));
				    is[i_1004_]
					= (i_1043_ - i_1042_
					   | i_1042_ - (i_1042_ >>> 8));
				}
			    } else if (i == 0) {
				int i_1045_ = aByteArray11407[i_1003_];
				if (i_1045_ != 0) {
				    int i_1046_
					= anIntArray11408[i_1045_ & 0xff];
				    int i_1047_
					= ((i_1046_ & 0xff0000) * anInt9014
					   & ~0xffffff);
				    int i_1048_
					= ((i_1046_ & 0xff00) * anInt9015
					   & 0xff0000);
				    int i_1049_ = ((i_1046_ & 0xff) * anInt9018
						   & 0xff00);
				    i_1046_
					= (i_1047_ | i_1048_ | i_1049_) >>> 8;
				    int i_1050_ = is[i_1004_];
				    int i_1051_ = i_1046_ + i_1050_;
				    int i_1052_ = ((i_1046_ & 0xff00ff)
						   + (i_1050_ & 0xff00ff));
				    i_1050_
					= ((i_1052_ & 0x1000100)
					   + (i_1051_ - i_1052_ & 0x10000));
				    is[i_1004_]
					= (i_1051_ - i_1050_
					   | i_1050_ - (i_1050_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_1053_ = aByteArray11407[i_1003_];
				int i_1054_ = (i_1053_ > 0
					       ? anIntArray11408[i_1053_] : 0);
				int i_1055_ = anInt9011;
				int i_1056_ = i_1054_ + i_1055_;
				int i_1057_ = ((i_1054_ & 0xff00ff)
					       + (i_1055_ & 0xff00ff));
				int i_1058_
				    = ((i_1057_ & 0x1000100)
				       + (i_1056_ - i_1057_ & 0x10000));
				i_1058_
				    = i_1056_ - i_1058_ | i_1058_ - (i_1058_
								     >>> 8);
				if (i_1054_ == 0 && anInt9012 != 255) {
				    i_1054_ = i_1058_;
				    i_1058_ = is[i_1004_];
				    i_1058_
					= ((((i_1054_ & 0xff00ff) * anInt9012
					     + ((i_1058_ & 0xff00ff)
						* anInt9013))
					    & ~0xff00ff)
					   + (((i_1054_ & 0xff00) * anInt9012
					       + ((i_1058_ & 0xff00)
						  * anInt9013))
					      & 0xff0000)) >> 8;
				}
				is[i_1004_] = i_1058_;
			    } else if (i == 2) {
				int i_1059_ = aByteArray11407[i_1003_];
				if (i_1059_ != 0) {
				    int i_1060_
					= anIntArray11408[i_1059_ & 0xff];
				    int i_1061_
					= ((i_1060_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_1062_
					= ((i_1060_ & 0xff00) * anInt9012
					   & 0xff0000);
				    i_1060_ = (((i_1061_ | i_1062_) >>> 8)
					       + anInt9019);
				    int i_1063_ = is[i_1004_];
				    int i_1064_ = i_1060_ + i_1063_;
				    int i_1065_ = ((i_1060_ & 0xff00ff)
						   + (i_1063_ & 0xff00ff));
				    i_1063_
					= ((i_1065_ & 0x1000100)
					   + (i_1064_ - i_1065_ & 0x10000));
				    is[i_1004_]
					= (i_1064_ - i_1063_
					   | i_1063_ - (i_1063_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_998_ += anInt9001;
			i_999_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    }
	}
    }
    
    public void method2685(int i, int i_1066_, Class145 class145, int i_1067_,
			   int i_1068_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    i += anInt8987;
	    i_1066_ += anInt8989;
	    int i_1069_ = 0;
	    int i_1070_ = aClass185_Sub2_9016.anInt9356 * 356365251;
	    int i_1071_ = anInt8985;
	    int i_1072_ = anInt9002;
	    int i_1073_ = i_1070_ - i_1071_;
	    int i_1074_ = 0;
	    int i_1075_ = i + i_1066_ * i_1070_;
	    if (i_1066_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		int i_1076_
		    = aClass185_Sub2_9016.anInt9344 * 9823353 - i_1066_;
		i_1072_ -= i_1076_;
		i_1066_ = aClass185_Sub2_9016.anInt9344 * 9823353;
		i_1069_ += i_1076_ * i_1071_;
		i_1075_ += i_1076_ * i_1070_;
	    }
	    if (i_1066_ + i_1072_ > aClass185_Sub2_9016.anInt9345 * 639238427)
		i_1072_ -= (i_1066_ + i_1072_
			    - aClass185_Sub2_9016.anInt9345 * 639238427);
	    if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		int i_1077_ = aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		i_1071_ -= i_1077_;
		i = aClass185_Sub2_9016.anInt9365 * 1709859847;
		i_1069_ += i_1077_;
		i_1075_ += i_1077_;
		i_1074_ += i_1077_;
		i_1073_ += i_1077_;
	    }
	    if (i + i_1071_ > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		int i_1078_ = (i + i_1071_
			       - aClass185_Sub2_9016.anInt9343 * -1807368365);
		i_1071_ -= i_1078_;
		i_1074_ += i_1078_;
		i_1073_ += i_1078_;
	    }
	    if (i_1071_ > 0 && i_1072_ > 0) {
		Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
		int[] is_1079_ = class145_sub2.anIntArray9797;
		int[] is_1080_ = class145_sub2.anIntArray9798;
		int i_1081_ = i_1066_;
		if (i_1068_ > i_1081_) {
		    i_1081_ = i_1068_;
		    i_1075_ += (i_1068_ - i_1066_) * i_1070_;
		    i_1069_ += (i_1068_ - i_1066_) * anInt8985;
		}
		int i_1082_
		    = (i_1068_ + is_1079_.length < i_1066_ + i_1072_
		       ? i_1068_ + is_1079_.length : i_1066_ + i_1072_);
		for (int i_1083_ = i_1081_; i_1083_ < i_1082_; i_1083_++) {
		    int i_1084_ = is_1079_[i_1083_ - i_1068_] + i_1067_;
		    int i_1085_ = is_1080_[i_1083_ - i_1068_];
		    int i_1086_ = i_1071_;
		    if (i > i_1084_) {
			int i_1087_ = i - i_1084_;
			if (i_1087_ >= i_1085_) {
			    i_1069_ += i_1071_ + i_1074_;
			    i_1075_ += i_1071_ + i_1073_;
			    continue;
			}
			i_1085_ -= i_1087_;
		    } else {
			int i_1088_ = i_1084_ - i;
			if (i_1088_ >= i_1071_) {
			    i_1069_ += i_1071_ + i_1074_;
			    i_1075_ += i_1071_ + i_1073_;
			    continue;
			}
			i_1069_ += i_1088_;
			i_1086_ -= i_1088_;
			i_1075_ += i_1088_;
		    }
		    int i_1089_ = 0;
		    if (i_1086_ < i_1085_)
			i_1085_ = i_1086_;
		    else
			i_1089_ = i_1086_ - i_1085_;
		    for (int i_1090_ = -i_1085_; i_1090_ < 0; i_1090_++) {
			int i_1091_ = aByteArray11407[i_1069_++];
			if (i_1091_ != 0)
			    is[i_1075_++] = anIntArray11408[i_1091_ & 0xff];
			else
			    i_1075_++;
		    }
		    i_1069_ += i_1089_ + i_1074_;
		    i_1075_ += i_1089_ + i_1073_;
		}
	    }
	}
    }
    
    public void method2674(int i, int i_1092_, int i_1093_, int i_1094_,
			   int[] is, int[] is_1095_, int i_1096_,
			   int i_1097_) {
	throw new IllegalStateException();
    }
    
    public Interface22 method2683() {
	throw new IllegalStateException();
    }
    
    public void method2676(int i, int i_1098_, int i_1099_, int i_1100_,
			   int[] is, int[] is_1101_, int i_1102_,
			   int i_1103_) {
	throw new IllegalStateException();
    }
    
    public void method2699(int i, int i_1104_, int i_1105_) {
	throw new IllegalStateException();
    }
    
    public void method2678(int i, int i_1106_, int i_1107_, int i_1108_,
			   int i_1109_, int i_1110_) {
	throw new IllegalStateException();
    }
    
    public Interface22 method2650() {
	throw new IllegalStateException();
    }
    
    public Interface22 method2688() {
	throw new IllegalStateException();
    }
    
    public Interface22 method2681() {
	throw new IllegalStateException();
    }
    
    public Interface22 method2682() {
	throw new IllegalStateException();
    }
    
    void method14511(int[] is, int[] is_1111_, int i, int i_1112_) {
	int[] is_1113_ = aClass185_Sub2_9016.anIntArray9338;
	if (is_1113_ != null) {
	    if (anInt9001 == 0) {
		if (anInt9000 == 0) {
		    int i_1114_ = anInt8998;
		    while (i_1114_ < 0) {
			int i_1115_ = i_1114_ + i_1112_;
			if (i_1115_ >= 0) {
			    if (i_1115_ >= is.length)
				break;
			    int i_1116_ = anInt8988;
			    int i_1117_ = anInt9007;
			    int i_1118_ = anInt9003;
			    int i_1119_ = anInt8999;
			    if (i_1117_ >= 0 && i_1118_ >= 0
				&& i_1117_ - (anInt8985 << 12) < 0
				&& i_1118_ - (anInt9002 << 12) < 0) {
				int i_1120_ = is[i_1115_] - i;
				int i_1121_ = -is_1111_[i_1115_];
				int i_1122_ = i_1120_ - (i_1116_ - anInt8988);
				if (i_1122_ > 0) {
				    i_1116_ += i_1122_;
				    i_1119_ += i_1122_;
				    i_1117_ += anInt9001 * i_1122_;
				    i_1118_ += anInt9000 * i_1122_;
				} else
				    i_1121_ -= i_1122_;
				if (i_1119_ < i_1121_)
				    i_1119_ = i_1121_;
				for (/**/; i_1119_ < 0; i_1119_++) {
				    int i_1123_
					= (aByteArray11407
					   [((i_1118_ >> 12) * anInt8985
					     + (i_1117_ >> 12))]);
				    if (i_1123_ != 0)
					is_1113_[i_1116_++]
					    = anIntArray11408[i_1123_ & 0xff];
				    else
					i_1116_++;
				}
			    }
			}
			i_1114_++;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_1124_ = anInt8998;
		    while (i_1124_ < 0) {
			int i_1125_ = i_1124_ + i_1112_;
			if (i_1125_ >= 0) {
			    if (i_1125_ >= is.length)
				break;
			    int i_1126_ = anInt8988;
			    int i_1127_ = anInt9007;
			    int i_1128_ = anInt9003 + anInt9010;
			    int i_1129_ = anInt8999;
			    if (i_1127_ >= 0
				&& i_1127_ - (anInt8985 << 12) < 0) {
				int i_1130_;
				if ((i_1130_ = i_1128_ - (anInt9002 << 12))
				    >= 0) {
				    i_1130_
					= (anInt9000 - i_1130_) / anInt9000;
				    i_1129_ += i_1130_;
				    i_1128_ += anInt9000 * i_1130_;
				    i_1126_ += i_1130_;
				}
				if ((i_1130_
				     = (i_1128_ - anInt9000) / anInt9000)
				    > i_1129_)
				    i_1129_ = i_1130_;
				int i_1131_ = is[i_1125_] - i;
				int i_1132_ = -is_1111_[i_1125_];
				int i_1133_ = i_1131_ - (i_1126_ - anInt8988);
				if (i_1133_ > 0) {
				    i_1126_ += i_1133_;
				    i_1129_ += i_1133_;
				    i_1127_ += anInt9001 * i_1133_;
				    i_1128_ += anInt9000 * i_1133_;
				} else
				    i_1132_ -= i_1133_;
				if (i_1129_ < i_1132_)
				    i_1129_ = i_1132_;
				for (/**/; i_1129_ < 0; i_1129_++) {
				    int i_1134_
					= (aByteArray11407
					   [((i_1128_ >> 12) * anInt8985
					     + (i_1127_ >> 12))]);
				    if (i_1134_ != 0)
					is_1113_[i_1126_++]
					    = anIntArray11408[i_1134_ & 0xff];
				    else
					i_1126_++;
				    i_1128_ += anInt9000;
				}
			    }
			}
			i_1124_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_1135_ = anInt8998;
		    while (i_1135_ < 0) {
			int i_1136_ = i_1135_ + i_1112_;
			if (i_1136_ >= 0) {
			    if (i_1136_ >= is.length)
				break;
			    int i_1137_ = anInt8988;
			    int i_1138_ = anInt9007;
			    int i_1139_ = anInt9003 + anInt9010;
			    int i_1140_ = anInt8999;
			    if (i_1138_ >= 0
				&& i_1138_ - (anInt8985 << 12) < 0) {
				if (i_1139_ < 0) {
				    int i_1141_ = ((anInt9000 - 1 - i_1139_)
						   / anInt9000);
				    i_1140_ += i_1141_;
				    i_1139_ += anInt9000 * i_1141_;
				    i_1137_ += i_1141_;
				}
				int i_1142_;
				if ((i_1142_ = (1 + i_1139_ - (anInt9002 << 12)
						- anInt9000) / anInt9000)
				    > i_1140_)
				    i_1140_ = i_1142_;
				int i_1143_ = is[i_1136_] - i;
				int i_1144_ = -is_1111_[i_1136_];
				int i_1145_ = i_1143_ - (i_1137_ - anInt8988);
				if (i_1145_ > 0) {
				    i_1137_ += i_1145_;
				    i_1140_ += i_1145_;
				    i_1138_ += anInt9001 * i_1145_;
				    i_1139_ += anInt9000 * i_1145_;
				} else
				    i_1144_ -= i_1145_;
				if (i_1140_ < i_1144_)
				    i_1140_ = i_1144_;
				for (/**/; i_1140_ < 0; i_1140_++) {
				    int i_1146_
					= (aByteArray11407
					   [((i_1139_ >> 12) * anInt8985
					     + (i_1138_ >> 12))]);
				    if (i_1146_ != 0)
					is_1113_[i_1137_++]
					    = anIntArray11408[i_1146_ & 0xff];
				    else
					i_1137_++;
				    i_1139_ += anInt9000;
				}
			    }
			}
			i_1135_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9001 < 0) {
		if (anInt9000 == 0) {
		    int i_1147_ = anInt8998;
		    while (i_1147_ < 0) {
			int i_1148_ = i_1147_ + i_1112_;
			if (i_1148_ >= 0) {
			    if (i_1148_ >= is.length)
				break;
			    int i_1149_ = anInt8988;
			    int i_1150_ = anInt9007 + anInt9009;
			    int i_1151_ = anInt9003;
			    int i_1152_ = anInt8999;
			    if (i_1151_ >= 0
				&& i_1151_ - (anInt9002 << 12) < 0) {
				int i_1153_;
				if ((i_1153_ = i_1150_ - (anInt8985 << 12))
				    >= 0) {
				    i_1153_
					= (anInt9001 - i_1153_) / anInt9001;
				    i_1152_ += i_1153_;
				    i_1150_ += anInt9001 * i_1153_;
				    i_1149_ += i_1153_;
				}
				if ((i_1153_
				     = (i_1150_ - anInt9001) / anInt9001)
				    > i_1152_)
				    i_1152_ = i_1153_;
				int i_1154_ = is[i_1148_] - i;
				int i_1155_ = -is_1111_[i_1148_];
				int i_1156_ = i_1154_ - (i_1149_ - anInt8988);
				if (i_1156_ > 0) {
				    i_1149_ += i_1156_;
				    i_1152_ += i_1156_;
				    i_1150_ += anInt9001 * i_1156_;
				    i_1151_ += anInt9000 * i_1156_;
				} else
				    i_1155_ -= i_1156_;
				if (i_1152_ < i_1155_)
				    i_1152_ = i_1155_;
				for (/**/; i_1152_ < 0; i_1152_++) {
				    int i_1157_
					= (aByteArray11407
					   [((i_1151_ >> 12) * anInt8985
					     + (i_1150_ >> 12))]);
				    if (i_1157_ != 0)
					is_1113_[i_1149_++]
					    = anIntArray11408[i_1157_ & 0xff];
				    else
					i_1149_++;
				    i_1150_ += anInt9001;
				}
			    }
			}
			i_1147_++;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_1158_ = anInt8998;
		    while (i_1158_ < 0) {
			int i_1159_ = i_1158_ + i_1112_;
			if (i_1159_ >= 0) {
			    if (i_1159_ >= is.length)
				break;
			    int i_1160_ = anInt8988;
			    int i_1161_ = anInt9007 + anInt9009;
			    int i_1162_ = anInt9003 + anInt9010;
			    int i_1163_ = anInt8999;
			    int i_1164_;
			    if ((i_1164_ = i_1161_ - (anInt8985 << 12)) >= 0) {
				i_1164_ = (anInt9001 - i_1164_) / anInt9001;
				i_1163_ += i_1164_;
				i_1161_ += anInt9001 * i_1164_;
				i_1162_ += anInt9000 * i_1164_;
				i_1160_ += i_1164_;
			    }
			    if ((i_1164_ = (i_1161_ - anInt9001) / anInt9001)
				> i_1163_)
				i_1163_ = i_1164_;
			    if ((i_1164_ = i_1162_ - (anInt9002 << 12)) >= 0) {
				i_1164_ = (anInt9000 - i_1164_) / anInt9000;
				i_1163_ += i_1164_;
				i_1161_ += anInt9001 * i_1164_;
				i_1162_ += anInt9000 * i_1164_;
				i_1160_ += i_1164_;
			    }
			    if ((i_1164_ = (i_1162_ - anInt9000) / anInt9000)
				> i_1163_)
				i_1163_ = i_1164_;
			    int i_1165_ = is[i_1159_] - i;
			    int i_1166_ = -is_1111_[i_1159_];
			    int i_1167_ = i_1165_ - (i_1160_ - anInt8988);
			    if (i_1167_ > 0) {
				i_1160_ += i_1167_;
				i_1163_ += i_1167_;
				i_1161_ += anInt9001 * i_1167_;
				i_1162_ += anInt9000 * i_1167_;
			    } else
				i_1166_ -= i_1167_;
			    if (i_1163_ < i_1166_)
				i_1163_ = i_1166_;
			    for (/**/; i_1163_ < 0; i_1163_++) {
				int i_1168_ = (aByteArray11407
					       [((i_1162_ >> 12) * anInt8985
						 + (i_1161_ >> 12))]);
				if (i_1168_ != 0)
				    is_1113_[i_1160_++]
					= anIntArray11408[i_1168_ & 0xff];
				else
				    i_1160_++;
				i_1161_ += anInt9001;
				i_1162_ += anInt9000;
			    }
			}
			i_1158_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_1169_ = anInt8998;
		    while (i_1169_ < 0) {
			int i_1170_ = i_1169_ + i_1112_;
			if (i_1170_ >= 0) {
			    if (i_1170_ >= is.length)
				break;
			    int i_1171_ = anInt8988;
			    int i_1172_ = anInt9007 + anInt9009;
			    int i_1173_ = anInt9003 + anInt9010;
			    int i_1174_ = anInt8999;
			    int i_1175_;
			    if ((i_1175_ = i_1172_ - (anInt8985 << 12)) >= 0) {
				i_1175_ = (anInt9001 - i_1175_) / anInt9001;
				i_1174_ += i_1175_;
				i_1172_ += anInt9001 * i_1175_;
				i_1173_ += anInt9000 * i_1175_;
				i_1171_ += i_1175_;
			    }
			    if ((i_1175_ = (i_1172_ - anInt9001) / anInt9001)
				> i_1174_)
				i_1174_ = i_1175_;
			    if (i_1173_ < 0) {
				i_1175_
				    = (anInt9000 - 1 - i_1173_) / anInt9000;
				i_1174_ += i_1175_;
				i_1172_ += anInt9001 * i_1175_;
				i_1173_ += anInt9000 * i_1175_;
				i_1171_ += i_1175_;
			    }
			    if ((i_1175_ = (1 + i_1173_ - (anInt9002 << 12)
					    - anInt9000) / anInt9000)
				> i_1174_)
				i_1174_ = i_1175_;
			    int i_1176_ = is[i_1170_] - i;
			    int i_1177_ = -is_1111_[i_1170_];
			    int i_1178_ = i_1176_ - (i_1171_ - anInt8988);
			    if (i_1178_ > 0) {
				i_1171_ += i_1178_;
				i_1174_ += i_1178_;
				i_1172_ += anInt9001 * i_1178_;
				i_1173_ += anInt9000 * i_1178_;
			    } else
				i_1177_ -= i_1178_;
			    if (i_1174_ < i_1177_)
				i_1174_ = i_1177_;
			    for (/**/; i_1174_ < 0; i_1174_++) {
				int i_1179_ = (aByteArray11407
					       [((i_1173_ >> 12) * anInt8985
						 + (i_1172_ >> 12))]);
				if (i_1179_ != 0)
				    is_1113_[i_1171_++]
					= anIntArray11408[i_1179_ & 0xff];
				else
				    i_1171_++;
				i_1172_ += anInt9001;
				i_1173_ += anInt9000;
			    }
			}
			i_1169_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9000 == 0) {
		int i_1180_ = anInt8998;
		while (i_1180_ < 0) {
		    int i_1181_ = i_1180_ + i_1112_;
		    if (i_1181_ >= 0) {
			if (i_1181_ >= is.length)
			    break;
			int i_1182_ = anInt8988;
			int i_1183_ = anInt9007 + anInt9009;
			int i_1184_ = anInt9003;
			int i_1185_ = anInt8999;
			if (i_1184_ >= 0 && i_1184_ - (anInt9002 << 12) < 0) {
			    if (i_1183_ < 0) {
				int i_1186_
				    = (anInt9001 - 1 - i_1183_) / anInt9001;
				i_1185_ += i_1186_;
				i_1183_ += anInt9001 * i_1186_;
				i_1182_ += i_1186_;
			    }
			    int i_1187_;
			    if ((i_1187_ = (1 + i_1183_ - (anInt8985 << 12)
					    - anInt9001) / anInt9001)
				> i_1185_)
				i_1185_ = i_1187_;
			    int i_1188_ = is[i_1181_] - i;
			    int i_1189_ = -is_1111_[i_1181_];
			    int i_1190_ = i_1188_ - (i_1182_ - anInt8988);
			    if (i_1190_ > 0) {
				i_1182_ += i_1190_;
				i_1185_ += i_1190_;
				i_1183_ += anInt9001 * i_1190_;
				i_1184_ += anInt9000 * i_1190_;
			    } else
				i_1189_ -= i_1190_;
			    if (i_1185_ < i_1189_)
				i_1185_ = i_1189_;
			    for (/**/; i_1185_ < 0; i_1185_++) {
				int i_1191_ = (aByteArray11407
					       [((i_1184_ >> 12) * anInt8985
						 + (i_1183_ >> 12))]);
				if (i_1191_ != 0)
				    is_1113_[i_1182_++]
					= anIntArray11408[i_1191_ & 0xff];
				else
				    i_1182_++;
				i_1183_ += anInt9001;
			    }
			}
		    }
		    i_1180_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else if (anInt9000 < 0) {
		int i_1192_ = anInt8998;
		while (i_1192_ < 0) {
		    int i_1193_ = i_1192_ + i_1112_;
		    if (i_1193_ >= 0) {
			if (i_1193_ >= is.length)
			    break;
			int i_1194_ = anInt8988;
			int i_1195_ = anInt9007 + anInt9009;
			int i_1196_ = anInt9003 + anInt9010;
			int i_1197_ = anInt8999;
			if (i_1195_ < 0) {
			    int i_1198_
				= (anInt9001 - 1 - i_1195_) / anInt9001;
			    i_1197_ += i_1198_;
			    i_1195_ += anInt9001 * i_1198_;
			    i_1196_ += anInt9000 * i_1198_;
			    i_1194_ += i_1198_;
			}
			int i_1199_;
			if ((i_1199_ = (1 + i_1195_ - (anInt8985 << 12)
					- anInt9001) / anInt9001)
			    > i_1197_)
			    i_1197_ = i_1199_;
			if ((i_1199_ = i_1196_ - (anInt9002 << 12)) >= 0) {
			    i_1199_ = (anInt9000 - i_1199_) / anInt9000;
			    i_1197_ += i_1199_;
			    i_1195_ += anInt9001 * i_1199_;
			    i_1196_ += anInt9000 * i_1199_;
			    i_1194_ += i_1199_;
			}
			if ((i_1199_ = (i_1196_ - anInt9000) / anInt9000)
			    > i_1197_)
			    i_1197_ = i_1199_;
			int i_1200_ = is[i_1193_] - i;
			int i_1201_ = -is_1111_[i_1193_];
			int i_1202_ = i_1200_ - (i_1194_ - anInt8988);
			if (i_1202_ > 0) {
			    i_1194_ += i_1202_;
			    i_1197_ += i_1202_;
			    i_1195_ += anInt9001 * i_1202_;
			    i_1196_ += anInt9000 * i_1202_;
			} else
			    i_1201_ -= i_1202_;
			if (i_1197_ < i_1201_)
			    i_1197_ = i_1201_;
			for (/**/; i_1197_ < 0; i_1197_++) {
			    int i_1203_
				= (aByteArray11407
				   [(i_1196_ >> 12) * anInt8985 + (i_1195_
								   >> 12)]);
			    if (i_1203_ != 0)
				is_1113_[i_1194_++]
				    = anIntArray11408[i_1203_ & 0xff];
			    else
				i_1194_++;
			    i_1195_ += anInt9001;
			    i_1196_ += anInt9000;
			}
		    }
		    i_1192_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else {
		int i_1204_ = anInt8998;
		while (i_1204_ < 0) {
		    int i_1205_ = i_1204_ + i_1112_;
		    if (i_1205_ >= 0) {
			if (i_1205_ >= is.length)
			    break;
			int i_1206_ = anInt8988;
			int i_1207_ = anInt9007 + anInt9009;
			int i_1208_ = anInt9003 + anInt9010;
			int i_1209_ = anInt8999;
			if (i_1207_ < 0) {
			    int i_1210_
				= (anInt9001 - 1 - i_1207_) / anInt9001;
			    i_1209_ += i_1210_;
			    i_1207_ += anInt9001 * i_1210_;
			    i_1208_ += anInt9000 * i_1210_;
			    i_1206_ += i_1210_;
			}
			int i_1211_;
			if ((i_1211_ = (1 + i_1207_ - (anInt8985 << 12)
					- anInt9001) / anInt9001)
			    > i_1209_)
			    i_1209_ = i_1211_;
			if (i_1208_ < 0) {
			    i_1211_ = (anInt9000 - 1 - i_1208_) / anInt9000;
			    i_1209_ += i_1211_;
			    i_1207_ += anInt9001 * i_1211_;
			    i_1208_ += anInt9000 * i_1211_;
			    i_1206_ += i_1211_;
			}
			if ((i_1211_ = (1 + i_1208_ - (anInt9002 << 12)
					- anInt9000) / anInt9000)
			    > i_1209_)
			    i_1209_ = i_1211_;
			int i_1212_ = is[i_1205_] - i;
			int i_1213_ = -is_1111_[i_1205_];
			int i_1214_ = i_1212_ - (i_1206_ - anInt8988);
			if (i_1214_ > 0) {
			    i_1206_ += i_1214_;
			    i_1209_ += i_1214_;
			    i_1207_ += anInt9001 * i_1214_;
			    i_1208_ += anInt9000 * i_1214_;
			} else
			    i_1213_ -= i_1214_;
			if (i_1209_ < i_1213_)
			    i_1209_ = i_1213_;
			for (/**/; i_1209_ < 0; i_1209_++) {
			    int i_1215_
				= (aByteArray11407
				   [(i_1208_ >> 12) * anInt8985 + (i_1207_
								   >> 12)]);
			    if (i_1215_ != 0)
				is_1113_[i_1206_++]
				    = anIntArray11408[i_1215_ & 0xff];
			    else
				i_1206_++;
			    i_1207_ += anInt9001;
			    i_1208_ += anInt9000;
			}
		    }
		    i_1204_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    }
	}
    }
    
    public void method2652(int i, int i_1216_, int i_1217_, int i_1218_,
			   int[] is, int i_1219_, int i_1220_) {
	throw new IllegalStateException();
    }
    
    void method2661(int i, int i_1221_, int i_1222_, int i_1223_, int i_1224_,
		    int i_1225_, int i_1226_, int i_1227_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (i_1222_ > 0 && i_1223_ > 0) {
	    int[] is = aClass185_Sub2_9016.anIntArray9338;
	    if (is != null) {
		int i_1228_ = 0;
		int i_1229_ = 0;
		int i_1230_ = aClass185_Sub2_9016.anInt9356 * 356365251;
		int i_1231_ = anInt8987 + anInt8985 + anInt8992;
		int i_1232_ = anInt8989 + anInt9002 + anInt8990;
		int i_1233_ = (i_1231_ << 16) / i_1222_;
		int i_1234_ = (i_1232_ << 16) / i_1223_;
		if (anInt8987 > 0) {
		    int i_1235_ = ((anInt8987 << 16) + i_1233_ - 1) / i_1233_;
		    i += i_1235_;
		    i_1228_ += i_1235_ * i_1233_ - (anInt8987 << 16);
		}
		if (anInt8989 > 0) {
		    int i_1236_ = ((anInt8989 << 16) + i_1234_ - 1) / i_1234_;
		    i_1221_ += i_1236_;
		    i_1229_ += i_1236_ * i_1234_ - (anInt8989 << 16);
		}
		if (anInt8985 < i_1231_)
		    i_1222_ = (((anInt8985 << 16) - i_1228_ + i_1233_ - 1)
			       / i_1233_);
		if (anInt9002 < i_1232_)
		    i_1223_ = (((anInt9002 << 16) - i_1229_ + i_1234_ - 1)
			       / i_1234_);
		int i_1237_ = i + i_1221_ * i_1230_;
		int i_1238_ = i_1230_ - i_1222_;
		if (i_1221_ + i_1223_
		    > aClass185_Sub2_9016.anInt9345 * 639238427)
		    i_1223_ -= (i_1221_ + i_1223_
				- aClass185_Sub2_9016.anInt9345 * 639238427);
		if (i_1221_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		    int i_1239_
			= aClass185_Sub2_9016.anInt9344 * 9823353 - i_1221_;
		    i_1223_ -= i_1239_;
		    i_1237_ += i_1239_ * i_1230_;
		    i_1229_ += i_1234_ * i_1239_;
		}
		if (i + i_1222_
		    > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		    int i_1240_
			= (i + i_1222_
			   - aClass185_Sub2_9016.anInt9343 * -1807368365);
		    i_1222_ -= i_1240_;
		    i_1238_ += i_1240_;
		}
		if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		    int i_1241_
			= aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		    i_1222_ -= i_1241_;
		    i_1237_ += i_1241_;
		    i_1228_ += i_1233_ * i_1241_;
		    i_1238_ += i_1241_;
		}
		if (i_1226_ == 0) {
		    if (i_1224_ == 1) {
			int i_1242_ = i_1228_;
			for (int i_1243_ = -i_1223_; i_1243_ < 0; i_1243_++) {
			    int i_1244_ = (i_1229_ >> 16) * anInt8985;
			    for (int i_1245_ = -i_1222_; i_1245_ < 0;
				 i_1245_++) {
				is[i_1237_++]
				    = (anIntArray11408
				       [(aByteArray11407
					 [(i_1228_ >> 16) + i_1244_]) & 0xff]);
				i_1228_ += i_1233_;
			    }
			    i_1229_ += i_1234_;
			    i_1228_ = i_1242_;
			    i_1237_ += i_1238_;
			}
		    } else if (i_1224_ == 0) {
			int i_1246_ = (i_1225_ & 0xff0000) >> 16;
			int i_1247_ = (i_1225_ & 0xff00) >> 8;
			int i_1248_ = i_1225_ & 0xff;
			int i_1249_ = i_1228_;
			for (int i_1250_ = -i_1223_; i_1250_ < 0; i_1250_++) {
			    int i_1251_ = (i_1229_ >> 16) * anInt8985;
			    for (int i_1252_ = -i_1222_; i_1252_ < 0;
				 i_1252_++) {
				int i_1253_
				    = (anIntArray11408
				       [(aByteArray11407
					 [(i_1228_ >> 16) + i_1251_]) & 0xff]);
				int i_1254_ = ((i_1253_ & 0xff0000) * i_1246_
					       & ~0xffffff);
				int i_1255_
				    = (i_1253_ & 0xff00) * i_1247_ & 0xff0000;
				int i_1256_
				    = (i_1253_ & 0xff) * i_1248_ & 0xff00;
				is[i_1237_++]
				    = (i_1254_ | i_1255_ | i_1256_) >>> 8;
				i_1228_ += i_1233_;
			    }
			    i_1229_ += i_1234_;
			    i_1228_ = i_1249_;
			    i_1237_ += i_1238_;
			}
		    } else if (i_1224_ == 3) {
			int i_1257_ = i_1228_;
			for (int i_1258_ = -i_1223_; i_1258_ < 0; i_1258_++) {
			    int i_1259_ = (i_1229_ >> 16) * anInt8985;
			    for (int i_1260_ = -i_1222_; i_1260_ < 0;
				 i_1260_++) {
				byte i_1261_ = (aByteArray11407
						[(i_1228_ >> 16) + i_1259_]);
				int i_1262_ = (i_1261_ > 0
					       ? anIntArray11408[i_1261_] : 0);
				int i_1263_ = i_1262_ + i_1225_;
				int i_1264_ = ((i_1262_ & 0xff00ff)
					       + (i_1225_ & 0xff00ff));
				int i_1265_
				    = ((i_1264_ & 0x1000100)
				       + (i_1263_ - i_1264_ & 0x10000));
				is[i_1237_++]
				    = i_1263_ - i_1265_ | i_1265_ - (i_1265_
								     >>> 8);
				i_1228_ += i_1233_;
			    }
			    i_1229_ += i_1234_;
			    i_1228_ = i_1257_;
			    i_1237_ += i_1238_;
			}
		    } else if (i_1224_ == 2) {
			int i_1266_ = i_1225_ >>> 24;
			int i_1267_ = 256 - i_1266_;
			int i_1268_
			    = (i_1225_ & 0xff00ff) * i_1267_ & ~0xff00ff;
			int i_1269_ = (i_1225_ & 0xff00) * i_1267_ & 0xff0000;
			i_1225_ = (i_1268_ | i_1269_) >>> 8;
			int i_1270_ = i_1228_;
			for (int i_1271_ = -i_1223_; i_1271_ < 0; i_1271_++) {
			    int i_1272_ = (i_1229_ >> 16) * anInt8985;
			    for (int i_1273_ = -i_1222_; i_1273_ < 0;
				 i_1273_++) {
				int i_1274_
				    = (anIntArray11408
				       [(aByteArray11407
					 [(i_1228_ >> 16) + i_1272_]) & 0xff]);
				i_1268_ = ((i_1274_ & 0xff00ff) * i_1266_
					   & ~0xff00ff);
				i_1269_
				    = (i_1274_ & 0xff00) * i_1266_ & 0xff0000;
				is[i_1237_++]
				    = ((i_1268_ | i_1269_) >>> 8) + i_1225_;
				i_1228_ += i_1233_;
			    }
			    i_1229_ += i_1234_;
			    i_1228_ = i_1270_;
			    i_1237_ += i_1238_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1226_ == 1) {
		    if (i_1224_ == 1) {
			int i_1275_ = i_1228_;
			for (int i_1276_ = -i_1223_; i_1276_ < 0; i_1276_++) {
			    int i_1277_ = (i_1229_ >> 16) * anInt8985;
			    for (int i_1278_ = -i_1222_; i_1278_ < 0;
				 i_1278_++) {
				int i_1279_ = (aByteArray11407
					       [(i_1228_ >> 16) + i_1277_]);
				if (i_1279_ != 0)
				    is[i_1237_++]
					= anIntArray11408[i_1279_ & 0xff];
				else
				    i_1237_++;
				i_1228_ += i_1233_;
			    }
			    i_1229_ += i_1234_;
			    i_1228_ = i_1275_;
			    i_1237_ += i_1238_;
			}
		    } else if (i_1224_ == 0) {
			int i_1280_ = i_1228_;
			if ((i_1225_ & 0xffffff) == 16777215) {
			    int i_1281_ = i_1225_ >>> 24;
			    int i_1282_ = 256 - i_1281_;
			    for (int i_1283_ = -i_1223_; i_1283_ < 0;
				 i_1283_++) {
				int i_1284_ = (i_1229_ >> 16) * anInt8985;
				for (int i_1285_ = -i_1222_; i_1285_ < 0;
				     i_1285_++) {
				    int i_1286_
					= (aByteArray11407
					   [(i_1228_ >> 16) + i_1284_]);
				    if (i_1286_ != 0) {
					int i_1287_
					    = anIntArray11408[i_1286_ & 0xff];
					int i_1288_ = is[i_1237_];
					is[i_1237_++]
					    = ((((i_1287_ & 0xff00ff) * i_1281_
						 + ((i_1288_ & 0xff00ff)
						    * i_1282_))
						& ~0xff00ff)
					       + (((i_1287_ & 0xff00) * i_1281_
						   + ((i_1288_ & 0xff00)
						      * i_1282_))
						  & 0xff0000)) >> 8;
				    } else
					i_1237_++;
				    i_1228_ += i_1233_;
				}
				i_1229_ += i_1234_;
				i_1228_ = i_1280_;
				i_1237_ += i_1238_;
			    }
			} else {
			    int i_1289_ = (i_1225_ & 0xff0000) >> 16;
			    int i_1290_ = (i_1225_ & 0xff00) >> 8;
			    int i_1291_ = i_1225_ & 0xff;
			    int i_1292_ = i_1225_ >>> 24;
			    int i_1293_ = 256 - i_1292_;
			    for (int i_1294_ = -i_1223_; i_1294_ < 0;
				 i_1294_++) {
				int i_1295_ = (i_1229_ >> 16) * anInt8985;
				for (int i_1296_ = -i_1222_; i_1296_ < 0;
				     i_1296_++) {
				    int i_1297_
					= (aByteArray11407
					   [(i_1228_ >> 16) + i_1295_]);
				    if (i_1297_ != 0) {
					int i_1298_
					    = anIntArray11408[i_1297_ & 0xff];
					if (i_1292_ != 255) {
					    int i_1299_
						= (((i_1298_ & 0xff0000)
						    * i_1289_)
						   & ~0xffffff);
					    int i_1300_
						= ((i_1298_ & 0xff00) * i_1290_
						   & 0xff0000);
					    int i_1301_
						= ((i_1298_ & 0xff) * i_1291_
						   & 0xff00);
					    i_1298_ = (i_1299_ | i_1300_
						       | i_1301_) >>> 8;
					    int i_1302_ = is[i_1237_];
					    is[i_1237_++]
						= (((((i_1298_ & 0xff00ff)
						      * i_1292_)
						     + ((i_1302_ & 0xff00ff)
							* i_1293_))
						    & ~0xff00ff)
						   + ((((i_1298_ & 0xff00)
							* i_1292_)
						       + ((i_1302_ & 0xff00)
							  * i_1293_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1303_
						= (((i_1298_ & 0xff0000)
						    * i_1289_)
						   & ~0xffffff);
					    int i_1304_
						= ((i_1298_ & 0xff00) * i_1290_
						   & 0xff0000);
					    int i_1305_
						= ((i_1298_ & 0xff) * i_1291_
						   & 0xff00);
					    is[i_1237_++] = (i_1303_ | i_1304_
							     | i_1305_) >>> 8;
					}
				    } else
					i_1237_++;
				    i_1228_ += i_1233_;
				}
				i_1229_ += i_1234_;
				i_1228_ = i_1280_;
				i_1237_ += i_1238_;
			    }
			}
		    } else if (i_1224_ == 3) {
			int i_1306_ = i_1228_;
			int i_1307_ = i_1225_ >>> 24;
			int i_1308_ = 256 - i_1307_;
			for (int i_1309_ = -i_1223_; i_1309_ < 0; i_1309_++) {
			    int i_1310_ = (i_1229_ >> 16) * anInt8985;
			    for (int i_1311_ = -i_1222_; i_1311_ < 0;
				 i_1311_++) {
				byte i_1312_ = (aByteArray11407
						[(i_1228_ >> 16) + i_1310_]);
				int i_1313_ = (i_1312_ > 0
					       ? anIntArray11408[i_1312_] : 0);
				int i_1314_ = i_1313_ + i_1225_;
				int i_1315_ = ((i_1313_ & 0xff00ff)
					       + (i_1225_ & 0xff00ff));
				int i_1316_
				    = ((i_1315_ & 0x1000100)
				       + (i_1314_ - i_1315_ & 0x10000));
				i_1316_
				    = i_1314_ - i_1316_ | i_1316_ - (i_1316_
								     >>> 8);
				if (i_1313_ == 0 && i_1307_ != 255) {
				    i_1313_ = i_1316_;
				    i_1316_ = is[i_1237_];
				    i_1316_
					= ((((i_1313_ & 0xff00ff) * i_1307_
					     + (i_1316_ & 0xff00ff) * i_1308_)
					    & ~0xff00ff)
					   + (((i_1313_ & 0xff00) * i_1307_
					       + (i_1316_ & 0xff00) * i_1308_)
					      & 0xff0000)) >> 8;
				}
				is[i_1237_++] = i_1316_;
				i_1228_ += i_1233_;
			    }
			    i_1229_ += i_1234_;
			    i_1228_ = i_1306_;
			    i_1237_ += i_1238_;
			}
		    } else if (i_1224_ == 2) {
			int i_1317_ = i_1225_ >>> 24;
			int i_1318_ = 256 - i_1317_;
			int i_1319_
			    = (i_1225_ & 0xff00ff) * i_1318_ & ~0xff00ff;
			int i_1320_ = (i_1225_ & 0xff00) * i_1318_ & 0xff0000;
			i_1225_ = (i_1319_ | i_1320_) >>> 8;
			int i_1321_ = i_1228_;
			for (int i_1322_ = -i_1223_; i_1322_ < 0; i_1322_++) {
			    int i_1323_ = (i_1229_ >> 16) * anInt8985;
			    for (int i_1324_ = -i_1222_; i_1324_ < 0;
				 i_1324_++) {
				int i_1325_ = (aByteArray11407
					       [(i_1228_ >> 16) + i_1323_]);
				if (i_1325_ != 0) {
				    int i_1326_
					= anIntArray11408[i_1325_ & 0xff];
				    i_1319_ = ((i_1326_ & 0xff00ff) * i_1317_
					       & ~0xff00ff);
				    i_1320_ = ((i_1326_ & 0xff00) * i_1317_
					       & 0xff0000);
				    is[i_1237_++] = ((i_1319_ | i_1320_)
						     >>> 8) + i_1225_;
				} else
				    i_1237_++;
				i_1228_ += i_1233_;
			    }
			    i_1229_ += i_1234_;
			    i_1228_ = i_1321_;
			    i_1237_ += i_1238_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1226_ == 2) {
		    if (i_1224_ == 1) {
			int i_1327_ = i_1228_;
			for (int i_1328_ = -i_1223_; i_1328_ < 0; i_1328_++) {
			    int i_1329_ = (i_1229_ >> 16) * anInt8985;
			    for (int i_1330_ = -i_1222_; i_1330_ < 0;
				 i_1330_++) {
				int i_1331_ = (aByteArray11407
					       [(i_1228_ >> 16) + i_1329_]);
				if (i_1331_ != 0) {
				    int i_1332_
					= anIntArray11408[i_1331_ & 0xff];
				    int i_1333_ = is[i_1237_];
				    int i_1334_ = i_1332_ + i_1333_;
				    int i_1335_ = ((i_1332_ & 0xff00ff)
						   + (i_1333_ & 0xff00ff));
				    i_1333_
					= ((i_1335_ & 0x1000100)
					   + (i_1334_ - i_1335_ & 0x10000));
				    is[i_1237_++]
					= (i_1334_ - i_1333_
					   | i_1333_ - (i_1333_ >>> 8));
				} else
				    i_1237_++;
				i_1228_ += i_1233_;
			    }
			    i_1229_ += i_1234_;
			    i_1228_ = i_1327_;
			    i_1237_ += i_1238_;
			}
		    } else if (i_1224_ == 0) {
			int i_1336_ = i_1228_;
			int i_1337_ = (i_1225_ & 0xff0000) >> 16;
			int i_1338_ = (i_1225_ & 0xff00) >> 8;
			int i_1339_ = i_1225_ & 0xff;
			for (int i_1340_ = -i_1223_; i_1340_ < 0; i_1340_++) {
			    int i_1341_ = (i_1229_ >> 16) * anInt8985;
			    for (int i_1342_ = -i_1222_; i_1342_ < 0;
				 i_1342_++) {
				int i_1343_ = (aByteArray11407
					       [(i_1228_ >> 16) + i_1341_]);
				if (i_1343_ != 0) {
				    int i_1344_
					= anIntArray11408[i_1343_ & 0xff];
				    int i_1345_
					= ((i_1344_ & 0xff0000) * i_1337_
					   & ~0xffffff);
				    int i_1346_ = ((i_1344_ & 0xff00) * i_1338_
						   & 0xff0000);
				    int i_1347_
					= (i_1344_ & 0xff) * i_1339_ & 0xff00;
				    i_1344_
					= (i_1345_ | i_1346_ | i_1347_) >>> 8;
				    int i_1348_ = is[i_1237_];
				    int i_1349_ = i_1344_ + i_1348_;
				    int i_1350_ = ((i_1344_ & 0xff00ff)
						   + (i_1348_ & 0xff00ff));
				    i_1348_
					= ((i_1350_ & 0x1000100)
					   + (i_1349_ - i_1350_ & 0x10000));
				    is[i_1237_++]
					= (i_1349_ - i_1348_
					   | i_1348_ - (i_1348_ >>> 8));
				} else
				    i_1237_++;
				i_1228_ += i_1233_;
			    }
			    i_1229_ += i_1234_;
			    i_1228_ = i_1336_;
			    i_1237_ += i_1238_;
			}
		    } else if (i_1224_ == 3) {
			int i_1351_ = i_1228_;
			for (int i_1352_ = -i_1223_; i_1352_ < 0; i_1352_++) {
			    int i_1353_ = (i_1229_ >> 16) * anInt8985;
			    for (int i_1354_ = -i_1222_; i_1354_ < 0;
				 i_1354_++) {
				byte i_1355_ = (aByteArray11407
						[(i_1228_ >> 16) + i_1353_]);
				int i_1356_ = (i_1355_ > 0
					       ? anIntArray11408[i_1355_] : 0);
				int i_1357_ = i_1356_ + i_1225_;
				int i_1358_ = ((i_1356_ & 0xff00ff)
					       + (i_1225_ & 0xff00ff));
				int i_1359_
				    = ((i_1358_ & 0x1000100)
				       + (i_1357_ - i_1358_ & 0x10000));
				i_1356_
				    = i_1357_ - i_1359_ | i_1359_ - (i_1359_
								     >>> 8);
				i_1359_ = is[i_1237_];
				i_1357_ = i_1356_ + i_1359_;
				i_1358_ = (i_1356_ & 0xff00ff) + (i_1359_
								  & 0xff00ff);
				i_1359_ = ((i_1358_ & 0x1000100)
					   + (i_1357_ - i_1358_ & 0x10000));
				is[i_1237_++]
				    = i_1357_ - i_1359_ | i_1359_ - (i_1359_
								     >>> 8);
				i_1228_ += i_1233_;
			    }
			    i_1229_ += i_1234_;
			    i_1228_ = i_1351_;
			    i_1237_ += i_1238_;
			}
		    } else if (i_1224_ == 2) {
			int i_1360_ = i_1225_ >>> 24;
			int i_1361_ = 256 - i_1360_;
			int i_1362_
			    = (i_1225_ & 0xff00ff) * i_1361_ & ~0xff00ff;
			int i_1363_ = (i_1225_ & 0xff00) * i_1361_ & 0xff0000;
			i_1225_ = (i_1362_ | i_1363_) >>> 8;
			int i_1364_ = i_1228_;
			for (int i_1365_ = -i_1223_; i_1365_ < 0; i_1365_++) {
			    int i_1366_ = (i_1229_ >> 16) * anInt8985;
			    for (int i_1367_ = -i_1222_; i_1367_ < 0;
				 i_1367_++) {
				int i_1368_ = (aByteArray11407
					       [(i_1228_ >> 16) + i_1366_]);
				if (i_1368_ != 0) {
				    int i_1369_
					= anIntArray11408[i_1368_ & 0xff];
				    i_1362_ = ((i_1369_ & 0xff00ff) * i_1360_
					       & ~0xff00ff);
				    i_1363_ = ((i_1369_ & 0xff00) * i_1360_
					       & 0xff0000);
				    i_1369_ = (((i_1362_ | i_1363_) >>> 8)
					       + i_1225_);
				    int i_1370_ = is[i_1237_];
				    int i_1371_ = i_1369_ + i_1370_;
				    int i_1372_ = ((i_1369_ & 0xff00ff)
						   + (i_1370_ & 0xff00ff));
				    i_1370_
					= ((i_1372_ & 0x1000100)
					   + (i_1371_ - i_1372_ & 0x10000));
				    is[i_1237_++]
					= (i_1371_ - i_1370_
					   | i_1370_ - (i_1370_ >>> 8));
				} else
				    i_1237_++;
				i_1228_ += i_1233_;
			    }
			    i_1229_ += i_1234_;
			    i_1228_ = i_1364_;
			    i_1237_ += i_1238_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method2686(int i, int i_1373_, int i_1374_, int i_1375_, int i_1376_,
		    int i_1377_, int i_1378_, int i_1379_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (i_1374_ > 0 && i_1375_ > 0) {
	    int[] is = aClass185_Sub2_9016.anIntArray9338;
	    if (is != null) {
		int i_1380_ = 0;
		int i_1381_ = 0;
		int i_1382_ = aClass185_Sub2_9016.anInt9356 * 356365251;
		int i_1383_ = anInt8987 + anInt8985 + anInt8992;
		int i_1384_ = anInt8989 + anInt9002 + anInt8990;
		int i_1385_ = (i_1383_ << 16) / i_1374_;
		int i_1386_ = (i_1384_ << 16) / i_1375_;
		if (anInt8987 > 0) {
		    int i_1387_ = ((anInt8987 << 16) + i_1385_ - 1) / i_1385_;
		    i += i_1387_;
		    i_1380_ += i_1387_ * i_1385_ - (anInt8987 << 16);
		}
		if (anInt8989 > 0) {
		    int i_1388_ = ((anInt8989 << 16) + i_1386_ - 1) / i_1386_;
		    i_1373_ += i_1388_;
		    i_1381_ += i_1388_ * i_1386_ - (anInt8989 << 16);
		}
		if (anInt8985 < i_1383_)
		    i_1374_ = (((anInt8985 << 16) - i_1380_ + i_1385_ - 1)
			       / i_1385_);
		if (anInt9002 < i_1384_)
		    i_1375_ = (((anInt9002 << 16) - i_1381_ + i_1386_ - 1)
			       / i_1386_);
		int i_1389_ = i + i_1373_ * i_1382_;
		int i_1390_ = i_1382_ - i_1374_;
		if (i_1373_ + i_1375_
		    > aClass185_Sub2_9016.anInt9345 * 639238427)
		    i_1375_ -= (i_1373_ + i_1375_
				- aClass185_Sub2_9016.anInt9345 * 639238427);
		if (i_1373_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		    int i_1391_
			= aClass185_Sub2_9016.anInt9344 * 9823353 - i_1373_;
		    i_1375_ -= i_1391_;
		    i_1389_ += i_1391_ * i_1382_;
		    i_1381_ += i_1386_ * i_1391_;
		}
		if (i + i_1374_
		    > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		    int i_1392_
			= (i + i_1374_
			   - aClass185_Sub2_9016.anInt9343 * -1807368365);
		    i_1374_ -= i_1392_;
		    i_1390_ += i_1392_;
		}
		if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		    int i_1393_
			= aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		    i_1374_ -= i_1393_;
		    i_1389_ += i_1393_;
		    i_1380_ += i_1385_ * i_1393_;
		    i_1390_ += i_1393_;
		}
		if (i_1378_ == 0) {
		    if (i_1376_ == 1) {
			int i_1394_ = i_1380_;
			for (int i_1395_ = -i_1375_; i_1395_ < 0; i_1395_++) {
			    int i_1396_ = (i_1381_ >> 16) * anInt8985;
			    for (int i_1397_ = -i_1374_; i_1397_ < 0;
				 i_1397_++) {
				is[i_1389_++]
				    = (anIntArray11408
				       [(aByteArray11407
					 [(i_1380_ >> 16) + i_1396_]) & 0xff]);
				i_1380_ += i_1385_;
			    }
			    i_1381_ += i_1386_;
			    i_1380_ = i_1394_;
			    i_1389_ += i_1390_;
			}
		    } else if (i_1376_ == 0) {
			int i_1398_ = (i_1377_ & 0xff0000) >> 16;
			int i_1399_ = (i_1377_ & 0xff00) >> 8;
			int i_1400_ = i_1377_ & 0xff;
			int i_1401_ = i_1380_;
			for (int i_1402_ = -i_1375_; i_1402_ < 0; i_1402_++) {
			    int i_1403_ = (i_1381_ >> 16) * anInt8985;
			    for (int i_1404_ = -i_1374_; i_1404_ < 0;
				 i_1404_++) {
				int i_1405_
				    = (anIntArray11408
				       [(aByteArray11407
					 [(i_1380_ >> 16) + i_1403_]) & 0xff]);
				int i_1406_ = ((i_1405_ & 0xff0000) * i_1398_
					       & ~0xffffff);
				int i_1407_
				    = (i_1405_ & 0xff00) * i_1399_ & 0xff0000;
				int i_1408_
				    = (i_1405_ & 0xff) * i_1400_ & 0xff00;
				is[i_1389_++]
				    = (i_1406_ | i_1407_ | i_1408_) >>> 8;
				i_1380_ += i_1385_;
			    }
			    i_1381_ += i_1386_;
			    i_1380_ = i_1401_;
			    i_1389_ += i_1390_;
			}
		    } else if (i_1376_ == 3) {
			int i_1409_ = i_1380_;
			for (int i_1410_ = -i_1375_; i_1410_ < 0; i_1410_++) {
			    int i_1411_ = (i_1381_ >> 16) * anInt8985;
			    for (int i_1412_ = -i_1374_; i_1412_ < 0;
				 i_1412_++) {
				byte i_1413_ = (aByteArray11407
						[(i_1380_ >> 16) + i_1411_]);
				int i_1414_ = (i_1413_ > 0
					       ? anIntArray11408[i_1413_] : 0);
				int i_1415_ = i_1414_ + i_1377_;
				int i_1416_ = ((i_1414_ & 0xff00ff)
					       + (i_1377_ & 0xff00ff));
				int i_1417_
				    = ((i_1416_ & 0x1000100)
				       + (i_1415_ - i_1416_ & 0x10000));
				is[i_1389_++]
				    = i_1415_ - i_1417_ | i_1417_ - (i_1417_
								     >>> 8);
				i_1380_ += i_1385_;
			    }
			    i_1381_ += i_1386_;
			    i_1380_ = i_1409_;
			    i_1389_ += i_1390_;
			}
		    } else if (i_1376_ == 2) {
			int i_1418_ = i_1377_ >>> 24;
			int i_1419_ = 256 - i_1418_;
			int i_1420_
			    = (i_1377_ & 0xff00ff) * i_1419_ & ~0xff00ff;
			int i_1421_ = (i_1377_ & 0xff00) * i_1419_ & 0xff0000;
			i_1377_ = (i_1420_ | i_1421_) >>> 8;
			int i_1422_ = i_1380_;
			for (int i_1423_ = -i_1375_; i_1423_ < 0; i_1423_++) {
			    int i_1424_ = (i_1381_ >> 16) * anInt8985;
			    for (int i_1425_ = -i_1374_; i_1425_ < 0;
				 i_1425_++) {
				int i_1426_
				    = (anIntArray11408
				       [(aByteArray11407
					 [(i_1380_ >> 16) + i_1424_]) & 0xff]);
				i_1420_ = ((i_1426_ & 0xff00ff) * i_1418_
					   & ~0xff00ff);
				i_1421_
				    = (i_1426_ & 0xff00) * i_1418_ & 0xff0000;
				is[i_1389_++]
				    = ((i_1420_ | i_1421_) >>> 8) + i_1377_;
				i_1380_ += i_1385_;
			    }
			    i_1381_ += i_1386_;
			    i_1380_ = i_1422_;
			    i_1389_ += i_1390_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1378_ == 1) {
		    if (i_1376_ == 1) {
			int i_1427_ = i_1380_;
			for (int i_1428_ = -i_1375_; i_1428_ < 0; i_1428_++) {
			    int i_1429_ = (i_1381_ >> 16) * anInt8985;
			    for (int i_1430_ = -i_1374_; i_1430_ < 0;
				 i_1430_++) {
				int i_1431_ = (aByteArray11407
					       [(i_1380_ >> 16) + i_1429_]);
				if (i_1431_ != 0)
				    is[i_1389_++]
					= anIntArray11408[i_1431_ & 0xff];
				else
				    i_1389_++;
				i_1380_ += i_1385_;
			    }
			    i_1381_ += i_1386_;
			    i_1380_ = i_1427_;
			    i_1389_ += i_1390_;
			}
		    } else if (i_1376_ == 0) {
			int i_1432_ = i_1380_;
			if ((i_1377_ & 0xffffff) == 16777215) {
			    int i_1433_ = i_1377_ >>> 24;
			    int i_1434_ = 256 - i_1433_;
			    for (int i_1435_ = -i_1375_; i_1435_ < 0;
				 i_1435_++) {
				int i_1436_ = (i_1381_ >> 16) * anInt8985;
				for (int i_1437_ = -i_1374_; i_1437_ < 0;
				     i_1437_++) {
				    int i_1438_
					= (aByteArray11407
					   [(i_1380_ >> 16) + i_1436_]);
				    if (i_1438_ != 0) {
					int i_1439_
					    = anIntArray11408[i_1438_ & 0xff];
					int i_1440_ = is[i_1389_];
					is[i_1389_++]
					    = ((((i_1439_ & 0xff00ff) * i_1433_
						 + ((i_1440_ & 0xff00ff)
						    * i_1434_))
						& ~0xff00ff)
					       + (((i_1439_ & 0xff00) * i_1433_
						   + ((i_1440_ & 0xff00)
						      * i_1434_))
						  & 0xff0000)) >> 8;
				    } else
					i_1389_++;
				    i_1380_ += i_1385_;
				}
				i_1381_ += i_1386_;
				i_1380_ = i_1432_;
				i_1389_ += i_1390_;
			    }
			} else {
			    int i_1441_ = (i_1377_ & 0xff0000) >> 16;
			    int i_1442_ = (i_1377_ & 0xff00) >> 8;
			    int i_1443_ = i_1377_ & 0xff;
			    int i_1444_ = i_1377_ >>> 24;
			    int i_1445_ = 256 - i_1444_;
			    for (int i_1446_ = -i_1375_; i_1446_ < 0;
				 i_1446_++) {
				int i_1447_ = (i_1381_ >> 16) * anInt8985;
				for (int i_1448_ = -i_1374_; i_1448_ < 0;
				     i_1448_++) {
				    int i_1449_
					= (aByteArray11407
					   [(i_1380_ >> 16) + i_1447_]);
				    if (i_1449_ != 0) {
					int i_1450_
					    = anIntArray11408[i_1449_ & 0xff];
					if (i_1444_ != 255) {
					    int i_1451_
						= (((i_1450_ & 0xff0000)
						    * i_1441_)
						   & ~0xffffff);
					    int i_1452_
						= ((i_1450_ & 0xff00) * i_1442_
						   & 0xff0000);
					    int i_1453_
						= ((i_1450_ & 0xff) * i_1443_
						   & 0xff00);
					    i_1450_ = (i_1451_ | i_1452_
						       | i_1453_) >>> 8;
					    int i_1454_ = is[i_1389_];
					    is[i_1389_++]
						= (((((i_1450_ & 0xff00ff)
						      * i_1444_)
						     + ((i_1454_ & 0xff00ff)
							* i_1445_))
						    & ~0xff00ff)
						   + ((((i_1450_ & 0xff00)
							* i_1444_)
						       + ((i_1454_ & 0xff00)
							  * i_1445_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1455_
						= (((i_1450_ & 0xff0000)
						    * i_1441_)
						   & ~0xffffff);
					    int i_1456_
						= ((i_1450_ & 0xff00) * i_1442_
						   & 0xff0000);
					    int i_1457_
						= ((i_1450_ & 0xff) * i_1443_
						   & 0xff00);
					    is[i_1389_++] = (i_1455_ | i_1456_
							     | i_1457_) >>> 8;
					}
				    } else
					i_1389_++;
				    i_1380_ += i_1385_;
				}
				i_1381_ += i_1386_;
				i_1380_ = i_1432_;
				i_1389_ += i_1390_;
			    }
			}
		    } else if (i_1376_ == 3) {
			int i_1458_ = i_1380_;
			int i_1459_ = i_1377_ >>> 24;
			int i_1460_ = 256 - i_1459_;
			for (int i_1461_ = -i_1375_; i_1461_ < 0; i_1461_++) {
			    int i_1462_ = (i_1381_ >> 16) * anInt8985;
			    for (int i_1463_ = -i_1374_; i_1463_ < 0;
				 i_1463_++) {
				byte i_1464_ = (aByteArray11407
						[(i_1380_ >> 16) + i_1462_]);
				int i_1465_ = (i_1464_ > 0
					       ? anIntArray11408[i_1464_] : 0);
				int i_1466_ = i_1465_ + i_1377_;
				int i_1467_ = ((i_1465_ & 0xff00ff)
					       + (i_1377_ & 0xff00ff));
				int i_1468_
				    = ((i_1467_ & 0x1000100)
				       + (i_1466_ - i_1467_ & 0x10000));
				i_1468_
				    = i_1466_ - i_1468_ | i_1468_ - (i_1468_
								     >>> 8);
				if (i_1465_ == 0 && i_1459_ != 255) {
				    i_1465_ = i_1468_;
				    i_1468_ = is[i_1389_];
				    i_1468_
					= ((((i_1465_ & 0xff00ff) * i_1459_
					     + (i_1468_ & 0xff00ff) * i_1460_)
					    & ~0xff00ff)
					   + (((i_1465_ & 0xff00) * i_1459_
					       + (i_1468_ & 0xff00) * i_1460_)
					      & 0xff0000)) >> 8;
				}
				is[i_1389_++] = i_1468_;
				i_1380_ += i_1385_;
			    }
			    i_1381_ += i_1386_;
			    i_1380_ = i_1458_;
			    i_1389_ += i_1390_;
			}
		    } else if (i_1376_ == 2) {
			int i_1469_ = i_1377_ >>> 24;
			int i_1470_ = 256 - i_1469_;
			int i_1471_
			    = (i_1377_ & 0xff00ff) * i_1470_ & ~0xff00ff;
			int i_1472_ = (i_1377_ & 0xff00) * i_1470_ & 0xff0000;
			i_1377_ = (i_1471_ | i_1472_) >>> 8;
			int i_1473_ = i_1380_;
			for (int i_1474_ = -i_1375_; i_1474_ < 0; i_1474_++) {
			    int i_1475_ = (i_1381_ >> 16) * anInt8985;
			    for (int i_1476_ = -i_1374_; i_1476_ < 0;
				 i_1476_++) {
				int i_1477_ = (aByteArray11407
					       [(i_1380_ >> 16) + i_1475_]);
				if (i_1477_ != 0) {
				    int i_1478_
					= anIntArray11408[i_1477_ & 0xff];
				    i_1471_ = ((i_1478_ & 0xff00ff) * i_1469_
					       & ~0xff00ff);
				    i_1472_ = ((i_1478_ & 0xff00) * i_1469_
					       & 0xff0000);
				    is[i_1389_++] = ((i_1471_ | i_1472_)
						     >>> 8) + i_1377_;
				} else
				    i_1389_++;
				i_1380_ += i_1385_;
			    }
			    i_1381_ += i_1386_;
			    i_1380_ = i_1473_;
			    i_1389_ += i_1390_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1378_ == 2) {
		    if (i_1376_ == 1) {
			int i_1479_ = i_1380_;
			for (int i_1480_ = -i_1375_; i_1480_ < 0; i_1480_++) {
			    int i_1481_ = (i_1381_ >> 16) * anInt8985;
			    for (int i_1482_ = -i_1374_; i_1482_ < 0;
				 i_1482_++) {
				int i_1483_ = (aByteArray11407
					       [(i_1380_ >> 16) + i_1481_]);
				if (i_1483_ != 0) {
				    int i_1484_
					= anIntArray11408[i_1483_ & 0xff];
				    int i_1485_ = is[i_1389_];
				    int i_1486_ = i_1484_ + i_1485_;
				    int i_1487_ = ((i_1484_ & 0xff00ff)
						   + (i_1485_ & 0xff00ff));
				    i_1485_
					= ((i_1487_ & 0x1000100)
					   + (i_1486_ - i_1487_ & 0x10000));
				    is[i_1389_++]
					= (i_1486_ - i_1485_
					   | i_1485_ - (i_1485_ >>> 8));
				} else
				    i_1389_++;
				i_1380_ += i_1385_;
			    }
			    i_1381_ += i_1386_;
			    i_1380_ = i_1479_;
			    i_1389_ += i_1390_;
			}
		    } else if (i_1376_ == 0) {
			int i_1488_ = i_1380_;
			int i_1489_ = (i_1377_ & 0xff0000) >> 16;
			int i_1490_ = (i_1377_ & 0xff00) >> 8;
			int i_1491_ = i_1377_ & 0xff;
			for (int i_1492_ = -i_1375_; i_1492_ < 0; i_1492_++) {
			    int i_1493_ = (i_1381_ >> 16) * anInt8985;
			    for (int i_1494_ = -i_1374_; i_1494_ < 0;
				 i_1494_++) {
				int i_1495_ = (aByteArray11407
					       [(i_1380_ >> 16) + i_1493_]);
				if (i_1495_ != 0) {
				    int i_1496_
					= anIntArray11408[i_1495_ & 0xff];
				    int i_1497_
					= ((i_1496_ & 0xff0000) * i_1489_
					   & ~0xffffff);
				    int i_1498_ = ((i_1496_ & 0xff00) * i_1490_
						   & 0xff0000);
				    int i_1499_
					= (i_1496_ & 0xff) * i_1491_ & 0xff00;
				    i_1496_
					= (i_1497_ | i_1498_ | i_1499_) >>> 8;
				    int i_1500_ = is[i_1389_];
				    int i_1501_ = i_1496_ + i_1500_;
				    int i_1502_ = ((i_1496_ & 0xff00ff)
						   + (i_1500_ & 0xff00ff));
				    i_1500_
					= ((i_1502_ & 0x1000100)
					   + (i_1501_ - i_1502_ & 0x10000));
				    is[i_1389_++]
					= (i_1501_ - i_1500_
					   | i_1500_ - (i_1500_ >>> 8));
				} else
				    i_1389_++;
				i_1380_ += i_1385_;
			    }
			    i_1381_ += i_1386_;
			    i_1380_ = i_1488_;
			    i_1389_ += i_1390_;
			}
		    } else if (i_1376_ == 3) {
			int i_1503_ = i_1380_;
			for (int i_1504_ = -i_1375_; i_1504_ < 0; i_1504_++) {
			    int i_1505_ = (i_1381_ >> 16) * anInt8985;
			    for (int i_1506_ = -i_1374_; i_1506_ < 0;
				 i_1506_++) {
				byte i_1507_ = (aByteArray11407
						[(i_1380_ >> 16) + i_1505_]);
				int i_1508_ = (i_1507_ > 0
					       ? anIntArray11408[i_1507_] : 0);
				int i_1509_ = i_1508_ + i_1377_;
				int i_1510_ = ((i_1508_ & 0xff00ff)
					       + (i_1377_ & 0xff00ff));
				int i_1511_
				    = ((i_1510_ & 0x1000100)
				       + (i_1509_ - i_1510_ & 0x10000));
				i_1508_
				    = i_1509_ - i_1511_ | i_1511_ - (i_1511_
								     >>> 8);
				i_1511_ = is[i_1389_];
				i_1509_ = i_1508_ + i_1511_;
				i_1510_ = (i_1508_ & 0xff00ff) + (i_1511_
								  & 0xff00ff);
				i_1511_ = ((i_1510_ & 0x1000100)
					   + (i_1509_ - i_1510_ & 0x10000));
				is[i_1389_++]
				    = i_1509_ - i_1511_ | i_1511_ - (i_1511_
								     >>> 8);
				i_1380_ += i_1385_;
			    }
			    i_1381_ += i_1386_;
			    i_1380_ = i_1503_;
			    i_1389_ += i_1390_;
			}
		    } else if (i_1376_ == 2) {
			int i_1512_ = i_1377_ >>> 24;
			int i_1513_ = 256 - i_1512_;
			int i_1514_
			    = (i_1377_ & 0xff00ff) * i_1513_ & ~0xff00ff;
			int i_1515_ = (i_1377_ & 0xff00) * i_1513_ & 0xff0000;
			i_1377_ = (i_1514_ | i_1515_) >>> 8;
			int i_1516_ = i_1380_;
			for (int i_1517_ = -i_1375_; i_1517_ < 0; i_1517_++) {
			    int i_1518_ = (i_1381_ >> 16) * anInt8985;
			    for (int i_1519_ = -i_1374_; i_1519_ < 0;
				 i_1519_++) {
				int i_1520_ = (aByteArray11407
					       [(i_1380_ >> 16) + i_1518_]);
				if (i_1520_ != 0) {
				    int i_1521_
					= anIntArray11408[i_1520_ & 0xff];
				    i_1514_ = ((i_1521_ & 0xff00ff) * i_1512_
					       & ~0xff00ff);
				    i_1515_ = ((i_1521_ & 0xff00) * i_1512_
					       & 0xff0000);
				    i_1521_ = (((i_1514_ | i_1515_) >>> 8)
					       + i_1377_);
				    int i_1522_ = is[i_1389_];
				    int i_1523_ = i_1521_ + i_1522_;
				    int i_1524_ = ((i_1521_ & 0xff00ff)
						   + (i_1522_ & 0xff00ff));
				    i_1522_
					= ((i_1524_ & 0x1000100)
					   + (i_1523_ - i_1524_ & 0x10000));
				    is[i_1389_++]
					= (i_1523_ - i_1522_
					   | i_1522_ - (i_1522_ >>> 8));
				} else
				    i_1389_++;
				i_1380_ += i_1385_;
			    }
			    i_1381_ += i_1386_;
			    i_1380_ = i_1516_;
			    i_1389_ += i_1390_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2672(int i, int i_1525_, int i_1526_) {
	throw new IllegalStateException();
    }
    
    void method2702(int i, int i_1527_, int i_1528_, int i_1529_, int i_1530_,
		    int i_1531_, int i_1532_, int i_1533_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (i_1528_ > 0 && i_1529_ > 0) {
	    int[] is = aClass185_Sub2_9016.anIntArray9338;
	    if (is != null) {
		int i_1534_ = 0;
		int i_1535_ = 0;
		int i_1536_ = aClass185_Sub2_9016.anInt9356 * 356365251;
		int i_1537_ = anInt8987 + anInt8985 + anInt8992;
		int i_1538_ = anInt8989 + anInt9002 + anInt8990;
		int i_1539_ = (i_1537_ << 16) / i_1528_;
		int i_1540_ = (i_1538_ << 16) / i_1529_;
		if (anInt8987 > 0) {
		    int i_1541_ = ((anInt8987 << 16) + i_1539_ - 1) / i_1539_;
		    i += i_1541_;
		    i_1534_ += i_1541_ * i_1539_ - (anInt8987 << 16);
		}
		if (anInt8989 > 0) {
		    int i_1542_ = ((anInt8989 << 16) + i_1540_ - 1) / i_1540_;
		    i_1527_ += i_1542_;
		    i_1535_ += i_1542_ * i_1540_ - (anInt8989 << 16);
		}
		if (anInt8985 < i_1537_)
		    i_1528_ = (((anInt8985 << 16) - i_1534_ + i_1539_ - 1)
			       / i_1539_);
		if (anInt9002 < i_1538_)
		    i_1529_ = (((anInt9002 << 16) - i_1535_ + i_1540_ - 1)
			       / i_1540_);
		int i_1543_ = i + i_1527_ * i_1536_;
		int i_1544_ = i_1536_ - i_1528_;
		if (i_1527_ + i_1529_
		    > aClass185_Sub2_9016.anInt9345 * 639238427)
		    i_1529_ -= (i_1527_ + i_1529_
				- aClass185_Sub2_9016.anInt9345 * 639238427);
		if (i_1527_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		    int i_1545_
			= aClass185_Sub2_9016.anInt9344 * 9823353 - i_1527_;
		    i_1529_ -= i_1545_;
		    i_1543_ += i_1545_ * i_1536_;
		    i_1535_ += i_1540_ * i_1545_;
		}
		if (i + i_1528_
		    > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		    int i_1546_
			= (i + i_1528_
			   - aClass185_Sub2_9016.anInt9343 * -1807368365);
		    i_1528_ -= i_1546_;
		    i_1544_ += i_1546_;
		}
		if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		    int i_1547_
			= aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		    i_1528_ -= i_1547_;
		    i_1543_ += i_1547_;
		    i_1534_ += i_1539_ * i_1547_;
		    i_1544_ += i_1547_;
		}
		if (i_1532_ == 0) {
		    if (i_1530_ == 1) {
			int i_1548_ = i_1534_;
			for (int i_1549_ = -i_1529_; i_1549_ < 0; i_1549_++) {
			    int i_1550_ = (i_1535_ >> 16) * anInt8985;
			    for (int i_1551_ = -i_1528_; i_1551_ < 0;
				 i_1551_++) {
				is[i_1543_++]
				    = (anIntArray11408
				       [(aByteArray11407
					 [(i_1534_ >> 16) + i_1550_]) & 0xff]);
				i_1534_ += i_1539_;
			    }
			    i_1535_ += i_1540_;
			    i_1534_ = i_1548_;
			    i_1543_ += i_1544_;
			}
		    } else if (i_1530_ == 0) {
			int i_1552_ = (i_1531_ & 0xff0000) >> 16;
			int i_1553_ = (i_1531_ & 0xff00) >> 8;
			int i_1554_ = i_1531_ & 0xff;
			int i_1555_ = i_1534_;
			for (int i_1556_ = -i_1529_; i_1556_ < 0; i_1556_++) {
			    int i_1557_ = (i_1535_ >> 16) * anInt8985;
			    for (int i_1558_ = -i_1528_; i_1558_ < 0;
				 i_1558_++) {
				int i_1559_
				    = (anIntArray11408
				       [(aByteArray11407
					 [(i_1534_ >> 16) + i_1557_]) & 0xff]);
				int i_1560_ = ((i_1559_ & 0xff0000) * i_1552_
					       & ~0xffffff);
				int i_1561_
				    = (i_1559_ & 0xff00) * i_1553_ & 0xff0000;
				int i_1562_
				    = (i_1559_ & 0xff) * i_1554_ & 0xff00;
				is[i_1543_++]
				    = (i_1560_ | i_1561_ | i_1562_) >>> 8;
				i_1534_ += i_1539_;
			    }
			    i_1535_ += i_1540_;
			    i_1534_ = i_1555_;
			    i_1543_ += i_1544_;
			}
		    } else if (i_1530_ == 3) {
			int i_1563_ = i_1534_;
			for (int i_1564_ = -i_1529_; i_1564_ < 0; i_1564_++) {
			    int i_1565_ = (i_1535_ >> 16) * anInt8985;
			    for (int i_1566_ = -i_1528_; i_1566_ < 0;
				 i_1566_++) {
				byte i_1567_ = (aByteArray11407
						[(i_1534_ >> 16) + i_1565_]);
				int i_1568_ = (i_1567_ > 0
					       ? anIntArray11408[i_1567_] : 0);
				int i_1569_ = i_1568_ + i_1531_;
				int i_1570_ = ((i_1568_ & 0xff00ff)
					       + (i_1531_ & 0xff00ff));
				int i_1571_
				    = ((i_1570_ & 0x1000100)
				       + (i_1569_ - i_1570_ & 0x10000));
				is[i_1543_++]
				    = i_1569_ - i_1571_ | i_1571_ - (i_1571_
								     >>> 8);
				i_1534_ += i_1539_;
			    }
			    i_1535_ += i_1540_;
			    i_1534_ = i_1563_;
			    i_1543_ += i_1544_;
			}
		    } else if (i_1530_ == 2) {
			int i_1572_ = i_1531_ >>> 24;
			int i_1573_ = 256 - i_1572_;
			int i_1574_
			    = (i_1531_ & 0xff00ff) * i_1573_ & ~0xff00ff;
			int i_1575_ = (i_1531_ & 0xff00) * i_1573_ & 0xff0000;
			i_1531_ = (i_1574_ | i_1575_) >>> 8;
			int i_1576_ = i_1534_;
			for (int i_1577_ = -i_1529_; i_1577_ < 0; i_1577_++) {
			    int i_1578_ = (i_1535_ >> 16) * anInt8985;
			    for (int i_1579_ = -i_1528_; i_1579_ < 0;
				 i_1579_++) {
				int i_1580_
				    = (anIntArray11408
				       [(aByteArray11407
					 [(i_1534_ >> 16) + i_1578_]) & 0xff]);
				i_1574_ = ((i_1580_ & 0xff00ff) * i_1572_
					   & ~0xff00ff);
				i_1575_
				    = (i_1580_ & 0xff00) * i_1572_ & 0xff0000;
				is[i_1543_++]
				    = ((i_1574_ | i_1575_) >>> 8) + i_1531_;
				i_1534_ += i_1539_;
			    }
			    i_1535_ += i_1540_;
			    i_1534_ = i_1576_;
			    i_1543_ += i_1544_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1532_ == 1) {
		    if (i_1530_ == 1) {
			int i_1581_ = i_1534_;
			for (int i_1582_ = -i_1529_; i_1582_ < 0; i_1582_++) {
			    int i_1583_ = (i_1535_ >> 16) * anInt8985;
			    for (int i_1584_ = -i_1528_; i_1584_ < 0;
				 i_1584_++) {
				int i_1585_ = (aByteArray11407
					       [(i_1534_ >> 16) + i_1583_]);
				if (i_1585_ != 0)
				    is[i_1543_++]
					= anIntArray11408[i_1585_ & 0xff];
				else
				    i_1543_++;
				i_1534_ += i_1539_;
			    }
			    i_1535_ += i_1540_;
			    i_1534_ = i_1581_;
			    i_1543_ += i_1544_;
			}
		    } else if (i_1530_ == 0) {
			int i_1586_ = i_1534_;
			if ((i_1531_ & 0xffffff) == 16777215) {
			    int i_1587_ = i_1531_ >>> 24;
			    int i_1588_ = 256 - i_1587_;
			    for (int i_1589_ = -i_1529_; i_1589_ < 0;
				 i_1589_++) {
				int i_1590_ = (i_1535_ >> 16) * anInt8985;
				for (int i_1591_ = -i_1528_; i_1591_ < 0;
				     i_1591_++) {
				    int i_1592_
					= (aByteArray11407
					   [(i_1534_ >> 16) + i_1590_]);
				    if (i_1592_ != 0) {
					int i_1593_
					    = anIntArray11408[i_1592_ & 0xff];
					int i_1594_ = is[i_1543_];
					is[i_1543_++]
					    = ((((i_1593_ & 0xff00ff) * i_1587_
						 + ((i_1594_ & 0xff00ff)
						    * i_1588_))
						& ~0xff00ff)
					       + (((i_1593_ & 0xff00) * i_1587_
						   + ((i_1594_ & 0xff00)
						      * i_1588_))
						  & 0xff0000)) >> 8;
				    } else
					i_1543_++;
				    i_1534_ += i_1539_;
				}
				i_1535_ += i_1540_;
				i_1534_ = i_1586_;
				i_1543_ += i_1544_;
			    }
			} else {
			    int i_1595_ = (i_1531_ & 0xff0000) >> 16;
			    int i_1596_ = (i_1531_ & 0xff00) >> 8;
			    int i_1597_ = i_1531_ & 0xff;
			    int i_1598_ = i_1531_ >>> 24;
			    int i_1599_ = 256 - i_1598_;
			    for (int i_1600_ = -i_1529_; i_1600_ < 0;
				 i_1600_++) {
				int i_1601_ = (i_1535_ >> 16) * anInt8985;
				for (int i_1602_ = -i_1528_; i_1602_ < 0;
				     i_1602_++) {
				    int i_1603_
					= (aByteArray11407
					   [(i_1534_ >> 16) + i_1601_]);
				    if (i_1603_ != 0) {
					int i_1604_
					    = anIntArray11408[i_1603_ & 0xff];
					if (i_1598_ != 255) {
					    int i_1605_
						= (((i_1604_ & 0xff0000)
						    * i_1595_)
						   & ~0xffffff);
					    int i_1606_
						= ((i_1604_ & 0xff00) * i_1596_
						   & 0xff0000);
					    int i_1607_
						= ((i_1604_ & 0xff) * i_1597_
						   & 0xff00);
					    i_1604_ = (i_1605_ | i_1606_
						       | i_1607_) >>> 8;
					    int i_1608_ = is[i_1543_];
					    is[i_1543_++]
						= (((((i_1604_ & 0xff00ff)
						      * i_1598_)
						     + ((i_1608_ & 0xff00ff)
							* i_1599_))
						    & ~0xff00ff)
						   + ((((i_1604_ & 0xff00)
							* i_1598_)
						       + ((i_1608_ & 0xff00)
							  * i_1599_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1609_
						= (((i_1604_ & 0xff0000)
						    * i_1595_)
						   & ~0xffffff);
					    int i_1610_
						= ((i_1604_ & 0xff00) * i_1596_
						   & 0xff0000);
					    int i_1611_
						= ((i_1604_ & 0xff) * i_1597_
						   & 0xff00);
					    is[i_1543_++] = (i_1609_ | i_1610_
							     | i_1611_) >>> 8;
					}
				    } else
					i_1543_++;
				    i_1534_ += i_1539_;
				}
				i_1535_ += i_1540_;
				i_1534_ = i_1586_;
				i_1543_ += i_1544_;
			    }
			}
		    } else if (i_1530_ == 3) {
			int i_1612_ = i_1534_;
			int i_1613_ = i_1531_ >>> 24;
			int i_1614_ = 256 - i_1613_;
			for (int i_1615_ = -i_1529_; i_1615_ < 0; i_1615_++) {
			    int i_1616_ = (i_1535_ >> 16) * anInt8985;
			    for (int i_1617_ = -i_1528_; i_1617_ < 0;
				 i_1617_++) {
				byte i_1618_ = (aByteArray11407
						[(i_1534_ >> 16) + i_1616_]);
				int i_1619_ = (i_1618_ > 0
					       ? anIntArray11408[i_1618_] : 0);
				int i_1620_ = i_1619_ + i_1531_;
				int i_1621_ = ((i_1619_ & 0xff00ff)
					       + (i_1531_ & 0xff00ff));
				int i_1622_
				    = ((i_1621_ & 0x1000100)
				       + (i_1620_ - i_1621_ & 0x10000));
				i_1622_
				    = i_1620_ - i_1622_ | i_1622_ - (i_1622_
								     >>> 8);
				if (i_1619_ == 0 && i_1613_ != 255) {
				    i_1619_ = i_1622_;
				    i_1622_ = is[i_1543_];
				    i_1622_
					= ((((i_1619_ & 0xff00ff) * i_1613_
					     + (i_1622_ & 0xff00ff) * i_1614_)
					    & ~0xff00ff)
					   + (((i_1619_ & 0xff00) * i_1613_
					       + (i_1622_ & 0xff00) * i_1614_)
					      & 0xff0000)) >> 8;
				}
				is[i_1543_++] = i_1622_;
				i_1534_ += i_1539_;
			    }
			    i_1535_ += i_1540_;
			    i_1534_ = i_1612_;
			    i_1543_ += i_1544_;
			}
		    } else if (i_1530_ == 2) {
			int i_1623_ = i_1531_ >>> 24;
			int i_1624_ = 256 - i_1623_;
			int i_1625_
			    = (i_1531_ & 0xff00ff) * i_1624_ & ~0xff00ff;
			int i_1626_ = (i_1531_ & 0xff00) * i_1624_ & 0xff0000;
			i_1531_ = (i_1625_ | i_1626_) >>> 8;
			int i_1627_ = i_1534_;
			for (int i_1628_ = -i_1529_; i_1628_ < 0; i_1628_++) {
			    int i_1629_ = (i_1535_ >> 16) * anInt8985;
			    for (int i_1630_ = -i_1528_; i_1630_ < 0;
				 i_1630_++) {
				int i_1631_ = (aByteArray11407
					       [(i_1534_ >> 16) + i_1629_]);
				if (i_1631_ != 0) {
				    int i_1632_
					= anIntArray11408[i_1631_ & 0xff];
				    i_1625_ = ((i_1632_ & 0xff00ff) * i_1623_
					       & ~0xff00ff);
				    i_1626_ = ((i_1632_ & 0xff00) * i_1623_
					       & 0xff0000);
				    is[i_1543_++] = ((i_1625_ | i_1626_)
						     >>> 8) + i_1531_;
				} else
				    i_1543_++;
				i_1534_ += i_1539_;
			    }
			    i_1535_ += i_1540_;
			    i_1534_ = i_1627_;
			    i_1543_ += i_1544_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1532_ == 2) {
		    if (i_1530_ == 1) {
			int i_1633_ = i_1534_;
			for (int i_1634_ = -i_1529_; i_1634_ < 0; i_1634_++) {
			    int i_1635_ = (i_1535_ >> 16) * anInt8985;
			    for (int i_1636_ = -i_1528_; i_1636_ < 0;
				 i_1636_++) {
				int i_1637_ = (aByteArray11407
					       [(i_1534_ >> 16) + i_1635_]);
				if (i_1637_ != 0) {
				    int i_1638_
					= anIntArray11408[i_1637_ & 0xff];
				    int i_1639_ = is[i_1543_];
				    int i_1640_ = i_1638_ + i_1639_;
				    int i_1641_ = ((i_1638_ & 0xff00ff)
						   + (i_1639_ & 0xff00ff));
				    i_1639_
					= ((i_1641_ & 0x1000100)
					   + (i_1640_ - i_1641_ & 0x10000));
				    is[i_1543_++]
					= (i_1640_ - i_1639_
					   | i_1639_ - (i_1639_ >>> 8));
				} else
				    i_1543_++;
				i_1534_ += i_1539_;
			    }
			    i_1535_ += i_1540_;
			    i_1534_ = i_1633_;
			    i_1543_ += i_1544_;
			}
		    } else if (i_1530_ == 0) {
			int i_1642_ = i_1534_;
			int i_1643_ = (i_1531_ & 0xff0000) >> 16;
			int i_1644_ = (i_1531_ & 0xff00) >> 8;
			int i_1645_ = i_1531_ & 0xff;
			for (int i_1646_ = -i_1529_; i_1646_ < 0; i_1646_++) {
			    int i_1647_ = (i_1535_ >> 16) * anInt8985;
			    for (int i_1648_ = -i_1528_; i_1648_ < 0;
				 i_1648_++) {
				int i_1649_ = (aByteArray11407
					       [(i_1534_ >> 16) + i_1647_]);
				if (i_1649_ != 0) {
				    int i_1650_
					= anIntArray11408[i_1649_ & 0xff];
				    int i_1651_
					= ((i_1650_ & 0xff0000) * i_1643_
					   & ~0xffffff);
				    int i_1652_ = ((i_1650_ & 0xff00) * i_1644_
						   & 0xff0000);
				    int i_1653_
					= (i_1650_ & 0xff) * i_1645_ & 0xff00;
				    i_1650_
					= (i_1651_ | i_1652_ | i_1653_) >>> 8;
				    int i_1654_ = is[i_1543_];
				    int i_1655_ = i_1650_ + i_1654_;
				    int i_1656_ = ((i_1650_ & 0xff00ff)
						   + (i_1654_ & 0xff00ff));
				    i_1654_
					= ((i_1656_ & 0x1000100)
					   + (i_1655_ - i_1656_ & 0x10000));
				    is[i_1543_++]
					= (i_1655_ - i_1654_
					   | i_1654_ - (i_1654_ >>> 8));
				} else
				    i_1543_++;
				i_1534_ += i_1539_;
			    }
			    i_1535_ += i_1540_;
			    i_1534_ = i_1642_;
			    i_1543_ += i_1544_;
			}
		    } else if (i_1530_ == 3) {
			int i_1657_ = i_1534_;
			for (int i_1658_ = -i_1529_; i_1658_ < 0; i_1658_++) {
			    int i_1659_ = (i_1535_ >> 16) * anInt8985;
			    for (int i_1660_ = -i_1528_; i_1660_ < 0;
				 i_1660_++) {
				byte i_1661_ = (aByteArray11407
						[(i_1534_ >> 16) + i_1659_]);
				int i_1662_ = (i_1661_ > 0
					       ? anIntArray11408[i_1661_] : 0);
				int i_1663_ = i_1662_ + i_1531_;
				int i_1664_ = ((i_1662_ & 0xff00ff)
					       + (i_1531_ & 0xff00ff));
				int i_1665_
				    = ((i_1664_ & 0x1000100)
				       + (i_1663_ - i_1664_ & 0x10000));
				i_1662_
				    = i_1663_ - i_1665_ | i_1665_ - (i_1665_
								     >>> 8);
				i_1665_ = is[i_1543_];
				i_1663_ = i_1662_ + i_1665_;
				i_1664_ = (i_1662_ & 0xff00ff) + (i_1665_
								  & 0xff00ff);
				i_1665_ = ((i_1664_ & 0x1000100)
					   + (i_1663_ - i_1664_ & 0x10000));
				is[i_1543_++]
				    = i_1663_ - i_1665_ | i_1665_ - (i_1665_
								     >>> 8);
				i_1534_ += i_1539_;
			    }
			    i_1535_ += i_1540_;
			    i_1534_ = i_1657_;
			    i_1543_ += i_1544_;
			}
		    } else if (i_1530_ == 2) {
			int i_1666_ = i_1531_ >>> 24;
			int i_1667_ = 256 - i_1666_;
			int i_1668_
			    = (i_1531_ & 0xff00ff) * i_1667_ & ~0xff00ff;
			int i_1669_ = (i_1531_ & 0xff00) * i_1667_ & 0xff0000;
			i_1531_ = (i_1668_ | i_1669_) >>> 8;
			int i_1670_ = i_1534_;
			for (int i_1671_ = -i_1529_; i_1671_ < 0; i_1671_++) {
			    int i_1672_ = (i_1535_ >> 16) * anInt8985;
			    for (int i_1673_ = -i_1528_; i_1673_ < 0;
				 i_1673_++) {
				int i_1674_ = (aByteArray11407
					       [(i_1534_ >> 16) + i_1672_]);
				if (i_1674_ != 0) {
				    int i_1675_
					= anIntArray11408[i_1674_ & 0xff];
				    i_1668_ = ((i_1675_ & 0xff00ff) * i_1666_
					       & ~0xff00ff);
				    i_1669_ = ((i_1675_ & 0xff00) * i_1666_
					       & 0xff0000);
				    i_1675_ = (((i_1668_ | i_1669_) >>> 8)
					       + i_1531_);
				    int i_1676_ = is[i_1543_];
				    int i_1677_ = i_1675_ + i_1676_;
				    int i_1678_ = ((i_1675_ & 0xff00ff)
						   + (i_1676_ & 0xff00ff));
				    i_1676_
					= ((i_1678_ & 0x1000100)
					   + (i_1677_ - i_1678_ & 0x10000));
				    is[i_1543_++]
					= (i_1677_ - i_1676_
					   | i_1676_ - (i_1676_ >>> 8));
				} else
				    i_1543_++;
				i_1534_ += i_1539_;
			    }
			    i_1535_ += i_1540_;
			    i_1534_ = i_1670_;
			    i_1543_ += i_1544_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method2718(int i, int i_1679_, int i_1680_, int i_1681_, int i_1682_,
		    int i_1683_, int i_1684_, int i_1685_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (i_1680_ > 0 && i_1681_ > 0) {
	    int[] is = aClass185_Sub2_9016.anIntArray9338;
	    if (is != null) {
		int i_1686_ = 0;
		int i_1687_ = 0;
		int i_1688_ = aClass185_Sub2_9016.anInt9356 * 356365251;
		int i_1689_ = anInt8987 + anInt8985 + anInt8992;
		int i_1690_ = anInt8989 + anInt9002 + anInt8990;
		int i_1691_ = (i_1689_ << 16) / i_1680_;
		int i_1692_ = (i_1690_ << 16) / i_1681_;
		if (anInt8987 > 0) {
		    int i_1693_ = ((anInt8987 << 16) + i_1691_ - 1) / i_1691_;
		    i += i_1693_;
		    i_1686_ += i_1693_ * i_1691_ - (anInt8987 << 16);
		}
		if (anInt8989 > 0) {
		    int i_1694_ = ((anInt8989 << 16) + i_1692_ - 1) / i_1692_;
		    i_1679_ += i_1694_;
		    i_1687_ += i_1694_ * i_1692_ - (anInt8989 << 16);
		}
		if (anInt8985 < i_1689_)
		    i_1680_ = (((anInt8985 << 16) - i_1686_ + i_1691_ - 1)
			       / i_1691_);
		if (anInt9002 < i_1690_)
		    i_1681_ = (((anInt9002 << 16) - i_1687_ + i_1692_ - 1)
			       / i_1692_);
		int i_1695_ = i + i_1679_ * i_1688_;
		int i_1696_ = i_1688_ - i_1680_;
		if (i_1679_ + i_1681_
		    > aClass185_Sub2_9016.anInt9345 * 639238427)
		    i_1681_ -= (i_1679_ + i_1681_
				- aClass185_Sub2_9016.anInt9345 * 639238427);
		if (i_1679_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		    int i_1697_
			= aClass185_Sub2_9016.anInt9344 * 9823353 - i_1679_;
		    i_1681_ -= i_1697_;
		    i_1695_ += i_1697_ * i_1688_;
		    i_1687_ += i_1692_ * i_1697_;
		}
		if (i + i_1680_
		    > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		    int i_1698_
			= (i + i_1680_
			   - aClass185_Sub2_9016.anInt9343 * -1807368365);
		    i_1680_ -= i_1698_;
		    i_1696_ += i_1698_;
		}
		if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		    int i_1699_
			= aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		    i_1680_ -= i_1699_;
		    i_1695_ += i_1699_;
		    i_1686_ += i_1691_ * i_1699_;
		    i_1696_ += i_1699_;
		}
		if (i_1684_ == 0) {
		    if (i_1682_ == 1) {
			int i_1700_ = i_1686_;
			for (int i_1701_ = -i_1681_; i_1701_ < 0; i_1701_++) {
			    int i_1702_ = (i_1687_ >> 16) * anInt8985;
			    for (int i_1703_ = -i_1680_; i_1703_ < 0;
				 i_1703_++) {
				is[i_1695_++]
				    = (anIntArray11408
				       [(aByteArray11407
					 [(i_1686_ >> 16) + i_1702_]) & 0xff]);
				i_1686_ += i_1691_;
			    }
			    i_1687_ += i_1692_;
			    i_1686_ = i_1700_;
			    i_1695_ += i_1696_;
			}
		    } else if (i_1682_ == 0) {
			int i_1704_ = (i_1683_ & 0xff0000) >> 16;
			int i_1705_ = (i_1683_ & 0xff00) >> 8;
			int i_1706_ = i_1683_ & 0xff;
			int i_1707_ = i_1686_;
			for (int i_1708_ = -i_1681_; i_1708_ < 0; i_1708_++) {
			    int i_1709_ = (i_1687_ >> 16) * anInt8985;
			    for (int i_1710_ = -i_1680_; i_1710_ < 0;
				 i_1710_++) {
				int i_1711_
				    = (anIntArray11408
				       [(aByteArray11407
					 [(i_1686_ >> 16) + i_1709_]) & 0xff]);
				int i_1712_ = ((i_1711_ & 0xff0000) * i_1704_
					       & ~0xffffff);
				int i_1713_
				    = (i_1711_ & 0xff00) * i_1705_ & 0xff0000;
				int i_1714_
				    = (i_1711_ & 0xff) * i_1706_ & 0xff00;
				is[i_1695_++]
				    = (i_1712_ | i_1713_ | i_1714_) >>> 8;
				i_1686_ += i_1691_;
			    }
			    i_1687_ += i_1692_;
			    i_1686_ = i_1707_;
			    i_1695_ += i_1696_;
			}
		    } else if (i_1682_ == 3) {
			int i_1715_ = i_1686_;
			for (int i_1716_ = -i_1681_; i_1716_ < 0; i_1716_++) {
			    int i_1717_ = (i_1687_ >> 16) * anInt8985;
			    for (int i_1718_ = -i_1680_; i_1718_ < 0;
				 i_1718_++) {
				byte i_1719_ = (aByteArray11407
						[(i_1686_ >> 16) + i_1717_]);
				int i_1720_ = (i_1719_ > 0
					       ? anIntArray11408[i_1719_] : 0);
				int i_1721_ = i_1720_ + i_1683_;
				int i_1722_ = ((i_1720_ & 0xff00ff)
					       + (i_1683_ & 0xff00ff));
				int i_1723_
				    = ((i_1722_ & 0x1000100)
				       + (i_1721_ - i_1722_ & 0x10000));
				is[i_1695_++]
				    = i_1721_ - i_1723_ | i_1723_ - (i_1723_
								     >>> 8);
				i_1686_ += i_1691_;
			    }
			    i_1687_ += i_1692_;
			    i_1686_ = i_1715_;
			    i_1695_ += i_1696_;
			}
		    } else if (i_1682_ == 2) {
			int i_1724_ = i_1683_ >>> 24;
			int i_1725_ = 256 - i_1724_;
			int i_1726_
			    = (i_1683_ & 0xff00ff) * i_1725_ & ~0xff00ff;
			int i_1727_ = (i_1683_ & 0xff00) * i_1725_ & 0xff0000;
			i_1683_ = (i_1726_ | i_1727_) >>> 8;
			int i_1728_ = i_1686_;
			for (int i_1729_ = -i_1681_; i_1729_ < 0; i_1729_++) {
			    int i_1730_ = (i_1687_ >> 16) * anInt8985;
			    for (int i_1731_ = -i_1680_; i_1731_ < 0;
				 i_1731_++) {
				int i_1732_
				    = (anIntArray11408
				       [(aByteArray11407
					 [(i_1686_ >> 16) + i_1730_]) & 0xff]);
				i_1726_ = ((i_1732_ & 0xff00ff) * i_1724_
					   & ~0xff00ff);
				i_1727_
				    = (i_1732_ & 0xff00) * i_1724_ & 0xff0000;
				is[i_1695_++]
				    = ((i_1726_ | i_1727_) >>> 8) + i_1683_;
				i_1686_ += i_1691_;
			    }
			    i_1687_ += i_1692_;
			    i_1686_ = i_1728_;
			    i_1695_ += i_1696_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1684_ == 1) {
		    if (i_1682_ == 1) {
			int i_1733_ = i_1686_;
			for (int i_1734_ = -i_1681_; i_1734_ < 0; i_1734_++) {
			    int i_1735_ = (i_1687_ >> 16) * anInt8985;
			    for (int i_1736_ = -i_1680_; i_1736_ < 0;
				 i_1736_++) {
				int i_1737_ = (aByteArray11407
					       [(i_1686_ >> 16) + i_1735_]);
				if (i_1737_ != 0)
				    is[i_1695_++]
					= anIntArray11408[i_1737_ & 0xff];
				else
				    i_1695_++;
				i_1686_ += i_1691_;
			    }
			    i_1687_ += i_1692_;
			    i_1686_ = i_1733_;
			    i_1695_ += i_1696_;
			}
		    } else if (i_1682_ == 0) {
			int i_1738_ = i_1686_;
			if ((i_1683_ & 0xffffff) == 16777215) {
			    int i_1739_ = i_1683_ >>> 24;
			    int i_1740_ = 256 - i_1739_;
			    for (int i_1741_ = -i_1681_; i_1741_ < 0;
				 i_1741_++) {
				int i_1742_ = (i_1687_ >> 16) * anInt8985;
				for (int i_1743_ = -i_1680_; i_1743_ < 0;
				     i_1743_++) {
				    int i_1744_
					= (aByteArray11407
					   [(i_1686_ >> 16) + i_1742_]);
				    if (i_1744_ != 0) {
					int i_1745_
					    = anIntArray11408[i_1744_ & 0xff];
					int i_1746_ = is[i_1695_];
					is[i_1695_++]
					    = ((((i_1745_ & 0xff00ff) * i_1739_
						 + ((i_1746_ & 0xff00ff)
						    * i_1740_))
						& ~0xff00ff)
					       + (((i_1745_ & 0xff00) * i_1739_
						   + ((i_1746_ & 0xff00)
						      * i_1740_))
						  & 0xff0000)) >> 8;
				    } else
					i_1695_++;
				    i_1686_ += i_1691_;
				}
				i_1687_ += i_1692_;
				i_1686_ = i_1738_;
				i_1695_ += i_1696_;
			    }
			} else {
			    int i_1747_ = (i_1683_ & 0xff0000) >> 16;
			    int i_1748_ = (i_1683_ & 0xff00) >> 8;
			    int i_1749_ = i_1683_ & 0xff;
			    int i_1750_ = i_1683_ >>> 24;
			    int i_1751_ = 256 - i_1750_;
			    for (int i_1752_ = -i_1681_; i_1752_ < 0;
				 i_1752_++) {
				int i_1753_ = (i_1687_ >> 16) * anInt8985;
				for (int i_1754_ = -i_1680_; i_1754_ < 0;
				     i_1754_++) {
				    int i_1755_
					= (aByteArray11407
					   [(i_1686_ >> 16) + i_1753_]);
				    if (i_1755_ != 0) {
					int i_1756_
					    = anIntArray11408[i_1755_ & 0xff];
					if (i_1750_ != 255) {
					    int i_1757_
						= (((i_1756_ & 0xff0000)
						    * i_1747_)
						   & ~0xffffff);
					    int i_1758_
						= ((i_1756_ & 0xff00) * i_1748_
						   & 0xff0000);
					    int i_1759_
						= ((i_1756_ & 0xff) * i_1749_
						   & 0xff00);
					    i_1756_ = (i_1757_ | i_1758_
						       | i_1759_) >>> 8;
					    int i_1760_ = is[i_1695_];
					    is[i_1695_++]
						= (((((i_1756_ & 0xff00ff)
						      * i_1750_)
						     + ((i_1760_ & 0xff00ff)
							* i_1751_))
						    & ~0xff00ff)
						   + ((((i_1756_ & 0xff00)
							* i_1750_)
						       + ((i_1760_ & 0xff00)
							  * i_1751_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1761_
						= (((i_1756_ & 0xff0000)
						    * i_1747_)
						   & ~0xffffff);
					    int i_1762_
						= ((i_1756_ & 0xff00) * i_1748_
						   & 0xff0000);
					    int i_1763_
						= ((i_1756_ & 0xff) * i_1749_
						   & 0xff00);
					    is[i_1695_++] = (i_1761_ | i_1762_
							     | i_1763_) >>> 8;
					}
				    } else
					i_1695_++;
				    i_1686_ += i_1691_;
				}
				i_1687_ += i_1692_;
				i_1686_ = i_1738_;
				i_1695_ += i_1696_;
			    }
			}
		    } else if (i_1682_ == 3) {
			int i_1764_ = i_1686_;
			int i_1765_ = i_1683_ >>> 24;
			int i_1766_ = 256 - i_1765_;
			for (int i_1767_ = -i_1681_; i_1767_ < 0; i_1767_++) {
			    int i_1768_ = (i_1687_ >> 16) * anInt8985;
			    for (int i_1769_ = -i_1680_; i_1769_ < 0;
				 i_1769_++) {
				byte i_1770_ = (aByteArray11407
						[(i_1686_ >> 16) + i_1768_]);
				int i_1771_ = (i_1770_ > 0
					       ? anIntArray11408[i_1770_] : 0);
				int i_1772_ = i_1771_ + i_1683_;
				int i_1773_ = ((i_1771_ & 0xff00ff)
					       + (i_1683_ & 0xff00ff));
				int i_1774_
				    = ((i_1773_ & 0x1000100)
				       + (i_1772_ - i_1773_ & 0x10000));
				i_1774_
				    = i_1772_ - i_1774_ | i_1774_ - (i_1774_
								     >>> 8);
				if (i_1771_ == 0 && i_1765_ != 255) {
				    i_1771_ = i_1774_;
				    i_1774_ = is[i_1695_];
				    i_1774_
					= ((((i_1771_ & 0xff00ff) * i_1765_
					     + (i_1774_ & 0xff00ff) * i_1766_)
					    & ~0xff00ff)
					   + (((i_1771_ & 0xff00) * i_1765_
					       + (i_1774_ & 0xff00) * i_1766_)
					      & 0xff0000)) >> 8;
				}
				is[i_1695_++] = i_1774_;
				i_1686_ += i_1691_;
			    }
			    i_1687_ += i_1692_;
			    i_1686_ = i_1764_;
			    i_1695_ += i_1696_;
			}
		    } else if (i_1682_ == 2) {
			int i_1775_ = i_1683_ >>> 24;
			int i_1776_ = 256 - i_1775_;
			int i_1777_
			    = (i_1683_ & 0xff00ff) * i_1776_ & ~0xff00ff;
			int i_1778_ = (i_1683_ & 0xff00) * i_1776_ & 0xff0000;
			i_1683_ = (i_1777_ | i_1778_) >>> 8;
			int i_1779_ = i_1686_;
			for (int i_1780_ = -i_1681_; i_1780_ < 0; i_1780_++) {
			    int i_1781_ = (i_1687_ >> 16) * anInt8985;
			    for (int i_1782_ = -i_1680_; i_1782_ < 0;
				 i_1782_++) {
				int i_1783_ = (aByteArray11407
					       [(i_1686_ >> 16) + i_1781_]);
				if (i_1783_ != 0) {
				    int i_1784_
					= anIntArray11408[i_1783_ & 0xff];
				    i_1777_ = ((i_1784_ & 0xff00ff) * i_1775_
					       & ~0xff00ff);
				    i_1778_ = ((i_1784_ & 0xff00) * i_1775_
					       & 0xff0000);
				    is[i_1695_++] = ((i_1777_ | i_1778_)
						     >>> 8) + i_1683_;
				} else
				    i_1695_++;
				i_1686_ += i_1691_;
			    }
			    i_1687_ += i_1692_;
			    i_1686_ = i_1779_;
			    i_1695_ += i_1696_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1684_ == 2) {
		    if (i_1682_ == 1) {
			int i_1785_ = i_1686_;
			for (int i_1786_ = -i_1681_; i_1786_ < 0; i_1786_++) {
			    int i_1787_ = (i_1687_ >> 16) * anInt8985;
			    for (int i_1788_ = -i_1680_; i_1788_ < 0;
				 i_1788_++) {
				int i_1789_ = (aByteArray11407
					       [(i_1686_ >> 16) + i_1787_]);
				if (i_1789_ != 0) {
				    int i_1790_
					= anIntArray11408[i_1789_ & 0xff];
				    int i_1791_ = is[i_1695_];
				    int i_1792_ = i_1790_ + i_1791_;
				    int i_1793_ = ((i_1790_ & 0xff00ff)
						   + (i_1791_ & 0xff00ff));
				    i_1791_
					= ((i_1793_ & 0x1000100)
					   + (i_1792_ - i_1793_ & 0x10000));
				    is[i_1695_++]
					= (i_1792_ - i_1791_
					   | i_1791_ - (i_1791_ >>> 8));
				} else
				    i_1695_++;
				i_1686_ += i_1691_;
			    }
			    i_1687_ += i_1692_;
			    i_1686_ = i_1785_;
			    i_1695_ += i_1696_;
			}
		    } else if (i_1682_ == 0) {
			int i_1794_ = i_1686_;
			int i_1795_ = (i_1683_ & 0xff0000) >> 16;
			int i_1796_ = (i_1683_ & 0xff00) >> 8;
			int i_1797_ = i_1683_ & 0xff;
			for (int i_1798_ = -i_1681_; i_1798_ < 0; i_1798_++) {
			    int i_1799_ = (i_1687_ >> 16) * anInt8985;
			    for (int i_1800_ = -i_1680_; i_1800_ < 0;
				 i_1800_++) {
				int i_1801_ = (aByteArray11407
					       [(i_1686_ >> 16) + i_1799_]);
				if (i_1801_ != 0) {
				    int i_1802_
					= anIntArray11408[i_1801_ & 0xff];
				    int i_1803_
					= ((i_1802_ & 0xff0000) * i_1795_
					   & ~0xffffff);
				    int i_1804_ = ((i_1802_ & 0xff00) * i_1796_
						   & 0xff0000);
				    int i_1805_
					= (i_1802_ & 0xff) * i_1797_ & 0xff00;
				    i_1802_
					= (i_1803_ | i_1804_ | i_1805_) >>> 8;
				    int i_1806_ = is[i_1695_];
				    int i_1807_ = i_1802_ + i_1806_;
				    int i_1808_ = ((i_1802_ & 0xff00ff)
						   + (i_1806_ & 0xff00ff));
				    i_1806_
					= ((i_1808_ & 0x1000100)
					   + (i_1807_ - i_1808_ & 0x10000));
				    is[i_1695_++]
					= (i_1807_ - i_1806_
					   | i_1806_ - (i_1806_ >>> 8));
				} else
				    i_1695_++;
				i_1686_ += i_1691_;
			    }
			    i_1687_ += i_1692_;
			    i_1686_ = i_1794_;
			    i_1695_ += i_1696_;
			}
		    } else if (i_1682_ == 3) {
			int i_1809_ = i_1686_;
			for (int i_1810_ = -i_1681_; i_1810_ < 0; i_1810_++) {
			    int i_1811_ = (i_1687_ >> 16) * anInt8985;
			    for (int i_1812_ = -i_1680_; i_1812_ < 0;
				 i_1812_++) {
				byte i_1813_ = (aByteArray11407
						[(i_1686_ >> 16) + i_1811_]);
				int i_1814_ = (i_1813_ > 0
					       ? anIntArray11408[i_1813_] : 0);
				int i_1815_ = i_1814_ + i_1683_;
				int i_1816_ = ((i_1814_ & 0xff00ff)
					       + (i_1683_ & 0xff00ff));
				int i_1817_
				    = ((i_1816_ & 0x1000100)
				       + (i_1815_ - i_1816_ & 0x10000));
				i_1814_
				    = i_1815_ - i_1817_ | i_1817_ - (i_1817_
								     >>> 8);
				i_1817_ = is[i_1695_];
				i_1815_ = i_1814_ + i_1817_;
				i_1816_ = (i_1814_ & 0xff00ff) + (i_1817_
								  & 0xff00ff);
				i_1817_ = ((i_1816_ & 0x1000100)
					   + (i_1815_ - i_1816_ & 0x10000));
				is[i_1695_++]
				    = i_1815_ - i_1817_ | i_1817_ - (i_1817_
								     >>> 8);
				i_1686_ += i_1691_;
			    }
			    i_1687_ += i_1692_;
			    i_1686_ = i_1809_;
			    i_1695_ += i_1696_;
			}
		    } else if (i_1682_ == 2) {
			int i_1818_ = i_1683_ >>> 24;
			int i_1819_ = 256 - i_1818_;
			int i_1820_
			    = (i_1683_ & 0xff00ff) * i_1819_ & ~0xff00ff;
			int i_1821_ = (i_1683_ & 0xff00) * i_1819_ & 0xff0000;
			i_1683_ = (i_1820_ | i_1821_) >>> 8;
			int i_1822_ = i_1686_;
			for (int i_1823_ = -i_1681_; i_1823_ < 0; i_1823_++) {
			    int i_1824_ = (i_1687_ >> 16) * anInt8985;
			    for (int i_1825_ = -i_1680_; i_1825_ < 0;
				 i_1825_++) {
				int i_1826_ = (aByteArray11407
					       [(i_1686_ >> 16) + i_1824_]);
				if (i_1826_ != 0) {
				    int i_1827_
					= anIntArray11408[i_1826_ & 0xff];
				    i_1820_ = ((i_1827_ & 0xff00ff) * i_1818_
					       & ~0xff00ff);
				    i_1821_ = ((i_1827_ & 0xff00) * i_1818_
					       & 0xff0000);
				    i_1827_ = (((i_1820_ | i_1821_) >>> 8)
					       + i_1683_);
				    int i_1828_ = is[i_1695_];
				    int i_1829_ = i_1827_ + i_1828_;
				    int i_1830_ = ((i_1827_ & 0xff00ff)
						   + (i_1828_ & 0xff00ff));
				    i_1828_
					= ((i_1830_ & 0x1000100)
					   + (i_1829_ - i_1830_ & 0x10000));
				    is[i_1695_++]
					= (i_1829_ - i_1828_
					   | i_1828_ - (i_1828_ >>> 8));
				} else
				    i_1695_++;
				i_1686_ += i_1691_;
			    }
			    i_1687_ += i_1692_;
			    i_1686_ = i_1822_;
			    i_1695_ += i_1696_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method14513(boolean bool, boolean bool_1831_, boolean bool_1832_,
		     int i, int i_1833_, float f, int i_1834_, int i_1835_,
		     int i_1836_, int i_1837_, int i_1838_, int i_1839_,
		     boolean bool_1840_) {
	if (i_1834_ > 0 && i_1835_ > 0 && (bool || bool_1831_)) {
	    int i_1841_ = 0;
	    int i_1842_ = 0;
	    int i_1843_ = anInt8987 + anInt8985 + anInt8992;
	    int i_1844_ = anInt8989 + anInt9002 + anInt8990;
	    int i_1845_ = (i_1843_ << 16) / i_1834_;
	    int i_1846_ = (i_1844_ << 16) / i_1835_;
	    if (anInt8987 > 0) {
		int i_1847_ = ((anInt8987 << 16) + i_1845_ - 1) / i_1845_;
		i += i_1847_;
		i_1841_ += i_1847_ * i_1845_ - (anInt8987 << 16);
	    }
	    if (anInt8989 > 0) {
		int i_1848_ = ((anInt8989 << 16) + i_1846_ - 1) / i_1846_;
		i_1833_ += i_1848_;
		i_1842_ += i_1848_ * i_1846_ - (anInt8989 << 16);
	    }
	    if (anInt8985 < i_1843_)
		i_1834_
		    = ((anInt8985 << 16) - i_1841_ + i_1845_ - 1) / i_1845_;
	    if (anInt9002 < i_1844_)
		i_1835_
		    = ((anInt9002 << 16) - i_1842_ + i_1846_ - 1) / i_1846_;
	    int i_1849_
		= i + i_1833_ * (aClass185_Sub2_9016.anInt9356 * 356365251);
	    int i_1850_ = aClass185_Sub2_9016.anInt9356 * 356365251 - i_1834_;
	    if (i_1833_ + i_1835_ > aClass185_Sub2_9016.anInt9345 * 639238427)
		i_1835_ -= (i_1833_ + i_1835_
			    - aClass185_Sub2_9016.anInt9345 * 639238427);
	    if (i_1833_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		int i_1851_
		    = aClass185_Sub2_9016.anInt9344 * 9823353 - i_1833_;
		i_1835_ -= i_1851_;
		i_1849_
		    += i_1851_ * (aClass185_Sub2_9016.anInt9356 * 356365251);
		i_1842_ += i_1846_ * i_1851_;
	    }
	    if (i + i_1834_ > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		int i_1852_ = (i + i_1834_
			       - aClass185_Sub2_9016.anInt9343 * -1807368365);
		i_1834_ -= i_1852_;
		i_1850_ += i_1852_;
	    }
	    if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		int i_1853_ = aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		i_1834_ -= i_1853_;
		i_1849_ += i_1853_;
		i_1841_ += i_1845_ * i_1853_;
		i_1850_ += i_1853_;
	    }
	    float[] fs = aClass185_Sub2_9016.aFloatArray9341;
	    int[] is = aClass185_Sub2_9016.anIntArray9338;
	    if (i_1838_ == 0) {
		if (i_1836_ == 1) {
		    int i_1854_ = i_1841_;
		    for (int i_1855_ = -i_1835_; i_1855_ < 0; i_1855_++) {
			int i_1856_ = (i_1842_ >> 16) * anInt8985;
			for (int i_1857_ = -i_1834_; i_1857_ < 0; i_1857_++) {
			    if (!bool_1831_ || f < fs[i_1849_]) {
				if (bool)
				    is[i_1849_]
					= (anIntArray11408
					   [((aByteArray11407
					      [(i_1841_ >> 16) + i_1856_])
					     & 0xff)]);
				if (bool_1831_ && bool_1840_)
				    fs[i_1849_] = f;
			    }
			    i_1841_ += i_1845_;
			    i_1849_++;
			}
			i_1842_ += i_1846_;
			i_1841_ = i_1854_;
			i_1849_ += i_1850_;
		    }
		} else if (i_1836_ == 0) {
		    int i_1858_ = (i_1837_ & 0xff0000) >> 16;
		    int i_1859_ = (i_1837_ & 0xff00) >> 8;
		    int i_1860_ = i_1837_ & 0xff;
		    int i_1861_ = i_1841_;
		    for (int i_1862_ = -i_1835_; i_1862_ < 0; i_1862_++) {
			int i_1863_ = (i_1842_ >> 16) * anInt8985;
			for (int i_1864_ = -i_1834_; i_1864_ < 0; i_1864_++) {
			    if (!bool_1831_ || f < fs[i_1849_]) {
				if (bool) {
				    int i_1865_
					= (anIntArray11408
					   [((aByteArray11407
					      [(i_1841_ >> 16) + i_1863_])
					     & 0xff)]);
				    int i_1866_
					= ((i_1865_ & 0xff0000) * i_1858_
					   & ~0xffffff);
				    int i_1867_ = ((i_1865_ & 0xff00) * i_1859_
						   & 0xff0000);
				    int i_1868_
					= (i_1865_ & 0xff) * i_1860_ & 0xff00;
				    is[i_1849_]
					= (i_1866_ | i_1867_ | i_1868_) >>> 8;
				}
				if (bool_1831_ && bool_1840_)
				    fs[i_1849_] = f;
			    }
			    i_1841_ += i_1845_;
			    i_1849_++;
			}
			i_1842_ += i_1846_;
			i_1841_ = i_1861_;
			i_1849_ += i_1850_;
		    }
		} else if (i_1836_ == 3) {
		    int i_1869_ = i_1841_;
		    for (int i_1870_ = -i_1835_; i_1870_ < 0; i_1870_++) {
			int i_1871_ = (i_1842_ >> 16) * anInt8985;
			for (int i_1872_ = -i_1834_; i_1872_ < 0; i_1872_++) {
			    if (!bool_1831_ || f < fs[i_1849_]) {
				if (bool) {
				    byte i_1873_
					= (aByteArray11407
					   [(i_1841_ >> 16) + i_1871_]);
				    int i_1874_
					= (i_1873_ > 0
					   ? anIntArray11408[i_1873_] : 0);
				    int i_1875_ = i_1874_ + i_1837_;
				    int i_1876_ = ((i_1874_ & 0xff00ff)
						   + (i_1837_ & 0xff00ff));
				    int i_1877_
					= ((i_1876_ & 0x1000100)
					   + (i_1875_ - i_1876_ & 0x10000));
				    is[i_1849_]
					= (i_1875_ - i_1877_
					   | i_1877_ - (i_1877_ >>> 8));
				}
				if (bool_1831_ && bool_1840_)
				    fs[i_1849_] = f;
			    }
			    i_1841_ += i_1845_;
			    i_1849_++;
			}
			i_1842_ += i_1846_;
			i_1841_ = i_1869_;
			i_1849_ += i_1850_;
		    }
		} else if (i_1836_ == 2) {
		    int i_1878_ = i_1837_ >>> 24;
		    int i_1879_ = 256 - i_1878_;
		    int i_1880_ = (i_1837_ & 0xff00ff) * i_1879_ & ~0xff00ff;
		    int i_1881_ = (i_1837_ & 0xff00) * i_1879_ & 0xff0000;
		    i_1837_ = (i_1880_ | i_1881_) >>> 8;
		    int i_1882_ = i_1841_;
		    for (int i_1883_ = -i_1835_; i_1883_ < 0; i_1883_++) {
			int i_1884_ = (i_1842_ >> 16) * anInt8985;
			for (int i_1885_ = -i_1834_; i_1885_ < 0; i_1885_++) {
			    if (!bool_1831_ || f < fs[i_1849_]) {
				if (bool) {
				    int i_1886_
					= (anIntArray11408
					   [((aByteArray11407
					      [(i_1841_ >> 16) + i_1884_])
					     & 0xff)]);
				    i_1880_ = ((i_1886_ & 0xff00ff) * i_1878_
					       & ~0xff00ff);
				    i_1881_ = ((i_1886_ & 0xff00) * i_1878_
					       & 0xff0000);
				    is[i_1849_] = (((i_1880_ | i_1881_) >>> 8)
						   + i_1837_);
				}
				if (bool_1831_ && bool_1840_)
				    fs[i_1849_] = f;
			    }
			    i_1841_ += i_1845_;
			    i_1849_++;
			}
			i_1842_ += i_1846_;
			i_1841_ = i_1882_;
			i_1849_ += i_1850_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1838_ == 1) {
		if (i_1836_ == 1) {
		    int i_1887_ = i_1841_;
		    for (int i_1888_ = -i_1835_; i_1888_ < 0; i_1888_++) {
			int i_1889_ = (i_1842_ >> 16) * anInt8985;
			for (int i_1890_ = -i_1834_; i_1890_ < 0; i_1890_++) {
			    if (!bool_1831_ || f < fs[i_1849_]) {
				int i_1891_ = (aByteArray11407
					       [(i_1841_ >> 16) + i_1889_]);
				if (i_1891_ != 0) {
				    if (bool)
					is[i_1849_]
					    = anIntArray11408[i_1891_ & 0xff];
				    if (bool_1831_ && bool_1840_)
					fs[i_1849_] = f;
				}
			    }
			    i_1841_ += i_1845_;
			    i_1849_++;
			}
			i_1842_ += i_1846_;
			i_1841_ = i_1887_;
			i_1849_ += i_1850_;
		    }
		} else if (i_1836_ == 0) {
		    int i_1892_ = i_1841_;
		    if ((i_1837_ & 0xffffff) == 16777215) {
			int i_1893_ = i_1837_ >>> 24;
			int i_1894_ = 256 - i_1893_;
			for (int i_1895_ = -i_1835_; i_1895_ < 0; i_1895_++) {
			    int i_1896_ = (i_1842_ >> 16) * anInt8985;
			    for (int i_1897_ = -i_1834_; i_1897_ < 0;
				 i_1897_++) {
				if (!bool_1831_ || f < fs[i_1849_]) {
				    int i_1898_
					= (aByteArray11407
					   [(i_1841_ >> 16) + i_1896_]);
				    if (i_1898_ != 0) {
					if (bool) {
					    int i_1899_ = (anIntArray11408
							   [i_1898_ & 0xff]);
					    int i_1900_ = is[i_1849_];
					    is[i_1849_]
						= (((((i_1899_ & 0xff00ff)
						      * i_1893_)
						     + ((i_1900_ & 0xff00ff)
							* i_1894_))
						    & ~0xff00ff)
						   + ((((i_1899_ & 0xff00)
							* i_1893_)
						       + ((i_1900_ & 0xff00)
							  * i_1894_))
						      & 0xff0000)) >> 8;
					}
					if (bool_1831_ && bool_1840_)
					    fs[i_1849_] = f;
				    }
				}
				i_1841_ += i_1845_;
				i_1849_++;
			    }
			    i_1842_ += i_1846_;
			    i_1841_ = i_1892_;
			    i_1849_ += i_1850_;
			}
		    } else {
			int i_1901_ = (i_1837_ & 0xff0000) >> 16;
			int i_1902_ = (i_1837_ & 0xff00) >> 8;
			int i_1903_ = i_1837_ & 0xff;
			int i_1904_ = i_1837_ >>> 24;
			int i_1905_ = 256 - i_1904_;
			for (int i_1906_ = -i_1835_; i_1906_ < 0; i_1906_++) {
			    int i_1907_ = (i_1842_ >> 16) * anInt8985;
			    for (int i_1908_ = -i_1834_; i_1908_ < 0;
				 i_1908_++) {
				if (!bool_1831_ || f < fs[i_1849_]) {
				    int i_1909_
					= (aByteArray11407
					   [(i_1841_ >> 16) + i_1907_]);
				    if (i_1909_ != 0) {
					int i_1910_
					    = anIntArray11408[i_1909_ & 0xff];
					if (i_1904_ != 255) {
					    if (bool) {
						int i_1911_
						    = (((i_1910_ & 0xff0000)
							* i_1901_)
						       & ~0xffffff);
						int i_1912_
						    = (((i_1910_ & 0xff00)
							* i_1902_)
						       & 0xff0000);
						int i_1913_
						    = (((i_1910_ & 0xff)
							* i_1903_)
						       & 0xff00);
						i_1910_ = (i_1911_ | i_1912_
							   | i_1913_) >>> 8;
						int i_1914_ = is[i_1849_];
						is[i_1849_]
						    = (((((i_1910_ & 0xff00ff)
							  * i_1904_)
							 + ((i_1914_
							     & 0xff00ff)
							    * i_1905_))
							& ~0xff00ff)
						       + ((((i_1910_ & 0xff00)
							    * i_1904_)
							   + ((i_1914_
							       & 0xff00)
							      * i_1905_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_1831_ && bool_1840_)
						fs[i_1849_] = f;
					} else {
					    if (bool) {
						int i_1915_
						    = (((i_1910_ & 0xff0000)
							* i_1901_)
						       & ~0xffffff);
						int i_1916_
						    = (((i_1910_ & 0xff00)
							* i_1902_)
						       & 0xff0000);
						int i_1917_
						    = (((i_1910_ & 0xff)
							* i_1903_)
						       & 0xff00);
						is[i_1849_]
						    = (i_1915_ | i_1916_
						       | i_1917_) >>> 8;
					    }
					    if (bool_1831_ && bool_1840_)
						fs[i_1849_] = f;
					}
				    }
				}
				i_1841_ += i_1845_;
				i_1849_++;
			    }
			    i_1842_ += i_1846_;
			    i_1841_ = i_1892_;
			    i_1849_ += i_1850_;
			}
		    }
		} else if (i_1836_ == 3) {
		    int i_1918_ = i_1841_;
		    int i_1919_ = i_1837_ >>> 24;
		    int i_1920_ = 256 - i_1919_;
		    for (int i_1921_ = -i_1835_; i_1921_ < 0; i_1921_++) {
			int i_1922_ = (i_1842_ >> 16) * anInt8985;
			for (int i_1923_ = -i_1834_; i_1923_ < 0; i_1923_++) {
			    if (!bool_1831_ || f < fs[i_1849_]) {
				if (bool) {
				    byte i_1924_
					= (aByteArray11407
					   [(i_1841_ >> 16) + i_1922_]);
				    int i_1925_
					= (i_1924_ > 0
					   ? anIntArray11408[i_1924_] : 0);
				    int i_1926_ = i_1925_ + i_1837_;
				    int i_1927_ = ((i_1925_ & 0xff00ff)
						   + (i_1837_ & 0xff00ff));
				    int i_1928_
					= ((i_1927_ & 0x1000100)
					   + (i_1926_ - i_1927_ & 0x10000));
				    i_1928_ = (i_1926_ - i_1928_
					       | i_1928_ - (i_1928_ >>> 8));
				    if (i_1925_ == 0 && i_1919_ != 255) {
					i_1925_ = i_1928_;
					i_1928_ = is[i_1849_];
					i_1928_
					    = ((((i_1925_ & 0xff00ff) * i_1919_
						 + ((i_1928_ & 0xff00ff)
						    * i_1920_))
						& ~0xff00ff)
					       + (((i_1925_ & 0xff00) * i_1919_
						   + ((i_1928_ & 0xff00)
						      * i_1920_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_1849_] = i_1928_;
				}
				if (bool_1831_ && bool_1840_)
				    fs[i_1849_] = f;
			    }
			    i_1841_ += i_1845_;
			    i_1849_++;
			}
			i_1842_ += i_1846_;
			i_1841_ = i_1918_;
			i_1849_ += i_1850_;
		    }
		} else if (i_1836_ == 2) {
		    int i_1929_ = i_1837_ >>> 24;
		    int i_1930_ = 256 - i_1929_;
		    int i_1931_ = (i_1837_ & 0xff00ff) * i_1930_ & ~0xff00ff;
		    int i_1932_ = (i_1837_ & 0xff00) * i_1930_ & 0xff0000;
		    i_1837_ = (i_1931_ | i_1932_) >>> 8;
		    int i_1933_ = i_1841_;
		    for (int i_1934_ = -i_1835_; i_1934_ < 0; i_1934_++) {
			int i_1935_ = (i_1842_ >> 16) * anInt8985;
			for (int i_1936_ = -i_1834_; i_1936_ < 0; i_1936_++) {
			    if (!bool_1831_ || f < fs[i_1849_]) {
				int i_1937_ = (aByteArray11407
					       [(i_1841_ >> 16) + i_1935_]);
				if (i_1937_ != 0) {
				    if (bool) {
					int i_1938_
					    = anIntArray11408[i_1937_ & 0xff];
					i_1931_
					    = ((i_1938_ & 0xff00ff) * i_1929_
					       & ~0xff00ff);
					i_1932_ = ((i_1938_ & 0xff00) * i_1929_
						   & 0xff0000);
					is[i_1849_] = ((i_1931_ | i_1932_)
						       >>> 8) + i_1837_;
				    }
				    if (bool_1831_ && bool_1840_)
					fs[i_1849_] = f;
				}
			    }
			    i_1841_ += i_1845_;
			    i_1849_++;
			}
			i_1842_ += i_1846_;
			i_1841_ = i_1933_;
			i_1849_ += i_1850_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1838_ == 2) {
		if (i_1836_ == 1) {
		    int i_1939_ = i_1841_;
		    for (int i_1940_ = -i_1835_; i_1940_ < 0; i_1940_++) {
			int i_1941_ = (i_1842_ >> 16) * anInt8985;
			for (int i_1942_ = -i_1834_; i_1942_ < 0; i_1942_++) {
			    if (!bool_1831_ || f < fs[i_1849_]) {
				int i_1943_ = (aByteArray11407
					       [(i_1841_ >> 16) + i_1941_]);
				if (i_1943_ != 0) {
				    if (bool) {
					int i_1944_
					    = anIntArray11408[i_1943_ & 0xff];
					int i_1945_ = is[i_1849_];
					int i_1946_ = i_1944_ + i_1945_;
					int i_1947_ = ((i_1944_ & 0xff00ff)
						       + (i_1945_ & 0xff00ff));
					i_1945_ = ((i_1947_ & 0x1000100)
						   + (i_1946_ - i_1947_
						      & 0x10000));
					is[i_1849_]
					    = (i_1946_ - i_1945_
					       | i_1945_ - (i_1945_ >>> 8));
				    }
				    if (bool_1831_ && bool_1840_)
					fs[i_1849_] = f;
				}
			    }
			    i_1841_ += i_1845_;
			    i_1849_++;
			}
			i_1842_ += i_1846_;
			i_1841_ = i_1939_;
			i_1849_ += i_1850_;
		    }
		} else if (i_1836_ == 0) {
		    int i_1948_ = i_1841_;
		    int i_1949_ = (i_1837_ & 0xff0000) >> 16;
		    int i_1950_ = (i_1837_ & 0xff00) >> 8;
		    int i_1951_ = i_1837_ & 0xff;
		    for (int i_1952_ = -i_1835_; i_1952_ < 0; i_1952_++) {
			int i_1953_ = (i_1842_ >> 16) * anInt8985;
			for (int i_1954_ = -i_1834_; i_1954_ < 0; i_1954_++) {
			    if (!bool_1831_ || f < fs[i_1849_]) {
				int i_1955_ = (aByteArray11407
					       [(i_1841_ >> 16) + i_1953_]);
				if (i_1955_ != 0) {
				    if (bool) {
					int i_1956_
					    = anIntArray11408[i_1955_ & 0xff];
					int i_1957_
					    = ((i_1956_ & 0xff0000) * i_1949_
					       & ~0xffffff);
					int i_1958_
					    = ((i_1956_ & 0xff00) * i_1950_
					       & 0xff0000);
					int i_1959_
					    = ((i_1956_ & 0xff) * i_1951_
					       & 0xff00);
					i_1956_ = (i_1957_ | i_1958_
						   | i_1959_) >>> 8;
					int i_1960_ = is[i_1849_];
					int i_1961_ = i_1956_ + i_1960_;
					int i_1962_ = ((i_1956_ & 0xff00ff)
						       + (i_1960_ & 0xff00ff));
					i_1960_ = ((i_1962_ & 0x1000100)
						   + (i_1961_ - i_1962_
						      & 0x10000));
					is[i_1849_]
					    = (i_1961_ - i_1960_
					       | i_1960_ - (i_1960_ >>> 8));
				    }
				    if (bool_1831_ && bool_1840_)
					fs[i_1849_] = f;
				}
			    }
			    i_1841_ += i_1845_;
			    i_1849_++;
			}
			i_1842_ += i_1846_;
			i_1841_ = i_1948_;
			i_1849_ += i_1850_;
		    }
		} else if (i_1836_ == 3) {
		    int i_1963_ = i_1841_;
		    for (int i_1964_ = -i_1835_; i_1964_ < 0; i_1964_++) {
			int i_1965_ = (i_1842_ >> 16) * anInt8985;
			for (int i_1966_ = -i_1834_; i_1966_ < 0; i_1966_++) {
			    if (!bool_1831_ || f < fs[i_1849_]) {
				if (bool) {
				    byte i_1967_
					= (aByteArray11407
					   [(i_1841_ >> 16) + i_1965_]);
				    int i_1968_
					= (i_1967_ > 0
					   ? anIntArray11408[i_1967_] : 0);
				    int i_1969_ = i_1968_ + i_1837_;
				    int i_1970_ = ((i_1968_ & 0xff00ff)
						   + (i_1837_ & 0xff00ff));
				    int i_1971_
					= ((i_1970_ & 0x1000100)
					   + (i_1969_ - i_1970_ & 0x10000));
				    i_1968_ = (i_1969_ - i_1971_
					       | i_1971_ - (i_1971_ >>> 8));
				    i_1971_ = is[i_1849_];
				    i_1969_ = i_1968_ + i_1971_;
				    i_1970_
					= (i_1968_ & 0xff00ff) + (i_1971_
								  & 0xff00ff);
				    i_1971_
					= ((i_1970_ & 0x1000100)
					   + (i_1969_ - i_1970_ & 0x10000));
				    is[i_1849_]
					= (i_1969_ - i_1971_
					   | i_1971_ - (i_1971_ >>> 8));
				}
				if (bool_1831_ && bool_1840_)
				    fs[i_1849_] = f;
			    }
			    i_1841_ += i_1845_;
			    i_1849_++;
			}
			i_1842_ += i_1846_;
			i_1841_ = i_1963_;
			i_1849_ += i_1850_;
		    }
		} else if (i_1836_ == 2) {
		    int i_1972_ = i_1837_ >>> 24;
		    int i_1973_ = 256 - i_1972_;
		    int i_1974_ = (i_1837_ & 0xff00ff) * i_1973_ & ~0xff00ff;
		    int i_1975_ = (i_1837_ & 0xff00) * i_1973_ & 0xff0000;
		    i_1837_ = (i_1974_ | i_1975_) >>> 8;
		    int i_1976_ = i_1841_;
		    for (int i_1977_ = -i_1835_; i_1977_ < 0; i_1977_++) {
			int i_1978_ = (i_1842_ >> 16) * anInt8985;
			for (int i_1979_ = -i_1834_; i_1979_ < 0; i_1979_++) {
			    if (!bool_1831_ || f < fs[i_1849_]) {
				int i_1980_ = (aByteArray11407
					       [(i_1841_ >> 16) + i_1978_]);
				if (i_1980_ != 0) {
				    if (bool) {
					int i_1981_
					    = anIntArray11408[i_1980_ & 0xff];
					i_1974_
					    = ((i_1981_ & 0xff00ff) * i_1972_
					       & ~0xff00ff);
					i_1975_ = ((i_1981_ & 0xff00) * i_1972_
						   & 0xff0000);
					i_1981_ = (((i_1974_ | i_1975_) >>> 8)
						   + i_1837_);
					int i_1982_ = is[i_1849_];
					int i_1983_ = i_1981_ + i_1982_;
					int i_1984_ = ((i_1981_ & 0xff00ff)
						       + (i_1982_ & 0xff00ff));
					i_1982_ = ((i_1984_ & 0x1000100)
						   + (i_1983_ - i_1984_
						      & 0x10000));
					is[i_1849_]
					    = (i_1983_ - i_1982_
					       | i_1982_ - (i_1982_ >>> 8));
				    }
				    if (bool_1831_ && bool_1840_)
					fs[i_1849_] = f;
				}
			    }
			    i_1841_ += i_1845_;
			    i_1849_++;
			}
			i_1842_ += i_1846_;
			i_1841_ = i_1976_;
			i_1849_ += i_1850_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method14519(int i, int i_1985_) {
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    if (anInt9001 == 0) {
		if (anInt9000 == 0) {
		    int i_1986_ = anInt8998;
		    while (i_1986_ < 0) {
			int i_1987_ = anInt8988;
			int i_1988_ = anInt9007;
			int i_1989_ = anInt9003;
			int i_1990_ = anInt8999;
			if (i_1988_ >= 0 && i_1989_ >= 0
			    && i_1988_ - (anInt8985 << 12) < 0
			    && i_1989_ - (anInt9002 << 12) < 0) {
			    for (/**/; i_1990_ < 0; i_1990_++) {
				int i_1991_ = ((i_1989_ >> 12) * anInt8985
					       + (i_1988_ >> 12));
				int i_1992_ = i_1987_++;
				if (i_1985_ == 0) {
				    if (i == 1)
					is[i_1992_]
					    = (anIntArray11408
					       [(aByteArray11407[i_1991_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_1993_
					    = (anIntArray11408
					       [(aByteArray11407[i_1991_]
						 & 0xff)]);
					int i_1994_
					    = ((i_1993_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_1995_
					    = ((i_1993_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_1996_
					    = ((i_1993_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_1992_] = (i_1994_ | i_1995_
						       | i_1996_) >>> 8;
				    } else if (i == 3) {
					int i_1997_
					    = (anIntArray11408
					       [(aByteArray11407[i_1991_]
						 & 0xff)]);
					int i_1998_ = anInt9011;
					int i_1999_ = i_1997_ + i_1998_;
					int i_2000_ = ((i_1997_ & 0xff00ff)
						       + (i_1998_ & 0xff00ff));
					int i_2001_ = ((i_2000_ & 0x1000100)
						       + (i_1999_ - i_2000_
							  & 0x10000));
					is[i_1992_]
					    = (i_1999_ - i_2001_
					       | i_2001_ - (i_2001_ >>> 8));
				    } else if (i == 2) {
					int i_2002_
					    = (anIntArray11408
					       [(aByteArray11407[i_1991_]
						 & 0xff)]);
					int i_2003_
					    = ((i_2002_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_2004_
					    = ((i_2002_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_1992_] = ((i_2003_ | i_2004_)
						       >>> 8) + anInt9019;
				    } else
					throw new IllegalArgumentException();
				} else if (i_1985_ == 1) {
				    if (i == 1) {
					int i_2005_ = aByteArray11407[i_1991_];
					if (i_2005_ != 0)
					    is[i_1992_] = (anIntArray11408
							   [i_2005_ & 0xff]);
				    } else if (i == 0) {
					int i_2006_ = aByteArray11407[i_1991_];
					if (i_2006_ != 0) {
					    int i_2007_ = (anIntArray11408
							   [i_2006_ & 0xff]);
					    if ((anInt9011 & 0xffffff)
						== 16777215) {
						int i_2008_ = anInt9011 >>> 24;
						int i_2009_ = 256 - i_2008_;
						int i_2010_ = is[i_1992_];
						is[i_1992_]
						    = (((((i_2007_ & 0xff00ff)
							  * i_2008_)
							 + ((i_2010_
							     & 0xff00ff)
							    * i_2009_))
							& ~0xff00ff)
						       + ((((i_2007_ & 0xff00)
							    * i_2008_)
							   + ((i_2010_
							       & 0xff00)
							      * i_2009_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9012 != 255) {
						int i_2011_
						    = (((i_2007_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_2012_
						    = (((i_2007_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_2013_
						    = (((i_2007_ & 0xff)
							* anInt9018)
						       & 0xff00);
						i_2007_ = (i_2011_ | i_2012_
							   | i_2013_) >>> 8;
						int i_2014_ = is[i_1992_];
						is[i_1992_]
						    = (((((i_2007_ & 0xff00ff)
							  * anInt9012)
							 + ((i_2014_
							     & 0xff00ff)
							    * anInt9013))
							& ~0xff00ff)
						       + ((((i_2007_ & 0xff00)
							    * anInt9012)
							   + ((i_2014_
							       & 0xff00)
							      * anInt9013))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2015_
						    = (((i_2007_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_2016_
						    = (((i_2007_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_2017_
						    = (((i_2007_ & 0xff)
							* anInt9018)
						       & 0xff00);
						is[i_1992_]
						    = (i_2015_ | i_2016_
						       | i_2017_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2018_
					    = aByteArray11407[i_1991_];
					int i_2019_
					    = (i_2018_ > 0
					       ? anIntArray11408[i_2018_] : 0);
					int i_2020_ = anInt9011;
					int i_2021_ = i_2019_ + i_2020_;
					int i_2022_ = ((i_2019_ & 0xff00ff)
						       + (i_2020_ & 0xff00ff));
					int i_2023_ = ((i_2022_ & 0x1000100)
						       + (i_2021_ - i_2022_
							  & 0x10000));
					i_2023_
					    = (i_2021_ - i_2023_
					       | i_2023_ - (i_2023_ >>> 8));
					if (i_2019_ == 0 && anInt9012 != 255) {
					    i_2019_ = i_2023_;
					    i_2023_ = is[i_1992_];
					    i_2023_
						= (((((i_2019_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2023_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2019_ & 0xff00)
							* anInt9012)
						       + ((i_2023_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_1992_] = i_2023_;
				    } else if (i == 2) {
					int i_2024_ = aByteArray11407[i_1991_];
					if (i_2024_ != 0) {
					    int i_2025_ = (anIntArray11408
							   [i_2024_ & 0xff]);
					    int i_2026_
						= (((i_2025_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_2027_ = (((i_2025_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    is[i_1992_++]
						= (((i_2026_ | i_2027_) >>> 8)
						   + anInt9019);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_1985_ == 2) {
				    if (i == 1) {
					int i_2028_ = aByteArray11407[i_1991_];
					if (i_2028_ != 0) {
					    int i_2029_ = (anIntArray11408
							   [i_2028_ & 0xff]);
					    int i_2030_ = is[i_1992_];
					    int i_2031_ = i_2029_ + i_2030_;
					    int i_2032_
						= ((i_2029_ & 0xff00ff)
						   + (i_2030_ & 0xff00ff));
					    i_2030_ = ((i_2032_ & 0x1000100)
						       + (i_2031_ - i_2032_
							  & 0x10000));
					    is[i_1992_]
						= (i_2031_ - i_2030_
						   | i_2030_ - (i_2030_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2033_ = aByteArray11407[i_1991_];
					if (i_2033_ != 0) {
					    int i_2034_ = (anIntArray11408
							   [i_2033_ & 0xff]);
					    int i_2035_
						= (((i_2034_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_2036_ = (((i_2034_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_2037_
						= ((i_2034_ & 0xff) * anInt9018
						   & 0xff00);
					    i_2034_ = (i_2035_ | i_2036_
						       | i_2037_) >>> 8;
					    int i_2038_ = is[i_1992_];
					    int i_2039_ = i_2034_ + i_2038_;
					    int i_2040_
						= ((i_2034_ & 0xff00ff)
						   + (i_2038_ & 0xff00ff));
					    i_2038_ = ((i_2040_ & 0x1000100)
						       + (i_2039_ - i_2040_
							  & 0x10000));
					    is[i_1992_]
						= (i_2039_ - i_2038_
						   | i_2038_ - (i_2038_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2041_
					    = aByteArray11407[i_1991_];
					int i_2042_
					    = (i_2041_ > 0
					       ? anIntArray11408[i_2041_] : 0);
					int i_2043_ = anInt9011;
					int i_2044_ = i_2042_ + i_2043_;
					int i_2045_ = ((i_2042_ & 0xff00ff)
						       + (i_2043_ & 0xff00ff));
					int i_2046_ = ((i_2045_ & 0x1000100)
						       + (i_2044_ - i_2045_
							  & 0x10000));
					i_2046_
					    = (i_2044_ - i_2046_
					       | i_2046_ - (i_2046_ >>> 8));
					if (i_2042_ == 0 && anInt9012 != 255) {
					    i_2042_ = i_2046_;
					    i_2046_ = is[i_1992_];
					    i_2046_
						= (((((i_2042_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2046_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2042_ & 0xff00)
							* anInt9012)
						       + ((i_2046_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_1992_] = i_2046_;
				    } else if (i == 2) {
					int i_2047_ = aByteArray11407[i_1991_];
					if (i_2047_ != 0) {
					    int i_2048_ = (anIntArray11408
							   [i_2047_ & 0xff]);
					    int i_2049_
						= (((i_2048_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_2050_ = (((i_2048_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    i_2048_ = ((i_2049_ | i_2050_)
						       >>> 8) + anInt9019;
					    int i_2051_ = is[i_1992_];
					    int i_2052_ = i_2048_ + i_2051_;
					    int i_2053_
						= ((i_2048_ & 0xff00ff)
						   + (i_2051_ & 0xff00ff));
					    i_2051_ = ((i_2053_ & 0x1000100)
						       + (i_2052_ - i_2053_
							  & 0x10000));
					    is[i_1992_]
						= (i_2052_ - i_2051_
						   | i_2051_ - (i_2051_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
			    }
			}
			i_1986_++;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_2054_ = anInt8998;
		    while (i_2054_ < 0) {
			int i_2055_ = anInt8988;
			int i_2056_ = anInt9007;
			int i_2057_ = anInt9003 + anInt9010;
			int i_2058_ = anInt8999;
			if (i_2056_ >= 0 && i_2056_ - (anInt8985 << 12) < 0) {
			    int i_2059_;
			    if ((i_2059_ = i_2057_ - (anInt9002 << 12)) >= 0) {
				i_2059_ = (anInt9000 - i_2059_) / anInt9000;
				i_2058_ += i_2059_;
				i_2057_ += anInt9000 * i_2059_;
				i_2055_ += i_2059_;
			    }
			    if ((i_2059_ = (i_2057_ - anInt9000) / anInt9000)
				> i_2058_)
				i_2058_ = i_2059_;
			    for (/**/; i_2058_ < 0; i_2058_++) {
				int i_2060_ = ((i_2057_ >> 12) * anInt8985
					       + (i_2056_ >> 12));
				int i_2061_ = i_2055_++;
				if (i_1985_ == 0) {
				    if (i == 1)
					is[i_2061_]
					    = (anIntArray11408
					       [(aByteArray11407[i_2060_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_2062_
					    = (anIntArray11408
					       [(aByteArray11407[i_2060_]
						 & 0xff)]);
					int i_2063_
					    = ((i_2062_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_2064_
					    = ((i_2062_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_2065_
					    = ((i_2062_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_2061_] = (i_2063_ | i_2064_
						       | i_2065_) >>> 8;
				    } else if (i == 3) {
					int i_2066_
					    = (anIntArray11408
					       [(aByteArray11407[i_2060_]
						 & 0xff)]);
					int i_2067_ = anInt9011;
					int i_2068_ = i_2066_ + i_2067_;
					int i_2069_ = ((i_2066_ & 0xff00ff)
						       + (i_2067_ & 0xff00ff));
					int i_2070_ = ((i_2069_ & 0x1000100)
						       + (i_2068_ - i_2069_
							  & 0x10000));
					is[i_2061_]
					    = (i_2068_ - i_2070_
					       | i_2070_ - (i_2070_ >>> 8));
				    } else if (i == 2) {
					int i_2071_
					    = (anIntArray11408
					       [(aByteArray11407[i_2060_]
						 & 0xff)]);
					int i_2072_
					    = ((i_2071_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_2073_
					    = ((i_2071_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_2061_] = ((i_2072_ | i_2073_)
						       >>> 8) + anInt9019;
				    } else
					throw new IllegalArgumentException();
				} else if (i_1985_ == 1) {
				    if (i == 1) {
					int i_2074_ = aByteArray11407[i_2060_];
					if (i_2074_ != 0)
					    is[i_2061_] = (anIntArray11408
							   [i_2074_ & 0xff]);
				    } else if (i == 0) {
					int i_2075_ = aByteArray11407[i_2060_];
					if (i_2075_ != 0) {
					    int i_2076_ = (anIntArray11408
							   [i_2075_ & 0xff]);
					    if ((anInt9011 & 0xffffff)
						== 16777215) {
						int i_2077_ = anInt9011 >>> 24;
						int i_2078_ = 256 - i_2077_;
						int i_2079_ = is[i_2061_];
						is[i_2061_]
						    = (((((i_2076_ & 0xff00ff)
							  * i_2077_)
							 + ((i_2079_
							     & 0xff00ff)
							    * i_2078_))
							& ~0xff00ff)
						       + ((((i_2076_ & 0xff00)
							    * i_2077_)
							   + ((i_2079_
							       & 0xff00)
							      * i_2078_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9012 != 255) {
						int i_2080_
						    = (((i_2076_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_2081_
						    = (((i_2076_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_2082_
						    = (((i_2076_ & 0xff)
							* anInt9018)
						       & 0xff00);
						i_2076_ = (i_2080_ | i_2081_
							   | i_2082_) >>> 8;
						int i_2083_ = is[i_2061_];
						is[i_2061_]
						    = (((((i_2076_ & 0xff00ff)
							  * anInt9012)
							 + ((i_2083_
							     & 0xff00ff)
							    * anInt9013))
							& ~0xff00ff)
						       + ((((i_2076_ & 0xff00)
							    * anInt9012)
							   + ((i_2083_
							       & 0xff00)
							      * anInt9013))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2084_
						    = (((i_2076_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_2085_
						    = (((i_2076_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_2086_
						    = (((i_2076_ & 0xff)
							* anInt9018)
						       & 0xff00);
						is[i_2061_]
						    = (i_2084_ | i_2085_
						       | i_2086_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2087_
					    = aByteArray11407[i_2060_];
					int i_2088_
					    = (i_2087_ > 0
					       ? anIntArray11408[i_2087_] : 0);
					int i_2089_ = anInt9011;
					int i_2090_ = i_2088_ + i_2089_;
					int i_2091_ = ((i_2088_ & 0xff00ff)
						       + (i_2089_ & 0xff00ff));
					int i_2092_ = ((i_2091_ & 0x1000100)
						       + (i_2090_ - i_2091_
							  & 0x10000));
					i_2092_
					    = (i_2090_ - i_2092_
					       | i_2092_ - (i_2092_ >>> 8));
					if (i_2088_ == 0 && anInt9012 != 255) {
					    i_2088_ = i_2092_;
					    i_2092_ = is[i_2061_];
					    i_2092_
						= (((((i_2088_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2092_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2088_ & 0xff00)
							* anInt9012)
						       + ((i_2092_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_2061_] = i_2092_;
				    } else if (i == 2) {
					int i_2093_ = aByteArray11407[i_2060_];
					if (i_2093_ != 0) {
					    int i_2094_ = (anIntArray11408
							   [i_2093_ & 0xff]);
					    int i_2095_
						= (((i_2094_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_2096_ = (((i_2094_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    is[i_2061_++]
						= (((i_2095_ | i_2096_) >>> 8)
						   + anInt9019);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_1985_ == 2) {
				    if (i == 1) {
					int i_2097_ = aByteArray11407[i_2060_];
					if (i_2097_ != 0) {
					    int i_2098_ = (anIntArray11408
							   [i_2097_ & 0xff]);
					    int i_2099_ = is[i_2061_];
					    int i_2100_ = i_2098_ + i_2099_;
					    int i_2101_
						= ((i_2098_ & 0xff00ff)
						   + (i_2099_ & 0xff00ff));
					    i_2099_ = ((i_2101_ & 0x1000100)
						       + (i_2100_ - i_2101_
							  & 0x10000));
					    is[i_2061_]
						= (i_2100_ - i_2099_
						   | i_2099_ - (i_2099_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2102_ = aByteArray11407[i_2060_];
					if (i_2102_ != 0) {
					    int i_2103_ = (anIntArray11408
							   [i_2102_ & 0xff]);
					    int i_2104_
						= (((i_2103_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_2105_ = (((i_2103_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_2106_
						= ((i_2103_ & 0xff) * anInt9018
						   & 0xff00);
					    i_2103_ = (i_2104_ | i_2105_
						       | i_2106_) >>> 8;
					    int i_2107_ = is[i_2061_];
					    int i_2108_ = i_2103_ + i_2107_;
					    int i_2109_
						= ((i_2103_ & 0xff00ff)
						   + (i_2107_ & 0xff00ff));
					    i_2107_ = ((i_2109_ & 0x1000100)
						       + (i_2108_ - i_2109_
							  & 0x10000));
					    is[i_2061_]
						= (i_2108_ - i_2107_
						   | i_2107_ - (i_2107_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2110_
					    = aByteArray11407[i_2060_];
					int i_2111_
					    = (i_2110_ > 0
					       ? anIntArray11408[i_2110_] : 0);
					int i_2112_ = anInt9011;
					int i_2113_ = i_2111_ + i_2112_;
					int i_2114_ = ((i_2111_ & 0xff00ff)
						       + (i_2112_ & 0xff00ff));
					int i_2115_ = ((i_2114_ & 0x1000100)
						       + (i_2113_ - i_2114_
							  & 0x10000));
					i_2115_
					    = (i_2113_ - i_2115_
					       | i_2115_ - (i_2115_ >>> 8));
					if (i_2111_ == 0 && anInt9012 != 255) {
					    i_2111_ = i_2115_;
					    i_2115_ = is[i_2061_];
					    i_2115_
						= (((((i_2111_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2115_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2111_ & 0xff00)
							* anInt9012)
						       + ((i_2115_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_2061_] = i_2115_;
				    } else if (i == 2) {
					int i_2116_ = aByteArray11407[i_2060_];
					if (i_2116_ != 0) {
					    int i_2117_ = (anIntArray11408
							   [i_2116_ & 0xff]);
					    int i_2118_
						= (((i_2117_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_2119_ = (((i_2117_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    i_2117_ = ((i_2118_ | i_2119_)
						       >>> 8) + anInt9019;
					    int i_2120_ = is[i_2061_];
					    int i_2121_ = i_2117_ + i_2120_;
					    int i_2122_
						= ((i_2117_ & 0xff00ff)
						   + (i_2120_ & 0xff00ff));
					    i_2120_ = ((i_2122_ & 0x1000100)
						       + (i_2121_ - i_2122_
							  & 0x10000));
					    is[i_2061_]
						= (i_2121_ - i_2120_
						   | i_2120_ - (i_2120_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_2057_ += anInt9000;
			    }
			}
			i_2054_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_2123_ = anInt8998;
		    while (i_2123_ < 0) {
			int i_2124_ = anInt8988;
			int i_2125_ = anInt9007;
			int i_2126_ = anInt9003 + anInt9010;
			int i_2127_ = anInt8999;
			if (i_2125_ >= 0 && i_2125_ - (anInt8985 << 12) < 0) {
			    if (i_2126_ < 0) {
				int i_2128_
				    = (anInt9000 - 1 - i_2126_) / anInt9000;
				i_2127_ += i_2128_;
				i_2126_ += anInt9000 * i_2128_;
				i_2124_ += i_2128_;
			    }
			    int i_2129_;
			    if ((i_2129_ = (1 + i_2126_ - (anInt9002 << 12)
					    - anInt9000) / anInt9000)
				> i_2127_)
				i_2127_ = i_2129_;
			    for (/**/; i_2127_ < 0; i_2127_++) {
				int i_2130_ = ((i_2126_ >> 12) * anInt8985
					       + (i_2125_ >> 12));
				int i_2131_ = i_2124_++;
				if (i_1985_ == 0) {
				    if (i == 1)
					is[i_2131_]
					    = (anIntArray11408
					       [(aByteArray11407[i_2130_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_2132_
					    = (anIntArray11408
					       [(aByteArray11407[i_2130_]
						 & 0xff)]);
					int i_2133_
					    = ((i_2132_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_2134_
					    = ((i_2132_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_2135_
					    = ((i_2132_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_2131_] = (i_2133_ | i_2134_
						       | i_2135_) >>> 8;
				    } else if (i == 3) {
					int i_2136_
					    = (anIntArray11408
					       [(aByteArray11407[i_2130_]
						 & 0xff)]);
					int i_2137_ = anInt9011;
					int i_2138_ = i_2136_ + i_2137_;
					int i_2139_ = ((i_2136_ & 0xff00ff)
						       + (i_2137_ & 0xff00ff));
					int i_2140_ = ((i_2139_ & 0x1000100)
						       + (i_2138_ - i_2139_
							  & 0x10000));
					is[i_2131_]
					    = (i_2138_ - i_2140_
					       | i_2140_ - (i_2140_ >>> 8));
				    } else if (i == 2) {
					int i_2141_
					    = (anIntArray11408
					       [(aByteArray11407[i_2130_]
						 & 0xff)]);
					int i_2142_
					    = ((i_2141_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_2143_
					    = ((i_2141_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_2131_] = ((i_2142_ | i_2143_)
						       >>> 8) + anInt9019;
				    } else
					throw new IllegalArgumentException();
				} else if (i_1985_ == 1) {
				    if (i == 1) {
					int i_2144_ = aByteArray11407[i_2130_];
					if (i_2144_ != 0)
					    is[i_2131_] = (anIntArray11408
							   [i_2144_ & 0xff]);
				    } else if (i == 0) {
					int i_2145_ = aByteArray11407[i_2130_];
					if (i_2145_ != 0) {
					    int i_2146_ = (anIntArray11408
							   [i_2145_ & 0xff]);
					    if ((anInt9011 & 0xffffff)
						== 16777215) {
						int i_2147_ = anInt9011 >>> 24;
						int i_2148_ = 256 - i_2147_;
						int i_2149_ = is[i_2131_];
						is[i_2131_]
						    = (((((i_2146_ & 0xff00ff)
							  * i_2147_)
							 + ((i_2149_
							     & 0xff00ff)
							    * i_2148_))
							& ~0xff00ff)
						       + ((((i_2146_ & 0xff00)
							    * i_2147_)
							   + ((i_2149_
							       & 0xff00)
							      * i_2148_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9012 != 255) {
						int i_2150_
						    = (((i_2146_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_2151_
						    = (((i_2146_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_2152_
						    = (((i_2146_ & 0xff)
							* anInt9018)
						       & 0xff00);
						i_2146_ = (i_2150_ | i_2151_
							   | i_2152_) >>> 8;
						int i_2153_ = is[i_2131_];
						is[i_2131_]
						    = (((((i_2146_ & 0xff00ff)
							  * anInt9012)
							 + ((i_2153_
							     & 0xff00ff)
							    * anInt9013))
							& ~0xff00ff)
						       + ((((i_2146_ & 0xff00)
							    * anInt9012)
							   + ((i_2153_
							       & 0xff00)
							      * anInt9013))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2154_
						    = (((i_2146_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_2155_
						    = (((i_2146_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_2156_
						    = (((i_2146_ & 0xff)
							* anInt9018)
						       & 0xff00);
						is[i_2131_]
						    = (i_2154_ | i_2155_
						       | i_2156_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2157_
					    = aByteArray11407[i_2130_];
					int i_2158_
					    = (i_2157_ > 0
					       ? anIntArray11408[i_2157_] : 0);
					int i_2159_ = anInt9011;
					int i_2160_ = i_2158_ + i_2159_;
					int i_2161_ = ((i_2158_ & 0xff00ff)
						       + (i_2159_ & 0xff00ff));
					int i_2162_ = ((i_2161_ & 0x1000100)
						       + (i_2160_ - i_2161_
							  & 0x10000));
					i_2162_
					    = (i_2160_ - i_2162_
					       | i_2162_ - (i_2162_ >>> 8));
					if (i_2158_ == 0 && anInt9012 != 255) {
					    i_2158_ = i_2162_;
					    i_2162_ = is[i_2131_];
					    i_2162_
						= (((((i_2158_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2162_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2158_ & 0xff00)
							* anInt9012)
						       + ((i_2162_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_2131_] = i_2162_;
				    } else if (i == 2) {
					int i_2163_ = aByteArray11407[i_2130_];
					if (i_2163_ != 0) {
					    int i_2164_ = (anIntArray11408
							   [i_2163_ & 0xff]);
					    int i_2165_
						= (((i_2164_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_2166_ = (((i_2164_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    is[i_2131_++]
						= (((i_2165_ | i_2166_) >>> 8)
						   + anInt9019);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_1985_ == 2) {
				    if (i == 1) {
					int i_2167_ = aByteArray11407[i_2130_];
					if (i_2167_ != 0) {
					    int i_2168_ = (anIntArray11408
							   [i_2167_ & 0xff]);
					    int i_2169_ = is[i_2131_];
					    int i_2170_ = i_2168_ + i_2169_;
					    int i_2171_
						= ((i_2168_ & 0xff00ff)
						   + (i_2169_ & 0xff00ff));
					    i_2169_ = ((i_2171_ & 0x1000100)
						       + (i_2170_ - i_2171_
							  & 0x10000));
					    is[i_2131_]
						= (i_2170_ - i_2169_
						   | i_2169_ - (i_2169_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2172_ = aByteArray11407[i_2130_];
					if (i_2172_ != 0) {
					    int i_2173_ = (anIntArray11408
							   [i_2172_ & 0xff]);
					    int i_2174_
						= (((i_2173_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_2175_ = (((i_2173_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_2176_
						= ((i_2173_ & 0xff) * anInt9018
						   & 0xff00);
					    i_2173_ = (i_2174_ | i_2175_
						       | i_2176_) >>> 8;
					    int i_2177_ = is[i_2131_];
					    int i_2178_ = i_2173_ + i_2177_;
					    int i_2179_
						= ((i_2173_ & 0xff00ff)
						   + (i_2177_ & 0xff00ff));
					    i_2177_ = ((i_2179_ & 0x1000100)
						       + (i_2178_ - i_2179_
							  & 0x10000));
					    is[i_2131_]
						= (i_2178_ - i_2177_
						   | i_2177_ - (i_2177_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2180_
					    = aByteArray11407[i_2130_];
					int i_2181_
					    = (i_2180_ > 0
					       ? anIntArray11408[i_2180_] : 0);
					int i_2182_ = anInt9011;
					int i_2183_ = i_2181_ + i_2182_;
					int i_2184_ = ((i_2181_ & 0xff00ff)
						       + (i_2182_ & 0xff00ff));
					int i_2185_ = ((i_2184_ & 0x1000100)
						       + (i_2183_ - i_2184_
							  & 0x10000));
					i_2185_
					    = (i_2183_ - i_2185_
					       | i_2185_ - (i_2185_ >>> 8));
					if (i_2181_ == 0 && anInt9012 != 255) {
					    i_2181_ = i_2185_;
					    i_2185_ = is[i_2131_];
					    i_2185_
						= (((((i_2181_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2185_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2181_ & 0xff00)
							* anInt9012)
						       + ((i_2185_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_2131_] = i_2185_;
				    } else if (i == 2) {
					int i_2186_ = aByteArray11407[i_2130_];
					if (i_2186_ != 0) {
					    int i_2187_ = (anIntArray11408
							   [i_2186_ & 0xff]);
					    int i_2188_
						= (((i_2187_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_2189_ = (((i_2187_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    i_2187_ = ((i_2188_ | i_2189_)
						       >>> 8) + anInt9019;
					    int i_2190_ = is[i_2131_];
					    int i_2191_ = i_2187_ + i_2190_;
					    int i_2192_
						= ((i_2187_ & 0xff00ff)
						   + (i_2190_ & 0xff00ff));
					    i_2190_ = ((i_2192_ & 0x1000100)
						       + (i_2191_ - i_2192_
							  & 0x10000));
					    is[i_2131_]
						= (i_2191_ - i_2190_
						   | i_2190_ - (i_2190_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_2126_ += anInt9000;
			    }
			}
			i_2123_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9001 < 0) {
		if (anInt9000 == 0) {
		    int i_2193_ = anInt8998;
		    while (i_2193_ < 0) {
			int i_2194_ = anInt8988;
			int i_2195_ = anInt9007 + anInt9009;
			int i_2196_ = anInt9003;
			int i_2197_ = anInt8999;
			if (i_2196_ >= 0 && i_2196_ - (anInt9002 << 12) < 0) {
			    int i_2198_;
			    if ((i_2198_ = i_2195_ - (anInt8985 << 12)) >= 0) {
				i_2198_ = (anInt9001 - i_2198_) / anInt9001;
				i_2197_ += i_2198_;
				i_2195_ += anInt9001 * i_2198_;
				i_2194_ += i_2198_;
			    }
			    if ((i_2198_ = (i_2195_ - anInt9001) / anInt9001)
				> i_2197_)
				i_2197_ = i_2198_;
			    for (/**/; i_2197_ < 0; i_2197_++) {
				int i_2199_ = ((i_2196_ >> 12) * anInt8985
					       + (i_2195_ >> 12));
				int i_2200_ = i_2194_++;
				if (i_1985_ == 0) {
				    if (i == 1)
					is[i_2200_]
					    = (anIntArray11408
					       [(aByteArray11407[i_2199_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_2201_
					    = (anIntArray11408
					       [(aByteArray11407[i_2199_]
						 & 0xff)]);
					int i_2202_
					    = ((i_2201_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_2203_
					    = ((i_2201_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_2204_
					    = ((i_2201_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_2200_] = (i_2202_ | i_2203_
						       | i_2204_) >>> 8;
				    } else if (i == 3) {
					int i_2205_
					    = (anIntArray11408
					       [(aByteArray11407[i_2199_]
						 & 0xff)]);
					int i_2206_ = anInt9011;
					int i_2207_ = i_2205_ + i_2206_;
					int i_2208_ = ((i_2205_ & 0xff00ff)
						       + (i_2206_ & 0xff00ff));
					int i_2209_ = ((i_2208_ & 0x1000100)
						       + (i_2207_ - i_2208_
							  & 0x10000));
					is[i_2200_]
					    = (i_2207_ - i_2209_
					       | i_2209_ - (i_2209_ >>> 8));
				    } else if (i == 2) {
					int i_2210_
					    = (anIntArray11408
					       [(aByteArray11407[i_2199_]
						 & 0xff)]);
					int i_2211_
					    = ((i_2210_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_2212_
					    = ((i_2210_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_2200_] = ((i_2211_ | i_2212_)
						       >>> 8) + anInt9019;
				    } else
					throw new IllegalArgumentException();
				} else if (i_1985_ == 1) {
				    if (i == 1) {
					int i_2213_ = aByteArray11407[i_2199_];
					if (i_2213_ != 0)
					    is[i_2200_] = (anIntArray11408
							   [i_2213_ & 0xff]);
				    } else if (i == 0) {
					int i_2214_ = aByteArray11407[i_2199_];
					if (i_2214_ != 0) {
					    int i_2215_ = (anIntArray11408
							   [i_2214_ & 0xff]);
					    if ((anInt9011 & 0xffffff)
						== 16777215) {
						int i_2216_ = anInt9011 >>> 24;
						int i_2217_ = 256 - i_2216_;
						int i_2218_ = is[i_2200_];
						is[i_2200_]
						    = (((((i_2215_ & 0xff00ff)
							  * i_2216_)
							 + ((i_2218_
							     & 0xff00ff)
							    * i_2217_))
							& ~0xff00ff)
						       + ((((i_2215_ & 0xff00)
							    * i_2216_)
							   + ((i_2218_
							       & 0xff00)
							      * i_2217_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9012 != 255) {
						int i_2219_
						    = (((i_2215_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_2220_
						    = (((i_2215_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_2221_
						    = (((i_2215_ & 0xff)
							* anInt9018)
						       & 0xff00);
						i_2215_ = (i_2219_ | i_2220_
							   | i_2221_) >>> 8;
						int i_2222_ = is[i_2200_];
						is[i_2200_]
						    = (((((i_2215_ & 0xff00ff)
							  * anInt9012)
							 + ((i_2222_
							     & 0xff00ff)
							    * anInt9013))
							& ~0xff00ff)
						       + ((((i_2215_ & 0xff00)
							    * anInt9012)
							   + ((i_2222_
							       & 0xff00)
							      * anInt9013))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2223_
						    = (((i_2215_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_2224_
						    = (((i_2215_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_2225_
						    = (((i_2215_ & 0xff)
							* anInt9018)
						       & 0xff00);
						is[i_2200_]
						    = (i_2223_ | i_2224_
						       | i_2225_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2226_
					    = aByteArray11407[i_2199_];
					int i_2227_
					    = (i_2226_ > 0
					       ? anIntArray11408[i_2226_] : 0);
					int i_2228_ = anInt9011;
					int i_2229_ = i_2227_ + i_2228_;
					int i_2230_ = ((i_2227_ & 0xff00ff)
						       + (i_2228_ & 0xff00ff));
					int i_2231_ = ((i_2230_ & 0x1000100)
						       + (i_2229_ - i_2230_
							  & 0x10000));
					i_2231_
					    = (i_2229_ - i_2231_
					       | i_2231_ - (i_2231_ >>> 8));
					if (i_2227_ == 0 && anInt9012 != 255) {
					    i_2227_ = i_2231_;
					    i_2231_ = is[i_2200_];
					    i_2231_
						= (((((i_2227_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2231_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2227_ & 0xff00)
							* anInt9012)
						       + ((i_2231_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_2200_] = i_2231_;
				    } else if (i == 2) {
					int i_2232_ = aByteArray11407[i_2199_];
					if (i_2232_ != 0) {
					    int i_2233_ = (anIntArray11408
							   [i_2232_ & 0xff]);
					    int i_2234_
						= (((i_2233_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_2235_ = (((i_2233_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    is[i_2200_++]
						= (((i_2234_ | i_2235_) >>> 8)
						   + anInt9019);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_1985_ == 2) {
				    if (i == 1) {
					int i_2236_ = aByteArray11407[i_2199_];
					if (i_2236_ != 0) {
					    int i_2237_ = (anIntArray11408
							   [i_2236_ & 0xff]);
					    int i_2238_ = is[i_2200_];
					    int i_2239_ = i_2237_ + i_2238_;
					    int i_2240_
						= ((i_2237_ & 0xff00ff)
						   + (i_2238_ & 0xff00ff));
					    i_2238_ = ((i_2240_ & 0x1000100)
						       + (i_2239_ - i_2240_
							  & 0x10000));
					    is[i_2200_]
						= (i_2239_ - i_2238_
						   | i_2238_ - (i_2238_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2241_ = aByteArray11407[i_2199_];
					if (i_2241_ != 0) {
					    int i_2242_ = (anIntArray11408
							   [i_2241_ & 0xff]);
					    int i_2243_
						= (((i_2242_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_2244_ = (((i_2242_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_2245_
						= ((i_2242_ & 0xff) * anInt9018
						   & 0xff00);
					    i_2242_ = (i_2243_ | i_2244_
						       | i_2245_) >>> 8;
					    int i_2246_ = is[i_2200_];
					    int i_2247_ = i_2242_ + i_2246_;
					    int i_2248_
						= ((i_2242_ & 0xff00ff)
						   + (i_2246_ & 0xff00ff));
					    i_2246_ = ((i_2248_ & 0x1000100)
						       + (i_2247_ - i_2248_
							  & 0x10000));
					    is[i_2200_]
						= (i_2247_ - i_2246_
						   | i_2246_ - (i_2246_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2249_
					    = aByteArray11407[i_2199_];
					int i_2250_
					    = (i_2249_ > 0
					       ? anIntArray11408[i_2249_] : 0);
					int i_2251_ = anInt9011;
					int i_2252_ = i_2250_ + i_2251_;
					int i_2253_ = ((i_2250_ & 0xff00ff)
						       + (i_2251_ & 0xff00ff));
					int i_2254_ = ((i_2253_ & 0x1000100)
						       + (i_2252_ - i_2253_
							  & 0x10000));
					i_2254_
					    = (i_2252_ - i_2254_
					       | i_2254_ - (i_2254_ >>> 8));
					if (i_2250_ == 0 && anInt9012 != 255) {
					    i_2250_ = i_2254_;
					    i_2254_ = is[i_2200_];
					    i_2254_
						= (((((i_2250_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2254_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2250_ & 0xff00)
							* anInt9012)
						       + ((i_2254_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_2200_] = i_2254_;
				    } else if (i == 2) {
					int i_2255_ = aByteArray11407[i_2199_];
					if (i_2255_ != 0) {
					    int i_2256_ = (anIntArray11408
							   [i_2255_ & 0xff]);
					    int i_2257_
						= (((i_2256_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_2258_ = (((i_2256_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    i_2256_ = ((i_2257_ | i_2258_)
						       >>> 8) + anInt9019;
					    int i_2259_ = is[i_2200_];
					    int i_2260_ = i_2256_ + i_2259_;
					    int i_2261_
						= ((i_2256_ & 0xff00ff)
						   + (i_2259_ & 0xff00ff));
					    i_2259_ = ((i_2261_ & 0x1000100)
						       + (i_2260_ - i_2261_
							  & 0x10000));
					    is[i_2200_]
						= (i_2260_ - i_2259_
						   | i_2259_ - (i_2259_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_2195_ += anInt9001;
			    }
			}
			i_2193_++;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_2262_ = anInt8998;
		    while (i_2262_ < 0) {
			int i_2263_ = anInt8988;
			int i_2264_ = anInt9007 + anInt9009;
			int i_2265_ = anInt9003 + anInt9010;
			int i_2266_ = anInt8999;
			int i_2267_;
			if ((i_2267_ = i_2264_ - (anInt8985 << 12)) >= 0) {
			    i_2267_ = (anInt9001 - i_2267_) / anInt9001;
			    i_2266_ += i_2267_;
			    i_2264_ += anInt9001 * i_2267_;
			    i_2265_ += anInt9000 * i_2267_;
			    i_2263_ += i_2267_;
			}
			if ((i_2267_ = (i_2264_ - anInt9001) / anInt9001)
			    > i_2266_)
			    i_2266_ = i_2267_;
			if ((i_2267_ = i_2265_ - (anInt9002 << 12)) >= 0) {
			    i_2267_ = (anInt9000 - i_2267_) / anInt9000;
			    i_2266_ += i_2267_;
			    i_2264_ += anInt9001 * i_2267_;
			    i_2265_ += anInt9000 * i_2267_;
			    i_2263_ += i_2267_;
			}
			if ((i_2267_ = (i_2265_ - anInt9000) / anInt9000)
			    > i_2266_)
			    i_2266_ = i_2267_;
			for (/**/; i_2266_ < 0; i_2266_++) {
			    int i_2268_ = ((i_2265_ >> 12) * anInt8985
					   + (i_2264_ >> 12));
			    int i_2269_ = i_2263_++;
			    if (i_1985_ == 0) {
				if (i == 1)
				    is[i_2269_]
					= (anIntArray11408
					   [aByteArray11407[i_2268_] & 0xff]);
				else if (i == 0) {
				    int i_2270_
					= (anIntArray11408
					   [aByteArray11407[i_2268_] & 0xff]);
				    int i_2271_
					= ((i_2270_ & 0xff0000) * anInt9014
					   & ~0xffffff);
				    int i_2272_
					= ((i_2270_ & 0xff00) * anInt9015
					   & 0xff0000);
				    int i_2273_ = ((i_2270_ & 0xff) * anInt9018
						   & 0xff00);
				    is[i_2269_]
					= (i_2271_ | i_2272_ | i_2273_) >>> 8;
				} else if (i == 3) {
				    int i_2274_
					= (anIntArray11408
					   [aByteArray11407[i_2268_] & 0xff]);
				    int i_2275_ = anInt9011;
				    int i_2276_ = i_2274_ + i_2275_;
				    int i_2277_ = ((i_2274_ & 0xff00ff)
						   + (i_2275_ & 0xff00ff));
				    int i_2278_
					= ((i_2277_ & 0x1000100)
					   + (i_2276_ - i_2277_ & 0x10000));
				    is[i_2269_]
					= (i_2276_ - i_2278_
					   | i_2278_ - (i_2278_ >>> 8));
				} else if (i == 2) {
				    int i_2279_
					= (anIntArray11408
					   [aByteArray11407[i_2268_] & 0xff]);
				    int i_2280_
					= ((i_2279_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_2281_
					= ((i_2279_ & 0xff00) * anInt9012
					   & 0xff0000);
				    is[i_2269_] = (((i_2280_ | i_2281_) >>> 8)
						   + anInt9019);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_1985_ == 1) {
				if (i == 1) {
				    int i_2282_ = aByteArray11407[i_2268_];
				    if (i_2282_ != 0)
					is[i_2269_]
					    = anIntArray11408[i_2282_ & 0xff];
				} else if (i == 0) {
				    int i_2283_ = aByteArray11407[i_2268_];
				    if (i_2283_ != 0) {
					int i_2284_
					    = anIntArray11408[i_2283_ & 0xff];
					if ((anInt9011 & 0xffffff)
					    == 16777215) {
					    int i_2285_ = anInt9011 >>> 24;
					    int i_2286_ = 256 - i_2285_;
					    int i_2287_ = is[i_2269_];
					    is[i_2269_]
						= (((((i_2284_ & 0xff00ff)
						      * i_2285_)
						     + ((i_2287_ & 0xff00ff)
							* i_2286_))
						    & ~0xff00ff)
						   + ((((i_2284_ & 0xff00)
							* i_2285_)
						       + ((i_2287_ & 0xff00)
							  * i_2286_))
						      & 0xff0000)) >> 8;
					} else if (anInt9012 != 255) {
					    int i_2288_
						= (((i_2284_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_2289_ = (((i_2284_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_2290_
						= ((i_2284_ & 0xff) * anInt9018
						   & 0xff00);
					    i_2284_ = (i_2288_ | i_2289_
						       | i_2290_) >>> 8;
					    int i_2291_ = is[i_2269_];
					    is[i_2269_]
						= (((((i_2284_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2291_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2284_ & 0xff00)
							* anInt9012)
						       + ((i_2291_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					} else {
					    int i_2292_
						= (((i_2284_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_2293_ = (((i_2284_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_2294_
						= ((i_2284_ & 0xff) * anInt9018
						   & 0xff00);
					    is[i_2269_] = (i_2292_ | i_2293_
							   | i_2294_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_2295_ = aByteArray11407[i_2268_];
				    int i_2296_
					= (i_2295_ > 0
					   ? anIntArray11408[i_2295_] : 0);
				    int i_2297_ = anInt9011;
				    int i_2298_ = i_2296_ + i_2297_;
				    int i_2299_ = ((i_2296_ & 0xff00ff)
						   + (i_2297_ & 0xff00ff));
				    int i_2300_
					= ((i_2299_ & 0x1000100)
					   + (i_2298_ - i_2299_ & 0x10000));
				    i_2300_ = (i_2298_ - i_2300_
					       | i_2300_ - (i_2300_ >>> 8));
				    if (i_2296_ == 0 && anInt9012 != 255) {
					i_2296_ = i_2300_;
					i_2300_ = is[i_2269_];
					i_2300_ = (((((i_2296_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2300_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2296_ & 0xff00)
							* anInt9012)
						       + ((i_2300_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2269_] = i_2300_;
				} else if (i == 2) {
				    int i_2301_ = aByteArray11407[i_2268_];
				    if (i_2301_ != 0) {
					int i_2302_
					    = anIntArray11408[i_2301_ & 0xff];
					int i_2303_
					    = ((i_2302_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_2304_
					    = ((i_2302_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_2269_++] = ((i_2303_ | i_2304_)
							 >>> 8) + anInt9019;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_1985_ == 2) {
				if (i == 1) {
				    int i_2305_ = aByteArray11407[i_2268_];
				    if (i_2305_ != 0) {
					int i_2306_
					    = anIntArray11408[i_2305_ & 0xff];
					int i_2307_ = is[i_2269_];
					int i_2308_ = i_2306_ + i_2307_;
					int i_2309_ = ((i_2306_ & 0xff00ff)
						       + (i_2307_ & 0xff00ff));
					i_2307_ = ((i_2309_ & 0x1000100)
						   + (i_2308_ - i_2309_
						      & 0x10000));
					is[i_2269_]
					    = (i_2308_ - i_2307_
					       | i_2307_ - (i_2307_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_2310_ = aByteArray11407[i_2268_];
				    if (i_2310_ != 0) {
					int i_2311_
					    = anIntArray11408[i_2310_ & 0xff];
					int i_2312_
					    = ((i_2311_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_2313_
					    = ((i_2311_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_2314_
					    = ((i_2311_ & 0xff) * anInt9018
					       & 0xff00);
					i_2311_ = (i_2312_ | i_2313_
						   | i_2314_) >>> 8;
					int i_2315_ = is[i_2269_];
					int i_2316_ = i_2311_ + i_2315_;
					int i_2317_ = ((i_2311_ & 0xff00ff)
						       + (i_2315_ & 0xff00ff));
					i_2315_ = ((i_2317_ & 0x1000100)
						   + (i_2316_ - i_2317_
						      & 0x10000));
					is[i_2269_]
					    = (i_2316_ - i_2315_
					       | i_2315_ - (i_2315_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_2318_ = aByteArray11407[i_2268_];
				    int i_2319_
					= (i_2318_ > 0
					   ? anIntArray11408[i_2318_] : 0);
				    int i_2320_ = anInt9011;
				    int i_2321_ = i_2319_ + i_2320_;
				    int i_2322_ = ((i_2319_ & 0xff00ff)
						   + (i_2320_ & 0xff00ff));
				    int i_2323_
					= ((i_2322_ & 0x1000100)
					   + (i_2321_ - i_2322_ & 0x10000));
				    i_2323_ = (i_2321_ - i_2323_
					       | i_2323_ - (i_2323_ >>> 8));
				    if (i_2319_ == 0 && anInt9012 != 255) {
					i_2319_ = i_2323_;
					i_2323_ = is[i_2269_];
					i_2323_ = (((((i_2319_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2323_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2319_ & 0xff00)
							* anInt9012)
						       + ((i_2323_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2269_] = i_2323_;
				} else if (i == 2) {
				    int i_2324_ = aByteArray11407[i_2268_];
				    if (i_2324_ != 0) {
					int i_2325_
					    = anIntArray11408[i_2324_ & 0xff];
					int i_2326_
					    = ((i_2325_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_2327_
					    = ((i_2325_ & 0xff00) * anInt9012
					       & 0xff0000);
					i_2325_ = (((i_2326_ | i_2327_) >>> 8)
						   + anInt9019);
					int i_2328_ = is[i_2269_];
					int i_2329_ = i_2325_ + i_2328_;
					int i_2330_ = ((i_2325_ & 0xff00ff)
						       + (i_2328_ & 0xff00ff));
					i_2328_ = ((i_2330_ & 0x1000100)
						   + (i_2329_ - i_2330_
						      & 0x10000));
					is[i_2269_]
					    = (i_2329_ - i_2328_
					       | i_2328_ - (i_2328_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_2264_ += anInt9001;
			    i_2265_ += anInt9000;
			}
			i_2262_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_2331_ = anInt8998;
		    while (i_2331_ < 0) {
			int i_2332_ = anInt8988;
			int i_2333_ = anInt9007 + anInt9009;
			int i_2334_ = anInt9003 + anInt9010;
			int i_2335_ = anInt8999;
			int i_2336_;
			if ((i_2336_ = i_2333_ - (anInt8985 << 12)) >= 0) {
			    i_2336_ = (anInt9001 - i_2336_) / anInt9001;
			    i_2335_ += i_2336_;
			    i_2333_ += anInt9001 * i_2336_;
			    i_2334_ += anInt9000 * i_2336_;
			    i_2332_ += i_2336_;
			}
			if ((i_2336_ = (i_2333_ - anInt9001) / anInt9001)
			    > i_2335_)
			    i_2335_ = i_2336_;
			if (i_2334_ < 0) {
			    i_2336_ = (anInt9000 - 1 - i_2334_) / anInt9000;
			    i_2335_ += i_2336_;
			    i_2333_ += anInt9001 * i_2336_;
			    i_2334_ += anInt9000 * i_2336_;
			    i_2332_ += i_2336_;
			}
			if ((i_2336_ = (1 + i_2334_ - (anInt9002 << 12)
					- anInt9000) / anInt9000)
			    > i_2335_)
			    i_2335_ = i_2336_;
			for (/**/; i_2335_ < 0; i_2335_++) {
			    int i_2337_ = ((i_2334_ >> 12) * anInt8985
					   + (i_2333_ >> 12));
			    int i_2338_ = i_2332_++;
			    if (i_1985_ == 0) {
				if (i == 1)
				    is[i_2338_]
					= (anIntArray11408
					   [aByteArray11407[i_2337_] & 0xff]);
				else if (i == 0) {
				    int i_2339_
					= (anIntArray11408
					   [aByteArray11407[i_2337_] & 0xff]);
				    int i_2340_
					= ((i_2339_ & 0xff0000) * anInt9014
					   & ~0xffffff);
				    int i_2341_
					= ((i_2339_ & 0xff00) * anInt9015
					   & 0xff0000);
				    int i_2342_ = ((i_2339_ & 0xff) * anInt9018
						   & 0xff00);
				    is[i_2338_]
					= (i_2340_ | i_2341_ | i_2342_) >>> 8;
				} else if (i == 3) {
				    int i_2343_
					= (anIntArray11408
					   [aByteArray11407[i_2337_] & 0xff]);
				    int i_2344_ = anInt9011;
				    int i_2345_ = i_2343_ + i_2344_;
				    int i_2346_ = ((i_2343_ & 0xff00ff)
						   + (i_2344_ & 0xff00ff));
				    int i_2347_
					= ((i_2346_ & 0x1000100)
					   + (i_2345_ - i_2346_ & 0x10000));
				    is[i_2338_]
					= (i_2345_ - i_2347_
					   | i_2347_ - (i_2347_ >>> 8));
				} else if (i == 2) {
				    int i_2348_
					= (anIntArray11408
					   [aByteArray11407[i_2337_] & 0xff]);
				    int i_2349_
					= ((i_2348_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_2350_
					= ((i_2348_ & 0xff00) * anInt9012
					   & 0xff0000);
				    is[i_2338_] = (((i_2349_ | i_2350_) >>> 8)
						   + anInt9019);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_1985_ == 1) {
				if (i == 1) {
				    int i_2351_ = aByteArray11407[i_2337_];
				    if (i_2351_ != 0)
					is[i_2338_]
					    = anIntArray11408[i_2351_ & 0xff];
				} else if (i == 0) {
				    int i_2352_ = aByteArray11407[i_2337_];
				    if (i_2352_ != 0) {
					int i_2353_
					    = anIntArray11408[i_2352_ & 0xff];
					if ((anInt9011 & 0xffffff)
					    == 16777215) {
					    int i_2354_ = anInt9011 >>> 24;
					    int i_2355_ = 256 - i_2354_;
					    int i_2356_ = is[i_2338_];
					    is[i_2338_]
						= (((((i_2353_ & 0xff00ff)
						      * i_2354_)
						     + ((i_2356_ & 0xff00ff)
							* i_2355_))
						    & ~0xff00ff)
						   + ((((i_2353_ & 0xff00)
							* i_2354_)
						       + ((i_2356_ & 0xff00)
							  * i_2355_))
						      & 0xff0000)) >> 8;
					} else if (anInt9012 != 255) {
					    int i_2357_
						= (((i_2353_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_2358_ = (((i_2353_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_2359_
						= ((i_2353_ & 0xff) * anInt9018
						   & 0xff00);
					    i_2353_ = (i_2357_ | i_2358_
						       | i_2359_) >>> 8;
					    int i_2360_ = is[i_2338_];
					    is[i_2338_]
						= (((((i_2353_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2360_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2353_ & 0xff00)
							* anInt9012)
						       + ((i_2360_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					} else {
					    int i_2361_
						= (((i_2353_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_2362_ = (((i_2353_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_2363_
						= ((i_2353_ & 0xff) * anInt9018
						   & 0xff00);
					    is[i_2338_] = (i_2361_ | i_2362_
							   | i_2363_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_2364_ = aByteArray11407[i_2337_];
				    int i_2365_
					= (i_2364_ > 0
					   ? anIntArray11408[i_2364_] : 0);
				    int i_2366_ = anInt9011;
				    int i_2367_ = i_2365_ + i_2366_;
				    int i_2368_ = ((i_2365_ & 0xff00ff)
						   + (i_2366_ & 0xff00ff));
				    int i_2369_
					= ((i_2368_ & 0x1000100)
					   + (i_2367_ - i_2368_ & 0x10000));
				    i_2369_ = (i_2367_ - i_2369_
					       | i_2369_ - (i_2369_ >>> 8));
				    if (i_2365_ == 0 && anInt9012 != 255) {
					i_2365_ = i_2369_;
					i_2369_ = is[i_2338_];
					i_2369_ = (((((i_2365_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2369_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2365_ & 0xff00)
							* anInt9012)
						       + ((i_2369_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2338_] = i_2369_;
				} else if (i == 2) {
				    int i_2370_ = aByteArray11407[i_2337_];
				    if (i_2370_ != 0) {
					int i_2371_
					    = anIntArray11408[i_2370_ & 0xff];
					int i_2372_
					    = ((i_2371_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_2373_
					    = ((i_2371_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_2338_++] = ((i_2372_ | i_2373_)
							 >>> 8) + anInt9019;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_1985_ == 2) {
				if (i == 1) {
				    int i_2374_ = aByteArray11407[i_2337_];
				    if (i_2374_ != 0) {
					int i_2375_
					    = anIntArray11408[i_2374_ & 0xff];
					int i_2376_ = is[i_2338_];
					int i_2377_ = i_2375_ + i_2376_;
					int i_2378_ = ((i_2375_ & 0xff00ff)
						       + (i_2376_ & 0xff00ff));
					i_2376_ = ((i_2378_ & 0x1000100)
						   + (i_2377_ - i_2378_
						      & 0x10000));
					is[i_2338_]
					    = (i_2377_ - i_2376_
					       | i_2376_ - (i_2376_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_2379_ = aByteArray11407[i_2337_];
				    if (i_2379_ != 0) {
					int i_2380_
					    = anIntArray11408[i_2379_ & 0xff];
					int i_2381_
					    = ((i_2380_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_2382_
					    = ((i_2380_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_2383_
					    = ((i_2380_ & 0xff) * anInt9018
					       & 0xff00);
					i_2380_ = (i_2381_ | i_2382_
						   | i_2383_) >>> 8;
					int i_2384_ = is[i_2338_];
					int i_2385_ = i_2380_ + i_2384_;
					int i_2386_ = ((i_2380_ & 0xff00ff)
						       + (i_2384_ & 0xff00ff));
					i_2384_ = ((i_2386_ & 0x1000100)
						   + (i_2385_ - i_2386_
						      & 0x10000));
					is[i_2338_]
					    = (i_2385_ - i_2384_
					       | i_2384_ - (i_2384_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_2387_ = aByteArray11407[i_2337_];
				    int i_2388_
					= (i_2387_ > 0
					   ? anIntArray11408[i_2387_] : 0);
				    int i_2389_ = anInt9011;
				    int i_2390_ = i_2388_ + i_2389_;
				    int i_2391_ = ((i_2388_ & 0xff00ff)
						   + (i_2389_ & 0xff00ff));
				    int i_2392_
					= ((i_2391_ & 0x1000100)
					   + (i_2390_ - i_2391_ & 0x10000));
				    i_2392_ = (i_2390_ - i_2392_
					       | i_2392_ - (i_2392_ >>> 8));
				    if (i_2388_ == 0 && anInt9012 != 255) {
					i_2388_ = i_2392_;
					i_2392_ = is[i_2338_];
					i_2392_ = (((((i_2388_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2392_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2388_ & 0xff00)
							* anInt9012)
						       + ((i_2392_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2338_] = i_2392_;
				} else if (i == 2) {
				    int i_2393_ = aByteArray11407[i_2337_];
				    if (i_2393_ != 0) {
					int i_2394_
					    = anIntArray11408[i_2393_ & 0xff];
					int i_2395_
					    = ((i_2394_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_2396_
					    = ((i_2394_ & 0xff00) * anInt9012
					       & 0xff0000);
					i_2394_ = (((i_2395_ | i_2396_) >>> 8)
						   + anInt9019);
					int i_2397_ = is[i_2338_];
					int i_2398_ = i_2394_ + i_2397_;
					int i_2399_ = ((i_2394_ & 0xff00ff)
						       + (i_2397_ & 0xff00ff));
					i_2397_ = ((i_2399_ & 0x1000100)
						   + (i_2398_ - i_2399_
						      & 0x10000));
					is[i_2338_]
					    = (i_2398_ - i_2397_
					       | i_2397_ - (i_2397_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_2333_ += anInt9001;
			    i_2334_ += anInt9000;
			}
			i_2331_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9000 == 0) {
		int i_2400_ = anInt8998;
		while (i_2400_ < 0) {
		    int i_2401_ = anInt8988;
		    int i_2402_ = anInt9007 + anInt9009;
		    int i_2403_ = anInt9003;
		    int i_2404_ = anInt8999;
		    if (i_2403_ >= 0 && i_2403_ - (anInt9002 << 12) < 0) {
			if (i_2402_ < 0) {
			    int i_2405_
				= (anInt9001 - 1 - i_2402_) / anInt9001;
			    i_2404_ += i_2405_;
			    i_2402_ += anInt9001 * i_2405_;
			    i_2401_ += i_2405_;
			}
			int i_2406_;
			if ((i_2406_ = (1 + i_2402_ - (anInt8985 << 12)
					- anInt9001) / anInt9001)
			    > i_2404_)
			    i_2404_ = i_2406_;
			for (/**/; i_2404_ < 0; i_2404_++) {
			    int i_2407_ = ((i_2403_ >> 12) * anInt8985
					   + (i_2402_ >> 12));
			    int i_2408_ = i_2401_++;
			    if (i_1985_ == 0) {
				if (i == 1)
				    is[i_2408_]
					= (anIntArray11408
					   [aByteArray11407[i_2407_] & 0xff]);
				else if (i == 0) {
				    int i_2409_
					= (anIntArray11408
					   [aByteArray11407[i_2407_] & 0xff]);
				    int i_2410_
					= ((i_2409_ & 0xff0000) * anInt9014
					   & ~0xffffff);
				    int i_2411_
					= ((i_2409_ & 0xff00) * anInt9015
					   & 0xff0000);
				    int i_2412_ = ((i_2409_ & 0xff) * anInt9018
						   & 0xff00);
				    is[i_2408_]
					= (i_2410_ | i_2411_ | i_2412_) >>> 8;
				} else if (i == 3) {
				    int i_2413_
					= (anIntArray11408
					   [aByteArray11407[i_2407_] & 0xff]);
				    int i_2414_ = anInt9011;
				    int i_2415_ = i_2413_ + i_2414_;
				    int i_2416_ = ((i_2413_ & 0xff00ff)
						   + (i_2414_ & 0xff00ff));
				    int i_2417_
					= ((i_2416_ & 0x1000100)
					   + (i_2415_ - i_2416_ & 0x10000));
				    is[i_2408_]
					= (i_2415_ - i_2417_
					   | i_2417_ - (i_2417_ >>> 8));
				} else if (i == 2) {
				    int i_2418_
					= (anIntArray11408
					   [aByteArray11407[i_2407_] & 0xff]);
				    int i_2419_
					= ((i_2418_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_2420_
					= ((i_2418_ & 0xff00) * anInt9012
					   & 0xff0000);
				    is[i_2408_] = (((i_2419_ | i_2420_) >>> 8)
						   + anInt9019);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_1985_ == 1) {
				if (i == 1) {
				    int i_2421_ = aByteArray11407[i_2407_];
				    if (i_2421_ != 0)
					is[i_2408_]
					    = anIntArray11408[i_2421_ & 0xff];
				} else if (i == 0) {
				    int i_2422_ = aByteArray11407[i_2407_];
				    if (i_2422_ != 0) {
					int i_2423_
					    = anIntArray11408[i_2422_ & 0xff];
					if ((anInt9011 & 0xffffff)
					    == 16777215) {
					    int i_2424_ = anInt9011 >>> 24;
					    int i_2425_ = 256 - i_2424_;
					    int i_2426_ = is[i_2408_];
					    is[i_2408_]
						= (((((i_2423_ & 0xff00ff)
						      * i_2424_)
						     + ((i_2426_ & 0xff00ff)
							* i_2425_))
						    & ~0xff00ff)
						   + ((((i_2423_ & 0xff00)
							* i_2424_)
						       + ((i_2426_ & 0xff00)
							  * i_2425_))
						      & 0xff0000)) >> 8;
					} else if (anInt9012 != 255) {
					    int i_2427_
						= (((i_2423_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_2428_ = (((i_2423_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_2429_
						= ((i_2423_ & 0xff) * anInt9018
						   & 0xff00);
					    i_2423_ = (i_2427_ | i_2428_
						       | i_2429_) >>> 8;
					    int i_2430_ = is[i_2408_];
					    is[i_2408_]
						= (((((i_2423_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2430_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2423_ & 0xff00)
							* anInt9012)
						       + ((i_2430_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					} else {
					    int i_2431_
						= (((i_2423_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_2432_ = (((i_2423_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_2433_
						= ((i_2423_ & 0xff) * anInt9018
						   & 0xff00);
					    is[i_2408_] = (i_2431_ | i_2432_
							   | i_2433_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_2434_ = aByteArray11407[i_2407_];
				    int i_2435_
					= (i_2434_ > 0
					   ? anIntArray11408[i_2434_] : 0);
				    int i_2436_ = anInt9011;
				    int i_2437_ = i_2435_ + i_2436_;
				    int i_2438_ = ((i_2435_ & 0xff00ff)
						   + (i_2436_ & 0xff00ff));
				    int i_2439_
					= ((i_2438_ & 0x1000100)
					   + (i_2437_ - i_2438_ & 0x10000));
				    i_2439_ = (i_2437_ - i_2439_
					       | i_2439_ - (i_2439_ >>> 8));
				    if (i_2435_ == 0 && anInt9012 != 255) {
					i_2435_ = i_2439_;
					i_2439_ = is[i_2408_];
					i_2439_ = (((((i_2435_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2439_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2435_ & 0xff00)
							* anInt9012)
						       + ((i_2439_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2408_] = i_2439_;
				} else if (i == 2) {
				    int i_2440_ = aByteArray11407[i_2407_];
				    if (i_2440_ != 0) {
					int i_2441_
					    = anIntArray11408[i_2440_ & 0xff];
					int i_2442_
					    = ((i_2441_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_2443_
					    = ((i_2441_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_2408_++] = ((i_2442_ | i_2443_)
							 >>> 8) + anInt9019;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_1985_ == 2) {
				if (i == 1) {
				    int i_2444_ = aByteArray11407[i_2407_];
				    if (i_2444_ != 0) {
					int i_2445_
					    = anIntArray11408[i_2444_ & 0xff];
					int i_2446_ = is[i_2408_];
					int i_2447_ = i_2445_ + i_2446_;
					int i_2448_ = ((i_2445_ & 0xff00ff)
						       + (i_2446_ & 0xff00ff));
					i_2446_ = ((i_2448_ & 0x1000100)
						   + (i_2447_ - i_2448_
						      & 0x10000));
					is[i_2408_]
					    = (i_2447_ - i_2446_
					       | i_2446_ - (i_2446_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_2449_ = aByteArray11407[i_2407_];
				    if (i_2449_ != 0) {
					int i_2450_
					    = anIntArray11408[i_2449_ & 0xff];
					int i_2451_
					    = ((i_2450_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_2452_
					    = ((i_2450_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_2453_
					    = ((i_2450_ & 0xff) * anInt9018
					       & 0xff00);
					i_2450_ = (i_2451_ | i_2452_
						   | i_2453_) >>> 8;
					int i_2454_ = is[i_2408_];
					int i_2455_ = i_2450_ + i_2454_;
					int i_2456_ = ((i_2450_ & 0xff00ff)
						       + (i_2454_ & 0xff00ff));
					i_2454_ = ((i_2456_ & 0x1000100)
						   + (i_2455_ - i_2456_
						      & 0x10000));
					is[i_2408_]
					    = (i_2455_ - i_2454_
					       | i_2454_ - (i_2454_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_2457_ = aByteArray11407[i_2407_];
				    int i_2458_
					= (i_2457_ > 0
					   ? anIntArray11408[i_2457_] : 0);
				    int i_2459_ = anInt9011;
				    int i_2460_ = i_2458_ + i_2459_;
				    int i_2461_ = ((i_2458_ & 0xff00ff)
						   + (i_2459_ & 0xff00ff));
				    int i_2462_
					= ((i_2461_ & 0x1000100)
					   + (i_2460_ - i_2461_ & 0x10000));
				    i_2462_ = (i_2460_ - i_2462_
					       | i_2462_ - (i_2462_ >>> 8));
				    if (i_2458_ == 0 && anInt9012 != 255) {
					i_2458_ = i_2462_;
					i_2462_ = is[i_2408_];
					i_2462_ = (((((i_2458_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2462_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2458_ & 0xff00)
							* anInt9012)
						       + ((i_2462_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2408_] = i_2462_;
				} else if (i == 2) {
				    int i_2463_ = aByteArray11407[i_2407_];
				    if (i_2463_ != 0) {
					int i_2464_
					    = anIntArray11408[i_2463_ & 0xff];
					int i_2465_
					    = ((i_2464_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_2466_
					    = ((i_2464_ & 0xff00) * anInt9012
					       & 0xff0000);
					i_2464_ = (((i_2465_ | i_2466_) >>> 8)
						   + anInt9019);
					int i_2467_ = is[i_2408_];
					int i_2468_ = i_2464_ + i_2467_;
					int i_2469_ = ((i_2464_ & 0xff00ff)
						       + (i_2467_ & 0xff00ff));
					i_2467_ = ((i_2469_ & 0x1000100)
						   + (i_2468_ - i_2469_
						      & 0x10000));
					is[i_2408_]
					    = (i_2468_ - i_2467_
					       | i_2467_ - (i_2467_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_2402_ += anInt9001;
			}
		    }
		    i_2400_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else if (anInt9000 < 0) {
		for (int i_2470_ = anInt8998; i_2470_ < 0; i_2470_++) {
		    int i_2471_ = anInt8988;
		    int i_2472_ = anInt9007 + anInt9009;
		    int i_2473_ = anInt9003 + anInt9010;
		    int i_2474_ = anInt8999;
		    if (i_2472_ < 0) {
			int i_2475_ = (anInt9001 - 1 - i_2472_) / anInt9001;
			i_2474_ += i_2475_;
			i_2472_ += anInt9001 * i_2475_;
			i_2473_ += anInt9000 * i_2475_;
			i_2471_ += i_2475_;
		    }
		    int i_2476_;
		    if ((i_2476_ = (1 + i_2472_ - (anInt8985 << 12)
				    - anInt9001) / anInt9001)
			> i_2474_)
			i_2474_ = i_2476_;
		    if ((i_2476_ = i_2473_ - (anInt9002 << 12)) >= 0) {
			i_2476_ = (anInt9000 - i_2476_) / anInt9000;
			i_2474_ += i_2476_;
			i_2472_ += anInt9001 * i_2476_;
			i_2473_ += anInt9000 * i_2476_;
			i_2471_ += i_2476_;
		    }
		    if ((i_2476_ = (i_2473_ - anInt9000) / anInt9000)
			> i_2474_)
			i_2474_ = i_2476_;
		    for (/**/; i_2474_ < 0; i_2474_++) {
			int i_2477_
			    = (i_2473_ >> 12) * anInt8985 + (i_2472_ >> 12);
			int i_2478_ = i_2471_++;
			if (i_1985_ == 0) {
			    if (i == 1)
				is[i_2478_]
				    = (anIntArray11408
				       [aByteArray11407[i_2477_] & 0xff]);
			    else if (i == 0) {
				int i_2479_
				    = (anIntArray11408
				       [aByteArray11407[i_2477_] & 0xff]);
				int i_2480_ = ((i_2479_ & 0xff0000) * anInt9014
					       & ~0xffffff);
				int i_2481_ = ((i_2479_ & 0xff00) * anInt9015
					       & 0xff0000);
				int i_2482_
				    = (i_2479_ & 0xff) * anInt9018 & 0xff00;
				is[i_2478_]
				    = (i_2480_ | i_2481_ | i_2482_) >>> 8;
			    } else if (i == 3) {
				int i_2483_
				    = (anIntArray11408
				       [aByteArray11407[i_2477_] & 0xff]);
				int i_2484_ = anInt9011;
				int i_2485_ = i_2483_ + i_2484_;
				int i_2486_ = ((i_2483_ & 0xff00ff)
					       + (i_2484_ & 0xff00ff));
				int i_2487_
				    = ((i_2486_ & 0x1000100)
				       + (i_2485_ - i_2486_ & 0x10000));
				is[i_2478_]
				    = i_2485_ - i_2487_ | i_2487_ - (i_2487_
								     >>> 8);
			    } else if (i == 2) {
				int i_2488_
				    = (anIntArray11408
				       [aByteArray11407[i_2477_] & 0xff]);
				int i_2489_ = ((i_2488_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
				int i_2490_ = ((i_2488_ & 0xff00) * anInt9012
					       & 0xff0000);
				is[i_2478_]
				    = ((i_2489_ | i_2490_) >>> 8) + anInt9019;
			    } else
				throw new IllegalArgumentException();
			} else if (i_1985_ == 1) {
			    if (i == 1) {
				int i_2491_ = aByteArray11407[i_2477_];
				if (i_2491_ != 0)
				    is[i_2478_]
					= anIntArray11408[i_2491_ & 0xff];
			    } else if (i == 0) {
				int i_2492_ = aByteArray11407[i_2477_];
				if (i_2492_ != 0) {
				    int i_2493_
					= anIntArray11408[i_2492_ & 0xff];
				    if ((anInt9011 & 0xffffff) == 16777215) {
					int i_2494_ = anInt9011 >>> 24;
					int i_2495_ = 256 - i_2494_;
					int i_2496_ = is[i_2478_];
					is[i_2478_]
					    = ((((i_2493_ & 0xff00ff) * i_2494_
						 + ((i_2496_ & 0xff00ff)
						    * i_2495_))
						& ~0xff00ff)
					       + (((i_2493_ & 0xff00) * i_2494_
						   + ((i_2496_ & 0xff00)
						      * i_2495_))
						  & 0xff0000)) >> 8;
				    } else if (anInt9012 != 255) {
					int i_2497_
					    = ((i_2493_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_2498_
					    = ((i_2493_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_2499_
					    = ((i_2493_ & 0xff) * anInt9018
					       & 0xff00);
					i_2493_ = (i_2497_ | i_2498_
						   | i_2499_) >>> 8;
					int i_2500_ = is[i_2478_];
					is[i_2478_]
					    = (((((i_2493_ & 0xff00ff)
						  * anInt9012)
						 + ((i_2500_ & 0xff00ff)
						    * anInt9013))
						& ~0xff00ff)
					       + ((((i_2493_ & 0xff00)
						    * anInt9012)
						   + ((i_2500_ & 0xff00)
						      * anInt9013))
						  & 0xff0000)) >> 8;
				    } else {
					int i_2501_
					    = ((i_2493_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_2502_
					    = ((i_2493_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_2503_
					    = ((i_2493_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_2478_] = (i_2501_ | i_2502_
						       | i_2503_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_2504_ = aByteArray11407[i_2477_];
				int i_2505_ = (i_2504_ > 0
					       ? anIntArray11408[i_2504_] : 0);
				int i_2506_ = anInt9011;
				int i_2507_ = i_2505_ + i_2506_;
				int i_2508_ = ((i_2505_ & 0xff00ff)
					       + (i_2506_ & 0xff00ff));
				int i_2509_
				    = ((i_2508_ & 0x1000100)
				       + (i_2507_ - i_2508_ & 0x10000));
				i_2509_
				    = i_2507_ - i_2509_ | i_2509_ - (i_2509_
								     >>> 8);
				if (i_2505_ == 0 && anInt9012 != 255) {
				    i_2505_ = i_2509_;
				    i_2509_ = is[i_2478_];
				    i_2509_
					= ((((i_2505_ & 0xff00ff) * anInt9012
					     + ((i_2509_ & 0xff00ff)
						* anInt9013))
					    & ~0xff00ff)
					   + (((i_2505_ & 0xff00) * anInt9012
					       + ((i_2509_ & 0xff00)
						  * anInt9013))
					      & 0xff0000)) >> 8;
				}
				is[i_2478_] = i_2509_;
			    } else if (i == 2) {
				int i_2510_ = aByteArray11407[i_2477_];
				if (i_2510_ != 0) {
				    int i_2511_
					= anIntArray11408[i_2510_ & 0xff];
				    int i_2512_
					= ((i_2511_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_2513_
					= ((i_2511_ & 0xff00) * anInt9012
					   & 0xff0000);
				    is[i_2478_++] = ((i_2512_ | i_2513_)
						     >>> 8) + anInt9019;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_1985_ == 2) {
			    if (i == 1) {
				int i_2514_ = aByteArray11407[i_2477_];
				if (i_2514_ != 0) {
				    int i_2515_
					= anIntArray11408[i_2514_ & 0xff];
				    int i_2516_ = is[i_2478_];
				    int i_2517_ = i_2515_ + i_2516_;
				    int i_2518_ = ((i_2515_ & 0xff00ff)
						   + (i_2516_ & 0xff00ff));
				    i_2516_
					= ((i_2518_ & 0x1000100)
					   + (i_2517_ - i_2518_ & 0x10000));
				    is[i_2478_]
					= (i_2517_ - i_2516_
					   | i_2516_ - (i_2516_ >>> 8));
				}
			    } else if (i == 0) {
				int i_2519_ = aByteArray11407[i_2477_];
				if (i_2519_ != 0) {
				    int i_2520_
					= anIntArray11408[i_2519_ & 0xff];
				    int i_2521_
					= ((i_2520_ & 0xff0000) * anInt9014
					   & ~0xffffff);
				    int i_2522_
					= ((i_2520_ & 0xff00) * anInt9015
					   & 0xff0000);
				    int i_2523_ = ((i_2520_ & 0xff) * anInt9018
						   & 0xff00);
				    i_2520_
					= (i_2521_ | i_2522_ | i_2523_) >>> 8;
				    int i_2524_ = is[i_2478_];
				    int i_2525_ = i_2520_ + i_2524_;
				    int i_2526_ = ((i_2520_ & 0xff00ff)
						   + (i_2524_ & 0xff00ff));
				    i_2524_
					= ((i_2526_ & 0x1000100)
					   + (i_2525_ - i_2526_ & 0x10000));
				    is[i_2478_]
					= (i_2525_ - i_2524_
					   | i_2524_ - (i_2524_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_2527_ = aByteArray11407[i_2477_];
				int i_2528_ = (i_2527_ > 0
					       ? anIntArray11408[i_2527_] : 0);
				int i_2529_ = anInt9011;
				int i_2530_ = i_2528_ + i_2529_;
				int i_2531_ = ((i_2528_ & 0xff00ff)
					       + (i_2529_ & 0xff00ff));
				int i_2532_
				    = ((i_2531_ & 0x1000100)
				       + (i_2530_ - i_2531_ & 0x10000));
				i_2532_
				    = i_2530_ - i_2532_ | i_2532_ - (i_2532_
								     >>> 8);
				if (i_2528_ == 0 && anInt9012 != 255) {
				    i_2528_ = i_2532_;
				    i_2532_ = is[i_2478_];
				    i_2532_
					= ((((i_2528_ & 0xff00ff) * anInt9012
					     + ((i_2532_ & 0xff00ff)
						* anInt9013))
					    & ~0xff00ff)
					   + (((i_2528_ & 0xff00) * anInt9012
					       + ((i_2532_ & 0xff00)
						  * anInt9013))
					      & 0xff0000)) >> 8;
				}
				is[i_2478_] = i_2532_;
			    } else if (i == 2) {
				int i_2533_ = aByteArray11407[i_2477_];
				if (i_2533_ != 0) {
				    int i_2534_
					= anIntArray11408[i_2533_ & 0xff];
				    int i_2535_
					= ((i_2534_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_2536_
					= ((i_2534_ & 0xff00) * anInt9012
					   & 0xff0000);
				    i_2534_ = (((i_2535_ | i_2536_) >>> 8)
					       + anInt9019);
				    int i_2537_ = is[i_2478_];
				    int i_2538_ = i_2534_ + i_2537_;
				    int i_2539_ = ((i_2534_ & 0xff00ff)
						   + (i_2537_ & 0xff00ff));
				    i_2537_
					= ((i_2539_ & 0x1000100)
					   + (i_2538_ - i_2539_ & 0x10000));
				    is[i_2478_]
					= (i_2538_ - i_2537_
					   | i_2537_ - (i_2537_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_2472_ += anInt9001;
			i_2473_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else {
		for (int i_2540_ = anInt8998; i_2540_ < 0; i_2540_++) {
		    int i_2541_ = anInt8988;
		    int i_2542_ = anInt9007 + anInt9009;
		    int i_2543_ = anInt9003 + anInt9010;
		    int i_2544_ = anInt8999;
		    if (i_2542_ < 0) {
			int i_2545_ = (anInt9001 - 1 - i_2542_) / anInt9001;
			i_2544_ += i_2545_;
			i_2542_ += anInt9001 * i_2545_;
			i_2543_ += anInt9000 * i_2545_;
			i_2541_ += i_2545_;
		    }
		    int i_2546_;
		    if ((i_2546_ = (1 + i_2542_ - (anInt8985 << 12)
				    - anInt9001) / anInt9001)
			> i_2544_)
			i_2544_ = i_2546_;
		    if (i_2543_ < 0) {
			i_2546_ = (anInt9000 - 1 - i_2543_) / anInt9000;
			i_2544_ += i_2546_;
			i_2542_ += anInt9001 * i_2546_;
			i_2543_ += anInt9000 * i_2546_;
			i_2541_ += i_2546_;
		    }
		    if ((i_2546_ = (1 + i_2543_ - (anInt9002 << 12)
				    - anInt9000) / anInt9000)
			> i_2544_)
			i_2544_ = i_2546_;
		    for (/**/; i_2544_ < 0; i_2544_++) {
			int i_2547_
			    = (i_2543_ >> 12) * anInt8985 + (i_2542_ >> 12);
			int i_2548_ = i_2541_++;
			if (i_1985_ == 0) {
			    if (i == 1)
				is[i_2548_]
				    = (anIntArray11408
				       [aByteArray11407[i_2547_] & 0xff]);
			    else if (i == 0) {
				int i_2549_
				    = (anIntArray11408
				       [aByteArray11407[i_2547_] & 0xff]);
				int i_2550_ = ((i_2549_ & 0xff0000) * anInt9014
					       & ~0xffffff);
				int i_2551_ = ((i_2549_ & 0xff00) * anInt9015
					       & 0xff0000);
				int i_2552_
				    = (i_2549_ & 0xff) * anInt9018 & 0xff00;
				is[i_2548_]
				    = (i_2550_ | i_2551_ | i_2552_) >>> 8;
			    } else if (i == 3) {
				int i_2553_
				    = (anIntArray11408
				       [aByteArray11407[i_2547_] & 0xff]);
				int i_2554_ = anInt9011;
				int i_2555_ = i_2553_ + i_2554_;
				int i_2556_ = ((i_2553_ & 0xff00ff)
					       + (i_2554_ & 0xff00ff));
				int i_2557_
				    = ((i_2556_ & 0x1000100)
				       + (i_2555_ - i_2556_ & 0x10000));
				is[i_2548_]
				    = i_2555_ - i_2557_ | i_2557_ - (i_2557_
								     >>> 8);
			    } else if (i == 2) {
				int i_2558_
				    = (anIntArray11408
				       [aByteArray11407[i_2547_] & 0xff]);
				int i_2559_ = ((i_2558_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
				int i_2560_ = ((i_2558_ & 0xff00) * anInt9012
					       & 0xff0000);
				is[i_2548_]
				    = ((i_2559_ | i_2560_) >>> 8) + anInt9019;
			    } else
				throw new IllegalArgumentException();
			} else if (i_1985_ == 1) {
			    if (i == 1) {
				int i_2561_ = aByteArray11407[i_2547_];
				if (i_2561_ != 0)
				    is[i_2548_]
					= anIntArray11408[i_2561_ & 0xff];
			    } else if (i == 0) {
				int i_2562_ = aByteArray11407[i_2547_];
				if (i_2562_ != 0) {
				    int i_2563_
					= anIntArray11408[i_2562_ & 0xff];
				    if ((anInt9011 & 0xffffff) == 16777215) {
					int i_2564_ = anInt9011 >>> 24;
					int i_2565_ = 256 - i_2564_;
					int i_2566_ = is[i_2548_];
					is[i_2548_]
					    = ((((i_2563_ & 0xff00ff) * i_2564_
						 + ((i_2566_ & 0xff00ff)
						    * i_2565_))
						& ~0xff00ff)
					       + (((i_2563_ & 0xff00) * i_2564_
						   + ((i_2566_ & 0xff00)
						      * i_2565_))
						  & 0xff0000)) >> 8;
				    } else if (anInt9012 != 255) {
					int i_2567_
					    = ((i_2563_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_2568_
					    = ((i_2563_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_2569_
					    = ((i_2563_ & 0xff) * anInt9018
					       & 0xff00);
					i_2563_ = (i_2567_ | i_2568_
						   | i_2569_) >>> 8;
					int i_2570_ = is[i_2548_];
					is[i_2548_]
					    = (((((i_2563_ & 0xff00ff)
						  * anInt9012)
						 + ((i_2570_ & 0xff00ff)
						    * anInt9013))
						& ~0xff00ff)
					       + ((((i_2563_ & 0xff00)
						    * anInt9012)
						   + ((i_2570_ & 0xff00)
						      * anInt9013))
						  & 0xff0000)) >> 8;
				    } else {
					int i_2571_
					    = ((i_2563_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_2572_
					    = ((i_2563_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_2573_
					    = ((i_2563_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_2548_] = (i_2571_ | i_2572_
						       | i_2573_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_2574_ = aByteArray11407[i_2547_];
				int i_2575_ = (i_2574_ > 0
					       ? anIntArray11408[i_2574_] : 0);
				int i_2576_ = anInt9011;
				int i_2577_ = i_2575_ + i_2576_;
				int i_2578_ = ((i_2575_ & 0xff00ff)
					       + (i_2576_ & 0xff00ff));
				int i_2579_
				    = ((i_2578_ & 0x1000100)
				       + (i_2577_ - i_2578_ & 0x10000));
				i_2579_
				    = i_2577_ - i_2579_ | i_2579_ - (i_2579_
								     >>> 8);
				if (i_2575_ == 0 && anInt9012 != 255) {
				    i_2575_ = i_2579_;
				    i_2579_ = is[i_2548_];
				    i_2579_
					= ((((i_2575_ & 0xff00ff) * anInt9012
					     + ((i_2579_ & 0xff00ff)
						* anInt9013))
					    & ~0xff00ff)
					   + (((i_2575_ & 0xff00) * anInt9012
					       + ((i_2579_ & 0xff00)
						  * anInt9013))
					      & 0xff0000)) >> 8;
				}
				is[i_2548_] = i_2579_;
			    } else if (i == 2) {
				int i_2580_ = aByteArray11407[i_2547_];
				if (i_2580_ != 0) {
				    int i_2581_
					= anIntArray11408[i_2580_ & 0xff];
				    int i_2582_
					= ((i_2581_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_2583_
					= ((i_2581_ & 0xff00) * anInt9012
					   & 0xff0000);
				    is[i_2548_++] = ((i_2582_ | i_2583_)
						     >>> 8) + anInt9019;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_1985_ == 2) {
			    if (i == 1) {
				int i_2584_ = aByteArray11407[i_2547_];
				if (i_2584_ != 0) {
				    int i_2585_
					= anIntArray11408[i_2584_ & 0xff];
				    int i_2586_ = is[i_2548_];
				    int i_2587_ = i_2585_ + i_2586_;
				    int i_2588_ = ((i_2585_ & 0xff00ff)
						   + (i_2586_ & 0xff00ff));
				    i_2586_
					= ((i_2588_ & 0x1000100)
					   + (i_2587_ - i_2588_ & 0x10000));
				    is[i_2548_]
					= (i_2587_ - i_2586_
					   | i_2586_ - (i_2586_ >>> 8));
				}
			    } else if (i == 0) {
				int i_2589_ = aByteArray11407[i_2547_];
				if (i_2589_ != 0) {
				    int i_2590_
					= anIntArray11408[i_2589_ & 0xff];
				    int i_2591_
					= ((i_2590_ & 0xff0000) * anInt9014
					   & ~0xffffff);
				    int i_2592_
					= ((i_2590_ & 0xff00) * anInt9015
					   & 0xff0000);
				    int i_2593_ = ((i_2590_ & 0xff) * anInt9018
						   & 0xff00);
				    i_2590_
					= (i_2591_ | i_2592_ | i_2593_) >>> 8;
				    int i_2594_ = is[i_2548_];
				    int i_2595_ = i_2590_ + i_2594_;
				    int i_2596_ = ((i_2590_ & 0xff00ff)
						   + (i_2594_ & 0xff00ff));
				    i_2594_
					= ((i_2596_ & 0x1000100)
					   + (i_2595_ - i_2596_ & 0x10000));
				    is[i_2548_]
					= (i_2595_ - i_2594_
					   | i_2594_ - (i_2594_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_2597_ = aByteArray11407[i_2547_];
				int i_2598_ = (i_2597_ > 0
					       ? anIntArray11408[i_2597_] : 0);
				int i_2599_ = anInt9011;
				int i_2600_ = i_2598_ + i_2599_;
				int i_2601_ = ((i_2598_ & 0xff00ff)
					       + (i_2599_ & 0xff00ff));
				int i_2602_
				    = ((i_2601_ & 0x1000100)
				       + (i_2600_ - i_2601_ & 0x10000));
				i_2602_
				    = i_2600_ - i_2602_ | i_2602_ - (i_2602_
								     >>> 8);
				if (i_2598_ == 0 && anInt9012 != 255) {
				    i_2598_ = i_2602_;
				    i_2602_ = is[i_2548_];
				    i_2602_
					= ((((i_2598_ & 0xff00ff) * anInt9012
					     + ((i_2602_ & 0xff00ff)
						* anInt9013))
					    & ~0xff00ff)
					   + (((i_2598_ & 0xff00) * anInt9012
					       + ((i_2602_ & 0xff00)
						  * anInt9013))
					      & 0xff0000)) >> 8;
				}
				is[i_2548_] = i_2602_;
			    } else if (i == 2) {
				int i_2603_ = aByteArray11407[i_2547_];
				if (i_2603_ != 0) {
				    int i_2604_
					= anIntArray11408[i_2603_ & 0xff];
				    int i_2605_
					= ((i_2604_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_2606_
					= ((i_2604_ & 0xff00) * anInt9012
					   & 0xff0000);
				    i_2604_ = (((i_2605_ | i_2606_) >>> 8)
					       + anInt9019);
				    int i_2607_ = is[i_2548_];
				    int i_2608_ = i_2604_ + i_2607_;
				    int i_2609_ = ((i_2604_ & 0xff00ff)
						   + (i_2607_ & 0xff00ff));
				    i_2607_
					= ((i_2609_ & 0x1000100)
					   + (i_2608_ - i_2609_ & 0x10000));
				    is[i_2548_]
					= (i_2608_ - i_2607_
					   | i_2607_ - (i_2607_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_2542_ += anInt9001;
			i_2543_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    }
	}
    }
    
    void method14509(int i, int i_2610_) {
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    if (anInt9001 == 0) {
		if (anInt9000 == 0) {
		    int i_2611_ = anInt8998;
		    while (i_2611_ < 0) {
			int i_2612_ = anInt8988;
			int i_2613_ = anInt9007;
			int i_2614_ = anInt9003;
			int i_2615_ = anInt8999;
			if (i_2613_ >= 0 && i_2614_ >= 0
			    && i_2613_ - (anInt8985 << 12) < 0
			    && i_2614_ - (anInt9002 << 12) < 0) {
			    for (/**/; i_2615_ < 0; i_2615_++) {
				int i_2616_ = ((i_2614_ >> 12) * anInt8985
					       + (i_2613_ >> 12));
				int i_2617_ = i_2612_++;
				if (i_2610_ == 0) {
				    if (i == 1)
					is[i_2617_]
					    = (anIntArray11408
					       [(aByteArray11407[i_2616_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_2618_
					    = (anIntArray11408
					       [(aByteArray11407[i_2616_]
						 & 0xff)]);
					int i_2619_
					    = ((i_2618_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_2620_
					    = ((i_2618_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_2621_
					    = ((i_2618_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_2617_] = (i_2619_ | i_2620_
						       | i_2621_) >>> 8;
				    } else if (i == 3) {
					int i_2622_
					    = (anIntArray11408
					       [(aByteArray11407[i_2616_]
						 & 0xff)]);
					int i_2623_ = anInt9011;
					int i_2624_ = i_2622_ + i_2623_;
					int i_2625_ = ((i_2622_ & 0xff00ff)
						       + (i_2623_ & 0xff00ff));
					int i_2626_ = ((i_2625_ & 0x1000100)
						       + (i_2624_ - i_2625_
							  & 0x10000));
					is[i_2617_]
					    = (i_2624_ - i_2626_
					       | i_2626_ - (i_2626_ >>> 8));
				    } else if (i == 2) {
					int i_2627_
					    = (anIntArray11408
					       [(aByteArray11407[i_2616_]
						 & 0xff)]);
					int i_2628_
					    = ((i_2627_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_2629_
					    = ((i_2627_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_2617_] = ((i_2628_ | i_2629_)
						       >>> 8) + anInt9019;
				    } else
					throw new IllegalArgumentException();
				} else if (i_2610_ == 1) {
				    if (i == 1) {
					int i_2630_ = aByteArray11407[i_2616_];
					if (i_2630_ != 0)
					    is[i_2617_] = (anIntArray11408
							   [i_2630_ & 0xff]);
				    } else if (i == 0) {
					int i_2631_ = aByteArray11407[i_2616_];
					if (i_2631_ != 0) {
					    int i_2632_ = (anIntArray11408
							   [i_2631_ & 0xff]);
					    if ((anInt9011 & 0xffffff)
						== 16777215) {
						int i_2633_ = anInt9011 >>> 24;
						int i_2634_ = 256 - i_2633_;
						int i_2635_ = is[i_2617_];
						is[i_2617_]
						    = (((((i_2632_ & 0xff00ff)
							  * i_2633_)
							 + ((i_2635_
							     & 0xff00ff)
							    * i_2634_))
							& ~0xff00ff)
						       + ((((i_2632_ & 0xff00)
							    * i_2633_)
							   + ((i_2635_
							       & 0xff00)
							      * i_2634_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9012 != 255) {
						int i_2636_
						    = (((i_2632_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_2637_
						    = (((i_2632_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_2638_
						    = (((i_2632_ & 0xff)
							* anInt9018)
						       & 0xff00);
						i_2632_ = (i_2636_ | i_2637_
							   | i_2638_) >>> 8;
						int i_2639_ = is[i_2617_];
						is[i_2617_]
						    = (((((i_2632_ & 0xff00ff)
							  * anInt9012)
							 + ((i_2639_
							     & 0xff00ff)
							    * anInt9013))
							& ~0xff00ff)
						       + ((((i_2632_ & 0xff00)
							    * anInt9012)
							   + ((i_2639_
							       & 0xff00)
							      * anInt9013))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2640_
						    = (((i_2632_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_2641_
						    = (((i_2632_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_2642_
						    = (((i_2632_ & 0xff)
							* anInt9018)
						       & 0xff00);
						is[i_2617_]
						    = (i_2640_ | i_2641_
						       | i_2642_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2643_
					    = aByteArray11407[i_2616_];
					int i_2644_
					    = (i_2643_ > 0
					       ? anIntArray11408[i_2643_] : 0);
					int i_2645_ = anInt9011;
					int i_2646_ = i_2644_ + i_2645_;
					int i_2647_ = ((i_2644_ & 0xff00ff)
						       + (i_2645_ & 0xff00ff));
					int i_2648_ = ((i_2647_ & 0x1000100)
						       + (i_2646_ - i_2647_
							  & 0x10000));
					i_2648_
					    = (i_2646_ - i_2648_
					       | i_2648_ - (i_2648_ >>> 8));
					if (i_2644_ == 0 && anInt9012 != 255) {
					    i_2644_ = i_2648_;
					    i_2648_ = is[i_2617_];
					    i_2648_
						= (((((i_2644_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2648_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2644_ & 0xff00)
							* anInt9012)
						       + ((i_2648_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_2617_] = i_2648_;
				    } else if (i == 2) {
					int i_2649_ = aByteArray11407[i_2616_];
					if (i_2649_ != 0) {
					    int i_2650_ = (anIntArray11408
							   [i_2649_ & 0xff]);
					    int i_2651_
						= (((i_2650_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_2652_ = (((i_2650_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    is[i_2617_++]
						= (((i_2651_ | i_2652_) >>> 8)
						   + anInt9019);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_2610_ == 2) {
				    if (i == 1) {
					int i_2653_ = aByteArray11407[i_2616_];
					if (i_2653_ != 0) {
					    int i_2654_ = (anIntArray11408
							   [i_2653_ & 0xff]);
					    int i_2655_ = is[i_2617_];
					    int i_2656_ = i_2654_ + i_2655_;
					    int i_2657_
						= ((i_2654_ & 0xff00ff)
						   + (i_2655_ & 0xff00ff));
					    i_2655_ = ((i_2657_ & 0x1000100)
						       + (i_2656_ - i_2657_
							  & 0x10000));
					    is[i_2617_]
						= (i_2656_ - i_2655_
						   | i_2655_ - (i_2655_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2658_ = aByteArray11407[i_2616_];
					if (i_2658_ != 0) {
					    int i_2659_ = (anIntArray11408
							   [i_2658_ & 0xff]);
					    int i_2660_
						= (((i_2659_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_2661_ = (((i_2659_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_2662_
						= ((i_2659_ & 0xff) * anInt9018
						   & 0xff00);
					    i_2659_ = (i_2660_ | i_2661_
						       | i_2662_) >>> 8;
					    int i_2663_ = is[i_2617_];
					    int i_2664_ = i_2659_ + i_2663_;
					    int i_2665_
						= ((i_2659_ & 0xff00ff)
						   + (i_2663_ & 0xff00ff));
					    i_2663_ = ((i_2665_ & 0x1000100)
						       + (i_2664_ - i_2665_
							  & 0x10000));
					    is[i_2617_]
						= (i_2664_ - i_2663_
						   | i_2663_ - (i_2663_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2666_
					    = aByteArray11407[i_2616_];
					int i_2667_
					    = (i_2666_ > 0
					       ? anIntArray11408[i_2666_] : 0);
					int i_2668_ = anInt9011;
					int i_2669_ = i_2667_ + i_2668_;
					int i_2670_ = ((i_2667_ & 0xff00ff)
						       + (i_2668_ & 0xff00ff));
					int i_2671_ = ((i_2670_ & 0x1000100)
						       + (i_2669_ - i_2670_
							  & 0x10000));
					i_2671_
					    = (i_2669_ - i_2671_
					       | i_2671_ - (i_2671_ >>> 8));
					if (i_2667_ == 0 && anInt9012 != 255) {
					    i_2667_ = i_2671_;
					    i_2671_ = is[i_2617_];
					    i_2671_
						= (((((i_2667_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2671_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2667_ & 0xff00)
							* anInt9012)
						       + ((i_2671_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_2617_] = i_2671_;
				    } else if (i == 2) {
					int i_2672_ = aByteArray11407[i_2616_];
					if (i_2672_ != 0) {
					    int i_2673_ = (anIntArray11408
							   [i_2672_ & 0xff]);
					    int i_2674_
						= (((i_2673_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_2675_ = (((i_2673_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    i_2673_ = ((i_2674_ | i_2675_)
						       >>> 8) + anInt9019;
					    int i_2676_ = is[i_2617_];
					    int i_2677_ = i_2673_ + i_2676_;
					    int i_2678_
						= ((i_2673_ & 0xff00ff)
						   + (i_2676_ & 0xff00ff));
					    i_2676_ = ((i_2678_ & 0x1000100)
						       + (i_2677_ - i_2678_
							  & 0x10000));
					    is[i_2617_]
						= (i_2677_ - i_2676_
						   | i_2676_ - (i_2676_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
			    }
			}
			i_2611_++;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_2679_ = anInt8998;
		    while (i_2679_ < 0) {
			int i_2680_ = anInt8988;
			int i_2681_ = anInt9007;
			int i_2682_ = anInt9003 + anInt9010;
			int i_2683_ = anInt8999;
			if (i_2681_ >= 0 && i_2681_ - (anInt8985 << 12) < 0) {
			    int i_2684_;
			    if ((i_2684_ = i_2682_ - (anInt9002 << 12)) >= 0) {
				i_2684_ = (anInt9000 - i_2684_) / anInt9000;
				i_2683_ += i_2684_;
				i_2682_ += anInt9000 * i_2684_;
				i_2680_ += i_2684_;
			    }
			    if ((i_2684_ = (i_2682_ - anInt9000) / anInt9000)
				> i_2683_)
				i_2683_ = i_2684_;
			    for (/**/; i_2683_ < 0; i_2683_++) {
				int i_2685_ = ((i_2682_ >> 12) * anInt8985
					       + (i_2681_ >> 12));
				int i_2686_ = i_2680_++;
				if (i_2610_ == 0) {
				    if (i == 1)
					is[i_2686_]
					    = (anIntArray11408
					       [(aByteArray11407[i_2685_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_2687_
					    = (anIntArray11408
					       [(aByteArray11407[i_2685_]
						 & 0xff)]);
					int i_2688_
					    = ((i_2687_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_2689_
					    = ((i_2687_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_2690_
					    = ((i_2687_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_2686_] = (i_2688_ | i_2689_
						       | i_2690_) >>> 8;
				    } else if (i == 3) {
					int i_2691_
					    = (anIntArray11408
					       [(aByteArray11407[i_2685_]
						 & 0xff)]);
					int i_2692_ = anInt9011;
					int i_2693_ = i_2691_ + i_2692_;
					int i_2694_ = ((i_2691_ & 0xff00ff)
						       + (i_2692_ & 0xff00ff));
					int i_2695_ = ((i_2694_ & 0x1000100)
						       + (i_2693_ - i_2694_
							  & 0x10000));
					is[i_2686_]
					    = (i_2693_ - i_2695_
					       | i_2695_ - (i_2695_ >>> 8));
				    } else if (i == 2) {
					int i_2696_
					    = (anIntArray11408
					       [(aByteArray11407[i_2685_]
						 & 0xff)]);
					int i_2697_
					    = ((i_2696_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_2698_
					    = ((i_2696_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_2686_] = ((i_2697_ | i_2698_)
						       >>> 8) + anInt9019;
				    } else
					throw new IllegalArgumentException();
				} else if (i_2610_ == 1) {
				    if (i == 1) {
					int i_2699_ = aByteArray11407[i_2685_];
					if (i_2699_ != 0)
					    is[i_2686_] = (anIntArray11408
							   [i_2699_ & 0xff]);
				    } else if (i == 0) {
					int i_2700_ = aByteArray11407[i_2685_];
					if (i_2700_ != 0) {
					    int i_2701_ = (anIntArray11408
							   [i_2700_ & 0xff]);
					    if ((anInt9011 & 0xffffff)
						== 16777215) {
						int i_2702_ = anInt9011 >>> 24;
						int i_2703_ = 256 - i_2702_;
						int i_2704_ = is[i_2686_];
						is[i_2686_]
						    = (((((i_2701_ & 0xff00ff)
							  * i_2702_)
							 + ((i_2704_
							     & 0xff00ff)
							    * i_2703_))
							& ~0xff00ff)
						       + ((((i_2701_ & 0xff00)
							    * i_2702_)
							   + ((i_2704_
							       & 0xff00)
							      * i_2703_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9012 != 255) {
						int i_2705_
						    = (((i_2701_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_2706_
						    = (((i_2701_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_2707_
						    = (((i_2701_ & 0xff)
							* anInt9018)
						       & 0xff00);
						i_2701_ = (i_2705_ | i_2706_
							   | i_2707_) >>> 8;
						int i_2708_ = is[i_2686_];
						is[i_2686_]
						    = (((((i_2701_ & 0xff00ff)
							  * anInt9012)
							 + ((i_2708_
							     & 0xff00ff)
							    * anInt9013))
							& ~0xff00ff)
						       + ((((i_2701_ & 0xff00)
							    * anInt9012)
							   + ((i_2708_
							       & 0xff00)
							      * anInt9013))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2709_
						    = (((i_2701_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_2710_
						    = (((i_2701_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_2711_
						    = (((i_2701_ & 0xff)
							* anInt9018)
						       & 0xff00);
						is[i_2686_]
						    = (i_2709_ | i_2710_
						       | i_2711_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2712_
					    = aByteArray11407[i_2685_];
					int i_2713_
					    = (i_2712_ > 0
					       ? anIntArray11408[i_2712_] : 0);
					int i_2714_ = anInt9011;
					int i_2715_ = i_2713_ + i_2714_;
					int i_2716_ = ((i_2713_ & 0xff00ff)
						       + (i_2714_ & 0xff00ff));
					int i_2717_ = ((i_2716_ & 0x1000100)
						       + (i_2715_ - i_2716_
							  & 0x10000));
					i_2717_
					    = (i_2715_ - i_2717_
					       | i_2717_ - (i_2717_ >>> 8));
					if (i_2713_ == 0 && anInt9012 != 255) {
					    i_2713_ = i_2717_;
					    i_2717_ = is[i_2686_];
					    i_2717_
						= (((((i_2713_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2717_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2713_ & 0xff00)
							* anInt9012)
						       + ((i_2717_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_2686_] = i_2717_;
				    } else if (i == 2) {
					int i_2718_ = aByteArray11407[i_2685_];
					if (i_2718_ != 0) {
					    int i_2719_ = (anIntArray11408
							   [i_2718_ & 0xff]);
					    int i_2720_
						= (((i_2719_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_2721_ = (((i_2719_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    is[i_2686_++]
						= (((i_2720_ | i_2721_) >>> 8)
						   + anInt9019);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_2610_ == 2) {
				    if (i == 1) {
					int i_2722_ = aByteArray11407[i_2685_];
					if (i_2722_ != 0) {
					    int i_2723_ = (anIntArray11408
							   [i_2722_ & 0xff]);
					    int i_2724_ = is[i_2686_];
					    int i_2725_ = i_2723_ + i_2724_;
					    int i_2726_
						= ((i_2723_ & 0xff00ff)
						   + (i_2724_ & 0xff00ff));
					    i_2724_ = ((i_2726_ & 0x1000100)
						       + (i_2725_ - i_2726_
							  & 0x10000));
					    is[i_2686_]
						= (i_2725_ - i_2724_
						   | i_2724_ - (i_2724_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2727_ = aByteArray11407[i_2685_];
					if (i_2727_ != 0) {
					    int i_2728_ = (anIntArray11408
							   [i_2727_ & 0xff]);
					    int i_2729_
						= (((i_2728_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_2730_ = (((i_2728_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_2731_
						= ((i_2728_ & 0xff) * anInt9018
						   & 0xff00);
					    i_2728_ = (i_2729_ | i_2730_
						       | i_2731_) >>> 8;
					    int i_2732_ = is[i_2686_];
					    int i_2733_ = i_2728_ + i_2732_;
					    int i_2734_
						= ((i_2728_ & 0xff00ff)
						   + (i_2732_ & 0xff00ff));
					    i_2732_ = ((i_2734_ & 0x1000100)
						       + (i_2733_ - i_2734_
							  & 0x10000));
					    is[i_2686_]
						= (i_2733_ - i_2732_
						   | i_2732_ - (i_2732_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2735_
					    = aByteArray11407[i_2685_];
					int i_2736_
					    = (i_2735_ > 0
					       ? anIntArray11408[i_2735_] : 0);
					int i_2737_ = anInt9011;
					int i_2738_ = i_2736_ + i_2737_;
					int i_2739_ = ((i_2736_ & 0xff00ff)
						       + (i_2737_ & 0xff00ff));
					int i_2740_ = ((i_2739_ & 0x1000100)
						       + (i_2738_ - i_2739_
							  & 0x10000));
					i_2740_
					    = (i_2738_ - i_2740_
					       | i_2740_ - (i_2740_ >>> 8));
					if (i_2736_ == 0 && anInt9012 != 255) {
					    i_2736_ = i_2740_;
					    i_2740_ = is[i_2686_];
					    i_2740_
						= (((((i_2736_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2740_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2736_ & 0xff00)
							* anInt9012)
						       + ((i_2740_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_2686_] = i_2740_;
				    } else if (i == 2) {
					int i_2741_ = aByteArray11407[i_2685_];
					if (i_2741_ != 0) {
					    int i_2742_ = (anIntArray11408
							   [i_2741_ & 0xff]);
					    int i_2743_
						= (((i_2742_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_2744_ = (((i_2742_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    i_2742_ = ((i_2743_ | i_2744_)
						       >>> 8) + anInt9019;
					    int i_2745_ = is[i_2686_];
					    int i_2746_ = i_2742_ + i_2745_;
					    int i_2747_
						= ((i_2742_ & 0xff00ff)
						   + (i_2745_ & 0xff00ff));
					    i_2745_ = ((i_2747_ & 0x1000100)
						       + (i_2746_ - i_2747_
							  & 0x10000));
					    is[i_2686_]
						= (i_2746_ - i_2745_
						   | i_2745_ - (i_2745_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_2682_ += anInt9000;
			    }
			}
			i_2679_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_2748_ = anInt8998;
		    while (i_2748_ < 0) {
			int i_2749_ = anInt8988;
			int i_2750_ = anInt9007;
			int i_2751_ = anInt9003 + anInt9010;
			int i_2752_ = anInt8999;
			if (i_2750_ >= 0 && i_2750_ - (anInt8985 << 12) < 0) {
			    if (i_2751_ < 0) {
				int i_2753_
				    = (anInt9000 - 1 - i_2751_) / anInt9000;
				i_2752_ += i_2753_;
				i_2751_ += anInt9000 * i_2753_;
				i_2749_ += i_2753_;
			    }
			    int i_2754_;
			    if ((i_2754_ = (1 + i_2751_ - (anInt9002 << 12)
					    - anInt9000) / anInt9000)
				> i_2752_)
				i_2752_ = i_2754_;
			    for (/**/; i_2752_ < 0; i_2752_++) {
				int i_2755_ = ((i_2751_ >> 12) * anInt8985
					       + (i_2750_ >> 12));
				int i_2756_ = i_2749_++;
				if (i_2610_ == 0) {
				    if (i == 1)
					is[i_2756_]
					    = (anIntArray11408
					       [(aByteArray11407[i_2755_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_2757_
					    = (anIntArray11408
					       [(aByteArray11407[i_2755_]
						 & 0xff)]);
					int i_2758_
					    = ((i_2757_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_2759_
					    = ((i_2757_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_2760_
					    = ((i_2757_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_2756_] = (i_2758_ | i_2759_
						       | i_2760_) >>> 8;
				    } else if (i == 3) {
					int i_2761_
					    = (anIntArray11408
					       [(aByteArray11407[i_2755_]
						 & 0xff)]);
					int i_2762_ = anInt9011;
					int i_2763_ = i_2761_ + i_2762_;
					int i_2764_ = ((i_2761_ & 0xff00ff)
						       + (i_2762_ & 0xff00ff));
					int i_2765_ = ((i_2764_ & 0x1000100)
						       + (i_2763_ - i_2764_
							  & 0x10000));
					is[i_2756_]
					    = (i_2763_ - i_2765_
					       | i_2765_ - (i_2765_ >>> 8));
				    } else if (i == 2) {
					int i_2766_
					    = (anIntArray11408
					       [(aByteArray11407[i_2755_]
						 & 0xff)]);
					int i_2767_
					    = ((i_2766_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_2768_
					    = ((i_2766_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_2756_] = ((i_2767_ | i_2768_)
						       >>> 8) + anInt9019;
				    } else
					throw new IllegalArgumentException();
				} else if (i_2610_ == 1) {
				    if (i == 1) {
					int i_2769_ = aByteArray11407[i_2755_];
					if (i_2769_ != 0)
					    is[i_2756_] = (anIntArray11408
							   [i_2769_ & 0xff]);
				    } else if (i == 0) {
					int i_2770_ = aByteArray11407[i_2755_];
					if (i_2770_ != 0) {
					    int i_2771_ = (anIntArray11408
							   [i_2770_ & 0xff]);
					    if ((anInt9011 & 0xffffff)
						== 16777215) {
						int i_2772_ = anInt9011 >>> 24;
						int i_2773_ = 256 - i_2772_;
						int i_2774_ = is[i_2756_];
						is[i_2756_]
						    = (((((i_2771_ & 0xff00ff)
							  * i_2772_)
							 + ((i_2774_
							     & 0xff00ff)
							    * i_2773_))
							& ~0xff00ff)
						       + ((((i_2771_ & 0xff00)
							    * i_2772_)
							   + ((i_2774_
							       & 0xff00)
							      * i_2773_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9012 != 255) {
						int i_2775_
						    = (((i_2771_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_2776_
						    = (((i_2771_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_2777_
						    = (((i_2771_ & 0xff)
							* anInt9018)
						       & 0xff00);
						i_2771_ = (i_2775_ | i_2776_
							   | i_2777_) >>> 8;
						int i_2778_ = is[i_2756_];
						is[i_2756_]
						    = (((((i_2771_ & 0xff00ff)
							  * anInt9012)
							 + ((i_2778_
							     & 0xff00ff)
							    * anInt9013))
							& ~0xff00ff)
						       + ((((i_2771_ & 0xff00)
							    * anInt9012)
							   + ((i_2778_
							       & 0xff00)
							      * anInt9013))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2779_
						    = (((i_2771_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_2780_
						    = (((i_2771_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_2781_
						    = (((i_2771_ & 0xff)
							* anInt9018)
						       & 0xff00);
						is[i_2756_]
						    = (i_2779_ | i_2780_
						       | i_2781_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2782_
					    = aByteArray11407[i_2755_];
					int i_2783_
					    = (i_2782_ > 0
					       ? anIntArray11408[i_2782_] : 0);
					int i_2784_ = anInt9011;
					int i_2785_ = i_2783_ + i_2784_;
					int i_2786_ = ((i_2783_ & 0xff00ff)
						       + (i_2784_ & 0xff00ff));
					int i_2787_ = ((i_2786_ & 0x1000100)
						       + (i_2785_ - i_2786_
							  & 0x10000));
					i_2787_
					    = (i_2785_ - i_2787_
					       | i_2787_ - (i_2787_ >>> 8));
					if (i_2783_ == 0 && anInt9012 != 255) {
					    i_2783_ = i_2787_;
					    i_2787_ = is[i_2756_];
					    i_2787_
						= (((((i_2783_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2787_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2783_ & 0xff00)
							* anInt9012)
						       + ((i_2787_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_2756_] = i_2787_;
				    } else if (i == 2) {
					int i_2788_ = aByteArray11407[i_2755_];
					if (i_2788_ != 0) {
					    int i_2789_ = (anIntArray11408
							   [i_2788_ & 0xff]);
					    int i_2790_
						= (((i_2789_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_2791_ = (((i_2789_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    is[i_2756_++]
						= (((i_2790_ | i_2791_) >>> 8)
						   + anInt9019);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_2610_ == 2) {
				    if (i == 1) {
					int i_2792_ = aByteArray11407[i_2755_];
					if (i_2792_ != 0) {
					    int i_2793_ = (anIntArray11408
							   [i_2792_ & 0xff]);
					    int i_2794_ = is[i_2756_];
					    int i_2795_ = i_2793_ + i_2794_;
					    int i_2796_
						= ((i_2793_ & 0xff00ff)
						   + (i_2794_ & 0xff00ff));
					    i_2794_ = ((i_2796_ & 0x1000100)
						       + (i_2795_ - i_2796_
							  & 0x10000));
					    is[i_2756_]
						= (i_2795_ - i_2794_
						   | i_2794_ - (i_2794_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2797_ = aByteArray11407[i_2755_];
					if (i_2797_ != 0) {
					    int i_2798_ = (anIntArray11408
							   [i_2797_ & 0xff]);
					    int i_2799_
						= (((i_2798_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_2800_ = (((i_2798_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_2801_
						= ((i_2798_ & 0xff) * anInt9018
						   & 0xff00);
					    i_2798_ = (i_2799_ | i_2800_
						       | i_2801_) >>> 8;
					    int i_2802_ = is[i_2756_];
					    int i_2803_ = i_2798_ + i_2802_;
					    int i_2804_
						= ((i_2798_ & 0xff00ff)
						   + (i_2802_ & 0xff00ff));
					    i_2802_ = ((i_2804_ & 0x1000100)
						       + (i_2803_ - i_2804_
							  & 0x10000));
					    is[i_2756_]
						= (i_2803_ - i_2802_
						   | i_2802_ - (i_2802_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2805_
					    = aByteArray11407[i_2755_];
					int i_2806_
					    = (i_2805_ > 0
					       ? anIntArray11408[i_2805_] : 0);
					int i_2807_ = anInt9011;
					int i_2808_ = i_2806_ + i_2807_;
					int i_2809_ = ((i_2806_ & 0xff00ff)
						       + (i_2807_ & 0xff00ff));
					int i_2810_ = ((i_2809_ & 0x1000100)
						       + (i_2808_ - i_2809_
							  & 0x10000));
					i_2810_
					    = (i_2808_ - i_2810_
					       | i_2810_ - (i_2810_ >>> 8));
					if (i_2806_ == 0 && anInt9012 != 255) {
					    i_2806_ = i_2810_;
					    i_2810_ = is[i_2756_];
					    i_2810_
						= (((((i_2806_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2810_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2806_ & 0xff00)
							* anInt9012)
						       + ((i_2810_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_2756_] = i_2810_;
				    } else if (i == 2) {
					int i_2811_ = aByteArray11407[i_2755_];
					if (i_2811_ != 0) {
					    int i_2812_ = (anIntArray11408
							   [i_2811_ & 0xff]);
					    int i_2813_
						= (((i_2812_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_2814_ = (((i_2812_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    i_2812_ = ((i_2813_ | i_2814_)
						       >>> 8) + anInt9019;
					    int i_2815_ = is[i_2756_];
					    int i_2816_ = i_2812_ + i_2815_;
					    int i_2817_
						= ((i_2812_ & 0xff00ff)
						   + (i_2815_ & 0xff00ff));
					    i_2815_ = ((i_2817_ & 0x1000100)
						       + (i_2816_ - i_2817_
							  & 0x10000));
					    is[i_2756_]
						= (i_2816_ - i_2815_
						   | i_2815_ - (i_2815_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_2751_ += anInt9000;
			    }
			}
			i_2748_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9001 < 0) {
		if (anInt9000 == 0) {
		    int i_2818_ = anInt8998;
		    while (i_2818_ < 0) {
			int i_2819_ = anInt8988;
			int i_2820_ = anInt9007 + anInt9009;
			int i_2821_ = anInt9003;
			int i_2822_ = anInt8999;
			if (i_2821_ >= 0 && i_2821_ - (anInt9002 << 12) < 0) {
			    int i_2823_;
			    if ((i_2823_ = i_2820_ - (anInt8985 << 12)) >= 0) {
				i_2823_ = (anInt9001 - i_2823_) / anInt9001;
				i_2822_ += i_2823_;
				i_2820_ += anInt9001 * i_2823_;
				i_2819_ += i_2823_;
			    }
			    if ((i_2823_ = (i_2820_ - anInt9001) / anInt9001)
				> i_2822_)
				i_2822_ = i_2823_;
			    for (/**/; i_2822_ < 0; i_2822_++) {
				int i_2824_ = ((i_2821_ >> 12) * anInt8985
					       + (i_2820_ >> 12));
				int i_2825_ = i_2819_++;
				if (i_2610_ == 0) {
				    if (i == 1)
					is[i_2825_]
					    = (anIntArray11408
					       [(aByteArray11407[i_2824_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_2826_
					    = (anIntArray11408
					       [(aByteArray11407[i_2824_]
						 & 0xff)]);
					int i_2827_
					    = ((i_2826_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_2828_
					    = ((i_2826_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_2829_
					    = ((i_2826_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_2825_] = (i_2827_ | i_2828_
						       | i_2829_) >>> 8;
				    } else if (i == 3) {
					int i_2830_
					    = (anIntArray11408
					       [(aByteArray11407[i_2824_]
						 & 0xff)]);
					int i_2831_ = anInt9011;
					int i_2832_ = i_2830_ + i_2831_;
					int i_2833_ = ((i_2830_ & 0xff00ff)
						       + (i_2831_ & 0xff00ff));
					int i_2834_ = ((i_2833_ & 0x1000100)
						       + (i_2832_ - i_2833_
							  & 0x10000));
					is[i_2825_]
					    = (i_2832_ - i_2834_
					       | i_2834_ - (i_2834_ >>> 8));
				    } else if (i == 2) {
					int i_2835_
					    = (anIntArray11408
					       [(aByteArray11407[i_2824_]
						 & 0xff)]);
					int i_2836_
					    = ((i_2835_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_2837_
					    = ((i_2835_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_2825_] = ((i_2836_ | i_2837_)
						       >>> 8) + anInt9019;
				    } else
					throw new IllegalArgumentException();
				} else if (i_2610_ == 1) {
				    if (i == 1) {
					int i_2838_ = aByteArray11407[i_2824_];
					if (i_2838_ != 0)
					    is[i_2825_] = (anIntArray11408
							   [i_2838_ & 0xff]);
				    } else if (i == 0) {
					int i_2839_ = aByteArray11407[i_2824_];
					if (i_2839_ != 0) {
					    int i_2840_ = (anIntArray11408
							   [i_2839_ & 0xff]);
					    if ((anInt9011 & 0xffffff)
						== 16777215) {
						int i_2841_ = anInt9011 >>> 24;
						int i_2842_ = 256 - i_2841_;
						int i_2843_ = is[i_2825_];
						is[i_2825_]
						    = (((((i_2840_ & 0xff00ff)
							  * i_2841_)
							 + ((i_2843_
							     & 0xff00ff)
							    * i_2842_))
							& ~0xff00ff)
						       + ((((i_2840_ & 0xff00)
							    * i_2841_)
							   + ((i_2843_
							       & 0xff00)
							      * i_2842_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9012 != 255) {
						int i_2844_
						    = (((i_2840_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_2845_
						    = (((i_2840_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_2846_
						    = (((i_2840_ & 0xff)
							* anInt9018)
						       & 0xff00);
						i_2840_ = (i_2844_ | i_2845_
							   | i_2846_) >>> 8;
						int i_2847_ = is[i_2825_];
						is[i_2825_]
						    = (((((i_2840_ & 0xff00ff)
							  * anInt9012)
							 + ((i_2847_
							     & 0xff00ff)
							    * anInt9013))
							& ~0xff00ff)
						       + ((((i_2840_ & 0xff00)
							    * anInt9012)
							   + ((i_2847_
							       & 0xff00)
							      * anInt9013))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2848_
						    = (((i_2840_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_2849_
						    = (((i_2840_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_2850_
						    = (((i_2840_ & 0xff)
							* anInt9018)
						       & 0xff00);
						is[i_2825_]
						    = (i_2848_ | i_2849_
						       | i_2850_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2851_
					    = aByteArray11407[i_2824_];
					int i_2852_
					    = (i_2851_ > 0
					       ? anIntArray11408[i_2851_] : 0);
					int i_2853_ = anInt9011;
					int i_2854_ = i_2852_ + i_2853_;
					int i_2855_ = ((i_2852_ & 0xff00ff)
						       + (i_2853_ & 0xff00ff));
					int i_2856_ = ((i_2855_ & 0x1000100)
						       + (i_2854_ - i_2855_
							  & 0x10000));
					i_2856_
					    = (i_2854_ - i_2856_
					       | i_2856_ - (i_2856_ >>> 8));
					if (i_2852_ == 0 && anInt9012 != 255) {
					    i_2852_ = i_2856_;
					    i_2856_ = is[i_2825_];
					    i_2856_
						= (((((i_2852_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2856_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2852_ & 0xff00)
							* anInt9012)
						       + ((i_2856_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_2825_] = i_2856_;
				    } else if (i == 2) {
					int i_2857_ = aByteArray11407[i_2824_];
					if (i_2857_ != 0) {
					    int i_2858_ = (anIntArray11408
							   [i_2857_ & 0xff]);
					    int i_2859_
						= (((i_2858_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_2860_ = (((i_2858_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    is[i_2825_++]
						= (((i_2859_ | i_2860_) >>> 8)
						   + anInt9019);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_2610_ == 2) {
				    if (i == 1) {
					int i_2861_ = aByteArray11407[i_2824_];
					if (i_2861_ != 0) {
					    int i_2862_ = (anIntArray11408
							   [i_2861_ & 0xff]);
					    int i_2863_ = is[i_2825_];
					    int i_2864_ = i_2862_ + i_2863_;
					    int i_2865_
						= ((i_2862_ & 0xff00ff)
						   + (i_2863_ & 0xff00ff));
					    i_2863_ = ((i_2865_ & 0x1000100)
						       + (i_2864_ - i_2865_
							  & 0x10000));
					    is[i_2825_]
						= (i_2864_ - i_2863_
						   | i_2863_ - (i_2863_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2866_ = aByteArray11407[i_2824_];
					if (i_2866_ != 0) {
					    int i_2867_ = (anIntArray11408
							   [i_2866_ & 0xff]);
					    int i_2868_
						= (((i_2867_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_2869_ = (((i_2867_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_2870_
						= ((i_2867_ & 0xff) * anInt9018
						   & 0xff00);
					    i_2867_ = (i_2868_ | i_2869_
						       | i_2870_) >>> 8;
					    int i_2871_ = is[i_2825_];
					    int i_2872_ = i_2867_ + i_2871_;
					    int i_2873_
						= ((i_2867_ & 0xff00ff)
						   + (i_2871_ & 0xff00ff));
					    i_2871_ = ((i_2873_ & 0x1000100)
						       + (i_2872_ - i_2873_
							  & 0x10000));
					    is[i_2825_]
						= (i_2872_ - i_2871_
						   | i_2871_ - (i_2871_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2874_
					    = aByteArray11407[i_2824_];
					int i_2875_
					    = (i_2874_ > 0
					       ? anIntArray11408[i_2874_] : 0);
					int i_2876_ = anInt9011;
					int i_2877_ = i_2875_ + i_2876_;
					int i_2878_ = ((i_2875_ & 0xff00ff)
						       + (i_2876_ & 0xff00ff));
					int i_2879_ = ((i_2878_ & 0x1000100)
						       + (i_2877_ - i_2878_
							  & 0x10000));
					i_2879_
					    = (i_2877_ - i_2879_
					       | i_2879_ - (i_2879_ >>> 8));
					if (i_2875_ == 0 && anInt9012 != 255) {
					    i_2875_ = i_2879_;
					    i_2879_ = is[i_2825_];
					    i_2879_
						= (((((i_2875_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2879_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2875_ & 0xff00)
							* anInt9012)
						       + ((i_2879_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_2825_] = i_2879_;
				    } else if (i == 2) {
					int i_2880_ = aByteArray11407[i_2824_];
					if (i_2880_ != 0) {
					    int i_2881_ = (anIntArray11408
							   [i_2880_ & 0xff]);
					    int i_2882_
						= (((i_2881_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_2883_ = (((i_2881_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    i_2881_ = ((i_2882_ | i_2883_)
						       >>> 8) + anInt9019;
					    int i_2884_ = is[i_2825_];
					    int i_2885_ = i_2881_ + i_2884_;
					    int i_2886_
						= ((i_2881_ & 0xff00ff)
						   + (i_2884_ & 0xff00ff));
					    i_2884_ = ((i_2886_ & 0x1000100)
						       + (i_2885_ - i_2886_
							  & 0x10000));
					    is[i_2825_]
						= (i_2885_ - i_2884_
						   | i_2884_ - (i_2884_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_2820_ += anInt9001;
			    }
			}
			i_2818_++;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_2887_ = anInt8998;
		    while (i_2887_ < 0) {
			int i_2888_ = anInt8988;
			int i_2889_ = anInt9007 + anInt9009;
			int i_2890_ = anInt9003 + anInt9010;
			int i_2891_ = anInt8999;
			int i_2892_;
			if ((i_2892_ = i_2889_ - (anInt8985 << 12)) >= 0) {
			    i_2892_ = (anInt9001 - i_2892_) / anInt9001;
			    i_2891_ += i_2892_;
			    i_2889_ += anInt9001 * i_2892_;
			    i_2890_ += anInt9000 * i_2892_;
			    i_2888_ += i_2892_;
			}
			if ((i_2892_ = (i_2889_ - anInt9001) / anInt9001)
			    > i_2891_)
			    i_2891_ = i_2892_;
			if ((i_2892_ = i_2890_ - (anInt9002 << 12)) >= 0) {
			    i_2892_ = (anInt9000 - i_2892_) / anInt9000;
			    i_2891_ += i_2892_;
			    i_2889_ += anInt9001 * i_2892_;
			    i_2890_ += anInt9000 * i_2892_;
			    i_2888_ += i_2892_;
			}
			if ((i_2892_ = (i_2890_ - anInt9000) / anInt9000)
			    > i_2891_)
			    i_2891_ = i_2892_;
			for (/**/; i_2891_ < 0; i_2891_++) {
			    int i_2893_ = ((i_2890_ >> 12) * anInt8985
					   + (i_2889_ >> 12));
			    int i_2894_ = i_2888_++;
			    if (i_2610_ == 0) {
				if (i == 1)
				    is[i_2894_]
					= (anIntArray11408
					   [aByteArray11407[i_2893_] & 0xff]);
				else if (i == 0) {
				    int i_2895_
					= (anIntArray11408
					   [aByteArray11407[i_2893_] & 0xff]);
				    int i_2896_
					= ((i_2895_ & 0xff0000) * anInt9014
					   & ~0xffffff);
				    int i_2897_
					= ((i_2895_ & 0xff00) * anInt9015
					   & 0xff0000);
				    int i_2898_ = ((i_2895_ & 0xff) * anInt9018
						   & 0xff00);
				    is[i_2894_]
					= (i_2896_ | i_2897_ | i_2898_) >>> 8;
				} else if (i == 3) {
				    int i_2899_
					= (anIntArray11408
					   [aByteArray11407[i_2893_] & 0xff]);
				    int i_2900_ = anInt9011;
				    int i_2901_ = i_2899_ + i_2900_;
				    int i_2902_ = ((i_2899_ & 0xff00ff)
						   + (i_2900_ & 0xff00ff));
				    int i_2903_
					= ((i_2902_ & 0x1000100)
					   + (i_2901_ - i_2902_ & 0x10000));
				    is[i_2894_]
					= (i_2901_ - i_2903_
					   | i_2903_ - (i_2903_ >>> 8));
				} else if (i == 2) {
				    int i_2904_
					= (anIntArray11408
					   [aByteArray11407[i_2893_] & 0xff]);
				    int i_2905_
					= ((i_2904_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_2906_
					= ((i_2904_ & 0xff00) * anInt9012
					   & 0xff0000);
				    is[i_2894_] = (((i_2905_ | i_2906_) >>> 8)
						   + anInt9019);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2610_ == 1) {
				if (i == 1) {
				    int i_2907_ = aByteArray11407[i_2893_];
				    if (i_2907_ != 0)
					is[i_2894_]
					    = anIntArray11408[i_2907_ & 0xff];
				} else if (i == 0) {
				    int i_2908_ = aByteArray11407[i_2893_];
				    if (i_2908_ != 0) {
					int i_2909_
					    = anIntArray11408[i_2908_ & 0xff];
					if ((anInt9011 & 0xffffff)
					    == 16777215) {
					    int i_2910_ = anInt9011 >>> 24;
					    int i_2911_ = 256 - i_2910_;
					    int i_2912_ = is[i_2894_];
					    is[i_2894_]
						= (((((i_2909_ & 0xff00ff)
						      * i_2910_)
						     + ((i_2912_ & 0xff00ff)
							* i_2911_))
						    & ~0xff00ff)
						   + ((((i_2909_ & 0xff00)
							* i_2910_)
						       + ((i_2912_ & 0xff00)
							  * i_2911_))
						      & 0xff0000)) >> 8;
					} else if (anInt9012 != 255) {
					    int i_2913_
						= (((i_2909_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_2914_ = (((i_2909_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_2915_
						= ((i_2909_ & 0xff) * anInt9018
						   & 0xff00);
					    i_2909_ = (i_2913_ | i_2914_
						       | i_2915_) >>> 8;
					    int i_2916_ = is[i_2894_];
					    is[i_2894_]
						= (((((i_2909_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2916_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2909_ & 0xff00)
							* anInt9012)
						       + ((i_2916_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					} else {
					    int i_2917_
						= (((i_2909_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_2918_ = (((i_2909_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_2919_
						= ((i_2909_ & 0xff) * anInt9018
						   & 0xff00);
					    is[i_2894_] = (i_2917_ | i_2918_
							   | i_2919_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_2920_ = aByteArray11407[i_2893_];
				    int i_2921_
					= (i_2920_ > 0
					   ? anIntArray11408[i_2920_] : 0);
				    int i_2922_ = anInt9011;
				    int i_2923_ = i_2921_ + i_2922_;
				    int i_2924_ = ((i_2921_ & 0xff00ff)
						   + (i_2922_ & 0xff00ff));
				    int i_2925_
					= ((i_2924_ & 0x1000100)
					   + (i_2923_ - i_2924_ & 0x10000));
				    i_2925_ = (i_2923_ - i_2925_
					       | i_2925_ - (i_2925_ >>> 8));
				    if (i_2921_ == 0 && anInt9012 != 255) {
					i_2921_ = i_2925_;
					i_2925_ = is[i_2894_];
					i_2925_ = (((((i_2921_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2925_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2921_ & 0xff00)
							* anInt9012)
						       + ((i_2925_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2894_] = i_2925_;
				} else if (i == 2) {
				    int i_2926_ = aByteArray11407[i_2893_];
				    if (i_2926_ != 0) {
					int i_2927_
					    = anIntArray11408[i_2926_ & 0xff];
					int i_2928_
					    = ((i_2927_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_2929_
					    = ((i_2927_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_2894_++] = ((i_2928_ | i_2929_)
							 >>> 8) + anInt9019;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2610_ == 2) {
				if (i == 1) {
				    int i_2930_ = aByteArray11407[i_2893_];
				    if (i_2930_ != 0) {
					int i_2931_
					    = anIntArray11408[i_2930_ & 0xff];
					int i_2932_ = is[i_2894_];
					int i_2933_ = i_2931_ + i_2932_;
					int i_2934_ = ((i_2931_ & 0xff00ff)
						       + (i_2932_ & 0xff00ff));
					i_2932_ = ((i_2934_ & 0x1000100)
						   + (i_2933_ - i_2934_
						      & 0x10000));
					is[i_2894_]
					    = (i_2933_ - i_2932_
					       | i_2932_ - (i_2932_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_2935_ = aByteArray11407[i_2893_];
				    if (i_2935_ != 0) {
					int i_2936_
					    = anIntArray11408[i_2935_ & 0xff];
					int i_2937_
					    = ((i_2936_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_2938_
					    = ((i_2936_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_2939_
					    = ((i_2936_ & 0xff) * anInt9018
					       & 0xff00);
					i_2936_ = (i_2937_ | i_2938_
						   | i_2939_) >>> 8;
					int i_2940_ = is[i_2894_];
					int i_2941_ = i_2936_ + i_2940_;
					int i_2942_ = ((i_2936_ & 0xff00ff)
						       + (i_2940_ & 0xff00ff));
					i_2940_ = ((i_2942_ & 0x1000100)
						   + (i_2941_ - i_2942_
						      & 0x10000));
					is[i_2894_]
					    = (i_2941_ - i_2940_
					       | i_2940_ - (i_2940_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_2943_ = aByteArray11407[i_2893_];
				    int i_2944_
					= (i_2943_ > 0
					   ? anIntArray11408[i_2943_] : 0);
				    int i_2945_ = anInt9011;
				    int i_2946_ = i_2944_ + i_2945_;
				    int i_2947_ = ((i_2944_ & 0xff00ff)
						   + (i_2945_ & 0xff00ff));
				    int i_2948_
					= ((i_2947_ & 0x1000100)
					   + (i_2946_ - i_2947_ & 0x10000));
				    i_2948_ = (i_2946_ - i_2948_
					       | i_2948_ - (i_2948_ >>> 8));
				    if (i_2944_ == 0 && anInt9012 != 255) {
					i_2944_ = i_2948_;
					i_2948_ = is[i_2894_];
					i_2948_ = (((((i_2944_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2948_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2944_ & 0xff00)
							* anInt9012)
						       + ((i_2948_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2894_] = i_2948_;
				} else if (i == 2) {
				    int i_2949_ = aByteArray11407[i_2893_];
				    if (i_2949_ != 0) {
					int i_2950_
					    = anIntArray11408[i_2949_ & 0xff];
					int i_2951_
					    = ((i_2950_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_2952_
					    = ((i_2950_ & 0xff00) * anInt9012
					       & 0xff0000);
					i_2950_ = (((i_2951_ | i_2952_) >>> 8)
						   + anInt9019);
					int i_2953_ = is[i_2894_];
					int i_2954_ = i_2950_ + i_2953_;
					int i_2955_ = ((i_2950_ & 0xff00ff)
						       + (i_2953_ & 0xff00ff));
					i_2953_ = ((i_2955_ & 0x1000100)
						   + (i_2954_ - i_2955_
						      & 0x10000));
					is[i_2894_]
					    = (i_2954_ - i_2953_
					       | i_2953_ - (i_2953_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_2889_ += anInt9001;
			    i_2890_ += anInt9000;
			}
			i_2887_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_2956_ = anInt8998;
		    while (i_2956_ < 0) {
			int i_2957_ = anInt8988;
			int i_2958_ = anInt9007 + anInt9009;
			int i_2959_ = anInt9003 + anInt9010;
			int i_2960_ = anInt8999;
			int i_2961_;
			if ((i_2961_ = i_2958_ - (anInt8985 << 12)) >= 0) {
			    i_2961_ = (anInt9001 - i_2961_) / anInt9001;
			    i_2960_ += i_2961_;
			    i_2958_ += anInt9001 * i_2961_;
			    i_2959_ += anInt9000 * i_2961_;
			    i_2957_ += i_2961_;
			}
			if ((i_2961_ = (i_2958_ - anInt9001) / anInt9001)
			    > i_2960_)
			    i_2960_ = i_2961_;
			if (i_2959_ < 0) {
			    i_2961_ = (anInt9000 - 1 - i_2959_) / anInt9000;
			    i_2960_ += i_2961_;
			    i_2958_ += anInt9001 * i_2961_;
			    i_2959_ += anInt9000 * i_2961_;
			    i_2957_ += i_2961_;
			}
			if ((i_2961_ = (1 + i_2959_ - (anInt9002 << 12)
					- anInt9000) / anInt9000)
			    > i_2960_)
			    i_2960_ = i_2961_;
			for (/**/; i_2960_ < 0; i_2960_++) {
			    int i_2962_ = ((i_2959_ >> 12) * anInt8985
					   + (i_2958_ >> 12));
			    int i_2963_ = i_2957_++;
			    if (i_2610_ == 0) {
				if (i == 1)
				    is[i_2963_]
					= (anIntArray11408
					   [aByteArray11407[i_2962_] & 0xff]);
				else if (i == 0) {
				    int i_2964_
					= (anIntArray11408
					   [aByteArray11407[i_2962_] & 0xff]);
				    int i_2965_
					= ((i_2964_ & 0xff0000) * anInt9014
					   & ~0xffffff);
				    int i_2966_
					= ((i_2964_ & 0xff00) * anInt9015
					   & 0xff0000);
				    int i_2967_ = ((i_2964_ & 0xff) * anInt9018
						   & 0xff00);
				    is[i_2963_]
					= (i_2965_ | i_2966_ | i_2967_) >>> 8;
				} else if (i == 3) {
				    int i_2968_
					= (anIntArray11408
					   [aByteArray11407[i_2962_] & 0xff]);
				    int i_2969_ = anInt9011;
				    int i_2970_ = i_2968_ + i_2969_;
				    int i_2971_ = ((i_2968_ & 0xff00ff)
						   + (i_2969_ & 0xff00ff));
				    int i_2972_
					= ((i_2971_ & 0x1000100)
					   + (i_2970_ - i_2971_ & 0x10000));
				    is[i_2963_]
					= (i_2970_ - i_2972_
					   | i_2972_ - (i_2972_ >>> 8));
				} else if (i == 2) {
				    int i_2973_
					= (anIntArray11408
					   [aByteArray11407[i_2962_] & 0xff]);
				    int i_2974_
					= ((i_2973_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_2975_
					= ((i_2973_ & 0xff00) * anInt9012
					   & 0xff0000);
				    is[i_2963_] = (((i_2974_ | i_2975_) >>> 8)
						   + anInt9019);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2610_ == 1) {
				if (i == 1) {
				    int i_2976_ = aByteArray11407[i_2962_];
				    if (i_2976_ != 0)
					is[i_2963_]
					    = anIntArray11408[i_2976_ & 0xff];
				} else if (i == 0) {
				    int i_2977_ = aByteArray11407[i_2962_];
				    if (i_2977_ != 0) {
					int i_2978_
					    = anIntArray11408[i_2977_ & 0xff];
					if ((anInt9011 & 0xffffff)
					    == 16777215) {
					    int i_2979_ = anInt9011 >>> 24;
					    int i_2980_ = 256 - i_2979_;
					    int i_2981_ = is[i_2963_];
					    is[i_2963_]
						= (((((i_2978_ & 0xff00ff)
						      * i_2979_)
						     + ((i_2981_ & 0xff00ff)
							* i_2980_))
						    & ~0xff00ff)
						   + ((((i_2978_ & 0xff00)
							* i_2979_)
						       + ((i_2981_ & 0xff00)
							  * i_2980_))
						      & 0xff0000)) >> 8;
					} else if (anInt9012 != 255) {
					    int i_2982_
						= (((i_2978_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_2983_ = (((i_2978_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_2984_
						= ((i_2978_ & 0xff) * anInt9018
						   & 0xff00);
					    i_2978_ = (i_2982_ | i_2983_
						       | i_2984_) >>> 8;
					    int i_2985_ = is[i_2963_];
					    is[i_2963_]
						= (((((i_2978_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2985_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2978_ & 0xff00)
							* anInt9012)
						       + ((i_2985_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					} else {
					    int i_2986_
						= (((i_2978_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_2987_ = (((i_2978_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_2988_
						= ((i_2978_ & 0xff) * anInt9018
						   & 0xff00);
					    is[i_2963_] = (i_2986_ | i_2987_
							   | i_2988_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_2989_ = aByteArray11407[i_2962_];
				    int i_2990_
					= (i_2989_ > 0
					   ? anIntArray11408[i_2989_] : 0);
				    int i_2991_ = anInt9011;
				    int i_2992_ = i_2990_ + i_2991_;
				    int i_2993_ = ((i_2990_ & 0xff00ff)
						   + (i_2991_ & 0xff00ff));
				    int i_2994_
					= ((i_2993_ & 0x1000100)
					   + (i_2992_ - i_2993_ & 0x10000));
				    i_2994_ = (i_2992_ - i_2994_
					       | i_2994_ - (i_2994_ >>> 8));
				    if (i_2990_ == 0 && anInt9012 != 255) {
					i_2990_ = i_2994_;
					i_2994_ = is[i_2963_];
					i_2994_ = (((((i_2990_ & 0xff00ff)
						      * anInt9012)
						     + ((i_2994_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_2990_ & 0xff00)
							* anInt9012)
						       + ((i_2994_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2963_] = i_2994_;
				} else if (i == 2) {
				    int i_2995_ = aByteArray11407[i_2962_];
				    if (i_2995_ != 0) {
					int i_2996_
					    = anIntArray11408[i_2995_ & 0xff];
					int i_2997_
					    = ((i_2996_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_2998_
					    = ((i_2996_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_2963_++] = ((i_2997_ | i_2998_)
							 >>> 8) + anInt9019;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2610_ == 2) {
				if (i == 1) {
				    int i_2999_ = aByteArray11407[i_2962_];
				    if (i_2999_ != 0) {
					int i_3000_
					    = anIntArray11408[i_2999_ & 0xff];
					int i_3001_ = is[i_2963_];
					int i_3002_ = i_3000_ + i_3001_;
					int i_3003_ = ((i_3000_ & 0xff00ff)
						       + (i_3001_ & 0xff00ff));
					i_3001_ = ((i_3003_ & 0x1000100)
						   + (i_3002_ - i_3003_
						      & 0x10000));
					is[i_2963_]
					    = (i_3002_ - i_3001_
					       | i_3001_ - (i_3001_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_3004_ = aByteArray11407[i_2962_];
				    if (i_3004_ != 0) {
					int i_3005_
					    = anIntArray11408[i_3004_ & 0xff];
					int i_3006_
					    = ((i_3005_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_3007_
					    = ((i_3005_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_3008_
					    = ((i_3005_ & 0xff) * anInt9018
					       & 0xff00);
					i_3005_ = (i_3006_ | i_3007_
						   | i_3008_) >>> 8;
					int i_3009_ = is[i_2963_];
					int i_3010_ = i_3005_ + i_3009_;
					int i_3011_ = ((i_3005_ & 0xff00ff)
						       + (i_3009_ & 0xff00ff));
					i_3009_ = ((i_3011_ & 0x1000100)
						   + (i_3010_ - i_3011_
						      & 0x10000));
					is[i_2963_]
					    = (i_3010_ - i_3009_
					       | i_3009_ - (i_3009_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_3012_ = aByteArray11407[i_2962_];
				    int i_3013_
					= (i_3012_ > 0
					   ? anIntArray11408[i_3012_] : 0);
				    int i_3014_ = anInt9011;
				    int i_3015_ = i_3013_ + i_3014_;
				    int i_3016_ = ((i_3013_ & 0xff00ff)
						   + (i_3014_ & 0xff00ff));
				    int i_3017_
					= ((i_3016_ & 0x1000100)
					   + (i_3015_ - i_3016_ & 0x10000));
				    i_3017_ = (i_3015_ - i_3017_
					       | i_3017_ - (i_3017_ >>> 8));
				    if (i_3013_ == 0 && anInt9012 != 255) {
					i_3013_ = i_3017_;
					i_3017_ = is[i_2963_];
					i_3017_ = (((((i_3013_ & 0xff00ff)
						      * anInt9012)
						     + ((i_3017_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_3013_ & 0xff00)
							* anInt9012)
						       + ((i_3017_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2963_] = i_3017_;
				} else if (i == 2) {
				    int i_3018_ = aByteArray11407[i_2962_];
				    if (i_3018_ != 0) {
					int i_3019_
					    = anIntArray11408[i_3018_ & 0xff];
					int i_3020_
					    = ((i_3019_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_3021_
					    = ((i_3019_ & 0xff00) * anInt9012
					       & 0xff0000);
					i_3019_ = (((i_3020_ | i_3021_) >>> 8)
						   + anInt9019);
					int i_3022_ = is[i_2963_];
					int i_3023_ = i_3019_ + i_3022_;
					int i_3024_ = ((i_3019_ & 0xff00ff)
						       + (i_3022_ & 0xff00ff));
					i_3022_ = ((i_3024_ & 0x1000100)
						   + (i_3023_ - i_3024_
						      & 0x10000));
					is[i_2963_]
					    = (i_3023_ - i_3022_
					       | i_3022_ - (i_3022_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_2958_ += anInt9001;
			    i_2959_ += anInt9000;
			}
			i_2956_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9000 == 0) {
		int i_3025_ = anInt8998;
		while (i_3025_ < 0) {
		    int i_3026_ = anInt8988;
		    int i_3027_ = anInt9007 + anInt9009;
		    int i_3028_ = anInt9003;
		    int i_3029_ = anInt8999;
		    if (i_3028_ >= 0 && i_3028_ - (anInt9002 << 12) < 0) {
			if (i_3027_ < 0) {
			    int i_3030_
				= (anInt9001 - 1 - i_3027_) / anInt9001;
			    i_3029_ += i_3030_;
			    i_3027_ += anInt9001 * i_3030_;
			    i_3026_ += i_3030_;
			}
			int i_3031_;
			if ((i_3031_ = (1 + i_3027_ - (anInt8985 << 12)
					- anInt9001) / anInt9001)
			    > i_3029_)
			    i_3029_ = i_3031_;
			for (/**/; i_3029_ < 0; i_3029_++) {
			    int i_3032_ = ((i_3028_ >> 12) * anInt8985
					   + (i_3027_ >> 12));
			    int i_3033_ = i_3026_++;
			    if (i_2610_ == 0) {
				if (i == 1)
				    is[i_3033_]
					= (anIntArray11408
					   [aByteArray11407[i_3032_] & 0xff]);
				else if (i == 0) {
				    int i_3034_
					= (anIntArray11408
					   [aByteArray11407[i_3032_] & 0xff]);
				    int i_3035_
					= ((i_3034_ & 0xff0000) * anInt9014
					   & ~0xffffff);
				    int i_3036_
					= ((i_3034_ & 0xff00) * anInt9015
					   & 0xff0000);
				    int i_3037_ = ((i_3034_ & 0xff) * anInt9018
						   & 0xff00);
				    is[i_3033_]
					= (i_3035_ | i_3036_ | i_3037_) >>> 8;
				} else if (i == 3) {
				    int i_3038_
					= (anIntArray11408
					   [aByteArray11407[i_3032_] & 0xff]);
				    int i_3039_ = anInt9011;
				    int i_3040_ = i_3038_ + i_3039_;
				    int i_3041_ = ((i_3038_ & 0xff00ff)
						   + (i_3039_ & 0xff00ff));
				    int i_3042_
					= ((i_3041_ & 0x1000100)
					   + (i_3040_ - i_3041_ & 0x10000));
				    is[i_3033_]
					= (i_3040_ - i_3042_
					   | i_3042_ - (i_3042_ >>> 8));
				} else if (i == 2) {
				    int i_3043_
					= (anIntArray11408
					   [aByteArray11407[i_3032_] & 0xff]);
				    int i_3044_
					= ((i_3043_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_3045_
					= ((i_3043_ & 0xff00) * anInt9012
					   & 0xff0000);
				    is[i_3033_] = (((i_3044_ | i_3045_) >>> 8)
						   + anInt9019);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2610_ == 1) {
				if (i == 1) {
				    int i_3046_ = aByteArray11407[i_3032_];
				    if (i_3046_ != 0)
					is[i_3033_]
					    = anIntArray11408[i_3046_ & 0xff];
				} else if (i == 0) {
				    int i_3047_ = aByteArray11407[i_3032_];
				    if (i_3047_ != 0) {
					int i_3048_
					    = anIntArray11408[i_3047_ & 0xff];
					if ((anInt9011 & 0xffffff)
					    == 16777215) {
					    int i_3049_ = anInt9011 >>> 24;
					    int i_3050_ = 256 - i_3049_;
					    int i_3051_ = is[i_3033_];
					    is[i_3033_]
						= (((((i_3048_ & 0xff00ff)
						      * i_3049_)
						     + ((i_3051_ & 0xff00ff)
							* i_3050_))
						    & ~0xff00ff)
						   + ((((i_3048_ & 0xff00)
							* i_3049_)
						       + ((i_3051_ & 0xff00)
							  * i_3050_))
						      & 0xff0000)) >> 8;
					} else if (anInt9012 != 255) {
					    int i_3052_
						= (((i_3048_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_3053_ = (((i_3048_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_3054_
						= ((i_3048_ & 0xff) * anInt9018
						   & 0xff00);
					    i_3048_ = (i_3052_ | i_3053_
						       | i_3054_) >>> 8;
					    int i_3055_ = is[i_3033_];
					    is[i_3033_]
						= (((((i_3048_ & 0xff00ff)
						      * anInt9012)
						     + ((i_3055_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_3048_ & 0xff00)
							* anInt9012)
						       + ((i_3055_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					} else {
					    int i_3056_
						= (((i_3048_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_3057_ = (((i_3048_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_3058_
						= ((i_3048_ & 0xff) * anInt9018
						   & 0xff00);
					    is[i_3033_] = (i_3056_ | i_3057_
							   | i_3058_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_3059_ = aByteArray11407[i_3032_];
				    int i_3060_
					= (i_3059_ > 0
					   ? anIntArray11408[i_3059_] : 0);
				    int i_3061_ = anInt9011;
				    int i_3062_ = i_3060_ + i_3061_;
				    int i_3063_ = ((i_3060_ & 0xff00ff)
						   + (i_3061_ & 0xff00ff));
				    int i_3064_
					= ((i_3063_ & 0x1000100)
					   + (i_3062_ - i_3063_ & 0x10000));
				    i_3064_ = (i_3062_ - i_3064_
					       | i_3064_ - (i_3064_ >>> 8));
				    if (i_3060_ == 0 && anInt9012 != 255) {
					i_3060_ = i_3064_;
					i_3064_ = is[i_3033_];
					i_3064_ = (((((i_3060_ & 0xff00ff)
						      * anInt9012)
						     + ((i_3064_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_3060_ & 0xff00)
							* anInt9012)
						       + ((i_3064_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3033_] = i_3064_;
				} else if (i == 2) {
				    int i_3065_ = aByteArray11407[i_3032_];
				    if (i_3065_ != 0) {
					int i_3066_
					    = anIntArray11408[i_3065_ & 0xff];
					int i_3067_
					    = ((i_3066_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_3068_
					    = ((i_3066_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_3033_++] = ((i_3067_ | i_3068_)
							 >>> 8) + anInt9019;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2610_ == 2) {
				if (i == 1) {
				    int i_3069_ = aByteArray11407[i_3032_];
				    if (i_3069_ != 0) {
					int i_3070_
					    = anIntArray11408[i_3069_ & 0xff];
					int i_3071_ = is[i_3033_];
					int i_3072_ = i_3070_ + i_3071_;
					int i_3073_ = ((i_3070_ & 0xff00ff)
						       + (i_3071_ & 0xff00ff));
					i_3071_ = ((i_3073_ & 0x1000100)
						   + (i_3072_ - i_3073_
						      & 0x10000));
					is[i_3033_]
					    = (i_3072_ - i_3071_
					       | i_3071_ - (i_3071_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_3074_ = aByteArray11407[i_3032_];
				    if (i_3074_ != 0) {
					int i_3075_
					    = anIntArray11408[i_3074_ & 0xff];
					int i_3076_
					    = ((i_3075_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_3077_
					    = ((i_3075_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_3078_
					    = ((i_3075_ & 0xff) * anInt9018
					       & 0xff00);
					i_3075_ = (i_3076_ | i_3077_
						   | i_3078_) >>> 8;
					int i_3079_ = is[i_3033_];
					int i_3080_ = i_3075_ + i_3079_;
					int i_3081_ = ((i_3075_ & 0xff00ff)
						       + (i_3079_ & 0xff00ff));
					i_3079_ = ((i_3081_ & 0x1000100)
						   + (i_3080_ - i_3081_
						      & 0x10000));
					is[i_3033_]
					    = (i_3080_ - i_3079_
					       | i_3079_ - (i_3079_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_3082_ = aByteArray11407[i_3032_];
				    int i_3083_
					= (i_3082_ > 0
					   ? anIntArray11408[i_3082_] : 0);
				    int i_3084_ = anInt9011;
				    int i_3085_ = i_3083_ + i_3084_;
				    int i_3086_ = ((i_3083_ & 0xff00ff)
						   + (i_3084_ & 0xff00ff));
				    int i_3087_
					= ((i_3086_ & 0x1000100)
					   + (i_3085_ - i_3086_ & 0x10000));
				    i_3087_ = (i_3085_ - i_3087_
					       | i_3087_ - (i_3087_ >>> 8));
				    if (i_3083_ == 0 && anInt9012 != 255) {
					i_3083_ = i_3087_;
					i_3087_ = is[i_3033_];
					i_3087_ = (((((i_3083_ & 0xff00ff)
						      * anInt9012)
						     + ((i_3087_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_3083_ & 0xff00)
							* anInt9012)
						       + ((i_3087_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3033_] = i_3087_;
				} else if (i == 2) {
				    int i_3088_ = aByteArray11407[i_3032_];
				    if (i_3088_ != 0) {
					int i_3089_
					    = anIntArray11408[i_3088_ & 0xff];
					int i_3090_
					    = ((i_3089_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_3091_
					    = ((i_3089_ & 0xff00) * anInt9012
					       & 0xff0000);
					i_3089_ = (((i_3090_ | i_3091_) >>> 8)
						   + anInt9019);
					int i_3092_ = is[i_3033_];
					int i_3093_ = i_3089_ + i_3092_;
					int i_3094_ = ((i_3089_ & 0xff00ff)
						       + (i_3092_ & 0xff00ff));
					i_3092_ = ((i_3094_ & 0x1000100)
						   + (i_3093_ - i_3094_
						      & 0x10000));
					is[i_3033_]
					    = (i_3093_ - i_3092_
					       | i_3092_ - (i_3092_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_3027_ += anInt9001;
			}
		    }
		    i_3025_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else if (anInt9000 < 0) {
		for (int i_3095_ = anInt8998; i_3095_ < 0; i_3095_++) {
		    int i_3096_ = anInt8988;
		    int i_3097_ = anInt9007 + anInt9009;
		    int i_3098_ = anInt9003 + anInt9010;
		    int i_3099_ = anInt8999;
		    if (i_3097_ < 0) {
			int i_3100_ = (anInt9001 - 1 - i_3097_) / anInt9001;
			i_3099_ += i_3100_;
			i_3097_ += anInt9001 * i_3100_;
			i_3098_ += anInt9000 * i_3100_;
			i_3096_ += i_3100_;
		    }
		    int i_3101_;
		    if ((i_3101_ = (1 + i_3097_ - (anInt8985 << 12)
				    - anInt9001) / anInt9001)
			> i_3099_)
			i_3099_ = i_3101_;
		    if ((i_3101_ = i_3098_ - (anInt9002 << 12)) >= 0) {
			i_3101_ = (anInt9000 - i_3101_) / anInt9000;
			i_3099_ += i_3101_;
			i_3097_ += anInt9001 * i_3101_;
			i_3098_ += anInt9000 * i_3101_;
			i_3096_ += i_3101_;
		    }
		    if ((i_3101_ = (i_3098_ - anInt9000) / anInt9000)
			> i_3099_)
			i_3099_ = i_3101_;
		    for (/**/; i_3099_ < 0; i_3099_++) {
			int i_3102_
			    = (i_3098_ >> 12) * anInt8985 + (i_3097_ >> 12);
			int i_3103_ = i_3096_++;
			if (i_2610_ == 0) {
			    if (i == 1)
				is[i_3103_]
				    = (anIntArray11408
				       [aByteArray11407[i_3102_] & 0xff]);
			    else if (i == 0) {
				int i_3104_
				    = (anIntArray11408
				       [aByteArray11407[i_3102_] & 0xff]);
				int i_3105_ = ((i_3104_ & 0xff0000) * anInt9014
					       & ~0xffffff);
				int i_3106_ = ((i_3104_ & 0xff00) * anInt9015
					       & 0xff0000);
				int i_3107_
				    = (i_3104_ & 0xff) * anInt9018 & 0xff00;
				is[i_3103_]
				    = (i_3105_ | i_3106_ | i_3107_) >>> 8;
			    } else if (i == 3) {
				int i_3108_
				    = (anIntArray11408
				       [aByteArray11407[i_3102_] & 0xff]);
				int i_3109_ = anInt9011;
				int i_3110_ = i_3108_ + i_3109_;
				int i_3111_ = ((i_3108_ & 0xff00ff)
					       + (i_3109_ & 0xff00ff));
				int i_3112_
				    = ((i_3111_ & 0x1000100)
				       + (i_3110_ - i_3111_ & 0x10000));
				is[i_3103_]
				    = i_3110_ - i_3112_ | i_3112_ - (i_3112_
								     >>> 8);
			    } else if (i == 2) {
				int i_3113_
				    = (anIntArray11408
				       [aByteArray11407[i_3102_] & 0xff]);
				int i_3114_ = ((i_3113_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
				int i_3115_ = ((i_3113_ & 0xff00) * anInt9012
					       & 0xff0000);
				is[i_3103_]
				    = ((i_3114_ | i_3115_) >>> 8) + anInt9019;
			    } else
				throw new IllegalArgumentException();
			} else if (i_2610_ == 1) {
			    if (i == 1) {
				int i_3116_ = aByteArray11407[i_3102_];
				if (i_3116_ != 0)
				    is[i_3103_]
					= anIntArray11408[i_3116_ & 0xff];
			    } else if (i == 0) {
				int i_3117_ = aByteArray11407[i_3102_];
				if (i_3117_ != 0) {
				    int i_3118_
					= anIntArray11408[i_3117_ & 0xff];
				    if ((anInt9011 & 0xffffff) == 16777215) {
					int i_3119_ = anInt9011 >>> 24;
					int i_3120_ = 256 - i_3119_;
					int i_3121_ = is[i_3103_];
					is[i_3103_]
					    = ((((i_3118_ & 0xff00ff) * i_3119_
						 + ((i_3121_ & 0xff00ff)
						    * i_3120_))
						& ~0xff00ff)
					       + (((i_3118_ & 0xff00) * i_3119_
						   + ((i_3121_ & 0xff00)
						      * i_3120_))
						  & 0xff0000)) >> 8;
				    } else if (anInt9012 != 255) {
					int i_3122_
					    = ((i_3118_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_3123_
					    = ((i_3118_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_3124_
					    = ((i_3118_ & 0xff) * anInt9018
					       & 0xff00);
					i_3118_ = (i_3122_ | i_3123_
						   | i_3124_) >>> 8;
					int i_3125_ = is[i_3103_];
					is[i_3103_]
					    = (((((i_3118_ & 0xff00ff)
						  * anInt9012)
						 + ((i_3125_ & 0xff00ff)
						    * anInt9013))
						& ~0xff00ff)
					       + ((((i_3118_ & 0xff00)
						    * anInt9012)
						   + ((i_3125_ & 0xff00)
						      * anInt9013))
						  & 0xff0000)) >> 8;
				    } else {
					int i_3126_
					    = ((i_3118_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_3127_
					    = ((i_3118_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_3128_
					    = ((i_3118_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_3103_] = (i_3126_ | i_3127_
						       | i_3128_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_3129_ = aByteArray11407[i_3102_];
				int i_3130_ = (i_3129_ > 0
					       ? anIntArray11408[i_3129_] : 0);
				int i_3131_ = anInt9011;
				int i_3132_ = i_3130_ + i_3131_;
				int i_3133_ = ((i_3130_ & 0xff00ff)
					       + (i_3131_ & 0xff00ff));
				int i_3134_
				    = ((i_3133_ & 0x1000100)
				       + (i_3132_ - i_3133_ & 0x10000));
				i_3134_
				    = i_3132_ - i_3134_ | i_3134_ - (i_3134_
								     >>> 8);
				if (i_3130_ == 0 && anInt9012 != 255) {
				    i_3130_ = i_3134_;
				    i_3134_ = is[i_3103_];
				    i_3134_
					= ((((i_3130_ & 0xff00ff) * anInt9012
					     + ((i_3134_ & 0xff00ff)
						* anInt9013))
					    & ~0xff00ff)
					   + (((i_3130_ & 0xff00) * anInt9012
					       + ((i_3134_ & 0xff00)
						  * anInt9013))
					      & 0xff0000)) >> 8;
				}
				is[i_3103_] = i_3134_;
			    } else if (i == 2) {
				int i_3135_ = aByteArray11407[i_3102_];
				if (i_3135_ != 0) {
				    int i_3136_
					= anIntArray11408[i_3135_ & 0xff];
				    int i_3137_
					= ((i_3136_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_3138_
					= ((i_3136_ & 0xff00) * anInt9012
					   & 0xff0000);
				    is[i_3103_++] = ((i_3137_ | i_3138_)
						     >>> 8) + anInt9019;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_2610_ == 2) {
			    if (i == 1) {
				int i_3139_ = aByteArray11407[i_3102_];
				if (i_3139_ != 0) {
				    int i_3140_
					= anIntArray11408[i_3139_ & 0xff];
				    int i_3141_ = is[i_3103_];
				    int i_3142_ = i_3140_ + i_3141_;
				    int i_3143_ = ((i_3140_ & 0xff00ff)
						   + (i_3141_ & 0xff00ff));
				    i_3141_
					= ((i_3143_ & 0x1000100)
					   + (i_3142_ - i_3143_ & 0x10000));
				    is[i_3103_]
					= (i_3142_ - i_3141_
					   | i_3141_ - (i_3141_ >>> 8));
				}
			    } else if (i == 0) {
				int i_3144_ = aByteArray11407[i_3102_];
				if (i_3144_ != 0) {
				    int i_3145_
					= anIntArray11408[i_3144_ & 0xff];
				    int i_3146_
					= ((i_3145_ & 0xff0000) * anInt9014
					   & ~0xffffff);
				    int i_3147_
					= ((i_3145_ & 0xff00) * anInt9015
					   & 0xff0000);
				    int i_3148_ = ((i_3145_ & 0xff) * anInt9018
						   & 0xff00);
				    i_3145_
					= (i_3146_ | i_3147_ | i_3148_) >>> 8;
				    int i_3149_ = is[i_3103_];
				    int i_3150_ = i_3145_ + i_3149_;
				    int i_3151_ = ((i_3145_ & 0xff00ff)
						   + (i_3149_ & 0xff00ff));
				    i_3149_
					= ((i_3151_ & 0x1000100)
					   + (i_3150_ - i_3151_ & 0x10000));
				    is[i_3103_]
					= (i_3150_ - i_3149_
					   | i_3149_ - (i_3149_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_3152_ = aByteArray11407[i_3102_];
				int i_3153_ = (i_3152_ > 0
					       ? anIntArray11408[i_3152_] : 0);
				int i_3154_ = anInt9011;
				int i_3155_ = i_3153_ + i_3154_;
				int i_3156_ = ((i_3153_ & 0xff00ff)
					       + (i_3154_ & 0xff00ff));
				int i_3157_
				    = ((i_3156_ & 0x1000100)
				       + (i_3155_ - i_3156_ & 0x10000));
				i_3157_
				    = i_3155_ - i_3157_ | i_3157_ - (i_3157_
								     >>> 8);
				if (i_3153_ == 0 && anInt9012 != 255) {
				    i_3153_ = i_3157_;
				    i_3157_ = is[i_3103_];
				    i_3157_
					= ((((i_3153_ & 0xff00ff) * anInt9012
					     + ((i_3157_ & 0xff00ff)
						* anInt9013))
					    & ~0xff00ff)
					   + (((i_3153_ & 0xff00) * anInt9012
					       + ((i_3157_ & 0xff00)
						  * anInt9013))
					      & 0xff0000)) >> 8;
				}
				is[i_3103_] = i_3157_;
			    } else if (i == 2) {
				int i_3158_ = aByteArray11407[i_3102_];
				if (i_3158_ != 0) {
				    int i_3159_
					= anIntArray11408[i_3158_ & 0xff];
				    int i_3160_
					= ((i_3159_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_3161_
					= ((i_3159_ & 0xff00) * anInt9012
					   & 0xff0000);
				    i_3159_ = (((i_3160_ | i_3161_) >>> 8)
					       + anInt9019);
				    int i_3162_ = is[i_3103_];
				    int i_3163_ = i_3159_ + i_3162_;
				    int i_3164_ = ((i_3159_ & 0xff00ff)
						   + (i_3162_ & 0xff00ff));
				    i_3162_
					= ((i_3164_ & 0x1000100)
					   + (i_3163_ - i_3164_ & 0x10000));
				    is[i_3103_]
					= (i_3163_ - i_3162_
					   | i_3162_ - (i_3162_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_3097_ += anInt9001;
			i_3098_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else {
		for (int i_3165_ = anInt8998; i_3165_ < 0; i_3165_++) {
		    int i_3166_ = anInt8988;
		    int i_3167_ = anInt9007 + anInt9009;
		    int i_3168_ = anInt9003 + anInt9010;
		    int i_3169_ = anInt8999;
		    if (i_3167_ < 0) {
			int i_3170_ = (anInt9001 - 1 - i_3167_) / anInt9001;
			i_3169_ += i_3170_;
			i_3167_ += anInt9001 * i_3170_;
			i_3168_ += anInt9000 * i_3170_;
			i_3166_ += i_3170_;
		    }
		    int i_3171_;
		    if ((i_3171_ = (1 + i_3167_ - (anInt8985 << 12)
				    - anInt9001) / anInt9001)
			> i_3169_)
			i_3169_ = i_3171_;
		    if (i_3168_ < 0) {
			i_3171_ = (anInt9000 - 1 - i_3168_) / anInt9000;
			i_3169_ += i_3171_;
			i_3167_ += anInt9001 * i_3171_;
			i_3168_ += anInt9000 * i_3171_;
			i_3166_ += i_3171_;
		    }
		    if ((i_3171_ = (1 + i_3168_ - (anInt9002 << 12)
				    - anInt9000) / anInt9000)
			> i_3169_)
			i_3169_ = i_3171_;
		    for (/**/; i_3169_ < 0; i_3169_++) {
			int i_3172_
			    = (i_3168_ >> 12) * anInt8985 + (i_3167_ >> 12);
			int i_3173_ = i_3166_++;
			if (i_2610_ == 0) {
			    if (i == 1)
				is[i_3173_]
				    = (anIntArray11408
				       [aByteArray11407[i_3172_] & 0xff]);
			    else if (i == 0) {
				int i_3174_
				    = (anIntArray11408
				       [aByteArray11407[i_3172_] & 0xff]);
				int i_3175_ = ((i_3174_ & 0xff0000) * anInt9014
					       & ~0xffffff);
				int i_3176_ = ((i_3174_ & 0xff00) * anInt9015
					       & 0xff0000);
				int i_3177_
				    = (i_3174_ & 0xff) * anInt9018 & 0xff00;
				is[i_3173_]
				    = (i_3175_ | i_3176_ | i_3177_) >>> 8;
			    } else if (i == 3) {
				int i_3178_
				    = (anIntArray11408
				       [aByteArray11407[i_3172_] & 0xff]);
				int i_3179_ = anInt9011;
				int i_3180_ = i_3178_ + i_3179_;
				int i_3181_ = ((i_3178_ & 0xff00ff)
					       + (i_3179_ & 0xff00ff));
				int i_3182_
				    = ((i_3181_ & 0x1000100)
				       + (i_3180_ - i_3181_ & 0x10000));
				is[i_3173_]
				    = i_3180_ - i_3182_ | i_3182_ - (i_3182_
								     >>> 8);
			    } else if (i == 2) {
				int i_3183_
				    = (anIntArray11408
				       [aByteArray11407[i_3172_] & 0xff]);
				int i_3184_ = ((i_3183_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
				int i_3185_ = ((i_3183_ & 0xff00) * anInt9012
					       & 0xff0000);
				is[i_3173_]
				    = ((i_3184_ | i_3185_) >>> 8) + anInt9019;
			    } else
				throw new IllegalArgumentException();
			} else if (i_2610_ == 1) {
			    if (i == 1) {
				int i_3186_ = aByteArray11407[i_3172_];
				if (i_3186_ != 0)
				    is[i_3173_]
					= anIntArray11408[i_3186_ & 0xff];
			    } else if (i == 0) {
				int i_3187_ = aByteArray11407[i_3172_];
				if (i_3187_ != 0) {
				    int i_3188_
					= anIntArray11408[i_3187_ & 0xff];
				    if ((anInt9011 & 0xffffff) == 16777215) {
					int i_3189_ = anInt9011 >>> 24;
					int i_3190_ = 256 - i_3189_;
					int i_3191_ = is[i_3173_];
					is[i_3173_]
					    = ((((i_3188_ & 0xff00ff) * i_3189_
						 + ((i_3191_ & 0xff00ff)
						    * i_3190_))
						& ~0xff00ff)
					       + (((i_3188_ & 0xff00) * i_3189_
						   + ((i_3191_ & 0xff00)
						      * i_3190_))
						  & 0xff0000)) >> 8;
				    } else if (anInt9012 != 255) {
					int i_3192_
					    = ((i_3188_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_3193_
					    = ((i_3188_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_3194_
					    = ((i_3188_ & 0xff) * anInt9018
					       & 0xff00);
					i_3188_ = (i_3192_ | i_3193_
						   | i_3194_) >>> 8;
					int i_3195_ = is[i_3173_];
					is[i_3173_]
					    = (((((i_3188_ & 0xff00ff)
						  * anInt9012)
						 + ((i_3195_ & 0xff00ff)
						    * anInt9013))
						& ~0xff00ff)
					       + ((((i_3188_ & 0xff00)
						    * anInt9012)
						   + ((i_3195_ & 0xff00)
						      * anInt9013))
						  & 0xff0000)) >> 8;
				    } else {
					int i_3196_
					    = ((i_3188_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_3197_
					    = ((i_3188_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_3198_
					    = ((i_3188_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_3173_] = (i_3196_ | i_3197_
						       | i_3198_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_3199_ = aByteArray11407[i_3172_];
				int i_3200_ = (i_3199_ > 0
					       ? anIntArray11408[i_3199_] : 0);
				int i_3201_ = anInt9011;
				int i_3202_ = i_3200_ + i_3201_;
				int i_3203_ = ((i_3200_ & 0xff00ff)
					       + (i_3201_ & 0xff00ff));
				int i_3204_
				    = ((i_3203_ & 0x1000100)
				       + (i_3202_ - i_3203_ & 0x10000));
				i_3204_
				    = i_3202_ - i_3204_ | i_3204_ - (i_3204_
								     >>> 8);
				if (i_3200_ == 0 && anInt9012 != 255) {
				    i_3200_ = i_3204_;
				    i_3204_ = is[i_3173_];
				    i_3204_
					= ((((i_3200_ & 0xff00ff) * anInt9012
					     + ((i_3204_ & 0xff00ff)
						* anInt9013))
					    & ~0xff00ff)
					   + (((i_3200_ & 0xff00) * anInt9012
					       + ((i_3204_ & 0xff00)
						  * anInt9013))
					      & 0xff0000)) >> 8;
				}
				is[i_3173_] = i_3204_;
			    } else if (i == 2) {
				int i_3205_ = aByteArray11407[i_3172_];
				if (i_3205_ != 0) {
				    int i_3206_
					= anIntArray11408[i_3205_ & 0xff];
				    int i_3207_
					= ((i_3206_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_3208_
					= ((i_3206_ & 0xff00) * anInt9012
					   & 0xff0000);
				    is[i_3173_++] = ((i_3207_ | i_3208_)
						     >>> 8) + anInt9019;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_2610_ == 2) {
			    if (i == 1) {
				int i_3209_ = aByteArray11407[i_3172_];
				if (i_3209_ != 0) {
				    int i_3210_
					= anIntArray11408[i_3209_ & 0xff];
				    int i_3211_ = is[i_3173_];
				    int i_3212_ = i_3210_ + i_3211_;
				    int i_3213_ = ((i_3210_ & 0xff00ff)
						   + (i_3211_ & 0xff00ff));
				    i_3211_
					= ((i_3213_ & 0x1000100)
					   + (i_3212_ - i_3213_ & 0x10000));
				    is[i_3173_]
					= (i_3212_ - i_3211_
					   | i_3211_ - (i_3211_ >>> 8));
				}
			    } else if (i == 0) {
				int i_3214_ = aByteArray11407[i_3172_];
				if (i_3214_ != 0) {
				    int i_3215_
					= anIntArray11408[i_3214_ & 0xff];
				    int i_3216_
					= ((i_3215_ & 0xff0000) * anInt9014
					   & ~0xffffff);
				    int i_3217_
					= ((i_3215_ & 0xff00) * anInt9015
					   & 0xff0000);
				    int i_3218_ = ((i_3215_ & 0xff) * anInt9018
						   & 0xff00);
				    i_3215_
					= (i_3216_ | i_3217_ | i_3218_) >>> 8;
				    int i_3219_ = is[i_3173_];
				    int i_3220_ = i_3215_ + i_3219_;
				    int i_3221_ = ((i_3215_ & 0xff00ff)
						   + (i_3219_ & 0xff00ff));
				    i_3219_
					= ((i_3221_ & 0x1000100)
					   + (i_3220_ - i_3221_ & 0x10000));
				    is[i_3173_]
					= (i_3220_ - i_3219_
					   | i_3219_ - (i_3219_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_3222_ = aByteArray11407[i_3172_];
				int i_3223_ = (i_3222_ > 0
					       ? anIntArray11408[i_3222_] : 0);
				int i_3224_ = anInt9011;
				int i_3225_ = i_3223_ + i_3224_;
				int i_3226_ = ((i_3223_ & 0xff00ff)
					       + (i_3224_ & 0xff00ff));
				int i_3227_
				    = ((i_3226_ & 0x1000100)
				       + (i_3225_ - i_3226_ & 0x10000));
				i_3227_
				    = i_3225_ - i_3227_ | i_3227_ - (i_3227_
								     >>> 8);
				if (i_3223_ == 0 && anInt9012 != 255) {
				    i_3223_ = i_3227_;
				    i_3227_ = is[i_3173_];
				    i_3227_
					= ((((i_3223_ & 0xff00ff) * anInt9012
					     + ((i_3227_ & 0xff00ff)
						* anInt9013))
					    & ~0xff00ff)
					   + (((i_3223_ & 0xff00) * anInt9012
					       + ((i_3227_ & 0xff00)
						  * anInt9013))
					      & 0xff0000)) >> 8;
				}
				is[i_3173_] = i_3227_;
			    } else if (i == 2) {
				int i_3228_ = aByteArray11407[i_3172_];
				if (i_3228_ != 0) {
				    int i_3229_
					= anIntArray11408[i_3228_ & 0xff];
				    int i_3230_
					= ((i_3229_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_3231_
					= ((i_3229_ & 0xff00) * anInt9012
					   & 0xff0000);
				    i_3229_ = (((i_3230_ | i_3231_) >>> 8)
					       + anInt9019);
				    int i_3232_ = is[i_3173_];
				    int i_3233_ = i_3229_ + i_3232_;
				    int i_3234_ = ((i_3229_ & 0xff00ff)
						   + (i_3232_ & 0xff00ff));
				    i_3232_
					= ((i_3234_ & 0x1000100)
					   + (i_3233_ - i_3234_ & 0x10000));
				    is[i_3173_]
					= (i_3233_ - i_3232_
					   | i_3232_ - (i_3232_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_3167_ += anInt9001;
			i_3168_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    }
	}
    }
    
    void method14515(int i, int i_3235_) {
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    if (anInt9001 == 0) {
		if (anInt9000 == 0) {
		    int i_3236_ = anInt8998;
		    while (i_3236_ < 0) {
			int i_3237_ = anInt8988;
			int i_3238_ = anInt9007;
			int i_3239_ = anInt9003;
			int i_3240_ = anInt8999;
			if (i_3238_ >= 0 && i_3239_ >= 0
			    && i_3238_ - (anInt8985 << 12) < 0
			    && i_3239_ - (anInt9002 << 12) < 0) {
			    for (/**/; i_3240_ < 0; i_3240_++) {
				int i_3241_ = ((i_3239_ >> 12) * anInt8985
					       + (i_3238_ >> 12));
				int i_3242_ = i_3237_++;
				if (i_3235_ == 0) {
				    if (i == 1)
					is[i_3242_]
					    = (anIntArray11408
					       [(aByteArray11407[i_3241_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_3243_
					    = (anIntArray11408
					       [(aByteArray11407[i_3241_]
						 & 0xff)]);
					int i_3244_
					    = ((i_3243_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_3245_
					    = ((i_3243_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_3246_
					    = ((i_3243_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_3242_] = (i_3244_ | i_3245_
						       | i_3246_) >>> 8;
				    } else if (i == 3) {
					int i_3247_
					    = (anIntArray11408
					       [(aByteArray11407[i_3241_]
						 & 0xff)]);
					int i_3248_ = anInt9011;
					int i_3249_ = i_3247_ + i_3248_;
					int i_3250_ = ((i_3247_ & 0xff00ff)
						       + (i_3248_ & 0xff00ff));
					int i_3251_ = ((i_3250_ & 0x1000100)
						       + (i_3249_ - i_3250_
							  & 0x10000));
					is[i_3242_]
					    = (i_3249_ - i_3251_
					       | i_3251_ - (i_3251_ >>> 8));
				    } else if (i == 2) {
					int i_3252_
					    = (anIntArray11408
					       [(aByteArray11407[i_3241_]
						 & 0xff)]);
					int i_3253_
					    = ((i_3252_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_3254_
					    = ((i_3252_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_3242_] = ((i_3253_ | i_3254_)
						       >>> 8) + anInt9019;
				    } else
					throw new IllegalArgumentException();
				} else if (i_3235_ == 1) {
				    if (i == 1) {
					int i_3255_ = aByteArray11407[i_3241_];
					if (i_3255_ != 0)
					    is[i_3242_] = (anIntArray11408
							   [i_3255_ & 0xff]);
				    } else if (i == 0) {
					int i_3256_ = aByteArray11407[i_3241_];
					if (i_3256_ != 0) {
					    int i_3257_ = (anIntArray11408
							   [i_3256_ & 0xff]);
					    if ((anInt9011 & 0xffffff)
						== 16777215) {
						int i_3258_ = anInt9011 >>> 24;
						int i_3259_ = 256 - i_3258_;
						int i_3260_ = is[i_3242_];
						is[i_3242_]
						    = (((((i_3257_ & 0xff00ff)
							  * i_3258_)
							 + ((i_3260_
							     & 0xff00ff)
							    * i_3259_))
							& ~0xff00ff)
						       + ((((i_3257_ & 0xff00)
							    * i_3258_)
							   + ((i_3260_
							       & 0xff00)
							      * i_3259_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9012 != 255) {
						int i_3261_
						    = (((i_3257_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_3262_
						    = (((i_3257_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_3263_
						    = (((i_3257_ & 0xff)
							* anInt9018)
						       & 0xff00);
						i_3257_ = (i_3261_ | i_3262_
							   | i_3263_) >>> 8;
						int i_3264_ = is[i_3242_];
						is[i_3242_]
						    = (((((i_3257_ & 0xff00ff)
							  * anInt9012)
							 + ((i_3264_
							     & 0xff00ff)
							    * anInt9013))
							& ~0xff00ff)
						       + ((((i_3257_ & 0xff00)
							    * anInt9012)
							   + ((i_3264_
							       & 0xff00)
							      * anInt9013))
							  & 0xff0000)) >> 8;
					    } else {
						int i_3265_
						    = (((i_3257_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_3266_
						    = (((i_3257_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_3267_
						    = (((i_3257_ & 0xff)
							* anInt9018)
						       & 0xff00);
						is[i_3242_]
						    = (i_3265_ | i_3266_
						       | i_3267_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_3268_
					    = aByteArray11407[i_3241_];
					int i_3269_
					    = (i_3268_ > 0
					       ? anIntArray11408[i_3268_] : 0);
					int i_3270_ = anInt9011;
					int i_3271_ = i_3269_ + i_3270_;
					int i_3272_ = ((i_3269_ & 0xff00ff)
						       + (i_3270_ & 0xff00ff));
					int i_3273_ = ((i_3272_ & 0x1000100)
						       + (i_3271_ - i_3272_
							  & 0x10000));
					i_3273_
					    = (i_3271_ - i_3273_
					       | i_3273_ - (i_3273_ >>> 8));
					if (i_3269_ == 0 && anInt9012 != 255) {
					    i_3269_ = i_3273_;
					    i_3273_ = is[i_3242_];
					    i_3273_
						= (((((i_3269_ & 0xff00ff)
						      * anInt9012)
						     + ((i_3273_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_3269_ & 0xff00)
							* anInt9012)
						       + ((i_3273_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_3242_] = i_3273_;
				    } else if (i == 2) {
					int i_3274_ = aByteArray11407[i_3241_];
					if (i_3274_ != 0) {
					    int i_3275_ = (anIntArray11408
							   [i_3274_ & 0xff]);
					    int i_3276_
						= (((i_3275_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_3277_ = (((i_3275_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    is[i_3242_++]
						= (((i_3276_ | i_3277_) >>> 8)
						   + anInt9019);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_3235_ == 2) {
				    if (i == 1) {
					int i_3278_ = aByteArray11407[i_3241_];
					if (i_3278_ != 0) {
					    int i_3279_ = (anIntArray11408
							   [i_3278_ & 0xff]);
					    int i_3280_ = is[i_3242_];
					    int i_3281_ = i_3279_ + i_3280_;
					    int i_3282_
						= ((i_3279_ & 0xff00ff)
						   + (i_3280_ & 0xff00ff));
					    i_3280_ = ((i_3282_ & 0x1000100)
						       + (i_3281_ - i_3282_
							  & 0x10000));
					    is[i_3242_]
						= (i_3281_ - i_3280_
						   | i_3280_ - (i_3280_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_3283_ = aByteArray11407[i_3241_];
					if (i_3283_ != 0) {
					    int i_3284_ = (anIntArray11408
							   [i_3283_ & 0xff]);
					    int i_3285_
						= (((i_3284_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_3286_ = (((i_3284_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_3287_
						= ((i_3284_ & 0xff) * anInt9018
						   & 0xff00);
					    i_3284_ = (i_3285_ | i_3286_
						       | i_3287_) >>> 8;
					    int i_3288_ = is[i_3242_];
					    int i_3289_ = i_3284_ + i_3288_;
					    int i_3290_
						= ((i_3284_ & 0xff00ff)
						   + (i_3288_ & 0xff00ff));
					    i_3288_ = ((i_3290_ & 0x1000100)
						       + (i_3289_ - i_3290_
							  & 0x10000));
					    is[i_3242_]
						= (i_3289_ - i_3288_
						   | i_3288_ - (i_3288_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_3291_
					    = aByteArray11407[i_3241_];
					int i_3292_
					    = (i_3291_ > 0
					       ? anIntArray11408[i_3291_] : 0);
					int i_3293_ = anInt9011;
					int i_3294_ = i_3292_ + i_3293_;
					int i_3295_ = ((i_3292_ & 0xff00ff)
						       + (i_3293_ & 0xff00ff));
					int i_3296_ = ((i_3295_ & 0x1000100)
						       + (i_3294_ - i_3295_
							  & 0x10000));
					i_3296_
					    = (i_3294_ - i_3296_
					       | i_3296_ - (i_3296_ >>> 8));
					if (i_3292_ == 0 && anInt9012 != 255) {
					    i_3292_ = i_3296_;
					    i_3296_ = is[i_3242_];
					    i_3296_
						= (((((i_3292_ & 0xff00ff)
						      * anInt9012)
						     + ((i_3296_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_3292_ & 0xff00)
							* anInt9012)
						       + ((i_3296_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_3242_] = i_3296_;
				    } else if (i == 2) {
					int i_3297_ = aByteArray11407[i_3241_];
					if (i_3297_ != 0) {
					    int i_3298_ = (anIntArray11408
							   [i_3297_ & 0xff]);
					    int i_3299_
						= (((i_3298_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_3300_ = (((i_3298_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    i_3298_ = ((i_3299_ | i_3300_)
						       >>> 8) + anInt9019;
					    int i_3301_ = is[i_3242_];
					    int i_3302_ = i_3298_ + i_3301_;
					    int i_3303_
						= ((i_3298_ & 0xff00ff)
						   + (i_3301_ & 0xff00ff));
					    i_3301_ = ((i_3303_ & 0x1000100)
						       + (i_3302_ - i_3303_
							  & 0x10000));
					    is[i_3242_]
						= (i_3302_ - i_3301_
						   | i_3301_ - (i_3301_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
			    }
			}
			i_3236_++;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_3304_ = anInt8998;
		    while (i_3304_ < 0) {
			int i_3305_ = anInt8988;
			int i_3306_ = anInt9007;
			int i_3307_ = anInt9003 + anInt9010;
			int i_3308_ = anInt8999;
			if (i_3306_ >= 0 && i_3306_ - (anInt8985 << 12) < 0) {
			    int i_3309_;
			    if ((i_3309_ = i_3307_ - (anInt9002 << 12)) >= 0) {
				i_3309_ = (anInt9000 - i_3309_) / anInt9000;
				i_3308_ += i_3309_;
				i_3307_ += anInt9000 * i_3309_;
				i_3305_ += i_3309_;
			    }
			    if ((i_3309_ = (i_3307_ - anInt9000) / anInt9000)
				> i_3308_)
				i_3308_ = i_3309_;
			    for (/**/; i_3308_ < 0; i_3308_++) {
				int i_3310_ = ((i_3307_ >> 12) * anInt8985
					       + (i_3306_ >> 12));
				int i_3311_ = i_3305_++;
				if (i_3235_ == 0) {
				    if (i == 1)
					is[i_3311_]
					    = (anIntArray11408
					       [(aByteArray11407[i_3310_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_3312_
					    = (anIntArray11408
					       [(aByteArray11407[i_3310_]
						 & 0xff)]);
					int i_3313_
					    = ((i_3312_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_3314_
					    = ((i_3312_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_3315_
					    = ((i_3312_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_3311_] = (i_3313_ | i_3314_
						       | i_3315_) >>> 8;
				    } else if (i == 3) {
					int i_3316_
					    = (anIntArray11408
					       [(aByteArray11407[i_3310_]
						 & 0xff)]);
					int i_3317_ = anInt9011;
					int i_3318_ = i_3316_ + i_3317_;
					int i_3319_ = ((i_3316_ & 0xff00ff)
						       + (i_3317_ & 0xff00ff));
					int i_3320_ = ((i_3319_ & 0x1000100)
						       + (i_3318_ - i_3319_
							  & 0x10000));
					is[i_3311_]
					    = (i_3318_ - i_3320_
					       | i_3320_ - (i_3320_ >>> 8));
				    } else if (i == 2) {
					int i_3321_
					    = (anIntArray11408
					       [(aByteArray11407[i_3310_]
						 & 0xff)]);
					int i_3322_
					    = ((i_3321_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_3323_
					    = ((i_3321_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_3311_] = ((i_3322_ | i_3323_)
						       >>> 8) + anInt9019;
				    } else
					throw new IllegalArgumentException();
				} else if (i_3235_ == 1) {
				    if (i == 1) {
					int i_3324_ = aByteArray11407[i_3310_];
					if (i_3324_ != 0)
					    is[i_3311_] = (anIntArray11408
							   [i_3324_ & 0xff]);
				    } else if (i == 0) {
					int i_3325_ = aByteArray11407[i_3310_];
					if (i_3325_ != 0) {
					    int i_3326_ = (anIntArray11408
							   [i_3325_ & 0xff]);
					    if ((anInt9011 & 0xffffff)
						== 16777215) {
						int i_3327_ = anInt9011 >>> 24;
						int i_3328_ = 256 - i_3327_;
						int i_3329_ = is[i_3311_];
						is[i_3311_]
						    = (((((i_3326_ & 0xff00ff)
							  * i_3327_)
							 + ((i_3329_
							     & 0xff00ff)
							    * i_3328_))
							& ~0xff00ff)
						       + ((((i_3326_ & 0xff00)
							    * i_3327_)
							   + ((i_3329_
							       & 0xff00)
							      * i_3328_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9012 != 255) {
						int i_3330_
						    = (((i_3326_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_3331_
						    = (((i_3326_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_3332_
						    = (((i_3326_ & 0xff)
							* anInt9018)
						       & 0xff00);
						i_3326_ = (i_3330_ | i_3331_
							   | i_3332_) >>> 8;
						int i_3333_ = is[i_3311_];
						is[i_3311_]
						    = (((((i_3326_ & 0xff00ff)
							  * anInt9012)
							 + ((i_3333_
							     & 0xff00ff)
							    * anInt9013))
							& ~0xff00ff)
						       + ((((i_3326_ & 0xff00)
							    * anInt9012)
							   + ((i_3333_
							       & 0xff00)
							      * anInt9013))
							  & 0xff0000)) >> 8;
					    } else {
						int i_3334_
						    = (((i_3326_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_3335_
						    = (((i_3326_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_3336_
						    = (((i_3326_ & 0xff)
							* anInt9018)
						       & 0xff00);
						is[i_3311_]
						    = (i_3334_ | i_3335_
						       | i_3336_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_3337_
					    = aByteArray11407[i_3310_];
					int i_3338_
					    = (i_3337_ > 0
					       ? anIntArray11408[i_3337_] : 0);
					int i_3339_ = anInt9011;
					int i_3340_ = i_3338_ + i_3339_;
					int i_3341_ = ((i_3338_ & 0xff00ff)
						       + (i_3339_ & 0xff00ff));
					int i_3342_ = ((i_3341_ & 0x1000100)
						       + (i_3340_ - i_3341_
							  & 0x10000));
					i_3342_
					    = (i_3340_ - i_3342_
					       | i_3342_ - (i_3342_ >>> 8));
					if (i_3338_ == 0 && anInt9012 != 255) {
					    i_3338_ = i_3342_;
					    i_3342_ = is[i_3311_];
					    i_3342_
						= (((((i_3338_ & 0xff00ff)
						      * anInt9012)
						     + ((i_3342_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_3338_ & 0xff00)
							* anInt9012)
						       + ((i_3342_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_3311_] = i_3342_;
				    } else if (i == 2) {
					int i_3343_ = aByteArray11407[i_3310_];
					if (i_3343_ != 0) {
					    int i_3344_ = (anIntArray11408
							   [i_3343_ & 0xff]);
					    int i_3345_
						= (((i_3344_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_3346_ = (((i_3344_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    is[i_3311_++]
						= (((i_3345_ | i_3346_) >>> 8)
						   + anInt9019);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_3235_ == 2) {
				    if (i == 1) {
					int i_3347_ = aByteArray11407[i_3310_];
					if (i_3347_ != 0) {
					    int i_3348_ = (anIntArray11408
							   [i_3347_ & 0xff]);
					    int i_3349_ = is[i_3311_];
					    int i_3350_ = i_3348_ + i_3349_;
					    int i_3351_
						= ((i_3348_ & 0xff00ff)
						   + (i_3349_ & 0xff00ff));
					    i_3349_ = ((i_3351_ & 0x1000100)
						       + (i_3350_ - i_3351_
							  & 0x10000));
					    is[i_3311_]
						= (i_3350_ - i_3349_
						   | i_3349_ - (i_3349_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_3352_ = aByteArray11407[i_3310_];
					if (i_3352_ != 0) {
					    int i_3353_ = (anIntArray11408
							   [i_3352_ & 0xff]);
					    int i_3354_
						= (((i_3353_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_3355_ = (((i_3353_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_3356_
						= ((i_3353_ & 0xff) * anInt9018
						   & 0xff00);
					    i_3353_ = (i_3354_ | i_3355_
						       | i_3356_) >>> 8;
					    int i_3357_ = is[i_3311_];
					    int i_3358_ = i_3353_ + i_3357_;
					    int i_3359_
						= ((i_3353_ & 0xff00ff)
						   + (i_3357_ & 0xff00ff));
					    i_3357_ = ((i_3359_ & 0x1000100)
						       + (i_3358_ - i_3359_
							  & 0x10000));
					    is[i_3311_]
						= (i_3358_ - i_3357_
						   | i_3357_ - (i_3357_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_3360_
					    = aByteArray11407[i_3310_];
					int i_3361_
					    = (i_3360_ > 0
					       ? anIntArray11408[i_3360_] : 0);
					int i_3362_ = anInt9011;
					int i_3363_ = i_3361_ + i_3362_;
					int i_3364_ = ((i_3361_ & 0xff00ff)
						       + (i_3362_ & 0xff00ff));
					int i_3365_ = ((i_3364_ & 0x1000100)
						       + (i_3363_ - i_3364_
							  & 0x10000));
					i_3365_
					    = (i_3363_ - i_3365_
					       | i_3365_ - (i_3365_ >>> 8));
					if (i_3361_ == 0 && anInt9012 != 255) {
					    i_3361_ = i_3365_;
					    i_3365_ = is[i_3311_];
					    i_3365_
						= (((((i_3361_ & 0xff00ff)
						      * anInt9012)
						     + ((i_3365_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_3361_ & 0xff00)
							* anInt9012)
						       + ((i_3365_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_3311_] = i_3365_;
				    } else if (i == 2) {
					int i_3366_ = aByteArray11407[i_3310_];
					if (i_3366_ != 0) {
					    int i_3367_ = (anIntArray11408
							   [i_3366_ & 0xff]);
					    int i_3368_
						= (((i_3367_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_3369_ = (((i_3367_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    i_3367_ = ((i_3368_ | i_3369_)
						       >>> 8) + anInt9019;
					    int i_3370_ = is[i_3311_];
					    int i_3371_ = i_3367_ + i_3370_;
					    int i_3372_
						= ((i_3367_ & 0xff00ff)
						   + (i_3370_ & 0xff00ff));
					    i_3370_ = ((i_3372_ & 0x1000100)
						       + (i_3371_ - i_3372_
							  & 0x10000));
					    is[i_3311_]
						= (i_3371_ - i_3370_
						   | i_3370_ - (i_3370_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_3307_ += anInt9000;
			    }
			}
			i_3304_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_3373_ = anInt8998;
		    while (i_3373_ < 0) {
			int i_3374_ = anInt8988;
			int i_3375_ = anInt9007;
			int i_3376_ = anInt9003 + anInt9010;
			int i_3377_ = anInt8999;
			if (i_3375_ >= 0 && i_3375_ - (anInt8985 << 12) < 0) {
			    if (i_3376_ < 0) {
				int i_3378_
				    = (anInt9000 - 1 - i_3376_) / anInt9000;
				i_3377_ += i_3378_;
				i_3376_ += anInt9000 * i_3378_;
				i_3374_ += i_3378_;
			    }
			    int i_3379_;
			    if ((i_3379_ = (1 + i_3376_ - (anInt9002 << 12)
					    - anInt9000) / anInt9000)
				> i_3377_)
				i_3377_ = i_3379_;
			    for (/**/; i_3377_ < 0; i_3377_++) {
				int i_3380_ = ((i_3376_ >> 12) * anInt8985
					       + (i_3375_ >> 12));
				int i_3381_ = i_3374_++;
				if (i_3235_ == 0) {
				    if (i == 1)
					is[i_3381_]
					    = (anIntArray11408
					       [(aByteArray11407[i_3380_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_3382_
					    = (anIntArray11408
					       [(aByteArray11407[i_3380_]
						 & 0xff)]);
					int i_3383_
					    = ((i_3382_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_3384_
					    = ((i_3382_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_3385_
					    = ((i_3382_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_3381_] = (i_3383_ | i_3384_
						       | i_3385_) >>> 8;
				    } else if (i == 3) {
					int i_3386_
					    = (anIntArray11408
					       [(aByteArray11407[i_3380_]
						 & 0xff)]);
					int i_3387_ = anInt9011;
					int i_3388_ = i_3386_ + i_3387_;
					int i_3389_ = ((i_3386_ & 0xff00ff)
						       + (i_3387_ & 0xff00ff));
					int i_3390_ = ((i_3389_ & 0x1000100)
						       + (i_3388_ - i_3389_
							  & 0x10000));
					is[i_3381_]
					    = (i_3388_ - i_3390_
					       | i_3390_ - (i_3390_ >>> 8));
				    } else if (i == 2) {
					int i_3391_
					    = (anIntArray11408
					       [(aByteArray11407[i_3380_]
						 & 0xff)]);
					int i_3392_
					    = ((i_3391_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_3393_
					    = ((i_3391_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_3381_] = ((i_3392_ | i_3393_)
						       >>> 8) + anInt9019;
				    } else
					throw new IllegalArgumentException();
				} else if (i_3235_ == 1) {
				    if (i == 1) {
					int i_3394_ = aByteArray11407[i_3380_];
					if (i_3394_ != 0)
					    is[i_3381_] = (anIntArray11408
							   [i_3394_ & 0xff]);
				    } else if (i == 0) {
					int i_3395_ = aByteArray11407[i_3380_];
					if (i_3395_ != 0) {
					    int i_3396_ = (anIntArray11408
							   [i_3395_ & 0xff]);
					    if ((anInt9011 & 0xffffff)
						== 16777215) {
						int i_3397_ = anInt9011 >>> 24;
						int i_3398_ = 256 - i_3397_;
						int i_3399_ = is[i_3381_];
						is[i_3381_]
						    = (((((i_3396_ & 0xff00ff)
							  * i_3397_)
							 + ((i_3399_
							     & 0xff00ff)
							    * i_3398_))
							& ~0xff00ff)
						       + ((((i_3396_ & 0xff00)
							    * i_3397_)
							   + ((i_3399_
							       & 0xff00)
							      * i_3398_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9012 != 255) {
						int i_3400_
						    = (((i_3396_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_3401_
						    = (((i_3396_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_3402_
						    = (((i_3396_ & 0xff)
							* anInt9018)
						       & 0xff00);
						i_3396_ = (i_3400_ | i_3401_
							   | i_3402_) >>> 8;
						int i_3403_ = is[i_3381_];
						is[i_3381_]
						    = (((((i_3396_ & 0xff00ff)
							  * anInt9012)
							 + ((i_3403_
							     & 0xff00ff)
							    * anInt9013))
							& ~0xff00ff)
						       + ((((i_3396_ & 0xff00)
							    * anInt9012)
							   + ((i_3403_
							       & 0xff00)
							      * anInt9013))
							  & 0xff0000)) >> 8;
					    } else {
						int i_3404_
						    = (((i_3396_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_3405_
						    = (((i_3396_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_3406_
						    = (((i_3396_ & 0xff)
							* anInt9018)
						       & 0xff00);
						is[i_3381_]
						    = (i_3404_ | i_3405_
						       | i_3406_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_3407_
					    = aByteArray11407[i_3380_];
					int i_3408_
					    = (i_3407_ > 0
					       ? anIntArray11408[i_3407_] : 0);
					int i_3409_ = anInt9011;
					int i_3410_ = i_3408_ + i_3409_;
					int i_3411_ = ((i_3408_ & 0xff00ff)
						       + (i_3409_ & 0xff00ff));
					int i_3412_ = ((i_3411_ & 0x1000100)
						       + (i_3410_ - i_3411_
							  & 0x10000));
					i_3412_
					    = (i_3410_ - i_3412_
					       | i_3412_ - (i_3412_ >>> 8));
					if (i_3408_ == 0 && anInt9012 != 255) {
					    i_3408_ = i_3412_;
					    i_3412_ = is[i_3381_];
					    i_3412_
						= (((((i_3408_ & 0xff00ff)
						      * anInt9012)
						     + ((i_3412_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_3408_ & 0xff00)
							* anInt9012)
						       + ((i_3412_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_3381_] = i_3412_;
				    } else if (i == 2) {
					int i_3413_ = aByteArray11407[i_3380_];
					if (i_3413_ != 0) {
					    int i_3414_ = (anIntArray11408
							   [i_3413_ & 0xff]);
					    int i_3415_
						= (((i_3414_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_3416_ = (((i_3414_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    is[i_3381_++]
						= (((i_3415_ | i_3416_) >>> 8)
						   + anInt9019);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_3235_ == 2) {
				    if (i == 1) {
					int i_3417_ = aByteArray11407[i_3380_];
					if (i_3417_ != 0) {
					    int i_3418_ = (anIntArray11408
							   [i_3417_ & 0xff]);
					    int i_3419_ = is[i_3381_];
					    int i_3420_ = i_3418_ + i_3419_;
					    int i_3421_
						= ((i_3418_ & 0xff00ff)
						   + (i_3419_ & 0xff00ff));
					    i_3419_ = ((i_3421_ & 0x1000100)
						       + (i_3420_ - i_3421_
							  & 0x10000));
					    is[i_3381_]
						= (i_3420_ - i_3419_
						   | i_3419_ - (i_3419_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_3422_ = aByteArray11407[i_3380_];
					if (i_3422_ != 0) {
					    int i_3423_ = (anIntArray11408
							   [i_3422_ & 0xff]);
					    int i_3424_
						= (((i_3423_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_3425_ = (((i_3423_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_3426_
						= ((i_3423_ & 0xff) * anInt9018
						   & 0xff00);
					    i_3423_ = (i_3424_ | i_3425_
						       | i_3426_) >>> 8;
					    int i_3427_ = is[i_3381_];
					    int i_3428_ = i_3423_ + i_3427_;
					    int i_3429_
						= ((i_3423_ & 0xff00ff)
						   + (i_3427_ & 0xff00ff));
					    i_3427_ = ((i_3429_ & 0x1000100)
						       + (i_3428_ - i_3429_
							  & 0x10000));
					    is[i_3381_]
						= (i_3428_ - i_3427_
						   | i_3427_ - (i_3427_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_3430_
					    = aByteArray11407[i_3380_];
					int i_3431_
					    = (i_3430_ > 0
					       ? anIntArray11408[i_3430_] : 0);
					int i_3432_ = anInt9011;
					int i_3433_ = i_3431_ + i_3432_;
					int i_3434_ = ((i_3431_ & 0xff00ff)
						       + (i_3432_ & 0xff00ff));
					int i_3435_ = ((i_3434_ & 0x1000100)
						       + (i_3433_ - i_3434_
							  & 0x10000));
					i_3435_
					    = (i_3433_ - i_3435_
					       | i_3435_ - (i_3435_ >>> 8));
					if (i_3431_ == 0 && anInt9012 != 255) {
					    i_3431_ = i_3435_;
					    i_3435_ = is[i_3381_];
					    i_3435_
						= (((((i_3431_ & 0xff00ff)
						      * anInt9012)
						     + ((i_3435_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_3431_ & 0xff00)
							* anInt9012)
						       + ((i_3435_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_3381_] = i_3435_;
				    } else if (i == 2) {
					int i_3436_ = aByteArray11407[i_3380_];
					if (i_3436_ != 0) {
					    int i_3437_ = (anIntArray11408
							   [i_3436_ & 0xff]);
					    int i_3438_
						= (((i_3437_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_3439_ = (((i_3437_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    i_3437_ = ((i_3438_ | i_3439_)
						       >>> 8) + anInt9019;
					    int i_3440_ = is[i_3381_];
					    int i_3441_ = i_3437_ + i_3440_;
					    int i_3442_
						= ((i_3437_ & 0xff00ff)
						   + (i_3440_ & 0xff00ff));
					    i_3440_ = ((i_3442_ & 0x1000100)
						       + (i_3441_ - i_3442_
							  & 0x10000));
					    is[i_3381_]
						= (i_3441_ - i_3440_
						   | i_3440_ - (i_3440_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_3376_ += anInt9000;
			    }
			}
			i_3373_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9001 < 0) {
		if (anInt9000 == 0) {
		    int i_3443_ = anInt8998;
		    while (i_3443_ < 0) {
			int i_3444_ = anInt8988;
			int i_3445_ = anInt9007 + anInt9009;
			int i_3446_ = anInt9003;
			int i_3447_ = anInt8999;
			if (i_3446_ >= 0 && i_3446_ - (anInt9002 << 12) < 0) {
			    int i_3448_;
			    if ((i_3448_ = i_3445_ - (anInt8985 << 12)) >= 0) {
				i_3448_ = (anInt9001 - i_3448_) / anInt9001;
				i_3447_ += i_3448_;
				i_3445_ += anInt9001 * i_3448_;
				i_3444_ += i_3448_;
			    }
			    if ((i_3448_ = (i_3445_ - anInt9001) / anInt9001)
				> i_3447_)
				i_3447_ = i_3448_;
			    for (/**/; i_3447_ < 0; i_3447_++) {
				int i_3449_ = ((i_3446_ >> 12) * anInt8985
					       + (i_3445_ >> 12));
				int i_3450_ = i_3444_++;
				if (i_3235_ == 0) {
				    if (i == 1)
					is[i_3450_]
					    = (anIntArray11408
					       [(aByteArray11407[i_3449_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_3451_
					    = (anIntArray11408
					       [(aByteArray11407[i_3449_]
						 & 0xff)]);
					int i_3452_
					    = ((i_3451_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_3453_
					    = ((i_3451_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_3454_
					    = ((i_3451_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_3450_] = (i_3452_ | i_3453_
						       | i_3454_) >>> 8;
				    } else if (i == 3) {
					int i_3455_
					    = (anIntArray11408
					       [(aByteArray11407[i_3449_]
						 & 0xff)]);
					int i_3456_ = anInt9011;
					int i_3457_ = i_3455_ + i_3456_;
					int i_3458_ = ((i_3455_ & 0xff00ff)
						       + (i_3456_ & 0xff00ff));
					int i_3459_ = ((i_3458_ & 0x1000100)
						       + (i_3457_ - i_3458_
							  & 0x10000));
					is[i_3450_]
					    = (i_3457_ - i_3459_
					       | i_3459_ - (i_3459_ >>> 8));
				    } else if (i == 2) {
					int i_3460_
					    = (anIntArray11408
					       [(aByteArray11407[i_3449_]
						 & 0xff)]);
					int i_3461_
					    = ((i_3460_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_3462_
					    = ((i_3460_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_3450_] = ((i_3461_ | i_3462_)
						       >>> 8) + anInt9019;
				    } else
					throw new IllegalArgumentException();
				} else if (i_3235_ == 1) {
				    if (i == 1) {
					int i_3463_ = aByteArray11407[i_3449_];
					if (i_3463_ != 0)
					    is[i_3450_] = (anIntArray11408
							   [i_3463_ & 0xff]);
				    } else if (i == 0) {
					int i_3464_ = aByteArray11407[i_3449_];
					if (i_3464_ != 0) {
					    int i_3465_ = (anIntArray11408
							   [i_3464_ & 0xff]);
					    if ((anInt9011 & 0xffffff)
						== 16777215) {
						int i_3466_ = anInt9011 >>> 24;
						int i_3467_ = 256 - i_3466_;
						int i_3468_ = is[i_3450_];
						is[i_3450_]
						    = (((((i_3465_ & 0xff00ff)
							  * i_3466_)
							 + ((i_3468_
							     & 0xff00ff)
							    * i_3467_))
							& ~0xff00ff)
						       + ((((i_3465_ & 0xff00)
							    * i_3466_)
							   + ((i_3468_
							       & 0xff00)
							      * i_3467_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9012 != 255) {
						int i_3469_
						    = (((i_3465_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_3470_
						    = (((i_3465_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_3471_
						    = (((i_3465_ & 0xff)
							* anInt9018)
						       & 0xff00);
						i_3465_ = (i_3469_ | i_3470_
							   | i_3471_) >>> 8;
						int i_3472_ = is[i_3450_];
						is[i_3450_]
						    = (((((i_3465_ & 0xff00ff)
							  * anInt9012)
							 + ((i_3472_
							     & 0xff00ff)
							    * anInt9013))
							& ~0xff00ff)
						       + ((((i_3465_ & 0xff00)
							    * anInt9012)
							   + ((i_3472_
							       & 0xff00)
							      * anInt9013))
							  & 0xff0000)) >> 8;
					    } else {
						int i_3473_
						    = (((i_3465_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_3474_
						    = (((i_3465_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_3475_
						    = (((i_3465_ & 0xff)
							* anInt9018)
						       & 0xff00);
						is[i_3450_]
						    = (i_3473_ | i_3474_
						       | i_3475_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_3476_
					    = aByteArray11407[i_3449_];
					int i_3477_
					    = (i_3476_ > 0
					       ? anIntArray11408[i_3476_] : 0);
					int i_3478_ = anInt9011;
					int i_3479_ = i_3477_ + i_3478_;
					int i_3480_ = ((i_3477_ & 0xff00ff)
						       + (i_3478_ & 0xff00ff));
					int i_3481_ = ((i_3480_ & 0x1000100)
						       + (i_3479_ - i_3480_
							  & 0x10000));
					i_3481_
					    = (i_3479_ - i_3481_
					       | i_3481_ - (i_3481_ >>> 8));
					if (i_3477_ == 0 && anInt9012 != 255) {
					    i_3477_ = i_3481_;
					    i_3481_ = is[i_3450_];
					    i_3481_
						= (((((i_3477_ & 0xff00ff)
						      * anInt9012)
						     + ((i_3481_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_3477_ & 0xff00)
							* anInt9012)
						       + ((i_3481_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_3450_] = i_3481_;
				    } else if (i == 2) {
					int i_3482_ = aByteArray11407[i_3449_];
					if (i_3482_ != 0) {
					    int i_3483_ = (anIntArray11408
							   [i_3482_ & 0xff]);
					    int i_3484_
						= (((i_3483_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_3485_ = (((i_3483_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    is[i_3450_++]
						= (((i_3484_ | i_3485_) >>> 8)
						   + anInt9019);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_3235_ == 2) {
				    if (i == 1) {
					int i_3486_ = aByteArray11407[i_3449_];
					if (i_3486_ != 0) {
					    int i_3487_ = (anIntArray11408
							   [i_3486_ & 0xff]);
					    int i_3488_ = is[i_3450_];
					    int i_3489_ = i_3487_ + i_3488_;
					    int i_3490_
						= ((i_3487_ & 0xff00ff)
						   + (i_3488_ & 0xff00ff));
					    i_3488_ = ((i_3490_ & 0x1000100)
						       + (i_3489_ - i_3490_
							  & 0x10000));
					    is[i_3450_]
						= (i_3489_ - i_3488_
						   | i_3488_ - (i_3488_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_3491_ = aByteArray11407[i_3449_];
					if (i_3491_ != 0) {
					    int i_3492_ = (anIntArray11408
							   [i_3491_ & 0xff]);
					    int i_3493_
						= (((i_3492_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_3494_ = (((i_3492_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_3495_
						= ((i_3492_ & 0xff) * anInt9018
						   & 0xff00);
					    i_3492_ = (i_3493_ | i_3494_
						       | i_3495_) >>> 8;
					    int i_3496_ = is[i_3450_];
					    int i_3497_ = i_3492_ + i_3496_;
					    int i_3498_
						= ((i_3492_ & 0xff00ff)
						   + (i_3496_ & 0xff00ff));
					    i_3496_ = ((i_3498_ & 0x1000100)
						       + (i_3497_ - i_3498_
							  & 0x10000));
					    is[i_3450_]
						= (i_3497_ - i_3496_
						   | i_3496_ - (i_3496_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_3499_
					    = aByteArray11407[i_3449_];
					int i_3500_
					    = (i_3499_ > 0
					       ? anIntArray11408[i_3499_] : 0);
					int i_3501_ = anInt9011;
					int i_3502_ = i_3500_ + i_3501_;
					int i_3503_ = ((i_3500_ & 0xff00ff)
						       + (i_3501_ & 0xff00ff));
					int i_3504_ = ((i_3503_ & 0x1000100)
						       + (i_3502_ - i_3503_
							  & 0x10000));
					i_3504_
					    = (i_3502_ - i_3504_
					       | i_3504_ - (i_3504_ >>> 8));
					if (i_3500_ == 0 && anInt9012 != 255) {
					    i_3500_ = i_3504_;
					    i_3504_ = is[i_3450_];
					    i_3504_
						= (((((i_3500_ & 0xff00ff)
						      * anInt9012)
						     + ((i_3504_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_3500_ & 0xff00)
							* anInt9012)
						       + ((i_3504_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_3450_] = i_3504_;
				    } else if (i == 2) {
					int i_3505_ = aByteArray11407[i_3449_];
					if (i_3505_ != 0) {
					    int i_3506_ = (anIntArray11408
							   [i_3505_ & 0xff]);
					    int i_3507_
						= (((i_3506_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_3508_ = (((i_3506_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    i_3506_ = ((i_3507_ | i_3508_)
						       >>> 8) + anInt9019;
					    int i_3509_ = is[i_3450_];
					    int i_3510_ = i_3506_ + i_3509_;
					    int i_3511_
						= ((i_3506_ & 0xff00ff)
						   + (i_3509_ & 0xff00ff));
					    i_3509_ = ((i_3511_ & 0x1000100)
						       + (i_3510_ - i_3511_
							  & 0x10000));
					    is[i_3450_]
						= (i_3510_ - i_3509_
						   | i_3509_ - (i_3509_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_3445_ += anInt9001;
			    }
			}
			i_3443_++;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_3512_ = anInt8998;
		    while (i_3512_ < 0) {
			int i_3513_ = anInt8988;
			int i_3514_ = anInt9007 + anInt9009;
			int i_3515_ = anInt9003 + anInt9010;
			int i_3516_ = anInt8999;
			int i_3517_;
			if ((i_3517_ = i_3514_ - (anInt8985 << 12)) >= 0) {
			    i_3517_ = (anInt9001 - i_3517_) / anInt9001;
			    i_3516_ += i_3517_;
			    i_3514_ += anInt9001 * i_3517_;
			    i_3515_ += anInt9000 * i_3517_;
			    i_3513_ += i_3517_;
			}
			if ((i_3517_ = (i_3514_ - anInt9001) / anInt9001)
			    > i_3516_)
			    i_3516_ = i_3517_;
			if ((i_3517_ = i_3515_ - (anInt9002 << 12)) >= 0) {
			    i_3517_ = (anInt9000 - i_3517_) / anInt9000;
			    i_3516_ += i_3517_;
			    i_3514_ += anInt9001 * i_3517_;
			    i_3515_ += anInt9000 * i_3517_;
			    i_3513_ += i_3517_;
			}
			if ((i_3517_ = (i_3515_ - anInt9000) / anInt9000)
			    > i_3516_)
			    i_3516_ = i_3517_;
			for (/**/; i_3516_ < 0; i_3516_++) {
			    int i_3518_ = ((i_3515_ >> 12) * anInt8985
					   + (i_3514_ >> 12));
			    int i_3519_ = i_3513_++;
			    if (i_3235_ == 0) {
				if (i == 1)
				    is[i_3519_]
					= (anIntArray11408
					   [aByteArray11407[i_3518_] & 0xff]);
				else if (i == 0) {
				    int i_3520_
					= (anIntArray11408
					   [aByteArray11407[i_3518_] & 0xff]);
				    int i_3521_
					= ((i_3520_ & 0xff0000) * anInt9014
					   & ~0xffffff);
				    int i_3522_
					= ((i_3520_ & 0xff00) * anInt9015
					   & 0xff0000);
				    int i_3523_ = ((i_3520_ & 0xff) * anInt9018
						   & 0xff00);
				    is[i_3519_]
					= (i_3521_ | i_3522_ | i_3523_) >>> 8;
				} else if (i == 3) {
				    int i_3524_
					= (anIntArray11408
					   [aByteArray11407[i_3518_] & 0xff]);
				    int i_3525_ = anInt9011;
				    int i_3526_ = i_3524_ + i_3525_;
				    int i_3527_ = ((i_3524_ & 0xff00ff)
						   + (i_3525_ & 0xff00ff));
				    int i_3528_
					= ((i_3527_ & 0x1000100)
					   + (i_3526_ - i_3527_ & 0x10000));
				    is[i_3519_]
					= (i_3526_ - i_3528_
					   | i_3528_ - (i_3528_ >>> 8));
				} else if (i == 2) {
				    int i_3529_
					= (anIntArray11408
					   [aByteArray11407[i_3518_] & 0xff]);
				    int i_3530_
					= ((i_3529_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_3531_
					= ((i_3529_ & 0xff00) * anInt9012
					   & 0xff0000);
				    is[i_3519_] = (((i_3530_ | i_3531_) >>> 8)
						   + anInt9019);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3235_ == 1) {
				if (i == 1) {
				    int i_3532_ = aByteArray11407[i_3518_];
				    if (i_3532_ != 0)
					is[i_3519_]
					    = anIntArray11408[i_3532_ & 0xff];
				} else if (i == 0) {
				    int i_3533_ = aByteArray11407[i_3518_];
				    if (i_3533_ != 0) {
					int i_3534_
					    = anIntArray11408[i_3533_ & 0xff];
					if ((anInt9011 & 0xffffff)
					    == 16777215) {
					    int i_3535_ = anInt9011 >>> 24;
					    int i_3536_ = 256 - i_3535_;
					    int i_3537_ = is[i_3519_];
					    is[i_3519_]
						= (((((i_3534_ & 0xff00ff)
						      * i_3535_)
						     + ((i_3537_ & 0xff00ff)
							* i_3536_))
						    & ~0xff00ff)
						   + ((((i_3534_ & 0xff00)
							* i_3535_)
						       + ((i_3537_ & 0xff00)
							  * i_3536_))
						      & 0xff0000)) >> 8;
					} else if (anInt9012 != 255) {
					    int i_3538_
						= (((i_3534_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_3539_ = (((i_3534_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_3540_
						= ((i_3534_ & 0xff) * anInt9018
						   & 0xff00);
					    i_3534_ = (i_3538_ | i_3539_
						       | i_3540_) >>> 8;
					    int i_3541_ = is[i_3519_];
					    is[i_3519_]
						= (((((i_3534_ & 0xff00ff)
						      * anInt9012)
						     + ((i_3541_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_3534_ & 0xff00)
							* anInt9012)
						       + ((i_3541_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					} else {
					    int i_3542_
						= (((i_3534_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_3543_ = (((i_3534_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_3544_
						= ((i_3534_ & 0xff) * anInt9018
						   & 0xff00);
					    is[i_3519_] = (i_3542_ | i_3543_
							   | i_3544_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_3545_ = aByteArray11407[i_3518_];
				    int i_3546_
					= (i_3545_ > 0
					   ? anIntArray11408[i_3545_] : 0);
				    int i_3547_ = anInt9011;
				    int i_3548_ = i_3546_ + i_3547_;
				    int i_3549_ = ((i_3546_ & 0xff00ff)
						   + (i_3547_ & 0xff00ff));
				    int i_3550_
					= ((i_3549_ & 0x1000100)
					   + (i_3548_ - i_3549_ & 0x10000));
				    i_3550_ = (i_3548_ - i_3550_
					       | i_3550_ - (i_3550_ >>> 8));
				    if (i_3546_ == 0 && anInt9012 != 255) {
					i_3546_ = i_3550_;
					i_3550_ = is[i_3519_];
					i_3550_ = (((((i_3546_ & 0xff00ff)
						      * anInt9012)
						     + ((i_3550_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_3546_ & 0xff00)
							* anInt9012)
						       + ((i_3550_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3519_] = i_3550_;
				} else if (i == 2) {
				    int i_3551_ = aByteArray11407[i_3518_];
				    if (i_3551_ != 0) {
					int i_3552_
					    = anIntArray11408[i_3551_ & 0xff];
					int i_3553_
					    = ((i_3552_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_3554_
					    = ((i_3552_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_3519_++] = ((i_3553_ | i_3554_)
							 >>> 8) + anInt9019;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3235_ == 2) {
				if (i == 1) {
				    int i_3555_ = aByteArray11407[i_3518_];
				    if (i_3555_ != 0) {
					int i_3556_
					    = anIntArray11408[i_3555_ & 0xff];
					int i_3557_ = is[i_3519_];
					int i_3558_ = i_3556_ + i_3557_;
					int i_3559_ = ((i_3556_ & 0xff00ff)
						       + (i_3557_ & 0xff00ff));
					i_3557_ = ((i_3559_ & 0x1000100)
						   + (i_3558_ - i_3559_
						      & 0x10000));
					is[i_3519_]
					    = (i_3558_ - i_3557_
					       | i_3557_ - (i_3557_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_3560_ = aByteArray11407[i_3518_];
				    if (i_3560_ != 0) {
					int i_3561_
					    = anIntArray11408[i_3560_ & 0xff];
					int i_3562_
					    = ((i_3561_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_3563_
					    = ((i_3561_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_3564_
					    = ((i_3561_ & 0xff) * anInt9018
					       & 0xff00);
					i_3561_ = (i_3562_ | i_3563_
						   | i_3564_) >>> 8;
					int i_3565_ = is[i_3519_];
					int i_3566_ = i_3561_ + i_3565_;
					int i_3567_ = ((i_3561_ & 0xff00ff)
						       + (i_3565_ & 0xff00ff));
					i_3565_ = ((i_3567_ & 0x1000100)
						   + (i_3566_ - i_3567_
						      & 0x10000));
					is[i_3519_]
					    = (i_3566_ - i_3565_
					       | i_3565_ - (i_3565_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_3568_ = aByteArray11407[i_3518_];
				    int i_3569_
					= (i_3568_ > 0
					   ? anIntArray11408[i_3568_] : 0);
				    int i_3570_ = anInt9011;
				    int i_3571_ = i_3569_ + i_3570_;
				    int i_3572_ = ((i_3569_ & 0xff00ff)
						   + (i_3570_ & 0xff00ff));
				    int i_3573_
					= ((i_3572_ & 0x1000100)
					   + (i_3571_ - i_3572_ & 0x10000));
				    i_3573_ = (i_3571_ - i_3573_
					       | i_3573_ - (i_3573_ >>> 8));
				    if (i_3569_ == 0 && anInt9012 != 255) {
					i_3569_ = i_3573_;
					i_3573_ = is[i_3519_];
					i_3573_ = (((((i_3569_ & 0xff00ff)
						      * anInt9012)
						     + ((i_3573_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_3569_ & 0xff00)
							* anInt9012)
						       + ((i_3573_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3519_] = i_3573_;
				} else if (i == 2) {
				    int i_3574_ = aByteArray11407[i_3518_];
				    if (i_3574_ != 0) {
					int i_3575_
					    = anIntArray11408[i_3574_ & 0xff];
					int i_3576_
					    = ((i_3575_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_3577_
					    = ((i_3575_ & 0xff00) * anInt9012
					       & 0xff0000);
					i_3575_ = (((i_3576_ | i_3577_) >>> 8)
						   + anInt9019);
					int i_3578_ = is[i_3519_];
					int i_3579_ = i_3575_ + i_3578_;
					int i_3580_ = ((i_3575_ & 0xff00ff)
						       + (i_3578_ & 0xff00ff));
					i_3578_ = ((i_3580_ & 0x1000100)
						   + (i_3579_ - i_3580_
						      & 0x10000));
					is[i_3519_]
					    = (i_3579_ - i_3578_
					       | i_3578_ - (i_3578_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_3514_ += anInt9001;
			    i_3515_ += anInt9000;
			}
			i_3512_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_3581_ = anInt8998;
		    while (i_3581_ < 0) {
			int i_3582_ = anInt8988;
			int i_3583_ = anInt9007 + anInt9009;
			int i_3584_ = anInt9003 + anInt9010;
			int i_3585_ = anInt8999;
			int i_3586_;
			if ((i_3586_ = i_3583_ - (anInt8985 << 12)) >= 0) {
			    i_3586_ = (anInt9001 - i_3586_) / anInt9001;
			    i_3585_ += i_3586_;
			    i_3583_ += anInt9001 * i_3586_;
			    i_3584_ += anInt9000 * i_3586_;
			    i_3582_ += i_3586_;
			}
			if ((i_3586_ = (i_3583_ - anInt9001) / anInt9001)
			    > i_3585_)
			    i_3585_ = i_3586_;
			if (i_3584_ < 0) {
			    i_3586_ = (anInt9000 - 1 - i_3584_) / anInt9000;
			    i_3585_ += i_3586_;
			    i_3583_ += anInt9001 * i_3586_;
			    i_3584_ += anInt9000 * i_3586_;
			    i_3582_ += i_3586_;
			}
			if ((i_3586_ = (1 + i_3584_ - (anInt9002 << 12)
					- anInt9000) / anInt9000)
			    > i_3585_)
			    i_3585_ = i_3586_;
			for (/**/; i_3585_ < 0; i_3585_++) {
			    int i_3587_ = ((i_3584_ >> 12) * anInt8985
					   + (i_3583_ >> 12));
			    int i_3588_ = i_3582_++;
			    if (i_3235_ == 0) {
				if (i == 1)
				    is[i_3588_]
					= (anIntArray11408
					   [aByteArray11407[i_3587_] & 0xff]);
				else if (i == 0) {
				    int i_3589_
					= (anIntArray11408
					   [aByteArray11407[i_3587_] & 0xff]);
				    int i_3590_
					= ((i_3589_ & 0xff0000) * anInt9014
					   & ~0xffffff);
				    int i_3591_
					= ((i_3589_ & 0xff00) * anInt9015
					   & 0xff0000);
				    int i_3592_ = ((i_3589_ & 0xff) * anInt9018
						   & 0xff00);
				    is[i_3588_]
					= (i_3590_ | i_3591_ | i_3592_) >>> 8;
				} else if (i == 3) {
				    int i_3593_
					= (anIntArray11408
					   [aByteArray11407[i_3587_] & 0xff]);
				    int i_3594_ = anInt9011;
				    int i_3595_ = i_3593_ + i_3594_;
				    int i_3596_ = ((i_3593_ & 0xff00ff)
						   + (i_3594_ & 0xff00ff));
				    int i_3597_
					= ((i_3596_ & 0x1000100)
					   + (i_3595_ - i_3596_ & 0x10000));
				    is[i_3588_]
					= (i_3595_ - i_3597_
					   | i_3597_ - (i_3597_ >>> 8));
				} else if (i == 2) {
				    int i_3598_
					= (anIntArray11408
					   [aByteArray11407[i_3587_] & 0xff]);
				    int i_3599_
					= ((i_3598_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_3600_
					= ((i_3598_ & 0xff00) * anInt9012
					   & 0xff0000);
				    is[i_3588_] = (((i_3599_ | i_3600_) >>> 8)
						   + anInt9019);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3235_ == 1) {
				if (i == 1) {
				    int i_3601_ = aByteArray11407[i_3587_];
				    if (i_3601_ != 0)
					is[i_3588_]
					    = anIntArray11408[i_3601_ & 0xff];
				} else if (i == 0) {
				    int i_3602_ = aByteArray11407[i_3587_];
				    if (i_3602_ != 0) {
					int i_3603_
					    = anIntArray11408[i_3602_ & 0xff];
					if ((anInt9011 & 0xffffff)
					    == 16777215) {
					    int i_3604_ = anInt9011 >>> 24;
					    int i_3605_ = 256 - i_3604_;
					    int i_3606_ = is[i_3588_];
					    is[i_3588_]
						= (((((i_3603_ & 0xff00ff)
						      * i_3604_)
						     + ((i_3606_ & 0xff00ff)
							* i_3605_))
						    & ~0xff00ff)
						   + ((((i_3603_ & 0xff00)
							* i_3604_)
						       + ((i_3606_ & 0xff00)
							  * i_3605_))
						      & 0xff0000)) >> 8;
					} else if (anInt9012 != 255) {
					    int i_3607_
						= (((i_3603_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_3608_ = (((i_3603_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_3609_
						= ((i_3603_ & 0xff) * anInt9018
						   & 0xff00);
					    i_3603_ = (i_3607_ | i_3608_
						       | i_3609_) >>> 8;
					    int i_3610_ = is[i_3588_];
					    is[i_3588_]
						= (((((i_3603_ & 0xff00ff)
						      * anInt9012)
						     + ((i_3610_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_3603_ & 0xff00)
							* anInt9012)
						       + ((i_3610_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					} else {
					    int i_3611_
						= (((i_3603_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_3612_ = (((i_3603_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_3613_
						= ((i_3603_ & 0xff) * anInt9018
						   & 0xff00);
					    is[i_3588_] = (i_3611_ | i_3612_
							   | i_3613_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_3614_ = aByteArray11407[i_3587_];
				    int i_3615_
					= (i_3614_ > 0
					   ? anIntArray11408[i_3614_] : 0);
				    int i_3616_ = anInt9011;
				    int i_3617_ = i_3615_ + i_3616_;
				    int i_3618_ = ((i_3615_ & 0xff00ff)
						   + (i_3616_ & 0xff00ff));
				    int i_3619_
					= ((i_3618_ & 0x1000100)
					   + (i_3617_ - i_3618_ & 0x10000));
				    i_3619_ = (i_3617_ - i_3619_
					       | i_3619_ - (i_3619_ >>> 8));
				    if (i_3615_ == 0 && anInt9012 != 255) {
					i_3615_ = i_3619_;
					i_3619_ = is[i_3588_];
					i_3619_ = (((((i_3615_ & 0xff00ff)
						      * anInt9012)
						     + ((i_3619_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_3615_ & 0xff00)
							* anInt9012)
						       + ((i_3619_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3588_] = i_3619_;
				} else if (i == 2) {
				    int i_3620_ = aByteArray11407[i_3587_];
				    if (i_3620_ != 0) {
					int i_3621_
					    = anIntArray11408[i_3620_ & 0xff];
					int i_3622_
					    = ((i_3621_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_3623_
					    = ((i_3621_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_3588_++] = ((i_3622_ | i_3623_)
							 >>> 8) + anInt9019;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3235_ == 2) {
				if (i == 1) {
				    int i_3624_ = aByteArray11407[i_3587_];
				    if (i_3624_ != 0) {
					int i_3625_
					    = anIntArray11408[i_3624_ & 0xff];
					int i_3626_ = is[i_3588_];
					int i_3627_ = i_3625_ + i_3626_;
					int i_3628_ = ((i_3625_ & 0xff00ff)
						       + (i_3626_ & 0xff00ff));
					i_3626_ = ((i_3628_ & 0x1000100)
						   + (i_3627_ - i_3628_
						      & 0x10000));
					is[i_3588_]
					    = (i_3627_ - i_3626_
					       | i_3626_ - (i_3626_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_3629_ = aByteArray11407[i_3587_];
				    if (i_3629_ != 0) {
					int i_3630_
					    = anIntArray11408[i_3629_ & 0xff];
					int i_3631_
					    = ((i_3630_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_3632_
					    = ((i_3630_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_3633_
					    = ((i_3630_ & 0xff) * anInt9018
					       & 0xff00);
					i_3630_ = (i_3631_ | i_3632_
						   | i_3633_) >>> 8;
					int i_3634_ = is[i_3588_];
					int i_3635_ = i_3630_ + i_3634_;
					int i_3636_ = ((i_3630_ & 0xff00ff)
						       + (i_3634_ & 0xff00ff));
					i_3634_ = ((i_3636_ & 0x1000100)
						   + (i_3635_ - i_3636_
						      & 0x10000));
					is[i_3588_]
					    = (i_3635_ - i_3634_
					       | i_3634_ - (i_3634_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_3637_ = aByteArray11407[i_3587_];
				    int i_3638_
					= (i_3637_ > 0
					   ? anIntArray11408[i_3637_] : 0);
				    int i_3639_ = anInt9011;
				    int i_3640_ = i_3638_ + i_3639_;
				    int i_3641_ = ((i_3638_ & 0xff00ff)
						   + (i_3639_ & 0xff00ff));
				    int i_3642_
					= ((i_3641_ & 0x1000100)
					   + (i_3640_ - i_3641_ & 0x10000));
				    i_3642_ = (i_3640_ - i_3642_
					       | i_3642_ - (i_3642_ >>> 8));
				    if (i_3638_ == 0 && anInt9012 != 255) {
					i_3638_ = i_3642_;
					i_3642_ = is[i_3588_];
					i_3642_ = (((((i_3638_ & 0xff00ff)
						      * anInt9012)
						     + ((i_3642_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_3638_ & 0xff00)
							* anInt9012)
						       + ((i_3642_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3588_] = i_3642_;
				} else if (i == 2) {
				    int i_3643_ = aByteArray11407[i_3587_];
				    if (i_3643_ != 0) {
					int i_3644_
					    = anIntArray11408[i_3643_ & 0xff];
					int i_3645_
					    = ((i_3644_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_3646_
					    = ((i_3644_ & 0xff00) * anInt9012
					       & 0xff0000);
					i_3644_ = (((i_3645_ | i_3646_) >>> 8)
						   + anInt9019);
					int i_3647_ = is[i_3588_];
					int i_3648_ = i_3644_ + i_3647_;
					int i_3649_ = ((i_3644_ & 0xff00ff)
						       + (i_3647_ & 0xff00ff));
					i_3647_ = ((i_3649_ & 0x1000100)
						   + (i_3648_ - i_3649_
						      & 0x10000));
					is[i_3588_]
					    = (i_3648_ - i_3647_
					       | i_3647_ - (i_3647_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_3583_ += anInt9001;
			    i_3584_ += anInt9000;
			}
			i_3581_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9000 == 0) {
		int i_3650_ = anInt8998;
		while (i_3650_ < 0) {
		    int i_3651_ = anInt8988;
		    int i_3652_ = anInt9007 + anInt9009;
		    int i_3653_ = anInt9003;
		    int i_3654_ = anInt8999;
		    if (i_3653_ >= 0 && i_3653_ - (anInt9002 << 12) < 0) {
			if (i_3652_ < 0) {
			    int i_3655_
				= (anInt9001 - 1 - i_3652_) / anInt9001;
			    i_3654_ += i_3655_;
			    i_3652_ += anInt9001 * i_3655_;
			    i_3651_ += i_3655_;
			}
			int i_3656_;
			if ((i_3656_ = (1 + i_3652_ - (anInt8985 << 12)
					- anInt9001) / anInt9001)
			    > i_3654_)
			    i_3654_ = i_3656_;
			for (/**/; i_3654_ < 0; i_3654_++) {
			    int i_3657_ = ((i_3653_ >> 12) * anInt8985
					   + (i_3652_ >> 12));
			    int i_3658_ = i_3651_++;
			    if (i_3235_ == 0) {
				if (i == 1)
				    is[i_3658_]
					= (anIntArray11408
					   [aByteArray11407[i_3657_] & 0xff]);
				else if (i == 0) {
				    int i_3659_
					= (anIntArray11408
					   [aByteArray11407[i_3657_] & 0xff]);
				    int i_3660_
					= ((i_3659_ & 0xff0000) * anInt9014
					   & ~0xffffff);
				    int i_3661_
					= ((i_3659_ & 0xff00) * anInt9015
					   & 0xff0000);
				    int i_3662_ = ((i_3659_ & 0xff) * anInt9018
						   & 0xff00);
				    is[i_3658_]
					= (i_3660_ | i_3661_ | i_3662_) >>> 8;
				} else if (i == 3) {
				    int i_3663_
					= (anIntArray11408
					   [aByteArray11407[i_3657_] & 0xff]);
				    int i_3664_ = anInt9011;
				    int i_3665_ = i_3663_ + i_3664_;
				    int i_3666_ = ((i_3663_ & 0xff00ff)
						   + (i_3664_ & 0xff00ff));
				    int i_3667_
					= ((i_3666_ & 0x1000100)
					   + (i_3665_ - i_3666_ & 0x10000));
				    is[i_3658_]
					= (i_3665_ - i_3667_
					   | i_3667_ - (i_3667_ >>> 8));
				} else if (i == 2) {
				    int i_3668_
					= (anIntArray11408
					   [aByteArray11407[i_3657_] & 0xff]);
				    int i_3669_
					= ((i_3668_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_3670_
					= ((i_3668_ & 0xff00) * anInt9012
					   & 0xff0000);
				    is[i_3658_] = (((i_3669_ | i_3670_) >>> 8)
						   + anInt9019);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3235_ == 1) {
				if (i == 1) {
				    int i_3671_ = aByteArray11407[i_3657_];
				    if (i_3671_ != 0)
					is[i_3658_]
					    = anIntArray11408[i_3671_ & 0xff];
				} else if (i == 0) {
				    int i_3672_ = aByteArray11407[i_3657_];
				    if (i_3672_ != 0) {
					int i_3673_
					    = anIntArray11408[i_3672_ & 0xff];
					if ((anInt9011 & 0xffffff)
					    == 16777215) {
					    int i_3674_ = anInt9011 >>> 24;
					    int i_3675_ = 256 - i_3674_;
					    int i_3676_ = is[i_3658_];
					    is[i_3658_]
						= (((((i_3673_ & 0xff00ff)
						      * i_3674_)
						     + ((i_3676_ & 0xff00ff)
							* i_3675_))
						    & ~0xff00ff)
						   + ((((i_3673_ & 0xff00)
							* i_3674_)
						       + ((i_3676_ & 0xff00)
							  * i_3675_))
						      & 0xff0000)) >> 8;
					} else if (anInt9012 != 255) {
					    int i_3677_
						= (((i_3673_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_3678_ = (((i_3673_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_3679_
						= ((i_3673_ & 0xff) * anInt9018
						   & 0xff00);
					    i_3673_ = (i_3677_ | i_3678_
						       | i_3679_) >>> 8;
					    int i_3680_ = is[i_3658_];
					    is[i_3658_]
						= (((((i_3673_ & 0xff00ff)
						      * anInt9012)
						     + ((i_3680_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_3673_ & 0xff00)
							* anInt9012)
						       + ((i_3680_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					} else {
					    int i_3681_
						= (((i_3673_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_3682_ = (((i_3673_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_3683_
						= ((i_3673_ & 0xff) * anInt9018
						   & 0xff00);
					    is[i_3658_] = (i_3681_ | i_3682_
							   | i_3683_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_3684_ = aByteArray11407[i_3657_];
				    int i_3685_
					= (i_3684_ > 0
					   ? anIntArray11408[i_3684_] : 0);
				    int i_3686_ = anInt9011;
				    int i_3687_ = i_3685_ + i_3686_;
				    int i_3688_ = ((i_3685_ & 0xff00ff)
						   + (i_3686_ & 0xff00ff));
				    int i_3689_
					= ((i_3688_ & 0x1000100)
					   + (i_3687_ - i_3688_ & 0x10000));
				    i_3689_ = (i_3687_ - i_3689_
					       | i_3689_ - (i_3689_ >>> 8));
				    if (i_3685_ == 0 && anInt9012 != 255) {
					i_3685_ = i_3689_;
					i_3689_ = is[i_3658_];
					i_3689_ = (((((i_3685_ & 0xff00ff)
						      * anInt9012)
						     + ((i_3689_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_3685_ & 0xff00)
							* anInt9012)
						       + ((i_3689_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3658_] = i_3689_;
				} else if (i == 2) {
				    int i_3690_ = aByteArray11407[i_3657_];
				    if (i_3690_ != 0) {
					int i_3691_
					    = anIntArray11408[i_3690_ & 0xff];
					int i_3692_
					    = ((i_3691_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_3693_
					    = ((i_3691_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_3658_++] = ((i_3692_ | i_3693_)
							 >>> 8) + anInt9019;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3235_ == 2) {
				if (i == 1) {
				    int i_3694_ = aByteArray11407[i_3657_];
				    if (i_3694_ != 0) {
					int i_3695_
					    = anIntArray11408[i_3694_ & 0xff];
					int i_3696_ = is[i_3658_];
					int i_3697_ = i_3695_ + i_3696_;
					int i_3698_ = ((i_3695_ & 0xff00ff)
						       + (i_3696_ & 0xff00ff));
					i_3696_ = ((i_3698_ & 0x1000100)
						   + (i_3697_ - i_3698_
						      & 0x10000));
					is[i_3658_]
					    = (i_3697_ - i_3696_
					       | i_3696_ - (i_3696_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_3699_ = aByteArray11407[i_3657_];
				    if (i_3699_ != 0) {
					int i_3700_
					    = anIntArray11408[i_3699_ & 0xff];
					int i_3701_
					    = ((i_3700_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_3702_
					    = ((i_3700_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_3703_
					    = ((i_3700_ & 0xff) * anInt9018
					       & 0xff00);
					i_3700_ = (i_3701_ | i_3702_
						   | i_3703_) >>> 8;
					int i_3704_ = is[i_3658_];
					int i_3705_ = i_3700_ + i_3704_;
					int i_3706_ = ((i_3700_ & 0xff00ff)
						       + (i_3704_ & 0xff00ff));
					i_3704_ = ((i_3706_ & 0x1000100)
						   + (i_3705_ - i_3706_
						      & 0x10000));
					is[i_3658_]
					    = (i_3705_ - i_3704_
					       | i_3704_ - (i_3704_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_3707_ = aByteArray11407[i_3657_];
				    int i_3708_
					= (i_3707_ > 0
					   ? anIntArray11408[i_3707_] : 0);
				    int i_3709_ = anInt9011;
				    int i_3710_ = i_3708_ + i_3709_;
				    int i_3711_ = ((i_3708_ & 0xff00ff)
						   + (i_3709_ & 0xff00ff));
				    int i_3712_
					= ((i_3711_ & 0x1000100)
					   + (i_3710_ - i_3711_ & 0x10000));
				    i_3712_ = (i_3710_ - i_3712_
					       | i_3712_ - (i_3712_ >>> 8));
				    if (i_3708_ == 0 && anInt9012 != 255) {
					i_3708_ = i_3712_;
					i_3712_ = is[i_3658_];
					i_3712_ = (((((i_3708_ & 0xff00ff)
						      * anInt9012)
						     + ((i_3712_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_3708_ & 0xff00)
							* anInt9012)
						       + ((i_3712_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3658_] = i_3712_;
				} else if (i == 2) {
				    int i_3713_ = aByteArray11407[i_3657_];
				    if (i_3713_ != 0) {
					int i_3714_
					    = anIntArray11408[i_3713_ & 0xff];
					int i_3715_
					    = ((i_3714_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_3716_
					    = ((i_3714_ & 0xff00) * anInt9012
					       & 0xff0000);
					i_3714_ = (((i_3715_ | i_3716_) >>> 8)
						   + anInt9019);
					int i_3717_ = is[i_3658_];
					int i_3718_ = i_3714_ + i_3717_;
					int i_3719_ = ((i_3714_ & 0xff00ff)
						       + (i_3717_ & 0xff00ff));
					i_3717_ = ((i_3719_ & 0x1000100)
						   + (i_3718_ - i_3719_
						      & 0x10000));
					is[i_3658_]
					    = (i_3718_ - i_3717_
					       | i_3717_ - (i_3717_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_3652_ += anInt9001;
			}
		    }
		    i_3650_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else if (anInt9000 < 0) {
		for (int i_3720_ = anInt8998; i_3720_ < 0; i_3720_++) {
		    int i_3721_ = anInt8988;
		    int i_3722_ = anInt9007 + anInt9009;
		    int i_3723_ = anInt9003 + anInt9010;
		    int i_3724_ = anInt8999;
		    if (i_3722_ < 0) {
			int i_3725_ = (anInt9001 - 1 - i_3722_) / anInt9001;
			i_3724_ += i_3725_;
			i_3722_ += anInt9001 * i_3725_;
			i_3723_ += anInt9000 * i_3725_;
			i_3721_ += i_3725_;
		    }
		    int i_3726_;
		    if ((i_3726_ = (1 + i_3722_ - (anInt8985 << 12)
				    - anInt9001) / anInt9001)
			> i_3724_)
			i_3724_ = i_3726_;
		    if ((i_3726_ = i_3723_ - (anInt9002 << 12)) >= 0) {
			i_3726_ = (anInt9000 - i_3726_) / anInt9000;
			i_3724_ += i_3726_;
			i_3722_ += anInt9001 * i_3726_;
			i_3723_ += anInt9000 * i_3726_;
			i_3721_ += i_3726_;
		    }
		    if ((i_3726_ = (i_3723_ - anInt9000) / anInt9000)
			> i_3724_)
			i_3724_ = i_3726_;
		    for (/**/; i_3724_ < 0; i_3724_++) {
			int i_3727_
			    = (i_3723_ >> 12) * anInt8985 + (i_3722_ >> 12);
			int i_3728_ = i_3721_++;
			if (i_3235_ == 0) {
			    if (i == 1)
				is[i_3728_]
				    = (anIntArray11408
				       [aByteArray11407[i_3727_] & 0xff]);
			    else if (i == 0) {
				int i_3729_
				    = (anIntArray11408
				       [aByteArray11407[i_3727_] & 0xff]);
				int i_3730_ = ((i_3729_ & 0xff0000) * anInt9014
					       & ~0xffffff);
				int i_3731_ = ((i_3729_ & 0xff00) * anInt9015
					       & 0xff0000);
				int i_3732_
				    = (i_3729_ & 0xff) * anInt9018 & 0xff00;
				is[i_3728_]
				    = (i_3730_ | i_3731_ | i_3732_) >>> 8;
			    } else if (i == 3) {
				int i_3733_
				    = (anIntArray11408
				       [aByteArray11407[i_3727_] & 0xff]);
				int i_3734_ = anInt9011;
				int i_3735_ = i_3733_ + i_3734_;
				int i_3736_ = ((i_3733_ & 0xff00ff)
					       + (i_3734_ & 0xff00ff));
				int i_3737_
				    = ((i_3736_ & 0x1000100)
				       + (i_3735_ - i_3736_ & 0x10000));
				is[i_3728_]
				    = i_3735_ - i_3737_ | i_3737_ - (i_3737_
								     >>> 8);
			    } else if (i == 2) {
				int i_3738_
				    = (anIntArray11408
				       [aByteArray11407[i_3727_] & 0xff]);
				int i_3739_ = ((i_3738_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
				int i_3740_ = ((i_3738_ & 0xff00) * anInt9012
					       & 0xff0000);
				is[i_3728_]
				    = ((i_3739_ | i_3740_) >>> 8) + anInt9019;
			    } else
				throw new IllegalArgumentException();
			} else if (i_3235_ == 1) {
			    if (i == 1) {
				int i_3741_ = aByteArray11407[i_3727_];
				if (i_3741_ != 0)
				    is[i_3728_]
					= anIntArray11408[i_3741_ & 0xff];
			    } else if (i == 0) {
				int i_3742_ = aByteArray11407[i_3727_];
				if (i_3742_ != 0) {
				    int i_3743_
					= anIntArray11408[i_3742_ & 0xff];
				    if ((anInt9011 & 0xffffff) == 16777215) {
					int i_3744_ = anInt9011 >>> 24;
					int i_3745_ = 256 - i_3744_;
					int i_3746_ = is[i_3728_];
					is[i_3728_]
					    = ((((i_3743_ & 0xff00ff) * i_3744_
						 + ((i_3746_ & 0xff00ff)
						    * i_3745_))
						& ~0xff00ff)
					       + (((i_3743_ & 0xff00) * i_3744_
						   + ((i_3746_ & 0xff00)
						      * i_3745_))
						  & 0xff0000)) >> 8;
				    } else if (anInt9012 != 255) {
					int i_3747_
					    = ((i_3743_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_3748_
					    = ((i_3743_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_3749_
					    = ((i_3743_ & 0xff) * anInt9018
					       & 0xff00);
					i_3743_ = (i_3747_ | i_3748_
						   | i_3749_) >>> 8;
					int i_3750_ = is[i_3728_];
					is[i_3728_]
					    = (((((i_3743_ & 0xff00ff)
						  * anInt9012)
						 + ((i_3750_ & 0xff00ff)
						    * anInt9013))
						& ~0xff00ff)
					       + ((((i_3743_ & 0xff00)
						    * anInt9012)
						   + ((i_3750_ & 0xff00)
						      * anInt9013))
						  & 0xff0000)) >> 8;
				    } else {
					int i_3751_
					    = ((i_3743_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_3752_
					    = ((i_3743_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_3753_
					    = ((i_3743_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_3728_] = (i_3751_ | i_3752_
						       | i_3753_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_3754_ = aByteArray11407[i_3727_];
				int i_3755_ = (i_3754_ > 0
					       ? anIntArray11408[i_3754_] : 0);
				int i_3756_ = anInt9011;
				int i_3757_ = i_3755_ + i_3756_;
				int i_3758_ = ((i_3755_ & 0xff00ff)
					       + (i_3756_ & 0xff00ff));
				int i_3759_
				    = ((i_3758_ & 0x1000100)
				       + (i_3757_ - i_3758_ & 0x10000));
				i_3759_
				    = i_3757_ - i_3759_ | i_3759_ - (i_3759_
								     >>> 8);
				if (i_3755_ == 0 && anInt9012 != 255) {
				    i_3755_ = i_3759_;
				    i_3759_ = is[i_3728_];
				    i_3759_
					= ((((i_3755_ & 0xff00ff) * anInt9012
					     + ((i_3759_ & 0xff00ff)
						* anInt9013))
					    & ~0xff00ff)
					   + (((i_3755_ & 0xff00) * anInt9012
					       + ((i_3759_ & 0xff00)
						  * anInt9013))
					      & 0xff0000)) >> 8;
				}
				is[i_3728_] = i_3759_;
			    } else if (i == 2) {
				int i_3760_ = aByteArray11407[i_3727_];
				if (i_3760_ != 0) {
				    int i_3761_
					= anIntArray11408[i_3760_ & 0xff];
				    int i_3762_
					= ((i_3761_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_3763_
					= ((i_3761_ & 0xff00) * anInt9012
					   & 0xff0000);
				    is[i_3728_++] = ((i_3762_ | i_3763_)
						     >>> 8) + anInt9019;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_3235_ == 2) {
			    if (i == 1) {
				int i_3764_ = aByteArray11407[i_3727_];
				if (i_3764_ != 0) {
				    int i_3765_
					= anIntArray11408[i_3764_ & 0xff];
				    int i_3766_ = is[i_3728_];
				    int i_3767_ = i_3765_ + i_3766_;
				    int i_3768_ = ((i_3765_ & 0xff00ff)
						   + (i_3766_ & 0xff00ff));
				    i_3766_
					= ((i_3768_ & 0x1000100)
					   + (i_3767_ - i_3768_ & 0x10000));
				    is[i_3728_]
					= (i_3767_ - i_3766_
					   | i_3766_ - (i_3766_ >>> 8));
				}
			    } else if (i == 0) {
				int i_3769_ = aByteArray11407[i_3727_];
				if (i_3769_ != 0) {
				    int i_3770_
					= anIntArray11408[i_3769_ & 0xff];
				    int i_3771_
					= ((i_3770_ & 0xff0000) * anInt9014
					   & ~0xffffff);
				    int i_3772_
					= ((i_3770_ & 0xff00) * anInt9015
					   & 0xff0000);
				    int i_3773_ = ((i_3770_ & 0xff) * anInt9018
						   & 0xff00);
				    i_3770_
					= (i_3771_ | i_3772_ | i_3773_) >>> 8;
				    int i_3774_ = is[i_3728_];
				    int i_3775_ = i_3770_ + i_3774_;
				    int i_3776_ = ((i_3770_ & 0xff00ff)
						   + (i_3774_ & 0xff00ff));
				    i_3774_
					= ((i_3776_ & 0x1000100)
					   + (i_3775_ - i_3776_ & 0x10000));
				    is[i_3728_]
					= (i_3775_ - i_3774_
					   | i_3774_ - (i_3774_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_3777_ = aByteArray11407[i_3727_];
				int i_3778_ = (i_3777_ > 0
					       ? anIntArray11408[i_3777_] : 0);
				int i_3779_ = anInt9011;
				int i_3780_ = i_3778_ + i_3779_;
				int i_3781_ = ((i_3778_ & 0xff00ff)
					       + (i_3779_ & 0xff00ff));
				int i_3782_
				    = ((i_3781_ & 0x1000100)
				       + (i_3780_ - i_3781_ & 0x10000));
				i_3782_
				    = i_3780_ - i_3782_ | i_3782_ - (i_3782_
								     >>> 8);
				if (i_3778_ == 0 && anInt9012 != 255) {
				    i_3778_ = i_3782_;
				    i_3782_ = is[i_3728_];
				    i_3782_
					= ((((i_3778_ & 0xff00ff) * anInt9012
					     + ((i_3782_ & 0xff00ff)
						* anInt9013))
					    & ~0xff00ff)
					   + (((i_3778_ & 0xff00) * anInt9012
					       + ((i_3782_ & 0xff00)
						  * anInt9013))
					      & 0xff0000)) >> 8;
				}
				is[i_3728_] = i_3782_;
			    } else if (i == 2) {
				int i_3783_ = aByteArray11407[i_3727_];
				if (i_3783_ != 0) {
				    int i_3784_
					= anIntArray11408[i_3783_ & 0xff];
				    int i_3785_
					= ((i_3784_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_3786_
					= ((i_3784_ & 0xff00) * anInt9012
					   & 0xff0000);
				    i_3784_ = (((i_3785_ | i_3786_) >>> 8)
					       + anInt9019);
				    int i_3787_ = is[i_3728_];
				    int i_3788_ = i_3784_ + i_3787_;
				    int i_3789_ = ((i_3784_ & 0xff00ff)
						   + (i_3787_ & 0xff00ff));
				    i_3787_
					= ((i_3789_ & 0x1000100)
					   + (i_3788_ - i_3789_ & 0x10000));
				    is[i_3728_]
					= (i_3788_ - i_3787_
					   | i_3787_ - (i_3787_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_3722_ += anInt9001;
			i_3723_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else {
		for (int i_3790_ = anInt8998; i_3790_ < 0; i_3790_++) {
		    int i_3791_ = anInt8988;
		    int i_3792_ = anInt9007 + anInt9009;
		    int i_3793_ = anInt9003 + anInt9010;
		    int i_3794_ = anInt8999;
		    if (i_3792_ < 0) {
			int i_3795_ = (anInt9001 - 1 - i_3792_) / anInt9001;
			i_3794_ += i_3795_;
			i_3792_ += anInt9001 * i_3795_;
			i_3793_ += anInt9000 * i_3795_;
			i_3791_ += i_3795_;
		    }
		    int i_3796_;
		    if ((i_3796_ = (1 + i_3792_ - (anInt8985 << 12)
				    - anInt9001) / anInt9001)
			> i_3794_)
			i_3794_ = i_3796_;
		    if (i_3793_ < 0) {
			i_3796_ = (anInt9000 - 1 - i_3793_) / anInt9000;
			i_3794_ += i_3796_;
			i_3792_ += anInt9001 * i_3796_;
			i_3793_ += anInt9000 * i_3796_;
			i_3791_ += i_3796_;
		    }
		    if ((i_3796_ = (1 + i_3793_ - (anInt9002 << 12)
				    - anInt9000) / anInt9000)
			> i_3794_)
			i_3794_ = i_3796_;
		    for (/**/; i_3794_ < 0; i_3794_++) {
			int i_3797_
			    = (i_3793_ >> 12) * anInt8985 + (i_3792_ >> 12);
			int i_3798_ = i_3791_++;
			if (i_3235_ == 0) {
			    if (i == 1)
				is[i_3798_]
				    = (anIntArray11408
				       [aByteArray11407[i_3797_] & 0xff]);
			    else if (i == 0) {
				int i_3799_
				    = (anIntArray11408
				       [aByteArray11407[i_3797_] & 0xff]);
				int i_3800_ = ((i_3799_ & 0xff0000) * anInt9014
					       & ~0xffffff);
				int i_3801_ = ((i_3799_ & 0xff00) * anInt9015
					       & 0xff0000);
				int i_3802_
				    = (i_3799_ & 0xff) * anInt9018 & 0xff00;
				is[i_3798_]
				    = (i_3800_ | i_3801_ | i_3802_) >>> 8;
			    } else if (i == 3) {
				int i_3803_
				    = (anIntArray11408
				       [aByteArray11407[i_3797_] & 0xff]);
				int i_3804_ = anInt9011;
				int i_3805_ = i_3803_ + i_3804_;
				int i_3806_ = ((i_3803_ & 0xff00ff)
					       + (i_3804_ & 0xff00ff));
				int i_3807_
				    = ((i_3806_ & 0x1000100)
				       + (i_3805_ - i_3806_ & 0x10000));
				is[i_3798_]
				    = i_3805_ - i_3807_ | i_3807_ - (i_3807_
								     >>> 8);
			    } else if (i == 2) {
				int i_3808_
				    = (anIntArray11408
				       [aByteArray11407[i_3797_] & 0xff]);
				int i_3809_ = ((i_3808_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
				int i_3810_ = ((i_3808_ & 0xff00) * anInt9012
					       & 0xff0000);
				is[i_3798_]
				    = ((i_3809_ | i_3810_) >>> 8) + anInt9019;
			    } else
				throw new IllegalArgumentException();
			} else if (i_3235_ == 1) {
			    if (i == 1) {
				int i_3811_ = aByteArray11407[i_3797_];
				if (i_3811_ != 0)
				    is[i_3798_]
					= anIntArray11408[i_3811_ & 0xff];
			    } else if (i == 0) {
				int i_3812_ = aByteArray11407[i_3797_];
				if (i_3812_ != 0) {
				    int i_3813_
					= anIntArray11408[i_3812_ & 0xff];
				    if ((anInt9011 & 0xffffff) == 16777215) {
					int i_3814_ = anInt9011 >>> 24;
					int i_3815_ = 256 - i_3814_;
					int i_3816_ = is[i_3798_];
					is[i_3798_]
					    = ((((i_3813_ & 0xff00ff) * i_3814_
						 + ((i_3816_ & 0xff00ff)
						    * i_3815_))
						& ~0xff00ff)
					       + (((i_3813_ & 0xff00) * i_3814_
						   + ((i_3816_ & 0xff00)
						      * i_3815_))
						  & 0xff0000)) >> 8;
				    } else if (anInt9012 != 255) {
					int i_3817_
					    = ((i_3813_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_3818_
					    = ((i_3813_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_3819_
					    = ((i_3813_ & 0xff) * anInt9018
					       & 0xff00);
					i_3813_ = (i_3817_ | i_3818_
						   | i_3819_) >>> 8;
					int i_3820_ = is[i_3798_];
					is[i_3798_]
					    = (((((i_3813_ & 0xff00ff)
						  * anInt9012)
						 + ((i_3820_ & 0xff00ff)
						    * anInt9013))
						& ~0xff00ff)
					       + ((((i_3813_ & 0xff00)
						    * anInt9012)
						   + ((i_3820_ & 0xff00)
						      * anInt9013))
						  & 0xff0000)) >> 8;
				    } else {
					int i_3821_
					    = ((i_3813_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_3822_
					    = ((i_3813_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_3823_
					    = ((i_3813_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_3798_] = (i_3821_ | i_3822_
						       | i_3823_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_3824_ = aByteArray11407[i_3797_];
				int i_3825_ = (i_3824_ > 0
					       ? anIntArray11408[i_3824_] : 0);
				int i_3826_ = anInt9011;
				int i_3827_ = i_3825_ + i_3826_;
				int i_3828_ = ((i_3825_ & 0xff00ff)
					       + (i_3826_ & 0xff00ff));
				int i_3829_
				    = ((i_3828_ & 0x1000100)
				       + (i_3827_ - i_3828_ & 0x10000));
				i_3829_
				    = i_3827_ - i_3829_ | i_3829_ - (i_3829_
								     >>> 8);
				if (i_3825_ == 0 && anInt9012 != 255) {
				    i_3825_ = i_3829_;
				    i_3829_ = is[i_3798_];
				    i_3829_
					= ((((i_3825_ & 0xff00ff) * anInt9012
					     + ((i_3829_ & 0xff00ff)
						* anInt9013))
					    & ~0xff00ff)
					   + (((i_3825_ & 0xff00) * anInt9012
					       + ((i_3829_ & 0xff00)
						  * anInt9013))
					      & 0xff0000)) >> 8;
				}
				is[i_3798_] = i_3829_;
			    } else if (i == 2) {
				int i_3830_ = aByteArray11407[i_3797_];
				if (i_3830_ != 0) {
				    int i_3831_
					= anIntArray11408[i_3830_ & 0xff];
				    int i_3832_
					= ((i_3831_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_3833_
					= ((i_3831_ & 0xff00) * anInt9012
					   & 0xff0000);
				    is[i_3798_++] = ((i_3832_ | i_3833_)
						     >>> 8) + anInt9019;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_3235_ == 2) {
			    if (i == 1) {
				int i_3834_ = aByteArray11407[i_3797_];
				if (i_3834_ != 0) {
				    int i_3835_
					= anIntArray11408[i_3834_ & 0xff];
				    int i_3836_ = is[i_3798_];
				    int i_3837_ = i_3835_ + i_3836_;
				    int i_3838_ = ((i_3835_ & 0xff00ff)
						   + (i_3836_ & 0xff00ff));
				    i_3836_
					= ((i_3838_ & 0x1000100)
					   + (i_3837_ - i_3838_ & 0x10000));
				    is[i_3798_]
					= (i_3837_ - i_3836_
					   | i_3836_ - (i_3836_ >>> 8));
				}
			    } else if (i == 0) {
				int i_3839_ = aByteArray11407[i_3797_];
				if (i_3839_ != 0) {
				    int i_3840_
					= anIntArray11408[i_3839_ & 0xff];
				    int i_3841_
					= ((i_3840_ & 0xff0000) * anInt9014
					   & ~0xffffff);
				    int i_3842_
					= ((i_3840_ & 0xff00) * anInt9015
					   & 0xff0000);
				    int i_3843_ = ((i_3840_ & 0xff) * anInt9018
						   & 0xff00);
				    i_3840_
					= (i_3841_ | i_3842_ | i_3843_) >>> 8;
				    int i_3844_ = is[i_3798_];
				    int i_3845_ = i_3840_ + i_3844_;
				    int i_3846_ = ((i_3840_ & 0xff00ff)
						   + (i_3844_ & 0xff00ff));
				    i_3844_
					= ((i_3846_ & 0x1000100)
					   + (i_3845_ - i_3846_ & 0x10000));
				    is[i_3798_]
					= (i_3845_ - i_3844_
					   | i_3844_ - (i_3844_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_3847_ = aByteArray11407[i_3797_];
				int i_3848_ = (i_3847_ > 0
					       ? anIntArray11408[i_3847_] : 0);
				int i_3849_ = anInt9011;
				int i_3850_ = i_3848_ + i_3849_;
				int i_3851_ = ((i_3848_ & 0xff00ff)
					       + (i_3849_ & 0xff00ff));
				int i_3852_
				    = ((i_3851_ & 0x1000100)
				       + (i_3850_ - i_3851_ & 0x10000));
				i_3852_
				    = i_3850_ - i_3852_ | i_3852_ - (i_3852_
								     >>> 8);
				if (i_3848_ == 0 && anInt9012 != 255) {
				    i_3848_ = i_3852_;
				    i_3852_ = is[i_3798_];
				    i_3852_
					= ((((i_3848_ & 0xff00ff) * anInt9012
					     + ((i_3852_ & 0xff00ff)
						* anInt9013))
					    & ~0xff00ff)
					   + (((i_3848_ & 0xff00) * anInt9012
					       + ((i_3852_ & 0xff00)
						  * anInt9013))
					      & 0xff0000)) >> 8;
				}
				is[i_3798_] = i_3852_;
			    } else if (i == 2) {
				int i_3853_ = aByteArray11407[i_3797_];
				if (i_3853_ != 0) {
				    int i_3854_
					= anIntArray11408[i_3853_ & 0xff];
				    int i_3855_
					= ((i_3854_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_3856_
					= ((i_3854_ & 0xff00) * anInt9012
					   & 0xff0000);
				    i_3854_ = (((i_3855_ | i_3856_) >>> 8)
					       + anInt9019);
				    int i_3857_ = is[i_3798_];
				    int i_3858_ = i_3854_ + i_3857_;
				    int i_3859_ = ((i_3854_ & 0xff00ff)
						   + (i_3857_ & 0xff00ff));
				    i_3857_
					= ((i_3859_ & 0x1000100)
					   + (i_3858_ - i_3859_ & 0x10000));
				    is[i_3798_]
					= (i_3858_ - i_3857_
					   | i_3857_ - (i_3857_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_3792_ += anInt9001;
			i_3793_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    }
	}
    }
    
    void method14516(int i, int i_3860_) {
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    if (anInt9001 == 0) {
		if (anInt9000 == 0) {
		    int i_3861_ = anInt8998;
		    while (i_3861_ < 0) {
			int i_3862_ = anInt8988;
			int i_3863_ = anInt9007;
			int i_3864_ = anInt9003;
			int i_3865_ = anInt8999;
			if (i_3863_ >= 0 && i_3864_ >= 0
			    && i_3863_ - (anInt8985 << 12) < 0
			    && i_3864_ - (anInt9002 << 12) < 0) {
			    for (/**/; i_3865_ < 0; i_3865_++) {
				int i_3866_ = ((i_3864_ >> 12) * anInt8985
					       + (i_3863_ >> 12));
				int i_3867_ = i_3862_++;
				if (i_3860_ == 0) {
				    if (i == 1)
					is[i_3867_]
					    = (anIntArray11408
					       [(aByteArray11407[i_3866_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_3868_
					    = (anIntArray11408
					       [(aByteArray11407[i_3866_]
						 & 0xff)]);
					int i_3869_
					    = ((i_3868_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_3870_
					    = ((i_3868_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_3871_
					    = ((i_3868_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_3867_] = (i_3869_ | i_3870_
						       | i_3871_) >>> 8;
				    } else if (i == 3) {
					int i_3872_
					    = (anIntArray11408
					       [(aByteArray11407[i_3866_]
						 & 0xff)]);
					int i_3873_ = anInt9011;
					int i_3874_ = i_3872_ + i_3873_;
					int i_3875_ = ((i_3872_ & 0xff00ff)
						       + (i_3873_ & 0xff00ff));
					int i_3876_ = ((i_3875_ & 0x1000100)
						       + (i_3874_ - i_3875_
							  & 0x10000));
					is[i_3867_]
					    = (i_3874_ - i_3876_
					       | i_3876_ - (i_3876_ >>> 8));
				    } else if (i == 2) {
					int i_3877_
					    = (anIntArray11408
					       [(aByteArray11407[i_3866_]
						 & 0xff)]);
					int i_3878_
					    = ((i_3877_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_3879_
					    = ((i_3877_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_3867_] = ((i_3878_ | i_3879_)
						       >>> 8) + anInt9019;
				    } else
					throw new IllegalArgumentException();
				} else if (i_3860_ == 1) {
				    if (i == 1) {
					int i_3880_ = aByteArray11407[i_3866_];
					if (i_3880_ != 0)
					    is[i_3867_] = (anIntArray11408
							   [i_3880_ & 0xff]);
				    } else if (i == 0) {
					int i_3881_ = aByteArray11407[i_3866_];
					if (i_3881_ != 0) {
					    int i_3882_ = (anIntArray11408
							   [i_3881_ & 0xff]);
					    if ((anInt9011 & 0xffffff)
						== 16777215) {
						int i_3883_ = anInt9011 >>> 24;
						int i_3884_ = 256 - i_3883_;
						int i_3885_ = is[i_3867_];
						is[i_3867_]
						    = (((((i_3882_ & 0xff00ff)
							  * i_3883_)
							 + ((i_3885_
							     & 0xff00ff)
							    * i_3884_))
							& ~0xff00ff)
						       + ((((i_3882_ & 0xff00)
							    * i_3883_)
							   + ((i_3885_
							       & 0xff00)
							      * i_3884_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9012 != 255) {
						int i_3886_
						    = (((i_3882_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_3887_
						    = (((i_3882_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_3888_
						    = (((i_3882_ & 0xff)
							* anInt9018)
						       & 0xff00);
						i_3882_ = (i_3886_ | i_3887_
							   | i_3888_) >>> 8;
						int i_3889_ = is[i_3867_];
						is[i_3867_]
						    = (((((i_3882_ & 0xff00ff)
							  * anInt9012)
							 + ((i_3889_
							     & 0xff00ff)
							    * anInt9013))
							& ~0xff00ff)
						       + ((((i_3882_ & 0xff00)
							    * anInt9012)
							   + ((i_3889_
							       & 0xff00)
							      * anInt9013))
							  & 0xff0000)) >> 8;
					    } else {
						int i_3890_
						    = (((i_3882_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_3891_
						    = (((i_3882_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_3892_
						    = (((i_3882_ & 0xff)
							* anInt9018)
						       & 0xff00);
						is[i_3867_]
						    = (i_3890_ | i_3891_
						       | i_3892_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_3893_
					    = aByteArray11407[i_3866_];
					int i_3894_
					    = (i_3893_ > 0
					       ? anIntArray11408[i_3893_] : 0);
					int i_3895_ = anInt9011;
					int i_3896_ = i_3894_ + i_3895_;
					int i_3897_ = ((i_3894_ & 0xff00ff)
						       + (i_3895_ & 0xff00ff));
					int i_3898_ = ((i_3897_ & 0x1000100)
						       + (i_3896_ - i_3897_
							  & 0x10000));
					i_3898_
					    = (i_3896_ - i_3898_
					       | i_3898_ - (i_3898_ >>> 8));
					if (i_3894_ == 0 && anInt9012 != 255) {
					    i_3894_ = i_3898_;
					    i_3898_ = is[i_3867_];
					    i_3898_
						= (((((i_3894_ & 0xff00ff)
						      * anInt9012)
						     + ((i_3898_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_3894_ & 0xff00)
							* anInt9012)
						       + ((i_3898_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_3867_] = i_3898_;
				    } else if (i == 2) {
					int i_3899_ = aByteArray11407[i_3866_];
					if (i_3899_ != 0) {
					    int i_3900_ = (anIntArray11408
							   [i_3899_ & 0xff]);
					    int i_3901_
						= (((i_3900_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_3902_ = (((i_3900_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    is[i_3867_++]
						= (((i_3901_ | i_3902_) >>> 8)
						   + anInt9019);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_3860_ == 2) {
				    if (i == 1) {
					int i_3903_ = aByteArray11407[i_3866_];
					if (i_3903_ != 0) {
					    int i_3904_ = (anIntArray11408
							   [i_3903_ & 0xff]);
					    int i_3905_ = is[i_3867_];
					    int i_3906_ = i_3904_ + i_3905_;
					    int i_3907_
						= ((i_3904_ & 0xff00ff)
						   + (i_3905_ & 0xff00ff));
					    i_3905_ = ((i_3907_ & 0x1000100)
						       + (i_3906_ - i_3907_
							  & 0x10000));
					    is[i_3867_]
						= (i_3906_ - i_3905_
						   | i_3905_ - (i_3905_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_3908_ = aByteArray11407[i_3866_];
					if (i_3908_ != 0) {
					    int i_3909_ = (anIntArray11408
							   [i_3908_ & 0xff]);
					    int i_3910_
						= (((i_3909_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_3911_ = (((i_3909_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_3912_
						= ((i_3909_ & 0xff) * anInt9018
						   & 0xff00);
					    i_3909_ = (i_3910_ | i_3911_
						       | i_3912_) >>> 8;
					    int i_3913_ = is[i_3867_];
					    int i_3914_ = i_3909_ + i_3913_;
					    int i_3915_
						= ((i_3909_ & 0xff00ff)
						   + (i_3913_ & 0xff00ff));
					    i_3913_ = ((i_3915_ & 0x1000100)
						       + (i_3914_ - i_3915_
							  & 0x10000));
					    is[i_3867_]
						= (i_3914_ - i_3913_
						   | i_3913_ - (i_3913_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_3916_
					    = aByteArray11407[i_3866_];
					int i_3917_
					    = (i_3916_ > 0
					       ? anIntArray11408[i_3916_] : 0);
					int i_3918_ = anInt9011;
					int i_3919_ = i_3917_ + i_3918_;
					int i_3920_ = ((i_3917_ & 0xff00ff)
						       + (i_3918_ & 0xff00ff));
					int i_3921_ = ((i_3920_ & 0x1000100)
						       + (i_3919_ - i_3920_
							  & 0x10000));
					i_3921_
					    = (i_3919_ - i_3921_
					       | i_3921_ - (i_3921_ >>> 8));
					if (i_3917_ == 0 && anInt9012 != 255) {
					    i_3917_ = i_3921_;
					    i_3921_ = is[i_3867_];
					    i_3921_
						= (((((i_3917_ & 0xff00ff)
						      * anInt9012)
						     + ((i_3921_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_3917_ & 0xff00)
							* anInt9012)
						       + ((i_3921_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_3867_] = i_3921_;
				    } else if (i == 2) {
					int i_3922_ = aByteArray11407[i_3866_];
					if (i_3922_ != 0) {
					    int i_3923_ = (anIntArray11408
							   [i_3922_ & 0xff]);
					    int i_3924_
						= (((i_3923_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_3925_ = (((i_3923_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    i_3923_ = ((i_3924_ | i_3925_)
						       >>> 8) + anInt9019;
					    int i_3926_ = is[i_3867_];
					    int i_3927_ = i_3923_ + i_3926_;
					    int i_3928_
						= ((i_3923_ & 0xff00ff)
						   + (i_3926_ & 0xff00ff));
					    i_3926_ = ((i_3928_ & 0x1000100)
						       + (i_3927_ - i_3928_
							  & 0x10000));
					    is[i_3867_]
						= (i_3927_ - i_3926_
						   | i_3926_ - (i_3926_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
			    }
			}
			i_3861_++;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_3929_ = anInt8998;
		    while (i_3929_ < 0) {
			int i_3930_ = anInt8988;
			int i_3931_ = anInt9007;
			int i_3932_ = anInt9003 + anInt9010;
			int i_3933_ = anInt8999;
			if (i_3931_ >= 0 && i_3931_ - (anInt8985 << 12) < 0) {
			    int i_3934_;
			    if ((i_3934_ = i_3932_ - (anInt9002 << 12)) >= 0) {
				i_3934_ = (anInt9000 - i_3934_) / anInt9000;
				i_3933_ += i_3934_;
				i_3932_ += anInt9000 * i_3934_;
				i_3930_ += i_3934_;
			    }
			    if ((i_3934_ = (i_3932_ - anInt9000) / anInt9000)
				> i_3933_)
				i_3933_ = i_3934_;
			    for (/**/; i_3933_ < 0; i_3933_++) {
				int i_3935_ = ((i_3932_ >> 12) * anInt8985
					       + (i_3931_ >> 12));
				int i_3936_ = i_3930_++;
				if (i_3860_ == 0) {
				    if (i == 1)
					is[i_3936_]
					    = (anIntArray11408
					       [(aByteArray11407[i_3935_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_3937_
					    = (anIntArray11408
					       [(aByteArray11407[i_3935_]
						 & 0xff)]);
					int i_3938_
					    = ((i_3937_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_3939_
					    = ((i_3937_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_3940_
					    = ((i_3937_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_3936_] = (i_3938_ | i_3939_
						       | i_3940_) >>> 8;
				    } else if (i == 3) {
					int i_3941_
					    = (anIntArray11408
					       [(aByteArray11407[i_3935_]
						 & 0xff)]);
					int i_3942_ = anInt9011;
					int i_3943_ = i_3941_ + i_3942_;
					int i_3944_ = ((i_3941_ & 0xff00ff)
						       + (i_3942_ & 0xff00ff));
					int i_3945_ = ((i_3944_ & 0x1000100)
						       + (i_3943_ - i_3944_
							  & 0x10000));
					is[i_3936_]
					    = (i_3943_ - i_3945_
					       | i_3945_ - (i_3945_ >>> 8));
				    } else if (i == 2) {
					int i_3946_
					    = (anIntArray11408
					       [(aByteArray11407[i_3935_]
						 & 0xff)]);
					int i_3947_
					    = ((i_3946_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_3948_
					    = ((i_3946_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_3936_] = ((i_3947_ | i_3948_)
						       >>> 8) + anInt9019;
				    } else
					throw new IllegalArgumentException();
				} else if (i_3860_ == 1) {
				    if (i == 1) {
					int i_3949_ = aByteArray11407[i_3935_];
					if (i_3949_ != 0)
					    is[i_3936_] = (anIntArray11408
							   [i_3949_ & 0xff]);
				    } else if (i == 0) {
					int i_3950_ = aByteArray11407[i_3935_];
					if (i_3950_ != 0) {
					    int i_3951_ = (anIntArray11408
							   [i_3950_ & 0xff]);
					    if ((anInt9011 & 0xffffff)
						== 16777215) {
						int i_3952_ = anInt9011 >>> 24;
						int i_3953_ = 256 - i_3952_;
						int i_3954_ = is[i_3936_];
						is[i_3936_]
						    = (((((i_3951_ & 0xff00ff)
							  * i_3952_)
							 + ((i_3954_
							     & 0xff00ff)
							    * i_3953_))
							& ~0xff00ff)
						       + ((((i_3951_ & 0xff00)
							    * i_3952_)
							   + ((i_3954_
							       & 0xff00)
							      * i_3953_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9012 != 255) {
						int i_3955_
						    = (((i_3951_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_3956_
						    = (((i_3951_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_3957_
						    = (((i_3951_ & 0xff)
							* anInt9018)
						       & 0xff00);
						i_3951_ = (i_3955_ | i_3956_
							   | i_3957_) >>> 8;
						int i_3958_ = is[i_3936_];
						is[i_3936_]
						    = (((((i_3951_ & 0xff00ff)
							  * anInt9012)
							 + ((i_3958_
							     & 0xff00ff)
							    * anInt9013))
							& ~0xff00ff)
						       + ((((i_3951_ & 0xff00)
							    * anInt9012)
							   + ((i_3958_
							       & 0xff00)
							      * anInt9013))
							  & 0xff0000)) >> 8;
					    } else {
						int i_3959_
						    = (((i_3951_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_3960_
						    = (((i_3951_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_3961_
						    = (((i_3951_ & 0xff)
							* anInt9018)
						       & 0xff00);
						is[i_3936_]
						    = (i_3959_ | i_3960_
						       | i_3961_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_3962_
					    = aByteArray11407[i_3935_];
					int i_3963_
					    = (i_3962_ > 0
					       ? anIntArray11408[i_3962_] : 0);
					int i_3964_ = anInt9011;
					int i_3965_ = i_3963_ + i_3964_;
					int i_3966_ = ((i_3963_ & 0xff00ff)
						       + (i_3964_ & 0xff00ff));
					int i_3967_ = ((i_3966_ & 0x1000100)
						       + (i_3965_ - i_3966_
							  & 0x10000));
					i_3967_
					    = (i_3965_ - i_3967_
					       | i_3967_ - (i_3967_ >>> 8));
					if (i_3963_ == 0 && anInt9012 != 255) {
					    i_3963_ = i_3967_;
					    i_3967_ = is[i_3936_];
					    i_3967_
						= (((((i_3963_ & 0xff00ff)
						      * anInt9012)
						     + ((i_3967_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_3963_ & 0xff00)
							* anInt9012)
						       + ((i_3967_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_3936_] = i_3967_;
				    } else if (i == 2) {
					int i_3968_ = aByteArray11407[i_3935_];
					if (i_3968_ != 0) {
					    int i_3969_ = (anIntArray11408
							   [i_3968_ & 0xff]);
					    int i_3970_
						= (((i_3969_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_3971_ = (((i_3969_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    is[i_3936_++]
						= (((i_3970_ | i_3971_) >>> 8)
						   + anInt9019);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_3860_ == 2) {
				    if (i == 1) {
					int i_3972_ = aByteArray11407[i_3935_];
					if (i_3972_ != 0) {
					    int i_3973_ = (anIntArray11408
							   [i_3972_ & 0xff]);
					    int i_3974_ = is[i_3936_];
					    int i_3975_ = i_3973_ + i_3974_;
					    int i_3976_
						= ((i_3973_ & 0xff00ff)
						   + (i_3974_ & 0xff00ff));
					    i_3974_ = ((i_3976_ & 0x1000100)
						       + (i_3975_ - i_3976_
							  & 0x10000));
					    is[i_3936_]
						= (i_3975_ - i_3974_
						   | i_3974_ - (i_3974_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_3977_ = aByteArray11407[i_3935_];
					if (i_3977_ != 0) {
					    int i_3978_ = (anIntArray11408
							   [i_3977_ & 0xff]);
					    int i_3979_
						= (((i_3978_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_3980_ = (((i_3978_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_3981_
						= ((i_3978_ & 0xff) * anInt9018
						   & 0xff00);
					    i_3978_ = (i_3979_ | i_3980_
						       | i_3981_) >>> 8;
					    int i_3982_ = is[i_3936_];
					    int i_3983_ = i_3978_ + i_3982_;
					    int i_3984_
						= ((i_3978_ & 0xff00ff)
						   + (i_3982_ & 0xff00ff));
					    i_3982_ = ((i_3984_ & 0x1000100)
						       + (i_3983_ - i_3984_
							  & 0x10000));
					    is[i_3936_]
						= (i_3983_ - i_3982_
						   | i_3982_ - (i_3982_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_3985_
					    = aByteArray11407[i_3935_];
					int i_3986_
					    = (i_3985_ > 0
					       ? anIntArray11408[i_3985_] : 0);
					int i_3987_ = anInt9011;
					int i_3988_ = i_3986_ + i_3987_;
					int i_3989_ = ((i_3986_ & 0xff00ff)
						       + (i_3987_ & 0xff00ff));
					int i_3990_ = ((i_3989_ & 0x1000100)
						       + (i_3988_ - i_3989_
							  & 0x10000));
					i_3990_
					    = (i_3988_ - i_3990_
					       | i_3990_ - (i_3990_ >>> 8));
					if (i_3986_ == 0 && anInt9012 != 255) {
					    i_3986_ = i_3990_;
					    i_3990_ = is[i_3936_];
					    i_3990_
						= (((((i_3986_ & 0xff00ff)
						      * anInt9012)
						     + ((i_3990_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_3986_ & 0xff00)
							* anInt9012)
						       + ((i_3990_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_3936_] = i_3990_;
				    } else if (i == 2) {
					int i_3991_ = aByteArray11407[i_3935_];
					if (i_3991_ != 0) {
					    int i_3992_ = (anIntArray11408
							   [i_3991_ & 0xff]);
					    int i_3993_
						= (((i_3992_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_3994_ = (((i_3992_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    i_3992_ = ((i_3993_ | i_3994_)
						       >>> 8) + anInt9019;
					    int i_3995_ = is[i_3936_];
					    int i_3996_ = i_3992_ + i_3995_;
					    int i_3997_
						= ((i_3992_ & 0xff00ff)
						   + (i_3995_ & 0xff00ff));
					    i_3995_ = ((i_3997_ & 0x1000100)
						       + (i_3996_ - i_3997_
							  & 0x10000));
					    is[i_3936_]
						= (i_3996_ - i_3995_
						   | i_3995_ - (i_3995_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_3932_ += anInt9000;
			    }
			}
			i_3929_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_3998_ = anInt8998;
		    while (i_3998_ < 0) {
			int i_3999_ = anInt8988;
			int i_4000_ = anInt9007;
			int i_4001_ = anInt9003 + anInt9010;
			int i_4002_ = anInt8999;
			if (i_4000_ >= 0 && i_4000_ - (anInt8985 << 12) < 0) {
			    if (i_4001_ < 0) {
				int i_4003_
				    = (anInt9000 - 1 - i_4001_) / anInt9000;
				i_4002_ += i_4003_;
				i_4001_ += anInt9000 * i_4003_;
				i_3999_ += i_4003_;
			    }
			    int i_4004_;
			    if ((i_4004_ = (1 + i_4001_ - (anInt9002 << 12)
					    - anInt9000) / anInt9000)
				> i_4002_)
				i_4002_ = i_4004_;
			    for (/**/; i_4002_ < 0; i_4002_++) {
				int i_4005_ = ((i_4001_ >> 12) * anInt8985
					       + (i_4000_ >> 12));
				int i_4006_ = i_3999_++;
				if (i_3860_ == 0) {
				    if (i == 1)
					is[i_4006_]
					    = (anIntArray11408
					       [(aByteArray11407[i_4005_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_4007_
					    = (anIntArray11408
					       [(aByteArray11407[i_4005_]
						 & 0xff)]);
					int i_4008_
					    = ((i_4007_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_4009_
					    = ((i_4007_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_4010_
					    = ((i_4007_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_4006_] = (i_4008_ | i_4009_
						       | i_4010_) >>> 8;
				    } else if (i == 3) {
					int i_4011_
					    = (anIntArray11408
					       [(aByteArray11407[i_4005_]
						 & 0xff)]);
					int i_4012_ = anInt9011;
					int i_4013_ = i_4011_ + i_4012_;
					int i_4014_ = ((i_4011_ & 0xff00ff)
						       + (i_4012_ & 0xff00ff));
					int i_4015_ = ((i_4014_ & 0x1000100)
						       + (i_4013_ - i_4014_
							  & 0x10000));
					is[i_4006_]
					    = (i_4013_ - i_4015_
					       | i_4015_ - (i_4015_ >>> 8));
				    } else if (i == 2) {
					int i_4016_
					    = (anIntArray11408
					       [(aByteArray11407[i_4005_]
						 & 0xff)]);
					int i_4017_
					    = ((i_4016_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_4018_
					    = ((i_4016_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_4006_] = ((i_4017_ | i_4018_)
						       >>> 8) + anInt9019;
				    } else
					throw new IllegalArgumentException();
				} else if (i_3860_ == 1) {
				    if (i == 1) {
					int i_4019_ = aByteArray11407[i_4005_];
					if (i_4019_ != 0)
					    is[i_4006_] = (anIntArray11408
							   [i_4019_ & 0xff]);
				    } else if (i == 0) {
					int i_4020_ = aByteArray11407[i_4005_];
					if (i_4020_ != 0) {
					    int i_4021_ = (anIntArray11408
							   [i_4020_ & 0xff]);
					    if ((anInt9011 & 0xffffff)
						== 16777215) {
						int i_4022_ = anInt9011 >>> 24;
						int i_4023_ = 256 - i_4022_;
						int i_4024_ = is[i_4006_];
						is[i_4006_]
						    = (((((i_4021_ & 0xff00ff)
							  * i_4022_)
							 + ((i_4024_
							     & 0xff00ff)
							    * i_4023_))
							& ~0xff00ff)
						       + ((((i_4021_ & 0xff00)
							    * i_4022_)
							   + ((i_4024_
							       & 0xff00)
							      * i_4023_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9012 != 255) {
						int i_4025_
						    = (((i_4021_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_4026_
						    = (((i_4021_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_4027_
						    = (((i_4021_ & 0xff)
							* anInt9018)
						       & 0xff00);
						i_4021_ = (i_4025_ | i_4026_
							   | i_4027_) >>> 8;
						int i_4028_ = is[i_4006_];
						is[i_4006_]
						    = (((((i_4021_ & 0xff00ff)
							  * anInt9012)
							 + ((i_4028_
							     & 0xff00ff)
							    * anInt9013))
							& ~0xff00ff)
						       + ((((i_4021_ & 0xff00)
							    * anInt9012)
							   + ((i_4028_
							       & 0xff00)
							      * anInt9013))
							  & 0xff0000)) >> 8;
					    } else {
						int i_4029_
						    = (((i_4021_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_4030_
						    = (((i_4021_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_4031_
						    = (((i_4021_ & 0xff)
							* anInt9018)
						       & 0xff00);
						is[i_4006_]
						    = (i_4029_ | i_4030_
						       | i_4031_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_4032_
					    = aByteArray11407[i_4005_];
					int i_4033_
					    = (i_4032_ > 0
					       ? anIntArray11408[i_4032_] : 0);
					int i_4034_ = anInt9011;
					int i_4035_ = i_4033_ + i_4034_;
					int i_4036_ = ((i_4033_ & 0xff00ff)
						       + (i_4034_ & 0xff00ff));
					int i_4037_ = ((i_4036_ & 0x1000100)
						       + (i_4035_ - i_4036_
							  & 0x10000));
					i_4037_
					    = (i_4035_ - i_4037_
					       | i_4037_ - (i_4037_ >>> 8));
					if (i_4033_ == 0 && anInt9012 != 255) {
					    i_4033_ = i_4037_;
					    i_4037_ = is[i_4006_];
					    i_4037_
						= (((((i_4033_ & 0xff00ff)
						      * anInt9012)
						     + ((i_4037_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_4033_ & 0xff00)
							* anInt9012)
						       + ((i_4037_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_4006_] = i_4037_;
				    } else if (i == 2) {
					int i_4038_ = aByteArray11407[i_4005_];
					if (i_4038_ != 0) {
					    int i_4039_ = (anIntArray11408
							   [i_4038_ & 0xff]);
					    int i_4040_
						= (((i_4039_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_4041_ = (((i_4039_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    is[i_4006_++]
						= (((i_4040_ | i_4041_) >>> 8)
						   + anInt9019);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_3860_ == 2) {
				    if (i == 1) {
					int i_4042_ = aByteArray11407[i_4005_];
					if (i_4042_ != 0) {
					    int i_4043_ = (anIntArray11408
							   [i_4042_ & 0xff]);
					    int i_4044_ = is[i_4006_];
					    int i_4045_ = i_4043_ + i_4044_;
					    int i_4046_
						= ((i_4043_ & 0xff00ff)
						   + (i_4044_ & 0xff00ff));
					    i_4044_ = ((i_4046_ & 0x1000100)
						       + (i_4045_ - i_4046_
							  & 0x10000));
					    is[i_4006_]
						= (i_4045_ - i_4044_
						   | i_4044_ - (i_4044_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_4047_ = aByteArray11407[i_4005_];
					if (i_4047_ != 0) {
					    int i_4048_ = (anIntArray11408
							   [i_4047_ & 0xff]);
					    int i_4049_
						= (((i_4048_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_4050_ = (((i_4048_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_4051_
						= ((i_4048_ & 0xff) * anInt9018
						   & 0xff00);
					    i_4048_ = (i_4049_ | i_4050_
						       | i_4051_) >>> 8;
					    int i_4052_ = is[i_4006_];
					    int i_4053_ = i_4048_ + i_4052_;
					    int i_4054_
						= ((i_4048_ & 0xff00ff)
						   + (i_4052_ & 0xff00ff));
					    i_4052_ = ((i_4054_ & 0x1000100)
						       + (i_4053_ - i_4054_
							  & 0x10000));
					    is[i_4006_]
						= (i_4053_ - i_4052_
						   | i_4052_ - (i_4052_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_4055_
					    = aByteArray11407[i_4005_];
					int i_4056_
					    = (i_4055_ > 0
					       ? anIntArray11408[i_4055_] : 0);
					int i_4057_ = anInt9011;
					int i_4058_ = i_4056_ + i_4057_;
					int i_4059_ = ((i_4056_ & 0xff00ff)
						       + (i_4057_ & 0xff00ff));
					int i_4060_ = ((i_4059_ & 0x1000100)
						       + (i_4058_ - i_4059_
							  & 0x10000));
					i_4060_
					    = (i_4058_ - i_4060_
					       | i_4060_ - (i_4060_ >>> 8));
					if (i_4056_ == 0 && anInt9012 != 255) {
					    i_4056_ = i_4060_;
					    i_4060_ = is[i_4006_];
					    i_4060_
						= (((((i_4056_ & 0xff00ff)
						      * anInt9012)
						     + ((i_4060_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_4056_ & 0xff00)
							* anInt9012)
						       + ((i_4060_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_4006_] = i_4060_;
				    } else if (i == 2) {
					int i_4061_ = aByteArray11407[i_4005_];
					if (i_4061_ != 0) {
					    int i_4062_ = (anIntArray11408
							   [i_4061_ & 0xff]);
					    int i_4063_
						= (((i_4062_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_4064_ = (((i_4062_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    i_4062_ = ((i_4063_ | i_4064_)
						       >>> 8) + anInt9019;
					    int i_4065_ = is[i_4006_];
					    int i_4066_ = i_4062_ + i_4065_;
					    int i_4067_
						= ((i_4062_ & 0xff00ff)
						   + (i_4065_ & 0xff00ff));
					    i_4065_ = ((i_4067_ & 0x1000100)
						       + (i_4066_ - i_4067_
							  & 0x10000));
					    is[i_4006_]
						= (i_4066_ - i_4065_
						   | i_4065_ - (i_4065_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_4001_ += anInt9000;
			    }
			}
			i_3998_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9001 < 0) {
		if (anInt9000 == 0) {
		    int i_4068_ = anInt8998;
		    while (i_4068_ < 0) {
			int i_4069_ = anInt8988;
			int i_4070_ = anInt9007 + anInt9009;
			int i_4071_ = anInt9003;
			int i_4072_ = anInt8999;
			if (i_4071_ >= 0 && i_4071_ - (anInt9002 << 12) < 0) {
			    int i_4073_;
			    if ((i_4073_ = i_4070_ - (anInt8985 << 12)) >= 0) {
				i_4073_ = (anInt9001 - i_4073_) / anInt9001;
				i_4072_ += i_4073_;
				i_4070_ += anInt9001 * i_4073_;
				i_4069_ += i_4073_;
			    }
			    if ((i_4073_ = (i_4070_ - anInt9001) / anInt9001)
				> i_4072_)
				i_4072_ = i_4073_;
			    for (/**/; i_4072_ < 0; i_4072_++) {
				int i_4074_ = ((i_4071_ >> 12) * anInt8985
					       + (i_4070_ >> 12));
				int i_4075_ = i_4069_++;
				if (i_3860_ == 0) {
				    if (i == 1)
					is[i_4075_]
					    = (anIntArray11408
					       [(aByteArray11407[i_4074_]
						 & 0xff)]);
				    else if (i == 0) {
					int i_4076_
					    = (anIntArray11408
					       [(aByteArray11407[i_4074_]
						 & 0xff)]);
					int i_4077_
					    = ((i_4076_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_4078_
					    = ((i_4076_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_4079_
					    = ((i_4076_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_4075_] = (i_4077_ | i_4078_
						       | i_4079_) >>> 8;
				    } else if (i == 3) {
					int i_4080_
					    = (anIntArray11408
					       [(aByteArray11407[i_4074_]
						 & 0xff)]);
					int i_4081_ = anInt9011;
					int i_4082_ = i_4080_ + i_4081_;
					int i_4083_ = ((i_4080_ & 0xff00ff)
						       + (i_4081_ & 0xff00ff));
					int i_4084_ = ((i_4083_ & 0x1000100)
						       + (i_4082_ - i_4083_
							  & 0x10000));
					is[i_4075_]
					    = (i_4082_ - i_4084_
					       | i_4084_ - (i_4084_ >>> 8));
				    } else if (i == 2) {
					int i_4085_
					    = (anIntArray11408
					       [(aByteArray11407[i_4074_]
						 & 0xff)]);
					int i_4086_
					    = ((i_4085_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_4087_
					    = ((i_4085_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_4075_] = ((i_4086_ | i_4087_)
						       >>> 8) + anInt9019;
				    } else
					throw new IllegalArgumentException();
				} else if (i_3860_ == 1) {
				    if (i == 1) {
					int i_4088_ = aByteArray11407[i_4074_];
					if (i_4088_ != 0)
					    is[i_4075_] = (anIntArray11408
							   [i_4088_ & 0xff]);
				    } else if (i == 0) {
					int i_4089_ = aByteArray11407[i_4074_];
					if (i_4089_ != 0) {
					    int i_4090_ = (anIntArray11408
							   [i_4089_ & 0xff]);
					    if ((anInt9011 & 0xffffff)
						== 16777215) {
						int i_4091_ = anInt9011 >>> 24;
						int i_4092_ = 256 - i_4091_;
						int i_4093_ = is[i_4075_];
						is[i_4075_]
						    = (((((i_4090_ & 0xff00ff)
							  * i_4091_)
							 + ((i_4093_
							     & 0xff00ff)
							    * i_4092_))
							& ~0xff00ff)
						       + ((((i_4090_ & 0xff00)
							    * i_4091_)
							   + ((i_4093_
							       & 0xff00)
							      * i_4092_))
							  & 0xff0000)) >> 8;
					    } else if (anInt9012 != 255) {
						int i_4094_
						    = (((i_4090_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_4095_
						    = (((i_4090_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_4096_
						    = (((i_4090_ & 0xff)
							* anInt9018)
						       & 0xff00);
						i_4090_ = (i_4094_ | i_4095_
							   | i_4096_) >>> 8;
						int i_4097_ = is[i_4075_];
						is[i_4075_]
						    = (((((i_4090_ & 0xff00ff)
							  * anInt9012)
							 + ((i_4097_
							     & 0xff00ff)
							    * anInt9013))
							& ~0xff00ff)
						       + ((((i_4090_ & 0xff00)
							    * anInt9012)
							   + ((i_4097_
							       & 0xff00)
							      * anInt9013))
							  & 0xff0000)) >> 8;
					    } else {
						int i_4098_
						    = (((i_4090_ & 0xff0000)
							* anInt9014)
						       & ~0xffffff);
						int i_4099_
						    = (((i_4090_ & 0xff00)
							* anInt9015)
						       & 0xff0000);
						int i_4100_
						    = (((i_4090_ & 0xff)
							* anInt9018)
						       & 0xff00);
						is[i_4075_]
						    = (i_4098_ | i_4099_
						       | i_4100_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_4101_
					    = aByteArray11407[i_4074_];
					int i_4102_
					    = (i_4101_ > 0
					       ? anIntArray11408[i_4101_] : 0);
					int i_4103_ = anInt9011;
					int i_4104_ = i_4102_ + i_4103_;
					int i_4105_ = ((i_4102_ & 0xff00ff)
						       + (i_4103_ & 0xff00ff));
					int i_4106_ = ((i_4105_ & 0x1000100)
						       + (i_4104_ - i_4105_
							  & 0x10000));
					i_4106_
					    = (i_4104_ - i_4106_
					       | i_4106_ - (i_4106_ >>> 8));
					if (i_4102_ == 0 && anInt9012 != 255) {
					    i_4102_ = i_4106_;
					    i_4106_ = is[i_4075_];
					    i_4106_
						= (((((i_4102_ & 0xff00ff)
						      * anInt9012)
						     + ((i_4106_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_4102_ & 0xff00)
							* anInt9012)
						       + ((i_4106_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_4075_] = i_4106_;
				    } else if (i == 2) {
					int i_4107_ = aByteArray11407[i_4074_];
					if (i_4107_ != 0) {
					    int i_4108_ = (anIntArray11408
							   [i_4107_ & 0xff]);
					    int i_4109_
						= (((i_4108_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_4110_ = (((i_4108_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    is[i_4075_++]
						= (((i_4109_ | i_4110_) >>> 8)
						   + anInt9019);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_3860_ == 2) {
				    if (i == 1) {
					int i_4111_ = aByteArray11407[i_4074_];
					if (i_4111_ != 0) {
					    int i_4112_ = (anIntArray11408
							   [i_4111_ & 0xff]);
					    int i_4113_ = is[i_4075_];
					    int i_4114_ = i_4112_ + i_4113_;
					    int i_4115_
						= ((i_4112_ & 0xff00ff)
						   + (i_4113_ & 0xff00ff));
					    i_4113_ = ((i_4115_ & 0x1000100)
						       + (i_4114_ - i_4115_
							  & 0x10000));
					    is[i_4075_]
						= (i_4114_ - i_4113_
						   | i_4113_ - (i_4113_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_4116_ = aByteArray11407[i_4074_];
					if (i_4116_ != 0) {
					    int i_4117_ = (anIntArray11408
							   [i_4116_ & 0xff]);
					    int i_4118_
						= (((i_4117_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_4119_ = (((i_4117_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_4120_
						= ((i_4117_ & 0xff) * anInt9018
						   & 0xff00);
					    i_4117_ = (i_4118_ | i_4119_
						       | i_4120_) >>> 8;
					    int i_4121_ = is[i_4075_];
					    int i_4122_ = i_4117_ + i_4121_;
					    int i_4123_
						= ((i_4117_ & 0xff00ff)
						   + (i_4121_ & 0xff00ff));
					    i_4121_ = ((i_4123_ & 0x1000100)
						       + (i_4122_ - i_4123_
							  & 0x10000));
					    is[i_4075_]
						= (i_4122_ - i_4121_
						   | i_4121_ - (i_4121_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_4124_
					    = aByteArray11407[i_4074_];
					int i_4125_
					    = (i_4124_ > 0
					       ? anIntArray11408[i_4124_] : 0);
					int i_4126_ = anInt9011;
					int i_4127_ = i_4125_ + i_4126_;
					int i_4128_ = ((i_4125_ & 0xff00ff)
						       + (i_4126_ & 0xff00ff));
					int i_4129_ = ((i_4128_ & 0x1000100)
						       + (i_4127_ - i_4128_
							  & 0x10000));
					i_4129_
					    = (i_4127_ - i_4129_
					       | i_4129_ - (i_4129_ >>> 8));
					if (i_4125_ == 0 && anInt9012 != 255) {
					    i_4125_ = i_4129_;
					    i_4129_ = is[i_4075_];
					    i_4129_
						= (((((i_4125_ & 0xff00ff)
						      * anInt9012)
						     + ((i_4129_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_4125_ & 0xff00)
							* anInt9012)
						       + ((i_4129_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					}
					is[i_4075_] = i_4129_;
				    } else if (i == 2) {
					int i_4130_ = aByteArray11407[i_4074_];
					if (i_4130_ != 0) {
					    int i_4131_ = (anIntArray11408
							   [i_4130_ & 0xff]);
					    int i_4132_
						= (((i_4131_ & 0xff00ff)
						    * anInt9012)
						   & ~0xff00ff);
					    int i_4133_ = (((i_4131_ & 0xff00)
							    * anInt9012)
							   & 0xff0000);
					    i_4131_ = ((i_4132_ | i_4133_)
						       >>> 8) + anInt9019;
					    int i_4134_ = is[i_4075_];
					    int i_4135_ = i_4131_ + i_4134_;
					    int i_4136_
						= ((i_4131_ & 0xff00ff)
						   + (i_4134_ & 0xff00ff));
					    i_4134_ = ((i_4136_ & 0x1000100)
						       + (i_4135_ - i_4136_
							  & 0x10000));
					    is[i_4075_]
						= (i_4135_ - i_4134_
						   | i_4134_ - (i_4134_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_4070_ += anInt9001;
			    }
			}
			i_4068_++;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_4137_ = anInt8998;
		    while (i_4137_ < 0) {
			int i_4138_ = anInt8988;
			int i_4139_ = anInt9007 + anInt9009;
			int i_4140_ = anInt9003 + anInt9010;
			int i_4141_ = anInt8999;
			int i_4142_;
			if ((i_4142_ = i_4139_ - (anInt8985 << 12)) >= 0) {
			    i_4142_ = (anInt9001 - i_4142_) / anInt9001;
			    i_4141_ += i_4142_;
			    i_4139_ += anInt9001 * i_4142_;
			    i_4140_ += anInt9000 * i_4142_;
			    i_4138_ += i_4142_;
			}
			if ((i_4142_ = (i_4139_ - anInt9001) / anInt9001)
			    > i_4141_)
			    i_4141_ = i_4142_;
			if ((i_4142_ = i_4140_ - (anInt9002 << 12)) >= 0) {
			    i_4142_ = (anInt9000 - i_4142_) / anInt9000;
			    i_4141_ += i_4142_;
			    i_4139_ += anInt9001 * i_4142_;
			    i_4140_ += anInt9000 * i_4142_;
			    i_4138_ += i_4142_;
			}
			if ((i_4142_ = (i_4140_ - anInt9000) / anInt9000)
			    > i_4141_)
			    i_4141_ = i_4142_;
			for (/**/; i_4141_ < 0; i_4141_++) {
			    int i_4143_ = ((i_4140_ >> 12) * anInt8985
					   + (i_4139_ >> 12));
			    int i_4144_ = i_4138_++;
			    if (i_3860_ == 0) {
				if (i == 1)
				    is[i_4144_]
					= (anIntArray11408
					   [aByteArray11407[i_4143_] & 0xff]);
				else if (i == 0) {
				    int i_4145_
					= (anIntArray11408
					   [aByteArray11407[i_4143_] & 0xff]);
				    int i_4146_
					= ((i_4145_ & 0xff0000) * anInt9014
					   & ~0xffffff);
				    int i_4147_
					= ((i_4145_ & 0xff00) * anInt9015
					   & 0xff0000);
				    int i_4148_ = ((i_4145_ & 0xff) * anInt9018
						   & 0xff00);
				    is[i_4144_]
					= (i_4146_ | i_4147_ | i_4148_) >>> 8;
				} else if (i == 3) {
				    int i_4149_
					= (anIntArray11408
					   [aByteArray11407[i_4143_] & 0xff]);
				    int i_4150_ = anInt9011;
				    int i_4151_ = i_4149_ + i_4150_;
				    int i_4152_ = ((i_4149_ & 0xff00ff)
						   + (i_4150_ & 0xff00ff));
				    int i_4153_
					= ((i_4152_ & 0x1000100)
					   + (i_4151_ - i_4152_ & 0x10000));
				    is[i_4144_]
					= (i_4151_ - i_4153_
					   | i_4153_ - (i_4153_ >>> 8));
				} else if (i == 2) {
				    int i_4154_
					= (anIntArray11408
					   [aByteArray11407[i_4143_] & 0xff]);
				    int i_4155_
					= ((i_4154_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_4156_
					= ((i_4154_ & 0xff00) * anInt9012
					   & 0xff0000);
				    is[i_4144_] = (((i_4155_ | i_4156_) >>> 8)
						   + anInt9019);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3860_ == 1) {
				if (i == 1) {
				    int i_4157_ = aByteArray11407[i_4143_];
				    if (i_4157_ != 0)
					is[i_4144_]
					    = anIntArray11408[i_4157_ & 0xff];
				} else if (i == 0) {
				    int i_4158_ = aByteArray11407[i_4143_];
				    if (i_4158_ != 0) {
					int i_4159_
					    = anIntArray11408[i_4158_ & 0xff];
					if ((anInt9011 & 0xffffff)
					    == 16777215) {
					    int i_4160_ = anInt9011 >>> 24;
					    int i_4161_ = 256 - i_4160_;
					    int i_4162_ = is[i_4144_];
					    is[i_4144_]
						= (((((i_4159_ & 0xff00ff)
						      * i_4160_)
						     + ((i_4162_ & 0xff00ff)
							* i_4161_))
						    & ~0xff00ff)
						   + ((((i_4159_ & 0xff00)
							* i_4160_)
						       + ((i_4162_ & 0xff00)
							  * i_4161_))
						      & 0xff0000)) >> 8;
					} else if (anInt9012 != 255) {
					    int i_4163_
						= (((i_4159_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_4164_ = (((i_4159_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_4165_
						= ((i_4159_ & 0xff) * anInt9018
						   & 0xff00);
					    i_4159_ = (i_4163_ | i_4164_
						       | i_4165_) >>> 8;
					    int i_4166_ = is[i_4144_];
					    is[i_4144_]
						= (((((i_4159_ & 0xff00ff)
						      * anInt9012)
						     + ((i_4166_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_4159_ & 0xff00)
							* anInt9012)
						       + ((i_4166_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					} else {
					    int i_4167_
						= (((i_4159_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_4168_ = (((i_4159_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_4169_
						= ((i_4159_ & 0xff) * anInt9018
						   & 0xff00);
					    is[i_4144_] = (i_4167_ | i_4168_
							   | i_4169_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_4170_ = aByteArray11407[i_4143_];
				    int i_4171_
					= (i_4170_ > 0
					   ? anIntArray11408[i_4170_] : 0);
				    int i_4172_ = anInt9011;
				    int i_4173_ = i_4171_ + i_4172_;
				    int i_4174_ = ((i_4171_ & 0xff00ff)
						   + (i_4172_ & 0xff00ff));
				    int i_4175_
					= ((i_4174_ & 0x1000100)
					   + (i_4173_ - i_4174_ & 0x10000));
				    i_4175_ = (i_4173_ - i_4175_
					       | i_4175_ - (i_4175_ >>> 8));
				    if (i_4171_ == 0 && anInt9012 != 255) {
					i_4171_ = i_4175_;
					i_4175_ = is[i_4144_];
					i_4175_ = (((((i_4171_ & 0xff00ff)
						      * anInt9012)
						     + ((i_4175_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_4171_ & 0xff00)
							* anInt9012)
						       + ((i_4175_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
				    }
				    is[i_4144_] = i_4175_;
				} else if (i == 2) {
				    int i_4176_ = aByteArray11407[i_4143_];
				    if (i_4176_ != 0) {
					int i_4177_
					    = anIntArray11408[i_4176_ & 0xff];
					int i_4178_
					    = ((i_4177_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_4179_
					    = ((i_4177_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_4144_++] = ((i_4178_ | i_4179_)
							 >>> 8) + anInt9019;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3860_ == 2) {
				if (i == 1) {
				    int i_4180_ = aByteArray11407[i_4143_];
				    if (i_4180_ != 0) {
					int i_4181_
					    = anIntArray11408[i_4180_ & 0xff];
					int i_4182_ = is[i_4144_];
					int i_4183_ = i_4181_ + i_4182_;
					int i_4184_ = ((i_4181_ & 0xff00ff)
						       + (i_4182_ & 0xff00ff));
					i_4182_ = ((i_4184_ & 0x1000100)
						   + (i_4183_ - i_4184_
						      & 0x10000));
					is[i_4144_]
					    = (i_4183_ - i_4182_
					       | i_4182_ - (i_4182_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_4185_ = aByteArray11407[i_4143_];
				    if (i_4185_ != 0) {
					int i_4186_
					    = anIntArray11408[i_4185_ & 0xff];
					int i_4187_
					    = ((i_4186_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_4188_
					    = ((i_4186_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_4189_
					    = ((i_4186_ & 0xff) * anInt9018
					       & 0xff00);
					i_4186_ = (i_4187_ | i_4188_
						   | i_4189_) >>> 8;
					int i_4190_ = is[i_4144_];
					int i_4191_ = i_4186_ + i_4190_;
					int i_4192_ = ((i_4186_ & 0xff00ff)
						       + (i_4190_ & 0xff00ff));
					i_4190_ = ((i_4192_ & 0x1000100)
						   + (i_4191_ - i_4192_
						      & 0x10000));
					is[i_4144_]
					    = (i_4191_ - i_4190_
					       | i_4190_ - (i_4190_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_4193_ = aByteArray11407[i_4143_];
				    int i_4194_
					= (i_4193_ > 0
					   ? anIntArray11408[i_4193_] : 0);
				    int i_4195_ = anInt9011;
				    int i_4196_ = i_4194_ + i_4195_;
				    int i_4197_ = ((i_4194_ & 0xff00ff)
						   + (i_4195_ & 0xff00ff));
				    int i_4198_
					= ((i_4197_ & 0x1000100)
					   + (i_4196_ - i_4197_ & 0x10000));
				    i_4198_ = (i_4196_ - i_4198_
					       | i_4198_ - (i_4198_ >>> 8));
				    if (i_4194_ == 0 && anInt9012 != 255) {
					i_4194_ = i_4198_;
					i_4198_ = is[i_4144_];
					i_4198_ = (((((i_4194_ & 0xff00ff)
						      * anInt9012)
						     + ((i_4198_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_4194_ & 0xff00)
							* anInt9012)
						       + ((i_4198_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
				    }
				    is[i_4144_] = i_4198_;
				} else if (i == 2) {
				    int i_4199_ = aByteArray11407[i_4143_];
				    if (i_4199_ != 0) {
					int i_4200_
					    = anIntArray11408[i_4199_ & 0xff];
					int i_4201_
					    = ((i_4200_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_4202_
					    = ((i_4200_ & 0xff00) * anInt9012
					       & 0xff0000);
					i_4200_ = (((i_4201_ | i_4202_) >>> 8)
						   + anInt9019);
					int i_4203_ = is[i_4144_];
					int i_4204_ = i_4200_ + i_4203_;
					int i_4205_ = ((i_4200_ & 0xff00ff)
						       + (i_4203_ & 0xff00ff));
					i_4203_ = ((i_4205_ & 0x1000100)
						   + (i_4204_ - i_4205_
						      & 0x10000));
					is[i_4144_]
					    = (i_4204_ - i_4203_
					       | i_4203_ - (i_4203_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_4139_ += anInt9001;
			    i_4140_ += anInt9000;
			}
			i_4137_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_4206_ = anInt8998;
		    while (i_4206_ < 0) {
			int i_4207_ = anInt8988;
			int i_4208_ = anInt9007 + anInt9009;
			int i_4209_ = anInt9003 + anInt9010;
			int i_4210_ = anInt8999;
			int i_4211_;
			if ((i_4211_ = i_4208_ - (anInt8985 << 12)) >= 0) {
			    i_4211_ = (anInt9001 - i_4211_) / anInt9001;
			    i_4210_ += i_4211_;
			    i_4208_ += anInt9001 * i_4211_;
			    i_4209_ += anInt9000 * i_4211_;
			    i_4207_ += i_4211_;
			}
			if ((i_4211_ = (i_4208_ - anInt9001) / anInt9001)
			    > i_4210_)
			    i_4210_ = i_4211_;
			if (i_4209_ < 0) {
			    i_4211_ = (anInt9000 - 1 - i_4209_) / anInt9000;
			    i_4210_ += i_4211_;
			    i_4208_ += anInt9001 * i_4211_;
			    i_4209_ += anInt9000 * i_4211_;
			    i_4207_ += i_4211_;
			}
			if ((i_4211_ = (1 + i_4209_ - (anInt9002 << 12)
					- anInt9000) / anInt9000)
			    > i_4210_)
			    i_4210_ = i_4211_;
			for (/**/; i_4210_ < 0; i_4210_++) {
			    int i_4212_ = ((i_4209_ >> 12) * anInt8985
					   + (i_4208_ >> 12));
			    int i_4213_ = i_4207_++;
			    if (i_3860_ == 0) {
				if (i == 1)
				    is[i_4213_]
					= (anIntArray11408
					   [aByteArray11407[i_4212_] & 0xff]);
				else if (i == 0) {
				    int i_4214_
					= (anIntArray11408
					   [aByteArray11407[i_4212_] & 0xff]);
				    int i_4215_
					= ((i_4214_ & 0xff0000) * anInt9014
					   & ~0xffffff);
				    int i_4216_
					= ((i_4214_ & 0xff00) * anInt9015
					   & 0xff0000);
				    int i_4217_ = ((i_4214_ & 0xff) * anInt9018
						   & 0xff00);
				    is[i_4213_]
					= (i_4215_ | i_4216_ | i_4217_) >>> 8;
				} else if (i == 3) {
				    int i_4218_
					= (anIntArray11408
					   [aByteArray11407[i_4212_] & 0xff]);
				    int i_4219_ = anInt9011;
				    int i_4220_ = i_4218_ + i_4219_;
				    int i_4221_ = ((i_4218_ & 0xff00ff)
						   + (i_4219_ & 0xff00ff));
				    int i_4222_
					= ((i_4221_ & 0x1000100)
					   + (i_4220_ - i_4221_ & 0x10000));
				    is[i_4213_]
					= (i_4220_ - i_4222_
					   | i_4222_ - (i_4222_ >>> 8));
				} else if (i == 2) {
				    int i_4223_
					= (anIntArray11408
					   [aByteArray11407[i_4212_] & 0xff]);
				    int i_4224_
					= ((i_4223_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_4225_
					= ((i_4223_ & 0xff00) * anInt9012
					   & 0xff0000);
				    is[i_4213_] = (((i_4224_ | i_4225_) >>> 8)
						   + anInt9019);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3860_ == 1) {
				if (i == 1) {
				    int i_4226_ = aByteArray11407[i_4212_];
				    if (i_4226_ != 0)
					is[i_4213_]
					    = anIntArray11408[i_4226_ & 0xff];
				} else if (i == 0) {
				    int i_4227_ = aByteArray11407[i_4212_];
				    if (i_4227_ != 0) {
					int i_4228_
					    = anIntArray11408[i_4227_ & 0xff];
					if ((anInt9011 & 0xffffff)
					    == 16777215) {
					    int i_4229_ = anInt9011 >>> 24;
					    int i_4230_ = 256 - i_4229_;
					    int i_4231_ = is[i_4213_];
					    is[i_4213_]
						= (((((i_4228_ & 0xff00ff)
						      * i_4229_)
						     + ((i_4231_ & 0xff00ff)
							* i_4230_))
						    & ~0xff00ff)
						   + ((((i_4228_ & 0xff00)
							* i_4229_)
						       + ((i_4231_ & 0xff00)
							  * i_4230_))
						      & 0xff0000)) >> 8;
					} else if (anInt9012 != 255) {
					    int i_4232_
						= (((i_4228_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_4233_ = (((i_4228_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_4234_
						= ((i_4228_ & 0xff) * anInt9018
						   & 0xff00);
					    i_4228_ = (i_4232_ | i_4233_
						       | i_4234_) >>> 8;
					    int i_4235_ = is[i_4213_];
					    is[i_4213_]
						= (((((i_4228_ & 0xff00ff)
						      * anInt9012)
						     + ((i_4235_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_4228_ & 0xff00)
							* anInt9012)
						       + ((i_4235_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					} else {
					    int i_4236_
						= (((i_4228_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_4237_ = (((i_4228_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_4238_
						= ((i_4228_ & 0xff) * anInt9018
						   & 0xff00);
					    is[i_4213_] = (i_4236_ | i_4237_
							   | i_4238_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_4239_ = aByteArray11407[i_4212_];
				    int i_4240_
					= (i_4239_ > 0
					   ? anIntArray11408[i_4239_] : 0);
				    int i_4241_ = anInt9011;
				    int i_4242_ = i_4240_ + i_4241_;
				    int i_4243_ = ((i_4240_ & 0xff00ff)
						   + (i_4241_ & 0xff00ff));
				    int i_4244_
					= ((i_4243_ & 0x1000100)
					   + (i_4242_ - i_4243_ & 0x10000));
				    i_4244_ = (i_4242_ - i_4244_
					       | i_4244_ - (i_4244_ >>> 8));
				    if (i_4240_ == 0 && anInt9012 != 255) {
					i_4240_ = i_4244_;
					i_4244_ = is[i_4213_];
					i_4244_ = (((((i_4240_ & 0xff00ff)
						      * anInt9012)
						     + ((i_4244_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_4240_ & 0xff00)
							* anInt9012)
						       + ((i_4244_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
				    }
				    is[i_4213_] = i_4244_;
				} else if (i == 2) {
				    int i_4245_ = aByteArray11407[i_4212_];
				    if (i_4245_ != 0) {
					int i_4246_
					    = anIntArray11408[i_4245_ & 0xff];
					int i_4247_
					    = ((i_4246_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_4248_
					    = ((i_4246_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_4213_++] = ((i_4247_ | i_4248_)
							 >>> 8) + anInt9019;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3860_ == 2) {
				if (i == 1) {
				    int i_4249_ = aByteArray11407[i_4212_];
				    if (i_4249_ != 0) {
					int i_4250_
					    = anIntArray11408[i_4249_ & 0xff];
					int i_4251_ = is[i_4213_];
					int i_4252_ = i_4250_ + i_4251_;
					int i_4253_ = ((i_4250_ & 0xff00ff)
						       + (i_4251_ & 0xff00ff));
					i_4251_ = ((i_4253_ & 0x1000100)
						   + (i_4252_ - i_4253_
						      & 0x10000));
					is[i_4213_]
					    = (i_4252_ - i_4251_
					       | i_4251_ - (i_4251_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_4254_ = aByteArray11407[i_4212_];
				    if (i_4254_ != 0) {
					int i_4255_
					    = anIntArray11408[i_4254_ & 0xff];
					int i_4256_
					    = ((i_4255_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_4257_
					    = ((i_4255_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_4258_
					    = ((i_4255_ & 0xff) * anInt9018
					       & 0xff00);
					i_4255_ = (i_4256_ | i_4257_
						   | i_4258_) >>> 8;
					int i_4259_ = is[i_4213_];
					int i_4260_ = i_4255_ + i_4259_;
					int i_4261_ = ((i_4255_ & 0xff00ff)
						       + (i_4259_ & 0xff00ff));
					i_4259_ = ((i_4261_ & 0x1000100)
						   + (i_4260_ - i_4261_
						      & 0x10000));
					is[i_4213_]
					    = (i_4260_ - i_4259_
					       | i_4259_ - (i_4259_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_4262_ = aByteArray11407[i_4212_];
				    int i_4263_
					= (i_4262_ > 0
					   ? anIntArray11408[i_4262_] : 0);
				    int i_4264_ = anInt9011;
				    int i_4265_ = i_4263_ + i_4264_;
				    int i_4266_ = ((i_4263_ & 0xff00ff)
						   + (i_4264_ & 0xff00ff));
				    int i_4267_
					= ((i_4266_ & 0x1000100)
					   + (i_4265_ - i_4266_ & 0x10000));
				    i_4267_ = (i_4265_ - i_4267_
					       | i_4267_ - (i_4267_ >>> 8));
				    if (i_4263_ == 0 && anInt9012 != 255) {
					i_4263_ = i_4267_;
					i_4267_ = is[i_4213_];
					i_4267_ = (((((i_4263_ & 0xff00ff)
						      * anInt9012)
						     + ((i_4267_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_4263_ & 0xff00)
							* anInt9012)
						       + ((i_4267_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
				    }
				    is[i_4213_] = i_4267_;
				} else if (i == 2) {
				    int i_4268_ = aByteArray11407[i_4212_];
				    if (i_4268_ != 0) {
					int i_4269_
					    = anIntArray11408[i_4268_ & 0xff];
					int i_4270_
					    = ((i_4269_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_4271_
					    = ((i_4269_ & 0xff00) * anInt9012
					       & 0xff0000);
					i_4269_ = (((i_4270_ | i_4271_) >>> 8)
						   + anInt9019);
					int i_4272_ = is[i_4213_];
					int i_4273_ = i_4269_ + i_4272_;
					int i_4274_ = ((i_4269_ & 0xff00ff)
						       + (i_4272_ & 0xff00ff));
					i_4272_ = ((i_4274_ & 0x1000100)
						   + (i_4273_ - i_4274_
						      & 0x10000));
					is[i_4213_]
					    = (i_4273_ - i_4272_
					       | i_4272_ - (i_4272_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_4208_ += anInt9001;
			    i_4209_ += anInt9000;
			}
			i_4206_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9000 == 0) {
		int i_4275_ = anInt8998;
		while (i_4275_ < 0) {
		    int i_4276_ = anInt8988;
		    int i_4277_ = anInt9007 + anInt9009;
		    int i_4278_ = anInt9003;
		    int i_4279_ = anInt8999;
		    if (i_4278_ >= 0 && i_4278_ - (anInt9002 << 12) < 0) {
			if (i_4277_ < 0) {
			    int i_4280_
				= (anInt9001 - 1 - i_4277_) / anInt9001;
			    i_4279_ += i_4280_;
			    i_4277_ += anInt9001 * i_4280_;
			    i_4276_ += i_4280_;
			}
			int i_4281_;
			if ((i_4281_ = (1 + i_4277_ - (anInt8985 << 12)
					- anInt9001) / anInt9001)
			    > i_4279_)
			    i_4279_ = i_4281_;
			for (/**/; i_4279_ < 0; i_4279_++) {
			    int i_4282_ = ((i_4278_ >> 12) * anInt8985
					   + (i_4277_ >> 12));
			    int i_4283_ = i_4276_++;
			    if (i_3860_ == 0) {
				if (i == 1)
				    is[i_4283_]
					= (anIntArray11408
					   [aByteArray11407[i_4282_] & 0xff]);
				else if (i == 0) {
				    int i_4284_
					= (anIntArray11408
					   [aByteArray11407[i_4282_] & 0xff]);
				    int i_4285_
					= ((i_4284_ & 0xff0000) * anInt9014
					   & ~0xffffff);
				    int i_4286_
					= ((i_4284_ & 0xff00) * anInt9015
					   & 0xff0000);
				    int i_4287_ = ((i_4284_ & 0xff) * anInt9018
						   & 0xff00);
				    is[i_4283_]
					= (i_4285_ | i_4286_ | i_4287_) >>> 8;
				} else if (i == 3) {
				    int i_4288_
					= (anIntArray11408
					   [aByteArray11407[i_4282_] & 0xff]);
				    int i_4289_ = anInt9011;
				    int i_4290_ = i_4288_ + i_4289_;
				    int i_4291_ = ((i_4288_ & 0xff00ff)
						   + (i_4289_ & 0xff00ff));
				    int i_4292_
					= ((i_4291_ & 0x1000100)
					   + (i_4290_ - i_4291_ & 0x10000));
				    is[i_4283_]
					= (i_4290_ - i_4292_
					   | i_4292_ - (i_4292_ >>> 8));
				} else if (i == 2) {
				    int i_4293_
					= (anIntArray11408
					   [aByteArray11407[i_4282_] & 0xff]);
				    int i_4294_
					= ((i_4293_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_4295_
					= ((i_4293_ & 0xff00) * anInt9012
					   & 0xff0000);
				    is[i_4283_] = (((i_4294_ | i_4295_) >>> 8)
						   + anInt9019);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3860_ == 1) {
				if (i == 1) {
				    int i_4296_ = aByteArray11407[i_4282_];
				    if (i_4296_ != 0)
					is[i_4283_]
					    = anIntArray11408[i_4296_ & 0xff];
				} else if (i == 0) {
				    int i_4297_ = aByteArray11407[i_4282_];
				    if (i_4297_ != 0) {
					int i_4298_
					    = anIntArray11408[i_4297_ & 0xff];
					if ((anInt9011 & 0xffffff)
					    == 16777215) {
					    int i_4299_ = anInt9011 >>> 24;
					    int i_4300_ = 256 - i_4299_;
					    int i_4301_ = is[i_4283_];
					    is[i_4283_]
						= (((((i_4298_ & 0xff00ff)
						      * i_4299_)
						     + ((i_4301_ & 0xff00ff)
							* i_4300_))
						    & ~0xff00ff)
						   + ((((i_4298_ & 0xff00)
							* i_4299_)
						       + ((i_4301_ & 0xff00)
							  * i_4300_))
						      & 0xff0000)) >> 8;
					} else if (anInt9012 != 255) {
					    int i_4302_
						= (((i_4298_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_4303_ = (((i_4298_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_4304_
						= ((i_4298_ & 0xff) * anInt9018
						   & 0xff00);
					    i_4298_ = (i_4302_ | i_4303_
						       | i_4304_) >>> 8;
					    int i_4305_ = is[i_4283_];
					    is[i_4283_]
						= (((((i_4298_ & 0xff00ff)
						      * anInt9012)
						     + ((i_4305_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_4298_ & 0xff00)
							* anInt9012)
						       + ((i_4305_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
					} else {
					    int i_4306_
						= (((i_4298_ & 0xff0000)
						    * anInt9014)
						   & ~0xffffff);
					    int i_4307_ = (((i_4298_ & 0xff00)
							    * anInt9015)
							   & 0xff0000);
					    int i_4308_
						= ((i_4298_ & 0xff) * anInt9018
						   & 0xff00);
					    is[i_4283_] = (i_4306_ | i_4307_
							   | i_4308_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_4309_ = aByteArray11407[i_4282_];
				    int i_4310_
					= (i_4309_ > 0
					   ? anIntArray11408[i_4309_] : 0);
				    int i_4311_ = anInt9011;
				    int i_4312_ = i_4310_ + i_4311_;
				    int i_4313_ = ((i_4310_ & 0xff00ff)
						   + (i_4311_ & 0xff00ff));
				    int i_4314_
					= ((i_4313_ & 0x1000100)
					   + (i_4312_ - i_4313_ & 0x10000));
				    i_4314_ = (i_4312_ - i_4314_
					       | i_4314_ - (i_4314_ >>> 8));
				    if (i_4310_ == 0 && anInt9012 != 255) {
					i_4310_ = i_4314_;
					i_4314_ = is[i_4283_];
					i_4314_ = (((((i_4310_ & 0xff00ff)
						      * anInt9012)
						     + ((i_4314_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_4310_ & 0xff00)
							* anInt9012)
						       + ((i_4314_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
				    }
				    is[i_4283_] = i_4314_;
				} else if (i == 2) {
				    int i_4315_ = aByteArray11407[i_4282_];
				    if (i_4315_ != 0) {
					int i_4316_
					    = anIntArray11408[i_4315_ & 0xff];
					int i_4317_
					    = ((i_4316_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_4318_
					    = ((i_4316_ & 0xff00) * anInt9012
					       & 0xff0000);
					is[i_4283_++] = ((i_4317_ | i_4318_)
							 >>> 8) + anInt9019;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3860_ == 2) {
				if (i == 1) {
				    int i_4319_ = aByteArray11407[i_4282_];
				    if (i_4319_ != 0) {
					int i_4320_
					    = anIntArray11408[i_4319_ & 0xff];
					int i_4321_ = is[i_4283_];
					int i_4322_ = i_4320_ + i_4321_;
					int i_4323_ = ((i_4320_ & 0xff00ff)
						       + (i_4321_ & 0xff00ff));
					i_4321_ = ((i_4323_ & 0x1000100)
						   + (i_4322_ - i_4323_
						      & 0x10000));
					is[i_4283_]
					    = (i_4322_ - i_4321_
					       | i_4321_ - (i_4321_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_4324_ = aByteArray11407[i_4282_];
				    if (i_4324_ != 0) {
					int i_4325_
					    = anIntArray11408[i_4324_ & 0xff];
					int i_4326_
					    = ((i_4325_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_4327_
					    = ((i_4325_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_4328_
					    = ((i_4325_ & 0xff) * anInt9018
					       & 0xff00);
					i_4325_ = (i_4326_ | i_4327_
						   | i_4328_) >>> 8;
					int i_4329_ = is[i_4283_];
					int i_4330_ = i_4325_ + i_4329_;
					int i_4331_ = ((i_4325_ & 0xff00ff)
						       + (i_4329_ & 0xff00ff));
					i_4329_ = ((i_4331_ & 0x1000100)
						   + (i_4330_ - i_4331_
						      & 0x10000));
					is[i_4283_]
					    = (i_4330_ - i_4329_
					       | i_4329_ - (i_4329_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_4332_ = aByteArray11407[i_4282_];
				    int i_4333_
					= (i_4332_ > 0
					   ? anIntArray11408[i_4332_] : 0);
				    int i_4334_ = anInt9011;
				    int i_4335_ = i_4333_ + i_4334_;
				    int i_4336_ = ((i_4333_ & 0xff00ff)
						   + (i_4334_ & 0xff00ff));
				    int i_4337_
					= ((i_4336_ & 0x1000100)
					   + (i_4335_ - i_4336_ & 0x10000));
				    i_4337_ = (i_4335_ - i_4337_
					       | i_4337_ - (i_4337_ >>> 8));
				    if (i_4333_ == 0 && anInt9012 != 255) {
					i_4333_ = i_4337_;
					i_4337_ = is[i_4283_];
					i_4337_ = (((((i_4333_ & 0xff00ff)
						      * anInt9012)
						     + ((i_4337_ & 0xff00ff)
							* anInt9013))
						    & ~0xff00ff)
						   + ((((i_4333_ & 0xff00)
							* anInt9012)
						       + ((i_4337_ & 0xff00)
							  * anInt9013))
						      & 0xff0000)) >> 8;
				    }
				    is[i_4283_] = i_4337_;
				} else if (i == 2) {
				    int i_4338_ = aByteArray11407[i_4282_];
				    if (i_4338_ != 0) {
					int i_4339_
					    = anIntArray11408[i_4338_ & 0xff];
					int i_4340_
					    = ((i_4339_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
					int i_4341_
					    = ((i_4339_ & 0xff00) * anInt9012
					       & 0xff0000);
					i_4339_ = (((i_4340_ | i_4341_) >>> 8)
						   + anInt9019);
					int i_4342_ = is[i_4283_];
					int i_4343_ = i_4339_ + i_4342_;
					int i_4344_ = ((i_4339_ & 0xff00ff)
						       + (i_4342_ & 0xff00ff));
					i_4342_ = ((i_4344_ & 0x1000100)
						   + (i_4343_ - i_4344_
						      & 0x10000));
					is[i_4283_]
					    = (i_4343_ - i_4342_
					       | i_4342_ - (i_4342_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_4277_ += anInt9001;
			}
		    }
		    i_4275_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else if (anInt9000 < 0) {
		for (int i_4345_ = anInt8998; i_4345_ < 0; i_4345_++) {
		    int i_4346_ = anInt8988;
		    int i_4347_ = anInt9007 + anInt9009;
		    int i_4348_ = anInt9003 + anInt9010;
		    int i_4349_ = anInt8999;
		    if (i_4347_ < 0) {
			int i_4350_ = (anInt9001 - 1 - i_4347_) / anInt9001;
			i_4349_ += i_4350_;
			i_4347_ += anInt9001 * i_4350_;
			i_4348_ += anInt9000 * i_4350_;
			i_4346_ += i_4350_;
		    }
		    int i_4351_;
		    if ((i_4351_ = (1 + i_4347_ - (anInt8985 << 12)
				    - anInt9001) / anInt9001)
			> i_4349_)
			i_4349_ = i_4351_;
		    if ((i_4351_ = i_4348_ - (anInt9002 << 12)) >= 0) {
			i_4351_ = (anInt9000 - i_4351_) / anInt9000;
			i_4349_ += i_4351_;
			i_4347_ += anInt9001 * i_4351_;
			i_4348_ += anInt9000 * i_4351_;
			i_4346_ += i_4351_;
		    }
		    if ((i_4351_ = (i_4348_ - anInt9000) / anInt9000)
			> i_4349_)
			i_4349_ = i_4351_;
		    for (/**/; i_4349_ < 0; i_4349_++) {
			int i_4352_
			    = (i_4348_ >> 12) * anInt8985 + (i_4347_ >> 12);
			int i_4353_ = i_4346_++;
			if (i_3860_ == 0) {
			    if (i == 1)
				is[i_4353_]
				    = (anIntArray11408
				       [aByteArray11407[i_4352_] & 0xff]);
			    else if (i == 0) {
				int i_4354_
				    = (anIntArray11408
				       [aByteArray11407[i_4352_] & 0xff]);
				int i_4355_ = ((i_4354_ & 0xff0000) * anInt9014
					       & ~0xffffff);
				int i_4356_ = ((i_4354_ & 0xff00) * anInt9015
					       & 0xff0000);
				int i_4357_
				    = (i_4354_ & 0xff) * anInt9018 & 0xff00;
				is[i_4353_]
				    = (i_4355_ | i_4356_ | i_4357_) >>> 8;
			    } else if (i == 3) {
				int i_4358_
				    = (anIntArray11408
				       [aByteArray11407[i_4352_] & 0xff]);
				int i_4359_ = anInt9011;
				int i_4360_ = i_4358_ + i_4359_;
				int i_4361_ = ((i_4358_ & 0xff00ff)
					       + (i_4359_ & 0xff00ff));
				int i_4362_
				    = ((i_4361_ & 0x1000100)
				       + (i_4360_ - i_4361_ & 0x10000));
				is[i_4353_]
				    = i_4360_ - i_4362_ | i_4362_ - (i_4362_
								     >>> 8);
			    } else if (i == 2) {
				int i_4363_
				    = (anIntArray11408
				       [aByteArray11407[i_4352_] & 0xff]);
				int i_4364_ = ((i_4363_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
				int i_4365_ = ((i_4363_ & 0xff00) * anInt9012
					       & 0xff0000);
				is[i_4353_]
				    = ((i_4364_ | i_4365_) >>> 8) + anInt9019;
			    } else
				throw new IllegalArgumentException();
			} else if (i_3860_ == 1) {
			    if (i == 1) {
				int i_4366_ = aByteArray11407[i_4352_];
				if (i_4366_ != 0)
				    is[i_4353_]
					= anIntArray11408[i_4366_ & 0xff];
			    } else if (i == 0) {
				int i_4367_ = aByteArray11407[i_4352_];
				if (i_4367_ != 0) {
				    int i_4368_
					= anIntArray11408[i_4367_ & 0xff];
				    if ((anInt9011 & 0xffffff) == 16777215) {
					int i_4369_ = anInt9011 >>> 24;
					int i_4370_ = 256 - i_4369_;
					int i_4371_ = is[i_4353_];
					is[i_4353_]
					    = ((((i_4368_ & 0xff00ff) * i_4369_
						 + ((i_4371_ & 0xff00ff)
						    * i_4370_))
						& ~0xff00ff)
					       + (((i_4368_ & 0xff00) * i_4369_
						   + ((i_4371_ & 0xff00)
						      * i_4370_))
						  & 0xff0000)) >> 8;
				    } else if (anInt9012 != 255) {
					int i_4372_
					    = ((i_4368_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_4373_
					    = ((i_4368_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_4374_
					    = ((i_4368_ & 0xff) * anInt9018
					       & 0xff00);
					i_4368_ = (i_4372_ | i_4373_
						   | i_4374_) >>> 8;
					int i_4375_ = is[i_4353_];
					is[i_4353_]
					    = (((((i_4368_ & 0xff00ff)
						  * anInt9012)
						 + ((i_4375_ & 0xff00ff)
						    * anInt9013))
						& ~0xff00ff)
					       + ((((i_4368_ & 0xff00)
						    * anInt9012)
						   + ((i_4375_ & 0xff00)
						      * anInt9013))
						  & 0xff0000)) >> 8;
				    } else {
					int i_4376_
					    = ((i_4368_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_4377_
					    = ((i_4368_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_4378_
					    = ((i_4368_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_4353_] = (i_4376_ | i_4377_
						       | i_4378_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_4379_ = aByteArray11407[i_4352_];
				int i_4380_ = (i_4379_ > 0
					       ? anIntArray11408[i_4379_] : 0);
				int i_4381_ = anInt9011;
				int i_4382_ = i_4380_ + i_4381_;
				int i_4383_ = ((i_4380_ & 0xff00ff)
					       + (i_4381_ & 0xff00ff));
				int i_4384_
				    = ((i_4383_ & 0x1000100)
				       + (i_4382_ - i_4383_ & 0x10000));
				i_4384_
				    = i_4382_ - i_4384_ | i_4384_ - (i_4384_
								     >>> 8);
				if (i_4380_ == 0 && anInt9012 != 255) {
				    i_4380_ = i_4384_;
				    i_4384_ = is[i_4353_];
				    i_4384_
					= ((((i_4380_ & 0xff00ff) * anInt9012
					     + ((i_4384_ & 0xff00ff)
						* anInt9013))
					    & ~0xff00ff)
					   + (((i_4380_ & 0xff00) * anInt9012
					       + ((i_4384_ & 0xff00)
						  * anInt9013))
					      & 0xff0000)) >> 8;
				}
				is[i_4353_] = i_4384_;
			    } else if (i == 2) {
				int i_4385_ = aByteArray11407[i_4352_];
				if (i_4385_ != 0) {
				    int i_4386_
					= anIntArray11408[i_4385_ & 0xff];
				    int i_4387_
					= ((i_4386_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_4388_
					= ((i_4386_ & 0xff00) * anInt9012
					   & 0xff0000);
				    is[i_4353_++] = ((i_4387_ | i_4388_)
						     >>> 8) + anInt9019;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_3860_ == 2) {
			    if (i == 1) {
				int i_4389_ = aByteArray11407[i_4352_];
				if (i_4389_ != 0) {
				    int i_4390_
					= anIntArray11408[i_4389_ & 0xff];
				    int i_4391_ = is[i_4353_];
				    int i_4392_ = i_4390_ + i_4391_;
				    int i_4393_ = ((i_4390_ & 0xff00ff)
						   + (i_4391_ & 0xff00ff));
				    i_4391_
					= ((i_4393_ & 0x1000100)
					   + (i_4392_ - i_4393_ & 0x10000));
				    is[i_4353_]
					= (i_4392_ - i_4391_
					   | i_4391_ - (i_4391_ >>> 8));
				}
			    } else if (i == 0) {
				int i_4394_ = aByteArray11407[i_4352_];
				if (i_4394_ != 0) {
				    int i_4395_
					= anIntArray11408[i_4394_ & 0xff];
				    int i_4396_
					= ((i_4395_ & 0xff0000) * anInt9014
					   & ~0xffffff);
				    int i_4397_
					= ((i_4395_ & 0xff00) * anInt9015
					   & 0xff0000);
				    int i_4398_ = ((i_4395_ & 0xff) * anInt9018
						   & 0xff00);
				    i_4395_
					= (i_4396_ | i_4397_ | i_4398_) >>> 8;
				    int i_4399_ = is[i_4353_];
				    int i_4400_ = i_4395_ + i_4399_;
				    int i_4401_ = ((i_4395_ & 0xff00ff)
						   + (i_4399_ & 0xff00ff));
				    i_4399_
					= ((i_4401_ & 0x1000100)
					   + (i_4400_ - i_4401_ & 0x10000));
				    is[i_4353_]
					= (i_4400_ - i_4399_
					   | i_4399_ - (i_4399_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_4402_ = aByteArray11407[i_4352_];
				int i_4403_ = (i_4402_ > 0
					       ? anIntArray11408[i_4402_] : 0);
				int i_4404_ = anInt9011;
				int i_4405_ = i_4403_ + i_4404_;
				int i_4406_ = ((i_4403_ & 0xff00ff)
					       + (i_4404_ & 0xff00ff));
				int i_4407_
				    = ((i_4406_ & 0x1000100)
				       + (i_4405_ - i_4406_ & 0x10000));
				i_4407_
				    = i_4405_ - i_4407_ | i_4407_ - (i_4407_
								     >>> 8);
				if (i_4403_ == 0 && anInt9012 != 255) {
				    i_4403_ = i_4407_;
				    i_4407_ = is[i_4353_];
				    i_4407_
					= ((((i_4403_ & 0xff00ff) * anInt9012
					     + ((i_4407_ & 0xff00ff)
						* anInt9013))
					    & ~0xff00ff)
					   + (((i_4403_ & 0xff00) * anInt9012
					       + ((i_4407_ & 0xff00)
						  * anInt9013))
					      & 0xff0000)) >> 8;
				}
				is[i_4353_] = i_4407_;
			    } else if (i == 2) {
				int i_4408_ = aByteArray11407[i_4352_];
				if (i_4408_ != 0) {
				    int i_4409_
					= anIntArray11408[i_4408_ & 0xff];
				    int i_4410_
					= ((i_4409_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_4411_
					= ((i_4409_ & 0xff00) * anInt9012
					   & 0xff0000);
				    i_4409_ = (((i_4410_ | i_4411_) >>> 8)
					       + anInt9019);
				    int i_4412_ = is[i_4353_];
				    int i_4413_ = i_4409_ + i_4412_;
				    int i_4414_ = ((i_4409_ & 0xff00ff)
						   + (i_4412_ & 0xff00ff));
				    i_4412_
					= ((i_4414_ & 0x1000100)
					   + (i_4413_ - i_4414_ & 0x10000));
				    is[i_4353_]
					= (i_4413_ - i_4412_
					   | i_4412_ - (i_4412_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_4347_ += anInt9001;
			i_4348_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else {
		for (int i_4415_ = anInt8998; i_4415_ < 0; i_4415_++) {
		    int i_4416_ = anInt8988;
		    int i_4417_ = anInt9007 + anInt9009;
		    int i_4418_ = anInt9003 + anInt9010;
		    int i_4419_ = anInt8999;
		    if (i_4417_ < 0) {
			int i_4420_ = (anInt9001 - 1 - i_4417_) / anInt9001;
			i_4419_ += i_4420_;
			i_4417_ += anInt9001 * i_4420_;
			i_4418_ += anInt9000 * i_4420_;
			i_4416_ += i_4420_;
		    }
		    int i_4421_;
		    if ((i_4421_ = (1 + i_4417_ - (anInt8985 << 12)
				    - anInt9001) / anInt9001)
			> i_4419_)
			i_4419_ = i_4421_;
		    if (i_4418_ < 0) {
			i_4421_ = (anInt9000 - 1 - i_4418_) / anInt9000;
			i_4419_ += i_4421_;
			i_4417_ += anInt9001 * i_4421_;
			i_4418_ += anInt9000 * i_4421_;
			i_4416_ += i_4421_;
		    }
		    if ((i_4421_ = (1 + i_4418_ - (anInt9002 << 12)
				    - anInt9000) / anInt9000)
			> i_4419_)
			i_4419_ = i_4421_;
		    for (/**/; i_4419_ < 0; i_4419_++) {
			int i_4422_
			    = (i_4418_ >> 12) * anInt8985 + (i_4417_ >> 12);
			int i_4423_ = i_4416_++;
			if (i_3860_ == 0) {
			    if (i == 1)
				is[i_4423_]
				    = (anIntArray11408
				       [aByteArray11407[i_4422_] & 0xff]);
			    else if (i == 0) {
				int i_4424_
				    = (anIntArray11408
				       [aByteArray11407[i_4422_] & 0xff]);
				int i_4425_ = ((i_4424_ & 0xff0000) * anInt9014
					       & ~0xffffff);
				int i_4426_ = ((i_4424_ & 0xff00) * anInt9015
					       & 0xff0000);
				int i_4427_
				    = (i_4424_ & 0xff) * anInt9018 & 0xff00;
				is[i_4423_]
				    = (i_4425_ | i_4426_ | i_4427_) >>> 8;
			    } else if (i == 3) {
				int i_4428_
				    = (anIntArray11408
				       [aByteArray11407[i_4422_] & 0xff]);
				int i_4429_ = anInt9011;
				int i_4430_ = i_4428_ + i_4429_;
				int i_4431_ = ((i_4428_ & 0xff00ff)
					       + (i_4429_ & 0xff00ff));
				int i_4432_
				    = ((i_4431_ & 0x1000100)
				       + (i_4430_ - i_4431_ & 0x10000));
				is[i_4423_]
				    = i_4430_ - i_4432_ | i_4432_ - (i_4432_
								     >>> 8);
			    } else if (i == 2) {
				int i_4433_
				    = (anIntArray11408
				       [aByteArray11407[i_4422_] & 0xff]);
				int i_4434_ = ((i_4433_ & 0xff00ff) * anInt9012
					       & ~0xff00ff);
				int i_4435_ = ((i_4433_ & 0xff00) * anInt9012
					       & 0xff0000);
				is[i_4423_]
				    = ((i_4434_ | i_4435_) >>> 8) + anInt9019;
			    } else
				throw new IllegalArgumentException();
			} else if (i_3860_ == 1) {
			    if (i == 1) {
				int i_4436_ = aByteArray11407[i_4422_];
				if (i_4436_ != 0)
				    is[i_4423_]
					= anIntArray11408[i_4436_ & 0xff];
			    } else if (i == 0) {
				int i_4437_ = aByteArray11407[i_4422_];
				if (i_4437_ != 0) {
				    int i_4438_
					= anIntArray11408[i_4437_ & 0xff];
				    if ((anInt9011 & 0xffffff) == 16777215) {
					int i_4439_ = anInt9011 >>> 24;
					int i_4440_ = 256 - i_4439_;
					int i_4441_ = is[i_4423_];
					is[i_4423_]
					    = ((((i_4438_ & 0xff00ff) * i_4439_
						 + ((i_4441_ & 0xff00ff)
						    * i_4440_))
						& ~0xff00ff)
					       + (((i_4438_ & 0xff00) * i_4439_
						   + ((i_4441_ & 0xff00)
						      * i_4440_))
						  & 0xff0000)) >> 8;
				    } else if (anInt9012 != 255) {
					int i_4442_
					    = ((i_4438_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_4443_
					    = ((i_4438_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_4444_
					    = ((i_4438_ & 0xff) * anInt9018
					       & 0xff00);
					i_4438_ = (i_4442_ | i_4443_
						   | i_4444_) >>> 8;
					int i_4445_ = is[i_4423_];
					is[i_4423_]
					    = (((((i_4438_ & 0xff00ff)
						  * anInt9012)
						 + ((i_4445_ & 0xff00ff)
						    * anInt9013))
						& ~0xff00ff)
					       + ((((i_4438_ & 0xff00)
						    * anInt9012)
						   + ((i_4445_ & 0xff00)
						      * anInt9013))
						  & 0xff0000)) >> 8;
				    } else {
					int i_4446_
					    = ((i_4438_ & 0xff0000) * anInt9014
					       & ~0xffffff);
					int i_4447_
					    = ((i_4438_ & 0xff00) * anInt9015
					       & 0xff0000);
					int i_4448_
					    = ((i_4438_ & 0xff) * anInt9018
					       & 0xff00);
					is[i_4423_] = (i_4446_ | i_4447_
						       | i_4448_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_4449_ = aByteArray11407[i_4422_];
				int i_4450_ = (i_4449_ > 0
					       ? anIntArray11408[i_4449_] : 0);
				int i_4451_ = anInt9011;
				int i_4452_ = i_4450_ + i_4451_;
				int i_4453_ = ((i_4450_ & 0xff00ff)
					       + (i_4451_ & 0xff00ff));
				int i_4454_
				    = ((i_4453_ & 0x1000100)
				       + (i_4452_ - i_4453_ & 0x10000));
				i_4454_
				    = i_4452_ - i_4454_ | i_4454_ - (i_4454_
								     >>> 8);
				if (i_4450_ == 0 && anInt9012 != 255) {
				    i_4450_ = i_4454_;
				    i_4454_ = is[i_4423_];
				    i_4454_
					= ((((i_4450_ & 0xff00ff) * anInt9012
					     + ((i_4454_ & 0xff00ff)
						* anInt9013))
					    & ~0xff00ff)
					   + (((i_4450_ & 0xff00) * anInt9012
					       + ((i_4454_ & 0xff00)
						  * anInt9013))
					      & 0xff0000)) >> 8;
				}
				is[i_4423_] = i_4454_;
			    } else if (i == 2) {
				int i_4455_ = aByteArray11407[i_4422_];
				if (i_4455_ != 0) {
				    int i_4456_
					= anIntArray11408[i_4455_ & 0xff];
				    int i_4457_
					= ((i_4456_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_4458_
					= ((i_4456_ & 0xff00) * anInt9012
					   & 0xff0000);
				    is[i_4423_++] = ((i_4457_ | i_4458_)
						     >>> 8) + anInt9019;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_3860_ == 2) {
			    if (i == 1) {
				int i_4459_ = aByteArray11407[i_4422_];
				if (i_4459_ != 0) {
				    int i_4460_
					= anIntArray11408[i_4459_ & 0xff];
				    int i_4461_ = is[i_4423_];
				    int i_4462_ = i_4460_ + i_4461_;
				    int i_4463_ = ((i_4460_ & 0xff00ff)
						   + (i_4461_ & 0xff00ff));
				    i_4461_
					= ((i_4463_ & 0x1000100)
					   + (i_4462_ - i_4463_ & 0x10000));
				    is[i_4423_]
					= (i_4462_ - i_4461_
					   | i_4461_ - (i_4461_ >>> 8));
				}
			    } else if (i == 0) {
				int i_4464_ = aByteArray11407[i_4422_];
				if (i_4464_ != 0) {
				    int i_4465_
					= anIntArray11408[i_4464_ & 0xff];
				    int i_4466_
					= ((i_4465_ & 0xff0000) * anInt9014
					   & ~0xffffff);
				    int i_4467_
					= ((i_4465_ & 0xff00) * anInt9015
					   & 0xff0000);
				    int i_4468_ = ((i_4465_ & 0xff) * anInt9018
						   & 0xff00);
				    i_4465_
					= (i_4466_ | i_4467_ | i_4468_) >>> 8;
				    int i_4469_ = is[i_4423_];
				    int i_4470_ = i_4465_ + i_4469_;
				    int i_4471_ = ((i_4465_ & 0xff00ff)
						   + (i_4469_ & 0xff00ff));
				    i_4469_
					= ((i_4471_ & 0x1000100)
					   + (i_4470_ - i_4471_ & 0x10000));
				    is[i_4423_]
					= (i_4470_ - i_4469_
					   | i_4469_ - (i_4469_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_4472_ = aByteArray11407[i_4422_];
				int i_4473_ = (i_4472_ > 0
					       ? anIntArray11408[i_4472_] : 0);
				int i_4474_ = anInt9011;
				int i_4475_ = i_4473_ + i_4474_;
				int i_4476_ = ((i_4473_ & 0xff00ff)
					       + (i_4474_ & 0xff00ff));
				int i_4477_
				    = ((i_4476_ & 0x1000100)
				       + (i_4475_ - i_4476_ & 0x10000));
				i_4477_
				    = i_4475_ - i_4477_ | i_4477_ - (i_4477_
								     >>> 8);
				if (i_4473_ == 0 && anInt9012 != 255) {
				    i_4473_ = i_4477_;
				    i_4477_ = is[i_4423_];
				    i_4477_
					= ((((i_4473_ & 0xff00ff) * anInt9012
					     + ((i_4477_ & 0xff00ff)
						* anInt9013))
					    & ~0xff00ff)
					   + (((i_4473_ & 0xff00) * anInt9012
					       + ((i_4477_ & 0xff00)
						  * anInt9013))
					      & 0xff0000)) >> 8;
				}
				is[i_4423_] = i_4477_;
			    } else if (i == 2) {
				int i_4478_ = aByteArray11407[i_4422_];
				if (i_4478_ != 0) {
				    int i_4479_
					= anIntArray11408[i_4478_ & 0xff];
				    int i_4480_
					= ((i_4479_ & 0xff00ff) * anInt9012
					   & ~0xff00ff);
				    int i_4481_
					= ((i_4479_ & 0xff00) * anInt9012
					   & 0xff0000);
				    i_4479_ = (((i_4480_ | i_4481_) >>> 8)
					       + anInt9019);
				    int i_4482_ = is[i_4423_];
				    int i_4483_ = i_4479_ + i_4482_;
				    int i_4484_ = ((i_4479_ & 0xff00ff)
						   + (i_4482_ & 0xff00ff));
				    i_4482_
					= ((i_4484_ & 0x1000100)
					   + (i_4483_ - i_4484_ & 0x10000));
				    is[i_4423_]
					= (i_4483_ - i_4482_
					   | i_4482_ - (i_4482_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_4417_ += anInt9001;
			i_4418_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    }
	}
    }
    
    void method14517(int[] is, int[] is_4485_, int i, int i_4486_) {
	int[] is_4487_ = aClass185_Sub2_9016.anIntArray9338;
	if (is_4487_ != null) {
	    if (anInt9001 == 0) {
		if (anInt9000 == 0) {
		    int i_4488_ = anInt8998;
		    while (i_4488_ < 0) {
			int i_4489_ = i_4488_ + i_4486_;
			if (i_4489_ >= 0) {
			    if (i_4489_ >= is.length)
				break;
			    int i_4490_ = anInt8988;
			    int i_4491_ = anInt9007;
			    int i_4492_ = anInt9003;
			    int i_4493_ = anInt8999;
			    if (i_4491_ >= 0 && i_4492_ >= 0
				&& i_4491_ - (anInt8985 << 12) < 0
				&& i_4492_ - (anInt9002 << 12) < 0) {
				int i_4494_ = is[i_4489_] - i;
				int i_4495_ = -is_4485_[i_4489_];
				int i_4496_ = i_4494_ - (i_4490_ - anInt8988);
				if (i_4496_ > 0) {
				    i_4490_ += i_4496_;
				    i_4493_ += i_4496_;
				    i_4491_ += anInt9001 * i_4496_;
				    i_4492_ += anInt9000 * i_4496_;
				} else
				    i_4495_ -= i_4496_;
				if (i_4493_ < i_4495_)
				    i_4493_ = i_4495_;
				for (/**/; i_4493_ < 0; i_4493_++) {
				    int i_4497_
					= (aByteArray11407
					   [((i_4492_ >> 12) * anInt8985
					     + (i_4491_ >> 12))]);
				    if (i_4497_ != 0)
					is_4487_[i_4490_++]
					    = anIntArray11408[i_4497_ & 0xff];
				    else
					i_4490_++;
				}
			    }
			}
			i_4488_++;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_4498_ = anInt8998;
		    while (i_4498_ < 0) {
			int i_4499_ = i_4498_ + i_4486_;
			if (i_4499_ >= 0) {
			    if (i_4499_ >= is.length)
				break;
			    int i_4500_ = anInt8988;
			    int i_4501_ = anInt9007;
			    int i_4502_ = anInt9003 + anInt9010;
			    int i_4503_ = anInt8999;
			    if (i_4501_ >= 0
				&& i_4501_ - (anInt8985 << 12) < 0) {
				int i_4504_;
				if ((i_4504_ = i_4502_ - (anInt9002 << 12))
				    >= 0) {
				    i_4504_
					= (anInt9000 - i_4504_) / anInt9000;
				    i_4503_ += i_4504_;
				    i_4502_ += anInt9000 * i_4504_;
				    i_4500_ += i_4504_;
				}
				if ((i_4504_
				     = (i_4502_ - anInt9000) / anInt9000)
				    > i_4503_)
				    i_4503_ = i_4504_;
				int i_4505_ = is[i_4499_] - i;
				int i_4506_ = -is_4485_[i_4499_];
				int i_4507_ = i_4505_ - (i_4500_ - anInt8988);
				if (i_4507_ > 0) {
				    i_4500_ += i_4507_;
				    i_4503_ += i_4507_;
				    i_4501_ += anInt9001 * i_4507_;
				    i_4502_ += anInt9000 * i_4507_;
				} else
				    i_4506_ -= i_4507_;
				if (i_4503_ < i_4506_)
				    i_4503_ = i_4506_;
				for (/**/; i_4503_ < 0; i_4503_++) {
				    int i_4508_
					= (aByteArray11407
					   [((i_4502_ >> 12) * anInt8985
					     + (i_4501_ >> 12))]);
				    if (i_4508_ != 0)
					is_4487_[i_4500_++]
					    = anIntArray11408[i_4508_ & 0xff];
				    else
					i_4500_++;
				    i_4502_ += anInt9000;
				}
			    }
			}
			i_4498_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_4509_ = anInt8998;
		    while (i_4509_ < 0) {
			int i_4510_ = i_4509_ + i_4486_;
			if (i_4510_ >= 0) {
			    if (i_4510_ >= is.length)
				break;
			    int i_4511_ = anInt8988;
			    int i_4512_ = anInt9007;
			    int i_4513_ = anInt9003 + anInt9010;
			    int i_4514_ = anInt8999;
			    if (i_4512_ >= 0
				&& i_4512_ - (anInt8985 << 12) < 0) {
				if (i_4513_ < 0) {
				    int i_4515_ = ((anInt9000 - 1 - i_4513_)
						   / anInt9000);
				    i_4514_ += i_4515_;
				    i_4513_ += anInt9000 * i_4515_;
				    i_4511_ += i_4515_;
				}
				int i_4516_;
				if ((i_4516_ = (1 + i_4513_ - (anInt9002 << 12)
						- anInt9000) / anInt9000)
				    > i_4514_)
				    i_4514_ = i_4516_;
				int i_4517_ = is[i_4510_] - i;
				int i_4518_ = -is_4485_[i_4510_];
				int i_4519_ = i_4517_ - (i_4511_ - anInt8988);
				if (i_4519_ > 0) {
				    i_4511_ += i_4519_;
				    i_4514_ += i_4519_;
				    i_4512_ += anInt9001 * i_4519_;
				    i_4513_ += anInt9000 * i_4519_;
				} else
				    i_4518_ -= i_4519_;
				if (i_4514_ < i_4518_)
				    i_4514_ = i_4518_;
				for (/**/; i_4514_ < 0; i_4514_++) {
				    int i_4520_
					= (aByteArray11407
					   [((i_4513_ >> 12) * anInt8985
					     + (i_4512_ >> 12))]);
				    if (i_4520_ != 0)
					is_4487_[i_4511_++]
					    = anIntArray11408[i_4520_ & 0xff];
				    else
					i_4511_++;
				    i_4513_ += anInt9000;
				}
			    }
			}
			i_4509_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9001 < 0) {
		if (anInt9000 == 0) {
		    int i_4521_ = anInt8998;
		    while (i_4521_ < 0) {
			int i_4522_ = i_4521_ + i_4486_;
			if (i_4522_ >= 0) {
			    if (i_4522_ >= is.length)
				break;
			    int i_4523_ = anInt8988;
			    int i_4524_ = anInt9007 + anInt9009;
			    int i_4525_ = anInt9003;
			    int i_4526_ = anInt8999;
			    if (i_4525_ >= 0
				&& i_4525_ - (anInt9002 << 12) < 0) {
				int i_4527_;
				if ((i_4527_ = i_4524_ - (anInt8985 << 12))
				    >= 0) {
				    i_4527_
					= (anInt9001 - i_4527_) / anInt9001;
				    i_4526_ += i_4527_;
				    i_4524_ += anInt9001 * i_4527_;
				    i_4523_ += i_4527_;
				}
				if ((i_4527_
				     = (i_4524_ - anInt9001) / anInt9001)
				    > i_4526_)
				    i_4526_ = i_4527_;
				int i_4528_ = is[i_4522_] - i;
				int i_4529_ = -is_4485_[i_4522_];
				int i_4530_ = i_4528_ - (i_4523_ - anInt8988);
				if (i_4530_ > 0) {
				    i_4523_ += i_4530_;
				    i_4526_ += i_4530_;
				    i_4524_ += anInt9001 * i_4530_;
				    i_4525_ += anInt9000 * i_4530_;
				} else
				    i_4529_ -= i_4530_;
				if (i_4526_ < i_4529_)
				    i_4526_ = i_4529_;
				for (/**/; i_4526_ < 0; i_4526_++) {
				    int i_4531_
					= (aByteArray11407
					   [((i_4525_ >> 12) * anInt8985
					     + (i_4524_ >> 12))]);
				    if (i_4531_ != 0)
					is_4487_[i_4523_++]
					    = anIntArray11408[i_4531_ & 0xff];
				    else
					i_4523_++;
				    i_4524_ += anInt9001;
				}
			    }
			}
			i_4521_++;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_4532_ = anInt8998;
		    while (i_4532_ < 0) {
			int i_4533_ = i_4532_ + i_4486_;
			if (i_4533_ >= 0) {
			    if (i_4533_ >= is.length)
				break;
			    int i_4534_ = anInt8988;
			    int i_4535_ = anInt9007 + anInt9009;
			    int i_4536_ = anInt9003 + anInt9010;
			    int i_4537_ = anInt8999;
			    int i_4538_;
			    if ((i_4538_ = i_4535_ - (anInt8985 << 12)) >= 0) {
				i_4538_ = (anInt9001 - i_4538_) / anInt9001;
				i_4537_ += i_4538_;
				i_4535_ += anInt9001 * i_4538_;
				i_4536_ += anInt9000 * i_4538_;
				i_4534_ += i_4538_;
			    }
			    if ((i_4538_ = (i_4535_ - anInt9001) / anInt9001)
				> i_4537_)
				i_4537_ = i_4538_;
			    if ((i_4538_ = i_4536_ - (anInt9002 << 12)) >= 0) {
				i_4538_ = (anInt9000 - i_4538_) / anInt9000;
				i_4537_ += i_4538_;
				i_4535_ += anInt9001 * i_4538_;
				i_4536_ += anInt9000 * i_4538_;
				i_4534_ += i_4538_;
			    }
			    if ((i_4538_ = (i_4536_ - anInt9000) / anInt9000)
				> i_4537_)
				i_4537_ = i_4538_;
			    int i_4539_ = is[i_4533_] - i;
			    int i_4540_ = -is_4485_[i_4533_];
			    int i_4541_ = i_4539_ - (i_4534_ - anInt8988);
			    if (i_4541_ > 0) {
				i_4534_ += i_4541_;
				i_4537_ += i_4541_;
				i_4535_ += anInt9001 * i_4541_;
				i_4536_ += anInt9000 * i_4541_;
			    } else
				i_4540_ -= i_4541_;
			    if (i_4537_ < i_4540_)
				i_4537_ = i_4540_;
			    for (/**/; i_4537_ < 0; i_4537_++) {
				int i_4542_ = (aByteArray11407
					       [((i_4536_ >> 12) * anInt8985
						 + (i_4535_ >> 12))]);
				if (i_4542_ != 0)
				    is_4487_[i_4534_++]
					= anIntArray11408[i_4542_ & 0xff];
				else
				    i_4534_++;
				i_4535_ += anInt9001;
				i_4536_ += anInt9000;
			    }
			}
			i_4532_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_4543_ = anInt8998;
		    while (i_4543_ < 0) {
			int i_4544_ = i_4543_ + i_4486_;
			if (i_4544_ >= 0) {
			    if (i_4544_ >= is.length)
				break;
			    int i_4545_ = anInt8988;
			    int i_4546_ = anInt9007 + anInt9009;
			    int i_4547_ = anInt9003 + anInt9010;
			    int i_4548_ = anInt8999;
			    int i_4549_;
			    if ((i_4549_ = i_4546_ - (anInt8985 << 12)) >= 0) {
				i_4549_ = (anInt9001 - i_4549_) / anInt9001;
				i_4548_ += i_4549_;
				i_4546_ += anInt9001 * i_4549_;
				i_4547_ += anInt9000 * i_4549_;
				i_4545_ += i_4549_;
			    }
			    if ((i_4549_ = (i_4546_ - anInt9001) / anInt9001)
				> i_4548_)
				i_4548_ = i_4549_;
			    if (i_4547_ < 0) {
				i_4549_
				    = (anInt9000 - 1 - i_4547_) / anInt9000;
				i_4548_ += i_4549_;
				i_4546_ += anInt9001 * i_4549_;
				i_4547_ += anInt9000 * i_4549_;
				i_4545_ += i_4549_;
			    }
			    if ((i_4549_ = (1 + i_4547_ - (anInt9002 << 12)
					    - anInt9000) / anInt9000)
				> i_4548_)
				i_4548_ = i_4549_;
			    int i_4550_ = is[i_4544_] - i;
			    int i_4551_ = -is_4485_[i_4544_];
			    int i_4552_ = i_4550_ - (i_4545_ - anInt8988);
			    if (i_4552_ > 0) {
				i_4545_ += i_4552_;
				i_4548_ += i_4552_;
				i_4546_ += anInt9001 * i_4552_;
				i_4547_ += anInt9000 * i_4552_;
			    } else
				i_4551_ -= i_4552_;
			    if (i_4548_ < i_4551_)
				i_4548_ = i_4551_;
			    for (/**/; i_4548_ < 0; i_4548_++) {
				int i_4553_ = (aByteArray11407
					       [((i_4547_ >> 12) * anInt8985
						 + (i_4546_ >> 12))]);
				if (i_4553_ != 0)
				    is_4487_[i_4545_++]
					= anIntArray11408[i_4553_ & 0xff];
				else
				    i_4545_++;
				i_4546_ += anInt9001;
				i_4547_ += anInt9000;
			    }
			}
			i_4543_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9000 == 0) {
		int i_4554_ = anInt8998;
		while (i_4554_ < 0) {
		    int i_4555_ = i_4554_ + i_4486_;
		    if (i_4555_ >= 0) {
			if (i_4555_ >= is.length)
			    break;
			int i_4556_ = anInt8988;
			int i_4557_ = anInt9007 + anInt9009;
			int i_4558_ = anInt9003;
			int i_4559_ = anInt8999;
			if (i_4558_ >= 0 && i_4558_ - (anInt9002 << 12) < 0) {
			    if (i_4557_ < 0) {
				int i_4560_
				    = (anInt9001 - 1 - i_4557_) / anInt9001;
				i_4559_ += i_4560_;
				i_4557_ += anInt9001 * i_4560_;
				i_4556_ += i_4560_;
			    }
			    int i_4561_;
			    if ((i_4561_ = (1 + i_4557_ - (anInt8985 << 12)
					    - anInt9001) / anInt9001)
				> i_4559_)
				i_4559_ = i_4561_;
			    int i_4562_ = is[i_4555_] - i;
			    int i_4563_ = -is_4485_[i_4555_];
			    int i_4564_ = i_4562_ - (i_4556_ - anInt8988);
			    if (i_4564_ > 0) {
				i_4556_ += i_4564_;
				i_4559_ += i_4564_;
				i_4557_ += anInt9001 * i_4564_;
				i_4558_ += anInt9000 * i_4564_;
			    } else
				i_4563_ -= i_4564_;
			    if (i_4559_ < i_4563_)
				i_4559_ = i_4563_;
			    for (/**/; i_4559_ < 0; i_4559_++) {
				int i_4565_ = (aByteArray11407
					       [((i_4558_ >> 12) * anInt8985
						 + (i_4557_ >> 12))]);
				if (i_4565_ != 0)
				    is_4487_[i_4556_++]
					= anIntArray11408[i_4565_ & 0xff];
				else
				    i_4556_++;
				i_4557_ += anInt9001;
			    }
			}
		    }
		    i_4554_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else if (anInt9000 < 0) {
		int i_4566_ = anInt8998;
		while (i_4566_ < 0) {
		    int i_4567_ = i_4566_ + i_4486_;
		    if (i_4567_ >= 0) {
			if (i_4567_ >= is.length)
			    break;
			int i_4568_ = anInt8988;
			int i_4569_ = anInt9007 + anInt9009;
			int i_4570_ = anInt9003 + anInt9010;
			int i_4571_ = anInt8999;
			if (i_4569_ < 0) {
			    int i_4572_
				= (anInt9001 - 1 - i_4569_) / anInt9001;
			    i_4571_ += i_4572_;
			    i_4569_ += anInt9001 * i_4572_;
			    i_4570_ += anInt9000 * i_4572_;
			    i_4568_ += i_4572_;
			}
			int i_4573_;
			if ((i_4573_ = (1 + i_4569_ - (anInt8985 << 12)
					- anInt9001) / anInt9001)
			    > i_4571_)
			    i_4571_ = i_4573_;
			if ((i_4573_ = i_4570_ - (anInt9002 << 12)) >= 0) {
			    i_4573_ = (anInt9000 - i_4573_) / anInt9000;
			    i_4571_ += i_4573_;
			    i_4569_ += anInt9001 * i_4573_;
			    i_4570_ += anInt9000 * i_4573_;
			    i_4568_ += i_4573_;
			}
			if ((i_4573_ = (i_4570_ - anInt9000) / anInt9000)
			    > i_4571_)
			    i_4571_ = i_4573_;
			int i_4574_ = is[i_4567_] - i;
			int i_4575_ = -is_4485_[i_4567_];
			int i_4576_ = i_4574_ - (i_4568_ - anInt8988);
			if (i_4576_ > 0) {
			    i_4568_ += i_4576_;
			    i_4571_ += i_4576_;
			    i_4569_ += anInt9001 * i_4576_;
			    i_4570_ += anInt9000 * i_4576_;
			} else
			    i_4575_ -= i_4576_;
			if (i_4571_ < i_4575_)
			    i_4571_ = i_4575_;
			for (/**/; i_4571_ < 0; i_4571_++) {
			    int i_4577_
				= (aByteArray11407
				   [(i_4570_ >> 12) * anInt8985 + (i_4569_
								   >> 12)]);
			    if (i_4577_ != 0)
				is_4487_[i_4568_++]
				    = anIntArray11408[i_4577_ & 0xff];
			    else
				i_4568_++;
			    i_4569_ += anInt9001;
			    i_4570_ += anInt9000;
			}
		    }
		    i_4566_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else {
		int i_4578_ = anInt8998;
		while (i_4578_ < 0) {
		    int i_4579_ = i_4578_ + i_4486_;
		    if (i_4579_ >= 0) {
			if (i_4579_ >= is.length)
			    break;
			int i_4580_ = anInt8988;
			int i_4581_ = anInt9007 + anInt9009;
			int i_4582_ = anInt9003 + anInt9010;
			int i_4583_ = anInt8999;
			if (i_4581_ < 0) {
			    int i_4584_
				= (anInt9001 - 1 - i_4581_) / anInt9001;
			    i_4583_ += i_4584_;
			    i_4581_ += anInt9001 * i_4584_;
			    i_4582_ += anInt9000 * i_4584_;
			    i_4580_ += i_4584_;
			}
			int i_4585_;
			if ((i_4585_ = (1 + i_4581_ - (anInt8985 << 12)
					- anInt9001) / anInt9001)
			    > i_4583_)
			    i_4583_ = i_4585_;
			if (i_4582_ < 0) {
			    i_4585_ = (anInt9000 - 1 - i_4582_) / anInt9000;
			    i_4583_ += i_4585_;
			    i_4581_ += anInt9001 * i_4585_;
			    i_4582_ += anInt9000 * i_4585_;
			    i_4580_ += i_4585_;
			}
			if ((i_4585_ = (1 + i_4582_ - (anInt9002 << 12)
					- anInt9000) / anInt9000)
			    > i_4583_)
			    i_4583_ = i_4585_;
			int i_4586_ = is[i_4579_] - i;
			int i_4587_ = -is_4485_[i_4579_];
			int i_4588_ = i_4586_ - (i_4580_ - anInt8988);
			if (i_4588_ > 0) {
			    i_4580_ += i_4588_;
			    i_4583_ += i_4588_;
			    i_4581_ += anInt9001 * i_4588_;
			    i_4582_ += anInt9000 * i_4588_;
			} else
			    i_4587_ -= i_4588_;
			if (i_4583_ < i_4587_)
			    i_4583_ = i_4587_;
			for (/**/; i_4583_ < 0; i_4583_++) {
			    int i_4589_
				= (aByteArray11407
				   [(i_4582_ >> 12) * anInt8985 + (i_4581_
								   >> 12)]);
			    if (i_4589_ != 0)
				is_4487_[i_4580_++]
				    = anIntArray11408[i_4589_ & 0xff];
			    else
				i_4580_++;
			    i_4581_ += anInt9001;
			    i_4582_ += anInt9000;
			}
		    }
		    i_4578_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    }
	}
    }
    
    public void method2648(int i, int i_4590_, int i_4591_, int i_4592_,
			   int[] is, int[] is_4593_, int i_4594_,
			   int i_4595_) {
	throw new IllegalStateException();
    }
    
    public void method2737(int i, int i_4596_, int i_4597_, int i_4598_,
			   int[] is, int i_4599_, int i_4600_) {
	throw new IllegalStateException();
    }
    
    void method14514(int[] is, int[] is_4601_, int i, int i_4602_) {
	int[] is_4603_ = aClass185_Sub2_9016.anIntArray9338;
	if (is_4603_ != null) {
	    if (anInt9001 == 0) {
		if (anInt9000 == 0) {
		    int i_4604_ = anInt8998;
		    while (i_4604_ < 0) {
			int i_4605_ = i_4604_ + i_4602_;
			if (i_4605_ >= 0) {
			    if (i_4605_ >= is.length)
				break;
			    int i_4606_ = anInt8988;
			    int i_4607_ = anInt9007;
			    int i_4608_ = anInt9003;
			    int i_4609_ = anInt8999;
			    if (i_4607_ >= 0 && i_4608_ >= 0
				&& i_4607_ - (anInt8985 << 12) < 0
				&& i_4608_ - (anInt9002 << 12) < 0) {
				int i_4610_ = is[i_4605_] - i;
				int i_4611_ = -is_4601_[i_4605_];
				int i_4612_ = i_4610_ - (i_4606_ - anInt8988);
				if (i_4612_ > 0) {
				    i_4606_ += i_4612_;
				    i_4609_ += i_4612_;
				    i_4607_ += anInt9001 * i_4612_;
				    i_4608_ += anInt9000 * i_4612_;
				} else
				    i_4611_ -= i_4612_;
				if (i_4609_ < i_4611_)
				    i_4609_ = i_4611_;
				for (/**/; i_4609_ < 0; i_4609_++) {
				    int i_4613_
					= (aByteArray11407
					   [((i_4608_ >> 12) * anInt8985
					     + (i_4607_ >> 12))]);
				    if (i_4613_ != 0)
					is_4603_[i_4606_++]
					    = anIntArray11408[i_4613_ & 0xff];
				    else
					i_4606_++;
				}
			    }
			}
			i_4604_++;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_4614_ = anInt8998;
		    while (i_4614_ < 0) {
			int i_4615_ = i_4614_ + i_4602_;
			if (i_4615_ >= 0) {
			    if (i_4615_ >= is.length)
				break;
			    int i_4616_ = anInt8988;
			    int i_4617_ = anInt9007;
			    int i_4618_ = anInt9003 + anInt9010;
			    int i_4619_ = anInt8999;
			    if (i_4617_ >= 0
				&& i_4617_ - (anInt8985 << 12) < 0) {
				int i_4620_;
				if ((i_4620_ = i_4618_ - (anInt9002 << 12))
				    >= 0) {
				    i_4620_
					= (anInt9000 - i_4620_) / anInt9000;
				    i_4619_ += i_4620_;
				    i_4618_ += anInt9000 * i_4620_;
				    i_4616_ += i_4620_;
				}
				if ((i_4620_
				     = (i_4618_ - anInt9000) / anInt9000)
				    > i_4619_)
				    i_4619_ = i_4620_;
				int i_4621_ = is[i_4615_] - i;
				int i_4622_ = -is_4601_[i_4615_];
				int i_4623_ = i_4621_ - (i_4616_ - anInt8988);
				if (i_4623_ > 0) {
				    i_4616_ += i_4623_;
				    i_4619_ += i_4623_;
				    i_4617_ += anInt9001 * i_4623_;
				    i_4618_ += anInt9000 * i_4623_;
				} else
				    i_4622_ -= i_4623_;
				if (i_4619_ < i_4622_)
				    i_4619_ = i_4622_;
				for (/**/; i_4619_ < 0; i_4619_++) {
				    int i_4624_
					= (aByteArray11407
					   [((i_4618_ >> 12) * anInt8985
					     + (i_4617_ >> 12))]);
				    if (i_4624_ != 0)
					is_4603_[i_4616_++]
					    = anIntArray11408[i_4624_ & 0xff];
				    else
					i_4616_++;
				    i_4618_ += anInt9000;
				}
			    }
			}
			i_4614_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_4625_ = anInt8998;
		    while (i_4625_ < 0) {
			int i_4626_ = i_4625_ + i_4602_;
			if (i_4626_ >= 0) {
			    if (i_4626_ >= is.length)
				break;
			    int i_4627_ = anInt8988;
			    int i_4628_ = anInt9007;
			    int i_4629_ = anInt9003 + anInt9010;
			    int i_4630_ = anInt8999;
			    if (i_4628_ >= 0
				&& i_4628_ - (anInt8985 << 12) < 0) {
				if (i_4629_ < 0) {
				    int i_4631_ = ((anInt9000 - 1 - i_4629_)
						   / anInt9000);
				    i_4630_ += i_4631_;
				    i_4629_ += anInt9000 * i_4631_;
				    i_4627_ += i_4631_;
				}
				int i_4632_;
				if ((i_4632_ = (1 + i_4629_ - (anInt9002 << 12)
						- anInt9000) / anInt9000)
				    > i_4630_)
				    i_4630_ = i_4632_;
				int i_4633_ = is[i_4626_] - i;
				int i_4634_ = -is_4601_[i_4626_];
				int i_4635_ = i_4633_ - (i_4627_ - anInt8988);
				if (i_4635_ > 0) {
				    i_4627_ += i_4635_;
				    i_4630_ += i_4635_;
				    i_4628_ += anInt9001 * i_4635_;
				    i_4629_ += anInt9000 * i_4635_;
				} else
				    i_4634_ -= i_4635_;
				if (i_4630_ < i_4634_)
				    i_4630_ = i_4634_;
				for (/**/; i_4630_ < 0; i_4630_++) {
				    int i_4636_
					= (aByteArray11407
					   [((i_4629_ >> 12) * anInt8985
					     + (i_4628_ >> 12))]);
				    if (i_4636_ != 0)
					is_4603_[i_4627_++]
					    = anIntArray11408[i_4636_ & 0xff];
				    else
					i_4627_++;
				    i_4629_ += anInt9000;
				}
			    }
			}
			i_4625_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9001 < 0) {
		if (anInt9000 == 0) {
		    int i_4637_ = anInt8998;
		    while (i_4637_ < 0) {
			int i_4638_ = i_4637_ + i_4602_;
			if (i_4638_ >= 0) {
			    if (i_4638_ >= is.length)
				break;
			    int i_4639_ = anInt8988;
			    int i_4640_ = anInt9007 + anInt9009;
			    int i_4641_ = anInt9003;
			    int i_4642_ = anInt8999;
			    if (i_4641_ >= 0
				&& i_4641_ - (anInt9002 << 12) < 0) {
				int i_4643_;
				if ((i_4643_ = i_4640_ - (anInt8985 << 12))
				    >= 0) {
				    i_4643_
					= (anInt9001 - i_4643_) / anInt9001;
				    i_4642_ += i_4643_;
				    i_4640_ += anInt9001 * i_4643_;
				    i_4639_ += i_4643_;
				}
				if ((i_4643_
				     = (i_4640_ - anInt9001) / anInt9001)
				    > i_4642_)
				    i_4642_ = i_4643_;
				int i_4644_ = is[i_4638_] - i;
				int i_4645_ = -is_4601_[i_4638_];
				int i_4646_ = i_4644_ - (i_4639_ - anInt8988);
				if (i_4646_ > 0) {
				    i_4639_ += i_4646_;
				    i_4642_ += i_4646_;
				    i_4640_ += anInt9001 * i_4646_;
				    i_4641_ += anInt9000 * i_4646_;
				} else
				    i_4645_ -= i_4646_;
				if (i_4642_ < i_4645_)
				    i_4642_ = i_4645_;
				for (/**/; i_4642_ < 0; i_4642_++) {
				    int i_4647_
					= (aByteArray11407
					   [((i_4641_ >> 12) * anInt8985
					     + (i_4640_ >> 12))]);
				    if (i_4647_ != 0)
					is_4603_[i_4639_++]
					    = anIntArray11408[i_4647_ & 0xff];
				    else
					i_4639_++;
				    i_4640_ += anInt9001;
				}
			    }
			}
			i_4637_++;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_4648_ = anInt8998;
		    while (i_4648_ < 0) {
			int i_4649_ = i_4648_ + i_4602_;
			if (i_4649_ >= 0) {
			    if (i_4649_ >= is.length)
				break;
			    int i_4650_ = anInt8988;
			    int i_4651_ = anInt9007 + anInt9009;
			    int i_4652_ = anInt9003 + anInt9010;
			    int i_4653_ = anInt8999;
			    int i_4654_;
			    if ((i_4654_ = i_4651_ - (anInt8985 << 12)) >= 0) {
				i_4654_ = (anInt9001 - i_4654_) / anInt9001;
				i_4653_ += i_4654_;
				i_4651_ += anInt9001 * i_4654_;
				i_4652_ += anInt9000 * i_4654_;
				i_4650_ += i_4654_;
			    }
			    if ((i_4654_ = (i_4651_ - anInt9001) / anInt9001)
				> i_4653_)
				i_4653_ = i_4654_;
			    if ((i_4654_ = i_4652_ - (anInt9002 << 12)) >= 0) {
				i_4654_ = (anInt9000 - i_4654_) / anInt9000;
				i_4653_ += i_4654_;
				i_4651_ += anInt9001 * i_4654_;
				i_4652_ += anInt9000 * i_4654_;
				i_4650_ += i_4654_;
			    }
			    if ((i_4654_ = (i_4652_ - anInt9000) / anInt9000)
				> i_4653_)
				i_4653_ = i_4654_;
			    int i_4655_ = is[i_4649_] - i;
			    int i_4656_ = -is_4601_[i_4649_];
			    int i_4657_ = i_4655_ - (i_4650_ - anInt8988);
			    if (i_4657_ > 0) {
				i_4650_ += i_4657_;
				i_4653_ += i_4657_;
				i_4651_ += anInt9001 * i_4657_;
				i_4652_ += anInt9000 * i_4657_;
			    } else
				i_4656_ -= i_4657_;
			    if (i_4653_ < i_4656_)
				i_4653_ = i_4656_;
			    for (/**/; i_4653_ < 0; i_4653_++) {
				int i_4658_ = (aByteArray11407
					       [((i_4652_ >> 12) * anInt8985
						 + (i_4651_ >> 12))]);
				if (i_4658_ != 0)
				    is_4603_[i_4650_++]
					= anIntArray11408[i_4658_ & 0xff];
				else
				    i_4650_++;
				i_4651_ += anInt9001;
				i_4652_ += anInt9000;
			    }
			}
			i_4648_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_4659_ = anInt8998;
		    while (i_4659_ < 0) {
			int i_4660_ = i_4659_ + i_4602_;
			if (i_4660_ >= 0) {
			    if (i_4660_ >= is.length)
				break;
			    int i_4661_ = anInt8988;
			    int i_4662_ = anInt9007 + anInt9009;
			    int i_4663_ = anInt9003 + anInt9010;
			    int i_4664_ = anInt8999;
			    int i_4665_;
			    if ((i_4665_ = i_4662_ - (anInt8985 << 12)) >= 0) {
				i_4665_ = (anInt9001 - i_4665_) / anInt9001;
				i_4664_ += i_4665_;
				i_4662_ += anInt9001 * i_4665_;
				i_4663_ += anInt9000 * i_4665_;
				i_4661_ += i_4665_;
			    }
			    if ((i_4665_ = (i_4662_ - anInt9001) / anInt9001)
				> i_4664_)
				i_4664_ = i_4665_;
			    if (i_4663_ < 0) {
				i_4665_
				    = (anInt9000 - 1 - i_4663_) / anInt9000;
				i_4664_ += i_4665_;
				i_4662_ += anInt9001 * i_4665_;
				i_4663_ += anInt9000 * i_4665_;
				i_4661_ += i_4665_;
			    }
			    if ((i_4665_ = (1 + i_4663_ - (anInt9002 << 12)
					    - anInt9000) / anInt9000)
				> i_4664_)
				i_4664_ = i_4665_;
			    int i_4666_ = is[i_4660_] - i;
			    int i_4667_ = -is_4601_[i_4660_];
			    int i_4668_ = i_4666_ - (i_4661_ - anInt8988);
			    if (i_4668_ > 0) {
				i_4661_ += i_4668_;
				i_4664_ += i_4668_;
				i_4662_ += anInt9001 * i_4668_;
				i_4663_ += anInt9000 * i_4668_;
			    } else
				i_4667_ -= i_4668_;
			    if (i_4664_ < i_4667_)
				i_4664_ = i_4667_;
			    for (/**/; i_4664_ < 0; i_4664_++) {
				int i_4669_ = (aByteArray11407
					       [((i_4663_ >> 12) * anInt8985
						 + (i_4662_ >> 12))]);
				if (i_4669_ != 0)
				    is_4603_[i_4661_++]
					= anIntArray11408[i_4669_ & 0xff];
				else
				    i_4661_++;
				i_4662_ += anInt9001;
				i_4663_ += anInt9000;
			    }
			}
			i_4659_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9000 == 0) {
		int i_4670_ = anInt8998;
		while (i_4670_ < 0) {
		    int i_4671_ = i_4670_ + i_4602_;
		    if (i_4671_ >= 0) {
			if (i_4671_ >= is.length)
			    break;
			int i_4672_ = anInt8988;
			int i_4673_ = anInt9007 + anInt9009;
			int i_4674_ = anInt9003;
			int i_4675_ = anInt8999;
			if (i_4674_ >= 0 && i_4674_ - (anInt9002 << 12) < 0) {
			    if (i_4673_ < 0) {
				int i_4676_
				    = (anInt9001 - 1 - i_4673_) / anInt9001;
				i_4675_ += i_4676_;
				i_4673_ += anInt9001 * i_4676_;
				i_4672_ += i_4676_;
			    }
			    int i_4677_;
			    if ((i_4677_ = (1 + i_4673_ - (anInt8985 << 12)
					    - anInt9001) / anInt9001)
				> i_4675_)
				i_4675_ = i_4677_;
			    int i_4678_ = is[i_4671_] - i;
			    int i_4679_ = -is_4601_[i_4671_];
			    int i_4680_ = i_4678_ - (i_4672_ - anInt8988);
			    if (i_4680_ > 0) {
				i_4672_ += i_4680_;
				i_4675_ += i_4680_;
				i_4673_ += anInt9001 * i_4680_;
				i_4674_ += anInt9000 * i_4680_;
			    } else
				i_4679_ -= i_4680_;
			    if (i_4675_ < i_4679_)
				i_4675_ = i_4679_;
			    for (/**/; i_4675_ < 0; i_4675_++) {
				int i_4681_ = (aByteArray11407
					       [((i_4674_ >> 12) * anInt8985
						 + (i_4673_ >> 12))]);
				if (i_4681_ != 0)
				    is_4603_[i_4672_++]
					= anIntArray11408[i_4681_ & 0xff];
				else
				    i_4672_++;
				i_4673_ += anInt9001;
			    }
			}
		    }
		    i_4670_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else if (anInt9000 < 0) {
		int i_4682_ = anInt8998;
		while (i_4682_ < 0) {
		    int i_4683_ = i_4682_ + i_4602_;
		    if (i_4683_ >= 0) {
			if (i_4683_ >= is.length)
			    break;
			int i_4684_ = anInt8988;
			int i_4685_ = anInt9007 + anInt9009;
			int i_4686_ = anInt9003 + anInt9010;
			int i_4687_ = anInt8999;
			if (i_4685_ < 0) {
			    int i_4688_
				= (anInt9001 - 1 - i_4685_) / anInt9001;
			    i_4687_ += i_4688_;
			    i_4685_ += anInt9001 * i_4688_;
			    i_4686_ += anInt9000 * i_4688_;
			    i_4684_ += i_4688_;
			}
			int i_4689_;
			if ((i_4689_ = (1 + i_4685_ - (anInt8985 << 12)
					- anInt9001) / anInt9001)
			    > i_4687_)
			    i_4687_ = i_4689_;
			if ((i_4689_ = i_4686_ - (anInt9002 << 12)) >= 0) {
			    i_4689_ = (anInt9000 - i_4689_) / anInt9000;
			    i_4687_ += i_4689_;
			    i_4685_ += anInt9001 * i_4689_;
			    i_4686_ += anInt9000 * i_4689_;
			    i_4684_ += i_4689_;
			}
			if ((i_4689_ = (i_4686_ - anInt9000) / anInt9000)
			    > i_4687_)
			    i_4687_ = i_4689_;
			int i_4690_ = is[i_4683_] - i;
			int i_4691_ = -is_4601_[i_4683_];
			int i_4692_ = i_4690_ - (i_4684_ - anInt8988);
			if (i_4692_ > 0) {
			    i_4684_ += i_4692_;
			    i_4687_ += i_4692_;
			    i_4685_ += anInt9001 * i_4692_;
			    i_4686_ += anInt9000 * i_4692_;
			} else
			    i_4691_ -= i_4692_;
			if (i_4687_ < i_4691_)
			    i_4687_ = i_4691_;
			for (/**/; i_4687_ < 0; i_4687_++) {
			    int i_4693_
				= (aByteArray11407
				   [(i_4686_ >> 12) * anInt8985 + (i_4685_
								   >> 12)]);
			    if (i_4693_ != 0)
				is_4603_[i_4684_++]
				    = anIntArray11408[i_4693_ & 0xff];
			    else
				i_4684_++;
			    i_4685_ += anInt9001;
			    i_4686_ += anInt9000;
			}
		    }
		    i_4682_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else {
		int i_4694_ = anInt8998;
		while (i_4694_ < 0) {
		    int i_4695_ = i_4694_ + i_4602_;
		    if (i_4695_ >= 0) {
			if (i_4695_ >= is.length)
			    break;
			int i_4696_ = anInt8988;
			int i_4697_ = anInt9007 + anInt9009;
			int i_4698_ = anInt9003 + anInt9010;
			int i_4699_ = anInt8999;
			if (i_4697_ < 0) {
			    int i_4700_
				= (anInt9001 - 1 - i_4697_) / anInt9001;
			    i_4699_ += i_4700_;
			    i_4697_ += anInt9001 * i_4700_;
			    i_4698_ += anInt9000 * i_4700_;
			    i_4696_ += i_4700_;
			}
			int i_4701_;
			if ((i_4701_ = (1 + i_4697_ - (anInt8985 << 12)
					- anInt9001) / anInt9001)
			    > i_4699_)
			    i_4699_ = i_4701_;
			if (i_4698_ < 0) {
			    i_4701_ = (anInt9000 - 1 - i_4698_) / anInt9000;
			    i_4699_ += i_4701_;
			    i_4697_ += anInt9001 * i_4701_;
			    i_4698_ += anInt9000 * i_4701_;
			    i_4696_ += i_4701_;
			}
			if ((i_4701_ = (1 + i_4698_ - (anInt9002 << 12)
					- anInt9000) / anInt9000)
			    > i_4699_)
			    i_4699_ = i_4701_;
			int i_4702_ = is[i_4695_] - i;
			int i_4703_ = -is_4601_[i_4695_];
			int i_4704_ = i_4702_ - (i_4696_ - anInt8988);
			if (i_4704_ > 0) {
			    i_4696_ += i_4704_;
			    i_4699_ += i_4704_;
			    i_4697_ += anInt9001 * i_4704_;
			    i_4698_ += anInt9000 * i_4704_;
			} else
			    i_4703_ -= i_4704_;
			if (i_4699_ < i_4703_)
			    i_4699_ = i_4703_;
			for (/**/; i_4699_ < 0; i_4699_++) {
			    int i_4705_
				= (aByteArray11407
				   [(i_4698_ >> 12) * anInt8985 + (i_4697_
								   >> 12)]);
			    if (i_4705_ != 0)
				is_4603_[i_4696_++]
				    = anIntArray11408[i_4705_ & 0xff];
			    else
				i_4696_++;
			    i_4697_ += anInt9001;
			    i_4698_ += anInt9000;
			}
		    }
		    i_4694_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    }
	}
    }
    
    public void method2693(int i, int i_4706_, int i_4707_, int i_4708_,
			   int[] is, int[] is_4709_, int i_4710_,
			   int i_4711_) {
	throw new IllegalStateException();
    }
    
    void method14508(boolean bool, boolean bool_4712_, boolean bool_4713_,
		     int i, int i_4714_, float f, int i_4715_, int i_4716_,
		     int i_4717_, int i_4718_, int i_4719_, int i_4720_,
		     boolean bool_4721_) {
	if (i_4715_ > 0 && i_4716_ > 0 && (bool || bool_4712_)) {
	    int i_4722_ = 0;
	    int i_4723_ = 0;
	    int i_4724_ = anInt8987 + anInt8985 + anInt8992;
	    int i_4725_ = anInt8989 + anInt9002 + anInt8990;
	    int i_4726_ = (i_4724_ << 16) / i_4715_;
	    int i_4727_ = (i_4725_ << 16) / i_4716_;
	    if (anInt8987 > 0) {
		int i_4728_ = ((anInt8987 << 16) + i_4726_ - 1) / i_4726_;
		i += i_4728_;
		i_4722_ += i_4728_ * i_4726_ - (anInt8987 << 16);
	    }
	    if (anInt8989 > 0) {
		int i_4729_ = ((anInt8989 << 16) + i_4727_ - 1) / i_4727_;
		i_4714_ += i_4729_;
		i_4723_ += i_4729_ * i_4727_ - (anInt8989 << 16);
	    }
	    if (anInt8985 < i_4724_)
		i_4715_
		    = ((anInt8985 << 16) - i_4722_ + i_4726_ - 1) / i_4726_;
	    if (anInt9002 < i_4725_)
		i_4716_
		    = ((anInt9002 << 16) - i_4723_ + i_4727_ - 1) / i_4727_;
	    int i_4730_
		= i + i_4714_ * (aClass185_Sub2_9016.anInt9356 * 356365251);
	    int i_4731_ = aClass185_Sub2_9016.anInt9356 * 356365251 - i_4715_;
	    if (i_4714_ + i_4716_ > aClass185_Sub2_9016.anInt9345 * 639238427)
		i_4716_ -= (i_4714_ + i_4716_
			    - aClass185_Sub2_9016.anInt9345 * 639238427);
	    if (i_4714_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		int i_4732_
		    = aClass185_Sub2_9016.anInt9344 * 9823353 - i_4714_;
		i_4716_ -= i_4732_;
		i_4730_
		    += i_4732_ * (aClass185_Sub2_9016.anInt9356 * 356365251);
		i_4723_ += i_4727_ * i_4732_;
	    }
	    if (i + i_4715_ > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		int i_4733_ = (i + i_4715_
			       - aClass185_Sub2_9016.anInt9343 * -1807368365);
		i_4715_ -= i_4733_;
		i_4731_ += i_4733_;
	    }
	    if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		int i_4734_ = aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		i_4715_ -= i_4734_;
		i_4730_ += i_4734_;
		i_4722_ += i_4726_ * i_4734_;
		i_4731_ += i_4734_;
	    }
	    float[] fs = aClass185_Sub2_9016.aFloatArray9341;
	    int[] is = aClass185_Sub2_9016.anIntArray9338;
	    if (i_4719_ == 0) {
		if (i_4717_ == 1) {
		    int i_4735_ = i_4722_;
		    for (int i_4736_ = -i_4716_; i_4736_ < 0; i_4736_++) {
			int i_4737_ = (i_4723_ >> 16) * anInt8985;
			for (int i_4738_ = -i_4715_; i_4738_ < 0; i_4738_++) {
			    if (!bool_4712_ || f < fs[i_4730_]) {
				if (bool)
				    is[i_4730_]
					= (anIntArray11408
					   [((aByteArray11407
					      [(i_4722_ >> 16) + i_4737_])
					     & 0xff)]);
				if (bool_4712_ && bool_4721_)
				    fs[i_4730_] = f;
			    }
			    i_4722_ += i_4726_;
			    i_4730_++;
			}
			i_4723_ += i_4727_;
			i_4722_ = i_4735_;
			i_4730_ += i_4731_;
		    }
		} else if (i_4717_ == 0) {
		    int i_4739_ = (i_4718_ & 0xff0000) >> 16;
		    int i_4740_ = (i_4718_ & 0xff00) >> 8;
		    int i_4741_ = i_4718_ & 0xff;
		    int i_4742_ = i_4722_;
		    for (int i_4743_ = -i_4716_; i_4743_ < 0; i_4743_++) {
			int i_4744_ = (i_4723_ >> 16) * anInt8985;
			for (int i_4745_ = -i_4715_; i_4745_ < 0; i_4745_++) {
			    if (!bool_4712_ || f < fs[i_4730_]) {
				if (bool) {
				    int i_4746_
					= (anIntArray11408
					   [((aByteArray11407
					      [(i_4722_ >> 16) + i_4744_])
					     & 0xff)]);
				    int i_4747_
					= ((i_4746_ & 0xff0000) * i_4739_
					   & ~0xffffff);
				    int i_4748_ = ((i_4746_ & 0xff00) * i_4740_
						   & 0xff0000);
				    int i_4749_
					= (i_4746_ & 0xff) * i_4741_ & 0xff00;
				    is[i_4730_]
					= (i_4747_ | i_4748_ | i_4749_) >>> 8;
				}
				if (bool_4712_ && bool_4721_)
				    fs[i_4730_] = f;
			    }
			    i_4722_ += i_4726_;
			    i_4730_++;
			}
			i_4723_ += i_4727_;
			i_4722_ = i_4742_;
			i_4730_ += i_4731_;
		    }
		} else if (i_4717_ == 3) {
		    int i_4750_ = i_4722_;
		    for (int i_4751_ = -i_4716_; i_4751_ < 0; i_4751_++) {
			int i_4752_ = (i_4723_ >> 16) * anInt8985;
			for (int i_4753_ = -i_4715_; i_4753_ < 0; i_4753_++) {
			    if (!bool_4712_ || f < fs[i_4730_]) {
				if (bool) {
				    byte i_4754_
					= (aByteArray11407
					   [(i_4722_ >> 16) + i_4752_]);
				    int i_4755_
					= (i_4754_ > 0
					   ? anIntArray11408[i_4754_] : 0);
				    int i_4756_ = i_4755_ + i_4718_;
				    int i_4757_ = ((i_4755_ & 0xff00ff)
						   + (i_4718_ & 0xff00ff));
				    int i_4758_
					= ((i_4757_ & 0x1000100)
					   + (i_4756_ - i_4757_ & 0x10000));
				    is[i_4730_]
					= (i_4756_ - i_4758_
					   | i_4758_ - (i_4758_ >>> 8));
				}
				if (bool_4712_ && bool_4721_)
				    fs[i_4730_] = f;
			    }
			    i_4722_ += i_4726_;
			    i_4730_++;
			}
			i_4723_ += i_4727_;
			i_4722_ = i_4750_;
			i_4730_ += i_4731_;
		    }
		} else if (i_4717_ == 2) {
		    int i_4759_ = i_4718_ >>> 24;
		    int i_4760_ = 256 - i_4759_;
		    int i_4761_ = (i_4718_ & 0xff00ff) * i_4760_ & ~0xff00ff;
		    int i_4762_ = (i_4718_ & 0xff00) * i_4760_ & 0xff0000;
		    i_4718_ = (i_4761_ | i_4762_) >>> 8;
		    int i_4763_ = i_4722_;
		    for (int i_4764_ = -i_4716_; i_4764_ < 0; i_4764_++) {
			int i_4765_ = (i_4723_ >> 16) * anInt8985;
			for (int i_4766_ = -i_4715_; i_4766_ < 0; i_4766_++) {
			    if (!bool_4712_ || f < fs[i_4730_]) {
				if (bool) {
				    int i_4767_
					= (anIntArray11408
					   [((aByteArray11407
					      [(i_4722_ >> 16) + i_4765_])
					     & 0xff)]);
				    i_4761_ = ((i_4767_ & 0xff00ff) * i_4759_
					       & ~0xff00ff);
				    i_4762_ = ((i_4767_ & 0xff00) * i_4759_
					       & 0xff0000);
				    is[i_4730_] = (((i_4761_ | i_4762_) >>> 8)
						   + i_4718_);
				}
				if (bool_4712_ && bool_4721_)
				    fs[i_4730_] = f;
			    }
			    i_4722_ += i_4726_;
			    i_4730_++;
			}
			i_4723_ += i_4727_;
			i_4722_ = i_4763_;
			i_4730_ += i_4731_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_4719_ == 1) {
		if (i_4717_ == 1) {
		    int i_4768_ = i_4722_;
		    for (int i_4769_ = -i_4716_; i_4769_ < 0; i_4769_++) {
			int i_4770_ = (i_4723_ >> 16) * anInt8985;
			for (int i_4771_ = -i_4715_; i_4771_ < 0; i_4771_++) {
			    if (!bool_4712_ || f < fs[i_4730_]) {
				int i_4772_ = (aByteArray11407
					       [(i_4722_ >> 16) + i_4770_]);
				if (i_4772_ != 0) {
				    if (bool)
					is[i_4730_]
					    = anIntArray11408[i_4772_ & 0xff];
				    if (bool_4712_ && bool_4721_)
					fs[i_4730_] = f;
				}
			    }
			    i_4722_ += i_4726_;
			    i_4730_++;
			}
			i_4723_ += i_4727_;
			i_4722_ = i_4768_;
			i_4730_ += i_4731_;
		    }
		} else if (i_4717_ == 0) {
		    int i_4773_ = i_4722_;
		    if ((i_4718_ & 0xffffff) == 16777215) {
			int i_4774_ = i_4718_ >>> 24;
			int i_4775_ = 256 - i_4774_;
			for (int i_4776_ = -i_4716_; i_4776_ < 0; i_4776_++) {
			    int i_4777_ = (i_4723_ >> 16) * anInt8985;
			    for (int i_4778_ = -i_4715_; i_4778_ < 0;
				 i_4778_++) {
				if (!bool_4712_ || f < fs[i_4730_]) {
				    int i_4779_
					= (aByteArray11407
					   [(i_4722_ >> 16) + i_4777_]);
				    if (i_4779_ != 0) {
					if (bool) {
					    int i_4780_ = (anIntArray11408
							   [i_4779_ & 0xff]);
					    int i_4781_ = is[i_4730_];
					    is[i_4730_]
						= (((((i_4780_ & 0xff00ff)
						      * i_4774_)
						     + ((i_4781_ & 0xff00ff)
							* i_4775_))
						    & ~0xff00ff)
						   + ((((i_4780_ & 0xff00)
							* i_4774_)
						       + ((i_4781_ & 0xff00)
							  * i_4775_))
						      & 0xff0000)) >> 8;
					}
					if (bool_4712_ && bool_4721_)
					    fs[i_4730_] = f;
				    }
				}
				i_4722_ += i_4726_;
				i_4730_++;
			    }
			    i_4723_ += i_4727_;
			    i_4722_ = i_4773_;
			    i_4730_ += i_4731_;
			}
		    } else {
			int i_4782_ = (i_4718_ & 0xff0000) >> 16;
			int i_4783_ = (i_4718_ & 0xff00) >> 8;
			int i_4784_ = i_4718_ & 0xff;
			int i_4785_ = i_4718_ >>> 24;
			int i_4786_ = 256 - i_4785_;
			for (int i_4787_ = -i_4716_; i_4787_ < 0; i_4787_++) {
			    int i_4788_ = (i_4723_ >> 16) * anInt8985;
			    for (int i_4789_ = -i_4715_; i_4789_ < 0;
				 i_4789_++) {
				if (!bool_4712_ || f < fs[i_4730_]) {
				    int i_4790_
					= (aByteArray11407
					   [(i_4722_ >> 16) + i_4788_]);
				    if (i_4790_ != 0) {
					int i_4791_
					    = anIntArray11408[i_4790_ & 0xff];
					if (i_4785_ != 255) {
					    if (bool) {
						int i_4792_
						    = (((i_4791_ & 0xff0000)
							* i_4782_)
						       & ~0xffffff);
						int i_4793_
						    = (((i_4791_ & 0xff00)
							* i_4783_)
						       & 0xff0000);
						int i_4794_
						    = (((i_4791_ & 0xff)
							* i_4784_)
						       & 0xff00);
						i_4791_ = (i_4792_ | i_4793_
							   | i_4794_) >>> 8;
						int i_4795_ = is[i_4730_];
						is[i_4730_]
						    = (((((i_4791_ & 0xff00ff)
							  * i_4785_)
							 + ((i_4795_
							     & 0xff00ff)
							    * i_4786_))
							& ~0xff00ff)
						       + ((((i_4791_ & 0xff00)
							    * i_4785_)
							   + ((i_4795_
							       & 0xff00)
							      * i_4786_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_4712_ && bool_4721_)
						fs[i_4730_] = f;
					} else {
					    if (bool) {
						int i_4796_
						    = (((i_4791_ & 0xff0000)
							* i_4782_)
						       & ~0xffffff);
						int i_4797_
						    = (((i_4791_ & 0xff00)
							* i_4783_)
						       & 0xff0000);
						int i_4798_
						    = (((i_4791_ & 0xff)
							* i_4784_)
						       & 0xff00);
						is[i_4730_]
						    = (i_4796_ | i_4797_
						       | i_4798_) >>> 8;
					    }
					    if (bool_4712_ && bool_4721_)
						fs[i_4730_] = f;
					}
				    }
				}
				i_4722_ += i_4726_;
				i_4730_++;
			    }
			    i_4723_ += i_4727_;
			    i_4722_ = i_4773_;
			    i_4730_ += i_4731_;
			}
		    }
		} else if (i_4717_ == 3) {
		    int i_4799_ = i_4722_;
		    int i_4800_ = i_4718_ >>> 24;
		    int i_4801_ = 256 - i_4800_;
		    for (int i_4802_ = -i_4716_; i_4802_ < 0; i_4802_++) {
			int i_4803_ = (i_4723_ >> 16) * anInt8985;
			for (int i_4804_ = -i_4715_; i_4804_ < 0; i_4804_++) {
			    if (!bool_4712_ || f < fs[i_4730_]) {
				if (bool) {
				    byte i_4805_
					= (aByteArray11407
					   [(i_4722_ >> 16) + i_4803_]);
				    int i_4806_
					= (i_4805_ > 0
					   ? anIntArray11408[i_4805_] : 0);
				    int i_4807_ = i_4806_ + i_4718_;
				    int i_4808_ = ((i_4806_ & 0xff00ff)
						   + (i_4718_ & 0xff00ff));
				    int i_4809_
					= ((i_4808_ & 0x1000100)
					   + (i_4807_ - i_4808_ & 0x10000));
				    i_4809_ = (i_4807_ - i_4809_
					       | i_4809_ - (i_4809_ >>> 8));
				    if (i_4806_ == 0 && i_4800_ != 255) {
					i_4806_ = i_4809_;
					i_4809_ = is[i_4730_];
					i_4809_
					    = ((((i_4806_ & 0xff00ff) * i_4800_
						 + ((i_4809_ & 0xff00ff)
						    * i_4801_))
						& ~0xff00ff)
					       + (((i_4806_ & 0xff00) * i_4800_
						   + ((i_4809_ & 0xff00)
						      * i_4801_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_4730_] = i_4809_;
				}
				if (bool_4712_ && bool_4721_)
				    fs[i_4730_] = f;
			    }
			    i_4722_ += i_4726_;
			    i_4730_++;
			}
			i_4723_ += i_4727_;
			i_4722_ = i_4799_;
			i_4730_ += i_4731_;
		    }
		} else if (i_4717_ == 2) {
		    int i_4810_ = i_4718_ >>> 24;
		    int i_4811_ = 256 - i_4810_;
		    int i_4812_ = (i_4718_ & 0xff00ff) * i_4811_ & ~0xff00ff;
		    int i_4813_ = (i_4718_ & 0xff00) * i_4811_ & 0xff0000;
		    i_4718_ = (i_4812_ | i_4813_) >>> 8;
		    int i_4814_ = i_4722_;
		    for (int i_4815_ = -i_4716_; i_4815_ < 0; i_4815_++) {
			int i_4816_ = (i_4723_ >> 16) * anInt8985;
			for (int i_4817_ = -i_4715_; i_4817_ < 0; i_4817_++) {
			    if (!bool_4712_ || f < fs[i_4730_]) {
				int i_4818_ = (aByteArray11407
					       [(i_4722_ >> 16) + i_4816_]);
				if (i_4818_ != 0) {
				    if (bool) {
					int i_4819_
					    = anIntArray11408[i_4818_ & 0xff];
					i_4812_
					    = ((i_4819_ & 0xff00ff) * i_4810_
					       & ~0xff00ff);
					i_4813_ = ((i_4819_ & 0xff00) * i_4810_
						   & 0xff0000);
					is[i_4730_] = ((i_4812_ | i_4813_)
						       >>> 8) + i_4718_;
				    }
				    if (bool_4712_ && bool_4721_)
					fs[i_4730_] = f;
				}
			    }
			    i_4722_ += i_4726_;
			    i_4730_++;
			}
			i_4723_ += i_4727_;
			i_4722_ = i_4814_;
			i_4730_ += i_4731_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_4719_ == 2) {
		if (i_4717_ == 1) {
		    int i_4820_ = i_4722_;
		    for (int i_4821_ = -i_4716_; i_4821_ < 0; i_4821_++) {
			int i_4822_ = (i_4723_ >> 16) * anInt8985;
			for (int i_4823_ = -i_4715_; i_4823_ < 0; i_4823_++) {
			    if (!bool_4712_ || f < fs[i_4730_]) {
				int i_4824_ = (aByteArray11407
					       [(i_4722_ >> 16) + i_4822_]);
				if (i_4824_ != 0) {
				    if (bool) {
					int i_4825_
					    = anIntArray11408[i_4824_ & 0xff];
					int i_4826_ = is[i_4730_];
					int i_4827_ = i_4825_ + i_4826_;
					int i_4828_ = ((i_4825_ & 0xff00ff)
						       + (i_4826_ & 0xff00ff));
					i_4826_ = ((i_4828_ & 0x1000100)
						   + (i_4827_ - i_4828_
						      & 0x10000));
					is[i_4730_]
					    = (i_4827_ - i_4826_
					       | i_4826_ - (i_4826_ >>> 8));
				    }
				    if (bool_4712_ && bool_4721_)
					fs[i_4730_] = f;
				}
			    }
			    i_4722_ += i_4726_;
			    i_4730_++;
			}
			i_4723_ += i_4727_;
			i_4722_ = i_4820_;
			i_4730_ += i_4731_;
		    }
		} else if (i_4717_ == 0) {
		    int i_4829_ = i_4722_;
		    int i_4830_ = (i_4718_ & 0xff0000) >> 16;
		    int i_4831_ = (i_4718_ & 0xff00) >> 8;
		    int i_4832_ = i_4718_ & 0xff;
		    for (int i_4833_ = -i_4716_; i_4833_ < 0; i_4833_++) {
			int i_4834_ = (i_4723_ >> 16) * anInt8985;
			for (int i_4835_ = -i_4715_; i_4835_ < 0; i_4835_++) {
			    if (!bool_4712_ || f < fs[i_4730_]) {
				int i_4836_ = (aByteArray11407
					       [(i_4722_ >> 16) + i_4834_]);
				if (i_4836_ != 0) {
				    if (bool) {
					int i_4837_
					    = anIntArray11408[i_4836_ & 0xff];
					int i_4838_
					    = ((i_4837_ & 0xff0000) * i_4830_
					       & ~0xffffff);
					int i_4839_
					    = ((i_4837_ & 0xff00) * i_4831_
					       & 0xff0000);
					int i_4840_
					    = ((i_4837_ & 0xff) * i_4832_
					       & 0xff00);
					i_4837_ = (i_4838_ | i_4839_
						   | i_4840_) >>> 8;
					int i_4841_ = is[i_4730_];
					int i_4842_ = i_4837_ + i_4841_;
					int i_4843_ = ((i_4837_ & 0xff00ff)
						       + (i_4841_ & 0xff00ff));
					i_4841_ = ((i_4843_ & 0x1000100)
						   + (i_4842_ - i_4843_
						      & 0x10000));
					is[i_4730_]
					    = (i_4842_ - i_4841_
					       | i_4841_ - (i_4841_ >>> 8));
				    }
				    if (bool_4712_ && bool_4721_)
					fs[i_4730_] = f;
				}
			    }
			    i_4722_ += i_4726_;
			    i_4730_++;
			}
			i_4723_ += i_4727_;
			i_4722_ = i_4829_;
			i_4730_ += i_4731_;
		    }
		} else if (i_4717_ == 3) {
		    int i_4844_ = i_4722_;
		    for (int i_4845_ = -i_4716_; i_4845_ < 0; i_4845_++) {
			int i_4846_ = (i_4723_ >> 16) * anInt8985;
			for (int i_4847_ = -i_4715_; i_4847_ < 0; i_4847_++) {
			    if (!bool_4712_ || f < fs[i_4730_]) {
				if (bool) {
				    byte i_4848_
					= (aByteArray11407
					   [(i_4722_ >> 16) + i_4846_]);
				    int i_4849_
					= (i_4848_ > 0
					   ? anIntArray11408[i_4848_] : 0);
				    int i_4850_ = i_4849_ + i_4718_;
				    int i_4851_ = ((i_4849_ & 0xff00ff)
						   + (i_4718_ & 0xff00ff));
				    int i_4852_
					= ((i_4851_ & 0x1000100)
					   + (i_4850_ - i_4851_ & 0x10000));
				    i_4849_ = (i_4850_ - i_4852_
					       | i_4852_ - (i_4852_ >>> 8));
				    i_4852_ = is[i_4730_];
				    i_4850_ = i_4849_ + i_4852_;
				    i_4851_
					= (i_4849_ & 0xff00ff) + (i_4852_
								  & 0xff00ff);
				    i_4852_
					= ((i_4851_ & 0x1000100)
					   + (i_4850_ - i_4851_ & 0x10000));
				    is[i_4730_]
					= (i_4850_ - i_4852_
					   | i_4852_ - (i_4852_ >>> 8));
				}
				if (bool_4712_ && bool_4721_)
				    fs[i_4730_] = f;
			    }
			    i_4722_ += i_4726_;
			    i_4730_++;
			}
			i_4723_ += i_4727_;
			i_4722_ = i_4844_;
			i_4730_ += i_4731_;
		    }
		} else if (i_4717_ == 2) {
		    int i_4853_ = i_4718_ >>> 24;
		    int i_4854_ = 256 - i_4853_;
		    int i_4855_ = (i_4718_ & 0xff00ff) * i_4854_ & ~0xff00ff;
		    int i_4856_ = (i_4718_ & 0xff00) * i_4854_ & 0xff0000;
		    i_4718_ = (i_4855_ | i_4856_) >>> 8;
		    int i_4857_ = i_4722_;
		    for (int i_4858_ = -i_4716_; i_4858_ < 0; i_4858_++) {
			int i_4859_ = (i_4723_ >> 16) * anInt8985;
			for (int i_4860_ = -i_4715_; i_4860_ < 0; i_4860_++) {
			    if (!bool_4712_ || f < fs[i_4730_]) {
				int i_4861_ = (aByteArray11407
					       [(i_4722_ >> 16) + i_4859_]);
				if (i_4861_ != 0) {
				    if (bool) {
					int i_4862_
					    = anIntArray11408[i_4861_ & 0xff];
					i_4855_
					    = ((i_4862_ & 0xff00ff) * i_4853_
					       & ~0xff00ff);
					i_4856_ = ((i_4862_ & 0xff00) * i_4853_
						   & 0xff0000);
					i_4862_ = (((i_4855_ | i_4856_) >>> 8)
						   + i_4718_);
					int i_4863_ = is[i_4730_];
					int i_4864_ = i_4862_ + i_4863_;
					int i_4865_ = ((i_4862_ & 0xff00ff)
						       + (i_4863_ & 0xff00ff));
					i_4863_ = ((i_4865_ & 0x1000100)
						   + (i_4864_ - i_4865_
						      & 0x10000));
					is[i_4730_]
					    = (i_4864_ - i_4863_
					       | i_4863_ - (i_4863_ >>> 8));
				    }
				    if (bool_4712_ && bool_4721_)
					fs[i_4730_] = f;
				}
			    }
			    i_4722_ += i_4726_;
			    i_4730_++;
			}
			i_4723_ += i_4727_;
			i_4722_ = i_4857_;
			i_4730_ += i_4731_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
}
