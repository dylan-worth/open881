/* Class511 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class511
{
    Class534_Sub40_Sub1 aClass534_Sub40_Sub1_5679;
    Class499 aClass499_5680;
    
    public Class511(Class499 class499,
		    Class534_Sub40_Sub1 class534_sub40_sub1) {
	aClass499_5680 = class499;
	aClass534_Sub40_Sub1_5679 = class534_sub40_sub1;
    }
    
    static final void method8404(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_0_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_1_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_0_ * i_1_;
    }
    
    static void method8405(Class669 class669, int i) {
	int i_2_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 - 3];
	int i_3_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 - 2];
	int i_4_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 - 1];
	class669.anInt8600 -= 926998689;
	if (i_2_ > class669.anIntArray8589[i_3_])
	    throw new RuntimeException();
	if (i_2_ > class669.anIntArray8589[i_4_])
	    throw new RuntimeException();
	if (i_4_ == i_3_)
	    throw new RuntimeException();
	Class468.method7624(class669.anIntArrayArray8590[i_3_],
			    class669.anIntArrayArray8590[i_4_], 0, i_2_ - 1,
			    -288770810);
    }
    
    static final void method8406(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 35375019 * class669.aClass352_8602.anInt3637;
    }
    
    static final void method8407(Class669 class669, byte i) {
	class669.anInt8600 -= 1544997815;
	int i_5_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_6_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	int i_7_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 2];
	int i_8_
	    = class669.anIntArray8595[3 + 2088438307 * class669.anInt8600];
	int i_9_
	    = class669.anIntArray8595[4 + 2088438307 * class669.anInt8600];
	if (-1 == i_7_)
	    throw new RuntimeException();
	Class41 class41
	    = ((Class41)
	       Class667.aClass44_Sub21_8582.method91(i_7_, -1902452155));
	if (class41.aClass493_317.method93() != i_6_)
	    throw new RuntimeException();
	if (class41.aClass493_314.method93() != i_5_)
	    throw new RuntimeException();
	int[] is = class41.method1042(Integer.valueOf(i_8_), (short) -15930);
	if (i_9_ < 0 || null == is || is.length <= i_9_)
	    throw new RuntimeException();
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = is[i_9_];
    }
    
    static void method8408(Class702 class702, int i) {
	Class331.aClass702_3495 = class702;
	Class534_Sub1_Sub2.aString11720 = null;
    }
    
    static final void method8409(Class669 class669, int i) {
	boolean bool = true;
	if (client.aBool11017) {
	    try {
		Object object = Class403.aClass403_4147.method6600((byte) 0);
		if (object != null)
		    bool = ((Boolean) object).booleanValue();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = bool ? 1 : 0;
    }
    
    public static int method8410(CharSequence charsequence, int i) {
	int i_10_ = charsequence.length();
	int i_11_ = 0;
	for (int i_12_ = 0; i_12_ < i_10_; i_12_++)
	    i_11_ = (i_11_ << 5) - i_11_ + charsequence.charAt(i_12_);
	return i_11_;
    }
}
