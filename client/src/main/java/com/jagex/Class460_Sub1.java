/* Class460_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class460_Sub1 extends Class460
{
    static boolean aBool10333;
    static int[] anIntArray10334;
    static final int anInt10335 = 0;
    static final int anInt10336 = 1;
    static final int anInt10337 = 2;
    Class44_Sub13 aClass44_Sub13_10338;
    static int[] anIntArray10339;
    static int[] anIntArray10340;
    static boolean aBool10341 = false;
    static final int anInt10342 = 3;
    static int[] anIntArray10343;
    Class616 aClass616_10344;
    int anInt10345 = 218513323;
    static int anInt10346;
    
    public final void method15937
	(Class185 class185, Class534_Sub40 class534_sub40, int i, int i_0_) {
	if (!aBool5002) {
	    class534_sub40.anInt10811 += 1785150424;
	    boolean bool = false;
	    Class634 class634 = null;
	    boolean bool_1_ = false;
	    while (class534_sub40.anInt10811 * 31645619
		   < class534_sub40.aByteArray10810.length) {
		int i_2_ = class534_sub40.method16527(-1184105643);
		if (0 == i_2_) {
		    if (null == class634)
			class634
			    = new Class634(class534_sub40, aClass616_10344);
		    else
			class634.method10521(class534_sub40, aClass616_10344,
					     1676599016);
		} else if (1 == i_2_) {
		    int i_3_ = class534_sub40.method16527(1806412374);
		    if (i_3_ > 0) {
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
			    Class561 class561
				= new Class561(class185,
					       (aClass556_4984.anInt7422
						* 941710601),
					       class534_sub40, 2);
			    if (-1065201513 * class561.anInt7519 == 31) {
				Class78 class78
				    = ((Class78)
				       (Class200_Sub10.aClass44_Sub20_9926
					    .method91
					(class534_sub40.method16529((byte) 1),
					 -1698376121)));
				class561.method9437
				    (class78.anInt823 * -1260868599,
				     -799202129 * class78.anInt824,
				     -1111788061 * class78.anInt821,
				     94447489 * class78.anInt822, 539995367);
			    }
			    if (class185.method3344() > 0) {
				Class534_Sub21 class534_sub21
				    = class561.aClass534_Sub21_7541;
				int i_5_
				    = (class534_sub21.method16197(1417533671)
				       + (i << 9));
				int i_6_
				    = (class534_sub21.method16199((byte) -59)
				       + (i_0_ << 9));
				int i_7_ = i_5_ >> 9;
				int i_8_ = i_6_ >> 9;
				if (i_7_ >= 0 && i_8_ >= 0
				    && i_7_ < -60640777 * anInt4992
				    && i_8_ < -1584311401 * anInt5051) {
				    class534_sub21.method16204
					(i_5_,
					 ((anIntArrayArrayArray4995
					   [class561.anInt7544 * 551684827]
					   [i_7_][i_8_])
					  - class534_sub21
						.method16226(-1175380668)),
					 i_6_, -1140628480);
				    aClass556_4984.method9260(class561,
							      1602888355);
				}
			    }
			}
		    }
		} else if (i_2_ == 2) {
		    if (class634 == null)
			class634 = new Class634();
		    class634.method10505(class534_sub40, 303315925);
		} else if (i_2_ == 3) {
		    if (class634 == null)
			class634 = new Class634();
		    class634.method10516(class534_sub40, 1034384094);
		} else if (i_2_ == 128) {
		    if (class634 == null)
			class634 = new Class634();
		    class634.method10508(class534_sub40, aClass616_10344,
					 (byte) -48);
		} else if (129 == i_2_) {
		    if (aByteArrayArrayArray5067 == null)
			aByteArrayArrayArray5067 = new byte[4][][];
		    for (int i_9_ = 0; i_9_ < 4; i_9_++) {
			byte i_10_ = class534_sub40.method16586((byte) 1);
			if (0 == i_10_
			    && null != aByteArrayArrayArray5067[i_9_]) {
			    int i_11_ = i;
			    int i_12_ = i + 64;
			    int i_13_ = i_0_;
			    int i_14_ = 64 + i_0_;
			    if (i_11_ < 0)
				i_11_ = 0;
			    else if (i_11_ >= anInt4992 * -60640777)
				i_11_ = -60640777 * anInt4992;
			    if (i_12_ < 0)
				i_12_ = 0;
			    else if (i_12_ >= -60640777 * anInt4992)
				i_12_ = -60640777 * anInt4992;
			    if (i_13_ < 0)
				i_13_ = 0;
			    else if (i_13_ >= -1584311401 * anInt5051)
				i_13_ = anInt5051 * -1584311401;
			    if (i_14_ < 0)
				i_14_ = 0;
			    else if (i_14_ >= -1584311401 * anInt5051)
				i_14_ = anInt5051 * -1584311401;
			    for (/**/; i_11_ < i_12_; i_11_++) {
				for (/**/; i_13_ < i_14_; i_13_++)
				    aByteArrayArrayArray5067[i_9_][i_11_]
					[i_13_]
					= (byte) 0;
			    }
			} else if (1 == i_10_) {
			    if (null == aByteArrayArrayArray5067[i_9_])
				aByteArrayArrayArray5067[i_9_]
				    = (new byte[anInt4992 * -60640777 + 1]
				       [-1584311401 * anInt5051 + 1]);
			    for (int i_15_ = 0; i_15_ < 64; i_15_ += 4) {
				for (int i_16_ = 0; i_16_ < 64; i_16_ += 4) {
				    byte i_17_
					= class534_sub40.method16586((byte) 1);
				    for (int i_18_ = i + i_15_;
					 i_18_ < 4 + (i + i_15_); i_18_++) {
					for (int i_19_ = i_0_ + i_16_;
					     i_19_ < i_16_ + i_0_ + 4;
					     i_19_++) {
					    if (i_18_ >= 0
						&& (i_18_
						    < -60640777 * anInt4992)
						&& i_19_ >= 0
						&& (i_19_
						    < anInt5051 * -1584311401))
						aByteArrayArrayArray5067
						    [i_9_][i_18_][i_19_]
						    = i_17_;
					}
				    }
				}
			    }
			} else if (2 == i_10_) {
			    if (aByteArrayArrayArray5067[i_9_] == null)
				aByteArrayArrayArray5067[i_9_]
				    = (new byte[1 + anInt4992 * -60640777]
				       [1 + anInt5051 * -1584311401]);
			    if (i_9_ > 0) {
				int i_20_ = i;
				int i_21_ = i + 64;
				int i_22_ = i_0_;
				int i_23_ = i_0_ + 64;
				if (i_20_ < 0)
				    i_20_ = 0;
				else if (i_20_ >= anInt4992 * -60640777)
				    i_20_ = -60640777 * anInt4992;
				if (i_21_ < 0)
				    i_21_ = 0;
				else if (i_21_ >= -60640777 * anInt4992)
				    i_21_ = anInt4992 * -60640777;
				if (i_22_ < 0)
				    i_22_ = 0;
				else if (i_22_ >= -1584311401 * anInt5051)
				    i_22_ = -1584311401 * anInt5051;
				if (i_23_ < 0)
				    i_23_ = 0;
				else if (i_23_ >= -1584311401 * anInt5051)
				    i_23_ = anInt5051 * -1584311401;
				for (/**/; i_20_ < i_21_; i_20_++) {
				    for (/**/; i_22_ < i_23_; i_22_++)
					aByteArrayArrayArray5067[i_9_]
					    [i_20_][i_22_]
					    = (aByteArrayArrayArray5067
					       [i_9_ - 1][i_20_][i_22_]);
				}
			    }
			}
		    }
		    bool = true;
		} else if (130 == i_2_)
		    bool_1_ = true;
		else
		    throw new IllegalStateException("");
	    }
	    for (int i_24_ = 0; i_24_ < 8; i_24_++) {
		for (int i_25_ = 0; i_25_ < 8; i_25_++) {
		    int i_26_ = i_24_ + (i >> 3);
		    int i_27_ = (i_0_ >> 3) + i_25_;
		    if (i_26_ >= 0 && i_26_ < -60640777 * anInt4992 >> 3
			&& i_27_ >= 0
			&& i_27_ < -1584311401 * anInt5051 >> 3) {
			if (class634 != null)
			    aClass616_10344.method10151(i_26_, i_27_, class634,
							(byte) -11);
			Class286.method5265(i_26_, i_27_, bool_1_,
					    (short) 2048);
		    }
		}
	    }
	    if (!bool && null != aByteArrayArrayArray5067) {
		for (int i_28_ = 0; i_28_ < 4; i_28_++) {
		    if (null != aByteArrayArrayArray5067[i_28_]) {
			for (int i_29_ = 0; i_29_ < 16; i_29_++) {
			    for (int i_30_ = 0; i_30_ < 16; i_30_++) {
				int i_31_ = (i >> 2) + i_29_;
				int i_32_ = (i_0_ >> 2) + i_30_;
				if (i_31_ >= 0 && i_31_ < 26 && i_32_ >= 0
				    && i_32_ < 26)
				    aByteArrayArrayArray5067[i_28_][i_31_]
					[i_32_]
					= (byte) 0;
			    }
			}
		    }
		}
	    }
	}
    }
    
    static final boolean method15938(Class44_Sub13 class44_sub13, int i,
				     int i_33_) {
	Class602 class602 = (Class602) class44_sub13.method91(i, -511753982);
	if (i_33_ == 11)
	    i_33_ = 10;
	if (i_33_ >= 5 && i_33_ <= 8)
	    i_33_ = 4;
	return class602.method10000(i_33_, (byte) 90);
    }
    
    public final void method15939(Class185 class185, byte[] is, int i,
				  int i_34_) {
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	int i_35_ = -1;
	for (;;) {
	    int i_36_ = class534_sub40.method16598((byte) 8);
	    if (0 == i_36_)
		break;
	    i_35_ += i_36_;
	    int i_37_ = 0;
	    for (;;) {
		int i_38_ = class534_sub40.method16546(-1706829710);
		if (0 == i_38_)
		    break;
		i_37_ += i_38_ - 1;
		int i_39_ = i_37_ & 0x3f;
		int i_40_ = i_37_ >> 6 & 0x3f;
		int i_41_ = i_37_ >> 12;
		int i_42_ = class534_sub40.method16527(-1884793304);
		int i_43_ = i_42_ >> 2;
		int i_44_ = i_42_ & 0x3;
		int i_45_ = i + i_40_;
		int i_46_ = i_39_ + i_34_;
		Class602 class602
		    = ((Class602)
		       aClass44_Sub13_10338.method91(i_35_, -132961813));
		int i_47_;
		int i_48_;
		if ((i_44_ & 0x1) == 0) {
		    i_47_ = class602.anInt7904 * -1082258489;
		    i_48_ = -1990374967 * class602.anInt7928;
		} else {
		    i_47_ = class602.anInt7928 * -1990374967;
		    i_48_ = -1082258489 * class602.anInt7904;
		}
		int i_49_ = i_45_ + i_47_;
		int i_50_ = i_48_ + i_46_;
		if (i_45_ < anInt4992 * -60640777
		    && i_46_ < -1584311401 * anInt5051 && i_49_ > 0
		    && i_50_ > 0
		    && (847393323 * Class595.aClass595_7836.anInt7852 == i_43_
			|| (i_43_
			    == 847393323 * Class595.aClass595_7850.anInt7852)
			|| (i_45_ > 0 && i_46_ > 0
			    && i_45_ < anInt4992 * -60640777 - 1
			    && i_46_ < anInt5051 * -1584311401 - 1)))
		    method15942(class185, i_41_, i_41_, i_45_, i_46_, i_35_,
				i_44_, i_43_, -1, 0, 4222574);
	    }
	}
    }
    
    public final void method15940(Class185 class185, byte[] is, int i,
				  int i_51_, int i_52_) {
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	int i_53_ = -1;
	for (;;) {
	    int i_54_ = class534_sub40.method16598((byte) 8);
	    if (0 == i_54_)
		break;
	    i_53_ += i_54_;
	    int i_55_ = 0;
	    for (;;) {
		int i_56_ = class534_sub40.method16546(-1706829710);
		if (0 == i_56_)
		    break;
		i_55_ += i_56_ - 1;
		int i_57_ = i_55_ & 0x3f;
		int i_58_ = i_55_ >> 6 & 0x3f;
		int i_59_ = i_55_ >> 12;
		int i_60_ = class534_sub40.method16527(570494288);
		int i_61_ = i_60_ >> 2;
		int i_62_ = i_60_ & 0x3;
		int i_63_ = i + i_58_;
		int i_64_ = i_57_ + i_51_;
		Class602 class602
		    = ((Class602)
		       aClass44_Sub13_10338.method91(i_53_, 1329782449));
		int i_65_;
		int i_66_;
		if ((i_62_ & 0x1) == 0) {
		    i_65_ = class602.anInt7904 * -1082258489;
		    i_66_ = -1990374967 * class602.anInt7928;
		} else {
		    i_65_ = class602.anInt7928 * -1990374967;
		    i_66_ = -1082258489 * class602.anInt7904;
		}
		int i_67_ = i_63_ + i_65_;
		int i_68_ = i_66_ + i_64_;
		if (i_63_ < anInt4992 * -60640777
		    && i_64_ < -1584311401 * anInt5051 && i_67_ > 0
		    && i_68_ > 0
		    && (847393323 * Class595.aClass595_7836.anInt7852 == i_61_
			|| (i_61_
			    == 847393323 * Class595.aClass595_7850.anInt7852)
			|| (i_63_ > 0 && i_64_ > 0
			    && i_63_ < anInt4992 * -60640777 - 1
			    && i_64_ < anInt5051 * -1584311401 - 1)))
		    method15942(class185, i_59_, i_59_, i_63_, i_64_, i_53_,
				i_62_, i_61_, -1, 0, 1430789342);
	    }
	}
    }
    
    public final void method15941(Class185 class185, byte[] is, int i,
				  int i_69_, int i_70_, int i_71_, int i_72_,
				  int i_73_, int i_74_, byte i_75_) {
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	int i_76_ = -1;
	for (;;) {
	    int i_77_ = class534_sub40.method16598((byte) 8);
	    if (0 == i_77_)
		break;
	    i_76_ += i_77_;
	    int i_78_ = 0;
	    for (;;) {
		int i_79_ = class534_sub40.method16546(-1706829710);
		if (0 == i_79_)
		    break;
		i_78_ += i_79_ - 1;
		int i_80_ = i_78_ & 0x3f;
		int i_81_ = i_78_ >> 6 & 0x3f;
		int i_82_ = i_78_ >> 12;
		int i_83_ = class534_sub40.method16527(1450285919);
		int i_84_ = i_83_ >> 2;
		int i_85_ = i_83_ & 0x3;
		if (i_71_ == i_82_ && i_81_ >= i_72_ && i_81_ < i_72_ + 8
		    && i_80_ >= i_73_ && i_80_ < 8 + i_73_) {
		    Class602 class602
			= ((Class602)
			   aClass44_Sub13_10338.method91(i_76_, 375593414));
		    int i_86_;
		    int i_87_;
		    if ((i_85_ & 0x1) == 0) {
			i_86_ = class602.anInt7904 * -1082258489;
			i_87_ = class602.anInt7928 * -1990374967;
		    } else {
			i_86_ = -1990374967 * class602.anInt7928;
			i_87_ = class602.anInt7904 * -1082258489;
		    }
		    int i_88_
			= i_69_ + Class408.method6691(i_81_ & 0x7, i_80_ & 0x7,
						      i_74_,
						      (-1082258489
						       * class602.anInt7904),
						      (-1990374967
						       * class602.anInt7928),
						      i_85_, 2008003645);
		    int i_89_
			= i_70_ + Class212.method4014(i_81_ & 0x7, i_80_ & 0x7,
						      i_74_,
						      (-1082258489
						       * class602.anInt7904),
						      (class602.anInt7928
						       * -1990374967),
						      i_85_, -389587627);
		    int i_90_ = i_86_ + i_88_;
		    int i_91_ = i_87_ + i_89_;
		    if (i_88_ < -60640777 * anInt4992
			&& i_89_ < -1584311401 * anInt5051 && i_90_ > 0
			&& i_91_ > 0
			&& ((Class595.aClass595_7836.anInt7852 * 847393323
			     == i_84_)
			    || (Class595.aClass595_7850.anInt7852 * 847393323
				== i_84_)
			    || (i_88_ > 0 && i_89_ > 0
				&& i_88_ < -60640777 * anInt4992 - 1
				&& i_89_ < -1584311401 * anInt5051 - 1)))
			method15942(class185, i, i, i_88_, i_89_, i_76_,
				    i_85_ + i_74_ & 0x3, i_84_, -1, 0,
				    1378674746);
		}
	    }
	}
    }
    
    final void method15942(Class185 class185, int i, int i_92_, int i_93_,
			   int i_94_, int i_95_, int i_96_, int i_97_,
			   int i_98_, int i_99_, int i_100_) {
	if (i_92_ < 602499625 * anInt10345)
	    anInt10345 = i_92_ * -301477351;
	Class602 class602
	    = (Class602) aClass44_Sub13_10338.method91(i_95_, -1740934956);
	if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub16_10763
		.method17030((byte) -65) != 0
	    || !class602.aBool7953) {
	    int i_101_;
	    int i_102_;
	    if (i_96_ == 1 || i_96_ == 3) {
		i_101_ = -1990374967 * class602.anInt7928;
		i_102_ = -1082258489 * class602.anInt7904;
	    } else {
		i_101_ = class602.anInt7904 * -1082258489;
		i_102_ = class602.anInt7928 * -1990374967;
	    }
	    int i_103_;
	    int i_104_;
	    if (i_93_ + i_101_ <= anInt4992 * -60640777) {
		i_103_ = i_93_ + (i_101_ >> 1);
		i_104_ = i_93_ + (i_101_ + 1 >> 1);
	    } else {
		i_103_ = i_93_;
		i_104_ = 1 + i_93_;
	    }
	    int i_105_;
	    int i_106_;
	    if (i_94_ + i_102_ <= -1584311401 * anInt5051) {
		i_105_ = i_94_ + (i_102_ >> 1);
		i_106_ = (i_102_ + 1 >> 1) + i_94_;
	    } else {
		i_105_ = i_94_;
		i_106_ = 1 + i_94_;
	    }
	    Class151 class151 = aClass556_4984.aClass151Array7432[i];
	    int i_107_;
	    if (847393323 * Class595.aClass595_7836.anInt7852 == i_97_
		|| i_97_ == Class595.aClass595_7850.anInt7852 * 847393323)
		i_107_ = ((class151.method2499(i_103_, i_105_, -2143615951)
			   + class151.method2499(i_104_, i_105_, -2130865994)
			   + class151.method2499(i_103_, i_106_, -2123355212)
			   + class151.method2499(i_104_, i_106_, -2131540060))
			  >> 2);
	    else
		i_107_
		    = (class151.method2491(i_103_, i_105_, -845724870)
		       + class151.method2491(i_104_, i_105_, 1857899877)
		       + class151.method2491(i_103_, i_106_, -814078082)
		       + class151.method2491(i_104_, i_106_, -272267369)) >> 2;
	    int i_108_ = (i_101_ << 8) + (i_93_ << 9);
	    int i_109_ = (i_94_ << 9) + (i_102_ << 8);
	    boolean bool = aBool4997 && !aBool5002 && class602.aBool7910;
	    if (class602.method9983((short) -29440))
		Class449.method7330(i_92_, i_93_, i_94_, i_96_, class602, null,
				    null, 1930945358);
	    boolean bool_110_
		= (i_98_ == -1
		   && (!class602.method10015((byte) -64)
		       || (class602.aBool7916
			   && Class44_Sub6.aClass534_Sub35_10989
				  .aClass690_Sub30_10739
				  .method17143(-1569503751) == 0))
		   && null == class602.anIntArray7943 && !class602.aBool7957
		   && !class602.aBool7961);
	    if (!aBool10341
		|| ((!Class176.method2926(i_97_, (byte) 97)
		     || 1216611823 * class602.anInt7911 == 1)
		    && (!Class181.method2979(i_97_, (byte) -8)
			|| class602.anInt7911 * 1216611823 != 0))) {
		if (847393323 * Class595.aClass595_7846.anInt7852 == i_97_) {
		    if (Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub10_10751.method16970((byte) 12) != 0
			|| 0 != class602.anInt7907 * -2134171963
			|| class602.anInt7923 * -499459421 == 1
			|| class602.aBool7938) {
			Class654_Sub1_Sub2 class654_sub1_sub2;
			if (bool_110_) {
			    Class654_Sub1_Sub2_Sub1 class654_sub1_sub2_sub1
				= (new Class654_Sub1_Sub2_Sub1
				   (aClass556_4984, class185,
				    aClass44_Sub13_10338, class602, i_92_, i,
				    i_108_, i_107_, i_109_, aBool5002, i_96_,
				    bool));
			    if (class654_sub1_sub2_sub1.method419((byte) 2))
				class654_sub1_sub2_sub1.method408(class185,
								  (byte) 68);
			    class654_sub1_sub2 = class654_sub1_sub2_sub1;
			} else
			    class654_sub1_sub2
				= (new Class654_Sub1_Sub2_Sub2
				   (aClass556_4984, class185,
				    aClass44_Sub13_10338, class602, i_92_, i,
				    i_108_, i_107_, i_109_, aBool5002, i_96_,
				    i_98_, i_99_));
			aClass556_4984.method9242(i_92_, i_93_, i_94_,
						  class654_sub1_sub2,
						  1759596351);
		    }
		} else if ((i_97_
			    == 847393323 * Class595.aClass595_7836.anInt7852)
			   || i_97_ == (Class595.aClass595_7850.anInt7852
					* 847393323)) {
		    Class654_Sub1_Sub5_Sub2 class654_sub1_sub5_sub2 = null;
		    Class654_Sub1_Sub5 class654_sub1_sub5;
		    int i_111_;
		    if (bool_110_) {
			Class654_Sub1_Sub5_Sub2 class654_sub1_sub5_sub2_112_
			    = (new Class654_Sub1_Sub5_Sub2
			       (aClass556_4984, class185, aClass44_Sub13_10338,
				class602, i_92_, i, i_108_, i_107_, i_109_,
				aBool5002, i_93_, i_101_ + i_93_ - 1, i_94_,
				i_94_ + i_102_ - 1, i_97_, i_96_, bool,
				(class602.aClass593_7963
				 != Class593.aClass593_7822)));
			i_111_ = class654_sub1_sub5_sub2_112_
				     .method18623(-1960896189);
			class654_sub1_sub5 = class654_sub1_sub5_sub2_112_;
			class654_sub1_sub5_sub2 = class654_sub1_sub5_sub2_112_;
		    } else {
			class654_sub1_sub5
			    = (new Class654_Sub1_Sub5_Sub3
			       (aClass556_4984, class185, aClass44_Sub13_10338,
				class602, i_92_, i, i_108_, i_107_, i_109_,
				aBool5002, i_93_, i_101_ + i_93_ - 1, i_94_,
				i_102_ + i_94_ - 1, i_97_, i_96_, i_98_, i_99_,
				(Class593.aClass593_7822
				 != class602.aClass593_7963)));
			i_111_ = 15;
		    }
		    if (aClass556_4984.method9246(class654_sub1_sub5, false,
						  (byte) 8)) {
			if (class654_sub1_sub5_sub2 != null
			    && class654_sub1_sub5_sub2.method419((byte) 2))
			    class654_sub1_sub5_sub2.method408(class185,
							      (byte) 7);
			if (class602.aBool7959 && aBool4997) {
			    if (i_111_ > 30)
				i_111_ = 30;
			    for (int i_113_ = 0; i_113_ <= i_101_; i_113_++) {
				for (int i_114_ = 0; i_114_ <= i_102_;
				     i_114_++)
				    class151.method2492(i_113_ + i_93_,
							i_94_ + i_114_,
							i_111_);
			    }
			}
		    }
		} else if (Class181.method2979(i_97_, (byte) -35)
			   || Class255.method4648(i_97_, (byte) -6)) {
		    Class654_Sub1_Sub5 class654_sub1_sub5;
		    if (bool_110_) {
			Class654_Sub1_Sub5_Sub2 class654_sub1_sub5_sub2
			    = (new Class654_Sub1_Sub5_Sub2
			       (aClass556_4984, class185, aClass44_Sub13_10338,
				class602, i_92_, i, i_108_, i_107_, i_109_,
				aBool5002, i_93_, i_101_ + i_93_ - 1, i_94_,
				i_94_ + i_102_ - 1, i_97_, i_96_, bool, true));
			if (class654_sub1_sub5_sub2.method419((byte) 2))
			    class654_sub1_sub5_sub2.method408(class185,
							      (byte) 10);
			class654_sub1_sub5 = class654_sub1_sub5_sub2;
		    } else
			class654_sub1_sub5
			    = (new Class654_Sub1_Sub5_Sub3
			       (aClass556_4984, class185, aClass44_Sub13_10338,
				class602, i_92_, i, i_108_, i_107_, i_109_,
				aBool5002, i_93_, i_101_ + i_93_ - 1, i_94_,
				i_94_ + i_102_ - 1, i_97_, i_96_, i_98_, i_99_,
				true));
		    aClass556_4984.method9246(class654_sub1_sub5, false,
					      (byte) 8);
		    if (aBool4997 && !aBool5002
			&& Class181.method2979(i_97_, (byte) 7)
			&& (Class595.aClass595_7840.anInt7852 * 847393323
			    != i_97_)
			&& i_92_ > 0 && class602.anInt7911 * 1216611823 != 0)
			aByteArrayArrayArray4989[i_92_][i_93_][i_94_] |= 0x4;
		} else if (method15943(class185, i_97_, i_96_, bool_110_,
				       class602, i_98_, i_99_, i_92_, i,
				       i_108_, i_107_, i_109_, i_93_, i_94_,
				       bool, class151, i_101_, i_102_,
				       (byte) -75)
			   || method15945(class185, i_97_, i_96_, bool_110_,
					  class602, i_98_, i_99_, i_92_, i,
					  i_108_, i_107_, i_109_, i_93_, i_94_,
					  (short) 22481)) {
		    /* empty */
		}
	    }
	}
    }
    
    boolean method15943
	(Class185 class185, int i, int i_115_, boolean bool, Class602 class602,
	 int i_116_, int i_117_, int i_118_, int i_119_, int i_120_,
	 int i_121_, int i_122_, int i_123_, int i_124_, boolean bool_125_,
	 Class151 class151, int i_126_, int i_127_, byte i_128_) {
	if (Class595.aClass595_7851.anInt7852 * 847393323 == i) {
	    int i_129_ = class602.anInt7911 * 1216611823;
	    if (aBool10333 && class602.anInt7911 * 1216611823 == -1)
		i_129_ = 1;
	    Class654_Sub1_Sub1 class654_sub1_sub1;
	    if (bool) {
		Class654_Sub1_Sub1_Sub1 class654_sub1_sub1_sub1
		    = new Class654_Sub1_Sub1_Sub1(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_118_, i_119_,
						  i_120_, i_121_, i_122_,
						  aBool5002, i, i_115_,
						  bool_125_);
		if (class654_sub1_sub1_sub1.method419((byte) 2))
		    class654_sub1_sub1_sub1.method408(class185, (byte) 8);
		class654_sub1_sub1 = class654_sub1_sub1_sub1;
	    } else
		class654_sub1_sub1
		    = new Class654_Sub1_Sub1_Sub2(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_118_, i_119_,
						  i_120_, i_121_, i_122_,
						  aBool5002, i, i_115_, i_116_,
						  i_117_);
	    aClass556_4984.method9376(i_118_, i_123_, i_124_,
				      class654_sub1_sub1, null, 1999995862);
	    if (0 == i_115_) {
		if (aBool4997 && class602.aBool7959) {
		    class151.method2492(i_123_, i_124_, 50);
		    class151.method2492(i_123_, i_124_ + 1, 50);
		}
		if (i_129_ == 1 && !aBool5002)
		    aClass556_4984.aClass552_7427.method9054
			(1, i_118_, i_123_, i_124_,
			 -755959825 * class602.anInt7954,
			 2026375877 * class602.anInt7913);
	    } else if (i_115_ == 1) {
		if (aBool4997 && class602.aBool7959) {
		    class151.method2492(i_123_, 1 + i_124_, 50);
		    class151.method2492(1 + i_123_, i_124_ + 1, 50);
		}
		if (i_129_ == 1 && !aBool5002)
		    aClass556_4984.aClass552_7427.method9054
			(2, i_118_, i_123_, i_124_ + 1,
			 -755959825 * class602.anInt7954,
			 -(2026375877 * class602.anInt7913));
	    } else if (2 == i_115_) {
		if (aBool4997 && class602.aBool7959) {
		    class151.method2492(1 + i_123_, i_124_, 50);
		    class151.method2492(i_123_ + 1, 1 + i_124_, 50);
		}
		if (1 == i_129_ && !aBool5002)
		    aClass556_4984.aClass552_7427.method9054
			(1, i_118_, i_123_ + 1, i_124_,
			 -755959825 * class602.anInt7954,
			 -(2026375877 * class602.anInt7913));
	    } else if (3 == i_115_) {
		if (aBool4997 && class602.aBool7959) {
		    class151.method2492(i_123_, i_124_, 50);
		    class151.method2492(i_123_ + 1, i_124_, 50);
		}
		if (i_129_ == 1 && !aBool5002)
		    aClass556_4984.aClass552_7427.method9054
			(2, i_118_, i_123_, i_124_,
			 -755959825 * class602.anInt7954,
			 2026375877 * class602.anInt7913);
	    }
	    if (-1211724411 * class602.anInt7917 != 64)
		aClass556_4984.method9247(i_118_, i_123_, i_124_,
					  class602.anInt7917 * -1211724411,
					  (byte) 76);
	    return true;
	}
	if (i == 847393323 * Class595.aClass595_7830.anInt7852) {
	    Class654_Sub1_Sub1 class654_sub1_sub1;
	    if (bool) {
		Class654_Sub1_Sub1_Sub1 class654_sub1_sub1_sub1
		    = new Class654_Sub1_Sub1_Sub1(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_118_, i_119_,
						  i_120_, i_121_, i_122_,
						  aBool5002, i, i_115_,
						  bool_125_);
		if (class654_sub1_sub1_sub1.method419((byte) 2))
		    class654_sub1_sub1_sub1.method408(class185, (byte) 114);
		class654_sub1_sub1 = class654_sub1_sub1_sub1;
	    } else
		class654_sub1_sub1
		    = new Class654_Sub1_Sub1_Sub2(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_118_, i_119_,
						  i_120_, i_121_, i_122_,
						  aBool5002, i, i_115_, i_116_,
						  i_117_);
	    aClass556_4984.method9376(i_118_, i_123_, i_124_,
				      class654_sub1_sub1, null, 66339499);
	    if (class602.aBool7959 && aBool4997) {
		if (0 == i_115_)
		    class151.method2492(i_123_, i_124_ + 1, 50);
		else if (1 == i_115_)
		    class151.method2492(i_123_ + 1, i_124_ + 1, 50);
		else if (2 == i_115_)
		    class151.method2492(1 + i_123_, i_124_, 50);
		else if (i_115_ == 3)
		    class151.method2492(i_123_, i_124_, 50);
	    }
	    return true;
	}
	if (i == Class595.aClass595_7829.anInt7852 * 847393323) {
	    int i_130_ = 1 + i_115_ & 0x3;
	    Class654_Sub1_Sub1 class654_sub1_sub1;
	    Class654_Sub1_Sub1 class654_sub1_sub1_131_;
	    if (bool) {
		Class654_Sub1_Sub1_Sub1 class654_sub1_sub1_sub1
		    = new Class654_Sub1_Sub1_Sub1(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_118_, i_119_,
						  i_120_, i_121_, i_122_,
						  aBool5002, i, 4 + i_115_,
						  bool_125_);
		Class654_Sub1_Sub1_Sub1 class654_sub1_sub1_sub1_132_
		    = new Class654_Sub1_Sub1_Sub1(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_118_, i_119_,
						  i_120_, i_121_, i_122_,
						  aBool5002, i, i_130_,
						  bool_125_);
		if (class654_sub1_sub1_sub1.method419((byte) 2))
		    class654_sub1_sub1_sub1.method408(class185, (byte) 27);
		if (class654_sub1_sub1_sub1_132_.method419((byte) 2))
		    class654_sub1_sub1_sub1_132_.method408(class185,
							   (byte) 10);
		class654_sub1_sub1 = class654_sub1_sub1_sub1;
		class654_sub1_sub1_131_ = class654_sub1_sub1_sub1_132_;
	    } else {
		class654_sub1_sub1
		    = new Class654_Sub1_Sub1_Sub2(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_118_, i_119_,
						  i_120_, i_121_, i_122_,
						  aBool5002, i, 4 + i_115_,
						  i_116_, i_117_);
		class654_sub1_sub1_131_
		    = new Class654_Sub1_Sub1_Sub2(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_118_, i_119_,
						  i_120_, i_121_, i_122_,
						  aBool5002, i, i_130_, i_116_,
						  i_117_);
	    }
	    aClass556_4984.method9376(i_118_, i_123_, i_124_,
				      class654_sub1_sub1,
				      class654_sub1_sub1_131_, -1033948903);
	    if ((1 == class602.anInt7911 * 1216611823
		 || aBool10333 && -1 == 1216611823 * class602.anInt7911)
		&& !aBool5002) {
		if (i_115_ == 0) {
		    aClass556_4984.aClass552_7427.method9054
			(1, i_118_, i_123_, i_124_,
			 class602.anInt7954 * -755959825,
			 class602.anInt7913 * 2026375877);
		    aClass556_4984.aClass552_7427.method9054
			(2, i_118_, i_123_, i_124_ + 1,
			 class602.anInt7954 * -755959825,
			 2026375877 * class602.anInt7913);
		} else if (i_115_ == 1) {
		    aClass556_4984.aClass552_7427.method9054
			(1, i_118_, i_123_ + 1, i_124_,
			 class602.anInt7954 * -755959825,
			 class602.anInt7913 * 2026375877);
		    aClass556_4984.aClass552_7427.method9054
			(2, i_118_, i_123_, 1 + i_124_,
			 -755959825 * class602.anInt7954,
			 class602.anInt7913 * 2026375877);
		} else if (i_115_ == 2) {
		    aClass556_4984.aClass552_7427.method9054
			(1, i_118_, i_123_ + 1, i_124_,
			 -755959825 * class602.anInt7954,
			 class602.anInt7913 * 2026375877);
		    aClass556_4984.aClass552_7427.method9054
			(2, i_118_, i_123_, i_124_,
			 -755959825 * class602.anInt7954,
			 class602.anInt7913 * 2026375877);
		} else if (3 == i_115_) {
		    aClass556_4984.aClass552_7427.method9054
			(1, i_118_, i_123_, i_124_,
			 -755959825 * class602.anInt7954,
			 class602.anInt7913 * 2026375877);
		    aClass556_4984.aClass552_7427.method9054
			(2, i_118_, i_123_, i_124_,
			 -755959825 * class602.anInt7954,
			 class602.anInt7913 * 2026375877);
		}
	    }
	    if (64 != -1211724411 * class602.anInt7917)
		aClass556_4984.method9247(i_118_, i_123_, i_124_,
					  -1211724411 * class602.anInt7917,
					  (byte) 44);
	    return true;
	}
	if (847393323 * Class595.aClass595_7832.anInt7852 == i) {
	    Class654_Sub1_Sub1 class654_sub1_sub1;
	    if (bool) {
		Class654_Sub1_Sub1_Sub1 class654_sub1_sub1_sub1
		    = new Class654_Sub1_Sub1_Sub1(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_118_, i_119_,
						  i_120_, i_121_, i_122_,
						  aBool5002, i, i_115_,
						  bool_125_);
		if (class654_sub1_sub1_sub1.method419((byte) 2))
		    class654_sub1_sub1_sub1.method408(class185, (byte) 61);
		class654_sub1_sub1 = class654_sub1_sub1_sub1;
	    } else
		class654_sub1_sub1
		    = new Class654_Sub1_Sub1_Sub2(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_118_, i_119_,
						  i_120_, i_121_, i_122_,
						  aBool5002, i, i_115_, i_116_,
						  i_117_);
	    aClass556_4984.method9376(i_118_, i_123_, i_124_,
				      class654_sub1_sub1, null, -846685005);
	    if (class602.aBool7959 && aBool4997) {
		if (0 == i_115_)
		    class151.method2492(i_123_, 1 + i_124_, 50);
		else if (i_115_ == 1)
		    class151.method2492(i_123_ + 1, 1 + i_124_, 50);
		else if (2 == i_115_)
		    class151.method2492(1 + i_123_, i_124_, 50);
		else if (i_115_ == 3)
		    class151.method2492(i_123_, i_124_, 50);
	    }
	    return true;
	}
	if (847393323 * Class595.aClass595_7833.anInt7852 == i) {
	    Class654_Sub1_Sub5 class654_sub1_sub5;
	    if (bool) {
		Class654_Sub1_Sub5_Sub2 class654_sub1_sub5_sub2
		    = new Class654_Sub1_Sub5_Sub2(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_118_, i_119_,
						  i_120_, i_121_, i_122_,
						  aBool5002, i_123_, i_123_,
						  i_124_, i_124_, i, i_115_,
						  bool_125_, true);
		if (class654_sub1_sub5_sub2.method419((byte) 2))
		    class654_sub1_sub5_sub2.method408(class185, (byte) 9);
		class654_sub1_sub5 = class654_sub1_sub5_sub2;
	    } else
		class654_sub1_sub5
		    = new Class654_Sub1_Sub5_Sub3(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_118_, i_119_,
						  i_120_, i_121_, i_122_,
						  aBool5002, i_123_,
						  i_123_ + i_126_ - 1, i_124_,
						  i_127_ + i_124_ - 1, i,
						  i_115_, i_116_, i_117_,
						  true);
	    aClass556_4984.method9246(class654_sub1_sub5, false, (byte) 8);
	    if (class602.anInt7911 * 1216611823 == 1 && !aBool5002) {
		int i_133_;
		if ((i_115_ & 0x1) == 0)
		    i_133_ = 8;
		else
		    i_133_ = 16;
		aClass556_4984.aClass552_7427.method9054
		    (i_133_, i_118_, i_123_, i_124_,
		     -755959825 * class602.anInt7954, 0);
	    }
	    if (-1211724411 * class602.anInt7917 != 64)
		aClass556_4984.method9247(i_118_, i_123_, i_124_,
					  class602.anInt7917 * -1211724411,
					  (byte) 50);
	    return true;
	}
	return false;
    }
    
    void method15944(Class185 class185, int i, int i_134_, int i_135_,
		     int i_136_) {
	Interface62 interface62
	    = method15946(i, i_134_, i_135_, i_136_, (byte) 51);
	if (null != interface62) {
	    Class602 class602
		= ((Class602)
		   aClass44_Sub13_10338.method91(interface62
						     .method56(-436512480),
						 -904211542));
	    int i_137_ = interface62.method409(-1519211725);
	    int i_138_ = interface62.method410(-73016495);
	    if (class602.method9983((short) -22573))
		Class605.method10037(i, i_135_, i_136_, class602, (byte) -47);
	    if (interface62.method419((byte) 2))
		interface62.method414(class185, 2084767438);
	    if (0 == i_134_) {
		aClass556_4984.method9252(i, i_135_, i_136_, (byte) -6);
		aClass556_4984.method9225(i, i_135_, i_136_, -667756409);
		if (1 == class602.anInt7911 * 1216611823) {
		    if (0 == i_138_)
			aClass556_4984.aClass552_7427.method9070(1, i, i_135_,
								 i_136_);
		    else if (i_138_ == 1)
			aClass556_4984.aClass552_7427.method9070(2, i, i_135_,
								 1 + i_136_);
		    else if (2 == i_138_)
			aClass556_4984.aClass552_7427
			    .method9070(1, i, 1 + i_135_, i_136_);
		    else if (3 == i_138_)
			aClass556_4984.aClass552_7427.method9070(2, i, i_135_,
								 i_136_);
		}
	    } else if (i_134_ == 1) {
		aClass556_4984.method9387(i, i_135_, i_136_, 244404862);
		aClass556_4984.method9281(i, i_135_, i_136_, 573090619);
	    } else if (i_134_ == 2) {
		aClass556_4984.method9255(i, i_135_, i_136_,
					  client.anInterface64_11333,
					  (byte) 22);
		if (i_137_ == Class595.aClass595_7833.anInt7852 * 847393323) {
		    if (0 == (i_138_ & 0x1))
			aClass556_4984.aClass552_7427.method9070(8, i, i_135_,
								 i_136_);
		    else
			aClass556_4984.aClass552_7427.method9070(16, i, i_135_,
								 i_136_);
		}
	    } else if (3 == i_134_)
		aClass556_4984.method9253(i, i_135_, i_136_, (byte) 39);
	}
    }
    
    boolean method15945(Class185 class185, int i, int i_139_, boolean bool,
			Class602 class602, int i_140_, int i_141_, int i_142_,
			int i_143_, int i_144_, int i_145_, int i_146_,
			int i_147_, int i_148_, short i_149_) {
	if (i == 847393323 * Class595.aClass595_7834.anInt7852) {
	    Class654_Sub1_Sub3 class654_sub1_sub3;
	    if (bool) {
		Class654_Sub1_Sub3_Sub1 class654_sub1_sub3_sub1
		    = new Class654_Sub1_Sub3_Sub1(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_142_, i_143_,
						  i_144_, i_145_, i_146_,
						  aBool5002, 0, 0, i, i_139_);
		if (class654_sub1_sub3_sub1.method419((byte) 2))
		    class654_sub1_sub3_sub1.method408(class185, (byte) 27);
		class654_sub1_sub3 = class654_sub1_sub3_sub1;
	    } else
		class654_sub1_sub3
		    = new Class654_Sub1_Sub3_Sub2(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_142_, i_143_,
						  i_144_, i_145_, i_146_,
						  aBool5002, 0, 0, i, i_139_,
						  i_140_, i_141_);
	    aClass556_4984.method9245(i_142_, i_147_, i_148_,
				      class654_sub1_sub3, null, 1604666399);
	    return true;
	}
	if (i == 847393323 * Class595.aClass595_7835.anInt7852) {
	    int i_150_ = 65;
	    Interface62 interface62
		= (Interface62) aClass556_4984.method9258(i_142_, i_147_,
							  i_148_, (byte) -61);
	    if (interface62 != null)
		i_150_
		    = ((Class602) (aClass44_Sub13_10338.method91
				   (interface62.method56(-1601131350),
				    1168526371))).anInt7917 * -1211724411 + 1;
	    Class654_Sub1_Sub3 class654_sub1_sub3;
	    if (bool) {
		Class654_Sub1_Sub3_Sub1 class654_sub1_sub3_sub1
		    = (new Class654_Sub1_Sub3_Sub1
		       (aClass556_4984, class185, aClass44_Sub13_10338,
			class602, i_142_, i_143_, i_144_, i_145_, i_146_,
			aBool5002, anIntArray10339[i_139_] * i_150_,
			anIntArray10340[i_139_] * i_150_, i, i_139_));
		if (class654_sub1_sub3_sub1.method419((byte) 2))
		    class654_sub1_sub3_sub1.method408(class185, (byte) 113);
		class654_sub1_sub3 = class654_sub1_sub3_sub1;
	    } else
		class654_sub1_sub3
		    = (new Class654_Sub1_Sub3_Sub2
		       (aClass556_4984, class185, aClass44_Sub13_10338,
			class602, i_142_, i_143_, i_144_, i_145_, i_146_,
			aBool5002, anIntArray10339[i_139_] * i_150_,
			i_150_ * anIntArray10340[i_139_], i, i_139_, i_140_,
			i_141_));
	    aClass556_4984.method9245(i_142_, i_147_, i_148_,
				      class654_sub1_sub3, null, 1604666399);
	    return true;
	}
	if (i == Class595.aClass595_7845.anInt7852 * 847393323) {
	    int i_151_ = 33;
	    Interface62 interface62
		= (Interface62) aClass556_4984.method9258(i_142_, i_147_,
							  i_148_, (byte) -75);
	    if (interface62 != null)
		i_151_ = (((Class602) (aClass44_Sub13_10338.method91
				       (interface62.method56(1128871515),
					396240496))).anInt7917
			  * -1211724411 / 2) + 1;
	    Class654_Sub1_Sub3 class654_sub1_sub3;
	    if (bool) {
		Class654_Sub1_Sub3_Sub1 class654_sub1_sub3_sub1
		    = (new Class654_Sub1_Sub3_Sub1
		       (aClass556_4984, class185, aClass44_Sub13_10338,
			class602, i_142_, i_143_, i_144_, i_145_, i_146_,
			aBool5002, anIntArray10339[i_139_] * i_151_,
			anIntArray10340[i_139_] * i_151_, i, i_139_ + 4));
		if (class654_sub1_sub3_sub1.method419((byte) 2))
		    class654_sub1_sub3_sub1.method408(class185, (byte) 82);
		class654_sub1_sub3 = class654_sub1_sub3_sub1;
	    } else
		class654_sub1_sub3
		    = (new Class654_Sub1_Sub3_Sub2
		       (aClass556_4984, class185, aClass44_Sub13_10338,
			class602, i_142_, i_143_, i_144_, i_145_, i_146_,
			aBool5002, anIntArray10334[i_139_] * i_151_,
			anIntArray10343[i_139_] * i_151_, i, i_139_ + 4,
			i_140_, i_141_));
	    aClass556_4984.method9245(i_142_, i_147_, i_148_,
				      class654_sub1_sub3, null, 1604666399);
	    return true;
	}
	if (i == 847393323 * Class595.aClass595_7837.anInt7852) {
	    int i_152_ = 2 + i_139_ & 0x3;
	    Class654_Sub1_Sub3 class654_sub1_sub3;
	    if (bool) {
		Class654_Sub1_Sub3_Sub1 class654_sub1_sub3_sub1
		    = new Class654_Sub1_Sub3_Sub1(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_142_, i_143_,
						  i_144_, i_145_, i_146_,
						  aBool5002, 0, 0, i,
						  i_152_ + 4);
		if (class654_sub1_sub3_sub1.method419((byte) 2))
		    class654_sub1_sub3_sub1.method408(class185, (byte) 39);
		class654_sub1_sub3 = class654_sub1_sub3_sub1;
	    } else
		class654_sub1_sub3
		    = new Class654_Sub1_Sub3_Sub2(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_142_, i_143_,
						  i_144_, i_145_, i_146_,
						  aBool5002, 0, 0, i,
						  4 + i_152_, i_140_, i_141_);
	    aClass556_4984.method9245(i_142_, i_147_, i_148_,
				      class654_sub1_sub3, null, 1604666399);
	    return true;
	}
	if (i == 847393323 * Class595.aClass595_7838.anInt7852) {
	    int i_153_ = i_139_ + 2 & 0x3;
	    int i_154_ = 33;
	    Interface62 interface62
		= (Interface62) aClass556_4984.method9258(i_142_, i_147_,
							  i_148_, (byte) 21);
	    if (interface62 != null)
		i_154_ = (((Class602) (aClass44_Sub13_10338.method91
				       (interface62.method56(-1383645864),
					-1921679665))).anInt7917
			  * -1211724411 / 2) + 1;
	    Class654_Sub1_Sub3 class654_sub1_sub3;
	    Class654_Sub1_Sub3 class654_sub1_sub3_155_;
	    if (bool) {
		Class654_Sub1_Sub3_Sub1 class654_sub1_sub3_sub1
		    = (new Class654_Sub1_Sub3_Sub1
		       (aClass556_4984, class185, aClass44_Sub13_10338,
			class602, i_142_, i_143_, i_144_, i_145_, i_146_,
			aBool5002, i_154_ * anIntArray10334[i_139_],
			i_154_ * anIntArray10343[i_139_], i, 4 + i_139_));
		Class654_Sub1_Sub3_Sub1 class654_sub1_sub3_sub1_156_
		    = new Class654_Sub1_Sub3_Sub1(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_142_, i_143_,
						  i_144_, i_145_, i_146_,
						  aBool5002, 0, 0, i,
						  4 + i_153_);
		if (class654_sub1_sub3_sub1.method419((byte) 2))
		    class654_sub1_sub3_sub1.method408(class185, (byte) 95);
		if (class654_sub1_sub3_sub1_156_.method419((byte) 2))
		    class654_sub1_sub3_sub1_156_.method408(class185,
							   (byte) 54);
		class654_sub1_sub3 = class654_sub1_sub3_sub1;
		class654_sub1_sub3_155_ = class654_sub1_sub3_sub1_156_;
	    } else {
		Class654_Sub1_Sub3_Sub2 class654_sub1_sub3_sub2
		    = (new Class654_Sub1_Sub3_Sub2
		       (aClass556_4984, class185, aClass44_Sub13_10338,
			class602, i_142_, i_143_, i_144_, i_145_, i_146_,
			aBool5002, anIntArray10334[i_139_] * i_154_,
			anIntArray10343[i_139_] * i_154_, i, 4 + i_139_,
			i_140_, i_141_));
		Class654_Sub1_Sub3_Sub2 class654_sub1_sub3_sub2_157_
		    = new Class654_Sub1_Sub3_Sub2(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_142_, i_143_,
						  i_144_, i_145_, i_146_,
						  aBool5002, 0, 0, i,
						  4 + i_153_, i_140_, i_141_);
		class654_sub1_sub3 = class654_sub1_sub3_sub2;
		class654_sub1_sub3_155_ = class654_sub1_sub3_sub2_157_;
	    }
	    aClass556_4984.method9245(i_142_, i_147_, i_148_,
				      class654_sub1_sub3,
				      class654_sub1_sub3_155_, 1604666399);
	    return true;
	}
	return false;
    }
    
    Interface62 method15946(int i, int i_158_, int i_159_, int i_160_,
			    byte i_161_) {
	Interface62 interface62 = null;
	if (0 == i_158_)
	    interface62
		= (Interface62) aClass556_4984.method9258(i, i_159_, i_160_,
							  (byte) -83);
	if (1 == i_158_)
	    interface62
		= (Interface62) aClass556_4984.method9357(i, i_159_, i_160_,
							  (byte) -80);
	if (2 == i_158_)
	    interface62
		= ((Interface62)
		   aClass556_4984.method9262(i, i_159_, i_160_,
					     client.anInterface64_11333,
					     (byte) 83));
	if (i_158_ == 3)
	    interface62
		= (Interface62) aClass556_4984.method9264(i, i_159_, i_160_,
							  (byte) 21);
	return interface62;
    }
    
    public final void method15947(Class185 class185, boolean bool, byte i) {
	aClass556_4984.method9301();
	if (!bool) {
	    if (-692901467 * anInt4991 > 1) {
		for (int i_162_ = 0; i_162_ < -60640777 * anInt4992;
		     i_162_++) {
		    for (int i_163_ = 0; i_163_ < -1584311401 * anInt5051;
			 i_163_++) {
			if (2 == ((aClass468_4983.aByteArrayArrayArray5145[1]
				   [i_162_][i_163_])
				  & 0x2))
			    aClass556_4984.method9230(i_162_, i_163_,
						      (short) 6146);
		    }
		}
	    }
	    for (int i_164_ = 0; i_164_ < -692901467 * anInt4991; i_164_++) {
		for (int i_165_ = 0; i_165_ <= anInt5051 * -1584311401;
		     i_165_++) {
		    for (int i_166_ = 0; i_166_ <= -60640777 * anInt4992;
			 i_166_++) {
			if (0 != ((aByteArrayArrayArray4989[i_164_][i_166_]
				   [i_165_])
				  & 0x4)) {
			    int i_167_ = i_166_;
			    int i_168_ = i_166_;
			    int i_169_ = i_165_;
			    int i_170_;
			    for (i_170_ = i_165_;
				 (i_169_ > 0
				  && ((aByteArrayArrayArray4989[i_164_][i_166_]
				       [i_169_ - 1])
				      & 0x4) != 0
				  && i_170_ - i_169_ < 10);
				 i_169_--) {
				/* empty */
			    }
			    for (/**/; (i_170_ < anInt5051 * -1584311401
					&& ((aByteArrayArrayArray4989[i_164_]
					     [i_166_][i_170_ + 1])
					    & 0x4) != 0
					&& i_170_ - i_169_ < 10); i_170_++) {
				/* empty */
			    }
			while_156_:
			    for (/**/; i_167_ > 0 && i_168_ - i_167_ < 10;
				 i_167_--) {
				for (int i_171_ = i_169_; i_171_ <= i_170_;
				     i_171_++) {
				    if (0 == ((aByteArrayArrayArray4989[i_164_]
					       [i_167_ - 1][i_171_])
					      & 0x4))
					break while_156_;
				}
			    }
			while_157_:
			    for (/**/; (i_168_ < anInt4992 * -60640777
					&& i_168_ - i_167_ < 10); i_168_++) {
				for (int i_172_ = i_169_; i_172_ <= i_170_;
				     i_172_++) {
				    if (0 == ((aByteArrayArrayArray4989[i_164_]
					       [1 + i_168_][i_172_])
					      & 0x4))
					break while_157_;
				}
			    }
			    if ((1 + (i_168_ - i_167_)) * (i_170_ - i_169_ + 1)
				>= 4) {
				int i_173_ = (anIntArrayArrayArray4995[i_164_]
					      [i_167_][i_169_]);
				aClass556_4984.aClass552_7427.method9055
				    (4, i_164_, i_167_ << 9,
				     512 + (i_168_ << 9), i_169_ << 9,
				     (i_170_ << 9) + 512, i_173_, i_173_);
				for (int i_174_ = i_167_; i_174_ <= i_168_;
				     i_174_++) {
				    for (int i_175_ = i_169_; i_175_ <= i_170_;
					 i_175_++)
					aByteArrayArrayArray4989[i_164_]
					    [i_174_][i_175_]
					    &= ~0x4;
				}
			    }
			}
		    }
		}
	    }
	    aClass556_4984.aClass552_7427.method9090();
	}
	aByteArrayArrayArray4989 = null;
    }
    
    static {
	aBool10333 = false;
	anIntArray10339 = new int[] { 1, 0, -1, 0 };
	anIntArray10340 = new int[] { 0, -1, 0, 1 };
	anIntArray10334 = new int[] { 1, -1, -1, 1 };
	anIntArray10343 = new int[] { -1, -1, 1, 1 };
    }
    
    static final boolean method15948(Class44_Sub13 class44_sub13, int i,
				     int i_176_) {
	Class602 class602 = (Class602) class44_sub13.method91(i, -1995370229);
	if (i_176_ == 11)
	    i_176_ = 10;
	if (i_176_ >= 5 && i_176_ <= 8)
	    i_176_ = 4;
	return class602.method10000(i_176_, (byte) 91);
    }
    
    public final void method15949
	(Class185 class185, Class534_Sub40 class534_sub40, int i, int i_177_,
	 int i_178_, int i_179_, int i_180_, int i_181_, int i_182_,
	 int i_183_) {
	if (!aBool5002) {
	    class534_sub40.anInt10811 += 1785150424;
	    boolean bool = false;
	    Class634 class634 = null;
	    boolean bool_184_ = false;
	    int i_185_ = 8 * (i_180_ & 0x7);
	    int i_186_ = (i_181_ & 0x7) * 8;
	    while (31645619 * class534_sub40.anInt10811
		   < class534_sub40.aByteArray10810.length) {
		int i_187_ = class534_sub40.method16527(578260391);
		if (0 == i_187_) {
		    if (null == class634)
			class634
			    = new Class634(class534_sub40, aClass616_10344);
		    else
			class634.method10521(class534_sub40, aClass616_10344,
					     -43259586);
		} else if (1 == i_187_) {
		    int i_188_ = class534_sub40.method16527(600099131);
		    if (i_188_ > 0) {
			for (int i_189_ = 0; i_189_ < i_188_; i_189_++) {
			    Class561 class561
				= new Class561(class185,
					       (aClass556_4984.anInt7422
						* 941710601),
					       class534_sub40, 2);
			    if (class561.anInt7519 * -1065201513 == 31) {
				Class78 class78
				    = ((Class78)
				       (Class200_Sub10.aClass44_Sub20_9926
					    .method91
					(class534_sub40.method16529((byte) 1),
					 -1385837119)));
				class561.method9437
				    (class78.anInt823 * -1260868599,
				     -799202129 * class78.anInt824,
				     -1111788061 * class78.anInt821,
				     94447489 * class78.anInt822, -22401059);
			    }
			    if (class185.method3344() > 0) {
				Class534_Sub21 class534_sub21
				    = class561.aClass534_Sub21_7541;
				int i_190_
				    = (class534_sub21.method16197(-1650152113)
				       >> 9);
				int i_191_
				    = (class534_sub21.method16199((byte) -97)
				       >> 9);
				if (class561.anInt7544 * 551684827 == i_179_
				    && i_190_ >= i_185_ && i_190_ < i_185_ + 8
				    && i_191_ >= i_186_
				    && i_191_ < 8 + i_186_) {
				    int i_192_
					= ((i_177_ << 9)
					   + (Class413.method6732
					      ((class534_sub21
						    .method16197(991169540)
						& 0xfff),
					       (class534_sub21
						    .method16199((byte) -35)
						& 0xfff),
					       i_182_, (byte) 92)));
				    int i_193_
					= ((i_178_ << 9)
					   + (Class673.method11111
					      ((class534_sub21
						    .method16197(-376264403)
						& 0xfff),
					       (class534_sub21
						    .method16199((byte) -6)
						& 0xfff),
					       i_182_, -1542458564)));
				    i_190_ = i_192_ >> 9;
				    i_191_ = i_193_ >> 9;
				    if (i_190_ >= 0 && i_191_ >= 0
					&& i_190_ < anInt4992 * -60640777
					&& i_191_ < -1584311401 * anInt5051) {
					class561.anInt7544 = 725934419 * i;
					class534_sub21.method16204
					    (i_192_,
					     ((anIntArrayArrayArray4995
					       [class561.anInt7544 * 551684827]
					       [i_190_][i_191_])
					      - class534_sub21
						    .method16226(-1608390349)),
					     i_193_, -1231219833);
					aClass556_4984.method9260(class561,
								  1738309934);
				    }
				}
			    }
			}
		    }
		} else if (i_187_ == 2) {
		    if (class634 == null)
			class634 = new Class634();
		    class634.method10505(class534_sub40, 303315925);
		} else if (i_187_ == 3) {
		    if (null == class634)
			class634 = new Class634();
		    class634.method10516(class534_sub40, 1034384094);
		} else if (128 == i_187_) {
		    if (null == class634)
			class634 = new Class634();
		    class634.method10508(class534_sub40, aClass616_10344,
					 (byte) -104);
		} else if (i_187_ == 129) {
		    if (null == aByteArrayArrayArray5067)
			aByteArrayArrayArray5067 = new byte[4][][];
		    for (int i_194_ = 0; i_194_ < 4; i_194_++) {
			byte i_195_ = class534_sub40.method16586((byte) 1);
			if (i_195_ == 0
			    && null != aByteArrayArrayArray5067[i]) {
			    if (i_194_ <= i_179_) {
				int i_196_ = i_177_;
				int i_197_ = 7 + i_177_;
				int i_198_ = i_178_;
				int i_199_ = 7 + i_178_;
				if (i_196_ < 0)
				    i_196_ = 0;
				else if (i_196_ >= -60640777 * anInt4992)
				    i_196_ = anInt4992 * -60640777;
				if (i_197_ < 0)
				    i_197_ = 0;
				else if (i_197_ >= -60640777 * anInt4992)
				    i_197_ = anInt4992 * -60640777;
				if (i_198_ < 0)
				    i_198_ = 0;
				else if (i_198_ >= -1584311401 * anInt5051)
				    i_198_ = anInt5051 * -1584311401;
				if (i_199_ < 0)
				    i_199_ = 0;
				else if (i_199_ >= -1584311401 * anInt5051)
				    i_199_ = anInt5051 * -1584311401;
				for (/**/; i_196_ < i_197_; i_196_++) {
				    for (/**/; i_198_ < i_199_; i_198_++)
					aByteArrayArrayArray5067[i][i_196_]
					    [i_198_]
					    = (byte) 0;
				}
			    }
			} else if (1 == i_195_) {
			    if (aByteArrayArrayArray5067[i] == null)
				aByteArrayArrayArray5067[i]
				    = (new byte[1 + -60640777 * anInt4992]
				       [-1584311401 * anInt5051 + 1]);
			    for (int i_200_ = 0; i_200_ < 64; i_200_ += 4) {
				for (int i_201_ = 0; i_201_ < 64;
				     i_201_ += 4) {
				    byte i_202_
					= class534_sub40.method16586((byte) 1);
				    if (i_194_ <= i_179_) {
					for (int i_203_ = i_200_;
					     i_203_ < 4 + i_200_; i_203_++) {
					    for (int i_204_ = i_201_;
						 i_204_ < 4 + i_201_;
						 i_204_++) {
						if (i_203_ >= i_185_
						    && i_203_ < i_185_ + 8
						    && i_204_ >= i_186_
						    && i_204_ < 8 + i_186_) {
						    int i_205_
							= (i_177_
							   + (Class644
								  .method10681
							      (i_203_ & 0x7,
							       i_204_ & 0x7,
							       i_182_,
							       (byte) -63)));
						    int i_206_
							= (i_178_
							   + (Class47
								  .method1128
							      (i_203_ & 0x7,
							       i_204_ & 0x7,
							       i_182_,
							       1773297262)));
						    if (i_205_ >= 0
							&& (i_205_
							    < (anInt4992
							       * -60640777))
							&& i_206_ >= 0
							&& (i_206_
							    < (anInt5051
							       * -1584311401))) {
							aByteArrayArrayArray5067
							    [i][i_205_][i_206_]
							    = i_202_;
							bool = true;
						    }
						}
					    }
					}
				    }
				}
			    }
			} else if (2 == i_195_)
			    continue;
		    }
		} else if (i_187_ == 130)
		    bool_184_ = true;
		else
		    throw new IllegalStateException("");
	    }
	    if (class634 != null)
		aClass616_10344.method10151(i_177_ >> 3, i_178_ >> 3, class634,
					    (byte) -88);
	    Class286.method5265(i_177_ >> 3, i_178_ >> 3, bool_184_,
				(short) 2048);
	    if (!bool && aByteArrayArrayArray5067 != null
		&& aByteArrayArrayArray5067[i] != null) {
		int i_207_ = i_177_ + 7;
		int i_208_ = 7 + i_178_;
		for (int i_209_ = i_177_; i_209_ < i_207_; i_209_++) {
		    for (int i_210_ = i_178_; i_210_ < i_208_; i_210_++)
			aByteArrayArrayArray5067[i][i_209_][i_210_] = (byte) 0;
		}
	    }
	}
    }
    
    public final void method15950
	(Class185 class185, Class534_Sub40 class534_sub40, int i, int i_211_,
	 int i_212_, int i_213_, int i_214_, int i_215_, int i_216_) {
	if (!aBool5002) {
	    class534_sub40.anInt10811 += 1785150424;
	    boolean bool = false;
	    Class634 class634 = null;
	    boolean bool_217_ = false;
	    int i_218_ = 8 * (i_214_ & 0x7);
	    int i_219_ = (i_215_ & 0x7) * 8;
	    while (31645619 * class534_sub40.anInt10811
		   < class534_sub40.aByteArray10810.length) {
		int i_220_ = class534_sub40.method16527(-977718144);
		if (0 == i_220_) {
		    if (null == class634)
			class634
			    = new Class634(class534_sub40, aClass616_10344);
		    else
			class634.method10521(class534_sub40, aClass616_10344,
					     342413079);
		} else if (1 == i_220_) {
		    int i_221_ = class534_sub40.method16527(-2033454464);
		    if (i_221_ > 0) {
			for (int i_222_ = 0; i_222_ < i_221_; i_222_++) {
			    Class561 class561
				= new Class561(class185,
					       (aClass556_4984.anInt7422
						* 941710601),
					       class534_sub40, 2);
			    if (class561.anInt7519 * -1065201513 == 31) {
				Class78 class78
				    = ((Class78)
				       (Class200_Sub10.aClass44_Sub20_9926
					    .method91
					(class534_sub40.method16529((byte) 1),
					 -594929832)));
				class561.method9437
				    (class78.anInt823 * -1260868599,
				     -799202129 * class78.anInt824,
				     -1111788061 * class78.anInt821,
				     94447489 * class78.anInt822, 297847018);
			    }
			    if (class185.method3344() > 0) {
				Class534_Sub21 class534_sub21
				    = class561.aClass534_Sub21_7541;
				int i_223_
				    = (class534_sub21.method16197(-1455485750)
				       >> 9);
				int i_224_
				    = (class534_sub21.method16199((byte) -95)
				       >> 9);
				if (class561.anInt7544 * 551684827 == i_213_
				    && i_223_ >= i_218_ && i_223_ < i_218_ + 8
				    && i_224_ >= i_219_
				    && i_224_ < 8 + i_219_) {
				    int i_225_
					= ((i_211_ << 9)
					   + (Class413.method6732
					      ((class534_sub21
						    .method16197(-454261478)
						& 0xfff),
					       (class534_sub21
						    .method16199((byte) -26)
						& 0xfff),
					       i_216_, (byte) 45)));
				    int i_226_
					= ((i_212_ << 9)
					   + (Class673.method11111
					      ((class534_sub21
						    .method16197(1338903635)
						& 0xfff),
					       (class534_sub21
						    .method16199((byte) -9)
						& 0xfff),
					       i_216_, 665035644)));
				    i_223_ = i_225_ >> 9;
				    i_224_ = i_226_ >> 9;
				    if (i_223_ >= 0 && i_224_ >= 0
					&& i_223_ < anInt4992 * -60640777
					&& i_224_ < -1584311401 * anInt5051) {
					class561.anInt7544 = 725934419 * i;
					class534_sub21.method16204
					    (i_225_,
					     ((anIntArrayArrayArray4995
					       [class561.anInt7544 * 551684827]
					       [i_223_][i_224_])
					      - class534_sub21
						    .method16226(-180507342)),
					     i_226_, -1557417000);
					aClass556_4984.method9260(class561,
								  720193826);
				    }
				}
			    }
			}
		    }
		} else if (i_220_ == 2) {
		    if (class634 == null)
			class634 = new Class634();
		    class634.method10505(class534_sub40, 303315925);
		} else if (i_220_ == 3) {
		    if (null == class634)
			class634 = new Class634();
		    class634.method10516(class534_sub40, 1034384094);
		} else if (128 == i_220_) {
		    if (null == class634)
			class634 = new Class634();
		    class634.method10508(class534_sub40, aClass616_10344,
					 (byte) -120);
		} else if (i_220_ == 129) {
		    if (null == aByteArrayArrayArray5067)
			aByteArrayArrayArray5067 = new byte[4][][];
		    for (int i_227_ = 0; i_227_ < 4; i_227_++) {
			byte i_228_ = class534_sub40.method16586((byte) 1);
			if (i_228_ == 0
			    && null != aByteArrayArrayArray5067[i]) {
			    if (i_227_ <= i_213_) {
				int i_229_ = i_211_;
				int i_230_ = 7 + i_211_;
				int i_231_ = i_212_;
				int i_232_ = 7 + i_212_;
				if (i_229_ < 0)
				    i_229_ = 0;
				else if (i_229_ >= -60640777 * anInt4992)
				    i_229_ = anInt4992 * -60640777;
				if (i_230_ < 0)
				    i_230_ = 0;
				else if (i_230_ >= -60640777 * anInt4992)
				    i_230_ = anInt4992 * -60640777;
				if (i_231_ < 0)
				    i_231_ = 0;
				else if (i_231_ >= -1584311401 * anInt5051)
				    i_231_ = anInt5051 * -1584311401;
				if (i_232_ < 0)
				    i_232_ = 0;
				else if (i_232_ >= -1584311401 * anInt5051)
				    i_232_ = anInt5051 * -1584311401;
				for (/**/; i_229_ < i_230_; i_229_++) {
				    for (/**/; i_231_ < i_232_; i_231_++)
					aByteArrayArrayArray5067[i][i_229_]
					    [i_231_]
					    = (byte) 0;
				}
			    }
			} else if (1 == i_228_) {
			    if (aByteArrayArrayArray5067[i] == null)
				aByteArrayArrayArray5067[i]
				    = (new byte[1 + -60640777 * anInt4992]
				       [-1584311401 * anInt5051 + 1]);
			    for (int i_233_ = 0; i_233_ < 64; i_233_ += 4) {
				for (int i_234_ = 0; i_234_ < 64;
				     i_234_ += 4) {
				    byte i_235_
					= class534_sub40.method16586((byte) 1);
				    if (i_227_ <= i_213_) {
					for (int i_236_ = i_233_;
					     i_236_ < 4 + i_233_; i_236_++) {
					    for (int i_237_ = i_234_;
						 i_237_ < 4 + i_234_;
						 i_237_++) {
						if (i_236_ >= i_218_
						    && i_236_ < i_218_ + 8
						    && i_237_ >= i_219_
						    && i_237_ < 8 + i_219_) {
						    int i_238_
							= (i_211_
							   + (Class644
								  .method10681
							      (i_236_ & 0x7,
							       i_237_ & 0x7,
							       i_216_,
							       (byte) -25)));
						    int i_239_
							= (i_212_
							   + (Class47
								  .method1128
							      (i_236_ & 0x7,
							       i_237_ & 0x7,
							       i_216_,
							       1462903205)));
						    if (i_238_ >= 0
							&& (i_238_
							    < (anInt4992
							       * -60640777))
							&& i_239_ >= 0
							&& (i_239_
							    < (anInt5051
							       * -1584311401))) {
							aByteArrayArrayArray5067
							    [i][i_238_][i_239_]
							    = i_235_;
							bool = true;
						    }
						}
					    }
					}
				    }
				}
			    }
			} else if (2 == i_228_)
			    continue;
		    }
		} else if (i_220_ == 130)
		    bool_217_ = true;
		else
		    throw new IllegalStateException("");
	    }
	    if (class634 != null)
		aClass616_10344.method10151(i_211_ >> 3, i_212_ >> 3, class634,
					    (byte) -98);
	    Class286.method5265(i_211_ >> 3, i_212_ >> 3, bool_217_,
				(short) 2048);
	    if (!bool && aByteArrayArrayArray5067 != null
		&& aByteArrayArrayArray5067[i] != null) {
		int i_240_ = i_211_ + 7;
		int i_241_ = 7 + i_212_;
		for (int i_242_ = i_211_; i_242_ < i_240_; i_242_++) {
		    for (int i_243_ = i_212_; i_243_ < i_241_; i_243_++)
			aByteArrayArrayArray5067[i][i_242_][i_243_] = (byte) 0;
		}
	    }
	}
    }
    
    public final void method15951(Class185 class185,
				  Class534_Sub40 class534_sub40, int i,
				  int i_244_, int i_245_) {
	if (!aBool5002) {
	    class534_sub40.anInt10811 += 1785150424;
	    boolean bool = false;
	    Class634 class634 = null;
	    boolean bool_246_ = false;
	    while (class534_sub40.anInt10811 * 31645619
		   < class534_sub40.aByteArray10810.length) {
		int i_247_ = class534_sub40.method16527(1172723861);
		if (0 == i_247_) {
		    if (null == class634)
			class634
			    = new Class634(class534_sub40, aClass616_10344);
		    else
			class634.method10521(class534_sub40, aClass616_10344,
					     1803193405);
		} else if (1 == i_247_) {
		    int i_248_ = class534_sub40.method16527(1800320473);
		    if (i_248_ > 0) {
			for (int i_249_ = 0; i_249_ < i_248_; i_249_++) {
			    Class561 class561
				= new Class561(class185,
					       (aClass556_4984.anInt7422
						* 941710601),
					       class534_sub40, 2);
			    if (-1065201513 * class561.anInt7519 == 31) {
				Class78 class78
				    = ((Class78)
				       (Class200_Sub10.aClass44_Sub20_9926
					    .method91
					(class534_sub40.method16529((byte) 1),
					 -1466087929)));
				class561.method9437
				    (class78.anInt823 * -1260868599,
				     -799202129 * class78.anInt824,
				     -1111788061 * class78.anInt821,
				     94447489 * class78.anInt822, 1960265627);
			    }
			    if (class185.method3344() > 0) {
				Class534_Sub21 class534_sub21
				    = class561.aClass534_Sub21_7541;
				int i_250_
				    = (class534_sub21.method16197(-1131050395)
				       + (i << 9));
				int i_251_
				    = (class534_sub21.method16199((byte) -60)
				       + (i_244_ << 9));
				int i_252_ = i_250_ >> 9;
				int i_253_ = i_251_ >> 9;
				if (i_252_ >= 0 && i_253_ >= 0
				    && i_252_ < -60640777 * anInt4992
				    && i_253_ < -1584311401 * anInt5051) {
				    class534_sub21.method16204
					(i_250_,
					 ((anIntArrayArrayArray4995
					   [class561.anInt7544 * 551684827]
					   [i_252_][i_253_])
					  - class534_sub21
						.method16226(328588745)),
					 i_251_, -1233277539);
				    aClass556_4984.method9260(class561,
							      1085726434);
				}
			    }
			}
		    }
		} else if (i_247_ == 2) {
		    if (class634 == null)
			class634 = new Class634();
		    class634.method10505(class534_sub40, 303315925);
		} else if (i_247_ == 3) {
		    if (class634 == null)
			class634 = new Class634();
		    class634.method10516(class534_sub40, 1034384094);
		} else if (i_247_ == 128) {
		    if (class634 == null)
			class634 = new Class634();
		    class634.method10508(class534_sub40, aClass616_10344,
					 (byte) -67);
		} else if (129 == i_247_) {
		    if (aByteArrayArrayArray5067 == null)
			aByteArrayArrayArray5067 = new byte[4][][];
		    for (int i_254_ = 0; i_254_ < 4; i_254_++) {
			byte i_255_ = class534_sub40.method16586((byte) 1);
			if (0 == i_255_
			    && null != aByteArrayArrayArray5067[i_254_]) {
			    int i_256_ = i;
			    int i_257_ = i + 64;
			    int i_258_ = i_244_;
			    int i_259_ = 64 + i_244_;
			    if (i_256_ < 0)
				i_256_ = 0;
			    else if (i_256_ >= anInt4992 * -60640777)
				i_256_ = -60640777 * anInt4992;
			    if (i_257_ < 0)
				i_257_ = 0;
			    else if (i_257_ >= -60640777 * anInt4992)
				i_257_ = -60640777 * anInt4992;
			    if (i_258_ < 0)
				i_258_ = 0;
			    else if (i_258_ >= -1584311401 * anInt5051)
				i_258_ = anInt5051 * -1584311401;
			    if (i_259_ < 0)
				i_259_ = 0;
			    else if (i_259_ >= -1584311401 * anInt5051)
				i_259_ = anInt5051 * -1584311401;
			    for (/**/; i_256_ < i_257_; i_256_++) {
				for (/**/; i_258_ < i_259_; i_258_++)
				    aByteArrayArrayArray5067[i_254_]
					[i_256_][i_258_]
					= (byte) 0;
			    }
			} else if (1 == i_255_) {
			    if (null == aByteArrayArrayArray5067[i_254_])
				aByteArrayArrayArray5067[i_254_]
				    = (new byte[anInt4992 * -60640777 + 1]
				       [-1584311401 * anInt5051 + 1]);
			    for (int i_260_ = 0; i_260_ < 64; i_260_ += 4) {
				for (int i_261_ = 0; i_261_ < 64;
				     i_261_ += 4) {
				    byte i_262_
					= class534_sub40.method16586((byte) 1);
				    for (int i_263_ = i + i_260_;
					 i_263_ < 4 + (i + i_260_); i_263_++) {
					for (int i_264_ = i_244_ + i_261_;
					     i_264_ < i_261_ + i_244_ + 4;
					     i_264_++) {
					    if (i_263_ >= 0
						&& (i_263_
						    < -60640777 * anInt4992)
						&& i_264_ >= 0
						&& (i_264_
						    < anInt5051 * -1584311401))
						aByteArrayArrayArray5067
						    [i_254_][i_263_][i_264_]
						    = i_262_;
					}
				    }
				}
			    }
			} else if (2 == i_255_) {
			    if (aByteArrayArrayArray5067[i_254_] == null)
				aByteArrayArrayArray5067[i_254_]
				    = (new byte[1 + anInt4992 * -60640777]
				       [1 + anInt5051 * -1584311401]);
			    if (i_254_ > 0) {
				int i_265_ = i;
				int i_266_ = i + 64;
				int i_267_ = i_244_;
				int i_268_ = i_244_ + 64;
				if (i_265_ < 0)
				    i_265_ = 0;
				else if (i_265_ >= anInt4992 * -60640777)
				    i_265_ = -60640777 * anInt4992;
				if (i_266_ < 0)
				    i_266_ = 0;
				else if (i_266_ >= -60640777 * anInt4992)
				    i_266_ = anInt4992 * -60640777;
				if (i_267_ < 0)
				    i_267_ = 0;
				else if (i_267_ >= -1584311401 * anInt5051)
				    i_267_ = -1584311401 * anInt5051;
				if (i_268_ < 0)
				    i_268_ = 0;
				else if (i_268_ >= -1584311401 * anInt5051)
				    i_268_ = anInt5051 * -1584311401;
				for (/**/; i_265_ < i_266_; i_265_++) {
				    for (/**/; i_267_ < i_268_; i_267_++)
					aByteArrayArrayArray5067[i_254_]
					    [i_265_][i_267_]
					    = (aByteArrayArrayArray5067
					       [i_254_ - 1][i_265_][i_267_]);
				}
			    }
			}
		    }
		    bool = true;
		} else if (130 == i_247_)
		    bool_246_ = true;
		else
		    throw new IllegalStateException("");
	    }
	    for (int i_269_ = 0; i_269_ < 8; i_269_++) {
		for (int i_270_ = 0; i_270_ < 8; i_270_++) {
		    int i_271_ = i_269_ + (i >> 3);
		    int i_272_ = (i_244_ >> 3) + i_270_;
		    if (i_271_ >= 0 && i_271_ < -60640777 * anInt4992 >> 3
			&& i_272_ >= 0
			&& i_272_ < -1584311401 * anInt5051 >> 3) {
			if (class634 != null)
			    aClass616_10344.method10151(i_271_, i_272_,
							class634, (byte) -117);
			Class286.method5265(i_271_, i_272_, bool_246_,
					    (short) 2048);
		    }
		}
	    }
	    if (!bool && null != aByteArrayArrayArray5067) {
		for (int i_273_ = 0; i_273_ < 4; i_273_++) {
		    if (null != aByteArrayArrayArray5067[i_273_]) {
			for (int i_274_ = 0; i_274_ < 16; i_274_++) {
			    for (int i_275_ = 0; i_275_ < 16; i_275_++) {
				int i_276_ = (i >> 2) + i_274_;
				int i_277_ = (i_244_ >> 2) + i_275_;
				if (i_276_ >= 0 && i_276_ < 26 && i_277_ >= 0
				    && i_277_ < 26)
				    aByteArrayArrayArray5067[i_273_]
					[i_276_][i_277_]
					= (byte) 0;
			    }
			}
		    }
		}
	    }
	}
    }
    
    public static final int method15952
	(Class44_Sub13 class44_sub13, byte[] is, int i, int i_278_, int i_279_,
	 int i_280_, Class647 class647, Class647 class647_281_) {
	int i_282_ = 0;
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	int i_283_ = -1;
	for (;;) {
	    int i_284_ = class534_sub40.method16598((byte) 8);
	    if (0 == i_284_)
		break;
	    i_283_ += i_284_;
	    int i_285_ = 0;
	    boolean bool = false;
	    for (;;) {
		if (bool) {
		    int i_286_ = class534_sub40.method16546(-1706829710);
		    if (0 == i_286_)
			break;
		    class534_sub40.method16527(871940638);
		} else {
		    int i_287_ = class534_sub40.method16546(-1706829710);
		    if (i_287_ == 0)
			break;
		    i_285_ += i_287_ - 1;
		    int i_288_ = i_285_ & 0x3f;
		    int i_289_ = i_285_ >> 6 & 0x3f;
		    int i_290_ = class534_sub40.method16527(-197053215) >> 2;
		    int i_291_ = i_290_ & 0x3;
		    i_290_ >>= 2;
		    int i_292_ = i_289_ + i;
		    int i_293_ = i_278_ + i_288_;
		    Class602 class602
			= ((Class602)
			   class44_sub13.method91(i_283_, -422217610));
		    int i_294_;
		    int i_295_;
		    if (0 == (i_291_ & 0x1)) {
			i_294_ = class602.anInt7904 * -1082258489;
			i_295_ = class602.anInt7928 * -1990374967;
		    } else {
			i_294_ = -1990374967 * class602.anInt7928;
			i_295_ = class602.anInt7904 * -1082258489;
		    }
		    if (i_292_ < i_279_ && i_293_ < i_280_
			&& i_292_ + i_294_ >= 0 && i_295_ + i_293_ >= 0) {
			if ((i_290_
			     != Class595.aClass595_7846.anInt7852 * 847393323)
			    || Class44_Sub6.aClass534_Sub35_10989
				   .aClass690_Sub10_10751
				   .method16970((byte) 12) != 0
			    || 0 != -2134171963 * class602.anInt7907
			    || 1 == class602.anInt7923 * -499459421
			    || class602.aBool7938) {
			    if (!class602.method9984(class647_281_,
						     -2127779242)) {
				class647.anInt8375 = i_283_ * 511701673;
				i_282_++;
			    }
			    bool = true;
			}
		    }
		}
	    }
	}
	return i_282_;
    }
    
    boolean method15953(Class185 class185, int i, int i_296_, boolean bool,
			Class602 class602, int i_297_, int i_298_, int i_299_,
			int i_300_, int i_301_, int i_302_, int i_303_,
			int i_304_, int i_305_) {
	if (i == 847393323 * Class595.aClass595_7834.anInt7852) {
	    Class654_Sub1_Sub3 class654_sub1_sub3;
	    if (bool) {
		Class654_Sub1_Sub3_Sub1 class654_sub1_sub3_sub1
		    = new Class654_Sub1_Sub3_Sub1(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_299_, i_300_,
						  i_301_, i_302_, i_303_,
						  aBool5002, 0, 0, i, i_296_);
		if (class654_sub1_sub3_sub1.method419((byte) 2))
		    class654_sub1_sub3_sub1.method408(class185, (byte) 30);
		class654_sub1_sub3 = class654_sub1_sub3_sub1;
	    } else
		class654_sub1_sub3
		    = new Class654_Sub1_Sub3_Sub2(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_299_, i_300_,
						  i_301_, i_302_, i_303_,
						  aBool5002, 0, 0, i, i_296_,
						  i_297_, i_298_);
	    aClass556_4984.method9245(i_299_, i_304_, i_305_,
				      class654_sub1_sub3, null, 1604666399);
	    return true;
	}
	if (i == 847393323 * Class595.aClass595_7835.anInt7852) {
	    int i_306_ = 65;
	    Interface62 interface62
		= (Interface62) aClass556_4984.method9258(i_299_, i_304_,
							  i_305_, (byte) -53);
	    if (interface62 != null)
		i_306_
		    = (((Class602)
			aClass44_Sub13_10338.method91(interface62
							  .method56(854161391),
						      -222853832)).anInt7917
		       * -1211724411) + 1;
	    Class654_Sub1_Sub3 class654_sub1_sub3;
	    if (bool) {
		Class654_Sub1_Sub3_Sub1 class654_sub1_sub3_sub1
		    = (new Class654_Sub1_Sub3_Sub1
		       (aClass556_4984, class185, aClass44_Sub13_10338,
			class602, i_299_, i_300_, i_301_, i_302_, i_303_,
			aBool5002, anIntArray10339[i_296_] * i_306_,
			anIntArray10340[i_296_] * i_306_, i, i_296_));
		if (class654_sub1_sub3_sub1.method419((byte) 2))
		    class654_sub1_sub3_sub1.method408(class185, (byte) 94);
		class654_sub1_sub3 = class654_sub1_sub3_sub1;
	    } else
		class654_sub1_sub3
		    = (new Class654_Sub1_Sub3_Sub2
		       (aClass556_4984, class185, aClass44_Sub13_10338,
			class602, i_299_, i_300_, i_301_, i_302_, i_303_,
			aBool5002, anIntArray10339[i_296_] * i_306_,
			i_306_ * anIntArray10340[i_296_], i, i_296_, i_297_,
			i_298_));
	    aClass556_4984.method9245(i_299_, i_304_, i_305_,
				      class654_sub1_sub3, null, 1604666399);
	    return true;
	}
	if (i == Class595.aClass595_7845.anInt7852 * 847393323) {
	    int i_307_ = 33;
	    Interface62 interface62
		= (Interface62) aClass556_4984.method9258(i_299_, i_304_,
							  i_305_, (byte) 58);
	    if (interface62 != null)
		i_307_
		    = (((Class602)
			aClass44_Sub13_10338.method91(interface62
							  .method56(760249546),
						      -94044050)).anInt7917
		       * -1211724411 / 2) + 1;
	    Class654_Sub1_Sub3 class654_sub1_sub3;
	    if (bool) {
		Class654_Sub1_Sub3_Sub1 class654_sub1_sub3_sub1
		    = (new Class654_Sub1_Sub3_Sub1
		       (aClass556_4984, class185, aClass44_Sub13_10338,
			class602, i_299_, i_300_, i_301_, i_302_, i_303_,
			aBool5002, anIntArray10339[i_296_] * i_307_,
			anIntArray10340[i_296_] * i_307_, i, i_296_ + 4));
		if (class654_sub1_sub3_sub1.method419((byte) 2))
		    class654_sub1_sub3_sub1.method408(class185, (byte) 52);
		class654_sub1_sub3 = class654_sub1_sub3_sub1;
	    } else
		class654_sub1_sub3
		    = (new Class654_Sub1_Sub3_Sub2
		       (aClass556_4984, class185, aClass44_Sub13_10338,
			class602, i_299_, i_300_, i_301_, i_302_, i_303_,
			aBool5002, anIntArray10334[i_296_] * i_307_,
			anIntArray10343[i_296_] * i_307_, i, i_296_ + 4,
			i_297_, i_298_));
	    aClass556_4984.method9245(i_299_, i_304_, i_305_,
				      class654_sub1_sub3, null, 1604666399);
	    return true;
	}
	if (i == 847393323 * Class595.aClass595_7837.anInt7852) {
	    int i_308_ = 2 + i_296_ & 0x3;
	    Class654_Sub1_Sub3 class654_sub1_sub3;
	    if (bool) {
		Class654_Sub1_Sub3_Sub1 class654_sub1_sub3_sub1
		    = new Class654_Sub1_Sub3_Sub1(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_299_, i_300_,
						  i_301_, i_302_, i_303_,
						  aBool5002, 0, 0, i,
						  i_308_ + 4);
		if (class654_sub1_sub3_sub1.method419((byte) 2))
		    class654_sub1_sub3_sub1.method408(class185, (byte) 74);
		class654_sub1_sub3 = class654_sub1_sub3_sub1;
	    } else
		class654_sub1_sub3
		    = new Class654_Sub1_Sub3_Sub2(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_299_, i_300_,
						  i_301_, i_302_, i_303_,
						  aBool5002, 0, 0, i,
						  4 + i_308_, i_297_, i_298_);
	    aClass556_4984.method9245(i_299_, i_304_, i_305_,
				      class654_sub1_sub3, null, 1604666399);
	    return true;
	}
	if (i == 847393323 * Class595.aClass595_7838.anInt7852) {
	    int i_309_ = i_296_ + 2 & 0x3;
	    int i_310_ = 33;
	    Interface62 interface62
		= (Interface62) aClass556_4984.method9258(i_299_, i_304_,
							  i_305_, (byte) -36);
	    if (interface62 != null)
		i_310_ = (((Class602) (aClass44_Sub13_10338.method91
				       (interface62.method56(-782451796),
					1144859385))).anInt7917
			  * -1211724411 / 2) + 1;
	    Class654_Sub1_Sub3 class654_sub1_sub3;
	    Class654_Sub1_Sub3 class654_sub1_sub3_311_;
	    if (bool) {
		Class654_Sub1_Sub3_Sub1 class654_sub1_sub3_sub1
		    = (new Class654_Sub1_Sub3_Sub1
		       (aClass556_4984, class185, aClass44_Sub13_10338,
			class602, i_299_, i_300_, i_301_, i_302_, i_303_,
			aBool5002, i_310_ * anIntArray10334[i_296_],
			i_310_ * anIntArray10343[i_296_], i, 4 + i_296_));
		Class654_Sub1_Sub3_Sub1 class654_sub1_sub3_sub1_312_
		    = new Class654_Sub1_Sub3_Sub1(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_299_, i_300_,
						  i_301_, i_302_, i_303_,
						  aBool5002, 0, 0, i,
						  4 + i_309_);
		if (class654_sub1_sub3_sub1.method419((byte) 2))
		    class654_sub1_sub3_sub1.method408(class185, (byte) 108);
		if (class654_sub1_sub3_sub1_312_.method419((byte) 2))
		    class654_sub1_sub3_sub1_312_.method408(class185,
							   (byte) 59);
		class654_sub1_sub3 = class654_sub1_sub3_sub1;
		class654_sub1_sub3_311_ = class654_sub1_sub3_sub1_312_;
	    } else {
		Class654_Sub1_Sub3_Sub2 class654_sub1_sub3_sub2
		    = (new Class654_Sub1_Sub3_Sub2
		       (aClass556_4984, class185, aClass44_Sub13_10338,
			class602, i_299_, i_300_, i_301_, i_302_, i_303_,
			aBool5002, anIntArray10334[i_296_] * i_310_,
			anIntArray10343[i_296_] * i_310_, i, 4 + i_296_,
			i_297_, i_298_));
		Class654_Sub1_Sub3_Sub2 class654_sub1_sub3_sub2_313_
		    = new Class654_Sub1_Sub3_Sub2(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_299_, i_300_,
						  i_301_, i_302_, i_303_,
						  aBool5002, 0, 0, i,
						  4 + i_309_, i_297_, i_298_);
		class654_sub1_sub3 = class654_sub1_sub3_sub2;
		class654_sub1_sub3_311_ = class654_sub1_sub3_sub2_313_;
	    }
	    aClass556_4984.method9245(i_299_, i_304_, i_305_,
				      class654_sub1_sub3,
				      class654_sub1_sub3_311_, 1604666399);
	    return true;
	}
	return false;
    }
    
    public final void method15954(Class185 class185, byte[] is, int i,
				  int i_314_) {
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	int i_315_ = -1;
	for (;;) {
	    int i_316_ = class534_sub40.method16598((byte) 8);
	    if (0 == i_316_)
		break;
	    i_315_ += i_316_;
	    int i_317_ = 0;
	    for (;;) {
		int i_318_ = class534_sub40.method16546(-1706829710);
		if (0 == i_318_)
		    break;
		i_317_ += i_318_ - 1;
		int i_319_ = i_317_ & 0x3f;
		int i_320_ = i_317_ >> 6 & 0x3f;
		int i_321_ = i_317_ >> 12;
		int i_322_ = class534_sub40.method16527(-1060113185);
		int i_323_ = i_322_ >> 2;
		int i_324_ = i_322_ & 0x3;
		int i_325_ = i + i_320_;
		int i_326_ = i_319_ + i_314_;
		Class602 class602
		    = ((Class602)
		       aClass44_Sub13_10338.method91(i_315_, -821953385));
		int i_327_;
		int i_328_;
		if ((i_324_ & 0x1) == 0) {
		    i_327_ = class602.anInt7904 * -1082258489;
		    i_328_ = -1990374967 * class602.anInt7928;
		} else {
		    i_327_ = class602.anInt7928 * -1990374967;
		    i_328_ = -1082258489 * class602.anInt7904;
		}
		int i_329_ = i_325_ + i_327_;
		int i_330_ = i_328_ + i_326_;
		if (i_325_ < anInt4992 * -60640777
		    && i_326_ < -1584311401 * anInt5051 && i_329_ > 0
		    && i_330_ > 0
		    && (847393323 * Class595.aClass595_7836.anInt7852 == i_323_
			|| (i_323_
			    == 847393323 * Class595.aClass595_7850.anInt7852)
			|| (i_325_ > 0 && i_326_ > 0
			    && i_325_ < anInt4992 * -60640777 - 1
			    && i_326_ < anInt5051 * -1584311401 - 1)))
		    method15942(class185, i_321_, i_321_, i_325_, i_326_,
				i_315_, i_324_, i_323_, -1, 0, 831966754);
	    }
	}
    }
    
    void method15955(Class185 class185, int i, int i_331_, int i_332_,
		     int i_333_) {
	Interface62 interface62
	    = method15946(i, i_331_, i_332_, i_333_, (byte) 31);
	if (null != interface62) {
	    Class602 class602
		= ((Class602)
		   aClass44_Sub13_10338.method91(interface62
						     .method56(-2122895987),
						 -254538500));
	    int i_334_ = interface62.method409(-1902032079);
	    int i_335_ = interface62.method410(-828813463);
	    if (class602.method9983((short) -3417))
		Class605.method10037(i, i_332_, i_333_, class602, (byte) 82);
	    if (interface62.method419((byte) 2))
		interface62.method414(class185, 2057351684);
	    if (0 == i_331_) {
		aClass556_4984.method9252(i, i_332_, i_333_, (byte) 12);
		aClass556_4984.method9225(i, i_332_, i_333_, -1003231600);
		if (1 == class602.anInt7911 * 1216611823) {
		    if (0 == i_335_)
			aClass556_4984.aClass552_7427.method9070(1, i, i_332_,
								 i_333_);
		    else if (i_335_ == 1)
			aClass556_4984.aClass552_7427.method9070(2, i, i_332_,
								 1 + i_333_);
		    else if (2 == i_335_)
			aClass556_4984.aClass552_7427
			    .method9070(1, i, 1 + i_332_, i_333_);
		    else if (3 == i_335_)
			aClass556_4984.aClass552_7427.method9070(2, i, i_332_,
								 i_333_);
		}
	    } else if (i_331_ == 1) {
		aClass556_4984.method9387(i, i_332_, i_333_, 1703660915);
		aClass556_4984.method9281(i, i_332_, i_333_, -938575396);
	    } else if (i_331_ == 2) {
		aClass556_4984.method9255(i, i_332_, i_333_,
					  client.anInterface64_11333,
					  (byte) 8);
		if (i_334_ == Class595.aClass595_7833.anInt7852 * 847393323) {
		    if (0 == (i_335_ & 0x1))
			aClass556_4984.aClass552_7427.method9070(8, i, i_332_,
								 i_333_);
		    else
			aClass556_4984.aClass552_7427.method9070(16, i, i_332_,
								 i_333_);
		}
	    } else if (3 == i_331_)
		aClass556_4984.method9253(i, i_332_, i_333_, (byte) -61);
	}
    }
    
    public Class460_Sub1(Class556 class556, Class44_Sub13 class44_sub13, int i,
			 int i_336_, int i_337_, boolean bool,
			 Class468 class468, Class616 class616) {
	super(class556, i, i_336_, i_337_, bool, Class555.aClass44_Sub16_7417,
	      Class88.aClass44_Sub12_884, class468);
	aClass44_Sub13_10338 = class44_sub13;
	aClass616_10344 = class616;
    }
    
    public final void method15956(Class185 class185, byte[] is, int i,
				  int i_338_) {
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	int i_339_ = -1;
	for (;;) {
	    int i_340_ = class534_sub40.method16598((byte) 8);
	    if (0 == i_340_)
		break;
	    i_339_ += i_340_;
	    int i_341_ = 0;
	    for (;;) {
		int i_342_ = class534_sub40.method16546(-1706829710);
		if (0 == i_342_)
		    break;
		i_341_ += i_342_ - 1;
		int i_343_ = i_341_ & 0x3f;
		int i_344_ = i_341_ >> 6 & 0x3f;
		int i_345_ = i_341_ >> 12;
		int i_346_ = class534_sub40.method16527(1544088136);
		int i_347_ = i_346_ >> 2;
		int i_348_ = i_346_ & 0x3;
		int i_349_ = i + i_344_;
		int i_350_ = i_343_ + i_338_;
		Class602 class602
		    = ((Class602)
		       aClass44_Sub13_10338.method91(i_339_, -919952532));
		int i_351_;
		int i_352_;
		if ((i_348_ & 0x1) == 0) {
		    i_351_ = class602.anInt7904 * -1082258489;
		    i_352_ = -1990374967 * class602.anInt7928;
		} else {
		    i_351_ = class602.anInt7928 * -1990374967;
		    i_352_ = -1082258489 * class602.anInt7904;
		}
		int i_353_ = i_349_ + i_351_;
		int i_354_ = i_352_ + i_350_;
		if (i_349_ < anInt4992 * -60640777
		    && i_350_ < -1584311401 * anInt5051 && i_353_ > 0
		    && i_354_ > 0
		    && (847393323 * Class595.aClass595_7836.anInt7852 == i_347_
			|| (i_347_
			    == 847393323 * Class595.aClass595_7850.anInt7852)
			|| (i_349_ > 0 && i_350_ > 0
			    && i_349_ < anInt4992 * -60640777 - 1
			    && i_350_ < anInt5051 * -1584311401 - 1)))
		    method15942(class185, i_345_, i_345_, i_349_, i_350_,
				i_339_, i_348_, i_347_, -1, 0, 347230082);
	    }
	}
    }
    
    public final void method15957(Class185 class185, byte[] is, int i,
				  int i_355_) {
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	int i_356_ = -1;
	for (;;) {
	    int i_357_ = class534_sub40.method16598((byte) 8);
	    if (0 == i_357_)
		break;
	    i_356_ += i_357_;
	    int i_358_ = 0;
	    for (;;) {
		int i_359_ = class534_sub40.method16546(-1706829710);
		if (0 == i_359_)
		    break;
		i_358_ += i_359_ - 1;
		int i_360_ = i_358_ & 0x3f;
		int i_361_ = i_358_ >> 6 & 0x3f;
		int i_362_ = i_358_ >> 12;
		int i_363_ = class534_sub40.method16527(1243242083);
		int i_364_ = i_363_ >> 2;
		int i_365_ = i_363_ & 0x3;
		int i_366_ = i + i_361_;
		int i_367_ = i_360_ + i_355_;
		Class602 class602
		    = ((Class602)
		       aClass44_Sub13_10338.method91(i_356_, 11448590));
		int i_368_;
		int i_369_;
		if ((i_365_ & 0x1) == 0) {
		    i_368_ = class602.anInt7904 * -1082258489;
		    i_369_ = -1990374967 * class602.anInt7928;
		} else {
		    i_368_ = class602.anInt7928 * -1990374967;
		    i_369_ = -1082258489 * class602.anInt7904;
		}
		int i_370_ = i_366_ + i_368_;
		int i_371_ = i_369_ + i_367_;
		if (i_366_ < anInt4992 * -60640777
		    && i_367_ < -1584311401 * anInt5051 && i_370_ > 0
		    && i_371_ > 0
		    && (847393323 * Class595.aClass595_7836.anInt7852 == i_364_
			|| (i_364_
			    == 847393323 * Class595.aClass595_7850.anInt7852)
			|| (i_366_ > 0 && i_367_ > 0
			    && i_366_ < anInt4992 * -60640777 - 1
			    && i_367_ < anInt5051 * -1584311401 - 1)))
		    method15942(class185, i_362_, i_362_, i_366_, i_367_,
				i_356_, i_365_, i_364_, -1, 0, -431550031);
	    }
	}
    }
    
    final void method15958(Class185 class185, int i, int i_372_, int i_373_,
			   int i_374_, int i_375_, int i_376_, int i_377_,
			   int i_378_, int i_379_) {
	if (i_372_ < 602499625 * anInt10345)
	    anInt10345 = i_372_ * -301477351;
	Class602 class602
	    = (Class602) aClass44_Sub13_10338.method91(i_375_, 172931366);
	if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub16_10763
		.method17030((byte) -12) != 0
	    || !class602.aBool7953) {
	    int i_380_;
	    int i_381_;
	    if (i_376_ == 1 || i_376_ == 3) {
		i_380_ = -1990374967 * class602.anInt7928;
		i_381_ = -1082258489 * class602.anInt7904;
	    } else {
		i_380_ = class602.anInt7904 * -1082258489;
		i_381_ = class602.anInt7928 * -1990374967;
	    }
	    int i_382_;
	    int i_383_;
	    if (i_373_ + i_380_ <= anInt4992 * -60640777) {
		i_382_ = i_373_ + (i_380_ >> 1);
		i_383_ = i_373_ + (i_380_ + 1 >> 1);
	    } else {
		i_382_ = i_373_;
		i_383_ = 1 + i_373_;
	    }
	    int i_384_;
	    int i_385_;
	    if (i_374_ + i_381_ <= -1584311401 * anInt5051) {
		i_384_ = i_374_ + (i_381_ >> 1);
		i_385_ = (i_381_ + 1 >> 1) + i_374_;
	    } else {
		i_384_ = i_374_;
		i_385_ = 1 + i_374_;
	    }
	    Class151 class151 = aClass556_4984.aClass151Array7432[i];
	    int i_386_;
	    if (847393323 * Class595.aClass595_7836.anInt7852 == i_377_
		|| i_377_ == Class595.aClass595_7850.anInt7852 * 847393323)
		i_386_ = ((class151.method2499(i_382_, i_384_, -2134992502)
			   + class151.method2499(i_383_, i_384_, -2121422552)
			   + class151.method2499(i_382_, i_385_, -2134849049)
			   + class151.method2499(i_383_, i_385_, -2107003774))
			  >> 2);
	    else
		i_386_ = ((class151.method2491(i_382_, i_384_, -316501235)
			   + class151.method2491(i_383_, i_384_, -2142499975)
			   + class151.method2491(i_382_, i_385_, 1698953383)
			   + class151.method2491(i_383_, i_385_, -1064015913))
			  >> 2);
	    int i_387_ = (i_380_ << 8) + (i_373_ << 9);
	    int i_388_ = (i_374_ << 9) + (i_381_ << 8);
	    boolean bool = aBool4997 && !aBool5002 && class602.aBool7910;
	    if (class602.method9983((short) -7418))
		Class449.method7330(i_372_, i_373_, i_374_, i_376_, class602,
				    null, null, 1192113178);
	    boolean bool_389_
		= (i_378_ == -1
		   && (!class602.method10015((byte) -120)
		       || (class602.aBool7916
			   && Class44_Sub6.aClass534_Sub35_10989
				  .aClass690_Sub30_10739
				  .method17143(-1569503751) == 0))
		   && null == class602.anIntArray7943 && !class602.aBool7957
		   && !class602.aBool7961);
	    if (!aBool10341
		|| ((!Class176.method2926(i_377_, (byte) 90)
		     || 1216611823 * class602.anInt7911 == 1)
		    && (!Class181.method2979(i_377_, (byte) -89)
			|| class602.anInt7911 * 1216611823 != 0))) {
		if (847393323 * Class595.aClass595_7846.anInt7852 == i_377_) {
		    if (Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub10_10751.method16970((byte) 12) != 0
			|| 0 != class602.anInt7907 * -2134171963
			|| class602.anInt7923 * -499459421 == 1
			|| class602.aBool7938) {
			Class654_Sub1_Sub2 class654_sub1_sub2;
			if (bool_389_) {
			    Class654_Sub1_Sub2_Sub1 class654_sub1_sub2_sub1
				= (new Class654_Sub1_Sub2_Sub1
				   (aClass556_4984, class185,
				    aClass44_Sub13_10338, class602, i_372_, i,
				    i_387_, i_386_, i_388_, aBool5002, i_376_,
				    bool));
			    if (class654_sub1_sub2_sub1.method419((byte) 2))
				class654_sub1_sub2_sub1.method408(class185,
								  (byte) 21);
			    class654_sub1_sub2 = class654_sub1_sub2_sub1;
			} else
			    class654_sub1_sub2
				= (new Class654_Sub1_Sub2_Sub2
				   (aClass556_4984, class185,
				    aClass44_Sub13_10338, class602, i_372_, i,
				    i_387_, i_386_, i_388_, aBool5002, i_376_,
				    i_378_, i_379_));
			aClass556_4984.method9242(i_372_, i_373_, i_374_,
						  class654_sub1_sub2,
						  -157395649);
		    }
		} else if ((i_377_
			    == 847393323 * Class595.aClass595_7836.anInt7852)
			   || i_377_ == (Class595.aClass595_7850.anInt7852
					 * 847393323)) {
		    Class654_Sub1_Sub5_Sub2 class654_sub1_sub5_sub2 = null;
		    Class654_Sub1_Sub5 class654_sub1_sub5;
		    int i_390_;
		    if (bool_389_) {
			Class654_Sub1_Sub5_Sub2 class654_sub1_sub5_sub2_391_
			    = (new Class654_Sub1_Sub5_Sub2
			       (aClass556_4984, class185, aClass44_Sub13_10338,
				class602, i_372_, i, i_387_, i_386_, i_388_,
				aBool5002, i_373_, i_380_ + i_373_ - 1, i_374_,
				i_374_ + i_381_ - 1, i_377_, i_376_, bool,
				(class602.aClass593_7963
				 != Class593.aClass593_7822)));
			i_390_ = class654_sub1_sub5_sub2_391_
				     .method18623(-1447271365);
			class654_sub1_sub5 = class654_sub1_sub5_sub2_391_;
			class654_sub1_sub5_sub2 = class654_sub1_sub5_sub2_391_;
		    } else {
			class654_sub1_sub5
			    = (new Class654_Sub1_Sub5_Sub3
			       (aClass556_4984, class185, aClass44_Sub13_10338,
				class602, i_372_, i, i_387_, i_386_, i_388_,
				aBool5002, i_373_, i_380_ + i_373_ - 1, i_374_,
				i_381_ + i_374_ - 1, i_377_, i_376_, i_378_,
				i_379_,
				(Class593.aClass593_7822
				 != class602.aClass593_7963)));
			i_390_ = 15;
		    }
		    if (aClass556_4984.method9246(class654_sub1_sub5, false,
						  (byte) 8)) {
			if (class654_sub1_sub5_sub2 != null
			    && class654_sub1_sub5_sub2.method419((byte) 2))
			    class654_sub1_sub5_sub2.method408(class185,
							      (byte) 90);
			if (class602.aBool7959 && aBool4997) {
			    if (i_390_ > 30)
				i_390_ = 30;
			    for (int i_392_ = 0; i_392_ <= i_380_; i_392_++) {
				for (int i_393_ = 0; i_393_ <= i_381_;
				     i_393_++)
				    class151.method2492(i_392_ + i_373_,
							i_374_ + i_393_,
							i_390_);
			    }
			}
		    }
		} else if (Class181.method2979(i_377_, (byte) -70)
			   || Class255.method4648(i_377_, (byte) 5)) {
		    Class654_Sub1_Sub5 class654_sub1_sub5;
		    if (bool_389_) {
			Class654_Sub1_Sub5_Sub2 class654_sub1_sub5_sub2
			    = (new Class654_Sub1_Sub5_Sub2
			       (aClass556_4984, class185, aClass44_Sub13_10338,
				class602, i_372_, i, i_387_, i_386_, i_388_,
				aBool5002, i_373_, i_380_ + i_373_ - 1, i_374_,
				i_374_ + i_381_ - 1, i_377_, i_376_, bool,
				true));
			if (class654_sub1_sub5_sub2.method419((byte) 2))
			    class654_sub1_sub5_sub2.method408(class185,
							      (byte) 7);
			class654_sub1_sub5 = class654_sub1_sub5_sub2;
		    } else
			class654_sub1_sub5
			    = (new Class654_Sub1_Sub5_Sub3
			       (aClass556_4984, class185, aClass44_Sub13_10338,
				class602, i_372_, i, i_387_, i_386_, i_388_,
				aBool5002, i_373_, i_380_ + i_373_ - 1, i_374_,
				i_374_ + i_381_ - 1, i_377_, i_376_, i_378_,
				i_379_, true));
		    aClass556_4984.method9246(class654_sub1_sub5, false,
					      (byte) 8);
		    if (aBool4997 && !aBool5002
			&& Class181.method2979(i_377_, (byte) -6)
			&& (Class595.aClass595_7840.anInt7852 * 847393323
			    != i_377_)
			&& i_372_ > 0 && class602.anInt7911 * 1216611823 != 0)
			aByteArrayArrayArray4989[i_372_][i_373_][i_374_]
			    |= 0x4;
		} else if (method15943(class185, i_377_, i_376_, bool_389_,
				       class602, i_378_, i_379_, i_372_, i,
				       i_387_, i_386_, i_388_, i_373_, i_374_,
				       bool, class151, i_380_, i_381_,
				       (byte) -36)
			   || method15945(class185, i_377_, i_376_, bool_389_,
					  class602, i_378_, i_379_, i_372_, i,
					  i_387_, i_386_, i_388_, i_373_,
					  i_374_, (short) 21344)) {
		    /* empty */
		}
	    }
	}
    }
    
    final void method15959(Class185 class185, int i, int i_394_, int i_395_,
			   int i_396_, int i_397_, int i_398_, int i_399_,
			   int i_400_, int i_401_) {
	if (i_394_ < 602499625 * anInt10345)
	    anInt10345 = i_394_ * -301477351;
	Class602 class602
	    = (Class602) aClass44_Sub13_10338.method91(i_397_, 1335905533);
	if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub16_10763
		.method17030((byte) 2) != 0
	    || !class602.aBool7953) {
	    int i_402_;
	    int i_403_;
	    if (i_398_ == 1 || i_398_ == 3) {
		i_402_ = -1990374967 * class602.anInt7928;
		i_403_ = -1082258489 * class602.anInt7904;
	    } else {
		i_402_ = class602.anInt7904 * -1082258489;
		i_403_ = class602.anInt7928 * -1990374967;
	    }
	    int i_404_;
	    int i_405_;
	    if (i_395_ + i_402_ <= anInt4992 * -60640777) {
		i_404_ = i_395_ + (i_402_ >> 1);
		i_405_ = i_395_ + (i_402_ + 1 >> 1);
	    } else {
		i_404_ = i_395_;
		i_405_ = 1 + i_395_;
	    }
	    int i_406_;
	    int i_407_;
	    if (i_396_ + i_403_ <= -1584311401 * anInt5051) {
		i_406_ = i_396_ + (i_403_ >> 1);
		i_407_ = (i_403_ + 1 >> 1) + i_396_;
	    } else {
		i_406_ = i_396_;
		i_407_ = 1 + i_396_;
	    }
	    Class151 class151 = aClass556_4984.aClass151Array7432[i];
	    int i_408_;
	    if (847393323 * Class595.aClass595_7836.anInt7852 == i_399_
		|| i_399_ == Class595.aClass595_7850.anInt7852 * 847393323)
		i_408_ = ((class151.method2499(i_404_, i_406_, -2111951713)
			   + class151.method2499(i_405_, i_406_, -2138182972)
			   + class151.method2499(i_404_, i_407_, -2075258314)
			   + class151.method2499(i_405_, i_407_, -2123553698))
			  >> 2);
	    else
		i_408_
		    = (class151.method2491(i_404_, i_406_, -872028872)
		       + class151.method2491(i_405_, i_406_, 1533454834)
		       + class151.method2491(i_404_, i_407_, -491235925)
		       + class151.method2491(i_405_, i_407_, -127881262)) >> 2;
	    int i_409_ = (i_402_ << 8) + (i_395_ << 9);
	    int i_410_ = (i_396_ << 9) + (i_403_ << 8);
	    boolean bool = aBool4997 && !aBool5002 && class602.aBool7910;
	    if (class602.method9983((short) -22070))
		Class449.method7330(i_394_, i_395_, i_396_, i_398_, class602,
				    null, null, 1573739927);
	    boolean bool_411_
		= (i_400_ == -1
		   && (!class602.method10015((byte) -1)
		       || (class602.aBool7916
			   && Class44_Sub6.aClass534_Sub35_10989
				  .aClass690_Sub30_10739
				  .method17143(-1569503751) == 0))
		   && null == class602.anIntArray7943 && !class602.aBool7957
		   && !class602.aBool7961);
	    if (!aBool10341
		|| ((!Class176.method2926(i_399_, (byte) 62)
		     || 1216611823 * class602.anInt7911 == 1)
		    && (!Class181.method2979(i_399_, (byte) -9)
			|| class602.anInt7911 * 1216611823 != 0))) {
		if (847393323 * Class595.aClass595_7846.anInt7852 == i_399_) {
		    if (Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub10_10751.method16970((byte) 12) != 0
			|| 0 != class602.anInt7907 * -2134171963
			|| class602.anInt7923 * -499459421 == 1
			|| class602.aBool7938) {
			Class654_Sub1_Sub2 class654_sub1_sub2;
			if (bool_411_) {
			    Class654_Sub1_Sub2_Sub1 class654_sub1_sub2_sub1
				= (new Class654_Sub1_Sub2_Sub1
				   (aClass556_4984, class185,
				    aClass44_Sub13_10338, class602, i_394_, i,
				    i_409_, i_408_, i_410_, aBool5002, i_398_,
				    bool));
			    if (class654_sub1_sub2_sub1.method419((byte) 2))
				class654_sub1_sub2_sub1.method408(class185,
								  (byte) 35);
			    class654_sub1_sub2 = class654_sub1_sub2_sub1;
			} else
			    class654_sub1_sub2
				= (new Class654_Sub1_Sub2_Sub2
				   (aClass556_4984, class185,
				    aClass44_Sub13_10338, class602, i_394_, i,
				    i_409_, i_408_, i_410_, aBool5002, i_398_,
				    i_400_, i_401_));
			aClass556_4984.method9242(i_394_, i_395_, i_396_,
						  class654_sub1_sub2,
						  503381000);
		    }
		} else if ((i_399_
			    == 847393323 * Class595.aClass595_7836.anInt7852)
			   || i_399_ == (Class595.aClass595_7850.anInt7852
					 * 847393323)) {
		    Class654_Sub1_Sub5_Sub2 class654_sub1_sub5_sub2 = null;
		    Class654_Sub1_Sub5 class654_sub1_sub5;
		    int i_412_;
		    if (bool_411_) {
			Class654_Sub1_Sub5_Sub2 class654_sub1_sub5_sub2_413_
			    = (new Class654_Sub1_Sub5_Sub2
			       (aClass556_4984, class185, aClass44_Sub13_10338,
				class602, i_394_, i, i_409_, i_408_, i_410_,
				aBool5002, i_395_, i_402_ + i_395_ - 1, i_396_,
				i_396_ + i_403_ - 1, i_399_, i_398_, bool,
				(class602.aClass593_7963
				 != Class593.aClass593_7822)));
			i_412_ = class654_sub1_sub5_sub2_413_
				     .method18623(-1814385268);
			class654_sub1_sub5 = class654_sub1_sub5_sub2_413_;
			class654_sub1_sub5_sub2 = class654_sub1_sub5_sub2_413_;
		    } else {
			class654_sub1_sub5
			    = (new Class654_Sub1_Sub5_Sub3
			       (aClass556_4984, class185, aClass44_Sub13_10338,
				class602, i_394_, i, i_409_, i_408_, i_410_,
				aBool5002, i_395_, i_402_ + i_395_ - 1, i_396_,
				i_403_ + i_396_ - 1, i_399_, i_398_, i_400_,
				i_401_,
				(Class593.aClass593_7822
				 != class602.aClass593_7963)));
			i_412_ = 15;
		    }
		    if (aClass556_4984.method9246(class654_sub1_sub5, false,
						  (byte) 8)) {
			if (class654_sub1_sub5_sub2 != null
			    && class654_sub1_sub5_sub2.method419((byte) 2))
			    class654_sub1_sub5_sub2.method408(class185,
							      (byte) 42);
			if (class602.aBool7959 && aBool4997) {
			    if (i_412_ > 30)
				i_412_ = 30;
			    for (int i_414_ = 0; i_414_ <= i_402_; i_414_++) {
				for (int i_415_ = 0; i_415_ <= i_403_;
				     i_415_++)
				    class151.method2492(i_414_ + i_395_,
							i_396_ + i_415_,
							i_412_);
			    }
			}
		    }
		} else if (Class181.method2979(i_399_, (byte) -53)
			   || Class255.method4648(i_399_, (byte) 63)) {
		    Class654_Sub1_Sub5 class654_sub1_sub5;
		    if (bool_411_) {
			Class654_Sub1_Sub5_Sub2 class654_sub1_sub5_sub2
			    = (new Class654_Sub1_Sub5_Sub2
			       (aClass556_4984, class185, aClass44_Sub13_10338,
				class602, i_394_, i, i_409_, i_408_, i_410_,
				aBool5002, i_395_, i_402_ + i_395_ - 1, i_396_,
				i_396_ + i_403_ - 1, i_399_, i_398_, bool,
				true));
			if (class654_sub1_sub5_sub2.method419((byte) 2))
			    class654_sub1_sub5_sub2.method408(class185,
							      (byte) 30);
			class654_sub1_sub5 = class654_sub1_sub5_sub2;
		    } else
			class654_sub1_sub5
			    = (new Class654_Sub1_Sub5_Sub3
			       (aClass556_4984, class185, aClass44_Sub13_10338,
				class602, i_394_, i, i_409_, i_408_, i_410_,
				aBool5002, i_395_, i_402_ + i_395_ - 1, i_396_,
				i_396_ + i_403_ - 1, i_399_, i_398_, i_400_,
				i_401_, true));
		    aClass556_4984.method9246(class654_sub1_sub5, false,
					      (byte) 8);
		    if (aBool4997 && !aBool5002
			&& Class181.method2979(i_399_, (byte) 0)
			&& (Class595.aClass595_7840.anInt7852 * 847393323
			    != i_399_)
			&& i_394_ > 0 && class602.anInt7911 * 1216611823 != 0)
			aByteArrayArrayArray4989[i_394_][i_395_][i_396_]
			    |= 0x4;
		} else if (method15943(class185, i_399_, i_398_, bool_411_,
				       class602, i_400_, i_401_, i_394_, i,
				       i_409_, i_408_, i_410_, i_395_, i_396_,
				       bool, class151, i_402_, i_403_,
				       (byte) -88)
			   || method15945(class185, i_399_, i_398_, bool_411_,
					  class602, i_400_, i_401_, i_394_, i,
					  i_409_, i_408_, i_410_, i_395_,
					  i_396_, (short) 28189)) {
		    /* empty */
		}
	    }
	}
    }
    
    final void method15960(Class185 class185, int i, int i_416_, int i_417_,
			   int i_418_, int i_419_, int i_420_, int i_421_,
			   int i_422_, int i_423_) {
	if (i_416_ < 602499625 * anInt10345)
	    anInt10345 = i_416_ * -301477351;
	Class602 class602
	    = (Class602) aClass44_Sub13_10338.method91(i_419_, 319886501);
	if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub16_10763
		.method17030((byte) -6) != 0
	    || !class602.aBool7953) {
	    int i_424_;
	    int i_425_;
	    if (i_420_ == 1 || i_420_ == 3) {
		i_424_ = -1990374967 * class602.anInt7928;
		i_425_ = -1082258489 * class602.anInt7904;
	    } else {
		i_424_ = class602.anInt7904 * -1082258489;
		i_425_ = class602.anInt7928 * -1990374967;
	    }
	    int i_426_;
	    int i_427_;
	    if (i_417_ + i_424_ <= anInt4992 * -60640777) {
		i_426_ = i_417_ + (i_424_ >> 1);
		i_427_ = i_417_ + (i_424_ + 1 >> 1);
	    } else {
		i_426_ = i_417_;
		i_427_ = 1 + i_417_;
	    }
	    int i_428_;
	    int i_429_;
	    if (i_418_ + i_425_ <= -1584311401 * anInt5051) {
		i_428_ = i_418_ + (i_425_ >> 1);
		i_429_ = (i_425_ + 1 >> 1) + i_418_;
	    } else {
		i_428_ = i_418_;
		i_429_ = 1 + i_418_;
	    }
	    Class151 class151 = aClass556_4984.aClass151Array7432[i];
	    int i_430_;
	    if (847393323 * Class595.aClass595_7836.anInt7852 == i_421_
		|| i_421_ == Class595.aClass595_7850.anInt7852 * 847393323)
		i_430_ = ((class151.method2499(i_426_, i_428_, -2098088587)
			   + class151.method2499(i_427_, i_428_, -2095028845)
			   + class151.method2499(i_426_, i_429_, -2073289330)
			   + class151.method2499(i_427_, i_429_, -2144518365))
			  >> 2);
	    else
		i_430_
		    = (class151.method2491(i_426_, i_428_, 1181063606)
		       + class151.method2491(i_427_, i_428_, -693612655)
		       + class151.method2491(i_426_, i_429_, -697461843)
		       + class151.method2491(i_427_, i_429_, 555131823)) >> 2;
	    int i_431_ = (i_424_ << 8) + (i_417_ << 9);
	    int i_432_ = (i_418_ << 9) + (i_425_ << 8);
	    boolean bool = aBool4997 && !aBool5002 && class602.aBool7910;
	    if (class602.method9983((short) -829))
		Class449.method7330(i_416_, i_417_, i_418_, i_420_, class602,
				    null, null, 1133438456);
	    boolean bool_433_
		= (i_422_ == -1
		   && (!class602.method10015((byte) -12)
		       || (class602.aBool7916
			   && Class44_Sub6.aClass534_Sub35_10989
				  .aClass690_Sub30_10739
				  .method17143(-1569503751) == 0))
		   && null == class602.anIntArray7943 && !class602.aBool7957
		   && !class602.aBool7961);
	    if (!aBool10341
		|| ((!Class176.method2926(i_421_, (byte) 81)
		     || 1216611823 * class602.anInt7911 == 1)
		    && (!Class181.method2979(i_421_, (byte) -121)
			|| class602.anInt7911 * 1216611823 != 0))) {
		if (847393323 * Class595.aClass595_7846.anInt7852 == i_421_) {
		    if (Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub10_10751.method16970((byte) 12) != 0
			|| 0 != class602.anInt7907 * -2134171963
			|| class602.anInt7923 * -499459421 == 1
			|| class602.aBool7938) {
			Class654_Sub1_Sub2 class654_sub1_sub2;
			if (bool_433_) {
			    Class654_Sub1_Sub2_Sub1 class654_sub1_sub2_sub1
				= (new Class654_Sub1_Sub2_Sub1
				   (aClass556_4984, class185,
				    aClass44_Sub13_10338, class602, i_416_, i,
				    i_431_, i_430_, i_432_, aBool5002, i_420_,
				    bool));
			    if (class654_sub1_sub2_sub1.method419((byte) 2))
				class654_sub1_sub2_sub1.method408(class185,
								  (byte) 23);
			    class654_sub1_sub2 = class654_sub1_sub2_sub1;
			} else
			    class654_sub1_sub2
				= (new Class654_Sub1_Sub2_Sub2
				   (aClass556_4984, class185,
				    aClass44_Sub13_10338, class602, i_416_, i,
				    i_431_, i_430_, i_432_, aBool5002, i_420_,
				    i_422_, i_423_));
			aClass556_4984.method9242(i_416_, i_417_, i_418_,
						  class654_sub1_sub2,
						  725952814);
		    }
		} else if ((i_421_
			    == 847393323 * Class595.aClass595_7836.anInt7852)
			   || i_421_ == (Class595.aClass595_7850.anInt7852
					 * 847393323)) {
		    Class654_Sub1_Sub5_Sub2 class654_sub1_sub5_sub2 = null;
		    Class654_Sub1_Sub5 class654_sub1_sub5;
		    int i_434_;
		    if (bool_433_) {
			Class654_Sub1_Sub5_Sub2 class654_sub1_sub5_sub2_435_
			    = (new Class654_Sub1_Sub5_Sub2
			       (aClass556_4984, class185, aClass44_Sub13_10338,
				class602, i_416_, i, i_431_, i_430_, i_432_,
				aBool5002, i_417_, i_424_ + i_417_ - 1, i_418_,
				i_418_ + i_425_ - 1, i_421_, i_420_, bool,
				(class602.aClass593_7963
				 != Class593.aClass593_7822)));
			i_434_ = class654_sub1_sub5_sub2_435_
				     .method18623(-1912351106);
			class654_sub1_sub5 = class654_sub1_sub5_sub2_435_;
			class654_sub1_sub5_sub2 = class654_sub1_sub5_sub2_435_;
		    } else {
			class654_sub1_sub5
			    = (new Class654_Sub1_Sub5_Sub3
			       (aClass556_4984, class185, aClass44_Sub13_10338,
				class602, i_416_, i, i_431_, i_430_, i_432_,
				aBool5002, i_417_, i_424_ + i_417_ - 1, i_418_,
				i_425_ + i_418_ - 1, i_421_, i_420_, i_422_,
				i_423_,
				(Class593.aClass593_7822
				 != class602.aClass593_7963)));
			i_434_ = 15;
		    }
		    if (aClass556_4984.method9246(class654_sub1_sub5, false,
						  (byte) 8)) {
			if (class654_sub1_sub5_sub2 != null
			    && class654_sub1_sub5_sub2.method419((byte) 2))
			    class654_sub1_sub5_sub2.method408(class185,
							      (byte) 92);
			if (class602.aBool7959 && aBool4997) {
			    if (i_434_ > 30)
				i_434_ = 30;
			    for (int i_436_ = 0; i_436_ <= i_424_; i_436_++) {
				for (int i_437_ = 0; i_437_ <= i_425_;
				     i_437_++)
				    class151.method2492(i_436_ + i_417_,
							i_418_ + i_437_,
							i_434_);
			    }
			}
		    }
		} else if (Class181.method2979(i_421_, (byte) -78)
			   || Class255.method4648(i_421_, (byte) -57)) {
		    Class654_Sub1_Sub5 class654_sub1_sub5;
		    if (bool_433_) {
			Class654_Sub1_Sub5_Sub2 class654_sub1_sub5_sub2
			    = (new Class654_Sub1_Sub5_Sub2
			       (aClass556_4984, class185, aClass44_Sub13_10338,
				class602, i_416_, i, i_431_, i_430_, i_432_,
				aBool5002, i_417_, i_424_ + i_417_ - 1, i_418_,
				i_418_ + i_425_ - 1, i_421_, i_420_, bool,
				true));
			if (class654_sub1_sub5_sub2.method419((byte) 2))
			    class654_sub1_sub5_sub2.method408(class185,
							      (byte) 27);
			class654_sub1_sub5 = class654_sub1_sub5_sub2;
		    } else
			class654_sub1_sub5
			    = (new Class654_Sub1_Sub5_Sub3
			       (aClass556_4984, class185, aClass44_Sub13_10338,
				class602, i_416_, i, i_431_, i_430_, i_432_,
				aBool5002, i_417_, i_424_ + i_417_ - 1, i_418_,
				i_418_ + i_425_ - 1, i_421_, i_420_, i_422_,
				i_423_, true));
		    aClass556_4984.method9246(class654_sub1_sub5, false,
					      (byte) 8);
		    if (aBool4997 && !aBool5002
			&& Class181.method2979(i_421_, (byte) -58)
			&& (Class595.aClass595_7840.anInt7852 * 847393323
			    != i_421_)
			&& i_416_ > 0 && class602.anInt7911 * 1216611823 != 0)
			aByteArrayArrayArray4989[i_416_][i_417_][i_418_]
			    |= 0x4;
		} else if (method15943(class185, i_421_, i_420_, bool_433_,
				       class602, i_422_, i_423_, i_416_, i,
				       i_431_, i_430_, i_432_, i_417_, i_418_,
				       bool, class151, i_424_, i_425_,
				       (byte) 95)
			   || method15945(class185, i_421_, i_420_, bool_433_,
					  class602, i_422_, i_423_, i_416_, i,
					  i_431_, i_430_, i_432_, i_417_,
					  i_418_, (short) 20608)) {
		    /* empty */
		}
	    }
	}
    }
    
    final void method15961(Class185 class185, int i, int i_438_, int i_439_,
			   int i_440_, int i_441_, int i_442_, int i_443_,
			   int i_444_, int i_445_) {
	if (i_438_ < 602499625 * anInt10345)
	    anInt10345 = i_438_ * -301477351;
	Class602 class602
	    = (Class602) aClass44_Sub13_10338.method91(i_441_, 389019820);
	if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub16_10763
		.method17030((byte) -20) != 0
	    || !class602.aBool7953) {
	    int i_446_;
	    int i_447_;
	    if (i_442_ == 1 || i_442_ == 3) {
		i_446_ = -1990374967 * class602.anInt7928;
		i_447_ = -1082258489 * class602.anInt7904;
	    } else {
		i_446_ = class602.anInt7904 * -1082258489;
		i_447_ = class602.anInt7928 * -1990374967;
	    }
	    int i_448_;
	    int i_449_;
	    if (i_439_ + i_446_ <= anInt4992 * -60640777) {
		i_448_ = i_439_ + (i_446_ >> 1);
		i_449_ = i_439_ + (i_446_ + 1 >> 1);
	    } else {
		i_448_ = i_439_;
		i_449_ = 1 + i_439_;
	    }
	    int i_450_;
	    int i_451_;
	    if (i_440_ + i_447_ <= -1584311401 * anInt5051) {
		i_450_ = i_440_ + (i_447_ >> 1);
		i_451_ = (i_447_ + 1 >> 1) + i_440_;
	    } else {
		i_450_ = i_440_;
		i_451_ = 1 + i_440_;
	    }
	    Class151 class151 = aClass556_4984.aClass151Array7432[i];
	    int i_452_;
	    if (847393323 * Class595.aClass595_7836.anInt7852 == i_443_
		|| i_443_ == Class595.aClass595_7850.anInt7852 * 847393323)
		i_452_ = ((class151.method2499(i_448_, i_450_, -2115833280)
			   + class151.method2499(i_449_, i_450_, -2119293184)
			   + class151.method2499(i_448_, i_451_, -2086107809)
			   + class151.method2499(i_449_, i_451_, -2076334690))
			  >> 2);
	    else
		i_452_ = ((class151.method2491(i_448_, i_450_, -918346416)
			   + class151.method2491(i_449_, i_450_, -467022748)
			   + class151.method2491(i_448_, i_451_, -1138648675)
			   + class151.method2491(i_449_, i_451_, -2087750169))
			  >> 2);
	    int i_453_ = (i_446_ << 8) + (i_439_ << 9);
	    int i_454_ = (i_440_ << 9) + (i_447_ << 8);
	    boolean bool = aBool4997 && !aBool5002 && class602.aBool7910;
	    if (class602.method9983((short) -14145))
		Class449.method7330(i_438_, i_439_, i_440_, i_442_, class602,
				    null, null, 459854172);
	    boolean bool_455_
		= (i_444_ == -1
		   && (!class602.method10015((byte) -126)
		       || (class602.aBool7916
			   && Class44_Sub6.aClass534_Sub35_10989
				  .aClass690_Sub30_10739
				  .method17143(-1569503751) == 0))
		   && null == class602.anIntArray7943 && !class602.aBool7957
		   && !class602.aBool7961);
	    if (!aBool10341
		|| ((!Class176.method2926(i_443_, (byte) -61)
		     || 1216611823 * class602.anInt7911 == 1)
		    && (!Class181.method2979(i_443_, (byte) 6)
			|| class602.anInt7911 * 1216611823 != 0))) {
		if (847393323 * Class595.aClass595_7846.anInt7852 == i_443_) {
		    if (Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub10_10751.method16970((byte) 12) != 0
			|| 0 != class602.anInt7907 * -2134171963
			|| class602.anInt7923 * -499459421 == 1
			|| class602.aBool7938) {
			Class654_Sub1_Sub2 class654_sub1_sub2;
			if (bool_455_) {
			    Class654_Sub1_Sub2_Sub1 class654_sub1_sub2_sub1
				= (new Class654_Sub1_Sub2_Sub1
				   (aClass556_4984, class185,
				    aClass44_Sub13_10338, class602, i_438_, i,
				    i_453_, i_452_, i_454_, aBool5002, i_442_,
				    bool));
			    if (class654_sub1_sub2_sub1.method419((byte) 2))
				class654_sub1_sub2_sub1.method408(class185,
								  (byte) 89);
			    class654_sub1_sub2 = class654_sub1_sub2_sub1;
			} else
			    class654_sub1_sub2
				= (new Class654_Sub1_Sub2_Sub2
				   (aClass556_4984, class185,
				    aClass44_Sub13_10338, class602, i_438_, i,
				    i_453_, i_452_, i_454_, aBool5002, i_442_,
				    i_444_, i_445_));
			aClass556_4984.method9242(i_438_, i_439_, i_440_,
						  class654_sub1_sub2,
						  -360805575);
		    }
		} else if ((i_443_
			    == 847393323 * Class595.aClass595_7836.anInt7852)
			   || i_443_ == (Class595.aClass595_7850.anInt7852
					 * 847393323)) {
		    Class654_Sub1_Sub5_Sub2 class654_sub1_sub5_sub2 = null;
		    Class654_Sub1_Sub5 class654_sub1_sub5;
		    int i_456_;
		    if (bool_455_) {
			Class654_Sub1_Sub5_Sub2 class654_sub1_sub5_sub2_457_
			    = (new Class654_Sub1_Sub5_Sub2
			       (aClass556_4984, class185, aClass44_Sub13_10338,
				class602, i_438_, i, i_453_, i_452_, i_454_,
				aBool5002, i_439_, i_446_ + i_439_ - 1, i_440_,
				i_440_ + i_447_ - 1, i_443_, i_442_, bool,
				(class602.aClass593_7963
				 != Class593.aClass593_7822)));
			i_456_ = class654_sub1_sub5_sub2_457_
				     .method18623(-2068478466);
			class654_sub1_sub5 = class654_sub1_sub5_sub2_457_;
			class654_sub1_sub5_sub2 = class654_sub1_sub5_sub2_457_;
		    } else {
			class654_sub1_sub5
			    = (new Class654_Sub1_Sub5_Sub3
			       (aClass556_4984, class185, aClass44_Sub13_10338,
				class602, i_438_, i, i_453_, i_452_, i_454_,
				aBool5002, i_439_, i_446_ + i_439_ - 1, i_440_,
				i_447_ + i_440_ - 1, i_443_, i_442_, i_444_,
				i_445_,
				(Class593.aClass593_7822
				 != class602.aClass593_7963)));
			i_456_ = 15;
		    }
		    if (aClass556_4984.method9246(class654_sub1_sub5, false,
						  (byte) 8)) {
			if (class654_sub1_sub5_sub2 != null
			    && class654_sub1_sub5_sub2.method419((byte) 2))
			    class654_sub1_sub5_sub2.method408(class185,
							      (byte) 86);
			if (class602.aBool7959 && aBool4997) {
			    if (i_456_ > 30)
				i_456_ = 30;
			    for (int i_458_ = 0; i_458_ <= i_446_; i_458_++) {
				for (int i_459_ = 0; i_459_ <= i_447_;
				     i_459_++)
				    class151.method2492(i_458_ + i_439_,
							i_440_ + i_459_,
							i_456_);
			    }
			}
		    }
		} else if (Class181.method2979(i_443_, (byte) -118)
			   || Class255.method4648(i_443_, (byte) -56)) {
		    Class654_Sub1_Sub5 class654_sub1_sub5;
		    if (bool_455_) {
			Class654_Sub1_Sub5_Sub2 class654_sub1_sub5_sub2
			    = (new Class654_Sub1_Sub5_Sub2
			       (aClass556_4984, class185, aClass44_Sub13_10338,
				class602, i_438_, i, i_453_, i_452_, i_454_,
				aBool5002, i_439_, i_446_ + i_439_ - 1, i_440_,
				i_440_ + i_447_ - 1, i_443_, i_442_, bool,
				true));
			if (class654_sub1_sub5_sub2.method419((byte) 2))
			    class654_sub1_sub5_sub2.method408(class185,
							      (byte) 59);
			class654_sub1_sub5 = class654_sub1_sub5_sub2;
		    } else
			class654_sub1_sub5
			    = (new Class654_Sub1_Sub5_Sub3
			       (aClass556_4984, class185, aClass44_Sub13_10338,
				class602, i_438_, i, i_453_, i_452_, i_454_,
				aBool5002, i_439_, i_446_ + i_439_ - 1, i_440_,
				i_440_ + i_447_ - 1, i_443_, i_442_, i_444_,
				i_445_, true));
		    aClass556_4984.method9246(class654_sub1_sub5, false,
					      (byte) 8);
		    if (aBool4997 && !aBool5002
			&& Class181.method2979(i_443_, (byte) -60)
			&& (Class595.aClass595_7840.anInt7852 * 847393323
			    != i_443_)
			&& i_438_ > 0 && class602.anInt7911 * 1216611823 != 0)
			aByteArrayArrayArray4989[i_438_][i_439_][i_440_]
			    |= 0x4;
		} else if (method15943(class185, i_443_, i_442_, bool_455_,
				       class602, i_444_, i_445_, i_438_, i,
				       i_453_, i_452_, i_454_, i_439_, i_440_,
				       bool, class151, i_446_, i_447_,
				       (byte) 75)
			   || method15945(class185, i_443_, i_442_, bool_455_,
					  class602, i_444_, i_445_, i_438_, i,
					  i_453_, i_452_, i_454_, i_439_,
					  i_440_, (short) 29116)) {
		    /* empty */
		}
	    }
	}
    }
    
    boolean method15962(Class185 class185, int i, int i_460_, boolean bool,
			Class602 class602, int i_461_, int i_462_, int i_463_,
			int i_464_, int i_465_, int i_466_, int i_467_,
			int i_468_, int i_469_, boolean bool_470_,
			Class151 class151, int i_471_, int i_472_) {
	if (Class595.aClass595_7851.anInt7852 * 847393323 == i) {
	    int i_473_ = class602.anInt7911 * 1216611823;
	    if (aBool10333 && class602.anInt7911 * 1216611823 == -1)
		i_473_ = 1;
	    Class654_Sub1_Sub1 class654_sub1_sub1;
	    if (bool) {
		Class654_Sub1_Sub1_Sub1 class654_sub1_sub1_sub1
		    = new Class654_Sub1_Sub1_Sub1(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_463_, i_464_,
						  i_465_, i_466_, i_467_,
						  aBool5002, i, i_460_,
						  bool_470_);
		if (class654_sub1_sub1_sub1.method419((byte) 2))
		    class654_sub1_sub1_sub1.method408(class185, (byte) 105);
		class654_sub1_sub1 = class654_sub1_sub1_sub1;
	    } else
		class654_sub1_sub1
		    = new Class654_Sub1_Sub1_Sub2(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_463_, i_464_,
						  i_465_, i_466_, i_467_,
						  aBool5002, i, i_460_, i_461_,
						  i_462_);
	    aClass556_4984.method9376(i_463_, i_468_, i_469_,
				      class654_sub1_sub1, null, 1742655730);
	    if (0 == i_460_) {
		if (aBool4997 && class602.aBool7959) {
		    class151.method2492(i_468_, i_469_, 50);
		    class151.method2492(i_468_, i_469_ + 1, 50);
		}
		if (i_473_ == 1 && !aBool5002)
		    aClass556_4984.aClass552_7427.method9054
			(1, i_463_, i_468_, i_469_,
			 -755959825 * class602.anInt7954,
			 2026375877 * class602.anInt7913);
	    } else if (i_460_ == 1) {
		if (aBool4997 && class602.aBool7959) {
		    class151.method2492(i_468_, 1 + i_469_, 50);
		    class151.method2492(1 + i_468_, i_469_ + 1, 50);
		}
		if (i_473_ == 1 && !aBool5002)
		    aClass556_4984.aClass552_7427.method9054
			(2, i_463_, i_468_, i_469_ + 1,
			 -755959825 * class602.anInt7954,
			 -(2026375877 * class602.anInt7913));
	    } else if (2 == i_460_) {
		if (aBool4997 && class602.aBool7959) {
		    class151.method2492(1 + i_468_, i_469_, 50);
		    class151.method2492(i_468_ + 1, 1 + i_469_, 50);
		}
		if (1 == i_473_ && !aBool5002)
		    aClass556_4984.aClass552_7427.method9054
			(1, i_463_, i_468_ + 1, i_469_,
			 -755959825 * class602.anInt7954,
			 -(2026375877 * class602.anInt7913));
	    } else if (3 == i_460_) {
		if (aBool4997 && class602.aBool7959) {
		    class151.method2492(i_468_, i_469_, 50);
		    class151.method2492(i_468_ + 1, i_469_, 50);
		}
		if (i_473_ == 1 && !aBool5002)
		    aClass556_4984.aClass552_7427.method9054
			(2, i_463_, i_468_, i_469_,
			 -755959825 * class602.anInt7954,
			 2026375877 * class602.anInt7913);
	    }
	    if (-1211724411 * class602.anInt7917 != 64)
		aClass556_4984.method9247(i_463_, i_468_, i_469_,
					  class602.anInt7917 * -1211724411,
					  (byte) 39);
	    return true;
	}
	if (i == 847393323 * Class595.aClass595_7830.anInt7852) {
	    Class654_Sub1_Sub1 class654_sub1_sub1;
	    if (bool) {
		Class654_Sub1_Sub1_Sub1 class654_sub1_sub1_sub1
		    = new Class654_Sub1_Sub1_Sub1(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_463_, i_464_,
						  i_465_, i_466_, i_467_,
						  aBool5002, i, i_460_,
						  bool_470_);
		if (class654_sub1_sub1_sub1.method419((byte) 2))
		    class654_sub1_sub1_sub1.method408(class185, (byte) 45);
		class654_sub1_sub1 = class654_sub1_sub1_sub1;
	    } else
		class654_sub1_sub1
		    = new Class654_Sub1_Sub1_Sub2(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_463_, i_464_,
						  i_465_, i_466_, i_467_,
						  aBool5002, i, i_460_, i_461_,
						  i_462_);
	    aClass556_4984.method9376(i_463_, i_468_, i_469_,
				      class654_sub1_sub1, null, 1558460080);
	    if (class602.aBool7959 && aBool4997) {
		if (0 == i_460_)
		    class151.method2492(i_468_, i_469_ + 1, 50);
		else if (1 == i_460_)
		    class151.method2492(i_468_ + 1, i_469_ + 1, 50);
		else if (2 == i_460_)
		    class151.method2492(1 + i_468_, i_469_, 50);
		else if (i_460_ == 3)
		    class151.method2492(i_468_, i_469_, 50);
	    }
	    return true;
	}
	if (i == Class595.aClass595_7829.anInt7852 * 847393323) {
	    int i_474_ = 1 + i_460_ & 0x3;
	    Class654_Sub1_Sub1 class654_sub1_sub1;
	    Class654_Sub1_Sub1 class654_sub1_sub1_475_;
	    if (bool) {
		Class654_Sub1_Sub1_Sub1 class654_sub1_sub1_sub1
		    = new Class654_Sub1_Sub1_Sub1(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_463_, i_464_,
						  i_465_, i_466_, i_467_,
						  aBool5002, i, 4 + i_460_,
						  bool_470_);
		Class654_Sub1_Sub1_Sub1 class654_sub1_sub1_sub1_476_
		    = new Class654_Sub1_Sub1_Sub1(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_463_, i_464_,
						  i_465_, i_466_, i_467_,
						  aBool5002, i, i_474_,
						  bool_470_);
		if (class654_sub1_sub1_sub1.method419((byte) 2))
		    class654_sub1_sub1_sub1.method408(class185, (byte) 107);
		if (class654_sub1_sub1_sub1_476_.method419((byte) 2))
		    class654_sub1_sub1_sub1_476_.method408(class185,
							   (byte) 116);
		class654_sub1_sub1 = class654_sub1_sub1_sub1;
		class654_sub1_sub1_475_ = class654_sub1_sub1_sub1_476_;
	    } else {
		class654_sub1_sub1
		    = new Class654_Sub1_Sub1_Sub2(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_463_, i_464_,
						  i_465_, i_466_, i_467_,
						  aBool5002, i, 4 + i_460_,
						  i_461_, i_462_);
		class654_sub1_sub1_475_
		    = new Class654_Sub1_Sub1_Sub2(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_463_, i_464_,
						  i_465_, i_466_, i_467_,
						  aBool5002, i, i_474_, i_461_,
						  i_462_);
	    }
	    aClass556_4984.method9376(i_463_, i_468_, i_469_,
				      class654_sub1_sub1,
				      class654_sub1_sub1_475_, -1616962756);
	    if ((1 == class602.anInt7911 * 1216611823
		 || aBool10333 && -1 == 1216611823 * class602.anInt7911)
		&& !aBool5002) {
		if (i_460_ == 0) {
		    aClass556_4984.aClass552_7427.method9054
			(1, i_463_, i_468_, i_469_,
			 class602.anInt7954 * -755959825,
			 class602.anInt7913 * 2026375877);
		    aClass556_4984.aClass552_7427.method9054
			(2, i_463_, i_468_, i_469_ + 1,
			 class602.anInt7954 * -755959825,
			 2026375877 * class602.anInt7913);
		} else if (i_460_ == 1) {
		    aClass556_4984.aClass552_7427.method9054
			(1, i_463_, i_468_ + 1, i_469_,
			 class602.anInt7954 * -755959825,
			 class602.anInt7913 * 2026375877);
		    aClass556_4984.aClass552_7427.method9054
			(2, i_463_, i_468_, 1 + i_469_,
			 -755959825 * class602.anInt7954,
			 class602.anInt7913 * 2026375877);
		} else if (i_460_ == 2) {
		    aClass556_4984.aClass552_7427.method9054
			(1, i_463_, i_468_ + 1, i_469_,
			 -755959825 * class602.anInt7954,
			 class602.anInt7913 * 2026375877);
		    aClass556_4984.aClass552_7427.method9054
			(2, i_463_, i_468_, i_469_,
			 -755959825 * class602.anInt7954,
			 class602.anInt7913 * 2026375877);
		} else if (3 == i_460_) {
		    aClass556_4984.aClass552_7427.method9054
			(1, i_463_, i_468_, i_469_,
			 -755959825 * class602.anInt7954,
			 class602.anInt7913 * 2026375877);
		    aClass556_4984.aClass552_7427.method9054
			(2, i_463_, i_468_, i_469_,
			 -755959825 * class602.anInt7954,
			 class602.anInt7913 * 2026375877);
		}
	    }
	    if (64 != -1211724411 * class602.anInt7917)
		aClass556_4984.method9247(i_463_, i_468_, i_469_,
					  -1211724411 * class602.anInt7917,
					  (byte) 54);
	    return true;
	}
	if (847393323 * Class595.aClass595_7832.anInt7852 == i) {
	    Class654_Sub1_Sub1 class654_sub1_sub1;
	    if (bool) {
		Class654_Sub1_Sub1_Sub1 class654_sub1_sub1_sub1
		    = new Class654_Sub1_Sub1_Sub1(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_463_, i_464_,
						  i_465_, i_466_, i_467_,
						  aBool5002, i, i_460_,
						  bool_470_);
		if (class654_sub1_sub1_sub1.method419((byte) 2))
		    class654_sub1_sub1_sub1.method408(class185, (byte) 57);
		class654_sub1_sub1 = class654_sub1_sub1_sub1;
	    } else
		class654_sub1_sub1
		    = new Class654_Sub1_Sub1_Sub2(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_463_, i_464_,
						  i_465_, i_466_, i_467_,
						  aBool5002, i, i_460_, i_461_,
						  i_462_);
	    aClass556_4984.method9376(i_463_, i_468_, i_469_,
				      class654_sub1_sub1, null, -462882023);
	    if (class602.aBool7959 && aBool4997) {
		if (0 == i_460_)
		    class151.method2492(i_468_, 1 + i_469_, 50);
		else if (i_460_ == 1)
		    class151.method2492(i_468_ + 1, 1 + i_469_, 50);
		else if (2 == i_460_)
		    class151.method2492(1 + i_468_, i_469_, 50);
		else if (i_460_ == 3)
		    class151.method2492(i_468_, i_469_, 50);
	    }
	    return true;
	}
	if (847393323 * Class595.aClass595_7833.anInt7852 == i) {
	    Class654_Sub1_Sub5 class654_sub1_sub5;
	    if (bool) {
		Class654_Sub1_Sub5_Sub2 class654_sub1_sub5_sub2
		    = new Class654_Sub1_Sub5_Sub2(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_463_, i_464_,
						  i_465_, i_466_, i_467_,
						  aBool5002, i_468_, i_468_,
						  i_469_, i_469_, i, i_460_,
						  bool_470_, true);
		if (class654_sub1_sub5_sub2.method419((byte) 2))
		    class654_sub1_sub5_sub2.method408(class185, (byte) 84);
		class654_sub1_sub5 = class654_sub1_sub5_sub2;
	    } else
		class654_sub1_sub5
		    = new Class654_Sub1_Sub5_Sub3(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_463_, i_464_,
						  i_465_, i_466_, i_467_,
						  aBool5002, i_468_,
						  i_468_ + i_471_ - 1, i_469_,
						  i_472_ + i_469_ - 1, i,
						  i_460_, i_461_, i_462_,
						  true);
	    aClass556_4984.method9246(class654_sub1_sub5, false, (byte) 8);
	    if (class602.anInt7911 * 1216611823 == 1 && !aBool5002) {
		int i_477_;
		if ((i_460_ & 0x1) == 0)
		    i_477_ = 8;
		else
		    i_477_ = 16;
		aClass556_4984.aClass552_7427.method9054
		    (i_477_, i_463_, i_468_, i_469_,
		     -755959825 * class602.anInt7954, 0);
	    }
	    if (-1211724411 * class602.anInt7917 != 64)
		aClass556_4984.method9247(i_463_, i_468_, i_469_,
					  class602.anInt7917 * -1211724411,
					  (byte) 117);
	    return true;
	}
	return false;
    }
    
    boolean method15963(Class185 class185, int i, int i_478_, boolean bool,
			Class602 class602, int i_479_, int i_480_, int i_481_,
			int i_482_, int i_483_, int i_484_, int i_485_,
			int i_486_, int i_487_) {
	if (i == 847393323 * Class595.aClass595_7834.anInt7852) {
	    Class654_Sub1_Sub3 class654_sub1_sub3;
	    if (bool) {
		Class654_Sub1_Sub3_Sub1 class654_sub1_sub3_sub1
		    = new Class654_Sub1_Sub3_Sub1(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_481_, i_482_,
						  i_483_, i_484_, i_485_,
						  aBool5002, 0, 0, i, i_478_);
		if (class654_sub1_sub3_sub1.method419((byte) 2))
		    class654_sub1_sub3_sub1.method408(class185, (byte) 119);
		class654_sub1_sub3 = class654_sub1_sub3_sub1;
	    } else
		class654_sub1_sub3
		    = new Class654_Sub1_Sub3_Sub2(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_481_, i_482_,
						  i_483_, i_484_, i_485_,
						  aBool5002, 0, 0, i, i_478_,
						  i_479_, i_480_);
	    aClass556_4984.method9245(i_481_, i_486_, i_487_,
				      class654_sub1_sub3, null, 1604666399);
	    return true;
	}
	if (i == 847393323 * Class595.aClass595_7835.anInt7852) {
	    int i_488_ = 65;
	    Interface62 interface62
		= (Interface62) aClass556_4984.method9258(i_481_, i_486_,
							  i_487_, (byte) 58);
	    if (interface62 != null)
		i_488_
		    = (((Class602)
			aClass44_Sub13_10338.method91(interface62
							  .method56(142419017),
						      504853458)).anInt7917
		       * -1211724411) + 1;
	    Class654_Sub1_Sub3 class654_sub1_sub3;
	    if (bool) {
		Class654_Sub1_Sub3_Sub1 class654_sub1_sub3_sub1
		    = (new Class654_Sub1_Sub3_Sub1
		       (aClass556_4984, class185, aClass44_Sub13_10338,
			class602, i_481_, i_482_, i_483_, i_484_, i_485_,
			aBool5002, anIntArray10339[i_478_] * i_488_,
			anIntArray10340[i_478_] * i_488_, i, i_478_));
		if (class654_sub1_sub3_sub1.method419((byte) 2))
		    class654_sub1_sub3_sub1.method408(class185, (byte) 29);
		class654_sub1_sub3 = class654_sub1_sub3_sub1;
	    } else
		class654_sub1_sub3
		    = (new Class654_Sub1_Sub3_Sub2
		       (aClass556_4984, class185, aClass44_Sub13_10338,
			class602, i_481_, i_482_, i_483_, i_484_, i_485_,
			aBool5002, anIntArray10339[i_478_] * i_488_,
			i_488_ * anIntArray10340[i_478_], i, i_478_, i_479_,
			i_480_));
	    aClass556_4984.method9245(i_481_, i_486_, i_487_,
				      class654_sub1_sub3, null, 1604666399);
	    return true;
	}
	if (i == Class595.aClass595_7845.anInt7852 * 847393323) {
	    int i_489_ = 33;
	    Interface62 interface62
		= (Interface62) aClass556_4984.method9258(i_481_, i_486_,
							  i_487_, (byte) -46);
	    if (interface62 != null)
		i_489_ = (((Class602) (aClass44_Sub13_10338.method91
				       (interface62.method56(-1060933560),
					446021666))).anInt7917
			  * -1211724411 / 2) + 1;
	    Class654_Sub1_Sub3 class654_sub1_sub3;
	    if (bool) {
		Class654_Sub1_Sub3_Sub1 class654_sub1_sub3_sub1
		    = (new Class654_Sub1_Sub3_Sub1
		       (aClass556_4984, class185, aClass44_Sub13_10338,
			class602, i_481_, i_482_, i_483_, i_484_, i_485_,
			aBool5002, anIntArray10339[i_478_] * i_489_,
			anIntArray10340[i_478_] * i_489_, i, i_478_ + 4));
		if (class654_sub1_sub3_sub1.method419((byte) 2))
		    class654_sub1_sub3_sub1.method408(class185, (byte) 63);
		class654_sub1_sub3 = class654_sub1_sub3_sub1;
	    } else
		class654_sub1_sub3
		    = (new Class654_Sub1_Sub3_Sub2
		       (aClass556_4984, class185, aClass44_Sub13_10338,
			class602, i_481_, i_482_, i_483_, i_484_, i_485_,
			aBool5002, anIntArray10334[i_478_] * i_489_,
			anIntArray10343[i_478_] * i_489_, i, i_478_ + 4,
			i_479_, i_480_));
	    aClass556_4984.method9245(i_481_, i_486_, i_487_,
				      class654_sub1_sub3, null, 1604666399);
	    return true;
	}
	if (i == 847393323 * Class595.aClass595_7837.anInt7852) {
	    int i_490_ = 2 + i_478_ & 0x3;
	    Class654_Sub1_Sub3 class654_sub1_sub3;
	    if (bool) {
		Class654_Sub1_Sub3_Sub1 class654_sub1_sub3_sub1
		    = new Class654_Sub1_Sub3_Sub1(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_481_, i_482_,
						  i_483_, i_484_, i_485_,
						  aBool5002, 0, 0, i,
						  i_490_ + 4);
		if (class654_sub1_sub3_sub1.method419((byte) 2))
		    class654_sub1_sub3_sub1.method408(class185, (byte) 108);
		class654_sub1_sub3 = class654_sub1_sub3_sub1;
	    } else
		class654_sub1_sub3
		    = new Class654_Sub1_Sub3_Sub2(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_481_, i_482_,
						  i_483_, i_484_, i_485_,
						  aBool5002, 0, 0, i,
						  4 + i_490_, i_479_, i_480_);
	    aClass556_4984.method9245(i_481_, i_486_, i_487_,
				      class654_sub1_sub3, null, 1604666399);
	    return true;
	}
	if (i == 847393323 * Class595.aClass595_7838.anInt7852) {
	    int i_491_ = i_478_ + 2 & 0x3;
	    int i_492_ = 33;
	    Interface62 interface62
		= (Interface62) aClass556_4984.method9258(i_481_, i_486_,
							  i_487_, (byte) -80);
	    if (interface62 != null)
		i_492_
		    = (((Class602)
			aClass44_Sub13_10338.method91(interface62
							  .method56(883625786),
						      -910563523)).anInt7917
		       * -1211724411 / 2) + 1;
	    Class654_Sub1_Sub3 class654_sub1_sub3;
	    Class654_Sub1_Sub3 class654_sub1_sub3_493_;
	    if (bool) {
		Class654_Sub1_Sub3_Sub1 class654_sub1_sub3_sub1
		    = (new Class654_Sub1_Sub3_Sub1
		       (aClass556_4984, class185, aClass44_Sub13_10338,
			class602, i_481_, i_482_, i_483_, i_484_, i_485_,
			aBool5002, i_492_ * anIntArray10334[i_478_],
			i_492_ * anIntArray10343[i_478_], i, 4 + i_478_));
		Class654_Sub1_Sub3_Sub1 class654_sub1_sub3_sub1_494_
		    = new Class654_Sub1_Sub3_Sub1(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_481_, i_482_,
						  i_483_, i_484_, i_485_,
						  aBool5002, 0, 0, i,
						  4 + i_491_);
		if (class654_sub1_sub3_sub1.method419((byte) 2))
		    class654_sub1_sub3_sub1.method408(class185, (byte) 5);
		if (class654_sub1_sub3_sub1_494_.method419((byte) 2))
		    class654_sub1_sub3_sub1_494_.method408(class185,
							   (byte) 40);
		class654_sub1_sub3 = class654_sub1_sub3_sub1;
		class654_sub1_sub3_493_ = class654_sub1_sub3_sub1_494_;
	    } else {
		Class654_Sub1_Sub3_Sub2 class654_sub1_sub3_sub2
		    = (new Class654_Sub1_Sub3_Sub2
		       (aClass556_4984, class185, aClass44_Sub13_10338,
			class602, i_481_, i_482_, i_483_, i_484_, i_485_,
			aBool5002, anIntArray10334[i_478_] * i_492_,
			anIntArray10343[i_478_] * i_492_, i, 4 + i_478_,
			i_479_, i_480_));
		Class654_Sub1_Sub3_Sub2 class654_sub1_sub3_sub2_495_
		    = new Class654_Sub1_Sub3_Sub2(aClass556_4984, class185,
						  aClass44_Sub13_10338,
						  class602, i_481_, i_482_,
						  i_483_, i_484_, i_485_,
						  aBool5002, 0, 0, i,
						  4 + i_491_, i_479_, i_480_);
		class654_sub1_sub3 = class654_sub1_sub3_sub2;
		class654_sub1_sub3_493_ = class654_sub1_sub3_sub2_495_;
	    }
	    aClass556_4984.method9245(i_481_, i_486_, i_487_,
				      class654_sub1_sub3,
				      class654_sub1_sub3_493_, 1604666399);
	    return true;
	}
	return false;
    }
    
    public final void method15964(Class185 class185, byte[] is, int i,
				  int i_496_) {
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	int i_497_ = -1;
	for (;;) {
	    int i_498_ = class534_sub40.method16598((byte) 8);
	    if (0 == i_498_)
		break;
	    i_497_ += i_498_;
	    int i_499_ = 0;
	    for (;;) {
		int i_500_ = class534_sub40.method16546(-1706829710);
		if (0 == i_500_)
		    break;
		i_499_ += i_500_ - 1;
		int i_501_ = i_499_ & 0x3f;
		int i_502_ = i_499_ >> 6 & 0x3f;
		int i_503_ = i_499_ >> 12;
		int i_504_ = class534_sub40.method16527(-1017221910);
		int i_505_ = i_504_ >> 2;
		int i_506_ = i_504_ & 0x3;
		int i_507_ = i + i_502_;
		int i_508_ = i_501_ + i_496_;
		Class602 class602
		    = ((Class602)
		       aClass44_Sub13_10338.method91(i_497_, -2117952936));
		int i_509_;
		int i_510_;
		if ((i_506_ & 0x1) == 0) {
		    i_509_ = class602.anInt7904 * -1082258489;
		    i_510_ = -1990374967 * class602.anInt7928;
		} else {
		    i_509_ = class602.anInt7928 * -1990374967;
		    i_510_ = -1082258489 * class602.anInt7904;
		}
		int i_511_ = i_507_ + i_509_;
		int i_512_ = i_510_ + i_508_;
		if (i_507_ < anInt4992 * -60640777
		    && i_508_ < -1584311401 * anInt5051 && i_511_ > 0
		    && i_512_ > 0
		    && (847393323 * Class595.aClass595_7836.anInt7852 == i_505_
			|| (i_505_
			    == 847393323 * Class595.aClass595_7850.anInt7852)
			|| (i_507_ > 0 && i_508_ > 0
			    && i_507_ < anInt4992 * -60640777 - 1
			    && i_508_ < anInt5051 * -1584311401 - 1)))
		    method15942(class185, i_503_, i_503_, i_507_, i_508_,
				i_497_, i_506_, i_505_, -1, 0, 466927448);
	    }
	}
    }
    
    Interface62 method15965(int i, int i_513_, int i_514_, int i_515_) {
	Interface62 interface62 = null;
	if (0 == i_513_)
	    interface62
		= (Interface62) aClass556_4984.method9258(i, i_514_, i_515_,
							  (byte) -105);
	if (1 == i_513_)
	    interface62
		= (Interface62) aClass556_4984.method9357(i, i_514_, i_515_,
							  (byte) 78);
	if (2 == i_513_)
	    interface62
		= ((Interface62)
		   aClass556_4984.method9262(i, i_514_, i_515_,
					     client.anInterface64_11333,
					     (byte) -22));
	if (i_513_ == 3)
	    interface62
		= (Interface62) aClass556_4984.method9264(i, i_514_, i_515_,
							  (byte) 35);
	return interface62;
    }
    
    static final boolean method15966(Class44_Sub13 class44_sub13, int i,
				     int i_516_) {
	Class602 class602 = (Class602) class44_sub13.method91(i, -1043308153);
	if (i_516_ == 11)
	    i_516_ = 10;
	if (i_516_ >= 5 && i_516_ <= 8)
	    i_516_ = 4;
	return class602.method10000(i_516_, (byte) 82);
    }
    
    Interface62 method15967(int i, int i_517_, int i_518_, int i_519_) {
	Interface62 interface62 = null;
	if (0 == i_517_)
	    interface62
		= (Interface62) aClass556_4984.method9258(i, i_518_, i_519_,
							  (byte) -25);
	if (1 == i_517_)
	    interface62
		= (Interface62) aClass556_4984.method9357(i, i_518_, i_519_,
							  (byte) -7);
	if (2 == i_517_)
	    interface62
		= ((Interface62)
		   aClass556_4984.method9262(i, i_518_, i_519_,
					     client.anInterface64_11333,
					     (byte) 87));
	if (i_517_ == 3)
	    interface62
		= (Interface62) aClass556_4984.method9264(i, i_518_, i_519_,
							  (byte) 4);
	return interface62;
    }
    
    void method15968(Class185 class185, int i, int i_520_, int i_521_,
		     int i_522_, int i_523_) {
	Interface62 interface62
	    = method15946(i, i_520_, i_521_, i_522_, (byte) -2);
	if (null != interface62) {
	    Class602 class602
		= ((Class602)
		   aClass44_Sub13_10338
		       .method91(interface62.method56(322477930), 22511063));
	    int i_524_ = interface62.method409(-2020296767);
	    int i_525_ = interface62.method410(-945913650);
	    if (class602.method9983((short) -32615))
		Class605.method10037(i, i_521_, i_522_, class602, (byte) 81);
	    if (interface62.method419((byte) 2))
		interface62.method414(class185, 1500645294);
	    if (0 == i_520_) {
		aClass556_4984.method9252(i, i_521_, i_522_, (byte) 35);
		aClass556_4984.method9225(i, i_521_, i_522_, -1454836065);
		if (1 == class602.anInt7911 * 1216611823) {
		    if (0 == i_525_)
			aClass556_4984.aClass552_7427.method9070(1, i, i_521_,
								 i_522_);
		    else if (i_525_ == 1)
			aClass556_4984.aClass552_7427.method9070(2, i, i_521_,
								 1 + i_522_);
		    else if (2 == i_525_)
			aClass556_4984.aClass552_7427
			    .method9070(1, i, 1 + i_521_, i_522_);
		    else if (3 == i_525_)
			aClass556_4984.aClass552_7427.method9070(2, i, i_521_,
								 i_522_);
		}
	    } else if (i_520_ == 1) {
		aClass556_4984.method9387(i, i_521_, i_522_, 1534154791);
		aClass556_4984.method9281(i, i_521_, i_522_, -1274414774);
	    } else if (i_520_ == 2) {
		aClass556_4984.method9255(i, i_521_, i_522_,
					  client.anInterface64_11333,
					  (byte) 51);
		if (i_524_ == Class595.aClass595_7833.anInt7852 * 847393323) {
		    if (0 == (i_525_ & 0x1))
			aClass556_4984.aClass552_7427.method9070(8, i, i_521_,
								 i_522_);
		    else
			aClass556_4984.aClass552_7427.method9070(16, i, i_521_,
								 i_522_);
		}
	    } else if (3 == i_520_)
		aClass556_4984.method9253(i, i_521_, i_522_, (byte) 34);
	}
    }
    
    Interface62 method15969(int i, int i_526_, int i_527_, int i_528_) {
	Interface62 interface62 = null;
	if (0 == i_526_)
	    interface62
		= (Interface62) aClass556_4984.method9258(i, i_527_, i_528_,
							  (byte) -83);
	if (1 == i_526_)
	    interface62
		= (Interface62) aClass556_4984.method9357(i, i_527_, i_528_,
							  (byte) 69);
	if (2 == i_526_)
	    interface62
		= ((Interface62)
		   aClass556_4984.method9262(i, i_527_, i_528_,
					     client.anInterface64_11333,
					     (byte) 47));
	if (i_526_ == 3)
	    interface62
		= (Interface62) aClass556_4984.method9264(i, i_527_, i_528_,
							  (byte) 110);
	return interface62;
    }
    
    public final void method15970(Class185 class185, boolean bool) {
	aClass556_4984.method9301();
	if (!bool) {
	    if (-692901467 * anInt4991 > 1) {
		for (int i = 0; i < -60640777 * anInt4992; i++) {
		    for (int i_529_ = 0; i_529_ < -1584311401 * anInt5051;
			 i_529_++) {
			if (2 == ((aClass468_4983.aByteArrayArrayArray5145[1]
				   [i][i_529_])
				  & 0x2))
			    aClass556_4984.method9230(i, i_529_,
						      (short) -19959);
		    }
		}
	    }
	    for (int i = 0; i < -692901467 * anInt4991; i++) {
		for (int i_530_ = 0; i_530_ <= anInt5051 * -1584311401;
		     i_530_++) {
		    for (int i_531_ = 0; i_531_ <= -60640777 * anInt4992;
			 i_531_++) {
			if (0 != (aByteArrayArrayArray4989[i][i_531_][i_530_]
				  & 0x4)) {
			    int i_532_ = i_531_;
			    int i_533_ = i_531_;
			    int i_534_ = i_530_;
			    int i_535_;
			    for (i_535_ = i_530_;
				 (i_534_ > 0
				  && ((aByteArrayArrayArray4989[i][i_531_]
				       [i_534_ - 1])
				      & 0x4) != 0
				  && i_535_ - i_534_ < 10);
				 i_534_--) {
				/* empty */
			    }
			    for (/**/; (i_535_ < anInt5051 * -1584311401
					&& ((aByteArrayArrayArray4989[i]
					     [i_531_][i_535_ + 1])
					    & 0x4) != 0
					&& i_535_ - i_534_ < 10); i_535_++) {
				/* empty */
			    }
			while_158_:
			    for (/**/; i_532_ > 0 && i_533_ - i_532_ < 10;
				 i_532_--) {
				for (int i_536_ = i_534_; i_536_ <= i_535_;
				     i_536_++) {
				    if (0 == ((aByteArrayArrayArray4989[i]
					       [i_532_ - 1][i_536_])
					      & 0x4))
					break while_158_;
				}
			    }
			while_159_:
			    for (/**/; (i_533_ < anInt4992 * -60640777
					&& i_533_ - i_532_ < 10); i_533_++) {
				for (int i_537_ = i_534_; i_537_ <= i_535_;
				     i_537_++) {
				    if (0 == ((aByteArrayArrayArray4989[i]
					       [1 + i_533_][i_537_])
					      & 0x4))
					break while_159_;
				}
			    }
			    if ((1 + (i_533_ - i_532_)) * (i_535_ - i_534_ + 1)
				>= 4) {
				int i_538_ = (anIntArrayArrayArray4995[i]
					      [i_532_][i_534_]);
				aClass556_4984.aClass552_7427.method9055
				    (4, i, i_532_ << 9, 512 + (i_533_ << 9),
				     i_534_ << 9, (i_535_ << 9) + 512, i_538_,
				     i_538_);
				for (int i_539_ = i_532_; i_539_ <= i_533_;
				     i_539_++) {
				    for (int i_540_ = i_534_; i_540_ <= i_535_;
					 i_540_++)
					aByteArrayArrayArray4989[i][i_539_]
					    [i_540_]
					    &= ~0x4;
				}
			    }
			}
		    }
		}
	    }
	    aClass556_4984.aClass552_7427.method9090();
	}
	aByteArrayArrayArray4989 = null;
    }
    
    static int method15971(int i, int i_541_, short i_542_) {
	if (Class595.aClass595_7830.anInt7852 * 847393323 == i
	    || Class595.aClass595_7832.anInt7852 * 847393323 == i)
	    return Class654_Sub1_Sub1_Sub1.anIntArray11993[i_541_ & 0x3];
	return Class654_Sub1_Sub1_Sub1.anIntArray11998[i_541_ & 0x3];
    }
}
