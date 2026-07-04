/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Arrays;

public class Class15 implements Interface13
{
    public int anInt104;
    int[] anIntArray105;
    public boolean aBool106;
    static final int anInt107 = 6;
    static final int anInt108 = 5;
    boolean aBool109;
    int anInt110;
    Class12 aClass12_111;
    int anInt112;
    public int anInt113 = -1358791503;
    int anInt114;
    int anInt115;
    public int anInt116;
    short[] aShortArray117;
    byte[] aByteArray118;
    short[] aShortArray119;
    short[] aShortArray120;
    byte[] aByteArray121;
    public String aString122 = "null";
    public int anInt123 = -169628944;
    public int anInt124 = 0;
    public int anInt125 = 0;
    public int anInt126 = 0;
    public int anInt127;
    public int anInt128;
    public boolean aBool129;
    public int anInt130;
    public int anInt131;
    public int anInt132;
    public String[] aStringArray133;
    public String[] aStringArray134;
    int[] anIntArray135;
    int[] anIntArray136;
    int anInt137;
    public int anInt138;
    public int anInt139 = 0;
    int anInt140;
    int anInt141;
    public static final int anInt142 = 2;
    int anInt143;
    int anInt144;
    int anInt145;
    int anInt146;
    int anInt147;
    int[] anIntArray148;
    int anInt149;
    byte[] aByteArray150;
    public static short[] aShortArray151 = new short[256];
    int anInt152;
    int anInt153;
    int anInt154;
    int anInt155;
    int anInt156;
    int anInt157;
    public int anInt158;
    public int anInt159;
    int anInt160;
    public int anInt161;
    public int anInt162;
    public int anInt163;
    String aString164;
    short[] aShortArray165;
    Interface14 anInterface14_166;
    public int anInt167;
    int anInt168;
    int anInt169;
    public static final int anInt170 = 1;
    public static final int anInt171 = 0;
    public boolean aBool172;
    int anInt173;
    public int anInt174;
    int anInt175;
    Class9 aClass9_176;
    public int[] anIntArray177;
    public int anInt178;
    int anInt179;
    public int anInt180;
    public boolean aBool181;
    public int anInt182;
    public boolean aBool183;
    static String aString184 = "</col>";
    
    public int method666(int i) {
	if (null == anIntArray136)
	    return -1;
	return anIntArray136[i];
    }
    
    public void method82(int i) {
	if (-1 != 368739509 * anInt158)
	    method670(((Class15)
		       anInterface14_166.method91(anInt158 * 368739509,
						  1216183106)),
		      ((Class15)
		       anInterface14_166.method91(anInt159 * 615907051,
						  -941713233)),
		      aClass12_111.aClass672_90, (byte) 14);
	else if (-1 != -160842243 * anInt161)
	    method671(((Class15)
		       anInterface14_166.method91(anInt161 * -160842243,
						  989605121)),
		      ((Class15)
		       anInterface14_166.method91(443374467 * anInt173,
						  -488668908)),
		      aClass12_111.aClass672_90, -1726250100);
	else if (-1 != anInt180 * 25758581)
	    method672((Class15) anInterface14_166.method91(25758581 * anInt180,
							   -229986002),
		      ((Class15)
		       anInterface14_166.method91(398503871 * anInt149,
						  -1398665533)),
		      aClass12_111.aClass672_90, (byte) -117);
	else if (-1 != anInt163 * -667959667)
	    method688(((Class15)
		       anInterface14_166.method91(anInt163 * -667959667,
						  476277797)),
		      ((Class15)
		       anInterface14_166.method91(anInt162 * 344178797,
						  -552231852)),
		      aClass12_111.aClass672_90, (byte) 0);
	if (0 != -221335179 * anInt167)
	    aBool129 = false;
	if (!aClass12_111.aBool88 && aBool106) {
	    anInt104 = 0;
	    aStringArray133 = aClass12_111.aStringArray82;
	    aStringArray134 = aClass12_111.aStringArray91;
	    aBool172 = false;
	    anIntArray177 = null;
	    aBool129 = false;
	    if (aClass9_176 != null) {
		boolean bool = false;
		for (Class534 class534 = aClass9_176.method583(-1575231774);
		     null != class534;
		     class534 = aClass9_176.method584((byte) -64)) {
		    Class90 class90
			= ((Class90)
			   (aClass12_111.anInterface14_85.method91
			    ((int) (class534.aLong7158 * 8258869577519436579L),
			     -837122012)));
		    if (class90.aBool890)
			class534.method8892((byte) 1);
		    else
			bool = true;
		}
		if (!bool)
		    aClass9_176 = null;
	    }
	}
    }
    
    int[] method667(int[] is, int i) {
	int[] is_0_ = new int[1152];
	int i_1_ = 0;
	for (int i_2_ = 0; i_2_ < 32; i_2_++) {
	    for (int i_3_ = 0; i_3_ < 36; i_3_++) {
		int i_4_ = is[i_1_];
		if (i_4_ == 0) {
		    if (i_3_ > 0 && 0 != is[i_1_ - 1])
			i_4_ = i;
		    else if (i_2_ > 0 && is[i_1_ - 36] != 0)
			i_4_ = i;
		    else if (i_3_ < 35 && is[1 + i_1_] != 0)
			i_4_ = i;
		    else if (i_2_ < 31 && is[36 + i_1_] != 0)
			i_4_ = i;
		}
		is_0_[i_1_++] = i_4_;
	    }
	}
	return is_0_;
    }
    
    void method668(Class15 class15_5_, Class15 class15_6_, Class672 class672) {
	method669(Class20.aClass20_215, class15_5_, class15_6_,
		  Class58.aClass58_464, class672, (byte) -54);
    }
    
    void method669(Class20 class20, Class15 class15_7_, Class15 class15_8_,
		   Class58 class58, Class672 class672, byte i) {
	anInt114 = class15_7_.anInt114 * 1;
	anInt123 = 1 * class15_7_.anInt123;
	anInt124 = 1 * class15_7_.anInt124;
	anInt125 = 1 * class15_7_.anInt125;
	anInt126 = class15_7_.anInt126 * 1;
	anInt139 = 1 * class15_7_.anInt139;
	anInt128 = 1 * class15_7_.anInt128;
	Class15 class15_9_
	    = Class20.aClass20_212 == class20 ? class15_7_ : class15_8_;
	aShortArray165 = class15_9_.aShortArray165;
	aShortArray117 = class15_9_.aShortArray117;
	aByteArray118 = class15_9_.aByteArray118;
	aShortArray119 = class15_9_.aShortArray119;
	aShortArray120 = class15_9_.aShortArray120;
	aString122 = class15_8_.aString122;
	aBool106 = class15_8_.aBool106;
	if (Class20.aClass20_212 == class20) {
	    anInt131 = class15_8_.anInt131 * 1;
	    anInt174 = 1516612899;
	    if (class15_8_.aBool109)
		aBool129 = false;
	    else
		aBool129 = class15_8_.aBool129;
	} else if (Class20.aClass20_213 == class20) {
	    aString122 = class15_8_.aString164;
	    anInt131
		= ((int) Math.floor((double) (1925627131 * class15_8_.anInt131
					      / (-1988624023
						 * class15_8_.anInt116)))
		   * 7728691);
	    anInt174 = 1516612899;
	    aBool172 = class15_8_.aBool172;
	    aBool129 = class15_8_.aBool129;
	    anInt113 = class15_7_.anInt113 * 1;
	    anIntArray135 = class15_7_.anIntArray135;
	    anIntArray136 = class15_7_.anIntArray136;
	    aStringArray134 = new String[5];
	    aStringArray134[0]
		= Class58.aClass58_472.method1245(class672, (byte) -81);
	    aStringArray134[4] = class58.method1245(class672, (byte) -61);
	} else {
	    anInt131 = 0;
	    anInt174 = class15_8_.anInt174 * 1;
	    aBool129 = false;
	    anInt127 = 1 * class15_8_.anInt127;
	    anInt138 = 1 * class15_8_.anInt138;
	    anInt132 = class15_8_.anInt132 * 1;
	    anInt140 = 1 * class15_8_.anInt140;
	    anInt141 = 1 * class15_8_.anInt141;
	    anInt144 = class15_8_.anInt144 * 1;
	    anInt156 = 1 * class15_8_.anInt156;
	    anInt143 = class15_8_.anInt143 * 1;
	    anInt145 = 1 * class15_8_.anInt145;
	    anInt146 = class15_8_.anInt146 * 1;
	    anInt147 = class15_8_.anInt147 * 1;
	    anInt160 = 1 * class15_8_.anInt160;
	    anInt168 = 1 * class15_8_.anInt168;
	    anInt112 = class15_8_.anInt112 * 1;
	    anInt110 = 1 * class15_8_.anInt110;
	    anInt152 = 1 * class15_8_.anInt152;
	    anInt153 = 1 * class15_8_.anInt153;
	    anInt154 = 1 * class15_8_.anInt154;
	    anInt155 = 1 * class15_8_.anInt155;
	    anInt113 = class15_8_.anInt113 * 1;
	    anInt104 = class15_8_.anInt104 * 1;
	    aStringArray133 = class15_8_.aStringArray133;
	    aClass9_176 = class15_8_.aClass9_176;
	    aStringArray134 = new String[5];
	    if (null != class15_8_.aStringArray134) {
		for (int i_10_ = 0; i_10_ < 4; i_10_++)
		    aStringArray134[i_10_] = class15_8_.aStringArray134[i_10_];
	    }
	    aStringArray134[4] = class58.method1245(class672, (byte) -17);
	}
    }
    
    void method670(Class15 class15_11_, Class15 class15_12_, Class672 class672,
		   byte i) {
	method669(Class20.aClass20_212, class15_11_, class15_12_, null,
		  class672, (byte) -24);
    }
    
    void method671(Class15 class15_13_, Class15 class15_14_, Class672 class672,
		   int i) {
	method669(Class20.aClass20_215, class15_13_, class15_14_,
		  Class58.aClass58_464, class672, (byte) -60);
    }
    
    void method672(Class15 class15_15_, Class15 class15_16_, Class672 class672,
		   byte i) {
	method669(Class20.aClass20_214, class15_15_, class15_16_,
		  Class58.aClass58_549, class672, (byte) 0);
    }
    
    void method673(Class15 class15_17_, Class15 class15_18_,
		   Class672 class672) {
	method669(Class20.aClass20_212, class15_17_, class15_18_, null,
		  class672, (byte) -76);
    }
    
    public int method674(int i) {
	if (null == anIntArray135)
	    return -1;
	return anIntArray135[i];
    }
    
    public Class15 method675(int i, byte i_19_) {
	if (null != anIntArray105 && i > 1) {
	    int i_20_ = -1;
	    for (int i_21_ = 0; i_21_ < 10; i_21_++) {
		if (i >= anIntArray148[i_21_] && anIntArray148[i_21_] != 0)
		    i_20_ = anIntArray105[i_21_];
	    }
	    if (-1 != i_20_)
		return (Class15) anInterface14_166.method91(i_20_, 122893322);
	}
	return this;
    }
    
    int[] method676(Class185 class185, Class185 class185_22_, int i, int i_23_,
		    int i_24_, boolean bool, int i_25_, Class171 class171,
		    Class631 class631, Class632 class632, int i_26_) {
	Class187 class187 = Class187.method3709(aClass12_111.aClass472_84,
						anInt114 * -256585207, 0);
	if (class187 == null)
	    return null;
	if (class187.anInt2082 < 13)
	    class187.method3723(2);
	if (null != aShortArray165) {
	    for (int i_27_ = 0; i_27_ < aShortArray165.length; i_27_++) {
		if (aByteArray118 != null && i_27_ < aByteArray118.length)
		    class187.method3719(aShortArray165[i_27_],
					(aShortArray151
					 [aByteArray118[i_27_] & 0xff]));
		else
		    class187.method3719(aShortArray165[i_27_],
					aShortArray117[i_27_]);
	    }
	}
	if (aShortArray119 != null) {
	    for (int i_28_ = 0; i_28_ < aShortArray119.length; i_28_++)
		class187.method3750(aShortArray119[i_28_],
				    aShortArray120[i_28_]);
	}
	if (null != class631) {
	    for (int i_29_ = 0; i_29_ < 10; i_29_++) {
		for (int i_30_ = 0;
		     i_30_ < Class631.aShortArrayArray8218[i_29_].length;
		     i_30_++) {
		    if (class631.anIntArray8208[i_29_]
			< (Class312.aShortArrayArrayArray3371[i_29_]
			   [i_30_]).length)
			class187.method3719((Class631.aShortArrayArray8218
					     [i_29_][i_30_]),
					    (Class312.aShortArrayArrayArray3371
					     [i_29_][i_30_]
					     [(class631.anIntArray8208
					       [i_29_])]));
		}
	    }
	    for (int i_31_ = 0; i_31_ < 10; i_31_++) {
		for (int i_32_ = 0;
		     i_32_ < Class580.aShortArrayArray7762[i_31_].length;
		     i_32_++) {
		    if (class631.anIntArray8213[i_31_]
			< (Class473.aShortArrayArrayArray5173[i_31_]
			   [i_32_]).length)
			class187.method3750((Class580.aShortArrayArray7762
					     [i_31_][i_32_]),
					    (Class473.aShortArrayArrayArray5173
					     [i_31_][i_32_]
					     [(class631.anIntArray8213
					       [i_31_])]));
		}
	    }
	}
	int i_33_ = 2048;
	boolean bool_34_ = false;
	if (128 != 1410820231 * anInt137 || anInt115 * -157621547 != 128
	    || 128 != anInt157 * -1975843835) {
	    bool_34_ = true;
	    i_33_ |= 0x7;
	}
	Class183 class183 = class185.method3329(class187, i_33_, 64,
						64 + anInt169 * -3591593,
						768 + anInt175 * -2143007317);
	if (!class183.method3060())
	    return null;
	if (bool_34_)
	    class183.method3021(anInt137 * 1410820231, -157621547 * anInt115,
				-1975843835 * anInt157);
	Class163 class163 = null;
	if (-1 != anInt158 * 368739509) {
	    class163
		= aClass12_111.method618(class185, class185_22_,
					 615907051 * anInt159, 10, 1, 0, true,
					 true, 0, class171, class631, class632,
					 anInterface14_166, 241444018);
	    if (class163 == null)
		return null;
	} else if (-160842243 * anInt161 != -1) {
	    class163 = aClass12_111.method618(class185, class185_22_,
					      anInt173 * 443374467, i, i_23_,
					      i_24_, false, true, 0, class171,
					      class631, class632,
					      anInterface14_166, 241444018);
	    if (null == class163)
		return null;
	} else if (25758581 * anInt180 != -1) {
	    class163 = aClass12_111.method618(class185, class185_22_,
					      anInt149 * 398503871, i, i_23_,
					      i_24_, false, true, 0, class171,
					      class631, class632,
					      anInterface14_166, 241444018);
	    if (null == class163)
		return null;
	} else if (-1 != anInt163 * -667959667) {
	    class163
		= aClass12_111.method618(class185, class185_22_,
					 344178797 * anInt162, 10, 1, 0, true,
					 true, 0, class171, class631, class632,
					 anInterface14_166, 241444018);
	    if (null == class163)
		return null;
	}
	int i_35_;
	if (bool)
	    i_35_ = (int) (1.5 * (double) (-528739693 * anInt123)) << 2;
	else if (2 == i_23_)
	    i_35_ = (int) (1.04 * (double) (-528739693 * anInt123)) << 2;
	else
	    i_35_ = anInt123 * -528739693 << 2;
	Class433 class433 = class185.method3339();
	Class433 class433_36_ = class185.method3518();
	class433_36_.method6857(16.0F, 16.0F, 512.0F, 512.0F, 50.0F,
				2.14748365E9F,
				(float) class185.method3253(-1830905905)
					    .method2910(),
				(float) class185.method3253(-1762519713)
					    .method2911());
	class185.method3338(class433_36_);
	class185.method3318(0, 0,
			    class185.method3253(-1533673649).method2910(),
			    class185.method3253(-564411936).method2911());
	Class446 class446 = new Class446();
	class185.method3335(class446);
	class185.method3489(0.95F + (float) (Math.random() / 10.0));
	class185.method3341(16777215, 0.95F + (float) (Math.random() / 10.0),
			    0.95F + (float) (Math.random() / 10.0), -50.0F,
			    -10.0F, -50.0F);
	Class446 class446_37_ = class185.method3665();
	class446_37_.method7244(0.0F, 0.0F, 1.0F,
				Class427
				    .method6799(-(anInt126 * 102672307) << 3));
	class446_37_.method7245(0.0F, 1.0F, 0.0F,
				Class427
				    .method6799(anInt125 * 1327637973 << 3));
	class446_37_.method7287((float) (-1667459827 * anInt139 << 2),
				(float) (((i_35_
					   * (Class427.anIntArray4806
					      [-993244079 * anInt124 << 3]))
					  >> 14)
					 - class183.method3045() / 2
					 + (610101213 * anInt128 << 2)),
				(float) ((610101213 * anInt128 << 2)
					 + ((i_35_
					     * (Class427.anIntArray4805
						[anInt124 * -993244079 << 3]))
					    >> 14)));
	class446_37_.method7245(1.0F, 0.0F, 0.0F,
				Class427
				    .method6799(-993244079 * anInt124 << 3));
	class185.method3373(0, 0, 36, 32);
	class185.method3340(2, 0);
	class185.method3298(0, 0, 36, 32, 0, 0);
	class185.method3463(0, -1, 0);
	class183.method3034(class446_37_, null, 1);
	class185.method3338(class433);
	int[] is = class185.method3267(0, 0, 36, 32);
	if (i_23_ >= 1) {
	    is = method704(is, -16777214, (byte) -21);
	    if (i_23_ >= 2)
		is = method704(is, -1, (byte) -112);
	}
	if (0 != i_24_)
	    method678(is, i_24_, 2004228867);
	if (-160842243 * anInt161 != -1)
	    class163.method2656(0, 0);
	else if (-1 != 25758581 * anInt180)
	    class163.method2656(0, 0);
	class185.method3317(is, 0, 36, 36, 32, (byte) -38).method2656(0, 0);
	if (-1 != 368739509 * anInt158)
	    class163.method2656(0, 0);
	if (-667959667 * anInt163 != -1)
	    class163.method2656(0, 0);
	if (1 == i_25_
	    || i_25_ == 2 && (1 == anInt174 * 1113844363 || i != 1) && -1 != i)
	    class171.method2828(Class398.method6578(i,
						    aClass12_111.aClass672_90,
						    class632, 1843845492),
				0, 9, -256, -16777215, (byte) 95);
	is = class185.method3267(0, 0, 36, 32);
	for (int i_38_ = 0; i_38_ < is.length; i_38_++) {
	    if ((is[i_38_] & 0xffffff) == 0)
		is[i_38_] = 0;
	    else
		is[i_38_] |= ~0xffffff;
	}
	return is;
    }
    
