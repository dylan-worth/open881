/* Class240 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class240
{
    int anInt2385;
    int[] anIntArray2386;
    int anInt2387;
    Class258 aClass258_2388;
    int anInt2389;
    int anInt2390;
    int anInt2391;
    int[] anIntArray2392;
    int anInt2393;
    int[][] anIntArrayArray2394;
    
    void method4430(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    void method4431(Class258 class258) {
	aClass258_2388 = class258;
	anInt2393 = aClass258_2388.method4699(16);
	anInt2385 = aClass258_2388.method4699(24);
	anInt2387 = aClass258_2388.method4699(24);
	anInt2391 = aClass258_2388.method4699(24) + 1;
	anInt2389 = aClass258_2388.method4699(6) + 1;
	anInt2390 = aClass258_2388.method4699(8);
	if (anIntArray2392 == null || anIntArray2392.length != anInt2389)
	    anIntArray2392 = new int[anInt2389];
	for (int i = 0; i < anInt2389; i++) {
	    int i_0_ = 0;
	    int i_1_ = aClass258_2388.method4699(3);
	    boolean bool = aClass258_2388.method4714() != 0;
	    if (bool)
		i_0_ = aClass258_2388.method4699(5);
	    anIntArray2392[i] = i_0_ << 3 | i_1_;
	}
	if (anIntArray2386 == null || anIntArray2386.length != anInt2389 * 8)
	    anIntArray2386 = new int[anInt2389 * 8];
	for (int i = 0; i < anInt2389 * 8; i++)
	    anIntArray2386[i] = ((anIntArray2392[i >> 3] & 1 << (i & 0x7)) != 0
				 ? aClass258_2388.method4699(8) : -1);
    }
    
    void method4432(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    Class239[] method4433(Class239[] class239s, int i, boolean[] bools) {
	int i_2_ = class239s.length;
	for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
	    if (!bools[i_3_]) {
		for (int i_4_ = 0; i_4_ < i; i_4_++)
		    class239s[i_3_].aFloatArray2384[i_4_] = 0.0F;
	    }
	}
	int i_5_ = aClass258_2388.aClass256Array2726[anInt2390].anInt2706;
	int i_6_ = anInt2387 - anInt2385;
	int i_7_ = i_6_ / anInt2391;
	if (anIntArrayArray2394 == null || anIntArrayArray2394.length != i_2_
	    || anIntArrayArray2394[0].length != i_7_)
	    anIntArrayArray2394 = new int[i_2_][i_7_];
	else {
	    for (int i_8_ = 0; i_8_ < i_2_; i_8_++)
		method4430(anIntArrayArray2394[i_8_]);
	}
	for (int i_9_ = 0; i_9_ < 8; i_9_++) {
	    int i_10_ = 0;
	    while (i_10_ < i_7_) {
		if (i_9_ == 0) {
		    for (int i_11_ = 0; i_11_ < i_2_; i_11_++) {
			if (!bools[i_11_]) {
			    int i_12_
				= aClass258_2388.aClass256Array2726
				      [anInt2390].method4658(aClass258_2388);
			    for (int i_13_ = i_5_ - 1; i_13_ >= 0; i_13_--) {
				if (i_10_ + i_13_ < i_7_)
				    anIntArrayArray2394[i_11_][i_10_ + i_13_]
					= i_12_ % anInt2389;
				i_12_ /= anInt2389;
			    }
			}
		    }
		}
		for (int i_14_ = 0; i_14_ < i_5_; i_14_++) {
		    for (int i_15_ = 0; i_15_ < i_2_; i_15_++) {
			if (!bools[i_15_]) {
			    int i_16_ = anIntArrayArray2394[i_15_][i_10_];
			    int i_17_ = anIntArray2386[i_16_ * 8 + i_9_];
			    if (i_17_ >= 0) {
				int i_18_ = anInt2385 + i_10_ * anInt2391;
				Class256 class256
				    = aClass258_2388.aClass256Array2726[i_17_];
				if (anInt2393 == 0) {
				    int i_19_ = anInt2391 / class256.anInt2706;
				    for (int i_20_ = 0; i_20_ < i_19_;
					 i_20_++) {
					float[] fs
					    = class256
						  .method4659(aClass258_2388);
					for (int i_21_ = 0;
					     i_21_ < class256.anInt2706;
					     i_21_++)
					    class239s[i_15_]
						.aFloatArray2384
						[i_18_ + i_20_ + i_21_ * i_19_]
						+= fs[i_21_];
				    }
				} else if (anInt2393 == 1 || anInt2393 == 2) {
				    int i_22_ = 0;
				    while (i_22_ < anInt2391) {
					float[] fs
					    = class256
						  .method4659(aClass258_2388);
					for (int i_23_ = 0;
					     i_23_ < class256.anInt2706;
					     i_23_++) {
					    class239s[i_15_]
						.aFloatArray2384[i_18_ + i_22_]
						+= fs[i_23_];
					    i_22_++;
					}
				    }
				}
			    }
			}
		    }
		    if (++i_10_ >= i_7_)
			break;
		}
	    }
	}
	return class239s;
    }
    
    Class240() {
	/* empty */
    }
    
    void method4434(Class258 class258) {
	aClass258_2388 = class258;
	anInt2393 = aClass258_2388.method4699(16);
	anInt2385 = aClass258_2388.method4699(24);
	anInt2387 = aClass258_2388.method4699(24);
	anInt2391 = aClass258_2388.method4699(24) + 1;
	anInt2389 = aClass258_2388.method4699(6) + 1;
	anInt2390 = aClass258_2388.method4699(8);
	if (anIntArray2392 == null || anIntArray2392.length != anInt2389)
	    anIntArray2392 = new int[anInt2389];
	for (int i = 0; i < anInt2389; i++) {
	    int i_24_ = 0;
	    int i_25_ = aClass258_2388.method4699(3);
	    boolean bool = aClass258_2388.method4714() != 0;
	    if (bool)
		i_24_ = aClass258_2388.method4699(5);
	    anIntArray2392[i] = i_24_ << 3 | i_25_;
	}
	if (anIntArray2386 == null || anIntArray2386.length != anInt2389 * 8)
	    anIntArray2386 = new int[anInt2389 * 8];
	for (int i = 0; i < anInt2389 * 8; i++)
	    anIntArray2386[i] = ((anIntArray2392[i >> 3] & 1 << (i & 0x7)) != 0
				 ? aClass258_2388.method4699(8) : -1);
    }
    
    void method4435(Class258 class258) {
	aClass258_2388 = class258;
	anInt2393 = aClass258_2388.method4699(16);
	anInt2385 = aClass258_2388.method4699(24);
	anInt2387 = aClass258_2388.method4699(24);
	anInt2391 = aClass258_2388.method4699(24) + 1;
	anInt2389 = aClass258_2388.method4699(6) + 1;
	anInt2390 = aClass258_2388.method4699(8);
	if (anIntArray2392 == null || anIntArray2392.length != anInt2389)
	    anIntArray2392 = new int[anInt2389];
	for (int i = 0; i < anInt2389; i++) {
	    int i_26_ = 0;
	    int i_27_ = aClass258_2388.method4699(3);
	    boolean bool = aClass258_2388.method4714() != 0;
	    if (bool)
		i_26_ = aClass258_2388.method4699(5);
	    anIntArray2392[i] = i_26_ << 3 | i_27_;
	}
	if (anIntArray2386 == null || anIntArray2386.length != anInt2389 * 8)
	    anIntArray2386 = new int[anInt2389 * 8];
	for (int i = 0; i < anInt2389 * 8; i++)
	    anIntArray2386[i] = ((anIntArray2392[i >> 3] & 1 << (i & 0x7)) != 0
				 ? aClass258_2388.method4699(8) : -1);
    }
    
    void method4436(Class258 class258) {
	aClass258_2388 = class258;
	anInt2393 = aClass258_2388.method4699(16);
	anInt2385 = aClass258_2388.method4699(24);
	anInt2387 = aClass258_2388.method4699(24);
	anInt2391 = aClass258_2388.method4699(24) + 1;
	anInt2389 = aClass258_2388.method4699(6) + 1;
	anInt2390 = aClass258_2388.method4699(8);
	if (anIntArray2392 == null || anIntArray2392.length != anInt2389)
	    anIntArray2392 = new int[anInt2389];
	for (int i = 0; i < anInt2389; i++) {
	    int i_28_ = 0;
	    int i_29_ = aClass258_2388.method4699(3);
	    boolean bool = aClass258_2388.method4714() != 0;
	    if (bool)
		i_28_ = aClass258_2388.method4699(5);
	    anIntArray2392[i] = i_28_ << 3 | i_29_;
	}
	if (anIntArray2386 == null || anIntArray2386.length != anInt2389 * 8)
	    anIntArray2386 = new int[anInt2389 * 8];
	for (int i = 0; i < anInt2389 * 8; i++)
	    anIntArray2386[i] = ((anIntArray2392[i >> 3] & 1 << (i & 0x7)) != 0
				 ? aClass258_2388.method4699(8) : -1);
    }
}
