/* Class536_Sub2_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public class Class536_Sub2_Sub1_Sub1 extends Class536_Sub2_Sub1
{
    short aShort12074;
    short aShort12075;
    Class615 aClass615_12076;
    short aShort12077;
    int anInt12078;
    short aShort12079;
    int anInt12080;
    short aShort12081;
    short aShort12082;
    short aShort12083;
    
    void method18685() {
	int i = aClass615_12076.aClass629_8038.anInt8191;
	if (aClass615_12076.aClass629_8038.aClass536_Sub2_Sub1_Sub1Array8179[i]
	    != null)
	    aClass615_12076.aClass629_8038
		.aClass536_Sub2_Sub1_Sub1Array8179[i].method18689();
	aClass615_12076.aClass629_8038.aClass536_Sub2_Sub1_Sub1Array8179[i]
	    = this;
	aShort12075 = (short) aClass615_12076.aClass629_8038.anInt8191;
	aClass615_12076.aClass629_8038.anInt8191 = i + 1 & 0x1fff;
	aClass615_12076.aClass709_8040.method14287(this, 2141344944);
    }
    
    void method18686() {
	aClass615_12076.aClass629_8038.aClass536_Sub2_Sub1_Sub1Array8179
	    [aShort12075]
	    = null;
	Class625.aClass536_Sub2_Sub1_Sub1Array8152[(Class625.anInt8157
						    * -676793059)]
	    = this;
	Class625.anInt8157
	    = (Class625.anInt8157 * -676793059 + 1 & 0x3ff) * -1798605515;
	method8900(-423561196);
	method15973(1214266234);
    }
    
    void method18687() {
	int i = aClass615_12076.aClass629_8038.anInt8191;
	if (aClass615_12076.aClass629_8038.aClass536_Sub2_Sub1_Sub1Array8179[i]
	    != null)
	    aClass615_12076.aClass629_8038
		.aClass536_Sub2_Sub1_Sub1Array8179[i].method18689();
	aClass615_12076.aClass629_8038.aClass536_Sub2_Sub1_Sub1Array8179[i]
	    = this;
	aShort12075 = (short) aClass615_12076.aClass629_8038.anInt8191;
	aClass615_12076.aClass629_8038.anInt8191 = i + 1 & 0x1fff;
	aClass615_12076.aClass709_8040.method14287(this, 2046758965);
    }
    
    void method18688(long l, int i) {
	aShort12074 -= i;
	if (aShort12074 <= 0)
	    method18689();
	else {
	    int i_0_ = anInt11491 >> 12;
	    int i_1_ = anInt11495 >> 12;
	    int i_2_ = anInt11496 >> 12;
	    Class629 class629 = aClass615_12076.aClass629_8038;
	    Class385 class385 = aClass615_12076.aClass385_8037;
	    if (class385.anInt3988 * 563541671 != 0) {
		if (aShort12083 - aShort12074
		    <= class385.anInt4032 * -1117023499) {
		    int i_3_ = ((anInt11492 >> 8 & 0xff00)
				+ (anInt12078 >> 16 & 0xff)
				+ class385.anInt4036 * 969942827 * i);
		    int i_4_
			= ((anInt11492 & 0xff00) + (anInt12078 >> 8 & 0xff)
			   + class385.anInt4037 * -1220577901 * i);
		    int i_5_
			= ((anInt11492 << 8 & 0xff00) + (anInt12078 & 0xff)
			   + class385.anInt4038 * 1368092161 * i);
		    if (i_3_ < 0)
			i_3_ = 0;
		    else if (i_3_ > 65535)
			i_3_ = 65535;
		    if (i_4_ < 0)
			i_4_ = 0;
		    else if (i_4_ > 65535)
			i_4_ = 65535;
		    if (i_5_ < 0)
			i_5_ = 0;
		    else if (i_5_ > 65535)
			i_5_ = 65535;
		    anInt11492 &= ~0xffffff;
		    anInt11492 |= (((i_3_ & 0xff00) << 8) + (i_4_ & 0xff00)
				   + ((i_5_ & 0xff00) >> 8));
		    anInt12078 &= ~0xffffff;
		    anInt12078 |= (((i_3_ & 0xff) << 16) + ((i_4_ & 0xff) << 8)
				   + (i_5_ & 0xff));
		}
		if (aShort12083 - aShort12074
		    <= class385.anInt4035 * 392975661) {
		    int i_6_ = ((anInt11492 >> 16 & 0xff00)
				+ (anInt12078 >> 24 & 0xff)
				+ class385.anInt4017 * -1647904787 * i);
		    if (i_6_ < 0)
			i_6_ = 0;
		    else if (i_6_ > 65535)
			i_6_ = 65535;
		    anInt11492 &= 0xffffff;
		    anInt11492 |= (i_6_ & 0xff00) << 16;
		    anInt12078 &= 0xffffff;
		    anInt12078 |= (i_6_ & 0xff) << 24;
		}
	    }
	    if (class385.anInt3979 * -2017057333 != -1
		&& (aShort12083 - aShort12074
		    <= class385.anInt4040 * -417293177))
		anInt12080 += class385.anInt3992 * -1030220067 * i;
	    if (class385.anInt3997 * 921858437 != -1
		&& (aShort12083 - aShort12074
		    <= class385.anInt4028 * -1191739965))
		anInt11497 += class385.anInt4043 * -785469931 * i;
	    if (aShort12079 != 0)
		aShort11499 = (short) (aShort11499 + aShort12079 * i & 0x3fff);
	    double d = (double) aShort12077;
	    double d_7_ = (double) aShort12081;
	    double d_8_ = (double) aShort12082;
	    boolean bool = false;
	    if (class385.anInt3977 * 912233891 == 1) {
		int i_9_ = i_0_ - (aClass615_12076.aClass621_8044.anInt8123
				   * -1481682457);
		int i_10_
		    = (i_1_
		       - aClass615_12076.aClass621_8044.anInt8125 * 379767745);
		int i_11_
		    = (i_2_
		       - aClass615_12076.aClass621_8044.anInt8121 * 702655677);
		int i_12_
		    = ((int) Math.sqrt((double) (i_9_ * i_9_ + i_10_ * i_10_
						 + i_11_ * i_11_))
		       >> 2);
		long l_13_
		    = (long) (class385.anInt4007 * -1840765811 * i_12_ * i);
		anInt12080 -= (long) anInt12080 * l_13_ >> 18;
	    } else if (class385.anInt3977 * 912233891 == 2) {
		int i_14_ = i_0_ - (aClass615_12076.aClass621_8044.anInt8123
				    * -1481682457);
		int i_15_
		    = (i_1_
		       - aClass615_12076.aClass621_8044.anInt8125 * 379767745);
		int i_16_
		    = (i_2_
		       - aClass615_12076.aClass621_8044.anInt8121 * 702655677);
		int i_17_ = i_14_ * i_14_ + i_15_ * i_15_ + i_16_ * i_16_;
		long l_18_
		    = (long) (class385.anInt4007 * -1840765811 * i_17_ * i);
		anInt12080 -= (long) anInt12080 * l_18_ >> 28;
	    }
	    if (class385.anIntArray3995 != null) {
		Iterator iterator = class629.aList8185.iterator();
		while (iterator.hasNext()) {
		    Class534_Sub32 class534_sub32
			= (Class534_Sub32) iterator.next();
		    Class384 class384 = class534_sub32.aClass384_10700;
		    if (class384.anInt3954 * 302557339 != 1) {
			boolean bool_19_ = false;
			for (int i_20_ = 0;
			     i_20_ < class385.anIntArray3995.length; i_20_++) {
			    if (class385.anIntArray3995[i_20_]
				== class384.anInt3966 * -468701739) {
				bool_19_ = true;
				break;
			    }
			}
			if (bool_19_) {
			    double d_21_
				= (double) (i_0_ - (class534_sub32.anInt10698
						    * 1976650109));
			    double d_22_
				= (double) (i_1_ - (class534_sub32.anInt10699
						    * -1755035597));
			    double d_23_
				= (double) (i_2_ - (class534_sub32.anInt10696
						    * 1860160463));
			    double d_24_ = (d_21_ * d_21_ + d_22_ * d_22_
					    + d_23_ * d_23_);
			    if (!(d_24_
				  > (double) (class384.aLong3944
					      * -2285738288332836045L))) {
				double d_25_ = Math.sqrt(d_24_);
				if (d_25_ == 0.0)
				    d_25_ = 1.0;
				double d_26_
				    = (((d_21_
					 * (double) class534_sub32.aFloat10701)
					+ d_22_ * (double) (class384.anInt3957
							    * 829166933)
					+ d_23_ * (double) (class534_sub32
							    .aFloat10697))
				       * 65535.0
				       / ((double) (class384.anInt3964
						    * 367776947)
					  * d_25_));
				if (!(d_26_ < (double) (class384.anInt3965
							* -120702217))) {
				    double d_27_ = 0.0;
				    if (class384.anInt3959 * 256549879 == 1)
					d_27_ = (d_25_ / 16.0
						 * (double) (class384.anInt3960
							     * -533022681));
				    else if (class384.anInt3959 * 256549879
					     == 2)
					d_27_ = (d_25_ / 16.0 * (d_25_ / 16.0)
						 * (double) (class384.anInt3960
							     * -533022681));
				    if (class384.anInt3962 * 439456515 == 0) {
					if (class384.anInt3961 * -1281619979
					    == 0) {
					    d += ((double) (class534_sub32
							    .aFloat10701)
						  - d_27_) * (double) i;
					    d_7_ += ((double) ((class384
								.anInt3957)
							       * 829166933)
						     - d_27_) * (double) i;
					    d_8_ += ((double) (class534_sub32
							       .aFloat10697)
						     - d_27_) * (double) i;
					    bool = true;
					} else {
					    anInt11491
						+= ((double) (class534_sub32
							      .aFloat10701)
						    - d_27_) * (double) i;
					    anInt11495
						+= ((double) ((class384
							       .anInt3957)
							      * 829166933)
						    - d_27_) * (double) i;
					    anInt11496
						+= ((double) (class534_sub32
							      .aFloat10697)
						    - d_27_) * (double) i;
					}
				    } else {
					double d_28_
					    = (d_21_ / d_25_
					       * (double) (class384.anInt3964
							   * 367776947));
					double d_29_
					    = (d_22_ / d_25_
					       * (double) (class384.anInt3964
							   * 367776947));
					double d_30_
					    = (d_23_ / d_25_
					       * (double) (class384.anInt3964
							   * 367776947));
					if (class384.anInt3961 * -1281619979
					    == 0) {
					    d += d_28_ * (double) i;
					    d_7_ += d_29_ * (double) i;
					    d_8_ += d_30_ * (double) i;
					    bool = true;
					} else {
					    anInt11491 += d_28_ * (double) i;
					    anInt11495 += d_29_ * (double) i;
					    anInt11496 += d_30_ * (double) i;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	    if (class385.anIntArray4016 != null) {
		for (int i_31_ = 0; i_31_ < class385.anIntArray4016.length;
		     i_31_++) {
		    Class534_Sub32 class534_sub32
			= ((Class534_Sub32)
			   (Class625.aClass9_8155.method579
			    ((long) class385.anIntArray4016[i_31_])));
		    while (class534_sub32 != null) {
			Class384 class384 = class534_sub32.aClass384_10700;
			double d_32_
			    = (double) (i_0_ - (class534_sub32.anInt10698
						* 1976650109));
			double d_33_
			    = (double) (i_1_ - (class534_sub32.anInt10699
						* -1755035597));
			double d_34_
			    = (double) (i_2_ - (class534_sub32.anInt10696
						* 1860160463));
			double d_35_
			    = d_32_ * d_32_ + d_33_ * d_33_ + d_34_ * d_34_;
			if (d_35_ > (double) (class384.aLong3944
					      * -2285738288332836045L))
			    class534_sub32
				= ((Class534_Sub32)
				   Class625.aClass9_8155.method582(895179245));
			else {
			    double d_36_ = Math.sqrt(d_35_);
			    if (d_36_ == 0.0)
				d_36_ = 1.0;
			    if (class384.anInt3958 * 1148988209 > 0
				&& class384.anInt3958 * 1148988209 < 2047) {
				double d_37_
				    = (((d_32_
					 * (double) class534_sub32.aFloat10701)
					+ d_33_ * (double) (class384.anInt3957
							    * 829166933)
					+ d_34_ * (double) (class534_sub32
							    .aFloat10697))
				       * 16384.0
				       / ((double) (class384.anInt3964
						    * 367776947)
					  * d_36_));
				if (d_37_ < (double) (class384.anInt3965
						      * -120702217)) {
				    class534_sub32
					= ((Class534_Sub32)
					   Class625.aClass9_8155
					       .method582(1123450063));
				    continue;
				}
			    }
			    double d_38_ = 0.0;
			    if (class384.anInt3959 * 256549879 == 1)
				d_38_ = (d_36_ / 16.0
					 * (double) (class384.anInt3960
						     * -533022681));
			    else if (class384.anInt3959 * 256549879 == 2)
				d_38_ = (d_36_ / 16.0 * (d_36_ / 16.0)
					 * (double) (class384.anInt3960
						     * -533022681));
			    if (class384.anInt3962 * 439456515 == 0) {
				if (class384.anInt3961 * -1281619979 == 0) {
				    d += ((double) class534_sub32.aFloat10701
					  - d_38_) * (double) i;
				    d_7_ += ((double) (class384.anInt3957
						       * 829166933)
					     - d_38_) * (double) i;
				    d_8_
					+= ((double) class534_sub32.aFloat10697
					    - d_38_) * (double) i;
				    bool = true;
				} else {
				    anInt11491
					+= ((double) class534_sub32.aFloat10701
					    - d_38_) * (double) i;
				    anInt11495 += ((double) (class384.anInt3957
							     * 829166933)
						   - d_38_) * (double) i;
				    anInt11496
					+= ((double) class534_sub32.aFloat10697
					    - d_38_) * (double) i;
				}
			    } else {
				double d_39_ = (d_32_ / d_36_
						* (double) (class384.anInt3964
							    * 367776947));
				double d_40_ = (d_33_ / d_36_
						* (double) (class384.anInt3964
							    * 367776947));
				double d_41_ = (d_34_ / d_36_
						* (double) (class384.anInt3964
							    * 367776947));
				if (class384.anInt3961 * -1281619979 == 0) {
				    d += d_39_ * (double) i;
				    d_7_ += d_40_ * (double) i;
				    d_8_ += d_41_ * (double) i;
				    bool = true;
				} else {
				    anInt11491 += d_39_ * (double) i;
				    anInt11495 += d_40_ * (double) i;
				    anInt11496 += d_41_ * (double) i;
				}
			    }
			    class534_sub32
				= (Class534_Sub32) Class625.aClass9_8155
						       .method582(1541852809);
			}
		    }
		}
	    }
	    if (class385.anIntArray3998 != null) {
		if (class385.anIntArray4018 == null) {
		    class385.anIntArray4018
			= new int[class385.anIntArray3998.length];
		    for (int i_42_ = 0; i_42_ < class385.anIntArray3998.length;
			 i_42_++) {
			Class625.anInterface46_8159.method345((class385
							       .anIntArray3998
							       [i_42_]),
							      -404064168);
			class385.anIntArray4018[i_42_]
			    = Class393.method6556((class385.anIntArray3998
						   [i_42_]),
						  (byte) 49);
		    }
		}
		for (int i_43_ = 0; i_43_ < class385.anIntArray4018.length;
		     i_43_++) {
		    Class384 class384 = (Class625.aClass384Array8160
					 [class385.anIntArray4018[i_43_]]);
		    if (class384.anInt3961 * -1281619979 == 0) {
			d += (double) (class384.anInt3945 * -1058410147 * i);
			d_7_ += (double) (class384.anInt3957 * 829166933 * i);
			d_8_ += (double) (class384.anInt3953 * 894885741 * i);
			bool = true;
		    } else {
			anInt11491 += class384.anInt3945 * -1058410147 * i;
			anInt11495 += class384.anInt3957 * 829166933 * i;
			anInt11496 += class384.anInt3953 * 894885741 * i;
		    }
		}
	    }
	    if (bool) {
		while (d > 32767.0 || d_7_ > 32767.0 || d_8_ > 32767.0
		       || d < -32767.0 || d_7_ < -32767.0 || d_8_ < -32767.0) {
		    d /= 2.0;
		    d_7_ /= 2.0;
		    d_8_ /= 2.0;
		    anInt12080 <<= 1;
		}
		aShort12077 = (short) (int) d;
		aShort12081 = (short) (int) d_7_;
		aShort12082 = (short) (int) d_8_;
	    }
	    anInt11491 += ((long) aShort12077 * (long) (anInt12080 << 2)
			   >> 23) * (long) i;
	    anInt11495 += ((long) aShort12081 * (long) (anInt12080 << 2)
			   >> 23) * (long) i;
	    anInt11496 += ((long) aShort12082 * (long) (anInt12080 << 2)
			   >> 23) * (long) i;
	}
    }
    
    Class536_Sub2_Sub1_Sub1
	(Class615 class615, int i, int i_44_, int i_45_, int i_46_, int i_47_,
	 int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_,
	 int i_54_, int i_55_, boolean bool, boolean bool_56_) {
	aClass615_12076 = class615;
	anInt11491 = i << 12;
	anInt11495 = i_44_ << 12;
	anInt11496 = i_45_ << 12;
	anInt11492 = i_51_;
	aShort12083 = aShort12074 = (short) i_50_;
	anInt11497 = i_52_;
	aShort11499 = (short) i_53_;
	aShort12079 = (short) i_54_;
	anInt11498 = i_55_;
	aBool11494 = bool_56_;
	aShort12077 = (short) i_46_;
	aShort12081 = (short) i_47_;
	aShort12082 = (short) i_48_;
	anInt12080 = i_49_;
	method18687();
    }
    
    void method18689() {
	aClass615_12076.aClass629_8038.aClass536_Sub2_Sub1_Sub1Array8179
	    [aShort12075]
	    = null;
	Class625.aClass536_Sub2_Sub1_Sub1Array8152[(Class625.anInt8157
						    * -676793059)]
	    = this;
	Class625.anInt8157
	    = (Class625.anInt8157 * -676793059 + 1 & 0x3ff) * -1798605515;
	method8900(-1863627947);
	method15973(1214266234);
    }
    
    void method18690(Class615 class615, int i, int i_57_, int i_58_, int i_59_,
		     int i_60_, int i_61_, int i_62_, int i_63_, int i_64_,
		     int i_65_, int i_66_, int i_67_, int i_68_, boolean bool,
		     boolean bool_69_) {
	aClass615_12076 = class615;
	anInt11491 = i << 12;
	anInt11495 = i_57_ << 12;
	anInt11496 = i_58_ << 12;
	anInt11492 = i_64_;
	aShort12083 = aShort12074 = (short) i_63_;
	anInt11497 = i_65_;
	aShort11499 = (short) i_66_;
	aShort12079 = (short) i_67_;
	anInt11498 = i_68_;
	aBool11494 = bool_69_;
	aShort12077 = (short) i_59_;
	aShort12081 = (short) i_60_;
	aShort12082 = (short) i_61_;
	anInt12080 = i_62_;
	method18687();
    }
    
    void method18691(Class615 class615, int i, int i_70_, int i_71_, int i_72_,
		     int i_73_, int i_74_, int i_75_, int i_76_, int i_77_,
		     int i_78_, int i_79_, int i_80_, int i_81_, boolean bool,
		     boolean bool_82_) {
	aClass615_12076 = class615;
	anInt11491 = i << 12;
	anInt11495 = i_70_ << 12;
	anInt11496 = i_71_ << 12;
	anInt11492 = i_77_;
	aShort12083 = aShort12074 = (short) i_76_;
	anInt11497 = i_78_;
	aShort11499 = (short) i_79_;
	aShort12079 = (short) i_80_;
	anInt11498 = i_81_;
	aBool11494 = bool_82_;
	aShort12077 = (short) i_72_;
	aShort12081 = (short) i_73_;
	aShort12082 = (short) i_74_;
	anInt12080 = i_75_;
	method18687();
    }
    
    void method18692(Class615 class615, int i, int i_83_, int i_84_, int i_85_,
		     int i_86_, int i_87_, int i_88_, int i_89_, int i_90_,
		     int i_91_, int i_92_, int i_93_, int i_94_, boolean bool,
		     boolean bool_95_) {
	aClass615_12076 = class615;
	anInt11491 = i << 12;
	anInt11495 = i_83_ << 12;
	anInt11496 = i_84_ << 12;
	anInt11492 = i_90_;
	aShort12083 = aShort12074 = (short) i_89_;
	anInt11497 = i_91_;
	aShort11499 = (short) i_92_;
	aShort12079 = (short) i_93_;
	anInt11498 = i_94_;
	aBool11494 = bool_95_;
	aShort12077 = (short) i_85_;
	aShort12081 = (short) i_86_;
	aShort12082 = (short) i_87_;
	anInt12080 = i_88_;
	method18687();
    }
    
    void method18693(long l, int i) {
	aShort12074 -= i;
	if (aShort12074 <= 0)
	    method18689();
	else {
	    int i_96_ = anInt11491 >> 12;
	    int i_97_ = anInt11495 >> 12;
	    int i_98_ = anInt11496 >> 12;
	    Class629 class629 = aClass615_12076.aClass629_8038;
	    Class385 class385 = aClass615_12076.aClass385_8037;
	    if (class385.anInt3988 * 563541671 != 0) {
		if (aShort12083 - aShort12074
		    <= class385.anInt4032 * -1117023499) {
		    int i_99_ = ((anInt11492 >> 8 & 0xff00)
				 + (anInt12078 >> 16 & 0xff)
				 + class385.anInt4036 * 969942827 * i);
		    int i_100_
			= ((anInt11492 & 0xff00) + (anInt12078 >> 8 & 0xff)
			   + class385.anInt4037 * -1220577901 * i);
		    int i_101_
			= ((anInt11492 << 8 & 0xff00) + (anInt12078 & 0xff)
			   + class385.anInt4038 * 1368092161 * i);
		    if (i_99_ < 0)
			i_99_ = 0;
		    else if (i_99_ > 65535)
			i_99_ = 65535;
		    if (i_100_ < 0)
			i_100_ = 0;
		    else if (i_100_ > 65535)
			i_100_ = 65535;
		    if (i_101_ < 0)
			i_101_ = 0;
		    else if (i_101_ > 65535)
			i_101_ = 65535;
		    anInt11492 &= ~0xffffff;
		    anInt11492 |= (((i_99_ & 0xff00) << 8) + (i_100_ & 0xff00)
				   + ((i_101_ & 0xff00) >> 8));
		    anInt12078 &= ~0xffffff;
		    anInt12078 |= (((i_99_ & 0xff) << 16)
				   + ((i_100_ & 0xff) << 8) + (i_101_ & 0xff));
		}
		if (aShort12083 - aShort12074
		    <= class385.anInt4035 * 392975661) {
		    int i_102_ = ((anInt11492 >> 16 & 0xff00)
				  + (anInt12078 >> 24 & 0xff)
				  + class385.anInt4017 * -1647904787 * i);
		    if (i_102_ < 0)
			i_102_ = 0;
		    else if (i_102_ > 65535)
			i_102_ = 65535;
		    anInt11492 &= 0xffffff;
		    anInt11492 |= (i_102_ & 0xff00) << 16;
		    anInt12078 &= 0xffffff;
		    anInt12078 |= (i_102_ & 0xff) << 24;
		}
	    }
	    if (class385.anInt3979 * -2017057333 != -1
		&& (aShort12083 - aShort12074
		    <= class385.anInt4040 * -417293177))
		anInt12080 += class385.anInt3992 * -1030220067 * i;
	    if (class385.anInt3997 * 921858437 != -1
		&& (aShort12083 - aShort12074
		    <= class385.anInt4028 * -1191739965))
		anInt11497 += class385.anInt4043 * -785469931 * i;
	    if (aShort12079 != 0)
		aShort11499 = (short) (aShort11499 + aShort12079 * i & 0x3fff);
	    double d = (double) aShort12077;
	    double d_103_ = (double) aShort12081;
	    double d_104_ = (double) aShort12082;
	    boolean bool = false;
	    if (class385.anInt3977 * 912233891 == 1) {
		int i_105_ = i_96_ - (aClass615_12076.aClass621_8044.anInt8123
				      * -1481682457);
		int i_106_
		    = (i_97_
		       - aClass615_12076.aClass621_8044.anInt8125 * 379767745);
		int i_107_
		    = (i_98_
		       - aClass615_12076.aClass621_8044.anInt8121 * 702655677);
		int i_108_ = ((int) Math.sqrt((double) (i_105_ * i_105_
							+ i_106_ * i_106_
							+ i_107_ * i_107_))
			      >> 2);
		long l_109_
		    = (long) (class385.anInt4007 * -1840765811 * i_108_ * i);
		anInt12080 -= (long) anInt12080 * l_109_ >> 18;
	    } else if (class385.anInt3977 * 912233891 == 2) {
		int i_110_ = i_96_ - (aClass615_12076.aClass621_8044.anInt8123
				      * -1481682457);
		int i_111_
		    = (i_97_
		       - aClass615_12076.aClass621_8044.anInt8125 * 379767745);
		int i_112_
		    = (i_98_
		       - aClass615_12076.aClass621_8044.anInt8121 * 702655677);
		int i_113_
		    = i_110_ * i_110_ + i_111_ * i_111_ + i_112_ * i_112_;
		long l_114_
		    = (long) (class385.anInt4007 * -1840765811 * i_113_ * i);
		anInt12080 -= (long) anInt12080 * l_114_ >> 28;
	    }
	    if (class385.anIntArray3995 != null) {
		Iterator iterator = class629.aList8185.iterator();
		while (iterator.hasNext()) {
		    Class534_Sub32 class534_sub32
			= (Class534_Sub32) iterator.next();
		    Class384 class384 = class534_sub32.aClass384_10700;
		    if (class384.anInt3954 * 302557339 != 1) {
			boolean bool_115_ = false;
			for (int i_116_ = 0;
			     i_116_ < class385.anIntArray3995.length;
			     i_116_++) {
			    if (class385.anIntArray3995[i_116_]
				== class384.anInt3966 * -468701739) {
				bool_115_ = true;
				break;
			    }
			}
			if (bool_115_) {
			    double d_117_
				= (double) (i_96_ - (class534_sub32.anInt10698
						     * 1976650109));
			    double d_118_
				= (double) (i_97_ - (class534_sub32.anInt10699
						     * -1755035597));
			    double d_119_
				= (double) (i_98_ - (class534_sub32.anInt10696
						     * 1860160463));
			    double d_120_ = (d_117_ * d_117_ + d_118_ * d_118_
					     + d_119_ * d_119_);
			    if (!(d_120_
				  > (double) (class384.aLong3944
					      * -2285738288332836045L))) {
				double d_121_ = Math.sqrt(d_120_);
				if (d_121_ == 0.0)
				    d_121_ = 1.0;
				double d_122_
				    = (((d_117_
					 * (double) class534_sub32.aFloat10701)
					+ d_118_ * (double) (class384.anInt3957
							     * 829166933)
					+ d_119_ * (double) (class534_sub32
							     .aFloat10697))
				       * 65535.0
				       / ((double) (class384.anInt3964
						    * 367776947)
					  * d_121_));
				if (!(d_122_ < (double) (class384.anInt3965
							 * -120702217))) {
				    double d_123_ = 0.0;
				    if (class384.anInt3959 * 256549879 == 1)
					d_123_
					    = (d_121_ / 16.0
					       * (double) (class384.anInt3960
							   * -533022681));
				    else if (class384.anInt3959 * 256549879
					     == 2)
					d_123_
					    = (d_121_ / 16.0 * (d_121_ / 16.0)
					       * (double) (class384.anInt3960
							   * -533022681));
				    if (class384.anInt3962 * 439456515 == 0) {
					if (class384.anInt3961 * -1281619979
					    == 0) {
					    d += ((double) (class534_sub32
							    .aFloat10701)
						  - d_123_) * (double) i;
					    d_103_ += ((double) ((class384
								  .anInt3957)
								 * 829166933)
						       - d_123_) * (double) i;
					    d_104_ += ((double) (class534_sub32
								 .aFloat10697)
						       - d_123_) * (double) i;
					    bool = true;
					} else {
					    anInt11491
						+= ((double) (class534_sub32
							      .aFloat10701)
						    - d_123_) * (double) i;
					    anInt11495
						+= ((double) ((class384
							       .anInt3957)
							      * 829166933)
						    - d_123_) * (double) i;
					    anInt11496
						+= ((double) (class534_sub32
							      .aFloat10697)
						    - d_123_) * (double) i;
					}
				    } else {
					double d_124_
					    = (d_117_ / d_121_
					       * (double) (class384.anInt3964
							   * 367776947));
					double d_125_
					    = (d_118_ / d_121_
					       * (double) (class384.anInt3964
							   * 367776947));
					double d_126_
					    = (d_119_ / d_121_
					       * (double) (class384.anInt3964
							   * 367776947));
					if (class384.anInt3961 * -1281619979
					    == 0) {
					    d += d_124_ * (double) i;
					    d_103_ += d_125_ * (double) i;
					    d_104_ += d_126_ * (double) i;
					    bool = true;
					} else {
					    anInt11491 += d_124_ * (double) i;
					    anInt11495 += d_125_ * (double) i;
					    anInt11496 += d_126_ * (double) i;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	    if (class385.anIntArray4016 != null) {
		for (int i_127_ = 0; i_127_ < class385.anIntArray4016.length;
		     i_127_++) {
		    Class534_Sub32 class534_sub32
			= ((Class534_Sub32)
			   (Class625.aClass9_8155.method579
			    ((long) class385.anIntArray4016[i_127_])));
		    while (class534_sub32 != null) {
			Class384 class384 = class534_sub32.aClass384_10700;
			double d_128_
			    = (double) (i_96_ - (class534_sub32.anInt10698
						 * 1976650109));
			double d_129_
			    = (double) (i_97_ - (class534_sub32.anInt10699
						 * -1755035597));
			double d_130_
			    = (double) (i_98_ - (class534_sub32.anInt10696
						 * 1860160463));
			double d_131_ = (d_128_ * d_128_ + d_129_ * d_129_
					 + d_130_ * d_130_);
			if (d_131_ > (double) (class384.aLong3944
					       * -2285738288332836045L))
			    class534_sub32
				= (Class534_Sub32) Class625.aClass9_8155
						       .method582(1786468672);
			else {
			    double d_132_ = Math.sqrt(d_131_);
			    if (d_132_ == 0.0)
				d_132_ = 1.0;
			    if (class384.anInt3958 * 1148988209 > 0
				&& class384.anInt3958 * 1148988209 < 2047) {
				double d_133_
				    = (((d_128_
					 * (double) class534_sub32.aFloat10701)
					+ d_129_ * (double) (class384.anInt3957
							     * 829166933)
					+ d_130_ * (double) (class534_sub32
							     .aFloat10697))
				       * 16384.0
				       / ((double) (class384.anInt3964
						    * 367776947)
					  * d_132_));
				if (d_133_ < (double) (class384.anInt3965
						       * -120702217)) {
				    class534_sub32
					= ((Class534_Sub32)
					   Class625.aClass9_8155
					       .method582(820096074));
				    continue;
				}
			    }
			    double d_134_ = 0.0;
			    if (class384.anInt3959 * 256549879 == 1)
				d_134_ = (d_132_ / 16.0
					  * (double) (class384.anInt3960
						      * -533022681));
			    else if (class384.anInt3959 * 256549879 == 2)
				d_134_ = (d_132_ / 16.0 * (d_132_ / 16.0)
					  * (double) (class384.anInt3960
						      * -533022681));
			    if (class384.anInt3962 * 439456515 == 0) {
				if (class384.anInt3961 * -1281619979 == 0) {
				    d += ((double) class534_sub32.aFloat10701
					  - d_134_) * (double) i;
				    d_103_ += ((double) (class384.anInt3957
							 * 829166933)
					       - d_134_) * (double) i;
				    d_104_
					+= ((double) class534_sub32.aFloat10697
					    - d_134_) * (double) i;
				    bool = true;
				} else {
				    anInt11491
					+= ((double) class534_sub32.aFloat10701
					    - d_134_) * (double) i;
				    anInt11495 += ((double) (class384.anInt3957
							     * 829166933)
						   - d_134_) * (double) i;
				    anInt11496
					+= ((double) class534_sub32.aFloat10697
					    - d_134_) * (double) i;
				}
			    } else {
				double d_135_ = (d_128_ / d_132_
						 * (double) (class384.anInt3964
							     * 367776947));
				double d_136_ = (d_129_ / d_132_
						 * (double) (class384.anInt3964
							     * 367776947));
				double d_137_ = (d_130_ / d_132_
						 * (double) (class384.anInt3964
							     * 367776947));
				if (class384.anInt3961 * -1281619979 == 0) {
				    d += d_135_ * (double) i;
				    d_103_ += d_136_ * (double) i;
				    d_104_ += d_137_ * (double) i;
				    bool = true;
				} else {
				    anInt11491 += d_135_ * (double) i;
				    anInt11495 += d_136_ * (double) i;
				    anInt11496 += d_137_ * (double) i;
				}
			    }
			    class534_sub32
				= ((Class534_Sub32)
				   Class625.aClass9_8155.method582(395215561));
			}
		    }
		}
	    }
	    if (class385.anIntArray3998 != null) {
		if (class385.anIntArray4018 == null) {
		    class385.anIntArray4018
			= new int[class385.anIntArray3998.length];
		    for (int i_138_ = 0;
			 i_138_ < class385.anIntArray3998.length; i_138_++) {
			Class625.anInterface46_8159.method345((class385
							       .anIntArray3998
							       [i_138_]),
							      -404064168);
			class385.anIntArray4018[i_138_]
			    = Class393.method6556((class385.anIntArray3998
						   [i_138_]),
						  (byte) 127);
		    }
		}
		for (int i_139_ = 0; i_139_ < class385.anIntArray4018.length;
		     i_139_++) {
		    Class384 class384 = (Class625.aClass384Array8160
					 [class385.anIntArray4018[i_139_]]);
		    if (class384.anInt3961 * -1281619979 == 0) {
			d += (double) (class384.anInt3945 * -1058410147 * i);
			d_103_
			    += (double) (class384.anInt3957 * 829166933 * i);
			d_104_
			    += (double) (class384.anInt3953 * 894885741 * i);
			bool = true;
		    } else {
			anInt11491 += class384.anInt3945 * -1058410147 * i;
			anInt11495 += class384.anInt3957 * 829166933 * i;
			anInt11496 += class384.anInt3953 * 894885741 * i;
		    }
		}
	    }
	    if (bool) {
		while (d > 32767.0 || d_103_ > 32767.0 || d_104_ > 32767.0
		       || d < -32767.0 || d_103_ < -32767.0
		       || d_104_ < -32767.0) {
		    d /= 2.0;
		    d_103_ /= 2.0;
		    d_104_ /= 2.0;
		    anInt12080 <<= 1;
		}
		aShort12077 = (short) (int) d;
		aShort12081 = (short) (int) d_103_;
		aShort12082 = (short) (int) d_104_;
	    }
	    anInt11491 += ((long) aShort12077 * (long) (anInt12080 << 2)
			   >> 23) * (long) i;
	    anInt11495 += ((long) aShort12081 * (long) (anInt12080 << 2)
			   >> 23) * (long) i;
	    anInt11496 += ((long) aShort12082 * (long) (anInt12080 << 2)
			   >> 23) * (long) i;
	}
    }
    
    void method18694(long l, int i) {
	aShort12074 -= i;
	if (aShort12074 <= 0)
	    method18689();
	else {
	    int i_140_ = anInt11491 >> 12;
	    int i_141_ = anInt11495 >> 12;
	    int i_142_ = anInt11496 >> 12;
	    Class629 class629 = aClass615_12076.aClass629_8038;
	    Class385 class385 = aClass615_12076.aClass385_8037;
	    if (class385.anInt3988 * 563541671 != 0) {
		if (aShort12083 - aShort12074
		    <= class385.anInt4032 * -1117023499) {
		    int i_143_ = ((anInt11492 >> 8 & 0xff00)
				  + (anInt12078 >> 16 & 0xff)
				  + class385.anInt4036 * 969942827 * i);
		    int i_144_
			= ((anInt11492 & 0xff00) + (anInt12078 >> 8 & 0xff)
			   + class385.anInt4037 * -1220577901 * i);
		    int i_145_
			= ((anInt11492 << 8 & 0xff00) + (anInt12078 & 0xff)
			   + class385.anInt4038 * 1368092161 * i);
		    if (i_143_ < 0)
			i_143_ = 0;
		    else if (i_143_ > 65535)
			i_143_ = 65535;
		    if (i_144_ < 0)
			i_144_ = 0;
		    else if (i_144_ > 65535)
			i_144_ = 65535;
		    if (i_145_ < 0)
			i_145_ = 0;
		    else if (i_145_ > 65535)
			i_145_ = 65535;
		    anInt11492 &= ~0xffffff;
		    anInt11492 |= (((i_143_ & 0xff00) << 8) + (i_144_ & 0xff00)
				   + ((i_145_ & 0xff00) >> 8));
		    anInt12078 &= ~0xffffff;
		    anInt12078 |= (((i_143_ & 0xff) << 16)
				   + ((i_144_ & 0xff) << 8) + (i_145_ & 0xff));
		}
		if (aShort12083 - aShort12074
		    <= class385.anInt4035 * 392975661) {
		    int i_146_ = ((anInt11492 >> 16 & 0xff00)
				  + (anInt12078 >> 24 & 0xff)
				  + class385.anInt4017 * -1647904787 * i);
		    if (i_146_ < 0)
			i_146_ = 0;
		    else if (i_146_ > 65535)
			i_146_ = 65535;
		    anInt11492 &= 0xffffff;
		    anInt11492 |= (i_146_ & 0xff00) << 16;
		    anInt12078 &= 0xffffff;
		    anInt12078 |= (i_146_ & 0xff) << 24;
		}
	    }
	    if (class385.anInt3979 * -2017057333 != -1
		&& (aShort12083 - aShort12074
		    <= class385.anInt4040 * -417293177))
		anInt12080 += class385.anInt3992 * -1030220067 * i;
	    if (class385.anInt3997 * 921858437 != -1
		&& (aShort12083 - aShort12074
		    <= class385.anInt4028 * -1191739965))
		anInt11497 += class385.anInt4043 * -785469931 * i;
	    if (aShort12079 != 0)
		aShort11499 = (short) (aShort11499 + aShort12079 * i & 0x3fff);
	    double d = (double) aShort12077;
	    double d_147_ = (double) aShort12081;
	    double d_148_ = (double) aShort12082;
	    boolean bool = false;
	    if (class385.anInt3977 * 912233891 == 1) {
		int i_149_ = i_140_ - (aClass615_12076.aClass621_8044.anInt8123
				       * -1481682457);
		int i_150_
		    = (i_141_
		       - aClass615_12076.aClass621_8044.anInt8125 * 379767745);
		int i_151_
		    = (i_142_
		       - aClass615_12076.aClass621_8044.anInt8121 * 702655677);
		int i_152_ = ((int) Math.sqrt((double) (i_149_ * i_149_
							+ i_150_ * i_150_
							+ i_151_ * i_151_))
			      >> 2);
		long l_153_
		    = (long) (class385.anInt4007 * -1840765811 * i_152_ * i);
		anInt12080 -= (long) anInt12080 * l_153_ >> 18;
	    } else if (class385.anInt3977 * 912233891 == 2) {
		int i_154_ = i_140_ - (aClass615_12076.aClass621_8044.anInt8123
				       * -1481682457);
		int i_155_
		    = (i_141_
		       - aClass615_12076.aClass621_8044.anInt8125 * 379767745);
		int i_156_
		    = (i_142_
		       - aClass615_12076.aClass621_8044.anInt8121 * 702655677);
		int i_157_
		    = i_154_ * i_154_ + i_155_ * i_155_ + i_156_ * i_156_;
		long l_158_
		    = (long) (class385.anInt4007 * -1840765811 * i_157_ * i);
		anInt12080 -= (long) anInt12080 * l_158_ >> 28;
	    }
	    if (class385.anIntArray3995 != null) {
		Iterator iterator = class629.aList8185.iterator();
		while (iterator.hasNext()) {
		    Class534_Sub32 class534_sub32
			= (Class534_Sub32) iterator.next();
		    Class384 class384 = class534_sub32.aClass384_10700;
		    if (class384.anInt3954 * 302557339 != 1) {
			boolean bool_159_ = false;
			for (int i_160_ = 0;
			     i_160_ < class385.anIntArray3995.length;
			     i_160_++) {
			    if (class385.anIntArray3995[i_160_]
				== class384.anInt3966 * -468701739) {
				bool_159_ = true;
				break;
			    }
			}
			if (bool_159_) {
			    double d_161_
				= (double) (i_140_ - (class534_sub32.anInt10698
						      * 1976650109));
			    double d_162_
				= (double) (i_141_ - (class534_sub32.anInt10699
						      * -1755035597));
			    double d_163_
				= (double) (i_142_ - (class534_sub32.anInt10696
						      * 1860160463));
			    double d_164_ = (d_161_ * d_161_ + d_162_ * d_162_
					     + d_163_ * d_163_);
			    if (!(d_164_
				  > (double) (class384.aLong3944
					      * -2285738288332836045L))) {
				double d_165_ = Math.sqrt(d_164_);
				if (d_165_ == 0.0)
				    d_165_ = 1.0;
				double d_166_
				    = (((d_161_
					 * (double) class534_sub32.aFloat10701)
					+ d_162_ * (double) (class384.anInt3957
							     * 829166933)
					+ d_163_ * (double) (class534_sub32
							     .aFloat10697))
				       * 65535.0
				       / ((double) (class384.anInt3964
						    * 367776947)
					  * d_165_));
				if (!(d_166_ < (double) (class384.anInt3965
							 * -120702217))) {
				    double d_167_ = 0.0;
				    if (class384.anInt3959 * 256549879 == 1)
					d_167_
					    = (d_165_ / 16.0
					       * (double) (class384.anInt3960
							   * -533022681));
				    else if (class384.anInt3959 * 256549879
					     == 2)
					d_167_
					    = (d_165_ / 16.0 * (d_165_ / 16.0)
					       * (double) (class384.anInt3960
							   * -533022681));
				    if (class384.anInt3962 * 439456515 == 0) {
					if (class384.anInt3961 * -1281619979
					    == 0) {
					    d += ((double) (class534_sub32
							    .aFloat10701)
						  - d_167_) * (double) i;
					    d_147_ += ((double) ((class384
								  .anInt3957)
								 * 829166933)
						       - d_167_) * (double) i;
					    d_148_ += ((double) (class534_sub32
								 .aFloat10697)
						       - d_167_) * (double) i;
					    bool = true;
					} else {
					    anInt11491
						+= ((double) (class534_sub32
							      .aFloat10701)
						    - d_167_) * (double) i;
					    anInt11495
						+= ((double) ((class384
							       .anInt3957)
							      * 829166933)
						    - d_167_) * (double) i;
					    anInt11496
						+= ((double) (class534_sub32
							      .aFloat10697)
						    - d_167_) * (double) i;
					}
				    } else {
					double d_168_
					    = (d_161_ / d_165_
					       * (double) (class384.anInt3964
							   * 367776947));
					double d_169_
					    = (d_162_ / d_165_
					       * (double) (class384.anInt3964
							   * 367776947));
					double d_170_
					    = (d_163_ / d_165_
					       * (double) (class384.anInt3964
							   * 367776947));
					if (class384.anInt3961 * -1281619979
					    == 0) {
					    d += d_168_ * (double) i;
					    d_147_ += d_169_ * (double) i;
					    d_148_ += d_170_ * (double) i;
					    bool = true;
					} else {
					    anInt11491 += d_168_ * (double) i;
					    anInt11495 += d_169_ * (double) i;
					    anInt11496 += d_170_ * (double) i;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	    if (class385.anIntArray4016 != null) {
		for (int i_171_ = 0; i_171_ < class385.anIntArray4016.length;
		     i_171_++) {
		    Class534_Sub32 class534_sub32
			= ((Class534_Sub32)
			   (Class625.aClass9_8155.method579
			    ((long) class385.anIntArray4016[i_171_])));
		    while (class534_sub32 != null) {
			Class384 class384 = class534_sub32.aClass384_10700;
			double d_172_
			    = (double) (i_140_ - (class534_sub32.anInt10698
						  * 1976650109));
			double d_173_
			    = (double) (i_141_ - (class534_sub32.anInt10699
						  * -1755035597));
			double d_174_
			    = (double) (i_142_ - (class534_sub32.anInt10696
						  * 1860160463));
			double d_175_ = (d_172_ * d_172_ + d_173_ * d_173_
					 + d_174_ * d_174_);
			if (d_175_ > (double) (class384.aLong3944
					       * -2285738288332836045L))
			    class534_sub32
				= ((Class534_Sub32)
				   Class625.aClass9_8155.method582(938209413));
			else {
			    double d_176_ = Math.sqrt(d_175_);
			    if (d_176_ == 0.0)
				d_176_ = 1.0;
			    if (class384.anInt3958 * 1148988209 > 0
				&& class384.anInt3958 * 1148988209 < 2047) {
				double d_177_
				    = (((d_172_
					 * (double) class534_sub32.aFloat10701)
					+ d_173_ * (double) (class384.anInt3957
							     * 829166933)
					+ d_174_ * (double) (class534_sub32
							     .aFloat10697))
				       * 16384.0
				       / ((double) (class384.anInt3964
						    * 367776947)
					  * d_176_));
				if (d_177_ < (double) (class384.anInt3965
						       * -120702217)) {
				    class534_sub32
					= ((Class534_Sub32)
					   Class625.aClass9_8155
					       .method582(1328648814));
				    continue;
				}
			    }
			    double d_178_ = 0.0;
			    if (class384.anInt3959 * 256549879 == 1)
				d_178_ = (d_176_ / 16.0
					  * (double) (class384.anInt3960
						      * -533022681));
			    else if (class384.anInt3959 * 256549879 == 2)
				d_178_ = (d_176_ / 16.0 * (d_176_ / 16.0)
					  * (double) (class384.anInt3960
						      * -533022681));
			    if (class384.anInt3962 * 439456515 == 0) {
				if (class384.anInt3961 * -1281619979 == 0) {
				    d += ((double) class534_sub32.aFloat10701
					  - d_178_) * (double) i;
				    d_147_ += ((double) (class384.anInt3957
							 * 829166933)
					       - d_178_) * (double) i;
				    d_148_
					+= ((double) class534_sub32.aFloat10697
					    - d_178_) * (double) i;
				    bool = true;
				} else {
				    anInt11491
					+= ((double) class534_sub32.aFloat10701
					    - d_178_) * (double) i;
				    anInt11495 += ((double) (class384.anInt3957
							     * 829166933)
						   - d_178_) * (double) i;
				    anInt11496
					+= ((double) class534_sub32.aFloat10697
					    - d_178_) * (double) i;
				}
			    } else {
				double d_179_ = (d_172_ / d_176_
						 * (double) (class384.anInt3964
							     * 367776947));
				double d_180_ = (d_173_ / d_176_
						 * (double) (class384.anInt3964
							     * 367776947));
				double d_181_ = (d_174_ / d_176_
						 * (double) (class384.anInt3964
							     * 367776947));
				if (class384.anInt3961 * -1281619979 == 0) {
				    d += d_179_ * (double) i;
				    d_147_ += d_180_ * (double) i;
				    d_148_ += d_181_ * (double) i;
				    bool = true;
				} else {
				    anInt11491 += d_179_ * (double) i;
				    anInt11495 += d_180_ * (double) i;
				    anInt11496 += d_181_ * (double) i;
				}
			    }
			    class534_sub32
				= ((Class534_Sub32)
				   Class625.aClass9_8155.method582(944476011));
			}
		    }
		}
	    }
	    if (class385.anIntArray3998 != null) {
		if (class385.anIntArray4018 == null) {
		    class385.anIntArray4018
			= new int[class385.anIntArray3998.length];
		    for (int i_182_ = 0;
			 i_182_ < class385.anIntArray3998.length; i_182_++) {
			Class625.anInterface46_8159.method345((class385
							       .anIntArray3998
							       [i_182_]),
							      -404064168);
			class385.anIntArray4018[i_182_]
			    = Class393.method6556((class385.anIntArray3998
						   [i_182_]),
						  (byte) 123);
		    }
		}
		for (int i_183_ = 0; i_183_ < class385.anIntArray4018.length;
		     i_183_++) {
		    Class384 class384 = (Class625.aClass384Array8160
					 [class385.anIntArray4018[i_183_]]);
		    if (class384.anInt3961 * -1281619979 == 0) {
			d += (double) (class384.anInt3945 * -1058410147 * i);
			d_147_
			    += (double) (class384.anInt3957 * 829166933 * i);
			d_148_
			    += (double) (class384.anInt3953 * 894885741 * i);
			bool = true;
		    } else {
			anInt11491 += class384.anInt3945 * -1058410147 * i;
			anInt11495 += class384.anInt3957 * 829166933 * i;
			anInt11496 += class384.anInt3953 * 894885741 * i;
		    }
		}
	    }
	    if (bool) {
		while (d > 32767.0 || d_147_ > 32767.0 || d_148_ > 32767.0
		       || d < -32767.0 || d_147_ < -32767.0
		       || d_148_ < -32767.0) {
		    d /= 2.0;
		    d_147_ /= 2.0;
		    d_148_ /= 2.0;
		    anInt12080 <<= 1;
		}
		aShort12077 = (short) (int) d;
		aShort12081 = (short) (int) d_147_;
		aShort12082 = (short) (int) d_148_;
	    }
	    anInt11491 += ((long) aShort12077 * (long) (anInt12080 << 2)
			   >> 23) * (long) i;
	    anInt11495 += ((long) aShort12081 * (long) (anInt12080 << 2)
			   >> 23) * (long) i;
	    anInt11496 += ((long) aShort12082 * (long) (anInt12080 << 2)
			   >> 23) * (long) i;
	}
    }
    
    void method18695(Class556 class556, Class185 class185, long l) {
	int i = anInt11491 >> 12 + class556.anInt7422 * 941710601;
	int i_184_ = anInt11496 >> 12 + class556.anInt7422 * 941710601;
	int i_185_ = anInt11495 >> 12;
	if (i_185_ > 262144 || i_185_ < -262144 || i < 0
	    || i >= class556.anInt7435 * 1183912005 || i_184_ < 0
	    || i_184_ >= class556.anInt7470 * 60330541)
	    method18689();
	else {
	    Class629 class629 = aClass615_12076.aClass629_8038;
	    Class385 class385 = aClass615_12076.aClass385_8037;
	    Class151[] class151s = class556.aClass151Array7432;
	    int i_186_ = class629.anInt8180;
	    Class568 class568 = (class556.aClass568ArrayArrayArray7431
				 [class629.anInt8180][i][i_184_]);
	    if (class568 != null)
		i_186_ = class568.aByte7599;
	    int i_187_ = class151s[i_186_].method2491(i, i_184_, 806307159);
	    int i_188_;
	    if (i_186_ < class556.anInt7418 * -1381097937 - 1)
		i_188_ = class151s[i_186_ + 1].method2491(i, i_184_, 52661699);
	    else
		i_188_ = i_187_ - (8 << class556.anInt7422 * 941710601);
	    if (class385.aBool4014) {
		if (class385.anInt4001 * 2042652149 == -1 && i_185_ > i_187_) {
		    method18689();
		    return;
		}
		if (class385.anInt4001 * 2042652149 >= 0
		    && i_185_ > class151s[class385.anInt4001 * 2042652149]
				    .method2491(i, i_184_, -778113360)) {
		    method18689();
		    return;
		}
		if (class385.anInt4002 * 1736785337 == -1 && i_185_ < i_188_) {
		    method18689();
		    return;
		}
		if (class385.anInt4002 * 1736785337 >= 0
		    && i_185_ < class151s
				    [class385.anInt4002 * 1736785337 + 1]
				    .method2491(i, i_184_, -583412694)) {
		    method18689();
		    return;
		}
	    }
	    int i_189_;
	    for (i_189_ = class556.anInt7418 * -1381097937 - 1;
		 (i_189_ > 0
		  && i_185_ > class151s[i_189_].method2491(i, i_184_,
							   957993371));
		 i_189_--) {
		/* empty */
	    }
	    if (class385.aBool4019 && i_189_ == 0
		&& i_185_ > class151s[0].method2491(i, i_184_, 650198942))
		method18689();
	    else if (i_189_ == class556.anInt7418 * -1381097937 - 1
		     && (class151s[i_189_].method2491(i, i_184_, 707872039)
			 - i_185_) > 8 << class556.anInt7422 * 941710601)
		method18689();
	    else {
		class568
		    = class556.aClass568ArrayArrayArray7431[i_189_][i][i_184_];
		if (class568 == null) {
		    if (i_189_ == 0
			|| (class556.aClass568ArrayArrayArray7431[0][i][i_184_]
			    == null))
			class568 = class556.aClass568ArrayArrayArray7431[0]
				       [i][i_184_] = new Class568(0);
		    boolean bool = ((class556.aClass568ArrayArrayArray7431[0]
				     [i][i_184_].aClass568_7605)
				    != null);
		    if (i_189_ == 3 && bool)
			i_189_--;
		    for (int i_190_ = 1; i_190_ <= i_189_; i_190_++) {
			if ((class556.aClass568ArrayArrayArray7431[i_190_][i]
			     [i_184_])
			    == null) {
			    class568
				= class556.aClass568ArrayArrayArray7431
				      [i_190_][i][i_184_]
				= new Class568(i_190_);
			    if (bool)
				class568.aByte7599++;
			}
		    }
		    if (class568 == null)
			class568 = (class556.aClass568ArrayArrayArray7431
				    [i_189_][i][i_184_]);
		}
		if (class385.aBool4020) {
		    int i_191_ = anInt11491 >> 12;
		    int i_192_ = anInt11496 >> 12;
		    if (class568.aClass654_Sub1_Sub1_7598 != null) {
			Class564 class564
			    = class568.aClass654_Sub1_Sub1_7598
				  .method16855(class185, (short) 18173);
			if (class564 != null
			    && class564.method9517(i_191_, i_185_, i_192_)) {
			    method18689();
			    return;
			}
		    }
		    if (class568.aClass654_Sub1_Sub1_7597 != null) {
			Class564 class564
			    = class568.aClass654_Sub1_Sub1_7597
				  .method16855(class185, (short) 31854);
			if (class564 != null
			    && class564.method9517(i_191_, i_185_, i_192_)) {
			    method18689();
			    return;
			}
		    }
		    if (class568.aClass654_Sub1_Sub2_7607 != null) {
			Class564 class564
			    = class568.aClass654_Sub1_Sub2_7607
				  .method16855(class185, (short) 10875);
			if (class564 != null
			    && class564.method9517(i_191_, i_185_, i_192_)) {
			    method18689();
			    return;
			}
		    }
		    for (Class559 class559 = class568.aClass559_7604;
			 class559 != null;
			 class559 = class559.aClass559_7497) {
			Class564 class564
			    = class559.aClass654_Sub1_Sub5_7500
				  .method16855(class185, (short) 22799);
			if (class564 != null
			    && class564.method9517(i_191_, i_185_, i_192_)) {
			    method18689();
			    return;
			}
		    }
		}
		class629.aClass174_8190.aClass701_1837.method14203(this,
								   -750452177);
	    }
	}
    }
    
    void method18696(Class556 class556, Class185 class185, long l) {
	int i = anInt11491 >> 12 + class556.anInt7422 * 941710601;
	int i_193_ = anInt11496 >> 12 + class556.anInt7422 * 941710601;
	int i_194_ = anInt11495 >> 12;
	if (i_194_ > 262144 || i_194_ < -262144 || i < 0
	    || i >= class556.anInt7435 * 1183912005 || i_193_ < 0
	    || i_193_ >= class556.anInt7470 * 60330541)
	    method18689();
	else {
	    Class629 class629 = aClass615_12076.aClass629_8038;
	    Class385 class385 = aClass615_12076.aClass385_8037;
	    Class151[] class151s = class556.aClass151Array7432;
	    int i_195_ = class629.anInt8180;
	    Class568 class568 = (class556.aClass568ArrayArrayArray7431
				 [class629.anInt8180][i][i_193_]);
	    if (class568 != null)
		i_195_ = class568.aByte7599;
	    int i_196_ = class151s[i_195_].method2491(i, i_193_, -1989464541);
	    int i_197_;
	    if (i_195_ < class556.anInt7418 * -1381097937 - 1)
		i_197_
		    = class151s[i_195_ + 1].method2491(i, i_193_, 714018467);
	    else
		i_197_ = i_196_ - (8 << class556.anInt7422 * 941710601);
	    if (class385.aBool4014) {
		if (class385.anInt4001 * 2042652149 == -1 && i_194_ > i_196_) {
		    method18689();
		    return;
		}
		if (class385.anInt4001 * 2042652149 >= 0
		    && i_194_ > class151s[class385.anInt4001 * 2042652149]
				    .method2491(i, i_193_, 754751173)) {
		    method18689();
		    return;
		}
		if (class385.anInt4002 * 1736785337 == -1 && i_194_ < i_197_) {
		    method18689();
		    return;
		}
		if (class385.anInt4002 * 1736785337 >= 0
		    && i_194_ < class151s
				    [class385.anInt4002 * 1736785337 + 1]
				    .method2491(i, i_193_, 532736105)) {
		    method18689();
		    return;
		}
	    }
	    int i_198_;
	    for (i_198_ = class556.anInt7418 * -1381097937 - 1;
		 (i_198_ > 0
		  && i_194_ > class151s[i_198_].method2491(i, i_193_,
							   2116842722));
		 i_198_--) {
		/* empty */
	    }
	    if (class385.aBool4019 && i_198_ == 0
		&& i_194_ > class151s[0].method2491(i, i_193_, 245605810))
		method18689();
	    else if (i_198_ == class556.anInt7418 * -1381097937 - 1
		     && (class151s[i_198_].method2491(i, i_193_, -1896114048)
			 - i_194_) > 8 << class556.anInt7422 * 941710601)
		method18689();
	    else {
		class568
		    = class556.aClass568ArrayArrayArray7431[i_198_][i][i_193_];
		if (class568 == null) {
		    if (i_198_ == 0
			|| (class556.aClass568ArrayArrayArray7431[0][i][i_193_]
			    == null))
			class568 = class556.aClass568ArrayArrayArray7431[0]
				       [i][i_193_] = new Class568(0);
		    boolean bool = ((class556.aClass568ArrayArrayArray7431[0]
				     [i][i_193_].aClass568_7605)
				    != null);
		    if (i_198_ == 3 && bool)
			i_198_--;
		    for (int i_199_ = 1; i_199_ <= i_198_; i_199_++) {
			if ((class556.aClass568ArrayArrayArray7431[i_199_][i]
			     [i_193_])
			    == null) {
			    class568
				= class556.aClass568ArrayArrayArray7431
				      [i_199_][i][i_193_]
				= new Class568(i_199_);
			    if (bool)
				class568.aByte7599++;
			}
		    }
		    if (class568 == null)
			class568 = (class556.aClass568ArrayArrayArray7431
				    [i_198_][i][i_193_]);
		}
		if (class385.aBool4020) {
		    int i_200_ = anInt11491 >> 12;
		    int i_201_ = anInt11496 >> 12;
		    if (class568.aClass654_Sub1_Sub1_7598 != null) {
			Class564 class564
			    = class568.aClass654_Sub1_Sub1_7598
				  .method16855(class185, (short) 12735);
			if (class564 != null
			    && class564.method9517(i_200_, i_194_, i_201_)) {
			    method18689();
			    return;
			}
		    }
		    if (class568.aClass654_Sub1_Sub1_7597 != null) {
			Class564 class564
			    = class568.aClass654_Sub1_Sub1_7597
				  .method16855(class185, (short) 25908);
			if (class564 != null
			    && class564.method9517(i_200_, i_194_, i_201_)) {
			    method18689();
			    return;
			}
		    }
		    if (class568.aClass654_Sub1_Sub2_7607 != null) {
			Class564 class564
			    = class568.aClass654_Sub1_Sub2_7607
				  .method16855(class185, (short) 16563);
			if (class564 != null
			    && class564.method9517(i_200_, i_194_, i_201_)) {
			    method18689();
			    return;
			}
		    }
		    for (Class559 class559 = class568.aClass559_7604;
			 class559 != null;
			 class559 = class559.aClass559_7497) {
			Class564 class564
			    = class559.aClass654_Sub1_Sub5_7500
				  .method16855(class185, (short) 20938);
			if (class564 != null
			    && class564.method9517(i_200_, i_194_, i_201_)) {
			    method18689();
			    return;
			}
		    }
		}
		class629.aClass174_8190.aClass701_1837
		    .method14203(this, -1252161845);
	    }
	}
    }
    
    void method18697(Class556 class556, Class185 class185, long l) {
	int i = anInt11491 >> 12 + class556.anInt7422 * 941710601;
	int i_202_ = anInt11496 >> 12 + class556.anInt7422 * 941710601;
	int i_203_ = anInt11495 >> 12;
	if (i_203_ > 262144 || i_203_ < -262144 || i < 0
	    || i >= class556.anInt7435 * 1183912005 || i_202_ < 0
	    || i_202_ >= class556.anInt7470 * 60330541)
	    method18689();
	else {
	    Class629 class629 = aClass615_12076.aClass629_8038;
	    Class385 class385 = aClass615_12076.aClass385_8037;
	    Class151[] class151s = class556.aClass151Array7432;
	    int i_204_ = class629.anInt8180;
	    Class568 class568 = (class556.aClass568ArrayArrayArray7431
				 [class629.anInt8180][i][i_202_]);
	    if (class568 != null)
		i_204_ = class568.aByte7599;
	    int i_205_ = class151s[i_204_].method2491(i, i_202_, 1804256096);
	    int i_206_;
	    if (i_204_ < class556.anInt7418 * -1381097937 - 1)
		i_206_
		    = class151s[i_204_ + 1].method2491(i, i_202_, 278342550);
	    else
		i_206_ = i_205_ - (8 << class556.anInt7422 * 941710601);
	    if (class385.aBool4014) {
		if (class385.anInt4001 * 2042652149 == -1 && i_203_ > i_205_) {
		    method18689();
		    return;
		}
		if (class385.anInt4001 * 2042652149 >= 0
		    && i_203_ > class151s[class385.anInt4001 * 2042652149]
				    .method2491(i, i_202_, -1352780327)) {
		    method18689();
		    return;
		}
		if (class385.anInt4002 * 1736785337 == -1 && i_203_ < i_206_) {
		    method18689();
		    return;
		}
		if (class385.anInt4002 * 1736785337 >= 0
		    && i_203_ < class151s
				    [class385.anInt4002 * 1736785337 + 1]
				    .method2491(i, i_202_, 345783396)) {
		    method18689();
		    return;
		}
	    }
	    int i_207_;
	    for (i_207_ = class556.anInt7418 * -1381097937 - 1;
		 (i_207_ > 0
		  && i_203_ > class151s[i_207_].method2491(i, i_202_,
							   1572160456));
		 i_207_--) {
		/* empty */
	    }
	    if (class385.aBool4019 && i_207_ == 0
		&& i_203_ > class151s[0].method2491(i, i_202_, -391668548))
		method18689();
	    else if (i_207_ == class556.anInt7418 * -1381097937 - 1
		     && (class151s[i_207_].method2491(i, i_202_, -1349370373)
			 - i_203_) > 8 << class556.anInt7422 * 941710601)
		method18689();
	    else {
		class568
		    = class556.aClass568ArrayArrayArray7431[i_207_][i][i_202_];
		if (class568 == null) {
		    if (i_207_ == 0
			|| (class556.aClass568ArrayArrayArray7431[0][i][i_202_]
			    == null))
			class568 = class556.aClass568ArrayArrayArray7431[0]
				       [i][i_202_] = new Class568(0);
		    boolean bool = ((class556.aClass568ArrayArrayArray7431[0]
				     [i][i_202_].aClass568_7605)
				    != null);
		    if (i_207_ == 3 && bool)
			i_207_--;
		    for (int i_208_ = 1; i_208_ <= i_207_; i_208_++) {
			if ((class556.aClass568ArrayArrayArray7431[i_208_][i]
			     [i_202_])
			    == null) {
			    class568
				= class556.aClass568ArrayArrayArray7431
				      [i_208_][i][i_202_]
				= new Class568(i_208_);
			    if (bool)
				class568.aByte7599++;
			}
		    }
		    if (class568 == null)
			class568 = (class556.aClass568ArrayArrayArray7431
				    [i_207_][i][i_202_]);
		}
		if (class385.aBool4020) {
		    int i_209_ = anInt11491 >> 12;
		    int i_210_ = anInt11496 >> 12;
		    if (class568.aClass654_Sub1_Sub1_7598 != null) {
			Class564 class564
			    = class568.aClass654_Sub1_Sub1_7598
				  .method16855(class185, (short) 22804);
			if (class564 != null
			    && class564.method9517(i_209_, i_203_, i_210_)) {
			    method18689();
			    return;
			}
		    }
		    if (class568.aClass654_Sub1_Sub1_7597 != null) {
			Class564 class564
			    = class568.aClass654_Sub1_Sub1_7597
				  .method16855(class185, (short) 2444);
			if (class564 != null
			    && class564.method9517(i_209_, i_203_, i_210_)) {
			    method18689();
			    return;
			}
		    }
		    if (class568.aClass654_Sub1_Sub2_7607 != null) {
			Class564 class564
			    = class568.aClass654_Sub1_Sub2_7607
				  .method16855(class185, (short) 17290);
			if (class564 != null
			    && class564.method9517(i_209_, i_203_, i_210_)) {
			    method18689();
			    return;
			}
		    }
		    for (Class559 class559 = class568.aClass559_7604;
			 class559 != null;
			 class559 = class559.aClass559_7497) {
			Class564 class564
			    = class559.aClass654_Sub1_Sub5_7500
				  .method16855(class185, (short) 2337);
			if (class564 != null
			    && class564.method9517(i_209_, i_203_, i_210_)) {
			    method18689();
			    return;
			}
		    }
		}
		class629.aClass174_8190.aClass701_1837.method14203(this,
								   293802031);
	    }
	}
    }
    
    void method18698() {
	aClass615_12076.aClass629_8038.aClass536_Sub2_Sub1_Sub1Array8179
	    [aShort12075]
	    = null;
	Class625.aClass536_Sub2_Sub1_Sub1Array8152[(Class625.anInt8157
						    * -676793059)]
	    = this;
	Class625.anInt8157
	    = (Class625.anInt8157 * -676793059 + 1 & 0x3ff) * -1798605515;
	method8900(809925390);
	method15973(1214266234);
    }
    
    void method18699(Class556 class556, Class185 class185, long l) {
	int i = anInt11491 >> 12 + class556.anInt7422 * 941710601;
	int i_211_ = anInt11496 >> 12 + class556.anInt7422 * 941710601;
	int i_212_ = anInt11495 >> 12;
	if (i_212_ > 262144 || i_212_ < -262144 || i < 0
	    || i >= class556.anInt7435 * 1183912005 || i_211_ < 0
	    || i_211_ >= class556.anInt7470 * 60330541)
	    method18689();
	else {
	    Class629 class629 = aClass615_12076.aClass629_8038;
	    Class385 class385 = aClass615_12076.aClass385_8037;
	    Class151[] class151s = class556.aClass151Array7432;
	    int i_213_ = class629.anInt8180;
	    Class568 class568 = (class556.aClass568ArrayArrayArray7431
				 [class629.anInt8180][i][i_211_]);
	    if (class568 != null)
		i_213_ = class568.aByte7599;
	    int i_214_ = class151s[i_213_].method2491(i, i_211_, 1347527787);
	    int i_215_;
	    if (i_213_ < class556.anInt7418 * -1381097937 - 1)
		i_215_
		    = class151s[i_213_ + 1].method2491(i, i_211_, -2006741367);
	    else
		i_215_ = i_214_ - (8 << class556.anInt7422 * 941710601);
	    if (class385.aBool4014) {
		if (class385.anInt4001 * 2042652149 == -1 && i_212_ > i_214_) {
		    method18689();
		    return;
		}
		if (class385.anInt4001 * 2042652149 >= 0
		    && i_212_ > class151s[class385.anInt4001 * 2042652149]
				    .method2491(i, i_211_, 1573511777)) {
		    method18689();
		    return;
		}
		if (class385.anInt4002 * 1736785337 == -1 && i_212_ < i_215_) {
		    method18689();
		    return;
		}
		if (class385.anInt4002 * 1736785337 >= 0
		    && i_212_ < class151s
				    [class385.anInt4002 * 1736785337 + 1]
				    .method2491(i, i_211_, 1721568355)) {
		    method18689();
		    return;
		}
	    }
	    int i_216_;
	    for (i_216_ = class556.anInt7418 * -1381097937 - 1;
		 (i_216_ > 0
		  && i_212_ > class151s[i_216_].method2491(i, i_211_,
							   -1086016449));
		 i_216_--) {
		/* empty */
	    }
	    if (class385.aBool4019 && i_216_ == 0
		&& i_212_ > class151s[0].method2491(i, i_211_, 104215273))
		method18689();
	    else if (i_216_ == class556.anInt7418 * -1381097937 - 1
		     && (class151s[i_216_].method2491(i, i_211_, 1256149273)
			 - i_212_) > 8 << class556.anInt7422 * 941710601)
		method18689();
	    else {
		class568
		    = class556.aClass568ArrayArrayArray7431[i_216_][i][i_211_];
		if (class568 == null) {
		    if (i_216_ == 0
			|| (class556.aClass568ArrayArrayArray7431[0][i][i_211_]
			    == null))
			class568 = class556.aClass568ArrayArrayArray7431[0]
				       [i][i_211_] = new Class568(0);
		    boolean bool = ((class556.aClass568ArrayArrayArray7431[0]
				     [i][i_211_].aClass568_7605)
				    != null);
		    if (i_216_ == 3 && bool)
			i_216_--;
		    for (int i_217_ = 1; i_217_ <= i_216_; i_217_++) {
			if ((class556.aClass568ArrayArrayArray7431[i_217_][i]
			     [i_211_])
			    == null) {
			    class568
				= class556.aClass568ArrayArrayArray7431
				      [i_217_][i][i_211_]
				= new Class568(i_217_);
			    if (bool)
				class568.aByte7599++;
			}
		    }
		    if (class568 == null)
			class568 = (class556.aClass568ArrayArrayArray7431
				    [i_216_][i][i_211_]);
		}
		if (class385.aBool4020) {
		    int i_218_ = anInt11491 >> 12;
		    int i_219_ = anInt11496 >> 12;
		    if (class568.aClass654_Sub1_Sub1_7598 != null) {
			Class564 class564
			    = class568.aClass654_Sub1_Sub1_7598
				  .method16855(class185, (short) 15574);
			if (class564 != null
			    && class564.method9517(i_218_, i_212_, i_219_)) {
			    method18689();
			    return;
			}
		    }
		    if (class568.aClass654_Sub1_Sub1_7597 != null) {
			Class564 class564
			    = class568.aClass654_Sub1_Sub1_7597
				  .method16855(class185, (short) 17782);
			if (class564 != null
			    && class564.method9517(i_218_, i_212_, i_219_)) {
			    method18689();
			    return;
			}
		    }
		    if (class568.aClass654_Sub1_Sub2_7607 != null) {
			Class564 class564
			    = class568.aClass654_Sub1_Sub2_7607
				  .method16855(class185, (short) 13799);
			if (class564 != null
			    && class564.method9517(i_218_, i_212_, i_219_)) {
			    method18689();
			    return;
			}
		    }
		    for (Class559 class559 = class568.aClass559_7604;
			 class559 != null;
			 class559 = class559.aClass559_7497) {
			Class564 class564
			    = class559.aClass654_Sub1_Sub5_7500
				  .method16855(class185, (short) 17614);
			if (class564 != null
			    && class564.method9517(i_218_, i_212_, i_219_)) {
			    method18689();
			    return;
			}
		    }
		}
		class629.aClass174_8190.aClass701_1837
		    .method14203(this, -1859255633);
	    }
	}
    }
    
    void method18700() {
	aClass615_12076.aClass629_8038.aClass536_Sub2_Sub1_Sub1Array8179
	    [aShort12075]
	    = null;
	Class625.aClass536_Sub2_Sub1_Sub1Array8152[(Class625.anInt8157
						    * -676793059)]
	    = this;
	Class625.anInt8157
	    = (Class625.anInt8157 * -676793059 + 1 & 0x3ff) * -1798605515;
	method8900(992232369);
	method15973(1214266234);
    }
}