    public final boolean method677(boolean bool, Class17 class17, int i) {
	int i_39_;
	int i_40_;
	int i_41_;
	if (bool) {
	    if (class17 != null && class17.anIntArray195 != null) {
		i_39_ = class17.anIntArray195[0];
		i_40_ = class17.anIntArray195[1];
		i_41_ = class17.anIntArray195[2];
	    } else {
		i_39_ = 383860379 * anInt156;
		i_40_ = 1184936625 * anInt143;
		i_41_ = 914690775 * anInt145;
	    }
	} else if (null != class17 && null != class17.anIntArray198) {
	    i_39_ = class17.anIntArray198[0];
	    i_40_ = class17.anIntArray198[1];
	    i_41_ = class17.anIntArray198[2];
	} else {
	    i_39_ = anInt140 * -297379063;
	    i_40_ = 384637321 * anInt141;
	    i_41_ = anInt144 * -1908318299;
	}
	if (i_39_ == -1)
	    return true;
	boolean bool_42_ = true;
	if (!aClass12_111.aClass472_84.method7669(i_39_, 0, 1804616883))
	    bool_42_ = false;
	if (i_40_ != -1
	    && !aClass12_111.aClass472_84.method7669(i_40_, 0, 1804616883))
	    bool_42_ = false;
	if (-1 != i_41_
	    && !aClass12_111.aClass472_84.method7669(i_41_, 0, 1804616883))
	    bool_42_ = false;
	return bool_42_;
    }
    
    void method678(int[] is, int i, int i_43_) {
	for (int i_44_ = 31; i_44_ > 0; i_44_--) {
	    int i_45_ = i_44_ * 36;
	    for (int i_46_ = 35; i_46_ > 0; i_46_--) {
		if (0 == is[i_45_ + i_46_] && is[i_45_ + i_46_ - 1 - 36] != 0)
		    is[i_46_ + i_45_] = i;
	    }
	}
    }
    
    int[] method679(int[] is, int i) {
	int[] is_47_ = new int[1152];
	int i_48_ = 0;
	for (int i_49_ = 0; i_49_ < 32; i_49_++) {
	    for (int i_50_ = 0; i_50_ < 36; i_50_++) {
		int i_51_ = is[i_48_];
		if (i_51_ == 0) {
		    if (i_50_ > 0 && 0 != is[i_48_ - 1])
			i_51_ = i;
		    else if (i_49_ > 0 && is[i_48_ - 36] != 0)
			i_51_ = i;
		    else if (i_50_ < 35 && is[1 + i_48_] != 0)
			i_51_ = i;
		    else if (i_49_ < 31 && is[36 + i_48_] != 0)
			i_51_ = i;
		}
		is_47_[i_48_++] = i_51_;
	    }
	}
	return is_47_;
    }
    
    public final Class187 method680(boolean bool, Class17 class17, byte i) {
	int i_52_;
	int i_53_;
	int i_54_;
	if (bool) {
	    if (class17 != null && class17.anIntArray195 != null) {
		i_52_ = class17.anIntArray195[0];
		i_53_ = class17.anIntArray195[1];
		i_54_ = class17.anIntArray195[2];
	    } else {
		i_52_ = anInt156 * 383860379;
		i_53_ = 1184936625 * anInt143;
		i_54_ = 914690775 * anInt145;
	    }
	} else if (null != class17 && class17.anIntArray198 != null) {
	    i_52_ = class17.anIntArray198[0];
	    i_53_ = class17.anIntArray198[1];
	    i_54_ = class17.anIntArray198[2];
	} else {
	    i_52_ = -297379063 * anInt140;
	    i_53_ = 384637321 * anInt141;
	    i_54_ = -1908318299 * anInt144;
	}
	if (i_52_ == -1)
	    return null;
	Class187 class187
	    = Class187.method3709(aClass12_111.aClass472_84, i_52_, 0);
	if (null == class187)
	    return null;
	if (class187.anInt2082 < 13)
	    class187.method3723(2);
	if (-1 != i_53_) {
	    Class187 class187_55_
		= Class187.method3709(aClass12_111.aClass472_84, i_53_, 0);
	    if (class187_55_.anInt2082 < 13)
		class187_55_.method3723(2);
	    if (i_54_ != -1) {
		Class187 class187_56_
		    = Class187.method3709(aClass12_111.aClass472_84, i_54_, 0);
		if (class187_56_.anInt2082 < 13)
		    class187_56_.method3723(2);
		Class187[] class187s
		    = { class187, class187_55_, class187_56_ };
		class187 = new Class187(class187s, 3);
	    } else {
		Class187[] class187s = { class187, class187_55_ };
		class187 = new Class187(class187s, 2);
	    }
	}
	if (!bool && (-936808041 * anInt146 != 0 || 0 != 269133805 * anInt160
		      || -1509486857 * anInt112 != 0))
	    class187.method3721(-936808041 * anInt146, anInt160 * 269133805,
				-1509486857 * anInt112);
	if (bool && (0 != anInt147 * -1877086559 || 0 != anInt168 * 848465109
		     || 0 != anInt110 * -1797187555))
	    class187.method3721(-1877086559 * anInt147, 848465109 * anInt168,
				-1797187555 * anInt110);
	if (aShortArray165 != null) {
	    short[] is;
	    if (null != class17 && class17.aShortArray199 != null)
		is = class17.aShortArray199;
	    else
		is = aShortArray117;
	    for (int i_57_ = 0; i_57_ < aShortArray165.length; i_57_++)
		class187.method3719(aShortArray165[i_57_], is[i_57_]);
	}
	if (aShortArray119 != null) {
	    short[] is;
	    if (null != class17 && null != class17.aShortArray192)
		is = class17.aShortArray192;
	    else
		is = aShortArray120;
	    for (int i_58_ = 0; i_58_ < aShortArray119.length; i_58_++)
		class187.method3750(aShortArray119[i_58_], is[i_58_]);
	}
	return class187;
    }
    
    public final boolean method681(boolean bool, Class17 class17, int i) {
	int i_59_;
	int i_60_;
	if (bool) {
	    if (null != class17 && class17.anIntArray200 != null) {
		i_59_ = class17.anIntArray200[0];
		i_60_ = class17.anIntArray200[1];
	    } else {
		i_59_ = anInt154 * -912813653;
		i_60_ = -1648499137 * anInt155;
	    }
	} else if (class17 != null && class17.anIntArray197 != null) {
	    i_59_ = class17.anIntArray197[0];
	    i_60_ = class17.anIntArray197[1];
	} else {
	    i_59_ = anInt152 * 2038736063;
	    i_60_ = 331707609 * anInt153;
	}
	if (i_59_ == -1)
	    return true;
	boolean bool_61_ = true;
	if (!aClass12_111.aClass472_84.method7669(i_59_, 0, 1804616883))
	    bool_61_ = false;
	if (i_60_ != -1
	    && !aClass12_111.aClass472_84.method7669(i_60_, 0, 1804616883))
	    bool_61_ = false;
	return bool_61_;
    }
    
    public final Class187 method682(boolean bool, Class17 class17, int i) {
	int i_62_;
	int i_63_;
	if (bool) {
	    if (null != class17 && null != class17.anIntArray200) {
		i_62_ = class17.anIntArray200[0];
		i_63_ = class17.anIntArray200[1];
	    } else {
		i_62_ = anInt154 * -912813653;
		i_63_ = anInt155 * -1648499137;
	    }
	} else if (class17 != null && null != class17.anIntArray197) {
	    i_62_ = class17.anIntArray197[0];
	    i_63_ = class17.anIntArray197[1];
	} else {
	    i_62_ = anInt152 * 2038736063;
	    i_63_ = anInt153 * 331707609;
	}
	if (-1 == i_62_)
	    return null;
	Class187 class187
	    = Class187.method3709(aClass12_111.aClass472_84, i_62_, 0);
	if (class187.anInt2082 < 13)
	    class187.method3723(2);
	if (-1 != i_63_) {
	    Class187 class187_64_
		= Class187.method3709(aClass12_111.aClass472_84, i_63_, 0);
	    if (class187_64_.anInt2082 < 13)
		class187_64_.method3723(2);
	    Class187[] class187s = { class187, class187_64_ };
	    class187 = new Class187(class187s, 2);
	}
	if (null != aShortArray165) {
	    short[] is;
	    if (class17 != null && null != class17.aShortArray199)
		is = class17.aShortArray199;
	    else
		is = aShortArray117;
	    for (int i_65_ = 0; i_65_ < aShortArray165.length; i_65_++)
		class187.method3719(aShortArray165[i_65_], is[i_65_]);
	}
	if (null != aShortArray119) {
	    short[] is;
	    if (class17 != null && null != class17.aShortArray192)
		is = class17.aShortArray192;
	    else
		is = aShortArray120;
	    for (int i_66_ = 0; i_66_ < aShortArray119.length; i_66_++)
		class187.method3750(aShortArray119[i_66_], is[i_66_]);
	}
	return class187;
    }
    
    public int method683(int i, int i_67_, byte i_68_) {
	if (null == aClass9_176)
	    return i_67_;
	Class534_Sub39 class534_sub39
	    = (Class534_Sub39) aClass9_176.method579((long) i);
	if (class534_sub39 == null)
	    return i_67_;
	return -705967177 * class534_sub39.anInt10807;
    }
    
    void method684(Class15 class15_69_, Class15 class15_70_,
		   Class672 class672) {
	method669(Class20.aClass20_212, class15_69_, class15_70_, null,
		  class672, (byte) 8);
    }
    
    void method685(Class15 class15_71_, Class15 class15_72_,
		   Class672 class672) {
	method669(Class20.aClass20_215, class15_71_, class15_72_,
		  Class58.aClass58_464, class672, (byte) -6);
    }
    
    public int method686(int i, int i_73_) {
	if (null == anIntArray136)
	    return -1;
	return anIntArray136[i];
    }
    
    public String method687(int i, String string, int i_74_) {
	if (null == aClass9_176)
	    return string;
	Class534_Sub6 class534_sub6
	    = (Class534_Sub6) aClass9_176.method579((long) i);
	if (null == class534_sub6)
	    return string;
	return (String) class534_sub6.anObject10417;
    }
    
    public void method80(Class534_Sub40 class534_sub40) {
	aBool129 = true;
	for (;;) {
	    int i = class534_sub40.method16527(175297798);
	    if (i == 0)
		break;
	    method716(class534_sub40, i, (byte) -27);
	}
    }
    
    void method688(Class15 class15_75_, Class15 class15_76_, Class672 class672,
		   byte i) {
	method669(Class20.aClass20_213, class15_75_, class15_76_,
		  Class58.aClass58_591, class672, (byte) -58);
    }
    
