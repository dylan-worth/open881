/* Class171 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Container;
import java.util.Random;

public abstract class Class171
{
    static int anInt1794;
    public static final int anInt1795 = 1;
    Class16 aClass16_1796;
    public static final int anInt1797 = 0;
    public static final int anInt1798 = 0;
    static int anInt1799;
    static int anInt1800 = 658379099;
    static int anInt1801;
    static int anInt1802;
    static int anInt1803;
    Class185 aClass185_1804;
    static int anInt1805;
    static int anInt1806;
    static String[] aStringArray1807;
    
    public void method2827(String string, int i, int i_0_, int i_1_, int i_2_,
			   int i_3_, int i_4_) {
	if (string != null) {
	    method2837(i_1_, i_2_, -318448934);
	    double d = 7.0 - (double) i_4_ / 8.0;
	    if (d < 0.0)
		d = 0.0;
	    int i_5_ = string.length();
	    int[] is = new int[i_5_];
	    for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
		is[i_6_] = (int) (Math.sin((double) i_6_ / 1.5
					   + (double) i_3_ / 1.0)
				  * d);
	    method2841(string,
		       i - aClass16_1796.method728(string, -583574342) / 2,
		       i_0_, null, null, null, is, (byte) 86);
	}
    }
    
    public void method2828(String string, int i, int i_7_, int i_8_, int i_9_,
			   byte i_10_) {
	if (string != null) {
	    method2837(i_8_, i_9_, 2072283979);
	    method2840(string, i, i_7_, null, null, null, 0, 0, (short) 770);
	}
    }
    
    public void method2829(String string, int i, int i_11_, int i_12_,
			   int i_13_, int i_14_) {
	if (null != string) {
	    method2837(i_12_, i_13_, 1461490453);
	    method2840(string, i - aClass16_1796.method728(string, 1884182343),
		       i_11_, null, null, null, 0, 0, (short) 770);
	}
    }
    
    public void method2830(String string, int i, int i_15_, int i_16_,
			   int i_17_, int i_18_) {
	if (string != null) {
	    method2837(i_16_, i_17_, -311484257);
	    method2840(string,
		       i - aClass16_1796.method728(string, -840277799) / 2,
		       i_15_, null, null, null, 0, 0, (short) 770);
	}
    }
    
    Class171(Class185 class185, Class16 class16) {
	aClass185_1804 = class185;
	aClass16_1796 = class16;
    }
    
    public int method2831(String string, int i, int i_19_, int i_20_,
			  int i_21_, int i_22_, int i_23_, int i_24_,
			  int i_25_, Random random, int i_26_, int[] is,
			  Class163[] class163s, int[] is_27_) {
	if (null == string)
	    return 0;
	random.setSeed((long) i_26_);
	int i_28_ = 192 + (random.nextInt() & 0x1f);
	method2837(i_28_ << 24 | i_22_ & 0xffffff,
		   -1 == i_23_ ? 0 : i_28_ << 24 | i_23_ & 0xffffff,
		   1999610563);
	int i_29_ = string.length();
	int[] is_30_ = new int[i_29_];
	int i_31_ = 0;
	for (int i_32_ = 0; i_32_ < i_29_; i_32_++) {
	    is_30_[i_32_] = i_31_;
	    if ((random.nextInt() & 0x3) == 0)
		i_31_++;
	}
	int i_33_ = i;
	int i_34_ = 102396103 * aClass16_1796.anInt190 + i_19_;
	int i_35_ = -1;
	if (1 == i_25_)
	    i_34_ += (i_21_ - 102396103 * aClass16_1796.anInt190
		      - 728893755 * aClass16_1796.anInt189) / 2;
	else if (2 == i_25_)
	    i_34_ = i_21_ + i_19_ - 728893755 * aClass16_1796.anInt189;
	if (i_24_ == 1) {
	    i_35_ = aClass16_1796.method728(string, -534552850) + i_31_;
	    i_33_ += (i_20_ - i_35_) / 2;
	} else if (i_24_ == 2) {
	    i_35_ = aClass16_1796.method728(string, 471901941) + i_31_;
	    i_33_ += i_20_ - i_35_;
	}
	method2841(string, i_33_, i_34_, class163s, is_27_, is_30_, null,
		   (byte) 126);
	if (null != is) {
	    if (i_35_ == -1)
		i_35_ = aClass16_1796.method728(string, -1537818714) + i_31_;
	    is[0] = i_33_;
	    is[1] = i_34_ - 102396103 * aClass16_1796.anInt190;
	    is[2] = i_35_;
	    is[3] = (728893755 * aClass16_1796.anInt189
		     + 102396103 * aClass16_1796.anInt190);
	}
	return i_31_;
    }
    
    public void method2832(String string, int i, int i_36_, int i_37_,
			   int i_38_, int i_39_, int i_40_) {
	if (string != null) {
	    method2837(i_37_, i_38_, 671576042);
	    int i_41_ = string.length();
	    int[] is = new int[i_41_];
	    for (int i_42_ = 0; i_42_ < i_41_; i_42_++)
		is[i_42_] = (int) (Math.sin((double) i_39_ / 5.0
					    + (double) i_42_ / 2.0)
				   * 5.0);
	    method2841(string,
		       i - aClass16_1796.method728(string, -533553162) / 2,
		       i_36_, null, null, null, is, (byte) 78);
	}
    }
    
    public void method2833(String string, int i, int i_43_, int i_44_,
			   int i_45_, int i_46_, int i_47_) {
	if (string != null) {
	    method2837(i_44_, i_45_, 1298889470);
	    int i_48_ = string.length();
	    int[] is = new int[i_48_];
	    int[] is_49_ = new int[i_48_];
	    for (int i_50_ = 0; i_50_ < i_48_; i_50_++) {
		is[i_50_] = (int) (Math.sin((double) i_46_ / 5.0
					    + (double) i_50_ / 5.0)
				   * 5.0);
		is_49_[i_50_] = (int) (Math.sin((double) i_50_ / 3.0
						+ (double) i_46_ / 5.0)
				       * 5.0);
	    }
	    method2841(string,
		       i - aClass16_1796.method728(string, 891185521) / 2,
		       i_43_, null, null, is, is_49_, (byte) 4);
	}
    }
    
    public void method2834(String string, int i, int i_51_, int i_52_,
			   int i_53_, int i_54_, int i_55_, int i_56_) {
	if (string != null) {
	    method2837(i_52_, i_53_, 698624010);
	    double d = 7.0 - (double) i_55_ / 8.0;
	    if (d < 0.0)
		d = 0.0;
	    int i_57_ = string.length();
	    int[] is = new int[i_57_];
	    for (int i_58_ = 0; i_58_ < i_57_; i_58_++)
		is[i_58_] = (int) (Math.sin((double) i_58_ / 1.5
					    + (double) i_54_ / 1.0)
				   * d);
	    method2841(string,
		       i - aClass16_1796.method728(string, 2117401543) / 2,
		       i_51_, null, null, null, is, (byte) 72);
	}
    }
    
    public int method2835(String string, int i, int i_59_, int i_60_,
			  int i_61_, Random random, int i_62_,
			  Class163[] class163s, int[] is, byte i_63_) {
	if (string == null)
	    return 0;
	random.setSeed((long) i_62_);
	int i_64_ = 192 + (random.nextInt() & 0x1f);
	method2837(i_64_ << 24 | i_60_ & 0xffffff,
		   i_64_ << 24 | i_61_ & 0xffffff, -1789376972);
	int i_65_ = string.length();
	int[] is_66_ = new int[i_65_];
	int i_67_ = 0;
	for (int i_68_ = 0; i_68_ < i_65_; i_68_++) {
	    is_66_[i_68_] = i_67_;
	    if ((random.nextInt() & 0x3) == 0)
		i_67_++;
	}
	method2841(string, i, i_59_, class163s, is, is_66_, null, (byte) 34);
	return i_67_;
    }
    
    public int method2836(String string, int i, int i_69_, int i_70_,
			  int i_71_, int i_72_, int i_73_, int i_74_,
			  int i_75_, Random random, int i_76_, int[] is,
			  Class163[] class163s, int[] is_77_, byte i_78_) {
	if (null == string)
	    return 0;
	random.setSeed((long) i_76_);
	int i_79_ = 192 + (random.nextInt() & 0x1f);
	method2837(i_79_ << 24 | i_72_ & 0xffffff,
		   -1 == i_73_ ? 0 : i_79_ << 24 | i_73_ & 0xffffff,
		   -125432402);
	int i_80_ = string.length();
	int[] is_81_ = new int[i_80_];
	int i_82_ = 0;
	for (int i_83_ = 0; i_83_ < i_80_; i_83_++) {
	    is_81_[i_83_] = i_82_;
	    if ((random.nextInt() & 0x3) == 0)
		i_82_++;
	}
	int i_84_ = i;
	int i_85_ = 102396103 * aClass16_1796.anInt190 + i_69_;
	int i_86_ = -1;
	if (1 == i_75_)
	    i_85_ += (i_71_ - 102396103 * aClass16_1796.anInt190
		      - 728893755 * aClass16_1796.anInt189) / 2;
	else if (2 == i_75_)
	    i_85_ = i_71_ + i_69_ - 728893755 * aClass16_1796.anInt189;
	if (i_74_ == 1) {
	    i_86_ = aClass16_1796.method728(string, 854374405) + i_82_;
	    i_84_ += (i_70_ - i_86_) / 2;
	} else if (i_74_ == 2) {
	    i_86_ = aClass16_1796.method728(string, -180047401) + i_82_;
	    i_84_ += i_70_ - i_86_;
	}
	method2841(string, i_84_, i_85_, class163s, is_77_, is_81_, null,
		   (byte) 83);
	if (null != is) {
	    if (i_86_ == -1)
		i_86_ = aClass16_1796.method728(string, -947559284) + i_82_;
	    is[0] = i_84_;
	    is[1] = i_85_ - 102396103 * aClass16_1796.anInt190;
	    is[2] = i_86_;
	    is[3] = (728893755 * aClass16_1796.anInt189
		     + 102396103 * aClass16_1796.anInt190);
	}
	return i_82_;
    }
    
    void method2837(int i, int i_87_, int i_88_) {
	anInt1800 = 658379099;
	anInt1794 = 1043358759;
	anInt1802 = (anInt1801 = -17963335 * i) * -18968535;
	anInt1805 = 0;
	anInt1806 = 0;
	if (i_87_ == -1)
	    i_87_ = 0;
	anInt1799 = (anInt1803 = i_87_ * -360402663) * -323331121;
    }
    
    public void method2838(String string, int i, int i_89_, int i_90_,
			   int i_91_, int i_92_) {
	if (string != null) {
	    method2837(i_90_, i_91_, 168427589);
	    int i_93_ = string.length();
	    int[] is = new int[i_93_];
	    int[] is_94_ = new int[i_93_];
	    for (int i_95_ = 0; i_95_ < i_93_; i_95_++) {
		is[i_95_] = (int) (Math.sin((double) i_92_ / 5.0
					    + (double) i_95_ / 5.0)
				   * 5.0);
		is_94_[i_95_] = (int) (Math.sin((double) i_95_ / 3.0
						+ (double) i_92_ / 5.0)
				       * 5.0);
	    }
	    method2841(string,
		       i - aClass16_1796.method728(string, 1066100354) / 2,
		       i_89_, null, null, is, is_94_, (byte) 75);
	}
    }
    
    void method2839(String string, int i, int i_96_) {
	int i_97_ = 0;
	boolean bool = false;
	for (int i_98_ = 0; i_98_ < string.length(); i_98_++) {
	    char c = string.charAt(i_98_);
	    if ('<' == c)
		bool = true;
	    else if (c == '>')
		bool = false;
	    else if (!bool && c == ' ')
		i_97_++;
	}
	if (i_97_ > 0)
	    anInt1805 = ((i - aClass16_1796.method728(string, 2089633944) << 8)
			 / i_97_ * 1098032017);
    }
    
    void method2840(String string, int i, int i_99_, Class163[] class163s,
		    int[] is, Class145 class145, int i_100_, int i_101_,
		    short i_102_) {
	i_99_ -= aClass16_1796.anInt187 * -1062735011;
	int i_103_ = -1;
	int i_104_ = -1;
	int i_105_ = string.length();
	for (int i_106_ = 0; i_106_ < i_105_; i_106_++) {
	    char c = (char) (Class542.method8950(string.charAt(i_106_),
						 2082720256)
			     & 0xff);
	    if (60 == c)
		i_103_ = i_106_;
	    else {
		if (c == 62 && -1 != i_103_) {
		    String string_107_ = string.substring(i_103_ + 1, i_106_);
		    i_103_ = -1;
		    if (string_107_.equals("lt"))
			c = '<';
		    else if (string_107_.equals("gt"))
			c = '>';
		    else if (string_107_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_107_.equals("shy"))
			c = '\u00ad';
		    else if (string_107_.equals("times"))
			c = '\u00d7';
		    else if (string_107_.equals("euro"))
			c = '\u0080';
		    else if (string_107_.equals("copy"))
			c = '\u00a9';
		    else if (string_107_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_107_.startsWith("img=")) {
			    try {
				int i_108_
				    = Class684.method13949(string_107_
							       .substring(4),
							   (byte) 70);
				Class163 class163 = class163s[i_108_];
				int i_109_ = (null != is ? is[i_108_]
					      : class163.method2692());
				if (-16777216
				    == (anInt1802 * -1624596383 & ~0xffffff))
				    class163.method2657(i,
							(((aClass16_1796
							   .anInt187)
							  * -1062735011)
							 + i_99_ - i_109_),
							1, -1, 1);
				else
				    class163.method2657
					(i,
					 i_99_ + (aClass16_1796.anInt187
						  * -1062735011) - i_109_,
					 0,
					 (anInt1802 * -1624596383 & ~0xffffff
					  | 0xffffff),
					 1);
				i += class163s[i_108_].method22();
				i_104_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_107_.startsWith("sprite=")) {
			    if (aClass16_1796.anInterface2_188 != null) {
				try {
				    int i_110_ = -1;
				    int i_111_ = 0;
				    int i_112_ = string_107_.indexOf(',');
				    if (i_112_ == -1)
					i_110_ = (Class684.method13949
						  (string_107_.substring(7),
						   (byte) 105));
				    else {
					i_110_
					    = (Class684.method13949
					       (string_107_.substring(7,
								      i_112_),
						(byte) 67));
					i_111_ = (Class684.method13949
						  (string_107_
						       .substring(1 + i_112_),
						   (byte) 1));
				    }
				    Class163[] class163s_113_
					= (aClass16_1796.anInterface2_188
					       .method19
					   (aClass185_1804, i_110_,
					    1532128259));
				    if (null != class163s_113_) {
					int i_114_
					    = Math.min(class163s_113_
							   [i_111_]
							   .method2692(),
						       ((aClass16_1796.anInt189
							 * 728893755)
							+ (102396103
							   * (aClass16_1796
							      .anInt190))));
					if ((-1624596383 * anInt1802
					     & ~0xffffff)
					    == -16777216)
					    class163s_113_[i_111_].method2657
						(i, (2 + i_99_
						     + (aClass16_1796.anInt187
							* -1062735011)
						     - i_114_), 1, -1, 1);
					else
					    class163s_113_[i_111_].method2657
						(i,
						 ((-1062735011
						   * aClass16_1796.anInt187)
						  + (2 + i_99_) - i_114_),
						 0,
						 (anInt1802 * -1624596383
						  & ~0xffffff) | 0xffffff,
						 1);
					i += class163s_113_[i_111_].method22();
				    }
				    i_104_ = -1;
				} catch (Exception exception) {
				    /* empty */
				}
			    }
			} else
			    method2870(string_107_, -1880765141);
			continue;
		    }
		}
		if (-1 == i_103_) {
		    if (-1 != i_104_)
			i += aClass16_1796.method756(i_104_, c, 1718511764);
		    if (32 != c) {
			if (class145 == null) {
			    if ((32538503 * anInt1799 & ~0xffffff) != 0)
				method2860(c, 1 + i, 1 + i_99_,
					   32538503 * anInt1799, true);
			    method2860(c, i, i_99_, anInt1802 * -1624596383,
				       false);
			} else {
			    if ((anInt1799 * 32538503 & ~0xffffff) != 0)
				method2877(c, 1 + i, 1 + i_99_,
					   32538503 * anInt1799, true,
					   class145, i_100_, i_101_);
			    method2877(c, i, i_99_, anInt1802 * -1624596383,
				       false, class145, i_100_, i_101_);
			}
		    } else if (-1509393039 * anInt1805 > 0) {
			anInt1806 += anInt1805 * 1273476081;
			i += anInt1806 * 1931534721 >> 8;
			anInt1806
			    = (anInt1806 * 1931534721 & 0xff) * -668901759;
		    }
		    int i_115_ = aClass16_1796.method726(c, -1027452217);
		    if (-1 != anInt1800 * -1699985107)
			aClass185_1804.method3294
			    (i,
			     ((int) (0.7 * (double) (-1062735011
						     * aClass16_1796.anInt187))
			      + i_99_),
			     i_115_, anInt1800 * -1699985107, 120870056);
		    if (1310274665 * anInt1794 != -1)
			aClass185_1804.method3294(i,
						  (aClass16_1796.anInt187
						   * -1062735011) + i_99_ + 1,
						  i_115_,
						  1310274665 * anInt1794,
						  1470304881);
		    i += i_115_;
		    i_104_ = c;
		}
	    }
	}
    }
    
    void method2841(String string, int i, int i_116_, Class163[] class163s,
		    int[] is, int[] is_117_, int[] is_118_, byte i_119_) {
	i_116_ -= -1062735011 * aClass16_1796.anInt187;
	int i_120_ = -1;
	int i_121_ = -1;
	int i_122_ = 0;
	int i_123_ = string.length();
	for (int i_124_ = 0; i_124_ < i_123_; i_124_++) {
	    char c = (char) (Class542.method8950(string.charAt(i_124_),
						 -196130931)
			     & 0xff);
	    if (60 == c)
		i_120_ = i_124_;
	    else {
		if (c == 62 && i_120_ != -1) {
		    String string_125_ = string.substring(1 + i_120_, i_124_);
		    i_120_ = -1;
		    if (string_125_.equals("lt"))
			c = '<';
		    else if (string_125_.equals("gt"))
			c = '>';
		    else if (string_125_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_125_.equals("shy"))
			c = '\u00ad';
		    else if (string_125_.equals("times"))
			c = '\u00d7';
		    else if (string_125_.equals("euro"))
			c = '\u0080';
		    else if (string_125_.equals("copy"))
			c = '\u00a9';
		    else if (string_125_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_125_.startsWith("img=")) {
			    try {
				int i_126_;
				if (null != is_117_)
				    i_126_ = is_117_[i_122_];
				else
				    i_126_ = 0;
				int i_127_;
				if (null != is_118_)
				    i_127_ = is_118_[i_122_];
				else
				    i_127_ = 0;
				i_122_++;
				int i_128_
				    = Class684.method13949(string_125_
							       .substring(4),
							   (byte) 114);
				Class163 class163 = class163s[i_128_];
				int i_129_ = (null != is ? is[i_128_]
					      : class163.method2692());
				class163.method2657(i_126_ + i,
						    i_127_ + (i_116_
							      + ((aClass16_1796
								  .anInt187)
								 * -1062735011)
							      - i_129_),
						    1, -1, 1);
				i += class163s[i_128_].method22();
				i_121_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_125_.startsWith("sprite=")) {
			    if (null != aClass16_1796.anInterface2_188) {
				try {
				    int i_130_ = -1;
				    int i_131_ = 0;
				    int i_132_ = string_125_.indexOf(',');
				    if (i_132_ == -1)
					i_130_ = (Class684.method13949
						  (string_125_.substring(7),
						   (byte) 19));
				    else {
					i_130_
					    = (Class684.method13949
					       (string_125_.substring(7,
								      i_132_),
						(byte) 107));
					i_131_ = (Class684.method13949
						  (string_125_
						       .substring(1 + i_132_),
						   (byte) 99));
				    }
				    int i_133_;
				    if (null != is_117_)
					i_133_ = is_117_[i_122_];
				    else
					i_133_ = 0;
				    int i_134_;
				    if (is_118_ != null)
					i_134_ = is_118_[i_122_];
				    else
					i_134_ = 0;
				    i_122_++;
				    Class163[] class163s_135_
					= (aClass16_1796.anInterface2_188
					       .method19
					   (aClass185_1804, i_130_,
					    1532128259));
				    if (null != class163s_135_) {
					int i_136_
					    = Math.min(class163s_135_
							   [i_131_]
							   .method2692(),
						       ((aClass16_1796.anInt189
							 * 728893755)
							+ (102396103
							   * (aClass16_1796
							      .anInt190))));
					class163s_135_[i_131_].method2657
					    (i + i_133_,
					     ((aClass16_1796.anInt187
					       * -1062735011)
					      + (3 + i_116_) - i_136_
					      + i_134_),
					     1, -1, 1);
					i += class163s_135_[i_131_].method22();
				    }
				    i_121_ = -1;
				} catch (Exception exception) {
				    /* empty */
				}
			    }
			} else
			    method2870(string_125_, -1491442369);
			continue;
		    }
		}
		if (i_120_ == -1) {
		    if (i_121_ != -1)
			i += aClass16_1796.method756(i_121_, c, 1472384603);
		    int i_137_;
		    if (is_117_ != null)
			i_137_ = is_117_[i_122_];
		    else
			i_137_ = 0;
		    int i_138_;
		    if (is_118_ != null)
			i_138_ = is_118_[i_122_];
		    else
			i_138_ = 0;
		    i_122_++;
		    if (c != 32) {
			if (0 != (anInt1799 * 32538503 & ~0xffffff))
			    method2860(c, 1 + i + i_137_, i_116_ + 1 + i_138_,
				       32538503 * anInt1799, true);
			method2860(c, i + i_137_, i_138_ + i_116_,
				   -1624596383 * anInt1802, false);
		    } else if (-1509393039 * anInt1805 > 0) {
			anInt1806 += anInt1805 * 1273476081;
			i += anInt1806 * 1931534721 >> 8;
			anInt1806
			    = (anInt1806 * 1931534721 & 0xff) * -668901759;
		    }
		    int i_139_ = aClass16_1796.method726(c, -413253938);
		    if (-1 != -1699985107 * anInt1800)
			aClass185_1804.method3294
			    (i,
			     (i_116_
			      + (int) ((double) (-1062735011
						 * aClass16_1796.anInt187)
				       * 0.7)),
			     i_139_, -1699985107 * anInt1800, -2014089851);
		    if (1310274665 * anInt1794 != -1)
			aClass185_1804.method3294
			    (i, -1062735011 * aClass16_1796.anInt187 + i_116_,
			     i_139_, anInt1794 * 1310274665, -1868604215);
		    i += i_139_;
		    i_121_ = c;
		}
	    }
	}
    }
    
    void method2842(int i, int i_140_) {
	anInt1800 = 658379099;
	anInt1794 = 1043358759;
	anInt1802 = (anInt1801 = -17963335 * i) * -18968535;
	anInt1805 = 0;
	anInt1806 = 0;
	if (i_140_ == -1)
	    i_140_ = 0;
	anInt1799 = (anInt1803 = i_140_ * -360402663) * -323331121;
    }
    
    void method2843(String string, int i, int i_141_, Class163[] class163s,
		    int[] is, Class145 class145, int i_142_, int i_143_) {
	i_141_ -= aClass16_1796.anInt187 * -1062735011;
	int i_144_ = -1;
	int i_145_ = -1;
	int i_146_ = string.length();
	for (int i_147_ = 0; i_147_ < i_146_; i_147_++) {
	    char c
		= (char) (Class542.method8950(string.charAt(i_147_), 258616128)
			  & 0xff);
	    if (60 == c)
		i_144_ = i_147_;
	    else {
		if (c == 62 && -1 != i_144_) {
		    String string_148_ = string.substring(i_144_ + 1, i_147_);
		    i_144_ = -1;
		    if (string_148_.equals("lt"))
			c = '<';
		    else if (string_148_.equals("gt"))
			c = '>';
		    else if (string_148_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_148_.equals("shy"))
			c = '\u00ad';
		    else if (string_148_.equals("times"))
			c = '\u00d7';
		    else if (string_148_.equals("euro"))
			c = '\u0080';
		    else if (string_148_.equals("copy"))
			c = '\u00a9';
		    else if (string_148_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_148_.startsWith("img=")) {
			    try {
				int i_149_
				    = Class684.method13949(string_148_
							       .substring(4),
							   (byte) 9);
				Class163 class163 = class163s[i_149_];
				int i_150_ = (null != is ? is[i_149_]
					      : class163.method2692());
				if (-16777216
				    == (anInt1802 * -1624596383 & ~0xffffff))
				    class163.method2657(i,
							(((aClass16_1796
							   .anInt187)
							  * -1062735011)
							 + i_141_ - i_150_),
							1, -1, 1);
				else
				    class163.method2657
					(i,
					 i_141_ + (aClass16_1796.anInt187
						   * -1062735011) - i_150_,
					 0,
					 (anInt1802 * -1624596383 & ~0xffffff
					  | 0xffffff),
					 1);
				i += class163s[i_149_].method22();
				i_145_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_148_.startsWith("sprite=")) {
			    if (aClass16_1796.anInterface2_188 != null) {
				try {
				    int i_151_ = -1;
				    int i_152_ = 0;
				    int i_153_ = string_148_.indexOf(',');
				    if (i_153_ == -1)
					i_151_ = (Class684.method13949
						  (string_148_.substring(7),
						   (byte) 99));
				    else {
					i_151_
					    = (Class684.method13949
					       (string_148_.substring(7,
								      i_153_),
						(byte) 57));
					i_152_ = (Class684.method13949
						  (string_148_
						       .substring(1 + i_153_),
						   (byte) 76));
				    }
				    Class163[] class163s_154_
					= (aClass16_1796.anInterface2_188
					       .method19
					   (aClass185_1804, i_151_,
					    1532128259));
				    if (null != class163s_154_) {
					int i_155_
					    = Math.min(class163s_154_
							   [i_152_]
							   .method2692(),
						       ((aClass16_1796.anInt189
							 * 728893755)
							+ (102396103
							   * (aClass16_1796
							      .anInt190))));
					if ((-1624596383 * anInt1802
					     & ~0xffffff)
					    == -16777216)
					    class163s_154_[i_152_].method2657
						(i, (2 + i_141_
						     + (aClass16_1796.anInt187
							* -1062735011)
						     - i_155_), 1, -1, 1);
					else
					    class163s_154_[i_152_].method2657
						(i,
						 ((-1062735011
						   * aClass16_1796.anInt187)
						  + (2 + i_141_) - i_155_),
						 0,
						 (anInt1802 * -1624596383
						  & ~0xffffff) | 0xffffff,
						 1);
					i += class163s_154_[i_152_].method22();
				    }
				    i_145_ = -1;
				} catch (Exception exception) {
				    /* empty */
				}
			    }
			} else
			    method2870(string_148_, 31004586);
			continue;
		    }
		}
		if (-1 == i_144_) {
		    if (-1 != i_145_)
			i += aClass16_1796.method756(i_145_, c, 745795101);
		    if (32 != c) {
			if (class145 == null) {
			    if ((32538503 * anInt1799 & ~0xffffff) != 0)
				method2860(c, 1 + i, 1 + i_141_,
					   32538503 * anInt1799, true);
			    method2860(c, i, i_141_, anInt1802 * -1624596383,
				       false);
			} else {
			    if ((anInt1799 * 32538503 & ~0xffffff) != 0)
				method2877(c, 1 + i, 1 + i_141_,
					   32538503 * anInt1799, true,
					   class145, i_142_, i_143_);
			    method2877(c, i, i_141_, anInt1802 * -1624596383,
				       false, class145, i_142_, i_143_);
			}
		    } else if (-1509393039 * anInt1805 > 0) {
			anInt1806 += anInt1805 * 1273476081;
			i += anInt1806 * 1931534721 >> 8;
			anInt1806
			    = (anInt1806 * 1931534721 & 0xff) * -668901759;
		    }
		    int i_156_ = aClass16_1796.method726(c, -508750597);
		    if (-1 != anInt1800 * -1699985107)
			aClass185_1804.method3294
			    (i,
			     ((int) (0.7 * (double) (-1062735011
						     * aClass16_1796.anInt187))
			      + i_141_),
			     i_156_, anInt1800 * -1699985107, 544771293);
		    if (1310274665 * anInt1794 != -1)
			aClass185_1804.method3294(i,
						  (aClass16_1796.anInt187
						   * -1062735011) + i_141_ + 1,
						  i_156_,
						  1310274665 * anInt1794,
						  1866575324);
		    i += i_156_;
		    i_145_ = c;
		}
	    }
	}
    }
    
    public int method2844
	(String string, int i, int i_157_, int i_158_, int i_159_, int i_160_,
	 int i_161_, int i_162_, int i_163_, int i_164_, Class163[] class163s,
	 int[] is, Class145 class145, int i_165_, int i_166_, int i_167_) {
	return method2861(string, i, i_157_, i_158_, i_159_, i_160_, i_161_,
			  i_162_, i_163_, i_164_, 0, class163s, is, class145,
			  i_165_, i_166_, (byte) -84);
    }
    
    abstract void method2845(char c, int i, int i_168_, int i_169_,
			     boolean bool);
    
    abstract void method2846(char c, int i, int i_170_, int i_171_,
			     boolean bool);
    
    abstract void method2847(char c, int i, int i_172_, int i_173_,
			     boolean bool, Class145 class145, int i_174_,
			     int i_175_);
    
    abstract void method2848(char c, int i, int i_176_, int i_177_,
			     boolean bool, Class145 class145, int i_178_,
			     int i_179_);
    
    public void method2849(String string, int i, int i_180_, int i_181_,
			   int i_182_) {
	if (string != null) {
	    method2837(i_181_, i_182_, -427956377);
	    method2840(string, i, i_180_, null, null, null, 0, 0, (short) 770);
	}
    }
    
    public void method2850(String string, int i, int i_183_, int i_184_,
			   int i_185_) {
	if (string != null) {
	    method2837(i_184_, i_185_, 1958644180);
	    method2840(string, i, i_183_, null, null, null, 0, 0, (short) 770);
	}
    }
    
    public void method2851(String string, int i, int i_186_, int i_187_,
			   int i_188_) {
	if (string != null) {
	    method2837(i_187_, i_188_, -1538581837);
	    method2840(string, i, i_186_, null, null, null, 0, 0, (short) 770);
	}
    }
    
    void method2852(String string, int i) {
	int i_189_ = 0;
	boolean bool = false;
	for (int i_190_ = 0; i_190_ < string.length(); i_190_++) {
	    char c = string.charAt(i_190_);
	    if ('<' == c)
		bool = true;
	    else if (c == '>')
		bool = false;
	    else if (!bool && c == ' ')
		i_189_++;
	}
	if (i_189_ > 0)
	    anInt1805 = ((i - aClass16_1796.method728(string, 1581615728) << 8)
			 / i_189_ * 1098032017);
    }
    
    public void method2853(String string, int i, int i_191_, int i_192_,
			   int i_193_) {
	if (null != string) {
	    method2837(i_192_, i_193_, 367856152);
	    method2840(string, i - aClass16_1796.method728(string, 1572929696),
		       i_191_, null, null, null, 0, 0, (short) 770);
	}
    }
    
    public void method2854(String string, int i, int i_194_, int i_195_,
			   int i_196_) {
	if (null != string) {
	    method2837(i_195_, i_196_, 927294794);
	    method2840(string, i - aClass16_1796.method728(string, 478181952),
		       i_194_, null, null, null, 0, 0, (short) 770);
	}
    }
    
    public void method2855(String string, int i, int i_197_, int i_198_,
			   int i_199_) {
	if (null != string) {
	    method2837(i_198_, i_199_, 951206951);
	    method2840(string, i - aClass16_1796.method728(string, -500626522),
		       i_197_, null, null, null, 0, 0, (short) 770);
	}
    }
    
    public void method2856(String string, int i, int i_200_, int i_201_,
			   int i_202_) {
	if (null != string) {
	    method2837(i_201_, i_202_, 197308692);
	    method2840(string, i - aClass16_1796.method728(string, 1229687835),
		       i_200_, null, null, null, 0, 0, (short) 770);
	}
    }
    
    public int method2857
	(String string, int i, int i_203_, int i_204_, int i_205_, int i_206_,
	 int i_207_, int i_208_, int i_209_, int i_210_, Class163[] class163s,
	 int[] is, Class145 class145, int i_211_, int i_212_) {
	return method2861(string, i, i_203_, i_204_, i_205_, i_206_, i_207_,
			  i_208_, i_209_, i_210_, 0, class163s, is, class145,
			  i_211_, i_212_, (byte) -60);
    }
    
    public int method2858(String string, int i, int i_213_, int i_214_,
			  int i_215_, int i_216_, int i_217_, int i_218_,
			  int i_219_, int i_220_, int i_221_,
			  Class163[] class163s, int[] is, Class145 class145,
			  int i_222_, int i_223_) {
	if (null == string)
	    return 0;
	method2837(i_216_, i_217_, -1821273195);
	if (i_220_ == 0)
	    i_220_ = aClass16_1796.anInt187 * -1062735011;
	int[] is_224_;
	if (i_215_ < i_220_ + (728893755 * aClass16_1796.anInt189
			       + 102396103 * aClass16_1796.anInt190)
	    && i_215_ < i_220_ + i_220_)
	    is_224_ = null;
	else
	    is_224_ = new int[] { i_214_ };
	int i_225_ = aClass16_1796.method731(string, is_224_, aStringArray1807,
					     class163s, 492018203);
	if (-1 == i_221_) {
	    i_221_ = i_215_ / i_220_;
	    if (i_221_ <= 0)
		i_221_ = 1;
	}
	if (i_221_ > 0 && i_225_ >= i_221_) {
	    aStringArray1807[i_221_ - 1]
		= aClass16_1796.method730(aStringArray1807[i_221_ - 1], i_214_,
					  class163s, (byte) 5);
	    i_225_ = i_221_;
	}
	if (3 == i_219_ && 1 == i_225_)
	    i_219_ = 1;
	int i_226_;
	if (0 == i_219_)
	    i_226_ = aClass16_1796.anInt190 * 102396103 + i_213_;
	else if (i_219_ == 1)
	    i_226_ = ((i_215_ - aClass16_1796.anInt190 * 102396103
		       - 728893755 * aClass16_1796.anInt189
		       - (i_225_ - 1) * i_220_) / 2
		      + (102396103 * aClass16_1796.anInt190 + i_213_));
	else if (2 == i_219_)
	    i_226_ = (i_213_ + i_215_ - 728893755 * aClass16_1796.anInt189
		      - i_220_ * (i_225_ - 1));
	else {
	    int i_227_ = ((i_215_ - aClass16_1796.anInt190 * 102396103
			   - 728893755 * aClass16_1796.anInt189
			   - i_220_ * (i_225_ - 1))
			  / (1 + i_225_));
	    if (i_227_ < 0)
		i_227_ = 0;
	    i_226_ = i_213_ + 102396103 * aClass16_1796.anInt190 + i_227_;
	    i_220_ += i_227_;
	}
	for (int i_228_ = 0; i_228_ < i_225_; i_228_++) {
	    if (i_218_ == 0)
		method2840(aStringArray1807[i_228_], i, i_226_, class163s, is,
			   class145, i_222_, i_223_, (short) 770);
	    else if (1 == i_218_)
		method2840(aStringArray1807[i_228_],
			   i + (i_214_
				- aClass16_1796.method728((aStringArray1807
							   [i_228_]),
							  -1333665117)) / 2,
			   i_226_, class163s, is, class145, i_222_, i_223_,
			   (short) 770);
	    else if (i_218_ == 2)
		method2840(aStringArray1807[i_228_],
			   (i_214_ + i
			    - aClass16_1796.method728(aStringArray1807[i_228_],
						      -506934569)),
			   i_226_, class163s, is, class145, i_222_, i_223_,
			   (short) 770);
	    else if (i_228_ == i_225_ - 1)
		method2840(aStringArray1807[i_228_], i, i_226_, class163s, is,
			   class145, i_222_, i_223_, (short) 770);
	    else {
		method2839(aStringArray1807[i_228_], i_214_, -1937903015);
		method2840(aStringArray1807[i_228_], i, i_226_, class163s, is,
			   class145, i_222_, i_223_, (short) 770);
		anInt1805 = 0;
	    }
	    i_226_ += i_220_;
	}
	return i_225_;
    }
    
    public void method2859(String string, int i, int i_229_, int i_230_,
			   int i_231_) {
	if (string != null) {
	    method2837(i_230_, i_231_, 1274986629);
	    method2840(string, i, i_229_, null, null, null, 0, 0, (short) 770);
	}
    }
    
    abstract void method2860(char c, int i, int i_232_, int i_233_,
			     boolean bool);
    
    public int method2861(String string, int i, int i_234_, int i_235_,
			  int i_236_, int i_237_, int i_238_, int i_239_,
			  int i_240_, int i_241_, int i_242_,
			  Class163[] class163s, int[] is, Class145 class145,
			  int i_243_, int i_244_, byte i_245_) {
	if (null == string)
	    return 0;
	method2837(i_237_, i_238_, 117072177);
	if (i_241_ == 0)
	    i_241_ = aClass16_1796.anInt187 * -1062735011;
	int[] is_246_;
	if (i_236_ < i_241_ + (728893755 * aClass16_1796.anInt189
			       + 102396103 * aClass16_1796.anInt190)
	    && i_236_ < i_241_ + i_241_)
	    is_246_ = null;
	else
	    is_246_ = new int[] { i_235_ };
	int i_247_ = aClass16_1796.method731(string, is_246_, aStringArray1807,
					     class163s, -345772152);
	if (-1 == i_242_) {
	    i_242_ = i_236_ / i_241_;
	    if (i_242_ <= 0)
		i_242_ = 1;
	}
	if (i_242_ > 0 && i_247_ >= i_242_) {
	    aStringArray1807[i_242_ - 1]
		= aClass16_1796.method730(aStringArray1807[i_242_ - 1], i_235_,
					  class163s, (byte) -76);
	    i_247_ = i_242_;
	}
	if (3 == i_240_ && 1 == i_247_)
	    i_240_ = 1;
	int i_248_;
	if (0 == i_240_)
	    i_248_ = aClass16_1796.anInt190 * 102396103 + i_234_;
	else if (i_240_ == 1)
	    i_248_ = ((i_236_ - aClass16_1796.anInt190 * 102396103
		       - 728893755 * aClass16_1796.anInt189
		       - (i_247_ - 1) * i_241_) / 2
		      + (102396103 * aClass16_1796.anInt190 + i_234_));
	else if (2 == i_240_)
	    i_248_ = (i_234_ + i_236_ - 728893755 * aClass16_1796.anInt189
		      - i_241_ * (i_247_ - 1));
	else {
	    int i_249_ = ((i_236_ - aClass16_1796.anInt190 * 102396103
			   - 728893755 * aClass16_1796.anInt189
			   - i_241_ * (i_247_ - 1))
			  / (1 + i_247_));
	    if (i_249_ < 0)
		i_249_ = 0;
	    i_248_ = i_234_ + 102396103 * aClass16_1796.anInt190 + i_249_;
	    i_241_ += i_249_;
	}
	for (int i_250_ = 0; i_250_ < i_247_; i_250_++) {
	    if (i_239_ == 0)
		method2840(aStringArray1807[i_250_], i, i_248_, class163s, is,
			   class145, i_243_, i_244_, (short) 770);
	    else if (1 == i_239_)
		method2840(aStringArray1807[i_250_],
			   i + (i_235_
				- aClass16_1796.method728((aStringArray1807
							   [i_250_]),
							  337037672)) / 2,
			   i_248_, class163s, is, class145, i_243_, i_244_,
			   (short) 770);
	    else if (i_239_ == 2)
		method2840(aStringArray1807[i_250_],
			   (i_235_ + i
			    - aClass16_1796.method728(aStringArray1807[i_250_],
						      335364658)),
			   i_248_, class163s, is, class145, i_243_, i_244_,
			   (short) 770);
	    else if (i_250_ == i_247_ - 1)
		method2840(aStringArray1807[i_250_], i, i_248_, class163s, is,
			   class145, i_243_, i_244_, (short) 770);
	    else {
		method2839(aStringArray1807[i_250_], i_235_, 1889015284);
		method2840(aStringArray1807[i_250_], i, i_248_, class163s, is,
			   class145, i_243_, i_244_, (short) 770);
		anInt1805 = 0;
	    }
	    i_248_ += i_241_;
	}
	return i_247_;
    }
    
    public void method2862(String string, int i, int i_251_, int i_252_,
			   int i_253_, int i_254_) {
	if (string != null) {
	    method2837(i_252_, i_253_, 134730080);
	    int i_255_ = string.length();
	    int[] is = new int[i_255_];
	    int[] is_256_ = new int[i_255_];
	    for (int i_257_ = 0; i_257_ < i_255_; i_257_++) {
		is[i_257_] = (int) (Math.sin((double) i_254_ / 5.0
					     + (double) i_257_ / 5.0)
				    * 5.0);
		is_256_[i_257_] = (int) (Math.sin((double) i_257_ / 3.0
						  + (double) i_254_ / 5.0)
					 * 5.0);
	    }
	    method2841(string,
		       i - aClass16_1796.method728(string, 613213644) / 2,
		       i_251_, null, null, is, is_256_, (byte) 3);
	}
    }
    
    public int method2863(String string, int i, int i_258_, int i_259_,
			  int i_260_, int i_261_, int i_262_, int i_263_,
			  int i_264_, Random random, int i_265_, int[] is,
			  Class163[] class163s, int[] is_266_) {
	if (null == string)
	    return 0;
	random.setSeed((long) i_265_);
	int i_267_ = 192 + (random.nextInt() & 0x1f);
	method2837(i_267_ << 24 | i_261_ & 0xffffff,
		   -1 == i_262_ ? 0 : i_267_ << 24 | i_262_ & 0xffffff,
		   1879149838);
	int i_268_ = string.length();
	int[] is_269_ = new int[i_268_];
	int i_270_ = 0;
	for (int i_271_ = 0; i_271_ < i_268_; i_271_++) {
	    is_269_[i_271_] = i_270_;
	    if ((random.nextInt() & 0x3) == 0)
		i_270_++;
	}
	int i_272_ = i;
	int i_273_ = 102396103 * aClass16_1796.anInt190 + i_258_;
	int i_274_ = -1;
	if (1 == i_264_)
	    i_273_ += (i_260_ - 102396103 * aClass16_1796.anInt190
		       - 728893755 * aClass16_1796.anInt189) / 2;
	else if (2 == i_264_)
	    i_273_ = i_260_ + i_258_ - 728893755 * aClass16_1796.anInt189;
	if (i_263_ == 1) {
	    i_274_ = aClass16_1796.method728(string, -1941910562) + i_270_;
	    i_272_ += (i_259_ - i_274_) / 2;
	} else if (i_263_ == 2) {
	    i_274_ = aClass16_1796.method728(string, -168308504) + i_270_;
	    i_272_ += i_259_ - i_274_;
	}
	method2841(string, i_272_, i_273_, class163s, is_266_, is_269_, null,
		   (byte) 65);
	if (null != is) {
	    if (i_274_ == -1)
		i_274_ = aClass16_1796.method728(string, 390298285) + i_270_;
	    is[0] = i_272_;
	    is[1] = i_273_ - 102396103 * aClass16_1796.anInt190;
	    is[2] = i_274_;
	    is[3] = (728893755 * aClass16_1796.anInt189
		     + 102396103 * aClass16_1796.anInt190);
	}
	return i_270_;
    }
    
    public void method2864(String string, int i, int i_275_, int i_276_,
			   int i_277_, int i_278_, int i_279_) {
	if (string != null) {
	    method2837(i_276_, i_277_, 1545445467);
	    double d = 7.0 - (double) i_279_ / 8.0;
	    if (d < 0.0)
		d = 0.0;
	    int i_280_ = string.length();
	    int[] is = new int[i_280_];
	    for (int i_281_ = 0; i_281_ < i_280_; i_281_++)
		is[i_281_] = (int) (Math.sin((double) i_281_ / 1.5
					     + (double) i_278_ / 1.0)
				    * d);
	    method2841(string,
		       i - aClass16_1796.method728(string, 705052799) / 2,
		       i_275_, null, null, null, is, (byte) 59);
	}
    }
    
    public void method2865(String string, int i, int i_282_, int i_283_,
			   int i_284_, int i_285_) {
	if (string != null) {
	    method2837(i_283_, i_284_, -2082225304);
	    int i_286_ = string.length();
	    int[] is = new int[i_286_];
	    int[] is_287_ = new int[i_286_];
	    for (int i_288_ = 0; i_288_ < i_286_; i_288_++) {
		is[i_288_] = (int) (Math.sin((double) i_285_ / 5.0
					     + (double) i_288_ / 5.0)
				    * 5.0);
		is_287_[i_288_] = (int) (Math.sin((double) i_288_ / 3.0
						  + (double) i_285_ / 5.0)
					 * 5.0);
	    }
	    method2841(string,
		       i - aClass16_1796.method728(string, -753434436) / 2,
		       i_282_, null, null, is, is_287_, (byte) 79);
	}
    }
    
    public int method2866(String string, int i, int i_289_, int i_290_,
			  int i_291_, int i_292_, int i_293_, int i_294_,
			  int i_295_, int i_296_, int i_297_,
			  Class163[] class163s, int[] is, Class145 class145,
			  int i_298_, int i_299_) {
	if (null == string)
	    return 0;
	method2837(i_292_, i_293_, 440455262);
	if (i_296_ == 0)
	    i_296_ = aClass16_1796.anInt187 * -1062735011;
	int[] is_300_;
	if (i_291_ < i_296_ + (728893755 * aClass16_1796.anInt189
			       + 102396103 * aClass16_1796.anInt190)
	    && i_291_ < i_296_ + i_296_)
	    is_300_ = null;
	else
	    is_300_ = new int[] { i_290_ };
	int i_301_ = aClass16_1796.method731(string, is_300_, aStringArray1807,
					     class163s, 122105933);
	if (-1 == i_297_) {
	    i_297_ = i_291_ / i_296_;
	    if (i_297_ <= 0)
		i_297_ = 1;
	}
	if (i_297_ > 0 && i_301_ >= i_297_) {
	    aStringArray1807[i_297_ - 1]
		= aClass16_1796.method730(aStringArray1807[i_297_ - 1], i_290_,
					  class163s, (byte) -68);
	    i_301_ = i_297_;
	}
	if (3 == i_295_ && 1 == i_301_)
	    i_295_ = 1;
	int i_302_;
	if (0 == i_295_)
	    i_302_ = aClass16_1796.anInt190 * 102396103 + i_289_;
	else if (i_295_ == 1)
	    i_302_ = ((i_291_ - aClass16_1796.anInt190 * 102396103
		       - 728893755 * aClass16_1796.anInt189
		       - (i_301_ - 1) * i_296_) / 2
		      + (102396103 * aClass16_1796.anInt190 + i_289_));
	else if (2 == i_295_)
	    i_302_ = (i_289_ + i_291_ - 728893755 * aClass16_1796.anInt189
		      - i_296_ * (i_301_ - 1));
	else {
	    int i_303_ = ((i_291_ - aClass16_1796.anInt190 * 102396103
			   - 728893755 * aClass16_1796.anInt189
			   - i_296_ * (i_301_ - 1))
			  / (1 + i_301_));
	    if (i_303_ < 0)
		i_303_ = 0;
	    i_302_ = i_289_ + 102396103 * aClass16_1796.anInt190 + i_303_;
	    i_296_ += i_303_;
	}
	for (int i_304_ = 0; i_304_ < i_301_; i_304_++) {
	    if (i_294_ == 0)
		method2840(aStringArray1807[i_304_], i, i_302_, class163s, is,
			   class145, i_298_, i_299_, (short) 770);
	    else if (1 == i_294_)
		method2840(aStringArray1807[i_304_],
			   i + (i_290_
				- aClass16_1796.method728((aStringArray1807
							   [i_304_]),
							  1907481864)) / 2,
			   i_302_, class163s, is, class145, i_298_, i_299_,
			   (short) 770);
	    else if (i_294_ == 2)
		method2840(aStringArray1807[i_304_],
			   (i_290_ + i
			    - aClass16_1796.method728(aStringArray1807[i_304_],
						      1214938076)),
			   i_302_, class163s, is, class145, i_298_, i_299_,
			   (short) 770);
	    else if (i_304_ == i_301_ - 1)
		method2840(aStringArray1807[i_304_], i, i_302_, class163s, is,
			   class145, i_298_, i_299_, (short) 770);
	    else {
		method2839(aStringArray1807[i_304_], i_290_, 802956860);
		method2840(aStringArray1807[i_304_], i, i_302_, class163s, is,
			   class145, i_298_, i_299_, (short) 770);
		anInt1805 = 0;
	    }
	    i_302_ += i_296_;
	}
	return i_301_;
    }
    
    public int method2867(String string, int i, int i_305_, int i_306_,
			  int i_307_, int i_308_, int i_309_, int i_310_,
			  int i_311_, Random random, int i_312_, int[] is,
			  Class163[] class163s, int[] is_313_) {
	if (null == string)
	    return 0;
	random.setSeed((long) i_312_);
	int i_314_ = 192 + (random.nextInt() & 0x1f);
	method2837(i_314_ << 24 | i_308_ & 0xffffff,
		   -1 == i_309_ ? 0 : i_314_ << 24 | i_309_ & 0xffffff,
		   625588561);
	int i_315_ = string.length();
	int[] is_316_ = new int[i_315_];
	int i_317_ = 0;
	for (int i_318_ = 0; i_318_ < i_315_; i_318_++) {
	    is_316_[i_318_] = i_317_;
	    if ((random.nextInt() & 0x3) == 0)
		i_317_++;
	}
	int i_319_ = i;
	int i_320_ = 102396103 * aClass16_1796.anInt190 + i_305_;
	int i_321_ = -1;
	if (1 == i_311_)
	    i_320_ += (i_307_ - 102396103 * aClass16_1796.anInt190
		       - 728893755 * aClass16_1796.anInt189) / 2;
	else if (2 == i_311_)
	    i_320_ = i_307_ + i_305_ - 728893755 * aClass16_1796.anInt189;
	if (i_310_ == 1) {
	    i_321_ = aClass16_1796.method728(string, 1620836579) + i_317_;
	    i_319_ += (i_306_ - i_321_) / 2;
	} else if (i_310_ == 2) {
	    i_321_ = aClass16_1796.method728(string, -1399187463) + i_317_;
	    i_319_ += i_306_ - i_321_;
	}
	method2841(string, i_319_, i_320_, class163s, is_313_, is_316_, null,
		   (byte) 26);
	if (null != is) {
	    if (i_321_ == -1)
		i_321_ = aClass16_1796.method728(string, -1523136032) + i_317_;
	    is[0] = i_319_;
	    is[1] = i_320_ - 102396103 * aClass16_1796.anInt190;
	    is[2] = i_321_;
	    is[3] = (728893755 * aClass16_1796.anInt189
		     + 102396103 * aClass16_1796.anInt190);
	}
	return i_317_;
    }
    
    void method2868(int i, int i_322_) {
	anInt1800 = 658379099;
	anInt1794 = 1043358759;
	anInt1802 = (anInt1801 = -17963335 * i) * -18968535;
	anInt1805 = 0;
	anInt1806 = 0;
	if (i_322_ == -1)
	    i_322_ = 0;
	anInt1799 = (anInt1803 = i_322_ * -360402663) * -323331121;
    }
    
    void method2869(int i, int i_323_) {
	anInt1800 = 658379099;
	anInt1794 = 1043358759;
	anInt1802 = (anInt1801 = -17963335 * i) * -18968535;
	anInt1805 = 0;
	anInt1806 = 0;
	if (i_323_ == -1)
	    i_323_ = 0;
	anInt1799 = (anInt1803 = i_323_ * -360402663) * -323331121;
    }
    
    void method2870(String string, int i) {
	try {
	    if (string.startsWith("col="))
		anInt1802 = ((-1624596383 * anInt1802 & ~0xffffff
			      | Class108.method1967(string.substring(4), 16,
						    -632198864) & 0xffffff)
			     * 1213203361);
	    else if (string.equals("/col"))
		anInt1802 = 1213203361 * (-1624596383 * anInt1802 & ~0xffffff
					  | anInt1801 * -903331959 & 0xffffff);
	    if (string.startsWith("argb="))
		anInt1802 = Class108.method1967(string.substring(5), 16,
						-671227558) * 1213203361;
	    else if (string.equals("/argb"))
		anInt1802 = anInt1801 * -18968535;
	    else if (string.startsWith("str="))
		anInt1800 = (-1624596383 * anInt1802 & ~0xffffff
			     | Class108.method1967(string.substring(4), 16,
						   1910587669)) * -658379099;
	    else if (string.equals("str"))
		anInt1800 = -658379099 * (-1624596383 * anInt1802 & ~0xffffff
					  | 0x800000);
	    else if (string.equals("/str"))
		anInt1800 = 658379099;
	    else if (string.startsWith("u="))
		anInt1794 = (anInt1802 * -1624596383 & ~0xffffff
			     | Class108.method1967(string.substring(2), 16,
						   -2030544707)) * -1043358759;
	    else if (string.equals("u"))
		anInt1794
		    = (-1624596383 * anInt1802 & ~0xffffff) * -1043358759;
	    else if (string.equals("/u"))
		anInt1794 = 1043358759;
	    else if (string.equalsIgnoreCase("shad=-1"))
		anInt1799 = 0;
	    else if (string.startsWith("shad="))
		anInt1799 = (anInt1802 * -1624596383 & ~0xffffff
			     | Class108.method1967(string.substring(5), 16,
						   1179255175)) * -2073487817;
	    else if (string.equals("shad"))
		anInt1799
		    = (anInt1802 * -1624596383 & ~0xffffff) * -2073487817;
	    else if (string.equals("/shad"))
		anInt1799 = -323331121 * anInt1803;
	    else if (string.equals("br"))
		method2837(anInt1801 * -903331959, 719461161 * anInt1803,
			   -806992578);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    static {
	anInt1794 = 1043358759;
	anInt1801 = 0;
	anInt1802 = 0;
	anInt1803 = 0;
	anInt1799 = 0;
	anInt1805 = 0;
	anInt1806 = 0;
	aStringArray1807 = new String[100];
    }
    
    void method2871(String string, int i) {
	int i_324_ = 0;
	boolean bool = false;
	for (int i_325_ = 0; i_325_ < string.length(); i_325_++) {
	    char c = string.charAt(i_325_);
	    if ('<' == c)
		bool = true;
	    else if (c == '>')
		bool = false;
	    else if (!bool && c == ' ')
		i_324_++;
	}
	if (i_324_ > 0)
	    anInt1805 = ((i - aClass16_1796.method728(string, 581935349) << 8)
			 / i_324_ * 1098032017);
    }
    
    void method2872(String string) {
	try {
	    if (string.startsWith("col="))
		anInt1802 = ((-1624596383 * anInt1802 & ~0xffffff
			      | Class108.method1967(string.substring(4), 16,
						    1747830789) & 0xffffff)
			     * 1213203361);
	    else if (string.equals("/col"))
		anInt1802 = 1213203361 * (-1624596383 * anInt1802 & ~0xffffff
					  | anInt1801 * -903331959 & 0xffffff);
	    if (string.startsWith("argb="))
		anInt1802 = Class108.method1967(string.substring(5), 16,
						120235794) * 1213203361;
	    else if (string.equals("/argb"))
		anInt1802 = anInt1801 * -18968535;
	    else if (string.startsWith("str="))
		anInt1800 = (-1624596383 * anInt1802 & ~0xffffff
			     | Class108.method1967(string.substring(4), 16,
						   -1353003200)) * -658379099;
	    else if (string.equals("str"))
		anInt1800 = -658379099 * (-1624596383 * anInt1802 & ~0xffffff
					  | 0x800000);
	    else if (string.equals("/str"))
		anInt1800 = 658379099;
	    else if (string.startsWith("u="))
		anInt1794 = (anInt1802 * -1624596383 & ~0xffffff
			     | Class108.method1967(string.substring(2), 16,
						   -1971207677)) * -1043358759;
	    else if (string.equals("u"))
		anInt1794
		    = (-1624596383 * anInt1802 & ~0xffffff) * -1043358759;
	    else if (string.equals("/u"))
		anInt1794 = 1043358759;
	    else if (string.equalsIgnoreCase("shad=-1"))
		anInt1799 = 0;
	    else if (string.startsWith("shad="))
		anInt1799 = (anInt1802 * -1624596383 & ~0xffffff
			     | Class108.method1967(string.substring(5), 16,
						   -27524729)) * -2073487817;
	    else if (string.equals("shad"))
		anInt1799
		    = (anInt1802 * -1624596383 & ~0xffffff) * -2073487817;
	    else if (string.equals("/shad"))
		anInt1799 = -323331121 * anInt1803;
	    else if (string.equals("br"))
		method2837(anInt1801 * -903331959, 719461161 * anInt1803,
			   2081652292);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    void method2873(String string) {
	try {
	    if (string.startsWith("col="))
		anInt1802 = ((-1624596383 * anInt1802 & ~0xffffff
			      | Class108.method1967(string.substring(4), 16,
						    1158223432) & 0xffffff)
			     * 1213203361);
	    else if (string.equals("/col"))
		anInt1802 = 1213203361 * (-1624596383 * anInt1802 & ~0xffffff
					  | anInt1801 * -903331959 & 0xffffff);
	    if (string.startsWith("argb="))
		anInt1802 = Class108.method1967(string.substring(5), 16,
						-1809094782) * 1213203361;
	    else if (string.equals("/argb"))
		anInt1802 = anInt1801 * -18968535;
	    else if (string.startsWith("str="))
		anInt1800 = (-1624596383 * anInt1802 & ~0xffffff
			     | Class108.method1967(string.substring(4), 16,
						   944531036)) * -658379099;
	    else if (string.equals("str"))
		anInt1800 = -658379099 * (-1624596383 * anInt1802 & ~0xffffff
					  | 0x800000);
	    else if (string.equals("/str"))
		anInt1800 = 658379099;
	    else if (string.startsWith("u="))
		anInt1794 = (anInt1802 * -1624596383 & ~0xffffff
			     | Class108.method1967(string.substring(2), 16,
						   -851264745)) * -1043358759;
	    else if (string.equals("u"))
		anInt1794
		    = (-1624596383 * anInt1802 & ~0xffffff) * -1043358759;
	    else if (string.equals("/u"))
		anInt1794 = 1043358759;
	    else if (string.equalsIgnoreCase("shad=-1"))
		anInt1799 = 0;
	    else if (string.startsWith("shad="))
		anInt1799 = (anInt1802 * -1624596383 & ~0xffffff
			     | Class108.method1967(string.substring(5), 16,
						   885759140)) * -2073487817;
	    else if (string.equals("shad"))
		anInt1799
		    = (anInt1802 * -1624596383 & ~0xffffff) * -2073487817;
	    else if (string.equals("/shad"))
		anInt1799 = -323331121 * anInt1803;
	    else if (string.equals("br"))
		method2837(anInt1801 * -903331959, 719461161 * anInt1803,
			   -1112941981);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    void method2874(String string, int i, int i_326_, Class163[] class163s,
		    int[] is, int[] is_327_, int[] is_328_) {
	i_326_ -= -1062735011 * aClass16_1796.anInt187;
	int i_329_ = -1;
	int i_330_ = -1;
	int i_331_ = 0;
	int i_332_ = string.length();
	for (int i_333_ = 0; i_333_ < i_332_; i_333_++) {
	    char c = (char) (Class542.method8950(string.charAt(i_333_),
						 -1388617471)
			     & 0xff);
	    if (60 == c)
		i_329_ = i_333_;
	    else {
		if (c == 62 && i_329_ != -1) {
		    String string_334_ = string.substring(1 + i_329_, i_333_);
		    i_329_ = -1;
		    if (string_334_.equals("lt"))
			c = '<';
		    else if (string_334_.equals("gt"))
			c = '>';
		    else if (string_334_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_334_.equals("shy"))
			c = '\u00ad';
		    else if (string_334_.equals("times"))
			c = '\u00d7';
		    else if (string_334_.equals("euro"))
			c = '\u0080';
		    else if (string_334_.equals("copy"))
			c = '\u00a9';
		    else if (string_334_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_334_.startsWith("img=")) {
			    try {
				int i_335_;
				if (null != is_327_)
				    i_335_ = is_327_[i_331_];
				else
				    i_335_ = 0;
				int i_336_;
				if (null != is_328_)
				    i_336_ = is_328_[i_331_];
				else
				    i_336_ = 0;
				i_331_++;
				int i_337_
				    = Class684.method13949(string_334_
							       .substring(4),
							   (byte) 77);
				Class163 class163 = class163s[i_337_];
				int i_338_ = (null != is ? is[i_337_]
					      : class163.method2692());
				class163.method2657(i_335_ + i,
						    i_336_ + (i_326_
							      + ((aClass16_1796
								  .anInt187)
								 * -1062735011)
							      - i_338_),
						    1, -1, 1);
				i += class163s[i_337_].method22();
				i_330_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_334_.startsWith("sprite=")) {
			    if (null != aClass16_1796.anInterface2_188) {
				try {
				    int i_339_ = -1;
				    int i_340_ = 0;
				    int i_341_ = string_334_.indexOf(',');
				    if (i_341_ == -1)
					i_339_ = (Class684.method13949
						  (string_334_.substring(7),
						   (byte) 67));
				    else {
					i_339_
					    = (Class684.method13949
					       (string_334_.substring(7,
								      i_341_),
						(byte) 101));
					i_340_ = (Class684.method13949
						  (string_334_
						       .substring(1 + i_341_),
						   (byte) 45));
				    }
				    int i_342_;
				    if (null != is_327_)
					i_342_ = is_327_[i_331_];
				    else
					i_342_ = 0;
				    int i_343_;
				    if (is_328_ != null)
					i_343_ = is_328_[i_331_];
				    else
					i_343_ = 0;
				    i_331_++;
				    Class163[] class163s_344_
					= (aClass16_1796.anInterface2_188
					       .method19
					   (aClass185_1804, i_339_,
					    1532128259));
				    if (null != class163s_344_) {
					int i_345_
					    = Math.min(class163s_344_
							   [i_340_]
							   .method2692(),
						       ((aClass16_1796.anInt189
							 * 728893755)
							+ (102396103
							   * (aClass16_1796
							      .anInt190))));
					class163s_344_[i_340_].method2657
					    (i + i_342_,
					     ((aClass16_1796.anInt187
					       * -1062735011)
					      + (3 + i_326_) - i_345_
					      + i_343_),
					     1, -1, 1);
					i += class163s_344_[i_340_].method22();
				    }
				    i_330_ = -1;
				} catch (Exception exception) {
				    /* empty */
				}
			    }
			} else
			    method2870(string_334_, 349400237);
			continue;
		    }
		}
		if (i_329_ == -1) {
		    if (i_330_ != -1)
			i += aClass16_1796.method756(i_330_, c, 746244093);
		    int i_346_;
		    if (is_327_ != null)
			i_346_ = is_327_[i_331_];
		    else
			i_346_ = 0;
		    int i_347_;
		    if (is_328_ != null)
			i_347_ = is_328_[i_331_];
		    else
			i_347_ = 0;
		    i_331_++;
		    if (c != 32) {
			if (0 != (anInt1799 * 32538503 & ~0xffffff))
			    method2860(c, 1 + i + i_346_, i_326_ + 1 + i_347_,
				       32538503 * anInt1799, true);
			method2860(c, i + i_346_, i_347_ + i_326_,
				   -1624596383 * anInt1802, false);
		    } else if (-1509393039 * anInt1805 > 0) {
			anInt1806 += anInt1805 * 1273476081;
			i += anInt1806 * 1931534721 >> 8;
			anInt1806
			    = (anInt1806 * 1931534721 & 0xff) * -668901759;
		    }
		    int i_348_ = aClass16_1796.method726(c, -15406808);
		    if (-1 != -1699985107 * anInt1800)
			aClass185_1804.method3294
			    (i,
			     (i_326_
			      + (int) ((double) (-1062735011
						 * aClass16_1796.anInt187)
				       * 0.7)),
			     i_348_, -1699985107 * anInt1800, 1471527069);
		    if (1310274665 * anInt1794 != -1)
			aClass185_1804.method3294
			    (i, -1062735011 * aClass16_1796.anInt187 + i_326_,
			     i_348_, anInt1794 * 1310274665, -318325859);
		    i += i_348_;
		    i_330_ = c;
		}
	    }
	}
    }
    
    void method2875(String string, int i) {
	int i_349_ = 0;
	boolean bool = false;
	for (int i_350_ = 0; i_350_ < string.length(); i_350_++) {
	    char c = string.charAt(i_350_);
	    if ('<' == c)
		bool = true;
	    else if (c == '>')
		bool = false;
	    else if (!bool && c == ' ')
		i_349_++;
	}
	if (i_349_ > 0)
	    anInt1805 = ((i - aClass16_1796.method728(string, 666172454) << 8)
			 / i_349_ * 1098032017);
    }
    
    void method2876(String string, int i, int i_351_, Class163[] class163s,
		    int[] is, Class145 class145, int i_352_, int i_353_) {
	i_351_ -= aClass16_1796.anInt187 * -1062735011;
	int i_354_ = -1;
	int i_355_ = -1;
	int i_356_ = string.length();
	for (int i_357_ = 0; i_357_ < i_356_; i_357_++) {
	    char c = (char) (Class542.method8950(string.charAt(i_357_),
						 -760704280)
			     & 0xff);
	    if (60 == c)
		i_354_ = i_357_;
	    else {
		if (c == 62 && -1 != i_354_) {
		    String string_358_ = string.substring(i_354_ + 1, i_357_);
		    i_354_ = -1;
		    if (string_358_.equals("lt"))
			c = '<';
		    else if (string_358_.equals("gt"))
			c = '>';
		    else if (string_358_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_358_.equals("shy"))
			c = '\u00ad';
		    else if (string_358_.equals("times"))
			c = '\u00d7';
		    else if (string_358_.equals("euro"))
			c = '\u0080';
		    else if (string_358_.equals("copy"))
			c = '\u00a9';
		    else if (string_358_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_358_.startsWith("img=")) {
			    try {
				int i_359_
				    = Class684.method13949(string_358_
							       .substring(4),
							   (byte) 127);
				Class163 class163 = class163s[i_359_];
				int i_360_ = (null != is ? is[i_359_]
					      : class163.method2692());
				if (-16777216
				    == (anInt1802 * -1624596383 & ~0xffffff))
				    class163.method2657(i,
							(((aClass16_1796
							   .anInt187)
							  * -1062735011)
							 + i_351_ - i_360_),
							1, -1, 1);
				else
				    class163.method2657
					(i,
					 i_351_ + (aClass16_1796.anInt187
						   * -1062735011) - i_360_,
					 0,
					 (anInt1802 * -1624596383 & ~0xffffff
					  | 0xffffff),
					 1);
				i += class163s[i_359_].method22();
				i_355_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_358_.startsWith("sprite=")) {
			    if (aClass16_1796.anInterface2_188 != null) {
				try {
				    int i_361_ = -1;
				    int i_362_ = 0;
				    int i_363_ = string_358_.indexOf(',');
				    if (i_363_ == -1)
					i_361_ = (Class684.method13949
						  (string_358_.substring(7),
						   (byte) 32));
				    else {
					i_361_
					    = (Class684.method13949
					       (string_358_.substring(7,
								      i_363_),
						(byte) 94));
					i_362_ = (Class684.method13949
						  (string_358_
						       .substring(1 + i_363_),
						   (byte) 68));
				    }
				    Class163[] class163s_364_
					= (aClass16_1796.anInterface2_188
					       .method19
					   (aClass185_1804, i_361_,
					    1532128259));
				    if (null != class163s_364_) {
					int i_365_
					    = Math.min(class163s_364_
							   [i_362_]
							   .method2692(),
						       ((aClass16_1796.anInt189
							 * 728893755)
							+ (102396103
							   * (aClass16_1796
							      .anInt190))));
					if ((-1624596383 * anInt1802
					     & ~0xffffff)
					    == -16777216)
					    class163s_364_[i_362_].method2657
						(i, (2 + i_351_
						     + (aClass16_1796.anInt187
							* -1062735011)
						     - i_365_), 1, -1, 1);
					else
					    class163s_364_[i_362_].method2657
						(i,
						 ((-1062735011
						   * aClass16_1796.anInt187)
						  + (2 + i_351_) - i_365_),
						 0,
						 (anInt1802 * -1624596383
						  & ~0xffffff) | 0xffffff,
						 1);
					i += class163s_364_[i_362_].method22();
				    }
				    i_355_ = -1;
				} catch (Exception exception) {
				    /* empty */
				}
			    }
			} else
			    method2870(string_358_, 566919748);
			continue;
		    }
		}
		if (-1 == i_354_) {
		    if (-1 != i_355_)
			i += aClass16_1796.method756(i_355_, c, 2015103229);
		    if (32 != c) {
			if (class145 == null) {
			    if ((32538503 * anInt1799 & ~0xffffff) != 0)
				method2860(c, 1 + i, 1 + i_351_,
					   32538503 * anInt1799, true);
			    method2860(c, i, i_351_, anInt1802 * -1624596383,
				       false);
			} else {
			    if ((anInt1799 * 32538503 & ~0xffffff) != 0)
				method2877(c, 1 + i, 1 + i_351_,
					   32538503 * anInt1799, true,
					   class145, i_352_, i_353_);
			    method2877(c, i, i_351_, anInt1802 * -1624596383,
				       false, class145, i_352_, i_353_);
			}
		    } else if (-1509393039 * anInt1805 > 0) {
			anInt1806 += anInt1805 * 1273476081;
			i += anInt1806 * 1931534721 >> 8;
			anInt1806
			    = (anInt1806 * 1931534721 & 0xff) * -668901759;
		    }
		    int i_366_ = aClass16_1796.method726(c, -1085271688);
		    if (-1 != anInt1800 * -1699985107)
			aClass185_1804.method3294
			    (i,
			     ((int) (0.7 * (double) (-1062735011
						     * aClass16_1796.anInt187))
			      + i_351_),
			     i_366_, anInt1800 * -1699985107, 1217641775);
		    if (1310274665 * anInt1794 != -1)
			aClass185_1804.method3294(i,
						  (aClass16_1796.anInt187
						   * -1062735011) + i_351_ + 1,
						  i_366_,
						  1310274665 * anInt1794,
						  -1794080020);
		    i += i_366_;
		    i_355_ = c;
		}
	    }
	}
    }
    
    abstract void method2877(char c, int i, int i_367_, int i_368_,
			     boolean bool, Class145 class145, int i_369_,
			     int i_370_);
    
    public void method2878(String string, int i, int i_371_, int i_372_,
			   int i_373_, int i_374_) {
	if (string != null) {
	    method2837(i_372_, i_373_, -1800473926);
	    int i_375_ = string.length();
	    int[] is = new int[i_375_];
	    int[] is_376_ = new int[i_375_];
	    for (int i_377_ = 0; i_377_ < i_375_; i_377_++) {
		is[i_377_] = (int) (Math.sin((double) i_374_ / 5.0
					     + (double) i_377_ / 5.0)
				    * 5.0);
		is_376_[i_377_] = (int) (Math.sin((double) i_377_ / 3.0
						  + (double) i_374_ / 5.0)
					 * 5.0);
	    }
	    method2841(string,
		       i - aClass16_1796.method728(string, -467561581) / 2,
		       i_371_, null, null, is, is_376_, (byte) 39);
	}
    }
    
    void method2879(String string, int i, int i_378_, Class163[] class163s,
		    int[] is, int[] is_379_, int[] is_380_) {
	i_378_ -= -1062735011 * aClass16_1796.anInt187;
	int i_381_ = -1;
	int i_382_ = -1;
	int i_383_ = 0;
	int i_384_ = string.length();
	for (int i_385_ = 0; i_385_ < i_384_; i_385_++) {
	    char c
		= (char) (Class542.method8950(string.charAt(i_385_), 47437388)
			  & 0xff);
	    if (60 == c)
		i_381_ = i_385_;
	    else {
		if (c == 62 && i_381_ != -1) {
		    String string_386_ = string.substring(1 + i_381_, i_385_);
		    i_381_ = -1;
		    if (string_386_.equals("lt"))
			c = '<';
		    else if (string_386_.equals("gt"))
			c = '>';
		    else if (string_386_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_386_.equals("shy"))
			c = '\u00ad';
		    else if (string_386_.equals("times"))
			c = '\u00d7';
		    else if (string_386_.equals("euro"))
			c = '\u0080';
		    else if (string_386_.equals("copy"))
			c = '\u00a9';
		    else if (string_386_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_386_.startsWith("img=")) {
			    try {
				int i_387_;
				if (null != is_379_)
				    i_387_ = is_379_[i_383_];
				else
				    i_387_ = 0;
				int i_388_;
				if (null != is_380_)
				    i_388_ = is_380_[i_383_];
				else
				    i_388_ = 0;
				i_383_++;
				int i_389_
				    = Class684.method13949(string_386_
							       .substring(4),
							   (byte) 51);
				Class163 class163 = class163s[i_389_];
				int i_390_ = (null != is ? is[i_389_]
					      : class163.method2692());
				class163.method2657(i_387_ + i,
						    i_388_ + (i_378_
							      + ((aClass16_1796
								  .anInt187)
								 * -1062735011)
							      - i_390_),
						    1, -1, 1);
				i += class163s[i_389_].method22();
				i_382_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_386_.startsWith("sprite=")) {
			    if (null != aClass16_1796.anInterface2_188) {
				try {
				    int i_391_ = -1;
				    int i_392_ = 0;
				    int i_393_ = string_386_.indexOf(',');
				    if (i_393_ == -1)
					i_391_ = (Class684.method13949
						  (string_386_.substring(7),
						   (byte) 108));
				    else {
					i_391_
					    = (Class684.method13949
					       (string_386_.substring(7,
								      i_393_),
						(byte) 67));
					i_392_ = (Class684.method13949
						  (string_386_
						       .substring(1 + i_393_),
						   (byte) 61));
				    }
				    int i_394_;
				    if (null != is_379_)
					i_394_ = is_379_[i_383_];
				    else
					i_394_ = 0;
				    int i_395_;
				    if (is_380_ != null)
					i_395_ = is_380_[i_383_];
				    else
					i_395_ = 0;
				    i_383_++;
				    Class163[] class163s_396_
					= (aClass16_1796.anInterface2_188
					       .method19
					   (aClass185_1804, i_391_,
					    1532128259));
				    if (null != class163s_396_) {
					int i_397_
					    = Math.min(class163s_396_
							   [i_392_]
							   .method2692(),
						       ((aClass16_1796.anInt189
							 * 728893755)
							+ (102396103
							   * (aClass16_1796
							      .anInt190))));
					class163s_396_[i_392_].method2657
					    (i + i_394_,
					     ((aClass16_1796.anInt187
					       * -1062735011)
					      + (3 + i_378_) - i_397_
					      + i_395_),
					     1, -1, 1);
					i += class163s_396_[i_392_].method22();
				    }
				    i_382_ = -1;
				} catch (Exception exception) {
				    /* empty */
				}
			    }
			} else
			    method2870(string_386_, -769356698);
			continue;
		    }
		}
		if (i_381_ == -1) {
		    if (i_382_ != -1)
			i += aClass16_1796.method756(i_382_, c, 1128879073);
		    int i_398_;
		    if (is_379_ != null)
			i_398_ = is_379_[i_383_];
		    else
			i_398_ = 0;
		    int i_399_;
		    if (is_380_ != null)
			i_399_ = is_380_[i_383_];
		    else
			i_399_ = 0;
		    i_383_++;
		    if (c != 32) {
			if (0 != (anInt1799 * 32538503 & ~0xffffff))
			    method2860(c, 1 + i + i_398_, i_378_ + 1 + i_399_,
				       32538503 * anInt1799, true);
			method2860(c, i + i_398_, i_399_ + i_378_,
				   -1624596383 * anInt1802, false);
		    } else if (-1509393039 * anInt1805 > 0) {
			anInt1806 += anInt1805 * 1273476081;
			i += anInt1806 * 1931534721 >> 8;
			anInt1806
			    = (anInt1806 * 1931534721 & 0xff) * -668901759;
		    }
		    int i_400_ = aClass16_1796.method726(c, -819854499);
		    if (-1 != -1699985107 * anInt1800)
			aClass185_1804.method3294
			    (i,
			     (i_378_
			      + (int) ((double) (-1062735011
						 * aClass16_1796.anInt187)
				       * 0.7)),
			     i_400_, -1699985107 * anInt1800, 1424188394);
		    if (1310274665 * anInt1794 != -1)
			aClass185_1804.method3294
			    (i, -1062735011 * aClass16_1796.anInt187 + i_378_,
			     i_400_, anInt1794 * 1310274665, 647949887);
		    i += i_400_;
		    i_382_ = c;
		}
	    }
	}
    }
    
    public static Container method2880(short i) {
	if (null != Class29.aFrame266)
	    return Class29.aFrame266;
	if (null != Class452.aFrame4943)
	    return Class452.aFrame4943;
	return Class305.anApplet3271;
    }
    
    public static Class505 method2881
	(int i, int i_401_, int i_402_, int i_403_, Interface14 interface14,
	 Interface14 interface14_404_, int i_405_) {
	Class516[] class516s = null;
	Class582 class582 = (Class582) interface14.method91(i, 1343015367);
	if (class582.anIntArray7766 != null) {
	    class516s = new Class516[class582.anIntArray7766.length];
	    for (int i_406_ = 0; i_406_ < class516s.length; i_406_++) {
		Class299 class299
		    = ((Class299)
		       interface14_404_.method91((class582.anIntArray7766
						  [i_406_]),
						 748054894));
		class516s[i_406_]
		    = new Class516(class299.anInt3214 * -1842236195,
				   class299.anInt3219 * -970761915,
				   class299.anInt3212 * -768505479,
				   -626850589 * class299.anInt3213,
				   -1997297471 * class299.anInt3216,
				   class299.anInt3210 * -154850755,
				   class299.anInt3217 * 565548279,
				   class299.aBool3215,
				   class299.anInt3218 * 950333711,
				   943734367 * class299.anInt3211,
				   class299.anInt3220 * -1786753521);
	    }
	}
	return new Class505(2085042865 * class582.anInt7770, class516s,
			    1576956907 * class582.anInt7768, i_401_, i_402_,
			    i_403_, class582.aClass571_7769,
			    class582.anInt7767 * 761892639);
    }
    
    static final void method2882(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	int i_407_ = (class669.anIntArray8595
		      [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (i_407_ != class247.anInt2524 * 1565138829) {
	    if (i_407_ != -1) {
		if (null == class247.aClass711_2442)
		    class247.aClass711_2442 = new Class711_Sub2();
		class247.aClass711_2442.method14330(i_407_, 1329267312);
	    } else
		class247.aClass711_2442 = null;
	    class247.anInt2524 = i_407_ * -1933558971;
	    Class454.method7416(class247, -408600483);
	}
	if (1365669833 * class247.anInt2580 == -1 && !class243.aBool2413)
	    Class200_Sub17.method15616(-1278450723 * class247.anInt2454,
				       (byte) 1);
    }
    
    static final void method2883(Class669 class669, int i) {
	Class658.method10912(Class175_Sub2_Sub1.method17936(134686650),
			     class669, (short) 16383);
    }
    
    static final void method2884(Class669 class669, short i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class669.aClass352_8602.anInt3622 * -1507311497;
    }
    
    static final void method2885(Class669 class669, int i) {
	throw new RuntimeException("");
    }
    
    static void method2886(String string, int i) {
	client.aString11130 = string;
	if (Class309.method5657((byte) 100) != Class508.aClass508_5669) {
	    try {
		String string_408_
		    = Class305.anApplet3271
			  .getParameter(Class408.aClass408_4337.aString4365);
		String string_409_
		    = Class305.anApplet3271
			  .getParameter(Class408.aClass408_4338.aString4365);
		String string_410_
		    = new StringBuilder().append(string_408_).append
			  ("settings=").append
			  (string).append
			  ("; version=1; path=/; domain=").append
			  (string_409_).toString();
		if (string.length() == 0)
		    string_410_
			= new StringBuilder().append(string_410_).append
			      ("; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0")
			      .toString();
		else
		    string_410_
			= new StringBuilder().append(string_410_).append
			      ("; Expires=").append
			      (Class341.method5950(Class250
						       .method4604((byte) -40)
						   + 94608000000L))
			      .append
			      ("; Max-Age=").append
			      (94608000L).toString();
		Class31.method888(Class305.anApplet3271,
				  new StringBuilder().append
				      ("document.cookie=\"").append
				      (string_410_).append
				      ("\"").toString(),
				  (byte) 19);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
    }
}
