/* Class441 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class441
{
    public float aFloat4873;
    public float aFloat4874;
    public float aFloat4875;
    public float aFloat4876;
    
    public final void method7104() {
	aFloat4873 = -aFloat4873;
	aFloat4874 = -aFloat4874;
	aFloat4876 = -aFloat4876;
	aFloat4875 = -aFloat4875;
    }
    
    public Class441(float f, float f_0_, float f_1_, float f_2_) {
	method7105(f, f_0_, f_1_, f_2_);
    }
    
    public void method7105(float f, float f_3_, float f_4_, float f_5_) {
	aFloat4873 = f;
	aFloat4874 = f_3_;
	aFloat4876 = f_4_;
	aFloat4875 = f_5_;
    }
    
    public void method7106(Class441 class441_6_) {
	method7105(class441_6_.aFloat4873, class441_6_.aFloat4874,
		   class441_6_.aFloat4876, class441_6_.aFloat4875);
    }
    
    final void method7107() {
	aFloat4875 = 0.0F;
	aFloat4876 = 0.0F;
	aFloat4874 = 0.0F;
	aFloat4873 = 0.0F;
    }
    
    public void method7108(Class441 class441_7_) {
	method7105(class441_7_.aFloat4873, class441_7_.aFloat4874,
		   class441_7_.aFloat4876, class441_7_.aFloat4875);
    }
    
    public final void method7109() {
	aFloat4873 = -aFloat4873;
	aFloat4874 = -aFloat4874;
	aFloat4876 = -aFloat4876;
	aFloat4875 = -aFloat4875;
    }
    
    public final void method7110(float f) {
	aFloat4873 *= f;
	aFloat4874 *= f;
	aFloat4876 *= f;
	aFloat4875 *= f;
    }
    
    public final void method7111(Class433 class433) {
	float f = aFloat4873;
	float f_8_ = aFloat4874;
	float f_9_ = aFloat4876;
	float f_10_ = aFloat4875;
	aFloat4873 = (class433.aFloatArray4853[0] * f
		      + class433.aFloatArray4853[4] * f_8_
		      + class433.aFloatArray4853[8] * f_9_
		      + class433.aFloatArray4853[12] * f_10_);
	aFloat4874 = (class433.aFloatArray4853[1] * f
		      + class433.aFloatArray4853[5] * f_8_
		      + class433.aFloatArray4853[9] * f_9_
		      + class433.aFloatArray4853[13] * f_10_);
	aFloat4876 = (class433.aFloatArray4853[2] * f
		      + class433.aFloatArray4853[6] * f_8_
		      + class433.aFloatArray4853[10] * f_9_
		      + class433.aFloatArray4853[14] * f_10_);
	aFloat4875 = (class433.aFloatArray4853[3] * f
		      + class433.aFloatArray4853[7] * f_8_
		      + class433.aFloatArray4853[11] * f_9_
		      + class433.aFloatArray4853[15] * f_10_);
    }
    
    public String toString() {
	return new StringBuilder().append(aFloat4873).append(",").append
		   (aFloat4874).append
		   (",").append
		   (aFloat4876).append
		   (",").append
		   (aFloat4875).toString();
    }
    
    public String method7112() {
	return new StringBuilder().append(aFloat4873).append(",").append
		   (aFloat4874).append
		   (",").append
		   (aFloat4876).append
		   (",").append
		   (aFloat4875).toString();
    }
    
    public String method7113() {
	return new StringBuilder().append(aFloat4873).append(",").append
		   (aFloat4874).append
		   (",").append
		   (aFloat4876).append
		   (",").append
		   (aFloat4875).toString();
    }
    
    public void method7114(float f, float f_11_, float f_12_, float f_13_) {
	aFloat4873 = f;
	aFloat4874 = f_11_;
	aFloat4876 = f_12_;
	aFloat4875 = f_13_;
    }
    
    public void method7115(float f, float f_14_, float f_15_, float f_16_) {
	aFloat4873 = f;
	aFloat4874 = f_14_;
	aFloat4876 = f_15_;
	aFloat4875 = f_16_;
    }
    
    final void method7116() {
	aFloat4875 = 0.0F;
	aFloat4876 = 0.0F;
	aFloat4874 = 0.0F;
	aFloat4873 = 0.0F;
    }
    
    public Class441() {
	method7116();
    }
    
    public final void method7117() {
	aFloat4873 = -aFloat4873;
	aFloat4874 = -aFloat4874;
	aFloat4876 = -aFloat4876;
	aFloat4875 = -aFloat4875;
    }
    
    public void method7118(int i) {
	method7105((float) (i >> 16 & 0xff) * 0.003921569F,
		   (float) (i >> 8 & 0xff) * 0.003921569F,
		   (float) (i >> 0 & 0xff) * 0.003921569F,
		   (float) (i >> 24 & 0xff) * 0.003921569F);
    }
    
    public void method7119(int i) {
	method7105((float) (i >> 16 & 0xff) * 0.003921569F,
		   (float) (i >> 8 & 0xff) * 0.003921569F,
		   (float) (i >> 0 & 0xff) * 0.003921569F,
		   (float) (i >> 24 & 0xff) * 0.003921569F);
    }
    
    final void method7120() {
	aFloat4875 = 0.0F;
	aFloat4876 = 0.0F;
	aFloat4874 = 0.0F;
	aFloat4873 = 0.0F;
    }
    
    public void method7121(Class441 class441_17_) {
	method7105(class441_17_.aFloat4873, class441_17_.aFloat4874,
		   class441_17_.aFloat4876, class441_17_.aFloat4875);
    }
    
    final void method7122() {
	aFloat4875 = 0.0F;
	aFloat4876 = 0.0F;
	aFloat4874 = 0.0F;
	aFloat4873 = 0.0F;
    }
    
    final void method7123() {
	aFloat4875 = 0.0F;
	aFloat4876 = 0.0F;
	aFloat4874 = 0.0F;
	aFloat4873 = 0.0F;
    }
    
    public void method7124(float f, float f_18_, float f_19_, float f_20_) {
	aFloat4873 = f;
	aFloat4874 = f_18_;
	aFloat4876 = f_19_;
	aFloat4875 = f_20_;
    }
    
    public final void method7125() {
	aFloat4873 = -aFloat4873;
	aFloat4874 = -aFloat4874;
	aFloat4876 = -aFloat4876;
	aFloat4875 = -aFloat4875;
    }
    
    public final void method7126(Class433 class433) {
	float f = aFloat4873;
	float f_21_ = aFloat4874;
	float f_22_ = aFloat4876;
	float f_23_ = aFloat4875;
	aFloat4873 = (class433.aFloatArray4853[0] * f
		      + class433.aFloatArray4853[4] * f_21_
		      + class433.aFloatArray4853[8] * f_22_
		      + class433.aFloatArray4853[12] * f_23_);
	aFloat4874 = (class433.aFloatArray4853[1] * f
		      + class433.aFloatArray4853[5] * f_21_
		      + class433.aFloatArray4853[9] * f_22_
		      + class433.aFloatArray4853[13] * f_23_);
	aFloat4876 = (class433.aFloatArray4853[2] * f
		      + class433.aFloatArray4853[6] * f_21_
		      + class433.aFloatArray4853[10] * f_22_
		      + class433.aFloatArray4853[14] * f_23_);
	aFloat4875 = (class433.aFloatArray4853[3] * f
		      + class433.aFloatArray4853[7] * f_21_
		      + class433.aFloatArray4853[11] * f_22_
		      + class433.aFloatArray4853[15] * f_23_);
    }
    
    public final void method7127(float f) {
	aFloat4873 *= f;
	aFloat4874 *= f;
	aFloat4876 *= f;
	aFloat4875 *= f;
    }
    
    public final void method7128(Class433 class433) {
	float f = aFloat4873;
	float f_24_ = aFloat4874;
	float f_25_ = aFloat4876;
	float f_26_ = aFloat4875;
	aFloat4873 = (class433.aFloatArray4853[0] * f
		      + class433.aFloatArray4853[4] * f_24_
		      + class433.aFloatArray4853[8] * f_25_
		      + class433.aFloatArray4853[12] * f_26_);
	aFloat4874 = (class433.aFloatArray4853[1] * f
		      + class433.aFloatArray4853[5] * f_24_
		      + class433.aFloatArray4853[9] * f_25_
		      + class433.aFloatArray4853[13] * f_26_);
	aFloat4876 = (class433.aFloatArray4853[2] * f
		      + class433.aFloatArray4853[6] * f_24_
		      + class433.aFloatArray4853[10] * f_25_
		      + class433.aFloatArray4853[14] * f_26_);
	aFloat4875 = (class433.aFloatArray4853[3] * f
		      + class433.aFloatArray4853[7] * f_24_
		      + class433.aFloatArray4853[11] * f_25_
		      + class433.aFloatArray4853[15] * f_26_);
    }
    
    public void method7129(int i) {
	method7105((float) (i >> 16 & 0xff) * 0.003921569F,
		   (float) (i >> 8 & 0xff) * 0.003921569F,
		   (float) (i >> 0 & 0xff) * 0.003921569F,
		   (float) (i >> 24 & 0xff) * 0.003921569F);
    }
}
