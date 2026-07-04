/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class2
{
    public static final int anInt19 = 1700;
    public static final int anInt20 = 40000;
    public static final int anInt21 = 131072;
    static int anInt22;
    public static Class472 aClass472_23;
    
    Class2() throws Throwable {
	throw new Error();
    }
    
    public static int method511(int i, int i_0_, boolean bool, int i_1_) {
	Class534_Sub5 class534_sub5 = Class269.method5023(i, bool, (byte) 4);
	if (class534_sub5 == null)
	    return 0;
	if (i_0_ == -1)
	    return 0;
	int i_2_ = 0;
	for (int i_3_ = 0; i_3_ < class534_sub5.anIntArray10415.length;
	     i_3_++) {
	    if (i_0_ == class534_sub5.anIntArray10414[i_3_])
		i_2_ += class534_sub5.anIntArray10415[i_3_];
	}
	return i_2_;
    }
}
