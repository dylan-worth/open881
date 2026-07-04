/* Class690_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class690_Sub9 extends Class690
{
    public static final int anInt10873 = 0;
    public static final int anInt10874 = 1;
    static Class16 aClass16_10875;
    
    int method14030(int i) {
	return 1;
    }
    
    public Class690_Sub9(int i, Class534_Sub35 class534_sub35) {
	super(i, class534_sub35);
    }
    
    int method14018() {
	return 1;
    }
    
    int method14017(int i) {
	return 1;
    }
    
    int method14026(int i, int i_0_) {
	return 1;
    }
    
    void method14020(int i, int i_1_) {
	anInt8753 = i * 1823770475;
    }
    
    public int method16958(int i) {
	return anInt8753 * 189295939;
    }
    
    int method14021() {
	return 1;
    }
    
    public void method16959(int i) {
	if (1 != anInt8753 * 189295939 && 189295939 * anInt8753 != 0)
	    anInt8753 = method14017(2135358967) * 1823770475;
    }
    
    int method14027(int i) {
	return 1;
    }
    
    void method14024(int i) {
	anInt8753 = i * 1823770475;
    }
    
    int method14022() {
	return 1;
    }
    
    void method14023(int i) {
	anInt8753 = i * 1823770475;
    }
    
    public Class690_Sub9(Class534_Sub35 class534_sub35) {
	super(class534_sub35);
    }
    
    int method14028(int i) {
	return 1;
    }
    
    int method14029(int i) {
	return 1;
    }
    
    public void method16960() {
	if (1 != anInt8753 * 189295939 && 189295939 * anInt8753 != 0)
	    anInt8753 = method14017(2112633464) * 1823770475;
    }
    
    public void method16961() {
	if (1 != anInt8753 * 189295939 && 189295939 * anInt8753 != 0)
	    anInt8753 = method14017(2104046235) * 1823770475;
    }
    
    void method14025(int i) {
	anInt8753 = i * 1823770475;
    }
    
    public void method16962() {
	if (1 != anInt8753 * 189295939 && 189295939 * anInt8753 != 0)
	    anInt8753 = method14017(2130395945) * 1823770475;
    }
    
    public int method16963() {
	return anInt8753 * 189295939;
    }
    
    static void method16964(int i, int i_2_, int[] is, int[] is_3_, float[] fs,
			    float[] fs_4_, int i_5_, int i_6_, int i_7_,
			    int i_8_, int i_9_, int i_10_, int i_11_) {
	int i_12_ = i_6_ * i + i_5_;
	int i_13_ = i_7_ + i_8_ * i_2_;
	int i_14_ = i - i_9_;
	int i_15_ = i_2_ - i_9_;
	if (is == null) {
	    for (int i_16_ = 0; i_16_ < i_10_; i_16_++) {
		int i_17_ = i_12_ + i_9_;
		while (i_12_ < i_17_)
		    fs_4_[i_13_++] = fs[i_12_++];
		i_12_ += i_14_;
		i_13_ += i_15_;
	    }
	} else if (fs == null) {
	    for (int i_18_ = 0; i_18_ < i_10_; i_18_++) {
		int i_19_ = i_12_ + i_9_;
		while (i_12_ < i_19_)
		    is_3_[i_13_++] = is[i_12_++];
		i_12_ += i_14_;
		i_13_ += i_15_;
	    }
	} else {
	    for (int i_20_ = 0; i_20_ < i_10_; i_20_++) {
		int i_21_ = i_12_ + i_9_;
		while (i_12_ < i_21_) {
		    is_3_[i_13_] = is[i_12_];
		    fs_4_[i_13_++] = fs[i_12_++];
		}
		i_12_ += i_14_;
		i_13_ += i_15_;
	    }
	}
    }
}
