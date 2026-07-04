/* Class442 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class442
{
    public float[] aFloatArray4877 = new float[9];
    
    public Class443 method7130() {
	Class443 class443 = new Class443();
	double d = (double) (1.0F + aFloatArray4877[0] + aFloatArray4877[4]
			     + aFloatArray4877[8]);
	if (d > 1.0E-8) {
	    float f = (float) (Math.sqrt(d) * 2.0);
	    class443.aFloat4881
		= (aFloatArray4877[7] - aFloatArray4877[5]) / f;
	    class443.aFloat4884
		= (aFloatArray4877[2] - aFloatArray4877[6]) / f;
	    class443.aFloat4883
		= (aFloatArray4877[3] - aFloatArray4877[1]) / f;
	    class443.aFloat4879 = 0.25F * f;
	} else if (aFloatArray4877[0] > aFloatArray4877[4]
		   && aFloatArray4877[0] > aFloatArray4877[8]) {
	    float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4877[0]
						   - aFloatArray4877[4]
						   - aFloatArray4877[8]))
			       * 2.0);
	    class443.aFloat4881 = 0.25F * f;
	    class443.aFloat4884
		= (aFloatArray4877[3] + aFloatArray4877[1]) / f;
	    class443.aFloat4883
		= (aFloatArray4877[2] + aFloatArray4877[6]) / f;
	    class443.aFloat4879
		= (aFloatArray4877[7] - aFloatArray4877[5]) / f;
	} else if (aFloatArray4877[4] > aFloatArray4877[8]) {
	    float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4877[4]
						   - aFloatArray4877[0]
						   - aFloatArray4877[8]))
			       * 2.0);
	    class443.aFloat4881
		= (aFloatArray4877[3] + aFloatArray4877[1]) / f;
	    class443.aFloat4884 = 0.25F * f;
	    class443.aFloat4883
		= (aFloatArray4877[7] + aFloatArray4877[5]) / f;
	    class443.aFloat4879
		= (aFloatArray4877[2] - aFloatArray4877[6]) / f;
	} else {
	    float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4877[8]
						   - aFloatArray4877[0]
						   - aFloatArray4877[4]))
			       * 2.0);
	    class443.aFloat4881
		= (aFloatArray4877[2] + aFloatArray4877[6]) / f;
	    class443.aFloat4884
		= (aFloatArray4877[7] + aFloatArray4877[5]) / f;
	    class443.aFloat4883 = 0.25F * f;
	    class443.aFloat4879
		= (aFloatArray4877[3] - aFloatArray4877[1]) / f;
	}
	return class443;
    }
    
    public Class443 method7131() {
	Class443 class443 = new Class443();
	double d = (double) (1.0F + aFloatArray4877[0] + aFloatArray4877[4]
			     + aFloatArray4877[8]);
	if (d > 1.0E-8) {
	    float f = (float) (Math.sqrt(d) * 2.0);
	    class443.aFloat4881
		= (aFloatArray4877[7] - aFloatArray4877[5]) / f;
	    class443.aFloat4884
		= (aFloatArray4877[2] - aFloatArray4877[6]) / f;
	    class443.aFloat4883
		= (aFloatArray4877[3] - aFloatArray4877[1]) / f;
	    class443.aFloat4879 = 0.25F * f;
	} else if (aFloatArray4877[0] > aFloatArray4877[4]
		   && aFloatArray4877[0] > aFloatArray4877[8]) {
	    float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4877[0]
						   - aFloatArray4877[4]
						   - aFloatArray4877[8]))
			       * 2.0);
	    class443.aFloat4881 = 0.25F * f;
	    class443.aFloat4884
		= (aFloatArray4877[3] + aFloatArray4877[1]) / f;
	    class443.aFloat4883
		= (aFloatArray4877[2] + aFloatArray4877[6]) / f;
	    class443.aFloat4879
		= (aFloatArray4877[7] - aFloatArray4877[5]) / f;
	} else if (aFloatArray4877[4] > aFloatArray4877[8]) {
	    float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4877[4]
						   - aFloatArray4877[0]
						   - aFloatArray4877[8]))
			       * 2.0);
	    class443.aFloat4881
		= (aFloatArray4877[3] + aFloatArray4877[1]) / f;
	    class443.aFloat4884 = 0.25F * f;
	    class443.aFloat4883
		= (aFloatArray4877[7] + aFloatArray4877[5]) / f;
	    class443.aFloat4879
		= (aFloatArray4877[2] - aFloatArray4877[6]) / f;
	} else {
	    float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4877[8]
						   - aFloatArray4877[0]
						   - aFloatArray4877[4]))
			       * 2.0);
	    class443.aFloat4881
		= (aFloatArray4877[2] + aFloatArray4877[6]) / f;
	    class443.aFloat4884
		= (aFloatArray4877[7] + aFloatArray4877[5]) / f;
	    class443.aFloat4883 = 0.25F * f;
	    class443.aFloat4879
		= (aFloatArray4877[3] - aFloatArray4877[1]) / f;
	}
	return class443;
    }
    
    public Class442() {
	method7135();
    }
    
    public Class443 method7132() {
	Class443 class443 = new Class443();
	double d = (double) (1.0F + aFloatArray4877[0] + aFloatArray4877[4]
			     + aFloatArray4877[8]);
	if (d > 1.0E-8) {
	    float f = (float) (Math.sqrt(d) * 2.0);
	    class443.aFloat4881
		= (aFloatArray4877[7] - aFloatArray4877[5]) / f;
	    class443.aFloat4884
		= (aFloatArray4877[2] - aFloatArray4877[6]) / f;
	    class443.aFloat4883
		= (aFloatArray4877[3] - aFloatArray4877[1]) / f;
	    class443.aFloat4879 = 0.25F * f;
	} else if (aFloatArray4877[0] > aFloatArray4877[4]
		   && aFloatArray4877[0] > aFloatArray4877[8]) {
	    float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4877[0]
						   - aFloatArray4877[4]
						   - aFloatArray4877[8]))
			       * 2.0);
	    class443.aFloat4881 = 0.25F * f;
	    class443.aFloat4884
		= (aFloatArray4877[3] + aFloatArray4877[1]) / f;
	    class443.aFloat4883
		= (aFloatArray4877[2] + aFloatArray4877[6]) / f;
	    class443.aFloat4879
		= (aFloatArray4877[7] - aFloatArray4877[5]) / f;
	} else if (aFloatArray4877[4] > aFloatArray4877[8]) {
	    float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4877[4]
						   - aFloatArray4877[0]
						   - aFloatArray4877[8]))
			       * 2.0);
	    class443.aFloat4881
		= (aFloatArray4877[3] + aFloatArray4877[1]) / f;
	    class443.aFloat4884 = 0.25F * f;
	    class443.aFloat4883
		= (aFloatArray4877[7] + aFloatArray4877[5]) / f;
	    class443.aFloat4879
		= (aFloatArray4877[2] - aFloatArray4877[6]) / f;
	} else {
	    float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4877[8]
						   - aFloatArray4877[0]
						   - aFloatArray4877[4]))
			       * 2.0);
	    class443.aFloat4881
		= (aFloatArray4877[2] + aFloatArray4877[6]) / f;
	    class443.aFloat4884
		= (aFloatArray4877[7] + aFloatArray4877[5]) / f;
	    class443.aFloat4883 = 0.25F * f;
	    class443.aFloat4879
		= (aFloatArray4877[3] - aFloatArray4877[1]) / f;
	}
	return class443;
    }
    
    public Class443 method7133() {
	Class443 class443 = new Class443();
	double d = (double) (1.0F + aFloatArray4877[0] + aFloatArray4877[4]
			     + aFloatArray4877[8]);
	if (d > 1.0E-8) {
	    float f = (float) (Math.sqrt(d) * 2.0);
	    class443.aFloat4881
		= (aFloatArray4877[7] - aFloatArray4877[5]) / f;
	    class443.aFloat4884
		= (aFloatArray4877[2] - aFloatArray4877[6]) / f;
	    class443.aFloat4883
		= (aFloatArray4877[3] - aFloatArray4877[1]) / f;
	    class443.aFloat4879 = 0.25F * f;
	} else if (aFloatArray4877[0] > aFloatArray4877[4]
		   && aFloatArray4877[0] > aFloatArray4877[8]) {
	    float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4877[0]
						   - aFloatArray4877[4]
						   - aFloatArray4877[8]))
			       * 2.0);
	    class443.aFloat4881 = 0.25F * f;
	    class443.aFloat4884
		= (aFloatArray4877[3] + aFloatArray4877[1]) / f;
	    class443.aFloat4883
		= (aFloatArray4877[2] + aFloatArray4877[6]) / f;
	    class443.aFloat4879
		= (aFloatArray4877[7] - aFloatArray4877[5]) / f;
	} else if (aFloatArray4877[4] > aFloatArray4877[8]) {
	    float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4877[4]
						   - aFloatArray4877[0]
						   - aFloatArray4877[8]))
			       * 2.0);
	    class443.aFloat4881
		= (aFloatArray4877[3] + aFloatArray4877[1]) / f;
	    class443.aFloat4884 = 0.25F * f;
	    class443.aFloat4883
		= (aFloatArray4877[7] + aFloatArray4877[5]) / f;
	    class443.aFloat4879
		= (aFloatArray4877[2] - aFloatArray4877[6]) / f;
	} else {
	    float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4877[8]
						   - aFloatArray4877[0]
						   - aFloatArray4877[4]))
			       * 2.0);
	    class443.aFloat4881
		= (aFloatArray4877[2] + aFloatArray4877[6]) / f;
	    class443.aFloat4884
		= (aFloatArray4877[7] + aFloatArray4877[5]) / f;
	    class443.aFloat4883 = 0.25F * f;
	    class443.aFloat4879
		= (aFloatArray4877[3] - aFloatArray4877[1]) / f;
	}
	return class443;
    }
    
    void method7134() {
	aFloatArray4877[0] = 1.0F;
	aFloatArray4877[1] = 0.0F;
	aFloatArray4877[2] = 0.0F;
	aFloatArray4877[3] = 0.0F;
	aFloatArray4877[4] = 1.0F;
	aFloatArray4877[5] = 0.0F;
	aFloatArray4877[6] = 0.0F;
	aFloatArray4877[7] = 0.0F;
	aFloatArray4877[8] = 1.0F;
    }
    
    void method7135() {
	aFloatArray4877[0] = 1.0F;
	aFloatArray4877[1] = 0.0F;
	aFloatArray4877[2] = 0.0F;
	aFloatArray4877[3] = 0.0F;
	aFloatArray4877[4] = 1.0F;
	aFloatArray4877[5] = 0.0F;
	aFloatArray4877[6] = 0.0F;
	aFloatArray4877[7] = 0.0F;
	aFloatArray4877[8] = 1.0F;
    }
}