    public final Class183 method689(Class185 class185, int i, int i_77_,
				    Class631 class631, Class711 class711,
				    int i_78_, int i_79_, int i_80_, int i_81_,
				    int i_82_) {
	if (null != anIntArray105 && i_77_ > 1) {
	    int i_83_ = -1;
	    for (int i_84_ = 0; i_84_ < 10; i_84_++) {
		if (i_77_ >= anIntArray148[i_84_] && 0 != anIntArray148[i_84_])
		    i_83_ = anIntArray105[i_84_];
	    }
	    if (i_83_ != -1)
		return (((Class15) anInterface14_166.method91(i_83_, 48600382))
			    .method689
			(class185, i, 1, class631, class711, i_78_, i_79_,
			 i_80_, i_81_, 923430537));
	}
	int i_85_ = i;
	if (class711 != null)
	    i_85_ |= class711.method14360((short) -16033);
	Class183 class183;
	synchronized (aClass12_111.aClass203_89) {
	    class183 = ((Class183)
			(aClass12_111.aClass203_89.method3871
			 ((long) (anInt179 * 1404342545
				  | 2098753835 * class185.anInt2001 << 29))));
	}
	if (null == class183
	    || class185.method3330(class183.method3101(), i_85_) != 0) {
	    if (null != class183)
		i_85_ = class185.method3331(i_85_, class183.method3101());
	    int i_86_ = i_85_;
	    if (aShortArray119 != null)
		i_86_ |= 0x8000;
	    if (aShortArray165 != null || null != class631)
		i_86_ |= 0x4000;
	    if (1410820231 * anInt137 != 128)
		i_86_ |= 0x1;
	    if (anInt115 * -157621547 != 128)
		i_86_ |= 0x2;
	    if (anInt157 * -1975843835 != 128)
		i_86_ |= 0x4;
	    Class187 class187 = Class187.method3709(aClass12_111.aClass472_84,
						    -256585207 * anInt114, 0);
	    if (class187 == null)
		return null;
	    if (class187.anInt2082 < 13)
		class187.method3723(2);
	    class183 = class185.method3329(class187, i_86_,
					   1470275403 * aClass12_111.anInt83,
					   64 + -3591593 * anInt169,
					   -2143007317 * anInt175 + 850);
	    if (anInt137 * 1410820231 != 128 || -157621547 * anInt115 != 128
		|| anInt157 * -1975843835 != 128)
		class183.method3021(1410820231 * anInt137,
				    anInt115 * -157621547,
				    -1975843835 * anInt157);
	    if (aShortArray165 != null) {
		for (int i_87_ = 0; i_87_ < aShortArray165.length; i_87_++) {
		    if (aByteArray118 != null && i_87_ < aByteArray118.length)
			class183.method3056(aShortArray165[i_87_],
					    (aShortArray151
					     [aByteArray118[i_87_] & 0xff]));
		    else
			class183.method3056(aShortArray165[i_87_],
					    aShortArray117[i_87_]);
		}
	    }
	    if (null != aShortArray119) {
		for (int i_88_ = 0; i_88_ < aShortArray119.length; i_88_++)
		    class183.method3118(aShortArray119[i_88_],
					aShortArray120[i_88_]);
	    }
	    if (class631 != null) {
		for (int i_89_ = 0; i_89_ < 10; i_89_++) {
		    for (int i_90_ = 0;
			 i_90_ < Class631.aShortArrayArray8218[i_89_].length;
			 i_90_++) {
			if (class631.anIntArray8208[i_89_]
			    < (Class312.aShortArrayArrayArray3371[i_89_]
			       [i_90_]).length)
			    class183.method3056
				(Class631.aShortArrayArray8218[i_89_][i_90_],
				 (Class312.aShortArrayArrayArray3371[i_89_]
				  [i_90_][class631.anIntArray8208[i_89_]]));
		    }
		}
		for (int i_91_ = 0; i_91_ < 10; i_91_++) {
		    for (int i_92_ = 0;
			 i_92_ < Class580.aShortArrayArray7762[i_91_].length;
			 i_92_++) {
			if (class631.anIntArray8213[i_91_]
			    < (Class473.aShortArrayArrayArray5173[i_91_]
			       [i_92_]).length)
			    class183.method3118
				(Class580.aShortArrayArray7762[i_91_][i_92_],
				 (Class473.aShortArrayArrayArray5173[i_91_]
				  [i_92_][class631.anIntArray8213[i_91_]]));
		    }
		}
	    }
	    class183.method3012(i_85_);
	    synchronized (aClass12_111.aClass203_89) {
		aClass12_111.aClass203_89.method3893
		    (class183,
		     (long) (1404342545 * anInt179
			     | 2098753835 * class185.anInt2001 << 29));
	    }
	}
	if (null != class711 || i_81_ != 0) {
	    class183 = class183.method3011((byte) 1, i_85_, true);
	    if (class711 != null)
		class711.method14399(class183, 0, 1685800366);
	    if (i_81_ != 0)
		class183.method3058(i_78_, i_79_, i_80_, i_81_);
	}
	class183.method3012(i);
	return class183;
    }
    
    public void method83() {
	if (-1 != 368739509 * anInt158)
	    method670(((Class15)
		       anInterface14_166.method91(anInt158 * 368739509,
						  -645547289)),
		      ((Class15)
		       anInterface14_166.method91(anInt159 * 615907051,
						  1013757082)),
		      aClass12_111.aClass672_90, (byte) 14);
	else if (-1 != -160842243 * anInt161)
	    method671(((Class15)
		       anInterface14_166.method91(anInt161 * -160842243,
						  -1868831513)),
		      (Class15) anInterface14_166
				    .method91(443374467 * anInt173, 746577377),
		      aClass12_111.aClass672_90, 1841555596);
	else if (-1 != anInt180 * 25758581)
	    method672((Class15) anInterface14_166.method91(25758581 * anInt180,
							   -747431589),
		      ((Class15)
		       anInterface14_166.method91(398503871 * anInt149,
						  -1125423065)),
		      aClass12_111.aClass672_90, (byte) -58);
	else if (-1 != anInt163 * -667959667)
	    method688(((Class15)
		       anInterface14_166.method91(anInt163 * -667959667,
						  -34111998)),
		      (Class15) anInterface14_166
				    .method91(anInt162 * 344178797, 322171361),
		      aClass12_111.aClass672_90, (byte) 0);
	if (0 != -221335179 * anInt167)
	    aBool129 = false;
	if (!aClass12_111.aBool88 && aBool106) {
	    anInt104 = 0;
	    aStringArray133 = aClass12_111.aStringArray82;
	    aStringArray134 = aClass12_111.aStringArray91;
	    aBool172 = false;
	    anIntArray177 = null;
	    aBool129 = false;
	    if (aClass9_176 != null) {
		boolean bool = false;
		for (Class534 class534 = aClass9_176.method583(-1607107961);
		     null != class534;
		     class534 = aClass9_176.method584((byte) -96)) {
		    Class90 class90
			= ((Class90)
			   (aClass12_111.anInterface14_85.method91
			    ((int) (class534.aLong7158 * 8258869577519436579L),
			     -375812959)));
		    if (class90.aBool890)
			class534.method8892((byte) 1);
		    else
			bool = true;
		}
		if (!bool)
		    aClass9_176 = null;
	    }
	}
    }
    
    public void method84() {
	if (-1 != 368739509 * anInt158)
	    method670((Class15) anInterface14_166
				    .method91(anInt158 * 368739509, 332741911),
		      ((Class15)
		       anInterface14_166.method91(anInt159 * 615907051,
						  1529787309)),
		      aClass12_111.aClass672_90, (byte) 14);
	else if (-1 != -160842243 * anInt161)
	    method671(((Class15)
		       anInterface14_166.method91(anInt161 * -160842243,
						  1188626813)),
		      (Class15) anInterface14_166
				    .method91(443374467 * anInt173, 319548231),
		      aClass12_111.aClass672_90, 2098097213);
	else if (-1 != anInt180 * 25758581)
	    method672((Class15) anInterface14_166.method91(25758581 * anInt180,
							   -131056004),
		      ((Class15)
		       anInterface14_166.method91(398503871 * anInt149,
						  -171538259)),
		      aClass12_111.aClass672_90, (byte) -109);
	else if (-1 != anInt163 * -667959667)
	    method688(((Class15)
		       anInterface14_166.method91(anInt163 * -667959667,
						  -1995774188)),
		      (Class15) anInterface14_166
				    .method91(anInt162 * 344178797, 920441321),
		      aClass12_111.aClass672_90, (byte) 0);
	if (0 != -221335179 * anInt167)
	    aBool129 = false;
	if (!aClass12_111.aBool88 && aBool106) {
	    anInt104 = 0;
	    aStringArray133 = aClass12_111.aStringArray82;
	    aStringArray134 = aClass12_111.aStringArray91;
	    aBool172 = false;
	    anIntArray177 = null;
	    aBool129 = false;
	    if (aClass9_176 != null) {
		boolean bool = false;
		for (Class534 class534 = aClass9_176.method583(-1708229564);
		     null != class534;
		     class534 = aClass9_176.method584((byte) -32)) {
		    Class90 class90
			= ((Class90)
			   (aClass12_111.anInterface14_85.method91
			    ((int) (class534.aLong7158 * 8258869577519436579L),
			     119836169)));
		    if (class90.aBool890)
			class534.method8892((byte) 1);
		    else
			bool = true;
		}
		if (!bool)
		    aClass9_176 = null;
	    }
	}
    }
    
    void method690(Class534_Sub40 class534_sub40, int i) {
	if (1 == i)
	    anInt114 = class534_sub40.method16550((byte) 67) * -760062919;
	else if (2 == i)
	    aString122 = class534_sub40.method16541((byte) -103);
	else if (4 == i)
	    anInt123 = class534_sub40.method16529((byte) 1) * 1479531419;
	else if (5 == i)
	    anInt124 = class534_sub40.method16529((byte) 1) * -1823966031;
	else if (6 == i)
	    anInt125 = class534_sub40.method16529((byte) 1) * 884337533;
	else if (7 == i) {
	    anInt139 = class534_sub40.method16529((byte) 1) * -938655291;
	    if (-1667459827 * anInt139 > 32767)
		anInt139 -= 1103429632;
	} else if (i == 8) {
	    anInt128 = class534_sub40.method16529((byte) 1) * 781789301;
	    if (610101213 * anInt128 > 32767)
		anInt128 -= 678756352;
	} else if (11 == i)
	    anInt174 = 1516612899;
	else if (12 == i)
	    anInt131 = class534_sub40.method16533(-258848859) * 7728691;
	else if (i == 13)
	    anInt127 = class534_sub40.method16527(-1286765037) * 973259679;
	else if (14 == i)
	    anInt138 = class534_sub40.method16527(-2033614648) * -1050999363;
	else if (15 == i)
	    aBool129 = false;
	else if (i == 16)
	    aBool106 = true;
	else if (18 == i)
	    anInt130 = class534_sub40.method16529((byte) 1) * -567207273;
	else if (23 == i)
	    anInt140 = class534_sub40.method16550((byte) 72) * 136815417;
	else if (24 == i)
	    anInt141 = class534_sub40.method16550((byte) 66) * -874697543;
	else if (25 == i)
	    anInt156 = class534_sub40.method16550((byte) -36) * -1021479021;
	else if (i == 26)
	    anInt143 = class534_sub40.method16550((byte) -85) * -450865583;
	else if (27 == i)
	    anInt132 = class534_sub40.method16527(1179643924) * 897891825;
	else if (i >= 30 && i < 35)
	    aStringArray133[i - 30] = class534_sub40.method16541((byte) -89);
	else if (i >= 35 && i < 40)
	    aStringArray134[i - 35] = class534_sub40.method16541((byte) -2);
	else if (40 == i) {
	    int i_93_ = class534_sub40.method16527(828984786);
	    aShortArray165 = new short[i_93_];
	    aShortArray117 = new short[i_93_];
	    for (int i_94_ = 0; i_94_ < i_93_; i_94_++) {
		aShortArray165[i_94_]
		    = (short) class534_sub40.method16529((byte) 1);
		aShortArray117[i_94_]
		    = (short) class534_sub40.method16529((byte) 1);
	    }
	} else if (41 == i) {
	    int i_95_ = class534_sub40.method16527(-1743727633);
	    aShortArray119 = new short[i_95_];
	    aShortArray120 = new short[i_95_];
	    for (int i_96_ = 0; i_96_ < i_95_; i_96_++) {
		aShortArray119[i_96_]
		    = (short) class534_sub40.method16529((byte) 1);
		aShortArray120[i_96_]
		    = (short) class534_sub40.method16529((byte) 1);
	    }
	} else if (42 == i) {
	    int i_97_ = class534_sub40.method16527(1909550863);
	    aByteArray118 = new byte[i_97_];
	    for (int i_98_ = 0; i_98_ < i_97_; i_98_++)
		aByteArray118[i_98_] = class534_sub40.method16586((byte) 1);
	} else if (i == 43) {
	    anInt182 = class534_sub40.method16533(-258848859) * 1685577753;
	    aBool181 = true;
	} else if (44 == i) {
	    int i_99_ = class534_sub40.method16529((byte) 1);
	    int i_100_ = 0;
	    for (int i_101_ = i_99_; i_101_ > 0; i_101_ >>= 1)
		i_100_++;
	    aByteArray121 = new byte[i_100_];
	    byte i_102_ = 0;
	    for (int i_103_ = 0; i_103_ < i_100_; i_103_++) {
		if ((i_99_ & 1 << i_103_) > 0) {
		    aByteArray121[i_103_] = i_102_;
		    i_102_++;
		} else
		    aByteArray121[i_103_] = (byte) -1;
	    }
	} else if (i == 45) {
	    int i_104_ = class534_sub40.method16529((byte) 1);
	    int i_105_ = 0;
	    for (int i_106_ = i_104_; i_106_ > 0; i_106_ >>= 1)
		i_105_++;
	    aByteArray150 = new byte[i_105_];
	    byte i_107_ = 0;
	    for (int i_108_ = 0; i_108_ < i_105_; i_108_++) {
		if ((i_104_ & 1 << i_108_) > 0) {
		    aByteArray150[i_108_] = i_107_;
		    i_107_++;
		} else
		    aByteArray150[i_108_] = (byte) -1;
	    }
	} else if (i == 65)
	    aBool172 = true;
	else if (78 == i)
	    anInt144 = class534_sub40.method16550((byte) -29) * 300052525;
	else if (79 == i)
	    anInt145 = class534_sub40.method16550((byte) -13) * -806092569;
	else if (i == 90)
	    anInt152 = class534_sub40.method16550((byte) -36) * 1816709951;
	else if (i == 91)
	    anInt154 = class534_sub40.method16550((byte) -24) * 915857667;
	else if (i == 92)
	    anInt153 = class534_sub40.method16550((byte) 70) * 508808041;
	else if (i == 93)
	    anInt155 = class534_sub40.method16550((byte) 74) * 159844799;
	else if (94 == i)
	    anInt113 = class534_sub40.method16529((byte) 1) * 1358791503;
	else if (95 == i)
	    anInt126 = class534_sub40.method16529((byte) 1) * -808558725;
	else if (96 == i)
	    anInt167 = class534_sub40.method16527(-1387318257) * -1506421027;
	else if (97 == i)
	    anInt159 = class534_sub40.method16529((byte) 1) * -659179069;
	else if (98 == i)
	    anInt158 = class534_sub40.method16529((byte) 1) * 529615261;
	else if (i >= 100 && i < 110) {
	    if (null == anIntArray105) {
		anIntArray105 = new int[10];
		anIntArray148 = new int[10];
	    }
	    anIntArray105[i - 100] = class534_sub40.method16529((byte) 1);
	    anIntArray148[i - 100] = class534_sub40.method16529((byte) 1);
	} else if (i == 110)
	    anInt137 = class534_sub40.method16529((byte) 1) * 862248247;
	else if (i == 111)
	    anInt115 = class534_sub40.method16529((byte) 1) * -847952259;
	else if (112 == i)
	    anInt157 = class534_sub40.method16529((byte) 1) * 1027156173;
	else if (113 == i)
	    anInt169 = class534_sub40.method16586((byte) 1) * -435693209;
	else if (114 == i)
	    anInt175 = class534_sub40.method16586((byte) 1) * -235054833;
	else if (115 == i)
	    anInt104 = class534_sub40.method16527(217060263) * 1846715605;
	else if (i == 121)
	    anInt173 = class534_sub40.method16529((byte) 1) * -1022293205;
	else if (122 == i)
	    anInt161 = class534_sub40.method16529((byte) 1) * -1424357547;
	else if (125 == i) {
	    anInt146
		= (class534_sub40.method16586((byte) 1) << 2) * -1734336985;
	    anInt160 = (class534_sub40.method16586((byte) 1) << 2) * 136039909;
	    anInt112
		= (class534_sub40.method16586((byte) 1) << 2) * 2126123719;
	} else if (126 == i) {
	    anInt147 = (class534_sub40.method16586((byte) 1) << 2) * 486110561;
	    anInt168 = (class534_sub40.method16586((byte) 1) << 2) * 52055165;
	    anInt110
		= (class534_sub40.method16586((byte) 1) << 2) * -2030933451;
	} else if (127 == i || i == 128 || i == 129 || 130 == i) {
	    class534_sub40.method16527(1967246403);
	    class534_sub40.method16529((byte) 1);
	} else if (i == 132) {
	    int i_109_ = class534_sub40.method16527(703358760);
	    anIntArray177 = new int[i_109_];
	    for (int i_110_ = 0; i_110_ < i_109_; i_110_++)
		anIntArray177[i_110_] = class534_sub40.method16529((byte) 1);
	} else if (134 == i)
	    anInt178 = class534_sub40.method16527(-1355078895) * 88595571;
	else if (139 == i)
	    anInt149 = class534_sub40.method16529((byte) 1) * 765149247;
	else if (140 == i)
	    anInt180 = class534_sub40.method16529((byte) 1) * 1370827997;
	else if (i >= 142 && i < 147) {
	    if (null == anIntArray135) {
		anIntArray135 = new int[6];
		Arrays.fill(anIntArray135, -1);
	    }
	    anIntArray135[i - 142] = class534_sub40.method16529((byte) 1);
	} else if (i >= 150 && i < 155) {
	    if (anIntArray136 == null) {
		anIntArray136 = new int[5];
		Arrays.fill(anIntArray136, -1);
	    }
	    anIntArray136[i - 150] = class534_sub40.method16529((byte) 1);
	} else if (156 != i) {
	    if (i == 157)
		aBool183 = true;
	    else if (161 == i)
		anInt162 = class534_sub40.method16529((byte) 1) * -755087003;
	    else if (i == 162)
		anInt163 = class534_sub40.method16529((byte) 1) * 1767978053;
	    else if (i == 163)
		anInt116 = class534_sub40.method16529((byte) 1) * -1339515175;
	    else if (164 == i)
		aString164 = class534_sub40.method16541((byte) -36);
	    else if (165 == i)
		anInt174 = -1261741498;
	    else if (167 == i)
		aBool109 = true;
	    else if (i == 249) {
		int i_111_ = class534_sub40.method16527(-1457599648);
		if (null == aClass9_176) {
		    int i_112_ = Class162.method2640(i_111_, (byte) 26);
		    aClass9_176 = new Class9(i_112_);
		}
		for (int i_113_ = 0; i_113_ < i_111_; i_113_++) {
		    boolean bool = class534_sub40.method16527(918249475) == 1;
		    int i_114_ = class534_sub40.method16531(455255853);
		    Class534 class534;
		    if (bool)
			class534
			    = new Class534_Sub6(class534_sub40
						    .method16541((byte) -114));
		    else
			class534
			    = new Class534_Sub39(class534_sub40
						     .method16533(-258848859));
		    aClass9_176.method581(class534, (long) i_114_);
		}
	    }
	}
    }
    
