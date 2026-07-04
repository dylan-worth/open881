/* Class453_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class453_Sub5 extends Class453
{
    Object method7400(Class150 class150) {
	if (class150.aClass493_1696 == Class493.aClass493_5451
	    || Class493.aClass493_5345 == class150.aClass493_1696)
	    return Integer.valueOf(-1);
	return class150.aClass493_1696.method8104((byte) 84);
    }
    
    Object method7395(Class150 class150, int i) {
	if (class150.aClass493_1696 == Class493.aClass493_5451
	    || Class493.aClass493_5345 == class150.aClass493_1696)
	    return Integer.valueOf(-1);
	return class150.aClass493_1696.method8104((byte) 2);
    }
    
    Class453_Sub5(Class649 class649, int i, boolean bool, boolean bool_0_) {
	super(class649, i, bool, bool_0_);
    }
    
    Object method7398(Class150 class150) {
	if (class150.aClass493_1696 == Class493.aClass493_5451
	    || Class493.aClass493_5345 == class150.aClass493_1696)
	    return Integer.valueOf(-1);
	return class150.aClass493_1696.method8104((byte) 94);
    }
    
    public static final void method16008(byte i) {
	int i_1_ = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub17_10759
		       .method17035((byte) 2);
	if (0 == i_1_) {
	    client.aClass512_11100.method8567(null, (byte) -76);
	    Class223.method4159(0, (byte) 1);
	} else if (1 == i_1_ || 3 == i_1_) {
	    Class655.method10854((byte) 0, (byte) 20);
	    Class223.method4159(512, (byte) 1);
	    if (client.aClass512_11100.method8424((byte) 111) != null)
		Class712.method14423(-1232579651);
	} else {
	    Class655.method10854((byte) (client.anInt11161 * 1373322351 - 4
					 & 0xff),
				 (byte) -37);
	    Class223.method4159(2, (byte) 1);
	}
	client.anInt11176 = -1097084975 * Class674.anInt8633;
    }
    
    static void method16009(int[] is, float[] fs, float[] fs_2_, int i,
			    int i_3_, int i_4_) {
	if (i < i_3_) {
	    int i_5_ = (i + i_3_) / 2;
	    int i_6_ = i;
	    int i_7_ = is[i_5_];
	    is[i_5_] = is[i_3_];
	    is[i_3_] = i_7_;
	    float f = fs[i_5_];
	    fs[i_5_] = fs[i_3_];
	    fs[i_3_] = f;
	    float f_8_ = fs_2_[i_5_];
	    fs_2_[i_5_] = fs_2_[i_3_];
	    fs_2_[i_3_] = f_8_;
	    int i_9_ = 9223372036854775807L == (long) i_7_ ? 0 : 1;
	    for (int i_10_ = i; i_10_ < i_3_; i_10_++) {
		if (is[i_10_] < (i_10_ & i_9_) + i_7_) {
		    int i_11_ = is[i_10_];
		    is[i_10_] = is[i_6_];
		    is[i_6_] = i_11_;
		    float f_12_ = fs[i_10_];
		    fs[i_10_] = fs[i_6_];
		    fs[i_6_] = f_12_;
		    float f_13_ = fs_2_[i_10_];
		    fs_2_[i_10_] = fs_2_[i_6_];
		    fs_2_[i_6_] = f_13_;
		    i_6_++;
		}
	    }
	    is[i_3_] = is[i_6_];
	    is[i_6_] = i_7_;
	    fs[i_3_] = fs[i_6_];
	    fs[i_6_] = f;
	    fs_2_[i_3_] = fs_2_[i_6_];
	    fs_2_[i_6_] = f_8_;
	    method16009(is, fs, fs_2_, i, i_6_ - 1, -1882703331);
	    method16009(is, fs, fs_2_, 1 + i_6_, i_3_, -1882703331);
	}
    }
    
    static boolean method16010(int i) {
	return Class677.method11142(Class700.aClass638_8806.aClass603_8311,
				    -213021928);
    }
}
