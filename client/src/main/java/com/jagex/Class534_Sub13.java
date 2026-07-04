/* Class534_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class534_Sub13 extends Class534
{
    float[][] aFloatArrayArray10443;
    int anInt10444;
    int anInt10445;
    Class185_Sub1 aClass185_Sub1_10446;
    Class151_Sub2 aClass151_Sub2_10447;
    float[][] aFloatArrayArray10448;
    int anInt10449;
    int anInt10450 = 0;
    int anInt10451;
    int anInt10452;
    Interface39 anInterface39_10453;
    Interface37 anInterface37_10454;
    int anInt10455;
    float[][] aFloatArrayArray10456;
    Class534_Sub21 aClass534_Sub21_10457;
    Class9 aClass9_10458;
    ByteBuffer aByteBuffer10459;
    
    void method16134() {
	anInterface39_10453 = aClass185_Sub1_10446.method14971(false);
	anInterface39_10453.method277(anInt10452);
	anInterface37_10454 = aClass185_Sub1_10446.method14698(false);
	anInterface37_10454.method236(anInt10450 * 16, 16);
	anInterface37_10454.method235(0, anInt10450 * 16,
				      aClass185_Sub1_10446.aLong9139);
	anInterface39_10453.method235(0, anInt10452 * 2,
				      (aClass185_Sub1_10446.aLong9139
				       + (long) (aClass185_Sub1_10446.anInt9243
						 >> 1)));
    }
    
    Class534_Sub13(Class185_Sub1 class185_sub1, Class151_Sub2 class151_sub2,
		   Class534_Sub21 class534_sub21, int[] is) {
	anInt10444 = 0;
	anInt10452 = 0;
	aClass185_Sub1_10446 = class185_sub1;
	aClass534_Sub21_10457 = class534_sub21;
	aClass151_Sub2_10447 = class151_sub2;
	int i = (aClass534_Sub21_10457.method16233(128026151)
		 - (class151_sub2.anInt1702 * 127780559 >> 1));
	anInt10451 = (aClass534_Sub21_10457.method16197(-1701870109) - i
		      >> class151_sub2.anInt1703 * -1495101509);
	anInt10455 = (aClass534_Sub21_10457.method16197(1710008721) + i
		      >> class151_sub2.anInt1703 * -1495101509);
	anInt10445 = (aClass534_Sub21_10457.method16199((byte) -113) - i
		      >> class151_sub2.anInt1703 * -1495101509);
	anInt10449 = (aClass534_Sub21_10457.method16199((byte) -26) + i
		      >> class151_sub2.anInt1703 * -1495101509);
	int i_0_ = anInt10455 - anInt10451 + 1;
	int i_1_ = anInt10449 - anInt10445 + 1;
	aFloatArrayArray10443 = new float[i_0_ + 1][i_1_ + 1];
	aFloatArrayArray10456 = new float[i_0_ + 1][i_1_ + 1];
	aFloatArrayArray10448 = new float[i_0_ + 1][i_1_ + 1];
	for (int i_2_ = 0; i_2_ <= i_1_; i_2_++) {
	    int i_3_ = i_2_ + anInt10445;
	    if (i_3_ > 0
		&& i_3_ < aClass151_Sub2_10447.anInt1700 * -1466328823 - 1) {
		for (int i_4_ = 0; i_4_ <= i_0_; i_4_++) {
		    int i_5_ = i_4_ + anInt10451;
		    if (i_5_ > 0
			&& i_5_ < (aClass151_Sub2_10447.anInt1701 * -1924295585
				   - 1)) {
			int i_6_ = (class151_sub2.method2491(i_5_ + 1, i_3_,
							     185914353)
				    - class151_sub2.method2491(i_5_ - 1, i_3_,
							       1431954195));
			int i_7_ = (class151_sub2.method2491(i_5_, i_3_ + 1,
							     1555513027)
				    - class151_sub2.method2491(i_5_, i_3_ - 1,
							       -532239586));
			float f
			    = (float) (1.0
				       / Math.sqrt((double) (i_6_ * i_6_
							     + 65536
							     + i_7_ * i_7_)));
			aFloatArrayArray10443[i_4_][i_2_] = (float) i_6_ * f;
			aFloatArrayArray10456[i_4_][i_2_] = -256.0F * f;
			aFloatArrayArray10448[i_4_][i_2_] = (float) i_7_ * f;
		    }
		}
	    }
	}
	int i_8_ = 0;
	for (int i_9_ = anInt10445; i_9_ <= anInt10449; i_9_++) {
	    if (i_9_ >= 0 && i_9_ < class151_sub2.anInt1700 * -1466328823) {
		for (int i_10_ = anInt10451; i_10_ <= anInt10455; i_10_++) {
		    if (i_10_ >= 0
			&& i_10_ < class151_sub2.anInt1701 * -1924295585) {
			int i_11_ = is[i_8_];
			int[] is_12_ = (class151_sub2.anIntArrayArrayArray9388
					[i_10_][i_9_]);
			if (is_12_ != null && i_11_ != 0) {
			    if (i_11_ == 1) {
				for (int i_13_ = 0; i_13_ < is_12_.length;
				     i_13_ += 3) {
				    if (is_12_[i_13_] != -1
					&& is_12_[i_13_ + 1] != -1
					&& is_12_[i_13_ + 2] != -1)
					anInt10444 += 3;
				}
			    } else
				anInt10444 += 3;
			}
		    }
		    i_8_++;
		}
	    } else
		i_8_ += anInt10455 - anInt10451;
	}
	if (anInt10444 > 0) {
	    aClass9_10458
		= new Class9(Class162.method2640(anInt10444, (byte) 50));
	    aByteBuffer10459 = aClass185_Sub1_10446.aByteBuffer9266;
	    aByteBuffer10459.clear();
	    aByteBuffer10459.position(aClass185_Sub1_10446.anInt9243 >> 1);
	    aByteBuffer10459.slice();
	    aByteBuffer10459.position(0);
	    aByteBuffer10459.limit(aClass185_Sub1_10446.anInt9243 >> 1);
	    int i_14_ = 0;
	    i_8_ = 0;
	    for (int i_15_ = anInt10445; i_15_ <= anInt10449; i_15_++) {
		if (i_15_ >= 0
		    && i_15_ < class151_sub2.anInt1700 * -1466328823) {
		    int i_16_ = 0;
		    for (int i_17_ = anInt10451; i_17_ <= anInt10455;
			 i_17_++) {
			if (i_17_ >= 0
			    && i_17_ < class151_sub2.anInt1701 * -1924295585) {
			    int i_18_ = is[i_8_];
			    int[] is_19_
				= (class151_sub2.anIntArrayArrayArray9388
				   [i_17_][i_15_]);
			    if (is_19_ != null && i_18_ != 0) {
				if (i_18_ == 1) {
				    int[] is_20_ = (class151_sub2
						    .anIntArrayArrayArray9384
						    [i_17_][i_15_]);
				    int[] is_21_ = (class151_sub2
						    .anIntArrayArrayArray9391
						    [i_17_][i_15_]);
				    int i_22_ = 0;
				    while (i_22_ < is_19_.length) {
					if (is_19_[i_22_] != -1
					    && is_19_[i_22_ + 1] != -1
					    && is_19_[i_22_ + 2] != -1) {
					    method16135(i_16_, i_14_, i_17_,
							i_15_, is_20_[i_22_],
							is_21_[i_22_]);
					    i_22_++;
					    method16135(i_16_, i_14_, i_17_,
							i_15_, is_20_[i_22_],
							is_21_[i_22_]);
					    i_22_++;
					    method16135(i_16_, i_14_, i_17_,
							i_15_, is_20_[i_22_],
							is_21_[i_22_]);
					    i_22_++;
					} else
					    i_22_ += 3;
				    }
				} else if (i_18_ == 3) {
				    method16135(i_16_, i_14_, i_17_, i_15_, 0,
						0);
				    method16135(i_16_, i_14_, i_17_, i_15_,
						(class151_sub2.anInt1702
						 * 127780559),
						0);
				    method16135(i_16_, i_14_, i_17_, i_15_, 0,
						(class151_sub2.anInt1702
						 * 127780559));
				} else if (i_18_ == 2) {
				    method16135(i_16_, i_14_, i_17_, i_15_,
						(class151_sub2.anInt1702
						 * 127780559),
						0);
				    method16135(i_16_, i_14_, i_17_, i_15_,
						(class151_sub2.anInt1702
						 * 127780559),
						(class151_sub2.anInt1702
						 * 127780559));
				    method16135(i_16_, i_14_, i_17_, i_15_, 0,
						0);
				} else if (i_18_ == 5) {
				    method16135(i_16_, i_14_, i_17_, i_15_,
						(class151_sub2.anInt1702
						 * 127780559),
						(class151_sub2.anInt1702
						 * 127780559));
				    method16135(i_16_, i_14_, i_17_, i_15_, 0,
						(class151_sub2.anInt1702
						 * 127780559));
				    method16135(i_16_, i_14_, i_17_, i_15_,
						(class151_sub2.anInt1702
						 * 127780559),
						0);
				} else if (i_18_ == 4) {
				    method16135(i_16_, i_14_, i_17_, i_15_, 0,
						(class151_sub2.anInt1702
						 * 127780559));
				    method16135(i_16_, i_14_, i_17_, i_15_, 0,
						0);
				    method16135(i_16_, i_14_, i_17_, i_15_,
						(class151_sub2.anInt1702
						 * 127780559),
						(class151_sub2.anInt1702
						 * 127780559));
				}
			    }
			}
			i_8_++;
			i_16_++;
		    }
		} else
		    i_8_ += anInt10455 - anInt10451;
		i_14_++;
	    }
	    method16141();
	} else {
	    anInterface37_10454 = null;
	    anInterface39_10453 = null;
	}
	aClass9_10458 = null;
	aFloatArrayArray10448 = null;
	aFloatArrayArray10456 = null;
	aFloatArrayArray10443 = null;
    }
    
    void method16135(int i, int i_23_, int i_24_, int i_25_, int i_26_,
		     int i_27_) {
	long l = -1L;
	int i_28_
	    = i_26_ + (i_24_ << aClass151_Sub2_10447.anInt1703 * -1495101509);
	int i_29_
	    = i_27_ + (i_25_ << aClass151_Sub2_10447.anInt1703 * -1495101509);
	int i_30_ = aClass151_Sub2_10447.method2498(i_28_, i_29_, 977071665);
	if ((i_26_ & 0x7f) == 0 || (i_27_ & 0x7f) == 0) {
	    l = ((long) i_29_ & 0xffffL) << 16 | (long) i_28_ & 0xffffL;
	    Class534 class534 = aClass9_10458.method579(l);
	    if (class534 != null) {
		Unsafe unsafe = aClass185_Sub1_10446.anUnsafe9127;
		unsafe.putShort((aClass185_Sub1_10446.aLong9139
				 + (long) (aClass185_Sub1_10446.anInt9243 >> 1)
				 + (long) (anInt10452 * 2)),
				((Class534_Sub15) class534).aShort10466);
		anInt10452++;
		return;
	    }
	}
	short i_31_ = (short) anInt10450;
	if (l != -1L)
	    aClass9_10458.method581(new Class534_Sub15(i_31_), l);
	float f;
	float f_32_;
	float f_33_;
	if (i_26_ == 0 && i_27_ == 0) {
	    f = aFloatArrayArray10443[i][i_23_];
	    f_32_ = aFloatArrayArray10456[i][i_23_];
	    f_33_ = aFloatArrayArray10448[i][i_23_];
	} else if (i_26_ == aClass151_Sub2_10447.anInt1702 * 127780559
		   && i_27_ == 0) {
	    f = aFloatArrayArray10443[i + 1][i_23_];
	    f_32_ = aFloatArrayArray10456[i + 1][i_23_];
	    f_33_ = aFloatArrayArray10448[i + 1][i_23_];
	} else if (i_26_ == aClass151_Sub2_10447.anInt1702 * 127780559
		   && i_27_ == aClass151_Sub2_10447.anInt1702 * 127780559) {
	    f = aFloatArrayArray10443[i + 1][i_23_ + 1];
	    f_32_ = aFloatArrayArray10456[i + 1][i_23_ + 1];
	    f_33_ = aFloatArrayArray10448[i + 1][i_23_ + 1];
	} else if (i_26_ == 0
		   && i_27_ == aClass151_Sub2_10447.anInt1702 * 127780559) {
	    f = aFloatArrayArray10443[i][i_23_ + 1];
	    f_32_ = aFloatArrayArray10456[i][i_23_ + 1];
	    f_33_ = aFloatArrayArray10448[i][i_23_ + 1];
	} else {
	    float f_34_
		= ((float) i_26_
		   / (float) (aClass151_Sub2_10447.anInt1702 * 127780559));
	    float f_35_
		= ((float) i_27_
		   / (float) (aClass151_Sub2_10447.anInt1702 * 127780559));
	    float f_36_ = aFloatArrayArray10443[i][i_23_];
	    float f_37_ = aFloatArrayArray10456[i][i_23_];
	    float f_38_ = aFloatArrayArray10448[i][i_23_];
	    float f_39_ = aFloatArrayArray10443[i + 1][i_23_];
	    float f_40_ = aFloatArrayArray10456[i + 1][i_23_];
	    float f_41_ = aFloatArrayArray10448[i + 1][i_23_];
	    f_36_ += (aFloatArrayArray10443[i][i_23_ + 1] - f_36_) * f_34_;
	    f_37_ += (aFloatArrayArray10456[i][i_23_ + 1] - f_37_) * f_34_;
	    f_38_ += (aFloatArrayArray10448[i][i_23_ + 1] - f_38_) * f_34_;
	    f_39_ += (aFloatArrayArray10443[i + 1][i_23_ + 1] - f_39_) * f_34_;
	    f_40_ += (aFloatArrayArray10456[i + 1][i_23_ + 1] - f_40_) * f_34_;
	    f_41_ += (aFloatArrayArray10448[i + 1][i_23_ + 1] - f_41_) * f_34_;
	    f = f_36_ + (f_39_ - f_36_) * f_35_;
	    f_32_ = f_37_ + (f_40_ - f_37_) * f_35_;
	    f_33_ = f_38_ + (f_41_ - f_38_) * f_35_;
	}
	float f_42_
	    = (float) (aClass534_Sub21_10457.method16197(715511502) - i_28_);
	float f_43_
	    = (float) (aClass534_Sub21_10457.method16226(659162984) - i_30_);
	float f_44_
	    = (float) (aClass534_Sub21_10457.method16199((byte) -64) - i_29_);
	float f_45_ = (float) Math.sqrt((double) (f_42_ * f_42_ + f_43_ * f_43_
						  + f_44_ * f_44_));
	float f_46_ = 1.0F / f_45_;
	f_42_ *= f_46_;
	f_43_ *= f_46_;
	f_44_ *= f_46_;
	float f_47_
	    = f_45_ / (float) aClass534_Sub21_10457.method16233(101076717);
	float f_48_ = 1.0F - f_47_ * f_47_;
	if (f_48_ < 0.0F)
	    f_48_ = 0.0F;
	float f_49_ = f_42_ * f + f_43_ * f_32_ + f_44_ * f_33_;
	if (f_49_ < 0.0F)
	    f_49_ = 0.0F;
	float f_50_ = f_49_ * f_48_ * 2.0F;
	if (f_50_ > 1.0F)
	    f_50_ = 1.0F;
	int i_51_ = aClass534_Sub21_10457.method16201((byte) 22);
	int i_52_ = (int) (f_50_ * (float) (i_51_ >> 16 & 0xff));
	if (i_52_ > 255)
	    i_52_ = 255;
	int i_53_ = (int) (f_50_ * (float) (i_51_ >> 8 & 0xff));
	if (i_53_ > 255)
	    i_53_ = 255;
	int i_54_ = (int) (f_50_ * (float) (i_51_ & 0xff));
	if (i_54_ > 255)
	    i_54_ = 255;
	Unsafe unsafe = aClass185_Sub1_10446.anUnsafe9127;
	unsafe.putFloat(aClass185_Sub1_10446.aLong9139 + (long) (anInt10450
								 * 16),
			(float) i_28_);
	unsafe.putFloat((aClass185_Sub1_10446.aLong9139
			 + (long) (anInt10450 * 16) + 4L),
			(float) i_30_);
	unsafe.putFloat((aClass185_Sub1_10446.aLong9139
			 + (long) (anInt10450 * 16) + 8L),
			(float) i_29_);
	if (aClass185_Sub1_10446.anInt9268 == 0) {
	    unsafe.putByte((aClass185_Sub1_10446.aLong9139
			    + (long) (anInt10450 * 16) + 12L),
			   (byte) i_54_);
	    unsafe.putByte((aClass185_Sub1_10446.aLong9139
			    + (long) (anInt10450 * 16) + 13L),
			   (byte) i_53_);
	    unsafe.putByte((aClass185_Sub1_10446.aLong9139
			    + (long) (anInt10450 * 16) + 14L),
			   (byte) i_52_);
	} else {
	    unsafe.putByte((aClass185_Sub1_10446.aLong9139
			    + (long) (anInt10450 * 16) + 12L),
			   (byte) i_52_);
	    unsafe.putByte((aClass185_Sub1_10446.aLong9139
			    + (long) (anInt10450 * 16) + 13L),
			   (byte) i_53_);
	    unsafe.putByte((aClass185_Sub1_10446.aLong9139
			    + (long) (anInt10450 * 16) + 14L),
			   (byte) i_54_);
	}
	unsafe.putByte((aClass185_Sub1_10446.aLong9139
			+ (long) (anInt10450 * 16) + 15L),
		       (byte) -1);
	anInt10450++;
	unsafe.putShort((aClass185_Sub1_10446.aLong9139
			 + (long) (aClass185_Sub1_10446.anInt9243 >> 1)
			 + (long) (anInt10452 * 2)),
			i_31_);
	anInt10452++;
    }
    
    void method16136(Class324 class324, int i, int i_55_, int i_56_,
		     boolean[][] bools, boolean bool) {
	if (anInterface39_10453 != null && anInt10451 <= i + i_56_
	    && anInt10455 >= i - i_56_ && anInt10445 <= i_55_ + i_56_
	    && anInt10449 >= i_55_ - i_56_) {
	    if (bool) {
		for (int i_57_ = anInt10451; i_57_ <= anInt10455; i_57_++) {
		    if (i_57_ - i >= -i_56_ && i_57_ - i <= i_56_) {
			for (int i_58_ = anInt10445; i_58_ <= anInt10449;
			     i_58_++) {
			    if (i_58_ - i_55_ >= -i_56_
				&& i_58_ - i_55_ <= i_56_
				&& (bools[i_57_ - i + i_56_]
				    [i_58_ - i_55_ + i_56_])) {
				method16137(class324, anInterface39_10453,
					    anInt10452 / 3);
				return;
			    }
			}
		    }
		}
	    } else {
		int i_59_ = 0;
		ByteBuffer bytebuffer = aClass185_Sub1_10446.aByteBuffer9266;
		bytebuffer.clear();
		for (int i_60_ = anInt10445; i_60_ <= anInt10449; i_60_++) {
		    if (i_60_ - i_55_ >= -i_56_ && i_60_ - i_55_ <= i_56_) {
			int i_61_ = (i_60_ * (aClass151_Sub2_10447.anInt1701
					      * -1924295585)
				     + anInt10451);
			for (int i_62_ = anInt10451; i_62_ <= anInt10455;
			     i_62_++) {
			    if (i_62_ - i >= -i_56_ && i_62_ - i <= i_56_
				&& (bools[i_62_ - i + i_56_]
				    [i_60_ - i_55_ + i_56_])) {
				short[] is = (aClass151_Sub2_10447
					      .aShortArrayArray9409[i_61_]);
				if (is != null) {
				    for (int i_63_ = 0; i_63_ < is.length;
					 i_63_++) {
					bytebuffer.putShort(is[i_63_]);
					i_59_++;
				    }
				}
			    }
			    i_61_++;
			}
		    }
		}
		if (bytebuffer.position() != 0 && i_59_ != 0) {
		    int i_64_ = bytebuffer.position();
		    Interface39 interface39
			= aClass185_Sub1_10446.method14725(i_64_ / 2);
		    interface39.method235(0, i_64_,
					  aClass185_Sub1_10446.aLong9139);
		    method16137(class324, interface39, i_59_ / 3);
		}
	    }
	}
    }
    
    void method16137(Class324 class324, Interface39 interface39, int i) {
	class324.anInt3447 = 0;
	class324.anInt3428 = anInt10450;
	class324.anInt3449 = 0;
	class324.anInt3450 = anInt10452 / 3;
	class324.anInterface38_3432 = aClass185_Sub1_10446.anInterface38_9204;
	float f = aClass534_Sub21_10457.method16202(-693604944);
	class324.aClass438_3445.method6997(f, f, f);
	aClass185_Sub1_10446.method14733(0, anInterface37_10454);
	aClass185_Sub1_10446.method14700(aClass185_Sub1_10446.aClass349_9293);
	aClass185_Sub1_10446.method14701(anInterface39_10453);
	class324.method5796(0);
    }
    
    void method16138() {
	anInterface39_10453 = aClass185_Sub1_10446.method14971(false);
	anInterface39_10453.method277(anInt10452);
	anInterface37_10454 = aClass185_Sub1_10446.method14698(false);
	anInterface37_10454.method236(anInt10450 * 16, 16);
	anInterface37_10454.method235(0, anInt10450 * 16,
				      aClass185_Sub1_10446.aLong9139);
	anInterface39_10453.method235(0, anInt10452 * 2,
				      (aClass185_Sub1_10446.aLong9139
				       + (long) (aClass185_Sub1_10446.anInt9243
						 >> 1)));
    }
    
    void method16139() {
	anInterface39_10453 = aClass185_Sub1_10446.method14971(false);
	anInterface39_10453.method277(anInt10452);
	anInterface37_10454 = aClass185_Sub1_10446.method14698(false);
	anInterface37_10454.method236(anInt10450 * 16, 16);
	anInterface37_10454.method235(0, anInt10450 * 16,
				      aClass185_Sub1_10446.aLong9139);
	anInterface39_10453.method235(0, anInt10452 * 2,
				      (aClass185_Sub1_10446.aLong9139
				       + (long) (aClass185_Sub1_10446.anInt9243
						 >> 1)));
    }
    
    void method16140() {
	anInterface39_10453 = aClass185_Sub1_10446.method14971(false);
	anInterface39_10453.method277(anInt10452);
	anInterface37_10454 = aClass185_Sub1_10446.method14698(false);
	anInterface37_10454.method236(anInt10450 * 16, 16);
	anInterface37_10454.method235(0, anInt10450 * 16,
				      aClass185_Sub1_10446.aLong9139);
	anInterface39_10453.method235(0, anInt10452 * 2,
				      (aClass185_Sub1_10446.aLong9139
				       + (long) (aClass185_Sub1_10446.anInt9243
						 >> 1)));
    }
    
    void method16141() {
	anInterface39_10453 = aClass185_Sub1_10446.method14971(false);
	anInterface39_10453.method277(anInt10452);
	anInterface37_10454 = aClass185_Sub1_10446.method14698(false);
	anInterface37_10454.method236(anInt10450 * 16, 16);
	anInterface37_10454.method235(0, anInt10450 * 16,
				      aClass185_Sub1_10446.aLong9139);
	anInterface39_10453.method235(0, anInt10452 * 2,
				      (aClass185_Sub1_10446.aLong9139
				       + (long) (aClass185_Sub1_10446.anInt9243
						 >> 1)));
    }
    
    void method16142(Class324 class324, Interface39 interface39, int i) {
	class324.anInt3447 = 0;
	class324.anInt3428 = anInt10450;
	class324.anInt3449 = 0;
	class324.anInt3450 = anInt10452 / 3;
	class324.anInterface38_3432 = aClass185_Sub1_10446.anInterface38_9204;
	float f = aClass534_Sub21_10457.method16202(-693604944);
	class324.aClass438_3445.method6997(f, f, f);
	aClass185_Sub1_10446.method14733(0, anInterface37_10454);
	aClass185_Sub1_10446.method14700(aClass185_Sub1_10446.aClass349_9293);
	aClass185_Sub1_10446.method14701(anInterface39_10453);
	class324.method5796(0);
    }
    
    void method16143(Class324 class324, Interface39 interface39, int i) {
	class324.anInt3447 = 0;
	class324.anInt3428 = anInt10450;
	class324.anInt3449 = 0;
	class324.anInt3450 = anInt10452 / 3;
	class324.anInterface38_3432 = aClass185_Sub1_10446.anInterface38_9204;
	float f = aClass534_Sub21_10457.method16202(-693604944);
	class324.aClass438_3445.method6997(f, f, f);
	aClass185_Sub1_10446.method14733(0, anInterface37_10454);
	aClass185_Sub1_10446.method14700(aClass185_Sub1_10446.aClass349_9293);
	aClass185_Sub1_10446.method14701(anInterface39_10453);
	class324.method5796(0);
    }
}
