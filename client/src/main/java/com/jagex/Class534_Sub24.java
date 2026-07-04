/* Class534_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class534_Sub24 extends Class534
{
    public static final int anInt10549 = 8;
    public static final int anInt10550 = 1;
    public static final int anInt10551 = 5;
    public static final int anInt10552 = 3;
    int[] anIntArray10553;
    static final int anInt10554 = 6;
    boolean[] aBoolArray10555;
    public static final int anInt10556 = 7;
    public static final int anInt10557 = 9;
    public static final int anInt10558 = 10;
    int[][] anIntArrayArray10559;
    int anInt10560;
    int[] anIntArray10561;
    int anInt10562;
    public static final int anInt10563 = 2;
    public static final int anInt10564 = 0;
    public static Class110_Sub1_Sub2 aClass110_Sub1_Sub2_10565;
    
    Class534_Sub24(int i, byte[] is) {
	anInt10562 = i * 503639547;
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	anInt10560 = class534_sub40.method16529((byte) 1) * 1583229655;
	anIntArray10561 = new int[-782210841 * anInt10560];
	anIntArrayArray10559 = new int[anInt10560 * -782210841][];
	aBoolArray10555 = new boolean[anInt10560 * -782210841];
	anIntArray10553 = new int[-782210841 * anInt10560];
	for (int i_0_ = 0; i_0_ < -782210841 * anInt10560; i_0_++) {
	    anIntArray10561[i_0_] = class534_sub40.method16527(-523249373);
	    if (anIntArray10561[i_0_] == 6)
		anIntArray10561[i_0_] = 2;
	}
	for (int i_1_ = 0; i_1_ < -782210841 * anInt10560; i_1_++)
	    aBoolArray10555[i_1_]
		= class534_sub40.method16527(-1473328640) == 1;
	for (int i_2_ = 0; i_2_ < anInt10560 * -782210841; i_2_++)
	    anIntArray10553[i_2_] = class534_sub40.method16529((byte) 1);
	for (int i_3_ = 0; i_3_ < -782210841 * anInt10560; i_3_++)
	    anIntArrayArray10559[i_3_]
		= new int[class534_sub40.method16546(-1706829710)];
	for (int i_4_ = 0; i_4_ < anInt10560 * -782210841; i_4_++) {
	    for (int i_5_ = 0; i_5_ < anIntArrayArray10559[i_4_].length;
		 i_5_++)
		anIntArrayArray10559[i_4_][i_5_]
		    = class534_sub40.method16546(-1706829710);
	}
    }
    
    static final void method16261(Class669 class669, int i) {
	if ((class669.anIntArray8595
	     [(class669.anInt8600 -= 308999563) * 2088438307])
	    == 1)
	    class669.anInt8613
		+= (-793595371
		    * class669.anIntArray8591[662605117 * class669.anInt8613]);
    }
}
