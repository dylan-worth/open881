/* Class354 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class354
{
    Class203 aClass203_3657 = new Class203(10485760, 256);
    Interface25 anInterface25_3658;
    Class185_Sub1 aClass185_Sub1_3659;
    
    void method6262() {
	aClass203_3657.method3876(5, (byte) 0);
    }
    
    boolean method6263(Class186 class186, int i) {
	if (i == -1)
	    i = class186.anInt2046 * 1264459495;
	if (!class186.aBool2024 || !aClass185_Sub1_3659.method3409()) {
	    if (class186.aClass599_2064 != Class599.aClass599_7869
		|| !Class72.method1559(class186.aByte2067, -1932529094))
		return anInterface25_3658.method155(Class598.aClass598_7865,
						    (class186.anInt2042
						     * 1604666399),
						    Class613.aClass613_8023,
						    0.7F, i, i, false,
						    -618218007);
	    return anInterface25_3658.method155(Class598.aClass598_7865,
						(class186.anInt2042
						 * 1604666399),
						Class613.aClass613_8022, 0.7F,
						i, i, true, -618218007);
	}
	return anInterface25_3658.method155(Class598.aClass598_7865,
					    class186.anInt2042 * 1604666399,
					    Class613.aClass613_8024, 0.7F, i,
					    i, false, -618218007);
    }
    
    Interface38 method6264(Class186 class186, int i) {
	long l = (long) (i << 16 | class186.anInt2042 * 1604666399);
	Interface38 interface38 = (Interface38) aClass203_3657.method3871(l);
	if (interface38 != null)
	    return interface38;
	if (!method6265(class186, i))
	    return null;
	if (i == -1)
	    i = class186.anInt2046 * 1264459495;
	Interface38 interface38_0_;
	if (!class186.aBool2024 || !aClass185_Sub1_3659.method3409()) {
	    int[] is;
	    if (class186.aClass599_2064 != Class599.aClass599_7869
		|| !Class72.method1559(class186.aByte2067, -1915203100))
		is = anInterface25_3658.method150(Class598.aClass598_7865,
						  (class186.anInt2042
						   * 1604666399),
						  0.7F, i, i, false,
						  -650369782);
	    else
		is = anInterface25_3658.method149(Class598.aClass598_7865,
						  (class186.anInt2042
						   * 1604666399),
						  0.7F, i, i, true,
						  -748140919);
	    if (is == null)
		return null;
	    interface38_0_ = aClass185_Sub1_3659.method14658(i, i, true, is);
	} else {
	    float[] fs
		= anInterface25_3658.method151(Class598.aClass598_7865,
					       class186.anInt2042 * 1604666399,
					       0.7F, i, i, false, -788167363);
	    interface38_0_
		= aClass185_Sub1_3659.method14731(Class181.aClass181_1952, i,
						  i, true, fs);
	}
	interface38_0_.method257(class186.aByte2073 == 1,
				 class186.aByte2053 == 1);
	aClass203_3657.method3881(interface38_0_, l, i * i, -546113710);
	return interface38_0_;
    }
    
    boolean method6265(Class186 class186, int i) {
	if (i == -1)
	    i = class186.anInt2046 * 1264459495;
	if (!class186.aBool2024 || !aClass185_Sub1_3659.method3409()) {
	    if (class186.aClass599_2064 != Class599.aClass599_7869
		|| !Class72.method1559(class186.aByte2067, -1914440280))
		return anInterface25_3658.method155(Class598.aClass598_7865,
						    (class186.anInt2042
						     * 1604666399),
						    Class613.aClass613_8023,
						    0.7F, i, i, false,
						    -618218007);
	    return anInterface25_3658.method155(Class598.aClass598_7865,
						(class186.anInt2042
						 * 1604666399),
						Class613.aClass613_8022, 0.7F,
						i, i, true, -618218007);
	}
	return anInterface25_3658.method155(Class598.aClass598_7865,
					    class186.anInt2042 * 1604666399,
					    Class613.aClass613_8024, 0.7F, i,
					    i, false, -618218007);
    }
    
    void method6266() {
	aClass203_3657.method3876(5, (byte) 0);
    }
    
    Interface38 method6267(Class186 class186) {
	return method6264(class186, class186.anInt2046 * 1264459495);
    }
    
    Interface38 method6268(Class186 class186, int i) {
	long l = (long) (i << 16 | class186.anInt2042 * 1604666399);
	Interface38 interface38 = (Interface38) aClass203_3657.method3871(l);
	if (interface38 != null)
	    return interface38;
	if (!method6265(class186, i))
	    return null;
	if (i == -1)
	    i = class186.anInt2046 * 1264459495;
	Interface38 interface38_1_;
	if (!class186.aBool2024 || !aClass185_Sub1_3659.method3409()) {
	    int[] is;
	    if (class186.aClass599_2064 != Class599.aClass599_7869
		|| !Class72.method1559(class186.aByte2067, -1811243231))
		is = anInterface25_3658.method150(Class598.aClass598_7865,
						  (class186.anInt2042
						   * 1604666399),
						  0.7F, i, i, false,
						  -687718458);
	    else
		is = anInterface25_3658.method149(Class598.aClass598_7865,
						  (class186.anInt2042
						   * 1604666399),
						  0.7F, i, i, true, 876372417);
	    if (is == null)
		return null;
	    interface38_1_ = aClass185_Sub1_3659.method14658(i, i, true, is);
	} else {
	    float[] fs
		= anInterface25_3658.method151(Class598.aClass598_7865,
					       class186.anInt2042 * 1604666399,
					       0.7F, i, i, false, -788167363);
	    interface38_1_
		= aClass185_Sub1_3659.method14731(Class181.aClass181_1952, i,
						  i, true, fs);
	}
	interface38_1_.method257(class186.aByte2073 == 1,
				 class186.aByte2053 == 1);
	aClass203_3657.method3881(interface38_1_, l, i * i, 282826186);
	return interface38_1_;
    }
    
    Interface38 method6269(Class186 class186, int i) {
	long l = (long) (i << 16 | class186.anInt2042 * 1604666399);
	Interface38 interface38 = (Interface38) aClass203_3657.method3871(l);
	if (interface38 != null)
	    return interface38;
	if (!method6265(class186, i))
	    return null;
	if (i == -1)
	    i = class186.anInt2046 * 1264459495;
	Interface38 interface38_2_;
	if (!class186.aBool2024 || !aClass185_Sub1_3659.method3409()) {
	    int[] is;
	    if (class186.aClass599_2064 != Class599.aClass599_7869
		|| !Class72.method1559(class186.aByte2067, -1983856182))
		is = anInterface25_3658.method150(Class598.aClass598_7865,
						  (class186.anInt2042
						   * 1604666399),
						  0.7F, i, i, false,
						  -1552830843);
	    else
		is = anInterface25_3658.method149(Class598.aClass598_7865,
						  (class186.anInt2042
						   * 1604666399),
						  0.7F, i, i, true,
						  1990700221);
	    if (is == null)
		return null;
	    interface38_2_ = aClass185_Sub1_3659.method14658(i, i, true, is);
	} else {
	    float[] fs
		= anInterface25_3658.method151(Class598.aClass598_7865,
					       class186.anInt2042 * 1604666399,
					       0.7F, i, i, false, -788167363);
	    interface38_2_
		= aClass185_Sub1_3659.method14731(Class181.aClass181_1952, i,
						  i, true, fs);
	}
	interface38_2_.method257(class186.aByte2073 == 1,
				 class186.aByte2053 == 1);
	aClass203_3657.method3881(interface38_2_, l, i * i, 1372257710);
	return interface38_2_;
    }
    
    Interface38 method6270(Class186 class186, int i) {
	long l = (long) (i << 16 | class186.anInt2042 * 1604666399);
	Interface38 interface38 = (Interface38) aClass203_3657.method3871(l);
	if (interface38 != null)
	    return interface38;
	if (!method6265(class186, i))
	    return null;
	if (i == -1)
	    i = class186.anInt2046 * 1264459495;
	Interface38 interface38_3_;
	if (!class186.aBool2024 || !aClass185_Sub1_3659.method3409()) {
	    int[] is;
	    if (class186.aClass599_2064 != Class599.aClass599_7869
		|| !Class72.method1559(class186.aByte2067, -1773483678))
		is = anInterface25_3658.method150(Class598.aClass598_7865,
						  (class186.anInt2042
						   * 1604666399),
						  0.7F, i, i, false,
						  -784846385);
	    else
		is = anInterface25_3658.method149(Class598.aClass598_7865,
						  (class186.anInt2042
						   * 1604666399),
						  0.7F, i, i, true,
						  1425382582);
	    if (is == null)
		return null;
	    interface38_3_ = aClass185_Sub1_3659.method14658(i, i, true, is);
	} else {
	    float[] fs
		= anInterface25_3658.method151(Class598.aClass598_7865,
					       class186.anInt2042 * 1604666399,
					       0.7F, i, i, false, -788167363);
	    interface38_3_
		= aClass185_Sub1_3659.method14731(Class181.aClass181_1952, i,
						  i, true, fs);
	}
	interface38_3_.method257(class186.aByte2073 == 1,
				 class186.aByte2053 == 1);
	aClass203_3657.method3881(interface38_3_, l, i * i, 1707244585);
	return interface38_3_;
    }
    
    Interface38 method6271(Class186 class186, int i) {
	long l = (long) (i << 16 | class186.anInt2042 * 1604666399);
	Interface38 interface38 = (Interface38) aClass203_3657.method3871(l);
	if (interface38 != null)
	    return interface38;
	if (!method6265(class186, i))
	    return null;
	if (i == -1)
	    i = class186.anInt2046 * 1264459495;
	Interface38 interface38_4_;
	if (!class186.aBool2024 || !aClass185_Sub1_3659.method3409()) {
	    int[] is;
	    if (class186.aClass599_2064 != Class599.aClass599_7869
		|| !Class72.method1559(class186.aByte2067, -1742888791))
		is = anInterface25_3658.method150(Class598.aClass598_7865,
						  (class186.anInt2042
						   * 1604666399),
						  0.7F, i, i, false,
						  1327081249);
	    else
		is = anInterface25_3658.method149(Class598.aClass598_7865,
						  (class186.anInt2042
						   * 1604666399),
						  0.7F, i, i, true,
						  -1961810990);
	    if (is == null)
		return null;
	    interface38_4_ = aClass185_Sub1_3659.method14658(i, i, true, is);
	} else {
	    float[] fs
		= anInterface25_3658.method151(Class598.aClass598_7865,
					       class186.anInt2042 * 1604666399,
					       0.7F, i, i, false, -788167363);
	    interface38_4_
		= aClass185_Sub1_3659.method14731(Class181.aClass181_1952, i,
						  i, true, fs);
	}
	interface38_4_.method257(class186.aByte2073 == 1,
				 class186.aByte2053 == 1);
	aClass203_3657.method3881(interface38_4_, l, i * i, -1152164731);
	return interface38_4_;
    }
    
    Class354(Class185_Sub1 class185_sub1, Interface25 interface25) {
	aClass185_Sub1_3659 = class185_sub1;
	anInterface25_3658 = interface25;
    }
    
    boolean method6272(Class186 class186, int i) {
	if (i == -1)
	    i = class186.anInt2046 * 1264459495;
	if (!class186.aBool2024 || !aClass185_Sub1_3659.method3409()) {
	    if (class186.aClass599_2064 != Class599.aClass599_7869
		|| !Class72.method1559(class186.aByte2067, -1923747847))
		return anInterface25_3658.method155(Class598.aClass598_7865,
						    (class186.anInt2042
						     * 1604666399),
						    Class613.aClass613_8023,
						    0.7F, i, i, false,
						    -618218007);
	    return anInterface25_3658.method155(Class598.aClass598_7865,
						(class186.anInt2042
						 * 1604666399),
						Class613.aClass613_8022, 0.7F,
						i, i, true, -618218007);
	}
	return anInterface25_3658.method155(Class598.aClass598_7865,
					    class186.anInt2042 * 1604666399,
					    Class613.aClass613_8024, 0.7F, i,
					    i, false, -618218007);
    }
    
    boolean method6273(Class186 class186, int i) {
	if (i == -1)
	    i = class186.anInt2046 * 1264459495;
	if (!class186.aBool2024 || !aClass185_Sub1_3659.method3409()) {
	    if (class186.aClass599_2064 != Class599.aClass599_7869
		|| !Class72.method1559(class186.aByte2067, -2028387034))
		return anInterface25_3658.method155(Class598.aClass598_7865,
						    (class186.anInt2042
						     * 1604666399),
						    Class613.aClass613_8023,
						    0.7F, i, i, false,
						    -618218007);
	    return anInterface25_3658.method155(Class598.aClass598_7865,
						(class186.anInt2042
						 * 1604666399),
						Class613.aClass613_8022, 0.7F,
						i, i, true, -618218007);
	}
	return anInterface25_3658.method155(Class598.aClass598_7865,
					    class186.anInt2042 * 1604666399,
					    Class613.aClass613_8024, 0.7F, i,
					    i, false, -618218007);
    }
    
    void method6274() {
	aClass203_3657.method3877(-1843662566);
    }
    
    void method6275() {
	aClass203_3657.method3877(-690679465);
    }
    
    void method6276() {
	aClass203_3657.method3877(-1886398678);
    }
}
