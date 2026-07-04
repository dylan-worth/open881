/* Class163_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class163_Sub1_Sub3 extends Class163_Sub1
{
    int[] anIntArray11415;
    
    public Interface22 method2651() {
	return new Class115(anInt8985, anInt9002, anIntArray11415);
    }
    
    Class163_Sub1_Sub3(Class185_Sub2 class185_sub2, int[] is, int i, int i_0_,
		       int i_1_, int i_2_, boolean bool) {
	super(class185_sub2, i_1_, i_2_);
	if (bool)
	    anIntArray11415 = new int[i_1_ * i_2_];
	else
	    anIntArray11415 = is;
	i_0_ -= anInt8985;
	int i_3_ = 0;
	for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
	    for (int i_5_ = 0; i_5_ < i_1_; i_5_++) {
		int i_6_ = is[i++];
		if (i_6_ >>> 24 == 255)
		    anIntArray11415[i_3_++]
			= (i_6_ & 0xffffff) == 0 ? -16777215 : i_6_;
		else
		    anIntArray11415[i_3_++] = 0;
	    }
	    i += i_0_;
	}
    }
    
    Class163_Sub1_Sub3(Class185_Sub2 class185_sub2, int[] is, int i,
		       int i_7_) {
	super(class185_sub2, i, i_7_);
	anIntArray11415 = is;
    }
    
    void method17950(int i, int i_8_, int[] is, int i_9_, int i_10_) {
	if (i_10_ == 0) {
	    if (i_9_ == 1)
		is[i_8_] = anIntArray11415[i];
	    else if (i_9_ == 0) {
		int i_11_ = anIntArray11415[i++];
		int i_12_ = (i_11_ & 0xff0000) * anInt9014 & ~0xffffff;
		int i_13_ = (i_11_ & 0xff00) * anInt9015 & 0xff0000;
		int i_14_ = (i_11_ & 0xff) * anInt9018 & 0xff00;
		is[i_8_] = (i_12_ | i_13_ | i_14_) >>> 8;
	    } else if (i_9_ == 3) {
		int i_15_ = anIntArray11415[i++];
		int i_16_ = anInt9011;
		int i_17_ = i_15_ + i_16_;
		int i_18_ = (i_15_ & 0xff00ff) + (i_16_ & 0xff00ff);
		int i_19_ = (i_18_ & 0x1000100) + (i_17_ - i_18_ & 0x10000);
		is[i_8_] = i_17_ - i_19_ | i_19_ - (i_19_ >>> 8);
	    } else if (i_9_ == 2) {
		int i_20_ = anIntArray11415[i];
		int i_21_ = (i_20_ & 0xff00ff) * anInt9012 & ~0xff00ff;
		int i_22_ = (i_20_ & 0xff00) * anInt9012 & 0xff0000;
		is[i_8_] = ((i_21_ | i_22_) >>> 8) + anInt9019;
	    } else
		throw new IllegalArgumentException();
	} else if (i_10_ == 1) {
	    if (i_9_ == 1) {
		int i_23_ = anIntArray11415[i];
		if (i_23_ != 0)
		    is[i_8_] = i_23_;
	    } else if (i_9_ == 0) {
		int i_24_ = anIntArray11415[i];
		if (i_24_ != 0) {
		    if ((anInt9011 & 0xffffff) == 16777215) {
			int i_25_ = anInt9011 >>> 24;
			int i_26_ = 256 - i_25_;
			int i_27_ = is[i_8_];
			is[i_8_] = ((((i_24_ & 0xff00ff) * i_25_
				      + (i_27_ & 0xff00ff) * i_26_)
				     & ~0xff00ff)
				    + (((i_24_ & 0xff00) * i_25_
					+ (i_27_ & 0xff00) * i_26_)
				       & 0xff0000)) >> 8;
		    } else if (anInt9012 != 255) {
			int i_28_ = (i_24_ & 0xff0000) * anInt9014 & ~0xffffff;
			int i_29_ = (i_24_ & 0xff00) * anInt9015 & 0xff0000;
			int i_30_ = (i_24_ & 0xff) * anInt9018 & 0xff00;
			i_24_ = (i_28_ | i_29_ | i_30_) >>> 8;
			int i_31_ = is[i_8_];
			is[i_8_] = ((((i_24_ & 0xff00ff) * anInt9012
				      + (i_31_ & 0xff00ff) * anInt9013)
				     & ~0xff00ff)
				    + (((i_24_ & 0xff00) * anInt9012
					+ (i_31_ & 0xff00) * anInt9013)
				       & 0xff0000)) >> 8;
		    } else {
			int i_32_ = (i_24_ & 0xff0000) * anInt9014 & ~0xffffff;
			int i_33_ = (i_24_ & 0xff00) * anInt9015 & 0xff0000;
			int i_34_ = (i_24_ & 0xff) * anInt9018 & 0xff00;
			is[i_8_] = (i_32_ | i_33_ | i_34_) >>> 8;
		    }
		}
	    } else if (i_9_ == 3) {
		int i_35_ = anIntArray11415[i];
		int i_36_ = anInt9011;
		int i_37_ = i_35_ + i_36_;
		int i_38_ = (i_35_ & 0xff00ff) + (i_36_ & 0xff00ff);
		int i_39_ = (i_38_ & 0x1000100) + (i_37_ - i_38_ & 0x10000);
		i_39_ = i_37_ - i_39_ | i_39_ - (i_39_ >>> 8);
		if (i_35_ == 0 && anInt9012 != 255) {
		    i_35_ = i_39_;
		    i_39_ = is[i_8_];
		    i_39_ = ((((i_35_ & 0xff00ff) * anInt9012
			       + (i_39_ & 0xff00ff) * anInt9013)
			      & ~0xff00ff)
			     + (((i_35_ & 0xff00) * anInt9012
				 + (i_39_ & 0xff00) * anInt9013)
				& 0xff0000)) >> 8;
		}
		is[i_8_] = i_39_;
	    } else if (i_9_ == 2) {
		int i_40_ = anIntArray11415[i];
		if (i_40_ != 0) {
		    int i_41_ = (i_40_ & 0xff00ff) * anInt9012 & ~0xff00ff;
		    int i_42_ = (i_40_ & 0xff00) * anInt9012 & 0xff0000;
		    is[i_8_++] = ((i_41_ | i_42_) >>> 8) + anInt9019;
		}
	    } else
		throw new IllegalArgumentException();
	} else if (i_10_ == 2) {
	    if (i_9_ == 1) {
		int i_43_ = anIntArray11415[i];
		if (i_43_ != 0) {
		    int i_44_ = is[i_8_];
		    int i_45_ = i_43_ + i_44_;
		    int i_46_ = (i_43_ & 0xff00ff) + (i_44_ & 0xff00ff);
		    i_44_ = (i_46_ & 0x1000100) + (i_45_ - i_46_ & 0x10000);
		    is[i_8_] = i_45_ - i_44_ | i_44_ - (i_44_ >>> 8);
		}
	    } else if (i_9_ == 0) {
		int i_47_ = anIntArray11415[i];
		if (i_47_ != 0) {
		    int i_48_ = (i_47_ & 0xff0000) * anInt9014 & ~0xffffff;
		    int i_49_ = (i_47_ & 0xff00) * anInt9015 & 0xff0000;
		    int i_50_ = (i_47_ & 0xff) * anInt9018 & 0xff00;
		    i_47_ = (i_48_ | i_49_ | i_50_) >>> 8;
		    int i_51_ = is[i_8_];
		    int i_52_ = i_47_ + i_51_;
		    int i_53_ = (i_47_ & 0xff00ff) + (i_51_ & 0xff00ff);
		    i_51_ = (i_53_ & 0x1000100) + (i_52_ - i_53_ & 0x10000);
		    is[i_8_] = i_52_ - i_51_ | i_51_ - (i_51_ >>> 8);
		}
	    } else if (i_9_ == 3) {
		int i_54_ = anIntArray11415[i];
		int i_55_ = anInt9011;
		int i_56_ = i_54_ + i_55_;
		int i_57_ = (i_54_ & 0xff00ff) + (i_55_ & 0xff00ff);
		int i_58_ = (i_57_ & 0x1000100) + (i_56_ - i_57_ & 0x10000);
		i_54_ = i_56_ - i_58_ | i_58_ - (i_58_ >>> 8);
		i_58_ = is[i_8_];
		i_56_ = i_54_ + i_58_;
		i_57_ = (i_54_ & 0xff00ff) + (i_58_ & 0xff00ff);
		i_58_ = (i_57_ & 0x1000100) + (i_56_ - i_57_ & 0x10000);
		is[i_8_] = i_56_ - i_58_ | i_58_ - (i_58_ >>> 8);
	    } else if (i_9_ == 2) {
		int i_59_ = anIntArray11415[i];
		if (i_59_ != 0) {
		    int i_60_ = (i_59_ & 0xff00ff) * anInt9012 & ~0xff00ff;
		    int i_61_ = (i_59_ & 0xff00) * anInt9012 & 0xff0000;
		    i_59_ = ((i_60_ | i_61_) >>> 8) + anInt9019;
		    int i_62_ = is[i_8_];
		    int i_63_ = i_59_ + i_62_;
		    int i_64_ = (i_59_ & 0xff00ff) + (i_62_ & 0xff00ff);
		    i_62_ = (i_64_ & 0x1000100) + (i_63_ - i_64_ & 0x10000);
		    is[i_8_] = i_63_ - i_62_ | i_62_ - (i_62_ >>> 8);
		}
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    void method17951(int i, int i_65_, int i_66_, int i_67_, int[] is,
		     int i_68_, int i_69_) {
	i_69_ -= i_66_;
	for (int i_70_ = 0; i_70_ < i_67_; i_70_++) {
	    int i_71_ = (i_65_ + i_70_) * i_66_ + i;
	    for (int i_72_ = 0; i_72_ < i_66_; i_72_++)
		is[i_68_++] = anIntArray11415[i_71_ + i_72_];
	    i_68_ += i_69_;
	}
    }
    
    public void method2653(int i, int i_73_, int i_74_, int i_75_, int[] is,
			   int[] is_76_, int i_77_, int i_78_) {
	method17951(i, i_73_, i_74_, i_75_, is, i_77_, i_78_);
    }
    
    public void method2672(int i, int i_79_, int i_80_) {
	throw new IllegalStateException("");
    }
    
    void method14513(boolean bool, boolean bool_81_, boolean bool_82_, int i,
		     int i_83_, float f, int i_84_, int i_85_, int i_86_,
		     int i_87_, int i_88_, int i_89_, boolean bool_90_) {
	if (i_84_ > 0 && i_85_ > 0 && (bool || bool_81_)) {
	    int i_91_ = 0;
	    int i_92_ = 0;
	    int i_93_ = anInt8987 + anInt8985 + anInt8992;
	    int i_94_ = anInt8989 + anInt9002 + anInt8990;
	    int i_95_ = (i_93_ << 16) / i_84_;
	    int i_96_ = (i_94_ << 16) / i_85_;
	    if (anInt8987 > 0) {
		int i_97_ = ((anInt8987 << 16) + i_95_ - 1) / i_95_;
		i += i_97_;
		i_91_ += i_97_ * i_95_ - (anInt8987 << 16);
	    }
	    if (anInt8989 > 0) {
		int i_98_ = ((anInt8989 << 16) + i_96_ - 1) / i_96_;
		i_83_ += i_98_;
		i_92_ += i_98_ * i_96_ - (anInt8989 << 16);
	    }
	    if (anInt8985 < i_93_)
		i_84_ = ((anInt8985 << 16) - i_91_ + i_95_ - 1) / i_95_;
	    if (anInt9002 < i_94_)
		i_85_ = ((anInt9002 << 16) - i_92_ + i_96_ - 1) / i_96_;
	    int i_99_
		= i + i_83_ * (aClass185_Sub2_9016.anInt9356 * 356365251);
	    int i_100_ = aClass185_Sub2_9016.anInt9356 * 356365251 - i_84_;
	    if (i_83_ + i_85_ > aClass185_Sub2_9016.anInt9345 * 639238427)
		i_85_ -= (i_83_ + i_85_
			  - aClass185_Sub2_9016.anInt9345 * 639238427);
	    if (i_83_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		int i_101_ = aClass185_Sub2_9016.anInt9344 * 9823353 - i_83_;
		i_85_ -= i_101_;
		i_99_ += i_101_ * (aClass185_Sub2_9016.anInt9356 * 356365251);
		i_92_ += i_96_ * i_101_;
	    }
	    if (i + i_84_ > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		int i_102_
		    = i + i_84_ - aClass185_Sub2_9016.anInt9343 * -1807368365;
		i_84_ -= i_102_;
		i_100_ += i_102_;
	    }
	    if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		int i_103_ = aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		i_84_ -= i_103_;
		i_99_ += i_103_;
		i_91_ += i_95_ * i_103_;
		i_100_ += i_103_;
	    }
	    float[] fs = aClass185_Sub2_9016.aFloatArray9341;
	    int[] is = aClass185_Sub2_9016.anIntArray9338;
	    if (i_88_ == 0) {
		if (i_86_ == 1) {
		    int i_104_ = i_91_;
		    for (int i_105_ = -i_85_; i_105_ < 0; i_105_++) {
			int i_106_ = (i_92_ >> 16) * anInt8985;
			for (int i_107_ = -i_84_; i_107_ < 0; i_107_++) {
			    if (!bool_81_ || f < fs[i_99_]) {
				if (bool)
				    is[i_99_] = (anIntArray11415
						 [(i_91_ >> 16) + i_106_]);
				if (bool_81_ && bool_90_)
				    fs[i_99_] = f;
			    }
			    i_91_ += i_95_;
			    i_99_++;
			}
			i_92_ += i_96_;
			i_91_ = i_104_;
			i_99_ += i_100_;
		    }
		} else if (i_86_ == 0) {
		    int i_108_ = (i_87_ & 0xff0000) >> 16;
		    int i_109_ = (i_87_ & 0xff00) >> 8;
		    int i_110_ = i_87_ & 0xff;
		    int i_111_ = i_91_;
		    for (int i_112_ = -i_85_; i_112_ < 0; i_112_++) {
			int i_113_ = (i_92_ >> 16) * anInt8985;
			for (int i_114_ = -i_84_; i_114_ < 0; i_114_++) {
			    if (!bool_81_ || f < fs[i_99_]) {
				if (bool) {
				    int i_115_ = (anIntArray11415
						  [(i_91_ >> 16) + i_113_]);
				    int i_116_ = ((i_115_ & 0xff0000) * i_108_
						  & ~0xffffff);
				    int i_117_ = ((i_115_ & 0xff00) * i_109_
						  & 0xff0000);
				    int i_118_
					= (i_115_ & 0xff) * i_110_ & 0xff00;
				    is[i_99_]
					= (i_116_ | i_117_ | i_118_) >>> 8;
				}
				if (bool_81_ && bool_90_)
				    fs[i_99_] = f;
			    }
			    i_91_ += i_95_;
			    i_99_++;
			}
			i_92_ += i_96_;
			i_91_ = i_111_;
			i_99_ += i_100_;
		    }
		} else if (i_86_ == 3) {
		    int i_119_ = i_91_;
		    for (int i_120_ = -i_85_; i_120_ < 0; i_120_++) {
			int i_121_ = (i_92_ >> 16) * anInt8985;
			for (int i_122_ = -i_84_; i_122_ < 0; i_122_++) {
			    if (!bool_81_ || f < fs[i_99_]) {
				if (bool) {
				    int i_123_ = (anIntArray11415
						  [(i_91_ >> 16) + i_121_]);
				    int i_124_ = i_123_ + i_87_;
				    int i_125_ = ((i_123_ & 0xff00ff)
						  + (i_87_ & 0xff00ff));
				    int i_126_
					= ((i_125_ & 0x1000100)
					   + (i_124_ - i_125_ & 0x10000));
				    is[i_99_]
					= i_124_ - i_126_ | i_126_ - (i_126_
								      >>> 8);
				}
				if (bool_81_ && bool_90_)
				    fs[i_99_] = f;
			    }
			    i_91_ += i_95_;
			    i_99_++;
			}
			i_92_ += i_96_;
			i_91_ = i_119_;
			i_99_ += i_100_;
		    }
		} else if (i_86_ == 2) {
		    int i_127_ = i_87_ >>> 24;
		    int i_128_ = 256 - i_127_;
		    int i_129_ = (i_87_ & 0xff00ff) * i_128_ & ~0xff00ff;
		    int i_130_ = (i_87_ & 0xff00) * i_128_ & 0xff0000;
		    i_87_ = (i_129_ | i_130_) >>> 8;
		    int i_131_ = i_91_;
		    for (int i_132_ = -i_85_; i_132_ < 0; i_132_++) {
			int i_133_ = (i_92_ >> 16) * anInt8985;
			for (int i_134_ = -i_84_; i_134_ < 0; i_134_++) {
			    if (!bool_81_ || f < fs[i_99_]) {
				if (bool) {
				    int i_135_ = (anIntArray11415
						  [(i_91_ >> 16) + i_133_]);
				    i_129_ = ((i_135_ & 0xff00ff) * i_127_
					      & ~0xff00ff);
				    i_130_ = ((i_135_ & 0xff00) * i_127_
					      & 0xff0000);
				    is[i_99_]
					= ((i_129_ | i_130_) >>> 8) + i_87_;
				}
				if (bool_81_ && bool_90_)
				    fs[i_99_] = f;
			    }
			    i_91_ += i_95_;
			    i_99_++;
			}
			i_92_ += i_96_;
			i_91_ = i_131_;
			i_99_ += i_100_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_88_ == 1) {
		if (i_86_ == 1) {
		    int i_136_ = i_91_;
		    for (int i_137_ = -i_85_; i_137_ < 0; i_137_++) {
			int i_138_ = (i_92_ >> 16) * anInt8985;
			for (int i_139_ = -i_84_; i_139_ < 0; i_139_++) {
			    if (!bool_81_ || f < fs[i_99_]) {
				int i_140_
				    = anIntArray11415[(i_91_ >> 16) + i_138_];
				if (i_140_ != 0) {
				    if (bool)
					is[i_99_] = i_140_;
				    if (bool_81_ && bool_90_)
					fs[i_99_] = f;
				}
			    }
			    i_91_ += i_95_;
			    i_99_++;
			}
			i_92_ += i_96_;
			i_91_ = i_136_;
			i_99_ += i_100_;
		    }
		} else if (i_86_ == 0) {
		    int i_141_ = i_91_;
		    if ((i_87_ & 0xffffff) == 16777215) {
			int i_142_ = i_87_ >>> 24;
			int i_143_ = 256 - i_142_;
			for (int i_144_ = -i_85_; i_144_ < 0; i_144_++) {
			    int i_145_ = (i_92_ >> 16) * anInt8985;
			    for (int i_146_ = -i_84_; i_146_ < 0; i_146_++) {
				if (!bool_81_ || f < fs[i_99_]) {
				    int i_147_ = (anIntArray11415
						  [(i_91_ >> 16) + i_145_]);
				    if (i_147_ != 0) {
					if (bool) {
					    int i_148_ = is[i_99_];
					    is[i_99_]
						= (((((i_147_ & 0xff00ff)
						      * i_142_)
						     + ((i_148_ & 0xff00ff)
							* i_143_))
						    & ~0xff00ff)
						   + ((((i_147_ & 0xff00)
							* i_142_)
						       + ((i_148_ & 0xff00)
							  * i_143_))
						      & 0xff0000)) >> 8;
					}
					if (bool_81_ && bool_90_)
					    fs[i_99_] = f;
				    }
				}
				i_91_ += i_95_;
				i_99_++;
			    }
			    i_92_ += i_96_;
			    i_91_ = i_141_;
			    i_99_ += i_100_;
			}
		    } else {
			int i_149_ = (i_87_ & 0xff0000) >> 16;
			int i_150_ = (i_87_ & 0xff00) >> 8;
			int i_151_ = i_87_ & 0xff;
			int i_152_ = i_87_ >>> 24;
			int i_153_ = 256 - i_152_;
			for (int i_154_ = -i_85_; i_154_ < 0; i_154_++) {
			    int i_155_ = (i_92_ >> 16) * anInt8985;
			    for (int i_156_ = -i_84_; i_156_ < 0; i_156_++) {
				if (!bool_81_ || f < fs[i_99_]) {
				    int i_157_ = (anIntArray11415
						  [(i_91_ >> 16) + i_155_]);
				    if (i_157_ != 0) {
					if (i_152_ != 255) {
					    if (bool) {
						int i_158_
						    = (((i_157_ & 0xff0000)
							* i_149_)
						       & ~0xffffff);
						int i_159_
						    = (((i_157_ & 0xff00)
							* i_150_)
						       & 0xff0000);
						int i_160_
						    = ((i_157_ & 0xff) * i_151_
						       & 0xff00);
						i_157_ = (i_158_ | i_159_
							  | i_160_) >>> 8;
						int i_161_ = is[i_99_];
						is[i_99_]
						    = (((((i_157_ & 0xff00ff)
							  * i_152_)
							 + ((i_161_ & 0xff00ff)
							    * i_153_))
							& ~0xff00ff)
						       + ((((i_157_ & 0xff00)
							    * i_152_)
							   + ((i_161_ & 0xff00)
							      * i_153_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_81_ && bool_90_)
						fs[i_99_] = f;
					} else {
					    if (bool) {
						int i_162_
						    = (((i_157_ & 0xff0000)
							* i_149_)
						       & ~0xffffff);
						int i_163_
						    = (((i_157_ & 0xff00)
							* i_150_)
						       & 0xff0000);
						int i_164_
						    = ((i_157_ & 0xff) * i_151_
						       & 0xff00);
						is[i_99_] = (i_162_ | i_163_
							     | i_164_) >>> 8;
					    }
					    if (bool_81_ && bool_90_)
						fs[i_99_] = f;
					}
				    }
				}
				i_91_ += i_95_;
				i_99_++;
			    }
			    i_92_ += i_96_;
			    i_91_ = i_141_;
			    i_99_ += i_100_;
			}
		    }
		} else if (i_86_ == 3) {
		    int i_165_ = i_91_;
		    int i_166_ = i_87_ >>> 24;
		    int i_167_ = 256 - i_166_;
		    for (int i_168_ = -i_85_; i_168_ < 0; i_168_++) {
			int i_169_ = (i_92_ >> 16) * anInt8985;
			for (int i_170_ = -i_84_; i_170_ < 0; i_170_++) {
			    if (!bool_81_ || f < fs[i_99_]) {
				if (bool) {
				    int i_171_ = (anIntArray11415
						  [(i_91_ >> 16) + i_169_]);
				    int i_172_ = i_171_ + i_87_;
				    int i_173_ = ((i_171_ & 0xff00ff)
						  + (i_87_ & 0xff00ff));
				    int i_174_
					= ((i_173_ & 0x1000100)
					   + (i_172_ - i_173_ & 0x10000));
				    i_174_
					= i_172_ - i_174_ | i_174_ - (i_174_
								      >>> 8);
				    if (i_171_ == 0 && i_166_ != 255) {
					i_171_ = i_174_;
					i_174_ = is[i_99_];
					i_174_
					    = ((((i_171_ & 0xff00ff) * i_166_
						 + ((i_174_ & 0xff00ff)
						    * i_167_))
						& ~0xff00ff)
					       + (((i_171_ & 0xff00) * i_166_
						   + ((i_174_ & 0xff00)
						      * i_167_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_99_] = i_174_;
				}
				if (bool_81_ && bool_90_)
				    fs[i_99_] = f;
			    }
			    i_91_ += i_95_;
			    i_99_++;
			}
			i_92_ += i_96_;
			i_91_ = i_165_;
			i_99_ += i_100_;
		    }
		} else if (i_86_ == 2) {
		    int i_175_ = i_87_ >>> 24;
		    int i_176_ = 256 - i_175_;
		    int i_177_ = (i_87_ & 0xff00ff) * i_176_ & ~0xff00ff;
		    int i_178_ = (i_87_ & 0xff00) * i_176_ & 0xff0000;
		    i_87_ = (i_177_ | i_178_) >>> 8;
		    int i_179_ = i_91_;
		    for (int i_180_ = -i_85_; i_180_ < 0; i_180_++) {
			int i_181_ = (i_92_ >> 16) * anInt8985;
			for (int i_182_ = -i_84_; i_182_ < 0; i_182_++) {
			    if (!bool_81_ || f < fs[i_99_]) {
				int i_183_
				    = anIntArray11415[(i_91_ >> 16) + i_181_];
				if (i_183_ != 0) {
				    if (bool) {
					i_177_ = ((i_183_ & 0xff00ff) * i_175_
						  & ~0xff00ff);
					i_178_ = ((i_183_ & 0xff00) * i_175_
						  & 0xff0000);
					is[i_99_] = (((i_177_ | i_178_) >>> 8)
						     + i_87_);
				    }
				    if (bool_81_ && bool_90_)
					fs[i_99_] = f;
				}
			    }
			    i_91_ += i_95_;
			    i_99_++;
			}
			i_92_ += i_96_;
			i_91_ = i_179_;
			i_99_ += i_100_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_88_ == 2) {
		if (i_86_ == 1) {
		    int i_184_ = i_91_;
		    for (int i_185_ = -i_85_; i_185_ < 0; i_185_++) {
			int i_186_ = (i_92_ >> 16) * anInt8985;
			for (int i_187_ = -i_84_; i_187_ < 0; i_187_++) {
			    if (!bool_81_ || f < fs[i_99_]) {
				int i_188_
				    = anIntArray11415[(i_91_ >> 16) + i_186_];
				if (i_188_ != 0) {
				    if (bool) {
					int i_189_ = is[i_99_];
					int i_190_ = i_188_ + i_189_;
					int i_191_ = ((i_188_ & 0xff00ff)
						      + (i_189_ & 0xff00ff));
					i_189_
					    = ((i_191_ & 0x1000100)
					       + (i_190_ - i_191_ & 0x10000));
					is[i_99_]
					    = (i_190_ - i_189_
					       | i_189_ - (i_189_ >>> 8));
				    }
				    if (bool_81_ && bool_90_)
					fs[i_99_] = f;
				}
			    }
			    i_91_ += i_95_;
			    i_99_++;
			}
			i_92_ += i_96_;
			i_91_ = i_184_;
			i_99_ += i_100_;
		    }
		} else if (i_86_ == 0) {
		    int i_192_ = i_91_;
		    int i_193_ = (i_87_ & 0xff0000) >> 16;
		    int i_194_ = (i_87_ & 0xff00) >> 8;
		    int i_195_ = i_87_ & 0xff;
		    for (int i_196_ = -i_85_; i_196_ < 0; i_196_++) {
			int i_197_ = (i_92_ >> 16) * anInt8985;
			for (int i_198_ = -i_84_; i_198_ < 0; i_198_++) {
			    if (!bool_81_ || f < fs[i_99_]) {
				int i_199_
				    = anIntArray11415[(i_91_ >> 16) + i_197_];
				if (i_199_ != 0) {
				    if (bool) {
					int i_200_
					    = ((i_199_ & 0xff0000) * i_193_
					       & ~0xffffff);
					int i_201_
					    = ((i_199_ & 0xff00) * i_194_
					       & 0xff0000);
					int i_202_ = ((i_199_ & 0xff) * i_195_
						      & 0xff00);
					i_199_
					    = (i_200_ | i_201_ | i_202_) >>> 8;
					int i_203_ = is[i_99_];
					int i_204_ = i_199_ + i_203_;
					int i_205_ = ((i_199_ & 0xff00ff)
						      + (i_203_ & 0xff00ff));
					i_203_
					    = ((i_205_ & 0x1000100)
					       + (i_204_ - i_205_ & 0x10000));
					is[i_99_]
					    = (i_204_ - i_203_
					       | i_203_ - (i_203_ >>> 8));
				    }
				    if (bool_81_ && bool_90_)
					fs[i_99_] = f;
				}
			    }
			    i_91_ += i_95_;
			    i_99_++;
			}
			i_92_ += i_96_;
			i_91_ = i_192_;
			i_99_ += i_100_;
		    }
		} else if (i_86_ == 3) {
		    int i_206_ = i_91_;
		    for (int i_207_ = -i_85_; i_207_ < 0; i_207_++) {
			int i_208_ = (i_92_ >> 16) * anInt8985;
			for (int i_209_ = -i_84_; i_209_ < 0; i_209_++) {
			    if (!bool_81_ || f < fs[i_99_]) {
				if (bool) {
				    int i_210_ = (anIntArray11415
						  [(i_91_ >> 16) + i_208_]);
				    int i_211_ = i_210_ + i_87_;
				    int i_212_ = ((i_210_ & 0xff00ff)
						  + (i_87_ & 0xff00ff));
				    int i_213_
					= ((i_212_ & 0x1000100)
					   + (i_211_ - i_212_ & 0x10000));
				    i_210_
					= i_211_ - i_213_ | i_213_ - (i_213_
								      >>> 8);
				    i_213_ = is[i_99_];
				    i_211_ = i_210_ + i_213_;
				    i_212_
					= (i_210_ & 0xff00ff) + (i_213_
								 & 0xff00ff);
				    i_213_ = ((i_212_ & 0x1000100)
					      + (i_211_ - i_212_ & 0x10000));
				    is[i_99_]
					= i_211_ - i_213_ | i_213_ - (i_213_
								      >>> 8);
				}
				if (bool_81_ && bool_90_)
				    fs[i_99_] = f;
			    }
			    i_91_ += i_95_;
			    i_99_++;
			}
			i_92_ += i_96_;
			i_91_ = i_206_;
			i_99_ += i_100_;
		    }
		} else if (i_86_ == 2) {
		    int i_214_ = i_87_ >>> 24;
		    int i_215_ = 256 - i_214_;
		    int i_216_ = (i_87_ & 0xff00ff) * i_215_ & ~0xff00ff;
		    int i_217_ = (i_87_ & 0xff00) * i_215_ & 0xff0000;
		    i_87_ = (i_216_ | i_217_) >>> 8;
		    int i_218_ = i_91_;
		    for (int i_219_ = -i_85_; i_219_ < 0; i_219_++) {
			int i_220_ = (i_92_ >> 16) * anInt8985;
			for (int i_221_ = -i_84_; i_221_ < 0; i_221_++) {
			    if (!bool_81_ || f < fs[i_99_]) {
				int i_222_
				    = anIntArray11415[(i_91_ >> 16) + i_220_];
				if (i_222_ != 0) {
				    if (bool) {
					i_216_ = ((i_222_ & 0xff00ff) * i_214_
						  & ~0xff00ff);
					i_217_ = ((i_222_ & 0xff00) * i_214_
						  & 0xff0000);
					i_222_ = (((i_216_ | i_217_) >>> 8)
						  + i_87_);
					int i_223_ = is[i_99_];
					int i_224_ = i_222_ + i_223_;
					int i_225_ = ((i_222_ & 0xff00ff)
						      + (i_223_ & 0xff00ff));
					i_223_
					    = ((i_225_ & 0x1000100)
					       + (i_224_ - i_225_ & 0x10000));
					is[i_99_]
					    = (i_224_ - i_223_
					       | i_223_ - (i_223_ >>> 8));
				    }
				    if (bool_81_ && bool_90_)
					fs[i_99_] = f;
				}
			    }
			    i_91_ += i_95_;
			    i_99_++;
			}
			i_92_ += i_96_;
			i_91_ = i_218_;
			i_99_ += i_100_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method14516(int i, int i_226_) {
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    if (anInt9001 == 0) {
		if (anInt9000 == 0) {
		    int i_227_ = anInt8998;
		    while (i_227_ < 0) {
			int i_228_ = anInt8988;
			int i_229_ = anInt9007;
			int i_230_ = anInt9003;
			int i_231_ = anInt8999;
			if (i_229_ >= 0 && i_230_ >= 0
			    && i_229_ - (anInt8985 << 12) < 0
			    && i_230_ - (anInt9002 << 12) < 0) {
			    for (/**/; i_231_ < 0; i_231_++)
				method17952(((i_230_ >> 12) * anInt8985
					     + (i_229_ >> 12)),
					    i_228_++, is, i, i_226_);
			}
			i_227_++;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_232_ = anInt8998;
		    while (i_232_ < 0) {
			int i_233_ = anInt8988;
			int i_234_ = anInt9007;
			int i_235_ = anInt9003 + anInt9010;
			int i_236_ = anInt8999;
			if (i_234_ >= 0 && i_234_ - (anInt8985 << 12) < 0) {
			    int i_237_;
			    if ((i_237_ = i_235_ - (anInt9002 << 12)) >= 0) {
				i_237_ = (anInt9000 - i_237_) / anInt9000;
				i_236_ += i_237_;
				i_235_ += anInt9000 * i_237_;
				i_233_ += i_237_;
			    }
			    if ((i_237_ = (i_235_ - anInt9000) / anInt9000)
				> i_236_)
				i_236_ = i_237_;
			    for (/**/; i_236_ < 0; i_236_++) {
				method17952(((i_235_ >> 12) * anInt8985
					     + (i_234_ >> 12)),
					    i_233_++, is, i, i_226_);
				i_235_ += anInt9000;
			    }
			}
			i_232_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_238_ = anInt8998;
		    while (i_238_ < 0) {
			int i_239_ = anInt8988;
			int i_240_ = anInt9007;
			int i_241_ = anInt9003 + anInt9010;
			int i_242_ = anInt8999;
			if (i_240_ >= 0 && i_240_ - (anInt8985 << 12) < 0) {
			    if (i_241_ < 0) {
				int i_243_
				    = (anInt9000 - 1 - i_241_) / anInt9000;
				i_242_ += i_243_;
				i_241_ += anInt9000 * i_243_;
				i_239_ += i_243_;
			    }
			    int i_244_;
			    if ((i_244_ = (1 + i_241_ - (anInt9002 << 12)
					   - anInt9000) / anInt9000)
				> i_242_)
				i_242_ = i_244_;
			    for (/**/; i_242_ < 0; i_242_++) {
				method17952(((i_241_ >> 12) * anInt8985
					     + (i_240_ >> 12)),
					    i_239_++, is, i, i_226_);
				i_241_ += anInt9000;
			    }
			}
			i_238_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9001 < 0) {
		if (anInt9000 == 0) {
		    int i_245_ = anInt8998;
		    while (i_245_ < 0) {
			int i_246_ = anInt8988;
			int i_247_ = anInt9007 + anInt9009;
			int i_248_ = anInt9003;
			int i_249_ = anInt8999;
			if (i_248_ >= 0 && i_248_ - (anInt9002 << 12) < 0) {
			    int i_250_;
			    if ((i_250_ = i_247_ - (anInt8985 << 12)) >= 0) {
				i_250_ = (anInt9001 - i_250_) / anInt9001;
				i_249_ += i_250_;
				i_247_ += anInt9001 * i_250_;
				i_246_ += i_250_;
			    }
			    if ((i_250_ = (i_247_ - anInt9001) / anInt9001)
				> i_249_)
				i_249_ = i_250_;
			    for (/**/; i_249_ < 0; i_249_++) {
				method17952(((i_248_ >> 12) * anInt8985
					     + (i_247_ >> 12)),
					    i_246_++, is, i, i_226_);
				i_247_ += anInt9001;
			    }
			}
			i_245_++;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_251_ = anInt8998;
		    while (i_251_ < 0) {
			int i_252_ = anInt8988;
			int i_253_ = anInt9007 + anInt9009;
			int i_254_ = anInt9003 + anInt9010;
			int i_255_ = anInt8999;
			int i_256_;
			if ((i_256_ = i_253_ - (anInt8985 << 12)) >= 0) {
			    i_256_ = (anInt9001 - i_256_) / anInt9001;
			    i_255_ += i_256_;
			    i_253_ += anInt9001 * i_256_;
			    i_254_ += anInt9000 * i_256_;
			    i_252_ += i_256_;
			}
			if ((i_256_ = (i_253_ - anInt9001) / anInt9001)
			    > i_255_)
			    i_255_ = i_256_;
			if ((i_256_ = i_254_ - (anInt9002 << 12)) >= 0) {
			    i_256_ = (anInt9000 - i_256_) / anInt9000;
			    i_255_ += i_256_;
			    i_253_ += anInt9001 * i_256_;
			    i_254_ += anInt9000 * i_256_;
			    i_252_ += i_256_;
			}
			if ((i_256_ = (i_254_ - anInt9000) / anInt9000)
			    > i_255_)
			    i_255_ = i_256_;
			for (/**/; i_255_ < 0; i_255_++) {
			    method17952((i_254_ >> 12) * anInt8985 + (i_253_
								      >> 12),
					i_252_++, is, i, i_226_);
			    i_253_ += anInt9001;
			    i_254_ += anInt9000;
			}
			i_251_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_257_ = anInt8998;
		    while (i_257_ < 0) {
			int i_258_ = anInt8988;
			int i_259_ = anInt9007 + anInt9009;
			int i_260_ = anInt9003 + anInt9010;
			int i_261_ = anInt8999;
			int i_262_;
			if ((i_262_ = i_259_ - (anInt8985 << 12)) >= 0) {
			    i_262_ = (anInt9001 - i_262_) / anInt9001;
			    i_261_ += i_262_;
			    i_259_ += anInt9001 * i_262_;
			    i_260_ += anInt9000 * i_262_;
			    i_258_ += i_262_;
			}
			if ((i_262_ = (i_259_ - anInt9001) / anInt9001)
			    > i_261_)
			    i_261_ = i_262_;
			if (i_260_ < 0) {
			    i_262_ = (anInt9000 - 1 - i_260_) / anInt9000;
			    i_261_ += i_262_;
			    i_259_ += anInt9001 * i_262_;
			    i_260_ += anInt9000 * i_262_;
			    i_258_ += i_262_;
			}
			if ((i_262_ = (1 + i_260_ - (anInt9002 << 12)
				       - anInt9000) / anInt9000)
			    > i_261_)
			    i_261_ = i_262_;
			for (/**/; i_261_ < 0; i_261_++) {
			    method17952((i_260_ >> 12) * anInt8985 + (i_259_
								      >> 12),
					i_258_++, is, i, i_226_);
			    i_259_ += anInt9001;
			    i_260_ += anInt9000;
			}
			i_257_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9000 == 0) {
		int i_263_ = anInt8998;
		while (i_263_ < 0) {
		    int i_264_ = anInt8988;
		    int i_265_ = anInt9007 + anInt9009;
		    int i_266_ = anInt9003;
		    int i_267_ = anInt8999;
		    if (i_266_ >= 0 && i_266_ - (anInt9002 << 12) < 0) {
			if (i_265_ < 0) {
			    int i_268_ = (anInt9001 - 1 - i_265_) / anInt9001;
			    i_267_ += i_268_;
			    i_265_ += anInt9001 * i_268_;
			    i_264_ += i_268_;
			}
			int i_269_;
			if ((i_269_ = (1 + i_265_ - (anInt8985 << 12)
				       - anInt9001) / anInt9001)
			    > i_267_)
			    i_267_ = i_269_;
			for (/**/; i_267_ < 0; i_267_++) {
			    method17952((i_266_ >> 12) * anInt8985 + (i_265_
								      >> 12),
					i_264_++, is, i, i_226_);
			    i_265_ += anInt9001;
			}
		    }
		    i_263_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else if (anInt9000 < 0) {
		for (int i_270_ = anInt8998; i_270_ < 0; i_270_++) {
		    int i_271_ = anInt8988;
		    int i_272_ = anInt9007 + anInt9009;
		    int i_273_ = anInt9003 + anInt9010;
		    int i_274_ = anInt8999;
		    if (i_272_ < 0) {
			int i_275_ = (anInt9001 - 1 - i_272_) / anInt9001;
			i_274_ += i_275_;
			i_272_ += anInt9001 * i_275_;
			i_273_ += anInt9000 * i_275_;
			i_271_ += i_275_;
		    }
		    int i_276_;
		    if ((i_276_ = ((1 + i_272_ - (anInt8985 << 12) - anInt9001)
				   / anInt9001))
			> i_274_)
			i_274_ = i_276_;
		    if ((i_276_ = i_273_ - (anInt9002 << 12)) >= 0) {
			i_276_ = (anInt9000 - i_276_) / anInt9000;
			i_274_ += i_276_;
			i_272_ += anInt9001 * i_276_;
			i_273_ += anInt9000 * i_276_;
			i_271_ += i_276_;
		    }
		    if ((i_276_ = (i_273_ - anInt9000) / anInt9000) > i_274_)
			i_274_ = i_276_;
		    for (/**/; i_274_ < 0; i_274_++) {
			method17952((i_273_ >> 12) * anInt8985 + (i_272_
								  >> 12),
				    i_271_++, is, i, i_226_);
			i_272_ += anInt9001;
			i_273_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else {
		for (int i_277_ = anInt8998; i_277_ < 0; i_277_++) {
		    int i_278_ = anInt8988;
		    int i_279_ = anInt9007 + anInt9009;
		    int i_280_ = anInt9003 + anInt9010;
		    int i_281_ = anInt8999;
		    if (i_279_ < 0) {
			int i_282_ = (anInt9001 - 1 - i_279_) / anInt9001;
			i_281_ += i_282_;
			i_279_ += anInt9001 * i_282_;
			i_280_ += anInt9000 * i_282_;
			i_278_ += i_282_;
		    }
		    int i_283_;
		    if ((i_283_ = ((1 + i_279_ - (anInt8985 << 12) - anInt9001)
				   / anInt9001))
			> i_281_)
			i_281_ = i_283_;
		    if (i_280_ < 0) {
			i_283_ = (anInt9000 - 1 - i_280_) / anInt9000;
			i_281_ += i_283_;
			i_279_ += anInt9001 * i_283_;
			i_280_ += anInt9000 * i_283_;
			i_278_ += i_283_;
		    }
		    if ((i_283_ = ((1 + i_280_ - (anInt9002 << 12) - anInt9000)
				   / anInt9000))
			> i_281_)
			i_281_ = i_283_;
		    for (/**/; i_281_ < 0; i_281_++) {
			method17952((i_280_ >> 12) * anInt8985 + (i_279_
								  >> 12),
				    i_278_++, is, i, i_226_);
			i_279_ += anInt9001;
			i_280_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    }
	}
    }
    
    public void method2657(int i, int i_284_, int i_285_, int i_286_,
			   int i_287_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    int i_288_ = aClass185_Sub2_9016.anInt9356 * 356365251;
	    i += anInt8987;
	    i_284_ += anInt8989;
	    int i_289_ = i_284_ * i_288_ + i;
	    int i_290_ = 0;
	    int i_291_ = anInt9002;
	    int i_292_ = anInt8985;
	    int i_293_ = i_288_ - i_292_;
	    int i_294_ = 0;
	    if (i_284_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		int i_295_ = aClass185_Sub2_9016.anInt9344 * 9823353 - i_284_;
		i_291_ -= i_295_;
		i_284_ = aClass185_Sub2_9016.anInt9344 * 9823353;
		i_290_ += i_295_ * i_292_;
		i_289_ += i_295_ * i_288_;
	    }
	    if (i_284_ + i_291_ > aClass185_Sub2_9016.anInt9345 * 639238427)
		i_291_ -= (i_284_ + i_291_
			   - aClass185_Sub2_9016.anInt9345 * 639238427);
	    if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		int i_296_ = aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		i_292_ -= i_296_;
		i = aClass185_Sub2_9016.anInt9365 * 1709859847;
		i_290_ += i_296_;
		i_289_ += i_296_;
		i_294_ += i_296_;
		i_293_ += i_296_;
	    }
	    if (i + i_292_ > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		int i_297_
		    = i + i_292_ - aClass185_Sub2_9016.anInt9343 * -1807368365;
		i_292_ -= i_297_;
		i_294_ += i_297_;
		i_293_ += i_297_;
	    }
	    if (i_292_ > 0 && i_291_ > 0) {
		if (i_287_ == 0) {
		    if (i_285_ == 1) {
			for (int i_298_ = -i_291_; i_298_ < 0; i_298_++) {
			    int i_299_ = i_289_ + i_292_ - 3;
			    while (i_289_ < i_299_) {
				is[i_289_++] = anIntArray11415[i_290_++];
				is[i_289_++] = anIntArray11415[i_290_++];
				is[i_289_++] = anIntArray11415[i_290_++];
				is[i_289_++] = anIntArray11415[i_290_++];
			    }
			    i_299_ += 3;
			    while (i_289_ < i_299_)
				is[i_289_++] = anIntArray11415[i_290_++];
			    i_289_ += i_293_;
			    i_290_ += i_294_;
			}
		    } else if (i_285_ == 0) {
			int i_300_ = (i_286_ & 0xff0000) >> 16;
			int i_301_ = (i_286_ & 0xff00) >> 8;
			int i_302_ = i_286_ & 0xff;
			for (int i_303_ = -i_291_; i_303_ < 0; i_303_++) {
			    for (int i_304_ = -i_292_; i_304_ < 0; i_304_++) {
				int i_305_ = anIntArray11415[i_290_++];
				int i_306_
				    = (i_305_ & 0xff0000) * i_300_ & ~0xffffff;
				int i_307_
				    = (i_305_ & 0xff00) * i_301_ & 0xff0000;
				int i_308_ = (i_305_ & 0xff) * i_302_ & 0xff00;
				is[i_289_++]
				    = (i_306_ | i_307_ | i_308_) >>> 8;
			    }
			    i_289_ += i_293_;
			    i_290_ += i_294_;
			}
		    } else if (i_285_ == 3) {
			for (int i_309_ = -i_291_; i_309_ < 0; i_309_++) {
			    for (int i_310_ = -i_292_; i_310_ < 0; i_310_++) {
				int i_311_ = anIntArray11415[i_290_++];
				int i_312_ = i_311_ + i_286_;
				int i_313_ = ((i_311_ & 0xff00ff)
					      + (i_286_ & 0xff00ff));
				int i_314_ = ((i_313_ & 0x1000100)
					      + (i_312_ - i_313_ & 0x10000));
				is[i_289_++]
				    = i_312_ - i_314_ | i_314_ - (i_314_
								  >>> 8);
			    }
			    i_289_ += i_293_;
			    i_290_ += i_294_;
			}
		    } else if (i_285_ == 2) {
			int i_315_ = i_286_ >>> 24;
			int i_316_ = 256 - i_315_;
			int i_317_ = (i_286_ & 0xff00ff) * i_316_ & ~0xff00ff;
			int i_318_ = (i_286_ & 0xff00) * i_316_ & 0xff0000;
			i_286_ = (i_317_ | i_318_) >>> 8;
			for (int i_319_ = -i_291_; i_319_ < 0; i_319_++) {
			    for (int i_320_ = -i_292_; i_320_ < 0; i_320_++) {
				int i_321_ = anIntArray11415[i_290_++];
				i_317_
				    = (i_321_ & 0xff00ff) * i_315_ & ~0xff00ff;
				i_318_ = (i_321_ & 0xff00) * i_315_ & 0xff0000;
				is[i_289_++]
				    = ((i_317_ | i_318_) >>> 8) + i_286_;
			    }
			    i_289_ += i_293_;
			    i_290_ += i_294_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_287_ == 1) {
		    if (i_285_ == 1) {
			for (int i_322_ = -i_291_; i_322_ < 0; i_322_++) {
			    int i_323_ = i_289_ + i_292_ - 3;
			    while (i_289_ < i_323_) {
				int i_324_ = anIntArray11415[i_290_++];
				if (i_324_ != 0)
				    is[i_289_++] = i_324_;
				else
				    i_289_++;
				i_324_ = anIntArray11415[i_290_++];
				if (i_324_ != 0)
				    is[i_289_++] = i_324_;
				else
				    i_289_++;
				i_324_ = anIntArray11415[i_290_++];
				if (i_324_ != 0)
				    is[i_289_++] = i_324_;
				else
				    i_289_++;
				i_324_ = anIntArray11415[i_290_++];
				if (i_324_ != 0)
				    is[i_289_++] = i_324_;
				else
				    i_289_++;
			    }
			    i_323_ += 3;
			    while (i_289_ < i_323_) {
				int i_325_ = anIntArray11415[i_290_++];
				if (i_325_ != 0)
				    is[i_289_++] = i_325_;
				else
				    i_289_++;
			    }
			    i_289_ += i_293_;
			    i_290_ += i_294_;
			}
		    } else if (i_285_ == 0) {
			if ((i_286_ & 0xffffff) == 16777215) {
			    int i_326_ = i_286_ >>> 24;
			    int i_327_ = 256 - i_326_;
			    for (int i_328_ = -i_291_; i_328_ < 0; i_328_++) {
				for (int i_329_ = -i_292_; i_329_ < 0;
				     i_329_++) {
				    int i_330_ = anIntArray11415[i_290_++];
				    if (i_330_ != 0) {
					int i_331_ = is[i_289_];
					is[i_289_++]
					    = ((((i_330_ & 0xff00ff) * i_326_
						 + ((i_331_ & 0xff00ff)
						    * i_327_))
						& ~0xff00ff)
					       + (((i_330_ & 0xff00) * i_326_
						   + ((i_331_ & 0xff00)
						      * i_327_))
						  & 0xff0000)) >> 8;
				    } else
					i_289_++;
				}
				i_289_ += i_293_;
				i_290_ += i_294_;
			    }
			} else {
			    int i_332_ = (i_286_ & 0xff0000) >> 16;
			    int i_333_ = (i_286_ & 0xff00) >> 8;
			    int i_334_ = i_286_ & 0xff;
			    int i_335_ = i_286_ >>> 24;
			    int i_336_ = 256 - i_335_;
			    for (int i_337_ = -i_291_; i_337_ < 0; i_337_++) {
				for (int i_338_ = -i_292_; i_338_ < 0;
				     i_338_++) {
				    int i_339_ = anIntArray11415[i_290_++];
				    if (i_339_ != 0) {
					if (i_335_ != 255) {
					    int i_340_
						= ((i_339_ & 0xff0000) * i_332_
						   & ~0xffffff);
					    int i_341_
						= ((i_339_ & 0xff00) * i_333_
						   & 0xff0000);
					    int i_342_
						= ((i_339_ & 0xff) * i_334_
						   & 0xff00);
					    i_339_ = (i_340_ | i_341_
						      | i_342_) >>> 8;
					    int i_343_ = is[i_289_];
					    is[i_289_++]
						= (((((i_339_ & 0xff00ff)
						      * i_335_)
						     + ((i_343_ & 0xff00ff)
							* i_336_))
						    & ~0xff00ff)
						   + ((((i_339_ & 0xff00)
							* i_335_)
						       + ((i_343_ & 0xff00)
							  * i_336_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_344_
						= ((i_339_ & 0xff0000) * i_332_
						   & ~0xffffff);
					    int i_345_
						= ((i_339_ & 0xff00) * i_333_
						   & 0xff0000);
					    int i_346_
						= ((i_339_ & 0xff) * i_334_
						   & 0xff00);
					    is[i_289_++] = (i_344_ | i_345_
							    | i_346_) >>> 8;
					}
				    } else
					i_289_++;
				}
				i_289_ += i_293_;
				i_290_ += i_294_;
			    }
			}
		    } else if (i_285_ == 3) {
			int i_347_ = i_286_ >>> 24;
			int i_348_ = 256 - i_347_;
			for (int i_349_ = -i_291_; i_349_ < 0; i_349_++) {
			    for (int i_350_ = -i_292_; i_350_ < 0; i_350_++) {
				int i_351_ = anIntArray11415[i_290_++];
				int i_352_ = i_351_ + i_286_;
				int i_353_ = ((i_351_ & 0xff00ff)
					      + (i_286_ & 0xff00ff));
				int i_354_ = ((i_353_ & 0x1000100)
					      + (i_352_ - i_353_ & 0x10000));
				i_354_ = i_352_ - i_354_ | i_354_ - (i_354_
								     >>> 8);
				if (i_351_ == 0 && i_347_ != 255) {
				    i_351_ = i_354_;
				    i_354_ = is[i_289_];
				    i_354_ = ((((i_351_ & 0xff00ff) * i_347_
						+ (i_354_ & 0xff00ff) * i_348_)
					       & ~0xff00ff)
					      + (((i_351_ & 0xff00) * i_347_
						  + (i_354_ & 0xff00) * i_348_)
						 & 0xff0000)) >> 8;
				}
				is[i_289_++] = i_354_;
			    }
			    i_289_ += i_293_;
			    i_290_ += i_294_;
			}
		    } else if (i_285_ == 2) {
			int i_355_ = i_286_ >>> 24;
			int i_356_ = 256 - i_355_;
			int i_357_ = (i_286_ & 0xff00ff) * i_356_ & ~0xff00ff;
			int i_358_ = (i_286_ & 0xff00) * i_356_ & 0xff0000;
			i_286_ = (i_357_ | i_358_) >>> 8;
			for (int i_359_ = -i_291_; i_359_ < 0; i_359_++) {
			    for (int i_360_ = -i_292_; i_360_ < 0; i_360_++) {
				int i_361_ = anIntArray11415[i_290_++];
				if (i_361_ != 0) {
				    i_357_ = ((i_361_ & 0xff00ff) * i_355_
					      & ~0xff00ff);
				    i_358_ = ((i_361_ & 0xff00) * i_355_
					      & 0xff0000);
				    is[i_289_++]
					= ((i_357_ | i_358_) >>> 8) + i_286_;
				} else
				    i_289_++;
			    }
			    i_289_ += i_293_;
			    i_290_ += i_294_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_287_ == 2) {
		    if (i_285_ == 1) {
			for (int i_362_ = -i_291_; i_362_ < 0; i_362_++) {
			    for (int i_363_ = -i_292_; i_363_ < 0; i_363_++) {
				int i_364_ = anIntArray11415[i_290_++];
				if (i_364_ != 0) {
				    int i_365_ = is[i_289_];
				    int i_366_ = i_364_ + i_365_;
				    int i_367_ = ((i_364_ & 0xff00ff)
						  + (i_365_ & 0xff00ff));
				    i_365_ = ((i_367_ & 0x1000100)
					      + (i_366_ - i_367_ & 0x10000));
				    is[i_289_++]
					= i_366_ - i_365_ | i_365_ - (i_365_
								      >>> 8);
				} else
				    i_289_++;
			    }
			    i_289_ += i_293_;
			    i_290_ += i_294_;
			}
		    } else if (i_285_ == 0) {
			int i_368_ = (i_286_ & 0xff0000) >> 16;
			int i_369_ = (i_286_ & 0xff00) >> 8;
			int i_370_ = i_286_ & 0xff;
			for (int i_371_ = -i_291_; i_371_ < 0; i_371_++) {
			    for (int i_372_ = -i_292_; i_372_ < 0; i_372_++) {
				int i_373_ = anIntArray11415[i_290_++];
				if (i_373_ != 0) {
				    int i_374_ = ((i_373_ & 0xff0000) * i_368_
						  & ~0xffffff);
				    int i_375_ = ((i_373_ & 0xff00) * i_369_
						  & 0xff0000);
				    int i_376_
					= (i_373_ & 0xff) * i_370_ & 0xff00;
				    i_373_ = (i_374_ | i_375_ | i_376_) >>> 8;
				    int i_377_ = is[i_289_];
				    int i_378_ = i_373_ + i_377_;
				    int i_379_ = ((i_373_ & 0xff00ff)
						  + (i_377_ & 0xff00ff));
				    i_377_ = ((i_379_ & 0x1000100)
					      + (i_378_ - i_379_ & 0x10000));
				    is[i_289_++]
					= i_378_ - i_377_ | i_377_ - (i_377_
								      >>> 8);
				} else
				    i_289_++;
			    }
			    i_289_ += i_293_;
			    i_290_ += i_294_;
			}
		    } else if (i_285_ == 3) {
			for (int i_380_ = -i_291_; i_380_ < 0; i_380_++) {
			    for (int i_381_ = -i_292_; i_381_ < 0; i_381_++) {
				int i_382_ = anIntArray11415[i_290_++];
				int i_383_ = i_382_ + i_286_;
				int i_384_ = ((i_382_ & 0xff00ff)
					      + (i_286_ & 0xff00ff));
				int i_385_ = ((i_384_ & 0x1000100)
					      + (i_383_ - i_384_ & 0x10000));
				i_382_ = i_383_ - i_385_ | i_385_ - (i_385_
								     >>> 8);
				i_385_ = is[i_289_];
				i_383_ = i_382_ + i_385_;
				i_384_ = (i_382_ & 0xff00ff) + (i_385_
								& 0xff00ff);
				i_385_
				    = (i_384_ & 0x1000100) + (i_383_ - i_384_
							      & 0x10000);
				is[i_289_++]
				    = i_383_ - i_385_ | i_385_ - (i_385_
								  >>> 8);
			    }
			    i_289_ += i_293_;
			    i_290_ += i_294_;
			}
		    } else if (i_285_ == 2) {
			int i_386_ = i_286_ >>> 24;
			int i_387_ = 256 - i_386_;
			int i_388_ = (i_286_ & 0xff00ff) * i_387_ & ~0xff00ff;
			int i_389_ = (i_286_ & 0xff00) * i_387_ & 0xff0000;
			i_286_ = (i_388_ | i_389_) >>> 8;
			for (int i_390_ = -i_291_; i_390_ < 0; i_390_++) {
			    for (int i_391_ = -i_292_; i_391_ < 0; i_391_++) {
				int i_392_ = anIntArray11415[i_290_++];
				if (i_392_ != 0) {
				    i_388_ = ((i_392_ & 0xff00ff) * i_386_
					      & ~0xff00ff);
				    i_389_ = ((i_392_ & 0xff00) * i_386_
					      & 0xff0000);
				    i_392_
					= ((i_388_ | i_389_) >>> 8) + i_286_;
				    int i_393_ = is[i_289_];
				    int i_394_ = i_392_ + i_393_;
				    int i_395_ = ((i_392_ & 0xff00ff)
						  + (i_393_ & 0xff00ff));
				    i_393_ = ((i_395_ & 0x1000100)
					      + (i_394_ - i_395_ & 0x10000));
				    is[i_289_++]
					= i_394_ - i_393_ | i_393_ - (i_393_
								      >>> 8);
				} else
				    i_289_++;
			    }
			    i_289_ += i_293_;
			    i_290_ += i_294_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2691(int i, int i_396_, Class145 class145, int i_397_,
			   int i_398_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    i += anInt8987;
	    i_396_ += anInt8989;
	    int i_399_ = 0;
	    int i_400_ = aClass185_Sub2_9016.anInt9356 * 356365251;
	    int i_401_ = anInt8985;
	    int i_402_ = anInt9002;
	    int i_403_ = i_400_ - i_401_;
	    int i_404_ = 0;
	    int i_405_ = i + i_396_ * i_400_;
	    if (i_396_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		int i_406_ = aClass185_Sub2_9016.anInt9344 * 9823353 - i_396_;
		i_402_ -= i_406_;
		i_396_ = aClass185_Sub2_9016.anInt9344 * 9823353;
		i_399_ += i_406_ * i_401_;
		i_405_ += i_406_ * i_400_;
	    }
	    if (i_396_ + i_402_ > aClass185_Sub2_9016.anInt9345 * 639238427)
		i_402_ -= (i_396_ + i_402_
			   - aClass185_Sub2_9016.anInt9345 * 639238427);
	    if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		int i_407_ = aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		i_401_ -= i_407_;
		i = aClass185_Sub2_9016.anInt9365 * 1709859847;
		i_399_ += i_407_;
		i_405_ += i_407_;
		i_404_ += i_407_;
		i_403_ += i_407_;
	    }
	    if (i + i_401_ > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		int i_408_
		    = i + i_401_ - aClass185_Sub2_9016.anInt9343 * -1807368365;
		i_401_ -= i_408_;
		i_404_ += i_408_;
		i_403_ += i_408_;
	    }
	    if (i_401_ > 0 && i_402_ > 0) {
		Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
		int[] is_409_ = class145_sub2.anIntArray9797;
		int[] is_410_ = class145_sub2.anIntArray9798;
		int i_411_ = i_396_;
		if (i_398_ > i_411_) {
		    i_411_ = i_398_;
		    i_405_ += (i_398_ - i_396_) * i_400_;
		    i_399_ += (i_398_ - i_396_) * anInt8985;
		}
		int i_412_ = (i_398_ + is_409_.length < i_396_ + i_402_
			      ? i_398_ + is_409_.length : i_396_ + i_402_);
		for (int i_413_ = i_411_; i_413_ < i_412_; i_413_++) {
		    int i_414_ = is_409_[i_413_ - i_398_] + i_397_;
		    int i_415_ = is_410_[i_413_ - i_398_];
		    int i_416_ = i_401_;
		    if (i > i_414_) {
			int i_417_ = i - i_414_;
			if (i_417_ >= i_415_) {
			    i_399_ += i_401_ + i_404_;
			    i_405_ += i_401_ + i_403_;
			    continue;
			}
			i_415_ -= i_417_;
		    } else {
			int i_418_ = i_414_ - i;
			if (i_418_ >= i_401_) {
			    i_399_ += i_401_ + i_404_;
			    i_405_ += i_401_ + i_403_;
			    continue;
			}
			i_399_ += i_418_;
			i_416_ -= i_418_;
			i_405_ += i_418_;
		    }
		    int i_419_ = 0;
		    if (i_416_ < i_415_)
			i_415_ = i_416_;
		    else
			i_419_ = i_416_ - i_415_;
		    for (int i_420_ = -i_415_; i_420_ < 0; i_420_++) {
			int i_421_ = anIntArray11415[i_399_++];
			if (i_421_ != 0)
			    is[i_405_++] = i_421_;
			else
			    i_405_++;
		    }
		    i_399_ += i_419_ + i_404_;
		    i_405_ += i_419_ + i_403_;
		}
	    }
	}
    }
    
    void method2661(int i, int i_422_, int i_423_, int i_424_, int i_425_,
		    int i_426_, int i_427_, int i_428_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (i_423_ > 0 && i_424_ > 0) {
	    int[] is = aClass185_Sub2_9016.anIntArray9338;
	    if (is != null) {
		int i_429_ = 0;
		int i_430_ = 0;
		int i_431_ = aClass185_Sub2_9016.anInt9356 * 356365251;
		int i_432_ = anInt8987 + anInt8985 + anInt8992;
		int i_433_ = anInt8989 + anInt9002 + anInt8990;
		int i_434_ = (i_432_ << 16) / i_423_;
		int i_435_ = (i_433_ << 16) / i_424_;
		if (anInt8987 > 0) {
		    int i_436_ = ((anInt8987 << 16) + i_434_ - 1) / i_434_;
		    i += i_436_;
		    i_429_ += i_436_ * i_434_ - (anInt8987 << 16);
		}
		if (anInt8989 > 0) {
		    int i_437_ = ((anInt8989 << 16) + i_435_ - 1) / i_435_;
		    i_422_ += i_437_;
		    i_430_ += i_437_ * i_435_ - (anInt8989 << 16);
		}
		if (anInt8985 < i_432_)
		    i_423_
			= ((anInt8985 << 16) - i_429_ + i_434_ - 1) / i_434_;
		if (anInt9002 < i_433_)
		    i_424_
			= ((anInt9002 << 16) - i_430_ + i_435_ - 1) / i_435_;
		int i_438_ = i + i_422_ * i_431_;
		int i_439_ = i_431_ - i_423_;
		if (i_422_ + i_424_
		    > aClass185_Sub2_9016.anInt9345 * 639238427)
		    i_424_ -= (i_422_ + i_424_
			       - aClass185_Sub2_9016.anInt9345 * 639238427);
		if (i_422_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		    int i_440_
			= aClass185_Sub2_9016.anInt9344 * 9823353 - i_422_;
		    i_424_ -= i_440_;
		    i_438_ += i_440_ * i_431_;
		    i_430_ += i_435_ * i_440_;
		}
		if (i + i_423_ > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		    int i_441_
			= (i + i_423_
			   - aClass185_Sub2_9016.anInt9343 * -1807368365);
		    i_423_ -= i_441_;
		    i_439_ += i_441_;
		}
		if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		    int i_442_
			= aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		    i_423_ -= i_442_;
		    i_438_ += i_442_;
		    i_429_ += i_434_ * i_442_;
		    i_439_ += i_442_;
		}
		if (i_427_ == 0) {
		    if (i_425_ == 1) {
			int i_443_ = i_429_;
			for (int i_444_ = -i_424_; i_444_ < 0; i_444_++) {
			    int i_445_ = (i_430_ >> 16) * anInt8985;
			    for (int i_446_ = -i_423_; i_446_ < 0; i_446_++) {
				is[i_438_++]
				    = anIntArray11415[(i_429_ >> 16) + i_445_];
				i_429_ += i_434_;
			    }
			    i_430_ += i_435_;
			    i_429_ = i_443_;
			    i_438_ += i_439_;
			}
		    } else if (i_425_ == 0) {
			int i_447_ = (i_426_ & 0xff0000) >> 16;
			int i_448_ = (i_426_ & 0xff00) >> 8;
			int i_449_ = i_426_ & 0xff;
			int i_450_ = i_429_;
			for (int i_451_ = -i_424_; i_451_ < 0; i_451_++) {
			    int i_452_ = (i_430_ >> 16) * anInt8985;
			    for (int i_453_ = -i_423_; i_453_ < 0; i_453_++) {
				int i_454_
				    = anIntArray11415[(i_429_ >> 16) + i_452_];
				int i_455_
				    = (i_454_ & 0xff0000) * i_447_ & ~0xffffff;
				int i_456_
				    = (i_454_ & 0xff00) * i_448_ & 0xff0000;
				int i_457_ = (i_454_ & 0xff) * i_449_ & 0xff00;
				is[i_438_++]
				    = (i_455_ | i_456_ | i_457_) >>> 8;
				i_429_ += i_434_;
			    }
			    i_430_ += i_435_;
			    i_429_ = i_450_;
			    i_438_ += i_439_;
			}
		    } else if (i_425_ == 3) {
			int i_458_ = i_429_;
			for (int i_459_ = -i_424_; i_459_ < 0; i_459_++) {
			    int i_460_ = (i_430_ >> 16) * anInt8985;
			    for (int i_461_ = -i_423_; i_461_ < 0; i_461_++) {
				int i_462_
				    = anIntArray11415[(i_429_ >> 16) + i_460_];
				int i_463_ = i_462_ + i_426_;
				int i_464_ = ((i_462_ & 0xff00ff)
					      + (i_426_ & 0xff00ff));
				int i_465_ = ((i_464_ & 0x1000100)
					      + (i_463_ - i_464_ & 0x10000));
				is[i_438_++]
				    = i_463_ - i_465_ | i_465_ - (i_465_
								  >>> 8);
				i_429_ += i_434_;
			    }
			    i_430_ += i_435_;
			    i_429_ = i_458_;
			    i_438_ += i_439_;
			}
		    } else if (i_425_ == 2) {
			int i_466_ = i_426_ >>> 24;
			int i_467_ = 256 - i_466_;
			int i_468_ = (i_426_ & 0xff00ff) * i_467_ & ~0xff00ff;
			int i_469_ = (i_426_ & 0xff00) * i_467_ & 0xff0000;
			i_426_ = (i_468_ | i_469_) >>> 8;
			int i_470_ = i_429_;
			for (int i_471_ = -i_424_; i_471_ < 0; i_471_++) {
			    int i_472_ = (i_430_ >> 16) * anInt8985;
			    for (int i_473_ = -i_423_; i_473_ < 0; i_473_++) {
				int i_474_
				    = anIntArray11415[(i_429_ >> 16) + i_472_];
				i_468_
				    = (i_474_ & 0xff00ff) * i_466_ & ~0xff00ff;
				i_469_ = (i_474_ & 0xff00) * i_466_ & 0xff0000;
				is[i_438_++]
				    = ((i_468_ | i_469_) >>> 8) + i_426_;
				i_429_ += i_434_;
			    }
			    i_430_ += i_435_;
			    i_429_ = i_470_;
			    i_438_ += i_439_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_427_ == 1) {
		    if (i_425_ == 1) {
			int i_475_ = i_429_;
			for (int i_476_ = -i_424_; i_476_ < 0; i_476_++) {
			    int i_477_ = (i_430_ >> 16) * anInt8985;
			    for (int i_478_ = -i_423_; i_478_ < 0; i_478_++) {
				int i_479_
				    = anIntArray11415[(i_429_ >> 16) + i_477_];
				if (i_479_ != 0)
				    is[i_438_++] = i_479_;
				else
				    i_438_++;
				i_429_ += i_434_;
			    }
			    i_430_ += i_435_;
			    i_429_ = i_475_;
			    i_438_ += i_439_;
			}
		    } else if (i_425_ == 0) {
			int i_480_ = i_429_;
			if ((i_426_ & 0xffffff) == 16777215) {
			    int i_481_ = i_426_ >>> 24;
			    int i_482_ = 256 - i_481_;
			    for (int i_483_ = -i_424_; i_483_ < 0; i_483_++) {
				int i_484_ = (i_430_ >> 16) * anInt8985;
				for (int i_485_ = -i_423_; i_485_ < 0;
				     i_485_++) {
				    int i_486_ = (anIntArray11415
						  [(i_429_ >> 16) + i_484_]);
				    if (i_486_ != 0) {
					int i_487_ = is[i_438_];
					is[i_438_++]
					    = ((((i_486_ & 0xff00ff) * i_481_
						 + ((i_487_ & 0xff00ff)
						    * i_482_))
						& ~0xff00ff)
					       + (((i_486_ & 0xff00) * i_481_
						   + ((i_487_ & 0xff00)
						      * i_482_))
						  & 0xff0000)) >> 8;
				    } else
					i_438_++;
				    i_429_ += i_434_;
				}
				i_430_ += i_435_;
				i_429_ = i_480_;
				i_438_ += i_439_;
			    }
			} else {
			    int i_488_ = (i_426_ & 0xff0000) >> 16;
			    int i_489_ = (i_426_ & 0xff00) >> 8;
			    int i_490_ = i_426_ & 0xff;
			    int i_491_ = i_426_ >>> 24;
			    int i_492_ = 256 - i_491_;
			    for (int i_493_ = -i_424_; i_493_ < 0; i_493_++) {
				int i_494_ = (i_430_ >> 16) * anInt8985;
				for (int i_495_ = -i_423_; i_495_ < 0;
				     i_495_++) {
				    int i_496_ = (anIntArray11415
						  [(i_429_ >> 16) + i_494_]);
				    if (i_496_ != 0) {
					if (i_491_ != 255) {
					    int i_497_
						= ((i_496_ & 0xff0000) * i_488_
						   & ~0xffffff);
					    int i_498_
						= ((i_496_ & 0xff00) * i_489_
						   & 0xff0000);
					    int i_499_
						= ((i_496_ & 0xff) * i_490_
						   & 0xff00);
					    i_496_ = (i_497_ | i_498_
						      | i_499_) >>> 8;
					    int i_500_ = is[i_438_];
					    is[i_438_++]
						= (((((i_496_ & 0xff00ff)
						      * i_491_)
						     + ((i_500_ & 0xff00ff)
							* i_492_))
						    & ~0xff00ff)
						   + ((((i_496_ & 0xff00)
							* i_491_)
						       + ((i_500_ & 0xff00)
							  * i_492_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_501_
						= ((i_496_ & 0xff0000) * i_488_
						   & ~0xffffff);
					    int i_502_
						= ((i_496_ & 0xff00) * i_489_
						   & 0xff0000);
					    int i_503_
						= ((i_496_ & 0xff) * i_490_
						   & 0xff00);
					    is[i_438_++] = (i_501_ | i_502_
							    | i_503_) >>> 8;
					}
				    } else
					i_438_++;
				    i_429_ += i_434_;
				}
				i_430_ += i_435_;
				i_429_ = i_480_;
				i_438_ += i_439_;
			    }
			}
		    } else if (i_425_ == 3) {
			int i_504_ = i_429_;
			int i_505_ = i_426_ >>> 24;
			int i_506_ = 256 - i_505_;
			for (int i_507_ = -i_424_; i_507_ < 0; i_507_++) {
			    int i_508_ = (i_430_ >> 16) * anInt8985;
			    for (int i_509_ = -i_423_; i_509_ < 0; i_509_++) {
				int i_510_
				    = anIntArray11415[(i_429_ >> 16) + i_508_];
				int i_511_ = i_510_ + i_426_;
				int i_512_ = ((i_510_ & 0xff00ff)
					      + (i_426_ & 0xff00ff));
				int i_513_ = ((i_512_ & 0x1000100)
					      + (i_511_ - i_512_ & 0x10000));
				i_513_ = i_511_ - i_513_ | i_513_ - (i_513_
								     >>> 8);
				if (i_510_ == 0 && i_505_ != 255) {
				    i_510_ = i_513_;
				    i_513_ = is[i_438_];
				    i_513_ = ((((i_510_ & 0xff00ff) * i_505_
						+ (i_513_ & 0xff00ff) * i_506_)
					       & ~0xff00ff)
					      + (((i_510_ & 0xff00) * i_505_
						  + (i_513_ & 0xff00) * i_506_)
						 & 0xff0000)) >> 8;
				}
				is[i_438_++] = i_513_;
				i_429_ += i_434_;
			    }
			    i_430_ += i_435_;
			    i_429_ = i_504_;
			    i_438_ += i_439_;
			}
		    } else if (i_425_ == 2) {
			int i_514_ = i_426_ >>> 24;
			int i_515_ = 256 - i_514_;
			int i_516_ = (i_426_ & 0xff00ff) * i_515_ & ~0xff00ff;
			int i_517_ = (i_426_ & 0xff00) * i_515_ & 0xff0000;
			i_426_ = (i_516_ | i_517_) >>> 8;
			int i_518_ = i_429_;
			for (int i_519_ = -i_424_; i_519_ < 0; i_519_++) {
			    int i_520_ = (i_430_ >> 16) * anInt8985;
			    for (int i_521_ = -i_423_; i_521_ < 0; i_521_++) {
				int i_522_
				    = anIntArray11415[(i_429_ >> 16) + i_520_];
				if (i_522_ != 0) {
				    i_516_ = ((i_522_ & 0xff00ff) * i_514_
					      & ~0xff00ff);
				    i_517_ = ((i_522_ & 0xff00) * i_514_
					      & 0xff0000);
				    is[i_438_++]
					= ((i_516_ | i_517_) >>> 8) + i_426_;
				} else
				    i_438_++;
				i_429_ += i_434_;
			    }
			    i_430_ += i_435_;
			    i_429_ = i_518_;
			    i_438_ += i_439_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_427_ == 2) {
		    if (i_425_ == 1) {
			int i_523_ = i_429_;
			for (int i_524_ = -i_424_; i_524_ < 0; i_524_++) {
			    int i_525_ = (i_430_ >> 16) * anInt8985;
			    for (int i_526_ = -i_423_; i_526_ < 0; i_526_++) {
				int i_527_
				    = anIntArray11415[(i_429_ >> 16) + i_525_];
				if (i_527_ != 0) {
				    int i_528_ = is[i_438_];
				    int i_529_ = i_527_ + i_528_;
				    int i_530_ = ((i_527_ & 0xff00ff)
						  + (i_528_ & 0xff00ff));
				    i_528_ = ((i_530_ & 0x1000100)
					      + (i_529_ - i_530_ & 0x10000));
				    is[i_438_++]
					= i_529_ - i_528_ | i_528_ - (i_528_
								      >>> 8);
				} else
				    i_438_++;
				i_429_ += i_434_;
			    }
			    i_430_ += i_435_;
			    i_429_ = i_523_;
			    i_438_ += i_439_;
			}
		    } else if (i_425_ == 0) {
			int i_531_ = i_429_;
			int i_532_ = (i_426_ & 0xff0000) >> 16;
			int i_533_ = (i_426_ & 0xff00) >> 8;
			int i_534_ = i_426_ & 0xff;
			for (int i_535_ = -i_424_; i_535_ < 0; i_535_++) {
			    int i_536_ = (i_430_ >> 16) * anInt8985;
			    for (int i_537_ = -i_423_; i_537_ < 0; i_537_++) {
				int i_538_
				    = anIntArray11415[(i_429_ >> 16) + i_536_];
				if (i_538_ != 0) {
				    int i_539_ = ((i_538_ & 0xff0000) * i_532_
						  & ~0xffffff);
				    int i_540_ = ((i_538_ & 0xff00) * i_533_
						  & 0xff0000);
				    int i_541_
					= (i_538_ & 0xff) * i_534_ & 0xff00;
				    i_538_ = (i_539_ | i_540_ | i_541_) >>> 8;
				    int i_542_ = is[i_438_];
				    int i_543_ = i_538_ + i_542_;
				    int i_544_ = ((i_538_ & 0xff00ff)
						  + (i_542_ & 0xff00ff));
				    i_542_ = ((i_544_ & 0x1000100)
					      + (i_543_ - i_544_ & 0x10000));
				    is[i_438_++]
					= i_543_ - i_542_ | i_542_ - (i_542_
								      >>> 8);
				} else
				    i_438_++;
				i_429_ += i_434_;
			    }
			    i_430_ += i_435_;
			    i_429_ = i_531_;
			    i_438_ += i_439_;
			}
		    } else if (i_425_ == 3) {
			int i_545_ = i_429_;
			for (int i_546_ = -i_424_; i_546_ < 0; i_546_++) {
			    int i_547_ = (i_430_ >> 16) * anInt8985;
			    for (int i_548_ = -i_423_; i_548_ < 0; i_548_++) {
				int i_549_
				    = anIntArray11415[(i_429_ >> 16) + i_547_];
				int i_550_ = i_549_ + i_426_;
				int i_551_ = ((i_549_ & 0xff00ff)
					      + (i_426_ & 0xff00ff));
				int i_552_ = ((i_551_ & 0x1000100)
					      + (i_550_ - i_551_ & 0x10000));
				i_549_ = i_550_ - i_552_ | i_552_ - (i_552_
								     >>> 8);
				i_552_ = is[i_438_];
				i_550_ = i_549_ + i_552_;
				i_551_ = (i_549_ & 0xff00ff) + (i_552_
								& 0xff00ff);
				i_552_
				    = (i_551_ & 0x1000100) + (i_550_ - i_551_
							      & 0x10000);
				is[i_438_++]
				    = i_550_ - i_552_ | i_552_ - (i_552_
								  >>> 8);
				i_429_ += i_434_;
			    }
			    i_430_ += i_435_;
			    i_429_ = i_545_;
			    i_438_ += i_439_;
			}
		    } else if (i_425_ == 2) {
			int i_553_ = i_426_ >>> 24;
			int i_554_ = 256 - i_553_;
			int i_555_ = (i_426_ & 0xff00ff) * i_554_ & ~0xff00ff;
			int i_556_ = (i_426_ & 0xff00) * i_554_ & 0xff0000;
			i_426_ = (i_555_ | i_556_) >>> 8;
			int i_557_ = i_429_;
			for (int i_558_ = -i_424_; i_558_ < 0; i_558_++) {
			    int i_559_ = (i_430_ >> 16) * anInt8985;
			    for (int i_560_ = -i_423_; i_560_ < 0; i_560_++) {
				int i_561_
				    = anIntArray11415[(i_429_ >> 16) + i_559_];
				if (i_561_ != 0) {
				    i_555_ = ((i_561_ & 0xff00ff) * i_553_
					      & ~0xff00ff);
				    i_556_ = ((i_561_ & 0xff00) * i_553_
					      & 0xff0000);
				    i_561_
					= ((i_555_ | i_556_) >>> 8) + i_426_;
				    int i_562_ = is[i_438_];
				    int i_563_ = i_561_ + i_562_;
				    int i_564_ = ((i_561_ & 0xff00ff)
						  + (i_562_ & 0xff00ff));
				    i_562_ = ((i_564_ & 0x1000100)
					      + (i_563_ - i_564_ & 0x10000));
				    is[i_438_++]
					= i_563_ - i_562_ | i_562_ - (i_562_
								      >>> 8);
				} else
				    i_438_++;
				i_429_ += i_434_;
			    }
			    i_430_ += i_435_;
			    i_429_ = i_557_;
			    i_438_ += i_439_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method14508(boolean bool, boolean bool_565_, boolean bool_566_, int i,
		     int i_567_, float f, int i_568_, int i_569_, int i_570_,
		     int i_571_, int i_572_, int i_573_, boolean bool_574_) {
	if (i_568_ > 0 && i_569_ > 0 && (bool || bool_565_)) {
	    int i_575_ = 0;
	    int i_576_ = 0;
	    int i_577_ = anInt8987 + anInt8985 + anInt8992;
	    int i_578_ = anInt8989 + anInt9002 + anInt8990;
	    int i_579_ = (i_577_ << 16) / i_568_;
	    int i_580_ = (i_578_ << 16) / i_569_;
	    if (anInt8987 > 0) {
		int i_581_ = ((anInt8987 << 16) + i_579_ - 1) / i_579_;
		i += i_581_;
		i_575_ += i_581_ * i_579_ - (anInt8987 << 16);
	    }
	    if (anInt8989 > 0) {
		int i_582_ = ((anInt8989 << 16) + i_580_ - 1) / i_580_;
		i_567_ += i_582_;
		i_576_ += i_582_ * i_580_ - (anInt8989 << 16);
	    }
	    if (anInt8985 < i_577_)
		i_568_ = ((anInt8985 << 16) - i_575_ + i_579_ - 1) / i_579_;
	    if (anInt9002 < i_578_)
		i_569_ = ((anInt9002 << 16) - i_576_ + i_580_ - 1) / i_580_;
	    int i_583_
		= i + i_567_ * (aClass185_Sub2_9016.anInt9356 * 356365251);
	    int i_584_ = aClass185_Sub2_9016.anInt9356 * 356365251 - i_568_;
	    if (i_567_ + i_569_ > aClass185_Sub2_9016.anInt9345 * 639238427)
		i_569_ -= (i_567_ + i_569_
			   - aClass185_Sub2_9016.anInt9345 * 639238427);
	    if (i_567_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		int i_585_ = aClass185_Sub2_9016.anInt9344 * 9823353 - i_567_;
		i_569_ -= i_585_;
		i_583_ += i_585_ * (aClass185_Sub2_9016.anInt9356 * 356365251);
		i_576_ += i_580_ * i_585_;
	    }
	    if (i + i_568_ > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		int i_586_
		    = i + i_568_ - aClass185_Sub2_9016.anInt9343 * -1807368365;
		i_568_ -= i_586_;
		i_584_ += i_586_;
	    }
	    if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		int i_587_ = aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		i_568_ -= i_587_;
		i_583_ += i_587_;
		i_575_ += i_579_ * i_587_;
		i_584_ += i_587_;
	    }
	    float[] fs = aClass185_Sub2_9016.aFloatArray9341;
	    int[] is = aClass185_Sub2_9016.anIntArray9338;
	    if (i_572_ == 0) {
		if (i_570_ == 1) {
		    int i_588_ = i_575_;
		    for (int i_589_ = -i_569_; i_589_ < 0; i_589_++) {
			int i_590_ = (i_576_ >> 16) * anInt8985;
			for (int i_591_ = -i_568_; i_591_ < 0; i_591_++) {
			    if (!bool_565_ || f < fs[i_583_]) {
				if (bool)
				    is[i_583_] = (anIntArray11415
						  [(i_575_ >> 16) + i_590_]);
				if (bool_565_ && bool_574_)
				    fs[i_583_] = f;
			    }
			    i_575_ += i_579_;
			    i_583_++;
			}
			i_576_ += i_580_;
			i_575_ = i_588_;
			i_583_ += i_584_;
		    }
		} else if (i_570_ == 0) {
		    int i_592_ = (i_571_ & 0xff0000) >> 16;
		    int i_593_ = (i_571_ & 0xff00) >> 8;
		    int i_594_ = i_571_ & 0xff;
		    int i_595_ = i_575_;
		    for (int i_596_ = -i_569_; i_596_ < 0; i_596_++) {
			int i_597_ = (i_576_ >> 16) * anInt8985;
			for (int i_598_ = -i_568_; i_598_ < 0; i_598_++) {
			    if (!bool_565_ || f < fs[i_583_]) {
				if (bool) {
				    int i_599_ = (anIntArray11415
						  [(i_575_ >> 16) + i_597_]);
				    int i_600_ = ((i_599_ & 0xff0000) * i_592_
						  & ~0xffffff);
				    int i_601_ = ((i_599_ & 0xff00) * i_593_
						  & 0xff0000);
				    int i_602_
					= (i_599_ & 0xff) * i_594_ & 0xff00;
				    is[i_583_]
					= (i_600_ | i_601_ | i_602_) >>> 8;
				}
				if (bool_565_ && bool_574_)
				    fs[i_583_] = f;
			    }
			    i_575_ += i_579_;
			    i_583_++;
			}
			i_576_ += i_580_;
			i_575_ = i_595_;
			i_583_ += i_584_;
		    }
		} else if (i_570_ == 3) {
		    int i_603_ = i_575_;
		    for (int i_604_ = -i_569_; i_604_ < 0; i_604_++) {
			int i_605_ = (i_576_ >> 16) * anInt8985;
			for (int i_606_ = -i_568_; i_606_ < 0; i_606_++) {
			    if (!bool_565_ || f < fs[i_583_]) {
				if (bool) {
				    int i_607_ = (anIntArray11415
						  [(i_575_ >> 16) + i_605_]);
				    int i_608_ = i_607_ + i_571_;
				    int i_609_ = ((i_607_ & 0xff00ff)
						  + (i_571_ & 0xff00ff));
				    int i_610_
					= ((i_609_ & 0x1000100)
					   + (i_608_ - i_609_ & 0x10000));
				    is[i_583_]
					= i_608_ - i_610_ | i_610_ - (i_610_
								      >>> 8);
				}
				if (bool_565_ && bool_574_)
				    fs[i_583_] = f;
			    }
			    i_575_ += i_579_;
			    i_583_++;
			}
			i_576_ += i_580_;
			i_575_ = i_603_;
			i_583_ += i_584_;
		    }
		} else if (i_570_ == 2) {
		    int i_611_ = i_571_ >>> 24;
		    int i_612_ = 256 - i_611_;
		    int i_613_ = (i_571_ & 0xff00ff) * i_612_ & ~0xff00ff;
		    int i_614_ = (i_571_ & 0xff00) * i_612_ & 0xff0000;
		    i_571_ = (i_613_ | i_614_) >>> 8;
		    int i_615_ = i_575_;
		    for (int i_616_ = -i_569_; i_616_ < 0; i_616_++) {
			int i_617_ = (i_576_ >> 16) * anInt8985;
			for (int i_618_ = -i_568_; i_618_ < 0; i_618_++) {
			    if (!bool_565_ || f < fs[i_583_]) {
				if (bool) {
				    int i_619_ = (anIntArray11415
						  [(i_575_ >> 16) + i_617_]);
				    i_613_ = ((i_619_ & 0xff00ff) * i_611_
					      & ~0xff00ff);
				    i_614_ = ((i_619_ & 0xff00) * i_611_
					      & 0xff0000);
				    is[i_583_]
					= ((i_613_ | i_614_) >>> 8) + i_571_;
				}
				if (bool_565_ && bool_574_)
				    fs[i_583_] = f;
			    }
			    i_575_ += i_579_;
			    i_583_++;
			}
			i_576_ += i_580_;
			i_575_ = i_615_;
			i_583_ += i_584_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_572_ == 1) {
		if (i_570_ == 1) {
		    int i_620_ = i_575_;
		    for (int i_621_ = -i_569_; i_621_ < 0; i_621_++) {
			int i_622_ = (i_576_ >> 16) * anInt8985;
			for (int i_623_ = -i_568_; i_623_ < 0; i_623_++) {
			    if (!bool_565_ || f < fs[i_583_]) {
				int i_624_
				    = anIntArray11415[(i_575_ >> 16) + i_622_];
				if (i_624_ != 0) {
				    if (bool)
					is[i_583_] = i_624_;
				    if (bool_565_ && bool_574_)
					fs[i_583_] = f;
				}
			    }
			    i_575_ += i_579_;
			    i_583_++;
			}
			i_576_ += i_580_;
			i_575_ = i_620_;
			i_583_ += i_584_;
		    }
		} else if (i_570_ == 0) {
		    int i_625_ = i_575_;
		    if ((i_571_ & 0xffffff) == 16777215) {
			int i_626_ = i_571_ >>> 24;
			int i_627_ = 256 - i_626_;
			for (int i_628_ = -i_569_; i_628_ < 0; i_628_++) {
			    int i_629_ = (i_576_ >> 16) * anInt8985;
			    for (int i_630_ = -i_568_; i_630_ < 0; i_630_++) {
				if (!bool_565_ || f < fs[i_583_]) {
				    int i_631_ = (anIntArray11415
						  [(i_575_ >> 16) + i_629_]);
				    if (i_631_ != 0) {
					if (bool) {
					    int i_632_ = is[i_583_];
					    is[i_583_]
						= (((((i_631_ & 0xff00ff)
						      * i_626_)
						     + ((i_632_ & 0xff00ff)
							* i_627_))
						    & ~0xff00ff)
						   + ((((i_631_ & 0xff00)
							* i_626_)
						       + ((i_632_ & 0xff00)
							  * i_627_))
						      & 0xff0000)) >> 8;
					}
					if (bool_565_ && bool_574_)
					    fs[i_583_] = f;
				    }
				}
				i_575_ += i_579_;
				i_583_++;
			    }
			    i_576_ += i_580_;
			    i_575_ = i_625_;
			    i_583_ += i_584_;
			}
		    } else {
			int i_633_ = (i_571_ & 0xff0000) >> 16;
			int i_634_ = (i_571_ & 0xff00) >> 8;
			int i_635_ = i_571_ & 0xff;
			int i_636_ = i_571_ >>> 24;
			int i_637_ = 256 - i_636_;
			for (int i_638_ = -i_569_; i_638_ < 0; i_638_++) {
			    int i_639_ = (i_576_ >> 16) * anInt8985;
			    for (int i_640_ = -i_568_; i_640_ < 0; i_640_++) {
				if (!bool_565_ || f < fs[i_583_]) {
				    int i_641_ = (anIntArray11415
						  [(i_575_ >> 16) + i_639_]);
				    if (i_641_ != 0) {
					if (i_636_ != 255) {
					    if (bool) {
						int i_642_
						    = (((i_641_ & 0xff0000)
							* i_633_)
						       & ~0xffffff);
						int i_643_
						    = (((i_641_ & 0xff00)
							* i_634_)
						       & 0xff0000);
						int i_644_
						    = ((i_641_ & 0xff) * i_635_
						       & 0xff00);
						i_641_ = (i_642_ | i_643_
							  | i_644_) >>> 8;
						int i_645_ = is[i_583_];
						is[i_583_]
						    = (((((i_641_ & 0xff00ff)
							  * i_636_)
							 + ((i_645_ & 0xff00ff)
							    * i_637_))
							& ~0xff00ff)
						       + ((((i_641_ & 0xff00)
							    * i_636_)
							   + ((i_645_ & 0xff00)
							      * i_637_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_565_ && bool_574_)
						fs[i_583_] = f;
					} else {
					    if (bool) {
						int i_646_
						    = (((i_641_ & 0xff0000)
							* i_633_)
						       & ~0xffffff);
						int i_647_
						    = (((i_641_ & 0xff00)
							* i_634_)
						       & 0xff0000);
						int i_648_
						    = ((i_641_ & 0xff) * i_635_
						       & 0xff00);
						is[i_583_] = (i_646_ | i_647_
							      | i_648_) >>> 8;
					    }
					    if (bool_565_ && bool_574_)
						fs[i_583_] = f;
					}
				    }
				}
				i_575_ += i_579_;
				i_583_++;
			    }
			    i_576_ += i_580_;
			    i_575_ = i_625_;
			    i_583_ += i_584_;
			}
		    }
		} else if (i_570_ == 3) {
		    int i_649_ = i_575_;
		    int i_650_ = i_571_ >>> 24;
		    int i_651_ = 256 - i_650_;
		    for (int i_652_ = -i_569_; i_652_ < 0; i_652_++) {
			int i_653_ = (i_576_ >> 16) * anInt8985;
			for (int i_654_ = -i_568_; i_654_ < 0; i_654_++) {
			    if (!bool_565_ || f < fs[i_583_]) {
				if (bool) {
				    int i_655_ = (anIntArray11415
						  [(i_575_ >> 16) + i_653_]);
				    int i_656_ = i_655_ + i_571_;
				    int i_657_ = ((i_655_ & 0xff00ff)
						  + (i_571_ & 0xff00ff));
				    int i_658_
					= ((i_657_ & 0x1000100)
					   + (i_656_ - i_657_ & 0x10000));
				    i_658_
					= i_656_ - i_658_ | i_658_ - (i_658_
								      >>> 8);
				    if (i_655_ == 0 && i_650_ != 255) {
					i_655_ = i_658_;
					i_658_ = is[i_583_];
					i_658_
					    = ((((i_655_ & 0xff00ff) * i_650_
						 + ((i_658_ & 0xff00ff)
						    * i_651_))
						& ~0xff00ff)
					       + (((i_655_ & 0xff00) * i_650_
						   + ((i_658_ & 0xff00)
						      * i_651_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_583_] = i_658_;
				}
				if (bool_565_ && bool_574_)
				    fs[i_583_] = f;
			    }
			    i_575_ += i_579_;
			    i_583_++;
			}
			i_576_ += i_580_;
			i_575_ = i_649_;
			i_583_ += i_584_;
		    }
		} else if (i_570_ == 2) {
		    int i_659_ = i_571_ >>> 24;
		    int i_660_ = 256 - i_659_;
		    int i_661_ = (i_571_ & 0xff00ff) * i_660_ & ~0xff00ff;
		    int i_662_ = (i_571_ & 0xff00) * i_660_ & 0xff0000;
		    i_571_ = (i_661_ | i_662_) >>> 8;
		    int i_663_ = i_575_;
		    for (int i_664_ = -i_569_; i_664_ < 0; i_664_++) {
			int i_665_ = (i_576_ >> 16) * anInt8985;
			for (int i_666_ = -i_568_; i_666_ < 0; i_666_++) {
			    if (!bool_565_ || f < fs[i_583_]) {
				int i_667_
				    = anIntArray11415[(i_575_ >> 16) + i_665_];
				if (i_667_ != 0) {
				    if (bool) {
					i_661_ = ((i_667_ & 0xff00ff) * i_659_
						  & ~0xff00ff);
					i_662_ = ((i_667_ & 0xff00) * i_659_
						  & 0xff0000);
					is[i_583_] = (((i_661_ | i_662_) >>> 8)
						      + i_571_);
				    }
				    if (bool_565_ && bool_574_)
					fs[i_583_] = f;
				}
			    }
			    i_575_ += i_579_;
			    i_583_++;
			}
			i_576_ += i_580_;
			i_575_ = i_663_;
			i_583_ += i_584_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_572_ == 2) {
		if (i_570_ == 1) {
		    int i_668_ = i_575_;
		    for (int i_669_ = -i_569_; i_669_ < 0; i_669_++) {
			int i_670_ = (i_576_ >> 16) * anInt8985;
			for (int i_671_ = -i_568_; i_671_ < 0; i_671_++) {
			    if (!bool_565_ || f < fs[i_583_]) {
				int i_672_
				    = anIntArray11415[(i_575_ >> 16) + i_670_];
				if (i_672_ != 0) {
				    if (bool) {
					int i_673_ = is[i_583_];
					int i_674_ = i_672_ + i_673_;
					int i_675_ = ((i_672_ & 0xff00ff)
						      + (i_673_ & 0xff00ff));
					i_673_
					    = ((i_675_ & 0x1000100)
					       + (i_674_ - i_675_ & 0x10000));
					is[i_583_]
					    = (i_674_ - i_673_
					       | i_673_ - (i_673_ >>> 8));
				    }
				    if (bool_565_ && bool_574_)
					fs[i_583_] = f;
				}
			    }
			    i_575_ += i_579_;
			    i_583_++;
			}
			i_576_ += i_580_;
			i_575_ = i_668_;
			i_583_ += i_584_;
		    }
		} else if (i_570_ == 0) {
		    int i_676_ = i_575_;
		    int i_677_ = (i_571_ & 0xff0000) >> 16;
		    int i_678_ = (i_571_ & 0xff00) >> 8;
		    int i_679_ = i_571_ & 0xff;
		    for (int i_680_ = -i_569_; i_680_ < 0; i_680_++) {
			int i_681_ = (i_576_ >> 16) * anInt8985;
			for (int i_682_ = -i_568_; i_682_ < 0; i_682_++) {
			    if (!bool_565_ || f < fs[i_583_]) {
				int i_683_
				    = anIntArray11415[(i_575_ >> 16) + i_681_];
				if (i_683_ != 0) {
				    if (bool) {
					int i_684_
					    = ((i_683_ & 0xff0000) * i_677_
					       & ~0xffffff);
					int i_685_
					    = ((i_683_ & 0xff00) * i_678_
					       & 0xff0000);
					int i_686_ = ((i_683_ & 0xff) * i_679_
						      & 0xff00);
					i_683_
					    = (i_684_ | i_685_ | i_686_) >>> 8;
					int i_687_ = is[i_583_];
					int i_688_ = i_683_ + i_687_;
					int i_689_ = ((i_683_ & 0xff00ff)
						      + (i_687_ & 0xff00ff));
					i_687_
					    = ((i_689_ & 0x1000100)
					       + (i_688_ - i_689_ & 0x10000));
					is[i_583_]
					    = (i_688_ - i_687_
					       | i_687_ - (i_687_ >>> 8));
				    }
				    if (bool_565_ && bool_574_)
					fs[i_583_] = f;
				}
			    }
			    i_575_ += i_579_;
			    i_583_++;
			}
			i_576_ += i_580_;
			i_575_ = i_676_;
			i_583_ += i_584_;
		    }
		} else if (i_570_ == 3) {
		    int i_690_ = i_575_;
		    for (int i_691_ = -i_569_; i_691_ < 0; i_691_++) {
			int i_692_ = (i_576_ >> 16) * anInt8985;
			for (int i_693_ = -i_568_; i_693_ < 0; i_693_++) {
			    if (!bool_565_ || f < fs[i_583_]) {
				if (bool) {
				    int i_694_ = (anIntArray11415
						  [(i_575_ >> 16) + i_692_]);
				    int i_695_ = i_694_ + i_571_;
				    int i_696_ = ((i_694_ & 0xff00ff)
						  + (i_571_ & 0xff00ff));
				    int i_697_
					= ((i_696_ & 0x1000100)
					   + (i_695_ - i_696_ & 0x10000));
				    i_694_
					= i_695_ - i_697_ | i_697_ - (i_697_
								      >>> 8);
				    i_697_ = is[i_583_];
				    i_695_ = i_694_ + i_697_;
				    i_696_
					= (i_694_ & 0xff00ff) + (i_697_
								 & 0xff00ff);
				    i_697_ = ((i_696_ & 0x1000100)
					      + (i_695_ - i_696_ & 0x10000));
				    is[i_583_]
					= i_695_ - i_697_ | i_697_ - (i_697_
								      >>> 8);
				}
				if (bool_565_ && bool_574_)
				    fs[i_583_] = f;
			    }
			    i_575_ += i_579_;
			    i_583_++;
			}
			i_576_ += i_580_;
			i_575_ = i_690_;
			i_583_ += i_584_;
		    }
		} else if (i_570_ == 2) {
		    int i_698_ = i_571_ >>> 24;
		    int i_699_ = 256 - i_698_;
		    int i_700_ = (i_571_ & 0xff00ff) * i_699_ & ~0xff00ff;
		    int i_701_ = (i_571_ & 0xff00) * i_699_ & 0xff0000;
		    i_571_ = (i_700_ | i_701_) >>> 8;
		    int i_702_ = i_575_;
		    for (int i_703_ = -i_569_; i_703_ < 0; i_703_++) {
			int i_704_ = (i_576_ >> 16) * anInt8985;
			for (int i_705_ = -i_568_; i_705_ < 0; i_705_++) {
			    if (!bool_565_ || f < fs[i_583_]) {
				int i_706_
				    = anIntArray11415[(i_575_ >> 16) + i_704_];
				if (i_706_ != 0) {
				    if (bool) {
					i_700_ = ((i_706_ & 0xff00ff) * i_698_
						  & ~0xff00ff);
					i_701_ = ((i_706_ & 0xff00) * i_698_
						  & 0xff0000);
					i_706_ = (((i_700_ | i_701_) >>> 8)
						  + i_571_);
					int i_707_ = is[i_583_];
					int i_708_ = i_706_ + i_707_;
					int i_709_ = ((i_706_ & 0xff00ff)
						      + (i_707_ & 0xff00ff));
					i_707_
					    = ((i_709_ & 0x1000100)
					       + (i_708_ - i_709_ & 0x10000));
					is[i_583_]
					    = (i_708_ - i_707_
					       | i_707_ - (i_707_ >>> 8));
				    }
				    if (bool_565_ && bool_574_)
					fs[i_583_] = f;
				}
			    }
			    i_575_ += i_579_;
			    i_583_++;
			}
			i_576_ += i_580_;
			i_575_ = i_702_;
			i_583_ += i_584_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method14512(int i, int i_710_) {
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    if (anInt9001 == 0) {
		if (anInt9000 == 0) {
		    int i_711_ = anInt8998;
		    while (i_711_ < 0) {
			int i_712_ = anInt8988;
			int i_713_ = anInt9007;
			int i_714_ = anInt9003;
			int i_715_ = anInt8999;
			if (i_713_ >= 0 && i_714_ >= 0
			    && i_713_ - (anInt8985 << 12) < 0
			    && i_714_ - (anInt9002 << 12) < 0) {
			    for (/**/; i_715_ < 0; i_715_++)
				method17952(((i_714_ >> 12) * anInt8985
					     + (i_713_ >> 12)),
					    i_712_++, is, i, i_710_);
			}
			i_711_++;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_716_ = anInt8998;
		    while (i_716_ < 0) {
			int i_717_ = anInt8988;
			int i_718_ = anInt9007;
			int i_719_ = anInt9003 + anInt9010;
			int i_720_ = anInt8999;
			if (i_718_ >= 0 && i_718_ - (anInt8985 << 12) < 0) {
			    int i_721_;
			    if ((i_721_ = i_719_ - (anInt9002 << 12)) >= 0) {
				i_721_ = (anInt9000 - i_721_) / anInt9000;
				i_720_ += i_721_;
				i_719_ += anInt9000 * i_721_;
				i_717_ += i_721_;
			    }
			    if ((i_721_ = (i_719_ - anInt9000) / anInt9000)
				> i_720_)
				i_720_ = i_721_;
			    for (/**/; i_720_ < 0; i_720_++) {
				method17952(((i_719_ >> 12) * anInt8985
					     + (i_718_ >> 12)),
					    i_717_++, is, i, i_710_);
				i_719_ += anInt9000;
			    }
			}
			i_716_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_722_ = anInt8998;
		    while (i_722_ < 0) {
			int i_723_ = anInt8988;
			int i_724_ = anInt9007;
			int i_725_ = anInt9003 + anInt9010;
			int i_726_ = anInt8999;
			if (i_724_ >= 0 && i_724_ - (anInt8985 << 12) < 0) {
			    if (i_725_ < 0) {
				int i_727_
				    = (anInt9000 - 1 - i_725_) / anInt9000;
				i_726_ += i_727_;
				i_725_ += anInt9000 * i_727_;
				i_723_ += i_727_;
			    }
			    int i_728_;
			    if ((i_728_ = (1 + i_725_ - (anInt9002 << 12)
					   - anInt9000) / anInt9000)
				> i_726_)
				i_726_ = i_728_;
			    for (/**/; i_726_ < 0; i_726_++) {
				method17952(((i_725_ >> 12) * anInt8985
					     + (i_724_ >> 12)),
					    i_723_++, is, i, i_710_);
				i_725_ += anInt9000;
			    }
			}
			i_722_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9001 < 0) {
		if (anInt9000 == 0) {
		    int i_729_ = anInt8998;
		    while (i_729_ < 0) {
			int i_730_ = anInt8988;
			int i_731_ = anInt9007 + anInt9009;
			int i_732_ = anInt9003;
			int i_733_ = anInt8999;
			if (i_732_ >= 0 && i_732_ - (anInt9002 << 12) < 0) {
			    int i_734_;
			    if ((i_734_ = i_731_ - (anInt8985 << 12)) >= 0) {
				i_734_ = (anInt9001 - i_734_) / anInt9001;
				i_733_ += i_734_;
				i_731_ += anInt9001 * i_734_;
				i_730_ += i_734_;
			    }
			    if ((i_734_ = (i_731_ - anInt9001) / anInt9001)
				> i_733_)
				i_733_ = i_734_;
			    for (/**/; i_733_ < 0; i_733_++) {
				method17952(((i_732_ >> 12) * anInt8985
					     + (i_731_ >> 12)),
					    i_730_++, is, i, i_710_);
				i_731_ += anInt9001;
			    }
			}
			i_729_++;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_735_ = anInt8998;
		    while (i_735_ < 0) {
			int i_736_ = anInt8988;
			int i_737_ = anInt9007 + anInt9009;
			int i_738_ = anInt9003 + anInt9010;
			int i_739_ = anInt8999;
			int i_740_;
			if ((i_740_ = i_737_ - (anInt8985 << 12)) >= 0) {
			    i_740_ = (anInt9001 - i_740_) / anInt9001;
			    i_739_ += i_740_;
			    i_737_ += anInt9001 * i_740_;
			    i_738_ += anInt9000 * i_740_;
			    i_736_ += i_740_;
			}
			if ((i_740_ = (i_737_ - anInt9001) / anInt9001)
			    > i_739_)
			    i_739_ = i_740_;
			if ((i_740_ = i_738_ - (anInt9002 << 12)) >= 0) {
			    i_740_ = (anInt9000 - i_740_) / anInt9000;
			    i_739_ += i_740_;
			    i_737_ += anInt9001 * i_740_;
			    i_738_ += anInt9000 * i_740_;
			    i_736_ += i_740_;
			}
			if ((i_740_ = (i_738_ - anInt9000) / anInt9000)
			    > i_739_)
			    i_739_ = i_740_;
			for (/**/; i_739_ < 0; i_739_++) {
			    method17952((i_738_ >> 12) * anInt8985 + (i_737_
								      >> 12),
					i_736_++, is, i, i_710_);
			    i_737_ += anInt9001;
			    i_738_ += anInt9000;
			}
			i_735_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_741_ = anInt8998;
		    while (i_741_ < 0) {
			int i_742_ = anInt8988;
			int i_743_ = anInt9007 + anInt9009;
			int i_744_ = anInt9003 + anInt9010;
			int i_745_ = anInt8999;
			int i_746_;
			if ((i_746_ = i_743_ - (anInt8985 << 12)) >= 0) {
			    i_746_ = (anInt9001 - i_746_) / anInt9001;
			    i_745_ += i_746_;
			    i_743_ += anInt9001 * i_746_;
			    i_744_ += anInt9000 * i_746_;
			    i_742_ += i_746_;
			}
			if ((i_746_ = (i_743_ - anInt9001) / anInt9001)
			    > i_745_)
			    i_745_ = i_746_;
			if (i_744_ < 0) {
			    i_746_ = (anInt9000 - 1 - i_744_) / anInt9000;
			    i_745_ += i_746_;
			    i_743_ += anInt9001 * i_746_;
			    i_744_ += anInt9000 * i_746_;
			    i_742_ += i_746_;
			}
			if ((i_746_ = (1 + i_744_ - (anInt9002 << 12)
				       - anInt9000) / anInt9000)
			    > i_745_)
			    i_745_ = i_746_;
			for (/**/; i_745_ < 0; i_745_++) {
			    method17952((i_744_ >> 12) * anInt8985 + (i_743_
								      >> 12),
					i_742_++, is, i, i_710_);
			    i_743_ += anInt9001;
			    i_744_ += anInt9000;
			}
			i_741_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9000 == 0) {
		int i_747_ = anInt8998;
		while (i_747_ < 0) {
		    int i_748_ = anInt8988;
		    int i_749_ = anInt9007 + anInt9009;
		    int i_750_ = anInt9003;
		    int i_751_ = anInt8999;
		    if (i_750_ >= 0 && i_750_ - (anInt9002 << 12) < 0) {
			if (i_749_ < 0) {
			    int i_752_ = (anInt9001 - 1 - i_749_) / anInt9001;
			    i_751_ += i_752_;
			    i_749_ += anInt9001 * i_752_;
			    i_748_ += i_752_;
			}
			int i_753_;
			if ((i_753_ = (1 + i_749_ - (anInt8985 << 12)
				       - anInt9001) / anInt9001)
			    > i_751_)
			    i_751_ = i_753_;
			for (/**/; i_751_ < 0; i_751_++) {
			    method17952((i_750_ >> 12) * anInt8985 + (i_749_
								      >> 12),
					i_748_++, is, i, i_710_);
			    i_749_ += anInt9001;
			}
		    }
		    i_747_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else if (anInt9000 < 0) {
		for (int i_754_ = anInt8998; i_754_ < 0; i_754_++) {
		    int i_755_ = anInt8988;
		    int i_756_ = anInt9007 + anInt9009;
		    int i_757_ = anInt9003 + anInt9010;
		    int i_758_ = anInt8999;
		    if (i_756_ < 0) {
			int i_759_ = (anInt9001 - 1 - i_756_) / anInt9001;
			i_758_ += i_759_;
			i_756_ += anInt9001 * i_759_;
			i_757_ += anInt9000 * i_759_;
			i_755_ += i_759_;
		    }
		    int i_760_;
		    if ((i_760_ = ((1 + i_756_ - (anInt8985 << 12) - anInt9001)
				   / anInt9001))
			> i_758_)
			i_758_ = i_760_;
		    if ((i_760_ = i_757_ - (anInt9002 << 12)) >= 0) {
			i_760_ = (anInt9000 - i_760_) / anInt9000;
			i_758_ += i_760_;
			i_756_ += anInt9001 * i_760_;
			i_757_ += anInt9000 * i_760_;
			i_755_ += i_760_;
		    }
		    if ((i_760_ = (i_757_ - anInt9000) / anInt9000) > i_758_)
			i_758_ = i_760_;
		    for (/**/; i_758_ < 0; i_758_++) {
			method17952((i_757_ >> 12) * anInt8985 + (i_756_
								  >> 12),
				    i_755_++, is, i, i_710_);
			i_756_ += anInt9001;
			i_757_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else {
		for (int i_761_ = anInt8998; i_761_ < 0; i_761_++) {
		    int i_762_ = anInt8988;
		    int i_763_ = anInt9007 + anInt9009;
		    int i_764_ = anInt9003 + anInt9010;
		    int i_765_ = anInt8999;
		    if (i_763_ < 0) {
			int i_766_ = (anInt9001 - 1 - i_763_) / anInt9001;
			i_765_ += i_766_;
			i_763_ += anInt9001 * i_766_;
			i_764_ += anInt9000 * i_766_;
			i_762_ += i_766_;
		    }
		    int i_767_;
		    if ((i_767_ = ((1 + i_763_ - (anInt8985 << 12) - anInt9001)
				   / anInt9001))
			> i_765_)
			i_765_ = i_767_;
		    if (i_764_ < 0) {
			i_767_ = (anInt9000 - 1 - i_764_) / anInt9000;
			i_765_ += i_767_;
			i_763_ += anInt9001 * i_767_;
			i_764_ += anInt9000 * i_767_;
			i_762_ += i_767_;
		    }
		    if ((i_767_ = ((1 + i_764_ - (anInt9002 << 12) - anInt9000)
				   / anInt9000))
			> i_765_)
			i_765_ = i_767_;
		    for (/**/; i_765_ < 0; i_765_++) {
			method17952((i_764_ >> 12) * anInt8985 + (i_763_
								  >> 12),
				    i_762_++, is, i, i_710_);
			i_763_ += anInt9001;
			i_764_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    }
	}
    }
    
    void method14514(int[] is, int[] is_768_, int i, int i_769_) {
	int[] is_770_ = aClass185_Sub2_9016.anIntArray9338;
	if (is_770_ != null) {
	    if (anInt9001 == 0) {
		if (anInt9000 == 0) {
		    int i_771_ = anInt8998;
		    while (i_771_ < 0) {
			int i_772_ = i_771_ + i_769_;
			if (i_772_ >= 0) {
			    if (i_772_ >= is.length)
				break;
			    int i_773_ = anInt8988;
			    int i_774_ = anInt9007;
			    int i_775_ = anInt9003;
			    int i_776_ = anInt8999;
			    if (i_774_ >= 0 && i_775_ >= 0
				&& i_774_ - (anInt8985 << 12) < 0
				&& i_775_ - (anInt9002 << 12) < 0) {
				int i_777_ = is[i_772_] - i;
				int i_778_ = -is_768_[i_772_];
				int i_779_ = i_777_ - (i_773_ - anInt8988);
				if (i_779_ > 0) {
				    i_773_ += i_779_;
				    i_776_ += i_779_;
				    i_774_ += anInt9001 * i_779_;
				    i_775_ += anInt9000 * i_779_;
				} else
				    i_778_ -= i_779_;
				if (i_776_ < i_778_)
				    i_776_ = i_778_;
				for (/**/; i_776_ < 0; i_776_++) {
				    int i_780_ = (anIntArray11415
						  [((i_775_ >> 12) * anInt8985
						    + (i_774_ >> 12))]);
				    if (i_780_ != 0)
					is_770_[i_773_++] = i_780_;
				    else
					i_773_++;
				}
			    }
			}
			i_771_++;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_781_ = anInt8998;
		    while (i_781_ < 0) {
			int i_782_ = i_781_ + i_769_;
			if (i_782_ >= 0) {
			    if (i_782_ >= is.length)
				break;
			    int i_783_ = anInt8988;
			    int i_784_ = anInt9007;
			    int i_785_ = anInt9003 + anInt9010;
			    int i_786_ = anInt8999;
			    if (i_784_ >= 0
				&& i_784_ - (anInt8985 << 12) < 0) {
				int i_787_;
				if ((i_787_ = i_785_ - (anInt9002 << 12))
				    >= 0) {
				    i_787_ = (anInt9000 - i_787_) / anInt9000;
				    i_786_ += i_787_;
				    i_785_ += anInt9000 * i_787_;
				    i_783_ += i_787_;
				}
				if ((i_787_ = (i_785_ - anInt9000) / anInt9000)
				    > i_786_)
				    i_786_ = i_787_;
				int i_788_ = is[i_782_] - i;
				int i_789_ = -is_768_[i_782_];
				int i_790_ = i_788_ - (i_783_ - anInt8988);
				if (i_790_ > 0) {
				    i_783_ += i_790_;
				    i_786_ += i_790_;
				    i_784_ += anInt9001 * i_790_;
				    i_785_ += anInt9000 * i_790_;
				} else
				    i_789_ -= i_790_;
				if (i_786_ < i_789_)
				    i_786_ = i_789_;
				for (/**/; i_786_ < 0; i_786_++) {
				    int i_791_ = (anIntArray11415
						  [((i_785_ >> 12) * anInt8985
						    + (i_784_ >> 12))]);
				    if (i_791_ != 0)
					is_770_[i_783_++] = i_791_;
				    else
					i_783_++;
				    i_785_ += anInt9000;
				}
			    }
			}
			i_781_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_792_ = anInt8998;
		    while (i_792_ < 0) {
			int i_793_ = i_792_ + i_769_;
			if (i_793_ >= 0) {
			    if (i_793_ >= is.length)
				break;
			    int i_794_ = anInt8988;
			    int i_795_ = anInt9007;
			    int i_796_ = anInt9003 + anInt9010;
			    int i_797_ = anInt8999;
			    if (i_795_ >= 0
				&& i_795_ - (anInt8985 << 12) < 0) {
				if (i_796_ < 0) {
				    int i_798_
					= (anInt9000 - 1 - i_796_) / anInt9000;
				    i_797_ += i_798_;
				    i_796_ += anInt9000 * i_798_;
				    i_794_ += i_798_;
				}
				int i_799_;
				if ((i_799_ = (1 + i_796_ - (anInt9002 << 12)
					       - anInt9000) / anInt9000)
				    > i_797_)
				    i_797_ = i_799_;
				int i_800_ = is[i_793_] - i;
				int i_801_ = -is_768_[i_793_];
				int i_802_ = i_800_ - (i_794_ - anInt8988);
				if (i_802_ > 0) {
				    i_794_ += i_802_;
				    i_797_ += i_802_;
				    i_795_ += anInt9001 * i_802_;
				    i_796_ += anInt9000 * i_802_;
				} else
				    i_801_ -= i_802_;
				if (i_797_ < i_801_)
				    i_797_ = i_801_;
				for (/**/; i_797_ < 0; i_797_++) {
				    int i_803_ = (anIntArray11415
						  [((i_796_ >> 12) * anInt8985
						    + (i_795_ >> 12))]);
				    if (i_803_ != 0)
					is_770_[i_794_++] = i_803_;
				    else
					i_794_++;
				    i_796_ += anInt9000;
				}
			    }
			}
			i_792_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9001 < 0) {
		if (anInt9000 == 0) {
		    int i_804_ = anInt8998;
		    while (i_804_ < 0) {
			int i_805_ = i_804_ + i_769_;
			if (i_805_ >= 0) {
			    if (i_805_ >= is.length)
				break;
			    int i_806_ = anInt8988;
			    int i_807_ = anInt9007 + anInt9009;
			    int i_808_ = anInt9003;
			    int i_809_ = anInt8999;
			    if (i_808_ >= 0
				&& i_808_ - (anInt9002 << 12) < 0) {
				int i_810_;
				if ((i_810_ = i_807_ - (anInt8985 << 12))
				    >= 0) {
				    i_810_ = (anInt9001 - i_810_) / anInt9001;
				    i_809_ += i_810_;
				    i_807_ += anInt9001 * i_810_;
				    i_806_ += i_810_;
				}
				if ((i_810_ = (i_807_ - anInt9001) / anInt9001)
				    > i_809_)
				    i_809_ = i_810_;
				int i_811_ = is[i_805_] - i;
				int i_812_ = -is_768_[i_805_];
				int i_813_ = i_811_ - (i_806_ - anInt8988);
				if (i_813_ > 0) {
				    i_806_ += i_813_;
				    i_809_ += i_813_;
				    i_807_ += anInt9001 * i_813_;
				    i_808_ += anInt9000 * i_813_;
				} else
				    i_812_ -= i_813_;
				if (i_809_ < i_812_)
				    i_809_ = i_812_;
				for (/**/; i_809_ < 0; i_809_++) {
				    int i_814_ = (anIntArray11415
						  [((i_808_ >> 12) * anInt8985
						    + (i_807_ >> 12))]);
				    if (i_814_ != 0)
					is_770_[i_806_++] = i_814_;
				    else
					i_806_++;
				    i_807_ += anInt9001;
				}
			    }
			}
			i_804_++;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_815_ = anInt8998;
		    while (i_815_ < 0) {
			int i_816_ = i_815_ + i_769_;
			if (i_816_ >= 0) {
			    if (i_816_ >= is.length)
				break;
			    int i_817_ = anInt8988;
			    int i_818_ = anInt9007 + anInt9009;
			    int i_819_ = anInt9003 + anInt9010;
			    int i_820_ = anInt8999;
			    int i_821_;
			    if ((i_821_ = i_818_ - (anInt8985 << 12)) >= 0) {
				i_821_ = (anInt9001 - i_821_) / anInt9001;
				i_820_ += i_821_;
				i_818_ += anInt9001 * i_821_;
				i_819_ += anInt9000 * i_821_;
				i_817_ += i_821_;
			    }
			    if ((i_821_ = (i_818_ - anInt9001) / anInt9001)
				> i_820_)
				i_820_ = i_821_;
			    if ((i_821_ = i_819_ - (anInt9002 << 12)) >= 0) {
				i_821_ = (anInt9000 - i_821_) / anInt9000;
				i_820_ += i_821_;
				i_818_ += anInt9001 * i_821_;
				i_819_ += anInt9000 * i_821_;
				i_817_ += i_821_;
			    }
			    if ((i_821_ = (i_819_ - anInt9000) / anInt9000)
				> i_820_)
				i_820_ = i_821_;
			    int i_822_ = is[i_816_] - i;
			    int i_823_ = -is_768_[i_816_];
			    int i_824_ = i_822_ - (i_817_ - anInt8988);
			    if (i_824_ > 0) {
				i_817_ += i_824_;
				i_820_ += i_824_;
				i_818_ += anInt9001 * i_824_;
				i_819_ += anInt9000 * i_824_;
			    } else
				i_823_ -= i_824_;
			    if (i_820_ < i_823_)
				i_820_ = i_823_;
			    for (/**/; i_820_ < 0; i_820_++) {
				int i_825_
				    = (anIntArray11415
				       [(i_819_ >> 12) * anInt8985 + (i_818_
								      >> 12)]);
				if (i_825_ != 0)
				    is_770_[i_817_++] = i_825_;
				else
				    i_817_++;
				i_818_ += anInt9001;
				i_819_ += anInt9000;
			    }
			}
			i_815_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_826_ = anInt8998;
		    while (i_826_ < 0) {
			int i_827_ = i_826_ + i_769_;
			if (i_827_ >= 0) {
			    if (i_827_ >= is.length)
				break;
			    int i_828_ = anInt8988;
			    int i_829_ = anInt9007 + anInt9009;
			    int i_830_ = anInt9003 + anInt9010;
			    int i_831_ = anInt8999;
			    int i_832_;
			    if ((i_832_ = i_829_ - (anInt8985 << 12)) >= 0) {
				i_832_ = (anInt9001 - i_832_) / anInt9001;
				i_831_ += i_832_;
				i_829_ += anInt9001 * i_832_;
				i_830_ += anInt9000 * i_832_;
				i_828_ += i_832_;
			    }
			    if ((i_832_ = (i_829_ - anInt9001) / anInt9001)
				> i_831_)
				i_831_ = i_832_;
			    if (i_830_ < 0) {
				i_832_ = (anInt9000 - 1 - i_830_) / anInt9000;
				i_831_ += i_832_;
				i_829_ += anInt9001 * i_832_;
				i_830_ += anInt9000 * i_832_;
				i_828_ += i_832_;
			    }
			    if ((i_832_ = (1 + i_830_ - (anInt9002 << 12)
					   - anInt9000) / anInt9000)
				> i_831_)
				i_831_ = i_832_;
			    int i_833_ = is[i_827_] - i;
			    int i_834_ = -is_768_[i_827_];
			    int i_835_ = i_833_ - (i_828_ - anInt8988);
			    if (i_835_ > 0) {
				i_828_ += i_835_;
				i_831_ += i_835_;
				i_829_ += anInt9001 * i_835_;
				i_830_ += anInt9000 * i_835_;
			    } else
				i_834_ -= i_835_;
			    if (i_831_ < i_834_)
				i_831_ = i_834_;
			    for (/**/; i_831_ < 0; i_831_++) {
				int i_836_
				    = (anIntArray11415
				       [(i_830_ >> 12) * anInt8985 + (i_829_
								      >> 12)]);
				if (i_836_ != 0)
				    is_770_[i_828_++] = i_836_;
				else
				    i_828_++;
				i_829_ += anInt9001;
				i_830_ += anInt9000;
			    }
			}
			i_826_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9000 == 0) {
		int i_837_ = anInt8998;
		while (i_837_ < 0) {
		    int i_838_ = i_837_ + i_769_;
		    if (i_838_ >= 0) {
			if (i_838_ >= is.length)
			    break;
			int i_839_ = anInt8988;
			int i_840_ = anInt9007 + anInt9009;
			int i_841_ = anInt9003;
			int i_842_ = anInt8999;
			if (i_841_ >= 0 && i_841_ - (anInt9002 << 12) < 0) {
			    if (i_840_ < 0) {
				int i_843_
				    = (anInt9001 - 1 - i_840_) / anInt9001;
				i_842_ += i_843_;
				i_840_ += anInt9001 * i_843_;
				i_839_ += i_843_;
			    }
			    int i_844_;
			    if ((i_844_ = (1 + i_840_ - (anInt8985 << 12)
					   - anInt9001) / anInt9001)
				> i_842_)
				i_842_ = i_844_;
			    int i_845_ = is[i_838_] - i;
			    int i_846_ = -is_768_[i_838_];
			    int i_847_ = i_845_ - (i_839_ - anInt8988);
			    if (i_847_ > 0) {
				i_839_ += i_847_;
				i_842_ += i_847_;
				i_840_ += anInt9001 * i_847_;
				i_841_ += anInt9000 * i_847_;
			    } else
				i_846_ -= i_847_;
			    if (i_842_ < i_846_)
				i_842_ = i_846_;
			    for (/**/; i_842_ < 0; i_842_++) {
				int i_848_
				    = (anIntArray11415
				       [(i_841_ >> 12) * anInt8985 + (i_840_
								      >> 12)]);
				if (i_848_ != 0)
				    is_770_[i_839_++] = i_848_;
				else
				    i_839_++;
				i_840_ += anInt9001;
			    }
			}
		    }
		    i_837_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else if (anInt9000 < 0) {
		int i_849_ = anInt8998;
		while (i_849_ < 0) {
		    int i_850_ = i_849_ + i_769_;
		    if (i_850_ >= 0) {
			if (i_850_ >= is.length)
			    break;
			int i_851_ = anInt8988;
			int i_852_ = anInt9007 + anInt9009;
			int i_853_ = anInt9003 + anInt9010;
			int i_854_ = anInt8999;
			if (i_852_ < 0) {
			    int i_855_ = (anInt9001 - 1 - i_852_) / anInt9001;
			    i_854_ += i_855_;
			    i_852_ += anInt9001 * i_855_;
			    i_853_ += anInt9000 * i_855_;
			    i_851_ += i_855_;
			}
			int i_856_;
			if ((i_856_ = (1 + i_852_ - (anInt8985 << 12)
				       - anInt9001) / anInt9001)
			    > i_854_)
			    i_854_ = i_856_;
			if ((i_856_ = i_853_ - (anInt9002 << 12)) >= 0) {
			    i_856_ = (anInt9000 - i_856_) / anInt9000;
			    i_854_ += i_856_;
			    i_852_ += anInt9001 * i_856_;
			    i_853_ += anInt9000 * i_856_;
			    i_851_ += i_856_;
			}
			if ((i_856_ = (i_853_ - anInt9000) / anInt9000)
			    > i_854_)
			    i_854_ = i_856_;
			int i_857_ = is[i_850_] - i;
			int i_858_ = -is_768_[i_850_];
			int i_859_ = i_857_ - (i_851_ - anInt8988);
			if (i_859_ > 0) {
			    i_851_ += i_859_;
			    i_854_ += i_859_;
			    i_852_ += anInt9001 * i_859_;
			    i_853_ += anInt9000 * i_859_;
			} else
			    i_858_ -= i_859_;
			if (i_854_ < i_858_)
			    i_854_ = i_858_;
			for (/**/; i_854_ < 0; i_854_++) {
			    int i_860_
				= (anIntArray11415
				   [(i_853_ >> 12) * anInt8985 + (i_852_
								  >> 12)]);
			    if (i_860_ != 0)
				is_770_[i_851_++] = i_860_;
			    else
				i_851_++;
			    i_852_ += anInt9001;
			    i_853_ += anInt9000;
			}
		    }
		    i_849_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else {
		int i_861_ = anInt8998;
		while (i_861_ < 0) {
		    int i_862_ = i_861_ + i_769_;
		    if (i_862_ >= 0) {
			if (i_862_ >= is.length)
			    break;
			int i_863_ = anInt8988;
			int i_864_ = anInt9007 + anInt9009;
			int i_865_ = anInt9003 + anInt9010;
			int i_866_ = anInt8999;
			if (i_864_ < 0) {
			    int i_867_ = (anInt9001 - 1 - i_864_) / anInt9001;
			    i_866_ += i_867_;
			    i_864_ += anInt9001 * i_867_;
			    i_865_ += anInt9000 * i_867_;
			    i_863_ += i_867_;
			}
			int i_868_;
			if ((i_868_ = (1 + i_864_ - (anInt8985 << 12)
				       - anInt9001) / anInt9001)
			    > i_866_)
			    i_866_ = i_868_;
			if (i_865_ < 0) {
			    i_868_ = (anInt9000 - 1 - i_865_) / anInt9000;
			    i_866_ += i_868_;
			    i_864_ += anInt9001 * i_868_;
			    i_865_ += anInt9000 * i_868_;
			    i_863_ += i_868_;
			}
			if ((i_868_ = (1 + i_865_ - (anInt9002 << 12)
				       - anInt9000) / anInt9000)
			    > i_866_)
			    i_866_ = i_868_;
			int i_869_ = is[i_862_] - i;
			int i_870_ = -is_768_[i_862_];
			int i_871_ = i_869_ - (i_863_ - anInt8988);
			if (i_871_ > 0) {
			    i_863_ += i_871_;
			    i_866_ += i_871_;
			    i_864_ += anInt9001 * i_871_;
			    i_865_ += anInt9000 * i_871_;
			} else
			    i_870_ -= i_871_;
			if (i_866_ < i_870_)
			    i_866_ = i_870_;
			for (/**/; i_866_ < 0; i_866_++) {
			    int i_872_
				= (anIntArray11415
				   [(i_865_ >> 12) * anInt8985 + (i_864_
								  >> 12)]);
			    if (i_872_ != 0)
				is_770_[i_863_++] = i_872_;
			    else
				i_863_++;
			    i_864_ += anInt9001;
			    i_865_ += anInt9000;
			}
		    }
		    i_861_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    }
	}
    }
    
    void method17952(int i, int i_873_, int[] is, int i_874_, int i_875_) {
	if (i_875_ == 0) {
	    if (i_874_ == 1)
		is[i_873_] = anIntArray11415[i];
	    else if (i_874_ == 0) {
		int i_876_ = anIntArray11415[i++];
		int i_877_ = (i_876_ & 0xff0000) * anInt9014 & ~0xffffff;
		int i_878_ = (i_876_ & 0xff00) * anInt9015 & 0xff0000;
		int i_879_ = (i_876_ & 0xff) * anInt9018 & 0xff00;
		is[i_873_] = (i_877_ | i_878_ | i_879_) >>> 8;
	    } else if (i_874_ == 3) {
		int i_880_ = anIntArray11415[i++];
		int i_881_ = anInt9011;
		int i_882_ = i_880_ + i_881_;
		int i_883_ = (i_880_ & 0xff00ff) + (i_881_ & 0xff00ff);
		int i_884_
		    = (i_883_ & 0x1000100) + (i_882_ - i_883_ & 0x10000);
		is[i_873_] = i_882_ - i_884_ | i_884_ - (i_884_ >>> 8);
	    } else if (i_874_ == 2) {
		int i_885_ = anIntArray11415[i];
		int i_886_ = (i_885_ & 0xff00ff) * anInt9012 & ~0xff00ff;
		int i_887_ = (i_885_ & 0xff00) * anInt9012 & 0xff0000;
		is[i_873_] = ((i_886_ | i_887_) >>> 8) + anInt9019;
	    } else
		throw new IllegalArgumentException();
	} else if (i_875_ == 1) {
	    if (i_874_ == 1) {
		int i_888_ = anIntArray11415[i];
		if (i_888_ != 0)
		    is[i_873_] = i_888_;
	    } else if (i_874_ == 0) {
		int i_889_ = anIntArray11415[i];
		if (i_889_ != 0) {
		    if ((anInt9011 & 0xffffff) == 16777215) {
			int i_890_ = anInt9011 >>> 24;
			int i_891_ = 256 - i_890_;
			int i_892_ = is[i_873_];
			is[i_873_] = ((((i_889_ & 0xff00ff) * i_890_
					+ (i_892_ & 0xff00ff) * i_891_)
				       & ~0xff00ff)
				      + (((i_889_ & 0xff00) * i_890_
					  + (i_892_ & 0xff00) * i_891_)
					 & 0xff0000)) >> 8;
		    } else if (anInt9012 != 255) {
			int i_893_
			    = (i_889_ & 0xff0000) * anInt9014 & ~0xffffff;
			int i_894_ = (i_889_ & 0xff00) * anInt9015 & 0xff0000;
			int i_895_ = (i_889_ & 0xff) * anInt9018 & 0xff00;
			i_889_ = (i_893_ | i_894_ | i_895_) >>> 8;
			int i_896_ = is[i_873_];
			is[i_873_] = ((((i_889_ & 0xff00ff) * anInt9012
					+ (i_896_ & 0xff00ff) * anInt9013)
				       & ~0xff00ff)
				      + (((i_889_ & 0xff00) * anInt9012
					  + (i_896_ & 0xff00) * anInt9013)
					 & 0xff0000)) >> 8;
		    } else {
			int i_897_
			    = (i_889_ & 0xff0000) * anInt9014 & ~0xffffff;
			int i_898_ = (i_889_ & 0xff00) * anInt9015 & 0xff0000;
			int i_899_ = (i_889_ & 0xff) * anInt9018 & 0xff00;
			is[i_873_] = (i_897_ | i_898_ | i_899_) >>> 8;
		    }
		}
	    } else if (i_874_ == 3) {
		int i_900_ = anIntArray11415[i];
		int i_901_ = anInt9011;
		int i_902_ = i_900_ + i_901_;
		int i_903_ = (i_900_ & 0xff00ff) + (i_901_ & 0xff00ff);
		int i_904_
		    = (i_903_ & 0x1000100) + (i_902_ - i_903_ & 0x10000);
		i_904_ = i_902_ - i_904_ | i_904_ - (i_904_ >>> 8);
		if (i_900_ == 0 && anInt9012 != 255) {
		    i_900_ = i_904_;
		    i_904_ = is[i_873_];
		    i_904_ = ((((i_900_ & 0xff00ff) * anInt9012
				+ (i_904_ & 0xff00ff) * anInt9013)
			       & ~0xff00ff)
			      + (((i_900_ & 0xff00) * anInt9012
				  + (i_904_ & 0xff00) * anInt9013)
				 & 0xff0000)) >> 8;
		}
		is[i_873_] = i_904_;
	    } else if (i_874_ == 2) {
		int i_905_ = anIntArray11415[i];
		if (i_905_ != 0) {
		    int i_906_ = (i_905_ & 0xff00ff) * anInt9012 & ~0xff00ff;
		    int i_907_ = (i_905_ & 0xff00) * anInt9012 & 0xff0000;
		    is[i_873_++] = ((i_906_ | i_907_) >>> 8) + anInt9019;
		}
	    } else
		throw new IllegalArgumentException();
	} else if (i_875_ == 2) {
	    if (i_874_ == 1) {
		int i_908_ = anIntArray11415[i];
		if (i_908_ != 0) {
		    int i_909_ = is[i_873_];
		    int i_910_ = i_908_ + i_909_;
		    int i_911_ = (i_908_ & 0xff00ff) + (i_909_ & 0xff00ff);
		    i_909_
			= (i_911_ & 0x1000100) + (i_910_ - i_911_ & 0x10000);
		    is[i_873_] = i_910_ - i_909_ | i_909_ - (i_909_ >>> 8);
		}
	    } else if (i_874_ == 0) {
		int i_912_ = anIntArray11415[i];
		if (i_912_ != 0) {
		    int i_913_ = (i_912_ & 0xff0000) * anInt9014 & ~0xffffff;
		    int i_914_ = (i_912_ & 0xff00) * anInt9015 & 0xff0000;
		    int i_915_ = (i_912_ & 0xff) * anInt9018 & 0xff00;
		    i_912_ = (i_913_ | i_914_ | i_915_) >>> 8;
		    int i_916_ = is[i_873_];
		    int i_917_ = i_912_ + i_916_;
		    int i_918_ = (i_912_ & 0xff00ff) + (i_916_ & 0xff00ff);
		    i_916_
			= (i_918_ & 0x1000100) + (i_917_ - i_918_ & 0x10000);
		    is[i_873_] = i_917_ - i_916_ | i_916_ - (i_916_ >>> 8);
		}
	    } else if (i_874_ == 3) {
		int i_919_ = anIntArray11415[i];
		int i_920_ = anInt9011;
		int i_921_ = i_919_ + i_920_;
		int i_922_ = (i_919_ & 0xff00ff) + (i_920_ & 0xff00ff);
		int i_923_
		    = (i_922_ & 0x1000100) + (i_921_ - i_922_ & 0x10000);
		i_919_ = i_921_ - i_923_ | i_923_ - (i_923_ >>> 8);
		i_923_ = is[i_873_];
		i_921_ = i_919_ + i_923_;
		i_922_ = (i_919_ & 0xff00ff) + (i_923_ & 0xff00ff);
		i_923_ = (i_922_ & 0x1000100) + (i_921_ - i_922_ & 0x10000);
		is[i_873_] = i_921_ - i_923_ | i_923_ - (i_923_ >>> 8);
	    } else if (i_874_ == 2) {
		int i_924_ = anIntArray11415[i];
		if (i_924_ != 0) {
		    int i_925_ = (i_924_ & 0xff00ff) * anInt9012 & ~0xff00ff;
		    int i_926_ = (i_924_ & 0xff00) * anInt9012 & 0xff0000;
		    i_924_ = ((i_925_ | i_926_) >>> 8) + anInt9019;
		    int i_927_ = is[i_873_];
		    int i_928_ = i_924_ + i_927_;
		    int i_929_ = (i_924_ & 0xff00ff) + (i_927_ & 0xff00ff);
		    i_927_
			= (i_929_ & 0x1000100) + (i_928_ - i_929_ & 0x10000);
		    is[i_873_] = i_928_ - i_927_ | i_927_ - (i_927_ >>> 8);
		}
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    void method17953(int i, int i_930_, int i_931_, int i_932_, int[] is,
		     int i_933_, int i_934_) {
	i_934_ -= i_931_;
	for (int i_935_ = 0; i_935_ < i_932_; i_935_++) {
	    int i_936_ = (i_930_ + i_935_) * i_931_ + i;
	    for (int i_937_ = 0; i_937_ < i_931_; i_937_++)
		is[i_933_++] = anIntArray11415[i_936_ + i_937_];
	    i_933_ += i_934_;
	}
    }
    
    public Interface22 method2683() {
	return new Class115(anInt8985, anInt9002, anIntArray11415);
    }
    
    Class163_Sub1_Sub3(Class185_Sub2 class185_sub2, int i, int i_938_) {
	super(class185_sub2, i, i_938_);
	anIntArray11415 = new int[i * i_938_];
    }
    
    public void method2648(int i, int i_939_, int i_940_, int i_941_, int[] is,
			   int[] is_942_, int i_943_, int i_944_) {
	method17951(i, i_939_, i_940_, i_941_, is, i_943_, i_944_);
    }
    
    public void method2684(int i, int i_945_, int i_946_, int i_947_,
			   int i_948_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    int i_949_ = aClass185_Sub2_9016.anInt9356 * 356365251;
	    i += anInt8987;
	    i_945_ += anInt8989;
	    int i_950_ = i_945_ * i_949_ + i;
	    int i_951_ = 0;
	    int i_952_ = anInt9002;
	    int i_953_ = anInt8985;
	    int i_954_ = i_949_ - i_953_;
	    int i_955_ = 0;
	    if (i_945_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		int i_956_ = aClass185_Sub2_9016.anInt9344 * 9823353 - i_945_;
		i_952_ -= i_956_;
		i_945_ = aClass185_Sub2_9016.anInt9344 * 9823353;
		i_951_ += i_956_ * i_953_;
		i_950_ += i_956_ * i_949_;
	    }
	    if (i_945_ + i_952_ > aClass185_Sub2_9016.anInt9345 * 639238427)
		i_952_ -= (i_945_ + i_952_
			   - aClass185_Sub2_9016.anInt9345 * 639238427);
	    if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		int i_957_ = aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		i_953_ -= i_957_;
		i = aClass185_Sub2_9016.anInt9365 * 1709859847;
		i_951_ += i_957_;
		i_950_ += i_957_;
		i_955_ += i_957_;
		i_954_ += i_957_;
	    }
	    if (i + i_953_ > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		int i_958_
		    = i + i_953_ - aClass185_Sub2_9016.anInt9343 * -1807368365;
		i_953_ -= i_958_;
		i_955_ += i_958_;
		i_954_ += i_958_;
	    }
	    if (i_953_ > 0 && i_952_ > 0) {
		if (i_948_ == 0) {
		    if (i_946_ == 1) {
			for (int i_959_ = -i_952_; i_959_ < 0; i_959_++) {
			    int i_960_ = i_950_ + i_953_ - 3;
			    while (i_950_ < i_960_) {
				is[i_950_++] = anIntArray11415[i_951_++];
				is[i_950_++] = anIntArray11415[i_951_++];
				is[i_950_++] = anIntArray11415[i_951_++];
				is[i_950_++] = anIntArray11415[i_951_++];
			    }
			    i_960_ += 3;
			    while (i_950_ < i_960_)
				is[i_950_++] = anIntArray11415[i_951_++];
			    i_950_ += i_954_;
			    i_951_ += i_955_;
			}
		    } else if (i_946_ == 0) {
			int i_961_ = (i_947_ & 0xff0000) >> 16;
			int i_962_ = (i_947_ & 0xff00) >> 8;
			int i_963_ = i_947_ & 0xff;
			for (int i_964_ = -i_952_; i_964_ < 0; i_964_++) {
			    for (int i_965_ = -i_953_; i_965_ < 0; i_965_++) {
				int i_966_ = anIntArray11415[i_951_++];
				int i_967_
				    = (i_966_ & 0xff0000) * i_961_ & ~0xffffff;
				int i_968_
				    = (i_966_ & 0xff00) * i_962_ & 0xff0000;
				int i_969_ = (i_966_ & 0xff) * i_963_ & 0xff00;
				is[i_950_++]
				    = (i_967_ | i_968_ | i_969_) >>> 8;
			    }
			    i_950_ += i_954_;
			    i_951_ += i_955_;
			}
		    } else if (i_946_ == 3) {
			for (int i_970_ = -i_952_; i_970_ < 0; i_970_++) {
			    for (int i_971_ = -i_953_; i_971_ < 0; i_971_++) {
				int i_972_ = anIntArray11415[i_951_++];
				int i_973_ = i_972_ + i_947_;
				int i_974_ = ((i_972_ & 0xff00ff)
					      + (i_947_ & 0xff00ff));
				int i_975_ = ((i_974_ & 0x1000100)
					      + (i_973_ - i_974_ & 0x10000));
				is[i_950_++]
				    = i_973_ - i_975_ | i_975_ - (i_975_
								  >>> 8);
			    }
			    i_950_ += i_954_;
			    i_951_ += i_955_;
			}
		    } else if (i_946_ == 2) {
			int i_976_ = i_947_ >>> 24;
			int i_977_ = 256 - i_976_;
			int i_978_ = (i_947_ & 0xff00ff) * i_977_ & ~0xff00ff;
			int i_979_ = (i_947_ & 0xff00) * i_977_ & 0xff0000;
			i_947_ = (i_978_ | i_979_) >>> 8;
			for (int i_980_ = -i_952_; i_980_ < 0; i_980_++) {
			    for (int i_981_ = -i_953_; i_981_ < 0; i_981_++) {
				int i_982_ = anIntArray11415[i_951_++];
				i_978_
				    = (i_982_ & 0xff00ff) * i_976_ & ~0xff00ff;
				i_979_ = (i_982_ & 0xff00) * i_976_ & 0xff0000;
				is[i_950_++]
				    = ((i_978_ | i_979_) >>> 8) + i_947_;
			    }
			    i_950_ += i_954_;
			    i_951_ += i_955_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_948_ == 1) {
		    if (i_946_ == 1) {
			for (int i_983_ = -i_952_; i_983_ < 0; i_983_++) {
			    int i_984_ = i_950_ + i_953_ - 3;
			    while (i_950_ < i_984_) {
				int i_985_ = anIntArray11415[i_951_++];
				if (i_985_ != 0)
				    is[i_950_++] = i_985_;
				else
				    i_950_++;
				i_985_ = anIntArray11415[i_951_++];
				if (i_985_ != 0)
				    is[i_950_++] = i_985_;
				else
				    i_950_++;
				i_985_ = anIntArray11415[i_951_++];
				if (i_985_ != 0)
				    is[i_950_++] = i_985_;
				else
				    i_950_++;
				i_985_ = anIntArray11415[i_951_++];
				if (i_985_ != 0)
				    is[i_950_++] = i_985_;
				else
				    i_950_++;
			    }
			    i_984_ += 3;
			    while (i_950_ < i_984_) {
				int i_986_ = anIntArray11415[i_951_++];
				if (i_986_ != 0)
				    is[i_950_++] = i_986_;
				else
				    i_950_++;
			    }
			    i_950_ += i_954_;
			    i_951_ += i_955_;
			}
		    } else if (i_946_ == 0) {
			if ((i_947_ & 0xffffff) == 16777215) {
			    int i_987_ = i_947_ >>> 24;
			    int i_988_ = 256 - i_987_;
			    for (int i_989_ = -i_952_; i_989_ < 0; i_989_++) {
				for (int i_990_ = -i_953_; i_990_ < 0;
				     i_990_++) {
				    int i_991_ = anIntArray11415[i_951_++];
				    if (i_991_ != 0) {
					int i_992_ = is[i_950_];
					is[i_950_++]
					    = ((((i_991_ & 0xff00ff) * i_987_
						 + ((i_992_ & 0xff00ff)
						    * i_988_))
						& ~0xff00ff)
					       + (((i_991_ & 0xff00) * i_987_
						   + ((i_992_ & 0xff00)
						      * i_988_))
						  & 0xff0000)) >> 8;
				    } else
					i_950_++;
				}
				i_950_ += i_954_;
				i_951_ += i_955_;
			    }
			} else {
			    int i_993_ = (i_947_ & 0xff0000) >> 16;
			    int i_994_ = (i_947_ & 0xff00) >> 8;
			    int i_995_ = i_947_ & 0xff;
			    int i_996_ = i_947_ >>> 24;
			    int i_997_ = 256 - i_996_;
			    for (int i_998_ = -i_952_; i_998_ < 0; i_998_++) {
				for (int i_999_ = -i_953_; i_999_ < 0;
				     i_999_++) {
				    int i_1000_ = anIntArray11415[i_951_++];
				    if (i_1000_ != 0) {
					if (i_996_ != 255) {
					    int i_1001_
						= (((i_1000_ & 0xff0000)
						    * i_993_)
						   & ~0xffffff);
					    int i_1002_
						= ((i_1000_ & 0xff00) * i_994_
						   & 0xff0000);
					    int i_1003_
						= ((i_1000_ & 0xff) * i_995_
						   & 0xff00);
					    i_1000_ = (i_1001_ | i_1002_
						       | i_1003_) >>> 8;
					    int i_1004_ = is[i_950_];
					    is[i_950_++]
						= (((((i_1000_ & 0xff00ff)
						      * i_996_)
						     + ((i_1004_ & 0xff00ff)
							* i_997_))
						    & ~0xff00ff)
						   + ((((i_1000_ & 0xff00)
							* i_996_)
						       + ((i_1004_ & 0xff00)
							  * i_997_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1005_
						= (((i_1000_ & 0xff0000)
						    * i_993_)
						   & ~0xffffff);
					    int i_1006_
						= ((i_1000_ & 0xff00) * i_994_
						   & 0xff0000);
					    int i_1007_
						= ((i_1000_ & 0xff) * i_995_
						   & 0xff00);
					    is[i_950_++] = (i_1005_ | i_1006_
							    | i_1007_) >>> 8;
					}
				    } else
					i_950_++;
				}
				i_950_ += i_954_;
				i_951_ += i_955_;
			    }
			}
		    } else if (i_946_ == 3) {
			int i_1008_ = i_947_ >>> 24;
			int i_1009_ = 256 - i_1008_;
			for (int i_1010_ = -i_952_; i_1010_ < 0; i_1010_++) {
			    for (int i_1011_ = -i_953_; i_1011_ < 0;
				 i_1011_++) {
				int i_1012_ = anIntArray11415[i_951_++];
				int i_1013_ = i_1012_ + i_947_;
				int i_1014_ = ((i_1012_ & 0xff00ff)
					       + (i_947_ & 0xff00ff));
				int i_1015_
				    = ((i_1014_ & 0x1000100)
				       + (i_1013_ - i_1014_ & 0x10000));
				i_1015_
				    = i_1013_ - i_1015_ | i_1015_ - (i_1015_
								     >>> 8);
				if (i_1012_ == 0 && i_1008_ != 255) {
				    i_1012_ = i_1015_;
				    i_1015_ = is[i_950_];
				    i_1015_
					= ((((i_1012_ & 0xff00ff) * i_1008_
					     + (i_1015_ & 0xff00ff) * i_1009_)
					    & ~0xff00ff)
					   + (((i_1012_ & 0xff00) * i_1008_
					       + (i_1015_ & 0xff00) * i_1009_)
					      & 0xff0000)) >> 8;
				}
				is[i_950_++] = i_1015_;
			    }
			    i_950_ += i_954_;
			    i_951_ += i_955_;
			}
		    } else if (i_946_ == 2) {
			int i_1016_ = i_947_ >>> 24;
			int i_1017_ = 256 - i_1016_;
			int i_1018_
			    = (i_947_ & 0xff00ff) * i_1017_ & ~0xff00ff;
			int i_1019_ = (i_947_ & 0xff00) * i_1017_ & 0xff0000;
			i_947_ = (i_1018_ | i_1019_) >>> 8;
			for (int i_1020_ = -i_952_; i_1020_ < 0; i_1020_++) {
			    for (int i_1021_ = -i_953_; i_1021_ < 0;
				 i_1021_++) {
				int i_1022_ = anIntArray11415[i_951_++];
				if (i_1022_ != 0) {
				    i_1018_ = ((i_1022_ & 0xff00ff) * i_1016_
					       & ~0xff00ff);
				    i_1019_ = ((i_1022_ & 0xff00) * i_1016_
					       & 0xff0000);
				    is[i_950_++]
					= ((i_1018_ | i_1019_) >>> 8) + i_947_;
				} else
				    i_950_++;
			    }
			    i_950_ += i_954_;
			    i_951_ += i_955_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_948_ == 2) {
		    if (i_946_ == 1) {
			for (int i_1023_ = -i_952_; i_1023_ < 0; i_1023_++) {
			    for (int i_1024_ = -i_953_; i_1024_ < 0;
				 i_1024_++) {
				int i_1025_ = anIntArray11415[i_951_++];
				if (i_1025_ != 0) {
				    int i_1026_ = is[i_950_];
				    int i_1027_ = i_1025_ + i_1026_;
				    int i_1028_ = ((i_1025_ & 0xff00ff)
						   + (i_1026_ & 0xff00ff));
				    i_1026_
					= ((i_1028_ & 0x1000100)
					   + (i_1027_ - i_1028_ & 0x10000));
				    is[i_950_++]
					= (i_1027_ - i_1026_
					   | i_1026_ - (i_1026_ >>> 8));
				} else
				    i_950_++;
			    }
			    i_950_ += i_954_;
			    i_951_ += i_955_;
			}
		    } else if (i_946_ == 0) {
			int i_1029_ = (i_947_ & 0xff0000) >> 16;
			int i_1030_ = (i_947_ & 0xff00) >> 8;
			int i_1031_ = i_947_ & 0xff;
			for (int i_1032_ = -i_952_; i_1032_ < 0; i_1032_++) {
			    for (int i_1033_ = -i_953_; i_1033_ < 0;
				 i_1033_++) {
				int i_1034_ = anIntArray11415[i_951_++];
				if (i_1034_ != 0) {
				    int i_1035_
					= ((i_1034_ & 0xff0000) * i_1029_
					   & ~0xffffff);
				    int i_1036_ = ((i_1034_ & 0xff00) * i_1030_
						   & 0xff0000);
				    int i_1037_
					= (i_1034_ & 0xff) * i_1031_ & 0xff00;
				    i_1034_
					= (i_1035_ | i_1036_ | i_1037_) >>> 8;
				    int i_1038_ = is[i_950_];
				    int i_1039_ = i_1034_ + i_1038_;
				    int i_1040_ = ((i_1034_ & 0xff00ff)
						   + (i_1038_ & 0xff00ff));
				    i_1038_
					= ((i_1040_ & 0x1000100)
					   + (i_1039_ - i_1040_ & 0x10000));
				    is[i_950_++]
					= (i_1039_ - i_1038_
					   | i_1038_ - (i_1038_ >>> 8));
				} else
				    i_950_++;
			    }
			    i_950_ += i_954_;
			    i_951_ += i_955_;
			}
		    } else if (i_946_ == 3) {
			for (int i_1041_ = -i_952_; i_1041_ < 0; i_1041_++) {
			    for (int i_1042_ = -i_953_; i_1042_ < 0;
				 i_1042_++) {
				int i_1043_ = anIntArray11415[i_951_++];
				int i_1044_ = i_1043_ + i_947_;
				int i_1045_ = ((i_1043_ & 0xff00ff)
					       + (i_947_ & 0xff00ff));
				int i_1046_
				    = ((i_1045_ & 0x1000100)
				       + (i_1044_ - i_1045_ & 0x10000));
				i_1043_
				    = i_1044_ - i_1046_ | i_1046_ - (i_1046_
								     >>> 8);
				i_1046_ = is[i_950_];
				i_1044_ = i_1043_ + i_1046_;
				i_1045_ = (i_1043_ & 0xff00ff) + (i_1046_
								  & 0xff00ff);
				i_1046_ = ((i_1045_ & 0x1000100)
					   + (i_1044_ - i_1045_ & 0x10000));
				is[i_950_++]
				    = i_1044_ - i_1046_ | i_1046_ - (i_1046_
								     >>> 8);
			    }
			    i_950_ += i_954_;
			    i_951_ += i_955_;
			}
		    } else if (i_946_ == 2) {
			int i_1047_ = i_947_ >>> 24;
			int i_1048_ = 256 - i_1047_;
			int i_1049_
			    = (i_947_ & 0xff00ff) * i_1048_ & ~0xff00ff;
			int i_1050_ = (i_947_ & 0xff00) * i_1048_ & 0xff0000;
			i_947_ = (i_1049_ | i_1050_) >>> 8;
			for (int i_1051_ = -i_952_; i_1051_ < 0; i_1051_++) {
			    for (int i_1052_ = -i_953_; i_1052_ < 0;
				 i_1052_++) {
				int i_1053_ = anIntArray11415[i_951_++];
				if (i_1053_ != 0) {
				    i_1049_ = ((i_1053_ & 0xff00ff) * i_1047_
					       & ~0xff00ff);
				    i_1050_ = ((i_1053_ & 0xff00) * i_1047_
					       & 0xff0000);
				    i_1053_
					= ((i_1049_ | i_1050_) >>> 8) + i_947_;
				    int i_1054_ = is[i_950_];
				    int i_1055_ = i_1053_ + i_1054_;
				    int i_1056_ = ((i_1053_ & 0xff00ff)
						   + (i_1054_ & 0xff00ff));
				    i_1054_
					= ((i_1056_ & 0x1000100)
					   + (i_1055_ - i_1056_ & 0x10000));
				    is[i_950_++]
					= (i_1055_ - i_1054_
					   | i_1054_ - (i_1054_ >>> 8));
				} else
				    i_950_++;
			    }
			    i_950_ += i_954_;
			    i_951_ += i_955_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2693(int i, int i_1057_, int i_1058_, int i_1059_,
			   int[] is, int[] is_1060_, int i_1061_,
			   int i_1062_) {
	method17951(i, i_1057_, i_1058_, i_1059_, is, i_1061_, i_1062_);
    }
    
    public void method2717(int i, int i_1063_, int i_1064_, int i_1065_,
			   int i_1066_, int i_1067_) {
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is == null)
	    throw new IllegalStateException("");
	for (int i_1068_ = 0; i_1068_ < i_1065_; i_1068_++) {
	    int i_1069_ = (i_1063_ + i_1068_) * anInt8985 + i;
	    int i_1070_ = ((i_1067_ + i_1068_) * (aClass185_Sub2_9016.anInt9356
						  * 356365251)
			   + i_1066_);
	    for (int i_1071_ = 0; i_1071_ < i_1064_; i_1071_++)
		anIntArray11415[i_1069_ + i_1071_] = is[i_1070_ + i_1071_];
	}
    }
    
    public Interface22 method2650() {
	return new Class115(anInt8985, anInt9002, anIntArray11415);
    }
    
    public Interface22 method2688() {
	return new Class115(anInt8985, anInt9002, anIntArray11415);
    }
    
    public Interface22 method2681() {
	return new Class115(anInt8985, anInt9002, anIntArray11415);
    }
    
    public Interface22 method2682() {
	return new Class115(anInt8985, anInt9002, anIntArray11415);
    }
    
    public void method2674(int i, int i_1072_, int i_1073_, int i_1074_,
			   int[] is, int[] is_1075_, int i_1076_,
			   int i_1077_) {
	method17951(i, i_1072_, i_1073_, i_1074_, is, i_1076_, i_1077_);
    }
    
    void method2702(int i, int i_1078_, int i_1079_, int i_1080_, int i_1081_,
		    int i_1082_, int i_1083_, int i_1084_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (i_1079_ > 0 && i_1080_ > 0) {
	    int[] is = aClass185_Sub2_9016.anIntArray9338;
	    if (is != null) {
		int i_1085_ = 0;
		int i_1086_ = 0;
		int i_1087_ = aClass185_Sub2_9016.anInt9356 * 356365251;
		int i_1088_ = anInt8987 + anInt8985 + anInt8992;
		int i_1089_ = anInt8989 + anInt9002 + anInt8990;
		int i_1090_ = (i_1088_ << 16) / i_1079_;
		int i_1091_ = (i_1089_ << 16) / i_1080_;
		if (anInt8987 > 0) {
		    int i_1092_ = ((anInt8987 << 16) + i_1090_ - 1) / i_1090_;
		    i += i_1092_;
		    i_1085_ += i_1092_ * i_1090_ - (anInt8987 << 16);
		}
		if (anInt8989 > 0) {
		    int i_1093_ = ((anInt8989 << 16) + i_1091_ - 1) / i_1091_;
		    i_1078_ += i_1093_;
		    i_1086_ += i_1093_ * i_1091_ - (anInt8989 << 16);
		}
		if (anInt8985 < i_1088_)
		    i_1079_ = (((anInt8985 << 16) - i_1085_ + i_1090_ - 1)
			       / i_1090_);
		if (anInt9002 < i_1089_)
		    i_1080_ = (((anInt9002 << 16) - i_1086_ + i_1091_ - 1)
			       / i_1091_);
		int i_1094_ = i + i_1078_ * i_1087_;
		int i_1095_ = i_1087_ - i_1079_;
		if (i_1078_ + i_1080_
		    > aClass185_Sub2_9016.anInt9345 * 639238427)
		    i_1080_ -= (i_1078_ + i_1080_
				- aClass185_Sub2_9016.anInt9345 * 639238427);
		if (i_1078_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		    int i_1096_
			= aClass185_Sub2_9016.anInt9344 * 9823353 - i_1078_;
		    i_1080_ -= i_1096_;
		    i_1094_ += i_1096_ * i_1087_;
		    i_1086_ += i_1091_ * i_1096_;
		}
		if (i + i_1079_
		    > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		    int i_1097_
			= (i + i_1079_
			   - aClass185_Sub2_9016.anInt9343 * -1807368365);
		    i_1079_ -= i_1097_;
		    i_1095_ += i_1097_;
		}
		if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		    int i_1098_
			= aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		    i_1079_ -= i_1098_;
		    i_1094_ += i_1098_;
		    i_1085_ += i_1090_ * i_1098_;
		    i_1095_ += i_1098_;
		}
		if (i_1083_ == 0) {
		    if (i_1081_ == 1) {
			int i_1099_ = i_1085_;
			for (int i_1100_ = -i_1080_; i_1100_ < 0; i_1100_++) {
			    int i_1101_ = (i_1086_ >> 16) * anInt8985;
			    for (int i_1102_ = -i_1079_; i_1102_ < 0;
				 i_1102_++) {
				is[i_1094_++] = (anIntArray11415
						 [(i_1085_ >> 16) + i_1101_]);
				i_1085_ += i_1090_;
			    }
			    i_1086_ += i_1091_;
			    i_1085_ = i_1099_;
			    i_1094_ += i_1095_;
			}
		    } else if (i_1081_ == 0) {
			int i_1103_ = (i_1082_ & 0xff0000) >> 16;
			int i_1104_ = (i_1082_ & 0xff00) >> 8;
			int i_1105_ = i_1082_ & 0xff;
			int i_1106_ = i_1085_;
			for (int i_1107_ = -i_1080_; i_1107_ < 0; i_1107_++) {
			    int i_1108_ = (i_1086_ >> 16) * anInt8985;
			    for (int i_1109_ = -i_1079_; i_1109_ < 0;
				 i_1109_++) {
				int i_1110_ = (anIntArray11415
					       [(i_1085_ >> 16) + i_1108_]);
				int i_1111_ = ((i_1110_ & 0xff0000) * i_1103_
					       & ~0xffffff);
				int i_1112_
				    = (i_1110_ & 0xff00) * i_1104_ & 0xff0000;
				int i_1113_
				    = (i_1110_ & 0xff) * i_1105_ & 0xff00;
				is[i_1094_++]
				    = (i_1111_ | i_1112_ | i_1113_) >>> 8;
				i_1085_ += i_1090_;
			    }
			    i_1086_ += i_1091_;
			    i_1085_ = i_1106_;
			    i_1094_ += i_1095_;
			}
		    } else if (i_1081_ == 3) {
			int i_1114_ = i_1085_;
			for (int i_1115_ = -i_1080_; i_1115_ < 0; i_1115_++) {
			    int i_1116_ = (i_1086_ >> 16) * anInt8985;
			    for (int i_1117_ = -i_1079_; i_1117_ < 0;
				 i_1117_++) {
				int i_1118_ = (anIntArray11415
					       [(i_1085_ >> 16) + i_1116_]);
				int i_1119_ = i_1118_ + i_1082_;
				int i_1120_ = ((i_1118_ & 0xff00ff)
					       + (i_1082_ & 0xff00ff));
				int i_1121_
				    = ((i_1120_ & 0x1000100)
				       + (i_1119_ - i_1120_ & 0x10000));
				is[i_1094_++]
				    = i_1119_ - i_1121_ | i_1121_ - (i_1121_
								     >>> 8);
				i_1085_ += i_1090_;
			    }
			    i_1086_ += i_1091_;
			    i_1085_ = i_1114_;
			    i_1094_ += i_1095_;
			}
		    } else if (i_1081_ == 2) {
			int i_1122_ = i_1082_ >>> 24;
			int i_1123_ = 256 - i_1122_;
			int i_1124_
			    = (i_1082_ & 0xff00ff) * i_1123_ & ~0xff00ff;
			int i_1125_ = (i_1082_ & 0xff00) * i_1123_ & 0xff0000;
			i_1082_ = (i_1124_ | i_1125_) >>> 8;
			int i_1126_ = i_1085_;
			for (int i_1127_ = -i_1080_; i_1127_ < 0; i_1127_++) {
			    int i_1128_ = (i_1086_ >> 16) * anInt8985;
			    for (int i_1129_ = -i_1079_; i_1129_ < 0;
				 i_1129_++) {
				int i_1130_ = (anIntArray11415
					       [(i_1085_ >> 16) + i_1128_]);
				i_1124_ = ((i_1130_ & 0xff00ff) * i_1122_
					   & ~0xff00ff);
				i_1125_
				    = (i_1130_ & 0xff00) * i_1122_ & 0xff0000;
				is[i_1094_++]
				    = ((i_1124_ | i_1125_) >>> 8) + i_1082_;
				i_1085_ += i_1090_;
			    }
			    i_1086_ += i_1091_;
			    i_1085_ = i_1126_;
			    i_1094_ += i_1095_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1083_ == 1) {
		    if (i_1081_ == 1) {
			int i_1131_ = i_1085_;
			for (int i_1132_ = -i_1080_; i_1132_ < 0; i_1132_++) {
			    int i_1133_ = (i_1086_ >> 16) * anInt8985;
			    for (int i_1134_ = -i_1079_; i_1134_ < 0;
				 i_1134_++) {
				int i_1135_ = (anIntArray11415
					       [(i_1085_ >> 16) + i_1133_]);
				if (i_1135_ != 0)
				    is[i_1094_++] = i_1135_;
				else
				    i_1094_++;
				i_1085_ += i_1090_;
			    }
			    i_1086_ += i_1091_;
			    i_1085_ = i_1131_;
			    i_1094_ += i_1095_;
			}
		    } else if (i_1081_ == 0) {
			int i_1136_ = i_1085_;
			if ((i_1082_ & 0xffffff) == 16777215) {
			    int i_1137_ = i_1082_ >>> 24;
			    int i_1138_ = 256 - i_1137_;
			    for (int i_1139_ = -i_1080_; i_1139_ < 0;
				 i_1139_++) {
				int i_1140_ = (i_1086_ >> 16) * anInt8985;
				for (int i_1141_ = -i_1079_; i_1141_ < 0;
				     i_1141_++) {
				    int i_1142_
					= (anIntArray11415
					   [(i_1085_ >> 16) + i_1140_]);
				    if (i_1142_ != 0) {
					int i_1143_ = is[i_1094_];
					is[i_1094_++]
					    = ((((i_1142_ & 0xff00ff) * i_1137_
						 + ((i_1143_ & 0xff00ff)
						    * i_1138_))
						& ~0xff00ff)
					       + (((i_1142_ & 0xff00) * i_1137_
						   + ((i_1143_ & 0xff00)
						      * i_1138_))
						  & 0xff0000)) >> 8;
				    } else
					i_1094_++;
				    i_1085_ += i_1090_;
				}
				i_1086_ += i_1091_;
				i_1085_ = i_1136_;
				i_1094_ += i_1095_;
			    }
			} else {
			    int i_1144_ = (i_1082_ & 0xff0000) >> 16;
			    int i_1145_ = (i_1082_ & 0xff00) >> 8;
			    int i_1146_ = i_1082_ & 0xff;
			    int i_1147_ = i_1082_ >>> 24;
			    int i_1148_ = 256 - i_1147_;
			    for (int i_1149_ = -i_1080_; i_1149_ < 0;
				 i_1149_++) {
				int i_1150_ = (i_1086_ >> 16) * anInt8985;
				for (int i_1151_ = -i_1079_; i_1151_ < 0;
				     i_1151_++) {
				    int i_1152_
					= (anIntArray11415
					   [(i_1085_ >> 16) + i_1150_]);
				    if (i_1152_ != 0) {
					if (i_1147_ != 255) {
					    int i_1153_
						= (((i_1152_ & 0xff0000)
						    * i_1144_)
						   & ~0xffffff);
					    int i_1154_
						= ((i_1152_ & 0xff00) * i_1145_
						   & 0xff0000);
					    int i_1155_
						= ((i_1152_ & 0xff) * i_1146_
						   & 0xff00);
					    i_1152_ = (i_1153_ | i_1154_
						       | i_1155_) >>> 8;
					    int i_1156_ = is[i_1094_];
					    is[i_1094_++]
						= (((((i_1152_ & 0xff00ff)
						      * i_1147_)
						     + ((i_1156_ & 0xff00ff)
							* i_1148_))
						    & ~0xff00ff)
						   + ((((i_1152_ & 0xff00)
							* i_1147_)
						       + ((i_1156_ & 0xff00)
							  * i_1148_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1157_
						= (((i_1152_ & 0xff0000)
						    * i_1144_)
						   & ~0xffffff);
					    int i_1158_
						= ((i_1152_ & 0xff00) * i_1145_
						   & 0xff0000);
					    int i_1159_
						= ((i_1152_ & 0xff) * i_1146_
						   & 0xff00);
					    is[i_1094_++] = (i_1157_ | i_1158_
							     | i_1159_) >>> 8;
					}
				    } else
					i_1094_++;
				    i_1085_ += i_1090_;
				}
				i_1086_ += i_1091_;
				i_1085_ = i_1136_;
				i_1094_ += i_1095_;
			    }
			}
		    } else if (i_1081_ == 3) {
			int i_1160_ = i_1085_;
			int i_1161_ = i_1082_ >>> 24;
			int i_1162_ = 256 - i_1161_;
			for (int i_1163_ = -i_1080_; i_1163_ < 0; i_1163_++) {
			    int i_1164_ = (i_1086_ >> 16) * anInt8985;
			    for (int i_1165_ = -i_1079_; i_1165_ < 0;
				 i_1165_++) {
				int i_1166_ = (anIntArray11415
					       [(i_1085_ >> 16) + i_1164_]);
				int i_1167_ = i_1166_ + i_1082_;
				int i_1168_ = ((i_1166_ & 0xff00ff)
					       + (i_1082_ & 0xff00ff));
				int i_1169_
				    = ((i_1168_ & 0x1000100)
				       + (i_1167_ - i_1168_ & 0x10000));
				i_1169_
				    = i_1167_ - i_1169_ | i_1169_ - (i_1169_
								     >>> 8);
				if (i_1166_ == 0 && i_1161_ != 255) {
				    i_1166_ = i_1169_;
				    i_1169_ = is[i_1094_];
				    i_1169_
					= ((((i_1166_ & 0xff00ff) * i_1161_
					     + (i_1169_ & 0xff00ff) * i_1162_)
					    & ~0xff00ff)
					   + (((i_1166_ & 0xff00) * i_1161_
					       + (i_1169_ & 0xff00) * i_1162_)
					      & 0xff0000)) >> 8;
				}
				is[i_1094_++] = i_1169_;
				i_1085_ += i_1090_;
			    }
			    i_1086_ += i_1091_;
			    i_1085_ = i_1160_;
			    i_1094_ += i_1095_;
			}
		    } else if (i_1081_ == 2) {
			int i_1170_ = i_1082_ >>> 24;
			int i_1171_ = 256 - i_1170_;
			int i_1172_
			    = (i_1082_ & 0xff00ff) * i_1171_ & ~0xff00ff;
			int i_1173_ = (i_1082_ & 0xff00) * i_1171_ & 0xff0000;
			i_1082_ = (i_1172_ | i_1173_) >>> 8;
			int i_1174_ = i_1085_;
			for (int i_1175_ = -i_1080_; i_1175_ < 0; i_1175_++) {
			    int i_1176_ = (i_1086_ >> 16) * anInt8985;
			    for (int i_1177_ = -i_1079_; i_1177_ < 0;
				 i_1177_++) {
				int i_1178_ = (anIntArray11415
					       [(i_1085_ >> 16) + i_1176_]);
				if (i_1178_ != 0) {
				    i_1172_ = ((i_1178_ & 0xff00ff) * i_1170_
					       & ~0xff00ff);
				    i_1173_ = ((i_1178_ & 0xff00) * i_1170_
					       & 0xff0000);
				    is[i_1094_++] = ((i_1172_ | i_1173_)
						     >>> 8) + i_1082_;
				} else
				    i_1094_++;
				i_1085_ += i_1090_;
			    }
			    i_1086_ += i_1091_;
			    i_1085_ = i_1174_;
			    i_1094_ += i_1095_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1083_ == 2) {
		    if (i_1081_ == 1) {
			int i_1179_ = i_1085_;
			for (int i_1180_ = -i_1080_; i_1180_ < 0; i_1180_++) {
			    int i_1181_ = (i_1086_ >> 16) * anInt8985;
			    for (int i_1182_ = -i_1079_; i_1182_ < 0;
				 i_1182_++) {
				int i_1183_ = (anIntArray11415
					       [(i_1085_ >> 16) + i_1181_]);
				if (i_1183_ != 0) {
				    int i_1184_ = is[i_1094_];
				    int i_1185_ = i_1183_ + i_1184_;
				    int i_1186_ = ((i_1183_ & 0xff00ff)
						   + (i_1184_ & 0xff00ff));
				    i_1184_
					= ((i_1186_ & 0x1000100)
					   + (i_1185_ - i_1186_ & 0x10000));
				    is[i_1094_++]
					= (i_1185_ - i_1184_
					   | i_1184_ - (i_1184_ >>> 8));
				} else
				    i_1094_++;
				i_1085_ += i_1090_;
			    }
			    i_1086_ += i_1091_;
			    i_1085_ = i_1179_;
			    i_1094_ += i_1095_;
			}
		    } else if (i_1081_ == 0) {
			int i_1187_ = i_1085_;
			int i_1188_ = (i_1082_ & 0xff0000) >> 16;
			int i_1189_ = (i_1082_ & 0xff00) >> 8;
			int i_1190_ = i_1082_ & 0xff;
			for (int i_1191_ = -i_1080_; i_1191_ < 0; i_1191_++) {
			    int i_1192_ = (i_1086_ >> 16) * anInt8985;
			    for (int i_1193_ = -i_1079_; i_1193_ < 0;
				 i_1193_++) {
				int i_1194_ = (anIntArray11415
					       [(i_1085_ >> 16) + i_1192_]);
				if (i_1194_ != 0) {
				    int i_1195_
					= ((i_1194_ & 0xff0000) * i_1188_
					   & ~0xffffff);
				    int i_1196_ = ((i_1194_ & 0xff00) * i_1189_
						   & 0xff0000);
				    int i_1197_
					= (i_1194_ & 0xff) * i_1190_ & 0xff00;
				    i_1194_
					= (i_1195_ | i_1196_ | i_1197_) >>> 8;
				    int i_1198_ = is[i_1094_];
				    int i_1199_ = i_1194_ + i_1198_;
				    int i_1200_ = ((i_1194_ & 0xff00ff)
						   + (i_1198_ & 0xff00ff));
				    i_1198_
					= ((i_1200_ & 0x1000100)
					   + (i_1199_ - i_1200_ & 0x10000));
				    is[i_1094_++]
					= (i_1199_ - i_1198_
					   | i_1198_ - (i_1198_ >>> 8));
				} else
				    i_1094_++;
				i_1085_ += i_1090_;
			    }
			    i_1086_ += i_1091_;
			    i_1085_ = i_1187_;
			    i_1094_ += i_1095_;
			}
		    } else if (i_1081_ == 3) {
			int i_1201_ = i_1085_;
			for (int i_1202_ = -i_1080_; i_1202_ < 0; i_1202_++) {
			    int i_1203_ = (i_1086_ >> 16) * anInt8985;
			    for (int i_1204_ = -i_1079_; i_1204_ < 0;
				 i_1204_++) {
				int i_1205_ = (anIntArray11415
					       [(i_1085_ >> 16) + i_1203_]);
				int i_1206_ = i_1205_ + i_1082_;
				int i_1207_ = ((i_1205_ & 0xff00ff)
					       + (i_1082_ & 0xff00ff));
				int i_1208_
				    = ((i_1207_ & 0x1000100)
				       + (i_1206_ - i_1207_ & 0x10000));
				i_1205_
				    = i_1206_ - i_1208_ | i_1208_ - (i_1208_
								     >>> 8);
				i_1208_ = is[i_1094_];
				i_1206_ = i_1205_ + i_1208_;
				i_1207_ = (i_1205_ & 0xff00ff) + (i_1208_
								  & 0xff00ff);
				i_1208_ = ((i_1207_ & 0x1000100)
					   + (i_1206_ - i_1207_ & 0x10000));
				is[i_1094_++]
				    = i_1206_ - i_1208_ | i_1208_ - (i_1208_
								     >>> 8);
				i_1085_ += i_1090_;
			    }
			    i_1086_ += i_1091_;
			    i_1085_ = i_1201_;
			    i_1094_ += i_1095_;
			}
		    } else if (i_1081_ == 2) {
			int i_1209_ = i_1082_ >>> 24;
			int i_1210_ = 256 - i_1209_;
			int i_1211_
			    = (i_1082_ & 0xff00ff) * i_1210_ & ~0xff00ff;
			int i_1212_ = (i_1082_ & 0xff00) * i_1210_ & 0xff0000;
			i_1082_ = (i_1211_ | i_1212_) >>> 8;
			int i_1213_ = i_1085_;
			for (int i_1214_ = -i_1080_; i_1214_ < 0; i_1214_++) {
			    int i_1215_ = (i_1086_ >> 16) * anInt8985;
			    for (int i_1216_ = -i_1079_; i_1216_ < 0;
				 i_1216_++) {
				int i_1217_ = (anIntArray11415
					       [(i_1085_ >> 16) + i_1215_]);
				if (i_1217_ != 0) {
				    i_1211_ = ((i_1217_ & 0xff00ff) * i_1209_
					       & ~0xff00ff);
				    i_1212_ = ((i_1217_ & 0xff00) * i_1209_
					       & 0xff0000);
				    i_1217_ = (((i_1211_ | i_1212_) >>> 8)
					       + i_1082_);
				    int i_1218_ = is[i_1094_];
				    int i_1219_ = i_1217_ + i_1218_;
				    int i_1220_ = ((i_1217_ & 0xff00ff)
						   + (i_1218_ & 0xff00ff));
				    i_1218_
					= ((i_1220_ & 0x1000100)
					   + (i_1219_ - i_1220_ & 0x10000));
				    is[i_1094_++]
					= (i_1219_ - i_1218_
					   | i_1218_ - (i_1218_ >>> 8));
				} else
				    i_1094_++;
				i_1085_ += i_1090_;
			    }
			    i_1086_ += i_1091_;
			    i_1085_ = i_1213_;
			    i_1094_ += i_1095_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2685(int i, int i_1221_, Class145 class145, int i_1222_,
			   int i_1223_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    i += anInt8987;
	    i_1221_ += anInt8989;
	    int i_1224_ = 0;
	    int i_1225_ = aClass185_Sub2_9016.anInt9356 * 356365251;
	    int i_1226_ = anInt8985;
	    int i_1227_ = anInt9002;
	    int i_1228_ = i_1225_ - i_1226_;
	    int i_1229_ = 0;
	    int i_1230_ = i + i_1221_ * i_1225_;
	    if (i_1221_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		int i_1231_
		    = aClass185_Sub2_9016.anInt9344 * 9823353 - i_1221_;
		i_1227_ -= i_1231_;
		i_1221_ = aClass185_Sub2_9016.anInt9344 * 9823353;
		i_1224_ += i_1231_ * i_1226_;
		i_1230_ += i_1231_ * i_1225_;
	    }
	    if (i_1221_ + i_1227_ > aClass185_Sub2_9016.anInt9345 * 639238427)
		i_1227_ -= (i_1221_ + i_1227_
			    - aClass185_Sub2_9016.anInt9345 * 639238427);
	    if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		int i_1232_ = aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		i_1226_ -= i_1232_;
		i = aClass185_Sub2_9016.anInt9365 * 1709859847;
		i_1224_ += i_1232_;
		i_1230_ += i_1232_;
		i_1229_ += i_1232_;
		i_1228_ += i_1232_;
	    }
	    if (i + i_1226_ > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		int i_1233_ = (i + i_1226_
			       - aClass185_Sub2_9016.anInt9343 * -1807368365);
		i_1226_ -= i_1233_;
		i_1229_ += i_1233_;
		i_1228_ += i_1233_;
	    }
	    if (i_1226_ > 0 && i_1227_ > 0) {
		Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
		int[] is_1234_ = class145_sub2.anIntArray9797;
		int[] is_1235_ = class145_sub2.anIntArray9798;
		int i_1236_ = i_1221_;
		if (i_1223_ > i_1236_) {
		    i_1236_ = i_1223_;
		    i_1230_ += (i_1223_ - i_1221_) * i_1225_;
		    i_1224_ += (i_1223_ - i_1221_) * anInt8985;
		}
		int i_1237_
		    = (i_1223_ + is_1234_.length < i_1221_ + i_1227_
		       ? i_1223_ + is_1234_.length : i_1221_ + i_1227_);
		for (int i_1238_ = i_1236_; i_1238_ < i_1237_; i_1238_++) {
		    int i_1239_ = is_1234_[i_1238_ - i_1223_] + i_1222_;
		    int i_1240_ = is_1235_[i_1238_ - i_1223_];
		    int i_1241_ = i_1226_;
		    if (i > i_1239_) {
			int i_1242_ = i - i_1239_;
			if (i_1242_ >= i_1240_) {
			    i_1224_ += i_1226_ + i_1229_;
			    i_1230_ += i_1226_ + i_1228_;
			    continue;
			}
			i_1240_ -= i_1242_;
		    } else {
			int i_1243_ = i_1239_ - i;
			if (i_1243_ >= i_1226_) {
			    i_1224_ += i_1226_ + i_1229_;
			    i_1230_ += i_1226_ + i_1228_;
			    continue;
			}
			i_1224_ += i_1243_;
			i_1241_ -= i_1243_;
			i_1230_ += i_1243_;
		    }
		    int i_1244_ = 0;
		    if (i_1241_ < i_1240_)
			i_1240_ = i_1241_;
		    else
			i_1244_ = i_1241_ - i_1240_;
		    for (int i_1245_ = -i_1240_; i_1245_ < 0; i_1245_++) {
			int i_1246_ = anIntArray11415[i_1224_++];
			if (i_1246_ != 0)
			    is[i_1230_++] = i_1246_;
			else
			    i_1230_++;
		    }
		    i_1224_ += i_1244_ + i_1229_;
		    i_1230_ += i_1244_ + i_1228_;
		}
	    }
	}
    }
    
    void method2686(int i, int i_1247_, int i_1248_, int i_1249_, int i_1250_,
		    int i_1251_, int i_1252_, int i_1253_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (i_1248_ > 0 && i_1249_ > 0) {
	    int[] is = aClass185_Sub2_9016.anIntArray9338;
	    if (is != null) {
		int i_1254_ = 0;
		int i_1255_ = 0;
		int i_1256_ = aClass185_Sub2_9016.anInt9356 * 356365251;
		int i_1257_ = anInt8987 + anInt8985 + anInt8992;
		int i_1258_ = anInt8989 + anInt9002 + anInt8990;
		int i_1259_ = (i_1257_ << 16) / i_1248_;
		int i_1260_ = (i_1258_ << 16) / i_1249_;
		if (anInt8987 > 0) {
		    int i_1261_ = ((anInt8987 << 16) + i_1259_ - 1) / i_1259_;
		    i += i_1261_;
		    i_1254_ += i_1261_ * i_1259_ - (anInt8987 << 16);
		}
		if (anInt8989 > 0) {
		    int i_1262_ = ((anInt8989 << 16) + i_1260_ - 1) / i_1260_;
		    i_1247_ += i_1262_;
		    i_1255_ += i_1262_ * i_1260_ - (anInt8989 << 16);
		}
		if (anInt8985 < i_1257_)
		    i_1248_ = (((anInt8985 << 16) - i_1254_ + i_1259_ - 1)
			       / i_1259_);
		if (anInt9002 < i_1258_)
		    i_1249_ = (((anInt9002 << 16) - i_1255_ + i_1260_ - 1)
			       / i_1260_);
		int i_1263_ = i + i_1247_ * i_1256_;
		int i_1264_ = i_1256_ - i_1248_;
		if (i_1247_ + i_1249_
		    > aClass185_Sub2_9016.anInt9345 * 639238427)
		    i_1249_ -= (i_1247_ + i_1249_
				- aClass185_Sub2_9016.anInt9345 * 639238427);
		if (i_1247_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		    int i_1265_
			= aClass185_Sub2_9016.anInt9344 * 9823353 - i_1247_;
		    i_1249_ -= i_1265_;
		    i_1263_ += i_1265_ * i_1256_;
		    i_1255_ += i_1260_ * i_1265_;
		}
		if (i + i_1248_
		    > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		    int i_1266_
			= (i + i_1248_
			   - aClass185_Sub2_9016.anInt9343 * -1807368365);
		    i_1248_ -= i_1266_;
		    i_1264_ += i_1266_;
		}
		if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		    int i_1267_
			= aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		    i_1248_ -= i_1267_;
		    i_1263_ += i_1267_;
		    i_1254_ += i_1259_ * i_1267_;
		    i_1264_ += i_1267_;
		}
		if (i_1252_ == 0) {
		    if (i_1250_ == 1) {
			int i_1268_ = i_1254_;
			for (int i_1269_ = -i_1249_; i_1269_ < 0; i_1269_++) {
			    int i_1270_ = (i_1255_ >> 16) * anInt8985;
			    for (int i_1271_ = -i_1248_; i_1271_ < 0;
				 i_1271_++) {
				is[i_1263_++] = (anIntArray11415
						 [(i_1254_ >> 16) + i_1270_]);
				i_1254_ += i_1259_;
			    }
			    i_1255_ += i_1260_;
			    i_1254_ = i_1268_;
			    i_1263_ += i_1264_;
			}
		    } else if (i_1250_ == 0) {
			int i_1272_ = (i_1251_ & 0xff0000) >> 16;
			int i_1273_ = (i_1251_ & 0xff00) >> 8;
			int i_1274_ = i_1251_ & 0xff;
			int i_1275_ = i_1254_;
			for (int i_1276_ = -i_1249_; i_1276_ < 0; i_1276_++) {
			    int i_1277_ = (i_1255_ >> 16) * anInt8985;
			    for (int i_1278_ = -i_1248_; i_1278_ < 0;
				 i_1278_++) {
				int i_1279_ = (anIntArray11415
					       [(i_1254_ >> 16) + i_1277_]);
				int i_1280_ = ((i_1279_ & 0xff0000) * i_1272_
					       & ~0xffffff);
				int i_1281_
				    = (i_1279_ & 0xff00) * i_1273_ & 0xff0000;
				int i_1282_
				    = (i_1279_ & 0xff) * i_1274_ & 0xff00;
				is[i_1263_++]
				    = (i_1280_ | i_1281_ | i_1282_) >>> 8;
				i_1254_ += i_1259_;
			    }
			    i_1255_ += i_1260_;
			    i_1254_ = i_1275_;
			    i_1263_ += i_1264_;
			}
		    } else if (i_1250_ == 3) {
			int i_1283_ = i_1254_;
			for (int i_1284_ = -i_1249_; i_1284_ < 0; i_1284_++) {
			    int i_1285_ = (i_1255_ >> 16) * anInt8985;
			    for (int i_1286_ = -i_1248_; i_1286_ < 0;
				 i_1286_++) {
				int i_1287_ = (anIntArray11415
					       [(i_1254_ >> 16) + i_1285_]);
				int i_1288_ = i_1287_ + i_1251_;
				int i_1289_ = ((i_1287_ & 0xff00ff)
					       + (i_1251_ & 0xff00ff));
				int i_1290_
				    = ((i_1289_ & 0x1000100)
				       + (i_1288_ - i_1289_ & 0x10000));
				is[i_1263_++]
				    = i_1288_ - i_1290_ | i_1290_ - (i_1290_
								     >>> 8);
				i_1254_ += i_1259_;
			    }
			    i_1255_ += i_1260_;
			    i_1254_ = i_1283_;
			    i_1263_ += i_1264_;
			}
		    } else if (i_1250_ == 2) {
			int i_1291_ = i_1251_ >>> 24;
			int i_1292_ = 256 - i_1291_;
			int i_1293_
			    = (i_1251_ & 0xff00ff) * i_1292_ & ~0xff00ff;
			int i_1294_ = (i_1251_ & 0xff00) * i_1292_ & 0xff0000;
			i_1251_ = (i_1293_ | i_1294_) >>> 8;
			int i_1295_ = i_1254_;
			for (int i_1296_ = -i_1249_; i_1296_ < 0; i_1296_++) {
			    int i_1297_ = (i_1255_ >> 16) * anInt8985;
			    for (int i_1298_ = -i_1248_; i_1298_ < 0;
				 i_1298_++) {
				int i_1299_ = (anIntArray11415
					       [(i_1254_ >> 16) + i_1297_]);
				i_1293_ = ((i_1299_ & 0xff00ff) * i_1291_
					   & ~0xff00ff);
				i_1294_
				    = (i_1299_ & 0xff00) * i_1291_ & 0xff0000;
				is[i_1263_++]
				    = ((i_1293_ | i_1294_) >>> 8) + i_1251_;
				i_1254_ += i_1259_;
			    }
			    i_1255_ += i_1260_;
			    i_1254_ = i_1295_;
			    i_1263_ += i_1264_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1252_ == 1) {
		    if (i_1250_ == 1) {
			int i_1300_ = i_1254_;
			for (int i_1301_ = -i_1249_; i_1301_ < 0; i_1301_++) {
			    int i_1302_ = (i_1255_ >> 16) * anInt8985;
			    for (int i_1303_ = -i_1248_; i_1303_ < 0;
				 i_1303_++) {
				int i_1304_ = (anIntArray11415
					       [(i_1254_ >> 16) + i_1302_]);
				if (i_1304_ != 0)
				    is[i_1263_++] = i_1304_;
				else
				    i_1263_++;
				i_1254_ += i_1259_;
			    }
			    i_1255_ += i_1260_;
			    i_1254_ = i_1300_;
			    i_1263_ += i_1264_;
			}
		    } else if (i_1250_ == 0) {
			int i_1305_ = i_1254_;
			if ((i_1251_ & 0xffffff) == 16777215) {
			    int i_1306_ = i_1251_ >>> 24;
			    int i_1307_ = 256 - i_1306_;
			    for (int i_1308_ = -i_1249_; i_1308_ < 0;
				 i_1308_++) {
				int i_1309_ = (i_1255_ >> 16) * anInt8985;
				for (int i_1310_ = -i_1248_; i_1310_ < 0;
				     i_1310_++) {
				    int i_1311_
					= (anIntArray11415
					   [(i_1254_ >> 16) + i_1309_]);
				    if (i_1311_ != 0) {
					int i_1312_ = is[i_1263_];
					is[i_1263_++]
					    = ((((i_1311_ & 0xff00ff) * i_1306_
						 + ((i_1312_ & 0xff00ff)
						    * i_1307_))
						& ~0xff00ff)
					       + (((i_1311_ & 0xff00) * i_1306_
						   + ((i_1312_ & 0xff00)
						      * i_1307_))
						  & 0xff0000)) >> 8;
				    } else
					i_1263_++;
				    i_1254_ += i_1259_;
				}
				i_1255_ += i_1260_;
				i_1254_ = i_1305_;
				i_1263_ += i_1264_;
			    }
			} else {
			    int i_1313_ = (i_1251_ & 0xff0000) >> 16;
			    int i_1314_ = (i_1251_ & 0xff00) >> 8;
			    int i_1315_ = i_1251_ & 0xff;
			    int i_1316_ = i_1251_ >>> 24;
			    int i_1317_ = 256 - i_1316_;
			    for (int i_1318_ = -i_1249_; i_1318_ < 0;
				 i_1318_++) {
				int i_1319_ = (i_1255_ >> 16) * anInt8985;
				for (int i_1320_ = -i_1248_; i_1320_ < 0;
				     i_1320_++) {
				    int i_1321_
					= (anIntArray11415
					   [(i_1254_ >> 16) + i_1319_]);
				    if (i_1321_ != 0) {
					if (i_1316_ != 255) {
					    int i_1322_
						= (((i_1321_ & 0xff0000)
						    * i_1313_)
						   & ~0xffffff);
					    int i_1323_
						= ((i_1321_ & 0xff00) * i_1314_
						   & 0xff0000);
					    int i_1324_
						= ((i_1321_ & 0xff) * i_1315_
						   & 0xff00);
					    i_1321_ = (i_1322_ | i_1323_
						       | i_1324_) >>> 8;
					    int i_1325_ = is[i_1263_];
					    is[i_1263_++]
						= (((((i_1321_ & 0xff00ff)
						      * i_1316_)
						     + ((i_1325_ & 0xff00ff)
							* i_1317_))
						    & ~0xff00ff)
						   + ((((i_1321_ & 0xff00)
							* i_1316_)
						       + ((i_1325_ & 0xff00)
							  * i_1317_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1326_
						= (((i_1321_ & 0xff0000)
						    * i_1313_)
						   & ~0xffffff);
					    int i_1327_
						= ((i_1321_ & 0xff00) * i_1314_
						   & 0xff0000);
					    int i_1328_
						= ((i_1321_ & 0xff) * i_1315_
						   & 0xff00);
					    is[i_1263_++] = (i_1326_ | i_1327_
							     | i_1328_) >>> 8;
					}
				    } else
					i_1263_++;
				    i_1254_ += i_1259_;
				}
				i_1255_ += i_1260_;
				i_1254_ = i_1305_;
				i_1263_ += i_1264_;
			    }
			}
		    } else if (i_1250_ == 3) {
			int i_1329_ = i_1254_;
			int i_1330_ = i_1251_ >>> 24;
			int i_1331_ = 256 - i_1330_;
			for (int i_1332_ = -i_1249_; i_1332_ < 0; i_1332_++) {
			    int i_1333_ = (i_1255_ >> 16) * anInt8985;
			    for (int i_1334_ = -i_1248_; i_1334_ < 0;
				 i_1334_++) {
				int i_1335_ = (anIntArray11415
					       [(i_1254_ >> 16) + i_1333_]);
				int i_1336_ = i_1335_ + i_1251_;
				int i_1337_ = ((i_1335_ & 0xff00ff)
					       + (i_1251_ & 0xff00ff));
				int i_1338_
				    = ((i_1337_ & 0x1000100)
				       + (i_1336_ - i_1337_ & 0x10000));
				i_1338_
				    = i_1336_ - i_1338_ | i_1338_ - (i_1338_
								     >>> 8);
				if (i_1335_ == 0 && i_1330_ != 255) {
				    i_1335_ = i_1338_;
				    i_1338_ = is[i_1263_];
				    i_1338_
					= ((((i_1335_ & 0xff00ff) * i_1330_
					     + (i_1338_ & 0xff00ff) * i_1331_)
					    & ~0xff00ff)
					   + (((i_1335_ & 0xff00) * i_1330_
					       + (i_1338_ & 0xff00) * i_1331_)
					      & 0xff0000)) >> 8;
				}
				is[i_1263_++] = i_1338_;
				i_1254_ += i_1259_;
			    }
			    i_1255_ += i_1260_;
			    i_1254_ = i_1329_;
			    i_1263_ += i_1264_;
			}
		    } else if (i_1250_ == 2) {
			int i_1339_ = i_1251_ >>> 24;
			int i_1340_ = 256 - i_1339_;
			int i_1341_
			    = (i_1251_ & 0xff00ff) * i_1340_ & ~0xff00ff;
			int i_1342_ = (i_1251_ & 0xff00) * i_1340_ & 0xff0000;
			i_1251_ = (i_1341_ | i_1342_) >>> 8;
			int i_1343_ = i_1254_;
			for (int i_1344_ = -i_1249_; i_1344_ < 0; i_1344_++) {
			    int i_1345_ = (i_1255_ >> 16) * anInt8985;
			    for (int i_1346_ = -i_1248_; i_1346_ < 0;
				 i_1346_++) {
				int i_1347_ = (anIntArray11415
					       [(i_1254_ >> 16) + i_1345_]);
				if (i_1347_ != 0) {
				    i_1341_ = ((i_1347_ & 0xff00ff) * i_1339_
					       & ~0xff00ff);
				    i_1342_ = ((i_1347_ & 0xff00) * i_1339_
					       & 0xff0000);
				    is[i_1263_++] = ((i_1341_ | i_1342_)
						     >>> 8) + i_1251_;
				} else
				    i_1263_++;
				i_1254_ += i_1259_;
			    }
			    i_1255_ += i_1260_;
			    i_1254_ = i_1343_;
			    i_1263_ += i_1264_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1252_ == 2) {
		    if (i_1250_ == 1) {
			int i_1348_ = i_1254_;
			for (int i_1349_ = -i_1249_; i_1349_ < 0; i_1349_++) {
			    int i_1350_ = (i_1255_ >> 16) * anInt8985;
			    for (int i_1351_ = -i_1248_; i_1351_ < 0;
				 i_1351_++) {
				int i_1352_ = (anIntArray11415
					       [(i_1254_ >> 16) + i_1350_]);
				if (i_1352_ != 0) {
				    int i_1353_ = is[i_1263_];
				    int i_1354_ = i_1352_ + i_1353_;
				    int i_1355_ = ((i_1352_ & 0xff00ff)
						   + (i_1353_ & 0xff00ff));
				    i_1353_
					= ((i_1355_ & 0x1000100)
					   + (i_1354_ - i_1355_ & 0x10000));
				    is[i_1263_++]
					= (i_1354_ - i_1353_
					   | i_1353_ - (i_1353_ >>> 8));
				} else
				    i_1263_++;
				i_1254_ += i_1259_;
			    }
			    i_1255_ += i_1260_;
			    i_1254_ = i_1348_;
			    i_1263_ += i_1264_;
			}
		    } else if (i_1250_ == 0) {
			int i_1356_ = i_1254_;
			int i_1357_ = (i_1251_ & 0xff0000) >> 16;
			int i_1358_ = (i_1251_ & 0xff00) >> 8;
			int i_1359_ = i_1251_ & 0xff;
			for (int i_1360_ = -i_1249_; i_1360_ < 0; i_1360_++) {
			    int i_1361_ = (i_1255_ >> 16) * anInt8985;
			    for (int i_1362_ = -i_1248_; i_1362_ < 0;
				 i_1362_++) {
				int i_1363_ = (anIntArray11415
					       [(i_1254_ >> 16) + i_1361_]);
				if (i_1363_ != 0) {
				    int i_1364_
					= ((i_1363_ & 0xff0000) * i_1357_
					   & ~0xffffff);
				    int i_1365_ = ((i_1363_ & 0xff00) * i_1358_
						   & 0xff0000);
				    int i_1366_
					= (i_1363_ & 0xff) * i_1359_ & 0xff00;
				    i_1363_
					= (i_1364_ | i_1365_ | i_1366_) >>> 8;
				    int i_1367_ = is[i_1263_];
				    int i_1368_ = i_1363_ + i_1367_;
				    int i_1369_ = ((i_1363_ & 0xff00ff)
						   + (i_1367_ & 0xff00ff));
				    i_1367_
					= ((i_1369_ & 0x1000100)
					   + (i_1368_ - i_1369_ & 0x10000));
				    is[i_1263_++]
					= (i_1368_ - i_1367_
					   | i_1367_ - (i_1367_ >>> 8));
				} else
				    i_1263_++;
				i_1254_ += i_1259_;
			    }
			    i_1255_ += i_1260_;
			    i_1254_ = i_1356_;
			    i_1263_ += i_1264_;
			}
		    } else if (i_1250_ == 3) {
			int i_1370_ = i_1254_;
			for (int i_1371_ = -i_1249_; i_1371_ < 0; i_1371_++) {
			    int i_1372_ = (i_1255_ >> 16) * anInt8985;
			    for (int i_1373_ = -i_1248_; i_1373_ < 0;
				 i_1373_++) {
				int i_1374_ = (anIntArray11415
					       [(i_1254_ >> 16) + i_1372_]);
				int i_1375_ = i_1374_ + i_1251_;
				int i_1376_ = ((i_1374_ & 0xff00ff)
					       + (i_1251_ & 0xff00ff));
				int i_1377_
				    = ((i_1376_ & 0x1000100)
				       + (i_1375_ - i_1376_ & 0x10000));
				i_1374_
				    = i_1375_ - i_1377_ | i_1377_ - (i_1377_
								     >>> 8);
				i_1377_ = is[i_1263_];
				i_1375_ = i_1374_ + i_1377_;
				i_1376_ = (i_1374_ & 0xff00ff) + (i_1377_
								  & 0xff00ff);
				i_1377_ = ((i_1376_ & 0x1000100)
					   + (i_1375_ - i_1376_ & 0x10000));
				is[i_1263_++]
				    = i_1375_ - i_1377_ | i_1377_ - (i_1377_
								     >>> 8);
				i_1254_ += i_1259_;
			    }
			    i_1255_ += i_1260_;
			    i_1254_ = i_1370_;
			    i_1263_ += i_1264_;
			}
		    } else if (i_1250_ == 2) {
			int i_1378_ = i_1251_ >>> 24;
			int i_1379_ = 256 - i_1378_;
			int i_1380_
			    = (i_1251_ & 0xff00ff) * i_1379_ & ~0xff00ff;
			int i_1381_ = (i_1251_ & 0xff00) * i_1379_ & 0xff0000;
			i_1251_ = (i_1380_ | i_1381_) >>> 8;
			int i_1382_ = i_1254_;
			for (int i_1383_ = -i_1249_; i_1383_ < 0; i_1383_++) {
			    int i_1384_ = (i_1255_ >> 16) * anInt8985;
			    for (int i_1385_ = -i_1248_; i_1385_ < 0;
				 i_1385_++) {
				int i_1386_ = (anIntArray11415
					       [(i_1254_ >> 16) + i_1384_]);
				if (i_1386_ != 0) {
				    i_1380_ = ((i_1386_ & 0xff00ff) * i_1378_
					       & ~0xff00ff);
				    i_1381_ = ((i_1386_ & 0xff00) * i_1378_
					       & 0xff0000);
				    i_1386_ = (((i_1380_ | i_1381_) >>> 8)
					       + i_1251_);
				    int i_1387_ = is[i_1263_];
				    int i_1388_ = i_1386_ + i_1387_;
				    int i_1389_ = ((i_1386_ & 0xff00ff)
						   + (i_1387_ & 0xff00ff));
				    i_1387_
					= ((i_1389_ & 0x1000100)
					   + (i_1388_ - i_1389_ & 0x10000));
				    is[i_1263_++]
					= (i_1388_ - i_1387_
					   | i_1387_ - (i_1387_ >>> 8));
				} else
				    i_1263_++;
				i_1254_ += i_1259_;
			    }
			    i_1255_ += i_1260_;
			    i_1254_ = i_1382_;
			    i_1263_ += i_1264_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2652(int i, int i_1390_, int i_1391_, int i_1392_,
			   int[] is, int i_1393_, int i_1394_) {
	i_1394_ -= i_1391_;
	for (int i_1395_ = 0; i_1395_ < i_1392_; i_1395_++) {
	    int i_1396_ = (i_1390_ + i_1395_) * i_1391_ + i;
	    for (int i_1397_ = 0; i_1397_ < i_1391_; i_1397_++)
		anIntArray11415[i_1396_ + i_1397_] = is[i_1393_++];
	    i_1393_ += i_1394_;
	}
    }
    
    public void method2699(int i, int i_1398_, int i_1399_) {
	throw new IllegalStateException("");
    }
    
    void method2718(int i, int i_1400_, int i_1401_, int i_1402_, int i_1403_,
		    int i_1404_, int i_1405_, int i_1406_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (i_1401_ > 0 && i_1402_ > 0) {
	    int[] is = aClass185_Sub2_9016.anIntArray9338;
	    if (is != null) {
		int i_1407_ = 0;
		int i_1408_ = 0;
		int i_1409_ = aClass185_Sub2_9016.anInt9356 * 356365251;
		int i_1410_ = anInt8987 + anInt8985 + anInt8992;
		int i_1411_ = anInt8989 + anInt9002 + anInt8990;
		int i_1412_ = (i_1410_ << 16) / i_1401_;
		int i_1413_ = (i_1411_ << 16) / i_1402_;
		if (anInt8987 > 0) {
		    int i_1414_ = ((anInt8987 << 16) + i_1412_ - 1) / i_1412_;
		    i += i_1414_;
		    i_1407_ += i_1414_ * i_1412_ - (anInt8987 << 16);
		}
		if (anInt8989 > 0) {
		    int i_1415_ = ((anInt8989 << 16) + i_1413_ - 1) / i_1413_;
		    i_1400_ += i_1415_;
		    i_1408_ += i_1415_ * i_1413_ - (anInt8989 << 16);
		}
		if (anInt8985 < i_1410_)
		    i_1401_ = (((anInt8985 << 16) - i_1407_ + i_1412_ - 1)
			       / i_1412_);
		if (anInt9002 < i_1411_)
		    i_1402_ = (((anInt9002 << 16) - i_1408_ + i_1413_ - 1)
			       / i_1413_);
		int i_1416_ = i + i_1400_ * i_1409_;
		int i_1417_ = i_1409_ - i_1401_;
		if (i_1400_ + i_1402_
		    > aClass185_Sub2_9016.anInt9345 * 639238427)
		    i_1402_ -= (i_1400_ + i_1402_
				- aClass185_Sub2_9016.anInt9345 * 639238427);
		if (i_1400_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		    int i_1418_
			= aClass185_Sub2_9016.anInt9344 * 9823353 - i_1400_;
		    i_1402_ -= i_1418_;
		    i_1416_ += i_1418_ * i_1409_;
		    i_1408_ += i_1413_ * i_1418_;
		}
		if (i + i_1401_
		    > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		    int i_1419_
			= (i + i_1401_
			   - aClass185_Sub2_9016.anInt9343 * -1807368365);
		    i_1401_ -= i_1419_;
		    i_1417_ += i_1419_;
		}
		if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		    int i_1420_
			= aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		    i_1401_ -= i_1420_;
		    i_1416_ += i_1420_;
		    i_1407_ += i_1412_ * i_1420_;
		    i_1417_ += i_1420_;
		}
		if (i_1405_ == 0) {
		    if (i_1403_ == 1) {
			int i_1421_ = i_1407_;
			for (int i_1422_ = -i_1402_; i_1422_ < 0; i_1422_++) {
			    int i_1423_ = (i_1408_ >> 16) * anInt8985;
			    for (int i_1424_ = -i_1401_; i_1424_ < 0;
				 i_1424_++) {
				is[i_1416_++] = (anIntArray11415
						 [(i_1407_ >> 16) + i_1423_]);
				i_1407_ += i_1412_;
			    }
			    i_1408_ += i_1413_;
			    i_1407_ = i_1421_;
			    i_1416_ += i_1417_;
			}
		    } else if (i_1403_ == 0) {
			int i_1425_ = (i_1404_ & 0xff0000) >> 16;
			int i_1426_ = (i_1404_ & 0xff00) >> 8;
			int i_1427_ = i_1404_ & 0xff;
			int i_1428_ = i_1407_;
			for (int i_1429_ = -i_1402_; i_1429_ < 0; i_1429_++) {
			    int i_1430_ = (i_1408_ >> 16) * anInt8985;
			    for (int i_1431_ = -i_1401_; i_1431_ < 0;
				 i_1431_++) {
				int i_1432_ = (anIntArray11415
					       [(i_1407_ >> 16) + i_1430_]);
				int i_1433_ = ((i_1432_ & 0xff0000) * i_1425_
					       & ~0xffffff);
				int i_1434_
				    = (i_1432_ & 0xff00) * i_1426_ & 0xff0000;
				int i_1435_
				    = (i_1432_ & 0xff) * i_1427_ & 0xff00;
				is[i_1416_++]
				    = (i_1433_ | i_1434_ | i_1435_) >>> 8;
				i_1407_ += i_1412_;
			    }
			    i_1408_ += i_1413_;
			    i_1407_ = i_1428_;
			    i_1416_ += i_1417_;
			}
		    } else if (i_1403_ == 3) {
			int i_1436_ = i_1407_;
			for (int i_1437_ = -i_1402_; i_1437_ < 0; i_1437_++) {
			    int i_1438_ = (i_1408_ >> 16) * anInt8985;
			    for (int i_1439_ = -i_1401_; i_1439_ < 0;
				 i_1439_++) {
				int i_1440_ = (anIntArray11415
					       [(i_1407_ >> 16) + i_1438_]);
				int i_1441_ = i_1440_ + i_1404_;
				int i_1442_ = ((i_1440_ & 0xff00ff)
					       + (i_1404_ & 0xff00ff));
				int i_1443_
				    = ((i_1442_ & 0x1000100)
				       + (i_1441_ - i_1442_ & 0x10000));
				is[i_1416_++]
				    = i_1441_ - i_1443_ | i_1443_ - (i_1443_
								     >>> 8);
				i_1407_ += i_1412_;
			    }
			    i_1408_ += i_1413_;
			    i_1407_ = i_1436_;
			    i_1416_ += i_1417_;
			}
		    } else if (i_1403_ == 2) {
			int i_1444_ = i_1404_ >>> 24;
			int i_1445_ = 256 - i_1444_;
			int i_1446_
			    = (i_1404_ & 0xff00ff) * i_1445_ & ~0xff00ff;
			int i_1447_ = (i_1404_ & 0xff00) * i_1445_ & 0xff0000;
			i_1404_ = (i_1446_ | i_1447_) >>> 8;
			int i_1448_ = i_1407_;
			for (int i_1449_ = -i_1402_; i_1449_ < 0; i_1449_++) {
			    int i_1450_ = (i_1408_ >> 16) * anInt8985;
			    for (int i_1451_ = -i_1401_; i_1451_ < 0;
				 i_1451_++) {
				int i_1452_ = (anIntArray11415
					       [(i_1407_ >> 16) + i_1450_]);
				i_1446_ = ((i_1452_ & 0xff00ff) * i_1444_
					   & ~0xff00ff);
				i_1447_
				    = (i_1452_ & 0xff00) * i_1444_ & 0xff0000;
				is[i_1416_++]
				    = ((i_1446_ | i_1447_) >>> 8) + i_1404_;
				i_1407_ += i_1412_;
			    }
			    i_1408_ += i_1413_;
			    i_1407_ = i_1448_;
			    i_1416_ += i_1417_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1405_ == 1) {
		    if (i_1403_ == 1) {
			int i_1453_ = i_1407_;
			for (int i_1454_ = -i_1402_; i_1454_ < 0; i_1454_++) {
			    int i_1455_ = (i_1408_ >> 16) * anInt8985;
			    for (int i_1456_ = -i_1401_; i_1456_ < 0;
				 i_1456_++) {
				int i_1457_ = (anIntArray11415
					       [(i_1407_ >> 16) + i_1455_]);
				if (i_1457_ != 0)
				    is[i_1416_++] = i_1457_;
				else
				    i_1416_++;
				i_1407_ += i_1412_;
			    }
			    i_1408_ += i_1413_;
			    i_1407_ = i_1453_;
			    i_1416_ += i_1417_;
			}
		    } else if (i_1403_ == 0) {
			int i_1458_ = i_1407_;
			if ((i_1404_ & 0xffffff) == 16777215) {
			    int i_1459_ = i_1404_ >>> 24;
			    int i_1460_ = 256 - i_1459_;
			    for (int i_1461_ = -i_1402_; i_1461_ < 0;
				 i_1461_++) {
				int i_1462_ = (i_1408_ >> 16) * anInt8985;
				for (int i_1463_ = -i_1401_; i_1463_ < 0;
				     i_1463_++) {
				    int i_1464_
					= (anIntArray11415
					   [(i_1407_ >> 16) + i_1462_]);
				    if (i_1464_ != 0) {
					int i_1465_ = is[i_1416_];
					is[i_1416_++]
					    = ((((i_1464_ & 0xff00ff) * i_1459_
						 + ((i_1465_ & 0xff00ff)
						    * i_1460_))
						& ~0xff00ff)
					       + (((i_1464_ & 0xff00) * i_1459_
						   + ((i_1465_ & 0xff00)
						      * i_1460_))
						  & 0xff0000)) >> 8;
				    } else
					i_1416_++;
				    i_1407_ += i_1412_;
				}
				i_1408_ += i_1413_;
				i_1407_ = i_1458_;
				i_1416_ += i_1417_;
			    }
			} else {
			    int i_1466_ = (i_1404_ & 0xff0000) >> 16;
			    int i_1467_ = (i_1404_ & 0xff00) >> 8;
			    int i_1468_ = i_1404_ & 0xff;
			    int i_1469_ = i_1404_ >>> 24;
			    int i_1470_ = 256 - i_1469_;
			    for (int i_1471_ = -i_1402_; i_1471_ < 0;
				 i_1471_++) {
				int i_1472_ = (i_1408_ >> 16) * anInt8985;
				for (int i_1473_ = -i_1401_; i_1473_ < 0;
				     i_1473_++) {
				    int i_1474_
					= (anIntArray11415
					   [(i_1407_ >> 16) + i_1472_]);
				    if (i_1474_ != 0) {
					if (i_1469_ != 255) {
					    int i_1475_
						= (((i_1474_ & 0xff0000)
						    * i_1466_)
						   & ~0xffffff);
					    int i_1476_
						= ((i_1474_ & 0xff00) * i_1467_
						   & 0xff0000);
					    int i_1477_
						= ((i_1474_ & 0xff) * i_1468_
						   & 0xff00);
					    i_1474_ = (i_1475_ | i_1476_
						       | i_1477_) >>> 8;
					    int i_1478_ = is[i_1416_];
					    is[i_1416_++]
						= (((((i_1474_ & 0xff00ff)
						      * i_1469_)
						     + ((i_1478_ & 0xff00ff)
							* i_1470_))
						    & ~0xff00ff)
						   + ((((i_1474_ & 0xff00)
							* i_1469_)
						       + ((i_1478_ & 0xff00)
							  * i_1470_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1479_
						= (((i_1474_ & 0xff0000)
						    * i_1466_)
						   & ~0xffffff);
					    int i_1480_
						= ((i_1474_ & 0xff00) * i_1467_
						   & 0xff0000);
					    int i_1481_
						= ((i_1474_ & 0xff) * i_1468_
						   & 0xff00);
					    is[i_1416_++] = (i_1479_ | i_1480_
							     | i_1481_) >>> 8;
					}
				    } else
					i_1416_++;
				    i_1407_ += i_1412_;
				}
				i_1408_ += i_1413_;
				i_1407_ = i_1458_;
				i_1416_ += i_1417_;
			    }
			}
		    } else if (i_1403_ == 3) {
			int i_1482_ = i_1407_;
			int i_1483_ = i_1404_ >>> 24;
			int i_1484_ = 256 - i_1483_;
			for (int i_1485_ = -i_1402_; i_1485_ < 0; i_1485_++) {
			    int i_1486_ = (i_1408_ >> 16) * anInt8985;
			    for (int i_1487_ = -i_1401_; i_1487_ < 0;
				 i_1487_++) {
				int i_1488_ = (anIntArray11415
					       [(i_1407_ >> 16) + i_1486_]);
				int i_1489_ = i_1488_ + i_1404_;
				int i_1490_ = ((i_1488_ & 0xff00ff)
					       + (i_1404_ & 0xff00ff));
				int i_1491_
				    = ((i_1490_ & 0x1000100)
				       + (i_1489_ - i_1490_ & 0x10000));
				i_1491_
				    = i_1489_ - i_1491_ | i_1491_ - (i_1491_
								     >>> 8);
				if (i_1488_ == 0 && i_1483_ != 255) {
				    i_1488_ = i_1491_;
				    i_1491_ = is[i_1416_];
				    i_1491_
					= ((((i_1488_ & 0xff00ff) * i_1483_
					     + (i_1491_ & 0xff00ff) * i_1484_)
					    & ~0xff00ff)
					   + (((i_1488_ & 0xff00) * i_1483_
					       + (i_1491_ & 0xff00) * i_1484_)
					      & 0xff0000)) >> 8;
				}
				is[i_1416_++] = i_1491_;
				i_1407_ += i_1412_;
			    }
			    i_1408_ += i_1413_;
			    i_1407_ = i_1482_;
			    i_1416_ += i_1417_;
			}
		    } else if (i_1403_ == 2) {
			int i_1492_ = i_1404_ >>> 24;
			int i_1493_ = 256 - i_1492_;
			int i_1494_
			    = (i_1404_ & 0xff00ff) * i_1493_ & ~0xff00ff;
			int i_1495_ = (i_1404_ & 0xff00) * i_1493_ & 0xff0000;
			i_1404_ = (i_1494_ | i_1495_) >>> 8;
			int i_1496_ = i_1407_;
			for (int i_1497_ = -i_1402_; i_1497_ < 0; i_1497_++) {
			    int i_1498_ = (i_1408_ >> 16) * anInt8985;
			    for (int i_1499_ = -i_1401_; i_1499_ < 0;
				 i_1499_++) {
				int i_1500_ = (anIntArray11415
					       [(i_1407_ >> 16) + i_1498_]);
				if (i_1500_ != 0) {
				    i_1494_ = ((i_1500_ & 0xff00ff) * i_1492_
					       & ~0xff00ff);
				    i_1495_ = ((i_1500_ & 0xff00) * i_1492_
					       & 0xff0000);
				    is[i_1416_++] = ((i_1494_ | i_1495_)
						     >>> 8) + i_1404_;
				} else
				    i_1416_++;
				i_1407_ += i_1412_;
			    }
			    i_1408_ += i_1413_;
			    i_1407_ = i_1496_;
			    i_1416_ += i_1417_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1405_ == 2) {
		    if (i_1403_ == 1) {
			int i_1501_ = i_1407_;
			for (int i_1502_ = -i_1402_; i_1502_ < 0; i_1502_++) {
			    int i_1503_ = (i_1408_ >> 16) * anInt8985;
			    for (int i_1504_ = -i_1401_; i_1504_ < 0;
				 i_1504_++) {
				int i_1505_ = (anIntArray11415
					       [(i_1407_ >> 16) + i_1503_]);
				if (i_1505_ != 0) {
				    int i_1506_ = is[i_1416_];
				    int i_1507_ = i_1505_ + i_1506_;
				    int i_1508_ = ((i_1505_ & 0xff00ff)
						   + (i_1506_ & 0xff00ff));
				    i_1506_
					= ((i_1508_ & 0x1000100)
					   + (i_1507_ - i_1508_ & 0x10000));
				    is[i_1416_++]
					= (i_1507_ - i_1506_
					   | i_1506_ - (i_1506_ >>> 8));
				} else
				    i_1416_++;
				i_1407_ += i_1412_;
			    }
			    i_1408_ += i_1413_;
			    i_1407_ = i_1501_;
			    i_1416_ += i_1417_;
			}
		    } else if (i_1403_ == 0) {
			int i_1509_ = i_1407_;
			int i_1510_ = (i_1404_ & 0xff0000) >> 16;
			int i_1511_ = (i_1404_ & 0xff00) >> 8;
			int i_1512_ = i_1404_ & 0xff;
			for (int i_1513_ = -i_1402_; i_1513_ < 0; i_1513_++) {
			    int i_1514_ = (i_1408_ >> 16) * anInt8985;
			    for (int i_1515_ = -i_1401_; i_1515_ < 0;
				 i_1515_++) {
				int i_1516_ = (anIntArray11415
					       [(i_1407_ >> 16) + i_1514_]);
				if (i_1516_ != 0) {
				    int i_1517_
					= ((i_1516_ & 0xff0000) * i_1510_
					   & ~0xffffff);
				    int i_1518_ = ((i_1516_ & 0xff00) * i_1511_
						   & 0xff0000);
				    int i_1519_
					= (i_1516_ & 0xff) * i_1512_ & 0xff00;
				    i_1516_
					= (i_1517_ | i_1518_ | i_1519_) >>> 8;
				    int i_1520_ = is[i_1416_];
				    int i_1521_ = i_1516_ + i_1520_;
				    int i_1522_ = ((i_1516_ & 0xff00ff)
						   + (i_1520_ & 0xff00ff));
				    i_1520_
					= ((i_1522_ & 0x1000100)
					   + (i_1521_ - i_1522_ & 0x10000));
				    is[i_1416_++]
					= (i_1521_ - i_1520_
					   | i_1520_ - (i_1520_ >>> 8));
				} else
				    i_1416_++;
				i_1407_ += i_1412_;
			    }
			    i_1408_ += i_1413_;
			    i_1407_ = i_1509_;
			    i_1416_ += i_1417_;
			}
		    } else if (i_1403_ == 3) {
			int i_1523_ = i_1407_;
			for (int i_1524_ = -i_1402_; i_1524_ < 0; i_1524_++) {
			    int i_1525_ = (i_1408_ >> 16) * anInt8985;
			    for (int i_1526_ = -i_1401_; i_1526_ < 0;
				 i_1526_++) {
				int i_1527_ = (anIntArray11415
					       [(i_1407_ >> 16) + i_1525_]);
				int i_1528_ = i_1527_ + i_1404_;
				int i_1529_ = ((i_1527_ & 0xff00ff)
					       + (i_1404_ & 0xff00ff));
				int i_1530_
				    = ((i_1529_ & 0x1000100)
				       + (i_1528_ - i_1529_ & 0x10000));
				i_1527_
				    = i_1528_ - i_1530_ | i_1530_ - (i_1530_
								     >>> 8);
				i_1530_ = is[i_1416_];
				i_1528_ = i_1527_ + i_1530_;
				i_1529_ = (i_1527_ & 0xff00ff) + (i_1530_
								  & 0xff00ff);
				i_1530_ = ((i_1529_ & 0x1000100)
					   + (i_1528_ - i_1529_ & 0x10000));
				is[i_1416_++]
				    = i_1528_ - i_1530_ | i_1530_ - (i_1530_
								     >>> 8);
				i_1407_ += i_1412_;
			    }
			    i_1408_ += i_1413_;
			    i_1407_ = i_1523_;
			    i_1416_ += i_1417_;
			}
		    } else if (i_1403_ == 2) {
			int i_1531_ = i_1404_ >>> 24;
			int i_1532_ = 256 - i_1531_;
			int i_1533_
			    = (i_1404_ & 0xff00ff) * i_1532_ & ~0xff00ff;
			int i_1534_ = (i_1404_ & 0xff00) * i_1532_ & 0xff0000;
			i_1404_ = (i_1533_ | i_1534_) >>> 8;
			int i_1535_ = i_1407_;
			for (int i_1536_ = -i_1402_; i_1536_ < 0; i_1536_++) {
			    int i_1537_ = (i_1408_ >> 16) * anInt8985;
			    for (int i_1538_ = -i_1401_; i_1538_ < 0;
				 i_1538_++) {
				int i_1539_ = (anIntArray11415
					       [(i_1407_ >> 16) + i_1537_]);
				if (i_1539_ != 0) {
				    i_1533_ = ((i_1539_ & 0xff00ff) * i_1531_
					       & ~0xff00ff);
				    i_1534_ = ((i_1539_ & 0xff00) * i_1531_
					       & 0xff0000);
				    i_1539_ = (((i_1533_ | i_1534_) >>> 8)
					       + i_1404_);
				    int i_1540_ = is[i_1416_];
				    int i_1541_ = i_1539_ + i_1540_;
				    int i_1542_ = ((i_1539_ & 0xff00ff)
						   + (i_1540_ & 0xff00ff));
				    i_1540_
					= ((i_1542_ & 0x1000100)
					   + (i_1541_ - i_1542_ & 0x10000));
				    is[i_1416_++]
					= (i_1541_ - i_1540_
					   | i_1540_ - (i_1540_ >>> 8));
				} else
				    i_1416_++;
				i_1407_ += i_1412_;
			    }
			    i_1408_ += i_1413_;
			    i_1407_ = i_1535_;
			    i_1416_ += i_1417_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2678(int i, int i_1543_, int i_1544_, int i_1545_,
			   int i_1546_, int i_1547_) {
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is == null)
	    throw new IllegalStateException("");
	for (int i_1548_ = 0; i_1548_ < i_1545_; i_1548_++) {
	    int i_1549_ = (i_1543_ + i_1548_) * anInt8985 + i;
	    int i_1550_ = ((i_1547_ + i_1548_) * (aClass185_Sub2_9016.anInt9356
						  * 356365251)
			   + i_1546_);
	    for (int i_1551_ = 0; i_1551_ < i_1544_; i_1551_++)
		anIntArray11415[i_1549_ + i_1551_] = is[i_1550_ + i_1551_];
	}
    }
    
    void method17954(int i, int i_1552_, int i_1553_, int i_1554_, int[] is,
		     int i_1555_, int i_1556_) {
	i_1556_ -= i_1553_;
	for (int i_1557_ = 0; i_1557_ < i_1554_; i_1557_++) {
	    int i_1558_ = (i_1552_ + i_1557_) * i_1553_ + i;
	    for (int i_1559_ = 0; i_1559_ < i_1553_; i_1559_++)
		is[i_1555_++] = anIntArray11415[i_1558_ + i_1559_];
	    i_1555_ += i_1556_;
	}
    }
    
    void method14509(int i, int i_1560_) {
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    if (anInt9001 == 0) {
		if (anInt9000 == 0) {
		    int i_1561_ = anInt8998;
		    while (i_1561_ < 0) {
			int i_1562_ = anInt8988;
			int i_1563_ = anInt9007;
			int i_1564_ = anInt9003;
			int i_1565_ = anInt8999;
			if (i_1563_ >= 0 && i_1564_ >= 0
			    && i_1563_ - (anInt8985 << 12) < 0
			    && i_1564_ - (anInt9002 << 12) < 0) {
			    for (/**/; i_1565_ < 0; i_1565_++)
				method17952(((i_1564_ >> 12) * anInt8985
					     + (i_1563_ >> 12)),
					    i_1562_++, is, i, i_1560_);
			}
			i_1561_++;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_1566_ = anInt8998;
		    while (i_1566_ < 0) {
			int i_1567_ = anInt8988;
			int i_1568_ = anInt9007;
			int i_1569_ = anInt9003 + anInt9010;
			int i_1570_ = anInt8999;
			if (i_1568_ >= 0 && i_1568_ - (anInt8985 << 12) < 0) {
			    int i_1571_;
			    if ((i_1571_ = i_1569_ - (anInt9002 << 12)) >= 0) {
				i_1571_ = (anInt9000 - i_1571_) / anInt9000;
				i_1570_ += i_1571_;
				i_1569_ += anInt9000 * i_1571_;
				i_1567_ += i_1571_;
			    }
			    if ((i_1571_ = (i_1569_ - anInt9000) / anInt9000)
				> i_1570_)
				i_1570_ = i_1571_;
			    for (/**/; i_1570_ < 0; i_1570_++) {
				method17952(((i_1569_ >> 12) * anInt8985
					     + (i_1568_ >> 12)),
					    i_1567_++, is, i, i_1560_);
				i_1569_ += anInt9000;
			    }
			}
			i_1566_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_1572_ = anInt8998;
		    while (i_1572_ < 0) {
			int i_1573_ = anInt8988;
			int i_1574_ = anInt9007;
			int i_1575_ = anInt9003 + anInt9010;
			int i_1576_ = anInt8999;
			if (i_1574_ >= 0 && i_1574_ - (anInt8985 << 12) < 0) {
			    if (i_1575_ < 0) {
				int i_1577_
				    = (anInt9000 - 1 - i_1575_) / anInt9000;
				i_1576_ += i_1577_;
				i_1575_ += anInt9000 * i_1577_;
				i_1573_ += i_1577_;
			    }
			    int i_1578_;
			    if ((i_1578_ = (1 + i_1575_ - (anInt9002 << 12)
					    - anInt9000) / anInt9000)
				> i_1576_)
				i_1576_ = i_1578_;
			    for (/**/; i_1576_ < 0; i_1576_++) {
				method17952(((i_1575_ >> 12) * anInt8985
					     + (i_1574_ >> 12)),
					    i_1573_++, is, i, i_1560_);
				i_1575_ += anInt9000;
			    }
			}
			i_1572_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9001 < 0) {
		if (anInt9000 == 0) {
		    int i_1579_ = anInt8998;
		    while (i_1579_ < 0) {
			int i_1580_ = anInt8988;
			int i_1581_ = anInt9007 + anInt9009;
			int i_1582_ = anInt9003;
			int i_1583_ = anInt8999;
			if (i_1582_ >= 0 && i_1582_ - (anInt9002 << 12) < 0) {
			    int i_1584_;
			    if ((i_1584_ = i_1581_ - (anInt8985 << 12)) >= 0) {
				i_1584_ = (anInt9001 - i_1584_) / anInt9001;
				i_1583_ += i_1584_;
				i_1581_ += anInt9001 * i_1584_;
				i_1580_ += i_1584_;
			    }
			    if ((i_1584_ = (i_1581_ - anInt9001) / anInt9001)
				> i_1583_)
				i_1583_ = i_1584_;
			    for (/**/; i_1583_ < 0; i_1583_++) {
				method17952(((i_1582_ >> 12) * anInt8985
					     + (i_1581_ >> 12)),
					    i_1580_++, is, i, i_1560_);
				i_1581_ += anInt9001;
			    }
			}
			i_1579_++;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_1585_ = anInt8998;
		    while (i_1585_ < 0) {
			int i_1586_ = anInt8988;
			int i_1587_ = anInt9007 + anInt9009;
			int i_1588_ = anInt9003 + anInt9010;
			int i_1589_ = anInt8999;
			int i_1590_;
			if ((i_1590_ = i_1587_ - (anInt8985 << 12)) >= 0) {
			    i_1590_ = (anInt9001 - i_1590_) / anInt9001;
			    i_1589_ += i_1590_;
			    i_1587_ += anInt9001 * i_1590_;
			    i_1588_ += anInt9000 * i_1590_;
			    i_1586_ += i_1590_;
			}
			if ((i_1590_ = (i_1587_ - anInt9001) / anInt9001)
			    > i_1589_)
			    i_1589_ = i_1590_;
			if ((i_1590_ = i_1588_ - (anInt9002 << 12)) >= 0) {
			    i_1590_ = (anInt9000 - i_1590_) / anInt9000;
			    i_1589_ += i_1590_;
			    i_1587_ += anInt9001 * i_1590_;
			    i_1588_ += anInt9000 * i_1590_;
			    i_1586_ += i_1590_;
			}
			if ((i_1590_ = (i_1588_ - anInt9000) / anInt9000)
			    > i_1589_)
			    i_1589_ = i_1590_;
			for (/**/; i_1589_ < 0; i_1589_++) {
			    method17952((i_1588_ >> 12) * anInt8985 + (i_1587_
								       >> 12),
					i_1586_++, is, i, i_1560_);
			    i_1587_ += anInt9001;
			    i_1588_ += anInt9000;
			}
			i_1585_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_1591_ = anInt8998;
		    while (i_1591_ < 0) {
			int i_1592_ = anInt8988;
			int i_1593_ = anInt9007 + anInt9009;
			int i_1594_ = anInt9003 + anInt9010;
			int i_1595_ = anInt8999;
			int i_1596_;
			if ((i_1596_ = i_1593_ - (anInt8985 << 12)) >= 0) {
			    i_1596_ = (anInt9001 - i_1596_) / anInt9001;
			    i_1595_ += i_1596_;
			    i_1593_ += anInt9001 * i_1596_;
			    i_1594_ += anInt9000 * i_1596_;
			    i_1592_ += i_1596_;
			}
			if ((i_1596_ = (i_1593_ - anInt9001) / anInt9001)
			    > i_1595_)
			    i_1595_ = i_1596_;
			if (i_1594_ < 0) {
			    i_1596_ = (anInt9000 - 1 - i_1594_) / anInt9000;
			    i_1595_ += i_1596_;
			    i_1593_ += anInt9001 * i_1596_;
			    i_1594_ += anInt9000 * i_1596_;
			    i_1592_ += i_1596_;
			}
			if ((i_1596_ = (1 + i_1594_ - (anInt9002 << 12)
					- anInt9000) / anInt9000)
			    > i_1595_)
			    i_1595_ = i_1596_;
			for (/**/; i_1595_ < 0; i_1595_++) {
			    method17952((i_1594_ >> 12) * anInt8985 + (i_1593_
								       >> 12),
					i_1592_++, is, i, i_1560_);
			    i_1593_ += anInt9001;
			    i_1594_ += anInt9000;
			}
			i_1591_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9000 == 0) {
		int i_1597_ = anInt8998;
		while (i_1597_ < 0) {
		    int i_1598_ = anInt8988;
		    int i_1599_ = anInt9007 + anInt9009;
		    int i_1600_ = anInt9003;
		    int i_1601_ = anInt8999;
		    if (i_1600_ >= 0 && i_1600_ - (anInt9002 << 12) < 0) {
			if (i_1599_ < 0) {
			    int i_1602_
				= (anInt9001 - 1 - i_1599_) / anInt9001;
			    i_1601_ += i_1602_;
			    i_1599_ += anInt9001 * i_1602_;
			    i_1598_ += i_1602_;
			}
			int i_1603_;
			if ((i_1603_ = (1 + i_1599_ - (anInt8985 << 12)
					- anInt9001) / anInt9001)
			    > i_1601_)
			    i_1601_ = i_1603_;
			for (/**/; i_1601_ < 0; i_1601_++) {
			    method17952((i_1600_ >> 12) * anInt8985 + (i_1599_
								       >> 12),
					i_1598_++, is, i, i_1560_);
			    i_1599_ += anInt9001;
			}
		    }
		    i_1597_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else if (anInt9000 < 0) {
		for (int i_1604_ = anInt8998; i_1604_ < 0; i_1604_++) {
		    int i_1605_ = anInt8988;
		    int i_1606_ = anInt9007 + anInt9009;
		    int i_1607_ = anInt9003 + anInt9010;
		    int i_1608_ = anInt8999;
		    if (i_1606_ < 0) {
			int i_1609_ = (anInt9001 - 1 - i_1606_) / anInt9001;
			i_1608_ += i_1609_;
			i_1606_ += anInt9001 * i_1609_;
			i_1607_ += anInt9000 * i_1609_;
			i_1605_ += i_1609_;
		    }
		    int i_1610_;
		    if ((i_1610_ = (1 + i_1606_ - (anInt8985 << 12)
				    - anInt9001) / anInt9001)
			> i_1608_)
			i_1608_ = i_1610_;
		    if ((i_1610_ = i_1607_ - (anInt9002 << 12)) >= 0) {
			i_1610_ = (anInt9000 - i_1610_) / anInt9000;
			i_1608_ += i_1610_;
			i_1606_ += anInt9001 * i_1610_;
			i_1607_ += anInt9000 * i_1610_;
			i_1605_ += i_1610_;
		    }
		    if ((i_1610_ = (i_1607_ - anInt9000) / anInt9000)
			> i_1608_)
			i_1608_ = i_1610_;
		    for (/**/; i_1608_ < 0; i_1608_++) {
			method17952((i_1607_ >> 12) * anInt8985 + (i_1606_
								   >> 12),
				    i_1605_++, is, i, i_1560_);
			i_1606_ += anInt9001;
			i_1607_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else {
		for (int i_1611_ = anInt8998; i_1611_ < 0; i_1611_++) {
		    int i_1612_ = anInt8988;
		    int i_1613_ = anInt9007 + anInt9009;
		    int i_1614_ = anInt9003 + anInt9010;
		    int i_1615_ = anInt8999;
		    if (i_1613_ < 0) {
			int i_1616_ = (anInt9001 - 1 - i_1613_) / anInt9001;
			i_1615_ += i_1616_;
			i_1613_ += anInt9001 * i_1616_;
			i_1614_ += anInt9000 * i_1616_;
			i_1612_ += i_1616_;
		    }
		    int i_1617_;
		    if ((i_1617_ = (1 + i_1613_ - (anInt8985 << 12)
				    - anInt9001) / anInt9001)
			> i_1615_)
			i_1615_ = i_1617_;
		    if (i_1614_ < 0) {
			i_1617_ = (anInt9000 - 1 - i_1614_) / anInt9000;
			i_1615_ += i_1617_;
			i_1613_ += anInt9001 * i_1617_;
			i_1614_ += anInt9000 * i_1617_;
			i_1612_ += i_1617_;
		    }
		    if ((i_1617_ = (1 + i_1614_ - (anInt9002 << 12)
				    - anInt9000) / anInt9000)
			> i_1615_)
			i_1615_ = i_1617_;
		    for (/**/; i_1615_ < 0; i_1615_++) {
			method17952((i_1614_ >> 12) * anInt8985 + (i_1613_
								   >> 12),
				    i_1612_++, is, i, i_1560_);
			i_1613_ += anInt9001;
			i_1614_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    }
	}
    }
    
    void method14515(int i, int i_1618_) {
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    if (anInt9001 == 0) {
		if (anInt9000 == 0) {
		    int i_1619_ = anInt8998;
		    while (i_1619_ < 0) {
			int i_1620_ = anInt8988;
			int i_1621_ = anInt9007;
			int i_1622_ = anInt9003;
			int i_1623_ = anInt8999;
			if (i_1621_ >= 0 && i_1622_ >= 0
			    && i_1621_ - (anInt8985 << 12) < 0
			    && i_1622_ - (anInt9002 << 12) < 0) {
			    for (/**/; i_1623_ < 0; i_1623_++)
				method17952(((i_1622_ >> 12) * anInt8985
					     + (i_1621_ >> 12)),
					    i_1620_++, is, i, i_1618_);
			}
			i_1619_++;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_1624_ = anInt8998;
		    while (i_1624_ < 0) {
			int i_1625_ = anInt8988;
			int i_1626_ = anInt9007;
			int i_1627_ = anInt9003 + anInt9010;
			int i_1628_ = anInt8999;
			if (i_1626_ >= 0 && i_1626_ - (anInt8985 << 12) < 0) {
			    int i_1629_;
			    if ((i_1629_ = i_1627_ - (anInt9002 << 12)) >= 0) {
				i_1629_ = (anInt9000 - i_1629_) / anInt9000;
				i_1628_ += i_1629_;
				i_1627_ += anInt9000 * i_1629_;
				i_1625_ += i_1629_;
			    }
			    if ((i_1629_ = (i_1627_ - anInt9000) / anInt9000)
				> i_1628_)
				i_1628_ = i_1629_;
			    for (/**/; i_1628_ < 0; i_1628_++) {
				method17952(((i_1627_ >> 12) * anInt8985
					     + (i_1626_ >> 12)),
					    i_1625_++, is, i, i_1618_);
				i_1627_ += anInt9000;
			    }
			}
			i_1624_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_1630_ = anInt8998;
		    while (i_1630_ < 0) {
			int i_1631_ = anInt8988;
			int i_1632_ = anInt9007;
			int i_1633_ = anInt9003 + anInt9010;
			int i_1634_ = anInt8999;
			if (i_1632_ >= 0 && i_1632_ - (anInt8985 << 12) < 0) {
			    if (i_1633_ < 0) {
				int i_1635_
				    = (anInt9000 - 1 - i_1633_) / anInt9000;
				i_1634_ += i_1635_;
				i_1633_ += anInt9000 * i_1635_;
				i_1631_ += i_1635_;
			    }
			    int i_1636_;
			    if ((i_1636_ = (1 + i_1633_ - (anInt9002 << 12)
					    - anInt9000) / anInt9000)
				> i_1634_)
				i_1634_ = i_1636_;
			    for (/**/; i_1634_ < 0; i_1634_++) {
				method17952(((i_1633_ >> 12) * anInt8985
					     + (i_1632_ >> 12)),
					    i_1631_++, is, i, i_1618_);
				i_1633_ += anInt9000;
			    }
			}
			i_1630_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9001 < 0) {
		if (anInt9000 == 0) {
		    int i_1637_ = anInt8998;
		    while (i_1637_ < 0) {
			int i_1638_ = anInt8988;
			int i_1639_ = anInt9007 + anInt9009;
			int i_1640_ = anInt9003;
			int i_1641_ = anInt8999;
			if (i_1640_ >= 0 && i_1640_ - (anInt9002 << 12) < 0) {
			    int i_1642_;
			    if ((i_1642_ = i_1639_ - (anInt8985 << 12)) >= 0) {
				i_1642_ = (anInt9001 - i_1642_) / anInt9001;
				i_1641_ += i_1642_;
				i_1639_ += anInt9001 * i_1642_;
				i_1638_ += i_1642_;
			    }
			    if ((i_1642_ = (i_1639_ - anInt9001) / anInt9001)
				> i_1641_)
				i_1641_ = i_1642_;
			    for (/**/; i_1641_ < 0; i_1641_++) {
				method17952(((i_1640_ >> 12) * anInt8985
					     + (i_1639_ >> 12)),
					    i_1638_++, is, i, i_1618_);
				i_1639_ += anInt9001;
			    }
			}
			i_1637_++;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_1643_ = anInt8998;
		    while (i_1643_ < 0) {
			int i_1644_ = anInt8988;
			int i_1645_ = anInt9007 + anInt9009;
			int i_1646_ = anInt9003 + anInt9010;
			int i_1647_ = anInt8999;
			int i_1648_;
			if ((i_1648_ = i_1645_ - (anInt8985 << 12)) >= 0) {
			    i_1648_ = (anInt9001 - i_1648_) / anInt9001;
			    i_1647_ += i_1648_;
			    i_1645_ += anInt9001 * i_1648_;
			    i_1646_ += anInt9000 * i_1648_;
			    i_1644_ += i_1648_;
			}
			if ((i_1648_ = (i_1645_ - anInt9001) / anInt9001)
			    > i_1647_)
			    i_1647_ = i_1648_;
			if ((i_1648_ = i_1646_ - (anInt9002 << 12)) >= 0) {
			    i_1648_ = (anInt9000 - i_1648_) / anInt9000;
			    i_1647_ += i_1648_;
			    i_1645_ += anInt9001 * i_1648_;
			    i_1646_ += anInt9000 * i_1648_;
			    i_1644_ += i_1648_;
			}
			if ((i_1648_ = (i_1646_ - anInt9000) / anInt9000)
			    > i_1647_)
			    i_1647_ = i_1648_;
			for (/**/; i_1647_ < 0; i_1647_++) {
			    method17952((i_1646_ >> 12) * anInt8985 + (i_1645_
								       >> 12),
					i_1644_++, is, i, i_1618_);
			    i_1645_ += anInt9001;
			    i_1646_ += anInt9000;
			}
			i_1643_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_1649_ = anInt8998;
		    while (i_1649_ < 0) {
			int i_1650_ = anInt8988;
			int i_1651_ = anInt9007 + anInt9009;
			int i_1652_ = anInt9003 + anInt9010;
			int i_1653_ = anInt8999;
			int i_1654_;
			if ((i_1654_ = i_1651_ - (anInt8985 << 12)) >= 0) {
			    i_1654_ = (anInt9001 - i_1654_) / anInt9001;
			    i_1653_ += i_1654_;
			    i_1651_ += anInt9001 * i_1654_;
			    i_1652_ += anInt9000 * i_1654_;
			    i_1650_ += i_1654_;
			}
			if ((i_1654_ = (i_1651_ - anInt9001) / anInt9001)
			    > i_1653_)
			    i_1653_ = i_1654_;
			if (i_1652_ < 0) {
			    i_1654_ = (anInt9000 - 1 - i_1652_) / anInt9000;
			    i_1653_ += i_1654_;
			    i_1651_ += anInt9001 * i_1654_;
			    i_1652_ += anInt9000 * i_1654_;
			    i_1650_ += i_1654_;
			}
			if ((i_1654_ = (1 + i_1652_ - (anInt9002 << 12)
					- anInt9000) / anInt9000)
			    > i_1653_)
			    i_1653_ = i_1654_;
			for (/**/; i_1653_ < 0; i_1653_++) {
			    method17952((i_1652_ >> 12) * anInt8985 + (i_1651_
								       >> 12),
					i_1650_++, is, i, i_1618_);
			    i_1651_ += anInt9001;
			    i_1652_ += anInt9000;
			}
			i_1649_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9000 == 0) {
		int i_1655_ = anInt8998;
		while (i_1655_ < 0) {
		    int i_1656_ = anInt8988;
		    int i_1657_ = anInt9007 + anInt9009;
		    int i_1658_ = anInt9003;
		    int i_1659_ = anInt8999;
		    if (i_1658_ >= 0 && i_1658_ - (anInt9002 << 12) < 0) {
			if (i_1657_ < 0) {
			    int i_1660_
				= (anInt9001 - 1 - i_1657_) / anInt9001;
			    i_1659_ += i_1660_;
			    i_1657_ += anInt9001 * i_1660_;
			    i_1656_ += i_1660_;
			}
			int i_1661_;
			if ((i_1661_ = (1 + i_1657_ - (anInt8985 << 12)
					- anInt9001) / anInt9001)
			    > i_1659_)
			    i_1659_ = i_1661_;
			for (/**/; i_1659_ < 0; i_1659_++) {
			    method17952((i_1658_ >> 12) * anInt8985 + (i_1657_
								       >> 12),
					i_1656_++, is, i, i_1618_);
			    i_1657_ += anInt9001;
			}
		    }
		    i_1655_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else if (anInt9000 < 0) {
		for (int i_1662_ = anInt8998; i_1662_ < 0; i_1662_++) {
		    int i_1663_ = anInt8988;
		    int i_1664_ = anInt9007 + anInt9009;
		    int i_1665_ = anInt9003 + anInt9010;
		    int i_1666_ = anInt8999;
		    if (i_1664_ < 0) {
			int i_1667_ = (anInt9001 - 1 - i_1664_) / anInt9001;
			i_1666_ += i_1667_;
			i_1664_ += anInt9001 * i_1667_;
			i_1665_ += anInt9000 * i_1667_;
			i_1663_ += i_1667_;
		    }
		    int i_1668_;
		    if ((i_1668_ = (1 + i_1664_ - (anInt8985 << 12)
				    - anInt9001) / anInt9001)
			> i_1666_)
			i_1666_ = i_1668_;
		    if ((i_1668_ = i_1665_ - (anInt9002 << 12)) >= 0) {
			i_1668_ = (anInt9000 - i_1668_) / anInt9000;
			i_1666_ += i_1668_;
			i_1664_ += anInt9001 * i_1668_;
			i_1665_ += anInt9000 * i_1668_;
			i_1663_ += i_1668_;
		    }
		    if ((i_1668_ = (i_1665_ - anInt9000) / anInt9000)
			> i_1666_)
			i_1666_ = i_1668_;
		    for (/**/; i_1666_ < 0; i_1666_++) {
			method17952((i_1665_ >> 12) * anInt8985 + (i_1664_
								   >> 12),
				    i_1663_++, is, i, i_1618_);
			i_1664_ += anInt9001;
			i_1665_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else {
		for (int i_1669_ = anInt8998; i_1669_ < 0; i_1669_++) {
		    int i_1670_ = anInt8988;
		    int i_1671_ = anInt9007 + anInt9009;
		    int i_1672_ = anInt9003 + anInt9010;
		    int i_1673_ = anInt8999;
		    if (i_1671_ < 0) {
			int i_1674_ = (anInt9001 - 1 - i_1671_) / anInt9001;
			i_1673_ += i_1674_;
			i_1671_ += anInt9001 * i_1674_;
			i_1672_ += anInt9000 * i_1674_;
			i_1670_ += i_1674_;
		    }
		    int i_1675_;
		    if ((i_1675_ = (1 + i_1671_ - (anInt8985 << 12)
				    - anInt9001) / anInt9001)
			> i_1673_)
			i_1673_ = i_1675_;
		    if (i_1672_ < 0) {
			i_1675_ = (anInt9000 - 1 - i_1672_) / anInt9000;
			i_1673_ += i_1675_;
			i_1671_ += anInt9001 * i_1675_;
			i_1672_ += anInt9000 * i_1675_;
			i_1670_ += i_1675_;
		    }
		    if ((i_1675_ = (1 + i_1672_ - (anInt9002 << 12)
				    - anInt9000) / anInt9000)
			> i_1673_)
			i_1673_ = i_1675_;
		    for (/**/; i_1673_ < 0; i_1673_++) {
			method17952((i_1672_ >> 12) * anInt8985 + (i_1671_
								   >> 12),
				    i_1670_++, is, i, i_1618_);
			i_1671_ += anInt9001;
			i_1672_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    }
	}
    }
    
    public void method2737(int i, int i_1676_, int i_1677_, int i_1678_,
			   int[] is, int i_1679_, int i_1680_) {
	i_1680_ -= i_1677_;
	for (int i_1681_ = 0; i_1681_ < i_1678_; i_1681_++) {
	    int i_1682_ = (i_1676_ + i_1681_) * i_1677_ + i;
	    for (int i_1683_ = 0; i_1683_ < i_1677_; i_1683_++)
		anIntArray11415[i_1682_ + i_1683_] = is[i_1679_++];
	    i_1679_ += i_1680_;
	}
    }
    
    void method14517(int[] is, int[] is_1684_, int i, int i_1685_) {
	int[] is_1686_ = aClass185_Sub2_9016.anIntArray9338;
	if (is_1686_ != null) {
	    if (anInt9001 == 0) {
		if (anInt9000 == 0) {
		    int i_1687_ = anInt8998;
		    while (i_1687_ < 0) {
			int i_1688_ = i_1687_ + i_1685_;
			if (i_1688_ >= 0) {
			    if (i_1688_ >= is.length)
				break;
			    int i_1689_ = anInt8988;
			    int i_1690_ = anInt9007;
			    int i_1691_ = anInt9003;
			    int i_1692_ = anInt8999;
			    if (i_1690_ >= 0 && i_1691_ >= 0
				&& i_1690_ - (anInt8985 << 12) < 0
				&& i_1691_ - (anInt9002 << 12) < 0) {
				int i_1693_ = is[i_1688_] - i;
				int i_1694_ = -is_1684_[i_1688_];
				int i_1695_ = i_1693_ - (i_1689_ - anInt8988);
				if (i_1695_ > 0) {
				    i_1689_ += i_1695_;
				    i_1692_ += i_1695_;
				    i_1690_ += anInt9001 * i_1695_;
				    i_1691_ += anInt9000 * i_1695_;
				} else
				    i_1694_ -= i_1695_;
				if (i_1692_ < i_1694_)
				    i_1692_ = i_1694_;
				for (/**/; i_1692_ < 0; i_1692_++) {
				    int i_1696_
					= (anIntArray11415
					   [((i_1691_ >> 12) * anInt8985
					     + (i_1690_ >> 12))]);
				    if (i_1696_ != 0)
					is_1686_[i_1689_++] = i_1696_;
				    else
					i_1689_++;
				}
			    }
			}
			i_1687_++;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_1697_ = anInt8998;
		    while (i_1697_ < 0) {
			int i_1698_ = i_1697_ + i_1685_;
			if (i_1698_ >= 0) {
			    if (i_1698_ >= is.length)
				break;
			    int i_1699_ = anInt8988;
			    int i_1700_ = anInt9007;
			    int i_1701_ = anInt9003 + anInt9010;
			    int i_1702_ = anInt8999;
			    if (i_1700_ >= 0
				&& i_1700_ - (anInt8985 << 12) < 0) {
				int i_1703_;
				if ((i_1703_ = i_1701_ - (anInt9002 << 12))
				    >= 0) {
				    i_1703_
					= (anInt9000 - i_1703_) / anInt9000;
				    i_1702_ += i_1703_;
				    i_1701_ += anInt9000 * i_1703_;
				    i_1699_ += i_1703_;
				}
				if ((i_1703_
				     = (i_1701_ - anInt9000) / anInt9000)
				    > i_1702_)
				    i_1702_ = i_1703_;
				int i_1704_ = is[i_1698_] - i;
				int i_1705_ = -is_1684_[i_1698_];
				int i_1706_ = i_1704_ - (i_1699_ - anInt8988);
				if (i_1706_ > 0) {
				    i_1699_ += i_1706_;
				    i_1702_ += i_1706_;
				    i_1700_ += anInt9001 * i_1706_;
				    i_1701_ += anInt9000 * i_1706_;
				} else
				    i_1705_ -= i_1706_;
				if (i_1702_ < i_1705_)
				    i_1702_ = i_1705_;
				for (/**/; i_1702_ < 0; i_1702_++) {
				    int i_1707_
					= (anIntArray11415
					   [((i_1701_ >> 12) * anInt8985
					     + (i_1700_ >> 12))]);
				    if (i_1707_ != 0)
					is_1686_[i_1699_++] = i_1707_;
				    else
					i_1699_++;
				    i_1701_ += anInt9000;
				}
			    }
			}
			i_1697_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_1708_ = anInt8998;
		    while (i_1708_ < 0) {
			int i_1709_ = i_1708_ + i_1685_;
			if (i_1709_ >= 0) {
			    if (i_1709_ >= is.length)
				break;
			    int i_1710_ = anInt8988;
			    int i_1711_ = anInt9007;
			    int i_1712_ = anInt9003 + anInt9010;
			    int i_1713_ = anInt8999;
			    if (i_1711_ >= 0
				&& i_1711_ - (anInt8985 << 12) < 0) {
				if (i_1712_ < 0) {
				    int i_1714_ = ((anInt9000 - 1 - i_1712_)
						   / anInt9000);
				    i_1713_ += i_1714_;
				    i_1712_ += anInt9000 * i_1714_;
				    i_1710_ += i_1714_;
				}
				int i_1715_;
				if ((i_1715_ = (1 + i_1712_ - (anInt9002 << 12)
						- anInt9000) / anInt9000)
				    > i_1713_)
				    i_1713_ = i_1715_;
				int i_1716_ = is[i_1709_] - i;
				int i_1717_ = -is_1684_[i_1709_];
				int i_1718_ = i_1716_ - (i_1710_ - anInt8988);
				if (i_1718_ > 0) {
				    i_1710_ += i_1718_;
				    i_1713_ += i_1718_;
				    i_1711_ += anInt9001 * i_1718_;
				    i_1712_ += anInt9000 * i_1718_;
				} else
				    i_1717_ -= i_1718_;
				if (i_1713_ < i_1717_)
				    i_1713_ = i_1717_;
				for (/**/; i_1713_ < 0; i_1713_++) {
				    int i_1719_
					= (anIntArray11415
					   [((i_1712_ >> 12) * anInt8985
					     + (i_1711_ >> 12))]);
				    if (i_1719_ != 0)
					is_1686_[i_1710_++] = i_1719_;
				    else
					i_1710_++;
				    i_1712_ += anInt9000;
				}
			    }
			}
			i_1708_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9001 < 0) {
		if (anInt9000 == 0) {
		    int i_1720_ = anInt8998;
		    while (i_1720_ < 0) {
			int i_1721_ = i_1720_ + i_1685_;
			if (i_1721_ >= 0) {
			    if (i_1721_ >= is.length)
				break;
			    int i_1722_ = anInt8988;
			    int i_1723_ = anInt9007 + anInt9009;
			    int i_1724_ = anInt9003;
			    int i_1725_ = anInt8999;
			    if (i_1724_ >= 0
				&& i_1724_ - (anInt9002 << 12) < 0) {
				int i_1726_;
				if ((i_1726_ = i_1723_ - (anInt8985 << 12))
				    >= 0) {
				    i_1726_
					= (anInt9001 - i_1726_) / anInt9001;
				    i_1725_ += i_1726_;
				    i_1723_ += anInt9001 * i_1726_;
				    i_1722_ += i_1726_;
				}
				if ((i_1726_
				     = (i_1723_ - anInt9001) / anInt9001)
				    > i_1725_)
				    i_1725_ = i_1726_;
				int i_1727_ = is[i_1721_] - i;
				int i_1728_ = -is_1684_[i_1721_];
				int i_1729_ = i_1727_ - (i_1722_ - anInt8988);
				if (i_1729_ > 0) {
				    i_1722_ += i_1729_;
				    i_1725_ += i_1729_;
				    i_1723_ += anInt9001 * i_1729_;
				    i_1724_ += anInt9000 * i_1729_;
				} else
				    i_1728_ -= i_1729_;
				if (i_1725_ < i_1728_)
				    i_1725_ = i_1728_;
				for (/**/; i_1725_ < 0; i_1725_++) {
				    int i_1730_
					= (anIntArray11415
					   [((i_1724_ >> 12) * anInt8985
					     + (i_1723_ >> 12))]);
				    if (i_1730_ != 0)
					is_1686_[i_1722_++] = i_1730_;
				    else
					i_1722_++;
				    i_1723_ += anInt9001;
				}
			    }
			}
			i_1720_++;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_1731_ = anInt8998;
		    while (i_1731_ < 0) {
			int i_1732_ = i_1731_ + i_1685_;
			if (i_1732_ >= 0) {
			    if (i_1732_ >= is.length)
				break;
			    int i_1733_ = anInt8988;
			    int i_1734_ = anInt9007 + anInt9009;
			    int i_1735_ = anInt9003 + anInt9010;
			    int i_1736_ = anInt8999;
			    int i_1737_;
			    if ((i_1737_ = i_1734_ - (anInt8985 << 12)) >= 0) {
				i_1737_ = (anInt9001 - i_1737_) / anInt9001;
				i_1736_ += i_1737_;
				i_1734_ += anInt9001 * i_1737_;
				i_1735_ += anInt9000 * i_1737_;
				i_1733_ += i_1737_;
			    }
			    if ((i_1737_ = (i_1734_ - anInt9001) / anInt9001)
				> i_1736_)
				i_1736_ = i_1737_;
			    if ((i_1737_ = i_1735_ - (anInt9002 << 12)) >= 0) {
				i_1737_ = (anInt9000 - i_1737_) / anInt9000;
				i_1736_ += i_1737_;
				i_1734_ += anInt9001 * i_1737_;
				i_1735_ += anInt9000 * i_1737_;
				i_1733_ += i_1737_;
			    }
			    if ((i_1737_ = (i_1735_ - anInt9000) / anInt9000)
				> i_1736_)
				i_1736_ = i_1737_;
			    int i_1738_ = is[i_1732_] - i;
			    int i_1739_ = -is_1684_[i_1732_];
			    int i_1740_ = i_1738_ - (i_1733_ - anInt8988);
			    if (i_1740_ > 0) {
				i_1733_ += i_1740_;
				i_1736_ += i_1740_;
				i_1734_ += anInt9001 * i_1740_;
				i_1735_ += anInt9000 * i_1740_;
			    } else
				i_1739_ -= i_1740_;
			    if (i_1736_ < i_1739_)
				i_1736_ = i_1739_;
			    for (/**/; i_1736_ < 0; i_1736_++) {
				int i_1741_ = (anIntArray11415
					       [((i_1735_ >> 12) * anInt8985
						 + (i_1734_ >> 12))]);
				if (i_1741_ != 0)
				    is_1686_[i_1733_++] = i_1741_;
				else
				    i_1733_++;
				i_1734_ += anInt9001;
				i_1735_ += anInt9000;
			    }
			}
			i_1731_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_1742_ = anInt8998;
		    while (i_1742_ < 0) {
			int i_1743_ = i_1742_ + i_1685_;
			if (i_1743_ >= 0) {
			    if (i_1743_ >= is.length)
				break;
			    int i_1744_ = anInt8988;
			    int i_1745_ = anInt9007 + anInt9009;
			    int i_1746_ = anInt9003 + anInt9010;
			    int i_1747_ = anInt8999;
			    int i_1748_;
			    if ((i_1748_ = i_1745_ - (anInt8985 << 12)) >= 0) {
				i_1748_ = (anInt9001 - i_1748_) / anInt9001;
				i_1747_ += i_1748_;
				i_1745_ += anInt9001 * i_1748_;
				i_1746_ += anInt9000 * i_1748_;
				i_1744_ += i_1748_;
			    }
			    if ((i_1748_ = (i_1745_ - anInt9001) / anInt9001)
				> i_1747_)
				i_1747_ = i_1748_;
			    if (i_1746_ < 0) {
				i_1748_
				    = (anInt9000 - 1 - i_1746_) / anInt9000;
				i_1747_ += i_1748_;
				i_1745_ += anInt9001 * i_1748_;
				i_1746_ += anInt9000 * i_1748_;
				i_1744_ += i_1748_;
			    }
			    if ((i_1748_ = (1 + i_1746_ - (anInt9002 << 12)
					    - anInt9000) / anInt9000)
				> i_1747_)
				i_1747_ = i_1748_;
			    int i_1749_ = is[i_1743_] - i;
			    int i_1750_ = -is_1684_[i_1743_];
			    int i_1751_ = i_1749_ - (i_1744_ - anInt8988);
			    if (i_1751_ > 0) {
				i_1744_ += i_1751_;
				i_1747_ += i_1751_;
				i_1745_ += anInt9001 * i_1751_;
				i_1746_ += anInt9000 * i_1751_;
			    } else
				i_1750_ -= i_1751_;
			    if (i_1747_ < i_1750_)
				i_1747_ = i_1750_;
			    for (/**/; i_1747_ < 0; i_1747_++) {
				int i_1752_ = (anIntArray11415
					       [((i_1746_ >> 12) * anInt8985
						 + (i_1745_ >> 12))]);
				if (i_1752_ != 0)
				    is_1686_[i_1744_++] = i_1752_;
				else
				    i_1744_++;
				i_1745_ += anInt9001;
				i_1746_ += anInt9000;
			    }
			}
			i_1742_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9000 == 0) {
		int i_1753_ = anInt8998;
		while (i_1753_ < 0) {
		    int i_1754_ = i_1753_ + i_1685_;
		    if (i_1754_ >= 0) {
			if (i_1754_ >= is.length)
			    break;
			int i_1755_ = anInt8988;
			int i_1756_ = anInt9007 + anInt9009;
			int i_1757_ = anInt9003;
			int i_1758_ = anInt8999;
			if (i_1757_ >= 0 && i_1757_ - (anInt9002 << 12) < 0) {
			    if (i_1756_ < 0) {
				int i_1759_
				    = (anInt9001 - 1 - i_1756_) / anInt9001;
				i_1758_ += i_1759_;
				i_1756_ += anInt9001 * i_1759_;
				i_1755_ += i_1759_;
			    }
			    int i_1760_;
			    if ((i_1760_ = (1 + i_1756_ - (anInt8985 << 12)
					    - anInt9001) / anInt9001)
				> i_1758_)
				i_1758_ = i_1760_;
			    int i_1761_ = is[i_1754_] - i;
			    int i_1762_ = -is_1684_[i_1754_];
			    int i_1763_ = i_1761_ - (i_1755_ - anInt8988);
			    if (i_1763_ > 0) {
				i_1755_ += i_1763_;
				i_1758_ += i_1763_;
				i_1756_ += anInt9001 * i_1763_;
				i_1757_ += anInt9000 * i_1763_;
			    } else
				i_1762_ -= i_1763_;
			    if (i_1758_ < i_1762_)
				i_1758_ = i_1762_;
			    for (/**/; i_1758_ < 0; i_1758_++) {
				int i_1764_ = (anIntArray11415
					       [((i_1757_ >> 12) * anInt8985
						 + (i_1756_ >> 12))]);
				if (i_1764_ != 0)
				    is_1686_[i_1755_++] = i_1764_;
				else
				    i_1755_++;
				i_1756_ += anInt9001;
			    }
			}
		    }
		    i_1753_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else if (anInt9000 < 0) {
		int i_1765_ = anInt8998;
		while (i_1765_ < 0) {
		    int i_1766_ = i_1765_ + i_1685_;
		    if (i_1766_ >= 0) {
			if (i_1766_ >= is.length)
			    break;
			int i_1767_ = anInt8988;
			int i_1768_ = anInt9007 + anInt9009;
			int i_1769_ = anInt9003 + anInt9010;
			int i_1770_ = anInt8999;
			if (i_1768_ < 0) {
			    int i_1771_
				= (anInt9001 - 1 - i_1768_) / anInt9001;
			    i_1770_ += i_1771_;
			    i_1768_ += anInt9001 * i_1771_;
			    i_1769_ += anInt9000 * i_1771_;
			    i_1767_ += i_1771_;
			}
			int i_1772_;
			if ((i_1772_ = (1 + i_1768_ - (anInt8985 << 12)
					- anInt9001) / anInt9001)
			    > i_1770_)
			    i_1770_ = i_1772_;
			if ((i_1772_ = i_1769_ - (anInt9002 << 12)) >= 0) {
			    i_1772_ = (anInt9000 - i_1772_) / anInt9000;
			    i_1770_ += i_1772_;
			    i_1768_ += anInt9001 * i_1772_;
			    i_1769_ += anInt9000 * i_1772_;
			    i_1767_ += i_1772_;
			}
			if ((i_1772_ = (i_1769_ - anInt9000) / anInt9000)
			    > i_1770_)
			    i_1770_ = i_1772_;
			int i_1773_ = is[i_1766_] - i;
			int i_1774_ = -is_1684_[i_1766_];
			int i_1775_ = i_1773_ - (i_1767_ - anInt8988);
			if (i_1775_ > 0) {
			    i_1767_ += i_1775_;
			    i_1770_ += i_1775_;
			    i_1768_ += anInt9001 * i_1775_;
			    i_1769_ += anInt9000 * i_1775_;
			} else
			    i_1774_ -= i_1775_;
			if (i_1770_ < i_1774_)
			    i_1770_ = i_1774_;
			for (/**/; i_1770_ < 0; i_1770_++) {
			    int i_1776_
				= (anIntArray11415
				   [(i_1769_ >> 12) * anInt8985 + (i_1768_
								   >> 12)]);
			    if (i_1776_ != 0)
				is_1686_[i_1767_++] = i_1776_;
			    else
				i_1767_++;
			    i_1768_ += anInt9001;
			    i_1769_ += anInt9000;
			}
		    }
		    i_1765_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else {
		int i_1777_ = anInt8998;
		while (i_1777_ < 0) {
		    int i_1778_ = i_1777_ + i_1685_;
		    if (i_1778_ >= 0) {
			if (i_1778_ >= is.length)
			    break;
			int i_1779_ = anInt8988;
			int i_1780_ = anInt9007 + anInt9009;
			int i_1781_ = anInt9003 + anInt9010;
			int i_1782_ = anInt8999;
			if (i_1780_ < 0) {
			    int i_1783_
				= (anInt9001 - 1 - i_1780_) / anInt9001;
			    i_1782_ += i_1783_;
			    i_1780_ += anInt9001 * i_1783_;
			    i_1781_ += anInt9000 * i_1783_;
			    i_1779_ += i_1783_;
			}
			int i_1784_;
			if ((i_1784_ = (1 + i_1780_ - (anInt8985 << 12)
					- anInt9001) / anInt9001)
			    > i_1782_)
			    i_1782_ = i_1784_;
			if (i_1781_ < 0) {
			    i_1784_ = (anInt9000 - 1 - i_1781_) / anInt9000;
			    i_1782_ += i_1784_;
			    i_1780_ += anInt9001 * i_1784_;
			    i_1781_ += anInt9000 * i_1784_;
			    i_1779_ += i_1784_;
			}
			if ((i_1784_ = (1 + i_1781_ - (anInt9002 << 12)
					- anInt9000) / anInt9000)
			    > i_1782_)
			    i_1782_ = i_1784_;
			int i_1785_ = is[i_1778_] - i;
			int i_1786_ = -is_1684_[i_1778_];
			int i_1787_ = i_1785_ - (i_1779_ - anInt8988);
			if (i_1787_ > 0) {
			    i_1779_ += i_1787_;
			    i_1782_ += i_1787_;
			    i_1780_ += anInt9001 * i_1787_;
			    i_1781_ += anInt9000 * i_1787_;
			} else
			    i_1786_ -= i_1787_;
			if (i_1782_ < i_1786_)
			    i_1782_ = i_1786_;
			for (/**/; i_1782_ < 0; i_1782_++) {
			    int i_1788_
				= (anIntArray11415
				   [(i_1781_ >> 12) * anInt8985 + (i_1780_
								   >> 12)]);
			    if (i_1788_ != 0)
				is_1686_[i_1779_++] = i_1788_;
			    else
				i_1779_++;
			    i_1780_ += anInt9001;
			    i_1781_ += anInt9000;
			}
		    }
		    i_1777_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    }
	}
    }
    
    void method14519(int i, int i_1789_) {
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    if (anInt9001 == 0) {
		if (anInt9000 == 0) {
		    int i_1790_ = anInt8998;
		    while (i_1790_ < 0) {
			int i_1791_ = anInt8988;
			int i_1792_ = anInt9007;
			int i_1793_ = anInt9003;
			int i_1794_ = anInt8999;
			if (i_1792_ >= 0 && i_1793_ >= 0
			    && i_1792_ - (anInt8985 << 12) < 0
			    && i_1793_ - (anInt9002 << 12) < 0) {
			    for (/**/; i_1794_ < 0; i_1794_++)
				method17952(((i_1793_ >> 12) * anInt8985
					     + (i_1792_ >> 12)),
					    i_1791_++, is, i, i_1789_);
			}
			i_1790_++;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_1795_ = anInt8998;
		    while (i_1795_ < 0) {
			int i_1796_ = anInt8988;
			int i_1797_ = anInt9007;
			int i_1798_ = anInt9003 + anInt9010;
			int i_1799_ = anInt8999;
			if (i_1797_ >= 0 && i_1797_ - (anInt8985 << 12) < 0) {
			    int i_1800_;
			    if ((i_1800_ = i_1798_ - (anInt9002 << 12)) >= 0) {
				i_1800_ = (anInt9000 - i_1800_) / anInt9000;
				i_1799_ += i_1800_;
				i_1798_ += anInt9000 * i_1800_;
				i_1796_ += i_1800_;
			    }
			    if ((i_1800_ = (i_1798_ - anInt9000) / anInt9000)
				> i_1799_)
				i_1799_ = i_1800_;
			    for (/**/; i_1799_ < 0; i_1799_++) {
				method17952(((i_1798_ >> 12) * anInt8985
					     + (i_1797_ >> 12)),
					    i_1796_++, is, i, i_1789_);
				i_1798_ += anInt9000;
			    }
			}
			i_1795_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_1801_ = anInt8998;
		    while (i_1801_ < 0) {
			int i_1802_ = anInt8988;
			int i_1803_ = anInt9007;
			int i_1804_ = anInt9003 + anInt9010;
			int i_1805_ = anInt8999;
			if (i_1803_ >= 0 && i_1803_ - (anInt8985 << 12) < 0) {
			    if (i_1804_ < 0) {
				int i_1806_
				    = (anInt9000 - 1 - i_1804_) / anInt9000;
				i_1805_ += i_1806_;
				i_1804_ += anInt9000 * i_1806_;
				i_1802_ += i_1806_;
			    }
			    int i_1807_;
			    if ((i_1807_ = (1 + i_1804_ - (anInt9002 << 12)
					    - anInt9000) / anInt9000)
				> i_1805_)
				i_1805_ = i_1807_;
			    for (/**/; i_1805_ < 0; i_1805_++) {
				method17952(((i_1804_ >> 12) * anInt8985
					     + (i_1803_ >> 12)),
					    i_1802_++, is, i, i_1789_);
				i_1804_ += anInt9000;
			    }
			}
			i_1801_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9001 < 0) {
		if (anInt9000 == 0) {
		    int i_1808_ = anInt8998;
		    while (i_1808_ < 0) {
			int i_1809_ = anInt8988;
			int i_1810_ = anInt9007 + anInt9009;
			int i_1811_ = anInt9003;
			int i_1812_ = anInt8999;
			if (i_1811_ >= 0 && i_1811_ - (anInt9002 << 12) < 0) {
			    int i_1813_;
			    if ((i_1813_ = i_1810_ - (anInt8985 << 12)) >= 0) {
				i_1813_ = (anInt9001 - i_1813_) / anInt9001;
				i_1812_ += i_1813_;
				i_1810_ += anInt9001 * i_1813_;
				i_1809_ += i_1813_;
			    }
			    if ((i_1813_ = (i_1810_ - anInt9001) / anInt9001)
				> i_1812_)
				i_1812_ = i_1813_;
			    for (/**/; i_1812_ < 0; i_1812_++) {
				method17952(((i_1811_ >> 12) * anInt8985
					     + (i_1810_ >> 12)),
					    i_1809_++, is, i, i_1789_);
				i_1810_ += anInt9001;
			    }
			}
			i_1808_++;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_1814_ = anInt8998;
		    while (i_1814_ < 0) {
			int i_1815_ = anInt8988;
			int i_1816_ = anInt9007 + anInt9009;
			int i_1817_ = anInt9003 + anInt9010;
			int i_1818_ = anInt8999;
			int i_1819_;
			if ((i_1819_ = i_1816_ - (anInt8985 << 12)) >= 0) {
			    i_1819_ = (anInt9001 - i_1819_) / anInt9001;
			    i_1818_ += i_1819_;
			    i_1816_ += anInt9001 * i_1819_;
			    i_1817_ += anInt9000 * i_1819_;
			    i_1815_ += i_1819_;
			}
			if ((i_1819_ = (i_1816_ - anInt9001) / anInt9001)
			    > i_1818_)
			    i_1818_ = i_1819_;
			if ((i_1819_ = i_1817_ - (anInt9002 << 12)) >= 0) {
			    i_1819_ = (anInt9000 - i_1819_) / anInt9000;
			    i_1818_ += i_1819_;
			    i_1816_ += anInt9001 * i_1819_;
			    i_1817_ += anInt9000 * i_1819_;
			    i_1815_ += i_1819_;
			}
			if ((i_1819_ = (i_1817_ - anInt9000) / anInt9000)
			    > i_1818_)
			    i_1818_ = i_1819_;
			for (/**/; i_1818_ < 0; i_1818_++) {
			    method17952((i_1817_ >> 12) * anInt8985 + (i_1816_
								       >> 12),
					i_1815_++, is, i, i_1789_);
			    i_1816_ += anInt9001;
			    i_1817_ += anInt9000;
			}
			i_1814_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_1820_ = anInt8998;
		    while (i_1820_ < 0) {
			int i_1821_ = anInt8988;
			int i_1822_ = anInt9007 + anInt9009;
			int i_1823_ = anInt9003 + anInt9010;
			int i_1824_ = anInt8999;
			int i_1825_;
			if ((i_1825_ = i_1822_ - (anInt8985 << 12)) >= 0) {
			    i_1825_ = (anInt9001 - i_1825_) / anInt9001;
			    i_1824_ += i_1825_;
			    i_1822_ += anInt9001 * i_1825_;
			    i_1823_ += anInt9000 * i_1825_;
			    i_1821_ += i_1825_;
			}
			if ((i_1825_ = (i_1822_ - anInt9001) / anInt9001)
			    > i_1824_)
			    i_1824_ = i_1825_;
			if (i_1823_ < 0) {
			    i_1825_ = (anInt9000 - 1 - i_1823_) / anInt9000;
			    i_1824_ += i_1825_;
			    i_1822_ += anInt9001 * i_1825_;
			    i_1823_ += anInt9000 * i_1825_;
			    i_1821_ += i_1825_;
			}
			if ((i_1825_ = (1 + i_1823_ - (anInt9002 << 12)
					- anInt9000) / anInt9000)
			    > i_1824_)
			    i_1824_ = i_1825_;
			for (/**/; i_1824_ < 0; i_1824_++) {
			    method17952((i_1823_ >> 12) * anInt8985 + (i_1822_
								       >> 12),
					i_1821_++, is, i, i_1789_);
			    i_1822_ += anInt9001;
			    i_1823_ += anInt9000;
			}
			i_1820_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9000 == 0) {
		int i_1826_ = anInt8998;
		while (i_1826_ < 0) {
		    int i_1827_ = anInt8988;
		    int i_1828_ = anInt9007 + anInt9009;
		    int i_1829_ = anInt9003;
		    int i_1830_ = anInt8999;
		    if (i_1829_ >= 0 && i_1829_ - (anInt9002 << 12) < 0) {
			if (i_1828_ < 0) {
			    int i_1831_
				= (anInt9001 - 1 - i_1828_) / anInt9001;
			    i_1830_ += i_1831_;
			    i_1828_ += anInt9001 * i_1831_;
			    i_1827_ += i_1831_;
			}
			int i_1832_;
			if ((i_1832_ = (1 + i_1828_ - (anInt8985 << 12)
					- anInt9001) / anInt9001)
			    > i_1830_)
			    i_1830_ = i_1832_;
			for (/**/; i_1830_ < 0; i_1830_++) {
			    method17952((i_1829_ >> 12) * anInt8985 + (i_1828_
								       >> 12),
					i_1827_++, is, i, i_1789_);
			    i_1828_ += anInt9001;
			}
		    }
		    i_1826_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else if (anInt9000 < 0) {
		for (int i_1833_ = anInt8998; i_1833_ < 0; i_1833_++) {
		    int i_1834_ = anInt8988;
		    int i_1835_ = anInt9007 + anInt9009;
		    int i_1836_ = anInt9003 + anInt9010;
		    int i_1837_ = anInt8999;
		    if (i_1835_ < 0) {
			int i_1838_ = (anInt9001 - 1 - i_1835_) / anInt9001;
			i_1837_ += i_1838_;
			i_1835_ += anInt9001 * i_1838_;
			i_1836_ += anInt9000 * i_1838_;
			i_1834_ += i_1838_;
		    }
		    int i_1839_;
		    if ((i_1839_ = (1 + i_1835_ - (anInt8985 << 12)
				    - anInt9001) / anInt9001)
			> i_1837_)
			i_1837_ = i_1839_;
		    if ((i_1839_ = i_1836_ - (anInt9002 << 12)) >= 0) {
			i_1839_ = (anInt9000 - i_1839_) / anInt9000;
			i_1837_ += i_1839_;
			i_1835_ += anInt9001 * i_1839_;
			i_1836_ += anInt9000 * i_1839_;
			i_1834_ += i_1839_;
		    }
		    if ((i_1839_ = (i_1836_ - anInt9000) / anInt9000)
			> i_1837_)
			i_1837_ = i_1839_;
		    for (/**/; i_1837_ < 0; i_1837_++) {
			method17952((i_1836_ >> 12) * anInt8985 + (i_1835_
								   >> 12),
				    i_1834_++, is, i, i_1789_);
			i_1835_ += anInt9001;
			i_1836_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else {
		for (int i_1840_ = anInt8998; i_1840_ < 0; i_1840_++) {
		    int i_1841_ = anInt8988;
		    int i_1842_ = anInt9007 + anInt9009;
		    int i_1843_ = anInt9003 + anInt9010;
		    int i_1844_ = anInt8999;
		    if (i_1842_ < 0) {
			int i_1845_ = (anInt9001 - 1 - i_1842_) / anInt9001;
			i_1844_ += i_1845_;
			i_1842_ += anInt9001 * i_1845_;
			i_1843_ += anInt9000 * i_1845_;
			i_1841_ += i_1845_;
		    }
		    int i_1846_;
		    if ((i_1846_ = (1 + i_1842_ - (anInt8985 << 12)
				    - anInt9001) / anInt9001)
			> i_1844_)
			i_1844_ = i_1846_;
		    if (i_1843_ < 0) {
			i_1846_ = (anInt9000 - 1 - i_1843_) / anInt9000;
			i_1844_ += i_1846_;
			i_1842_ += anInt9001 * i_1846_;
			i_1843_ += anInt9000 * i_1846_;
			i_1841_ += i_1846_;
		    }
		    if ((i_1846_ = (1 + i_1843_ - (anInt9002 << 12)
				    - anInt9000) / anInt9000)
			> i_1844_)
			i_1844_ = i_1846_;
		    for (/**/; i_1844_ < 0; i_1844_++) {
			method17952((i_1843_ >> 12) * anInt8985 + (i_1842_
								   >> 12),
				    i_1841_++, is, i, i_1789_);
			i_1842_ += anInt9001;
			i_1843_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    }
	}
    }
    
    void method2687(int i, int i_1847_, int i_1848_, int i_1849_, int i_1850_,
		    int i_1851_, int i_1852_, int i_1853_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (i_1848_ > 0 && i_1849_ > 0) {
	    int[] is = aClass185_Sub2_9016.anIntArray9338;
	    if (is != null) {
		int i_1854_ = 0;
		int i_1855_ = 0;
		int i_1856_ = aClass185_Sub2_9016.anInt9356 * 356365251;
		int i_1857_ = anInt8987 + anInt8985 + anInt8992;
		int i_1858_ = anInt8989 + anInt9002 + anInt8990;
		int i_1859_ = (i_1857_ << 16) / i_1848_;
		int i_1860_ = (i_1858_ << 16) / i_1849_;
		if (anInt8987 > 0) {
		    int i_1861_ = ((anInt8987 << 16) + i_1859_ - 1) / i_1859_;
		    i += i_1861_;
		    i_1854_ += i_1861_ * i_1859_ - (anInt8987 << 16);
		}
		if (anInt8989 > 0) {
		    int i_1862_ = ((anInt8989 << 16) + i_1860_ - 1) / i_1860_;
		    i_1847_ += i_1862_;
		    i_1855_ += i_1862_ * i_1860_ - (anInt8989 << 16);
		}
		if (anInt8985 < i_1857_)
		    i_1848_ = (((anInt8985 << 16) - i_1854_ + i_1859_ - 1)
			       / i_1859_);
		if (anInt9002 < i_1858_)
		    i_1849_ = (((anInt9002 << 16) - i_1855_ + i_1860_ - 1)
			       / i_1860_);
		int i_1863_ = i + i_1847_ * i_1856_;
		int i_1864_ = i_1856_ - i_1848_;
		if (i_1847_ + i_1849_
		    > aClass185_Sub2_9016.anInt9345 * 639238427)
		    i_1849_ -= (i_1847_ + i_1849_
				- aClass185_Sub2_9016.anInt9345 * 639238427);
		if (i_1847_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		    int i_1865_
			= aClass185_Sub2_9016.anInt9344 * 9823353 - i_1847_;
		    i_1849_ -= i_1865_;
		    i_1863_ += i_1865_ * i_1856_;
		    i_1855_ += i_1860_ * i_1865_;
		}
		if (i + i_1848_
		    > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		    int i_1866_
			= (i + i_1848_
			   - aClass185_Sub2_9016.anInt9343 * -1807368365);
		    i_1848_ -= i_1866_;
		    i_1864_ += i_1866_;
		}
		if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		    int i_1867_
			= aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		    i_1848_ -= i_1867_;
		    i_1863_ += i_1867_;
		    i_1854_ += i_1859_ * i_1867_;
		    i_1864_ += i_1867_;
		}
		if (i_1852_ == 0) {
		    if (i_1850_ == 1) {
			int i_1868_ = i_1854_;
			for (int i_1869_ = -i_1849_; i_1869_ < 0; i_1869_++) {
			    int i_1870_ = (i_1855_ >> 16) * anInt8985;
			    for (int i_1871_ = -i_1848_; i_1871_ < 0;
				 i_1871_++) {
				is[i_1863_++] = (anIntArray11415
						 [(i_1854_ >> 16) + i_1870_]);
				i_1854_ += i_1859_;
			    }
			    i_1855_ += i_1860_;
			    i_1854_ = i_1868_;
			    i_1863_ += i_1864_;
			}
		    } else if (i_1850_ == 0) {
			int i_1872_ = (i_1851_ & 0xff0000) >> 16;
			int i_1873_ = (i_1851_ & 0xff00) >> 8;
			int i_1874_ = i_1851_ & 0xff;
			int i_1875_ = i_1854_;
			for (int i_1876_ = -i_1849_; i_1876_ < 0; i_1876_++) {
			    int i_1877_ = (i_1855_ >> 16) * anInt8985;
			    for (int i_1878_ = -i_1848_; i_1878_ < 0;
				 i_1878_++) {
				int i_1879_ = (anIntArray11415
					       [(i_1854_ >> 16) + i_1877_]);
				int i_1880_ = ((i_1879_ & 0xff0000) * i_1872_
					       & ~0xffffff);
				int i_1881_
				    = (i_1879_ & 0xff00) * i_1873_ & 0xff0000;
				int i_1882_
				    = (i_1879_ & 0xff) * i_1874_ & 0xff00;
				is[i_1863_++]
				    = (i_1880_ | i_1881_ | i_1882_) >>> 8;
				i_1854_ += i_1859_;
			    }
			    i_1855_ += i_1860_;
			    i_1854_ = i_1875_;
			    i_1863_ += i_1864_;
			}
		    } else if (i_1850_ == 3) {
			int i_1883_ = i_1854_;
			for (int i_1884_ = -i_1849_; i_1884_ < 0; i_1884_++) {
			    int i_1885_ = (i_1855_ >> 16) * anInt8985;
			    for (int i_1886_ = -i_1848_; i_1886_ < 0;
				 i_1886_++) {
				int i_1887_ = (anIntArray11415
					       [(i_1854_ >> 16) + i_1885_]);
				int i_1888_ = i_1887_ + i_1851_;
				int i_1889_ = ((i_1887_ & 0xff00ff)
					       + (i_1851_ & 0xff00ff));
				int i_1890_
				    = ((i_1889_ & 0x1000100)
				       + (i_1888_ - i_1889_ & 0x10000));
				is[i_1863_++]
				    = i_1888_ - i_1890_ | i_1890_ - (i_1890_
								     >>> 8);
				i_1854_ += i_1859_;
			    }
			    i_1855_ += i_1860_;
			    i_1854_ = i_1883_;
			    i_1863_ += i_1864_;
			}
		    } else if (i_1850_ == 2) {
			int i_1891_ = i_1851_ >>> 24;
			int i_1892_ = 256 - i_1891_;
			int i_1893_
			    = (i_1851_ & 0xff00ff) * i_1892_ & ~0xff00ff;
			int i_1894_ = (i_1851_ & 0xff00) * i_1892_ & 0xff0000;
			i_1851_ = (i_1893_ | i_1894_) >>> 8;
			int i_1895_ = i_1854_;
			for (int i_1896_ = -i_1849_; i_1896_ < 0; i_1896_++) {
			    int i_1897_ = (i_1855_ >> 16) * anInt8985;
			    for (int i_1898_ = -i_1848_; i_1898_ < 0;
				 i_1898_++) {
				int i_1899_ = (anIntArray11415
					       [(i_1854_ >> 16) + i_1897_]);
				i_1893_ = ((i_1899_ & 0xff00ff) * i_1891_
					   & ~0xff00ff);
				i_1894_
				    = (i_1899_ & 0xff00) * i_1891_ & 0xff0000;
				is[i_1863_++]
				    = ((i_1893_ | i_1894_) >>> 8) + i_1851_;
				i_1854_ += i_1859_;
			    }
			    i_1855_ += i_1860_;
			    i_1854_ = i_1895_;
			    i_1863_ += i_1864_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1852_ == 1) {
		    if (i_1850_ == 1) {
			int i_1900_ = i_1854_;
			for (int i_1901_ = -i_1849_; i_1901_ < 0; i_1901_++) {
			    int i_1902_ = (i_1855_ >> 16) * anInt8985;
			    for (int i_1903_ = -i_1848_; i_1903_ < 0;
				 i_1903_++) {
				int i_1904_ = (anIntArray11415
					       [(i_1854_ >> 16) + i_1902_]);
				if (i_1904_ != 0)
				    is[i_1863_++] = i_1904_;
				else
				    i_1863_++;
				i_1854_ += i_1859_;
			    }
			    i_1855_ += i_1860_;
			    i_1854_ = i_1900_;
			    i_1863_ += i_1864_;
			}
		    } else if (i_1850_ == 0) {
			int i_1905_ = i_1854_;
			if ((i_1851_ & 0xffffff) == 16777215) {
			    int i_1906_ = i_1851_ >>> 24;
			    int i_1907_ = 256 - i_1906_;
			    for (int i_1908_ = -i_1849_; i_1908_ < 0;
				 i_1908_++) {
				int i_1909_ = (i_1855_ >> 16) * anInt8985;
				for (int i_1910_ = -i_1848_; i_1910_ < 0;
				     i_1910_++) {
				    int i_1911_
					= (anIntArray11415
					   [(i_1854_ >> 16) + i_1909_]);
				    if (i_1911_ != 0) {
					int i_1912_ = is[i_1863_];
					is[i_1863_++]
					    = ((((i_1911_ & 0xff00ff) * i_1906_
						 + ((i_1912_ & 0xff00ff)
						    * i_1907_))
						& ~0xff00ff)
					       + (((i_1911_ & 0xff00) * i_1906_
						   + ((i_1912_ & 0xff00)
						      * i_1907_))
						  & 0xff0000)) >> 8;
				    } else
					i_1863_++;
				    i_1854_ += i_1859_;
				}
				i_1855_ += i_1860_;
				i_1854_ = i_1905_;
				i_1863_ += i_1864_;
			    }
			} else {
			    int i_1913_ = (i_1851_ & 0xff0000) >> 16;
			    int i_1914_ = (i_1851_ & 0xff00) >> 8;
			    int i_1915_ = i_1851_ & 0xff;
			    int i_1916_ = i_1851_ >>> 24;
			    int i_1917_ = 256 - i_1916_;
			    for (int i_1918_ = -i_1849_; i_1918_ < 0;
				 i_1918_++) {
				int i_1919_ = (i_1855_ >> 16) * anInt8985;
				for (int i_1920_ = -i_1848_; i_1920_ < 0;
				     i_1920_++) {
				    int i_1921_
					= (anIntArray11415
					   [(i_1854_ >> 16) + i_1919_]);
				    if (i_1921_ != 0) {
					if (i_1916_ != 255) {
					    int i_1922_
						= (((i_1921_ & 0xff0000)
						    * i_1913_)
						   & ~0xffffff);
					    int i_1923_
						= ((i_1921_ & 0xff00) * i_1914_
						   & 0xff0000);
					    int i_1924_
						= ((i_1921_ & 0xff) * i_1915_
						   & 0xff00);
					    i_1921_ = (i_1922_ | i_1923_
						       | i_1924_) >>> 8;
					    int i_1925_ = is[i_1863_];
					    is[i_1863_++]
						= (((((i_1921_ & 0xff00ff)
						      * i_1916_)
						     + ((i_1925_ & 0xff00ff)
							* i_1917_))
						    & ~0xff00ff)
						   + ((((i_1921_ & 0xff00)
							* i_1916_)
						       + ((i_1925_ & 0xff00)
							  * i_1917_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1926_
						= (((i_1921_ & 0xff0000)
						    * i_1913_)
						   & ~0xffffff);
					    int i_1927_
						= ((i_1921_ & 0xff00) * i_1914_
						   & 0xff0000);
					    int i_1928_
						= ((i_1921_ & 0xff) * i_1915_
						   & 0xff00);
					    is[i_1863_++] = (i_1926_ | i_1927_
							     | i_1928_) >>> 8;
					}
				    } else
					i_1863_++;
				    i_1854_ += i_1859_;
				}
				i_1855_ += i_1860_;
				i_1854_ = i_1905_;
				i_1863_ += i_1864_;
			    }
			}
		    } else if (i_1850_ == 3) {
			int i_1929_ = i_1854_;
			int i_1930_ = i_1851_ >>> 24;
			int i_1931_ = 256 - i_1930_;
			for (int i_1932_ = -i_1849_; i_1932_ < 0; i_1932_++) {
			    int i_1933_ = (i_1855_ >> 16) * anInt8985;
			    for (int i_1934_ = -i_1848_; i_1934_ < 0;
				 i_1934_++) {
				int i_1935_ = (anIntArray11415
					       [(i_1854_ >> 16) + i_1933_]);
				int i_1936_ = i_1935_ + i_1851_;
				int i_1937_ = ((i_1935_ & 0xff00ff)
					       + (i_1851_ & 0xff00ff));
				int i_1938_
				    = ((i_1937_ & 0x1000100)
				       + (i_1936_ - i_1937_ & 0x10000));
				i_1938_
				    = i_1936_ - i_1938_ | i_1938_ - (i_1938_
								     >>> 8);
				if (i_1935_ == 0 && i_1930_ != 255) {
				    i_1935_ = i_1938_;
				    i_1938_ = is[i_1863_];
				    i_1938_
					= ((((i_1935_ & 0xff00ff) * i_1930_
					     + (i_1938_ & 0xff00ff) * i_1931_)
					    & ~0xff00ff)
					   + (((i_1935_ & 0xff00) * i_1930_
					       + (i_1938_ & 0xff00) * i_1931_)
					      & 0xff0000)) >> 8;
				}
				is[i_1863_++] = i_1938_;
				i_1854_ += i_1859_;
			    }
			    i_1855_ += i_1860_;
			    i_1854_ = i_1929_;
			    i_1863_ += i_1864_;
			}
		    } else if (i_1850_ == 2) {
			int i_1939_ = i_1851_ >>> 24;
			int i_1940_ = 256 - i_1939_;
			int i_1941_
			    = (i_1851_ & 0xff00ff) * i_1940_ & ~0xff00ff;
			int i_1942_ = (i_1851_ & 0xff00) * i_1940_ & 0xff0000;
			i_1851_ = (i_1941_ | i_1942_) >>> 8;
			int i_1943_ = i_1854_;
			for (int i_1944_ = -i_1849_; i_1944_ < 0; i_1944_++) {
			    int i_1945_ = (i_1855_ >> 16) * anInt8985;
			    for (int i_1946_ = -i_1848_; i_1946_ < 0;
				 i_1946_++) {
				int i_1947_ = (anIntArray11415
					       [(i_1854_ >> 16) + i_1945_]);
				if (i_1947_ != 0) {
				    i_1941_ = ((i_1947_ & 0xff00ff) * i_1939_
					       & ~0xff00ff);
				    i_1942_ = ((i_1947_ & 0xff00) * i_1939_
					       & 0xff0000);
				    is[i_1863_++] = ((i_1941_ | i_1942_)
						     >>> 8) + i_1851_;
				} else
				    i_1863_++;
				i_1854_ += i_1859_;
			    }
			    i_1855_ += i_1860_;
			    i_1854_ = i_1943_;
			    i_1863_ += i_1864_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1852_ == 2) {
		    if (i_1850_ == 1) {
			int i_1948_ = i_1854_;
			for (int i_1949_ = -i_1849_; i_1949_ < 0; i_1949_++) {
			    int i_1950_ = (i_1855_ >> 16) * anInt8985;
			    for (int i_1951_ = -i_1848_; i_1951_ < 0;
				 i_1951_++) {
				int i_1952_ = (anIntArray11415
					       [(i_1854_ >> 16) + i_1950_]);
				if (i_1952_ != 0) {
				    int i_1953_ = is[i_1863_];
				    int i_1954_ = i_1952_ + i_1953_;
				    int i_1955_ = ((i_1952_ & 0xff00ff)
						   + (i_1953_ & 0xff00ff));
				    i_1953_
					= ((i_1955_ & 0x1000100)
					   + (i_1954_ - i_1955_ & 0x10000));
				    is[i_1863_++]
					= (i_1954_ - i_1953_
					   | i_1953_ - (i_1953_ >>> 8));
				} else
				    i_1863_++;
				i_1854_ += i_1859_;
			    }
			    i_1855_ += i_1860_;
			    i_1854_ = i_1948_;
			    i_1863_ += i_1864_;
			}
		    } else if (i_1850_ == 0) {
			int i_1956_ = i_1854_;
			int i_1957_ = (i_1851_ & 0xff0000) >> 16;
			int i_1958_ = (i_1851_ & 0xff00) >> 8;
			int i_1959_ = i_1851_ & 0xff;
			for (int i_1960_ = -i_1849_; i_1960_ < 0; i_1960_++) {
			    int i_1961_ = (i_1855_ >> 16) * anInt8985;
			    for (int i_1962_ = -i_1848_; i_1962_ < 0;
				 i_1962_++) {
				int i_1963_ = (anIntArray11415
					       [(i_1854_ >> 16) + i_1961_]);
				if (i_1963_ != 0) {
				    int i_1964_
					= ((i_1963_ & 0xff0000) * i_1957_
					   & ~0xffffff);
				    int i_1965_ = ((i_1963_ & 0xff00) * i_1958_
						   & 0xff0000);
				    int i_1966_
					= (i_1963_ & 0xff) * i_1959_ & 0xff00;
				    i_1963_
					= (i_1964_ | i_1965_ | i_1966_) >>> 8;
				    int i_1967_ = is[i_1863_];
				    int i_1968_ = i_1963_ + i_1967_;
				    int i_1969_ = ((i_1963_ & 0xff00ff)
						   + (i_1967_ & 0xff00ff));
				    i_1967_
					= ((i_1969_ & 0x1000100)
					   + (i_1968_ - i_1969_ & 0x10000));
				    is[i_1863_++]
					= (i_1968_ - i_1967_
					   | i_1967_ - (i_1967_ >>> 8));
				} else
				    i_1863_++;
				i_1854_ += i_1859_;
			    }
			    i_1855_ += i_1860_;
			    i_1854_ = i_1956_;
			    i_1863_ += i_1864_;
			}
		    } else if (i_1850_ == 3) {
			int i_1970_ = i_1854_;
			for (int i_1971_ = -i_1849_; i_1971_ < 0; i_1971_++) {
			    int i_1972_ = (i_1855_ >> 16) * anInt8985;
			    for (int i_1973_ = -i_1848_; i_1973_ < 0;
				 i_1973_++) {
				int i_1974_ = (anIntArray11415
					       [(i_1854_ >> 16) + i_1972_]);
				int i_1975_ = i_1974_ + i_1851_;
				int i_1976_ = ((i_1974_ & 0xff00ff)
					       + (i_1851_ & 0xff00ff));
				int i_1977_
				    = ((i_1976_ & 0x1000100)
				       + (i_1975_ - i_1976_ & 0x10000));
				i_1974_
				    = i_1975_ - i_1977_ | i_1977_ - (i_1977_
								     >>> 8);
				i_1977_ = is[i_1863_];
				i_1975_ = i_1974_ + i_1977_;
				i_1976_ = (i_1974_ & 0xff00ff) + (i_1977_
								  & 0xff00ff);
				i_1977_ = ((i_1976_ & 0x1000100)
					   + (i_1975_ - i_1976_ & 0x10000));
				is[i_1863_++]
				    = i_1975_ - i_1977_ | i_1977_ - (i_1977_
								     >>> 8);
				i_1854_ += i_1859_;
			    }
			    i_1855_ += i_1860_;
			    i_1854_ = i_1970_;
			    i_1863_ += i_1864_;
			}
		    } else if (i_1850_ == 2) {
			int i_1978_ = i_1851_ >>> 24;
			int i_1979_ = 256 - i_1978_;
			int i_1980_
			    = (i_1851_ & 0xff00ff) * i_1979_ & ~0xff00ff;
			int i_1981_ = (i_1851_ & 0xff00) * i_1979_ & 0xff0000;
			i_1851_ = (i_1980_ | i_1981_) >>> 8;
			int i_1982_ = i_1854_;
			for (int i_1983_ = -i_1849_; i_1983_ < 0; i_1983_++) {
			    int i_1984_ = (i_1855_ >> 16) * anInt8985;
			    for (int i_1985_ = -i_1848_; i_1985_ < 0;
				 i_1985_++) {
				int i_1986_ = (anIntArray11415
					       [(i_1854_ >> 16) + i_1984_]);
				if (i_1986_ != 0) {
				    i_1980_ = ((i_1986_ & 0xff00ff) * i_1978_
					       & ~0xff00ff);
				    i_1981_ = ((i_1986_ & 0xff00) * i_1978_
					       & 0xff0000);
				    i_1986_ = (((i_1980_ | i_1981_) >>> 8)
					       + i_1851_);
				    int i_1987_ = is[i_1863_];
				    int i_1988_ = i_1986_ + i_1987_;
				    int i_1989_ = ((i_1986_ & 0xff00ff)
						   + (i_1987_ & 0xff00ff));
				    i_1987_
					= ((i_1989_ & 0x1000100)
					   + (i_1988_ - i_1989_ & 0x10000));
				    is[i_1863_++]
					= (i_1988_ - i_1987_
					   | i_1987_ - (i_1987_ >>> 8));
				} else
				    i_1863_++;
				i_1854_ += i_1859_;
			    }
			    i_1855_ += i_1860_;
			    i_1854_ = i_1982_;
			    i_1863_ += i_1864_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method17955(int i, int i_1990_, int[] is, int i_1991_, int i_1992_) {
	if (i_1992_ == 0) {
	    if (i_1991_ == 1)
		is[i_1990_] = anIntArray11415[i];
	    else if (i_1991_ == 0) {
		int i_1993_ = anIntArray11415[i++];
		int i_1994_ = (i_1993_ & 0xff0000) * anInt9014 & ~0xffffff;
		int i_1995_ = (i_1993_ & 0xff00) * anInt9015 & 0xff0000;
		int i_1996_ = (i_1993_ & 0xff) * anInt9018 & 0xff00;
		is[i_1990_] = (i_1994_ | i_1995_ | i_1996_) >>> 8;
	    } else if (i_1991_ == 3) {
		int i_1997_ = anIntArray11415[i++];
		int i_1998_ = anInt9011;
		int i_1999_ = i_1997_ + i_1998_;
		int i_2000_ = (i_1997_ & 0xff00ff) + (i_1998_ & 0xff00ff);
		int i_2001_
		    = (i_2000_ & 0x1000100) + (i_1999_ - i_2000_ & 0x10000);
		is[i_1990_] = i_1999_ - i_2001_ | i_2001_ - (i_2001_ >>> 8);
	    } else if (i_1991_ == 2) {
		int i_2002_ = anIntArray11415[i];
		int i_2003_ = (i_2002_ & 0xff00ff) * anInt9012 & ~0xff00ff;
		int i_2004_ = (i_2002_ & 0xff00) * anInt9012 & 0xff0000;
		is[i_1990_] = ((i_2003_ | i_2004_) >>> 8) + anInt9019;
	    } else
		throw new IllegalArgumentException();
	} else if (i_1992_ == 1) {
	    if (i_1991_ == 1) {
		int i_2005_ = anIntArray11415[i];
		if (i_2005_ != 0)
		    is[i_1990_] = i_2005_;
	    } else if (i_1991_ == 0) {
		int i_2006_ = anIntArray11415[i];
		if (i_2006_ != 0) {
		    if ((anInt9011 & 0xffffff) == 16777215) {
			int i_2007_ = anInt9011 >>> 24;
			int i_2008_ = 256 - i_2007_;
			int i_2009_ = is[i_1990_];
			is[i_1990_] = ((((i_2006_ & 0xff00ff) * i_2007_
					 + (i_2009_ & 0xff00ff) * i_2008_)
					& ~0xff00ff)
				       + (((i_2006_ & 0xff00) * i_2007_
					   + (i_2009_ & 0xff00) * i_2008_)
					  & 0xff0000)) >> 8;
		    } else if (anInt9012 != 255) {
			int i_2010_
			    = (i_2006_ & 0xff0000) * anInt9014 & ~0xffffff;
			int i_2011_
			    = (i_2006_ & 0xff00) * anInt9015 & 0xff0000;
			int i_2012_ = (i_2006_ & 0xff) * anInt9018 & 0xff00;
			i_2006_ = (i_2010_ | i_2011_ | i_2012_) >>> 8;
			int i_2013_ = is[i_1990_];
			is[i_1990_] = ((((i_2006_ & 0xff00ff) * anInt9012
					 + (i_2013_ & 0xff00ff) * anInt9013)
					& ~0xff00ff)
				       + (((i_2006_ & 0xff00) * anInt9012
					   + (i_2013_ & 0xff00) * anInt9013)
					  & 0xff0000)) >> 8;
		    } else {
			int i_2014_
			    = (i_2006_ & 0xff0000) * anInt9014 & ~0xffffff;
			int i_2015_
			    = (i_2006_ & 0xff00) * anInt9015 & 0xff0000;
			int i_2016_ = (i_2006_ & 0xff) * anInt9018 & 0xff00;
			is[i_1990_] = (i_2014_ | i_2015_ | i_2016_) >>> 8;
		    }
		}
	    } else if (i_1991_ == 3) {
		int i_2017_ = anIntArray11415[i];
		int i_2018_ = anInt9011;
		int i_2019_ = i_2017_ + i_2018_;
		int i_2020_ = (i_2017_ & 0xff00ff) + (i_2018_ & 0xff00ff);
		int i_2021_
		    = (i_2020_ & 0x1000100) + (i_2019_ - i_2020_ & 0x10000);
		i_2021_ = i_2019_ - i_2021_ | i_2021_ - (i_2021_ >>> 8);
		if (i_2017_ == 0 && anInt9012 != 255) {
		    i_2017_ = i_2021_;
		    i_2021_ = is[i_1990_];
		    i_2021_ = ((((i_2017_ & 0xff00ff) * anInt9012
				 + (i_2021_ & 0xff00ff) * anInt9013)
				& ~0xff00ff)
			       + (((i_2017_ & 0xff00) * anInt9012
				   + (i_2021_ & 0xff00) * anInt9013)
				  & 0xff0000)) >> 8;
		}
		is[i_1990_] = i_2021_;
	    } else if (i_1991_ == 2) {
		int i_2022_ = anIntArray11415[i];
		if (i_2022_ != 0) {
		    int i_2023_ = (i_2022_ & 0xff00ff) * anInt9012 & ~0xff00ff;
		    int i_2024_ = (i_2022_ & 0xff00) * anInt9012 & 0xff0000;
		    is[i_1990_++] = ((i_2023_ | i_2024_) >>> 8) + anInt9019;
		}
	    } else
		throw new IllegalArgumentException();
	} else if (i_1992_ == 2) {
	    if (i_1991_ == 1) {
		int i_2025_ = anIntArray11415[i];
		if (i_2025_ != 0) {
		    int i_2026_ = is[i_1990_];
		    int i_2027_ = i_2025_ + i_2026_;
		    int i_2028_ = (i_2025_ & 0xff00ff) + (i_2026_ & 0xff00ff);
		    i_2026_ = (i_2028_ & 0x1000100) + (i_2027_ - i_2028_
						       & 0x10000);
		    is[i_1990_]
			= i_2027_ - i_2026_ | i_2026_ - (i_2026_ >>> 8);
		}
	    } else if (i_1991_ == 0) {
		int i_2029_ = anIntArray11415[i];
		if (i_2029_ != 0) {
		    int i_2030_ = (i_2029_ & 0xff0000) * anInt9014 & ~0xffffff;
		    int i_2031_ = (i_2029_ & 0xff00) * anInt9015 & 0xff0000;
		    int i_2032_ = (i_2029_ & 0xff) * anInt9018 & 0xff00;
		    i_2029_ = (i_2030_ | i_2031_ | i_2032_) >>> 8;
		    int i_2033_ = is[i_1990_];
		    int i_2034_ = i_2029_ + i_2033_;
		    int i_2035_ = (i_2029_ & 0xff00ff) + (i_2033_ & 0xff00ff);
		    i_2033_ = (i_2035_ & 0x1000100) + (i_2034_ - i_2035_
						       & 0x10000);
		    is[i_1990_]
			= i_2034_ - i_2033_ | i_2033_ - (i_2033_ >>> 8);
		}
	    } else if (i_1991_ == 3) {
		int i_2036_ = anIntArray11415[i];
		int i_2037_ = anInt9011;
		int i_2038_ = i_2036_ + i_2037_;
		int i_2039_ = (i_2036_ & 0xff00ff) + (i_2037_ & 0xff00ff);
		int i_2040_
		    = (i_2039_ & 0x1000100) + (i_2038_ - i_2039_ & 0x10000);
		i_2036_ = i_2038_ - i_2040_ | i_2040_ - (i_2040_ >>> 8);
		i_2040_ = is[i_1990_];
		i_2038_ = i_2036_ + i_2040_;
		i_2039_ = (i_2036_ & 0xff00ff) + (i_2040_ & 0xff00ff);
		i_2040_
		    = (i_2039_ & 0x1000100) + (i_2038_ - i_2039_ & 0x10000);
		is[i_1990_] = i_2038_ - i_2040_ | i_2040_ - (i_2040_ >>> 8);
	    } else if (i_1991_ == 2) {
		int i_2041_ = anIntArray11415[i];
		if (i_2041_ != 0) {
		    int i_2042_ = (i_2041_ & 0xff00ff) * anInt9012 & ~0xff00ff;
		    int i_2043_ = (i_2041_ & 0xff00) * anInt9012 & 0xff0000;
		    i_2041_ = ((i_2042_ | i_2043_) >>> 8) + anInt9019;
		    int i_2044_ = is[i_1990_];
		    int i_2045_ = i_2041_ + i_2044_;
		    int i_2046_ = (i_2041_ & 0xff00ff) + (i_2044_ & 0xff00ff);
		    i_2044_ = (i_2046_ & 0x1000100) + (i_2045_ - i_2046_
						       & 0x10000);
		    is[i_1990_]
			= i_2045_ - i_2044_ | i_2044_ - (i_2044_ >>> 8);
		}
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    public void method2676(int i, int i_2047_, int i_2048_, int i_2049_,
			   int[] is, int[] is_2050_, int i_2051_,
			   int i_2052_) {
	method17951(i, i_2047_, i_2048_, i_2049_, is, i_2051_, i_2052_);
    }
    
    public void method2729(int i, int i_2053_, int i_2054_) {
	throw new IllegalStateException("");
    }
    
    void method14511(int[] is, int[] is_2055_, int i, int i_2056_) {
	int[] is_2057_ = aClass185_Sub2_9016.anIntArray9338;
	if (is_2057_ != null) {
	    if (anInt9001 == 0) {
		if (anInt9000 == 0) {
		    int i_2058_ = anInt8998;
		    while (i_2058_ < 0) {
			int i_2059_ = i_2058_ + i_2056_;
			if (i_2059_ >= 0) {
			    if (i_2059_ >= is.length)
				break;
			    int i_2060_ = anInt8988;
			    int i_2061_ = anInt9007;
			    int i_2062_ = anInt9003;
			    int i_2063_ = anInt8999;
			    if (i_2061_ >= 0 && i_2062_ >= 0
				&& i_2061_ - (anInt8985 << 12) < 0
				&& i_2062_ - (anInt9002 << 12) < 0) {
				int i_2064_ = is[i_2059_] - i;
				int i_2065_ = -is_2055_[i_2059_];
				int i_2066_ = i_2064_ - (i_2060_ - anInt8988);
				if (i_2066_ > 0) {
				    i_2060_ += i_2066_;
				    i_2063_ += i_2066_;
				    i_2061_ += anInt9001 * i_2066_;
				    i_2062_ += anInt9000 * i_2066_;
				} else
				    i_2065_ -= i_2066_;
				if (i_2063_ < i_2065_)
				    i_2063_ = i_2065_;
				for (/**/; i_2063_ < 0; i_2063_++) {
				    int i_2067_
					= (anIntArray11415
					   [((i_2062_ >> 12) * anInt8985
					     + (i_2061_ >> 12))]);
				    if (i_2067_ != 0)
					is_2057_[i_2060_++] = i_2067_;
				    else
					i_2060_++;
				}
			    }
			}
			i_2058_++;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_2068_ = anInt8998;
		    while (i_2068_ < 0) {
			int i_2069_ = i_2068_ + i_2056_;
			if (i_2069_ >= 0) {
			    if (i_2069_ >= is.length)
				break;
			    int i_2070_ = anInt8988;
			    int i_2071_ = anInt9007;
			    int i_2072_ = anInt9003 + anInt9010;
			    int i_2073_ = anInt8999;
			    if (i_2071_ >= 0
				&& i_2071_ - (anInt8985 << 12) < 0) {
				int i_2074_;
				if ((i_2074_ = i_2072_ - (anInt9002 << 12))
				    >= 0) {
				    i_2074_
					= (anInt9000 - i_2074_) / anInt9000;
				    i_2073_ += i_2074_;
				    i_2072_ += anInt9000 * i_2074_;
				    i_2070_ += i_2074_;
				}
				if ((i_2074_
				     = (i_2072_ - anInt9000) / anInt9000)
				    > i_2073_)
				    i_2073_ = i_2074_;
				int i_2075_ = is[i_2069_] - i;
				int i_2076_ = -is_2055_[i_2069_];
				int i_2077_ = i_2075_ - (i_2070_ - anInt8988);
				if (i_2077_ > 0) {
				    i_2070_ += i_2077_;
				    i_2073_ += i_2077_;
				    i_2071_ += anInt9001 * i_2077_;
				    i_2072_ += anInt9000 * i_2077_;
				} else
				    i_2076_ -= i_2077_;
				if (i_2073_ < i_2076_)
				    i_2073_ = i_2076_;
				for (/**/; i_2073_ < 0; i_2073_++) {
				    int i_2078_
					= (anIntArray11415
					   [((i_2072_ >> 12) * anInt8985
					     + (i_2071_ >> 12))]);
				    if (i_2078_ != 0)
					is_2057_[i_2070_++] = i_2078_;
				    else
					i_2070_++;
				    i_2072_ += anInt9000;
				}
			    }
			}
			i_2068_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_2079_ = anInt8998;
		    while (i_2079_ < 0) {
			int i_2080_ = i_2079_ + i_2056_;
			if (i_2080_ >= 0) {
			    if (i_2080_ >= is.length)
				break;
			    int i_2081_ = anInt8988;
			    int i_2082_ = anInt9007;
			    int i_2083_ = anInt9003 + anInt9010;
			    int i_2084_ = anInt8999;
			    if (i_2082_ >= 0
				&& i_2082_ - (anInt8985 << 12) < 0) {
				if (i_2083_ < 0) {
				    int i_2085_ = ((anInt9000 - 1 - i_2083_)
						   / anInt9000);
				    i_2084_ += i_2085_;
				    i_2083_ += anInt9000 * i_2085_;
				    i_2081_ += i_2085_;
				}
				int i_2086_;
				if ((i_2086_ = (1 + i_2083_ - (anInt9002 << 12)
						- anInt9000) / anInt9000)
				    > i_2084_)
				    i_2084_ = i_2086_;
				int i_2087_ = is[i_2080_] - i;
				int i_2088_ = -is_2055_[i_2080_];
				int i_2089_ = i_2087_ - (i_2081_ - anInt8988);
				if (i_2089_ > 0) {
				    i_2081_ += i_2089_;
				    i_2084_ += i_2089_;
				    i_2082_ += anInt9001 * i_2089_;
				    i_2083_ += anInt9000 * i_2089_;
				} else
				    i_2088_ -= i_2089_;
				if (i_2084_ < i_2088_)
				    i_2084_ = i_2088_;
				for (/**/; i_2084_ < 0; i_2084_++) {
				    int i_2090_
					= (anIntArray11415
					   [((i_2083_ >> 12) * anInt8985
					     + (i_2082_ >> 12))]);
				    if (i_2090_ != 0)
					is_2057_[i_2081_++] = i_2090_;
				    else
					i_2081_++;
				    i_2083_ += anInt9000;
				}
			    }
			}
			i_2079_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9001 < 0) {
		if (anInt9000 == 0) {
		    int i_2091_ = anInt8998;
		    while (i_2091_ < 0) {
			int i_2092_ = i_2091_ + i_2056_;
			if (i_2092_ >= 0) {
			    if (i_2092_ >= is.length)
				break;
			    int i_2093_ = anInt8988;
			    int i_2094_ = anInt9007 + anInt9009;
			    int i_2095_ = anInt9003;
			    int i_2096_ = anInt8999;
			    if (i_2095_ >= 0
				&& i_2095_ - (anInt9002 << 12) < 0) {
				int i_2097_;
				if ((i_2097_ = i_2094_ - (anInt8985 << 12))
				    >= 0) {
				    i_2097_
					= (anInt9001 - i_2097_) / anInt9001;
				    i_2096_ += i_2097_;
				    i_2094_ += anInt9001 * i_2097_;
				    i_2093_ += i_2097_;
				}
				if ((i_2097_
				     = (i_2094_ - anInt9001) / anInt9001)
				    > i_2096_)
				    i_2096_ = i_2097_;
				int i_2098_ = is[i_2092_] - i;
				int i_2099_ = -is_2055_[i_2092_];
				int i_2100_ = i_2098_ - (i_2093_ - anInt8988);
				if (i_2100_ > 0) {
				    i_2093_ += i_2100_;
				    i_2096_ += i_2100_;
				    i_2094_ += anInt9001 * i_2100_;
				    i_2095_ += anInt9000 * i_2100_;
				} else
				    i_2099_ -= i_2100_;
				if (i_2096_ < i_2099_)
				    i_2096_ = i_2099_;
				for (/**/; i_2096_ < 0; i_2096_++) {
				    int i_2101_
					= (anIntArray11415
					   [((i_2095_ >> 12) * anInt8985
					     + (i_2094_ >> 12))]);
				    if (i_2101_ != 0)
					is_2057_[i_2093_++] = i_2101_;
				    else
					i_2093_++;
				    i_2094_ += anInt9001;
				}
			    }
			}
			i_2091_++;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_2102_ = anInt8998;
		    while (i_2102_ < 0) {
			int i_2103_ = i_2102_ + i_2056_;
			if (i_2103_ >= 0) {
			    if (i_2103_ >= is.length)
				break;
			    int i_2104_ = anInt8988;
			    int i_2105_ = anInt9007 + anInt9009;
			    int i_2106_ = anInt9003 + anInt9010;
			    int i_2107_ = anInt8999;
			    int i_2108_;
			    if ((i_2108_ = i_2105_ - (anInt8985 << 12)) >= 0) {
				i_2108_ = (anInt9001 - i_2108_) / anInt9001;
				i_2107_ += i_2108_;
				i_2105_ += anInt9001 * i_2108_;
				i_2106_ += anInt9000 * i_2108_;
				i_2104_ += i_2108_;
			    }
			    if ((i_2108_ = (i_2105_ - anInt9001) / anInt9001)
				> i_2107_)
				i_2107_ = i_2108_;
			    if ((i_2108_ = i_2106_ - (anInt9002 << 12)) >= 0) {
				i_2108_ = (anInt9000 - i_2108_) / anInt9000;
				i_2107_ += i_2108_;
				i_2105_ += anInt9001 * i_2108_;
				i_2106_ += anInt9000 * i_2108_;
				i_2104_ += i_2108_;
			    }
			    if ((i_2108_ = (i_2106_ - anInt9000) / anInt9000)
				> i_2107_)
				i_2107_ = i_2108_;
			    int i_2109_ = is[i_2103_] - i;
			    int i_2110_ = -is_2055_[i_2103_];
			    int i_2111_ = i_2109_ - (i_2104_ - anInt8988);
			    if (i_2111_ > 0) {
				i_2104_ += i_2111_;
				i_2107_ += i_2111_;
				i_2105_ += anInt9001 * i_2111_;
				i_2106_ += anInt9000 * i_2111_;
			    } else
				i_2110_ -= i_2111_;
			    if (i_2107_ < i_2110_)
				i_2107_ = i_2110_;
			    for (/**/; i_2107_ < 0; i_2107_++) {
				int i_2112_ = (anIntArray11415
					       [((i_2106_ >> 12) * anInt8985
						 + (i_2105_ >> 12))]);
				if (i_2112_ != 0)
				    is_2057_[i_2104_++] = i_2112_;
				else
				    i_2104_++;
				i_2105_ += anInt9001;
				i_2106_ += anInt9000;
			    }
			}
			i_2102_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_2113_ = anInt8998;
		    while (i_2113_ < 0) {
			int i_2114_ = i_2113_ + i_2056_;
			if (i_2114_ >= 0) {
			    if (i_2114_ >= is.length)
				break;
			    int i_2115_ = anInt8988;
			    int i_2116_ = anInt9007 + anInt9009;
			    int i_2117_ = anInt9003 + anInt9010;
			    int i_2118_ = anInt8999;
			    int i_2119_;
			    if ((i_2119_ = i_2116_ - (anInt8985 << 12)) >= 0) {
				i_2119_ = (anInt9001 - i_2119_) / anInt9001;
				i_2118_ += i_2119_;
				i_2116_ += anInt9001 * i_2119_;
				i_2117_ += anInt9000 * i_2119_;
				i_2115_ += i_2119_;
			    }
			    if ((i_2119_ = (i_2116_ - anInt9001) / anInt9001)
				> i_2118_)
				i_2118_ = i_2119_;
			    if (i_2117_ < 0) {
				i_2119_
				    = (anInt9000 - 1 - i_2117_) / anInt9000;
				i_2118_ += i_2119_;
				i_2116_ += anInt9001 * i_2119_;
				i_2117_ += anInt9000 * i_2119_;
				i_2115_ += i_2119_;
			    }
			    if ((i_2119_ = (1 + i_2117_ - (anInt9002 << 12)
					    - anInt9000) / anInt9000)
				> i_2118_)
				i_2118_ = i_2119_;
			    int i_2120_ = is[i_2114_] - i;
			    int i_2121_ = -is_2055_[i_2114_];
			    int i_2122_ = i_2120_ - (i_2115_ - anInt8988);
			    if (i_2122_ > 0) {
				i_2115_ += i_2122_;
				i_2118_ += i_2122_;
				i_2116_ += anInt9001 * i_2122_;
				i_2117_ += anInt9000 * i_2122_;
			    } else
				i_2121_ -= i_2122_;
			    if (i_2118_ < i_2121_)
				i_2118_ = i_2121_;
			    for (/**/; i_2118_ < 0; i_2118_++) {
				int i_2123_ = (anIntArray11415
					       [((i_2117_ >> 12) * anInt8985
						 + (i_2116_ >> 12))]);
				if (i_2123_ != 0)
				    is_2057_[i_2115_++] = i_2123_;
				else
				    i_2115_++;
				i_2116_ += anInt9001;
				i_2117_ += anInt9000;
			    }
			}
			i_2113_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9000 == 0) {
		int i_2124_ = anInt8998;
		while (i_2124_ < 0) {
		    int i_2125_ = i_2124_ + i_2056_;
		    if (i_2125_ >= 0) {
			if (i_2125_ >= is.length)
			    break;
			int i_2126_ = anInt8988;
			int i_2127_ = anInt9007 + anInt9009;
			int i_2128_ = anInt9003;
			int i_2129_ = anInt8999;
			if (i_2128_ >= 0 && i_2128_ - (anInt9002 << 12) < 0) {
			    if (i_2127_ < 0) {
				int i_2130_
				    = (anInt9001 - 1 - i_2127_) / anInt9001;
				i_2129_ += i_2130_;
				i_2127_ += anInt9001 * i_2130_;
				i_2126_ += i_2130_;
			    }
			    int i_2131_;
			    if ((i_2131_ = (1 + i_2127_ - (anInt8985 << 12)
					    - anInt9001) / anInt9001)
				> i_2129_)
				i_2129_ = i_2131_;
			    int i_2132_ = is[i_2125_] - i;
			    int i_2133_ = -is_2055_[i_2125_];
			    int i_2134_ = i_2132_ - (i_2126_ - anInt8988);
			    if (i_2134_ > 0) {
				i_2126_ += i_2134_;
				i_2129_ += i_2134_;
				i_2127_ += anInt9001 * i_2134_;
				i_2128_ += anInt9000 * i_2134_;
			    } else
				i_2133_ -= i_2134_;
			    if (i_2129_ < i_2133_)
				i_2129_ = i_2133_;
			    for (/**/; i_2129_ < 0; i_2129_++) {
				int i_2135_ = (anIntArray11415
					       [((i_2128_ >> 12) * anInt8985
						 + (i_2127_ >> 12))]);
				if (i_2135_ != 0)
				    is_2057_[i_2126_++] = i_2135_;
				else
				    i_2126_++;
				i_2127_ += anInt9001;
			    }
			}
		    }
		    i_2124_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else if (anInt9000 < 0) {
		int i_2136_ = anInt8998;
		while (i_2136_ < 0) {
		    int i_2137_ = i_2136_ + i_2056_;
		    if (i_2137_ >= 0) {
			if (i_2137_ >= is.length)
			    break;
			int i_2138_ = anInt8988;
			int i_2139_ = anInt9007 + anInt9009;
			int i_2140_ = anInt9003 + anInt9010;
			int i_2141_ = anInt8999;
			if (i_2139_ < 0) {
			    int i_2142_
				= (anInt9001 - 1 - i_2139_) / anInt9001;
			    i_2141_ += i_2142_;
			    i_2139_ += anInt9001 * i_2142_;
			    i_2140_ += anInt9000 * i_2142_;
			    i_2138_ += i_2142_;
			}
			int i_2143_;
			if ((i_2143_ = (1 + i_2139_ - (anInt8985 << 12)
					- anInt9001) / anInt9001)
			    > i_2141_)
			    i_2141_ = i_2143_;
			if ((i_2143_ = i_2140_ - (anInt9002 << 12)) >= 0) {
			    i_2143_ = (anInt9000 - i_2143_) / anInt9000;
			    i_2141_ += i_2143_;
			    i_2139_ += anInt9001 * i_2143_;
			    i_2140_ += anInt9000 * i_2143_;
			    i_2138_ += i_2143_;
			}
			if ((i_2143_ = (i_2140_ - anInt9000) / anInt9000)
			    > i_2141_)
			    i_2141_ = i_2143_;
			int i_2144_ = is[i_2137_] - i;
			int i_2145_ = -is_2055_[i_2137_];
			int i_2146_ = i_2144_ - (i_2138_ - anInt8988);
			if (i_2146_ > 0) {
			    i_2138_ += i_2146_;
			    i_2141_ += i_2146_;
			    i_2139_ += anInt9001 * i_2146_;
			    i_2140_ += anInt9000 * i_2146_;
			} else
			    i_2145_ -= i_2146_;
			if (i_2141_ < i_2145_)
			    i_2141_ = i_2145_;
			for (/**/; i_2141_ < 0; i_2141_++) {
			    int i_2147_
				= (anIntArray11415
				   [(i_2140_ >> 12) * anInt8985 + (i_2139_
								   >> 12)]);
			    if (i_2147_ != 0)
				is_2057_[i_2138_++] = i_2147_;
			    else
				i_2138_++;
			    i_2139_ += anInt9001;
			    i_2140_ += anInt9000;
			}
		    }
		    i_2136_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else {
		int i_2148_ = anInt8998;
		while (i_2148_ < 0) {
		    int i_2149_ = i_2148_ + i_2056_;
		    if (i_2149_ >= 0) {
			if (i_2149_ >= is.length)
			    break;
			int i_2150_ = anInt8988;
			int i_2151_ = anInt9007 + anInt9009;
			int i_2152_ = anInt9003 + anInt9010;
			int i_2153_ = anInt8999;
			if (i_2151_ < 0) {
			    int i_2154_
				= (anInt9001 - 1 - i_2151_) / anInt9001;
			    i_2153_ += i_2154_;
			    i_2151_ += anInt9001 * i_2154_;
			    i_2152_ += anInt9000 * i_2154_;
			    i_2150_ += i_2154_;
			}
			int i_2155_;
			if ((i_2155_ = (1 + i_2151_ - (anInt8985 << 12)
					- anInt9001) / anInt9001)
			    > i_2153_)
			    i_2153_ = i_2155_;
			if (i_2152_ < 0) {
			    i_2155_ = (anInt9000 - 1 - i_2152_) / anInt9000;
			    i_2153_ += i_2155_;
			    i_2151_ += anInt9001 * i_2155_;
			    i_2152_ += anInt9000 * i_2155_;
			    i_2150_ += i_2155_;
			}
			if ((i_2155_ = (1 + i_2152_ - (anInt9002 << 12)
					- anInt9000) / anInt9000)
			    > i_2153_)
			    i_2153_ = i_2155_;
			int i_2156_ = is[i_2149_] - i;
			int i_2157_ = -is_2055_[i_2149_];
			int i_2158_ = i_2156_ - (i_2150_ - anInt8988);
			if (i_2158_ > 0) {
			    i_2150_ += i_2158_;
			    i_2153_ += i_2158_;
			    i_2151_ += anInt9001 * i_2158_;
			    i_2152_ += anInt9000 * i_2158_;
			} else
			    i_2157_ -= i_2158_;
			if (i_2153_ < i_2157_)
			    i_2153_ = i_2157_;
			for (/**/; i_2153_ < 0; i_2153_++) {
			    int i_2159_
				= (anIntArray11415
				   [(i_2152_ >> 12) * anInt8985 + (i_2151_
								   >> 12)]);
			    if (i_2159_ != 0)
				is_2057_[i_2150_++] = i_2159_;
			    else
				i_2150_++;
			    i_2151_ += anInt9001;
			    i_2152_ += anInt9000;
			}
		    }
		    i_2148_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    }
	}
    }
    
    public void method2655(int i, int i_2160_, int i_2161_) {
	throw new IllegalStateException("");
    }
}
