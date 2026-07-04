/* Class433 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Arrays;

public final class Class433
{
    public float[] aFloatArray4853;
    public static Class433 aClass433_4854 = new Class433();
    
    public void method6839(Class433 class433_0_) {
	float f = (aFloatArray4853[0] * class433_0_.aFloatArray4853[0]
		   + aFloatArray4853[1] * class433_0_.aFloatArray4853[4]
		   + aFloatArray4853[2] * class433_0_.aFloatArray4853[8]
		   + aFloatArray4853[3] * class433_0_.aFloatArray4853[12]);
	float f_1_ = (aFloatArray4853[0] * class433_0_.aFloatArray4853[1]
		      + aFloatArray4853[1] * class433_0_.aFloatArray4853[5]
		      + aFloatArray4853[2] * class433_0_.aFloatArray4853[9]
		      + aFloatArray4853[3] * class433_0_.aFloatArray4853[13]);
	float f_2_ = (aFloatArray4853[0] * class433_0_.aFloatArray4853[2]
		      + aFloatArray4853[1] * class433_0_.aFloatArray4853[6]
		      + aFloatArray4853[2] * class433_0_.aFloatArray4853[10]
		      + aFloatArray4853[3] * class433_0_.aFloatArray4853[14]);
	float f_3_ = (aFloatArray4853[0] * class433_0_.aFloatArray4853[3]
		      + aFloatArray4853[1] * class433_0_.aFloatArray4853[7]
		      + aFloatArray4853[2] * class433_0_.aFloatArray4853[11]
		      + aFloatArray4853[3] * class433_0_.aFloatArray4853[15]);
	float f_4_ = (aFloatArray4853[4] * class433_0_.aFloatArray4853[0]
		      + aFloatArray4853[5] * class433_0_.aFloatArray4853[4]
		      + aFloatArray4853[6] * class433_0_.aFloatArray4853[8]
		      + aFloatArray4853[7] * class433_0_.aFloatArray4853[12]);
	float f_5_ = (aFloatArray4853[4] * class433_0_.aFloatArray4853[1]
		      + aFloatArray4853[5] * class433_0_.aFloatArray4853[5]
		      + aFloatArray4853[6] * class433_0_.aFloatArray4853[9]
		      + aFloatArray4853[7] * class433_0_.aFloatArray4853[13]);
	float f_6_ = (aFloatArray4853[4] * class433_0_.aFloatArray4853[2]
		      + aFloatArray4853[5] * class433_0_.aFloatArray4853[6]
		      + aFloatArray4853[6] * class433_0_.aFloatArray4853[10]
		      + aFloatArray4853[7] * class433_0_.aFloatArray4853[14]);
	float f_7_ = (aFloatArray4853[4] * class433_0_.aFloatArray4853[3]
		      + aFloatArray4853[5] * class433_0_.aFloatArray4853[7]
		      + aFloatArray4853[6] * class433_0_.aFloatArray4853[11]
		      + aFloatArray4853[7] * class433_0_.aFloatArray4853[15]);
	float f_8_ = (aFloatArray4853[8] * class433_0_.aFloatArray4853[0]
		      + aFloatArray4853[9] * class433_0_.aFloatArray4853[4]
		      + aFloatArray4853[10] * class433_0_.aFloatArray4853[8]
		      + aFloatArray4853[11] * class433_0_.aFloatArray4853[12]);
	float f_9_ = (aFloatArray4853[8] * class433_0_.aFloatArray4853[1]
		      + aFloatArray4853[9] * class433_0_.aFloatArray4853[5]
		      + aFloatArray4853[10] * class433_0_.aFloatArray4853[9]
		      + aFloatArray4853[11] * class433_0_.aFloatArray4853[13]);
	float f_10_
	    = (aFloatArray4853[8] * class433_0_.aFloatArray4853[2]
	       + aFloatArray4853[9] * class433_0_.aFloatArray4853[6]
	       + aFloatArray4853[10] * class433_0_.aFloatArray4853[10]
	       + aFloatArray4853[11] * class433_0_.aFloatArray4853[14]);
	float f_11_
	    = (aFloatArray4853[8] * class433_0_.aFloatArray4853[3]
	       + aFloatArray4853[9] * class433_0_.aFloatArray4853[7]
	       + aFloatArray4853[10] * class433_0_.aFloatArray4853[11]
	       + aFloatArray4853[11] * class433_0_.aFloatArray4853[15]);
	float f_12_
	    = (aFloatArray4853[12] * class433_0_.aFloatArray4853[0]
	       + aFloatArray4853[13] * class433_0_.aFloatArray4853[4]
	       + aFloatArray4853[14] * class433_0_.aFloatArray4853[8]
	       + aFloatArray4853[15] * class433_0_.aFloatArray4853[12]);
	float f_13_
	    = (aFloatArray4853[12] * class433_0_.aFloatArray4853[1]
	       + aFloatArray4853[13] * class433_0_.aFloatArray4853[5]
	       + aFloatArray4853[14] * class433_0_.aFloatArray4853[9]
	       + aFloatArray4853[15] * class433_0_.aFloatArray4853[13]);
	float f_14_
	    = (aFloatArray4853[12] * class433_0_.aFloatArray4853[2]
	       + aFloatArray4853[13] * class433_0_.aFloatArray4853[6]
	       + aFloatArray4853[14] * class433_0_.aFloatArray4853[10]
	       + aFloatArray4853[15] * class433_0_.aFloatArray4853[14]);
	float f_15_
	    = (aFloatArray4853[12] * class433_0_.aFloatArray4853[3]
	       + aFloatArray4853[13] * class433_0_.aFloatArray4853[7]
	       + aFloatArray4853[14] * class433_0_.aFloatArray4853[11]
	       + aFloatArray4853[15] * class433_0_.aFloatArray4853[15]);
	aFloatArray4853[0] = f;
	aFloatArray4853[1] = f_1_;
	aFloatArray4853[2] = f_2_;
	aFloatArray4853[3] = f_3_;
	aFloatArray4853[4] = f_4_;
	aFloatArray4853[5] = f_5_;
	aFloatArray4853[6] = f_6_;
	aFloatArray4853[7] = f_7_;
	aFloatArray4853[8] = f_8_;
	aFloatArray4853[9] = f_9_;
	aFloatArray4853[10] = f_10_;
	aFloatArray4853[11] = f_11_;
	aFloatArray4853[12] = f_12_;
	aFloatArray4853[13] = f_13_;
	aFloatArray4853[14] = f_14_;
	aFloatArray4853[15] = f_15_;
    }
    
    public void method6840() {
	aFloatArray4853[0] = 1.0F;
	aFloatArray4853[1] = 0.0F;
	aFloatArray4853[2] = 0.0F;
	aFloatArray4853[3] = 0.0F;
	aFloatArray4853[4] = 0.0F;
	aFloatArray4853[5] = 1.0F;
	aFloatArray4853[6] = 0.0F;
	aFloatArray4853[7] = 0.0F;
	aFloatArray4853[8] = 0.0F;
	aFloatArray4853[9] = 0.0F;
	aFloatArray4853[10] = 1.0F;
	aFloatArray4853[11] = 0.0F;
	aFloatArray4853[12] = 0.0F;
	aFloatArray4853[13] = 0.0F;
	aFloatArray4853[14] = 0.0F;
	aFloatArray4853[15] = 1.0F;
    }
    
    public float[] method6841(float[] fs) {
	float f = aFloatArray4853[3] + aFloatArray4853[2];
	float f_16_ = aFloatArray4853[7] + aFloatArray4853[6];
	float f_17_ = aFloatArray4853[11] + aFloatArray4853[10];
	double d = Math.sqrt((double) (f * f + f_16_ * f_16_ + f_17_ * f_17_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_16_ / d);
	fs[2] = (float) ((double) f_17_ / d);
	fs[3] = (float) ((double) (aFloatArray4853[15] + aFloatArray4853[14])
			 / d);
	return fs;
    }
    
    public void method6842(Class433 class433_18_) {
	System.arraycopy(class433_18_.aFloatArray4853, 0, aFloatArray4853, 0,
			 16);
    }
    
    public void method6843(Class433 class433_19_) {
	System.arraycopy(class433_19_.aFloatArray4853, 0, aFloatArray4853, 0,
			 11);
	aFloatArray4853[3] = 0.0F;
	aFloatArray4853[7] = 0.0F;
	aFloatArray4853[11] = 0.0F;
	aFloatArray4853[12] = 0.0F;
	aFloatArray4853[13] = 0.0F;
	aFloatArray4853[14] = 0.0F;
	aFloatArray4853[15] = 1.0F;
    }
    
    public void method6844(Class433 class433_20_, Class433 class433_21_) {
	float f = ((class433_20_.aFloatArray4853[0]
		    * class433_21_.aFloatArray4853[0])
		   + (class433_20_.aFloatArray4853[1]
		      * class433_21_.aFloatArray4853[4])
		   + (class433_20_.aFloatArray4853[2]
		      * class433_21_.aFloatArray4853[8])
		   + (class433_20_.aFloatArray4853[3]
		      * class433_21_.aFloatArray4853[12]));
	float f_22_ = ((class433_20_.aFloatArray4853[0]
			* class433_21_.aFloatArray4853[1])
		       + (class433_20_.aFloatArray4853[1]
			  * class433_21_.aFloatArray4853[5])
		       + (class433_20_.aFloatArray4853[2]
			  * class433_21_.aFloatArray4853[9])
		       + (class433_20_.aFloatArray4853[3]
			  * class433_21_.aFloatArray4853[13]));
	float f_23_ = ((class433_20_.aFloatArray4853[0]
			* class433_21_.aFloatArray4853[2])
		       + (class433_20_.aFloatArray4853[1]
			  * class433_21_.aFloatArray4853[6])
		       + (class433_20_.aFloatArray4853[2]
			  * class433_21_.aFloatArray4853[10])
		       + (class433_20_.aFloatArray4853[3]
			  * class433_21_.aFloatArray4853[14]));
	float f_24_ = ((class433_20_.aFloatArray4853[0]
			* class433_21_.aFloatArray4853[3])
		       + (class433_20_.aFloatArray4853[1]
			  * class433_21_.aFloatArray4853[7])
		       + (class433_20_.aFloatArray4853[2]
			  * class433_21_.aFloatArray4853[11])
		       + (class433_20_.aFloatArray4853[3]
			  * class433_21_.aFloatArray4853[15]));
	float f_25_ = ((class433_20_.aFloatArray4853[4]
			* class433_21_.aFloatArray4853[0])
		       + (class433_20_.aFloatArray4853[5]
			  * class433_21_.aFloatArray4853[4])
		       + (class433_20_.aFloatArray4853[6]
			  * class433_21_.aFloatArray4853[8])
		       + (class433_20_.aFloatArray4853[7]
			  * class433_21_.aFloatArray4853[12]));
	float f_26_ = ((class433_20_.aFloatArray4853[4]
			* class433_21_.aFloatArray4853[1])
		       + (class433_20_.aFloatArray4853[5]
			  * class433_21_.aFloatArray4853[5])
		       + (class433_20_.aFloatArray4853[6]
			  * class433_21_.aFloatArray4853[9])
		       + (class433_20_.aFloatArray4853[7]
			  * class433_21_.aFloatArray4853[13]));
	float f_27_ = ((class433_20_.aFloatArray4853[4]
			* class433_21_.aFloatArray4853[2])
		       + (class433_20_.aFloatArray4853[5]
			  * class433_21_.aFloatArray4853[6])
		       + (class433_20_.aFloatArray4853[6]
			  * class433_21_.aFloatArray4853[10])
		       + (class433_20_.aFloatArray4853[7]
			  * class433_21_.aFloatArray4853[14]));
	float f_28_ = ((class433_20_.aFloatArray4853[4]
			* class433_21_.aFloatArray4853[3])
		       + (class433_20_.aFloatArray4853[5]
			  * class433_21_.aFloatArray4853[7])
		       + (class433_20_.aFloatArray4853[6]
			  * class433_21_.aFloatArray4853[11])
		       + (class433_20_.aFloatArray4853[7]
			  * class433_21_.aFloatArray4853[15]));
	float f_29_ = ((class433_20_.aFloatArray4853[8]
			* class433_21_.aFloatArray4853[0])
		       + (class433_20_.aFloatArray4853[9]
			  * class433_21_.aFloatArray4853[4])
		       + (class433_20_.aFloatArray4853[10]
			  * class433_21_.aFloatArray4853[8])
		       + (class433_20_.aFloatArray4853[11]
			  * class433_21_.aFloatArray4853[12]));
	float f_30_ = ((class433_20_.aFloatArray4853[8]
			* class433_21_.aFloatArray4853[1])
		       + (class433_20_.aFloatArray4853[9]
			  * class433_21_.aFloatArray4853[5])
		       + (class433_20_.aFloatArray4853[10]
			  * class433_21_.aFloatArray4853[9])
		       + (class433_20_.aFloatArray4853[11]
			  * class433_21_.aFloatArray4853[13]));
	float f_31_ = ((class433_20_.aFloatArray4853[8]
			* class433_21_.aFloatArray4853[2])
		       + (class433_20_.aFloatArray4853[9]
			  * class433_21_.aFloatArray4853[6])
		       + (class433_20_.aFloatArray4853[10]
			  * class433_21_.aFloatArray4853[10])
		       + (class433_20_.aFloatArray4853[11]
			  * class433_21_.aFloatArray4853[14]));
	float f_32_ = ((class433_20_.aFloatArray4853[8]
			* class433_21_.aFloatArray4853[3])
		       + (class433_20_.aFloatArray4853[9]
			  * class433_21_.aFloatArray4853[7])
		       + (class433_20_.aFloatArray4853[10]
			  * class433_21_.aFloatArray4853[11])
		       + (class433_20_.aFloatArray4853[11]
			  * class433_21_.aFloatArray4853[15]));
	float f_33_ = ((class433_20_.aFloatArray4853[12]
			* class433_21_.aFloatArray4853[0])
		       + (class433_20_.aFloatArray4853[13]
			  * class433_21_.aFloatArray4853[4])
		       + (class433_20_.aFloatArray4853[14]
			  * class433_21_.aFloatArray4853[8])
		       + (class433_20_.aFloatArray4853[15]
			  * class433_21_.aFloatArray4853[12]));
	float f_34_ = ((class433_20_.aFloatArray4853[12]
			* class433_21_.aFloatArray4853[1])
		       + (class433_20_.aFloatArray4853[13]
			  * class433_21_.aFloatArray4853[5])
		       + (class433_20_.aFloatArray4853[14]
			  * class433_21_.aFloatArray4853[9])
		       + (class433_20_.aFloatArray4853[15]
			  * class433_21_.aFloatArray4853[13]));
	float f_35_ = ((class433_20_.aFloatArray4853[12]
			* class433_21_.aFloatArray4853[2])
		       + (class433_20_.aFloatArray4853[13]
			  * class433_21_.aFloatArray4853[6])
		       + (class433_20_.aFloatArray4853[14]
			  * class433_21_.aFloatArray4853[10])
		       + (class433_20_.aFloatArray4853[15]
			  * class433_21_.aFloatArray4853[14]));
	float f_36_ = ((class433_20_.aFloatArray4853[12]
			* class433_21_.aFloatArray4853[3])
		       + (class433_20_.aFloatArray4853[13]
			  * class433_21_.aFloatArray4853[7])
		       + (class433_20_.aFloatArray4853[14]
			  * class433_21_.aFloatArray4853[11])
		       + (class433_20_.aFloatArray4853[15]
			  * class433_21_.aFloatArray4853[15]));
	aFloatArray4853[0] = f;
	aFloatArray4853[1] = f_22_;
	aFloatArray4853[2] = f_23_;
	aFloatArray4853[3] = f_24_;
	aFloatArray4853[4] = f_25_;
	aFloatArray4853[5] = f_26_;
	aFloatArray4853[6] = f_27_;
	aFloatArray4853[7] = f_28_;
	aFloatArray4853[8] = f_29_;
	aFloatArray4853[9] = f_30_;
	aFloatArray4853[10] = f_31_;
	aFloatArray4853[11] = f_32_;
	aFloatArray4853[12] = f_33_;
	aFloatArray4853[13] = f_34_;
	aFloatArray4853[14] = f_35_;
	aFloatArray4853[15] = f_36_;
    }
    
    public float[] method6845(float[] fs) {
	float f = aFloatArray4853[3] - aFloatArray4853[2];
	float f_37_ = aFloatArray4853[7] - aFloatArray4853[6];
	float f_38_ = aFloatArray4853[11] - aFloatArray4853[10];
	double d = Math.sqrt((double) (f * f + f_37_ * f_37_ + f_38_ * f_38_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_37_ / d);
	fs[2] = (float) ((double) f_38_ / d);
	fs[3] = (float) ((double) (aFloatArray4853[15] - aFloatArray4853[14])
			 / d);
	return fs;
    }
    
    public Class433(Class433 class433_39_) {
	aFloatArray4853 = new float[16];
	method6842(class433_39_);
    }
    
    float method6846() {
	return ((aFloatArray4853[0] * aFloatArray4853[5] * aFloatArray4853[10]
		 * aFloatArray4853[15])
		- (aFloatArray4853[0] * aFloatArray4853[5]
		   * aFloatArray4853[11] * aFloatArray4853[14])
		- (aFloatArray4853[0] * aFloatArray4853[6] * aFloatArray4853[9]
		   * aFloatArray4853[15])
		+ (aFloatArray4853[0] * aFloatArray4853[6]
		   * aFloatArray4853[11] * aFloatArray4853[13])
		+ (aFloatArray4853[0] * aFloatArray4853[7] * aFloatArray4853[9]
		   * aFloatArray4853[14])
		- (aFloatArray4853[0] * aFloatArray4853[7]
		   * aFloatArray4853[10] * aFloatArray4853[13])
		- (aFloatArray4853[1] * aFloatArray4853[4]
		   * aFloatArray4853[10] * aFloatArray4853[15])
		+ (aFloatArray4853[1] * aFloatArray4853[4]
		   * aFloatArray4853[11] * aFloatArray4853[14])
		+ (aFloatArray4853[1] * aFloatArray4853[6] * aFloatArray4853[8]
		   * aFloatArray4853[15])
		- (aFloatArray4853[1] * aFloatArray4853[6]
		   * aFloatArray4853[11] * aFloatArray4853[12])
		- (aFloatArray4853[1] * aFloatArray4853[7] * aFloatArray4853[8]
		   * aFloatArray4853[14])
		+ (aFloatArray4853[1] * aFloatArray4853[7]
		   * aFloatArray4853[10] * aFloatArray4853[12])
		+ (aFloatArray4853[2] * aFloatArray4853[4] * aFloatArray4853[9]
		   * aFloatArray4853[15])
		- (aFloatArray4853[2] * aFloatArray4853[4]
		   * aFloatArray4853[11] * aFloatArray4853[13])
		- (aFloatArray4853[2] * aFloatArray4853[5] * aFloatArray4853[8]
		   * aFloatArray4853[15])
		+ (aFloatArray4853[2] * aFloatArray4853[5]
		   * aFloatArray4853[11] * aFloatArray4853[12])
		+ (aFloatArray4853[2] * aFloatArray4853[7] * aFloatArray4853[8]
		   * aFloatArray4853[13])
		- (aFloatArray4853[2] * aFloatArray4853[7] * aFloatArray4853[9]
		   * aFloatArray4853[12])
		- (aFloatArray4853[3] * aFloatArray4853[4] * aFloatArray4853[9]
		   * aFloatArray4853[14])
		+ (aFloatArray4853[3] * aFloatArray4853[4]
		   * aFloatArray4853[10] * aFloatArray4853[13])
		+ (aFloatArray4853[3] * aFloatArray4853[5] * aFloatArray4853[8]
		   * aFloatArray4853[14])
		- (aFloatArray4853[3] * aFloatArray4853[5]
		   * aFloatArray4853[10] * aFloatArray4853[12])
		- (aFloatArray4853[3] * aFloatArray4853[6] * aFloatArray4853[8]
		   * aFloatArray4853[13])
		+ (aFloatArray4853[3] * aFloatArray4853[6] * aFloatArray4853[9]
		   * aFloatArray4853[12]));
    }
    
    public void method6847() {
	float f = 1.0F / method6846();
	float f_40_
	    = (aFloatArray4853[5] * aFloatArray4853[10] * aFloatArray4853[15]
	       - aFloatArray4853[5] * aFloatArray4853[11] * aFloatArray4853[14]
	       - aFloatArray4853[6] * aFloatArray4853[9] * aFloatArray4853[15]
	       + aFloatArray4853[6] * aFloatArray4853[11] * aFloatArray4853[13]
	       + aFloatArray4853[7] * aFloatArray4853[9] * aFloatArray4853[14]
	       - (aFloatArray4853[7] * aFloatArray4853[10]
		  * aFloatArray4853[13])) * f;
	float f_41_
	    = (-aFloatArray4853[1] * aFloatArray4853[10] * aFloatArray4853[15]
	       + aFloatArray4853[1] * aFloatArray4853[11] * aFloatArray4853[14]
	       + aFloatArray4853[2] * aFloatArray4853[9] * aFloatArray4853[15]
	       - aFloatArray4853[2] * aFloatArray4853[11] * aFloatArray4853[13]
	       - aFloatArray4853[3] * aFloatArray4853[9] * aFloatArray4853[14]
	       + (aFloatArray4853[3] * aFloatArray4853[10]
		  * aFloatArray4853[13])) * f;
	float f_42_
	    = ((aFloatArray4853[1] * aFloatArray4853[6] * aFloatArray4853[15]
		- aFloatArray4853[1] * aFloatArray4853[7] * aFloatArray4853[14]
		- aFloatArray4853[2] * aFloatArray4853[5] * aFloatArray4853[15]
		+ aFloatArray4853[2] * aFloatArray4853[7] * aFloatArray4853[13]
		+ aFloatArray4853[3] * aFloatArray4853[5] * aFloatArray4853[14]
		- (aFloatArray4853[3] * aFloatArray4853[6]
		   * aFloatArray4853[13]))
	       * f);
	float f_43_
	    = ((-aFloatArray4853[1] * aFloatArray4853[6] * aFloatArray4853[11]
		+ aFloatArray4853[1] * aFloatArray4853[7] * aFloatArray4853[10]
		+ aFloatArray4853[2] * aFloatArray4853[5] * aFloatArray4853[11]
		- aFloatArray4853[2] * aFloatArray4853[7] * aFloatArray4853[9]
		- aFloatArray4853[3] * aFloatArray4853[5] * aFloatArray4853[10]
		+ aFloatArray4853[3] * aFloatArray4853[6] * aFloatArray4853[9])
	       * f);
	float f_44_
	    = (-aFloatArray4853[4] * aFloatArray4853[10] * aFloatArray4853[15]
	       + aFloatArray4853[4] * aFloatArray4853[11] * aFloatArray4853[14]
	       + aFloatArray4853[6] * aFloatArray4853[8] * aFloatArray4853[15]
	       - aFloatArray4853[6] * aFloatArray4853[11] * aFloatArray4853[12]
	       - aFloatArray4853[7] * aFloatArray4853[8] * aFloatArray4853[14]
	       + (aFloatArray4853[7] * aFloatArray4853[10]
		  * aFloatArray4853[12])) * f;
	float f_45_
	    = (aFloatArray4853[0] * aFloatArray4853[10] * aFloatArray4853[15]
	       - aFloatArray4853[0] * aFloatArray4853[11] * aFloatArray4853[14]
	       - aFloatArray4853[2] * aFloatArray4853[8] * aFloatArray4853[15]
	       + aFloatArray4853[2] * aFloatArray4853[11] * aFloatArray4853[12]
	       + aFloatArray4853[3] * aFloatArray4853[8] * aFloatArray4853[14]
	       - (aFloatArray4853[3] * aFloatArray4853[10]
		  * aFloatArray4853[12])) * f;
	float f_46_
	    = ((-aFloatArray4853[0] * aFloatArray4853[6] * aFloatArray4853[15]
		+ aFloatArray4853[0] * aFloatArray4853[7] * aFloatArray4853[14]
		+ aFloatArray4853[2] * aFloatArray4853[4] * aFloatArray4853[15]
		- aFloatArray4853[2] * aFloatArray4853[7] * aFloatArray4853[12]
		- aFloatArray4853[3] * aFloatArray4853[4] * aFloatArray4853[14]
		+ (aFloatArray4853[3] * aFloatArray4853[6]
		   * aFloatArray4853[12]))
	       * f);
	float f_47_
	    = ((aFloatArray4853[0] * aFloatArray4853[6] * aFloatArray4853[11]
		- aFloatArray4853[0] * aFloatArray4853[7] * aFloatArray4853[10]
		- aFloatArray4853[2] * aFloatArray4853[4] * aFloatArray4853[11]
		+ aFloatArray4853[2] * aFloatArray4853[7] * aFloatArray4853[8]
		+ aFloatArray4853[3] * aFloatArray4853[4] * aFloatArray4853[10]
		- aFloatArray4853[3] * aFloatArray4853[6] * aFloatArray4853[8])
	       * f);
	float f_48_
	    = (aFloatArray4853[4] * aFloatArray4853[9] * aFloatArray4853[15]
	       - aFloatArray4853[4] * aFloatArray4853[11] * aFloatArray4853[13]
	       - aFloatArray4853[5] * aFloatArray4853[8] * aFloatArray4853[15]
	       + aFloatArray4853[5] * aFloatArray4853[11] * aFloatArray4853[12]
	       + aFloatArray4853[7] * aFloatArray4853[8] * aFloatArray4853[13]
	       - (aFloatArray4853[7] * aFloatArray4853[9]
		  * aFloatArray4853[12])) * f;
	float f_49_
	    = (-aFloatArray4853[0] * aFloatArray4853[9] * aFloatArray4853[15]
	       + aFloatArray4853[0] * aFloatArray4853[11] * aFloatArray4853[13]
	       + aFloatArray4853[1] * aFloatArray4853[8] * aFloatArray4853[15]
	       - aFloatArray4853[1] * aFloatArray4853[11] * aFloatArray4853[12]
	       - aFloatArray4853[3] * aFloatArray4853[8] * aFloatArray4853[13]
	       + (aFloatArray4853[3] * aFloatArray4853[9]
		  * aFloatArray4853[12])) * f;
	float f_50_
	    = ((aFloatArray4853[0] * aFloatArray4853[5] * aFloatArray4853[15]
		- aFloatArray4853[0] * aFloatArray4853[7] * aFloatArray4853[13]
		- aFloatArray4853[1] * aFloatArray4853[4] * aFloatArray4853[15]
		+ aFloatArray4853[1] * aFloatArray4853[7] * aFloatArray4853[12]
		+ aFloatArray4853[3] * aFloatArray4853[4] * aFloatArray4853[13]
		- (aFloatArray4853[3] * aFloatArray4853[5]
		   * aFloatArray4853[12]))
	       * f);
	float f_51_
	    = ((-aFloatArray4853[0] * aFloatArray4853[5] * aFloatArray4853[11]
		+ aFloatArray4853[0] * aFloatArray4853[7] * aFloatArray4853[9]
		+ aFloatArray4853[1] * aFloatArray4853[4] * aFloatArray4853[11]
		- aFloatArray4853[1] * aFloatArray4853[7] * aFloatArray4853[8]
		- aFloatArray4853[3] * aFloatArray4853[4] * aFloatArray4853[9]
		+ aFloatArray4853[3] * aFloatArray4853[5] * aFloatArray4853[8])
	       * f);
	float f_52_
	    = (-aFloatArray4853[4] * aFloatArray4853[9] * aFloatArray4853[14]
	       + aFloatArray4853[4] * aFloatArray4853[10] * aFloatArray4853[13]
	       + aFloatArray4853[5] * aFloatArray4853[8] * aFloatArray4853[14]
	       - aFloatArray4853[5] * aFloatArray4853[10] * aFloatArray4853[12]
	       - aFloatArray4853[6] * aFloatArray4853[8] * aFloatArray4853[13]
	       + (aFloatArray4853[6] * aFloatArray4853[9]
		  * aFloatArray4853[12])) * f;
	float f_53_
	    = (aFloatArray4853[0] * aFloatArray4853[9] * aFloatArray4853[14]
	       - aFloatArray4853[0] * aFloatArray4853[10] * aFloatArray4853[13]
	       - aFloatArray4853[1] * aFloatArray4853[8] * aFloatArray4853[14]
	       + aFloatArray4853[1] * aFloatArray4853[10] * aFloatArray4853[12]
	       + aFloatArray4853[2] * aFloatArray4853[8] * aFloatArray4853[13]
	       - (aFloatArray4853[2] * aFloatArray4853[9]
		  * aFloatArray4853[12])) * f;
	float f_54_
	    = ((-aFloatArray4853[0] * aFloatArray4853[5] * aFloatArray4853[14]
		+ aFloatArray4853[0] * aFloatArray4853[6] * aFloatArray4853[13]
		+ aFloatArray4853[1] * aFloatArray4853[4] * aFloatArray4853[14]
		- aFloatArray4853[1] * aFloatArray4853[6] * aFloatArray4853[12]
		- aFloatArray4853[2] * aFloatArray4853[4] * aFloatArray4853[13]
		+ (aFloatArray4853[2] * aFloatArray4853[5]
		   * aFloatArray4853[12]))
	       * f);
	float f_55_
	    = ((aFloatArray4853[0] * aFloatArray4853[5] * aFloatArray4853[10]
		- aFloatArray4853[0] * aFloatArray4853[6] * aFloatArray4853[9]
		- aFloatArray4853[1] * aFloatArray4853[4] * aFloatArray4853[10]
		+ aFloatArray4853[1] * aFloatArray4853[6] * aFloatArray4853[8]
		+ aFloatArray4853[2] * aFloatArray4853[4] * aFloatArray4853[9]
		- aFloatArray4853[2] * aFloatArray4853[5] * aFloatArray4853[8])
	       * f);
	aFloatArray4853[0] = f_40_;
	aFloatArray4853[1] = f_41_;
	aFloatArray4853[2] = f_42_;
	aFloatArray4853[3] = f_43_;
	aFloatArray4853[4] = f_44_;
	aFloatArray4853[5] = f_45_;
	aFloatArray4853[6] = f_46_;
	aFloatArray4853[7] = f_47_;
	aFloatArray4853[8] = f_48_;
	aFloatArray4853[9] = f_49_;
	aFloatArray4853[10] = f_50_;
	aFloatArray4853[11] = f_51_;
	aFloatArray4853[12] = f_52_;
	aFloatArray4853[13] = f_53_;
	aFloatArray4853[14] = f_54_;
	aFloatArray4853[15] = f_55_;
    }
    
    public float[] method6848(float[] fs) {
	fs[0] = aFloatArray4853[0];
	fs[1] = aFloatArray4853[4];
	fs[2] = aFloatArray4853[8];
	fs[3] = aFloatArray4853[12];
	fs[4] = aFloatArray4853[1];
	fs[5] = aFloatArray4853[5];
	fs[6] = aFloatArray4853[9];
	fs[7] = aFloatArray4853[13];
	return fs;
    }
    
    public float[] method6849(float[] fs) {
	fs[0] = aFloatArray4853[0];
	fs[1] = aFloatArray4853[1];
	fs[2] = 0.0F;
	fs[3] = 0.0F;
	fs[4] = aFloatArray4853[4];
	fs[5] = aFloatArray4853[5];
	fs[6] = 0.0F;
	fs[7] = 0.0F;
	fs[8] = aFloatArray4853[12];
	fs[9] = aFloatArray4853[13];
	fs[10] = aFloatArray4853[14];
	fs[11] = 0.0F;
	fs[12] = 0.0F;
	fs[13] = 0.0F;
	fs[14] = 0.0F;
	fs[15] = 1.0F;
	return fs;
    }
    
    public void method6850(float f, float f_56_, float f_57_, float[] fs) {
	fs[0] = (aFloatArray4853[0] * f + aFloatArray4853[4] * f_56_
		 + aFloatArray4853[8] * f_57_ + aFloatArray4853[12]);
	fs[1] = (aFloatArray4853[1] * f + aFloatArray4853[5] * f_56_
		 + aFloatArray4853[9] * f_57_ + aFloatArray4853[13]);
	fs[2] = (aFloatArray4853[2] * f + aFloatArray4853[6] * f_56_
		 + aFloatArray4853[10] * f_57_ + aFloatArray4853[14]);
	if (fs.length > 3)
	    fs[3] = (aFloatArray4853[3] * f + aFloatArray4853[7] * f_56_
		     + aFloatArray4853[11] * f_57_ + aFloatArray4853[15]);
    }
    
    public void method6851(float[] fs) {
	float f = fs[0];
	float f_58_ = fs[1];
	float f_59_ = fs[2];
	fs[0] = (aFloatArray4853[0] * f + aFloatArray4853[4] * f_58_
		 + aFloatArray4853[8] * f_59_ + aFloatArray4853[12]);
	fs[1] = (aFloatArray4853[1] * f + aFloatArray4853[5] * f_58_
		 + aFloatArray4853[9] * f_59_ + aFloatArray4853[13]);
	fs[2] = (aFloatArray4853[2] * f + aFloatArray4853[6] * f_58_
		 + aFloatArray4853[10] * f_59_ + aFloatArray4853[14]);
    }
    
    public void method6852(float f, float f_60_, float f_61_, float[] fs) {
	fs[0] = (aFloatArray4853[0] * f + aFloatArray4853[4] * f_60_
		 + aFloatArray4853[8] * f_61_);
	fs[1] = (aFloatArray4853[1] * f + aFloatArray4853[5] * f_60_
		 + aFloatArray4853[9] * f_61_);
	fs[2] = (aFloatArray4853[2] * f + aFloatArray4853[6] * f_60_
		 + aFloatArray4853[10] * f_61_);
	if (fs.length > 3)
	    fs[3] = (aFloatArray4853[3] * f + aFloatArray4853[7] * f_60_
		     + aFloatArray4853[11] * f_61_);
    }
    
    public void method6853(float f, float f_62_, float f_63_, float f_64_,
			   float f_65_, float f_66_) {
	aFloatArray4853[0] = 2.0F / (f_62_ - f);
	aFloatArray4853[1] = 0.0F;
	aFloatArray4853[2] = 0.0F;
	aFloatArray4853[3] = 0.0F;
	aFloatArray4853[4] = 0.0F;
	aFloatArray4853[5] = 2.0F / (f_64_ - f_63_);
	aFloatArray4853[6] = 0.0F;
	aFloatArray4853[7] = 0.0F;
	aFloatArray4853[8] = 0.0F;
	aFloatArray4853[9] = 0.0F;
	aFloatArray4853[10] = 2.0F / (f_66_ - f_65_);
	aFloatArray4853[11] = 0.0F;
	aFloatArray4853[12] = -(f_62_ + f) / (f_62_ - f);
	aFloatArray4853[13] = -(f_64_ + f_63_) / (f_64_ - f_63_);
	aFloatArray4853[14] = -(f_66_ + f_65_) / (f_66_ - f_65_);
	aFloatArray4853[15] = 1.0F;
    }
    
    public void method6854(float f, float f_67_, float f_68_, float f_69_) {
	float f_70_ = (float) (Math.tan((double) (f_68_ / 2.0F)) * (double) f);
	float f_71_ = (float) (Math.tan((double) (f_69_ / 2.0F)) * (double) f);
	method6885(-f_70_, f_70_, -f_71_, f_71_, f, f_67_);
    }
    
    public void method6855(float f, float f_72_, float f_73_) {
	method6853(-10000.0F / f_73_, 10000.0F / f_73_, -10000.0F / f_73_,
		   10000.0F / f_73_, f, f_72_);
    }
    
    public void method6856(float f, float f_74_, float f_75_, float f_76_) {
	float f_77_ = (float) (Math.tan((double) (f_75_ / 2.0F)) * (double) f);
	float f_78_ = (float) (Math.tan((double) (f_76_ / 2.0F)) * (double) f);
	method6885(-f_77_, f_77_, -f_78_, f_78_, f, f_74_);
    }
    
    public void method6857(float f, float f_79_, float f_80_, float f_81_,
			   float f_82_, float f_83_, float f_84_,
			   float f_85_) {
	aFloatArray4853[0] = f_80_ * 2.0F / f_84_;
	aFloatArray4853[1] = 0.0F;
	aFloatArray4853[2] = 0.0F;
	aFloatArray4853[3] = 0.0F;
	aFloatArray4853[4] = 0.0F;
	aFloatArray4853[5] = f_81_ * 2.0F / f_85_;
	aFloatArray4853[6] = 0.0F;
	aFloatArray4853[7] = 0.0F;
	aFloatArray4853[8] = 2.0F * f / f_84_ - 1.0F;
	aFloatArray4853[9] = 2.0F * f_79_ / f_85_ - 1.0F;
	aFloatArray4853[10] = (f_83_ + f_82_) / (f_83_ - f_82_);
	aFloatArray4853[11] = 1.0F;
	aFloatArray4853[12] = 0.0F;
	aFloatArray4853[13] = 0.0F;
	aFloatArray4853[14] = 2.0F * f_83_ * f_82_ / (f_82_ - f_83_);
	aFloatArray4853[15] = 0.0F;
    }
    
    public float[] method6858(float[] fs) {
	float f = aFloatArray4853[3] - aFloatArray4853[2];
	float f_86_ = aFloatArray4853[7] - aFloatArray4853[6];
	float f_87_ = aFloatArray4853[11] - aFloatArray4853[10];
	double d = Math.sqrt((double) (f * f + f_86_ * f_86_ + f_87_ * f_87_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_86_ / d);
	fs[2] = (float) ((double) f_87_ / d);
	fs[3] = (float) ((double) (aFloatArray4853[15] - aFloatArray4853[14])
			 / d);
	return fs;
    }
    
    public float method6859() {
	return (-(aFloatArray4853[15] + aFloatArray4853[14])
		/ (aFloatArray4853[11] + aFloatArray4853[10]));
    }
    
    public void method6860(float f, float f_88_, float f_89_, float f_90_,
			   float f_91_, float f_92_, float f_93_, float f_94_,
			   float f_95_) {
	method6853(-(f * f_95_) / f_89_, f_95_ * (f_93_ - f) / f_89_,
		   -(f_88_ * f_95_) / f_90_, f_95_ * (f_94_ - f_88_) / f_90_,
		   f_91_, f_92_);
    }
    
    public float[] method6861(float[] fs) {
	float f = aFloatArray4853[3] + aFloatArray4853[0];
	float f_96_ = aFloatArray4853[7] + aFloatArray4853[4];
	float f_97_ = aFloatArray4853[11] + aFloatArray4853[8];
	double d = Math.sqrt((double) (f * f + f_96_ * f_96_ + f_97_ * f_97_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_96_ / d);
	fs[2] = (float) ((double) f_97_ / d);
	fs[3] = (float) ((double) (aFloatArray4853[15] + aFloatArray4853[12])
			 / d);
	return fs;
    }
    
    public float[] method6862(float[] fs) {
	float f = aFloatArray4853[3] + aFloatArray4853[2];
	float f_98_ = aFloatArray4853[7] + aFloatArray4853[6];
	float f_99_ = aFloatArray4853[11] + aFloatArray4853[10];
	double d = Math.sqrt((double) (f * f + f_98_ * f_98_ + f_99_ * f_99_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_98_ / d);
	fs[2] = (float) ((double) f_99_ / d);
	fs[3] = (float) ((double) (aFloatArray4853[15] + aFloatArray4853[14])
			 / d);
	return fs;
    }
    
    public void method6863(float[] fs) {
	float f = fs[0];
	float f_100_ = fs[1];
	float f_101_ = fs[2];
	fs[0] = (aFloatArray4853[0] * f + aFloatArray4853[4] * f_100_
		 + aFloatArray4853[8] * f_101_ + aFloatArray4853[12]);
	fs[1] = (aFloatArray4853[1] * f + aFloatArray4853[5] * f_100_
		 + aFloatArray4853[9] * f_101_ + aFloatArray4853[13]);
	fs[2] = (aFloatArray4853[2] * f + aFloatArray4853[6] * f_100_
		 + aFloatArray4853[10] * f_101_ + aFloatArray4853[14]);
    }
    
    public void method6864(float f, float f_102_, float f_103_, float f_104_) {
	aFloatArray4853[0] = f;
	aFloatArray4853[1] = 0.0F;
	aFloatArray4853[2] = 0.0F;
	aFloatArray4853[3] = 0.0F;
	aFloatArray4853[4] = 0.0F;
	aFloatArray4853[5] = f_102_;
	aFloatArray4853[6] = 0.0F;
	aFloatArray4853[7] = 0.0F;
	aFloatArray4853[8] = 0.0F;
	aFloatArray4853[9] = 0.0F;
	aFloatArray4853[10] = f_103_;
	aFloatArray4853[11] = 0.0F;
	aFloatArray4853[12] = 0.0F;
	aFloatArray4853[13] = 0.0F;
	aFloatArray4853[14] = 0.0F;
	aFloatArray4853[15] = f_104_;
    }
    
    public float method6865() {
	return (-(aFloatArray4853[15] + aFloatArray4853[14])
		/ (aFloatArray4853[11] + aFloatArray4853[10]));
    }
    
    public float[] method6866(float[] fs) {
	fs[0] = aFloatArray4853[0];
	fs[1] = aFloatArray4853[4];
	fs[2] = aFloatArray4853[8];
	fs[3] = aFloatArray4853[12];
	fs[4] = aFloatArray4853[1];
	fs[5] = aFloatArray4853[5];
	fs[6] = aFloatArray4853[9];
	fs[7] = aFloatArray4853[13];
	fs[8] = aFloatArray4853[2];
	fs[9] = aFloatArray4853[6];
	fs[10] = aFloatArray4853[10];
	fs[11] = aFloatArray4853[14];
	fs[12] = aFloatArray4853[3];
	fs[13] = aFloatArray4853[7];
	fs[14] = aFloatArray4853[11];
	fs[15] = aFloatArray4853[15];
	return fs;
    }
    
    public void method6867() {
	float f = aFloatArray4853[0];
	float f_105_ = aFloatArray4853[4];
	float f_106_ = aFloatArray4853[8];
	float f_107_ = aFloatArray4853[12];
	float f_108_ = aFloatArray4853[1];
	float f_109_ = aFloatArray4853[5];
	float f_110_ = aFloatArray4853[9];
	float f_111_ = aFloatArray4853[13];
	float f_112_ = aFloatArray4853[2];
	float f_113_ = aFloatArray4853[6];
	float f_114_ = aFloatArray4853[10];
	float f_115_ = aFloatArray4853[14];
	float f_116_ = aFloatArray4853[3];
	float f_117_ = aFloatArray4853[7];
	float f_118_ = aFloatArray4853[11];
	float f_119_ = aFloatArray4853[15];
	aFloatArray4853[0] = f;
	aFloatArray4853[1] = f_105_;
	aFloatArray4853[2] = f_106_;
	aFloatArray4853[3] = f_107_;
	aFloatArray4853[4] = f_108_;
	aFloatArray4853[5] = f_109_;
	aFloatArray4853[6] = f_110_;
	aFloatArray4853[7] = f_111_;
	aFloatArray4853[8] = f_112_;
	aFloatArray4853[9] = f_113_;
	aFloatArray4853[10] = f_114_;
	aFloatArray4853[11] = f_115_;
	aFloatArray4853[12] = f_116_;
	aFloatArray4853[13] = f_117_;
	aFloatArray4853[14] = f_118_;
	aFloatArray4853[15] = f_119_;
    }
    
    public boolean method6868(Object object) {
	if (!(object instanceof Class433))
	    return false;
	Class433 class433_120_ = (Class433) object;
	for (int i = 0; i < 16; i++) {
	    if (aFloatArray4853[i] != class433_120_.aFloatArray4853[i])
		return false;
	}
	return true;
    }
    
    public float[] method6869(float[] fs) {
	System.arraycopy(aFloatArray4853, 0, fs, 0, 16);
	fs[3] = 0.0F;
	fs[7] = 0.0F;
	fs[11] = 0.0F;
	fs[12] = 0.0F;
	fs[13] = 0.0F;
	fs[14] = 0.0F;
	fs[15] = 1.0F;
	return fs;
    }
    
    public float[] method6870(float[] fs) {
	fs[0] = aFloatArray4853[0];
	fs[1] = aFloatArray4853[1];
	fs[2] = aFloatArray4853[2];
	fs[3] = aFloatArray4853[4];
	fs[4] = aFloatArray4853[5];
	fs[5] = aFloatArray4853[6];
	fs[6] = aFloatArray4853[8];
	fs[7] = aFloatArray4853[9];
	fs[8] = aFloatArray4853[10];
	return fs;
    }
    
    public void method6871() {
	float f = 1.0F / method6846();
	float f_121_
	    = (aFloatArray4853[5] * aFloatArray4853[10] * aFloatArray4853[15]
	       - aFloatArray4853[5] * aFloatArray4853[11] * aFloatArray4853[14]
	       - aFloatArray4853[6] * aFloatArray4853[9] * aFloatArray4853[15]
	       + aFloatArray4853[6] * aFloatArray4853[11] * aFloatArray4853[13]
	       + aFloatArray4853[7] * aFloatArray4853[9] * aFloatArray4853[14]
	       - (aFloatArray4853[7] * aFloatArray4853[10]
		  * aFloatArray4853[13])) * f;
	float f_122_
	    = (-aFloatArray4853[1] * aFloatArray4853[10] * aFloatArray4853[15]
	       + aFloatArray4853[1] * aFloatArray4853[11] * aFloatArray4853[14]
	       + aFloatArray4853[2] * aFloatArray4853[9] * aFloatArray4853[15]
	       - aFloatArray4853[2] * aFloatArray4853[11] * aFloatArray4853[13]
	       - aFloatArray4853[3] * aFloatArray4853[9] * aFloatArray4853[14]
	       + (aFloatArray4853[3] * aFloatArray4853[10]
		  * aFloatArray4853[13])) * f;
	float f_123_
	    = ((aFloatArray4853[1] * aFloatArray4853[6] * aFloatArray4853[15]
		- aFloatArray4853[1] * aFloatArray4853[7] * aFloatArray4853[14]
		- aFloatArray4853[2] * aFloatArray4853[5] * aFloatArray4853[15]
		+ aFloatArray4853[2] * aFloatArray4853[7] * aFloatArray4853[13]
		+ aFloatArray4853[3] * aFloatArray4853[5] * aFloatArray4853[14]
		- (aFloatArray4853[3] * aFloatArray4853[6]
		   * aFloatArray4853[13]))
	       * f);
	float f_124_
	    = ((-aFloatArray4853[1] * aFloatArray4853[6] * aFloatArray4853[11]
		+ aFloatArray4853[1] * aFloatArray4853[7] * aFloatArray4853[10]
		+ aFloatArray4853[2] * aFloatArray4853[5] * aFloatArray4853[11]
		- aFloatArray4853[2] * aFloatArray4853[7] * aFloatArray4853[9]
		- aFloatArray4853[3] * aFloatArray4853[5] * aFloatArray4853[10]
		+ aFloatArray4853[3] * aFloatArray4853[6] * aFloatArray4853[9])
	       * f);
	float f_125_
	    = (-aFloatArray4853[4] * aFloatArray4853[10] * aFloatArray4853[15]
	       + aFloatArray4853[4] * aFloatArray4853[11] * aFloatArray4853[14]
	       + aFloatArray4853[6] * aFloatArray4853[8] * aFloatArray4853[15]
	       - aFloatArray4853[6] * aFloatArray4853[11] * aFloatArray4853[12]
	       - aFloatArray4853[7] * aFloatArray4853[8] * aFloatArray4853[14]
	       + (aFloatArray4853[7] * aFloatArray4853[10]
		  * aFloatArray4853[12])) * f;
	float f_126_
	    = (aFloatArray4853[0] * aFloatArray4853[10] * aFloatArray4853[15]
	       - aFloatArray4853[0] * aFloatArray4853[11] * aFloatArray4853[14]
	       - aFloatArray4853[2] * aFloatArray4853[8] * aFloatArray4853[15]
	       + aFloatArray4853[2] * aFloatArray4853[11] * aFloatArray4853[12]
	       + aFloatArray4853[3] * aFloatArray4853[8] * aFloatArray4853[14]
	       - (aFloatArray4853[3] * aFloatArray4853[10]
		  * aFloatArray4853[12])) * f;
	float f_127_
	    = ((-aFloatArray4853[0] * aFloatArray4853[6] * aFloatArray4853[15]
		+ aFloatArray4853[0] * aFloatArray4853[7] * aFloatArray4853[14]
		+ aFloatArray4853[2] * aFloatArray4853[4] * aFloatArray4853[15]
		- aFloatArray4853[2] * aFloatArray4853[7] * aFloatArray4853[12]
		- aFloatArray4853[3] * aFloatArray4853[4] * aFloatArray4853[14]
		+ (aFloatArray4853[3] * aFloatArray4853[6]
		   * aFloatArray4853[12]))
	       * f);
	float f_128_
	    = ((aFloatArray4853[0] * aFloatArray4853[6] * aFloatArray4853[11]
		- aFloatArray4853[0] * aFloatArray4853[7] * aFloatArray4853[10]
		- aFloatArray4853[2] * aFloatArray4853[4] * aFloatArray4853[11]
		+ aFloatArray4853[2] * aFloatArray4853[7] * aFloatArray4853[8]
		+ aFloatArray4853[3] * aFloatArray4853[4] * aFloatArray4853[10]
		- aFloatArray4853[3] * aFloatArray4853[6] * aFloatArray4853[8])
	       * f);
	float f_129_
	    = (aFloatArray4853[4] * aFloatArray4853[9] * aFloatArray4853[15]
	       - aFloatArray4853[4] * aFloatArray4853[11] * aFloatArray4853[13]
	       - aFloatArray4853[5] * aFloatArray4853[8] * aFloatArray4853[15]
	       + aFloatArray4853[5] * aFloatArray4853[11] * aFloatArray4853[12]
	       + aFloatArray4853[7] * aFloatArray4853[8] * aFloatArray4853[13]
	       - (aFloatArray4853[7] * aFloatArray4853[9]
		  * aFloatArray4853[12])) * f;
	float f_130_
	    = (-aFloatArray4853[0] * aFloatArray4853[9] * aFloatArray4853[15]
	       + aFloatArray4853[0] * aFloatArray4853[11] * aFloatArray4853[13]
	       + aFloatArray4853[1] * aFloatArray4853[8] * aFloatArray4853[15]
	       - aFloatArray4853[1] * aFloatArray4853[11] * aFloatArray4853[12]
	       - aFloatArray4853[3] * aFloatArray4853[8] * aFloatArray4853[13]
	       + (aFloatArray4853[3] * aFloatArray4853[9]
		  * aFloatArray4853[12])) * f;
	float f_131_
	    = ((aFloatArray4853[0] * aFloatArray4853[5] * aFloatArray4853[15]
		- aFloatArray4853[0] * aFloatArray4853[7] * aFloatArray4853[13]
		- aFloatArray4853[1] * aFloatArray4853[4] * aFloatArray4853[15]
		+ aFloatArray4853[1] * aFloatArray4853[7] * aFloatArray4853[12]
		+ aFloatArray4853[3] * aFloatArray4853[4] * aFloatArray4853[13]
		- (aFloatArray4853[3] * aFloatArray4853[5]
		   * aFloatArray4853[12]))
	       * f);
	float f_132_
	    = ((-aFloatArray4853[0] * aFloatArray4853[5] * aFloatArray4853[11]
		+ aFloatArray4853[0] * aFloatArray4853[7] * aFloatArray4853[9]
		+ aFloatArray4853[1] * aFloatArray4853[4] * aFloatArray4853[11]
		- aFloatArray4853[1] * aFloatArray4853[7] * aFloatArray4853[8]
		- aFloatArray4853[3] * aFloatArray4853[4] * aFloatArray4853[9]
		+ aFloatArray4853[3] * aFloatArray4853[5] * aFloatArray4853[8])
	       * f);
	float f_133_
	    = (-aFloatArray4853[4] * aFloatArray4853[9] * aFloatArray4853[14]
	       + aFloatArray4853[4] * aFloatArray4853[10] * aFloatArray4853[13]
	       + aFloatArray4853[5] * aFloatArray4853[8] * aFloatArray4853[14]
	       - aFloatArray4853[5] * aFloatArray4853[10] * aFloatArray4853[12]
	       - aFloatArray4853[6] * aFloatArray4853[8] * aFloatArray4853[13]
	       + (aFloatArray4853[6] * aFloatArray4853[9]
		  * aFloatArray4853[12])) * f;
	float f_134_
	    = (aFloatArray4853[0] * aFloatArray4853[9] * aFloatArray4853[14]
	       - aFloatArray4853[0] * aFloatArray4853[10] * aFloatArray4853[13]
	       - aFloatArray4853[1] * aFloatArray4853[8] * aFloatArray4853[14]
	       + aFloatArray4853[1] * aFloatArray4853[10] * aFloatArray4853[12]
	       + aFloatArray4853[2] * aFloatArray4853[8] * aFloatArray4853[13]
	       - (aFloatArray4853[2] * aFloatArray4853[9]
		  * aFloatArray4853[12])) * f;
	float f_135_
	    = ((-aFloatArray4853[0] * aFloatArray4853[5] * aFloatArray4853[14]
		+ aFloatArray4853[0] * aFloatArray4853[6] * aFloatArray4853[13]
		+ aFloatArray4853[1] * aFloatArray4853[4] * aFloatArray4853[14]
		- aFloatArray4853[1] * aFloatArray4853[6] * aFloatArray4853[12]
		- aFloatArray4853[2] * aFloatArray4853[4] * aFloatArray4853[13]
		+ (aFloatArray4853[2] * aFloatArray4853[5]
		   * aFloatArray4853[12]))
	       * f);
	float f_136_
	    = ((aFloatArray4853[0] * aFloatArray4853[5] * aFloatArray4853[10]
		- aFloatArray4853[0] * aFloatArray4853[6] * aFloatArray4853[9]
		- aFloatArray4853[1] * aFloatArray4853[4] * aFloatArray4853[10]
		+ aFloatArray4853[1] * aFloatArray4853[6] * aFloatArray4853[8]
		+ aFloatArray4853[2] * aFloatArray4853[4] * aFloatArray4853[9]
		- aFloatArray4853[2] * aFloatArray4853[5] * aFloatArray4853[8])
	       * f);
	aFloatArray4853[0] = f_121_;
	aFloatArray4853[1] = f_122_;
	aFloatArray4853[2] = f_123_;
	aFloatArray4853[3] = f_124_;
	aFloatArray4853[4] = f_125_;
	aFloatArray4853[5] = f_126_;
	aFloatArray4853[6] = f_127_;
	aFloatArray4853[7] = f_128_;
	aFloatArray4853[8] = f_129_;
	aFloatArray4853[9] = f_130_;
	aFloatArray4853[10] = f_131_;
	aFloatArray4853[11] = f_132_;
	aFloatArray4853[12] = f_133_;
	aFloatArray4853[13] = f_134_;
	aFloatArray4853[14] = f_135_;
	aFloatArray4853[15] = f_136_;
    }
    
    public float[] method6872(float[] fs) {
	fs[0] = aFloatArray4853[0];
	fs[1] = aFloatArray4853[1];
	fs[2] = aFloatArray4853[4];
	fs[3] = aFloatArray4853[5];
	fs[4] = aFloatArray4853[8];
	fs[5] = aFloatArray4853[9];
	fs[6] = aFloatArray4853[12];
	fs[7] = aFloatArray4853[13];
	return fs;
    }
    
    public float[] method6873(float[] fs) {
	fs[0] = aFloatArray4853[0];
	fs[1] = aFloatArray4853[4];
	fs[2] = aFloatArray4853[8];
	fs[3] = aFloatArray4853[12];
	fs[4] = aFloatArray4853[1];
	fs[5] = aFloatArray4853[5];
	fs[6] = aFloatArray4853[9];
	fs[7] = aFloatArray4853[13];
	return fs;
    }
    
    public float[] method6874(float[] fs) {
	fs[0] = aFloatArray4853[0];
	fs[1] = aFloatArray4853[1];
	fs[2] = 0.0F;
	fs[3] = 0.0F;
	fs[4] = aFloatArray4853[4];
	fs[5] = aFloatArray4853[5];
	fs[6] = 0.0F;
	fs[7] = 0.0F;
	fs[8] = aFloatArray4853[12];
	fs[9] = aFloatArray4853[13];
	fs[10] = aFloatArray4853[14];
	fs[11] = 0.0F;
	fs[12] = 0.0F;
	fs[13] = 0.0F;
	fs[14] = 0.0F;
	fs[15] = 1.0F;
	return fs;
    }
    
    public int method6875() {
	int i = 1;
	i = 31 * i + Arrays.hashCode(aFloatArray4853);
	return i;
    }
    
    public float[] method6876(float[] fs) {
	fs[0] = aFloatArray4853[0];
	fs[1] = aFloatArray4853[4];
	fs[2] = aFloatArray4853[8];
	fs[3] = aFloatArray4853[12];
	fs[4] = aFloatArray4853[1];
	fs[5] = aFloatArray4853[5];
	fs[6] = aFloatArray4853[9];
	fs[7] = aFloatArray4853[13];
	fs[8] = aFloatArray4853[2];
	fs[9] = aFloatArray4853[6];
	fs[10] = aFloatArray4853[10];
	fs[11] = aFloatArray4853[14];
	fs[12] = aFloatArray4853[3];
	fs[13] = aFloatArray4853[7];
	fs[14] = aFloatArray4853[11];
	fs[15] = aFloatArray4853[15];
	return fs;
    }
    
    public int hashCode() {
	int i = 1;
	i = 31 * i + Arrays.hashCode(aFloatArray4853);
	return i;
    }
    
    public boolean equals(Object object) {
	if (!(object instanceof Class433))
	    return false;
	Class433 class433_137_ = (Class433) object;
	for (int i = 0; i < 16; i++) {
	    if (aFloatArray4853[i] != class433_137_.aFloatArray4853[i])
		return false;
	}
	return true;
    }
    
    public boolean method6877(Object object) {
	if (!(object instanceof Class433))
	    return false;
	Class433 class433_138_ = (Class433) object;
	for (int i = 0; i < 16; i++) {
	    if (aFloatArray4853[i] != class433_138_.aFloatArray4853[i])
		return false;
	}
	return true;
    }
    
    public boolean method6878(Object object) {
	if (!(object instanceof Class433))
	    return false;
	Class433 class433_139_ = (Class433) object;
	for (int i = 0; i < 16; i++) {
	    if (aFloatArray4853[i] != class433_139_.aFloatArray4853[i])
		return false;
	}
	return true;
    }
    
    public float[] method6879(float[] fs) {
	float f = aFloatArray4853[3] + aFloatArray4853[1];
	float f_140_ = aFloatArray4853[7] + aFloatArray4853[5];
	float f_141_ = aFloatArray4853[11] + aFloatArray4853[9];
	double d
	    = Math.sqrt((double) (f * f + f_140_ * f_140_ + f_141_ * f_141_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_140_ / d);
	fs[2] = (float) ((double) f_141_ / d);
	fs[3] = (float) ((double) (aFloatArray4853[15] + aFloatArray4853[13])
			 / d);
	return fs;
    }
    
    public boolean method6880(Object object) {
	if (!(object instanceof Class433))
	    return false;
	Class433 class433_142_ = (Class433) object;
	for (int i = 0; i < 16; i++) {
	    if (aFloatArray4853[i] != class433_142_.aFloatArray4853[i])
		return false;
	}
	return true;
    }
    
    public float[] method6881(float[] fs) {
	float f = aFloatArray4853[3] + aFloatArray4853[0];
	float f_143_ = aFloatArray4853[7] + aFloatArray4853[4];
	float f_144_ = aFloatArray4853[11] + aFloatArray4853[8];
	double d
	    = Math.sqrt((double) (f * f + f_143_ * f_143_ + f_144_ * f_144_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_143_ / d);
	fs[2] = (float) ((double) f_144_ / d);
	fs[3] = (float) ((double) (aFloatArray4853[15] + aFloatArray4853[12])
			 / d);
	return fs;
    }
    
    public String method6882() {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i = 0; i < 4; i++) {
	    for (int i_145_ = 0; i_145_ < 4; i_145_++) {
		if (i_145_ > 0)
		    stringbuilder.append("\t");
		stringbuilder.append(aFloatArray4853[i * 4 + i_145_]);
	    }
	    stringbuilder.append("\n");
	}
	return stringbuilder.toString();
    }
    
    public String method6883() {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i = 0; i < 4; i++) {
	    for (int i_146_ = 0; i_146_ < 4; i_146_++) {
		if (i_146_ > 0)
		    stringbuilder.append("\t");
		stringbuilder.append(aFloatArray4853[i * 4 + i_146_]);
	    }
	    stringbuilder.append("\n");
	}
	return stringbuilder.toString();
    }
    
    public void method6884() {
	aFloatArray4853[0] = 1.0F;
	aFloatArray4853[1] = 0.0F;
	aFloatArray4853[2] = 0.0F;
	aFloatArray4853[3] = 0.0F;
	aFloatArray4853[4] = 0.0F;
	aFloatArray4853[5] = 1.0F;
	aFloatArray4853[6] = 0.0F;
	aFloatArray4853[7] = 0.0F;
	aFloatArray4853[8] = 0.0F;
	aFloatArray4853[9] = 0.0F;
	aFloatArray4853[10] = 1.0F;
	aFloatArray4853[11] = 0.0F;
	aFloatArray4853[12] = 0.0F;
	aFloatArray4853[13] = 0.0F;
	aFloatArray4853[14] = 0.0F;
	aFloatArray4853[15] = 1.0F;
    }
    
    void method6885(float f, float f_147_, float f_148_, float f_149_,
		    float f_150_, float f_151_) {
	aFloatArray4853[0] = 2.0F * f_150_ / (f_147_ - f);
	aFloatArray4853[1] = 0.0F;
	aFloatArray4853[2] = 0.0F;
	aFloatArray4853[3] = 0.0F;
	aFloatArray4853[4] = 0.0F;
	aFloatArray4853[5] = 2.0F * f_150_ / (f_149_ - f_148_);
	aFloatArray4853[6] = 0.0F;
	aFloatArray4853[7] = 0.0F;
	aFloatArray4853[8] = (f_147_ + f) / (f_147_ - f);
	aFloatArray4853[9] = (f_149_ + f_148_) / (f_149_ - f_148_);
	aFloatArray4853[10] = (f_151_ + f_150_) / (f_151_ - f_150_);
	aFloatArray4853[11] = 1.0F;
	aFloatArray4853[12] = 0.0F;
	aFloatArray4853[13] = 0.0F;
	aFloatArray4853[14] = -(2.0F * f_151_ * f_150_) / (f_151_ - f_150_);
	aFloatArray4853[15] = 0.0F;
    }
    
    public void method6886(Class433 class433_152_) {
	System.arraycopy(class433_152_.aFloatArray4853, 0, aFloatArray4853, 0,
			 16);
    }
    
    public void method6887(Class433 class433_153_) {
	System.arraycopy(class433_153_.aFloatArray4853, 0, aFloatArray4853, 0,
			 11);
	aFloatArray4853[3] = 0.0F;
	aFloatArray4853[7] = 0.0F;
	aFloatArray4853[11] = 0.0F;
	aFloatArray4853[12] = 0.0F;
	aFloatArray4853[13] = 0.0F;
	aFloatArray4853[14] = 0.0F;
	aFloatArray4853[15] = 1.0F;
    }
    
    public void method6888(Class433 class433_154_) {
	System.arraycopy(class433_154_.aFloatArray4853, 0, aFloatArray4853, 0,
			 11);
	aFloatArray4853[3] = 0.0F;
	aFloatArray4853[7] = 0.0F;
	aFloatArray4853[11] = 0.0F;
	aFloatArray4853[12] = 0.0F;
	aFloatArray4853[13] = 0.0F;
	aFloatArray4853[14] = 0.0F;
	aFloatArray4853[15] = 1.0F;
    }
    
    public void method6889(Class433 class433_155_) {
	System.arraycopy(class433_155_.aFloatArray4853, 0, aFloatArray4853, 0,
			 11);
	aFloatArray4853[3] = 0.0F;
	aFloatArray4853[7] = 0.0F;
	aFloatArray4853[11] = 0.0F;
	aFloatArray4853[12] = 0.0F;
	aFloatArray4853[13] = 0.0F;
	aFloatArray4853[14] = 0.0F;
	aFloatArray4853[15] = 1.0F;
    }
    
    public void method6890(Class433 class433_156_, Class433 class433_157_) {
	float f = ((class433_156_.aFloatArray4853[0]
		    * class433_157_.aFloatArray4853[0])
		   + (class433_156_.aFloatArray4853[1]
		      * class433_157_.aFloatArray4853[4])
		   + (class433_156_.aFloatArray4853[2]
		      * class433_157_.aFloatArray4853[8])
		   + (class433_156_.aFloatArray4853[3]
		      * class433_157_.aFloatArray4853[12]));
	float f_158_ = ((class433_156_.aFloatArray4853[0]
			 * class433_157_.aFloatArray4853[1])
			+ (class433_156_.aFloatArray4853[1]
			   * class433_157_.aFloatArray4853[5])
			+ (class433_156_.aFloatArray4853[2]
			   * class433_157_.aFloatArray4853[9])
			+ (class433_156_.aFloatArray4853[3]
			   * class433_157_.aFloatArray4853[13]));
	float f_159_ = ((class433_156_.aFloatArray4853[0]
			 * class433_157_.aFloatArray4853[2])
			+ (class433_156_.aFloatArray4853[1]
			   * class433_157_.aFloatArray4853[6])
			+ (class433_156_.aFloatArray4853[2]
			   * class433_157_.aFloatArray4853[10])
			+ (class433_156_.aFloatArray4853[3]
			   * class433_157_.aFloatArray4853[14]));
	float f_160_ = ((class433_156_.aFloatArray4853[0]
			 * class433_157_.aFloatArray4853[3])
			+ (class433_156_.aFloatArray4853[1]
			   * class433_157_.aFloatArray4853[7])
			+ (class433_156_.aFloatArray4853[2]
			   * class433_157_.aFloatArray4853[11])
			+ (class433_156_.aFloatArray4853[3]
			   * class433_157_.aFloatArray4853[15]));
	float f_161_ = ((class433_156_.aFloatArray4853[4]
			 * class433_157_.aFloatArray4853[0])
			+ (class433_156_.aFloatArray4853[5]
			   * class433_157_.aFloatArray4853[4])
			+ (class433_156_.aFloatArray4853[6]
			   * class433_157_.aFloatArray4853[8])
			+ (class433_156_.aFloatArray4853[7]
			   * class433_157_.aFloatArray4853[12]));
	float f_162_ = ((class433_156_.aFloatArray4853[4]
			 * class433_157_.aFloatArray4853[1])
			+ (class433_156_.aFloatArray4853[5]
			   * class433_157_.aFloatArray4853[5])
			+ (class433_156_.aFloatArray4853[6]
			   * class433_157_.aFloatArray4853[9])
			+ (class433_156_.aFloatArray4853[7]
			   * class433_157_.aFloatArray4853[13]));
	float f_163_ = ((class433_156_.aFloatArray4853[4]
			 * class433_157_.aFloatArray4853[2])
			+ (class433_156_.aFloatArray4853[5]
			   * class433_157_.aFloatArray4853[6])
			+ (class433_156_.aFloatArray4853[6]
			   * class433_157_.aFloatArray4853[10])
			+ (class433_156_.aFloatArray4853[7]
			   * class433_157_.aFloatArray4853[14]));
	float f_164_ = ((class433_156_.aFloatArray4853[4]
			 * class433_157_.aFloatArray4853[3])
			+ (class433_156_.aFloatArray4853[5]
			   * class433_157_.aFloatArray4853[7])
			+ (class433_156_.aFloatArray4853[6]
			   * class433_157_.aFloatArray4853[11])
			+ (class433_156_.aFloatArray4853[7]
			   * class433_157_.aFloatArray4853[15]));
	float f_165_ = ((class433_156_.aFloatArray4853[8]
			 * class433_157_.aFloatArray4853[0])
			+ (class433_156_.aFloatArray4853[9]
			   * class433_157_.aFloatArray4853[4])
			+ (class433_156_.aFloatArray4853[10]
			   * class433_157_.aFloatArray4853[8])
			+ (class433_156_.aFloatArray4853[11]
			   * class433_157_.aFloatArray4853[12]));
	float f_166_ = ((class433_156_.aFloatArray4853[8]
			 * class433_157_.aFloatArray4853[1])
			+ (class433_156_.aFloatArray4853[9]
			   * class433_157_.aFloatArray4853[5])
			+ (class433_156_.aFloatArray4853[10]
			   * class433_157_.aFloatArray4853[9])
			+ (class433_156_.aFloatArray4853[11]
			   * class433_157_.aFloatArray4853[13]));
	float f_167_ = ((class433_156_.aFloatArray4853[8]
			 * class433_157_.aFloatArray4853[2])
			+ (class433_156_.aFloatArray4853[9]
			   * class433_157_.aFloatArray4853[6])
			+ (class433_156_.aFloatArray4853[10]
			   * class433_157_.aFloatArray4853[10])
			+ (class433_156_.aFloatArray4853[11]
			   * class433_157_.aFloatArray4853[14]));
	float f_168_ = ((class433_156_.aFloatArray4853[8]
			 * class433_157_.aFloatArray4853[3])
			+ (class433_156_.aFloatArray4853[9]
			   * class433_157_.aFloatArray4853[7])
			+ (class433_156_.aFloatArray4853[10]
			   * class433_157_.aFloatArray4853[11])
			+ (class433_156_.aFloatArray4853[11]
			   * class433_157_.aFloatArray4853[15]));
	float f_169_ = ((class433_156_.aFloatArray4853[12]
			 * class433_157_.aFloatArray4853[0])
			+ (class433_156_.aFloatArray4853[13]
			   * class433_157_.aFloatArray4853[4])
			+ (class433_156_.aFloatArray4853[14]
			   * class433_157_.aFloatArray4853[8])
			+ (class433_156_.aFloatArray4853[15]
			   * class433_157_.aFloatArray4853[12]));
	float f_170_ = ((class433_156_.aFloatArray4853[12]
			 * class433_157_.aFloatArray4853[1])
			+ (class433_156_.aFloatArray4853[13]
			   * class433_157_.aFloatArray4853[5])
			+ (class433_156_.aFloatArray4853[14]
			   * class433_157_.aFloatArray4853[9])
			+ (class433_156_.aFloatArray4853[15]
			   * class433_157_.aFloatArray4853[13]));
	float f_171_ = ((class433_156_.aFloatArray4853[12]
			 * class433_157_.aFloatArray4853[2])
			+ (class433_156_.aFloatArray4853[13]
			   * class433_157_.aFloatArray4853[6])
			+ (class433_156_.aFloatArray4853[14]
			   * class433_157_.aFloatArray4853[10])
			+ (class433_156_.aFloatArray4853[15]
			   * class433_157_.aFloatArray4853[14]));
	float f_172_ = ((class433_156_.aFloatArray4853[12]
			 * class433_157_.aFloatArray4853[3])
			+ (class433_156_.aFloatArray4853[13]
			   * class433_157_.aFloatArray4853[7])
			+ (class433_156_.aFloatArray4853[14]
			   * class433_157_.aFloatArray4853[11])
			+ (class433_156_.aFloatArray4853[15]
			   * class433_157_.aFloatArray4853[15]));
	aFloatArray4853[0] = f;
	aFloatArray4853[1] = f_158_;
	aFloatArray4853[2] = f_159_;
	aFloatArray4853[3] = f_160_;
	aFloatArray4853[4] = f_161_;
	aFloatArray4853[5] = f_162_;
	aFloatArray4853[6] = f_163_;
	aFloatArray4853[7] = f_164_;
	aFloatArray4853[8] = f_165_;
	aFloatArray4853[9] = f_166_;
	aFloatArray4853[10] = f_167_;
	aFloatArray4853[11] = f_168_;
	aFloatArray4853[12] = f_169_;
	aFloatArray4853[13] = f_170_;
	aFloatArray4853[14] = f_171_;
	aFloatArray4853[15] = f_172_;
    }
    
    public void method6891(Class433 class433_173_, Class433 class433_174_) {
	float f = ((class433_173_.aFloatArray4853[0]
		    * class433_174_.aFloatArray4853[0])
		   + (class433_173_.aFloatArray4853[1]
		      * class433_174_.aFloatArray4853[4])
		   + (class433_173_.aFloatArray4853[2]
		      * class433_174_.aFloatArray4853[8])
		   + (class433_173_.aFloatArray4853[3]
		      * class433_174_.aFloatArray4853[12]));
	float f_175_ = ((class433_173_.aFloatArray4853[0]
			 * class433_174_.aFloatArray4853[1])
			+ (class433_173_.aFloatArray4853[1]
			   * class433_174_.aFloatArray4853[5])
			+ (class433_173_.aFloatArray4853[2]
			   * class433_174_.aFloatArray4853[9])
			+ (class433_173_.aFloatArray4853[3]
			   * class433_174_.aFloatArray4853[13]));
	float f_176_ = ((class433_173_.aFloatArray4853[0]
			 * class433_174_.aFloatArray4853[2])
			+ (class433_173_.aFloatArray4853[1]
			   * class433_174_.aFloatArray4853[6])
			+ (class433_173_.aFloatArray4853[2]
			   * class433_174_.aFloatArray4853[10])
			+ (class433_173_.aFloatArray4853[3]
			   * class433_174_.aFloatArray4853[14]));
	float f_177_ = ((class433_173_.aFloatArray4853[0]
			 * class433_174_.aFloatArray4853[3])
			+ (class433_173_.aFloatArray4853[1]
			   * class433_174_.aFloatArray4853[7])
			+ (class433_173_.aFloatArray4853[2]
			   * class433_174_.aFloatArray4853[11])
			+ (class433_173_.aFloatArray4853[3]
			   * class433_174_.aFloatArray4853[15]));
	float f_178_ = ((class433_173_.aFloatArray4853[4]
			 * class433_174_.aFloatArray4853[0])
			+ (class433_173_.aFloatArray4853[5]
			   * class433_174_.aFloatArray4853[4])
			+ (class433_173_.aFloatArray4853[6]
			   * class433_174_.aFloatArray4853[8])
			+ (class433_173_.aFloatArray4853[7]
			   * class433_174_.aFloatArray4853[12]));
	float f_179_ = ((class433_173_.aFloatArray4853[4]
			 * class433_174_.aFloatArray4853[1])
			+ (class433_173_.aFloatArray4853[5]
			   * class433_174_.aFloatArray4853[5])
			+ (class433_173_.aFloatArray4853[6]
			   * class433_174_.aFloatArray4853[9])
			+ (class433_173_.aFloatArray4853[7]
			   * class433_174_.aFloatArray4853[13]));
	float f_180_ = ((class433_173_.aFloatArray4853[4]
			 * class433_174_.aFloatArray4853[2])
			+ (class433_173_.aFloatArray4853[5]
			   * class433_174_.aFloatArray4853[6])
			+ (class433_173_.aFloatArray4853[6]
			   * class433_174_.aFloatArray4853[10])
			+ (class433_173_.aFloatArray4853[7]
			   * class433_174_.aFloatArray4853[14]));
	float f_181_ = ((class433_173_.aFloatArray4853[4]
			 * class433_174_.aFloatArray4853[3])
			+ (class433_173_.aFloatArray4853[5]
			   * class433_174_.aFloatArray4853[7])
			+ (class433_173_.aFloatArray4853[6]
			   * class433_174_.aFloatArray4853[11])
			+ (class433_173_.aFloatArray4853[7]
			   * class433_174_.aFloatArray4853[15]));
	float f_182_ = ((class433_173_.aFloatArray4853[8]
			 * class433_174_.aFloatArray4853[0])
			+ (class433_173_.aFloatArray4853[9]
			   * class433_174_.aFloatArray4853[4])
			+ (class433_173_.aFloatArray4853[10]
			   * class433_174_.aFloatArray4853[8])
			+ (class433_173_.aFloatArray4853[11]
			   * class433_174_.aFloatArray4853[12]));
	float f_183_ = ((class433_173_.aFloatArray4853[8]
			 * class433_174_.aFloatArray4853[1])
			+ (class433_173_.aFloatArray4853[9]
			   * class433_174_.aFloatArray4853[5])
			+ (class433_173_.aFloatArray4853[10]
			   * class433_174_.aFloatArray4853[9])
			+ (class433_173_.aFloatArray4853[11]
			   * class433_174_.aFloatArray4853[13]));
	float f_184_ = ((class433_173_.aFloatArray4853[8]
			 * class433_174_.aFloatArray4853[2])
			+ (class433_173_.aFloatArray4853[9]
			   * class433_174_.aFloatArray4853[6])
			+ (class433_173_.aFloatArray4853[10]
			   * class433_174_.aFloatArray4853[10])
			+ (class433_173_.aFloatArray4853[11]
			   * class433_174_.aFloatArray4853[14]));
	float f_185_ = ((class433_173_.aFloatArray4853[8]
			 * class433_174_.aFloatArray4853[3])
			+ (class433_173_.aFloatArray4853[9]
			   * class433_174_.aFloatArray4853[7])
			+ (class433_173_.aFloatArray4853[10]
			   * class433_174_.aFloatArray4853[11])
			+ (class433_173_.aFloatArray4853[11]
			   * class433_174_.aFloatArray4853[15]));
	float f_186_ = ((class433_173_.aFloatArray4853[12]
			 * class433_174_.aFloatArray4853[0])
			+ (class433_173_.aFloatArray4853[13]
			   * class433_174_.aFloatArray4853[4])
			+ (class433_173_.aFloatArray4853[14]
			   * class433_174_.aFloatArray4853[8])
			+ (class433_173_.aFloatArray4853[15]
			   * class433_174_.aFloatArray4853[12]));
	float f_187_ = ((class433_173_.aFloatArray4853[12]
			 * class433_174_.aFloatArray4853[1])
			+ (class433_173_.aFloatArray4853[13]
			   * class433_174_.aFloatArray4853[5])
			+ (class433_173_.aFloatArray4853[14]
			   * class433_174_.aFloatArray4853[9])
			+ (class433_173_.aFloatArray4853[15]
			   * class433_174_.aFloatArray4853[13]));
	float f_188_ = ((class433_173_.aFloatArray4853[12]
			 * class433_174_.aFloatArray4853[2])
			+ (class433_173_.aFloatArray4853[13]
			   * class433_174_.aFloatArray4853[6])
			+ (class433_173_.aFloatArray4853[14]
			   * class433_174_.aFloatArray4853[10])
			+ (class433_173_.aFloatArray4853[15]
			   * class433_174_.aFloatArray4853[14]));
	float f_189_ = ((class433_173_.aFloatArray4853[12]
			 * class433_174_.aFloatArray4853[3])
			+ (class433_173_.aFloatArray4853[13]
			   * class433_174_.aFloatArray4853[7])
			+ (class433_173_.aFloatArray4853[14]
			   * class433_174_.aFloatArray4853[11])
			+ (class433_173_.aFloatArray4853[15]
			   * class433_174_.aFloatArray4853[15]));
	aFloatArray4853[0] = f;
	aFloatArray4853[1] = f_175_;
	aFloatArray4853[2] = f_176_;
	aFloatArray4853[3] = f_177_;
	aFloatArray4853[4] = f_178_;
	aFloatArray4853[5] = f_179_;
	aFloatArray4853[6] = f_180_;
	aFloatArray4853[7] = f_181_;
	aFloatArray4853[8] = f_182_;
	aFloatArray4853[9] = f_183_;
	aFloatArray4853[10] = f_184_;
	aFloatArray4853[11] = f_185_;
	aFloatArray4853[12] = f_186_;
	aFloatArray4853[13] = f_187_;
	aFloatArray4853[14] = f_188_;
	aFloatArray4853[15] = f_189_;
    }
    
    public void method6892(Class433 class433_190_, Class433 class433_191_) {
	float f = ((class433_190_.aFloatArray4853[0]
		    * class433_191_.aFloatArray4853[0])
		   + (class433_190_.aFloatArray4853[1]
		      * class433_191_.aFloatArray4853[4])
		   + (class433_190_.aFloatArray4853[2]
		      * class433_191_.aFloatArray4853[8])
		   + (class433_190_.aFloatArray4853[3]
		      * class433_191_.aFloatArray4853[12]));
	float f_192_ = ((class433_190_.aFloatArray4853[0]
			 * class433_191_.aFloatArray4853[1])
			+ (class433_190_.aFloatArray4853[1]
			   * class433_191_.aFloatArray4853[5])
			+ (class433_190_.aFloatArray4853[2]
			   * class433_191_.aFloatArray4853[9])
			+ (class433_190_.aFloatArray4853[3]
			   * class433_191_.aFloatArray4853[13]));
	float f_193_ = ((class433_190_.aFloatArray4853[0]
			 * class433_191_.aFloatArray4853[2])
			+ (class433_190_.aFloatArray4853[1]
			   * class433_191_.aFloatArray4853[6])
			+ (class433_190_.aFloatArray4853[2]
			   * class433_191_.aFloatArray4853[10])
			+ (class433_190_.aFloatArray4853[3]
			   * class433_191_.aFloatArray4853[14]));
	float f_194_ = ((class433_190_.aFloatArray4853[0]
			 * class433_191_.aFloatArray4853[3])
			+ (class433_190_.aFloatArray4853[1]
			   * class433_191_.aFloatArray4853[7])
			+ (class433_190_.aFloatArray4853[2]
			   * class433_191_.aFloatArray4853[11])
			+ (class433_190_.aFloatArray4853[3]
			   * class433_191_.aFloatArray4853[15]));
	float f_195_ = ((class433_190_.aFloatArray4853[4]
			 * class433_191_.aFloatArray4853[0])
			+ (class433_190_.aFloatArray4853[5]
			   * class433_191_.aFloatArray4853[4])
			+ (class433_190_.aFloatArray4853[6]
			   * class433_191_.aFloatArray4853[8])
			+ (class433_190_.aFloatArray4853[7]
			   * class433_191_.aFloatArray4853[12]));
	float f_196_ = ((class433_190_.aFloatArray4853[4]
			 * class433_191_.aFloatArray4853[1])
			+ (class433_190_.aFloatArray4853[5]
			   * class433_191_.aFloatArray4853[5])
			+ (class433_190_.aFloatArray4853[6]
			   * class433_191_.aFloatArray4853[9])
			+ (class433_190_.aFloatArray4853[7]
			   * class433_191_.aFloatArray4853[13]));
	float f_197_ = ((class433_190_.aFloatArray4853[4]
			 * class433_191_.aFloatArray4853[2])
			+ (class433_190_.aFloatArray4853[5]
			   * class433_191_.aFloatArray4853[6])
			+ (class433_190_.aFloatArray4853[6]
			   * class433_191_.aFloatArray4853[10])
			+ (class433_190_.aFloatArray4853[7]
			   * class433_191_.aFloatArray4853[14]));
	float f_198_ = ((class433_190_.aFloatArray4853[4]
			 * class433_191_.aFloatArray4853[3])
			+ (class433_190_.aFloatArray4853[5]
			   * class433_191_.aFloatArray4853[7])
			+ (class433_190_.aFloatArray4853[6]
			   * class433_191_.aFloatArray4853[11])
			+ (class433_190_.aFloatArray4853[7]
			   * class433_191_.aFloatArray4853[15]));
	float f_199_ = ((class433_190_.aFloatArray4853[8]
			 * class433_191_.aFloatArray4853[0])
			+ (class433_190_.aFloatArray4853[9]
			   * class433_191_.aFloatArray4853[4])
			+ (class433_190_.aFloatArray4853[10]
			   * class433_191_.aFloatArray4853[8])
			+ (class433_190_.aFloatArray4853[11]
			   * class433_191_.aFloatArray4853[12]));
	float f_200_ = ((class433_190_.aFloatArray4853[8]
			 * class433_191_.aFloatArray4853[1])
			+ (class433_190_.aFloatArray4853[9]
			   * class433_191_.aFloatArray4853[5])
			+ (class433_190_.aFloatArray4853[10]
			   * class433_191_.aFloatArray4853[9])
			+ (class433_190_.aFloatArray4853[11]
			   * class433_191_.aFloatArray4853[13]));
	float f_201_ = ((class433_190_.aFloatArray4853[8]
			 * class433_191_.aFloatArray4853[2])
			+ (class433_190_.aFloatArray4853[9]
			   * class433_191_.aFloatArray4853[6])
			+ (class433_190_.aFloatArray4853[10]
			   * class433_191_.aFloatArray4853[10])
			+ (class433_190_.aFloatArray4853[11]
			   * class433_191_.aFloatArray4853[14]));
	float f_202_ = ((class433_190_.aFloatArray4853[8]
			 * class433_191_.aFloatArray4853[3])
			+ (class433_190_.aFloatArray4853[9]
			   * class433_191_.aFloatArray4853[7])
			+ (class433_190_.aFloatArray4853[10]
			   * class433_191_.aFloatArray4853[11])
			+ (class433_190_.aFloatArray4853[11]
			   * class433_191_.aFloatArray4853[15]));
	float f_203_ = ((class433_190_.aFloatArray4853[12]
			 * class433_191_.aFloatArray4853[0])
			+ (class433_190_.aFloatArray4853[13]
			   * class433_191_.aFloatArray4853[4])
			+ (class433_190_.aFloatArray4853[14]
			   * class433_191_.aFloatArray4853[8])
			+ (class433_190_.aFloatArray4853[15]
			   * class433_191_.aFloatArray4853[12]));
	float f_204_ = ((class433_190_.aFloatArray4853[12]
			 * class433_191_.aFloatArray4853[1])
			+ (class433_190_.aFloatArray4853[13]
			   * class433_191_.aFloatArray4853[5])
			+ (class433_190_.aFloatArray4853[14]
			   * class433_191_.aFloatArray4853[9])
			+ (class433_190_.aFloatArray4853[15]
			   * class433_191_.aFloatArray4853[13]));
	float f_205_ = ((class433_190_.aFloatArray4853[12]
			 * class433_191_.aFloatArray4853[2])
			+ (class433_190_.aFloatArray4853[13]
			   * class433_191_.aFloatArray4853[6])
			+ (class433_190_.aFloatArray4853[14]
			   * class433_191_.aFloatArray4853[10])
			+ (class433_190_.aFloatArray4853[15]
			   * class433_191_.aFloatArray4853[14]));
	float f_206_ = ((class433_190_.aFloatArray4853[12]
			 * class433_191_.aFloatArray4853[3])
			+ (class433_190_.aFloatArray4853[13]
			   * class433_191_.aFloatArray4853[7])
			+ (class433_190_.aFloatArray4853[14]
			   * class433_191_.aFloatArray4853[11])
			+ (class433_190_.aFloatArray4853[15]
			   * class433_191_.aFloatArray4853[15]));
	aFloatArray4853[0] = f;
	aFloatArray4853[1] = f_192_;
	aFloatArray4853[2] = f_193_;
	aFloatArray4853[3] = f_194_;
	aFloatArray4853[4] = f_195_;
	aFloatArray4853[5] = f_196_;
	aFloatArray4853[6] = f_197_;
	aFloatArray4853[7] = f_198_;
	aFloatArray4853[8] = f_199_;
	aFloatArray4853[9] = f_200_;
	aFloatArray4853[10] = f_201_;
	aFloatArray4853[11] = f_202_;
	aFloatArray4853[12] = f_203_;
	aFloatArray4853[13] = f_204_;
	aFloatArray4853[14] = f_205_;
	aFloatArray4853[15] = f_206_;
    }
    
    public void method6893(Class433 class433_207_, Class433 class433_208_) {
	float f = ((class433_207_.aFloatArray4853[0]
		    * class433_208_.aFloatArray4853[0])
		   + (class433_207_.aFloatArray4853[1]
		      * class433_208_.aFloatArray4853[4])
		   + (class433_207_.aFloatArray4853[2]
		      * class433_208_.aFloatArray4853[8])
		   + (class433_207_.aFloatArray4853[3]
		      * class433_208_.aFloatArray4853[12]));
	float f_209_ = ((class433_207_.aFloatArray4853[0]
			 * class433_208_.aFloatArray4853[1])
			+ (class433_207_.aFloatArray4853[1]
			   * class433_208_.aFloatArray4853[5])
			+ (class433_207_.aFloatArray4853[2]
			   * class433_208_.aFloatArray4853[9])
			+ (class433_207_.aFloatArray4853[3]
			   * class433_208_.aFloatArray4853[13]));
	float f_210_ = ((class433_207_.aFloatArray4853[0]
			 * class433_208_.aFloatArray4853[2])
			+ (class433_207_.aFloatArray4853[1]
			   * class433_208_.aFloatArray4853[6])
			+ (class433_207_.aFloatArray4853[2]
			   * class433_208_.aFloatArray4853[10])
			+ (class433_207_.aFloatArray4853[3]
			   * class433_208_.aFloatArray4853[14]));
	float f_211_ = ((class433_207_.aFloatArray4853[0]
			 * class433_208_.aFloatArray4853[3])
			+ (class433_207_.aFloatArray4853[1]
			   * class433_208_.aFloatArray4853[7])
			+ (class433_207_.aFloatArray4853[2]
			   * class433_208_.aFloatArray4853[11])
			+ (class433_207_.aFloatArray4853[3]
			   * class433_208_.aFloatArray4853[15]));
	float f_212_ = ((class433_207_.aFloatArray4853[4]
			 * class433_208_.aFloatArray4853[0])
			+ (class433_207_.aFloatArray4853[5]
			   * class433_208_.aFloatArray4853[4])
			+ (class433_207_.aFloatArray4853[6]
			   * class433_208_.aFloatArray4853[8])
			+ (class433_207_.aFloatArray4853[7]
			   * class433_208_.aFloatArray4853[12]));
	float f_213_ = ((class433_207_.aFloatArray4853[4]
			 * class433_208_.aFloatArray4853[1])
			+ (class433_207_.aFloatArray4853[5]
			   * class433_208_.aFloatArray4853[5])
			+ (class433_207_.aFloatArray4853[6]
			   * class433_208_.aFloatArray4853[9])
			+ (class433_207_.aFloatArray4853[7]
			   * class433_208_.aFloatArray4853[13]));
	float f_214_ = ((class433_207_.aFloatArray4853[4]
			 * class433_208_.aFloatArray4853[2])
			+ (class433_207_.aFloatArray4853[5]
			   * class433_208_.aFloatArray4853[6])
			+ (class433_207_.aFloatArray4853[6]
			   * class433_208_.aFloatArray4853[10])
			+ (class433_207_.aFloatArray4853[7]
			   * class433_208_.aFloatArray4853[14]));
	float f_215_ = ((class433_207_.aFloatArray4853[4]
			 * class433_208_.aFloatArray4853[3])
			+ (class433_207_.aFloatArray4853[5]
			   * class433_208_.aFloatArray4853[7])
			+ (class433_207_.aFloatArray4853[6]
			   * class433_208_.aFloatArray4853[11])
			+ (class433_207_.aFloatArray4853[7]
			   * class433_208_.aFloatArray4853[15]));
	float f_216_ = ((class433_207_.aFloatArray4853[8]
			 * class433_208_.aFloatArray4853[0])
			+ (class433_207_.aFloatArray4853[9]
			   * class433_208_.aFloatArray4853[4])
			+ (class433_207_.aFloatArray4853[10]
			   * class433_208_.aFloatArray4853[8])
			+ (class433_207_.aFloatArray4853[11]
			   * class433_208_.aFloatArray4853[12]));
	float f_217_ = ((class433_207_.aFloatArray4853[8]
			 * class433_208_.aFloatArray4853[1])
			+ (class433_207_.aFloatArray4853[9]
			   * class433_208_.aFloatArray4853[5])
			+ (class433_207_.aFloatArray4853[10]
			   * class433_208_.aFloatArray4853[9])
			+ (class433_207_.aFloatArray4853[11]
			   * class433_208_.aFloatArray4853[13]));
	float f_218_ = ((class433_207_.aFloatArray4853[8]
			 * class433_208_.aFloatArray4853[2])
			+ (class433_207_.aFloatArray4853[9]
			   * class433_208_.aFloatArray4853[6])
			+ (class433_207_.aFloatArray4853[10]
			   * class433_208_.aFloatArray4853[10])
			+ (class433_207_.aFloatArray4853[11]
			   * class433_208_.aFloatArray4853[14]));
	float f_219_ = ((class433_207_.aFloatArray4853[8]
			 * class433_208_.aFloatArray4853[3])
			+ (class433_207_.aFloatArray4853[9]
			   * class433_208_.aFloatArray4853[7])
			+ (class433_207_.aFloatArray4853[10]
			   * class433_208_.aFloatArray4853[11])
			+ (class433_207_.aFloatArray4853[11]
			   * class433_208_.aFloatArray4853[15]));
	float f_220_ = ((class433_207_.aFloatArray4853[12]
			 * class433_208_.aFloatArray4853[0])
			+ (class433_207_.aFloatArray4853[13]
			   * class433_208_.aFloatArray4853[4])
			+ (class433_207_.aFloatArray4853[14]
			   * class433_208_.aFloatArray4853[8])
			+ (class433_207_.aFloatArray4853[15]
			   * class433_208_.aFloatArray4853[12]));
	float f_221_ = ((class433_207_.aFloatArray4853[12]
			 * class433_208_.aFloatArray4853[1])
			+ (class433_207_.aFloatArray4853[13]
			   * class433_208_.aFloatArray4853[5])
			+ (class433_207_.aFloatArray4853[14]
			   * class433_208_.aFloatArray4853[9])
			+ (class433_207_.aFloatArray4853[15]
			   * class433_208_.aFloatArray4853[13]));
	float f_222_ = ((class433_207_.aFloatArray4853[12]
			 * class433_208_.aFloatArray4853[2])
			+ (class433_207_.aFloatArray4853[13]
			   * class433_208_.aFloatArray4853[6])
			+ (class433_207_.aFloatArray4853[14]
			   * class433_208_.aFloatArray4853[10])
			+ (class433_207_.aFloatArray4853[15]
			   * class433_208_.aFloatArray4853[14]));
	float f_223_ = ((class433_207_.aFloatArray4853[12]
			 * class433_208_.aFloatArray4853[3])
			+ (class433_207_.aFloatArray4853[13]
			   * class433_208_.aFloatArray4853[7])
			+ (class433_207_.aFloatArray4853[14]
			   * class433_208_.aFloatArray4853[11])
			+ (class433_207_.aFloatArray4853[15]
			   * class433_208_.aFloatArray4853[15]));
	aFloatArray4853[0] = f;
	aFloatArray4853[1] = f_209_;
	aFloatArray4853[2] = f_210_;
	aFloatArray4853[3] = f_211_;
	aFloatArray4853[4] = f_212_;
	aFloatArray4853[5] = f_213_;
	aFloatArray4853[6] = f_214_;
	aFloatArray4853[7] = f_215_;
	aFloatArray4853[8] = f_216_;
	aFloatArray4853[9] = f_217_;
	aFloatArray4853[10] = f_218_;
	aFloatArray4853[11] = f_219_;
	aFloatArray4853[12] = f_220_;
	aFloatArray4853[13] = f_221_;
	aFloatArray4853[14] = f_222_;
	aFloatArray4853[15] = f_223_;
    }
    
    public void method6894(Class433 class433_224_) {
	float f = (aFloatArray4853[0] * class433_224_.aFloatArray4853[0]
		   + aFloatArray4853[1] * class433_224_.aFloatArray4853[4]
		   + aFloatArray4853[2] * class433_224_.aFloatArray4853[8]
		   + aFloatArray4853[3] * class433_224_.aFloatArray4853[12]);
	float f_225_
	    = (aFloatArray4853[0] * class433_224_.aFloatArray4853[1]
	       + aFloatArray4853[1] * class433_224_.aFloatArray4853[5]
	       + aFloatArray4853[2] * class433_224_.aFloatArray4853[9]
	       + aFloatArray4853[3] * class433_224_.aFloatArray4853[13]);
	float f_226_
	    = (aFloatArray4853[0] * class433_224_.aFloatArray4853[2]
	       + aFloatArray4853[1] * class433_224_.aFloatArray4853[6]
	       + aFloatArray4853[2] * class433_224_.aFloatArray4853[10]
	       + aFloatArray4853[3] * class433_224_.aFloatArray4853[14]);
	float f_227_
	    = (aFloatArray4853[0] * class433_224_.aFloatArray4853[3]
	       + aFloatArray4853[1] * class433_224_.aFloatArray4853[7]
	       + aFloatArray4853[2] * class433_224_.aFloatArray4853[11]
	       + aFloatArray4853[3] * class433_224_.aFloatArray4853[15]);
	float f_228_
	    = (aFloatArray4853[4] * class433_224_.aFloatArray4853[0]
	       + aFloatArray4853[5] * class433_224_.aFloatArray4853[4]
	       + aFloatArray4853[6] * class433_224_.aFloatArray4853[8]
	       + aFloatArray4853[7] * class433_224_.aFloatArray4853[12]);
	float f_229_
	    = (aFloatArray4853[4] * class433_224_.aFloatArray4853[1]
	       + aFloatArray4853[5] * class433_224_.aFloatArray4853[5]
	       + aFloatArray4853[6] * class433_224_.aFloatArray4853[9]
	       + aFloatArray4853[7] * class433_224_.aFloatArray4853[13]);
	float f_230_
	    = (aFloatArray4853[4] * class433_224_.aFloatArray4853[2]
	       + aFloatArray4853[5] * class433_224_.aFloatArray4853[6]
	       + aFloatArray4853[6] * class433_224_.aFloatArray4853[10]
	       + aFloatArray4853[7] * class433_224_.aFloatArray4853[14]);
	float f_231_
	    = (aFloatArray4853[4] * class433_224_.aFloatArray4853[3]
	       + aFloatArray4853[5] * class433_224_.aFloatArray4853[7]
	       + aFloatArray4853[6] * class433_224_.aFloatArray4853[11]
	       + aFloatArray4853[7] * class433_224_.aFloatArray4853[15]);
	float f_232_
	    = (aFloatArray4853[8] * class433_224_.aFloatArray4853[0]
	       + aFloatArray4853[9] * class433_224_.aFloatArray4853[4]
	       + aFloatArray4853[10] * class433_224_.aFloatArray4853[8]
	       + aFloatArray4853[11] * class433_224_.aFloatArray4853[12]);
	float f_233_
	    = (aFloatArray4853[8] * class433_224_.aFloatArray4853[1]
	       + aFloatArray4853[9] * class433_224_.aFloatArray4853[5]
	       + aFloatArray4853[10] * class433_224_.aFloatArray4853[9]
	       + aFloatArray4853[11] * class433_224_.aFloatArray4853[13]);
	float f_234_
	    = (aFloatArray4853[8] * class433_224_.aFloatArray4853[2]
	       + aFloatArray4853[9] * class433_224_.aFloatArray4853[6]
	       + aFloatArray4853[10] * class433_224_.aFloatArray4853[10]
	       + aFloatArray4853[11] * class433_224_.aFloatArray4853[14]);
	float f_235_
	    = (aFloatArray4853[8] * class433_224_.aFloatArray4853[3]
	       + aFloatArray4853[9] * class433_224_.aFloatArray4853[7]
	       + aFloatArray4853[10] * class433_224_.aFloatArray4853[11]
	       + aFloatArray4853[11] * class433_224_.aFloatArray4853[15]);
	float f_236_
	    = (aFloatArray4853[12] * class433_224_.aFloatArray4853[0]
	       + aFloatArray4853[13] * class433_224_.aFloatArray4853[4]
	       + aFloatArray4853[14] * class433_224_.aFloatArray4853[8]
	       + aFloatArray4853[15] * class433_224_.aFloatArray4853[12]);
	float f_237_
	    = (aFloatArray4853[12] * class433_224_.aFloatArray4853[1]
	       + aFloatArray4853[13] * class433_224_.aFloatArray4853[5]
	       + aFloatArray4853[14] * class433_224_.aFloatArray4853[9]
	       + aFloatArray4853[15] * class433_224_.aFloatArray4853[13]);
	float f_238_
	    = (aFloatArray4853[12] * class433_224_.aFloatArray4853[2]
	       + aFloatArray4853[13] * class433_224_.aFloatArray4853[6]
	       + aFloatArray4853[14] * class433_224_.aFloatArray4853[10]
	       + aFloatArray4853[15] * class433_224_.aFloatArray4853[14]);
	float f_239_
	    = (aFloatArray4853[12] * class433_224_.aFloatArray4853[3]
	       + aFloatArray4853[13] * class433_224_.aFloatArray4853[7]
	       + aFloatArray4853[14] * class433_224_.aFloatArray4853[11]
	       + aFloatArray4853[15] * class433_224_.aFloatArray4853[15]);
	aFloatArray4853[0] = f;
	aFloatArray4853[1] = f_225_;
	aFloatArray4853[2] = f_226_;
	aFloatArray4853[3] = f_227_;
	aFloatArray4853[4] = f_228_;
	aFloatArray4853[5] = f_229_;
	aFloatArray4853[6] = f_230_;
	aFloatArray4853[7] = f_231_;
	aFloatArray4853[8] = f_232_;
	aFloatArray4853[9] = f_233_;
	aFloatArray4853[10] = f_234_;
	aFloatArray4853[11] = f_235_;
	aFloatArray4853[12] = f_236_;
	aFloatArray4853[13] = f_237_;
	aFloatArray4853[14] = f_238_;
	aFloatArray4853[15] = f_239_;
    }
    
    public void method6895(Class433 class433_240_) {
	float f = (aFloatArray4853[0] * class433_240_.aFloatArray4853[0]
		   + aFloatArray4853[1] * class433_240_.aFloatArray4853[4]
		   + aFloatArray4853[2] * class433_240_.aFloatArray4853[8]
		   + aFloatArray4853[3] * class433_240_.aFloatArray4853[12]);
	float f_241_
	    = (aFloatArray4853[0] * class433_240_.aFloatArray4853[1]
	       + aFloatArray4853[1] * class433_240_.aFloatArray4853[5]
	       + aFloatArray4853[2] * class433_240_.aFloatArray4853[9]
	       + aFloatArray4853[3] * class433_240_.aFloatArray4853[13]);
	float f_242_
	    = (aFloatArray4853[0] * class433_240_.aFloatArray4853[2]
	       + aFloatArray4853[1] * class433_240_.aFloatArray4853[6]
	       + aFloatArray4853[2] * class433_240_.aFloatArray4853[10]
	       + aFloatArray4853[3] * class433_240_.aFloatArray4853[14]);
	float f_243_
	    = (aFloatArray4853[0] * class433_240_.aFloatArray4853[3]
	       + aFloatArray4853[1] * class433_240_.aFloatArray4853[7]
	       + aFloatArray4853[2] * class433_240_.aFloatArray4853[11]
	       + aFloatArray4853[3] * class433_240_.aFloatArray4853[15]);
	float f_244_
	    = (aFloatArray4853[4] * class433_240_.aFloatArray4853[0]
	       + aFloatArray4853[5] * class433_240_.aFloatArray4853[4]
	       + aFloatArray4853[6] * class433_240_.aFloatArray4853[8]
	       + aFloatArray4853[7] * class433_240_.aFloatArray4853[12]);
	float f_245_
	    = (aFloatArray4853[4] * class433_240_.aFloatArray4853[1]
	       + aFloatArray4853[5] * class433_240_.aFloatArray4853[5]
	       + aFloatArray4853[6] * class433_240_.aFloatArray4853[9]
	       + aFloatArray4853[7] * class433_240_.aFloatArray4853[13]);
	float f_246_
	    = (aFloatArray4853[4] * class433_240_.aFloatArray4853[2]
	       + aFloatArray4853[5] * class433_240_.aFloatArray4853[6]
	       + aFloatArray4853[6] * class433_240_.aFloatArray4853[10]
	       + aFloatArray4853[7] * class433_240_.aFloatArray4853[14]);
	float f_247_
	    = (aFloatArray4853[4] * class433_240_.aFloatArray4853[3]
	       + aFloatArray4853[5] * class433_240_.aFloatArray4853[7]
	       + aFloatArray4853[6] * class433_240_.aFloatArray4853[11]
	       + aFloatArray4853[7] * class433_240_.aFloatArray4853[15]);
	float f_248_
	    = (aFloatArray4853[8] * class433_240_.aFloatArray4853[0]
	       + aFloatArray4853[9] * class433_240_.aFloatArray4853[4]
	       + aFloatArray4853[10] * class433_240_.aFloatArray4853[8]
	       + aFloatArray4853[11] * class433_240_.aFloatArray4853[12]);
	float f_249_
	    = (aFloatArray4853[8] * class433_240_.aFloatArray4853[1]
	       + aFloatArray4853[9] * class433_240_.aFloatArray4853[5]
	       + aFloatArray4853[10] * class433_240_.aFloatArray4853[9]
	       + aFloatArray4853[11] * class433_240_.aFloatArray4853[13]);
	float f_250_
	    = (aFloatArray4853[8] * class433_240_.aFloatArray4853[2]
	       + aFloatArray4853[9] * class433_240_.aFloatArray4853[6]
	       + aFloatArray4853[10] * class433_240_.aFloatArray4853[10]
	       + aFloatArray4853[11] * class433_240_.aFloatArray4853[14]);
	float f_251_
	    = (aFloatArray4853[8] * class433_240_.aFloatArray4853[3]
	       + aFloatArray4853[9] * class433_240_.aFloatArray4853[7]
	       + aFloatArray4853[10] * class433_240_.aFloatArray4853[11]
	       + aFloatArray4853[11] * class433_240_.aFloatArray4853[15]);
	float f_252_
	    = (aFloatArray4853[12] * class433_240_.aFloatArray4853[0]
	       + aFloatArray4853[13] * class433_240_.aFloatArray4853[4]
	       + aFloatArray4853[14] * class433_240_.aFloatArray4853[8]
	       + aFloatArray4853[15] * class433_240_.aFloatArray4853[12]);
	float f_253_
	    = (aFloatArray4853[12] * class433_240_.aFloatArray4853[1]
	       + aFloatArray4853[13] * class433_240_.aFloatArray4853[5]
	       + aFloatArray4853[14] * class433_240_.aFloatArray4853[9]
	       + aFloatArray4853[15] * class433_240_.aFloatArray4853[13]);
	float f_254_
	    = (aFloatArray4853[12] * class433_240_.aFloatArray4853[2]
	       + aFloatArray4853[13] * class433_240_.aFloatArray4853[6]
	       + aFloatArray4853[14] * class433_240_.aFloatArray4853[10]
	       + aFloatArray4853[15] * class433_240_.aFloatArray4853[14]);
	float f_255_
	    = (aFloatArray4853[12] * class433_240_.aFloatArray4853[3]
	       + aFloatArray4853[13] * class433_240_.aFloatArray4853[7]
	       + aFloatArray4853[14] * class433_240_.aFloatArray4853[11]
	       + aFloatArray4853[15] * class433_240_.aFloatArray4853[15]);
	aFloatArray4853[0] = f;
	aFloatArray4853[1] = f_241_;
	aFloatArray4853[2] = f_242_;
	aFloatArray4853[3] = f_243_;
	aFloatArray4853[4] = f_244_;
	aFloatArray4853[5] = f_245_;
	aFloatArray4853[6] = f_246_;
	aFloatArray4853[7] = f_247_;
	aFloatArray4853[8] = f_248_;
	aFloatArray4853[9] = f_249_;
	aFloatArray4853[10] = f_250_;
	aFloatArray4853[11] = f_251_;
	aFloatArray4853[12] = f_252_;
	aFloatArray4853[13] = f_253_;
	aFloatArray4853[14] = f_254_;
	aFloatArray4853[15] = f_255_;
    }
    
    public void method6896(Class446 class446) {
	aFloatArray4853[0] = class446.aFloat4894;
	aFloatArray4853[1] = class446.aFloat4893;
	aFloatArray4853[2] = class446.aFloat4896;
	aFloatArray4853[3] = 0.0F;
	aFloatArray4853[4] = class446.aFloat4897;
	aFloatArray4853[5] = class446.aFloat4904;
	aFloatArray4853[6] = class446.aFloat4899;
	aFloatArray4853[7] = 0.0F;
	aFloatArray4853[8] = class446.aFloat4900;
	aFloatArray4853[9] = class446.aFloat4895;
	aFloatArray4853[10] = class446.aFloat4902;
	aFloatArray4853[11] = 0.0F;
	aFloatArray4853[12] = class446.aFloat4903;
	aFloatArray4853[13] = class446.aFloat4901;
	aFloatArray4853[14] = class446.aFloat4898;
	aFloatArray4853[15] = 1.0F;
    }
    
    float method6897() {
	return ((aFloatArray4853[0] * aFloatArray4853[5] * aFloatArray4853[10]
		 * aFloatArray4853[15])
		- (aFloatArray4853[0] * aFloatArray4853[5]
		   * aFloatArray4853[11] * aFloatArray4853[14])
		- (aFloatArray4853[0] * aFloatArray4853[6] * aFloatArray4853[9]
		   * aFloatArray4853[15])
		+ (aFloatArray4853[0] * aFloatArray4853[6]
		   * aFloatArray4853[11] * aFloatArray4853[13])
		+ (aFloatArray4853[0] * aFloatArray4853[7] * aFloatArray4853[9]
		   * aFloatArray4853[14])
		- (aFloatArray4853[0] * aFloatArray4853[7]
		   * aFloatArray4853[10] * aFloatArray4853[13])
		- (aFloatArray4853[1] * aFloatArray4853[4]
		   * aFloatArray4853[10] * aFloatArray4853[15])
		+ (aFloatArray4853[1] * aFloatArray4853[4]
		   * aFloatArray4853[11] * aFloatArray4853[14])
		+ (aFloatArray4853[1] * aFloatArray4853[6] * aFloatArray4853[8]
		   * aFloatArray4853[15])
		- (aFloatArray4853[1] * aFloatArray4853[6]
		   * aFloatArray4853[11] * aFloatArray4853[12])
		- (aFloatArray4853[1] * aFloatArray4853[7] * aFloatArray4853[8]
		   * aFloatArray4853[14])
		+ (aFloatArray4853[1] * aFloatArray4853[7]
		   * aFloatArray4853[10] * aFloatArray4853[12])
		+ (aFloatArray4853[2] * aFloatArray4853[4] * aFloatArray4853[9]
		   * aFloatArray4853[15])
		- (aFloatArray4853[2] * aFloatArray4853[4]
		   * aFloatArray4853[11] * aFloatArray4853[13])
		- (aFloatArray4853[2] * aFloatArray4853[5] * aFloatArray4853[8]
		   * aFloatArray4853[15])
		+ (aFloatArray4853[2] * aFloatArray4853[5]
		   * aFloatArray4853[11] * aFloatArray4853[12])
		+ (aFloatArray4853[2] * aFloatArray4853[7] * aFloatArray4853[8]
		   * aFloatArray4853[13])
		- (aFloatArray4853[2] * aFloatArray4853[7] * aFloatArray4853[9]
		   * aFloatArray4853[12])
		- (aFloatArray4853[3] * aFloatArray4853[4] * aFloatArray4853[9]
		   * aFloatArray4853[14])
		+ (aFloatArray4853[3] * aFloatArray4853[4]
		   * aFloatArray4853[10] * aFloatArray4853[13])
		+ (aFloatArray4853[3] * aFloatArray4853[5] * aFloatArray4853[8]
		   * aFloatArray4853[14])
		- (aFloatArray4853[3] * aFloatArray4853[5]
		   * aFloatArray4853[10] * aFloatArray4853[12])
		- (aFloatArray4853[3] * aFloatArray4853[6] * aFloatArray4853[8]
		   * aFloatArray4853[13])
		+ (aFloatArray4853[3] * aFloatArray4853[6] * aFloatArray4853[9]
		   * aFloatArray4853[12]));
    }
    
    float method6898() {
	return ((aFloatArray4853[0] * aFloatArray4853[5] * aFloatArray4853[10]
		 * aFloatArray4853[15])
		- (aFloatArray4853[0] * aFloatArray4853[5]
		   * aFloatArray4853[11] * aFloatArray4853[14])
		- (aFloatArray4853[0] * aFloatArray4853[6] * aFloatArray4853[9]
		   * aFloatArray4853[15])
		+ (aFloatArray4853[0] * aFloatArray4853[6]
		   * aFloatArray4853[11] * aFloatArray4853[13])
		+ (aFloatArray4853[0] * aFloatArray4853[7] * aFloatArray4853[9]
		   * aFloatArray4853[14])
		- (aFloatArray4853[0] * aFloatArray4853[7]
		   * aFloatArray4853[10] * aFloatArray4853[13])
		- (aFloatArray4853[1] * aFloatArray4853[4]
		   * aFloatArray4853[10] * aFloatArray4853[15])
		+ (aFloatArray4853[1] * aFloatArray4853[4]
		   * aFloatArray4853[11] * aFloatArray4853[14])
		+ (aFloatArray4853[1] * aFloatArray4853[6] * aFloatArray4853[8]
		   * aFloatArray4853[15])
		- (aFloatArray4853[1] * aFloatArray4853[6]
		   * aFloatArray4853[11] * aFloatArray4853[12])
		- (aFloatArray4853[1] * aFloatArray4853[7] * aFloatArray4853[8]
		   * aFloatArray4853[14])
		+ (aFloatArray4853[1] * aFloatArray4853[7]
		   * aFloatArray4853[10] * aFloatArray4853[12])
		+ (aFloatArray4853[2] * aFloatArray4853[4] * aFloatArray4853[9]
		   * aFloatArray4853[15])
		- (aFloatArray4853[2] * aFloatArray4853[4]
		   * aFloatArray4853[11] * aFloatArray4853[13])
		- (aFloatArray4853[2] * aFloatArray4853[5] * aFloatArray4853[8]
		   * aFloatArray4853[15])
		+ (aFloatArray4853[2] * aFloatArray4853[5]
		   * aFloatArray4853[11] * aFloatArray4853[12])
		+ (aFloatArray4853[2] * aFloatArray4853[7] * aFloatArray4853[8]
		   * aFloatArray4853[13])
		- (aFloatArray4853[2] * aFloatArray4853[7] * aFloatArray4853[9]
		   * aFloatArray4853[12])
		- (aFloatArray4853[3] * aFloatArray4853[4] * aFloatArray4853[9]
		   * aFloatArray4853[14])
		+ (aFloatArray4853[3] * aFloatArray4853[4]
		   * aFloatArray4853[10] * aFloatArray4853[13])
		+ (aFloatArray4853[3] * aFloatArray4853[5] * aFloatArray4853[8]
		   * aFloatArray4853[14])
		- (aFloatArray4853[3] * aFloatArray4853[5]
		   * aFloatArray4853[10] * aFloatArray4853[12])
		- (aFloatArray4853[3] * aFloatArray4853[6] * aFloatArray4853[8]
		   * aFloatArray4853[13])
		+ (aFloatArray4853[3] * aFloatArray4853[6] * aFloatArray4853[9]
		   * aFloatArray4853[12]));
    }
    
    public void method6899() {
	float f = 1.0F / method6846();
	float f_256_
	    = (aFloatArray4853[5] * aFloatArray4853[10] * aFloatArray4853[15]
	       - aFloatArray4853[5] * aFloatArray4853[11] * aFloatArray4853[14]
	       - aFloatArray4853[6] * aFloatArray4853[9] * aFloatArray4853[15]
	       + aFloatArray4853[6] * aFloatArray4853[11] * aFloatArray4853[13]
	       + aFloatArray4853[7] * aFloatArray4853[9] * aFloatArray4853[14]
	       - (aFloatArray4853[7] * aFloatArray4853[10]
		  * aFloatArray4853[13])) * f;
	float f_257_
	    = (-aFloatArray4853[1] * aFloatArray4853[10] * aFloatArray4853[15]
	       + aFloatArray4853[1] * aFloatArray4853[11] * aFloatArray4853[14]
	       + aFloatArray4853[2] * aFloatArray4853[9] * aFloatArray4853[15]
	       - aFloatArray4853[2] * aFloatArray4853[11] * aFloatArray4853[13]
	       - aFloatArray4853[3] * aFloatArray4853[9] * aFloatArray4853[14]
	       + (aFloatArray4853[3] * aFloatArray4853[10]
		  * aFloatArray4853[13])) * f;
	float f_258_
	    = ((aFloatArray4853[1] * aFloatArray4853[6] * aFloatArray4853[15]
		- aFloatArray4853[1] * aFloatArray4853[7] * aFloatArray4853[14]
		- aFloatArray4853[2] * aFloatArray4853[5] * aFloatArray4853[15]
		+ aFloatArray4853[2] * aFloatArray4853[7] * aFloatArray4853[13]
		+ aFloatArray4853[3] * aFloatArray4853[5] * aFloatArray4853[14]
		- (aFloatArray4853[3] * aFloatArray4853[6]
		   * aFloatArray4853[13]))
	       * f);
	float f_259_
	    = ((-aFloatArray4853[1] * aFloatArray4853[6] * aFloatArray4853[11]
		+ aFloatArray4853[1] * aFloatArray4853[7] * aFloatArray4853[10]
		+ aFloatArray4853[2] * aFloatArray4853[5] * aFloatArray4853[11]
		- aFloatArray4853[2] * aFloatArray4853[7] * aFloatArray4853[9]
		- aFloatArray4853[3] * aFloatArray4853[5] * aFloatArray4853[10]
		+ aFloatArray4853[3] * aFloatArray4853[6] * aFloatArray4853[9])
	       * f);
	float f_260_
	    = (-aFloatArray4853[4] * aFloatArray4853[10] * aFloatArray4853[15]
	       + aFloatArray4853[4] * aFloatArray4853[11] * aFloatArray4853[14]
	       + aFloatArray4853[6] * aFloatArray4853[8] * aFloatArray4853[15]
	       - aFloatArray4853[6] * aFloatArray4853[11] * aFloatArray4853[12]
	       - aFloatArray4853[7] * aFloatArray4853[8] * aFloatArray4853[14]
	       + (aFloatArray4853[7] * aFloatArray4853[10]
		  * aFloatArray4853[12])) * f;
	float f_261_
	    = (aFloatArray4853[0] * aFloatArray4853[10] * aFloatArray4853[15]
	       - aFloatArray4853[0] * aFloatArray4853[11] * aFloatArray4853[14]
	       - aFloatArray4853[2] * aFloatArray4853[8] * aFloatArray4853[15]
	       + aFloatArray4853[2] * aFloatArray4853[11] * aFloatArray4853[12]
	       + aFloatArray4853[3] * aFloatArray4853[8] * aFloatArray4853[14]
	       - (aFloatArray4853[3] * aFloatArray4853[10]
		  * aFloatArray4853[12])) * f;
	float f_262_
	    = ((-aFloatArray4853[0] * aFloatArray4853[6] * aFloatArray4853[15]
		+ aFloatArray4853[0] * aFloatArray4853[7] * aFloatArray4853[14]
		+ aFloatArray4853[2] * aFloatArray4853[4] * aFloatArray4853[15]
		- aFloatArray4853[2] * aFloatArray4853[7] * aFloatArray4853[12]
		- aFloatArray4853[3] * aFloatArray4853[4] * aFloatArray4853[14]
		+ (aFloatArray4853[3] * aFloatArray4853[6]
		   * aFloatArray4853[12]))
	       * f);
	float f_263_
	    = ((aFloatArray4853[0] * aFloatArray4853[6] * aFloatArray4853[11]
		- aFloatArray4853[0] * aFloatArray4853[7] * aFloatArray4853[10]
		- aFloatArray4853[2] * aFloatArray4853[4] * aFloatArray4853[11]
		+ aFloatArray4853[2] * aFloatArray4853[7] * aFloatArray4853[8]
		+ aFloatArray4853[3] * aFloatArray4853[4] * aFloatArray4853[10]
		- aFloatArray4853[3] * aFloatArray4853[6] * aFloatArray4853[8])
	       * f);
	float f_264_
	    = (aFloatArray4853[4] * aFloatArray4853[9] * aFloatArray4853[15]
	       - aFloatArray4853[4] * aFloatArray4853[11] * aFloatArray4853[13]
	       - aFloatArray4853[5] * aFloatArray4853[8] * aFloatArray4853[15]
	       + aFloatArray4853[5] * aFloatArray4853[11] * aFloatArray4853[12]
	       + aFloatArray4853[7] * aFloatArray4853[8] * aFloatArray4853[13]
	       - (aFloatArray4853[7] * aFloatArray4853[9]
		  * aFloatArray4853[12])) * f;
	float f_265_
	    = (-aFloatArray4853[0] * aFloatArray4853[9] * aFloatArray4853[15]
	       + aFloatArray4853[0] * aFloatArray4853[11] * aFloatArray4853[13]
	       + aFloatArray4853[1] * aFloatArray4853[8] * aFloatArray4853[15]
	       - aFloatArray4853[1] * aFloatArray4853[11] * aFloatArray4853[12]
	       - aFloatArray4853[3] * aFloatArray4853[8] * aFloatArray4853[13]
	       + (aFloatArray4853[3] * aFloatArray4853[9]
		  * aFloatArray4853[12])) * f;
	float f_266_
	    = ((aFloatArray4853[0] * aFloatArray4853[5] * aFloatArray4853[15]
		- aFloatArray4853[0] * aFloatArray4853[7] * aFloatArray4853[13]
		- aFloatArray4853[1] * aFloatArray4853[4] * aFloatArray4853[15]
		+ aFloatArray4853[1] * aFloatArray4853[7] * aFloatArray4853[12]
		+ aFloatArray4853[3] * aFloatArray4853[4] * aFloatArray4853[13]
		- (aFloatArray4853[3] * aFloatArray4853[5]
		   * aFloatArray4853[12]))
	       * f);
	float f_267_
	    = ((-aFloatArray4853[0] * aFloatArray4853[5] * aFloatArray4853[11]
		+ aFloatArray4853[0] * aFloatArray4853[7] * aFloatArray4853[9]
		+ aFloatArray4853[1] * aFloatArray4853[4] * aFloatArray4853[11]
		- aFloatArray4853[1] * aFloatArray4853[7] * aFloatArray4853[8]
		- aFloatArray4853[3] * aFloatArray4853[4] * aFloatArray4853[9]
		+ aFloatArray4853[3] * aFloatArray4853[5] * aFloatArray4853[8])
	       * f);
	float f_268_
	    = (-aFloatArray4853[4] * aFloatArray4853[9] * aFloatArray4853[14]
	       + aFloatArray4853[4] * aFloatArray4853[10] * aFloatArray4853[13]
	       + aFloatArray4853[5] * aFloatArray4853[8] * aFloatArray4853[14]
	       - aFloatArray4853[5] * aFloatArray4853[10] * aFloatArray4853[12]
	       - aFloatArray4853[6] * aFloatArray4853[8] * aFloatArray4853[13]
	       + (aFloatArray4853[6] * aFloatArray4853[9]
		  * aFloatArray4853[12])) * f;
	float f_269_
	    = (aFloatArray4853[0] * aFloatArray4853[9] * aFloatArray4853[14]
	       - aFloatArray4853[0] * aFloatArray4853[10] * aFloatArray4853[13]
	       - aFloatArray4853[1] * aFloatArray4853[8] * aFloatArray4853[14]
	       + aFloatArray4853[1] * aFloatArray4853[10] * aFloatArray4853[12]
	       + aFloatArray4853[2] * aFloatArray4853[8] * aFloatArray4853[13]
	       - (aFloatArray4853[2] * aFloatArray4853[9]
		  * aFloatArray4853[12])) * f;
	float f_270_
	    = ((-aFloatArray4853[0] * aFloatArray4853[5] * aFloatArray4853[14]
		+ aFloatArray4853[0] * aFloatArray4853[6] * aFloatArray4853[13]
		+ aFloatArray4853[1] * aFloatArray4853[4] * aFloatArray4853[14]
		- aFloatArray4853[1] * aFloatArray4853[6] * aFloatArray4853[12]
		- aFloatArray4853[2] * aFloatArray4853[4] * aFloatArray4853[13]
		+ (aFloatArray4853[2] * aFloatArray4853[5]
		   * aFloatArray4853[12]))
	       * f);
	float f_271_
	    = ((aFloatArray4853[0] * aFloatArray4853[5] * aFloatArray4853[10]
		- aFloatArray4853[0] * aFloatArray4853[6] * aFloatArray4853[9]
		- aFloatArray4853[1] * aFloatArray4853[4] * aFloatArray4853[10]
		+ aFloatArray4853[1] * aFloatArray4853[6] * aFloatArray4853[8]
		+ aFloatArray4853[2] * aFloatArray4853[4] * aFloatArray4853[9]
		- aFloatArray4853[2] * aFloatArray4853[5] * aFloatArray4853[8])
	       * f);
	aFloatArray4853[0] = f_256_;
	aFloatArray4853[1] = f_257_;
	aFloatArray4853[2] = f_258_;
	aFloatArray4853[3] = f_259_;
	aFloatArray4853[4] = f_260_;
	aFloatArray4853[5] = f_261_;
	aFloatArray4853[6] = f_262_;
	aFloatArray4853[7] = f_263_;
	aFloatArray4853[8] = f_264_;
	aFloatArray4853[9] = f_265_;
	aFloatArray4853[10] = f_266_;
	aFloatArray4853[11] = f_267_;
	aFloatArray4853[12] = f_268_;
	aFloatArray4853[13] = f_269_;
	aFloatArray4853[14] = f_270_;
	aFloatArray4853[15] = f_271_;
    }
    
    public void method6900() {
	float f = 1.0F / method6846();
	float f_272_
	    = (aFloatArray4853[5] * aFloatArray4853[10] * aFloatArray4853[15]
	       - aFloatArray4853[5] * aFloatArray4853[11] * aFloatArray4853[14]
	       - aFloatArray4853[6] * aFloatArray4853[9] * aFloatArray4853[15]
	       + aFloatArray4853[6] * aFloatArray4853[11] * aFloatArray4853[13]
	       + aFloatArray4853[7] * aFloatArray4853[9] * aFloatArray4853[14]
	       - (aFloatArray4853[7] * aFloatArray4853[10]
		  * aFloatArray4853[13])) * f;
	float f_273_
	    = (-aFloatArray4853[1] * aFloatArray4853[10] * aFloatArray4853[15]
	       + aFloatArray4853[1] * aFloatArray4853[11] * aFloatArray4853[14]
	       + aFloatArray4853[2] * aFloatArray4853[9] * aFloatArray4853[15]
	       - aFloatArray4853[2] * aFloatArray4853[11] * aFloatArray4853[13]
	       - aFloatArray4853[3] * aFloatArray4853[9] * aFloatArray4853[14]
	       + (aFloatArray4853[3] * aFloatArray4853[10]
		  * aFloatArray4853[13])) * f;
	float f_274_
	    = ((aFloatArray4853[1] * aFloatArray4853[6] * aFloatArray4853[15]
		- aFloatArray4853[1] * aFloatArray4853[7] * aFloatArray4853[14]
		- aFloatArray4853[2] * aFloatArray4853[5] * aFloatArray4853[15]
		+ aFloatArray4853[2] * aFloatArray4853[7] * aFloatArray4853[13]
		+ aFloatArray4853[3] * aFloatArray4853[5] * aFloatArray4853[14]
		- (aFloatArray4853[3] * aFloatArray4853[6]
		   * aFloatArray4853[13]))
	       * f);
	float f_275_
	    = ((-aFloatArray4853[1] * aFloatArray4853[6] * aFloatArray4853[11]
		+ aFloatArray4853[1] * aFloatArray4853[7] * aFloatArray4853[10]
		+ aFloatArray4853[2] * aFloatArray4853[5] * aFloatArray4853[11]
		- aFloatArray4853[2] * aFloatArray4853[7] * aFloatArray4853[9]
		- aFloatArray4853[3] * aFloatArray4853[5] * aFloatArray4853[10]
		+ aFloatArray4853[3] * aFloatArray4853[6] * aFloatArray4853[9])
	       * f);
	float f_276_
	    = (-aFloatArray4853[4] * aFloatArray4853[10] * aFloatArray4853[15]
	       + aFloatArray4853[4] * aFloatArray4853[11] * aFloatArray4853[14]
	       + aFloatArray4853[6] * aFloatArray4853[8] * aFloatArray4853[15]
	       - aFloatArray4853[6] * aFloatArray4853[11] * aFloatArray4853[12]
	       - aFloatArray4853[7] * aFloatArray4853[8] * aFloatArray4853[14]
	       + (aFloatArray4853[7] * aFloatArray4853[10]
		  * aFloatArray4853[12])) * f;
	float f_277_
	    = (aFloatArray4853[0] * aFloatArray4853[10] * aFloatArray4853[15]
	       - aFloatArray4853[0] * aFloatArray4853[11] * aFloatArray4853[14]
	       - aFloatArray4853[2] * aFloatArray4853[8] * aFloatArray4853[15]
	       + aFloatArray4853[2] * aFloatArray4853[11] * aFloatArray4853[12]
	       + aFloatArray4853[3] * aFloatArray4853[8] * aFloatArray4853[14]
	       - (aFloatArray4853[3] * aFloatArray4853[10]
		  * aFloatArray4853[12])) * f;
	float f_278_
	    = ((-aFloatArray4853[0] * aFloatArray4853[6] * aFloatArray4853[15]
		+ aFloatArray4853[0] * aFloatArray4853[7] * aFloatArray4853[14]
		+ aFloatArray4853[2] * aFloatArray4853[4] * aFloatArray4853[15]
		- aFloatArray4853[2] * aFloatArray4853[7] * aFloatArray4853[12]
		- aFloatArray4853[3] * aFloatArray4853[4] * aFloatArray4853[14]
		+ (aFloatArray4853[3] * aFloatArray4853[6]
		   * aFloatArray4853[12]))
	       * f);
	float f_279_
	    = ((aFloatArray4853[0] * aFloatArray4853[6] * aFloatArray4853[11]
		- aFloatArray4853[0] * aFloatArray4853[7] * aFloatArray4853[10]
		- aFloatArray4853[2] * aFloatArray4853[4] * aFloatArray4853[11]
		+ aFloatArray4853[2] * aFloatArray4853[7] * aFloatArray4853[8]
		+ aFloatArray4853[3] * aFloatArray4853[4] * aFloatArray4853[10]
		- aFloatArray4853[3] * aFloatArray4853[6] * aFloatArray4853[8])
	       * f);
	float f_280_
	    = (aFloatArray4853[4] * aFloatArray4853[9] * aFloatArray4853[15]
	       - aFloatArray4853[4] * aFloatArray4853[11] * aFloatArray4853[13]
	       - aFloatArray4853[5] * aFloatArray4853[8] * aFloatArray4853[15]
	       + aFloatArray4853[5] * aFloatArray4853[11] * aFloatArray4853[12]
	       + aFloatArray4853[7] * aFloatArray4853[8] * aFloatArray4853[13]
	       - (aFloatArray4853[7] * aFloatArray4853[9]
		  * aFloatArray4853[12])) * f;
	float f_281_
	    = (-aFloatArray4853[0] * aFloatArray4853[9] * aFloatArray4853[15]
	       + aFloatArray4853[0] * aFloatArray4853[11] * aFloatArray4853[13]
	       + aFloatArray4853[1] * aFloatArray4853[8] * aFloatArray4853[15]
	       - aFloatArray4853[1] * aFloatArray4853[11] * aFloatArray4853[12]
	       - aFloatArray4853[3] * aFloatArray4853[8] * aFloatArray4853[13]
	       + (aFloatArray4853[3] * aFloatArray4853[9]
		  * aFloatArray4853[12])) * f;
	float f_282_
	    = ((aFloatArray4853[0] * aFloatArray4853[5] * aFloatArray4853[15]
		- aFloatArray4853[0] * aFloatArray4853[7] * aFloatArray4853[13]
		- aFloatArray4853[1] * aFloatArray4853[4] * aFloatArray4853[15]
		+ aFloatArray4853[1] * aFloatArray4853[7] * aFloatArray4853[12]
		+ aFloatArray4853[3] * aFloatArray4853[4] * aFloatArray4853[13]
		- (aFloatArray4853[3] * aFloatArray4853[5]
		   * aFloatArray4853[12]))
	       * f);
	float f_283_
	    = ((-aFloatArray4853[0] * aFloatArray4853[5] * aFloatArray4853[11]
		+ aFloatArray4853[0] * aFloatArray4853[7] * aFloatArray4853[9]
		+ aFloatArray4853[1] * aFloatArray4853[4] * aFloatArray4853[11]
		- aFloatArray4853[1] * aFloatArray4853[7] * aFloatArray4853[8]
		- aFloatArray4853[3] * aFloatArray4853[4] * aFloatArray4853[9]
		+ aFloatArray4853[3] * aFloatArray4853[5] * aFloatArray4853[8])
	       * f);
	float f_284_
	    = (-aFloatArray4853[4] * aFloatArray4853[9] * aFloatArray4853[14]
	       + aFloatArray4853[4] * aFloatArray4853[10] * aFloatArray4853[13]
	       + aFloatArray4853[5] * aFloatArray4853[8] * aFloatArray4853[14]
	       - aFloatArray4853[5] * aFloatArray4853[10] * aFloatArray4853[12]
	       - aFloatArray4853[6] * aFloatArray4853[8] * aFloatArray4853[13]
	       + (aFloatArray4853[6] * aFloatArray4853[9]
		  * aFloatArray4853[12])) * f;
	float f_285_
	    = (aFloatArray4853[0] * aFloatArray4853[9] * aFloatArray4853[14]
	       - aFloatArray4853[0] * aFloatArray4853[10] * aFloatArray4853[13]
	       - aFloatArray4853[1] * aFloatArray4853[8] * aFloatArray4853[14]
	       + aFloatArray4853[1] * aFloatArray4853[10] * aFloatArray4853[12]
	       + aFloatArray4853[2] * aFloatArray4853[8] * aFloatArray4853[13]
	       - (aFloatArray4853[2] * aFloatArray4853[9]
		  * aFloatArray4853[12])) * f;
	float f_286_
	    = ((-aFloatArray4853[0] * aFloatArray4853[5] * aFloatArray4853[14]
		+ aFloatArray4853[0] * aFloatArray4853[6] * aFloatArray4853[13]
		+ aFloatArray4853[1] * aFloatArray4853[4] * aFloatArray4853[14]
		- aFloatArray4853[1] * aFloatArray4853[6] * aFloatArray4853[12]
		- aFloatArray4853[2] * aFloatArray4853[4] * aFloatArray4853[13]
		+ (aFloatArray4853[2] * aFloatArray4853[5]
		   * aFloatArray4853[12]))
	       * f);
	float f_287_
	    = ((aFloatArray4853[0] * aFloatArray4853[5] * aFloatArray4853[10]
		- aFloatArray4853[0] * aFloatArray4853[6] * aFloatArray4853[9]
		- aFloatArray4853[1] * aFloatArray4853[4] * aFloatArray4853[10]
		+ aFloatArray4853[1] * aFloatArray4853[6] * aFloatArray4853[8]
		+ aFloatArray4853[2] * aFloatArray4853[4] * aFloatArray4853[9]
		- aFloatArray4853[2] * aFloatArray4853[5] * aFloatArray4853[8])
	       * f);
	aFloatArray4853[0] = f_272_;
	aFloatArray4853[1] = f_273_;
	aFloatArray4853[2] = f_274_;
	aFloatArray4853[3] = f_275_;
	aFloatArray4853[4] = f_276_;
	aFloatArray4853[5] = f_277_;
	aFloatArray4853[6] = f_278_;
	aFloatArray4853[7] = f_279_;
	aFloatArray4853[8] = f_280_;
	aFloatArray4853[9] = f_281_;
	aFloatArray4853[10] = f_282_;
	aFloatArray4853[11] = f_283_;
	aFloatArray4853[12] = f_284_;
	aFloatArray4853[13] = f_285_;
	aFloatArray4853[14] = f_286_;
	aFloatArray4853[15] = f_287_;
    }
    
    public void method6901(float f, float f_288_, float f_289_, float f_290_) {
	float f_291_
	    = (float) (Math.tan((double) (f_289_ / 2.0F)) * (double) f);
	float f_292_
	    = (float) (Math.tan((double) (f_290_ / 2.0F)) * (double) f);
	method6885(-f_291_, f_291_, -f_292_, f_292_, f, f_288_);
    }
    
    public void method6902(float f, float f_293_, float f_294_, float f_295_) {
	aFloatArray4853[0] = f;
	aFloatArray4853[1] = 0.0F;
	aFloatArray4853[2] = 0.0F;
	aFloatArray4853[3] = 0.0F;
	aFloatArray4853[4] = 0.0F;
	aFloatArray4853[5] = f_293_;
	aFloatArray4853[6] = 0.0F;
	aFloatArray4853[7] = 0.0F;
	aFloatArray4853[8] = 0.0F;
	aFloatArray4853[9] = 0.0F;
	aFloatArray4853[10] = f_294_;
	aFloatArray4853[11] = 0.0F;
	aFloatArray4853[12] = 0.0F;
	aFloatArray4853[13] = 0.0F;
	aFloatArray4853[14] = 0.0F;
	aFloatArray4853[15] = f_295_;
    }
    
    public void method6903(float f, float f_296_, float f_297_) {
	method6853(-10000.0F / f_297_, 10000.0F / f_297_, -10000.0F / f_297_,
		   10000.0F / f_297_, f, f_296_);
    }
    
    public boolean method6904() {
	return (aFloatArray4853[0] == 1.0F && aFloatArray4853[1] == 0.0F
		&& aFloatArray4853[2] == 0.0F && aFloatArray4853[3] == 0.0F
		&& aFloatArray4853[4] == 0.0F && aFloatArray4853[5] == 1.0F
		&& aFloatArray4853[6] == 0.0F && aFloatArray4853[7] == 0.0F
		&& aFloatArray4853[8] == 0.0F && aFloatArray4853[9] == 0.0F
		&& aFloatArray4853[10] == 1.0F && aFloatArray4853[11] == 0.0F
		&& aFloatArray4853[12] == 0.0F && aFloatArray4853[13] == 0.0F
		&& aFloatArray4853[14] == 0.0F && aFloatArray4853[15] == 1.0F);
    }
    
    public boolean method6905() {
	return (aFloatArray4853[0] == 1.0F && aFloatArray4853[1] == 0.0F
		&& aFloatArray4853[2] == 0.0F && aFloatArray4853[3] == 0.0F
		&& aFloatArray4853[4] == 0.0F && aFloatArray4853[5] == 1.0F
		&& aFloatArray4853[6] == 0.0F && aFloatArray4853[7] == 0.0F
		&& aFloatArray4853[8] == 0.0F && aFloatArray4853[9] == 0.0F
		&& aFloatArray4853[10] == 1.0F && aFloatArray4853[11] == 0.0F
		&& aFloatArray4853[12] == 0.0F && aFloatArray4853[13] == 0.0F
		&& aFloatArray4853[14] == 0.0F && aFloatArray4853[15] == 1.0F);
    }
    
    public float[] method6906(float[] fs) {
	float f = aFloatArray4853[3] - aFloatArray4853[1];
	float f_298_ = aFloatArray4853[7] - aFloatArray4853[5];
	float f_299_ = aFloatArray4853[11] - aFloatArray4853[9];
	double d
	    = Math.sqrt((double) (f * f + f_298_ * f_298_ + f_299_ * f_299_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_298_ / d);
	fs[2] = (float) ((double) f_299_ / d);
	fs[3] = (float) ((double) (aFloatArray4853[15] - aFloatArray4853[13])
			 / d);
	return fs;
    }
    
    public float method6907() {
	return ((aFloatArray4853[14] - aFloatArray4853[15])
		/ (aFloatArray4853[11] - aFloatArray4853[10]));
    }
    
    public Class433() {
	aFloatArray4853 = new float[16];
	method6840();
    }
    
    public void method6908(float f, float f_300_, float f_301_, float[] fs) {
	fs[0] = (aFloatArray4853[0] * f + aFloatArray4853[4] * f_300_
		 + aFloatArray4853[8] * f_301_ + aFloatArray4853[12]);
	fs[1] = (aFloatArray4853[1] * f + aFloatArray4853[5] * f_300_
		 + aFloatArray4853[9] * f_301_ + aFloatArray4853[13]);
	fs[2] = (aFloatArray4853[2] * f + aFloatArray4853[6] * f_300_
		 + aFloatArray4853[10] * f_301_ + aFloatArray4853[14]);
	if (fs.length > 3)
	    fs[3] = (aFloatArray4853[3] * f + aFloatArray4853[7] * f_300_
		     + aFloatArray4853[11] * f_301_ + aFloatArray4853[15]);
    }
    
    public void method6909(float f, float f_302_, float f_303_, float[] fs) {
	fs[0] = (aFloatArray4853[0] * f + aFloatArray4853[4] * f_302_
		 + aFloatArray4853[8] * f_303_ + aFloatArray4853[12]);
	fs[1] = (aFloatArray4853[1] * f + aFloatArray4853[5] * f_302_
		 + aFloatArray4853[9] * f_303_ + aFloatArray4853[13]);
	fs[2] = (aFloatArray4853[2] * f + aFloatArray4853[6] * f_302_
		 + aFloatArray4853[10] * f_303_ + aFloatArray4853[14]);
	if (fs.length > 3)
	    fs[3] = (aFloatArray4853[3] * f + aFloatArray4853[7] * f_302_
		     + aFloatArray4853[11] * f_303_ + aFloatArray4853[15]);
    }
    
    public void method6910(float f, float f_304_, float f_305_, float[] fs) {
	fs[0] = (aFloatArray4853[0] * f + aFloatArray4853[4] * f_304_
		 + aFloatArray4853[8] * f_305_ + aFloatArray4853[12]);
	fs[1] = (aFloatArray4853[1] * f + aFloatArray4853[5] * f_304_
		 + aFloatArray4853[9] * f_305_ + aFloatArray4853[13]);
	fs[2] = (aFloatArray4853[2] * f + aFloatArray4853[6] * f_304_
		 + aFloatArray4853[10] * f_305_ + aFloatArray4853[14]);
	if (fs.length > 3)
	    fs[3] = (aFloatArray4853[3] * f + aFloatArray4853[7] * f_304_
		     + aFloatArray4853[11] * f_305_ + aFloatArray4853[15]);
    }
    
    public void method6911(float[] fs) {
	float f = fs[0];
	float f_306_ = fs[1];
	float f_307_ = fs[2];
	fs[0] = (aFloatArray4853[0] * f + aFloatArray4853[4] * f_306_
		 + aFloatArray4853[8] * f_307_ + aFloatArray4853[12]);
	fs[1] = (aFloatArray4853[1] * f + aFloatArray4853[5] * f_306_
		 + aFloatArray4853[9] * f_307_ + aFloatArray4853[13]);
	fs[2] = (aFloatArray4853[2] * f + aFloatArray4853[6] * f_306_
		 + aFloatArray4853[10] * f_307_ + aFloatArray4853[14]);
    }
    
    public float[] method6912(float[] fs) {
	fs[0] = aFloatArray4853[0];
	fs[1] = aFloatArray4853[1];
	fs[2] = aFloatArray4853[2];
	fs[3] = aFloatArray4853[4];
	fs[4] = aFloatArray4853[5];
	fs[5] = aFloatArray4853[6];
	fs[6] = aFloatArray4853[8];
	fs[7] = aFloatArray4853[9];
	fs[8] = aFloatArray4853[10];
	return fs;
    }
    
    public void method6913(float f, float f_308_, float f_309_, float[] fs) {
	fs[0] = (aFloatArray4853[0] * f + aFloatArray4853[4] * f_308_
		 + aFloatArray4853[8] * f_309_);
	fs[1] = (aFloatArray4853[1] * f + aFloatArray4853[5] * f_308_
		 + aFloatArray4853[9] * f_309_);
	fs[2] = (aFloatArray4853[2] * f + aFloatArray4853[6] * f_308_
		 + aFloatArray4853[10] * f_309_);
	if (fs.length > 3)
	    fs[3] = (aFloatArray4853[3] * f + aFloatArray4853[7] * f_308_
		     + aFloatArray4853[11] * f_309_);
    }
    
    public void method6914(float f, float f_310_, float f_311_, float f_312_) {
	float f_313_
	    = (float) (Math.tan((double) (f_311_ / 2.0F)) * (double) f);
	float f_314_
	    = (float) (Math.tan((double) (f_312_ / 2.0F)) * (double) f);
	method6885(-f_313_, f_313_, -f_314_, f_314_, f, f_310_);
    }
    
    public void method6915(float f, float f_315_, float f_316_, float[] fs) {
	fs[0] = (aFloatArray4853[0] * f + aFloatArray4853[4] * f_315_
		 + aFloatArray4853[8] * f_316_ + aFloatArray4853[12]);
	fs[1] = (aFloatArray4853[1] * f + aFloatArray4853[5] * f_315_
		 + aFloatArray4853[9] * f_316_ + aFloatArray4853[13]);
	fs[2] = (aFloatArray4853[2] * f + aFloatArray4853[6] * f_315_
		 + aFloatArray4853[10] * f_316_ + aFloatArray4853[14]);
	if (fs.length > 3)
	    fs[3] = (aFloatArray4853[3] * f + aFloatArray4853[7] * f_315_
		     + aFloatArray4853[11] * f_316_ + aFloatArray4853[15]);
    }
    
    public void method6916(Class446 class446) {
	aFloatArray4853[0] = class446.aFloat4894;
	aFloatArray4853[1] = class446.aFloat4893;
	aFloatArray4853[2] = class446.aFloat4896;
	aFloatArray4853[3] = 0.0F;
	aFloatArray4853[4] = class446.aFloat4897;
	aFloatArray4853[5] = class446.aFloat4904;
	aFloatArray4853[6] = class446.aFloat4899;
	aFloatArray4853[7] = 0.0F;
	aFloatArray4853[8] = class446.aFloat4900;
	aFloatArray4853[9] = class446.aFloat4895;
	aFloatArray4853[10] = class446.aFloat4902;
	aFloatArray4853[11] = 0.0F;
	aFloatArray4853[12] = class446.aFloat4903;
	aFloatArray4853[13] = class446.aFloat4901;
	aFloatArray4853[14] = class446.aFloat4898;
	aFloatArray4853[15] = 1.0F;
    }
    
    public void method6917(float f, float f_317_, float f_318_) {
	method6853(-10000.0F / f_318_, 10000.0F / f_318_, -10000.0F / f_318_,
		   10000.0F / f_318_, f, f_317_);
    }
    
    public void method6918(float f, float f_319_, float f_320_) {
	method6853(-10000.0F / f_320_, 10000.0F / f_320_, -10000.0F / f_320_,
		   10000.0F / f_320_, f, f_319_);
    }
    
    public void method6919(float f, float f_321_, float f_322_) {
	method6853(-10000.0F / f_322_, 10000.0F / f_322_, -10000.0F / f_322_,
		   10000.0F / f_322_, f, f_321_);
    }
    
    public float[] method6920(float[] fs) {
	fs[0] = aFloatArray4853[0];
	fs[1] = aFloatArray4853[1];
	fs[2] = aFloatArray4853[4];
	fs[3] = aFloatArray4853[5];
	fs[4] = aFloatArray4853[8];
	fs[5] = aFloatArray4853[9];
	fs[6] = aFloatArray4853[12];
	fs[7] = aFloatArray4853[13];
	return fs;
    }
    
    public void method6921(float f, float f_323_, float f_324_, float f_325_,
			   float f_326_, float f_327_, float f_328_,
			   float f_329_) {
	aFloatArray4853[0] = f_324_ * 2.0F / f_328_;
	aFloatArray4853[1] = 0.0F;
	aFloatArray4853[2] = 0.0F;
	aFloatArray4853[3] = 0.0F;
	aFloatArray4853[4] = 0.0F;
	aFloatArray4853[5] = f_325_ * 2.0F / f_329_;
	aFloatArray4853[6] = 0.0F;
	aFloatArray4853[7] = 0.0F;
	aFloatArray4853[8] = 2.0F * f / f_328_ - 1.0F;
	aFloatArray4853[9] = 2.0F * f_323_ / f_329_ - 1.0F;
	aFloatArray4853[10] = (f_327_ + f_326_) / (f_327_ - f_326_);
	aFloatArray4853[11] = 1.0F;
	aFloatArray4853[12] = 0.0F;
	aFloatArray4853[13] = 0.0F;
	aFloatArray4853[14] = 2.0F * f_327_ * f_326_ / (f_326_ - f_327_);
	aFloatArray4853[15] = 0.0F;
    }
    
    public void method6922(float f, float f_330_, float f_331_, float f_332_,
			   float f_333_, float f_334_, float f_335_,
			   float f_336_) {
	aFloatArray4853[0] = f_331_ * 2.0F / f_335_;
	aFloatArray4853[1] = 0.0F;
	aFloatArray4853[2] = 0.0F;
	aFloatArray4853[3] = 0.0F;
	aFloatArray4853[4] = 0.0F;
	aFloatArray4853[5] = f_332_ * 2.0F / f_336_;
	aFloatArray4853[6] = 0.0F;
	aFloatArray4853[7] = 0.0F;
	aFloatArray4853[8] = 2.0F * f / f_335_ - 1.0F;
	aFloatArray4853[9] = 2.0F * f_330_ / f_336_ - 1.0F;
	aFloatArray4853[10] = (f_334_ + f_333_) / (f_334_ - f_333_);
	aFloatArray4853[11] = 1.0F;
	aFloatArray4853[12] = 0.0F;
	aFloatArray4853[13] = 0.0F;
	aFloatArray4853[14] = 2.0F * f_334_ * f_333_ / (f_333_ - f_334_);
	aFloatArray4853[15] = 0.0F;
    }
    
    public void method6923(float f, float f_337_, float f_338_, float f_339_,
			   float f_340_, float f_341_, float f_342_,
			   float f_343_) {
	aFloatArray4853[0] = f_338_ * 2.0F / f_342_;
	aFloatArray4853[1] = 0.0F;
	aFloatArray4853[2] = 0.0F;
	aFloatArray4853[3] = 0.0F;
	aFloatArray4853[4] = 0.0F;
	aFloatArray4853[5] = f_339_ * 2.0F / f_343_;
	aFloatArray4853[6] = 0.0F;
	aFloatArray4853[7] = 0.0F;
	aFloatArray4853[8] = 2.0F * f / f_342_ - 1.0F;
	aFloatArray4853[9] = 2.0F * f_337_ / f_343_ - 1.0F;
	aFloatArray4853[10] = (f_341_ + f_340_) / (f_341_ - f_340_);
	aFloatArray4853[11] = 1.0F;
	aFloatArray4853[12] = 0.0F;
	aFloatArray4853[13] = 0.0F;
	aFloatArray4853[14] = 2.0F * f_341_ * f_340_ / (f_340_ - f_341_);
	aFloatArray4853[15] = 0.0F;
    }
    
    public float[] method6924(float[] fs) {
	fs[0] = aFloatArray4853[0];
	fs[1] = aFloatArray4853[1];
	fs[2] = aFloatArray4853[2];
	fs[3] = aFloatArray4853[4];
	fs[4] = aFloatArray4853[5];
	fs[5] = aFloatArray4853[6];
	fs[6] = aFloatArray4853[8];
	fs[7] = aFloatArray4853[9];
	fs[8] = aFloatArray4853[10];
	return fs;
    }
    
    public float method6925() {
	return (-(aFloatArray4853[15] + aFloatArray4853[14])
		/ (aFloatArray4853[11] + aFloatArray4853[10]));
    }
    
    public float method6926() {
	return (-(aFloatArray4853[15] + aFloatArray4853[14])
		/ (aFloatArray4853[11] + aFloatArray4853[10]));
    }
    
    public boolean method6927() {
	return (aFloatArray4853[0] == 1.0F && aFloatArray4853[1] == 0.0F
		&& aFloatArray4853[2] == 0.0F && aFloatArray4853[3] == 0.0F
		&& aFloatArray4853[4] == 0.0F && aFloatArray4853[5] == 1.0F
		&& aFloatArray4853[6] == 0.0F && aFloatArray4853[7] == 0.0F
		&& aFloatArray4853[8] == 0.0F && aFloatArray4853[9] == 0.0F
		&& aFloatArray4853[10] == 1.0F && aFloatArray4853[11] == 0.0F
		&& aFloatArray4853[12] == 0.0F && aFloatArray4853[13] == 0.0F
		&& aFloatArray4853[14] == 0.0F && aFloatArray4853[15] == 1.0F);
    }
    
    public float method6928() {
	return ((aFloatArray4853[14] - aFloatArray4853[15])
		/ (aFloatArray4853[11] - aFloatArray4853[10]));
    }
    
    public float[] method6929(float[] fs) {
	fs[0] = aFloatArray4853[0];
	fs[1] = aFloatArray4853[4];
	fs[2] = aFloatArray4853[8];
	fs[3] = aFloatArray4853[12];
	fs[4] = aFloatArray4853[1];
	fs[5] = aFloatArray4853[5];
	fs[6] = aFloatArray4853[9];
	fs[7] = aFloatArray4853[13];
	return fs;
    }
    
    public float[] method6930(float[] fs) {
	float f = aFloatArray4853[3] - aFloatArray4853[0];
	float f_344_ = aFloatArray4853[7] - aFloatArray4853[4];
	float f_345_ = aFloatArray4853[11] - aFloatArray4853[8];
	double d
	    = Math.sqrt((double) (f * f + f_344_ * f_344_ + f_345_ * f_345_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_344_ / d);
	fs[2] = (float) ((double) f_345_ / d);
	fs[3] = (float) ((double) (aFloatArray4853[15] - aFloatArray4853[12])
			 / d);
	return fs;
    }
    
    public float[] method6931(float[] fs) {
	float f = aFloatArray4853[3] - aFloatArray4853[0];
	float f_346_ = aFloatArray4853[7] - aFloatArray4853[4];
	float f_347_ = aFloatArray4853[11] - aFloatArray4853[8];
	double d
	    = Math.sqrt((double) (f * f + f_346_ * f_346_ + f_347_ * f_347_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_346_ / d);
	fs[2] = (float) ((double) f_347_ / d);
	fs[3] = (float) ((double) (aFloatArray4853[15] - aFloatArray4853[12])
			 / d);
	return fs;
    }
    
    public float[] method6932(float[] fs) {
	float f = aFloatArray4853[3] + aFloatArray4853[1];
	float f_348_ = aFloatArray4853[7] + aFloatArray4853[5];
	float f_349_ = aFloatArray4853[11] + aFloatArray4853[9];
	double d
	    = Math.sqrt((double) (f * f + f_348_ * f_348_ + f_349_ * f_349_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_348_ / d);
	fs[2] = (float) ((double) f_349_ / d);
	fs[3] = (float) ((double) (aFloatArray4853[15] + aFloatArray4853[13])
			 / d);
	return fs;
    }
    
    public float[] method6933(float[] fs) {
	fs[0] = aFloatArray4853[0];
	fs[1] = aFloatArray4853[4];
	fs[2] = aFloatArray4853[8];
	fs[3] = aFloatArray4853[12];
	fs[4] = aFloatArray4853[1];
	fs[5] = aFloatArray4853[5];
	fs[6] = aFloatArray4853[9];
	fs[7] = aFloatArray4853[13];
	return fs;
    }
    
    public float[] method6934(float[] fs) {
	float f = aFloatArray4853[3] + aFloatArray4853[2];
	float f_350_ = aFloatArray4853[7] + aFloatArray4853[6];
	float f_351_ = aFloatArray4853[11] + aFloatArray4853[10];
	double d
	    = Math.sqrt((double) (f * f + f_350_ * f_350_ + f_351_ * f_351_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_350_ / d);
	fs[2] = (float) ((double) f_351_ / d);
	fs[3] = (float) ((double) (aFloatArray4853[15] + aFloatArray4853[14])
			 / d);
	return fs;
    }
    
    public void method6935(int i, int i_352_, int i_353_, float f,
			   float f_354_, float f_355_) {
	if (i != 0) {
	    float f_356_ = Class428.aFloatArray4818[i & 0x3fff];
	    float f_357_ = Class428.aFloatArray4817[i & 0x3fff];
	    aFloatArray4853[0] = f_356_ * (float) i_352_;
	    aFloatArray4853[5] = f_356_ * (float) i_353_;
	    aFloatArray4853[1] = f_357_ * (float) i_352_;
	    aFloatArray4853[4] = -f_357_ * (float) i_353_;
	    aFloatArray4853[10] = 1.0F;
	    float[] fs = aFloatArray4853;
	    float[] fs_358_ = aFloatArray4853;
	    float[] fs_359_ = aFloatArray4853;
	    aFloatArray4853[9] = 0.0F;
	    fs_359_[8] = 0.0F;
	    fs_358_[6] = 0.0F;
	    fs[2] = 0.0F;
	} else {
	    aFloatArray4853[0] = (float) i_352_;
	    aFloatArray4853[5] = (float) i_353_;
	    aFloatArray4853[10] = 1.0F;
	    float[] fs = aFloatArray4853;
	    float[] fs_360_ = aFloatArray4853;
	    float[] fs_361_ = aFloatArray4853;
	    float[] fs_362_ = aFloatArray4853;
	    float[] fs_363_ = aFloatArray4853;
	    aFloatArray4853[9] = 0.0F;
	    fs_363_[8] = 0.0F;
	    fs_362_[6] = 0.0F;
	    fs_361_[4] = 0.0F;
	    fs_360_[2] = 0.0F;
	    fs[1] = 0.0F;
	}
	float[] fs = aFloatArray4853;
	float[] fs_364_ = aFloatArray4853;
	aFloatArray4853[11] = 0.0F;
	fs_364_[7] = 0.0F;
	fs[3] = 0.0F;
	aFloatArray4853[15] = 1.0F;
	aFloatArray4853[12] = f;
	aFloatArray4853[13] = f_354_;
	aFloatArray4853[14] = f_355_;
    }
    
    public float[] method6936(float[] fs) {
	float f = aFloatArray4853[3] + aFloatArray4853[2];
	float f_365_ = aFloatArray4853[7] + aFloatArray4853[6];
	float f_366_ = aFloatArray4853[11] + aFloatArray4853[10];
	double d
	    = Math.sqrt((double) (f * f + f_365_ * f_365_ + f_366_ * f_366_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_365_ / d);
	fs[2] = (float) ((double) f_366_ / d);
	fs[3] = (float) ((double) (aFloatArray4853[15] + aFloatArray4853[14])
			 / d);
	return fs;
    }
    
    public float[] method6937(float[] fs) {
	float f = aFloatArray4853[3] + aFloatArray4853[2];
	float f_367_ = aFloatArray4853[7] + aFloatArray4853[6];
	float f_368_ = aFloatArray4853[11] + aFloatArray4853[10];
	double d
	    = Math.sqrt((double) (f * f + f_367_ * f_367_ + f_368_ * f_368_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_367_ / d);
	fs[2] = (float) ((double) f_368_ / d);
	fs[3] = (float) ((double) (aFloatArray4853[15] + aFloatArray4853[14])
			 / d);
	return fs;
    }
    
    public float[] method6938(float[] fs) {
	System.arraycopy(aFloatArray4853, 0, fs, 0, 16);
	return fs;
    }
    
    public void method6939() {
	float f = aFloatArray4853[0];
	float f_369_ = aFloatArray4853[4];
	float f_370_ = aFloatArray4853[8];
	float f_371_ = aFloatArray4853[12];
	float f_372_ = aFloatArray4853[1];
	float f_373_ = aFloatArray4853[5];
	float f_374_ = aFloatArray4853[9];
	float f_375_ = aFloatArray4853[13];
	float f_376_ = aFloatArray4853[2];
	float f_377_ = aFloatArray4853[6];
	float f_378_ = aFloatArray4853[10];
	float f_379_ = aFloatArray4853[14];
	float f_380_ = aFloatArray4853[3];
	float f_381_ = aFloatArray4853[7];
	float f_382_ = aFloatArray4853[11];
	float f_383_ = aFloatArray4853[15];
	aFloatArray4853[0] = f;
	aFloatArray4853[1] = f_369_;
	aFloatArray4853[2] = f_370_;
	aFloatArray4853[3] = f_371_;
	aFloatArray4853[4] = f_372_;
	aFloatArray4853[5] = f_373_;
	aFloatArray4853[6] = f_374_;
	aFloatArray4853[7] = f_375_;
	aFloatArray4853[8] = f_376_;
	aFloatArray4853[9] = f_377_;
	aFloatArray4853[10] = f_378_;
	aFloatArray4853[11] = f_379_;
	aFloatArray4853[12] = f_380_;
	aFloatArray4853[13] = f_381_;
	aFloatArray4853[14] = f_382_;
	aFloatArray4853[15] = f_383_;
    }
    
    public void method6940() {
	float f = aFloatArray4853[0];
	float f_384_ = aFloatArray4853[4];
	float f_385_ = aFloatArray4853[8];
	float f_386_ = aFloatArray4853[12];
	float f_387_ = aFloatArray4853[1];
	float f_388_ = aFloatArray4853[5];
	float f_389_ = aFloatArray4853[9];
	float f_390_ = aFloatArray4853[13];
	float f_391_ = aFloatArray4853[2];
	float f_392_ = aFloatArray4853[6];
	float f_393_ = aFloatArray4853[10];
	float f_394_ = aFloatArray4853[14];
	float f_395_ = aFloatArray4853[3];
	float f_396_ = aFloatArray4853[7];
	float f_397_ = aFloatArray4853[11];
	float f_398_ = aFloatArray4853[15];
	aFloatArray4853[0] = f;
	aFloatArray4853[1] = f_384_;
	aFloatArray4853[2] = f_385_;
	aFloatArray4853[3] = f_386_;
	aFloatArray4853[4] = f_387_;
	aFloatArray4853[5] = f_388_;
	aFloatArray4853[6] = f_389_;
	aFloatArray4853[7] = f_390_;
	aFloatArray4853[8] = f_391_;
	aFloatArray4853[9] = f_392_;
	aFloatArray4853[10] = f_393_;
	aFloatArray4853[11] = f_394_;
	aFloatArray4853[12] = f_395_;
	aFloatArray4853[13] = f_396_;
	aFloatArray4853[14] = f_397_;
	aFloatArray4853[15] = f_398_;
    }
    
    public void method6941() {
	float f = aFloatArray4853[0];
	float f_399_ = aFloatArray4853[4];
	float f_400_ = aFloatArray4853[8];
	float f_401_ = aFloatArray4853[12];
	float f_402_ = aFloatArray4853[1];
	float f_403_ = aFloatArray4853[5];
	float f_404_ = aFloatArray4853[9];
	float f_405_ = aFloatArray4853[13];
	float f_406_ = aFloatArray4853[2];
	float f_407_ = aFloatArray4853[6];
	float f_408_ = aFloatArray4853[10];
	float f_409_ = aFloatArray4853[14];
	float f_410_ = aFloatArray4853[3];
	float f_411_ = aFloatArray4853[7];
	float f_412_ = aFloatArray4853[11];
	float f_413_ = aFloatArray4853[15];
	aFloatArray4853[0] = f;
	aFloatArray4853[1] = f_399_;
	aFloatArray4853[2] = f_400_;
	aFloatArray4853[3] = f_401_;
	aFloatArray4853[4] = f_402_;
	aFloatArray4853[5] = f_403_;
	aFloatArray4853[6] = f_404_;
	aFloatArray4853[7] = f_405_;
	aFloatArray4853[8] = f_406_;
	aFloatArray4853[9] = f_407_;
	aFloatArray4853[10] = f_408_;
	aFloatArray4853[11] = f_409_;
	aFloatArray4853[12] = f_410_;
	aFloatArray4853[13] = f_411_;
	aFloatArray4853[14] = f_412_;
	aFloatArray4853[15] = f_413_;
    }
    
    public boolean method6942() {
	return (aFloatArray4853[0] == 1.0F && aFloatArray4853[1] == 0.0F
		&& aFloatArray4853[2] == 0.0F && aFloatArray4853[3] == 0.0F
		&& aFloatArray4853[4] == 0.0F && aFloatArray4853[5] == 1.0F
		&& aFloatArray4853[6] == 0.0F && aFloatArray4853[7] == 0.0F
		&& aFloatArray4853[8] == 0.0F && aFloatArray4853[9] == 0.0F
		&& aFloatArray4853[10] == 1.0F && aFloatArray4853[11] == 0.0F
		&& aFloatArray4853[12] == 0.0F && aFloatArray4853[13] == 0.0F
		&& aFloatArray4853[14] == 0.0F && aFloatArray4853[15] == 1.0F);
    }
    
    public float[] method6943(float[] fs) {
	System.arraycopy(aFloatArray4853, 0, fs, 0, 16);
	return fs;
    }
    
    public float[] method6944(float[] fs) {
	System.arraycopy(aFloatArray4853, 0, fs, 0, 16);
	fs[3] = 0.0F;
	fs[7] = 0.0F;
	fs[11] = 0.0F;
	fs[12] = 0.0F;
	fs[13] = 0.0F;
	fs[14] = 0.0F;
	fs[15] = 1.0F;
	return fs;
    }
    
    public float[] method6945(float[] fs) {
	float f = aFloatArray4853[3] - aFloatArray4853[1];
	float f_414_ = aFloatArray4853[7] - aFloatArray4853[5];
	float f_415_ = aFloatArray4853[11] - aFloatArray4853[9];
	double d
	    = Math.sqrt((double) (f * f + f_414_ * f_414_ + f_415_ * f_415_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_414_ / d);
	fs[2] = (float) ((double) f_415_ / d);
	fs[3] = (float) ((double) (aFloatArray4853[15] - aFloatArray4853[13])
			 / d);
	return fs;
    }
    
    public void method6946(float f, float f_416_, float f_417_, float[] fs) {
	fs[0] = (aFloatArray4853[0] * f + aFloatArray4853[4] * f_416_
		 + aFloatArray4853[8] * f_417_ + aFloatArray4853[12]);
	fs[1] = (aFloatArray4853[1] * f + aFloatArray4853[5] * f_416_
		 + aFloatArray4853[9] * f_417_ + aFloatArray4853[13]);
	fs[2] = (aFloatArray4853[2] * f + aFloatArray4853[6] * f_416_
		 + aFloatArray4853[10] * f_417_ + aFloatArray4853[14]);
	if (fs.length > 3)
	    fs[3] = (aFloatArray4853[3] * f + aFloatArray4853[7] * f_416_
		     + aFloatArray4853[11] * f_417_ + aFloatArray4853[15]);
    }
    
    public float[] method6947(float[] fs) {
	fs[0] = aFloatArray4853[0];
	fs[1] = aFloatArray4853[4];
	fs[2] = aFloatArray4853[8];
	fs[3] = aFloatArray4853[12];
	fs[4] = aFloatArray4853[1];
	fs[5] = aFloatArray4853[5];
	fs[6] = aFloatArray4853[9];
	fs[7] = aFloatArray4853[13];
	fs[8] = aFloatArray4853[2];
	fs[9] = aFloatArray4853[6];
	fs[10] = aFloatArray4853[10];
	fs[11] = aFloatArray4853[14];
	fs[12] = aFloatArray4853[3];
	fs[13] = aFloatArray4853[7];
	fs[14] = aFloatArray4853[11];
	fs[15] = aFloatArray4853[15];
	return fs;
    }
    
    public void method6948() {
	aFloatArray4853[0] = 1.0F;
	aFloatArray4853[1] = 0.0F;
	aFloatArray4853[2] = 0.0F;
	aFloatArray4853[3] = 0.0F;
	aFloatArray4853[4] = 0.0F;
	aFloatArray4853[5] = 1.0F;
	aFloatArray4853[6] = 0.0F;
	aFloatArray4853[7] = 0.0F;
	aFloatArray4853[8] = 0.0F;
	aFloatArray4853[9] = 0.0F;
	aFloatArray4853[10] = 1.0F;
	aFloatArray4853[11] = 0.0F;
	aFloatArray4853[12] = 0.0F;
	aFloatArray4853[13] = 0.0F;
	aFloatArray4853[14] = 0.0F;
	aFloatArray4853[15] = 1.0F;
    }
    
    public float[] method6949(float[] fs) {
	float f = aFloatArray4853[3] - aFloatArray4853[0];
	float f_418_ = aFloatArray4853[7] - aFloatArray4853[4];
	float f_419_ = aFloatArray4853[11] - aFloatArray4853[8];
	double d
	    = Math.sqrt((double) (f * f + f_418_ * f_418_ + f_419_ * f_419_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_418_ / d);
	fs[2] = (float) ((double) f_419_ / d);
	fs[3] = (float) ((double) (aFloatArray4853[15] - aFloatArray4853[12])
			 / d);
	return fs;
    }
    
    public float[] method6950(float[] fs) {
	System.arraycopy(aFloatArray4853, 0, fs, 0, 16);
	return fs;
    }
    
    public void method6951(float f, float f_420_, float f_421_, float f_422_,
			   float f_423_, float f_424_, float f_425_,
			   float f_426_, float f_427_) {
	method6853(-(f * f_427_) / f_421_, f_427_ * (f_425_ - f) / f_421_,
		   -(f_420_ * f_427_) / f_422_,
		   f_427_ * (f_426_ - f_420_) / f_422_, f_423_, f_424_);
    }
    
    public String toString() {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i = 0; i < 4; i++) {
	    for (int i_428_ = 0; i_428_ < 4; i_428_++) {
		if (i_428_ > 0)
		    stringbuilder.append("\t");
		stringbuilder.append(aFloatArray4853[i * 4 + i_428_]);
	    }
	    stringbuilder.append("\n");
	}
	return stringbuilder.toString();
    }
    
    public void method6952(float f, float f_429_, float f_430_, float f_431_) {
	aFloatArray4853[0] = f;
	aFloatArray4853[1] = 0.0F;
	aFloatArray4853[2] = 0.0F;
	aFloatArray4853[3] = 0.0F;
	aFloatArray4853[4] = 0.0F;
	aFloatArray4853[5] = f_429_;
	aFloatArray4853[6] = 0.0F;
	aFloatArray4853[7] = 0.0F;
	aFloatArray4853[8] = 0.0F;
	aFloatArray4853[9] = 0.0F;
	aFloatArray4853[10] = f_430_;
	aFloatArray4853[11] = 0.0F;
	aFloatArray4853[12] = 0.0F;
	aFloatArray4853[13] = 0.0F;
	aFloatArray4853[14] = 0.0F;
	aFloatArray4853[15] = f_431_;
    }
    
    public float[] method6953(float[] fs) {
	fs[0] = aFloatArray4853[0];
	fs[1] = aFloatArray4853[1];
	fs[2] = 0.0F;
	fs[3] = 0.0F;
	fs[4] = aFloatArray4853[4];
	fs[5] = aFloatArray4853[5];
	fs[6] = 0.0F;
	fs[7] = 0.0F;
	fs[8] = aFloatArray4853[12];
	fs[9] = aFloatArray4853[13];
	fs[10] = aFloatArray4853[14];
	fs[11] = 0.0F;
	fs[12] = 0.0F;
	fs[13] = 0.0F;
	fs[14] = 0.0F;
	fs[15] = 1.0F;
	return fs;
    }
    
    public void method6954(int i, int i_432_, int i_433_, float f,
			   float f_434_, float f_435_) {
	if (i != 0) {
	    float f_436_ = Class428.aFloatArray4818[i & 0x3fff];
	    float f_437_ = Class428.aFloatArray4817[i & 0x3fff];
	    aFloatArray4853[0] = f_436_ * (float) i_432_;
	    aFloatArray4853[5] = f_436_ * (float) i_433_;
	    aFloatArray4853[1] = f_437_ * (float) i_432_;
	    aFloatArray4853[4] = -f_437_ * (float) i_433_;
	    aFloatArray4853[10] = 1.0F;
	    float[] fs = aFloatArray4853;
	    float[] fs_438_ = aFloatArray4853;
	    float[] fs_439_ = aFloatArray4853;
	    aFloatArray4853[9] = 0.0F;
	    fs_439_[8] = 0.0F;
	    fs_438_[6] = 0.0F;
	    fs[2] = 0.0F;
	} else {
	    aFloatArray4853[0] = (float) i_432_;
	    aFloatArray4853[5] = (float) i_433_;
	    aFloatArray4853[10] = 1.0F;
	    float[] fs = aFloatArray4853;
	    float[] fs_440_ = aFloatArray4853;
	    float[] fs_441_ = aFloatArray4853;
	    float[] fs_442_ = aFloatArray4853;
	    float[] fs_443_ = aFloatArray4853;
	    aFloatArray4853[9] = 0.0F;
	    fs_443_[8] = 0.0F;
	    fs_442_[6] = 0.0F;
	    fs_441_[4] = 0.0F;
	    fs_440_[2] = 0.0F;
	    fs[1] = 0.0F;
	}
	float[] fs = aFloatArray4853;
	float[] fs_444_ = aFloatArray4853;
	aFloatArray4853[11] = 0.0F;
	fs_444_[7] = 0.0F;
	fs[3] = 0.0F;
	aFloatArray4853[15] = 1.0F;
	aFloatArray4853[12] = f;
	aFloatArray4853[13] = f_434_;
	aFloatArray4853[14] = f_435_;
    }
    
    public void method6955(int i, int i_445_, int i_446_, float f,
			   float f_447_, float f_448_) {
	if (i != 0) {
	    float f_449_ = Class428.aFloatArray4818[i & 0x3fff];
	    float f_450_ = Class428.aFloatArray4817[i & 0x3fff];
	    aFloatArray4853[0] = f_449_ * (float) i_445_;
	    aFloatArray4853[5] = f_449_ * (float) i_446_;
	    aFloatArray4853[1] = f_450_ * (float) i_445_;
	    aFloatArray4853[4] = -f_450_ * (float) i_446_;
	    aFloatArray4853[10] = 1.0F;
	    float[] fs = aFloatArray4853;
	    float[] fs_451_ = aFloatArray4853;
	    float[] fs_452_ = aFloatArray4853;
	    aFloatArray4853[9] = 0.0F;
	    fs_452_[8] = 0.0F;
	    fs_451_[6] = 0.0F;
	    fs[2] = 0.0F;
	} else {
	    aFloatArray4853[0] = (float) i_445_;
	    aFloatArray4853[5] = (float) i_446_;
	    aFloatArray4853[10] = 1.0F;
	    float[] fs = aFloatArray4853;
	    float[] fs_453_ = aFloatArray4853;
	    float[] fs_454_ = aFloatArray4853;
	    float[] fs_455_ = aFloatArray4853;
	    float[] fs_456_ = aFloatArray4853;
	    aFloatArray4853[9] = 0.0F;
	    fs_456_[8] = 0.0F;
	    fs_455_[6] = 0.0F;
	    fs_454_[4] = 0.0F;
	    fs_453_[2] = 0.0F;
	    fs[1] = 0.0F;
	}
	float[] fs = aFloatArray4853;
	float[] fs_457_ = aFloatArray4853;
	aFloatArray4853[11] = 0.0F;
	fs_457_[7] = 0.0F;
	fs[3] = 0.0F;
	aFloatArray4853[15] = 1.0F;
	aFloatArray4853[12] = f;
	aFloatArray4853[13] = f_447_;
	aFloatArray4853[14] = f_448_;
    }
}
