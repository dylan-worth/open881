/* Class161 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class161
{
    Class185_Sub3 aClass185_Sub3_1755;
    Interface25 anInterface25_1756;
    Class203 aClass203_1757 = new Class203(10485760, 256);
    
    boolean method2621(Class598 class598, Class186 class186, int i) {
	if (i == -1)
	    i = class186.anInt2046 * 1264459495;
	if (!class186.aBool2024 || !aClass185_Sub3_1755.method3409()) {
	    if (class186.aClass599_2064 != Class599.aClass599_7869
		|| !Class72.method1559(class186.aByte2067, -1794189891))
		return anInterface25_1756.method155(class598,
						    (class186.anInt2042
						     * 1604666399),
						    Class613.aClass613_8023,
						    0.7F, i, i, false,
						    -618218007);
	    return anInterface25_1756.method155(class598,
						(class186.anInt2042
						 * 1604666399),
						Class613.aClass613_8022, 0.7F,
						i, i, true, -618218007);
	}
	return anInterface25_1756.method155(class598,
					    class186.anInt2042 * 1604666399,
					    Class613.aClass613_8024, 0.7F, i,
					    i, false, -618218007);
    }
    
    Class141_Sub2 method2622(Class186 class186) {
	return method2623(class186, class186.anInt2046 * 1264459495);
    }
    
    Class141_Sub2 method2623(Class186 class186, int i) {
	Class141_Sub2 class141_sub2
	    = ((Class141_Sub2)
	       aClass203_1757.method3871((long) (class186.anInt2042
						 * 1604666399)));
	if (class141_sub2 != null)
	    return class141_sub2;
	if (!method2624(Class598.aClass598_7865, class186, i))
	    return null;
	if (i == -1)
	    i = class186.anInt2046 * 1264459495;
	Class141_Sub2 class141_sub2_0_;
	if (!class186.aBool2024 || !aClass185_Sub3_1755.method3409()) {
	    int[] is;
	    if (class186.aClass599_2064 != Class599.aClass599_7869
		|| !Class72.method1559(class186.aByte2067, -2099894387))
		is = anInterface25_1756.method150(Class598.aClass598_7865,
						  (class186.anInt2042
						   * 1604666399),
						  0.7F, i, i, false,
						  -1902909203);
	    else
		is = anInterface25_1756.method149(Class598.aClass598_7865,
						  (class186.anInt2042
						   * 1604666399),
						  0.7F, i, i, true, 925248353);
	    class141_sub2_0_
		= new Class141_Sub2(aClass185_Sub3_1755, 3553, i, i,
				    class186.aByte2070 != 0, is, 0, 0, false);
	} else {
	    float[] fs
		= anInterface25_1756.method151(Class598.aClass598_7865,
					       class186.anInt2042 * 1604666399,
					       0.7F, i, i, false, -788167363);
	    class141_sub2_0_ = new Class141_Sub2(aClass185_Sub3_1755, 3553,
						 Class181.aClass181_1952,
						 Class173.aClass173_1832, i, i,
						 class186.aByte2070 != 0, fs,
						 Class181.aClass181_1952);
	}
	class141_sub2_0_.method14454(class186.aByte2073 == 1,
				     class186.aByte2053 == 1);
	aClass203_1757.method3881(class141_sub2_0_,
				  (long) (class186.anInt2042 * 1604666399),
				  i * i, -1065825546);
	return class141_sub2_0_;
    }
    
    boolean method2624(Class598 class598, Class186 class186, int i) {
	if (i == -1)
	    i = class186.anInt2046 * 1264459495;
	if (!class186.aBool2024 || !aClass185_Sub3_1755.method3409()) {
	    if (class186.aClass599_2064 != Class599.aClass599_7869
		|| !Class72.method1559(class186.aByte2067, -2083899457))
		return anInterface25_1756.method155(class598,
						    (class186.anInt2042
						     * 1604666399),
						    Class613.aClass613_8023,
						    0.7F, i, i, false,
						    -618218007);
	    return anInterface25_1756.method155(class598,
						(class186.anInt2042
						 * 1604666399),
						Class613.aClass613_8022, 0.7F,
						i, i, true, -618218007);
	}
	return anInterface25_1756.method155(class598,
					    class186.anInt2042 * 1604666399,
					    Class613.aClass613_8024, 0.7F, i,
					    i, false, -618218007);
    }
    
    void method2625() {
	aClass203_1757.method3876(5, (byte) 0);
    }
    
    void method2626() {
	aClass203_1757.method3877(347717677);
    }
    
    Class141_Sub2 method2627(Class186 class186) {
	return method2623(class186, class186.anInt2046 * 1264459495);
    }
    
    Class141_Sub2 method2628(Class186 class186) {
	return method2623(class186, class186.anInt2046 * 1264459495);
    }
    
    Class161(Class185_Sub3 class185_sub3, Interface25 interface25) {
	aClass185_Sub3_1755 = class185_sub3;
	anInterface25_1756 = interface25;
    }
    
    boolean method2629(Class598 class598, Class186 class186, int i) {
	if (i == -1)
	    i = class186.anInt2046 * 1264459495;
	if (!class186.aBool2024 || !aClass185_Sub3_1755.method3409()) {
	    if (class186.aClass599_2064 != Class599.aClass599_7869
		|| !Class72.method1559(class186.aByte2067, -2105297529))
		return anInterface25_1756.method155(class598,
						    (class186.anInt2042
						     * 1604666399),
						    Class613.aClass613_8023,
						    0.7F, i, i, false,
						    -618218007);
	    return anInterface25_1756.method155(class598,
						(class186.anInt2042
						 * 1604666399),
						Class613.aClass613_8022, 0.7F,
						i, i, true, -618218007);
	}
	return anInterface25_1756.method155(class598,
					    class186.anInt2042 * 1604666399,
					    Class613.aClass613_8024, 0.7F, i,
					    i, false, -618218007);
    }
    
    void method2630() {
	aClass203_1757.method3876(5, (byte) 0);
    }
    
    boolean method2631(Class598 class598, Class186 class186, int i) {
	if (i == -1)
	    i = class186.anInt2046 * 1264459495;
	if (!class186.aBool2024 || !aClass185_Sub3_1755.method3409()) {
	    if (class186.aClass599_2064 != Class599.aClass599_7869
		|| !Class72.method1559(class186.aByte2067, -1746666237))
		return anInterface25_1756.method155(class598,
						    (class186.anInt2042
						     * 1604666399),
						    Class613.aClass613_8023,
						    0.7F, i, i, false,
						    -618218007);
	    return anInterface25_1756.method155(class598,
						(class186.anInt2042
						 * 1604666399),
						Class613.aClass613_8022, 0.7F,
						i, i, true, -618218007);
	}
	return anInterface25_1756.method155(class598,
					    class186.anInt2042 * 1604666399,
					    Class613.aClass613_8024, 0.7F, i,
					    i, false, -618218007);
    }
    
    void method2632() {
	aClass203_1757.method3876(5, (byte) 0);
    }
    
    boolean method2633(Class598 class598, Class186 class186, int i) {
	if (i == -1)
	    i = class186.anInt2046 * 1264459495;
	if (!class186.aBool2024 || !aClass185_Sub3_1755.method3409()) {
	    if (class186.aClass599_2064 != Class599.aClass599_7869
		|| !Class72.method1559(class186.aByte2067, -2096473633))
		return anInterface25_1756.method155(class598,
						    (class186.anInt2042
						     * 1604666399),
						    Class613.aClass613_8023,
						    0.7F, i, i, false,
						    -618218007);
	    return anInterface25_1756.method155(class598,
						(class186.anInt2042
						 * 1604666399),
						Class613.aClass613_8022, 0.7F,
						i, i, true, -618218007);
	}
	return anInterface25_1756.method155(class598,
					    class186.anInt2042 * 1604666399,
					    Class613.aClass613_8024, 0.7F, i,
					    i, false, -618218007);
    }
    
    void method2634() {
	aClass203_1757.method3876(5, (byte) 0);
    }
    
    void method2635() {
	aClass203_1757.method3877(-195342853);
    }
}
