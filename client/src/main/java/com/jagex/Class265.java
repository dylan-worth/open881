/* Class265 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class265
{
    Interface29 anInterface29_2930;
    Class9 aClass9_2931;
    Class534_Sub12[] aClass534_Sub12Array2932;
    
    public Class534_Sub12 method4843(String string) {
	long l = anInterface29_2930.method177(string, (short) -4989);
	for (Class534_Sub12 class534_sub12
		 = (Class534_Sub12) aClass9_2931.method579(l);
	     class534_sub12 != null;
	     class534_sub12
		 = (Class534_Sub12) aClass9_2931.method582(1513367717)) {
	    if (class534_sub12.aString10441.equals(string))
		return class534_sub12;
	}
	return null;
    }
    
    public Class534_Sub12 method4844(int i, int i_0_) {
	if (i >= aClass534_Sub12Array2932.length)
	    return null;
	return aClass534_Sub12Array2932[i];
    }
    
    public Class534_Sub12 method4845(String string, int i) {
	long l = anInterface29_2930.method177(string, (short) 12179);
	for (Class534_Sub12 class534_sub12
		 = (Class534_Sub12) aClass9_2931.method579(l);
	     class534_sub12 != null;
	     class534_sub12
		 = (Class534_Sub12) aClass9_2931.method582(963830070)) {
	    if (class534_sub12.aString10441.equals(string))
		return class534_sub12;
	}
	return null;
    }
    
    void method4846(int i, short i_1_) {
	Class534_Sub12 class534_sub12 = method4844(i, -58337726);
	if (class534_sub12 != null) {
	    class534_sub12.method8892((byte) 1);
	    aClass534_Sub12Array2932[1639599971 * class534_sub12.anInt10442]
		= null;
	}
    }
    
    public void method4847(int i, String string, Class534_Sub12 class534_sub12,
			   int i_2_) {
	Class534_Sub12 class534_sub12_3_ = method4845(string, 1039772603);
	if (class534_sub12_3_ != null
	    && class534_sub12_3_.anInt10442 * 1639599971 != i)
	    throw new IllegalArgumentException(string);
	method4846(i, (short) -3728);
	if (i >= aClass534_Sub12Array2932.length) {
	    int i_4_;
	    for (i_4_ = aClass534_Sub12Array2932.length; i >= i_4_;
		 i_4_ += i_4_) {
		/* empty */
	    }
	    aClass9_2931 = new Class9(i_4_);
	    for (int i_5_ = 0; i_5_ < aClass534_Sub12Array2932.length;
		 i_5_++) {
		Class534_Sub12 class534_sub12_6_
		    = aClass534_Sub12Array2932[i_5_];
		if (null != class534_sub12_6_)
		    aClass9_2931.method581(class534_sub12_6_,
					   (class534_sub12_6_.aLong7158
					    * 8258869577519436579L));
	    }
	    Class534_Sub12[] class534_sub12s = new Class534_Sub12[i_4_];
	    for (int i_7_ = 0; i_7_ < aClass534_Sub12Array2932.length; i_7_++)
		class534_sub12s[i_7_] = aClass534_Sub12Array2932[i_7_];
	    aClass534_Sub12Array2932 = class534_sub12s;
	}
	class534_sub12.anInt10442 = i * 1769056843;
	class534_sub12.aString10441 = string;
	aClass9_2931.method581(class534_sub12,
			       anInterface29_2930.method177(string,
							    (short) -1914));
	aClass534_Sub12Array2932[i] = class534_sub12;
    }
    
    public Class534_Sub12 method4848(int i) {
	if (i >= aClass534_Sub12Array2932.length)
	    return null;
	return aClass534_Sub12Array2932[i];
    }
    
    public Class534_Sub12 method4849(int i) {
	if (i >= aClass534_Sub12Array2932.length)
	    return null;
	return aClass534_Sub12Array2932[i];
    }
    
    public Class265(int i, Interface29 interface29) {
	int i_8_;
	for (i_8_ = 1; i_8_ < i; i_8_ += i_8_) {
	    /* empty */
	}
	aClass9_2931 = new Class9(i_8_);
	aClass534_Sub12Array2932 = new Class534_Sub12[i_8_];
	anInterface29_2930 = interface29;
    }
    
    public Class534_Sub12 method4850(String string) {
	long l = anInterface29_2930.method177(string, (short) 16688);
	for (Class534_Sub12 class534_sub12
		 = (Class534_Sub12) aClass9_2931.method579(l);
	     class534_sub12 != null;
	     class534_sub12
		 = (Class534_Sub12) aClass9_2931.method582(990692981)) {
	    if (class534_sub12.aString10441.equals(string))
		return class534_sub12;
	}
	return null;
    }
    
    public Class534_Sub12 method4851(int i) {
	if (i >= aClass534_Sub12Array2932.length)
	    return null;
	return aClass534_Sub12Array2932[i];
    }
    
    void method4852(int i) {
	Class534_Sub12 class534_sub12 = method4844(i, -58337726);
	if (class534_sub12 != null) {
	    class534_sub12.method8892((byte) 1);
	    aClass534_Sub12Array2932[1639599971 * class534_sub12.anInt10442]
		= null;
	}
    }
    
    public void method4853(int i, String string,
			   Class534_Sub12 class534_sub12) {
	Class534_Sub12 class534_sub12_9_ = method4845(string, 1482103527);
	if (class534_sub12_9_ != null
	    && class534_sub12_9_.anInt10442 * 1639599971 != i)
	    throw new IllegalArgumentException(string);
	method4846(i, (short) -17499);
	if (i >= aClass534_Sub12Array2932.length) {
	    int i_10_;
	    for (i_10_ = aClass534_Sub12Array2932.length; i >= i_10_;
		 i_10_ += i_10_) {
		/* empty */
	    }
	    aClass9_2931 = new Class9(i_10_);
	    for (int i_11_ = 0; i_11_ < aClass534_Sub12Array2932.length;
		 i_11_++) {
		Class534_Sub12 class534_sub12_12_
		    = aClass534_Sub12Array2932[i_11_];
		if (null != class534_sub12_12_)
		    aClass9_2931.method581(class534_sub12_12_,
					   (class534_sub12_12_.aLong7158
					    * 8258869577519436579L));
	    }
	    Class534_Sub12[] class534_sub12s = new Class534_Sub12[i_10_];
	    for (int i_13_ = 0; i_13_ < aClass534_Sub12Array2932.length;
		 i_13_++)
		class534_sub12s[i_13_] = aClass534_Sub12Array2932[i_13_];
	    aClass534_Sub12Array2932 = class534_sub12s;
	}
	class534_sub12.anInt10442 = i * 1769056843;
	class534_sub12.aString10441 = string;
	aClass9_2931.method581(class534_sub12,
			       anInterface29_2930.method177(string,
							    (short) -2881));
	aClass534_Sub12Array2932[i] = class534_sub12;
    }
    
    public void method4854(int i, String string,
			   Class534_Sub12 class534_sub12) {
	Class534_Sub12 class534_sub12_14_ = method4845(string, 1557011803);
	if (class534_sub12_14_ != null
	    && class534_sub12_14_.anInt10442 * 1639599971 != i)
	    throw new IllegalArgumentException(string);
	method4846(i, (short) -31678);
	if (i >= aClass534_Sub12Array2932.length) {
	    int i_15_;
	    for (i_15_ = aClass534_Sub12Array2932.length; i >= i_15_;
		 i_15_ += i_15_) {
		/* empty */
	    }
	    aClass9_2931 = new Class9(i_15_);
	    for (int i_16_ = 0; i_16_ < aClass534_Sub12Array2932.length;
		 i_16_++) {
		Class534_Sub12 class534_sub12_17_
		    = aClass534_Sub12Array2932[i_16_];
		if (null != class534_sub12_17_)
		    aClass9_2931.method581(class534_sub12_17_,
					   (class534_sub12_17_.aLong7158
					    * 8258869577519436579L));
	    }
	    Class534_Sub12[] class534_sub12s = new Class534_Sub12[i_15_];
	    for (int i_18_ = 0; i_18_ < aClass534_Sub12Array2932.length;
		 i_18_++)
		class534_sub12s[i_18_] = aClass534_Sub12Array2932[i_18_];
	    aClass534_Sub12Array2932 = class534_sub12s;
	}
	class534_sub12.anInt10442 = i * 1769056843;
	class534_sub12.aString10441 = string;
	aClass9_2931.method581(class534_sub12,
			       anInterface29_2930.method177(string,
							    (short) -2902));
	aClass534_Sub12Array2932[i] = class534_sub12;
    }
    
    public void method4855(int i, String string,
			   Class534_Sub12 class534_sub12) {
	Class534_Sub12 class534_sub12_19_ = method4845(string, 978014973);
	if (class534_sub12_19_ != null
	    && class534_sub12_19_.anInt10442 * 1639599971 != i)
	    throw new IllegalArgumentException(string);
	method4846(i, (short) 504);
	if (i >= aClass534_Sub12Array2932.length) {
	    int i_20_;
	    for (i_20_ = aClass534_Sub12Array2932.length; i >= i_20_;
		 i_20_ += i_20_) {
		/* empty */
	    }
	    aClass9_2931 = new Class9(i_20_);
	    for (int i_21_ = 0; i_21_ < aClass534_Sub12Array2932.length;
		 i_21_++) {
		Class534_Sub12 class534_sub12_22_
		    = aClass534_Sub12Array2932[i_21_];
		if (null != class534_sub12_22_)
		    aClass9_2931.method581(class534_sub12_22_,
					   (class534_sub12_22_.aLong7158
					    * 8258869577519436579L));
	    }
	    Class534_Sub12[] class534_sub12s = new Class534_Sub12[i_20_];
	    for (int i_23_ = 0; i_23_ < aClass534_Sub12Array2932.length;
		 i_23_++)
		class534_sub12s[i_23_] = aClass534_Sub12Array2932[i_23_];
	    aClass534_Sub12Array2932 = class534_sub12s;
	}
	class534_sub12.anInt10442 = i * 1769056843;
	class534_sub12.aString10441 = string;
	aClass9_2931.method581(class534_sub12,
			       anInterface29_2930.method177(string,
							    (short) -3221));
	aClass534_Sub12Array2932[i] = class534_sub12;
    }
    
    public static void method4856(int i) {
	Class391.method6546((byte) 89);
    }
    
    static final void method4857(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class247.anInt2598 * 1797197351;
    }
}