    void method691(Class20 class20, Class15 class15_115_, Class15 class15_116_,
		   Class58 class58, Class672 class672) {
	anInt114 = class15_115_.anInt114 * 1;
	anInt123 = 1 * class15_115_.anInt123;
	anInt124 = 1 * class15_115_.anInt124;
	anInt125 = 1 * class15_115_.anInt125;
	anInt126 = class15_115_.anInt126 * 1;
	anInt139 = 1 * class15_115_.anInt139;
	anInt128 = 1 * class15_115_.anInt128;
	Class15 class15_117_
	    = Class20.aClass20_212 == class20 ? class15_115_ : class15_116_;
	aShortArray165 = class15_117_.aShortArray165;
	aShortArray117 = class15_117_.aShortArray117;
	aByteArray118 = class15_117_.aByteArray118;
	aShortArray119 = class15_117_.aShortArray119;
	aShortArray120 = class15_117_.aShortArray120;
	aString122 = class15_116_.aString122;
	aBool106 = class15_116_.aBool106;
	if (Class20.aClass20_212 == class20) {
	    anInt131 = class15_116_.anInt131 * 1;
	    anInt174 = 1516612899;
	    if (class15_116_.aBool109)
		aBool129 = false;
	    else
		aBool129 = class15_116_.aBool129;
	} else if (Class20.aClass20_213 == class20) {
	    aString122 = class15_116_.aString164;
	    anInt131
		= ((int) Math.floor((double) (1925627131
					      * class15_116_.anInt131
					      / (-1988624023
						 * class15_116_.anInt116)))
		   * 7728691);
	    anInt174 = 1516612899;
	    aBool172 = class15_116_.aBool172;
	    aBool129 = class15_116_.aBool129;
	    anInt113 = class15_115_.anInt113 * 1;
	    anIntArray135 = class15_115_.anIntArray135;
	    anIntArray136 = class15_115_.anIntArray136;
	    aStringArray134 = new String[5];
	    aStringArray134[0]
		= Class58.aClass58_472.method1245(class672, (byte) -63);
	    aStringArray134[4] = class58.method1245(class672, (byte) -19);
	} else {
	    anInt131 = 0;
	    anInt174 = class15_116_.anInt174 * 1;
	    aBool129 = false;
	    anInt127 = 1 * class15_116_.anInt127;
	    anInt138 = 1 * class15_116_.anInt138;
	    anInt132 = class15_116_.anInt132 * 1;
	    anInt140 = 1 * class15_116_.anInt140;
	    anInt141 = 1 * class15_116_.anInt141;
	    anInt144 = class15_116_.anInt144 * 1;
	    anInt156 = 1 * class15_116_.anInt156;
	    anInt143 = class15_116_.anInt143 * 1;
	    anInt145 = 1 * class15_116_.anInt145;
	    anInt146 = class15_116_.anInt146 * 1;
	    anInt147 = class15_116_.anInt147 * 1;
	    anInt160 = 1 * class15_116_.anInt160;
	    anInt168 = 1 * class15_116_.anInt168;
	    anInt112 = class15_116_.anInt112 * 1;
	    anInt110 = 1 * class15_116_.anInt110;
	    anInt152 = 1 * class15_116_.anInt152;
	    anInt153 = 1 * class15_116_.anInt153;
	    anInt154 = 1 * class15_116_.anInt154;
	    anInt155 = 1 * class15_116_.anInt155;
	    anInt113 = class15_116_.anInt113 * 1;
	    anInt104 = class15_116_.anInt104 * 1;
	    aStringArray133 = class15_116_.aStringArray133;
	    aClass9_176 = class15_116_.aClass9_176;
	    aStringArray134 = new String[5];
	    if (null != class15_116_.aStringArray134) {
		for (int i = 0; i < 4; i++)
		    aStringArray134[i] = class15_116_.aStringArray134[i];
	    }
	    aStringArray134[4] = class58.method1245(class672, (byte) -73);
	}
    }
    
    void method692(Class20 class20, Class15 class15_118_, Class15 class15_119_,
		   Class58 class58, Class672 class672) {
	anInt114 = class15_118_.anInt114 * 1;
	anInt123 = 1 * class15_118_.anInt123;
	anInt124 = 1 * class15_118_.anInt124;
	anInt125 = 1 * class15_118_.anInt125;
	anInt126 = class15_118_.anInt126 * 1;
	anInt139 = 1 * class15_118_.anInt139;
	anInt128 = 1 * class15_118_.anInt128;
	Class15 class15_120_
	    = Class20.aClass20_212 == class20 ? class15_118_ : class15_119_;
	aShortArray165 = class15_120_.aShortArray165;
	aShortArray117 = class15_120_.aShortArray117;
	aByteArray118 = class15_120_.aByteArray118;
	aShortArray119 = class15_120_.aShortArray119;
	aShortArray120 = class15_120_.aShortArray120;
	aString122 = class15_119_.aString122;
	aBool106 = class15_119_.aBool106;
	if (Class20.aClass20_212 == class20) {
	    anInt131 = class15_119_.anInt131 * 1;
	    anInt174 = 1516612899;
	    if (class15_119_.aBool109)
		aBool129 = false;
	    else
		aBool129 = class15_119_.aBool129;
	} else if (Class20.aClass20_213 == class20) {
	    aString122 = class15_119_.aString164;
	    anInt131
		= ((int) Math.floor((double) (1925627131
					      * class15_119_.anInt131
					      / (-1988624023
						 * class15_119_.anInt116)))
		   * 7728691);
	    anInt174 = 1516612899;
	    aBool172 = class15_119_.aBool172;
	    aBool129 = class15_119_.aBool129;
	    anInt113 = class15_118_.anInt113 * 1;
	    anIntArray135 = class15_118_.anIntArray135;
	    anIntArray136 = class15_118_.anIntArray136;
	    aStringArray134 = new String[5];
	    aStringArray134[0]
		= Class58.aClass58_472.method1245(class672, (byte) -19);
	    aStringArray134[4] = class58.method1245(class672, (byte) -2);
	} else {
	    anInt131 = 0;
	    anInt174 = class15_119_.anInt174 * 1;
	    aBool129 = false;
	    anInt127 = 1 * class15_119_.anInt127;
	    anInt138 = 1 * class15_119_.anInt138;
	    anInt132 = class15_119_.anInt132 * 1;
	    anInt140 = 1 * class15_119_.anInt140;
	    anInt141 = 1 * class15_119_.anInt141;
	    anInt144 = class15_119_.anInt144 * 1;
	    anInt156 = 1 * class15_119_.anInt156;
	    anInt143 = class15_119_.anInt143 * 1;
	    anInt145 = 1 * class15_119_.anInt145;
	    anInt146 = class15_119_.anInt146 * 1;
	    anInt147 = class15_119_.anInt147 * 1;
	    anInt160 = 1 * class15_119_.anInt160;
	    anInt168 = 1 * class15_119_.anInt168;
	    anInt112 = class15_119_.anInt112 * 1;
	    anInt110 = 1 * class15_119_.anInt110;
	    anInt152 = 1 * class15_119_.anInt152;
	    anInt153 = 1 * class15_119_.anInt153;
	    anInt154 = 1 * class15_119_.anInt154;
	    anInt155 = 1 * class15_119_.anInt155;
	    anInt113 = class15_119_.anInt113 * 1;
	    anInt104 = class15_119_.anInt104 * 1;
	    aStringArray133 = class15_119_.aStringArray133;
	    aClass9_176 = class15_119_.aClass9_176;
	    aStringArray134 = new String[5];
	    if (null != class15_119_.aStringArray134) {
		for (int i = 0; i < 4; i++)
		    aStringArray134[i] = class15_119_.aStringArray134[i];
	    }
	    aStringArray134[4] = class58.method1245(class672, (byte) -112);
	}
    }
    
    public final Class183 method693
	(Class185 class185, int i, int i_121_, Class631 class631,
	 Class711 class711, int i_122_, int i_123_, int i_124_, int i_125_) {
	if (null != anIntArray105 && i_121_ > 1) {
	    int i_126_ = -1;
	    for (int i_127_ = 0; i_127_ < 10; i_127_++) {
		if (i_121_ >= anIntArray148[i_127_]
		    && 0 != anIntArray148[i_127_])
		    i_126_ = anIntArray105[i_127_];
	    }
	    if (i_126_ != -1)
		return (((Class15)
			 anInterface14_166.method91(i_126_, -198063240))
			    .method689
			(class185, i, 1, class631, class711, i_122_, i_123_,
			 i_124_, i_125_, 1993166391));
	}
	int i_128_ = i;
	if (class711 != null)
	    i_128_ |= class711.method14360((short) 190);
	Class183 class183;
	synchronized (aClass12_111.aClass203_89) {
	    class183 = ((Class183)
			(aClass12_111.aClass203_89.method3871
			 ((long) (anInt179 * 1404342545
				  | 2098753835 * class185.anInt2001 << 29))));
	}
	if (null == class183
	    || class185.method3330(class183.method3101(), i_128_) != 0) {
	    if (null != class183)
		i_128_ = class185.method3331(i_128_, class183.method3101());
	    int i_129_ = i_128_;
	    if (aShortArray119 != null)
		i_129_ |= 0x8000;
	    if (aShortArray165 != null || null != class631)
		i_129_ |= 0x4000;
	    if (1410820231 * anInt137 != 128)
		i_129_ |= 0x1;
	    if (anInt115 * -157621547 != 128)
		i_129_ |= 0x2;
	    if (anInt157 * -1975843835 != 128)
		i_129_ |= 0x4;
	    Class187 class187 = Class187.method3709(aClass12_111.aClass472_84,
						    -256585207 * anInt114, 0);
	    if (class187 == null)
		return null;
	    if (class187.anInt2082 < 13)
		class187.method3723(2);
	    class183 = class185.method3329(class187, i_129_,
					   1470275403 * aClass12_111.anInt83,
					   64 + -3591593 * anInt169,
					   -2143007317 * anInt175 + 850);
	    if (anInt137 * 1410820231 != 128 || -157621547 * anInt115 != 128
		|| anInt157 * -1975843835 != 128)
		class183.method3021(1410820231 * anInt137,
				    anInt115 * -157621547,
				    -1975843835 * anInt157);
	    if (aShortArray165 != null) {
		for (int i_130_ = 0; i_130_ < aShortArray165.length;
		     i_130_++) {
		    if (aByteArray118 != null && i_130_ < aByteArray118.length)
			class183.method3056(aShortArray165[i_130_],
					    (aShortArray151
					     [aByteArray118[i_130_] & 0xff]));
		    else
			class183.method3056(aShortArray165[i_130_],
					    aShortArray117[i_130_]);
		}
	    }
	    if (null != aShortArray119) {
		for (int i_131_ = 0; i_131_ < aShortArray119.length; i_131_++)
		    class183.method3118(aShortArray119[i_131_],
					aShortArray120[i_131_]);
	    }
	    if (class631 != null) {
		for (int i_132_ = 0; i_132_ < 10; i_132_++) {
		    for (int i_133_ = 0;
			 i_133_ < Class631.aShortArrayArray8218[i_132_].length;
			 i_133_++) {
			if (class631.anIntArray8208[i_132_]
			    < (Class312.aShortArrayArrayArray3371[i_132_]
			       [i_133_]).length)
			    class183.method3056
				(Class631.aShortArrayArray8218[i_132_][i_133_],
				 (Class312.aShortArrayArrayArray3371[i_132_]
				  [i_133_][class631.anIntArray8208[i_132_]]));
		    }
		}
		for (int i_134_ = 0; i_134_ < 10; i_134_++) {
		    for (int i_135_ = 0;
			 i_135_ < Class580.aShortArrayArray7762[i_134_].length;
			 i_135_++) {
			if (class631.anIntArray8213[i_134_]
			    < (Class473.aShortArrayArrayArray5173[i_134_]
			       [i_135_]).length)
			    class183.method3118
				(Class580.aShortArrayArray7762[i_134_][i_135_],
				 (Class473.aShortArrayArrayArray5173[i_134_]
				  [i_135_][class631.anIntArray8213[i_134_]]));
		    }
		}
	    }
	    class183.method3012(i_128_);
	    synchronized (aClass12_111.aClass203_89) {
		aClass12_111.aClass203_89.method3893
		    (class183,
		     (long) (1404342545 * anInt179
			     | 2098753835 * class185.anInt2001 << 29));
	    }
	}
	if (null != class711 || i_125_ != 0) {
	    class183 = class183.method3011((byte) 1, i_128_, true);
	    if (class711 != null)
		class711.method14399(class183, 0, 1640692677);
	    if (i_125_ != 0)
		class183.method3058(i_122_, i_123_, i_124_, i_125_);
	}
	class183.method3012(i);
	return class183;
    }
    
