/* Class85 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class85 implements Interface13
{
    public int anInt841;
    public int anInt842;
    int[] anIntArray843;
    public boolean aBool844 = false;
    Class75 aClass75_845;
    
    public void method78(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(-1829040314);
	    if (i == 0)
		break;
	    method1675(class534_sub40, i, (byte) -87);
	}
    }
    
    public void method79(Class534_Sub40 class534_sub40, byte i) {
	for (;;) {
	    int i_0_ = class534_sub40.method16527(-694829958);
	    if (i_0_ == 0)
		break;
	    method1675(class534_sub40, i_0_, (byte) -15);
	}
    }
    
    void method1671(Class185 class185, int i, boolean bool, long l) {
	if (aClass75_845.aClass472_802.method7670(138454787 * anInt842,
						  (byte) -5)) {
	    Class169 class169 = Class178.method2949(aClass75_845.aClass472_802,
						    anInt842 * 138454787, 0);
	    if (class169 != null) {
		class169.method2768();
		if (bool)
		    class169.method2779();
		for (int i_1_ = 0; i_1_ < i; i_1_++)
		    class169.method2771();
		anIntArray843 = class169.method2766(false);
		if (anInt841 * 2126510373 != 0) {
		    int i_2_ = (2126510373 * anInt841 & 0xff0000) >> 16;
		    int i_3_ = (2126510373 * anInt841 & 0xff00) >> 8;
		    int i_4_ = anInt841 * 2126510373 & 0xff;
		    for (int i_5_ = 0; i_5_ < anIntArray843.length; i_5_++) {
			int i_6_ = anIntArray843[i_5_] >> 24 & 0xff;
			int i_7_ = 256 - i_6_;
			if (0 != i_6_) {
			    int i_8_ = -16777216 * (i_2_ * (anIntArray843[i_5_]
							    & 0xff0000));
			    int i_9_ = (i_3_ * (anIntArray843[i_5_] & 0xff00)
					* 16711680);
			    int i_10_ = 65280 * ((anIntArray843[i_5_] & 0xff)
						 * i_4_);
			    int i_11_ = (i_8_ | i_9_ | i_10_) >>> 8;
			    if (i_6_ == 255)
				anIntArray843[i_5_] = i_11_;
			    else {
				int i_12_ = anIntArray843[i_5_];
				anIntArray843[i_5_]
				    = (i_6_ << 24
				       | (((i_6_ * (i_12_ & 0xff00)
					    + i_7_ * (i_11_ & 0xff00))
					   & 0xff0000)
					  + (((i_12_ & 0xff00ff) * i_6_
					      + i_7_ * (i_11_ & 0xff00ff))
					     & ~0xff00ff)) >> 8);
			    }
			}
		    }
		}
	    }
	    Class163 class163 = class185.method3279(class169, true);
	    if (class163 != null)
		aClass75_845.aClass203_801.method3893(class163, l);
	}
    }
    
    public Class163 method1672(Class185 class185, int i, boolean bool,
			       short i_13_) {
	long l = (long) (138454787 * anInt842 | i << 16 | (bool ? 262144 : 0)
			 | 2098753835 * class185.anInt2001 << 19);
	Class163 class163
	    = (Class163) aClass75_845.aClass203_801.method3871(l);
	if (class163 != null)
	    return class163;
	method1671(class185, i, bool, l);
	return (Class163) aClass75_845.aClass203_801.method3871(l);
    }
    
    public int[] method1673(Class185 class185, int i, boolean bool,
			    int i_14_) {
	if (anIntArray843 != null)
	    return anIntArray843;
	long l = (long) (138454787 * anInt842 | i << 16 | (bool ? 262144 : 0)
			 | 2098753835 * class185.anInt2001 << 19);
	method1671(class185, i, bool, l);
	return anIntArray843;
    }
    
    public void method80(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(-648615139);
	    if (i == 0)
		break;
	    method1675(class534_sub40, i, (byte) -120);
	}
    }
    
    public boolean method1674(int i) {
	return aClass75_845.aClass472_802.method7670(138454787 * anInt842,
						     (byte) -93);
    }
    
    public void method82(int i) {
	/* empty */
    }
    
    void method1675(Class534_Sub40 class534_sub40, int i, byte i_15_) {
	do {
	    if (1 == i)
		anInt842
		    = class534_sub40.method16550((byte) -19) * -1417249877;
	    else if (i == 2)
		anInt841 = class534_sub40.method16531(780221760) * -1516930387;
	    else if (3 == i)
		aBool844 = true;
	    else if (4 == i)
		anInt842 = 1417249877;
	    else if (5 == i)
		break;
	} while (false);
    }
    
    void method1676(Class534_Sub40 class534_sub40, int i) {
	do {
	    if (1 == i)
		anInt842 = class534_sub40.method16550((byte) 42) * -1417249877;
	    else if (i == 2)
		anInt841 = class534_sub40.method16531(968742860) * -1516930387;
	    else if (3 == i)
		aBool844 = true;
	    else if (4 == i)
		anInt842 = 1417249877;
	    else if (5 == i)
		break;
	} while (false);
    }
    
    public void method81(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(1109525383);
	    if (i == 0)
		break;
	    method1675(class534_sub40, i, (byte) -106);
	}
    }
    
    Class85(int i, Class75 class75) {
	aClass75_845 = class75;
    }
    
    public void method84() {
	/* empty */
    }
    
    void method1677(Class534_Sub40 class534_sub40, int i) {
	do {
	    if (1 == i)
		anInt842
		    = class534_sub40.method16550((byte) -57) * -1417249877;
	    else if (i == 2)
		anInt841
		    = class534_sub40.method16531(1890122905) * -1516930387;
	    else if (3 == i)
		aBool844 = true;
	    else if (4 == i)
		anInt842 = 1417249877;
	    else if (5 == i)
		break;
	} while (false);
    }
    
    void method1678(Class534_Sub40 class534_sub40, int i) {
	do {
	    if (1 == i)
		anInt842 = class534_sub40.method16550((byte) 43) * -1417249877;
	    else if (i == 2)
		anInt841
		    = class534_sub40.method16531(1320909617) * -1516930387;
	    else if (3 == i)
		aBool844 = true;
	    else if (4 == i)
		anInt842 = 1417249877;
	    else if (5 == i)
		break;
	} while (false);
    }
    
    public int[] method1679(Class185 class185, int i, boolean bool) {
	if (anIntArray843 != null)
	    return anIntArray843;
	long l = (long) (138454787 * anInt842 | i << 16 | (bool ? 262144 : 0)
			 | 2098753835 * class185.anInt2001 << 19);
	method1671(class185, i, bool, l);
	return anIntArray843;
    }
    
    public Class163 method1680(Class185 class185, int i, boolean bool) {
	long l = (long) (138454787 * anInt842 | i << 16 | (bool ? 262144 : 0)
			 | 2098753835 * class185.anInt2001 << 19);
	Class163 class163
	    = (Class163) aClass75_845.aClass203_801.method3871(l);
	if (class163 != null)
	    return class163;
	method1671(class185, i, bool, l);
	return (Class163) aClass75_845.aClass203_801.method3871(l);
    }
    
    public void method83() {
	/* empty */
    }
    
    void method1681(Class185 class185, int i, boolean bool, long l) {
	if (aClass75_845.aClass472_802.method7670(138454787 * anInt842,
						  (byte) -117)) {
	    Class169 class169 = Class178.method2949(aClass75_845.aClass472_802,
						    anInt842 * 138454787, 0);
	    if (class169 != null) {
		class169.method2768();
		if (bool)
		    class169.method2779();
		for (int i_16_ = 0; i_16_ < i; i_16_++)
		    class169.method2771();
		anIntArray843 = class169.method2766(false);
		if (anInt841 * 2126510373 != 0) {
		    int i_17_ = (2126510373 * anInt841 & 0xff0000) >> 16;
		    int i_18_ = (2126510373 * anInt841 & 0xff00) >> 8;
		    int i_19_ = anInt841 * 2126510373 & 0xff;
		    for (int i_20_ = 0; i_20_ < anIntArray843.length;
			 i_20_++) {
			int i_21_ = anIntArray843[i_20_] >> 24 & 0xff;
			int i_22_ = 256 - i_21_;
			if (0 != i_21_) {
			    int i_23_
				= -16777216 * (i_17_ * (anIntArray843[i_20_]
							& 0xff0000));
			    int i_24_
				= (i_18_ * (anIntArray843[i_20_] & 0xff00)
				   * 16711680);
			    int i_25_ = 65280 * ((anIntArray843[i_20_] & 0xff)
						 * i_19_);
			    int i_26_ = (i_23_ | i_24_ | i_25_) >>> 8;
			    if (i_21_ == 255)
				anIntArray843[i_20_] = i_26_;
			    else {
				int i_27_ = anIntArray843[i_20_];
				anIntArray843[i_20_]
				    = (i_21_ << 24
				       | (((i_21_ * (i_27_ & 0xff00)
					    + i_22_ * (i_26_ & 0xff00))
					   & 0xff0000)
					  + (((i_27_ & 0xff00ff) * i_21_
					      + i_22_ * (i_26_ & 0xff00ff))
					     & ~0xff00ff)) >> 8);
			    }
			}
		    }
		}
	    }
	    Class163 class163 = class185.method3279(class169, true);
	    if (class163 != null)
		aClass75_845.aClass203_801.method3893(class163, l);
	}
    }
    
    static String method1682(long l, int i, short i_28_) {
	Class699.method14128(l);
	int i_29_ = Class84.aCalendar838.get(5);
	int i_30_ = Class84.aCalendar838.get(2) + 1;
	int i_31_ = Class84.aCalendar838.get(1);
	return new StringBuilder().append(Integer.toString(i_29_ / 10)).append
		   (i_29_ % 10).append
		   ("/").append
		   (i_30_ / 10).append
		   (i_30_ % 10).append
		   ("/").append
		   (i_31_ % 100 / 10).append
		   (i_31_ % 10).toString();
    }
}
