/* Class330 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class330 implements Interface13
{
    int[] anIntArray3481 = { -1, -1, -1, -1, -1 };
    int[] anIntArray3482;
    short[] aShortArray3483;
    short[] aShortArray3484;
    short[] aShortArray3485;
    Class472 aClass472_3486;
    byte[] aByteArray3487;
    short[] aShortArray3488;
    public static int[] anIntArray3489;
    public static int[] anIntArray3490 = { 0, 1, 2, 3, 4, 5, 6, 14 };
    byte[] aByteArray3491;
    
    void method5835(Class534_Sub40 class534_sub40, int i) {
	if (i == 1)
	    class534_sub40.method16527(1005373084);
	else if (i == 2) {
	    int i_0_ = class534_sub40.method16527(1094958860);
	    anIntArray3482 = new int[i_0_];
	    for (int i_1_ = 0; i_1_ < i_0_; i_1_++)
		anIntArray3482[i_1_] = class534_sub40.method16550((byte) -60);
	} else if (i != 3) {
	    if (40 == i) {
		int i_2_ = class534_sub40.method16527(1705282168);
		aShortArray3483 = new short[i_2_];
		aShortArray3484 = new short[i_2_];
		for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
		    aShortArray3483[i_3_]
			= (short) class534_sub40.method16529((byte) 1);
		    aShortArray3484[i_3_]
			= (short) class534_sub40.method16529((byte) 1);
		}
	    } else if (41 == i) {
		int i_4_ = class534_sub40.method16527(2090722802);
		aShortArray3485 = new short[i_4_];
		aShortArray3488 = new short[i_4_];
		for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
		    aShortArray3485[i_5_]
			= (short) class534_sub40.method16529((byte) 1);
		    aShortArray3488[i_5_]
			= (short) class534_sub40.method16529((byte) 1);
		}
	    } else if (i == 44) {
		int i_6_ = class534_sub40.method16529((byte) 1);
		int i_7_ = 0;
		for (int i_8_ = i_6_; i_8_ > 0; i_8_ >>= 1)
		    i_7_++;
		aByteArray3487 = new byte[i_7_];
		byte i_9_ = 0;
		for (int i_10_ = 0; i_10_ < i_7_; i_10_++) {
		    if ((i_6_ & 1 << i_10_) > 0) {
			aByteArray3487[i_10_] = i_9_;
			i_9_++;
		    } else
			aByteArray3487[i_10_] = (byte) -1;
		}
	    } else if (i == 45) {
		int i_11_ = class534_sub40.method16529((byte) 1);
		int i_12_ = 0;
		for (int i_13_ = i_11_; i_13_ > 0; i_13_ >>= 1)
		    i_12_++;
		aByteArray3491 = new byte[i_12_];
		byte i_14_ = 0;
		for (int i_15_ = 0; i_15_ < i_12_; i_15_++) {
		    if ((i_11_ & 1 << i_15_) > 0) {
			aByteArray3491[i_15_] = i_14_;
			i_14_++;
		    } else
			aByteArray3491[i_15_] = (byte) -1;
		}
	    } else if (i >= 60 && i < 70)
		anIntArray3481[i - 60] = class534_sub40.method16550((byte) -3);
	}
    }
    
    public void method79(Class534_Sub40 class534_sub40, byte i) {
	for (;;) {
	    int i_16_ = class534_sub40.method16527(-868103426);
	    if (0 == i_16_)
		break;
	    method5836(class534_sub40, i_16_, (byte) -34);
	}
    }
    
    void method5836(Class534_Sub40 class534_sub40, int i, byte i_17_) {
	if (i == 1)
	    class534_sub40.method16527(1824539932);
	else if (i == 2) {
	    int i_18_ = class534_sub40.method16527(1357245555);
	    anIntArray3482 = new int[i_18_];
	    for (int i_19_ = 0; i_19_ < i_18_; i_19_++)
		anIntArray3482[i_19_] = class534_sub40.method16550((byte) 49);
	} else if (i != 3) {
	    if (40 == i) {
		int i_20_ = class534_sub40.method16527(1818725989);
		aShortArray3483 = new short[i_20_];
		aShortArray3484 = new short[i_20_];
		for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
		    aShortArray3483[i_21_]
			= (short) class534_sub40.method16529((byte) 1);
		    aShortArray3484[i_21_]
			= (short) class534_sub40.method16529((byte) 1);
		}
	    } else if (41 == i) {
		int i_22_ = class534_sub40.method16527(-2060843857);
		aShortArray3485 = new short[i_22_];
		aShortArray3488 = new short[i_22_];
		for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
		    aShortArray3485[i_23_]
			= (short) class534_sub40.method16529((byte) 1);
		    aShortArray3488[i_23_]
			= (short) class534_sub40.method16529((byte) 1);
		}
	    } else if (i == 44) {
		int i_24_ = class534_sub40.method16529((byte) 1);
		int i_25_ = 0;
		for (int i_26_ = i_24_; i_26_ > 0; i_26_ >>= 1)
		    i_25_++;
		aByteArray3487 = new byte[i_25_];
		byte i_27_ = 0;
		for (int i_28_ = 0; i_28_ < i_25_; i_28_++) {
		    if ((i_24_ & 1 << i_28_) > 0) {
			aByteArray3487[i_28_] = i_27_;
			i_27_++;
		    } else
			aByteArray3487[i_28_] = (byte) -1;
		}
	    } else if (i == 45) {
		int i_29_ = class534_sub40.method16529((byte) 1);
		int i_30_ = 0;
		for (int i_31_ = i_29_; i_31_ > 0; i_31_ >>= 1)
		    i_30_++;
		aByteArray3491 = new byte[i_30_];
		byte i_32_ = 0;
		for (int i_33_ = 0; i_33_ < i_30_; i_33_++) {
		    if ((i_29_ & 1 << i_33_) > 0) {
			aByteArray3491[i_33_] = i_32_;
			i_32_++;
		    } else
			aByteArray3491[i_33_] = (byte) -1;
		}
	    } else if (i >= 60 && i < 70)
		anIntArray3481[i - 60] = class534_sub40.method16550((byte) 21);
	}
    }
    
    public boolean method5837() {
	boolean bool = true;
	synchronized (aClass472_3486) {
	    for (int i = 0; i < 5; i++) {
		if (-1 != anIntArray3481[i]
		    && !aClass472_3486.method7669(anIntArray3481[i], 0,
						  1804616883))
		    bool = false;
	    }
	}
	return bool;
    }
    
    public boolean method5838(int i) {
	if (null == anIntArray3482)
	    return true;
	boolean bool = true;
	synchronized (aClass472_3486) {
	    for (int i_34_ = 0; i_34_ < anIntArray3482.length; i_34_++) {
		if (!aClass472_3486.method7669(anIntArray3482[i_34_], 0,
					       1804616883))
		    bool = false;
	    }
	}
	return bool;
    }
    
    public Class187 method5839(int i) {
	if (anIntArray3482 == null)
	    return null;
	Class187[] class187s = new Class187[anIntArray3482.length];
	synchronized (aClass472_3486) {
	    for (int i_35_ = 0; i_35_ < anIntArray3482.length; i_35_++)
		class187s[i_35_]
		    = Class187.method3709(aClass472_3486,
					  anIntArray3482[i_35_], 0);
	}
	for (int i_36_ = 0; i_36_ < anIntArray3482.length; i_36_++) {
	    if (class187s[i_36_].anInt2082 < 13)
		class187s[i_36_].method3723(2);
	}
	Class187 class187;
	if (1 == class187s.length)
	    class187 = class187s[0];
	else
	    class187 = new Class187(class187s, class187s.length);
	if (class187 == null)
	    return null;
	if (null != aShortArray3483) {
	    for (int i_37_ = 0; i_37_ < aShortArray3483.length; i_37_++)
		class187.method3719(aShortArray3483[i_37_],
				    aShortArray3484[i_37_]);
	}
	if (null != aShortArray3485) {
	    for (int i_38_ = 0; i_38_ < aShortArray3485.length; i_38_++)
		class187.method3750(aShortArray3485[i_38_],
				    aShortArray3488[i_38_]);
	}
	return class187;
    }
    
    public boolean method5840(byte i) {
	boolean bool = true;
	synchronized (aClass472_3486) {
	    for (int i_39_ = 0; i_39_ < 5; i_39_++) {
		if (-1 != anIntArray3481[i_39_]
		    && !aClass472_3486.method7669(anIntArray3481[i_39_], 0,
						  1804616883))
		    bool = false;
	    }
	}
	return bool;
    }
    
    public Class187 method5841(byte i) {
	Class187[] class187s = new Class187[5];
	int i_40_ = 0;
	synchronized (aClass472_3486) {
	    for (int i_41_ = 0; i_41_ < 5; i_41_++) {
		if (anIntArray3481[i_41_] != -1)
		    class187s[i_40_++]
			= Class187.method3709(aClass472_3486,
					      anIntArray3481[i_41_], 0);
	    }
	}
	for (int i_42_ = 0; i_42_ < 5; i_42_++) {
	    if (null != class187s[i_42_] && class187s[i_42_].anInt2082 < 13)
		class187s[i_42_].method3723(2);
	}
	Class187 class187 = new Class187(class187s, i_40_);
	if (null != aShortArray3483) {
	    for (int i_43_ = 0; i_43_ < aShortArray3483.length; i_43_++)
		class187.method3719(aShortArray3483[i_43_],
				    aShortArray3484[i_43_]);
	}
	if (aShortArray3485 != null) {
	    for (int i_44_ = 0; i_44_ < aShortArray3485.length; i_44_++)
		class187.method3750(aShortArray3485[i_44_],
				    aShortArray3488[i_44_]);
	}
	return class187;
    }
    
    static {
	anIntArray3489 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };
    }
    
    Class330(int i, Class472 class472) {
	aClass472_3486 = class472;
    }
    
    public void method78(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(-1290878240);
	    if (0 == i)
		break;
	    method5836(class534_sub40, i, (byte) 37);
	}
    }
    
    public void method81(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(-991339250);
	    if (0 == i)
		break;
	    method5836(class534_sub40, i, (byte) 14);
	}
    }
    
    public void method83() {
	/* empty */
    }
    
    public Class187 method5842() {
	if (anIntArray3482 == null)
	    return null;
	Class187[] class187s = new Class187[anIntArray3482.length];
	synchronized (aClass472_3486) {
	    for (int i = 0; i < anIntArray3482.length; i++)
		class187s[i] = Class187.method3709(aClass472_3486,
						   anIntArray3482[i], 0);
	}
	for (int i = 0; i < anIntArray3482.length; i++) {
	    if (class187s[i].anInt2082 < 13)
		class187s[i].method3723(2);
	}
	Class187 class187;
	if (1 == class187s.length)
	    class187 = class187s[0];
	else
	    class187 = new Class187(class187s, class187s.length);
	if (class187 == null)
	    return null;
	if (null != aShortArray3483) {
	    for (int i = 0; i < aShortArray3483.length; i++)
		class187.method3719(aShortArray3483[i], aShortArray3484[i]);
	}
	if (null != aShortArray3485) {
	    for (int i = 0; i < aShortArray3485.length; i++)
		class187.method3750(aShortArray3485[i], aShortArray3488[i]);
	}
	return class187;
    }
    
    public boolean method5843() {
	if (null == anIntArray3482)
	    return true;
	boolean bool = true;
	synchronized (aClass472_3486) {
	    for (int i = 0; i < anIntArray3482.length; i++) {
		if (!aClass472_3486.method7669(anIntArray3482[i], 0,
					       1804616883))
		    bool = false;
	    }
	}
	return bool;
    }
    
    void method5844(Class534_Sub40 class534_sub40, int i) {
	if (i == 1)
	    class534_sub40.method16527(-1583654473);
	else if (i == 2) {
	    int i_45_ = class534_sub40.method16527(1496204134);
	    anIntArray3482 = new int[i_45_];
	    for (int i_46_ = 0; i_46_ < i_45_; i_46_++)
		anIntArray3482[i_46_] = class534_sub40.method16550((byte) -70);
	} else if (i != 3) {
	    if (40 == i) {
		int i_47_ = class534_sub40.method16527(1039143613);
		aShortArray3483 = new short[i_47_];
		aShortArray3484 = new short[i_47_];
		for (int i_48_ = 0; i_48_ < i_47_; i_48_++) {
		    aShortArray3483[i_48_]
			= (short) class534_sub40.method16529((byte) 1);
		    aShortArray3484[i_48_]
			= (short) class534_sub40.method16529((byte) 1);
		}
	    } else if (41 == i) {
		int i_49_ = class534_sub40.method16527(-571810954);
		aShortArray3485 = new short[i_49_];
		aShortArray3488 = new short[i_49_];
		for (int i_50_ = 0; i_50_ < i_49_; i_50_++) {
		    aShortArray3485[i_50_]
			= (short) class534_sub40.method16529((byte) 1);
		    aShortArray3488[i_50_]
			= (short) class534_sub40.method16529((byte) 1);
		}
	    } else if (i == 44) {
		int i_51_ = class534_sub40.method16529((byte) 1);
		int i_52_ = 0;
		for (int i_53_ = i_51_; i_53_ > 0; i_53_ >>= 1)
		    i_52_++;
		aByteArray3487 = new byte[i_52_];
		byte i_54_ = 0;
		for (int i_55_ = 0; i_55_ < i_52_; i_55_++) {
		    if ((i_51_ & 1 << i_55_) > 0) {
			aByteArray3487[i_55_] = i_54_;
			i_54_++;
		    } else
			aByteArray3487[i_55_] = (byte) -1;
		}
	    } else if (i == 45) {
		int i_56_ = class534_sub40.method16529((byte) 1);
		int i_57_ = 0;
		for (int i_58_ = i_56_; i_58_ > 0; i_58_ >>= 1)
		    i_57_++;
		aByteArray3491 = new byte[i_57_];
		byte i_59_ = 0;
		for (int i_60_ = 0; i_60_ < i_57_; i_60_++) {
		    if ((i_56_ & 1 << i_60_) > 0) {
			aByteArray3491[i_60_] = i_59_;
			i_59_++;
		    } else
			aByteArray3491[i_60_] = (byte) -1;
		}
	    } else if (i >= 60 && i < 70)
		anIntArray3481[i - 60]
		    = class534_sub40.method16550((byte) -52);
	}
    }
    
    public boolean method5845() {
	if (null == anIntArray3482)
	    return true;
	boolean bool = true;
	synchronized (aClass472_3486) {
	    for (int i = 0; i < anIntArray3482.length; i++) {
		if (!aClass472_3486.method7669(anIntArray3482[i], 0,
					       1804616883))
		    bool = false;
	    }
	}
	return bool;
    }
    
    public Class187 method5846() {
	Class187[] class187s = new Class187[5];
	int i = 0;
	synchronized (aClass472_3486) {
	    for (int i_61_ = 0; i_61_ < 5; i_61_++) {
		if (anIntArray3481[i_61_] != -1)
		    class187s[i++]
			= Class187.method3709(aClass472_3486,
					      anIntArray3481[i_61_], 0);
	    }
	}
	for (int i_62_ = 0; i_62_ < 5; i_62_++) {
	    if (null != class187s[i_62_] && class187s[i_62_].anInt2082 < 13)
		class187s[i_62_].method3723(2);
	}
	Class187 class187 = new Class187(class187s, i);
	if (null != aShortArray3483) {
	    for (int i_63_ = 0; i_63_ < aShortArray3483.length; i_63_++)
		class187.method3719(aShortArray3483[i_63_],
				    aShortArray3484[i_63_]);
	}
	if (aShortArray3485 != null) {
	    for (int i_64_ = 0; i_64_ < aShortArray3485.length; i_64_++)
		class187.method3750(aShortArray3485[i_64_],
				    aShortArray3488[i_64_]);
	}
	return class187;
    }
    
    public boolean method5847() {
	if (null == anIntArray3482)
	    return true;
	boolean bool = true;
	synchronized (aClass472_3486) {
	    for (int i = 0; i < anIntArray3482.length; i++) {
		if (!aClass472_3486.method7669(anIntArray3482[i], 0,
					       1804616883))
		    bool = false;
	    }
	}
	return bool;
    }
    
    public Class187 method5848() {
	if (anIntArray3482 == null)
	    return null;
	Class187[] class187s = new Class187[anIntArray3482.length];
	synchronized (aClass472_3486) {
	    for (int i = 0; i < anIntArray3482.length; i++)
		class187s[i] = Class187.method3709(aClass472_3486,
						   anIntArray3482[i], 0);
	}
	for (int i = 0; i < anIntArray3482.length; i++) {
	    if (class187s[i].anInt2082 < 13)
		class187s[i].method3723(2);
	}
	Class187 class187;
	if (1 == class187s.length)
	    class187 = class187s[0];
	else
	    class187 = new Class187(class187s, class187s.length);
	if (class187 == null)
	    return null;
	if (null != aShortArray3483) {
	    for (int i = 0; i < aShortArray3483.length; i++)
		class187.method3719(aShortArray3483[i], aShortArray3484[i]);
	}
	if (null != aShortArray3485) {
	    for (int i = 0; i < aShortArray3485.length; i++)
		class187.method3750(aShortArray3485[i], aShortArray3488[i]);
	}
	return class187;
    }
    
    public Class187 method5849() {
	if (anIntArray3482 == null)
	    return null;
	Class187[] class187s = new Class187[anIntArray3482.length];
	synchronized (aClass472_3486) {
	    for (int i = 0; i < anIntArray3482.length; i++)
		class187s[i] = Class187.method3709(aClass472_3486,
						   anIntArray3482[i], 0);
	}
	for (int i = 0; i < anIntArray3482.length; i++) {
	    if (class187s[i].anInt2082 < 13)
		class187s[i].method3723(2);
	}
	Class187 class187;
	if (1 == class187s.length)
	    class187 = class187s[0];
	else
	    class187 = new Class187(class187s, class187s.length);
	if (class187 == null)
	    return null;
	if (null != aShortArray3483) {
	    for (int i = 0; i < aShortArray3483.length; i++)
		class187.method3719(aShortArray3483[i], aShortArray3484[i]);
	}
	if (null != aShortArray3485) {
	    for (int i = 0; i < aShortArray3485.length; i++)
		class187.method3750(aShortArray3485[i], aShortArray3488[i]);
	}
	return class187;
    }
    
    public void method82(int i) {
	/* empty */
    }
    
    public void method80(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(-452938033);
	    if (0 == i)
		break;
	    method5836(class534_sub40, i, (byte) -38);
	}
    }
    
    public Class187 method5850() {
	Class187[] class187s = new Class187[5];
	int i = 0;
	synchronized (aClass472_3486) {
	    for (int i_65_ = 0; i_65_ < 5; i_65_++) {
		if (anIntArray3481[i_65_] != -1)
		    class187s[i++]
			= Class187.method3709(aClass472_3486,
					      anIntArray3481[i_65_], 0);
	    }
	}
	for (int i_66_ = 0; i_66_ < 5; i_66_++) {
	    if (null != class187s[i_66_] && class187s[i_66_].anInt2082 < 13)
		class187s[i_66_].method3723(2);
	}
	Class187 class187 = new Class187(class187s, i);
	if (null != aShortArray3483) {
	    for (int i_67_ = 0; i_67_ < aShortArray3483.length; i_67_++)
		class187.method3719(aShortArray3483[i_67_],
				    aShortArray3484[i_67_]);
	}
	if (aShortArray3485 != null) {
	    for (int i_68_ = 0; i_68_ < aShortArray3485.length; i_68_++)
		class187.method3750(aShortArray3485[i_68_],
				    aShortArray3488[i_68_]);
	}
	return class187;
    }
    
    public Class187 method5851() {
	Class187[] class187s = new Class187[5];
	int i = 0;
	synchronized (aClass472_3486) {
	    for (int i_69_ = 0; i_69_ < 5; i_69_++) {
		if (anIntArray3481[i_69_] != -1)
		    class187s[i++]
			= Class187.method3709(aClass472_3486,
					      anIntArray3481[i_69_], 0);
	    }
	}
	for (int i_70_ = 0; i_70_ < 5; i_70_++) {
	    if (null != class187s[i_70_] && class187s[i_70_].anInt2082 < 13)
		class187s[i_70_].method3723(2);
	}
	Class187 class187 = new Class187(class187s, i);
	if (null != aShortArray3483) {
	    for (int i_71_ = 0; i_71_ < aShortArray3483.length; i_71_++)
		class187.method3719(aShortArray3483[i_71_],
				    aShortArray3484[i_71_]);
	}
	if (aShortArray3485 != null) {
	    for (int i_72_ = 0; i_72_ < aShortArray3485.length; i_72_++)
		class187.method3750(aShortArray3485[i_72_],
				    aShortArray3488[i_72_]);
	}
	return class187;
    }
    
    public void method84() {
	/* empty */
    }
    
    static final void method5852(Class669 class669, int i) {
	class669.anInt8613
	    += (class669.anIntArray8591[class669.anInt8613 * 662605117]
		* -793595371);
    }
    
    static final void method5853(Class669 class669, int i) {
	int i_73_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_73_, 1867970773);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class247.anInt2469 * -1279656873;
    }
    
    static final void method5854(Class669 class669, int i) {
	int i_74_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub20_10742
		  .method14026(i_74_, -2024064741);
    }
    
    static final boolean method5855(char c, short i) {
	return '\u00a0' == c || c == ' ' || '_' == c || c == '-';
    }
}
