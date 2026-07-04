/* Class505 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class505
{
    boolean aBool5634;
    int anInt5635;
    Class516[] aClass516Array5636;
    Class516 aClass516_5637;
    Class516[] aClass516Array5638;
    int anInt5639;
    int anInt5640;
    int anInt5641 = -1387230763;
    int anInt5642;
    int anInt5643;
    int anInt5644;
    Class163 aClass163_5645;
    Class571 aClass571_5646;
    int anInt5647;
    int anInt5648;
    static final int anInt5649 = 512;
    int anInt5650;
    Class183 aClass183_5651;
    byte[] aByteArray5652;
    int anInt5653;
    Class505 aClass505_5654;
    int anInt5655;
    int anInt5656;
    boolean aBool5657 = true;
    
    public void method8328(int i, int i_0_, int i_1_) {
	if (aBool5634) {
	    /* empty */
	}
	anInt5655 = -960679713 * (anInt5640 * 7518119
				  + (i_0_ - 7518119 * anInt5640) * i / 255);
    }
    
    public void method8329(Class185 class185, int i, int i_2_, int i_3_,
			   int i_4_, int i_5_, int i_6_, int i_7_, int i_8_,
			   int i_9_, boolean bool, boolean bool_10_) {
	int i_11_ = 0;
	if (aBool5634)
	    i_11_ = anInt5655 * -1775072481;
	if (null != aClass505_5654) {
	    Class505 class505_12_ = this;
	    Class505 class505_13_ = aClass505_5654;
	    if (class505_12_.hashCode() > class505_13_.hashCode()) {
		class505_12_ = aClass505_5654;
		class505_13_ = this;
		i_11_ = 255 - i_11_;
	    }
	    class505_12_.method8337(class185, i, i_2_, i_3_, i_4_, i_5_, i_6_,
				    i_7_, i_8_, i_9_, bool, bool_10_, i_11_,
				    (byte) 1);
	    class505_13_.method8337(class185, i, i_2_, i_3_, i_4_, i_5_, i_6_,
				    i_7_, i_8_, i_9_, false, bool_10_,
				    255 - i_11_, (byte) -46);
	} else {
	    if (-1 == anInt5635 * 1098175913)
		class185.method3298(i_2_, i_3_, i_4_, i_5_, ~0xffffff | i_9_,
				    0);
	    method8337(class185, i, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_,
		       i_9_, bool, bool_10_, i_11_, (byte) 59);
	}
    }
    
    public void method8330(Class505 class505_14_, int i) {
	if (aBool5634)
	    anInt5640 = anInt5655 * -1251475511;
	else if (class505_14_ != null && class505_14_.aBool5634)
	    anInt5640 = 529372905 - -1251475511 * class505_14_.anInt5655;
	else
	    anInt5640 = 0;
	aBool5634 = true;
	aClass505_5654 = class505_14_;
	anInt5655 = 0;
    }
    
    public void method8331(int i) {
	aBool5634 = false;
	aClass505_5654 = null;
	anInt5655 = 0;
    }
    
    public boolean method8332(int i) {
	return aBool5634;
    }
    
    public Class505 method8333(int i) {
	return aClass505_5654;
    }
    
    public boolean method8334() {
	return aBool5634;
    }
    
    void method8335(Class185 class185, int i) {
	try {
	    boolean bool
		= Class459.aClass472_4980.method7681(178524317 * anInt5650,
						     -1701164154);
	    if (bool) {
		class185.method3341(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
		Class187 class187
		    = Class187.method3709(Class459.aClass472_4980,
					  anInt5650 * 178524317, 0);
		aClass183_5651
		    = class185.method3329(class187, 1099776, 0, 255, 1);
		byte[] is = aClass183_5651.method3055();
		if (is == null)
		    aByteArray5652 = null;
		else {
		    aByteArray5652 = new byte[is.length];
		    System.arraycopy(is, 0, aByteArray5652, 0, is.length);
		}
	    }
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public Class505(int i, Class516[] class516s, int i_15_, int i_16_,
		    int i_17_, int i_18_, Class571 class571, int i_19_) {
	anInt5647 = 1465472219 * i_16_;
	anInt5643 = -1314354199 * i_17_;
	anInt5644 = i_18_ * -1811066385;
	anInt5635 = 262053529 * i;
	aClass516Array5638 = class516s;
	aClass571_5646 = class571;
	if (null != class516s) {
	    aClass516Array5636 = new Class516[class516s.length];
	    aClass516_5637 = i_15_ >= 0 ? class516s[i_15_] : null;
	} else {
	    aClass516Array5636 = null;
	    aClass516_5637 = null;
	}
	anInt5650 = i_19_ * 1650652597;
    }
    
    public void method8336(Class185 class185, int i, int i_20_, int i_21_,
			   int i_22_, int i_23_, int i_24_, int i_25_,
			   int i_26_, int i_27_, boolean bool,
			   boolean bool_28_, int i_29_) {
	int i_30_ = 0;
	if (aBool5634)
	    i_30_ = anInt5655 * -1775072481;
	if (null != aClass505_5654) {
	    Class505 class505_31_ = this;
	    Class505 class505_32_ = aClass505_5654;
	    if (class505_31_.hashCode() > class505_32_.hashCode()) {
		class505_31_ = aClass505_5654;
		class505_32_ = this;
		i_30_ = 255 - i_30_;
	    }
	    class505_31_.method8337(class185, i, i_20_, i_21_, i_22_, i_23_,
				    i_24_, i_25_, i_26_, i_27_, bool, bool_28_,
				    i_30_, (byte) -17);
	    class505_32_.method8337(class185, i, i_20_, i_21_, i_22_, i_23_,
				    i_24_, i_25_, i_26_, i_27_, false,
				    bool_28_, 255 - i_30_, (byte) 84);
	} else {
	    if (-1 == anInt5635 * 1098175913)
		class185.method3298(i_20_, i_21_, i_22_, i_23_,
				    ~0xffffff | i_27_, 0);
	    method8337(class185, i, i_20_, i_21_, i_22_, i_23_, i_24_, i_25_,
		       i_26_, i_27_, bool, bool_28_, i_30_, (byte) -6);
	}
    }
    
    void method8337(Class185 class185, int i, int i_33_, int i_34_, int i_35_,
		    int i_36_, int i_37_, int i_38_, int i_39_, int i_40_,
		    boolean bool, boolean bool_41_, int i_42_, byte i_43_) {
	int i_44_ = 255 - i_42_;
	class185.method3581();
	class185.method3559();
	if (aClass183_5651 == null) {
	    class185.method3340(2, 0);
	    i_38_ = i_38_ + i & 0x3fff;
	    if (-1 != anInt5635 * 1098175913 && 0 != anInt5642 * 1510190127) {
		Class186 class186
		    = Class154.aClass177_1741
			  .method2931(1098175913 * anInt5635, (byte) 1);
		if (aClass163_5645 == null
		    && (Class304.anInterface25_3263.method155
			(Class598.aClass598_7865,
			 class186.anInt2042 * 1604666399,
			 (class186.aClass599_2064 == Class599.aClass599_7870
			  ? Class613.aClass613_8023 : Class613.aClass613_8022),
			 0.7F, anInt5642 * 1510190127, anInt5642 * 1510190127,
			 false, -618218007))) {
		    int[] is
			= (Class599.aClass599_7870 == class186.aClass599_2064
			   ? (Class304.anInterface25_3263.method150
			      (Class598.aClass598_7865,
			       class186.anInt2042 * 1604666399, 0.7F,
			       1510190127 * anInt5642, anInt5642 * 1510190127,
			       false, -546259397))
			   : (Class304.anInterface25_3263.method149
			      (Class598.aClass598_7865,
			       class186.anInt2042 * 1604666399, 0.7F,
			       1510190127 * anInt5642, 1510190127 * anInt5642,
			       false, -935925724)));
		    anInt5639 = -1276147587 * is[0];
		    anInt5648 = -148946821 * is[is.length - 1];
		    aClass163_5645
			= class185.method3317(is, 0,
					      1264459495 * class186.anInt2046,
					      1264459495 * class186.anInt2046,
					      class186.anInt2046 * 1264459495,
					      (byte) 8);
		}
		int i_45_
		    = (255 == i_44_
		       ? (Class599.aClass599_7870 == class186.aClass599_2064
			  ? 1 : 0)
		       : 1);
		if (i_45_ == 1 && bool)
		    class185.method3298(i_33_, i_34_, i_35_, i_36_, i_40_, 0);
		if (null != aClass163_5645) {
		    int i_46_ = i_36_ * i_37_ / -4096;
		    int i_47_;
		    for (i_47_ = (i_35_ - i_36_) / 2 + i_36_ * i_38_ / 4096;
			 i_47_ > i_36_; i_47_ -= i_36_) {
			/* empty */
		    }
		    for (/**/; i_47_ < 0; i_47_ += i_36_) {
			/* empty */
		    }
		    if (aClass571_5646 == Class571.aClass571_7664) {
			for (int i_48_ = i_47_ - i_36_; i_48_ < i_35_;
			     i_48_ += i_36_)
			    aClass163_5645.method2660(i_33_ + i_48_,
						      i_34_ + i_46_, i_36_,
						      i_36_, 0,
						      i_44_ << 24 | 0xffffff,
						      i_45_);
			if ((anInt5639 * 927740117 & ~0xffffff) != 0)
			    class185.method3292(0, 0, i_35_,
						1 + (i_46_ + i_34_),
						927740117 * anInt5639,
						-1742619256);
			if ((468623027 * anInt5648 & ~0xffffff) != 0)
			    class185.method3292(0, i_36_ + (i_46_ + i_34_),
						i_35_,
						i_36_ - (i_36_
							 + (i_46_ + i_34_)),
						anInt5648 * 468623027,
						-1704020269);
		    } else {
			for (/**/; i_46_ > i_36_; i_46_ -= i_36_) {
			    /* empty */
			}
			for (/**/; i_46_ < 0; i_46_ += i_36_) {
			    /* empty */
			}
			for (int i_49_ = i_47_ - i_36_; i_49_ < i_35_;
			     i_49_ += i_36_) {
			    for (int i_50_ = i_46_ - i_36_; i_50_ < i_36_;
				 i_50_ += i_36_)
				aClass163_5645.method2660(i_49_ + i_33_,
							  i_50_ + i_34_, i_36_,
							  i_36_, 0,
							  (i_44_ << 24
							   | 0xffffff),
							  i_45_);
			}
		    }
		}
	    } else
		class185.method3298(i_33_, i_34_, i_35_, i_36_,
				    i_44_ << 24 | i_40_, bool ? 0 : 1);
	} else if (bool_41_) {
	    Class433 class433 = class185.method3339();
	    Class433 class433_51_ = class185.method3339();
	    class433.aFloatArray4853[2] = class433.aFloatArray4853[3];
	    class433.aFloatArray4853[6] = class433.aFloatArray4853[7];
	    class433.aFloatArray4853[10] = class433.aFloatArray4853[11];
	    class433.aFloatArray4853[14] = class433.aFloatArray4853[15];
	    class185.method3338(class433);
	    method8342(class185, i_37_, i_38_, i_39_, i_42_, (byte) 109);
	    class185.method3338(class433_51_);
	} else {
	    if (bool)
		class185.method3340(3, i_40_);
	    method8342(class185, i_37_, i_38_, i_39_, i_42_, (byte) 95);
	}
	for (int i_52_ = anInt5656 * -446272903 - 1; i_52_ >= 0; i_52_--)
	    aClass516Array5636[i_52_].method8606(class185, i_33_, i_34_, i_35_,
						 i_36_, i_37_, i_38_,
						 1946060627 * anInt5647,
						 108985433 * anInt5643,
						 -1380844273 * anInt5644,
						 i_44_);
	class185.method3340(2, 0);
	class185.method3446();
    }
    
    public Class505 method8338() {
	return aClass505_5654;
    }
    
    public static void method8339(Class472 class472, Class177 class177,
				  Interface25 interface25) {
	Class459.aClass472_4980 = class472;
	Class154.aClass177_1741 = class177;
	Class304.anInterface25_3263 = interface25;
    }
    
    public static void method8340() {
	Class516.method8592();
    }
    
    public void method8341() {
	aBool5634 = false;
	aClass505_5654 = null;
	anInt5655 = 0;
    }
    
    void method8342(Class185 class185, int i, int i_53_, int i_54_, int i_55_,
		    byte i_56_) {
	Class446 class446 = class185.method3532();
	Class446 class446_57_ = new Class446();
	class446_57_.method7250(0.0F, 0.0F, 0.0F);
	class446_57_.method7245(0.0F, -1.0F, 0.0F,
				Class427.method6799(-i_53_ & 0x3fff));
	class446_57_.method7245(-1.0F, 0.0F, 0.0F,
				Class427.method6799(-i & 0x3fff));
	class446_57_.method7245(0.0F, 0.0F, -1.0F,
				Class427.method6799(-i_54_ & 0x3fff));
	class185.method3335(class446_57_);
	Class446 class446_58_ = new Class446();
	if (i_55_ != -120566155 * anInt5653) {
	    aClass183_5651.method3088((byte) i_55_, aByteArray5652);
	    anInt5653 = i_55_ * -1723035171;
	}
	aClass183_5651.method3034(class446_58_, null, 0);
	class185.method3335(class446);
    }
    
    public boolean method8343() {
	return aBool5634;
    }
    
    public boolean method8344(Class185 class185, int i, int i_59_) {
	if (i != 1151834243 * anInt5641) {
	    anInt5641 = 1387230763 * i;
	    int i_60_ = Class455.method7422(i, -574677875);
	    if (i_60_ > 512)
		i_60_ = 512;
	    if (i_60_ <= 0)
		i_60_ = 1;
	    if (i_60_ != 1510190127 * anInt5642) {
		anInt5642 = i_60_ * 1734679247;
		aClass163_5645 = null;
	    }
	    if (null != aClass516Array5638) {
		anInt5656 = 0;
		int[] is = new int[aClass516Array5638.length];
		for (int i_61_ = 0; i_61_ < aClass516Array5638.length;
		     i_61_++) {
		    Class516 class516 = aClass516Array5638[i_61_];
		    if (class516.method8611(anInt5647 * 1946060627,
					    108985433 * anInt5643,
					    -1380844273 * anInt5644,
					    1151834243 * anInt5641)) {
			is[anInt5656 * -446272903] = class516.anInt7028;
			aClass516Array5636
			    [(anInt5656 += 886038473) * -446272903 - 1]
			    = class516;
		    }
		}
		Class160.method2617(is, aClass516Array5636, 0,
				    -446272903 * anInt5656 - 1, -1147192821);
	    }
	    aBool5657 = true;
	}
	boolean bool = false;
	if (aBool5657) {
	    aBool5657 = false;
	    for (int i_62_ = anInt5656 * -446272903 - 1; i_62_ >= 0; i_62_--) {
		boolean bool_63_
		    = aClass516Array5636[i_62_].method8593(class185,
							   aClass516_5637);
		Class505 class505_64_ = this;
		class505_64_.aBool5657 = class505_64_.aBool5657 | !bool_63_;
		bool |= bool_63_;
	    }
	}
	if (i_59_ == 0 || !class185.method3404())
	    aClass183_5651 = null;
	else if (null == aClass183_5651 && anInt5650 * 178524317 >= 0)
	    method8335(class185, 2097355292);
	if (aClass505_5654 != null && this != aClass505_5654) {
	    aClass505_5654.method8331(-1977547019);
	    bool |= aClass505_5654.method8353(class185, i, i_59_, 783140565);
	}
	return bool;
    }
    
    public boolean method8345() {
	return aBool5634;
    }
    
    public Class505 method8346() {
	return aClass505_5654;
    }
    
    public void method8347(Class185 class185, int i, int i_65_, int i_66_,
			   int i_67_, int i_68_, int i_69_, int i_70_,
			   int i_71_, int i_72_, int i_73_) {
	method8336(class185, i, i_65_, i_66_, i_67_, i_68_, i_69_, i_70_, 0,
		   i_72_, true, false, -1263240333);
    }
    
    public boolean method8348(Class185 class185, int i, int i_74_) {
	if (i != 1151834243 * anInt5641) {
	    anInt5641 = 1387230763 * i;
	    int i_75_ = Class455.method7422(i, -858183159);
	    if (i_75_ > 512)
		i_75_ = 512;
	    if (i_75_ <= 0)
		i_75_ = 1;
	    if (i_75_ != 1510190127 * anInt5642) {
		anInt5642 = i_75_ * 1734679247;
		aClass163_5645 = null;
	    }
	    if (null != aClass516Array5638) {
		anInt5656 = 0;
		int[] is = new int[aClass516Array5638.length];
		for (int i_76_ = 0; i_76_ < aClass516Array5638.length;
		     i_76_++) {
		    Class516 class516 = aClass516Array5638[i_76_];
		    if (class516.method8611(anInt5647 * 1946060627,
					    108985433 * anInt5643,
					    -1380844273 * anInt5644,
					    1151834243 * anInt5641)) {
			is[anInt5656 * -446272903] = class516.anInt7028;
			aClass516Array5636
			    [(anInt5656 += 886038473) * -446272903 - 1]
			    = class516;
		    }
		}
		Class160.method2617(is, aClass516Array5636, 0,
				    -446272903 * anInt5656 - 1, -1101719945);
	    }
	    aBool5657 = true;
	}
	boolean bool = false;
	if (aBool5657) {
	    aBool5657 = false;
	    for (int i_77_ = anInt5656 * -446272903 - 1; i_77_ >= 0; i_77_--) {
		boolean bool_78_
		    = aClass516Array5636[i_77_].method8593(class185,
							   aClass516_5637);
		Class505 class505_79_ = this;
		class505_79_.aBool5657 = class505_79_.aBool5657 | !bool_78_;
		bool |= bool_78_;
	    }
	}
	if (i_74_ == 0 || !class185.method3404())
	    aClass183_5651 = null;
	else if (null == aClass183_5651 && anInt5650 * 178524317 >= 0)
	    method8335(class185, 2146775748);
	if (aClass505_5654 != null && this != aClass505_5654) {
	    aClass505_5654.method8331(-1977547019);
	    bool |= aClass505_5654.method8353(class185, i, i_74_, 851012332);
	}
	return bool;
    }
    
    public Class505 method8349() {
	return aClass505_5654;
    }
    
    public boolean method8350(Class185 class185, int i, int i_80_) {
	if (i != 1151834243 * anInt5641) {
	    anInt5641 = 1387230763 * i;
	    int i_81_ = Class455.method7422(i, 376542358);
	    if (i_81_ > 512)
		i_81_ = 512;
	    if (i_81_ <= 0)
		i_81_ = 1;
	    if (i_81_ != 1510190127 * anInt5642) {
		anInt5642 = i_81_ * 1734679247;
		aClass163_5645 = null;
	    }
	    if (null != aClass516Array5638) {
		anInt5656 = 0;
		int[] is = new int[aClass516Array5638.length];
		for (int i_82_ = 0; i_82_ < aClass516Array5638.length;
		     i_82_++) {
		    Class516 class516 = aClass516Array5638[i_82_];
		    if (class516.method8611(anInt5647 * 1946060627,
					    108985433 * anInt5643,
					    -1380844273 * anInt5644,
					    1151834243 * anInt5641)) {
			is[anInt5656 * -446272903] = class516.anInt7028;
			aClass516Array5636
			    [(anInt5656 += 886038473) * -446272903 - 1]
			    = class516;
		    }
		}
		Class160.method2617(is, aClass516Array5636, 0,
				    -446272903 * anInt5656 - 1, -999933617);
	    }
	    aBool5657 = true;
	}
	boolean bool = false;
	if (aBool5657) {
	    aBool5657 = false;
	    for (int i_83_ = anInt5656 * -446272903 - 1; i_83_ >= 0; i_83_--) {
		boolean bool_84_
		    = aClass516Array5636[i_83_].method8593(class185,
							   aClass516_5637);
		Class505 class505_85_ = this;
		class505_85_.aBool5657 = class505_85_.aBool5657 | !bool_84_;
		bool |= bool_84_;
	    }
	}
	if (i_80_ == 0 || !class185.method3404())
	    aClass183_5651 = null;
	else if (null == aClass183_5651 && anInt5650 * 178524317 >= 0)
	    method8335(class185, 2117751995);
	if (aClass505_5654 != null && this != aClass505_5654) {
	    aClass505_5654.method8331(-1977547019);
	    bool |= aClass505_5654.method8353(class185, i, i_80_, 1217750717);
	}
	return bool;
    }
    
    public void method8351(Class185 class185, int i, int i_86_, int i_87_,
			   int i_88_, int i_89_, int i_90_, int i_91_,
			   int i_92_, int i_93_) {
	method8336(class185, i, i_86_, i_87_, i_88_, i_89_, i_90_, i_91_, 0,
		   i_93_, true, false, -1902712846);
    }
    
    public void method8352(Class185 class185, int i, int i_94_, int i_95_,
			   int i_96_, int i_97_, int i_98_, int i_99_,
			   int i_100_, int i_101_) {
	method8336(class185, i, i_94_, i_95_, i_96_, i_97_, i_98_, i_99_, 0,
		   i_101_, true, false, -785161152);
    }
    
    public boolean method8353(Class185 class185, int i, int i_102_,
			      int i_103_) {
	if (i != 1151834243 * anInt5641) {
	    anInt5641 = 1387230763 * i;
	    int i_104_ = Class455.method7422(i, -253480570);
	    if (i_104_ > 512)
		i_104_ = 512;
	    if (i_104_ <= 0)
		i_104_ = 1;
	    if (i_104_ != 1510190127 * anInt5642) {
		anInt5642 = i_104_ * 1734679247;
		aClass163_5645 = null;
	    }
	    if (null != aClass516Array5638) {
		anInt5656 = 0;
		int[] is = new int[aClass516Array5638.length];
		for (int i_105_ = 0; i_105_ < aClass516Array5638.length;
		     i_105_++) {
		    Class516 class516 = aClass516Array5638[i_105_];
		    if (class516.method8611(anInt5647 * 1946060627,
					    108985433 * anInt5643,
					    -1380844273 * anInt5644,
					    1151834243 * anInt5641)) {
			is[anInt5656 * -446272903] = class516.anInt7028;
			aClass516Array5636
			    [(anInt5656 += 886038473) * -446272903 - 1]
			    = class516;
		    }
		}
		Class160.method2617(is, aClass516Array5636, 0,
				    -446272903 * anInt5656 - 1, -1052500007);
	    }
	    aBool5657 = true;
	}
	boolean bool = false;
	if (aBool5657) {
	    aBool5657 = false;
	    for (int i_106_ = anInt5656 * -446272903 - 1; i_106_ >= 0;
		 i_106_--) {
		boolean bool_107_
		    = aClass516Array5636[i_106_].method8593(class185,
							    aClass516_5637);
		Class505 class505_108_ = this;
		class505_108_.aBool5657 = class505_108_.aBool5657 | !bool_107_;
		bool |= bool_107_;
	    }
	}
	if (i_102_ == 0 || !class185.method3404())
	    aClass183_5651 = null;
	else if (null == aClass183_5651 && anInt5650 * 178524317 >= 0)
	    method8335(class185, 2131319406);
	if (aClass505_5654 != null && this != aClass505_5654) {
	    aClass505_5654.method8331(-1977547019);
	    bool |= aClass505_5654.method8353(class185, i, i_102_, 2058892838);
	}
	return bool;
    }
    
    void method8354(Class185 class185, int i, int i_109_, int i_110_,
		    int i_111_, int i_112_, int i_113_, int i_114_, int i_115_,
		    int i_116_, boolean bool, boolean bool_117_, int i_118_) {
	int i_119_ = 255 - i_118_;
	class185.method3581();
	class185.method3559();
	if (aClass183_5651 == null) {
	    class185.method3340(2, 0);
	    i_114_ = i_114_ + i & 0x3fff;
	    if (-1 != anInt5635 * 1098175913 && 0 != anInt5642 * 1510190127) {
		Class186 class186
		    = Class154.aClass177_1741
			  .method2931(1098175913 * anInt5635, (byte) 1);
		if (aClass163_5645 == null
		    && (Class304.anInterface25_3263.method155
			(Class598.aClass598_7865,
			 class186.anInt2042 * 1604666399,
			 (class186.aClass599_2064 == Class599.aClass599_7870
			  ? Class613.aClass613_8023 : Class613.aClass613_8022),
			 0.7F, anInt5642 * 1510190127, anInt5642 * 1510190127,
			 false, -618218007))) {
		    int[] is
			= (Class599.aClass599_7870 == class186.aClass599_2064
			   ? (Class304.anInterface25_3263.method150
			      (Class598.aClass598_7865,
			       class186.anInt2042 * 1604666399, 0.7F,
			       1510190127 * anInt5642, anInt5642 * 1510190127,
			       false, 1150219468))
			   : (Class304.anInterface25_3263.method149
			      (Class598.aClass598_7865,
			       class186.anInt2042 * 1604666399, 0.7F,
			       1510190127 * anInt5642, 1510190127 * anInt5642,
			       false, -1247580227)));
		    anInt5639 = -1276147587 * is[0];
		    anInt5648 = -148946821 * is[is.length - 1];
		    aClass163_5645
			= class185.method3317(is, 0,
					      1264459495 * class186.anInt2046,
					      1264459495 * class186.anInt2046,
					      class186.anInt2046 * 1264459495,
					      (byte) -66);
		}
		int i_120_
		    = (255 == i_119_
		       ? (Class599.aClass599_7870 == class186.aClass599_2064
			  ? 1 : 0)
		       : 1);
		if (i_120_ == 1 && bool)
		    class185.method3298(i_109_, i_110_, i_111_, i_112_, i_116_,
					0);
		if (null != aClass163_5645) {
		    int i_121_ = i_112_ * i_113_ / -4096;
		    int i_122_;
		    for (i_122_
			     = (i_111_ - i_112_) / 2 + i_112_ * i_114_ / 4096;
			 i_122_ > i_112_; i_122_ -= i_112_) {
			/* empty */
		    }
		    for (/**/; i_122_ < 0; i_122_ += i_112_) {
			/* empty */
		    }
		    if (aClass571_5646 == Class571.aClass571_7664) {
			for (int i_123_ = i_122_ - i_112_; i_123_ < i_111_;
			     i_123_ += i_112_)
			    aClass163_5645.method2660(i_109_ + i_123_,
						      i_110_ + i_121_, i_112_,
						      i_112_, 0,
						      i_119_ << 24 | 0xffffff,
						      i_120_);
			if ((anInt5639 * 927740117 & ~0xffffff) != 0)
			    class185.method3292(0, 0, i_111_,
						1 + (i_121_ + i_110_),
						927740117 * anInt5639,
						-2116926490);
			if ((468623027 * anInt5648 & ~0xffffff) != 0)
			    class185.method3292(0, i_112_ + (i_121_ + i_110_),
						i_111_,
						i_112_ - (i_112_
							  + (i_121_ + i_110_)),
						anInt5648 * 468623027,
						-1705715018);
		    } else {
			for (/**/; i_121_ > i_112_; i_121_ -= i_112_) {
			    /* empty */
			}
			for (/**/; i_121_ < 0; i_121_ += i_112_) {
			    /* empty */
			}
			for (int i_124_ = i_122_ - i_112_; i_124_ < i_111_;
			     i_124_ += i_112_) {
			    for (int i_125_ = i_121_ - i_112_; i_125_ < i_112_;
				 i_125_ += i_112_)
				aClass163_5645.method2660(i_124_ + i_109_,
							  i_125_ + i_110_,
							  i_112_, i_112_, 0,
							  (i_119_ << 24
							   | 0xffffff),
							  i_120_);
			}
		    }
		}
	    } else
		class185.method3298(i_109_, i_110_, i_111_, i_112_,
				    i_119_ << 24 | i_116_, bool ? 0 : 1);
	} else if (bool_117_) {
	    Class433 class433 = class185.method3339();
	    Class433 class433_126_ = class185.method3339();
	    class433.aFloatArray4853[2] = class433.aFloatArray4853[3];
	    class433.aFloatArray4853[6] = class433.aFloatArray4853[7];
	    class433.aFloatArray4853[10] = class433.aFloatArray4853[11];
	    class433.aFloatArray4853[14] = class433.aFloatArray4853[15];
	    class185.method3338(class433);
	    method8342(class185, i_113_, i_114_, i_115_, i_118_, (byte) 102);
	    class185.method3338(class433_126_);
	} else {
	    if (bool)
		class185.method3340(3, i_116_);
	    method8342(class185, i_113_, i_114_, i_115_, i_118_, (byte) 98);
	}
	for (int i_127_ = anInt5656 * -446272903 - 1; i_127_ >= 0; i_127_--)
	    aClass516Array5636[i_127_].method8606(class185, i_109_, i_110_,
						  i_111_, i_112_, i_113_,
						  i_114_,
						  1946060627 * anInt5647,
						  108985433 * anInt5643,
						  -1380844273 * anInt5644,
						  i_119_);
	class185.method3340(2, 0);
	class185.method3446();
    }
    
    void method8355(Class185 class185, int i, int i_128_, int i_129_,
		    int i_130_, int i_131_, int i_132_, int i_133_, int i_134_,
		    int i_135_, boolean bool, boolean bool_136_, int i_137_) {
	int i_138_ = 255 - i_137_;
	class185.method3581();
	class185.method3559();
	if (aClass183_5651 == null) {
	    class185.method3340(2, 0);
	    i_133_ = i_133_ + i & 0x3fff;
	    if (-1 != anInt5635 * 1098175913 && 0 != anInt5642 * 1510190127) {
		Class186 class186
		    = Class154.aClass177_1741
			  .method2931(1098175913 * anInt5635, (byte) 1);
		if (aClass163_5645 == null
		    && (Class304.anInterface25_3263.method155
			(Class598.aClass598_7865,
			 class186.anInt2042 * 1604666399,
			 (class186.aClass599_2064 == Class599.aClass599_7870
			  ? Class613.aClass613_8023 : Class613.aClass613_8022),
			 0.7F, anInt5642 * 1510190127, anInt5642 * 1510190127,
			 false, -618218007))) {
		    int[] is
			= (Class599.aClass599_7870 == class186.aClass599_2064
			   ? (Class304.anInterface25_3263.method150
			      (Class598.aClass598_7865,
			       class186.anInt2042 * 1604666399, 0.7F,
			       1510190127 * anInt5642, anInt5642 * 1510190127,
			       false, -115386113))
			   : (Class304.anInterface25_3263.method149
			      (Class598.aClass598_7865,
			       class186.anInt2042 * 1604666399, 0.7F,
			       1510190127 * anInt5642, 1510190127 * anInt5642,
			       false, -1381220202)));
		    anInt5639 = -1276147587 * is[0];
		    anInt5648 = -148946821 * is[is.length - 1];
		    aClass163_5645
			= class185.method3317(is, 0,
					      1264459495 * class186.anInt2046,
					      1264459495 * class186.anInt2046,
					      class186.anInt2046 * 1264459495,
					      (byte) 82);
		}
		int i_139_
		    = (255 == i_138_
		       ? (Class599.aClass599_7870 == class186.aClass599_2064
			  ? 1 : 0)
		       : 1);
		if (i_139_ == 1 && bool)
		    class185.method3298(i_128_, i_129_, i_130_, i_131_, i_135_,
					0);
		if (null != aClass163_5645) {
		    int i_140_ = i_131_ * i_132_ / -4096;
		    int i_141_;
		    for (i_141_
			     = (i_130_ - i_131_) / 2 + i_131_ * i_133_ / 4096;
			 i_141_ > i_131_; i_141_ -= i_131_) {
			/* empty */
		    }
		    for (/**/; i_141_ < 0; i_141_ += i_131_) {
			/* empty */
		    }
		    if (aClass571_5646 == Class571.aClass571_7664) {
			for (int i_142_ = i_141_ - i_131_; i_142_ < i_130_;
			     i_142_ += i_131_)
			    aClass163_5645.method2660(i_128_ + i_142_,
						      i_129_ + i_140_, i_131_,
						      i_131_, 0,
						      i_138_ << 24 | 0xffffff,
						      i_139_);
			if ((anInt5639 * 927740117 & ~0xffffff) != 0)
			    class185.method3292(0, 0, i_130_,
						1 + (i_140_ + i_129_),
						927740117 * anInt5639,
						-2033684526);
			if ((468623027 * anInt5648 & ~0xffffff) != 0)
			    class185.method3292(0, i_131_ + (i_140_ + i_129_),
						i_130_,
						i_131_ - (i_131_
							  + (i_140_ + i_129_)),
						anInt5648 * 468623027,
						-2115220550);
		    } else {
			for (/**/; i_140_ > i_131_; i_140_ -= i_131_) {
			    /* empty */
			}
			for (/**/; i_140_ < 0; i_140_ += i_131_) {
			    /* empty */
			}
			for (int i_143_ = i_141_ - i_131_; i_143_ < i_130_;
			     i_143_ += i_131_) {
			    for (int i_144_ = i_140_ - i_131_; i_144_ < i_131_;
				 i_144_ += i_131_)
				aClass163_5645.method2660(i_143_ + i_128_,
							  i_144_ + i_129_,
							  i_131_, i_131_, 0,
							  (i_138_ << 24
							   | 0xffffff),
							  i_139_);
			}
		    }
		}
	    } else
		class185.method3298(i_128_, i_129_, i_130_, i_131_,
				    i_138_ << 24 | i_135_, bool ? 0 : 1);
	} else if (bool_136_) {
	    Class433 class433 = class185.method3339();
	    Class433 class433_145_ = class185.method3339();
	    class433.aFloatArray4853[2] = class433.aFloatArray4853[3];
	    class433.aFloatArray4853[6] = class433.aFloatArray4853[7];
	    class433.aFloatArray4853[10] = class433.aFloatArray4853[11];
	    class433.aFloatArray4853[14] = class433.aFloatArray4853[15];
	    class185.method3338(class433);
	    method8342(class185, i_132_, i_133_, i_134_, i_137_, (byte) 24);
	    class185.method3338(class433_145_);
	} else {
	    if (bool)
		class185.method3340(3, i_135_);
	    method8342(class185, i_132_, i_133_, i_134_, i_137_, (byte) 35);
	}
	for (int i_146_ = anInt5656 * -446272903 - 1; i_146_ >= 0; i_146_--)
	    aClass516Array5636[i_146_].method8606(class185, i_128_, i_129_,
						  i_130_, i_131_, i_132_,
						  i_133_,
						  1946060627 * anInt5647,
						  108985433 * anInt5643,
						  -1380844273 * anInt5644,
						  i_138_);
	class185.method3340(2, 0);
	class185.method3446();
    }
    
    void method8356(Class185 class185, int i, int i_147_, int i_148_,
		    int i_149_) {
	Class446 class446 = class185.method3532();
	Class446 class446_150_ = new Class446();
	class446_150_.method7250(0.0F, 0.0F, 0.0F);
	class446_150_.method7245(0.0F, -1.0F, 0.0F,
				 Class427.method6799(-i_147_ & 0x3fff));
	class446_150_.method7245(-1.0F, 0.0F, 0.0F,
				 Class427.method6799(-i & 0x3fff));
	class446_150_.method7245(0.0F, 0.0F, -1.0F,
				 Class427.method6799(-i_148_ & 0x3fff));
	class185.method3335(class446_150_);
	Class446 class446_151_ = new Class446();
	if (i_149_ != -120566155 * anInt5653) {
	    aClass183_5651.method3088((byte) i_149_, aByteArray5652);
	    anInt5653 = i_149_ * -1723035171;
	}
	aClass183_5651.method3034(class446_151_, null, 0);
	class185.method3335(class446);
    }
    
    public static void method8357(int i) {
	Class113.anInt1381 = 1312565957;
    }
    
    public static int method8358(Class534_Sub18_Sub7 class534_sub18_sub7,
				 byte i) {
	if (Class72.aBool758)
	    return 6;
	if (class534_sub18_sub7 == null)
	    return 0;
	int i_152_ = -1986934021 * class534_sub18_sub7.anInt11706;
	if (Class591.method9883(i_152_, (byte) -72))
	    return 1;
	if (Class698.method14124(i_152_, 1024308122))
	    return 2;
	if (Class421.method6783(i_152_, (byte) -104))
	    return 3;
	if (Class534_Sub4.method16039(i_152_, 57964617))
	    return 4;
	if (Class100.method1883(i_152_, 2114101906))
	    return 7;
	if (16 == i_152_)
	    return 8;
	return 5;
    }
}