    void method694(Class15 class15_136_, Class15 class15_137_,
		   Class672 class672) {
	method669(Class20.aClass20_212, class15_136_, class15_137_, null,
		  class672, (byte) -4);
    }
    
    public void method79(Class534_Sub40 class534_sub40, byte i) {
	aBool129 = true;
	for (;;) {
	    int i_138_ = class534_sub40.method16527(-576096315);
	    if (i_138_ == 0)
		break;
	    method716(class534_sub40, i_138_, (byte) -93);
	}
    }
    
    public void method81(Class534_Sub40 class534_sub40) {
	aBool129 = true;
	for (;;) {
	    int i = class534_sub40.method16527(650745965);
	    if (i == 0)
		break;
	    method716(class534_sub40, i, (byte) -66);
	}
    }
    
    void method695(Class15 class15_139_, Class15 class15_140_,
		   Class672 class672) {
	method669(Class20.aClass20_215, class15_139_, class15_140_,
		  Class58.aClass58_464, class672, (byte) -82);
    }
    
    void method696(Class15 class15_141_, Class15 class15_142_,
		   Class672 class672) {
	method669(Class20.aClass20_215, class15_141_, class15_142_,
		  Class58.aClass58_464, class672, (byte) -21);
    }
    
    public void method78(Class534_Sub40 class534_sub40) {
	aBool129 = true;
	for (;;) {
	    int i = class534_sub40.method16527(-731271021);
	    if (i == 0)
		break;
	    method716(class534_sub40, i, (byte) -93);
	}
    }
    
    public Class15 method697(int i) {
	if (null != anIntArray105 && i > 1) {
	    int i_143_ = -1;
	    for (int i_144_ = 0; i_144_ < 10; i_144_++) {
		if (i >= anIntArray148[i_144_] && anIntArray148[i_144_] != 0)
		    i_143_ = anIntArray105[i_144_];
	    }
	    if (-1 != i_143_)
		return ((Class15)
			anInterface14_166.method91(i_143_, -417760715));
	}
	return this;
    }
    
    void method698(Class15 class15_145_, Class15 class15_146_,
		   Class672 class672) {
	method669(Class20.aClass20_215, class15_145_, class15_146_,
		  Class58.aClass58_464, class672, (byte) 18);
    }
    
    void method699(Class15 class15_147_, Class15 class15_148_,
		   Class672 class672) {
	method669(Class20.aClass20_213, class15_147_, class15_148_,
		  Class58.aClass58_591, class672, (byte) -9);
    }
    
    public final Class183 method700
	(Class185 class185, int i, int i_149_, Class631 class631,
	 Class711 class711, int i_150_, int i_151_, int i_152_, int i_153_) {
	if (null != anIntArray105 && i_149_ > 1) {
	    int i_154_ = -1;
	    for (int i_155_ = 0; i_155_ < 10; i_155_++) {
		if (i_149_ >= anIntArray148[i_155_]
		    && 0 != anIntArray148[i_155_])
		    i_154_ = anIntArray105[i_155_];
	    }
	    if (i_154_ != -1)
		return (((Class15)
			 anInterface14_166.method91(i_154_, 782887124))
			    .method689
			(class185, i, 1, class631, class711, i_150_, i_151_,
			 i_152_, i_153_, 576251626));
	}
	int i_156_ = i;
	if (class711 != null)
	    i_156_ |= class711.method14360((short) -28899);
	Class183 class183;
	synchronized (aClass12_111.aClass203_89) {
	    class183 = ((Class183)
			(aClass12_111.aClass203_89.method3871
			 ((long) (anInt179 * 1404342545
				  | 2098753835 * class185.anInt2001 << 29))));
	}
	if (null == class183
	    || class185.method3330(class183.method3101(), i_156_) != 0) {
	    if (null != class183)
		i_156_ = class185.method3331(i_156_, class183.method3101());
	    int i_157_ = i_156_;
	    if (aShortArray119 != null)
		i_157_ |= 0x8000;
	    if (aShortArray165 != null || null != class631)
		i_157_ |= 0x4000;
	    if (1410820231 * anInt137 != 128)
		i_157_ |= 0x1;
	    if (anInt115 * -157621547 != 128)
		i_157_ |= 0x2;
	    if (anInt157 * -1975843835 != 128)
		i_157_ |= 0x4;
	    Class187 class187 = Class187.method3709(aClass12_111.aClass472_84,
						    -256585207 * anInt114, 0);
	    if (class187 == null)
		return null;
	    if (class187.anInt2082 < 13)
		class187.method3723(2);
	    class183 = class185.method3329(class187, i_157_,
					   1470275403 * aClass12_111.anInt83,
					   64 + -3591593 * anInt169,
					   -2143007317 * anInt175 + 850);
	    if (anInt137 * 1410820231 != 128 || -157621547 * anInt115 != 128
		|| anInt157 * -1975843835 != 128)
		class183.method3021(1410820231 * anInt137,
				    anInt115 * -157621547,
				    -1975843835 * anInt157);
	    if (aShortArray165 != null) {
		for (int i_158_ = 0; i_158_ < aShortArray165.length;
		     i_158_++) {
		    if (aByteArray118 != null && i_158_ < aByteArray118.length)
			class183.method3056(aShortArray165[i_158_],
					    (aShortArray151
					     [aByteArray118[i_158_] & 0xff]));
		    else
			class183.method3056(aShortArray165[i_158_],
					    aShortArray117[i_158_]);
		}
	    }
	    if (null != aShortArray119) {
		for (int i_159_ = 0; i_159_ < aShortArray119.length; i_159_++)
		    class183.method3118(aShortArray119[i_159_],
					aShortArray120[i_159_]);
	    }
	    if (class631 != null) {
		for (int i_160_ = 0; i_160_ < 10; i_160_++) {
		    for (int i_161_ = 0;
			 i_161_ < Class631.aShortArrayArray8218[i_160_].length;
			 i_161_++) {
			if (class631.anIntArray8208[i_160_]
			    < (Class312.aShortArrayArrayArray3371[i_160_]
			       [i_161_]).length)
			    class183.method3056
				(Class631.aShortArrayArray8218[i_160_][i_161_],
				 (Class312.aShortArrayArrayArray3371[i_160_]
				  [i_161_][class631.anIntArray8208[i_160_]]));
		    }
		}
		for (int i_162_ = 0; i_162_ < 10; i_162_++) {
		    for (int i_163_ = 0;
			 i_163_ < Class580.aShortArrayArray7762[i_162_].length;
			 i_163_++) {
			if (class631.anIntArray8213[i_162_]
			    < (Class473.aShortArrayArrayArray5173[i_162_]
			       [i_163_]).length)
			    class183.method3118
				(Class580.aShortArrayArray7762[i_162_][i_163_],
				 (Class473.aShortArrayArrayArray5173[i_162_]
				  [i_163_][class631.anIntArray8213[i_162_]]));
		    }
		}
	    }
	    class183.method3012(i_156_);
	    synchronized (aClass12_111.aClass203_89) {
		aClass12_111.aClass203_89.method3893
		    (class183,
		     (long) (1404342545 * anInt179
			     | 2098753835 * class185.anInt2001 << 29));
	    }
	}
	if (null != class711 || i_153_ != 0) {
	    class183 = class183.method3011((byte) 1, i_156_, true);
	    if (class711 != null)
		class711.method14399(class183, 0, 1440303216);
	    if (i_153_ != 0)
		class183.method3058(i_150_, i_151_, i_152_, i_153_);
	}
	class183.method3012(i);
	return class183;
    }
    
    public int method701(int i, int i_164_) {
	if (null == anIntArray135)
	    return -1;
	return anIntArray135[i];
    }
    
    public int method702(int i) {
	if (null == anIntArray135)
	    return -1;
	return anIntArray135[i];
    }
    
    int[] method703(Class185 class185, Class185 class185_165_, int i,
		    int i_166_, int i_167_, boolean bool, int i_168_,
		    Class171 class171, Class631 class631, Class632 class632) {
	Class187 class187 = Class187.method3709(aClass12_111.aClass472_84,
						anInt114 * -256585207, 0);
	if (class187 == null)
	    return null;
	if (class187.anInt2082 < 13)
	    class187.method3723(2);
	if (null != aShortArray165) {
	    for (int i_169_ = 0; i_169_ < aShortArray165.length; i_169_++) {
		if (aByteArray118 != null && i_169_ < aByteArray118.length)
		    class187.method3719(aShortArray165[i_169_],
					(aShortArray151
					 [aByteArray118[i_169_] & 0xff]));
		else
		    class187.method3719(aShortArray165[i_169_],
					aShortArray117[i_169_]);
	    }
	}
	if (aShortArray119 != null) {
	    for (int i_170_ = 0; i_170_ < aShortArray119.length; i_170_++)
		class187.method3750(aShortArray119[i_170_],
				    aShortArray120[i_170_]);
	}
	if (null != class631) {
	    for (int i_171_ = 0; i_171_ < 10; i_171_++) {
		for (int i_172_ = 0;
		     i_172_ < Class631.aShortArrayArray8218[i_171_].length;
		     i_172_++) {
		    if (class631.anIntArray8208[i_171_]
			< (Class312.aShortArrayArrayArray3371[i_171_]
			   [i_172_]).length)
			class187.method3719((Class631.aShortArrayArray8218
					     [i_171_][i_172_]),
					    (Class312.aShortArrayArrayArray3371
					     [i_171_][i_172_]
					     [(class631.anIntArray8208
					       [i_171_])]));
		}
	    }
	    for (int i_173_ = 0; i_173_ < 10; i_173_++) {
		for (int i_174_ = 0;
		     i_174_ < Class580.aShortArrayArray7762[i_173_].length;
		     i_174_++) {
		    if (class631.anIntArray8213[i_173_]
			< (Class473.aShortArrayArrayArray5173[i_173_]
			   [i_174_]).length)
			class187.method3750((Class580.aShortArrayArray7762
					     [i_173_][i_174_]),
					    (Class473.aShortArrayArrayArray5173
					     [i_173_][i_174_]
					     [(class631.anIntArray8213
					       [i_173_])]));
		}
	    }
	}
	int i_175_ = 2048;
	boolean bool_176_ = false;
	if (128 != 1410820231 * anInt137 || anInt115 * -157621547 != 128
	    || 128 != anInt157 * -1975843835) {
	    bool_176_ = true;
	    i_175_ |= 0x7;
	}
	Class183 class183 = class185.method3329(class187, i_175_, 64,
						64 + anInt169 * -3591593,
						768 + anInt175 * -2143007317);
	if (!class183.method3060())
	    return null;
	if (bool_176_)
	    class183.method3021(anInt137 * 1410820231, -157621547 * anInt115,
				-1975843835 * anInt157);
	Class163 class163 = null;
	if (-1 != anInt158 * 368739509) {
	    class163
		= aClass12_111.method618(class185, class185_165_,
					 615907051 * anInt159, 10, 1, 0, true,
					 true, 0, class171, class631, class632,
					 anInterface14_166, 241444018);
	    if (class163 == null)
		return null;
	} else if (-160842243 * anInt161 != -1) {
	    class163 = aClass12_111.method618(class185, class185_165_,
					      anInt173 * 443374467, i, i_166_,
					      i_167_, false, true, 0, class171,
					      class631, class632,
					      anInterface14_166, 241444018);
	    if (null == class163)
		return null;
	} else if (25758581 * anInt180 != -1) {
	    class163 = aClass12_111.method618(class185, class185_165_,
					      anInt149 * 398503871, i, i_166_,
					      i_167_, false, true, 0, class171,
					      class631, class632,
					      anInterface14_166, 241444018);
	    if (null == class163)
		return null;
	} else if (-1 != anInt163 * -667959667) {
	    class163
		= aClass12_111.method618(class185, class185_165_,
					 344178797 * anInt162, 10, 1, 0, true,
					 true, 0, class171, class631, class632,
					 anInterface14_166, 241444018);
	    if (null == class163)
		return null;
	}
	int i_177_;
	if (bool)
	    i_177_ = (int) (1.5 * (double) (-528739693 * anInt123)) << 2;
	else if (2 == i_166_)
	    i_177_ = (int) (1.04 * (double) (-528739693 * anInt123)) << 2;
	else
	    i_177_ = anInt123 * -528739693 << 2;
	Class433 class433 = class185.method3339();
	Class433 class433_178_ = class185.method3518();
	class433_178_.method6857(16.0F, 16.0F, 512.0F, 512.0F, 50.0F,
				 2.14748365E9F,
				 (float) class185.method3253(-1028788060)
					     .method2910(),
				 (float) class185.method3253(-172483834)
					     .method2911());
	class185.method3338(class433_178_);
	class185.method3318(0, 0,
			    class185.method3253(-1241315516).method2910(),
			    class185.method3253(-481042937).method2911());
	Class446 class446 = new Class446();
	class185.method3335(class446);
	class185.method3489(0.95F + (float) (Math.random() / 10.0));
	class185.method3341(16777215, 0.95F + (float) (Math.random() / 10.0),
			    0.95F + (float) (Math.random() / 10.0), -50.0F,
			    -10.0F, -50.0F);
	Class446 class446_179_ = class185.method3665();
	class446_179_.method7244(0.0F, 0.0F, 1.0F,
				 Class427.method6799(-(anInt126 * 102672307)
						     << 3));
	class446_179_.method7245(0.0F, 1.0F, 0.0F,
				 Class427
				     .method6799(anInt125 * 1327637973 << 3));
	class446_179_.method7287((float) (-1667459827 * anInt139 << 2),
				 (float) (((i_177_
					    * (Class427.anIntArray4806
					       [-993244079 * anInt124 << 3]))
					   >> 14)
					  - class183.method3045() / 2
					  + (610101213 * anInt128 << 2)),
				 (float) ((610101213 * anInt128 << 2)
					  + ((i_177_
					      * (Class427.anIntArray4805
						 [anInt124 * -993244079 << 3]))
					     >> 14)));
	class446_179_.method7245(1.0F, 0.0F, 0.0F,
				 Class427
				     .method6799(-993244079 * anInt124 << 3));
	class185.method3373(0, 0, 36, 32);
	class185.method3340(2, 0);
	class185.method3298(0, 0, 36, 32, 0, 0);
	class185.method3463(0, -1, 0);
	class183.method3034(class446_179_, null, 1);
	class185.method3338(class433);
	int[] is = class185.method3267(0, 0, 36, 32);
	if (i_166_ >= 1) {
	    is = method704(is, -16777214, (byte) -90);
	    if (i_166_ >= 2)
		is = method704(is, -1, (byte) -85);
	}
	if (0 != i_167_)
	    method678(is, i_167_, 1943219197);
	if (-160842243 * anInt161 != -1)
	    class163.method2656(0, 0);
	else if (-1 != 25758581 * anInt180)
	    class163.method2656(0, 0);
	class185.method3317(is, 0, 36, 36, 32, (byte) -13).method2656(0, 0);
	if (-1 != 368739509 * anInt158)
	    class163.method2656(0, 0);
	if (-667959667 * anInt163 != -1)
	    class163.method2656(0, 0);
	if (1 == i_168_ || i_168_ == 2 && (1 == anInt174 * 1113844363
					   || i != 1) && -1 != i)
	    class171.method2828(Class398.method6578(i,
						    aClass12_111.aClass672_90,
						    class632, 1983550387),
				0, 9, -256, -16777215, (byte) 60);
	is = class185.method3267(0, 0, 36, 32);
	for (int i_180_ = 0; i_180_ < is.length; i_180_++) {
	    if ((is[i_180_] & 0xffffff) == 0)
		is[i_180_] = 0;
	    else
		is[i_180_] |= ~0xffffff;
	}
	return is;
    }
    
