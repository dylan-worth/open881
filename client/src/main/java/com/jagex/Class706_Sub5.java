/* Class706_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class706_Sub5 extends Class706
{
    float[] aFloatArray11000;
    float aFloat11001;
    int anInt11002 = 0;
    float aFloat11003 = 0.0F;
    Class434[] aClass434Array11004;
    int[] anIntArray11005;
    
    public Class438 method14247() {
	Class438 class438 = Class438.method7061();
	double[] ds = aClass434Array11004[anInt11002 * -2113039071]
			  .method6959(aFloat11003);
	class438.aFloat4864 = (float) ds[0];
	class438.aFloat4863 = (float) ds[1];
	class438.aFloat4865 = (float) ds[2];
	return class438;
    }
    
    public void method17326(Class434 class434, int i, float f, int i_0_) {
	if (null == aClass434Array11004) {
	    aClass434Array11004 = new Class434[] { class434 };
	    aFloatArray11000 = new float[] { f };
	    anIntArray11005 = new int[] { i };
	} else {
	    Class434[] class434s
		= new Class434[aClass434Array11004.length + 1];
	    float[] fs = new float[1 + aClass434Array11004.length];
	    int[] is = new int[aClass434Array11004.length + 1];
	    System.arraycopy(aClass434Array11004, 0, class434s, 0,
			     aClass434Array11004.length);
	    System.arraycopy(aFloatArray11000, 0, fs, 0,
			     aClass434Array11004.length);
	    System.arraycopy(anIntArray11005, 0, is, 0,
			     aClass434Array11004.length);
	    aClass434Array11004 = class434s;
	    aFloatArray11000 = fs;
	    anIntArray11005 = is;
	    aClass434Array11004[aClass434Array11004.length - 1] = class434;
	    aFloatArray11000[aFloatArray11000.length - 1] = f;
	    anIntArray11005[anIntArray11005.length - 1] = i;
	}
    }
    
    public Class438 method14248(int i) {
	return method14236(308999563);
    }
    
    void method17327(float f, float f_1_, int i) {
	aFloat11003 += f;
	if (aFloat11003 > f_1_)
	    aFloat11003 = f_1_;
    }
    
    abstract float method17328(float f, float f_2_, float f_3_, int i);
    
    public void method17329(Class434 class434, int i, float f) {
	if (null == aClass434Array11004) {
	    aClass434Array11004 = new Class434[] { class434 };
	    aFloatArray11000 = new float[] { f };
	    anIntArray11005 = new int[] { i };
	} else {
	    Class434[] class434s
		= new Class434[aClass434Array11004.length + 1];
	    float[] fs = new float[1 + aClass434Array11004.length];
	    int[] is = new int[aClass434Array11004.length + 1];
	    System.arraycopy(aClass434Array11004, 0, class434s, 0,
			     aClass434Array11004.length);
	    System.arraycopy(aFloatArray11000, 0, fs, 0,
			     aClass434Array11004.length);
	    System.arraycopy(anIntArray11005, 0, is, 0,
			     aClass434Array11004.length);
	    aClass434Array11004 = class434s;
	    aFloatArray11000 = fs;
	    anIntArray11005 = is;
	    aClass434Array11004[aClass434Array11004.length - 1] = class434;
	    aFloatArray11000[aFloatArray11000.length - 1] = f;
	    anIntArray11005[anIntArray11005.length - 1] = i;
	}
    }
    
    public boolean method14237(byte i) {
	return null != aClass434Array11004;
    }
    
    public Class438 method14250() {
	return method14236(308999563);
    }
    
    double[] method17330(int i) {
	return aClass434Array11004[anInt11002 * -2113039071]
		   .method6959(aFloat11003);
    }
    
    double[] method17331() {
	return aClass434Array11004[anInt11002 * -2113039071]
		   .method6959(aFloat11003);
    }
    
    public void method14240(Class287 class287, Class446 class446, int i,
			    int i_4_, float f, int i_5_) {
	double[] ds = aClass298_8844.method5386(1032386333);
	ds[0] -= (double) i;
	ds[2] -= (double) i_4_;
	double[] ds_6_ = method17330(-788103987);
	ds_6_[0] -= (double) i;
	ds_6_[2] -= (double) i_4_;
	ds[1] *= -1.0;
	ds_6_[1] *= -1.0;
	Class438 class438 = Class438.method7061();
	class438.aFloat4864 = (float) (ds_6_[0] - ds[0]);
	class438.aFloat4863 = (float) (ds_6_[1] - ds[1]);
	class438.aFloat4865 = (float) (ds_6_[2] - ds[2]);
	class438.method7002();
	Class443 class443 = new Class443();
	class443.method7146(class438, f);
	Class438 class438_7_ = Class438.method6996(0.0F, 1.0F, 0.0F);
	Class438 class438_8_ = Class438.method7019(class438, class438_7_);
	class438_7_ = Class438.method7019(class438_8_, class438);
	class438_7_.method7021(class443);
	class446.method7241(ds[0], ds[1], ds[2], ds_6_[0], ds_6_[1], ds_6_[2],
			    class438_7_.aFloat4864, class438_7_.aFloat4863,
			    class438_7_.aFloat4865);
	class438_7_.method7074();
    }
    
    public void method14235(Class534_Sub40 class534_sub40, int i) {
	aFloat11003 = 0.0F;
	aFloat11001 = 0.0F;
	anInt11002 = 0;
	int i_9_ = class534_sub40.method16527(514410448);
	aClass434Array11004 = new Class434[i_9_];
	aFloatArray11000 = new float[i_9_];
	for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
	    aClass434Array11004[i_10_] = new Class434(class534_sub40);
	    aFloatArray11000[i_10_] = class534_sub40.method16539(-1658945699);
	}
	method17340(class534_sub40, i_9_, (byte) 4);
    }
    
    public Class438 method14241() {
	Class438 class438 = Class438.method7061();
	double[] ds = aClass434Array11004[anInt11002 * -2113039071]
			  .method6959(aFloat11003);
	class438.aFloat4864 = (float) ds[0];
	class438.aFloat4863 = (float) ds[1];
	class438.aFloat4865 = (float) ds[2];
	return class438;
    }
    
    abstract float method17332(float f, float f_11_, float f_12_);
    
    abstract float method17333(float f, float f_13_, float f_14_);
    
    abstract float method17334(float f, float f_15_, float f_16_);
    
    abstract void method17335();
    
    public void method14239(float f, int i) {
	Class434 class434 = aClass434Array11004[anInt11002 * -2113039071];
	if (aFloatArray11000[anInt11002 * -2113039071] > 0.0F) {
	    if (aFloatArray11000[-2113039071 * anInt11002] >= f) {
		aFloatArray11000[anInt11002 * -2113039071] -= f;
		return;
	    }
	    f -= aFloatArray11000[-2113039071 * anInt11002];
	    aFloatArray11000[anInt11002 * -2113039071] = 0.0F;
	}
	float f_17_ = 1.0F / (float) Class469.method7641((byte) -7);
	while (f > 0.0F) {
	    float f_18_ = class434.method6958();
	    if (aFloat11003 >= f_18_) {
		if (1 + anInt11002 * -2113039071 == aClass434Array11004.length)
		    break;
		if (aFloatArray11000[anInt11002 * -2113039071 + 1] >= f) {
		    aFloatArray11000[-2113039071 * anInt11002 + 1] -= f;
		    break;
		}
		anInt11002 += -1799082271;
		f -= aFloatArray11000[anInt11002 * -2113039071];
		aFloatArray11000[-2113039071 * anInt11002] = 0.0F;
		method17342(-1458483307);
		aFloat11003 = 0.0F;
		aFloat11001 = 0.0F;
		class434 = aClass434Array11004[-2113039071 * anInt11002];
		f_18_ = class434.method6958();
	    }
	    while (f > 0.0F && aFloat11003 < f_18_) {
		aFloat11001 = method17328(f_18_, aFloat11001,
					  Math.min(f, f_17_), -597525592);
		f -= f_17_;
		method17327(aFloat11001, f_18_, 1670245279);
	    }
	}
    }
    
    abstract void method17336(Class534_Sub40 class534_sub40, int i);
    
    abstract void method17337(Class534_Sub40 class534_sub40, int i);
    
    public void method14242(float f) {
	Class434 class434 = aClass434Array11004[anInt11002 * -2113039071];
	if (aFloatArray11000[anInt11002 * -2113039071] > 0.0F) {
	    if (aFloatArray11000[-2113039071 * anInt11002] >= f) {
		aFloatArray11000[anInt11002 * -2113039071] -= f;
		return;
	    }
	    f -= aFloatArray11000[-2113039071 * anInt11002];
	    aFloatArray11000[anInt11002 * -2113039071] = 0.0F;
	}
	float f_19_ = 1.0F / (float) Class469.method7641((byte) -7);
	while (f > 0.0F) {
	    float f_20_ = class434.method6958();
	    if (aFloat11003 >= f_20_) {
		if (1 + anInt11002 * -2113039071 == aClass434Array11004.length)
		    break;
		if (aFloatArray11000[anInt11002 * -2113039071 + 1] >= f) {
		    aFloatArray11000[-2113039071 * anInt11002 + 1] -= f;
		    break;
		}
		anInt11002 += -1799082271;
		f -= aFloatArray11000[anInt11002 * -2113039071];
		aFloatArray11000[-2113039071 * anInt11002] = 0.0F;
		method17342(1546028059);
		aFloat11003 = 0.0F;
		aFloat11001 = 0.0F;
		class434 = aClass434Array11004[-2113039071 * anInt11002];
		f_20_ = class434.method6958();
	    }
	    while (f > 0.0F && aFloat11003 < f_20_) {
		aFloat11001 = method17328(f_20_, aFloat11001,
					  Math.min(f, f_19_), 616654520);
		f -= f_19_;
		method17327(aFloat11001, f_20_, -867599158);
	    }
	}
    }
    
    public void method14238(float f) {
	Class434 class434 = aClass434Array11004[anInt11002 * -2113039071];
	if (aFloatArray11000[anInt11002 * -2113039071] > 0.0F) {
	    if (aFloatArray11000[-2113039071 * anInt11002] >= f) {
		aFloatArray11000[anInt11002 * -2113039071] -= f;
		return;
	    }
	    f -= aFloatArray11000[-2113039071 * anInt11002];
	    aFloatArray11000[anInt11002 * -2113039071] = 0.0F;
	}
	float f_21_ = 1.0F / (float) Class469.method7641((byte) -7);
	while (f > 0.0F) {
	    float f_22_ = class434.method6958();
	    if (aFloat11003 >= f_22_) {
		if (1 + anInt11002 * -2113039071 == aClass434Array11004.length)
		    break;
		if (aFloatArray11000[anInt11002 * -2113039071 + 1] >= f) {
		    aFloatArray11000[-2113039071 * anInt11002 + 1] -= f;
		    break;
		}
		anInt11002 += -1799082271;
		f -= aFloatArray11000[anInt11002 * -2113039071];
		aFloatArray11000[-2113039071 * anInt11002] = 0.0F;
		method17342(-1808459289);
		aFloat11003 = 0.0F;
		aFloat11001 = 0.0F;
		class434 = aClass434Array11004[-2113039071 * anInt11002];
		f_22_ = class434.method6958();
	    }
	    while (f > 0.0F && aFloat11003 < f_22_) {
		aFloat11001 = method17328(f_22_, aFloat11001,
					  Math.min(f, f_21_), 1556324792);
		f -= f_21_;
		method17327(aFloat11001, f_22_, 122524896);
	    }
	}
    }
    
    public void method14244(float f) {
	Class434 class434 = aClass434Array11004[anInt11002 * -2113039071];
	if (aFloatArray11000[anInt11002 * -2113039071] > 0.0F) {
	    if (aFloatArray11000[-2113039071 * anInt11002] >= f) {
		aFloatArray11000[anInt11002 * -2113039071] -= f;
		return;
	    }
	    f -= aFloatArray11000[-2113039071 * anInt11002];
	    aFloatArray11000[anInt11002 * -2113039071] = 0.0F;
	}
	float f_23_ = 1.0F / (float) Class469.method7641((byte) -7);
	while (f > 0.0F) {
	    float f_24_ = class434.method6958();
	    if (aFloat11003 >= f_24_) {
		if (1 + anInt11002 * -2113039071 == aClass434Array11004.length)
		    break;
		if (aFloatArray11000[anInt11002 * -2113039071 + 1] >= f) {
		    aFloatArray11000[-2113039071 * anInt11002 + 1] -= f;
		    break;
		}
		anInt11002 += -1799082271;
		f -= aFloatArray11000[anInt11002 * -2113039071];
		aFloatArray11000[-2113039071 * anInt11002] = 0.0F;
		method17342(-403277247);
		aFloat11003 = 0.0F;
		aFloat11001 = 0.0F;
		class434 = aClass434Array11004[-2113039071 * anInt11002];
		f_24_ = class434.method6958();
	    }
	    while (f > 0.0F && aFloat11003 < f_24_) {
		aFloat11001 = method17328(f_24_, aFloat11001,
					  Math.min(f, f_23_), 1761327838);
		f -= f_23_;
		method17327(aFloat11001, f_24_, 357214486);
	    }
	}
    }
    
    public void method17338(Class434 class434, int i, float f) {
	if (null == aClass434Array11004) {
	    aClass434Array11004 = new Class434[] { class434 };
	    aFloatArray11000 = new float[] { f };
	    anIntArray11005 = new int[] { i };
	} else {
	    Class434[] class434s
		= new Class434[aClass434Array11004.length + 1];
	    float[] fs = new float[1 + aClass434Array11004.length];
	    int[] is = new int[aClass434Array11004.length + 1];
	    System.arraycopy(aClass434Array11004, 0, class434s, 0,
			     aClass434Array11004.length);
	    System.arraycopy(aFloatArray11000, 0, fs, 0,
			     aClass434Array11004.length);
	    System.arraycopy(anIntArray11005, 0, is, 0,
			     aClass434Array11004.length);
	    aClass434Array11004 = class434s;
	    aFloatArray11000 = fs;
	    anIntArray11005 = is;
	    aClass434Array11004[aClass434Array11004.length - 1] = class434;
	    aFloatArray11000[aFloatArray11000.length - 1] = f;
	    anIntArray11005[anIntArray11005.length - 1] = i;
	}
    }
    
    public void method14246(Class287 class287, Class446 class446, int i,
			    int i_25_, float f) {
	double[] ds = aClass298_8844.method5386(-467577163);
	ds[0] -= (double) i;
	ds[2] -= (double) i_25_;
	double[] ds_26_ = method17330(-788103987);
	ds_26_[0] -= (double) i;
	ds_26_[2] -= (double) i_25_;
	ds[1] *= -1.0;
	ds_26_[1] *= -1.0;
	Class438 class438 = Class438.method7061();
	class438.aFloat4864 = (float) (ds_26_[0] - ds[0]);
	class438.aFloat4863 = (float) (ds_26_[1] - ds[1]);
	class438.aFloat4865 = (float) (ds_26_[2] - ds[2]);
	class438.method7002();
	Class443 class443 = new Class443();
	class443.method7146(class438, f);
	Class438 class438_27_ = Class438.method6996(0.0F, 1.0F, 0.0F);
	Class438 class438_28_ = Class438.method7019(class438, class438_27_);
	class438_27_ = Class438.method7019(class438_28_, class438);
	class438_27_.method7021(class443);
	class446.method7241(ds[0], ds[1], ds[2], ds_26_[0], ds_26_[1],
			    ds_26_[2], class438_27_.aFloat4864,
			    class438_27_.aFloat4863, class438_27_.aFloat4865);
	class438_27_.method7074();
    }
    
    abstract void method17339(Class534_Sub40 class534_sub40, int i);
    
    public Class438 method14243() {
	Class438 class438 = Class438.method7061();
	double[] ds = aClass434Array11004[anInt11002 * -2113039071]
			  .method6959(aFloat11003);
	class438.aFloat4864 = (float) ds[0];
	class438.aFloat4863 = (float) ds[1];
	class438.aFloat4865 = (float) ds[2];
	return class438;
    }
    
    Class706_Sub5(Class298 class298) {
	super(class298);
	aFloat11001 = 0.0F;
    }
    
    public Class438 method14249() {
	return method14236(308999563);
    }
    
    abstract void method17340(Class534_Sub40 class534_sub40, int i,
			      byte i_29_);
    
    public void method14251(Class534_Sub40 class534_sub40) {
	aFloat11003 = 0.0F;
	aFloat11001 = 0.0F;
	anInt11002 = 0;
	int i = class534_sub40.method16527(763302664);
	aClass434Array11004 = new Class434[i];
	aFloatArray11000 = new float[i];
	for (int i_30_ = 0; i_30_ < i; i_30_++) {
	    aClass434Array11004[i_30_] = new Class434(class534_sub40);
	    aFloatArray11000[i_30_] = class534_sub40.method16539(-1466822415);
	}
	method17340(class534_sub40, i, (byte) -26);
    }
    
    public void method17341(Class434 class434, int i, float f) {
	if (null == aClass434Array11004) {
	    aClass434Array11004 = new Class434[] { class434 };
	    aFloatArray11000 = new float[] { f };
	    anIntArray11005 = new int[] { i };
	} else {
	    Class434[] class434s
		= new Class434[aClass434Array11004.length + 1];
	    float[] fs = new float[1 + aClass434Array11004.length];
	    int[] is = new int[aClass434Array11004.length + 1];
	    System.arraycopy(aClass434Array11004, 0, class434s, 0,
			     aClass434Array11004.length);
	    System.arraycopy(aFloatArray11000, 0, fs, 0,
			     aClass434Array11004.length);
	    System.arraycopy(anIntArray11005, 0, is, 0,
			     aClass434Array11004.length);
	    aClass434Array11004 = class434s;
	    aFloatArray11000 = fs;
	    anIntArray11005 = is;
	    aClass434Array11004[aClass434Array11004.length - 1] = class434;
	    aFloatArray11000[aFloatArray11000.length - 1] = f;
	    anIntArray11005[anIntArray11005.length - 1] = i;
	}
    }
    
    public Class438 method14236(int i) {
	Class438 class438 = Class438.method7061();
	double[] ds = aClass434Array11004[anInt11002 * -2113039071]
			  .method6959(aFloat11003);
	class438.aFloat4864 = (float) ds[0];
	class438.aFloat4863 = (float) ds[1];
	class438.aFloat4865 = (float) ds[2];
	return class438;
    }
    
    abstract void method17342(int i);
    
    public void method17343(Class434 class434, int i, float f) {
	if (null == aClass434Array11004) {
	    aClass434Array11004 = new Class434[] { class434 };
	    aFloatArray11000 = new float[] { f };
	    anIntArray11005 = new int[] { i };
	} else {
	    Class434[] class434s
		= new Class434[aClass434Array11004.length + 1];
	    float[] fs = new float[1 + aClass434Array11004.length];
	    int[] is = new int[aClass434Array11004.length + 1];
	    System.arraycopy(aClass434Array11004, 0, class434s, 0,
			     aClass434Array11004.length);
	    System.arraycopy(aFloatArray11000, 0, fs, 0,
			     aClass434Array11004.length);
	    System.arraycopy(anIntArray11005, 0, is, 0,
			     aClass434Array11004.length);
	    aClass434Array11004 = class434s;
	    aFloatArray11000 = fs;
	    anIntArray11005 = is;
	    aClass434Array11004[aClass434Array11004.length - 1] = class434;
	    aFloatArray11000[aFloatArray11000.length - 1] = f;
	    anIntArray11005[anIntArray11005.length - 1] = i;
	}
    }
    
    void method17344(float f, float f_31_) {
	aFloat11003 += f;
	if (aFloat11003 > f_31_)
	    aFloat11003 = f_31_;
    }
    
    void method17345(float f, float f_32_) {
	aFloat11003 += f;
	if (aFloat11003 > f_32_)
	    aFloat11003 = f_32_;
    }
    
    public boolean method14245() {
	return null != aClass434Array11004;
    }
    
    double[] method17346() {
	return aClass434Array11004[anInt11002 * -2113039071]
		   .method6959(aFloat11003);
    }
    
    static void method17347(Class185 class185, byte i) {
	if (Class72.aClass433_762 != null) {
	    class185.method3338(Class72.aClass433_762);
	    class185.method3335(Class72.aClass446_783);
	    class185.method3373(894945745 * Class72.anInt777,
				-655548783 * Class72.anInt778,
				(1852547097 * Class72.anInt779
				 + Class72.anInt777 * 894945745),
				(Class72.anInt778 * -655548783
				 + Class72.anInt780 * -1954074475));
	    class185.method3318(894945745 * Class72.anInt777,
				-655548783 * Class72.anInt778,
				1852547097 * Class72.anInt779,
				-1954074475 * Class72.anInt780);
	}
    }
}
