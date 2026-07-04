/* Class347_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class347_Sub3 extends Class347
{
    float aFloat10248;
    float[] aFloatArray10249;
    Class434[] aClass434Array10250;
    float aFloat10251;
    int[] anIntArray10252;
    int anInt10253 = 0;
    public static Class472 aClass472_10254;
    
    public Class534_Sub36 method6135() {
	Class438 class438 = method6137(-1567286006);
	return new Class534_Sub36(0, (int) class438.aFloat4864,
				  (int) class438.aFloat4863,
				  (int) class438.aFloat4865);
    }
    
    public void method15851(Class434 class434, int i, float f, byte i_0_) {
	if (aClass434Array10250 == null) {
	    aClass434Array10250 = new Class434[] { class434 };
	    aFloatArray10249 = new float[] { f };
	    anIntArray10252 = new int[] { i };
	} else {
	    Class434[] class434s
		= new Class434[aClass434Array10250.length + 1];
	    float[] fs = new float[1 + aClass434Array10250.length];
	    int[] is = new int[1 + aClass434Array10250.length];
	    System.arraycopy(aClass434Array10250, 0, class434s, 0,
			     aClass434Array10250.length);
	    System.arraycopy(aFloatArray10249, 0, fs, 0,
			     aClass434Array10250.length);
	    System.arraycopy(anIntArray10252, 0, is, 0,
			     aClass434Array10250.length);
	    aClass434Array10250 = class434s;
	    aFloatArray10249 = fs;
	    anIntArray10252 = is;
	    aClass434Array10250[aClass434Array10250.length - 1] = class434;
	    aFloatArray10249[aFloatArray10249.length - 1] = f;
	    anIntArray10252[anIntArray10252.length - 1] = i;
	}
    }
    
    public void method6136(float f, int[][][] is, Class468 class468, int i,
			   int i_1_, byte i_2_) {
	Class434 class434 = aClass434Array10250[anInt10253 * 1539489709];
	if (aFloatArray10249[1539489709 * anInt10253] > 0.0F) {
	    if (aFloatArray10249[1539489709 * anInt10253] >= f) {
		aFloatArray10249[1539489709 * anInt10253] -= f;
		return;
	    }
	    f -= aFloatArray10249[anInt10253 * 1539489709];
	    aFloatArray10249[anInt10253 * 1539489709] = 0.0F;
	}
	float f_3_ = 1.0F / (float) Class469.method7641((byte) -7);
	while (f > 0.0F) {
	    float f_4_ = class434.method6958();
	    if (aFloat10251 >= f_4_) {
		if (1 + 1539489709 * anInt10253 == aClass434Array10250.length)
		    break;
		if (aFloatArray10249[1539489709 * anInt10253 + 1] >= f) {
		    aFloatArray10249[1 + anInt10253 * 1539489709] -= f;
		    break;
		}
		anInt10253 += 2120023077;
		f -= aFloatArray10249[anInt10253 * 1539489709];
		aFloatArray10249[1539489709 * anInt10253] = 0.0F;
		method15854((byte) 29);
		aFloat10251 = 0.0F;
		aFloat10248 = 0.0F;
		class434 = aClass434Array10250[anInt10253 * 1539489709];
		f_4_ = class434.method6958();
	    }
	    while (f > 0.0F && aFloat10251 < f_4_) {
		aFloat10248 = method15853(f_4_, aFloat10248, Math.min(f, f_3_),
					  510871352);
		f -= f_3_;
		method15852(aFloat10248, f_4_, -1745810885);
	    }
	}
    }
    
    void method15852(float f, float f_5_, int i) {
	aFloat10251 += f;
	if (aFloat10251 > f_5_)
	    aFloat10251 = f_5_;
    }
    
    abstract float method15853(float f, float f_6_, float f_7_, int i);
    
    abstract void method15854(byte i);
    
    public Class438 method6143() {
	Class438 class438 = Class438.method7061();
	double[] ds = aClass434Array10250[anInt10253 * 1539489709]
			  .method6959(aFloat10251);
	class438.aFloat4864 = (float) ds[0];
	class438.aFloat4863 = (float) ds[1];
	class438.aFloat4865 = (float) ds[2];
	return class438;
    }
    
    public Class438 method6137(int i) {
	Class438 class438 = Class438.method7061();
	double[] ds = aClass434Array10250[anInt10253 * 1539489709]
			  .method6959(aFloat10251);
	class438.aFloat4864 = (float) ds[0];
	class438.aFloat4863 = (float) ds[1];
	class438.aFloat4865 = (float) ds[2];
	return class438;
    }
    
    public void method6152(Class534_Sub40 class534_sub40) {
	aFloat10251 = 0.0F;
	aFloat10248 = 0.0F;
	anInt10253 = 0;
	int i = class534_sub40.method16527(-898070316);
	aClass434Array10250 = new Class434[i];
	aFloatArray10249 = new float[i];
	for (int i_8_ = 0; i_8_ < i; i_8_++) {
	    aClass434Array10250[i_8_] = new Class434(class534_sub40);
	    aFloatArray10249[i_8_] = class534_sub40.method16539(-1436469806);
	}
	method15860(class534_sub40, i, 1899481443);
    }
    
    public Class534_Sub36 method6133(byte i) {
	Class438 class438 = method6137(883443738);
	return new Class534_Sub36(0, (int) class438.aFloat4864,
				  (int) class438.aFloat4863,
				  (int) class438.aFloat4865);
    }
    
    public void method6151(Class534_Sub40 class534_sub40) {
	aFloat10251 = 0.0F;
	aFloat10248 = 0.0F;
	anInt10253 = 0;
	int i = class534_sub40.method16527(888289761);
	aClass434Array10250 = new Class434[i];
	aFloatArray10249 = new float[i];
	for (int i_9_ = 0; i_9_ < i; i_9_++) {
	    aClass434Array10250[i_9_] = new Class434(class534_sub40);
	    aFloatArray10249[i_9_] = class534_sub40.method16539(-2097118705);
	}
	method15860(class534_sub40, i, 1899481443);
    }
    
    public float method6134(int i) {
	return aClass434Array10250[anInt10253 * 1539489709]
		   .method6962(aFloat10251);
    }
    
    public void method6138(float f, int[][][] is, Class468 class468, int i,
			   int i_10_) {
	Class434 class434 = aClass434Array10250[anInt10253 * 1539489709];
	if (aFloatArray10249[1539489709 * anInt10253] > 0.0F) {
	    if (aFloatArray10249[1539489709 * anInt10253] >= f) {
		aFloatArray10249[1539489709 * anInt10253] -= f;
		return;
	    }
	    f -= aFloatArray10249[anInt10253 * 1539489709];
	    aFloatArray10249[anInt10253 * 1539489709] = 0.0F;
	}
	float f_11_ = 1.0F / (float) Class469.method7641((byte) -7);
	while (f > 0.0F) {
	    float f_12_ = class434.method6958();
	    if (aFloat10251 >= f_12_) {
		if (1 + 1539489709 * anInt10253 == aClass434Array10250.length)
		    break;
		if (aFloatArray10249[1539489709 * anInt10253 + 1] >= f) {
		    aFloatArray10249[1 + anInt10253 * 1539489709] -= f;
		    break;
		}
		anInt10253 += 2120023077;
		f -= aFloatArray10249[anInt10253 * 1539489709];
		aFloatArray10249[1539489709 * anInt10253] = 0.0F;
		method15854((byte) 29);
		aFloat10251 = 0.0F;
		aFloat10248 = 0.0F;
		class434 = aClass434Array10250[anInt10253 * 1539489709];
		f_12_ = class434.method6958();
	    }
	    while (f > 0.0F && aFloat10251 < f_12_) {
		aFloat10248 = method15853(f_12_, aFloat10248,
					  Math.min(f, f_11_), -1306848810);
		f -= f_11_;
		method15852(aFloat10248, f_12_, -1933367011);
	    }
	}
    }
    
    public void method6148(Class534_Sub40 class534_sub40, byte i) {
	aFloat10251 = 0.0F;
	aFloat10248 = 0.0F;
	anInt10253 = 0;
	int i_13_ = class534_sub40.method16527(-239590660);
	aClass434Array10250 = new Class434[i_13_];
	aFloatArray10249 = new float[i_13_];
	for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
	    aClass434Array10250[i_14_] = new Class434(class534_sub40);
	    aFloatArray10249[i_14_] = class534_sub40.method16539(-2050271841);
	}
	method15860(class534_sub40, i_13_, 1899481443);
    }
    
    public void method6149(Class287 class287, int i, int i_15_, short i_16_) {
	Class438 class438 = method6137(1360396309);
	class287.anInt3082 = ((int) class438.aFloat4864 - i) * -1803517691;
	class287.anInt3083 = (int) -class438.aFloat4863 * -1390317707;
	class287.anInt3081 = 1552704101 * ((int) class438.aFloat4865 - i_15_);
    }
    
    abstract void method15855();
    
    abstract void method15856();
    
    public double[] method6130(int i) {
	return aClass434Array10250[anInt10253 * 1539489709]
		   .method6959(aFloat10251);
    }
    
    abstract void method15857(Class534_Sub40 class534_sub40, int i);
    
    abstract void method15858(Class534_Sub40 class534_sub40, int i);
    
    public void method6139(float f, int[][][] is, Class468 class468, int i,
			   int i_17_) {
	Class434 class434 = aClass434Array10250[anInt10253 * 1539489709];
	if (aFloatArray10249[1539489709 * anInt10253] > 0.0F) {
	    if (aFloatArray10249[1539489709 * anInt10253] >= f) {
		aFloatArray10249[1539489709 * anInt10253] -= f;
		return;
	    }
	    f -= aFloatArray10249[anInt10253 * 1539489709];
	    aFloatArray10249[anInt10253 * 1539489709] = 0.0F;
	}
	float f_18_ = 1.0F / (float) Class469.method7641((byte) -7);
	while (f > 0.0F) {
	    float f_19_ = class434.method6958();
	    if (aFloat10251 >= f_19_) {
		if (1 + 1539489709 * anInt10253 == aClass434Array10250.length)
		    break;
		if (aFloatArray10249[1539489709 * anInt10253 + 1] >= f) {
		    aFloatArray10249[1 + anInt10253 * 1539489709] -= f;
		    break;
		}
		anInt10253 += 2120023077;
		f -= aFloatArray10249[anInt10253 * 1539489709];
		aFloatArray10249[1539489709 * anInt10253] = 0.0F;
		method15854((byte) 29);
		aFloat10251 = 0.0F;
		aFloat10248 = 0.0F;
		class434 = aClass434Array10250[anInt10253 * 1539489709];
		f_19_ = class434.method6958();
	    }
	    while (f > 0.0F && aFloat10251 < f_19_) {
		aFloat10248 = method15853(f_19_, aFloat10248,
					  Math.min(f, f_18_), -1143459523);
		f -= f_18_;
		method15852(aFloat10248, f_19_, -1454673866);
	    }
	}
    }
    
    Class347_Sub3(Class298 class298) {
	super(class298);
	aFloat10251 = 0.0F;
	aFloat10248 = 0.0F;
    }
    
    public void method6132(float f, int[][][] is, Class468 class468, int i,
			   int i_20_) {
	Class434 class434 = aClass434Array10250[anInt10253 * 1539489709];
	if (aFloatArray10249[1539489709 * anInt10253] > 0.0F) {
	    if (aFloatArray10249[1539489709 * anInt10253] >= f) {
		aFloatArray10249[1539489709 * anInt10253] -= f;
		return;
	    }
	    f -= aFloatArray10249[anInt10253 * 1539489709];
	    aFloatArray10249[anInt10253 * 1539489709] = 0.0F;
	}
	float f_21_ = 1.0F / (float) Class469.method7641((byte) -7);
	while (f > 0.0F) {
	    float f_22_ = class434.method6958();
	    if (aFloat10251 >= f_22_) {
		if (1 + 1539489709 * anInt10253 == aClass434Array10250.length)
		    break;
		if (aFloatArray10249[1539489709 * anInt10253 + 1] >= f) {
		    aFloatArray10249[1 + anInt10253 * 1539489709] -= f;
		    break;
		}
		anInt10253 += 2120023077;
		f -= aFloatArray10249[anInt10253 * 1539489709];
		aFloatArray10249[1539489709 * anInt10253] = 0.0F;
		method15854((byte) 29);
		aFloat10251 = 0.0F;
		aFloat10248 = 0.0F;
		class434 = aClass434Array10250[anInt10253 * 1539489709];
		f_22_ = class434.method6958();
	    }
	    while (f > 0.0F && aFloat10251 < f_22_) {
		aFloat10248 = method15853(f_22_, aFloat10248,
					  Math.min(f, f_21_), -813774576);
		f -= f_21_;
		method15852(aFloat10248, f_22_, -1477712576);
	    }
	}
    }
    
    public double[] method6144() {
	return aClass434Array10250[anInt10253 * 1539489709]
		   .method6959(aFloat10251);
    }
    
    public boolean method6141() {
	return aClass434Array10250 != null;
    }
    
    public boolean method6131(int i) {
	return aClass434Array10250 != null;
    }
    
    public Class438 method6146() {
	Class438 class438 = Class438.method7061();
	double[] ds = aClass434Array10250[anInt10253 * 1539489709]
			  .method6959(aFloat10251);
	class438.aFloat4864 = (float) ds[0];
	class438.aFloat4863 = (float) ds[1];
	class438.aFloat4865 = (float) ds[2];
	return class438;
    }
    
    public Class438 method6129() {
	Class438 class438 = Class438.method7061();
	double[] ds = aClass434Array10250[anInt10253 * 1539489709]
			  .method6959(aFloat10251);
	class438.aFloat4864 = (float) ds[0];
	class438.aFloat4863 = (float) ds[1];
	class438.aFloat4865 = (float) ds[2];
	return class438;
    }
    
    public Class438 method6145() {
	Class438 class438 = Class438.method7061();
	double[] ds = aClass434Array10250[anInt10253 * 1539489709]
			  .method6959(aFloat10251);
	class438.aFloat4864 = (float) ds[0];
	class438.aFloat4863 = (float) ds[1];
	class438.aFloat4865 = (float) ds[2];
	return class438;
    }
    
    public boolean method6140() {
	return aClass434Array10250 != null;
    }
    
    public float method15859() {
	return aClass434Array10250[anInt10253 * 1539489709]
		   .method6960(aFloat10251);
    }
    
    abstract void method15860(Class534_Sub40 class534_sub40, int i, int i_23_);
    
    public void method6142(Class287 class287, int i, int i_24_) {
	Class438 class438 = method6137(-756480035);
	class287.anInt3082 = ((int) class438.aFloat4864 - i) * -1803517691;
	class287.anInt3083 = (int) -class438.aFloat4863 * -1390317707;
	class287.anInt3081 = 1552704101 * ((int) class438.aFloat4865 - i_24_);
    }
    
    public void method6150(Class287 class287, int i, int i_25_) {
	Class438 class438 = method6137(-646026437);
	class287.anInt3082 = ((int) class438.aFloat4864 - i) * -1803517691;
	class287.anInt3083 = (int) -class438.aFloat4863 * -1390317707;
	class287.anInt3081 = 1552704101 * ((int) class438.aFloat4865 - i_25_);
    }
    
    public boolean method6147() {
	return aClass434Array10250 != null;
    }
    
    public float method6153() {
	return aClass434Array10250[anInt10253 * 1539489709]
		   .method6962(aFloat10251);
    }
    
    public float method15861(byte i) {
	return aClass434Array10250[anInt10253 * 1539489709]
		   .method6960(aFloat10251);
    }
    
    public float method6154() {
	return aClass434Array10250[anInt10253 * 1539489709]
		   .method6962(aFloat10251);
    }
    
    abstract float method15862(float f, float f_26_, float f_27_);
    
    abstract float method15863(float f, float f_28_, float f_29_);
    
    void method15864(float f, float f_30_) {
	aFloat10251 += f;
	if (aFloat10251 > f_30_)
	    aFloat10251 = f_30_;
    }
    
    public float method15865() {
	return aClass434Array10250[anInt10253 * 1539489709]
		   .method6960(aFloat10251);
    }
    
    abstract void method15866(Class534_Sub40 class534_sub40, int i);
    
    public void method15867(Class434 class434, int i, float f) {
	if (aClass434Array10250 == null) {
	    aClass434Array10250 = new Class434[] { class434 };
	    aFloatArray10249 = new float[] { f };
	    anIntArray10252 = new int[] { i };
	} else {
	    Class434[] class434s
		= new Class434[aClass434Array10250.length + 1];
	    float[] fs = new float[1 + aClass434Array10250.length];
	    int[] is = new int[1 + aClass434Array10250.length];
	    System.arraycopy(aClass434Array10250, 0, class434s, 0,
			     aClass434Array10250.length);
	    System.arraycopy(aFloatArray10249, 0, fs, 0,
			     aClass434Array10250.length);
	    System.arraycopy(anIntArray10252, 0, is, 0,
			     aClass434Array10250.length);
	    aClass434Array10250 = class434s;
	    aFloatArray10249 = fs;
	    anIntArray10252 = is;
	    aClass434Array10250[aClass434Array10250.length - 1] = class434;
	    aFloatArray10249[aFloatArray10249.length - 1] = f;
	    anIntArray10252[anIntArray10252.length - 1] = i;
	}
    }
    
    public static void method15868(int i, int i_31_, int i_32_, int i_33_) {
	i <<= 3;
	i_31_ <<= 3;
	i_32_ <<= 3;
	if (3 == Class10.anInt75 * -891094135) {
	    if (Class599.aClass298_Sub1_7871.method5388((byte) -38)
		== Class305.aClass305_3265) {
		Class347_Sub1 class347_sub1
		    = ((Class347_Sub1)
		       Class599.aClass298_Sub1_7871.method5380((byte) -49));
		Class443 class443 = new Class443();
		Class443 class443_34_ = new Class443();
		class443.method7147(0.0F, 1.0F, 0.0F,
				    3.1415927F - (float) (3.141592653589793
							  * (double) i_31_
							  * 2.0 / 16384.0));
		Class438 class438 = new Class438(1.0F, 0.0F, 0.0F);
		class438.method7021(class443);
		class438.method7088();
		class443_34_.method7146(class438,
					((float) (2.0 * (3.141592653589793
							 * (double) i))
					 / 16384.0F));
		class443.method7158(class443_34_);
		class347_sub1.aClass443_10134.method7145(class443);
	    }
	} else {
	    client.aFloat11302 = (float) i;
	    client.aFloat11140 = (float) i_31_;
	    if (Class10.anInt75 * -891094135 == 4) {
		Class566.anInt7589 = i * -1539495063;
		Class641.anInt8341 = i_31_ * 486346273;
		Class2.anInt22 = i_32_ * 506655975;
	    }
	    Class326.method5819(29181971);
	}
	client.aBool11147 = true;
    }
    
    static void method15869(Class185 class185, Class700 class700, int i,
			    int i_35_, byte i_36_) {
	Class615.aClass700_8055.method14152(-1510993167);
	if (!Class554_Sub1.aBool10685) {
	    for (Class534_Sub29 class534_sub29
		     = (Class534_Sub29) class700.method14135((byte) -1);
		 class534_sub29 != null;
		 class534_sub29
		     = (Class534_Sub29) class700.method14139(1710375594)) {
		Class272 class272
		    = (Class272) (Class554_Sub1.aClass44_Sub9_7349.method91
				  (class534_sub29.anInt10652 * 1592054281,
				   -1434060177));
		if (Class231.method4211(class272, -1488345619)) {
		    boolean bool
			= Class291.method5297(class185, class534_sub29,
					      class272, i, i_35_, 1910458743);
		    if (bool)
			Class595.method9915(class185, class534_sub29, class272,
					    -113471932);
		}
	    }
	}
    }
    
    static final void method15870(Class669 class669, int i) {
	int i_37_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_37_, 893796333);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class247.anInt2478 * -488164841;
    }
}
