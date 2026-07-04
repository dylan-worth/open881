/* Class231 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class231 implements Interface42
{
    public static Class171 aClass171_2325;
    Class232 this$0;
    
    public float method330(short i) {
	return ((float) Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub28_10787.method17131(527202125)
		/ 255.0F);
    }
    
    Class231(Class232 class232) {
	this$0 = class232;
    }
    
    public float method331() {
	return ((float) Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub28_10787.method17131(-608239028)
		/ 255.0F);
    }
    
    static final void method4210(Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	Class527.method8779(string, 965681690);
    }
    
    static boolean method4211(Class272 class272, int i) {
	if (class272 == null)
	    return false;
	if (null != class272.anIntArray2981) {
	    class272 = class272.method5052(Class554_Sub1.anInterface18_7352,
					   Class554_Sub1.anInterface20_7351,
					   -472645502);
	    if (class272 == null)
		return false;
	}
	if (!class272.aBool2978)
	    return false;
	if (!class272.method5063(Class554_Sub1.anInterface18_7352,
				 Class554_Sub1.anInterface20_7351,
				 (short) 13496))
	    return false;
	if (Class554_Sub1.aClass9_10686
		.method579((long) (1390042623 * class272.anInt2966))
	    != null)
	    return false;
	if (Class554_Sub1.aClass9_10687.method579((long) (class272.anInt2977
							  * -15128681))
	    != null)
	    return false;
	if (class272.aString2969 != null) {
	    if (638004337 * class272.anInt2985 == 0
		&& Class554_Sub1.aBool10689)
		return false;
	    if (class272.anInt2985 * 638004337 == 1
		&& Class554_Sub1.aBool10690)
		return false;
	    if (2 == class272.anInt2985 * 638004337
		&& Class554_Sub1.aBool10693)
		return false;
	}
	return true;
    }
}
