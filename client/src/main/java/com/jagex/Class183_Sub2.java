/* Class183_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class183_Sub2 extends Class183
{
    short[] aShortArray9428;
    float[][] aFloatArrayArray9429;
    byte[] aByteArray9430;
    Class101 aClass101_9431;
    int anInt9432;
    static final int anInt9433 = 4;
    static int anInt9434;
    static final int anInt9435 = -1;
    static int anInt9436 = 4096;
    Class101 aClass101_9437;
    static final int anInt9438 = 7;
    static final int anInt9439 = 618520;
    int anInt9440;
    int anInt9441;
    int[] anIntArray9442;
    int anInt9443;
    int anInt9444;
    short[] aShortArray9445;
    short[] aShortArray9446;
    int[] anIntArray9447;
    int[] anIntArray9448;
    short aShort9449;
    Class96[] aClass96Array9450;
    Class96[] aClass96Array9451;
    float[][] aFloatArrayArray9452;
    int anInt9453;
    int anInt9454;
    short[] aShortArray9455;
    short[] aShortArray9456;
    int[][] anIntArrayArray9457;
    int anInt9458;
    int[] anIntArray9459;
    int[] anIntArray9460;
    int[] anIntArray9461;
    static final int anInt9462 = 0;
    static final int anInt9463 = 618648;
    static final int anInt9464 = 2;
    int anInt9465;
    Class107[] aClass107Array9466;
    byte[] aByteArray9467;
    short aShort9468;
    byte[] aByteArray9469;
    int[][] anIntArrayArray9470;
    short[] aShortArray9471;
    short[] aShortArray9472;
    short aShort9473;
    int anInt9474;
    Class185_Sub2 aClass185_Sub2_9475;
    boolean aBool9476;
    boolean aBool9477;
    static final int anInt9478 = -2;
    short[] aShortArray9479;
    int[] anIntArray9480;
    int anInt9481;
    Class172[] aClass172Array9482;
    Class158[] aClass158Array9483;
    int anInt9484;
    Class118[] aClass118Array9485;
    Class117[] aClass117Array9486;
    int[][] anIntArrayArray9487;
    boolean aBool9488;
    Class119 aClass119_9489;
    short aShort9490;
    short aShort9491;
    short aShort9492;
    short aShort9493;
    int[] anIntArray9494;
    short aShort9495;
    float[] aFloatArray9496;
    boolean aBool9497 = false;
    short aShort9498;
    boolean aBool9499;
    boolean aBool9500;
    static int anInt9501;
    int[] anIntArray9502;
    float[] aFloatArray9503;
    boolean aBool9504;
    float[] aFloatArray9505;
    float[] aFloatArray9506;
    int[] anIntArray9507;
    static final int anInt9508 = 1;
    int[] anIntArray9509;
    int[] anIntArray9510;
    int[] anIntArray9511;
    boolean aBool9512;
    Class183_Sub2[] aClass183_Sub2Array9513;
    Class183_Sub2[] aClass183_Sub2Array9514;
    
    int method15090(int i, int i_0_) {
	i_0_ = i_0_ * (i & 0x7f) >> 7;
	if (i_0_ < 2)
	    i_0_ = 2;
	else if (i_0_ > 126)
	    i_0_ = 126;
	return (i & 0xff80) + i_0_;
    }
    
    Class183_Sub2(Class185_Sub2 class185_sub2, Class187 class187, int i,
		  int i_1_, int i_2_, int i_3_) {
	anInt9444 = 0;
	anInt9474 = 0;
	anInt9440 = 0;
	anInt9453 = 0;
	anInt9432 = 0;
	aBool9477 = false;
	aBool9504 = false;
	aBool9488 = false;
	aBool9512 = false;
	aBool9499 = false;
	aBool9500 = false;
	aClass185_Sub2_9475 = class185_sub2;
	anInt9441 = i;
	anInt9454 = i_1_;
	anInt9443 = i_2_;
	Class177 class177 = aClass185_Sub2_9475.aClass177_2012;
	Interface45 interface45 = aClass185_Sub2_9475.anInterface45_1999;
	anInt9444 = class187.anInt2081;
	anInt9474 = class187.anInt2106;
	anIntArray9494 = class187.anIntArray2083;
	anIntArray9447 = class187.anIntArray2080;
	anIntArray9448 = class187.anIntArray2113;
	anInt9440 = class187.anInt2092;
	aShortArray9479 = class187.aShortArray2093;
	aShortArray9455 = class187.aShortArray2077;
	aShortArray9456 = class187.aShortArray2095;
	aByteArray9430 = class187.aByteArray2100;
	aShortArray9471 = class187.aShortArray2096;
	aByteArray9469 = class187.aByteArray2101;
	aShortArray9472 = class187.aShortArray2094;
	aByteArray9467 = class187.aByteArray2099;
	aClass172Array9482 = class187.aClass172Array2123;
	aClass158Array9483 = class187.aClass158Array2124;
	aShortArray9445 = class187.aShortArray2088;
	anInt9453 = anInt9440;
	int[] is = new int[anInt9440];
	for (int i_4_ = 0; i_4_ < anInt9440; i_4_++)
	    is[i_4_] = i_4_;
	long[] ls = new long[anInt9440];
	boolean bool = (anInt9441 & 0x100) != 0;
	for (int i_5_ = 0; i_5_ < anInt9440; i_5_++) {
	    int i_6_ = is[i_5_];
	    Class186 class186 = null;
	    int i_7_ = 0;
	    int i_8_ = 0;
	    int i_9_ = 0;
	    int i_10_ = 0;
	    if (class187.aClass168Array2125 != null) {
		boolean bool_11_ = false;
		for (int i_12_ = 0; i_12_ < class187.aClass168Array2125.length;
		     i_12_++) {
		    Class168 class168 = class187.aClass168Array2125[i_12_];
		    if (i_6_ == class168.anInt1791 * 1329690033) {
			Class383 class383
			    = interface45.method344((class168.anInt1788
						     * 452560563),
						    -1500346102);
			if (class383.aBool3942)
			    bool_11_ = true;
			if (class383.anInt3936 * 651115273 != -1) {
			    Class186 class186_13_
				= class177.method2931((class383.anInt3936
						       * 651115273),
						      (byte) 1);
			    if (class186_13_.aClass599_2064
				== Class599.aClass599_7870)
				aBool9499 = true;
			}
		    }
		}
		if (bool_11_) {
		    ls[i_5_] = 9223372036854775807L;
		    anInt9453--;
		    continue;
		}
	    }
	    if (class187.aClass172Array2123 != null) {
		boolean bool_14_ = false;
		for (int i_15_ = 0; i_15_ < class187.aClass172Array2123.length;
		     i_15_++) {
		    Class172 class172 = class187.aClass172Array2123[i_15_];
		    if (i_6_ == class172.anInt1810 * -1916225325) {
			Class385 class385
			    = (aClass185_Sub2_9475.anInterface48_2000.method354
			       (class172.anInt1811 * 1708272351, 269558846));
			if (class385.aBool4039)
			    bool_14_ = true;
		    }
		}
		if (bool_14_) {
		    ls[i_5_] = 9223372036854775807L;
		    anInt9453--;
		    continue;
		}
	    }
	    int i_16_ = -1;
	    if (class187.aShortArray2104 != null) {
		i_16_ = class187.aShortArray2104[i_6_];
		if (i_16_ != -1) {
		    class186 = class177.method2931(i_16_ & 0xffff, (byte) 1);
		    if ((i_3_ & 0x40) == 0 || !class186.aBool2072) {
			i_9_ = class186.aByte2067;
			i_10_ = class186.aByte2068;
		    } else
			i_16_ = -1;
		}
	    }
	    boolean bool_17_
		= (aByteArray9469 != null && aByteArray9469[i_6_] != 0
		   || (class186 != null
		       && class186.aClass599_2064 == Class599.aClass599_7870));
	    if ((bool || bool_17_) && aByteArray9430 != null)
		i_7_ += aByteArray9430[i_6_] << 17;
	    if (bool_17_)
		i_7_ += 65536;
	    i_7_ += (i_9_ & 0xff) << 8;
	    i_7_ += i_10_ & 0xff;
	    i_8_ += (i_16_ & 0xffff) << 16;
	    i_8_ += i_5_ & 0xffff;
	    ls[i_5_] = ((long) i_7_ << 32) + (long) i_8_;
	    aBool9499 |= bool_17_;
	}
	Class417.method6755(ls, is, 1644144157);
	if (class187.aClass168Array2125 != null) {
	    anInt9484 = class187.aClass168Array2125.length;
	    aClass118Array9485 = new Class118[anInt9484];
	    aClass117Array9486 = new Class117[anInt9484];
	    for (int i_18_ = 0; i_18_ < class187.aClass168Array2125.length;
		 i_18_++) {
		Class168 class168 = class187.aClass168Array2125[i_18_];
		Class383 class383
		    = interface45.method344(class168.anInt1788 * 452560563,
					    -1398529865);
		int i_19_ = ((Class415.anIntArray4666
			      [(class187.aShortArray2096
				[class168.anInt1791 * 1329690033]) & 0xffff])
			     & 0xffffff);
		i_19_ = i_19_ | 255 - (class187.aByteArray2101 != null
				       ? ((class187.aByteArray2101
					   [class168.anInt1791 * 1329690033])
					  & 0xff)
				       : 0) << 24;
		aClass118Array9485[i_18_]
		    = new Class118(class168.anInt1791 * 1329690033,
				   (class187.aShortArray2093
				    [class168.anInt1791 * 1329690033]),
				   (class187.aShortArray2077
				    [class168.anInt1791 * 1329690033]),
				   (class187.aShortArray2095
				    [class168.anInt1791 * 1329690033]),
				   class383.anInt3937 * -312833239,
				   class383.anInt3938 * -407898751,
				   class383.anInt3936 * 651115273,
				   class383.anInt3940 * -1616229305,
				   class383.anInt3935 * 1576328455,
				   class383.aBool3942,
				   class168.anInt1789 * -1972242819);
		aClass117Array9486[i_18_] = new Class117(i_19_);
	    }
	}
	aFloatArrayArray9452 = new float[anInt9440][];
	aFloatArrayArray9429 = new float[anInt9440][];
	Class196 class196 = method3009(class187, is, anInt9440);
	Class101 class101
	    = aClass185_Sub2_9475.method15011(Thread.currentThread());
	float[] fs = class101.aFloatArray1237;
	boolean bool_20_ = false;
	for (int i_21_ = 0; i_21_ < anInt9440; i_21_++) {
	    int i_22_ = is[i_21_];
	    int i_23_ = (class187.aShortArray2104 != null
			 ? class187.aShortArray2104[i_22_] : -1);
	    if (i_23_ != -1 && (i_3_ & 0x40) != 0
		&& class177.method2931(i_23_ & 0xffff, (byte) 1).aBool2072)
		i_23_ = -1;
	    if (i_23_ != -1) {
		int i_24_ = (class187.aShortArray2102 != null
			     ? class187.aShortArray2102[i_22_] : -1);
		bool_20_ = true;
		float[] fs_25_ = aFloatArrayArray9452[i_22_] = new float[3];
		float[] fs_26_ = aFloatArrayArray9429[i_22_] = new float[3];
		if (i_24_ == 32766) {
		    int i_27_ = class187.aByteArray2111[i_22_] & 0xff;
		    int i_28_ = class187.aByteArray2097[i_22_] & 0xff;
		    int i_29_ = class187.aByteArray2098[i_22_] & 0xff;
		    i_27_ += (class187.anIntArray2112
			      [class187.aShortArray2093[i_22_]]);
		    i_28_ += (class187.anIntArray2112
			      [class187.aShortArray2077[i_22_]]);
		    i_29_ += (class187.anIntArray2112
			      [class187.aShortArray2095[i_22_]]);
		    fs_25_[0] = class187.aFloatArray2091[i_27_];
		    fs_26_[0] = class187.aFloatArray2084[i_27_];
		    fs_25_[1] = class187.aFloatArray2091[i_28_];
		    fs_26_[1] = class187.aFloatArray2084[i_28_];
		    fs_25_[2] = class187.aFloatArray2091[i_29_];
		    fs_26_[2] = class187.aFloatArray2084[i_29_];
		} else if (i_24_ == -1) {
		    fs_25_[0] = 0.0F;
		    fs_26_[0] = 1.0F;
		    fs_25_[1] = 1.0F;
		    fs_26_[1] = 1.0F;
		    fs_25_[2] = 0.0F;
		    fs_26_[2] = 0.0F;
		} else {
		    i_24_ &= 0xffff;
		    byte i_30_ = class187.aByteArray2086[i_24_];
		    if (i_30_ == 0) {
			short i_31_ = aShortArray9479[i_22_];
			short i_32_ = aShortArray9455[i_22_];
			short i_33_ = aShortArray9456[i_22_];
			short i_34_ = class187.aShortArray2108[i_24_];
			short i_35_ = class187.aShortArray2085[i_24_];
			short i_36_ = class187.aShortArray2114[i_24_];
			float f = (float) anIntArray9494[i_34_];
			float f_37_ = (float) anIntArray9447[i_34_];
			float f_38_ = (float) anIntArray9448[i_34_];
			float f_39_ = (float) anIntArray9494[i_35_] - f;
			float f_40_ = (float) anIntArray9447[i_35_] - f_37_;
			float f_41_ = (float) anIntArray9448[i_35_] - f_38_;
			float f_42_ = (float) anIntArray9494[i_36_] - f;
			float f_43_ = (float) anIntArray9447[i_36_] - f_37_;
			float f_44_ = (float) anIntArray9448[i_36_] - f_38_;
			float f_45_ = (float) anIntArray9494[i_31_] - f;
			float f_46_ = (float) anIntArray9447[i_31_] - f_37_;
			float f_47_ = (float) anIntArray9448[i_31_] - f_38_;
			float f_48_ = (float) anIntArray9494[i_32_] - f;
			float f_49_ = (float) anIntArray9447[i_32_] - f_37_;
			float f_50_ = (float) anIntArray9448[i_32_] - f_38_;
			float f_51_ = (float) anIntArray9494[i_33_] - f;
			float f_52_ = (float) anIntArray9447[i_33_] - f_37_;
			float f_53_ = (float) anIntArray9448[i_33_] - f_38_;
			float f_54_ = f_40_ * f_44_ - f_41_ * f_43_;
			float f_55_ = f_41_ * f_42_ - f_39_ * f_44_;
			float f_56_ = f_39_ * f_43_ - f_40_ * f_42_;
			float f_57_ = f_43_ * f_56_ - f_44_ * f_55_;
			float f_58_ = f_44_ * f_54_ - f_42_ * f_56_;
			float f_59_ = f_42_ * f_55_ - f_43_ * f_54_;
			float f_60_ = 1.0F / (f_57_ * f_39_ + f_58_ * f_40_
					      + f_59_ * f_41_);
			fs_25_[0] = (f_57_ * f_45_ + f_58_ * f_46_
				     + f_59_ * f_47_) * f_60_;
			fs_25_[1] = (f_57_ * f_48_ + f_58_ * f_49_
				     + f_59_ * f_50_) * f_60_;
			fs_25_[2] = (f_57_ * f_51_ + f_58_ * f_52_
				     + f_59_ * f_53_) * f_60_;
			f_57_ = f_40_ * f_56_ - f_41_ * f_55_;
			f_58_ = f_41_ * f_54_ - f_39_ * f_56_;
			f_59_ = f_39_ * f_55_ - f_40_ * f_54_;
			f_60_ = 1.0F / (f_57_ * f_42_ + f_58_ * f_43_
					+ f_59_ * f_44_);
			fs_26_[0] = (f_57_ * f_45_ + f_58_ * f_46_
				     + f_59_ * f_47_) * f_60_;
			fs_26_[1] = (f_57_ * f_48_ + f_58_ * f_49_
				     + f_59_ * f_50_) * f_60_;
			fs_26_[2] = (f_57_ * f_51_ + f_58_ * f_52_
				     + f_59_ * f_53_) * f_60_;
		    } else {
			short i_61_ = aShortArray9479[i_22_];
			short i_62_ = aShortArray9455[i_22_];
			short i_63_ = aShortArray9456[i_22_];
			int i_64_ = class196.anIntArray2161[i_24_];
			int i_65_ = class196.anIntArray2160[i_24_];
			int i_66_ = class196.anIntArray2162[i_24_];
			float[] fs_67_ = class196.aFloatArrayArray2163[i_24_];
			byte i_68_ = class187.aByteArray2122[i_24_];
			float f
			    = (float) class187.anIntArray2118[i_24_] / 256.0F;
			if (i_30_ == 1) {
			    float f_69_
				= ((float) class187.anIntArray2117[i_24_]
				   / 1024.0F);
			    method3006(anIntArray9494[i_61_],
				       anIntArray9447[i_61_],
				       anIntArray9448[i_61_], i_64_, i_65_,
				       i_66_, fs_67_, f_69_, i_68_, f, fs);
			    fs_25_[0] = fs[0];
			    fs_26_[0] = fs[1];
			    method3006(anIntArray9494[i_62_],
				       anIntArray9447[i_62_],
				       anIntArray9448[i_62_], i_64_, i_65_,
				       i_66_, fs_67_, f_69_, i_68_, f, fs);
			    fs_25_[1] = fs[0];
			    fs_26_[1] = fs[1];
			    method3006(anIntArray9494[i_63_],
				       anIntArray9447[i_63_],
				       anIntArray9448[i_63_], i_64_, i_65_,
				       i_66_, fs_67_, f_69_, i_68_, f, fs);
			    fs_25_[2] = fs[0];
			    fs_26_[2] = fs[1];
			    float f_70_ = f_69_ / 2.0F;
			    if ((i_68_ & 0x1) == 0) {
				if (fs_25_[1] - fs_25_[0] > f_70_)
				    fs_25_[1] -= f_69_;
				else if (fs_25_[0] - fs_25_[1] > f_70_)
				    fs_25_[1] += f_69_;
				if (fs_25_[2] - fs_25_[0] > f_70_)
				    fs_25_[2] -= f_69_;
				else if (fs_25_[0] - fs_25_[2] > f_70_)
				    fs_25_[2] += f_69_;
			    } else {
				if (fs_26_[1] - fs_26_[0] > f_70_)
				    fs_26_[1] -= f_69_;
				else if (fs_26_[0] - fs_26_[1] > f_70_)
				    fs_26_[1] += f_69_;
				if (fs_26_[2] - fs_26_[0] > f_70_)
				    fs_26_[2] -= f_69_;
				else if (fs_26_[0] - fs_26_[2] > f_70_)
				    fs_26_[2] += f_69_;
			    }
			} else if (i_30_ == 2) {
			    float f_71_
				= ((float) class187.anIntArray2119[i_24_]
				   / 256.0F);
			    float f_72_
				= ((float) class187.anIntArray2120[i_24_]
				   / 256.0F);
			    int i_73_ = (anIntArray9494[i_62_]
					 - anIntArray9494[i_61_]);
			    int i_74_ = (anIntArray9447[i_62_]
					 - anIntArray9447[i_61_]);
			    int i_75_ = (anIntArray9448[i_62_]
					 - anIntArray9448[i_61_]);
			    int i_76_ = (anIntArray9494[i_63_]
					 - anIntArray9494[i_61_]);
			    int i_77_ = (anIntArray9447[i_63_]
					 - anIntArray9447[i_61_]);
			    int i_78_ = (anIntArray9448[i_63_]
					 - anIntArray9448[i_61_]);
			    int i_79_ = i_74_ * i_78_ - i_77_ * i_75_;
			    int i_80_ = i_75_ * i_76_ - i_78_ * i_73_;
			    int i_81_ = i_73_ * i_77_ - i_76_ * i_74_;
			    float f_82_
				= (64.0F
				   / (float) class187.anIntArray2115[i_24_]);
			    float f_83_
				= (64.0F
				   / (float) class187.anIntArray2116[i_24_]);
			    float f_84_
				= (64.0F
				   / (float) class187.anIntArray2117[i_24_]);
			    float f_85_ = (((float) i_79_ * fs_67_[0]
					    + (float) i_80_ * fs_67_[1]
					    + (float) i_81_ * fs_67_[2])
					   / f_82_);
			    float f_86_ = (((float) i_79_ * fs_67_[3]
					    + (float) i_80_ * fs_67_[4]
					    + (float) i_81_ * fs_67_[5])
					   / f_83_);
			    float f_87_ = (((float) i_79_ * fs_67_[6]
					    + (float) i_80_ * fs_67_[7]
					    + (float) i_81_ * fs_67_[8])
					   / f_84_);
			    int i_88_ = method3179(f_85_, f_86_, f_87_);
			    method3008(anIntArray9494[i_61_],
				       anIntArray9447[i_61_],
				       anIntArray9448[i_61_], i_64_, i_65_,
				       i_66_, i_88_, fs_67_, i_68_, f, f_71_,
				       f_72_, fs);
			    fs_25_[0] = fs[0];
			    fs_26_[0] = fs[1];
			    method3008(anIntArray9494[i_62_],
				       anIntArray9447[i_62_],
				       anIntArray9448[i_62_], i_64_, i_65_,
				       i_66_, i_88_, fs_67_, i_68_, f, f_71_,
				       f_72_, fs);
			    fs_25_[1] = fs[0];
			    fs_26_[1] = fs[1];
			    method3008(anIntArray9494[i_63_],
				       anIntArray9447[i_63_],
				       anIntArray9448[i_63_], i_64_, i_65_,
				       i_66_, i_88_, fs_67_, i_68_, f, f_71_,
				       f_72_, fs);
			    fs_25_[2] = fs[0];
			    fs_26_[2] = fs[1];
			} else if (i_30_ == 3) {
			    method3005(anIntArray9494[i_61_],
				       anIntArray9447[i_61_],
				       anIntArray9448[i_61_], i_64_, i_65_,
				       i_66_, fs_67_, i_68_, f, fs);
			    fs_25_[0] = fs[0];
			    fs_26_[0] = fs[1];
			    method3005(anIntArray9494[i_62_],
				       anIntArray9447[i_62_],
				       anIntArray9448[i_62_], i_64_, i_65_,
				       i_66_, fs_67_, i_68_, f, fs);
			    fs_25_[1] = fs[0];
			    fs_26_[1] = fs[1];
			    method3005(anIntArray9494[i_63_],
				       anIntArray9447[i_63_],
				       anIntArray9448[i_63_], i_64_, i_65_,
				       i_66_, fs_67_, i_68_, f, fs);
			    fs_25_[2] = fs[0];
			    fs_26_[2] = fs[1];
			    if ((i_68_ & 0x1) == 0) {
				if (fs_25_[1] - fs_25_[0] > 0.5F)
				    fs_25_[1]--;
				else if (fs_25_[0] - fs_25_[1] > 0.5F)
				    fs_25_[1]++;
				if (fs_25_[2] - fs_25_[0] > 0.5F)
				    fs_25_[2]--;
				else if (fs_25_[0] - fs_25_[2] > 0.5F)
				    fs_25_[2]++;
			    } else {
				if (fs_26_[1] - fs_26_[0] > 0.5F)
				    fs_26_[1]--;
				else if (fs_26_[0] - fs_26_[1] > 0.5F)
				    fs_26_[1]++;
				if (fs_26_[2] - fs_26_[0] > 0.5F)
				    fs_26_[2]--;
				else if (fs_26_[0] - fs_26_[2] > 0.5F)
				    fs_26_[2]++;
			    }
			}
		    }
		}
	    }
	}
	if (!bool_20_) {
	    aFloatArrayArray9429 = null;
	    aFloatArrayArray9452 = null;
	}
	if (class187.anIntArray2087 != null && (anInt9441 & 0x20) != 0)
	    anIntArrayArray9470 = class187.method3716(true);
	if (class187.anIntArray2090 != null && (anInt9441 & 0x180) != 0)
	    anIntArrayArray9457 = class187.method3717();
	if (class187.aClass168Array2125 != null && (anInt9441 & 0x400) != 0)
	    anIntArrayArray9487 = class187.method3718();
	if (class187.aShortArray2104 != null) {
	    aShortArray9428 = new short[anInt9440];
	    boolean bool_89_ = false;
	    for (int i_90_ = 0; i_90_ < anInt9440; i_90_++) {
		short i_91_ = class187.aShortArray2104[i_90_];
		if (i_91_ != -1) {
		    Class186 class186
			= aClass185_Sub2_9475.aClass177_2012
			      .method2931(i_91_ & 0xffff, (byte) 1);
		    if ((i_3_ & 0x40) == 0 || !class186.aBool2072) {
			aShortArray9428[i_90_] = i_91_;
			bool_89_ = true;
			if (class186.aClass599_2064 == Class599.aClass599_7870)
			    aBool9499 = true;
			if (class186.aByte2047 != 0 || class186.aByte2048 != 0)
			    aBool9500 = true;
		    } else
			aShortArray9428[i_90_] = (short) -1;
		} else
		    aShortArray9428[i_90_] = (short) -1;
	    }
	    if (!bool_89_)
		aShortArray9428 = null;
	} else
	    aShortArray9428 = null;
	if (aBool9499 || aClass118Array9485 != null) {
	    aShortArray9446 = new short[anInt9440];
	    for (int i_92_ = 0; i_92_ < anInt9440; i_92_++)
		aShortArray9446[i_92_] = (short) is[i_92_];
	}
    }
    
    void method15091(Class101 class101) {
	aClass119_9489 = class101.aClass119_1233;
	if (class101 != aClass101_9437) {
	    aClass101_9437 = class101;
	    anIntArray9502 = aClass101_9437.anIntArray1214;
	    aFloatArray9503 = aClass101_9437.aFloatArray1235;
	    aFloatArray9496 = aClass101_9437.aFloatArray1220;
	    aFloatArray9505 = aClass101_9437.aFloatArray1221;
	    aFloatArray9506 = aClass101_9437.aFloatArray1222;
	    anIntArray9507 = aClass101_9437.anIntArray1240;
	    anIntArray9480 = aClass101_9437.anIntArray1216;
	    anIntArray9509 = aClass101_9437.anIntArray1218;
	    anIntArray9510 = aClass101_9437.anIntArray1201;
	    anIntArray9511 = aClass101_9437.anIntArray1227;
	    anIntArray9442 = aClass101_9437.anIntArray1228;
	}
    }
    
    public void method3080(int i) {
	if ((anInt9441 & 0xd) != 13)
	    throw new IllegalStateException();
	if (aClass96Array9450 != null) {
	    if (i == 4096)
		method15108();
	    else if (i == 8192)
		method15104();
	    else if (i == 12288)
		method15105();
	    else {
		int i_93_ = Class427.anIntArray4806[i];
		int i_94_ = Class427.anIntArray4805[i];
		synchronized (this) {
		    for (int i_95_ = 0; i_95_ < anInt9474; i_95_++) {
			int i_96_ = ((anIntArray9448[i_95_] * i_93_
				      + anIntArray9494[i_95_] * i_94_)
				     >> 14);
			anIntArray9448[i_95_]
			    = (anIntArray9448[i_95_] * i_94_
			       - anIntArray9494[i_95_] * i_93_) >> 14;
			anIntArray9494[i_95_] = i_96_;
			if (aClass96Array9450[i_95_] != null) {
			    i_96_ = (aClass96Array9450[i_95_].anInt1156 * i_93_
				     + (aClass96Array9450[i_95_].anInt1159
					* i_94_)) >> 14;
			    aClass96Array9450[i_95_].anInt1156
				= (aClass96Array9450[i_95_].anInt1156 * i_94_
				   - (aClass96Array9450[i_95_].anInt1159
				      * i_93_)) >> 14;
			    aClass96Array9450[i_95_].anInt1159 = i_96_;
			}
		    }
		    if (aClass107Array9466 != null) {
			for (int i_97_ = 0; i_97_ < anInt9440; i_97_++) {
			    if (aClass107Array9466[i_97_] != null) {
				int i_98_
				    = (((aClass107Array9466[i_97_].anInt1313
					 * i_93_)
					+ (aClass107Array9466[i_97_].anInt1315
					   * i_94_))
				       >> 14);
				aClass107Array9466[i_97_].anInt1313
				    = ((aClass107Array9466[i_97_].anInt1313
					* i_94_)
				       - (aClass107Array9466[i_97_].anInt1315
					  * i_93_)) >> 14;
				aClass107Array9466[i_97_].anInt1315 = i_98_;
			    }
			}
		    }
		    for (int i_99_ = anInt9474; i_99_ < anInt9444; i_99_++) {
			int i_100_ = ((anIntArray9448[i_99_] * i_93_
				       + anIntArray9494[i_99_] * i_94_)
				      >> 14);
			anIntArray9448[i_99_]
			    = (anIntArray9448[i_99_] * i_94_
			       - anIntArray9494[i_99_] * i_93_) >> 14;
			anIntArray9494[i_99_] = i_100_;
		    }
		    anInt9432 = 0;
		    aBool9488 = false;
		}
	    }
	} else
	    method3015(i);
    }
    
    void method15092() {
	if (anInt9432 == 0 && aClass96Array9450 == null) {
	    if (aClass185_Sub2_9475.anInt9367 * 442227785 > 1) {
		synchronized (this) {
		    method15117();
		}
	    } else
		method15117();
	}
    }
    
    Class183 method15093(Class183_Sub2 class183_sub2_101_,
			 Class183_Sub2 class183_sub2_102_, int i, boolean bool,
			 boolean bool_103_) {
	class183_sub2_101_.aBool9488 = aBool9488;
	if (aBool9488) {
	    class183_sub2_101_.aShort9468 = aShort9468;
	    class183_sub2_101_.aShort9492 = aShort9492;
	    class183_sub2_101_.aShort9449 = aShort9449;
	    class183_sub2_101_.aShort9493 = aShort9493;
	    class183_sub2_101_.aShort9491 = aShort9491;
	    class183_sub2_101_.aShort9495 = aShort9495;
	    class183_sub2_101_.aShort9473 = aShort9473;
	    class183_sub2_101_.aShort9490 = aShort9490;
	}
	if (aBool9512) {
	    class183_sub2_101_.aShort9498 = aShort9498;
	    class183_sub2_101_.aBool9512 = true;
	} else
	    class183_sub2_101_.aBool9512 = false;
	class183_sub2_101_.anInt9454 = anInt9454;
	class183_sub2_101_.anInt9443 = anInt9443;
	class183_sub2_101_.anInt9444 = anInt9444;
	class183_sub2_101_.anInt9474 = anInt9474;
	class183_sub2_101_.anInt9440 = anInt9440;
	class183_sub2_101_.anInt9484 = anInt9484;
	class183_sub2_101_.anInt9453 = anInt9453;
	if ((i & 0x100) != 0)
	    class183_sub2_101_.aBool9499 = true;
	else
	    class183_sub2_101_.aBool9499 = aBool9499;
	class183_sub2_101_.aBool9500 = aBool9500;
	boolean bool_104_ = (i & 0x7) == 7 | (i & 0x20) != 0;
	boolean bool_105_ = bool_104_ || (i & 0x1) != 0;
	boolean bool_106_ = bool_104_ || (i & 0x2) != 0;
	boolean bool_107_ = bool_104_ || (i & 0x4) != 0 || (i & 0x10) != 0;
	if (bool_105_ || bool_106_ || bool_107_) {
	    if (bool_105_) {
		if (class183_sub2_102_.anIntArray9494 == null
		    || class183_sub2_102_.anIntArray9494.length < anInt9444)
		    class183_sub2_101_.anIntArray9494
			= class183_sub2_102_.anIntArray9494
			= new int[anInt9444];
		else
		    class183_sub2_101_.anIntArray9494
			= class183_sub2_102_.anIntArray9494;
		for (int i_108_ = 0; i_108_ < anInt9444; i_108_++)
		    class183_sub2_101_.anIntArray9494[i_108_]
			= anIntArray9494[i_108_];
	    } else
		class183_sub2_101_.anIntArray9494 = anIntArray9494;
	    if (bool_106_) {
		if (class183_sub2_102_.anIntArray9447 == null
		    || class183_sub2_102_.anIntArray9447.length < anInt9444)
		    class183_sub2_101_.anIntArray9447
			= class183_sub2_102_.anIntArray9447
			= new int[anInt9444];
		else
		    class183_sub2_101_.anIntArray9447
			= class183_sub2_102_.anIntArray9447;
		for (int i_109_ = 0; i_109_ < anInt9444; i_109_++)
		    class183_sub2_101_.anIntArray9447[i_109_]
			= anIntArray9447[i_109_];
	    } else
		class183_sub2_101_.anIntArray9447 = anIntArray9447;
	    if (bool_107_) {
		if (class183_sub2_102_.anIntArray9448 == null
		    || class183_sub2_102_.anIntArray9448.length < anInt9444)
		    class183_sub2_101_.anIntArray9448
			= class183_sub2_102_.anIntArray9448
			= new int[anInt9444];
		else
		    class183_sub2_101_.anIntArray9448
			= class183_sub2_102_.anIntArray9448;
		for (int i_110_ = 0; i_110_ < anInt9444; i_110_++)
		    class183_sub2_101_.anIntArray9448[i_110_]
			= anIntArray9448[i_110_];
	    } else
		class183_sub2_101_.anIntArray9448 = anIntArray9448;
	} else {
	    class183_sub2_101_.anIntArray9494 = anIntArray9494;
	    class183_sub2_101_.anIntArray9447 = anIntArray9447;
	    class183_sub2_101_.anIntArray9448 = anIntArray9448;
	}
	if ((i & 0x84080) != 0) {
	    if (class183_sub2_102_.aShortArray9471 == null
		|| class183_sub2_102_.aShortArray9471.length < anInt9440) {
		int i_111_ = anInt9440;
		class183_sub2_101_.aShortArray9471
		    = class183_sub2_102_.aShortArray9471 = new short[i_111_];
	    } else
		class183_sub2_101_.aShortArray9471
		    = class183_sub2_102_.aShortArray9471;
	    for (int i_112_ = 0; i_112_ < anInt9440; i_112_++)
		class183_sub2_101_.aShortArray9471[i_112_]
		    = aShortArray9471[i_112_];
	} else
	    class183_sub2_101_.aShortArray9471 = aShortArray9471;
	if ((i & 0x97018) != 0) {
	    class183_sub2_101_.anInt9432 = 0;
	    Class183_Sub2 class183_sub2_113_ = class183_sub2_101_;
	    Class183_Sub2 class183_sub2_114_ = class183_sub2_101_;
	    class183_sub2_101_.anIntArray9461 = null;
	    class183_sub2_114_.anIntArray9460 = null;
	    class183_sub2_113_.anIntArray9459 = null;
	} else if ((i & 0x80) != 0) {
	    if (bool_103_)
		method15115(false);
	    if (anIntArray9459 != null) {
		if (class183_sub2_102_.anIntArray9459 == null
		    || class183_sub2_102_.anIntArray9459.length < anInt9440) {
		    int i_115_ = anInt9440;
		    class183_sub2_101_.anIntArray9459
			= class183_sub2_102_.anIntArray9459 = new int[i_115_];
		    class183_sub2_101_.anIntArray9460
			= class183_sub2_102_.anIntArray9460 = new int[i_115_];
		    class183_sub2_101_.anIntArray9461
			= class183_sub2_102_.anIntArray9461 = new int[i_115_];
		} else {
		    class183_sub2_101_.anIntArray9459
			= class183_sub2_102_.anIntArray9459;
		    class183_sub2_101_.anIntArray9460
			= class183_sub2_102_.anIntArray9460;
		    class183_sub2_101_.anIntArray9461
			= class183_sub2_102_.anIntArray9461;
		}
		for (int i_116_ = 0; i_116_ < anInt9440; i_116_++) {
		    class183_sub2_101_.anIntArray9459[i_116_]
			= anIntArray9459[i_116_];
		    class183_sub2_101_.anIntArray9460[i_116_]
			= anIntArray9460[i_116_];
		    class183_sub2_101_.anIntArray9461[i_116_]
			= anIntArray9461[i_116_];
		}
	    }
	    class183_sub2_101_.anInt9432 = anInt9432;
	} else {
	    if (bool_103_)
		method15115(false);
	    class183_sub2_101_.anIntArray9459 = anIntArray9459;
	    class183_sub2_101_.anIntArray9460 = anIntArray9460;
	    class183_sub2_101_.anIntArray9461 = anIntArray9461;
	    class183_sub2_101_.anInt9432 = anInt9432;
	}
	if ((i & 0x100) != 0) {
	    if (class183_sub2_102_.aByteArray9469 == null
		|| class183_sub2_102_.aByteArray9469.length < anInt9440) {
		int i_117_ = anInt9440;
		class183_sub2_101_.aByteArray9469
		    = class183_sub2_102_.aByteArray9469 = new byte[i_117_];
	    } else
		class183_sub2_101_.aByteArray9469
		    = class183_sub2_102_.aByteArray9469;
	    if (aByteArray9469 != null) {
		for (int i_118_ = 0; i_118_ < anInt9440; i_118_++)
		    class183_sub2_101_.aByteArray9469[i_118_]
			= aByteArray9469[i_118_];
	    } else {
		for (int i_119_ = 0; i_119_ < anInt9440; i_119_++)
		    class183_sub2_101_.aByteArray9469[i_119_] = (byte) 0;
	    }
	} else
	    class183_sub2_101_.aByteArray9469 = aByteArray9469;
	if ((i & 0x8) != 0 || (i & 0x10) != 0) {
	    if (class183_sub2_102_.aClass96Array9450 == null
		|| class183_sub2_102_.aClass96Array9450.length < anInt9474) {
		int i_120_ = anInt9474;
		class183_sub2_101_.aClass96Array9450
		    = class183_sub2_102_.aClass96Array9450
		    = new Class96[i_120_];
	    } else
		class183_sub2_101_.aClass96Array9450
		    = class183_sub2_102_.aClass96Array9450;
	    if (aClass96Array9450 != null) {
		for (int i_121_ = 0; i_121_ < anInt9474; i_121_++)
		    class183_sub2_101_.aClass96Array9450[i_121_]
			= new Class96(aClass96Array9450[i_121_]);
	    } else
		class183_sub2_101_.aClass96Array9450 = null;
	    if (aClass107Array9466 != null) {
		if (class183_sub2_102_.aClass107Array9466 == null
		    || (class183_sub2_102_.aClass107Array9466.length
			< anInt9440)) {
		    int i_122_ = anInt9440;
		    class183_sub2_101_.aClass107Array9466
			= class183_sub2_102_.aClass107Array9466
			= new Class107[i_122_];
		} else
		    class183_sub2_101_.aClass107Array9466
			= class183_sub2_102_.aClass107Array9466;
		for (int i_123_ = 0; i_123_ < anInt9440; i_123_++)
		    class183_sub2_101_.aClass107Array9466[i_123_]
			= (aClass107Array9466[i_123_] != null
			   ? new Class107(aClass107Array9466[i_123_]) : null);
	    } else
		class183_sub2_101_.aClass107Array9466 = null;
	} else {
	    if (bool_103_)
		method15092();
	    class183_sub2_101_.aClass96Array9450 = aClass96Array9450;
	    class183_sub2_101_.aClass107Array9466 = aClass107Array9466;
	}
	if ((i & 0x8000) != 0) {
	    if (aShortArray9428 == null)
		class183_sub2_101_.aShortArray9428 = null;
	    else {
		if (class183_sub2_102_.aShortArray9428 == null
		    || class183_sub2_102_.aShortArray9428.length < anInt9440) {
		    int i_124_ = anInt9440;
		    class183_sub2_101_.aShortArray9428
			= class183_sub2_102_.aShortArray9428
			= new short[i_124_];
		} else
		    class183_sub2_101_.aShortArray9428
			= class183_sub2_102_.aShortArray9428;
		for (int i_125_ = 0; i_125_ < anInt9440; i_125_++)
		    class183_sub2_101_.aShortArray9428[i_125_]
			= aShortArray9428[i_125_];
	    }
	} else
	    class183_sub2_101_.aShortArray9428 = aShortArray9428;
	if ((i & 0x10000) != 0) {
	    if (aByteArray9467 == null)
		class183_sub2_101_.aByteArray9467 = null;
	    else {
		if (class183_sub2_102_.aByteArray9467 == null
		    || class183_sub2_102_.aByteArray9467.length < anInt9440) {
		    int i_126_ = bool ? anInt9440 + 100 : anInt9440;
		    class183_sub2_101_.aByteArray9467
			= class183_sub2_102_.aByteArray9467 = new byte[i_126_];
		} else
		    class183_sub2_101_.aByteArray9467
			= class183_sub2_102_.aByteArray9467;
		for (int i_127_ = 0; i_127_ < anInt9440; i_127_++)
		    class183_sub2_101_.aByteArray9467[i_127_]
			= aByteArray9467[i_127_];
	    }
	} else
	    class183_sub2_101_.aByteArray9467 = aByteArray9467;
	if ((i & 0xc580) != 0) {
	    if (class183_sub2_102_.aClass117Array9486 == null
		|| class183_sub2_102_.aClass117Array9486.length < anInt9484) {
		int i_128_ = anInt9484;
		class183_sub2_101_.aClass117Array9486
		    = class183_sub2_102_.aClass117Array9486
		    = new Class117[i_128_];
		for (int i_129_ = 0; i_129_ < anInt9484; i_129_++)
		    class183_sub2_101_.aClass117Array9486[i_129_]
			= aClass117Array9486[i_129_].method2120((byte) 118);
	    } else {
		class183_sub2_101_.aClass117Array9486
		    = class183_sub2_102_.aClass117Array9486;
		for (int i_130_ = 0; i_130_ < anInt9484; i_130_++)
		    class183_sub2_101_.aClass117Array9486[i_130_]
			.method2119(aClass117Array9486[i_130_], 137342452);
	    }
	} else
	    class183_sub2_101_.aClass117Array9486 = aClass117Array9486;
	if (aFloatArrayArray9452 != null && (i & 0x10) != 0) {
	    if (class183_sub2_102_.aFloatArrayArray9452 == null
		|| (class183_sub2_102_.aFloatArrayArray9452.length
		    < anInt9440)) {
		int i_131_ = bool ? anInt9440 + 100 : anInt9440;
		class183_sub2_101_.aFloatArrayArray9452
		    = class183_sub2_102_.aFloatArrayArray9452
		    = new float[i_131_][3];
	    } else
		class183_sub2_101_.aFloatArrayArray9452
		    = class183_sub2_102_.aFloatArrayArray9452;
	    for (int i_132_ = 0; i_132_ < anInt9440; i_132_++) {
		if (aFloatArrayArray9452[i_132_] != null) {
		    class183_sub2_101_.aFloatArrayArray9452[i_132_][0]
			= aFloatArrayArray9452[i_132_][0];
		    class183_sub2_101_.aFloatArrayArray9452[i_132_][1]
			= aFloatArrayArray9452[i_132_][1];
		    class183_sub2_101_.aFloatArrayArray9452[i_132_][2]
			= aFloatArrayArray9452[i_132_][2];
		}
	    }
	    if (class183_sub2_102_.aFloatArrayArray9429 == null
		|| (class183_sub2_102_.aFloatArrayArray9429.length
		    < anInt9440)) {
		int i_133_ = bool ? anInt9440 + 100 : anInt9440;
		class183_sub2_101_.aFloatArrayArray9429
		    = class183_sub2_102_.aFloatArrayArray9429
		    = new float[i_133_][3];
	    } else
		class183_sub2_101_.aFloatArrayArray9429
		    = class183_sub2_102_.aFloatArrayArray9429;
	    for (int i_134_ = 0; i_134_ < anInt9440; i_134_++) {
		if (aFloatArrayArray9429[i_134_] != null) {
		    class183_sub2_101_.aFloatArrayArray9429[i_134_][0]
			= aFloatArrayArray9429[i_134_][0];
		    class183_sub2_101_.aFloatArrayArray9429[i_134_][1]
			= aFloatArrayArray9429[i_134_][1];
		    class183_sub2_101_.aFloatArrayArray9429[i_134_][2]
			= aFloatArrayArray9429[i_134_][2];
		}
	    }
	} else {
	    class183_sub2_101_.aFloatArrayArray9452 = aFloatArrayArray9452;
	    class183_sub2_101_.aFloatArrayArray9429 = aFloatArrayArray9429;
	}
	class183_sub2_101_.anIntArrayArray9470 = anIntArrayArray9470;
	class183_sub2_101_.anIntArrayArray9457 = anIntArrayArray9457;
	class183_sub2_101_.anIntArrayArray9487 = anIntArrayArray9487;
	class183_sub2_101_.aShortArray9445 = aShortArray9445;
	class183_sub2_101_.aShortArray9472 = aShortArray9472;
	class183_sub2_101_.aByteArray9430 = aByteArray9430;
	class183_sub2_101_.aShortArray9479 = aShortArray9479;
	class183_sub2_101_.aShortArray9455 = aShortArray9455;
	class183_sub2_101_.aShortArray9456 = aShortArray9456;
	class183_sub2_101_.aClass172Array9482 = aClass172Array9482;
	class183_sub2_101_.aClass158Array9483 = aClass158Array9483;
	class183_sub2_101_.aClass118Array9485 = aClass118Array9485;
	class183_sub2_101_.aShortArray9446 = aShortArray9446;
	class183_sub2_101_.anInt9441 = i;
	return class183_sub2_101_;
    }
    
    public boolean method3183(int i, int i_135_, Class446 class446,
			      boolean bool, int i_136_) {
	method15091(aClass185_Sub2_9475.method15011(Thread.currentThread()));
	Class433 class433 = aClass101_9437.aClass433_1224;
	class433.method6916(class446);
	Class433 class433_137_ = aClass101_9437.aClass433_1217;
	class433_137_.method6842(class433);
	class433_137_.method6839(aClass185_Sub2_9475.aClass433_9346);
	boolean bool_138_ = false;
	int i_139_ = 2147483647;
	int i_140_ = -2147483648;
	int i_141_ = 2147483647;
	int i_142_ = -2147483648;
	if (!aBool9488)
	    method15173();
	int i_143_ = aShort9468 - aShort9493 >> 1;
	int i_144_ = aShort9492 - aShort9491 >> 1;
	int i_145_ = aShort9449 - aShort9495 >> 1;
	int i_146_ = aShort9493 + i_143_;
	int i_147_ = aShort9491 + i_144_;
	int i_148_ = aShort9495 + i_145_;
	int i_149_ = i_146_ - (i_143_ << i_136_);
	int i_150_ = i_147_ - (i_144_ << i_136_);
	int i_151_ = i_148_ - (i_145_ << i_136_);
	int i_152_ = i_146_ + (i_143_ << i_136_);
	int i_153_ = i_147_ + (i_144_ << i_136_);
	int i_154_ = i_148_ + (i_145_ << i_136_);
	anIntArray9507[0] = i_149_;
	anIntArray9480[0] = i_150_;
	anIntArray9509[0] = i_151_;
	anIntArray9507[1] = i_152_;
	anIntArray9480[1] = i_150_;
	anIntArray9509[1] = i_151_;
	anIntArray9507[2] = i_149_;
	anIntArray9480[2] = i_153_;
	anIntArray9509[2] = i_151_;
	anIntArray9507[3] = i_152_;
	anIntArray9480[3] = i_153_;
	anIntArray9509[3] = i_151_;
	anIntArray9507[4] = i_149_;
	anIntArray9480[4] = i_150_;
	anIntArray9509[4] = i_154_;
	anIntArray9507[5] = i_152_;
	anIntArray9480[5] = i_150_;
	anIntArray9509[5] = i_154_;
	anIntArray9507[6] = i_149_;
	anIntArray9480[6] = i_153_;
	anIntArray9509[6] = i_154_;
	anIntArray9507[7] = i_152_;
	anIntArray9480[7] = i_153_;
	anIntArray9509[7] = i_154_;
	for (int i_155_ = 0; i_155_ < 8; i_155_++) {
	    int i_156_ = anIntArray9507[i_155_];
	    int i_157_ = anIntArray9480[i_155_];
	    int i_158_ = anIntArray9509[i_155_];
	    float f = (class433_137_.aFloatArray4853[2] * (float) i_156_
		       + class433_137_.aFloatArray4853[6] * (float) i_157_
		       + class433_137_.aFloatArray4853[10] * (float) i_158_
		       + class433_137_.aFloatArray4853[14]);
	    float f_159_
		= (class433_137_.aFloatArray4853[3] * (float) i_156_
		   + class433_137_.aFloatArray4853[7] * (float) i_157_
		   + class433_137_.aFloatArray4853[11] * (float) i_158_
		   + class433_137_.aFloatArray4853[15]);
	    if (f >= -f_159_) {
		float f_160_
		    = (class433_137_.aFloatArray4853[0] * (float) i_156_
		       + class433_137_.aFloatArray4853[4] * (float) i_157_
		       + class433_137_.aFloatArray4853[8] * (float) i_158_
		       + class433_137_.aFloatArray4853[12]);
		float f_161_
		    = (class433_137_.aFloatArray4853[1] * (float) i_156_
		       + class433_137_.aFloatArray4853[5] * (float) i_157_
		       + class433_137_.aFloatArray4853[9] * (float) i_158_
		       + class433_137_.aFloatArray4853[13]);
		int i_162_ = (int) (aClass185_Sub2_9475.aFloat9342
				    + (aClass185_Sub2_9475.aFloat9361 * f_160_
				       / f_159_));
		int i_163_ = (int) (aClass185_Sub2_9475.aFloat9368
				    + (aClass185_Sub2_9475.aFloat9363 * f_161_
				       / f_159_));
		if (i_162_ < i_139_)
		    i_139_ = i_162_;
		if (i_162_ > i_140_)
		    i_140_ = i_162_;
		if (i_163_ < i_141_)
		    i_141_ = i_163_;
		if (i_163_ > i_142_)
		    i_142_ = i_163_;
		bool_138_ = true;
	    }
	}
	if (bool_138_ && i > i_139_ && i < i_140_ && i_135_ > i_141_
	    && i_135_ < i_142_) {
	    if (bool)
		return true;
	    for (int i_164_ = 0; i_164_ < anInt9444; i_164_++) {
		int i_165_ = anIntArray9494[i_164_];
		int i_166_ = anIntArray9447[i_164_];
		int i_167_ = anIntArray9448[i_164_];
		float f = (class433_137_.aFloatArray4853[2] * (float) i_165_
			   + class433_137_.aFloatArray4853[6] * (float) i_166_
			   + class433_137_.aFloatArray4853[10] * (float) i_167_
			   + class433_137_.aFloatArray4853[14]);
		float f_168_
		    = (class433_137_.aFloatArray4853[3] * (float) i_165_
		       + class433_137_.aFloatArray4853[7] * (float) i_166_
		       + class433_137_.aFloatArray4853[11] * (float) i_167_
		       + class433_137_.aFloatArray4853[15]);
		if (f >= -f_168_) {
		    float f_169_
			= (class433_137_.aFloatArray4853[0] * (float) i_165_
			   + class433_137_.aFloatArray4853[4] * (float) i_166_
			   + class433_137_.aFloatArray4853[8] * (float) i_167_
			   + class433_137_.aFloatArray4853[12]);
		    float f_170_
			= (class433_137_.aFloatArray4853[1] * (float) i_165_
			   + class433_137_.aFloatArray4853[5] * (float) i_166_
			   + class433_137_.aFloatArray4853[9] * (float) i_167_
			   + class433_137_.aFloatArray4853[13]);
		    aFloatArray9503[i_164_]
			= (float) (int) (aClass185_Sub2_9475.aFloat9342
					 + (aClass185_Sub2_9475.aFloat9361
					    * f_169_ / f_168_));
		    aFloatArray9496[i_164_]
			= (float) (int) (aClass185_Sub2_9475.aFloat9368
					 + (aClass185_Sub2_9475.aFloat9363
					    * f_170_ / f_168_));
		} else
		    aFloatArray9503[i_164_] = -999999.0F;
	    }
	    for (int i_171_ = 0; i_171_ < anInt9453; i_171_++) {
		if (aFloatArray9503[aShortArray9479[i_171_]] != -999999.0F
		    && aFloatArray9503[aShortArray9455[i_171_]] != -999999.0F
		    && aFloatArray9503[aShortArray9456[i_171_]] != -999999.0F
		    && method15114(i, i_135_,
				   aFloatArray9496[aShortArray9479[i_171_]],
				   aFloatArray9496[aShortArray9455[i_171_]],
				   aFloatArray9496[aShortArray9456[i_171_]],
				   aFloatArray9503[aShortArray9479[i_171_]],
				   aFloatArray9503[aShortArray9455[i_171_]],
				   aFloatArray9503[aShortArray9456[i_171_]]))
		    return true;
	    }
	}
	return false;
    }
    
    void method15094(boolean bool) {
	if (anInt9432 == 1)
	    method15135();
	else if (anInt9432 == 2) {
	    if ((anInt9441 & 0x97098) == 0 && aFloatArrayArray9452 == null)
		aShortArray9471 = null;
	    if (bool)
		aByteArray9467 = null;
	} else {
	    method15092();
	    int i = aClass185_Sub2_9475.anInt9352 * 845036313;
	    int i_172_ = aClass185_Sub2_9475.anInt9347 * 1141856477;
	    int i_173_ = aClass185_Sub2_9475.anInt9348 * 568046319;
	    int i_174_ = aClass185_Sub2_9475.anInt9351 * -1021814047 >> 8;
	    int i_175_ = 0;
	    int i_176_ = 0;
	    if (anInt9443 != 0) {
		i_175_
		    = aClass185_Sub2_9475.anInt9370 * -664856320 / anInt9443;
		i_176_
		    = aClass185_Sub2_9475.anInt9358 * 1073854208 / anInt9443;
	    }
	    if (anIntArray9459 == null) {
		anIntArray9459 = new int[anInt9440];
		anIntArray9460 = new int[anInt9440];
		anIntArray9461 = new int[anInt9440];
	    }
	    for (int i_177_ = 0; i_177_ < anInt9440; i_177_++) {
		byte i_178_;
		if (aByteArray9467 == null)
		    i_178_ = (byte) 0;
		else
		    i_178_ = aByteArray9467[i_177_];
		byte i_179_;
		if (aByteArray9469 == null)
		    i_179_ = (byte) 0;
		else
		    i_179_ = aByteArray9469[i_177_];
		short i_180_;
		if (aShortArray9428 == null)
		    i_180_ = (short) -1;
		else
		    i_180_ = aShortArray9428[i_177_];
		if (i_179_ == -2)
		    i_178_ = (byte) 3;
		if (i_179_ == -1)
		    i_178_ = (byte) 2;
		if (i_180_ == -1) {
		    if (i_178_ == 0) {
			int i_181_ = aShortArray9471[i_177_] & 0xffff;
			int i_182_ = (i_181_ & 0x7f) * anInt9454 >> 7;
			short i_183_
			    = Class315.method5705(i_181_ & ~0x7f | i_182_,
						  2056319120);
			Class96 class96;
			if (aClass96Array9451 != null
			    && (aClass96Array9451[aShortArray9479[i_177_]]
				!= null))
			    class96
				= aClass96Array9451[aShortArray9479[i_177_]];
			else
			    class96
				= aClass96Array9450[aShortArray9479[i_177_]];
			int i_184_ = (((i * class96.anInt1159
					+ i_172_ * class96.anInt1158
					+ i_173_ * class96.anInt1156)
				       / class96.anInt1157)
				      >> 16);
			int i_185_ = i_184_ > 256 ? i_175_ : i_176_;
			int i_186_ = (i_174_ >> 1) + (i_185_ * i_184_ >> 17);
			anIntArray9459[i_177_]
			    = i_186_ << 17 | Class146.method2452(i_183_,
								 i_186_,
								 130809202);
			if (aClass96Array9451 != null
			    && (aClass96Array9451[aShortArray9455[i_177_]]
				!= null))
			    class96
				= aClass96Array9451[aShortArray9455[i_177_]];
			else
			    class96
				= aClass96Array9450[aShortArray9455[i_177_]];
			i_184_ = ((i * class96.anInt1159
				   + i_172_ * class96.anInt1158
				   + i_173_ * class96.anInt1156)
				  / class96.anInt1157) >> 16;
			i_185_ = i_184_ > 256 ? i_175_ : i_176_;
			i_186_ = (i_174_ >> 1) + (i_185_ * i_184_ >> 17);
			anIntArray9460[i_177_]
			    = i_186_ << 17 | Class146.method2452(i_183_,
								 i_186_,
								 -582771849);
			if (aClass96Array9451 != null
			    && (aClass96Array9451[aShortArray9456[i_177_]]
				!= null))
			    class96
				= aClass96Array9451[aShortArray9456[i_177_]];
			else
			    class96
				= aClass96Array9450[aShortArray9456[i_177_]];
			i_184_ = ((i * class96.anInt1159
				   + i_172_ * class96.anInt1158
				   + i_173_ * class96.anInt1156)
				  / class96.anInt1157) >> 16;
			i_185_ = i_184_ > 256 ? i_175_ : i_176_;
			i_186_ = (i_174_ >> 1) + (i_185_ * i_184_ >> 17);
			anIntArray9461[i_177_]
			    = i_186_ << 17 | Class146.method2452(i_183_,
								 i_186_,
								 -1025153632);
		    } else if (i_178_ == 1) {
			int i_187_ = aShortArray9471[i_177_] & 0xffff;
			int i_188_ = (i_187_ & 0x7f) * anInt9454 >> 7;
			short i_189_
			    = Class315.method5705(i_187_ & ~0x7f | i_188_,
						  1760923695);
			Class107 class107 = aClass107Array9466[i_177_];
			int i_190_ = ((i * class107.anInt1315
				       + i_172_ * class107.anInt1314
				       + i_173_ * class107.anInt1313)
				      >> 16);
			int i_191_ = i_190_ > 256 ? i_175_ : i_176_;
			int i_192_ = (i_174_ >> 1) + (i_191_ * i_190_ >> 17);
			anIntArray9459[i_177_]
			    = i_192_ << 17 | Class146.method2452(i_189_,
								 i_192_,
								 -1599569587);
			anIntArray9461[i_177_] = -1;
		    } else if (i_178_ == 3) {
			anIntArray9459[i_177_] = 128;
			anIntArray9461[i_177_] = -1;
		    } else
			anIntArray9461[i_177_] = -2;
		} else {
		    int i_193_ = aShortArray9471[i_177_] & 0xffff;
		    if (i_178_ == 0) {
			Class96 class96;
			if (aClass96Array9451 != null
			    && (aClass96Array9451[aShortArray9479[i_177_]]
				!= null))
			    class96
				= aClass96Array9451[aShortArray9479[i_177_]];
			else
			    class96
				= aClass96Array9450[aShortArray9479[i_177_]];
			int i_194_ = (((i * class96.anInt1159
					+ i_172_ * class96.anInt1158
					+ i_173_ * class96.anInt1156)
				       / class96.anInt1157)
				      >> 16);
			int i_195_ = i_194_ > 256 ? i_175_ : i_176_;
			int i_196_
			    = method15097((i_174_ >> 2) + (i_195_ * i_194_
							   >> 18));
			anIntArray9459[i_177_]
			    = i_196_ << 24 | method15095(i_193_, i_180_,
							 i_196_);
			if (aClass96Array9451 != null
			    && (aClass96Array9451[aShortArray9455[i_177_]]
				!= null))
			    class96
				= aClass96Array9451[aShortArray9455[i_177_]];
			else
			    class96
				= aClass96Array9450[aShortArray9455[i_177_]];
			i_194_ = ((i * class96.anInt1159
				   + i_172_ * class96.anInt1158
				   + i_173_ * class96.anInt1156)
				  / class96.anInt1157) >> 16;
			i_195_ = i_194_ > 256 ? i_175_ : i_176_;
			i_196_ = method15097((i_174_ >> 2) + (i_195_ * i_194_
							      >> 18));
			anIntArray9460[i_177_]
			    = i_196_ << 24 | method15095(i_193_, i_180_,
							 i_196_);
			if (aClass96Array9451 != null
			    && (aClass96Array9451[aShortArray9456[i_177_]]
				!= null))
			    class96
				= aClass96Array9451[aShortArray9456[i_177_]];
			else
			    class96
				= aClass96Array9450[aShortArray9456[i_177_]];
			i_194_ = ((i * class96.anInt1159
				   + i_172_ * class96.anInt1158
				   + i_173_ * class96.anInt1156)
				  / class96.anInt1157) >> 16;
			i_195_ = i_194_ > 256 ? i_175_ : i_176_;
			i_196_ = method15097((i_174_ >> 2) + (i_195_ * i_194_
							      >> 18));
			anIntArray9461[i_177_]
			    = i_196_ << 24 | method15095(i_193_, i_180_,
							 i_196_);
		    } else if (i_178_ == 1) {
			Class107 class107 = aClass107Array9466[i_177_];
			int i_197_ = ((i * class107.anInt1315
				       + i_172_ * class107.anInt1314
				       + i_173_ * class107.anInt1313)
				      >> 16);
			int i_198_ = i_197_ > 256 ? i_175_ : i_176_;
			int i_199_
			    = method15097((i_174_ >> 2) + (i_198_ * i_197_
							   >> 18));
			anIntArray9459[i_177_]
			    = i_199_ << 24 | method15095(i_193_, i_180_,
							 i_199_);
			anIntArray9461[i_177_] = -1;
		    } else
			anIntArray9461[i_177_] = -2;
		}
	    }
	    aClass96Array9450 = null;
	    aClass96Array9451 = null;
	    aClass107Array9466 = null;
	    if ((anInt9441 & 0x97098) == 0 && aFloatArrayArray9452 == null)
		aShortArray9471 = null;
	    if (bool)
		aByteArray9467 = null;
	    anInt9432 = 2;
	}
    }
    
    int method15095(int i, short i_200_, int i_201_) {
	int i_202_ = Class661.anIntArray8549[method15096(i, i_201_)];
	Class186 class186
	    = aClass185_Sub2_9475.aClass177_2012.method2931(i_200_ & 0xffff,
							    (byte) 1);
	int i_203_ = class186.aByte2074 & 0xff;
	if (i_203_ != 0) {
	    int i_204_ = 131586 * i_201_;
	    if (i_203_ == 256)
		i_202_ = i_204_;
	    else {
		int i_205_ = i_203_;
		int i_206_ = 256 - i_203_;
		i_202_ = ((((i_204_ & 0xff00ff) * i_205_
			    + (i_202_ & 0xff00ff) * i_206_)
			   & ~0xff00ff)
			  + (((i_204_ & 0xff00) * i_205_
			      + (i_202_ & 0xff00) * i_206_)
			     & 0xff0000)) >> 8;
	    }
	}
	int i_207_ = class186.aByte2059 & 0xff;
	if (i_207_ != 0) {
	    i_207_ += 256;
	    int i_208_ = ((i_202_ & 0xff0000) >> 16) * i_207_;
	    if (i_208_ > 65535)
		i_208_ = 65535;
	    int i_209_ = ((i_202_ & 0xff00) >> 8) * i_207_;
	    if (i_209_ > 65535)
		i_209_ = 65535;
	    int i_210_ = (i_202_ & 0xff) * i_207_;
	    if (i_210_ > 65535)
		i_210_ = 65535;
	    i_202_
		= (i_208_ << 8 & 0xff0000) + (i_209_ & 0xff00) + (i_210_ >> 8);
	}
	return i_202_;
    }
    
    int method15096(int i, int i_211_) {
	i_211_ = i_211_ * (i & 0x7f) >> 7;
	if (i_211_ < 2)
	    i_211_ = 2;
	else if (i_211_ > 126)
	    i_211_ = 126;
	return (i & 0xff80) + i_211_;
    }
    
    int method15097(int i) {
	if (i < 2)
	    i = 2;
	else if (i > 126)
	    i = 126;
	return i;
    }
    
    public void method3081(int i) {
	if ((anInt9441 & 0x6) != 6)
	    throw new IllegalStateException();
	int i_212_ = Class427.anIntArray4806[i];
	int i_213_ = Class427.anIntArray4805[i];
	synchronized (this) {
	    for (int i_214_ = 0; i_214_ < anInt9444; i_214_++) {
		int i_215_ = ((anIntArray9447[i_214_] * i_213_
			       - anIntArray9448[i_214_] * i_212_)
			      >> 14);
		anIntArray9448[i_214_]
		    = (anIntArray9447[i_214_] * i_212_
		       + anIntArray9448[i_214_] * i_213_) >> 14;
		anIntArray9447[i_214_] = i_215_;
	    }
	    method15151();
	}
    }
    
    void method15098() {
	for (int i = 0; i < anInt9440; i++) {
	    short i_216_
		= aShortArray9428 != null ? aShortArray9428[i] : (short) -1;
	    if (i_216_ == -1) {
		int i_217_ = aShortArray9471[i] & 0xffff;
		int i_218_ = (i_217_ & 0x7f) * anInt9454 >> 7;
		short i_219_
		    = Class315.method5705(i_217_ & ~0x7f | i_218_, 1479163095);
		if (anIntArray9461[i] == -1) {
		    int i_220_ = anIntArray9459[i] & ~0x1ffff;
		    anIntArray9459[i]
			= i_220_ | Class146.method2452(i_219_, i_220_ >> 17,
						       -583421422);
		} else if (anIntArray9461[i] != -2) {
		    int i_221_ = anIntArray9459[i] & ~0x1ffff;
		    anIntArray9459[i]
			= i_221_ | Class146.method2452(i_219_, i_221_ >> 17,
						       -1671760074);
		    i_221_ = anIntArray9460[i] & ~0x1ffff;
		    anIntArray9460[i]
			= i_221_ | Class146.method2452(i_219_, i_221_ >> 17,
						       -489990389);
		    i_221_ = anIntArray9461[i] & ~0x1ffff;
		    anIntArray9461[i]
			= i_221_ | Class146.method2452(i_219_, i_221_ >> 17,
						       -1658741235);
		}
	    }
	}
	anInt9432 = 2;
    }
    
    void method3181() {
	if (aClass185_Sub2_9475.anInt9367 * 442227785 > 1) {
	    synchronized (this) {
		while (aBool1973) {
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		aBool1973 = true;
	    }
	}
    }
    
    public int method3101() {
	return anInt9441;
    }
    
    final boolean method15099(int i) {
	if (anIntArray9442 == null)
	    return false;
	if (anIntArray9442[i] == -1)
	    return false;
	return true;
    }
    
    public byte[] method3152() {
	return aByteArray9469;
    }
    
    void method3099(int i, int[] is, int i_222_, int i_223_, int i_224_,
		    int i_225_, boolean bool) {
	int i_226_ = is.length;
	if (i == 0) {
	    i_222_ <<= 4;
	    i_223_ <<= 4;
	    i_224_ <<= 4;
	    if (!aBool9477) {
		for (int i_227_ = 0; i_227_ < anInt9444; i_227_++) {
		    anIntArray9494[i_227_] <<= 4;
		    anIntArray9447[i_227_] <<= 4;
		    anIntArray9448[i_227_] <<= 4;
		}
		aBool9477 = true;
	    }
	    int i_228_ = 0;
	    anInt9458 = 0;
	    anInt9481 = 0;
	    anInt9465 = 0;
	    for (int i_229_ = 0; i_229_ < i_226_; i_229_++) {
		int i_230_ = is[i_229_];
		if (i_230_ < anIntArrayArray9470.length) {
		    int[] is_231_ = anIntArrayArray9470[i_230_];
		    for (int i_232_ = 0; i_232_ < is_231_.length; i_232_++) {
			int i_233_ = is_231_[i_232_];
			anInt9458 += anIntArray9494[i_233_];
			anInt9481 += anIntArray9447[i_233_];
			anInt9465 += anIntArray9448[i_233_];
			i_228_++;
		    }
		}
	    }
	    if (i_228_ > 0) {
		anInt9458 = anInt9458 / i_228_ + i_222_;
		anInt9481 = anInt9481 / i_228_ + i_223_;
		anInt9465 = anInt9465 / i_228_ + i_224_;
	    } else {
		anInt9458 = i_222_;
		anInt9481 = i_223_;
		anInt9465 = i_224_;
	    }
	} else if (i == 1) {
	    i_222_ <<= 4;
	    i_223_ <<= 4;
	    i_224_ <<= 4;
	    if (!aBool9477) {
		for (int i_234_ = 0; i_234_ < anInt9444; i_234_++) {
		    anIntArray9494[i_234_] <<= 4;
		    anIntArray9447[i_234_] <<= 4;
		    anIntArray9448[i_234_] <<= 4;
		}
		aBool9477 = true;
	    }
	    for (int i_235_ = 0; i_235_ < i_226_; i_235_++) {
		int i_236_ = is[i_235_];
		if (i_236_ < anIntArrayArray9470.length) {
		    int[] is_237_ = anIntArrayArray9470[i_236_];
		    for (int i_238_ = 0; i_238_ < is_237_.length; i_238_++) {
			int i_239_ = is_237_[i_238_];
			anIntArray9494[i_239_] += i_222_;
			anIntArray9447[i_239_] += i_223_;
			anIntArray9448[i_239_] += i_224_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_240_ = 0; i_240_ < i_226_; i_240_++) {
		int i_241_ = is[i_240_];
		if (i_241_ < anIntArrayArray9470.length) {
		    int[] is_242_ = anIntArrayArray9470[i_241_];
		    if ((i_225_ & 0x1) == 0) {
			for (int i_243_ = 0; i_243_ < is_242_.length;
			     i_243_++) {
			    int i_244_ = is_242_[i_243_];
			    anIntArray9494[i_244_] -= anInt9458;
			    anIntArray9447[i_244_] -= anInt9481;
			    anIntArray9448[i_244_] -= anInt9465;
			    if (i_224_ != 0) {
				int i_245_ = Class427.anIntArray4806[i_224_];
				int i_246_ = Class427.anIntArray4805[i_224_];
				int i_247_ = (anIntArray9447[i_244_] * i_245_
					      + anIntArray9494[i_244_] * i_246_
					      + 16383) >> 14;
				anIntArray9447[i_244_]
				    = (anIntArray9447[i_244_] * i_246_
				       - anIntArray9494[i_244_] * i_245_
				       + 16383) >> 14;
				anIntArray9494[i_244_] = i_247_;
			    }
			    if (i_222_ != 0) {
				int i_248_ = Class427.anIntArray4806[i_222_];
				int i_249_ = Class427.anIntArray4805[i_222_];
				int i_250_ = (anIntArray9447[i_244_] * i_249_
					      - anIntArray9448[i_244_] * i_248_
					      + 16383) >> 14;
				anIntArray9448[i_244_]
				    = (anIntArray9447[i_244_] * i_248_
				       + anIntArray9448[i_244_] * i_249_
				       + 16383) >> 14;
				anIntArray9447[i_244_] = i_250_;
			    }
			    if (i_223_ != 0) {
				int i_251_ = Class427.anIntArray4806[i_223_];
				int i_252_ = Class427.anIntArray4805[i_223_];
				int i_253_ = (anIntArray9448[i_244_] * i_251_
					      + anIntArray9494[i_244_] * i_252_
					      + 16383) >> 14;
				anIntArray9448[i_244_]
				    = (anIntArray9448[i_244_] * i_252_
				       - anIntArray9494[i_244_] * i_251_
				       + 16383) >> 14;
				anIntArray9494[i_244_] = i_253_;
			    }
			    anIntArray9494[i_244_] += anInt9458;
			    anIntArray9447[i_244_] += anInt9481;
			    anIntArray9448[i_244_] += anInt9465;
			}
		    } else {
			for (int i_254_ = 0; i_254_ < is_242_.length;
			     i_254_++) {
			    int i_255_ = is_242_[i_254_];
			    anIntArray9494[i_255_] -= anInt9458;
			    anIntArray9447[i_255_] -= anInt9481;
			    anIntArray9448[i_255_] -= anInt9465;
			    if (i_222_ != 0) {
				int i_256_ = Class427.anIntArray4806[i_222_];
				int i_257_ = Class427.anIntArray4805[i_222_];
				int i_258_ = (anIntArray9447[i_255_] * i_257_
					      - anIntArray9448[i_255_] * i_256_
					      + 16383) >> 14;
				anIntArray9448[i_255_]
				    = (anIntArray9447[i_255_] * i_256_
				       + anIntArray9448[i_255_] * i_257_
				       + 16383) >> 14;
				anIntArray9447[i_255_] = i_258_;
			    }
			    if (i_224_ != 0) {
				int i_259_ = Class427.anIntArray4806[i_224_];
				int i_260_ = Class427.anIntArray4805[i_224_];
				int i_261_ = (anIntArray9447[i_255_] * i_259_
					      + anIntArray9494[i_255_] * i_260_
					      + 16383) >> 14;
				anIntArray9447[i_255_]
				    = (anIntArray9447[i_255_] * i_260_
				       - anIntArray9494[i_255_] * i_259_
				       + 16383) >> 14;
				anIntArray9494[i_255_] = i_261_;
			    }
			    if (i_223_ != 0) {
				int i_262_ = Class427.anIntArray4806[i_223_];
				int i_263_ = Class427.anIntArray4805[i_223_];
				int i_264_ = (anIntArray9448[i_255_] * i_262_
					      + anIntArray9494[i_255_] * i_263_
					      + 16383) >> 14;
				anIntArray9448[i_255_]
				    = (anIntArray9448[i_255_] * i_263_
				       - anIntArray9494[i_255_] * i_262_
				       + 16383) >> 14;
				anIntArray9494[i_255_] = i_264_;
			    }
			    anIntArray9494[i_255_] += anInt9458;
			    anIntArray9447[i_255_] += anInt9481;
			    anIntArray9448[i_255_] += anInt9465;
			}
		    }
		}
	    }
	} else if (i == 3) {
	    for (int i_265_ = 0; i_265_ < i_226_; i_265_++) {
		int i_266_ = is[i_265_];
		if (i_266_ < anIntArrayArray9470.length) {
		    int[] is_267_ = anIntArrayArray9470[i_266_];
		    for (int i_268_ = 0; i_268_ < is_267_.length; i_268_++) {
			int i_269_ = is_267_[i_268_];
			anIntArray9494[i_269_] -= anInt9458;
			anIntArray9447[i_269_] -= anInt9481;
			anIntArray9448[i_269_] -= anInt9465;
			anIntArray9494[i_269_]
			    = anIntArray9494[i_269_] * i_222_ / 128;
			anIntArray9447[i_269_]
			    = anIntArray9447[i_269_] * i_223_ / 128;
			anIntArray9448[i_269_]
			    = anIntArray9448[i_269_] * i_224_ / 128;
			anIntArray9494[i_269_] += anInt9458;
			anIntArray9447[i_269_] += anInt9481;
			anIntArray9448[i_269_] += anInt9465;
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9457 != null && aByteArray9469 != null) {
		for (int i_270_ = 0; i_270_ < i_226_; i_270_++) {
		    int i_271_ = is[i_270_];
		    if (i_271_ < anIntArrayArray9457.length) {
			int[] is_272_ = anIntArrayArray9457[i_271_];
			for (int i_273_ = 0; i_273_ < is_272_.length;
			     i_273_++) {
			    int i_274_ = is_272_[i_273_];
			    int i_275_
				= (aByteArray9469[i_274_] & 0xff) + i_222_ * 8;
			    if (i_275_ < 0)
				i_275_ = 0;
			    else if (i_275_ > 255)
				i_275_ = 255;
			    aByteArray9469[i_274_] = (byte) i_275_;
			}
		    }
		}
		if (aClass118Array9485 != null) {
		    for (int i_276_ = 0; i_276_ < anInt9484; i_276_++) {
			Class118 class118 = aClass118Array9485[i_276_];
			Class117 class117 = aClass117Array9486[i_276_];
			class117.anInt1411
			    = (class117.anInt1411 * -150900843 & 0xffffff
			       | 255 - ((aByteArray9469
					 [class118.anInt1418 * 2118166057])
					& 0xff) << 24) * 874668989;
		    }
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9457 != null) {
		for (int i_277_ = 0; i_277_ < i_226_; i_277_++) {
		    int i_278_ = is[i_277_];
		    if (i_278_ < anIntArrayArray9457.length) {
			int[] is_279_ = anIntArrayArray9457[i_278_];
			for (int i_280_ = 0; i_280_ < is_279_.length;
			     i_280_++) {
			    int i_281_ = is_279_[i_280_];
			    int i_282_ = aShortArray9471[i_281_] & 0xffff;
			    int i_283_ = i_282_ >> 10 & 0x3f;
			    int i_284_ = i_282_ >> 7 & 0x7;
			    int i_285_ = i_282_ & 0x7f;
			    i_283_ = i_283_ + i_222_ & 0x3f;
			    i_284_ += i_223_;
			    if (i_284_ < 0)
				i_284_ = 0;
			    else if (i_284_ > 7)
				i_284_ = 7;
			    i_285_ += i_224_;
			    if (i_285_ < 0)
				i_285_ = 0;
			    else if (i_285_ > 127)
				i_285_ = 127;
			    aShortArray9471[i_281_]
				= (short) (i_283_ << 10 | i_284_ << 7
					   | i_285_);
			}
			aBool9476 = true;
		    }
		}
		if (aClass118Array9485 != null) {
		    for (int i_286_ = 0; i_286_ < anInt9484; i_286_++) {
			Class118 class118 = aClass118Array9485[i_286_];
			Class117 class117 = aClass117Array9486[i_286_];
			class117.anInt1411
			    = (class117.anInt1411 * -150900843 & ~0xffffff
			       | ((Class415.anIntArray4666
				   [Class315.method5705(((aShortArray9471
							  [(class118.anInt1418
							    * 2118166057)])
							 & 0xffff),
							1357392316) & 0xffff])
				  & 0xffffff)) * 874668989;
		    }
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9487 != null) {
		for (int i_287_ = 0; i_287_ < i_226_; i_287_++) {
		    int i_288_ = is[i_287_];
		    if (i_288_ < anIntArrayArray9487.length) {
			int[] is_289_ = anIntArrayArray9487[i_288_];
			for (int i_290_ = 0; i_290_ < is_289_.length;
			     i_290_++) {
			    Class117 class117
				= aClass117Array9486[is_289_[i_290_]];
			    class117.anInt1405 += i_222_ * 1831486073;
			    class117.anInt1406 += i_223_ * -108929861;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9487 != null) {
		for (int i_291_ = 0; i_291_ < i_226_; i_291_++) {
		    int i_292_ = is[i_291_];
		    if (i_292_ < anIntArrayArray9487.length) {
			int[] is_293_ = anIntArrayArray9487[i_292_];
			for (int i_294_ = 0; i_294_ < is_293_.length;
			     i_294_++) {
			    Class117 class117
				= aClass117Array9486[is_293_[i_294_]];
			    class117.aFloat1403 = (class117.aFloat1403
						   * (float) i_222_ / 128.0F);
			    class117.aFloat1404 = (class117.aFloat1404
						   * (float) i_223_ / 128.0F);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9487 != null) {
		for (int i_295_ = 0; i_295_ < i_226_; i_295_++) {
		    int i_296_ = is[i_295_];
		    if (i_296_ < anIntArrayArray9487.length) {
			int[] is_297_ = anIntArrayArray9487[i_296_];
			for (int i_298_ = 0; i_298_ < is_297_.length;
			     i_298_++) {
			    Class117 class117
				= aClass117Array9486[is_297_[i_298_]];
			    class117.anInt1409
				= (class117.anInt1409 * -133325595 + i_222_
				   & 0x3fff) * 1832042733;
			}
		    }
		}
	    }
	}
    }
    
    public int method3004() {
	if (!aBool9488)
	    method15173();
	return aShort9490;
    }
    
    public void method3015(int i) {
	if ((anInt9441 & 0x5) != 5)
	    throw new IllegalStateException();
	if (i == 4096)
	    method15101();
	else if (i == 8192)
	    method15102();
	else if (i == 12288)
	    method15103();
	else {
	    int i_299_ = Class427.anIntArray4806[i];
	    int i_300_ = Class427.anIntArray4805[i];
	    synchronized (this) {
		for (int i_301_ = 0; i_301_ < anInt9444; i_301_++) {
		    int i_302_ = ((anIntArray9448[i_301_] * i_299_
				   + anIntArray9494[i_301_] * i_300_)
				  >> 14);
		    anIntArray9448[i_301_]
			= (anIntArray9448[i_301_] * i_300_
			   - anIntArray9494[i_301_] * i_299_) >> 14;
		    anIntArray9494[i_301_] = i_302_;
		}
		method15151();
	    }
	}
    }
    
    void method15100() {
	aClass96Array9450 = null;
	aClass96Array9451 = null;
	aClass107Array9466 = null;
	aBool9488 = false;
    }
    
    void method15101() {
	synchronized (this) {
	    for (int i = 0; i < anInt9444; i++) {
		int i_303_ = anIntArray9494[i];
		anIntArray9494[i] = anIntArray9448[i];
		anIntArray9448[i] = -i_303_;
	    }
	    method15151();
	}
    }
    
    void method15102() {
	synchronized (this) {
	    for (int i = 0; i < anInt9444; i++) {
		anIntArray9494[i] = -anIntArray9494[i];
		anIntArray9448[i] = -anIntArray9448[i];
	    }
	    method15151();
	}
    }
    
    void method15103() {
	synchronized (this) {
	    for (int i = 0; i < anInt9444; i++) {
		int i_304_ = anIntArray9448[i];
		anIntArray9448[i] = anIntArray9494[i];
		anIntArray9494[i] = -i_304_;
	    }
	    method15151();
	}
    }
    
    public int method3054() {
	return anInt9443;
    }
    
    void method15104() {
	synchronized (this) {
	    for (int i = 0; i < anInt9474; i++) {
		anIntArray9494[i] = -anIntArray9494[i];
		anIntArray9448[i] = -anIntArray9448[i];
		if (aClass96Array9450[i] != null) {
		    aClass96Array9450[i].anInt1159
			= -aClass96Array9450[i].anInt1159;
		    aClass96Array9450[i].anInt1156
			= -aClass96Array9450[i].anInt1156;
		}
	    }
	    if (aClass107Array9466 != null) {
		for (int i = 0; i < anInt9440; i++) {
		    if (aClass107Array9466[i] != null) {
			aClass107Array9466[i].anInt1315
			    = -aClass107Array9466[i].anInt1315;
			aClass107Array9466[i].anInt1313
			    = -aClass107Array9466[i].anInt1313;
		    }
		}
	    }
	    for (int i = anInt9474; i < anInt9444; i++) {
		anIntArray9494[i] = -anIntArray9494[i];
		anIntArray9448[i] = -anIntArray9448[i];
	    }
	    anInt9432 = 0;
	    aBool9488 = false;
	}
    }
    
    void method15105() {
	synchronized (this) {
	    for (int i = 0; i < anInt9474; i++) {
		int i_305_ = anIntArray9448[i];
		anIntArray9448[i] = anIntArray9494[i];
		anIntArray9494[i] = -i_305_;
		if (aClass96Array9450[i] != null) {
		    i_305_ = aClass96Array9450[i].anInt1156;
		    aClass96Array9450[i].anInt1156
			= aClass96Array9450[i].anInt1159;
		    aClass96Array9450[i].anInt1159 = -i_305_;
		}
	    }
	    if (aClass107Array9466 != null) {
		for (int i = 0; i < anInt9440; i++) {
		    if (aClass107Array9466[i] != null) {
			int i_306_ = aClass107Array9466[i].anInt1313;
			aClass107Array9466[i].anInt1313
			    = aClass107Array9466[i].anInt1315;
			aClass107Array9466[i].anInt1315 = -i_306_;
		    }
		}
	    }
	    for (int i = anInt9474; i < anInt9444; i++) {
		int i_307_ = anIntArray9448[i];
		anIntArray9448[i] = anIntArray9494[i];
		anIntArray9494[i] = -i_307_;
	    }
	    anInt9432 = 0;
	    aBool9488 = false;
	}
    }
    
    public void method3017(int i) {
	if ((anInt9441 & 0x6) != 6)
	    throw new IllegalStateException();
	int i_308_ = Class427.anIntArray4806[i];
	int i_309_ = Class427.anIntArray4805[i];
	synchronized (this) {
	    for (int i_310_ = 0; i_310_ < anInt9444; i_310_++) {
		int i_311_ = ((anIntArray9447[i_310_] * i_309_
			       - anIntArray9448[i_310_] * i_308_)
			      >> 14);
		anIntArray9448[i_310_]
		    = (anIntArray9447[i_310_] * i_308_
		       + anIntArray9448[i_310_] * i_309_) >> 14;
		anIntArray9447[i_310_] = i_311_;
	    }
	    method15151();
	}
    }
    
    final void method15106(boolean bool, boolean bool_312_,
			   boolean bool_313_) {
	for (int i = 0; i < anInt9484; i++) {
	    Class118 class118 = aClass118Array9485[i];
	    if (class118.aBool1419) {
		Class117 class117 = aClass117Array9486[i];
		aClass185_Sub2_9475.method15013
		    (bool, bool_312_, bool_313_,
		     class117.anInt1407 * -876082967,
		     class117.anInt1412 * 61832617, class117.aFloat1410,
		     class117.anInt1402 * 976146389,
		     class117.anInt1408 * 287725777, class118.aShort1416,
		     class117.anInt1411 * -150900843, class118.aByte1415,
		     class118.aByte1417);
	    }
	}
    }
    
    void method15107() {
	for (int i = 0; i < anInt9440; i++) {
	    short i_314_
		= aShortArray9428 != null ? aShortArray9428[i] : (short) -1;
	    if (i_314_ == -1) {
		int i_315_ = aShortArray9471[i] & 0xffff;
		int i_316_ = (i_315_ & 0x7f) * anInt9454 >> 7;
		short i_317_
		    = Class315.method5705(i_315_ & ~0x7f | i_316_, -84249238);
		if (anIntArray9461[i] == -1) {
		    int i_318_ = anIntArray9459[i] & ~0x1ffff;
		    anIntArray9459[i]
			= i_318_ | Class146.method2452(i_317_, i_318_ >> 17,
						       -1739512326);
		} else if (anIntArray9461[i] != -2) {
		    int i_319_ = anIntArray9459[i] & ~0x1ffff;
		    anIntArray9459[i]
			= i_319_ | Class146.method2452(i_317_, i_319_ >> 17,
						       -1470394528);
		    i_319_ = anIntArray9460[i] & ~0x1ffff;
		    anIntArray9460[i]
			= i_319_ | Class146.method2452(i_317_, i_319_ >> 17,
						       -840065163);
		    i_319_ = anIntArray9461[i] & ~0x1ffff;
		    anIntArray9461[i]
			= i_319_ | Class146.method2452(i_317_, i_319_ >> 17,
						       -1066990087);
		}
	    }
	}
	anInt9432 = 2;
    }
    
    public void method3020() {
	if ((anInt9441 & 0x10) != 16)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i = 0; i < anInt9444; i++)
		anIntArray9448[i] = -anIntArray9448[i];
	    if (aClass96Array9450 != null) {
		for (int i = 0; i < anInt9474; i++) {
		    if (aClass96Array9450[i] != null)
			aClass96Array9450[i].anInt1156
			    = -aClass96Array9450[i].anInt1156;
		}
	    }
	    if (aClass96Array9451 != null) {
		for (int i = 0; i < anInt9474; i++) {
		    if (aClass96Array9451[i] != null)
			aClass96Array9451[i].anInt1156
			    = -aClass96Array9451[i].anInt1156;
		}
	    }
	    if (aClass107Array9466 != null) {
		for (int i = 0; i < anInt9440; i++) {
		    if (aClass107Array9466[i] != null)
			aClass107Array9466[i].anInt1313
			    = -aClass107Array9466[i].anInt1313;
		}
	    }
	    short[] is = aShortArray9479;
	    aShortArray9479 = aShortArray9456;
	    aShortArray9456 = is;
	    if (aFloatArrayArray9452 != null) {
		for (int i = 0; i < anInt9440; i++) {
		    if (aFloatArrayArray9452[i] != null) {
			float f = aFloatArrayArray9452[i][0];
			aFloatArrayArray9452[i][0]
			    = aFloatArrayArray9452[i][2];
			aFloatArrayArray9452[i][2] = f;
		    }
		    if (aFloatArrayArray9429[i] != null) {
			float f = aFloatArrayArray9429[i][0];
			aFloatArrayArray9429[i][0]
			    = aFloatArrayArray9429[i][2];
			aFloatArrayArray9429[i][2] = f;
		    }
		}
	    }
	    aBool9488 = false;
	    anInt9432 = 0;
	}
    }
    
    public void method3025(int i, int i_320_, int i_321_) {
	if (i != 128 && (anInt9441 & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_320_ != 128 && (anInt9441 & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_321_ != 128 && (anInt9441 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_322_ = 0; i_322_ < anInt9444; i_322_++) {
		anIntArray9494[i_322_] = anIntArray9494[i_322_] * i >> 7;
		anIntArray9447[i_322_] = anIntArray9447[i_322_] * i_320_ >> 7;
		anIntArray9448[i_322_] = anIntArray9448[i_322_] * i_321_ >> 7;
	    }
	    aBool9488 = false;
	}
    }
    
    public void method3022(int i, int i_323_, Class151 class151,
			   Class151 class151_324_, int i_325_, int i_326_,
			   int i_327_) {
	if (i == 3) {
	    if ((anInt9441 & 0x7) != 7)
		throw new IllegalStateException();
	} else if ((anInt9441 & 0x2) != 2)
	    throw new IllegalStateException();
	if (!aBool9488)
	    method15173();
	int i_328_ = i_325_ + aShort9493;
	int i_329_ = i_325_ + aShort9468;
	int i_330_ = i_327_ + aShort9495;
	int i_331_ = i_327_ + aShort9449;
	if (i == 4 || (i_328_ >= 0
		       && ((i_329_ + class151.anInt1702 * 127780559
			    >> class151.anInt1703 * -1495101509)
			   < class151.anInt1701 * -1924295585)
		       && i_330_ >= 0
		       && ((i_331_ + class151.anInt1702 * 127780559
			    >> class151.anInt1703 * -1495101509)
			   < class151.anInt1700 * -1466328823))) {
	    int[][] is = class151.anIntArrayArray1704;
	    int[][] is_332_ = null;
	    if (class151_324_ != null)
		is_332_ = class151_324_.anIntArrayArray1704;
	    if (i == 4 || i == 5) {
		if (class151_324_ == null
		    || (i_328_ < 0
			|| ((i_329_ + class151_324_.anInt1702 * 127780559
			     >> class151_324_.anInt1703 * -1495101509)
			    >= class151_324_.anInt1701 * -1924295585)
			|| i_330_ < 0
			|| ((i_331_ + class151_324_.anInt1702 * 127780559
			     >> class151_324_.anInt1703 * -1495101509)
			    >= class151_324_.anInt1700 * -1466328823)))
		    return;
	    } else {
		i_328_ >>= class151.anInt1703 * -1495101509;
		i_329_ = (i_329_ + (class151.anInt1702 * 127780559 - 1)
			  >> class151.anInt1703 * -1495101509);
		i_330_ >>= class151.anInt1703 * -1495101509;
		i_331_ = (i_331_ + (class151.anInt1702 * 127780559 - 1)
			  >> class151.anInt1703 * -1495101509);
		if (is[i_328_][i_330_] == i_326_
		    && is[i_329_][i_330_] == i_326_
		    && is[i_328_][i_331_] == i_326_
		    && is[i_329_][i_331_] == i_326_)
		    return;
	    }
	    synchronized (this) {
		if (i == 1) {
		    int i_333_ = class151.anInt1702 * 127780559 - 1;
		    for (int i_334_ = 0; i_334_ < anInt9474; i_334_++) {
			int i_335_ = anIntArray9494[i_334_] + i_325_;
			int i_336_ = anIntArray9448[i_334_] + i_327_;
			int i_337_ = i_335_ & i_333_;
			int i_338_ = i_336_ & i_333_;
			int i_339_
			    = i_335_ >> class151.anInt1703 * -1495101509;
			int i_340_
			    = i_336_ >> class151.anInt1703 * -1495101509;
			int i_341_
			    = (((is[i_339_][i_340_]
				 * (class151.anInt1702 * 127780559 - i_337_))
				+ is[i_339_ + 1][i_340_] * i_337_)
			       >> class151.anInt1703 * -1495101509);
			int i_342_
			    = (((is[i_339_][i_340_ + 1]
				 * (class151.anInt1702 * 127780559 - i_337_))
				+ is[i_339_ + 1][i_340_ + 1] * i_337_)
			       >> class151.anInt1703 * -1495101509);
			int i_343_ = (i_341_ * (class151.anInt1702 * 127780559
						- i_338_) + i_342_ * i_338_
				      >> class151.anInt1703 * -1495101509);
			anIntArray9447[i_334_]
			    = anIntArray9447[i_334_] + i_343_ - i_326_;
		    }
		    for (int i_344_ = anInt9474; i_344_ < anInt9444;
			 i_344_++) {
			int i_345_ = anIntArray9494[i_344_] + i_325_;
			int i_346_ = anIntArray9448[i_344_] + i_327_;
			int i_347_ = i_345_ & i_333_;
			int i_348_ = i_346_ & i_333_;
			int i_349_
			    = i_345_ >> class151.anInt1703 * -1495101509;
			int i_350_
			    = i_346_ >> class151.anInt1703 * -1495101509;
			if (i_349_ >= 0 && i_349_ < is.length - 1
			    && i_350_ >= 0 && i_350_ < is[0].length - 1) {
			    int i_351_ = (((is[i_349_][i_350_]
					    * (class151.anInt1702 * 127780559
					       - i_347_))
					   + is[i_349_ + 1][i_350_] * i_347_)
					  >> class151.anInt1703 * -1495101509);
			    int i_352_
				= (((is[i_349_][i_350_ + 1]
				     * (class151.anInt1702 * 127780559
					- i_347_))
				    + is[i_349_ + 1][i_350_ + 1] * i_347_)
				   >> class151.anInt1703 * -1495101509);
			    int i_353_
				= (i_351_ * (class151.anInt1702 * 127780559
					     - i_348_) + i_352_ * i_348_
				   >> class151.anInt1703 * -1495101509);
			    anIntArray9447[i_344_]
				= anIntArray9447[i_344_] + i_353_ - i_326_;
			}
		    }
		} else if (i == 2) {
		    if (aShort9491 == 0)
			return;
		    int i_354_ = class151.anInt1702 * 127780559 - 1;
		    for (int i_355_ = 0; i_355_ < anInt9474; i_355_++) {
			int i_356_
			    = (anIntArray9447[i_355_] << 16) / aShort9491;
			if (i_356_ < i_323_) {
			    int i_357_ = anIntArray9494[i_355_] + i_325_;
			    int i_358_ = anIntArray9448[i_355_] + i_327_;
			    int i_359_ = i_357_ & i_354_;
			    int i_360_ = i_358_ & i_354_;
			    int i_361_
				= i_357_ >> class151.anInt1703 * -1495101509;
			    int i_362_
				= i_358_ >> class151.anInt1703 * -1495101509;
			    int i_363_ = (((is[i_361_][i_362_]
					    * (class151.anInt1702 * 127780559
					       - i_359_))
					   + is[i_361_ + 1][i_362_] * i_359_)
					  >> class151.anInt1703 * -1495101509);
			    int i_364_
				= (((is[i_361_][i_362_ + 1]
				     * (class151.anInt1702 * 127780559
					- i_359_))
				    + is[i_361_ + 1][i_362_ + 1] * i_359_)
				   >> class151.anInt1703 * -1495101509);
			    int i_365_
				= (i_363_ * (class151.anInt1702 * 127780559
					     - i_360_) + i_364_ * i_360_
				   >> class151.anInt1703 * -1495101509);
			    anIntArray9447[i_355_]
				= anIntArray9447[i_355_] + ((i_365_ - i_326_)
							    * (i_323_ - i_356_)
							    / i_323_);
			} else
			    anIntArray9447[i_355_] = anIntArray9447[i_355_];
		    }
		    for (int i_366_ = anInt9474; i_366_ < anInt9444;
			 i_366_++) {
			int i_367_
			    = (anIntArray9447[i_366_] << 16) / aShort9491;
			if (i_367_ < i_323_) {
			    int i_368_ = anIntArray9494[i_366_] + i_325_;
			    int i_369_ = anIntArray9448[i_366_] + i_327_;
			    int i_370_ = i_368_ & i_354_;
			    int i_371_ = i_369_ & i_354_;
			    int i_372_
				= i_368_ >> class151.anInt1703 * -1495101509;
			    int i_373_
				= i_369_ >> class151.anInt1703 * -1495101509;
			    if (i_372_ >= 0
				&& (i_372_
				    < class151.anInt1701 * -1924295585 - 1)
				&& i_373_ >= 0
				&& (i_373_
				    < class151.anInt1700 * -1466328823 - 1)) {
				int i_374_
				    = (((is[i_372_][i_373_]
					 * (class151.anInt1702 * 127780559
					    - i_370_))
					+ is[i_372_ + 1][i_373_] * i_370_)
				       >> class151.anInt1703 * -1495101509);
				int i_375_
				    = (((is[i_372_][i_373_ + 1]
					 * (class151.anInt1702 * 127780559
					    - i_370_))
					+ is[i_372_ + 1][i_373_ + 1] * i_370_)
				       >> class151.anInt1703 * -1495101509);
				int i_376_
				    = (i_374_ * (class151.anInt1702 * 127780559
						 - i_371_) + i_375_ * i_371_
				       >> class151.anInt1703 * -1495101509);
				anIntArray9447[i_366_]
				    = (anIntArray9447[i_366_]
				       + ((i_376_ - i_326_) * (i_323_ - i_367_)
					  / i_323_));
			    }
			} else
			    anIntArray9447[i_366_] = anIntArray9447[i_366_];
		    }
		} else if (i == 3) {
		    int i_377_ = (i_323_ & 0xff) * 16;
		    int i_378_ = (i_323_ >> 8 & 0xff) * 16;
		    int i_379_ = (i_323_ >> 16 & 0xff) << 6;
		    int i_380_ = (i_323_ >> 24 & 0xff) << 6;
		    if (i_325_ - (i_377_ >> 1) < 0
			|| ((i_325_ + (i_377_ >> 1)
			     + class151.anInt1702 * 127780559)
			    >= (class151.anInt1701 * -1924295585
				<< class151.anInt1703 * -1495101509))
			|| i_327_ - (i_378_ >> 1) < 0
			|| ((i_327_ + (i_378_ >> 1)
			     + class151.anInt1702 * 127780559)
			    >= (class151.anInt1700 * -1466328823
				<< class151.anInt1703 * -1495101509)))
			return;
		    method3115(class151, i_325_, i_326_, i_327_, i_377_,
			       i_378_, i_379_, i_380_);
		} else if (i == 4) {
		    int i_381_ = class151_324_.anInt1702 * 127780559 - 1;
		    int i_382_ = aShort9492 - aShort9491;
		    for (int i_383_ = 0; i_383_ < anInt9474; i_383_++) {
			int i_384_ = anIntArray9494[i_383_] + i_325_;
			int i_385_ = anIntArray9448[i_383_] + i_327_;
			int i_386_ = i_384_ & i_381_;
			int i_387_ = i_385_ & i_381_;
			int i_388_
			    = i_384_ >> class151_324_.anInt1703 * -1495101509;
			int i_389_
			    = i_385_ >> class151_324_.anInt1703 * -1495101509;
			int i_390_
			    = (((is_332_[i_388_][i_389_]
				 * (class151_324_.anInt1702 * 127780559
				    - i_386_))
				+ is_332_[i_388_ + 1][i_389_] * i_386_)
			       >> class151_324_.anInt1703 * -1495101509);
			int i_391_
			    = (((is_332_[i_388_][i_389_ + 1]
				 * (class151_324_.anInt1702 * 127780559
				    - i_386_))
				+ is_332_[i_388_ + 1][i_389_ + 1] * i_386_)
			       >> class151_324_.anInt1703 * -1495101509);
			int i_392_
			    = (i_390_ * (class151_324_.anInt1702 * 127780559
					 - i_387_) + i_391_ * i_387_
			       >> class151_324_.anInt1703 * -1495101509);
			anIntArray9447[i_383_]
			    = (anIntArray9447[i_383_] + (i_392_ - i_326_)
			       + i_382_);
		    }
		    for (int i_393_ = anInt9474; i_393_ < anInt9444;
			 i_393_++) {
			int i_394_ = anIntArray9494[i_393_] + i_325_;
			int i_395_ = anIntArray9448[i_393_] + i_327_;
			int i_396_ = i_394_ & i_381_;
			int i_397_ = i_395_ & i_381_;
			int i_398_
			    = i_394_ >> class151_324_.anInt1703 * -1495101509;
			int i_399_
			    = i_395_ >> class151_324_.anInt1703 * -1495101509;
			if (i_398_ >= 0
			    && (i_398_
				< class151_324_.anInt1701 * -1924295585 - 1)
			    && i_399_ >= 0
			    && (i_399_
				< class151_324_.anInt1700 * -1466328823 - 1)) {
			    int i_400_
				= (((is_332_[i_398_][i_399_]
				     * (class151_324_.anInt1702 * 127780559
					- i_396_))
				    + is_332_[i_398_ + 1][i_399_] * i_396_)
				   >> class151_324_.anInt1703 * -1495101509);
			    int i_401_
				= (((is_332_[i_398_][i_399_ + 1]
				     * (class151_324_.anInt1702 * 127780559
					- i_396_))
				    + is_332_[i_398_ + 1][i_399_ + 1] * i_396_)
				   >> class151_324_.anInt1703 * -1495101509);
			    int i_402_
				= ((i_400_
				    * (class151_324_.anInt1702 * 127780559
				       - i_397_)) + i_401_ * i_397_
				   >> class151_324_.anInt1703 * -1495101509);
			    anIntArray9447[i_393_]
				= (anIntArray9447[i_393_] + (i_402_ - i_326_)
				   + i_382_);
			}
		    }
		} else if (i == 5) {
		    int i_403_ = class151_324_.anInt1702 * 127780559 - 1;
		    int i_404_ = aShort9492 - aShort9491;
		    for (int i_405_ = 0; i_405_ < anInt9474; i_405_++) {
			int i_406_ = anIntArray9494[i_405_] + i_325_;
			int i_407_ = anIntArray9448[i_405_] + i_327_;
			int i_408_ = i_406_ & i_403_;
			int i_409_ = i_407_ & i_403_;
			int i_410_
			    = i_406_ >> class151.anInt1703 * -1495101509;
			int i_411_
			    = i_407_ >> class151.anInt1703 * -1495101509;
			int i_412_
			    = (((is[i_410_][i_411_]
				 * (class151.anInt1702 * 127780559 - i_408_))
				+ is[i_410_ + 1][i_411_] * i_408_)
			       >> class151.anInt1703 * -1495101509);
			int i_413_
			    = (((is[i_410_][i_411_ + 1]
				 * (class151.anInt1702 * 127780559 - i_408_))
				+ is[i_410_ + 1][i_411_ + 1] * i_408_)
			       >> class151.anInt1703 * -1495101509);
			int i_414_ = (i_412_ * (class151.anInt1702 * 127780559
						- i_409_) + i_413_ * i_409_
				      >> class151.anInt1703 * -1495101509);
			i_412_ = (((is_332_[i_410_][i_411_]
				    * (class151_324_.anInt1702 * 127780559
				       - i_408_))
				   + is_332_[i_410_ + 1][i_411_] * i_408_)
				  >> class151_324_.anInt1703 * -1495101509);
			i_413_ = (((is_332_[i_410_][i_411_ + 1]
				    * (class151_324_.anInt1702 * 127780559
				       - i_408_))
				   + is_332_[i_410_ + 1][i_411_ + 1] * i_408_)
				  >> class151_324_.anInt1703 * -1495101509);
			int i_415_
			    = (i_412_ * (class151_324_.anInt1702 * 127780559
					 - i_409_) + i_413_ * i_409_
			       >> class151_324_.anInt1703 * -1495101509);
			int i_416_ = i_414_ - i_415_ - i_323_;
			anIntArray9447[i_405_]
			    = ((anIntArray9447[i_405_] << 8) / i_404_ * i_416_
			       >> 8) - (i_326_ - i_414_);
		    }
		    for (int i_417_ = anInt9474; i_417_ < anInt9444;
			 i_417_++) {
			int i_418_ = anIntArray9494[i_417_] + i_325_;
			int i_419_ = anIntArray9448[i_417_] + i_327_;
			int i_420_ = i_418_ & i_403_;
			int i_421_ = i_419_ & i_403_;
			int i_422_
			    = i_418_ >> class151.anInt1703 * -1495101509;
			int i_423_
			    = i_419_ >> class151.anInt1703 * -1495101509;
			if (i_422_ >= 0
			    && i_422_ < class151.anInt1701 * -1924295585 - 1
			    && (i_422_
				< class151_324_.anInt1701 * -1924295585 - 1)
			    && i_423_ >= 0
			    && i_423_ < class151.anInt1700 * -1466328823 - 1
			    && (i_423_
				< class151_324_.anInt1700 * -1466328823 - 1)) {
			    int i_424_ = (((is[i_422_][i_423_]
					    * (class151.anInt1702 * 127780559
					       - i_420_))
					   + is[i_422_ + 1][i_423_] * i_420_)
					  >> class151.anInt1703 * -1495101509);
			    int i_425_
				= (((is[i_422_][i_423_ + 1]
				     * (class151.anInt1702 * 127780559
					- i_420_))
				    + is[i_422_ + 1][i_423_ + 1] * i_420_)
				   >> class151.anInt1703 * -1495101509);
			    int i_426_
				= (i_424_ * (class151.anInt1702 * 127780559
					     - i_421_) + i_425_ * i_421_
				   >> class151.anInt1703 * -1495101509);
			    i_424_
				= (((is_332_[i_422_][i_423_]
				     * (class151_324_.anInt1702 * 127780559
					- i_420_))
				    + is_332_[i_422_ + 1][i_423_] * i_420_)
				   >> class151_324_.anInt1703 * -1495101509);
			    i_425_
				= (((is_332_[i_422_][i_423_ + 1]
				     * (class151_324_.anInt1702 * 127780559
					- i_420_))
				    + is_332_[i_422_ + 1][i_423_ + 1] * i_420_)
				   >> class151_324_.anInt1703 * -1495101509);
			    int i_427_
				= ((i_424_
				    * (class151_324_.anInt1702 * 127780559
				       - i_421_)) + i_425_ * i_421_
				   >> class151_324_.anInt1703 * -1495101509);
			    int i_428_ = i_426_ - i_427_ - i_323_;
			    anIntArray9447[i_417_]
				= (((anIntArray9447[i_417_] << 8) / i_404_
				    * i_428_)
				   >> 8) - (i_326_ - i_426_);
			}
		    }
		}
		aBool9488 = false;
	    }
	}
    }
    
    public void method3180(int i) {
	if ((anInt9441 & 0x6) != 6)
	    throw new IllegalStateException();
	int i_429_ = Class427.anIntArray4806[i];
	int i_430_ = Class427.anIntArray4805[i];
	synchronized (this) {
	    for (int i_431_ = 0; i_431_ < anInt9444; i_431_++) {
		int i_432_ = ((anIntArray9447[i_431_] * i_430_
			       - anIntArray9448[i_431_] * i_429_)
			      >> 14);
		anIntArray9448[i_431_]
		    = (anIntArray9447[i_431_] * i_429_
		       + anIntArray9448[i_431_] * i_430_) >> 14;
		anIntArray9447[i_431_] = i_432_;
	    }
	    method15151();
	}
    }
    
    void method3202() {
	if (aClass185_Sub2_9475.anInt9367 * 442227785 > 1) {
	    synchronized (this) {
		while (aBool1973) {
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		aBool1973 = true;
	    }
	}
    }
    
    void method3109() {
	if (aClass185_Sub2_9475.anInt9367 * 442227785 > 1) {
	    synchronized (this) {
		aBool1973 = false;
		this.notifyAll();
	    }
	}
    }
    
    boolean method3032() {
	if (anIntArrayArray9470 == null)
	    return false;
	anInt9458 = 0;
	anInt9481 = 0;
	anInt9465 = 0;
	return true;
    }
    
    void method3107() {
	if (aBool9477) {
	    for (int i = 0; i < anInt9444; i++) {
		anIntArray9494[i] = anIntArray9494[i] + 7 >> 4;
		anIntArray9447[i] = anIntArray9447[i] + 7 >> 4;
		anIntArray9448[i] = anIntArray9448[i] + 7 >> 4;
	    }
	    aBool9477 = false;
	}
	if (aBool9476) {
	    method15135();
	    aBool9476 = false;
	}
	aBool9488 = false;
    }
    
    void method3033(int i, int[] is, int i_433_, int i_434_, int i_435_,
		    int i_436_, boolean bool) {
	int i_437_ = is.length;
	if (i == 0) {
	    i_433_ <<= 4;
	    i_434_ <<= 4;
	    i_435_ <<= 4;
	    if (!aBool9477) {
		for (int i_438_ = 0; i_438_ < anInt9444; i_438_++) {
		    anIntArray9494[i_438_] <<= 4;
		    anIntArray9447[i_438_] <<= 4;
		    anIntArray9448[i_438_] <<= 4;
		}
		aBool9477 = true;
	    }
	    int i_439_ = 0;
	    anInt9458 = 0;
	    anInt9481 = 0;
	    anInt9465 = 0;
	    for (int i_440_ = 0; i_440_ < i_437_; i_440_++) {
		int i_441_ = is[i_440_];
		if (i_441_ < anIntArrayArray9470.length) {
		    int[] is_442_ = anIntArrayArray9470[i_441_];
		    for (int i_443_ = 0; i_443_ < is_442_.length; i_443_++) {
			int i_444_ = is_442_[i_443_];
			anInt9458 += anIntArray9494[i_444_];
			anInt9481 += anIntArray9447[i_444_];
			anInt9465 += anIntArray9448[i_444_];
			i_439_++;
		    }
		}
	    }
	    if (i_439_ > 0) {
		anInt9458 = anInt9458 / i_439_ + i_433_;
		anInt9481 = anInt9481 / i_439_ + i_434_;
		anInt9465 = anInt9465 / i_439_ + i_435_;
	    } else {
		anInt9458 = i_433_;
		anInt9481 = i_434_;
		anInt9465 = i_435_;
	    }
	} else if (i == 1) {
	    i_433_ <<= 4;
	    i_434_ <<= 4;
	    i_435_ <<= 4;
	    if (!aBool9477) {
		for (int i_445_ = 0; i_445_ < anInt9444; i_445_++) {
		    anIntArray9494[i_445_] <<= 4;
		    anIntArray9447[i_445_] <<= 4;
		    anIntArray9448[i_445_] <<= 4;
		}
		aBool9477 = true;
	    }
	    for (int i_446_ = 0; i_446_ < i_437_; i_446_++) {
		int i_447_ = is[i_446_];
		if (i_447_ < anIntArrayArray9470.length) {
		    int[] is_448_ = anIntArrayArray9470[i_447_];
		    for (int i_449_ = 0; i_449_ < is_448_.length; i_449_++) {
			int i_450_ = is_448_[i_449_];
			anIntArray9494[i_450_] += i_433_;
			anIntArray9447[i_450_] += i_434_;
			anIntArray9448[i_450_] += i_435_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_451_ = 0; i_451_ < i_437_; i_451_++) {
		int i_452_ = is[i_451_];
		if (i_452_ < anIntArrayArray9470.length) {
		    int[] is_453_ = anIntArrayArray9470[i_452_];
		    if ((i_436_ & 0x1) == 0) {
			for (int i_454_ = 0; i_454_ < is_453_.length;
			     i_454_++) {
			    int i_455_ = is_453_[i_454_];
			    anIntArray9494[i_455_] -= anInt9458;
			    anIntArray9447[i_455_] -= anInt9481;
			    anIntArray9448[i_455_] -= anInt9465;
			    if (i_435_ != 0) {
				int i_456_ = Class427.anIntArray4806[i_435_];
				int i_457_ = Class427.anIntArray4805[i_435_];
				int i_458_ = (anIntArray9447[i_455_] * i_456_
					      + anIntArray9494[i_455_] * i_457_
					      + 16383) >> 14;
				anIntArray9447[i_455_]
				    = (anIntArray9447[i_455_] * i_457_
				       - anIntArray9494[i_455_] * i_456_
				       + 16383) >> 14;
				anIntArray9494[i_455_] = i_458_;
			    }
			    if (i_433_ != 0) {
				int i_459_ = Class427.anIntArray4806[i_433_];
				int i_460_ = Class427.anIntArray4805[i_433_];
				int i_461_ = (anIntArray9447[i_455_] * i_460_
					      - anIntArray9448[i_455_] * i_459_
					      + 16383) >> 14;
				anIntArray9448[i_455_]
				    = (anIntArray9447[i_455_] * i_459_
				       + anIntArray9448[i_455_] * i_460_
				       + 16383) >> 14;
				anIntArray9447[i_455_] = i_461_;
			    }
			    if (i_434_ != 0) {
				int i_462_ = Class427.anIntArray4806[i_434_];
				int i_463_ = Class427.anIntArray4805[i_434_];
				int i_464_ = (anIntArray9448[i_455_] * i_462_
					      + anIntArray9494[i_455_] * i_463_
					      + 16383) >> 14;
				anIntArray9448[i_455_]
				    = (anIntArray9448[i_455_] * i_463_
				       - anIntArray9494[i_455_] * i_462_
				       + 16383) >> 14;
				anIntArray9494[i_455_] = i_464_;
			    }
			    anIntArray9494[i_455_] += anInt9458;
			    anIntArray9447[i_455_] += anInt9481;
			    anIntArray9448[i_455_] += anInt9465;
			}
		    } else {
			for (int i_465_ = 0; i_465_ < is_453_.length;
			     i_465_++) {
			    int i_466_ = is_453_[i_465_];
			    anIntArray9494[i_466_] -= anInt9458;
			    anIntArray9447[i_466_] -= anInt9481;
			    anIntArray9448[i_466_] -= anInt9465;
			    if (i_433_ != 0) {
				int i_467_ = Class427.anIntArray4806[i_433_];
				int i_468_ = Class427.anIntArray4805[i_433_];
				int i_469_ = (anIntArray9447[i_466_] * i_468_
					      - anIntArray9448[i_466_] * i_467_
					      + 16383) >> 14;
				anIntArray9448[i_466_]
				    = (anIntArray9447[i_466_] * i_467_
				       + anIntArray9448[i_466_] * i_468_
				       + 16383) >> 14;
				anIntArray9447[i_466_] = i_469_;
			    }
			    if (i_435_ != 0) {
				int i_470_ = Class427.anIntArray4806[i_435_];
				int i_471_ = Class427.anIntArray4805[i_435_];
				int i_472_ = (anIntArray9447[i_466_] * i_470_
					      + anIntArray9494[i_466_] * i_471_
					      + 16383) >> 14;
				anIntArray9447[i_466_]
				    = (anIntArray9447[i_466_] * i_471_
				       - anIntArray9494[i_466_] * i_470_
				       + 16383) >> 14;
				anIntArray9494[i_466_] = i_472_;
			    }
			    if (i_434_ != 0) {
				int i_473_ = Class427.anIntArray4806[i_434_];
				int i_474_ = Class427.anIntArray4805[i_434_];
				int i_475_ = (anIntArray9448[i_466_] * i_473_
					      + anIntArray9494[i_466_] * i_474_
					      + 16383) >> 14;
				anIntArray9448[i_466_]
				    = (anIntArray9448[i_466_] * i_474_
				       - anIntArray9494[i_466_] * i_473_
				       + 16383) >> 14;
				anIntArray9494[i_466_] = i_475_;
			    }
			    anIntArray9494[i_466_] += anInt9458;
			    anIntArray9447[i_466_] += anInt9481;
			    anIntArray9448[i_466_] += anInt9465;
			}
		    }
		}
	    }
	} else if (i == 3) {
	    for (int i_476_ = 0; i_476_ < i_437_; i_476_++) {
		int i_477_ = is[i_476_];
		if (i_477_ < anIntArrayArray9470.length) {
		    int[] is_478_ = anIntArrayArray9470[i_477_];
		    for (int i_479_ = 0; i_479_ < is_478_.length; i_479_++) {
			int i_480_ = is_478_[i_479_];
			anIntArray9494[i_480_] -= anInt9458;
			anIntArray9447[i_480_] -= anInt9481;
			anIntArray9448[i_480_] -= anInt9465;
			anIntArray9494[i_480_]
			    = anIntArray9494[i_480_] * i_433_ / 128;
			anIntArray9447[i_480_]
			    = anIntArray9447[i_480_] * i_434_ / 128;
			anIntArray9448[i_480_]
			    = anIntArray9448[i_480_] * i_435_ / 128;
			anIntArray9494[i_480_] += anInt9458;
			anIntArray9447[i_480_] += anInt9481;
			anIntArray9448[i_480_] += anInt9465;
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9457 != null && aByteArray9469 != null) {
		for (int i_481_ = 0; i_481_ < i_437_; i_481_++) {
		    int i_482_ = is[i_481_];
		    if (i_482_ < anIntArrayArray9457.length) {
			int[] is_483_ = anIntArrayArray9457[i_482_];
			for (int i_484_ = 0; i_484_ < is_483_.length;
			     i_484_++) {
			    int i_485_ = is_483_[i_484_];
			    int i_486_
				= (aByteArray9469[i_485_] & 0xff) + i_433_ * 8;
			    if (i_486_ < 0)
				i_486_ = 0;
			    else if (i_486_ > 255)
				i_486_ = 255;
			    aByteArray9469[i_485_] = (byte) i_486_;
			}
		    }
		}
		if (aClass118Array9485 != null) {
		    for (int i_487_ = 0; i_487_ < anInt9484; i_487_++) {
			Class118 class118 = aClass118Array9485[i_487_];
			Class117 class117 = aClass117Array9486[i_487_];
			class117.anInt1411
			    = (class117.anInt1411 * -150900843 & 0xffffff
			       | 255 - ((aByteArray9469
					 [class118.anInt1418 * 2118166057])
					& 0xff) << 24) * 874668989;
		    }
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9457 != null) {
		for (int i_488_ = 0; i_488_ < i_437_; i_488_++) {
		    int i_489_ = is[i_488_];
		    if (i_489_ < anIntArrayArray9457.length) {
			int[] is_490_ = anIntArrayArray9457[i_489_];
			for (int i_491_ = 0; i_491_ < is_490_.length;
			     i_491_++) {
			    int i_492_ = is_490_[i_491_];
			    int i_493_ = aShortArray9471[i_492_] & 0xffff;
			    int i_494_ = i_493_ >> 10 & 0x3f;
			    int i_495_ = i_493_ >> 7 & 0x7;
			    int i_496_ = i_493_ & 0x7f;
			    i_494_ = i_494_ + i_433_ & 0x3f;
			    i_495_ += i_434_;
			    if (i_495_ < 0)
				i_495_ = 0;
			    else if (i_495_ > 7)
				i_495_ = 7;
			    i_496_ += i_435_;
			    if (i_496_ < 0)
				i_496_ = 0;
			    else if (i_496_ > 127)
				i_496_ = 127;
			    aShortArray9471[i_492_]
				= (short) (i_494_ << 10 | i_495_ << 7
					   | i_496_);
			}
			aBool9476 = true;
		    }
		}
		if (aClass118Array9485 != null) {
		    for (int i_497_ = 0; i_497_ < anInt9484; i_497_++) {
			Class118 class118 = aClass118Array9485[i_497_];
			Class117 class117 = aClass117Array9486[i_497_];
			class117.anInt1411
			    = (class117.anInt1411 * -150900843 & ~0xffffff
			       | ((Class415.anIntArray4666
				   [Class315.method5705(((aShortArray9471
							  [(class118.anInt1418
							    * 2118166057)])
							 & 0xffff),
							165258283) & 0xffff])
				  & 0xffffff)) * 874668989;
		    }
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9487 != null) {
		for (int i_498_ = 0; i_498_ < i_437_; i_498_++) {
		    int i_499_ = is[i_498_];
		    if (i_499_ < anIntArrayArray9487.length) {
			int[] is_500_ = anIntArrayArray9487[i_499_];
			for (int i_501_ = 0; i_501_ < is_500_.length;
			     i_501_++) {
			    Class117 class117
				= aClass117Array9486[is_500_[i_501_]];
			    class117.anInt1405 += i_433_ * 1831486073;
			    class117.anInt1406 += i_434_ * -108929861;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9487 != null) {
		for (int i_502_ = 0; i_502_ < i_437_; i_502_++) {
		    int i_503_ = is[i_502_];
		    if (i_503_ < anIntArrayArray9487.length) {
			int[] is_504_ = anIntArrayArray9487[i_503_];
			for (int i_505_ = 0; i_505_ < is_504_.length;
			     i_505_++) {
			    Class117 class117
				= aClass117Array9486[is_504_[i_505_]];
			    class117.aFloat1403 = (class117.aFloat1403
						   * (float) i_433_ / 128.0F);
			    class117.aFloat1404 = (class117.aFloat1404
						   * (float) i_434_ / 128.0F);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9487 != null) {
		for (int i_506_ = 0; i_506_ < i_437_; i_506_++) {
		    int i_507_ = is[i_506_];
		    if (i_507_ < anIntArrayArray9487.length) {
			int[] is_508_ = anIntArrayArray9487[i_507_];
			for (int i_509_ = 0; i_509_ < is_508_.length;
			     i_509_++) {
			    Class117 class117
				= aClass117Array9486[is_508_[i_509_]];
			    class117.anInt1409
				= (class117.anInt1409 * -133325595 + i_433_
				   & 0x3fff) * 1832042733;
			}
		    }
		}
	    }
	}
    }
    
    void method3068(int i, int[] is, int i_510_, int i_511_, int i_512_,
		    boolean bool, int i_513_, int[] is_514_) {
	int i_515_ = is.length;
	if (i == 0) {
	    i_510_ <<= 4;
	    i_511_ <<= 4;
	    i_512_ <<= 4;
	    if (!aBool9477) {
		for (int i_516_ = 0; i_516_ < anInt9444; i_516_++) {
		    anIntArray9494[i_516_] <<= 4;
		    anIntArray9447[i_516_] <<= 4;
		    anIntArray9448[i_516_] <<= 4;
		}
		aBool9477 = true;
	    }
	    int i_517_ = 0;
	    anInt9458 = 0;
	    anInt9481 = 0;
	    anInt9465 = 0;
	    for (int i_518_ = 0; i_518_ < i_515_; i_518_++) {
		int i_519_ = is[i_518_];
		if (i_519_ < anIntArrayArray9470.length) {
		    int[] is_520_ = anIntArrayArray9470[i_519_];
		    for (int i_521_ = 0; i_521_ < is_520_.length; i_521_++) {
			int i_522_ = is_520_[i_521_];
			if (aShortArray9445 == null
			    || (i_513_ & aShortArray9445[i_522_]) != 0) {
			    anInt9458 += anIntArray9494[i_522_];
			    anInt9481 += anIntArray9447[i_522_];
			    anInt9465 += anIntArray9448[i_522_];
			    i_517_++;
			}
		    }
		}
	    }
	    if (i_517_ > 0) {
		anInt9458 = anInt9458 / i_517_ + i_510_;
		anInt9481 = anInt9481 / i_517_ + i_511_;
		anInt9465 = anInt9465 / i_517_ + i_512_;
		aBool9504 = true;
	    } else {
		anInt9458 = i_510_;
		anInt9481 = i_511_;
		anInt9465 = i_512_;
	    }
	} else if (i == 1) {
	    if (is_514_ != null) {
		int i_523_ = ((is_514_[0] * i_510_ + is_514_[1] * i_511_
			       + is_514_[2] * i_512_ + 8192)
			      >> 14);
		int i_524_ = ((is_514_[3] * i_510_ + is_514_[4] * i_511_
			       + is_514_[5] * i_512_ + 8192)
			      >> 14);
		int i_525_ = ((is_514_[6] * i_510_ + is_514_[7] * i_511_
			       + is_514_[8] * i_512_ + 8192)
			      >> 14);
		i_510_ = i_523_;
		i_511_ = i_524_;
		i_512_ = i_525_;
	    }
	    i_510_ <<= 4;
	    i_511_ <<= 4;
	    i_512_ <<= 4;
	    if (!aBool9477) {
		for (int i_526_ = 0; i_526_ < anInt9444; i_526_++) {
		    anIntArray9494[i_526_] <<= 4;
		    anIntArray9447[i_526_] <<= 4;
		    anIntArray9448[i_526_] <<= 4;
		}
		aBool9477 = true;
	    }
	    for (int i_527_ = 0; i_527_ < i_515_; i_527_++) {
		int i_528_ = is[i_527_];
		if (i_528_ < anIntArrayArray9470.length) {
		    int[] is_529_ = anIntArrayArray9470[i_528_];
		    for (int i_530_ = 0; i_530_ < is_529_.length; i_530_++) {
			int i_531_ = is_529_[i_530_];
			if (aShortArray9445 == null
			    || (i_513_ & aShortArray9445[i_531_]) != 0) {
			    anIntArray9494[i_531_] += i_510_;
			    anIntArray9447[i_531_] += i_511_;
			    anIntArray9448[i_531_] += i_512_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_514_ != null) {
		if (!aBool9477) {
		    for (int i_532_ = 0; i_532_ < anInt9444; i_532_++) {
			anIntArray9494[i_532_] <<= 4;
			anIntArray9447[i_532_] <<= 4;
			anIntArray9448[i_532_] <<= 4;
		    }
		    aBool9477 = true;
		}
		int i_533_ = is_514_[9] << 4;
		int i_534_ = is_514_[10] << 4;
		int i_535_ = is_514_[11] << 4;
		int i_536_ = is_514_[12] << 4;
		int i_537_ = is_514_[13] << 4;
		int i_538_ = is_514_[14] << 4;
		if (aBool9504) {
		    int i_539_
			= ((is_514_[0] * anInt9458 + is_514_[3] * anInt9481
			    + is_514_[6] * anInt9465 + 8192)
			   >> 14);
		    int i_540_
			= ((is_514_[1] * anInt9458 + is_514_[4] * anInt9481
			    + is_514_[7] * anInt9465 + 8192)
			   >> 14);
		    int i_541_
			= ((is_514_[2] * anInt9458 + is_514_[5] * anInt9481
			    + is_514_[8] * anInt9465 + 8192)
			   >> 14);
		    i_539_ += i_536_;
		    i_540_ += i_537_;
		    i_541_ += i_538_;
		    anInt9458 = i_539_;
		    anInt9481 = i_540_;
		    anInt9465 = i_541_;
		    aBool9504 = false;
		}
		int[] is_542_ = new int[9];
		int i_543_ = Class427.anIntArray4805[i_510_];
		int i_544_ = Class427.anIntArray4806[i_510_];
		int i_545_ = Class427.anIntArray4805[i_511_];
		int i_546_ = Class427.anIntArray4806[i_511_];
		int i_547_ = Class427.anIntArray4805[i_512_];
		int i_548_ = Class427.anIntArray4806[i_512_];
		int i_549_ = i_544_ * i_547_ + 8192 >> 14;
		int i_550_ = i_544_ * i_548_ + 8192 >> 14;
		is_542_[0] = i_545_ * i_547_ + i_546_ * i_550_ + 8192 >> 14;
		is_542_[1] = -i_545_ * i_548_ + i_546_ * i_549_ + 8192 >> 14;
		is_542_[2] = i_546_ * i_543_ + 8192 >> 14;
		is_542_[3] = i_543_ * i_548_ + 8192 >> 14;
		is_542_[4] = i_543_ * i_547_ + 8192 >> 14;
		is_542_[5] = -i_544_;
		is_542_[6] = -i_546_ * i_547_ + i_545_ * i_550_ + 8192 >> 14;
		is_542_[7] = i_546_ * i_548_ + i_545_ * i_549_ + 8192 >> 14;
		is_542_[8] = i_545_ * i_543_ + 8192 >> 14;
		int i_551_ = (is_542_[0] * -anInt9458 + is_542_[1] * -anInt9481
			      + is_542_[2] * -anInt9465 + 8192) >> 14;
		int i_552_ = (is_542_[3] * -anInt9458 + is_542_[4] * -anInt9481
			      + is_542_[5] * -anInt9465 + 8192) >> 14;
		int i_553_ = (is_542_[6] * -anInt9458 + is_542_[7] * -anInt9481
			      + is_542_[8] * -anInt9465 + 8192) >> 14;
		int i_554_ = i_551_ + anInt9458;
		int i_555_ = i_552_ + anInt9481;
		int i_556_ = i_553_ + anInt9465;
		int[] is_557_ = new int[9];
		for (int i_558_ = 0; i_558_ < 3; i_558_++) {
		    for (int i_559_ = 0; i_559_ < 3; i_559_++) {
			int i_560_ = 0;
			for (int i_561_ = 0; i_561_ < 3; i_561_++)
			    i_560_ += (is_542_[i_558_ * 3 + i_561_]
				       * is_514_[i_559_ * 3 + i_561_]);
			is_557_[i_558_ * 3 + i_559_] = i_560_ + 8192 >> 14;
		    }
		}
		int i_562_ = ((is_542_[0] * i_536_ + is_542_[1] * i_537_
			       + is_542_[2] * i_538_ + 8192)
			      >> 14);
		int i_563_ = ((is_542_[3] * i_536_ + is_542_[4] * i_537_
			       + is_542_[5] * i_538_ + 8192)
			      >> 14);
		int i_564_ = ((is_542_[6] * i_536_ + is_542_[7] * i_537_
			       + is_542_[8] * i_538_ + 8192)
			      >> 14);
		i_562_ += i_554_;
		i_563_ += i_555_;
		i_564_ += i_556_;
		int[] is_565_ = new int[9];
		for (int i_566_ = 0; i_566_ < 3; i_566_++) {
		    for (int i_567_ = 0; i_567_ < 3; i_567_++) {
			int i_568_ = 0;
			for (int i_569_ = 0; i_569_ < 3; i_569_++)
			    i_568_ += (is_514_[i_566_ * 3 + i_569_]
				       * is_557_[i_567_ + i_569_ * 3]);
			is_565_[i_566_ * 3 + i_567_] = i_568_ + 8192 >> 14;
		    }
		}
		int i_570_ = ((is_514_[0] * i_562_ + is_514_[1] * i_563_
			       + is_514_[2] * i_564_ + 8192)
			      >> 14);
		int i_571_ = ((is_514_[3] * i_562_ + is_514_[4] * i_563_
			       + is_514_[5] * i_564_ + 8192)
			      >> 14);
		int i_572_ = ((is_514_[6] * i_562_ + is_514_[7] * i_563_
			       + is_514_[8] * i_564_ + 8192)
			      >> 14);
		i_570_ += i_533_;
		i_571_ += i_534_;
		i_572_ += i_535_;
		for (int i_573_ = 0; i_573_ < i_515_; i_573_++) {
		    int i_574_ = is[i_573_];
		    if (i_574_ < anIntArrayArray9470.length) {
			int[] is_575_ = anIntArrayArray9470[i_574_];
			for (int i_576_ = 0; i_576_ < is_575_.length;
			     i_576_++) {
			    int i_577_ = is_575_[i_576_];
			    if (aShortArray9445 == null
				|| (i_513_ & aShortArray9445[i_577_]) != 0) {
				int i_578_
				    = ((is_565_[0] * anIntArray9494[i_577_]
					+ is_565_[1] * anIntArray9447[i_577_]
					+ is_565_[2] * anIntArray9448[i_577_]
					+ 8192)
				       >> 14);
				int i_579_
				    = ((is_565_[3] * anIntArray9494[i_577_]
					+ is_565_[4] * anIntArray9447[i_577_]
					+ is_565_[5] * anIntArray9448[i_577_]
					+ 8192)
				       >> 14);
				int i_580_
				    = ((is_565_[6] * anIntArray9494[i_577_]
					+ is_565_[7] * anIntArray9447[i_577_]
					+ is_565_[8] * anIntArray9448[i_577_]
					+ 8192)
				       >> 14);
				i_578_ += i_570_;
				i_579_ += i_571_;
				i_580_ += i_572_;
				anIntArray9494[i_577_] = i_578_;
				anIntArray9447[i_577_] = i_579_;
				anIntArray9448[i_577_] = i_580_;
			    }
			}
		    }
		}
	    } else {
		for (int i_581_ = 0; i_581_ < i_515_; i_581_++) {
		    int i_582_ = is[i_581_];
		    if (i_582_ < anIntArrayArray9470.length) {
			int[] is_583_ = anIntArrayArray9470[i_582_];
			for (int i_584_ = 0; i_584_ < is_583_.length;
			     i_584_++) {
			    int i_585_ = is_583_[i_584_];
			    if (aShortArray9445 == null
				|| (i_513_ & aShortArray9445[i_585_]) != 0) {
				anIntArray9494[i_585_] -= anInt9458;
				anIntArray9447[i_585_] -= anInt9481;
				anIntArray9448[i_585_] -= anInt9465;
				if (i_512_ != 0) {
				    int i_586_
					= Class427.anIntArray4806[i_512_];
				    int i_587_
					= Class427.anIntArray4805[i_512_];
				    int i_588_
					= ((anIntArray9447[i_585_] * i_586_
					    + anIntArray9494[i_585_] * i_587_
					    + 16383)
					   >> 14);
				    anIntArray9447[i_585_]
					= (anIntArray9447[i_585_] * i_587_
					   - anIntArray9494[i_585_] * i_586_
					   + 16383) >> 14;
				    anIntArray9494[i_585_] = i_588_;
				}
				if (i_510_ != 0) {
				    int i_589_
					= Class427.anIntArray4806[i_510_];
				    int i_590_
					= Class427.anIntArray4805[i_510_];
				    int i_591_
					= ((anIntArray9447[i_585_] * i_590_
					    - anIntArray9448[i_585_] * i_589_
					    + 16383)
					   >> 14);
				    anIntArray9448[i_585_]
					= (anIntArray9447[i_585_] * i_589_
					   + anIntArray9448[i_585_] * i_590_
					   + 16383) >> 14;
				    anIntArray9447[i_585_] = i_591_;
				}
				if (i_511_ != 0) {
				    int i_592_
					= Class427.anIntArray4806[i_511_];
				    int i_593_
					= Class427.anIntArray4805[i_511_];
				    int i_594_
					= ((anIntArray9448[i_585_] * i_592_
					    + anIntArray9494[i_585_] * i_593_
					    + 16383)
					   >> 14);
				    anIntArray9448[i_585_]
					= (anIntArray9448[i_585_] * i_593_
					   - anIntArray9494[i_585_] * i_592_
					   + 16383) >> 14;
				    anIntArray9494[i_585_] = i_594_;
				}
				anIntArray9494[i_585_] += anInt9458;
				anIntArray9447[i_585_] += anInt9481;
				anIntArray9448[i_585_] += anInt9465;
			    }
			}
		    }
		}
	    }
	} else if (i == 3) {
	    if (is_514_ != null) {
		if (!aBool9477) {
		    for (int i_595_ = 0; i_595_ < anInt9444; i_595_++) {
			anIntArray9494[i_595_] <<= 4;
			anIntArray9447[i_595_] <<= 4;
			anIntArray9448[i_595_] <<= 4;
		    }
		    aBool9477 = true;
		}
		int i_596_ = is_514_[9] << 4;
		int i_597_ = is_514_[10] << 4;
		int i_598_ = is_514_[11] << 4;
		int i_599_ = is_514_[12] << 4;
		int i_600_ = is_514_[13] << 4;
		int i_601_ = is_514_[14] << 4;
		if (aBool9504) {
		    int i_602_
			= ((is_514_[0] * anInt9458 + is_514_[3] * anInt9481
			    + is_514_[6] * anInt9465 + 8192)
			   >> 14);
		    int i_603_
			= ((is_514_[1] * anInt9458 + is_514_[4] * anInt9481
			    + is_514_[7] * anInt9465 + 8192)
			   >> 14);
		    int i_604_
			= ((is_514_[2] * anInt9458 + is_514_[5] * anInt9481
			    + is_514_[8] * anInt9465 + 8192)
			   >> 14);
		    i_602_ += i_599_;
		    i_603_ += i_600_;
		    i_604_ += i_601_;
		    anInt9458 = i_602_;
		    anInt9481 = i_603_;
		    anInt9465 = i_604_;
		    aBool9504 = false;
		}
		int i_605_ = i_510_ << 15 >> 7;
		int i_606_ = i_511_ << 15 >> 7;
		int i_607_ = i_512_ << 15 >> 7;
		int i_608_ = i_605_ * -anInt9458 + 8192 >> 14;
		int i_609_ = i_606_ * -anInt9481 + 8192 >> 14;
		int i_610_ = i_607_ * -anInt9465 + 8192 >> 14;
		int i_611_ = i_608_ + anInt9458;
		int i_612_ = i_609_ + anInt9481;
		int i_613_ = i_610_ + anInt9465;
		int[] is_614_ = new int[9];
		is_614_[0] = i_605_ * is_514_[0] + 8192 >> 14;
		is_614_[1] = i_605_ * is_514_[3] + 8192 >> 14;
		is_614_[2] = i_605_ * is_514_[6] + 8192 >> 14;
		is_614_[3] = i_606_ * is_514_[1] + 8192 >> 14;
		is_614_[4] = i_606_ * is_514_[4] + 8192 >> 14;
		is_614_[5] = i_606_ * is_514_[7] + 8192 >> 14;
		is_614_[6] = i_607_ * is_514_[2] + 8192 >> 14;
		is_614_[7] = i_607_ * is_514_[5] + 8192 >> 14;
		is_614_[8] = i_607_ * is_514_[8] + 8192 >> 14;
		int i_615_ = i_605_ * i_599_ + 8192 >> 14;
		int i_616_ = i_606_ * i_600_ + 8192 >> 14;
		int i_617_ = i_607_ * i_601_ + 8192 >> 14;
		i_615_ += i_611_;
		i_616_ += i_612_;
		i_617_ += i_613_;
		int[] is_618_ = new int[9];
		for (int i_619_ = 0; i_619_ < 3; i_619_++) {
		    for (int i_620_ = 0; i_620_ < 3; i_620_++) {
			int i_621_ = 0;
			for (int i_622_ = 0; i_622_ < 3; i_622_++)
			    i_621_ += (is_514_[i_619_ * 3 + i_622_]
				       * is_614_[i_620_ + i_622_ * 3]);
			is_618_[i_619_ * 3 + i_620_] = i_621_ + 8192 >> 14;
		    }
		}
		int i_623_ = ((is_514_[0] * i_615_ + is_514_[1] * i_616_
			       + is_514_[2] * i_617_ + 8192)
			      >> 14);
		int i_624_ = ((is_514_[3] * i_615_ + is_514_[4] * i_616_
			       + is_514_[5] * i_617_ + 8192)
			      >> 14);
		int i_625_ = ((is_514_[6] * i_615_ + is_514_[7] * i_616_
			       + is_514_[8] * i_617_ + 8192)
			      >> 14);
		i_623_ += i_596_;
		i_624_ += i_597_;
		i_625_ += i_598_;
		for (int i_626_ = 0; i_626_ < i_515_; i_626_++) {
		    int i_627_ = is[i_626_];
		    if (i_627_ < anIntArrayArray9470.length) {
			int[] is_628_ = anIntArrayArray9470[i_627_];
			for (int i_629_ = 0; i_629_ < is_628_.length;
			     i_629_++) {
			    int i_630_ = is_628_[i_629_];
			    if (aShortArray9445 == null
				|| (i_513_ & aShortArray9445[i_630_]) != 0) {
				int i_631_
				    = ((is_618_[0] * anIntArray9494[i_630_]
					+ is_618_[1] * anIntArray9447[i_630_]
					+ is_618_[2] * anIntArray9448[i_630_]
					+ 8192)
				       >> 14);
				int i_632_
				    = ((is_618_[3] * anIntArray9494[i_630_]
					+ is_618_[4] * anIntArray9447[i_630_]
					+ is_618_[5] * anIntArray9448[i_630_]
					+ 8192)
				       >> 14);
				int i_633_
				    = ((is_618_[6] * anIntArray9494[i_630_]
					+ is_618_[7] * anIntArray9447[i_630_]
					+ is_618_[8] * anIntArray9448[i_630_]
					+ 8192)
				       >> 14);
				i_631_ += i_623_;
				i_632_ += i_624_;
				i_633_ += i_625_;
				anIntArray9494[i_630_] = i_631_;
				anIntArray9447[i_630_] = i_632_;
				anIntArray9448[i_630_] = i_633_;
			    }
			}
		    }
		}
	    } else {
		for (int i_634_ = 0; i_634_ < i_515_; i_634_++) {
		    int i_635_ = is[i_634_];
		    if (i_635_ < anIntArrayArray9470.length) {
			int[] is_636_ = anIntArrayArray9470[i_635_];
			for (int i_637_ = 0; i_637_ < is_636_.length;
			     i_637_++) {
			    int i_638_ = is_636_[i_637_];
			    if (aShortArray9445 == null
				|| (i_513_ & aShortArray9445[i_638_]) != 0) {
				anIntArray9494[i_638_] -= anInt9458;
				anIntArray9447[i_638_] -= anInt9481;
				anIntArray9448[i_638_] -= anInt9465;
				anIntArray9494[i_638_]
				    = anIntArray9494[i_638_] * i_510_ / 128;
				anIntArray9447[i_638_]
				    = anIntArray9447[i_638_] * i_511_ / 128;
				anIntArray9448[i_638_]
				    = anIntArray9448[i_638_] * i_512_ / 128;
				anIntArray9494[i_638_] += anInt9458;
				anIntArray9447[i_638_] += anInt9481;
				anIntArray9448[i_638_] += anInt9465;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9457 != null && aByteArray9469 != null) {
		for (int i_639_ = 0; i_639_ < i_515_; i_639_++) {
		    int i_640_ = is[i_639_];
		    if (i_640_ < anIntArrayArray9457.length) {
			int[] is_641_ = anIntArrayArray9457[i_640_];
			for (int i_642_ = 0; i_642_ < is_641_.length;
			     i_642_++) {
			    int i_643_ = is_641_[i_642_];
			    if (aShortArray9472 == null
				|| (i_513_ & aShortArray9472[i_643_]) != 0) {
				int i_644_ = ((aByteArray9469[i_643_] & 0xff)
					      + i_510_ * 8);
				if (i_644_ < 0)
				    i_644_ = 0;
				else if (i_644_ > 255)
				    i_644_ = 255;
				aByteArray9469[i_643_] = (byte) i_644_;
			    }
			}
		    }
		}
		if (aClass118Array9485 != null) {
		    for (int i_645_ = 0; i_645_ < anInt9484; i_645_++) {
			Class118 class118 = aClass118Array9485[i_645_];
			Class117 class117 = aClass117Array9486[i_645_];
			class117.anInt1411
			    = (class117.anInt1411 * -150900843 & 0xffffff
			       | 255 - ((aByteArray9469
					 [class118.anInt1418 * 2118166057])
					& 0xff) << 24) * 874668989;
		    }
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9457 != null) {
		for (int i_646_ = 0; i_646_ < i_515_; i_646_++) {
		    int i_647_ = is[i_646_];
		    if (i_647_ < anIntArrayArray9457.length) {
			int[] is_648_ = anIntArrayArray9457[i_647_];
			for (int i_649_ = 0; i_649_ < is_648_.length;
			     i_649_++) {
			    int i_650_ = is_648_[i_649_];
			    if (aShortArray9472 == null
				|| (i_513_ & aShortArray9472[i_650_]) != 0) {
				int i_651_ = aShortArray9471[i_650_] & 0xffff;
				int i_652_ = i_651_ >> 10 & 0x3f;
				int i_653_ = i_651_ >> 7 & 0x7;
				int i_654_ = i_651_ & 0x7f;
				i_652_ = i_652_ + i_510_ & 0x3f;
				i_653_ += i_511_;
				if (i_653_ < 0)
				    i_653_ = 0;
				else if (i_653_ > 7)
				    i_653_ = 7;
				i_654_ += i_512_;
				if (i_654_ < 0)
				    i_654_ = 0;
				else if (i_654_ > 127)
				    i_654_ = 127;
				aShortArray9471[i_650_]
				    = (short) (i_652_ << 10 | i_653_ << 7
					       | i_654_);
			    }
			}
			aBool9476 = true;
		    }
		}
		if (aClass118Array9485 != null) {
		    for (int i_655_ = 0; i_655_ < anInt9484; i_655_++) {
			Class118 class118 = aClass118Array9485[i_655_];
			Class117 class117 = aClass117Array9486[i_655_];
			class117.anInt1411
			    = (class117.anInt1411 * -150900843 & ~0xffffff
			       | ((Class415.anIntArray4666
				   [Class315.method5705(((aShortArray9471
							  [(class118.anInt1418
							    * 2118166057)])
							 & 0xffff),
							2083037191) & 0xffff])
				  & 0xffffff)) * 874668989;
		    }
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9487 != null) {
		for (int i_656_ = 0; i_656_ < i_515_; i_656_++) {
		    int i_657_ = is[i_656_];
		    if (i_657_ < anIntArrayArray9487.length) {
			int[] is_658_ = anIntArrayArray9487[i_657_];
			for (int i_659_ = 0; i_659_ < is_658_.length;
			     i_659_++) {
			    Class117 class117
				= aClass117Array9486[is_658_[i_659_]];
			    class117.anInt1405 += i_510_ * 1831486073;
			    class117.anInt1406 += i_511_ * -108929861;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9487 != null) {
		for (int i_660_ = 0; i_660_ < i_515_; i_660_++) {
		    int i_661_ = is[i_660_];
		    if (i_661_ < anIntArrayArray9487.length) {
			int[] is_662_ = anIntArrayArray9487[i_661_];
			for (int i_663_ = 0; i_663_ < is_662_.length;
			     i_663_++) {
			    Class117 class117
				= aClass117Array9486[is_662_[i_663_]];
			    class117.aFloat1403 = (class117.aFloat1403
						   * (float) i_510_ / 128.0F);
			    class117.aFloat1404 = (class117.aFloat1404
						   * (float) i_511_ / 128.0F);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9487 != null) {
		for (int i_664_ = 0; i_664_ < i_515_; i_664_++) {
		    int i_665_ = is[i_664_];
		    if (i_665_ < anIntArrayArray9487.length) {
			int[] is_666_ = anIntArrayArray9487[i_665_];
			for (int i_667_ = 0; i_667_ < is_666_.length;
			     i_667_++) {
			    Class117 class117
				= aClass117Array9486[is_666_[i_667_]];
			    class117.anInt1409
				= (class117.anInt1409 * -133325595 + i_510_
				   & 0x3fff) * 1832042733;
			}
		    }
		}
	    }
	}
    }
    
    public int method3046() {
	if (!aBool9488)
	    method15173();
	return aShort9492;
    }
    
    void method15108() {
	synchronized (this) {
	    for (int i = 0; i < anInt9474; i++) {
		int i_668_ = anIntArray9494[i];
		anIntArray9494[i] = anIntArray9448[i];
		anIntArray9448[i] = -i_668_;
		if (aClass96Array9450[i] != null) {
		    i_668_ = aClass96Array9450[i].anInt1159;
		    aClass96Array9450[i].anInt1159
			= aClass96Array9450[i].anInt1156;
		    aClass96Array9450[i].anInt1156 = -i_668_;
		}
	    }
	    if (aClass107Array9466 != null) {
		for (int i = 0; i < anInt9440; i++) {
		    if (aClass107Array9466[i] != null) {
			int i_669_ = aClass107Array9466[i].anInt1315;
			aClass107Array9466[i].anInt1315
			    = aClass107Array9466[i].anInt1313;
			aClass107Array9466[i].anInt1313 = -i_669_;
		    }
		}
	    }
	    for (int i = anInt9474; i < anInt9444; i++) {
		int i_670_ = anIntArray9494[i];
		anIntArray9494[i] = anIntArray9448[i];
		anIntArray9448[i] = -i_670_;
	    }
	    anInt9432 = 0;
	    aBool9488 = false;
	}
    }
    
    void method15109(boolean bool) {
	if (anInt9432 == 1)
	    method15135();
	else if (anInt9432 == 2) {
	    if ((anInt9441 & 0x97098) == 0 && aFloatArrayArray9452 == null)
		aShortArray9471 = null;
	    if (bool)
		aByteArray9467 = null;
	} else {
	    method15092();
	    int i = aClass185_Sub2_9475.anInt9352 * 845036313;
	    int i_671_ = aClass185_Sub2_9475.anInt9347 * 1141856477;
	    int i_672_ = aClass185_Sub2_9475.anInt9348 * 568046319;
	    int i_673_ = aClass185_Sub2_9475.anInt9351 * -1021814047 >> 8;
	    int i_674_ = 0;
	    int i_675_ = 0;
	    if (anInt9443 != 0) {
		i_674_
		    = aClass185_Sub2_9475.anInt9370 * -664856320 / anInt9443;
		i_675_
		    = aClass185_Sub2_9475.anInt9358 * 1073854208 / anInt9443;
	    }
	    if (anIntArray9459 == null) {
		anIntArray9459 = new int[anInt9440];
		anIntArray9460 = new int[anInt9440];
		anIntArray9461 = new int[anInt9440];
	    }
	    for (int i_676_ = 0; i_676_ < anInt9440; i_676_++) {
		byte i_677_;
		if (aByteArray9467 == null)
		    i_677_ = (byte) 0;
		else
		    i_677_ = aByteArray9467[i_676_];
		byte i_678_;
		if (aByteArray9469 == null)
		    i_678_ = (byte) 0;
		else
		    i_678_ = aByteArray9469[i_676_];
		short i_679_;
		if (aShortArray9428 == null)
		    i_679_ = (short) -1;
		else
		    i_679_ = aShortArray9428[i_676_];
		if (i_678_ == -2)
		    i_677_ = (byte) 3;
		if (i_678_ == -1)
		    i_677_ = (byte) 2;
		if (i_679_ == -1) {
		    if (i_677_ == 0) {
			int i_680_ = aShortArray9471[i_676_] & 0xffff;
			int i_681_ = (i_680_ & 0x7f) * anInt9454 >> 7;
			short i_682_
			    = Class315.method5705(i_680_ & ~0x7f | i_681_,
						  899903377);
			Class96 class96;
			if (aClass96Array9451 != null
			    && (aClass96Array9451[aShortArray9479[i_676_]]
				!= null))
			    class96
				= aClass96Array9451[aShortArray9479[i_676_]];
			else
			    class96
				= aClass96Array9450[aShortArray9479[i_676_]];
			int i_683_ = (((i * class96.anInt1159
					+ i_671_ * class96.anInt1158
					+ i_672_ * class96.anInt1156)
				       / class96.anInt1157)
				      >> 16);
			int i_684_ = i_683_ > 256 ? i_674_ : i_675_;
			int i_685_ = (i_673_ >> 1) + (i_684_ * i_683_ >> 17);
			anIntArray9459[i_676_]
			    = i_685_ << 17 | Class146.method2452(i_682_,
								 i_685_,
								 -90856946);
			if (aClass96Array9451 != null
			    && (aClass96Array9451[aShortArray9455[i_676_]]
				!= null))
			    class96
				= aClass96Array9451[aShortArray9455[i_676_]];
			else
			    class96
				= aClass96Array9450[aShortArray9455[i_676_]];
			i_683_ = ((i * class96.anInt1159
				   + i_671_ * class96.anInt1158
				   + i_672_ * class96.anInt1156)
				  / class96.anInt1157) >> 16;
			i_684_ = i_683_ > 256 ? i_674_ : i_675_;
			i_685_ = (i_673_ >> 1) + (i_684_ * i_683_ >> 17);
			anIntArray9460[i_676_]
			    = i_685_ << 17 | Class146.method2452(i_682_,
								 i_685_,
								 -838097904);
			if (aClass96Array9451 != null
			    && (aClass96Array9451[aShortArray9456[i_676_]]
				!= null))
			    class96
				= aClass96Array9451[aShortArray9456[i_676_]];
			else
			    class96
				= aClass96Array9450[aShortArray9456[i_676_]];
			i_683_ = ((i * class96.anInt1159
				   + i_671_ * class96.anInt1158
				   + i_672_ * class96.anInt1156)
				  / class96.anInt1157) >> 16;
			i_684_ = i_683_ > 256 ? i_674_ : i_675_;
			i_685_ = (i_673_ >> 1) + (i_684_ * i_683_ >> 17);
			anIntArray9461[i_676_]
			    = i_685_ << 17 | Class146.method2452(i_682_,
								 i_685_,
								 -732027806);
		    } else if (i_677_ == 1) {
			int i_686_ = aShortArray9471[i_676_] & 0xffff;
			int i_687_ = (i_686_ & 0x7f) * anInt9454 >> 7;
			short i_688_
			    = Class315.method5705(i_686_ & ~0x7f | i_687_,
						  1638855936);
			Class107 class107 = aClass107Array9466[i_676_];
			int i_689_ = ((i * class107.anInt1315
				       + i_671_ * class107.anInt1314
				       + i_672_ * class107.anInt1313)
				      >> 16);
			int i_690_ = i_689_ > 256 ? i_674_ : i_675_;
			int i_691_ = (i_673_ >> 1) + (i_690_ * i_689_ >> 17);
			anIntArray9459[i_676_]
			    = i_691_ << 17 | Class146.method2452(i_688_,
								 i_691_,
								 -995045751);
			anIntArray9461[i_676_] = -1;
		    } else if (i_677_ == 3) {
			anIntArray9459[i_676_] = 128;
			anIntArray9461[i_676_] = -1;
		    } else
			anIntArray9461[i_676_] = -2;
		} else {
		    int i_692_ = aShortArray9471[i_676_] & 0xffff;
		    if (i_677_ == 0) {
			Class96 class96;
			if (aClass96Array9451 != null
			    && (aClass96Array9451[aShortArray9479[i_676_]]
				!= null))
			    class96
				= aClass96Array9451[aShortArray9479[i_676_]];
			else
			    class96
				= aClass96Array9450[aShortArray9479[i_676_]];
			int i_693_ = (((i * class96.anInt1159
					+ i_671_ * class96.anInt1158
					+ i_672_ * class96.anInt1156)
				       / class96.anInt1157)
				      >> 16);
			int i_694_ = i_693_ > 256 ? i_674_ : i_675_;
			int i_695_
			    = method15097((i_673_ >> 2) + (i_694_ * i_693_
							   >> 18));
			anIntArray9459[i_676_]
			    = i_695_ << 24 | method15095(i_692_, i_679_,
							 i_695_);
			if (aClass96Array9451 != null
			    && (aClass96Array9451[aShortArray9455[i_676_]]
				!= null))
			    class96
				= aClass96Array9451[aShortArray9455[i_676_]];
			else
			    class96
				= aClass96Array9450[aShortArray9455[i_676_]];
			i_693_ = ((i * class96.anInt1159
				   + i_671_ * class96.anInt1158
				   + i_672_ * class96.anInt1156)
				  / class96.anInt1157) >> 16;
			i_694_ = i_693_ > 256 ? i_674_ : i_675_;
			i_695_ = method15097((i_673_ >> 2) + (i_694_ * i_693_
							      >> 18));
			anIntArray9460[i_676_]
			    = i_695_ << 24 | method15095(i_692_, i_679_,
							 i_695_);
			if (aClass96Array9451 != null
			    && (aClass96Array9451[aShortArray9456[i_676_]]
				!= null))
			    class96
				= aClass96Array9451[aShortArray9456[i_676_]];
			else
			    class96
				= aClass96Array9450[aShortArray9456[i_676_]];
			i_693_ = ((i * class96.anInt1159
				   + i_671_ * class96.anInt1158
				   + i_672_ * class96.anInt1156)
				  / class96.anInt1157) >> 16;
			i_694_ = i_693_ > 256 ? i_674_ : i_675_;
			i_695_ = method15097((i_673_ >> 2) + (i_694_ * i_693_
							      >> 18));
			anIntArray9461[i_676_]
			    = i_695_ << 24 | method15095(i_692_, i_679_,
							 i_695_);
		    } else if (i_677_ == 1) {
			Class107 class107 = aClass107Array9466[i_676_];
			int i_696_ = ((i * class107.anInt1315
				       + i_671_ * class107.anInt1314
				       + i_672_ * class107.anInt1313)
				      >> 16);
			int i_697_ = i_696_ > 256 ? i_674_ : i_675_;
			int i_698_
			    = method15097((i_673_ >> 2) + (i_697_ * i_696_
							   >> 18));
			anIntArray9459[i_676_]
			    = i_698_ << 24 | method15095(i_692_, i_679_,
							 i_698_);
			anIntArray9461[i_676_] = -1;
		    } else
			anIntArray9461[i_676_] = -2;
		}
	    }
	    aClass96Array9450 = null;
	    aClass96Array9451 = null;
	    aClass107Array9466 = null;
	    if ((anInt9441 & 0x97098) == 0 && aFloatArrayArray9452 == null)
		aShortArray9471 = null;
	    if (bool)
		aByteArray9467 = null;
	    anInt9432 = 2;
	}
    }
    
    void method15110(Class446 class446, Class194 class194, int i) {
	if (anInt9474 >= 1) {
	    Class101 class101
		= aClass185_Sub2_9475.method15011(Thread.currentThread());
	    Class433 class433 = class101.aClass433_1224;
	    class433.method6916(class446);
	    Class433 class433_699_ = aClass185_Sub2_9475.aClass433_9353;
	    Class433 class433_700_ = aClass185_Sub2_9475.aClass433_9362;
	    if (!aBool9488)
		method15173();
	    boolean bool = class433.method6927();
	    float[] fs = class101.aFloatArray1225;
	    class433.method6850(0.0F, (float) aShort9491, 0.0F, fs);
	    float f = fs[0];
	    float f_701_ = fs[1];
	    float f_702_ = fs[2];
	    class433.method6850(0.0F, (float) aShort9492, 0.0F, fs);
	    float f_703_ = fs[0];
	    float f_704_ = fs[1];
	    float f_705_ = fs[2];
	    for (int i_706_ = 0; i_706_ < 6; i_706_++) {
		float[] fs_707_
		    = aClass185_Sub2_9475.aFloatArrayArray9355[i_706_];
		float f_708_ = (fs_707_[0] * f + fs_707_[1] * f_701_
				+ fs_707_[2] * f_702_ + fs_707_[3]
				+ (float) aShort9473);
		float f_709_ = (fs_707_[0] * f_703_ + fs_707_[1] * f_704_
				+ fs_707_[2] * f_705_ + fs_707_[3]
				+ (float) aShort9473);
		if (f_708_ < 0.0F && f_709_ < 0.0F)
		    return;
	    }
	    float f_710_;
	    float f_711_;
	    if (bool) {
		f_710_ = class433_699_.aFloatArray4853[14];
		f_711_ = class433_699_.aFloatArray4853[6];
	    } else {
		f_710_ = ((class433.aFloatArray4853[12]
			   * class433_699_.aFloatArray4853[2])
			  + (class433.aFloatArray4853[13]
			     * class433_699_.aFloatArray4853[6])
			  + (class433.aFloatArray4853[14]
			     * class433_699_.aFloatArray4853[10])
			  + class433_699_.aFloatArray4853[14]);
		f_711_ = ((class433.aFloatArray4853[4]
			   * class433_699_.aFloatArray4853[2])
			  + (class433.aFloatArray4853[5]
			     * class433_699_.aFloatArray4853[6])
			  + (class433.aFloatArray4853[6]
			     * class433_699_.aFloatArray4853[10]));
	    }
	    float f_712_ = f_710_ + (float) aShort9491 * f_711_;
	    float f_713_ = f_710_ + (float) aShort9492 * f_711_;
	    float f_714_ = (f_712_ > f_713_ ? f_712_ + (float) aShort9473
			    : f_713_ + (float) aShort9473);
	    float f_715_ = (class433_700_.aFloatArray4853[10] * f_714_
			    + class433_700_.aFloatArray4853[14]);
	    if (aClass185_Sub2_9475.anInt9367 * 442227785 > 1) {
		synchronized (this) {
		    while (aBool9497) {
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
		    }
		    aBool9497 = true;
		}
	    }
	    method15091(class101);
	    Class433 class433_716_ = aClass101_9437.aClass433_1217;
	    class433_716_.method6842(class433);
	    class433_716_.method6839(aClass185_Sub2_9475.aClass433_9346);
	    if ((i & 0x2) != 0)
		aClass119_9489.method2138(true);
	    else
		aClass119_9489.method2138(false);
	    boolean bool_717_ = false;
	    aClass101_9437.aFloat1232 = aClass119_9489.aFloat1430;
	    aClass101_9437.aFloat1231 = aClass119_9489.aFloat1432;
	    aClass101_9437.aFloat1223 = aClass119_9489.aFloat1434;
	    aClass101_9437.aFloat1219 = 1.0F / aClass119_9489.aFloat1434;
	    aClass101_9437.aFloat1200 = aClass119_9489.aFloat1429;
	    aClass101_9437.aFloat1230 = aClass119_9489.aFloat1431;
	    aClass101_9437.aFloat1234 = aClass119_9489.aFloat1433;
	    aClass101_9437.anInt1236 = aClass119_9489.anInt1448 * -1381436949;
	    for (int i_718_ = 0; i_718_ < anInt9444; i_718_++) {
		int i_719_ = anIntArray9494[i_718_];
		int i_720_ = anIntArray9447[i_718_];
		int i_721_ = anIntArray9448[i_718_];
		float f_722_
		    = (class433_716_.aFloatArray4853[0] * (float) i_719_
		       + class433_716_.aFloatArray4853[4] * (float) i_720_
		       + class433_716_.aFloatArray4853[8] * (float) i_721_
		       + class433_716_.aFloatArray4853[12]);
		float f_723_
		    = (class433_716_.aFloatArray4853[1] * (float) i_719_
		       + class433_716_.aFloatArray4853[5] * (float) i_720_
		       + class433_716_.aFloatArray4853[9] * (float) i_721_
		       + class433_716_.aFloatArray4853[13]);
		float f_724_
		    = (class433_716_.aFloatArray4853[2] * (float) i_719_
		       + class433_716_.aFloatArray4853[6] * (float) i_720_
		       + class433_716_.aFloatArray4853[10] * (float) i_721_
		       + class433_716_.aFloatArray4853[14]);
		float f_725_
		    = (class433_716_.aFloatArray4853[3] * (float) i_719_
		       + class433_716_.aFloatArray4853[7] * (float) i_720_
		       + class433_716_.aFloatArray4853[11] * (float) i_721_
		       + class433_716_.aFloatArray4853[15]);
		aFloatArray9505[i_718_]
		    = (aClass101_9437.aFloat1234
		       + aClass101_9437.aFloat1223 * f_724_ / f_725_);
		aFloatArray9506[i_718_] = f_725_;
		if (f_724_ >= -f_725_) {
		    aFloatArray9503[i_718_]
			= (float) (int) (aClass101_9437.aFloat1200
					 + (aClass101_9437.aFloat1232 * f_722_
					    / f_725_));
		    aFloatArray9496[i_718_]
			= (float) (int) (aClass101_9437.aFloat1230
					 + (aClass101_9437.aFloat1231 * f_723_
					    / f_725_));
		} else {
		    aFloatArray9503[i_718_] = -5000.0F;
		    bool_717_ = true;
		}
		if (aClass101_9437.aBool1245)
		    anIntArray9502[i_718_]
			= (int) (class433.aFloatArray4853[13]
				 + ((class433.aFloatArray4853[1]
				     * (float) i_719_)
				    + (class433.aFloatArray4853[5]
				       * (float) i_720_)
				    + (class433.aFloatArray4853[9]
				       * (float) i_721_)));
	    }
	    if (aClass118Array9485 != null) {
		for (int i_726_ = 0; i_726_ < anInt9484; i_726_++) {
		    Class118 class118 = aClass118Array9485[i_726_];
		    Class117 class117 = aClass117Array9486[i_726_];
		    short i_727_
			= aShortArray9479[class118.anInt1418 * 2118166057];
		    short i_728_
			= aShortArray9455[class118.anInt1418 * 2118166057];
		    short i_729_
			= aShortArray9456[class118.anInt1418 * 2118166057];
		    int i_730_
			= ((anIntArray9494[i_727_] + anIntArray9494[i_728_]
			    + anIntArray9494[i_729_])
			   / 3);
		    int i_731_
			= ((anIntArray9447[i_727_] + anIntArray9447[i_728_]
			    + anIntArray9447[i_729_])
			   / 3);
		    int i_732_
			= ((anIntArray9448[i_727_] + anIntArray9448[i_728_]
			    + anIntArray9448[i_729_])
			   / 3);
		    float f_733_
			= (class433_716_.aFloatArray4853[0] * (float) i_730_
			   + class433_716_.aFloatArray4853[4] * (float) i_731_
			   + class433_716_.aFloatArray4853[8] * (float) i_732_
			   + class433_716_.aFloatArray4853[12]);
		    float f_734_
			= (class433_716_.aFloatArray4853[1] * (float) i_730_
			   + class433_716_.aFloatArray4853[5] * (float) i_731_
			   + class433_716_.aFloatArray4853[9] * (float) i_732_
			   + class433_716_.aFloatArray4853[13]);
		    float f_735_
			= (class433_716_.aFloatArray4853[2] * (float) i_730_
			   + class433_716_.aFloatArray4853[6] * (float) i_731_
			   + class433_716_.aFloatArray4853[10] * (float) i_732_
			   + class433_716_.aFloatArray4853[14]);
		    float f_736_
			= (class433_716_.aFloatArray4853[3] * (float) i_730_
			   + class433_716_.aFloatArray4853[7] * (float) i_731_
			   + class433_716_.aFloatArray4853[11] * (float) i_732_
			   + class433_716_.aFloatArray4853[15]);
		    f_735_
			+= ((class433_700_.aFloatArray4853[2]
			     * (float) (class117.anInt1405 * -169572407))
			    + (class433_700_.aFloatArray4853[6]
			       * (float) (class117.anInt1406 * -653522829)));
		    f_736_
			+= ((class433_700_.aFloatArray4853[3]
			     * (float) (class117.anInt1405 * -169572407))
			    + (class433_700_.aFloatArray4853[7]
			       * (float) (class117.anInt1406 * -653522829)));
		    if (f_735_ > -f_736_) {
			f_733_
			    += ((class433_700_.aFloatArray4853[0]
				 * (float) (class117.anInt1405 * -169572407))
				+ (class433_700_.aFloatArray4853[4]
				   * (float) (class117.anInt1406
					      * -653522829)));
			f_734_
			    += ((class433_700_.aFloatArray4853[1]
				 * (float) (class117.anInt1405 * -169572407))
				+ (class433_700_.aFloatArray4853[5]
				   * (float) (class117.anInt1406
					      * -653522829)));
			float f_737_ = (aClass185_Sub2_9475.aFloat9342
					+ (aClass185_Sub2_9475.aFloat9361
					   * f_733_ / f_736_));
			float f_738_ = (aClass185_Sub2_9475.aFloat9368
					+ (aClass185_Sub2_9475.aFloat9363
					   * f_734_ / f_736_));
			float f_739_ = (class117.aFloat1403
					* (float) class118.aShort1414);
			float f_740_ = (class117.aFloat1404
					* (float) class118.aShort1413);
			float f_741_
			    = (f_733_
			       + class433_700_.aFloatArray4853[0] * f_739_
			       + class433_700_.aFloatArray4853[4] * f_740_);
			float f_742_
			    = (f_734_
			       + class433_700_.aFloatArray4853[1] * f_739_
			       + class433_700_.aFloatArray4853[5] * f_740_);
			float f_743_
			    = (f_736_
			       + class433_700_.aFloatArray4853[3] * f_739_
			       + class433_700_.aFloatArray4853[7] * f_740_);
			float f_744_ = (aClass185_Sub2_9475.aFloat9342
					+ (aClass185_Sub2_9475.aFloat9361
					   * f_741_ / f_743_));
			float f_745_ = (aClass185_Sub2_9475.aFloat9368
					+ (aClass185_Sub2_9475.aFloat9363
					   * f_742_ / f_743_));
			class117.anInt1407 = (int) f_737_ * -1511174311;
			class117.anInt1412 = (int) f_738_ * -773687655;
			class117.aFloat1410
			    = (aClass185_Sub2_9475.aFloat9366
			       + (aClass185_Sub2_9475.aFloat9349
				  * (f_735_
				     - (class433_700_.aFloatArray4853[10]
					* (float) (class118.anInt1420
						   * 734303979)))
				  / f_736_));
			class117.anInt1402
			    = (int) (f_744_ < f_737_ ? f_737_ - f_744_
				     : f_744_ - f_737_) * -620105347;
			class117.anInt1408
			    = (int) (f_745_ < f_738_ ? f_738_ - f_745_
				     : f_745_ - f_738_) * 660144177;
		    } else {
			Class117 class117_746_ = class117;
			class117.anInt1408 = 0;
			class117_746_.anInt1402 = 0;
		    }
		}
	    }
	    if (class194 != null) {
		boolean bool_747_ = false;
		boolean bool_748_ = true;
		int i_749_ = aShort9493 + aShort9468 >> 1;
		int i_750_ = aShort9495 + aShort9449 >> 1;
		int i_751_ = i_749_;
		short i_752_ = aShort9491;
		int i_753_ = i_750_;
		float f_754_
		    = (class433_716_.aFloatArray4853[0] * (float) i_751_
		       + class433_716_.aFloatArray4853[4] * (float) i_752_
		       + class433_716_.aFloatArray4853[8] * (float) i_753_
		       + class433_716_.aFloatArray4853[12]);
		float f_755_
		    = (class433_716_.aFloatArray4853[1] * (float) i_751_
		       + class433_716_.aFloatArray4853[5] * (float) i_752_
		       + class433_716_.aFloatArray4853[9] * (float) i_753_
		       + class433_716_.aFloatArray4853[13]);
		float f_756_
		    = (class433_716_.aFloatArray4853[2] * (float) i_751_
		       + class433_716_.aFloatArray4853[6] * (float) i_752_
		       + class433_716_.aFloatArray4853[10] * (float) i_753_
		       + class433_716_.aFloatArray4853[14]);
		float f_757_
		    = (class433_716_.aFloatArray4853[3] * (float) i_751_
		       + class433_716_.aFloatArray4853[7] * (float) i_752_
		       + class433_716_.aFloatArray4853[11] * (float) i_753_
		       + class433_716_.aFloatArray4853[15]);
		if (f_756_ >= -f_757_) {
		    class194.anInt2148
			= (int) (aClass185_Sub2_9475.aFloat9342
				 + (aClass185_Sub2_9475.aFloat9361 * f_754_
				    / f_757_));
		    class194.anInt2149
			= (int) (aClass185_Sub2_9475.aFloat9368
				 + (aClass185_Sub2_9475.aFloat9363 * f_755_
				    / f_757_));
		} else
		    bool_747_ = true;
		i_751_ = i_749_;
		i_752_ = aShort9492;
		i_753_ = i_750_;
		float f_758_
		    = (class433_716_.aFloatArray4853[0] * (float) i_751_
		       + class433_716_.aFloatArray4853[4] * (float) i_752_
		       + class433_716_.aFloatArray4853[8] * (float) i_753_
		       + class433_716_.aFloatArray4853[12]);
		float f_759_
		    = (class433_716_.aFloatArray4853[1] * (float) i_751_
		       + class433_716_.aFloatArray4853[5] * (float) i_752_
		       + class433_716_.aFloatArray4853[9] * (float) i_753_
		       + class433_716_.aFloatArray4853[13]);
		float f_760_
		    = (class433_716_.aFloatArray4853[2] * (float) i_751_
		       + class433_716_.aFloatArray4853[6] * (float) i_752_
		       + class433_716_.aFloatArray4853[10] * (float) i_753_
		       + class433_716_.aFloatArray4853[14]);
		float f_761_
		    = (class433_716_.aFloatArray4853[3] * (float) i_751_
		       + class433_716_.aFloatArray4853[7] * (float) i_752_
		       + class433_716_.aFloatArray4853[11] * (float) i_753_
		       + class433_716_.aFloatArray4853[15]);
		if (f_760_ >= -f_761_) {
		    class194.anInt2152
			= (int) (aClass185_Sub2_9475.aFloat9342
				 + (aClass185_Sub2_9475.aFloat9361 * f_758_
				    / f_761_));
		    class194.anInt2151
			= (int) (aClass185_Sub2_9475.aFloat9368
				 + (aClass185_Sub2_9475.aFloat9363 * f_759_
				    / f_761_));
		} else
		    bool_747_ = true;
		if (bool_747_) {
		    if (f_756_ < -f_757_ && f_760_ < -f_761_)
			bool_748_ = false;
		    else if (f_756_ < -f_757_) {
			float f_762_
			    = (f_756_ + f_757_) / (f_760_ + f_761_) - 1.0F;
			float f_763_ = f_754_ + f_762_ * (f_758_ - f_754_);
			float f_764_ = f_755_ + f_762_ * (f_759_ - f_755_);
			float f_765_ = f_757_ + f_762_ * (f_761_ - f_757_);
			class194.anInt2148
			    = (int) (aClass185_Sub2_9475.aFloat9342
				     + (aClass185_Sub2_9475.aFloat9361 * f_763_
					/ f_765_));
			class194.anInt2149
			    = (int) (aClass185_Sub2_9475.aFloat9368
				     + (aClass185_Sub2_9475.aFloat9363 * f_764_
					/ f_765_));
		    } else if (f_760_ < -f_761_) {
			float f_766_
			    = (f_760_ + f_761_) / (f_756_ + f_757_) - 1.0F;
			float f_767_ = f_758_ + f_766_ * (f_754_ - f_758_);
			float f_768_ = f_759_ + f_766_ * (f_755_ - f_759_);
			float f_769_ = f_761_ + f_766_ * (f_757_ - f_761_);
			class194.anInt2152
			    = (int) (aClass185_Sub2_9475.aFloat9342
				     + (aClass185_Sub2_9475.aFloat9361 * f_767_
					/ f_769_));
			class194.anInt2151
			    = (int) (aClass185_Sub2_9475.aFloat9368
				     + (aClass185_Sub2_9475.aFloat9363 * f_768_
					/ f_769_));
		    }
		}
		if (bool_748_) {
		    if (f_756_ / f_757_ > f_760_ / f_761_) {
			float f_770_ = (f_754_
					+ (class433_700_.aFloatArray4853[0]
					   * (float) aShort9473)
					+ class433_700_.aFloatArray4853[12]);
			float f_771_ = (f_757_
					+ (class433_700_.aFloatArray4853[3]
					   * (float) aShort9473)
					+ class433_700_.aFloatArray4853[15]);
			class194.anInt2147
			    = (int) (aClass185_Sub2_9475.aFloat9342
				     - (float) class194.anInt2148
				     + (aClass185_Sub2_9475.aFloat9361 * f_770_
					/ f_771_));
		    } else {
			float f_772_ = (f_758_
					+ (class433_700_.aFloatArray4853[0]
					   * (float) aShort9473)
					+ class433_700_.aFloatArray4853[12]);
			float f_773_ = (f_761_
					+ (class433_700_.aFloatArray4853[3]
					   * (float) aShort9473)
					+ class433_700_.aFloatArray4853[15]);
			class194.anInt2147
			    = (int) (aClass185_Sub2_9475.aFloat9342
				     - (float) class194.anInt2152
				     + (aClass185_Sub2_9475.aFloat9361 * f_772_
					/ f_773_));
		    }
		    class194.aBool2150 = true;
		}
	    }
	    method15115(true);
	    aClass119_9489.aBool1423 = (i & 0x1) == 0;
	    aClass119_9489.aBool1424 = false;
	    try {
		method15111(aClass185_Sub2_9475.anIntArray9338 != null,
			    aClass185_Sub2_9475.aFloatArray9341 != null,
			    (i & 0x4) != 0, bool_717_,
			    ((aClass101_9437.aBool1203
			      && f_715_ > aClass101_9437.aFloat1204)
			     || aClass101_9437.aBool1245));
	    } catch (Exception exception) {
		/* empty */
	    }
	    if (aClass118Array9485 != null) {
		for (int i_774_ = 0; i_774_ < anInt9440; i_774_++)
		    anIntArray9442[i_774_] = -1;
	    }
	    aClass119_9489 = null;
	    if (aClass185_Sub2_9475.anInt9367 * 442227785 > 1) {
		synchronized (this) {
		    aBool9497 = false;
		    this.notifyAll();
		}
	    }
	}
    }
    
    final void method15111(boolean bool, boolean bool_775_, boolean bool_776_,
			   boolean bool_777_, boolean bool_778_) {
	if (aClass118Array9485 != null) {
	    for (int i = 0; i < anInt9484; i++) {
		Class118 class118 = aClass118Array9485[i];
		anIntArray9442[class118.anInt1418 * 2118166057] = i;
	    }
	}
	if (aBool9499 || aClass118Array9485 != null) {
	    if ((anInt9441 & 0x100) == 0 && aShortArray9446 != null) {
		for (int i = 0; i < anInt9453; i++) {
		    short i_779_ = aShortArray9446[i];
		    method15120(bool, bool_775_, bool_776_, i_779_, bool_777_,
				bool_778_);
		}
	    } else {
		for (int i = 0; i < anInt9453; i++) {
		    if (!method15112(i) && !method15099(i))
			method15120(bool, bool_775_, bool_776_, i, bool_777_,
				    bool_778_);
		}
		if (aByteArray9430 == null) {
		    for (int i = 0; i < anInt9453; i++) {
			if (method15112(i) || method15099(i))
			    method15120(bool, bool_775_, bool_776_, i,
					bool_777_, bool_778_);
		    }
		} else {
		    for (int i = 0; i < 12; i++) {
			for (int i_780_ = 0; i_780_ < anInt9453; i_780_++) {
			    if (aByteArray9430[i_780_] == i
				&& (method15112(i_780_)
				    || method15099(i_780_)))
				method15120(bool, bool_775_, bool_776_, i_780_,
					    bool_777_, bool_778_);
			}
		    }
		}
	    }
	    if (aClass118Array9485 != null)
		method15118(bool, bool_775_, bool_776_);
	} else {
	    for (int i = 0; i < anInt9453; i++)
		method15120(bool, bool_775_, bool_776_, i, bool_777_,
			    bool_778_);
	}
    }
    
    public int method3176() {
	return anInt9454;
    }
    
    final boolean method15112(int i) {
	if (aByteArray9469 == null)
	    return false;
	if (aByteArray9469[i] == 0)
	    return false;
	return true;
    }
    
    public Class183 method3011(byte i, int i_781_, boolean bool) {
	method15171(Thread.currentThread());
	boolean bool_782_ = false;
	Class183_Sub2 class183_sub2_783_;
	Class183_Sub2 class183_sub2_784_;
	if (i > 0 && i <= 8) {
	    class183_sub2_784_ = aClass183_Sub2Array9514[i - 1];
	    class183_sub2_783_ = aClass183_Sub2Array9513[i - 1];
	    bool_782_ = true;
	} else
	    class183_sub2_783_ = class183_sub2_784_
		= new Class183_Sub2(aClass185_Sub2_9475);
	return method15093(class183_sub2_783_, class183_sub2_784_, i_781_,
			   bool_782_, bool);
    }
    
    public int method3138() {
	if (!aBool9488)
	    method15173();
	return aShort9449;
    }
    
    final void method15113(boolean bool, boolean bool_785_, boolean bool_786_,
			   int i) {
	short i_787_ = aShortArray9479[i];
	short i_788_ = aShortArray9455[i];
	short i_789_ = aShortArray9456[i];
	boolean bool_790_ = false;
	if (aShortArray9428 != null && aShortArray9428[i] != -1)
	    bool_790_ = (aClass185_Sub2_9475.aClass177_2012.method2931
			 (aShortArray9428[i] & 0xffff, (byte) 1).aBool2043);
	if (!bool_790_) {
	    if (aByteArray9469 == null)
		aClass119_9489.anInt1447 = 0;
	    else
		aClass119_9489.anInt1447 = aByteArray9469[i] & 0xff;
	    if (anIntArray9461[i] == -1)
		aClass119_9489.method2137
		    (bool, bool_785_, bool_786_, aFloatArray9496[i_787_],
		     aFloatArray9496[i_788_], aFloatArray9496[i_789_],
		     aFloatArray9503[i_787_], aFloatArray9503[i_788_],
		     aFloatArray9503[i_789_], aFloatArray9505[i_787_],
		     aFloatArray9505[i_788_], aFloatArray9505[i_789_],
		     Class415.anIntArray4666[anIntArray9459[i] & 0xffff]);
	    else
		aClass119_9489.method2139
		    (bool, bool_785_, bool_786_, aFloatArray9496[i_787_],
		     aFloatArray9496[i_788_], aFloatArray9496[i_789_],
		     aFloatArray9503[i_787_], aFloatArray9503[i_788_],
		     aFloatArray9503[i_789_], aFloatArray9505[i_787_],
		     aFloatArray9505[i_788_], aFloatArray9505[i_789_],
		     (float) (anIntArray9459[i] & 0xffff),
		     (float) (anIntArray9460[i] & 0xffff),
		     (float) (anIntArray9461[i] & 0xffff));
	} else {
	    int i_791_ = -16777216;
	    if (aByteArray9469 != null)
		i_791_ = 255 - (aByteArray9469[i] & 0xff) << 24;
	    if (anIntArray9461[i] == -1) {
		int i_792_ = i_791_ | anIntArray9459[i] & 0xffffff;
		aClass119_9489.method2166
		    (bool, bool_785_, bool_786_, aFloatArray9496[i_787_],
		     aFloatArray9496[i_788_], aFloatArray9496[i_789_],
		     aFloatArray9503[i_787_], aFloatArray9503[i_788_],
		     aFloatArray9503[i_789_], aFloatArray9505[i_787_],
		     aFloatArray9505[i_788_], aFloatArray9505[i_789_],
		     aFloatArray9506[i_787_], aFloatArray9506[i_788_],
		     aFloatArray9506[i_789_], aFloatArrayArray9452[i][0],
		     aFloatArrayArray9452[i][1], aFloatArrayArray9452[i][2],
		     aFloatArrayArray9429[i][0], aFloatArrayArray9429[i][1],
		     aFloatArrayArray9429[i][2], i_792_, i_792_, i_792_,
		     aClass101_9437.anInt1206 * 1046269871, 0.0F, 0.0F, 0.0F,
		     aShortArray9428[i] & 0xffff);
	    } else
		aClass119_9489.method2166
		    (bool, bool_785_, bool_786_, aFloatArray9496[i_787_],
		     aFloatArray9496[i_788_], aFloatArray9496[i_789_],
		     aFloatArray9503[i_787_], aFloatArray9503[i_788_],
		     aFloatArray9503[i_789_], aFloatArray9505[i_787_],
		     aFloatArray9505[i_788_], aFloatArray9505[i_789_],
		     aFloatArray9506[i_787_], aFloatArray9506[i_788_],
		     aFloatArray9506[i_789_], aFloatArrayArray9452[i][0],
		     aFloatArrayArray9452[i][1], aFloatArrayArray9452[i][2],
		     aFloatArrayArray9429[i][0], aFloatArrayArray9429[i][1],
		     aFloatArrayArray9429[i][2],
		     i_791_ | anIntArray9459[i] & 0xffffff,
		     i_791_ | anIntArray9460[i] & 0xffffff,
		     i_791_ | anIntArray9461[i] & 0xffffff,
		     aClass101_9437.anInt1206 * 1046269871, 0.0F, 0.0F, 0.0F,
		     aShortArray9428[i] & 0xffff);
	}
    }
    
    public int method3156() {
	if (!aBool9488)
	    method15173();
	return aShort9491;
    }
    
    public boolean method3039(int i, int i_793_, Class446 class446,
			      boolean bool, int i_794_) {
	method15091(aClass185_Sub2_9475.method15011(Thread.currentThread()));
	Class433 class433 = aClass101_9437.aClass433_1224;
	class433.method6916(class446);
	Class433 class433_795_ = aClass101_9437.aClass433_1217;
	class433_795_.method6842(class433);
	class433_795_.method6839(aClass185_Sub2_9475.aClass433_9346);
	boolean bool_796_ = false;
	int i_797_ = 2147483647;
	int i_798_ = -2147483648;
	int i_799_ = 2147483647;
	int i_800_ = -2147483648;
	if (!aBool9488)
	    method15173();
	int i_801_ = aShort9468 - aShort9493 >> 1;
	int i_802_ = aShort9492 - aShort9491 >> 1;
	int i_803_ = aShort9449 - aShort9495 >> 1;
	int i_804_ = aShort9493 + i_801_;
	int i_805_ = aShort9491 + i_802_;
	int i_806_ = aShort9495 + i_803_;
	int i_807_ = i_804_ - (i_801_ << i_794_);
	int i_808_ = i_805_ - (i_802_ << i_794_);
	int i_809_ = i_806_ - (i_803_ << i_794_);
	int i_810_ = i_804_ + (i_801_ << i_794_);
	int i_811_ = i_805_ + (i_802_ << i_794_);
	int i_812_ = i_806_ + (i_803_ << i_794_);
	anIntArray9507[0] = i_807_;
	anIntArray9480[0] = i_808_;
	anIntArray9509[0] = i_809_;
	anIntArray9507[1] = i_810_;
	anIntArray9480[1] = i_808_;
	anIntArray9509[1] = i_809_;
	anIntArray9507[2] = i_807_;
	anIntArray9480[2] = i_811_;
	anIntArray9509[2] = i_809_;
	anIntArray9507[3] = i_810_;
	anIntArray9480[3] = i_811_;
	anIntArray9509[3] = i_809_;
	anIntArray9507[4] = i_807_;
	anIntArray9480[4] = i_808_;
	anIntArray9509[4] = i_812_;
	anIntArray9507[5] = i_810_;
	anIntArray9480[5] = i_808_;
	anIntArray9509[5] = i_812_;
	anIntArray9507[6] = i_807_;
	anIntArray9480[6] = i_811_;
	anIntArray9509[6] = i_812_;
	anIntArray9507[7] = i_810_;
	anIntArray9480[7] = i_811_;
	anIntArray9509[7] = i_812_;
	for (int i_813_ = 0; i_813_ < 8; i_813_++) {
	    int i_814_ = anIntArray9507[i_813_];
	    int i_815_ = anIntArray9480[i_813_];
	    int i_816_ = anIntArray9509[i_813_];
	    float f = (class433_795_.aFloatArray4853[2] * (float) i_814_
		       + class433_795_.aFloatArray4853[6] * (float) i_815_
		       + class433_795_.aFloatArray4853[10] * (float) i_816_
		       + class433_795_.aFloatArray4853[14]);
	    float f_817_
		= (class433_795_.aFloatArray4853[3] * (float) i_814_
		   + class433_795_.aFloatArray4853[7] * (float) i_815_
		   + class433_795_.aFloatArray4853[11] * (float) i_816_
		   + class433_795_.aFloatArray4853[15]);
	    if (f >= -f_817_) {
		float f_818_
		    = (class433_795_.aFloatArray4853[0] * (float) i_814_
		       + class433_795_.aFloatArray4853[4] * (float) i_815_
		       + class433_795_.aFloatArray4853[8] * (float) i_816_
		       + class433_795_.aFloatArray4853[12]);
		float f_819_
		    = (class433_795_.aFloatArray4853[1] * (float) i_814_
		       + class433_795_.aFloatArray4853[5] * (float) i_815_
		       + class433_795_.aFloatArray4853[9] * (float) i_816_
		       + class433_795_.aFloatArray4853[13]);
		int i_820_ = (int) (aClass185_Sub2_9475.aFloat9342
				    + (aClass185_Sub2_9475.aFloat9361 * f_818_
				       / f_817_));
		int i_821_ = (int) (aClass185_Sub2_9475.aFloat9368
				    + (aClass185_Sub2_9475.aFloat9363 * f_819_
				       / f_817_));
		if (i_820_ < i_797_)
		    i_797_ = i_820_;
		if (i_820_ > i_798_)
		    i_798_ = i_820_;
		if (i_821_ < i_799_)
		    i_799_ = i_821_;
		if (i_821_ > i_800_)
		    i_800_ = i_821_;
		bool_796_ = true;
	    }
	}
	if (bool_796_ && i > i_797_ && i < i_798_ && i_793_ > i_799_
	    && i_793_ < i_800_) {
	    if (bool)
		return true;
	    for (int i_822_ = 0; i_822_ < anInt9444; i_822_++) {
		int i_823_ = anIntArray9494[i_822_];
		int i_824_ = anIntArray9447[i_822_];
		int i_825_ = anIntArray9448[i_822_];
		float f = (class433_795_.aFloatArray4853[2] * (float) i_823_
			   + class433_795_.aFloatArray4853[6] * (float) i_824_
			   + class433_795_.aFloatArray4853[10] * (float) i_825_
			   + class433_795_.aFloatArray4853[14]);
		float f_826_
		    = (class433_795_.aFloatArray4853[3] * (float) i_823_
		       + class433_795_.aFloatArray4853[7] * (float) i_824_
		       + class433_795_.aFloatArray4853[11] * (float) i_825_
		       + class433_795_.aFloatArray4853[15]);
		if (f >= -f_826_) {
		    float f_827_
			= (class433_795_.aFloatArray4853[0] * (float) i_823_
			   + class433_795_.aFloatArray4853[4] * (float) i_824_
			   + class433_795_.aFloatArray4853[8] * (float) i_825_
			   + class433_795_.aFloatArray4853[12]);
		    float f_828_
			= (class433_795_.aFloatArray4853[1] * (float) i_823_
			   + class433_795_.aFloatArray4853[5] * (float) i_824_
			   + class433_795_.aFloatArray4853[9] * (float) i_825_
			   + class433_795_.aFloatArray4853[13]);
		    aFloatArray9503[i_822_]
			= (float) (int) (aClass185_Sub2_9475.aFloat9342
					 + (aClass185_Sub2_9475.aFloat9361
					    * f_827_ / f_826_));
		    aFloatArray9496[i_822_]
			= (float) (int) (aClass185_Sub2_9475.aFloat9368
					 + (aClass185_Sub2_9475.aFloat9363
					    * f_828_ / f_826_));
		} else
		    aFloatArray9503[i_822_] = -999999.0F;
	    }
	    for (int i_829_ = 0; i_829_ < anInt9453; i_829_++) {
		if (aFloatArray9503[aShortArray9479[i_829_]] != -999999.0F
		    && aFloatArray9503[aShortArray9455[i_829_]] != -999999.0F
		    && aFloatArray9503[aShortArray9456[i_829_]] != -999999.0F
		    && method15114(i, i_793_,
				   aFloatArray9496[aShortArray9479[i_829_]],
				   aFloatArray9496[aShortArray9455[i_829_]],
				   aFloatArray9496[aShortArray9456[i_829_]],
				   aFloatArray9503[aShortArray9479[i_829_]],
				   aFloatArray9503[aShortArray9455[i_829_]],
				   aFloatArray9503[aShortArray9456[i_829_]]))
		    return true;
	    }
	}
	return false;
    }
    
    boolean method15114(int i, int i_830_, float f, float f_831_, float f_832_,
			float f_833_, float f_834_, float f_835_) {
	if ((float) i_830_ < f && (float) i_830_ < f_831_
	    && (float) i_830_ < f_832_)
	    return false;
	if ((float) i_830_ > f && (float) i_830_ > f_831_
	    && (float) i_830_ > f_832_)
	    return false;
	if ((float) i < f_833_ && (float) i < f_834_ && (float) i < f_835_)
	    return false;
	if ((float) i > f_833_ && (float) i > f_834_ && (float) i > f_835_)
	    return false;
	return true;
    }
    
    public void method3073(Class446 class446) {
	method15091(aClass185_Sub2_9475.method15011(Thread.currentThread()));
	Class433 class433 = aClass101_9437.aClass433_1224;
	class433.method6916(class446);
	if (aClass172Array9482 != null) {
	    for (int i = 0; i < aClass172Array9482.length; i++) {
		Class172 class172 = aClass172Array9482[i];
		Class172 class172_836_ = class172;
		if (class172.aClass172_1809 != null)
		    class172_836_ = class172.aClass172_1809;
		class172_836_.anInt1815
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9494[(class172.anInt1814
							    * 1404619919)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9447
					       [(class172.anInt1814
						 * 1404619919)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9448
					       [(class172.anInt1814
						 * 1404619919)]))))
		       * -697779603);
		class172_836_.anInt1823
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9494
					    [class172.anInt1814 * 1404619919]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9447[(class172.anInt1814
							     * 1404619919)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9448
					      [(class172.anInt1814
						* 1404619919)])))) * 880720549;
		class172_836_.anInt1817
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9494[(class172.anInt1814
							    * 1404619919)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9447
					       [(class172.anInt1814
						 * 1404619919)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9448
					       [(class172.anInt1814
						 * 1404619919)]))))
		       * -487629419);
		class172_836_.anInt1818
		    = (int) (class433.aFloatArray4853[12]
			     + ((class433.aFloatArray4853[0]
				 * (float) (anIntArray9494
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[4]
				   * (float) anIntArray9447[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[8]
				   * (float) (anIntArray9448
					      [(class172.anInt1812
						* 496404005)])))) * 1861716229;
		class172_836_.anInt1808
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9494
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9447[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9448
					      [(class172.anInt1812
						* 496404005)])))) * 968631629;
		class172_836_.anInt1819
		    = (int) (class433.aFloatArray4853[14]
			     + ((class433.aFloatArray4853[2]
				 * (float) (anIntArray9494
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[6]
				   * (float) anIntArray9447[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[10]
				   * (float) (anIntArray9448
					      [(class172.anInt1812
						* 496404005)])))) * -337212495;
		class172_836_.anInt1821
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9494[(class172.anInt1813
							    * 1123614299)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9447
					       [(class172.anInt1813
						 * 1123614299)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9448
					       [(class172.anInt1813
						 * 1123614299)]))))
		       * -289878931);
		class172_836_.anInt1822
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9494
					    [class172.anInt1813 * 1123614299]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9447[(class172.anInt1813
							     * 1123614299)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9448
					      [(class172.anInt1813
						* 1123614299)])))) * 286740539;
		class172_836_.anInt1820
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9494[(class172.anInt1813
							    * 1123614299)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9447
					       [(class172.anInt1813
						 * 1123614299)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9448
					       [(class172.anInt1813
						 * 1123614299)]))))
		       * -2010684097);
	    }
	}
	if (aClass158Array9483 != null) {
	    for (int i = 0; i < aClass158Array9483.length; i++) {
		Class158 class158 = aClass158Array9483[i];
		Class158 class158_837_ = class158;
		if (class158.aClass158_1748 != null)
		    class158_837_ = class158.aClass158_1748;
		if (class158.aClass433_1747 != null)
		    class158.aClass433_1747.method6842(class433);
		else
		    class158.aClass433_1747 = new Class433(class433);
		class158_837_.anInt1750
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9494[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9447
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9448
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * 1976103833);
		class158_837_.anInt1751
		    = ((int) (class433.aFloatArray4853[13]
			      + ((class433.aFloatArray4853[1]
				  * (float) anIntArray9494[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[5]
				    * (float) (anIntArray9447
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[9]
				    * (float) (anIntArray9448
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * 1216251817);
		class158_837_.anInt1749
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9494[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9447
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9448
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * -1645064349);
	    }
	}
    }
    
    public int method3085() {
	if (!aBool9488)
	    method15173();
	return aShort9473;
    }
    
    void method15115(boolean bool) {
	if (aClass185_Sub2_9475.anInt9367 * 442227785 > 1) {
	    synchronized (this) {
		method15094(bool);
	    }
	} else
	    method15094(bool);
    }
    
    public void method3050() {
	if (!aBool9512) {
	    if (!aBool9488)
		method15173();
	    aShort9498 = aShort9491;
	    aBool9512 = true;
	}
    }
    
    public int method3041() {
	if (!aBool9488)
	    method15173();
	return aShort9473;
    }
    
    final boolean method15116(int i) {
	if (anIntArray9442 == null)
	    return false;
	if (anIntArray9442[i] == -1)
	    return false;
	return true;
    }
    
    public int method3134() {
	if (!aBool9488)
	    method15173();
	return aShort9493;
    }
    
    public int method3129() {
	if (!aBool9488)
	    method15173();
	return aShort9490;
    }
    
    public int method3045() {
	if (!aBool9488)
	    method15173();
	return aShort9491;
    }
    
    public void method3077(Class183 class183, int i, int i_838_, int i_839_,
			   boolean bool) {
	Class183_Sub2 class183_sub2_840_ = (Class183_Sub2) class183;
	if ((anInt9441 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	if ((class183_sub2_840_.anInt9441 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	method15091(aClass185_Sub2_9475.method15011(Thread.currentThread()));
	method15173();
	method15092();
	class183_sub2_840_.method15173();
	class183_sub2_840_.method15092();
	anInt9501++;
	int i_841_ = 0;
	int[] is = class183_sub2_840_.anIntArray9494;
	int i_842_ = class183_sub2_840_.anInt9474;
	for (int i_843_ = 0; i_843_ < anInt9474; i_843_++) {
	    Class96 class96 = aClass96Array9450[i_843_];
	    if (class96.anInt1157 != 0) {
		int i_844_ = anIntArray9447[i_843_] - i_838_;
		if (i_844_ >= class183_sub2_840_.aShort9491
		    && i_844_ <= class183_sub2_840_.aShort9492) {
		    int i_845_ = anIntArray9494[i_843_] - i;
		    if (i_845_ >= class183_sub2_840_.aShort9493
			&& i_845_ <= class183_sub2_840_.aShort9468) {
			int i_846_ = anIntArray9448[i_843_] - i_839_;
			if (i_846_ >= class183_sub2_840_.aShort9495
			    && i_846_ <= class183_sub2_840_.aShort9449) {
			    for (int i_847_ = 0; i_847_ < i_842_; i_847_++) {
				Class96 class96_848_
				    = (class183_sub2_840_.aClass96Array9450
				       [i_847_]);
				if (i_845_ == is[i_847_]
				    && i_846_ == (class183_sub2_840_
						  .anIntArray9448[i_847_])
				    && i_844_ == (class183_sub2_840_
						  .anIntArray9447[i_847_])
				    && class96_848_.anInt1157 != 0) {
				    if (aClass96Array9451 == null)
					aClass96Array9451
					    = new Class96[anInt9474];
				    if (class183_sub2_840_.aClass96Array9451
					== null)
					class183_sub2_840_.aClass96Array9451
					    = new Class96[i_842_];
				    Class96 class96_849_
					= aClass96Array9451[i_843_];
				    if (class96_849_ == null)
					class96_849_
					    = aClass96Array9451[i_843_]
					    = new Class96(class96);
				    Class96 class96_850_
					= (class183_sub2_840_.aClass96Array9451
					   [i_847_]);
				    if (class96_850_ == null)
					class96_850_
					    = class183_sub2_840_
						  .aClass96Array9451[i_847_]
					    = new Class96(class96_848_);
				    class96_849_.anInt1159
					+= class96_848_.anInt1159;
				    class96_849_.anInt1158
					+= class96_848_.anInt1158;
				    class96_849_.anInt1156
					+= class96_848_.anInt1156;
				    class96_849_.anInt1157
					+= class96_848_.anInt1157;
				    class96_850_.anInt1159
					+= class96.anInt1159;
				    class96_850_.anInt1158
					+= class96.anInt1158;
				    class96_850_.anInt1156
					+= class96.anInt1156;
				    class96_850_.anInt1157
					+= class96.anInt1157;
				    i_841_++;
				    anIntArray9510[i_843_] = anInt9501;
				    anIntArray9511[i_847_] = anInt9501;
				}
			    }
			}
		    }
		}
	    }
	}
	if (i_841_ >= 3 && bool) {
	    for (int i_851_ = 0; i_851_ < anInt9440; i_851_++) {
		if (anIntArray9510[aShortArray9479[i_851_]] == anInt9501
		    && anIntArray9510[aShortArray9455[i_851_]] == anInt9501
		    && anIntArray9510[aShortArray9456[i_851_]] == anInt9501) {
		    if (aByteArray9467 == null)
			aByteArray9467 = new byte[anInt9440];
		    aByteArray9467[i_851_] = (byte) 2;
		}
	    }
	    for (int i_852_ = 0; i_852_ < class183_sub2_840_.anInt9440;
		 i_852_++) {
		if ((anIntArray9511[class183_sub2_840_.aShortArray9479[i_852_]]
		     == anInt9501)
		    && anIntArray9511[(class183_sub2_840_.aShortArray9455
				       [i_852_])] == anInt9501
		    && anIntArray9511[(class183_sub2_840_.aShortArray9456
				       [i_852_])] == anInt9501) {
		    if (class183_sub2_840_.aByteArray9467 == null)
			class183_sub2_840_.aByteArray9467
			    = new byte[class183_sub2_840_.anInt9440];
		    class183_sub2_840_.aByteArray9467[i_852_] = (byte) 2;
		}
	    }
	}
    }
    
    public int method3047() {
	if (!aBool9488)
	    method15173();
	return aShort9495;
    }
    
    public int method3038() {
	if (!aBool9488)
	    method15173();
	return aShort9449;
    }
    
    public int method3049() {
	if (!aBool9512)
	    method3050();
	return aShort9498;
    }
    
    public void method3051(int i) {
	if ((anInt9441 & 0x1000) != 4096)
	    throw new IllegalStateException();
	anInt9454 = i;
	anInt9432 = 0;
    }
    
    void method15117() {
	aClass96Array9450 = new Class96[anInt9474];
	for (int i = 0; i < anInt9474; i++)
	    aClass96Array9450[i] = new Class96();
	for (int i = 0; i < anInt9440; i++) {
	    short i_853_ = aShortArray9479[i];
	    short i_854_ = aShortArray9455[i];
	    short i_855_ = aShortArray9456[i];
	    int i_856_ = anIntArray9494[i_854_] - anIntArray9494[i_853_];
	    int i_857_ = anIntArray9447[i_854_] - anIntArray9447[i_853_];
	    int i_858_ = anIntArray9448[i_854_] - anIntArray9448[i_853_];
	    int i_859_ = anIntArray9494[i_855_] - anIntArray9494[i_853_];
	    int i_860_ = anIntArray9447[i_855_] - anIntArray9447[i_853_];
	    int i_861_ = anIntArray9448[i_855_] - anIntArray9448[i_853_];
	    int i_862_ = i_857_ * i_861_ - i_860_ * i_858_;
	    int i_863_ = i_858_ * i_859_ - i_861_ * i_856_;
	    int i_864_;
	    for (i_864_ = i_856_ * i_860_ - i_859_ * i_857_;
		 (i_862_ > 8192 || i_863_ > 8192 || i_864_ > 8192
		  || i_862_ < -8192 || i_863_ < -8192 || i_864_ < -8192);
		 i_864_ >>= 1) {
		i_862_ >>= 1;
		i_863_ >>= 1;
	    }
	    int i_865_
		= (int) Math.sqrt((double) (i_862_ * i_862_ + i_863_ * i_863_
					    + i_864_ * i_864_));
	    if (i_865_ <= 0)
		i_865_ = 1;
	    i_862_ = i_862_ * 256 / i_865_;
	    i_863_ = i_863_ * 256 / i_865_;
	    i_864_ = i_864_ * 256 / i_865_;
	    byte i_866_;
	    if (aByteArray9467 == null)
		i_866_ = (byte) 0;
	    else
		i_866_ = aByteArray9467[i];
	    if (i_866_ == 0) {
		Class96 class96 = aClass96Array9450[i_853_];
		class96.anInt1159 += i_862_;
		class96.anInt1158 += i_863_;
		class96.anInt1156 += i_864_;
		class96.anInt1157++;
		class96 = aClass96Array9450[i_854_];
		class96.anInt1159 += i_862_;
		class96.anInt1158 += i_863_;
		class96.anInt1156 += i_864_;
		class96.anInt1157++;
		class96 = aClass96Array9450[i_855_];
		class96.anInt1159 += i_862_;
		class96.anInt1158 += i_863_;
		class96.anInt1156 += i_864_;
		class96.anInt1157++;
	    } else if (i_866_ == 1) {
		if (aClass107Array9466 == null)
		    aClass107Array9466 = new Class107[anInt9440];
		Class107 class107 = aClass107Array9466[i] = new Class107();
		class107.anInt1315 = i_862_;
		class107.anInt1314 = i_863_;
		class107.anInt1313 = i_864_;
	    }
	}
    }
    
    public int method3053() {
	return anInt9454;
    }
    
    public void method3012(int i) {
	if (aClass185_Sub2_9475.anInt9367 * 442227785 > 1) {
	    synchronized (this) {
		if ((anInt9441 & 0x10000) == 65536 && (i & 0x10000) == 0)
		    method15115(true);
		anInt9441 = i;
	    }
	} else {
	    if ((anInt9441 & 0x10000) == 65536 && (i & 0x10000) == 0)
		method15115(true);
	    anInt9441 = i;
	}
    }
    
    public void method3079(int i) {
	if ((anInt9441 & 0x5) != 5)
	    throw new IllegalStateException();
	if (i == 4096)
	    method15101();
	else if (i == 8192)
	    method15102();
	else if (i == 12288)
	    method15103();
	else {
	    int i_867_ = Class427.anIntArray4806[i];
	    int i_868_ = Class427.anIntArray4805[i];
	    synchronized (this) {
		for (int i_869_ = 0; i_869_ < anInt9444; i_869_++) {
		    int i_870_ = ((anIntArray9448[i_869_] * i_867_
				   + anIntArray9494[i_869_] * i_868_)
				  >> 14);
		    anIntArray9448[i_869_]
			= (anIntArray9448[i_869_] * i_868_
			   - anIntArray9494[i_869_] * i_867_) >> 14;
		    anIntArray9494[i_869_] = i_870_;
		}
		method15151();
	    }
	}
    }
    
    public void method3018(int i) {
	if ((anInt9441 & 0x3) != 3)
	    throw new IllegalStateException();
	int i_871_ = Class427.anIntArray4806[i];
	int i_872_ = Class427.anIntArray4805[i];
	synchronized (this) {
	    for (int i_873_ = 0; i_873_ < anInt9444; i_873_++) {
		int i_874_ = ((anIntArray9447[i_873_] * i_871_
			       + anIntArray9494[i_873_] * i_872_)
			      >> 14);
		anIntArray9447[i_873_]
		    = (anIntArray9447[i_873_] * i_872_
		       - anIntArray9494[i_873_] * i_871_) >> 14;
		anIntArray9494[i_873_] = i_874_;
	    }
	    method15151();
	}
    }
    
    public Class158[] method3024() {
	return aClass158Array9483;
    }
    
    public void method3118(short i, short i_875_) {
	if (aShortArray9428 != null) {
	    if (!aBool9500 && i_875_ >= 0) {
		Class186 class186 = aClass185_Sub2_9475.aClass177_2012
					.method2931(i_875_ & 0xffff, (byte) 1);
		if (class186.aByte2047 != 0 || class186.aByte2048 != 0)
		    aBool9500 = true;
	    }
	    for (int i_876_ = 0; i_876_ < anInt9440; i_876_++) {
		if (aShortArray9428[i_876_] == i)
		    aShortArray9428[i_876_] = i_875_;
	    }
	}
    }
    
    public void method3058(int i, int i_877_, int i_878_, int i_879_) {
	if ((anInt9441 & 0x80000) != 524288)
	    throw new IllegalStateException();
	for (int i_880_ = 0; i_880_ < anInt9440; i_880_++) {
	    int i_881_ = aShortArray9471[i_880_] & 0xffff;
	    int i_882_ = i_881_ >> 10 & 0x3f;
	    int i_883_ = i_881_ >> 7 & 0x7;
	    int i_884_ = i_881_ & 0x7f;
	    if (i != -1)
		i_882_ += (i - i_882_) * i_879_ >> 7;
	    if (i_877_ != -1)
		i_883_ += (i_877_ - i_883_) * i_879_ >> 7;
	    if (i_878_ != -1)
		i_884_ += (i_878_ - i_884_) * i_879_ >> 7;
	    aShortArray9471[i_880_]
		= (short) (i_882_ << 10 | i_883_ << 7 | i_884_);
	}
	if (aClass118Array9485 != null) {
	    for (int i_885_ = 0; i_885_ < anInt9484; i_885_++) {
		Class118 class118 = aClass118Array9485[i_885_];
		Class117 class117 = aClass117Array9486[i_885_];
		class117.anInt1411
		    = (class117.anInt1411 * -150900843 & ~0xffffff
		       | ((Class415.anIntArray4666
			   [Class315.method5705((aShortArray9471
						 [(class118.anInt1418
						   * 2118166057)]) & 0xffff,
						-88362335) & 0xffff])
			  & 0xffffff)) * 874668989;
	    }
	}
	if (anInt9432 == 2)
	    anInt9432 = 1;
    }
    
    final void method15118(boolean bool, boolean bool_886_,
			   boolean bool_887_) {
	for (int i = 0; i < anInt9484; i++) {
	    Class118 class118 = aClass118Array9485[i];
	    if (class118.aBool1419) {
		Class117 class117 = aClass117Array9486[i];
		aClass185_Sub2_9475.method15013
		    (bool, bool_886_, bool_887_,
		     class117.anInt1407 * -876082967,
		     class117.anInt1412 * 61832617, class117.aFloat1410,
		     class117.anInt1402 * 976146389,
		     class117.anInt1408 * 287725777, class118.aShort1416,
		     class117.anInt1411 * -150900843, class118.aByte1415,
		     class118.aByte1417);
	    }
	}
    }
    
    public Class158[] method3065() {
	return aClass158Array9483;
    }
    
    public boolean method3060() {
	if (aShortArray9428 == null)
	    return true;
	for (int i = 0; i < aShortArray9428.length; i++) {
	    if (aShortArray9428[i] != -1
		&& !aClass185_Sub2_9475.method15002(aShortArray9428[i]))
		return false;
	}
	return true;
    }
    
    public boolean method3027() {
	return aBool9499;
    }
    
    public boolean method3062() {
	return aBool9500;
    }
    
    static {
	anInt9434 = 4096;
	anInt9501 = 0;
    }
    
    void method15119(Class101 class101) {
	aClass119_9489 = class101.aClass119_1233;
	if (class101 != aClass101_9437) {
	    aClass101_9437 = class101;
	    anIntArray9502 = aClass101_9437.anIntArray1214;
	    aFloatArray9503 = aClass101_9437.aFloatArray1235;
	    aFloatArray9496 = aClass101_9437.aFloatArray1220;
	    aFloatArray9505 = aClass101_9437.aFloatArray1221;
	    aFloatArray9506 = aClass101_9437.aFloatArray1222;
	    anIntArray9507 = aClass101_9437.anIntArray1240;
	    anIntArray9480 = aClass101_9437.anIntArray1216;
	    anIntArray9509 = aClass101_9437.anIntArray1218;
	    anIntArray9510 = aClass101_9437.anIntArray1201;
	    anIntArray9511 = aClass101_9437.anIntArray1227;
	    anIntArray9442 = aClass101_9437.anIntArray1228;
	}
    }
    
    final void method15120(boolean bool, boolean bool_888_, boolean bool_889_,
			   int i, boolean bool_890_, boolean bool_891_) {
	if (anIntArray9461[i] != -2) {
	    short i_892_ = aShortArray9479[i];
	    short i_893_ = aShortArray9455[i];
	    short i_894_ = aShortArray9456[i];
	    float f = aFloatArray9503[i_892_];
	    float f_895_ = aFloatArray9503[i_893_];
	    float f_896_ = aFloatArray9503[i_894_];
	    if (!bool_890_
		|| f != -5000.0F && f_895_ != -5000.0F && f_896_ != -5000.0F) {
		float f_897_ = aFloatArray9496[i_892_];
		float f_898_ = aFloatArray9496[i_893_];
		float f_899_ = aFloatArray9496[i_894_];
		if (anIntArray9442[i] != -1
		    || ((f - f_895_) * (f_899_ - f_898_)
			- (f_897_ - f_898_) * (f_896_ - f_895_)) > 0.0F) {
		    if (f < 0.0F || f_895_ < 0.0F || f_896_ < 0.0F
			|| f > (float) (aClass101_9437.anInt1236 * 824618691)
			|| f_895_ > (float) (aClass101_9437.anInt1236
					     * 824618691)
			|| f_896_ > (float) (aClass101_9437.anInt1236
					     * 824618691))
			aClass119_9489.aBool1422 = true;
		    else
			aClass119_9489.aBool1422 = false;
		    if (bool_891_) {
			int i_900_ = anIntArray9442[i];
			if (i_900_ == -1
			    || !aClass118Array9485[i_900_].aBool1419)
			    method15157(bool, bool_888_, bool_889_, i);
		    } else {
			int i_901_ = anIntArray9442[i];
			if (i_901_ != -1) {
			    Class118 class118 = aClass118Array9485[i_901_];
			    Class117 class117 = aClass117Array9486[i_901_];
			    if (!class118.aBool1419)
				method15113(bool, bool_888_, bool_889_, i);
			    aClass185_Sub2_9475.method15013
				(bool, bool_888_, bool_889_,
				 class117.anInt1407 * -876082967,
				 class117.anInt1412 * 61832617,
				 class117.aFloat1410,
				 class117.anInt1402 * 976146389,
				 class117.anInt1408 * 287725777,
				 class118.aShort1416,
				 class117.anInt1411 * -150900843,
				 class118.aByte1415, class118.aByte1417);
			} else
			    method15113(bool, bool_888_, bool_889_, i);
		    }
		}
	    }
	}
    }
    
    void method15121(Class101 class101) {
	aClass119_9489 = class101.aClass119_1233;
	if (class101 != aClass101_9437) {
	    aClass101_9437 = class101;
	    anIntArray9502 = aClass101_9437.anIntArray1214;
	    aFloatArray9503 = aClass101_9437.aFloatArray1235;
	    aFloatArray9496 = aClass101_9437.aFloatArray1220;
	    aFloatArray9505 = aClass101_9437.aFloatArray1221;
	    aFloatArray9506 = aClass101_9437.aFloatArray1222;
	    anIntArray9507 = aClass101_9437.anIntArray1240;
	    anIntArray9480 = aClass101_9437.anIntArray1216;
	    anIntArray9509 = aClass101_9437.anIntArray1218;
	    anIntArray9510 = aClass101_9437.anIntArray1201;
	    anIntArray9511 = aClass101_9437.anIntArray1227;
	    anIntArray9442 = aClass101_9437.anIntArray1228;
	}
    }
    
    public void method3069(Class183 class183, int i, int i_902_, int i_903_,
			   boolean bool) {
	Class183_Sub2 class183_sub2_904_ = (Class183_Sub2) class183;
	if ((anInt9441 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	if ((class183_sub2_904_.anInt9441 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	method15091(aClass185_Sub2_9475.method15011(Thread.currentThread()));
	method15173();
	method15092();
	class183_sub2_904_.method15173();
	class183_sub2_904_.method15092();
	anInt9501++;
	int i_905_ = 0;
	int[] is = class183_sub2_904_.anIntArray9494;
	int i_906_ = class183_sub2_904_.anInt9474;
	for (int i_907_ = 0; i_907_ < anInt9474; i_907_++) {
	    Class96 class96 = aClass96Array9450[i_907_];
	    if (class96.anInt1157 != 0) {
		int i_908_ = anIntArray9447[i_907_] - i_902_;
		if (i_908_ >= class183_sub2_904_.aShort9491
		    && i_908_ <= class183_sub2_904_.aShort9492) {
		    int i_909_ = anIntArray9494[i_907_] - i;
		    if (i_909_ >= class183_sub2_904_.aShort9493
			&& i_909_ <= class183_sub2_904_.aShort9468) {
			int i_910_ = anIntArray9448[i_907_] - i_903_;
			if (i_910_ >= class183_sub2_904_.aShort9495
			    && i_910_ <= class183_sub2_904_.aShort9449) {
			    for (int i_911_ = 0; i_911_ < i_906_; i_911_++) {
				Class96 class96_912_
				    = (class183_sub2_904_.aClass96Array9450
				       [i_911_]);
				if (i_909_ == is[i_911_]
				    && i_910_ == (class183_sub2_904_
						  .anIntArray9448[i_911_])
				    && i_908_ == (class183_sub2_904_
						  .anIntArray9447[i_911_])
				    && class96_912_.anInt1157 != 0) {
				    if (aClass96Array9451 == null)
					aClass96Array9451
					    = new Class96[anInt9474];
				    if (class183_sub2_904_.aClass96Array9451
					== null)
					class183_sub2_904_.aClass96Array9451
					    = new Class96[i_906_];
				    Class96 class96_913_
					= aClass96Array9451[i_907_];
				    if (class96_913_ == null)
					class96_913_
					    = aClass96Array9451[i_907_]
					    = new Class96(class96);
				    Class96 class96_914_
					= (class183_sub2_904_.aClass96Array9451
					   [i_911_]);
				    if (class96_914_ == null)
					class96_914_
					    = class183_sub2_904_
						  .aClass96Array9451[i_911_]
					    = new Class96(class96_912_);
				    class96_913_.anInt1159
					+= class96_912_.anInt1159;
				    class96_913_.anInt1158
					+= class96_912_.anInt1158;
				    class96_913_.anInt1156
					+= class96_912_.anInt1156;
				    class96_913_.anInt1157
					+= class96_912_.anInt1157;
				    class96_914_.anInt1159
					+= class96.anInt1159;
				    class96_914_.anInt1158
					+= class96.anInt1158;
				    class96_914_.anInt1156
					+= class96.anInt1156;
				    class96_914_.anInt1157
					+= class96.anInt1157;
				    i_905_++;
				    anIntArray9510[i_907_] = anInt9501;
				    anIntArray9511[i_911_] = anInt9501;
				}
			    }
			}
		    }
		}
	    }
	}
	if (i_905_ >= 3 && bool) {
	    for (int i_915_ = 0; i_915_ < anInt9440; i_915_++) {
		if (anIntArray9510[aShortArray9479[i_915_]] == anInt9501
		    && anIntArray9510[aShortArray9455[i_915_]] == anInt9501
		    && anIntArray9510[aShortArray9456[i_915_]] == anInt9501) {
		    if (aByteArray9467 == null)
			aByteArray9467 = new byte[anInt9440];
		    aByteArray9467[i_915_] = (byte) 2;
		}
	    }
	    for (int i_916_ = 0; i_916_ < class183_sub2_904_.anInt9440;
		 i_916_++) {
		if ((anIntArray9511[class183_sub2_904_.aShortArray9479[i_916_]]
		     == anInt9501)
		    && anIntArray9511[(class183_sub2_904_.aShortArray9455
				       [i_916_])] == anInt9501
		    && anIntArray9511[(class183_sub2_904_.aShortArray9456
				       [i_916_])] == anInt9501) {
		    if (class183_sub2_904_.aByteArray9467 == null)
			class183_sub2_904_.aByteArray9467
			    = new byte[class183_sub2_904_.anInt9440];
		    class183_sub2_904_.aByteArray9467[i_916_] = (byte) 2;
		}
	    }
	}
    }
    
    public void method3177(int i) {
	if ((anInt9441 & 0xd) != 13)
	    throw new IllegalStateException();
	if (aClass96Array9450 != null) {
	    if (i == 4096)
		method15108();
	    else if (i == 8192)
		method15104();
	    else if (i == 12288)
		method15105();
	    else {
		int i_917_ = Class427.anIntArray4806[i];
		int i_918_ = Class427.anIntArray4805[i];
		synchronized (this) {
		    for (int i_919_ = 0; i_919_ < anInt9474; i_919_++) {
			int i_920_ = ((anIntArray9448[i_919_] * i_917_
				       + anIntArray9494[i_919_] * i_918_)
				      >> 14);
			anIntArray9448[i_919_]
			    = (anIntArray9448[i_919_] * i_918_
			       - anIntArray9494[i_919_] * i_917_) >> 14;
			anIntArray9494[i_919_] = i_920_;
			if (aClass96Array9450[i_919_] != null) {
			    i_920_
				= (aClass96Array9450[i_919_].anInt1156 * i_917_
				   + (aClass96Array9450[i_919_].anInt1159
				      * i_918_)) >> 14;
			    aClass96Array9450[i_919_].anInt1156
				= (aClass96Array9450[i_919_].anInt1156 * i_918_
				   - (aClass96Array9450[i_919_].anInt1159
				      * i_917_)) >> 14;
			    aClass96Array9450[i_919_].anInt1159 = i_920_;
			}
		    }
		    if (aClass107Array9466 != null) {
			for (int i_921_ = 0; i_921_ < anInt9440; i_921_++) {
			    if (aClass107Array9466[i_921_] != null) {
				int i_922_
				    = (((aClass107Array9466[i_921_].anInt1313
					 * i_917_)
					+ (aClass107Array9466[i_921_].anInt1315
					   * i_918_))
				       >> 14);
				aClass107Array9466[i_921_].anInt1313
				    = ((aClass107Array9466[i_921_].anInt1313
					* i_918_)
				       - (aClass107Array9466[i_921_].anInt1315
					  * i_917_)) >> 14;
				aClass107Array9466[i_921_].anInt1315 = i_922_;
			    }
			}
		    }
		    for (int i_923_ = anInt9474; i_923_ < anInt9444;
			 i_923_++) {
			int i_924_ = ((anIntArray9448[i_923_] * i_917_
				       + anIntArray9494[i_923_] * i_918_)
				      >> 14);
			anIntArray9448[i_923_]
			    = (anIntArray9448[i_923_] * i_918_
			       - anIntArray9494[i_923_] * i_917_) >> 14;
			anIntArray9494[i_923_] = i_924_;
		    }
		    anInt9432 = 0;
		    aBool9488 = false;
		}
	    }
	} else
	    method3015(i);
    }
    
    void method15122(Thread thread) {
	Class101 class101 = aClass185_Sub2_9475.method15011(thread);
	if (class101 != aClass101_9431) {
	    aClass101_9431 = class101;
	    aClass183_Sub2Array9513 = aClass101_9431.aClass183_Sub2Array1238;
	    aClass183_Sub2Array9514 = aClass101_9431.aClass183_Sub2Array1239;
	}
    }
    
    void method15123() {
	if (anInt9432 == 0 && aClass96Array9450 == null) {
	    if (aClass185_Sub2_9475.anInt9367 * 442227785 > 1) {
		synchronized (this) {
		    method15117();
		}
	    } else
		method15117();
	}
    }
    
    void method15124(boolean bool) {
	if (aClass185_Sub2_9475.anInt9367 * 442227785 > 1) {
	    synchronized (this) {
		method15094(bool);
	    }
	} else
	    method15094(bool);
    }
    
    public void method3200() {
	/* empty */
    }
    
    public void method3098(int i, int i_925_, int i_926_) {
	if (i != 0 && (anInt9441 & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_925_ != 0 && (anInt9441 & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_926_ != 0 && (anInt9441 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_927_ = 0; i_927_ < anInt9444; i_927_++) {
		anIntArray9494[i_927_] += i;
		anIntArray9447[i_927_] += i_925_;
		anIntArray9448[i_927_] += i_926_;
	    }
	}
    }
    
    void method15125(boolean bool) {
	if (anInt9432 == 1)
	    method15135();
	else if (anInt9432 == 2) {
	    if ((anInt9441 & 0x97098) == 0 && aFloatArrayArray9452 == null)
		aShortArray9471 = null;
	    if (bool)
		aByteArray9467 = null;
	} else {
	    method15092();
	    int i = aClass185_Sub2_9475.anInt9352 * 845036313;
	    int i_928_ = aClass185_Sub2_9475.anInt9347 * 1141856477;
	    int i_929_ = aClass185_Sub2_9475.anInt9348 * 568046319;
	    int i_930_ = aClass185_Sub2_9475.anInt9351 * -1021814047 >> 8;
	    int i_931_ = 0;
	    int i_932_ = 0;
	    if (anInt9443 != 0) {
		i_931_
		    = aClass185_Sub2_9475.anInt9370 * -664856320 / anInt9443;
		i_932_
		    = aClass185_Sub2_9475.anInt9358 * 1073854208 / anInt9443;
	    }
	    if (anIntArray9459 == null) {
		anIntArray9459 = new int[anInt9440];
		anIntArray9460 = new int[anInt9440];
		anIntArray9461 = new int[anInt9440];
	    }
	    for (int i_933_ = 0; i_933_ < anInt9440; i_933_++) {
		byte i_934_;
		if (aByteArray9467 == null)
		    i_934_ = (byte) 0;
		else
		    i_934_ = aByteArray9467[i_933_];
		byte i_935_;
		if (aByteArray9469 == null)
		    i_935_ = (byte) 0;
		else
		    i_935_ = aByteArray9469[i_933_];
		short i_936_;
		if (aShortArray9428 == null)
		    i_936_ = (short) -1;
		else
		    i_936_ = aShortArray9428[i_933_];
		if (i_935_ == -2)
		    i_934_ = (byte) 3;
		if (i_935_ == -1)
		    i_934_ = (byte) 2;
		if (i_936_ == -1) {
		    if (i_934_ == 0) {
			int i_937_ = aShortArray9471[i_933_] & 0xffff;
			int i_938_ = (i_937_ & 0x7f) * anInt9454 >> 7;
			short i_939_
			    = Class315.method5705(i_937_ & ~0x7f | i_938_,
						  393790436);
			Class96 class96;
			if (aClass96Array9451 != null
			    && (aClass96Array9451[aShortArray9479[i_933_]]
				!= null))
			    class96
				= aClass96Array9451[aShortArray9479[i_933_]];
			else
			    class96
				= aClass96Array9450[aShortArray9479[i_933_]];
			int i_940_ = (((i * class96.anInt1159
					+ i_928_ * class96.anInt1158
					+ i_929_ * class96.anInt1156)
				       / class96.anInt1157)
				      >> 16);
			int i_941_ = i_940_ > 256 ? i_931_ : i_932_;
			int i_942_ = (i_930_ >> 1) + (i_941_ * i_940_ >> 17);
			anIntArray9459[i_933_]
			    = i_942_ << 17 | Class146.method2452(i_939_,
								 i_942_,
								 177793018);
			if (aClass96Array9451 != null
			    && (aClass96Array9451[aShortArray9455[i_933_]]
				!= null))
			    class96
				= aClass96Array9451[aShortArray9455[i_933_]];
			else
			    class96
				= aClass96Array9450[aShortArray9455[i_933_]];
			i_940_ = ((i * class96.anInt1159
				   + i_928_ * class96.anInt1158
				   + i_929_ * class96.anInt1156)
				  / class96.anInt1157) >> 16;
			i_941_ = i_940_ > 256 ? i_931_ : i_932_;
			i_942_ = (i_930_ >> 1) + (i_941_ * i_940_ >> 17);
			anIntArray9460[i_933_]
			    = i_942_ << 17 | Class146.method2452(i_939_,
								 i_942_,
								 -1301967854);
			if (aClass96Array9451 != null
			    && (aClass96Array9451[aShortArray9456[i_933_]]
				!= null))
			    class96
				= aClass96Array9451[aShortArray9456[i_933_]];
			else
			    class96
				= aClass96Array9450[aShortArray9456[i_933_]];
			i_940_ = ((i * class96.anInt1159
				   + i_928_ * class96.anInt1158
				   + i_929_ * class96.anInt1156)
				  / class96.anInt1157) >> 16;
			i_941_ = i_940_ > 256 ? i_931_ : i_932_;
			i_942_ = (i_930_ >> 1) + (i_941_ * i_940_ >> 17);
			anIntArray9461[i_933_]
			    = i_942_ << 17 | Class146.method2452(i_939_,
								 i_942_,
								 -598489395);
		    } else if (i_934_ == 1) {
			int i_943_ = aShortArray9471[i_933_] & 0xffff;
			int i_944_ = (i_943_ & 0x7f) * anInt9454 >> 7;
			short i_945_
			    = Class315.method5705(i_943_ & ~0x7f | i_944_,
						  -156571439);
			Class107 class107 = aClass107Array9466[i_933_];
			int i_946_ = ((i * class107.anInt1315
				       + i_928_ * class107.anInt1314
				       + i_929_ * class107.anInt1313)
				      >> 16);
			int i_947_ = i_946_ > 256 ? i_931_ : i_932_;
			int i_948_ = (i_930_ >> 1) + (i_947_ * i_946_ >> 17);
			anIntArray9459[i_933_]
			    = i_948_ << 17 | Class146.method2452(i_945_,
								 i_948_,
								 118719379);
			anIntArray9461[i_933_] = -1;
		    } else if (i_934_ == 3) {
			anIntArray9459[i_933_] = 128;
			anIntArray9461[i_933_] = -1;
		    } else
			anIntArray9461[i_933_] = -2;
		} else {
		    int i_949_ = aShortArray9471[i_933_] & 0xffff;
		    if (i_934_ == 0) {
			Class96 class96;
			if (aClass96Array9451 != null
			    && (aClass96Array9451[aShortArray9479[i_933_]]
				!= null))
			    class96
				= aClass96Array9451[aShortArray9479[i_933_]];
			else
			    class96
				= aClass96Array9450[aShortArray9479[i_933_]];
			int i_950_ = (((i * class96.anInt1159
					+ i_928_ * class96.anInt1158
					+ i_929_ * class96.anInt1156)
				       / class96.anInt1157)
				      >> 16);
			int i_951_ = i_950_ > 256 ? i_931_ : i_932_;
			int i_952_
			    = method15097((i_930_ >> 2) + (i_951_ * i_950_
							   >> 18));
			anIntArray9459[i_933_]
			    = i_952_ << 24 | method15095(i_949_, i_936_,
							 i_952_);
			if (aClass96Array9451 != null
			    && (aClass96Array9451[aShortArray9455[i_933_]]
				!= null))
			    class96
				= aClass96Array9451[aShortArray9455[i_933_]];
			else
			    class96
				= aClass96Array9450[aShortArray9455[i_933_]];
			i_950_ = ((i * class96.anInt1159
				   + i_928_ * class96.anInt1158
				   + i_929_ * class96.anInt1156)
				  / class96.anInt1157) >> 16;
			i_951_ = i_950_ > 256 ? i_931_ : i_932_;
			i_952_ = method15097((i_930_ >> 2) + (i_951_ * i_950_
							      >> 18));
			anIntArray9460[i_933_]
			    = i_952_ << 24 | method15095(i_949_, i_936_,
							 i_952_);
			if (aClass96Array9451 != null
			    && (aClass96Array9451[aShortArray9456[i_933_]]
				!= null))
			    class96
				= aClass96Array9451[aShortArray9456[i_933_]];
			else
			    class96
				= aClass96Array9450[aShortArray9456[i_933_]];
			i_950_ = ((i * class96.anInt1159
				   + i_928_ * class96.anInt1158
				   + i_929_ * class96.anInt1156)
				  / class96.anInt1157) >> 16;
			i_951_ = i_950_ > 256 ? i_931_ : i_932_;
			i_952_ = method15097((i_930_ >> 2) + (i_951_ * i_950_
							      >> 18));
			anIntArray9461[i_933_]
			    = i_952_ << 24 | method15095(i_949_, i_936_,
							 i_952_);
		    } else if (i_934_ == 1) {
			Class107 class107 = aClass107Array9466[i_933_];
			int i_953_ = ((i * class107.anInt1315
				       + i_928_ * class107.anInt1314
				       + i_929_ * class107.anInt1313)
				      >> 16);
			int i_954_ = i_953_ > 256 ? i_931_ : i_932_;
			int i_955_
			    = method15097((i_930_ >> 2) + (i_954_ * i_953_
							   >> 18));
			anIntArray9459[i_933_]
			    = i_955_ << 24 | method15095(i_949_, i_936_,
							 i_955_);
			anIntArray9461[i_933_] = -1;
		    } else
			anIntArray9461[i_933_] = -2;
		}
	    }
	    aClass96Array9450 = null;
	    aClass96Array9451 = null;
	    aClass107Array9466 = null;
	    if ((anInt9441 & 0x97098) == 0 && aFloatArrayArray9452 == null)
		aShortArray9471 = null;
	    if (bool)
		aByteArray9467 = null;
	    anInt9432 = 2;
	}
    }
    
    int method15126(int i, short i_956_, int i_957_) {
	int i_958_ = Class661.anIntArray8549[method15096(i, i_957_)];
	Class186 class186
	    = aClass185_Sub2_9475.aClass177_2012.method2931(i_956_ & 0xffff,
							    (byte) 1);
	int i_959_ = class186.aByte2074 & 0xff;
	if (i_959_ != 0) {
	    int i_960_ = 131586 * i_957_;
	    if (i_959_ == 256)
		i_958_ = i_960_;
	    else {
		int i_961_ = i_959_;
		int i_962_ = 256 - i_959_;
		i_958_ = ((((i_960_ & 0xff00ff) * i_961_
			    + (i_958_ & 0xff00ff) * i_962_)
			   & ~0xff00ff)
			  + (((i_960_ & 0xff00) * i_961_
			      + (i_958_ & 0xff00) * i_962_)
			     & 0xff0000)) >> 8;
	    }
	}
	int i_963_ = class186.aByte2059 & 0xff;
	if (i_963_ != 0) {
	    i_963_ += 256;
	    int i_964_ = ((i_958_ & 0xff0000) >> 16) * i_963_;
	    if (i_964_ > 65535)
		i_964_ = 65535;
	    int i_965_ = ((i_958_ & 0xff00) >> 8) * i_963_;
	    if (i_965_ > 65535)
		i_965_ = 65535;
	    int i_966_ = (i_958_ & 0xff) * i_963_;
	    if (i_966_ > 65535)
		i_966_ = 65535;
	    i_958_
		= (i_964_ << 8 & 0xff0000) + (i_965_ & 0xff00) + (i_966_ >> 8);
	}
	return i_958_;
    }
    
    final void method15127(boolean bool, boolean bool_967_, boolean bool_968_,
			   int i) {
	short i_969_ = aShortArray9479[i];
	short i_970_ = aShortArray9455[i];
	short i_971_ = aShortArray9456[i];
	boolean bool_972_ = false;
	if (aShortArray9428 != null && aShortArray9428[i] != -1)
	    bool_972_ = (aClass185_Sub2_9475.aClass177_2012.method2931
			 (aShortArray9428[i] & 0xffff, (byte) 1).aBool2043);
	if (!bool_972_) {
	    if (aByteArray9469 == null)
		aClass119_9489.anInt1447 = 0;
	    else
		aClass119_9489.anInt1447 = aByteArray9469[i] & 0xff;
	    if (anIntArray9461[i] == -1)
		aClass119_9489.method2137
		    (bool, bool_967_, bool_968_, aFloatArray9496[i_969_],
		     aFloatArray9496[i_970_], aFloatArray9496[i_971_],
		     aFloatArray9503[i_969_], aFloatArray9503[i_970_],
		     aFloatArray9503[i_971_], aFloatArray9505[i_969_],
		     aFloatArray9505[i_970_], aFloatArray9505[i_971_],
		     Class415.anIntArray4666[anIntArray9459[i] & 0xffff]);
	    else
		aClass119_9489.method2139
		    (bool, bool_967_, bool_968_, aFloatArray9496[i_969_],
		     aFloatArray9496[i_970_], aFloatArray9496[i_971_],
		     aFloatArray9503[i_969_], aFloatArray9503[i_970_],
		     aFloatArray9503[i_971_], aFloatArray9505[i_969_],
		     aFloatArray9505[i_970_], aFloatArray9505[i_971_],
		     (float) (anIntArray9459[i] & 0xffff),
		     (float) (anIntArray9460[i] & 0xffff),
		     (float) (anIntArray9461[i] & 0xffff));
	} else {
	    int i_973_ = -16777216;
	    if (aByteArray9469 != null)
		i_973_ = 255 - (aByteArray9469[i] & 0xff) << 24;
	    if (anIntArray9461[i] == -1) {
		int i_974_ = i_973_ | anIntArray9459[i] & 0xffffff;
		aClass119_9489.method2166
		    (bool, bool_967_, bool_968_, aFloatArray9496[i_969_],
		     aFloatArray9496[i_970_], aFloatArray9496[i_971_],
		     aFloatArray9503[i_969_], aFloatArray9503[i_970_],
		     aFloatArray9503[i_971_], aFloatArray9505[i_969_],
		     aFloatArray9505[i_970_], aFloatArray9505[i_971_],
		     aFloatArray9506[i_969_], aFloatArray9506[i_970_],
		     aFloatArray9506[i_971_], aFloatArrayArray9452[i][0],
		     aFloatArrayArray9452[i][1], aFloatArrayArray9452[i][2],
		     aFloatArrayArray9429[i][0], aFloatArrayArray9429[i][1],
		     aFloatArrayArray9429[i][2], i_974_, i_974_, i_974_,
		     aClass101_9437.anInt1206 * 1046269871, 0.0F, 0.0F, 0.0F,
		     aShortArray9428[i] & 0xffff);
	    } else
		aClass119_9489.method2166
		    (bool, bool_967_, bool_968_, aFloatArray9496[i_969_],
		     aFloatArray9496[i_970_], aFloatArray9496[i_971_],
		     aFloatArray9503[i_969_], aFloatArray9503[i_970_],
		     aFloatArray9503[i_971_], aFloatArray9505[i_969_],
		     aFloatArray9505[i_970_], aFloatArray9505[i_971_],
		     aFloatArray9506[i_969_], aFloatArray9506[i_970_],
		     aFloatArray9506[i_971_], aFloatArrayArray9452[i][0],
		     aFloatArrayArray9452[i][1], aFloatArrayArray9452[i][2],
		     aFloatArrayArray9429[i][0], aFloatArrayArray9429[i][1],
		     aFloatArrayArray9429[i][2],
		     i_973_ | anIntArray9459[i] & 0xffffff,
		     i_973_ | anIntArray9460[i] & 0xffffff,
		     i_973_ | anIntArray9461[i] & 0xffffff,
		     aClass101_9437.anInt1206 * 1046269871, 0.0F, 0.0F, 0.0F,
		     aShortArray9428[i] & 0xffff);
	}
    }
    
    int method15128(int i, int i_975_) {
	i_975_ = i_975_ * (i & 0x7f) >> 7;
	if (i_975_ < 2)
	    i_975_ = 2;
	else if (i_975_ > 126)
	    i_975_ = 126;
	return (i & 0xff80) + i_975_;
    }
    
    public void method3120(int i) {
	if ((anInt9441 & 0x2000) != 8192)
	    throw new IllegalStateException();
	anInt9443 = i;
	anInt9432 = 0;
    }
    
    void method15129(Thread thread) {
	Class101 class101 = aClass185_Sub2_9475.method15011(thread);
	if (class101 != aClass101_9431) {
	    aClass101_9431 = class101;
	    aClass183_Sub2Array9513 = aClass101_9431.aClass183_Sub2Array1238;
	    aClass183_Sub2Array9514 = aClass101_9431.aClass183_Sub2Array1239;
	}
    }
    
    int method15130(int i) {
	if (i < 2)
	    i = 2;
	else if (i > 126)
	    i = 126;
	return i;
    }
    
    void method15131() {
	if (anInt9432 == 0)
	    method15115(false);
	else if (aClass185_Sub2_9475.anInt9367 * 442227785 > 1) {
	    synchronized (this) {
		method15098();
	    }
	} else
	    method15098();
    }
    
    void method15132() {
	if (anInt9432 == 0)
	    method15115(false);
	else if (aClass185_Sub2_9475.anInt9367 * 442227785 > 1) {
	    synchronized (this) {
		method15098();
	    }
	} else
	    method15098();
    }
    
    void method15133() {
	aClass96Array9450 = null;
	aClass96Array9451 = null;
	aClass107Array9466 = null;
	aBool9488 = false;
    }
    
    void method15134() {
	for (int i = 0; i < anInt9440; i++) {
	    short i_976_
		= aShortArray9428 != null ? aShortArray9428[i] : (short) -1;
	    if (i_976_ == -1) {
		int i_977_ = aShortArray9471[i] & 0xffff;
		int i_978_ = (i_977_ & 0x7f) * anInt9454 >> 7;
		short i_979_
		    = Class315.method5705(i_977_ & ~0x7f | i_978_, 1318952123);
		if (anIntArray9461[i] == -1) {
		    int i_980_ = anIntArray9459[i] & ~0x1ffff;
		    anIntArray9459[i]
			= i_980_ | Class146.method2452(i_979_, i_980_ >> 17,
						       -1526404410);
		} else if (anIntArray9461[i] != -2) {
		    int i_981_ = anIntArray9459[i] & ~0x1ffff;
		    anIntArray9459[i]
			= i_981_ | Class146.method2452(i_979_, i_981_ >> 17,
						       -1635149086);
		    i_981_ = anIntArray9460[i] & ~0x1ffff;
		    anIntArray9460[i]
			= i_981_ | Class146.method2452(i_979_, i_981_ >> 17,
						       -66351868);
		    i_981_ = anIntArray9461[i] & ~0x1ffff;
		    anIntArray9461[i]
			= i_981_ | Class146.method2452(i_979_, i_981_ >> 17,
						       -1703610807);
		}
	    }
	}
	anInt9432 = 2;
    }
    
    void method15135() {
	if (anInt9432 == 0)
	    method15115(false);
	else if (aClass185_Sub2_9475.anInt9367 * 442227785 > 1) {
	    synchronized (this) {
		method15098();
	    }
	} else
	    method15098();
    }
    
    public void method3063(Class183 class183, int i, int i_982_, int i_983_,
			   boolean bool) {
	Class183_Sub2 class183_sub2_984_ = (Class183_Sub2) class183;
	if ((anInt9441 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	if ((class183_sub2_984_.anInt9441 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	method15091(aClass185_Sub2_9475.method15011(Thread.currentThread()));
	method15173();
	method15092();
	class183_sub2_984_.method15173();
	class183_sub2_984_.method15092();
	anInt9501++;
	int i_985_ = 0;
	int[] is = class183_sub2_984_.anIntArray9494;
	int i_986_ = class183_sub2_984_.anInt9474;
	for (int i_987_ = 0; i_987_ < anInt9474; i_987_++) {
	    Class96 class96 = aClass96Array9450[i_987_];
	    if (class96.anInt1157 != 0) {
		int i_988_ = anIntArray9447[i_987_] - i_982_;
		if (i_988_ >= class183_sub2_984_.aShort9491
		    && i_988_ <= class183_sub2_984_.aShort9492) {
		    int i_989_ = anIntArray9494[i_987_] - i;
		    if (i_989_ >= class183_sub2_984_.aShort9493
			&& i_989_ <= class183_sub2_984_.aShort9468) {
			int i_990_ = anIntArray9448[i_987_] - i_983_;
			if (i_990_ >= class183_sub2_984_.aShort9495
			    && i_990_ <= class183_sub2_984_.aShort9449) {
			    for (int i_991_ = 0; i_991_ < i_986_; i_991_++) {
				Class96 class96_992_
				    = (class183_sub2_984_.aClass96Array9450
				       [i_991_]);
				if (i_989_ == is[i_991_]
				    && i_990_ == (class183_sub2_984_
						  .anIntArray9448[i_991_])
				    && i_988_ == (class183_sub2_984_
						  .anIntArray9447[i_991_])
				    && class96_992_.anInt1157 != 0) {
				    if (aClass96Array9451 == null)
					aClass96Array9451
					    = new Class96[anInt9474];
				    if (class183_sub2_984_.aClass96Array9451
					== null)
					class183_sub2_984_.aClass96Array9451
					    = new Class96[i_986_];
				    Class96 class96_993_
					= aClass96Array9451[i_987_];
				    if (class96_993_ == null)
					class96_993_
					    = aClass96Array9451[i_987_]
					    = new Class96(class96);
				    Class96 class96_994_
					= (class183_sub2_984_.aClass96Array9451
					   [i_991_]);
				    if (class96_994_ == null)
					class96_994_
					    = class183_sub2_984_
						  .aClass96Array9451[i_991_]
					    = new Class96(class96_992_);
				    class96_993_.anInt1159
					+= class96_992_.anInt1159;
				    class96_993_.anInt1158
					+= class96_992_.anInt1158;
				    class96_993_.anInt1156
					+= class96_992_.anInt1156;
				    class96_993_.anInt1157
					+= class96_992_.anInt1157;
				    class96_994_.anInt1159
					+= class96.anInt1159;
				    class96_994_.anInt1158
					+= class96.anInt1158;
				    class96_994_.anInt1156
					+= class96.anInt1156;
				    class96_994_.anInt1157
					+= class96.anInt1157;
				    i_985_++;
				    anIntArray9510[i_987_] = anInt9501;
				    anIntArray9511[i_991_] = anInt9501;
				}
			    }
			}
		    }
		}
	    }
	}
	if (i_985_ >= 3 && bool) {
	    for (int i_995_ = 0; i_995_ < anInt9440; i_995_++) {
		if (anIntArray9510[aShortArray9479[i_995_]] == anInt9501
		    && anIntArray9510[aShortArray9455[i_995_]] == anInt9501
		    && anIntArray9510[aShortArray9456[i_995_]] == anInt9501) {
		    if (aByteArray9467 == null)
			aByteArray9467 = new byte[anInt9440];
		    aByteArray9467[i_995_] = (byte) 2;
		}
	    }
	    for (int i_996_ = 0; i_996_ < class183_sub2_984_.anInt9440;
		 i_996_++) {
		if ((anIntArray9511[class183_sub2_984_.aShortArray9479[i_996_]]
		     == anInt9501)
		    && anIntArray9511[(class183_sub2_984_.aShortArray9455
				       [i_996_])] == anInt9501
		    && anIntArray9511[(class183_sub2_984_.aShortArray9456
				       [i_996_])] == anInt9501) {
		    if (class183_sub2_984_.aByteArray9467 == null)
			class183_sub2_984_.aByteArray9467
			    = new byte[class183_sub2_984_.anInt9440];
		    class183_sub2_984_.aByteArray9467[i_996_] = (byte) 2;
		}
	    }
	}
    }
    
    final boolean method15136(int i) {
	if (aByteArray9469 == null)
	    return false;
	if (aByteArray9469[i] == 0)
	    return false;
	return true;
    }
    
    public Class183 method3070(byte i, int i_997_, boolean bool) {
	method15171(Thread.currentThread());
	boolean bool_998_ = false;
	Class183_Sub2 class183_sub2_999_;
	Class183_Sub2 class183_sub2_1000_;
	if (i > 0 && i <= 8) {
	    class183_sub2_1000_ = aClass183_Sub2Array9514[i - 1];
	    class183_sub2_999_ = aClass183_Sub2Array9513[i - 1];
	    bool_998_ = true;
	} else
	    class183_sub2_999_ = class183_sub2_1000_
		= new Class183_Sub2(aClass185_Sub2_9475);
	return method15093(class183_sub2_999_, class183_sub2_1000_, i_997_,
			   bool_998_, bool);
    }
    
    public Class183 method3071(byte i, int i_1001_, boolean bool) {
	method15171(Thread.currentThread());
	boolean bool_1002_ = false;
	Class183_Sub2 class183_sub2_1003_;
	Class183_Sub2 class183_sub2_1004_;
	if (i > 0 && i <= 8) {
	    class183_sub2_1004_ = aClass183_Sub2Array9514[i - 1];
	    class183_sub2_1003_ = aClass183_Sub2Array9513[i - 1];
	    bool_1002_ = true;
	} else
	    class183_sub2_1003_ = class183_sub2_1004_
		= new Class183_Sub2(aClass185_Sub2_9475);
	return method15093(class183_sub2_1003_, class183_sub2_1004_, i_1001_,
			   bool_1002_, bool);
    }
    
    public void method3075(int i) {
	if ((anInt9441 & 0xd) != 13)
	    throw new IllegalStateException();
	if (aClass96Array9450 != null) {
	    if (i == 4096)
		method15108();
	    else if (i == 8192)
		method15104();
	    else if (i == 12288)
		method15105();
	    else {
		int i_1005_ = Class427.anIntArray4806[i];
		int i_1006_ = Class427.anIntArray4805[i];
		synchronized (this) {
		    for (int i_1007_ = 0; i_1007_ < anInt9474; i_1007_++) {
			int i_1008_ = ((anIntArray9448[i_1007_] * i_1005_
					+ anIntArray9494[i_1007_] * i_1006_)
				       >> 14);
			anIntArray9448[i_1007_]
			    = (anIntArray9448[i_1007_] * i_1006_
			       - anIntArray9494[i_1007_] * i_1005_) >> 14;
			anIntArray9494[i_1007_] = i_1008_;
			if (aClass96Array9450[i_1007_] != null) {
			    i_1008_ = ((aClass96Array9450[i_1007_].anInt1156
					* i_1005_)
				       + (aClass96Array9450[i_1007_].anInt1159
					  * i_1006_)) >> 14;
			    aClass96Array9450[i_1007_].anInt1156
				= ((aClass96Array9450[i_1007_].anInt1156
				    * i_1006_)
				   - (aClass96Array9450[i_1007_].anInt1159
				      * i_1005_)) >> 14;
			    aClass96Array9450[i_1007_].anInt1159 = i_1008_;
			}
		    }
		    if (aClass107Array9466 != null) {
			for (int i_1009_ = 0; i_1009_ < anInt9440; i_1009_++) {
			    if (aClass107Array9466[i_1009_] != null) {
				int i_1010_
				    = ((aClass107Array9466[i_1009_].anInt1313
					* i_1005_)
				       + (aClass107Array9466[i_1009_].anInt1315
					  * i_1006_)) >> 14;
				aClass107Array9466[i_1009_].anInt1313
				    = ((aClass107Array9466[i_1009_].anInt1313
					* i_1006_)
				       - (aClass107Array9466[i_1009_].anInt1315
					  * i_1005_)) >> 14;
				aClass107Array9466[i_1009_].anInt1315
				    = i_1010_;
			    }
			}
		    }
		    for (int i_1011_ = anInt9474; i_1011_ < anInt9444;
			 i_1011_++) {
			int i_1012_ = ((anIntArray9448[i_1011_] * i_1005_
					+ anIntArray9494[i_1011_] * i_1006_)
				       >> 14);
			anIntArray9448[i_1011_]
			    = (anIntArray9448[i_1011_] * i_1006_
			       - anIntArray9494[i_1011_] * i_1005_) >> 14;
			anIntArray9494[i_1011_] = i_1012_;
		    }
		    anInt9432 = 0;
		    aBool9488 = false;
		}
	    }
	} else
	    method3015(i);
    }
    
    public int method3072() {
	return anInt9441;
    }
    
    public boolean method3059() {
	if (aShortArray9428 == null)
	    return true;
	for (int i = 0; i < aShortArray9428.length; i++) {
	    if (aShortArray9428[i] != -1
		&& !aClass185_Sub2_9475.method15002(aShortArray9428[i]))
		return false;
	}
	return true;
    }
    
    final void method15137(boolean bool, boolean bool_1013_,
			   boolean bool_1014_, int i, boolean bool_1015_,
			   boolean bool_1016_) {
	if (anIntArray9461[i] != -2) {
	    short i_1017_ = aShortArray9479[i];
	    short i_1018_ = aShortArray9455[i];
	    short i_1019_ = aShortArray9456[i];
	    float f = aFloatArray9503[i_1017_];
	    float f_1020_ = aFloatArray9503[i_1018_];
	    float f_1021_ = aFloatArray9503[i_1019_];
	    if (!bool_1015_ || (f != -5000.0F && f_1020_ != -5000.0F
				&& f_1021_ != -5000.0F)) {
		float f_1022_ = aFloatArray9496[i_1017_];
		float f_1023_ = aFloatArray9496[i_1018_];
		float f_1024_ = aFloatArray9496[i_1019_];
		if (anIntArray9442[i] != -1
		    || ((f - f_1020_) * (f_1024_ - f_1023_)
			- (f_1022_ - f_1023_) * (f_1021_ - f_1020_)) > 0.0F) {
		    if (f < 0.0F || f_1020_ < 0.0F || f_1021_ < 0.0F
			|| f > (float) (aClass101_9437.anInt1236 * 824618691)
			|| f_1020_ > (float) (aClass101_9437.anInt1236
					      * 824618691)
			|| f_1021_ > (float) (aClass101_9437.anInt1236
					      * 824618691))
			aClass119_9489.aBool1422 = true;
		    else
			aClass119_9489.aBool1422 = false;
		    if (bool_1016_) {
			int i_1025_ = anIntArray9442[i];
			if (i_1025_ == -1
			    || !aClass118Array9485[i_1025_].aBool1419)
			    method15157(bool, bool_1013_, bool_1014_, i);
		    } else {
			int i_1026_ = anIntArray9442[i];
			if (i_1026_ != -1) {
			    Class118 class118 = aClass118Array9485[i_1026_];
			    Class117 class117 = aClass117Array9486[i_1026_];
			    if (!class118.aBool1419)
				method15113(bool, bool_1013_, bool_1014_, i);
			    aClass185_Sub2_9475.method15013
				(bool, bool_1013_, bool_1014_,
				 class117.anInt1407 * -876082967,
				 class117.anInt1412 * 61832617,
				 class117.aFloat1410,
				 class117.anInt1402 * 976146389,
				 class117.anInt1408 * 287725777,
				 class118.aShort1416,
				 class117.anInt1411 * -150900843,
				 class118.aByte1415, class118.aByte1417);
			} else
			    method15113(bool, bool_1013_, bool_1014_, i);
		    }
		}
	    }
	}
    }
    
    public int method3143() {
	if (!aBool9512)
	    method3050();
	return aShort9498;
    }
    
    public void method3076() {
	/* empty */
    }
    
    public void method3088(byte i, byte[] is) {
	if ((anInt9441 & 0x100000) == 0)
	    throw new RuntimeException();
	if (aByteArray9469 == null)
	    aByteArray9469 = new byte[anInt9440];
	if (is == null) {
	    for (int i_1027_ = 0; i_1027_ < anInt9440; i_1027_++)
		aByteArray9469[i_1027_] = i;
	} else {
	    for (int i_1028_ = 0; i_1028_ < anInt9440; i_1028_++) {
		int i_1029_ = 255 - ((255 - (is[i_1028_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		aByteArray9469[i_1028_] = (byte) i_1029_;
	    }
	}
	if (anInt9432 == 2)
	    anInt9432 = 1;
    }
    
    public void method3094() {
	/* empty */
    }
    
    Class183_Sub2(Class185_Sub2 class185_sub2) {
	anInt9444 = 0;
	anInt9474 = 0;
	anInt9440 = 0;
	anInt9453 = 0;
	anInt9432 = 0;
	aBool9477 = false;
	aBool9504 = false;
	aBool9488 = false;
	aBool9512 = false;
	aBool9499 = false;
	aBool9500 = false;
	aClass185_Sub2_9475 = class185_sub2;
    }
    
    void method15138() {
	synchronized (this) {
	    for (int i = 0; i < anInt9444; i++) {
		int i_1030_ = anIntArray9494[i];
		anIntArray9494[i] = anIntArray9448[i];
		anIntArray9448[i] = -i_1030_;
	    }
	    method15151();
	}
    }
    
    void method15139() {
	synchronized (this) {
	    for (int i = 0; i < anInt9444; i++) {
		int i_1031_ = anIntArray9494[i];
		anIntArray9494[i] = anIntArray9448[i];
		anIntArray9448[i] = -i_1031_;
	    }
	    method15151();
	}
    }
    
    void method15140() {
	synchronized (this) {
	    for (int i = 0; i < anInt9444; i++) {
		int i_1032_ = anIntArray9494[i];
		anIntArray9494[i] = anIntArray9448[i];
		anIntArray9448[i] = -i_1032_;
	    }
	    method15151();
	}
    }
    
    void method15141() {
	synchronized (this) {
	    for (int i = 0; i < anInt9444; i++) {
		anIntArray9494[i] = -anIntArray9494[i];
		anIntArray9448[i] = -anIntArray9448[i];
	    }
	    method15151();
	}
    }
    
    void method15142() {
	synchronized (this) {
	    for (int i = 0; i < anInt9444; i++) {
		int i_1033_ = anIntArray9448[i];
		anIntArray9448[i] = anIntArray9494[i];
		anIntArray9494[i] = -i_1033_;
	    }
	    method15151();
	}
    }
    
    void method15143() {
	synchronized (this) {
	    for (int i = 0; i < anInt9474; i++) {
		int i_1034_ = anIntArray9494[i];
		anIntArray9494[i] = anIntArray9448[i];
		anIntArray9448[i] = -i_1034_;
		if (aClass96Array9450[i] != null) {
		    i_1034_ = aClass96Array9450[i].anInt1159;
		    aClass96Array9450[i].anInt1159
			= aClass96Array9450[i].anInt1156;
		    aClass96Array9450[i].anInt1156 = -i_1034_;
		}
	    }
	    if (aClass107Array9466 != null) {
		for (int i = 0; i < anInt9440; i++) {
		    if (aClass107Array9466[i] != null) {
			int i_1035_ = aClass107Array9466[i].anInt1315;
			aClass107Array9466[i].anInt1315
			    = aClass107Array9466[i].anInt1313;
			aClass107Array9466[i].anInt1313 = -i_1035_;
		    }
		}
	    }
	    for (int i = anInt9474; i < anInt9444; i++) {
		int i_1036_ = anIntArray9494[i];
		anIntArray9494[i] = anIntArray9448[i];
		anIntArray9448[i] = -i_1036_;
	    }
	    anInt9432 = 0;
	    aBool9488 = false;
	}
    }
    
    public void method3014() {
	/* empty */
    }
    
    void method15144() {
	synchronized (this) {
	    for (int i = 0; i < anInt9474; i++) {
		int i_1037_ = anIntArray9494[i];
		anIntArray9494[i] = anIntArray9448[i];
		anIntArray9448[i] = -i_1037_;
		if (aClass96Array9450[i] != null) {
		    i_1037_ = aClass96Array9450[i].anInt1159;
		    aClass96Array9450[i].anInt1159
			= aClass96Array9450[i].anInt1156;
		    aClass96Array9450[i].anInt1156 = -i_1037_;
		}
	    }
	    if (aClass107Array9466 != null) {
		for (int i = 0; i < anInt9440; i++) {
		    if (aClass107Array9466[i] != null) {
			int i_1038_ = aClass107Array9466[i].anInt1315;
			aClass107Array9466[i].anInt1315
			    = aClass107Array9466[i].anInt1313;
			aClass107Array9466[i].anInt1313 = -i_1038_;
		    }
		}
	    }
	    for (int i = anInt9474; i < anInt9444; i++) {
		int i_1039_ = anIntArray9494[i];
		anIntArray9494[i] = anIntArray9448[i];
		anIntArray9448[i] = -i_1039_;
	    }
	    anInt9432 = 0;
	    aBool9488 = false;
	}
    }
    
    public void method3215(Class446 class446) {
	method15091(aClass185_Sub2_9475.method15011(Thread.currentThread()));
	Class433 class433 = aClass101_9437.aClass433_1224;
	class433.method6916(class446);
	if (aClass172Array9482 != null) {
	    for (int i = 0; i < aClass172Array9482.length; i++) {
		Class172 class172 = aClass172Array9482[i];
		Class172 class172_1040_ = class172;
		if (class172.aClass172_1809 != null)
		    class172_1040_ = class172.aClass172_1809;
		class172_1040_.anInt1815
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9494[(class172.anInt1814
							    * 1404619919)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9447
					       [(class172.anInt1814
						 * 1404619919)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9448
					       [(class172.anInt1814
						 * 1404619919)]))))
		       * -697779603);
		class172_1040_.anInt1823
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9494
					    [class172.anInt1814 * 1404619919]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9447[(class172.anInt1814
							     * 1404619919)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9448
					      [(class172.anInt1814
						* 1404619919)])))) * 880720549;
		class172_1040_.anInt1817
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9494[(class172.anInt1814
							    * 1404619919)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9447
					       [(class172.anInt1814
						 * 1404619919)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9448
					       [(class172.anInt1814
						 * 1404619919)]))))
		       * -487629419);
		class172_1040_.anInt1818
		    = (int) (class433.aFloatArray4853[12]
			     + ((class433.aFloatArray4853[0]
				 * (float) (anIntArray9494
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[4]
				   * (float) anIntArray9447[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[8]
				   * (float) (anIntArray9448
					      [(class172.anInt1812
						* 496404005)])))) * 1861716229;
		class172_1040_.anInt1808
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9494
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9447[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9448
					      [(class172.anInt1812
						* 496404005)])))) * 968631629;
		class172_1040_.anInt1819
		    = (int) (class433.aFloatArray4853[14]
			     + ((class433.aFloatArray4853[2]
				 * (float) (anIntArray9494
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[6]
				   * (float) anIntArray9447[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[10]
				   * (float) (anIntArray9448
					      [(class172.anInt1812
						* 496404005)])))) * -337212495;
		class172_1040_.anInt1821
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9494[(class172.anInt1813
							    * 1123614299)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9447
					       [(class172.anInt1813
						 * 1123614299)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9448
					       [(class172.anInt1813
						 * 1123614299)]))))
		       * -289878931);
		class172_1040_.anInt1822
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9494
					    [class172.anInt1813 * 1123614299]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9447[(class172.anInt1813
							     * 1123614299)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9448
					      [(class172.anInt1813
						* 1123614299)])))) * 286740539;
		class172_1040_.anInt1820
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9494[(class172.anInt1813
							    * 1123614299)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9447
					       [(class172.anInt1813
						 * 1123614299)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9448
					       [(class172.anInt1813
						 * 1123614299)]))))
		       * -2010684097);
	    }
	}
	if (aClass158Array9483 != null) {
	    for (int i = 0; i < aClass158Array9483.length; i++) {
		Class158 class158 = aClass158Array9483[i];
		Class158 class158_1041_ = class158;
		if (class158.aClass158_1748 != null)
		    class158_1041_ = class158.aClass158_1748;
		if (class158.aClass433_1747 != null)
		    class158.aClass433_1747.method6842(class433);
		else
		    class158.aClass433_1747 = new Class433(class433);
		class158_1041_.anInt1750
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9494[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9447
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9448
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * 1976103833);
		class158_1041_.anInt1751
		    = ((int) (class433.aFloatArray4853[13]
			      + ((class433.aFloatArray4853[1]
				  * (float) anIntArray9494[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[5]
				    * (float) (anIntArray9447
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[9]
				    * (float) (anIntArray9448
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * 1216251817);
		class158_1041_.anInt1749
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9494[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9447
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9448
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * -1645064349);
	    }
	}
    }
    
    void method15145() {
	synchronized (this) {
	    for (int i = 0; i < anInt9474; i++) {
		anIntArray9494[i] = -anIntArray9494[i];
		anIntArray9448[i] = -anIntArray9448[i];
		if (aClass96Array9450[i] != null) {
		    aClass96Array9450[i].anInt1159
			= -aClass96Array9450[i].anInt1159;
		    aClass96Array9450[i].anInt1156
			= -aClass96Array9450[i].anInt1156;
		}
	    }
	    if (aClass107Array9466 != null) {
		for (int i = 0; i < anInt9440; i++) {
		    if (aClass107Array9466[i] != null) {
			aClass107Array9466[i].anInt1315
			    = -aClass107Array9466[i].anInt1315;
			aClass107Array9466[i].anInt1313
			    = -aClass107Array9466[i].anInt1313;
		    }
		}
	    }
	    for (int i = anInt9474; i < anInt9444; i++) {
		anIntArray9494[i] = -anIntArray9494[i];
		anIntArray9448[i] = -anIntArray9448[i];
	    }
	    anInt9432 = 0;
	    aBool9488 = false;
	}
    }
    
    public void method3112(int i) {
	if ((anInt9441 & 0x6) != 6)
	    throw new IllegalStateException();
	int i_1042_ = Class427.anIntArray4806[i];
	int i_1043_ = Class427.anIntArray4805[i];
	synchronized (this) {
	    for (int i_1044_ = 0; i_1044_ < anInt9444; i_1044_++) {
		int i_1045_ = ((anIntArray9447[i_1044_] * i_1043_
				- anIntArray9448[i_1044_] * i_1042_)
			       >> 14);
		anIntArray9448[i_1044_]
		    = (anIntArray9447[i_1044_] * i_1042_
		       + anIntArray9448[i_1044_] * i_1043_) >> 14;
		anIntArray9447[i_1044_] = i_1045_;
	    }
	    method15151();
	}
    }
    
    public void method3133(Class446 class446, int i, boolean bool) {
	if (aShortArray9445 != null) {
	    Class101 class101
		= aClass185_Sub2_9475.method15011(Thread.currentThread());
	    Class446 class446_1046_ = class101.aClass446_1215;
	    class446_1046_.method7236(class446);
	    if (bool)
		class446_1046_.method7243();
	    Class433 class433 = class101.aClass433_1224;
	    class433.method6916(class446_1046_);
	    float[] fs = new float[3];
	    for (int i_1047_ = 0; i_1047_ < anInt9474; i_1047_++) {
		if ((i & aShortArray9445[i_1047_]) != 0) {
		    class433.method6850((float) anIntArray9494[i_1047_],
					(float) anIntArray9447[i_1047_],
					(float) anIntArray9448[i_1047_], fs);
		    anIntArray9494[i_1047_] = (int) fs[0];
		    anIntArray9447[i_1047_] = (int) fs[1];
		    anIntArray9448[i_1047_] = (int) fs[2];
		}
	    }
	}
    }
    
    void method15146(boolean bool) {
	if (aClass185_Sub2_9475.anInt9367 * 442227785 > 1) {
	    synchronized (this) {
		method15094(bool);
	    }
	} else
	    method15094(bool);
    }
    
    public void method3083(int i) {
	if ((anInt9441 & 0x3) != 3)
	    throw new IllegalStateException();
	int i_1048_ = Class427.anIntArray4806[i];
	int i_1049_ = Class427.anIntArray4805[i];
	synchronized (this) {
	    for (int i_1050_ = 0; i_1050_ < anInt9444; i_1050_++) {
		int i_1051_ = ((anIntArray9447[i_1050_] * i_1048_
				+ anIntArray9494[i_1050_] * i_1049_)
			       >> 14);
		anIntArray9447[i_1050_]
		    = (anIntArray9447[i_1050_] * i_1049_
		       - anIntArray9494[i_1050_] * i_1048_) >> 14;
		anIntArray9494[i_1050_] = i_1051_;
	    }
	    method15151();
	}
    }
    
    void method15147(Thread thread) {
	Class101 class101 = aClass185_Sub2_9475.method15011(thread);
	if (class101 != aClass101_9431) {
	    aClass101_9431 = class101;
	    aClass183_Sub2Array9513 = aClass101_9431.aClass183_Sub2Array1238;
	    aClass183_Sub2Array9514 = aClass101_9431.aClass183_Sub2Array1239;
	}
    }
    
    public void method3195() {
	if ((anInt9441 & 0x10) != 16)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i = 0; i < anInt9444; i++)
		anIntArray9448[i] = -anIntArray9448[i];
	    if (aClass96Array9450 != null) {
		for (int i = 0; i < anInt9474; i++) {
		    if (aClass96Array9450[i] != null)
			aClass96Array9450[i].anInt1156
			    = -aClass96Array9450[i].anInt1156;
		}
	    }
	    if (aClass96Array9451 != null) {
		for (int i = 0; i < anInt9474; i++) {
		    if (aClass96Array9451[i] != null)
			aClass96Array9451[i].anInt1156
			    = -aClass96Array9451[i].anInt1156;
		}
	    }
	    if (aClass107Array9466 != null) {
		for (int i = 0; i < anInt9440; i++) {
		    if (aClass107Array9466[i] != null)
			aClass107Array9466[i].anInt1313
			    = -aClass107Array9466[i].anInt1313;
		}
	    }
	    short[] is = aShortArray9479;
	    aShortArray9479 = aShortArray9456;
	    aShortArray9456 = is;
	    if (aFloatArrayArray9452 != null) {
		for (int i = 0; i < anInt9440; i++) {
		    if (aFloatArrayArray9452[i] != null) {
			float f = aFloatArrayArray9452[i][0];
			aFloatArrayArray9452[i][0]
			    = aFloatArrayArray9452[i][2];
			aFloatArrayArray9452[i][2] = f;
		    }
		    if (aFloatArrayArray9429[i] != null) {
			float f = aFloatArrayArray9429[i][0];
			aFloatArrayArray9429[i][0]
			    = aFloatArrayArray9429[i][2];
			aFloatArrayArray9429[i][2] = f;
		    }
		}
	    }
	    aBool9488 = false;
	    anInt9432 = 0;
	}
    }
    
    public void method3086() {
	if ((anInt9441 & 0x10) != 16)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i = 0; i < anInt9444; i++)
		anIntArray9448[i] = -anIntArray9448[i];
	    if (aClass96Array9450 != null) {
		for (int i = 0; i < anInt9474; i++) {
		    if (aClass96Array9450[i] != null)
			aClass96Array9450[i].anInt1156
			    = -aClass96Array9450[i].anInt1156;
		}
	    }
	    if (aClass96Array9451 != null) {
		for (int i = 0; i < anInt9474; i++) {
		    if (aClass96Array9451[i] != null)
			aClass96Array9451[i].anInt1156
			    = -aClass96Array9451[i].anInt1156;
		}
	    }
	    if (aClass107Array9466 != null) {
		for (int i = 0; i < anInt9440; i++) {
		    if (aClass107Array9466[i] != null)
			aClass107Array9466[i].anInt1313
			    = -aClass107Array9466[i].anInt1313;
		}
	    }
	    short[] is = aShortArray9479;
	    aShortArray9479 = aShortArray9456;
	    aShortArray9456 = is;
	    if (aFloatArrayArray9452 != null) {
		for (int i = 0; i < anInt9440; i++) {
		    if (aFloatArrayArray9452[i] != null) {
			float f = aFloatArrayArray9452[i][0];
			aFloatArrayArray9452[i][0]
			    = aFloatArrayArray9452[i][2];
			aFloatArrayArray9452[i][2] = f;
		    }
		    if (aFloatArrayArray9429[i] != null) {
			float f = aFloatArrayArray9429[i][0];
			aFloatArrayArray9429[i][0]
			    = aFloatArrayArray9429[i][2];
			aFloatArrayArray9429[i][2] = f;
		    }
		}
	    }
	    aBool9488 = false;
	    anInt9432 = 0;
	}
    }
    
    public void method3127() {
	if ((anInt9441 & 0x10) != 16)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i = 0; i < anInt9444; i++)
		anIntArray9448[i] = -anIntArray9448[i];
	    if (aClass96Array9450 != null) {
		for (int i = 0; i < anInt9474; i++) {
		    if (aClass96Array9450[i] != null)
			aClass96Array9450[i].anInt1156
			    = -aClass96Array9450[i].anInt1156;
		}
	    }
	    if (aClass96Array9451 != null) {
		for (int i = 0; i < anInt9474; i++) {
		    if (aClass96Array9451[i] != null)
			aClass96Array9451[i].anInt1156
			    = -aClass96Array9451[i].anInt1156;
		}
	    }
	    if (aClass107Array9466 != null) {
		for (int i = 0; i < anInt9440; i++) {
		    if (aClass107Array9466[i] != null)
			aClass107Array9466[i].anInt1313
			    = -aClass107Array9466[i].anInt1313;
		}
	    }
	    short[] is = aShortArray9479;
	    aShortArray9479 = aShortArray9456;
	    aShortArray9456 = is;
	    if (aFloatArrayArray9452 != null) {
		for (int i = 0; i < anInt9440; i++) {
		    if (aFloatArrayArray9452[i] != null) {
			float f = aFloatArrayArray9452[i][0];
			aFloatArrayArray9452[i][0]
			    = aFloatArrayArray9452[i][2];
			aFloatArrayArray9452[i][2] = f;
		    }
		    if (aFloatArrayArray9429[i] != null) {
			float f = aFloatArrayArray9429[i][0];
			aFloatArrayArray9429[i][0]
			    = aFloatArrayArray9429[i][2];
			aFloatArrayArray9429[i][2] = f;
		    }
		}
	    }
	    aBool9488 = false;
	    anInt9432 = 0;
	}
    }
    
    void method15148() {
	if (!aBool9488) {
	    int i = 0;
	    int i_1052_ = 0;
	    int i_1053_ = 32767;
	    int i_1054_ = 32767;
	    int i_1055_ = 32767;
	    int i_1056_ = -32768;
	    int i_1057_ = -32768;
	    int i_1058_ = -32768;
	    for (int i_1059_ = 0; i_1059_ < anInt9474; i_1059_++) {
		int i_1060_ = anIntArray9494[i_1059_];
		int i_1061_ = anIntArray9447[i_1059_];
		int i_1062_ = anIntArray9448[i_1059_];
		if (i_1060_ < i_1053_)
		    i_1053_ = i_1060_;
		if (i_1060_ > i_1056_)
		    i_1056_ = i_1060_;
		if (i_1061_ < i_1054_)
		    i_1054_ = i_1061_;
		if (i_1061_ > i_1057_)
		    i_1057_ = i_1061_;
		if (i_1062_ < i_1055_)
		    i_1055_ = i_1062_;
		if (i_1062_ > i_1058_)
		    i_1058_ = i_1062_;
		int i_1063_ = i_1060_ * i_1060_ + i_1062_ * i_1062_;
		if (i_1063_ > i)
		    i = i_1063_;
		i_1063_ += i_1061_ * i_1061_;
		if (i_1063_ > i_1052_)
		    i_1052_ = i_1063_;
	    }
	    aShort9493 = (short) i_1053_;
	    aShort9468 = (short) i_1056_;
	    aShort9491 = (short) i_1054_;
	    aShort9492 = (short) i_1057_;
	    aShort9495 = (short) i_1055_;
	    aShort9449 = (short) i_1058_;
	    aShort9473 = (short) (int) (Math.sqrt((double) i) + 0.99);
	    aShort9490 = (short) (int) (Math.sqrt((double) i_1052_) + 0.99);
	    aBool9488 = true;
	}
    }
    
    public void method3023(int i, int i_1064_, int i_1065_) {
	if (i != 128 && (anInt9441 & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_1064_ != 128 && (anInt9441 & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_1065_ != 128 && (anInt9441 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_1066_ = 0; i_1066_ < anInt9444; i_1066_++) {
		anIntArray9494[i_1066_] = anIntArray9494[i_1066_] * i >> 7;
		anIntArray9447[i_1066_]
		    = anIntArray9447[i_1066_] * i_1064_ >> 7;
		anIntArray9448[i_1066_]
		    = anIntArray9448[i_1066_] * i_1065_ >> 7;
	    }
	    aBool9488 = false;
	}
    }
    
    public Class534_Sub18_Sub16 method3097
	(Class534_Sub18_Sub16 class534_sub18_sub16) {
	return null;
    }
    
    public void method3091(int i, int i_1067_, Class151 class151,
			   Class151 class151_1068_, int i_1069_, int i_1070_,
			   int i_1071_) {
	if (i == 3) {
	    if ((anInt9441 & 0x7) != 7)
		throw new IllegalStateException();
	} else if ((anInt9441 & 0x2) != 2)
	    throw new IllegalStateException();
	if (!aBool9488)
	    method15173();
	int i_1072_ = i_1069_ + aShort9493;
	int i_1073_ = i_1069_ + aShort9468;
	int i_1074_ = i_1071_ + aShort9495;
	int i_1075_ = i_1071_ + aShort9449;
	if (i == 4 || (i_1072_ >= 0
		       && ((i_1073_ + class151.anInt1702 * 127780559
			    >> class151.anInt1703 * -1495101509)
			   < class151.anInt1701 * -1924295585)
		       && i_1074_ >= 0
		       && ((i_1075_ + class151.anInt1702 * 127780559
			    >> class151.anInt1703 * -1495101509)
			   < class151.anInt1700 * -1466328823))) {
	    int[][] is = class151.anIntArrayArray1704;
	    int[][] is_1076_ = null;
	    if (class151_1068_ != null)
		is_1076_ = class151_1068_.anIntArrayArray1704;
	    if (i == 4 || i == 5) {
		if (class151_1068_ == null
		    || (i_1072_ < 0
			|| ((i_1073_ + class151_1068_.anInt1702 * 127780559
			     >> class151_1068_.anInt1703 * -1495101509)
			    >= class151_1068_.anInt1701 * -1924295585)
			|| i_1074_ < 0
			|| ((i_1075_ + class151_1068_.anInt1702 * 127780559
			     >> class151_1068_.anInt1703 * -1495101509)
			    >= class151_1068_.anInt1700 * -1466328823)))
		    return;
	    } else {
		i_1072_ >>= class151.anInt1703 * -1495101509;
		i_1073_ = (i_1073_ + (class151.anInt1702 * 127780559 - 1)
			   >> class151.anInt1703 * -1495101509);
		i_1074_ >>= class151.anInt1703 * -1495101509;
		i_1075_ = (i_1075_ + (class151.anInt1702 * 127780559 - 1)
			   >> class151.anInt1703 * -1495101509);
		if (is[i_1072_][i_1074_] == i_1070_
		    && is[i_1073_][i_1074_] == i_1070_
		    && is[i_1072_][i_1075_] == i_1070_
		    && is[i_1073_][i_1075_] == i_1070_)
		    return;
	    }
	    synchronized (this) {
		if (i == 1) {
		    int i_1077_ = class151.anInt1702 * 127780559 - 1;
		    for (int i_1078_ = 0; i_1078_ < anInt9474; i_1078_++) {
			int i_1079_ = anIntArray9494[i_1078_] + i_1069_;
			int i_1080_ = anIntArray9448[i_1078_] + i_1071_;
			int i_1081_ = i_1079_ & i_1077_;
			int i_1082_ = i_1080_ & i_1077_;
			int i_1083_
			    = i_1079_ >> class151.anInt1703 * -1495101509;
			int i_1084_
			    = i_1080_ >> class151.anInt1703 * -1495101509;
			int i_1085_
			    = (((is[i_1083_][i_1084_]
				 * (class151.anInt1702 * 127780559 - i_1081_))
				+ is[i_1083_ + 1][i_1084_] * i_1081_)
			       >> class151.anInt1703 * -1495101509);
			int i_1086_
			    = (((is[i_1083_][i_1084_ + 1]
				 * (class151.anInt1702 * 127780559 - i_1081_))
				+ is[i_1083_ + 1][i_1084_ + 1] * i_1081_)
			       >> class151.anInt1703 * -1495101509);
			int i_1087_
			    = (i_1085_ * (class151.anInt1702 * 127780559
					  - i_1082_) + i_1086_ * i_1082_
			       >> class151.anInt1703 * -1495101509);
			anIntArray9447[i_1078_]
			    = anIntArray9447[i_1078_] + i_1087_ - i_1070_;
		    }
		    for (int i_1088_ = anInt9474; i_1088_ < anInt9444;
			 i_1088_++) {
			int i_1089_ = anIntArray9494[i_1088_] + i_1069_;
			int i_1090_ = anIntArray9448[i_1088_] + i_1071_;
			int i_1091_ = i_1089_ & i_1077_;
			int i_1092_ = i_1090_ & i_1077_;
			int i_1093_
			    = i_1089_ >> class151.anInt1703 * -1495101509;
			int i_1094_
			    = i_1090_ >> class151.anInt1703 * -1495101509;
			if (i_1093_ >= 0 && i_1093_ < is.length - 1
			    && i_1094_ >= 0 && i_1094_ < is[0].length - 1) {
			    int i_1095_
				= (((is[i_1093_][i_1094_]
				     * (class151.anInt1702 * 127780559
					- i_1091_))
				    + is[i_1093_ + 1][i_1094_] * i_1091_)
				   >> class151.anInt1703 * -1495101509);
			    int i_1096_
				= (((is[i_1093_][i_1094_ + 1]
				     * (class151.anInt1702 * 127780559
					- i_1091_))
				    + is[i_1093_ + 1][i_1094_ + 1] * i_1091_)
				   >> class151.anInt1703 * -1495101509);
			    int i_1097_
				= (i_1095_ * (class151.anInt1702 * 127780559
					      - i_1092_) + i_1096_ * i_1092_
				   >> class151.anInt1703 * -1495101509);
			    anIntArray9447[i_1088_]
				= anIntArray9447[i_1088_] + i_1097_ - i_1070_;
			}
		    }
		} else if (i == 2) {
		    if (aShort9491 == 0)
			return;
		    int i_1098_ = class151.anInt1702 * 127780559 - 1;
		    for (int i_1099_ = 0; i_1099_ < anInt9474; i_1099_++) {
			int i_1100_
			    = (anIntArray9447[i_1099_] << 16) / aShort9491;
			if (i_1100_ < i_1067_) {
			    int i_1101_ = anIntArray9494[i_1099_] + i_1069_;
			    int i_1102_ = anIntArray9448[i_1099_] + i_1071_;
			    int i_1103_ = i_1101_ & i_1098_;
			    int i_1104_ = i_1102_ & i_1098_;
			    int i_1105_
				= i_1101_ >> class151.anInt1703 * -1495101509;
			    int i_1106_
				= i_1102_ >> class151.anInt1703 * -1495101509;
			    int i_1107_
				= (((is[i_1105_][i_1106_]
				     * (class151.anInt1702 * 127780559
					- i_1103_))
				    + is[i_1105_ + 1][i_1106_] * i_1103_)
				   >> class151.anInt1703 * -1495101509);
			    int i_1108_
				= (((is[i_1105_][i_1106_ + 1]
				     * (class151.anInt1702 * 127780559
					- i_1103_))
				    + is[i_1105_ + 1][i_1106_ + 1] * i_1103_)
				   >> class151.anInt1703 * -1495101509);
			    int i_1109_
				= (i_1107_ * (class151.anInt1702 * 127780559
					      - i_1104_) + i_1108_ * i_1104_
				   >> class151.anInt1703 * -1495101509);
			    anIntArray9447[i_1099_]
				= (anIntArray9447[i_1099_]
				   + ((i_1109_ - i_1070_) * (i_1067_ - i_1100_)
				      / i_1067_));
			} else
			    anIntArray9447[i_1099_] = anIntArray9447[i_1099_];
		    }
		    for (int i_1110_ = anInt9474; i_1110_ < anInt9444;
			 i_1110_++) {
			int i_1111_
			    = (anIntArray9447[i_1110_] << 16) / aShort9491;
			if (i_1111_ < i_1067_) {
			    int i_1112_ = anIntArray9494[i_1110_] + i_1069_;
			    int i_1113_ = anIntArray9448[i_1110_] + i_1071_;
			    int i_1114_ = i_1112_ & i_1098_;
			    int i_1115_ = i_1113_ & i_1098_;
			    int i_1116_
				= i_1112_ >> class151.anInt1703 * -1495101509;
			    int i_1117_
				= i_1113_ >> class151.anInt1703 * -1495101509;
			    if (i_1116_ >= 0
				&& (i_1116_
				    < class151.anInt1701 * -1924295585 - 1)
				&& i_1117_ >= 0
				&& (i_1117_
				    < class151.anInt1700 * -1466328823 - 1)) {
				int i_1118_
				    = (((is[i_1116_][i_1117_]
					 * (class151.anInt1702 * 127780559
					    - i_1114_))
					+ is[i_1116_ + 1][i_1117_] * i_1114_)
				       >> class151.anInt1703 * -1495101509);
				int i_1119_
				    = (((is[i_1116_][i_1117_ + 1]
					 * (class151.anInt1702 * 127780559
					    - i_1114_))
					+ (is[i_1116_ + 1][i_1117_ + 1]
					   * i_1114_))
				       >> class151.anInt1703 * -1495101509);
				int i_1120_
				    = ((i_1118_
					* (class151.anInt1702 * 127780559
					   - i_1115_)) + i_1119_ * i_1115_
				       >> class151.anInt1703 * -1495101509);
				anIntArray9447[i_1110_]
				    = (anIntArray9447[i_1110_]
				       + ((i_1120_ - i_1070_)
					  * (i_1067_ - i_1111_) / i_1067_));
			    }
			} else
			    anIntArray9447[i_1110_] = anIntArray9447[i_1110_];
		    }
		} else if (i == 3) {
		    int i_1121_ = (i_1067_ & 0xff) * 16;
		    int i_1122_ = (i_1067_ >> 8 & 0xff) * 16;
		    int i_1123_ = (i_1067_ >> 16 & 0xff) << 6;
		    int i_1124_ = (i_1067_ >> 24 & 0xff) << 6;
		    if (i_1069_ - (i_1121_ >> 1) < 0
			|| ((i_1069_ + (i_1121_ >> 1)
			     + class151.anInt1702 * 127780559)
			    >= (class151.anInt1701 * -1924295585
				<< class151.anInt1703 * -1495101509))
			|| i_1071_ - (i_1122_ >> 1) < 0
			|| ((i_1071_ + (i_1122_ >> 1)
			     + class151.anInt1702 * 127780559)
			    >= (class151.anInt1700 * -1466328823
				<< class151.anInt1703 * -1495101509)))
			return;
		    method3115(class151, i_1069_, i_1070_, i_1071_, i_1121_,
			       i_1122_, i_1123_, i_1124_);
		} else if (i == 4) {
		    int i_1125_ = class151_1068_.anInt1702 * 127780559 - 1;
		    int i_1126_ = aShort9492 - aShort9491;
		    for (int i_1127_ = 0; i_1127_ < anInt9474; i_1127_++) {
			int i_1128_ = anIntArray9494[i_1127_] + i_1069_;
			int i_1129_ = anIntArray9448[i_1127_] + i_1071_;
			int i_1130_ = i_1128_ & i_1125_;
			int i_1131_ = i_1129_ & i_1125_;
			int i_1132_
			    = (i_1128_
			       >> class151_1068_.anInt1703 * -1495101509);
			int i_1133_
			    = (i_1129_
			       >> class151_1068_.anInt1703 * -1495101509);
			int i_1134_
			    = (((is_1076_[i_1132_][i_1133_]
				 * (class151_1068_.anInt1702 * 127780559
				    - i_1130_))
				+ is_1076_[i_1132_ + 1][i_1133_] * i_1130_)
			       >> class151_1068_.anInt1703 * -1495101509);
			int i_1135_
			    = (((is_1076_[i_1132_][i_1133_ + 1]
				 * (class151_1068_.anInt1702 * 127780559
				    - i_1130_))
				+ is_1076_[i_1132_ + 1][i_1133_ + 1] * i_1130_)
			       >> class151_1068_.anInt1703 * -1495101509);
			int i_1136_
			    = (i_1134_ * (class151_1068_.anInt1702 * 127780559
					  - i_1131_) + i_1135_ * i_1131_
			       >> class151_1068_.anInt1703 * -1495101509);
			anIntArray9447[i_1127_]
			    = (anIntArray9447[i_1127_] + (i_1136_ - i_1070_)
			       + i_1126_);
		    }
		    for (int i_1137_ = anInt9474; i_1137_ < anInt9444;
			 i_1137_++) {
			int i_1138_ = anIntArray9494[i_1137_] + i_1069_;
			int i_1139_ = anIntArray9448[i_1137_] + i_1071_;
			int i_1140_ = i_1138_ & i_1125_;
			int i_1141_ = i_1139_ & i_1125_;
			int i_1142_
			    = (i_1138_
			       >> class151_1068_.anInt1703 * -1495101509);
			int i_1143_
			    = (i_1139_
			       >> class151_1068_.anInt1703 * -1495101509);
			if (i_1142_ >= 0
			    && (i_1142_
				< class151_1068_.anInt1701 * -1924295585 - 1)
			    && i_1143_ >= 0
			    && i_1143_ < (class151_1068_.anInt1700
					  * -1466328823) - 1) {
			    int i_1144_
				= (((is_1076_[i_1142_][i_1143_]
				     * (class151_1068_.anInt1702 * 127780559
					- i_1140_))
				    + is_1076_[i_1142_ + 1][i_1143_] * i_1140_)
				   >> class151_1068_.anInt1703 * -1495101509);
			    int i_1145_
				= (((is_1076_[i_1142_][i_1143_ + 1]
				     * (class151_1068_.anInt1702 * 127780559
					- i_1140_))
				    + (is_1076_[i_1142_ + 1][i_1143_ + 1]
				       * i_1140_))
				   >> class151_1068_.anInt1703 * -1495101509);
			    int i_1146_
				= ((i_1144_
				    * (class151_1068_.anInt1702 * 127780559
				       - i_1141_)) + i_1145_ * i_1141_
				   >> class151_1068_.anInt1703 * -1495101509);
			    anIntArray9447[i_1137_]
				= (anIntArray9447[i_1137_]
				   + (i_1146_ - i_1070_) + i_1126_);
			}
		    }
		} else if (i == 5) {
		    int i_1147_ = class151_1068_.anInt1702 * 127780559 - 1;
		    int i_1148_ = aShort9492 - aShort9491;
		    for (int i_1149_ = 0; i_1149_ < anInt9474; i_1149_++) {
			int i_1150_ = anIntArray9494[i_1149_] + i_1069_;
			int i_1151_ = anIntArray9448[i_1149_] + i_1071_;
			int i_1152_ = i_1150_ & i_1147_;
			int i_1153_ = i_1151_ & i_1147_;
			int i_1154_
			    = i_1150_ >> class151.anInt1703 * -1495101509;
			int i_1155_
			    = i_1151_ >> class151.anInt1703 * -1495101509;
			int i_1156_
			    = (((is[i_1154_][i_1155_]
				 * (class151.anInt1702 * 127780559 - i_1152_))
				+ is[i_1154_ + 1][i_1155_] * i_1152_)
			       >> class151.anInt1703 * -1495101509);
			int i_1157_
			    = (((is[i_1154_][i_1155_ + 1]
				 * (class151.anInt1702 * 127780559 - i_1152_))
				+ is[i_1154_ + 1][i_1155_ + 1] * i_1152_)
			       >> class151.anInt1703 * -1495101509);
			int i_1158_
			    = (i_1156_ * (class151.anInt1702 * 127780559
					  - i_1153_) + i_1157_ * i_1153_
			       >> class151.anInt1703 * -1495101509);
			i_1156_ = (((is_1076_[i_1154_][i_1155_]
				     * (class151_1068_.anInt1702 * 127780559
					- i_1152_))
				    + is_1076_[i_1154_ + 1][i_1155_] * i_1152_)
				   >> class151_1068_.anInt1703 * -1495101509);
			i_1157_
			    = (((is_1076_[i_1154_][i_1155_ + 1]
				 * (class151_1068_.anInt1702 * 127780559
				    - i_1152_))
				+ is_1076_[i_1154_ + 1][i_1155_ + 1] * i_1152_)
			       >> class151_1068_.anInt1703 * -1495101509);
			int i_1159_
			    = (i_1156_ * (class151_1068_.anInt1702 * 127780559
					  - i_1153_) + i_1157_ * i_1153_
			       >> class151_1068_.anInt1703 * -1495101509);
			int i_1160_ = i_1158_ - i_1159_ - i_1067_;
			anIntArray9447[i_1149_] = ((anIntArray9447[i_1149_]
						    << 8) / i_1148_ * i_1160_
						   >> 8) - (i_1070_ - i_1158_);
		    }
		    for (int i_1161_ = anInt9474; i_1161_ < anInt9444;
			 i_1161_++) {
			int i_1162_ = anIntArray9494[i_1161_] + i_1069_;
			int i_1163_ = anIntArray9448[i_1161_] + i_1071_;
			int i_1164_ = i_1162_ & i_1147_;
			int i_1165_ = i_1163_ & i_1147_;
			int i_1166_
			    = i_1162_ >> class151.anInt1703 * -1495101509;
			int i_1167_
			    = i_1163_ >> class151.anInt1703 * -1495101509;
			if (i_1166_ >= 0
			    && i_1166_ < class151.anInt1701 * -1924295585 - 1
			    && (i_1166_
				< class151_1068_.anInt1701 * -1924295585 - 1)
			    && i_1167_ >= 0
			    && i_1167_ < class151.anInt1700 * -1466328823 - 1
			    && i_1167_ < (class151_1068_.anInt1700
					  * -1466328823) - 1) {
			    int i_1168_
				= (((is[i_1166_][i_1167_]
				     * (class151.anInt1702 * 127780559
					- i_1164_))
				    + is[i_1166_ + 1][i_1167_] * i_1164_)
				   >> class151.anInt1703 * -1495101509);
			    int i_1169_
				= (((is[i_1166_][i_1167_ + 1]
				     * (class151.anInt1702 * 127780559
					- i_1164_))
				    + is[i_1166_ + 1][i_1167_ + 1] * i_1164_)
				   >> class151.anInt1703 * -1495101509);
			    int i_1170_
				= (i_1168_ * (class151.anInt1702 * 127780559
					      - i_1165_) + i_1169_ * i_1165_
				   >> class151.anInt1703 * -1495101509);
			    i_1168_
				= (((is_1076_[i_1166_][i_1167_]
				     * (class151_1068_.anInt1702 * 127780559
					- i_1164_))
				    + is_1076_[i_1166_ + 1][i_1167_] * i_1164_)
				   >> class151_1068_.anInt1703 * -1495101509);
			    i_1169_
				= (((is_1076_[i_1166_][i_1167_ + 1]
				     * (class151_1068_.anInt1702 * 127780559
					- i_1164_))
				    + (is_1076_[i_1166_ + 1][i_1167_ + 1]
				       * i_1164_))
				   >> class151_1068_.anInt1703 * -1495101509);
			    int i_1171_
				= ((i_1168_
				    * (class151_1068_.anInt1702 * 127780559
				       - i_1165_)) + i_1169_ * i_1165_
				   >> class151_1068_.anInt1703 * -1495101509);
			    int i_1172_ = i_1170_ - i_1171_ - i_1067_;
			    anIntArray9447[i_1161_]
				= (((anIntArray9447[i_1161_] << 8) / i_1148_
				    * i_1172_)
				   >> 8) - (i_1070_ - i_1170_);
			}
		    }
		}
		aBool9488 = false;
	    }
	}
    }
    
    public void method3132(int i, int i_1173_, Class151 class151,
			   Class151 class151_1174_, int i_1175_, int i_1176_,
			   int i_1177_) {
	if (i == 3) {
	    if ((anInt9441 & 0x7) != 7)
		throw new IllegalStateException();
	} else if ((anInt9441 & 0x2) != 2)
	    throw new IllegalStateException();
	if (!aBool9488)
	    method15173();
	int i_1178_ = i_1175_ + aShort9493;
	int i_1179_ = i_1175_ + aShort9468;
	int i_1180_ = i_1177_ + aShort9495;
	int i_1181_ = i_1177_ + aShort9449;
	if (i == 4 || (i_1178_ >= 0
		       && ((i_1179_ + class151.anInt1702 * 127780559
			    >> class151.anInt1703 * -1495101509)
			   < class151.anInt1701 * -1924295585)
		       && i_1180_ >= 0
		       && ((i_1181_ + class151.anInt1702 * 127780559
			    >> class151.anInt1703 * -1495101509)
			   < class151.anInt1700 * -1466328823))) {
	    int[][] is = class151.anIntArrayArray1704;
	    int[][] is_1182_ = null;
	    if (class151_1174_ != null)
		is_1182_ = class151_1174_.anIntArrayArray1704;
	    if (i == 4 || i == 5) {
		if (class151_1174_ == null
		    || (i_1178_ < 0
			|| ((i_1179_ + class151_1174_.anInt1702 * 127780559
			     >> class151_1174_.anInt1703 * -1495101509)
			    >= class151_1174_.anInt1701 * -1924295585)
			|| i_1180_ < 0
			|| ((i_1181_ + class151_1174_.anInt1702 * 127780559
			     >> class151_1174_.anInt1703 * -1495101509)
			    >= class151_1174_.anInt1700 * -1466328823)))
		    return;
	    } else {
		i_1178_ >>= class151.anInt1703 * -1495101509;
		i_1179_ = (i_1179_ + (class151.anInt1702 * 127780559 - 1)
			   >> class151.anInt1703 * -1495101509);
		i_1180_ >>= class151.anInt1703 * -1495101509;
		i_1181_ = (i_1181_ + (class151.anInt1702 * 127780559 - 1)
			   >> class151.anInt1703 * -1495101509);
		if (is[i_1178_][i_1180_] == i_1176_
		    && is[i_1179_][i_1180_] == i_1176_
		    && is[i_1178_][i_1181_] == i_1176_
		    && is[i_1179_][i_1181_] == i_1176_)
		    return;
	    }
	    synchronized (this) {
		if (i == 1) {
		    int i_1183_ = class151.anInt1702 * 127780559 - 1;
		    for (int i_1184_ = 0; i_1184_ < anInt9474; i_1184_++) {
			int i_1185_ = anIntArray9494[i_1184_] + i_1175_;
			int i_1186_ = anIntArray9448[i_1184_] + i_1177_;
			int i_1187_ = i_1185_ & i_1183_;
			int i_1188_ = i_1186_ & i_1183_;
			int i_1189_
			    = i_1185_ >> class151.anInt1703 * -1495101509;
			int i_1190_
			    = i_1186_ >> class151.anInt1703 * -1495101509;
			int i_1191_
			    = (((is[i_1189_][i_1190_]
				 * (class151.anInt1702 * 127780559 - i_1187_))
				+ is[i_1189_ + 1][i_1190_] * i_1187_)
			       >> class151.anInt1703 * -1495101509);
			int i_1192_
			    = (((is[i_1189_][i_1190_ + 1]
				 * (class151.anInt1702 * 127780559 - i_1187_))
				+ is[i_1189_ + 1][i_1190_ + 1] * i_1187_)
			       >> class151.anInt1703 * -1495101509);
			int i_1193_
			    = (i_1191_ * (class151.anInt1702 * 127780559
					  - i_1188_) + i_1192_ * i_1188_
			       >> class151.anInt1703 * -1495101509);
			anIntArray9447[i_1184_]
			    = anIntArray9447[i_1184_] + i_1193_ - i_1176_;
		    }
		    for (int i_1194_ = anInt9474; i_1194_ < anInt9444;
			 i_1194_++) {
			int i_1195_ = anIntArray9494[i_1194_] + i_1175_;
			int i_1196_ = anIntArray9448[i_1194_] + i_1177_;
			int i_1197_ = i_1195_ & i_1183_;
			int i_1198_ = i_1196_ & i_1183_;
			int i_1199_
			    = i_1195_ >> class151.anInt1703 * -1495101509;
			int i_1200_
			    = i_1196_ >> class151.anInt1703 * -1495101509;
			if (i_1199_ >= 0 && i_1199_ < is.length - 1
			    && i_1200_ >= 0 && i_1200_ < is[0].length - 1) {
			    int i_1201_
				= (((is[i_1199_][i_1200_]
				     * (class151.anInt1702 * 127780559
					- i_1197_))
				    + is[i_1199_ + 1][i_1200_] * i_1197_)
				   >> class151.anInt1703 * -1495101509);
			    int i_1202_
				= (((is[i_1199_][i_1200_ + 1]
				     * (class151.anInt1702 * 127780559
					- i_1197_))
				    + is[i_1199_ + 1][i_1200_ + 1] * i_1197_)
				   >> class151.anInt1703 * -1495101509);
			    int i_1203_
				= (i_1201_ * (class151.anInt1702 * 127780559
					      - i_1198_) + i_1202_ * i_1198_
				   >> class151.anInt1703 * -1495101509);
			    anIntArray9447[i_1194_]
				= anIntArray9447[i_1194_] + i_1203_ - i_1176_;
			}
		    }
		} else if (i == 2) {
		    if (aShort9491 == 0)
			return;
		    int i_1204_ = class151.anInt1702 * 127780559 - 1;
		    for (int i_1205_ = 0; i_1205_ < anInt9474; i_1205_++) {
			int i_1206_
			    = (anIntArray9447[i_1205_] << 16) / aShort9491;
			if (i_1206_ < i_1173_) {
			    int i_1207_ = anIntArray9494[i_1205_] + i_1175_;
			    int i_1208_ = anIntArray9448[i_1205_] + i_1177_;
			    int i_1209_ = i_1207_ & i_1204_;
			    int i_1210_ = i_1208_ & i_1204_;
			    int i_1211_
				= i_1207_ >> class151.anInt1703 * -1495101509;
			    int i_1212_
				= i_1208_ >> class151.anInt1703 * -1495101509;
			    int i_1213_
				= (((is[i_1211_][i_1212_]
				     * (class151.anInt1702 * 127780559
					- i_1209_))
				    + is[i_1211_ + 1][i_1212_] * i_1209_)
				   >> class151.anInt1703 * -1495101509);
			    int i_1214_
				= (((is[i_1211_][i_1212_ + 1]
				     * (class151.anInt1702 * 127780559
					- i_1209_))
				    + is[i_1211_ + 1][i_1212_ + 1] * i_1209_)
				   >> class151.anInt1703 * -1495101509);
			    int i_1215_
				= (i_1213_ * (class151.anInt1702 * 127780559
					      - i_1210_) + i_1214_ * i_1210_
				   >> class151.anInt1703 * -1495101509);
			    anIntArray9447[i_1205_]
				= (anIntArray9447[i_1205_]
				   + ((i_1215_ - i_1176_) * (i_1173_ - i_1206_)
				      / i_1173_));
			} else
			    anIntArray9447[i_1205_] = anIntArray9447[i_1205_];
		    }
		    for (int i_1216_ = anInt9474; i_1216_ < anInt9444;
			 i_1216_++) {
			int i_1217_
			    = (anIntArray9447[i_1216_] << 16) / aShort9491;
			if (i_1217_ < i_1173_) {
			    int i_1218_ = anIntArray9494[i_1216_] + i_1175_;
			    int i_1219_ = anIntArray9448[i_1216_] + i_1177_;
			    int i_1220_ = i_1218_ & i_1204_;
			    int i_1221_ = i_1219_ & i_1204_;
			    int i_1222_
				= i_1218_ >> class151.anInt1703 * -1495101509;
			    int i_1223_
				= i_1219_ >> class151.anInt1703 * -1495101509;
			    if (i_1222_ >= 0
				&& (i_1222_
				    < class151.anInt1701 * -1924295585 - 1)
				&& i_1223_ >= 0
				&& (i_1223_
				    < class151.anInt1700 * -1466328823 - 1)) {
				int i_1224_
				    = (((is[i_1222_][i_1223_]
					 * (class151.anInt1702 * 127780559
					    - i_1220_))
					+ is[i_1222_ + 1][i_1223_] * i_1220_)
				       >> class151.anInt1703 * -1495101509);
				int i_1225_
				    = (((is[i_1222_][i_1223_ + 1]
					 * (class151.anInt1702 * 127780559
					    - i_1220_))
					+ (is[i_1222_ + 1][i_1223_ + 1]
					   * i_1220_))
				       >> class151.anInt1703 * -1495101509);
				int i_1226_
				    = ((i_1224_
					* (class151.anInt1702 * 127780559
					   - i_1221_)) + i_1225_ * i_1221_
				       >> class151.anInt1703 * -1495101509);
				anIntArray9447[i_1216_]
				    = (anIntArray9447[i_1216_]
				       + ((i_1226_ - i_1176_)
					  * (i_1173_ - i_1217_) / i_1173_));
			    }
			} else
			    anIntArray9447[i_1216_] = anIntArray9447[i_1216_];
		    }
		} else if (i == 3) {
		    int i_1227_ = (i_1173_ & 0xff) * 16;
		    int i_1228_ = (i_1173_ >> 8 & 0xff) * 16;
		    int i_1229_ = (i_1173_ >> 16 & 0xff) << 6;
		    int i_1230_ = (i_1173_ >> 24 & 0xff) << 6;
		    if (i_1175_ - (i_1227_ >> 1) < 0
			|| ((i_1175_ + (i_1227_ >> 1)
			     + class151.anInt1702 * 127780559)
			    >= (class151.anInt1701 * -1924295585
				<< class151.anInt1703 * -1495101509))
			|| i_1177_ - (i_1228_ >> 1) < 0
			|| ((i_1177_ + (i_1228_ >> 1)
			     + class151.anInt1702 * 127780559)
			    >= (class151.anInt1700 * -1466328823
				<< class151.anInt1703 * -1495101509)))
			return;
		    method3115(class151, i_1175_, i_1176_, i_1177_, i_1227_,
			       i_1228_, i_1229_, i_1230_);
		} else if (i == 4) {
		    int i_1231_ = class151_1174_.anInt1702 * 127780559 - 1;
		    int i_1232_ = aShort9492 - aShort9491;
		    for (int i_1233_ = 0; i_1233_ < anInt9474; i_1233_++) {
			int i_1234_ = anIntArray9494[i_1233_] + i_1175_;
			int i_1235_ = anIntArray9448[i_1233_] + i_1177_;
			int i_1236_ = i_1234_ & i_1231_;
			int i_1237_ = i_1235_ & i_1231_;
			int i_1238_
			    = (i_1234_
			       >> class151_1174_.anInt1703 * -1495101509);
			int i_1239_
			    = (i_1235_
			       >> class151_1174_.anInt1703 * -1495101509);
			int i_1240_
			    = (((is_1182_[i_1238_][i_1239_]
				 * (class151_1174_.anInt1702 * 127780559
				    - i_1236_))
				+ is_1182_[i_1238_ + 1][i_1239_] * i_1236_)
			       >> class151_1174_.anInt1703 * -1495101509);
			int i_1241_
			    = (((is_1182_[i_1238_][i_1239_ + 1]
				 * (class151_1174_.anInt1702 * 127780559
				    - i_1236_))
				+ is_1182_[i_1238_ + 1][i_1239_ + 1] * i_1236_)
			       >> class151_1174_.anInt1703 * -1495101509);
			int i_1242_
			    = (i_1240_ * (class151_1174_.anInt1702 * 127780559
					  - i_1237_) + i_1241_ * i_1237_
			       >> class151_1174_.anInt1703 * -1495101509);
			anIntArray9447[i_1233_]
			    = (anIntArray9447[i_1233_] + (i_1242_ - i_1176_)
			       + i_1232_);
		    }
		    for (int i_1243_ = anInt9474; i_1243_ < anInt9444;
			 i_1243_++) {
			int i_1244_ = anIntArray9494[i_1243_] + i_1175_;
			int i_1245_ = anIntArray9448[i_1243_] + i_1177_;
			int i_1246_ = i_1244_ & i_1231_;
			int i_1247_ = i_1245_ & i_1231_;
			int i_1248_
			    = (i_1244_
			       >> class151_1174_.anInt1703 * -1495101509);
			int i_1249_
			    = (i_1245_
			       >> class151_1174_.anInt1703 * -1495101509);
			if (i_1248_ >= 0
			    && (i_1248_
				< class151_1174_.anInt1701 * -1924295585 - 1)
			    && i_1249_ >= 0
			    && i_1249_ < (class151_1174_.anInt1700
					  * -1466328823) - 1) {
			    int i_1250_
				= (((is_1182_[i_1248_][i_1249_]
				     * (class151_1174_.anInt1702 * 127780559
					- i_1246_))
				    + is_1182_[i_1248_ + 1][i_1249_] * i_1246_)
				   >> class151_1174_.anInt1703 * -1495101509);
			    int i_1251_
				= (((is_1182_[i_1248_][i_1249_ + 1]
				     * (class151_1174_.anInt1702 * 127780559
					- i_1246_))
				    + (is_1182_[i_1248_ + 1][i_1249_ + 1]
				       * i_1246_))
				   >> class151_1174_.anInt1703 * -1495101509);
			    int i_1252_
				= ((i_1250_
				    * (class151_1174_.anInt1702 * 127780559
				       - i_1247_)) + i_1251_ * i_1247_
				   >> class151_1174_.anInt1703 * -1495101509);
			    anIntArray9447[i_1243_]
				= (anIntArray9447[i_1243_]
				   + (i_1252_ - i_1176_) + i_1232_);
			}
		    }
		} else if (i == 5) {
		    int i_1253_ = class151_1174_.anInt1702 * 127780559 - 1;
		    int i_1254_ = aShort9492 - aShort9491;
		    for (int i_1255_ = 0; i_1255_ < anInt9474; i_1255_++) {
			int i_1256_ = anIntArray9494[i_1255_] + i_1175_;
			int i_1257_ = anIntArray9448[i_1255_] + i_1177_;
			int i_1258_ = i_1256_ & i_1253_;
			int i_1259_ = i_1257_ & i_1253_;
			int i_1260_
			    = i_1256_ >> class151.anInt1703 * -1495101509;
			int i_1261_
			    = i_1257_ >> class151.anInt1703 * -1495101509;
			int i_1262_
			    = (((is[i_1260_][i_1261_]
				 * (class151.anInt1702 * 127780559 - i_1258_))
				+ is[i_1260_ + 1][i_1261_] * i_1258_)
			       >> class151.anInt1703 * -1495101509);
			int i_1263_
			    = (((is[i_1260_][i_1261_ + 1]
				 * (class151.anInt1702 * 127780559 - i_1258_))
				+ is[i_1260_ + 1][i_1261_ + 1] * i_1258_)
			       >> class151.anInt1703 * -1495101509);
			int i_1264_
			    = (i_1262_ * (class151.anInt1702 * 127780559
					  - i_1259_) + i_1263_ * i_1259_
			       >> class151.anInt1703 * -1495101509);
			i_1262_ = (((is_1182_[i_1260_][i_1261_]
				     * (class151_1174_.anInt1702 * 127780559
					- i_1258_))
				    + is_1182_[i_1260_ + 1][i_1261_] * i_1258_)
				   >> class151_1174_.anInt1703 * -1495101509);
			i_1263_
			    = (((is_1182_[i_1260_][i_1261_ + 1]
				 * (class151_1174_.anInt1702 * 127780559
				    - i_1258_))
				+ is_1182_[i_1260_ + 1][i_1261_ + 1] * i_1258_)
			       >> class151_1174_.anInt1703 * -1495101509);
			int i_1265_
			    = (i_1262_ * (class151_1174_.anInt1702 * 127780559
					  - i_1259_) + i_1263_ * i_1259_
			       >> class151_1174_.anInt1703 * -1495101509);
			int i_1266_ = i_1264_ - i_1265_ - i_1173_;
			anIntArray9447[i_1255_] = ((anIntArray9447[i_1255_]
						    << 8) / i_1254_ * i_1266_
						   >> 8) - (i_1176_ - i_1264_);
		    }
		    for (int i_1267_ = anInt9474; i_1267_ < anInt9444;
			 i_1267_++) {
			int i_1268_ = anIntArray9494[i_1267_] + i_1175_;
			int i_1269_ = anIntArray9448[i_1267_] + i_1177_;
			int i_1270_ = i_1268_ & i_1253_;
			int i_1271_ = i_1269_ & i_1253_;
			int i_1272_
			    = i_1268_ >> class151.anInt1703 * -1495101509;
			int i_1273_
			    = i_1269_ >> class151.anInt1703 * -1495101509;
			if (i_1272_ >= 0
			    && i_1272_ < class151.anInt1701 * -1924295585 - 1
			    && (i_1272_
				< class151_1174_.anInt1701 * -1924295585 - 1)
			    && i_1273_ >= 0
			    && i_1273_ < class151.anInt1700 * -1466328823 - 1
			    && i_1273_ < (class151_1174_.anInt1700
					  * -1466328823) - 1) {
			    int i_1274_
				= (((is[i_1272_][i_1273_]
				     * (class151.anInt1702 * 127780559
					- i_1270_))
				    + is[i_1272_ + 1][i_1273_] * i_1270_)
				   >> class151.anInt1703 * -1495101509);
			    int i_1275_
				= (((is[i_1272_][i_1273_ + 1]
				     * (class151.anInt1702 * 127780559
					- i_1270_))
				    + is[i_1272_ + 1][i_1273_ + 1] * i_1270_)
				   >> class151.anInt1703 * -1495101509);
			    int i_1276_
				= (i_1274_ * (class151.anInt1702 * 127780559
					      - i_1271_) + i_1275_ * i_1271_
				   >> class151.anInt1703 * -1495101509);
			    i_1274_
				= (((is_1182_[i_1272_][i_1273_]
				     * (class151_1174_.anInt1702 * 127780559
					- i_1270_))
				    + is_1182_[i_1272_ + 1][i_1273_] * i_1270_)
				   >> class151_1174_.anInt1703 * -1495101509);
			    i_1275_
				= (((is_1182_[i_1272_][i_1273_ + 1]
				     * (class151_1174_.anInt1702 * 127780559
					- i_1270_))
				    + (is_1182_[i_1272_ + 1][i_1273_ + 1]
				       * i_1270_))
				   >> class151_1174_.anInt1703 * -1495101509);
			    int i_1277_
				= ((i_1274_
				    * (class151_1174_.anInt1702 * 127780559
				       - i_1271_)) + i_1275_ * i_1271_
				   >> class151_1174_.anInt1703 * -1495101509);
			    int i_1278_ = i_1276_ - i_1277_ - i_1173_;
			    anIntArray9447[i_1267_]
				= (((anIntArray9447[i_1267_] << 8) / i_1254_
				    * i_1278_)
				   >> 8) - (i_1176_ - i_1276_);
			}
		    }
		}
		aBool9488 = false;
	    }
	}
    }
    
    public void method3093(int i, int i_1279_, Class151 class151,
			   Class151 class151_1280_, int i_1281_, int i_1282_,
			   int i_1283_) {
	if (i == 3) {
	    if ((anInt9441 & 0x7) != 7)
		throw new IllegalStateException();
	} else if ((anInt9441 & 0x2) != 2)
	    throw new IllegalStateException();
	if (!aBool9488)
	    method15173();
	int i_1284_ = i_1281_ + aShort9493;
	int i_1285_ = i_1281_ + aShort9468;
	int i_1286_ = i_1283_ + aShort9495;
	int i_1287_ = i_1283_ + aShort9449;
	if (i == 4 || (i_1284_ >= 0
		       && ((i_1285_ + class151.anInt1702 * 127780559
			    >> class151.anInt1703 * -1495101509)
			   < class151.anInt1701 * -1924295585)
		       && i_1286_ >= 0
		       && ((i_1287_ + class151.anInt1702 * 127780559
			    >> class151.anInt1703 * -1495101509)
			   < class151.anInt1700 * -1466328823))) {
	    int[][] is = class151.anIntArrayArray1704;
	    int[][] is_1288_ = null;
	    if (class151_1280_ != null)
		is_1288_ = class151_1280_.anIntArrayArray1704;
	    if (i == 4 || i == 5) {
		if (class151_1280_ == null
		    || (i_1284_ < 0
			|| ((i_1285_ + class151_1280_.anInt1702 * 127780559
			     >> class151_1280_.anInt1703 * -1495101509)
			    >= class151_1280_.anInt1701 * -1924295585)
			|| i_1286_ < 0
			|| ((i_1287_ + class151_1280_.anInt1702 * 127780559
			     >> class151_1280_.anInt1703 * -1495101509)
			    >= class151_1280_.anInt1700 * -1466328823)))
		    return;
	    } else {
		i_1284_ >>= class151.anInt1703 * -1495101509;
		i_1285_ = (i_1285_ + (class151.anInt1702 * 127780559 - 1)
			   >> class151.anInt1703 * -1495101509);
		i_1286_ >>= class151.anInt1703 * -1495101509;
		i_1287_ = (i_1287_ + (class151.anInt1702 * 127780559 - 1)
			   >> class151.anInt1703 * -1495101509);
		if (is[i_1284_][i_1286_] == i_1282_
		    && is[i_1285_][i_1286_] == i_1282_
		    && is[i_1284_][i_1287_] == i_1282_
		    && is[i_1285_][i_1287_] == i_1282_)
		    return;
	    }
	    synchronized (this) {
		if (i == 1) {
		    int i_1289_ = class151.anInt1702 * 127780559 - 1;
		    for (int i_1290_ = 0; i_1290_ < anInt9474; i_1290_++) {
			int i_1291_ = anIntArray9494[i_1290_] + i_1281_;
			int i_1292_ = anIntArray9448[i_1290_] + i_1283_;
			int i_1293_ = i_1291_ & i_1289_;
			int i_1294_ = i_1292_ & i_1289_;
			int i_1295_
			    = i_1291_ >> class151.anInt1703 * -1495101509;
			int i_1296_
			    = i_1292_ >> class151.anInt1703 * -1495101509;
			int i_1297_
			    = (((is[i_1295_][i_1296_]
				 * (class151.anInt1702 * 127780559 - i_1293_))
				+ is[i_1295_ + 1][i_1296_] * i_1293_)
			       >> class151.anInt1703 * -1495101509);
			int i_1298_
			    = (((is[i_1295_][i_1296_ + 1]
				 * (class151.anInt1702 * 127780559 - i_1293_))
				+ is[i_1295_ + 1][i_1296_ + 1] * i_1293_)
			       >> class151.anInt1703 * -1495101509);
			int i_1299_
			    = (i_1297_ * (class151.anInt1702 * 127780559
					  - i_1294_) + i_1298_ * i_1294_
			       >> class151.anInt1703 * -1495101509);
			anIntArray9447[i_1290_]
			    = anIntArray9447[i_1290_] + i_1299_ - i_1282_;
		    }
		    for (int i_1300_ = anInt9474; i_1300_ < anInt9444;
			 i_1300_++) {
			int i_1301_ = anIntArray9494[i_1300_] + i_1281_;
			int i_1302_ = anIntArray9448[i_1300_] + i_1283_;
			int i_1303_ = i_1301_ & i_1289_;
			int i_1304_ = i_1302_ & i_1289_;
			int i_1305_
			    = i_1301_ >> class151.anInt1703 * -1495101509;
			int i_1306_
			    = i_1302_ >> class151.anInt1703 * -1495101509;
			if (i_1305_ >= 0 && i_1305_ < is.length - 1
			    && i_1306_ >= 0 && i_1306_ < is[0].length - 1) {
			    int i_1307_
				= (((is[i_1305_][i_1306_]
				     * (class151.anInt1702 * 127780559
					- i_1303_))
				    + is[i_1305_ + 1][i_1306_] * i_1303_)
				   >> class151.anInt1703 * -1495101509);
			    int i_1308_
				= (((is[i_1305_][i_1306_ + 1]
				     * (class151.anInt1702 * 127780559
					- i_1303_))
				    + is[i_1305_ + 1][i_1306_ + 1] * i_1303_)
				   >> class151.anInt1703 * -1495101509);
			    int i_1309_
				= (i_1307_ * (class151.anInt1702 * 127780559
					      - i_1304_) + i_1308_ * i_1304_
				   >> class151.anInt1703 * -1495101509);
			    anIntArray9447[i_1300_]
				= anIntArray9447[i_1300_] + i_1309_ - i_1282_;
			}
		    }
		} else if (i == 2) {
		    if (aShort9491 == 0)
			return;
		    int i_1310_ = class151.anInt1702 * 127780559 - 1;
		    for (int i_1311_ = 0; i_1311_ < anInt9474; i_1311_++) {
			int i_1312_
			    = (anIntArray9447[i_1311_] << 16) / aShort9491;
			if (i_1312_ < i_1279_) {
			    int i_1313_ = anIntArray9494[i_1311_] + i_1281_;
			    int i_1314_ = anIntArray9448[i_1311_] + i_1283_;
			    int i_1315_ = i_1313_ & i_1310_;
			    int i_1316_ = i_1314_ & i_1310_;
			    int i_1317_
				= i_1313_ >> class151.anInt1703 * -1495101509;
			    int i_1318_
				= i_1314_ >> class151.anInt1703 * -1495101509;
			    int i_1319_
				= (((is[i_1317_][i_1318_]
				     * (class151.anInt1702 * 127780559
					- i_1315_))
				    + is[i_1317_ + 1][i_1318_] * i_1315_)
				   >> class151.anInt1703 * -1495101509);
			    int i_1320_
				= (((is[i_1317_][i_1318_ + 1]
				     * (class151.anInt1702 * 127780559
					- i_1315_))
				    + is[i_1317_ + 1][i_1318_ + 1] * i_1315_)
				   >> class151.anInt1703 * -1495101509);
			    int i_1321_
				= (i_1319_ * (class151.anInt1702 * 127780559
					      - i_1316_) + i_1320_ * i_1316_
				   >> class151.anInt1703 * -1495101509);
			    anIntArray9447[i_1311_]
				= (anIntArray9447[i_1311_]
				   + ((i_1321_ - i_1282_) * (i_1279_ - i_1312_)
				      / i_1279_));
			} else
			    anIntArray9447[i_1311_] = anIntArray9447[i_1311_];
		    }
		    for (int i_1322_ = anInt9474; i_1322_ < anInt9444;
			 i_1322_++) {
			int i_1323_
			    = (anIntArray9447[i_1322_] << 16) / aShort9491;
			if (i_1323_ < i_1279_) {
			    int i_1324_ = anIntArray9494[i_1322_] + i_1281_;
			    int i_1325_ = anIntArray9448[i_1322_] + i_1283_;
			    int i_1326_ = i_1324_ & i_1310_;
			    int i_1327_ = i_1325_ & i_1310_;
			    int i_1328_
				= i_1324_ >> class151.anInt1703 * -1495101509;
			    int i_1329_
				= i_1325_ >> class151.anInt1703 * -1495101509;
			    if (i_1328_ >= 0
				&& (i_1328_
				    < class151.anInt1701 * -1924295585 - 1)
				&& i_1329_ >= 0
				&& (i_1329_
				    < class151.anInt1700 * -1466328823 - 1)) {
				int i_1330_
				    = (((is[i_1328_][i_1329_]
					 * (class151.anInt1702 * 127780559
					    - i_1326_))
					+ is[i_1328_ + 1][i_1329_] * i_1326_)
				       >> class151.anInt1703 * -1495101509);
				int i_1331_
				    = (((is[i_1328_][i_1329_ + 1]
					 * (class151.anInt1702 * 127780559
					    - i_1326_))
					+ (is[i_1328_ + 1][i_1329_ + 1]
					   * i_1326_))
				       >> class151.anInt1703 * -1495101509);
				int i_1332_
				    = ((i_1330_
					* (class151.anInt1702 * 127780559
					   - i_1327_)) + i_1331_ * i_1327_
				       >> class151.anInt1703 * -1495101509);
				anIntArray9447[i_1322_]
				    = (anIntArray9447[i_1322_]
				       + ((i_1332_ - i_1282_)
					  * (i_1279_ - i_1323_) / i_1279_));
			    }
			} else
			    anIntArray9447[i_1322_] = anIntArray9447[i_1322_];
		    }
		} else if (i == 3) {
		    int i_1333_ = (i_1279_ & 0xff) * 16;
		    int i_1334_ = (i_1279_ >> 8 & 0xff) * 16;
		    int i_1335_ = (i_1279_ >> 16 & 0xff) << 6;
		    int i_1336_ = (i_1279_ >> 24 & 0xff) << 6;
		    if (i_1281_ - (i_1333_ >> 1) < 0
			|| ((i_1281_ + (i_1333_ >> 1)
			     + class151.anInt1702 * 127780559)
			    >= (class151.anInt1701 * -1924295585
				<< class151.anInt1703 * -1495101509))
			|| i_1283_ - (i_1334_ >> 1) < 0
			|| ((i_1283_ + (i_1334_ >> 1)
			     + class151.anInt1702 * 127780559)
			    >= (class151.anInt1700 * -1466328823
				<< class151.anInt1703 * -1495101509)))
			return;
		    method3115(class151, i_1281_, i_1282_, i_1283_, i_1333_,
			       i_1334_, i_1335_, i_1336_);
		} else if (i == 4) {
		    int i_1337_ = class151_1280_.anInt1702 * 127780559 - 1;
		    int i_1338_ = aShort9492 - aShort9491;
		    for (int i_1339_ = 0; i_1339_ < anInt9474; i_1339_++) {
			int i_1340_ = anIntArray9494[i_1339_] + i_1281_;
			int i_1341_ = anIntArray9448[i_1339_] + i_1283_;
			int i_1342_ = i_1340_ & i_1337_;
			int i_1343_ = i_1341_ & i_1337_;
			int i_1344_
			    = (i_1340_
			       >> class151_1280_.anInt1703 * -1495101509);
			int i_1345_
			    = (i_1341_
			       >> class151_1280_.anInt1703 * -1495101509);
			int i_1346_
			    = (((is_1288_[i_1344_][i_1345_]
				 * (class151_1280_.anInt1702 * 127780559
				    - i_1342_))
				+ is_1288_[i_1344_ + 1][i_1345_] * i_1342_)
			       >> class151_1280_.anInt1703 * -1495101509);
			int i_1347_
			    = (((is_1288_[i_1344_][i_1345_ + 1]
				 * (class151_1280_.anInt1702 * 127780559
				    - i_1342_))
				+ is_1288_[i_1344_ + 1][i_1345_ + 1] * i_1342_)
			       >> class151_1280_.anInt1703 * -1495101509);
			int i_1348_
			    = (i_1346_ * (class151_1280_.anInt1702 * 127780559
					  - i_1343_) + i_1347_ * i_1343_
			       >> class151_1280_.anInt1703 * -1495101509);
			anIntArray9447[i_1339_]
			    = (anIntArray9447[i_1339_] + (i_1348_ - i_1282_)
			       + i_1338_);
		    }
		    for (int i_1349_ = anInt9474; i_1349_ < anInt9444;
			 i_1349_++) {
			int i_1350_ = anIntArray9494[i_1349_] + i_1281_;
			int i_1351_ = anIntArray9448[i_1349_] + i_1283_;
			int i_1352_ = i_1350_ & i_1337_;
			int i_1353_ = i_1351_ & i_1337_;
			int i_1354_
			    = (i_1350_
			       >> class151_1280_.anInt1703 * -1495101509);
			int i_1355_
			    = (i_1351_
			       >> class151_1280_.anInt1703 * -1495101509);
			if (i_1354_ >= 0
			    && (i_1354_
				< class151_1280_.anInt1701 * -1924295585 - 1)
			    && i_1355_ >= 0
			    && i_1355_ < (class151_1280_.anInt1700
					  * -1466328823) - 1) {
			    int i_1356_
				= (((is_1288_[i_1354_][i_1355_]
				     * (class151_1280_.anInt1702 * 127780559
					- i_1352_))
				    + is_1288_[i_1354_ + 1][i_1355_] * i_1352_)
				   >> class151_1280_.anInt1703 * -1495101509);
			    int i_1357_
				= (((is_1288_[i_1354_][i_1355_ + 1]
				     * (class151_1280_.anInt1702 * 127780559
					- i_1352_))
				    + (is_1288_[i_1354_ + 1][i_1355_ + 1]
				       * i_1352_))
				   >> class151_1280_.anInt1703 * -1495101509);
			    int i_1358_
				= ((i_1356_
				    * (class151_1280_.anInt1702 * 127780559
				       - i_1353_)) + i_1357_ * i_1353_
				   >> class151_1280_.anInt1703 * -1495101509);
			    anIntArray9447[i_1349_]
				= (anIntArray9447[i_1349_]
				   + (i_1358_ - i_1282_) + i_1338_);
			}
		    }
		} else if (i == 5) {
		    int i_1359_ = class151_1280_.anInt1702 * 127780559 - 1;
		    int i_1360_ = aShort9492 - aShort9491;
		    for (int i_1361_ = 0; i_1361_ < anInt9474; i_1361_++) {
			int i_1362_ = anIntArray9494[i_1361_] + i_1281_;
			int i_1363_ = anIntArray9448[i_1361_] + i_1283_;
			int i_1364_ = i_1362_ & i_1359_;
			int i_1365_ = i_1363_ & i_1359_;
			int i_1366_
			    = i_1362_ >> class151.anInt1703 * -1495101509;
			int i_1367_
			    = i_1363_ >> class151.anInt1703 * -1495101509;
			int i_1368_
			    = (((is[i_1366_][i_1367_]
				 * (class151.anInt1702 * 127780559 - i_1364_))
				+ is[i_1366_ + 1][i_1367_] * i_1364_)
			       >> class151.anInt1703 * -1495101509);
			int i_1369_
			    = (((is[i_1366_][i_1367_ + 1]
				 * (class151.anInt1702 * 127780559 - i_1364_))
				+ is[i_1366_ + 1][i_1367_ + 1] * i_1364_)
			       >> class151.anInt1703 * -1495101509);
			int i_1370_
			    = (i_1368_ * (class151.anInt1702 * 127780559
					  - i_1365_) + i_1369_ * i_1365_
			       >> class151.anInt1703 * -1495101509);
			i_1368_ = (((is_1288_[i_1366_][i_1367_]
				     * (class151_1280_.anInt1702 * 127780559
					- i_1364_))
				    + is_1288_[i_1366_ + 1][i_1367_] * i_1364_)
				   >> class151_1280_.anInt1703 * -1495101509);
			i_1369_
			    = (((is_1288_[i_1366_][i_1367_ + 1]
				 * (class151_1280_.anInt1702 * 127780559
				    - i_1364_))
				+ is_1288_[i_1366_ + 1][i_1367_ + 1] * i_1364_)
			       >> class151_1280_.anInt1703 * -1495101509);
			int i_1371_
			    = (i_1368_ * (class151_1280_.anInt1702 * 127780559
					  - i_1365_) + i_1369_ * i_1365_
			       >> class151_1280_.anInt1703 * -1495101509);
			int i_1372_ = i_1370_ - i_1371_ - i_1279_;
			anIntArray9447[i_1361_] = ((anIntArray9447[i_1361_]
						    << 8) / i_1360_ * i_1372_
						   >> 8) - (i_1282_ - i_1370_);
		    }
		    for (int i_1373_ = anInt9474; i_1373_ < anInt9444;
			 i_1373_++) {
			int i_1374_ = anIntArray9494[i_1373_] + i_1281_;
			int i_1375_ = anIntArray9448[i_1373_] + i_1283_;
			int i_1376_ = i_1374_ & i_1359_;
			int i_1377_ = i_1375_ & i_1359_;
			int i_1378_
			    = i_1374_ >> class151.anInt1703 * -1495101509;
			int i_1379_
			    = i_1375_ >> class151.anInt1703 * -1495101509;
			if (i_1378_ >= 0
			    && i_1378_ < class151.anInt1701 * -1924295585 - 1
			    && (i_1378_
				< class151_1280_.anInt1701 * -1924295585 - 1)
			    && i_1379_ >= 0
			    && i_1379_ < class151.anInt1700 * -1466328823 - 1
			    && i_1379_ < (class151_1280_.anInt1700
					  * -1466328823) - 1) {
			    int i_1380_
				= (((is[i_1378_][i_1379_]
				     * (class151.anInt1702 * 127780559
					- i_1376_))
				    + is[i_1378_ + 1][i_1379_] * i_1376_)
				   >> class151.anInt1703 * -1495101509);
			    int i_1381_
				= (((is[i_1378_][i_1379_ + 1]
				     * (class151.anInt1702 * 127780559
					- i_1376_))
				    + is[i_1378_ + 1][i_1379_ + 1] * i_1376_)
				   >> class151.anInt1703 * -1495101509);
			    int i_1382_
				= (i_1380_ * (class151.anInt1702 * 127780559
					      - i_1377_) + i_1381_ * i_1377_
				   >> class151.anInt1703 * -1495101509);
			    i_1380_
				= (((is_1288_[i_1378_][i_1379_]
				     * (class151_1280_.anInt1702 * 127780559
					- i_1376_))
				    + is_1288_[i_1378_ + 1][i_1379_] * i_1376_)
				   >> class151_1280_.anInt1703 * -1495101509);
			    i_1381_
				= (((is_1288_[i_1378_][i_1379_ + 1]
				     * (class151_1280_.anInt1702 * 127780559
					- i_1376_))
				    + (is_1288_[i_1378_ + 1][i_1379_ + 1]
				       * i_1376_))
				   >> class151_1280_.anInt1703 * -1495101509);
			    int i_1383_
				= ((i_1380_
				    * (class151_1280_.anInt1702 * 127780559
				       - i_1377_)) + i_1381_ * i_1377_
				   >> class151_1280_.anInt1703 * -1495101509);
			    int i_1384_ = i_1382_ - i_1383_ - i_1279_;
			    anIntArray9447[i_1373_]
				= (((anIntArray9447[i_1373_] << 8) / i_1360_
				    * i_1384_)
				   >> 8) - (i_1282_ - i_1382_);
			}
		    }
		}
		aBool9488 = false;
	    }
	}
    }
    
    void method15149() {
	synchronized (this) {
	    for (int i = 0; i < anInt9474; i++) {
		anIntArray9494[i] = -anIntArray9494[i];
		anIntArray9448[i] = -anIntArray9448[i];
		if (aClass96Array9450[i] != null) {
		    aClass96Array9450[i].anInt1159
			= -aClass96Array9450[i].anInt1159;
		    aClass96Array9450[i].anInt1156
			= -aClass96Array9450[i].anInt1156;
		}
	    }
	    if (aClass107Array9466 != null) {
		for (int i = 0; i < anInt9440; i++) {
		    if (aClass107Array9466[i] != null) {
			aClass107Array9466[i].anInt1315
			    = -aClass107Array9466[i].anInt1315;
			aClass107Array9466[i].anInt1313
			    = -aClass107Array9466[i].anInt1313;
		    }
		}
	    }
	    for (int i = anInt9474; i < anInt9444; i++) {
		anIntArray9494[i] = -anIntArray9494[i];
		anIntArray9448[i] = -anIntArray9448[i];
	    }
	    anInt9432 = 0;
	    aBool9488 = false;
	}
    }
    
    void method15150() {
	aClass96Array9450 = null;
	aClass96Array9451 = null;
	aClass107Array9466 = null;
	aBool9488 = false;
    }
    
    public void method3154(short i, short i_1385_) {
	for (int i_1386_ = 0; i_1386_ < anInt9440; i_1386_++) {
	    if (aShortArray9471[i_1386_] == i)
		aShortArray9471[i_1386_] = i_1385_;
	}
	if (aClass118Array9485 != null) {
	    for (int i_1387_ = 0; i_1387_ < anInt9484; i_1387_++) {
		Class118 class118 = aClass118Array9485[i_1387_];
		Class117 class117 = aClass117Array9486[i_1387_];
		class117.anInt1411
		    = (class117.anInt1411 * -150900843 & ~0xffffff
		       | ((Class415.anIntArray4666
			   [Class315.method5705((aShortArray9471
						 [(class118.anInt1418
						   * 2118166057)]),
						2026416428) & 0xffff])
			  & 0xffffff)) * 874668989;
	    }
	}
	if (anInt9432 == 2)
	    anInt9432 = 1;
    }
    
    boolean method3066() {
	if (anIntArrayArray9470 == null)
	    return false;
	anInt9458 = 0;
	anInt9481 = 0;
	anInt9465 = 0;
	return true;
    }
    
    void method3162() {
	if (aBool9477) {
	    for (int i = 0; i < anInt9444; i++) {
		anIntArray9494[i] = anIntArray9494[i] + 7 >> 4;
		anIntArray9447[i] = anIntArray9447[i] + 7 >> 4;
		anIntArray9448[i] = anIntArray9448[i] + 7 >> 4;
	    }
	    aBool9477 = false;
	}
	if (aBool9476) {
	    method15135();
	    aBool9476 = false;
	}
	aBool9488 = false;
    }
    
    void method3106() {
	if (aBool9477) {
	    for (int i = 0; i < anInt9444; i++) {
		anIntArray9494[i] = anIntArray9494[i] + 7 >> 4;
		anIntArray9447[i] = anIntArray9447[i] + 7 >> 4;
		anIntArray9448[i] = anIntArray9448[i] + 7 >> 4;
	    }
	    aBool9477 = false;
	}
	if (aBool9476) {
	    method15135();
	    aBool9476 = false;
	}
	aBool9488 = false;
    }
    
    void method3036() {
	if (aBool9477) {
	    for (int i = 0; i < anInt9444; i++) {
		anIntArray9494[i] = anIntArray9494[i] + 7 >> 4;
		anIntArray9447[i] = anIntArray9447[i] + 7 >> 4;
		anIntArray9448[i] = anIntArray9448[i] + 7 >> 4;
	    }
	    aBool9477 = false;
	}
	if (aBool9476) {
	    method15135();
	    aBool9476 = false;
	}
	aBool9488 = false;
    }
    
    void method3031(int i, int[] is, int i_1388_, int i_1389_, int i_1390_,
		    int i_1391_, boolean bool) {
	int i_1392_ = is.length;
	if (i == 0) {
	    i_1388_ <<= 4;
	    i_1389_ <<= 4;
	    i_1390_ <<= 4;
	    if (!aBool9477) {
		for (int i_1393_ = 0; i_1393_ < anInt9444; i_1393_++) {
		    anIntArray9494[i_1393_] <<= 4;
		    anIntArray9447[i_1393_] <<= 4;
		    anIntArray9448[i_1393_] <<= 4;
		}
		aBool9477 = true;
	    }
	    int i_1394_ = 0;
	    anInt9458 = 0;
	    anInt9481 = 0;
	    anInt9465 = 0;
	    for (int i_1395_ = 0; i_1395_ < i_1392_; i_1395_++) {
		int i_1396_ = is[i_1395_];
		if (i_1396_ < anIntArrayArray9470.length) {
		    int[] is_1397_ = anIntArrayArray9470[i_1396_];
		    for (int i_1398_ = 0; i_1398_ < is_1397_.length;
			 i_1398_++) {
			int i_1399_ = is_1397_[i_1398_];
			anInt9458 += anIntArray9494[i_1399_];
			anInt9481 += anIntArray9447[i_1399_];
			anInt9465 += anIntArray9448[i_1399_];
			i_1394_++;
		    }
		}
	    }
	    if (i_1394_ > 0) {
		anInt9458 = anInt9458 / i_1394_ + i_1388_;
		anInt9481 = anInt9481 / i_1394_ + i_1389_;
		anInt9465 = anInt9465 / i_1394_ + i_1390_;
	    } else {
		anInt9458 = i_1388_;
		anInt9481 = i_1389_;
		anInt9465 = i_1390_;
	    }
	} else if (i == 1) {
	    i_1388_ <<= 4;
	    i_1389_ <<= 4;
	    i_1390_ <<= 4;
	    if (!aBool9477) {
		for (int i_1400_ = 0; i_1400_ < anInt9444; i_1400_++) {
		    anIntArray9494[i_1400_] <<= 4;
		    anIntArray9447[i_1400_] <<= 4;
		    anIntArray9448[i_1400_] <<= 4;
		}
		aBool9477 = true;
	    }
	    for (int i_1401_ = 0; i_1401_ < i_1392_; i_1401_++) {
		int i_1402_ = is[i_1401_];
		if (i_1402_ < anIntArrayArray9470.length) {
		    int[] is_1403_ = anIntArrayArray9470[i_1402_];
		    for (int i_1404_ = 0; i_1404_ < is_1403_.length;
			 i_1404_++) {
			int i_1405_ = is_1403_[i_1404_];
			anIntArray9494[i_1405_] += i_1388_;
			anIntArray9447[i_1405_] += i_1389_;
			anIntArray9448[i_1405_] += i_1390_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_1406_ = 0; i_1406_ < i_1392_; i_1406_++) {
		int i_1407_ = is[i_1406_];
		if (i_1407_ < anIntArrayArray9470.length) {
		    int[] is_1408_ = anIntArrayArray9470[i_1407_];
		    if ((i_1391_ & 0x1) == 0) {
			for (int i_1409_ = 0; i_1409_ < is_1408_.length;
			     i_1409_++) {
			    int i_1410_ = is_1408_[i_1409_];
			    anIntArray9494[i_1410_] -= anInt9458;
			    anIntArray9447[i_1410_] -= anInt9481;
			    anIntArray9448[i_1410_] -= anInt9465;
			    if (i_1390_ != 0) {
				int i_1411_ = Class427.anIntArray4806[i_1390_];
				int i_1412_ = Class427.anIntArray4805[i_1390_];
				int i_1413_
				    = ((anIntArray9447[i_1410_] * i_1411_
					+ anIntArray9494[i_1410_] * i_1412_
					+ 16383)
				       >> 14);
				anIntArray9447[i_1410_]
				    = (anIntArray9447[i_1410_] * i_1412_
				       - anIntArray9494[i_1410_] * i_1411_
				       + 16383) >> 14;
				anIntArray9494[i_1410_] = i_1413_;
			    }
			    if (i_1388_ != 0) {
				int i_1414_ = Class427.anIntArray4806[i_1388_];
				int i_1415_ = Class427.anIntArray4805[i_1388_];
				int i_1416_
				    = ((anIntArray9447[i_1410_] * i_1415_
					- anIntArray9448[i_1410_] * i_1414_
					+ 16383)
				       >> 14);
				anIntArray9448[i_1410_]
				    = (anIntArray9447[i_1410_] * i_1414_
				       + anIntArray9448[i_1410_] * i_1415_
				       + 16383) >> 14;
				anIntArray9447[i_1410_] = i_1416_;
			    }
			    if (i_1389_ != 0) {
				int i_1417_ = Class427.anIntArray4806[i_1389_];
				int i_1418_ = Class427.anIntArray4805[i_1389_];
				int i_1419_
				    = ((anIntArray9448[i_1410_] * i_1417_
					+ anIntArray9494[i_1410_] * i_1418_
					+ 16383)
				       >> 14);
				anIntArray9448[i_1410_]
				    = (anIntArray9448[i_1410_] * i_1418_
				       - anIntArray9494[i_1410_] * i_1417_
				       + 16383) >> 14;
				anIntArray9494[i_1410_] = i_1419_;
			    }
			    anIntArray9494[i_1410_] += anInt9458;
			    anIntArray9447[i_1410_] += anInt9481;
			    anIntArray9448[i_1410_] += anInt9465;
			}
		    } else {
			for (int i_1420_ = 0; i_1420_ < is_1408_.length;
			     i_1420_++) {
			    int i_1421_ = is_1408_[i_1420_];
			    anIntArray9494[i_1421_] -= anInt9458;
			    anIntArray9447[i_1421_] -= anInt9481;
			    anIntArray9448[i_1421_] -= anInt9465;
			    if (i_1388_ != 0) {
				int i_1422_ = Class427.anIntArray4806[i_1388_];
				int i_1423_ = Class427.anIntArray4805[i_1388_];
				int i_1424_
				    = ((anIntArray9447[i_1421_] * i_1423_
					- anIntArray9448[i_1421_] * i_1422_
					+ 16383)
				       >> 14);
				anIntArray9448[i_1421_]
				    = (anIntArray9447[i_1421_] * i_1422_
				       + anIntArray9448[i_1421_] * i_1423_
				       + 16383) >> 14;
				anIntArray9447[i_1421_] = i_1424_;
			    }
			    if (i_1390_ != 0) {
				int i_1425_ = Class427.anIntArray4806[i_1390_];
				int i_1426_ = Class427.anIntArray4805[i_1390_];
				int i_1427_
				    = ((anIntArray9447[i_1421_] * i_1425_
					+ anIntArray9494[i_1421_] * i_1426_
					+ 16383)
				       >> 14);
				anIntArray9447[i_1421_]
				    = (anIntArray9447[i_1421_] * i_1426_
				       - anIntArray9494[i_1421_] * i_1425_
				       + 16383) >> 14;
				anIntArray9494[i_1421_] = i_1427_;
			    }
			    if (i_1389_ != 0) {
				int i_1428_ = Class427.anIntArray4806[i_1389_];
				int i_1429_ = Class427.anIntArray4805[i_1389_];
				int i_1430_
				    = ((anIntArray9448[i_1421_] * i_1428_
					+ anIntArray9494[i_1421_] * i_1429_
					+ 16383)
				       >> 14);
				anIntArray9448[i_1421_]
				    = (anIntArray9448[i_1421_] * i_1429_
				       - anIntArray9494[i_1421_] * i_1428_
				       + 16383) >> 14;
				anIntArray9494[i_1421_] = i_1430_;
			    }
			    anIntArray9494[i_1421_] += anInt9458;
			    anIntArray9447[i_1421_] += anInt9481;
			    anIntArray9448[i_1421_] += anInt9465;
			}
		    }
		}
	    }
	} else if (i == 3) {
	    for (int i_1431_ = 0; i_1431_ < i_1392_; i_1431_++) {
		int i_1432_ = is[i_1431_];
		if (i_1432_ < anIntArrayArray9470.length) {
		    int[] is_1433_ = anIntArrayArray9470[i_1432_];
		    for (int i_1434_ = 0; i_1434_ < is_1433_.length;
			 i_1434_++) {
			int i_1435_ = is_1433_[i_1434_];
			anIntArray9494[i_1435_] -= anInt9458;
			anIntArray9447[i_1435_] -= anInt9481;
			anIntArray9448[i_1435_] -= anInt9465;
			anIntArray9494[i_1435_]
			    = anIntArray9494[i_1435_] * i_1388_ / 128;
			anIntArray9447[i_1435_]
			    = anIntArray9447[i_1435_] * i_1389_ / 128;
			anIntArray9448[i_1435_]
			    = anIntArray9448[i_1435_] * i_1390_ / 128;
			anIntArray9494[i_1435_] += anInt9458;
			anIntArray9447[i_1435_] += anInt9481;
			anIntArray9448[i_1435_] += anInt9465;
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9457 != null && aByteArray9469 != null) {
		for (int i_1436_ = 0; i_1436_ < i_1392_; i_1436_++) {
		    int i_1437_ = is[i_1436_];
		    if (i_1437_ < anIntArrayArray9457.length) {
			int[] is_1438_ = anIntArrayArray9457[i_1437_];
			for (int i_1439_ = 0; i_1439_ < is_1438_.length;
			     i_1439_++) {
			    int i_1440_ = is_1438_[i_1439_];
			    int i_1441_ = ((aByteArray9469[i_1440_] & 0xff)
					   + i_1388_ * 8);
			    if (i_1441_ < 0)
				i_1441_ = 0;
			    else if (i_1441_ > 255)
				i_1441_ = 255;
			    aByteArray9469[i_1440_] = (byte) i_1441_;
			}
		    }
		}
		if (aClass118Array9485 != null) {
		    for (int i_1442_ = 0; i_1442_ < anInt9484; i_1442_++) {
			Class118 class118 = aClass118Array9485[i_1442_];
			Class117 class117 = aClass117Array9486[i_1442_];
			class117.anInt1411
			    = (class117.anInt1411 * -150900843 & 0xffffff
			       | 255 - ((aByteArray9469
					 [class118.anInt1418 * 2118166057])
					& 0xff) << 24) * 874668989;
		    }
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9457 != null) {
		for (int i_1443_ = 0; i_1443_ < i_1392_; i_1443_++) {
		    int i_1444_ = is[i_1443_];
		    if (i_1444_ < anIntArrayArray9457.length) {
			int[] is_1445_ = anIntArrayArray9457[i_1444_];
			for (int i_1446_ = 0; i_1446_ < is_1445_.length;
			     i_1446_++) {
			    int i_1447_ = is_1445_[i_1446_];
			    int i_1448_ = aShortArray9471[i_1447_] & 0xffff;
			    int i_1449_ = i_1448_ >> 10 & 0x3f;
			    int i_1450_ = i_1448_ >> 7 & 0x7;
			    int i_1451_ = i_1448_ & 0x7f;
			    i_1449_ = i_1449_ + i_1388_ & 0x3f;
			    i_1450_ += i_1389_;
			    if (i_1450_ < 0)
				i_1450_ = 0;
			    else if (i_1450_ > 7)
				i_1450_ = 7;
			    i_1451_ += i_1390_;
			    if (i_1451_ < 0)
				i_1451_ = 0;
			    else if (i_1451_ > 127)
				i_1451_ = 127;
			    aShortArray9471[i_1447_]
				= (short) (i_1449_ << 10 | i_1450_ << 7
					   | i_1451_);
			}
			aBool9476 = true;
		    }
		}
		if (aClass118Array9485 != null) {
		    for (int i_1452_ = 0; i_1452_ < anInt9484; i_1452_++) {
			Class118 class118 = aClass118Array9485[i_1452_];
			Class117 class117 = aClass117Array9486[i_1452_];
			class117.anInt1411
			    = (class117.anInt1411 * -150900843 & ~0xffffff
			       | ((Class415.anIntArray4666
				   [Class315.method5705(((aShortArray9471
							  [(class118.anInt1418
							    * 2118166057)])
							 & 0xffff),
							1098280681) & 0xffff])
				  & 0xffffff)) * 874668989;
		    }
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9487 != null) {
		for (int i_1453_ = 0; i_1453_ < i_1392_; i_1453_++) {
		    int i_1454_ = is[i_1453_];
		    if (i_1454_ < anIntArrayArray9487.length) {
			int[] is_1455_ = anIntArrayArray9487[i_1454_];
			for (int i_1456_ = 0; i_1456_ < is_1455_.length;
			     i_1456_++) {
			    Class117 class117
				= aClass117Array9486[is_1455_[i_1456_]];
			    class117.anInt1405 += i_1388_ * 1831486073;
			    class117.anInt1406 += i_1389_ * -108929861;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9487 != null) {
		for (int i_1457_ = 0; i_1457_ < i_1392_; i_1457_++) {
		    int i_1458_ = is[i_1457_];
		    if (i_1458_ < anIntArrayArray9487.length) {
			int[] is_1459_ = anIntArrayArray9487[i_1458_];
			for (int i_1460_ = 0; i_1460_ < is_1459_.length;
			     i_1460_++) {
			    Class117 class117
				= aClass117Array9486[is_1459_[i_1460_]];
			    class117.aFloat1403 = (class117.aFloat1403
						   * (float) i_1388_ / 128.0F);
			    class117.aFloat1404 = (class117.aFloat1404
						   * (float) i_1389_ / 128.0F);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9487 != null) {
		for (int i_1461_ = 0; i_1461_ < i_1392_; i_1461_++) {
		    int i_1462_ = is[i_1461_];
		    if (i_1462_ < anIntArrayArray9487.length) {
			int[] is_1463_ = anIntArrayArray9487[i_1462_];
			for (int i_1464_ = 0; i_1464_ < is_1463_.length;
			     i_1464_++) {
			    Class117 class117
				= aClass117Array9486[is_1463_[i_1464_]];
			    class117.anInt1409
				= (class117.anInt1409 * -133325595 + i_1388_
				   & 0x3fff) * 1832042733;
			}
		    }
		}
	    }
	}
    }
    
    public int method3210() {
	if (!aBool9488)
	    method15173();
	return aShort9495;
    }
    
    void method15151() {
	aClass96Array9450 = null;
	aClass96Array9451 = null;
	aClass107Array9466 = null;
	aBool9488 = false;
    }
    
    void method3121(int i, int[] is, int i_1465_, int i_1466_, int i_1467_,
		    boolean bool, int i_1468_, int[] is_1469_) {
	int i_1470_ = is.length;
	if (i == 0) {
	    i_1465_ <<= 4;
	    i_1466_ <<= 4;
	    i_1467_ <<= 4;
	    if (!aBool9477) {
		for (int i_1471_ = 0; i_1471_ < anInt9444; i_1471_++) {
		    anIntArray9494[i_1471_] <<= 4;
		    anIntArray9447[i_1471_] <<= 4;
		    anIntArray9448[i_1471_] <<= 4;
		}
		aBool9477 = true;
	    }
	    int i_1472_ = 0;
	    anInt9458 = 0;
	    anInt9481 = 0;
	    anInt9465 = 0;
	    for (int i_1473_ = 0; i_1473_ < i_1470_; i_1473_++) {
		int i_1474_ = is[i_1473_];
		if (i_1474_ < anIntArrayArray9470.length) {
		    int[] is_1475_ = anIntArrayArray9470[i_1474_];
		    for (int i_1476_ = 0; i_1476_ < is_1475_.length;
			 i_1476_++) {
			int i_1477_ = is_1475_[i_1476_];
			if (aShortArray9445 == null
			    || (i_1468_ & aShortArray9445[i_1477_]) != 0) {
			    anInt9458 += anIntArray9494[i_1477_];
			    anInt9481 += anIntArray9447[i_1477_];
			    anInt9465 += anIntArray9448[i_1477_];
			    i_1472_++;
			}
		    }
		}
	    }
	    if (i_1472_ > 0) {
		anInt9458 = anInt9458 / i_1472_ + i_1465_;
		anInt9481 = anInt9481 / i_1472_ + i_1466_;
		anInt9465 = anInt9465 / i_1472_ + i_1467_;
		aBool9504 = true;
	    } else {
		anInt9458 = i_1465_;
		anInt9481 = i_1466_;
		anInt9465 = i_1467_;
	    }
	} else if (i == 1) {
	    if (is_1469_ != null) {
		int i_1478_ = ((is_1469_[0] * i_1465_ + is_1469_[1] * i_1466_
				+ is_1469_[2] * i_1467_ + 8192)
			       >> 14);
		int i_1479_ = ((is_1469_[3] * i_1465_ + is_1469_[4] * i_1466_
				+ is_1469_[5] * i_1467_ + 8192)
			       >> 14);
		int i_1480_ = ((is_1469_[6] * i_1465_ + is_1469_[7] * i_1466_
				+ is_1469_[8] * i_1467_ + 8192)
			       >> 14);
		i_1465_ = i_1478_;
		i_1466_ = i_1479_;
		i_1467_ = i_1480_;
	    }
	    i_1465_ <<= 4;
	    i_1466_ <<= 4;
	    i_1467_ <<= 4;
	    if (!aBool9477) {
		for (int i_1481_ = 0; i_1481_ < anInt9444; i_1481_++) {
		    anIntArray9494[i_1481_] <<= 4;
		    anIntArray9447[i_1481_] <<= 4;
		    anIntArray9448[i_1481_] <<= 4;
		}
		aBool9477 = true;
	    }
	    for (int i_1482_ = 0; i_1482_ < i_1470_; i_1482_++) {
		int i_1483_ = is[i_1482_];
		if (i_1483_ < anIntArrayArray9470.length) {
		    int[] is_1484_ = anIntArrayArray9470[i_1483_];
		    for (int i_1485_ = 0; i_1485_ < is_1484_.length;
			 i_1485_++) {
			int i_1486_ = is_1484_[i_1485_];
			if (aShortArray9445 == null
			    || (i_1468_ & aShortArray9445[i_1486_]) != 0) {
			    anIntArray9494[i_1486_] += i_1465_;
			    anIntArray9447[i_1486_] += i_1466_;
			    anIntArray9448[i_1486_] += i_1467_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_1469_ != null) {
		if (!aBool9477) {
		    for (int i_1487_ = 0; i_1487_ < anInt9444; i_1487_++) {
			anIntArray9494[i_1487_] <<= 4;
			anIntArray9447[i_1487_] <<= 4;
			anIntArray9448[i_1487_] <<= 4;
		    }
		    aBool9477 = true;
		}
		int i_1488_ = is_1469_[9] << 4;
		int i_1489_ = is_1469_[10] << 4;
		int i_1490_ = is_1469_[11] << 4;
		int i_1491_ = is_1469_[12] << 4;
		int i_1492_ = is_1469_[13] << 4;
		int i_1493_ = is_1469_[14] << 4;
		if (aBool9504) {
		    int i_1494_
			= ((is_1469_[0] * anInt9458 + is_1469_[3] * anInt9481
			    + is_1469_[6] * anInt9465 + 8192)
			   >> 14);
		    int i_1495_
			= ((is_1469_[1] * anInt9458 + is_1469_[4] * anInt9481
			    + is_1469_[7] * anInt9465 + 8192)
			   >> 14);
		    int i_1496_
			= ((is_1469_[2] * anInt9458 + is_1469_[5] * anInt9481
			    + is_1469_[8] * anInt9465 + 8192)
			   >> 14);
		    i_1494_ += i_1491_;
		    i_1495_ += i_1492_;
		    i_1496_ += i_1493_;
		    anInt9458 = i_1494_;
		    anInt9481 = i_1495_;
		    anInt9465 = i_1496_;
		    aBool9504 = false;
		}
		int[] is_1497_ = new int[9];
		int i_1498_ = Class427.anIntArray4805[i_1465_];
		int i_1499_ = Class427.anIntArray4806[i_1465_];
		int i_1500_ = Class427.anIntArray4805[i_1466_];
		int i_1501_ = Class427.anIntArray4806[i_1466_];
		int i_1502_ = Class427.anIntArray4805[i_1467_];
		int i_1503_ = Class427.anIntArray4806[i_1467_];
		int i_1504_ = i_1499_ * i_1502_ + 8192 >> 14;
		int i_1505_ = i_1499_ * i_1503_ + 8192 >> 14;
		is_1497_[0]
		    = i_1500_ * i_1502_ + i_1501_ * i_1505_ + 8192 >> 14;
		is_1497_[1]
		    = -i_1500_ * i_1503_ + i_1501_ * i_1504_ + 8192 >> 14;
		is_1497_[2] = i_1501_ * i_1498_ + 8192 >> 14;
		is_1497_[3] = i_1498_ * i_1503_ + 8192 >> 14;
		is_1497_[4] = i_1498_ * i_1502_ + 8192 >> 14;
		is_1497_[5] = -i_1499_;
		is_1497_[6]
		    = -i_1501_ * i_1502_ + i_1500_ * i_1505_ + 8192 >> 14;
		is_1497_[7]
		    = i_1501_ * i_1503_ + i_1500_ * i_1504_ + 8192 >> 14;
		is_1497_[8] = i_1500_ * i_1498_ + 8192 >> 14;
		int i_1506_
		    = ((is_1497_[0] * -anInt9458 + is_1497_[1] * -anInt9481
			+ is_1497_[2] * -anInt9465 + 8192)
		       >> 14);
		int i_1507_
		    = ((is_1497_[3] * -anInt9458 + is_1497_[4] * -anInt9481
			+ is_1497_[5] * -anInt9465 + 8192)
		       >> 14);
		int i_1508_
		    = ((is_1497_[6] * -anInt9458 + is_1497_[7] * -anInt9481
			+ is_1497_[8] * -anInt9465 + 8192)
		       >> 14);
		int i_1509_ = i_1506_ + anInt9458;
		int i_1510_ = i_1507_ + anInt9481;
		int i_1511_ = i_1508_ + anInt9465;
		int[] is_1512_ = new int[9];
		for (int i_1513_ = 0; i_1513_ < 3; i_1513_++) {
		    for (int i_1514_ = 0; i_1514_ < 3; i_1514_++) {
			int i_1515_ = 0;
			for (int i_1516_ = 0; i_1516_ < 3; i_1516_++)
			    i_1515_ += (is_1497_[i_1513_ * 3 + i_1516_]
					* is_1469_[i_1514_ * 3 + i_1516_]);
			is_1512_[i_1513_ * 3 + i_1514_] = i_1515_ + 8192 >> 14;
		    }
		}
		int i_1517_ = ((is_1497_[0] * i_1491_ + is_1497_[1] * i_1492_
				+ is_1497_[2] * i_1493_ + 8192)
			       >> 14);
		int i_1518_ = ((is_1497_[3] * i_1491_ + is_1497_[4] * i_1492_
				+ is_1497_[5] * i_1493_ + 8192)
			       >> 14);
		int i_1519_ = ((is_1497_[6] * i_1491_ + is_1497_[7] * i_1492_
				+ is_1497_[8] * i_1493_ + 8192)
			       >> 14);
		i_1517_ += i_1509_;
		i_1518_ += i_1510_;
		i_1519_ += i_1511_;
		int[] is_1520_ = new int[9];
		for (int i_1521_ = 0; i_1521_ < 3; i_1521_++) {
		    for (int i_1522_ = 0; i_1522_ < 3; i_1522_++) {
			int i_1523_ = 0;
			for (int i_1524_ = 0; i_1524_ < 3; i_1524_++)
			    i_1523_ += (is_1469_[i_1521_ * 3 + i_1524_]
					* is_1512_[i_1522_ + i_1524_ * 3]);
			is_1520_[i_1521_ * 3 + i_1522_] = i_1523_ + 8192 >> 14;
		    }
		}
		int i_1525_ = ((is_1469_[0] * i_1517_ + is_1469_[1] * i_1518_
				+ is_1469_[2] * i_1519_ + 8192)
			       >> 14);
		int i_1526_ = ((is_1469_[3] * i_1517_ + is_1469_[4] * i_1518_
				+ is_1469_[5] * i_1519_ + 8192)
			       >> 14);
		int i_1527_ = ((is_1469_[6] * i_1517_ + is_1469_[7] * i_1518_
				+ is_1469_[8] * i_1519_ + 8192)
			       >> 14);
		i_1525_ += i_1488_;
		i_1526_ += i_1489_;
		i_1527_ += i_1490_;
		for (int i_1528_ = 0; i_1528_ < i_1470_; i_1528_++) {
		    int i_1529_ = is[i_1528_];
		    if (i_1529_ < anIntArrayArray9470.length) {
			int[] is_1530_ = anIntArrayArray9470[i_1529_];
			for (int i_1531_ = 0; i_1531_ < is_1530_.length;
			     i_1531_++) {
			    int i_1532_ = is_1530_[i_1531_];
			    if (aShortArray9445 == null
				|| (i_1468_ & aShortArray9445[i_1532_]) != 0) {
				int i_1533_
				    = ((is_1520_[0] * anIntArray9494[i_1532_]
					+ is_1520_[1] * anIntArray9447[i_1532_]
					+ is_1520_[2] * anIntArray9448[i_1532_]
					+ 8192)
				       >> 14);
				int i_1534_
				    = ((is_1520_[3] * anIntArray9494[i_1532_]
					+ is_1520_[4] * anIntArray9447[i_1532_]
					+ is_1520_[5] * anIntArray9448[i_1532_]
					+ 8192)
				       >> 14);
				int i_1535_
				    = ((is_1520_[6] * anIntArray9494[i_1532_]
					+ is_1520_[7] * anIntArray9447[i_1532_]
					+ is_1520_[8] * anIntArray9448[i_1532_]
					+ 8192)
				       >> 14);
				i_1533_ += i_1525_;
				i_1534_ += i_1526_;
				i_1535_ += i_1527_;
				anIntArray9494[i_1532_] = i_1533_;
				anIntArray9447[i_1532_] = i_1534_;
				anIntArray9448[i_1532_] = i_1535_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1536_ = 0; i_1536_ < i_1470_; i_1536_++) {
		    int i_1537_ = is[i_1536_];
		    if (i_1537_ < anIntArrayArray9470.length) {
			int[] is_1538_ = anIntArrayArray9470[i_1537_];
			for (int i_1539_ = 0; i_1539_ < is_1538_.length;
			     i_1539_++) {
			    int i_1540_ = is_1538_[i_1539_];
			    if (aShortArray9445 == null
				|| (i_1468_ & aShortArray9445[i_1540_]) != 0) {
				anIntArray9494[i_1540_] -= anInt9458;
				anIntArray9447[i_1540_] -= anInt9481;
				anIntArray9448[i_1540_] -= anInt9465;
				if (i_1467_ != 0) {
				    int i_1541_
					= Class427.anIntArray4806[i_1467_];
				    int i_1542_
					= Class427.anIntArray4805[i_1467_];
				    int i_1543_
					= ((anIntArray9447[i_1540_] * i_1541_
					    + anIntArray9494[i_1540_] * i_1542_
					    + 16383)
					   >> 14);
				    anIntArray9447[i_1540_]
					= (anIntArray9447[i_1540_] * i_1542_
					   - anIntArray9494[i_1540_] * i_1541_
					   + 16383) >> 14;
				    anIntArray9494[i_1540_] = i_1543_;
				}
				if (i_1465_ != 0) {
				    int i_1544_
					= Class427.anIntArray4806[i_1465_];
				    int i_1545_
					= Class427.anIntArray4805[i_1465_];
				    int i_1546_
					= ((anIntArray9447[i_1540_] * i_1545_
					    - anIntArray9448[i_1540_] * i_1544_
					    + 16383)
					   >> 14);
				    anIntArray9448[i_1540_]
					= (anIntArray9447[i_1540_] * i_1544_
					   + anIntArray9448[i_1540_] * i_1545_
					   + 16383) >> 14;
				    anIntArray9447[i_1540_] = i_1546_;
				}
				if (i_1466_ != 0) {
				    int i_1547_
					= Class427.anIntArray4806[i_1466_];
				    int i_1548_
					= Class427.anIntArray4805[i_1466_];
				    int i_1549_
					= ((anIntArray9448[i_1540_] * i_1547_
					    + anIntArray9494[i_1540_] * i_1548_
					    + 16383)
					   >> 14);
				    anIntArray9448[i_1540_]
					= (anIntArray9448[i_1540_] * i_1548_
					   - anIntArray9494[i_1540_] * i_1547_
					   + 16383) >> 14;
				    anIntArray9494[i_1540_] = i_1549_;
				}
				anIntArray9494[i_1540_] += anInt9458;
				anIntArray9447[i_1540_] += anInt9481;
				anIntArray9448[i_1540_] += anInt9465;
			    }
			}
		    }
		}
	    }
	} else if (i == 3) {
	    if (is_1469_ != null) {
		if (!aBool9477) {
		    for (int i_1550_ = 0; i_1550_ < anInt9444; i_1550_++) {
			anIntArray9494[i_1550_] <<= 4;
			anIntArray9447[i_1550_] <<= 4;
			anIntArray9448[i_1550_] <<= 4;
		    }
		    aBool9477 = true;
		}
		int i_1551_ = is_1469_[9] << 4;
		int i_1552_ = is_1469_[10] << 4;
		int i_1553_ = is_1469_[11] << 4;
		int i_1554_ = is_1469_[12] << 4;
		int i_1555_ = is_1469_[13] << 4;
		int i_1556_ = is_1469_[14] << 4;
		if (aBool9504) {
		    int i_1557_
			= ((is_1469_[0] * anInt9458 + is_1469_[3] * anInt9481
			    + is_1469_[6] * anInt9465 + 8192)
			   >> 14);
		    int i_1558_
			= ((is_1469_[1] * anInt9458 + is_1469_[4] * anInt9481
			    + is_1469_[7] * anInt9465 + 8192)
			   >> 14);
		    int i_1559_
			= ((is_1469_[2] * anInt9458 + is_1469_[5] * anInt9481
			    + is_1469_[8] * anInt9465 + 8192)
			   >> 14);
		    i_1557_ += i_1554_;
		    i_1558_ += i_1555_;
		    i_1559_ += i_1556_;
		    anInt9458 = i_1557_;
		    anInt9481 = i_1558_;
		    anInt9465 = i_1559_;
		    aBool9504 = false;
		}
		int i_1560_ = i_1465_ << 15 >> 7;
		int i_1561_ = i_1466_ << 15 >> 7;
		int i_1562_ = i_1467_ << 15 >> 7;
		int i_1563_ = i_1560_ * -anInt9458 + 8192 >> 14;
		int i_1564_ = i_1561_ * -anInt9481 + 8192 >> 14;
		int i_1565_ = i_1562_ * -anInt9465 + 8192 >> 14;
		int i_1566_ = i_1563_ + anInt9458;
		int i_1567_ = i_1564_ + anInt9481;
		int i_1568_ = i_1565_ + anInt9465;
		int[] is_1569_ = new int[9];
		is_1569_[0] = i_1560_ * is_1469_[0] + 8192 >> 14;
		is_1569_[1] = i_1560_ * is_1469_[3] + 8192 >> 14;
		is_1569_[2] = i_1560_ * is_1469_[6] + 8192 >> 14;
		is_1569_[3] = i_1561_ * is_1469_[1] + 8192 >> 14;
		is_1569_[4] = i_1561_ * is_1469_[4] + 8192 >> 14;
		is_1569_[5] = i_1561_ * is_1469_[7] + 8192 >> 14;
		is_1569_[6] = i_1562_ * is_1469_[2] + 8192 >> 14;
		is_1569_[7] = i_1562_ * is_1469_[5] + 8192 >> 14;
		is_1569_[8] = i_1562_ * is_1469_[8] + 8192 >> 14;
		int i_1570_ = i_1560_ * i_1554_ + 8192 >> 14;
		int i_1571_ = i_1561_ * i_1555_ + 8192 >> 14;
		int i_1572_ = i_1562_ * i_1556_ + 8192 >> 14;
		i_1570_ += i_1566_;
		i_1571_ += i_1567_;
		i_1572_ += i_1568_;
		int[] is_1573_ = new int[9];
		for (int i_1574_ = 0; i_1574_ < 3; i_1574_++) {
		    for (int i_1575_ = 0; i_1575_ < 3; i_1575_++) {
			int i_1576_ = 0;
			for (int i_1577_ = 0; i_1577_ < 3; i_1577_++)
			    i_1576_ += (is_1469_[i_1574_ * 3 + i_1577_]
					* is_1569_[i_1575_ + i_1577_ * 3]);
			is_1573_[i_1574_ * 3 + i_1575_] = i_1576_ + 8192 >> 14;
		    }
		}
		int i_1578_ = ((is_1469_[0] * i_1570_ + is_1469_[1] * i_1571_
				+ is_1469_[2] * i_1572_ + 8192)
			       >> 14);
		int i_1579_ = ((is_1469_[3] * i_1570_ + is_1469_[4] * i_1571_
				+ is_1469_[5] * i_1572_ + 8192)
			       >> 14);
		int i_1580_ = ((is_1469_[6] * i_1570_ + is_1469_[7] * i_1571_
				+ is_1469_[8] * i_1572_ + 8192)
			       >> 14);
		i_1578_ += i_1551_;
		i_1579_ += i_1552_;
		i_1580_ += i_1553_;
		for (int i_1581_ = 0; i_1581_ < i_1470_; i_1581_++) {
		    int i_1582_ = is[i_1581_];
		    if (i_1582_ < anIntArrayArray9470.length) {
			int[] is_1583_ = anIntArrayArray9470[i_1582_];
			for (int i_1584_ = 0; i_1584_ < is_1583_.length;
			     i_1584_++) {
			    int i_1585_ = is_1583_[i_1584_];
			    if (aShortArray9445 == null
				|| (i_1468_ & aShortArray9445[i_1585_]) != 0) {
				int i_1586_
				    = ((is_1573_[0] * anIntArray9494[i_1585_]
					+ is_1573_[1] * anIntArray9447[i_1585_]
					+ is_1573_[2] * anIntArray9448[i_1585_]
					+ 8192)
				       >> 14);
				int i_1587_
				    = ((is_1573_[3] * anIntArray9494[i_1585_]
					+ is_1573_[4] * anIntArray9447[i_1585_]
					+ is_1573_[5] * anIntArray9448[i_1585_]
					+ 8192)
				       >> 14);
				int i_1588_
				    = ((is_1573_[6] * anIntArray9494[i_1585_]
					+ is_1573_[7] * anIntArray9447[i_1585_]
					+ is_1573_[8] * anIntArray9448[i_1585_]
					+ 8192)
				       >> 14);
				i_1586_ += i_1578_;
				i_1587_ += i_1579_;
				i_1588_ += i_1580_;
				anIntArray9494[i_1585_] = i_1586_;
				anIntArray9447[i_1585_] = i_1587_;
				anIntArray9448[i_1585_] = i_1588_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1589_ = 0; i_1589_ < i_1470_; i_1589_++) {
		    int i_1590_ = is[i_1589_];
		    if (i_1590_ < anIntArrayArray9470.length) {
			int[] is_1591_ = anIntArrayArray9470[i_1590_];
			for (int i_1592_ = 0; i_1592_ < is_1591_.length;
			     i_1592_++) {
			    int i_1593_ = is_1591_[i_1592_];
			    if (aShortArray9445 == null
				|| (i_1468_ & aShortArray9445[i_1593_]) != 0) {
				anIntArray9494[i_1593_] -= anInt9458;
				anIntArray9447[i_1593_] -= anInt9481;
				anIntArray9448[i_1593_] -= anInt9465;
				anIntArray9494[i_1593_]
				    = anIntArray9494[i_1593_] * i_1465_ / 128;
				anIntArray9447[i_1593_]
				    = anIntArray9447[i_1593_] * i_1466_ / 128;
				anIntArray9448[i_1593_]
				    = anIntArray9448[i_1593_] * i_1467_ / 128;
				anIntArray9494[i_1593_] += anInt9458;
				anIntArray9447[i_1593_] += anInt9481;
				anIntArray9448[i_1593_] += anInt9465;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9457 != null && aByteArray9469 != null) {
		for (int i_1594_ = 0; i_1594_ < i_1470_; i_1594_++) {
		    int i_1595_ = is[i_1594_];
		    if (i_1595_ < anIntArrayArray9457.length) {
			int[] is_1596_ = anIntArrayArray9457[i_1595_];
			for (int i_1597_ = 0; i_1597_ < is_1596_.length;
			     i_1597_++) {
			    int i_1598_ = is_1596_[i_1597_];
			    if (aShortArray9472 == null
				|| (i_1468_ & aShortArray9472[i_1598_]) != 0) {
				int i_1599_ = ((aByteArray9469[i_1598_] & 0xff)
					       + i_1465_ * 8);
				if (i_1599_ < 0)
				    i_1599_ = 0;
				else if (i_1599_ > 255)
				    i_1599_ = 255;
				aByteArray9469[i_1598_] = (byte) i_1599_;
			    }
			}
		    }
		}
		if (aClass118Array9485 != null) {
		    for (int i_1600_ = 0; i_1600_ < anInt9484; i_1600_++) {
			Class118 class118 = aClass118Array9485[i_1600_];
			Class117 class117 = aClass117Array9486[i_1600_];
			class117.anInt1411
			    = (class117.anInt1411 * -150900843 & 0xffffff
			       | 255 - ((aByteArray9469
					 [class118.anInt1418 * 2118166057])
					& 0xff) << 24) * 874668989;
		    }
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9457 != null) {
		for (int i_1601_ = 0; i_1601_ < i_1470_; i_1601_++) {
		    int i_1602_ = is[i_1601_];
		    if (i_1602_ < anIntArrayArray9457.length) {
			int[] is_1603_ = anIntArrayArray9457[i_1602_];
			for (int i_1604_ = 0; i_1604_ < is_1603_.length;
			     i_1604_++) {
			    int i_1605_ = is_1603_[i_1604_];
			    if (aShortArray9472 == null
				|| (i_1468_ & aShortArray9472[i_1605_]) != 0) {
				int i_1606_
				    = aShortArray9471[i_1605_] & 0xffff;
				int i_1607_ = i_1606_ >> 10 & 0x3f;
				int i_1608_ = i_1606_ >> 7 & 0x7;
				int i_1609_ = i_1606_ & 0x7f;
				i_1607_ = i_1607_ + i_1465_ & 0x3f;
				i_1608_ += i_1466_;
				if (i_1608_ < 0)
				    i_1608_ = 0;
				else if (i_1608_ > 7)
				    i_1608_ = 7;
				i_1609_ += i_1467_;
				if (i_1609_ < 0)
				    i_1609_ = 0;
				else if (i_1609_ > 127)
				    i_1609_ = 127;
				aShortArray9471[i_1605_]
				    = (short) (i_1607_ << 10 | i_1608_ << 7
					       | i_1609_);
			    }
			}
			aBool9476 = true;
		    }
		}
		if (aClass118Array9485 != null) {
		    for (int i_1610_ = 0; i_1610_ < anInt9484; i_1610_++) {
			Class118 class118 = aClass118Array9485[i_1610_];
			Class117 class117 = aClass117Array9486[i_1610_];
			class117.anInt1411
			    = (class117.anInt1411 * -150900843 & ~0xffffff
			       | ((Class415.anIntArray4666
				   [Class315.method5705(((aShortArray9471
							  [(class118.anInt1418
							    * 2118166057)])
							 & 0xffff),
							327096701) & 0xffff])
				  & 0xffffff)) * 874668989;
		    }
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9487 != null) {
		for (int i_1611_ = 0; i_1611_ < i_1470_; i_1611_++) {
		    int i_1612_ = is[i_1611_];
		    if (i_1612_ < anIntArrayArray9487.length) {
			int[] is_1613_ = anIntArrayArray9487[i_1612_];
			for (int i_1614_ = 0; i_1614_ < is_1613_.length;
			     i_1614_++) {
			    Class117 class117
				= aClass117Array9486[is_1613_[i_1614_]];
			    class117.anInt1405 += i_1465_ * 1831486073;
			    class117.anInt1406 += i_1466_ * -108929861;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9487 != null) {
		for (int i_1615_ = 0; i_1615_ < i_1470_; i_1615_++) {
		    int i_1616_ = is[i_1615_];
		    if (i_1616_ < anIntArrayArray9487.length) {
			int[] is_1617_ = anIntArrayArray9487[i_1616_];
			for (int i_1618_ = 0; i_1618_ < is_1617_.length;
			     i_1618_++) {
			    Class117 class117
				= aClass117Array9486[is_1617_[i_1618_]];
			    class117.aFloat1403 = (class117.aFloat1403
						   * (float) i_1465_ / 128.0F);
			    class117.aFloat1404 = (class117.aFloat1404
						   * (float) i_1466_ / 128.0F);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9487 != null) {
		for (int i_1619_ = 0; i_1619_ < i_1470_; i_1619_++) {
		    int i_1620_ = is[i_1619_];
		    if (i_1620_ < anIntArrayArray9487.length) {
			int[] is_1621_ = anIntArrayArray9487[i_1620_];
			for (int i_1622_ = 0; i_1622_ < is_1621_.length;
			     i_1622_++) {
			    Class117 class117
				= aClass117Array9486[is_1621_[i_1622_]];
			    class117.anInt1409
				= (class117.anInt1409 * -133325595 + i_1465_
				   & 0x3fff) * 1832042733;
			}
		    }
		}
	    }
	}
    }
    
    void method3102(int i, int[] is, int i_1623_, int i_1624_, int i_1625_,
		    boolean bool, int i_1626_, int[] is_1627_) {
	int i_1628_ = is.length;
	if (i == 0) {
	    i_1623_ <<= 4;
	    i_1624_ <<= 4;
	    i_1625_ <<= 4;
	    if (!aBool9477) {
		for (int i_1629_ = 0; i_1629_ < anInt9444; i_1629_++) {
		    anIntArray9494[i_1629_] <<= 4;
		    anIntArray9447[i_1629_] <<= 4;
		    anIntArray9448[i_1629_] <<= 4;
		}
		aBool9477 = true;
	    }
	    int i_1630_ = 0;
	    anInt9458 = 0;
	    anInt9481 = 0;
	    anInt9465 = 0;
	    for (int i_1631_ = 0; i_1631_ < i_1628_; i_1631_++) {
		int i_1632_ = is[i_1631_];
		if (i_1632_ < anIntArrayArray9470.length) {
		    int[] is_1633_ = anIntArrayArray9470[i_1632_];
		    for (int i_1634_ = 0; i_1634_ < is_1633_.length;
			 i_1634_++) {
			int i_1635_ = is_1633_[i_1634_];
			if (aShortArray9445 == null
			    || (i_1626_ & aShortArray9445[i_1635_]) != 0) {
			    anInt9458 += anIntArray9494[i_1635_];
			    anInt9481 += anIntArray9447[i_1635_];
			    anInt9465 += anIntArray9448[i_1635_];
			    i_1630_++;
			}
		    }
		}
	    }
	    if (i_1630_ > 0) {
		anInt9458 = anInt9458 / i_1630_ + i_1623_;
		anInt9481 = anInt9481 / i_1630_ + i_1624_;
		anInt9465 = anInt9465 / i_1630_ + i_1625_;
		aBool9504 = true;
	    } else {
		anInt9458 = i_1623_;
		anInt9481 = i_1624_;
		anInt9465 = i_1625_;
	    }
	} else if (i == 1) {
	    if (is_1627_ != null) {
		int i_1636_ = ((is_1627_[0] * i_1623_ + is_1627_[1] * i_1624_
				+ is_1627_[2] * i_1625_ + 8192)
			       >> 14);
		int i_1637_ = ((is_1627_[3] * i_1623_ + is_1627_[4] * i_1624_
				+ is_1627_[5] * i_1625_ + 8192)
			       >> 14);
		int i_1638_ = ((is_1627_[6] * i_1623_ + is_1627_[7] * i_1624_
				+ is_1627_[8] * i_1625_ + 8192)
			       >> 14);
		i_1623_ = i_1636_;
		i_1624_ = i_1637_;
		i_1625_ = i_1638_;
	    }
	    i_1623_ <<= 4;
	    i_1624_ <<= 4;
	    i_1625_ <<= 4;
	    if (!aBool9477) {
		for (int i_1639_ = 0; i_1639_ < anInt9444; i_1639_++) {
		    anIntArray9494[i_1639_] <<= 4;
		    anIntArray9447[i_1639_] <<= 4;
		    anIntArray9448[i_1639_] <<= 4;
		}
		aBool9477 = true;
	    }
	    for (int i_1640_ = 0; i_1640_ < i_1628_; i_1640_++) {
		int i_1641_ = is[i_1640_];
		if (i_1641_ < anIntArrayArray9470.length) {
		    int[] is_1642_ = anIntArrayArray9470[i_1641_];
		    for (int i_1643_ = 0; i_1643_ < is_1642_.length;
			 i_1643_++) {
			int i_1644_ = is_1642_[i_1643_];
			if (aShortArray9445 == null
			    || (i_1626_ & aShortArray9445[i_1644_]) != 0) {
			    anIntArray9494[i_1644_] += i_1623_;
			    anIntArray9447[i_1644_] += i_1624_;
			    anIntArray9448[i_1644_] += i_1625_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_1627_ != null) {
		if (!aBool9477) {
		    for (int i_1645_ = 0; i_1645_ < anInt9444; i_1645_++) {
			anIntArray9494[i_1645_] <<= 4;
			anIntArray9447[i_1645_] <<= 4;
			anIntArray9448[i_1645_] <<= 4;
		    }
		    aBool9477 = true;
		}
		int i_1646_ = is_1627_[9] << 4;
		int i_1647_ = is_1627_[10] << 4;
		int i_1648_ = is_1627_[11] << 4;
		int i_1649_ = is_1627_[12] << 4;
		int i_1650_ = is_1627_[13] << 4;
		int i_1651_ = is_1627_[14] << 4;
		if (aBool9504) {
		    int i_1652_
			= ((is_1627_[0] * anInt9458 + is_1627_[3] * anInt9481
			    + is_1627_[6] * anInt9465 + 8192)
			   >> 14);
		    int i_1653_
			= ((is_1627_[1] * anInt9458 + is_1627_[4] * anInt9481
			    + is_1627_[7] * anInt9465 + 8192)
			   >> 14);
		    int i_1654_
			= ((is_1627_[2] * anInt9458 + is_1627_[5] * anInt9481
			    + is_1627_[8] * anInt9465 + 8192)
			   >> 14);
		    i_1652_ += i_1649_;
		    i_1653_ += i_1650_;
		    i_1654_ += i_1651_;
		    anInt9458 = i_1652_;
		    anInt9481 = i_1653_;
		    anInt9465 = i_1654_;
		    aBool9504 = false;
		}
		int[] is_1655_ = new int[9];
		int i_1656_ = Class427.anIntArray4805[i_1623_];
		int i_1657_ = Class427.anIntArray4806[i_1623_];
		int i_1658_ = Class427.anIntArray4805[i_1624_];
		int i_1659_ = Class427.anIntArray4806[i_1624_];
		int i_1660_ = Class427.anIntArray4805[i_1625_];
		int i_1661_ = Class427.anIntArray4806[i_1625_];
		int i_1662_ = i_1657_ * i_1660_ + 8192 >> 14;
		int i_1663_ = i_1657_ * i_1661_ + 8192 >> 14;
		is_1655_[0]
		    = i_1658_ * i_1660_ + i_1659_ * i_1663_ + 8192 >> 14;
		is_1655_[1]
		    = -i_1658_ * i_1661_ + i_1659_ * i_1662_ + 8192 >> 14;
		is_1655_[2] = i_1659_ * i_1656_ + 8192 >> 14;
		is_1655_[3] = i_1656_ * i_1661_ + 8192 >> 14;
		is_1655_[4] = i_1656_ * i_1660_ + 8192 >> 14;
		is_1655_[5] = -i_1657_;
		is_1655_[6]
		    = -i_1659_ * i_1660_ + i_1658_ * i_1663_ + 8192 >> 14;
		is_1655_[7]
		    = i_1659_ * i_1661_ + i_1658_ * i_1662_ + 8192 >> 14;
		is_1655_[8] = i_1658_ * i_1656_ + 8192 >> 14;
		int i_1664_
		    = ((is_1655_[0] * -anInt9458 + is_1655_[1] * -anInt9481
			+ is_1655_[2] * -anInt9465 + 8192)
		       >> 14);
		int i_1665_
		    = ((is_1655_[3] * -anInt9458 + is_1655_[4] * -anInt9481
			+ is_1655_[5] * -anInt9465 + 8192)
		       >> 14);
		int i_1666_
		    = ((is_1655_[6] * -anInt9458 + is_1655_[7] * -anInt9481
			+ is_1655_[8] * -anInt9465 + 8192)
		       >> 14);
		int i_1667_ = i_1664_ + anInt9458;
		int i_1668_ = i_1665_ + anInt9481;
		int i_1669_ = i_1666_ + anInt9465;
		int[] is_1670_ = new int[9];
		for (int i_1671_ = 0; i_1671_ < 3; i_1671_++) {
		    for (int i_1672_ = 0; i_1672_ < 3; i_1672_++) {
			int i_1673_ = 0;
			for (int i_1674_ = 0; i_1674_ < 3; i_1674_++)
			    i_1673_ += (is_1655_[i_1671_ * 3 + i_1674_]
					* is_1627_[i_1672_ * 3 + i_1674_]);
			is_1670_[i_1671_ * 3 + i_1672_] = i_1673_ + 8192 >> 14;
		    }
		}
		int i_1675_ = ((is_1655_[0] * i_1649_ + is_1655_[1] * i_1650_
				+ is_1655_[2] * i_1651_ + 8192)
			       >> 14);
		int i_1676_ = ((is_1655_[3] * i_1649_ + is_1655_[4] * i_1650_
				+ is_1655_[5] * i_1651_ + 8192)
			       >> 14);
		int i_1677_ = ((is_1655_[6] * i_1649_ + is_1655_[7] * i_1650_
				+ is_1655_[8] * i_1651_ + 8192)
			       >> 14);
		i_1675_ += i_1667_;
		i_1676_ += i_1668_;
		i_1677_ += i_1669_;
		int[] is_1678_ = new int[9];
		for (int i_1679_ = 0; i_1679_ < 3; i_1679_++) {
		    for (int i_1680_ = 0; i_1680_ < 3; i_1680_++) {
			int i_1681_ = 0;
			for (int i_1682_ = 0; i_1682_ < 3; i_1682_++)
			    i_1681_ += (is_1627_[i_1679_ * 3 + i_1682_]
					* is_1670_[i_1680_ + i_1682_ * 3]);
			is_1678_[i_1679_ * 3 + i_1680_] = i_1681_ + 8192 >> 14;
		    }
		}
		int i_1683_ = ((is_1627_[0] * i_1675_ + is_1627_[1] * i_1676_
				+ is_1627_[2] * i_1677_ + 8192)
			       >> 14);
		int i_1684_ = ((is_1627_[3] * i_1675_ + is_1627_[4] * i_1676_
				+ is_1627_[5] * i_1677_ + 8192)
			       >> 14);
		int i_1685_ = ((is_1627_[6] * i_1675_ + is_1627_[7] * i_1676_
				+ is_1627_[8] * i_1677_ + 8192)
			       >> 14);
		i_1683_ += i_1646_;
		i_1684_ += i_1647_;
		i_1685_ += i_1648_;
		for (int i_1686_ = 0; i_1686_ < i_1628_; i_1686_++) {
		    int i_1687_ = is[i_1686_];
		    if (i_1687_ < anIntArrayArray9470.length) {
			int[] is_1688_ = anIntArrayArray9470[i_1687_];
			for (int i_1689_ = 0; i_1689_ < is_1688_.length;
			     i_1689_++) {
			    int i_1690_ = is_1688_[i_1689_];
			    if (aShortArray9445 == null
				|| (i_1626_ & aShortArray9445[i_1690_]) != 0) {
				int i_1691_
				    = ((is_1678_[0] * anIntArray9494[i_1690_]
					+ is_1678_[1] * anIntArray9447[i_1690_]
					+ is_1678_[2] * anIntArray9448[i_1690_]
					+ 8192)
				       >> 14);
				int i_1692_
				    = ((is_1678_[3] * anIntArray9494[i_1690_]
					+ is_1678_[4] * anIntArray9447[i_1690_]
					+ is_1678_[5] * anIntArray9448[i_1690_]
					+ 8192)
				       >> 14);
				int i_1693_
				    = ((is_1678_[6] * anIntArray9494[i_1690_]
					+ is_1678_[7] * anIntArray9447[i_1690_]
					+ is_1678_[8] * anIntArray9448[i_1690_]
					+ 8192)
				       >> 14);
				i_1691_ += i_1683_;
				i_1692_ += i_1684_;
				i_1693_ += i_1685_;
				anIntArray9494[i_1690_] = i_1691_;
				anIntArray9447[i_1690_] = i_1692_;
				anIntArray9448[i_1690_] = i_1693_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1694_ = 0; i_1694_ < i_1628_; i_1694_++) {
		    int i_1695_ = is[i_1694_];
		    if (i_1695_ < anIntArrayArray9470.length) {
			int[] is_1696_ = anIntArrayArray9470[i_1695_];
			for (int i_1697_ = 0; i_1697_ < is_1696_.length;
			     i_1697_++) {
			    int i_1698_ = is_1696_[i_1697_];
			    if (aShortArray9445 == null
				|| (i_1626_ & aShortArray9445[i_1698_]) != 0) {
				anIntArray9494[i_1698_] -= anInt9458;
				anIntArray9447[i_1698_] -= anInt9481;
				anIntArray9448[i_1698_] -= anInt9465;
				if (i_1625_ != 0) {
				    int i_1699_
					= Class427.anIntArray4806[i_1625_];
				    int i_1700_
					= Class427.anIntArray4805[i_1625_];
				    int i_1701_
					= ((anIntArray9447[i_1698_] * i_1699_
					    + anIntArray9494[i_1698_] * i_1700_
					    + 16383)
					   >> 14);
				    anIntArray9447[i_1698_]
					= (anIntArray9447[i_1698_] * i_1700_
					   - anIntArray9494[i_1698_] * i_1699_
					   + 16383) >> 14;
				    anIntArray9494[i_1698_] = i_1701_;
				}
				if (i_1623_ != 0) {
				    int i_1702_
					= Class427.anIntArray4806[i_1623_];
				    int i_1703_
					= Class427.anIntArray4805[i_1623_];
				    int i_1704_
					= ((anIntArray9447[i_1698_] * i_1703_
					    - anIntArray9448[i_1698_] * i_1702_
					    + 16383)
					   >> 14);
				    anIntArray9448[i_1698_]
					= (anIntArray9447[i_1698_] * i_1702_
					   + anIntArray9448[i_1698_] * i_1703_
					   + 16383) >> 14;
				    anIntArray9447[i_1698_] = i_1704_;
				}
				if (i_1624_ != 0) {
				    int i_1705_
					= Class427.anIntArray4806[i_1624_];
				    int i_1706_
					= Class427.anIntArray4805[i_1624_];
				    int i_1707_
					= ((anIntArray9448[i_1698_] * i_1705_
					    + anIntArray9494[i_1698_] * i_1706_
					    + 16383)
					   >> 14);
				    anIntArray9448[i_1698_]
					= (anIntArray9448[i_1698_] * i_1706_
					   - anIntArray9494[i_1698_] * i_1705_
					   + 16383) >> 14;
				    anIntArray9494[i_1698_] = i_1707_;
				}
				anIntArray9494[i_1698_] += anInt9458;
				anIntArray9447[i_1698_] += anInt9481;
				anIntArray9448[i_1698_] += anInt9465;
			    }
			}
		    }
		}
	    }
	} else if (i == 3) {
	    if (is_1627_ != null) {
		if (!aBool9477) {
		    for (int i_1708_ = 0; i_1708_ < anInt9444; i_1708_++) {
			anIntArray9494[i_1708_] <<= 4;
			anIntArray9447[i_1708_] <<= 4;
			anIntArray9448[i_1708_] <<= 4;
		    }
		    aBool9477 = true;
		}
		int i_1709_ = is_1627_[9] << 4;
		int i_1710_ = is_1627_[10] << 4;
		int i_1711_ = is_1627_[11] << 4;
		int i_1712_ = is_1627_[12] << 4;
		int i_1713_ = is_1627_[13] << 4;
		int i_1714_ = is_1627_[14] << 4;
		if (aBool9504) {
		    int i_1715_
			= ((is_1627_[0] * anInt9458 + is_1627_[3] * anInt9481
			    + is_1627_[6] * anInt9465 + 8192)
			   >> 14);
		    int i_1716_
			= ((is_1627_[1] * anInt9458 + is_1627_[4] * anInt9481
			    + is_1627_[7] * anInt9465 + 8192)
			   >> 14);
		    int i_1717_
			= ((is_1627_[2] * anInt9458 + is_1627_[5] * anInt9481
			    + is_1627_[8] * anInt9465 + 8192)
			   >> 14);
		    i_1715_ += i_1712_;
		    i_1716_ += i_1713_;
		    i_1717_ += i_1714_;
		    anInt9458 = i_1715_;
		    anInt9481 = i_1716_;
		    anInt9465 = i_1717_;
		    aBool9504 = false;
		}
		int i_1718_ = i_1623_ << 15 >> 7;
		int i_1719_ = i_1624_ << 15 >> 7;
		int i_1720_ = i_1625_ << 15 >> 7;
		int i_1721_ = i_1718_ * -anInt9458 + 8192 >> 14;
		int i_1722_ = i_1719_ * -anInt9481 + 8192 >> 14;
		int i_1723_ = i_1720_ * -anInt9465 + 8192 >> 14;
		int i_1724_ = i_1721_ + anInt9458;
		int i_1725_ = i_1722_ + anInt9481;
		int i_1726_ = i_1723_ + anInt9465;
		int[] is_1727_ = new int[9];
		is_1727_[0] = i_1718_ * is_1627_[0] + 8192 >> 14;
		is_1727_[1] = i_1718_ * is_1627_[3] + 8192 >> 14;
		is_1727_[2] = i_1718_ * is_1627_[6] + 8192 >> 14;
		is_1727_[3] = i_1719_ * is_1627_[1] + 8192 >> 14;
		is_1727_[4] = i_1719_ * is_1627_[4] + 8192 >> 14;
		is_1727_[5] = i_1719_ * is_1627_[7] + 8192 >> 14;
		is_1727_[6] = i_1720_ * is_1627_[2] + 8192 >> 14;
		is_1727_[7] = i_1720_ * is_1627_[5] + 8192 >> 14;
		is_1727_[8] = i_1720_ * is_1627_[8] + 8192 >> 14;
		int i_1728_ = i_1718_ * i_1712_ + 8192 >> 14;
		int i_1729_ = i_1719_ * i_1713_ + 8192 >> 14;
		int i_1730_ = i_1720_ * i_1714_ + 8192 >> 14;
		i_1728_ += i_1724_;
		i_1729_ += i_1725_;
		i_1730_ += i_1726_;
		int[] is_1731_ = new int[9];
		for (int i_1732_ = 0; i_1732_ < 3; i_1732_++) {
		    for (int i_1733_ = 0; i_1733_ < 3; i_1733_++) {
			int i_1734_ = 0;
			for (int i_1735_ = 0; i_1735_ < 3; i_1735_++)
			    i_1734_ += (is_1627_[i_1732_ * 3 + i_1735_]
					* is_1727_[i_1733_ + i_1735_ * 3]);
			is_1731_[i_1732_ * 3 + i_1733_] = i_1734_ + 8192 >> 14;
		    }
		}
		int i_1736_ = ((is_1627_[0] * i_1728_ + is_1627_[1] * i_1729_
				+ is_1627_[2] * i_1730_ + 8192)
			       >> 14);
		int i_1737_ = ((is_1627_[3] * i_1728_ + is_1627_[4] * i_1729_
				+ is_1627_[5] * i_1730_ + 8192)
			       >> 14);
		int i_1738_ = ((is_1627_[6] * i_1728_ + is_1627_[7] * i_1729_
				+ is_1627_[8] * i_1730_ + 8192)
			       >> 14);
		i_1736_ += i_1709_;
		i_1737_ += i_1710_;
		i_1738_ += i_1711_;
		for (int i_1739_ = 0; i_1739_ < i_1628_; i_1739_++) {
		    int i_1740_ = is[i_1739_];
		    if (i_1740_ < anIntArrayArray9470.length) {
			int[] is_1741_ = anIntArrayArray9470[i_1740_];
			for (int i_1742_ = 0; i_1742_ < is_1741_.length;
			     i_1742_++) {
			    int i_1743_ = is_1741_[i_1742_];
			    if (aShortArray9445 == null
				|| (i_1626_ & aShortArray9445[i_1743_]) != 0) {
				int i_1744_
				    = ((is_1731_[0] * anIntArray9494[i_1743_]
					+ is_1731_[1] * anIntArray9447[i_1743_]
					+ is_1731_[2] * anIntArray9448[i_1743_]
					+ 8192)
				       >> 14);
				int i_1745_
				    = ((is_1731_[3] * anIntArray9494[i_1743_]
					+ is_1731_[4] * anIntArray9447[i_1743_]
					+ is_1731_[5] * anIntArray9448[i_1743_]
					+ 8192)
				       >> 14);
				int i_1746_
				    = ((is_1731_[6] * anIntArray9494[i_1743_]
					+ is_1731_[7] * anIntArray9447[i_1743_]
					+ is_1731_[8] * anIntArray9448[i_1743_]
					+ 8192)
				       >> 14);
				i_1744_ += i_1736_;
				i_1745_ += i_1737_;
				i_1746_ += i_1738_;
				anIntArray9494[i_1743_] = i_1744_;
				anIntArray9447[i_1743_] = i_1745_;
				anIntArray9448[i_1743_] = i_1746_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1747_ = 0; i_1747_ < i_1628_; i_1747_++) {
		    int i_1748_ = is[i_1747_];
		    if (i_1748_ < anIntArrayArray9470.length) {
			int[] is_1749_ = anIntArrayArray9470[i_1748_];
			for (int i_1750_ = 0; i_1750_ < is_1749_.length;
			     i_1750_++) {
			    int i_1751_ = is_1749_[i_1750_];
			    if (aShortArray9445 == null
				|| (i_1626_ & aShortArray9445[i_1751_]) != 0) {
				anIntArray9494[i_1751_] -= anInt9458;
				anIntArray9447[i_1751_] -= anInt9481;
				anIntArray9448[i_1751_] -= anInt9465;
				anIntArray9494[i_1751_]
				    = anIntArray9494[i_1751_] * i_1623_ / 128;
				anIntArray9447[i_1751_]
				    = anIntArray9447[i_1751_] * i_1624_ / 128;
				anIntArray9448[i_1751_]
				    = anIntArray9448[i_1751_] * i_1625_ / 128;
				anIntArray9494[i_1751_] += anInt9458;
				anIntArray9447[i_1751_] += anInt9481;
				anIntArray9448[i_1751_] += anInt9465;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9457 != null && aByteArray9469 != null) {
		for (int i_1752_ = 0; i_1752_ < i_1628_; i_1752_++) {
		    int i_1753_ = is[i_1752_];
		    if (i_1753_ < anIntArrayArray9457.length) {
			int[] is_1754_ = anIntArrayArray9457[i_1753_];
			for (int i_1755_ = 0; i_1755_ < is_1754_.length;
			     i_1755_++) {
			    int i_1756_ = is_1754_[i_1755_];
			    if (aShortArray9472 == null
				|| (i_1626_ & aShortArray9472[i_1756_]) != 0) {
				int i_1757_ = ((aByteArray9469[i_1756_] & 0xff)
					       + i_1623_ * 8);
				if (i_1757_ < 0)
				    i_1757_ = 0;
				else if (i_1757_ > 255)
				    i_1757_ = 255;
				aByteArray9469[i_1756_] = (byte) i_1757_;
			    }
			}
		    }
		}
		if (aClass118Array9485 != null) {
		    for (int i_1758_ = 0; i_1758_ < anInt9484; i_1758_++) {
			Class118 class118 = aClass118Array9485[i_1758_];
			Class117 class117 = aClass117Array9486[i_1758_];
			class117.anInt1411
			    = (class117.anInt1411 * -150900843 & 0xffffff
			       | 255 - ((aByteArray9469
					 [class118.anInt1418 * 2118166057])
					& 0xff) << 24) * 874668989;
		    }
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9457 != null) {
		for (int i_1759_ = 0; i_1759_ < i_1628_; i_1759_++) {
		    int i_1760_ = is[i_1759_];
		    if (i_1760_ < anIntArrayArray9457.length) {
			int[] is_1761_ = anIntArrayArray9457[i_1760_];
			for (int i_1762_ = 0; i_1762_ < is_1761_.length;
			     i_1762_++) {
			    int i_1763_ = is_1761_[i_1762_];
			    if (aShortArray9472 == null
				|| (i_1626_ & aShortArray9472[i_1763_]) != 0) {
				int i_1764_
				    = aShortArray9471[i_1763_] & 0xffff;
				int i_1765_ = i_1764_ >> 10 & 0x3f;
				int i_1766_ = i_1764_ >> 7 & 0x7;
				int i_1767_ = i_1764_ & 0x7f;
				i_1765_ = i_1765_ + i_1623_ & 0x3f;
				i_1766_ += i_1624_;
				if (i_1766_ < 0)
				    i_1766_ = 0;
				else if (i_1766_ > 7)
				    i_1766_ = 7;
				i_1767_ += i_1625_;
				if (i_1767_ < 0)
				    i_1767_ = 0;
				else if (i_1767_ > 127)
				    i_1767_ = 127;
				aShortArray9471[i_1763_]
				    = (short) (i_1765_ << 10 | i_1766_ << 7
					       | i_1767_);
			    }
			}
			aBool9476 = true;
		    }
		}
		if (aClass118Array9485 != null) {
		    for (int i_1768_ = 0; i_1768_ < anInt9484; i_1768_++) {
			Class118 class118 = aClass118Array9485[i_1768_];
			Class117 class117 = aClass117Array9486[i_1768_];
			class117.anInt1411
			    = (class117.anInt1411 * -150900843 & ~0xffffff
			       | ((Class415.anIntArray4666
				   [Class315.method5705(((aShortArray9471
							  [(class118.anInt1418
							    * 2118166057)])
							 & 0xffff),
							427994396) & 0xffff])
				  & 0xffffff)) * 874668989;
		    }
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9487 != null) {
		for (int i_1769_ = 0; i_1769_ < i_1628_; i_1769_++) {
		    int i_1770_ = is[i_1769_];
		    if (i_1770_ < anIntArrayArray9487.length) {
			int[] is_1771_ = anIntArrayArray9487[i_1770_];
			for (int i_1772_ = 0; i_1772_ < is_1771_.length;
			     i_1772_++) {
			    Class117 class117
				= aClass117Array9486[is_1771_[i_1772_]];
			    class117.anInt1405 += i_1623_ * 1831486073;
			    class117.anInt1406 += i_1624_ * -108929861;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9487 != null) {
		for (int i_1773_ = 0; i_1773_ < i_1628_; i_1773_++) {
		    int i_1774_ = is[i_1773_];
		    if (i_1774_ < anIntArrayArray9487.length) {
			int[] is_1775_ = anIntArrayArray9487[i_1774_];
			for (int i_1776_ = 0; i_1776_ < is_1775_.length;
			     i_1776_++) {
			    Class117 class117
				= aClass117Array9486[is_1775_[i_1776_]];
			    class117.aFloat1403 = (class117.aFloat1403
						   * (float) i_1623_ / 128.0F);
			    class117.aFloat1404 = (class117.aFloat1404
						   * (float) i_1624_ / 128.0F);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9487 != null) {
		for (int i_1777_ = 0; i_1777_ < i_1628_; i_1777_++) {
		    int i_1778_ = is[i_1777_];
		    if (i_1778_ < anIntArrayArray9487.length) {
			int[] is_1779_ = anIntArrayArray9487[i_1778_];
			for (int i_1780_ = 0; i_1780_ < is_1779_.length;
			     i_1780_++) {
			    Class117 class117
				= aClass117Array9486[is_1779_[i_1780_]];
			    class117.anInt1409
				= (class117.anInt1409 * -133325595 + i_1623_
				   & 0x3fff) * 1832042733;
			}
		    }
		}
	    }
	}
    }
    
    Class183 method15152(Class183_Sub2 class183_sub2_1781_,
			 Class183_Sub2 class183_sub2_1782_, int i,
			 boolean bool, boolean bool_1783_) {
	class183_sub2_1781_.aBool9488 = aBool9488;
	if (aBool9488) {
	    class183_sub2_1781_.aShort9468 = aShort9468;
	    class183_sub2_1781_.aShort9492 = aShort9492;
	    class183_sub2_1781_.aShort9449 = aShort9449;
	    class183_sub2_1781_.aShort9493 = aShort9493;
	    class183_sub2_1781_.aShort9491 = aShort9491;
	    class183_sub2_1781_.aShort9495 = aShort9495;
	    class183_sub2_1781_.aShort9473 = aShort9473;
	    class183_sub2_1781_.aShort9490 = aShort9490;
	}
	if (aBool9512) {
	    class183_sub2_1781_.aShort9498 = aShort9498;
	    class183_sub2_1781_.aBool9512 = true;
	} else
	    class183_sub2_1781_.aBool9512 = false;
	class183_sub2_1781_.anInt9454 = anInt9454;
	class183_sub2_1781_.anInt9443 = anInt9443;
	class183_sub2_1781_.anInt9444 = anInt9444;
	class183_sub2_1781_.anInt9474 = anInt9474;
	class183_sub2_1781_.anInt9440 = anInt9440;
	class183_sub2_1781_.anInt9484 = anInt9484;
	class183_sub2_1781_.anInt9453 = anInt9453;
	if ((i & 0x100) != 0)
	    class183_sub2_1781_.aBool9499 = true;
	else
	    class183_sub2_1781_.aBool9499 = aBool9499;
	class183_sub2_1781_.aBool9500 = aBool9500;
	boolean bool_1784_ = (i & 0x7) == 7 | (i & 0x20) != 0;
	boolean bool_1785_ = bool_1784_ || (i & 0x1) != 0;
	boolean bool_1786_ = bool_1784_ || (i & 0x2) != 0;
	boolean bool_1787_ = bool_1784_ || (i & 0x4) != 0 || (i & 0x10) != 0;
	if (bool_1785_ || bool_1786_ || bool_1787_) {
	    if (bool_1785_) {
		if (class183_sub2_1782_.anIntArray9494 == null
		    || class183_sub2_1782_.anIntArray9494.length < anInt9444)
		    class183_sub2_1781_.anIntArray9494
			= class183_sub2_1782_.anIntArray9494
			= new int[anInt9444];
		else
		    class183_sub2_1781_.anIntArray9494
			= class183_sub2_1782_.anIntArray9494;
		for (int i_1788_ = 0; i_1788_ < anInt9444; i_1788_++)
		    class183_sub2_1781_.anIntArray9494[i_1788_]
			= anIntArray9494[i_1788_];
	    } else
		class183_sub2_1781_.anIntArray9494 = anIntArray9494;
	    if (bool_1786_) {
		if (class183_sub2_1782_.anIntArray9447 == null
		    || class183_sub2_1782_.anIntArray9447.length < anInt9444)
		    class183_sub2_1781_.anIntArray9447
			= class183_sub2_1782_.anIntArray9447
			= new int[anInt9444];
		else
		    class183_sub2_1781_.anIntArray9447
			= class183_sub2_1782_.anIntArray9447;
		for (int i_1789_ = 0; i_1789_ < anInt9444; i_1789_++)
		    class183_sub2_1781_.anIntArray9447[i_1789_]
			= anIntArray9447[i_1789_];
	    } else
		class183_sub2_1781_.anIntArray9447 = anIntArray9447;
	    if (bool_1787_) {
		if (class183_sub2_1782_.anIntArray9448 == null
		    || class183_sub2_1782_.anIntArray9448.length < anInt9444)
		    class183_sub2_1781_.anIntArray9448
			= class183_sub2_1782_.anIntArray9448
			= new int[anInt9444];
		else
		    class183_sub2_1781_.anIntArray9448
			= class183_sub2_1782_.anIntArray9448;
		for (int i_1790_ = 0; i_1790_ < anInt9444; i_1790_++)
		    class183_sub2_1781_.anIntArray9448[i_1790_]
			= anIntArray9448[i_1790_];
	    } else
		class183_sub2_1781_.anIntArray9448 = anIntArray9448;
	} else {
	    class183_sub2_1781_.anIntArray9494 = anIntArray9494;
	    class183_sub2_1781_.anIntArray9447 = anIntArray9447;
	    class183_sub2_1781_.anIntArray9448 = anIntArray9448;
	}
	if ((i & 0x84080) != 0) {
	    if (class183_sub2_1782_.aShortArray9471 == null
		|| class183_sub2_1782_.aShortArray9471.length < anInt9440) {
		int i_1791_ = anInt9440;
		class183_sub2_1781_.aShortArray9471
		    = class183_sub2_1782_.aShortArray9471 = new short[i_1791_];
	    } else
		class183_sub2_1781_.aShortArray9471
		    = class183_sub2_1782_.aShortArray9471;
	    for (int i_1792_ = 0; i_1792_ < anInt9440; i_1792_++)
		class183_sub2_1781_.aShortArray9471[i_1792_]
		    = aShortArray9471[i_1792_];
	} else
	    class183_sub2_1781_.aShortArray9471 = aShortArray9471;
	if ((i & 0x97018) != 0) {
	    class183_sub2_1781_.anInt9432 = 0;
	    Class183_Sub2 class183_sub2_1793_ = class183_sub2_1781_;
	    Class183_Sub2 class183_sub2_1794_ = class183_sub2_1781_;
	    class183_sub2_1781_.anIntArray9461 = null;
	    class183_sub2_1794_.anIntArray9460 = null;
	    class183_sub2_1793_.anIntArray9459 = null;
	} else if ((i & 0x80) != 0) {
	    if (bool_1783_)
		method15115(false);
	    if (anIntArray9459 != null) {
		if (class183_sub2_1782_.anIntArray9459 == null
		    || class183_sub2_1782_.anIntArray9459.length < anInt9440) {
		    int i_1795_ = anInt9440;
		    class183_sub2_1781_.anIntArray9459
			= class183_sub2_1782_.anIntArray9459
			= new int[i_1795_];
		    class183_sub2_1781_.anIntArray9460
			= class183_sub2_1782_.anIntArray9460
			= new int[i_1795_];
		    class183_sub2_1781_.anIntArray9461
			= class183_sub2_1782_.anIntArray9461
			= new int[i_1795_];
		} else {
		    class183_sub2_1781_.anIntArray9459
			= class183_sub2_1782_.anIntArray9459;
		    class183_sub2_1781_.anIntArray9460
			= class183_sub2_1782_.anIntArray9460;
		    class183_sub2_1781_.anIntArray9461
			= class183_sub2_1782_.anIntArray9461;
		}
		for (int i_1796_ = 0; i_1796_ < anInt9440; i_1796_++) {
		    class183_sub2_1781_.anIntArray9459[i_1796_]
			= anIntArray9459[i_1796_];
		    class183_sub2_1781_.anIntArray9460[i_1796_]
			= anIntArray9460[i_1796_];
		    class183_sub2_1781_.anIntArray9461[i_1796_]
			= anIntArray9461[i_1796_];
		}
	    }
	    class183_sub2_1781_.anInt9432 = anInt9432;
	} else {
	    if (bool_1783_)
		method15115(false);
	    class183_sub2_1781_.anIntArray9459 = anIntArray9459;
	    class183_sub2_1781_.anIntArray9460 = anIntArray9460;
	    class183_sub2_1781_.anIntArray9461 = anIntArray9461;
	    class183_sub2_1781_.anInt9432 = anInt9432;
	}
	if ((i & 0x100) != 0) {
	    if (class183_sub2_1782_.aByteArray9469 == null
		|| class183_sub2_1782_.aByteArray9469.length < anInt9440) {
		int i_1797_ = anInt9440;
		class183_sub2_1781_.aByteArray9469
		    = class183_sub2_1782_.aByteArray9469 = new byte[i_1797_];
	    } else
		class183_sub2_1781_.aByteArray9469
		    = class183_sub2_1782_.aByteArray9469;
	    if (aByteArray9469 != null) {
		for (int i_1798_ = 0; i_1798_ < anInt9440; i_1798_++)
		    class183_sub2_1781_.aByteArray9469[i_1798_]
			= aByteArray9469[i_1798_];
	    } else {
		for (int i_1799_ = 0; i_1799_ < anInt9440; i_1799_++)
		    class183_sub2_1781_.aByteArray9469[i_1799_] = (byte) 0;
	    }
	} else
	    class183_sub2_1781_.aByteArray9469 = aByteArray9469;
	if ((i & 0x8) != 0 || (i & 0x10) != 0) {
	    if (class183_sub2_1782_.aClass96Array9450 == null
		|| class183_sub2_1782_.aClass96Array9450.length < anInt9474) {
		int i_1800_ = anInt9474;
		class183_sub2_1781_.aClass96Array9450
		    = class183_sub2_1782_.aClass96Array9450
		    = new Class96[i_1800_];
	    } else
		class183_sub2_1781_.aClass96Array9450
		    = class183_sub2_1782_.aClass96Array9450;
	    if (aClass96Array9450 != null) {
		for (int i_1801_ = 0; i_1801_ < anInt9474; i_1801_++)
		    class183_sub2_1781_.aClass96Array9450[i_1801_]
			= new Class96(aClass96Array9450[i_1801_]);
	    } else
		class183_sub2_1781_.aClass96Array9450 = null;
	    if (aClass107Array9466 != null) {
		if (class183_sub2_1782_.aClass107Array9466 == null
		    || (class183_sub2_1782_.aClass107Array9466.length
			< anInt9440)) {
		    int i_1802_ = anInt9440;
		    class183_sub2_1781_.aClass107Array9466
			= class183_sub2_1782_.aClass107Array9466
			= new Class107[i_1802_];
		} else
		    class183_sub2_1781_.aClass107Array9466
			= class183_sub2_1782_.aClass107Array9466;
		for (int i_1803_ = 0; i_1803_ < anInt9440; i_1803_++)
		    class183_sub2_1781_.aClass107Array9466[i_1803_]
			= (aClass107Array9466[i_1803_] != null
			   ? new Class107(aClass107Array9466[i_1803_]) : null);
	    } else
		class183_sub2_1781_.aClass107Array9466 = null;
	} else {
	    if (bool_1783_)
		method15092();
	    class183_sub2_1781_.aClass96Array9450 = aClass96Array9450;
	    class183_sub2_1781_.aClass107Array9466 = aClass107Array9466;
	}
	if ((i & 0x8000) != 0) {
	    if (aShortArray9428 == null)
		class183_sub2_1781_.aShortArray9428 = null;
	    else {
		if (class183_sub2_1782_.aShortArray9428 == null
		    || (class183_sub2_1782_.aShortArray9428.length
			< anInt9440)) {
		    int i_1804_ = anInt9440;
		    class183_sub2_1781_.aShortArray9428
			= class183_sub2_1782_.aShortArray9428
			= new short[i_1804_];
		} else
		    class183_sub2_1781_.aShortArray9428
			= class183_sub2_1782_.aShortArray9428;
		for (int i_1805_ = 0; i_1805_ < anInt9440; i_1805_++)
		    class183_sub2_1781_.aShortArray9428[i_1805_]
			= aShortArray9428[i_1805_];
	    }
	} else
	    class183_sub2_1781_.aShortArray9428 = aShortArray9428;
	if ((i & 0x10000) != 0) {
	    if (aByteArray9467 == null)
		class183_sub2_1781_.aByteArray9467 = null;
	    else {
		if (class183_sub2_1782_.aByteArray9467 == null
		    || class183_sub2_1782_.aByteArray9467.length < anInt9440) {
		    int i_1806_ = bool ? anInt9440 + 100 : anInt9440;
		    class183_sub2_1781_.aByteArray9467
			= class183_sub2_1782_.aByteArray9467
			= new byte[i_1806_];
		} else
		    class183_sub2_1781_.aByteArray9467
			= class183_sub2_1782_.aByteArray9467;
		for (int i_1807_ = 0; i_1807_ < anInt9440; i_1807_++)
		    class183_sub2_1781_.aByteArray9467[i_1807_]
			= aByteArray9467[i_1807_];
	    }
	} else
	    class183_sub2_1781_.aByteArray9467 = aByteArray9467;
	if ((i & 0xc580) != 0) {
	    if (class183_sub2_1782_.aClass117Array9486 == null
		|| class183_sub2_1782_.aClass117Array9486.length < anInt9484) {
		int i_1808_ = anInt9484;
		class183_sub2_1781_.aClass117Array9486
		    = class183_sub2_1782_.aClass117Array9486
		    = new Class117[i_1808_];
		for (int i_1809_ = 0; i_1809_ < anInt9484; i_1809_++)
		    class183_sub2_1781_.aClass117Array9486[i_1809_]
			= aClass117Array9486[i_1809_].method2120((byte) 107);
	    } else {
		class183_sub2_1781_.aClass117Array9486
		    = class183_sub2_1782_.aClass117Array9486;
		for (int i_1810_ = 0; i_1810_ < anInt9484; i_1810_++)
		    class183_sub2_1781_.aClass117Array9486[i_1810_]
			.method2119(aClass117Array9486[i_1810_], -1821637820);
	    }
	} else
	    class183_sub2_1781_.aClass117Array9486 = aClass117Array9486;
	if (aFloatArrayArray9452 != null && (i & 0x10) != 0) {
	    if (class183_sub2_1782_.aFloatArrayArray9452 == null
		|| (class183_sub2_1782_.aFloatArrayArray9452.length
		    < anInt9440)) {
		int i_1811_ = bool ? anInt9440 + 100 : anInt9440;
		class183_sub2_1781_.aFloatArrayArray9452
		    = class183_sub2_1782_.aFloatArrayArray9452
		    = new float[i_1811_][3];
	    } else
		class183_sub2_1781_.aFloatArrayArray9452
		    = class183_sub2_1782_.aFloatArrayArray9452;
	    for (int i_1812_ = 0; i_1812_ < anInt9440; i_1812_++) {
		if (aFloatArrayArray9452[i_1812_] != null) {
		    class183_sub2_1781_.aFloatArrayArray9452[i_1812_][0]
			= aFloatArrayArray9452[i_1812_][0];
		    class183_sub2_1781_.aFloatArrayArray9452[i_1812_][1]
			= aFloatArrayArray9452[i_1812_][1];
		    class183_sub2_1781_.aFloatArrayArray9452[i_1812_][2]
			= aFloatArrayArray9452[i_1812_][2];
		}
	    }
	    if (class183_sub2_1782_.aFloatArrayArray9429 == null
		|| (class183_sub2_1782_.aFloatArrayArray9429.length
		    < anInt9440)) {
		int i_1813_ = bool ? anInt9440 + 100 : anInt9440;
		class183_sub2_1781_.aFloatArrayArray9429
		    = class183_sub2_1782_.aFloatArrayArray9429
		    = new float[i_1813_][3];
	    } else
		class183_sub2_1781_.aFloatArrayArray9429
		    = class183_sub2_1782_.aFloatArrayArray9429;
	    for (int i_1814_ = 0; i_1814_ < anInt9440; i_1814_++) {
		if (aFloatArrayArray9429[i_1814_] != null) {
		    class183_sub2_1781_.aFloatArrayArray9429[i_1814_][0]
			= aFloatArrayArray9429[i_1814_][0];
		    class183_sub2_1781_.aFloatArrayArray9429[i_1814_][1]
			= aFloatArrayArray9429[i_1814_][1];
		    class183_sub2_1781_.aFloatArrayArray9429[i_1814_][2]
			= aFloatArrayArray9429[i_1814_][2];
		}
	    }
	} else {
	    class183_sub2_1781_.aFloatArrayArray9452 = aFloatArrayArray9452;
	    class183_sub2_1781_.aFloatArrayArray9429 = aFloatArrayArray9429;
	}
	class183_sub2_1781_.anIntArrayArray9470 = anIntArrayArray9470;
	class183_sub2_1781_.anIntArrayArray9457 = anIntArrayArray9457;
	class183_sub2_1781_.anIntArrayArray9487 = anIntArrayArray9487;
	class183_sub2_1781_.aShortArray9445 = aShortArray9445;
	class183_sub2_1781_.aShortArray9472 = aShortArray9472;
	class183_sub2_1781_.aByteArray9430 = aByteArray9430;
	class183_sub2_1781_.aShortArray9479 = aShortArray9479;
	class183_sub2_1781_.aShortArray9455 = aShortArray9455;
	class183_sub2_1781_.aShortArray9456 = aShortArray9456;
	class183_sub2_1781_.aClass172Array9482 = aClass172Array9482;
	class183_sub2_1781_.aClass158Array9483 = aClass158Array9483;
	class183_sub2_1781_.aClass118Array9485 = aClass118Array9485;
	class183_sub2_1781_.aShortArray9446 = aShortArray9446;
	class183_sub2_1781_.anInt9441 = i;
	return class183_sub2_1781_;
    }
    
    public int method3064() {
	if (!aBool9488)
	    method15173();
	return aShort9491;
    }
    
    public void method3105(Class446 class446, int i, boolean bool) {
	if (aShortArray9445 != null) {
	    Class101 class101
		= aClass185_Sub2_9475.method15011(Thread.currentThread());
	    Class446 class446_1815_ = class101.aClass446_1215;
	    class446_1815_.method7236(class446);
	    if (bool)
		class446_1815_.method7243();
	    Class433 class433 = class101.aClass433_1224;
	    class433.method6916(class446_1815_);
	    float[] fs = new float[3];
	    for (int i_1816_ = 0; i_1816_ < anInt9474; i_1816_++) {
		if ((i & aShortArray9445[i_1816_]) != 0) {
		    class433.method6850((float) anIntArray9494[i_1816_],
					(float) anIntArray9447[i_1816_],
					(float) anIntArray9448[i_1816_], fs);
		    anIntArray9494[i_1816_] = (int) fs[0];
		    anIntArray9447[i_1816_] = (int) fs[1];
		    anIntArray9448[i_1816_] = (int) fs[2];
		}
	    }
	}
    }
    
    public int method3140() {
	if (!aBool9488)
	    method15173();
	return aShort9495;
    }
    
    public void method3169(Class446 class446, Class194 class194, int i) {
	method15110(class446, class194, i);
    }
    
    public void method3035(Class446 class446, Class194 class194, int i) {
	method15110(class446, class194, i);
    }
    
    public Class172[] method3168() {
	return aClass172Array9482;
    }
    
    void method15153(Class446 class446, Class194 class194, int i) {
	if (anInt9474 >= 1) {
	    Class101 class101
		= aClass185_Sub2_9475.method15011(Thread.currentThread());
	    Class433 class433 = class101.aClass433_1224;
	    class433.method6916(class446);
	    Class433 class433_1817_ = aClass185_Sub2_9475.aClass433_9353;
	    Class433 class433_1818_ = aClass185_Sub2_9475.aClass433_9362;
	    if (!aBool9488)
		method15173();
	    boolean bool = class433.method6927();
	    float[] fs = class101.aFloatArray1225;
	    class433.method6850(0.0F, (float) aShort9491, 0.0F, fs);
	    float f = fs[0];
	    float f_1819_ = fs[1];
	    float f_1820_ = fs[2];
	    class433.method6850(0.0F, (float) aShort9492, 0.0F, fs);
	    float f_1821_ = fs[0];
	    float f_1822_ = fs[1];
	    float f_1823_ = fs[2];
	    for (int i_1824_ = 0; i_1824_ < 6; i_1824_++) {
		float[] fs_1825_
		    = aClass185_Sub2_9475.aFloatArrayArray9355[i_1824_];
		float f_1826_ = (fs_1825_[0] * f + fs_1825_[1] * f_1819_
				 + fs_1825_[2] * f_1820_ + fs_1825_[3]
				 + (float) aShort9473);
		float f_1827_ = (fs_1825_[0] * f_1821_ + fs_1825_[1] * f_1822_
				 + fs_1825_[2] * f_1823_ + fs_1825_[3]
				 + (float) aShort9473);
		if (f_1826_ < 0.0F && f_1827_ < 0.0F)
		    return;
	    }
	    float f_1828_;
	    float f_1829_;
	    if (bool) {
		f_1828_ = class433_1817_.aFloatArray4853[14];
		f_1829_ = class433_1817_.aFloatArray4853[6];
	    } else {
		f_1828_ = ((class433.aFloatArray4853[12]
			    * class433_1817_.aFloatArray4853[2])
			   + (class433.aFloatArray4853[13]
			      * class433_1817_.aFloatArray4853[6])
			   + (class433.aFloatArray4853[14]
			      * class433_1817_.aFloatArray4853[10])
			   + class433_1817_.aFloatArray4853[14]);
		f_1829_ = ((class433.aFloatArray4853[4]
			    * class433_1817_.aFloatArray4853[2])
			   + (class433.aFloatArray4853[5]
			      * class433_1817_.aFloatArray4853[6])
			   + (class433.aFloatArray4853[6]
			      * class433_1817_.aFloatArray4853[10]));
	    }
	    float f_1830_ = f_1828_ + (float) aShort9491 * f_1829_;
	    float f_1831_ = f_1828_ + (float) aShort9492 * f_1829_;
	    float f_1832_ = (f_1830_ > f_1831_ ? f_1830_ + (float) aShort9473
			     : f_1831_ + (float) aShort9473);
	    float f_1833_ = (class433_1818_.aFloatArray4853[10] * f_1832_
			     + class433_1818_.aFloatArray4853[14]);
	    if (aClass185_Sub2_9475.anInt9367 * 442227785 > 1) {
		synchronized (this) {
		    while (aBool9497) {
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
		    }
		    aBool9497 = true;
		}
	    }
	    method15091(class101);
	    Class433 class433_1834_ = aClass101_9437.aClass433_1217;
	    class433_1834_.method6842(class433);
	    class433_1834_.method6839(aClass185_Sub2_9475.aClass433_9346);
	    if ((i & 0x2) != 0)
		aClass119_9489.method2138(true);
	    else
		aClass119_9489.method2138(false);
	    boolean bool_1835_ = false;
	    aClass101_9437.aFloat1232 = aClass119_9489.aFloat1430;
	    aClass101_9437.aFloat1231 = aClass119_9489.aFloat1432;
	    aClass101_9437.aFloat1223 = aClass119_9489.aFloat1434;
	    aClass101_9437.aFloat1219 = 1.0F / aClass119_9489.aFloat1434;
	    aClass101_9437.aFloat1200 = aClass119_9489.aFloat1429;
	    aClass101_9437.aFloat1230 = aClass119_9489.aFloat1431;
	    aClass101_9437.aFloat1234 = aClass119_9489.aFloat1433;
	    aClass101_9437.anInt1236 = aClass119_9489.anInt1448 * -1381436949;
	    for (int i_1836_ = 0; i_1836_ < anInt9444; i_1836_++) {
		int i_1837_ = anIntArray9494[i_1836_];
		int i_1838_ = anIntArray9447[i_1836_];
		int i_1839_ = anIntArray9448[i_1836_];
		float f_1840_
		    = (class433_1834_.aFloatArray4853[0] * (float) i_1837_
		       + class433_1834_.aFloatArray4853[4] * (float) i_1838_
		       + class433_1834_.aFloatArray4853[8] * (float) i_1839_
		       + class433_1834_.aFloatArray4853[12]);
		float f_1841_
		    = (class433_1834_.aFloatArray4853[1] * (float) i_1837_
		       + class433_1834_.aFloatArray4853[5] * (float) i_1838_
		       + class433_1834_.aFloatArray4853[9] * (float) i_1839_
		       + class433_1834_.aFloatArray4853[13]);
		float f_1842_
		    = (class433_1834_.aFloatArray4853[2] * (float) i_1837_
		       + class433_1834_.aFloatArray4853[6] * (float) i_1838_
		       + class433_1834_.aFloatArray4853[10] * (float) i_1839_
		       + class433_1834_.aFloatArray4853[14]);
		float f_1843_
		    = (class433_1834_.aFloatArray4853[3] * (float) i_1837_
		       + class433_1834_.aFloatArray4853[7] * (float) i_1838_
		       + class433_1834_.aFloatArray4853[11] * (float) i_1839_
		       + class433_1834_.aFloatArray4853[15]);
		aFloatArray9505[i_1836_]
		    = (aClass101_9437.aFloat1234
		       + aClass101_9437.aFloat1223 * f_1842_ / f_1843_);
		aFloatArray9506[i_1836_] = f_1843_;
		if (f_1842_ >= -f_1843_) {
		    aFloatArray9503[i_1836_]
			= (float) (int) (aClass101_9437.aFloat1200
					 + (aClass101_9437.aFloat1232 * f_1840_
					    / f_1843_));
		    aFloatArray9496[i_1836_]
			= (float) (int) (aClass101_9437.aFloat1230
					 + (aClass101_9437.aFloat1231 * f_1841_
					    / f_1843_));
		} else {
		    aFloatArray9503[i_1836_] = -5000.0F;
		    bool_1835_ = true;
		}
		if (aClass101_9437.aBool1245)
		    anIntArray9502[i_1836_]
			= (int) (class433.aFloatArray4853[13]
				 + ((class433.aFloatArray4853[1]
				     * (float) i_1837_)
				    + (class433.aFloatArray4853[5]
				       * (float) i_1838_)
				    + (class433.aFloatArray4853[9]
				       * (float) i_1839_)));
	    }
	    if (aClass118Array9485 != null) {
		for (int i_1844_ = 0; i_1844_ < anInt9484; i_1844_++) {
		    Class118 class118 = aClass118Array9485[i_1844_];
		    Class117 class117 = aClass117Array9486[i_1844_];
		    short i_1845_
			= aShortArray9479[class118.anInt1418 * 2118166057];
		    short i_1846_
			= aShortArray9455[class118.anInt1418 * 2118166057];
		    short i_1847_
			= aShortArray9456[class118.anInt1418 * 2118166057];
		    int i_1848_
			= ((anIntArray9494[i_1845_] + anIntArray9494[i_1846_]
			    + anIntArray9494[i_1847_])
			   / 3);
		    int i_1849_
			= ((anIntArray9447[i_1845_] + anIntArray9447[i_1846_]
			    + anIntArray9447[i_1847_])
			   / 3);
		    int i_1850_
			= ((anIntArray9448[i_1845_] + anIntArray9448[i_1846_]
			    + anIntArray9448[i_1847_])
			   / 3);
		    float f_1851_
			= (class433_1834_.aFloatArray4853[0] * (float) i_1848_
			   + (class433_1834_.aFloatArray4853[4]
			      * (float) i_1849_)
			   + (class433_1834_.aFloatArray4853[8]
			      * (float) i_1850_)
			   + class433_1834_.aFloatArray4853[12]);
		    float f_1852_
			= (class433_1834_.aFloatArray4853[1] * (float) i_1848_
			   + (class433_1834_.aFloatArray4853[5]
			      * (float) i_1849_)
			   + (class433_1834_.aFloatArray4853[9]
			      * (float) i_1850_)
			   + class433_1834_.aFloatArray4853[13]);
		    float f_1853_
			= (class433_1834_.aFloatArray4853[2] * (float) i_1848_
			   + (class433_1834_.aFloatArray4853[6]
			      * (float) i_1849_)
			   + (class433_1834_.aFloatArray4853[10]
			      * (float) i_1850_)
			   + class433_1834_.aFloatArray4853[14]);
		    float f_1854_
			= (class433_1834_.aFloatArray4853[3] * (float) i_1848_
			   + (class433_1834_.aFloatArray4853[7]
			      * (float) i_1849_)
			   + (class433_1834_.aFloatArray4853[11]
			      * (float) i_1850_)
			   + class433_1834_.aFloatArray4853[15]);
		    f_1853_
			+= ((class433_1818_.aFloatArray4853[2]
			     * (float) (class117.anInt1405 * -169572407))
			    + (class433_1818_.aFloatArray4853[6]
			       * (float) (class117.anInt1406 * -653522829)));
		    f_1854_
			+= ((class433_1818_.aFloatArray4853[3]
			     * (float) (class117.anInt1405 * -169572407))
			    + (class433_1818_.aFloatArray4853[7]
			       * (float) (class117.anInt1406 * -653522829)));
		    if (f_1853_ > -f_1854_) {
			f_1851_
			    += ((class433_1818_.aFloatArray4853[0]
				 * (float) (class117.anInt1405 * -169572407))
				+ (class433_1818_.aFloatArray4853[4]
				   * (float) (class117.anInt1406
					      * -653522829)));
			f_1852_
			    += ((class433_1818_.aFloatArray4853[1]
				 * (float) (class117.anInt1405 * -169572407))
				+ (class433_1818_.aFloatArray4853[5]
				   * (float) (class117.anInt1406
					      * -653522829)));
			float f_1855_ = (aClass185_Sub2_9475.aFloat9342
					 + (aClass185_Sub2_9475.aFloat9361
					    * f_1851_ / f_1854_));
			float f_1856_ = (aClass185_Sub2_9475.aFloat9368
					 + (aClass185_Sub2_9475.aFloat9363
					    * f_1852_ / f_1854_));
			float f_1857_ = (class117.aFloat1403
					 * (float) class118.aShort1414);
			float f_1858_ = (class117.aFloat1404
					 * (float) class118.aShort1413);
			float f_1859_
			    = (f_1851_
			       + class433_1818_.aFloatArray4853[0] * f_1857_
			       + class433_1818_.aFloatArray4853[4] * f_1858_);
			float f_1860_
			    = (f_1852_
			       + class433_1818_.aFloatArray4853[1] * f_1857_
			       + class433_1818_.aFloatArray4853[5] * f_1858_);
			float f_1861_
			    = (f_1854_
			       + class433_1818_.aFloatArray4853[3] * f_1857_
			       + class433_1818_.aFloatArray4853[7] * f_1858_);
			float f_1862_ = (aClass185_Sub2_9475.aFloat9342
					 + (aClass185_Sub2_9475.aFloat9361
					    * f_1859_ / f_1861_));
			float f_1863_ = (aClass185_Sub2_9475.aFloat9368
					 + (aClass185_Sub2_9475.aFloat9363
					    * f_1860_ / f_1861_));
			class117.anInt1407 = (int) f_1855_ * -1511174311;
			class117.anInt1412 = (int) f_1856_ * -773687655;
			class117.aFloat1410
			    = (aClass185_Sub2_9475.aFloat9366
			       + (aClass185_Sub2_9475.aFloat9349
				  * (f_1853_
				     - (class433_1818_.aFloatArray4853[10]
					* (float) (class118.anInt1420
						   * 734303979)))
				  / f_1854_));
			class117.anInt1402
			    = (int) (f_1862_ < f_1855_ ? f_1855_ - f_1862_
				     : f_1862_ - f_1855_) * -620105347;
			class117.anInt1408
			    = (int) (f_1863_ < f_1856_ ? f_1856_ - f_1863_
				     : f_1863_ - f_1856_) * 660144177;
		    } else {
			Class117 class117_1864_ = class117;
			class117.anInt1408 = 0;
			class117_1864_.anInt1402 = 0;
		    }
		}
	    }
	    if (class194 != null) {
		boolean bool_1865_ = false;
		boolean bool_1866_ = true;
		int i_1867_ = aShort9493 + aShort9468 >> 1;
		int i_1868_ = aShort9495 + aShort9449 >> 1;
		int i_1869_ = i_1867_;
		short i_1870_ = aShort9491;
		int i_1871_ = i_1868_;
		float f_1872_
		    = (class433_1834_.aFloatArray4853[0] * (float) i_1869_
		       + class433_1834_.aFloatArray4853[4] * (float) i_1870_
		       + class433_1834_.aFloatArray4853[8] * (float) i_1871_
		       + class433_1834_.aFloatArray4853[12]);
		float f_1873_
		    = (class433_1834_.aFloatArray4853[1] * (float) i_1869_
		       + class433_1834_.aFloatArray4853[5] * (float) i_1870_
		       + class433_1834_.aFloatArray4853[9] * (float) i_1871_
		       + class433_1834_.aFloatArray4853[13]);
		float f_1874_
		    = (class433_1834_.aFloatArray4853[2] * (float) i_1869_
		       + class433_1834_.aFloatArray4853[6] * (float) i_1870_
		       + class433_1834_.aFloatArray4853[10] * (float) i_1871_
		       + class433_1834_.aFloatArray4853[14]);
		float f_1875_
		    = (class433_1834_.aFloatArray4853[3] * (float) i_1869_
		       + class433_1834_.aFloatArray4853[7] * (float) i_1870_
		       + class433_1834_.aFloatArray4853[11] * (float) i_1871_
		       + class433_1834_.aFloatArray4853[15]);
		if (f_1874_ >= -f_1875_) {
		    class194.anInt2148
			= (int) (aClass185_Sub2_9475.aFloat9342
				 + (aClass185_Sub2_9475.aFloat9361 * f_1872_
				    / f_1875_));
		    class194.anInt2149
			= (int) (aClass185_Sub2_9475.aFloat9368
				 + (aClass185_Sub2_9475.aFloat9363 * f_1873_
				    / f_1875_));
		} else
		    bool_1865_ = true;
		i_1869_ = i_1867_;
		i_1870_ = aShort9492;
		i_1871_ = i_1868_;
		float f_1876_
		    = (class433_1834_.aFloatArray4853[0] * (float) i_1869_
		       + class433_1834_.aFloatArray4853[4] * (float) i_1870_
		       + class433_1834_.aFloatArray4853[8] * (float) i_1871_
		       + class433_1834_.aFloatArray4853[12]);
		float f_1877_
		    = (class433_1834_.aFloatArray4853[1] * (float) i_1869_
		       + class433_1834_.aFloatArray4853[5] * (float) i_1870_
		       + class433_1834_.aFloatArray4853[9] * (float) i_1871_
		       + class433_1834_.aFloatArray4853[13]);
		float f_1878_
		    = (class433_1834_.aFloatArray4853[2] * (float) i_1869_
		       + class433_1834_.aFloatArray4853[6] * (float) i_1870_
		       + class433_1834_.aFloatArray4853[10] * (float) i_1871_
		       + class433_1834_.aFloatArray4853[14]);
		float f_1879_
		    = (class433_1834_.aFloatArray4853[3] * (float) i_1869_
		       + class433_1834_.aFloatArray4853[7] * (float) i_1870_
		       + class433_1834_.aFloatArray4853[11] * (float) i_1871_
		       + class433_1834_.aFloatArray4853[15]);
		if (f_1878_ >= -f_1879_) {
		    class194.anInt2152
			= (int) (aClass185_Sub2_9475.aFloat9342
				 + (aClass185_Sub2_9475.aFloat9361 * f_1876_
				    / f_1879_));
		    class194.anInt2151
			= (int) (aClass185_Sub2_9475.aFloat9368
				 + (aClass185_Sub2_9475.aFloat9363 * f_1877_
				    / f_1879_));
		} else
		    bool_1865_ = true;
		if (bool_1865_) {
		    if (f_1874_ < -f_1875_ && f_1878_ < -f_1879_)
			bool_1866_ = false;
		    else if (f_1874_ < -f_1875_) {
			float f_1880_
			    = (f_1874_ + f_1875_) / (f_1878_ + f_1879_) - 1.0F;
			float f_1881_
			    = f_1872_ + f_1880_ * (f_1876_ - f_1872_);
			float f_1882_
			    = f_1873_ + f_1880_ * (f_1877_ - f_1873_);
			float f_1883_
			    = f_1875_ + f_1880_ * (f_1879_ - f_1875_);
			class194.anInt2148
			    = (int) (aClass185_Sub2_9475.aFloat9342
				     + (aClass185_Sub2_9475.aFloat9361
					* f_1881_ / f_1883_));
			class194.anInt2149
			    = (int) (aClass185_Sub2_9475.aFloat9368
				     + (aClass185_Sub2_9475.aFloat9363
					* f_1882_ / f_1883_));
		    } else if (f_1878_ < -f_1879_) {
			float f_1884_
			    = (f_1878_ + f_1879_) / (f_1874_ + f_1875_) - 1.0F;
			float f_1885_
			    = f_1876_ + f_1884_ * (f_1872_ - f_1876_);
			float f_1886_
			    = f_1877_ + f_1884_ * (f_1873_ - f_1877_);
			float f_1887_
			    = f_1879_ + f_1884_ * (f_1875_ - f_1879_);
			class194.anInt2152
			    = (int) (aClass185_Sub2_9475.aFloat9342
				     + (aClass185_Sub2_9475.aFloat9361
					* f_1885_ / f_1887_));
			class194.anInt2151
			    = (int) (aClass185_Sub2_9475.aFloat9368
				     + (aClass185_Sub2_9475.aFloat9363
					* f_1886_ / f_1887_));
		    }
		}
		if (bool_1866_) {
		    if (f_1874_ / f_1875_ > f_1878_ / f_1879_) {
			float f_1888_ = (f_1872_
					 + (class433_1818_.aFloatArray4853[0]
					    * (float) aShort9473)
					 + class433_1818_.aFloatArray4853[12]);
			float f_1889_ = (f_1875_
					 + (class433_1818_.aFloatArray4853[3]
					    * (float) aShort9473)
					 + class433_1818_.aFloatArray4853[15]);
			class194.anInt2147
			    = (int) (aClass185_Sub2_9475.aFloat9342
				     - (float) class194.anInt2148
				     + (aClass185_Sub2_9475.aFloat9361
					* f_1888_ / f_1889_));
		    } else {
			float f_1890_ = (f_1876_
					 + (class433_1818_.aFloatArray4853[0]
					    * (float) aShort9473)
					 + class433_1818_.aFloatArray4853[12]);
			float f_1891_ = (f_1879_
					 + (class433_1818_.aFloatArray4853[3]
					    * (float) aShort9473)
					 + class433_1818_.aFloatArray4853[15]);
			class194.anInt2147
			    = (int) (aClass185_Sub2_9475.aFloat9342
				     - (float) class194.anInt2152
				     + (aClass185_Sub2_9475.aFloat9361
					* f_1890_ / f_1891_));
		    }
		    class194.aBool2150 = true;
		}
	    }
	    method15115(true);
	    aClass119_9489.aBool1423 = (i & 0x1) == 0;
	    aClass119_9489.aBool1424 = false;
	    try {
		method15111(aClass185_Sub2_9475.anIntArray9338 != null,
			    aClass185_Sub2_9475.aFloatArray9341 != null,
			    (i & 0x4) != 0, bool_1835_,
			    ((aClass101_9437.aBool1203
			      && f_1833_ > aClass101_9437.aFloat1204)
			     || aClass101_9437.aBool1245));
	    } catch (Exception exception) {
		/* empty */
	    }
	    if (aClass118Array9485 != null) {
		for (int i_1892_ = 0; i_1892_ < anInt9440; i_1892_++)
		    anIntArray9442[i_1892_] = -1;
	    }
	    aClass119_9489 = null;
	    if (aClass185_Sub2_9475.anInt9367 * 442227785 > 1) {
		synchronized (this) {
		    aBool9497 = false;
		    this.notifyAll();
		}
	    }
	}
    }
    
    void method15154(Class446 class446, Class194 class194, int i) {
	if (anInt9474 >= 1) {
	    Class101 class101
		= aClass185_Sub2_9475.method15011(Thread.currentThread());
	    Class433 class433 = class101.aClass433_1224;
	    class433.method6916(class446);
	    Class433 class433_1893_ = aClass185_Sub2_9475.aClass433_9353;
	    Class433 class433_1894_ = aClass185_Sub2_9475.aClass433_9362;
	    if (!aBool9488)
		method15173();
	    boolean bool = class433.method6927();
	    float[] fs = class101.aFloatArray1225;
	    class433.method6850(0.0F, (float) aShort9491, 0.0F, fs);
	    float f = fs[0];
	    float f_1895_ = fs[1];
	    float f_1896_ = fs[2];
	    class433.method6850(0.0F, (float) aShort9492, 0.0F, fs);
	    float f_1897_ = fs[0];
	    float f_1898_ = fs[1];
	    float f_1899_ = fs[2];
	    for (int i_1900_ = 0; i_1900_ < 6; i_1900_++) {
		float[] fs_1901_
		    = aClass185_Sub2_9475.aFloatArrayArray9355[i_1900_];
		float f_1902_ = (fs_1901_[0] * f + fs_1901_[1] * f_1895_
				 + fs_1901_[2] * f_1896_ + fs_1901_[3]
				 + (float) aShort9473);
		float f_1903_ = (fs_1901_[0] * f_1897_ + fs_1901_[1] * f_1898_
				 + fs_1901_[2] * f_1899_ + fs_1901_[3]
				 + (float) aShort9473);
		if (f_1902_ < 0.0F && f_1903_ < 0.0F)
		    return;
	    }
	    float f_1904_;
	    float f_1905_;
	    if (bool) {
		f_1904_ = class433_1893_.aFloatArray4853[14];
		f_1905_ = class433_1893_.aFloatArray4853[6];
	    } else {
		f_1904_ = ((class433.aFloatArray4853[12]
			    * class433_1893_.aFloatArray4853[2])
			   + (class433.aFloatArray4853[13]
			      * class433_1893_.aFloatArray4853[6])
			   + (class433.aFloatArray4853[14]
			      * class433_1893_.aFloatArray4853[10])
			   + class433_1893_.aFloatArray4853[14]);
		f_1905_ = ((class433.aFloatArray4853[4]
			    * class433_1893_.aFloatArray4853[2])
			   + (class433.aFloatArray4853[5]
			      * class433_1893_.aFloatArray4853[6])
			   + (class433.aFloatArray4853[6]
			      * class433_1893_.aFloatArray4853[10]));
	    }
	    float f_1906_ = f_1904_ + (float) aShort9491 * f_1905_;
	    float f_1907_ = f_1904_ + (float) aShort9492 * f_1905_;
	    float f_1908_ = (f_1906_ > f_1907_ ? f_1906_ + (float) aShort9473
			     : f_1907_ + (float) aShort9473);
	    float f_1909_ = (class433_1894_.aFloatArray4853[10] * f_1908_
			     + class433_1894_.aFloatArray4853[14]);
	    if (aClass185_Sub2_9475.anInt9367 * 442227785 > 1) {
		synchronized (this) {
		    while (aBool9497) {
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
		    }
		    aBool9497 = true;
		}
	    }
	    method15091(class101);
	    Class433 class433_1910_ = aClass101_9437.aClass433_1217;
	    class433_1910_.method6842(class433);
	    class433_1910_.method6839(aClass185_Sub2_9475.aClass433_9346);
	    if ((i & 0x2) != 0)
		aClass119_9489.method2138(true);
	    else
		aClass119_9489.method2138(false);
	    boolean bool_1911_ = false;
	    aClass101_9437.aFloat1232 = aClass119_9489.aFloat1430;
	    aClass101_9437.aFloat1231 = aClass119_9489.aFloat1432;
	    aClass101_9437.aFloat1223 = aClass119_9489.aFloat1434;
	    aClass101_9437.aFloat1219 = 1.0F / aClass119_9489.aFloat1434;
	    aClass101_9437.aFloat1200 = aClass119_9489.aFloat1429;
	    aClass101_9437.aFloat1230 = aClass119_9489.aFloat1431;
	    aClass101_9437.aFloat1234 = aClass119_9489.aFloat1433;
	    aClass101_9437.anInt1236 = aClass119_9489.anInt1448 * -1381436949;
	    for (int i_1912_ = 0; i_1912_ < anInt9444; i_1912_++) {
		int i_1913_ = anIntArray9494[i_1912_];
		int i_1914_ = anIntArray9447[i_1912_];
		int i_1915_ = anIntArray9448[i_1912_];
		float f_1916_
		    = (class433_1910_.aFloatArray4853[0] * (float) i_1913_
		       + class433_1910_.aFloatArray4853[4] * (float) i_1914_
		       + class433_1910_.aFloatArray4853[8] * (float) i_1915_
		       + class433_1910_.aFloatArray4853[12]);
		float f_1917_
		    = (class433_1910_.aFloatArray4853[1] * (float) i_1913_
		       + class433_1910_.aFloatArray4853[5] * (float) i_1914_
		       + class433_1910_.aFloatArray4853[9] * (float) i_1915_
		       + class433_1910_.aFloatArray4853[13]);
		float f_1918_
		    = (class433_1910_.aFloatArray4853[2] * (float) i_1913_
		       + class433_1910_.aFloatArray4853[6] * (float) i_1914_
		       + class433_1910_.aFloatArray4853[10] * (float) i_1915_
		       + class433_1910_.aFloatArray4853[14]);
		float f_1919_
		    = (class433_1910_.aFloatArray4853[3] * (float) i_1913_
		       + class433_1910_.aFloatArray4853[7] * (float) i_1914_
		       + class433_1910_.aFloatArray4853[11] * (float) i_1915_
		       + class433_1910_.aFloatArray4853[15]);
		aFloatArray9505[i_1912_]
		    = (aClass101_9437.aFloat1234
		       + aClass101_9437.aFloat1223 * f_1918_ / f_1919_);
		aFloatArray9506[i_1912_] = f_1919_;
		if (f_1918_ >= -f_1919_) {
		    aFloatArray9503[i_1912_]
			= (float) (int) (aClass101_9437.aFloat1200
					 + (aClass101_9437.aFloat1232 * f_1916_
					    / f_1919_));
		    aFloatArray9496[i_1912_]
			= (float) (int) (aClass101_9437.aFloat1230
					 + (aClass101_9437.aFloat1231 * f_1917_
					    / f_1919_));
		} else {
		    aFloatArray9503[i_1912_] = -5000.0F;
		    bool_1911_ = true;
		}
		if (aClass101_9437.aBool1245)
		    anIntArray9502[i_1912_]
			= (int) (class433.aFloatArray4853[13]
				 + ((class433.aFloatArray4853[1]
				     * (float) i_1913_)
				    + (class433.aFloatArray4853[5]
				       * (float) i_1914_)
				    + (class433.aFloatArray4853[9]
				       * (float) i_1915_)));
	    }
	    if (aClass118Array9485 != null) {
		for (int i_1920_ = 0; i_1920_ < anInt9484; i_1920_++) {
		    Class118 class118 = aClass118Array9485[i_1920_];
		    Class117 class117 = aClass117Array9486[i_1920_];
		    short i_1921_
			= aShortArray9479[class118.anInt1418 * 2118166057];
		    short i_1922_
			= aShortArray9455[class118.anInt1418 * 2118166057];
		    short i_1923_
			= aShortArray9456[class118.anInt1418 * 2118166057];
		    int i_1924_
			= ((anIntArray9494[i_1921_] + anIntArray9494[i_1922_]
			    + anIntArray9494[i_1923_])
			   / 3);
		    int i_1925_
			= ((anIntArray9447[i_1921_] + anIntArray9447[i_1922_]
			    + anIntArray9447[i_1923_])
			   / 3);
		    int i_1926_
			= ((anIntArray9448[i_1921_] + anIntArray9448[i_1922_]
			    + anIntArray9448[i_1923_])
			   / 3);
		    float f_1927_
			= (class433_1910_.aFloatArray4853[0] * (float) i_1924_
			   + (class433_1910_.aFloatArray4853[4]
			      * (float) i_1925_)
			   + (class433_1910_.aFloatArray4853[8]
			      * (float) i_1926_)
			   + class433_1910_.aFloatArray4853[12]);
		    float f_1928_
			= (class433_1910_.aFloatArray4853[1] * (float) i_1924_
			   + (class433_1910_.aFloatArray4853[5]
			      * (float) i_1925_)
			   + (class433_1910_.aFloatArray4853[9]
			      * (float) i_1926_)
			   + class433_1910_.aFloatArray4853[13]);
		    float f_1929_
			= (class433_1910_.aFloatArray4853[2] * (float) i_1924_
			   + (class433_1910_.aFloatArray4853[6]
			      * (float) i_1925_)
			   + (class433_1910_.aFloatArray4853[10]
			      * (float) i_1926_)
			   + class433_1910_.aFloatArray4853[14]);
		    float f_1930_
			= (class433_1910_.aFloatArray4853[3] * (float) i_1924_
			   + (class433_1910_.aFloatArray4853[7]
			      * (float) i_1925_)
			   + (class433_1910_.aFloatArray4853[11]
			      * (float) i_1926_)
			   + class433_1910_.aFloatArray4853[15]);
		    f_1929_
			+= ((class433_1894_.aFloatArray4853[2]
			     * (float) (class117.anInt1405 * -169572407))
			    + (class433_1894_.aFloatArray4853[6]
			       * (float) (class117.anInt1406 * -653522829)));
		    f_1930_
			+= ((class433_1894_.aFloatArray4853[3]
			     * (float) (class117.anInt1405 * -169572407))
			    + (class433_1894_.aFloatArray4853[7]
			       * (float) (class117.anInt1406 * -653522829)));
		    if (f_1929_ > -f_1930_) {
			f_1927_
			    += ((class433_1894_.aFloatArray4853[0]
				 * (float) (class117.anInt1405 * -169572407))
				+ (class433_1894_.aFloatArray4853[4]
				   * (float) (class117.anInt1406
					      * -653522829)));
			f_1928_
			    += ((class433_1894_.aFloatArray4853[1]
				 * (float) (class117.anInt1405 * -169572407))
				+ (class433_1894_.aFloatArray4853[5]
				   * (float) (class117.anInt1406
					      * -653522829)));
			float f_1931_ = (aClass185_Sub2_9475.aFloat9342
					 + (aClass185_Sub2_9475.aFloat9361
					    * f_1927_ / f_1930_));
			float f_1932_ = (aClass185_Sub2_9475.aFloat9368
					 + (aClass185_Sub2_9475.aFloat9363
					    * f_1928_ / f_1930_));
			float f_1933_ = (class117.aFloat1403
					 * (float) class118.aShort1414);
			float f_1934_ = (class117.aFloat1404
					 * (float) class118.aShort1413);
			float f_1935_
			    = (f_1927_
			       + class433_1894_.aFloatArray4853[0] * f_1933_
			       + class433_1894_.aFloatArray4853[4] * f_1934_);
			float f_1936_
			    = (f_1928_
			       + class433_1894_.aFloatArray4853[1] * f_1933_
			       + class433_1894_.aFloatArray4853[5] * f_1934_);
			float f_1937_
			    = (f_1930_
			       + class433_1894_.aFloatArray4853[3] * f_1933_
			       + class433_1894_.aFloatArray4853[7] * f_1934_);
			float f_1938_ = (aClass185_Sub2_9475.aFloat9342
					 + (aClass185_Sub2_9475.aFloat9361
					    * f_1935_ / f_1937_));
			float f_1939_ = (aClass185_Sub2_9475.aFloat9368
					 + (aClass185_Sub2_9475.aFloat9363
					    * f_1936_ / f_1937_));
			class117.anInt1407 = (int) f_1931_ * -1511174311;
			class117.anInt1412 = (int) f_1932_ * -773687655;
			class117.aFloat1410
			    = (aClass185_Sub2_9475.aFloat9366
			       + (aClass185_Sub2_9475.aFloat9349
				  * (f_1929_
				     - (class433_1894_.aFloatArray4853[10]
					* (float) (class118.anInt1420
						   * 734303979)))
				  / f_1930_));
			class117.anInt1402
			    = (int) (f_1938_ < f_1931_ ? f_1931_ - f_1938_
				     : f_1938_ - f_1931_) * -620105347;
			class117.anInt1408
			    = (int) (f_1939_ < f_1932_ ? f_1932_ - f_1939_
				     : f_1939_ - f_1932_) * 660144177;
		    } else {
			Class117 class117_1940_ = class117;
			class117.anInt1408 = 0;
			class117_1940_.anInt1402 = 0;
		    }
		}
	    }
	    if (class194 != null) {
		boolean bool_1941_ = false;
		boolean bool_1942_ = true;
		int i_1943_ = aShort9493 + aShort9468 >> 1;
		int i_1944_ = aShort9495 + aShort9449 >> 1;
		int i_1945_ = i_1943_;
		short i_1946_ = aShort9491;
		int i_1947_ = i_1944_;
		float f_1948_
		    = (class433_1910_.aFloatArray4853[0] * (float) i_1945_
		       + class433_1910_.aFloatArray4853[4] * (float) i_1946_
		       + class433_1910_.aFloatArray4853[8] * (float) i_1947_
		       + class433_1910_.aFloatArray4853[12]);
		float f_1949_
		    = (class433_1910_.aFloatArray4853[1] * (float) i_1945_
		       + class433_1910_.aFloatArray4853[5] * (float) i_1946_
		       + class433_1910_.aFloatArray4853[9] * (float) i_1947_
		       + class433_1910_.aFloatArray4853[13]);
		float f_1950_
		    = (class433_1910_.aFloatArray4853[2] * (float) i_1945_
		       + class433_1910_.aFloatArray4853[6] * (float) i_1946_
		       + class433_1910_.aFloatArray4853[10] * (float) i_1947_
		       + class433_1910_.aFloatArray4853[14]);
		float f_1951_
		    = (class433_1910_.aFloatArray4853[3] * (float) i_1945_
		       + class433_1910_.aFloatArray4853[7] * (float) i_1946_
		       + class433_1910_.aFloatArray4853[11] * (float) i_1947_
		       + class433_1910_.aFloatArray4853[15]);
		if (f_1950_ >= -f_1951_) {
		    class194.anInt2148
			= (int) (aClass185_Sub2_9475.aFloat9342
				 + (aClass185_Sub2_9475.aFloat9361 * f_1948_
				    / f_1951_));
		    class194.anInt2149
			= (int) (aClass185_Sub2_9475.aFloat9368
				 + (aClass185_Sub2_9475.aFloat9363 * f_1949_
				    / f_1951_));
		} else
		    bool_1941_ = true;
		i_1945_ = i_1943_;
		i_1946_ = aShort9492;
		i_1947_ = i_1944_;
		float f_1952_
		    = (class433_1910_.aFloatArray4853[0] * (float) i_1945_
		       + class433_1910_.aFloatArray4853[4] * (float) i_1946_
		       + class433_1910_.aFloatArray4853[8] * (float) i_1947_
		       + class433_1910_.aFloatArray4853[12]);
		float f_1953_
		    = (class433_1910_.aFloatArray4853[1] * (float) i_1945_
		       + class433_1910_.aFloatArray4853[5] * (float) i_1946_
		       + class433_1910_.aFloatArray4853[9] * (float) i_1947_
		       + class433_1910_.aFloatArray4853[13]);
		float f_1954_
		    = (class433_1910_.aFloatArray4853[2] * (float) i_1945_
		       + class433_1910_.aFloatArray4853[6] * (float) i_1946_
		       + class433_1910_.aFloatArray4853[10] * (float) i_1947_
		       + class433_1910_.aFloatArray4853[14]);
		float f_1955_
		    = (class433_1910_.aFloatArray4853[3] * (float) i_1945_
		       + class433_1910_.aFloatArray4853[7] * (float) i_1946_
		       + class433_1910_.aFloatArray4853[11] * (float) i_1947_
		       + class433_1910_.aFloatArray4853[15]);
		if (f_1954_ >= -f_1955_) {
		    class194.anInt2152
			= (int) (aClass185_Sub2_9475.aFloat9342
				 + (aClass185_Sub2_9475.aFloat9361 * f_1952_
				    / f_1955_));
		    class194.anInt2151
			= (int) (aClass185_Sub2_9475.aFloat9368
				 + (aClass185_Sub2_9475.aFloat9363 * f_1953_
				    / f_1955_));
		} else
		    bool_1941_ = true;
		if (bool_1941_) {
		    if (f_1950_ < -f_1951_ && f_1954_ < -f_1955_)
			bool_1942_ = false;
		    else if (f_1950_ < -f_1951_) {
			float f_1956_
			    = (f_1950_ + f_1951_) / (f_1954_ + f_1955_) - 1.0F;
			float f_1957_
			    = f_1948_ + f_1956_ * (f_1952_ - f_1948_);
			float f_1958_
			    = f_1949_ + f_1956_ * (f_1953_ - f_1949_);
			float f_1959_
			    = f_1951_ + f_1956_ * (f_1955_ - f_1951_);
			class194.anInt2148
			    = (int) (aClass185_Sub2_9475.aFloat9342
				     + (aClass185_Sub2_9475.aFloat9361
					* f_1957_ / f_1959_));
			class194.anInt2149
			    = (int) (aClass185_Sub2_9475.aFloat9368
				     + (aClass185_Sub2_9475.aFloat9363
					* f_1958_ / f_1959_));
		    } else if (f_1954_ < -f_1955_) {
			float f_1960_
			    = (f_1954_ + f_1955_) / (f_1950_ + f_1951_) - 1.0F;
			float f_1961_
			    = f_1952_ + f_1960_ * (f_1948_ - f_1952_);
			float f_1962_
			    = f_1953_ + f_1960_ * (f_1949_ - f_1953_);
			float f_1963_
			    = f_1955_ + f_1960_ * (f_1951_ - f_1955_);
			class194.anInt2152
			    = (int) (aClass185_Sub2_9475.aFloat9342
				     + (aClass185_Sub2_9475.aFloat9361
					* f_1961_ / f_1963_));
			class194.anInt2151
			    = (int) (aClass185_Sub2_9475.aFloat9368
				     + (aClass185_Sub2_9475.aFloat9363
					* f_1962_ / f_1963_));
		    }
		}
		if (bool_1942_) {
		    if (f_1950_ / f_1951_ > f_1954_ / f_1955_) {
			float f_1964_ = (f_1948_
					 + (class433_1894_.aFloatArray4853[0]
					    * (float) aShort9473)
					 + class433_1894_.aFloatArray4853[12]);
			float f_1965_ = (f_1951_
					 + (class433_1894_.aFloatArray4853[3]
					    * (float) aShort9473)
					 + class433_1894_.aFloatArray4853[15]);
			class194.anInt2147
			    = (int) (aClass185_Sub2_9475.aFloat9342
				     - (float) class194.anInt2148
				     + (aClass185_Sub2_9475.aFloat9361
					* f_1964_ / f_1965_));
		    } else {
			float f_1966_ = (f_1952_
					 + (class433_1894_.aFloatArray4853[0]
					    * (float) aShort9473)
					 + class433_1894_.aFloatArray4853[12]);
			float f_1967_ = (f_1955_
					 + (class433_1894_.aFloatArray4853[3]
					    * (float) aShort9473)
					 + class433_1894_.aFloatArray4853[15]);
			class194.anInt2147
			    = (int) (aClass185_Sub2_9475.aFloat9342
				     - (float) class194.anInt2152
				     + (aClass185_Sub2_9475.aFloat9361
					* f_1966_ / f_1967_));
		    }
		    class194.aBool2150 = true;
		}
	    }
	    method15115(true);
	    aClass119_9489.aBool1423 = (i & 0x1) == 0;
	    aClass119_9489.aBool1424 = false;
	    try {
		method15111(aClass185_Sub2_9475.anIntArray9338 != null,
			    aClass185_Sub2_9475.aFloatArray9341 != null,
			    (i & 0x4) != 0, bool_1911_,
			    ((aClass101_9437.aBool1203
			      && f_1909_ > aClass101_9437.aFloat1204)
			     || aClass101_9437.aBool1245));
	    } catch (Exception exception) {
		/* empty */
	    }
	    if (aClass118Array9485 != null) {
		for (int i_1968_ = 0; i_1968_ < anInt9440; i_1968_++)
		    anIntArray9442[i_1968_] = -1;
	    }
	    aClass119_9489 = null;
	    if (aClass185_Sub2_9475.anInt9367 * 442227785 > 1) {
		synchronized (this) {
		    aBool9497 = false;
		    this.notifyAll();
		}
	    }
	}
    }
    
    public int method3042() {
	if (!aBool9488)
	    method15173();
	return aShort9490;
    }
    
    final boolean method15155(int i) {
	if (aByteArray9469 == null)
	    return false;
	if (aByteArray9469[i] == 0)
	    return false;
	return true;
    }
    
    final boolean method15156(int i) {
	if (aByteArray9469 == null)
	    return false;
	if (aByteArray9469[i] == 0)
	    return false;
	return true;
    }
    
    final void method15157(boolean bool, boolean bool_1969_,
			   boolean bool_1970_, int i) {
	boolean bool_1971_ = false;
	if (aShortArray9428 != null && aShortArray9428[i] != -1)
	    bool_1971_ = (aClass185_Sub2_9475.aClass177_2012.method2931
			  (aShortArray9428[i] & 0xffff, (byte) 1).aBool2043);
	if (!aClass101_9437.aBool1245) {
	    short i_1972_ = aShortArray9479[i];
	    short i_1973_ = aShortArray9455[i];
	    short i_1974_ = aShortArray9456[i];
	    Class433 class433 = aClass185_Sub2_9475.aClass433_9362;
	    float f = class433.aFloatArray4853[10];
	    float f_1975_ = class433.aFloatArray4853[14];
	    float f_1976_ = class433.aFloatArray4853[11];
	    float f_1977_ = class433.aFloatArray4853[15];
	    float f_1978_ = f_1975_ * f_1976_ - f * f_1977_;
	    float f_1979_
		= ((aFloatArray9505[i_1972_] - aClass101_9437.aFloat1234)
		   * aClass101_9437.aFloat1219);
	    float f_1980_
		= ((aFloatArray9505[i_1973_] - aClass101_9437.aFloat1234)
		   * aClass101_9437.aFloat1219);
	    float f_1981_
		= ((aFloatArray9505[i_1974_] - aClass101_9437.aFloat1234)
		   * aClass101_9437.aFloat1219);
	    float f_1982_ = f_1979_ * f_1978_ / (f_1979_ * f_1976_ - f);
	    float f_1983_ = f_1980_ * f_1978_ / (f_1980_ * f_1976_ - f);
	    float f_1984_ = f_1981_ * f_1978_ / (f_1981_ * f_1976_ - f);
	    float f_1985_ = ((f_1982_ - aClass101_9437.aFloat1204)
			     / aClass101_9437.aFloat1205);
	    if (f_1985_ > 1.0F)
		f_1985_ = 1.0F;
	    else if (f_1985_ < 0.0F)
		f_1985_ = 0.0F;
	    float f_1986_ = ((f_1983_ - aClass101_9437.aFloat1204)
			     / aClass101_9437.aFloat1205);
	    if (f_1986_ > 1.0F)
		f_1986_ = 1.0F;
	    else if (f_1986_ < 0.0F)
		f_1986_ = 0.0F;
	    float f_1987_ = ((f_1984_ - aClass101_9437.aFloat1204)
			     / aClass101_9437.aFloat1205);
	    if (f_1987_ > 1.0F)
		f_1987_ = 1.0F;
	    else if (f_1987_ < 0.0F)
		f_1987_ = 0.0F;
	    float f_1988_ = f_1985_ + f_1986_ + f_1987_;
	    if (!(f_1988_ >= 3.0F)) {
		if (f_1988_ <= 0.0F)
		    method15113(bool, bool_1969_, bool_1970_, i);
		else {
		    if (aByteArray9469 == null)
			aClass119_9489.anInt1447 = 0;
		    else
			aClass119_9489.anInt1447 = aByteArray9469[i] & 0xff;
		    if (!bool_1971_) {
			if (anIntArray9461[i] == -1)
			    aClass119_9489.method2141
				(bool, bool_1969_, bool_1970_,
				 aFloatArray9496[i_1972_],
				 aFloatArray9496[i_1973_],
				 aFloatArray9496[i_1974_],
				 aFloatArray9503[i_1972_],
				 aFloatArray9503[i_1973_],
				 aFloatArray9503[i_1974_],
				 aFloatArray9505[i_1972_],
				 aFloatArray9505[i_1973_],
				 aFloatArray9505[i_1974_],
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9459[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_1985_ * 255.0F,
						    (byte) -21),
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9459[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_1986_ * 255.0F,
						    (byte) -50),
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9459[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_1987_ * 255.0F,
						    (byte) 0));
			else
			    aClass119_9489.method2141
				(bool, bool_1969_, bool_1970_,
				 aFloatArray9496[i_1972_],
				 aFloatArray9496[i_1973_],
				 aFloatArray9496[i_1974_],
				 aFloatArray9503[i_1972_],
				 aFloatArray9503[i_1973_],
				 aFloatArray9503[i_1974_],
				 aFloatArray9505[i_1972_],
				 aFloatArray9505[i_1973_],
				 aFloatArray9505[i_1974_],
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9459[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_1985_ * 255.0F,
						    (byte) -23),
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9460[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_1986_ * 255.0F,
						    (byte) -54),
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9461[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_1987_ * 255.0F,
						    (byte) 0));
		    } else {
			int i_1989_ = -16777216;
			if (aByteArray9469 != null)
			    i_1989_ = 255 - (aByteArray9469[i] & 0xff) << 24;
			if (anIntArray9461[i] == -1) {
			    int i_1990_
				= i_1989_ | anIntArray9459[i] & 0xffffff;
			    aClass119_9489.method2166
				(bool, bool_1969_, bool_1970_,
				 aFloatArray9496[i_1972_],
				 aFloatArray9496[i_1973_],
				 aFloatArray9496[i_1974_],
				 aFloatArray9503[i_1972_],
				 aFloatArray9503[i_1973_],
				 aFloatArray9503[i_1974_],
				 aFloatArray9505[i_1972_],
				 aFloatArray9505[i_1973_],
				 aFloatArray9505[i_1974_],
				 aFloatArray9506[i_1972_],
				 aFloatArray9506[i_1973_],
				 aFloatArray9506[i_1974_],
				 aFloatArrayArray9452[i][0],
				 aFloatArrayArray9452[i][1],
				 aFloatArrayArray9452[i][2],
				 aFloatArrayArray9429[i][0],
				 aFloatArrayArray9429[i][1],
				 aFloatArrayArray9429[i][2], i_1990_, i_1990_,
				 i_1990_,
				 aClass101_9437.anInt1206 * 1046269871,
				 f_1985_ * 255.0F, f_1986_ * 255.0F,
				 f_1987_ * 255.0F,
				 aShortArray9428[i] & 0xffff);
			} else
			    aClass119_9489.method2166
				(bool, bool_1969_, bool_1970_,
				 aFloatArray9496[i_1972_],
				 aFloatArray9496[i_1973_],
				 aFloatArray9496[i_1974_],
				 aFloatArray9503[i_1972_],
				 aFloatArray9503[i_1973_],
				 aFloatArray9503[i_1974_],
				 aFloatArray9505[i_1972_],
				 aFloatArray9505[i_1973_],
				 aFloatArray9505[i_1974_],
				 aFloatArray9506[i_1972_],
				 aFloatArray9506[i_1973_],
				 aFloatArray9506[i_1974_],
				 aFloatArrayArray9452[i][0],
				 aFloatArrayArray9452[i][1],
				 aFloatArrayArray9452[i][2],
				 aFloatArrayArray9429[i][0],
				 aFloatArrayArray9429[i][1],
				 aFloatArrayArray9429[i][2],
				 i_1989_ | anIntArray9459[i] & 0xffffff,
				 i_1989_ | anIntArray9460[i] & 0xffffff,
				 i_1989_ | anIntArray9461[i] & 0xffffff,
				 aClass101_9437.anInt1206 * 1046269871,
				 f_1985_ * 255.0F, f_1986_ * 255.0F,
				 f_1987_ * 255.0F,
				 aShortArray9428[i] & 0xffff);
		    }
		}
	    }
	} else {
	    short i_1991_ = aShortArray9479[i];
	    short i_1992_ = aShortArray9455[i];
	    short i_1993_ = aShortArray9456[i];
	    float f = 0.0F;
	    float f_1994_ = 0.0F;
	    float f_1995_ = 0.0F;
	    if (anIntArray9502[i_1991_]
		> aClass101_9437.anInt1210 * -1240216431)
		f = 1.0F;
	    else if (anIntArray9502[i_1991_]
		     > aClass101_9437.anInt1209 * 391389271)
		f = ((float) (aClass101_9437.anInt1209 * 391389271
			      - anIntArray9502[i_1991_])
		     * 1.0F
		     / (float) (aClass101_9437.anInt1209 * 391389271
				- aClass101_9437.anInt1210 * -1240216431));
	    if (anIntArray9502[i_1992_]
		> aClass101_9437.anInt1210 * -1240216431)
		f_1994_ = 1.0F;
	    else if (anIntArray9502[i_1992_]
		     > aClass101_9437.anInt1209 * 391389271)
		f_1994_
		    = ((float) (aClass101_9437.anInt1209 * 391389271
				- anIntArray9502[i_1992_])
		       * 1.0F
		       / (float) (aClass101_9437.anInt1209 * 391389271
				  - aClass101_9437.anInt1210 * -1240216431));
	    if (anIntArray9502[i_1993_]
		> aClass101_9437.anInt1210 * -1240216431)
		f_1995_ = 1.0F;
	    else if (anIntArray9502[i_1993_]
		     > aClass101_9437.anInt1209 * 391389271)
		f_1995_
		    = ((float) (aClass101_9437.anInt1209 * 391389271
				- anIntArray9502[i_1993_])
		       * 1.0F
		       / (float) (aClass101_9437.anInt1209 * 391389271
				  - aClass101_9437.anInt1210 * -1240216431));
	    if (aByteArray9469 == null)
		aClass119_9489.anInt1447 = 0;
	    else
		aClass119_9489.anInt1447 = aByteArray9469[i] & 0xff;
	    if (!bool_1971_) {
		if (anIntArray9461[i] == -1)
		    aClass119_9489.method2141
			(bool, bool_1969_, bool_1970_,
			 aFloatArray9496[i_1991_], aFloatArray9496[i_1992_],
			 aFloatArray9496[i_1993_], aFloatArray9503[i_1991_],
			 aFloatArray9503[i_1992_], aFloatArray9503[i_1993_],
			 aFloatArray9505[i_1991_], aFloatArray9505[i_1992_],
			 aFloatArray9505[i_1993_],
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9459[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f * 255.0F, (byte) -97),
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9459[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f_1994_ * 255.0F, (byte) -46),
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9459[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f_1995_ * 255.0F, (byte) -28));
		else
		    aClass119_9489.method2141
			(bool, bool_1969_, bool_1970_,
			 aFloatArray9496[i_1991_], aFloatArray9496[i_1992_],
			 aFloatArray9496[i_1993_], aFloatArray9503[i_1991_],
			 aFloatArray9503[i_1992_], aFloatArray9503[i_1993_],
			 aFloatArray9505[i_1991_], aFloatArray9505[i_1992_],
			 aFloatArray9505[i_1993_],
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9459[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f * 255.0F, (byte) -22),
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9460[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f_1994_ * 255.0F, (byte) -18),
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9461[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f_1995_ * 255.0F, (byte) -85));
	    } else {
		int i_1996_ = -16777216;
		if (aByteArray9469 != null)
		    i_1996_ = 255 - (aByteArray9469[i] & 0xff) << 24;
		if (anIntArray9461[i] == -1) {
		    int i_1997_ = i_1996_ | anIntArray9459[i] & 0xffffff;
		    aClass119_9489.method2166
			(bool, bool_1969_, bool_1970_,
			 aFloatArray9496[i_1991_], aFloatArray9496[i_1992_],
			 aFloatArray9496[i_1993_], aFloatArray9503[i_1991_],
			 aFloatArray9503[i_1992_], aFloatArray9503[i_1993_],
			 aFloatArray9505[i_1991_], aFloatArray9505[i_1992_],
			 aFloatArray9505[i_1993_], aFloatArray9506[i_1991_],
			 aFloatArray9506[i_1992_], aFloatArray9506[i_1993_],
			 aFloatArrayArray9452[i][0],
			 aFloatArrayArray9452[i][1],
			 aFloatArrayArray9452[i][2],
			 aFloatArrayArray9429[i][0],
			 aFloatArrayArray9429[i][1],
			 aFloatArrayArray9429[i][2], i_1997_, i_1997_, i_1997_,
			 aClass101_9437.anInt1206 * 1046269871, f * 255.0F,
			 f_1994_ * 255.0F, f_1995_ * 255.0F,
			 aShortArray9428[i] & 0xffff);
		} else
		    aClass119_9489.method2166
			(bool, bool_1969_, bool_1970_,
			 aFloatArray9496[i_1991_], aFloatArray9496[i_1992_],
			 aFloatArray9496[i_1993_], aFloatArray9503[i_1991_],
			 aFloatArray9503[i_1992_], aFloatArray9503[i_1993_],
			 aFloatArray9505[i_1991_], aFloatArray9505[i_1992_],
			 aFloatArray9505[i_1993_], aFloatArray9506[i_1991_],
			 aFloatArray9506[i_1992_], aFloatArray9506[i_1993_],
			 aFloatArrayArray9452[i][0],
			 aFloatArrayArray9452[i][1],
			 aFloatArrayArray9452[i][2],
			 aFloatArrayArray9429[i][0],
			 aFloatArrayArray9429[i][1],
			 aFloatArrayArray9429[i][2],
			 i_1996_ | anIntArray9459[i] & 0xffffff,
			 i_1996_ | anIntArray9460[i] & 0xffffff,
			 i_1996_ | anIntArray9461[i] & 0xffffff,
			 aClass101_9437.anInt1206 * 1046269871, f * 255.0F,
			 f_1994_ * 255.0F, f_1995_ * 255.0F,
			 aShortArray9428[i] & 0xffff);
	    }
	}
    }
    
    final boolean method15158(int i) {
	if (anIntArray9442 == null)
	    return false;
	if (anIntArray9442[i] == -1)
	    return false;
	return true;
    }
    
    final boolean method15159(int i) {
	if (anIntArray9442 == null)
	    return false;
	if (anIntArray9442[i] == -1)
	    return false;
	return true;
    }
    
    void method3100(int i, int[] is, int i_1998_, int i_1999_, int i_2000_,
		    int i_2001_, boolean bool) {
	int i_2002_ = is.length;
	if (i == 0) {
	    i_1998_ <<= 4;
	    i_1999_ <<= 4;
	    i_2000_ <<= 4;
	    if (!aBool9477) {
		for (int i_2003_ = 0; i_2003_ < anInt9444; i_2003_++) {
		    anIntArray9494[i_2003_] <<= 4;
		    anIntArray9447[i_2003_] <<= 4;
		    anIntArray9448[i_2003_] <<= 4;
		}
		aBool9477 = true;
	    }
	    int i_2004_ = 0;
	    anInt9458 = 0;
	    anInt9481 = 0;
	    anInt9465 = 0;
	    for (int i_2005_ = 0; i_2005_ < i_2002_; i_2005_++) {
		int i_2006_ = is[i_2005_];
		if (i_2006_ < anIntArrayArray9470.length) {
		    int[] is_2007_ = anIntArrayArray9470[i_2006_];
		    for (int i_2008_ = 0; i_2008_ < is_2007_.length;
			 i_2008_++) {
			int i_2009_ = is_2007_[i_2008_];
			anInt9458 += anIntArray9494[i_2009_];
			anInt9481 += anIntArray9447[i_2009_];
			anInt9465 += anIntArray9448[i_2009_];
			i_2004_++;
		    }
		}
	    }
	    if (i_2004_ > 0) {
		anInt9458 = anInt9458 / i_2004_ + i_1998_;
		anInt9481 = anInt9481 / i_2004_ + i_1999_;
		anInt9465 = anInt9465 / i_2004_ + i_2000_;
	    } else {
		anInt9458 = i_1998_;
		anInt9481 = i_1999_;
		anInt9465 = i_2000_;
	    }
	} else if (i == 1) {
	    i_1998_ <<= 4;
	    i_1999_ <<= 4;
	    i_2000_ <<= 4;
	    if (!aBool9477) {
		for (int i_2010_ = 0; i_2010_ < anInt9444; i_2010_++) {
		    anIntArray9494[i_2010_] <<= 4;
		    anIntArray9447[i_2010_] <<= 4;
		    anIntArray9448[i_2010_] <<= 4;
		}
		aBool9477 = true;
	    }
	    for (int i_2011_ = 0; i_2011_ < i_2002_; i_2011_++) {
		int i_2012_ = is[i_2011_];
		if (i_2012_ < anIntArrayArray9470.length) {
		    int[] is_2013_ = anIntArrayArray9470[i_2012_];
		    for (int i_2014_ = 0; i_2014_ < is_2013_.length;
			 i_2014_++) {
			int i_2015_ = is_2013_[i_2014_];
			anIntArray9494[i_2015_] += i_1998_;
			anIntArray9447[i_2015_] += i_1999_;
			anIntArray9448[i_2015_] += i_2000_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_2016_ = 0; i_2016_ < i_2002_; i_2016_++) {
		int i_2017_ = is[i_2016_];
		if (i_2017_ < anIntArrayArray9470.length) {
		    int[] is_2018_ = anIntArrayArray9470[i_2017_];
		    if ((i_2001_ & 0x1) == 0) {
			for (int i_2019_ = 0; i_2019_ < is_2018_.length;
			     i_2019_++) {
			    int i_2020_ = is_2018_[i_2019_];
			    anIntArray9494[i_2020_] -= anInt9458;
			    anIntArray9447[i_2020_] -= anInt9481;
			    anIntArray9448[i_2020_] -= anInt9465;
			    if (i_2000_ != 0) {
				int i_2021_ = Class427.anIntArray4806[i_2000_];
				int i_2022_ = Class427.anIntArray4805[i_2000_];
				int i_2023_
				    = ((anIntArray9447[i_2020_] * i_2021_
					+ anIntArray9494[i_2020_] * i_2022_
					+ 16383)
				       >> 14);
				anIntArray9447[i_2020_]
				    = (anIntArray9447[i_2020_] * i_2022_
				       - anIntArray9494[i_2020_] * i_2021_
				       + 16383) >> 14;
				anIntArray9494[i_2020_] = i_2023_;
			    }
			    if (i_1998_ != 0) {
				int i_2024_ = Class427.anIntArray4806[i_1998_];
				int i_2025_ = Class427.anIntArray4805[i_1998_];
				int i_2026_
				    = ((anIntArray9447[i_2020_] * i_2025_
					- anIntArray9448[i_2020_] * i_2024_
					+ 16383)
				       >> 14);
				anIntArray9448[i_2020_]
				    = (anIntArray9447[i_2020_] * i_2024_
				       + anIntArray9448[i_2020_] * i_2025_
				       + 16383) >> 14;
				anIntArray9447[i_2020_] = i_2026_;
			    }
			    if (i_1999_ != 0) {
				int i_2027_ = Class427.anIntArray4806[i_1999_];
				int i_2028_ = Class427.anIntArray4805[i_1999_];
				int i_2029_
				    = ((anIntArray9448[i_2020_] * i_2027_
					+ anIntArray9494[i_2020_] * i_2028_
					+ 16383)
				       >> 14);
				anIntArray9448[i_2020_]
				    = (anIntArray9448[i_2020_] * i_2028_
				       - anIntArray9494[i_2020_] * i_2027_
				       + 16383) >> 14;
				anIntArray9494[i_2020_] = i_2029_;
			    }
			    anIntArray9494[i_2020_] += anInt9458;
			    anIntArray9447[i_2020_] += anInt9481;
			    anIntArray9448[i_2020_] += anInt9465;
			}
		    } else {
			for (int i_2030_ = 0; i_2030_ < is_2018_.length;
			     i_2030_++) {
			    int i_2031_ = is_2018_[i_2030_];
			    anIntArray9494[i_2031_] -= anInt9458;
			    anIntArray9447[i_2031_] -= anInt9481;
			    anIntArray9448[i_2031_] -= anInt9465;
			    if (i_1998_ != 0) {
				int i_2032_ = Class427.anIntArray4806[i_1998_];
				int i_2033_ = Class427.anIntArray4805[i_1998_];
				int i_2034_
				    = ((anIntArray9447[i_2031_] * i_2033_
					- anIntArray9448[i_2031_] * i_2032_
					+ 16383)
				       >> 14);
				anIntArray9448[i_2031_]
				    = (anIntArray9447[i_2031_] * i_2032_
				       + anIntArray9448[i_2031_] * i_2033_
				       + 16383) >> 14;
				anIntArray9447[i_2031_] = i_2034_;
			    }
			    if (i_2000_ != 0) {
				int i_2035_ = Class427.anIntArray4806[i_2000_];
				int i_2036_ = Class427.anIntArray4805[i_2000_];
				int i_2037_
				    = ((anIntArray9447[i_2031_] * i_2035_
					+ anIntArray9494[i_2031_] * i_2036_
					+ 16383)
				       >> 14);
				anIntArray9447[i_2031_]
				    = (anIntArray9447[i_2031_] * i_2036_
				       - anIntArray9494[i_2031_] * i_2035_
				       + 16383) >> 14;
				anIntArray9494[i_2031_] = i_2037_;
			    }
			    if (i_1999_ != 0) {
				int i_2038_ = Class427.anIntArray4806[i_1999_];
				int i_2039_ = Class427.anIntArray4805[i_1999_];
				int i_2040_
				    = ((anIntArray9448[i_2031_] * i_2038_
					+ anIntArray9494[i_2031_] * i_2039_
					+ 16383)
				       >> 14);
				anIntArray9448[i_2031_]
				    = (anIntArray9448[i_2031_] * i_2039_
				       - anIntArray9494[i_2031_] * i_2038_
				       + 16383) >> 14;
				anIntArray9494[i_2031_] = i_2040_;
			    }
			    anIntArray9494[i_2031_] += anInt9458;
			    anIntArray9447[i_2031_] += anInt9481;
			    anIntArray9448[i_2031_] += anInt9465;
			}
		    }
		}
	    }
	} else if (i == 3) {
	    for (int i_2041_ = 0; i_2041_ < i_2002_; i_2041_++) {
		int i_2042_ = is[i_2041_];
		if (i_2042_ < anIntArrayArray9470.length) {
		    int[] is_2043_ = anIntArrayArray9470[i_2042_];
		    for (int i_2044_ = 0; i_2044_ < is_2043_.length;
			 i_2044_++) {
			int i_2045_ = is_2043_[i_2044_];
			anIntArray9494[i_2045_] -= anInt9458;
			anIntArray9447[i_2045_] -= anInt9481;
			anIntArray9448[i_2045_] -= anInt9465;
			anIntArray9494[i_2045_]
			    = anIntArray9494[i_2045_] * i_1998_ / 128;
			anIntArray9447[i_2045_]
			    = anIntArray9447[i_2045_] * i_1999_ / 128;
			anIntArray9448[i_2045_]
			    = anIntArray9448[i_2045_] * i_2000_ / 128;
			anIntArray9494[i_2045_] += anInt9458;
			anIntArray9447[i_2045_] += anInt9481;
			anIntArray9448[i_2045_] += anInt9465;
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9457 != null && aByteArray9469 != null) {
		for (int i_2046_ = 0; i_2046_ < i_2002_; i_2046_++) {
		    int i_2047_ = is[i_2046_];
		    if (i_2047_ < anIntArrayArray9457.length) {
			int[] is_2048_ = anIntArrayArray9457[i_2047_];
			for (int i_2049_ = 0; i_2049_ < is_2048_.length;
			     i_2049_++) {
			    int i_2050_ = is_2048_[i_2049_];
			    int i_2051_ = ((aByteArray9469[i_2050_] & 0xff)
					   + i_1998_ * 8);
			    if (i_2051_ < 0)
				i_2051_ = 0;
			    else if (i_2051_ > 255)
				i_2051_ = 255;
			    aByteArray9469[i_2050_] = (byte) i_2051_;
			}
		    }
		}
		if (aClass118Array9485 != null) {
		    for (int i_2052_ = 0; i_2052_ < anInt9484; i_2052_++) {
			Class118 class118 = aClass118Array9485[i_2052_];
			Class117 class117 = aClass117Array9486[i_2052_];
			class117.anInt1411
			    = (class117.anInt1411 * -150900843 & 0xffffff
			       | 255 - ((aByteArray9469
					 [class118.anInt1418 * 2118166057])
					& 0xff) << 24) * 874668989;
		    }
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9457 != null) {
		for (int i_2053_ = 0; i_2053_ < i_2002_; i_2053_++) {
		    int i_2054_ = is[i_2053_];
		    if (i_2054_ < anIntArrayArray9457.length) {
			int[] is_2055_ = anIntArrayArray9457[i_2054_];
			for (int i_2056_ = 0; i_2056_ < is_2055_.length;
			     i_2056_++) {
			    int i_2057_ = is_2055_[i_2056_];
			    int i_2058_ = aShortArray9471[i_2057_] & 0xffff;
			    int i_2059_ = i_2058_ >> 10 & 0x3f;
			    int i_2060_ = i_2058_ >> 7 & 0x7;
			    int i_2061_ = i_2058_ & 0x7f;
			    i_2059_ = i_2059_ + i_1998_ & 0x3f;
			    i_2060_ += i_1999_;
			    if (i_2060_ < 0)
				i_2060_ = 0;
			    else if (i_2060_ > 7)
				i_2060_ = 7;
			    i_2061_ += i_2000_;
			    if (i_2061_ < 0)
				i_2061_ = 0;
			    else if (i_2061_ > 127)
				i_2061_ = 127;
			    aShortArray9471[i_2057_]
				= (short) (i_2059_ << 10 | i_2060_ << 7
					   | i_2061_);
			}
			aBool9476 = true;
		    }
		}
		if (aClass118Array9485 != null) {
		    for (int i_2062_ = 0; i_2062_ < anInt9484; i_2062_++) {
			Class118 class118 = aClass118Array9485[i_2062_];
			Class117 class117 = aClass117Array9486[i_2062_];
			class117.anInt1411
			    = (class117.anInt1411 * -150900843 & ~0xffffff
			       | ((Class415.anIntArray4666
				   [Class315.method5705(((aShortArray9471
							  [(class118.anInt1418
							    * 2118166057)])
							 & 0xffff),
							1437195692) & 0xffff])
				  & 0xffffff)) * 874668989;
		    }
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9487 != null) {
		for (int i_2063_ = 0; i_2063_ < i_2002_; i_2063_++) {
		    int i_2064_ = is[i_2063_];
		    if (i_2064_ < anIntArrayArray9487.length) {
			int[] is_2065_ = anIntArrayArray9487[i_2064_];
			for (int i_2066_ = 0; i_2066_ < is_2065_.length;
			     i_2066_++) {
			    Class117 class117
				= aClass117Array9486[is_2065_[i_2066_]];
			    class117.anInt1405 += i_1998_ * 1831486073;
			    class117.anInt1406 += i_1999_ * -108929861;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9487 != null) {
		for (int i_2067_ = 0; i_2067_ < i_2002_; i_2067_++) {
		    int i_2068_ = is[i_2067_];
		    if (i_2068_ < anIntArrayArray9487.length) {
			int[] is_2069_ = anIntArrayArray9487[i_2068_];
			for (int i_2070_ = 0; i_2070_ < is_2069_.length;
			     i_2070_++) {
			    Class117 class117
				= aClass117Array9486[is_2069_[i_2070_]];
			    class117.aFloat1403 = (class117.aFloat1403
						   * (float) i_1998_ / 128.0F);
			    class117.aFloat1404 = (class117.aFloat1404
						   * (float) i_1999_ / 128.0F);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9487 != null) {
		for (int i_2071_ = 0; i_2071_ < i_2002_; i_2071_++) {
		    int i_2072_ = is[i_2071_];
		    if (i_2072_ < anIntArrayArray9487.length) {
			int[] is_2073_ = anIntArrayArray9487[i_2072_];
			for (int i_2074_ = 0; i_2074_ < is_2073_.length;
			     i_2074_++) {
			    Class117 class117
				= aClass117Array9486[is_2073_[i_2074_]];
			    class117.anInt1409
				= (class117.anInt1409 * -133325595 + i_1998_
				   & 0x3fff) * 1832042733;
			}
		    }
		}
	    }
	}
    }
    
    final void method15160(boolean bool, boolean bool_2075_,
			   boolean bool_2076_, int i, boolean bool_2077_,
			   boolean bool_2078_) {
	if (anIntArray9461[i] != -2) {
	    short i_2079_ = aShortArray9479[i];
	    short i_2080_ = aShortArray9455[i];
	    short i_2081_ = aShortArray9456[i];
	    float f = aFloatArray9503[i_2079_];
	    float f_2082_ = aFloatArray9503[i_2080_];
	    float f_2083_ = aFloatArray9503[i_2081_];
	    if (!bool_2077_ || (f != -5000.0F && f_2082_ != -5000.0F
				&& f_2083_ != -5000.0F)) {
		float f_2084_ = aFloatArray9496[i_2079_];
		float f_2085_ = aFloatArray9496[i_2080_];
		float f_2086_ = aFloatArray9496[i_2081_];
		if (anIntArray9442[i] != -1
		    || ((f - f_2082_) * (f_2086_ - f_2085_)
			- (f_2084_ - f_2085_) * (f_2083_ - f_2082_)) > 0.0F) {
		    if (f < 0.0F || f_2082_ < 0.0F || f_2083_ < 0.0F
			|| f > (float) (aClass101_9437.anInt1236 * 824618691)
			|| f_2082_ > (float) (aClass101_9437.anInt1236
					      * 824618691)
			|| f_2083_ > (float) (aClass101_9437.anInt1236
					      * 824618691))
			aClass119_9489.aBool1422 = true;
		    else
			aClass119_9489.aBool1422 = false;
		    if (bool_2078_) {
			int i_2087_ = anIntArray9442[i];
			if (i_2087_ == -1
			    || !aClass118Array9485[i_2087_].aBool1419)
			    method15157(bool, bool_2075_, bool_2076_, i);
		    } else {
			int i_2088_ = anIntArray9442[i];
			if (i_2088_ != -1) {
			    Class118 class118 = aClass118Array9485[i_2088_];
			    Class117 class117 = aClass117Array9486[i_2088_];
			    if (!class118.aBool1419)
				method15113(bool, bool_2075_, bool_2076_, i);
			    aClass185_Sub2_9475.method15013
				(bool, bool_2075_, bool_2076_,
				 class117.anInt1407 * -876082967,
				 class117.anInt1412 * 61832617,
				 class117.aFloat1410,
				 class117.anInt1402 * 976146389,
				 class117.anInt1408 * 287725777,
				 class118.aShort1416,
				 class117.anInt1411 * -150900843,
				 class118.aByte1415, class118.aByte1417);
			} else
			    method15113(bool, bool_2075_, bool_2076_, i);
		    }
		}
	    }
	}
    }
    
    public int method3043() {
	if (!aBool9488)
	    method15173();
	return aShort9468;
    }
    
    final void method15161(boolean bool, boolean bool_2089_,
			   boolean bool_2090_, int i) {
	short i_2091_ = aShortArray9479[i];
	short i_2092_ = aShortArray9455[i];
	short i_2093_ = aShortArray9456[i];
	boolean bool_2094_ = false;
	if (aShortArray9428 != null && aShortArray9428[i] != -1)
	    bool_2094_ = (aClass185_Sub2_9475.aClass177_2012.method2931
			  (aShortArray9428[i] & 0xffff, (byte) 1).aBool2043);
	if (!bool_2094_) {
	    if (aByteArray9469 == null)
		aClass119_9489.anInt1447 = 0;
	    else
		aClass119_9489.anInt1447 = aByteArray9469[i] & 0xff;
	    if (anIntArray9461[i] == -1)
		aClass119_9489.method2137
		    (bool, bool_2089_, bool_2090_, aFloatArray9496[i_2091_],
		     aFloatArray9496[i_2092_], aFloatArray9496[i_2093_],
		     aFloatArray9503[i_2091_], aFloatArray9503[i_2092_],
		     aFloatArray9503[i_2093_], aFloatArray9505[i_2091_],
		     aFloatArray9505[i_2092_], aFloatArray9505[i_2093_],
		     Class415.anIntArray4666[anIntArray9459[i] & 0xffff]);
	    else
		aClass119_9489.method2139
		    (bool, bool_2089_, bool_2090_, aFloatArray9496[i_2091_],
		     aFloatArray9496[i_2092_], aFloatArray9496[i_2093_],
		     aFloatArray9503[i_2091_], aFloatArray9503[i_2092_],
		     aFloatArray9503[i_2093_], aFloatArray9505[i_2091_],
		     aFloatArray9505[i_2092_], aFloatArray9505[i_2093_],
		     (float) (anIntArray9459[i] & 0xffff),
		     (float) (anIntArray9460[i] & 0xffff),
		     (float) (anIntArray9461[i] & 0xffff));
	} else {
	    int i_2095_ = -16777216;
	    if (aByteArray9469 != null)
		i_2095_ = 255 - (aByteArray9469[i] & 0xff) << 24;
	    if (anIntArray9461[i] == -1) {
		int i_2096_ = i_2095_ | anIntArray9459[i] & 0xffffff;
		aClass119_9489.method2166
		    (bool, bool_2089_, bool_2090_, aFloatArray9496[i_2091_],
		     aFloatArray9496[i_2092_], aFloatArray9496[i_2093_],
		     aFloatArray9503[i_2091_], aFloatArray9503[i_2092_],
		     aFloatArray9503[i_2093_], aFloatArray9505[i_2091_],
		     aFloatArray9505[i_2092_], aFloatArray9505[i_2093_],
		     aFloatArray9506[i_2091_], aFloatArray9506[i_2092_],
		     aFloatArray9506[i_2093_], aFloatArrayArray9452[i][0],
		     aFloatArrayArray9452[i][1], aFloatArrayArray9452[i][2],
		     aFloatArrayArray9429[i][0], aFloatArrayArray9429[i][1],
		     aFloatArrayArray9429[i][2], i_2096_, i_2096_, i_2096_,
		     aClass101_9437.anInt1206 * 1046269871, 0.0F, 0.0F, 0.0F,
		     aShortArray9428[i] & 0xffff);
	    } else
		aClass119_9489.method2166
		    (bool, bool_2089_, bool_2090_, aFloatArray9496[i_2091_],
		     aFloatArray9496[i_2092_], aFloatArray9496[i_2093_],
		     aFloatArray9503[i_2091_], aFloatArray9503[i_2092_],
		     aFloatArray9503[i_2093_], aFloatArray9505[i_2091_],
		     aFloatArray9505[i_2092_], aFloatArray9505[i_2093_],
		     aFloatArray9506[i_2091_], aFloatArray9506[i_2092_],
		     aFloatArray9506[i_2093_], aFloatArrayArray9452[i][0],
		     aFloatArrayArray9452[i][1], aFloatArrayArray9452[i][2],
		     aFloatArrayArray9429[i][0], aFloatArrayArray9429[i][1],
		     aFloatArrayArray9429[i][2],
		     i_2095_ | anIntArray9459[i] & 0xffffff,
		     i_2095_ | anIntArray9460[i] & 0xffffff,
		     i_2095_ | anIntArray9461[i] & 0xffffff,
		     aClass101_9437.anInt1206 * 1046269871, 0.0F, 0.0F, 0.0F,
		     aShortArray9428[i] & 0xffff);
	}
    }
    
    final void method15162(boolean bool, boolean bool_2097_,
			   boolean bool_2098_, int i) {
	short i_2099_ = aShortArray9479[i];
	short i_2100_ = aShortArray9455[i];
	short i_2101_ = aShortArray9456[i];
	boolean bool_2102_ = false;
	if (aShortArray9428 != null && aShortArray9428[i] != -1)
	    bool_2102_ = (aClass185_Sub2_9475.aClass177_2012.method2931
			  (aShortArray9428[i] & 0xffff, (byte) 1).aBool2043);
	if (!bool_2102_) {
	    if (aByteArray9469 == null)
		aClass119_9489.anInt1447 = 0;
	    else
		aClass119_9489.anInt1447 = aByteArray9469[i] & 0xff;
	    if (anIntArray9461[i] == -1)
		aClass119_9489.method2137
		    (bool, bool_2097_, bool_2098_, aFloatArray9496[i_2099_],
		     aFloatArray9496[i_2100_], aFloatArray9496[i_2101_],
		     aFloatArray9503[i_2099_], aFloatArray9503[i_2100_],
		     aFloatArray9503[i_2101_], aFloatArray9505[i_2099_],
		     aFloatArray9505[i_2100_], aFloatArray9505[i_2101_],
		     Class415.anIntArray4666[anIntArray9459[i] & 0xffff]);
	    else
		aClass119_9489.method2139
		    (bool, bool_2097_, bool_2098_, aFloatArray9496[i_2099_],
		     aFloatArray9496[i_2100_], aFloatArray9496[i_2101_],
		     aFloatArray9503[i_2099_], aFloatArray9503[i_2100_],
		     aFloatArray9503[i_2101_], aFloatArray9505[i_2099_],
		     aFloatArray9505[i_2100_], aFloatArray9505[i_2101_],
		     (float) (anIntArray9459[i] & 0xffff),
		     (float) (anIntArray9460[i] & 0xffff),
		     (float) (anIntArray9461[i] & 0xffff));
	} else {
	    int i_2103_ = -16777216;
	    if (aByteArray9469 != null)
		i_2103_ = 255 - (aByteArray9469[i] & 0xff) << 24;
	    if (anIntArray9461[i] == -1) {
		int i_2104_ = i_2103_ | anIntArray9459[i] & 0xffffff;
		aClass119_9489.method2166
		    (bool, bool_2097_, bool_2098_, aFloatArray9496[i_2099_],
		     aFloatArray9496[i_2100_], aFloatArray9496[i_2101_],
		     aFloatArray9503[i_2099_], aFloatArray9503[i_2100_],
		     aFloatArray9503[i_2101_], aFloatArray9505[i_2099_],
		     aFloatArray9505[i_2100_], aFloatArray9505[i_2101_],
		     aFloatArray9506[i_2099_], aFloatArray9506[i_2100_],
		     aFloatArray9506[i_2101_], aFloatArrayArray9452[i][0],
		     aFloatArrayArray9452[i][1], aFloatArrayArray9452[i][2],
		     aFloatArrayArray9429[i][0], aFloatArrayArray9429[i][1],
		     aFloatArrayArray9429[i][2], i_2104_, i_2104_, i_2104_,
		     aClass101_9437.anInt1206 * 1046269871, 0.0F, 0.0F, 0.0F,
		     aShortArray9428[i] & 0xffff);
	    } else
		aClass119_9489.method2166
		    (bool, bool_2097_, bool_2098_, aFloatArray9496[i_2099_],
		     aFloatArray9496[i_2100_], aFloatArray9496[i_2101_],
		     aFloatArray9503[i_2099_], aFloatArray9503[i_2100_],
		     aFloatArray9503[i_2101_], aFloatArray9505[i_2099_],
		     aFloatArray9505[i_2100_], aFloatArray9505[i_2101_],
		     aFloatArray9506[i_2099_], aFloatArray9506[i_2100_],
		     aFloatArray9506[i_2101_], aFloatArrayArray9452[i][0],
		     aFloatArrayArray9452[i][1], aFloatArrayArray9452[i][2],
		     aFloatArrayArray9429[i][0], aFloatArrayArray9429[i][1],
		     aFloatArrayArray9429[i][2],
		     i_2103_ | anIntArray9459[i] & 0xffffff,
		     i_2103_ | anIntArray9460[i] & 0xffffff,
		     i_2103_ | anIntArray9461[i] & 0xffffff,
		     aClass101_9437.anInt1206 * 1046269871, 0.0F, 0.0F, 0.0F,
		     aShortArray9428[i] & 0xffff);
	}
    }
    
    void method15163(Class446 class446, Class194 class194, int i) {
	if (anInt9474 >= 1) {
	    Class101 class101
		= aClass185_Sub2_9475.method15011(Thread.currentThread());
	    Class433 class433 = class101.aClass433_1224;
	    class433.method6916(class446);
	    Class433 class433_2105_ = aClass185_Sub2_9475.aClass433_9353;
	    Class433 class433_2106_ = aClass185_Sub2_9475.aClass433_9362;
	    if (!aBool9488)
		method15173();
	    boolean bool = class433.method6927();
	    float[] fs = class101.aFloatArray1225;
	    class433.method6850(0.0F, (float) aShort9491, 0.0F, fs);
	    float f = fs[0];
	    float f_2107_ = fs[1];
	    float f_2108_ = fs[2];
	    class433.method6850(0.0F, (float) aShort9492, 0.0F, fs);
	    float f_2109_ = fs[0];
	    float f_2110_ = fs[1];
	    float f_2111_ = fs[2];
	    for (int i_2112_ = 0; i_2112_ < 6; i_2112_++) {
		float[] fs_2113_
		    = aClass185_Sub2_9475.aFloatArrayArray9355[i_2112_];
		float f_2114_ = (fs_2113_[0] * f + fs_2113_[1] * f_2107_
				 + fs_2113_[2] * f_2108_ + fs_2113_[3]
				 + (float) aShort9473);
		float f_2115_ = (fs_2113_[0] * f_2109_ + fs_2113_[1] * f_2110_
				 + fs_2113_[2] * f_2111_ + fs_2113_[3]
				 + (float) aShort9473);
		if (f_2114_ < 0.0F && f_2115_ < 0.0F)
		    return;
	    }
	    float f_2116_;
	    float f_2117_;
	    if (bool) {
		f_2116_ = class433_2105_.aFloatArray4853[14];
		f_2117_ = class433_2105_.aFloatArray4853[6];
	    } else {
		f_2116_ = ((class433.aFloatArray4853[12]
			    * class433_2105_.aFloatArray4853[2])
			   + (class433.aFloatArray4853[13]
			      * class433_2105_.aFloatArray4853[6])
			   + (class433.aFloatArray4853[14]
			      * class433_2105_.aFloatArray4853[10])
			   + class433_2105_.aFloatArray4853[14]);
		f_2117_ = ((class433.aFloatArray4853[4]
			    * class433_2105_.aFloatArray4853[2])
			   + (class433.aFloatArray4853[5]
			      * class433_2105_.aFloatArray4853[6])
			   + (class433.aFloatArray4853[6]
			      * class433_2105_.aFloatArray4853[10]));
	    }
	    float f_2118_ = f_2116_ + (float) aShort9491 * f_2117_;
	    float f_2119_ = f_2116_ + (float) aShort9492 * f_2117_;
	    float f_2120_ = (f_2118_ > f_2119_ ? f_2118_ + (float) aShort9473
			     : f_2119_ + (float) aShort9473);
	    float f_2121_ = (class433_2106_.aFloatArray4853[10] * f_2120_
			     + class433_2106_.aFloatArray4853[14]);
	    if (aClass185_Sub2_9475.anInt9367 * 442227785 > 1) {
		synchronized (this) {
		    while (aBool9497) {
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
		    }
		    aBool9497 = true;
		}
	    }
	    method15091(class101);
	    Class433 class433_2122_ = aClass101_9437.aClass433_1217;
	    class433_2122_.method6842(class433);
	    class433_2122_.method6839(aClass185_Sub2_9475.aClass433_9346);
	    if ((i & 0x2) != 0)
		aClass119_9489.method2138(true);
	    else
		aClass119_9489.method2138(false);
	    boolean bool_2123_ = false;
	    aClass101_9437.aFloat1232 = aClass119_9489.aFloat1430;
	    aClass101_9437.aFloat1231 = aClass119_9489.aFloat1432;
	    aClass101_9437.aFloat1223 = aClass119_9489.aFloat1434;
	    aClass101_9437.aFloat1219 = 1.0F / aClass119_9489.aFloat1434;
	    aClass101_9437.aFloat1200 = aClass119_9489.aFloat1429;
	    aClass101_9437.aFloat1230 = aClass119_9489.aFloat1431;
	    aClass101_9437.aFloat1234 = aClass119_9489.aFloat1433;
	    aClass101_9437.anInt1236 = aClass119_9489.anInt1448 * -1381436949;
	    for (int i_2124_ = 0; i_2124_ < anInt9444; i_2124_++) {
		int i_2125_ = anIntArray9494[i_2124_];
		int i_2126_ = anIntArray9447[i_2124_];
		int i_2127_ = anIntArray9448[i_2124_];
		float f_2128_
		    = (class433_2122_.aFloatArray4853[0] * (float) i_2125_
		       + class433_2122_.aFloatArray4853[4] * (float) i_2126_
		       + class433_2122_.aFloatArray4853[8] * (float) i_2127_
		       + class433_2122_.aFloatArray4853[12]);
		float f_2129_
		    = (class433_2122_.aFloatArray4853[1] * (float) i_2125_
		       + class433_2122_.aFloatArray4853[5] * (float) i_2126_
		       + class433_2122_.aFloatArray4853[9] * (float) i_2127_
		       + class433_2122_.aFloatArray4853[13]);
		float f_2130_
		    = (class433_2122_.aFloatArray4853[2] * (float) i_2125_
		       + class433_2122_.aFloatArray4853[6] * (float) i_2126_
		       + class433_2122_.aFloatArray4853[10] * (float) i_2127_
		       + class433_2122_.aFloatArray4853[14]);
		float f_2131_
		    = (class433_2122_.aFloatArray4853[3] * (float) i_2125_
		       + class433_2122_.aFloatArray4853[7] * (float) i_2126_
		       + class433_2122_.aFloatArray4853[11] * (float) i_2127_
		       + class433_2122_.aFloatArray4853[15]);
		aFloatArray9505[i_2124_]
		    = (aClass101_9437.aFloat1234
		       + aClass101_9437.aFloat1223 * f_2130_ / f_2131_);
		aFloatArray9506[i_2124_] = f_2131_;
		if (f_2130_ >= -f_2131_) {
		    aFloatArray9503[i_2124_]
			= (float) (int) (aClass101_9437.aFloat1200
					 + (aClass101_9437.aFloat1232 * f_2128_
					    / f_2131_));
		    aFloatArray9496[i_2124_]
			= (float) (int) (aClass101_9437.aFloat1230
					 + (aClass101_9437.aFloat1231 * f_2129_
					    / f_2131_));
		} else {
		    aFloatArray9503[i_2124_] = -5000.0F;
		    bool_2123_ = true;
		}
		if (aClass101_9437.aBool1245)
		    anIntArray9502[i_2124_]
			= (int) (class433.aFloatArray4853[13]
				 + ((class433.aFloatArray4853[1]
				     * (float) i_2125_)
				    + (class433.aFloatArray4853[5]
				       * (float) i_2126_)
				    + (class433.aFloatArray4853[9]
				       * (float) i_2127_)));
	    }
	    if (aClass118Array9485 != null) {
		for (int i_2132_ = 0; i_2132_ < anInt9484; i_2132_++) {
		    Class118 class118 = aClass118Array9485[i_2132_];
		    Class117 class117 = aClass117Array9486[i_2132_];
		    short i_2133_
			= aShortArray9479[class118.anInt1418 * 2118166057];
		    short i_2134_
			= aShortArray9455[class118.anInt1418 * 2118166057];
		    short i_2135_
			= aShortArray9456[class118.anInt1418 * 2118166057];
		    int i_2136_
			= ((anIntArray9494[i_2133_] + anIntArray9494[i_2134_]
			    + anIntArray9494[i_2135_])
			   / 3);
		    int i_2137_
			= ((anIntArray9447[i_2133_] + anIntArray9447[i_2134_]
			    + anIntArray9447[i_2135_])
			   / 3);
		    int i_2138_
			= ((anIntArray9448[i_2133_] + anIntArray9448[i_2134_]
			    + anIntArray9448[i_2135_])
			   / 3);
		    float f_2139_
			= (class433_2122_.aFloatArray4853[0] * (float) i_2136_
			   + (class433_2122_.aFloatArray4853[4]
			      * (float) i_2137_)
			   + (class433_2122_.aFloatArray4853[8]
			      * (float) i_2138_)
			   + class433_2122_.aFloatArray4853[12]);
		    float f_2140_
			= (class433_2122_.aFloatArray4853[1] * (float) i_2136_
			   + (class433_2122_.aFloatArray4853[5]
			      * (float) i_2137_)
			   + (class433_2122_.aFloatArray4853[9]
			      * (float) i_2138_)
			   + class433_2122_.aFloatArray4853[13]);
		    float f_2141_
			= (class433_2122_.aFloatArray4853[2] * (float) i_2136_
			   + (class433_2122_.aFloatArray4853[6]
			      * (float) i_2137_)
			   + (class433_2122_.aFloatArray4853[10]
			      * (float) i_2138_)
			   + class433_2122_.aFloatArray4853[14]);
		    float f_2142_
			= (class433_2122_.aFloatArray4853[3] * (float) i_2136_
			   + (class433_2122_.aFloatArray4853[7]
			      * (float) i_2137_)
			   + (class433_2122_.aFloatArray4853[11]
			      * (float) i_2138_)
			   + class433_2122_.aFloatArray4853[15]);
		    f_2141_
			+= ((class433_2106_.aFloatArray4853[2]
			     * (float) (class117.anInt1405 * -169572407))
			    + (class433_2106_.aFloatArray4853[6]
			       * (float) (class117.anInt1406 * -653522829)));
		    f_2142_
			+= ((class433_2106_.aFloatArray4853[3]
			     * (float) (class117.anInt1405 * -169572407))
			    + (class433_2106_.aFloatArray4853[7]
			       * (float) (class117.anInt1406 * -653522829)));
		    if (f_2141_ > -f_2142_) {
			f_2139_
			    += ((class433_2106_.aFloatArray4853[0]
				 * (float) (class117.anInt1405 * -169572407))
				+ (class433_2106_.aFloatArray4853[4]
				   * (float) (class117.anInt1406
					      * -653522829)));
			f_2140_
			    += ((class433_2106_.aFloatArray4853[1]
				 * (float) (class117.anInt1405 * -169572407))
				+ (class433_2106_.aFloatArray4853[5]
				   * (float) (class117.anInt1406
					      * -653522829)));
			float f_2143_ = (aClass185_Sub2_9475.aFloat9342
					 + (aClass185_Sub2_9475.aFloat9361
					    * f_2139_ / f_2142_));
			float f_2144_ = (aClass185_Sub2_9475.aFloat9368
					 + (aClass185_Sub2_9475.aFloat9363
					    * f_2140_ / f_2142_));
			float f_2145_ = (class117.aFloat1403
					 * (float) class118.aShort1414);
			float f_2146_ = (class117.aFloat1404
					 * (float) class118.aShort1413);
			float f_2147_
			    = (f_2139_
			       + class433_2106_.aFloatArray4853[0] * f_2145_
			       + class433_2106_.aFloatArray4853[4] * f_2146_);
			float f_2148_
			    = (f_2140_
			       + class433_2106_.aFloatArray4853[1] * f_2145_
			       + class433_2106_.aFloatArray4853[5] * f_2146_);
			float f_2149_
			    = (f_2142_
			       + class433_2106_.aFloatArray4853[3] * f_2145_
			       + class433_2106_.aFloatArray4853[7] * f_2146_);
			float f_2150_ = (aClass185_Sub2_9475.aFloat9342
					 + (aClass185_Sub2_9475.aFloat9361
					    * f_2147_ / f_2149_));
			float f_2151_ = (aClass185_Sub2_9475.aFloat9368
					 + (aClass185_Sub2_9475.aFloat9363
					    * f_2148_ / f_2149_));
			class117.anInt1407 = (int) f_2143_ * -1511174311;
			class117.anInt1412 = (int) f_2144_ * -773687655;
			class117.aFloat1410
			    = (aClass185_Sub2_9475.aFloat9366
			       + (aClass185_Sub2_9475.aFloat9349
				  * (f_2141_
				     - (class433_2106_.aFloatArray4853[10]
					* (float) (class118.anInt1420
						   * 734303979)))
				  / f_2142_));
			class117.anInt1402
			    = (int) (f_2150_ < f_2143_ ? f_2143_ - f_2150_
				     : f_2150_ - f_2143_) * -620105347;
			class117.anInt1408
			    = (int) (f_2151_ < f_2144_ ? f_2144_ - f_2151_
				     : f_2151_ - f_2144_) * 660144177;
		    } else {
			Class117 class117_2152_ = class117;
			class117.anInt1408 = 0;
			class117_2152_.anInt1402 = 0;
		    }
		}
	    }
	    if (class194 != null) {
		boolean bool_2153_ = false;
		boolean bool_2154_ = true;
		int i_2155_ = aShort9493 + aShort9468 >> 1;
		int i_2156_ = aShort9495 + aShort9449 >> 1;
		int i_2157_ = i_2155_;
		short i_2158_ = aShort9491;
		int i_2159_ = i_2156_;
		float f_2160_
		    = (class433_2122_.aFloatArray4853[0] * (float) i_2157_
		       + class433_2122_.aFloatArray4853[4] * (float) i_2158_
		       + class433_2122_.aFloatArray4853[8] * (float) i_2159_
		       + class433_2122_.aFloatArray4853[12]);
		float f_2161_
		    = (class433_2122_.aFloatArray4853[1] * (float) i_2157_
		       + class433_2122_.aFloatArray4853[5] * (float) i_2158_
		       + class433_2122_.aFloatArray4853[9] * (float) i_2159_
		       + class433_2122_.aFloatArray4853[13]);
		float f_2162_
		    = (class433_2122_.aFloatArray4853[2] * (float) i_2157_
		       + class433_2122_.aFloatArray4853[6] * (float) i_2158_
		       + class433_2122_.aFloatArray4853[10] * (float) i_2159_
		       + class433_2122_.aFloatArray4853[14]);
		float f_2163_
		    = (class433_2122_.aFloatArray4853[3] * (float) i_2157_
		       + class433_2122_.aFloatArray4853[7] * (float) i_2158_
		       + class433_2122_.aFloatArray4853[11] * (float) i_2159_
		       + class433_2122_.aFloatArray4853[15]);
		if (f_2162_ >= -f_2163_) {
		    class194.anInt2148
			= (int) (aClass185_Sub2_9475.aFloat9342
				 + (aClass185_Sub2_9475.aFloat9361 * f_2160_
				    / f_2163_));
		    class194.anInt2149
			= (int) (aClass185_Sub2_9475.aFloat9368
				 + (aClass185_Sub2_9475.aFloat9363 * f_2161_
				    / f_2163_));
		} else
		    bool_2153_ = true;
		i_2157_ = i_2155_;
		i_2158_ = aShort9492;
		i_2159_ = i_2156_;
		float f_2164_
		    = (class433_2122_.aFloatArray4853[0] * (float) i_2157_
		       + class433_2122_.aFloatArray4853[4] * (float) i_2158_
		       + class433_2122_.aFloatArray4853[8] * (float) i_2159_
		       + class433_2122_.aFloatArray4853[12]);
		float f_2165_
		    = (class433_2122_.aFloatArray4853[1] * (float) i_2157_
		       + class433_2122_.aFloatArray4853[5] * (float) i_2158_
		       + class433_2122_.aFloatArray4853[9] * (float) i_2159_
		       + class433_2122_.aFloatArray4853[13]);
		float f_2166_
		    = (class433_2122_.aFloatArray4853[2] * (float) i_2157_
		       + class433_2122_.aFloatArray4853[6] * (float) i_2158_
		       + class433_2122_.aFloatArray4853[10] * (float) i_2159_
		       + class433_2122_.aFloatArray4853[14]);
		float f_2167_
		    = (class433_2122_.aFloatArray4853[3] * (float) i_2157_
		       + class433_2122_.aFloatArray4853[7] * (float) i_2158_
		       + class433_2122_.aFloatArray4853[11] * (float) i_2159_
		       + class433_2122_.aFloatArray4853[15]);
		if (f_2166_ >= -f_2167_) {
		    class194.anInt2152
			= (int) (aClass185_Sub2_9475.aFloat9342
				 + (aClass185_Sub2_9475.aFloat9361 * f_2164_
				    / f_2167_));
		    class194.anInt2151
			= (int) (aClass185_Sub2_9475.aFloat9368
				 + (aClass185_Sub2_9475.aFloat9363 * f_2165_
				    / f_2167_));
		} else
		    bool_2153_ = true;
		if (bool_2153_) {
		    if (f_2162_ < -f_2163_ && f_2166_ < -f_2167_)
			bool_2154_ = false;
		    else if (f_2162_ < -f_2163_) {
			float f_2168_
			    = (f_2162_ + f_2163_) / (f_2166_ + f_2167_) - 1.0F;
			float f_2169_
			    = f_2160_ + f_2168_ * (f_2164_ - f_2160_);
			float f_2170_
			    = f_2161_ + f_2168_ * (f_2165_ - f_2161_);
			float f_2171_
			    = f_2163_ + f_2168_ * (f_2167_ - f_2163_);
			class194.anInt2148
			    = (int) (aClass185_Sub2_9475.aFloat9342
				     + (aClass185_Sub2_9475.aFloat9361
					* f_2169_ / f_2171_));
			class194.anInt2149
			    = (int) (aClass185_Sub2_9475.aFloat9368
				     + (aClass185_Sub2_9475.aFloat9363
					* f_2170_ / f_2171_));
		    } else if (f_2166_ < -f_2167_) {
			float f_2172_
			    = (f_2166_ + f_2167_) / (f_2162_ + f_2163_) - 1.0F;
			float f_2173_
			    = f_2164_ + f_2172_ * (f_2160_ - f_2164_);
			float f_2174_
			    = f_2165_ + f_2172_ * (f_2161_ - f_2165_);
			float f_2175_
			    = f_2167_ + f_2172_ * (f_2163_ - f_2167_);
			class194.anInt2152
			    = (int) (aClass185_Sub2_9475.aFloat9342
				     + (aClass185_Sub2_9475.aFloat9361
					* f_2173_ / f_2175_));
			class194.anInt2151
			    = (int) (aClass185_Sub2_9475.aFloat9368
				     + (aClass185_Sub2_9475.aFloat9363
					* f_2174_ / f_2175_));
		    }
		}
		if (bool_2154_) {
		    if (f_2162_ / f_2163_ > f_2166_ / f_2167_) {
			float f_2176_ = (f_2160_
					 + (class433_2106_.aFloatArray4853[0]
					    * (float) aShort9473)
					 + class433_2106_.aFloatArray4853[12]);
			float f_2177_ = (f_2163_
					 + (class433_2106_.aFloatArray4853[3]
					    * (float) aShort9473)
					 + class433_2106_.aFloatArray4853[15]);
			class194.anInt2147
			    = (int) (aClass185_Sub2_9475.aFloat9342
				     - (float) class194.anInt2148
				     + (aClass185_Sub2_9475.aFloat9361
					* f_2176_ / f_2177_));
		    } else {
			float f_2178_ = (f_2164_
					 + (class433_2106_.aFloatArray4853[0]
					    * (float) aShort9473)
					 + class433_2106_.aFloatArray4853[12]);
			float f_2179_ = (f_2167_
					 + (class433_2106_.aFloatArray4853[3]
					    * (float) aShort9473)
					 + class433_2106_.aFloatArray4853[15]);
			class194.anInt2147
			    = (int) (aClass185_Sub2_9475.aFloat9342
				     - (float) class194.anInt2152
				     + (aClass185_Sub2_9475.aFloat9361
					* f_2178_ / f_2179_));
		    }
		    class194.aBool2150 = true;
		}
	    }
	    method15115(true);
	    aClass119_9489.aBool1423 = (i & 0x1) == 0;
	    aClass119_9489.aBool1424 = false;
	    try {
		method15111(aClass185_Sub2_9475.anIntArray9338 != null,
			    aClass185_Sub2_9475.aFloatArray9341 != null,
			    (i & 0x4) != 0, bool_2123_,
			    ((aClass101_9437.aBool1203
			      && f_2121_ > aClass101_9437.aFloat1204)
			     || aClass101_9437.aBool1245));
	    } catch (Exception exception) {
		/* empty */
	    }
	    if (aClass118Array9485 != null) {
		for (int i_2180_ = 0; i_2180_ < anInt9440; i_2180_++)
		    anIntArray9442[i_2180_] = -1;
	    }
	    aClass119_9489 = null;
	    if (aClass185_Sub2_9475.anInt9367 * 442227785 > 1) {
		synchronized (this) {
		    aBool9497 = false;
		    this.notifyAll();
		}
	    }
	}
    }
    
    final void method15164(boolean bool, boolean bool_2181_,
			   boolean bool_2182_, int i) {
	short i_2183_ = aShortArray9479[i];
	short i_2184_ = aShortArray9455[i];
	short i_2185_ = aShortArray9456[i];
	boolean bool_2186_ = false;
	if (aShortArray9428 != null && aShortArray9428[i] != -1)
	    bool_2186_ = (aClass185_Sub2_9475.aClass177_2012.method2931
			  (aShortArray9428[i] & 0xffff, (byte) 1).aBool2043);
	if (!bool_2186_) {
	    if (aByteArray9469 == null)
		aClass119_9489.anInt1447 = 0;
	    else
		aClass119_9489.anInt1447 = aByteArray9469[i] & 0xff;
	    if (anIntArray9461[i] == -1)
		aClass119_9489.method2137
		    (bool, bool_2181_, bool_2182_, aFloatArray9496[i_2183_],
		     aFloatArray9496[i_2184_], aFloatArray9496[i_2185_],
		     aFloatArray9503[i_2183_], aFloatArray9503[i_2184_],
		     aFloatArray9503[i_2185_], aFloatArray9505[i_2183_],
		     aFloatArray9505[i_2184_], aFloatArray9505[i_2185_],
		     Class415.anIntArray4666[anIntArray9459[i] & 0xffff]);
	    else
		aClass119_9489.method2139
		    (bool, bool_2181_, bool_2182_, aFloatArray9496[i_2183_],
		     aFloatArray9496[i_2184_], aFloatArray9496[i_2185_],
		     aFloatArray9503[i_2183_], aFloatArray9503[i_2184_],
		     aFloatArray9503[i_2185_], aFloatArray9505[i_2183_],
		     aFloatArray9505[i_2184_], aFloatArray9505[i_2185_],
		     (float) (anIntArray9459[i] & 0xffff),
		     (float) (anIntArray9460[i] & 0xffff),
		     (float) (anIntArray9461[i] & 0xffff));
	} else {
	    int i_2187_ = -16777216;
	    if (aByteArray9469 != null)
		i_2187_ = 255 - (aByteArray9469[i] & 0xff) << 24;
	    if (anIntArray9461[i] == -1) {
		int i_2188_ = i_2187_ | anIntArray9459[i] & 0xffffff;
		aClass119_9489.method2166
		    (bool, bool_2181_, bool_2182_, aFloatArray9496[i_2183_],
		     aFloatArray9496[i_2184_], aFloatArray9496[i_2185_],
		     aFloatArray9503[i_2183_], aFloatArray9503[i_2184_],
		     aFloatArray9503[i_2185_], aFloatArray9505[i_2183_],
		     aFloatArray9505[i_2184_], aFloatArray9505[i_2185_],
		     aFloatArray9506[i_2183_], aFloatArray9506[i_2184_],
		     aFloatArray9506[i_2185_], aFloatArrayArray9452[i][0],
		     aFloatArrayArray9452[i][1], aFloatArrayArray9452[i][2],
		     aFloatArrayArray9429[i][0], aFloatArrayArray9429[i][1],
		     aFloatArrayArray9429[i][2], i_2188_, i_2188_, i_2188_,
		     aClass101_9437.anInt1206 * 1046269871, 0.0F, 0.0F, 0.0F,
		     aShortArray9428[i] & 0xffff);
	    } else
		aClass119_9489.method2166
		    (bool, bool_2181_, bool_2182_, aFloatArray9496[i_2183_],
		     aFloatArray9496[i_2184_], aFloatArray9496[i_2185_],
		     aFloatArray9503[i_2183_], aFloatArray9503[i_2184_],
		     aFloatArray9503[i_2185_], aFloatArray9505[i_2183_],
		     aFloatArray9505[i_2184_], aFloatArray9505[i_2185_],
		     aFloatArray9506[i_2183_], aFloatArray9506[i_2184_],
		     aFloatArray9506[i_2185_], aFloatArrayArray9452[i][0],
		     aFloatArrayArray9452[i][1], aFloatArrayArray9452[i][2],
		     aFloatArrayArray9429[i][0], aFloatArrayArray9429[i][1],
		     aFloatArrayArray9429[i][2],
		     i_2187_ | anIntArray9459[i] & 0xffffff,
		     i_2187_ | anIntArray9460[i] & 0xffffff,
		     i_2187_ | anIntArray9461[i] & 0xffffff,
		     aClass101_9437.anInt1206 * 1046269871, 0.0F, 0.0F, 0.0F,
		     aShortArray9428[i] & 0xffff);
	}
    }
    
    final void method15165(boolean bool, boolean bool_2189_,
			   boolean bool_2190_, int i) {
	boolean bool_2191_ = false;
	if (aShortArray9428 != null && aShortArray9428[i] != -1)
	    bool_2191_ = (aClass185_Sub2_9475.aClass177_2012.method2931
			  (aShortArray9428[i] & 0xffff, (byte) 1).aBool2043);
	if (!aClass101_9437.aBool1245) {
	    short i_2192_ = aShortArray9479[i];
	    short i_2193_ = aShortArray9455[i];
	    short i_2194_ = aShortArray9456[i];
	    Class433 class433 = aClass185_Sub2_9475.aClass433_9362;
	    float f = class433.aFloatArray4853[10];
	    float f_2195_ = class433.aFloatArray4853[14];
	    float f_2196_ = class433.aFloatArray4853[11];
	    float f_2197_ = class433.aFloatArray4853[15];
	    float f_2198_ = f_2195_ * f_2196_ - f * f_2197_;
	    float f_2199_
		= ((aFloatArray9505[i_2192_] - aClass101_9437.aFloat1234)
		   * aClass101_9437.aFloat1219);
	    float f_2200_
		= ((aFloatArray9505[i_2193_] - aClass101_9437.aFloat1234)
		   * aClass101_9437.aFloat1219);
	    float f_2201_
		= ((aFloatArray9505[i_2194_] - aClass101_9437.aFloat1234)
		   * aClass101_9437.aFloat1219);
	    float f_2202_ = f_2199_ * f_2198_ / (f_2199_ * f_2196_ - f);
	    float f_2203_ = f_2200_ * f_2198_ / (f_2200_ * f_2196_ - f);
	    float f_2204_ = f_2201_ * f_2198_ / (f_2201_ * f_2196_ - f);
	    float f_2205_ = ((f_2202_ - aClass101_9437.aFloat1204)
			     / aClass101_9437.aFloat1205);
	    if (f_2205_ > 1.0F)
		f_2205_ = 1.0F;
	    else if (f_2205_ < 0.0F)
		f_2205_ = 0.0F;
	    float f_2206_ = ((f_2203_ - aClass101_9437.aFloat1204)
			     / aClass101_9437.aFloat1205);
	    if (f_2206_ > 1.0F)
		f_2206_ = 1.0F;
	    else if (f_2206_ < 0.0F)
		f_2206_ = 0.0F;
	    float f_2207_ = ((f_2204_ - aClass101_9437.aFloat1204)
			     / aClass101_9437.aFloat1205);
	    if (f_2207_ > 1.0F)
		f_2207_ = 1.0F;
	    else if (f_2207_ < 0.0F)
		f_2207_ = 0.0F;
	    float f_2208_ = f_2205_ + f_2206_ + f_2207_;
	    if (!(f_2208_ >= 3.0F)) {
		if (f_2208_ <= 0.0F)
		    method15113(bool, bool_2189_, bool_2190_, i);
		else {
		    if (aByteArray9469 == null)
			aClass119_9489.anInt1447 = 0;
		    else
			aClass119_9489.anInt1447 = aByteArray9469[i] & 0xff;
		    if (!bool_2191_) {
			if (anIntArray9461[i] == -1)
			    aClass119_9489.method2141
				(bool, bool_2189_, bool_2190_,
				 aFloatArray9496[i_2192_],
				 aFloatArray9496[i_2193_],
				 aFloatArray9496[i_2194_],
				 aFloatArray9503[i_2192_],
				 aFloatArray9503[i_2193_],
				 aFloatArray9503[i_2194_],
				 aFloatArray9505[i_2192_],
				 aFloatArray9505[i_2193_],
				 aFloatArray9505[i_2194_],
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9459[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_2205_ * 255.0F,
						    (byte) 29),
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9459[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_2206_ * 255.0F,
						    (byte) 49),
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9459[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_2207_ * 255.0F,
						    (byte) 80));
			else
			    aClass119_9489.method2141
				(bool, bool_2189_, bool_2190_,
				 aFloatArray9496[i_2192_],
				 aFloatArray9496[i_2193_],
				 aFloatArray9496[i_2194_],
				 aFloatArray9503[i_2192_],
				 aFloatArray9503[i_2193_],
				 aFloatArray9503[i_2194_],
				 aFloatArray9505[i_2192_],
				 aFloatArray9505[i_2193_],
				 aFloatArray9505[i_2194_],
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9459[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_2205_ * 255.0F,
						    (byte) 45),
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9460[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_2206_ * 255.0F,
						    (byte) -77),
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9461[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_2207_ * 255.0F,
						    (byte) -8));
		    } else {
			int i_2209_ = -16777216;
			if (aByteArray9469 != null)
			    i_2209_ = 255 - (aByteArray9469[i] & 0xff) << 24;
			if (anIntArray9461[i] == -1) {
			    int i_2210_
				= i_2209_ | anIntArray9459[i] & 0xffffff;
			    aClass119_9489.method2166
				(bool, bool_2189_, bool_2190_,
				 aFloatArray9496[i_2192_],
				 aFloatArray9496[i_2193_],
				 aFloatArray9496[i_2194_],
				 aFloatArray9503[i_2192_],
				 aFloatArray9503[i_2193_],
				 aFloatArray9503[i_2194_],
				 aFloatArray9505[i_2192_],
				 aFloatArray9505[i_2193_],
				 aFloatArray9505[i_2194_],
				 aFloatArray9506[i_2192_],
				 aFloatArray9506[i_2193_],
				 aFloatArray9506[i_2194_],
				 aFloatArrayArray9452[i][0],
				 aFloatArrayArray9452[i][1],
				 aFloatArrayArray9452[i][2],
				 aFloatArrayArray9429[i][0],
				 aFloatArrayArray9429[i][1],
				 aFloatArrayArray9429[i][2], i_2210_, i_2210_,
				 i_2210_,
				 aClass101_9437.anInt1206 * 1046269871,
				 f_2205_ * 255.0F, f_2206_ * 255.0F,
				 f_2207_ * 255.0F,
				 aShortArray9428[i] & 0xffff);
			} else
			    aClass119_9489.method2166
				(bool, bool_2189_, bool_2190_,
				 aFloatArray9496[i_2192_],
				 aFloatArray9496[i_2193_],
				 aFloatArray9496[i_2194_],
				 aFloatArray9503[i_2192_],
				 aFloatArray9503[i_2193_],
				 aFloatArray9503[i_2194_],
				 aFloatArray9505[i_2192_],
				 aFloatArray9505[i_2193_],
				 aFloatArray9505[i_2194_],
				 aFloatArray9506[i_2192_],
				 aFloatArray9506[i_2193_],
				 aFloatArray9506[i_2194_],
				 aFloatArrayArray9452[i][0],
				 aFloatArrayArray9452[i][1],
				 aFloatArrayArray9452[i][2],
				 aFloatArrayArray9429[i][0],
				 aFloatArrayArray9429[i][1],
				 aFloatArrayArray9429[i][2],
				 i_2209_ | anIntArray9459[i] & 0xffffff,
				 i_2209_ | anIntArray9460[i] & 0xffffff,
				 i_2209_ | anIntArray9461[i] & 0xffffff,
				 aClass101_9437.anInt1206 * 1046269871,
				 f_2205_ * 255.0F, f_2206_ * 255.0F,
				 f_2207_ * 255.0F,
				 aShortArray9428[i] & 0xffff);
		    }
		}
	    }
	} else {
	    short i_2211_ = aShortArray9479[i];
	    short i_2212_ = aShortArray9455[i];
	    short i_2213_ = aShortArray9456[i];
	    float f = 0.0F;
	    float f_2214_ = 0.0F;
	    float f_2215_ = 0.0F;
	    if (anIntArray9502[i_2211_]
		> aClass101_9437.anInt1210 * -1240216431)
		f = 1.0F;
	    else if (anIntArray9502[i_2211_]
		     > aClass101_9437.anInt1209 * 391389271)
		f = ((float) (aClass101_9437.anInt1209 * 391389271
			      - anIntArray9502[i_2211_])
		     * 1.0F
		     / (float) (aClass101_9437.anInt1209 * 391389271
				- aClass101_9437.anInt1210 * -1240216431));
	    if (anIntArray9502[i_2212_]
		> aClass101_9437.anInt1210 * -1240216431)
		f_2214_ = 1.0F;
	    else if (anIntArray9502[i_2212_]
		     > aClass101_9437.anInt1209 * 391389271)
		f_2214_
		    = ((float) (aClass101_9437.anInt1209 * 391389271
				- anIntArray9502[i_2212_])
		       * 1.0F
		       / (float) (aClass101_9437.anInt1209 * 391389271
				  - aClass101_9437.anInt1210 * -1240216431));
	    if (anIntArray9502[i_2213_]
		> aClass101_9437.anInt1210 * -1240216431)
		f_2215_ = 1.0F;
	    else if (anIntArray9502[i_2213_]
		     > aClass101_9437.anInt1209 * 391389271)
		f_2215_
		    = ((float) (aClass101_9437.anInt1209 * 391389271
				- anIntArray9502[i_2213_])
		       * 1.0F
		       / (float) (aClass101_9437.anInt1209 * 391389271
				  - aClass101_9437.anInt1210 * -1240216431));
	    if (aByteArray9469 == null)
		aClass119_9489.anInt1447 = 0;
	    else
		aClass119_9489.anInt1447 = aByteArray9469[i] & 0xff;
	    if (!bool_2191_) {
		if (anIntArray9461[i] == -1)
		    aClass119_9489.method2141
			(bool, bool_2189_, bool_2190_,
			 aFloatArray9496[i_2211_], aFloatArray9496[i_2212_],
			 aFloatArray9496[i_2213_], aFloatArray9503[i_2211_],
			 aFloatArray9503[i_2212_], aFloatArray9503[i_2213_],
			 aFloatArray9505[i_2211_], aFloatArray9505[i_2212_],
			 aFloatArray9505[i_2213_],
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9459[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f * 255.0F, (byte) 55),
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9459[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f_2214_ * 255.0F, (byte) -93),
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9459[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f_2215_ * 255.0F, (byte) 58));
		else
		    aClass119_9489.method2141
			(bool, bool_2189_, bool_2190_,
			 aFloatArray9496[i_2211_], aFloatArray9496[i_2212_],
			 aFloatArray9496[i_2213_], aFloatArray9503[i_2211_],
			 aFloatArray9503[i_2212_], aFloatArray9503[i_2213_],
			 aFloatArray9505[i_2211_], aFloatArray9505[i_2212_],
			 aFloatArray9505[i_2213_],
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9459[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f * 255.0F, (byte) 35),
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9460[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f_2214_ * 255.0F, (byte) -38),
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9461[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f_2215_ * 255.0F, (byte) -27));
	    } else {
		int i_2216_ = -16777216;
		if (aByteArray9469 != null)
		    i_2216_ = 255 - (aByteArray9469[i] & 0xff) << 24;
		if (anIntArray9461[i] == -1) {
		    int i_2217_ = i_2216_ | anIntArray9459[i] & 0xffffff;
		    aClass119_9489.method2166
			(bool, bool_2189_, bool_2190_,
			 aFloatArray9496[i_2211_], aFloatArray9496[i_2212_],
			 aFloatArray9496[i_2213_], aFloatArray9503[i_2211_],
			 aFloatArray9503[i_2212_], aFloatArray9503[i_2213_],
			 aFloatArray9505[i_2211_], aFloatArray9505[i_2212_],
			 aFloatArray9505[i_2213_], aFloatArray9506[i_2211_],
			 aFloatArray9506[i_2212_], aFloatArray9506[i_2213_],
			 aFloatArrayArray9452[i][0],
			 aFloatArrayArray9452[i][1],
			 aFloatArrayArray9452[i][2],
			 aFloatArrayArray9429[i][0],
			 aFloatArrayArray9429[i][1],
			 aFloatArrayArray9429[i][2], i_2217_, i_2217_, i_2217_,
			 aClass101_9437.anInt1206 * 1046269871, f * 255.0F,
			 f_2214_ * 255.0F, f_2215_ * 255.0F,
			 aShortArray9428[i] & 0xffff);
		} else
		    aClass119_9489.method2166
			(bool, bool_2189_, bool_2190_,
			 aFloatArray9496[i_2211_], aFloatArray9496[i_2212_],
			 aFloatArray9496[i_2213_], aFloatArray9503[i_2211_],
			 aFloatArray9503[i_2212_], aFloatArray9503[i_2213_],
			 aFloatArray9505[i_2211_], aFloatArray9505[i_2212_],
			 aFloatArray9505[i_2213_], aFloatArray9506[i_2211_],
			 aFloatArray9506[i_2212_], aFloatArray9506[i_2213_],
			 aFloatArrayArray9452[i][0],
			 aFloatArrayArray9452[i][1],
			 aFloatArrayArray9452[i][2],
			 aFloatArrayArray9429[i][0],
			 aFloatArrayArray9429[i][1],
			 aFloatArrayArray9429[i][2],
			 i_2216_ | anIntArray9459[i] & 0xffffff,
			 i_2216_ | anIntArray9460[i] & 0xffffff,
			 i_2216_ | anIntArray9461[i] & 0xffffff,
			 aClass101_9437.anInt1206 * 1046269871, f * 255.0F,
			 f_2214_ * 255.0F, f_2215_ * 255.0F,
			 aShortArray9428[i] & 0xffff);
	    }
	}
    }
    
    final void method15166(boolean bool, boolean bool_2218_,
			   boolean bool_2219_, int i) {
	boolean bool_2220_ = false;
	if (aShortArray9428 != null && aShortArray9428[i] != -1)
	    bool_2220_ = (aClass185_Sub2_9475.aClass177_2012.method2931
			  (aShortArray9428[i] & 0xffff, (byte) 1).aBool2043);
	if (!aClass101_9437.aBool1245) {
	    short i_2221_ = aShortArray9479[i];
	    short i_2222_ = aShortArray9455[i];
	    short i_2223_ = aShortArray9456[i];
	    Class433 class433 = aClass185_Sub2_9475.aClass433_9362;
	    float f = class433.aFloatArray4853[10];
	    float f_2224_ = class433.aFloatArray4853[14];
	    float f_2225_ = class433.aFloatArray4853[11];
	    float f_2226_ = class433.aFloatArray4853[15];
	    float f_2227_ = f_2224_ * f_2225_ - f * f_2226_;
	    float f_2228_
		= ((aFloatArray9505[i_2221_] - aClass101_9437.aFloat1234)
		   * aClass101_9437.aFloat1219);
	    float f_2229_
		= ((aFloatArray9505[i_2222_] - aClass101_9437.aFloat1234)
		   * aClass101_9437.aFloat1219);
	    float f_2230_
		= ((aFloatArray9505[i_2223_] - aClass101_9437.aFloat1234)
		   * aClass101_9437.aFloat1219);
	    float f_2231_ = f_2228_ * f_2227_ / (f_2228_ * f_2225_ - f);
	    float f_2232_ = f_2229_ * f_2227_ / (f_2229_ * f_2225_ - f);
	    float f_2233_ = f_2230_ * f_2227_ / (f_2230_ * f_2225_ - f);
	    float f_2234_ = ((f_2231_ - aClass101_9437.aFloat1204)
			     / aClass101_9437.aFloat1205);
	    if (f_2234_ > 1.0F)
		f_2234_ = 1.0F;
	    else if (f_2234_ < 0.0F)
		f_2234_ = 0.0F;
	    float f_2235_ = ((f_2232_ - aClass101_9437.aFloat1204)
			     / aClass101_9437.aFloat1205);
	    if (f_2235_ > 1.0F)
		f_2235_ = 1.0F;
	    else if (f_2235_ < 0.0F)
		f_2235_ = 0.0F;
	    float f_2236_ = ((f_2233_ - aClass101_9437.aFloat1204)
			     / aClass101_9437.aFloat1205);
	    if (f_2236_ > 1.0F)
		f_2236_ = 1.0F;
	    else if (f_2236_ < 0.0F)
		f_2236_ = 0.0F;
	    float f_2237_ = f_2234_ + f_2235_ + f_2236_;
	    if (!(f_2237_ >= 3.0F)) {
		if (f_2237_ <= 0.0F)
		    method15113(bool, bool_2218_, bool_2219_, i);
		else {
		    if (aByteArray9469 == null)
			aClass119_9489.anInt1447 = 0;
		    else
			aClass119_9489.anInt1447 = aByteArray9469[i] & 0xff;
		    if (!bool_2220_) {
			if (anIntArray9461[i] == -1)
			    aClass119_9489.method2141
				(bool, bool_2218_, bool_2219_,
				 aFloatArray9496[i_2221_],
				 aFloatArray9496[i_2222_],
				 aFloatArray9496[i_2223_],
				 aFloatArray9503[i_2221_],
				 aFloatArray9503[i_2222_],
				 aFloatArray9503[i_2223_],
				 aFloatArray9505[i_2221_],
				 aFloatArray9505[i_2222_],
				 aFloatArray9505[i_2223_],
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9459[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_2234_ * 255.0F,
						    (byte) 97),
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9459[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_2235_ * 255.0F,
						    (byte) -36),
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9459[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_2236_ * 255.0F,
						    (byte) 76));
			else
			    aClass119_9489.method2141
				(bool, bool_2218_, bool_2219_,
				 aFloatArray9496[i_2221_],
				 aFloatArray9496[i_2222_],
				 aFloatArray9496[i_2223_],
				 aFloatArray9503[i_2221_],
				 aFloatArray9503[i_2222_],
				 aFloatArray9503[i_2223_],
				 aFloatArray9505[i_2221_],
				 aFloatArray9505[i_2222_],
				 aFloatArray9505[i_2223_],
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9459[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_2234_ * 255.0F,
						    (byte) -19),
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9460[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_2235_ * 255.0F,
						    (byte) 9),
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9461[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_2236_ * 255.0F,
						    (byte) 9));
		    } else {
			int i_2238_ = -16777216;
			if (aByteArray9469 != null)
			    i_2238_ = 255 - (aByteArray9469[i] & 0xff) << 24;
			if (anIntArray9461[i] == -1) {
			    int i_2239_
				= i_2238_ | anIntArray9459[i] & 0xffffff;
			    aClass119_9489.method2166
				(bool, bool_2218_, bool_2219_,
				 aFloatArray9496[i_2221_],
				 aFloatArray9496[i_2222_],
				 aFloatArray9496[i_2223_],
				 aFloatArray9503[i_2221_],
				 aFloatArray9503[i_2222_],
				 aFloatArray9503[i_2223_],
				 aFloatArray9505[i_2221_],
				 aFloatArray9505[i_2222_],
				 aFloatArray9505[i_2223_],
				 aFloatArray9506[i_2221_],
				 aFloatArray9506[i_2222_],
				 aFloatArray9506[i_2223_],
				 aFloatArrayArray9452[i][0],
				 aFloatArrayArray9452[i][1],
				 aFloatArrayArray9452[i][2],
				 aFloatArrayArray9429[i][0],
				 aFloatArrayArray9429[i][1],
				 aFloatArrayArray9429[i][2], i_2239_, i_2239_,
				 i_2239_,
				 aClass101_9437.anInt1206 * 1046269871,
				 f_2234_ * 255.0F, f_2235_ * 255.0F,
				 f_2236_ * 255.0F,
				 aShortArray9428[i] & 0xffff);
			} else
			    aClass119_9489.method2166
				(bool, bool_2218_, bool_2219_,
				 aFloatArray9496[i_2221_],
				 aFloatArray9496[i_2222_],
				 aFloatArray9496[i_2223_],
				 aFloatArray9503[i_2221_],
				 aFloatArray9503[i_2222_],
				 aFloatArray9503[i_2223_],
				 aFloatArray9505[i_2221_],
				 aFloatArray9505[i_2222_],
				 aFloatArray9505[i_2223_],
				 aFloatArray9506[i_2221_],
				 aFloatArray9506[i_2222_],
				 aFloatArray9506[i_2223_],
				 aFloatArrayArray9452[i][0],
				 aFloatArrayArray9452[i][1],
				 aFloatArrayArray9452[i][2],
				 aFloatArrayArray9429[i][0],
				 aFloatArrayArray9429[i][1],
				 aFloatArrayArray9429[i][2],
				 i_2238_ | anIntArray9459[i] & 0xffffff,
				 i_2238_ | anIntArray9460[i] & 0xffffff,
				 i_2238_ | anIntArray9461[i] & 0xffffff,
				 aClass101_9437.anInt1206 * 1046269871,
				 f_2234_ * 255.0F, f_2235_ * 255.0F,
				 f_2236_ * 255.0F,
				 aShortArray9428[i] & 0xffff);
		    }
		}
	    }
	} else {
	    short i_2240_ = aShortArray9479[i];
	    short i_2241_ = aShortArray9455[i];
	    short i_2242_ = aShortArray9456[i];
	    float f = 0.0F;
	    float f_2243_ = 0.0F;
	    float f_2244_ = 0.0F;
	    if (anIntArray9502[i_2240_]
		> aClass101_9437.anInt1210 * -1240216431)
		f = 1.0F;
	    else if (anIntArray9502[i_2240_]
		     > aClass101_9437.anInt1209 * 391389271)
		f = ((float) (aClass101_9437.anInt1209 * 391389271
			      - anIntArray9502[i_2240_])
		     * 1.0F
		     / (float) (aClass101_9437.anInt1209 * 391389271
				- aClass101_9437.anInt1210 * -1240216431));
	    if (anIntArray9502[i_2241_]
		> aClass101_9437.anInt1210 * -1240216431)
		f_2243_ = 1.0F;
	    else if (anIntArray9502[i_2241_]
		     > aClass101_9437.anInt1209 * 391389271)
		f_2243_
		    = ((float) (aClass101_9437.anInt1209 * 391389271
				- anIntArray9502[i_2241_])
		       * 1.0F
		       / (float) (aClass101_9437.anInt1209 * 391389271
				  - aClass101_9437.anInt1210 * -1240216431));
	    if (anIntArray9502[i_2242_]
		> aClass101_9437.anInt1210 * -1240216431)
		f_2244_ = 1.0F;
	    else if (anIntArray9502[i_2242_]
		     > aClass101_9437.anInt1209 * 391389271)
		f_2244_
		    = ((float) (aClass101_9437.anInt1209 * 391389271
				- anIntArray9502[i_2242_])
		       * 1.0F
		       / (float) (aClass101_9437.anInt1209 * 391389271
				  - aClass101_9437.anInt1210 * -1240216431));
	    if (aByteArray9469 == null)
		aClass119_9489.anInt1447 = 0;
	    else
		aClass119_9489.anInt1447 = aByteArray9469[i] & 0xff;
	    if (!bool_2220_) {
		if (anIntArray9461[i] == -1)
		    aClass119_9489.method2141
			(bool, bool_2218_, bool_2219_,
			 aFloatArray9496[i_2240_], aFloatArray9496[i_2241_],
			 aFloatArray9496[i_2242_], aFloatArray9503[i_2240_],
			 aFloatArray9503[i_2241_], aFloatArray9503[i_2242_],
			 aFloatArray9505[i_2240_], aFloatArray9505[i_2241_],
			 aFloatArray9505[i_2242_],
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9459[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f * 255.0F, (byte) -23),
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9459[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f_2243_ * 255.0F, (byte) -21),
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9459[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f_2244_ * 255.0F, (byte) -64));
		else
		    aClass119_9489.method2141
			(bool, bool_2218_, bool_2219_,
			 aFloatArray9496[i_2240_], aFloatArray9496[i_2241_],
			 aFloatArray9496[i_2242_], aFloatArray9503[i_2240_],
			 aFloatArray9503[i_2241_], aFloatArray9503[i_2242_],
			 aFloatArray9505[i_2240_], aFloatArray9505[i_2241_],
			 aFloatArray9505[i_2242_],
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9459[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f * 255.0F, (byte) -2),
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9460[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f_2243_ * 255.0F, (byte) 35),
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9461[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f_2244_ * 255.0F, (byte) 6));
	    } else {
		int i_2245_ = -16777216;
		if (aByteArray9469 != null)
		    i_2245_ = 255 - (aByteArray9469[i] & 0xff) << 24;
		if (anIntArray9461[i] == -1) {
		    int i_2246_ = i_2245_ | anIntArray9459[i] & 0xffffff;
		    aClass119_9489.method2166
			(bool, bool_2218_, bool_2219_,
			 aFloatArray9496[i_2240_], aFloatArray9496[i_2241_],
			 aFloatArray9496[i_2242_], aFloatArray9503[i_2240_],
			 aFloatArray9503[i_2241_], aFloatArray9503[i_2242_],
			 aFloatArray9505[i_2240_], aFloatArray9505[i_2241_],
			 aFloatArray9505[i_2242_], aFloatArray9506[i_2240_],
			 aFloatArray9506[i_2241_], aFloatArray9506[i_2242_],
			 aFloatArrayArray9452[i][0],
			 aFloatArrayArray9452[i][1],
			 aFloatArrayArray9452[i][2],
			 aFloatArrayArray9429[i][0],
			 aFloatArrayArray9429[i][1],
			 aFloatArrayArray9429[i][2], i_2246_, i_2246_, i_2246_,
			 aClass101_9437.anInt1206 * 1046269871, f * 255.0F,
			 f_2243_ * 255.0F, f_2244_ * 255.0F,
			 aShortArray9428[i] & 0xffff);
		} else
		    aClass119_9489.method2166
			(bool, bool_2218_, bool_2219_,
			 aFloatArray9496[i_2240_], aFloatArray9496[i_2241_],
			 aFloatArray9496[i_2242_], aFloatArray9503[i_2240_],
			 aFloatArray9503[i_2241_], aFloatArray9503[i_2242_],
			 aFloatArray9505[i_2240_], aFloatArray9505[i_2241_],
			 aFloatArray9505[i_2242_], aFloatArray9506[i_2240_],
			 aFloatArray9506[i_2241_], aFloatArray9506[i_2242_],
			 aFloatArrayArray9452[i][0],
			 aFloatArrayArray9452[i][1],
			 aFloatArrayArray9452[i][2],
			 aFloatArrayArray9429[i][0],
			 aFloatArrayArray9429[i][1],
			 aFloatArrayArray9429[i][2],
			 i_2245_ | anIntArray9459[i] & 0xffffff,
			 i_2245_ | anIntArray9460[i] & 0xffffff,
			 i_2245_ | anIntArray9461[i] & 0xffffff,
			 aClass101_9437.anInt1206 * 1046269871, f * 255.0F,
			 f_2243_ * 255.0F, f_2244_ * 255.0F,
			 aShortArray9428[i] & 0xffff);
	    }
	}
    }
    
    void method3184() {
	if (aClass185_Sub2_9475.anInt9367 * 442227785 > 1) {
	    synchronized (this) {
		aBool1973 = false;
		this.notifyAll();
	    }
	}
    }
    
    final void method15167(boolean bool, boolean bool_2247_,
			   boolean bool_2248_, int i) {
	boolean bool_2249_ = false;
	if (aShortArray9428 != null && aShortArray9428[i] != -1)
	    bool_2249_ = (aClass185_Sub2_9475.aClass177_2012.method2931
			  (aShortArray9428[i] & 0xffff, (byte) 1).aBool2043);
	if (!aClass101_9437.aBool1245) {
	    short i_2250_ = aShortArray9479[i];
	    short i_2251_ = aShortArray9455[i];
	    short i_2252_ = aShortArray9456[i];
	    Class433 class433 = aClass185_Sub2_9475.aClass433_9362;
	    float f = class433.aFloatArray4853[10];
	    float f_2253_ = class433.aFloatArray4853[14];
	    float f_2254_ = class433.aFloatArray4853[11];
	    float f_2255_ = class433.aFloatArray4853[15];
	    float f_2256_ = f_2253_ * f_2254_ - f * f_2255_;
	    float f_2257_
		= ((aFloatArray9505[i_2250_] - aClass101_9437.aFloat1234)
		   * aClass101_9437.aFloat1219);
	    float f_2258_
		= ((aFloatArray9505[i_2251_] - aClass101_9437.aFloat1234)
		   * aClass101_9437.aFloat1219);
	    float f_2259_
		= ((aFloatArray9505[i_2252_] - aClass101_9437.aFloat1234)
		   * aClass101_9437.aFloat1219);
	    float f_2260_ = f_2257_ * f_2256_ / (f_2257_ * f_2254_ - f);
	    float f_2261_ = f_2258_ * f_2256_ / (f_2258_ * f_2254_ - f);
	    float f_2262_ = f_2259_ * f_2256_ / (f_2259_ * f_2254_ - f);
	    float f_2263_ = ((f_2260_ - aClass101_9437.aFloat1204)
			     / aClass101_9437.aFloat1205);
	    if (f_2263_ > 1.0F)
		f_2263_ = 1.0F;
	    else if (f_2263_ < 0.0F)
		f_2263_ = 0.0F;
	    float f_2264_ = ((f_2261_ - aClass101_9437.aFloat1204)
			     / aClass101_9437.aFloat1205);
	    if (f_2264_ > 1.0F)
		f_2264_ = 1.0F;
	    else if (f_2264_ < 0.0F)
		f_2264_ = 0.0F;
	    float f_2265_ = ((f_2262_ - aClass101_9437.aFloat1204)
			     / aClass101_9437.aFloat1205);
	    if (f_2265_ > 1.0F)
		f_2265_ = 1.0F;
	    else if (f_2265_ < 0.0F)
		f_2265_ = 0.0F;
	    float f_2266_ = f_2263_ + f_2264_ + f_2265_;
	    if (!(f_2266_ >= 3.0F)) {
		if (f_2266_ <= 0.0F)
		    method15113(bool, bool_2247_, bool_2248_, i);
		else {
		    if (aByteArray9469 == null)
			aClass119_9489.anInt1447 = 0;
		    else
			aClass119_9489.anInt1447 = aByteArray9469[i] & 0xff;
		    if (!bool_2249_) {
			if (anIntArray9461[i] == -1)
			    aClass119_9489.method2141
				(bool, bool_2247_, bool_2248_,
				 aFloatArray9496[i_2250_],
				 aFloatArray9496[i_2251_],
				 aFloatArray9496[i_2252_],
				 aFloatArray9503[i_2250_],
				 aFloatArray9503[i_2251_],
				 aFloatArray9503[i_2252_],
				 aFloatArray9505[i_2250_],
				 aFloatArray9505[i_2251_],
				 aFloatArray9505[i_2252_],
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9459[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_2263_ * 255.0F,
						    (byte) -19),
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9459[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_2264_ * 255.0F,
						    (byte) -5),
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9459[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_2265_ * 255.0F,
						    (byte) -9));
			else
			    aClass119_9489.method2141
				(bool, bool_2247_, bool_2248_,
				 aFloatArray9496[i_2250_],
				 aFloatArray9496[i_2251_],
				 aFloatArray9496[i_2252_],
				 aFloatArray9503[i_2250_],
				 aFloatArray9503[i_2251_],
				 aFloatArray9503[i_2252_],
				 aFloatArray9505[i_2250_],
				 aFloatArray9505[i_2251_],
				 aFloatArray9505[i_2252_],
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9459[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_2263_ * 255.0F,
						    (byte) 3),
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9460[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_2264_ * 255.0F,
						    (byte) 28),
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9461[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_2265_ * 255.0F,
						    (byte) 56));
		    } else {
			int i_2267_ = -16777216;
			if (aByteArray9469 != null)
			    i_2267_ = 255 - (aByteArray9469[i] & 0xff) << 24;
			if (anIntArray9461[i] == -1) {
			    int i_2268_
				= i_2267_ | anIntArray9459[i] & 0xffffff;
			    aClass119_9489.method2166
				(bool, bool_2247_, bool_2248_,
				 aFloatArray9496[i_2250_],
				 aFloatArray9496[i_2251_],
				 aFloatArray9496[i_2252_],
				 aFloatArray9503[i_2250_],
				 aFloatArray9503[i_2251_],
				 aFloatArray9503[i_2252_],
				 aFloatArray9505[i_2250_],
				 aFloatArray9505[i_2251_],
				 aFloatArray9505[i_2252_],
				 aFloatArray9506[i_2250_],
				 aFloatArray9506[i_2251_],
				 aFloatArray9506[i_2252_],
				 aFloatArrayArray9452[i][0],
				 aFloatArrayArray9452[i][1],
				 aFloatArrayArray9452[i][2],
				 aFloatArrayArray9429[i][0],
				 aFloatArrayArray9429[i][1],
				 aFloatArrayArray9429[i][2], i_2268_, i_2268_,
				 i_2268_,
				 aClass101_9437.anInt1206 * 1046269871,
				 f_2263_ * 255.0F, f_2264_ * 255.0F,
				 f_2265_ * 255.0F,
				 aShortArray9428[i] & 0xffff);
			} else
			    aClass119_9489.method2166
				(bool, bool_2247_, bool_2248_,
				 aFloatArray9496[i_2250_],
				 aFloatArray9496[i_2251_],
				 aFloatArray9496[i_2252_],
				 aFloatArray9503[i_2250_],
				 aFloatArray9503[i_2251_],
				 aFloatArray9503[i_2252_],
				 aFloatArray9505[i_2250_],
				 aFloatArray9505[i_2251_],
				 aFloatArray9505[i_2252_],
				 aFloatArray9506[i_2250_],
				 aFloatArray9506[i_2251_],
				 aFloatArray9506[i_2252_],
				 aFloatArrayArray9452[i][0],
				 aFloatArrayArray9452[i][1],
				 aFloatArrayArray9452[i][2],
				 aFloatArrayArray9429[i][0],
				 aFloatArrayArray9429[i][1],
				 aFloatArrayArray9429[i][2],
				 i_2267_ | anIntArray9459[i] & 0xffffff,
				 i_2267_ | anIntArray9460[i] & 0xffffff,
				 i_2267_ | anIntArray9461[i] & 0xffffff,
				 aClass101_9437.anInt1206 * 1046269871,
				 f_2263_ * 255.0F, f_2264_ * 255.0F,
				 f_2265_ * 255.0F,
				 aShortArray9428[i] & 0xffff);
		    }
		}
	    }
	} else {
	    short i_2269_ = aShortArray9479[i];
	    short i_2270_ = aShortArray9455[i];
	    short i_2271_ = aShortArray9456[i];
	    float f = 0.0F;
	    float f_2272_ = 0.0F;
	    float f_2273_ = 0.0F;
	    if (anIntArray9502[i_2269_]
		> aClass101_9437.anInt1210 * -1240216431)
		f = 1.0F;
	    else if (anIntArray9502[i_2269_]
		     > aClass101_9437.anInt1209 * 391389271)
		f = ((float) (aClass101_9437.anInt1209 * 391389271
			      - anIntArray9502[i_2269_])
		     * 1.0F
		     / (float) (aClass101_9437.anInt1209 * 391389271
				- aClass101_9437.anInt1210 * -1240216431));
	    if (anIntArray9502[i_2270_]
		> aClass101_9437.anInt1210 * -1240216431)
		f_2272_ = 1.0F;
	    else if (anIntArray9502[i_2270_]
		     > aClass101_9437.anInt1209 * 391389271)
		f_2272_
		    = ((float) (aClass101_9437.anInt1209 * 391389271
				- anIntArray9502[i_2270_])
		       * 1.0F
		       / (float) (aClass101_9437.anInt1209 * 391389271
				  - aClass101_9437.anInt1210 * -1240216431));
	    if (anIntArray9502[i_2271_]
		> aClass101_9437.anInt1210 * -1240216431)
		f_2273_ = 1.0F;
	    else if (anIntArray9502[i_2271_]
		     > aClass101_9437.anInt1209 * 391389271)
		f_2273_
		    = ((float) (aClass101_9437.anInt1209 * 391389271
				- anIntArray9502[i_2271_])
		       * 1.0F
		       / (float) (aClass101_9437.anInt1209 * 391389271
				  - aClass101_9437.anInt1210 * -1240216431));
	    if (aByteArray9469 == null)
		aClass119_9489.anInt1447 = 0;
	    else
		aClass119_9489.anInt1447 = aByteArray9469[i] & 0xff;
	    if (!bool_2249_) {
		if (anIntArray9461[i] == -1)
		    aClass119_9489.method2141
			(bool, bool_2247_, bool_2248_,
			 aFloatArray9496[i_2269_], aFloatArray9496[i_2270_],
			 aFloatArray9496[i_2271_], aFloatArray9503[i_2269_],
			 aFloatArray9503[i_2270_], aFloatArray9503[i_2271_],
			 aFloatArray9505[i_2269_], aFloatArray9505[i_2270_],
			 aFloatArray9505[i_2271_],
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9459[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f * 255.0F, (byte) 71),
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9459[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f_2272_ * 255.0F, (byte) 63),
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9459[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f_2273_ * 255.0F, (byte) -89));
		else
		    aClass119_9489.method2141
			(bool, bool_2247_, bool_2248_,
			 aFloatArray9496[i_2269_], aFloatArray9496[i_2270_],
			 aFloatArray9496[i_2271_], aFloatArray9503[i_2269_],
			 aFloatArray9503[i_2270_], aFloatArray9503[i_2271_],
			 aFloatArray9505[i_2269_], aFloatArray9505[i_2270_],
			 aFloatArray9505[i_2271_],
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9459[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f * 255.0F, (byte) 25),
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9460[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f_2272_ * 255.0F, (byte) 45),
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9461[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f_2273_ * 255.0F, (byte) 81));
	    } else {
		int i_2274_ = -16777216;
		if (aByteArray9469 != null)
		    i_2274_ = 255 - (aByteArray9469[i] & 0xff) << 24;
		if (anIntArray9461[i] == -1) {
		    int i_2275_ = i_2274_ | anIntArray9459[i] & 0xffffff;
		    aClass119_9489.method2166
			(bool, bool_2247_, bool_2248_,
			 aFloatArray9496[i_2269_], aFloatArray9496[i_2270_],
			 aFloatArray9496[i_2271_], aFloatArray9503[i_2269_],
			 aFloatArray9503[i_2270_], aFloatArray9503[i_2271_],
			 aFloatArray9505[i_2269_], aFloatArray9505[i_2270_],
			 aFloatArray9505[i_2271_], aFloatArray9506[i_2269_],
			 aFloatArray9506[i_2270_], aFloatArray9506[i_2271_],
			 aFloatArrayArray9452[i][0],
			 aFloatArrayArray9452[i][1],
			 aFloatArrayArray9452[i][2],
			 aFloatArrayArray9429[i][0],
			 aFloatArrayArray9429[i][1],
			 aFloatArrayArray9429[i][2], i_2275_, i_2275_, i_2275_,
			 aClass101_9437.anInt1206 * 1046269871, f * 255.0F,
			 f_2272_ * 255.0F, f_2273_ * 255.0F,
			 aShortArray9428[i] & 0xffff);
		} else
		    aClass119_9489.method2166
			(bool, bool_2247_, bool_2248_,
			 aFloatArray9496[i_2269_], aFloatArray9496[i_2270_],
			 aFloatArray9496[i_2271_], aFloatArray9503[i_2269_],
			 aFloatArray9503[i_2270_], aFloatArray9503[i_2271_],
			 aFloatArray9505[i_2269_], aFloatArray9505[i_2270_],
			 aFloatArray9505[i_2271_], aFloatArray9506[i_2269_],
			 aFloatArray9506[i_2270_], aFloatArray9506[i_2271_],
			 aFloatArrayArray9452[i][0],
			 aFloatArrayArray9452[i][1],
			 aFloatArrayArray9452[i][2],
			 aFloatArrayArray9429[i][0],
			 aFloatArrayArray9429[i][1],
			 aFloatArrayArray9429[i][2],
			 i_2274_ | anIntArray9459[i] & 0xffffff,
			 i_2274_ | anIntArray9460[i] & 0xffffff,
			 i_2274_ | anIntArray9461[i] & 0xffffff,
			 aClass101_9437.anInt1206 * 1046269871, f * 255.0F,
			 f_2272_ * 255.0F, f_2273_ * 255.0F,
			 aShortArray9428[i] & 0xffff);
	    }
	}
    }
    
    public boolean method3108(int i, int i_2276_, Class446 class446,
			      boolean bool, int i_2277_) {
	method15091(aClass185_Sub2_9475.method15011(Thread.currentThread()));
	Class433 class433 = aClass101_9437.aClass433_1224;
	class433.method6916(class446);
	Class433 class433_2278_ = aClass101_9437.aClass433_1217;
	class433_2278_.method6842(class433);
	class433_2278_.method6839(aClass185_Sub2_9475.aClass433_9346);
	boolean bool_2279_ = false;
	int i_2280_ = 2147483647;
	int i_2281_ = -2147483648;
	int i_2282_ = 2147483647;
	int i_2283_ = -2147483648;
	if (!aBool9488)
	    method15173();
	int i_2284_ = aShort9468 - aShort9493 >> 1;
	int i_2285_ = aShort9492 - aShort9491 >> 1;
	int i_2286_ = aShort9449 - aShort9495 >> 1;
	int i_2287_ = aShort9493 + i_2284_;
	int i_2288_ = aShort9491 + i_2285_;
	int i_2289_ = aShort9495 + i_2286_;
	int i_2290_ = i_2287_ - (i_2284_ << i_2277_);
	int i_2291_ = i_2288_ - (i_2285_ << i_2277_);
	int i_2292_ = i_2289_ - (i_2286_ << i_2277_);
	int i_2293_ = i_2287_ + (i_2284_ << i_2277_);
	int i_2294_ = i_2288_ + (i_2285_ << i_2277_);
	int i_2295_ = i_2289_ + (i_2286_ << i_2277_);
	anIntArray9507[0] = i_2290_;
	anIntArray9480[0] = i_2291_;
	anIntArray9509[0] = i_2292_;
	anIntArray9507[1] = i_2293_;
	anIntArray9480[1] = i_2291_;
	anIntArray9509[1] = i_2292_;
	anIntArray9507[2] = i_2290_;
	anIntArray9480[2] = i_2294_;
	anIntArray9509[2] = i_2292_;
	anIntArray9507[3] = i_2293_;
	anIntArray9480[3] = i_2294_;
	anIntArray9509[3] = i_2292_;
	anIntArray9507[4] = i_2290_;
	anIntArray9480[4] = i_2291_;
	anIntArray9509[4] = i_2295_;
	anIntArray9507[5] = i_2293_;
	anIntArray9480[5] = i_2291_;
	anIntArray9509[5] = i_2295_;
	anIntArray9507[6] = i_2290_;
	anIntArray9480[6] = i_2294_;
	anIntArray9509[6] = i_2295_;
	anIntArray9507[7] = i_2293_;
	anIntArray9480[7] = i_2294_;
	anIntArray9509[7] = i_2295_;
	for (int i_2296_ = 0; i_2296_ < 8; i_2296_++) {
	    int i_2297_ = anIntArray9507[i_2296_];
	    int i_2298_ = anIntArray9480[i_2296_];
	    int i_2299_ = anIntArray9509[i_2296_];
	    float f = (class433_2278_.aFloatArray4853[2] * (float) i_2297_
		       + class433_2278_.aFloatArray4853[6] * (float) i_2298_
		       + class433_2278_.aFloatArray4853[10] * (float) i_2299_
		       + class433_2278_.aFloatArray4853[14]);
	    float f_2300_
		= (class433_2278_.aFloatArray4853[3] * (float) i_2297_
		   + class433_2278_.aFloatArray4853[7] * (float) i_2298_
		   + class433_2278_.aFloatArray4853[11] * (float) i_2299_
		   + class433_2278_.aFloatArray4853[15]);
	    if (f >= -f_2300_) {
		float f_2301_
		    = (class433_2278_.aFloatArray4853[0] * (float) i_2297_
		       + class433_2278_.aFloatArray4853[4] * (float) i_2298_
		       + class433_2278_.aFloatArray4853[8] * (float) i_2299_
		       + class433_2278_.aFloatArray4853[12]);
		float f_2302_
		    = (class433_2278_.aFloatArray4853[1] * (float) i_2297_
		       + class433_2278_.aFloatArray4853[5] * (float) i_2298_
		       + class433_2278_.aFloatArray4853[9] * (float) i_2299_
		       + class433_2278_.aFloatArray4853[13]);
		int i_2303_ = (int) (aClass185_Sub2_9475.aFloat9342
				     + (aClass185_Sub2_9475.aFloat9361
					* f_2301_ / f_2300_));
		int i_2304_ = (int) (aClass185_Sub2_9475.aFloat9368
				     + (aClass185_Sub2_9475.aFloat9363
					* f_2302_ / f_2300_));
		if (i_2303_ < i_2280_)
		    i_2280_ = i_2303_;
		if (i_2303_ > i_2281_)
		    i_2281_ = i_2303_;
		if (i_2304_ < i_2282_)
		    i_2282_ = i_2304_;
		if (i_2304_ > i_2283_)
		    i_2283_ = i_2304_;
		bool_2279_ = true;
	    }
	}
	if (bool_2279_ && i > i_2280_ && i < i_2281_ && i_2276_ > i_2282_
	    && i_2276_ < i_2283_) {
	    if (bool)
		return true;
	    for (int i_2305_ = 0; i_2305_ < anInt9444; i_2305_++) {
		int i_2306_ = anIntArray9494[i_2305_];
		int i_2307_ = anIntArray9447[i_2305_];
		int i_2308_ = anIntArray9448[i_2305_];
		float f
		    = (class433_2278_.aFloatArray4853[2] * (float) i_2306_
		       + class433_2278_.aFloatArray4853[6] * (float) i_2307_
		       + class433_2278_.aFloatArray4853[10] * (float) i_2308_
		       + class433_2278_.aFloatArray4853[14]);
		float f_2309_
		    = (class433_2278_.aFloatArray4853[3] * (float) i_2306_
		       + class433_2278_.aFloatArray4853[7] * (float) i_2307_
		       + class433_2278_.aFloatArray4853[11] * (float) i_2308_
		       + class433_2278_.aFloatArray4853[15]);
		if (f >= -f_2309_) {
		    float f_2310_
			= (class433_2278_.aFloatArray4853[0] * (float) i_2306_
			   + (class433_2278_.aFloatArray4853[4]
			      * (float) i_2307_)
			   + (class433_2278_.aFloatArray4853[8]
			      * (float) i_2308_)
			   + class433_2278_.aFloatArray4853[12]);
		    float f_2311_
			= (class433_2278_.aFloatArray4853[1] * (float) i_2306_
			   + (class433_2278_.aFloatArray4853[5]
			      * (float) i_2307_)
			   + (class433_2278_.aFloatArray4853[9]
			      * (float) i_2308_)
			   + class433_2278_.aFloatArray4853[13]);
		    aFloatArray9503[i_2305_]
			= (float) (int) (aClass185_Sub2_9475.aFloat9342
					 + (aClass185_Sub2_9475.aFloat9361
					    * f_2310_ / f_2309_));
		    aFloatArray9496[i_2305_]
			= (float) (int) (aClass185_Sub2_9475.aFloat9368
					 + (aClass185_Sub2_9475.aFloat9363
					    * f_2311_ / f_2309_));
		} else
		    aFloatArray9503[i_2305_] = -999999.0F;
	    }
	    for (int i_2312_ = 0; i_2312_ < anInt9453; i_2312_++) {
		if (aFloatArray9503[aShortArray9479[i_2312_]] != -999999.0F
		    && aFloatArray9503[aShortArray9455[i_2312_]] != -999999.0F
		    && aFloatArray9503[aShortArray9456[i_2312_]] != -999999.0F
		    && method15114(i, i_2276_,
				   aFloatArray9496[aShortArray9479[i_2312_]],
				   aFloatArray9496[aShortArray9455[i_2312_]],
				   aFloatArray9496[aShortArray9456[i_2312_]],
				   aFloatArray9503[aShortArray9479[i_2312_]],
				   aFloatArray9503[aShortArray9455[i_2312_]],
				   aFloatArray9503[aShortArray9456[i_2312_]]))
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method3167(int i, int i_2313_, Class446 class446,
			      boolean bool, int i_2314_) {
	method15091(aClass185_Sub2_9475.method15011(Thread.currentThread()));
	Class433 class433 = aClass101_9437.aClass433_1224;
	class433.method6916(class446);
	Class433 class433_2315_ = aClass101_9437.aClass433_1217;
	class433_2315_.method6842(class433);
	class433_2315_.method6839(aClass185_Sub2_9475.aClass433_9346);
	boolean bool_2316_ = false;
	int i_2317_ = 2147483647;
	int i_2318_ = -2147483648;
	int i_2319_ = 2147483647;
	int i_2320_ = -2147483648;
	if (!aBool9488)
	    method15173();
	int i_2321_ = aShort9468 - aShort9493 >> 1;
	int i_2322_ = aShort9492 - aShort9491 >> 1;
	int i_2323_ = aShort9449 - aShort9495 >> 1;
	int i_2324_ = aShort9493 + i_2321_;
	int i_2325_ = aShort9491 + i_2322_;
	int i_2326_ = aShort9495 + i_2323_;
	int i_2327_ = i_2324_ - (i_2321_ << i_2314_);
	int i_2328_ = i_2325_ - (i_2322_ << i_2314_);
	int i_2329_ = i_2326_ - (i_2323_ << i_2314_);
	int i_2330_ = i_2324_ + (i_2321_ << i_2314_);
	int i_2331_ = i_2325_ + (i_2322_ << i_2314_);
	int i_2332_ = i_2326_ + (i_2323_ << i_2314_);
	anIntArray9507[0] = i_2327_;
	anIntArray9480[0] = i_2328_;
	anIntArray9509[0] = i_2329_;
	anIntArray9507[1] = i_2330_;
	anIntArray9480[1] = i_2328_;
	anIntArray9509[1] = i_2329_;
	anIntArray9507[2] = i_2327_;
	anIntArray9480[2] = i_2331_;
	anIntArray9509[2] = i_2329_;
	anIntArray9507[3] = i_2330_;
	anIntArray9480[3] = i_2331_;
	anIntArray9509[3] = i_2329_;
	anIntArray9507[4] = i_2327_;
	anIntArray9480[4] = i_2328_;
	anIntArray9509[4] = i_2332_;
	anIntArray9507[5] = i_2330_;
	anIntArray9480[5] = i_2328_;
	anIntArray9509[5] = i_2332_;
	anIntArray9507[6] = i_2327_;
	anIntArray9480[6] = i_2331_;
	anIntArray9509[6] = i_2332_;
	anIntArray9507[7] = i_2330_;
	anIntArray9480[7] = i_2331_;
	anIntArray9509[7] = i_2332_;
	for (int i_2333_ = 0; i_2333_ < 8; i_2333_++) {
	    int i_2334_ = anIntArray9507[i_2333_];
	    int i_2335_ = anIntArray9480[i_2333_];
	    int i_2336_ = anIntArray9509[i_2333_];
	    float f = (class433_2315_.aFloatArray4853[2] * (float) i_2334_
		       + class433_2315_.aFloatArray4853[6] * (float) i_2335_
		       + class433_2315_.aFloatArray4853[10] * (float) i_2336_
		       + class433_2315_.aFloatArray4853[14]);
	    float f_2337_
		= (class433_2315_.aFloatArray4853[3] * (float) i_2334_
		   + class433_2315_.aFloatArray4853[7] * (float) i_2335_
		   + class433_2315_.aFloatArray4853[11] * (float) i_2336_
		   + class433_2315_.aFloatArray4853[15]);
	    if (f >= -f_2337_) {
		float f_2338_
		    = (class433_2315_.aFloatArray4853[0] * (float) i_2334_
		       + class433_2315_.aFloatArray4853[4] * (float) i_2335_
		       + class433_2315_.aFloatArray4853[8] * (float) i_2336_
		       + class433_2315_.aFloatArray4853[12]);
		float f_2339_
		    = (class433_2315_.aFloatArray4853[1] * (float) i_2334_
		       + class433_2315_.aFloatArray4853[5] * (float) i_2335_
		       + class433_2315_.aFloatArray4853[9] * (float) i_2336_
		       + class433_2315_.aFloatArray4853[13]);
		int i_2340_ = (int) (aClass185_Sub2_9475.aFloat9342
				     + (aClass185_Sub2_9475.aFloat9361
					* f_2338_ / f_2337_));
		int i_2341_ = (int) (aClass185_Sub2_9475.aFloat9368
				     + (aClass185_Sub2_9475.aFloat9363
					* f_2339_ / f_2337_));
		if (i_2340_ < i_2317_)
		    i_2317_ = i_2340_;
		if (i_2340_ > i_2318_)
		    i_2318_ = i_2340_;
		if (i_2341_ < i_2319_)
		    i_2319_ = i_2341_;
		if (i_2341_ > i_2320_)
		    i_2320_ = i_2341_;
		bool_2316_ = true;
	    }
	}
	if (bool_2316_ && i > i_2317_ && i < i_2318_ && i_2313_ > i_2319_
	    && i_2313_ < i_2320_) {
	    if (bool)
		return true;
	    for (int i_2342_ = 0; i_2342_ < anInt9444; i_2342_++) {
		int i_2343_ = anIntArray9494[i_2342_];
		int i_2344_ = anIntArray9447[i_2342_];
		int i_2345_ = anIntArray9448[i_2342_];
		float f
		    = (class433_2315_.aFloatArray4853[2] * (float) i_2343_
		       + class433_2315_.aFloatArray4853[6] * (float) i_2344_
		       + class433_2315_.aFloatArray4853[10] * (float) i_2345_
		       + class433_2315_.aFloatArray4853[14]);
		float f_2346_
		    = (class433_2315_.aFloatArray4853[3] * (float) i_2343_
		       + class433_2315_.aFloatArray4853[7] * (float) i_2344_
		       + class433_2315_.aFloatArray4853[11] * (float) i_2345_
		       + class433_2315_.aFloatArray4853[15]);
		if (f >= -f_2346_) {
		    float f_2347_
			= (class433_2315_.aFloatArray4853[0] * (float) i_2343_
			   + (class433_2315_.aFloatArray4853[4]
			      * (float) i_2344_)
			   + (class433_2315_.aFloatArray4853[8]
			      * (float) i_2345_)
			   + class433_2315_.aFloatArray4853[12]);
		    float f_2348_
			= (class433_2315_.aFloatArray4853[1] * (float) i_2343_
			   + (class433_2315_.aFloatArray4853[5]
			      * (float) i_2344_)
			   + (class433_2315_.aFloatArray4853[9]
			      * (float) i_2345_)
			   + class433_2315_.aFloatArray4853[13]);
		    aFloatArray9503[i_2342_]
			= (float) (int) (aClass185_Sub2_9475.aFloat9342
					 + (aClass185_Sub2_9475.aFloat9361
					    * f_2347_ / f_2346_));
		    aFloatArray9496[i_2342_]
			= (float) (int) (aClass185_Sub2_9475.aFloat9368
					 + (aClass185_Sub2_9475.aFloat9363
					    * f_2348_ / f_2346_));
		} else
		    aFloatArray9503[i_2342_] = -999999.0F;
	    }
	    for (int i_2349_ = 0; i_2349_ < anInt9453; i_2349_++) {
		if (aFloatArray9503[aShortArray9479[i_2349_]] != -999999.0F
		    && aFloatArray9503[aShortArray9455[i_2349_]] != -999999.0F
		    && aFloatArray9503[aShortArray9456[i_2349_]] != -999999.0F
		    && method15114(i, i_2313_,
				   aFloatArray9496[aShortArray9479[i_2349_]],
				   aFloatArray9496[aShortArray9455[i_2349_]],
				   aFloatArray9496[aShortArray9456[i_2349_]],
				   aFloatArray9503[aShortArray9479[i_2349_]],
				   aFloatArray9503[aShortArray9455[i_2349_]],
				   aFloatArray9503[aShortArray9456[i_2349_]]))
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method3110(int i, int i_2350_, Class446 class446,
			      boolean bool, int i_2351_) {
	method15091(aClass185_Sub2_9475.method15011(Thread.currentThread()));
	Class433 class433 = aClass101_9437.aClass433_1224;
	class433.method6916(class446);
	Class433 class433_2352_ = aClass101_9437.aClass433_1217;
	class433_2352_.method6842(class433);
	class433_2352_.method6839(aClass185_Sub2_9475.aClass433_9346);
	boolean bool_2353_ = false;
	int i_2354_ = 2147483647;
	int i_2355_ = -2147483648;
	int i_2356_ = 2147483647;
	int i_2357_ = -2147483648;
	if (!aBool9488)
	    method15173();
	int i_2358_ = aShort9468 - aShort9493 >> 1;
	int i_2359_ = aShort9492 - aShort9491 >> 1;
	int i_2360_ = aShort9449 - aShort9495 >> 1;
	int i_2361_ = aShort9493 + i_2358_;
	int i_2362_ = aShort9491 + i_2359_;
	int i_2363_ = aShort9495 + i_2360_;
	int i_2364_ = i_2361_ - (i_2358_ << i_2351_);
	int i_2365_ = i_2362_ - (i_2359_ << i_2351_);
	int i_2366_ = i_2363_ - (i_2360_ << i_2351_);
	int i_2367_ = i_2361_ + (i_2358_ << i_2351_);
	int i_2368_ = i_2362_ + (i_2359_ << i_2351_);
	int i_2369_ = i_2363_ + (i_2360_ << i_2351_);
	anIntArray9507[0] = i_2364_;
	anIntArray9480[0] = i_2365_;
	anIntArray9509[0] = i_2366_;
	anIntArray9507[1] = i_2367_;
	anIntArray9480[1] = i_2365_;
	anIntArray9509[1] = i_2366_;
	anIntArray9507[2] = i_2364_;
	anIntArray9480[2] = i_2368_;
	anIntArray9509[2] = i_2366_;
	anIntArray9507[3] = i_2367_;
	anIntArray9480[3] = i_2368_;
	anIntArray9509[3] = i_2366_;
	anIntArray9507[4] = i_2364_;
	anIntArray9480[4] = i_2365_;
	anIntArray9509[4] = i_2369_;
	anIntArray9507[5] = i_2367_;
	anIntArray9480[5] = i_2365_;
	anIntArray9509[5] = i_2369_;
	anIntArray9507[6] = i_2364_;
	anIntArray9480[6] = i_2368_;
	anIntArray9509[6] = i_2369_;
	anIntArray9507[7] = i_2367_;
	anIntArray9480[7] = i_2368_;
	anIntArray9509[7] = i_2369_;
	for (int i_2370_ = 0; i_2370_ < 8; i_2370_++) {
	    int i_2371_ = anIntArray9507[i_2370_];
	    int i_2372_ = anIntArray9480[i_2370_];
	    int i_2373_ = anIntArray9509[i_2370_];
	    float f = (class433_2352_.aFloatArray4853[2] * (float) i_2371_
		       + class433_2352_.aFloatArray4853[6] * (float) i_2372_
		       + class433_2352_.aFloatArray4853[10] * (float) i_2373_
		       + class433_2352_.aFloatArray4853[14]);
	    float f_2374_
		= (class433_2352_.aFloatArray4853[3] * (float) i_2371_
		   + class433_2352_.aFloatArray4853[7] * (float) i_2372_
		   + class433_2352_.aFloatArray4853[11] * (float) i_2373_
		   + class433_2352_.aFloatArray4853[15]);
	    if (f >= -f_2374_) {
		float f_2375_
		    = (class433_2352_.aFloatArray4853[0] * (float) i_2371_
		       + class433_2352_.aFloatArray4853[4] * (float) i_2372_
		       + class433_2352_.aFloatArray4853[8] * (float) i_2373_
		       + class433_2352_.aFloatArray4853[12]);
		float f_2376_
		    = (class433_2352_.aFloatArray4853[1] * (float) i_2371_
		       + class433_2352_.aFloatArray4853[5] * (float) i_2372_
		       + class433_2352_.aFloatArray4853[9] * (float) i_2373_
		       + class433_2352_.aFloatArray4853[13]);
		int i_2377_ = (int) (aClass185_Sub2_9475.aFloat9342
				     + (aClass185_Sub2_9475.aFloat9361
					* f_2375_ / f_2374_));
		int i_2378_ = (int) (aClass185_Sub2_9475.aFloat9368
				     + (aClass185_Sub2_9475.aFloat9363
					* f_2376_ / f_2374_));
		if (i_2377_ < i_2354_)
		    i_2354_ = i_2377_;
		if (i_2377_ > i_2355_)
		    i_2355_ = i_2377_;
		if (i_2378_ < i_2356_)
		    i_2356_ = i_2378_;
		if (i_2378_ > i_2357_)
		    i_2357_ = i_2378_;
		bool_2353_ = true;
	    }
	}
	if (bool_2353_ && i > i_2354_ && i < i_2355_ && i_2350_ > i_2356_
	    && i_2350_ < i_2357_) {
	    if (bool)
		return true;
	    for (int i_2379_ = 0; i_2379_ < anInt9444; i_2379_++) {
		int i_2380_ = anIntArray9494[i_2379_];
		int i_2381_ = anIntArray9447[i_2379_];
		int i_2382_ = anIntArray9448[i_2379_];
		float f
		    = (class433_2352_.aFloatArray4853[2] * (float) i_2380_
		       + class433_2352_.aFloatArray4853[6] * (float) i_2381_
		       + class433_2352_.aFloatArray4853[10] * (float) i_2382_
		       + class433_2352_.aFloatArray4853[14]);
		float f_2383_
		    = (class433_2352_.aFloatArray4853[3] * (float) i_2380_
		       + class433_2352_.aFloatArray4853[7] * (float) i_2381_
		       + class433_2352_.aFloatArray4853[11] * (float) i_2382_
		       + class433_2352_.aFloatArray4853[15]);
		if (f >= -f_2383_) {
		    float f_2384_
			= (class433_2352_.aFloatArray4853[0] * (float) i_2380_
			   + (class433_2352_.aFloatArray4853[4]
			      * (float) i_2381_)
			   + (class433_2352_.aFloatArray4853[8]
			      * (float) i_2382_)
			   + class433_2352_.aFloatArray4853[12]);
		    float f_2385_
			= (class433_2352_.aFloatArray4853[1] * (float) i_2380_
			   + (class433_2352_.aFloatArray4853[5]
			      * (float) i_2381_)
			   + (class433_2352_.aFloatArray4853[9]
			      * (float) i_2382_)
			   + class433_2352_.aFloatArray4853[13]);
		    aFloatArray9503[i_2379_]
			= (float) (int) (aClass185_Sub2_9475.aFloat9342
					 + (aClass185_Sub2_9475.aFloat9361
					    * f_2384_ / f_2383_));
		    aFloatArray9496[i_2379_]
			= (float) (int) (aClass185_Sub2_9475.aFloat9368
					 + (aClass185_Sub2_9475.aFloat9363
					    * f_2385_ / f_2383_));
		} else
		    aFloatArray9503[i_2379_] = -999999.0F;
	    }
	    for (int i_2386_ = 0; i_2386_ < anInt9453; i_2386_++) {
		if (aFloatArray9503[aShortArray9479[i_2386_]] != -999999.0F
		    && aFloatArray9503[aShortArray9455[i_2386_]] != -999999.0F
		    && aFloatArray9503[aShortArray9456[i_2386_]] != -999999.0F
		    && method15114(i, i_2350_,
				   aFloatArray9496[aShortArray9479[i_2386_]],
				   aFloatArray9496[aShortArray9455[i_2386_]],
				   aFloatArray9496[aShortArray9456[i_2386_]],
				   aFloatArray9503[aShortArray9479[i_2386_]],
				   aFloatArray9503[aShortArray9455[i_2386_]],
				   aFloatArray9503[aShortArray9456[i_2386_]]))
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method3111(int i, int i_2387_, Class446 class446,
			      boolean bool, int i_2388_) {
	method15091(aClass185_Sub2_9475.method15011(Thread.currentThread()));
	Class433 class433 = aClass101_9437.aClass433_1224;
	class433.method6916(class446);
	Class433 class433_2389_ = aClass101_9437.aClass433_1217;
	class433_2389_.method6842(class433);
	class433_2389_.method6839(aClass185_Sub2_9475.aClass433_9346);
	boolean bool_2390_ = false;
	int i_2391_ = 2147483647;
	int i_2392_ = -2147483648;
	int i_2393_ = 2147483647;
	int i_2394_ = -2147483648;
	if (!aBool9488)
	    method15173();
	int i_2395_ = aShort9468 - aShort9493 >> 1;
	int i_2396_ = aShort9492 - aShort9491 >> 1;
	int i_2397_ = aShort9449 - aShort9495 >> 1;
	int i_2398_ = aShort9493 + i_2395_;
	int i_2399_ = aShort9491 + i_2396_;
	int i_2400_ = aShort9495 + i_2397_;
	int i_2401_ = i_2398_ - (i_2395_ << i_2388_);
	int i_2402_ = i_2399_ - (i_2396_ << i_2388_);
	int i_2403_ = i_2400_ - (i_2397_ << i_2388_);
	int i_2404_ = i_2398_ + (i_2395_ << i_2388_);
	int i_2405_ = i_2399_ + (i_2396_ << i_2388_);
	int i_2406_ = i_2400_ + (i_2397_ << i_2388_);
	anIntArray9507[0] = i_2401_;
	anIntArray9480[0] = i_2402_;
	anIntArray9509[0] = i_2403_;
	anIntArray9507[1] = i_2404_;
	anIntArray9480[1] = i_2402_;
	anIntArray9509[1] = i_2403_;
	anIntArray9507[2] = i_2401_;
	anIntArray9480[2] = i_2405_;
	anIntArray9509[2] = i_2403_;
	anIntArray9507[3] = i_2404_;
	anIntArray9480[3] = i_2405_;
	anIntArray9509[3] = i_2403_;
	anIntArray9507[4] = i_2401_;
	anIntArray9480[4] = i_2402_;
	anIntArray9509[4] = i_2406_;
	anIntArray9507[5] = i_2404_;
	anIntArray9480[5] = i_2402_;
	anIntArray9509[5] = i_2406_;
	anIntArray9507[6] = i_2401_;
	anIntArray9480[6] = i_2405_;
	anIntArray9509[6] = i_2406_;
	anIntArray9507[7] = i_2404_;
	anIntArray9480[7] = i_2405_;
	anIntArray9509[7] = i_2406_;
	for (int i_2407_ = 0; i_2407_ < 8; i_2407_++) {
	    int i_2408_ = anIntArray9507[i_2407_];
	    int i_2409_ = anIntArray9480[i_2407_];
	    int i_2410_ = anIntArray9509[i_2407_];
	    float f = (class433_2389_.aFloatArray4853[2] * (float) i_2408_
		       + class433_2389_.aFloatArray4853[6] * (float) i_2409_
		       + class433_2389_.aFloatArray4853[10] * (float) i_2410_
		       + class433_2389_.aFloatArray4853[14]);
	    float f_2411_
		= (class433_2389_.aFloatArray4853[3] * (float) i_2408_
		   + class433_2389_.aFloatArray4853[7] * (float) i_2409_
		   + class433_2389_.aFloatArray4853[11] * (float) i_2410_
		   + class433_2389_.aFloatArray4853[15]);
	    if (f >= -f_2411_) {
		float f_2412_
		    = (class433_2389_.aFloatArray4853[0] * (float) i_2408_
		       + class433_2389_.aFloatArray4853[4] * (float) i_2409_
		       + class433_2389_.aFloatArray4853[8] * (float) i_2410_
		       + class433_2389_.aFloatArray4853[12]);
		float f_2413_
		    = (class433_2389_.aFloatArray4853[1] * (float) i_2408_
		       + class433_2389_.aFloatArray4853[5] * (float) i_2409_
		       + class433_2389_.aFloatArray4853[9] * (float) i_2410_
		       + class433_2389_.aFloatArray4853[13]);
		int i_2414_ = (int) (aClass185_Sub2_9475.aFloat9342
				     + (aClass185_Sub2_9475.aFloat9361
					* f_2412_ / f_2411_));
		int i_2415_ = (int) (aClass185_Sub2_9475.aFloat9368
				     + (aClass185_Sub2_9475.aFloat9363
					* f_2413_ / f_2411_));
		if (i_2414_ < i_2391_)
		    i_2391_ = i_2414_;
		if (i_2414_ > i_2392_)
		    i_2392_ = i_2414_;
		if (i_2415_ < i_2393_)
		    i_2393_ = i_2415_;
		if (i_2415_ > i_2394_)
		    i_2394_ = i_2415_;
		bool_2390_ = true;
	    }
	}
	if (bool_2390_ && i > i_2391_ && i < i_2392_ && i_2387_ > i_2393_
	    && i_2387_ < i_2394_) {
	    if (bool)
		return true;
	    for (int i_2416_ = 0; i_2416_ < anInt9444; i_2416_++) {
		int i_2417_ = anIntArray9494[i_2416_];
		int i_2418_ = anIntArray9447[i_2416_];
		int i_2419_ = anIntArray9448[i_2416_];
		float f
		    = (class433_2389_.aFloatArray4853[2] * (float) i_2417_
		       + class433_2389_.aFloatArray4853[6] * (float) i_2418_
		       + class433_2389_.aFloatArray4853[10] * (float) i_2419_
		       + class433_2389_.aFloatArray4853[14]);
		float f_2420_
		    = (class433_2389_.aFloatArray4853[3] * (float) i_2417_
		       + class433_2389_.aFloatArray4853[7] * (float) i_2418_
		       + class433_2389_.aFloatArray4853[11] * (float) i_2419_
		       + class433_2389_.aFloatArray4853[15]);
		if (f >= -f_2420_) {
		    float f_2421_
			= (class433_2389_.aFloatArray4853[0] * (float) i_2417_
			   + (class433_2389_.aFloatArray4853[4]
			      * (float) i_2418_)
			   + (class433_2389_.aFloatArray4853[8]
			      * (float) i_2419_)
			   + class433_2389_.aFloatArray4853[12]);
		    float f_2422_
			= (class433_2389_.aFloatArray4853[1] * (float) i_2417_
			   + (class433_2389_.aFloatArray4853[5]
			      * (float) i_2418_)
			   + (class433_2389_.aFloatArray4853[9]
			      * (float) i_2419_)
			   + class433_2389_.aFloatArray4853[13]);
		    aFloatArray9503[i_2416_]
			= (float) (int) (aClass185_Sub2_9475.aFloat9342
					 + (aClass185_Sub2_9475.aFloat9361
					    * f_2421_ / f_2420_));
		    aFloatArray9496[i_2416_]
			= (float) (int) (aClass185_Sub2_9475.aFloat9368
					 + (aClass185_Sub2_9475.aFloat9363
					    * f_2422_ / f_2420_));
		} else
		    aFloatArray9503[i_2416_] = -999999.0F;
	    }
	    for (int i_2423_ = 0; i_2423_ < anInt9453; i_2423_++) {
		if (aFloatArray9503[aShortArray9479[i_2423_]] != -999999.0F
		    && aFloatArray9503[aShortArray9455[i_2423_]] != -999999.0F
		    && aFloatArray9503[aShortArray9456[i_2423_]] != -999999.0F
		    && method15114(i, i_2387_,
				   aFloatArray9496[aShortArray9479[i_2423_]],
				   aFloatArray9496[aShortArray9455[i_2423_]],
				   aFloatArray9496[aShortArray9456[i_2423_]],
				   aFloatArray9503[aShortArray9479[i_2423_]],
				   aFloatArray9503[aShortArray9455[i_2423_]],
				   aFloatArray9503[aShortArray9456[i_2423_]]))
		    return true;
	    }
	}
	return false;
    }
    
    public void method3119() {
	if (!aBool9512) {
	    if (!aBool9488)
		method15173();
	    aShort9498 = aShort9491;
	    aBool9512 = true;
	}
    }
    
    boolean method15168(int i, int i_2424_, float f, float f_2425_,
			float f_2426_, float f_2427_, float f_2428_,
			float f_2429_) {
	if ((float) i_2424_ < f && (float) i_2424_ < f_2425_
	    && (float) i_2424_ < f_2426_)
	    return false;
	if ((float) i_2424_ > f && (float) i_2424_ > f_2425_
	    && (float) i_2424_ > f_2426_)
	    return false;
	if ((float) i < f_2427_ && (float) i < f_2428_ && (float) i < f_2429_)
	    return false;
	if ((float) i > f_2427_ && (float) i > f_2428_ && (float) i > f_2429_)
	    return false;
	return true;
    }
    
    int method15169(int i, int i_2430_) {
	i_2430_ = i_2430_ * (i & 0x7f) >> 7;
	if (i_2430_ < 2)
	    i_2430_ = 2;
	else if (i_2430_ > 126)
	    i_2430_ = 126;
	return (i & 0xff80) + i_2430_;
    }
    
    public int method3087() {
	if (!aBool9488)
	    method15173();
	return aShort9493;
    }
    
    public void method3074(int i) {
	if (aClass185_Sub2_9475.anInt9367 * 442227785 > 1) {
	    synchronized (this) {
		if ((anInt9441 & 0x10000) == 65536 && (i & 0x10000) == 0)
		    method15115(true);
		anInt9441 = i;
	    }
	} else {
	    if ((anInt9441 & 0x10000) == 65536 && (i & 0x10000) == 0)
		method15115(true);
	    anInt9441 = i;
	}
    }
    
    public Class534_Sub18_Sub16 method3116
	(Class534_Sub18_Sub16 class534_sub18_sub16) {
	return null;
    }
    
    public Class534_Sub18_Sub16 method3117
	(Class534_Sub18_Sub16 class534_sub18_sub16) {
	return null;
    }
    
    public Class534_Sub18_Sub16 method3175
	(Class534_Sub18_Sub16 class534_sub18_sub16) {
	return null;
    }
    
    void method3104(int i, int i_2431_, int i_2432_, int i_2433_) {
	if (i == 0) {
	    int i_2434_ = 0;
	    anInt9458 = 0;
	    anInt9481 = 0;
	    anInt9465 = 0;
	    for (int i_2435_ = 0; i_2435_ < anInt9444; i_2435_++) {
		anInt9458 += anIntArray9494[i_2435_];
		anInt9481 += anIntArray9447[i_2435_];
		anInt9465 += anIntArray9448[i_2435_];
		i_2434_++;
	    }
	    if (i_2434_ > 0) {
		anInt9458 = anInt9458 / i_2434_ + i_2431_;
		anInt9481 = anInt9481 / i_2434_ + i_2432_;
		anInt9465 = anInt9465 / i_2434_ + i_2433_;
	    } else {
		anInt9458 = i_2431_;
		anInt9481 = i_2432_;
		anInt9465 = i_2433_;
	    }
	} else if (i == 1) {
	    for (int i_2436_ = 0; i_2436_ < anInt9444; i_2436_++) {
		anIntArray9494[i_2436_] += i_2431_;
		anIntArray9447[i_2436_] += i_2432_;
		anIntArray9448[i_2436_] += i_2433_;
	    }
	} else if (i == 2) {
	    for (int i_2437_ = 0; i_2437_ < anInt9444; i_2437_++) {
		anIntArray9494[i_2437_] -= anInt9458;
		anIntArray9447[i_2437_] -= anInt9481;
		anIntArray9448[i_2437_] -= anInt9465;
		if (i_2433_ != 0) {
		    int i_2438_ = Class427.anIntArray4806[i_2433_];
		    int i_2439_ = Class427.anIntArray4805[i_2433_];
		    int i_2440_
			= ((anIntArray9447[i_2437_] * i_2438_
			    + anIntArray9494[i_2437_] * i_2439_ + 16383)
			   >> 14);
		    anIntArray9447[i_2437_]
			= (anIntArray9447[i_2437_] * i_2439_
			   - anIntArray9494[i_2437_] * i_2438_ + 16383) >> 14;
		    anIntArray9494[i_2437_] = i_2440_;
		}
		if (i_2431_ != 0) {
		    int i_2441_ = Class427.anIntArray4806[i_2431_];
		    int i_2442_ = Class427.anIntArray4805[i_2431_];
		    int i_2443_
			= ((anIntArray9447[i_2437_] * i_2442_
			    - anIntArray9448[i_2437_] * i_2441_ + 16383)
			   >> 14);
		    anIntArray9448[i_2437_]
			= (anIntArray9447[i_2437_] * i_2441_
			   + anIntArray9448[i_2437_] * i_2442_ + 16383) >> 14;
		    anIntArray9447[i_2437_] = i_2443_;
		}
		if (i_2432_ != 0) {
		    int i_2444_ = Class427.anIntArray4806[i_2432_];
		    int i_2445_ = Class427.anIntArray4805[i_2432_];
		    int i_2446_
			= ((anIntArray9448[i_2437_] * i_2444_
			    + anIntArray9494[i_2437_] * i_2445_ + 16383)
			   >> 14);
		    anIntArray9448[i_2437_]
			= (anIntArray9448[i_2437_] * i_2445_
			   - anIntArray9494[i_2437_] * i_2444_ + 16383) >> 14;
		    anIntArray9494[i_2437_] = i_2446_;
		}
		anIntArray9494[i_2437_] += anInt9458;
		anIntArray9447[i_2437_] += anInt9481;
		anIntArray9448[i_2437_] += anInt9465;
	    }
	} else if (i == 3) {
	    for (int i_2447_ = 0; i_2447_ < anInt9444; i_2447_++) {
		anIntArray9494[i_2447_] -= anInt9458;
		anIntArray9447[i_2447_] -= anInt9481;
		anIntArray9448[i_2447_] -= anInt9465;
		anIntArray9494[i_2447_]
		    = anIntArray9494[i_2447_] * i_2431_ / 128;
		anIntArray9447[i_2447_]
		    = anIntArray9447[i_2447_] * i_2432_ / 128;
		anIntArray9448[i_2447_]
		    = anIntArray9448[i_2447_] * i_2433_ / 128;
		anIntArray9494[i_2447_] += anInt9458;
		anIntArray9447[i_2447_] += anInt9481;
		anIntArray9448[i_2447_] += anInt9465;
	    }
	} else if (i == 5) {
	    for (int i_2448_ = 0; i_2448_ < anInt9440; i_2448_++) {
		int i_2449_ = (aByteArray9469[i_2448_] & 0xff) + i_2431_ * 8;
		if (i_2449_ < 0)
		    i_2449_ = 0;
		else if (i_2449_ > 255)
		    i_2449_ = 255;
		aByteArray9469[i_2448_] = (byte) i_2449_;
	    }
	    if (aClass118Array9485 != null) {
		for (int i_2450_ = 0; i_2450_ < anInt9484; i_2450_++) {
		    Class118 class118 = aClass118Array9485[i_2450_];
		    Class117 class117 = aClass117Array9486[i_2450_];
		    class117.anInt1411
			= (class117.anInt1411 * -150900843 & 0xffffff
			   | 255 - ((aByteArray9469
				     [class118.anInt1418 * 2118166057])
				    & 0xff) << 24) * 874668989;
		}
	    }
	} else if (i == 7) {
	    for (int i_2451_ = 0; i_2451_ < anInt9440; i_2451_++) {
		int i_2452_ = aShortArray9471[i_2451_] & 0xffff;
		int i_2453_ = i_2452_ >> 10 & 0x3f;
		int i_2454_ = i_2452_ >> 7 & 0x7;
		int i_2455_ = i_2452_ & 0x7f;
		i_2453_ = i_2453_ + i_2431_ & 0x3f;
		i_2454_ += i_2432_;
		if (i_2454_ < 0)
		    i_2454_ = 0;
		else if (i_2454_ > 7)
		    i_2454_ = 7;
		i_2455_ += i_2433_;
		if (i_2455_ < 0)
		    i_2455_ = 0;
		else if (i_2455_ > 127)
		    i_2455_ = 127;
		aShortArray9471[i_2451_]
		    = (short) (i_2453_ << 10 | i_2454_ << 7 | i_2455_);
	    }
	    aBool9476 = true;
	    if (aClass118Array9485 != null) {
		for (int i_2456_ = 0; i_2456_ < anInt9484; i_2456_++) {
		    Class118 class118 = aClass118Array9485[i_2456_];
		    Class117 class117 = aClass117Array9486[i_2456_];
		    class117.anInt1411
			= (class117.anInt1411 * -150900843 & ~0xffffff
			   | ((Class415.anIntArray4666
			       [Class315.method5705(((aShortArray9471
						      [(class118.anInt1418
							* 2118166057)])
						     & 0xffff),
						    1345288932) & 0xffff])
			      & 0xffffff)) * 874668989;
		}
	    }
	} else if (i == 8) {
	    for (int i_2457_ = 0; i_2457_ < anInt9484; i_2457_++) {
		Class117 class117 = aClass117Array9486[i_2457_];
		class117.anInt1405 += i_2431_ * 1831486073;
		class117.anInt1406 += i_2432_ * -108929861;
	    }
	} else if (i == 10) {
	    for (int i_2458_ = 0; i_2458_ < anInt9484; i_2458_++) {
		Class117 class117 = aClass117Array9486[i_2458_];
		class117.aFloat1403
		    = class117.aFloat1403 * (float) i_2431_ / 128.0F;
		class117.aFloat1404
		    = class117.aFloat1404 * (float) i_2432_ / 128.0F;
	    }
	} else if (i == 9) {
	    for (int i_2459_ = 0; i_2459_ < anInt9484; i_2459_++) {
		Class117 class117 = aClass117Array9486[i_2459_];
		class117.anInt1409 = (class117.anInt1409 * -133325595 + i_2431_
				      & 0x3fff) * 1832042733;
	    }
	}
    }
    
    void method15170() {
	if (!aBool9488) {
	    int i = 0;
	    int i_2460_ = 0;
	    int i_2461_ = 32767;
	    int i_2462_ = 32767;
	    int i_2463_ = 32767;
	    int i_2464_ = -32768;
	    int i_2465_ = -32768;
	    int i_2466_ = -32768;
	    for (int i_2467_ = 0; i_2467_ < anInt9474; i_2467_++) {
		int i_2468_ = anIntArray9494[i_2467_];
		int i_2469_ = anIntArray9447[i_2467_];
		int i_2470_ = anIntArray9448[i_2467_];
		if (i_2468_ < i_2461_)
		    i_2461_ = i_2468_;
		if (i_2468_ > i_2464_)
		    i_2464_ = i_2468_;
		if (i_2469_ < i_2462_)
		    i_2462_ = i_2469_;
		if (i_2469_ > i_2465_)
		    i_2465_ = i_2469_;
		if (i_2470_ < i_2463_)
		    i_2463_ = i_2470_;
		if (i_2470_ > i_2466_)
		    i_2466_ = i_2470_;
		int i_2471_ = i_2468_ * i_2468_ + i_2470_ * i_2470_;
		if (i_2471_ > i)
		    i = i_2471_;
		i_2471_ += i_2469_ * i_2469_;
		if (i_2471_ > i_2460_)
		    i_2460_ = i_2471_;
	    }
	    aShort9493 = (short) i_2461_;
	    aShort9468 = (short) i_2464_;
	    aShort9491 = (short) i_2462_;
	    aShort9492 = (short) i_2465_;
	    aShort9495 = (short) i_2463_;
	    aShort9449 = (short) i_2466_;
	    aShort9473 = (short) (int) (Math.sqrt((double) i) + 0.99);
	    aShort9490 = (short) (int) (Math.sqrt((double) i_2460_) + 0.99);
	    aBool9488 = true;
	}
    }
    
    public Class158[] method3166() {
	return aClass158Array9483;
    }
    
    public void method3084(int i) {
	if ((anInt9441 & 0x3) != 3)
	    throw new IllegalStateException();
	int i_2472_ = Class427.anIntArray4806[i];
	int i_2473_ = Class427.anIntArray4805[i];
	synchronized (this) {
	    for (int i_2474_ = 0; i_2474_ < anInt9444; i_2474_++) {
		int i_2475_ = ((anIntArray9447[i_2474_] * i_2472_
				+ anIntArray9494[i_2474_] * i_2473_)
			       >> 14);
		anIntArray9447[i_2474_]
		    = (anIntArray9447[i_2474_] * i_2473_
		       - anIntArray9494[i_2474_] * i_2472_) >> 14;
		anIntArray9494[i_2474_] = i_2475_;
	    }
	    method15151();
	}
    }
    
    public void method3067(Class183 class183, int i, int i_2476_, int i_2477_,
			   boolean bool) {
	Class183_Sub2 class183_sub2_2478_ = (Class183_Sub2) class183;
	if ((anInt9441 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	if ((class183_sub2_2478_.anInt9441 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	method15091(aClass185_Sub2_9475.method15011(Thread.currentThread()));
	method15173();
	method15092();
	class183_sub2_2478_.method15173();
	class183_sub2_2478_.method15092();
	anInt9501++;
	int i_2479_ = 0;
	int[] is = class183_sub2_2478_.anIntArray9494;
	int i_2480_ = class183_sub2_2478_.anInt9474;
	for (int i_2481_ = 0; i_2481_ < anInt9474; i_2481_++) {
	    Class96 class96 = aClass96Array9450[i_2481_];
	    if (class96.anInt1157 != 0) {
		int i_2482_ = anIntArray9447[i_2481_] - i_2476_;
		if (i_2482_ >= class183_sub2_2478_.aShort9491
		    && i_2482_ <= class183_sub2_2478_.aShort9492) {
		    int i_2483_ = anIntArray9494[i_2481_] - i;
		    if (i_2483_ >= class183_sub2_2478_.aShort9493
			&& i_2483_ <= class183_sub2_2478_.aShort9468) {
			int i_2484_ = anIntArray9448[i_2481_] - i_2477_;
			if (i_2484_ >= class183_sub2_2478_.aShort9495
			    && i_2484_ <= class183_sub2_2478_.aShort9449) {
			    for (int i_2485_ = 0; i_2485_ < i_2480_;
				 i_2485_++) {
				Class96 class96_2486_
				    = (class183_sub2_2478_.aClass96Array9450
				       [i_2485_]);
				if (i_2483_ == is[i_2485_]
				    && i_2484_ == (class183_sub2_2478_
						   .anIntArray9448[i_2485_])
				    && i_2482_ == (class183_sub2_2478_
						   .anIntArray9447[i_2485_])
				    && class96_2486_.anInt1157 != 0) {
				    if (aClass96Array9451 == null)
					aClass96Array9451
					    = new Class96[anInt9474];
				    if (class183_sub2_2478_.aClass96Array9451
					== null)
					class183_sub2_2478_.aClass96Array9451
					    = new Class96[i_2480_];
				    Class96 class96_2487_
					= aClass96Array9451[i_2481_];
				    if (class96_2487_ == null)
					class96_2487_
					    = aClass96Array9451[i_2481_]
					    = new Class96(class96);
				    Class96 class96_2488_
					= (class183_sub2_2478_
					   .aClass96Array9451[i_2485_]);
				    if (class96_2488_ == null)
					class96_2488_
					    = class183_sub2_2478_
						  .aClass96Array9451[i_2485_]
					    = new Class96(class96_2486_);
				    class96_2487_.anInt1159
					+= class96_2486_.anInt1159;
				    class96_2487_.anInt1158
					+= class96_2486_.anInt1158;
				    class96_2487_.anInt1156
					+= class96_2486_.anInt1156;
				    class96_2487_.anInt1157
					+= class96_2486_.anInt1157;
				    class96_2488_.anInt1159
					+= class96.anInt1159;
				    class96_2488_.anInt1158
					+= class96.anInt1158;
				    class96_2488_.anInt1156
					+= class96.anInt1156;
				    class96_2488_.anInt1157
					+= class96.anInt1157;
				    i_2479_++;
				    anIntArray9510[i_2481_] = anInt9501;
				    anIntArray9511[i_2485_] = anInt9501;
				}
			    }
			}
		    }
		}
	    }
	}
	if (i_2479_ >= 3 && bool) {
	    for (int i_2489_ = 0; i_2489_ < anInt9440; i_2489_++) {
		if (anIntArray9510[aShortArray9479[i_2489_]] == anInt9501
		    && anIntArray9510[aShortArray9455[i_2489_]] == anInt9501
		    && anIntArray9510[aShortArray9456[i_2489_]] == anInt9501) {
		    if (aByteArray9467 == null)
			aByteArray9467 = new byte[anInt9440];
		    aByteArray9467[i_2489_] = (byte) 2;
		}
	    }
	    for (int i_2490_ = 0; i_2490_ < class183_sub2_2478_.anInt9440;
		 i_2490_++) {
		if (anIntArray9511[(class183_sub2_2478_.aShortArray9479
				    [i_2490_])] == anInt9501
		    && anIntArray9511[(class183_sub2_2478_.aShortArray9455
				       [i_2490_])] == anInt9501
		    && anIntArray9511[(class183_sub2_2478_.aShortArray9456
				       [i_2490_])] == anInt9501) {
		    if (class183_sub2_2478_.aByteArray9467 == null)
			class183_sub2_2478_.aByteArray9467
			    = new byte[class183_sub2_2478_.anInt9440];
		    class183_sub2_2478_.aByteArray9467[i_2490_] = (byte) 2;
		}
	    }
	}
    }
    
    public int method3122() {
	if (!aBool9488)
	    method15173();
	return aShort9473;
    }
    
    public int method3123() {
	if (!aBool9488)
	    method15173();
	return aShort9473;
    }
    
    public int method3124() {
	if (!aBool9488)
	    method15173();
	return aShort9473;
    }
    
    public int method3125() {
	if (!aBool9488)
	    method15173();
	return aShort9473;
    }
    
    public int method3126() {
	if (!aBool9488)
	    method15173();
	return aShort9473;
    }
    
    public byte[] method3055() {
	return aByteArray9469;
    }
    
    public int method3048() {
	if (!aBool9488)
	    method15173();
	return aShort9490;
    }
    
    public void method3208() {
	if ((anInt9441 & 0x10) != 16)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i = 0; i < anInt9444; i++)
		anIntArray9448[i] = -anIntArray9448[i];
	    if (aClass96Array9450 != null) {
		for (int i = 0; i < anInt9474; i++) {
		    if (aClass96Array9450[i] != null)
			aClass96Array9450[i].anInt1156
			    = -aClass96Array9450[i].anInt1156;
		}
	    }
	    if (aClass96Array9451 != null) {
		for (int i = 0; i < anInt9474; i++) {
		    if (aClass96Array9451[i] != null)
			aClass96Array9451[i].anInt1156
			    = -aClass96Array9451[i].anInt1156;
		}
	    }
	    if (aClass107Array9466 != null) {
		for (int i = 0; i < anInt9440; i++) {
		    if (aClass107Array9466[i] != null)
			aClass107Array9466[i].anInt1313
			    = -aClass107Array9466[i].anInt1313;
		}
	    }
	    short[] is = aShortArray9479;
	    aShortArray9479 = aShortArray9456;
	    aShortArray9456 = is;
	    if (aFloatArrayArray9452 != null) {
		for (int i = 0; i < anInt9440; i++) {
		    if (aFloatArrayArray9452[i] != null) {
			float f = aFloatArrayArray9452[i][0];
			aFloatArrayArray9452[i][0]
			    = aFloatArrayArray9452[i][2];
			aFloatArrayArray9452[i][2] = f;
		    }
		    if (aFloatArrayArray9429[i] != null) {
			float f = aFloatArrayArray9429[i][0];
			aFloatArrayArray9429[i][0]
			    = aFloatArrayArray9429[i][2];
			aFloatArrayArray9429[i][2] = f;
		    }
		}
	    }
	    aBool9488 = false;
	    anInt9432 = 0;
	}
    }
    
    public int method3130() {
	if (!aBool9488)
	    method15173();
	return aShort9490;
    }
    
    public int method3131() {
	if (!aBool9488)
	    method15173();
	return aShort9468;
    }
    
    public int method3026() {
	if (!aBool9488)
	    method15173();
	return aShort9468;
    }
    
    public int method3128() {
	if (!aBool9488)
	    method15173();
	return aShort9468;
    }
    
    void method15171(Thread thread) {
	Class101 class101 = aClass185_Sub2_9475.method15011(thread);
	if (class101 != aClass101_9431) {
	    aClass101_9431 = class101;
	    aClass183_Sub2Array9513 = aClass101_9431.aClass183_Sub2Array1238;
	    aClass183_Sub2Array9514 = aClass101_9431.aClass183_Sub2Array1239;
	}
    }
    
    public void method3044() {
	/* empty */
    }
    
    public int method3136() {
	if (!aBool9488)
	    method15173();
	return aShort9492;
    }
    
    public int method3142() {
	if (!aBool9488)
	    method15173();
	return aShort9492;
    }
    
    public int method3052() {
	if (!aBool9488)
	    method15173();
	return aShort9492;
    }
    
    void method3095(int i, int[] is, int i_2491_, int i_2492_, int i_2493_,
		    boolean bool, int i_2494_, int[] is_2495_) {
	int i_2496_ = is.length;
	if (i == 0) {
	    i_2491_ <<= 4;
	    i_2492_ <<= 4;
	    i_2493_ <<= 4;
	    if (!aBool9477) {
		for (int i_2497_ = 0; i_2497_ < anInt9444; i_2497_++) {
		    anIntArray9494[i_2497_] <<= 4;
		    anIntArray9447[i_2497_] <<= 4;
		    anIntArray9448[i_2497_] <<= 4;
		}
		aBool9477 = true;
	    }
	    int i_2498_ = 0;
	    anInt9458 = 0;
	    anInt9481 = 0;
	    anInt9465 = 0;
	    for (int i_2499_ = 0; i_2499_ < i_2496_; i_2499_++) {
		int i_2500_ = is[i_2499_];
		if (i_2500_ < anIntArrayArray9470.length) {
		    int[] is_2501_ = anIntArrayArray9470[i_2500_];
		    for (int i_2502_ = 0; i_2502_ < is_2501_.length;
			 i_2502_++) {
			int i_2503_ = is_2501_[i_2502_];
			if (aShortArray9445 == null
			    || (i_2494_ & aShortArray9445[i_2503_]) != 0) {
			    anInt9458 += anIntArray9494[i_2503_];
			    anInt9481 += anIntArray9447[i_2503_];
			    anInt9465 += anIntArray9448[i_2503_];
			    i_2498_++;
			}
		    }
		}
	    }
	    if (i_2498_ > 0) {
		anInt9458 = anInt9458 / i_2498_ + i_2491_;
		anInt9481 = anInt9481 / i_2498_ + i_2492_;
		anInt9465 = anInt9465 / i_2498_ + i_2493_;
		aBool9504 = true;
	    } else {
		anInt9458 = i_2491_;
		anInt9481 = i_2492_;
		anInt9465 = i_2493_;
	    }
	} else if (i == 1) {
	    if (is_2495_ != null) {
		int i_2504_ = ((is_2495_[0] * i_2491_ + is_2495_[1] * i_2492_
				+ is_2495_[2] * i_2493_ + 8192)
			       >> 14);
		int i_2505_ = ((is_2495_[3] * i_2491_ + is_2495_[4] * i_2492_
				+ is_2495_[5] * i_2493_ + 8192)
			       >> 14);
		int i_2506_ = ((is_2495_[6] * i_2491_ + is_2495_[7] * i_2492_
				+ is_2495_[8] * i_2493_ + 8192)
			       >> 14);
		i_2491_ = i_2504_;
		i_2492_ = i_2505_;
		i_2493_ = i_2506_;
	    }
	    i_2491_ <<= 4;
	    i_2492_ <<= 4;
	    i_2493_ <<= 4;
	    if (!aBool9477) {
		for (int i_2507_ = 0; i_2507_ < anInt9444; i_2507_++) {
		    anIntArray9494[i_2507_] <<= 4;
		    anIntArray9447[i_2507_] <<= 4;
		    anIntArray9448[i_2507_] <<= 4;
		}
		aBool9477 = true;
	    }
	    for (int i_2508_ = 0; i_2508_ < i_2496_; i_2508_++) {
		int i_2509_ = is[i_2508_];
		if (i_2509_ < anIntArrayArray9470.length) {
		    int[] is_2510_ = anIntArrayArray9470[i_2509_];
		    for (int i_2511_ = 0; i_2511_ < is_2510_.length;
			 i_2511_++) {
			int i_2512_ = is_2510_[i_2511_];
			if (aShortArray9445 == null
			    || (i_2494_ & aShortArray9445[i_2512_]) != 0) {
			    anIntArray9494[i_2512_] += i_2491_;
			    anIntArray9447[i_2512_] += i_2492_;
			    anIntArray9448[i_2512_] += i_2493_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_2495_ != null) {
		if (!aBool9477) {
		    for (int i_2513_ = 0; i_2513_ < anInt9444; i_2513_++) {
			anIntArray9494[i_2513_] <<= 4;
			anIntArray9447[i_2513_] <<= 4;
			anIntArray9448[i_2513_] <<= 4;
		    }
		    aBool9477 = true;
		}
		int i_2514_ = is_2495_[9] << 4;
		int i_2515_ = is_2495_[10] << 4;
		int i_2516_ = is_2495_[11] << 4;
		int i_2517_ = is_2495_[12] << 4;
		int i_2518_ = is_2495_[13] << 4;
		int i_2519_ = is_2495_[14] << 4;
		if (aBool9504) {
		    int i_2520_
			= ((is_2495_[0] * anInt9458 + is_2495_[3] * anInt9481
			    + is_2495_[6] * anInt9465 + 8192)
			   >> 14);
		    int i_2521_
			= ((is_2495_[1] * anInt9458 + is_2495_[4] * anInt9481
			    + is_2495_[7] * anInt9465 + 8192)
			   >> 14);
		    int i_2522_
			= ((is_2495_[2] * anInt9458 + is_2495_[5] * anInt9481
			    + is_2495_[8] * anInt9465 + 8192)
			   >> 14);
		    i_2520_ += i_2517_;
		    i_2521_ += i_2518_;
		    i_2522_ += i_2519_;
		    anInt9458 = i_2520_;
		    anInt9481 = i_2521_;
		    anInt9465 = i_2522_;
		    aBool9504 = false;
		}
		int[] is_2523_ = new int[9];
		int i_2524_ = Class427.anIntArray4805[i_2491_];
		int i_2525_ = Class427.anIntArray4806[i_2491_];
		int i_2526_ = Class427.anIntArray4805[i_2492_];
		int i_2527_ = Class427.anIntArray4806[i_2492_];
		int i_2528_ = Class427.anIntArray4805[i_2493_];
		int i_2529_ = Class427.anIntArray4806[i_2493_];
		int i_2530_ = i_2525_ * i_2528_ + 8192 >> 14;
		int i_2531_ = i_2525_ * i_2529_ + 8192 >> 14;
		is_2523_[0]
		    = i_2526_ * i_2528_ + i_2527_ * i_2531_ + 8192 >> 14;
		is_2523_[1]
		    = -i_2526_ * i_2529_ + i_2527_ * i_2530_ + 8192 >> 14;
		is_2523_[2] = i_2527_ * i_2524_ + 8192 >> 14;
		is_2523_[3] = i_2524_ * i_2529_ + 8192 >> 14;
		is_2523_[4] = i_2524_ * i_2528_ + 8192 >> 14;
		is_2523_[5] = -i_2525_;
		is_2523_[6]
		    = -i_2527_ * i_2528_ + i_2526_ * i_2531_ + 8192 >> 14;
		is_2523_[7]
		    = i_2527_ * i_2529_ + i_2526_ * i_2530_ + 8192 >> 14;
		is_2523_[8] = i_2526_ * i_2524_ + 8192 >> 14;
		int i_2532_
		    = ((is_2523_[0] * -anInt9458 + is_2523_[1] * -anInt9481
			+ is_2523_[2] * -anInt9465 + 8192)
		       >> 14);
		int i_2533_
		    = ((is_2523_[3] * -anInt9458 + is_2523_[4] * -anInt9481
			+ is_2523_[5] * -anInt9465 + 8192)
		       >> 14);
		int i_2534_
		    = ((is_2523_[6] * -anInt9458 + is_2523_[7] * -anInt9481
			+ is_2523_[8] * -anInt9465 + 8192)
		       >> 14);
		int i_2535_ = i_2532_ + anInt9458;
		int i_2536_ = i_2533_ + anInt9481;
		int i_2537_ = i_2534_ + anInt9465;
		int[] is_2538_ = new int[9];
		for (int i_2539_ = 0; i_2539_ < 3; i_2539_++) {
		    for (int i_2540_ = 0; i_2540_ < 3; i_2540_++) {
			int i_2541_ = 0;
			for (int i_2542_ = 0; i_2542_ < 3; i_2542_++)
			    i_2541_ += (is_2523_[i_2539_ * 3 + i_2542_]
					* is_2495_[i_2540_ * 3 + i_2542_]);
			is_2538_[i_2539_ * 3 + i_2540_] = i_2541_ + 8192 >> 14;
		    }
		}
		int i_2543_ = ((is_2523_[0] * i_2517_ + is_2523_[1] * i_2518_
				+ is_2523_[2] * i_2519_ + 8192)
			       >> 14);
		int i_2544_ = ((is_2523_[3] * i_2517_ + is_2523_[4] * i_2518_
				+ is_2523_[5] * i_2519_ + 8192)
			       >> 14);
		int i_2545_ = ((is_2523_[6] * i_2517_ + is_2523_[7] * i_2518_
				+ is_2523_[8] * i_2519_ + 8192)
			       >> 14);
		i_2543_ += i_2535_;
		i_2544_ += i_2536_;
		i_2545_ += i_2537_;
		int[] is_2546_ = new int[9];
		for (int i_2547_ = 0; i_2547_ < 3; i_2547_++) {
		    for (int i_2548_ = 0; i_2548_ < 3; i_2548_++) {
			int i_2549_ = 0;
			for (int i_2550_ = 0; i_2550_ < 3; i_2550_++)
			    i_2549_ += (is_2495_[i_2547_ * 3 + i_2550_]
					* is_2538_[i_2548_ + i_2550_ * 3]);
			is_2546_[i_2547_ * 3 + i_2548_] = i_2549_ + 8192 >> 14;
		    }
		}
		int i_2551_ = ((is_2495_[0] * i_2543_ + is_2495_[1] * i_2544_
				+ is_2495_[2] * i_2545_ + 8192)
			       >> 14);
		int i_2552_ = ((is_2495_[3] * i_2543_ + is_2495_[4] * i_2544_
				+ is_2495_[5] * i_2545_ + 8192)
			       >> 14);
		int i_2553_ = ((is_2495_[6] * i_2543_ + is_2495_[7] * i_2544_
				+ is_2495_[8] * i_2545_ + 8192)
			       >> 14);
		i_2551_ += i_2514_;
		i_2552_ += i_2515_;
		i_2553_ += i_2516_;
		for (int i_2554_ = 0; i_2554_ < i_2496_; i_2554_++) {
		    int i_2555_ = is[i_2554_];
		    if (i_2555_ < anIntArrayArray9470.length) {
			int[] is_2556_ = anIntArrayArray9470[i_2555_];
			for (int i_2557_ = 0; i_2557_ < is_2556_.length;
			     i_2557_++) {
			    int i_2558_ = is_2556_[i_2557_];
			    if (aShortArray9445 == null
				|| (i_2494_ & aShortArray9445[i_2558_]) != 0) {
				int i_2559_
				    = ((is_2546_[0] * anIntArray9494[i_2558_]
					+ is_2546_[1] * anIntArray9447[i_2558_]
					+ is_2546_[2] * anIntArray9448[i_2558_]
					+ 8192)
				       >> 14);
				int i_2560_
				    = ((is_2546_[3] * anIntArray9494[i_2558_]
					+ is_2546_[4] * anIntArray9447[i_2558_]
					+ is_2546_[5] * anIntArray9448[i_2558_]
					+ 8192)
				       >> 14);
				int i_2561_
				    = ((is_2546_[6] * anIntArray9494[i_2558_]
					+ is_2546_[7] * anIntArray9447[i_2558_]
					+ is_2546_[8] * anIntArray9448[i_2558_]
					+ 8192)
				       >> 14);
				i_2559_ += i_2551_;
				i_2560_ += i_2552_;
				i_2561_ += i_2553_;
				anIntArray9494[i_2558_] = i_2559_;
				anIntArray9447[i_2558_] = i_2560_;
				anIntArray9448[i_2558_] = i_2561_;
			    }
			}
		    }
		}
	    } else {
		for (int i_2562_ = 0; i_2562_ < i_2496_; i_2562_++) {
		    int i_2563_ = is[i_2562_];
		    if (i_2563_ < anIntArrayArray9470.length) {
			int[] is_2564_ = anIntArrayArray9470[i_2563_];
			for (int i_2565_ = 0; i_2565_ < is_2564_.length;
			     i_2565_++) {
			    int i_2566_ = is_2564_[i_2565_];
			    if (aShortArray9445 == null
				|| (i_2494_ & aShortArray9445[i_2566_]) != 0) {
				anIntArray9494[i_2566_] -= anInt9458;
				anIntArray9447[i_2566_] -= anInt9481;
				anIntArray9448[i_2566_] -= anInt9465;
				if (i_2493_ != 0) {
				    int i_2567_
					= Class427.anIntArray4806[i_2493_];
				    int i_2568_
					= Class427.anIntArray4805[i_2493_];
				    int i_2569_
					= ((anIntArray9447[i_2566_] * i_2567_
					    + anIntArray9494[i_2566_] * i_2568_
					    + 16383)
					   >> 14);
				    anIntArray9447[i_2566_]
					= (anIntArray9447[i_2566_] * i_2568_
					   - anIntArray9494[i_2566_] * i_2567_
					   + 16383) >> 14;
				    anIntArray9494[i_2566_] = i_2569_;
				}
				if (i_2491_ != 0) {
				    int i_2570_
					= Class427.anIntArray4806[i_2491_];
				    int i_2571_
					= Class427.anIntArray4805[i_2491_];
				    int i_2572_
					= ((anIntArray9447[i_2566_] * i_2571_
					    - anIntArray9448[i_2566_] * i_2570_
					    + 16383)
					   >> 14);
				    anIntArray9448[i_2566_]
					= (anIntArray9447[i_2566_] * i_2570_
					   + anIntArray9448[i_2566_] * i_2571_
					   + 16383) >> 14;
				    anIntArray9447[i_2566_] = i_2572_;
				}
				if (i_2492_ != 0) {
				    int i_2573_
					= Class427.anIntArray4806[i_2492_];
				    int i_2574_
					= Class427.anIntArray4805[i_2492_];
				    int i_2575_
					= ((anIntArray9448[i_2566_] * i_2573_
					    + anIntArray9494[i_2566_] * i_2574_
					    + 16383)
					   >> 14);
				    anIntArray9448[i_2566_]
					= (anIntArray9448[i_2566_] * i_2574_
					   - anIntArray9494[i_2566_] * i_2573_
					   + 16383) >> 14;
				    anIntArray9494[i_2566_] = i_2575_;
				}
				anIntArray9494[i_2566_] += anInt9458;
				anIntArray9447[i_2566_] += anInt9481;
				anIntArray9448[i_2566_] += anInt9465;
			    }
			}
		    }
		}
	    }
	} else if (i == 3) {
	    if (is_2495_ != null) {
		if (!aBool9477) {
		    for (int i_2576_ = 0; i_2576_ < anInt9444; i_2576_++) {
			anIntArray9494[i_2576_] <<= 4;
			anIntArray9447[i_2576_] <<= 4;
			anIntArray9448[i_2576_] <<= 4;
		    }
		    aBool9477 = true;
		}
		int i_2577_ = is_2495_[9] << 4;
		int i_2578_ = is_2495_[10] << 4;
		int i_2579_ = is_2495_[11] << 4;
		int i_2580_ = is_2495_[12] << 4;
		int i_2581_ = is_2495_[13] << 4;
		int i_2582_ = is_2495_[14] << 4;
		if (aBool9504) {
		    int i_2583_
			= ((is_2495_[0] * anInt9458 + is_2495_[3] * anInt9481
			    + is_2495_[6] * anInt9465 + 8192)
			   >> 14);
		    int i_2584_
			= ((is_2495_[1] * anInt9458 + is_2495_[4] * anInt9481
			    + is_2495_[7] * anInt9465 + 8192)
			   >> 14);
		    int i_2585_
			= ((is_2495_[2] * anInt9458 + is_2495_[5] * anInt9481
			    + is_2495_[8] * anInt9465 + 8192)
			   >> 14);
		    i_2583_ += i_2580_;
		    i_2584_ += i_2581_;
		    i_2585_ += i_2582_;
		    anInt9458 = i_2583_;
		    anInt9481 = i_2584_;
		    anInt9465 = i_2585_;
		    aBool9504 = false;
		}
		int i_2586_ = i_2491_ << 15 >> 7;
		int i_2587_ = i_2492_ << 15 >> 7;
		int i_2588_ = i_2493_ << 15 >> 7;
		int i_2589_ = i_2586_ * -anInt9458 + 8192 >> 14;
		int i_2590_ = i_2587_ * -anInt9481 + 8192 >> 14;
		int i_2591_ = i_2588_ * -anInt9465 + 8192 >> 14;
		int i_2592_ = i_2589_ + anInt9458;
		int i_2593_ = i_2590_ + anInt9481;
		int i_2594_ = i_2591_ + anInt9465;
		int[] is_2595_ = new int[9];
		is_2595_[0] = i_2586_ * is_2495_[0] + 8192 >> 14;
		is_2595_[1] = i_2586_ * is_2495_[3] + 8192 >> 14;
		is_2595_[2] = i_2586_ * is_2495_[6] + 8192 >> 14;
		is_2595_[3] = i_2587_ * is_2495_[1] + 8192 >> 14;
		is_2595_[4] = i_2587_ * is_2495_[4] + 8192 >> 14;
		is_2595_[5] = i_2587_ * is_2495_[7] + 8192 >> 14;
		is_2595_[6] = i_2588_ * is_2495_[2] + 8192 >> 14;
		is_2595_[7] = i_2588_ * is_2495_[5] + 8192 >> 14;
		is_2595_[8] = i_2588_ * is_2495_[8] + 8192 >> 14;
		int i_2596_ = i_2586_ * i_2580_ + 8192 >> 14;
		int i_2597_ = i_2587_ * i_2581_ + 8192 >> 14;
		int i_2598_ = i_2588_ * i_2582_ + 8192 >> 14;
		i_2596_ += i_2592_;
		i_2597_ += i_2593_;
		i_2598_ += i_2594_;
		int[] is_2599_ = new int[9];
		for (int i_2600_ = 0; i_2600_ < 3; i_2600_++) {
		    for (int i_2601_ = 0; i_2601_ < 3; i_2601_++) {
			int i_2602_ = 0;
			for (int i_2603_ = 0; i_2603_ < 3; i_2603_++)
			    i_2602_ += (is_2495_[i_2600_ * 3 + i_2603_]
					* is_2595_[i_2601_ + i_2603_ * 3]);
			is_2599_[i_2600_ * 3 + i_2601_] = i_2602_ + 8192 >> 14;
		    }
		}
		int i_2604_ = ((is_2495_[0] * i_2596_ + is_2495_[1] * i_2597_
				+ is_2495_[2] * i_2598_ + 8192)
			       >> 14);
		int i_2605_ = ((is_2495_[3] * i_2596_ + is_2495_[4] * i_2597_
				+ is_2495_[5] * i_2598_ + 8192)
			       >> 14);
		int i_2606_ = ((is_2495_[6] * i_2596_ + is_2495_[7] * i_2597_
				+ is_2495_[8] * i_2598_ + 8192)
			       >> 14);
		i_2604_ += i_2577_;
		i_2605_ += i_2578_;
		i_2606_ += i_2579_;
		for (int i_2607_ = 0; i_2607_ < i_2496_; i_2607_++) {
		    int i_2608_ = is[i_2607_];
		    if (i_2608_ < anIntArrayArray9470.length) {
			int[] is_2609_ = anIntArrayArray9470[i_2608_];
			for (int i_2610_ = 0; i_2610_ < is_2609_.length;
			     i_2610_++) {
			    int i_2611_ = is_2609_[i_2610_];
			    if (aShortArray9445 == null
				|| (i_2494_ & aShortArray9445[i_2611_]) != 0) {
				int i_2612_
				    = ((is_2599_[0] * anIntArray9494[i_2611_]
					+ is_2599_[1] * anIntArray9447[i_2611_]
					+ is_2599_[2] * anIntArray9448[i_2611_]
					+ 8192)
				       >> 14);
				int i_2613_
				    = ((is_2599_[3] * anIntArray9494[i_2611_]
					+ is_2599_[4] * anIntArray9447[i_2611_]
					+ is_2599_[5] * anIntArray9448[i_2611_]
					+ 8192)
				       >> 14);
				int i_2614_
				    = ((is_2599_[6] * anIntArray9494[i_2611_]
					+ is_2599_[7] * anIntArray9447[i_2611_]
					+ is_2599_[8] * anIntArray9448[i_2611_]
					+ 8192)
				       >> 14);
				i_2612_ += i_2604_;
				i_2613_ += i_2605_;
				i_2614_ += i_2606_;
				anIntArray9494[i_2611_] = i_2612_;
				anIntArray9447[i_2611_] = i_2613_;
				anIntArray9448[i_2611_] = i_2614_;
			    }
			}
		    }
		}
	    } else {
		for (int i_2615_ = 0; i_2615_ < i_2496_; i_2615_++) {
		    int i_2616_ = is[i_2615_];
		    if (i_2616_ < anIntArrayArray9470.length) {
			int[] is_2617_ = anIntArrayArray9470[i_2616_];
			for (int i_2618_ = 0; i_2618_ < is_2617_.length;
			     i_2618_++) {
			    int i_2619_ = is_2617_[i_2618_];
			    if (aShortArray9445 == null
				|| (i_2494_ & aShortArray9445[i_2619_]) != 0) {
				anIntArray9494[i_2619_] -= anInt9458;
				anIntArray9447[i_2619_] -= anInt9481;
				anIntArray9448[i_2619_] -= anInt9465;
				anIntArray9494[i_2619_]
				    = anIntArray9494[i_2619_] * i_2491_ / 128;
				anIntArray9447[i_2619_]
				    = anIntArray9447[i_2619_] * i_2492_ / 128;
				anIntArray9448[i_2619_]
				    = anIntArray9448[i_2619_] * i_2493_ / 128;
				anIntArray9494[i_2619_] += anInt9458;
				anIntArray9447[i_2619_] += anInt9481;
				anIntArray9448[i_2619_] += anInt9465;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9457 != null && aByteArray9469 != null) {
		for (int i_2620_ = 0; i_2620_ < i_2496_; i_2620_++) {
		    int i_2621_ = is[i_2620_];
		    if (i_2621_ < anIntArrayArray9457.length) {
			int[] is_2622_ = anIntArrayArray9457[i_2621_];
			for (int i_2623_ = 0; i_2623_ < is_2622_.length;
			     i_2623_++) {
			    int i_2624_ = is_2622_[i_2623_];
			    if (aShortArray9472 == null
				|| (i_2494_ & aShortArray9472[i_2624_]) != 0) {
				int i_2625_ = ((aByteArray9469[i_2624_] & 0xff)
					       + i_2491_ * 8);
				if (i_2625_ < 0)
				    i_2625_ = 0;
				else if (i_2625_ > 255)
				    i_2625_ = 255;
				aByteArray9469[i_2624_] = (byte) i_2625_;
			    }
			}
		    }
		}
		if (aClass118Array9485 != null) {
		    for (int i_2626_ = 0; i_2626_ < anInt9484; i_2626_++) {
			Class118 class118 = aClass118Array9485[i_2626_];
			Class117 class117 = aClass117Array9486[i_2626_];
			class117.anInt1411
			    = (class117.anInt1411 * -150900843 & 0xffffff
			       | 255 - ((aByteArray9469
					 [class118.anInt1418 * 2118166057])
					& 0xff) << 24) * 874668989;
		    }
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9457 != null) {
		for (int i_2627_ = 0; i_2627_ < i_2496_; i_2627_++) {
		    int i_2628_ = is[i_2627_];
		    if (i_2628_ < anIntArrayArray9457.length) {
			int[] is_2629_ = anIntArrayArray9457[i_2628_];
			for (int i_2630_ = 0; i_2630_ < is_2629_.length;
			     i_2630_++) {
			    int i_2631_ = is_2629_[i_2630_];
			    if (aShortArray9472 == null
				|| (i_2494_ & aShortArray9472[i_2631_]) != 0) {
				int i_2632_
				    = aShortArray9471[i_2631_] & 0xffff;
				int i_2633_ = i_2632_ >> 10 & 0x3f;
				int i_2634_ = i_2632_ >> 7 & 0x7;
				int i_2635_ = i_2632_ & 0x7f;
				i_2633_ = i_2633_ + i_2491_ & 0x3f;
				i_2634_ += i_2492_;
				if (i_2634_ < 0)
				    i_2634_ = 0;
				else if (i_2634_ > 7)
				    i_2634_ = 7;
				i_2635_ += i_2493_;
				if (i_2635_ < 0)
				    i_2635_ = 0;
				else if (i_2635_ > 127)
				    i_2635_ = 127;
				aShortArray9471[i_2631_]
				    = (short) (i_2633_ << 10 | i_2634_ << 7
					       | i_2635_);
			    }
			}
			aBool9476 = true;
		    }
		}
		if (aClass118Array9485 != null) {
		    for (int i_2636_ = 0; i_2636_ < anInt9484; i_2636_++) {
			Class118 class118 = aClass118Array9485[i_2636_];
			Class117 class117 = aClass117Array9486[i_2636_];
			class117.anInt1411
			    = (class117.anInt1411 * -150900843 & ~0xffffff
			       | ((Class415.anIntArray4666
				   [Class315.method5705(((aShortArray9471
							  [(class118.anInt1418
							    * 2118166057)])
							 & 0xffff),
							648335205) & 0xffff])
				  & 0xffffff)) * 874668989;
		    }
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9487 != null) {
		for (int i_2637_ = 0; i_2637_ < i_2496_; i_2637_++) {
		    int i_2638_ = is[i_2637_];
		    if (i_2638_ < anIntArrayArray9487.length) {
			int[] is_2639_ = anIntArrayArray9487[i_2638_];
			for (int i_2640_ = 0; i_2640_ < is_2639_.length;
			     i_2640_++) {
			    Class117 class117
				= aClass117Array9486[is_2639_[i_2640_]];
			    class117.anInt1405 += i_2491_ * 1831486073;
			    class117.anInt1406 += i_2492_ * -108929861;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9487 != null) {
		for (int i_2641_ = 0; i_2641_ < i_2496_; i_2641_++) {
		    int i_2642_ = is[i_2641_];
		    if (i_2642_ < anIntArrayArray9487.length) {
			int[] is_2643_ = anIntArrayArray9487[i_2642_];
			for (int i_2644_ = 0; i_2644_ < is_2643_.length;
			     i_2644_++) {
			    Class117 class117
				= aClass117Array9486[is_2643_[i_2644_]];
			    class117.aFloat1403 = (class117.aFloat1403
						   * (float) i_2491_ / 128.0F);
			    class117.aFloat1404 = (class117.aFloat1404
						   * (float) i_2492_ / 128.0F);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9487 != null) {
		for (int i_2645_ = 0; i_2645_ < i_2496_; i_2645_++) {
		    int i_2646_ = is[i_2645_];
		    if (i_2646_ < anIntArrayArray9487.length) {
			int[] is_2647_ = anIntArrayArray9487[i_2646_];
			for (int i_2648_ = 0; i_2648_ < is_2647_.length;
			     i_2648_++) {
			    Class117 class117
				= aClass117Array9486[is_2647_[i_2648_]];
			    class117.anInt1409
				= (class117.anInt1409 * -133325595 + i_2491_
				   & 0x3fff) * 1832042733;
			}
		    }
		}
	    }
	}
    }
    
    public void method3021(int i, int i_2649_, int i_2650_) {
	if (i != 128 && (anInt9441 & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_2649_ != 128 && (anInt9441 & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_2650_ != 128 && (anInt9441 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_2651_ = 0; i_2651_ < anInt9444; i_2651_++) {
		anIntArray9494[i_2651_] = anIntArray9494[i_2651_] * i >> 7;
		anIntArray9447[i_2651_]
		    = anIntArray9447[i_2651_] * i_2649_ >> 7;
		anIntArray9448[i_2651_]
		    = anIntArray9448[i_2651_] * i_2650_ >> 7;
	    }
	    aBool9488 = false;
	}
    }
    
    public void method3037(Class446 class446, int i, boolean bool) {
	if (aShortArray9445 != null) {
	    Class101 class101
		= aClass185_Sub2_9475.method15011(Thread.currentThread());
	    Class446 class446_2652_ = class101.aClass446_1215;
	    class446_2652_.method7236(class446);
	    if (bool)
		class446_2652_.method7243();
	    Class433 class433 = class101.aClass433_1224;
	    class433.method6916(class446_2652_);
	    float[] fs = new float[3];
	    for (int i_2653_ = 0; i_2653_ < anInt9474; i_2653_++) {
		if ((i & aShortArray9445[i_2653_]) != 0) {
		    class433.method6850((float) anIntArray9494[i_2653_],
					(float) anIntArray9447[i_2653_],
					(float) anIntArray9448[i_2653_], fs);
		    anIntArray9494[i_2653_] = (int) fs[0];
		    anIntArray9447[i_2653_] = (int) fs[1];
		    anIntArray9448[i_2653_] = (int) fs[2];
		}
	    }
	}
    }
    
    int method15172(int i) {
	if (i < 2)
	    i = 2;
	else if (i > 126)
	    i = 126;
	return i;
    }
    
    public Class534_Sub18_Sub16 method3040
	(Class534_Sub18_Sub16 class534_sub18_sub16) {
	return null;
    }
    
    public int method3144() {
	if (!aBool9512)
	    method3050();
	return aShort9498;
    }
    
    public void method3145(int i) {
	if ((anInt9441 & 0x1000) != 4096)
	    throw new IllegalStateException();
	anInt9454 = i;
	anInt9432 = 0;
    }
    
    public void method3146(int i) {
	if ((anInt9441 & 0x1000) != 4096)
	    throw new IllegalStateException();
	anInt9454 = i;
	anInt9432 = 0;
    }
    
    public void method3147(int i) {
	if ((anInt9441 & 0x2000) != 8192)
	    throw new IllegalStateException();
	anInt9443 = i;
	anInt9432 = 0;
    }
    
    public void method3034(Class446 class446, Class194 class194, int i) {
	method15110(class446, class194, i);
    }
    
    public void method3149(int i) {
	if ((anInt9441 & 0x2000) != 8192)
	    throw new IllegalStateException();
	anInt9443 = i;
	anInt9432 = 0;
    }
    
    public boolean method3170() {
	if (aShortArray9428 == null)
	    return true;
	for (int i = 0; i < aShortArray9428.length; i++) {
	    if (aShortArray9428[i] != -1
		&& !aClass185_Sub2_9475.method15002(aShortArray9428[i]))
		return false;
	}
	return true;
    }
    
    public int method3151() {
	return anInt9443;
    }
    
    public void method3158(short i, short i_2654_) {
	if (aShortArray9428 != null) {
	    if (!aBool9500 && i_2654_ >= 0) {
		Class186 class186
		    = aClass185_Sub2_9475.aClass177_2012
			  .method2931(i_2654_ & 0xffff, (byte) 1);
		if (class186.aByte2047 != 0 || class186.aByte2048 != 0)
		    aBool9500 = true;
	    }
	    for (int i_2655_ = 0; i_2655_ < anInt9440; i_2655_++) {
		if (aShortArray9428[i_2655_] == i)
		    aShortArray9428[i_2655_] = i_2654_;
	    }
	}
    }
    
    public void method3199(short i, short i_2656_) {
	for (int i_2657_ = 0; i_2657_ < anInt9440; i_2657_++) {
	    if (aShortArray9471[i_2657_] == i)
		aShortArray9471[i_2657_] = i_2656_;
	}
	if (aClass118Array9485 != null) {
	    for (int i_2658_ = 0; i_2658_ < anInt9484; i_2658_++) {
		Class118 class118 = aClass118Array9485[i_2658_];
		Class117 class117 = aClass117Array9486[i_2658_];
		class117.anInt1411
		    = (class117.anInt1411 * -150900843 & ~0xffffff
		       | ((Class415.anIntArray4666
			   [Class315.method5705((aShortArray9471
						 [(class118.anInt1418
						   * 2118166057)]),
						745404968) & 0xffff])
			  & 0xffffff)) * 874668989;
	    }
	}
	if (anInt9432 == 2)
	    anInt9432 = 1;
    }
    
    void method15173() {
	if (!aBool9488) {
	    int i = 0;
	    int i_2659_ = 0;
	    int i_2660_ = 32767;
	    int i_2661_ = 32767;
	    int i_2662_ = 32767;
	    int i_2663_ = -32768;
	    int i_2664_ = -32768;
	    int i_2665_ = -32768;
	    for (int i_2666_ = 0; i_2666_ < anInt9474; i_2666_++) {
		int i_2667_ = anIntArray9494[i_2666_];
		int i_2668_ = anIntArray9447[i_2666_];
		int i_2669_ = anIntArray9448[i_2666_];
		if (i_2667_ < i_2660_)
		    i_2660_ = i_2667_;
		if (i_2667_ > i_2663_)
		    i_2663_ = i_2667_;
		if (i_2668_ < i_2661_)
		    i_2661_ = i_2668_;
		if (i_2668_ > i_2664_)
		    i_2664_ = i_2668_;
		if (i_2669_ < i_2662_)
		    i_2662_ = i_2669_;
		if (i_2669_ > i_2665_)
		    i_2665_ = i_2669_;
		int i_2670_ = i_2667_ * i_2667_ + i_2669_ * i_2669_;
		if (i_2670_ > i)
		    i = i_2670_;
		i_2670_ += i_2668_ * i_2668_;
		if (i_2670_ > i_2659_)
		    i_2659_ = i_2670_;
	    }
	    aShort9493 = (short) i_2660_;
	    aShort9468 = (short) i_2663_;
	    aShort9491 = (short) i_2661_;
	    aShort9492 = (short) i_2664_;
	    aShort9495 = (short) i_2662_;
	    aShort9449 = (short) i_2665_;
	    aShort9473 = (short) (int) (Math.sqrt((double) i) + 0.99);
	    aShort9490 = (short) (int) (Math.sqrt((double) i_2659_) + 0.99);
	    aBool9488 = true;
	}
    }
    
    public void method3155(byte i, byte[] is) {
	if ((anInt9441 & 0x100000) == 0)
	    throw new RuntimeException();
	if (aByteArray9469 == null)
	    aByteArray9469 = new byte[anInt9440];
	if (is == null) {
	    for (int i_2671_ = 0; i_2671_ < anInt9440; i_2671_++)
		aByteArray9469[i_2671_] = i;
	} else {
	    for (int i_2672_ = 0; i_2672_ < anInt9440; i_2672_++) {
		int i_2673_ = 255 - ((255 - (is[i_2672_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		aByteArray9469[i_2672_] = (byte) i_2673_;
	    }
	}
	if (anInt9432 == 2)
	    anInt9432 = 1;
    }
    
    public void method3150(byte i, byte[] is) {
	if ((anInt9441 & 0x100000) == 0)
	    throw new RuntimeException();
	if (aByteArray9469 == null)
	    aByteArray9469 = new byte[anInt9440];
	if (is == null) {
	    for (int i_2674_ = 0; i_2674_ < anInt9440; i_2674_++)
		aByteArray9469[i_2674_] = i;
	} else {
	    for (int i_2675_ = 0; i_2675_ < anInt9440; i_2675_++) {
		int i_2676_ = 255 - ((255 - (is[i_2675_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		aByteArray9469[i_2675_] = (byte) i_2676_;
	    }
	}
	if (anInt9432 == 2)
	    anInt9432 = 1;
    }
    
    public void method3157(byte i, byte[] is) {
	if ((anInt9441 & 0x100000) == 0)
	    throw new RuntimeException();
	if (aByteArray9469 == null)
	    aByteArray9469 = new byte[anInt9440];
	if (is == null) {
	    for (int i_2677_ = 0; i_2677_ < anInt9440; i_2677_++)
		aByteArray9469[i_2677_] = i;
	} else {
	    for (int i_2678_ = 0; i_2678_ < anInt9440; i_2678_++) {
		int i_2679_ = 255 - ((255 - (is[i_2678_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		aByteArray9469[i_2678_] = (byte) i_2679_;
	    }
	}
	if (anInt9432 == 2)
	    anInt9432 = 1;
    }
    
    public boolean method3172() {
	return aBool9499;
    }
    
    public void method3159(short i, short i_2680_) {
	if (aShortArray9428 != null) {
	    if (!aBool9500 && i_2680_ >= 0) {
		Class186 class186
		    = aClass185_Sub2_9475.aClass177_2012
			  .method2931(i_2680_ & 0xffff, (byte) 1);
		if (class186.aByte2047 != 0 || class186.aByte2048 != 0)
		    aBool9500 = true;
	    }
	    for (int i_2681_ = 0; i_2681_ < anInt9440; i_2681_++) {
		if (aShortArray9428[i_2681_] == i)
		    aShortArray9428[i_2681_] = i_2680_;
	    }
	}
    }
    
    public void method3160(short i, short i_2682_) {
	if (aShortArray9428 != null) {
	    if (!aBool9500 && i_2682_ >= 0) {
		Class186 class186
		    = aClass185_Sub2_9475.aClass177_2012
			  .method2931(i_2682_ & 0xffff, (byte) 1);
		if (class186.aByte2047 != 0 || class186.aByte2048 != 0)
		    aBool9500 = true;
	    }
	    for (int i_2683_ = 0; i_2683_ < anInt9440; i_2683_++) {
		if (aShortArray9428[i_2683_] == i)
		    aShortArray9428[i_2683_] = i_2682_;
	    }
	}
    }
    
    public void method3161(int i, int i_2684_, int i_2685_, int i_2686_) {
	if ((anInt9441 & 0x80000) != 524288)
	    throw new IllegalStateException();
	for (int i_2687_ = 0; i_2687_ < anInt9440; i_2687_++) {
	    int i_2688_ = aShortArray9471[i_2687_] & 0xffff;
	    int i_2689_ = i_2688_ >> 10 & 0x3f;
	    int i_2690_ = i_2688_ >> 7 & 0x7;
	    int i_2691_ = i_2688_ & 0x7f;
	    if (i != -1)
		i_2689_ += (i - i_2689_) * i_2686_ >> 7;
	    if (i_2684_ != -1)
		i_2690_ += (i_2684_ - i_2690_) * i_2686_ >> 7;
	    if (i_2685_ != -1)
		i_2691_ += (i_2685_ - i_2691_) * i_2686_ >> 7;
	    aShortArray9471[i_2687_]
		= (short) (i_2689_ << 10 | i_2690_ << 7 | i_2691_);
	}
	if (aClass118Array9485 != null) {
	    for (int i_2692_ = 0; i_2692_ < anInt9484; i_2692_++) {
		Class118 class118 = aClass118Array9485[i_2692_];
		Class117 class117 = aClass117Array9486[i_2692_];
		class117.anInt1411
		    = (class117.anInt1411 * -150900843 & ~0xffffff
		       | ((Class415.anIntArray4666
			   [Class315.method5705((aShortArray9471
						 [(class118.anInt1418
						   * 2118166057)]) & 0xffff,
						-153181760) & 0xffff])
			  & 0xffffff)) * 874668989;
	    }
	}
	if (anInt9432 == 2)
	    anInt9432 = 1;
    }
    
    public void method3141(int i, int i_2693_, int i_2694_, int i_2695_) {
	if ((anInt9441 & 0x80000) != 524288)
	    throw new IllegalStateException();
	for (int i_2696_ = 0; i_2696_ < anInt9440; i_2696_++) {
	    int i_2697_ = aShortArray9471[i_2696_] & 0xffff;
	    int i_2698_ = i_2697_ >> 10 & 0x3f;
	    int i_2699_ = i_2697_ >> 7 & 0x7;
	    int i_2700_ = i_2697_ & 0x7f;
	    if (i != -1)
		i_2698_ += (i - i_2698_) * i_2695_ >> 7;
	    if (i_2693_ != -1)
		i_2699_ += (i_2693_ - i_2699_) * i_2695_ >> 7;
	    if (i_2694_ != -1)
		i_2700_ += (i_2694_ - i_2700_) * i_2695_ >> 7;
	    aShortArray9471[i_2696_]
		= (short) (i_2698_ << 10 | i_2699_ << 7 | i_2700_);
	}
	if (aClass118Array9485 != null) {
	    for (int i_2701_ = 0; i_2701_ < anInt9484; i_2701_++) {
		Class118 class118 = aClass118Array9485[i_2701_];
		Class117 class117 = aClass117Array9486[i_2701_];
		class117.anInt1411
		    = (class117.anInt1411 * -150900843 & ~0xffffff
		       | ((Class415.anIntArray4666
			   [Class315.method5705((aShortArray9471
						 [(class118.anInt1418
						   * 2118166057)]) & 0xffff,
						675565711) & 0xffff])
			  & 0xffffff)) * 874668989;
	    }
	}
	if (anInt9432 == 2)
	    anInt9432 = 1;
    }
    
    public Class172[] method3163() {
	return aClass172Array9482;
    }
    
    public Class172[] method3164() {
	return aClass172Array9482;
    }
    
    public Class172[] method3165() {
	return aClass172Array9482;
    }
    
    void method3137(int i, int i_2702_, int i_2703_, int i_2704_) {
	if (i == 0) {
	    int i_2705_ = 0;
	    anInt9458 = 0;
	    anInt9481 = 0;
	    anInt9465 = 0;
	    for (int i_2706_ = 0; i_2706_ < anInt9444; i_2706_++) {
		anInt9458 += anIntArray9494[i_2706_];
		anInt9481 += anIntArray9447[i_2706_];
		anInt9465 += anIntArray9448[i_2706_];
		i_2705_++;
	    }
	    if (i_2705_ > 0) {
		anInt9458 = anInt9458 / i_2705_ + i_2702_;
		anInt9481 = anInt9481 / i_2705_ + i_2703_;
		anInt9465 = anInt9465 / i_2705_ + i_2704_;
	    } else {
		anInt9458 = i_2702_;
		anInt9481 = i_2703_;
		anInt9465 = i_2704_;
	    }
	} else if (i == 1) {
	    for (int i_2707_ = 0; i_2707_ < anInt9444; i_2707_++) {
		anIntArray9494[i_2707_] += i_2702_;
		anIntArray9447[i_2707_] += i_2703_;
		anIntArray9448[i_2707_] += i_2704_;
	    }
	} else if (i == 2) {
	    for (int i_2708_ = 0; i_2708_ < anInt9444; i_2708_++) {
		anIntArray9494[i_2708_] -= anInt9458;
		anIntArray9447[i_2708_] -= anInt9481;
		anIntArray9448[i_2708_] -= anInt9465;
		if (i_2704_ != 0) {
		    int i_2709_ = Class427.anIntArray4806[i_2704_];
		    int i_2710_ = Class427.anIntArray4805[i_2704_];
		    int i_2711_
			= ((anIntArray9447[i_2708_] * i_2709_
			    + anIntArray9494[i_2708_] * i_2710_ + 16383)
			   >> 14);
		    anIntArray9447[i_2708_]
			= (anIntArray9447[i_2708_] * i_2710_
			   - anIntArray9494[i_2708_] * i_2709_ + 16383) >> 14;
		    anIntArray9494[i_2708_] = i_2711_;
		}
		if (i_2702_ != 0) {
		    int i_2712_ = Class427.anIntArray4806[i_2702_];
		    int i_2713_ = Class427.anIntArray4805[i_2702_];
		    int i_2714_
			= ((anIntArray9447[i_2708_] * i_2713_
			    - anIntArray9448[i_2708_] * i_2712_ + 16383)
			   >> 14);
		    anIntArray9448[i_2708_]
			= (anIntArray9447[i_2708_] * i_2712_
			   + anIntArray9448[i_2708_] * i_2713_ + 16383) >> 14;
		    anIntArray9447[i_2708_] = i_2714_;
		}
		if (i_2703_ != 0) {
		    int i_2715_ = Class427.anIntArray4806[i_2703_];
		    int i_2716_ = Class427.anIntArray4805[i_2703_];
		    int i_2717_
			= ((anIntArray9448[i_2708_] * i_2715_
			    + anIntArray9494[i_2708_] * i_2716_ + 16383)
			   >> 14);
		    anIntArray9448[i_2708_]
			= (anIntArray9448[i_2708_] * i_2716_
			   - anIntArray9494[i_2708_] * i_2715_ + 16383) >> 14;
		    anIntArray9494[i_2708_] = i_2717_;
		}
		anIntArray9494[i_2708_] += anInt9458;
		anIntArray9447[i_2708_] += anInt9481;
		anIntArray9448[i_2708_] += anInt9465;
	    }
	} else if (i == 3) {
	    for (int i_2718_ = 0; i_2718_ < anInt9444; i_2718_++) {
		anIntArray9494[i_2718_] -= anInt9458;
		anIntArray9447[i_2718_] -= anInt9481;
		anIntArray9448[i_2718_] -= anInt9465;
		anIntArray9494[i_2718_]
		    = anIntArray9494[i_2718_] * i_2702_ / 128;
		anIntArray9447[i_2718_]
		    = anIntArray9447[i_2718_] * i_2703_ / 128;
		anIntArray9448[i_2718_]
		    = anIntArray9448[i_2718_] * i_2704_ / 128;
		anIntArray9494[i_2718_] += anInt9458;
		anIntArray9447[i_2718_] += anInt9481;
		anIntArray9448[i_2718_] += anInt9465;
	    }
	} else if (i == 5) {
	    for (int i_2719_ = 0; i_2719_ < anInt9440; i_2719_++) {
		int i_2720_ = (aByteArray9469[i_2719_] & 0xff) + i_2702_ * 8;
		if (i_2720_ < 0)
		    i_2720_ = 0;
		else if (i_2720_ > 255)
		    i_2720_ = 255;
		aByteArray9469[i_2719_] = (byte) i_2720_;
	    }
	    if (aClass118Array9485 != null) {
		for (int i_2721_ = 0; i_2721_ < anInt9484; i_2721_++) {
		    Class118 class118 = aClass118Array9485[i_2721_];
		    Class117 class117 = aClass117Array9486[i_2721_];
		    class117.anInt1411
			= (class117.anInt1411 * -150900843 & 0xffffff
			   | 255 - ((aByteArray9469
				     [class118.anInt1418 * 2118166057])
				    & 0xff) << 24) * 874668989;
		}
	    }
	} else if (i == 7) {
	    for (int i_2722_ = 0; i_2722_ < anInt9440; i_2722_++) {
		int i_2723_ = aShortArray9471[i_2722_] & 0xffff;
		int i_2724_ = i_2723_ >> 10 & 0x3f;
		int i_2725_ = i_2723_ >> 7 & 0x7;
		int i_2726_ = i_2723_ & 0x7f;
		i_2724_ = i_2724_ + i_2702_ & 0x3f;
		i_2725_ += i_2703_;
		if (i_2725_ < 0)
		    i_2725_ = 0;
		else if (i_2725_ > 7)
		    i_2725_ = 7;
		i_2726_ += i_2704_;
		if (i_2726_ < 0)
		    i_2726_ = 0;
		else if (i_2726_ > 127)
		    i_2726_ = 127;
		aShortArray9471[i_2722_]
		    = (short) (i_2724_ << 10 | i_2725_ << 7 | i_2726_);
	    }
	    aBool9476 = true;
	    if (aClass118Array9485 != null) {
		for (int i_2727_ = 0; i_2727_ < anInt9484; i_2727_++) {
		    Class118 class118 = aClass118Array9485[i_2727_];
		    Class117 class117 = aClass117Array9486[i_2727_];
		    class117.anInt1411
			= (class117.anInt1411 * -150900843 & ~0xffffff
			   | ((Class415.anIntArray4666
			       [Class315.method5705(((aShortArray9471
						      [(class118.anInt1418
							* 2118166057)])
						     & 0xffff),
						    1888722098) & 0xffff])
			      & 0xffffff)) * 874668989;
		}
	    }
	} else if (i == 8) {
	    for (int i_2728_ = 0; i_2728_ < anInt9484; i_2728_++) {
		Class117 class117 = aClass117Array9486[i_2728_];
		class117.anInt1405 += i_2702_ * 1831486073;
		class117.anInt1406 += i_2703_ * -108929861;
	    }
	} else if (i == 10) {
	    for (int i_2729_ = 0; i_2729_ < anInt9484; i_2729_++) {
		Class117 class117 = aClass117Array9486[i_2729_];
		class117.aFloat1403
		    = class117.aFloat1403 * (float) i_2702_ / 128.0F;
		class117.aFloat1404
		    = class117.aFloat1404 * (float) i_2703_ / 128.0F;
	    }
	} else if (i == 9) {
	    for (int i_2730_ = 0; i_2730_ < anInt9484; i_2730_++) {
		Class117 class117 = aClass117Array9486[i_2730_];
		class117.anInt1409 = (class117.anInt1409 * -133325595 + i_2702_
				      & 0x3fff) * 1832042733;
	    }
	}
    }
    
    public void method3016(int i) {
	if ((anInt9441 & 0xd) != 13)
	    throw new IllegalStateException();
	if (aClass96Array9450 != null) {
	    if (i == 4096)
		method15108();
	    else if (i == 8192)
		method15104();
	    else if (i == 12288)
		method15105();
	    else {
		int i_2731_ = Class427.anIntArray4806[i];
		int i_2732_ = Class427.anIntArray4805[i];
		synchronized (this) {
		    for (int i_2733_ = 0; i_2733_ < anInt9474; i_2733_++) {
			int i_2734_ = ((anIntArray9448[i_2733_] * i_2731_
					+ anIntArray9494[i_2733_] * i_2732_)
				       >> 14);
			anIntArray9448[i_2733_]
			    = (anIntArray9448[i_2733_] * i_2732_
			       - anIntArray9494[i_2733_] * i_2731_) >> 14;
			anIntArray9494[i_2733_] = i_2734_;
			if (aClass96Array9450[i_2733_] != null) {
			    i_2734_ = ((aClass96Array9450[i_2733_].anInt1156
					* i_2731_)
				       + (aClass96Array9450[i_2733_].anInt1159
					  * i_2732_)) >> 14;
			    aClass96Array9450[i_2733_].anInt1156
				= ((aClass96Array9450[i_2733_].anInt1156
				    * i_2732_)
				   - (aClass96Array9450[i_2733_].anInt1159
				      * i_2731_)) >> 14;
			    aClass96Array9450[i_2733_].anInt1159 = i_2734_;
			}
		    }
		    if (aClass107Array9466 != null) {
			for (int i_2735_ = 0; i_2735_ < anInt9440; i_2735_++) {
			    if (aClass107Array9466[i_2735_] != null) {
				int i_2736_
				    = ((aClass107Array9466[i_2735_].anInt1313
					* i_2731_)
				       + (aClass107Array9466[i_2735_].anInt1315
					  * i_2732_)) >> 14;
				aClass107Array9466[i_2735_].anInt1313
				    = ((aClass107Array9466[i_2735_].anInt1313
					* i_2732_)
				       - (aClass107Array9466[i_2735_].anInt1315
					  * i_2731_)) >> 14;
				aClass107Array9466[i_2735_].anInt1315
				    = i_2736_;
			    }
			}
		    }
		    for (int i_2737_ = anInt9474; i_2737_ < anInt9444;
			 i_2737_++) {
			int i_2738_ = ((anIntArray9448[i_2737_] * i_2731_
					+ anIntArray9494[i_2737_] * i_2732_)
				       >> 14);
			anIntArray9448[i_2737_]
			    = (anIntArray9448[i_2737_] * i_2732_
			       - anIntArray9494[i_2737_] * i_2731_) >> 14;
			anIntArray9494[i_2737_] = i_2738_;
		    }
		    anInt9432 = 0;
		    aBool9488 = false;
		}
	    }
	} else
	    method3015(i);
    }
    
    public boolean method3090() {
	if (aShortArray9428 == null)
	    return true;
	for (int i = 0; i < aShortArray9428.length; i++) {
	    if (aShortArray9428[i] != -1
		&& !aClass185_Sub2_9475.method15002(aShortArray9428[i]))
		return false;
	}
	return true;
    }
    
    public int method3139() {
	if (!aBool9488)
	    method15173();
	return aShort9492;
    }
    
    final void method15174(boolean bool, boolean bool_2739_,
			   boolean bool_2740_, int i) {
	boolean bool_2741_ = false;
	if (aShortArray9428 != null && aShortArray9428[i] != -1)
	    bool_2741_ = (aClass185_Sub2_9475.aClass177_2012.method2931
			  (aShortArray9428[i] & 0xffff, (byte) 1).aBool2043);
	if (!aClass101_9437.aBool1245) {
	    short i_2742_ = aShortArray9479[i];
	    short i_2743_ = aShortArray9455[i];
	    short i_2744_ = aShortArray9456[i];
	    Class433 class433 = aClass185_Sub2_9475.aClass433_9362;
	    float f = class433.aFloatArray4853[10];
	    float f_2745_ = class433.aFloatArray4853[14];
	    float f_2746_ = class433.aFloatArray4853[11];
	    float f_2747_ = class433.aFloatArray4853[15];
	    float f_2748_ = f_2745_ * f_2746_ - f * f_2747_;
	    float f_2749_
		= ((aFloatArray9505[i_2742_] - aClass101_9437.aFloat1234)
		   * aClass101_9437.aFloat1219);
	    float f_2750_
		= ((aFloatArray9505[i_2743_] - aClass101_9437.aFloat1234)
		   * aClass101_9437.aFloat1219);
	    float f_2751_
		= ((aFloatArray9505[i_2744_] - aClass101_9437.aFloat1234)
		   * aClass101_9437.aFloat1219);
	    float f_2752_ = f_2749_ * f_2748_ / (f_2749_ * f_2746_ - f);
	    float f_2753_ = f_2750_ * f_2748_ / (f_2750_ * f_2746_ - f);
	    float f_2754_ = f_2751_ * f_2748_ / (f_2751_ * f_2746_ - f);
	    float f_2755_ = ((f_2752_ - aClass101_9437.aFloat1204)
			     / aClass101_9437.aFloat1205);
	    if (f_2755_ > 1.0F)
		f_2755_ = 1.0F;
	    else if (f_2755_ < 0.0F)
		f_2755_ = 0.0F;
	    float f_2756_ = ((f_2753_ - aClass101_9437.aFloat1204)
			     / aClass101_9437.aFloat1205);
	    if (f_2756_ > 1.0F)
		f_2756_ = 1.0F;
	    else if (f_2756_ < 0.0F)
		f_2756_ = 0.0F;
	    float f_2757_ = ((f_2754_ - aClass101_9437.aFloat1204)
			     / aClass101_9437.aFloat1205);
	    if (f_2757_ > 1.0F)
		f_2757_ = 1.0F;
	    else if (f_2757_ < 0.0F)
		f_2757_ = 0.0F;
	    float f_2758_ = f_2755_ + f_2756_ + f_2757_;
	    if (!(f_2758_ >= 3.0F)) {
		if (f_2758_ <= 0.0F)
		    method15113(bool, bool_2739_, bool_2740_, i);
		else {
		    if (aByteArray9469 == null)
			aClass119_9489.anInt1447 = 0;
		    else
			aClass119_9489.anInt1447 = aByteArray9469[i] & 0xff;
		    if (!bool_2741_) {
			if (anIntArray9461[i] == -1)
			    aClass119_9489.method2141
				(bool, bool_2739_, bool_2740_,
				 aFloatArray9496[i_2742_],
				 aFloatArray9496[i_2743_],
				 aFloatArray9496[i_2744_],
				 aFloatArray9503[i_2742_],
				 aFloatArray9503[i_2743_],
				 aFloatArray9503[i_2744_],
				 aFloatArray9505[i_2742_],
				 aFloatArray9505[i_2743_],
				 aFloatArray9505[i_2744_],
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9459[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_2755_ * 255.0F,
						    (byte) -114),
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9459[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_2756_ * 255.0F,
						    (byte) 5),
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9459[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_2757_ * 255.0F,
						    (byte) 7));
			else
			    aClass119_9489.method2141
				(bool, bool_2739_, bool_2740_,
				 aFloatArray9496[i_2742_],
				 aFloatArray9496[i_2743_],
				 aFloatArray9496[i_2744_],
				 aFloatArray9503[i_2742_],
				 aFloatArray9503[i_2743_],
				 aFloatArray9503[i_2744_],
				 aFloatArray9505[i_2742_],
				 aFloatArray9505[i_2743_],
				 aFloatArray9505[i_2744_],
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9459[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_2755_ * 255.0F,
						    (byte) 23),
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9460[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_2756_ * 255.0F,
						    (byte) -17),
				 Class69.method1396((Class415.anIntArray4666
						     [(anIntArray9461[i]
						       & 0xffff)]),
						    (aClass101_9437.anInt1206
						     * 1046269871),
						    f_2757_ * 255.0F,
						    (byte) 43));
		    } else {
			int i_2759_ = -16777216;
			if (aByteArray9469 != null)
			    i_2759_ = 255 - (aByteArray9469[i] & 0xff) << 24;
			if (anIntArray9461[i] == -1) {
			    int i_2760_
				= i_2759_ | anIntArray9459[i] & 0xffffff;
			    aClass119_9489.method2166
				(bool, bool_2739_, bool_2740_,
				 aFloatArray9496[i_2742_],
				 aFloatArray9496[i_2743_],
				 aFloatArray9496[i_2744_],
				 aFloatArray9503[i_2742_],
				 aFloatArray9503[i_2743_],
				 aFloatArray9503[i_2744_],
				 aFloatArray9505[i_2742_],
				 aFloatArray9505[i_2743_],
				 aFloatArray9505[i_2744_],
				 aFloatArray9506[i_2742_],
				 aFloatArray9506[i_2743_],
				 aFloatArray9506[i_2744_],
				 aFloatArrayArray9452[i][0],
				 aFloatArrayArray9452[i][1],
				 aFloatArrayArray9452[i][2],
				 aFloatArrayArray9429[i][0],
				 aFloatArrayArray9429[i][1],
				 aFloatArrayArray9429[i][2], i_2760_, i_2760_,
				 i_2760_,
				 aClass101_9437.anInt1206 * 1046269871,
				 f_2755_ * 255.0F, f_2756_ * 255.0F,
				 f_2757_ * 255.0F,
				 aShortArray9428[i] & 0xffff);
			} else
			    aClass119_9489.method2166
				(bool, bool_2739_, bool_2740_,
				 aFloatArray9496[i_2742_],
				 aFloatArray9496[i_2743_],
				 aFloatArray9496[i_2744_],
				 aFloatArray9503[i_2742_],
				 aFloatArray9503[i_2743_],
				 aFloatArray9503[i_2744_],
				 aFloatArray9505[i_2742_],
				 aFloatArray9505[i_2743_],
				 aFloatArray9505[i_2744_],
				 aFloatArray9506[i_2742_],
				 aFloatArray9506[i_2743_],
				 aFloatArray9506[i_2744_],
				 aFloatArrayArray9452[i][0],
				 aFloatArrayArray9452[i][1],
				 aFloatArrayArray9452[i][2],
				 aFloatArrayArray9429[i][0],
				 aFloatArrayArray9429[i][1],
				 aFloatArrayArray9429[i][2],
				 i_2759_ | anIntArray9459[i] & 0xffffff,
				 i_2759_ | anIntArray9460[i] & 0xffffff,
				 i_2759_ | anIntArray9461[i] & 0xffffff,
				 aClass101_9437.anInt1206 * 1046269871,
				 f_2755_ * 255.0F, f_2756_ * 255.0F,
				 f_2757_ * 255.0F,
				 aShortArray9428[i] & 0xffff);
		    }
		}
	    }
	} else {
	    short i_2761_ = aShortArray9479[i];
	    short i_2762_ = aShortArray9455[i];
	    short i_2763_ = aShortArray9456[i];
	    float f = 0.0F;
	    float f_2764_ = 0.0F;
	    float f_2765_ = 0.0F;
	    if (anIntArray9502[i_2761_]
		> aClass101_9437.anInt1210 * -1240216431)
		f = 1.0F;
	    else if (anIntArray9502[i_2761_]
		     > aClass101_9437.anInt1209 * 391389271)
		f = ((float) (aClass101_9437.anInt1209 * 391389271
			      - anIntArray9502[i_2761_])
		     * 1.0F
		     / (float) (aClass101_9437.anInt1209 * 391389271
				- aClass101_9437.anInt1210 * -1240216431));
	    if (anIntArray9502[i_2762_]
		> aClass101_9437.anInt1210 * -1240216431)
		f_2764_ = 1.0F;
	    else if (anIntArray9502[i_2762_]
		     > aClass101_9437.anInt1209 * 391389271)
		f_2764_
		    = ((float) (aClass101_9437.anInt1209 * 391389271
				- anIntArray9502[i_2762_])
		       * 1.0F
		       / (float) (aClass101_9437.anInt1209 * 391389271
				  - aClass101_9437.anInt1210 * -1240216431));
	    if (anIntArray9502[i_2763_]
		> aClass101_9437.anInt1210 * -1240216431)
		f_2765_ = 1.0F;
	    else if (anIntArray9502[i_2763_]
		     > aClass101_9437.anInt1209 * 391389271)
		f_2765_
		    = ((float) (aClass101_9437.anInt1209 * 391389271
				- anIntArray9502[i_2763_])
		       * 1.0F
		       / (float) (aClass101_9437.anInt1209 * 391389271
				  - aClass101_9437.anInt1210 * -1240216431));
	    if (aByteArray9469 == null)
		aClass119_9489.anInt1447 = 0;
	    else
		aClass119_9489.anInt1447 = aByteArray9469[i] & 0xff;
	    if (!bool_2741_) {
		if (anIntArray9461[i] == -1)
		    aClass119_9489.method2141
			(bool, bool_2739_, bool_2740_,
			 aFloatArray9496[i_2761_], aFloatArray9496[i_2762_],
			 aFloatArray9496[i_2763_], aFloatArray9503[i_2761_],
			 aFloatArray9503[i_2762_], aFloatArray9503[i_2763_],
			 aFloatArray9505[i_2761_], aFloatArray9505[i_2762_],
			 aFloatArray9505[i_2763_],
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9459[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f * 255.0F, (byte) -98),
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9459[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f_2764_ * 255.0F, (byte) 45),
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9459[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f_2765_ * 255.0F, (byte) -28));
		else
		    aClass119_9489.method2141
			(bool, bool_2739_, bool_2740_,
			 aFloatArray9496[i_2761_], aFloatArray9496[i_2762_],
			 aFloatArray9496[i_2763_], aFloatArray9503[i_2761_],
			 aFloatArray9503[i_2762_], aFloatArray9503[i_2763_],
			 aFloatArray9505[i_2761_], aFloatArray9505[i_2762_],
			 aFloatArray9505[i_2763_],
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9459[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f * 255.0F, (byte) -17),
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9460[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f_2764_ * 255.0F, (byte) -29),
			 Class69.method1396((Class415.anIntArray4666
					     [anIntArray9461[i] & 0xffff]),
					    (aClass101_9437.anInt1206
					     * 1046269871),
					    f_2765_ * 255.0F, (byte) -90));
	    } else {
		int i_2766_ = -16777216;
		if (aByteArray9469 != null)
		    i_2766_ = 255 - (aByteArray9469[i] & 0xff) << 24;
		if (anIntArray9461[i] == -1) {
		    int i_2767_ = i_2766_ | anIntArray9459[i] & 0xffffff;
		    aClass119_9489.method2166
			(bool, bool_2739_, bool_2740_,
			 aFloatArray9496[i_2761_], aFloatArray9496[i_2762_],
			 aFloatArray9496[i_2763_], aFloatArray9503[i_2761_],
			 aFloatArray9503[i_2762_], aFloatArray9503[i_2763_],
			 aFloatArray9505[i_2761_], aFloatArray9505[i_2762_],
			 aFloatArray9505[i_2763_], aFloatArray9506[i_2761_],
			 aFloatArray9506[i_2762_], aFloatArray9506[i_2763_],
			 aFloatArrayArray9452[i][0],
			 aFloatArrayArray9452[i][1],
			 aFloatArrayArray9452[i][2],
			 aFloatArrayArray9429[i][0],
			 aFloatArrayArray9429[i][1],
			 aFloatArrayArray9429[i][2], i_2767_, i_2767_, i_2767_,
			 aClass101_9437.anInt1206 * 1046269871, f * 255.0F,
			 f_2764_ * 255.0F, f_2765_ * 255.0F,
			 aShortArray9428[i] & 0xffff);
		} else
		    aClass119_9489.method2166
			(bool, bool_2739_, bool_2740_,
			 aFloatArray9496[i_2761_], aFloatArray9496[i_2762_],
			 aFloatArray9496[i_2763_], aFloatArray9503[i_2761_],
			 aFloatArray9503[i_2762_], aFloatArray9503[i_2763_],
			 aFloatArray9505[i_2761_], aFloatArray9505[i_2762_],
			 aFloatArray9505[i_2763_], aFloatArray9506[i_2761_],
			 aFloatArray9506[i_2762_], aFloatArray9506[i_2763_],
			 aFloatArrayArray9452[i][0],
			 aFloatArrayArray9452[i][1],
			 aFloatArrayArray9452[i][2],
			 aFloatArrayArray9429[i][0],
			 aFloatArrayArray9429[i][1],
			 aFloatArrayArray9429[i][2],
			 i_2766_ | anIntArray9459[i] & 0xffffff,
			 i_2766_ | anIntArray9460[i] & 0xffffff,
			 i_2766_ | anIntArray9461[i] & 0xffffff,
			 aClass101_9437.anInt1206 * 1046269871, f * 255.0F,
			 f_2764_ * 255.0F, f_2765_ * 255.0F,
			 aShortArray9428[i] & 0xffff);
	    }
	}
    }
    
    public boolean method3171() {
	return aBool9499;
    }
    
    void method15175(Class101 class101) {
	aClass119_9489 = class101.aClass119_1233;
	if (class101 != aClass101_9437) {
	    aClass101_9437 = class101;
	    anIntArray9502 = aClass101_9437.anIntArray1214;
	    aFloatArray9503 = aClass101_9437.aFloatArray1235;
	    aFloatArray9496 = aClass101_9437.aFloatArray1220;
	    aFloatArray9505 = aClass101_9437.aFloatArray1221;
	    aFloatArray9506 = aClass101_9437.aFloatArray1222;
	    anIntArray9507 = aClass101_9437.anIntArray1240;
	    anIntArray9480 = aClass101_9437.anIntArray1216;
	    anIntArray9509 = aClass101_9437.anIntArray1218;
	    anIntArray9510 = aClass101_9437.anIntArray1201;
	    anIntArray9511 = aClass101_9437.anIntArray1227;
	    anIntArray9442 = aClass101_9437.anIntArray1228;
	}
    }
    
    public boolean method3173() {
	return aBool9499;
    }
    
    public boolean method3174() {
	return aBool9500;
    }
    
    public void method3113(Class446 class446) {
	method15091(aClass185_Sub2_9475.method15011(Thread.currentThread()));
	Class433 class433 = aClass101_9437.aClass433_1224;
	class433.method6916(class446);
	if (aClass172Array9482 != null) {
	    for (int i = 0; i < aClass172Array9482.length; i++) {
		Class172 class172 = aClass172Array9482[i];
		Class172 class172_2768_ = class172;
		if (class172.aClass172_1809 != null)
		    class172_2768_ = class172.aClass172_1809;
		class172_2768_.anInt1815
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9494[(class172.anInt1814
							    * 1404619919)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9447
					       [(class172.anInt1814
						 * 1404619919)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9448
					       [(class172.anInt1814
						 * 1404619919)]))))
		       * -697779603);
		class172_2768_.anInt1823
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9494
					    [class172.anInt1814 * 1404619919]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9447[(class172.anInt1814
							     * 1404619919)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9448
					      [(class172.anInt1814
						* 1404619919)])))) * 880720549;
		class172_2768_.anInt1817
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9494[(class172.anInt1814
							    * 1404619919)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9447
					       [(class172.anInt1814
						 * 1404619919)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9448
					       [(class172.anInt1814
						 * 1404619919)]))))
		       * -487629419);
		class172_2768_.anInt1818
		    = (int) (class433.aFloatArray4853[12]
			     + ((class433.aFloatArray4853[0]
				 * (float) (anIntArray9494
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[4]
				   * (float) anIntArray9447[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[8]
				   * (float) (anIntArray9448
					      [(class172.anInt1812
						* 496404005)])))) * 1861716229;
		class172_2768_.anInt1808
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9494
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9447[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9448
					      [(class172.anInt1812
						* 496404005)])))) * 968631629;
		class172_2768_.anInt1819
		    = (int) (class433.aFloatArray4853[14]
			     + ((class433.aFloatArray4853[2]
				 * (float) (anIntArray9494
					    [class172.anInt1812 * 496404005]))
				+ (class433.aFloatArray4853[6]
				   * (float) anIntArray9447[(class172.anInt1812
							     * 496404005)])
				+ (class433.aFloatArray4853[10]
				   * (float) (anIntArray9448
					      [(class172.anInt1812
						* 496404005)])))) * -337212495;
		class172_2768_.anInt1821
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9494[(class172.anInt1813
							    * 1123614299)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9447
					       [(class172.anInt1813
						 * 1123614299)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9448
					       [(class172.anInt1813
						 * 1123614299)]))))
		       * -289878931);
		class172_2768_.anInt1822
		    = (int) (class433.aFloatArray4853[13]
			     + ((class433.aFloatArray4853[1]
				 * (float) (anIntArray9494
					    [class172.anInt1813 * 1123614299]))
				+ (class433.aFloatArray4853[5]
				   * (float) anIntArray9447[(class172.anInt1813
							     * 1123614299)])
				+ (class433.aFloatArray4853[9]
				   * (float) (anIntArray9448
					      [(class172.anInt1813
						* 1123614299)])))) * 286740539;
		class172_2768_.anInt1820
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9494[(class172.anInt1813
							    * 1123614299)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9447
					       [(class172.anInt1813
						 * 1123614299)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9448
					       [(class172.anInt1813
						 * 1123614299)]))))
		       * -2010684097);
	    }
	}
	if (aClass158Array9483 != null) {
	    for (int i = 0; i < aClass158Array9483.length; i++) {
		Class158 class158 = aClass158Array9483[i];
		Class158 class158_2769_ = class158;
		if (class158.aClass158_1748 != null)
		    class158_2769_ = class158.aClass158_1748;
		if (class158.aClass433_1747 != null)
		    class158.aClass433_1747.method6842(class433);
		else
		    class158.aClass433_1747 = new Class433(class433);
		class158_2769_.anInt1750
		    = ((int) (class433.aFloatArray4853[12]
			      + ((class433.aFloatArray4853[0]
				  * (float) anIntArray9494[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[4]
				    * (float) (anIntArray9447
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[8]
				    * (float) (anIntArray9448
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * 1976103833);
		class158_2769_.anInt1751
		    = ((int) (class433.aFloatArray4853[13]
			      + ((class433.aFloatArray4853[1]
				  * (float) anIntArray9494[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[5]
				    * (float) (anIntArray9447
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[9]
				    * (float) (anIntArray9448
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * 1216251817);
		class158_2769_.anInt1749
		    = ((int) (class433.aFloatArray4853[14]
			      + ((class433.aFloatArray4853[2]
				  * (float) anIntArray9494[(class158.anInt1753
							    * -1634673991)])
				 + (class433.aFloatArray4853[6]
				    * (float) (anIntArray9447
					       [(class158.anInt1753
						 * -1634673991)]))
				 + (class433.aFloatArray4853[10]
				    * (float) (anIntArray9448
					       [(class158.anInt1753
						 * -1634673991)]))))
		       * -1645064349);
	    }
	}
    }
    
    public int method3019() {
	return anInt9441;
    }
    
    public void method3103(int i) {
	if ((anInt9441 & 0x2000) != 8192)
	    throw new IllegalStateException();
	anInt9443 = i;
	anInt9432 = 0;
    }
    
    public void method3178(int i, int i_2770_, int i_2771_) {
	if (i != 0 && (anInt9441 & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_2770_ != 0 && (anInt9441 & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_2771_ != 0 && (anInt9441 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_2772_ = 0; i_2772_ < anInt9444; i_2772_++) {
		anIntArray9494[i_2772_] += i;
		anIntArray9447[i_2772_] += i_2770_;
		anIntArray9448[i_2772_] += i_2771_;
	    }
	}
    }
    
    public void method3153(int i, int i_2773_, int i_2774_) {
	if (i != 0 && (anInt9441 & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_2773_ != 0 && (anInt9441 & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_2774_ != 0 && (anInt9441 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_2775_ = 0; i_2775_ < anInt9444; i_2775_++) {
		anIntArray9494[i_2775_] += i;
		anIntArray9447[i_2775_] += i_2773_;
		anIntArray9448[i_2775_] += i_2774_;
	    }
	}
    }
    
    void method15176() {
	synchronized (this) {
	    for (int i = 0; i < anInt9474; i++) {
		int i_2776_ = anIntArray9494[i];
		anIntArray9494[i] = anIntArray9448[i];
		anIntArray9448[i] = -i_2776_;
		if (aClass96Array9450[i] != null) {
		    i_2776_ = aClass96Array9450[i].anInt1159;
		    aClass96Array9450[i].anInt1159
			= aClass96Array9450[i].anInt1156;
		    aClass96Array9450[i].anInt1156 = -i_2776_;
		}
	    }
	    if (aClass107Array9466 != null) {
		for (int i = 0; i < anInt9440; i++) {
		    if (aClass107Array9466[i] != null) {
			int i_2777_ = aClass107Array9466[i].anInt1315;
			aClass107Array9466[i].anInt1315
			    = aClass107Array9466[i].anInt1313;
			aClass107Array9466[i].anInt1313 = -i_2777_;
		    }
		}
	    }
	    for (int i = anInt9474; i < anInt9444; i++) {
		int i_2778_ = anIntArray9494[i];
		anIntArray9494[i] = anIntArray9448[i];
		anIntArray9448[i] = -i_2778_;
	    }
	    anInt9432 = 0;
	    aBool9488 = false;
	}
    }
    
    public void method3056(short i, short i_2779_) {
	for (int i_2780_ = 0; i_2780_ < anInt9440; i_2780_++) {
	    if (aShortArray9471[i_2780_] == i)
		aShortArray9471[i_2780_] = i_2779_;
	}
	if (aClass118Array9485 != null) {
	    for (int i_2781_ = 0; i_2781_ < anInt9484; i_2781_++) {
		Class118 class118 = aClass118Array9485[i_2781_];
		Class117 class117 = aClass117Array9486[i_2781_];
		class117.anInt1411
		    = (class117.anInt1411 * -150900843 & ~0xffffff
		       | ((Class415.anIntArray4666
			   [Class315.method5705((aShortArray9471
						 [(class118.anInt1418
						   * 2118166057)]),
						1541419413) & 0xffff])
			  & 0xffffff)) * 874668989;
	    }
	}
	if (anInt9432 == 2)
	    anInt9432 = 1;
    }
    
    void method3182() {
	if (aClass185_Sub2_9475.anInt9367 * 442227785 > 1) {
	    synchronized (this) {
		while (aBool1973) {
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		aBool1973 = true;
	    }
	}
    }
    
    void method3057() {
	if (aClass185_Sub2_9475.anInt9367 * 442227785 > 1) {
	    synchronized (this) {
		aBool1973 = false;
		this.notifyAll();
	    }
	}
    }
    
    void method3185() {
	if (aClass185_Sub2_9475.anInt9367 * 442227785 > 1) {
	    synchronized (this) {
		aBool1973 = false;
		this.notifyAll();
	    }
	}
    }
    
    public int method3078() {
	if (!aBool9488)
	    method15173();
	return aShort9473;
    }
}
