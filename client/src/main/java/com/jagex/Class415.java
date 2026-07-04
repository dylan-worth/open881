/* Class415 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class415
{
    int anInt4664;
    Object anObject4665;
    public static int[] anIntArray4666;
    
    Class415(Object object, int i) {
	anObject4665 = object;
	anInt4664 = -1235882561 * i;
    }
    
    static int method6740(int i, int i_0_) {
	if (9 == i || i == 10)
	    return 1;
	if (11 == i)
	    return 8;
	return i;
    }
    
    static final void method6741(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	int i_1_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_2_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class440.method7100(i_1_, i_2_, false, (byte) 89);
    }
    
    static final void method6742(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class539.aClass672_7171.method93();
    }
    
    static final void method6743(Class669 class669, int i) {
	Class706.method14253(true, -1980054506);
    }
    
    static int method6744(int i, int i_3_, int i_4_) {
	if (i == Class595.aClass595_7830.anInt7852 * 847393323
	    || i == 847393323 * Class595.aClass595_7832.anInt7852)
	    return Class654_Sub1_Sub1_Sub2.anIntArray12017[i_3_ & 0x3];
	return Class654_Sub1_Sub1_Sub2.anIntArray12020[i_3_ & 0x3];
    }
    
    static Class534_Sub18_Sub9 method6745(Class534_Sub40 class534_sub40, int i,
					  byte i_5_) {
	Class534_Sub18_Sub9 class534_sub18_sub9
	    = new Class534_Sub18_Sub9(i,
				      class534_sub40.method16541((byte) -24),
				      class534_sub40.method16541((byte) -37),
				      class534_sub40.method16533(-258848859),
				      class534_sub40.method16533(-258848859),
				      (class534_sub40.method16527(132445117)
				       == 1),
				      class534_sub40.method16527(1435438348),
				      class534_sub40.method16527(1062012424));
	int i_6_ = class534_sub40.method16527(-6181462);
	for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
	    class534_sub18_sub9.aClass700_11773.method14131
		(new Class534_Sub34(class534_sub40.method16527(1934130392),
				    class534_sub40.method16529((byte) 1),
				    class534_sub40.method16529((byte) 1),
				    class534_sub40.method16529((byte) 1),
				    class534_sub40.method16529((byte) 1),
				    class534_sub40.method16529((byte) 1),
				    class534_sub40.method16529((byte) 1),
				    class534_sub40.method16529((byte) 1),
				    class534_sub40.method16529((byte) 1)),
		 (short) 789);
	class534_sub18_sub9.method18275(-375018510);
	return class534_sub18_sub9;
    }
}
