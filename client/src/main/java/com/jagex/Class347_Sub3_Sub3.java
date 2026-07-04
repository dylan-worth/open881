/* Class347_Sub3_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class347_Sub3_Sub3 extends Class347_Sub3
{
    float[] aFloatArray11634;
    float[] aFloatArray11635;
    float[] aFloatArray11636;
    int anInt11637 = 0;
    
    void method15866(Class534_Sub40 class534_sub40, int i) {
	aFloatArray11634 = new float[i];
	aFloatArray11635 = new float[i];
	aFloatArray11636 = new float[i];
	anInt11637 = 0;
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    aFloatArray11634[i_0_] = class534_sub40.method16539(-2093724147);
	    aFloatArray11635[i_0_] = class534_sub40.method16539(-1701426422);
	    aFloatArray11636[i_0_] = class534_sub40.method16539(-1705893119);
	}
    }
    
    void method15856() {
	anInt11637 += 1005201447;
    }
    
    float method15853(float f, float f_1_, float f_2_, int i) {
	float f_3_ = aFloat10251 / f;
	if (f_3_ < 0.0F)
	    f_3_ = 0.0F;
	if (f_3_ > 1.0F)
	    f_3_ = 1.0F;
	return (f / aFloatArray11636[1047840663 * anInt11637]
		* ((aFloatArray11635[anInt11637 * 1047840663]
		    - aFloatArray11634[anInt11637 * 1047840663]) * f_3_
		   + aFloatArray11634[anInt11637 * 1047840663]));
    }
    
    void method15860(Class534_Sub40 class534_sub40, int i, int i_4_) {
	aFloatArray11634 = new float[i];
	aFloatArray11635 = new float[i];
	aFloatArray11636 = new float[i];
	anInt11637 = 0;
	for (int i_5_ = 0; i_5_ < i; i_5_++) {
	    aFloatArray11634[i_5_] = class534_sub40.method16539(-1367817949);
	    aFloatArray11635[i_5_] = class534_sub40.method16539(-971705787);
	    aFloatArray11636[i_5_] = class534_sub40.method16539(-2090779379);
	}
    }
    
    void method15855() {
	anInt11637 += 1005201447;
    }
    
    public Class347_Sub3_Sub3(Class298 class298) {
	super(class298);
    }
    
    void method15858(Class534_Sub40 class534_sub40, int i) {
	aFloatArray11634 = new float[i];
	aFloatArray11635 = new float[i];
	aFloatArray11636 = new float[i];
	anInt11637 = 0;
	for (int i_6_ = 0; i_6_ < i; i_6_++) {
	    aFloatArray11634[i_6_] = class534_sub40.method16539(-1389936945);
	    aFloatArray11635[i_6_] = class534_sub40.method16539(-1693464574);
	    aFloatArray11636[i_6_] = class534_sub40.method16539(-1856226923);
	}
    }
    
    void method15857(Class534_Sub40 class534_sub40, int i) {
	aFloatArray11634 = new float[i];
	aFloatArray11635 = new float[i];
	aFloatArray11636 = new float[i];
	anInt11637 = 0;
	for (int i_7_ = 0; i_7_ < i; i_7_++) {
	    aFloatArray11634[i_7_] = class534_sub40.method16539(-2142664258);
	    aFloatArray11635[i_7_] = class534_sub40.method16539(-1743514040);
	    aFloatArray11636[i_7_] = class534_sub40.method16539(-1295847310);
	}
    }
    
    void method15854(byte i) {
	anInt11637 += 1005201447;
    }
    
    float method15862(float f, float f_8_, float f_9_) {
	float f_10_ = aFloat10251 / f;
	if (f_10_ < 0.0F)
	    f_10_ = 0.0F;
	if (f_10_ > 1.0F)
	    f_10_ = 1.0F;
	return (f / aFloatArray11636[1047840663 * anInt11637]
		* ((aFloatArray11635[anInt11637 * 1047840663]
		    - aFloatArray11634[anInt11637 * 1047840663]) * f_10_
		   + aFloatArray11634[anInt11637 * 1047840663]));
    }
    
    float method15863(float f, float f_11_, float f_12_) {
	float f_13_ = aFloat10251 / f;
	if (f_13_ < 0.0F)
	    f_13_ = 0.0F;
	if (f_13_ > 1.0F)
	    f_13_ = 1.0F;
	return (f / aFloatArray11636[1047840663 * anInt11637]
		* ((aFloatArray11635[anInt11637 * 1047840663]
		    - aFloatArray11634[anInt11637 * 1047840663]) * f_13_
		   + aFloatArray11634[anInt11637 * 1047840663]));
    }
}
