/* Class654_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class654_Sub1 extends Class654
{
    Class654_Sub1 aClass654_Sub1_10850;
    int anInt10851;
    public Class194[] aClass194Array10852;
    public byte aByte10853;
    public byte aByte10854;
    public Class556 aClass556_10855;
    
    abstract void method16845();
    
    abstract boolean method16846(Class185 class185, int i, int i_0_,
				 byte i_1_);
    
    int method16847(int i) {
	return 0;
    }
    
    abstract boolean method16848(byte i);
    
    abstract boolean method16849(int i);
    
    abstract boolean method16850(int i);
    
    abstract void method16851(Class185 class185,
			      Class654_Sub1 class654_sub1_2_, int i, int i_3_,
			      int i_4_, boolean bool, int i_5_);
    
    abstract void method16852(int i);
    
    abstract Class550 method16853(Class185 class185, int i);
    
    public int method16854() {
	return -method16876(-1865163965);
    }
    
    public abstract Class564 method16855(Class185 class185, short i);
    
    abstract int method16856(Class534_Sub21[] class534_sub21s, int i);
    
    abstract boolean method16857(Class185 class185, int i);
    
    abstract boolean method16858(byte i);
    
    public boolean method16859(int i) {
	return true;
    }
    
    Class654_Sub1(Class556 class556) {
	aClass556_10855 = class556;
    }
    
    int method16860(int i, int i_6_, Class534_Sub21[] class534_sub21s,
		    int i_7_) {
	long l = aClass556_10855.aLongArrayArrayArray7473[aByte10854][i][i_6_];
	long l_8_ = 0L;
	int i_9_ = 0;
	for (/**/; l_8_ <= 48L; l_8_ += 16L) {
	    int i_10_ = (int) (l >> (int) l_8_ & 0xffffL);
	    if (i_10_ <= 0)
		break;
	    class534_sub21s[i_9_++] = (aClass556_10855.aClass561Array7439
				       [i_10_ - 1].aClass534_Sub21_7541);
	}
	for (int i_11_ = i_9_; i_11_ < 4; i_11_++)
	    class534_sub21s[i_11_] = null;
	return i_9_;
    }
    
    abstract boolean method16861();
    
    void method16862(int i, int i_12_) {
	aClass194Array10852 = new Class194[i];
	for (int i_13_ = 0; i_13_ < aClass194Array10852.length; i_13_++)
	    aClass194Array10852[i_13_] = new Class194();
    }
    
    int method16863() {
	return 0;
    }
    
    abstract boolean method16864();
    
    abstract void method16865();
    
    public abstract int method16866();
    
    public abstract int method16867();
    
    abstract void method16868(Class185 class185, int i);
    
    abstract boolean method16869();
    
    public abstract Class564 method16870(Class185 class185);
    
    abstract void method16871(Class185 class185);
    
    public abstract Class564 method16872(Class185 class185);
    
    abstract boolean method16873(Class185 class185, int i, int i_14_);
    
    abstract boolean method16874(Class185 class185, int i, int i_15_);
    
    public int method16875() {
	return -method16876(-1250839061);
    }
    
    public abstract int method16876(int i);
    
    abstract void method16877(Class185 class185,
			      Class654_Sub1 class654_sub1_16_, int i,
			      int i_17_, int i_18_, boolean bool);
    
    static void method16878(Class564 class564, int i, int i_19_, int i_20_,
			    Class183 class183) {
	if (null != class183)
	    class564.method9514(i, i_19_, i_20_, class183.method3041(),
				class183.method3134(), class183.method3043(),
				class183.method3045(), class183.method3046(),
				class183.method3047(), class183.method3038());
    }
    
    abstract boolean method16879();
    
    abstract boolean method16880(Class185 class185, int i, int i_21_);
    
    abstract void method16881();
    
    abstract boolean method16882(Class185 class185, int i, int i_22_);
    
    abstract void method16883(Class185 class185,
			      Class654_Sub1 class654_sub1_23_, int i,
			      int i_24_, int i_25_, boolean bool);
    
    abstract Class550 method16884(Class185 class185);
    
    abstract boolean method16885();
    
    public boolean method16886() {
	return true;
    }
    
    public boolean method16887() {
	return true;
    }
    
    abstract int method16888(Class534_Sub21[] class534_sub21s);
    
    abstract boolean method16889(Class185 class185);
    
    abstract boolean method16890(Class185 class185);
    
    abstract boolean method16891(Class185 class185);
    
    int method16892(int i, int i_26_, Class534_Sub21[] class534_sub21s) {
	long l
	    = aClass556_10855.aLongArrayArrayArray7473[aByte10854][i][i_26_];
	long l_27_ = 0L;
	int i_28_ = 0;
	for (/**/; l_27_ <= 48L; l_27_ += 16L) {
	    int i_29_ = (int) (l >> (int) l_27_ & 0xffffL);
	    if (i_29_ <= 0)
		break;
	    class534_sub21s[i_28_++] = (aClass556_10855.aClass561Array7439
					[i_29_ - 1].aClass534_Sub21_7541);
	}
	for (int i_30_ = i_28_; i_30_ < 4; i_30_++)
	    class534_sub21s[i_30_] = null;
	return i_28_;
    }
    
    abstract boolean method16893();
    
    int method16894(int i, int i_31_, Class534_Sub21[] class534_sub21s) {
	long l
	    = aClass556_10855.aLongArrayArrayArray7473[aByte10854][i][i_31_];
	long l_32_ = 0L;
	int i_33_ = 0;
	for (/**/; l_32_ <= 48L; l_32_ += 16L) {
	    int i_34_ = (int) (l >> (int) l_32_ & 0xffffL);
	    if (i_34_ <= 0)
		break;
	    class534_sub21s[i_33_++] = (aClass556_10855.aClass561Array7439
					[i_34_ - 1].aClass534_Sub21_7541);
	}
	for (int i_35_ = i_33_; i_35_ < 4; i_35_++)
	    class534_sub21s[i_35_] = null;
	return i_33_;
    }
    
    abstract boolean method16895();
    
    static Class564 method16896(int i, int i_36_, int i_37_,
				Class183 class183) {
	if (null == class183)
	    return null;
	Class564 class564
	    = new Class564(i, i_36_, i_37_, class183.method3041(),
			   class183.method3134(), class183.method3043(),
			   class183.method3045(), class183.method3046(),
			   class183.method3047(), class183.method3038());
	return class564;
    }
    
    public int method16897(int i) {
	return -method16876(-743383005);
    }
    
    static void method16898(Class564 class564, int i, int i_38_, int i_39_,
			    Class183 class183) {
	if (null != class183)
	    class564.method9514(i, i_38_, i_39_, class183.method3041(),
				class183.method3134(), class183.method3043(),
				class183.method3045(), class183.method3046(),
				class183.method3047(), class183.method3038());
    }
}