    int[] method704(int[] is, int i, byte i_181_) {
	int[] is_182_ = new int[1152];
	int i_183_ = 0;
	for (int i_184_ = 0; i_184_ < 32; i_184_++) {
	    for (int i_185_ = 0; i_185_ < 36; i_185_++) {
		int i_186_ = is[i_183_];
		if (i_186_ == 0) {
		    if (i_185_ > 0 && 0 != is[i_183_ - 1])
			i_186_ = i;
		    else if (i_184_ > 0 && is[i_183_ - 36] != 0)
			i_186_ = i;
		    else if (i_185_ < 35 && is[1 + i_183_] != 0)
			i_186_ = i;
		    else if (i_184_ < 31 && is[36 + i_183_] != 0)
			i_186_ = i;
		}
		is_182_[i_183_++] = i_186_;
	    }
	}
	return is_182_;
    }
    
    int[] method705(Class185 class185, Class185 class185_187_, int i,
		    int i_188_, int i_189_, boolean bool, int i_190_,
		    Class171 class171, Class631 class631, Class632 class632) {
	Class187 class187 = Class187.method3709(aClass12_111.aClass472_84,
						anInt114 * -256585207, 0);
	if (class187 == null)
	    return null;
	if (class187.anInt2082 < 13)
	    class187.method3723(2);
	if (null != aShortArray165) {
	    for (int i_191_ = 0; i_191_ < aShortArray165.length; i_191_++) {
		if (aByteArray118 != null && i_191_ < aByteArray118.length)
		    class187.method3719(aShortArray165[i_191_],
					(aShortArray151
					 [aByteArray118[i_191_] & 0xff]));
		else
		    class187.method3719(aShortArray165[i_191_],
					aShortArray117[i_191_]);
	    }
	}
	if (aShortArray119 != null) {
	    for (int i_192_ = 0; i_192_ < aShortArray119.length; i_192_++)
		class187.method3750(aShortArray119[i_192_],
				    aShortArray120[i_192_]);
	}
	if (null != class631) {
	    for (int i_193_ = 0; i_193_ < 10; i_193_++) {
		for (int i_194_ = 0;
		     i_194_ < Class631.aShortArrayArray8218[i_193_].length;
		     i_194_++) {
		    if (class631.anIntArray8208[i_193_]
			< (Class312.aShortArrayArrayArray3371[i_193_]
			   [i_194_]).length)
			class187.method3719((Class631.aShortArrayArray8218
					     [i_193_][i_194_]),
					    (Class312.aShortArrayArrayArray3371
					     [i_193_][i_194_]
					     [(class631.anIntArray8208
					       [i_193_])]));
		}
	    }
	    for (int i_195_ = 0; i_195_ < 10; i_195_++) {
		for (int i_196_ = 0;
		     i_196_ < Class580.aShortArrayArray7762[i_195_].length;
		     i_196_++) {
		    if (class631.anIntArray8213[i_195_]
			< (Class473.aShortArrayArrayArray5173[i_195_]
			   [i_196_]).length)
			class187.method3750((Class580.aShortArrayArray7762
					     [i_195_][i_196_]),
					    (Class473.aShortArrayArrayArray5173
					     [i_195_][i_196_]
					     [(class631.anIntArray8213
					       [i_195_])]));
		}
	    }
	}
	int i_197_ = 2048;
	boolean bool_198_ = false;
	if (128 != 1410820231 * anInt137 || anInt115 * -157621547 != 128
	    || 128 != anInt157 * -1975843835) {
	    bool_198_ = true;
	    i_197_ |= 0x7;
	}
	Class183 class183 = class185.method3329(class187, i_197_, 64,
						64 + anInt169 * -3591593,
						768 + anInt175 * -2143007317);
	if (!class183.method3060())
	    return null;
	if (bool_198_)
	    class183.method3021(anInt137 * 1410820231, -157621547 * anInt115,
				-1975843835 * anInt157);
	Class163 class163 = null;
	if (-1 != anInt158 * 368739509) {
	    class163
		= aClass12_111.method618(class185, class185_187_,
					 615907051 * anInt159, 10, 1, 0, true,
					 true, 0, class171, class631, class632,
					 anInterface14_166, 241444018);
	    if (class163 == null)
		return null;
	} else if (-160842243 * anInt161 != -1) {
	    class163 = aClass12_111.method618(class185, class185_187_,
					      anInt173 * 443374467, i, i_188_,
					      i_189_, false, true, 0, class171,
					      class631, class632,
					      anInterface14_166, 241444018);
	    if (null == class163)
		return null;
	} else if (25758581 * anInt180 != -1) {
	    class163 = aClass12_111.method618(class185, class185_187_,
					      anInt149 * 398503871, i, i_188_,
					      i_189_, false, true, 0, class171,
					      class631, class632,
					      anInterface14_166, 241444018);
	    if (null == class163)
		return null;
	} else if (-1 != anInt163 * -667959667) {
	    class163
		= aClass12_111.method618(class185, class185_187_,
					 344178797 * anInt162, 10, 1, 0, true,
					 true, 0, class171, class631, class632,
					 anInterface14_166, 241444018);
	    if (null == class163)
		return null;
	}
	int i_199_;
	if (bool)
	    i_199_ = (int) (1.5 * (double) (-528739693 * anInt123)) << 2;
	else if (2 == i_188_)
	    i_199_ = (int) (1.04 * (double) (-528739693 * anInt123)) << 2;
	else
	    i_199_ = anInt123 * -528739693 << 2;
	Class433 class433 = class185.method3339();
	Class433 class433_200_ = class185.method3518();
	class433_200_.method6857(16.0F, 16.0F, 512.0F, 512.0F, 50.0F,
				 2.14748365E9F,
				 (float) class185.method3253(-1013058020)
					     .method2910(),
				 (float) class185.method3253(-281969832)
					     .method2911());
	class185.method3338(class433_200_);
	class185.method3318(0, 0,
			    class185.method3253(-1489798605).method2910(),
			    class185.method3253(-589675444).method2911());
	Class446 class446 = new Class446();
	class185.method3335(class446);
	class185.method3489(0.95F + (float) (Math.random() / 10.0));
	class185.method3341(16777215, 0.95F + (float) (Math.random() / 10.0),
			    0.95F + (float) (Math.random() / 10.0), -50.0F,
			    -10.0F, -50.0F);
	Class446 class446_201_ = class185.method3665();
	class446_201_.method7244(0.0F, 0.0F, 1.0F,
				 Class427.method6799(-(anInt126 * 102672307)
						     << 3));
	class446_201_.method7245(0.0F, 1.0F, 0.0F,
				 Class427
				     .method6799(anInt125 * 1327637973 << 3));
	class446_201_.method7287((float) (-1667459827 * anInt139 << 2),
				 (float) (((i_199_
					    * (Class427.anIntArray4806
					       [-993244079 * anInt124 << 3]))
					   >> 14)
					  - class183.method3045() / 2
					  + (610101213 * anInt128 << 2)),
				 (float) ((610101213 * anInt128 << 2)
					  + ((i_199_
					      * (Class427.anIntArray4805
						 [anInt124 * -993244079 << 3]))
					     >> 14)));
	class446_201_.method7245(1.0F, 0.0F, 0.0F,
				 Class427
				     .method6799(-993244079 * anInt124 << 3));
	class185.method3373(0, 0, 36, 32);
	class185.method3340(2, 0);
	class185.method3298(0, 0, 36, 32, 0, 0);
	class185.method3463(0, -1, 0);
	class183.method3034(class446_201_, null, 1);
	class185.method3338(class433);
	int[] is = class185.method3267(0, 0, 36, 32);
	if (i_188_ >= 1) {
	    is = method704(is, -16777214, (byte) -110);
	    if (i_188_ >= 2)
		is = method704(is, -1, (byte) -100);
	}
	if (0 != i_189_)
	    method678(is, i_189_, 1460966210);
	if (-160842243 * anInt161 != -1)
	    class163.method2656(0, 0);
	else if (-1 != 25758581 * anInt180)
	    class163.method2656(0, 0);
	class185.method3317(is, 0, 36, 36, 32, (byte) -2).method2656(0, 0);
	if (-1 != 368739509 * anInt158)
	    class163.method2656(0, 0);
	if (-667959667 * anInt163 != -1)
	    class163.method2656(0, 0);
	if (1 == i_190_ || i_190_ == 2 && (1 == anInt174 * 1113844363
					   || i != 1) && -1 != i)
	    class171.method2828(Class398.method6578(i,
						    aClass12_111.aClass672_90,
						    class632, 2079285248),
				0, 9, -256, -16777215, (byte) 25);
	is = class185.method3267(0, 0, 36, 32);
	for (int i_202_ = 0; i_202_ < is.length; i_202_++) {
	    if ((is[i_202_] & 0xffffff) == 0)
		is[i_202_] = 0;
	    else
		is[i_202_] |= ~0xffffff;
	}
	return is;
    }
    
    void method706(Class15 class15_203_, Class15 class15_204_,
		   Class672 class672) {
	method669(Class20.aClass20_215, class15_203_, class15_204_,
		  Class58.aClass58_464, class672, (byte) -74);
    }
    
    Class15(int i, Interface14 interface14, Class12 class12) {
	anInt128 = 0;
	anInt174 = 0;
	anInt130 = 567207273;
	anInt131 = 7728691;
	aBool106 = false;
	anInt127 = -973259679;
	anInt138 = 1050999363;
	anInt132 = -897891825;
	anInt140 = -136815417;
	anInt141 = 874697543;
	anInt156 = 1021479021;
	anInt143 = 450865583;
	anInt144 = -300052525;
	anInt145 = 806092569;
	anInt146 = 0;
	anInt147 = 0;
	anInt160 = 0;
	anInt168 = 0;
	anInt112 = 0;
	anInt110 = 0;
	anInt152 = -1816709951;
	anInt153 = -508808041;
	anInt154 = -915857667;
	anInt155 = -159844799;
	anInt158 = -529615261;
	anInt159 = 659179069;
	anInt173 = 1022293205;
	anInt161 = 1424357547;
	anInt162 = 755087003;
	anInt163 = -1767978053;
	aString164 = "null";
	anInt116 = 0;
	anInt137 = -1301374080;
	anInt115 = -1163706752;
	anInt157 = -1667996032;
	anInt169 = 0;
	anInt175 = 0;
	anInt104 = 0;
	aBool172 = false;
	aBool129 = false;
	aBool109 = false;
	anInt167 = 0;
	anInt178 = 0;
	anInt149 = -765149247;
	anInt180 = -1370827997;
	aBool181 = false;
	aBool183 = false;
	anInt179 = -1370718223 * i;
	anInterface14_166 = interface14;
	aClass12_111 = class12;
	aStringArray133 = (String[]) aClass12_111.aStringArray82.clone();
	aStringArray134 = (String[]) aClass12_111.aStringArray91.clone();
    }
    
    void method707(int[] is, int i) {
	for (int i_205_ = 31; i_205_ > 0; i_205_--) {
	    int i_206_ = i_205_ * 36;
	    for (int i_207_ = 35; i_207_ > 0; i_207_--) {
		if (0 == is[i_206_ + i_207_]
		    && is[i_206_ + i_207_ - 1 - 36] != 0)
		    is[i_207_ + i_206_] = i;
	    }
	}
    }
    
    void method708(int[] is, int i) {
	for (int i_208_ = 31; i_208_ > 0; i_208_--) {
	    int i_209_ = i_208_ * 36;
	    for (int i_210_ = 35; i_210_ > 0; i_210_--) {
		if (0 == is[i_209_ + i_210_]
		    && is[i_209_ + i_210_ - 1 - 36] != 0)
		    is[i_210_ + i_209_] = i;
	    }
	}
    }
    
    void method709(int[] is, int i) {
	for (int i_211_ = 31; i_211_ > 0; i_211_--) {
	    int i_212_ = i_211_ * 36;
	    for (int i_213_ = 35; i_213_ > 0; i_213_--) {
		if (0 == is[i_212_ + i_213_]
		    && is[i_212_ + i_213_ - 1 - 36] != 0)
		    is[i_213_ + i_212_] = i;
	    }
	}
    }
    
    static String method710(int i, Class672 class672, Class632 class632) {
	if (i < 100000)
	    return new StringBuilder().append
		       (Class308.method5655(class632.anInt8251 * -1811112665,
					    (byte) 1))
		       .append
		       (i).append
		       (aString184).toString();
	if (i < 10000000)
	    return new StringBuilder().append
		       (Class308.method5655(1015708637 * class632.anInt8252,
					    (byte) 1))
		       .append
		       (i / 1000).append
		       (Class58.aClass58_604.method1245(class672, (byte) -105))
		       .append
		       (aString184).toString();
	return new StringBuilder().append
		   (Class308.method5655(1348295193 * class632.anInt8253,
					(byte) 1))
		   .append
		   (i / 1000000).append
		   (Class58.aClass58_602.method1245(class672, (byte) -5))
		   .append
		   (aString184).toString();
    }
    
    static String method711(int i, Class672 class672, Class632 class632) {
	if (i < 100000)
	    return new StringBuilder().append
		       (Class308.method5655(class632.anInt8251 * -1811112665,
					    (byte) 1))
		       .append
		       (i).append
		       (aString184).toString();
	if (i < 10000000)
	    return new StringBuilder().append
		       (Class308.method5655(1015708637 * class632.anInt8252,
					    (byte) 1))
		       .append
		       (i / 1000).append
		       (Class58.aClass58_604.method1245(class672, (byte) -70))
		       .append
		       (aString184).toString();
	return new StringBuilder().append
		   (Class308.method5655(1348295193 * class632.anInt8253,
					(byte) 1))
		   .append
		   (i / 1000000).append
		   (Class58.aClass58_602.method1245(class672, (byte) -94))
		   .append
		   (aString184).toString();
    }
    
    static String method712(int i, Class672 class672, Class632 class632) {
	if (i < 100000)
	    return new StringBuilder().append
		       (Class308.method5655(class632.anInt8251 * -1811112665,
					    (byte) 1))
		       .append
		       (i).append
		       (aString184).toString();
	if (i < 10000000)
	    return new StringBuilder().append
		       (Class308.method5655(1015708637 * class632.anInt8252,
					    (byte) 1))
		       .append
		       (i / 1000).append
		       (Class58.aClass58_604.method1245(class672, (byte) -99))
		       .append
		       (aString184).toString();
	return new StringBuilder().append
		   (Class308.method5655(1348295193 * class632.anInt8253,
					(byte) 1))
		   .append
		   (i / 1000000).append
		   (Class58.aClass58_602.method1245(class672, (byte) -117))
		   .append
		   (aString184).toString();
    }
    
