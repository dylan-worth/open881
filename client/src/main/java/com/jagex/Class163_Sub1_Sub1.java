/* Class163_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class163_Sub1_Sub1 extends Class163_Sub1
{
    int[] anIntArray11404;
    
    void method14517(int[] is, int[] is_0_, int i, int i_1_) {
	int[] is_2_ = aClass185_Sub2_9016.anIntArray9338;
	if (is_2_ != null) {
	    if (anInt9001 == 0) {
		if (anInt9000 == 0) {
		    int i_3_ = anInt8998;
		    while (i_3_ < 0) {
			int i_4_ = i_3_ + i_1_;
			if (i_4_ >= 0) {
			    if (i_4_ >= is.length)
				break;
			    int i_5_ = anInt8988;
			    int i_6_ = anInt9007;
			    int i_7_ = anInt9003;
			    int i_8_ = anInt8999;
			    if (i_6_ >= 0 && i_7_ >= 0
				&& i_6_ - (anInt8985 << 12) < 0
				&& i_7_ - (anInt9002 << 12) < 0) {
				int i_9_ = is[i_4_] - i;
				int i_10_ = -is_0_[i_4_];
				int i_11_ = i_9_ - (i_5_ - anInt8988);
				if (i_11_ > 0) {
				    i_5_ += i_11_;
				    i_8_ += i_11_;
				    i_6_ += anInt9001 * i_11_;
				    i_7_ += anInt9000 * i_11_;
				} else
				    i_10_ -= i_11_;
				if (i_8_ < i_10_)
				    i_8_ = i_10_;
				for (/**/; i_8_ < 0; i_8_++) {
				    int i_12_ = (anIntArray11404
						 [((i_7_ >> 12) * anInt8985
						   + (i_6_ >> 12))]);
				    int i_13_ = i_12_ >>> 24;
				    int i_14_ = 256 - i_13_;
				    int i_15_ = is_2_[i_5_];
				    is_2_[i_5_++]
					= ((((i_12_ & 0xff00ff) * i_13_
					     + (i_15_ & 0xff00ff) * i_14_)
					    & ~0xff00ff)
					   + (((i_12_ & 0xff00) * i_13_
					       + (i_15_ & 0xff00) * i_14_)
					      & 0xff0000)) >> 8;
				}
			    }
			}
			i_3_++;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_16_ = anInt8998;
		    while (i_16_ < 0) {
			int i_17_ = i_16_ + i_1_;
			if (i_17_ >= 0) {
			    if (i_17_ >= is.length)
				break;
			    int i_18_ = anInt8988;
			    int i_19_ = anInt9007;
			    int i_20_ = anInt9003 + anInt9010;
			    int i_21_ = anInt8999;
			    if (i_19_ >= 0 && i_19_ - (anInt8985 << 12) < 0) {
				int i_22_;
				if ((i_22_ = i_20_ - (anInt9002 << 12)) >= 0) {
				    i_22_ = (anInt9000 - i_22_) / anInt9000;
				    i_21_ += i_22_;
				    i_20_ += anInt9000 * i_22_;
				    i_18_ += i_22_;
				}
				if ((i_22_ = (i_20_ - anInt9000) / anInt9000)
				    > i_21_)
				    i_21_ = i_22_;
				int i_23_ = is[i_17_] - i;
				int i_24_ = -is_0_[i_17_];
				int i_25_ = i_23_ - (i_18_ - anInt8988);
				if (i_25_ > 0) {
				    i_18_ += i_25_;
				    i_21_ += i_25_;
				    i_19_ += anInt9001 * i_25_;
				    i_20_ += anInt9000 * i_25_;
				} else
				    i_24_ -= i_25_;
				if (i_21_ < i_24_)
				    i_21_ = i_24_;
				for (/**/; i_21_ < 0; i_21_++) {
				    int i_26_ = (anIntArray11404
						 [((i_20_ >> 12) * anInt8985
						   + (i_19_ >> 12))]);
				    int i_27_ = i_26_ >>> 24;
				    int i_28_ = 256 - i_27_;
				    int i_29_ = is_2_[i_18_];
				    is_2_[i_18_++]
					= ((((i_26_ & 0xff00ff) * i_27_
					     + (i_29_ & 0xff00ff) * i_28_)
					    & ~0xff00ff)
					   + (((i_26_ & 0xff00) * i_27_
					       + (i_29_ & 0xff00) * i_28_)
					      & 0xff0000)) >> 8;
				    i_20_ += anInt9000;
				}
			    }
			}
			i_16_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_30_ = anInt8998;
		    while (i_30_ < 0) {
			int i_31_ = i_30_ + i_1_;
			if (i_31_ >= 0) {
			    if (i_31_ >= is.length)
				break;
			    int i_32_ = anInt8988;
			    int i_33_ = anInt9007;
			    int i_34_ = anInt9003 + anInt9010;
			    int i_35_ = anInt8999;
			    if (i_33_ >= 0 && i_33_ - (anInt8985 << 12) < 0) {
				if (i_34_ < 0) {
				    int i_36_
					= (anInt9000 - 1 - i_34_) / anInt9000;
				    i_35_ += i_36_;
				    i_34_ += anInt9000 * i_36_;
				    i_32_ += i_36_;
				}
				int i_37_;
				if ((i_37_ = (1 + i_34_ - (anInt9002 << 12)
					      - anInt9000) / anInt9000)
				    > i_35_)
				    i_35_ = i_37_;
				int i_38_ = is[i_31_] - i;
				int i_39_ = -is_0_[i_31_];
				int i_40_ = i_38_ - (i_32_ - anInt8988);
				if (i_40_ > 0) {
				    i_32_ += i_40_;
				    i_35_ += i_40_;
				    i_33_ += anInt9001 * i_40_;
				    i_34_ += anInt9000 * i_40_;
				} else
				    i_39_ -= i_40_;
				if (i_35_ < i_39_)
				    i_35_ = i_39_;
				for (/**/; i_35_ < 0; i_35_++) {
				    int i_41_ = (anIntArray11404
						 [((i_34_ >> 12) * anInt8985
						   + (i_33_ >> 12))]);
				    int i_42_ = i_41_ >>> 24;
				    int i_43_ = 256 - i_42_;
				    int i_44_ = is_2_[i_32_];
				    is_2_[i_32_++]
					= ((((i_41_ & 0xff00ff) * i_42_
					     + (i_44_ & 0xff00ff) * i_43_)
					    & ~0xff00ff)
					   + (((i_41_ & 0xff00) * i_42_
					       + (i_44_ & 0xff00) * i_43_)
					      & 0xff0000)) >> 8;
				    i_34_ += anInt9000;
				}
			    }
			}
			i_30_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9001 < 0) {
		if (anInt9000 == 0) {
		    int i_45_ = anInt8998;
		    while (i_45_ < 0) {
			int i_46_ = i_45_ + i_1_;
			if (i_46_ >= 0) {
			    if (i_46_ >= is.length)
				break;
			    int i_47_ = anInt8988;
			    int i_48_ = anInt9007 + anInt9009;
			    int i_49_ = anInt9003;
			    int i_50_ = anInt8999;
			    if (i_49_ >= 0 && i_49_ - (anInt9002 << 12) < 0) {
				int i_51_;
				if ((i_51_ = i_48_ - (anInt8985 << 12)) >= 0) {
				    i_51_ = (anInt9001 - i_51_) / anInt9001;
				    i_50_ += i_51_;
				    i_48_ += anInt9001 * i_51_;
				    i_47_ += i_51_;
				}
				if ((i_51_ = (i_48_ - anInt9001) / anInt9001)
				    > i_50_)
				    i_50_ = i_51_;
				int i_52_ = is[i_46_] - i;
				int i_53_ = -is_0_[i_46_];
				int i_54_ = i_52_ - (i_47_ - anInt8988);
				if (i_54_ > 0) {
				    i_47_ += i_54_;
				    i_50_ += i_54_;
				    i_48_ += anInt9001 * i_54_;
				    i_49_ += anInt9000 * i_54_;
				} else
				    i_53_ -= i_54_;
				if (i_50_ < i_53_)
				    i_50_ = i_53_;
				for (/**/; i_50_ < 0; i_50_++) {
				    int i_55_ = (anIntArray11404
						 [((i_49_ >> 12) * anInt8985
						   + (i_48_ >> 12))]);
				    int i_56_ = i_55_ >>> 24;
				    int i_57_ = 256 - i_56_;
				    int i_58_ = is_2_[i_47_];
				    is_2_[i_47_++]
					= ((((i_55_ & 0xff00ff) * i_56_
					     + (i_58_ & 0xff00ff) * i_57_)
					    & ~0xff00ff)
					   + (((i_55_ & 0xff00) * i_56_
					       + (i_58_ & 0xff00) * i_57_)
					      & 0xff0000)) >> 8;
				    i_48_ += anInt9001;
				}
			    }
			}
			i_45_++;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_59_ = anInt8998;
		    while (i_59_ < 0) {
			int i_60_ = i_59_ + i_1_;
			if (i_60_ >= 0) {
			    if (i_60_ >= is.length)
				break;
			    int i_61_ = anInt8988;
			    int i_62_ = anInt9007 + anInt9009;
			    int i_63_ = anInt9003 + anInt9010;
			    int i_64_ = anInt8999;
			    int i_65_;
			    if ((i_65_ = i_62_ - (anInt8985 << 12)) >= 0) {
				i_65_ = (anInt9001 - i_65_) / anInt9001;
				i_64_ += i_65_;
				i_62_ += anInt9001 * i_65_;
				i_63_ += anInt9000 * i_65_;
				i_61_ += i_65_;
			    }
			    if ((i_65_ = (i_62_ - anInt9001) / anInt9001)
				> i_64_)
				i_64_ = i_65_;
			    if ((i_65_ = i_63_ - (anInt9002 << 12)) >= 0) {
				i_65_ = (anInt9000 - i_65_) / anInt9000;
				i_64_ += i_65_;
				i_62_ += anInt9001 * i_65_;
				i_63_ += anInt9000 * i_65_;
				i_61_ += i_65_;
			    }
			    if ((i_65_ = (i_63_ - anInt9000) / anInt9000)
				> i_64_)
				i_64_ = i_65_;
			    int i_66_ = is[i_60_] - i;
			    int i_67_ = -is_0_[i_60_];
			    int i_68_ = i_66_ - (i_61_ - anInt8988);
			    if (i_68_ > 0) {
				i_61_ += i_68_;
				i_64_ += i_68_;
				i_62_ += anInt9001 * i_68_;
				i_63_ += anInt9000 * i_68_;
			    } else
				i_67_ -= i_68_;
			    if (i_64_ < i_67_)
				i_64_ = i_67_;
			    for (/**/; i_64_ < 0; i_64_++) {
				int i_69_
				    = (anIntArray11404
				       [(i_63_ >> 12) * anInt8985 + (i_62_
								     >> 12)]);
				int i_70_ = i_69_ >>> 24;
				int i_71_ = 256 - i_70_;
				int i_72_ = is_2_[i_61_];
				is_2_[i_61_++]
				    = ((((i_69_ & 0xff00ff) * i_70_
					 + (i_72_ & 0xff00ff) * i_71_)
					& ~0xff00ff)
				       + (((i_69_ & 0xff00) * i_70_
					   + (i_72_ & 0xff00) * i_71_)
					  & 0xff0000)) >> 8;
				i_62_ += anInt9001;
				i_63_ += anInt9000;
			    }
			}
			i_59_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_73_ = anInt8998;
		    while (i_73_ < 0) {
			int i_74_ = i_73_ + i_1_;
			if (i_74_ >= 0) {
			    if (i_74_ >= is.length)
				break;
			    int i_75_ = anInt8988;
			    int i_76_ = anInt9007 + anInt9009;
			    int i_77_ = anInt9003 + anInt9010;
			    int i_78_ = anInt8999;
			    int i_79_;
			    if ((i_79_ = i_76_ - (anInt8985 << 12)) >= 0) {
				i_79_ = (anInt9001 - i_79_) / anInt9001;
				i_78_ += i_79_;
				i_76_ += anInt9001 * i_79_;
				i_77_ += anInt9000 * i_79_;
				i_75_ += i_79_;
			    }
			    if ((i_79_ = (i_76_ - anInt9001) / anInt9001)
				> i_78_)
				i_78_ = i_79_;
			    if (i_77_ < 0) {
				i_79_ = (anInt9000 - 1 - i_77_) / anInt9000;
				i_78_ += i_79_;
				i_76_ += anInt9001 * i_79_;
				i_77_ += anInt9000 * i_79_;
				i_75_ += i_79_;
			    }
			    if ((i_79_ = (1 + i_77_ - (anInt9002 << 12)
					  - anInt9000) / anInt9000)
				> i_78_)
				i_78_ = i_79_;
			    int i_80_ = is[i_74_] - i;
			    int i_81_ = -is_0_[i_74_];
			    int i_82_ = i_80_ - (i_75_ - anInt8988);
			    if (i_82_ > 0) {
				i_75_ += i_82_;
				i_78_ += i_82_;
				i_76_ += anInt9001 * i_82_;
				i_77_ += anInt9000 * i_82_;
			    } else
				i_81_ -= i_82_;
			    if (i_78_ < i_81_)
				i_78_ = i_81_;
			    for (/**/; i_78_ < 0; i_78_++) {
				int i_83_
				    = (anIntArray11404
				       [(i_77_ >> 12) * anInt8985 + (i_76_
								     >> 12)]);
				int i_84_ = i_83_ >>> 24;
				int i_85_ = 256 - i_84_;
				int i_86_ = is_2_[i_75_];
				is_2_[i_75_++]
				    = ((((i_83_ & 0xff00ff) * i_84_
					 + (i_86_ & 0xff00ff) * i_85_)
					& ~0xff00ff)
				       + (((i_83_ & 0xff00) * i_84_
					   + (i_86_ & 0xff00) * i_85_)
					  & 0xff0000)) >> 8;
				i_76_ += anInt9001;
				i_77_ += anInt9000;
			    }
			}
			i_73_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9000 == 0) {
		int i_87_ = anInt8998;
		while (i_87_ < 0) {
		    int i_88_ = i_87_ + i_1_;
		    if (i_88_ >= 0) {
			if (i_88_ >= is.length)
			    break;
			int i_89_ = anInt8988;
			int i_90_ = anInt9007 + anInt9009;
			int i_91_ = anInt9003;
			int i_92_ = anInt8999;
			if (i_91_ >= 0 && i_91_ - (anInt9002 << 12) < 0) {
			    if (i_90_ < 0) {
				int i_93_
				    = (anInt9001 - 1 - i_90_) / anInt9001;
				i_92_ += i_93_;
				i_90_ += anInt9001 * i_93_;
				i_89_ += i_93_;
			    }
			    int i_94_;
			    if ((i_94_ = (1 + i_90_ - (anInt8985 << 12)
					  - anInt9001) / anInt9001)
				> i_92_)
				i_92_ = i_94_;
			    int i_95_ = is[i_88_] - i;
			    int i_96_ = -is_0_[i_88_];
			    int i_97_ = i_95_ - (i_89_ - anInt8988);
			    if (i_97_ > 0) {
				i_89_ += i_97_;
				i_92_ += i_97_;
				i_90_ += anInt9001 * i_97_;
				i_91_ += anInt9000 * i_97_;
			    } else
				i_96_ -= i_97_;
			    if (i_92_ < i_96_)
				i_92_ = i_96_;
			    for (/**/; i_92_ < 0; i_92_++) {
				int i_98_
				    = (anIntArray11404
				       [(i_91_ >> 12) * anInt8985 + (i_90_
								     >> 12)]);
				int i_99_ = i_98_ >>> 24;
				int i_100_ = 256 - i_99_;
				int i_101_ = is_2_[i_89_];
				is_2_[i_89_++]
				    = ((((i_98_ & 0xff00ff) * i_99_
					 + (i_101_ & 0xff00ff) * i_100_)
					& ~0xff00ff)
				       + (((i_98_ & 0xff00) * i_99_
					   + (i_101_ & 0xff00) * i_100_)
					  & 0xff0000)) >> 8;
				i_90_ += anInt9001;
			    }
			}
		    }
		    i_87_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else if (anInt9000 < 0) {
		int i_102_ = anInt8998;
		while (i_102_ < 0) {
		    int i_103_ = i_102_ + i_1_;
		    if (i_103_ >= 0) {
			if (i_103_ >= is.length)
			    break;
			int i_104_ = anInt8988;
			int i_105_ = anInt9007 + anInt9009;
			int i_106_ = anInt9003 + anInt9010;
			int i_107_ = anInt8999;
			if (i_105_ < 0) {
			    int i_108_ = (anInt9001 - 1 - i_105_) / anInt9001;
			    i_107_ += i_108_;
			    i_105_ += anInt9001 * i_108_;
			    i_106_ += anInt9000 * i_108_;
			    i_104_ += i_108_;
			}
			int i_109_;
			if ((i_109_ = (1 + i_105_ - (anInt8985 << 12)
				       - anInt9001) / anInt9001)
			    > i_107_)
			    i_107_ = i_109_;
			if ((i_109_ = i_106_ - (anInt9002 << 12)) >= 0) {
			    i_109_ = (anInt9000 - i_109_) / anInt9000;
			    i_107_ += i_109_;
			    i_105_ += anInt9001 * i_109_;
			    i_106_ += anInt9000 * i_109_;
			    i_104_ += i_109_;
			}
			if ((i_109_ = (i_106_ - anInt9000) / anInt9000)
			    > i_107_)
			    i_107_ = i_109_;
			int i_110_ = is[i_103_] - i;
			int i_111_ = -is_0_[i_103_];
			int i_112_ = i_110_ - (i_104_ - anInt8988);
			if (i_112_ > 0) {
			    i_104_ += i_112_;
			    i_107_ += i_112_;
			    i_105_ += anInt9001 * i_112_;
			    i_106_ += anInt9000 * i_112_;
			} else
			    i_111_ -= i_112_;
			if (i_107_ < i_111_)
			    i_107_ = i_111_;
			for (/**/; i_107_ < 0; i_107_++) {
			    int i_113_
				= (anIntArray11404
				   [(i_106_ >> 12) * anInt8985 + (i_105_
								  >> 12)]);
			    int i_114_ = i_113_ >>> 24;
			    int i_115_ = 256 - i_114_;
			    int i_116_ = is_2_[i_104_];
			    is_2_[i_104_++]
				= ((((i_113_ & 0xff00ff) * i_114_
				     + (i_116_ & 0xff00ff) * i_115_)
				    & ~0xff00ff)
				   + (((i_113_ & 0xff00) * i_114_
				       + (i_116_ & 0xff00) * i_115_)
				      & 0xff0000)) >> 8;
			    i_105_ += anInt9001;
			    i_106_ += anInt9000;
			}
		    }
		    i_102_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else {
		int i_117_ = anInt8998;
		while (i_117_ < 0) {
		    int i_118_ = i_117_ + i_1_;
		    if (i_118_ >= 0) {
			if (i_118_ >= is.length)
			    break;
			int i_119_ = anInt8988;
			int i_120_ = anInt9007 + anInt9009;
			int i_121_ = anInt9003 + anInt9010;
			int i_122_ = anInt8999;
			if (i_120_ < 0) {
			    int i_123_ = (anInt9001 - 1 - i_120_) / anInt9001;
			    i_122_ += i_123_;
			    i_120_ += anInt9001 * i_123_;
			    i_121_ += anInt9000 * i_123_;
			    i_119_ += i_123_;
			}
			int i_124_;
			if ((i_124_ = (1 + i_120_ - (anInt8985 << 12)
				       - anInt9001) / anInt9001)
			    > i_122_)
			    i_122_ = i_124_;
			if (i_121_ < 0) {
			    i_124_ = (anInt9000 - 1 - i_121_) / anInt9000;
			    i_122_ += i_124_;
			    i_120_ += anInt9001 * i_124_;
			    i_121_ += anInt9000 * i_124_;
			    i_119_ += i_124_;
			}
			if ((i_124_ = (1 + i_121_ - (anInt9002 << 12)
				       - anInt9000) / anInt9000)
			    > i_122_)
			    i_122_ = i_124_;
			int i_125_ = is[i_118_] - i;
			int i_126_ = -is_0_[i_118_];
			int i_127_ = i_125_ - (i_119_ - anInt8988);
			if (i_127_ > 0) {
			    i_119_ += i_127_;
			    i_122_ += i_127_;
			    i_120_ += anInt9001 * i_127_;
			    i_121_ += anInt9000 * i_127_;
			} else
			    i_126_ -= i_127_;
			if (i_122_ < i_126_)
			    i_122_ = i_126_;
			for (/**/; i_122_ < 0; i_122_++) {
			    int i_128_
				= (anIntArray11404
				   [(i_121_ >> 12) * anInt8985 + (i_120_
								  >> 12)]);
			    int i_129_ = i_128_ >>> 24;
			    int i_130_ = 256 - i_129_;
			    int i_131_ = is_2_[i_119_];
			    is_2_[i_119_++]
				= ((((i_128_ & 0xff00ff) * i_129_
				     + (i_131_ & 0xff00ff) * i_130_)
				    & ~0xff00ff)
				   + (((i_128_ & 0xff00) * i_129_
				       + (i_131_ & 0xff00) * i_130_)
				      & 0xff0000)) >> 8;
			    i_120_ += anInt9001;
			    i_121_ += anInt9000;
			}
		    }
		    i_117_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    }
	}
    }
    
    Class163_Sub1_Sub1(Class185_Sub2 class185_sub2, int[] is, int i,
		       int i_132_, int i_133_, int i_134_, boolean bool) {
	super(class185_sub2, i_133_, i_134_);
	if (bool)
	    anIntArray11404 = new int[i_133_ * i_134_];
	else
	    anIntArray11404 = is;
	i_132_ -= anInt8985;
	int i_135_ = 0;
	for (int i_136_ = 0; i_136_ < i_134_; i_136_++) {
	    for (int i_137_ = 0; i_137_ < i_133_; i_137_++)
		anIntArray11404[i_135_++] = is[i++];
	    i += i_132_;
	}
    }
    
    public void method2684(int i, int i_138_, int i_139_, int i_140_,
			   int i_141_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    int i_142_ = aClass185_Sub2_9016.anInt9356 * 356365251;
	    i += anInt8987;
	    i_138_ += anInt8989;
	    int i_143_ = i_138_ * i_142_ + i;
	    int i_144_ = 0;
	    int i_145_ = anInt9002;
	    int i_146_ = anInt8985;
	    int i_147_ = i_142_ - i_146_;
	    int i_148_ = 0;
	    if (i_138_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		int i_149_ = aClass185_Sub2_9016.anInt9344 * 9823353 - i_138_;
		i_145_ -= i_149_;
		i_138_ = aClass185_Sub2_9016.anInt9344 * 9823353;
		i_144_ += i_149_ * i_146_;
		i_143_ += i_149_ * i_142_;
	    }
	    if (i_138_ + i_145_ > aClass185_Sub2_9016.anInt9345 * 639238427)
		i_145_ -= (i_138_ + i_145_
			   - aClass185_Sub2_9016.anInt9345 * 639238427);
	    if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		int i_150_ = aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		i_146_ -= i_150_;
		i = aClass185_Sub2_9016.anInt9365 * 1709859847;
		i_144_ += i_150_;
		i_143_ += i_150_;
		i_148_ += i_150_;
		i_147_ += i_150_;
	    }
	    if (i + i_146_ > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		int i_151_
		    = i + i_146_ - aClass185_Sub2_9016.anInt9343 * -1807368365;
		i_146_ -= i_151_;
		i_148_ += i_151_;
		i_147_ += i_151_;
	    }
	    if (i_146_ > 0 && i_145_ > 0) {
		if (i_141_ == 0) {
		    if (i_139_ == 1) {
			for (int i_152_ = -i_145_; i_152_ < 0; i_152_++) {
			    int i_153_ = i_143_ + i_146_ - 3;
			    while (i_143_ < i_153_) {
				is[i_143_++] = anIntArray11404[i_144_++];
				is[i_143_++] = anIntArray11404[i_144_++];
				is[i_143_++] = anIntArray11404[i_144_++];
				is[i_143_++] = anIntArray11404[i_144_++];
			    }
			    i_153_ += 3;
			    while (i_143_ < i_153_)
				is[i_143_++] = anIntArray11404[i_144_++];
			    i_143_ += i_147_;
			    i_144_ += i_148_;
			}
		    } else if (i_139_ == 0) {
			int i_154_ = (i_140_ & 0xff0000) >> 16;
			int i_155_ = (i_140_ & 0xff00) >> 8;
			int i_156_ = i_140_ & 0xff;
			for (int i_157_ = -i_145_; i_157_ < 0; i_157_++) {
			    for (int i_158_ = -i_146_; i_158_ < 0; i_158_++) {
				int i_159_ = anIntArray11404[i_144_++];
				int i_160_
				    = (i_159_ & 0xff0000) * i_154_ & ~0xffffff;
				int i_161_
				    = (i_159_ & 0xff00) * i_155_ & 0xff0000;
				int i_162_ = (i_159_ & 0xff) * i_156_ & 0xff00;
				is[i_143_++]
				    = (i_160_ | i_161_ | i_162_) >>> 8;
			    }
			    i_143_ += i_147_;
			    i_144_ += i_148_;
			}
		    } else if (i_139_ == 3) {
			for (int i_163_ = -i_145_; i_163_ < 0; i_163_++) {
			    for (int i_164_ = -i_146_; i_164_ < 0; i_164_++) {
				int i_165_ = anIntArray11404[i_144_++];
				int i_166_ = i_165_ + i_140_;
				int i_167_ = ((i_165_ & 0xff00ff)
					      + (i_140_ & 0xff00ff));
				int i_168_ = ((i_167_ & 0x1000100)
					      + (i_166_ - i_167_ & 0x10000));
				is[i_143_++]
				    = i_166_ - i_168_ | i_168_ - (i_168_
								  >>> 8);
			    }
			    i_143_ += i_147_;
			    i_144_ += i_148_;
			}
		    } else if (i_139_ == 2) {
			int i_169_ = i_140_ >>> 24;
			int i_170_ = 256 - i_169_;
			int i_171_ = (i_140_ & 0xff00ff) * i_170_ & ~0xff00ff;
			int i_172_ = (i_140_ & 0xff00) * i_170_ & 0xff0000;
			i_140_ = (i_171_ | i_172_) >>> 8;
			for (int i_173_ = -i_145_; i_173_ < 0; i_173_++) {
			    for (int i_174_ = -i_146_; i_174_ < 0; i_174_++) {
				int i_175_ = anIntArray11404[i_144_++];
				i_171_
				    = (i_175_ & 0xff00ff) * i_169_ & ~0xff00ff;
				i_172_ = (i_175_ & 0xff00) * i_169_ & 0xff0000;
				is[i_143_++]
				    = ((i_171_ | i_172_) >>> 8) + i_140_;
			    }
			    i_143_ += i_147_;
			    i_144_ += i_148_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_141_ == 1) {
		    if (i_139_ == 1) {
			for (int i_176_ = -i_145_; i_176_ < 0; i_176_++) {
			    for (int i_177_ = -i_146_; i_177_ < 0; i_177_++) {
				int i_178_ = anIntArray11404[i_144_++];
				int i_179_ = i_178_ >>> 24;
				int i_180_ = 256 - i_179_;
				int i_181_ = is[i_143_];
				is[i_143_++]
				    = (((((i_178_ & 0xff00ff) * i_179_
					  + (i_181_ & 0xff00ff) * i_180_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_178_ & ~0xff00ff) >>> 8)
					    * i_179_)
					   + (((i_181_ & ~0xff00ff) >>> 8)
					      * i_180_))
					  & ~0xff00ff));
			    }
			    i_143_ += i_147_;
			    i_144_ += i_148_;
			}
		    } else if (i_139_ == 0) {
			if ((i_140_ & 0xffffff) == 16777215) {
			    for (int i_182_ = -i_145_; i_182_ < 0; i_182_++) {
				for (int i_183_ = -i_146_; i_183_ < 0;
				     i_183_++) {
				    int i_184_ = anIntArray11404[i_144_++];
				    int i_185_
					= ((i_184_ >>> 24) * (i_140_ >>> 24)
					   >> 8);
				    int i_186_ = 256 - i_185_;
				    int i_187_ = is[i_143_];
				    is[i_143_++]
					= ((((i_184_ & 0xff00ff) * i_185_
					     + (i_187_ & 0xff00ff) * i_186_)
					    & ~0xff00ff)
					   + (((i_184_ & 0xff00) * i_185_
					       + (i_187_ & 0xff00) * i_186_)
					      & 0xff0000)) >> 8;
				}
				i_143_ += i_147_;
				i_144_ += i_148_;
			    }
			} else {
			    int i_188_ = (i_140_ & 0xff0000) >> 16;
			    int i_189_ = (i_140_ & 0xff00) >> 8;
			    int i_190_ = i_140_ & 0xff;
			    for (int i_191_ = -i_145_; i_191_ < 0; i_191_++) {
				for (int i_192_ = -i_146_; i_192_ < 0;
				     i_192_++) {
				    int i_193_ = anIntArray11404[i_144_++];
				    int i_194_
					= ((i_193_ >>> 24) * (i_140_ >>> 24)
					   >> 8);
				    int i_195_ = 256 - i_194_;
				    if (i_194_ != 255) {
					int i_196_
					    = ((i_193_ & 0xff0000) * i_188_
					       & ~0xffffff);
					int i_197_
					    = ((i_193_ & 0xff00) * i_189_
					       & 0xff0000);
					int i_198_ = ((i_193_ & 0xff) * i_190_
						      & 0xff00);
					i_193_
					    = (i_196_ | i_197_ | i_198_) >>> 8;
					int i_199_ = is[i_143_];
					is[i_143_++]
					    = ((((i_193_ & 0xff00ff) * i_194_
						 + ((i_199_ & 0xff00ff)
						    * i_195_))
						& ~0xff00ff)
					       + (((i_193_ & 0xff00) * i_194_
						   + ((i_199_ & 0xff00)
						      * i_195_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_200_
					    = ((i_193_ & 0xff0000) * i_188_
					       & ~0xffffff);
					int i_201_
					    = ((i_193_ & 0xff00) * i_189_
					       & 0xff0000);
					int i_202_ = ((i_193_ & 0xff) * i_190_
						      & 0xff00);
					is[i_143_++]
					    = (i_200_ | i_201_ | i_202_) >>> 8;
				    }
				}
				i_143_ += i_147_;
				i_144_ += i_148_;
			    }
			}
		    } else if (i_139_ == 3) {
			for (int i_203_ = -i_145_; i_203_ < 0; i_203_++) {
			    for (int i_204_ = -i_146_; i_204_ < 0; i_204_++) {
				int i_205_ = anIntArray11404[i_144_++];
				int i_206_ = i_205_ + i_140_;
				int i_207_ = ((i_205_ & 0xff00ff)
					      + (i_140_ & 0xff00ff));
				int i_208_ = ((i_207_ & 0x1000100)
					      + (i_206_ - i_207_ & 0x10000));
				i_208_ = i_206_ - i_208_ | i_208_ - (i_208_
								     >>> 8);
				int i_209_
				    = (i_208_ >>> 24) * (i_140_ >>> 24) >> 8;
				int i_210_ = 256 - i_209_;
				if (i_209_ != 255) {
				    i_205_ = i_208_;
				    i_208_ = is[i_143_];
				    i_208_ = ((((i_205_ & 0xff00ff) * i_209_
						+ (i_208_ & 0xff00ff) * i_210_)
					       & ~0xff00ff)
					      + (((i_205_ & 0xff00) * i_209_
						  + (i_208_ & 0xff00) * i_210_)
						 & 0xff0000)) >> 8;
				}
				is[i_143_++] = i_208_;
			    }
			    i_143_ += i_147_;
			    i_144_ += i_148_;
			}
		    } else if (i_139_ == 2) {
			int i_211_ = i_140_ >>> 24;
			int i_212_ = 256 - i_211_;
			int i_213_ = (i_140_ & 0xff00ff) * i_212_ & ~0xff00ff;
			int i_214_ = (i_140_ & 0xff00) * i_212_ & 0xff0000;
			i_140_ = (i_213_ | i_214_) >>> 8;
			for (int i_215_ = -i_145_; i_215_ < 0; i_215_++) {
			    for (int i_216_ = -i_146_; i_216_ < 0; i_216_++) {
				int i_217_ = anIntArray11404[i_144_++];
				int i_218_ = i_217_ >>> 24;
				int i_219_ = 256 - i_218_;
				i_213_
				    = (i_217_ & 0xff00ff) * i_211_ & ~0xff00ff;
				i_214_ = (i_217_ & 0xff00) * i_211_ & 0xff0000;
				i_217_ = ((i_213_ | i_214_) >>> 8) + i_140_;
				int i_220_ = is[i_143_];
				is[i_143_++]
				    = ((((i_217_ & 0xff00ff) * i_218_
					 + (i_220_ & 0xff00ff) * i_219_)
					& ~0xff00ff)
				       + (((i_217_ & 0xff00) * i_218_
					   + (i_220_ & 0xff00) * i_219_)
					  & 0xff0000)) >> 8;
			    }
			    i_143_ += i_147_;
			    i_144_ += i_148_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_141_ == 2) {
		    if (i_139_ == 1) {
			for (int i_221_ = -i_145_; i_221_ < 0; i_221_++) {
			    for (int i_222_ = -i_146_; i_222_ < 0; i_222_++) {
				int i_223_ = anIntArray11404[i_144_++];
				if (i_223_ != 0) {
				    int i_224_ = is[i_143_];
				    int i_225_ = i_223_ + i_224_;
				    int i_226_ = ((i_223_ & 0xff00ff)
						  + (i_224_ & 0xff00ff));
				    i_224_ = ((i_226_ & 0x1000100)
					      + (i_225_ - i_226_ & 0x10000));
				    is[i_143_++]
					= i_225_ - i_224_ | i_224_ - (i_224_
								      >>> 8);
				} else
				    i_143_++;
			    }
			    i_143_ += i_147_;
			    i_144_ += i_148_;
			}
		    } else if (i_139_ == 0) {
			int i_227_ = (i_140_ & 0xff0000) >> 16;
			int i_228_ = (i_140_ & 0xff00) >> 8;
			int i_229_ = i_140_ & 0xff;
			for (int i_230_ = -i_145_; i_230_ < 0; i_230_++) {
			    for (int i_231_ = -i_146_; i_231_ < 0; i_231_++) {
				int i_232_ = anIntArray11404[i_144_++];
				if (i_232_ != 0) {
				    int i_233_ = ((i_232_ & 0xff0000) * i_227_
						  & ~0xffffff);
				    int i_234_ = ((i_232_ & 0xff00) * i_228_
						  & 0xff0000);
				    int i_235_
					= (i_232_ & 0xff) * i_229_ & 0xff00;
				    i_232_ = (i_233_ | i_234_ | i_235_) >>> 8;
				    int i_236_ = is[i_143_];
				    int i_237_ = i_232_ + i_236_;
				    int i_238_ = ((i_232_ & 0xff00ff)
						  + (i_236_ & 0xff00ff));
				    i_236_ = ((i_238_ & 0x1000100)
					      + (i_237_ - i_238_ & 0x10000));
				    is[i_143_++]
					= i_237_ - i_236_ | i_236_ - (i_236_
								      >>> 8);
				} else
				    i_143_++;
			    }
			    i_143_ += i_147_;
			    i_144_ += i_148_;
			}
		    } else if (i_139_ == 3) {
			for (int i_239_ = -i_145_; i_239_ < 0; i_239_++) {
			    for (int i_240_ = -i_146_; i_240_ < 0; i_240_++) {
				int i_241_ = anIntArray11404[i_144_++];
				int i_242_ = i_241_ + i_140_;
				int i_243_ = ((i_241_ & 0xff00ff)
					      + (i_140_ & 0xff00ff));
				int i_244_ = ((i_243_ & 0x1000100)
					      + (i_242_ - i_243_ & 0x10000));
				i_241_ = i_242_ - i_244_ | i_244_ - (i_244_
								     >>> 8);
				i_244_ = is[i_143_];
				i_242_ = i_241_ + i_244_;
				i_243_ = (i_241_ & 0xff00ff) + (i_244_
								& 0xff00ff);
				i_244_
				    = (i_243_ & 0x1000100) + (i_242_ - i_243_
							      & 0x10000);
				is[i_143_++]
				    = i_242_ - i_244_ | i_244_ - (i_244_
								  >>> 8);
			    }
			    i_143_ += i_147_;
			    i_144_ += i_148_;
			}
		    } else if (i_139_ == 2) {
			int i_245_ = i_140_ >>> 24;
			int i_246_ = 256 - i_245_;
			int i_247_ = (i_140_ & 0xff00ff) * i_246_ & ~0xff00ff;
			int i_248_ = (i_140_ & 0xff00) * i_246_ & 0xff0000;
			i_140_ = (i_247_ | i_248_) >>> 8;
			for (int i_249_ = -i_145_; i_249_ < 0; i_249_++) {
			    for (int i_250_ = -i_146_; i_250_ < 0; i_250_++) {
				int i_251_ = anIntArray11404[i_144_++];
				if (i_251_ != 0) {
				    i_247_ = ((i_251_ & 0xff00ff) * i_245_
					      & ~0xff00ff);
				    i_248_ = ((i_251_ & 0xff00) * i_245_
					      & 0xff0000);
				    i_251_
					= ((i_247_ | i_248_) >>> 8) + i_140_;
				    int i_252_ = is[i_143_];
				    int i_253_ = i_251_ + i_252_;
				    int i_254_ = ((i_251_ & 0xff00ff)
						  + (i_252_ & 0xff00ff));
				    i_252_ = ((i_254_ & 0x1000100)
					      + (i_253_ - i_254_ & 0x10000));
				    is[i_143_++]
					= i_253_ - i_252_ | i_252_ - (i_252_
								      >>> 8);
				} else
				    i_143_++;
			    }
			    i_143_ += i_147_;
			    i_144_ += i_148_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2652(int i, int i_255_, int i_256_, int i_257_, int[] is,
			   int i_258_, int i_259_) {
	i_259_ -= i_256_;
	for (int i_260_ = 0; i_260_ < i_257_; i_260_++) {
	    int i_261_ = (i_255_ + i_260_) * i_256_ + i;
	    for (int i_262_ = 0; i_262_ < i_256_; i_262_++)
		anIntArray11404[i_261_ + i_262_] = is[i_258_++];
	    i_258_ += i_259_;
	}
    }
    
    void method14514(int[] is, int[] is_263_, int i, int i_264_) {
	int[] is_265_ = aClass185_Sub2_9016.anIntArray9338;
	if (is_265_ != null) {
	    if (anInt9001 == 0) {
		if (anInt9000 == 0) {
		    int i_266_ = anInt8998;
		    while (i_266_ < 0) {
			int i_267_ = i_266_ + i_264_;
			if (i_267_ >= 0) {
			    if (i_267_ >= is.length)
				break;
			    int i_268_ = anInt8988;
			    int i_269_ = anInt9007;
			    int i_270_ = anInt9003;
			    int i_271_ = anInt8999;
			    if (i_269_ >= 0 && i_270_ >= 0
				&& i_269_ - (anInt8985 << 12) < 0
				&& i_270_ - (anInt9002 << 12) < 0) {
				int i_272_ = is[i_267_] - i;
				int i_273_ = -is_263_[i_267_];
				int i_274_ = i_272_ - (i_268_ - anInt8988);
				if (i_274_ > 0) {
				    i_268_ += i_274_;
				    i_271_ += i_274_;
				    i_269_ += anInt9001 * i_274_;
				    i_270_ += anInt9000 * i_274_;
				} else
				    i_273_ -= i_274_;
				if (i_271_ < i_273_)
				    i_271_ = i_273_;
				for (/**/; i_271_ < 0; i_271_++) {
				    int i_275_ = (anIntArray11404
						  [((i_270_ >> 12) * anInt8985
						    + (i_269_ >> 12))]);
				    int i_276_ = i_275_ >>> 24;
				    int i_277_ = 256 - i_276_;
				    int i_278_ = is_265_[i_268_];
				    is_265_[i_268_++]
					= ((((i_275_ & 0xff00ff) * i_276_
					     + (i_278_ & 0xff00ff) * i_277_)
					    & ~0xff00ff)
					   + (((i_275_ & 0xff00) * i_276_
					       + (i_278_ & 0xff00) * i_277_)
					      & 0xff0000)) >> 8;
				}
			    }
			}
			i_266_++;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_279_ = anInt8998;
		    while (i_279_ < 0) {
			int i_280_ = i_279_ + i_264_;
			if (i_280_ >= 0) {
			    if (i_280_ >= is.length)
				break;
			    int i_281_ = anInt8988;
			    int i_282_ = anInt9007;
			    int i_283_ = anInt9003 + anInt9010;
			    int i_284_ = anInt8999;
			    if (i_282_ >= 0
				&& i_282_ - (anInt8985 << 12) < 0) {
				int i_285_;
				if ((i_285_ = i_283_ - (anInt9002 << 12))
				    >= 0) {
				    i_285_ = (anInt9000 - i_285_) / anInt9000;
				    i_284_ += i_285_;
				    i_283_ += anInt9000 * i_285_;
				    i_281_ += i_285_;
				}
				if ((i_285_ = (i_283_ - anInt9000) / anInt9000)
				    > i_284_)
				    i_284_ = i_285_;
				int i_286_ = is[i_280_] - i;
				int i_287_ = -is_263_[i_280_];
				int i_288_ = i_286_ - (i_281_ - anInt8988);
				if (i_288_ > 0) {
				    i_281_ += i_288_;
				    i_284_ += i_288_;
				    i_282_ += anInt9001 * i_288_;
				    i_283_ += anInt9000 * i_288_;
				} else
				    i_287_ -= i_288_;
				if (i_284_ < i_287_)
				    i_284_ = i_287_;
				for (/**/; i_284_ < 0; i_284_++) {
				    int i_289_ = (anIntArray11404
						  [((i_283_ >> 12) * anInt8985
						    + (i_282_ >> 12))]);
				    int i_290_ = i_289_ >>> 24;
				    int i_291_ = 256 - i_290_;
				    int i_292_ = is_265_[i_281_];
				    is_265_[i_281_++]
					= ((((i_289_ & 0xff00ff) * i_290_
					     + (i_292_ & 0xff00ff) * i_291_)
					    & ~0xff00ff)
					   + (((i_289_ & 0xff00) * i_290_
					       + (i_292_ & 0xff00) * i_291_)
					      & 0xff0000)) >> 8;
				    i_283_ += anInt9000;
				}
			    }
			}
			i_279_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_293_ = anInt8998;
		    while (i_293_ < 0) {
			int i_294_ = i_293_ + i_264_;
			if (i_294_ >= 0) {
			    if (i_294_ >= is.length)
				break;
			    int i_295_ = anInt8988;
			    int i_296_ = anInt9007;
			    int i_297_ = anInt9003 + anInt9010;
			    int i_298_ = anInt8999;
			    if (i_296_ >= 0
				&& i_296_ - (anInt8985 << 12) < 0) {
				if (i_297_ < 0) {
				    int i_299_
					= (anInt9000 - 1 - i_297_) / anInt9000;
				    i_298_ += i_299_;
				    i_297_ += anInt9000 * i_299_;
				    i_295_ += i_299_;
				}
				int i_300_;
				if ((i_300_ = (1 + i_297_ - (anInt9002 << 12)
					       - anInt9000) / anInt9000)
				    > i_298_)
				    i_298_ = i_300_;
				int i_301_ = is[i_294_] - i;
				int i_302_ = -is_263_[i_294_];
				int i_303_ = i_301_ - (i_295_ - anInt8988);
				if (i_303_ > 0) {
				    i_295_ += i_303_;
				    i_298_ += i_303_;
				    i_296_ += anInt9001 * i_303_;
				    i_297_ += anInt9000 * i_303_;
				} else
				    i_302_ -= i_303_;
				if (i_298_ < i_302_)
				    i_298_ = i_302_;
				for (/**/; i_298_ < 0; i_298_++) {
				    int i_304_ = (anIntArray11404
						  [((i_297_ >> 12) * anInt8985
						    + (i_296_ >> 12))]);
				    int i_305_ = i_304_ >>> 24;
				    int i_306_ = 256 - i_305_;
				    int i_307_ = is_265_[i_295_];
				    is_265_[i_295_++]
					= ((((i_304_ & 0xff00ff) * i_305_
					     + (i_307_ & 0xff00ff) * i_306_)
					    & ~0xff00ff)
					   + (((i_304_ & 0xff00) * i_305_
					       + (i_307_ & 0xff00) * i_306_)
					      & 0xff0000)) >> 8;
				    i_297_ += anInt9000;
				}
			    }
			}
			i_293_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9001 < 0) {
		if (anInt9000 == 0) {
		    int i_308_ = anInt8998;
		    while (i_308_ < 0) {
			int i_309_ = i_308_ + i_264_;
			if (i_309_ >= 0) {
			    if (i_309_ >= is.length)
				break;
			    int i_310_ = anInt8988;
			    int i_311_ = anInt9007 + anInt9009;
			    int i_312_ = anInt9003;
			    int i_313_ = anInt8999;
			    if (i_312_ >= 0
				&& i_312_ - (anInt9002 << 12) < 0) {
				int i_314_;
				if ((i_314_ = i_311_ - (anInt8985 << 12))
				    >= 0) {
				    i_314_ = (anInt9001 - i_314_) / anInt9001;
				    i_313_ += i_314_;
				    i_311_ += anInt9001 * i_314_;
				    i_310_ += i_314_;
				}
				if ((i_314_ = (i_311_ - anInt9001) / anInt9001)
				    > i_313_)
				    i_313_ = i_314_;
				int i_315_ = is[i_309_] - i;
				int i_316_ = -is_263_[i_309_];
				int i_317_ = i_315_ - (i_310_ - anInt8988);
				if (i_317_ > 0) {
				    i_310_ += i_317_;
				    i_313_ += i_317_;
				    i_311_ += anInt9001 * i_317_;
				    i_312_ += anInt9000 * i_317_;
				} else
				    i_316_ -= i_317_;
				if (i_313_ < i_316_)
				    i_313_ = i_316_;
				for (/**/; i_313_ < 0; i_313_++) {
				    int i_318_ = (anIntArray11404
						  [((i_312_ >> 12) * anInt8985
						    + (i_311_ >> 12))]);
				    int i_319_ = i_318_ >>> 24;
				    int i_320_ = 256 - i_319_;
				    int i_321_ = is_265_[i_310_];
				    is_265_[i_310_++]
					= ((((i_318_ & 0xff00ff) * i_319_
					     + (i_321_ & 0xff00ff) * i_320_)
					    & ~0xff00ff)
					   + (((i_318_ & 0xff00) * i_319_
					       + (i_321_ & 0xff00) * i_320_)
					      & 0xff0000)) >> 8;
				    i_311_ += anInt9001;
				}
			    }
			}
			i_308_++;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_322_ = anInt8998;
		    while (i_322_ < 0) {
			int i_323_ = i_322_ + i_264_;
			if (i_323_ >= 0) {
			    if (i_323_ >= is.length)
				break;
			    int i_324_ = anInt8988;
			    int i_325_ = anInt9007 + anInt9009;
			    int i_326_ = anInt9003 + anInt9010;
			    int i_327_ = anInt8999;
			    int i_328_;
			    if ((i_328_ = i_325_ - (anInt8985 << 12)) >= 0) {
				i_328_ = (anInt9001 - i_328_) / anInt9001;
				i_327_ += i_328_;
				i_325_ += anInt9001 * i_328_;
				i_326_ += anInt9000 * i_328_;
				i_324_ += i_328_;
			    }
			    if ((i_328_ = (i_325_ - anInt9001) / anInt9001)
				> i_327_)
				i_327_ = i_328_;
			    if ((i_328_ = i_326_ - (anInt9002 << 12)) >= 0) {
				i_328_ = (anInt9000 - i_328_) / anInt9000;
				i_327_ += i_328_;
				i_325_ += anInt9001 * i_328_;
				i_326_ += anInt9000 * i_328_;
				i_324_ += i_328_;
			    }
			    if ((i_328_ = (i_326_ - anInt9000) / anInt9000)
				> i_327_)
				i_327_ = i_328_;
			    int i_329_ = is[i_323_] - i;
			    int i_330_ = -is_263_[i_323_];
			    int i_331_ = i_329_ - (i_324_ - anInt8988);
			    if (i_331_ > 0) {
				i_324_ += i_331_;
				i_327_ += i_331_;
				i_325_ += anInt9001 * i_331_;
				i_326_ += anInt9000 * i_331_;
			    } else
				i_330_ -= i_331_;
			    if (i_327_ < i_330_)
				i_327_ = i_330_;
			    for (/**/; i_327_ < 0; i_327_++) {
				int i_332_
				    = (anIntArray11404
				       [(i_326_ >> 12) * anInt8985 + (i_325_
								      >> 12)]);
				int i_333_ = i_332_ >>> 24;
				int i_334_ = 256 - i_333_;
				int i_335_ = is_265_[i_324_];
				is_265_[i_324_++]
				    = ((((i_332_ & 0xff00ff) * i_333_
					 + (i_335_ & 0xff00ff) * i_334_)
					& ~0xff00ff)
				       + (((i_332_ & 0xff00) * i_333_
					   + (i_335_ & 0xff00) * i_334_)
					  & 0xff0000)) >> 8;
				i_325_ += anInt9001;
				i_326_ += anInt9000;
			    }
			}
			i_322_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_336_ = anInt8998;
		    while (i_336_ < 0) {
			int i_337_ = i_336_ + i_264_;
			if (i_337_ >= 0) {
			    if (i_337_ >= is.length)
				break;
			    int i_338_ = anInt8988;
			    int i_339_ = anInt9007 + anInt9009;
			    int i_340_ = anInt9003 + anInt9010;
			    int i_341_ = anInt8999;
			    int i_342_;
			    if ((i_342_ = i_339_ - (anInt8985 << 12)) >= 0) {
				i_342_ = (anInt9001 - i_342_) / anInt9001;
				i_341_ += i_342_;
				i_339_ += anInt9001 * i_342_;
				i_340_ += anInt9000 * i_342_;
				i_338_ += i_342_;
			    }
			    if ((i_342_ = (i_339_ - anInt9001) / anInt9001)
				> i_341_)
				i_341_ = i_342_;
			    if (i_340_ < 0) {
				i_342_ = (anInt9000 - 1 - i_340_) / anInt9000;
				i_341_ += i_342_;
				i_339_ += anInt9001 * i_342_;
				i_340_ += anInt9000 * i_342_;
				i_338_ += i_342_;
			    }
			    if ((i_342_ = (1 + i_340_ - (anInt9002 << 12)
					   - anInt9000) / anInt9000)
				> i_341_)
				i_341_ = i_342_;
			    int i_343_ = is[i_337_] - i;
			    int i_344_ = -is_263_[i_337_];
			    int i_345_ = i_343_ - (i_338_ - anInt8988);
			    if (i_345_ > 0) {
				i_338_ += i_345_;
				i_341_ += i_345_;
				i_339_ += anInt9001 * i_345_;
				i_340_ += anInt9000 * i_345_;
			    } else
				i_344_ -= i_345_;
			    if (i_341_ < i_344_)
				i_341_ = i_344_;
			    for (/**/; i_341_ < 0; i_341_++) {
				int i_346_
				    = (anIntArray11404
				       [(i_340_ >> 12) * anInt8985 + (i_339_
								      >> 12)]);
				int i_347_ = i_346_ >>> 24;
				int i_348_ = 256 - i_347_;
				int i_349_ = is_265_[i_338_];
				is_265_[i_338_++]
				    = ((((i_346_ & 0xff00ff) * i_347_
					 + (i_349_ & 0xff00ff) * i_348_)
					& ~0xff00ff)
				       + (((i_346_ & 0xff00) * i_347_
					   + (i_349_ & 0xff00) * i_348_)
					  & 0xff0000)) >> 8;
				i_339_ += anInt9001;
				i_340_ += anInt9000;
			    }
			}
			i_336_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9000 == 0) {
		int i_350_ = anInt8998;
		while (i_350_ < 0) {
		    int i_351_ = i_350_ + i_264_;
		    if (i_351_ >= 0) {
			if (i_351_ >= is.length)
			    break;
			int i_352_ = anInt8988;
			int i_353_ = anInt9007 + anInt9009;
			int i_354_ = anInt9003;
			int i_355_ = anInt8999;
			if (i_354_ >= 0 && i_354_ - (anInt9002 << 12) < 0) {
			    if (i_353_ < 0) {
				int i_356_
				    = (anInt9001 - 1 - i_353_) / anInt9001;
				i_355_ += i_356_;
				i_353_ += anInt9001 * i_356_;
				i_352_ += i_356_;
			    }
			    int i_357_;
			    if ((i_357_ = (1 + i_353_ - (anInt8985 << 12)
					   - anInt9001) / anInt9001)
				> i_355_)
				i_355_ = i_357_;
			    int i_358_ = is[i_351_] - i;
			    int i_359_ = -is_263_[i_351_];
			    int i_360_ = i_358_ - (i_352_ - anInt8988);
			    if (i_360_ > 0) {
				i_352_ += i_360_;
				i_355_ += i_360_;
				i_353_ += anInt9001 * i_360_;
				i_354_ += anInt9000 * i_360_;
			    } else
				i_359_ -= i_360_;
			    if (i_355_ < i_359_)
				i_355_ = i_359_;
			    for (/**/; i_355_ < 0; i_355_++) {
				int i_361_
				    = (anIntArray11404
				       [(i_354_ >> 12) * anInt8985 + (i_353_
								      >> 12)]);
				int i_362_ = i_361_ >>> 24;
				int i_363_ = 256 - i_362_;
				int i_364_ = is_265_[i_352_];
				is_265_[i_352_++]
				    = ((((i_361_ & 0xff00ff) * i_362_
					 + (i_364_ & 0xff00ff) * i_363_)
					& ~0xff00ff)
				       + (((i_361_ & 0xff00) * i_362_
					   + (i_364_ & 0xff00) * i_363_)
					  & 0xff0000)) >> 8;
				i_353_ += anInt9001;
			    }
			}
		    }
		    i_350_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else if (anInt9000 < 0) {
		int i_365_ = anInt8998;
		while (i_365_ < 0) {
		    int i_366_ = i_365_ + i_264_;
		    if (i_366_ >= 0) {
			if (i_366_ >= is.length)
			    break;
			int i_367_ = anInt8988;
			int i_368_ = anInt9007 + anInt9009;
			int i_369_ = anInt9003 + anInt9010;
			int i_370_ = anInt8999;
			if (i_368_ < 0) {
			    int i_371_ = (anInt9001 - 1 - i_368_) / anInt9001;
			    i_370_ += i_371_;
			    i_368_ += anInt9001 * i_371_;
			    i_369_ += anInt9000 * i_371_;
			    i_367_ += i_371_;
			}
			int i_372_;
			if ((i_372_ = (1 + i_368_ - (anInt8985 << 12)
				       - anInt9001) / anInt9001)
			    > i_370_)
			    i_370_ = i_372_;
			if ((i_372_ = i_369_ - (anInt9002 << 12)) >= 0) {
			    i_372_ = (anInt9000 - i_372_) / anInt9000;
			    i_370_ += i_372_;
			    i_368_ += anInt9001 * i_372_;
			    i_369_ += anInt9000 * i_372_;
			    i_367_ += i_372_;
			}
			if ((i_372_ = (i_369_ - anInt9000) / anInt9000)
			    > i_370_)
			    i_370_ = i_372_;
			int i_373_ = is[i_366_] - i;
			int i_374_ = -is_263_[i_366_];
			int i_375_ = i_373_ - (i_367_ - anInt8988);
			if (i_375_ > 0) {
			    i_367_ += i_375_;
			    i_370_ += i_375_;
			    i_368_ += anInt9001 * i_375_;
			    i_369_ += anInt9000 * i_375_;
			} else
			    i_374_ -= i_375_;
			if (i_370_ < i_374_)
			    i_370_ = i_374_;
			for (/**/; i_370_ < 0; i_370_++) {
			    int i_376_
				= (anIntArray11404
				   [(i_369_ >> 12) * anInt8985 + (i_368_
								  >> 12)]);
			    int i_377_ = i_376_ >>> 24;
			    int i_378_ = 256 - i_377_;
			    int i_379_ = is_265_[i_367_];
			    is_265_[i_367_++]
				= ((((i_376_ & 0xff00ff) * i_377_
				     + (i_379_ & 0xff00ff) * i_378_)
				    & ~0xff00ff)
				   + (((i_376_ & 0xff00) * i_377_
				       + (i_379_ & 0xff00) * i_378_)
				      & 0xff0000)) >> 8;
			    i_368_ += anInt9001;
			    i_369_ += anInt9000;
			}
		    }
		    i_365_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else {
		int i_380_ = anInt8998;
		while (i_380_ < 0) {
		    int i_381_ = i_380_ + i_264_;
		    if (i_381_ >= 0) {
			if (i_381_ >= is.length)
			    break;
			int i_382_ = anInt8988;
			int i_383_ = anInt9007 + anInt9009;
			int i_384_ = anInt9003 + anInt9010;
			int i_385_ = anInt8999;
			if (i_383_ < 0) {
			    int i_386_ = (anInt9001 - 1 - i_383_) / anInt9001;
			    i_385_ += i_386_;
			    i_383_ += anInt9001 * i_386_;
			    i_384_ += anInt9000 * i_386_;
			    i_382_ += i_386_;
			}
			int i_387_;
			if ((i_387_ = (1 + i_383_ - (anInt8985 << 12)
				       - anInt9001) / anInt9001)
			    > i_385_)
			    i_385_ = i_387_;
			if (i_384_ < 0) {
			    i_387_ = (anInt9000 - 1 - i_384_) / anInt9000;
			    i_385_ += i_387_;
			    i_383_ += anInt9001 * i_387_;
			    i_384_ += anInt9000 * i_387_;
			    i_382_ += i_387_;
			}
			if ((i_387_ = (1 + i_384_ - (anInt9002 << 12)
				       - anInt9000) / anInt9000)
			    > i_385_)
			    i_385_ = i_387_;
			int i_388_ = is[i_381_] - i;
			int i_389_ = -is_263_[i_381_];
			int i_390_ = i_388_ - (i_382_ - anInt8988);
			if (i_390_ > 0) {
			    i_382_ += i_390_;
			    i_385_ += i_390_;
			    i_383_ += anInt9001 * i_390_;
			    i_384_ += anInt9000 * i_390_;
			} else
			    i_389_ -= i_390_;
			if (i_385_ < i_389_)
			    i_385_ = i_389_;
			for (/**/; i_385_ < 0; i_385_++) {
			    int i_391_
				= (anIntArray11404
				   [(i_384_ >> 12) * anInt8985 + (i_383_
								  >> 12)]);
			    int i_392_ = i_391_ >>> 24;
			    int i_393_ = 256 - i_392_;
			    int i_394_ = is_265_[i_382_];
			    is_265_[i_382_++]
				= ((((i_391_ & 0xff00ff) * i_392_
				     + (i_394_ & 0xff00ff) * i_393_)
				    & ~0xff00ff)
				   + (((i_391_ & 0xff00) * i_392_
				       + (i_394_ & 0xff00) * i_393_)
				      & 0xff0000)) >> 8;
			    i_383_ += anInt9001;
			    i_384_ += anInt9000;
			}
		    }
		    i_380_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    }
	}
    }
    
    public Interface22 method2650() {
	return new Class115(anInt8985, anInt9002, anIntArray11404);
    }
    
    public void method2717(int i, int i_395_, int i_396_, int i_397_,
			   int i_398_, int i_399_) {
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is == null)
	    throw new IllegalStateException("");
	for (int i_400_ = 0; i_400_ < i_397_; i_400_++) {
	    int i_401_ = (i_395_ + i_400_) * i_396_ + i;
	    int i_402_ = (i_399_ + i_400_) * i_396_ + i_398_;
	    for (int i_403_ = 0; i_403_ < i_396_; i_403_++)
		anIntArray11404[i_401_ + i_403_]
		    = is[i_402_ + i_403_] & 0xffffff;
	}
    }
    
    public void method2655(int i, int i_404_, int i_405_) {
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is == null)
	    throw new IllegalStateException("");
	if (i_405_ == 0) {
	    for (int i_406_ = 0; i_406_ < anInt9002; i_406_++) {
		int i_407_ = i_406_ * anInt8985;
		int i_408_ = (i_404_ + i_406_) * (aClass185_Sub2_9016.anInt9356
						  * 356365251) + i;
		for (int i_409_ = 0; i_409_ < anInt8985; i_409_++)
		    anIntArray11404[i_407_ + i_409_]
			= (anIntArray11404[i_407_ + i_409_] & 0xffffff
			   | is[i_408_ + i_409_] << 8 & ~0xffffff);
	    }
	} else if (i_405_ == 1) {
	    for (int i_410_ = 0; i_410_ < anInt9002; i_410_++) {
		int i_411_ = i_410_ * anInt8985;
		int i_412_ = (i_404_ + i_410_) * (aClass185_Sub2_9016.anInt9356
						  * 356365251) + i;
		for (int i_413_ = 0; i_413_ < anInt8985; i_413_++)
		    anIntArray11404[i_411_ + i_413_]
			= (anIntArray11404[i_411_ + i_413_] & 0xffffff
			   | is[i_412_ + i_413_] << 16 & ~0xffffff);
	    }
	} else if (i_405_ == 2) {
	    for (int i_414_ = 0; i_414_ < anInt9002; i_414_++) {
		int i_415_ = i_414_ * anInt8985;
		int i_416_ = (i_404_ + i_414_) * (aClass185_Sub2_9016.anInt9356
						  * 356365251) + i;
		for (int i_417_ = 0; i_417_ < anInt8985; i_417_++)
		    anIntArray11404[i_415_ + i_417_]
			= (anIntArray11404[i_415_ + i_417_] & 0xffffff
			   | is[i_416_ + i_417_] << 24 & ~0xffffff);
	    }
	} else if (i_405_ == 3) {
	    for (int i_418_ = 0; i_418_ < anInt9002; i_418_++) {
		int i_419_ = i_418_ * anInt8985;
		int i_420_ = (i_404_ + i_418_) * (aClass185_Sub2_9016.anInt9356
						  * 356365251) + i;
		for (int i_421_ = 0; i_421_ < anInt8985; i_421_++)
		    anIntArray11404[i_419_ + i_421_]
			= (anIntArray11404[i_419_ + i_421_] & 0xffffff
			   | (is[i_420_ + i_421_] != 0 ? -16777216 : 0));
	    }
	}
    }
    
    public void method2699(int i, int i_422_, int i_423_) {
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is == null)
	    throw new IllegalStateException("");
	if (i_423_ == 0) {
	    for (int i_424_ = 0; i_424_ < anInt9002; i_424_++) {
		int i_425_ = i_424_ * anInt8985;
		int i_426_ = (i_422_ + i_424_) * (aClass185_Sub2_9016.anInt9356
						  * 356365251) + i;
		for (int i_427_ = 0; i_427_ < anInt8985; i_427_++)
		    anIntArray11404[i_425_ + i_427_]
			= (anIntArray11404[i_425_ + i_427_] & 0xffffff
			   | is[i_426_ + i_427_] << 8 & ~0xffffff);
	    }
	} else if (i_423_ == 1) {
	    for (int i_428_ = 0; i_428_ < anInt9002; i_428_++) {
		int i_429_ = i_428_ * anInt8985;
		int i_430_ = (i_422_ + i_428_) * (aClass185_Sub2_9016.anInt9356
						  * 356365251) + i;
		for (int i_431_ = 0; i_431_ < anInt8985; i_431_++)
		    anIntArray11404[i_429_ + i_431_]
			= (anIntArray11404[i_429_ + i_431_] & 0xffffff
			   | is[i_430_ + i_431_] << 16 & ~0xffffff);
	    }
	} else if (i_423_ == 2) {
	    for (int i_432_ = 0; i_432_ < anInt9002; i_432_++) {
		int i_433_ = i_432_ * anInt8985;
		int i_434_ = (i_422_ + i_432_) * (aClass185_Sub2_9016.anInt9356
						  * 356365251) + i;
		for (int i_435_ = 0; i_435_ < anInt8985; i_435_++)
		    anIntArray11404[i_433_ + i_435_]
			= (anIntArray11404[i_433_ + i_435_] & 0xffffff
			   | is[i_434_ + i_435_] << 24 & ~0xffffff);
	    }
	} else if (i_423_ == 3) {
	    for (int i_436_ = 0; i_436_ < anInt9002; i_436_++) {
		int i_437_ = i_436_ * anInt8985;
		int i_438_ = (i_422_ + i_436_) * (aClass185_Sub2_9016.anInt9356
						  * 356365251) + i;
		for (int i_439_ = 0; i_439_ < anInt8985; i_439_++)
		    anIntArray11404[i_437_ + i_439_]
			= (anIntArray11404[i_437_ + i_439_] & 0xffffff
			   | (is[i_438_ + i_439_] != 0 ? -16777216 : 0));
	    }
	}
    }
    
    public void method2657(int i, int i_440_, int i_441_, int i_442_,
			   int i_443_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    int i_444_ = aClass185_Sub2_9016.anInt9356 * 356365251;
	    i += anInt8987;
	    i_440_ += anInt8989;
	    int i_445_ = i_440_ * i_444_ + i;
	    int i_446_ = 0;
	    int i_447_ = anInt9002;
	    int i_448_ = anInt8985;
	    int i_449_ = i_444_ - i_448_;
	    int i_450_ = 0;
	    if (i_440_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		int i_451_ = aClass185_Sub2_9016.anInt9344 * 9823353 - i_440_;
		i_447_ -= i_451_;
		i_440_ = aClass185_Sub2_9016.anInt9344 * 9823353;
		i_446_ += i_451_ * i_448_;
		i_445_ += i_451_ * i_444_;
	    }
	    if (i_440_ + i_447_ > aClass185_Sub2_9016.anInt9345 * 639238427)
		i_447_ -= (i_440_ + i_447_
			   - aClass185_Sub2_9016.anInt9345 * 639238427);
	    if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		int i_452_ = aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		i_448_ -= i_452_;
		i = aClass185_Sub2_9016.anInt9365 * 1709859847;
		i_446_ += i_452_;
		i_445_ += i_452_;
		i_450_ += i_452_;
		i_449_ += i_452_;
	    }
	    if (i + i_448_ > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		int i_453_
		    = i + i_448_ - aClass185_Sub2_9016.anInt9343 * -1807368365;
		i_448_ -= i_453_;
		i_450_ += i_453_;
		i_449_ += i_453_;
	    }
	    if (i_448_ > 0 && i_447_ > 0) {
		if (i_443_ == 0) {
		    if (i_441_ == 1) {
			for (int i_454_ = -i_447_; i_454_ < 0; i_454_++) {
			    int i_455_ = i_445_ + i_448_ - 3;
			    while (i_445_ < i_455_) {
				is[i_445_++] = anIntArray11404[i_446_++];
				is[i_445_++] = anIntArray11404[i_446_++];
				is[i_445_++] = anIntArray11404[i_446_++];
				is[i_445_++] = anIntArray11404[i_446_++];
			    }
			    i_455_ += 3;
			    while (i_445_ < i_455_)
				is[i_445_++] = anIntArray11404[i_446_++];
			    i_445_ += i_449_;
			    i_446_ += i_450_;
			}
		    } else if (i_441_ == 0) {
			int i_456_ = (i_442_ & 0xff0000) >> 16;
			int i_457_ = (i_442_ & 0xff00) >> 8;
			int i_458_ = i_442_ & 0xff;
			for (int i_459_ = -i_447_; i_459_ < 0; i_459_++) {
			    for (int i_460_ = -i_448_; i_460_ < 0; i_460_++) {
				int i_461_ = anIntArray11404[i_446_++];
				int i_462_
				    = (i_461_ & 0xff0000) * i_456_ & ~0xffffff;
				int i_463_
				    = (i_461_ & 0xff00) * i_457_ & 0xff0000;
				int i_464_ = (i_461_ & 0xff) * i_458_ & 0xff00;
				is[i_445_++]
				    = (i_462_ | i_463_ | i_464_) >>> 8;
			    }
			    i_445_ += i_449_;
			    i_446_ += i_450_;
			}
		    } else if (i_441_ == 3) {
			for (int i_465_ = -i_447_; i_465_ < 0; i_465_++) {
			    for (int i_466_ = -i_448_; i_466_ < 0; i_466_++) {
				int i_467_ = anIntArray11404[i_446_++];
				int i_468_ = i_467_ + i_442_;
				int i_469_ = ((i_467_ & 0xff00ff)
					      + (i_442_ & 0xff00ff));
				int i_470_ = ((i_469_ & 0x1000100)
					      + (i_468_ - i_469_ & 0x10000));
				is[i_445_++]
				    = i_468_ - i_470_ | i_470_ - (i_470_
								  >>> 8);
			    }
			    i_445_ += i_449_;
			    i_446_ += i_450_;
			}
		    } else if (i_441_ == 2) {
			int i_471_ = i_442_ >>> 24;
			int i_472_ = 256 - i_471_;
			int i_473_ = (i_442_ & 0xff00ff) * i_472_ & ~0xff00ff;
			int i_474_ = (i_442_ & 0xff00) * i_472_ & 0xff0000;
			i_442_ = (i_473_ | i_474_) >>> 8;
			for (int i_475_ = -i_447_; i_475_ < 0; i_475_++) {
			    for (int i_476_ = -i_448_; i_476_ < 0; i_476_++) {
				int i_477_ = anIntArray11404[i_446_++];
				i_473_
				    = (i_477_ & 0xff00ff) * i_471_ & ~0xff00ff;
				i_474_ = (i_477_ & 0xff00) * i_471_ & 0xff0000;
				is[i_445_++]
				    = ((i_473_ | i_474_) >>> 8) + i_442_;
			    }
			    i_445_ += i_449_;
			    i_446_ += i_450_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_443_ == 1) {
		    if (i_441_ == 1) {
			for (int i_478_ = -i_447_; i_478_ < 0; i_478_++) {
			    for (int i_479_ = -i_448_; i_479_ < 0; i_479_++) {
				int i_480_ = anIntArray11404[i_446_++];
				int i_481_ = i_480_ >>> 24;
				int i_482_ = 256 - i_481_;
				int i_483_ = is[i_445_];
				is[i_445_++]
				    = (((((i_480_ & 0xff00ff) * i_481_
					  + (i_483_ & 0xff00ff) * i_482_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_480_ & ~0xff00ff) >>> 8)
					    * i_481_)
					   + (((i_483_ & ~0xff00ff) >>> 8)
					      * i_482_))
					  & ~0xff00ff));
			    }
			    i_445_ += i_449_;
			    i_446_ += i_450_;
			}
		    } else if (i_441_ == 0) {
			if ((i_442_ & 0xffffff) == 16777215) {
			    for (int i_484_ = -i_447_; i_484_ < 0; i_484_++) {
				for (int i_485_ = -i_448_; i_485_ < 0;
				     i_485_++) {
				    int i_486_ = anIntArray11404[i_446_++];
				    int i_487_
					= ((i_486_ >>> 24) * (i_442_ >>> 24)
					   >> 8);
				    int i_488_ = 256 - i_487_;
				    int i_489_ = is[i_445_];
				    is[i_445_++]
					= ((((i_486_ & 0xff00ff) * i_487_
					     + (i_489_ & 0xff00ff) * i_488_)
					    & ~0xff00ff)
					   + (((i_486_ & 0xff00) * i_487_
					       + (i_489_ & 0xff00) * i_488_)
					      & 0xff0000)) >> 8;
				}
				i_445_ += i_449_;
				i_446_ += i_450_;
			    }
			} else {
			    int i_490_ = (i_442_ & 0xff0000) >> 16;
			    int i_491_ = (i_442_ & 0xff00) >> 8;
			    int i_492_ = i_442_ & 0xff;
			    for (int i_493_ = -i_447_; i_493_ < 0; i_493_++) {
				for (int i_494_ = -i_448_; i_494_ < 0;
				     i_494_++) {
				    int i_495_ = anIntArray11404[i_446_++];
				    int i_496_
					= ((i_495_ >>> 24) * (i_442_ >>> 24)
					   >> 8);
				    int i_497_ = 256 - i_496_;
				    if (i_496_ != 255) {
					int i_498_
					    = ((i_495_ & 0xff0000) * i_490_
					       & ~0xffffff);
					int i_499_
					    = ((i_495_ & 0xff00) * i_491_
					       & 0xff0000);
					int i_500_ = ((i_495_ & 0xff) * i_492_
						      & 0xff00);
					i_495_
					    = (i_498_ | i_499_ | i_500_) >>> 8;
					int i_501_ = is[i_445_];
					is[i_445_++]
					    = ((((i_495_ & 0xff00ff) * i_496_
						 + ((i_501_ & 0xff00ff)
						    * i_497_))
						& ~0xff00ff)
					       + (((i_495_ & 0xff00) * i_496_
						   + ((i_501_ & 0xff00)
						      * i_497_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_502_
					    = ((i_495_ & 0xff0000) * i_490_
					       & ~0xffffff);
					int i_503_
					    = ((i_495_ & 0xff00) * i_491_
					       & 0xff0000);
					int i_504_ = ((i_495_ & 0xff) * i_492_
						      & 0xff00);
					is[i_445_++]
					    = (i_502_ | i_503_ | i_504_) >>> 8;
				    }
				}
				i_445_ += i_449_;
				i_446_ += i_450_;
			    }
			}
		    } else if (i_441_ == 3) {
			for (int i_505_ = -i_447_; i_505_ < 0; i_505_++) {
			    for (int i_506_ = -i_448_; i_506_ < 0; i_506_++) {
				int i_507_ = anIntArray11404[i_446_++];
				int i_508_ = i_507_ + i_442_;
				int i_509_ = ((i_507_ & 0xff00ff)
					      + (i_442_ & 0xff00ff));
				int i_510_ = ((i_509_ & 0x1000100)
					      + (i_508_ - i_509_ & 0x10000));
				i_510_ = i_508_ - i_510_ | i_510_ - (i_510_
								     >>> 8);
				int i_511_
				    = (i_510_ >>> 24) * (i_442_ >>> 24) >> 8;
				int i_512_ = 256 - i_511_;
				if (i_511_ != 255) {
				    i_507_ = i_510_;
				    i_510_ = is[i_445_];
				    i_510_ = ((((i_507_ & 0xff00ff) * i_511_
						+ (i_510_ & 0xff00ff) * i_512_)
					       & ~0xff00ff)
					      + (((i_507_ & 0xff00) * i_511_
						  + (i_510_ & 0xff00) * i_512_)
						 & 0xff0000)) >> 8;
				}
				is[i_445_++] = i_510_;
			    }
			    i_445_ += i_449_;
			    i_446_ += i_450_;
			}
		    } else if (i_441_ == 2) {
			int i_513_ = i_442_ >>> 24;
			int i_514_ = 256 - i_513_;
			int i_515_ = (i_442_ & 0xff00ff) * i_514_ & ~0xff00ff;
			int i_516_ = (i_442_ & 0xff00) * i_514_ & 0xff0000;
			i_442_ = (i_515_ | i_516_) >>> 8;
			for (int i_517_ = -i_447_; i_517_ < 0; i_517_++) {
			    for (int i_518_ = -i_448_; i_518_ < 0; i_518_++) {
				int i_519_ = anIntArray11404[i_446_++];
				int i_520_ = i_519_ >>> 24;
				int i_521_ = 256 - i_520_;
				i_515_
				    = (i_519_ & 0xff00ff) * i_513_ & ~0xff00ff;
				i_516_ = (i_519_ & 0xff00) * i_513_ & 0xff0000;
				i_519_ = ((i_515_ | i_516_) >>> 8) + i_442_;
				int i_522_ = is[i_445_];
				is[i_445_++]
				    = ((((i_519_ & 0xff00ff) * i_520_
					 + (i_522_ & 0xff00ff) * i_521_)
					& ~0xff00ff)
				       + (((i_519_ & 0xff00) * i_520_
					   + (i_522_ & 0xff00) * i_521_)
					  & 0xff0000)) >> 8;
			    }
			    i_445_ += i_449_;
			    i_446_ += i_450_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_443_ == 2) {
		    if (i_441_ == 1) {
			for (int i_523_ = -i_447_; i_523_ < 0; i_523_++) {
			    for (int i_524_ = -i_448_; i_524_ < 0; i_524_++) {
				int i_525_ = anIntArray11404[i_446_++];
				if (i_525_ != 0) {
				    int i_526_ = is[i_445_];
				    int i_527_ = i_525_ + i_526_;
				    int i_528_ = ((i_525_ & 0xff00ff)
						  + (i_526_ & 0xff00ff));
				    i_526_ = ((i_528_ & 0x1000100)
					      + (i_527_ - i_528_ & 0x10000));
				    is[i_445_++]
					= i_527_ - i_526_ | i_526_ - (i_526_
								      >>> 8);
				} else
				    i_445_++;
			    }
			    i_445_ += i_449_;
			    i_446_ += i_450_;
			}
		    } else if (i_441_ == 0) {
			int i_529_ = (i_442_ & 0xff0000) >> 16;
			int i_530_ = (i_442_ & 0xff00) >> 8;
			int i_531_ = i_442_ & 0xff;
			for (int i_532_ = -i_447_; i_532_ < 0; i_532_++) {
			    for (int i_533_ = -i_448_; i_533_ < 0; i_533_++) {
				int i_534_ = anIntArray11404[i_446_++];
				if (i_534_ != 0) {
				    int i_535_ = ((i_534_ & 0xff0000) * i_529_
						  & ~0xffffff);
				    int i_536_ = ((i_534_ & 0xff00) * i_530_
						  & 0xff0000);
				    int i_537_
					= (i_534_ & 0xff) * i_531_ & 0xff00;
				    i_534_ = (i_535_ | i_536_ | i_537_) >>> 8;
				    int i_538_ = is[i_445_];
				    int i_539_ = i_534_ + i_538_;
				    int i_540_ = ((i_534_ & 0xff00ff)
						  + (i_538_ & 0xff00ff));
				    i_538_ = ((i_540_ & 0x1000100)
					      + (i_539_ - i_540_ & 0x10000));
				    is[i_445_++]
					= i_539_ - i_538_ | i_538_ - (i_538_
								      >>> 8);
				} else
				    i_445_++;
			    }
			    i_445_ += i_449_;
			    i_446_ += i_450_;
			}
		    } else if (i_441_ == 3) {
			for (int i_541_ = -i_447_; i_541_ < 0; i_541_++) {
			    for (int i_542_ = -i_448_; i_542_ < 0; i_542_++) {
				int i_543_ = anIntArray11404[i_446_++];
				int i_544_ = i_543_ + i_442_;
				int i_545_ = ((i_543_ & 0xff00ff)
					      + (i_442_ & 0xff00ff));
				int i_546_ = ((i_545_ & 0x1000100)
					      + (i_544_ - i_545_ & 0x10000));
				i_543_ = i_544_ - i_546_ | i_546_ - (i_546_
								     >>> 8);
				i_546_ = is[i_445_];
				i_544_ = i_543_ + i_546_;
				i_545_ = (i_543_ & 0xff00ff) + (i_546_
								& 0xff00ff);
				i_546_
				    = (i_545_ & 0x1000100) + (i_544_ - i_545_
							      & 0x10000);
				is[i_445_++]
				    = i_544_ - i_546_ | i_546_ - (i_546_
								  >>> 8);
			    }
			    i_445_ += i_449_;
			    i_446_ += i_450_;
			}
		    } else if (i_441_ == 2) {
			int i_547_ = i_442_ >>> 24;
			int i_548_ = 256 - i_547_;
			int i_549_ = (i_442_ & 0xff00ff) * i_548_ & ~0xff00ff;
			int i_550_ = (i_442_ & 0xff00) * i_548_ & 0xff0000;
			i_442_ = (i_549_ | i_550_) >>> 8;
			for (int i_551_ = -i_447_; i_551_ < 0; i_551_++) {
			    for (int i_552_ = -i_448_; i_552_ < 0; i_552_++) {
				int i_553_ = anIntArray11404[i_446_++];
				if (i_553_ != 0) {
				    i_549_ = ((i_553_ & 0xff00ff) * i_547_
					      & ~0xff00ff);
				    i_550_ = ((i_553_ & 0xff00) * i_547_
					      & 0xff0000);
				    i_553_
					= ((i_549_ | i_550_) >>> 8) + i_442_;
				    int i_554_ = is[i_445_];
				    int i_555_ = i_553_ + i_554_;
				    int i_556_ = ((i_553_ & 0xff00ff)
						  + (i_554_ & 0xff00ff));
				    i_554_ = ((i_556_ & 0x1000100)
					      + (i_555_ - i_556_ & 0x10000));
				    is[i_445_++]
					= i_555_ - i_554_ | i_554_ - (i_554_
								      >>> 8);
				} else
				    i_445_++;
			    }
			    i_445_ += i_449_;
			    i_446_ += i_450_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2693(int i, int i_557_, int i_558_, int i_559_, int[] is,
			   int[] is_560_, int i_561_, int i_562_) {
	method17940(i, i_557_, i_558_, i_559_, is, i_561_, i_562_);
    }
    
    void method17937(int i, int i_563_, int i_564_, int i_565_, int[] is,
		     int i_566_, int i_567_) {
	i_567_ -= i_564_;
	for (int i_568_ = 0; i_568_ < i_565_; i_568_++) {
	    int i_569_ = (i_563_ + i_568_) * i_564_ + i;
	    for (int i_570_ = 0; i_570_ < i_564_; i_570_++)
		is[i_566_++] = anIntArray11404[i_569_ + i_570_];
	    i_566_ += i_567_;
	}
    }
    
    public Interface22 method2651() {
	return new Class115(anInt8985, anInt9002, anIntArray11404);
    }
    
    void method14512(int i, int i_571_) {
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    if (anInt9001 == 0) {
		if (anInt9000 == 0) {
		    int i_572_ = anInt8998;
		    while (i_572_ < 0) {
			int i_573_ = anInt8988;
			int i_574_ = anInt9007;
			int i_575_ = anInt9003;
			int i_576_ = anInt8999;
			if (i_574_ >= 0 && i_575_ >= 0
			    && i_574_ - (anInt8985 << 12) < 0
			    && i_575_ - (anInt9002 << 12) < 0) {
			    for (/**/; i_576_ < 0; i_576_++)
				method17938(((i_575_ >> 12) * anInt8985
					     + (i_574_ >> 12)),
					    i_573_++, is, i, i_571_);
			}
			i_572_++;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_577_ = anInt8998;
		    while (i_577_ < 0) {
			int i_578_ = anInt8988;
			int i_579_ = anInt9007;
			int i_580_ = anInt9003 + anInt9010;
			int i_581_ = anInt8999;
			if (i_579_ >= 0 && i_579_ - (anInt8985 << 12) < 0) {
			    int i_582_;
			    if ((i_582_ = i_580_ - (anInt9002 << 12)) >= 0) {
				i_582_ = (anInt9000 - i_582_) / anInt9000;
				i_581_ += i_582_;
				i_580_ += anInt9000 * i_582_;
				i_578_ += i_582_;
			    }
			    if ((i_582_ = (i_580_ - anInt9000) / anInt9000)
				> i_581_)
				i_581_ = i_582_;
			    for (/**/; i_581_ < 0; i_581_++) {
				method17938(((i_580_ >> 12) * anInt8985
					     + (i_579_ >> 12)),
					    i_578_++, is, i, i_571_);
				i_580_ += anInt9000;
			    }
			}
			i_577_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_583_ = anInt8998;
		    while (i_583_ < 0) {
			int i_584_ = anInt8988;
			int i_585_ = anInt9007;
			int i_586_ = anInt9003 + anInt9010;
			int i_587_ = anInt8999;
			if (i_585_ >= 0 && i_585_ - (anInt8985 << 12) < 0) {
			    if (i_586_ < 0) {
				int i_588_
				    = (anInt9000 - 1 - i_586_) / anInt9000;
				i_587_ += i_588_;
				i_586_ += anInt9000 * i_588_;
				i_584_ += i_588_;
			    }
			    int i_589_;
			    if ((i_589_ = (1 + i_586_ - (anInt9002 << 12)
					   - anInt9000) / anInt9000)
				> i_587_)
				i_587_ = i_589_;
			    for (/**/; i_587_ < 0; i_587_++) {
				method17938(((i_586_ >> 12) * anInt8985
					     + (i_585_ >> 12)),
					    i_584_++, is, i, i_571_);
				i_586_ += anInt9000;
			    }
			}
			i_583_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9001 < 0) {
		if (anInt9000 == 0) {
		    int i_590_ = anInt8998;
		    while (i_590_ < 0) {
			int i_591_ = anInt8988;
			int i_592_ = anInt9007 + anInt9009;
			int i_593_ = anInt9003;
			int i_594_ = anInt8999;
			if (i_593_ >= 0 && i_593_ - (anInt9002 << 12) < 0) {
			    int i_595_;
			    if ((i_595_ = i_592_ - (anInt8985 << 12)) >= 0) {
				i_595_ = (anInt9001 - i_595_) / anInt9001;
				i_594_ += i_595_;
				i_592_ += anInt9001 * i_595_;
				i_591_ += i_595_;
			    }
			    if ((i_595_ = (i_592_ - anInt9001) / anInt9001)
				> i_594_)
				i_594_ = i_595_;
			    for (/**/; i_594_ < 0; i_594_++) {
				method17938(((i_593_ >> 12) * anInt8985
					     + (i_592_ >> 12)),
					    i_591_++, is, i, i_571_);
				i_592_ += anInt9001;
			    }
			}
			i_590_++;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_596_ = anInt8998;
		    while (i_596_ < 0) {
			int i_597_ = anInt8988;
			int i_598_ = anInt9007 + anInt9009;
			int i_599_ = anInt9003 + anInt9010;
			int i_600_ = anInt8999;
			int i_601_;
			if ((i_601_ = i_598_ - (anInt8985 << 12)) >= 0) {
			    i_601_ = (anInt9001 - i_601_) / anInt9001;
			    i_600_ += i_601_;
			    i_598_ += anInt9001 * i_601_;
			    i_599_ += anInt9000 * i_601_;
			    i_597_ += i_601_;
			}
			if ((i_601_ = (i_598_ - anInt9001) / anInt9001)
			    > i_600_)
			    i_600_ = i_601_;
			if ((i_601_ = i_599_ - (anInt9002 << 12)) >= 0) {
			    i_601_ = (anInt9000 - i_601_) / anInt9000;
			    i_600_ += i_601_;
			    i_598_ += anInt9001 * i_601_;
			    i_599_ += anInt9000 * i_601_;
			    i_597_ += i_601_;
			}
			if ((i_601_ = (i_599_ - anInt9000) / anInt9000)
			    > i_600_)
			    i_600_ = i_601_;
			for (/**/; i_600_ < 0; i_600_++) {
			    method17938((i_599_ >> 12) * anInt8985 + (i_598_
								      >> 12),
					i_597_++, is, i, i_571_);
			    i_598_ += anInt9001;
			    i_599_ += anInt9000;
			}
			i_596_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_602_ = anInt8998;
		    while (i_602_ < 0) {
			int i_603_ = anInt8988;
			int i_604_ = anInt9007 + anInt9009;
			int i_605_ = anInt9003 + anInt9010;
			int i_606_ = anInt8999;
			int i_607_;
			if ((i_607_ = i_604_ - (anInt8985 << 12)) >= 0) {
			    i_607_ = (anInt9001 - i_607_) / anInt9001;
			    i_606_ += i_607_;
			    i_604_ += anInt9001 * i_607_;
			    i_605_ += anInt9000 * i_607_;
			    i_603_ += i_607_;
			}
			if ((i_607_ = (i_604_ - anInt9001) / anInt9001)
			    > i_606_)
			    i_606_ = i_607_;
			if (i_605_ < 0) {
			    i_607_ = (anInt9000 - 1 - i_605_) / anInt9000;
			    i_606_ += i_607_;
			    i_604_ += anInt9001 * i_607_;
			    i_605_ += anInt9000 * i_607_;
			    i_603_ += i_607_;
			}
			if ((i_607_ = (1 + i_605_ - (anInt9002 << 12)
				       - anInt9000) / anInt9000)
			    > i_606_)
			    i_606_ = i_607_;
			for (/**/; i_606_ < 0; i_606_++) {
			    method17938((i_605_ >> 12) * anInt8985 + (i_604_
								      >> 12),
					i_603_++, is, i, i_571_);
			    i_604_ += anInt9001;
			    i_605_ += anInt9000;
			}
			i_602_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9000 == 0) {
		int i_608_ = anInt8998;
		while (i_608_ < 0) {
		    int i_609_ = anInt8988;
		    int i_610_ = anInt9007 + anInt9009;
		    int i_611_ = anInt9003;
		    int i_612_ = anInt8999;
		    if (i_611_ >= 0 && i_611_ - (anInt9002 << 12) < 0) {
			if (i_610_ < 0) {
			    int i_613_ = (anInt9001 - 1 - i_610_) / anInt9001;
			    i_612_ += i_613_;
			    i_610_ += anInt9001 * i_613_;
			    i_609_ += i_613_;
			}
			int i_614_;
			if ((i_614_ = (1 + i_610_ - (anInt8985 << 12)
				       - anInt9001) / anInt9001)
			    > i_612_)
			    i_612_ = i_614_;
			for (/**/; i_612_ < 0; i_612_++) {
			    method17938((i_611_ >> 12) * anInt8985 + (i_610_
								      >> 12),
					i_609_++, is, i, i_571_);
			    i_610_ += anInt9001;
			}
		    }
		    i_608_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else if (anInt9000 < 0) {
		for (int i_615_ = anInt8998; i_615_ < 0; i_615_++) {
		    int i_616_ = anInt8988;
		    int i_617_ = anInt9007 + anInt9009;
		    int i_618_ = anInt9003 + anInt9010;
		    int i_619_ = anInt8999;
		    if (i_617_ < 0) {
			int i_620_ = (anInt9001 - 1 - i_617_) / anInt9001;
			i_619_ += i_620_;
			i_617_ += anInt9001 * i_620_;
			i_618_ += anInt9000 * i_620_;
			i_616_ += i_620_;
		    }
		    int i_621_;
		    if ((i_621_ = ((1 + i_617_ - (anInt8985 << 12) - anInt9001)
				   / anInt9001))
			> i_619_)
			i_619_ = i_621_;
		    if ((i_621_ = i_618_ - (anInt9002 << 12)) >= 0) {
			i_621_ = (anInt9000 - i_621_) / anInt9000;
			i_619_ += i_621_;
			i_617_ += anInt9001 * i_621_;
			i_618_ += anInt9000 * i_621_;
			i_616_ += i_621_;
		    }
		    if ((i_621_ = (i_618_ - anInt9000) / anInt9000) > i_619_)
			i_619_ = i_621_;
		    for (/**/; i_619_ < 0; i_619_++) {
			method17938((i_618_ >> 12) * anInt8985 + (i_617_
								  >> 12),
				    i_616_++, is, i, i_571_);
			i_617_ += anInt9001;
			i_618_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else {
		for (int i_622_ = anInt8998; i_622_ < 0; i_622_++) {
		    int i_623_ = anInt8988;
		    int i_624_ = anInt9007 + anInt9009;
		    int i_625_ = anInt9003 + anInt9010;
		    int i_626_ = anInt8999;
		    if (i_624_ < 0) {
			int i_627_ = (anInt9001 - 1 - i_624_) / anInt9001;
			i_626_ += i_627_;
			i_624_ += anInt9001 * i_627_;
			i_625_ += anInt9000 * i_627_;
			i_623_ += i_627_;
		    }
		    int i_628_;
		    if ((i_628_ = ((1 + i_624_ - (anInt8985 << 12) - anInt9001)
				   / anInt9001))
			> i_626_)
			i_626_ = i_628_;
		    if (i_625_ < 0) {
			i_628_ = (anInt9000 - 1 - i_625_) / anInt9000;
			i_626_ += i_628_;
			i_624_ += anInt9001 * i_628_;
			i_625_ += anInt9000 * i_628_;
			i_623_ += i_628_;
		    }
		    if ((i_628_ = ((1 + i_625_ - (anInt9002 << 12) - anInt9000)
				   / anInt9000))
			> i_626_)
			i_626_ = i_628_;
		    for (/**/; i_626_ < 0; i_626_++) {
			method17938((i_625_ >> 12) * anInt8985 + (i_624_
								  >> 12),
				    i_623_++, is, i, i_571_);
			i_624_ += anInt9001;
			i_625_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    }
	}
    }
    
    public void method2678(int i, int i_629_, int i_630_, int i_631_,
			   int i_632_, int i_633_) {
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is == null)
	    throw new IllegalStateException("");
	for (int i_634_ = 0; i_634_ < i_631_; i_634_++) {
	    int i_635_ = (i_629_ + i_634_) * i_630_ + i;
	    int i_636_ = (i_633_ + i_634_) * i_630_ + i_632_;
	    for (int i_637_ = 0; i_637_ < i_630_; i_637_++)
		anIntArray11404[i_635_ + i_637_]
		    = is[i_636_ + i_637_] & 0xffffff;
	}
    }
    
    void method17938(int i, int i_638_, int[] is, int i_639_, int i_640_) {
	if (i_640_ == 0) {
	    if (i_639_ == 1)
		is[i_638_] = anIntArray11404[i];
	    else if (i_639_ == 0) {
		int i_641_ = anIntArray11404[i++];
		int i_642_ = (i_641_ & 0xff0000) * anInt9014 & ~0xffffff;
		int i_643_ = (i_641_ & 0xff00) * anInt9015 & 0xff0000;
		int i_644_ = (i_641_ & 0xff) * anInt9018 & 0xff00;
		is[i_638_] = (i_642_ | i_643_ | i_644_) >>> 8;
	    } else if (i_639_ == 3) {
		int i_645_ = anIntArray11404[i++];
		int i_646_ = anInt9011;
		int i_647_ = i_645_ + i_646_;
		int i_648_ = (i_645_ & 0xff00ff) + (i_646_ & 0xff00ff);
		int i_649_
		    = (i_648_ & 0x1000100) + (i_647_ - i_648_ & 0x10000);
		is[i_638_] = i_647_ - i_649_ | i_649_ - (i_649_ >>> 8);
	    } else if (i_639_ == 2) {
		int i_650_ = anIntArray11404[i];
		int i_651_ = (i_650_ & 0xff00ff) * anInt9012 & ~0xff00ff;
		int i_652_ = (i_650_ & 0xff00) * anInt9012 & 0xff0000;
		is[i_638_] = ((i_651_ | i_652_) >>> 8) + anInt9019;
	    } else
		throw new IllegalArgumentException();
	} else if (i_640_ == 1) {
	    if (i_639_ == 1) {
		int i_653_ = anIntArray11404[i];
		int i_654_ = i_653_ >>> 24;
		int i_655_ = 256 - i_654_;
		int i_656_ = is[i_638_];
		is[i_638_] = ((((i_653_ & 0xff00ff) * i_654_
				+ (i_656_ & 0xff00ff) * i_655_)
			       & ~0xff00ff)
			      + (((i_653_ & 0xff00) * i_654_
				  + (i_656_ & 0xff00) * i_655_)
				 & 0xff0000)) >> 8;
	    } else if (i_639_ == 0) {
		int i_657_ = anIntArray11404[i];
		int i_658_ = (i_657_ >>> 24) * anInt9012 >> 8;
		int i_659_ = 256 - i_658_;
		if ((anInt9011 & 0xffffff) == 16777215) {
		    int i_660_ = is[i_638_];
		    is[i_638_] = ((((i_657_ & 0xff00ff) * i_658_
				    + (i_660_ & 0xff00ff) * i_659_)
				   & ~0xff00ff)
				  + (((i_657_ & 0xff00) * i_658_
				      + (i_660_ & 0xff00) * i_659_)
				     & 0xff0000)) >> 8;
		} else if (i_658_ != 255) {
		    int i_661_ = (i_657_ & 0xff0000) * anInt9014 & ~0xffffff;
		    int i_662_ = (i_657_ & 0xff00) * anInt9015 & 0xff0000;
		    int i_663_ = (i_657_ & 0xff) * anInt9018 & 0xff00;
		    i_657_ = (i_661_ | i_662_ | i_663_) >>> 8;
		    int i_664_ = is[i_638_];
		    is[i_638_] = ((((i_657_ & 0xff00ff) * i_658_
				    + (i_664_ & 0xff00ff) * i_659_)
				   & ~0xff00ff)
				  + (((i_657_ & 0xff00) * i_658_
				      + (i_664_ & 0xff00) * i_659_)
				     & 0xff0000)) >> 8;
		} else {
		    int i_665_ = (i_657_ & 0xff0000) * anInt9014 & ~0xffffff;
		    int i_666_ = (i_657_ & 0xff00) * anInt9015 & 0xff0000;
		    int i_667_ = (i_657_ & 0xff) * anInt9018 & 0xff00;
		    is[i_638_] = (i_665_ | i_666_ | i_667_) >>> 8;
		}
	    } else if (i_639_ == 3) {
		int i_668_ = anIntArray11404[i];
		int i_669_ = anInt9011;
		int i_670_ = i_668_ + i_669_;
		int i_671_ = (i_668_ & 0xff00ff) + (i_669_ & 0xff00ff);
		int i_672_
		    = (i_671_ & 0x1000100) + (i_670_ - i_671_ & 0x10000);
		i_672_ = i_670_ - i_672_ | i_672_ - (i_672_ >>> 8);
		int i_673_ = (i_668_ >>> 24) * anInt9012 >> 8;
		int i_674_ = 256 - i_673_;
		if (i_673_ != 255) {
		    i_668_ = i_672_;
		    i_672_ = is[i_638_];
		    i_672_ = ((((i_668_ & 0xff00ff) * i_673_
				+ (i_672_ & 0xff00ff) * i_674_)
			       & ~0xff00ff)
			      + (((i_668_ & 0xff00) * i_673_
				  + (i_672_ & 0xff00) * i_674_)
				 & 0xff0000)) >> 8;
		}
		is[i_638_] = i_672_;
	    } else if (i_639_ == 2) {
		int i_675_ = anIntArray11404[i];
		int i_676_ = i_675_ >>> 24;
		int i_677_ = 256 - i_676_;
		int i_678_ = (i_675_ & 0xff00ff) * anInt9012 & ~0xff00ff;
		int i_679_ = (i_675_ & 0xff00) * anInt9012 & 0xff0000;
		i_675_ = ((i_678_ | i_679_) >>> 8) + anInt9019;
		int i_680_ = is[i_638_];
		is[i_638_] = ((((i_675_ & 0xff00ff) * i_676_
				+ (i_680_ & 0xff00ff) * i_677_)
			       & ~0xff00ff)
			      + (((i_675_ & 0xff00) * i_676_
				  + (i_680_ & 0xff00) * i_677_)
				 & 0xff0000)) >> 8;
	    } else
		throw new IllegalArgumentException();
	} else if (i_640_ == 2) {
	    if (i_639_ == 1) {
		int i_681_ = anIntArray11404[i];
		int i_682_ = is[i_638_];
		int i_683_ = i_681_ + i_682_;
		int i_684_ = (i_681_ & 0xff00ff) + (i_682_ & 0xff00ff);
		i_682_ = (i_684_ & 0x1000100) + (i_683_ - i_684_ & 0x10000);
		is[i_638_] = i_683_ - i_682_ | i_682_ - (i_682_ >>> 8);
	    } else if (i_639_ == 0) {
		int i_685_ = anIntArray11404[i];
		int i_686_ = (i_685_ & 0xff0000) * anInt9014 & ~0xffffff;
		int i_687_ = (i_685_ & 0xff00) * anInt9015 & 0xff0000;
		int i_688_ = (i_685_ & 0xff) * anInt9018 & 0xff00;
		i_685_ = (i_686_ | i_687_ | i_688_) >>> 8;
		int i_689_ = is[i_638_];
		int i_690_ = i_685_ + i_689_;
		int i_691_ = (i_685_ & 0xff00ff) + (i_689_ & 0xff00ff);
		i_689_ = (i_691_ & 0x1000100) + (i_690_ - i_691_ & 0x10000);
		is[i_638_] = i_690_ - i_689_ | i_689_ - (i_689_ >>> 8);
	    } else if (i_639_ == 3) {
		int i_692_ = anIntArray11404[i];
		int i_693_ = anInt9011;
		int i_694_ = i_692_ + i_693_;
		int i_695_ = (i_692_ & 0xff00ff) + (i_693_ & 0xff00ff);
		int i_696_
		    = (i_695_ & 0x1000100) + (i_694_ - i_695_ & 0x10000);
		i_692_ = i_694_ - i_696_ | i_696_ - (i_696_ >>> 8);
		i_696_ = is[i_638_];
		i_694_ = i_692_ + i_696_;
		i_695_ = (i_692_ & 0xff00ff) + (i_696_ & 0xff00ff);
		i_696_ = (i_695_ & 0x1000100) + (i_694_ - i_695_ & 0x10000);
		is[i_638_] = i_694_ - i_696_ | i_696_ - (i_696_ >>> 8);
	    } else if (i_639_ == 2) {
		int i_697_ = anIntArray11404[i];
		int i_698_ = (i_697_ & 0xff00ff) * anInt9012 & ~0xff00ff;
		int i_699_ = (i_697_ & 0xff00) * anInt9012 & 0xff0000;
		i_697_ = ((i_698_ | i_699_) >>> 8) + anInt9019;
		int i_700_ = is[i_638_];
		int i_701_ = i_697_ + i_700_;
		int i_702_ = (i_697_ & 0xff00ff) + (i_700_ & 0xff00ff);
		i_700_ = (i_702_ & 0x1000100) + (i_701_ - i_702_ & 0x10000);
		is[i_638_] = i_701_ - i_700_ | i_700_ - (i_700_ >>> 8);
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    void method2661(int i, int i_703_, int i_704_, int i_705_, int i_706_,
		    int i_707_, int i_708_, int i_709_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (i_704_ > 0 && i_705_ > 0) {
	    int[] is = aClass185_Sub2_9016.anIntArray9338;
	    if (is != null) {
		int i_710_ = 0;
		int i_711_ = 0;
		int i_712_ = aClass185_Sub2_9016.anInt9356 * 356365251;
		int i_713_ = anInt8987 + anInt8985 + anInt8992;
		int i_714_ = anInt8989 + anInt9002 + anInt8990;
		int i_715_ = (i_713_ << 16) / i_704_;
		int i_716_ = (i_714_ << 16) / i_705_;
		if (anInt8987 > 0) {
		    int i_717_ = ((anInt8987 << 16) + i_715_ - 1) / i_715_;
		    i += i_717_;
		    i_710_ += i_717_ * i_715_ - (anInt8987 << 16);
		}
		if (anInt8989 > 0) {
		    int i_718_ = ((anInt8989 << 16) + i_716_ - 1) / i_716_;
		    i_703_ += i_718_;
		    i_711_ += i_718_ * i_716_ - (anInt8989 << 16);
		}
		if (anInt8985 < i_713_)
		    i_704_
			= ((anInt8985 << 16) - i_710_ + i_715_ - 1) / i_715_;
		if (anInt9002 < i_714_)
		    i_705_
			= ((anInt9002 << 16) - i_711_ + i_716_ - 1) / i_716_;
		int i_719_ = i + i_703_ * i_712_;
		int i_720_ = i_712_ - i_704_;
		if (i_703_ + i_705_
		    > aClass185_Sub2_9016.anInt9345 * 639238427)
		    i_705_ -= (i_703_ + i_705_
			       - aClass185_Sub2_9016.anInt9345 * 639238427);
		if (i_703_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		    int i_721_
			= aClass185_Sub2_9016.anInt9344 * 9823353 - i_703_;
		    i_705_ -= i_721_;
		    i_719_ += i_721_ * i_712_;
		    i_711_ += i_716_ * i_721_;
		}
		if (i + i_704_ > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		    int i_722_
			= (i + i_704_
			   - aClass185_Sub2_9016.anInt9343 * -1807368365);
		    i_704_ -= i_722_;
		    i_720_ += i_722_;
		}
		if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		    int i_723_
			= aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		    i_704_ -= i_723_;
		    i_719_ += i_723_;
		    i_710_ += i_715_ * i_723_;
		    i_720_ += i_723_;
		}
		if (i_708_ == 0) {
		    if (i_706_ == 1) {
			int i_724_ = i_710_;
			for (int i_725_ = -i_705_; i_725_ < 0; i_725_++) {
			    int i_726_ = (i_711_ >> 16) * anInt8985;
			    for (int i_727_ = -i_704_; i_727_ < 0; i_727_++) {
				is[i_719_++]
				    = anIntArray11404[(i_710_ >> 16) + i_726_];
				i_710_ += i_715_;
			    }
			    i_711_ += i_716_;
			    i_710_ = i_724_;
			    i_719_ += i_720_;
			}
		    } else if (i_706_ == 0) {
			int i_728_ = (i_707_ & 0xff0000) >> 16;
			int i_729_ = (i_707_ & 0xff00) >> 8;
			int i_730_ = i_707_ & 0xff;
			int i_731_ = i_710_;
			for (int i_732_ = -i_705_; i_732_ < 0; i_732_++) {
			    int i_733_ = (i_711_ >> 16) * anInt8985;
			    for (int i_734_ = -i_704_; i_734_ < 0; i_734_++) {
				int i_735_
				    = anIntArray11404[(i_710_ >> 16) + i_733_];
				int i_736_
				    = (i_735_ & 0xff0000) * i_728_ & ~0xffffff;
				int i_737_
				    = (i_735_ & 0xff00) * i_729_ & 0xff0000;
				int i_738_ = (i_735_ & 0xff) * i_730_ & 0xff00;
				is[i_719_++]
				    = (i_736_ | i_737_ | i_738_) >>> 8;
				i_710_ += i_715_;
			    }
			    i_711_ += i_716_;
			    i_710_ = i_731_;
			    i_719_ += i_720_;
			}
		    } else if (i_706_ == 3) {
			int i_739_ = i_710_;
			for (int i_740_ = -i_705_; i_740_ < 0; i_740_++) {
			    int i_741_ = (i_711_ >> 16) * anInt8985;
			    for (int i_742_ = -i_704_; i_742_ < 0; i_742_++) {
				int i_743_
				    = anIntArray11404[(i_710_ >> 16) + i_741_];
				int i_744_ = i_743_ + i_707_;
				int i_745_ = ((i_743_ & 0xff00ff)
					      + (i_707_ & 0xff00ff));
				int i_746_ = ((i_745_ & 0x1000100)
					      + (i_744_ - i_745_ & 0x10000));
				is[i_719_++]
				    = i_744_ - i_746_ | i_746_ - (i_746_
								  >>> 8);
				i_710_ += i_715_;
			    }
			    i_711_ += i_716_;
			    i_710_ = i_739_;
			    i_719_ += i_720_;
			}
		    } else if (i_706_ == 2) {
			int i_747_ = i_707_ >>> 24;
			int i_748_ = 256 - i_747_;
			int i_749_ = (i_707_ & 0xff00ff) * i_748_ & ~0xff00ff;
			int i_750_ = (i_707_ & 0xff00) * i_748_ & 0xff0000;
			i_707_ = (i_749_ | i_750_) >>> 8;
			int i_751_ = i_710_;
			for (int i_752_ = -i_705_; i_752_ < 0; i_752_++) {
			    int i_753_ = (i_711_ >> 16) * anInt8985;
			    for (int i_754_ = -i_704_; i_754_ < 0; i_754_++) {
				int i_755_
				    = anIntArray11404[(i_710_ >> 16) + i_753_];
				i_749_
				    = (i_755_ & 0xff00ff) * i_747_ & ~0xff00ff;
				i_750_ = (i_755_ & 0xff00) * i_747_ & 0xff0000;
				is[i_719_++]
				    = ((i_749_ | i_750_) >>> 8) + i_707_;
				i_710_ += i_715_;
			    }
			    i_711_ += i_716_;
			    i_710_ = i_751_;
			    i_719_ += i_720_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_708_ == 1) {
		    if (i_706_ == 1) {
			int i_756_ = i_710_;
			for (int i_757_ = -i_705_; i_757_ < 0; i_757_++) {
			    int i_758_ = (i_711_ >> 16) * anInt8985;
			    for (int i_759_ = -i_704_; i_759_ < 0; i_759_++) {
				int i_760_
				    = anIntArray11404[(i_710_ >> 16) + i_758_];
				int i_761_ = i_760_ >>> 24;
				int i_762_ = 256 - i_761_;
				int i_763_ = is[i_719_];
				is[i_719_++]
				    = (((((i_760_ & 0xff00ff) * i_761_
					  + (i_763_ & 0xff00ff) * i_762_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_760_ & ~0xff00ff) >>> 8)
					    * i_761_)
					   + (((i_763_ & ~0xff00ff) >>> 8)
					      * i_762_))
					  & ~0xff00ff));
				i_710_ += i_715_;
			    }
			    i_711_ += i_716_;
			    i_710_ = i_756_;
			    i_719_ += i_720_;
			}
		    } else if (i_706_ == 0) {
			int i_764_ = i_710_;
			if ((i_707_ & 0xffffff) == 16777215) {
			    for (int i_765_ = -i_705_; i_765_ < 0; i_765_++) {
				int i_766_ = (i_711_ >> 16) * anInt8985;
				for (int i_767_ = -i_704_; i_767_ < 0;
				     i_767_++) {
				    int i_768_ = (anIntArray11404
						  [(i_710_ >> 16) + i_766_]);
				    int i_769_
					= ((i_768_ >>> 24) * (i_707_ >>> 24)
					   >> 8);
				    int i_770_ = 256 - i_769_;
				    int i_771_ = is[i_719_];
				    is[i_719_++]
					= ((((i_768_ & 0xff00ff) * i_769_
					     + (i_771_ & 0xff00ff) * i_770_)
					    & ~0xff00ff)
					   + (((i_768_ & 0xff00) * i_769_
					       + (i_771_ & 0xff00) * i_770_)
					      & 0xff0000)) >> 8;
				    i_710_ += i_715_;
				}
				i_711_ += i_716_;
				i_710_ = i_764_;
				i_719_ += i_720_;
			    }
			} else {
			    int i_772_ = (i_707_ & 0xff0000) >> 16;
			    int i_773_ = (i_707_ & 0xff00) >> 8;
			    int i_774_ = i_707_ & 0xff;
			    for (int i_775_ = -i_705_; i_775_ < 0; i_775_++) {
				int i_776_ = (i_711_ >> 16) * anInt8985;
				for (int i_777_ = -i_704_; i_777_ < 0;
				     i_777_++) {
				    int i_778_ = (anIntArray11404
						  [(i_710_ >> 16) + i_776_]);
				    int i_779_
					= ((i_778_ >>> 24) * (i_707_ >>> 24)
					   >> 8);
				    int i_780_ = 256 - i_779_;
				    if (i_779_ != 255) {
					int i_781_
					    = ((i_778_ & 0xff0000) * i_772_
					       & ~0xffffff);
					int i_782_
					    = ((i_778_ & 0xff00) * i_773_
					       & 0xff0000);
					int i_783_ = ((i_778_ & 0xff) * i_774_
						      & 0xff00);
					i_778_
					    = (i_781_ | i_782_ | i_783_) >>> 8;
					int i_784_ = is[i_719_];
					is[i_719_++]
					    = ((((i_778_ & 0xff00ff) * i_779_
						 + ((i_784_ & 0xff00ff)
						    * i_780_))
						& ~0xff00ff)
					       + (((i_778_ & 0xff00) * i_779_
						   + ((i_784_ & 0xff00)
						      * i_780_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_785_
					    = ((i_778_ & 0xff0000) * i_772_
					       & ~0xffffff);
					int i_786_
					    = ((i_778_ & 0xff00) * i_773_
					       & 0xff0000);
					int i_787_ = ((i_778_ & 0xff) * i_774_
						      & 0xff00);
					is[i_719_++]
					    = (i_785_ | i_786_ | i_787_) >>> 8;
				    }
				    i_710_ += i_715_;
				}
				i_711_ += i_716_;
				i_710_ = i_764_;
				i_719_ += i_720_;
			    }
			}
		    } else if (i_706_ == 3) {
			int i_788_ = i_710_;
			for (int i_789_ = -i_705_; i_789_ < 0; i_789_++) {
			    int i_790_ = (i_711_ >> 16) * anInt8985;
			    for (int i_791_ = -i_704_; i_791_ < 0; i_791_++) {
				int i_792_
				    = anIntArray11404[(i_710_ >> 16) + i_790_];
				int i_793_ = i_792_ + i_707_;
				int i_794_ = ((i_792_ & 0xff00ff)
					      + (i_707_ & 0xff00ff));
				int i_795_ = ((i_794_ & 0x1000100)
					      + (i_793_ - i_794_ & 0x10000));
				i_795_ = i_793_ - i_795_ | i_795_ - (i_795_
								     >>> 8);
				int i_796_
				    = (i_795_ >>> 24) * (i_707_ >>> 24) >> 8;
				int i_797_ = 256 - i_796_;
				if (i_796_ != 255) {
				    i_792_ = i_795_;
				    i_795_ = is[i_719_];
				    i_795_ = ((((i_792_ & 0xff00ff) * i_796_
						+ (i_795_ & 0xff00ff) * i_797_)
					       & ~0xff00ff)
					      + (((i_792_ & 0xff00) * i_796_
						  + (i_795_ & 0xff00) * i_797_)
						 & 0xff0000)) >> 8;
				}
				is[i_719_++] = i_795_;
				i_710_ += i_715_;
			    }
			    i_711_ += i_716_;
			    i_710_ = i_788_;
			    i_719_ += i_720_;
			}
		    } else if (i_706_ == 2) {
			int i_798_ = i_707_ >>> 24;
			int i_799_ = 256 - i_798_;
			int i_800_ = (i_707_ & 0xff00ff) * i_799_ & ~0xff00ff;
			int i_801_ = (i_707_ & 0xff00) * i_799_ & 0xff0000;
			i_707_ = (i_800_ | i_801_) >>> 8;
			int i_802_ = i_710_;
			for (int i_803_ = -i_705_; i_803_ < 0; i_803_++) {
			    int i_804_ = (i_711_ >> 16) * anInt8985;
			    for (int i_805_ = -i_704_; i_805_ < 0; i_805_++) {
				int i_806_
				    = anIntArray11404[(i_710_ >> 16) + i_804_];
				int i_807_ = i_806_ >>> 24;
				int i_808_ = 256 - i_807_;
				i_800_
				    = (i_806_ & 0xff00ff) * i_798_ & ~0xff00ff;
				i_801_ = (i_806_ & 0xff00) * i_798_ & 0xff0000;
				i_806_ = ((i_800_ | i_801_) >>> 8) + i_707_;
				int i_809_ = is[i_719_];
				is[i_719_++]
				    = ((((i_806_ & 0xff00ff) * i_807_
					 + (i_809_ & 0xff00ff) * i_808_)
					& ~0xff00ff)
				       + (((i_806_ & 0xff00) * i_807_
					   + (i_809_ & 0xff00) * i_808_)
					  & 0xff0000)) >> 8;
				i_710_ += i_715_;
			    }
			    i_711_ += i_716_;
			    i_710_ = i_802_;
			    i_719_ += i_720_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_708_ == 2) {
		    if (i_706_ == 1) {
			int i_810_ = i_710_;
			for (int i_811_ = -i_705_; i_811_ < 0; i_811_++) {
			    int i_812_ = (i_711_ >> 16) * anInt8985;
			    for (int i_813_ = -i_704_; i_813_ < 0; i_813_++) {
				int i_814_
				    = anIntArray11404[(i_710_ >> 16) + i_812_];
				if (i_814_ != 0) {
				    int i_815_ = is[i_719_];
				    int i_816_ = i_814_ + i_815_;
				    int i_817_ = ((i_814_ & 0xff00ff)
						  + (i_815_ & 0xff00ff));
				    i_815_ = ((i_817_ & 0x1000100)
					      + (i_816_ - i_817_ & 0x10000));
				    is[i_719_++]
					= i_816_ - i_815_ | i_815_ - (i_815_
								      >>> 8);
				} else
				    i_719_++;
				i_710_ += i_715_;
			    }
			    i_711_ += i_716_;
			    i_710_ = i_810_;
			    i_719_ += i_720_;
			}
		    } else if (i_706_ == 0) {
			int i_818_ = i_710_;
			int i_819_ = (i_707_ & 0xff0000) >> 16;
			int i_820_ = (i_707_ & 0xff00) >> 8;
			int i_821_ = i_707_ & 0xff;
			for (int i_822_ = -i_705_; i_822_ < 0; i_822_++) {
			    int i_823_ = (i_711_ >> 16) * anInt8985;
			    for (int i_824_ = -i_704_; i_824_ < 0; i_824_++) {
				int i_825_
				    = anIntArray11404[(i_710_ >> 16) + i_823_];
				if (i_825_ != 0) {
				    int i_826_ = ((i_825_ & 0xff0000) * i_819_
						  & ~0xffffff);
				    int i_827_ = ((i_825_ & 0xff00) * i_820_
						  & 0xff0000);
				    int i_828_
					= (i_825_ & 0xff) * i_821_ & 0xff00;
				    i_825_ = (i_826_ | i_827_ | i_828_) >>> 8;
				    int i_829_ = is[i_719_];
				    int i_830_ = i_825_ + i_829_;
				    int i_831_ = ((i_825_ & 0xff00ff)
						  + (i_829_ & 0xff00ff));
				    i_829_ = ((i_831_ & 0x1000100)
					      + (i_830_ - i_831_ & 0x10000));
				    is[i_719_++]
					= i_830_ - i_829_ | i_829_ - (i_829_
								      >>> 8);
				} else
				    i_719_++;
				i_710_ += i_715_;
			    }
			    i_711_ += i_716_;
			    i_710_ = i_818_;
			    i_719_ += i_720_;
			}
		    } else if (i_706_ == 3) {
			int i_832_ = i_710_;
			for (int i_833_ = -i_705_; i_833_ < 0; i_833_++) {
			    int i_834_ = (i_711_ >> 16) * anInt8985;
			    for (int i_835_ = -i_704_; i_835_ < 0; i_835_++) {
				int i_836_
				    = anIntArray11404[(i_710_ >> 16) + i_834_];
				int i_837_ = i_836_ + i_707_;
				int i_838_ = ((i_836_ & 0xff00ff)
					      + (i_707_ & 0xff00ff));
				int i_839_ = ((i_838_ & 0x1000100)
					      + (i_837_ - i_838_ & 0x10000));
				i_836_ = i_837_ - i_839_ | i_839_ - (i_839_
								     >>> 8);
				i_839_ = is[i_719_];
				i_837_ = i_836_ + i_839_;
				i_838_ = (i_836_ & 0xff00ff) + (i_839_
								& 0xff00ff);
				i_839_
				    = (i_838_ & 0x1000100) + (i_837_ - i_838_
							      & 0x10000);
				is[i_719_++]
				    = i_837_ - i_839_ | i_839_ - (i_839_
								  >>> 8);
				i_710_ += i_715_;
			    }
			    i_711_ += i_716_;
			    i_710_ = i_832_;
			    i_719_ += i_720_;
			}
		    } else if (i_706_ == 2) {
			int i_840_ = i_707_ >>> 24;
			int i_841_ = 256 - i_840_;
			int i_842_ = (i_707_ & 0xff00ff) * i_841_ & ~0xff00ff;
			int i_843_ = (i_707_ & 0xff00) * i_841_ & 0xff0000;
			i_707_ = (i_842_ | i_843_) >>> 8;
			int i_844_ = i_710_;
			for (int i_845_ = -i_705_; i_845_ < 0; i_845_++) {
			    int i_846_ = (i_711_ >> 16) * anInt8985;
			    for (int i_847_ = -i_704_; i_847_ < 0; i_847_++) {
				int i_848_
				    = anIntArray11404[(i_710_ >> 16) + i_846_];
				if (i_848_ != 0) {
				    i_842_ = ((i_848_ & 0xff00ff) * i_840_
					      & ~0xff00ff);
				    i_843_ = ((i_848_ & 0xff00) * i_840_
					      & 0xff0000);
				    i_848_
					= ((i_842_ | i_843_) >>> 8) + i_707_;
				    int i_849_ = is[i_719_];
				    int i_850_ = i_848_ + i_849_;
				    int i_851_ = ((i_848_ & 0xff00ff)
						  + (i_849_ & 0xff00ff));
				    i_849_ = ((i_851_ & 0x1000100)
					      + (i_850_ - i_851_ & 0x10000));
				    is[i_719_++]
					= i_850_ - i_849_ | i_849_ - (i_849_
								      >>> 8);
				} else
				    i_719_++;
				i_710_ += i_715_;
			    }
			    i_711_ += i_716_;
			    i_710_ = i_844_;
			    i_719_ += i_720_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2648(int i, int i_852_, int i_853_, int i_854_, int[] is,
			   int[] is_855_, int i_856_, int i_857_) {
	method17940(i, i_852_, i_853_, i_854_, is, i_856_, i_857_);
    }
    
    public void method2676(int i, int i_858_, int i_859_, int i_860_, int[] is,
			   int[] is_861_, int i_862_, int i_863_) {
	method17940(i, i_858_, i_859_, i_860_, is, i_862_, i_863_);
    }
    
    void method17939(int i, int i_864_, int i_865_, int i_866_, int[] is,
		     int i_867_, int i_868_) {
	i_868_ -= i_865_;
	for (int i_869_ = 0; i_869_ < i_866_; i_869_++) {
	    int i_870_ = (i_864_ + i_869_) * i_865_ + i;
	    for (int i_871_ = 0; i_871_ < i_865_; i_871_++)
		is[i_867_++] = anIntArray11404[i_870_ + i_871_];
	    i_867_ += i_868_;
	}
    }
    
    public void method2653(int i, int i_872_, int i_873_, int i_874_, int[] is,
			   int[] is_875_, int i_876_, int i_877_) {
	method17940(i, i_872_, i_873_, i_874_, is, i_876_, i_877_);
    }
    
    Class163_Sub1_Sub1(Class185_Sub2 class185_sub2, int[] is, int i,
		       int i_878_) {
	super(class185_sub2, i, i_878_);
	anIntArray11404 = is;
    }
    
    public Interface22 method2688() {
	return new Class115(anInt8985, anInt9002, anIntArray11404);
    }
    
    public Interface22 method2681() {
	return new Class115(anInt8985, anInt9002, anIntArray11404);
    }
    
    void method17940(int i, int i_879_, int i_880_, int i_881_, int[] is,
		     int i_882_, int i_883_) {
	i_883_ -= i_880_;
	for (int i_884_ = 0; i_884_ < i_881_; i_884_++) {
	    int i_885_ = (i_879_ + i_884_) * i_880_ + i;
	    for (int i_886_ = 0; i_886_ < i_880_; i_886_++)
		is[i_882_++] = anIntArray11404[i_885_ + i_886_];
	    i_882_ += i_883_;
	}
    }
    
    public Interface22 method2683() {
	return new Class115(anInt8985, anInt9002, anIntArray11404);
    }
    
    void method14515(int i, int i_887_) {
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    if (anInt9001 == 0) {
		if (anInt9000 == 0) {
		    int i_888_ = anInt8998;
		    while (i_888_ < 0) {
			int i_889_ = anInt8988;
			int i_890_ = anInt9007;
			int i_891_ = anInt9003;
			int i_892_ = anInt8999;
			if (i_890_ >= 0 && i_891_ >= 0
			    && i_890_ - (anInt8985 << 12) < 0
			    && i_891_ - (anInt9002 << 12) < 0) {
			    for (/**/; i_892_ < 0; i_892_++)
				method17938(((i_891_ >> 12) * anInt8985
					     + (i_890_ >> 12)),
					    i_889_++, is, i, i_887_);
			}
			i_888_++;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_893_ = anInt8998;
		    while (i_893_ < 0) {
			int i_894_ = anInt8988;
			int i_895_ = anInt9007;
			int i_896_ = anInt9003 + anInt9010;
			int i_897_ = anInt8999;
			if (i_895_ >= 0 && i_895_ - (anInt8985 << 12) < 0) {
			    int i_898_;
			    if ((i_898_ = i_896_ - (anInt9002 << 12)) >= 0) {
				i_898_ = (anInt9000 - i_898_) / anInt9000;
				i_897_ += i_898_;
				i_896_ += anInt9000 * i_898_;
				i_894_ += i_898_;
			    }
			    if ((i_898_ = (i_896_ - anInt9000) / anInt9000)
				> i_897_)
				i_897_ = i_898_;
			    for (/**/; i_897_ < 0; i_897_++) {
				method17938(((i_896_ >> 12) * anInt8985
					     + (i_895_ >> 12)),
					    i_894_++, is, i, i_887_);
				i_896_ += anInt9000;
			    }
			}
			i_893_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_899_ = anInt8998;
		    while (i_899_ < 0) {
			int i_900_ = anInt8988;
			int i_901_ = anInt9007;
			int i_902_ = anInt9003 + anInt9010;
			int i_903_ = anInt8999;
			if (i_901_ >= 0 && i_901_ - (anInt8985 << 12) < 0) {
			    if (i_902_ < 0) {
				int i_904_
				    = (anInt9000 - 1 - i_902_) / anInt9000;
				i_903_ += i_904_;
				i_902_ += anInt9000 * i_904_;
				i_900_ += i_904_;
			    }
			    int i_905_;
			    if ((i_905_ = (1 + i_902_ - (anInt9002 << 12)
					   - anInt9000) / anInt9000)
				> i_903_)
				i_903_ = i_905_;
			    for (/**/; i_903_ < 0; i_903_++) {
				method17938(((i_902_ >> 12) * anInt8985
					     + (i_901_ >> 12)),
					    i_900_++, is, i, i_887_);
				i_902_ += anInt9000;
			    }
			}
			i_899_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9001 < 0) {
		if (anInt9000 == 0) {
		    int i_906_ = anInt8998;
		    while (i_906_ < 0) {
			int i_907_ = anInt8988;
			int i_908_ = anInt9007 + anInt9009;
			int i_909_ = anInt9003;
			int i_910_ = anInt8999;
			if (i_909_ >= 0 && i_909_ - (anInt9002 << 12) < 0) {
			    int i_911_;
			    if ((i_911_ = i_908_ - (anInt8985 << 12)) >= 0) {
				i_911_ = (anInt9001 - i_911_) / anInt9001;
				i_910_ += i_911_;
				i_908_ += anInt9001 * i_911_;
				i_907_ += i_911_;
			    }
			    if ((i_911_ = (i_908_ - anInt9001) / anInt9001)
				> i_910_)
				i_910_ = i_911_;
			    for (/**/; i_910_ < 0; i_910_++) {
				method17938(((i_909_ >> 12) * anInt8985
					     + (i_908_ >> 12)),
					    i_907_++, is, i, i_887_);
				i_908_ += anInt9001;
			    }
			}
			i_906_++;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_912_ = anInt8998;
		    while (i_912_ < 0) {
			int i_913_ = anInt8988;
			int i_914_ = anInt9007 + anInt9009;
			int i_915_ = anInt9003 + anInt9010;
			int i_916_ = anInt8999;
			int i_917_;
			if ((i_917_ = i_914_ - (anInt8985 << 12)) >= 0) {
			    i_917_ = (anInt9001 - i_917_) / anInt9001;
			    i_916_ += i_917_;
			    i_914_ += anInt9001 * i_917_;
			    i_915_ += anInt9000 * i_917_;
			    i_913_ += i_917_;
			}
			if ((i_917_ = (i_914_ - anInt9001) / anInt9001)
			    > i_916_)
			    i_916_ = i_917_;
			if ((i_917_ = i_915_ - (anInt9002 << 12)) >= 0) {
			    i_917_ = (anInt9000 - i_917_) / anInt9000;
			    i_916_ += i_917_;
			    i_914_ += anInt9001 * i_917_;
			    i_915_ += anInt9000 * i_917_;
			    i_913_ += i_917_;
			}
			if ((i_917_ = (i_915_ - anInt9000) / anInt9000)
			    > i_916_)
			    i_916_ = i_917_;
			for (/**/; i_916_ < 0; i_916_++) {
			    method17938((i_915_ >> 12) * anInt8985 + (i_914_
								      >> 12),
					i_913_++, is, i, i_887_);
			    i_914_ += anInt9001;
			    i_915_ += anInt9000;
			}
			i_912_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_918_ = anInt8998;
		    while (i_918_ < 0) {
			int i_919_ = anInt8988;
			int i_920_ = anInt9007 + anInt9009;
			int i_921_ = anInt9003 + anInt9010;
			int i_922_ = anInt8999;
			int i_923_;
			if ((i_923_ = i_920_ - (anInt8985 << 12)) >= 0) {
			    i_923_ = (anInt9001 - i_923_) / anInt9001;
			    i_922_ += i_923_;
			    i_920_ += anInt9001 * i_923_;
			    i_921_ += anInt9000 * i_923_;
			    i_919_ += i_923_;
			}
			if ((i_923_ = (i_920_ - anInt9001) / anInt9001)
			    > i_922_)
			    i_922_ = i_923_;
			if (i_921_ < 0) {
			    i_923_ = (anInt9000 - 1 - i_921_) / anInt9000;
			    i_922_ += i_923_;
			    i_920_ += anInt9001 * i_923_;
			    i_921_ += anInt9000 * i_923_;
			    i_919_ += i_923_;
			}
			if ((i_923_ = (1 + i_921_ - (anInt9002 << 12)
				       - anInt9000) / anInt9000)
			    > i_922_)
			    i_922_ = i_923_;
			for (/**/; i_922_ < 0; i_922_++) {
			    method17938((i_921_ >> 12) * anInt8985 + (i_920_
								      >> 12),
					i_919_++, is, i, i_887_);
			    i_920_ += anInt9001;
			    i_921_ += anInt9000;
			}
			i_918_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9000 == 0) {
		int i_924_ = anInt8998;
		while (i_924_ < 0) {
		    int i_925_ = anInt8988;
		    int i_926_ = anInt9007 + anInt9009;
		    int i_927_ = anInt9003;
		    int i_928_ = anInt8999;
		    if (i_927_ >= 0 && i_927_ - (anInt9002 << 12) < 0) {
			if (i_926_ < 0) {
			    int i_929_ = (anInt9001 - 1 - i_926_) / anInt9001;
			    i_928_ += i_929_;
			    i_926_ += anInt9001 * i_929_;
			    i_925_ += i_929_;
			}
			int i_930_;
			if ((i_930_ = (1 + i_926_ - (anInt8985 << 12)
				       - anInt9001) / anInt9001)
			    > i_928_)
			    i_928_ = i_930_;
			for (/**/; i_928_ < 0; i_928_++) {
			    method17938((i_927_ >> 12) * anInt8985 + (i_926_
								      >> 12),
					i_925_++, is, i, i_887_);
			    i_926_ += anInt9001;
			}
		    }
		    i_924_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else if (anInt9000 < 0) {
		for (int i_931_ = anInt8998; i_931_ < 0; i_931_++) {
		    int i_932_ = anInt8988;
		    int i_933_ = anInt9007 + anInt9009;
		    int i_934_ = anInt9003 + anInt9010;
		    int i_935_ = anInt8999;
		    if (i_933_ < 0) {
			int i_936_ = (anInt9001 - 1 - i_933_) / anInt9001;
			i_935_ += i_936_;
			i_933_ += anInt9001 * i_936_;
			i_934_ += anInt9000 * i_936_;
			i_932_ += i_936_;
		    }
		    int i_937_;
		    if ((i_937_ = ((1 + i_933_ - (anInt8985 << 12) - anInt9001)
				   / anInt9001))
			> i_935_)
			i_935_ = i_937_;
		    if ((i_937_ = i_934_ - (anInt9002 << 12)) >= 0) {
			i_937_ = (anInt9000 - i_937_) / anInt9000;
			i_935_ += i_937_;
			i_933_ += anInt9001 * i_937_;
			i_934_ += anInt9000 * i_937_;
			i_932_ += i_937_;
		    }
		    if ((i_937_ = (i_934_ - anInt9000) / anInt9000) > i_935_)
			i_935_ = i_937_;
		    for (/**/; i_935_ < 0; i_935_++) {
			method17938((i_934_ >> 12) * anInt8985 + (i_933_
								  >> 12),
				    i_932_++, is, i, i_887_);
			i_933_ += anInt9001;
			i_934_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else {
		for (int i_938_ = anInt8998; i_938_ < 0; i_938_++) {
		    int i_939_ = anInt8988;
		    int i_940_ = anInt9007 + anInt9009;
		    int i_941_ = anInt9003 + anInt9010;
		    int i_942_ = anInt8999;
		    if (i_940_ < 0) {
			int i_943_ = (anInt9001 - 1 - i_940_) / anInt9001;
			i_942_ += i_943_;
			i_940_ += anInt9001 * i_943_;
			i_941_ += anInt9000 * i_943_;
			i_939_ += i_943_;
		    }
		    int i_944_;
		    if ((i_944_ = ((1 + i_940_ - (anInt8985 << 12) - anInt9001)
				   / anInt9001))
			> i_942_)
			i_942_ = i_944_;
		    if (i_941_ < 0) {
			i_944_ = (anInt9000 - 1 - i_941_) / anInt9000;
			i_942_ += i_944_;
			i_940_ += anInt9001 * i_944_;
			i_941_ += anInt9000 * i_944_;
			i_939_ += i_944_;
		    }
		    if ((i_944_ = ((1 + i_941_ - (anInt9002 << 12) - anInt9000)
				   / anInt9000))
			> i_942_)
			i_942_ = i_944_;
		    for (/**/; i_942_ < 0; i_942_++) {
			method17938((i_941_ >> 12) * anInt8985 + (i_940_
								  >> 12),
				    i_939_++, is, i, i_887_);
			i_940_ += anInt9001;
			i_941_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    }
	}
    }
    
    public void method2685(int i, int i_945_, Class145 class145, int i_946_,
			   int i_947_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    i += anInt8987;
	    i_945_ += anInt8989;
	    int i_948_ = 0;
	    int i_949_ = aClass185_Sub2_9016.anInt9356 * 356365251;
	    int i_950_ = anInt8985;
	    int i_951_ = anInt9002;
	    int i_952_ = i_949_ - i_950_;
	    int i_953_ = 0;
	    int i_954_ = i + i_945_ * i_949_;
	    if (i_945_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		int i_955_ = aClass185_Sub2_9016.anInt9344 * 9823353 - i_945_;
		i_951_ -= i_955_;
		i_945_ = aClass185_Sub2_9016.anInt9344 * 9823353;
		i_948_ += i_955_ * i_950_;
		i_954_ += i_955_ * i_949_;
	    }
	    if (i_945_ + i_951_ > aClass185_Sub2_9016.anInt9345 * 639238427)
		i_951_ -= (i_945_ + i_951_
			   - aClass185_Sub2_9016.anInt9345 * 639238427);
	    if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		int i_956_ = aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		i_950_ -= i_956_;
		i = aClass185_Sub2_9016.anInt9365 * 1709859847;
		i_948_ += i_956_;
		i_954_ += i_956_;
		i_953_ += i_956_;
		i_952_ += i_956_;
	    }
	    if (i + i_950_ > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		int i_957_
		    = i + i_950_ - aClass185_Sub2_9016.anInt9343 * -1807368365;
		i_950_ -= i_957_;
		i_953_ += i_957_;
		i_952_ += i_957_;
	    }
	    if (i_950_ > 0 && i_951_ > 0) {
		Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
		int[] is_958_ = class145_sub2.anIntArray9797;
		int[] is_959_ = class145_sub2.anIntArray9798;
		int i_960_ = i_945_;
		if (i_947_ > i_960_) {
		    i_960_ = i_947_;
		    i_954_ += (i_947_ - i_945_) * i_949_;
		    i_948_ += (i_947_ - i_945_) * anInt8985;
		}
		int i_961_ = (i_947_ + is_958_.length < i_945_ + i_951_
			      ? i_947_ + is_958_.length : i_945_ + i_951_);
		for (int i_962_ = i_960_; i_962_ < i_961_; i_962_++) {
		    int i_963_ = is_958_[i_962_ - i_947_] + i_946_;
		    int i_964_ = is_959_[i_962_ - i_947_];
		    int i_965_ = i_950_;
		    if (i > i_963_) {
			int i_966_ = i - i_963_;
			if (i_966_ >= i_964_) {
			    i_948_ += i_950_ + i_953_;
			    i_954_ += i_950_ + i_952_;
			    continue;
			}
			i_964_ -= i_966_;
		    } else {
			int i_967_ = i_963_ - i;
			if (i_967_ >= i_950_) {
			    i_948_ += i_950_ + i_953_;
			    i_954_ += i_950_ + i_952_;
			    continue;
			}
			i_948_ += i_967_;
			i_965_ -= i_967_;
			i_954_ += i_967_;
		    }
		    int i_968_ = 0;
		    if (i_965_ < i_964_)
			i_964_ = i_965_;
		    else
			i_968_ = i_965_ - i_964_;
		    for (int i_969_ = -i_964_; i_969_ < 0; i_969_++) {
			int i_970_ = anIntArray11404[i_948_++];
			int i_971_ = i_970_ >>> 24;
			int i_972_ = 256 - i_971_;
			int i_973_ = is[i_954_];
			is[i_954_++] = ((((i_970_ & 0xff00ff) * i_971_
					  + (i_973_ & 0xff00ff) * i_972_)
					 & ~0xff00ff)
					+ (((i_970_ & 0xff00) * i_971_
					    + (i_973_ & 0xff00) * i_972_)
					   & 0xff0000)) >> 8;
		    }
		    i_948_ += i_968_ + i_953_;
		    i_954_ += i_968_ + i_952_;
		}
	    }
	}
    }
    
    void method2686(int i, int i_974_, int i_975_, int i_976_, int i_977_,
		    int i_978_, int i_979_, int i_980_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (i_975_ > 0 && i_976_ > 0) {
	    int[] is = aClass185_Sub2_9016.anIntArray9338;
	    if (is != null) {
		int i_981_ = 0;
		int i_982_ = 0;
		int i_983_ = aClass185_Sub2_9016.anInt9356 * 356365251;
		int i_984_ = anInt8987 + anInt8985 + anInt8992;
		int i_985_ = anInt8989 + anInt9002 + anInt8990;
		int i_986_ = (i_984_ << 16) / i_975_;
		int i_987_ = (i_985_ << 16) / i_976_;
		if (anInt8987 > 0) {
		    int i_988_ = ((anInt8987 << 16) + i_986_ - 1) / i_986_;
		    i += i_988_;
		    i_981_ += i_988_ * i_986_ - (anInt8987 << 16);
		}
		if (anInt8989 > 0) {
		    int i_989_ = ((anInt8989 << 16) + i_987_ - 1) / i_987_;
		    i_974_ += i_989_;
		    i_982_ += i_989_ * i_987_ - (anInt8989 << 16);
		}
		if (anInt8985 < i_984_)
		    i_975_
			= ((anInt8985 << 16) - i_981_ + i_986_ - 1) / i_986_;
		if (anInt9002 < i_985_)
		    i_976_
			= ((anInt9002 << 16) - i_982_ + i_987_ - 1) / i_987_;
		int i_990_ = i + i_974_ * i_983_;
		int i_991_ = i_983_ - i_975_;
		if (i_974_ + i_976_
		    > aClass185_Sub2_9016.anInt9345 * 639238427)
		    i_976_ -= (i_974_ + i_976_
			       - aClass185_Sub2_9016.anInt9345 * 639238427);
		if (i_974_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		    int i_992_
			= aClass185_Sub2_9016.anInt9344 * 9823353 - i_974_;
		    i_976_ -= i_992_;
		    i_990_ += i_992_ * i_983_;
		    i_982_ += i_987_ * i_992_;
		}
		if (i + i_975_ > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		    int i_993_
			= (i + i_975_
			   - aClass185_Sub2_9016.anInt9343 * -1807368365);
		    i_975_ -= i_993_;
		    i_991_ += i_993_;
		}
		if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		    int i_994_
			= aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		    i_975_ -= i_994_;
		    i_990_ += i_994_;
		    i_981_ += i_986_ * i_994_;
		    i_991_ += i_994_;
		}
		if (i_979_ == 0) {
		    if (i_977_ == 1) {
			int i_995_ = i_981_;
			for (int i_996_ = -i_976_; i_996_ < 0; i_996_++) {
			    int i_997_ = (i_982_ >> 16) * anInt8985;
			    for (int i_998_ = -i_975_; i_998_ < 0; i_998_++) {
				is[i_990_++]
				    = anIntArray11404[(i_981_ >> 16) + i_997_];
				i_981_ += i_986_;
			    }
			    i_982_ += i_987_;
			    i_981_ = i_995_;
			    i_990_ += i_991_;
			}
		    } else if (i_977_ == 0) {
			int i_999_ = (i_978_ & 0xff0000) >> 16;
			int i_1000_ = (i_978_ & 0xff00) >> 8;
			int i_1001_ = i_978_ & 0xff;
			int i_1002_ = i_981_;
			for (int i_1003_ = -i_976_; i_1003_ < 0; i_1003_++) {
			    int i_1004_ = (i_982_ >> 16) * anInt8985;
			    for (int i_1005_ = -i_975_; i_1005_ < 0;
				 i_1005_++) {
				int i_1006_ = (anIntArray11404
					       [(i_981_ >> 16) + i_1004_]);
				int i_1007_ = ((i_1006_ & 0xff0000) * i_999_
					       & ~0xffffff);
				int i_1008_
				    = (i_1006_ & 0xff00) * i_1000_ & 0xff0000;
				int i_1009_
				    = (i_1006_ & 0xff) * i_1001_ & 0xff00;
				is[i_990_++]
				    = (i_1007_ | i_1008_ | i_1009_) >>> 8;
				i_981_ += i_986_;
			    }
			    i_982_ += i_987_;
			    i_981_ = i_1002_;
			    i_990_ += i_991_;
			}
		    } else if (i_977_ == 3) {
			int i_1010_ = i_981_;
			for (int i_1011_ = -i_976_; i_1011_ < 0; i_1011_++) {
			    int i_1012_ = (i_982_ >> 16) * anInt8985;
			    for (int i_1013_ = -i_975_; i_1013_ < 0;
				 i_1013_++) {
				int i_1014_ = (anIntArray11404
					       [(i_981_ >> 16) + i_1012_]);
				int i_1015_ = i_1014_ + i_978_;
				int i_1016_ = ((i_1014_ & 0xff00ff)
					       + (i_978_ & 0xff00ff));
				int i_1017_
				    = ((i_1016_ & 0x1000100)
				       + (i_1015_ - i_1016_ & 0x10000));
				is[i_990_++]
				    = i_1015_ - i_1017_ | i_1017_ - (i_1017_
								     >>> 8);
				i_981_ += i_986_;
			    }
			    i_982_ += i_987_;
			    i_981_ = i_1010_;
			    i_990_ += i_991_;
			}
		    } else if (i_977_ == 2) {
			int i_1018_ = i_978_ >>> 24;
			int i_1019_ = 256 - i_1018_;
			int i_1020_
			    = (i_978_ & 0xff00ff) * i_1019_ & ~0xff00ff;
			int i_1021_ = (i_978_ & 0xff00) * i_1019_ & 0xff0000;
			i_978_ = (i_1020_ | i_1021_) >>> 8;
			int i_1022_ = i_981_;
			for (int i_1023_ = -i_976_; i_1023_ < 0; i_1023_++) {
			    int i_1024_ = (i_982_ >> 16) * anInt8985;
			    for (int i_1025_ = -i_975_; i_1025_ < 0;
				 i_1025_++) {
				int i_1026_ = (anIntArray11404
					       [(i_981_ >> 16) + i_1024_]);
				i_1020_ = ((i_1026_ & 0xff00ff) * i_1018_
					   & ~0xff00ff);
				i_1021_
				    = (i_1026_ & 0xff00) * i_1018_ & 0xff0000;
				is[i_990_++]
				    = ((i_1020_ | i_1021_) >>> 8) + i_978_;
				i_981_ += i_986_;
			    }
			    i_982_ += i_987_;
			    i_981_ = i_1022_;
			    i_990_ += i_991_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_979_ == 1) {
		    if (i_977_ == 1) {
			int i_1027_ = i_981_;
			for (int i_1028_ = -i_976_; i_1028_ < 0; i_1028_++) {
			    int i_1029_ = (i_982_ >> 16) * anInt8985;
			    for (int i_1030_ = -i_975_; i_1030_ < 0;
				 i_1030_++) {
				int i_1031_ = (anIntArray11404
					       [(i_981_ >> 16) + i_1029_]);
				int i_1032_ = i_1031_ >>> 24;
				int i_1033_ = 256 - i_1032_;
				int i_1034_ = is[i_990_];
				is[i_990_++]
				    = (((((i_1031_ & 0xff00ff) * i_1032_
					  + (i_1034_ & 0xff00ff) * i_1033_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_1031_ & ~0xff00ff) >>> 8)
					    * i_1032_)
					   + (((i_1034_ & ~0xff00ff) >>> 8)
					      * i_1033_))
					  & ~0xff00ff));
				i_981_ += i_986_;
			    }
			    i_982_ += i_987_;
			    i_981_ = i_1027_;
			    i_990_ += i_991_;
			}
		    } else if (i_977_ == 0) {
			int i_1035_ = i_981_;
			if ((i_978_ & 0xffffff) == 16777215) {
			    for (int i_1036_ = -i_976_; i_1036_ < 0;
				 i_1036_++) {
				int i_1037_ = (i_982_ >> 16) * anInt8985;
				for (int i_1038_ = -i_975_; i_1038_ < 0;
				     i_1038_++) {
				    int i_1039_ = (anIntArray11404
						   [(i_981_ >> 16) + i_1037_]);
				    int i_1040_
					= ((i_1039_ >>> 24) * (i_978_ >>> 24)
					   >> 8);
				    int i_1041_ = 256 - i_1040_;
				    int i_1042_ = is[i_990_];
				    is[i_990_++]
					= ((((i_1039_ & 0xff00ff) * i_1040_
					     + (i_1042_ & 0xff00ff) * i_1041_)
					    & ~0xff00ff)
					   + (((i_1039_ & 0xff00) * i_1040_
					       + (i_1042_ & 0xff00) * i_1041_)
					      & 0xff0000)) >> 8;
				    i_981_ += i_986_;
				}
				i_982_ += i_987_;
				i_981_ = i_1035_;
				i_990_ += i_991_;
			    }
			} else {
			    int i_1043_ = (i_978_ & 0xff0000) >> 16;
			    int i_1044_ = (i_978_ & 0xff00) >> 8;
			    int i_1045_ = i_978_ & 0xff;
			    for (int i_1046_ = -i_976_; i_1046_ < 0;
				 i_1046_++) {
				int i_1047_ = (i_982_ >> 16) * anInt8985;
				for (int i_1048_ = -i_975_; i_1048_ < 0;
				     i_1048_++) {
				    int i_1049_ = (anIntArray11404
						   [(i_981_ >> 16) + i_1047_]);
				    int i_1050_
					= ((i_1049_ >>> 24) * (i_978_ >>> 24)
					   >> 8);
				    int i_1051_ = 256 - i_1050_;
				    if (i_1050_ != 255) {
					int i_1052_
					    = ((i_1049_ & 0xff0000) * i_1043_
					       & ~0xffffff);
					int i_1053_
					    = ((i_1049_ & 0xff00) * i_1044_
					       & 0xff0000);
					int i_1054_
					    = ((i_1049_ & 0xff) * i_1045_
					       & 0xff00);
					i_1049_ = (i_1052_ | i_1053_
						   | i_1054_) >>> 8;
					int i_1055_ = is[i_990_];
					is[i_990_++]
					    = ((((i_1049_ & 0xff00ff) * i_1050_
						 + ((i_1055_ & 0xff00ff)
						    * i_1051_))
						& ~0xff00ff)
					       + (((i_1049_ & 0xff00) * i_1050_
						   + ((i_1055_ & 0xff00)
						      * i_1051_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_1056_
					    = ((i_1049_ & 0xff0000) * i_1043_
					       & ~0xffffff);
					int i_1057_
					    = ((i_1049_ & 0xff00) * i_1044_
					       & 0xff0000);
					int i_1058_
					    = ((i_1049_ & 0xff) * i_1045_
					       & 0xff00);
					is[i_990_++] = (i_1056_ | i_1057_
							| i_1058_) >>> 8;
				    }
				    i_981_ += i_986_;
				}
				i_982_ += i_987_;
				i_981_ = i_1035_;
				i_990_ += i_991_;
			    }
			}
		    } else if (i_977_ == 3) {
			int i_1059_ = i_981_;
			for (int i_1060_ = -i_976_; i_1060_ < 0; i_1060_++) {
			    int i_1061_ = (i_982_ >> 16) * anInt8985;
			    for (int i_1062_ = -i_975_; i_1062_ < 0;
				 i_1062_++) {
				int i_1063_ = (anIntArray11404
					       [(i_981_ >> 16) + i_1061_]);
				int i_1064_ = i_1063_ + i_978_;
				int i_1065_ = ((i_1063_ & 0xff00ff)
					       + (i_978_ & 0xff00ff));
				int i_1066_
				    = ((i_1065_ & 0x1000100)
				       + (i_1064_ - i_1065_ & 0x10000));
				i_1066_
				    = i_1064_ - i_1066_ | i_1066_ - (i_1066_
								     >>> 8);
				int i_1067_
				    = (i_1066_ >>> 24) * (i_978_ >>> 24) >> 8;
				int i_1068_ = 256 - i_1067_;
				if (i_1067_ != 255) {
				    i_1063_ = i_1066_;
				    i_1066_ = is[i_990_];
				    i_1066_
					= ((((i_1063_ & 0xff00ff) * i_1067_
					     + (i_1066_ & 0xff00ff) * i_1068_)
					    & ~0xff00ff)
					   + (((i_1063_ & 0xff00) * i_1067_
					       + (i_1066_ & 0xff00) * i_1068_)
					      & 0xff0000)) >> 8;
				}
				is[i_990_++] = i_1066_;
				i_981_ += i_986_;
			    }
			    i_982_ += i_987_;
			    i_981_ = i_1059_;
			    i_990_ += i_991_;
			}
		    } else if (i_977_ == 2) {
			int i_1069_ = i_978_ >>> 24;
			int i_1070_ = 256 - i_1069_;
			int i_1071_
			    = (i_978_ & 0xff00ff) * i_1070_ & ~0xff00ff;
			int i_1072_ = (i_978_ & 0xff00) * i_1070_ & 0xff0000;
			i_978_ = (i_1071_ | i_1072_) >>> 8;
			int i_1073_ = i_981_;
			for (int i_1074_ = -i_976_; i_1074_ < 0; i_1074_++) {
			    int i_1075_ = (i_982_ >> 16) * anInt8985;
			    for (int i_1076_ = -i_975_; i_1076_ < 0;
				 i_1076_++) {
				int i_1077_ = (anIntArray11404
					       [(i_981_ >> 16) + i_1075_]);
				int i_1078_ = i_1077_ >>> 24;
				int i_1079_ = 256 - i_1078_;
				i_1071_ = ((i_1077_ & 0xff00ff) * i_1069_
					   & ~0xff00ff);
				i_1072_
				    = (i_1077_ & 0xff00) * i_1069_ & 0xff0000;
				i_1077_ = ((i_1071_ | i_1072_) >>> 8) + i_978_;
				int i_1080_ = is[i_990_];
				is[i_990_++]
				    = ((((i_1077_ & 0xff00ff) * i_1078_
					 + (i_1080_ & 0xff00ff) * i_1079_)
					& ~0xff00ff)
				       + (((i_1077_ & 0xff00) * i_1078_
					   + (i_1080_ & 0xff00) * i_1079_)
					  & 0xff0000)) >> 8;
				i_981_ += i_986_;
			    }
			    i_982_ += i_987_;
			    i_981_ = i_1073_;
			    i_990_ += i_991_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_979_ == 2) {
		    if (i_977_ == 1) {
			int i_1081_ = i_981_;
			for (int i_1082_ = -i_976_; i_1082_ < 0; i_1082_++) {
			    int i_1083_ = (i_982_ >> 16) * anInt8985;
			    for (int i_1084_ = -i_975_; i_1084_ < 0;
				 i_1084_++) {
				int i_1085_ = (anIntArray11404
					       [(i_981_ >> 16) + i_1083_]);
				if (i_1085_ != 0) {
				    int i_1086_ = is[i_990_];
				    int i_1087_ = i_1085_ + i_1086_;
				    int i_1088_ = ((i_1085_ & 0xff00ff)
						   + (i_1086_ & 0xff00ff));
				    i_1086_
					= ((i_1088_ & 0x1000100)
					   + (i_1087_ - i_1088_ & 0x10000));
				    is[i_990_++]
					= (i_1087_ - i_1086_
					   | i_1086_ - (i_1086_ >>> 8));
				} else
				    i_990_++;
				i_981_ += i_986_;
			    }
			    i_982_ += i_987_;
			    i_981_ = i_1081_;
			    i_990_ += i_991_;
			}
		    } else if (i_977_ == 0) {
			int i_1089_ = i_981_;
			int i_1090_ = (i_978_ & 0xff0000) >> 16;
			int i_1091_ = (i_978_ & 0xff00) >> 8;
			int i_1092_ = i_978_ & 0xff;
			for (int i_1093_ = -i_976_; i_1093_ < 0; i_1093_++) {
			    int i_1094_ = (i_982_ >> 16) * anInt8985;
			    for (int i_1095_ = -i_975_; i_1095_ < 0;
				 i_1095_++) {
				int i_1096_ = (anIntArray11404
					       [(i_981_ >> 16) + i_1094_]);
				if (i_1096_ != 0) {
				    int i_1097_
					= ((i_1096_ & 0xff0000) * i_1090_
					   & ~0xffffff);
				    int i_1098_ = ((i_1096_ & 0xff00) * i_1091_
						   & 0xff0000);
				    int i_1099_
					= (i_1096_ & 0xff) * i_1092_ & 0xff00;
				    i_1096_
					= (i_1097_ | i_1098_ | i_1099_) >>> 8;
				    int i_1100_ = is[i_990_];
				    int i_1101_ = i_1096_ + i_1100_;
				    int i_1102_ = ((i_1096_ & 0xff00ff)
						   + (i_1100_ & 0xff00ff));
				    i_1100_
					= ((i_1102_ & 0x1000100)
					   + (i_1101_ - i_1102_ & 0x10000));
				    is[i_990_++]
					= (i_1101_ - i_1100_
					   | i_1100_ - (i_1100_ >>> 8));
				} else
				    i_990_++;
				i_981_ += i_986_;
			    }
			    i_982_ += i_987_;
			    i_981_ = i_1089_;
			    i_990_ += i_991_;
			}
		    } else if (i_977_ == 3) {
			int i_1103_ = i_981_;
			for (int i_1104_ = -i_976_; i_1104_ < 0; i_1104_++) {
			    int i_1105_ = (i_982_ >> 16) * anInt8985;
			    for (int i_1106_ = -i_975_; i_1106_ < 0;
				 i_1106_++) {
				int i_1107_ = (anIntArray11404
					       [(i_981_ >> 16) + i_1105_]);
				int i_1108_ = i_1107_ + i_978_;
				int i_1109_ = ((i_1107_ & 0xff00ff)
					       + (i_978_ & 0xff00ff));
				int i_1110_
				    = ((i_1109_ & 0x1000100)
				       + (i_1108_ - i_1109_ & 0x10000));
				i_1107_
				    = i_1108_ - i_1110_ | i_1110_ - (i_1110_
								     >>> 8);
				i_1110_ = is[i_990_];
				i_1108_ = i_1107_ + i_1110_;
				i_1109_ = (i_1107_ & 0xff00ff) + (i_1110_
								  & 0xff00ff);
				i_1110_ = ((i_1109_ & 0x1000100)
					   + (i_1108_ - i_1109_ & 0x10000));
				is[i_990_++]
				    = i_1108_ - i_1110_ | i_1110_ - (i_1110_
								     >>> 8);
				i_981_ += i_986_;
			    }
			    i_982_ += i_987_;
			    i_981_ = i_1103_;
			    i_990_ += i_991_;
			}
		    } else if (i_977_ == 2) {
			int i_1111_ = i_978_ >>> 24;
			int i_1112_ = 256 - i_1111_;
			int i_1113_
			    = (i_978_ & 0xff00ff) * i_1112_ & ~0xff00ff;
			int i_1114_ = (i_978_ & 0xff00) * i_1112_ & 0xff0000;
			i_978_ = (i_1113_ | i_1114_) >>> 8;
			int i_1115_ = i_981_;
			for (int i_1116_ = -i_976_; i_1116_ < 0; i_1116_++) {
			    int i_1117_ = (i_982_ >> 16) * anInt8985;
			    for (int i_1118_ = -i_975_; i_1118_ < 0;
				 i_1118_++) {
				int i_1119_ = (anIntArray11404
					       [(i_981_ >> 16) + i_1117_]);
				if (i_1119_ != 0) {
				    i_1113_ = ((i_1119_ & 0xff00ff) * i_1111_
					       & ~0xff00ff);
				    i_1114_ = ((i_1119_ & 0xff00) * i_1111_
					       & 0xff0000);
				    i_1119_
					= ((i_1113_ | i_1114_) >>> 8) + i_978_;
				    int i_1120_ = is[i_990_];
				    int i_1121_ = i_1119_ + i_1120_;
				    int i_1122_ = ((i_1119_ & 0xff00ff)
						   + (i_1120_ & 0xff00ff));
				    i_1120_
					= ((i_1122_ & 0x1000100)
					   + (i_1121_ - i_1122_ & 0x10000));
				    is[i_990_++]
					= (i_1121_ - i_1120_
					   | i_1120_ - (i_1120_ >>> 8));
				} else
				    i_990_++;
				i_981_ += i_986_;
			    }
			    i_982_ += i_987_;
			    i_981_ = i_1115_;
			    i_990_ += i_991_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method2687(int i, int i_1123_, int i_1124_, int i_1125_, int i_1126_,
		    int i_1127_, int i_1128_, int i_1129_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (i_1124_ > 0 && i_1125_ > 0) {
	    int[] is = aClass185_Sub2_9016.anIntArray9338;
	    if (is != null) {
		int i_1130_ = 0;
		int i_1131_ = 0;
		int i_1132_ = aClass185_Sub2_9016.anInt9356 * 356365251;
		int i_1133_ = anInt8987 + anInt8985 + anInt8992;
		int i_1134_ = anInt8989 + anInt9002 + anInt8990;
		int i_1135_ = (i_1133_ << 16) / i_1124_;
		int i_1136_ = (i_1134_ << 16) / i_1125_;
		if (anInt8987 > 0) {
		    int i_1137_ = ((anInt8987 << 16) + i_1135_ - 1) / i_1135_;
		    i += i_1137_;
		    i_1130_ += i_1137_ * i_1135_ - (anInt8987 << 16);
		}
		if (anInt8989 > 0) {
		    int i_1138_ = ((anInt8989 << 16) + i_1136_ - 1) / i_1136_;
		    i_1123_ += i_1138_;
		    i_1131_ += i_1138_ * i_1136_ - (anInt8989 << 16);
		}
		if (anInt8985 < i_1133_)
		    i_1124_ = (((anInt8985 << 16) - i_1130_ + i_1135_ - 1)
			       / i_1135_);
		if (anInt9002 < i_1134_)
		    i_1125_ = (((anInt9002 << 16) - i_1131_ + i_1136_ - 1)
			       / i_1136_);
		int i_1139_ = i + i_1123_ * i_1132_;
		int i_1140_ = i_1132_ - i_1124_;
		if (i_1123_ + i_1125_
		    > aClass185_Sub2_9016.anInt9345 * 639238427)
		    i_1125_ -= (i_1123_ + i_1125_
				- aClass185_Sub2_9016.anInt9345 * 639238427);
		if (i_1123_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		    int i_1141_
			= aClass185_Sub2_9016.anInt9344 * 9823353 - i_1123_;
		    i_1125_ -= i_1141_;
		    i_1139_ += i_1141_ * i_1132_;
		    i_1131_ += i_1136_ * i_1141_;
		}
		if (i + i_1124_
		    > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		    int i_1142_
			= (i + i_1124_
			   - aClass185_Sub2_9016.anInt9343 * -1807368365);
		    i_1124_ -= i_1142_;
		    i_1140_ += i_1142_;
		}
		if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		    int i_1143_
			= aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		    i_1124_ -= i_1143_;
		    i_1139_ += i_1143_;
		    i_1130_ += i_1135_ * i_1143_;
		    i_1140_ += i_1143_;
		}
		if (i_1128_ == 0) {
		    if (i_1126_ == 1) {
			int i_1144_ = i_1130_;
			for (int i_1145_ = -i_1125_; i_1145_ < 0; i_1145_++) {
			    int i_1146_ = (i_1131_ >> 16) * anInt8985;
			    for (int i_1147_ = -i_1124_; i_1147_ < 0;
				 i_1147_++) {
				is[i_1139_++] = (anIntArray11404
						 [(i_1130_ >> 16) + i_1146_]);
				i_1130_ += i_1135_;
			    }
			    i_1131_ += i_1136_;
			    i_1130_ = i_1144_;
			    i_1139_ += i_1140_;
			}
		    } else if (i_1126_ == 0) {
			int i_1148_ = (i_1127_ & 0xff0000) >> 16;
			int i_1149_ = (i_1127_ & 0xff00) >> 8;
			int i_1150_ = i_1127_ & 0xff;
			int i_1151_ = i_1130_;
			for (int i_1152_ = -i_1125_; i_1152_ < 0; i_1152_++) {
			    int i_1153_ = (i_1131_ >> 16) * anInt8985;
			    for (int i_1154_ = -i_1124_; i_1154_ < 0;
				 i_1154_++) {
				int i_1155_ = (anIntArray11404
					       [(i_1130_ >> 16) + i_1153_]);
				int i_1156_ = ((i_1155_ & 0xff0000) * i_1148_
					       & ~0xffffff);
				int i_1157_
				    = (i_1155_ & 0xff00) * i_1149_ & 0xff0000;
				int i_1158_
				    = (i_1155_ & 0xff) * i_1150_ & 0xff00;
				is[i_1139_++]
				    = (i_1156_ | i_1157_ | i_1158_) >>> 8;
				i_1130_ += i_1135_;
			    }
			    i_1131_ += i_1136_;
			    i_1130_ = i_1151_;
			    i_1139_ += i_1140_;
			}
		    } else if (i_1126_ == 3) {
			int i_1159_ = i_1130_;
			for (int i_1160_ = -i_1125_; i_1160_ < 0; i_1160_++) {
			    int i_1161_ = (i_1131_ >> 16) * anInt8985;
			    for (int i_1162_ = -i_1124_; i_1162_ < 0;
				 i_1162_++) {
				int i_1163_ = (anIntArray11404
					       [(i_1130_ >> 16) + i_1161_]);
				int i_1164_ = i_1163_ + i_1127_;
				int i_1165_ = ((i_1163_ & 0xff00ff)
					       + (i_1127_ & 0xff00ff));
				int i_1166_
				    = ((i_1165_ & 0x1000100)
				       + (i_1164_ - i_1165_ & 0x10000));
				is[i_1139_++]
				    = i_1164_ - i_1166_ | i_1166_ - (i_1166_
								     >>> 8);
				i_1130_ += i_1135_;
			    }
			    i_1131_ += i_1136_;
			    i_1130_ = i_1159_;
			    i_1139_ += i_1140_;
			}
		    } else if (i_1126_ == 2) {
			int i_1167_ = i_1127_ >>> 24;
			int i_1168_ = 256 - i_1167_;
			int i_1169_
			    = (i_1127_ & 0xff00ff) * i_1168_ & ~0xff00ff;
			int i_1170_ = (i_1127_ & 0xff00) * i_1168_ & 0xff0000;
			i_1127_ = (i_1169_ | i_1170_) >>> 8;
			int i_1171_ = i_1130_;
			for (int i_1172_ = -i_1125_; i_1172_ < 0; i_1172_++) {
			    int i_1173_ = (i_1131_ >> 16) * anInt8985;
			    for (int i_1174_ = -i_1124_; i_1174_ < 0;
				 i_1174_++) {
				int i_1175_ = (anIntArray11404
					       [(i_1130_ >> 16) + i_1173_]);
				i_1169_ = ((i_1175_ & 0xff00ff) * i_1167_
					   & ~0xff00ff);
				i_1170_
				    = (i_1175_ & 0xff00) * i_1167_ & 0xff0000;
				is[i_1139_++]
				    = ((i_1169_ | i_1170_) >>> 8) + i_1127_;
				i_1130_ += i_1135_;
			    }
			    i_1131_ += i_1136_;
			    i_1130_ = i_1171_;
			    i_1139_ += i_1140_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1128_ == 1) {
		    if (i_1126_ == 1) {
			int i_1176_ = i_1130_;
			for (int i_1177_ = -i_1125_; i_1177_ < 0; i_1177_++) {
			    int i_1178_ = (i_1131_ >> 16) * anInt8985;
			    for (int i_1179_ = -i_1124_; i_1179_ < 0;
				 i_1179_++) {
				int i_1180_ = (anIntArray11404
					       [(i_1130_ >> 16) + i_1178_]);
				int i_1181_ = i_1180_ >>> 24;
				int i_1182_ = 256 - i_1181_;
				int i_1183_ = is[i_1139_];
				is[i_1139_++]
				    = (((((i_1180_ & 0xff00ff) * i_1181_
					  + (i_1183_ & 0xff00ff) * i_1182_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_1180_ & ~0xff00ff) >>> 8)
					    * i_1181_)
					   + (((i_1183_ & ~0xff00ff) >>> 8)
					      * i_1182_))
					  & ~0xff00ff));
				i_1130_ += i_1135_;
			    }
			    i_1131_ += i_1136_;
			    i_1130_ = i_1176_;
			    i_1139_ += i_1140_;
			}
		    } else if (i_1126_ == 0) {
			int i_1184_ = i_1130_;
			if ((i_1127_ & 0xffffff) == 16777215) {
			    for (int i_1185_ = -i_1125_; i_1185_ < 0;
				 i_1185_++) {
				int i_1186_ = (i_1131_ >> 16) * anInt8985;
				for (int i_1187_ = -i_1124_; i_1187_ < 0;
				     i_1187_++) {
				    int i_1188_
					= (anIntArray11404
					   [(i_1130_ >> 16) + i_1186_]);
				    int i_1189_
					= ((i_1188_ >>> 24) * (i_1127_ >>> 24)
					   >> 8);
				    int i_1190_ = 256 - i_1189_;
				    int i_1191_ = is[i_1139_];
				    is[i_1139_++]
					= ((((i_1188_ & 0xff00ff) * i_1189_
					     + (i_1191_ & 0xff00ff) * i_1190_)
					    & ~0xff00ff)
					   + (((i_1188_ & 0xff00) * i_1189_
					       + (i_1191_ & 0xff00) * i_1190_)
					      & 0xff0000)) >> 8;
				    i_1130_ += i_1135_;
				}
				i_1131_ += i_1136_;
				i_1130_ = i_1184_;
				i_1139_ += i_1140_;
			    }
			} else {
			    int i_1192_ = (i_1127_ & 0xff0000) >> 16;
			    int i_1193_ = (i_1127_ & 0xff00) >> 8;
			    int i_1194_ = i_1127_ & 0xff;
			    for (int i_1195_ = -i_1125_; i_1195_ < 0;
				 i_1195_++) {
				int i_1196_ = (i_1131_ >> 16) * anInt8985;
				for (int i_1197_ = -i_1124_; i_1197_ < 0;
				     i_1197_++) {
				    int i_1198_
					= (anIntArray11404
					   [(i_1130_ >> 16) + i_1196_]);
				    int i_1199_
					= ((i_1198_ >>> 24) * (i_1127_ >>> 24)
					   >> 8);
				    int i_1200_ = 256 - i_1199_;
				    if (i_1199_ != 255) {
					int i_1201_
					    = ((i_1198_ & 0xff0000) * i_1192_
					       & ~0xffffff);
					int i_1202_
					    = ((i_1198_ & 0xff00) * i_1193_
					       & 0xff0000);
					int i_1203_
					    = ((i_1198_ & 0xff) * i_1194_
					       & 0xff00);
					i_1198_ = (i_1201_ | i_1202_
						   | i_1203_) >>> 8;
					int i_1204_ = is[i_1139_];
					is[i_1139_++]
					    = ((((i_1198_ & 0xff00ff) * i_1199_
						 + ((i_1204_ & 0xff00ff)
						    * i_1200_))
						& ~0xff00ff)
					       + (((i_1198_ & 0xff00) * i_1199_
						   + ((i_1204_ & 0xff00)
						      * i_1200_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_1205_
					    = ((i_1198_ & 0xff0000) * i_1192_
					       & ~0xffffff);
					int i_1206_
					    = ((i_1198_ & 0xff00) * i_1193_
					       & 0xff0000);
					int i_1207_
					    = ((i_1198_ & 0xff) * i_1194_
					       & 0xff00);
					is[i_1139_++] = (i_1205_ | i_1206_
							 | i_1207_) >>> 8;
				    }
				    i_1130_ += i_1135_;
				}
				i_1131_ += i_1136_;
				i_1130_ = i_1184_;
				i_1139_ += i_1140_;
			    }
			}
		    } else if (i_1126_ == 3) {
			int i_1208_ = i_1130_;
			for (int i_1209_ = -i_1125_; i_1209_ < 0; i_1209_++) {
			    int i_1210_ = (i_1131_ >> 16) * anInt8985;
			    for (int i_1211_ = -i_1124_; i_1211_ < 0;
				 i_1211_++) {
				int i_1212_ = (anIntArray11404
					       [(i_1130_ >> 16) + i_1210_]);
				int i_1213_ = i_1212_ + i_1127_;
				int i_1214_ = ((i_1212_ & 0xff00ff)
					       + (i_1127_ & 0xff00ff));
				int i_1215_
				    = ((i_1214_ & 0x1000100)
				       + (i_1213_ - i_1214_ & 0x10000));
				i_1215_
				    = i_1213_ - i_1215_ | i_1215_ - (i_1215_
								     >>> 8);
				int i_1216_
				    = (i_1215_ >>> 24) * (i_1127_ >>> 24) >> 8;
				int i_1217_ = 256 - i_1216_;
				if (i_1216_ != 255) {
				    i_1212_ = i_1215_;
				    i_1215_ = is[i_1139_];
				    i_1215_
					= ((((i_1212_ & 0xff00ff) * i_1216_
					     + (i_1215_ & 0xff00ff) * i_1217_)
					    & ~0xff00ff)
					   + (((i_1212_ & 0xff00) * i_1216_
					       + (i_1215_ & 0xff00) * i_1217_)
					      & 0xff0000)) >> 8;
				}
				is[i_1139_++] = i_1215_;
				i_1130_ += i_1135_;
			    }
			    i_1131_ += i_1136_;
			    i_1130_ = i_1208_;
			    i_1139_ += i_1140_;
			}
		    } else if (i_1126_ == 2) {
			int i_1218_ = i_1127_ >>> 24;
			int i_1219_ = 256 - i_1218_;
			int i_1220_
			    = (i_1127_ & 0xff00ff) * i_1219_ & ~0xff00ff;
			int i_1221_ = (i_1127_ & 0xff00) * i_1219_ & 0xff0000;
			i_1127_ = (i_1220_ | i_1221_) >>> 8;
			int i_1222_ = i_1130_;
			for (int i_1223_ = -i_1125_; i_1223_ < 0; i_1223_++) {
			    int i_1224_ = (i_1131_ >> 16) * anInt8985;
			    for (int i_1225_ = -i_1124_; i_1225_ < 0;
				 i_1225_++) {
				int i_1226_ = (anIntArray11404
					       [(i_1130_ >> 16) + i_1224_]);
				int i_1227_ = i_1226_ >>> 24;
				int i_1228_ = 256 - i_1227_;
				i_1220_ = ((i_1226_ & 0xff00ff) * i_1218_
					   & ~0xff00ff);
				i_1221_
				    = (i_1226_ & 0xff00) * i_1218_ & 0xff0000;
				i_1226_
				    = ((i_1220_ | i_1221_) >>> 8) + i_1127_;
				int i_1229_ = is[i_1139_];
				is[i_1139_++]
				    = ((((i_1226_ & 0xff00ff) * i_1227_
					 + (i_1229_ & 0xff00ff) * i_1228_)
					& ~0xff00ff)
				       + (((i_1226_ & 0xff00) * i_1227_
					   + (i_1229_ & 0xff00) * i_1228_)
					  & 0xff0000)) >> 8;
				i_1130_ += i_1135_;
			    }
			    i_1131_ += i_1136_;
			    i_1130_ = i_1222_;
			    i_1139_ += i_1140_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1128_ == 2) {
		    if (i_1126_ == 1) {
			int i_1230_ = i_1130_;
			for (int i_1231_ = -i_1125_; i_1231_ < 0; i_1231_++) {
			    int i_1232_ = (i_1131_ >> 16) * anInt8985;
			    for (int i_1233_ = -i_1124_; i_1233_ < 0;
				 i_1233_++) {
				int i_1234_ = (anIntArray11404
					       [(i_1130_ >> 16) + i_1232_]);
				if (i_1234_ != 0) {
				    int i_1235_ = is[i_1139_];
				    int i_1236_ = i_1234_ + i_1235_;
				    int i_1237_ = ((i_1234_ & 0xff00ff)
						   + (i_1235_ & 0xff00ff));
				    i_1235_
					= ((i_1237_ & 0x1000100)
					   + (i_1236_ - i_1237_ & 0x10000));
				    is[i_1139_++]
					= (i_1236_ - i_1235_
					   | i_1235_ - (i_1235_ >>> 8));
				} else
				    i_1139_++;
				i_1130_ += i_1135_;
			    }
			    i_1131_ += i_1136_;
			    i_1130_ = i_1230_;
			    i_1139_ += i_1140_;
			}
		    } else if (i_1126_ == 0) {
			int i_1238_ = i_1130_;
			int i_1239_ = (i_1127_ & 0xff0000) >> 16;
			int i_1240_ = (i_1127_ & 0xff00) >> 8;
			int i_1241_ = i_1127_ & 0xff;
			for (int i_1242_ = -i_1125_; i_1242_ < 0; i_1242_++) {
			    int i_1243_ = (i_1131_ >> 16) * anInt8985;
			    for (int i_1244_ = -i_1124_; i_1244_ < 0;
				 i_1244_++) {
				int i_1245_ = (anIntArray11404
					       [(i_1130_ >> 16) + i_1243_]);
				if (i_1245_ != 0) {
				    int i_1246_
					= ((i_1245_ & 0xff0000) * i_1239_
					   & ~0xffffff);
				    int i_1247_ = ((i_1245_ & 0xff00) * i_1240_
						   & 0xff0000);
				    int i_1248_
					= (i_1245_ & 0xff) * i_1241_ & 0xff00;
				    i_1245_
					= (i_1246_ | i_1247_ | i_1248_) >>> 8;
				    int i_1249_ = is[i_1139_];
				    int i_1250_ = i_1245_ + i_1249_;
				    int i_1251_ = ((i_1245_ & 0xff00ff)
						   + (i_1249_ & 0xff00ff));
				    i_1249_
					= ((i_1251_ & 0x1000100)
					   + (i_1250_ - i_1251_ & 0x10000));
				    is[i_1139_++]
					= (i_1250_ - i_1249_
					   | i_1249_ - (i_1249_ >>> 8));
				} else
				    i_1139_++;
				i_1130_ += i_1135_;
			    }
			    i_1131_ += i_1136_;
			    i_1130_ = i_1238_;
			    i_1139_ += i_1140_;
			}
		    } else if (i_1126_ == 3) {
			int i_1252_ = i_1130_;
			for (int i_1253_ = -i_1125_; i_1253_ < 0; i_1253_++) {
			    int i_1254_ = (i_1131_ >> 16) * anInt8985;
			    for (int i_1255_ = -i_1124_; i_1255_ < 0;
				 i_1255_++) {
				int i_1256_ = (anIntArray11404
					       [(i_1130_ >> 16) + i_1254_]);
				int i_1257_ = i_1256_ + i_1127_;
				int i_1258_ = ((i_1256_ & 0xff00ff)
					       + (i_1127_ & 0xff00ff));
				int i_1259_
				    = ((i_1258_ & 0x1000100)
				       + (i_1257_ - i_1258_ & 0x10000));
				i_1256_
				    = i_1257_ - i_1259_ | i_1259_ - (i_1259_
								     >>> 8);
				i_1259_ = is[i_1139_];
				i_1257_ = i_1256_ + i_1259_;
				i_1258_ = (i_1256_ & 0xff00ff) + (i_1259_
								  & 0xff00ff);
				i_1259_ = ((i_1258_ & 0x1000100)
					   + (i_1257_ - i_1258_ & 0x10000));
				is[i_1139_++]
				    = i_1257_ - i_1259_ | i_1259_ - (i_1259_
								     >>> 8);
				i_1130_ += i_1135_;
			    }
			    i_1131_ += i_1136_;
			    i_1130_ = i_1252_;
			    i_1139_ += i_1140_;
			}
		    } else if (i_1126_ == 2) {
			int i_1260_ = i_1127_ >>> 24;
			int i_1261_ = 256 - i_1260_;
			int i_1262_
			    = (i_1127_ & 0xff00ff) * i_1261_ & ~0xff00ff;
			int i_1263_ = (i_1127_ & 0xff00) * i_1261_ & 0xff0000;
			i_1127_ = (i_1262_ | i_1263_) >>> 8;
			int i_1264_ = i_1130_;
			for (int i_1265_ = -i_1125_; i_1265_ < 0; i_1265_++) {
			    int i_1266_ = (i_1131_ >> 16) * anInt8985;
			    for (int i_1267_ = -i_1124_; i_1267_ < 0;
				 i_1267_++) {
				int i_1268_ = (anIntArray11404
					       [(i_1130_ >> 16) + i_1266_]);
				if (i_1268_ != 0) {
				    i_1262_ = ((i_1268_ & 0xff00ff) * i_1260_
					       & ~0xff00ff);
				    i_1263_ = ((i_1268_ & 0xff00) * i_1260_
					       & 0xff0000);
				    i_1268_ = (((i_1262_ | i_1263_) >>> 8)
					       + i_1127_);
				    int i_1269_ = is[i_1139_];
				    int i_1270_ = i_1268_ + i_1269_;
				    int i_1271_ = ((i_1268_ & 0xff00ff)
						   + (i_1269_ & 0xff00ff));
				    i_1269_
					= ((i_1271_ & 0x1000100)
					   + (i_1270_ - i_1271_ & 0x10000));
				    is[i_1139_++]
					= (i_1270_ - i_1269_
					   | i_1269_ - (i_1269_ >>> 8));
				} else
				    i_1139_++;
				i_1130_ += i_1135_;
			    }
			    i_1131_ += i_1136_;
			    i_1130_ = i_1264_;
			    i_1139_ += i_1140_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method2702(int i, int i_1272_, int i_1273_, int i_1274_, int i_1275_,
		    int i_1276_, int i_1277_, int i_1278_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (i_1273_ > 0 && i_1274_ > 0) {
	    int[] is = aClass185_Sub2_9016.anIntArray9338;
	    if (is != null) {
		int i_1279_ = 0;
		int i_1280_ = 0;
		int i_1281_ = aClass185_Sub2_9016.anInt9356 * 356365251;
		int i_1282_ = anInt8987 + anInt8985 + anInt8992;
		int i_1283_ = anInt8989 + anInt9002 + anInt8990;
		int i_1284_ = (i_1282_ << 16) / i_1273_;
		int i_1285_ = (i_1283_ << 16) / i_1274_;
		if (anInt8987 > 0) {
		    int i_1286_ = ((anInt8987 << 16) + i_1284_ - 1) / i_1284_;
		    i += i_1286_;
		    i_1279_ += i_1286_ * i_1284_ - (anInt8987 << 16);
		}
		if (anInt8989 > 0) {
		    int i_1287_ = ((anInt8989 << 16) + i_1285_ - 1) / i_1285_;
		    i_1272_ += i_1287_;
		    i_1280_ += i_1287_ * i_1285_ - (anInt8989 << 16);
		}
		if (anInt8985 < i_1282_)
		    i_1273_ = (((anInt8985 << 16) - i_1279_ + i_1284_ - 1)
			       / i_1284_);
		if (anInt9002 < i_1283_)
		    i_1274_ = (((anInt9002 << 16) - i_1280_ + i_1285_ - 1)
			       / i_1285_);
		int i_1288_ = i + i_1272_ * i_1281_;
		int i_1289_ = i_1281_ - i_1273_;
		if (i_1272_ + i_1274_
		    > aClass185_Sub2_9016.anInt9345 * 639238427)
		    i_1274_ -= (i_1272_ + i_1274_
				- aClass185_Sub2_9016.anInt9345 * 639238427);
		if (i_1272_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		    int i_1290_
			= aClass185_Sub2_9016.anInt9344 * 9823353 - i_1272_;
		    i_1274_ -= i_1290_;
		    i_1288_ += i_1290_ * i_1281_;
		    i_1280_ += i_1285_ * i_1290_;
		}
		if (i + i_1273_
		    > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		    int i_1291_
			= (i + i_1273_
			   - aClass185_Sub2_9016.anInt9343 * -1807368365);
		    i_1273_ -= i_1291_;
		    i_1289_ += i_1291_;
		}
		if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		    int i_1292_
			= aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		    i_1273_ -= i_1292_;
		    i_1288_ += i_1292_;
		    i_1279_ += i_1284_ * i_1292_;
		    i_1289_ += i_1292_;
		}
		if (i_1277_ == 0) {
		    if (i_1275_ == 1) {
			int i_1293_ = i_1279_;
			for (int i_1294_ = -i_1274_; i_1294_ < 0; i_1294_++) {
			    int i_1295_ = (i_1280_ >> 16) * anInt8985;
			    for (int i_1296_ = -i_1273_; i_1296_ < 0;
				 i_1296_++) {
				is[i_1288_++] = (anIntArray11404
						 [(i_1279_ >> 16) + i_1295_]);
				i_1279_ += i_1284_;
			    }
			    i_1280_ += i_1285_;
			    i_1279_ = i_1293_;
			    i_1288_ += i_1289_;
			}
		    } else if (i_1275_ == 0) {
			int i_1297_ = (i_1276_ & 0xff0000) >> 16;
			int i_1298_ = (i_1276_ & 0xff00) >> 8;
			int i_1299_ = i_1276_ & 0xff;
			int i_1300_ = i_1279_;
			for (int i_1301_ = -i_1274_; i_1301_ < 0; i_1301_++) {
			    int i_1302_ = (i_1280_ >> 16) * anInt8985;
			    for (int i_1303_ = -i_1273_; i_1303_ < 0;
				 i_1303_++) {
				int i_1304_ = (anIntArray11404
					       [(i_1279_ >> 16) + i_1302_]);
				int i_1305_ = ((i_1304_ & 0xff0000) * i_1297_
					       & ~0xffffff);
				int i_1306_
				    = (i_1304_ & 0xff00) * i_1298_ & 0xff0000;
				int i_1307_
				    = (i_1304_ & 0xff) * i_1299_ & 0xff00;
				is[i_1288_++]
				    = (i_1305_ | i_1306_ | i_1307_) >>> 8;
				i_1279_ += i_1284_;
			    }
			    i_1280_ += i_1285_;
			    i_1279_ = i_1300_;
			    i_1288_ += i_1289_;
			}
		    } else if (i_1275_ == 3) {
			int i_1308_ = i_1279_;
			for (int i_1309_ = -i_1274_; i_1309_ < 0; i_1309_++) {
			    int i_1310_ = (i_1280_ >> 16) * anInt8985;
			    for (int i_1311_ = -i_1273_; i_1311_ < 0;
				 i_1311_++) {
				int i_1312_ = (anIntArray11404
					       [(i_1279_ >> 16) + i_1310_]);
				int i_1313_ = i_1312_ + i_1276_;
				int i_1314_ = ((i_1312_ & 0xff00ff)
					       + (i_1276_ & 0xff00ff));
				int i_1315_
				    = ((i_1314_ & 0x1000100)
				       + (i_1313_ - i_1314_ & 0x10000));
				is[i_1288_++]
				    = i_1313_ - i_1315_ | i_1315_ - (i_1315_
								     >>> 8);
				i_1279_ += i_1284_;
			    }
			    i_1280_ += i_1285_;
			    i_1279_ = i_1308_;
			    i_1288_ += i_1289_;
			}
		    } else if (i_1275_ == 2) {
			int i_1316_ = i_1276_ >>> 24;
			int i_1317_ = 256 - i_1316_;
			int i_1318_
			    = (i_1276_ & 0xff00ff) * i_1317_ & ~0xff00ff;
			int i_1319_ = (i_1276_ & 0xff00) * i_1317_ & 0xff0000;
			i_1276_ = (i_1318_ | i_1319_) >>> 8;
			int i_1320_ = i_1279_;
			for (int i_1321_ = -i_1274_; i_1321_ < 0; i_1321_++) {
			    int i_1322_ = (i_1280_ >> 16) * anInt8985;
			    for (int i_1323_ = -i_1273_; i_1323_ < 0;
				 i_1323_++) {
				int i_1324_ = (anIntArray11404
					       [(i_1279_ >> 16) + i_1322_]);
				i_1318_ = ((i_1324_ & 0xff00ff) * i_1316_
					   & ~0xff00ff);
				i_1319_
				    = (i_1324_ & 0xff00) * i_1316_ & 0xff0000;
				is[i_1288_++]
				    = ((i_1318_ | i_1319_) >>> 8) + i_1276_;
				i_1279_ += i_1284_;
			    }
			    i_1280_ += i_1285_;
			    i_1279_ = i_1320_;
			    i_1288_ += i_1289_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1277_ == 1) {
		    if (i_1275_ == 1) {
			int i_1325_ = i_1279_;
			for (int i_1326_ = -i_1274_; i_1326_ < 0; i_1326_++) {
			    int i_1327_ = (i_1280_ >> 16) * anInt8985;
			    for (int i_1328_ = -i_1273_; i_1328_ < 0;
				 i_1328_++) {
				int i_1329_ = (anIntArray11404
					       [(i_1279_ >> 16) + i_1327_]);
				int i_1330_ = i_1329_ >>> 24;
				int i_1331_ = 256 - i_1330_;
				int i_1332_ = is[i_1288_];
				is[i_1288_++]
				    = (((((i_1329_ & 0xff00ff) * i_1330_
					  + (i_1332_ & 0xff00ff) * i_1331_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_1329_ & ~0xff00ff) >>> 8)
					    * i_1330_)
					   + (((i_1332_ & ~0xff00ff) >>> 8)
					      * i_1331_))
					  & ~0xff00ff));
				i_1279_ += i_1284_;
			    }
			    i_1280_ += i_1285_;
			    i_1279_ = i_1325_;
			    i_1288_ += i_1289_;
			}
		    } else if (i_1275_ == 0) {
			int i_1333_ = i_1279_;
			if ((i_1276_ & 0xffffff) == 16777215) {
			    for (int i_1334_ = -i_1274_; i_1334_ < 0;
				 i_1334_++) {
				int i_1335_ = (i_1280_ >> 16) * anInt8985;
				for (int i_1336_ = -i_1273_; i_1336_ < 0;
				     i_1336_++) {
				    int i_1337_
					= (anIntArray11404
					   [(i_1279_ >> 16) + i_1335_]);
				    int i_1338_
					= ((i_1337_ >>> 24) * (i_1276_ >>> 24)
					   >> 8);
				    int i_1339_ = 256 - i_1338_;
				    int i_1340_ = is[i_1288_];
				    is[i_1288_++]
					= ((((i_1337_ & 0xff00ff) * i_1338_
					     + (i_1340_ & 0xff00ff) * i_1339_)
					    & ~0xff00ff)
					   + (((i_1337_ & 0xff00) * i_1338_
					       + (i_1340_ & 0xff00) * i_1339_)
					      & 0xff0000)) >> 8;
				    i_1279_ += i_1284_;
				}
				i_1280_ += i_1285_;
				i_1279_ = i_1333_;
				i_1288_ += i_1289_;
			    }
			} else {
			    int i_1341_ = (i_1276_ & 0xff0000) >> 16;
			    int i_1342_ = (i_1276_ & 0xff00) >> 8;
			    int i_1343_ = i_1276_ & 0xff;
			    for (int i_1344_ = -i_1274_; i_1344_ < 0;
				 i_1344_++) {
				int i_1345_ = (i_1280_ >> 16) * anInt8985;
				for (int i_1346_ = -i_1273_; i_1346_ < 0;
				     i_1346_++) {
				    int i_1347_
					= (anIntArray11404
					   [(i_1279_ >> 16) + i_1345_]);
				    int i_1348_
					= ((i_1347_ >>> 24) * (i_1276_ >>> 24)
					   >> 8);
				    int i_1349_ = 256 - i_1348_;
				    if (i_1348_ != 255) {
					int i_1350_
					    = ((i_1347_ & 0xff0000) * i_1341_
					       & ~0xffffff);
					int i_1351_
					    = ((i_1347_ & 0xff00) * i_1342_
					       & 0xff0000);
					int i_1352_
					    = ((i_1347_ & 0xff) * i_1343_
					       & 0xff00);
					i_1347_ = (i_1350_ | i_1351_
						   | i_1352_) >>> 8;
					int i_1353_ = is[i_1288_];
					is[i_1288_++]
					    = ((((i_1347_ & 0xff00ff) * i_1348_
						 + ((i_1353_ & 0xff00ff)
						    * i_1349_))
						& ~0xff00ff)
					       + (((i_1347_ & 0xff00) * i_1348_
						   + ((i_1353_ & 0xff00)
						      * i_1349_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_1354_
					    = ((i_1347_ & 0xff0000) * i_1341_
					       & ~0xffffff);
					int i_1355_
					    = ((i_1347_ & 0xff00) * i_1342_
					       & 0xff0000);
					int i_1356_
					    = ((i_1347_ & 0xff) * i_1343_
					       & 0xff00);
					is[i_1288_++] = (i_1354_ | i_1355_
							 | i_1356_) >>> 8;
				    }
				    i_1279_ += i_1284_;
				}
				i_1280_ += i_1285_;
				i_1279_ = i_1333_;
				i_1288_ += i_1289_;
			    }
			}
		    } else if (i_1275_ == 3) {
			int i_1357_ = i_1279_;
			for (int i_1358_ = -i_1274_; i_1358_ < 0; i_1358_++) {
			    int i_1359_ = (i_1280_ >> 16) * anInt8985;
			    for (int i_1360_ = -i_1273_; i_1360_ < 0;
				 i_1360_++) {
				int i_1361_ = (anIntArray11404
					       [(i_1279_ >> 16) + i_1359_]);
				int i_1362_ = i_1361_ + i_1276_;
				int i_1363_ = ((i_1361_ & 0xff00ff)
					       + (i_1276_ & 0xff00ff));
				int i_1364_
				    = ((i_1363_ & 0x1000100)
				       + (i_1362_ - i_1363_ & 0x10000));
				i_1364_
				    = i_1362_ - i_1364_ | i_1364_ - (i_1364_
								     >>> 8);
				int i_1365_
				    = (i_1364_ >>> 24) * (i_1276_ >>> 24) >> 8;
				int i_1366_ = 256 - i_1365_;
				if (i_1365_ != 255) {
				    i_1361_ = i_1364_;
				    i_1364_ = is[i_1288_];
				    i_1364_
					= ((((i_1361_ & 0xff00ff) * i_1365_
					     + (i_1364_ & 0xff00ff) * i_1366_)
					    & ~0xff00ff)
					   + (((i_1361_ & 0xff00) * i_1365_
					       + (i_1364_ & 0xff00) * i_1366_)
					      & 0xff0000)) >> 8;
				}
				is[i_1288_++] = i_1364_;
				i_1279_ += i_1284_;
			    }
			    i_1280_ += i_1285_;
			    i_1279_ = i_1357_;
			    i_1288_ += i_1289_;
			}
		    } else if (i_1275_ == 2) {
			int i_1367_ = i_1276_ >>> 24;
			int i_1368_ = 256 - i_1367_;
			int i_1369_
			    = (i_1276_ & 0xff00ff) * i_1368_ & ~0xff00ff;
			int i_1370_ = (i_1276_ & 0xff00) * i_1368_ & 0xff0000;
			i_1276_ = (i_1369_ | i_1370_) >>> 8;
			int i_1371_ = i_1279_;
			for (int i_1372_ = -i_1274_; i_1372_ < 0; i_1372_++) {
			    int i_1373_ = (i_1280_ >> 16) * anInt8985;
			    for (int i_1374_ = -i_1273_; i_1374_ < 0;
				 i_1374_++) {
				int i_1375_ = (anIntArray11404
					       [(i_1279_ >> 16) + i_1373_]);
				int i_1376_ = i_1375_ >>> 24;
				int i_1377_ = 256 - i_1376_;
				i_1369_ = ((i_1375_ & 0xff00ff) * i_1367_
					   & ~0xff00ff);
				i_1370_
				    = (i_1375_ & 0xff00) * i_1367_ & 0xff0000;
				i_1375_
				    = ((i_1369_ | i_1370_) >>> 8) + i_1276_;
				int i_1378_ = is[i_1288_];
				is[i_1288_++]
				    = ((((i_1375_ & 0xff00ff) * i_1376_
					 + (i_1378_ & 0xff00ff) * i_1377_)
					& ~0xff00ff)
				       + (((i_1375_ & 0xff00) * i_1376_
					   + (i_1378_ & 0xff00) * i_1377_)
					  & 0xff0000)) >> 8;
				i_1279_ += i_1284_;
			    }
			    i_1280_ += i_1285_;
			    i_1279_ = i_1371_;
			    i_1288_ += i_1289_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1277_ == 2) {
		    if (i_1275_ == 1) {
			int i_1379_ = i_1279_;
			for (int i_1380_ = -i_1274_; i_1380_ < 0; i_1380_++) {
			    int i_1381_ = (i_1280_ >> 16) * anInt8985;
			    for (int i_1382_ = -i_1273_; i_1382_ < 0;
				 i_1382_++) {
				int i_1383_ = (anIntArray11404
					       [(i_1279_ >> 16) + i_1381_]);
				if (i_1383_ != 0) {
				    int i_1384_ = is[i_1288_];
				    int i_1385_ = i_1383_ + i_1384_;
				    int i_1386_ = ((i_1383_ & 0xff00ff)
						   + (i_1384_ & 0xff00ff));
				    i_1384_
					= ((i_1386_ & 0x1000100)
					   + (i_1385_ - i_1386_ & 0x10000));
				    is[i_1288_++]
					= (i_1385_ - i_1384_
					   | i_1384_ - (i_1384_ >>> 8));
				} else
				    i_1288_++;
				i_1279_ += i_1284_;
			    }
			    i_1280_ += i_1285_;
			    i_1279_ = i_1379_;
			    i_1288_ += i_1289_;
			}
		    } else if (i_1275_ == 0) {
			int i_1387_ = i_1279_;
			int i_1388_ = (i_1276_ & 0xff0000) >> 16;
			int i_1389_ = (i_1276_ & 0xff00) >> 8;
			int i_1390_ = i_1276_ & 0xff;
			for (int i_1391_ = -i_1274_; i_1391_ < 0; i_1391_++) {
			    int i_1392_ = (i_1280_ >> 16) * anInt8985;
			    for (int i_1393_ = -i_1273_; i_1393_ < 0;
				 i_1393_++) {
				int i_1394_ = (anIntArray11404
					       [(i_1279_ >> 16) + i_1392_]);
				if (i_1394_ != 0) {
				    int i_1395_
					= ((i_1394_ & 0xff0000) * i_1388_
					   & ~0xffffff);
				    int i_1396_ = ((i_1394_ & 0xff00) * i_1389_
						   & 0xff0000);
				    int i_1397_
					= (i_1394_ & 0xff) * i_1390_ & 0xff00;
				    i_1394_
					= (i_1395_ | i_1396_ | i_1397_) >>> 8;
				    int i_1398_ = is[i_1288_];
				    int i_1399_ = i_1394_ + i_1398_;
				    int i_1400_ = ((i_1394_ & 0xff00ff)
						   + (i_1398_ & 0xff00ff));
				    i_1398_
					= ((i_1400_ & 0x1000100)
					   + (i_1399_ - i_1400_ & 0x10000));
				    is[i_1288_++]
					= (i_1399_ - i_1398_
					   | i_1398_ - (i_1398_ >>> 8));
				} else
				    i_1288_++;
				i_1279_ += i_1284_;
			    }
			    i_1280_ += i_1285_;
			    i_1279_ = i_1387_;
			    i_1288_ += i_1289_;
			}
		    } else if (i_1275_ == 3) {
			int i_1401_ = i_1279_;
			for (int i_1402_ = -i_1274_; i_1402_ < 0; i_1402_++) {
			    int i_1403_ = (i_1280_ >> 16) * anInt8985;
			    for (int i_1404_ = -i_1273_; i_1404_ < 0;
				 i_1404_++) {
				int i_1405_ = (anIntArray11404
					       [(i_1279_ >> 16) + i_1403_]);
				int i_1406_ = i_1405_ + i_1276_;
				int i_1407_ = ((i_1405_ & 0xff00ff)
					       + (i_1276_ & 0xff00ff));
				int i_1408_
				    = ((i_1407_ & 0x1000100)
				       + (i_1406_ - i_1407_ & 0x10000));
				i_1405_
				    = i_1406_ - i_1408_ | i_1408_ - (i_1408_
								     >>> 8);
				i_1408_ = is[i_1288_];
				i_1406_ = i_1405_ + i_1408_;
				i_1407_ = (i_1405_ & 0xff00ff) + (i_1408_
								  & 0xff00ff);
				i_1408_ = ((i_1407_ & 0x1000100)
					   + (i_1406_ - i_1407_ & 0x10000));
				is[i_1288_++]
				    = i_1406_ - i_1408_ | i_1408_ - (i_1408_
								     >>> 8);
				i_1279_ += i_1284_;
			    }
			    i_1280_ += i_1285_;
			    i_1279_ = i_1401_;
			    i_1288_ += i_1289_;
			}
		    } else if (i_1275_ == 2) {
			int i_1409_ = i_1276_ >>> 24;
			int i_1410_ = 256 - i_1409_;
			int i_1411_
			    = (i_1276_ & 0xff00ff) * i_1410_ & ~0xff00ff;
			int i_1412_ = (i_1276_ & 0xff00) * i_1410_ & 0xff0000;
			i_1276_ = (i_1411_ | i_1412_) >>> 8;
			int i_1413_ = i_1279_;
			for (int i_1414_ = -i_1274_; i_1414_ < 0; i_1414_++) {
			    int i_1415_ = (i_1280_ >> 16) * anInt8985;
			    for (int i_1416_ = -i_1273_; i_1416_ < 0;
				 i_1416_++) {
				int i_1417_ = (anIntArray11404
					       [(i_1279_ >> 16) + i_1415_]);
				if (i_1417_ != 0) {
				    i_1411_ = ((i_1417_ & 0xff00ff) * i_1409_
					       & ~0xff00ff);
				    i_1412_ = ((i_1417_ & 0xff00) * i_1409_
					       & 0xff0000);
				    i_1417_ = (((i_1411_ | i_1412_) >>> 8)
					       + i_1276_);
				    int i_1418_ = is[i_1288_];
				    int i_1419_ = i_1417_ + i_1418_;
				    int i_1420_ = ((i_1417_ & 0xff00ff)
						   + (i_1418_ & 0xff00ff));
				    i_1418_
					= ((i_1420_ & 0x1000100)
					   + (i_1419_ - i_1420_ & 0x10000));
				    is[i_1288_++]
					= (i_1419_ - i_1418_
					   | i_1418_ - (i_1418_ >>> 8));
				} else
				    i_1288_++;
				i_1279_ += i_1284_;
			    }
			    i_1280_ += i_1285_;
			    i_1279_ = i_1413_;
			    i_1288_ += i_1289_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method2718(int i, int i_1421_, int i_1422_, int i_1423_, int i_1424_,
		    int i_1425_, int i_1426_, int i_1427_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	if (i_1422_ > 0 && i_1423_ > 0) {
	    int[] is = aClass185_Sub2_9016.anIntArray9338;
	    if (is != null) {
		int i_1428_ = 0;
		int i_1429_ = 0;
		int i_1430_ = aClass185_Sub2_9016.anInt9356 * 356365251;
		int i_1431_ = anInt8987 + anInt8985 + anInt8992;
		int i_1432_ = anInt8989 + anInt9002 + anInt8990;
		int i_1433_ = (i_1431_ << 16) / i_1422_;
		int i_1434_ = (i_1432_ << 16) / i_1423_;
		if (anInt8987 > 0) {
		    int i_1435_ = ((anInt8987 << 16) + i_1433_ - 1) / i_1433_;
		    i += i_1435_;
		    i_1428_ += i_1435_ * i_1433_ - (anInt8987 << 16);
		}
		if (anInt8989 > 0) {
		    int i_1436_ = ((anInt8989 << 16) + i_1434_ - 1) / i_1434_;
		    i_1421_ += i_1436_;
		    i_1429_ += i_1436_ * i_1434_ - (anInt8989 << 16);
		}
		if (anInt8985 < i_1431_)
		    i_1422_ = (((anInt8985 << 16) - i_1428_ + i_1433_ - 1)
			       / i_1433_);
		if (anInt9002 < i_1432_)
		    i_1423_ = (((anInt9002 << 16) - i_1429_ + i_1434_ - 1)
			       / i_1434_);
		int i_1437_ = i + i_1421_ * i_1430_;
		int i_1438_ = i_1430_ - i_1422_;
		if (i_1421_ + i_1423_
		    > aClass185_Sub2_9016.anInt9345 * 639238427)
		    i_1423_ -= (i_1421_ + i_1423_
				- aClass185_Sub2_9016.anInt9345 * 639238427);
		if (i_1421_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		    int i_1439_
			= aClass185_Sub2_9016.anInt9344 * 9823353 - i_1421_;
		    i_1423_ -= i_1439_;
		    i_1437_ += i_1439_ * i_1430_;
		    i_1429_ += i_1434_ * i_1439_;
		}
		if (i + i_1422_
		    > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		    int i_1440_
			= (i + i_1422_
			   - aClass185_Sub2_9016.anInt9343 * -1807368365);
		    i_1422_ -= i_1440_;
		    i_1438_ += i_1440_;
		}
		if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		    int i_1441_
			= aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		    i_1422_ -= i_1441_;
		    i_1437_ += i_1441_;
		    i_1428_ += i_1433_ * i_1441_;
		    i_1438_ += i_1441_;
		}
		if (i_1426_ == 0) {
		    if (i_1424_ == 1) {
			int i_1442_ = i_1428_;
			for (int i_1443_ = -i_1423_; i_1443_ < 0; i_1443_++) {
			    int i_1444_ = (i_1429_ >> 16) * anInt8985;
			    for (int i_1445_ = -i_1422_; i_1445_ < 0;
				 i_1445_++) {
				is[i_1437_++] = (anIntArray11404
						 [(i_1428_ >> 16) + i_1444_]);
				i_1428_ += i_1433_;
			    }
			    i_1429_ += i_1434_;
			    i_1428_ = i_1442_;
			    i_1437_ += i_1438_;
			}
		    } else if (i_1424_ == 0) {
			int i_1446_ = (i_1425_ & 0xff0000) >> 16;
			int i_1447_ = (i_1425_ & 0xff00) >> 8;
			int i_1448_ = i_1425_ & 0xff;
			int i_1449_ = i_1428_;
			for (int i_1450_ = -i_1423_; i_1450_ < 0; i_1450_++) {
			    int i_1451_ = (i_1429_ >> 16) * anInt8985;
			    for (int i_1452_ = -i_1422_; i_1452_ < 0;
				 i_1452_++) {
				int i_1453_ = (anIntArray11404
					       [(i_1428_ >> 16) + i_1451_]);
				int i_1454_ = ((i_1453_ & 0xff0000) * i_1446_
					       & ~0xffffff);
				int i_1455_
				    = (i_1453_ & 0xff00) * i_1447_ & 0xff0000;
				int i_1456_
				    = (i_1453_ & 0xff) * i_1448_ & 0xff00;
				is[i_1437_++]
				    = (i_1454_ | i_1455_ | i_1456_) >>> 8;
				i_1428_ += i_1433_;
			    }
			    i_1429_ += i_1434_;
			    i_1428_ = i_1449_;
			    i_1437_ += i_1438_;
			}
		    } else if (i_1424_ == 3) {
			int i_1457_ = i_1428_;
			for (int i_1458_ = -i_1423_; i_1458_ < 0; i_1458_++) {
			    int i_1459_ = (i_1429_ >> 16) * anInt8985;
			    for (int i_1460_ = -i_1422_; i_1460_ < 0;
				 i_1460_++) {
				int i_1461_ = (anIntArray11404
					       [(i_1428_ >> 16) + i_1459_]);
				int i_1462_ = i_1461_ + i_1425_;
				int i_1463_ = ((i_1461_ & 0xff00ff)
					       + (i_1425_ & 0xff00ff));
				int i_1464_
				    = ((i_1463_ & 0x1000100)
				       + (i_1462_ - i_1463_ & 0x10000));
				is[i_1437_++]
				    = i_1462_ - i_1464_ | i_1464_ - (i_1464_
								     >>> 8);
				i_1428_ += i_1433_;
			    }
			    i_1429_ += i_1434_;
			    i_1428_ = i_1457_;
			    i_1437_ += i_1438_;
			}
		    } else if (i_1424_ == 2) {
			int i_1465_ = i_1425_ >>> 24;
			int i_1466_ = 256 - i_1465_;
			int i_1467_
			    = (i_1425_ & 0xff00ff) * i_1466_ & ~0xff00ff;
			int i_1468_ = (i_1425_ & 0xff00) * i_1466_ & 0xff0000;
			i_1425_ = (i_1467_ | i_1468_) >>> 8;
			int i_1469_ = i_1428_;
			for (int i_1470_ = -i_1423_; i_1470_ < 0; i_1470_++) {
			    int i_1471_ = (i_1429_ >> 16) * anInt8985;
			    for (int i_1472_ = -i_1422_; i_1472_ < 0;
				 i_1472_++) {
				int i_1473_ = (anIntArray11404
					       [(i_1428_ >> 16) + i_1471_]);
				i_1467_ = ((i_1473_ & 0xff00ff) * i_1465_
					   & ~0xff00ff);
				i_1468_
				    = (i_1473_ & 0xff00) * i_1465_ & 0xff0000;
				is[i_1437_++]
				    = ((i_1467_ | i_1468_) >>> 8) + i_1425_;
				i_1428_ += i_1433_;
			    }
			    i_1429_ += i_1434_;
			    i_1428_ = i_1469_;
			    i_1437_ += i_1438_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1426_ == 1) {
		    if (i_1424_ == 1) {
			int i_1474_ = i_1428_;
			for (int i_1475_ = -i_1423_; i_1475_ < 0; i_1475_++) {
			    int i_1476_ = (i_1429_ >> 16) * anInt8985;
			    for (int i_1477_ = -i_1422_; i_1477_ < 0;
				 i_1477_++) {
				int i_1478_ = (anIntArray11404
					       [(i_1428_ >> 16) + i_1476_]);
				int i_1479_ = i_1478_ >>> 24;
				int i_1480_ = 256 - i_1479_;
				int i_1481_ = is[i_1437_];
				is[i_1437_++]
				    = (((((i_1478_ & 0xff00ff) * i_1479_
					  + (i_1481_ & 0xff00ff) * i_1480_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_1478_ & ~0xff00ff) >>> 8)
					    * i_1479_)
					   + (((i_1481_ & ~0xff00ff) >>> 8)
					      * i_1480_))
					  & ~0xff00ff));
				i_1428_ += i_1433_;
			    }
			    i_1429_ += i_1434_;
			    i_1428_ = i_1474_;
			    i_1437_ += i_1438_;
			}
		    } else if (i_1424_ == 0) {
			int i_1482_ = i_1428_;
			if ((i_1425_ & 0xffffff) == 16777215) {
			    for (int i_1483_ = -i_1423_; i_1483_ < 0;
				 i_1483_++) {
				int i_1484_ = (i_1429_ >> 16) * anInt8985;
				for (int i_1485_ = -i_1422_; i_1485_ < 0;
				     i_1485_++) {
				    int i_1486_
					= (anIntArray11404
					   [(i_1428_ >> 16) + i_1484_]);
				    int i_1487_
					= ((i_1486_ >>> 24) * (i_1425_ >>> 24)
					   >> 8);
				    int i_1488_ = 256 - i_1487_;
				    int i_1489_ = is[i_1437_];
				    is[i_1437_++]
					= ((((i_1486_ & 0xff00ff) * i_1487_
					     + (i_1489_ & 0xff00ff) * i_1488_)
					    & ~0xff00ff)
					   + (((i_1486_ & 0xff00) * i_1487_
					       + (i_1489_ & 0xff00) * i_1488_)
					      & 0xff0000)) >> 8;
				    i_1428_ += i_1433_;
				}
				i_1429_ += i_1434_;
				i_1428_ = i_1482_;
				i_1437_ += i_1438_;
			    }
			} else {
			    int i_1490_ = (i_1425_ & 0xff0000) >> 16;
			    int i_1491_ = (i_1425_ & 0xff00) >> 8;
			    int i_1492_ = i_1425_ & 0xff;
			    for (int i_1493_ = -i_1423_; i_1493_ < 0;
				 i_1493_++) {
				int i_1494_ = (i_1429_ >> 16) * anInt8985;
				for (int i_1495_ = -i_1422_; i_1495_ < 0;
				     i_1495_++) {
				    int i_1496_
					= (anIntArray11404
					   [(i_1428_ >> 16) + i_1494_]);
				    int i_1497_
					= ((i_1496_ >>> 24) * (i_1425_ >>> 24)
					   >> 8);
				    int i_1498_ = 256 - i_1497_;
				    if (i_1497_ != 255) {
					int i_1499_
					    = ((i_1496_ & 0xff0000) * i_1490_
					       & ~0xffffff);
					int i_1500_
					    = ((i_1496_ & 0xff00) * i_1491_
					       & 0xff0000);
					int i_1501_
					    = ((i_1496_ & 0xff) * i_1492_
					       & 0xff00);
					i_1496_ = (i_1499_ | i_1500_
						   | i_1501_) >>> 8;
					int i_1502_ = is[i_1437_];
					is[i_1437_++]
					    = ((((i_1496_ & 0xff00ff) * i_1497_
						 + ((i_1502_ & 0xff00ff)
						    * i_1498_))
						& ~0xff00ff)
					       + (((i_1496_ & 0xff00) * i_1497_
						   + ((i_1502_ & 0xff00)
						      * i_1498_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_1503_
					    = ((i_1496_ & 0xff0000) * i_1490_
					       & ~0xffffff);
					int i_1504_
					    = ((i_1496_ & 0xff00) * i_1491_
					       & 0xff0000);
					int i_1505_
					    = ((i_1496_ & 0xff) * i_1492_
					       & 0xff00);
					is[i_1437_++] = (i_1503_ | i_1504_
							 | i_1505_) >>> 8;
				    }
				    i_1428_ += i_1433_;
				}
				i_1429_ += i_1434_;
				i_1428_ = i_1482_;
				i_1437_ += i_1438_;
			    }
			}
		    } else if (i_1424_ == 3) {
			int i_1506_ = i_1428_;
			for (int i_1507_ = -i_1423_; i_1507_ < 0; i_1507_++) {
			    int i_1508_ = (i_1429_ >> 16) * anInt8985;
			    for (int i_1509_ = -i_1422_; i_1509_ < 0;
				 i_1509_++) {
				int i_1510_ = (anIntArray11404
					       [(i_1428_ >> 16) + i_1508_]);
				int i_1511_ = i_1510_ + i_1425_;
				int i_1512_ = ((i_1510_ & 0xff00ff)
					       + (i_1425_ & 0xff00ff));
				int i_1513_
				    = ((i_1512_ & 0x1000100)
				       + (i_1511_ - i_1512_ & 0x10000));
				i_1513_
				    = i_1511_ - i_1513_ | i_1513_ - (i_1513_
								     >>> 8);
				int i_1514_
				    = (i_1513_ >>> 24) * (i_1425_ >>> 24) >> 8;
				int i_1515_ = 256 - i_1514_;
				if (i_1514_ != 255) {
				    i_1510_ = i_1513_;
				    i_1513_ = is[i_1437_];
				    i_1513_
					= ((((i_1510_ & 0xff00ff) * i_1514_
					     + (i_1513_ & 0xff00ff) * i_1515_)
					    & ~0xff00ff)
					   + (((i_1510_ & 0xff00) * i_1514_
					       + (i_1513_ & 0xff00) * i_1515_)
					      & 0xff0000)) >> 8;
				}
				is[i_1437_++] = i_1513_;
				i_1428_ += i_1433_;
			    }
			    i_1429_ += i_1434_;
			    i_1428_ = i_1506_;
			    i_1437_ += i_1438_;
			}
		    } else if (i_1424_ == 2) {
			int i_1516_ = i_1425_ >>> 24;
			int i_1517_ = 256 - i_1516_;
			int i_1518_
			    = (i_1425_ & 0xff00ff) * i_1517_ & ~0xff00ff;
			int i_1519_ = (i_1425_ & 0xff00) * i_1517_ & 0xff0000;
			i_1425_ = (i_1518_ | i_1519_) >>> 8;
			int i_1520_ = i_1428_;
			for (int i_1521_ = -i_1423_; i_1521_ < 0; i_1521_++) {
			    int i_1522_ = (i_1429_ >> 16) * anInt8985;
			    for (int i_1523_ = -i_1422_; i_1523_ < 0;
				 i_1523_++) {
				int i_1524_ = (anIntArray11404
					       [(i_1428_ >> 16) + i_1522_]);
				int i_1525_ = i_1524_ >>> 24;
				int i_1526_ = 256 - i_1525_;
				i_1518_ = ((i_1524_ & 0xff00ff) * i_1516_
					   & ~0xff00ff);
				i_1519_
				    = (i_1524_ & 0xff00) * i_1516_ & 0xff0000;
				i_1524_
				    = ((i_1518_ | i_1519_) >>> 8) + i_1425_;
				int i_1527_ = is[i_1437_];
				is[i_1437_++]
				    = ((((i_1524_ & 0xff00ff) * i_1525_
					 + (i_1527_ & 0xff00ff) * i_1526_)
					& ~0xff00ff)
				       + (((i_1524_ & 0xff00) * i_1525_
					   + (i_1527_ & 0xff00) * i_1526_)
					  & 0xff0000)) >> 8;
				i_1428_ += i_1433_;
			    }
			    i_1429_ += i_1434_;
			    i_1428_ = i_1520_;
			    i_1437_ += i_1438_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1426_ == 2) {
		    if (i_1424_ == 1) {
			int i_1528_ = i_1428_;
			for (int i_1529_ = -i_1423_; i_1529_ < 0; i_1529_++) {
			    int i_1530_ = (i_1429_ >> 16) * anInt8985;
			    for (int i_1531_ = -i_1422_; i_1531_ < 0;
				 i_1531_++) {
				int i_1532_ = (anIntArray11404
					       [(i_1428_ >> 16) + i_1530_]);
				if (i_1532_ != 0) {
				    int i_1533_ = is[i_1437_];
				    int i_1534_ = i_1532_ + i_1533_;
				    int i_1535_ = ((i_1532_ & 0xff00ff)
						   + (i_1533_ & 0xff00ff));
				    i_1533_
					= ((i_1535_ & 0x1000100)
					   + (i_1534_ - i_1535_ & 0x10000));
				    is[i_1437_++]
					= (i_1534_ - i_1533_
					   | i_1533_ - (i_1533_ >>> 8));
				} else
				    i_1437_++;
				i_1428_ += i_1433_;
			    }
			    i_1429_ += i_1434_;
			    i_1428_ = i_1528_;
			    i_1437_ += i_1438_;
			}
		    } else if (i_1424_ == 0) {
			int i_1536_ = i_1428_;
			int i_1537_ = (i_1425_ & 0xff0000) >> 16;
			int i_1538_ = (i_1425_ & 0xff00) >> 8;
			int i_1539_ = i_1425_ & 0xff;
			for (int i_1540_ = -i_1423_; i_1540_ < 0; i_1540_++) {
			    int i_1541_ = (i_1429_ >> 16) * anInt8985;
			    for (int i_1542_ = -i_1422_; i_1542_ < 0;
				 i_1542_++) {
				int i_1543_ = (anIntArray11404
					       [(i_1428_ >> 16) + i_1541_]);
				if (i_1543_ != 0) {
				    int i_1544_
					= ((i_1543_ & 0xff0000) * i_1537_
					   & ~0xffffff);
				    int i_1545_ = ((i_1543_ & 0xff00) * i_1538_
						   & 0xff0000);
				    int i_1546_
					= (i_1543_ & 0xff) * i_1539_ & 0xff00;
				    i_1543_
					= (i_1544_ | i_1545_ | i_1546_) >>> 8;
				    int i_1547_ = is[i_1437_];
				    int i_1548_ = i_1543_ + i_1547_;
				    int i_1549_ = ((i_1543_ & 0xff00ff)
						   + (i_1547_ & 0xff00ff));
				    i_1547_
					= ((i_1549_ & 0x1000100)
					   + (i_1548_ - i_1549_ & 0x10000));
				    is[i_1437_++]
					= (i_1548_ - i_1547_
					   | i_1547_ - (i_1547_ >>> 8));
				} else
				    i_1437_++;
				i_1428_ += i_1433_;
			    }
			    i_1429_ += i_1434_;
			    i_1428_ = i_1536_;
			    i_1437_ += i_1438_;
			}
		    } else if (i_1424_ == 3) {
			int i_1550_ = i_1428_;
			for (int i_1551_ = -i_1423_; i_1551_ < 0; i_1551_++) {
			    int i_1552_ = (i_1429_ >> 16) * anInt8985;
			    for (int i_1553_ = -i_1422_; i_1553_ < 0;
				 i_1553_++) {
				int i_1554_ = (anIntArray11404
					       [(i_1428_ >> 16) + i_1552_]);
				int i_1555_ = i_1554_ + i_1425_;
				int i_1556_ = ((i_1554_ & 0xff00ff)
					       + (i_1425_ & 0xff00ff));
				int i_1557_
				    = ((i_1556_ & 0x1000100)
				       + (i_1555_ - i_1556_ & 0x10000));
				i_1554_
				    = i_1555_ - i_1557_ | i_1557_ - (i_1557_
								     >>> 8);
				i_1557_ = is[i_1437_];
				i_1555_ = i_1554_ + i_1557_;
				i_1556_ = (i_1554_ & 0xff00ff) + (i_1557_
								  & 0xff00ff);
				i_1557_ = ((i_1556_ & 0x1000100)
					   + (i_1555_ - i_1556_ & 0x10000));
				is[i_1437_++]
				    = i_1555_ - i_1557_ | i_1557_ - (i_1557_
								     >>> 8);
				i_1428_ += i_1433_;
			    }
			    i_1429_ += i_1434_;
			    i_1428_ = i_1550_;
			    i_1437_ += i_1438_;
			}
		    } else if (i_1424_ == 2) {
			int i_1558_ = i_1425_ >>> 24;
			int i_1559_ = 256 - i_1558_;
			int i_1560_
			    = (i_1425_ & 0xff00ff) * i_1559_ & ~0xff00ff;
			int i_1561_ = (i_1425_ & 0xff00) * i_1559_ & 0xff0000;
			i_1425_ = (i_1560_ | i_1561_) >>> 8;
			int i_1562_ = i_1428_;
			for (int i_1563_ = -i_1423_; i_1563_ < 0; i_1563_++) {
			    int i_1564_ = (i_1429_ >> 16) * anInt8985;
			    for (int i_1565_ = -i_1422_; i_1565_ < 0;
				 i_1565_++) {
				int i_1566_ = (anIntArray11404
					       [(i_1428_ >> 16) + i_1564_]);
				if (i_1566_ != 0) {
				    i_1560_ = ((i_1566_ & 0xff00ff) * i_1558_
					       & ~0xff00ff);
				    i_1561_ = ((i_1566_ & 0xff00) * i_1558_
					       & 0xff0000);
				    i_1566_ = (((i_1560_ | i_1561_) >>> 8)
					       + i_1425_);
				    int i_1567_ = is[i_1437_];
				    int i_1568_ = i_1566_ + i_1567_;
				    int i_1569_ = ((i_1566_ & 0xff00ff)
						   + (i_1567_ & 0xff00ff));
				    i_1567_
					= ((i_1569_ & 0x1000100)
					   + (i_1568_ - i_1569_ & 0x10000));
				    is[i_1437_++]
					= (i_1568_ - i_1567_
					   | i_1567_ - (i_1567_ >>> 8));
				} else
				    i_1437_++;
				i_1428_ += i_1433_;
			    }
			    i_1429_ += i_1434_;
			    i_1428_ = i_1562_;
			    i_1437_ += i_1438_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method14513(boolean bool, boolean bool_1570_, boolean bool_1571_,
		     int i, int i_1572_, float f, int i_1573_, int i_1574_,
		     int i_1575_, int i_1576_, int i_1577_, int i_1578_,
		     boolean bool_1579_) {
	if (i_1573_ > 0 && i_1574_ > 0 && (bool || bool_1570_)) {
	    int i_1580_ = 0;
	    int i_1581_ = 0;
	    int i_1582_ = anInt8987 + anInt8985 + anInt8992;
	    int i_1583_ = anInt8989 + anInt9002 + anInt8990;
	    int i_1584_ = (i_1582_ << 16) / i_1573_;
	    int i_1585_ = (i_1583_ << 16) / i_1574_;
	    if (anInt8987 > 0) {
		int i_1586_ = ((anInt8987 << 16) + i_1584_ - 1) / i_1584_;
		i += i_1586_;
		i_1580_ += i_1586_ * i_1584_ - (anInt8987 << 16);
	    }
	    if (anInt8989 > 0) {
		int i_1587_ = ((anInt8989 << 16) + i_1585_ - 1) / i_1585_;
		i_1572_ += i_1587_;
		i_1581_ += i_1587_ * i_1585_ - (anInt8989 << 16);
	    }
	    if (anInt8985 < i_1582_)
		i_1573_
		    = ((anInt8985 << 16) - i_1580_ + i_1584_ - 1) / i_1584_;
	    if (anInt9002 < i_1583_)
		i_1574_
		    = ((anInt9002 << 16) - i_1581_ + i_1585_ - 1) / i_1585_;
	    int i_1588_
		= i + i_1572_ * (aClass185_Sub2_9016.anInt9356 * 356365251);
	    int i_1589_ = aClass185_Sub2_9016.anInt9356 * 356365251 - i_1573_;
	    if (i_1572_ + i_1574_ > aClass185_Sub2_9016.anInt9345 * 639238427)
		i_1574_ -= (i_1572_ + i_1574_
			    - aClass185_Sub2_9016.anInt9345 * 639238427);
	    if (i_1572_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		int i_1590_
		    = aClass185_Sub2_9016.anInt9344 * 9823353 - i_1572_;
		i_1574_ -= i_1590_;
		i_1588_
		    += i_1590_ * (aClass185_Sub2_9016.anInt9356 * 356365251);
		i_1581_ += i_1585_ * i_1590_;
	    }
	    if (i + i_1573_ > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		int i_1591_ = (i + i_1573_
			       - aClass185_Sub2_9016.anInt9343 * -1807368365);
		i_1573_ -= i_1591_;
		i_1589_ += i_1591_;
	    }
	    if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		int i_1592_ = aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		i_1573_ -= i_1592_;
		i_1588_ += i_1592_;
		i_1580_ += i_1584_ * i_1592_;
		i_1589_ += i_1592_;
	    }
	    float[] fs = aClass185_Sub2_9016.aFloatArray9341;
	    int[] is = aClass185_Sub2_9016.anIntArray9338;
	    if (i_1577_ == 0) {
		if (i_1575_ == 1) {
		    int i_1593_ = i_1580_;
		    for (int i_1594_ = -i_1574_; i_1594_ < 0; i_1594_++) {
			int i_1595_ = (i_1581_ >> 16) * anInt8985;
			for (int i_1596_ = -i_1573_; i_1596_ < 0; i_1596_++) {
			    if (!bool_1570_ || f < fs[i_1588_]) {
				if (bool)
				    is[i_1588_]
					= (anIntArray11404
					   [(i_1580_ >> 16) + i_1595_]);
				if (bool_1570_ && bool_1579_)
				    fs[i_1588_] = f;
			    }
			    i_1580_ += i_1584_;
			    i_1588_++;
			}
			i_1581_ += i_1585_;
			i_1580_ = i_1593_;
			i_1588_ += i_1589_;
		    }
		} else if (i_1575_ == 0) {
		    int i_1597_ = (i_1576_ & 0xff0000) >> 16;
		    int i_1598_ = (i_1576_ & 0xff00) >> 8;
		    int i_1599_ = i_1576_ & 0xff;
		    int i_1600_ = i_1580_;
		    for (int i_1601_ = -i_1574_; i_1601_ < 0; i_1601_++) {
			int i_1602_ = (i_1581_ >> 16) * anInt8985;
			for (int i_1603_ = -i_1573_; i_1603_ < 0; i_1603_++) {
			    if (!bool_1570_ || f < fs[i_1588_]) {
				if (bool) {
				    int i_1604_
					= (anIntArray11404
					   [(i_1580_ >> 16) + i_1602_]);
				    int i_1605_
					= ((i_1604_ & 0xff0000) * i_1597_
					   & ~0xffffff);
				    int i_1606_ = ((i_1604_ & 0xff00) * i_1598_
						   & 0xff0000);
				    int i_1607_
					= (i_1604_ & 0xff) * i_1599_ & 0xff00;
				    is[i_1588_]
					= (i_1605_ | i_1606_ | i_1607_) >>> 8;
				}
				if (bool_1570_ && bool_1579_)
				    fs[i_1588_] = f;
			    }
			    i_1580_ += i_1584_;
			    i_1588_++;
			}
			i_1581_ += i_1585_;
			i_1580_ = i_1600_;
			i_1588_ += i_1589_;
		    }
		} else if (i_1575_ == 3) {
		    int i_1608_ = i_1580_;
		    for (int i_1609_ = -i_1574_; i_1609_ < 0; i_1609_++) {
			int i_1610_ = (i_1581_ >> 16) * anInt8985;
			for (int i_1611_ = -i_1573_; i_1611_ < 0; i_1611_++) {
			    if (!bool_1570_ || f < fs[i_1588_]) {
				if (bool) {
				    int i_1612_
					= (anIntArray11404
					   [(i_1580_ >> 16) + i_1610_]);
				    int i_1613_ = i_1612_ + i_1576_;
				    int i_1614_ = ((i_1612_ & 0xff00ff)
						   + (i_1576_ & 0xff00ff));
				    int i_1615_
					= ((i_1614_ & 0x1000100)
					   + (i_1613_ - i_1614_ & 0x10000));
				    is[i_1588_]
					= (i_1613_ - i_1615_
					   | i_1615_ - (i_1615_ >>> 8));
				}
				if (bool_1570_ && bool_1579_)
				    fs[i_1588_] = f;
			    }
			    i_1580_ += i_1584_;
			    i_1588_++;
			}
			i_1581_ += i_1585_;
			i_1580_ = i_1608_;
			i_1588_ += i_1589_;
		    }
		} else if (i_1575_ == 2) {
		    int i_1616_ = i_1576_ >>> 24;
		    int i_1617_ = 256 - i_1616_;
		    int i_1618_ = (i_1576_ & 0xff00ff) * i_1617_ & ~0xff00ff;
		    int i_1619_ = (i_1576_ & 0xff00) * i_1617_ & 0xff0000;
		    i_1576_ = (i_1618_ | i_1619_) >>> 8;
		    int i_1620_ = i_1580_;
		    for (int i_1621_ = -i_1574_; i_1621_ < 0; i_1621_++) {
			int i_1622_ = (i_1581_ >> 16) * anInt8985;
			for (int i_1623_ = -i_1573_; i_1623_ < 0; i_1623_++) {
			    if (!bool_1570_ || f < fs[i_1588_]) {
				if (bool) {
				    int i_1624_
					= (anIntArray11404
					   [(i_1580_ >> 16) + i_1622_]);
				    i_1618_ = ((i_1624_ & 0xff00ff) * i_1616_
					       & ~0xff00ff);
				    i_1619_ = ((i_1624_ & 0xff00) * i_1616_
					       & 0xff0000);
				    is[i_1588_] = (((i_1618_ | i_1619_) >>> 8)
						   + i_1576_);
				}
				if (bool_1570_ && bool_1579_)
				    fs[i_1588_] = f;
			    }
			    i_1580_ += i_1584_;
			    i_1588_++;
			}
			i_1581_ += i_1585_;
			i_1580_ = i_1620_;
			i_1588_ += i_1589_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1577_ == 1) {
		if (i_1575_ == 1) {
		    int i_1625_ = i_1580_;
		    for (int i_1626_ = -i_1574_; i_1626_ < 0; i_1626_++) {
			int i_1627_ = (i_1581_ >> 16) * anInt8985;
			for (int i_1628_ = -i_1573_; i_1628_ < 0; i_1628_++) {
			    if (!bool_1570_ || f < fs[i_1588_]) {
				if (bool) {
				    int i_1629_
					= (anIntArray11404
					   [(i_1580_ >> 16) + i_1627_]);
				    int i_1630_ = i_1629_ >>> 24;
				    int i_1631_ = 256 - i_1630_;
				    int i_1632_ = is[i_1588_];
				    is[i_1588_]
					= (((((i_1629_ & 0xff00ff) * i_1630_
					      + (i_1632_ & 0xff00ff) * i_1631_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_1629_ & ~0xff00ff) >>> 8)
						* i_1630_)
					       + (((i_1632_ & ~0xff00ff) >>> 8)
						  * i_1631_))
					      & ~0xff00ff));
				}
				if (bool_1570_ && bool_1579_)
				    fs[i_1588_] = f;
			    }
			    i_1580_ += i_1584_;
			    i_1588_++;
			}
			i_1581_ += i_1585_;
			i_1580_ = i_1625_;
			i_1588_ += i_1589_;
		    }
		} else if (i_1575_ == 0) {
		    int i_1633_ = i_1580_;
		    if ((i_1576_ & 0xffffff) == 16777215) {
			for (int i_1634_ = -i_1574_; i_1634_ < 0; i_1634_++) {
			    int i_1635_ = (i_1581_ >> 16) * anInt8985;
			    for (int i_1636_ = -i_1573_; i_1636_ < 0;
				 i_1636_++) {
				if (!bool_1570_ || f < fs[i_1588_]) {
				    if (bool) {
					int i_1637_
					    = (anIntArray11404
					       [(i_1580_ >> 16) + i_1635_]);
					int i_1638_
					    = ((i_1637_ >>> 24) * (i_1576_
								   >>> 24)
					       >> 8);
					int i_1639_ = 256 - i_1638_;
					int i_1640_ = is[i_1588_];
					is[i_1588_]
					    = ((((i_1637_ & 0xff00ff) * i_1638_
						 + ((i_1640_ & 0xff00ff)
						    * i_1639_))
						& ~0xff00ff)
					       + (((i_1637_ & 0xff00) * i_1638_
						   + ((i_1640_ & 0xff00)
						      * i_1639_))
						  & 0xff0000)) >> 8;
				    }
				    if (bool_1570_ && bool_1579_)
					fs[i_1588_] = f;
				}
				i_1580_ += i_1584_;
				i_1588_++;
			    }
			    i_1581_ += i_1585_;
			    i_1580_ = i_1633_;
			    i_1588_ += i_1589_;
			}
		    } else {
			int i_1641_ = (i_1576_ & 0xff0000) >> 16;
			int i_1642_ = (i_1576_ & 0xff00) >> 8;
			int i_1643_ = i_1576_ & 0xff;
			for (int i_1644_ = -i_1574_; i_1644_ < 0; i_1644_++) {
			    int i_1645_ = (i_1581_ >> 16) * anInt8985;
			    for (int i_1646_ = -i_1573_; i_1646_ < 0;
				 i_1646_++) {
				if (!bool_1570_ || f < fs[i_1588_]) {
				    int i_1647_
					= (anIntArray11404
					   [(i_1580_ >> 16) + i_1645_]);
				    int i_1648_
					= ((i_1647_ >>> 24) * (i_1576_ >>> 24)
					   >> 8);
				    int i_1649_ = 256 - i_1648_;
				    if (i_1648_ != 255) {
					if (bool) {
					    int i_1650_
						= (((i_1647_ & 0xff0000)
						    * i_1641_)
						   & ~0xffffff);
					    int i_1651_
						= ((i_1647_ & 0xff00) * i_1642_
						   & 0xff0000);
					    int i_1652_
						= ((i_1647_ & 0xff) * i_1643_
						   & 0xff00);
					    i_1647_ = (i_1650_ | i_1651_
						       | i_1652_) >>> 8;
					    int i_1653_ = is[i_1588_];
					    is[i_1588_]
						= (((((i_1647_ & 0xff00ff)
						      * i_1648_)
						     + ((i_1653_ & 0xff00ff)
							* i_1649_))
						    & ~0xff00ff)
						   + ((((i_1647_ & 0xff00)
							* i_1648_)
						       + ((i_1653_ & 0xff00)
							  * i_1649_))
						      & 0xff0000)) >> 8;
					    if (bool_1571_) {
						int i_1654_ = ((i_1653_ >>> 24)
							       + i_1648_);
						if (i_1654_ > 255)
						    i_1654_ = 255;
						is[i_1588_] |= i_1654_ << 24;
					    }
					}
					if (bool_1570_ && bool_1579_)
					    fs[i_1588_] = f;
				    } else {
					if (bool) {
					    int i_1655_
						= (((i_1647_ & 0xff0000)
						    * i_1641_)
						   & ~0xffffff);
					    int i_1656_
						= ((i_1647_ & 0xff00) * i_1642_
						   & 0xff0000);
					    int i_1657_
						= ((i_1647_ & 0xff) * i_1643_
						   & 0xff00);
					    is[i_1588_] = (i_1655_ | i_1656_
							   | i_1657_) >>> 8;
					}
					if (bool_1570_ && bool_1579_)
					    fs[i_1588_] = f;
				    }
				}
				i_1580_ += i_1584_;
				i_1588_++;
			    }
			    i_1581_ += i_1585_;
			    i_1580_ = i_1633_;
			    i_1588_ += i_1589_;
			}
		    }
		} else if (i_1575_ == 3) {
		    int i_1658_ = i_1580_;
		    for (int i_1659_ = -i_1574_; i_1659_ < 0; i_1659_++) {
			int i_1660_ = (i_1581_ >> 16) * anInt8985;
			for (int i_1661_ = -i_1573_; i_1661_ < 0; i_1661_++) {
			    if (!bool_1570_ || f < fs[i_1588_]) {
				if (bool) {
				    int i_1662_
					= (anIntArray11404
					   [(i_1580_ >> 16) + i_1660_]);
				    int i_1663_ = i_1662_ + i_1576_;
				    int i_1664_ = ((i_1662_ & 0xff00ff)
						   + (i_1576_ & 0xff00ff));
				    int i_1665_
					= ((i_1664_ & 0x1000100)
					   + (i_1663_ - i_1664_ & 0x10000));
				    i_1665_ = (i_1663_ - i_1665_
					       | i_1665_ - (i_1665_ >>> 8));
				    int i_1666_
					= ((i_1665_ >>> 24) * (i_1576_ >>> 24)
					   >> 8);
				    int i_1667_ = 256 - i_1666_;
				    if (i_1666_ != 255) {
					i_1662_ = i_1665_;
					i_1665_ = is[i_1588_];
					i_1665_
					    = ((((i_1662_ & 0xff00ff) * i_1666_
						 + ((i_1665_ & 0xff00ff)
						    * i_1667_))
						& ~0xff00ff)
					       + (((i_1662_ & 0xff00) * i_1666_
						   + ((i_1665_ & 0xff00)
						      * i_1667_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_1588_] = i_1665_;
				}
				if (bool_1570_ && bool_1579_)
				    fs[i_1588_] = f;
			    }
			    i_1580_ += i_1584_;
			    i_1588_++;
			}
			i_1581_ += i_1585_;
			i_1580_ = i_1658_;
			i_1588_ += i_1589_;
		    }
		} else if (i_1575_ == 2) {
		    int i_1668_ = i_1576_ >>> 24;
		    int i_1669_ = 256 - i_1668_;
		    int i_1670_ = (i_1576_ & 0xff00ff) * i_1669_ & ~0xff00ff;
		    int i_1671_ = (i_1576_ & 0xff00) * i_1669_ & 0xff0000;
		    i_1576_ = (i_1670_ | i_1671_) >>> 8;
		    int i_1672_ = i_1580_;
		    for (int i_1673_ = -i_1574_; i_1673_ < 0; i_1673_++) {
			int i_1674_ = (i_1581_ >> 16) * anInt8985;
			for (int i_1675_ = -i_1573_; i_1675_ < 0; i_1675_++) {
			    if (!bool_1570_ || f < fs[i_1588_]) {
				if (bool) {
				    int i_1676_
					= (anIntArray11404
					   [(i_1580_ >> 16) + i_1674_]);
				    int i_1677_ = i_1676_ >>> 24;
				    int i_1678_ = 256 - i_1677_;
				    i_1670_ = ((i_1676_ & 0xff00ff) * i_1668_
					       & ~0xff00ff);
				    i_1671_ = ((i_1676_ & 0xff00) * i_1668_
					       & 0xff0000);
				    i_1676_ = (((i_1670_ | i_1671_) >>> 8)
					       + i_1576_);
				    int i_1679_ = is[i_1588_];
				    is[i_1588_]
					= ((((i_1676_ & 0xff00ff) * i_1677_
					     + (i_1679_ & 0xff00ff) * i_1678_)
					    & ~0xff00ff)
					   + (((i_1676_ & 0xff00) * i_1677_
					       + (i_1679_ & 0xff00) * i_1678_)
					      & 0xff0000)) >> 8;
				}
				if (bool_1570_ && bool_1579_)
				    fs[i_1588_] = f;
			    }
			    i_1580_ += i_1584_;
			    i_1588_++;
			}
			i_1581_ += i_1585_;
			i_1580_ = i_1672_;
			i_1588_ += i_1589_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1577_ == 2) {
		if (i_1575_ == 1) {
		    int i_1680_ = i_1580_;
		    for (int i_1681_ = -i_1574_; i_1681_ < 0; i_1681_++) {
			int i_1682_ = (i_1581_ >> 16) * anInt8985;
			for (int i_1683_ = -i_1573_; i_1683_ < 0; i_1683_++) {
			    if (!bool_1570_ || f < fs[i_1588_]) {
				int i_1684_ = (anIntArray11404
					       [(i_1580_ >> 16) + i_1682_]);
				if (i_1684_ != 0) {
				    if (bool) {
					int i_1685_ = is[i_1588_];
					int i_1686_ = i_1684_ + i_1685_;
					int i_1687_ = ((i_1684_ & 0xff00ff)
						       + (i_1685_ & 0xff00ff));
					i_1685_ = ((i_1687_ & 0x1000100)
						   + (i_1686_ - i_1687_
						      & 0x10000));
					is[i_1588_]
					    = (i_1686_ - i_1685_
					       | i_1685_ - (i_1685_ >>> 8));
				    }
				    if (bool_1570_ && bool_1579_)
					fs[i_1588_] = f;
				}
			    }
			    i_1580_ += i_1584_;
			    i_1588_++;
			}
			i_1581_ += i_1585_;
			i_1580_ = i_1680_;
			i_1588_ += i_1589_;
		    }
		} else if (i_1575_ == 0) {
		    int i_1688_ = i_1580_;
		    int i_1689_ = (i_1576_ & 0xff0000) >> 16;
		    int i_1690_ = (i_1576_ & 0xff00) >> 8;
		    int i_1691_ = i_1576_ & 0xff;
		    for (int i_1692_ = -i_1574_; i_1692_ < 0; i_1692_++) {
			int i_1693_ = (i_1581_ >> 16) * anInt8985;
			for (int i_1694_ = -i_1573_; i_1694_ < 0; i_1694_++) {
			    if (!bool_1570_ || f < fs[i_1588_]) {
				int i_1695_ = (anIntArray11404
					       [(i_1580_ >> 16) + i_1693_]);
				if (i_1695_ != 0) {
				    if (bool) {
					int i_1696_
					    = ((i_1695_ & 0xff0000) * i_1689_
					       & ~0xffffff);
					int i_1697_
					    = ((i_1695_ & 0xff00) * i_1690_
					       & 0xff0000);
					int i_1698_
					    = ((i_1695_ & 0xff) * i_1691_
					       & 0xff00);
					i_1695_ = (i_1696_ | i_1697_
						   | i_1698_) >>> 8;
					int i_1699_ = is[i_1588_];
					int i_1700_ = i_1695_ + i_1699_;
					int i_1701_ = ((i_1695_ & 0xff00ff)
						       + (i_1699_ & 0xff00ff));
					i_1699_ = ((i_1701_ & 0x1000100)
						   + (i_1700_ - i_1701_
						      & 0x10000));
					is[i_1588_]
					    = (i_1700_ - i_1699_
					       | i_1699_ - (i_1699_ >>> 8));
				    }
				    if (bool_1570_ && bool_1579_)
					fs[i_1588_] = f;
				}
			    }
			    i_1580_ += i_1584_;
			    i_1588_++;
			}
			i_1581_ += i_1585_;
			i_1580_ = i_1688_;
			i_1588_ += i_1589_;
		    }
		} else if (i_1575_ == 3) {
		    int i_1702_ = i_1580_;
		    for (int i_1703_ = -i_1574_; i_1703_ < 0; i_1703_++) {
			int i_1704_ = (i_1581_ >> 16) * anInt8985;
			for (int i_1705_ = -i_1573_; i_1705_ < 0; i_1705_++) {
			    if (!bool_1570_ || f < fs[i_1588_]) {
				if (bool) {
				    int i_1706_
					= (anIntArray11404
					   [(i_1580_ >> 16) + i_1704_]);
				    int i_1707_ = i_1706_ + i_1576_;
				    int i_1708_ = ((i_1706_ & 0xff00ff)
						   + (i_1576_ & 0xff00ff));
				    int i_1709_
					= ((i_1708_ & 0x1000100)
					   + (i_1707_ - i_1708_ & 0x10000));
				    i_1706_ = (i_1707_ - i_1709_
					       | i_1709_ - (i_1709_ >>> 8));
				    i_1709_ = is[i_1588_];
				    i_1707_ = i_1706_ + i_1709_;
				    i_1708_
					= (i_1706_ & 0xff00ff) + (i_1709_
								  & 0xff00ff);
				    i_1709_
					= ((i_1708_ & 0x1000100)
					   + (i_1707_ - i_1708_ & 0x10000));
				    is[i_1588_]
					= (i_1707_ - i_1709_
					   | i_1709_ - (i_1709_ >>> 8));
				}
				if (bool_1570_ && bool_1579_)
				    fs[i_1588_] = f;
			    }
			    i_1580_ += i_1584_;
			    i_1588_++;
			}
			i_1581_ += i_1585_;
			i_1580_ = i_1702_;
			i_1588_ += i_1589_;
		    }
		} else if (i_1575_ == 2) {
		    int i_1710_ = i_1576_ >>> 24;
		    int i_1711_ = 256 - i_1710_;
		    int i_1712_ = (i_1576_ & 0xff00ff) * i_1711_ & ~0xff00ff;
		    int i_1713_ = (i_1576_ & 0xff00) * i_1711_ & 0xff0000;
		    i_1576_ = (i_1712_ | i_1713_) >>> 8;
		    int i_1714_ = i_1580_;
		    for (int i_1715_ = -i_1574_; i_1715_ < 0; i_1715_++) {
			int i_1716_ = (i_1581_ >> 16) * anInt8985;
			for (int i_1717_ = -i_1573_; i_1717_ < 0; i_1717_++) {
			    if (!bool_1570_ || f < fs[i_1588_]) {
				int i_1718_ = (anIntArray11404
					       [(i_1580_ >> 16) + i_1716_]);
				if (i_1718_ != 0) {
				    if (bool) {
					i_1712_
					    = ((i_1718_ & 0xff00ff) * i_1710_
					       & ~0xff00ff);
					i_1713_ = ((i_1718_ & 0xff00) * i_1710_
						   & 0xff0000);
					i_1718_ = (((i_1712_ | i_1713_) >>> 8)
						   + i_1576_);
					int i_1719_ = is[i_1588_];
					int i_1720_ = i_1718_ + i_1719_;
					int i_1721_ = ((i_1718_ & 0xff00ff)
						       + (i_1719_ & 0xff00ff));
					i_1719_ = ((i_1721_ & 0x1000100)
						   + (i_1720_ - i_1721_
						      & 0x10000));
					is[i_1588_]
					    = (i_1720_ - i_1719_
					       | i_1719_ - (i_1719_ >>> 8));
				    }
				    if (bool_1570_ && bool_1579_)
					fs[i_1588_] = f;
				}
			    }
			    i_1580_ += i_1584_;
			    i_1588_++;
			}
			i_1581_ += i_1585_;
			i_1580_ = i_1714_;
			i_1588_ += i_1589_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method14519(int i, int i_1722_) {
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    if (anInt9001 == 0) {
		if (anInt9000 == 0) {
		    int i_1723_ = anInt8998;
		    while (i_1723_ < 0) {
			int i_1724_ = anInt8988;
			int i_1725_ = anInt9007;
			int i_1726_ = anInt9003;
			int i_1727_ = anInt8999;
			if (i_1725_ >= 0 && i_1726_ >= 0
			    && i_1725_ - (anInt8985 << 12) < 0
			    && i_1726_ - (anInt9002 << 12) < 0) {
			    for (/**/; i_1727_ < 0; i_1727_++)
				method17938(((i_1726_ >> 12) * anInt8985
					     + (i_1725_ >> 12)),
					    i_1724_++, is, i, i_1722_);
			}
			i_1723_++;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_1728_ = anInt8998;
		    while (i_1728_ < 0) {
			int i_1729_ = anInt8988;
			int i_1730_ = anInt9007;
			int i_1731_ = anInt9003 + anInt9010;
			int i_1732_ = anInt8999;
			if (i_1730_ >= 0 && i_1730_ - (anInt8985 << 12) < 0) {
			    int i_1733_;
			    if ((i_1733_ = i_1731_ - (anInt9002 << 12)) >= 0) {
				i_1733_ = (anInt9000 - i_1733_) / anInt9000;
				i_1732_ += i_1733_;
				i_1731_ += anInt9000 * i_1733_;
				i_1729_ += i_1733_;
			    }
			    if ((i_1733_ = (i_1731_ - anInt9000) / anInt9000)
				> i_1732_)
				i_1732_ = i_1733_;
			    for (/**/; i_1732_ < 0; i_1732_++) {
				method17938(((i_1731_ >> 12) * anInt8985
					     + (i_1730_ >> 12)),
					    i_1729_++, is, i, i_1722_);
				i_1731_ += anInt9000;
			    }
			}
			i_1728_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_1734_ = anInt8998;
		    while (i_1734_ < 0) {
			int i_1735_ = anInt8988;
			int i_1736_ = anInt9007;
			int i_1737_ = anInt9003 + anInt9010;
			int i_1738_ = anInt8999;
			if (i_1736_ >= 0 && i_1736_ - (anInt8985 << 12) < 0) {
			    if (i_1737_ < 0) {
				int i_1739_
				    = (anInt9000 - 1 - i_1737_) / anInt9000;
				i_1738_ += i_1739_;
				i_1737_ += anInt9000 * i_1739_;
				i_1735_ += i_1739_;
			    }
			    int i_1740_;
			    if ((i_1740_ = (1 + i_1737_ - (anInt9002 << 12)
					    - anInt9000) / anInt9000)
				> i_1738_)
				i_1738_ = i_1740_;
			    for (/**/; i_1738_ < 0; i_1738_++) {
				method17938(((i_1737_ >> 12) * anInt8985
					     + (i_1736_ >> 12)),
					    i_1735_++, is, i, i_1722_);
				i_1737_ += anInt9000;
			    }
			}
			i_1734_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9001 < 0) {
		if (anInt9000 == 0) {
		    int i_1741_ = anInt8998;
		    while (i_1741_ < 0) {
			int i_1742_ = anInt8988;
			int i_1743_ = anInt9007 + anInt9009;
			int i_1744_ = anInt9003;
			int i_1745_ = anInt8999;
			if (i_1744_ >= 0 && i_1744_ - (anInt9002 << 12) < 0) {
			    int i_1746_;
			    if ((i_1746_ = i_1743_ - (anInt8985 << 12)) >= 0) {
				i_1746_ = (anInt9001 - i_1746_) / anInt9001;
				i_1745_ += i_1746_;
				i_1743_ += anInt9001 * i_1746_;
				i_1742_ += i_1746_;
			    }
			    if ((i_1746_ = (i_1743_ - anInt9001) / anInt9001)
				> i_1745_)
				i_1745_ = i_1746_;
			    for (/**/; i_1745_ < 0; i_1745_++) {
				method17938(((i_1744_ >> 12) * anInt8985
					     + (i_1743_ >> 12)),
					    i_1742_++, is, i, i_1722_);
				i_1743_ += anInt9001;
			    }
			}
			i_1741_++;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_1747_ = anInt8998;
		    while (i_1747_ < 0) {
			int i_1748_ = anInt8988;
			int i_1749_ = anInt9007 + anInt9009;
			int i_1750_ = anInt9003 + anInt9010;
			int i_1751_ = anInt8999;
			int i_1752_;
			if ((i_1752_ = i_1749_ - (anInt8985 << 12)) >= 0) {
			    i_1752_ = (anInt9001 - i_1752_) / anInt9001;
			    i_1751_ += i_1752_;
			    i_1749_ += anInt9001 * i_1752_;
			    i_1750_ += anInt9000 * i_1752_;
			    i_1748_ += i_1752_;
			}
			if ((i_1752_ = (i_1749_ - anInt9001) / anInt9001)
			    > i_1751_)
			    i_1751_ = i_1752_;
			if ((i_1752_ = i_1750_ - (anInt9002 << 12)) >= 0) {
			    i_1752_ = (anInt9000 - i_1752_) / anInt9000;
			    i_1751_ += i_1752_;
			    i_1749_ += anInt9001 * i_1752_;
			    i_1750_ += anInt9000 * i_1752_;
			    i_1748_ += i_1752_;
			}
			if ((i_1752_ = (i_1750_ - anInt9000) / anInt9000)
			    > i_1751_)
			    i_1751_ = i_1752_;
			for (/**/; i_1751_ < 0; i_1751_++) {
			    method17938((i_1750_ >> 12) * anInt8985 + (i_1749_
								       >> 12),
					i_1748_++, is, i, i_1722_);
			    i_1749_ += anInt9001;
			    i_1750_ += anInt9000;
			}
			i_1747_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_1753_ = anInt8998;
		    while (i_1753_ < 0) {
			int i_1754_ = anInt8988;
			int i_1755_ = anInt9007 + anInt9009;
			int i_1756_ = anInt9003 + anInt9010;
			int i_1757_ = anInt8999;
			int i_1758_;
			if ((i_1758_ = i_1755_ - (anInt8985 << 12)) >= 0) {
			    i_1758_ = (anInt9001 - i_1758_) / anInt9001;
			    i_1757_ += i_1758_;
			    i_1755_ += anInt9001 * i_1758_;
			    i_1756_ += anInt9000 * i_1758_;
			    i_1754_ += i_1758_;
			}
			if ((i_1758_ = (i_1755_ - anInt9001) / anInt9001)
			    > i_1757_)
			    i_1757_ = i_1758_;
			if (i_1756_ < 0) {
			    i_1758_ = (anInt9000 - 1 - i_1756_) / anInt9000;
			    i_1757_ += i_1758_;
			    i_1755_ += anInt9001 * i_1758_;
			    i_1756_ += anInt9000 * i_1758_;
			    i_1754_ += i_1758_;
			}
			if ((i_1758_ = (1 + i_1756_ - (anInt9002 << 12)
					- anInt9000) / anInt9000)
			    > i_1757_)
			    i_1757_ = i_1758_;
			for (/**/; i_1757_ < 0; i_1757_++) {
			    method17938((i_1756_ >> 12) * anInt8985 + (i_1755_
								       >> 12),
					i_1754_++, is, i, i_1722_);
			    i_1755_ += anInt9001;
			    i_1756_ += anInt9000;
			}
			i_1753_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9000 == 0) {
		int i_1759_ = anInt8998;
		while (i_1759_ < 0) {
		    int i_1760_ = anInt8988;
		    int i_1761_ = anInt9007 + anInt9009;
		    int i_1762_ = anInt9003;
		    int i_1763_ = anInt8999;
		    if (i_1762_ >= 0 && i_1762_ - (anInt9002 << 12) < 0) {
			if (i_1761_ < 0) {
			    int i_1764_
				= (anInt9001 - 1 - i_1761_) / anInt9001;
			    i_1763_ += i_1764_;
			    i_1761_ += anInt9001 * i_1764_;
			    i_1760_ += i_1764_;
			}
			int i_1765_;
			if ((i_1765_ = (1 + i_1761_ - (anInt8985 << 12)
					- anInt9001) / anInt9001)
			    > i_1763_)
			    i_1763_ = i_1765_;
			for (/**/; i_1763_ < 0; i_1763_++) {
			    method17938((i_1762_ >> 12) * anInt8985 + (i_1761_
								       >> 12),
					i_1760_++, is, i, i_1722_);
			    i_1761_ += anInt9001;
			}
		    }
		    i_1759_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else if (anInt9000 < 0) {
		for (int i_1766_ = anInt8998; i_1766_ < 0; i_1766_++) {
		    int i_1767_ = anInt8988;
		    int i_1768_ = anInt9007 + anInt9009;
		    int i_1769_ = anInt9003 + anInt9010;
		    int i_1770_ = anInt8999;
		    if (i_1768_ < 0) {
			int i_1771_ = (anInt9001 - 1 - i_1768_) / anInt9001;
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
		    for (/**/; i_1770_ < 0; i_1770_++) {
			method17938((i_1769_ >> 12) * anInt8985 + (i_1768_
								   >> 12),
				    i_1767_++, is, i, i_1722_);
			i_1768_ += anInt9001;
			i_1769_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else {
		for (int i_1773_ = anInt8998; i_1773_ < 0; i_1773_++) {
		    int i_1774_ = anInt8988;
		    int i_1775_ = anInt9007 + anInt9009;
		    int i_1776_ = anInt9003 + anInt9010;
		    int i_1777_ = anInt8999;
		    if (i_1775_ < 0) {
			int i_1778_ = (anInt9001 - 1 - i_1775_) / anInt9001;
			i_1777_ += i_1778_;
			i_1775_ += anInt9001 * i_1778_;
			i_1776_ += anInt9000 * i_1778_;
			i_1774_ += i_1778_;
		    }
		    int i_1779_;
		    if ((i_1779_ = (1 + i_1775_ - (anInt8985 << 12)
				    - anInt9001) / anInt9001)
			> i_1777_)
			i_1777_ = i_1779_;
		    if (i_1776_ < 0) {
			i_1779_ = (anInt9000 - 1 - i_1776_) / anInt9000;
			i_1777_ += i_1779_;
			i_1775_ += anInt9001 * i_1779_;
			i_1776_ += anInt9000 * i_1779_;
			i_1774_ += i_1779_;
		    }
		    if ((i_1779_ = (1 + i_1776_ - (anInt9002 << 12)
				    - anInt9000) / anInt9000)
			> i_1777_)
			i_1777_ = i_1779_;
		    for (/**/; i_1777_ < 0; i_1777_++) {
			method17938((i_1776_ >> 12) * anInt8985 + (i_1775_
								   >> 12),
				    i_1774_++, is, i, i_1722_);
			i_1775_ += anInt9001;
			i_1776_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    }
	}
    }
    
    void method14509(int i, int i_1780_) {
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    if (anInt9001 == 0) {
		if (anInt9000 == 0) {
		    int i_1781_ = anInt8998;
		    while (i_1781_ < 0) {
			int i_1782_ = anInt8988;
			int i_1783_ = anInt9007;
			int i_1784_ = anInt9003;
			int i_1785_ = anInt8999;
			if (i_1783_ >= 0 && i_1784_ >= 0
			    && i_1783_ - (anInt8985 << 12) < 0
			    && i_1784_ - (anInt9002 << 12) < 0) {
			    for (/**/; i_1785_ < 0; i_1785_++)
				method17938(((i_1784_ >> 12) * anInt8985
					     + (i_1783_ >> 12)),
					    i_1782_++, is, i, i_1780_);
			}
			i_1781_++;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_1786_ = anInt8998;
		    while (i_1786_ < 0) {
			int i_1787_ = anInt8988;
			int i_1788_ = anInt9007;
			int i_1789_ = anInt9003 + anInt9010;
			int i_1790_ = anInt8999;
			if (i_1788_ >= 0 && i_1788_ - (anInt8985 << 12) < 0) {
			    int i_1791_;
			    if ((i_1791_ = i_1789_ - (anInt9002 << 12)) >= 0) {
				i_1791_ = (anInt9000 - i_1791_) / anInt9000;
				i_1790_ += i_1791_;
				i_1789_ += anInt9000 * i_1791_;
				i_1787_ += i_1791_;
			    }
			    if ((i_1791_ = (i_1789_ - anInt9000) / anInt9000)
				> i_1790_)
				i_1790_ = i_1791_;
			    for (/**/; i_1790_ < 0; i_1790_++) {
				method17938(((i_1789_ >> 12) * anInt8985
					     + (i_1788_ >> 12)),
					    i_1787_++, is, i, i_1780_);
				i_1789_ += anInt9000;
			    }
			}
			i_1786_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_1792_ = anInt8998;
		    while (i_1792_ < 0) {
			int i_1793_ = anInt8988;
			int i_1794_ = anInt9007;
			int i_1795_ = anInt9003 + anInt9010;
			int i_1796_ = anInt8999;
			if (i_1794_ >= 0 && i_1794_ - (anInt8985 << 12) < 0) {
			    if (i_1795_ < 0) {
				int i_1797_
				    = (anInt9000 - 1 - i_1795_) / anInt9000;
				i_1796_ += i_1797_;
				i_1795_ += anInt9000 * i_1797_;
				i_1793_ += i_1797_;
			    }
			    int i_1798_;
			    if ((i_1798_ = (1 + i_1795_ - (anInt9002 << 12)
					    - anInt9000) / anInt9000)
				> i_1796_)
				i_1796_ = i_1798_;
			    for (/**/; i_1796_ < 0; i_1796_++) {
				method17938(((i_1795_ >> 12) * anInt8985
					     + (i_1794_ >> 12)),
					    i_1793_++, is, i, i_1780_);
				i_1795_ += anInt9000;
			    }
			}
			i_1792_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9001 < 0) {
		if (anInt9000 == 0) {
		    int i_1799_ = anInt8998;
		    while (i_1799_ < 0) {
			int i_1800_ = anInt8988;
			int i_1801_ = anInt9007 + anInt9009;
			int i_1802_ = anInt9003;
			int i_1803_ = anInt8999;
			if (i_1802_ >= 0 && i_1802_ - (anInt9002 << 12) < 0) {
			    int i_1804_;
			    if ((i_1804_ = i_1801_ - (anInt8985 << 12)) >= 0) {
				i_1804_ = (anInt9001 - i_1804_) / anInt9001;
				i_1803_ += i_1804_;
				i_1801_ += anInt9001 * i_1804_;
				i_1800_ += i_1804_;
			    }
			    if ((i_1804_ = (i_1801_ - anInt9001) / anInt9001)
				> i_1803_)
				i_1803_ = i_1804_;
			    for (/**/; i_1803_ < 0; i_1803_++) {
				method17938(((i_1802_ >> 12) * anInt8985
					     + (i_1801_ >> 12)),
					    i_1800_++, is, i, i_1780_);
				i_1801_ += anInt9001;
			    }
			}
			i_1799_++;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_1805_ = anInt8998;
		    while (i_1805_ < 0) {
			int i_1806_ = anInt8988;
			int i_1807_ = anInt9007 + anInt9009;
			int i_1808_ = anInt9003 + anInt9010;
			int i_1809_ = anInt8999;
			int i_1810_;
			if ((i_1810_ = i_1807_ - (anInt8985 << 12)) >= 0) {
			    i_1810_ = (anInt9001 - i_1810_) / anInt9001;
			    i_1809_ += i_1810_;
			    i_1807_ += anInt9001 * i_1810_;
			    i_1808_ += anInt9000 * i_1810_;
			    i_1806_ += i_1810_;
			}
			if ((i_1810_ = (i_1807_ - anInt9001) / anInt9001)
			    > i_1809_)
			    i_1809_ = i_1810_;
			if ((i_1810_ = i_1808_ - (anInt9002 << 12)) >= 0) {
			    i_1810_ = (anInt9000 - i_1810_) / anInt9000;
			    i_1809_ += i_1810_;
			    i_1807_ += anInt9001 * i_1810_;
			    i_1808_ += anInt9000 * i_1810_;
			    i_1806_ += i_1810_;
			}
			if ((i_1810_ = (i_1808_ - anInt9000) / anInt9000)
			    > i_1809_)
			    i_1809_ = i_1810_;
			for (/**/; i_1809_ < 0; i_1809_++) {
			    method17938((i_1808_ >> 12) * anInt8985 + (i_1807_
								       >> 12),
					i_1806_++, is, i, i_1780_);
			    i_1807_ += anInt9001;
			    i_1808_ += anInt9000;
			}
			i_1805_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_1811_ = anInt8998;
		    while (i_1811_ < 0) {
			int i_1812_ = anInt8988;
			int i_1813_ = anInt9007 + anInt9009;
			int i_1814_ = anInt9003 + anInt9010;
			int i_1815_ = anInt8999;
			int i_1816_;
			if ((i_1816_ = i_1813_ - (anInt8985 << 12)) >= 0) {
			    i_1816_ = (anInt9001 - i_1816_) / anInt9001;
			    i_1815_ += i_1816_;
			    i_1813_ += anInt9001 * i_1816_;
			    i_1814_ += anInt9000 * i_1816_;
			    i_1812_ += i_1816_;
			}
			if ((i_1816_ = (i_1813_ - anInt9001) / anInt9001)
			    > i_1815_)
			    i_1815_ = i_1816_;
			if (i_1814_ < 0) {
			    i_1816_ = (anInt9000 - 1 - i_1814_) / anInt9000;
			    i_1815_ += i_1816_;
			    i_1813_ += anInt9001 * i_1816_;
			    i_1814_ += anInt9000 * i_1816_;
			    i_1812_ += i_1816_;
			}
			if ((i_1816_ = (1 + i_1814_ - (anInt9002 << 12)
					- anInt9000) / anInt9000)
			    > i_1815_)
			    i_1815_ = i_1816_;
			for (/**/; i_1815_ < 0; i_1815_++) {
			    method17938((i_1814_ >> 12) * anInt8985 + (i_1813_
								       >> 12),
					i_1812_++, is, i, i_1780_);
			    i_1813_ += anInt9001;
			    i_1814_ += anInt9000;
			}
			i_1811_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9000 == 0) {
		int i_1817_ = anInt8998;
		while (i_1817_ < 0) {
		    int i_1818_ = anInt8988;
		    int i_1819_ = anInt9007 + anInt9009;
		    int i_1820_ = anInt9003;
		    int i_1821_ = anInt8999;
		    if (i_1820_ >= 0 && i_1820_ - (anInt9002 << 12) < 0) {
			if (i_1819_ < 0) {
			    int i_1822_
				= (anInt9001 - 1 - i_1819_) / anInt9001;
			    i_1821_ += i_1822_;
			    i_1819_ += anInt9001 * i_1822_;
			    i_1818_ += i_1822_;
			}
			int i_1823_;
			if ((i_1823_ = (1 + i_1819_ - (anInt8985 << 12)
					- anInt9001) / anInt9001)
			    > i_1821_)
			    i_1821_ = i_1823_;
			for (/**/; i_1821_ < 0; i_1821_++) {
			    method17938((i_1820_ >> 12) * anInt8985 + (i_1819_
								       >> 12),
					i_1818_++, is, i, i_1780_);
			    i_1819_ += anInt9001;
			}
		    }
		    i_1817_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else if (anInt9000 < 0) {
		for (int i_1824_ = anInt8998; i_1824_ < 0; i_1824_++) {
		    int i_1825_ = anInt8988;
		    int i_1826_ = anInt9007 + anInt9009;
		    int i_1827_ = anInt9003 + anInt9010;
		    int i_1828_ = anInt8999;
		    if (i_1826_ < 0) {
			int i_1829_ = (anInt9001 - 1 - i_1826_) / anInt9001;
			i_1828_ += i_1829_;
			i_1826_ += anInt9001 * i_1829_;
			i_1827_ += anInt9000 * i_1829_;
			i_1825_ += i_1829_;
		    }
		    int i_1830_;
		    if ((i_1830_ = (1 + i_1826_ - (anInt8985 << 12)
				    - anInt9001) / anInt9001)
			> i_1828_)
			i_1828_ = i_1830_;
		    if ((i_1830_ = i_1827_ - (anInt9002 << 12)) >= 0) {
			i_1830_ = (anInt9000 - i_1830_) / anInt9000;
			i_1828_ += i_1830_;
			i_1826_ += anInt9001 * i_1830_;
			i_1827_ += anInt9000 * i_1830_;
			i_1825_ += i_1830_;
		    }
		    if ((i_1830_ = (i_1827_ - anInt9000) / anInt9000)
			> i_1828_)
			i_1828_ = i_1830_;
		    for (/**/; i_1828_ < 0; i_1828_++) {
			method17938((i_1827_ >> 12) * anInt8985 + (i_1826_
								   >> 12),
				    i_1825_++, is, i, i_1780_);
			i_1826_ += anInt9001;
			i_1827_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else {
		for (int i_1831_ = anInt8998; i_1831_ < 0; i_1831_++) {
		    int i_1832_ = anInt8988;
		    int i_1833_ = anInt9007 + anInt9009;
		    int i_1834_ = anInt9003 + anInt9010;
		    int i_1835_ = anInt8999;
		    if (i_1833_ < 0) {
			int i_1836_ = (anInt9001 - 1 - i_1833_) / anInt9001;
			i_1835_ += i_1836_;
			i_1833_ += anInt9001 * i_1836_;
			i_1834_ += anInt9000 * i_1836_;
			i_1832_ += i_1836_;
		    }
		    int i_1837_;
		    if ((i_1837_ = (1 + i_1833_ - (anInt8985 << 12)
				    - anInt9001) / anInt9001)
			> i_1835_)
			i_1835_ = i_1837_;
		    if (i_1834_ < 0) {
			i_1837_ = (anInt9000 - 1 - i_1834_) / anInt9000;
			i_1835_ += i_1837_;
			i_1833_ += anInt9001 * i_1837_;
			i_1834_ += anInt9000 * i_1837_;
			i_1832_ += i_1837_;
		    }
		    if ((i_1837_ = (1 + i_1834_ - (anInt9002 << 12)
				    - anInt9000) / anInt9000)
			> i_1835_)
			i_1835_ = i_1837_;
		    for (/**/; i_1835_ < 0; i_1835_++) {
			method17938((i_1834_ >> 12) * anInt8985 + (i_1833_
								   >> 12),
				    i_1832_++, is, i, i_1780_);
			i_1833_ += anInt9001;
			i_1834_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    }
	}
    }
    
    Class163_Sub1_Sub1(Class185_Sub2 class185_sub2, int i, int i_1838_) {
	super(class185_sub2, i, i_1838_);
	anIntArray11404 = new int[i * i_1838_];
    }
    
    void method14516(int i, int i_1839_) {
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    if (anInt9001 == 0) {
		if (anInt9000 == 0) {
		    int i_1840_ = anInt8998;
		    while (i_1840_ < 0) {
			int i_1841_ = anInt8988;
			int i_1842_ = anInt9007;
			int i_1843_ = anInt9003;
			int i_1844_ = anInt8999;
			if (i_1842_ >= 0 && i_1843_ >= 0
			    && i_1842_ - (anInt8985 << 12) < 0
			    && i_1843_ - (anInt9002 << 12) < 0) {
			    for (/**/; i_1844_ < 0; i_1844_++)
				method17938(((i_1843_ >> 12) * anInt8985
					     + (i_1842_ >> 12)),
					    i_1841_++, is, i, i_1839_);
			}
			i_1840_++;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_1845_ = anInt8998;
		    while (i_1845_ < 0) {
			int i_1846_ = anInt8988;
			int i_1847_ = anInt9007;
			int i_1848_ = anInt9003 + anInt9010;
			int i_1849_ = anInt8999;
			if (i_1847_ >= 0 && i_1847_ - (anInt8985 << 12) < 0) {
			    int i_1850_;
			    if ((i_1850_ = i_1848_ - (anInt9002 << 12)) >= 0) {
				i_1850_ = (anInt9000 - i_1850_) / anInt9000;
				i_1849_ += i_1850_;
				i_1848_ += anInt9000 * i_1850_;
				i_1846_ += i_1850_;
			    }
			    if ((i_1850_ = (i_1848_ - anInt9000) / anInt9000)
				> i_1849_)
				i_1849_ = i_1850_;
			    for (/**/; i_1849_ < 0; i_1849_++) {
				method17938(((i_1848_ >> 12) * anInt8985
					     + (i_1847_ >> 12)),
					    i_1846_++, is, i, i_1839_);
				i_1848_ += anInt9000;
			    }
			}
			i_1845_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_1851_ = anInt8998;
		    while (i_1851_ < 0) {
			int i_1852_ = anInt8988;
			int i_1853_ = anInt9007;
			int i_1854_ = anInt9003 + anInt9010;
			int i_1855_ = anInt8999;
			if (i_1853_ >= 0 && i_1853_ - (anInt8985 << 12) < 0) {
			    if (i_1854_ < 0) {
				int i_1856_
				    = (anInt9000 - 1 - i_1854_) / anInt9000;
				i_1855_ += i_1856_;
				i_1854_ += anInt9000 * i_1856_;
				i_1852_ += i_1856_;
			    }
			    int i_1857_;
			    if ((i_1857_ = (1 + i_1854_ - (anInt9002 << 12)
					    - anInt9000) / anInt9000)
				> i_1855_)
				i_1855_ = i_1857_;
			    for (/**/; i_1855_ < 0; i_1855_++) {
				method17938(((i_1854_ >> 12) * anInt8985
					     + (i_1853_ >> 12)),
					    i_1852_++, is, i, i_1839_);
				i_1854_ += anInt9000;
			    }
			}
			i_1851_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9001 < 0) {
		if (anInt9000 == 0) {
		    int i_1858_ = anInt8998;
		    while (i_1858_ < 0) {
			int i_1859_ = anInt8988;
			int i_1860_ = anInt9007 + anInt9009;
			int i_1861_ = anInt9003;
			int i_1862_ = anInt8999;
			if (i_1861_ >= 0 && i_1861_ - (anInt9002 << 12) < 0) {
			    int i_1863_;
			    if ((i_1863_ = i_1860_ - (anInt8985 << 12)) >= 0) {
				i_1863_ = (anInt9001 - i_1863_) / anInt9001;
				i_1862_ += i_1863_;
				i_1860_ += anInt9001 * i_1863_;
				i_1859_ += i_1863_;
			    }
			    if ((i_1863_ = (i_1860_ - anInt9001) / anInt9001)
				> i_1862_)
				i_1862_ = i_1863_;
			    for (/**/; i_1862_ < 0; i_1862_++) {
				method17938(((i_1861_ >> 12) * anInt8985
					     + (i_1860_ >> 12)),
					    i_1859_++, is, i, i_1839_);
				i_1860_ += anInt9001;
			    }
			}
			i_1858_++;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_1864_ = anInt8998;
		    while (i_1864_ < 0) {
			int i_1865_ = anInt8988;
			int i_1866_ = anInt9007 + anInt9009;
			int i_1867_ = anInt9003 + anInt9010;
			int i_1868_ = anInt8999;
			int i_1869_;
			if ((i_1869_ = i_1866_ - (anInt8985 << 12)) >= 0) {
			    i_1869_ = (anInt9001 - i_1869_) / anInt9001;
			    i_1868_ += i_1869_;
			    i_1866_ += anInt9001 * i_1869_;
			    i_1867_ += anInt9000 * i_1869_;
			    i_1865_ += i_1869_;
			}
			if ((i_1869_ = (i_1866_ - anInt9001) / anInt9001)
			    > i_1868_)
			    i_1868_ = i_1869_;
			if ((i_1869_ = i_1867_ - (anInt9002 << 12)) >= 0) {
			    i_1869_ = (anInt9000 - i_1869_) / anInt9000;
			    i_1868_ += i_1869_;
			    i_1866_ += anInt9001 * i_1869_;
			    i_1867_ += anInt9000 * i_1869_;
			    i_1865_ += i_1869_;
			}
			if ((i_1869_ = (i_1867_ - anInt9000) / anInt9000)
			    > i_1868_)
			    i_1868_ = i_1869_;
			for (/**/; i_1868_ < 0; i_1868_++) {
			    method17938((i_1867_ >> 12) * anInt8985 + (i_1866_
								       >> 12),
					i_1865_++, is, i, i_1839_);
			    i_1866_ += anInt9001;
			    i_1867_ += anInt9000;
			}
			i_1864_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_1870_ = anInt8998;
		    while (i_1870_ < 0) {
			int i_1871_ = anInt8988;
			int i_1872_ = anInt9007 + anInt9009;
			int i_1873_ = anInt9003 + anInt9010;
			int i_1874_ = anInt8999;
			int i_1875_;
			if ((i_1875_ = i_1872_ - (anInt8985 << 12)) >= 0) {
			    i_1875_ = (anInt9001 - i_1875_) / anInt9001;
			    i_1874_ += i_1875_;
			    i_1872_ += anInt9001 * i_1875_;
			    i_1873_ += anInt9000 * i_1875_;
			    i_1871_ += i_1875_;
			}
			if ((i_1875_ = (i_1872_ - anInt9001) / anInt9001)
			    > i_1874_)
			    i_1874_ = i_1875_;
			if (i_1873_ < 0) {
			    i_1875_ = (anInt9000 - 1 - i_1873_) / anInt9000;
			    i_1874_ += i_1875_;
			    i_1872_ += anInt9001 * i_1875_;
			    i_1873_ += anInt9000 * i_1875_;
			    i_1871_ += i_1875_;
			}
			if ((i_1875_ = (1 + i_1873_ - (anInt9002 << 12)
					- anInt9000) / anInt9000)
			    > i_1874_)
			    i_1874_ = i_1875_;
			for (/**/; i_1874_ < 0; i_1874_++) {
			    method17938((i_1873_ >> 12) * anInt8985 + (i_1872_
								       >> 12),
					i_1871_++, is, i, i_1839_);
			    i_1872_ += anInt9001;
			    i_1873_ += anInt9000;
			}
			i_1870_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9000 == 0) {
		int i_1876_ = anInt8998;
		while (i_1876_ < 0) {
		    int i_1877_ = anInt8988;
		    int i_1878_ = anInt9007 + anInt9009;
		    int i_1879_ = anInt9003;
		    int i_1880_ = anInt8999;
		    if (i_1879_ >= 0 && i_1879_ - (anInt9002 << 12) < 0) {
			if (i_1878_ < 0) {
			    int i_1881_
				= (anInt9001 - 1 - i_1878_) / anInt9001;
			    i_1880_ += i_1881_;
			    i_1878_ += anInt9001 * i_1881_;
			    i_1877_ += i_1881_;
			}
			int i_1882_;
			if ((i_1882_ = (1 + i_1878_ - (anInt8985 << 12)
					- anInt9001) / anInt9001)
			    > i_1880_)
			    i_1880_ = i_1882_;
			for (/**/; i_1880_ < 0; i_1880_++) {
			    method17938((i_1879_ >> 12) * anInt8985 + (i_1878_
								       >> 12),
					i_1877_++, is, i, i_1839_);
			    i_1878_ += anInt9001;
			}
		    }
		    i_1876_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else if (anInt9000 < 0) {
		for (int i_1883_ = anInt8998; i_1883_ < 0; i_1883_++) {
		    int i_1884_ = anInt8988;
		    int i_1885_ = anInt9007 + anInt9009;
		    int i_1886_ = anInt9003 + anInt9010;
		    int i_1887_ = anInt8999;
		    if (i_1885_ < 0) {
			int i_1888_ = (anInt9001 - 1 - i_1885_) / anInt9001;
			i_1887_ += i_1888_;
			i_1885_ += anInt9001 * i_1888_;
			i_1886_ += anInt9000 * i_1888_;
			i_1884_ += i_1888_;
		    }
		    int i_1889_;
		    if ((i_1889_ = (1 + i_1885_ - (anInt8985 << 12)
				    - anInt9001) / anInt9001)
			> i_1887_)
			i_1887_ = i_1889_;
		    if ((i_1889_ = i_1886_ - (anInt9002 << 12)) >= 0) {
			i_1889_ = (anInt9000 - i_1889_) / anInt9000;
			i_1887_ += i_1889_;
			i_1885_ += anInt9001 * i_1889_;
			i_1886_ += anInt9000 * i_1889_;
			i_1884_ += i_1889_;
		    }
		    if ((i_1889_ = (i_1886_ - anInt9000) / anInt9000)
			> i_1887_)
			i_1887_ = i_1889_;
		    for (/**/; i_1887_ < 0; i_1887_++) {
			method17938((i_1886_ >> 12) * anInt8985 + (i_1885_
								   >> 12),
				    i_1884_++, is, i, i_1839_);
			i_1885_ += anInt9001;
			i_1886_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else {
		for (int i_1890_ = anInt8998; i_1890_ < 0; i_1890_++) {
		    int i_1891_ = anInt8988;
		    int i_1892_ = anInt9007 + anInt9009;
		    int i_1893_ = anInt9003 + anInt9010;
		    int i_1894_ = anInt8999;
		    if (i_1892_ < 0) {
			int i_1895_ = (anInt9001 - 1 - i_1892_) / anInt9001;
			i_1894_ += i_1895_;
			i_1892_ += anInt9001 * i_1895_;
			i_1893_ += anInt9000 * i_1895_;
			i_1891_ += i_1895_;
		    }
		    int i_1896_;
		    if ((i_1896_ = (1 + i_1892_ - (anInt8985 << 12)
				    - anInt9001) / anInt9001)
			> i_1894_)
			i_1894_ = i_1896_;
		    if (i_1893_ < 0) {
			i_1896_ = (anInt9000 - 1 - i_1893_) / anInt9000;
			i_1894_ += i_1896_;
			i_1892_ += anInt9001 * i_1896_;
			i_1893_ += anInt9000 * i_1896_;
			i_1891_ += i_1896_;
		    }
		    if ((i_1896_ = (1 + i_1893_ - (anInt9002 << 12)
				    - anInt9000) / anInt9000)
			> i_1894_)
			i_1894_ = i_1896_;
		    for (/**/; i_1894_ < 0; i_1894_++) {
			method17938((i_1893_ >> 12) * anInt8985 + (i_1892_
								   >> 12),
				    i_1891_++, is, i, i_1839_);
			i_1892_ += anInt9001;
			i_1893_ += anInt9000;
		    }
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    }
	}
    }
    
    public void method2674(int i, int i_1897_, int i_1898_, int i_1899_,
			   int[] is, int[] is_1900_, int i_1901_,
			   int i_1902_) {
	method17940(i, i_1897_, i_1898_, i_1899_, is, i_1901_, i_1902_);
    }
    
    void method14511(int[] is, int[] is_1903_, int i, int i_1904_) {
	int[] is_1905_ = aClass185_Sub2_9016.anIntArray9338;
	if (is_1905_ != null) {
	    if (anInt9001 == 0) {
		if (anInt9000 == 0) {
		    int i_1906_ = anInt8998;
		    while (i_1906_ < 0) {
			int i_1907_ = i_1906_ + i_1904_;
			if (i_1907_ >= 0) {
			    if (i_1907_ >= is.length)
				break;
			    int i_1908_ = anInt8988;
			    int i_1909_ = anInt9007;
			    int i_1910_ = anInt9003;
			    int i_1911_ = anInt8999;
			    if (i_1909_ >= 0 && i_1910_ >= 0
				&& i_1909_ - (anInt8985 << 12) < 0
				&& i_1910_ - (anInt9002 << 12) < 0) {
				int i_1912_ = is[i_1907_] - i;
				int i_1913_ = -is_1903_[i_1907_];
				int i_1914_ = i_1912_ - (i_1908_ - anInt8988);
				if (i_1914_ > 0) {
				    i_1908_ += i_1914_;
				    i_1911_ += i_1914_;
				    i_1909_ += anInt9001 * i_1914_;
				    i_1910_ += anInt9000 * i_1914_;
				} else
				    i_1913_ -= i_1914_;
				if (i_1911_ < i_1913_)
				    i_1911_ = i_1913_;
				for (/**/; i_1911_ < 0; i_1911_++) {
				    int i_1915_
					= (anIntArray11404
					   [((i_1910_ >> 12) * anInt8985
					     + (i_1909_ >> 12))]);
				    int i_1916_ = i_1915_ >>> 24;
				    int i_1917_ = 256 - i_1916_;
				    int i_1918_ = is_1905_[i_1908_];
				    is_1905_[i_1908_++]
					= ((((i_1915_ & 0xff00ff) * i_1916_
					     + (i_1918_ & 0xff00ff) * i_1917_)
					    & ~0xff00ff)
					   + (((i_1915_ & 0xff00) * i_1916_
					       + (i_1918_ & 0xff00) * i_1917_)
					      & 0xff0000)) >> 8;
				}
			    }
			}
			i_1906_++;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_1919_ = anInt8998;
		    while (i_1919_ < 0) {
			int i_1920_ = i_1919_ + i_1904_;
			if (i_1920_ >= 0) {
			    if (i_1920_ >= is.length)
				break;
			    int i_1921_ = anInt8988;
			    int i_1922_ = anInt9007;
			    int i_1923_ = anInt9003 + anInt9010;
			    int i_1924_ = anInt8999;
			    if (i_1922_ >= 0
				&& i_1922_ - (anInt8985 << 12) < 0) {
				int i_1925_;
				if ((i_1925_ = i_1923_ - (anInt9002 << 12))
				    >= 0) {
				    i_1925_
					= (anInt9000 - i_1925_) / anInt9000;
				    i_1924_ += i_1925_;
				    i_1923_ += anInt9000 * i_1925_;
				    i_1921_ += i_1925_;
				}
				if ((i_1925_
				     = (i_1923_ - anInt9000) / anInt9000)
				    > i_1924_)
				    i_1924_ = i_1925_;
				int i_1926_ = is[i_1920_] - i;
				int i_1927_ = -is_1903_[i_1920_];
				int i_1928_ = i_1926_ - (i_1921_ - anInt8988);
				if (i_1928_ > 0) {
				    i_1921_ += i_1928_;
				    i_1924_ += i_1928_;
				    i_1922_ += anInt9001 * i_1928_;
				    i_1923_ += anInt9000 * i_1928_;
				} else
				    i_1927_ -= i_1928_;
				if (i_1924_ < i_1927_)
				    i_1924_ = i_1927_;
				for (/**/; i_1924_ < 0; i_1924_++) {
				    int i_1929_
					= (anIntArray11404
					   [((i_1923_ >> 12) * anInt8985
					     + (i_1922_ >> 12))]);
				    int i_1930_ = i_1929_ >>> 24;
				    int i_1931_ = 256 - i_1930_;
				    int i_1932_ = is_1905_[i_1921_];
				    is_1905_[i_1921_++]
					= ((((i_1929_ & 0xff00ff) * i_1930_
					     + (i_1932_ & 0xff00ff) * i_1931_)
					    & ~0xff00ff)
					   + (((i_1929_ & 0xff00) * i_1930_
					       + (i_1932_ & 0xff00) * i_1931_)
					      & 0xff0000)) >> 8;
				    i_1923_ += anInt9000;
				}
			    }
			}
			i_1919_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_1933_ = anInt8998;
		    while (i_1933_ < 0) {
			int i_1934_ = i_1933_ + i_1904_;
			if (i_1934_ >= 0) {
			    if (i_1934_ >= is.length)
				break;
			    int i_1935_ = anInt8988;
			    int i_1936_ = anInt9007;
			    int i_1937_ = anInt9003 + anInt9010;
			    int i_1938_ = anInt8999;
			    if (i_1936_ >= 0
				&& i_1936_ - (anInt8985 << 12) < 0) {
				if (i_1937_ < 0) {
				    int i_1939_ = ((anInt9000 - 1 - i_1937_)
						   / anInt9000);
				    i_1938_ += i_1939_;
				    i_1937_ += anInt9000 * i_1939_;
				    i_1935_ += i_1939_;
				}
				int i_1940_;
				if ((i_1940_ = (1 + i_1937_ - (anInt9002 << 12)
						- anInt9000) / anInt9000)
				    > i_1938_)
				    i_1938_ = i_1940_;
				int i_1941_ = is[i_1934_] - i;
				int i_1942_ = -is_1903_[i_1934_];
				int i_1943_ = i_1941_ - (i_1935_ - anInt8988);
				if (i_1943_ > 0) {
				    i_1935_ += i_1943_;
				    i_1938_ += i_1943_;
				    i_1936_ += anInt9001 * i_1943_;
				    i_1937_ += anInt9000 * i_1943_;
				} else
				    i_1942_ -= i_1943_;
				if (i_1938_ < i_1942_)
				    i_1938_ = i_1942_;
				for (/**/; i_1938_ < 0; i_1938_++) {
				    int i_1944_
					= (anIntArray11404
					   [((i_1937_ >> 12) * anInt8985
					     + (i_1936_ >> 12))]);
				    int i_1945_ = i_1944_ >>> 24;
				    int i_1946_ = 256 - i_1945_;
				    int i_1947_ = is_1905_[i_1935_];
				    is_1905_[i_1935_++]
					= ((((i_1944_ & 0xff00ff) * i_1945_
					     + (i_1947_ & 0xff00ff) * i_1946_)
					    & ~0xff00ff)
					   + (((i_1944_ & 0xff00) * i_1945_
					       + (i_1947_ & 0xff00) * i_1946_)
					      & 0xff0000)) >> 8;
				    i_1937_ += anInt9000;
				}
			    }
			}
			i_1933_++;
			anInt9007 += anInt9008;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9001 < 0) {
		if (anInt9000 == 0) {
		    int i_1948_ = anInt8998;
		    while (i_1948_ < 0) {
			int i_1949_ = i_1948_ + i_1904_;
			if (i_1949_ >= 0) {
			    if (i_1949_ >= is.length)
				break;
			    int i_1950_ = anInt8988;
			    int i_1951_ = anInt9007 + anInt9009;
			    int i_1952_ = anInt9003;
			    int i_1953_ = anInt8999;
			    if (i_1952_ >= 0
				&& i_1952_ - (anInt9002 << 12) < 0) {
				int i_1954_;
				if ((i_1954_ = i_1951_ - (anInt8985 << 12))
				    >= 0) {
				    i_1954_
					= (anInt9001 - i_1954_) / anInt9001;
				    i_1953_ += i_1954_;
				    i_1951_ += anInt9001 * i_1954_;
				    i_1950_ += i_1954_;
				}
				if ((i_1954_
				     = (i_1951_ - anInt9001) / anInt9001)
				    > i_1953_)
				    i_1953_ = i_1954_;
				int i_1955_ = is[i_1949_] - i;
				int i_1956_ = -is_1903_[i_1949_];
				int i_1957_ = i_1955_ - (i_1950_ - anInt8988);
				if (i_1957_ > 0) {
				    i_1950_ += i_1957_;
				    i_1953_ += i_1957_;
				    i_1951_ += anInt9001 * i_1957_;
				    i_1952_ += anInt9000 * i_1957_;
				} else
				    i_1956_ -= i_1957_;
				if (i_1953_ < i_1956_)
				    i_1953_ = i_1956_;
				for (/**/; i_1953_ < 0; i_1953_++) {
				    int i_1958_
					= (anIntArray11404
					   [((i_1952_ >> 12) * anInt8985
					     + (i_1951_ >> 12))]);
				    int i_1959_ = i_1958_ >>> 24;
				    int i_1960_ = 256 - i_1959_;
				    int i_1961_ = is_1905_[i_1950_];
				    is_1905_[i_1950_++]
					= ((((i_1958_ & 0xff00ff) * i_1959_
					     + (i_1961_ & 0xff00ff) * i_1960_)
					    & ~0xff00ff)
					   + (((i_1958_ & 0xff00) * i_1959_
					       + (i_1961_ & 0xff00) * i_1960_)
					      & 0xff0000)) >> 8;
				    i_1951_ += anInt9001;
				}
			    }
			}
			i_1948_++;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else if (anInt9000 < 0) {
		    int i_1962_ = anInt8998;
		    while (i_1962_ < 0) {
			int i_1963_ = i_1962_ + i_1904_;
			if (i_1963_ >= 0) {
			    if (i_1963_ >= is.length)
				break;
			    int i_1964_ = anInt8988;
			    int i_1965_ = anInt9007 + anInt9009;
			    int i_1966_ = anInt9003 + anInt9010;
			    int i_1967_ = anInt8999;
			    int i_1968_;
			    if ((i_1968_ = i_1965_ - (anInt8985 << 12)) >= 0) {
				i_1968_ = (anInt9001 - i_1968_) / anInt9001;
				i_1967_ += i_1968_;
				i_1965_ += anInt9001 * i_1968_;
				i_1966_ += anInt9000 * i_1968_;
				i_1964_ += i_1968_;
			    }
			    if ((i_1968_ = (i_1965_ - anInt9001) / anInt9001)
				> i_1967_)
				i_1967_ = i_1968_;
			    if ((i_1968_ = i_1966_ - (anInt9002 << 12)) >= 0) {
				i_1968_ = (anInt9000 - i_1968_) / anInt9000;
				i_1967_ += i_1968_;
				i_1965_ += anInt9001 * i_1968_;
				i_1966_ += anInt9000 * i_1968_;
				i_1964_ += i_1968_;
			    }
			    if ((i_1968_ = (i_1966_ - anInt9000) / anInt9000)
				> i_1967_)
				i_1967_ = i_1968_;
			    int i_1969_ = is[i_1963_] - i;
			    int i_1970_ = -is_1903_[i_1963_];
			    int i_1971_ = i_1969_ - (i_1964_ - anInt8988);
			    if (i_1971_ > 0) {
				i_1964_ += i_1971_;
				i_1967_ += i_1971_;
				i_1965_ += anInt9001 * i_1971_;
				i_1966_ += anInt9000 * i_1971_;
			    } else
				i_1970_ -= i_1971_;
			    if (i_1967_ < i_1970_)
				i_1967_ = i_1970_;
			    for (/**/; i_1967_ < 0; i_1967_++) {
				int i_1972_ = (anIntArray11404
					       [((i_1966_ >> 12) * anInt8985
						 + (i_1965_ >> 12))]);
				int i_1973_ = i_1972_ >>> 24;
				int i_1974_ = 256 - i_1973_;
				int i_1975_ = is_1905_[i_1964_];
				is_1905_[i_1964_++]
				    = ((((i_1972_ & 0xff00ff) * i_1973_
					 + (i_1975_ & 0xff00ff) * i_1974_)
					& ~0xff00ff)
				       + (((i_1972_ & 0xff00) * i_1973_
					   + (i_1975_ & 0xff00) * i_1974_)
					  & 0xff0000)) >> 8;
				i_1965_ += anInt9001;
				i_1966_ += anInt9000;
			    }
			}
			i_1962_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		} else {
		    int i_1976_ = anInt8998;
		    while (i_1976_ < 0) {
			int i_1977_ = i_1976_ + i_1904_;
			if (i_1977_ >= 0) {
			    if (i_1977_ >= is.length)
				break;
			    int i_1978_ = anInt8988;
			    int i_1979_ = anInt9007 + anInt9009;
			    int i_1980_ = anInt9003 + anInt9010;
			    int i_1981_ = anInt8999;
			    int i_1982_;
			    if ((i_1982_ = i_1979_ - (anInt8985 << 12)) >= 0) {
				i_1982_ = (anInt9001 - i_1982_) / anInt9001;
				i_1981_ += i_1982_;
				i_1979_ += anInt9001 * i_1982_;
				i_1980_ += anInt9000 * i_1982_;
				i_1978_ += i_1982_;
			    }
			    if ((i_1982_ = (i_1979_ - anInt9001) / anInt9001)
				> i_1981_)
				i_1981_ = i_1982_;
			    if (i_1980_ < 0) {
				i_1982_
				    = (anInt9000 - 1 - i_1980_) / anInt9000;
				i_1981_ += i_1982_;
				i_1979_ += anInt9001 * i_1982_;
				i_1980_ += anInt9000 * i_1982_;
				i_1978_ += i_1982_;
			    }
			    if ((i_1982_ = (1 + i_1980_ - (anInt9002 << 12)
					    - anInt9000) / anInt9000)
				> i_1981_)
				i_1981_ = i_1982_;
			    int i_1983_ = is[i_1977_] - i;
			    int i_1984_ = -is_1903_[i_1977_];
			    int i_1985_ = i_1983_ - (i_1978_ - anInt8988);
			    if (i_1985_ > 0) {
				i_1978_ += i_1985_;
				i_1981_ += i_1985_;
				i_1979_ += anInt9001 * i_1985_;
				i_1980_ += anInt9000 * i_1985_;
			    } else
				i_1984_ -= i_1985_;
			    if (i_1981_ < i_1984_)
				i_1981_ = i_1984_;
			    for (/**/; i_1981_ < 0; i_1981_++) {
				int i_1986_ = (anIntArray11404
					       [((i_1980_ >> 12) * anInt8985
						 + (i_1979_ >> 12))]);
				int i_1987_ = i_1986_ >>> 24;
				int i_1988_ = 256 - i_1987_;
				int i_1989_ = is_1905_[i_1978_];
				is_1905_[i_1978_++]
				    = ((((i_1986_ & 0xff00ff) * i_1987_
					 + (i_1989_ & 0xff00ff) * i_1988_)
					& ~0xff00ff)
				       + (((i_1986_ & 0xff00) * i_1987_
					   + (i_1989_ & 0xff00) * i_1988_)
					  & 0xff0000)) >> 8;
				i_1979_ += anInt9001;
				i_1980_ += anInt9000;
			    }
			}
			i_1976_++;
			anInt9007 += anInt9008;
			anInt9003 += anInt9004;
			anInt8988 += anInt8993;
		    }
		}
	    } else if (anInt9000 == 0) {
		int i_1990_ = anInt8998;
		while (i_1990_ < 0) {
		    int i_1991_ = i_1990_ + i_1904_;
		    if (i_1991_ >= 0) {
			if (i_1991_ >= is.length)
			    break;
			int i_1992_ = anInt8988;
			int i_1993_ = anInt9007 + anInt9009;
			int i_1994_ = anInt9003;
			int i_1995_ = anInt8999;
			if (i_1994_ >= 0 && i_1994_ - (anInt9002 << 12) < 0) {
			    if (i_1993_ < 0) {
				int i_1996_
				    = (anInt9001 - 1 - i_1993_) / anInt9001;
				i_1995_ += i_1996_;
				i_1993_ += anInt9001 * i_1996_;
				i_1992_ += i_1996_;
			    }
			    int i_1997_;
			    if ((i_1997_ = (1 + i_1993_ - (anInt8985 << 12)
					    - anInt9001) / anInt9001)
				> i_1995_)
				i_1995_ = i_1997_;
			    int i_1998_ = is[i_1991_] - i;
			    int i_1999_ = -is_1903_[i_1991_];
			    int i_2000_ = i_1998_ - (i_1992_ - anInt8988);
			    if (i_2000_ > 0) {
				i_1992_ += i_2000_;
				i_1995_ += i_2000_;
				i_1993_ += anInt9001 * i_2000_;
				i_1994_ += anInt9000 * i_2000_;
			    } else
				i_1999_ -= i_2000_;
			    if (i_1995_ < i_1999_)
				i_1995_ = i_1999_;
			    for (/**/; i_1995_ < 0; i_1995_++) {
				int i_2001_ = (anIntArray11404
					       [((i_1994_ >> 12) * anInt8985
						 + (i_1993_ >> 12))]);
				int i_2002_ = i_2001_ >>> 24;
				int i_2003_ = 256 - i_2002_;
				int i_2004_ = is_1905_[i_1992_];
				is_1905_[i_1992_++]
				    = ((((i_2001_ & 0xff00ff) * i_2002_
					 + (i_2004_ & 0xff00ff) * i_2003_)
					& ~0xff00ff)
				       + (((i_2001_ & 0xff00) * i_2002_
					   + (i_2004_ & 0xff00) * i_2003_)
					  & 0xff0000)) >> 8;
				i_1993_ += anInt9001;
			    }
			}
		    }
		    i_1990_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else if (anInt9000 < 0) {
		int i_2005_ = anInt8998;
		while (i_2005_ < 0) {
		    int i_2006_ = i_2005_ + i_1904_;
		    if (i_2006_ >= 0) {
			if (i_2006_ >= is.length)
			    break;
			int i_2007_ = anInt8988;
			int i_2008_ = anInt9007 + anInt9009;
			int i_2009_ = anInt9003 + anInt9010;
			int i_2010_ = anInt8999;
			if (i_2008_ < 0) {
			    int i_2011_
				= (anInt9001 - 1 - i_2008_) / anInt9001;
			    i_2010_ += i_2011_;
			    i_2008_ += anInt9001 * i_2011_;
			    i_2009_ += anInt9000 * i_2011_;
			    i_2007_ += i_2011_;
			}
			int i_2012_;
			if ((i_2012_ = (1 + i_2008_ - (anInt8985 << 12)
					- anInt9001) / anInt9001)
			    > i_2010_)
			    i_2010_ = i_2012_;
			if ((i_2012_ = i_2009_ - (anInt9002 << 12)) >= 0) {
			    i_2012_ = (anInt9000 - i_2012_) / anInt9000;
			    i_2010_ += i_2012_;
			    i_2008_ += anInt9001 * i_2012_;
			    i_2009_ += anInt9000 * i_2012_;
			    i_2007_ += i_2012_;
			}
			if ((i_2012_ = (i_2009_ - anInt9000) / anInt9000)
			    > i_2010_)
			    i_2010_ = i_2012_;
			int i_2013_ = is[i_2006_] - i;
			int i_2014_ = -is_1903_[i_2006_];
			int i_2015_ = i_2013_ - (i_2007_ - anInt8988);
			if (i_2015_ > 0) {
			    i_2007_ += i_2015_;
			    i_2010_ += i_2015_;
			    i_2008_ += anInt9001 * i_2015_;
			    i_2009_ += anInt9000 * i_2015_;
			} else
			    i_2014_ -= i_2015_;
			if (i_2010_ < i_2014_)
			    i_2010_ = i_2014_;
			for (/**/; i_2010_ < 0; i_2010_++) {
			    int i_2016_
				= (anIntArray11404
				   [(i_2009_ >> 12) * anInt8985 + (i_2008_
								   >> 12)]);
			    int i_2017_ = i_2016_ >>> 24;
			    int i_2018_ = 256 - i_2017_;
			    int i_2019_ = is_1905_[i_2007_];
			    is_1905_[i_2007_++]
				= ((((i_2016_ & 0xff00ff) * i_2017_
				     + (i_2019_ & 0xff00ff) * i_2018_)
				    & ~0xff00ff)
				   + (((i_2016_ & 0xff00) * i_2017_
				       + (i_2019_ & 0xff00) * i_2018_)
				      & 0xff0000)) >> 8;
			    i_2008_ += anInt9001;
			    i_2009_ += anInt9000;
			}
		    }
		    i_2005_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    } else {
		int i_2020_ = anInt8998;
		while (i_2020_ < 0) {
		    int i_2021_ = i_2020_ + i_1904_;
		    if (i_2021_ >= 0) {
			if (i_2021_ >= is.length)
			    break;
			int i_2022_ = anInt8988;
			int i_2023_ = anInt9007 + anInt9009;
			int i_2024_ = anInt9003 + anInt9010;
			int i_2025_ = anInt8999;
			if (i_2023_ < 0) {
			    int i_2026_
				= (anInt9001 - 1 - i_2023_) / anInt9001;
			    i_2025_ += i_2026_;
			    i_2023_ += anInt9001 * i_2026_;
			    i_2024_ += anInt9000 * i_2026_;
			    i_2022_ += i_2026_;
			}
			int i_2027_;
			if ((i_2027_ = (1 + i_2023_ - (anInt8985 << 12)
					- anInt9001) / anInt9001)
			    > i_2025_)
			    i_2025_ = i_2027_;
			if (i_2024_ < 0) {
			    i_2027_ = (anInt9000 - 1 - i_2024_) / anInt9000;
			    i_2025_ += i_2027_;
			    i_2023_ += anInt9001 * i_2027_;
			    i_2024_ += anInt9000 * i_2027_;
			    i_2022_ += i_2027_;
			}
			if ((i_2027_ = (1 + i_2024_ - (anInt9002 << 12)
					- anInt9000) / anInt9000)
			    > i_2025_)
			    i_2025_ = i_2027_;
			int i_2028_ = is[i_2021_] - i;
			int i_2029_ = -is_1903_[i_2021_];
			int i_2030_ = i_2028_ - (i_2022_ - anInt8988);
			if (i_2030_ > 0) {
			    i_2022_ += i_2030_;
			    i_2025_ += i_2030_;
			    i_2023_ += anInt9001 * i_2030_;
			    i_2024_ += anInt9000 * i_2030_;
			} else
			    i_2029_ -= i_2030_;
			if (i_2025_ < i_2029_)
			    i_2025_ = i_2029_;
			for (/**/; i_2025_ < 0; i_2025_++) {
			    int i_2031_
				= (anIntArray11404
				   [(i_2024_ >> 12) * anInt8985 + (i_2023_
								   >> 12)]);
			    int i_2032_ = i_2031_ >>> 24;
			    int i_2033_ = 256 - i_2032_;
			    int i_2034_ = is_1905_[i_2022_];
			    is_1905_[i_2022_++]
				= ((((i_2031_ & 0xff00ff) * i_2032_
				     + (i_2034_ & 0xff00ff) * i_2033_)
				    & ~0xff00ff)
				   + (((i_2031_ & 0xff00) * i_2032_
				       + (i_2034_ & 0xff00) * i_2033_)
				      & 0xff0000)) >> 8;
			    i_2023_ += anInt9001;
			    i_2024_ += anInt9000;
			}
		    }
		    i_2020_++;
		    anInt9007 += anInt9008;
		    anInt9003 += anInt9004;
		    anInt8988 += anInt8993;
		}
	    }
	}
    }
    
    public void method2737(int i, int i_2035_, int i_2036_, int i_2037_,
			   int[] is, int i_2038_, int i_2039_) {
	i_2039_ -= i_2036_;
	for (int i_2040_ = 0; i_2040_ < i_2037_; i_2040_++) {
	    int i_2041_ = (i_2035_ + i_2040_) * i_2036_ + i;
	    for (int i_2042_ = 0; i_2042_ < i_2036_; i_2042_++)
		anIntArray11404[i_2041_ + i_2042_] = is[i_2038_++];
	    i_2038_ += i_2039_;
	}
    }
    
    public void method2691(int i, int i_2043_, Class145 class145, int i_2044_,
			   int i_2045_) {
	if (aClass185_Sub2_9016.method15054())
	    throw new IllegalStateException();
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is != null) {
	    i += anInt8987;
	    i_2043_ += anInt8989;
	    int i_2046_ = 0;
	    int i_2047_ = aClass185_Sub2_9016.anInt9356 * 356365251;
	    int i_2048_ = anInt8985;
	    int i_2049_ = anInt9002;
	    int i_2050_ = i_2047_ - i_2048_;
	    int i_2051_ = 0;
	    int i_2052_ = i + i_2043_ * i_2047_;
	    if (i_2043_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		int i_2053_
		    = aClass185_Sub2_9016.anInt9344 * 9823353 - i_2043_;
		i_2049_ -= i_2053_;
		i_2043_ = aClass185_Sub2_9016.anInt9344 * 9823353;
		i_2046_ += i_2053_ * i_2048_;
		i_2052_ += i_2053_ * i_2047_;
	    }
	    if (i_2043_ + i_2049_ > aClass185_Sub2_9016.anInt9345 * 639238427)
		i_2049_ -= (i_2043_ + i_2049_
			    - aClass185_Sub2_9016.anInt9345 * 639238427);
	    if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		int i_2054_ = aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		i_2048_ -= i_2054_;
		i = aClass185_Sub2_9016.anInt9365 * 1709859847;
		i_2046_ += i_2054_;
		i_2052_ += i_2054_;
		i_2051_ += i_2054_;
		i_2050_ += i_2054_;
	    }
	    if (i + i_2048_ > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		int i_2055_ = (i + i_2048_
			       - aClass185_Sub2_9016.anInt9343 * -1807368365);
		i_2048_ -= i_2055_;
		i_2051_ += i_2055_;
		i_2050_ += i_2055_;
	    }
	    if (i_2048_ > 0 && i_2049_ > 0) {
		Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
		int[] is_2056_ = class145_sub2.anIntArray9797;
		int[] is_2057_ = class145_sub2.anIntArray9798;
		int i_2058_ = i_2043_;
		if (i_2045_ > i_2058_) {
		    i_2058_ = i_2045_;
		    i_2052_ += (i_2045_ - i_2043_) * i_2047_;
		    i_2046_ += (i_2045_ - i_2043_) * anInt8985;
		}
		int i_2059_
		    = (i_2045_ + is_2056_.length < i_2043_ + i_2049_
		       ? i_2045_ + is_2056_.length : i_2043_ + i_2049_);
		for (int i_2060_ = i_2058_; i_2060_ < i_2059_; i_2060_++) {
		    int i_2061_ = is_2056_[i_2060_ - i_2045_] + i_2044_;
		    int i_2062_ = is_2057_[i_2060_ - i_2045_];
		    int i_2063_ = i_2048_;
		    if (i > i_2061_) {
			int i_2064_ = i - i_2061_;
			if (i_2064_ >= i_2062_) {
			    i_2046_ += i_2048_ + i_2051_;
			    i_2052_ += i_2048_ + i_2050_;
			    continue;
			}
			i_2062_ -= i_2064_;
		    } else {
			int i_2065_ = i_2061_ - i;
			if (i_2065_ >= i_2048_) {
			    i_2046_ += i_2048_ + i_2051_;
			    i_2052_ += i_2048_ + i_2050_;
			    continue;
			}
			i_2046_ += i_2065_;
			i_2063_ -= i_2065_;
			i_2052_ += i_2065_;
		    }
		    int i_2066_ = 0;
		    if (i_2063_ < i_2062_)
			i_2062_ = i_2063_;
		    else
			i_2066_ = i_2063_ - i_2062_;
		    for (int i_2067_ = -i_2062_; i_2067_ < 0; i_2067_++) {
			int i_2068_ = anIntArray11404[i_2046_++];
			int i_2069_ = i_2068_ >>> 24;
			int i_2070_ = 256 - i_2069_;
			int i_2071_ = is[i_2052_];
			is[i_2052_++] = ((((i_2068_ & 0xff00ff) * i_2069_
					   + (i_2071_ & 0xff00ff) * i_2070_)
					  & ~0xff00ff)
					 + (((i_2068_ & 0xff00) * i_2069_
					     + (i_2071_ & 0xff00) * i_2070_)
					    & 0xff0000)) >> 8;
		    }
		    i_2046_ += i_2066_ + i_2051_;
		    i_2052_ += i_2066_ + i_2050_;
		}
	    }
	}
    }
    
    void method14508(boolean bool, boolean bool_2072_, boolean bool_2073_,
		     int i, int i_2074_, float f, int i_2075_, int i_2076_,
		     int i_2077_, int i_2078_, int i_2079_, int i_2080_,
		     boolean bool_2081_) {
	if (i_2075_ > 0 && i_2076_ > 0 && (bool || bool_2072_)) {
	    int i_2082_ = 0;
	    int i_2083_ = 0;
	    int i_2084_ = anInt8987 + anInt8985 + anInt8992;
	    int i_2085_ = anInt8989 + anInt9002 + anInt8990;
	    int i_2086_ = (i_2084_ << 16) / i_2075_;
	    int i_2087_ = (i_2085_ << 16) / i_2076_;
	    if (anInt8987 > 0) {
		int i_2088_ = ((anInt8987 << 16) + i_2086_ - 1) / i_2086_;
		i += i_2088_;
		i_2082_ += i_2088_ * i_2086_ - (anInt8987 << 16);
	    }
	    if (anInt8989 > 0) {
		int i_2089_ = ((anInt8989 << 16) + i_2087_ - 1) / i_2087_;
		i_2074_ += i_2089_;
		i_2083_ += i_2089_ * i_2087_ - (anInt8989 << 16);
	    }
	    if (anInt8985 < i_2084_)
		i_2075_
		    = ((anInt8985 << 16) - i_2082_ + i_2086_ - 1) / i_2086_;
	    if (anInt9002 < i_2085_)
		i_2076_
		    = ((anInt9002 << 16) - i_2083_ + i_2087_ - 1) / i_2087_;
	    int i_2090_
		= i + i_2074_ * (aClass185_Sub2_9016.anInt9356 * 356365251);
	    int i_2091_ = aClass185_Sub2_9016.anInt9356 * 356365251 - i_2075_;
	    if (i_2074_ + i_2076_ > aClass185_Sub2_9016.anInt9345 * 639238427)
		i_2076_ -= (i_2074_ + i_2076_
			    - aClass185_Sub2_9016.anInt9345 * 639238427);
	    if (i_2074_ < aClass185_Sub2_9016.anInt9344 * 9823353) {
		int i_2092_
		    = aClass185_Sub2_9016.anInt9344 * 9823353 - i_2074_;
		i_2076_ -= i_2092_;
		i_2090_
		    += i_2092_ * (aClass185_Sub2_9016.anInt9356 * 356365251);
		i_2083_ += i_2087_ * i_2092_;
	    }
	    if (i + i_2075_ > aClass185_Sub2_9016.anInt9343 * -1807368365) {
		int i_2093_ = (i + i_2075_
			       - aClass185_Sub2_9016.anInt9343 * -1807368365);
		i_2075_ -= i_2093_;
		i_2091_ += i_2093_;
	    }
	    if (i < aClass185_Sub2_9016.anInt9365 * 1709859847) {
		int i_2094_ = aClass185_Sub2_9016.anInt9365 * 1709859847 - i;
		i_2075_ -= i_2094_;
		i_2090_ += i_2094_;
		i_2082_ += i_2086_ * i_2094_;
		i_2091_ += i_2094_;
	    }
	    float[] fs = aClass185_Sub2_9016.aFloatArray9341;
	    int[] is = aClass185_Sub2_9016.anIntArray9338;
	    if (i_2079_ == 0) {
		if (i_2077_ == 1) {
		    int i_2095_ = i_2082_;
		    for (int i_2096_ = -i_2076_; i_2096_ < 0; i_2096_++) {
			int i_2097_ = (i_2083_ >> 16) * anInt8985;
			for (int i_2098_ = -i_2075_; i_2098_ < 0; i_2098_++) {
			    if (!bool_2072_ || f < fs[i_2090_]) {
				if (bool)
				    is[i_2090_]
					= (anIntArray11404
					   [(i_2082_ >> 16) + i_2097_]);
				if (bool_2072_ && bool_2081_)
				    fs[i_2090_] = f;
			    }
			    i_2082_ += i_2086_;
			    i_2090_++;
			}
			i_2083_ += i_2087_;
			i_2082_ = i_2095_;
			i_2090_ += i_2091_;
		    }
		} else if (i_2077_ == 0) {
		    int i_2099_ = (i_2078_ & 0xff0000) >> 16;
		    int i_2100_ = (i_2078_ & 0xff00) >> 8;
		    int i_2101_ = i_2078_ & 0xff;
		    int i_2102_ = i_2082_;
		    for (int i_2103_ = -i_2076_; i_2103_ < 0; i_2103_++) {
			int i_2104_ = (i_2083_ >> 16) * anInt8985;
			for (int i_2105_ = -i_2075_; i_2105_ < 0; i_2105_++) {
			    if (!bool_2072_ || f < fs[i_2090_]) {
				if (bool) {
				    int i_2106_
					= (anIntArray11404
					   [(i_2082_ >> 16) + i_2104_]);
				    int i_2107_
					= ((i_2106_ & 0xff0000) * i_2099_
					   & ~0xffffff);
				    int i_2108_ = ((i_2106_ & 0xff00) * i_2100_
						   & 0xff0000);
				    int i_2109_
					= (i_2106_ & 0xff) * i_2101_ & 0xff00;
				    is[i_2090_]
					= (i_2107_ | i_2108_ | i_2109_) >>> 8;
				}
				if (bool_2072_ && bool_2081_)
				    fs[i_2090_] = f;
			    }
			    i_2082_ += i_2086_;
			    i_2090_++;
			}
			i_2083_ += i_2087_;
			i_2082_ = i_2102_;
			i_2090_ += i_2091_;
		    }
		} else if (i_2077_ == 3) {
		    int i_2110_ = i_2082_;
		    for (int i_2111_ = -i_2076_; i_2111_ < 0; i_2111_++) {
			int i_2112_ = (i_2083_ >> 16) * anInt8985;
			for (int i_2113_ = -i_2075_; i_2113_ < 0; i_2113_++) {
			    if (!bool_2072_ || f < fs[i_2090_]) {
				if (bool) {
				    int i_2114_
					= (anIntArray11404
					   [(i_2082_ >> 16) + i_2112_]);
				    int i_2115_ = i_2114_ + i_2078_;
				    int i_2116_ = ((i_2114_ & 0xff00ff)
						   + (i_2078_ & 0xff00ff));
				    int i_2117_
					= ((i_2116_ & 0x1000100)
					   + (i_2115_ - i_2116_ & 0x10000));
				    is[i_2090_]
					= (i_2115_ - i_2117_
					   | i_2117_ - (i_2117_ >>> 8));
				}
				if (bool_2072_ && bool_2081_)
				    fs[i_2090_] = f;
			    }
			    i_2082_ += i_2086_;
			    i_2090_++;
			}
			i_2083_ += i_2087_;
			i_2082_ = i_2110_;
			i_2090_ += i_2091_;
		    }
		} else if (i_2077_ == 2) {
		    int i_2118_ = i_2078_ >>> 24;
		    int i_2119_ = 256 - i_2118_;
		    int i_2120_ = (i_2078_ & 0xff00ff) * i_2119_ & ~0xff00ff;
		    int i_2121_ = (i_2078_ & 0xff00) * i_2119_ & 0xff0000;
		    i_2078_ = (i_2120_ | i_2121_) >>> 8;
		    int i_2122_ = i_2082_;
		    for (int i_2123_ = -i_2076_; i_2123_ < 0; i_2123_++) {
			int i_2124_ = (i_2083_ >> 16) * anInt8985;
			for (int i_2125_ = -i_2075_; i_2125_ < 0; i_2125_++) {
			    if (!bool_2072_ || f < fs[i_2090_]) {
				if (bool) {
				    int i_2126_
					= (anIntArray11404
					   [(i_2082_ >> 16) + i_2124_]);
				    i_2120_ = ((i_2126_ & 0xff00ff) * i_2118_
					       & ~0xff00ff);
				    i_2121_ = ((i_2126_ & 0xff00) * i_2118_
					       & 0xff0000);
				    is[i_2090_] = (((i_2120_ | i_2121_) >>> 8)
						   + i_2078_);
				}
				if (bool_2072_ && bool_2081_)
				    fs[i_2090_] = f;
			    }
			    i_2082_ += i_2086_;
			    i_2090_++;
			}
			i_2083_ += i_2087_;
			i_2082_ = i_2122_;
			i_2090_ += i_2091_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_2079_ == 1) {
		if (i_2077_ == 1) {
		    int i_2127_ = i_2082_;
		    for (int i_2128_ = -i_2076_; i_2128_ < 0; i_2128_++) {
			int i_2129_ = (i_2083_ >> 16) * anInt8985;
			for (int i_2130_ = -i_2075_; i_2130_ < 0; i_2130_++) {
			    if (!bool_2072_ || f < fs[i_2090_]) {
				if (bool) {
				    int i_2131_
					= (anIntArray11404
					   [(i_2082_ >> 16) + i_2129_]);
				    int i_2132_ = i_2131_ >>> 24;
				    int i_2133_ = 256 - i_2132_;
				    int i_2134_ = is[i_2090_];
				    is[i_2090_]
					= (((((i_2131_ & 0xff00ff) * i_2132_
					      + (i_2134_ & 0xff00ff) * i_2133_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_2131_ & ~0xff00ff) >>> 8)
						* i_2132_)
					       + (((i_2134_ & ~0xff00ff) >>> 8)
						  * i_2133_))
					      & ~0xff00ff));
				}
				if (bool_2072_ && bool_2081_)
				    fs[i_2090_] = f;
			    }
			    i_2082_ += i_2086_;
			    i_2090_++;
			}
			i_2083_ += i_2087_;
			i_2082_ = i_2127_;
			i_2090_ += i_2091_;
		    }
		} else if (i_2077_ == 0) {
		    int i_2135_ = i_2082_;
		    if ((i_2078_ & 0xffffff) == 16777215) {
			for (int i_2136_ = -i_2076_; i_2136_ < 0; i_2136_++) {
			    int i_2137_ = (i_2083_ >> 16) * anInt8985;
			    for (int i_2138_ = -i_2075_; i_2138_ < 0;
				 i_2138_++) {
				if (!bool_2072_ || f < fs[i_2090_]) {
				    if (bool) {
					int i_2139_
					    = (anIntArray11404
					       [(i_2082_ >> 16) + i_2137_]);
					int i_2140_
					    = ((i_2139_ >>> 24) * (i_2078_
								   >>> 24)
					       >> 8);
					int i_2141_ = 256 - i_2140_;
					int i_2142_ = is[i_2090_];
					is[i_2090_]
					    = ((((i_2139_ & 0xff00ff) * i_2140_
						 + ((i_2142_ & 0xff00ff)
						    * i_2141_))
						& ~0xff00ff)
					       + (((i_2139_ & 0xff00) * i_2140_
						   + ((i_2142_ & 0xff00)
						      * i_2141_))
						  & 0xff0000)) >> 8;
				    }
				    if (bool_2072_ && bool_2081_)
					fs[i_2090_] = f;
				}
				i_2082_ += i_2086_;
				i_2090_++;
			    }
			    i_2083_ += i_2087_;
			    i_2082_ = i_2135_;
			    i_2090_ += i_2091_;
			}
		    } else {
			int i_2143_ = (i_2078_ & 0xff0000) >> 16;
			int i_2144_ = (i_2078_ & 0xff00) >> 8;
			int i_2145_ = i_2078_ & 0xff;
			for (int i_2146_ = -i_2076_; i_2146_ < 0; i_2146_++) {
			    int i_2147_ = (i_2083_ >> 16) * anInt8985;
			    for (int i_2148_ = -i_2075_; i_2148_ < 0;
				 i_2148_++) {
				if (!bool_2072_ || f < fs[i_2090_]) {
				    int i_2149_
					= (anIntArray11404
					   [(i_2082_ >> 16) + i_2147_]);
				    int i_2150_
					= ((i_2149_ >>> 24) * (i_2078_ >>> 24)
					   >> 8);
				    int i_2151_ = 256 - i_2150_;
				    if (i_2150_ != 255) {
					if (bool) {
					    int i_2152_
						= (((i_2149_ & 0xff0000)
						    * i_2143_)
						   & ~0xffffff);
					    int i_2153_
						= ((i_2149_ & 0xff00) * i_2144_
						   & 0xff0000);
					    int i_2154_
						= ((i_2149_ & 0xff) * i_2145_
						   & 0xff00);
					    i_2149_ = (i_2152_ | i_2153_
						       | i_2154_) >>> 8;
					    int i_2155_ = is[i_2090_];
					    is[i_2090_]
						= (((((i_2149_ & 0xff00ff)
						      * i_2150_)
						     + ((i_2155_ & 0xff00ff)
							* i_2151_))
						    & ~0xff00ff)
						   + ((((i_2149_ & 0xff00)
							* i_2150_)
						       + ((i_2155_ & 0xff00)
							  * i_2151_))
						      & 0xff0000)) >> 8;
					    if (bool_2073_) {
						int i_2156_ = ((i_2155_ >>> 24)
							       + i_2150_);
						if (i_2156_ > 255)
						    i_2156_ = 255;
						is[i_2090_] |= i_2156_ << 24;
					    }
					}
					if (bool_2072_ && bool_2081_)
					    fs[i_2090_] = f;
				    } else {
					if (bool) {
					    int i_2157_
						= (((i_2149_ & 0xff0000)
						    * i_2143_)
						   & ~0xffffff);
					    int i_2158_
						= ((i_2149_ & 0xff00) * i_2144_
						   & 0xff0000);
					    int i_2159_
						= ((i_2149_ & 0xff) * i_2145_
						   & 0xff00);
					    is[i_2090_] = (i_2157_ | i_2158_
							   | i_2159_) >>> 8;
					}
					if (bool_2072_ && bool_2081_)
					    fs[i_2090_] = f;
				    }
				}
				i_2082_ += i_2086_;
				i_2090_++;
			    }
			    i_2083_ += i_2087_;
			    i_2082_ = i_2135_;
			    i_2090_ += i_2091_;
			}
		    }
		} else if (i_2077_ == 3) {
		    int i_2160_ = i_2082_;
		    for (int i_2161_ = -i_2076_; i_2161_ < 0; i_2161_++) {
			int i_2162_ = (i_2083_ >> 16) * anInt8985;
			for (int i_2163_ = -i_2075_; i_2163_ < 0; i_2163_++) {
			    if (!bool_2072_ || f < fs[i_2090_]) {
				if (bool) {
				    int i_2164_
					= (anIntArray11404
					   [(i_2082_ >> 16) + i_2162_]);
				    int i_2165_ = i_2164_ + i_2078_;
				    int i_2166_ = ((i_2164_ & 0xff00ff)
						   + (i_2078_ & 0xff00ff));
				    int i_2167_
					= ((i_2166_ & 0x1000100)
					   + (i_2165_ - i_2166_ & 0x10000));
				    i_2167_ = (i_2165_ - i_2167_
					       | i_2167_ - (i_2167_ >>> 8));
				    int i_2168_
					= ((i_2167_ >>> 24) * (i_2078_ >>> 24)
					   >> 8);
				    int i_2169_ = 256 - i_2168_;
				    if (i_2168_ != 255) {
					i_2164_ = i_2167_;
					i_2167_ = is[i_2090_];
					i_2167_
					    = ((((i_2164_ & 0xff00ff) * i_2168_
						 + ((i_2167_ & 0xff00ff)
						    * i_2169_))
						& ~0xff00ff)
					       + (((i_2164_ & 0xff00) * i_2168_
						   + ((i_2167_ & 0xff00)
						      * i_2169_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_2090_] = i_2167_;
				}
				if (bool_2072_ && bool_2081_)
				    fs[i_2090_] = f;
			    }
			    i_2082_ += i_2086_;
			    i_2090_++;
			}
			i_2083_ += i_2087_;
			i_2082_ = i_2160_;
			i_2090_ += i_2091_;
		    }
		} else if (i_2077_ == 2) {
		    int i_2170_ = i_2078_ >>> 24;
		    int i_2171_ = 256 - i_2170_;
		    int i_2172_ = (i_2078_ & 0xff00ff) * i_2171_ & ~0xff00ff;
		    int i_2173_ = (i_2078_ & 0xff00) * i_2171_ & 0xff0000;
		    i_2078_ = (i_2172_ | i_2173_) >>> 8;
		    int i_2174_ = i_2082_;
		    for (int i_2175_ = -i_2076_; i_2175_ < 0; i_2175_++) {
			int i_2176_ = (i_2083_ >> 16) * anInt8985;
			for (int i_2177_ = -i_2075_; i_2177_ < 0; i_2177_++) {
			    if (!bool_2072_ || f < fs[i_2090_]) {
				if (bool) {
				    int i_2178_
					= (anIntArray11404
					   [(i_2082_ >> 16) + i_2176_]);
				    int i_2179_ = i_2178_ >>> 24;
				    int i_2180_ = 256 - i_2179_;
				    i_2172_ = ((i_2178_ & 0xff00ff) * i_2170_
					       & ~0xff00ff);
				    i_2173_ = ((i_2178_ & 0xff00) * i_2170_
					       & 0xff0000);
				    i_2178_ = (((i_2172_ | i_2173_) >>> 8)
					       + i_2078_);
				    int i_2181_ = is[i_2090_];
				    is[i_2090_]
					= ((((i_2178_ & 0xff00ff) * i_2179_
					     + (i_2181_ & 0xff00ff) * i_2180_)
					    & ~0xff00ff)
					   + (((i_2178_ & 0xff00) * i_2179_
					       + (i_2181_ & 0xff00) * i_2180_)
					      & 0xff0000)) >> 8;
				}
				if (bool_2072_ && bool_2081_)
				    fs[i_2090_] = f;
			    }
			    i_2082_ += i_2086_;
			    i_2090_++;
			}
			i_2083_ += i_2087_;
			i_2082_ = i_2174_;
			i_2090_ += i_2091_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_2079_ == 2) {
		if (i_2077_ == 1) {
		    int i_2182_ = i_2082_;
		    for (int i_2183_ = -i_2076_; i_2183_ < 0; i_2183_++) {
			int i_2184_ = (i_2083_ >> 16) * anInt8985;
			for (int i_2185_ = -i_2075_; i_2185_ < 0; i_2185_++) {
			    if (!bool_2072_ || f < fs[i_2090_]) {
				int i_2186_ = (anIntArray11404
					       [(i_2082_ >> 16) + i_2184_]);
				if (i_2186_ != 0) {
				    if (bool) {
					int i_2187_ = is[i_2090_];
					int i_2188_ = i_2186_ + i_2187_;
					int i_2189_ = ((i_2186_ & 0xff00ff)
						       + (i_2187_ & 0xff00ff));
					i_2187_ = ((i_2189_ & 0x1000100)
						   + (i_2188_ - i_2189_
						      & 0x10000));
					is[i_2090_]
					    = (i_2188_ - i_2187_
					       | i_2187_ - (i_2187_ >>> 8));
				    }
				    if (bool_2072_ && bool_2081_)
					fs[i_2090_] = f;
				}
			    }
			    i_2082_ += i_2086_;
			    i_2090_++;
			}
			i_2083_ += i_2087_;
			i_2082_ = i_2182_;
			i_2090_ += i_2091_;
		    }
		} else if (i_2077_ == 0) {
		    int i_2190_ = i_2082_;
		    int i_2191_ = (i_2078_ & 0xff0000) >> 16;
		    int i_2192_ = (i_2078_ & 0xff00) >> 8;
		    int i_2193_ = i_2078_ & 0xff;
		    for (int i_2194_ = -i_2076_; i_2194_ < 0; i_2194_++) {
			int i_2195_ = (i_2083_ >> 16) * anInt8985;
			for (int i_2196_ = -i_2075_; i_2196_ < 0; i_2196_++) {
			    if (!bool_2072_ || f < fs[i_2090_]) {
				int i_2197_ = (anIntArray11404
					       [(i_2082_ >> 16) + i_2195_]);
				if (i_2197_ != 0) {
				    if (bool) {
					int i_2198_
					    = ((i_2197_ & 0xff0000) * i_2191_
					       & ~0xffffff);
					int i_2199_
					    = ((i_2197_ & 0xff00) * i_2192_
					       & 0xff0000);
					int i_2200_
					    = ((i_2197_ & 0xff) * i_2193_
					       & 0xff00);
					i_2197_ = (i_2198_ | i_2199_
						   | i_2200_) >>> 8;
					int i_2201_ = is[i_2090_];
					int i_2202_ = i_2197_ + i_2201_;
					int i_2203_ = ((i_2197_ & 0xff00ff)
						       + (i_2201_ & 0xff00ff));
					i_2201_ = ((i_2203_ & 0x1000100)
						   + (i_2202_ - i_2203_
						      & 0x10000));
					is[i_2090_]
					    = (i_2202_ - i_2201_
					       | i_2201_ - (i_2201_ >>> 8));
				    }
				    if (bool_2072_ && bool_2081_)
					fs[i_2090_] = f;
				}
			    }
			    i_2082_ += i_2086_;
			    i_2090_++;
			}
			i_2083_ += i_2087_;
			i_2082_ = i_2190_;
			i_2090_ += i_2091_;
		    }
		} else if (i_2077_ == 3) {
		    int i_2204_ = i_2082_;
		    for (int i_2205_ = -i_2076_; i_2205_ < 0; i_2205_++) {
			int i_2206_ = (i_2083_ >> 16) * anInt8985;
			for (int i_2207_ = -i_2075_; i_2207_ < 0; i_2207_++) {
			    if (!bool_2072_ || f < fs[i_2090_]) {
				if (bool) {
				    int i_2208_
					= (anIntArray11404
					   [(i_2082_ >> 16) + i_2206_]);
				    int i_2209_ = i_2208_ + i_2078_;
				    int i_2210_ = ((i_2208_ & 0xff00ff)
						   + (i_2078_ & 0xff00ff));
				    int i_2211_
					= ((i_2210_ & 0x1000100)
					   + (i_2209_ - i_2210_ & 0x10000));
				    i_2208_ = (i_2209_ - i_2211_
					       | i_2211_ - (i_2211_ >>> 8));
				    i_2211_ = is[i_2090_];
				    i_2209_ = i_2208_ + i_2211_;
				    i_2210_
					= (i_2208_ & 0xff00ff) + (i_2211_
								  & 0xff00ff);
				    i_2211_
					= ((i_2210_ & 0x1000100)
					   + (i_2209_ - i_2210_ & 0x10000));
				    is[i_2090_]
					= (i_2209_ - i_2211_
					   | i_2211_ - (i_2211_ >>> 8));
				}
				if (bool_2072_ && bool_2081_)
				    fs[i_2090_] = f;
			    }
			    i_2082_ += i_2086_;
			    i_2090_++;
			}
			i_2083_ += i_2087_;
			i_2082_ = i_2204_;
			i_2090_ += i_2091_;
		    }
		} else if (i_2077_ == 2) {
		    int i_2212_ = i_2078_ >>> 24;
		    int i_2213_ = 256 - i_2212_;
		    int i_2214_ = (i_2078_ & 0xff00ff) * i_2213_ & ~0xff00ff;
		    int i_2215_ = (i_2078_ & 0xff00) * i_2213_ & 0xff0000;
		    i_2078_ = (i_2214_ | i_2215_) >>> 8;
		    int i_2216_ = i_2082_;
		    for (int i_2217_ = -i_2076_; i_2217_ < 0; i_2217_++) {
			int i_2218_ = (i_2083_ >> 16) * anInt8985;
			for (int i_2219_ = -i_2075_; i_2219_ < 0; i_2219_++) {
			    if (!bool_2072_ || f < fs[i_2090_]) {
				int i_2220_ = (anIntArray11404
					       [(i_2082_ >> 16) + i_2218_]);
				if (i_2220_ != 0) {
				    if (bool) {
					i_2214_
					    = ((i_2220_ & 0xff00ff) * i_2212_
					       & ~0xff00ff);
					i_2215_ = ((i_2220_ & 0xff00) * i_2212_
						   & 0xff0000);
					i_2220_ = (((i_2214_ | i_2215_) >>> 8)
						   + i_2078_);
					int i_2221_ = is[i_2090_];
					int i_2222_ = i_2220_ + i_2221_;
					int i_2223_ = ((i_2220_ & 0xff00ff)
						       + (i_2221_ & 0xff00ff));
					i_2221_ = ((i_2223_ & 0x1000100)
						   + (i_2222_ - i_2223_
						      & 0x10000));
					is[i_2090_]
					    = (i_2222_ - i_2221_
					       | i_2221_ - (i_2221_ >>> 8));
				    }
				    if (bool_2072_ && bool_2081_)
					fs[i_2090_] = f;
				}
			    }
			    i_2082_ += i_2086_;
			    i_2090_++;
			}
			i_2083_ += i_2087_;
			i_2082_ = i_2216_;
			i_2090_ += i_2091_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method17941(int i, int i_2224_, int i_2225_, int i_2226_, int[] is,
		     int i_2227_, int i_2228_) {
	i_2228_ -= i_2225_;
	for (int i_2229_ = 0; i_2229_ < i_2226_; i_2229_++) {
	    int i_2230_ = (i_2224_ + i_2229_) * i_2225_ + i;
	    for (int i_2231_ = 0; i_2231_ < i_2225_; i_2231_++)
		is[i_2227_++] = anIntArray11404[i_2230_ + i_2231_];
	    i_2227_ += i_2228_;
	}
    }
    
    public void method2729(int i, int i_2232_, int i_2233_) {
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is == null)
	    throw new IllegalStateException("");
	if (i_2233_ == 0) {
	    for (int i_2234_ = 0; i_2234_ < anInt9002; i_2234_++) {
		int i_2235_ = i_2234_ * anInt8985;
		int i_2236_
		    = ((i_2232_ + i_2234_) * (aClass185_Sub2_9016.anInt9356
					      * 356365251)
		       + i);
		for (int i_2237_ = 0; i_2237_ < anInt8985; i_2237_++)
		    anIntArray11404[i_2235_ + i_2237_]
			= (anIntArray11404[i_2235_ + i_2237_] & 0xffffff
			   | is[i_2236_ + i_2237_] << 8 & ~0xffffff);
	    }
	} else if (i_2233_ == 1) {
	    for (int i_2238_ = 0; i_2238_ < anInt9002; i_2238_++) {
		int i_2239_ = i_2238_ * anInt8985;
		int i_2240_
		    = ((i_2232_ + i_2238_) * (aClass185_Sub2_9016.anInt9356
					      * 356365251)
		       + i);
		for (int i_2241_ = 0; i_2241_ < anInt8985; i_2241_++)
		    anIntArray11404[i_2239_ + i_2241_]
			= (anIntArray11404[i_2239_ + i_2241_] & 0xffffff
			   | is[i_2240_ + i_2241_] << 16 & ~0xffffff);
	    }
	} else if (i_2233_ == 2) {
	    for (int i_2242_ = 0; i_2242_ < anInt9002; i_2242_++) {
		int i_2243_ = i_2242_ * anInt8985;
		int i_2244_
		    = ((i_2232_ + i_2242_) * (aClass185_Sub2_9016.anInt9356
					      * 356365251)
		       + i);
		for (int i_2245_ = 0; i_2245_ < anInt8985; i_2245_++)
		    anIntArray11404[i_2243_ + i_2245_]
			= (anIntArray11404[i_2243_ + i_2245_] & 0xffffff
			   | is[i_2244_ + i_2245_] << 24 & ~0xffffff);
	    }
	} else if (i_2233_ == 3) {
	    for (int i_2246_ = 0; i_2246_ < anInt9002; i_2246_++) {
		int i_2247_ = i_2246_ * anInt8985;
		int i_2248_
		    = ((i_2232_ + i_2246_) * (aClass185_Sub2_9016.anInt9356
					      * 356365251)
		       + i);
		for (int i_2249_ = 0; i_2249_ < anInt8985; i_2249_++)
		    anIntArray11404[i_2247_ + i_2249_]
			= (anIntArray11404[i_2247_ + i_2249_] & 0xffffff
			   | (is[i_2248_ + i_2249_] != 0 ? -16777216 : 0));
	    }
	}
    }
    
    public Interface22 method2682() {
	return new Class115(anInt8985, anInt9002, anIntArray11404);
    }
    
    public void method2672(int i, int i_2250_, int i_2251_) {
	int[] is = aClass185_Sub2_9016.anIntArray9338;
	if (is == null)
	    throw new IllegalStateException("");
	if (i_2251_ == 0) {
	    for (int i_2252_ = 0; i_2252_ < anInt9002; i_2252_++) {
		int i_2253_ = i_2252_ * anInt8985;
		int i_2254_
		    = ((i_2250_ + i_2252_) * (aClass185_Sub2_9016.anInt9356
					      * 356365251)
		       + i);
		for (int i_2255_ = 0; i_2255_ < anInt8985; i_2255_++)
		    anIntArray11404[i_2253_ + i_2255_]
			= (anIntArray11404[i_2253_ + i_2255_] & 0xffffff
			   | is[i_2254_ + i_2255_] << 8 & ~0xffffff);
	    }
	} else if (i_2251_ == 1) {
	    for (int i_2256_ = 0; i_2256_ < anInt9002; i_2256_++) {
		int i_2257_ = i_2256_ * anInt8985;
		int i_2258_
		    = ((i_2250_ + i_2256_) * (aClass185_Sub2_9016.anInt9356
					      * 356365251)
		       + i);
		for (int i_2259_ = 0; i_2259_ < anInt8985; i_2259_++)
		    anIntArray11404[i_2257_ + i_2259_]
			= (anIntArray11404[i_2257_ + i_2259_] & 0xffffff
			   | is[i_2258_ + i_2259_] << 16 & ~0xffffff);
	    }
	} else if (i_2251_ == 2) {
	    for (int i_2260_ = 0; i_2260_ < anInt9002; i_2260_++) {
		int i_2261_ = i_2260_ * anInt8985;
		int i_2262_
		    = ((i_2250_ + i_2260_) * (aClass185_Sub2_9016.anInt9356
					      * 356365251)
		       + i);
		for (int i_2263_ = 0; i_2263_ < anInt8985; i_2263_++)
		    anIntArray11404[i_2261_ + i_2263_]
			= (anIntArray11404[i_2261_ + i_2263_] & 0xffffff
			   | is[i_2262_ + i_2263_] << 24 & ~0xffffff);
	    }
	} else if (i_2251_ == 3) {
	    for (int i_2264_ = 0; i_2264_ < anInt9002; i_2264_++) {
		int i_2265_ = i_2264_ * anInt8985;
		int i_2266_
		    = ((i_2250_ + i_2264_) * (aClass185_Sub2_9016.anInt9356
					      * 356365251)
		       + i);
		for (int i_2267_ = 0; i_2267_ < anInt8985; i_2267_++)
		    anIntArray11404[i_2265_ + i_2267_]
			= (anIntArray11404[i_2265_ + i_2267_] & 0xffffff
			   | (is[i_2266_ + i_2267_] != 0 ? -16777216 : 0));
	    }
	}
    }
    
    void method17942(int i, int i_2268_, int[] is, int i_2269_, int i_2270_) {
	if (i_2270_ == 0) {
	    if (i_2269_ == 1)
		is[i_2268_] = anIntArray11404[i];
	    else if (i_2269_ == 0) {
		int i_2271_ = anIntArray11404[i++];
		int i_2272_ = (i_2271_ & 0xff0000) * anInt9014 & ~0xffffff;
		int i_2273_ = (i_2271_ & 0xff00) * anInt9015 & 0xff0000;
		int i_2274_ = (i_2271_ & 0xff) * anInt9018 & 0xff00;
		is[i_2268_] = (i_2272_ | i_2273_ | i_2274_) >>> 8;
	    } else if (i_2269_ == 3) {
		int i_2275_ = anIntArray11404[i++];
		int i_2276_ = anInt9011;
		int i_2277_ = i_2275_ + i_2276_;
		int i_2278_ = (i_2275_ & 0xff00ff) + (i_2276_ & 0xff00ff);
		int i_2279_
		    = (i_2278_ & 0x1000100) + (i_2277_ - i_2278_ & 0x10000);
		is[i_2268_] = i_2277_ - i_2279_ | i_2279_ - (i_2279_ >>> 8);
	    } else if (i_2269_ == 2) {
		int i_2280_ = anIntArray11404[i];
		int i_2281_ = (i_2280_ & 0xff00ff) * anInt9012 & ~0xff00ff;
		int i_2282_ = (i_2280_ & 0xff00) * anInt9012 & 0xff0000;
		is[i_2268_] = ((i_2281_ | i_2282_) >>> 8) + anInt9019;
	    } else
		throw new IllegalArgumentException();
	} else if (i_2270_ == 1) {
	    if (i_2269_ == 1) {
		int i_2283_ = anIntArray11404[i];
		int i_2284_ = i_2283_ >>> 24;
		int i_2285_ = 256 - i_2284_;
		int i_2286_ = is[i_2268_];
		is[i_2268_] = ((((i_2283_ & 0xff00ff) * i_2284_
				 + (i_2286_ & 0xff00ff) * i_2285_)
				& ~0xff00ff)
			       + (((i_2283_ & 0xff00) * i_2284_
				   + (i_2286_ & 0xff00) * i_2285_)
				  & 0xff0000)) >> 8;
	    } else if (i_2269_ == 0) {
		int i_2287_ = anIntArray11404[i];
		int i_2288_ = (i_2287_ >>> 24) * anInt9012 >> 8;
		int i_2289_ = 256 - i_2288_;
		if ((anInt9011 & 0xffffff) == 16777215) {
		    int i_2290_ = is[i_2268_];
		    is[i_2268_] = ((((i_2287_ & 0xff00ff) * i_2288_
				     + (i_2290_ & 0xff00ff) * i_2289_)
				    & ~0xff00ff)
				   + (((i_2287_ & 0xff00) * i_2288_
				       + (i_2290_ & 0xff00) * i_2289_)
				      & 0xff0000)) >> 8;
		} else if (i_2288_ != 255) {
		    int i_2291_ = (i_2287_ & 0xff0000) * anInt9014 & ~0xffffff;
		    int i_2292_ = (i_2287_ & 0xff00) * anInt9015 & 0xff0000;
		    int i_2293_ = (i_2287_ & 0xff) * anInt9018 & 0xff00;
		    i_2287_ = (i_2291_ | i_2292_ | i_2293_) >>> 8;
		    int i_2294_ = is[i_2268_];
		    is[i_2268_] = ((((i_2287_ & 0xff00ff) * i_2288_
				     + (i_2294_ & 0xff00ff) * i_2289_)
				    & ~0xff00ff)
				   + (((i_2287_ & 0xff00) * i_2288_
				       + (i_2294_ & 0xff00) * i_2289_)
				      & 0xff0000)) >> 8;
		} else {
		    int i_2295_ = (i_2287_ & 0xff0000) * anInt9014 & ~0xffffff;
		    int i_2296_ = (i_2287_ & 0xff00) * anInt9015 & 0xff0000;
		    int i_2297_ = (i_2287_ & 0xff) * anInt9018 & 0xff00;
		    is[i_2268_] = (i_2295_ | i_2296_ | i_2297_) >>> 8;
		}
	    } else if (i_2269_ == 3) {
		int i_2298_ = anIntArray11404[i];
		int i_2299_ = anInt9011;
		int i_2300_ = i_2298_ + i_2299_;
		int i_2301_ = (i_2298_ & 0xff00ff) + (i_2299_ & 0xff00ff);
		int i_2302_
		    = (i_2301_ & 0x1000100) + (i_2300_ - i_2301_ & 0x10000);
		i_2302_ = i_2300_ - i_2302_ | i_2302_ - (i_2302_ >>> 8);
		int i_2303_ = (i_2298_ >>> 24) * anInt9012 >> 8;
		int i_2304_ = 256 - i_2303_;
		if (i_2303_ != 255) {
		    i_2298_ = i_2302_;
		    i_2302_ = is[i_2268_];
		    i_2302_ = ((((i_2298_ & 0xff00ff) * i_2303_
				 + (i_2302_ & 0xff00ff) * i_2304_)
				& ~0xff00ff)
			       + (((i_2298_ & 0xff00) * i_2303_
				   + (i_2302_ & 0xff00) * i_2304_)
				  & 0xff0000)) >> 8;
		}
		is[i_2268_] = i_2302_;
	    } else if (i_2269_ == 2) {
		int i_2305_ = anIntArray11404[i];
		int i_2306_ = i_2305_ >>> 24;
		int i_2307_ = 256 - i_2306_;
		int i_2308_ = (i_2305_ & 0xff00ff) * anInt9012 & ~0xff00ff;
		int i_2309_ = (i_2305_ & 0xff00) * anInt9012 & 0xff0000;
		i_2305_ = ((i_2308_ | i_2309_) >>> 8) + anInt9019;
		int i_2310_ = is[i_2268_];
		is[i_2268_] = ((((i_2305_ & 0xff00ff) * i_2306_
				 + (i_2310_ & 0xff00ff) * i_2307_)
				& ~0xff00ff)
			       + (((i_2305_ & 0xff00) * i_2306_
				   + (i_2310_ & 0xff00) * i_2307_)
				  & 0xff0000)) >> 8;
	    } else
		throw new IllegalArgumentException();
	} else if (i_2270_ == 2) {
	    if (i_2269_ == 1) {
		int i_2311_ = anIntArray11404[i];
		int i_2312_ = is[i_2268_];
		int i_2313_ = i_2311_ + i_2312_;
		int i_2314_ = (i_2311_ & 0xff00ff) + (i_2312_ & 0xff00ff);
		i_2312_
		    = (i_2314_ & 0x1000100) + (i_2313_ - i_2314_ & 0x10000);
		is[i_2268_] = i_2313_ - i_2312_ | i_2312_ - (i_2312_ >>> 8);
	    } else if (i_2269_ == 0) {
		int i_2315_ = anIntArray11404[i];
		int i_2316_ = (i_2315_ & 0xff0000) * anInt9014 & ~0xffffff;
		int i_2317_ = (i_2315_ & 0xff00) * anInt9015 & 0xff0000;
		int i_2318_ = (i_2315_ & 0xff) * anInt9018 & 0xff00;
		i_2315_ = (i_2316_ | i_2317_ | i_2318_) >>> 8;
		int i_2319_ = is[i_2268_];
		int i_2320_ = i_2315_ + i_2319_;
		int i_2321_ = (i_2315_ & 0xff00ff) + (i_2319_ & 0xff00ff);
		i_2319_
		    = (i_2321_ & 0x1000100) + (i_2320_ - i_2321_ & 0x10000);
		is[i_2268_] = i_2320_ - i_2319_ | i_2319_ - (i_2319_ >>> 8);
	    } else if (i_2269_ == 3) {
		int i_2322_ = anIntArray11404[i];
		int i_2323_ = anInt9011;
		int i_2324_ = i_2322_ + i_2323_;
		int i_2325_ = (i_2322_ & 0xff00ff) + (i_2323_ & 0xff00ff);
		int i_2326_
		    = (i_2325_ & 0x1000100) + (i_2324_ - i_2325_ & 0x10000);
		i_2322_ = i_2324_ - i_2326_ | i_2326_ - (i_2326_ >>> 8);
		i_2326_ = is[i_2268_];
		i_2324_ = i_2322_ + i_2326_;
		i_2325_ = (i_2322_ & 0xff00ff) + (i_2326_ & 0xff00ff);
		i_2326_
		    = (i_2325_ & 0x1000100) + (i_2324_ - i_2325_ & 0x10000);
		is[i_2268_] = i_2324_ - i_2326_ | i_2326_ - (i_2326_ >>> 8);
	    } else if (i_2269_ == 2) {
		int i_2327_ = anIntArray11404[i];
		int i_2328_ = (i_2327_ & 0xff00ff) * anInt9012 & ~0xff00ff;
		int i_2329_ = (i_2327_ & 0xff00) * anInt9012 & 0xff0000;
		i_2327_ = ((i_2328_ | i_2329_) >>> 8) + anInt9019;
		int i_2330_ = is[i_2268_];
		int i_2331_ = i_2327_ + i_2330_;
		int i_2332_ = (i_2327_ & 0xff00ff) + (i_2330_ & 0xff00ff);
		i_2330_
		    = (i_2332_ & 0x1000100) + (i_2331_ - i_2332_ & 0x10000);
		is[i_2268_] = i_2331_ - i_2330_ | i_2330_ - (i_2330_ >>> 8);
	    }
	} else
	    throw new IllegalArgumentException();
    }
}
