/* Class248 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class248
{
    int anInt2636;
    int[] anIntArray2637;
    int[] anIntArray2638 = null;
    int[] anIntArray2639;
    Class258 aClass258_2640;
    int anInt2641;
    int[] anIntArray2642;
    int[] anIntArray2643;
    
    void method4596(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    void method4597(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    void method4598(Class258 class258) {
	aClass258_2640 = class258;
	int i = aClass258_2640.method4691();
	aClass258_2640.method4699(16);
	anInt2641 = (aClass258_2640.method4714() != 0
		     ? aClass258_2640.method4699(4) + 1 : 1);
	if (aClass258_2640.method4714() != 0) {
	    anInt2636 = aClass258_2640.method4699(8) + 1;
	    if (anIntArray2642 == null || anIntArray2642.length != anInt2636)
		anIntArray2642 = new int[anInt2636];
	    else
		method4597(anIntArray2642);
	    if (anIntArray2643 == null || anIntArray2643.length != anInt2636)
		anIntArray2643 = new int[anInt2636];
	    else
		method4597(anIntArray2643);
	    for (int i_0_ = 0; i_0_ < anInt2636; i_0_++) {
		anIntArray2642[i_0_]
		    = aClass258_2640.method4699(method4599(i - 1));
		anIntArray2643[i_0_]
		    = aClass258_2640.method4699(method4599(i - 1));
	    }
	} else
	    anInt2636 = 0;
	aClass258_2640.method4699(2);
	if (anInt2641 > 1) {
	    anIntArray2638 = new int[i];
	    for (int i_1_ = 0; i_1_ < i; i_1_++)
		anIntArray2638[i_1_] = aClass258_2640.method4699(4);
	}
	if (anIntArray2639 == null || anIntArray2639.length != anInt2641)
	    anIntArray2639 = new int[anInt2641];
	else
	    method4597(anIntArray2639);
	if (anIntArray2637 == null || anIntArray2637.length != anInt2641)
	    anIntArray2637 = new int[anInt2641];
	else
	    method4597(anIntArray2637);
	for (int i_2_ = 0; i_2_ < anInt2641; i_2_++) {
	    aClass258_2640.method4699(8);
	    anIntArray2639[i_2_] = aClass258_2640.method4699(8);
	    anIntArray2637[i_2_] = aClass258_2640.method4699(8);
	}
    }
    
    int method4599(int i) {
	int i_3_ = 0;
	for (/**/; i > 0; i >>= 1)
	    i_3_++;
	return i_3_;
    }
    
    void method4600(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    Class248() {
	/* empty */
    }
    
    void method4601(Class258 class258) {
	aClass258_2640 = class258;
	int i = aClass258_2640.method4691();
	aClass258_2640.method4699(16);
	anInt2641 = (aClass258_2640.method4714() != 0
		     ? aClass258_2640.method4699(4) + 1 : 1);
	if (aClass258_2640.method4714() != 0) {
	    anInt2636 = aClass258_2640.method4699(8) + 1;
	    if (anIntArray2642 == null || anIntArray2642.length != anInt2636)
		anIntArray2642 = new int[anInt2636];
	    else
		method4597(anIntArray2642);
	    if (anIntArray2643 == null || anIntArray2643.length != anInt2636)
		anIntArray2643 = new int[anInt2636];
	    else
		method4597(anIntArray2643);
	    for (int i_4_ = 0; i_4_ < anInt2636; i_4_++) {
		anIntArray2642[i_4_]
		    = aClass258_2640.method4699(method4599(i - 1));
		anIntArray2643[i_4_]
		    = aClass258_2640.method4699(method4599(i - 1));
	    }
	} else
	    anInt2636 = 0;
	aClass258_2640.method4699(2);
	if (anInt2641 > 1) {
	    anIntArray2638 = new int[i];
	    for (int i_5_ = 0; i_5_ < i; i_5_++)
		anIntArray2638[i_5_] = aClass258_2640.method4699(4);
	}
	if (anIntArray2639 == null || anIntArray2639.length != anInt2641)
	    anIntArray2639 = new int[anInt2641];
	else
	    method4597(anIntArray2639);
	if (anIntArray2637 == null || anIntArray2637.length != anInt2641)
	    anIntArray2637 = new int[anInt2641];
	else
	    method4597(anIntArray2637);
	for (int i_6_ = 0; i_6_ < anInt2641; i_6_++) {
	    aClass258_2640.method4699(8);
	    anIntArray2639[i_6_] = aClass258_2640.method4699(8);
	    anIntArray2637[i_6_] = aClass258_2640.method4699(8);
	}
    }
    
    int method4602(int i) {
	int i_7_ = 0;
	for (/**/; i > 0; i >>= 1)
	    i_7_++;
	return i_7_;
    }
}
