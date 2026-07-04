/* Class151 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class151
{
    public int anInt1700;
    public int anInt1701;
    public int anInt1702;
    public int anInt1703;
    public int[][] anIntArrayArray1704;
    public static int anInt1705;
    
    public final int method2491(int i, int i_0_, int i_1_) {
	return anIntArrayArray1704[i][i_0_];
    }
    
    public abstract void method2492(int i, int i_2_, int i_3_);
    
    public abstract void method2493(int i, int i_4_, int[] is, int[] is_5_,
				    int[] is_6_, int[] is_7_, int[] is_8_,
				    int[] is_9_, int[] is_10_, int[] is_11_,
				    Class166 class166, boolean bool);
    
    public abstract void method2494
	(int i, int i_12_, int[] is, int[] is_13_, int[] is_14_, int[] is_15_,
	 int[] is_16_, int[] is_17_, int[] is_18_, int[] is_19_, int[] is_20_,
	 int[] is_21_, int[] is_22_, Class166 class166, boolean bool);
    
    public abstract void method2495();
    
    public abstract void method2496(Class534_Sub21 class534_sub21, int[] is);
    
    public abstract boolean method2497
	(Class534_Sub18_Sub16 class534_sub18_sub16, int i, int i_23_,
	 int i_24_, int i_25_, boolean bool);
    
    public final int method2498(int i, int i_26_, int i_27_) {
	int i_28_ = i >> anInt1703 * -1495101509;
	int i_29_ = i_26_ >> anInt1703 * -1495101509;
	if (i_28_ < 0 || i_29_ < 0 || i_28_ > -1924295585 * anInt1701 - 1
	    || i_29_ > anInt1700 * -1466328823 - 1)
	    return 0;
	int i_30_ = i & anInt1702 * 127780559 - 1;
	int i_31_ = i_26_ & 127780559 * anInt1702 - 1;
	int i_32_ = ((i_30_ * anIntArrayArray1704[i_28_ + 1][i_29_]
		      + ((127780559 * anInt1702 - i_30_)
			 * anIntArrayArray1704[i_28_][i_29_]))
		     >> -1495101509 * anInt1703);
	int i_33_
	    = ((anIntArrayArray1704[i_28_][i_29_ + 1] * (anInt1702 * 127780559
							 - i_30_)
		+ i_30_ * anIntArrayArray1704[i_28_ + 1][i_29_ + 1])
	       >> anInt1703 * -1495101509);
	return (i_33_ * i_31_ + (anInt1702 * 127780559 - i_31_) * i_32_
		>> anInt1703 * -1495101509);
    }
    
    public final int method2499(int i, int i_34_, int i_35_) {
	return (anIntArrayArray1704
		[Math.min(anInt1701 * -1924295585 - 1, Math.max(0, i))]
		[Math.min(anInt1700 * -1466328823 - 1, Math.max(0, i_34_))]);
    }
    
    Class151(int i, int i_36_, int i_37_, int[][] is) {
	anInt1701 = -1150957665 * i;
	anInt1700 = i_36_ * -637418183;
	int i_38_ = 0;
	for (/**/; i_37_ > 1; i_37_ >>= 1)
	    i_38_++;
	anInt1702 = 126844975 * (1 << i_38_);
	anInt1703 = i_38_ * 933223795;
	anIntArrayArray1704 = is;
    }
    
    public abstract void method2500(int i, int i_39_, int i_40_,
				    boolean[][] bools, boolean bool,
				    int i_41_);
    
    public abstract Class534_Sub18_Sub16 method2501
	(int i, int i_42_, Class534_Sub18_Sub16 class534_sub18_sub16);
    
    public abstract void method2502(Class534_Sub18_Sub16 class534_sub18_sub16,
				    int i, int i_43_, int i_44_, int i_45_,
				    boolean bool);
    
    public abstract void method2503(Class534_Sub18_Sub16 class534_sub18_sub16,
				    int i, int i_46_, int i_47_, int i_48_,
				    boolean bool);
    
    public abstract boolean method2504
	(Class534_Sub18_Sub16 class534_sub18_sub16, int i, int i_49_,
	 int i_50_, int i_51_, boolean bool);
    
    public abstract void method2505(Class534_Sub18_Sub16 class534_sub18_sub16,
				    int i, int i_52_, int i_53_, int i_54_,
				    boolean bool);
    
    public abstract void method2506(int i, int i_55_, int i_56_,
				    boolean[][] bools, boolean bool,
				    int i_57_);
    
    public abstract void method2507(int i, int i_58_, int i_59_);
    
    public abstract void method2508(int i, int i_60_, int i_61_);
    
    public abstract void method2509(int i, int i_62_, int i_63_);
    
    public abstract void method2510
	(int i, int i_64_, int[] is, int[] is_65_, int[] is_66_, int[] is_67_,
	 int[] is_68_, int[] is_69_, int[] is_70_, int[] is_71_, int[] is_72_,
	 int[] is_73_, int[] is_74_, Class166 class166, boolean bool);
    
    public abstract void method2511(int i, int i_75_, int i_76_);
    
    public abstract void method2512();
    
    public abstract void method2513(Class534_Sub18_Sub16 class534_sub18_sub16,
				    int i, int i_77_, int i_78_, int i_79_,
				    boolean bool);
    
    public abstract void method2514(int i, int i_80_, int i_81_,
				    boolean[][] bools, boolean bool,
				    int i_82_);
    
    public abstract void method2515(int i, int i_83_, int i_84_,
				    boolean[][] bools, boolean bool,
				    int i_85_);
    
    public abstract void method2516(int i, int i_86_, int i_87_,
				    boolean[][] bools, boolean bool,
				    int i_88_);
    
    public abstract void method2517(int i, int i_89_, int i_90_,
				    boolean[][] bools, boolean bool,
				    int i_91_);
    
    public abstract void method2518(Class534_Sub18_Sub16 class534_sub18_sub16,
				    int i, int i_92_, int i_93_, int i_94_,
				    boolean bool);
    
    public abstract void method2519(int i, int i_95_, int i_96_, int i_97_,
				    int i_98_, int i_99_, int i_100_,
				    boolean[][] bools);
    
    public abstract Class534_Sub18_Sub16 method2520
	(int i, int i_101_, Class534_Sub18_Sub16 class534_sub18_sub16);
    
    public final int method2521(int i, int i_102_, int i_103_) {
	int i_104_ = i >> anInt1703 * -1495101509;
	int i_105_ = i_102_ >> -1495101509 * anInt1703;
	i_104_ = Math.min(anInt1701 * -1924295585 - 1, Math.max(0, i_104_));
	i_105_ = Math.min(anInt1700 * -1466328823 - 1, Math.max(0, i_105_));
	int i_106_ = Math.min(anInt1701 * -1924295585 - 1, i_104_ + 1);
	int i_107_ = Math.min(anInt1700 * -1466328823 - 1, i_105_ + 1);
	int i_108_ = i & anInt1702 * 127780559 - 1;
	int i_109_ = i_102_ & 127780559 * anInt1702 - 1;
	int i_110_
	    = ((anIntArrayArray1704[i_104_][i_105_] * (anInt1702 * 127780559
						       - i_108_)
		+ i_108_ * anIntArrayArray1704[i_106_][i_105_])
	       >> anInt1703 * -1495101509);
	int i_111_ = ((i_108_ * anIntArrayArray1704[i_106_][i_107_]
		       + ((anInt1702 * 127780559 - i_108_)
			  * anIntArrayArray1704[i_104_][i_107_]))
		      >> anInt1703 * -1495101509);
	return ((127780559 * anInt1702 - i_109_) * i_110_ + i_109_ * i_111_
		>> anInt1703 * -1495101509);
    }
    
    public abstract Class534_Sub18_Sub16 method2522
	(int i, int i_112_, Class534_Sub18_Sub16 class534_sub18_sub16);
    
    public abstract void method2523
	(int i, int i_113_, int[] is, int[] is_114_, int[] is_115_,
	 int[] is_116_, int[] is_117_, int[] is_118_, int[] is_119_,
	 int[] is_120_, Class166 class166, boolean bool);
    
    public abstract Class534_Sub18_Sub16 method2524
	(int i, int i_121_, Class534_Sub18_Sub16 class534_sub18_sub16);
    
    public abstract Class534_Sub18_Sub16 method2525
	(int i, int i_122_, Class534_Sub18_Sub16 class534_sub18_sub16);
    
    public abstract Class534_Sub18_Sub16 method2526
	(int i, int i_123_, Class534_Sub18_Sub16 class534_sub18_sub16);
    
    public abstract void method2527(int i, int i_124_, int i_125_, int i_126_,
				    int i_127_, int i_128_, int i_129_,
				    boolean[][] bools);
    
    public abstract Class534_Sub18_Sub16 method2528
	(int i, int i_130_, Class534_Sub18_Sub16 class534_sub18_sub16);
    
    public abstract void method2529(Class534_Sub18_Sub16 class534_sub18_sub16,
				    int i, int i_131_, int i_132_, int i_133_,
				    boolean bool);
    
    public abstract void method2530(Class534_Sub21 class534_sub21, int[] is);
    
    public abstract void method2531(Class534_Sub18_Sub16 class534_sub18_sub16,
				    int i, int i_134_, int i_135_, int i_136_,
				    boolean bool);
    
    public abstract void method2532(Class534_Sub18_Sub16 class534_sub18_sub16,
				    int i, int i_137_, int i_138_, int i_139_,
				    boolean bool);
    
    public abstract void method2533(int i, int i_140_, int i_141_,
				    boolean[][] bools, boolean bool,
				    int i_142_);
    
    public final int method2534(int i, int i_143_) {
	int i_144_ = i >> anInt1703 * -1495101509;
	int i_145_ = i_143_ >> anInt1703 * -1495101509;
	if (i_144_ < 0 || i_145_ < 0 || i_144_ > -1924295585 * anInt1701 - 1
	    || i_145_ > anInt1700 * -1466328823 - 1)
	    return 0;
	int i_146_ = i & anInt1702 * 127780559 - 1;
	int i_147_ = i_143_ & 127780559 * anInt1702 - 1;
	int i_148_ = ((i_146_ * anIntArrayArray1704[i_144_ + 1][i_145_]
		       + ((127780559 * anInt1702 - i_146_)
			  * anIntArrayArray1704[i_144_][i_145_]))
		      >> -1495101509 * anInt1703);
	int i_149_ = (((anIntArrayArray1704[i_144_][i_145_ + 1]
			* (anInt1702 * 127780559 - i_146_))
		       + i_146_ * anIntArrayArray1704[i_144_ + 1][i_145_ + 1])
		      >> anInt1703 * -1495101509);
	return (i_149_ * i_147_ + (anInt1702 * 127780559 - i_147_) * i_148_
		>> anInt1703 * -1495101509);
    }
    
    public final int method2535(int i, int i_150_) {
	int i_151_ = i >> anInt1703 * -1495101509;
	int i_152_ = i_150_ >> anInt1703 * -1495101509;
	if (i_151_ < 0 || i_152_ < 0 || i_151_ > -1924295585 * anInt1701 - 1
	    || i_152_ > anInt1700 * -1466328823 - 1)
	    return 0;
	int i_153_ = i & anInt1702 * 127780559 - 1;
	int i_154_ = i_150_ & 127780559 * anInt1702 - 1;
	int i_155_ = ((i_153_ * anIntArrayArray1704[i_151_ + 1][i_152_]
		       + ((127780559 * anInt1702 - i_153_)
			  * anIntArrayArray1704[i_151_][i_152_]))
		      >> -1495101509 * anInt1703);
	int i_156_ = (((anIntArrayArray1704[i_151_][i_152_ + 1]
			* (anInt1702 * 127780559 - i_153_))
		       + i_153_ * anIntArrayArray1704[i_151_ + 1][i_152_ + 1])
		      >> anInt1703 * -1495101509);
	return (i_156_ * i_154_ + (anInt1702 * 127780559 - i_154_) * i_155_
		>> anInt1703 * -1495101509);
    }
    
    public final int method2536(int i, int i_157_) {
	int i_158_ = i >> anInt1703 * -1495101509;
	int i_159_ = i_157_ >> -1495101509 * anInt1703;
	i_158_ = Math.min(anInt1701 * -1924295585 - 1, Math.max(0, i_158_));
	i_159_ = Math.min(anInt1700 * -1466328823 - 1, Math.max(0, i_159_));
	int i_160_ = Math.min(anInt1701 * -1924295585 - 1, i_158_ + 1);
	int i_161_ = Math.min(anInt1700 * -1466328823 - 1, i_159_ + 1);
	int i_162_ = i & anInt1702 * 127780559 - 1;
	int i_163_ = i_157_ & 127780559 * anInt1702 - 1;
	int i_164_
	    = ((anIntArrayArray1704[i_158_][i_159_] * (anInt1702 * 127780559
						       - i_162_)
		+ i_162_ * anIntArrayArray1704[i_160_][i_159_])
	       >> anInt1703 * -1495101509);
	int i_165_ = ((i_162_ * anIntArrayArray1704[i_160_][i_161_]
		       + ((anInt1702 * 127780559 - i_162_)
			  * anIntArrayArray1704[i_158_][i_161_]))
		      >> anInt1703 * -1495101509);
	return ((127780559 * anInt1702 - i_163_) * i_164_ + i_163_ * i_165_
		>> anInt1703 * -1495101509);
    }
    
    public final int method2537(int i, int i_166_) {
	int i_167_ = i >> anInt1703 * -1495101509;
	int i_168_ = i_166_ >> -1495101509 * anInt1703;
	i_167_ = Math.min(anInt1701 * -1924295585 - 1, Math.max(0, i_167_));
	i_168_ = Math.min(anInt1700 * -1466328823 - 1, Math.max(0, i_168_));
	int i_169_ = Math.min(anInt1701 * -1924295585 - 1, i_167_ + 1);
	int i_170_ = Math.min(anInt1700 * -1466328823 - 1, i_168_ + 1);
	int i_171_ = i & anInt1702 * 127780559 - 1;
	int i_172_ = i_166_ & 127780559 * anInt1702 - 1;
	int i_173_
	    = ((anIntArrayArray1704[i_167_][i_168_] * (anInt1702 * 127780559
						       - i_171_)
		+ i_171_ * anIntArrayArray1704[i_169_][i_168_])
	       >> anInt1703 * -1495101509);
	int i_174_ = ((i_171_ * anIntArrayArray1704[i_169_][i_170_]
		       + ((anInt1702 * 127780559 - i_171_)
			  * anIntArrayArray1704[i_167_][i_170_]))
		      >> anInt1703 * -1495101509);
	return ((127780559 * anInt1702 - i_172_) * i_173_ + i_172_ * i_174_
		>> anInt1703 * -1495101509);
    }
    
    public final int method2538(int i, int i_175_) {
	int i_176_ = i >> anInt1703 * -1495101509;
	int i_177_ = i_175_ >> -1495101509 * anInt1703;
	i_176_ = Math.min(anInt1701 * -1924295585 - 1, Math.max(0, i_176_));
	i_177_ = Math.min(anInt1700 * -1466328823 - 1, Math.max(0, i_177_));
	int i_178_ = Math.min(anInt1701 * -1924295585 - 1, i_176_ + 1);
	int i_179_ = Math.min(anInt1700 * -1466328823 - 1, i_177_ + 1);
	int i_180_ = i & anInt1702 * 127780559 - 1;
	int i_181_ = i_175_ & 127780559 * anInt1702 - 1;
	int i_182_
	    = ((anIntArrayArray1704[i_176_][i_177_] * (anInt1702 * 127780559
						       - i_180_)
		+ i_180_ * anIntArrayArray1704[i_178_][i_177_])
	       >> anInt1703 * -1495101509);
	int i_183_ = ((i_180_ * anIntArrayArray1704[i_178_][i_179_]
		       + ((anInt1702 * 127780559 - i_180_)
			  * anIntArrayArray1704[i_176_][i_179_]))
		      >> anInt1703 * -1495101509);
	return ((127780559 * anInt1702 - i_181_) * i_182_ + i_181_ * i_183_
		>> anInt1703 * -1495101509);
    }
    
    public final int method2539(int i, int i_184_) {
	return anIntArrayArray1704[i][i_184_];
    }
    
    public final int method2540(int i, int i_185_) {
	return anIntArrayArray1704[i][i_185_];
    }
    
    public final int method2541(int i, int i_186_) {
	return anIntArrayArray1704[i][i_186_];
    }
    
    public final int method2542(int i, int i_187_) {
	return (anIntArrayArray1704
		[Math.min(anInt1701 * -1924295585 - 1, Math.max(0, i))]
		[Math.min(anInt1700 * -1466328823 - 1, Math.max(0, i_187_))]);
    }
    
    public static void method2543(int i) {
	Class516.method8592();
    }
    
    public static void method2544(byte i) {
	if (!Class116.aBool1401) {
	    Class216.method4113((client.aClass512_11100.method8424((byte) 102)
				 .aClass568ArrayArrayArray7433),
				830238244);
	    if ((client.aClass512_11100.method8424((byte) 70)
		 .aClass568ArrayArrayArray7460)
		!= null)
		Class216.method4113((client.aClass512_11100.method8424
				     ((byte) 107)
				     .aClass568ArrayArrayArray7460),
				    1329896551);
	    Class116.aBool1401 = true;
	}
    }
    
    static final void method2545(Class669 class669, byte i) {
	int i_188_ = (class669.anIntArray8595
		      [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (((Class15)
		Class531.aClass44_Sub7_7135.method91(i_188_, -1005863612))
	       .anInt132) * 83792657;
    }
}
