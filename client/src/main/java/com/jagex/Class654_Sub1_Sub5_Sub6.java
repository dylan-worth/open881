/* Class654_Sub1_Sub5_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class654_Sub1_Sub5_Sub6 extends Class654_Sub1_Sub5
{
    public int anInt12170;
    int anInt12171;
    int anInt12172;
    public int anInt12173;
    double aDouble12174;
    Class629 aClass629_12175;
    boolean aBool12176 = false;
    int anInt12177;
    public int anInt12178;
    int anInt12179;
    boolean aBool12180;
    int anInt12181;
    double aDouble12182;
    double aDouble12183;
    double aDouble12184;
    double aDouble12185;
    int anInt12186;
    Class711 aClass711_12187;
    int anInt12188 = 0;
    boolean aBool12189 = false;
    public int anInt12190;
    int anInt12191;
    
    Class183 method18798(Class185 class185, int i, int i_0_) {
	Class684 class684
	    = ((Class684)
	       Class55.aClass44_Sub4_447.method91(1106351395 * anInt12191,
						  -3376321));
	return class684.method13928(class185, i, aClass711_12187, (byte) 2,
				    (byte) 45);
    }
    
    boolean method16850(int i) {
	return aBool12189;
    }
    
    final void method16845() {
	throw new IllegalStateException();
    }
    
    public int method16876(int i) {
	return 1350134781 * anInt12188;
    }
    
    public Class654_Sub1_Sub5_Sub6
	(Class556 class556, int i, int i_1_, int i_2_, int i_3_, int i_4_,
	 int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_,
	 int i_11_, int i_12_, boolean bool, int i_13_, int i_14_) {
	super(class556, i_1_, i_2_, i_3_,
	      Class247.method4595(i_3_, i_4_, i_1_, 412549935) - i_5_, i_4_,
	      i_3_ >> 9, i_3_ >> 9, i_4_ >> 9, i_4_ >> 9, false, (byte) 0);
	anInt12181 = 0;
	anInt12191 = -1179958645 * i;
	anInt12173 = -1661877011 * i_6_;
	anInt12170 = -293127099 * i_7_;
	anInt12172 = i_8_ * 942717199;
	anInt12186 = i_9_ * 263697635;
	anInt12177 = -1593093447 * i_10_;
	anInt12178 = -1550276443 * i_11_;
	anInt12171 = -1353423419 * i_5_;
	anInt12190 = i_12_ * -220497585;
	aBool12180 = bool;
	aBool12176 = false;
	anInt12179 = i_13_ * -1445071785;
	anInt12181 = i_14_ * 2022860317;
	int i_15_
	    = (((Class684)
		Class55.aClass44_Sub4_447.method91(anInt12191 * 1106351395,
						   834249260)).anInt8688
	       * -811043807);
	aClass711_12187 = new Class711_Sub3(this, false);
	aClass711_12187.method14330(i_15_, 1267042855);
	method16862(1, -173174738);
    }
    
    public Class564 method16855(Class185 class185, short i) {
	return null;
    }
    
    public final void method18799(int i, int i_16_, int i_17_, int i_18_,
				  int i_19_) {
	Class438 class438 = Class438.method6994(method10807().aClass438_4885);
	if (!aBool12176) {
	    float f = (float) i - class438.aFloat4864;
	    float f_20_ = (float) i_16_ - class438.aFloat4865;
	    float f_21_ = (float) Math.sqrt((double) (f_20_ * f_20_ + f * f));
	    if (f_21_ != 0.0F) {
		class438.aFloat4864
		    += f * (float) (1078145227 * anInt12186) / f_21_;
		class438.aFloat4865
		    += (float) (anInt12186 * 1078145227) * f_20_ / f_21_;
	    }
	    if (aBool12180)
		class438.aFloat4863
		    = (float) (Class247.method4595((int) class438.aFloat4864,
						   (int) class438.aFloat4865,
						   aByte10854, -361996941)
			       - -164769523 * anInt12171);
	    method10809(class438);
	}
	double d = (double) (1 + 1150056077 * anInt12170 - i_18_);
	aDouble12182 = (double) ((float) i - class438.aFloat4864) / d;
	aDouble12183 = (double) ((float) i_16_ - class438.aFloat4865) / d;
	aDouble12184 = Math.sqrt(aDouble12182 * aDouble12182
				 + aDouble12183 * aDouble12183);
	if (anInt12172 * 224073199 != -1) {
	    if (!aBool12176)
		aDouble12185 = -aDouble12184 * Math.tan((double) (anInt12172
								  * 224073199)
							* 0.02454369);
	    aDouble12174 = ((double) ((float) i_17_ - class438.aFloat4863)
			    - aDouble12185 * d) * 2.0 / (d * d);
	} else
	    aDouble12185 = (double) ((float) i_17_ - class438.aFloat4863) / d;
	class438.method7074();
    }
    
    public void method18800(byte i) {
	if (!aBool12176) {
	    if (anInt12177 * -441117815 != 0) {
		Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1 = null;
		if (-1468443459 * client.anInt11155 == 3)
		    class654_sub1_sub5_sub1 = Class65.aClass192Array712
						  [-441117815 * anInt12177 - 1]
						  .method3775(2088438307);
		else if (-441117815 * anInt12177 < 0) {
		    int i_22_ = -(anInt12177 * -441117815) - 1;
		    if (i_22_ == client.anInt11037 * -643758853)
			class654_sub1_sub5_sub1
			    = Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419;
		    else
			class654_sub1_sub5_sub1
			    = (client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279
			       [i_22_]);
		} else {
		    int i_23_ = anInt12177 * -441117815 - 1;
		    Class534_Sub6 class534_sub6
			= ((Class534_Sub6)
			   client.aClass9_11331.method579((long) i_23_));
		    if (class534_sub6 != null)
			class654_sub1_sub5_sub1
			    = ((Class654_Sub1_Sub5_Sub1)
			       class534_sub6.anObject10417);
		}
		if (class654_sub1_sub5_sub1 != null) {
		    Class438 class438
			= class654_sub1_sub5_sub1.method10807().aClass438_4885;
		    method10815(class438.aFloat4864,
				(float) ((Class247.method4595
					  ((int) class438.aFloat4864,
					   (int) class438.aFloat4865,
					   aByte10854, 1221753755))
					 - -164769523 * anInt12171),
				class438.aFloat4865);
		    if (149698407 * anInt12179 >= 0) {
			Class570 class570
			    = class654_sub1_sub5_sub1.method18531((byte) -124);
			int i_24_ = 0;
			int i_25_ = 0;
			if (class570.anIntArrayArray7648 != null
			    && null != (class570.anIntArrayArray7648
					[149698407 * anInt12179])) {
			    i_24_ += (class570.anIntArrayArray7648
				      [149698407 * anInt12179][0]);
			    i_25_ += (class570.anIntArrayArray7648
				      [149698407 * anInt12179][2]);
			}
			if (class570.anIntArrayArray7649 != null
			    && (class570.anIntArrayArray7649
				[anInt12179 * 149698407]) != null) {
			    i_24_ += (class570.anIntArrayArray7649
				      [anInt12179 * 149698407][0]);
			    i_25_ += (class570.anIntArrayArray7649
				      [149698407 * anInt12179][2]);
			}
			if (0 != i_24_ || i_25_ != 0) {
			    int i_26_ = class654_sub1_sub5_sub1
					    .aClass57_11973
					    .method1231(349980849);
			    int i_27_ = i_26_;
			    if (null != class654_sub1_sub5_sub1.anIntArray11920
				&& (class654_sub1_sub5_sub1.anIntArray11920
				    [149698407 * anInt12179]) != -1)
				i_27_
				    = (class654_sub1_sub5_sub1.anIntArray11920
				       [anInt12179 * 149698407]);
			    int i_28_ = i_27_ - i_26_ & 0x3fff;
			    int i_29_ = Class427.anIntArray4806[i_28_];
			    int i_30_ = Class427.anIntArray4805[i_28_];
			    int i_31_ = i_29_ * i_25_ + i_24_ * i_30_ >> 14;
			    i_25_ = i_30_ * i_25_ - i_24_ * i_29_ >> 14;
			    i_24_ = i_31_;
			    Class438 class438_32_
				= Class438.method6994(method10807()
						      .aClass438_4885);
			    class438_32_.aFloat4864 += (float) i_24_;
			    class438_32_.aFloat4865 += (float) i_25_;
			    method10809(class438_32_);
			    class438_32_.method7074();
			}
		    }
		}
	    }
	}
    }
    
    public final void method18801(int i, byte i_33_) {
	aBool12176 = true;
	Class444 class444 = new Class444(method10807());
	class444.aClass438_4885.aFloat4864 += aDouble12182 * (double) i;
	class444.aClass438_4885.aFloat4865 += (double) i * aDouble12183;
	if (aBool12180)
	    class444.aClass438_4885.aFloat4863
		= (float) (Class247.method4595((int) (class444.aClass438_4885
						      .aFloat4864),
					       (int) (class444.aClass438_4885
						      .aFloat4865),
					       aByte10854, -1726885594)
			   - anInt12171 * -164769523);
	else if (-1 != anInt12172 * 224073199) {
	    class444.aClass438_4885.aFloat4863
		+= ((double) i * (aDouble12174 * 0.5 * (double) i)
		    + aDouble12185 * (double) i);
	    aDouble12185 += aDouble12174 * (double) i;
	} else
	    class444.aClass438_4885.aFloat4863 += (double) i * aDouble12185;
	class444.aClass443_4886.method7147(1.0F, 0.0F, 0.0F,
					   (float) Math.atan2(aDouble12185,
							      aDouble12184));
	Class443 class443 = Class443.method7137();
	class443.method7147(0.0F, 1.0F, 0.0F,
			    ((float) Math.atan2(aDouble12182, aDouble12183)
			     - 3.1415927F));
	class444.aClass443_4886.method7158(class443);
	class443.method7140();
	method10816(class444);
	if (aClass711_12187.method14393(1, (byte) 1)
	    && aClass711_12187.method14343((byte) 1))
	    aClass711_12187.method14374(-1149066581);
    }
    
    public void method18802(int i) {
	if (aClass629_12175 != null)
	    aClass629_12175.method10389();
    }
    
    Class550 method16853(Class185 class185, int i) {
	Class183 class183 = method18798(class185, 2048, -1788573133);
	if (null == class183)
	    return null;
	Class446 class446 = method10834();
	method18819(class185, class183, class446, -773406288);
	Class550 class550 = Class322.method5779(false, -766380685);
	class183.method3034(class446, aClass194Array10852[0], 0);
	if (null != aClass629_12175) {
	    Class174 class174 = aClass629_12175.method10405();
	    class185.method3334(class174);
	}
	aBool12189 = class183.method3027();
	class183.method3042();
	anInt12188 = class183.method3045() * -1028372139;
	return class550;
    }
    
    void method16868(Class185 class185, int i) {
	Class183 class183 = method18798(class185, 0, -797030437);
	if (class183 != null) {
	    Class446 class446 = method10834();
	    anInt12188 = class183.method3045() * -1028372139;
	    class183.method3042();
	    method18819(class185, class183, class446, -773406288);
	}
    }
    
    void method18486() {
	Class438 class438 = method10807().aClass438_4885;
	aShort11900 = aShort11896
	    = (short) (int) (class438.aFloat4864 / 512.0F);
	aShort11901 = aShort11898
	    = (short) (int) (class438.aFloat4865 / 512.0F);
    }
    
    public void method18803() {
	if (aClass629_12175 != null)
	    aClass629_12175.method10389();
    }
    
    boolean method16846(Class185 class185, int i, int i_34_, byte i_35_) {
	return false;
    }
    
    final boolean method16848(byte i) {
	return false;
    }
    
    boolean method16849(int i) {
	return false;
    }
    
    final void method16851(Class185 class185, Class654_Sub1 class654_sub1,
			   int i, int i_36_, int i_37_, boolean bool,
			   int i_38_) {
	throw new IllegalStateException();
    }
    
    final void method16852(int i) {
	throw new IllegalStateException();
    }
    
    public int method16867() {
	return 1350134781 * anInt12188;
    }
    
    boolean method16864() {
	return false;
    }
    
    boolean method16879() {
	return aBool12189;
    }
    
    boolean method16869() {
	return aBool12189;
    }
    
    boolean method16895() {
	return false;
    }
    
    public int method16866() {
	return 1350134781 * anInt12188;
    }
    
    public Class564 method16872(Class185 class185) {
	return null;
    }
    
    public final void method18804(int i, int i_39_, int i_40_, int i_41_) {
	Class438 class438 = Class438.method6994(method10807().aClass438_4885);
	if (!aBool12176) {
	    float f = (float) i - class438.aFloat4864;
	    float f_42_ = (float) i_39_ - class438.aFloat4865;
	    float f_43_ = (float) Math.sqrt((double) (f_42_ * f_42_ + f * f));
	    if (f_43_ != 0.0F) {
		class438.aFloat4864
		    += f * (float) (1078145227 * anInt12186) / f_43_;
		class438.aFloat4865
		    += (float) (anInt12186 * 1078145227) * f_42_ / f_43_;
	    }
	    if (aBool12180)
		class438.aFloat4863
		    = (float) (Class247.method4595((int) class438.aFloat4864,
						   (int) class438.aFloat4865,
						   aByte10854, -529931702)
			       - -164769523 * anInt12171);
	    method10809(class438);
	}
	double d = (double) (1 + 1150056077 * anInt12170 - i_41_);
	aDouble12182 = (double) ((float) i - class438.aFloat4864) / d;
	aDouble12183 = (double) ((float) i_39_ - class438.aFloat4865) / d;
	aDouble12184 = Math.sqrt(aDouble12182 * aDouble12182
				 + aDouble12183 * aDouble12183);
	if (anInt12172 * 224073199 != -1) {
	    if (!aBool12176)
		aDouble12185 = -aDouble12184 * Math.tan((double) (anInt12172
								  * 224073199)
							* 0.02454369);
	    aDouble12174 = ((double) ((float) i_40_ - class438.aFloat4863)
			    - aDouble12185 * d) * 2.0 / (d * d);
	} else
	    aDouble12185 = (double) ((float) i_40_ - class438.aFloat4863) / d;
	class438.method7074();
    }
    
    void method16871(Class185 class185) {
	Class183 class183 = method18798(class185, 0, -1334124413);
	if (class183 != null) {
	    Class446 class446 = method10834();
	    anInt12188 = class183.method3045() * -1028372139;
	    class183.method3042();
	    method18819(class185, class183, class446, -773406288);
	}
    }
    
    public Class564 method16870(Class185 class185) {
	return null;
    }
    
    boolean method16873(Class185 class185, int i, int i_44_) {
	return false;
    }
    
    boolean method16874(Class185 class185, int i, int i_45_) {
	return false;
    }
    
    final void method16877(Class185 class185, Class654_Sub1 class654_sub1,
			   int i, int i_46_, int i_47_, boolean bool) {
	throw new IllegalStateException();
    }
    
    final boolean method16861() {
	return false;
    }
    
    final void method16883(Class185 class185, Class654_Sub1 class654_sub1,
			   int i, int i_48_, int i_49_, boolean bool) {
	throw new IllegalStateException();
    }
    
    boolean method16880(Class185 class185, int i, int i_50_) {
	return false;
    }
    
    Class183 method18805(Class185 class185, int i) {
	Class684 class684
	    = ((Class684)
	       Class55.aClass44_Sub4_447.method91(1106351395 * anInt12191,
						  -1952506673));
	return class684.method13928(class185, i, aClass711_12187, (byte) 2,
				    (byte) 125);
    }
    
    final void method16865() {
	throw new IllegalStateException();
    }
    
    final void method16881() {
	throw new IllegalStateException();
    }
    
    void method18483() {
	Class438 class438 = method10807().aClass438_4885;
	aShort11900 = aShort11896
	    = (short) (int) (class438.aFloat4864 / 512.0F);
	aShort11901 = aShort11898
	    = (short) (int) (class438.aFloat4865 / 512.0F);
    }
    
    void method18484() {
	Class438 class438 = method10807().aClass438_4885;
	aShort11900 = aShort11896
	    = (short) (int) (class438.aFloat4864 / 512.0F);
	aShort11901 = aShort11898
	    = (short) (int) (class438.aFloat4865 / 512.0F);
    }
    
    public void method18806() {
	if (aClass629_12175 != null)
	    aClass629_12175.method10389();
    }
    
    void method18482() {
	Class438 class438 = method10807().aClass438_4885;
	aShort11900 = aShort11896
	    = (short) (int) (class438.aFloat4864 / 512.0F);
	aShort11901 = aShort11898
	    = (short) (int) (class438.aFloat4865 / 512.0F);
    }
    
    void method18485() {
	Class438 class438 = method10807().aClass438_4885;
	aShort11900 = aShort11896
	    = (short) (int) (class438.aFloat4864 / 512.0F);
	aShort11901 = aShort11898
	    = (short) (int) (class438.aFloat4865 / 512.0F);
    }
    
    Class550 method16884(Class185 class185) {
	Class183 class183 = method18798(class185, 2048, -864073904);
	if (null == class183)
	    return null;
	Class446 class446 = method10834();
	method18819(class185, class183, class446, -773406288);
	Class550 class550 = Class322.method5779(false, 1338139686);
	class183.method3034(class446, aClass194Array10852[0], 0);
	if (null != aClass629_12175) {
	    Class174 class174 = aClass629_12175.method10405();
	    class185.method3334(class174);
	}
	aBool12189 = class183.method3027();
	class183.method3042();
	anInt12188 = class183.method3045() * -1028372139;
	return class550;
    }
    
    public int method18807() {
	return 1710066741 * anInt12181;
    }
    
    public final void method18808(int i, int i_51_, int i_52_, int i_53_) {
	Class438 class438 = Class438.method6994(method10807().aClass438_4885);
	if (!aBool12176) {
	    float f = (float) i - class438.aFloat4864;
	    float f_54_ = (float) i_51_ - class438.aFloat4865;
	    float f_55_ = (float) Math.sqrt((double) (f_54_ * f_54_ + f * f));
	    if (f_55_ != 0.0F) {
		class438.aFloat4864
		    += f * (float) (1078145227 * anInt12186) / f_55_;
		class438.aFloat4865
		    += (float) (anInt12186 * 1078145227) * f_54_ / f_55_;
	    }
	    if (aBool12180)
		class438.aFloat4863
		    = (float) (Class247.method4595((int) class438.aFloat4864,
						   (int) class438.aFloat4865,
						   aByte10854, -986321194)
			       - -164769523 * anInt12171);
	    method10809(class438);
	}
	double d = (double) (1 + 1150056077 * anInt12170 - i_53_);
	aDouble12182 = (double) ((float) i - class438.aFloat4864) / d;
	aDouble12183 = (double) ((float) i_51_ - class438.aFloat4865) / d;
	aDouble12184 = Math.sqrt(aDouble12182 * aDouble12182
				 + aDouble12183 * aDouble12183);
	if (anInt12172 * 224073199 != -1) {
	    if (!aBool12176)
		aDouble12185 = -aDouble12184 * Math.tan((double) (anInt12172
								  * 224073199)
							* 0.02454369);
	    aDouble12174 = ((double) ((float) i_52_ - class438.aFloat4863)
			    - aDouble12185 * d) * 2.0 / (d * d);
	} else
	    aDouble12185 = (double) ((float) i_52_ - class438.aFloat4863) / d;
	class438.method7074();
    }
    
    void method18809(Class185 class185, Class183 class183, Class446 class446) {
	class183.method3073(class446);
	Class172[] class172s = class183.method3168();
	Class158[] class158s = class183.method3065();
	if ((aClass629_12175 == null || aClass629_12175.aBool8189)
	    && (class172s != null || class158s != null))
	    aClass629_12175 = Class629.method10422(client.anInt11101, true);
	if (aClass629_12175 != null) {
	    aClass629_12175.method10393(class185, (long) client.anInt11101,
					class172s, class158s, false);
	    aClass629_12175.method10396(aByte10854, aShort11900, aShort11896,
					aShort11901, aShort11898);
	}
    }
    
    public final void method18810(int i, int i_56_, int i_57_, int i_58_) {
	Class438 class438 = Class438.method6994(method10807().aClass438_4885);
	if (!aBool12176) {
	    float f = (float) i - class438.aFloat4864;
	    float f_59_ = (float) i_56_ - class438.aFloat4865;
	    float f_60_ = (float) Math.sqrt((double) (f_59_ * f_59_ + f * f));
	    if (f_60_ != 0.0F) {
		class438.aFloat4864
		    += f * (float) (1078145227 * anInt12186) / f_60_;
		class438.aFloat4865
		    += (float) (anInt12186 * 1078145227) * f_59_ / f_60_;
	    }
	    if (aBool12180)
		class438.aFloat4863
		    = (float) (Class247.method4595((int) class438.aFloat4864,
						   (int) class438.aFloat4865,
						   aByte10854, 720062207)
			       - -164769523 * anInt12171);
	    method10809(class438);
	}
	double d = (double) (1 + 1150056077 * anInt12170 - i_58_);
	aDouble12182 = (double) ((float) i - class438.aFloat4864) / d;
	aDouble12183 = (double) ((float) i_56_ - class438.aFloat4865) / d;
	aDouble12184 = Math.sqrt(aDouble12182 * aDouble12182
				 + aDouble12183 * aDouble12183);
	if (anInt12172 * 224073199 != -1) {
	    if (!aBool12176)
		aDouble12185 = -aDouble12184 * Math.tan((double) (anInt12172
								  * 224073199)
							* 0.02454369);
	    aDouble12174 = ((double) ((float) i_57_ - class438.aFloat4863)
			    - aDouble12185 * d) * 2.0 / (d * d);
	} else
	    aDouble12185 = (double) ((float) i_57_ - class438.aFloat4863) / d;
	class438.method7074();
    }
    
    public final void method18811(int i, int i_61_, int i_62_, int i_63_) {
	Class438 class438 = Class438.method6994(method10807().aClass438_4885);
	if (!aBool12176) {
	    float f = (float) i - class438.aFloat4864;
	    float f_64_ = (float) i_61_ - class438.aFloat4865;
	    float f_65_ = (float) Math.sqrt((double) (f_64_ * f_64_ + f * f));
	    if (f_65_ != 0.0F) {
		class438.aFloat4864
		    += f * (float) (1078145227 * anInt12186) / f_65_;
		class438.aFloat4865
		    += (float) (anInt12186 * 1078145227) * f_64_ / f_65_;
	    }
	    if (aBool12180)
		class438.aFloat4863
		    = (float) (Class247.method4595((int) class438.aFloat4864,
						   (int) class438.aFloat4865,
						   aByte10854, -519514776)
			       - -164769523 * anInt12171);
	    method10809(class438);
	}
	double d = (double) (1 + 1150056077 * anInt12170 - i_63_);
	aDouble12182 = (double) ((float) i - class438.aFloat4864) / d;
	aDouble12183 = (double) ((float) i_61_ - class438.aFloat4865) / d;
	aDouble12184 = Math.sqrt(aDouble12182 * aDouble12182
				 + aDouble12183 * aDouble12183);
	if (anInt12172 * 224073199 != -1) {
	    if (!aBool12176)
		aDouble12185 = -aDouble12184 * Math.tan((double) (anInt12172
								  * 224073199)
							* 0.02454369);
	    aDouble12174 = ((double) ((float) i_62_ - class438.aFloat4863)
			    - aDouble12185 * d) * 2.0 / (d * d);
	} else
	    aDouble12185 = (double) ((float) i_62_ - class438.aFloat4863) / d;
	class438.method7074();
    }
    
    void method18487(int i) {
	Class438 class438 = method10807().aClass438_4885;
	aShort11900 = aShort11896
	    = (short) (int) (class438.aFloat4864 / 512.0F);
	aShort11901 = aShort11898
	    = (short) (int) (class438.aFloat4865 / 512.0F);
    }
    
    public void method18812() {
	if (!aBool12176) {
	    if (anInt12177 * -441117815 != 0) {
		Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1 = null;
		if (-1468443459 * client.anInt11155 == 3)
		    class654_sub1_sub5_sub1 = Class65.aClass192Array712
						  [-441117815 * anInt12177 - 1]
						  .method3775(2088438307);
		else if (-441117815 * anInt12177 < 0) {
		    int i = -(anInt12177 * -441117815) - 1;
		    if (i == client.anInt11037 * -643758853)
			class654_sub1_sub5_sub1
			    = Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419;
		    else
			class654_sub1_sub5_sub1
			    = (client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279
			       [i]);
		} else {
		    int i = anInt12177 * -441117815 - 1;
		    Class534_Sub6 class534_sub6
			= ((Class534_Sub6)
			   client.aClass9_11331.method579((long) i));
		    if (class534_sub6 != null)
			class654_sub1_sub5_sub1
			    = ((Class654_Sub1_Sub5_Sub1)
			       class534_sub6.anObject10417);
		}
		if (class654_sub1_sub5_sub1 != null) {
		    Class438 class438
			= class654_sub1_sub5_sub1.method10807().aClass438_4885;
		    method10815(class438.aFloat4864,
				(float) ((Class247.method4595
					  ((int) class438.aFloat4864,
					   (int) class438.aFloat4865,
					   aByte10854, -785993771))
					 - -164769523 * anInt12171),
				class438.aFloat4865);
		    if (149698407 * anInt12179 >= 0) {
			Class570 class570
			    = class654_sub1_sub5_sub1.method18531((byte) -103);
			int i = 0;
			int i_66_ = 0;
			if (class570.anIntArrayArray7648 != null
			    && null != (class570.anIntArrayArray7648
					[149698407 * anInt12179])) {
			    i += (class570.anIntArrayArray7648
				  [149698407 * anInt12179][0]);
			    i_66_ += (class570.anIntArrayArray7648
				      [149698407 * anInt12179][2]);
			}
			if (class570.anIntArrayArray7649 != null
			    && (class570.anIntArrayArray7649
				[anInt12179 * 149698407]) != null) {
			    i += (class570.anIntArrayArray7649
				  [anInt12179 * 149698407][0]);
			    i_66_ += (class570.anIntArrayArray7649
				      [149698407 * anInt12179][2]);
			}
			if (0 != i || i_66_ != 0) {
			    int i_67_ = class654_sub1_sub5_sub1
					    .aClass57_11973
					    .method1231(1634239504);
			    int i_68_ = i_67_;
			    if (null != class654_sub1_sub5_sub1.anIntArray11920
				&& (class654_sub1_sub5_sub1.anIntArray11920
				    [149698407 * anInt12179]) != -1)
				i_68_
				    = (class654_sub1_sub5_sub1.anIntArray11920
				       [anInt12179 * 149698407]);
			    int i_69_ = i_68_ - i_67_ & 0x3fff;
			    int i_70_ = Class427.anIntArray4806[i_69_];
			    int i_71_ = Class427.anIntArray4805[i_69_];
			    int i_72_ = i_70_ * i_66_ + i * i_71_ >> 14;
			    i_66_ = i_71_ * i_66_ - i * i_70_ >> 14;
			    i = i_72_;
			    Class438 class438_73_
				= Class438.method6994(method10807()
						      .aClass438_4885);
			    class438_73_.aFloat4864 += (float) i;
			    class438_73_.aFloat4865 += (float) i_66_;
			    method10809(class438_73_);
			    class438_73_.method7074();
			}
		    }
		}
	    }
	}
    }
    
    public void method18813() {
	if (!aBool12176) {
	    if (anInt12177 * -441117815 != 0) {
		Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1 = null;
		if (-1468443459 * client.anInt11155 == 3)
		    class654_sub1_sub5_sub1 = Class65.aClass192Array712
						  [-441117815 * anInt12177 - 1]
						  .method3775(2088438307);
		else if (-441117815 * anInt12177 < 0) {
		    int i = -(anInt12177 * -441117815) - 1;
		    if (i == client.anInt11037 * -643758853)
			class654_sub1_sub5_sub1
			    = Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419;
		    else
			class654_sub1_sub5_sub1
			    = (client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279
			       [i]);
		} else {
		    int i = anInt12177 * -441117815 - 1;
		    Class534_Sub6 class534_sub6
			= ((Class534_Sub6)
			   client.aClass9_11331.method579((long) i));
		    if (class534_sub6 != null)
			class654_sub1_sub5_sub1
			    = ((Class654_Sub1_Sub5_Sub1)
			       class534_sub6.anObject10417);
		}
		if (class654_sub1_sub5_sub1 != null) {
		    Class438 class438
			= class654_sub1_sub5_sub1.method10807().aClass438_4885;
		    method10815(class438.aFloat4864,
				(float) ((Class247.method4595
					  ((int) class438.aFloat4864,
					   (int) class438.aFloat4865,
					   aByte10854, -320970459))
					 - -164769523 * anInt12171),
				class438.aFloat4865);
		    if (149698407 * anInt12179 >= 0) {
			Class570 class570
			    = class654_sub1_sub5_sub1.method18531((byte) -68);
			int i = 0;
			int i_74_ = 0;
			if (class570.anIntArrayArray7648 != null
			    && null != (class570.anIntArrayArray7648
					[149698407 * anInt12179])) {
			    i += (class570.anIntArrayArray7648
				  [149698407 * anInt12179][0]);
			    i_74_ += (class570.anIntArrayArray7648
				      [149698407 * anInt12179][2]);
			}
			if (class570.anIntArrayArray7649 != null
			    && (class570.anIntArrayArray7649
				[anInt12179 * 149698407]) != null) {
			    i += (class570.anIntArrayArray7649
				  [anInt12179 * 149698407][0]);
			    i_74_ += (class570.anIntArrayArray7649
				      [149698407 * anInt12179][2]);
			}
			if (0 != i || i_74_ != 0) {
			    int i_75_ = class654_sub1_sub5_sub1
					    .aClass57_11973
					    .method1231(749878718);
			    int i_76_ = i_75_;
			    if (null != class654_sub1_sub5_sub1.anIntArray11920
				&& (class654_sub1_sub5_sub1.anIntArray11920
				    [149698407 * anInt12179]) != -1)
				i_76_
				    = (class654_sub1_sub5_sub1.anIntArray11920
				       [anInt12179 * 149698407]);
			    int i_77_ = i_76_ - i_75_ & 0x3fff;
			    int i_78_ = Class427.anIntArray4806[i_77_];
			    int i_79_ = Class427.anIntArray4805[i_77_];
			    int i_80_ = i_78_ * i_74_ + i * i_79_ >> 14;
			    i_74_ = i_79_ * i_74_ - i * i_78_ >> 14;
			    i = i_80_;
			    Class438 class438_81_
				= Class438.method6994(method10807()
						      .aClass438_4885);
			    class438_81_.aFloat4864 += (float) i;
			    class438_81_.aFloat4865 += (float) i_74_;
			    method10809(class438_81_);
			    class438_81_.method7074();
			}
		    }
		}
	    }
	}
    }
    
    public final void method18814(int i) {
	aBool12176 = true;
	Class444 class444 = new Class444(method10807());
	class444.aClass438_4885.aFloat4864 += aDouble12182 * (double) i;
	class444.aClass438_4885.aFloat4865 += (double) i * aDouble12183;
	if (aBool12180)
	    class444.aClass438_4885.aFloat4863
		= (float) (Class247.method4595((int) (class444.aClass438_4885
						      .aFloat4864),
					       (int) (class444.aClass438_4885
						      .aFloat4865),
					       aByte10854, -1485362651)
			   - anInt12171 * -164769523);
	else if (-1 != anInt12172 * 224073199) {
	    class444.aClass438_4885.aFloat4863
		+= ((double) i * (aDouble12174 * 0.5 * (double) i)
		    + aDouble12185 * (double) i);
	    aDouble12185 += aDouble12174 * (double) i;
	} else
	    class444.aClass438_4885.aFloat4863 += (double) i * aDouble12185;
	class444.aClass443_4886.method7147(1.0F, 0.0F, 0.0F,
					   (float) Math.atan2(aDouble12185,
							      aDouble12184));
	Class443 class443 = Class443.method7137();
	class443.method7147(0.0F, 1.0F, 0.0F,
			    ((float) Math.atan2(aDouble12182, aDouble12183)
			     - 3.1415927F));
	class444.aClass443_4886.method7158(class443);
	class443.method7140();
	method10816(class444);
	if (aClass711_12187.method14393(1, (byte) 1)
	    && aClass711_12187.method14343((byte) 1))
	    aClass711_12187.method14374(-190378488);
    }
    
    public final void method18815(int i) {
	aBool12176 = true;
	Class444 class444 = new Class444(method10807());
	class444.aClass438_4885.aFloat4864 += aDouble12182 * (double) i;
	class444.aClass438_4885.aFloat4865 += (double) i * aDouble12183;
	if (aBool12180)
	    class444.aClass438_4885.aFloat4863
		= (float) (Class247.method4595((int) (class444.aClass438_4885
						      .aFloat4864),
					       (int) (class444.aClass438_4885
						      .aFloat4865),
					       aByte10854, 835031726)
			   - anInt12171 * -164769523);
	else if (-1 != anInt12172 * 224073199) {
	    class444.aClass438_4885.aFloat4863
		+= ((double) i * (aDouble12174 * 0.5 * (double) i)
		    + aDouble12185 * (double) i);
	    aDouble12185 += aDouble12174 * (double) i;
	} else
	    class444.aClass438_4885.aFloat4863 += (double) i * aDouble12185;
	class444.aClass443_4886.method7147(1.0F, 0.0F, 0.0F,
					   (float) Math.atan2(aDouble12185,
							      aDouble12184));
	Class443 class443 = Class443.method7137();
	class443.method7147(0.0F, 1.0F, 0.0F,
			    ((float) Math.atan2(aDouble12182, aDouble12183)
			     - 3.1415927F));
	class444.aClass443_4886.method7158(class443);
	class443.method7140();
	method10816(class444);
	if (aClass711_12187.method14393(1, (byte) 1)
	    && aClass711_12187.method14343((byte) 1))
	    aClass711_12187.method14374(-329743580);
    }
    
    public final void method18816(int i) {
	aBool12176 = true;
	Class444 class444 = new Class444(method10807());
	class444.aClass438_4885.aFloat4864 += aDouble12182 * (double) i;
	class444.aClass438_4885.aFloat4865 += (double) i * aDouble12183;
	if (aBool12180)
	    class444.aClass438_4885.aFloat4863
		= (float) (Class247.method4595((int) (class444.aClass438_4885
						      .aFloat4864),
					       (int) (class444.aClass438_4885
						      .aFloat4865),
					       aByte10854, -2029245341)
			   - anInt12171 * -164769523);
	else if (-1 != anInt12172 * 224073199) {
	    class444.aClass438_4885.aFloat4863
		+= ((double) i * (aDouble12174 * 0.5 * (double) i)
		    + aDouble12185 * (double) i);
	    aDouble12185 += aDouble12174 * (double) i;
	} else
	    class444.aClass438_4885.aFloat4863 += (double) i * aDouble12185;
	class444.aClass443_4886.method7147(1.0F, 0.0F, 0.0F,
					   (float) Math.atan2(aDouble12185,
							      aDouble12184));
	Class443 class443 = Class443.method7137();
	class443.method7147(0.0F, 1.0F, 0.0F,
			    ((float) Math.atan2(aDouble12182, aDouble12183)
			     - 3.1415927F));
	class444.aClass443_4886.method7158(class443);
	class443.method7140();
	method10816(class444);
	if (aClass711_12187.method14393(1, (byte) 1)
	    && aClass711_12187.method14343((byte) 1))
	    aClass711_12187.method14374(-721530796);
    }
    
    public final void method18817(int i) {
	aBool12176 = true;
	Class444 class444 = new Class444(method10807());
	class444.aClass438_4885.aFloat4864 += aDouble12182 * (double) i;
	class444.aClass438_4885.aFloat4865 += (double) i * aDouble12183;
	if (aBool12180)
	    class444.aClass438_4885.aFloat4863
		= (float) (Class247.method4595((int) (class444.aClass438_4885
						      .aFloat4864),
					       (int) (class444.aClass438_4885
						      .aFloat4865),
					       aByte10854, -233836990)
			   - anInt12171 * -164769523);
	else if (-1 != anInt12172 * 224073199) {
	    class444.aClass438_4885.aFloat4863
		+= ((double) i * (aDouble12174 * 0.5 * (double) i)
		    + aDouble12185 * (double) i);
	    aDouble12185 += aDouble12174 * (double) i;
	} else
	    class444.aClass438_4885.aFloat4863 += (double) i * aDouble12185;
	class444.aClass443_4886.method7147(1.0F, 0.0F, 0.0F,
					   (float) Math.atan2(aDouble12185,
							      aDouble12184));
	Class443 class443 = Class443.method7137();
	class443.method7147(0.0F, 1.0F, 0.0F,
			    ((float) Math.atan2(aDouble12182, aDouble12183)
			     - 3.1415927F));
	class444.aClass443_4886.method7158(class443);
	class443.method7140();
	method10816(class444);
	if (aClass711_12187.method14393(1, (byte) 1)
	    && aClass711_12187.method14343((byte) 1))
	    aClass711_12187.method14374(338670286);
    }
    
    boolean method16882(Class185 class185, int i, int i_82_) {
	return false;
    }
    
    void method18818(Class185 class185, Class183 class183, Class446 class446) {
	class183.method3073(class446);
	Class172[] class172s = class183.method3168();
	Class158[] class158s = class183.method3065();
	if ((aClass629_12175 == null || aClass629_12175.aBool8189)
	    && (class172s != null || class158s != null))
	    aClass629_12175 = Class629.method10422(client.anInt11101, true);
	if (aClass629_12175 != null) {
	    aClass629_12175.method10393(class185, (long) client.anInt11101,
					class172s, class158s, false);
	    aClass629_12175.method10396(aByte10854, aShort11900, aShort11896,
					aShort11901, aShort11898);
	}
    }
    
    void method18819(Class185 class185, Class183 class183, Class446 class446,
		     int i) {
	class183.method3073(class446);
	Class172[] class172s = class183.method3168();
	Class158[] class158s = class183.method3065();
	if ((aClass629_12175 == null || aClass629_12175.aBool8189)
	    && (class172s != null || class158s != null))
	    aClass629_12175 = Class629.method10422(client.anInt11101, true);
	if (aClass629_12175 != null) {
	    aClass629_12175.method10393(class185, (long) client.anInt11101,
					class172s, class158s, false);
	    aClass629_12175.method10396(aByte10854, aShort11900, aShort11896,
					aShort11901, aShort11898);
	}
    }
    
    public int method18820(byte i) {
	return 1710066741 * anInt12181;
    }
    
    public void method18821() {
	if (aClass629_12175 != null)
	    aClass629_12175.method10389();
    }
    
    public void method18822() {
	if (aClass629_12175 != null)
	    aClass629_12175.method10389();
    }
    
    public final void method18823(int i, int i_83_, int i_84_, int i_85_) {
	Class438 class438 = Class438.method6994(method10807().aClass438_4885);
	if (!aBool12176) {
	    float f = (float) i - class438.aFloat4864;
	    float f_86_ = (float) i_83_ - class438.aFloat4865;
	    float f_87_ = (float) Math.sqrt((double) (f_86_ * f_86_ + f * f));
	    if (f_87_ != 0.0F) {
		class438.aFloat4864
		    += f * (float) (1078145227 * anInt12186) / f_87_;
		class438.aFloat4865
		    += (float) (anInt12186 * 1078145227) * f_86_ / f_87_;
	    }
	    if (aBool12180)
		class438.aFloat4863
		    = (float) (Class247.method4595((int) class438.aFloat4864,
						   (int) class438.aFloat4865,
						   aByte10854, -1058342907)
			       - -164769523 * anInt12171);
	    method10809(class438);
	}
	double d = (double) (1 + 1150056077 * anInt12170 - i_85_);
	aDouble12182 = (double) ((float) i - class438.aFloat4864) / d;
	aDouble12183 = (double) ((float) i_83_ - class438.aFloat4865) / d;
	aDouble12184 = Math.sqrt(aDouble12182 * aDouble12182
				 + aDouble12183 * aDouble12183);
	if (anInt12172 * 224073199 != -1) {
	    if (!aBool12176)
		aDouble12185 = -aDouble12184 * Math.tan((double) (anInt12172
								  * 224073199)
							* 0.02454369);
	    aDouble12174 = ((double) ((float) i_84_ - class438.aFloat4863)
			    - aDouble12185 * d) * 2.0 / (d * d);
	} else
	    aDouble12185 = (double) ((float) i_84_ - class438.aFloat4863) / d;
	class438.method7074();
    }
    
    public void method18824() {
	if (aClass629_12175 != null)
	    aClass629_12175.method10389();
    }
}