    public final boolean method713(boolean bool, Class17 class17) {
	int i;
	int i_214_;
	if (bool) {
	    if (null != class17 && class17.anIntArray200 != null) {
		i = class17.anIntArray200[0];
		i_214_ = class17.anIntArray200[1];
	    } else {
		i = anInt154 * -912813653;
		i_214_ = -1648499137 * anInt155;
	    }
	} else if (class17 != null && class17.anIntArray197 != null) {
	    i = class17.anIntArray197[0];
	    i_214_ = class17.anIntArray197[1];
	} else {
	    i = anInt152 * 2038736063;
	    i_214_ = 331707609 * anInt153;
	}
	if (i == -1)
	    return true;
	boolean bool_215_ = true;
	if (!aClass12_111.aClass472_84.method7669(i, 0, 1804616883))
	    bool_215_ = false;
	if (i_214_ != -1
	    && !aClass12_111.aClass472_84.method7669(i_214_, 0, 1804616883))
	    bool_215_ = false;
	return bool_215_;
    }
    
    public final boolean method714(boolean bool, Class17 class17) {
	int i;
	int i_216_;
	if (bool) {
	    if (null != class17 && class17.anIntArray200 != null) {
		i = class17.anIntArray200[0];
		i_216_ = class17.anIntArray200[1];
	    } else {
		i = anInt154 * -912813653;
		i_216_ = -1648499137 * anInt155;
	    }
	} else if (class17 != null && class17.anIntArray197 != null) {
	    i = class17.anIntArray197[0];
	    i_216_ = class17.anIntArray197[1];
	} else {
	    i = anInt152 * 2038736063;
	    i_216_ = 331707609 * anInt153;
	}
	if (i == -1)
	    return true;
	boolean bool_217_ = true;
	if (!aClass12_111.aClass472_84.method7669(i, 0, 1804616883))
	    bool_217_ = false;
	if (i_216_ != -1
	    && !aClass12_111.aClass472_84.method7669(i_216_, 0, 1804616883))
	    bool_217_ = false;
	return bool_217_;
    }
    
    public final boolean method715(boolean bool, Class17 class17) {
	int i;
	int i_218_;
	if (bool) {
	    if (null != class17 && class17.anIntArray200 != null) {
		i = class17.anIntArray200[0];
		i_218_ = class17.anIntArray200[1];
	    } else {
		i = anInt154 * -912813653;
		i_218_ = -1648499137 * anInt155;
	    }
	} else if (class17 != null && class17.anIntArray197 != null) {
	    i = class17.anIntArray197[0];
	    i_218_ = class17.anIntArray197[1];
	} else {
	    i = anInt152 * 2038736063;
	    i_218_ = 331707609 * anInt153;
	}
	if (i == -1)
	    return true;
	boolean bool_219_ = true;
	if (!aClass12_111.aClass472_84.method7669(i, 0, 1804616883))
	    bool_219_ = false;
	if (i_218_ != -1
	    && !aClass12_111.aClass472_84.method7669(i_218_, 0, 1804616883))
	    bool_219_ = false;
	return bool_219_;
    }
    
    void method716(Class534_Sub40 class534_sub40, int i, byte i_220_) {
	if (1 == i)
	    anInt114 = class534_sub40.method16550((byte) -107) * -760062919;
	else if (2 == i)
	    aString122 = class534_sub40.method16541((byte) -120);
	else if (4 == i)
	    anInt123 = class534_sub40.method16529((byte) 1) * 1479531419;
	else if (5 == i)
	    anInt124 = class534_sub40.method16529((byte) 1) * -1823966031;
	else if (6 == i)
	    anInt125 = class534_sub40.method16529((byte) 1) * 884337533;
	else if (7 == i) {
	    anInt139 = class534_sub40.method16529((byte) 1) * -938655291;
	    if (-1667459827 * anInt139 > 32767)
		anInt139 -= 1103429632;
	} else if (i == 8) {
	    anInt128 = class534_sub40.method16529((byte) 1) * 781789301;
	    if (610101213 * anInt128 > 32767)
		anInt128 -= 678756352;
	} else if (11 == i)
	    anInt174 = 1516612899;
	else if (12 == i)
	    anInt131 = class534_sub40.method16533(-258848859) * 7728691;
	else if (i == 13)
	    anInt127 = class534_sub40.method16527(-1467177237) * 973259679;
	else if (14 == i)
	    anInt138 = class534_sub40.method16527(822608940) * -1050999363;
	else if (15 == i)
	    aBool129 = false;
	else if (i == 16)
	    aBool106 = true;
	else if (18 == i)
	    anInt130 = class534_sub40.method16529((byte) 1) * -567207273;
	else if (23 == i)
	    anInt140 = class534_sub40.method16550((byte) -96) * 136815417;
	else if (24 == i)
	    anInt141 = class534_sub40.method16550((byte) -3) * -874697543;
	else if (25 == i)
	    anInt156 = class534_sub40.method16550((byte) 47) * -1021479021;
	else if (i == 26)
	    anInt143 = class534_sub40.method16550((byte) 10) * -450865583;
	else if (27 == i)
	    anInt132 = class534_sub40.method16527(1038732037) * 897891825;
	else if (i >= 30 && i < 35)
	    aStringArray133[i - 30] = class534_sub40.method16541((byte) -105);
	else if (i >= 35 && i < 40)
	    aStringArray134[i - 35] = class534_sub40.method16541((byte) -29);
	else if (40 == i) {
	    int i_221_ = class534_sub40.method16527(1672219550);
	    aShortArray165 = new short[i_221_];
	    aShortArray117 = new short[i_221_];
	    for (int i_222_ = 0; i_222_ < i_221_; i_222_++) {
		aShortArray165[i_222_]
		    = (short) class534_sub40.method16529((byte) 1);
		aShortArray117[i_222_]
		    = (short) class534_sub40.method16529((byte) 1);
	    }
	} else if (41 == i) {
	    int i_223_ = class534_sub40.method16527(585088080);
	    aShortArray119 = new short[i_223_];
	    aShortArray120 = new short[i_223_];
	    for (int i_224_ = 0; i_224_ < i_223_; i_224_++) {
		aShortArray119[i_224_]
		    = (short) class534_sub40.method16529((byte) 1);
		aShortArray120[i_224_]
		    = (short) class534_sub40.method16529((byte) 1);
	    }
	} else if (42 == i) {
	    int i_225_ = class534_sub40.method16527(1282807290);
	    aByteArray118 = new byte[i_225_];
	    for (int i_226_ = 0; i_226_ < i_225_; i_226_++)
		aByteArray118[i_226_] = class534_sub40.method16586((byte) 1);
	} else if (i == 43) {
	    anInt182 = class534_sub40.method16533(-258848859) * 1685577753;
	    aBool181 = true;
	} else if (44 == i) {
	    int i_227_ = class534_sub40.method16529((byte) 1);
	    int i_228_ = 0;
	    for (int i_229_ = i_227_; i_229_ > 0; i_229_ >>= 1)
		i_228_++;
	    aByteArray121 = new byte[i_228_];
	    byte i_230_ = 0;
	    for (int i_231_ = 0; i_231_ < i_228_; i_231_++) {
		if ((i_227_ & 1 << i_231_) > 0) {
		    aByteArray121[i_231_] = i_230_;
		    i_230_++;
		} else
		    aByteArray121[i_231_] = (byte) -1;
	    }
	} else if (i == 45) {
	    int i_232_ = class534_sub40.method16529((byte) 1);
	    int i_233_ = 0;
	    for (int i_234_ = i_232_; i_234_ > 0; i_234_ >>= 1)
		i_233_++;
	    aByteArray150 = new byte[i_233_];
	    byte i_235_ = 0;
	    for (int i_236_ = 0; i_236_ < i_233_; i_236_++) {
		if ((i_232_ & 1 << i_236_) > 0) {
		    aByteArray150[i_236_] = i_235_;
		    i_235_++;
		} else
		    aByteArray150[i_236_] = (byte) -1;
	    }
	} else if (i == 65)
	    aBool172 = true;
	else if (78 == i)
	    anInt144 = class534_sub40.method16550((byte) 71) * 300052525;
	else if (79 == i)
	    anInt145 = class534_sub40.method16550((byte) -79) * -806092569;
	else if (i == 90)
	    anInt152 = class534_sub40.method16550((byte) 58) * 1816709951;
	else if (i == 91)
	    anInt154 = class534_sub40.method16550((byte) 32) * 915857667;
	else if (i == 92)
	    anInt153 = class534_sub40.method16550((byte) -98) * 508808041;
	else if (i == 93)
	    anInt155 = class534_sub40.method16550((byte) 3) * 159844799;
	else if (94 == i)
	    anInt113 = class534_sub40.method16529((byte) 1) * 1358791503;
	else if (95 == i)
	    anInt126 = class534_sub40.method16529((byte) 1) * -808558725;
	else if (96 == i)
	    anInt167 = class534_sub40.method16527(-593303214) * -1506421027;
	else if (97 == i)
	    anInt159 = class534_sub40.method16529((byte) 1) * -659179069;
	else if (98 == i)
	    anInt158 = class534_sub40.method16529((byte) 1) * 529615261;
	else if (i >= 100 && i < 110) {
	    if (null == anIntArray105) {
		anIntArray105 = new int[10];
		anIntArray148 = new int[10];
	    }
	    anIntArray105[i - 100] = class534_sub40.method16529((byte) 1);
	    anIntArray148[i - 100] = class534_sub40.method16529((byte) 1);
	} else if (i == 110)
	    anInt137 = class534_sub40.method16529((byte) 1) * 862248247;
	else if (i == 111)
	    anInt115 = class534_sub40.method16529((byte) 1) * -847952259;
	else if (112 == i)
	    anInt157 = class534_sub40.method16529((byte) 1) * 1027156173;
	else if (113 == i)
	    anInt169 = class534_sub40.method16586((byte) 1) * -435693209;
	else if (114 == i)
	    anInt175 = class534_sub40.method16586((byte) 1) * -235054833;
	else if (115 == i)
	    anInt104 = class534_sub40.method16527(1605802046) * 1846715605;
	else if (i == 121)
	    anInt173 = class534_sub40.method16529((byte) 1) * -1022293205;
	else if (122 == i)
	    anInt161 = class534_sub40.method16529((byte) 1) * -1424357547;
	else if (125 == i) {
	    anInt146
		= (class534_sub40.method16586((byte) 1) << 2) * -1734336985;
	    anInt160 = (class534_sub40.method16586((byte) 1) << 2) * 136039909;
	    anInt112
		= (class534_sub40.method16586((byte) 1) << 2) * 2126123719;
	} else if (126 == i) {
	    anInt147 = (class534_sub40.method16586((byte) 1) << 2) * 486110561;
	    anInt168 = (class534_sub40.method16586((byte) 1) << 2) * 52055165;
	    anInt110
		= (class534_sub40.method16586((byte) 1) << 2) * -2030933451;
	} else if (127 == i || i == 128 || i == 129 || 130 == i) {
	    class534_sub40.method16527(829629298);
	    class534_sub40.method16529((byte) 1);
	} else if (i == 132) {
	    int i_237_ = class534_sub40.method16527(1260816720);
	    anIntArray177 = new int[i_237_];
	    for (int i_238_ = 0; i_238_ < i_237_; i_238_++)
		anIntArray177[i_238_] = class534_sub40.method16529((byte) 1);
	} else if (134 == i)
	    anInt178 = class534_sub40.method16527(-446642099) * 88595571;
	else if (139 == i)
	    anInt149 = class534_sub40.method16529((byte) 1) * 765149247;
	else if (140 == i)
	    anInt180 = class534_sub40.method16529((byte) 1) * 1370827997;
	else if (i >= 142 && i < 147) {
	    if (null == anIntArray135) {
		anIntArray135 = new int[6];
		Arrays.fill(anIntArray135, -1);
	    }
	    anIntArray135[i - 142] = class534_sub40.method16529((byte) 1);
	} else if (i >= 150 && i < 155) {
	    if (anIntArray136 == null) {
		anIntArray136 = new int[5];
		Arrays.fill(anIntArray136, -1);
	    }
	    anIntArray136[i - 150] = class534_sub40.method16529((byte) 1);
	} else if (156 != i) {
	    if (i == 157)
		aBool183 = true;
	    else if (161 == i)
		anInt162 = class534_sub40.method16529((byte) 1) * -755087003;
	    else if (i == 162)
		anInt163 = class534_sub40.method16529((byte) 1) * 1767978053;
	    else if (i == 163)
		anInt116 = class534_sub40.method16529((byte) 1) * -1339515175;
	    else if (164 == i)
		aString164 = class534_sub40.method16541((byte) -46);
	    else if (165 == i)
		anInt174 = -1261741498;
	    else if (167 == i)
		aBool109 = true;
	    else if (i == 249) {
		int i_239_ = class534_sub40.method16527(-731745321);
		if (null == aClass9_176) {
		    int i_240_ = Class162.method2640(i_239_, (byte) 66);
		    aClass9_176 = new Class9(i_240_);
		}
		for (int i_241_ = 0; i_241_ < i_239_; i_241_++) {
		    boolean bool
			= class534_sub40.method16527(-1216794619) == 1;
		    int i_242_ = class534_sub40.method16531(613657843);
		    Class534 class534;
		    if (bool)
			class534
			    = new Class534_Sub6(class534_sub40
						    .method16541((byte) -8));
		    else
			class534
			    = new Class534_Sub39(class534_sub40
						     .method16533(-258848859));
		    aClass9_176.method581(class534, (long) i_242_);
		}
	    }
	}
    }
    
    public final Class187 method717(boolean bool, Class17 class17) {
	int i;
	int i_243_;
	if (bool) {
	    if (null != class17 && null != class17.anIntArray200) {
		i = class17.anIntArray200[0];
		i_243_ = class17.anIntArray200[1];
	    } else {
		i = anInt154 * -912813653;
		i_243_ = anInt155 * -1648499137;
	    }
	} else if (class17 != null && null != class17.anIntArray197) {
	    i = class17.anIntArray197[0];
	    i_243_ = class17.anIntArray197[1];
	} else {
	    i = anInt152 * 2038736063;
	    i_243_ = anInt153 * 331707609;
	}
	if (-1 == i)
	    return null;
	Class187 class187
	    = Class187.method3709(aClass12_111.aClass472_84, i, 0);
	if (class187.anInt2082 < 13)
	    class187.method3723(2);
	if (-1 != i_243_) {
	    Class187 class187_244_
		= Class187.method3709(aClass12_111.aClass472_84, i_243_, 0);
	    if (class187_244_.anInt2082 < 13)
		class187_244_.method3723(2);
	    Class187[] class187s = { class187, class187_244_ };
	    class187 = new Class187(class187s, 2);
	}
	if (null != aShortArray165) {
	    short[] is;
	    if (class17 != null && null != class17.aShortArray199)
		is = class17.aShortArray199;
	    else
		is = aShortArray117;
	    for (int i_245_ = 0; i_245_ < aShortArray165.length; i_245_++)
		class187.method3719(aShortArray165[i_245_], is[i_245_]);
	}
	if (null != aShortArray119) {
	    short[] is;
	    if (class17 != null && null != class17.aShortArray192)
		is = class17.aShortArray192;
	    else
		is = aShortArray120;
	    for (int i_246_ = 0; i_246_ < aShortArray119.length; i_246_++)
		class187.method3750(aShortArray119[i_246_], is[i_246_]);
	}
	return class187;
    }
    
