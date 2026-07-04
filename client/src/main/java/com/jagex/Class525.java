/* Class525 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class525
{
    static void method8735(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			   Class533 class533, float f, float f_4_, float f_5_,
			   float f_6_, float f_7_, byte[] is, int i_8_) {
	int i_9_ = i_0_ * i_1_;
	float[] fs = new float[i_9_];
	for (int i_10_ = 0; i_10_ < i_3_; i_10_++) {
	    int i_11_ = i_8_;
	    class533.method8882(i, i_0_, i_1_, i_2_, f / (float) i_0_,
				f_4_ / (float) i_1_, f_5_ / (float) i_2_,
				f_6_ * 127.0F, fs, 0);
	    for (int i_12_ = 0; i_12_ < i_9_; i_12_++) {
		is[i_11_] += fs[i_12_];
		i_11_++;
	    }
	    f *= 2.0F;
	    f_4_ *= 2.0F;
	    f_5_ *= 2.0F;
	    f_6_ *= f_7_;
	}
	int i_13_ = i_8_;
	for (int i_14_ = 0; i_14_ < i_9_; i_14_++) {
	    is[i_13_] = (byte) (is[i_13_] + 127);
	    i_13_++;
	}
    }
    
    static void method8736(int i, int i_15_, int i_16_, int i_17_, int i_18_,
			   Class533 class533, float f, float f_19_,
			   float f_20_, float f_21_, float f_22_, byte[] is,
			   int i_23_) {
	int i_24_ = i_15_ * i_16_;
	float[] fs = new float[i_24_];
	for (int i_25_ = 0; i_25_ < i_18_; i_25_++) {
	    int i_26_ = i_23_;
	    class533.method8882(i, i_15_, i_16_, i_17_, f / (float) i_15_,
				f_19_ / (float) i_16_, f_20_ / (float) i_17_,
				f_21_ * 127.0F, fs, 0);
	    for (int i_27_ = 0; i_27_ < i_24_; i_27_++) {
		is[i_26_] += fs[i_27_];
		i_26_++;
	    }
	    f *= 2.0F;
	    f_19_ *= 2.0F;
	    f_20_ *= 2.0F;
	    f_21_ *= f_22_;
	}
	int i_28_ = i_23_;
	for (int i_29_ = 0; i_29_ < i_24_; i_29_++) {
	    is[i_28_] = (byte) (is[i_28_] + 127);
	    i_28_++;
	}
    }
    
    public static byte[] method8737(int i, int i_30_, int i_31_, int i_32_,
				    Class533 class533, float f, float f_33_,
				    float f_34_, float f_35_, float f_36_) {
	byte[] is = new byte[i * i_30_ * i_31_];
	method8738(i, i_30_, i_31_, i_32_, class533, f, f_33_, f_34_, f_35_,
		   f_36_, is, 0);
	return is;
    }
    
    Class525() throws Throwable {
	throw new Error();
    }
    
    static void method8738(int i, int i_37_, int i_38_, int i_39_,
			   Class533 class533, float f, float f_40_,
			   float f_41_, float f_42_, float f_43_, byte[] is,
			   int i_44_) {
	for (int i_45_ = 0; i_45_ < i_38_; i_45_++) {
	    method8735(i_45_, i, i_37_, i_38_, i_39_, class533, f, f_40_,
		       f_41_, f_42_, f_43_, is, i_44_);
	    i_44_ += i * i_37_;
	}
    }
    
    static void method8739(int i, int i_46_, int i_47_, int i_48_, int i_49_,
			   Class533 class533, float f, float f_50_,
			   float f_51_, float f_52_, float f_53_, byte[] is,
			   int i_54_) {
	int i_55_ = i_46_ * i_47_;
	float[] fs = new float[i_55_];
	for (int i_56_ = 0; i_56_ < i_49_; i_56_++) {
	    int i_57_ = i_54_;
	    class533.method8882(i, i_46_, i_47_, i_48_, f / (float) i_46_,
				f_50_ / (float) i_47_, f_51_ / (float) i_48_,
				f_52_ * 127.0F, fs, 0);
	    for (int i_58_ = 0; i_58_ < i_55_; i_58_++) {
		is[i_57_] += fs[i_58_];
		i_57_++;
	    }
	    f *= 2.0F;
	    f_50_ *= 2.0F;
	    f_51_ *= 2.0F;
	    f_52_ *= f_53_;
	}
	int i_59_ = i_54_;
	for (int i_60_ = 0; i_60_ < i_55_; i_60_++) {
	    is[i_59_] = (byte) (is[i_59_] + 127);
	    i_59_++;
	}
    }
    
    static void method8740(int i, int i_61_, int i_62_, int i_63_, int i_64_,
			   Class533 class533, float f, float f_65_,
			   float f_66_, float f_67_, float f_68_, byte[] is,
			   int i_69_) {
	int i_70_ = i_61_ * i_62_;
	float[] fs = new float[i_70_];
	for (int i_71_ = 0; i_71_ < i_64_; i_71_++) {
	    int i_72_ = i_69_;
	    class533.method8882(i, i_61_, i_62_, i_63_, f / (float) i_61_,
				f_65_ / (float) i_62_, f_66_ / (float) i_63_,
				f_67_ * 127.0F, fs, 0);
	    for (int i_73_ = 0; i_73_ < i_70_; i_73_++) {
		is[i_72_] += fs[i_73_];
		i_72_++;
	    }
	    f *= 2.0F;
	    f_65_ *= 2.0F;
	    f_66_ *= 2.0F;
	    f_67_ *= f_68_;
	}
	int i_74_ = i_69_;
	for (int i_75_ = 0; i_75_ < i_70_; i_75_++) {
	    is[i_74_] = (byte) (is[i_74_] + 127);
	    i_74_++;
	}
    }
    
    public static byte[] method8741(int i, int i_76_, int i_77_, int i_78_,
				    Class533 class533, float f, float f_79_,
				    float f_80_, float f_81_, float f_82_) {
	byte[] is = new byte[i * i_76_ * i_77_];
	method8738(i, i_76_, i_77_, i_78_, class533, f, f_79_, f_80_, f_81_,
		   f_82_, is, 0);
	return is;
    }
}
