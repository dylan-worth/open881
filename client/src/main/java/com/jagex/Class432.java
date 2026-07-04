/* Class432 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class432
{
    public float aFloat4844;
    public float aFloat4845;
    static float[] aFloatArray4846 = new float[8];
    public float aFloat4847;
    public float aFloat4848;
    public float aFloat4849;
    public float aFloat4850;
    static float[] aFloatArray4851 = new float[8];
    static float[] aFloatArray4852 = new float[8];
    
    public boolean method6838(int i, int i_0_, int i_1_, int i_2_,
			      Class433 class433, float f, float f_3_,
			      float f_4_, float f_5_) {
	boolean bool = false;
	float f_6_ = 3.4028235E38F;
	float f_7_ = -3.4028235E38F;
	float f_8_ = 3.4028235E38F;
	float f_9_ = -3.4028235E38F;
	aFloatArray4846[0] = aFloat4847;
	aFloatArray4851[0] = aFloat4845;
	aFloatArray4852[0] = aFloat4844;
	aFloatArray4846[1] = aFloat4848;
	aFloatArray4851[1] = aFloat4845;
	aFloatArray4852[1] = aFloat4844;
	aFloatArray4846[2] = aFloat4847;
	aFloatArray4851[2] = aFloat4850;
	aFloatArray4852[2] = aFloat4844;
	aFloatArray4846[3] = aFloat4848;
	aFloatArray4851[3] = aFloat4850;
	aFloatArray4852[3] = aFloat4844;
	aFloatArray4846[4] = aFloat4847;
	aFloatArray4851[4] = aFloat4845;
	aFloatArray4852[4] = aFloat4849;
	aFloatArray4846[5] = aFloat4848;
	aFloatArray4851[5] = aFloat4845;
	aFloatArray4852[5] = aFloat4849;
	aFloatArray4846[6] = aFloat4847;
	aFloatArray4851[6] = aFloat4850;
	aFloatArray4852[6] = aFloat4849;
	aFloatArray4846[7] = aFloat4848;
	aFloatArray4851[7] = aFloat4850;
	aFloatArray4852[7] = aFloat4849;
	for (int i_10_ = 0; i_10_ < 8; i_10_++) {
	    float f_11_ = aFloatArray4846[i_10_];
	    float f_12_ = aFloatArray4851[i_10_];
	    float f_13_ = aFloatArray4852[i_10_];
	    float f_14_ = (class433.aFloatArray4853[2] * f_11_
			   + class433.aFloatArray4853[6] * f_12_
			   + class433.aFloatArray4853[10] * f_13_
			   + class433.aFloatArray4853[14]);
	    float f_15_ = (class433.aFloatArray4853[3] * f_11_
			   + class433.aFloatArray4853[7] * f_12_
			   + class433.aFloatArray4853[11] * f_13_
			   + class433.aFloatArray4853[15]);
	    if (f_14_ >= -f_15_) {
		float f_16_ = (class433.aFloatArray4853[0] * f_11_
			       + class433.aFloatArray4853[4] * f_12_
			       + class433.aFloatArray4853[8] * f_13_
			       + class433.aFloatArray4853[12]);
		float f_17_ = (class433.aFloatArray4853[1] * f_11_
			       + class433.aFloatArray4853[5] * f_12_
			       + class433.aFloatArray4853[9] * f_13_
			       + class433.aFloatArray4853[13]);
		float f_18_ = f + f_4_ * f_16_ / f_15_;
		float f_19_ = f_3_ + f_5_ * f_17_ / f_15_;
		if (f_18_ < f_6_)
		    f_6_ = f_18_;
		if (f_18_ > f_7_)
		    f_7_ = f_18_;
		if (f_19_ < f_8_)
		    f_8_ = f_19_;
		if (f_19_ > f_9_)
		    f_9_ = f_19_;
		bool = true;
	    }
	}
	int i_20_ = i + i_1_;
	int i_21_ = i_0_ + i_2_;
	if (bool && (float) i_20_ > f_6_ && (float) i < f_7_
	    && (float) i_21_ > f_8_ && (float) i_0_ < f_9_)
	    return true;
	return false;
    }
}
