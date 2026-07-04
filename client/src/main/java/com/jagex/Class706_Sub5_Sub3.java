/* Class706_Sub5_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class706_Sub5_Sub3 extends Class706_Sub5
{
    float[] aFloatArray11907;
    float[] aFloatArray11908;
    float[] aFloatArray11909;
    int anInt11910 = 0;
    
    float method17328(float f, float f_0_, float f_1_, int i) {
	float f_2_ = aFloat11003 / f;
	if (f_2_ < 0.0F)
	    f_2_ = 0.0F;
	if (f_2_ > 1.0F)
	    f_2_ = 1.0F;
	return ((f_2_ * (aFloatArray11907[anInt11910 * -1245956203]
			 - aFloatArray11908[-1245956203 * anInt11910])
		 + aFloatArray11908[anInt11910 * -1245956203])
		* (f / aFloatArray11909[-1245956203 * anInt11910]));
    }
    
    void method17342(int i) {
	anInt11910 += 1692752829;
    }
    
    float method17332(float f, float f_3_, float f_4_) {
	float f_5_ = aFloat11003 / f;
	if (f_5_ < 0.0F)
	    f_5_ = 0.0F;
	if (f_5_ > 1.0F)
	    f_5_ = 1.0F;
	return ((f_5_ * (aFloatArray11907[anInt11910 * -1245956203]
			 - aFloatArray11908[-1245956203 * anInt11910])
		 + aFloatArray11908[anInt11910 * -1245956203])
		* (f / aFloatArray11909[-1245956203 * anInt11910]));
    }
    
    void method17340(Class534_Sub40 class534_sub40, int i, byte i_6_) {
	aFloatArray11908 = new float[i];
	aFloatArray11907 = new float[i];
	aFloatArray11909 = new float[i];
	anInt11910 = 0;
	for (int i_7_ = 0; i_7_ < i; i_7_++) {
	    aFloatArray11908[i_7_] = class534_sub40.method16539(-1483966968);
	    aFloatArray11907[i_7_] = class534_sub40.method16539(-1399601452);
	    aFloatArray11909[i_7_] = class534_sub40.method16539(-1717854464);
	}
    }
    
    void method17337(Class534_Sub40 class534_sub40, int i) {
	aFloatArray11908 = new float[i];
	aFloatArray11907 = new float[i];
	aFloatArray11909 = new float[i];
	anInt11910 = 0;
	for (int i_8_ = 0; i_8_ < i; i_8_++) {
	    aFloatArray11908[i_8_] = class534_sub40.method16539(-987408656);
	    aFloatArray11907[i_8_] = class534_sub40.method16539(-1926268363);
	    aFloatArray11909[i_8_] = class534_sub40.method16539(-1924519812);
	}
    }
    
    float method17333(float f, float f_9_, float f_10_) {
	float f_11_ = aFloat11003 / f;
	if (f_11_ < 0.0F)
	    f_11_ = 0.0F;
	if (f_11_ > 1.0F)
	    f_11_ = 1.0F;
	return ((f_11_ * (aFloatArray11907[anInt11910 * -1245956203]
			  - aFloatArray11908[-1245956203 * anInt11910])
		 + aFloatArray11908[anInt11910 * -1245956203])
		* (f / aFloatArray11909[-1245956203 * anInt11910]));
    }
    
    float method17334(float f, float f_12_, float f_13_) {
	float f_14_ = aFloat11003 / f;
	if (f_14_ < 0.0F)
	    f_14_ = 0.0F;
	if (f_14_ > 1.0F)
	    f_14_ = 1.0F;
	return ((f_14_ * (aFloatArray11907[anInt11910 * -1245956203]
			  - aFloatArray11908[-1245956203 * anInt11910])
		 + aFloatArray11908[anInt11910 * -1245956203])
		* (f / aFloatArray11909[-1245956203 * anInt11910]));
    }
    
    void method17336(Class534_Sub40 class534_sub40, int i) {
	aFloatArray11908 = new float[i];
	aFloatArray11907 = new float[i];
	aFloatArray11909 = new float[i];
	anInt11910 = 0;
	for (int i_15_ = 0; i_15_ < i; i_15_++) {
	    aFloatArray11908[i_15_] = class534_sub40.method16539(-1084608420);
	    aFloatArray11907[i_15_] = class534_sub40.method16539(-1135703053);
	    aFloatArray11909[i_15_] = class534_sub40.method16539(-1875719982);
	}
    }
    
    void method17339(Class534_Sub40 class534_sub40, int i) {
	aFloatArray11908 = new float[i];
	aFloatArray11907 = new float[i];
	aFloatArray11909 = new float[i];
	anInt11910 = 0;
	for (int i_16_ = 0; i_16_ < i; i_16_++) {
	    aFloatArray11908[i_16_] = class534_sub40.method16539(-1861020985);
	    aFloatArray11907[i_16_] = class534_sub40.method16539(-1076573898);
	    aFloatArray11909[i_16_] = class534_sub40.method16539(-1863391120);
	}
    }
    
    public Class706_Sub5_Sub3(Class298 class298) {
	super(class298);
    }
    
    void method17335() {
	anInt11910 += 1692752829;
    }
}