    public int method718(int i, int i_247_) {
	if (null == aClass9_176)
	    return i_247_;
	Class534_Sub39 class534_sub39
	    = (Class534_Sub39) aClass9_176.method579((long) i);
	if (class534_sub39 == null)
	    return i_247_;
	return -705967177 * class534_sub39.anInt10807;
    }
    
    public int method719(int i, int i_248_) {
	if (null == aClass9_176)
	    return i_248_;
	Class534_Sub39 class534_sub39
	    = (Class534_Sub39) aClass9_176.method579((long) i);
	if (class534_sub39 == null)
	    return i_248_;
	return -705967177 * class534_sub39.anInt10807;
    }
    
    public int method720(int i, int i_249_) {
	if (null == aClass9_176)
	    return i_249_;
	Class534_Sub39 class534_sub39
	    = (Class534_Sub39) aClass9_176.method579((long) i);
	if (class534_sub39 == null)
	    return i_249_;
	return -705967177 * class534_sub39.anInt10807;
    }
    
    void method721(Class15 class15_250_, Class15 class15_251_,
		   Class672 class672) {
	method669(Class20.aClass20_212, class15_250_, class15_251_, null,
		  class672, (byte) -60);
    }
    
    public final Class187 method722(boolean bool, Class17 class17) {
	int i;
	int i_252_;
	if (bool) {
	    if (null != class17 && null != class17.anIntArray200) {
		i = class17.anIntArray200[0];
		i_252_ = class17.anIntArray200[1];
	    } else {
		i = anInt154 * -912813653;
		i_252_ = anInt155 * -1648499137;
	    }
	} else if (class17 != null && null != class17.anIntArray197) {
	    i = class17.anIntArray197[0];
	    i_252_ = class17.anIntArray197[1];
	} else {
	    i = anInt152 * 2038736063;
	    i_252_ = anInt153 * 331707609;
	}
	if (-1 == i)
	    return null;
	Class187 class187
	    = Class187.method3709(aClass12_111.aClass472_84, i, 0);
	if (class187.anInt2082 < 13)
	    class187.method3723(2);
	if (-1 != i_252_) {
	    Class187 class187_253_
		= Class187.method3709(aClass12_111.aClass472_84, i_252_, 0);
	    if (class187_253_.anInt2082 < 13)
		class187_253_.method3723(2);
	    Class187[] class187s = { class187, class187_253_ };
	    class187 = new Class187(class187s, 2);
	}
	if (null != aShortArray165) {
	    short[] is;
	    if (class17 != null && null != class17.aShortArray199)
		is = class17.aShortArray199;
	    else
		is = aShortArray117;
	    for (int i_254_ = 0; i_254_ < aShortArray165.length; i_254_++)
		class187.method3719(aShortArray165[i_254_], is[i_254_]);
	}
	if (null != aShortArray119) {
	    short[] is;
	    if (class17 != null && null != class17.aShortArray192)
		is = class17.aShortArray192;
	    else
		is = aShortArray120;
	    for (int i_255_ = 0; i_255_ < aShortArray119.length; i_255_++)
		class187.method3750(aShortArray119[i_255_], is[i_255_]);
	}
	return class187;
    }
    
    int[] method723(Class185 class185, Class185 class185_256_, int i,
		    int i_257_, int i_258_, boolean bool, int i_259_,
		    Class171 class171, Class631 class631, Class632 class632) {
	Class187 class187 = Class187.method3709(aClass12_111.aClass472_84,
						anInt114 * -256585207, 0);
	if (class187 == null)
	    return null;
	if (class187.anInt2082 < 13)
	    class187.method3723(2);
	if (null != aShortArray165) {
	    for (int i_260_ = 0; i_260_ < aShortArray165.length; i_260_++) {
		if (aByteArray118 != null && i_260_ < aByteArray118.length)
		    class187.method3719(aShortArray165[i_260_],
					(aShortArray151
					 [aByteArray118[i_260_] & 0xff]));
		else
		    class187.method3719(aShortArray165[i_260_],
					aShortArray117[i_260_]);
	    }
	}
	if (aShortArray119 != null) {
	    for (int i_261_ = 0; i_261_ < aShortArray119.length; i_261_++)
		class187.method3750(aShortArray119[i_261_],
				    aShortArray120[i_261_]);
	}
	if (null != class631) {
	    for (int i_262_ = 0; i_262_ < 10; i_262_++) {
		for (int i_263_ = 0;
		     i_263_ < Class631.aShortArrayArray8218[i_262_].length;
		     i_263_++) {
		    if (class631.anIntArray8208[i_262_]
			< (Class312.aShortArrayArrayArray3371[i_262_]
			   [i_263_]).length)
			class187.method3719((Class631.aShortArrayArray8218
					     [i_262_][i_263_]),
					    (Class312.aShortArrayArrayArray3371
					     [i_262_][i_263_]
					     [(class631.anIntArray8208
					       [i_262_])]));
		}
	    }
	    for (int i_264_ = 0; i_264_ < 10; i_264_++) {
		for (int i_265_ = 0;
		     i_265_ < Class580.aShortArrayArray7762[i_264_].length;
		     i_265_++) {
		    if (class631.anIntArray8213[i_264_]
			< (Class473.aShortArrayArrayArray5173[i_264_]
			   [i_265_]).length)
			class187.method3750((Class580.aShortArrayArray7762
					     [i_264_][i_265_]),
					    (Class473.aShortArrayArrayArray5173
					     [i_264_][i_265_]
					     [(class631.anIntArray8213
					       [i_264_])]));
		}
	    }
	}
	int i_266_ = 2048;
	boolean bool_267_ = false;
	if (128 != 1410820231 * anInt137 || anInt115 * -157621547 != 128
	    || 128 != anInt157 * -1975843835) {
	    bool_267_ = true;
	    i_266_ |= 0x7;
	}
	Class183 class183 = class185.method3329(class187, i_266_, 64,
						64 + anInt169 * -3591593,
						768 + anInt175 * -2143007317);
	if (!class183.method3060())
	    return null;
	if (bool_267_)
	    class183.method3021(anInt137 * 1410820231, -157621547 * anInt115,
				-1975843835 * anInt157);
	Class163 class163 = null;
	if (-1 != anInt158 * 368739509) {
	    class163
		= aClass12_111.method618(class185, class185_256_,
					 615907051 * anInt159, 10, 1, 0, true,
					 true, 0, class171, class631, class632,
					 anInterface14_166, 241444018);
	    if (class163 == null)
		return null;
	} else if (-160842243 * anInt161 != -1) {
	    class163 = aClass12_111.method618(class185, class185_256_,
					      anInt173 * 443374467, i, i_257_,
					      i_258_, false, true, 0, class171,
					      class631, class632,
					      anInterface14_166, 241444018);
	    if (null == class163)
		return null;
	} else if (25758581 * anInt180 != -1) {
	    class163 = aClass12_111.method618(class185, class185_256_,
					      anInt149 * 398503871, i, i_257_,
					      i_258_, false, true, 0, class171,
					      class631, class632,
					      anInterface14_166, 241444018);
	    if (null == class163)
		return null;
	} else if (-1 != anInt163 * -667959667) {
	    class163
		= aClass12_111.method618(class185, class185_256_,
					 344178797 * anInt162, 10, 1, 0, true,
					 true, 0, class171, class631, class632,
					 anInterface14_166, 241444018);
	    if (null == class163)
		return null;
	}
	int i_268_;
	if (bool)
	    i_268_ = (int) (1.5 * (double) (-528739693 * anInt123)) << 2;
	else if (2 == i_257_)
	    i_268_ = (int) (1.04 * (double) (-528739693 * anInt123)) << 2;
	else
	    i_268_ = anInt123 * -528739693 << 2;
	Class433 class433 = class185.method3339();
	Class433 class433_269_ = class185.method3518();
	class433_269_.method6857(16.0F, 16.0F, 512.0F, 512.0F, 50.0F,
				 2.14748365E9F,
				 (float) class185.method3253(-1514275004)
					     .method2910(),
				 (float) class185.method3253(-89029569)
					     .method2911());
	class185.method3338(class433_269_);
	class185.method3318(0, 0,
			    class185.method3253(-1169170622).method2910(),
			    class185.method3253(-460602955).method2911());
	Class446 class446 = new Class446();
	class185.method3335(class446);
	class185.method3489(0.95F + (float) (Math.random() / 10.0));
	class185.method3341(16777215, 0.95F + (float) (Math.random() / 10.0),
			    0.95F + (float) (Math.random() / 10.0), -50.0F,
			    -10.0F, -50.0F);
	Class446 class446_270_ = class185.method3665();
	class446_270_.method7244(0.0F, 0.0F, 1.0F,
				 Class427.method6799(-(anInt126 * 102672307)
						     << 3));
	class446_270_.method7245(0.0F, 1.0F, 0.0F,
				 Class427
				     .method6799(anInt125 * 1327637973 << 3));
	class446_270_.method7287((float) (-1667459827 * anInt139 << 2),
				 (float) (((i_268_
					    * (Class427.anIntArray4806
					       [-993244079 * anInt124 << 3]))
					   >> 14)
					  - class183.method3045() / 2
					  + (610101213 * anInt128 << 2)),
				 (float) ((610101213 * anInt128 << 2)
					  + ((i_268_
					      * (Class427.anIntArray4805
						 [anInt124 * -993244079 << 3]))
					     >> 14)));
	class446_270_.method7245(1.0F, 0.0F, 0.0F,
				 Class427
				     .method6799(-993244079 * anInt124 << 3));
	class185.method3373(0, 0, 36, 32);
	class185.method3340(2, 0);
	class185.method3298(0, 0, 36, 32, 0, 0);
	class185.method3463(0, -1, 0);
	class183.method3034(class446_270_, null, 1);
	class185.method3338(class433);
	int[] is = class185.method3267(0, 0, 36, 32);
	if (i_257_ >= 1) {
	    is = method704(is, -16777214, (byte) -84);
	    if (i_257_ >= 2)
		is = method704(is, -1, (byte) -31);
	}
	if (0 != i_258_)
	    method678(is, i_258_, 1743151735);
	if (-160842243 * anInt161 != -1)
	    class163.method2656(0, 0);
	else if (-1 != 25758581 * anInt180)
	    class163.method2656(0, 0);
	class185.method3317(is, 0, 36, 36, 32, (byte) -40).method2656(0, 0);
	if (-1 != 368739509 * anInt158)
	    class163.method2656(0, 0);
	if (-667959667 * anInt163 != -1)
	    class163.method2656(0, 0);
	if (1 == i_259_ || i_259_ == 2 && (1 == anInt174 * 1113844363
					   || i != 1) && -1 != i)
	    class171.method2828(Class398.method6578(i,
						    aClass12_111.aClass672_90,
						    class632, 1985445060),
				0, 9, -256, -16777215, (byte) 124);
	is = class185.method3267(0, 0, 36, 32);
	for (int i_271_ = 0; i_271_ < is.length; i_271_++) {
	    if ((is[i_271_] & 0xffffff) == 0)
		is[i_271_] = 0;
	    else
		is[i_271_] |= ~0xffffff;
	}
	return is;
    }
    
    static void method724(Class247 class247, Class246 class246, int i,
			  int i_272_, int i_273_, int i_274_, int i_275_,
			  long l) {
	int i_276_ = i_273_ * i_273_ + i_274_ * i_274_;
	if ((long) i_276_ <= l) {
	    int i_277_;
	    if (Class10.anInt75 * -891094135 == 3)
		i_277_ = ((int) ((double) Class599.aClass298_Sub1_7871
					      .method5389(-993625827)
				 * 2607.5945876176133)
			  + client.anInt11189 * -2045337339) & 0x3fff;
	    else if (5 == -891094135 * Class10.anInt75)
		i_277_ = (int) client.aFloat11140 & 0x3fff;
	    else
		i_277_ = ((int) client.aFloat11140
			  + -2045337339 * client.anInt11189) & 0x3fff;
	    int i_278_ = Class427.anIntArray4806[i_277_];
	    int i_279_ = Class427.anIntArray4805[i_277_];
	    if (5 != Class10.anInt75 * -891094135) {
		i_278_
		    = i_278_ * 256 / (client.anInt11022 * -2002513841 + 256);
		i_279_
		    = 256 * i_279_ / (256 + client.anInt11022 * -2002513841);
	    }
	    int i_280_ = i_279_ * i_273_ + i_278_ * i_274_ >> 14;
	    int i_281_ = i_279_ * i_274_ - i_273_ * i_278_ >> 14;
	    Class163 class163 = Class530.aClass163Array7133[i_275_];
	    int i_282_ = class163.method2647();
	    int i_283_ = class163.method2649();
	    int i_284_
		= class247.anInt2468 * -881188269 / 2 + i_280_ - i_282_ / 2;
	    int i_285_ = i_284_ + i_282_;
	    int i_286_
		= class247.anInt2469 * -1279656873 / 2 + -i_281_ - i_283_;
	    int i_287_ = i_286_ + i_283_;
	    boolean bool;
	    if (null != class246)
		bool = (!class246.method4504(i_284_, i_286_, -353361396)
			|| !class246.method4504(i_285_, i_286_, 490245092)
			|| !class246.method4504(i_284_, i_287_, 197445614)
			|| !class246.method4504(i_285_, i_287_, -1763568406));
	    else {
		int i_288_ = i_283_;
		int i_289_ = i_282_ / 2;
		bool = (i_286_ <= -i_288_
			|| i_287_ >= -1279656873 * class247.anInt2469
			|| i_284_ <= -i_289_
			|| i_285_ >= i_289_ + class247.anInt2468 * -881188269);
	    }
	    if (bool) {
		double d = Math.atan2((double) i_280_, (double) i_281_);
		double d_290_ = Math.atan2((double) Math.abs(i_280_),
					   (double) Math.abs(i_281_));
		double d_291_ = Math.atan2((double) (-881188269
						     * class247.anInt2468 / 2),
					   (double) (class247.anInt2469
						     * -1279656873 / 2));
		boolean bool_292_ = false;
		double d_293_ = 0.0;
		int i_294_;
		if (d_290_ < d_291_) {
		    d_293_ = 1.5707963267948966 - d;
		    i_294_ = -1279656873 * class247.anInt2469 / 2;
		} else {
		    d_293_ = d;
		    i_294_ = -881188269 * class247.anInt2468 / 2;
		}
		int i_295_ = Math.abs((int) -((double) i_294_
					      * Math.sin(1.5707963267948966)
					      / Math.sin(d_293_)));
		Class310.aClass163Array3359[i_275_].method2664
		    ((0.0F
		      + ((float) i
			 + (float) (-881188269 * class247.anInt2468) / 2.0F)),
		     ((float) i_272_
		      + (float) (-1279656873 * class247.anInt2469) / 2.0F
		      - 0.0F),
		     ((float) Class310.aClass163Array3359[i_275_].method22()
		      / 2.0F),
		     (float) i_295_, 4096,
		     (int) (-d / 6.283185307179586 * 65535.0));
	    } else if (null != class246)
		class163.method2691(i + i_284_, i_272_ + i_286_,
				    class246.aClass145_2423, i, i_272_);
	    else
		class163.method2656(i + i_284_, i_272_ + i_286_);
	}
    }
}
