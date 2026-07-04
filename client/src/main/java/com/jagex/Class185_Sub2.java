/* Class185_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;

public class Class185_Sub2 extends Class185
{
    Class101[] aClass101Array9335;
    int anInt9336;
    boolean aBool9337;
    int[] anIntArray9338;
    boolean aBool9339 = false;
    int anInt9340;
    float[] aFloatArray9341;
    float aFloat9342;
    int anInt9343;
    int anInt9344;
    int anInt9345;
    Class433 aClass433_9346;
    int anInt9347;
    int anInt9348;
    float aFloat9349;
    Class203 aClass203_9350;
    int anInt9351;
    int anInt9352;
    Class433 aClass433_9353;
    Class446 aClass446_9354;
    float[][] aFloatArrayArray9355;
    int anInt9356;
    int anInt9357;
    int anInt9358;
    int anInt9359;
    int anInt9360;
    float aFloat9361;
    Class433 aClass433_9362;
    float aFloat9363;
    int anInt9364;
    int anInt9365;
    float aFloat9366;
    int anInt9367;
    float aFloat9368;
    Class203 aClass203_9369;
    int anInt9370;
    Class163 aClass163_9371;
    int anInt9372;
    Class163 aClass163_9373;
    Class175_Sub1 aClass175_Sub1_9374;
    
    void method14993(boolean bool, int i, int i_0_, float f, int i_1_,
		     int i_2_, int i_3_) {
	if (anIntArray9338 != null) {
	    if (i_1_ < 0)
		i_1_ = -i_1_;
	    int i_4_ = i_0_ - i_1_;
	    if (i_4_ < anInt9344 * 9823353)
		i_4_ = 9823353 * anInt9344;
	    int i_5_ = 1 + (i_0_ + i_1_);
	    if (i_5_ > anInt9345 * 639238427)
		i_5_ = 639238427 * anInt9345;
	    int i_6_ = i_4_;
	    int i_7_ = i_1_ * i_1_;
	    int i_8_ = 0;
	    int i_9_ = i_0_ - i_6_;
	    int i_10_ = i_9_ * i_9_;
	    int i_11_ = i_10_ - i_9_;
	    if (i_0_ > i_5_)
		i_0_ = i_5_;
	    int i_12_ = i_2_ >>> 24;
	    if (0 == i_3_ || 1 == i_3_ && i_12_ == 255) {
		while (i_6_ < i_0_) {
		    for (/**/; i_11_ <= i_7_ || i_10_ <= i_7_;
			 i_11_ += i_8_++ + i_8_)
			i_10_ += i_8_ + i_8_;
		    int i_13_ = i - i_8_ + 1;
		    if (i_13_ < anInt9365 * 1709859847)
			i_13_ = anInt9365 * 1709859847;
		    int i_14_ = i + i_8_;
		    if (i_14_ > anInt9343 * -1807368365)
			i_14_ = -1807368365 * anInt9343;
		    int i_15_ = i_6_ * (356365251 * anInt9356) + i_13_;
		    for (int i_16_ = i_13_; i_16_ < i_14_; i_16_++) {
			if (!bool || f < aFloatArray9341[i_15_])
			    anIntArray9338[i_15_] = i_2_;
			i_15_++;
		    }
		    i_6_++;
		    i_10_ -= i_9_-- + i_9_;
		    i_11_ -= i_9_ + i_9_;
		}
		i_8_ = i_1_;
		i_9_ = i_6_ - i_0_;
		i_11_ = i_7_ + i_9_ * i_9_;
		i_10_ = i_11_ - i_8_;
		i_11_ -= i_9_;
		while (i_6_ < i_5_) {
		    for (/**/; i_11_ > i_7_ && i_10_ > i_7_;
			 i_10_ -= i_8_ + i_8_)
			i_11_ -= i_8_-- + i_8_;
		    int i_17_ = i - i_8_;
		    if (i_17_ < 1709859847 * anInt9365)
			i_17_ = 1709859847 * anInt9365;
		    int i_18_ = i_8_ + i;
		    if (i_18_ > -1807368365 * anInt9343 - 1)
			i_18_ = -1807368365 * anInt9343 - 1;
		    int i_19_ = i_6_ * (356365251 * anInt9356) + i_17_;
		    for (int i_20_ = i_17_; i_20_ <= i_18_; i_20_++) {
			if (!bool || f < aFloatArray9341[i_19_])
			    anIntArray9338[i_19_] = i_2_;
			i_19_++;
		    }
		    i_6_++;
		    i_11_ += i_9_ + i_9_;
		    i_10_ += i_9_++ + i_9_;
		}
	    } else if (i_3_ == 1) {
		i_2_ = (i_12_ << 24) + ((i_12_ * (i_2_ & 0xff00) >> 8 & 0xff00)
					+ (i_12_ * (i_2_ & 0xff00ff) >> 8
					   & 0xff00ff));
		int i_21_ = 256 - i_12_;
		while (i_6_ < i_0_) {
		    for (/**/; i_11_ <= i_7_ || i_10_ <= i_7_;
			 i_11_ += i_8_++ + i_8_)
			i_10_ += i_8_ + i_8_;
		    int i_22_ = 1 + (i - i_8_);
		    if (i_22_ < anInt9365 * 1709859847)
			i_22_ = anInt9365 * 1709859847;
		    int i_23_ = i + i_8_;
		    if (i_23_ > -1807368365 * anInt9343)
			i_23_ = anInt9343 * -1807368365;
		    int i_24_ = 356365251 * anInt9356 * i_6_ + i_22_;
		    for (int i_25_ = i_22_; i_25_ < i_23_; i_25_++) {
			if (!bool || f < aFloatArray9341[i_24_]) {
			    int i_26_ = anIntArray9338[i_24_];
			    i_26_ = ((i_21_ * (i_26_ & 0xff00) >> 8 & 0xff00)
				     + (i_21_ * (i_26_ & 0xff00ff) >> 8
					& 0xff00ff));
			    anIntArray9338[i_24_] = i_2_ + i_26_;
			}
			i_24_++;
		    }
		    i_6_++;
		    i_10_ -= i_9_-- + i_9_;
		    i_11_ -= i_9_ + i_9_;
		}
		i_8_ = i_1_;
		i_9_ = -i_9_;
		i_11_ = i_9_ * i_9_ + i_7_;
		i_10_ = i_11_ - i_8_;
		i_11_ -= i_9_;
		while (i_6_ < i_5_) {
		    for (/**/; i_11_ > i_7_ && i_10_ > i_7_;
			 i_10_ -= i_8_ + i_8_)
			i_11_ -= i_8_-- + i_8_;
		    int i_27_ = i - i_8_;
		    if (i_27_ < anInt9365 * 1709859847)
			i_27_ = anInt9365 * 1709859847;
		    int i_28_ = i_8_ + i;
		    if (i_28_ > anInt9343 * -1807368365 - 1)
			i_28_ = anInt9343 * -1807368365 - 1;
		    int i_29_ = i_27_ + anInt9356 * 356365251 * i_6_;
		    for (int i_30_ = i_27_; i_30_ <= i_28_; i_30_++) {
			if (!bool || f < aFloatArray9341[i_29_]) {
			    int i_31_ = anIntArray9338[i_29_];
			    i_31_
				= (((i_31_ & 0xff00ff) * i_21_ >> 8 & 0xff00ff)
				   + ((i_31_ & 0xff00) * i_21_ >> 8 & 0xff00));
			    anIntArray9338[i_29_] = i_31_ + i_2_;
			}
			i_29_++;
		    }
		    i_6_++;
		    i_11_ += i_9_ + i_9_;
		    i_10_ += i_9_++ + i_9_;
		}
	    } else if (i_3_ == 2) {
		while (i_6_ < i_0_) {
		    for (/**/; i_11_ <= i_7_ || i_10_ <= i_7_;
			 i_11_ += i_8_++ + i_8_)
			i_10_ += i_8_ + i_8_;
		    int i_32_ = 1 + (i - i_8_);
		    if (i_32_ < 1709859847 * anInt9365)
			i_32_ = anInt9365 * 1709859847;
		    int i_33_ = i_8_ + i;
		    if (i_33_ > anInt9343 * -1807368365)
			i_33_ = -1807368365 * anInt9343;
		    int i_34_ = i_32_ + 356365251 * anInt9356 * i_6_;
		    for (int i_35_ = i_32_; i_35_ < i_33_; i_35_++) {
			if (!bool || f < aFloatArray9341[i_34_]) {
			    int i_36_ = anIntArray9338[i_34_];
			    int i_37_ = i_2_ + i_36_;
			    int i_38_ = (i_36_ & 0xff00ff) + (i_2_ & 0xff00ff);
			    i_36_ = (i_38_ & 0x1000100) + (i_37_ - i_38_
							   & 0x10000);
			    anIntArray9338[i_34_]
				= i_37_ - i_36_ | i_36_ - (i_36_ >>> 8);
			}
			i_34_++;
		    }
		    i_6_++;
		    i_10_ -= i_9_-- + i_9_;
		    i_11_ -= i_9_ + i_9_;
		}
		i_8_ = i_1_;
		i_9_ = -i_9_;
		i_11_ = i_7_ + i_9_ * i_9_;
		i_10_ = i_11_ - i_8_;
		i_11_ -= i_9_;
		while (i_6_ < i_5_) {
		    for (/**/; i_11_ > i_7_ && i_10_ > i_7_;
			 i_10_ -= i_8_ + i_8_)
			i_11_ -= i_8_-- + i_8_;
		    int i_39_ = i - i_8_;
		    if (i_39_ < 1709859847 * anInt9365)
			i_39_ = anInt9365 * 1709859847;
		    int i_40_ = i_8_ + i;
		    if (i_40_ > -1807368365 * anInt9343 - 1)
			i_40_ = anInt9343 * -1807368365 - 1;
		    int i_41_ = i_6_ * (356365251 * anInt9356) + i_39_;
		    for (int i_42_ = i_39_; i_42_ <= i_40_; i_42_++) {
			if (!bool || f < aFloatArray9341[i_41_]) {
			    int i_43_ = anIntArray9338[i_41_];
			    int i_44_ = i_43_ + i_2_;
			    int i_45_ = (i_2_ & 0xff00ff) + (i_43_ & 0xff00ff);
			    i_43_ = (i_44_ - i_45_ & 0x10000) + (i_45_
								 & 0x1000100);
			    anIntArray9338[i_41_]
				= i_44_ - i_43_ | i_43_ - (i_43_ >>> 8);
			}
			i_41_++;
		    }
		    i_6_++;
		    i_11_ += i_9_ + i_9_;
		    i_10_ += i_9_++ + i_9_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    Class185_Sub2(Class177 class177, Interface25 interface25,
		  Interface45 interface45, Interface48 interface48,
		  Interface46 interface46) {
	super(class177, interface25, interface45, interface48, interface46);
	aBool9337 = false;
	anInt9365 = 0;
	anInt9343 = 0;
	anInt9344 = 0;
	anInt9345 = 0;
	anInt9370 = 1542543749;
	anInt9358 = 148110106;
	anInt9351 = -1468517186;
	aFloatArrayArray9355 = new float[6][4];
	aFloat9349 = 1.0F;
	aFloat9366 = 0.0F;
	aClass203_9350 = new Class203(16);
	anInt9372 = -1860330887;
	try {
	    aClass203_9369 = new Class203(10485760, 256);
	    aClass446_9354 = new Class446();
	    aClass433_9353 = new Class433();
	    aClass433_9362 = new Class433();
	    aClass433_9346 = new Class433();
	    method15010(1);
	    method15009(0);
	    Class456.method7426(true, true, 1739452007);
	    aBool9337 = true;
	    anInt9336 = (int) Class250.method4604((byte) -26) * -382802617;
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    method3236(-568376843);
	    throw new RuntimeException("");
	}
    }
    
    public void method3521(int i, int i_46_, int i_47_) {
	for (int i_48_ = 0; i_48_ < aClass101Array9335.length; i_48_++) {
	    Class101 class101 = aClass101Array9335[i_48_];
	    class101.anInt1206 = (i & 0xffffff) * -1382291633;
	    int i_49_ = class101.anInt1206 * 1046269871 >>> 16 & 0xff;
	    if (i_49_ < 2)
		i_49_ = 2;
	    int i_50_ = class101.anInt1206 * 1046269871 >> 8 & 0xff;
	    if (i_50_ < 2)
		i_50_ = 2;
	    int i_51_ = 1046269871 * class101.anInt1206 & 0xff;
	    if (i_51_ < 2)
		i_51_ = 2;
	    class101.anInt1206
		= (i_49_ << 16 | i_50_ << 8 | i_51_) * -1382291633;
	    if (i_46_ < 0)
		class101.aBool1203 = false;
	    else
		class101.aBool1203 = true;
	}
    }
    
    public Class163 method3343(int[] is, int i, int i_52_, int i_53_,
			       int i_54_, boolean bool) {
	boolean bool_55_ = false;
	int i_56_ = i;
    while_151_:
	for (int i_57_ = 0; i_57_ < i_54_; i_57_++) {
	    for (int i_58_ = 0; i_58_ < i_53_; i_58_++) {
		int i_59_ = is[i_56_++] >>> 24;
		if (i_59_ != 0 && i_59_ != 255) {
		    bool_55_ = true;
		    break while_151_;
		}
	    }
	}
	if (bool_55_)
	    return new Class163_Sub1_Sub1(this, is, i, i_52_, i_53_, i_54_,
					  bool);
	return new Class163_Sub1_Sub3(this, is, i, i_52_, i_53_, i_54_, bool);
    }
    
    public void method3305(int i, int i_60_, int i_61_, int i_62_, int i_63_,
			   int i_64_, int i_65_, int i_66_, int i_67_) {
	if (anIntArray9338 != null) {
	    i_61_ -= i;
	    i_62_ -= i_60_;
	    if (0 == i_62_) {
		if (i_61_ >= 0)
		    method15006(i, i_60_, 1 + i_61_, i_63_, i_64_, i_65_,
				i_66_, i_67_);
		else {
		    int i_68_ = i_66_ + i_65_;
		    i_67_ %= i_68_;
		    i_67_ = i_65_ + i_68_ - i_67_ - (1 + -i_61_) % i_68_;
		    i_67_ %= i_68_;
		    if (i_67_ < 0)
			i_67_ += i_68_;
		    method15006(i + i_61_, i_60_, 1 + -i_61_, i_63_, i_64_,
				i_65_, i_66_, i_67_);
		}
	    } else if (0 == i_61_) {
		if (i_62_ >= 0)
		    method15027(i, i_60_, i_62_ + 1, i_63_, i_64_, i_65_,
				i_66_, i_67_);
		else {
		    int i_69_ = i_66_ + i_65_;
		    i_67_ %= i_69_;
		    i_67_ = i_69_ + i_65_ - i_67_ - (1 + -i_62_) % i_69_;
		    i_67_ %= i_69_;
		    if (i_67_ < 0)
			i_67_ += i_69_;
		    method15027(i, i_60_ + i_62_, -i_62_ + 1, i_63_, i_64_,
				i_65_, i_66_, i_67_);
		}
	    } else {
		i_67_ <<= 8;
		i_65_ <<= 8;
		i_66_ <<= 8;
		int i_70_ = i_65_ + i_66_;
		i_67_ %= i_70_;
		if (i_61_ + i_62_ < 0) {
		    int i_71_ = (int) (Math.sqrt((double) (i_62_ * i_62_
							   + i_61_ * i_61_))
				       * 256.0);
		    int i_72_ = i_71_ % i_70_;
		    i_67_ = i_70_ + i_65_ - i_67_ - i_72_;
		    i_67_ %= i_70_;
		    if (i_67_ < 0)
			i_67_ += i_70_;
		    i += i_61_;
		    i_61_ = -i_61_;
		    i_60_ += i_62_;
		    i_62_ = -i_62_;
		}
		if (i_61_ > i_62_) {
		    i_60_ <<= 16;
		    i_60_ += 32768;
		    i_62_ <<= 16;
		    int i_73_
			= (int) Math.floor((double) i_62_ / (double) i_61_
					   + 0.5);
		    i_61_ += i;
		    int i_74_ = i_63_ >>> 24;
		    int i_75_
			= (int) Math.sqrt((double) ((i_73_ >> 8) * (i_73_ >> 8)
						    + 65536));
		    if (0 == i_64_ || i_64_ == 1 && i_74_ == 255) {
			while (i <= i_61_) {
			    int i_76_ = i_60_ >> 16;
			    if (i >= anInt9365 * 1709859847
				&& i < anInt9343 * -1807368365
				&& i_76_ >= 9823353 * anInt9344
				&& i_76_ < anInt9345 * 639238427
				&& i_67_ < i_65_)
				anIntArray9338[i + (356365251 * anInt9356
						    * i_76_)]
				    = i_63_;
			    i_60_ += i_73_;
			    i++;
			    i_67_ += i_75_;
			    i_67_ %= i_70_;
			}
		    } else if (1 == i_64_) {
			i_63_ = ((i_74_ * (i_63_ & 0xff00) >> 8 & 0xff00)
				 + ((i_63_ & 0xff00ff) * i_74_ >> 8 & 0xff00ff)
				 + (i_74_ << 24));
			int i_77_ = 256 - i_74_;
			while (i <= i_61_) {
			    int i_78_ = i_60_ >> 16;
			    if (i >= 1709859847 * anInt9365
				&& i < anInt9343 * -1807368365
				&& i_78_ >= anInt9344 * 9823353
				&& i_78_ < 639238427 * anInt9345
				&& i_67_ < i_65_) {
				int i_79_
				    = i + i_78_ * (anInt9356 * 356365251);
				int i_80_ = anIntArray9338[i_79_];
				i_80_
				    = ((i_77_ * (i_80_ & 0xff00) >> 8 & 0xff00)
				       + ((i_80_ & 0xff00ff) * i_77_ >> 8
					  & 0xff00ff));
				anIntArray9338[i_79_] = i_63_ + i_80_;
			    }
			    i_60_ += i_73_;
			    i++;
			    i_67_ += i_75_;
			    i_67_ %= i_70_;
			}
		    } else if (i_64_ == 2) {
			while (i <= i_61_) {
			    int i_81_ = i_60_ >> 16;
			    if (i >= 1709859847 * anInt9365
				&& i < -1807368365 * anInt9343
				&& i_81_ >= anInt9344 * 9823353
				&& i_81_ < 639238427 * anInt9345
				&& i_67_ < i_65_) {
				int i_82_ = 356365251 * anInt9356 * i_81_ + i;
				int i_83_ = anIntArray9338[i_82_];
				int i_84_ = i_63_ + i_83_;
				int i_85_
				    = (i_63_ & 0xff00ff) + (i_83_ & 0xff00ff);
				i_83_ = ((i_84_ - i_85_ & 0x10000)
					 + (i_85_ & 0x1000100));
				anIntArray9338[i_82_]
				    = i_84_ - i_83_ | i_83_ - (i_83_ >>> 8);
			    }
			    i_60_ += i_73_;
			    i++;
			    i_67_ += i_75_;
			    i_67_ %= i_70_;
			}
		    } else
			throw new IllegalArgumentException();
		} else {
		    i <<= 16;
		    i += 32768;
		    i_61_ <<= 16;
		    int i_86_
			= (int) Math.floor((double) i_61_ / (double) i_62_
					   + 0.5);
		    i_62_ += i_60_;
		    int i_87_ = i_63_ >>> 24;
		    int i_88_
			= (int) Math.sqrt((double) ((i_86_ >> 8) * (i_86_ >> 8)
						    + 65536));
		    if (0 == i_64_ || 1 == i_64_ && i_87_ == 255) {
			while (i_60_ <= i_62_) {
			    int i_89_ = i >> 16;
			    if (i_60_ >= 9823353 * anInt9344
				&& i_60_ < 639238427 * anInt9345
				&& i_89_ >= anInt9365 * 1709859847
				&& i_89_ < anInt9343 * -1807368365
				&& i_67_ < i_65_)
				anIntArray9338[i_89_ + i_60_ * (356365251
								* anInt9356)]
				    = i_63_;
			    i += i_86_;
			    i_60_++;
			    i_67_ += i_88_;
			    i_67_ %= i_70_;
			}
		    } else if (i_64_ == 1) {
			i_63_ = (((i_63_ & 0xff00) * i_87_ >> 8 & 0xff00)
				 + (i_87_ * (i_63_ & 0xff00ff) >> 8 & 0xff00ff)
				 + (i_87_ << 24));
			int i_90_ = 256 - i_87_;
			while (i_60_ <= i_62_) {
			    int i_91_ = i >> 16;
			    if (i_60_ >= 9823353 * anInt9344
				&& i_60_ < 639238427 * anInt9345
				&& i_91_ >= 1709859847 * anInt9365
				&& i_91_ < -1807368365 * anInt9343
				&& i_67_ < i_65_) {
				int i_92_
				    = i_91_ + i_60_ * (anInt9356 * 356365251);
				int i_93_ = anIntArray9338[i_92_];
				i_93_
				    = (((i_93_ & 0xff00) * i_90_ >> 8 & 0xff00)
				       + (i_90_ * (i_93_ & 0xff00ff) >> 8
					  & 0xff00ff));
				anIntArray9338[(i_60_ * (356365251 * anInt9356)
						+ i_91_)]
				    = i_63_ + i_93_;
			    }
			    i += i_86_;
			    i_60_++;
			    i_67_ += i_88_;
			    i_67_ %= i_70_;
			}
		    } else if (2 == i_64_) {
			while (i_60_ <= i_62_) {
			    int i_94_ = i >> 16;
			    if (i_60_ >= 9823353 * anInt9344
				&& i_60_ < 639238427 * anInt9345
				&& i_94_ >= 1709859847 * anInt9365
				&& i_94_ < -1807368365 * anInt9343
				&& i_67_ < i_65_) {
				int i_95_
				    = i_94_ + 356365251 * anInt9356 * i_60_;
				int i_96_ = anIntArray9338[i_95_];
				int i_97_ = i_63_ + i_96_;
				int i_98_
				    = (i_63_ & 0xff00ff) + (i_96_ & 0xff00ff);
				i_96_ = ((i_97_ - i_98_ & 0x10000)
					 + (i_98_ & 0x1000100));
				anIntArray9338[i_95_]
				    = i_97_ - i_96_ | i_96_ - (i_96_ >>> 8);
			    }
			    i += i_86_;
			    i_60_++;
			    i_67_ += i_88_;
			    i_67_ %= i_70_;
			}
		    } else
			throw new IllegalArgumentException();
		}
	    }
	}
    }
    
    public int[] method3251() {
	return null;
    }
    
    public void method3661(int i) {
	int i_99_ = i - 1255617655 * anInt9336;
	for (Class534_Sub14 class534_sub14
		 = (Class534_Sub14) aClass203_9369.method3892(-2142737431);
	     class534_sub14 != null;
	     class534_sub14
		 = (Class534_Sub14) aClass203_9369.method3883((byte) -91)) {
	    if (class534_sub14.aBool10463) {
		class534_sub14.anInt10462 += i_99_;
		int i_100_ = class534_sub14.anInt10462 / 50;
		if (i_100_ > 0) {
		    Class186 class186
			= aClass177_2012.method2931(class534_sub14.anInt10460,
						    (byte) 1);
		    float f = (float) (1264459495 * class186.anInt2046);
		    class534_sub14.method16149
			((int) ((float) class186.aByte2047
				* ((float) i_99_ / 1000.0F) / 64.0F * f),
			 (int) (f * ((float) i_99_ / 1000.0F
				     * (float) class186.aByte2048 / 64.0F)));
		    class534_sub14.anInt10462 -= 50 * i_100_;
		}
		class534_sub14.aBool10463 = false;
	    }
	}
	anInt9336 = -382802617 * i;
	aClass203_9350.method3876(5, (byte) 0);
	aClass203_9369.method3876(5, (byte) 0);
    }
    
    public int method3239() {
	return 0;
    }
    
    public boolean method3247() {
	return false;
    }
    
    int[] method14994(int i) {
	Class534_Sub14 class534_sub14;
	synchronized (aClass203_9369) {
	    class534_sub14
		= ((Class534_Sub14)
		   aClass203_9369.method3871((long) (i & 0xffff)
					     | ~0x7fffffffffffffffL));
	    if (null == class534_sub14) {
		Class186 class186 = aClass177_2012.method2931(i, (byte) 1);
		int i_101_ = class186.anInt2046 * 1264459495;
		if (!anInterface25_1997.method155(Class598.aClass598_7865, i,
						  Class613.aClass613_8023,
						  0.7F, i_101_, i_101_, true,
						  -618218007)) {
		    int[] is = null;
		    return is;
		}
		int[] is;
		if (Class599.aClass599_7869 != class186.aClass599_2064)
		    is = anInterface25_1997.method150(Class598.aClass598_7865,
						      i, 0.7F, i_101_, i_101_,
						      true, 1031582137);
		else
		    is = anInterface25_1997.method149(Class598.aClass598_7865,
						      i, 0.7F, i_101_, i_101_,
						      true, 901555141);
		class534_sub14
		    = new Class534_Sub14(i, i_101_, is,
					 (class186.aClass599_2064
					  != Class599.aClass599_7868));
		aClass203_9369.method3881(class534_sub14,
					  ((long) (i & 0xffff)
					   | ~0x7fffffffffffffffL),
					  i_101_ * i_101_, -1106837919);
	    }
	}
	class534_sub14.aBool10463 = true;
	return class534_sub14.method16144();
    }
    
    public Class163 method3487(int i, int i_102_, int i_103_, int i_104_,
			       boolean bool) {
	if (null == anIntArray9338)
	    throw new IllegalStateException("");
	int[] is = new int[i_104_ * i_103_];
	int i_105_ = i + i_102_ * (356365251 * anInt9356);
	int i_106_ = 356365251 * anInt9356 - i_103_;
	for (int i_107_ = 0; i_107_ < i_104_; i_107_++) {
	    int i_108_ = i_103_ * i_107_;
	    for (int i_109_ = 0; i_109_ < i_103_; i_109_++)
		is[i_109_ + i_108_] = anIntArray9338[i_105_++];
	    i_105_ += i_106_;
	}
	if (bool)
	    return new Class163_Sub1_Sub1(this, is, i_103_, i_104_);
	return new Class163_Sub1_Sub3(this, is, i_103_, i_104_);
    }
    
    public boolean method3421() {
	return false;
    }
    
    Class599 method14995(int i) {
	return aClass177_2012.method2931(i, (byte) 1).aClass599_2064;
    }
    
    byte method14996(int i) {
	return aClass177_2012.method2931(i, (byte) 1).aByte2051;
    }
    
    int method14997(int i) {
	return aClass177_2012.method2931(i, (byte) 1).aShort2060 & 0xffff;
    }
    
    boolean method14998(int i) {
	Class186 class186 = aClass177_2012.method2931(i, (byte) 1);
	return 0 != class186.aByte2073 || 0 != class186.aByte2053;
    }
    
    void method14999(int i) {
	anInt9367 = i * 258921977;
	aClass101Array9335 = new Class101[442227785 * anInt9367];
	for (int i_110_ = 0; i_110_ < anInt9367 * 442227785; i_110_++)
	    aClass101Array9335[i_110_] = new Class101(this);
    }
    
    public boolean method3241() {
	return false;
    }
    
    public boolean method3242() {
	return true;
    }
    
    public void method3353(int i, int i_111_, int i_112_) {
	for (int i_113_ = 0; i_113_ < aClass101Array9335.length; i_113_++) {
	    Class101 class101 = aClass101Array9335[i_113_];
	    class101.anInt1206 = (i & 0xffffff) * -1382291633;
	    int i_114_ = class101.anInt1206 * 1046269871 >>> 16 & 0xff;
	    if (i_114_ < 2)
		i_114_ = 2;
	    int i_115_ = class101.anInt1206 * 1046269871 >> 8 & 0xff;
	    if (i_115_ < 2)
		i_115_ = 2;
	    int i_116_ = 1046269871 * class101.anInt1206 & 0xff;
	    if (i_116_ < 2)
		i_116_ = 2;
	    class101.anInt1206
		= (i_114_ << 16 | i_115_ << 8 | i_116_) * -1382291633;
	    if (i_111_ < 0)
		class101.aBool1203 = false;
	    else
		class101.aBool1203 = true;
	}
    }
    
    public boolean method3404() {
	return false;
    }
    
    public boolean method3436() {
	return false;
    }
    
    public boolean method3246() {
	return false;
    }
    
    Class175_Sub2 method3244(Canvas canvas, int i, int i_117_) {
	return Class594.method9908(this, canvas, i, i_117_, (short) 5570);
    }
    
    public void method3346() {
	aClass175_Sub1_9374 = null;
	aClass163_9373 = null;
    }
    
    public void method3593(int[] is) {
	is[0] = -1301915793 * anInt9357;
	is[1] = 332831973 * anInt9364;
	is[2] = -798650927 * anInt9359;
	is[3] = 314738383 * anInt9360;
    }
    
    void method15000(boolean bool, boolean bool_118_, boolean bool_119_,
		     Class174 class174) {
	Class101 class101 = method15011(Thread.currentThread());
	for (Class536_Sub2_Sub1 class536_sub2_sub1
		 = ((Class536_Sub2_Sub1)
		    class174.aClass701_1837.method14211(65535));
	     class536_sub2_sub1 != null;
	     class536_sub2_sub1
		 = ((Class536_Sub2_Sub1)
		    class174.aClass701_1837.method14205(-1096393447))) {
	    int i = class536_sub2_sub1.anInt11491 >> 12;
	    int i_120_ = class536_sub2_sub1.anInt11495 >> 12;
	    int i_121_ = class536_sub2_sub1.anInt11496 >> 12;
	    float f
		= (aClass433_9346.aFloatArray4853[14]
		   + ((float) i_120_ * aClass433_9346.aFloatArray4853[6]
		      + aClass433_9346.aFloatArray4853[2] * (float) i
		      + aClass433_9346.aFloatArray4853[10] * (float) i_121_));
	    float f_122_
		= (aClass433_9346.aFloatArray4853[15]
		   + (aClass433_9346.aFloatArray4853[3] * (float) i
		      + (float) i_120_ * aClass433_9346.aFloatArray4853[7]
		      + (float) i_121_ * aClass433_9346.aFloatArray4853[11]));
	    if (!(f < -f_122_)) {
		float f_123_ = aFloat9366 + aFloat9349 * f / f_122_;
		if (!(f > class101.aFloat1204)) {
		    float f_124_
			= ((float) i * aClass433_9346.aFloatArray4853[0]
			   + (float) i_120_ * aClass433_9346.aFloatArray4853[4]
			   + aClass433_9346.aFloatArray4853[8] * (float) i_121_
			   + aClass433_9346.aFloatArray4853[12]);
		    float f_125_
			= ((float) i_120_ * aClass433_9346.aFloatArray4853[5]
			   + aClass433_9346.aFloatArray4853[1] * (float) i
			   + (float) i_121_ * aClass433_9346.aFloatArray4853[9]
			   + aClass433_9346.aFloatArray4853[13]);
		    if (!(f_124_ < -f_122_) && !(f_124_ > f_122_)
			&& !(f_125_ < -f_122_) && !(f_125_ > f_122_)) {
			float f_126_
			    = (float) class536_sub2_sub1.anInt11497 / 4096.0F;
			float f_127_
			    = (f_124_
			       + aClass433_9362.aFloatArray4853[0] * f_126_);
			float f_128_
			    = (aClass433_9362.aFloatArray4853[3] * f_126_
			       + f_122_);
			float f_129_
			    = aFloat9361 * f_124_ / f_122_ + aFloat9342;
			float f_130_
			    = aFloat9368 + f_125_ * aFloat9363 / f_122_;
			float f_131_
			    = aFloat9342 + f_127_ * aFloat9361 / f_128_;
			method15040(bool, bool_118_, bool_119_,
				    class536_sub2_sub1, (int) f_129_,
				    (int) f_130_, f_123_,
				    (int) (f_131_ < f_129_ ? f_129_ - f_131_
					   : f_131_ - f_129_));
		    }
		}
	    }
	}
    }
    
    public void method3659(int i, Class534_Sub21[] class534_sub21s) {
	/* empty */
    }
    
    public void method3371(boolean bool) {
	/* empty */
    }
    
    Class175_Sub2 method3262(Canvas canvas, int i, int i_132_) {
	return Class594.method9908(this, canvas, i, i_132_, (short) -26442);
    }
    
    public boolean method3395() {
	return false;
    }
    
    public int[] method3267(int i, int i_133_, int i_134_, int i_135_) {
	if (anIntArray9338 == null)
	    throw new IllegalStateException("");
	int[] is = new int[i_135_ * i_134_];
	int i_136_ = 0;
	for (int i_137_ = 0; i_137_ < i_135_; i_137_++) {
	    int i_138_ = (i_137_ + i_133_) * (356365251 * anInt9356) + i;
	    for (int i_139_ = 0; i_139_ < i_134_; i_139_++)
		is[i_136_++] = anIntArray9338[i_139_ + i_138_];
	}
	return is;
    }
    
    public void method3268() {
	/* empty */
    }
    
    public void method3252(int[] is) {
	is[0] = 356365251 * anInt9356;
	is[1] = anInt9340 * 446066493;
    }
    
    void method15001() {
	aClass433_9353.method6916(aClass446_9354);
	aClass433_9346.method6842(aClass433_9353);
	aClass433_9346.method6839(aClass433_9362);
	aClass433_9346.method6862(aFloatArrayArray9355[0]);
	aClass433_9346.method6858(aFloatArrayArray9355[1]);
	aClass433_9346.method6861(aFloatArrayArray9355[2]);
	aClass433_9346.method6949(aFloatArrayArray9355[3]);
	aClass433_9346.method6879(aFloatArrayArray9355[4]);
	aClass433_9346.method6945(aFloatArrayArray9355[5]);
	float f = aClass433_9362.method6907();
	float f_140_ = (aClass433_9362.aFloatArray4853[14]
			+ aClass433_9362.aFloatArray4853[10] * (f - 255.0F));
	float f_141_ = (aClass433_9362.aFloatArray4853[14]
			+ aClass433_9362.aFloatArray4853[10] * f);
	float f_142_ = f_141_ - f_140_;
	for (int i = 0; i < 442227785 * anInt9367; i++) {
	    Class101 class101 = aClass101Array9335[i];
	    class101.aFloat1204 = f_140_;
	    class101.aFloat1205 = f_142_;
	}
    }
    
    boolean method15002(int i) {
	Class186 class186 = aClass177_2012.method2931(i, (byte) 1);
	return anInterface25_1997.method155(Class598.aClass598_7865, i,
					    Class613.aClass613_8023, 0.7F,
					    1264459495 * class186.anInt2046,
					    class186.anInt2046 * 1264459495,
					    true, -618218007);
    }
    
    public boolean method3396() {
	return false;
    }
    
    public boolean method3666() {
	return false;
    }
    
    public int method3273() {
	return -1;
    }
    
    public void method3275(int i, int i_143_, int i_144_) {
	/* empty */
    }
    
    public void method3656() {
	/* empty */
    }
    
    public void method3549(Class170 class170, float f, Class170 class170_145_,
			   float f_146_, Class170 class170_147_,
			   float f_148_) {
	/* empty */
    }
    
    public void method3277(long l) {
	/* empty */
    }
    
    public void method3278(int i, int i_149_, int[] is, int[] is_150_) {
	method3616(i, i_149_, -127018896);
	if (null == aClass163_9373 || aClass163_9373.method2647() != i
	    || aClass163_9373.method2649() != i_149_) {
	    aClass163_9373 = method3315(i, i_149_, true, true);
	    aClass175_Sub1_9374 = null;
	}
	if (null == aClass175_Sub1_9374) {
	    aClass175_Sub1_9374 = method3263();
	    aClass175_Sub1_9374.method15075(0, aClass163_9373.method2651());
	}
	Class163_Sub1_Sub1 class163_sub1_sub1
	    = new Class163_Sub1_Sub1(this, anIntArray9338,
				     anInt9356 * 356365251,
				     446066493 * anInt9340);
	method3260(aClass175_Sub1_9374, -1056288721);
	method3340(1, -16777216);
	class163_sub1_sub1.method2661(anInt2018 * -1555714981,
				      anInt2019 * -385311879,
				      1769547157 * anInt2020,
				      -740019615 * anInt2021, 1, 0, 0, 0);
	aClass163_9373.method2653(0, 0, i, i_149_, is, is_150_, 0, i);
	method3261(aClass175_Sub1_9374, -11578496);
    }
    
    public void method3280() {
	aClass175_Sub1_9374 = null;
	aClass163_9373 = null;
    }
    
    void method15003() {
	if (null != aFloatArray9341) {
	    if (1709859847 * anInt9365 == 0
		&& anInt9343 * -1807368365 == 356365251 * anInt9356
		&& 9823353 * anInt9344 == 0
		&& 639238427 * anInt9345 == 446066493 * anInt9340) {
		int i = aFloatArray9341.length;
		int i_151_ = i - (i & 0x7);
		int i_152_ = 0;
		while (i_152_ < i_151_) {
		    aFloatArray9341[i_152_++] = 2.14748365E9F;
		    aFloatArray9341[i_152_++] = 2.14748365E9F;
		    aFloatArray9341[i_152_++] = 2.14748365E9F;
		    aFloatArray9341[i_152_++] = 2.14748365E9F;
		    aFloatArray9341[i_152_++] = 2.14748365E9F;
		    aFloatArray9341[i_152_++] = 2.14748365E9F;
		    aFloatArray9341[i_152_++] = 2.14748365E9F;
		    aFloatArray9341[i_152_++] = 2.14748365E9F;
		}
		while (i_152_ < i)
		    aFloatArray9341[i_152_++] = 2.14748365E9F;
	    } else {
		int i = anInt9343 * -1807368365 - anInt9365 * 1709859847;
		int i_153_ = 639238427 * anInt9345 - anInt9344 * 9823353;
		int i_154_ = anInt9356 * 356365251 - i;
		int i_155_ = (9823353 * anInt9344 * (356365251 * anInt9356)
			      + 1709859847 * anInt9365);
		int i_156_ = i >> 3;
		int i_157_ = i & 0x7;
		i = i_155_ - 1;
		for (int i_158_ = -i_153_; i_158_ < 0; i_158_++) {
		    if (i_156_ > 0) {
			int i_159_ = i_156_;
			do {
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			} while (--i_159_ > 0);
		    }
		    if (i_157_ > 0) {
			int i_160_ = i_157_;
			do
			    aFloatArray9341[++i] = 2.14748365E9F;
			while (--i_160_ > 0);
		    }
		    i += i_154_;
		}
	    }
	}
    }
    
    public void method3461(boolean bool) {
	Class101 class101 = method15011(Thread.currentThread());
	class101.aBool1211 = bool;
    }
    
    public void method3281() {
	anInt9357 = 0;
	anInt9364 = 0;
	anInt9359 = anInt9356 * 910584147;
	anInt9360 = 1362504755 * anInt9340;
	method15005();
    }
    
    public void method3318(int i, int i_161_, int i_162_, int i_163_) {
	anInt9357 = i * -2028935281;
	anInt9364 = i_161_ * -1799241491;
	anInt9359 = -1869485263 * i_162_;
	anInt9360 = i_163_ * -1888305105;
	method15005();
    }
    
    public void method3283(int[] is) {
	is[0] = -1301915793 * anInt9357;
	is[1] = 332831973 * anInt9364;
	is[2] = -798650927 * anInt9359;
	is[3] = 314738383 * anInt9360;
    }
    
    void method15004() {
	if (null != aFloatArray9341) {
	    if (1709859847 * anInt9365 == 0
		&& anInt9343 * -1807368365 == 356365251 * anInt9356
		&& 9823353 * anInt9344 == 0
		&& 639238427 * anInt9345 == 446066493 * anInt9340) {
		int i = aFloatArray9341.length;
		int i_164_ = i - (i & 0x7);
		int i_165_ = 0;
		while (i_165_ < i_164_) {
		    aFloatArray9341[i_165_++] = 2.14748365E9F;
		    aFloatArray9341[i_165_++] = 2.14748365E9F;
		    aFloatArray9341[i_165_++] = 2.14748365E9F;
		    aFloatArray9341[i_165_++] = 2.14748365E9F;
		    aFloatArray9341[i_165_++] = 2.14748365E9F;
		    aFloatArray9341[i_165_++] = 2.14748365E9F;
		    aFloatArray9341[i_165_++] = 2.14748365E9F;
		    aFloatArray9341[i_165_++] = 2.14748365E9F;
		}
		while (i_165_ < i)
		    aFloatArray9341[i_165_++] = 2.14748365E9F;
	    } else {
		int i = anInt9343 * -1807368365 - anInt9365 * 1709859847;
		int i_166_ = 639238427 * anInt9345 - anInt9344 * 9823353;
		int i_167_ = anInt9356 * 356365251 - i;
		int i_168_ = (9823353 * anInt9344 * (356365251 * anInt9356)
			      + 1709859847 * anInt9365);
		int i_169_ = i >> 3;
		int i_170_ = i & 0x7;
		i = i_168_ - 1;
		for (int i_171_ = -i_166_; i_171_ < 0; i_171_++) {
		    if (i_169_ > 0) {
			int i_172_ = i_169_;
			do {
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			} while (--i_172_ > 0);
		    }
		    if (i_170_ > 0) {
			int i_173_ = i_170_;
			do
			    aFloatArray9341[++i] = 2.14748365E9F;
			while (--i_173_ > 0);
		    }
		    i += i_167_;
		}
	    }
	}
    }
    
    void method15005() {
	int i = anInt9343 * -1807368365 - 1709859847 * anInt9365;
	int i_174_ = anInt9345 * 639238427 - 9823353 * anInt9344;
	float f = aFloat9361 = (float) (-798650927 * anInt9359) / 2.0F;
	float f_175_ = aFloat9363 = (float) (anInt9360 * 314738383) / 2.0F;
	aFloat9342 = (float) (-1301915793 * anInt9357) + f;
	aFloat9368 = (float) (332831973 * anInt9364) + f_175_;
	for (int i_176_ = 0; i_176_ < 442227785 * anInt9367; i_176_++) {
	    Class101 class101 = aClass101Array9335[i_176_];
	    Class119 class119 = class101.aClass119_1233;
	    class119.aFloat1430 = f;
	    class119.aFloat1432 = f_175_;
	    class119.aFloat1429
		= aFloat9342 - (float) (1709859847 * anInt9365);
	    class119.aFloat1431 = aFloat9368 - (float) (anInt9344 * 9823353);
	    class119.anInt1448 = i;
	    class119.anInt1436 = i_174_;
	}
	int i_177_ = (anInt9344 * 9823353 * (356365251 * anInt9356)
		      + 1709859847 * anInt9365);
	for (int i_178_ = anInt9344 * 9823353; i_178_ < 639238427 * anInt9345;
	     i_178_++) {
	    for (int i_179_ = 0; i_179_ < 442227785 * anInt9367; i_179_++)
		aClass101Array9335[i_179_].aClass119_1233.anIntArray1428
		    [i_178_ - 9823353 * anInt9344]
		    = i_177_;
	    i_177_ += 356365251 * anInt9356;
	}
    }
    
    public boolean method3240() {
	return false;
    }
    
    public void method3373(int i, int i_180_, int i_181_, int i_182_) {
	if (i < 0)
	    i = 0;
	if (i_180_ < 0)
	    i_180_ = 0;
	if (i_181_ > anInt9356 * 356365251)
	    i_181_ = 356365251 * anInt9356;
	if (i_182_ > anInt9340 * 446066493)
	    i_182_ = anInt9340 * 446066493;
	anInt9365 = i * -1685075529;
	anInt9343 = -315695909 * i_181_;
	anInt9344 = i_180_ * 1960003017;
	anInt9345 = -217091821 * i_182_;
	method15005();
    }
    
    public void method3282(int i, int i_183_, int i_184_, int i_185_) {
	if (anInt9365 * 1709859847 < i)
	    anInt9365 = i * -1685075529;
	if (9823353 * anInt9344 < i_183_)
	    anInt9344 = i_183_ * 1960003017;
	if (anInt9343 * -1807368365 > i_184_)
	    anInt9343 = i_184_ * -315695909;
	if (anInt9345 * 639238427 > i_185_)
	    anInt9345 = i_185_ * -217091821;
	method15005();
    }
    
    void method3248(int i, int i_186_, int i_187_, int i_188_, int i_189_) {
	if (null != anIntArray9338 && (i_186_ >= 9823353 * anInt9344
				       && i_186_ < 639238427 * anInt9345)) {
	    if (i < 1709859847 * anInt9365) {
		i_187_ -= 1709859847 * anInt9365 - i;
		i = anInt9365 * 1709859847;
	    }
	    if (i + i_187_ > anInt9343 * -1807368365)
		i_187_ = -1807368365 * anInt9343 - i;
	    int i_190_ = i + i_186_ * (356365251 * anInt9356);
	    int i_191_ = i_188_ >>> 24;
	    if (i_189_ == 0 || 1 == i_189_ && 255 == i_191_) {
		for (int i_192_ = 0; i_192_ < i_187_; i_192_++)
		    anIntArray9338[i_192_ + i_190_] = i_188_;
	    } else if (1 == i_189_) {
		i_188_ = (i_191_ << 24) + ((i_191_ * (i_188_ & 0xff00) >> 8
					    & 0xff00)
					   + (i_191_ * (i_188_ & 0xff00ff) >> 8
					      & 0xff00ff));
		int i_193_ = 256 - i_191_;
		for (int i_194_ = 0; i_194_ < i_187_; i_194_++) {
		    int i_195_ = anIntArray9338[i_190_ + i_194_];
		    i_195_ = ((i_193_ * (i_195_ & 0xff00ff) >> 8 & 0xff00ff)
			      + ((i_195_ & 0xff00) * i_193_ >> 8 & 0xff00));
		    anIntArray9338[i_194_ + i_190_] = i_188_ + i_195_;
		}
	    } else if (2 == i_189_) {
		for (int i_196_ = 0; i_196_ < i_187_; i_196_++) {
		    int i_197_ = anIntArray9338[i_190_ + i_196_];
		    int i_198_ = i_197_ + i_188_;
		    int i_199_ = (i_197_ & 0xff00ff) + (i_188_ & 0xff00ff);
		    i_197_
			= (i_198_ - i_199_ & 0x10000) + (i_199_ & 0x1000100);
		    anIntArray9338[i_196_ + i_190_]
			= i_198_ - i_197_ | i_197_ - (i_197_ >>> 8);
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method3340(int i, int i_200_) {
	if ((i & 0x1) != 0)
	    method3298(0, 0, 356365251 * anInt9356, anInt9340 * 446066493,
		       i_200_, 0);
	if (0 != (i & 0x2))
	    method15003();
    }
    
    public Class163 method3407(int i, int i_201_, boolean bool,
			       boolean bool_202_) {
	if (bool)
	    return new Class163_Sub1_Sub1(this, i, i_201_);
	return new Class163_Sub1_Sub3(this, i, i_201_);
    }
    
    public void method3298(int i, int i_203_, int i_204_, int i_205_,
			   int i_206_, int i_207_) {
	if (anIntArray9338 != null) {
	    if (i < 1709859847 * anInt9365) {
		i_204_ -= 1709859847 * anInt9365 - i;
		i = 1709859847 * anInt9365;
	    }
	    if (i_203_ < 9823353 * anInt9344) {
		i_205_ -= anInt9344 * 9823353 - i_203_;
		i_203_ = 9823353 * anInt9344;
	    }
	    if (i + i_204_ > -1807368365 * anInt9343)
		i_204_ = anInt9343 * -1807368365 - i;
	    if (i_205_ + i_203_ > 639238427 * anInt9345)
		i_205_ = anInt9345 * 639238427 - i_203_;
	    if (i_204_ > 0 && i_205_ > 0 && i <= -1807368365 * anInt9343
		&& i_203_ <= anInt9345 * 639238427) {
		int i_208_ = anInt9356 * 356365251 - i_204_;
		int i_209_ = i_203_ * (anInt9356 * 356365251) + i;
		int i_210_ = i_206_ >>> 24;
		if (i_207_ == 0 || 1 == i_207_ && i_210_ == 255) {
		    int i_211_ = i_204_ >> 3;
		    int i_212_ = i_204_ & 0x7;
		    i_204_ = i_209_ - 1;
		    for (int i_213_ = -i_205_; i_213_ < 0; i_213_++) {
			if (i_211_ > 0) {
			    i = i_211_;
			    do {
				anIntArray9338[++i_204_] = i_206_;
				anIntArray9338[++i_204_] = i_206_;
				anIntArray9338[++i_204_] = i_206_;
				anIntArray9338[++i_204_] = i_206_;
				anIntArray9338[++i_204_] = i_206_;
				anIntArray9338[++i_204_] = i_206_;
				anIntArray9338[++i_204_] = i_206_;
				anIntArray9338[++i_204_] = i_206_;
			    } while (--i > 0);
			}
			if (i_212_ > 0) {
			    i = i_212_;
			    do
				anIntArray9338[++i_204_] = i_206_;
			    while (--i > 0);
			}
			i_204_ += i_208_;
		    }
		} else if (1 == i_207_) {
		    i_206_
			= ((((i_206_ & ~0xff00ff) >>> 8) * i_210_ & ~0xff00ff)
			   + ((i_206_ & 0xff00ff) * i_210_ >> 8 & 0xff00ff));
		    int i_214_ = 256 - i_210_;
		    for (int i_215_ = 0; i_215_ < i_205_; i_215_++) {
			for (int i_216_ = -i_204_; i_216_ < 0; i_216_++) {
			    int i_217_ = anIntArray9338[i_209_];
			    i_217_ = ((((i_217_ & ~0xff00ff) >>> 8) * i_214_
				       & ~0xff00ff)
				      + (i_214_ * (i_217_ & 0xff00ff) >> 8
					 & 0xff00ff));
			    anIntArray9338[i_209_++] = i_217_ + i_206_;
			}
			i_209_ += i_208_;
		    }
		} else if (i_207_ == 2) {
		    for (int i_218_ = 0; i_218_ < i_205_; i_218_++) {
			for (int i_219_ = -i_204_; i_219_ < 0; i_219_++) {
			    int i_220_ = anIntArray9338[i_209_];
			    int i_221_ = i_206_ + i_220_;
			    int i_222_
				= (i_220_ & 0xff00ff) + (i_206_ & 0xff00ff);
			    i_220_
				= (i_221_ - i_222_ & 0x10000) + (i_222_
								 & 0x1000100);
			    anIntArray9338[i_209_++]
				= i_221_ - i_220_ | i_220_ - (i_220_ >>> 8);
			}
			i_209_ += i_208_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method3300(int i, int i_223_, int i_224_, int i_225_, int i_226_) {
	if (anIntArray9338 != null) {
	    if (i_224_ < 0)
		i_224_ = -i_224_;
	    int i_227_ = i_223_ - i_224_;
	    if (i_227_ < anInt9344 * 9823353)
		i_227_ = 9823353 * anInt9344;
	    int i_228_ = i_223_ + i_224_ + 1;
	    if (i_228_ > 639238427 * anInt9345)
		i_228_ = 639238427 * anInt9345;
	    int i_229_ = i_227_;
	    int i_230_ = i_224_ * i_224_;
	    int i_231_ = 0;
	    int i_232_ = i_223_ - i_229_;
	    int i_233_ = i_232_ * i_232_;
	    int i_234_ = i_233_ - i_232_;
	    if (i_223_ > i_228_)
		i_223_ = i_228_;
	    int i_235_ = i_225_ >>> 24;
	    if (0 == i_226_ || 1 == i_226_ && i_235_ == 255) {
		while (i_229_ < i_223_) {
		    for (/**/; i_234_ <= i_230_ || i_233_ <= i_230_;
			 i_234_ += i_231_++ + i_231_)
			i_233_ += i_231_ + i_231_;
		    int i_236_ = i - i_231_ + 1;
		    if (i_236_ < 1709859847 * anInt9365)
			i_236_ = 1709859847 * anInt9365;
		    int i_237_ = i_231_ + i;
		    if (i_237_ > anInt9343 * -1807368365)
			i_237_ = anInt9343 * -1807368365;
		    int i_238_ = i_229_ * (356365251 * anInt9356) + i_236_;
		    for (int i_239_ = i_236_; i_239_ < i_237_; i_239_++)
			anIntArray9338[i_238_++] = i_225_;
		    i_229_++;
		    i_233_ -= i_232_-- + i_232_;
		    i_234_ -= i_232_ + i_232_;
		}
		i_231_ = i_224_;
		i_232_ = i_229_ - i_223_;
		i_234_ = i_230_ + i_232_ * i_232_;
		i_233_ = i_234_ - i_231_;
		i_234_ -= i_232_;
		while (i_229_ < i_228_) {
		    for (/**/; i_234_ > i_230_ && i_233_ > i_230_;
			 i_233_ -= i_231_ + i_231_)
			i_234_ -= i_231_-- + i_231_;
		    int i_240_ = i - i_231_;
		    if (i_240_ < anInt9365 * 1709859847)
			i_240_ = 1709859847 * anInt9365;
		    int i_241_ = i_231_ + i;
		    if (i_241_ > -1807368365 * anInt9343 - 1)
			i_241_ = -1807368365 * anInt9343 - 1;
		    int i_242_ = i_240_ + anInt9356 * 356365251 * i_229_;
		    for (int i_243_ = i_240_; i_243_ <= i_241_; i_243_++)
			anIntArray9338[i_242_++] = i_225_;
		    i_229_++;
		    i_234_ += i_232_ + i_232_;
		    i_233_ += i_232_++ + i_232_;
		}
	    } else if (i_226_ == 1) {
		i_225_ = ((i_235_ << 24)
			  + ((i_235_ * (i_225_ & 0xff00ff) >> 8 & 0xff00ff)
			     + (i_235_ * (i_225_ & 0xff00) >> 8 & 0xff00)));
		int i_244_ = 256 - i_235_;
		while (i_229_ < i_223_) {
		    for (/**/; i_234_ <= i_230_ || i_233_ <= i_230_;
			 i_234_ += i_231_++ + i_231_)
			i_233_ += i_231_ + i_231_;
		    int i_245_ = i - i_231_ + 1;
		    if (i_245_ < anInt9365 * 1709859847)
			i_245_ = 1709859847 * anInt9365;
		    int i_246_ = i_231_ + i;
		    if (i_246_ > -1807368365 * anInt9343)
			i_246_ = -1807368365 * anInt9343;
		    int i_247_ = i_229_ * (anInt9356 * 356365251) + i_245_;
		    for (int i_248_ = i_245_; i_248_ < i_246_; i_248_++) {
			int i_249_ = anIntArray9338[i_247_];
			i_249_ = ((i_244_ * (i_249_ & 0xff00) >> 8 & 0xff00)
				  + (i_244_ * (i_249_ & 0xff00ff) >> 8
				     & 0xff00ff));
			anIntArray9338[i_247_++] = i_249_ + i_225_;
		    }
		    i_229_++;
		    i_233_ -= i_232_-- + i_232_;
		    i_234_ -= i_232_ + i_232_;
		}
		i_231_ = i_224_;
		i_232_ = -i_232_;
		i_234_ = i_230_ + i_232_ * i_232_;
		i_233_ = i_234_ - i_231_;
		i_234_ -= i_232_;
		while (i_229_ < i_228_) {
		    for (/**/; i_234_ > i_230_ && i_233_ > i_230_;
			 i_233_ -= i_231_ + i_231_)
			i_234_ -= i_231_-- + i_231_;
		    int i_250_ = i - i_231_;
		    if (i_250_ < 1709859847 * anInt9365)
			i_250_ = 1709859847 * anInt9365;
		    int i_251_ = i_231_ + i;
		    if (i_251_ > anInt9343 * -1807368365 - 1)
			i_251_ = -1807368365 * anInt9343 - 1;
		    int i_252_ = i_229_ * (anInt9356 * 356365251) + i_250_;
		    for (int i_253_ = i_250_; i_253_ <= i_251_; i_253_++) {
			int i_254_ = anIntArray9338[i_252_];
			i_254_ = ((i_244_ * (i_254_ & 0xff00) >> 8 & 0xff00)
				  + ((i_254_ & 0xff00ff) * i_244_ >> 8
				     & 0xff00ff));
			anIntArray9338[i_252_++] = i_254_ + i_225_;
		    }
		    i_229_++;
		    i_234_ += i_232_ + i_232_;
		    i_233_ += i_232_++ + i_232_;
		}
	    } else if (2 == i_226_) {
		while (i_229_ < i_223_) {
		    for (/**/; i_234_ <= i_230_ || i_233_ <= i_230_;
			 i_234_ += i_231_++ + i_231_)
			i_233_ += i_231_ + i_231_;
		    int i_255_ = i - i_231_ + 1;
		    if (i_255_ < anInt9365 * 1709859847)
			i_255_ = 1709859847 * anInt9365;
		    int i_256_ = i_231_ + i;
		    if (i_256_ > -1807368365 * anInt9343)
			i_256_ = -1807368365 * anInt9343;
		    int i_257_ = anInt9356 * 356365251 * i_229_ + i_255_;
		    for (int i_258_ = i_255_; i_258_ < i_256_; i_258_++) {
			int i_259_ = anIntArray9338[i_257_];
			int i_260_ = i_259_ + i_225_;
			int i_261_ = (i_259_ & 0xff00ff) + (i_225_ & 0xff00ff);
			i_259_ = (i_260_ - i_261_ & 0x10000) + (i_261_
								& 0x1000100);
			anIntArray9338[i_257_++]
			    = i_260_ - i_259_ | i_259_ - (i_259_ >>> 8);
		    }
		    i_229_++;
		    i_233_ -= i_232_-- + i_232_;
		    i_234_ -= i_232_ + i_232_;
		}
		i_231_ = i_224_;
		i_232_ = -i_232_;
		i_234_ = i_230_ + i_232_ * i_232_;
		i_233_ = i_234_ - i_231_;
		i_234_ -= i_232_;
		while (i_229_ < i_228_) {
		    for (/**/; i_234_ > i_230_ && i_233_ > i_230_;
			 i_233_ -= i_231_ + i_231_)
			i_234_ -= i_231_-- + i_231_;
		    int i_262_ = i - i_231_;
		    if (i_262_ < 1709859847 * anInt9365)
			i_262_ = anInt9365 * 1709859847;
		    int i_263_ = i_231_ + i;
		    if (i_263_ > -1807368365 * anInt9343 - 1)
			i_263_ = -1807368365 * anInt9343 - 1;
		    int i_264_ = i_262_ + 356365251 * anInt9356 * i_229_;
		    for (int i_265_ = i_262_; i_265_ <= i_263_; i_265_++) {
			int i_266_ = anIntArray9338[i_264_];
			int i_267_ = i_266_ + i_225_;
			int i_268_ = (i_225_ & 0xff00ff) + (i_266_ & 0xff00ff);
			i_266_ = (i_268_ & 0x1000100) + (i_267_ - i_268_
							 & 0x10000);
			anIntArray9338[i_264_++]
			    = i_267_ - i_266_ | i_266_ - (i_266_ >>> 8);
		    }
		    i_229_++;
		    i_234_ += i_232_ + i_232_;
		    i_233_ += i_232_++ + i_232_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    boolean method3420(int i, int i_269_, int i_270_, int i_271_,
		       Class446 class446, Class432 class432) {
	Class433 class433 = method3518();
	class433.method6916(class446);
	class433.method6839(aClass433_9346);
	return class432.method6838(i, i_269_, i_270_, i_271_, class433,
				   aFloat9342, aFloat9368, aFloat9361,
				   aFloat9363);
    }
    
    void method15006(int i, int i_272_, int i_273_, int i_274_, int i_275_,
		     int i_276_, int i_277_, int i_278_) {
	if (anIntArray9338 != null && (i_272_ >= anInt9344 * 9823353
				       && i_272_ < anInt9345 * 639238427)) {
	    int i_279_ = i_272_ * (356365251 * anInt9356) + i;
	    int i_280_ = i_274_ >>> 24;
	    int i_281_ = i_277_ + i_276_;
	    int i_282_ = i_278_ % i_281_;
	    if (i_275_ == 0 || 1 == i_275_ && 255 == i_280_) {
		int i_283_ = 0;
		while (i_283_ < i_273_) {
		    if (i_283_ + i >= anInt9365 * 1709859847
			&& i_283_ + i < anInt9343 * -1807368365
			&& i_282_ < i_276_)
			anIntArray9338[i_283_ + i_279_] = i_274_;
		    i_283_++;
		    i_282_ = ++i_282_ % i_281_;
		}
	    } else if (i_275_ == 1) {
		i_274_ = (((i_274_ & 0xff00) * i_280_ >> 8 & 0xff00)
			  + (i_280_ * (i_274_ & 0xff00ff) >> 8 & 0xff00ff)
			  + (i_280_ << 24));
		int i_284_ = 256 - i_280_;
		int i_285_ = 0;
		while (i_285_ < i_273_) {
		    if (i + i_285_ >= 1709859847 * anInt9365
			&& i_285_ + i < -1807368365 * anInt9343
			&& i_282_ < i_276_) {
			int i_286_ = anIntArray9338[i_285_ + i_279_];
			i_286_
			    = ((i_284_ * (i_286_ & 0xff00ff) >> 8 & 0xff00ff)
			       + (i_284_ * (i_286_ & 0xff00) >> 8 & 0xff00));
			anIntArray9338[i_285_ + i_279_] = i_274_ + i_286_;
		    }
		    i_285_++;
		    i_282_ = ++i_282_ % i_281_;
		}
	    } else if (2 == i_275_) {
		int i_287_ = 0;
		while (i_287_ < i_273_) {
		    if (i + i_287_ >= 1709859847 * anInt9365
			&& i + i_287_ < -1807368365 * anInt9343
			&& i_282_ < i_276_) {
			int i_288_ = anIntArray9338[i_287_ + i_279_];
			int i_289_ = i_274_ + i_288_;
			int i_290_ = (i_288_ & 0xff00ff) + (i_274_ & 0xff00ff);
			i_288_ = (i_290_ & 0x1000100) + (i_289_ - i_290_
							 & 0x10000);
			anIntArray9338[i_279_ + i_287_]
			    = i_289_ - i_288_ | i_288_ - (i_288_ >>> 8);
		    }
		    i_287_++;
		    i_282_ = ++i_282_ % i_281_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method3680(int i, int i_291_, int i_292_, int i_293_, int i_294_) {
	if (null != anIntArray9338
	    && (i >= 1709859847 * anInt9365 && i < -1807368365 * anInt9343)) {
	    if (i_291_ < 9823353 * anInt9344) {
		i_292_ -= 9823353 * anInt9344 - i_291_;
		i_291_ = anInt9344 * 9823353;
	    }
	    if (i_292_ + i_291_ > 639238427 * anInt9345)
		i_292_ = anInt9345 * 639238427 - i_291_;
	    int i_295_ = 356365251 * anInt9356 * i_291_ + i;
	    int i_296_ = i_293_ >>> 24;
	    if (0 == i_294_ || 1 == i_294_ && i_296_ == 255) {
		for (int i_297_ = 0; i_297_ < i_292_; i_297_++)
		    anIntArray9338[i_295_ + 356365251 * anInt9356 * i_297_]
			= i_293_;
	    } else if (1 == i_294_) {
		i_293_ = ((i_296_ * (i_293_ & 0xff00) >> 8 & 0xff00)
			  + (i_296_ * (i_293_ & 0xff00ff) >> 8 & 0xff00ff)
			  + (i_296_ << 24));
		int i_298_ = 256 - i_296_;
		for (int i_299_ = 0; i_299_ < i_292_; i_299_++) {
		    int i_300_ = i_299_ * (anInt9356 * 356365251) + i_295_;
		    int i_301_ = anIntArray9338[i_300_];
		    i_301_ = ((i_298_ * (i_301_ & 0xff00ff) >> 8 & 0xff00ff)
			      + (i_298_ * (i_301_ & 0xff00) >> 8 & 0xff00));
		    anIntArray9338[i_300_] = i_301_ + i_293_;
		}
	    } else if (2 == i_294_) {
		for (int i_302_ = 0; i_302_ < i_292_; i_302_++) {
		    int i_303_ = i_295_ + i_302_ * (anInt9356 * 356365251);
		    int i_304_ = anIntArray9338[i_303_];
		    int i_305_ = i_293_ + i_304_;
		    int i_306_ = (i_293_ & 0xff00ff) + (i_304_ & 0xff00ff);
		    i_304_
			= (i_305_ - i_306_ & 0x10000) + (i_306_ & 0x1000100);
		    anIntArray9338[i_303_]
			= i_305_ - i_304_ | i_304_ - (i_304_ >>> 8);
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method3360(int[] is) {
	is[0] = anInt9365 * 1709859847;
	is[1] = 9823353 * anInt9344;
	is[2] = -1807368365 * anInt9343;
	is[3] = anInt9345 * 639238427;
    }
    
    public void method3303(int i, int i_307_, int i_308_, int i_309_,
			   int i_310_, int i_311_) {
	if (anIntArray9338 != null) {
	    i_308_ -= i;
	    i_309_ -= i_307_;
	    if (i_309_ == 0) {
		if (i_308_ >= 0)
		    method3248(i, i_307_, i_308_ + 1, i_310_, i_311_);
		else
		    method3248(i_308_ + i, i_307_, 1 + -i_308_, i_310_,
			       i_311_);
	    } else if (i_308_ == 0) {
		if (i_309_ >= 0)
		    method3680(i, i_307_, i_309_ + 1, i_310_, i_311_);
		else
		    method3680(i, i_309_ + i_307_, -i_309_ + 1, i_310_,
			       i_311_);
	    } else {
		if (i_309_ + i_308_ < 0) {
		    i += i_308_;
		    i_308_ = -i_308_;
		    i_307_ += i_309_;
		    i_309_ = -i_309_;
		}
		if (i_308_ > i_309_) {
		    i_307_ <<= 16;
		    i_307_ += 32768;
		    i_309_ <<= 16;
		    int i_312_ = (int) Math.floor(0.5 + ((double) i_309_
							 / (double) i_308_));
		    i_308_ += i;
		    if (i < 1709859847 * anInt9365) {
			i_307_ += (1709859847 * anInt9365 - i) * i_312_;
			i = 1709859847 * anInt9365;
		    }
		    if (i_308_ >= anInt9343 * -1807368365)
			i_308_ = anInt9343 * -1807368365 - 1;
		    int i_313_ = i_310_ >>> 24;
		    if (i_311_ == 0 || i_311_ == 1 && 255 == i_313_) {
			for (/**/; i <= i_308_; i++) {
			    int i_314_ = i_307_ >> 16;
			    if (i_314_ >= 9823353 * anInt9344
				&& i_314_ < 639238427 * anInt9345)
				anIntArray9338[i + i_314_ * (anInt9356
							     * 356365251)]
				    = i_310_;
			    i_307_ += i_312_;
			}
		    } else if (i_311_ == 1) {
			i_310_ = ((i_313_ << 24)
				  + ((i_313_ * (i_310_ & 0xff00) >> 8 & 0xff00)
				     + ((i_310_ & 0xff00ff) * i_313_ >> 8
					& 0xff00ff)));
			int i_315_ = 256 - i_313_;
			for (/**/; i <= i_308_; i++) {
			    int i_316_ = i_307_ >> 16;
			    if (i_316_ >= 9823353 * anInt9344
				&& i_316_ < anInt9345 * 639238427) {
				int i_317_
				    = anInt9356 * 356365251 * i_316_ + i;
				int i_318_ = anIntArray9338[i_317_];
				i_318_ = ((i_315_ * (i_318_ & 0xff00) >> 8
					   & 0xff00)
					  + ((i_318_ & 0xff00ff) * i_315_ >> 8
					     & 0xff00ff));
				anIntArray9338[i_317_] = i_310_ + i_318_;
			    }
			    i_307_ += i_312_;
			}
		    } else if (i_311_ == 2) {
			for (/**/; i <= i_308_; i++) {
			    int i_319_ = i_307_ >> 16;
			    if (i_319_ >= 9823353 * anInt9344
				&& i_319_ < 639238427 * anInt9345) {
				int i_320_
				    = i_319_ * (anInt9356 * 356365251) + i;
				int i_321_ = anIntArray9338[i_320_];
				int i_322_ = i_321_ + i_310_;
				int i_323_ = ((i_321_ & 0xff00ff)
					      + (i_310_ & 0xff00ff));
				i_321_ = ((i_322_ - i_323_ & 0x10000)
					  + (i_323_ & 0x1000100));
				anIntArray9338[i_320_]
				    = i_322_ - i_321_ | i_321_ - (i_321_
								  >>> 8);
			    }
			    i_307_ += i_312_;
			}
		    } else
			throw new IllegalArgumentException();
		} else {
		    i <<= 16;
		    i += 32768;
		    i_308_ <<= 16;
		    int i_324_ = (int) Math.floor(0.5 + ((double) i_308_
							 / (double) i_309_));
		    i_309_ += i_307_;
		    if (i_307_ < 9823353 * anInt9344) {
			i += (9823353 * anInt9344 - i_307_) * i_324_;
			i_307_ = 9823353 * anInt9344;
		    }
		    if (i_309_ >= 639238427 * anInt9345)
			i_309_ = 639238427 * anInt9345 - 1;
		    int i_325_ = i_310_ >>> 24;
		    if (i_311_ == 0 || i_311_ == 1 && i_325_ == 255) {
			for (/**/; i_307_ <= i_309_; i_307_++) {
			    int i_326_ = i >> 16;
			    if (i_326_ >= anInt9365 * 1709859847
				&& i_326_ < -1807368365 * anInt9343)
				anIntArray9338[i_326_ + (356365251 * anInt9356
							 * i_307_)]
				    = i_310_;
			    i += i_324_;
			}
		    } else if (i_311_ == 1) {
			i_310_
			    = (((i_310_ & 0xff00ff) * i_325_ >> 8 & 0xff00ff)
			       + (i_325_ * (i_310_ & 0xff00) >> 8 & 0xff00)
			       + (i_325_ << 24));
			int i_327_ = 256 - i_325_;
			for (/**/; i_307_ <= i_309_; i_307_++) {
			    int i_328_ = i >> 16;
			    if (i_328_ >= anInt9365 * 1709859847
				&& i_328_ < anInt9343 * -1807368365) {
				int i_329_ = i_328_ + i_307_ * (anInt9356
								* 356365251);
				int i_330_ = anIntArray9338[i_329_];
				i_330_ = ((i_327_ * (i_330_ & 0xff00) >> 8
					   & 0xff00)
					  + ((i_330_ & 0xff00ff) * i_327_ >> 8
					     & 0xff00ff));
				anIntArray9338[i_328_ + i_307_ * (356365251
								  * anInt9356)]
				    = i_310_ + i_330_;
			    }
			    i += i_324_;
			}
		    } else if (2 == i_311_) {
			for (/**/; i_307_ <= i_309_; i_307_++) {
			    int i_331_ = i >> 16;
			    if (i_331_ >= anInt9365 * 1709859847
				&& i_331_ < anInt9343 * -1807368365) {
				int i_332_
				    = 356365251 * anInt9356 * i_307_ + i_331_;
				int i_333_ = anIntArray9338[i_332_];
				int i_334_ = i_310_ + i_333_;
				int i_335_ = ((i_310_ & 0xff00ff)
					      + (i_333_ & 0xff00ff));
				i_333_
				    = (i_335_ & 0x1000100) + (i_334_ - i_335_
							      & 0x10000);
				anIntArray9338[i_332_]
				    = i_334_ - i_333_ | i_333_ - (i_333_
								  >>> 8);
			    }
			    i += i_324_;
			}
		    } else
			throw new IllegalArgumentException();
		}
	    }
	}
    }
    
    void method15007(int i, int i_336_, int[] is, float[] fs) {
	anInt9356 = i * -2095033109;
	anInt9340 = 1188716565 * i_336_;
	anIntArray9338 = is;
	aFloatArray9341 = fs;
	for (int i_337_ = 0; i_337_ < anInt9367 * 442227785; i_337_++)
	    aClass101Array9335[i_337_].method1893(1142803680);
	method3537();
	method3281();
    }
    
    public void method3384(int i, int i_338_, int i_339_, int i_340_,
			   int i_341_, int i_342_, Class145 class145,
			   int i_343_, int i_344_) {
	if (anIntArray9338 != null) {
	    Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
	    int[] is = class145_sub2.anIntArray9797;
	    int[] is_345_ = class145_sub2.anIntArray9798;
	    int i_346_
		= 9823353 * anInt9344 > i_344_ ? anInt9344 * 9823353 : i_344_;
	    int i_347_ = (639238427 * anInt9345 < is.length + i_344_
			  ? 639238427 * anInt9345 : i_344_ + is.length);
	    i_339_ -= i;
	    i_340_ -= i_338_;
	    if (i_339_ + i_340_ < 0) {
		i += i_339_;
		i_339_ = -i_339_;
		i_338_ += i_340_;
		i_340_ = -i_340_;
	    }
	    if (i_339_ > i_340_) {
		i_338_ <<= 16;
		i_338_ += 32768;
		i_340_ <<= 16;
		int i_348_ = (int) Math.floor((double) i_340_ / (double) i_339_
					      + 0.5);
		i_339_ += i;
		if (i < anInt9365 * 1709859847) {
		    i_338_ += (1709859847 * anInt9365 - i) * i_348_;
		    i = anInt9365 * 1709859847;
		}
		if (i_339_ >= anInt9343 * -1807368365)
		    i_339_ = -1807368365 * anInt9343 - 1;
		int i_349_ = i_341_ >>> 24;
		if (i_342_ == 0 || 1 == i_342_ && i_349_ == 255) {
		    for (/**/; i <= i_339_; i++) {
			int i_350_ = i_338_ >> 16;
			int i_351_ = i_350_ - i_344_;
			if (i_350_ >= i_346_ && i_350_ < i_347_) {
			    int i_352_ = is[i_351_] + i_343_;
			    if (i >= i_352_ && i < i_352_ + is_345_[i_351_])
				anIntArray9338[(356365251 * anInt9356 * i_350_
						+ i)]
				    = i_341_;
			}
			i_338_ += i_348_;
		    }
		} else if (i_342_ == 1) {
		    i_341_ = (((i_341_ & 0xff00) * i_349_ >> 8 & 0xff00)
			      + ((i_341_ & 0xff00ff) * i_349_ >> 8 & 0xff00ff)
			      + (i_349_ << 24));
		    int i_353_ = 256 - i_349_;
		    for (/**/; i <= i_339_; i++) {
			int i_354_ = i_338_ >> 16;
			int i_355_ = i_354_ - i_344_;
			if (i_354_ >= i_346_ && i_354_ < i_347_) {
			    int i_356_ = i_343_ + is[i_355_];
			    if (i >= i_356_ && i < i_356_ + is_345_[i_355_]) {
				int i_357_
				    = i + anInt9356 * 356365251 * i_354_;
				int i_358_ = anIntArray9338[i_357_];
				i_358_ = ((i_353_ * (i_358_ & 0xff00ff) >> 8
					   & 0xff00ff)
					  + ((i_358_ & 0xff00) * i_353_ >> 8
					     & 0xff00));
				anIntArray9338[i_357_] = i_358_ + i_341_;
			    }
			}
			i_338_ += i_348_;
		    }
		} else if (i_342_ == 2) {
		    for (/**/; i <= i_339_; i++) {
			int i_359_ = i_338_ >> 16;
			int i_360_ = i_359_ - i_344_;
			if (i_359_ >= i_346_ && i_359_ < i_347_) {
			    int i_361_ = i_343_ + is[i_360_];
			    if (i >= i_361_ && i < is_345_[i_360_] + i_361_) {
				int i_362_
				    = 356365251 * anInt9356 * i_359_ + i;
				int i_363_ = anIntArray9338[i_362_];
				int i_364_ = i_341_ + i_363_;
				int i_365_ = ((i_363_ & 0xff00ff)
					      + (i_341_ & 0xff00ff));
				i_363_ = ((i_364_ - i_365_ & 0x10000)
					  + (i_365_ & 0x1000100));
				anIntArray9338[i_362_]
				    = i_364_ - i_363_ | i_363_ - (i_363_
								  >>> 8);
			    }
			}
			i_338_ += i_348_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else {
		i <<= 16;
		i += 32768;
		i_339_ <<= 16;
		int i_366_ = (int) Math.floor(0.5 + ((double) i_339_
						     / (double) i_340_));
		i_340_ += i_338_;
		if (i_338_ < i_346_) {
		    i += (i_346_ - i_338_) * i_366_;
		    i_338_ = i_346_;
		}
		if (i_340_ >= i_347_)
		    i_340_ = i_347_ - 1;
		int i_367_ = i_341_ >>> 24;
		if (0 == i_342_ || 1 == i_342_ && 255 == i_367_) {
		    for (/**/; i_338_ <= i_340_; i_338_++) {
			int i_368_ = i >> 16;
			int i_369_ = i_338_ - i_344_;
			int i_370_ = is[i_369_] + i_343_;
			if (i_368_ >= 1709859847 * anInt9365
			    && i_368_ < -1807368365 * anInt9343
			    && i_368_ >= i_370_
			    && i_368_ < is_345_[i_369_] + i_370_)
			    anIntArray9338[(i_338_ * (356365251 * anInt9356)
					    + i_368_)]
				= i_341_;
			i += i_366_;
		    }
		} else if (i_342_ == 1) {
		    i_341_ = (((i_341_ & 0xff00ff) * i_367_ >> 8 & 0xff00ff)
			      + (i_367_ * (i_341_ & 0xff00) >> 8 & 0xff00)
			      + (i_367_ << 24));
		    int i_371_ = 256 - i_367_;
		    for (/**/; i_338_ <= i_340_; i_338_++) {
			int i_372_ = i >> 16;
			int i_373_ = i_338_ - i_344_;
			int i_374_ = i_343_ + is[i_373_];
			if (i_372_ >= anInt9365 * 1709859847
			    && i_372_ < anInt9343 * -1807368365
			    && i_372_ >= i_374_
			    && i_372_ < i_374_ + is_345_[i_373_]) {
			    int i_375_
				= i_372_ + 356365251 * anInt9356 * i_338_;
			    int i_376_ = anIntArray9338[i_375_];
			    i_376_
				= ((i_371_ * (i_376_ & 0xff00) >> 8 & 0xff00)
				   + ((i_376_ & 0xff00ff) * i_371_ >> 8
				      & 0xff00ff));
			    anIntArray9338[(i_338_ * (356365251 * anInt9356)
					    + i_372_)]
				= i_341_ + i_376_;
			}
			i += i_366_;
		    }
		} else if (i_342_ == 2) {
		    for (/**/; i_338_ <= i_340_; i_338_++) {
			int i_377_ = i >> 16;
			int i_378_ = i_338_ - i_344_;
			int i_379_ = i_343_ + is[i_378_];
			if (i_377_ >= anInt9365 * 1709859847
			    && i_377_ < anInt9343 * -1807368365
			    && i_377_ >= i_379_
			    && i_377_ < is_345_[i_378_] + i_379_) {
			    int i_380_
				= i_377_ + i_338_ * (anInt9356 * 356365251);
			    int i_381_ = anIntArray9338[i_380_];
			    int i_382_ = i_341_ + i_381_;
			    int i_383_
				= (i_381_ & 0xff00ff) + (i_341_ & 0xff00ff);
			    i_381_
				= (i_382_ - i_383_ & 0x10000) + (i_383_
								 & 0x1000100);
			    anIntArray9338[i_380_]
				= i_382_ - i_381_ | i_381_ - (i_381_ >>> 8);
			}
			i += i_366_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method3306(int i, int i_384_, int i_385_, int i_386_,
			   int i_387_, int i_388_, Class145 class145,
			   int i_389_, int i_390_, int i_391_, int i_392_,
			   int i_393_) {
	if (null != anIntArray9338) {
	    Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
	    int[] is = class145_sub2.anIntArray9797;
	    int[] is_394_ = class145_sub2.anIntArray9798;
	    int i_395_
		= anInt9344 * 9823353 > i_390_ ? anInt9344 * 9823353 : i_390_;
	    int i_396_ = (anInt9345 * 639238427 < i_390_ + is.length
			  ? anInt9345 * 639238427 : is.length + i_390_);
	    i_393_ <<= 8;
	    i_391_ <<= 8;
	    i_392_ <<= 8;
	    int i_397_ = i_392_ + i_391_;
	    i_393_ %= i_397_;
	    i_385_ -= i;
	    i_386_ -= i_384_;
	    if (i_386_ + i_385_ < 0) {
		int i_398_ = (int) (Math.sqrt((double) (i_386_ * i_386_
							+ i_385_ * i_385_))
				    * 256.0);
		int i_399_ = i_398_ % i_397_;
		i_393_ = i_391_ + i_397_ - i_393_ - i_399_;
		i_393_ %= i_397_;
		if (i_393_ < 0)
		    i_393_ += i_397_;
		i += i_385_;
		i_385_ = -i_385_;
		i_384_ += i_386_;
		i_386_ = -i_386_;
	    }
	    if (i_385_ > i_386_) {
		i_384_ <<= 16;
		i_384_ += 32768;
		i_386_ <<= 16;
		int i_400_ = (int) Math.floor((double) i_386_ / (double) i_385_
					      + 0.5);
		i_385_ += i;
		int i_401_ = i_387_ >>> 24;
		int i_402_
		    = (int) Math.sqrt((double) ((i_400_ >> 8) * (i_400_ >> 8)
						+ 65536));
		if (i_388_ == 0 || 1 == i_388_ && 255 == i_401_) {
		    while (i <= i_385_) {
			int i_403_ = i_384_ >> 16;
			int i_404_ = i_403_ - i_390_;
			if (i >= 1709859847 * anInt9365
			    && i < anInt9343 * -1807368365 && i_403_ >= i_395_
			    && i_403_ < i_396_ && i_393_ < i_391_) {
			    int i_405_ = i_389_ + is[i_404_];
			    if (i >= i_405_ && i < is_394_[i_404_] + i_405_)
				anIntArray9338[i + i_403_ * (anInt9356
							     * 356365251)]
				    = i_387_;
			}
			i_384_ += i_400_;
			i++;
			i_393_ += i_402_;
			i_393_ %= i_397_;
		    }
		} else if (1 == i_388_) {
		    i_387_ = (((i_387_ & 0xff00) * i_401_ >> 8 & 0xff00)
			      + (i_401_ * (i_387_ & 0xff00ff) >> 8 & 0xff00ff)
			      + (i_401_ << 24));
		    int i_406_ = 256 - i_401_;
		    while (i <= i_385_) {
			int i_407_ = i_384_ >> 16;
			int i_408_ = i_407_ - i_390_;
			if (i >= 1709859847 * anInt9365
			    && i < -1807368365 * anInt9343 && i_407_ >= i_395_
			    && i_407_ < i_396_ && i_393_ < i_391_) {
			    int i_409_ = is[i_408_] + i_389_;
			    if (i >= i_409_ && i < is_394_[i_408_] + i_409_) {
				int i_410_
				    = i + i_407_ * (356365251 * anInt9356);
				int i_411_ = anIntArray9338[i_410_];
				i_411_ = ((i_406_ * (i_411_ & 0xff00ff) >> 8
					   & 0xff00ff)
					  + (i_406_ * (i_411_ & 0xff00) >> 8
					     & 0xff00));
				anIntArray9338[i_410_] = i_411_ + i_387_;
			    }
			}
			i_384_ += i_400_;
			i++;
			i_393_ += i_402_;
			i_393_ %= i_397_;
		    }
		} else if (i_388_ == 2) {
		    while (i <= i_385_) {
			int i_412_ = i_384_ >> 16;
			int i_413_ = i_412_ - i_390_;
			if (i >= 1709859847 * anInt9365
			    && i < -1807368365 * anInt9343 && i_412_ >= i_395_
			    && i_412_ < i_396_ && i_393_ < i_391_) {
			    int i_414_ = i_389_ + is[i_413_];
			    if (i >= i_414_ && i < i_414_ + is_394_[i_413_]) {
				int i_415_
				    = i_412_ * (anInt9356 * 356365251) + i;
				int i_416_ = anIntArray9338[i_415_];
				int i_417_ = i_387_ + i_416_;
				int i_418_ = ((i_387_ & 0xff00ff)
					      + (i_416_ & 0xff00ff));
				i_416_ = ((i_417_ - i_418_ & 0x10000)
					  + (i_418_ & 0x1000100));
				anIntArray9338[i_415_]
				    = i_417_ - i_416_ | i_416_ - (i_416_
								  >>> 8);
			    }
			}
			i_384_ += i_400_;
			i++;
			i_393_ += i_402_;
			i_393_ %= i_397_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else {
		i <<= 16;
		i += 32768;
		i_385_ <<= 16;
		int i_419_ = (int) Math.floor((double) i_385_ / (double) i_386_
					      + 0.5);
		int i_420_
		    = (int) Math.sqrt((double) (65536
						+ (i_419_ >> 8) * (i_419_
								   >> 8)));
		i_386_ += i_384_;
		int i_421_ = i_387_ >>> 24;
		if (i_388_ == 0 || i_388_ == 1 && i_421_ == 255) {
		    while (i_384_ <= i_386_) {
			int i_422_ = i >> 16;
			int i_423_ = i_384_ - i_390_;
			if (i_384_ >= i_395_ && i_384_ < i_396_
			    && i_422_ >= anInt9365 * 1709859847
			    && i_422_ < anInt9343 * -1807368365
			    && i_393_ < i_391_ && i_422_ >= i_389_ + is[i_423_]
			    && i_422_ < is_394_[i_423_] + (i_389_
							   + is[i_423_]))
			    anIntArray9338[(356365251 * anInt9356 * i_384_
					    + i_422_)]
				= i_387_;
			i += i_419_;
			i_384_++;
			i_393_ += i_420_;
			i_393_ %= i_397_;
		    }
		} else if (i_388_ == 1) {
		    i_387_
			= ((i_421_ << 24)
			   + ((i_421_ * (i_387_ & 0xff00ff) >> 8 & 0xff00ff)
			      + (i_421_ * (i_387_ & 0xff00) >> 8 & 0xff00)));
		    int i_424_ = 256 - i_421_;
		    while (i_384_ <= i_386_) {
			int i_425_ = i >> 16;
			int i_426_ = i_384_ - i_390_;
			if (i_384_ >= i_395_ && i_384_ < i_396_
			    && i_425_ >= anInt9365 * 1709859847
			    && i_425_ < -1807368365 * anInt9343
			    && i_393_ < i_391_ && i_425_ >= i_389_ + is[i_426_]
			    && (i_425_
				< i_389_ + is[i_426_] + is_394_[i_426_])) {
			    int i_427_
				= i_425_ + i_384_ * (356365251 * anInt9356);
			    int i_428_ = anIntArray9338[i_427_];
			    i_428_ = ((i_424_ * (i_428_ & 0xff00ff) >> 8
				       & 0xff00ff)
				      + (i_424_ * (i_428_ & 0xff00) >> 8
					 & 0xff00));
			    anIntArray9338[(anInt9356 * 356365251 * i_384_
					    + i_425_)]
				= i_428_ + i_387_;
			}
			i += i_419_;
			i_384_++;
			i_393_ += i_420_;
			i_393_ %= i_397_;
		    }
		} else if (i_388_ == 2) {
		    while (i_384_ <= i_386_) {
			int i_429_ = i >> 16;
			int i_430_ = i_384_ - i_390_;
			if (i_384_ >= i_395_ && i_384_ < i_396_
			    && i_429_ >= 1709859847 * anInt9365
			    && i_429_ < anInt9343 * -1807368365
			    && i_393_ < i_391_ && i_429_ >= is[i_430_] + i_389_
			    && i_429_ < is_394_[i_430_] + (is[i_430_]
							   + i_389_)) {
			    int i_431_
				= i_429_ + 356365251 * anInt9356 * i_384_;
			    int i_432_ = anIntArray9338[i_431_];
			    int i_433_ = i_432_ + i_387_;
			    int i_434_
				= (i_432_ & 0xff00ff) + (i_387_ & 0xff00ff);
			    i_432_
				= (i_433_ - i_434_ & 0x10000) + (i_434_
								 & 0x1000100);
			    anIntArray9338[i_431_]
				= i_433_ - i_432_ | i_432_ - (i_432_ >>> 8);
			}
			i += i_419_;
			i_384_++;
			i_393_ += i_420_;
			i_393_ %= i_397_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method3307(int i, int i_435_, int i_436_, int i_437_,
			   int i_438_, int i_439_, int i_440_) {
	if (anIntArray9338 != null) {
	    Class101 class101 = method15011(Thread.currentThread());
	    Class119 class119 = class101.aClass119_1233;
	    int i_441_ = i_436_ - i;
	    int i_442_ = i_437_ - i_435_;
	    int i_443_ = i_441_ >= 0 ? i_441_ : -i_441_;
	    int i_444_ = i_442_ >= 0 ? i_442_ : -i_442_;
	    int i_445_ = i_443_;
	    if (i_445_ < i_444_)
		i_445_ = i_444_;
	    if (0 != i_445_) {
		int i_446_ = (i_441_ << 16) / i_445_;
		int i_447_ = (i_442_ << 16) / i_445_;
		i_441_ += i_446_ >> 16;
		i_442_ += i_447_ >> 16;
		if (i_447_ <= i_446_)
		    i_446_ = -i_446_;
		else
		    i_447_ = -i_447_;
		int i_448_ = i_447_ * i_439_ >> 17;
		int i_449_ = 1 + i_439_ * i_447_ >> 17;
		int i_450_ = i_439_ * i_446_ >> 17;
		int i_451_ = 1 + i_439_ * i_446_ >> 17;
		i -= class119.method2136();
		i_435_ -= class119.method2146();
		int i_452_ = i_448_ + i;
		int i_453_ = i - i_449_;
		int i_454_ = i_441_ + i - i_449_;
		int i_455_ = i_441_ + i + i_448_;
		int i_456_ = i_435_ + i_450_;
		int i_457_ = i_435_ - i_451_;
		int i_458_ = i_435_ + i_442_ - i_451_;
		int i_459_ = i_450_ + (i_435_ + i_442_);
		if (0 == i_440_)
		    class119.anInt1447 = 0;
		else if (1 == i_440_)
		    class119.anInt1447 = 255 - (i_438_ >>> 24);
		else
		    throw new IllegalArgumentException();
		method3461(false);
		class119.aBool1422
		    = (i_452_ < 0 || i_452_ > class119.anInt1448 || i_453_ < 0
		       || i_453_ > class119.anInt1448 || i_454_ < 0
		       || i_454_ > class119.anInt1448);
		class119.method2137(true, false, false, (float) i_456_,
				    (float) i_457_, (float) i_458_,
				    (float) i_452_, (float) i_453_,
				    (float) i_454_, 100.0F, 100.0F, 100.0F,
				    i_438_);
		class119.aBool1422
		    = (i_452_ < 0 || i_452_ > class119.anInt1448 || i_454_ < 0
		       || i_454_ > class119.anInt1448 || i_455_ < 0
		       || i_455_ > class119.anInt1448);
		class119.method2137(true, false, false, (float) i_456_,
				    (float) i_458_, (float) i_459_,
				    (float) i_452_, (float) i_454_,
				    (float) i_455_, 100.0F, 100.0F, 100.0F,
				    i_438_);
		method3461(true);
	    }
	}
    }
    
    public int method3308(int i, int i_460_, int i_461_, int i_462_,
			  int i_463_, int i_464_) {
	int i_465_ = 0;
	float f = ((float) i * aClass433_9346.aFloatArray4853[2]
		   + aClass433_9346.aFloatArray4853[14]
		   + aClass433_9346.aFloatArray4853[6] * (float) i_460_
		   + aClass433_9346.aFloatArray4853[10] * (float) i_461_);
	float f_466_
	    = ((float) i_464_ * aClass433_9346.aFloatArray4853[10]
	       + (aClass433_9346.aFloatArray4853[14]
		  + aClass433_9346.aFloatArray4853[2] * (float) i_462_
		  + aClass433_9346.aFloatArray4853[6] * (float) i_463_));
	float f_467_ = (aClass433_9346.aFloatArray4853[11] * (float) i_461_
			+ (aClass433_9346.aFloatArray4853[7] * (float) i_460_
			   + (aClass433_9346.aFloatArray4853[3] * (float) i
			      + aClass433_9346.aFloatArray4853[15])));
	float f_468_ = (aClass433_9346.aFloatArray4853[7] * (float) i_463_
			+ ((float) i_462_ * aClass433_9346.aFloatArray4853[3]
			   + aClass433_9346.aFloatArray4853[15])
			+ aClass433_9346.aFloatArray4853[11] * (float) i_464_);
	if (f < -f_467_ && f_466_ < -f_468_)
	    i_465_ |= 0x10;
	else if (f > f_467_ && f_466_ > f_468_)
	    i_465_ |= 0x20;
	float f_469_
	    = ((float) i_461_ * aClass433_9346.aFloatArray4853[8]
	       + ((float) i * aClass433_9346.aFloatArray4853[0]
		  + aClass433_9346.aFloatArray4853[12]
		  + aClass433_9346.aFloatArray4853[4] * (float) i_460_));
	float f_470_ = ((float) i_463_ * aClass433_9346.aFloatArray4853[4]
			+ ((float) i_462_ * aClass433_9346.aFloatArray4853[0]
			   + aClass433_9346.aFloatArray4853[12])
			+ (float) i_464_ * aClass433_9346.aFloatArray4853[8]);
	if (f_469_ < -f_467_ && f_470_ < -f_468_)
	    i_465_ |= 0x1;
	if (f_469_ > f_467_ && f_470_ > f_468_)
	    i_465_ |= 0x2;
	float f_471_ = (aClass433_9346.aFloatArray4853[13]
			+ aClass433_9346.aFloatArray4853[1] * (float) i
			+ aClass433_9346.aFloatArray4853[5] * (float) i_460_
			+ (float) i_461_ * aClass433_9346.aFloatArray4853[9]);
	float f_472_ = ((float) i_462_ * aClass433_9346.aFloatArray4853[1]
			+ aClass433_9346.aFloatArray4853[13]
			+ (float) i_463_ * aClass433_9346.aFloatArray4853[5]
			+ aClass433_9346.aFloatArray4853[9] * (float) i_464_);
	if (f_471_ < -f_467_ && f_472_ < -f_468_)
	    i_465_ |= 0x4;
	if (f_471_ > f_467_ && f_472_ > f_468_)
	    i_465_ |= 0x8;
	return i_465_;
    }
    
    boolean method3310(int i, int i_473_, int i_474_, int i_475_,
		       Class446 class446, Class432 class432) {
	Class433 class433 = method3518();
	class433.method6916(class446);
	class433.method6839(aClass433_9346);
	return class432.method6838(i, i_473_, i_474_, i_475_, class433,
				   aFloat9342, aFloat9368, aFloat9361,
				   aFloat9363);
    }
    
    public void method3311(Class446 class446, Class194 class194,
			   Class432 class432) {
	Class433 class433 = method3518();
	class433.method6916(class446);
	class433.method6839(aClass433_9346);
	class194.method3800(class432, aClass433_9362, class433, aFloat9342,
			    aFloat9368, aFloat9361, aFloat9363);
    }
    
    public void method3594(int[] is) {
	is[0] = -1301915793 * anInt9357;
	is[1] = 332831973 * anInt9364;
	is[2] = -798650927 * anInt9359;
	is[3] = 314738383 * anInt9360;
    }
    
    void method3327() {
	if (aBool9337) {
	    Class54.method1212(true, false, -2084133764);
	    aBool9337 = false;
	}
	aBool9339 = true;
    }
    
    public Class163 method3315(int i, int i_476_, boolean bool,
			       boolean bool_477_) {
	if (bool)
	    return new Class163_Sub1_Sub1(this, i, i_476_);
	return new Class163_Sub1_Sub3(this, i, i_476_);
    }
    
    public Class163 method3316(int[] is, int i, int i_478_, int i_479_,
			       int i_480_, boolean bool) {
	boolean bool_481_ = false;
	int i_482_ = i;
    while_152_:
	for (int i_483_ = 0; i_483_ < i_480_; i_483_++) {
	    for (int i_484_ = 0; i_484_ < i_479_; i_484_++) {
		int i_485_ = is[i_482_++] >>> 24;
		if (i_485_ != 0 && i_485_ != 255) {
		    bool_481_ = true;
		    break while_152_;
		}
	    }
	}
	if (bool_481_)
	    return new Class163_Sub1_Sub1(this, is, i, i_478_, i_479_, i_480_,
					  bool);
	return new Class163_Sub1_Sub3(this, is, i, i_478_, i_479_, i_480_,
				      bool);
    }
    
    void method3375(int i, int i_486_) throws Exception_Sub7 {
	aClass175_Sub2_2013.method15476(i, i_486_);
	if (null != anInterface25_1997)
	    anInterface25_1997.method33(-649911016);
    }
    
    public Class163 method3319(int i, int i_487_, int i_488_, int i_489_,
			       boolean bool) {
	if (null == anIntArray9338)
	    throw new IllegalStateException("");
	int[] is = new int[i_489_ * i_488_];
	int i_490_ = i + i_487_ * (356365251 * anInt9356);
	int i_491_ = 356365251 * anInt9356 - i_488_;
	for (int i_492_ = 0; i_492_ < i_489_; i_492_++) {
	    int i_493_ = i_488_ * i_492_;
	    for (int i_494_ = 0; i_494_ < i_488_; i_494_++)
		is[i_494_ + i_493_] = anIntArray9338[i_490_++];
	    i_490_ += i_491_;
	}
	if (bool)
	    return new Class163_Sub1_Sub1(this, is, i_488_, i_489_);
	return new Class163_Sub1_Sub3(this, is, i_488_, i_489_);
    }
    
    public Class145 method3643(int i, int i_495_, int[] is, int[] is_496_) {
	return new Class145_Sub2(i, i_495_, is, is_496_);
    }
    
    public void method3245() {
	/* empty */
    }
    
    public boolean method3611() {
	return false;
    }
    
    public boolean method3385() {
	return false;
    }
    
    public Class534_Sub21 method3345(int i, int i_497_, int i_498_, int i_499_,
				     int i_500_, float f) {
	return null;
    }
    
    public int method3330(int i, int i_501_) {
	i |= 0x20800;
	return i & i_501_ ^ i_501_;
    }
    
    public int method3331(int i, int i_502_) {
	return i | i_502_;
    }
    
    public Class151 method3332(int i, int i_503_, int[][] is, int[][] is_504_,
			       int i_505_, int i_506_, int i_507_) {
	return new Class151_Sub3(this, i_506_, i_507_, i, i_503_, is, is_504_,
				 i_505_);
    }
    
    int method15008(int i) {
	return aClass177_2012.method2931(i, (byte) 1).anInt2046 * 1264459495;
    }
    
    public void method3575() {
	/* empty */
    }
    
    public int method3344() {
	return 0;
    }
    
    public void method3550() {
	/* empty */
    }
    
    public void method3654(int i, Class534_Sub21[] class534_sub21s) {
	/* empty */
    }
    
    void method15009(int i) {
	aClass101Array9335[i].method1891(Thread.currentThread(), 177400239);
    }
    
    void method15010(int i) {
	anInt9367 = i * 258921977;
	aClass101Array9335 = new Class101[442227785 * anInt9367];
	for (int i_508_ = 0; i_508_ < anInt9367 * 442227785; i_508_++)
	    aClass101Array9335[i_508_] = new Class101(this);
    }
    
    Class101 method15011(Runnable runnable) {
	for (int i = 0; i < 442227785 * anInt9367; i++) {
	    if (runnable == aClass101Array9335[i].aRunnable1208)
		return aClass101Array9335[i];
	}
	return null;
    }
    
    public void method3334(Class174 class174) {
	method15012(anIntArray9338 != null, null != aFloatArray9341, false,
		    class174);
    }
    
    void method15012(boolean bool, boolean bool_509_, boolean bool_510_,
		     Class174 class174) {
	Class101 class101 = method15011(Thread.currentThread());
	for (Class536_Sub2_Sub1 class536_sub2_sub1
		 = ((Class536_Sub2_Sub1)
		    class174.aClass701_1837.method14211(65535));
	     class536_sub2_sub1 != null;
	     class536_sub2_sub1
		 = ((Class536_Sub2_Sub1)
		    class174.aClass701_1837.method14205(-325603590))) {
	    int i = class536_sub2_sub1.anInt11491 >> 12;
	    int i_511_ = class536_sub2_sub1.anInt11495 >> 12;
	    int i_512_ = class536_sub2_sub1.anInt11496 >> 12;
	    float f
		= (aClass433_9346.aFloatArray4853[14]
		   + ((float) i_511_ * aClass433_9346.aFloatArray4853[6]
		      + aClass433_9346.aFloatArray4853[2] * (float) i
		      + aClass433_9346.aFloatArray4853[10] * (float) i_512_));
	    float f_513_
		= (aClass433_9346.aFloatArray4853[15]
		   + (aClass433_9346.aFloatArray4853[3] * (float) i
		      + (float) i_511_ * aClass433_9346.aFloatArray4853[7]
		      + (float) i_512_ * aClass433_9346.aFloatArray4853[11]));
	    if (!(f < -f_513_)) {
		float f_514_ = aFloat9366 + aFloat9349 * f / f_513_;
		if (!(f > class101.aFloat1204)) {
		    float f_515_
			= ((float) i * aClass433_9346.aFloatArray4853[0]
			   + (float) i_511_ * aClass433_9346.aFloatArray4853[4]
			   + aClass433_9346.aFloatArray4853[8] * (float) i_512_
			   + aClass433_9346.aFloatArray4853[12]);
		    float f_516_
			= ((float) i_511_ * aClass433_9346.aFloatArray4853[5]
			   + aClass433_9346.aFloatArray4853[1] * (float) i
			   + (float) i_512_ * aClass433_9346.aFloatArray4853[9]
			   + aClass433_9346.aFloatArray4853[13]);
		    if (!(f_515_ < -f_513_) && !(f_515_ > f_513_)
			&& !(f_516_ < -f_513_) && !(f_516_ > f_513_)) {
			float f_517_
			    = (float) class536_sub2_sub1.anInt11497 / 4096.0F;
			float f_518_
			    = (f_515_
			       + aClass433_9362.aFloatArray4853[0] * f_517_);
			float f_519_
			    = (aClass433_9362.aFloatArray4853[3] * f_517_
			       + f_513_);
			float f_520_
			    = aFloat9361 * f_515_ / f_513_ + aFloat9342;
			float f_521_
			    = aFloat9368 + f_516_ * aFloat9363 / f_513_;
			float f_522_
			    = aFloat9342 + f_518_ * aFloat9361 / f_519_;
			method15040(bool, bool_509_, bool_510_,
				    class536_sub2_sub1, (int) f_520_,
				    (int) f_521_, f_514_,
				    (int) (f_522_ < f_520_ ? f_520_ - f_522_
					   : f_522_ - f_520_));
		    }
		}
	    }
	}
    }
    
    public int method3411() {
	return 0;
    }
    
    void method15013(boolean bool, boolean bool_523_, boolean bool_524_, int i,
		     int i_525_, float f, int i_526_, int i_527_, short i_528_,
		     int i_529_, int i_530_, int i_531_) {
	if (i_526_ != 0 && 0 != i_527_) {
	    if (i_528_ != -1) {
		Class186 class186
		    = aClass177_2012.method2931(i_528_, (byte) 1);
		if (!class186.aBool2072) {
		    if (i_528_ != anInt9372 * 768495671) {
			Class163 class163
			    = ((Class163)
			       aClass203_9350.method3871((long) i_528_));
			if (class163 == null) {
			    int[] is = method14994(i_528_);
			    if (is == null)
				return;
			    int i_532_ = class186.anInt2046 * 1264459495;
			    class163 = method3317(is, 0, i_532_, i_532_,
						  i_532_, (byte) -36);
			    aClass203_9350.method3893(class163, (long) i_528_);
			}
			anInt9372 = 1860330887 * i_528_;
			aClass163_9371 = class163;
		    }
		    ((Class163_Sub1) aClass163_9371).method14508
			(bool, bool_523_, bool_524_, i - i_526_,
			 i_525_ - i_527_, f, i_526_ << 1, i_527_ << 1, i_530_,
			 i_529_, i_531_, 1,
			 class186.aClass599_2064 != Class599.aClass599_7870);
		    return;
		}
	    }
	    method15015(bool_523_, i, i_525_, f, i_526_, i_529_, i_531_);
	}
    }
    
    public int method3475(int i, int i_533_, int i_534_, int i_535_,
			  int i_536_, int i_537_) {
	int i_538_ = 0;
	float f = ((float) i * aClass433_9346.aFloatArray4853[2]
		   + aClass433_9346.aFloatArray4853[14]
		   + aClass433_9346.aFloatArray4853[6] * (float) i_533_
		   + aClass433_9346.aFloatArray4853[10] * (float) i_534_);
	float f_539_
	    = ((float) i_537_ * aClass433_9346.aFloatArray4853[10]
	       + (aClass433_9346.aFloatArray4853[14]
		  + aClass433_9346.aFloatArray4853[2] * (float) i_535_
		  + aClass433_9346.aFloatArray4853[6] * (float) i_536_));
	float f_540_ = (aClass433_9346.aFloatArray4853[11] * (float) i_534_
			+ (aClass433_9346.aFloatArray4853[7] * (float) i_533_
			   + (aClass433_9346.aFloatArray4853[3] * (float) i
			      + aClass433_9346.aFloatArray4853[15])));
	float f_541_ = (aClass433_9346.aFloatArray4853[7] * (float) i_536_
			+ ((float) i_535_ * aClass433_9346.aFloatArray4853[3]
			   + aClass433_9346.aFloatArray4853[15])
			+ aClass433_9346.aFloatArray4853[11] * (float) i_537_);
	if (f < -f_540_ && f_539_ < -f_541_)
	    i_538_ |= 0x10;
	else if (f > f_540_ && f_539_ > f_541_)
	    i_538_ |= 0x20;
	float f_542_
	    = ((float) i_534_ * aClass433_9346.aFloatArray4853[8]
	       + ((float) i * aClass433_9346.aFloatArray4853[0]
		  + aClass433_9346.aFloatArray4853[12]
		  + aClass433_9346.aFloatArray4853[4] * (float) i_533_));
	float f_543_ = ((float) i_536_ * aClass433_9346.aFloatArray4853[4]
			+ ((float) i_535_ * aClass433_9346.aFloatArray4853[0]
			   + aClass433_9346.aFloatArray4853[12])
			+ (float) i_537_ * aClass433_9346.aFloatArray4853[8]);
	if (f_542_ < -f_540_ && f_543_ < -f_541_)
	    i_538_ |= 0x1;
	if (f_542_ > f_540_ && f_543_ > f_541_)
	    i_538_ |= 0x2;
	float f_544_ = (aClass433_9346.aFloatArray4853[13]
			+ aClass433_9346.aFloatArray4853[1] * (float) i
			+ aClass433_9346.aFloatArray4853[5] * (float) i_533_
			+ (float) i_534_ * aClass433_9346.aFloatArray4853[9]);
	float f_545_ = ((float) i_535_ * aClass433_9346.aFloatArray4853[1]
			+ aClass433_9346.aFloatArray4853[13]
			+ (float) i_536_ * aClass433_9346.aFloatArray4853[5]
			+ aClass433_9346.aFloatArray4853[9] * (float) i_537_);
	if (f_544_ < -f_540_ && f_545_ < -f_541_)
	    i_538_ |= 0x4;
	if (f_544_ > f_540_ && f_545_ > f_541_)
	    i_538_ |= 0x8;
	return i_538_;
    }
    
    public void method3335(Class446 class446) {
	aClass446_9354 = class446;
	method15050();
    }
    
    public boolean method3390() {
	return false;
    }
    
    public void method3338(Class433 class433) {
	aClass433_9362.method6842(class433);
	method15050();
    }
    
    public Class433 method3339() {
	return new Class433(aClass433_9362);
    }
    
    public void method3489(float f) {
	anInt9351 = (int) (f * 65535.0F) * -178886367;
    }
    
    public void method3415() {
	/* empty */
    }
    
    public void method3342(int i) {
	/* empty */
    }
    
    public void method3463(int i, int i_546_, int i_547_) {
	for (int i_548_ = 0; i_548_ < aClass101Array9335.length; i_548_++) {
	    Class101 class101 = aClass101Array9335[i_548_];
	    class101.anInt1206 = (i & 0xffffff) * -1382291633;
	    int i_549_ = class101.anInt1206 * 1046269871 >>> 16 & 0xff;
	    if (i_549_ < 2)
		i_549_ = 2;
	    int i_550_ = class101.anInt1206 * 1046269871 >> 8 & 0xff;
	    if (i_550_ < 2)
		i_550_ = 2;
	    int i_551_ = 1046269871 * class101.anInt1206 & 0xff;
	    if (i_551_ < 2)
		i_551_ = 2;
	    class101.anInt1206
		= (i_549_ << 16 | i_550_ << 8 | i_551_) * -1382291633;
	    if (i_546_ < 0)
		class101.aBool1203 = false;
	    else
		class101.aBool1203 = true;
	}
    }
    
    Class185_Sub2(Canvas canvas, Class177 class177, Interface25 interface25,
		  Interface45 interface45, Interface48 interface48,
		  Interface46 interface46, int i, int i_552_) {
	this(class177, interface25, interface45, interface48, interface46);
	try {
	    method3243(canvas, i, i_552_, (short) 18102);
	    method3258(canvas, -443087332);
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    method3236(-568376843);
	    throw new RuntimeException("");
	}
    }
    
    public Class165 method3485(int i) {
	return null;
    }
    
    public Class165 method3451(Class165 class165, Class165 class165_553_,
			       float f, Class165 class165_554_) {
	return null;
    }
    
    public void method3349(Class165 class165) {
	/* empty */
    }
    
    public void method3350(int i, int i_555_, int i_556_, int i_557_) {
	/* empty */
    }
    
    public void method3351(int i, int i_558_) {
	/* empty */
    }
    
    public boolean method3352() {
	return false;
    }
    
    public void method3542() {
	/* empty */
    }
    
    public void method3590(float f, float f_559_, float f_560_, float f_561_,
			   float f_562_) {
	/* empty */
    }
    
    public Class534_Sub2 method3481(int i) {
	return null;
    }
    
    public boolean method3304() {
	return false;
    }
    
    public void method3357(Class170 class170, float f, Class170 class170_563_,
			   float f_564_, Class170 class170_565_,
			   float f_566_) {
	/* empty */
    }
    
    public String method3250() {
	return "";
    }
    
    public void method3359() {
	/* empty */
    }
    
    public boolean method3409() {
	return false;
    }
    
    void method3362(float f, float f_567_, float f_568_, float f_569_,
		    float f_570_, float f_571_) {
	/* empty */
    }
    
    public void method3363(int i, Class166 class166) {
	for (int i_572_ = 0; i_572_ < aClass101Array9335.length; i_572_++) {
	    aClass101Array9335[i_572_].anInt1207
		= aClass101Array9335[i_572_].anInt1206 * 1410985889;
	    aClass101Array9335[i_572_].anInt1209 = i * 995019623;
	    aClass101Array9335[i_572_].anInt1206
		= class166.anInt1763 * 1215958923;
	    aClass101Array9335[i_572_].anInt1210
		= class166.anInt1762 * -761479311;
	    aClass101Array9335[i_572_].aBool1245 = true;
	}
    }
    
    public void method3364(int i, Class166 class166) {
	Class101 class101 = method15011(Thread.currentThread());
	class101.anInt1209 = 995019623 * i;
	class101.anInt1206 = class166.anInt1763 * 1215958923;
	class101.anInt1210 = class166.anInt1762 * -761479311;
    }
    
    public void method3506(Class446 class446) {
	aClass446_9354 = class446;
	method15050();
    }
    
    public void method3299(int i, int i_573_, float f, int i_574_, int i_575_,
			   float f_576_, int i_577_, int i_578_, float f_579_,
			   int i_580_, int i_581_, int i_582_, int i_583_) {
	boolean bool = null != anIntArray9338;
	boolean bool_584_ = null != aFloatArray9341;
	if (bool || bool_584_) {
	    Class101 class101 = method15011(Thread.currentThread());
	    Class119 class119 = class101.aClass119_1233;
	    class119.aBool1423 = false;
	    i -= 1709859847 * anInt9365;
	    i_574_ -= anInt9365 * 1709859847;
	    i_577_ -= anInt9365 * 1709859847;
	    i_573_ -= anInt9344 * 9823353;
	    i_575_ -= 9823353 * anInt9344;
	    i_578_ -= anInt9344 * 9823353;
	    class119.aBool1422 = (i < 0 || i > class119.anInt1448 || i_574_ < 0
				  || i_574_ > class119.anInt1448 || i_577_ < 0
				  || i_577_ > class119.anInt1448);
	    int i_585_ = i_580_ >>> 24;
	    if (i_583_ == 0 || 1 == i_583_ && i_585_ == 255) {
		class119.anInt1447 = 0;
		class119.aBool1424 = false;
		class119.method2141(bool, bool_584_, false, (float) i_573_,
				    (float) i_575_, (float) i_578_, (float) i,
				    (float) i_574_, (float) i_577_, f, f_576_,
				    f_579_, i_580_, i_581_, i_582_);
	    } else if (i_583_ == 1) {
		class119.anInt1447 = 255 - i_585_;
		class119.aBool1424 = false;
		class119.method2141(bool, bool_584_, false, (float) i_573_,
				    (float) i_575_, (float) i_578_, (float) i,
				    (float) i_574_, (float) i_577_, f, f_576_,
				    f_579_, i_580_, i_581_, i_582_);
	    } else if (i_583_ == 2) {
		class119.anInt1447 = 128;
		class119.aBool1424 = true;
		class119.method2141(bool, bool_584_, false, (float) i_573_,
				    (float) i_575_, (float) i_578_, (float) i,
				    (float) i_574_, (float) i_577_, f, f_576_,
				    f_579_, i_580_, i_581_, i_582_);
	    } else
		throw new IllegalArgumentException();
	    class119.aBool1423 = true;
	}
    }
    
    public void method3367(float f, float f_586_, float f_587_, float[] fs) {
	float f_588_ = (f * aClass433_9346.aFloatArray4853[3]
			+ aClass433_9346.aFloatArray4853[15]
			+ f_586_ * aClass433_9346.aFloatArray4853[7]
			+ f_587_ * aClass433_9346.aFloatArray4853[11]);
	float f_589_ = (f_587_ * aClass433_9346.aFloatArray4853[8]
			+ (f * aClass433_9346.aFloatArray4853[0]
			   + aClass433_9346.aFloatArray4853[12]
			   + aClass433_9346.aFloatArray4853[4] * f_586_));
	float f_590_ = (aClass433_9346.aFloatArray4853[5] * f_586_
			+ (f * aClass433_9346.aFloatArray4853[1]
			   + aClass433_9346.aFloatArray4853[13])
			+ f_587_ * aClass433_9346.aFloatArray4853[9]);
	float f_591_ = (aClass433_9353.aFloatArray4853[10] * f_587_
			+ (f_586_ * aClass433_9353.aFloatArray4853[6]
			   + (aClass433_9353.aFloatArray4853[2] * f
			      + aClass433_9353.aFloatArray4853[14])));
	fs[0] = f_589_ * aFloat9361 / f_588_ + aFloat9342;
	fs[1] = aFloat9363 * f_590_ / f_588_ + aFloat9368;
	fs[2] = f_591_;
    }
    
    public void method3366(float f, float f_592_, float f_593_, float[] fs) {
	float f_594_ = (aClass433_9346.aFloatArray4853[14]
			+ aClass433_9346.aFloatArray4853[2] * f
			+ aClass433_9346.aFloatArray4853[6] * f_592_
			+ aClass433_9346.aFloatArray4853[10] * f_593_);
	float f_595_ = (f_592_ * aClass433_9346.aFloatArray4853[7]
			+ (aClass433_9346.aFloatArray4853[15]
			   + aClass433_9346.aFloatArray4853[3] * f)
			+ f_593_ * aClass433_9346.aFloatArray4853[11]);
	if (f_594_ < -f_595_ || f_594_ > f_595_) {
	    float[] fs_596_ = fs;
	    float[] fs_597_ = fs;
	    fs[2] = Float.NaN;
	    fs_597_[1] = Float.NaN;
	    fs_596_[0] = Float.NaN;
	} else {
	    float f_598_ = (aClass433_9346.aFloatArray4853[8] * f_593_
			    + (f_592_ * aClass433_9346.aFloatArray4853[4]
			       + (aClass433_9346.aFloatArray4853[12]
				  + aClass433_9346.aFloatArray4853[0] * f)));
	    if (f_598_ < -f_595_ || f_598_ > f_595_) {
		float[] fs_599_ = fs;
		float[] fs_600_ = fs;
		fs[2] = Float.NaN;
		fs_600_[1] = Float.NaN;
		fs_599_[0] = Float.NaN;
	    } else {
		float f_601_ = (aClass433_9346.aFloatArray4853[9] * f_593_
				+ (aClass433_9346.aFloatArray4853[5] * f_592_
				   + (aClass433_9346.aFloatArray4853[1] * f
				      + aClass433_9346.aFloatArray4853[13])));
		if (f_601_ < -f_595_ || f_601_ > f_595_) {
		    float[] fs_602_ = fs;
		    float[] fs_603_ = fs;
		    fs[2] = Float.NaN;
		    fs_603_[1] = Float.NaN;
		    fs_602_[0] = Float.NaN;
		} else {
		    float f_604_
			= (aClass433_9353.aFloatArray4853[10] * f_593_
			   + (f_592_ * aClass433_9353.aFloatArray4853[6]
			      + (aClass433_9353.aFloatArray4853[14]
				 + aClass433_9353.aFloatArray4853[2] * f)));
		    fs[0] = f_598_ * aFloat9361 / f_595_ + aFloat9342;
		    fs[1] = aFloat9368 + aFloat9363 * f_601_ / f_595_;
		    fs[2] = f_604_;
		}
	    }
	}
    }
    
    public Class175_Sub1 method3263() {
	return new Class175_Sub1_Sub3(this);
    }
    
    Interface22 method15014(int i, int i_605_) {
	return new Class115(i, i_605_);
    }
    
    public Interface22 method3678(int i, int i_606_, Class181 class181,
				  Class173 class173, int i_607_) {
	return method15014(i, i_606_);
    }
    
    public Interface21 method3265(int i, int i_608_) {
	return new Class130(i, i_608_);
    }
    
    public void method3440(int i, int i_609_, int i_610_, int i_611_) {
	anInt9357 = i * -2028935281;
	anInt9364 = i_609_ * -1799241491;
	anInt9359 = -1869485263 * i_610_;
	anInt9360 = i_611_ * -1888305105;
	method15005();
    }
    
    public void method3529() {
	for (int i = 0; i < aClass101Array9335.length; i++) {
	    aClass101Array9335[i].anInt1206
		= 323990625 * aClass101Array9335[i].anInt1207;
	    aClass101Array9335[i].aBool1245 = false;
	}
    }
    
    public Class534_Sub2 method3312(int i) {
	return null;
    }
    
    public void method3447(int i, int i_612_, int i_613_, int i_614_) {
	if (i < 0)
	    i = 0;
	if (i_612_ < 0)
	    i_612_ = 0;
	if (i_613_ > anInt9356 * 356365251)
	    i_613_ = 356365251 * anInt9356;
	if (i_614_ > anInt9340 * 446066493)
	    i_614_ = anInt9340 * 446066493;
	anInt9365 = i * -1685075529;
	anInt9343 = -315695909 * i_613_;
	anInt9344 = i_612_ * 1960003017;
	anInt9345 = -217091821 * i_614_;
	method15005();
    }
    
    void method3376(int i, int i_615_) throws Exception_Sub7 {
	aClass175_Sub2_2013.method15476(i, i_615_);
	if (null != anInterface25_1997)
	    anInterface25_1997.method33(36682866);
    }
    
    public void method3377() {
	/* empty */
    }
    
    public void method3322(int i) {
	int i_616_ = i - 1255617655 * anInt9336;
	for (Class534_Sub14 class534_sub14
		 = (Class534_Sub14) aClass203_9369.method3892(-2135460169);
	     class534_sub14 != null;
	     class534_sub14
		 = (Class534_Sub14) aClass203_9369.method3883((byte) -24)) {
	    if (class534_sub14.aBool10463) {
		class534_sub14.anInt10462 += i_616_;
		int i_617_ = class534_sub14.anInt10462 / 50;
		if (i_617_ > 0) {
		    Class186 class186
			= aClass177_2012.method2931(class534_sub14.anInt10460,
						    (byte) 1);
		    float f = (float) (1264459495 * class186.anInt2046);
		    class534_sub14.method16149
			((int) ((float) class186.aByte2047
				* ((float) i_616_ / 1000.0F) / 64.0F * f),
			 (int) (f * ((float) i_616_ / 1000.0F
				     * (float) class186.aByte2048 / 64.0F)));
		    class534_sub14.anInt10462 -= 50 * i_617_;
		}
		class534_sub14.aBool10463 = false;
	    }
	}
	anInt9336 = -382802617 * i;
	aClass203_9350.method3876(5, (byte) 0);
	aClass203_9369.method3876(5, (byte) 0);
    }
    
    void method15015(boolean bool, int i, int i_618_, float f, int i_619_,
		     int i_620_, int i_621_) {
	if (anIntArray9338 != null) {
	    if (i_619_ < 0)
		i_619_ = -i_619_;
	    int i_622_ = i_618_ - i_619_;
	    if (i_622_ < anInt9344 * 9823353)
		i_622_ = 9823353 * anInt9344;
	    int i_623_ = 1 + (i_618_ + i_619_);
	    if (i_623_ > anInt9345 * 639238427)
		i_623_ = 639238427 * anInt9345;
	    int i_624_ = i_622_;
	    int i_625_ = i_619_ * i_619_;
	    int i_626_ = 0;
	    int i_627_ = i_618_ - i_624_;
	    int i_628_ = i_627_ * i_627_;
	    int i_629_ = i_628_ - i_627_;
	    if (i_618_ > i_623_)
		i_618_ = i_623_;
	    int i_630_ = i_620_ >>> 24;
	    if (0 == i_621_ || 1 == i_621_ && i_630_ == 255) {
		while (i_624_ < i_618_) {
		    for (/**/; i_629_ <= i_625_ || i_628_ <= i_625_;
			 i_629_ += i_626_++ + i_626_)
			i_628_ += i_626_ + i_626_;
		    int i_631_ = i - i_626_ + 1;
		    if (i_631_ < anInt9365 * 1709859847)
			i_631_ = anInt9365 * 1709859847;
		    int i_632_ = i + i_626_;
		    if (i_632_ > anInt9343 * -1807368365)
			i_632_ = -1807368365 * anInt9343;
		    int i_633_ = i_624_ * (356365251 * anInt9356) + i_631_;
		    for (int i_634_ = i_631_; i_634_ < i_632_; i_634_++) {
			if (!bool || f < aFloatArray9341[i_633_])
			    anIntArray9338[i_633_] = i_620_;
			i_633_++;
		    }
		    i_624_++;
		    i_628_ -= i_627_-- + i_627_;
		    i_629_ -= i_627_ + i_627_;
		}
		i_626_ = i_619_;
		i_627_ = i_624_ - i_618_;
		i_629_ = i_625_ + i_627_ * i_627_;
		i_628_ = i_629_ - i_626_;
		i_629_ -= i_627_;
		while (i_624_ < i_623_) {
		    for (/**/; i_629_ > i_625_ && i_628_ > i_625_;
			 i_628_ -= i_626_ + i_626_)
			i_629_ -= i_626_-- + i_626_;
		    int i_635_ = i - i_626_;
		    if (i_635_ < 1709859847 * anInt9365)
			i_635_ = 1709859847 * anInt9365;
		    int i_636_ = i_626_ + i;
		    if (i_636_ > -1807368365 * anInt9343 - 1)
			i_636_ = -1807368365 * anInt9343 - 1;
		    int i_637_ = i_624_ * (356365251 * anInt9356) + i_635_;
		    for (int i_638_ = i_635_; i_638_ <= i_636_; i_638_++) {
			if (!bool || f < aFloatArray9341[i_637_])
			    anIntArray9338[i_637_] = i_620_;
			i_637_++;
		    }
		    i_624_++;
		    i_629_ += i_627_ + i_627_;
		    i_628_ += i_627_++ + i_627_;
		}
	    } else if (i_621_ == 1) {
		i_620_ = (i_630_ << 24) + ((i_630_ * (i_620_ & 0xff00) >> 8
					    & 0xff00)
					   + (i_630_ * (i_620_ & 0xff00ff) >> 8
					      & 0xff00ff));
		int i_639_ = 256 - i_630_;
		while (i_624_ < i_618_) {
		    for (/**/; i_629_ <= i_625_ || i_628_ <= i_625_;
			 i_629_ += i_626_++ + i_626_)
			i_628_ += i_626_ + i_626_;
		    int i_640_ = 1 + (i - i_626_);
		    if (i_640_ < anInt9365 * 1709859847)
			i_640_ = anInt9365 * 1709859847;
		    int i_641_ = i + i_626_;
		    if (i_641_ > -1807368365 * anInt9343)
			i_641_ = anInt9343 * -1807368365;
		    int i_642_ = 356365251 * anInt9356 * i_624_ + i_640_;
		    for (int i_643_ = i_640_; i_643_ < i_641_; i_643_++) {
			if (!bool || f < aFloatArray9341[i_642_]) {
			    int i_644_ = anIntArray9338[i_642_];
			    i_644_
				= ((i_639_ * (i_644_ & 0xff00) >> 8 & 0xff00)
				   + (i_639_ * (i_644_ & 0xff00ff) >> 8
				      & 0xff00ff));
			    anIntArray9338[i_642_] = i_620_ + i_644_;
			}
			i_642_++;
		    }
		    i_624_++;
		    i_628_ -= i_627_-- + i_627_;
		    i_629_ -= i_627_ + i_627_;
		}
		i_626_ = i_619_;
		i_627_ = -i_627_;
		i_629_ = i_627_ * i_627_ + i_625_;
		i_628_ = i_629_ - i_626_;
		i_629_ -= i_627_;
		while (i_624_ < i_623_) {
		    for (/**/; i_629_ > i_625_ && i_628_ > i_625_;
			 i_628_ -= i_626_ + i_626_)
			i_629_ -= i_626_-- + i_626_;
		    int i_645_ = i - i_626_;
		    if (i_645_ < anInt9365 * 1709859847)
			i_645_ = anInt9365 * 1709859847;
		    int i_646_ = i_626_ + i;
		    if (i_646_ > anInt9343 * -1807368365 - 1)
			i_646_ = anInt9343 * -1807368365 - 1;
		    int i_647_ = i_645_ + anInt9356 * 356365251 * i_624_;
		    for (int i_648_ = i_645_; i_648_ <= i_646_; i_648_++) {
			if (!bool || f < aFloatArray9341[i_647_]) {
			    int i_649_ = anIntArray9338[i_647_];
			    i_649_ = (((i_649_ & 0xff00ff) * i_639_ >> 8
				       & 0xff00ff)
				      + ((i_649_ & 0xff00) * i_639_ >> 8
					 & 0xff00));
			    anIntArray9338[i_647_] = i_649_ + i_620_;
			}
			i_647_++;
		    }
		    i_624_++;
		    i_629_ += i_627_ + i_627_;
		    i_628_ += i_627_++ + i_627_;
		}
	    } else if (i_621_ == 2) {
		while (i_624_ < i_618_) {
		    for (/**/; i_629_ <= i_625_ || i_628_ <= i_625_;
			 i_629_ += i_626_++ + i_626_)
			i_628_ += i_626_ + i_626_;
		    int i_650_ = 1 + (i - i_626_);
		    if (i_650_ < 1709859847 * anInt9365)
			i_650_ = anInt9365 * 1709859847;
		    int i_651_ = i_626_ + i;
		    if (i_651_ > anInt9343 * -1807368365)
			i_651_ = -1807368365 * anInt9343;
		    int i_652_ = i_650_ + 356365251 * anInt9356 * i_624_;
		    for (int i_653_ = i_650_; i_653_ < i_651_; i_653_++) {
			if (!bool || f < aFloatArray9341[i_652_]) {
			    int i_654_ = anIntArray9338[i_652_];
			    int i_655_ = i_620_ + i_654_;
			    int i_656_
				= (i_654_ & 0xff00ff) + (i_620_ & 0xff00ff);
			    i_654_ = (i_656_ & 0x1000100) + (i_655_ - i_656_
							     & 0x10000);
			    anIntArray9338[i_652_]
				= i_655_ - i_654_ | i_654_ - (i_654_ >>> 8);
			}
			i_652_++;
		    }
		    i_624_++;
		    i_628_ -= i_627_-- + i_627_;
		    i_629_ -= i_627_ + i_627_;
		}
		i_626_ = i_619_;
		i_627_ = -i_627_;
		i_629_ = i_625_ + i_627_ * i_627_;
		i_628_ = i_629_ - i_626_;
		i_629_ -= i_627_;
		while (i_624_ < i_623_) {
		    for (/**/; i_629_ > i_625_ && i_628_ > i_625_;
			 i_628_ -= i_626_ + i_626_)
			i_629_ -= i_626_-- + i_626_;
		    int i_657_ = i - i_626_;
		    if (i_657_ < 1709859847 * anInt9365)
			i_657_ = anInt9365 * 1709859847;
		    int i_658_ = i_626_ + i;
		    if (i_658_ > -1807368365 * anInt9343 - 1)
			i_658_ = anInt9343 * -1807368365 - 1;
		    int i_659_ = i_624_ * (356365251 * anInt9356) + i_657_;
		    for (int i_660_ = i_657_; i_660_ <= i_658_; i_660_++) {
			if (!bool || f < aFloatArray9341[i_659_]) {
			    int i_661_ = anIntArray9338[i_659_];
			    int i_662_ = i_661_ + i_620_;
			    int i_663_
				= (i_620_ & 0xff00ff) + (i_661_ & 0xff00ff);
			    i_661_
				= (i_662_ - i_663_ & 0x10000) + (i_663_
								 & 0x1000100);
			    anIntArray9338[i_659_]
				= i_662_ - i_661_ | i_661_ - (i_661_ >>> 8);
			}
			i_659_++;
		    }
		    i_624_++;
		    i_629_ += i_627_ + i_627_;
		    i_628_ += i_627_++ + i_627_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method3389(int i) {
	int i_664_ = i - 1255617655 * anInt9336;
	for (Class534_Sub14 class534_sub14
		 = (Class534_Sub14) aClass203_9369.method3892(-2094258456);
	     class534_sub14 != null;
	     class534_sub14
		 = (Class534_Sub14) aClass203_9369.method3883((byte) -31)) {
	    if (class534_sub14.aBool10463) {
		class534_sub14.anInt10462 += i_664_;
		int i_665_ = class534_sub14.anInt10462 / 50;
		if (i_665_ > 0) {
		    Class186 class186
			= aClass177_2012.method2931(class534_sub14.anInt10460,
						    (byte) 1);
		    float f = (float) (1264459495 * class186.anInt2046);
		    class534_sub14.method16149
			((int) ((float) class186.aByte2047
				* ((float) i_664_ / 1000.0F) / 64.0F * f),
			 (int) (f * ((float) i_664_ / 1000.0F
				     * (float) class186.aByte2048 / 64.0F)));
		    class534_sub14.anInt10462 -= 50 * i_665_;
		}
		class534_sub14.aBool10463 = false;
	    }
	}
	anInt9336 = -382802617 * i;
	aClass203_9350.method3876(5, (byte) 0);
	aClass203_9369.method3876(5, (byte) 0);
    }
    
    public void method3381(int i) {
	int i_666_ = i - 1255617655 * anInt9336;
	for (Class534_Sub14 class534_sub14
		 = (Class534_Sub14) aClass203_9369.method3892(-2103123210);
	     class534_sub14 != null;
	     class534_sub14
		 = (Class534_Sub14) aClass203_9369.method3883((byte) -5)) {
	    if (class534_sub14.aBool10463) {
		class534_sub14.anInt10462 += i_666_;
		int i_667_ = class534_sub14.anInt10462 / 50;
		if (i_667_ > 0) {
		    Class186 class186
			= aClass177_2012.method2931(class534_sub14.anInt10460,
						    (byte) 1);
		    float f = (float) (1264459495 * class186.anInt2046);
		    class534_sub14.method16149
			((int) ((float) class186.aByte2047
				* ((float) i_666_ / 1000.0F) / 64.0F * f),
			 (int) (f * ((float) i_666_ / 1000.0F
				     * (float) class186.aByte2048 / 64.0F)));
		    class534_sub14.anInt10462 -= 50 * i_667_;
		}
		class534_sub14.aBool10463 = false;
	    }
	}
	anInt9336 = -382802617 * i;
	aClass203_9350.method3876(5, (byte) 0);
	aClass203_9369.method3876(5, (byte) 0);
    }
    
    public boolean method3541() {
	return false;
    }
    
    public int method3323() {
	return 0;
    }
    
    public int method3671() {
	return 0;
    }
    
    boolean method15016() {
	return aBool9339;
    }
    
    boolean method15017() {
	return aBool9339;
    }
    
    boolean method15018() {
	return aBool9339;
    }
    
    int[] method15019(int i) {
	Class534_Sub14 class534_sub14;
	synchronized (aClass203_9369) {
	    class534_sub14
		= ((Class534_Sub14)
		   aClass203_9369.method3871((long) (i & 0xffff)
					     | ~0x7fffffffffffffffL));
	    if (null == class534_sub14) {
		Class186 class186 = aClass177_2012.method2931(i, (byte) 1);
		int i_668_ = class186.anInt2046 * 1264459495;
		if (!anInterface25_1997.method155(Class598.aClass598_7865, i,
						  Class613.aClass613_8023,
						  0.7F, i_668_, i_668_, true,
						  -618218007)) {
		    int[] is = null;
		    return is;
		}
		int[] is;
		if (Class599.aClass599_7869 != class186.aClass599_2064)
		    is = anInterface25_1997.method150(Class598.aClass598_7865,
						      i, 0.7F, i_668_, i_668_,
						      true, -975014764);
		else
		    is = anInterface25_1997.method149(Class598.aClass598_7865,
						      i, 0.7F, i_668_, i_668_,
						      true, -510503725);
		class534_sub14
		    = new Class534_Sub14(i, i_668_, is,
					 (class186.aClass599_2064
					  != Class599.aClass599_7868));
		aClass203_9369.method3881(class534_sub14,
					  ((long) (i & 0xffff)
					   | ~0x7fffffffffffffffL),
					  i_668_ * i_668_, -242286978);
	    }
	}
	class534_sub14.aBool10463 = true;
	return class534_sub14.method16144();
    }
    
    public Class433 method3591() {
	Class101 class101 = method15011(Thread.currentThread());
	return class101.aClass433_1212;
    }
    
    int[] method15020(int i) {
	Class534_Sub14 class534_sub14;
	synchronized (aClass203_9369) {
	    class534_sub14
		= ((Class534_Sub14)
		   aClass203_9369.method3871((long) (i & 0xffff)
					     | ~0x7fffffffffffffffL));
	    if (null == class534_sub14) {
		Class186 class186 = aClass177_2012.method2931(i, (byte) 1);
		int i_669_ = class186.anInt2046 * 1264459495;
		if (!anInterface25_1997.method155(Class598.aClass598_7865, i,
						  Class613.aClass613_8023,
						  0.7F, i_669_, i_669_, true,
						  -618218007)) {
		    int[] is = null;
		    return is;
		}
		int[] is;
		if (Class599.aClass599_7869 != class186.aClass599_2064)
		    is = anInterface25_1997.method150(Class598.aClass598_7865,
						      i, 0.7F, i_669_, i_669_,
						      true, -995740159);
		else
		    is = anInterface25_1997.method149(Class598.aClass598_7865,
						      i, 0.7F, i_669_, i_669_,
						      true, -1733242776);
		class534_sub14
		    = new Class534_Sub14(i, i_669_, is,
					 (class186.aClass599_2064
					  != Class599.aClass599_7868));
		aClass203_9369.method3881(class534_sub14,
					  ((long) (i & 0xffff)
					   | ~0x7fffffffffffffffL),
					  i_669_ * i_669_, -1064158642);
	    }
	}
	class534_sub14.aBool10463 = true;
	return class534_sub14.method16144();
    }
    
    public void method3516(float f) {
	anInt9351 = (int) (f * 65535.0F) * -178886367;
    }
    
    int method15021(int i) {
	return aClass177_2012.method2931(i, (byte) 1).anInt2046 * 1264459495;
    }
    
    Class599 method15022(int i) {
	return aClass177_2012.method2931(i, (byte) 1).aClass599_2064;
    }
    
    byte method15023(int i) {
	return aClass177_2012.method2931(i, (byte) 1).aByte2051;
    }
    
    public Class183 method3329(Class187 class187, int i, int i_670_,
			       int i_671_, int i_672_) {
	return new Class183_Sub2(this, class187, i, i_671_, i_672_, i_670_);
    }
    
    void method15024() {
	aClass433_9353.method6916(aClass446_9354);
	aClass433_9346.method6842(aClass433_9353);
	aClass433_9346.method6839(aClass433_9362);
	aClass433_9346.method6862(aFloatArrayArray9355[0]);
	aClass433_9346.method6858(aFloatArrayArray9355[1]);
	aClass433_9346.method6861(aFloatArrayArray9355[2]);
	aClass433_9346.method6949(aFloatArrayArray9355[3]);
	aClass433_9346.method6879(aFloatArrayArray9355[4]);
	aClass433_9346.method6945(aFloatArrayArray9355[5]);
	float f = aClass433_9362.method6907();
	float f_673_ = (aClass433_9362.aFloatArray4853[14]
			+ aClass433_9362.aFloatArray4853[10] * (f - 255.0F));
	float f_674_ = (aClass433_9362.aFloatArray4853[14]
			+ aClass433_9362.aFloatArray4853[10] * f);
	float f_675_ = f_674_ - f_673_;
	for (int i = 0; i < 442227785 * anInt9367; i++) {
	    Class101 class101 = aClass101Array9335[i];
	    class101.aFloat1204 = f_673_;
	    class101.aFloat1205 = f_675_;
	}
    }
    
    boolean method15025(int i) {
	Class186 class186 = aClass177_2012.method2931(i, (byte) 1);
	return 0 != class186.aByte2073 || 0 != class186.aByte2053;
    }
    
    public Interface22 method3571(int i, int i_676_, Class181 class181,
				  Class173 class173, int i_677_) {
	return method15014(i, i_676_);
    }
    
    public boolean method3386() {
	return false;
    }
    
    public boolean method3592() {
	return false;
    }
    
    public boolean method3388() {
	return false;
    }
    
    public boolean method3474() {
	return false;
    }
    
    public Class176 method3670() {
	return new Class176(0, "Pure Java", 1, "CPU", 0L, false);
    }
    
    public boolean method3391() {
	return false;
    }
    
    public boolean method3392() {
	return false;
    }
    
    public boolean method3393() {
	return false;
    }
    
    public boolean method3394() {
	return false;
    }
    
    public void method3320(int i, int i_678_, int i_679_, int i_680_) {
	/* empty */
    }
    
    public boolean method3326() {
	return false;
    }
    
    public boolean method3397() {
	return false;
    }
    
    public boolean method3398() {
	return false;
    }
    
    public boolean method3608() {
	return true;
    }
    
    public Class176 method3232() {
	return new Class176(0, "Pure Java", 1, "CPU", 0L, false);
    }
    
    public String method3401() {
	return "";
    }
    
    int[] method15026(int i) {
	Class534_Sub14 class534_sub14;
	synchronized (aClass203_9369) {
	    class534_sub14
		= ((Class534_Sub14)
		   aClass203_9369.method3871((long) (i & 0xffff)
					     | ~0x7fffffffffffffffL));
	    if (null == class534_sub14) {
		Class186 class186 = aClass177_2012.method2931(i, (byte) 1);
		int i_681_ = class186.anInt2046 * 1264459495;
		if (!anInterface25_1997.method155(Class598.aClass598_7865, i,
						  Class613.aClass613_8023,
						  0.7F, i_681_, i_681_, true,
						  -618218007)) {
		    int[] is = null;
		    return is;
		}
		int[] is;
		if (Class599.aClass599_7869 != class186.aClass599_2064)
		    is = anInterface25_1997.method150(Class598.aClass598_7865,
						      i, 0.7F, i_681_, i_681_,
						      true, 706740781);
		else
		    is = anInterface25_1997.method149(Class598.aClass598_7865,
						      i, 0.7F, i_681_, i_681_,
						      true, 845817492);
		class534_sub14
		    = new Class534_Sub14(i, i_681_, is,
					 (class186.aClass599_2064
					  != Class599.aClass599_7868));
		aClass203_9369.method3881(class534_sub14,
					  ((long) (i & 0xffff)
					   | ~0x7fffffffffffffffL),
					  i_681_ * i_681_, -39738002);
	    }
	}
	class534_sub14.aBool10463 = true;
	return class534_sub14.method16144();
    }
    
    public int[] method3663() {
	return null;
    }
    
    public int[] method3484() {
	return null;
    }
    
    public int[] method3405() {
	return null;
    }
    
    public void method3406(boolean bool) {
	/* empty */
    }
    
    public Class433 method3512() {
	return new Class433(aClass433_9362);
    }
    
    Class175_Sub2 method3408(Canvas canvas, int i, int i_682_) {
	return Class594.method9908(this, canvas, i, i_682_, (short) -12716);
    }
    
    void method15027(int i, int i_683_, int i_684_, int i_685_, int i_686_,
		     int i_687_, int i_688_, int i_689_) {
	if (anIntArray9338 != null
	    && (i >= 1709859847 * anInt9365 && i < -1807368365 * anInt9343)) {
	    int i_690_ = i_683_ * (356365251 * anInt9356) + i;
	    int i_691_ = i_685_ >>> 24;
	    int i_692_ = i_687_ + i_688_;
	    int i_693_ = i_689_ % i_692_;
	    if (0 == i_686_ || 1 == i_686_ && i_691_ == 255) {
		int i_694_ = 0;
		while (i_694_ < i_684_) {
		    if (i_694_ + i_683_ >= 9823353 * anInt9344
			&& i_694_ + i_683_ < anInt9345 * 639238427
			&& i_693_ < i_687_)
			anIntArray9338[(i_694_ * (356365251 * anInt9356)
					+ i_690_)]
			    = i_685_;
		    i_694_++;
		    i_693_ = ++i_693_ % i_692_;
		}
	    } else if (i_686_ == 1) {
		i_685_ = (((i_685_ & 0xff00) * i_691_ >> 8 & 0xff00)
			  + ((i_685_ & 0xff00ff) * i_691_ >> 8 & 0xff00ff)
			  + (i_691_ << 24));
		int i_695_ = 256 - i_691_;
		int i_696_ = 0;
		while (i_696_ < i_684_) {
		    if (i_683_ + i_696_ >= anInt9344 * 9823353
			&& i_683_ + i_696_ < 639238427 * anInt9345
			&& i_693_ < i_687_) {
			int i_697_ = i_696_ * (356365251 * anInt9356) + i_690_;
			int i_698_ = anIntArray9338[i_697_];
			i_698_ = ((i_695_ * (i_698_ & 0xff00) >> 8 & 0xff00)
				  + (i_695_ * (i_698_ & 0xff00ff) >> 8
				     & 0xff00ff));
			anIntArray9338[i_697_] = i_698_ + i_685_;
		    }
		    i_696_++;
		    i_693_ = ++i_693_ % i_692_;
		}
	    } else if (2 == i_686_) {
		int i_699_ = 0;
		while (i_699_ < i_684_) {
		    if (i_683_ + i_699_ >= anInt9344 * 9823353
			&& i_699_ + i_683_ < anInt9345 * 639238427
			&& i_693_ < i_687_) {
			int i_700_ = anInt9356 * 356365251 * i_699_ + i_690_;
			int i_701_ = anIntArray9338[i_700_];
			int i_702_ = i_685_ + i_701_;
			int i_703_ = (i_701_ & 0xff00ff) + (i_685_ & 0xff00ff);
			i_701_ = (i_702_ - i_703_ & 0x10000) + (i_703_
								& 0x1000100);
			anIntArray9338[i_700_]
			    = i_702_ - i_701_ | i_701_ - (i_701_ >>> 8);
		    }
		    i_699_++;
		    i_693_ = ++i_693_ % i_692_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method15028(int i, int i_704_, int[] is, float[] fs) {
	anInt9356 = i * -2095033109;
	anInt9340 = 1188716565 * i_704_;
	anIntArray9338 = is;
	aFloatArray9341 = fs;
	for (int i_705_ = 0; i_705_ < anInt9367 * 442227785; i_705_++)
	    aClass101Array9335[i_705_].method1893(-188772859);
	method3537();
	method3281();
    }
    
    public void method3291(int i, int i_706_, int i_707_, int i_708_,
			   int i_709_, int i_710_) {
	method3248(i, i_706_, i_707_, i_709_, i_710_);
	method3248(i, i_708_ + i_706_ - 1, i_707_, i_709_, i_710_);
	method3680(i, i_706_ + 1, i_708_ - 2, i_709_, i_710_);
	method3680(i_707_ + i - 1, i_706_ + 1, i_708_ - 2, i_709_, i_710_);
    }
    
    public int[] method3597(int i, int i_711_, int i_712_, int i_713_) {
	if (anIntArray9338 == null)
	    throw new IllegalStateException("");
	int[] is = new int[i_713_ * i_712_];
	int i_714_ = 0;
	for (int i_715_ = 0; i_715_ < i_713_; i_715_++) {
	    int i_716_ = (i_715_ + i_711_) * (356365251 * anInt9356) + i;
	    for (int i_717_ = 0; i_717_ < i_712_; i_717_++)
		is[i_714_++] = anIntArray9338[i_717_ + i_716_];
	}
	return is;
    }
    
    public int[] method3410(int i, int i_718_, int i_719_, int i_720_) {
	if (anIntArray9338 == null)
	    throw new IllegalStateException("");
	int[] is = new int[i_720_ * i_719_];
	int i_721_ = 0;
	for (int i_722_ = 0; i_722_ < i_720_; i_722_++) {
	    int i_723_ = (i_722_ + i_718_) * (356365251 * anInt9356) + i;
	    for (int i_724_ = 0; i_724_ < i_719_; i_724_++)
		is[i_721_++] = anIntArray9338[i_724_ + i_723_];
	}
	return is;
    }
    
    public void method3454() {
	/* empty */
    }
    
    public Class163 method3279(Class169 class169, boolean bool) {
	int i = class169.method2762();
	int i_725_ = class169.method2763();
	Class163_Sub1 class163_sub1;
	if (bool && !class169.method2773() && class169.method2760()) {
	    Class169_Sub2 class169_sub2 = (Class169_Sub2) class169;
	    int[] is = new int[class169_sub2.anIntArray9794.length];
	    byte[] is_726_ = new byte[i * i_725_];
	    for (int i_727_ = 0; i_727_ < i_725_; i_727_++) {
		int i_728_ = i * i_727_;
		for (int i_729_ = 0; i_729_ < i; i_729_++)
		    is_726_[i_728_ + i_729_]
			= class169_sub2.aByteArray9796[i_728_ + i_729_];
	    }
	    for (int i_730_ = 0; i_730_ < class169_sub2.anIntArray9794.length;
		 i_730_++)
		is[i_730_] = class169_sub2.anIntArray9794[i_730_];
	    class163_sub1
		= new Class163_Sub1_Sub2(this, is_726_, is, i, i_725_);
	} else {
	    int[] is = class169.method2766(false);
	    if (class169.method2773())
		class163_sub1 = new Class163_Sub1_Sub1(this, is, i, i_725_);
	    else
		class163_sub1 = new Class163_Sub1_Sub3(this, is, i, i_725_);
	}
	class163_sub1.method2645(class169.method2764(), class169.method2781(),
				 class169.method2765(), class169.method2767());
	return class163_sub1;
    }
    
    public Class170 method3422(int[] is) {
	return null;
    }
    
    public void method3414() {
	/* empty */
    }
    
    public Class433 method3514() {
	return new Class433(aClass433_9362);
    }
    
    public int method3501() {
	return 0;
    }
    
    public boolean method3417() {
	return false;
    }
    
    public boolean method3418() {
	return true;
    }
    
    public boolean method3419() {
	return false;
    }
    
    public int method3498() {
	return 0;
    }
    
    public void method3387(Class433 class433) {
	aClass433_9362.method6842(class433);
	method15050();
    }
    
    public int method3684() {
	return -1;
    }
    
    public void method3522() {
	anInt9365 = 0;
	anInt9344 = 0;
	anInt9343 = 105798609 * anInt9356;
	anInt9345 = anInt9340 * -875090297;
	method15005();
    }
    
    public void method3424(int i, int i_731_, int i_732_) {
	/* empty */
    }
    
    void method15029(int i, int i_733_, int[] is, float[] fs) {
	anInt9356 = i * -2095033109;
	anInt9340 = 1188716565 * i_733_;
	anIntArray9338 = is;
	aFloatArray9341 = fs;
	for (int i_734_ = 0; i_734_ < anInt9367 * 442227785; i_734_++)
	    aClass101Array9335[i_734_].method1893(-262232034);
	method3537();
	method3281();
    }
    
    public void method3426() {
	/* empty */
    }
    
    public void method3427() {
	/* empty */
    }
    
    public void method3428() {
	/* empty */
    }
    
    public long method3355(int i, int i_735_) {
	return 0L;
    }
    
    public void method3430(long l) {
	/* empty */
    }
    
    public void method3431(int i, int i_736_, int[] is, int[] is_737_) {
	method3616(i, i_736_, -782993371);
	if (null == aClass163_9373 || aClass163_9373.method2647() != i
	    || aClass163_9373.method2649() != i_736_) {
	    aClass163_9373 = method3315(i, i_736_, true, true);
	    aClass175_Sub1_9374 = null;
	}
	if (null == aClass175_Sub1_9374) {
	    aClass175_Sub1_9374 = method3263();
	    aClass175_Sub1_9374.method15075(0, aClass163_9373.method2651());
	}
	Class163_Sub1_Sub1 class163_sub1_sub1
	    = new Class163_Sub1_Sub1(this, anIntArray9338,
				     anInt9356 * 356365251,
				     446066493 * anInt9340);
	method3260(aClass175_Sub1_9374, 2075903656);
	method3340(1, -16777216);
	class163_sub1_sub1.method2661(anInt2018 * -1555714981,
				      anInt2019 * -385311879,
				      1769547157 * anInt2020,
				      -740019615 * anInt2021, 1, 0, 0, 0);
	aClass163_9373.method2653(0, 0, i, i_736_, is, is_737_, 0, i);
	method3261(aClass175_Sub1_9374, -11578496);
    }
    
    public void method3432(int i, int i_738_, int[] is, int[] is_739_) {
	method3616(i, i_738_, 818150973);
	if (null == aClass163_9373 || aClass163_9373.method2647() != i
	    || aClass163_9373.method2649() != i_738_) {
	    aClass163_9373 = method3315(i, i_738_, true, true);
	    aClass175_Sub1_9374 = null;
	}
	if (null == aClass175_Sub1_9374) {
	    aClass175_Sub1_9374 = method3263();
	    aClass175_Sub1_9374.method15075(0, aClass163_9373.method2651());
	}
	Class163_Sub1_Sub1 class163_sub1_sub1
	    = new Class163_Sub1_Sub1(this, anIntArray9338,
				     anInt9356 * 356365251,
				     446066493 * anInt9340);
	method3260(aClass175_Sub1_9374, 126473964);
	method3340(1, -16777216);
	class163_sub1_sub1.method2661(anInt2018 * -1555714981,
				      anInt2019 * -385311879,
				      1769547157 * anInt2020,
				      -740019615 * anInt2021, 1, 0, 0, 0);
	aClass163_9373.method2653(0, 0, i, i_738_, is, is_739_, 0, i);
	method3261(aClass175_Sub1_9374, -11578496);
    }
    
    public void method3433(int i, int i_740_, int[] is, int[] is_741_) {
	method3616(i, i_740_, -840488902);
	if (null == aClass163_9373 || aClass163_9373.method2647() != i
	    || aClass163_9373.method2649() != i_740_) {
	    aClass163_9373 = method3315(i, i_740_, true, true);
	    aClass175_Sub1_9374 = null;
	}
	if (null == aClass175_Sub1_9374) {
	    aClass175_Sub1_9374 = method3263();
	    aClass175_Sub1_9374.method15075(0, aClass163_9373.method2651());
	}
	Class163_Sub1_Sub1 class163_sub1_sub1
	    = new Class163_Sub1_Sub1(this, anIntArray9338,
				     anInt9356 * 356365251,
				     446066493 * anInt9340);
	method3260(aClass175_Sub1_9374, 170458721);
	method3340(1, -16777216);
	class163_sub1_sub1.method2661(anInt2018 * -1555714981,
				      anInt2019 * -385311879,
				      1769547157 * anInt2020,
				      -740019615 * anInt2021, 1, 0, 0, 0);
	aClass163_9373.method2653(0, 0, i, i_740_, is, is_741_, 0, i);
	method3261(aClass175_Sub1_9374, -11578496);
    }
    
    public void method3372(int i, int i_742_, int[] is, int[] is_743_) {
	method3616(i, i_742_, -612510662);
	if (null == aClass163_9373 || aClass163_9373.method2647() != i
	    || aClass163_9373.method2649() != i_742_) {
	    aClass163_9373 = method3315(i, i_742_, true, true);
	    aClass175_Sub1_9374 = null;
	}
	if (null == aClass175_Sub1_9374) {
	    aClass175_Sub1_9374 = method3263();
	    aClass175_Sub1_9374.method15075(0, aClass163_9373.method2651());
	}
	Class163_Sub1_Sub1 class163_sub1_sub1
	    = new Class163_Sub1_Sub1(this, anIntArray9338,
				     anInt9356 * 356365251,
				     446066493 * anInt9340);
	method3260(aClass175_Sub1_9374, 376221522);
	method3340(1, -16777216);
	class163_sub1_sub1.method2661(anInt2018 * -1555714981,
				      anInt2019 * -385311879,
				      1769547157 * anInt2020,
				      -740019615 * anInt2021, 1, 0, 0, 0);
	aClass163_9373.method2653(0, 0, i, i_742_, is, is_743_, 0, i);
	method3261(aClass175_Sub1_9374, -11578496);
    }
    
    int method15030(int i) {
	return aClass177_2012.method2931(i, (byte) 1).anInt2046 * 1264459495;
    }
    
    public void method3504(int i, Class534_Sub21[] class534_sub21s) {
	/* empty */
    }
    
    void method15031() {
	if (null != aFloatArray9341) {
	    if (1709859847 * anInt9365 == 0
		&& anInt9343 * -1807368365 == 356365251 * anInt9356
		&& 9823353 * anInt9344 == 0
		&& 639238427 * anInt9345 == 446066493 * anInt9340) {
		int i = aFloatArray9341.length;
		int i_744_ = i - (i & 0x7);
		int i_745_ = 0;
		while (i_745_ < i_744_) {
		    aFloatArray9341[i_745_++] = 2.14748365E9F;
		    aFloatArray9341[i_745_++] = 2.14748365E9F;
		    aFloatArray9341[i_745_++] = 2.14748365E9F;
		    aFloatArray9341[i_745_++] = 2.14748365E9F;
		    aFloatArray9341[i_745_++] = 2.14748365E9F;
		    aFloatArray9341[i_745_++] = 2.14748365E9F;
		    aFloatArray9341[i_745_++] = 2.14748365E9F;
		    aFloatArray9341[i_745_++] = 2.14748365E9F;
		}
		while (i_745_ < i)
		    aFloatArray9341[i_745_++] = 2.14748365E9F;
	    } else {
		int i = anInt9343 * -1807368365 - anInt9365 * 1709859847;
		int i_746_ = 639238427 * anInt9345 - anInt9344 * 9823353;
		int i_747_ = anInt9356 * 356365251 - i;
		int i_748_ = (9823353 * anInt9344 * (356365251 * anInt9356)
			      + 1709859847 * anInt9365);
		int i_749_ = i >> 3;
		int i_750_ = i & 0x7;
		i = i_748_ - 1;
		for (int i_751_ = -i_746_; i_751_ < 0; i_751_++) {
		    if (i_749_ > 0) {
			int i_752_ = i_749_;
			do {
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			} while (--i_752_ > 0);
		    }
		    if (i_750_ > 0) {
			int i_753_ = i_750_;
			do
			    aFloatArray9341[++i] = 2.14748365E9F;
			while (--i_753_ > 0);
		    }
		    i += i_747_;
		}
	    }
	}
    }
    
    public void method3297(int i, int i_754_, int i_755_, int i_756_,
			   int i_757_, int i_758_) {
	method3248(i, i_754_, i_755_, i_757_, i_758_);
	method3248(i, i_756_ + i_754_ - 1, i_755_, i_757_, i_758_);
	method3680(i, i_754_ + 1, i_756_ - 2, i_757_, i_758_);
	method3680(i_755_ + i - 1, i_754_ + 1, i_756_ - 2, i_757_, i_758_);
    }
    
    public void method3435(int i, int i_759_, int i_760_, int i_761_,
			   int i_762_, int i_763_, Class145 class145,
			   int i_764_, int i_765_) {
	if (anIntArray9338 != null) {
	    Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
	    int[] is = class145_sub2.anIntArray9797;
	    int[] is_766_ = class145_sub2.anIntArray9798;
	    int i_767_
		= 9823353 * anInt9344 > i_765_ ? anInt9344 * 9823353 : i_765_;
	    int i_768_ = (639238427 * anInt9345 < is.length + i_765_
			  ? 639238427 * anInt9345 : i_765_ + is.length);
	    i_760_ -= i;
	    i_761_ -= i_759_;
	    if (i_760_ + i_761_ < 0) {
		i += i_760_;
		i_760_ = -i_760_;
		i_759_ += i_761_;
		i_761_ = -i_761_;
	    }
	    if (i_760_ > i_761_) {
		i_759_ <<= 16;
		i_759_ += 32768;
		i_761_ <<= 16;
		int i_769_ = (int) Math.floor((double) i_761_ / (double) i_760_
					      + 0.5);
		i_760_ += i;
		if (i < anInt9365 * 1709859847) {
		    i_759_ += (1709859847 * anInt9365 - i) * i_769_;
		    i = anInt9365 * 1709859847;
		}
		if (i_760_ >= anInt9343 * -1807368365)
		    i_760_ = -1807368365 * anInt9343 - 1;
		int i_770_ = i_762_ >>> 24;
		if (i_763_ == 0 || 1 == i_763_ && i_770_ == 255) {
		    for (/**/; i <= i_760_; i++) {
			int i_771_ = i_759_ >> 16;
			int i_772_ = i_771_ - i_765_;
			if (i_771_ >= i_767_ && i_771_ < i_768_) {
			    int i_773_ = is[i_772_] + i_764_;
			    if (i >= i_773_ && i < i_773_ + is_766_[i_772_])
				anIntArray9338[(356365251 * anInt9356 * i_771_
						+ i)]
				    = i_762_;
			}
			i_759_ += i_769_;
		    }
		} else if (i_763_ == 1) {
		    i_762_ = (((i_762_ & 0xff00) * i_770_ >> 8 & 0xff00)
			      + ((i_762_ & 0xff00ff) * i_770_ >> 8 & 0xff00ff)
			      + (i_770_ << 24));
		    int i_774_ = 256 - i_770_;
		    for (/**/; i <= i_760_; i++) {
			int i_775_ = i_759_ >> 16;
			int i_776_ = i_775_ - i_765_;
			if (i_775_ >= i_767_ && i_775_ < i_768_) {
			    int i_777_ = i_764_ + is[i_776_];
			    if (i >= i_777_ && i < i_777_ + is_766_[i_776_]) {
				int i_778_
				    = i + anInt9356 * 356365251 * i_775_;
				int i_779_ = anIntArray9338[i_778_];
				i_779_ = ((i_774_ * (i_779_ & 0xff00ff) >> 8
					   & 0xff00ff)
					  + ((i_779_ & 0xff00) * i_774_ >> 8
					     & 0xff00));
				anIntArray9338[i_778_] = i_779_ + i_762_;
			    }
			}
			i_759_ += i_769_;
		    }
		} else if (i_763_ == 2) {
		    for (/**/; i <= i_760_; i++) {
			int i_780_ = i_759_ >> 16;
			int i_781_ = i_780_ - i_765_;
			if (i_780_ >= i_767_ && i_780_ < i_768_) {
			    int i_782_ = i_764_ + is[i_781_];
			    if (i >= i_782_ && i < is_766_[i_781_] + i_782_) {
				int i_783_
				    = 356365251 * anInt9356 * i_780_ + i;
				int i_784_ = anIntArray9338[i_783_];
				int i_785_ = i_762_ + i_784_;
				int i_786_ = ((i_784_ & 0xff00ff)
					      + (i_762_ & 0xff00ff));
				i_784_ = ((i_785_ - i_786_ & 0x10000)
					  + (i_786_ & 0x1000100));
				anIntArray9338[i_783_]
				    = i_785_ - i_784_ | i_784_ - (i_784_
								  >>> 8);
			    }
			}
			i_759_ += i_769_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else {
		i <<= 16;
		i += 32768;
		i_760_ <<= 16;
		int i_787_ = (int) Math.floor(0.5 + ((double) i_760_
						     / (double) i_761_));
		i_761_ += i_759_;
		if (i_759_ < i_767_) {
		    i += (i_767_ - i_759_) * i_787_;
		    i_759_ = i_767_;
		}
		if (i_761_ >= i_768_)
		    i_761_ = i_768_ - 1;
		int i_788_ = i_762_ >>> 24;
		if (0 == i_763_ || 1 == i_763_ && 255 == i_788_) {
		    for (/**/; i_759_ <= i_761_; i_759_++) {
			int i_789_ = i >> 16;
			int i_790_ = i_759_ - i_765_;
			int i_791_ = is[i_790_] + i_764_;
			if (i_789_ >= 1709859847 * anInt9365
			    && i_789_ < -1807368365 * anInt9343
			    && i_789_ >= i_791_
			    && i_789_ < is_766_[i_790_] + i_791_)
			    anIntArray9338[(i_759_ * (356365251 * anInt9356)
					    + i_789_)]
				= i_762_;
			i += i_787_;
		    }
		} else if (i_763_ == 1) {
		    i_762_ = (((i_762_ & 0xff00ff) * i_788_ >> 8 & 0xff00ff)
			      + (i_788_ * (i_762_ & 0xff00) >> 8 & 0xff00)
			      + (i_788_ << 24));
		    int i_792_ = 256 - i_788_;
		    for (/**/; i_759_ <= i_761_; i_759_++) {
			int i_793_ = i >> 16;
			int i_794_ = i_759_ - i_765_;
			int i_795_ = i_764_ + is[i_794_];
			if (i_793_ >= anInt9365 * 1709859847
			    && i_793_ < anInt9343 * -1807368365
			    && i_793_ >= i_795_
			    && i_793_ < i_795_ + is_766_[i_794_]) {
			    int i_796_
				= i_793_ + 356365251 * anInt9356 * i_759_;
			    int i_797_ = anIntArray9338[i_796_];
			    i_797_
				= ((i_792_ * (i_797_ & 0xff00) >> 8 & 0xff00)
				   + ((i_797_ & 0xff00ff) * i_792_ >> 8
				      & 0xff00ff));
			    anIntArray9338[(i_759_ * (356365251 * anInt9356)
					    + i_793_)]
				= i_762_ + i_797_;
			}
			i += i_787_;
		    }
		} else if (i_763_ == 2) {
		    for (/**/; i_759_ <= i_761_; i_759_++) {
			int i_798_ = i >> 16;
			int i_799_ = i_759_ - i_765_;
			int i_800_ = i_764_ + is[i_799_];
			if (i_798_ >= anInt9365 * 1709859847
			    && i_798_ < anInt9343 * -1807368365
			    && i_798_ >= i_800_
			    && i_798_ < is_766_[i_799_] + i_800_) {
			    int i_801_
				= i_798_ + i_759_ * (anInt9356 * 356365251);
			    int i_802_ = anIntArray9338[i_801_];
			    int i_803_ = i_762_ + i_802_;
			    int i_804_
				= (i_802_ & 0xff00ff) + (i_762_ & 0xff00ff);
			    i_802_
				= (i_803_ - i_804_ & 0x10000) + (i_804_
								 & 0x1000100);
			    anIntArray9338[i_801_]
				= i_803_ - i_802_ | i_802_ - (i_802_ >>> 8);
			}
			i += i_787_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method3437() {
	anInt9357 = 0;
	anInt9364 = 0;
	anInt9359 = anInt9356 * 910584147;
	anInt9360 = 1362504755 * anInt9340;
	method15005();
    }
    
    public void method3438() {
	anInt9357 = 0;
	anInt9364 = 0;
	anInt9359 = anInt9356 * 910584147;
	anInt9360 = 1362504755 * anInt9340;
	method15005();
    }
    
    public void method3543(float f, float f_805_, float f_806_, float f_807_,
			   float f_808_) {
	/* empty */
    }
    
    public void method3230() {
	/* empty */
    }
    
    public void method3441(float f, float f_809_) {
	aFloat9349 = f_809_ - f;
	aFloat9366 = f + f_809_ - 1.0F;
	for (int i = 0; i < 442227785 * anInt9367; i++) {
	    Class101 class101 = aClass101Array9335[i];
	    Class119 class119 = class101.aClass119_1233;
	    class119.aFloat1434 = aFloat9349;
	    class119.aFloat1433 = aFloat9366;
	}
    }
    
    public void method3442() {
	anInt9365 = 0;
	anInt9344 = 0;
	anInt9343 = 105798609 * anInt9356;
	anInt9345 = anInt9340 * -875090297;
	method15005();
    }
    
    public void method3537() {
	anInt9365 = 0;
	anInt9344 = 0;
	anInt9343 = 105798609 * anInt9356;
	anInt9345 = anInt9340 * -875090297;
	method15005();
    }
    
    public void method3444() {
	anInt9365 = 0;
	anInt9344 = 0;
	anInt9343 = 105798609 * anInt9356;
	anInt9345 = anInt9340 * -875090297;
	method15005();
    }
    
    public void method3284(float f, float f_810_) {
	aFloat9349 = f_810_ - f;
	aFloat9366 = f + f_810_ - 1.0F;
	for (int i = 0; i < 442227785 * anInt9367; i++) {
	    Class101 class101 = aClass101Array9335[i];
	    Class119 class119 = class101.aClass119_1233;
	    class119.aFloat1434 = aFloat9349;
	    class119.aFloat1433 = aFloat9366;
	}
    }
    
    public void method3416(int i, int i_811_, int i_812_, int i_813_) {
	if (i < 0)
	    i = 0;
	if (i_811_ < 0)
	    i_811_ = 0;
	if (i_812_ > anInt9356 * 356365251)
	    i_812_ = 356365251 * anInt9356;
	if (i_813_ > anInt9340 * 446066493)
	    i_813_ = anInt9340 * 446066493;
	anInt9365 = i * -1685075529;
	anInt9343 = -315695909 * i_812_;
	anInt9344 = i_811_ * 1960003017;
	anInt9345 = -217091821 * i_813_;
	method15005();
    }
    
    public void method3510(Class433 class433) {
	aClass433_9362.method6842(class433);
	method15050();
    }
    
    public void method3448(int i, int i_814_, int i_815_, int i_816_) {
	if (anInt9365 * 1709859847 < i)
	    anInt9365 = i * -1685075529;
	if (9823353 * anInt9344 < i_814_)
	    anInt9344 = i_814_ * 1960003017;
	if (anInt9343 * -1807368365 > i_815_)
	    anInt9343 = i_815_ * -315695909;
	if (anInt9345 * 639238427 > i_816_)
	    anInt9345 = i_816_ * -217091821;
	method15005();
    }
    
    public void method3449(int i, int i_817_, int i_818_, int i_819_) {
	if (anInt9365 * 1709859847 < i)
	    anInt9365 = i * -1685075529;
	if (9823353 * anInt9344 < i_817_)
	    anInt9344 = i_817_ * 1960003017;
	if (anInt9343 * -1807368365 > i_818_)
	    anInt9343 = i_818_ * -315695909;
	if (anInt9345 * 639238427 > i_819_)
	    anInt9345 = i_819_ * -217091821;
	method15005();
    }
    
    public void method3450(int i, int i_820_, int i_821_, int i_822_) {
	if (anInt9365 * 1709859847 < i)
	    anInt9365 = i * -1685075529;
	if (9823353 * anInt9344 < i_820_)
	    anInt9344 = i_820_ * 1960003017;
	if (anInt9343 * -1807368365 > i_821_)
	    anInt9343 = i_821_ * -315695909;
	if (anInt9345 * 639238427 > i_822_)
	    anInt9345 = i_822_ * -217091821;
	method15005();
    }
    
    public void method3290(int i, int i_823_, int i_824_, int i_825_) {
	if (anInt9365 * 1709859847 < i)
	    anInt9365 = i * -1685075529;
	if (9823353 * anInt9344 < i_823_)
	    anInt9344 = i_823_ * 1960003017;
	if (anInt9343 * -1807368365 > i_824_)
	    anInt9343 = i_824_ * -315695909;
	if (anInt9345 * 639238427 > i_825_)
	    anInt9345 = i_825_ * -217091821;
	method15005();
    }
    
    public void method3562(int[] is) {
	is[0] = anInt9365 * 1709859847;
	is[1] = 9823353 * anInt9344;
	is[2] = -1807368365 * anInt9343;
	is[3] = anInt9345 * 639238427;
    }
    
    public void method3452(int[] is) {
	is[0] = anInt9365 * 1709859847;
	is[1] = 9823353 * anInt9344;
	is[2] = -1807368365 * anInt9343;
	is[3] = anInt9345 * 639238427;
    }
    
    public void method3453(int[] is) {
	is[0] = anInt9365 * 1709859847;
	is[1] = 9823353 * anInt9344;
	is[2] = -1807368365 * anInt9343;
	is[3] = anInt9345 * 639238427;
    }
    
    public void method3313(int[] is) {
	is[0] = anInt9365 * 1709859847;
	is[1] = 9823353 * anInt9344;
	is[2] = -1807368365 * anInt9343;
	is[3] = anInt9345 * 639238427;
    }
    
    public void method3382(int[] is) {
	is[0] = anInt9365 * 1709859847;
	is[1] = 9823353 * anInt9344;
	is[2] = -1807368365 * anInt9343;
	is[3] = anInt9345 * 639238427;
    }
    
    public Class534_Sub2 method3614(int i) {
	return null;
    }
    
    public void method3457(int i, int i_826_) {
	if ((i & 0x1) != 0)
	    method3298(0, 0, 356365251 * anInt9356, anInt9340 * 446066493,
		       i_826_, 0);
	if (0 != (i & 0x2))
	    method15003();
    }
    
    public void method3458(int i, int i_827_) {
	if ((i & 0x1) != 0)
	    method3298(0, 0, 356365251 * anInt9356, anInt9340 * 446066493,
		       i_827_, 0);
	if (0 != (i & 0x2))
	    method15003();
    }
    
    public void method3459(int i, int i_828_) {
	if ((i & 0x1) != 0)
	    method3298(0, 0, 356365251 * anInt9356, anInt9340 * 446066493,
		       i_828_, 0);
	if (0 != (i & 0x2))
	    method15003();
    }
    
    public void method3460(int i, int i_829_, int i_830_, int i_831_,
			   int i_832_, int i_833_) {
	method3248(i, i_829_, i_830_, i_832_, i_833_);
	method3248(i, i_831_ + i_829_ - 1, i_830_, i_832_, i_833_);
	method3680(i, i_829_ + 1, i_831_ - 2, i_832_, i_833_);
	method3680(i_830_ + i - 1, i_829_ + 1, i_831_ - 2, i_832_, i_833_);
    }
    
    public Class433 method3518() {
	Class101 class101 = method15011(Thread.currentThread());
	return class101.aClass433_1212;
    }
    
    public void method3462(int i, int i_834_, int i_835_, int i_836_,
			   int i_837_, int i_838_) {
	if (anIntArray9338 != null) {
	    if (i < 1709859847 * anInt9365) {
		i_835_ -= 1709859847 * anInt9365 - i;
		i = 1709859847 * anInt9365;
	    }
	    if (i_834_ < 9823353 * anInt9344) {
		i_836_ -= anInt9344 * 9823353 - i_834_;
		i_834_ = 9823353 * anInt9344;
	    }
	    if (i + i_835_ > -1807368365 * anInt9343)
		i_835_ = anInt9343 * -1807368365 - i;
	    if (i_836_ + i_834_ > 639238427 * anInt9345)
		i_836_ = anInt9345 * 639238427 - i_834_;
	    if (i_835_ > 0 && i_836_ > 0 && i <= -1807368365 * anInt9343
		&& i_834_ <= anInt9345 * 639238427) {
		int i_839_ = anInt9356 * 356365251 - i_835_;
		int i_840_ = i_834_ * (anInt9356 * 356365251) + i;
		int i_841_ = i_837_ >>> 24;
		if (i_838_ == 0 || 1 == i_838_ && i_841_ == 255) {
		    int i_842_ = i_835_ >> 3;
		    int i_843_ = i_835_ & 0x7;
		    i_835_ = i_840_ - 1;
		    for (int i_844_ = -i_836_; i_844_ < 0; i_844_++) {
			if (i_842_ > 0) {
			    i = i_842_;
			    do {
				anIntArray9338[++i_835_] = i_837_;
				anIntArray9338[++i_835_] = i_837_;
				anIntArray9338[++i_835_] = i_837_;
				anIntArray9338[++i_835_] = i_837_;
				anIntArray9338[++i_835_] = i_837_;
				anIntArray9338[++i_835_] = i_837_;
				anIntArray9338[++i_835_] = i_837_;
				anIntArray9338[++i_835_] = i_837_;
			    } while (--i > 0);
			}
			if (i_843_ > 0) {
			    i = i_843_;
			    do
				anIntArray9338[++i_835_] = i_837_;
			    while (--i > 0);
			}
			i_835_ += i_839_;
		    }
		} else if (1 == i_838_) {
		    i_837_
			= ((((i_837_ & ~0xff00ff) >>> 8) * i_841_ & ~0xff00ff)
			   + ((i_837_ & 0xff00ff) * i_841_ >> 8 & 0xff00ff));
		    int i_845_ = 256 - i_841_;
		    for (int i_846_ = 0; i_846_ < i_836_; i_846_++) {
			for (int i_847_ = -i_835_; i_847_ < 0; i_847_++) {
			    int i_848_ = anIntArray9338[i_840_];
			    i_848_ = ((((i_848_ & ~0xff00ff) >>> 8) * i_845_
				       & ~0xff00ff)
				      + (i_845_ * (i_848_ & 0xff00ff) >> 8
					 & 0xff00ff));
			    anIntArray9338[i_840_++] = i_848_ + i_837_;
			}
			i_840_ += i_839_;
		    }
		} else if (i_838_ == 2) {
		    for (int i_849_ = 0; i_849_ < i_836_; i_849_++) {
			for (int i_850_ = -i_835_; i_850_ < 0; i_850_++) {
			    int i_851_ = anIntArray9338[i_840_];
			    int i_852_ = i_837_ + i_851_;
			    int i_853_
				= (i_851_ & 0xff00ff) + (i_837_ & 0xff00ff);
			    i_851_
				= (i_852_ - i_853_ & 0x10000) + (i_853_
								 & 0x1000100);
			    anIntArray9338[i_840_++]
				= i_852_ - i_851_ | i_851_ - (i_851_ >>> 8);
			}
			i_840_ += i_839_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public Interface21 method3645(int i, int i_854_, int i_855_) {
	return new Class130(i, i_854_);
    }
    
    public void method3413() {
	/* empty */
    }
    
    void method3465(int i, int i_856_, int i_857_, int i_858_, int i_859_) {
	if (anIntArray9338 != null) {
	    if (i_857_ < 0)
		i_857_ = -i_857_;
	    int i_860_ = i_856_ - i_857_;
	    if (i_860_ < anInt9344 * 9823353)
		i_860_ = 9823353 * anInt9344;
	    int i_861_ = i_856_ + i_857_ + 1;
	    if (i_861_ > 639238427 * anInt9345)
		i_861_ = 639238427 * anInt9345;
	    int i_862_ = i_860_;
	    int i_863_ = i_857_ * i_857_;
	    int i_864_ = 0;
	    int i_865_ = i_856_ - i_862_;
	    int i_866_ = i_865_ * i_865_;
	    int i_867_ = i_866_ - i_865_;
	    if (i_856_ > i_861_)
		i_856_ = i_861_;
	    int i_868_ = i_858_ >>> 24;
	    if (0 == i_859_ || 1 == i_859_ && i_868_ == 255) {
		while (i_862_ < i_856_) {
		    for (/**/; i_867_ <= i_863_ || i_866_ <= i_863_;
			 i_867_ += i_864_++ + i_864_)
			i_866_ += i_864_ + i_864_;
		    int i_869_ = i - i_864_ + 1;
		    if (i_869_ < 1709859847 * anInt9365)
			i_869_ = 1709859847 * anInt9365;
		    int i_870_ = i_864_ + i;
		    if (i_870_ > anInt9343 * -1807368365)
			i_870_ = anInt9343 * -1807368365;
		    int i_871_ = i_862_ * (356365251 * anInt9356) + i_869_;
		    for (int i_872_ = i_869_; i_872_ < i_870_; i_872_++)
			anIntArray9338[i_871_++] = i_858_;
		    i_862_++;
		    i_866_ -= i_865_-- + i_865_;
		    i_867_ -= i_865_ + i_865_;
		}
		i_864_ = i_857_;
		i_865_ = i_862_ - i_856_;
		i_867_ = i_863_ + i_865_ * i_865_;
		i_866_ = i_867_ - i_864_;
		i_867_ -= i_865_;
		while (i_862_ < i_861_) {
		    for (/**/; i_867_ > i_863_ && i_866_ > i_863_;
			 i_866_ -= i_864_ + i_864_)
			i_867_ -= i_864_-- + i_864_;
		    int i_873_ = i - i_864_;
		    if (i_873_ < anInt9365 * 1709859847)
			i_873_ = 1709859847 * anInt9365;
		    int i_874_ = i_864_ + i;
		    if (i_874_ > -1807368365 * anInt9343 - 1)
			i_874_ = -1807368365 * anInt9343 - 1;
		    int i_875_ = i_873_ + anInt9356 * 356365251 * i_862_;
		    for (int i_876_ = i_873_; i_876_ <= i_874_; i_876_++)
			anIntArray9338[i_875_++] = i_858_;
		    i_862_++;
		    i_867_ += i_865_ + i_865_;
		    i_866_ += i_865_++ + i_865_;
		}
	    } else if (i_859_ == 1) {
		i_858_ = ((i_868_ << 24)
			  + ((i_868_ * (i_858_ & 0xff00ff) >> 8 & 0xff00ff)
			     + (i_868_ * (i_858_ & 0xff00) >> 8 & 0xff00)));
		int i_877_ = 256 - i_868_;
		while (i_862_ < i_856_) {
		    for (/**/; i_867_ <= i_863_ || i_866_ <= i_863_;
			 i_867_ += i_864_++ + i_864_)
			i_866_ += i_864_ + i_864_;
		    int i_878_ = i - i_864_ + 1;
		    if (i_878_ < anInt9365 * 1709859847)
			i_878_ = 1709859847 * anInt9365;
		    int i_879_ = i_864_ + i;
		    if (i_879_ > -1807368365 * anInt9343)
			i_879_ = -1807368365 * anInt9343;
		    int i_880_ = i_862_ * (anInt9356 * 356365251) + i_878_;
		    for (int i_881_ = i_878_; i_881_ < i_879_; i_881_++) {
			int i_882_ = anIntArray9338[i_880_];
			i_882_ = ((i_877_ * (i_882_ & 0xff00) >> 8 & 0xff00)
				  + (i_877_ * (i_882_ & 0xff00ff) >> 8
				     & 0xff00ff));
			anIntArray9338[i_880_++] = i_882_ + i_858_;
		    }
		    i_862_++;
		    i_866_ -= i_865_-- + i_865_;
		    i_867_ -= i_865_ + i_865_;
		}
		i_864_ = i_857_;
		i_865_ = -i_865_;
		i_867_ = i_863_ + i_865_ * i_865_;
		i_866_ = i_867_ - i_864_;
		i_867_ -= i_865_;
		while (i_862_ < i_861_) {
		    for (/**/; i_867_ > i_863_ && i_866_ > i_863_;
			 i_866_ -= i_864_ + i_864_)
			i_867_ -= i_864_-- + i_864_;
		    int i_883_ = i - i_864_;
		    if (i_883_ < 1709859847 * anInt9365)
			i_883_ = 1709859847 * anInt9365;
		    int i_884_ = i_864_ + i;
		    if (i_884_ > anInt9343 * -1807368365 - 1)
			i_884_ = -1807368365 * anInt9343 - 1;
		    int i_885_ = i_862_ * (anInt9356 * 356365251) + i_883_;
		    for (int i_886_ = i_883_; i_886_ <= i_884_; i_886_++) {
			int i_887_ = anIntArray9338[i_885_];
			i_887_ = ((i_877_ * (i_887_ & 0xff00) >> 8 & 0xff00)
				  + ((i_887_ & 0xff00ff) * i_877_ >> 8
				     & 0xff00ff));
			anIntArray9338[i_885_++] = i_887_ + i_858_;
		    }
		    i_862_++;
		    i_867_ += i_865_ + i_865_;
		    i_866_ += i_865_++ + i_865_;
		}
	    } else if (2 == i_859_) {
		while (i_862_ < i_856_) {
		    for (/**/; i_867_ <= i_863_ || i_866_ <= i_863_;
			 i_867_ += i_864_++ + i_864_)
			i_866_ += i_864_ + i_864_;
		    int i_888_ = i - i_864_ + 1;
		    if (i_888_ < anInt9365 * 1709859847)
			i_888_ = 1709859847 * anInt9365;
		    int i_889_ = i_864_ + i;
		    if (i_889_ > -1807368365 * anInt9343)
			i_889_ = -1807368365 * anInt9343;
		    int i_890_ = anInt9356 * 356365251 * i_862_ + i_888_;
		    for (int i_891_ = i_888_; i_891_ < i_889_; i_891_++) {
			int i_892_ = anIntArray9338[i_890_];
			int i_893_ = i_892_ + i_858_;
			int i_894_ = (i_892_ & 0xff00ff) + (i_858_ & 0xff00ff);
			i_892_ = (i_893_ - i_894_ & 0x10000) + (i_894_
								& 0x1000100);
			anIntArray9338[i_890_++]
			    = i_893_ - i_892_ | i_892_ - (i_892_ >>> 8);
		    }
		    i_862_++;
		    i_866_ -= i_865_-- + i_865_;
		    i_867_ -= i_865_ + i_865_;
		}
		i_864_ = i_857_;
		i_865_ = -i_865_;
		i_867_ = i_863_ + i_865_ * i_865_;
		i_866_ = i_867_ - i_864_;
		i_867_ -= i_865_;
		while (i_862_ < i_861_) {
		    for (/**/; i_867_ > i_863_ && i_866_ > i_863_;
			 i_866_ -= i_864_ + i_864_)
			i_867_ -= i_864_-- + i_864_;
		    int i_895_ = i - i_864_;
		    if (i_895_ < 1709859847 * anInt9365)
			i_895_ = anInt9365 * 1709859847;
		    int i_896_ = i_864_ + i;
		    if (i_896_ > -1807368365 * anInt9343 - 1)
			i_896_ = -1807368365 * anInt9343 - 1;
		    int i_897_ = i_895_ + 356365251 * anInt9356 * i_862_;
		    for (int i_898_ = i_895_; i_898_ <= i_896_; i_898_++) {
			int i_899_ = anIntArray9338[i_897_];
			int i_900_ = i_899_ + i_858_;
			int i_901_ = (i_858_ & 0xff00ff) + (i_899_ & 0xff00ff);
			i_899_ = (i_901_ & 0x1000100) + (i_900_ - i_901_
							 & 0x10000);
			anIntArray9338[i_897_++]
			    = i_900_ - i_899_ | i_899_ - (i_899_ >>> 8);
		    }
		    i_862_++;
		    i_867_ += i_865_ + i_865_;
		    i_866_ += i_865_++ + i_865_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method3595(int i, int i_902_, int i_903_, int i_904_, int i_905_) {
	if (null != anIntArray9338 && (i_902_ >= 9823353 * anInt9344
				       && i_902_ < 639238427 * anInt9345)) {
	    if (i < 1709859847 * anInt9365) {
		i_903_ -= 1709859847 * anInt9365 - i;
		i = anInt9365 * 1709859847;
	    }
	    if (i + i_903_ > anInt9343 * -1807368365)
		i_903_ = -1807368365 * anInt9343 - i;
	    int i_906_ = i + i_902_ * (356365251 * anInt9356);
	    int i_907_ = i_904_ >>> 24;
	    if (i_905_ == 0 || 1 == i_905_ && 255 == i_907_) {
		for (int i_908_ = 0; i_908_ < i_903_; i_908_++)
		    anIntArray9338[i_908_ + i_906_] = i_904_;
	    } else if (1 == i_905_) {
		i_904_ = (i_907_ << 24) + ((i_907_ * (i_904_ & 0xff00) >> 8
					    & 0xff00)
					   + (i_907_ * (i_904_ & 0xff00ff) >> 8
					      & 0xff00ff));
		int i_909_ = 256 - i_907_;
		for (int i_910_ = 0; i_910_ < i_903_; i_910_++) {
		    int i_911_ = anIntArray9338[i_906_ + i_910_];
		    i_911_ = ((i_909_ * (i_911_ & 0xff00ff) >> 8 & 0xff00ff)
			      + ((i_911_ & 0xff00) * i_909_ >> 8 & 0xff00));
		    anIntArray9338[i_910_ + i_906_] = i_904_ + i_911_;
		}
	    } else if (2 == i_905_) {
		for (int i_912_ = 0; i_912_ < i_903_; i_912_++) {
		    int i_913_ = anIntArray9338[i_906_ + i_912_];
		    int i_914_ = i_913_ + i_904_;
		    int i_915_ = (i_913_ & 0xff00ff) + (i_904_ & 0xff00ff);
		    i_913_
			= (i_914_ - i_915_ & 0x10000) + (i_915_ & 0x1000100);
		    anIntArray9338[i_912_ + i_906_]
			= i_914_ - i_913_ | i_913_ - (i_913_ >>> 8);
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method15032(int i, int i_916_, int i_917_, int i_918_, int i_919_,
		     int i_920_, int i_921_, int i_922_) {
	if (anIntArray9338 != null && (i_916_ >= anInt9344 * 9823353
				       && i_916_ < anInt9345 * 639238427)) {
	    int i_923_ = i_916_ * (356365251 * anInt9356) + i;
	    int i_924_ = i_918_ >>> 24;
	    int i_925_ = i_921_ + i_920_;
	    int i_926_ = i_922_ % i_925_;
	    if (i_919_ == 0 || 1 == i_919_ && 255 == i_924_) {
		int i_927_ = 0;
		while (i_927_ < i_917_) {
		    if (i_927_ + i >= anInt9365 * 1709859847
			&& i_927_ + i < anInt9343 * -1807368365
			&& i_926_ < i_920_)
			anIntArray9338[i_927_ + i_923_] = i_918_;
		    i_927_++;
		    i_926_ = ++i_926_ % i_925_;
		}
	    } else if (i_919_ == 1) {
		i_918_ = (((i_918_ & 0xff00) * i_924_ >> 8 & 0xff00)
			  + (i_924_ * (i_918_ & 0xff00ff) >> 8 & 0xff00ff)
			  + (i_924_ << 24));
		int i_928_ = 256 - i_924_;
		int i_929_ = 0;
		while (i_929_ < i_917_) {
		    if (i + i_929_ >= 1709859847 * anInt9365
			&& i_929_ + i < -1807368365 * anInt9343
			&& i_926_ < i_920_) {
			int i_930_ = anIntArray9338[i_929_ + i_923_];
			i_930_
			    = ((i_928_ * (i_930_ & 0xff00ff) >> 8 & 0xff00ff)
			       + (i_928_ * (i_930_ & 0xff00) >> 8 & 0xff00));
			anIntArray9338[i_929_ + i_923_] = i_918_ + i_930_;
		    }
		    i_929_++;
		    i_926_ = ++i_926_ % i_925_;
		}
	    } else if (2 == i_919_) {
		int i_931_ = 0;
		while (i_931_ < i_917_) {
		    if (i + i_931_ >= 1709859847 * anInt9365
			&& i + i_931_ < -1807368365 * anInt9343
			&& i_926_ < i_920_) {
			int i_932_ = anIntArray9338[i_931_ + i_923_];
			int i_933_ = i_918_ + i_932_;
			int i_934_ = (i_932_ & 0xff00ff) + (i_918_ & 0xff00ff);
			i_932_ = (i_934_ & 0x1000100) + (i_933_ - i_934_
							 & 0x10000);
			anIntArray9338[i_923_ + i_931_]
			    = i_933_ - i_932_ | i_932_ - (i_932_ >>> 8);
		    }
		    i_931_++;
		    i_926_ = ++i_926_ % i_925_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method3472(int i, int i_935_, int i_936_, int i_937_,
			   int i_938_, int i_939_, int i_940_) {
	if (anIntArray9338 != null) {
	    Class101 class101 = method15011(Thread.currentThread());
	    Class119 class119 = class101.aClass119_1233;
	    int i_941_ = i_936_ - i;
	    int i_942_ = i_937_ - i_935_;
	    int i_943_ = i_941_ >= 0 ? i_941_ : -i_941_;
	    int i_944_ = i_942_ >= 0 ? i_942_ : -i_942_;
	    int i_945_ = i_943_;
	    if (i_945_ < i_944_)
		i_945_ = i_944_;
	    if (0 != i_945_) {
		int i_946_ = (i_941_ << 16) / i_945_;
		int i_947_ = (i_942_ << 16) / i_945_;
		i_941_ += i_946_ >> 16;
		i_942_ += i_947_ >> 16;
		if (i_947_ <= i_946_)
		    i_946_ = -i_946_;
		else
		    i_947_ = -i_947_;
		int i_948_ = i_947_ * i_939_ >> 17;
		int i_949_ = 1 + i_939_ * i_947_ >> 17;
		int i_950_ = i_939_ * i_946_ >> 17;
		int i_951_ = 1 + i_939_ * i_946_ >> 17;
		i -= class119.method2136();
		i_935_ -= class119.method2146();
		int i_952_ = i_948_ + i;
		int i_953_ = i - i_949_;
		int i_954_ = i_941_ + i - i_949_;
		int i_955_ = i_941_ + i + i_948_;
		int i_956_ = i_935_ + i_950_;
		int i_957_ = i_935_ - i_951_;
		int i_958_ = i_935_ + i_942_ - i_951_;
		int i_959_ = i_950_ + (i_935_ + i_942_);
		if (0 == i_940_)
		    class119.anInt1447 = 0;
		else if (1 == i_940_)
		    class119.anInt1447 = 255 - (i_938_ >>> 24);
		else
		    throw new IllegalArgumentException();
		method3461(false);
		class119.aBool1422
		    = (i_952_ < 0 || i_952_ > class119.anInt1448 || i_953_ < 0
		       || i_953_ > class119.anInt1448 || i_954_ < 0
		       || i_954_ > class119.anInt1448);
		class119.method2137(true, false, false, (float) i_956_,
				    (float) i_957_, (float) i_958_,
				    (float) i_952_, (float) i_953_,
				    (float) i_954_, 100.0F, 100.0F, 100.0F,
				    i_938_);
		class119.aBool1422
		    = (i_952_ < 0 || i_952_ > class119.anInt1448 || i_954_ < 0
		       || i_954_ > class119.anInt1448 || i_955_ < 0
		       || i_955_ > class119.anInt1448);
		class119.method2137(true, false, false, (float) i_956_,
				    (float) i_958_, (float) i_959_,
				    (float) i_952_, (float) i_954_,
				    (float) i_955_, 100.0F, 100.0F, 100.0F,
				    i_938_);
		method3461(true);
	    }
	}
    }
    
    void method15033(int i, int i_960_, int i_961_, int i_962_, int i_963_,
		     int i_964_, int i_965_, int i_966_) {
	if (anIntArray9338 != null
	    && (i >= 1709859847 * anInt9365 && i < -1807368365 * anInt9343)) {
	    int i_967_ = i_960_ * (356365251 * anInt9356) + i;
	    int i_968_ = i_962_ >>> 24;
	    int i_969_ = i_964_ + i_965_;
	    int i_970_ = i_966_ % i_969_;
	    if (0 == i_963_ || 1 == i_963_ && i_968_ == 255) {
		int i_971_ = 0;
		while (i_971_ < i_961_) {
		    if (i_971_ + i_960_ >= 9823353 * anInt9344
			&& i_971_ + i_960_ < anInt9345 * 639238427
			&& i_970_ < i_964_)
			anIntArray9338[(i_971_ * (356365251 * anInt9356)
					+ i_967_)]
			    = i_962_;
		    i_971_++;
		    i_970_ = ++i_970_ % i_969_;
		}
	    } else if (i_963_ == 1) {
		i_962_ = (((i_962_ & 0xff00) * i_968_ >> 8 & 0xff00)
			  + ((i_962_ & 0xff00ff) * i_968_ >> 8 & 0xff00ff)
			  + (i_968_ << 24));
		int i_972_ = 256 - i_968_;
		int i_973_ = 0;
		while (i_973_ < i_961_) {
		    if (i_960_ + i_973_ >= anInt9344 * 9823353
			&& i_960_ + i_973_ < 639238427 * anInt9345
			&& i_970_ < i_964_) {
			int i_974_ = i_973_ * (356365251 * anInt9356) + i_967_;
			int i_975_ = anIntArray9338[i_974_];
			i_975_ = ((i_972_ * (i_975_ & 0xff00) >> 8 & 0xff00)
				  + (i_972_ * (i_975_ & 0xff00ff) >> 8
				     & 0xff00ff));
			anIntArray9338[i_974_] = i_975_ + i_962_;
		    }
		    i_973_++;
		    i_970_ = ++i_970_ % i_969_;
		}
	    } else if (2 == i_963_) {
		int i_976_ = 0;
		while (i_976_ < i_961_) {
		    if (i_960_ + i_976_ >= anInt9344 * 9823353
			&& i_976_ + i_960_ < anInt9345 * 639238427
			&& i_970_ < i_964_) {
			int i_977_ = anInt9356 * 356365251 * i_976_ + i_967_;
			int i_978_ = anIntArray9338[i_977_];
			int i_979_ = i_962_ + i_978_;
			int i_980_ = (i_978_ & 0xff00ff) + (i_962_ & 0xff00ff);
			i_978_ = (i_979_ - i_980_ & 0x10000) + (i_980_
								& 0x1000100);
			anIntArray9338[i_977_]
			    = i_979_ - i_978_ | i_978_ - (i_978_ >>> 8);
		    }
		    i_976_++;
		    i_970_ = ++i_970_ % i_969_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method15034(int i, int i_981_, int i_982_, int i_983_, int i_984_,
		     int i_985_, int i_986_, int i_987_) {
	if (anIntArray9338 != null
	    && (i >= 1709859847 * anInt9365 && i < -1807368365 * anInt9343)) {
	    int i_988_ = i_981_ * (356365251 * anInt9356) + i;
	    int i_989_ = i_983_ >>> 24;
	    int i_990_ = i_985_ + i_986_;
	    int i_991_ = i_987_ % i_990_;
	    if (0 == i_984_ || 1 == i_984_ && i_989_ == 255) {
		int i_992_ = 0;
		while (i_992_ < i_982_) {
		    if (i_992_ + i_981_ >= 9823353 * anInt9344
			&& i_992_ + i_981_ < anInt9345 * 639238427
			&& i_991_ < i_985_)
			anIntArray9338[(i_992_ * (356365251 * anInt9356)
					+ i_988_)]
			    = i_983_;
		    i_992_++;
		    i_991_ = ++i_991_ % i_990_;
		}
	    } else if (i_984_ == 1) {
		i_983_ = (((i_983_ & 0xff00) * i_989_ >> 8 & 0xff00)
			  + ((i_983_ & 0xff00ff) * i_989_ >> 8 & 0xff00ff)
			  + (i_989_ << 24));
		int i_993_ = 256 - i_989_;
		int i_994_ = 0;
		while (i_994_ < i_982_) {
		    if (i_981_ + i_994_ >= anInt9344 * 9823353
			&& i_981_ + i_994_ < 639238427 * anInt9345
			&& i_991_ < i_985_) {
			int i_995_ = i_994_ * (356365251 * anInt9356) + i_988_;
			int i_996_ = anIntArray9338[i_995_];
			i_996_ = ((i_993_ * (i_996_ & 0xff00) >> 8 & 0xff00)
				  + (i_993_ * (i_996_ & 0xff00ff) >> 8
				     & 0xff00ff));
			anIntArray9338[i_995_] = i_996_ + i_983_;
		    }
		    i_994_++;
		    i_991_ = ++i_991_ % i_990_;
		}
	    } else if (2 == i_984_) {
		int i_997_ = 0;
		while (i_997_ < i_982_) {
		    if (i_981_ + i_997_ >= anInt9344 * 9823353
			&& i_997_ + i_981_ < anInt9345 * 639238427
			&& i_991_ < i_985_) {
			int i_998_ = anInt9356 * 356365251 * i_997_ + i_988_;
			int i_999_ = anIntArray9338[i_998_];
			int i_1000_ = i_983_ + i_999_;
			int i_1001_
			    = (i_999_ & 0xff00ff) + (i_983_ & 0xff00ff);
			i_999_ = (i_1000_ - i_1001_ & 0x10000) + (i_1001_
								  & 0x1000100);
			anIntArray9338[i_998_]
			    = i_1000_ - i_999_ | i_999_ - (i_999_ >>> 8);
		    }
		    i_997_++;
		    i_991_ = ++i_991_ % i_990_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method15035(int i, int i_1002_, int i_1003_, int i_1004_, int i_1005_,
		     int i_1006_, int i_1007_, int i_1008_) {
	if (anIntArray9338 != null
	    && (i >= 1709859847 * anInt9365 && i < -1807368365 * anInt9343)) {
	    int i_1009_ = i_1002_ * (356365251 * anInt9356) + i;
	    int i_1010_ = i_1004_ >>> 24;
	    int i_1011_ = i_1006_ + i_1007_;
	    int i_1012_ = i_1008_ % i_1011_;
	    if (0 == i_1005_ || 1 == i_1005_ && i_1010_ == 255) {
		int i_1013_ = 0;
		while (i_1013_ < i_1003_) {
		    if (i_1013_ + i_1002_ >= 9823353 * anInt9344
			&& i_1013_ + i_1002_ < anInt9345 * 639238427
			&& i_1012_ < i_1006_)
			anIntArray9338[(i_1013_ * (356365251 * anInt9356)
					+ i_1009_)]
			    = i_1004_;
		    i_1013_++;
		    i_1012_ = ++i_1012_ % i_1011_;
		}
	    } else if (i_1005_ == 1) {
		i_1004_ = (((i_1004_ & 0xff00) * i_1010_ >> 8 & 0xff00)
			   + ((i_1004_ & 0xff00ff) * i_1010_ >> 8 & 0xff00ff)
			   + (i_1010_ << 24));
		int i_1014_ = 256 - i_1010_;
		int i_1015_ = 0;
		while (i_1015_ < i_1003_) {
		    if (i_1002_ + i_1015_ >= anInt9344 * 9823353
			&& i_1002_ + i_1015_ < 639238427 * anInt9345
			&& i_1012_ < i_1006_) {
			int i_1016_
			    = i_1015_ * (356365251 * anInt9356) + i_1009_;
			int i_1017_ = anIntArray9338[i_1016_];
			i_1017_ = ((i_1014_ * (i_1017_ & 0xff00) >> 8 & 0xff00)
				   + (i_1014_ * (i_1017_ & 0xff00ff) >> 8
				      & 0xff00ff));
			anIntArray9338[i_1016_] = i_1017_ + i_1004_;
		    }
		    i_1015_++;
		    i_1012_ = ++i_1012_ % i_1011_;
		}
	    } else if (2 == i_1005_) {
		int i_1018_ = 0;
		while (i_1018_ < i_1003_) {
		    if (i_1002_ + i_1018_ >= anInt9344 * 9823353
			&& i_1018_ + i_1002_ < anInt9345 * 639238427
			&& i_1012_ < i_1006_) {
			int i_1019_
			    = anInt9356 * 356365251 * i_1018_ + i_1009_;
			int i_1020_ = anIntArray9338[i_1019_];
			int i_1021_ = i_1004_ + i_1020_;
			int i_1022_
			    = (i_1020_ & 0xff00ff) + (i_1004_ & 0xff00ff);
			i_1020_
			    = (i_1021_ - i_1022_ & 0x10000) + (i_1022_
							       & 0x1000100);
			anIntArray9338[i_1019_]
			    = i_1021_ - i_1020_ | i_1020_ - (i_1020_ >>> 8);
		    }
		    i_1018_++;
		    i_1012_ = ++i_1012_ % i_1011_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method15036(int i, int i_1023_, int i_1024_, int i_1025_, int i_1026_,
		     int i_1027_, int i_1028_, int i_1029_) {
	if (anIntArray9338 != null
	    && (i >= 1709859847 * anInt9365 && i < -1807368365 * anInt9343)) {
	    int i_1030_ = i_1023_ * (356365251 * anInt9356) + i;
	    int i_1031_ = i_1025_ >>> 24;
	    int i_1032_ = i_1027_ + i_1028_;
	    int i_1033_ = i_1029_ % i_1032_;
	    if (0 == i_1026_ || 1 == i_1026_ && i_1031_ == 255) {
		int i_1034_ = 0;
		while (i_1034_ < i_1024_) {
		    if (i_1034_ + i_1023_ >= 9823353 * anInt9344
			&& i_1034_ + i_1023_ < anInt9345 * 639238427
			&& i_1033_ < i_1027_)
			anIntArray9338[(i_1034_ * (356365251 * anInt9356)
					+ i_1030_)]
			    = i_1025_;
		    i_1034_++;
		    i_1033_ = ++i_1033_ % i_1032_;
		}
	    } else if (i_1026_ == 1) {
		i_1025_ = (((i_1025_ & 0xff00) * i_1031_ >> 8 & 0xff00)
			   + ((i_1025_ & 0xff00ff) * i_1031_ >> 8 & 0xff00ff)
			   + (i_1031_ << 24));
		int i_1035_ = 256 - i_1031_;
		int i_1036_ = 0;
		while (i_1036_ < i_1024_) {
		    if (i_1023_ + i_1036_ >= anInt9344 * 9823353
			&& i_1023_ + i_1036_ < 639238427 * anInt9345
			&& i_1033_ < i_1027_) {
			int i_1037_
			    = i_1036_ * (356365251 * anInt9356) + i_1030_;
			int i_1038_ = anIntArray9338[i_1037_];
			i_1038_ = ((i_1035_ * (i_1038_ & 0xff00) >> 8 & 0xff00)
				   + (i_1035_ * (i_1038_ & 0xff00ff) >> 8
				      & 0xff00ff));
			anIntArray9338[i_1037_] = i_1038_ + i_1025_;
		    }
		    i_1036_++;
		    i_1033_ = ++i_1033_ % i_1032_;
		}
	    } else if (2 == i_1026_) {
		int i_1039_ = 0;
		while (i_1039_ < i_1024_) {
		    if (i_1023_ + i_1039_ >= anInt9344 * 9823353
			&& i_1039_ + i_1023_ < anInt9345 * 639238427
			&& i_1033_ < i_1027_) {
			int i_1040_
			    = anInt9356 * 356365251 * i_1039_ + i_1030_;
			int i_1041_ = anIntArray9338[i_1040_];
			int i_1042_ = i_1025_ + i_1041_;
			int i_1043_
			    = (i_1041_ & 0xff00ff) + (i_1025_ & 0xff00ff);
			i_1041_
			    = (i_1042_ - i_1043_ & 0x10000) + (i_1043_
							       & 0x1000100);
			anIntArray9338[i_1040_]
			    = i_1042_ - i_1041_ | i_1041_ - (i_1041_ >>> 8);
		    }
		    i_1039_++;
		    i_1033_ = ++i_1033_ % i_1032_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method15037(int i, int i_1044_, int i_1045_, int i_1046_, int i_1047_,
		     int i_1048_, int i_1049_, int i_1050_) {
	if (anIntArray9338 != null
	    && (i >= 1709859847 * anInt9365 && i < -1807368365 * anInt9343)) {
	    int i_1051_ = i_1044_ * (356365251 * anInt9356) + i;
	    int i_1052_ = i_1046_ >>> 24;
	    int i_1053_ = i_1048_ + i_1049_;
	    int i_1054_ = i_1050_ % i_1053_;
	    if (0 == i_1047_ || 1 == i_1047_ && i_1052_ == 255) {
		int i_1055_ = 0;
		while (i_1055_ < i_1045_) {
		    if (i_1055_ + i_1044_ >= 9823353 * anInt9344
			&& i_1055_ + i_1044_ < anInt9345 * 639238427
			&& i_1054_ < i_1048_)
			anIntArray9338[(i_1055_ * (356365251 * anInt9356)
					+ i_1051_)]
			    = i_1046_;
		    i_1055_++;
		    i_1054_ = ++i_1054_ % i_1053_;
		}
	    } else if (i_1047_ == 1) {
		i_1046_ = (((i_1046_ & 0xff00) * i_1052_ >> 8 & 0xff00)
			   + ((i_1046_ & 0xff00ff) * i_1052_ >> 8 & 0xff00ff)
			   + (i_1052_ << 24));
		int i_1056_ = 256 - i_1052_;
		int i_1057_ = 0;
		while (i_1057_ < i_1045_) {
		    if (i_1044_ + i_1057_ >= anInt9344 * 9823353
			&& i_1044_ + i_1057_ < 639238427 * anInt9345
			&& i_1054_ < i_1048_) {
			int i_1058_
			    = i_1057_ * (356365251 * anInt9356) + i_1051_;
			int i_1059_ = anIntArray9338[i_1058_];
			i_1059_ = ((i_1056_ * (i_1059_ & 0xff00) >> 8 & 0xff00)
				   + (i_1056_ * (i_1059_ & 0xff00ff) >> 8
				      & 0xff00ff));
			anIntArray9338[i_1058_] = i_1059_ + i_1046_;
		    }
		    i_1057_++;
		    i_1054_ = ++i_1054_ % i_1053_;
		}
	    } else if (2 == i_1047_) {
		int i_1060_ = 0;
		while (i_1060_ < i_1045_) {
		    if (i_1044_ + i_1060_ >= anInt9344 * 9823353
			&& i_1060_ + i_1044_ < anInt9345 * 639238427
			&& i_1054_ < i_1048_) {
			int i_1061_
			    = anInt9356 * 356365251 * i_1060_ + i_1051_;
			int i_1062_ = anIntArray9338[i_1061_];
			int i_1063_ = i_1046_ + i_1062_;
			int i_1064_
			    = (i_1062_ & 0xff00ff) + (i_1046_ & 0xff00ff);
			i_1062_
			    = (i_1063_ - i_1064_ & 0x10000) + (i_1064_
							       & 0x1000100);
			anIntArray9338[i_1061_]
			    = i_1063_ - i_1062_ | i_1062_ - (i_1062_ >>> 8);
		    }
		    i_1060_++;
		    i_1054_ = ++i_1054_ % i_1053_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method3468(int i, int i_1065_, int i_1066_, int i_1067_,
			   int i_1068_, int i_1069_) {
	if (anIntArray9338 != null) {
	    i_1066_ -= i;
	    i_1067_ -= i_1065_;
	    if (i_1067_ == 0) {
		if (i_1066_ >= 0)
		    method3248(i, i_1065_, i_1066_ + 1, i_1068_, i_1069_);
		else
		    method3248(i_1066_ + i, i_1065_, 1 + -i_1066_, i_1068_,
			       i_1069_);
	    } else if (i_1066_ == 0) {
		if (i_1067_ >= 0)
		    method3680(i, i_1065_, i_1067_ + 1, i_1068_, i_1069_);
		else
		    method3680(i, i_1067_ + i_1065_, -i_1067_ + 1, i_1068_,
			       i_1069_);
	    } else {
		if (i_1067_ + i_1066_ < 0) {
		    i += i_1066_;
		    i_1066_ = -i_1066_;
		    i_1065_ += i_1067_;
		    i_1067_ = -i_1067_;
		}
		if (i_1066_ > i_1067_) {
		    i_1065_ <<= 16;
		    i_1065_ += 32768;
		    i_1067_ <<= 16;
		    int i_1070_ = (int) Math.floor(0.5 + ((double) i_1067_
							  / (double) i_1066_));
		    i_1066_ += i;
		    if (i < 1709859847 * anInt9365) {
			i_1065_ += (1709859847 * anInt9365 - i) * i_1070_;
			i = 1709859847 * anInt9365;
		    }
		    if (i_1066_ >= anInt9343 * -1807368365)
			i_1066_ = anInt9343 * -1807368365 - 1;
		    int i_1071_ = i_1068_ >>> 24;
		    if (i_1069_ == 0 || i_1069_ == 1 && 255 == i_1071_) {
			for (/**/; i <= i_1066_; i++) {
			    int i_1072_ = i_1065_ >> 16;
			    if (i_1072_ >= 9823353 * anInt9344
				&& i_1072_ < 639238427 * anInt9345)
				anIntArray9338[i + i_1072_ * (anInt9356
							      * 356365251)]
				    = i_1068_;
			    i_1065_ += i_1070_;
			}
		    } else if (i_1069_ == 1) {
			i_1068_
			    = ((i_1071_ << 24)
			       + ((i_1071_ * (i_1068_ & 0xff00) >> 8 & 0xff00)
				  + ((i_1068_ & 0xff00ff) * i_1071_ >> 8
				     & 0xff00ff)));
			int i_1073_ = 256 - i_1071_;
			for (/**/; i <= i_1066_; i++) {
			    int i_1074_ = i_1065_ >> 16;
			    if (i_1074_ >= 9823353 * anInt9344
				&& i_1074_ < anInt9345 * 639238427) {
				int i_1075_
				    = anInt9356 * 356365251 * i_1074_ + i;
				int i_1076_ = anIntArray9338[i_1075_];
				i_1076_
				    = ((i_1073_ * (i_1076_ & 0xff00) >> 8
					& 0xff00)
				       + ((i_1076_ & 0xff00ff) * i_1073_ >> 8
					  & 0xff00ff));
				anIntArray9338[i_1075_] = i_1068_ + i_1076_;
			    }
			    i_1065_ += i_1070_;
			}
		    } else if (i_1069_ == 2) {
			for (/**/; i <= i_1066_; i++) {
			    int i_1077_ = i_1065_ >> 16;
			    if (i_1077_ >= 9823353 * anInt9344
				&& i_1077_ < 639238427 * anInt9345) {
				int i_1078_
				    = i_1077_ * (anInt9356 * 356365251) + i;
				int i_1079_ = anIntArray9338[i_1078_];
				int i_1080_ = i_1079_ + i_1068_;
				int i_1081_ = ((i_1079_ & 0xff00ff)
					       + (i_1068_ & 0xff00ff));
				i_1079_ = ((i_1080_ - i_1081_ & 0x10000)
					   + (i_1081_ & 0x1000100));
				anIntArray9338[i_1078_]
				    = i_1080_ - i_1079_ | i_1079_ - (i_1079_
								     >>> 8);
			    }
			    i_1065_ += i_1070_;
			}
		    } else
			throw new IllegalArgumentException();
		} else {
		    i <<= 16;
		    i += 32768;
		    i_1066_ <<= 16;
		    int i_1082_ = (int) Math.floor(0.5 + ((double) i_1066_
							  / (double) i_1067_));
		    i_1067_ += i_1065_;
		    if (i_1065_ < 9823353 * anInt9344) {
			i += (9823353 * anInt9344 - i_1065_) * i_1082_;
			i_1065_ = 9823353 * anInt9344;
		    }
		    if (i_1067_ >= 639238427 * anInt9345)
			i_1067_ = 639238427 * anInt9345 - 1;
		    int i_1083_ = i_1068_ >>> 24;
		    if (i_1069_ == 0 || i_1069_ == 1 && i_1083_ == 255) {
			for (/**/; i_1065_ <= i_1067_; i_1065_++) {
			    int i_1084_ = i >> 16;
			    if (i_1084_ >= anInt9365 * 1709859847
				&& i_1084_ < -1807368365 * anInt9343)
				anIntArray9338[i_1084_ + (356365251 * anInt9356
							  * i_1065_)]
				    = i_1068_;
			    i += i_1082_;
			}
		    } else if (i_1069_ == 1) {
			i_1068_
			    = (((i_1068_ & 0xff00ff) * i_1083_ >> 8 & 0xff00ff)
			       + (i_1083_ * (i_1068_ & 0xff00) >> 8 & 0xff00)
			       + (i_1083_ << 24));
			int i_1085_ = 256 - i_1083_;
			for (/**/; i_1065_ <= i_1067_; i_1065_++) {
			    int i_1086_ = i >> 16;
			    if (i_1086_ >= anInt9365 * 1709859847
				&& i_1086_ < anInt9343 * -1807368365) {
				int i_1087_
				    = (i_1086_
				       + i_1065_ * (anInt9356 * 356365251));
				int i_1088_ = anIntArray9338[i_1087_];
				i_1088_
				    = ((i_1085_ * (i_1088_ & 0xff00) >> 8
					& 0xff00)
				       + ((i_1088_ & 0xff00ff) * i_1085_ >> 8
					  & 0xff00ff));
				anIntArray9338[(i_1086_
						+ i_1065_ * (356365251
							     * anInt9356))]
				    = i_1068_ + i_1088_;
			    }
			    i += i_1082_;
			}
		    } else if (2 == i_1069_) {
			for (/**/; i_1065_ <= i_1067_; i_1065_++) {
			    int i_1089_ = i >> 16;
			    if (i_1089_ >= anInt9365 * 1709859847
				&& i_1089_ < anInt9343 * -1807368365) {
				int i_1090_ = (356365251 * anInt9356 * i_1065_
					       + i_1089_);
				int i_1091_ = anIntArray9338[i_1090_];
				int i_1092_ = i_1068_ + i_1091_;
				int i_1093_ = ((i_1068_ & 0xff00ff)
					       + (i_1091_ & 0xff00ff));
				i_1091_ = ((i_1093_ & 0x1000100)
					   + (i_1092_ - i_1093_ & 0x10000));
				anIntArray9338[i_1090_]
				    = i_1092_ - i_1091_ | i_1091_ - (i_1091_
								     >>> 8);
			    }
			    i += i_1082_;
			}
		    } else
			throw new IllegalArgumentException();
		}
	    }
	}
    }
    
    public void method3469(int i, int i_1094_, int i_1095_, int i_1096_,
			   int i_1097_, int i_1098_, int i_1099_, int i_1100_,
			   int i_1101_) {
	if (anIntArray9338 != null) {
	    i_1095_ -= i;
	    i_1096_ -= i_1094_;
	    if (0 == i_1096_) {
		if (i_1095_ >= 0)
		    method15006(i, i_1094_, 1 + i_1095_, i_1097_, i_1098_,
				i_1099_, i_1100_, i_1101_);
		else {
		    int i_1102_ = i_1100_ + i_1099_;
		    i_1101_ %= i_1102_;
		    i_1101_ = (i_1099_ + i_1102_ - i_1101_
			       - (1 + -i_1095_) % i_1102_);
		    i_1101_ %= i_1102_;
		    if (i_1101_ < 0)
			i_1101_ += i_1102_;
		    method15006(i + i_1095_, i_1094_, 1 + -i_1095_, i_1097_,
				i_1098_, i_1099_, i_1100_, i_1101_);
		}
	    } else if (0 == i_1095_) {
		if (i_1096_ >= 0)
		    method15027(i, i_1094_, i_1096_ + 1, i_1097_, i_1098_,
				i_1099_, i_1100_, i_1101_);
		else {
		    int i_1103_ = i_1100_ + i_1099_;
		    i_1101_ %= i_1103_;
		    i_1101_ = (i_1103_ + i_1099_ - i_1101_
			       - (1 + -i_1096_) % i_1103_);
		    i_1101_ %= i_1103_;
		    if (i_1101_ < 0)
			i_1101_ += i_1103_;
		    method15027(i, i_1094_ + i_1096_, -i_1096_ + 1, i_1097_,
				i_1098_, i_1099_, i_1100_, i_1101_);
		}
	    } else {
		i_1101_ <<= 8;
		i_1099_ <<= 8;
		i_1100_ <<= 8;
		int i_1104_ = i_1099_ + i_1100_;
		i_1101_ %= i_1104_;
		if (i_1095_ + i_1096_ < 0) {
		    int i_1105_
			= (int) (Math.sqrt((double) (i_1096_ * i_1096_
						     + i_1095_ * i_1095_))
				 * 256.0);
		    int i_1106_ = i_1105_ % i_1104_;
		    i_1101_ = i_1104_ + i_1099_ - i_1101_ - i_1106_;
		    i_1101_ %= i_1104_;
		    if (i_1101_ < 0)
			i_1101_ += i_1104_;
		    i += i_1095_;
		    i_1095_ = -i_1095_;
		    i_1094_ += i_1096_;
		    i_1096_ = -i_1096_;
		}
		if (i_1095_ > i_1096_) {
		    i_1094_ <<= 16;
		    i_1094_ += 32768;
		    i_1096_ <<= 16;
		    int i_1107_
			= (int) Math.floor((double) i_1096_ / (double) i_1095_
					   + 0.5);
		    i_1095_ += i;
		    int i_1108_ = i_1097_ >>> 24;
		    int i_1109_
			= (int) Math.sqrt((double) ((i_1107_ >> 8) * (i_1107_
								      >> 8)
						    + 65536));
		    if (0 == i_1098_ || i_1098_ == 1 && i_1108_ == 255) {
			while (i <= i_1095_) {
			    int i_1110_ = i_1094_ >> 16;
			    if (i >= anInt9365 * 1709859847
				&& i < anInt9343 * -1807368365
				&& i_1110_ >= 9823353 * anInt9344
				&& i_1110_ < anInt9345 * 639238427
				&& i_1101_ < i_1099_)
				anIntArray9338[i + (356365251 * anInt9356
						    * i_1110_)]
				    = i_1097_;
			    i_1094_ += i_1107_;
			    i++;
			    i_1101_ += i_1109_;
			    i_1101_ %= i_1104_;
			}
		    } else if (1 == i_1098_) {
			i_1097_ = ((i_1108_ * (i_1097_ & 0xff00) >> 8 & 0xff00)
				   + ((i_1097_ & 0xff00ff) * i_1108_ >> 8
				      & 0xff00ff)
				   + (i_1108_ << 24));
			int i_1111_ = 256 - i_1108_;
			while (i <= i_1095_) {
			    int i_1112_ = i_1094_ >> 16;
			    if (i >= 1709859847 * anInt9365
				&& i < anInt9343 * -1807368365
				&& i_1112_ >= anInt9344 * 9823353
				&& i_1112_ < 639238427 * anInt9345
				&& i_1101_ < i_1099_) {
				int i_1113_
				    = i + i_1112_ * (anInt9356 * 356365251);
				int i_1114_ = anIntArray9338[i_1113_];
				i_1114_
				    = ((i_1111_ * (i_1114_ & 0xff00) >> 8
					& 0xff00)
				       + ((i_1114_ & 0xff00ff) * i_1111_ >> 8
					  & 0xff00ff));
				anIntArray9338[i_1113_] = i_1097_ + i_1114_;
			    }
			    i_1094_ += i_1107_;
			    i++;
			    i_1101_ += i_1109_;
			    i_1101_ %= i_1104_;
			}
		    } else if (i_1098_ == 2) {
			while (i <= i_1095_) {
			    int i_1115_ = i_1094_ >> 16;
			    if (i >= 1709859847 * anInt9365
				&& i < -1807368365 * anInt9343
				&& i_1115_ >= anInt9344 * 9823353
				&& i_1115_ < 639238427 * anInt9345
				&& i_1101_ < i_1099_) {
				int i_1116_
				    = 356365251 * anInt9356 * i_1115_ + i;
				int i_1117_ = anIntArray9338[i_1116_];
				int i_1118_ = i_1097_ + i_1117_;
				int i_1119_ = ((i_1097_ & 0xff00ff)
					       + (i_1117_ & 0xff00ff));
				i_1117_ = ((i_1118_ - i_1119_ & 0x10000)
					   + (i_1119_ & 0x1000100));
				anIntArray9338[i_1116_]
				    = i_1118_ - i_1117_ | i_1117_ - (i_1117_
								     >>> 8);
			    }
			    i_1094_ += i_1107_;
			    i++;
			    i_1101_ += i_1109_;
			    i_1101_ %= i_1104_;
			}
		    } else
			throw new IllegalArgumentException();
		} else {
		    i <<= 16;
		    i += 32768;
		    i_1095_ <<= 16;
		    int i_1120_
			= (int) Math.floor((double) i_1095_ / (double) i_1096_
					   + 0.5);
		    i_1096_ += i_1094_;
		    int i_1121_ = i_1097_ >>> 24;
		    int i_1122_
			= (int) Math.sqrt((double) ((i_1120_ >> 8) * (i_1120_
								      >> 8)
						    + 65536));
		    if (0 == i_1098_ || 1 == i_1098_ && i_1121_ == 255) {
			while (i_1094_ <= i_1096_) {
			    int i_1123_ = i >> 16;
			    if (i_1094_ >= 9823353 * anInt9344
				&& i_1094_ < 639238427 * anInt9345
				&& i_1123_ >= anInt9365 * 1709859847
				&& i_1123_ < anInt9343 * -1807368365
				&& i_1101_ < i_1099_)
				anIntArray9338[(i_1123_
						+ i_1094_ * (356365251
							     * anInt9356))]
				    = i_1097_;
			    i += i_1120_;
			    i_1094_++;
			    i_1101_ += i_1122_;
			    i_1101_ %= i_1104_;
			}
		    } else if (i_1098_ == 1) {
			i_1097_ = (((i_1097_ & 0xff00) * i_1121_ >> 8 & 0xff00)
				   + (i_1121_ * (i_1097_ & 0xff00ff) >> 8
				      & 0xff00ff)
				   + (i_1121_ << 24));
			int i_1124_ = 256 - i_1121_;
			while (i_1094_ <= i_1096_) {
			    int i_1125_ = i >> 16;
			    if (i_1094_ >= 9823353 * anInt9344
				&& i_1094_ < 639238427 * anInt9345
				&& i_1125_ >= 1709859847 * anInt9365
				&& i_1125_ < -1807368365 * anInt9343
				&& i_1101_ < i_1099_) {
				int i_1126_
				    = (i_1125_
				       + i_1094_ * (anInt9356 * 356365251));
				int i_1127_ = anIntArray9338[i_1126_];
				i_1127_
				    = (((i_1127_ & 0xff00) * i_1124_ >> 8
					& 0xff00)
				       + (i_1124_ * (i_1127_ & 0xff00ff) >> 8
					  & 0xff00ff));
				anIntArray9338[(i_1094_ * (356365251
							   * anInt9356)
						+ i_1125_)]
				    = i_1097_ + i_1127_;
			    }
			    i += i_1120_;
			    i_1094_++;
			    i_1101_ += i_1122_;
			    i_1101_ %= i_1104_;
			}
		    } else if (2 == i_1098_) {
			while (i_1094_ <= i_1096_) {
			    int i_1128_ = i >> 16;
			    if (i_1094_ >= 9823353 * anInt9344
				&& i_1094_ < 639238427 * anInt9345
				&& i_1128_ >= 1709859847 * anInt9365
				&& i_1128_ < -1807368365 * anInt9343
				&& i_1101_ < i_1099_) {
				int i_1129_
				    = (i_1128_
				       + 356365251 * anInt9356 * i_1094_);
				int i_1130_ = anIntArray9338[i_1129_];
				int i_1131_ = i_1097_ + i_1130_;
				int i_1132_ = ((i_1097_ & 0xff00ff)
					       + (i_1130_ & 0xff00ff));
				i_1130_ = ((i_1131_ - i_1132_ & 0x10000)
					   + (i_1132_ & 0x1000100));
				anIntArray9338[i_1129_]
				    = i_1131_ - i_1130_ | i_1130_ - (i_1130_
								     >>> 8);
			    }
			    i += i_1120_;
			    i_1094_++;
			    i_1101_ += i_1122_;
			    i_1101_ %= i_1104_;
			}
		    } else
			throw new IllegalArgumentException();
		}
	    }
	}
    }
    
    public void method3686(int i) {
	int i_1133_ = i - 1255617655 * anInt9336;
	for (Class534_Sub14 class534_sub14
		 = (Class534_Sub14) aClass203_9369.method3892(-2094075134);
	     class534_sub14 != null;
	     class534_sub14
		 = (Class534_Sub14) aClass203_9369.method3883((byte) 46)) {
	    if (class534_sub14.aBool10463) {
		class534_sub14.anInt10462 += i_1133_;
		int i_1134_ = class534_sub14.anInt10462 / 50;
		if (i_1134_ > 0) {
		    Class186 class186
			= aClass177_2012.method2931(class534_sub14.anInt10460,
						    (byte) 1);
		    float f = (float) (1264459495 * class186.anInt2046);
		    class534_sub14.method16149
			((int) ((float) class186.aByte2047
				* ((float) i_1133_ / 1000.0F) / 64.0F * f),
			 (int) (f * ((float) i_1133_ / 1000.0F
				     * (float) class186.aByte2048 / 64.0F)));
		    class534_sub14.anInt10462 -= 50 * i_1134_;
		}
		class534_sub14.aBool10463 = false;
	    }
	}
	anInt9336 = -382802617 * i;
	aClass203_9350.method3876(5, (byte) 0);
	aClass203_9369.method3876(5, (byte) 0);
    }
    
    public void method3471(int i, int i_1135_, int i_1136_, int i_1137_,
			   int i_1138_, int i_1139_, Class145 class145,
			   int i_1140_, int i_1141_, int i_1142_, int i_1143_,
			   int i_1144_) {
	if (null != anIntArray9338) {
	    Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
	    int[] is = class145_sub2.anIntArray9797;
	    int[] is_1145_ = class145_sub2.anIntArray9798;
	    int i_1146_ = (anInt9344 * 9823353 > i_1141_ ? anInt9344 * 9823353
			   : i_1141_);
	    int i_1147_ = (anInt9345 * 639238427 < i_1141_ + is.length
			   ? anInt9345 * 639238427 : is.length + i_1141_);
	    i_1144_ <<= 8;
	    i_1142_ <<= 8;
	    i_1143_ <<= 8;
	    int i_1148_ = i_1143_ + i_1142_;
	    i_1144_ %= i_1148_;
	    i_1136_ -= i;
	    i_1137_ -= i_1135_;
	    if (i_1137_ + i_1136_ < 0) {
		int i_1149_ = (int) (Math.sqrt((double) (i_1137_ * i_1137_
							 + i_1136_ * i_1136_))
				     * 256.0);
		int i_1150_ = i_1149_ % i_1148_;
		i_1144_ = i_1142_ + i_1148_ - i_1144_ - i_1150_;
		i_1144_ %= i_1148_;
		if (i_1144_ < 0)
		    i_1144_ += i_1148_;
		i += i_1136_;
		i_1136_ = -i_1136_;
		i_1135_ += i_1137_;
		i_1137_ = -i_1137_;
	    }
	    if (i_1136_ > i_1137_) {
		i_1135_ <<= 16;
		i_1135_ += 32768;
		i_1137_ <<= 16;
		int i_1151_
		    = (int) Math.floor((double) i_1137_ / (double) i_1136_
				       + 0.5);
		i_1136_ += i;
		int i_1152_ = i_1138_ >>> 24;
		int i_1153_
		    = (int) Math.sqrt((double) ((i_1151_ >> 8) * (i_1151_ >> 8)
						+ 65536));
		if (i_1139_ == 0 || 1 == i_1139_ && 255 == i_1152_) {
		    while (i <= i_1136_) {
			int i_1154_ = i_1135_ >> 16;
			int i_1155_ = i_1154_ - i_1141_;
			if (i >= 1709859847 * anInt9365
			    && i < anInt9343 * -1807368365
			    && i_1154_ >= i_1146_ && i_1154_ < i_1147_
			    && i_1144_ < i_1142_) {
			    int i_1156_ = i_1140_ + is[i_1155_];
			    if (i >= i_1156_
				&& i < is_1145_[i_1155_] + i_1156_)
				anIntArray9338[i + i_1154_ * (anInt9356
							      * 356365251)]
				    = i_1138_;
			}
			i_1135_ += i_1151_;
			i++;
			i_1144_ += i_1153_;
			i_1144_ %= i_1148_;
		    }
		} else if (1 == i_1139_) {
		    i_1138_
			= (((i_1138_ & 0xff00) * i_1152_ >> 8 & 0xff00)
			   + (i_1152_ * (i_1138_ & 0xff00ff) >> 8 & 0xff00ff)
			   + (i_1152_ << 24));
		    int i_1157_ = 256 - i_1152_;
		    while (i <= i_1136_) {
			int i_1158_ = i_1135_ >> 16;
			int i_1159_ = i_1158_ - i_1141_;
			if (i >= 1709859847 * anInt9365
			    && i < -1807368365 * anInt9343
			    && i_1158_ >= i_1146_ && i_1158_ < i_1147_
			    && i_1144_ < i_1142_) {
			    int i_1160_ = is[i_1159_] + i_1140_;
			    if (i >= i_1160_
				&& i < is_1145_[i_1159_] + i_1160_) {
				int i_1161_
				    = i + i_1158_ * (356365251 * anInt9356);
				int i_1162_ = anIntArray9338[i_1161_];
				i_1162_ = ((i_1157_ * (i_1162_ & 0xff00ff) >> 8
					    & 0xff00ff)
					   + (i_1157_ * (i_1162_ & 0xff00) >> 8
					      & 0xff00));
				anIntArray9338[i_1161_] = i_1162_ + i_1138_;
			    }
			}
			i_1135_ += i_1151_;
			i++;
			i_1144_ += i_1153_;
			i_1144_ %= i_1148_;
		    }
		} else if (i_1139_ == 2) {
		    while (i <= i_1136_) {
			int i_1163_ = i_1135_ >> 16;
			int i_1164_ = i_1163_ - i_1141_;
			if (i >= 1709859847 * anInt9365
			    && i < -1807368365 * anInt9343
			    && i_1163_ >= i_1146_ && i_1163_ < i_1147_
			    && i_1144_ < i_1142_) {
			    int i_1165_ = i_1140_ + is[i_1164_];
			    if (i >= i_1165_
				&& i < i_1165_ + is_1145_[i_1164_]) {
				int i_1166_
				    = i_1163_ * (anInt9356 * 356365251) + i;
				int i_1167_ = anIntArray9338[i_1166_];
				int i_1168_ = i_1138_ + i_1167_;
				int i_1169_ = ((i_1138_ & 0xff00ff)
					       + (i_1167_ & 0xff00ff));
				i_1167_ = ((i_1168_ - i_1169_ & 0x10000)
					   + (i_1169_ & 0x1000100));
				anIntArray9338[i_1166_]
				    = i_1168_ - i_1167_ | i_1167_ - (i_1167_
								     >>> 8);
			    }
			}
			i_1135_ += i_1151_;
			i++;
			i_1144_ += i_1153_;
			i_1144_ %= i_1148_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else {
		i <<= 16;
		i += 32768;
		i_1136_ <<= 16;
		int i_1170_
		    = (int) Math.floor((double) i_1136_ / (double) i_1137_
				       + 0.5);
		int i_1171_
		    = (int) Math.sqrt((double) (65536
						+ (i_1170_ >> 8) * (i_1170_
								    >> 8)));
		i_1137_ += i_1135_;
		int i_1172_ = i_1138_ >>> 24;
		if (i_1139_ == 0 || i_1139_ == 1 && i_1172_ == 255) {
		    while (i_1135_ <= i_1137_) {
			int i_1173_ = i >> 16;
			int i_1174_ = i_1135_ - i_1141_;
			if (i_1135_ >= i_1146_ && i_1135_ < i_1147_
			    && i_1173_ >= anInt9365 * 1709859847
			    && i_1173_ < anInt9343 * -1807368365
			    && i_1144_ < i_1142_
			    && i_1173_ >= i_1140_ + is[i_1174_]
			    && i_1173_ < is_1145_[i_1174_] + (i_1140_
							      + is[i_1174_]))
			    anIntArray9338[(356365251 * anInt9356 * i_1135_
					    + i_1173_)]
				= i_1138_;
			i += i_1170_;
			i_1135_++;
			i_1144_ += i_1171_;
			i_1144_ %= i_1148_;
		    }
		} else if (i_1139_ == 1) {
		    i_1138_
			= ((i_1172_ << 24)
			   + ((i_1172_ * (i_1138_ & 0xff00ff) >> 8 & 0xff00ff)
			      + (i_1172_ * (i_1138_ & 0xff00) >> 8 & 0xff00)));
		    int i_1175_ = 256 - i_1172_;
		    while (i_1135_ <= i_1137_) {
			int i_1176_ = i >> 16;
			int i_1177_ = i_1135_ - i_1141_;
			if (i_1135_ >= i_1146_ && i_1135_ < i_1147_
			    && i_1176_ >= anInt9365 * 1709859847
			    && i_1176_ < -1807368365 * anInt9343
			    && i_1144_ < i_1142_
			    && i_1176_ >= i_1140_ + is[i_1177_]
			    && (i_1176_
				< i_1140_ + is[i_1177_] + is_1145_[i_1177_])) {
			    int i_1178_
				= i_1176_ + i_1135_ * (356365251 * anInt9356);
			    int i_1179_ = anIntArray9338[i_1178_];
			    i_1179_ = ((i_1175_ * (i_1179_ & 0xff00ff) >> 8
					& 0xff00ff)
				       + (i_1175_ * (i_1179_ & 0xff00) >> 8
					  & 0xff00));
			    anIntArray9338[(anInt9356 * 356365251 * i_1135_
					    + i_1176_)]
				= i_1179_ + i_1138_;
			}
			i += i_1170_;
			i_1135_++;
			i_1144_ += i_1171_;
			i_1144_ %= i_1148_;
		    }
		} else if (i_1139_ == 2) {
		    while (i_1135_ <= i_1137_) {
			int i_1180_ = i >> 16;
			int i_1181_ = i_1135_ - i_1141_;
			if (i_1135_ >= i_1146_ && i_1135_ < i_1147_
			    && i_1180_ >= 1709859847 * anInt9365
			    && i_1180_ < anInt9343 * -1807368365
			    && i_1144_ < i_1142_
			    && i_1180_ >= is[i_1181_] + i_1140_
			    && i_1180_ < is_1145_[i_1181_] + (is[i_1181_]
							      + i_1140_)) {
			    int i_1182_
				= i_1180_ + 356365251 * anInt9356 * i_1135_;
			    int i_1183_ = anIntArray9338[i_1182_];
			    int i_1184_ = i_1183_ + i_1138_;
			    int i_1185_
				= (i_1183_ & 0xff00ff) + (i_1138_ & 0xff00ff);
			    i_1183_ = ((i_1184_ - i_1185_ & 0x10000)
				       + (i_1185_ & 0x1000100));
			    anIntArray9338[i_1182_]
				= i_1184_ - i_1183_ | i_1183_ - (i_1183_
								 >>> 8);
			}
			i += i_1170_;
			i_1135_++;
			i_1144_ += i_1171_;
			i_1144_ %= i_1148_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method3557() {
	if (aBool9337) {
	    Class54.method1212(true, false, -1250043882);
	    aBool9337 = false;
	}
	aBool9339 = true;
    }
    
    public void method3598(int i, int i_1186_, int i_1187_, int i_1188_,
			   int i_1189_, int i_1190_, int i_1191_) {
	if (anIntArray9338 != null) {
	    Class101 class101 = method15011(Thread.currentThread());
	    Class119 class119 = class101.aClass119_1233;
	    int i_1192_ = i_1187_ - i;
	    int i_1193_ = i_1188_ - i_1186_;
	    int i_1194_ = i_1192_ >= 0 ? i_1192_ : -i_1192_;
	    int i_1195_ = i_1193_ >= 0 ? i_1193_ : -i_1193_;
	    int i_1196_ = i_1194_;
	    if (i_1196_ < i_1195_)
		i_1196_ = i_1195_;
	    if (0 != i_1196_) {
		int i_1197_ = (i_1192_ << 16) / i_1196_;
		int i_1198_ = (i_1193_ << 16) / i_1196_;
		i_1192_ += i_1197_ >> 16;
		i_1193_ += i_1198_ >> 16;
		if (i_1198_ <= i_1197_)
		    i_1197_ = -i_1197_;
		else
		    i_1198_ = -i_1198_;
		int i_1199_ = i_1198_ * i_1190_ >> 17;
		int i_1200_ = 1 + i_1190_ * i_1198_ >> 17;
		int i_1201_ = i_1190_ * i_1197_ >> 17;
		int i_1202_ = 1 + i_1190_ * i_1197_ >> 17;
		i -= class119.method2136();
		i_1186_ -= class119.method2146();
		int i_1203_ = i_1199_ + i;
		int i_1204_ = i - i_1200_;
		int i_1205_ = i_1192_ + i - i_1200_;
		int i_1206_ = i_1192_ + i + i_1199_;
		int i_1207_ = i_1186_ + i_1201_;
		int i_1208_ = i_1186_ - i_1202_;
		int i_1209_ = i_1186_ + i_1193_ - i_1202_;
		int i_1210_ = i_1201_ + (i_1186_ + i_1193_);
		if (0 == i_1191_)
		    class119.anInt1447 = 0;
		else if (1 == i_1191_)
		    class119.anInt1447 = 255 - (i_1189_ >>> 24);
		else
		    throw new IllegalArgumentException();
		method3461(false);
		class119.aBool1422
		    = (i_1203_ < 0 || i_1203_ > class119.anInt1448
		       || i_1204_ < 0 || i_1204_ > class119.anInt1448
		       || i_1205_ < 0 || i_1205_ > class119.anInt1448);
		class119.method2137(true, false, false, (float) i_1207_,
				    (float) i_1208_, (float) i_1209_,
				    (float) i_1203_, (float) i_1204_,
				    (float) i_1205_, 100.0F, 100.0F, 100.0F,
				    i_1189_);
		class119.aBool1422
		    = (i_1203_ < 0 || i_1203_ > class119.anInt1448
		       || i_1205_ < 0 || i_1205_ > class119.anInt1448
		       || i_1206_ < 0 || i_1206_ > class119.anInt1448);
		class119.method2137(true, false, false, (float) i_1207_,
				    (float) i_1209_, (float) i_1210_,
				    (float) i_1203_, (float) i_1205_,
				    (float) i_1206_, 100.0F, 100.0F, 100.0F,
				    i_1189_);
		method3461(true);
	    }
	}
    }
    
    void method15038(boolean bool, int i, int i_1211_, float f, int i_1212_,
		     int i_1213_, int i_1214_) {
	if (anIntArray9338 != null) {
	    if (i_1212_ < 0)
		i_1212_ = -i_1212_;
	    int i_1215_ = i_1211_ - i_1212_;
	    if (i_1215_ < anInt9344 * 9823353)
		i_1215_ = 9823353 * anInt9344;
	    int i_1216_ = 1 + (i_1211_ + i_1212_);
	    if (i_1216_ > anInt9345 * 639238427)
		i_1216_ = 639238427 * anInt9345;
	    int i_1217_ = i_1215_;
	    int i_1218_ = i_1212_ * i_1212_;
	    int i_1219_ = 0;
	    int i_1220_ = i_1211_ - i_1217_;
	    int i_1221_ = i_1220_ * i_1220_;
	    int i_1222_ = i_1221_ - i_1220_;
	    if (i_1211_ > i_1216_)
		i_1211_ = i_1216_;
	    int i_1223_ = i_1213_ >>> 24;
	    if (0 == i_1214_ || 1 == i_1214_ && i_1223_ == 255) {
		while (i_1217_ < i_1211_) {
		    for (/**/; i_1222_ <= i_1218_ || i_1221_ <= i_1218_;
			 i_1222_ += i_1219_++ + i_1219_)
			i_1221_ += i_1219_ + i_1219_;
		    int i_1224_ = i - i_1219_ + 1;
		    if (i_1224_ < anInt9365 * 1709859847)
			i_1224_ = anInt9365 * 1709859847;
		    int i_1225_ = i + i_1219_;
		    if (i_1225_ > anInt9343 * -1807368365)
			i_1225_ = -1807368365 * anInt9343;
		    int i_1226_ = i_1217_ * (356365251 * anInt9356) + i_1224_;
		    for (int i_1227_ = i_1224_; i_1227_ < i_1225_; i_1227_++) {
			if (!bool || f < aFloatArray9341[i_1226_])
			    anIntArray9338[i_1226_] = i_1213_;
			i_1226_++;
		    }
		    i_1217_++;
		    i_1221_ -= i_1220_-- + i_1220_;
		    i_1222_ -= i_1220_ + i_1220_;
		}
		i_1219_ = i_1212_;
		i_1220_ = i_1217_ - i_1211_;
		i_1222_ = i_1218_ + i_1220_ * i_1220_;
		i_1221_ = i_1222_ - i_1219_;
		i_1222_ -= i_1220_;
		while (i_1217_ < i_1216_) {
		    for (/**/; i_1222_ > i_1218_ && i_1221_ > i_1218_;
			 i_1221_ -= i_1219_ + i_1219_)
			i_1222_ -= i_1219_-- + i_1219_;
		    int i_1228_ = i - i_1219_;
		    if (i_1228_ < 1709859847 * anInt9365)
			i_1228_ = 1709859847 * anInt9365;
		    int i_1229_ = i_1219_ + i;
		    if (i_1229_ > -1807368365 * anInt9343 - 1)
			i_1229_ = -1807368365 * anInt9343 - 1;
		    int i_1230_ = i_1217_ * (356365251 * anInt9356) + i_1228_;
		    for (int i_1231_ = i_1228_; i_1231_ <= i_1229_;
			 i_1231_++) {
			if (!bool || f < aFloatArray9341[i_1230_])
			    anIntArray9338[i_1230_] = i_1213_;
			i_1230_++;
		    }
		    i_1217_++;
		    i_1222_ += i_1220_ + i_1220_;
		    i_1221_ += i_1220_++ + i_1220_;
		}
	    } else if (i_1214_ == 1) {
		i_1213_
		    = ((i_1223_ << 24)
		       + ((i_1223_ * (i_1213_ & 0xff00) >> 8 & 0xff00)
			  + (i_1223_ * (i_1213_ & 0xff00ff) >> 8 & 0xff00ff)));
		int i_1232_ = 256 - i_1223_;
		while (i_1217_ < i_1211_) {
		    for (/**/; i_1222_ <= i_1218_ || i_1221_ <= i_1218_;
			 i_1222_ += i_1219_++ + i_1219_)
			i_1221_ += i_1219_ + i_1219_;
		    int i_1233_ = 1 + (i - i_1219_);
		    if (i_1233_ < anInt9365 * 1709859847)
			i_1233_ = anInt9365 * 1709859847;
		    int i_1234_ = i + i_1219_;
		    if (i_1234_ > -1807368365 * anInt9343)
			i_1234_ = anInt9343 * -1807368365;
		    int i_1235_ = 356365251 * anInt9356 * i_1217_ + i_1233_;
		    for (int i_1236_ = i_1233_; i_1236_ < i_1234_; i_1236_++) {
			if (!bool || f < aFloatArray9341[i_1235_]) {
			    int i_1237_ = anIntArray9338[i_1235_];
			    i_1237_
				= ((i_1232_ * (i_1237_ & 0xff00) >> 8 & 0xff00)
				   + (i_1232_ * (i_1237_ & 0xff00ff) >> 8
				      & 0xff00ff));
			    anIntArray9338[i_1235_] = i_1213_ + i_1237_;
			}
			i_1235_++;
		    }
		    i_1217_++;
		    i_1221_ -= i_1220_-- + i_1220_;
		    i_1222_ -= i_1220_ + i_1220_;
		}
		i_1219_ = i_1212_;
		i_1220_ = -i_1220_;
		i_1222_ = i_1220_ * i_1220_ + i_1218_;
		i_1221_ = i_1222_ - i_1219_;
		i_1222_ -= i_1220_;
		while (i_1217_ < i_1216_) {
		    for (/**/; i_1222_ > i_1218_ && i_1221_ > i_1218_;
			 i_1221_ -= i_1219_ + i_1219_)
			i_1222_ -= i_1219_-- + i_1219_;
		    int i_1238_ = i - i_1219_;
		    if (i_1238_ < anInt9365 * 1709859847)
			i_1238_ = anInt9365 * 1709859847;
		    int i_1239_ = i_1219_ + i;
		    if (i_1239_ > anInt9343 * -1807368365 - 1)
			i_1239_ = anInt9343 * -1807368365 - 1;
		    int i_1240_ = i_1238_ + anInt9356 * 356365251 * i_1217_;
		    for (int i_1241_ = i_1238_; i_1241_ <= i_1239_;
			 i_1241_++) {
			if (!bool || f < aFloatArray9341[i_1240_]) {
			    int i_1242_ = anIntArray9338[i_1240_];
			    i_1242_ = (((i_1242_ & 0xff00ff) * i_1232_ >> 8
					& 0xff00ff)
				       + ((i_1242_ & 0xff00) * i_1232_ >> 8
					  & 0xff00));
			    anIntArray9338[i_1240_] = i_1242_ + i_1213_;
			}
			i_1240_++;
		    }
		    i_1217_++;
		    i_1222_ += i_1220_ + i_1220_;
		    i_1221_ += i_1220_++ + i_1220_;
		}
	    } else if (i_1214_ == 2) {
		while (i_1217_ < i_1211_) {
		    for (/**/; i_1222_ <= i_1218_ || i_1221_ <= i_1218_;
			 i_1222_ += i_1219_++ + i_1219_)
			i_1221_ += i_1219_ + i_1219_;
		    int i_1243_ = 1 + (i - i_1219_);
		    if (i_1243_ < 1709859847 * anInt9365)
			i_1243_ = anInt9365 * 1709859847;
		    int i_1244_ = i_1219_ + i;
		    if (i_1244_ > anInt9343 * -1807368365)
			i_1244_ = -1807368365 * anInt9343;
		    int i_1245_ = i_1243_ + 356365251 * anInt9356 * i_1217_;
		    for (int i_1246_ = i_1243_; i_1246_ < i_1244_; i_1246_++) {
			if (!bool || f < aFloatArray9341[i_1245_]) {
			    int i_1247_ = anIntArray9338[i_1245_];
			    int i_1248_ = i_1213_ + i_1247_;
			    int i_1249_
				= (i_1247_ & 0xff00ff) + (i_1213_ & 0xff00ff);
			    i_1247_
				= (i_1249_ & 0x1000100) + (i_1248_ - i_1249_
							   & 0x10000);
			    anIntArray9338[i_1245_]
				= i_1248_ - i_1247_ | i_1247_ - (i_1247_
								 >>> 8);
			}
			i_1245_++;
		    }
		    i_1217_++;
		    i_1221_ -= i_1220_-- + i_1220_;
		    i_1222_ -= i_1220_ + i_1220_;
		}
		i_1219_ = i_1212_;
		i_1220_ = -i_1220_;
		i_1222_ = i_1218_ + i_1220_ * i_1220_;
		i_1221_ = i_1222_ - i_1219_;
		i_1222_ -= i_1220_;
		while (i_1217_ < i_1216_) {
		    for (/**/; i_1222_ > i_1218_ && i_1221_ > i_1218_;
			 i_1221_ -= i_1219_ + i_1219_)
			i_1222_ -= i_1219_-- + i_1219_;
		    int i_1250_ = i - i_1219_;
		    if (i_1250_ < 1709859847 * anInt9365)
			i_1250_ = anInt9365 * 1709859847;
		    int i_1251_ = i_1219_ + i;
		    if (i_1251_ > -1807368365 * anInt9343 - 1)
			i_1251_ = anInt9343 * -1807368365 - 1;
		    int i_1252_ = i_1217_ * (356365251 * anInt9356) + i_1250_;
		    for (int i_1253_ = i_1250_; i_1253_ <= i_1251_;
			 i_1253_++) {
			if (!bool || f < aFloatArray9341[i_1252_]) {
			    int i_1254_ = anIntArray9338[i_1252_];
			    int i_1255_ = i_1254_ + i_1213_;
			    int i_1256_
				= (i_1213_ & 0xff00ff) + (i_1254_ & 0xff00ff);
			    i_1254_ = ((i_1255_ - i_1256_ & 0x10000)
				       + (i_1256_ & 0x1000100));
			    anIntArray9338[i_1252_]
				= i_1255_ - i_1254_ | i_1254_ - (i_1254_
								 >>> 8);
			}
			i_1252_++;
		    }
		    i_1217_++;
		    i_1222_ += i_1220_ + i_1220_;
		    i_1221_ += i_1220_++ + i_1220_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method3566(float f, float f_1257_, float f_1258_, float[] fs) {
	float f_1259_ = (f * aClass433_9346.aFloatArray4853[3]
			 + aClass433_9346.aFloatArray4853[15]
			 + f_1257_ * aClass433_9346.aFloatArray4853[7]
			 + f_1258_ * aClass433_9346.aFloatArray4853[11]);
	float f_1260_ = (f_1258_ * aClass433_9346.aFloatArray4853[8]
			 + (f * aClass433_9346.aFloatArray4853[0]
			    + aClass433_9346.aFloatArray4853[12]
			    + aClass433_9346.aFloatArray4853[4] * f_1257_));
	float f_1261_ = (aClass433_9346.aFloatArray4853[5] * f_1257_
			 + (f * aClass433_9346.aFloatArray4853[1]
			    + aClass433_9346.aFloatArray4853[13])
			 + f_1258_ * aClass433_9346.aFloatArray4853[9]);
	float f_1262_ = (aClass433_9353.aFloatArray4853[10] * f_1258_
			 + (f_1257_ * aClass433_9353.aFloatArray4853[6]
			    + (aClass433_9353.aFloatArray4853[2] * f
			       + aClass433_9353.aFloatArray4853[14])));
	fs[0] = f_1260_ * aFloat9361 / f_1259_ + aFloat9342;
	fs[1] = aFloat9363 * f_1261_ / f_1259_ + aFloat9368;
	fs[2] = f_1262_;
    }
    
    public void method3565(int i, int i_1263_, float f, int i_1264_,
			   int i_1265_, float f_1266_, int i_1267_,
			   int i_1268_, float f_1269_, int i_1270_,
			   int i_1271_, int i_1272_, int i_1273_) {
	boolean bool = null != anIntArray9338;
	boolean bool_1274_ = null != aFloatArray9341;
	if (bool || bool_1274_) {
	    Class101 class101 = method15011(Thread.currentThread());
	    Class119 class119 = class101.aClass119_1233;
	    class119.aBool1423 = false;
	    i -= 1709859847 * anInt9365;
	    i_1264_ -= anInt9365 * 1709859847;
	    i_1267_ -= anInt9365 * 1709859847;
	    i_1263_ -= anInt9344 * 9823353;
	    i_1265_ -= 9823353 * anInt9344;
	    i_1268_ -= anInt9344 * 9823353;
	    class119.aBool1422
		= (i < 0 || i > class119.anInt1448 || i_1264_ < 0
		   || i_1264_ > class119.anInt1448 || i_1267_ < 0
		   || i_1267_ > class119.anInt1448);
	    int i_1275_ = i_1270_ >>> 24;
	    if (i_1273_ == 0 || 1 == i_1273_ && i_1275_ == 255) {
		class119.anInt1447 = 0;
		class119.aBool1424 = false;
		class119.method2141(bool, bool_1274_, false, (float) i_1263_,
				    (float) i_1265_, (float) i_1268_,
				    (float) i, (float) i_1264_,
				    (float) i_1267_, f, f_1266_, f_1269_,
				    i_1270_, i_1271_, i_1272_);
	    } else if (i_1273_ == 1) {
		class119.anInt1447 = 255 - i_1275_;
		class119.aBool1424 = false;
		class119.method2141(bool, bool_1274_, false, (float) i_1263_,
				    (float) i_1265_, (float) i_1268_,
				    (float) i, (float) i_1264_,
				    (float) i_1267_, f, f_1266_, f_1269_,
				    i_1270_, i_1271_, i_1272_);
	    } else if (i_1273_ == 2) {
		class119.anInt1447 = 128;
		class119.aBool1424 = true;
		class119.method2141(bool, bool_1274_, false, (float) i_1263_,
				    (float) i_1265_, (float) i_1268_,
				    (float) i, (float) i_1264_,
				    (float) i_1267_, f, f_1266_, f_1269_,
				    i_1270_, i_1271_, i_1272_);
	    } else
		throw new IllegalArgumentException();
	    class119.aBool1423 = true;
	}
    }
    
    public void method3348(int i, int i_1276_, int i_1277_, int i_1278_,
			   int i_1279_, int i_1280_, int i_1281_) {
	if (anIntArray9338 != null) {
	    Class101 class101 = method15011(Thread.currentThread());
	    Class119 class119 = class101.aClass119_1233;
	    int i_1282_ = i_1277_ - i;
	    int i_1283_ = i_1278_ - i_1276_;
	    int i_1284_ = i_1282_ >= 0 ? i_1282_ : -i_1282_;
	    int i_1285_ = i_1283_ >= 0 ? i_1283_ : -i_1283_;
	    int i_1286_ = i_1284_;
	    if (i_1286_ < i_1285_)
		i_1286_ = i_1285_;
	    if (0 != i_1286_) {
		int i_1287_ = (i_1282_ << 16) / i_1286_;
		int i_1288_ = (i_1283_ << 16) / i_1286_;
		i_1282_ += i_1287_ >> 16;
		i_1283_ += i_1288_ >> 16;
		if (i_1288_ <= i_1287_)
		    i_1287_ = -i_1287_;
		else
		    i_1288_ = -i_1288_;
		int i_1289_ = i_1288_ * i_1280_ >> 17;
		int i_1290_ = 1 + i_1280_ * i_1288_ >> 17;
		int i_1291_ = i_1280_ * i_1287_ >> 17;
		int i_1292_ = 1 + i_1280_ * i_1287_ >> 17;
		i -= class119.method2136();
		i_1276_ -= class119.method2146();
		int i_1293_ = i_1289_ + i;
		int i_1294_ = i - i_1290_;
		int i_1295_ = i_1282_ + i - i_1290_;
		int i_1296_ = i_1282_ + i + i_1289_;
		int i_1297_ = i_1276_ + i_1291_;
		int i_1298_ = i_1276_ - i_1292_;
		int i_1299_ = i_1276_ + i_1283_ - i_1292_;
		int i_1300_ = i_1291_ + (i_1276_ + i_1283_);
		if (0 == i_1281_)
		    class119.anInt1447 = 0;
		else if (1 == i_1281_)
		    class119.anInt1447 = 255 - (i_1279_ >>> 24);
		else
		    throw new IllegalArgumentException();
		method3461(false);
		class119.aBool1422
		    = (i_1293_ < 0 || i_1293_ > class119.anInt1448
		       || i_1294_ < 0 || i_1294_ > class119.anInt1448
		       || i_1295_ < 0 || i_1295_ > class119.anInt1448);
		class119.method2137(true, false, false, (float) i_1297_,
				    (float) i_1298_, (float) i_1299_,
				    (float) i_1293_, (float) i_1294_,
				    (float) i_1295_, 100.0F, 100.0F, 100.0F,
				    i_1279_);
		class119.aBool1422
		    = (i_1293_ < 0 || i_1293_ > class119.anInt1448
		       || i_1295_ < 0 || i_1295_ > class119.anInt1448
		       || i_1296_ < 0 || i_1296_ > class119.anInt1448);
		class119.method2137(true, false, false, (float) i_1297_,
				    (float) i_1299_, (float) i_1300_,
				    (float) i_1293_, (float) i_1295_,
				    (float) i_1296_, 100.0F, 100.0F, 100.0F,
				    i_1279_);
		method3461(true);
	    }
	}
    }
    
    public Class151 method3509(int i, int i_1301_, int[][] is,
			       int[][] is_1302_, int i_1303_, int i_1304_,
			       int i_1305_) {
	return new Class151_Sub3(this, i_1304_, i_1305_, i, i_1301_, is,
				 is_1302_, i_1303_);
    }
    
    public void method3648() {
	/* empty */
    }
    
    public boolean method3249() {
	return true;
    }
    
    public void method3531(int i, int i_1306_, int i_1307_, int i_1308_) {
	/* empty */
    }
    
    public void method3482(Class534_Sub2 class534_sub2) {
	/* empty */
    }
    
    public void method3483(Class534_Sub2 class534_sub2) {
	/* empty */
    }
    
    public Class163 method3602(int i, int i_1309_, boolean bool,
			       boolean bool_1310_) {
	if (bool)
	    return new Class163_Sub1_Sub1(this, i, i_1309_);
	return new Class163_Sub1_Sub3(this, i, i_1309_);
    }
    
    void method15039() {
	aClass433_9353.method6916(aClass446_9354);
	aClass433_9346.method6842(aClass433_9353);
	aClass433_9346.method6839(aClass433_9362);
	aClass433_9346.method6862(aFloatArrayArray9355[0]);
	aClass433_9346.method6858(aFloatArrayArray9355[1]);
	aClass433_9346.method6861(aFloatArrayArray9355[2]);
	aClass433_9346.method6949(aFloatArrayArray9355[3]);
	aClass433_9346.method6879(aFloatArrayArray9355[4]);
	aClass433_9346.method6945(aFloatArrayArray9355[5]);
	float f = aClass433_9362.method6907();
	float f_1311_ = (aClass433_9362.aFloatArray4853[14]
			 + aClass433_9362.aFloatArray4853[10] * (f - 255.0F));
	float f_1312_ = (aClass433_9362.aFloatArray4853[14]
			 + aClass433_9362.aFloatArray4853[10] * f);
	float f_1313_ = f_1312_ - f_1311_;
	for (int i = 0; i < 442227785 * anInt9367; i++) {
	    Class101 class101 = aClass101Array9335[i];
	    class101.aFloat1204 = f_1311_;
	    class101.aFloat1205 = f_1313_;
	}
    }
    
    public void method3439() {
	anInt9357 = 0;
	anInt9364 = 0;
	anInt9359 = anInt9356 * 910584147;
	anInt9360 = 1362504755 * anInt9340;
	method15005();
    }
    
    public Class446 method3532() {
	return new Class446(aClass446_9354);
    }
    
    public Class163 method3488(int i, int i_1314_, int i_1315_, int i_1316_,
			       boolean bool) {
	if (null == anIntArray9338)
	    throw new IllegalStateException("");
	int[] is = new int[i_1316_ * i_1315_];
	int i_1317_ = i + i_1314_ * (356365251 * anInt9356);
	int i_1318_ = 356365251 * anInt9356 - i_1315_;
	for (int i_1319_ = 0; i_1319_ < i_1316_; i_1319_++) {
	    int i_1320_ = i_1315_ * i_1319_;
	    for (int i_1321_ = 0; i_1321_ < i_1315_; i_1321_++)
		is[i_1321_ + i_1320_] = anIntArray9338[i_1317_++];
	    i_1317_ += i_1318_;
	}
	if (bool)
	    return new Class163_Sub1_Sub1(this, is, i_1315_, i_1316_);
	return new Class163_Sub1_Sub3(this, is, i_1315_, i_1316_);
    }
    
    public Class145 method3480(int i, int i_1322_, int[] is, int[] is_1323_) {
	return new Class145_Sub2(i, i_1322_, is, is_1323_);
    }
    
    public Class171 method3503(Class16 class16, Class169[] class169s,
			       boolean bool) {
	int[] is = new int[class169s.length];
	int[] is_1324_ = new int[class169s.length];
	boolean bool_1325_ = false;
	boolean bool_1326_ = false;
	for (int i = 0; i < class169s.length; i++) {
	    is[i] = class169s[i].method2762();
	    is_1324_[i] = class169s[i].method2763();
	    if (class169s[i].method2773())
		bool_1325_ = true;
	    if (class169s[i].method2760())
		bool_1326_ = true;
	}
	if (bool) {
	    if (bool_1326_) {
		if (bool_1325_)
		    return new Class171_Sub5(this, class16,
					     (Class169_Sub2[]) class169s, is,
					     is_1324_);
		return new Class171_Sub4(this, class16,
					 (Class169_Sub2[]) class169s, is,
					 is_1324_);
	    }
	    if (bool_1325_)
		return new Class171_Sub5(this, class16,
					 (Class169_Sub1[]) class169s, is,
					 is_1324_);
	    return new Class171_Sub4(this, class16,
				     (Class169_Sub1[]) class169s, is,
				     is_1324_);
	}
	if (bool_1326_) {
	    if (bool_1325_)
		throw new IllegalArgumentException("");
	    return new Class171_Sub6(this, class16,
				     (Class169_Sub2[]) class169s, is,
				     is_1324_);
	}
	return new Class171_Sub1(this, class16, (Class169_Sub1[]) class169s,
				 is, is_1324_);
    }
    
    public Class171 method3491(Class16 class16, Class169[] class169s,
			       boolean bool) {
	int[] is = new int[class169s.length];
	int[] is_1327_ = new int[class169s.length];
	boolean bool_1328_ = false;
	boolean bool_1329_ = false;
	for (int i = 0; i < class169s.length; i++) {
	    is[i] = class169s[i].method2762();
	    is_1327_[i] = class169s[i].method2763();
	    if (class169s[i].method2773())
		bool_1328_ = true;
	    if (class169s[i].method2760())
		bool_1329_ = true;
	}
	if (bool) {
	    if (bool_1329_) {
		if (bool_1328_)
		    return new Class171_Sub5(this, class16,
					     (Class169_Sub2[]) class169s, is,
					     is_1327_);
		return new Class171_Sub4(this, class16,
					 (Class169_Sub2[]) class169s, is,
					 is_1327_);
	    }
	    if (bool_1328_)
		return new Class171_Sub5(this, class16,
					 (Class169_Sub1[]) class169s, is,
					 is_1327_);
	    return new Class171_Sub4(this, class16,
				     (Class169_Sub1[]) class169s, is,
				     is_1327_);
	}
	if (bool_1329_) {
	    if (bool_1328_)
		throw new IllegalArgumentException("");
	    return new Class171_Sub6(this, class16,
				     (Class169_Sub2[]) class169s, is,
				     is_1327_);
	}
	return new Class171_Sub1(this, class16, (Class169_Sub1[]) class169s,
				 is, is_1327_);
    }
    
    public void method3492(int i) {
	Class183_Sub2.anInt9434 = Class183_Sub2.anInt9436 = i;
	if (442227785 * anInt9367 > 1)
	    throw new IllegalStateException();
	method15010(anInt9367 * 442227785);
	method15009(0);
    }
    
    void method15040(boolean bool, boolean bool_1330_, boolean bool_1331_,
		     Class536_Sub2_Sub1 class536_sub2_sub1, int i, int i_1332_,
		     float f, int i_1333_) {
	int i_1334_ = class536_sub2_sub1.anInt11498;
	int i_1335_ = i_1333_;
	i_1333_ <<= 1;
	if (-1 == i_1334_)
	    method15015(bool_1330_, i, i_1332_, f, i_1335_,
			class536_sub2_sub1.anInt11492, 1);
	else {
	    if (768495671 * anInt9372 != i_1334_) {
		Class163 class163
		    = (Class163) aClass203_9350.method3871((long) i_1334_);
		if (null == class163) {
		    Class186 class186
			= aClass177_2012.method2931(i_1334_, (byte) 1);
		    int[] is = method14994(i_1334_);
		    if (null != is) {
			int i_1336_ = class186.anInt2046 * 1264459495;
			class163 = method3317(is, 0, i_1336_, i_1336_, i_1336_,
					      (byte) -55);
			aClass203_9350.method3893(class163, (long) i_1334_);
		    } else
			return;
		}
		anInt9372 = 1860330887 * i_1334_;
		aClass163_9371 = class163;
	    }
	    i_1333_++;
	    ((Class163_Sub1) aClass163_9371).method14508
		(bool, bool_1330_, bool_1331_, i - i_1335_, i_1332_ - i_1335_,
		 f, i_1333_, i_1333_, 0, class536_sub2_sub1.anInt11492, 1, 1,
		 false);
	}
    }
    
    public int method3467(int i, int i_1337_) {
	i |= 0x20800;
	return i & i_1337_ ^ i_1337_;
    }
    
    public void method3683(int[] is) {
	is[0] = 356365251 * anInt9356;
	is[1] = anInt9340 * 446066493;
    }
    
    public void method3564() {
	for (int i = 0; i < aClass101Array9335.length; i++) {
	    aClass101Array9335[i].anInt1206
		= 323990625 * aClass101Array9335[i].anInt1207;
	    aClass101Array9335[i].aBool1245 = false;
	}
    }
    
    void method15041() {
	if (null != aFloatArray9341) {
	    if (1709859847 * anInt9365 == 0
		&& anInt9343 * -1807368365 == 356365251 * anInt9356
		&& 9823353 * anInt9344 == 0
		&& 639238427 * anInt9345 == 446066493 * anInt9340) {
		int i = aFloatArray9341.length;
		int i_1338_ = i - (i & 0x7);
		int i_1339_ = 0;
		while (i_1339_ < i_1338_) {
		    aFloatArray9341[i_1339_++] = 2.14748365E9F;
		    aFloatArray9341[i_1339_++] = 2.14748365E9F;
		    aFloatArray9341[i_1339_++] = 2.14748365E9F;
		    aFloatArray9341[i_1339_++] = 2.14748365E9F;
		    aFloatArray9341[i_1339_++] = 2.14748365E9F;
		    aFloatArray9341[i_1339_++] = 2.14748365E9F;
		    aFloatArray9341[i_1339_++] = 2.14748365E9F;
		    aFloatArray9341[i_1339_++] = 2.14748365E9F;
		}
		while (i_1339_ < i)
		    aFloatArray9341[i_1339_++] = 2.14748365E9F;
	    } else {
		int i = anInt9343 * -1807368365 - anInt9365 * 1709859847;
		int i_1340_ = 639238427 * anInt9345 - anInt9344 * 9823353;
		int i_1341_ = anInt9356 * 356365251 - i;
		int i_1342_ = (9823353 * anInt9344 * (356365251 * anInt9356)
			       + 1709859847 * anInt9365);
		int i_1343_ = i >> 3;
		int i_1344_ = i & 0x7;
		i = i_1342_ - 1;
		for (int i_1345_ = -i_1340_; i_1345_ < 0; i_1345_++) {
		    if (i_1343_ > 0) {
			int i_1346_ = i_1343_;
			do {
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			    aFloatArray9341[++i] = 2.14748365E9F;
			} while (--i_1346_ > 0);
		    }
		    if (i_1344_ > 0) {
			int i_1347_ = i_1344_;
			do
			    aFloatArray9341[++i] = 2.14748365E9F;
			while (--i_1347_ > 0);
		    }
		    i += i_1341_;
		}
	    }
	}
    }
    
    byte method15042(int i) {
	return aClass177_2012.method2931(i, (byte) 1).aByte2051;
    }
    
    public int method3499() {
	return 0;
    }
    
    public int method3500() {
	return 0;
    }
    
    public void method3507(Class446 class446) {
	aClass446_9354 = class446;
	method15050();
    }
    
    public void method3466(int[] is) {
	is[0] = anInt9365 * 1709859847;
	is[1] = 9823353 * anInt9344;
	is[2] = -1807368365 * anInt9343;
	is[3] = anInt9345 * 639238427;
    }
    
    public Class163 method3274(Class169 class169, boolean bool) {
	int i = class169.method2762();
	int i_1348_ = class169.method2763();
	Class163_Sub1 class163_sub1;
	if (bool && !class169.method2773() && class169.method2760()) {
	    Class169_Sub2 class169_sub2 = (Class169_Sub2) class169;
	    int[] is = new int[class169_sub2.anIntArray9794.length];
	    byte[] is_1349_ = new byte[i * i_1348_];
	    for (int i_1350_ = 0; i_1350_ < i_1348_; i_1350_++) {
		int i_1351_ = i * i_1350_;
		for (int i_1352_ = 0; i_1352_ < i; i_1352_++)
		    is_1349_[i_1351_ + i_1352_]
			= class169_sub2.aByteArray9796[i_1351_ + i_1352_];
	    }
	    for (int i_1353_ = 0;
		 i_1353_ < class169_sub2.anIntArray9794.length; i_1353_++)
		is[i_1353_] = class169_sub2.anIntArray9794[i_1353_];
	    class163_sub1
		= new Class163_Sub1_Sub2(this, is_1349_, is, i, i_1348_);
	} else {
	    int[] is = class169.method2766(false);
	    if (class169.method2773())
		class163_sub1 = new Class163_Sub1_Sub1(this, is, i, i_1348_);
	    else
		class163_sub1 = new Class163_Sub1_Sub3(this, is, i, i_1348_);
	}
	class163_sub1.method2645(class169.method2764(), class169.method2781(),
				 class169.method2765(), class169.method2767());
	return class163_sub1;
    }
    
    public void method3328(int i) {
	Class183_Sub2.anInt9434 = Class183_Sub2.anInt9436 = i;
	if (442227785 * anInt9367 > 1)
	    throw new IllegalStateException();
	method15010(anInt9367 * 442227785);
	method15009(0);
    }
    
    void method15043(int i) {
	anInt9367 = i * 258921977;
	aClass101Array9335 = new Class101[442227785 * anInt9367];
	for (int i_1354_ = 0; i_1354_ < anInt9367 * 442227785; i_1354_++)
	    aClass101Array9335[i_1354_] = new Class101(this);
    }
    
    void method15044(int i) {
	anInt9367 = i * 258921977;
	aClass101Array9335 = new Class101[442227785 * anInt9367];
	for (int i_1355_ = 0; i_1355_ < anInt9367 * 442227785; i_1355_++)
	    aClass101Array9335[i_1355_] = new Class101(this);
    }
    
    void method15045(int i) {
	anInt9367 = i * 258921977;
	aClass101Array9335 = new Class101[442227785 * anInt9367];
	for (int i_1356_ = 0; i_1356_ < anInt9367 * 442227785; i_1356_++)
	    aClass101Array9335[i_1356_] = new Class101(this);
    }
    
    public void method3361(float f, float f_1357_, float f_1358_, float[] fs) {
	float f_1359_ = (aClass433_9346.aFloatArray4853[14]
			 + aClass433_9346.aFloatArray4853[2] * f
			 + aClass433_9346.aFloatArray4853[6] * f_1357_
			 + aClass433_9346.aFloatArray4853[10] * f_1358_);
	float f_1360_ = (f_1357_ * aClass433_9346.aFloatArray4853[7]
			 + (aClass433_9346.aFloatArray4853[15]
			    + aClass433_9346.aFloatArray4853[3] * f)
			 + f_1358_ * aClass433_9346.aFloatArray4853[11]);
	if (f_1359_ < -f_1360_ || f_1359_ > f_1360_) {
	    float[] fs_1361_ = fs;
	    float[] fs_1362_ = fs;
	    fs[2] = Float.NaN;
	    fs_1362_[1] = Float.NaN;
	    fs_1361_[0] = Float.NaN;
	} else {
	    float f_1363_ = (aClass433_9346.aFloatArray4853[8] * f_1358_
			     + (f_1357_ * aClass433_9346.aFloatArray4853[4]
				+ (aClass433_9346.aFloatArray4853[12]
				   + aClass433_9346.aFloatArray4853[0] * f)));
	    if (f_1363_ < -f_1360_ || f_1363_ > f_1360_) {
		float[] fs_1364_ = fs;
		float[] fs_1365_ = fs;
		fs[2] = Float.NaN;
		fs_1365_[1] = Float.NaN;
		fs_1364_[0] = Float.NaN;
	    } else {
		float f_1366_ = (aClass433_9346.aFloatArray4853[9] * f_1358_
				 + (aClass433_9346.aFloatArray4853[5] * f_1357_
				    + (aClass433_9346.aFloatArray4853[1] * f
				       + aClass433_9346.aFloatArray4853[13])));
		if (f_1366_ < -f_1360_ || f_1366_ > f_1360_) {
		    float[] fs_1367_ = fs;
		    float[] fs_1368_ = fs;
		    fs[2] = Float.NaN;
		    fs_1368_[1] = Float.NaN;
		    fs_1367_[0] = Float.NaN;
		} else {
		    float f_1369_
			= (aClass433_9353.aFloatArray4853[10] * f_1358_
			   + (f_1357_ * aClass433_9353.aFloatArray4853[6]
			      + (aClass433_9353.aFloatArray4853[14]
				 + aClass433_9353.aFloatArray4853[2] * f)));
		    fs[0] = f_1363_ * aFloat9361 / f_1360_ + aFloat9342;
		    fs[1] = aFloat9368 + aFloat9363 * f_1366_ / f_1360_;
		    fs[2] = f_1369_;
		}
	    }
	}
    }
    
    Class101 method15046(Runnable runnable) {
	for (int i = 0; i < 442227785 * anInt9367; i++) {
	    if (runnable == aClass101Array9335[i].aRunnable1208)
		return aClass101Array9335[i];
	}
	return null;
    }
    
    public void method3505(Class174 class174) {
	method15012(anIntArray9338 != null, null != aFloatArray9341, false,
		    class174);
    }
    
    public Interface21 method3627(int i, int i_1370_, int i_1371_) {
	return new Class130(i, i_1370_);
    }
    
    public void method3589(int i, Class145 class145, int i_1372_,
			   int i_1373_) {
	if (null != anIntArray9338) {
	    Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
	    int[] is = class145_sub2.anIntArray9797;
	    int[] is_1374_ = class145_sub2.anIntArray9798;
	    int i_1375_;
	    if (anInt9345 * 639238427 < is.length + i_1373_)
		i_1375_ = anInt9345 * 639238427 - i_1373_;
	    else
		i_1375_ = is.length;
	    int i_1376_;
	    if (anInt9344 * 9823353 > i_1373_) {
		i_1376_ = anInt9344 * 9823353 - i_1373_;
		i_1373_ = anInt9344 * 9823353;
	    } else
		i_1376_ = 0;
	    if (i_1375_ - i_1376_ > 0) {
		int i_1377_ = i_1373_ * (356365251 * anInt9356);
		for (int i_1378_ = i_1376_; i_1378_ < i_1375_; i_1378_++) {
		    int i_1379_ = i_1372_ + is[i_1378_];
		    int i_1380_ = is_1374_[i_1378_];
		    if (anInt9365 * 1709859847 > i_1379_) {
			i_1380_ -= anInt9365 * 1709859847 - i_1379_;
			i_1379_ = anInt9365 * 1709859847;
		    }
		    if (-1807368365 * anInt9343 < i_1379_ + i_1380_)
			i_1380_ = anInt9343 * -1807368365 - i_1379_;
		    i_1379_ += i_1377_;
		    for (int i_1381_ = -i_1380_; i_1381_ < 0; i_1381_++)
			anIntArray9338[i_1379_++] = i;
		    i_1377_ += anInt9356 * 356365251;
		}
	    }
	}
    }
    
    public int method3524() {
	return -1;
    }
    
    void method15047(boolean bool, boolean bool_1382_, boolean bool_1383_,
		     int i, int i_1384_, float f, int i_1385_, int i_1386_,
		     short i_1387_, int i_1388_, int i_1389_, int i_1390_) {
	if (i_1385_ != 0 && 0 != i_1386_) {
	    if (i_1387_ != -1) {
		Class186 class186
		    = aClass177_2012.method2931(i_1387_, (byte) 1);
		if (!class186.aBool2072) {
		    if (i_1387_ != anInt9372 * 768495671) {
			Class163 class163
			    = ((Class163)
			       aClass203_9350.method3871((long) i_1387_));
			if (class163 == null) {
			    int[] is = method14994(i_1387_);
			    if (is == null)
				return;
			    int i_1391_ = class186.anInt2046 * 1264459495;
			    class163 = method3317(is, 0, i_1391_, i_1391_,
						  i_1391_, (byte) 52);
			    aClass203_9350.method3893(class163,
						      (long) i_1387_);
			}
			anInt9372 = 1860330887 * i_1387_;
			aClass163_9371 = class163;
		    }
		    ((Class163_Sub1) aClass163_9371).method14508
			(bool, bool_1382_, bool_1383_, i - i_1385_,
			 i_1384_ - i_1386_, f, i_1385_ << 1, i_1386_ << 1,
			 i_1389_, i_1388_, i_1390_, 1,
			 class186.aClass599_2064 != Class599.aClass599_7870);
		    return;
		}
	    }
	    method15015(bool_1382_, i, i_1384_, f, i_1385_, i_1388_, i_1390_);
	}
    }
    
    public int method3495(int i, int i_1392_) {
	i |= 0x20800;
	return i & i_1392_ ^ i_1392_;
    }
    
    public Class534_Sub21 method3272(int i, int i_1393_, int i_1394_,
				     int i_1395_, int i_1396_, float f) {
	return null;
    }
    
    boolean method15048(int i) {
	Class186 class186 = aClass177_2012.method2931(i, (byte) 1);
	return 0 != class186.aByte2073 || 0 != class186.aByte2053;
    }
    
    boolean method3477(int i, int i_1397_, int i_1398_, int i_1399_,
		       Class446 class446, Class432 class432) {
	Class433 class433 = method3518();
	class433.method6916(class446);
	class433.method6839(aClass433_9346);
	return class432.method6838(i, i_1397_, i_1398_, i_1399_, class433,
				   aFloat9342, aFloat9368, aFloat9361,
				   aFloat9363);
    }
    
    public Interface21 method3266(int i, int i_1400_, int i_1401_) {
	return new Class130(i, i_1400_);
    }
    
    public boolean method3630() {
	return false;
    }
    
    void method15049(boolean bool, boolean bool_1402_, boolean bool_1403_,
		     int i, int i_1404_, float f, int i_1405_, int i_1406_,
		     short i_1407_, int i_1408_, int i_1409_, int i_1410_) {
	if (i_1405_ != 0 && 0 != i_1406_) {
	    if (i_1407_ != -1) {
		Class186 class186
		    = aClass177_2012.method2931(i_1407_, (byte) 1);
		if (!class186.aBool2072) {
		    if (i_1407_ != anInt9372 * 768495671) {
			Class163 class163
			    = ((Class163)
			       aClass203_9350.method3871((long) i_1407_));
			if (class163 == null) {
			    int[] is = method14994(i_1407_);
			    if (is == null)
				return;
			    int i_1411_ = class186.anInt2046 * 1264459495;
			    class163 = method3317(is, 0, i_1411_, i_1411_,
						  i_1411_, (byte) 41);
			    aClass203_9350.method3893(class163,
						      (long) i_1407_);
			}
			anInt9372 = 1860330887 * i_1407_;
			aClass163_9371 = class163;
		    }
		    ((Class163_Sub1) aClass163_9371).method14508
			(bool, bool_1402_, bool_1403_, i - i_1405_,
			 i_1404_ - i_1406_, f, i_1405_ << 1, i_1406_ << 1,
			 i_1409_, i_1408_, i_1410_, 1,
			 class186.aClass599_2064 != Class599.aClass599_7870);
		    return;
		}
	    }
	    method15015(bool_1402_, i, i_1404_, f, i_1405_, i_1408_, i_1410_);
	}
    }
    
    public Class433 method3511() {
	return new Class433(aClass433_9362);
    }
    
    public Class175_Sub1 method3569() {
	return new Class175_Sub1_Sub3(this);
    }
    
    void method15050() {
	aClass433_9353.method6916(aClass446_9354);
	aClass433_9346.method6842(aClass433_9353);
	aClass433_9346.method6839(aClass433_9362);
	aClass433_9346.method6862(aFloatArrayArray9355[0]);
	aClass433_9346.method6858(aFloatArrayArray9355[1]);
	aClass433_9346.method6861(aFloatArrayArray9355[2]);
	aClass433_9346.method6949(aFloatArrayArray9355[3]);
	aClass433_9346.method6879(aFloatArrayArray9355[4]);
	aClass433_9346.method6945(aFloatArrayArray9355[5]);
	float f = aClass433_9362.method6907();
	float f_1412_ = (aClass433_9362.aFloatArray4853[14]
			 + aClass433_9362.aFloatArray4853[10] * (f - 255.0F));
	float f_1413_ = (aClass433_9362.aFloatArray4853[14]
			 + aClass433_9362.aFloatArray4853[10] * f);
	float f_1414_ = f_1413_ - f_1412_;
	for (int i = 0; i < 442227785 * anInt9367; i++) {
	    Class101 class101 = aClass101Array9335[i];
	    class101.aFloat1204 = f_1412_;
	    class101.aFloat1205 = f_1414_;
	}
    }
    
    public void method3341(int i, float f, float f_1415_, float f_1416_,
			   float f_1417_, float f_1418_) {
	anInt9370 = -1003903109 * (int) (65535.0F * f);
	anInt9358 = (int) (f_1415_ * 65535.0F) * 1376715797;
	float f_1419_
	    = (float) Math.sqrt((double) (f_1417_ * f_1417_ + f_1416_ * f_1416_
					  + f_1418_ * f_1418_));
	anInt9352 = (int) (f_1416_ * 65535.0F / f_1419_) * 305590569;
	anInt9347 = 632700789 * (int) (f_1417_ * 65535.0F / f_1419_);
	anInt9348 = -86524913 * (int) (f_1418_ * 65535.0F / f_1419_);
    }
    
    public Class433 method3515() {
	return new Class433(aClass433_9362);
    }
    
    public boolean method3269() {
	return false;
    }
    
    public boolean method3534() {
	return false;
    }
    
    public void method3681(float f) {
	anInt9351 = (int) (f * 65535.0F) * -178886367;
    }
    
    public void method3519(int i) {
	/* empty */
    }
    
    public void method3520(int i) {
	/* empty */
    }
    
    public Class171 method3325(Class16 class16, Class169[] class169s,
			       boolean bool) {
	int[] is = new int[class169s.length];
	int[] is_1420_ = new int[class169s.length];
	boolean bool_1421_ = false;
	boolean bool_1422_ = false;
	for (int i = 0; i < class169s.length; i++) {
	    is[i] = class169s[i].method2762();
	    is_1420_[i] = class169s[i].method2763();
	    if (class169s[i].method2773())
		bool_1421_ = true;
	    if (class169s[i].method2760())
		bool_1422_ = true;
	}
	if (bool) {
	    if (bool_1422_) {
		if (bool_1421_)
		    return new Class171_Sub5(this, class16,
					     (Class169_Sub2[]) class169s, is,
					     is_1420_);
		return new Class171_Sub4(this, class16,
					 (Class169_Sub2[]) class169s, is,
					 is_1420_);
	    }
	    if (bool_1421_)
		return new Class171_Sub5(this, class16,
					 (Class169_Sub1[]) class169s, is,
					 is_1420_);
	    return new Class171_Sub4(this, class16,
				     (Class169_Sub1[]) class169s, is,
				     is_1420_);
	}
	if (bool_1422_) {
	    if (bool_1421_)
		throw new IllegalArgumentException("");
	    return new Class171_Sub6(this, class16,
				     (Class169_Sub2[]) class169s, is,
				     is_1420_);
	}
	return new Class171_Sub1(this, class16, (Class169_Sub1[]) class169s,
				 is, is_1420_);
    }
    
    public void method3607(int i, int i_1423_, int i_1424_) {
	for (int i_1425_ = 0; i_1425_ < aClass101Array9335.length; i_1425_++) {
	    Class101 class101 = aClass101Array9335[i_1425_];
	    class101.anInt1206 = (i & 0xffffff) * -1382291633;
	    int i_1426_ = class101.anInt1206 * 1046269871 >>> 16 & 0xff;
	    if (i_1426_ < 2)
		i_1426_ = 2;
	    int i_1427_ = class101.anInt1206 * 1046269871 >> 8 & 0xff;
	    if (i_1427_ < 2)
		i_1427_ = 2;
	    int i_1428_ = 1046269871 * class101.anInt1206 & 0xff;
	    if (i_1428_ < 2)
		i_1428_ = 2;
	    class101.anInt1206
		= (i_1426_ << 16 | i_1427_ << 8 | i_1428_) * -1382291633;
	    if (i_1423_ < 0)
		class101.aBool1203 = false;
	    else
		class101.aBool1203 = true;
	}
    }
    
    public void method3321(float f, float f_1429_, float f_1430_,
			   float f_1431_, float f_1432_) {
	/* empty */
    }
    
    public void method3301(int i, int i_1433_, int i_1434_) {
	for (int i_1435_ = 0; i_1435_ < aClass101Array9335.length; i_1435_++) {
	    Class101 class101 = aClass101Array9335[i_1435_];
	    class101.anInt1206 = (i & 0xffffff) * -1382291633;
	    int i_1436_ = class101.anInt1206 * 1046269871 >>> 16 & 0xff;
	    if (i_1436_ < 2)
		i_1436_ = 2;
	    int i_1437_ = class101.anInt1206 * 1046269871 >> 8 & 0xff;
	    if (i_1437_ < 2)
		i_1437_ = 2;
	    int i_1438_ = 1046269871 * class101.anInt1206 & 0xff;
	    if (i_1438_ < 2)
		i_1438_ = 2;
	    class101.anInt1206
		= (i_1436_ << 16 | i_1437_ << 8 | i_1438_) * -1382291633;
	    if (i_1433_ < 0)
		class101.aBool1203 = false;
	    else
		class101.aBool1203 = true;
	}
    }
    
    public void method3545(float f, float f_1439_, float f_1440_,
			   float f_1441_, float f_1442_) {
	/* empty */
    }
    
    public boolean method3628() {
	return false;
    }
    
    public boolean method3270() {
	return true;
    }
    
    void method15051() {
	aClass433_9353.method6916(aClass446_9354);
	aClass433_9346.method6842(aClass433_9353);
	aClass433_9346.method6839(aClass433_9362);
	aClass433_9346.method6862(aFloatArrayArray9355[0]);
	aClass433_9346.method6858(aFloatArrayArray9355[1]);
	aClass433_9346.method6861(aFloatArrayArray9355[2]);
	aClass433_9346.method6949(aFloatArrayArray9355[3]);
	aClass433_9346.method6879(aFloatArrayArray9355[4]);
	aClass433_9346.method6945(aFloatArrayArray9355[5]);
	float f = aClass433_9362.method6907();
	float f_1443_ = (aClass433_9362.aFloatArray4853[14]
			 + aClass433_9362.aFloatArray4853[10] * (f - 255.0F));
	float f_1444_ = (aClass433_9362.aFloatArray4853[14]
			 + aClass433_9362.aFloatArray4853[10] * f);
	float f_1445_ = f_1444_ - f_1443_;
	for (int i = 0; i < 442227785 * anInt9367; i++) {
	    Class101 class101 = aClass101Array9335[i];
	    class101.aFloat1204 = f_1443_;
	    class101.aFloat1205 = f_1445_;
	}
    }
    
    public Class165 method3535(int i) {
	return null;
    }
    
    public Class165 method3486(Class165 class165, Class165 class165_1446_,
			       float f, Class165 class165_1447_) {
	return null;
    }
    
    void method3234(int i, int i_1448_) throws Exception_Sub7 {
	aClass175_Sub2_2013.method15476(i, i_1448_);
	if (null != anInterface25_1997)
	    anInterface25_1997.method33(-769690867);
    }
    
    public void method3508(Class446 class446) {
	aClass446_9354 = class446;
	method15050();
    }
    
    boolean method3478(int i, int i_1449_, int i_1450_, int i_1451_,
		       Class446 class446, Class432 class432) {
	Class433 class433 = method3518();
	class433.method6916(class446);
	class433.method6839(aClass433_9346);
	return class432.method6838(i, i_1449_, i_1450_, i_1451_, class433,
				   aFloat9342, aFloat9368, aFloat9361,
				   aFloat9363);
    }
    
    public void method3530(int i, int i_1452_, int i_1453_, int i_1454_) {
	/* empty */
    }
    
    public void method3527(Class165 class165) {
	/* empty */
    }
    
    public void method3674(int i, int i_1455_) {
	/* empty */
    }
    
    public void method3533(int i, int i_1456_) {
	/* empty */
    }
    
    public void method3380(int i, int i_1457_) {
	/* empty */
    }
    
    public void method3285(int i, int i_1458_) {
	/* empty */
    }
    
    public boolean method3536() {
	return false;
    }
    
    public boolean method3455() {
	return false;
    }
    
    public void method3538(Class534_Sub2 class534_sub2) {
	/* empty */
    }
    
    public boolean method3473() {
	return false;
    }
    
    void method3378(int i, int i_1459_, int i_1460_, int i_1461_,
		    int i_1462_) {
	if (null != anIntArray9338
	    && (i >= 1709859847 * anInt9365 && i < -1807368365 * anInt9343)) {
	    if (i_1459_ < 9823353 * anInt9344) {
		i_1460_ -= 9823353 * anInt9344 - i_1459_;
		i_1459_ = anInt9344 * 9823353;
	    }
	    if (i_1460_ + i_1459_ > 639238427 * anInt9345)
		i_1460_ = anInt9345 * 639238427 - i_1459_;
	    int i_1463_ = 356365251 * anInt9356 * i_1459_ + i;
	    int i_1464_ = i_1461_ >>> 24;
	    if (0 == i_1462_ || 1 == i_1462_ && i_1464_ == 255) {
		for (int i_1465_ = 0; i_1465_ < i_1460_; i_1465_++)
		    anIntArray9338[i_1463_ + 356365251 * anInt9356 * i_1465_]
			= i_1461_;
	    } else if (1 == i_1462_) {
		i_1461_ = ((i_1464_ * (i_1461_ & 0xff00) >> 8 & 0xff00)
			   + (i_1464_ * (i_1461_ & 0xff00ff) >> 8 & 0xff00ff)
			   + (i_1464_ << 24));
		int i_1466_ = 256 - i_1464_;
		for (int i_1467_ = 0; i_1467_ < i_1460_; i_1467_++) {
		    int i_1468_ = i_1467_ * (anInt9356 * 356365251) + i_1463_;
		    int i_1469_ = anIntArray9338[i_1468_];
		    i_1469_ = ((i_1466_ * (i_1469_ & 0xff00ff) >> 8 & 0xff00ff)
			       + (i_1466_ * (i_1469_ & 0xff00) >> 8 & 0xff00));
		    anIntArray9338[i_1468_] = i_1469_ + i_1461_;
		}
	    } else if (2 == i_1462_) {
		for (int i_1470_ = 0; i_1470_ < i_1460_; i_1470_++) {
		    int i_1471_ = i_1463_ + i_1470_ * (anInt9356 * 356365251);
		    int i_1472_ = anIntArray9338[i_1471_];
		    int i_1473_ = i_1461_ + i_1472_;
		    int i_1474_ = (i_1461_ & 0xff00ff) + (i_1472_ & 0xff00ff);
		    i_1472_ = (i_1473_ - i_1474_ & 0x10000) + (i_1474_
							       & 0x1000100);
		    anIntArray9338[i_1471_]
			= i_1473_ - i_1472_ | i_1472_ - (i_1472_ >>> 8);
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method15052(int i, int i_1475_, int[] is, float[] fs) {
	anInt9356 = i * -2095033109;
	anInt9340 = 1188716565 * i_1475_;
	anIntArray9338 = is;
	aFloatArray9341 = fs;
	for (int i_1476_ = 0; i_1476_ < anInt9367 * 442227785; i_1476_++)
	    aClass101Array9335[i_1476_].method1893(479328322);
	method3537();
	method3281();
    }
    
    public Class446 method3665() {
	Class101 class101 = method15011(Thread.currentThread());
	return class101.aClass446_1213;
    }
    
    public boolean method3400() {
	return true;
    }
    
    public void method3544(float f, float f_1477_, float f_1478_,
			   float f_1479_, float f_1480_) {
	/* empty */
    }
    
    public Class176 method3288() {
	return new Class176(0, "Pure Java", 1, "CPU", 0L, false);
    }
    
    public Class170 method3546(int[] is) {
	return null;
    }
    
    public boolean method3443() {
	return false;
    }
    
    public boolean method3358() {
	return false;
    }
    
    public Class183 method3493(Class187 class187, int i, int i_1481_,
			       int i_1482_, int i_1483_) {
	return new Class183_Sub2(this, class187, i, i_1482_, i_1483_, i_1481_);
    }
    
    public void method3231(int i, Class166 class166) {
	for (int i_1484_ = 0; i_1484_ < aClass101Array9335.length; i_1484_++) {
	    aClass101Array9335[i_1484_].anInt1207
		= aClass101Array9335[i_1484_].anInt1206 * 1410985889;
	    aClass101Array9335[i_1484_].anInt1209 = i * 995019623;
	    aClass101Array9335[i_1484_].anInt1206
		= class166.anInt1763 * 1215958923;
	    aClass101Array9335[i_1484_].anInt1210
		= class166.anInt1762 * -761479311;
	    aClass101Array9335[i_1484_].aBool1245 = true;
	}
    }
    
    public void method3523() {
	aClass175_Sub1_9374 = null;
	aClass163_9373 = null;
    }
    
    public void method3552() {
	/* empty */
    }
    
    public void method3412() {
	/* empty */
    }
    
    public boolean method3554() {
	return false;
    }
    
    void method3555(float f, float f_1485_, float f_1486_, float f_1487_,
		    float f_1488_, float f_1489_) {
	/* empty */
    }
    
    public void method3556(int i, Class166 class166) {
	for (int i_1490_ = 0; i_1490_ < aClass101Array9335.length; i_1490_++) {
	    aClass101Array9335[i_1490_].anInt1207
		= aClass101Array9335[i_1490_].anInt1206 * 1410985889;
	    aClass101Array9335[i_1490_].anInt1209 = i * 995019623;
	    aClass101Array9335[i_1490_].anInt1206
		= class166.anInt1763 * 1215958923;
	    aClass101Array9335[i_1490_].anInt1210
		= class166.anInt1762 * -761479311;
	    aClass101Array9335[i_1490_].aBool1245 = true;
	}
    }
    
    public void method3324(int i, Class145 class145, int i_1491_,
			   int i_1492_) {
	if (null != anIntArray9338) {
	    Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
	    int[] is = class145_sub2.anIntArray9797;
	    int[] is_1493_ = class145_sub2.anIntArray9798;
	    int i_1494_;
	    if (anInt9345 * 639238427 < is.length + i_1492_)
		i_1494_ = anInt9345 * 639238427 - i_1492_;
	    else
		i_1494_ = is.length;
	    int i_1495_;
	    if (anInt9344 * 9823353 > i_1492_) {
		i_1495_ = anInt9344 * 9823353 - i_1492_;
		i_1492_ = anInt9344 * 9823353;
	    } else
		i_1495_ = 0;
	    if (i_1494_ - i_1495_ > 0) {
		int i_1496_ = i_1492_ * (356365251 * anInt9356);
		for (int i_1497_ = i_1495_; i_1497_ < i_1494_; i_1497_++) {
		    int i_1498_ = i_1491_ + is[i_1497_];
		    int i_1499_ = is_1493_[i_1497_];
		    if (anInt9365 * 1709859847 > i_1498_) {
			i_1499_ -= anInt9365 * 1709859847 - i_1498_;
			i_1498_ = anInt9365 * 1709859847;
		    }
		    if (-1807368365 * anInt9343 < i_1498_ + i_1499_)
			i_1499_ = anInt9343 * -1807368365 - i_1498_;
		    i_1498_ += i_1496_;
		    for (int i_1500_ = -i_1499_; i_1500_ < 0; i_1500_++)
			anIntArray9338[i_1498_++] = i;
		    i_1496_ += anInt9356 * 356365251;
		}
	    }
	}
    }
    
    public void method3558(int i, Class166 class166) {
	Class101 class101 = method15011(Thread.currentThread());
	class101.anInt1209 = 995019623 * i;
	class101.anInt1206 = class166.anInt1763 * 1215958923;
	class101.anInt1210 = class166.anInt1762 * -761479311;
    }
    
    public void method3456(int i, Class166 class166) {
	Class101 class101 = method15011(Thread.currentThread());
	class101.anInt1209 = 995019623 * i;
	class101.anInt1206 = class166.anInt1763 * 1215958923;
	class101.anInt1210 = class166.anInt1762 * -761479311;
    }
    
    public void method3560(int i, Class166 class166) {
	Class101 class101 = method15011(Thread.currentThread());
	class101.anInt1209 = 995019623 * i;
	class101.anInt1206 = class166.anInt1763 * 1215958923;
	class101.anInt1210 = class166.anInt1762 * -761479311;
    }
    
    public void method3561(int i, Class166 class166) {
	Class101 class101 = method15011(Thread.currentThread());
	class101.anInt1209 = 995019623 * i;
	class101.anInt1206 = class166.anInt1763 * 1215958923;
	class101.anInt1210 = class166.anInt1762 * -761479311;
    }
    
    public void method3584(int i, Class166 class166) {
	Class101 class101 = method15011(Thread.currentThread());
	class101.anInt1209 = 995019623 * i;
	class101.anInt1206 = class166.anInt1763 * 1215958923;
	class101.anInt1210 = class166.anInt1762 * -761479311;
    }
    
    public void method3563() {
	for (int i = 0; i < aClass101Array9335.length; i++) {
	    aClass101Array9335[i].anInt1206
		= 323990625 * aClass101Array9335[i].anInt1207;
	    aClass101Array9335[i].aBool1245 = false;
	}
    }
    
    public Class446 method3497() {
	Class101 class101 = method15011(Thread.currentThread());
	return class101.aClass446_1213;
    }
    
    public boolean method3540() {
	return false;
    }
    
    public void method3632(int i, int i_1501_, int i_1502_, int i_1503_,
			   int i_1504_, int i_1505_) {
	if (anIntArray9338 != null) {
	    if (i < 1709859847 * anInt9365) {
		i_1502_ -= 1709859847 * anInt9365 - i;
		i = 1709859847 * anInt9365;
	    }
	    if (i_1501_ < 9823353 * anInt9344) {
		i_1503_ -= anInt9344 * 9823353 - i_1501_;
		i_1501_ = 9823353 * anInt9344;
	    }
	    if (i + i_1502_ > -1807368365 * anInt9343)
		i_1502_ = anInt9343 * -1807368365 - i;
	    if (i_1503_ + i_1501_ > 639238427 * anInt9345)
		i_1503_ = anInt9345 * 639238427 - i_1501_;
	    if (i_1502_ > 0 && i_1503_ > 0 && i <= -1807368365 * anInt9343
		&& i_1501_ <= anInt9345 * 639238427) {
		int i_1506_ = anInt9356 * 356365251 - i_1502_;
		int i_1507_ = i_1501_ * (anInt9356 * 356365251) + i;
		int i_1508_ = i_1504_ >>> 24;
		if (i_1505_ == 0 || 1 == i_1505_ && i_1508_ == 255) {
		    int i_1509_ = i_1502_ >> 3;
		    int i_1510_ = i_1502_ & 0x7;
		    i_1502_ = i_1507_ - 1;
		    for (int i_1511_ = -i_1503_; i_1511_ < 0; i_1511_++) {
			if (i_1509_ > 0) {
			    i = i_1509_;
			    do {
				anIntArray9338[++i_1502_] = i_1504_;
				anIntArray9338[++i_1502_] = i_1504_;
				anIntArray9338[++i_1502_] = i_1504_;
				anIntArray9338[++i_1502_] = i_1504_;
				anIntArray9338[++i_1502_] = i_1504_;
				anIntArray9338[++i_1502_] = i_1504_;
				anIntArray9338[++i_1502_] = i_1504_;
				anIntArray9338[++i_1502_] = i_1504_;
			    } while (--i > 0);
			}
			if (i_1510_ > 0) {
			    i = i_1510_;
			    do
				anIntArray9338[++i_1502_] = i_1504_;
			    while (--i > 0);
			}
			i_1502_ += i_1506_;
		    }
		} else if (1 == i_1505_) {
		    i_1504_
			= ((((i_1504_ & ~0xff00ff) >>> 8) * i_1508_
			    & ~0xff00ff)
			   + ((i_1504_ & 0xff00ff) * i_1508_ >> 8 & 0xff00ff));
		    int i_1512_ = 256 - i_1508_;
		    for (int i_1513_ = 0; i_1513_ < i_1503_; i_1513_++) {
			for (int i_1514_ = -i_1502_; i_1514_ < 0; i_1514_++) {
			    int i_1515_ = anIntArray9338[i_1507_];
			    i_1515_ = ((((i_1515_ & ~0xff00ff) >>> 8) * i_1512_
					& ~0xff00ff)
				       + (i_1512_ * (i_1515_ & 0xff00ff) >> 8
					  & 0xff00ff));
			    anIntArray9338[i_1507_++] = i_1515_ + i_1504_;
			}
			i_1507_ += i_1506_;
		    }
		} else if (i_1505_ == 2) {
		    for (int i_1516_ = 0; i_1516_ < i_1503_; i_1516_++) {
			for (int i_1517_ = -i_1502_; i_1517_ < 0; i_1517_++) {
			    int i_1518_ = anIntArray9338[i_1507_];
			    int i_1519_ = i_1504_ + i_1518_;
			    int i_1520_
				= (i_1518_ & 0xff00ff) + (i_1504_ & 0xff00ff);
			    i_1518_ = ((i_1519_ - i_1520_ & 0x10000)
				       + (i_1520_ & 0x1000100));
			    anIntArray9338[i_1507_++]
				= i_1519_ - i_1518_ | i_1518_ - (i_1518_
								 >>> 8);
			}
			i_1507_ += i_1506_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public String method3402() {
	return "";
    }
    
    public void method3568(float f, float f_1521_, float f_1522_, float[] fs) {
	float f_1523_ = (aClass433_9346.aFloatArray4853[14]
			 + aClass433_9346.aFloatArray4853[2] * f
			 + aClass433_9346.aFloatArray4853[6] * f_1521_
			 + aClass433_9346.aFloatArray4853[10] * f_1522_);
	float f_1524_ = (f_1521_ * aClass433_9346.aFloatArray4853[7]
			 + (aClass433_9346.aFloatArray4853[15]
			    + aClass433_9346.aFloatArray4853[3] * f)
			 + f_1522_ * aClass433_9346.aFloatArray4853[11]);
	if (f_1523_ < -f_1524_ || f_1523_ > f_1524_) {
	    float[] fs_1525_ = fs;
	    float[] fs_1526_ = fs;
	    fs[2] = Float.NaN;
	    fs_1526_[1] = Float.NaN;
	    fs_1525_[0] = Float.NaN;
	} else {
	    float f_1527_ = (aClass433_9346.aFloatArray4853[8] * f_1522_
			     + (f_1521_ * aClass433_9346.aFloatArray4853[4]
				+ (aClass433_9346.aFloatArray4853[12]
				   + aClass433_9346.aFloatArray4853[0] * f)));
	    if (f_1527_ < -f_1524_ || f_1527_ > f_1524_) {
		float[] fs_1528_ = fs;
		float[] fs_1529_ = fs;
		fs[2] = Float.NaN;
		fs_1529_[1] = Float.NaN;
		fs_1528_[0] = Float.NaN;
	    } else {
		float f_1530_ = (aClass433_9346.aFloatArray4853[9] * f_1522_
				 + (aClass433_9346.aFloatArray4853[5] * f_1521_
				    + (aClass433_9346.aFloatArray4853[1] * f
				       + aClass433_9346.aFloatArray4853[13])));
		if (f_1530_ < -f_1524_ || f_1530_ > f_1524_) {
		    float[] fs_1531_ = fs;
		    float[] fs_1532_ = fs;
		    fs[2] = Float.NaN;
		    fs_1532_[1] = Float.NaN;
		    fs_1531_[0] = Float.NaN;
		} else {
		    float f_1533_
			= (aClass433_9353.aFloatArray4853[10] * f_1522_
			   + (f_1521_ * aClass433_9353.aFloatArray4853[6]
			      + (aClass433_9353.aFloatArray4853[14]
				 + aClass433_9353.aFloatArray4853[2] * f)));
		    fs[0] = f_1527_ * aFloat9361 / f_1524_ + aFloat9342;
		    fs[1] = aFloat9368 + aFloat9363 * f_1530_ / f_1524_;
		    fs[2] = f_1533_;
		}
	    }
	}
    }
    
    public void method3235(boolean bool) {
	Class101 class101 = method15011(Thread.currentThread());
	class101.aBool1211 = bool;
    }
    
    public Class175_Sub1 method3570() {
	return new Class175_Sub1_Sub3(this);
    }
    
    Interface22 method15053(int i, int i_1534_) {
	return new Class115(i, i_1534_);
    }
    
    boolean method15054() {
	return aBool9339;
    }
    
    public Interface22 method3276(int i, int i_1535_, Class181 class181,
				  Class173 class173, int i_1536_) {
	return method15014(i, i_1535_);
    }
    
    public Interface21 method3572(int i, int i_1537_) {
	return new Class130(i, i_1537_);
    }
    
    public Interface21 method3573(int i, int i_1538_) {
	return new Class130(i, i_1538_);
    }
    
    public Interface21 method3624(int i, int i_1539_) {
	return new Class130(i, i_1539_);
    }
    
    public Class170 method3548(int[] is) {
	return null;
    }
    
    void method3634(int i, int i_1540_, int i_1541_, int i_1542_,
		    int i_1543_) {
	if (anIntArray9338 != null) {
	    if (i_1541_ < 0)
		i_1541_ = -i_1541_;
	    int i_1544_ = i_1540_ - i_1541_;
	    if (i_1544_ < anInt9344 * 9823353)
		i_1544_ = 9823353 * anInt9344;
	    int i_1545_ = i_1540_ + i_1541_ + 1;
	    if (i_1545_ > 639238427 * anInt9345)
		i_1545_ = 639238427 * anInt9345;
	    int i_1546_ = i_1544_;
	    int i_1547_ = i_1541_ * i_1541_;
	    int i_1548_ = 0;
	    int i_1549_ = i_1540_ - i_1546_;
	    int i_1550_ = i_1549_ * i_1549_;
	    int i_1551_ = i_1550_ - i_1549_;
	    if (i_1540_ > i_1545_)
		i_1540_ = i_1545_;
	    int i_1552_ = i_1542_ >>> 24;
	    if (0 == i_1543_ || 1 == i_1543_ && i_1552_ == 255) {
		while (i_1546_ < i_1540_) {
		    for (/**/; i_1551_ <= i_1547_ || i_1550_ <= i_1547_;
			 i_1551_ += i_1548_++ + i_1548_)
			i_1550_ += i_1548_ + i_1548_;
		    int i_1553_ = i - i_1548_ + 1;
		    if (i_1553_ < 1709859847 * anInt9365)
			i_1553_ = 1709859847 * anInt9365;
		    int i_1554_ = i_1548_ + i;
		    if (i_1554_ > anInt9343 * -1807368365)
			i_1554_ = anInt9343 * -1807368365;
		    int i_1555_ = i_1546_ * (356365251 * anInt9356) + i_1553_;
		    for (int i_1556_ = i_1553_; i_1556_ < i_1554_; i_1556_++)
			anIntArray9338[i_1555_++] = i_1542_;
		    i_1546_++;
		    i_1550_ -= i_1549_-- + i_1549_;
		    i_1551_ -= i_1549_ + i_1549_;
		}
		i_1548_ = i_1541_;
		i_1549_ = i_1546_ - i_1540_;
		i_1551_ = i_1547_ + i_1549_ * i_1549_;
		i_1550_ = i_1551_ - i_1548_;
		i_1551_ -= i_1549_;
		while (i_1546_ < i_1545_) {
		    for (/**/; i_1551_ > i_1547_ && i_1550_ > i_1547_;
			 i_1550_ -= i_1548_ + i_1548_)
			i_1551_ -= i_1548_-- + i_1548_;
		    int i_1557_ = i - i_1548_;
		    if (i_1557_ < anInt9365 * 1709859847)
			i_1557_ = 1709859847 * anInt9365;
		    int i_1558_ = i_1548_ + i;
		    if (i_1558_ > -1807368365 * anInt9343 - 1)
			i_1558_ = -1807368365 * anInt9343 - 1;
		    int i_1559_ = i_1557_ + anInt9356 * 356365251 * i_1546_;
		    for (int i_1560_ = i_1557_; i_1560_ <= i_1558_; i_1560_++)
			anIntArray9338[i_1559_++] = i_1542_;
		    i_1546_++;
		    i_1551_ += i_1549_ + i_1549_;
		    i_1550_ += i_1549_++ + i_1549_;
		}
	    } else if (i_1543_ == 1) {
		i_1542_ = ((i_1552_ << 24)
			   + ((i_1552_ * (i_1542_ & 0xff00ff) >> 8 & 0xff00ff)
			      + (i_1552_ * (i_1542_ & 0xff00) >> 8 & 0xff00)));
		int i_1561_ = 256 - i_1552_;
		while (i_1546_ < i_1540_) {
		    for (/**/; i_1551_ <= i_1547_ || i_1550_ <= i_1547_;
			 i_1551_ += i_1548_++ + i_1548_)
			i_1550_ += i_1548_ + i_1548_;
		    int i_1562_ = i - i_1548_ + 1;
		    if (i_1562_ < anInt9365 * 1709859847)
			i_1562_ = 1709859847 * anInt9365;
		    int i_1563_ = i_1548_ + i;
		    if (i_1563_ > -1807368365 * anInt9343)
			i_1563_ = -1807368365 * anInt9343;
		    int i_1564_ = i_1546_ * (anInt9356 * 356365251) + i_1562_;
		    for (int i_1565_ = i_1562_; i_1565_ < i_1563_; i_1565_++) {
			int i_1566_ = anIntArray9338[i_1564_];
			i_1566_ = ((i_1561_ * (i_1566_ & 0xff00) >> 8 & 0xff00)
				   + (i_1561_ * (i_1566_ & 0xff00ff) >> 8
				      & 0xff00ff));
			anIntArray9338[i_1564_++] = i_1566_ + i_1542_;
		    }
		    i_1546_++;
		    i_1550_ -= i_1549_-- + i_1549_;
		    i_1551_ -= i_1549_ + i_1549_;
		}
		i_1548_ = i_1541_;
		i_1549_ = -i_1549_;
		i_1551_ = i_1547_ + i_1549_ * i_1549_;
		i_1550_ = i_1551_ - i_1548_;
		i_1551_ -= i_1549_;
		while (i_1546_ < i_1545_) {
		    for (/**/; i_1551_ > i_1547_ && i_1550_ > i_1547_;
			 i_1550_ -= i_1548_ + i_1548_)
			i_1551_ -= i_1548_-- + i_1548_;
		    int i_1567_ = i - i_1548_;
		    if (i_1567_ < 1709859847 * anInt9365)
			i_1567_ = 1709859847 * anInt9365;
		    int i_1568_ = i_1548_ + i;
		    if (i_1568_ > anInt9343 * -1807368365 - 1)
			i_1568_ = -1807368365 * anInt9343 - 1;
		    int i_1569_ = i_1546_ * (anInt9356 * 356365251) + i_1567_;
		    for (int i_1570_ = i_1567_; i_1570_ <= i_1568_;
			 i_1570_++) {
			int i_1571_ = anIntArray9338[i_1569_];
			i_1571_ = ((i_1561_ * (i_1571_ & 0xff00) >> 8 & 0xff00)
				   + ((i_1571_ & 0xff00ff) * i_1561_ >> 8
				      & 0xff00ff));
			anIntArray9338[i_1569_++] = i_1571_ + i_1542_;
		    }
		    i_1546_++;
		    i_1551_ += i_1549_ + i_1549_;
		    i_1550_ += i_1549_++ + i_1549_;
		}
	    } else if (2 == i_1543_) {
		while (i_1546_ < i_1540_) {
		    for (/**/; i_1551_ <= i_1547_ || i_1550_ <= i_1547_;
			 i_1551_ += i_1548_++ + i_1548_)
			i_1550_ += i_1548_ + i_1548_;
		    int i_1572_ = i - i_1548_ + 1;
		    if (i_1572_ < anInt9365 * 1709859847)
			i_1572_ = 1709859847 * anInt9365;
		    int i_1573_ = i_1548_ + i;
		    if (i_1573_ > -1807368365 * anInt9343)
			i_1573_ = -1807368365 * anInt9343;
		    int i_1574_ = anInt9356 * 356365251 * i_1546_ + i_1572_;
		    for (int i_1575_ = i_1572_; i_1575_ < i_1573_; i_1575_++) {
			int i_1576_ = anIntArray9338[i_1574_];
			int i_1577_ = i_1576_ + i_1542_;
			int i_1578_
			    = (i_1576_ & 0xff00ff) + (i_1542_ & 0xff00ff);
			i_1576_
			    = (i_1577_ - i_1578_ & 0x10000) + (i_1578_
							       & 0x1000100);
			anIntArray9338[i_1574_++]
			    = i_1577_ - i_1576_ | i_1576_ - (i_1576_ >>> 8);
		    }
		    i_1546_++;
		    i_1550_ -= i_1549_-- + i_1549_;
		    i_1551_ -= i_1549_ + i_1549_;
		}
		i_1548_ = i_1541_;
		i_1549_ = -i_1549_;
		i_1551_ = i_1547_ + i_1549_ * i_1549_;
		i_1550_ = i_1551_ - i_1548_;
		i_1551_ -= i_1549_;
		while (i_1546_ < i_1545_) {
		    for (/**/; i_1551_ > i_1547_ && i_1550_ > i_1547_;
			 i_1550_ -= i_1548_ + i_1548_)
			i_1551_ -= i_1548_-- + i_1548_;
		    int i_1579_ = i - i_1548_;
		    if (i_1579_ < 1709859847 * anInt9365)
			i_1579_ = anInt9365 * 1709859847;
		    int i_1580_ = i_1548_ + i;
		    if (i_1580_ > -1807368365 * anInt9343 - 1)
			i_1580_ = -1807368365 * anInt9343 - 1;
		    int i_1581_ = i_1579_ + 356365251 * anInt9356 * i_1546_;
		    for (int i_1582_ = i_1579_; i_1582_ <= i_1580_;
			 i_1582_++) {
			int i_1583_ = anIntArray9338[i_1581_];
			int i_1584_ = i_1583_ + i_1542_;
			int i_1585_
			    = (i_1542_ & 0xff00ff) + (i_1583_ & 0xff00ff);
			i_1583_ = (i_1585_ & 0x1000100) + (i_1584_ - i_1585_
							   & 0x10000);
			anIntArray9338[i_1581_++]
			    = i_1584_ - i_1583_ | i_1583_ - (i_1583_ >>> 8);
		    }
		    i_1546_++;
		    i_1551_ += i_1549_ + i_1549_;
		    i_1550_ += i_1549_++ + i_1549_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method3580() {
	if (aBool9337) {
	    Class54.method1212(true, false, -1448651370);
	    aBool9337 = false;
	}
	aBool9339 = true;
    }
    
    public void method3479(Class446 class446, Class194 class194,
			   Class432 class432) {
	Class433 class433 = method3518();
	class433.method6916(class446);
	class433.method6839(aClass433_9346);
	class194.method3800(class432, aClass433_9362, class433, aFloat9342,
			    aFloat9368, aFloat9361, aFloat9363);
    }
    
    void method3582() {
	if (aBool9337) {
	    Class54.method1212(true, false, -2041832423);
	    aBool9337 = false;
	}
	aBool9339 = true;
    }
    
    public boolean method3583() {
	return true;
    }
    
    public boolean method3496() {
	return true;
    }
    
    public boolean method3585() {
	return true;
    }
    
    public long method3586(int i, int i_1586_) {
	return 0L;
    }
    
    public void method3528(int i, int i_1587_, int i_1588_, int i_1589_) {
	/* empty */
    }
    
    public void method3588(int i, Class145 class145, int i_1590_,
			   int i_1591_) {
	if (null != anIntArray9338) {
	    Class145_Sub2 class145_sub2 = (Class145_Sub2) class145;
	    int[] is = class145_sub2.anIntArray9797;
	    int[] is_1592_ = class145_sub2.anIntArray9798;
	    int i_1593_;
	    if (anInt9345 * 639238427 < is.length + i_1591_)
		i_1593_ = anInt9345 * 639238427 - i_1591_;
	    else
		i_1593_ = is.length;
	    int i_1594_;
	    if (anInt9344 * 9823353 > i_1591_) {
		i_1594_ = anInt9344 * 9823353 - i_1591_;
		i_1591_ = anInt9344 * 9823353;
	    } else
		i_1594_ = 0;
	    if (i_1593_ - i_1594_ > 0) {
		int i_1595_ = i_1591_ * (356365251 * anInt9356);
		for (int i_1596_ = i_1594_; i_1596_ < i_1593_; i_1596_++) {
		    int i_1597_ = i_1590_ + is[i_1596_];
		    int i_1598_ = is_1592_[i_1596_];
		    if (anInt9365 * 1709859847 > i_1597_) {
			i_1598_ -= anInt9365 * 1709859847 - i_1597_;
			i_1597_ = anInt9365 * 1709859847;
		    }
		    if (-1807368365 * anInt9343 < i_1597_ + i_1598_)
			i_1598_ = anInt9343 * -1807368365 - i_1597_;
		    i_1597_ += i_1595_;
		    for (int i_1599_ = -i_1598_; i_1599_ < 0; i_1599_++)
			anIntArray9338[i_1597_++] = i;
		    i_1595_ += anInt9356 * 356365251;
		}
	    }
	}
    }
    
    public int method3502() {
	return 0;
    }
    
    public int method3379(int i, int i_1600_) {
	return i | i_1600_;
    }
    
    public Class433 method3513() {
	return new Class433(aClass433_9362);
    }
    
    public Class433 method3336() {
	Class101 class101 = method15011(Thread.currentThread());
	return class101.aClass433_1212;
    }
    
    public Class170 method3605(int[] is) {
	return null;
    }
    
    public boolean method3333() {
	return false;
    }
    
    public void method3517(float f) {
	anInt9351 = (int) (f * 65535.0F) * -178886367;
    }
    
    public void method3596(boolean bool) {
	Class101 class101 = method15011(Thread.currentThread());
	class101.aBool1211 = bool;
    }
    
    public void method3574(int i, float f, float f_1601_, float f_1602_,
			   float f_1603_, float f_1604_) {
	anInt9370 = -1003903109 * (int) (65535.0F * f);
	anInt9358 = (int) (f_1601_ * 65535.0F) * 1376715797;
	float f_1605_
	    = (float) Math.sqrt((double) (f_1603_ * f_1603_ + f_1602_ * f_1602_
					  + f_1604_ * f_1604_));
	anInt9352 = (int) (f_1602_ * 65535.0F / f_1605_) * 305590569;
	anInt9347 = 632700789 * (int) (f_1603_ * 65535.0F / f_1605_);
	anInt9348 = -86524913 * (int) (f_1604_ * 65535.0F / f_1605_);
    }
    
    public void method3347(int i, float f, float f_1606_, float f_1607_,
			   float f_1608_, float f_1609_) {
	anInt9370 = -1003903109 * (int) (65535.0F * f);
	anInt9358 = (int) (f_1606_ * 65535.0F) * 1376715797;
	float f_1610_
	    = (float) Math.sqrt((double) (f_1608_ * f_1608_ + f_1607_ * f_1607_
					  + f_1609_ * f_1609_));
	anInt9352 = (int) (f_1607_ * 65535.0F / f_1610_) * 305590569;
	anInt9347 = 632700789 * (int) (f_1608_ * 65535.0F / f_1610_);
	anInt9348 = -86524913 * (int) (f_1609_ * 65535.0F / f_1610_);
    }
    
    public boolean method3599() {
	return false;
    }
    
    public void method3445(int i, int i_1611_, int i_1612_, int i_1613_) {
	if (i < 0)
	    i = 0;
	if (i_1611_ < 0)
	    i_1611_ = 0;
	if (i_1612_ > anInt9356 * 356365251)
	    i_1612_ = 356365251 * anInt9356;
	if (i_1613_ > anInt9340 * 446066493)
	    i_1613_ = anInt9340 * 446066493;
	anInt9365 = i * -1685075529;
	anInt9343 = -315695909 * i_1612_;
	anInt9344 = i_1611_ * 1960003017;
	anInt9345 = -217091821 * i_1613_;
	method15005();
    }
    
    public Class446 method3676() {
	return new Class446(aClass446_9354);
    }
    
    public Class446 method3257() {
	return new Class446(aClass446_9354);
    }
    
    public Class534_Sub21 method3626(int i, int i_1614_, int i_1615_,
				     int i_1616_, int i_1617_, float f) {
	return null;
    }
    
    public Class534_Sub21 method3679(int i, int i_1618_, int i_1619_,
				     int i_1620_, int i_1621_, float f) {
	return null;
    }
    
    void method15055(boolean bool, boolean bool_1622_, boolean bool_1623_,
		     int i, int i_1624_, float f, int i_1625_, int i_1626_,
		     short i_1627_, int i_1628_, int i_1629_, int i_1630_) {
	if (i_1625_ != 0 && 0 != i_1626_) {
	    if (i_1627_ != -1) {
		Class186 class186
		    = aClass177_2012.method2931(i_1627_, (byte) 1);
		if (!class186.aBool2072) {
		    if (i_1627_ != anInt9372 * 768495671) {
			Class163 class163
			    = ((Class163)
			       aClass203_9350.method3871((long) i_1627_));
			if (class163 == null) {
			    int[] is = method14994(i_1627_);
			    if (is == null)
				return;
			    int i_1631_ = class186.anInt2046 * 1264459495;
			    class163 = method3317(is, 0, i_1631_, i_1631_,
						  i_1631_, (byte) -103);
			    aClass203_9350.method3893(class163,
						      (long) i_1627_);
			}
			anInt9372 = 1860330887 * i_1627_;
			aClass163_9371 = class163;
		    }
		    ((Class163_Sub1) aClass163_9371).method14508
			(bool, bool_1622_, bool_1623_, i - i_1625_,
			 i_1624_ - i_1626_, f, i_1625_ << 1, i_1626_ << 1,
			 i_1629_, i_1628_, i_1630_, 1,
			 class186.aClass599_2064 != Class599.aClass599_7870);
		    return;
		}
	    }
	    method15015(bool_1622_, i, i_1624_, f, i_1625_, i_1628_, i_1630_);
	}
    }
    
    public boolean method3286() {
	return false;
    }
    
    public boolean method3682() {
	return false;
    }
}
