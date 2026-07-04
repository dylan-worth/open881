/* Class580 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class580 implements Interface65
{
    int anInt7759;
    int anInt7760;
    int[] anIntArray7761;
    public static short[][] aShortArrayArray7762;
    
    public boolean method438(Class534_Sub42 class534_sub42,
			     Interface63[] interface63s, int i,
			     Class547 class547) {
	if (class534_sub42 == null) {
	    if (-1 != -477402377 * anInt7759)
		return false;
	} else {
	    if (anInt7759 * -477402377
		!= class534_sub42.method16798((byte) -4))
		return false;
	    if (-651261039 * anInt7760
		> class534_sub42.method16817(-2035105269))
		return false;
	    int[] is = anIntArray7761;
	    for (int i_0_ = 0; i_0_ < is.length; i_0_++) {
		int i_1_ = is[i_0_];
		if (!class547.method8995(i_1_, (byte) -12))
		    return false;
	    }
	}
	return true;
    }
    
    public boolean method437(Class534_Sub42 class534_sub42,
			     Interface63[] interface63s, int i,
			     Class547 class547, int i_2_) {
	if (class534_sub42 == null) {
	    if (-1 != -477402377 * anInt7759)
		return false;
	} else {
	    if (anInt7759 * -477402377 != class534_sub42.method16798((byte) 5))
		return false;
	    if (-651261039 * anInt7760
		> class534_sub42.method16817(-129840056))
		return false;
	    int[] is = anIntArray7761;
	    for (int i_3_ = 0; i_3_ < is.length; i_3_++) {
		int i_4_ = is[i_3_];
		if (!class547.method8995(i_4_, (byte) -124))
		    return false;
	    }
	}
	return true;
    }
    
    Class580(int i, int i_5_, int[] is) {
	anInt7759 = i * 1220441799;
	anInt7760 = 556373361 * i_5_;
	anIntArray7761 = is;
    }
    
    static Class580 method9812(Class534_Sub40 class534_sub40) {
	int i = class534_sub40.method16527(58993943);
	int i_6_ = class534_sub40.method16527(-497517280);
	int i_7_ = class534_sub40.method16527(461504827);
	int[] is = new int[i_7_];
	for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
	    is[i_8_] = class534_sub40.method16527(75077465);
	return new Class580(i, i_6_, is);
    }
    
    public static void method9813(Class652 class652, int i) {
	if (class652.aClass376_8481 == Class376.aClass376_3910)
	    Class639.aClass367_8316 = new Class367_Sub1(class652);
	else if (class652.aClass376_8481 == Class376.aClass376_3909)
	    Class639.aClass367_8316 = new Class367_Sub2(class652);
	else
	    throw new RuntimeException();
    }
    
    static final void method9814(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	int i_9_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	boolean bool = 1 == (class669.anIntArray8595
			     [1 + 2088438307 * class669.anInt8600]);
	Class89.method1713(i_9_, string, bool, -694654803);
    }
    
    static final void method9815(Class669 class669, byte i) {
	long l = Class250.method4604((byte) -33);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (int) (l / 86400000L) - 11745;
    }
    
    static final void method9816(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	class247.anInt2587
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) * -279362861;
	Class454.method7416(class247, -1827680760);
    }
    
    public static Class534_Sub36 method9817(int i, boolean bool, int i_10_) {
	synchronized (Class534_Sub36.aClass534_Sub36Array10794) {
	    if (Class534_Sub36.anInt10795 * 2450901 == 0) {
		Class534_Sub36 class534_sub36 = new Class534_Sub36(i, bool);
		return class534_sub36;
	    }
	    Class534_Sub36.aClass534_Sub36Array10794
		[(Class534_Sub36.anInt10795 -= 1809361789) * 2450901]
		.method16467(i, bool, (short) -15258);
	    Class534_Sub36 class534_sub36
		= (Class534_Sub36.aClass534_Sub36Array10794
		   [2450901 * Class534_Sub36.anInt10795]);
	    return class534_sub36;
	}
    }
}
