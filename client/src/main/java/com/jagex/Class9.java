/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public final class Class9 implements Iterable
{
    long aLong62;
    Class534[] aClass534Array63;
    int anInt64;
    Class534 aClass534_65;
    Class534 aClass534_66;
    int anInt67 = 0;
    
    public void method577() {
	for (int i = 0; i < -393701507 * anInt64; i++) {
	    Class534 class534 = aClass534Array63[i];
	    for (;;) {
		Class534 class534_0_ = class534.aClass534_7159;
		if (class534_0_ == class534)
		    break;
		class534_0_.method8892((byte) 1);
	    }
	}
	aClass534_66 = null;
	aClass534_65 = null;
    }
    
    public void method578(byte i) {
	for (int i_1_ = 0; i_1_ < -393701507 * anInt64; i_1_++) {
	    Class534 class534 = aClass534Array63[i_1_];
	    for (;;) {
		Class534 class534_2_ = class534.aClass534_7159;
		if (class534_2_ == class534)
		    break;
		class534_2_.method8892((byte) 1);
	    }
	}
	aClass534_66 = null;
	aClass534_65 = null;
    }
    
    public Class534 method579(long l) {
	aLong62 = -8092187468332480431L * l;
	Class534 class534
	    = aClass534Array63[(int) (l & (long) (anInt64 * -393701507 - 1))];
	for (aClass534_66 = class534.aClass534_7159; aClass534_66 != class534;
	     aClass534_66 = aClass534_66.aClass534_7159) {
	    if (aClass534_66.aLong7158 * 8258869577519436579L == l) {
		Class534 class534_3_ = aClass534_66;
		aClass534_66 = aClass534_66.aClass534_7159;
		return class534_3_;
	    }
	}
	aClass534_66 = null;
	return null;
    }
    
    public int method580(Class534[] class534s, byte i) {
	int i_4_ = 0;
	for (int i_5_ = 0; i_5_ < anInt64 * -393701507; i_5_++) {
	    Class534 class534 = aClass534Array63[i_5_];
	    for (Class534 class534_6_ = class534.aClass534_7159;
		 class534_6_ != class534;
		 class534_6_ = class534_6_.aClass534_7159)
		class534s[i_4_++] = class534_6_;
	}
	return i_4_;
    }
    
    public void method581(Class534 class534, long l) {
	if (null != class534.aClass534_7157)
	    class534.method8892((byte) 1);
	Class534 class534_7_
	    = aClass534Array63[(int) (l & (long) (anInt64 * -393701507 - 1))];
	class534.aClass534_7157 = class534_7_.aClass534_7157;
	class534.aClass534_7159 = class534_7_;
	class534.aClass534_7157.aClass534_7159 = class534;
	class534.aClass534_7159.aClass534_7157 = class534;
	class534.aLong7158 = l * 936217890172187787L;
    }
    
    public Class9(int i) {
	anInt64 = i * 1384503765;
	aClass534Array63 = new Class534[i];
	for (int i_8_ = 0; i_8_ < i; i_8_++) {
	    Class534 class534 = aClass534Array63[i_8_] = new Class534();
	    class534.aClass534_7159 = class534;
	    class534.aClass534_7157 = class534;
	}
    }
    
    public Class534 method582(int i) {
	if (aClass534_66 == null)
	    return null;
	for (Class534 class534
		 = aClass534Array63[(int) (aLong62 * 3173543863542448305L
					   & (long) (anInt64 * -393701507
						     - 1))];
	     aClass534_66 != class534;
	     aClass534_66 = aClass534_66.aClass534_7159) {
	    if (aLong62 * 3173543863542448305L
		== aClass534_66.aLong7158 * 8258869577519436579L) {
		Class534 class534_9_ = aClass534_66;
		aClass534_66 = aClass534_66.aClass534_7159;
		return class534_9_;
	    }
	}
	aClass534_66 = null;
	return null;
    }
    
    public Class534 method583(int i) {
	anInt67 = 0;
	return method584((byte) -36);
    }
    
    public Class534 method584(byte i) {
	if (anInt67 * -830469435 > 0
	    && aClass534_65 != aClass534Array63[anInt67 * -830469435 - 1]) {
	    Class534 class534 = aClass534_65;
	    aClass534_65 = class534.aClass534_7159;
	    return class534;
	}
	while (-830469435 * anInt67 < anInt64 * -393701507) {
	    Class534 class534
		= (aClass534Array63[(anInt67 += -792140787) * -830469435 - 1]
		   .aClass534_7159);
	    if (aClass534Array63[anInt67 * -830469435 - 1] != class534) {
		aClass534_65 = class534.aClass534_7159;
		return class534;
	    }
	}
	return null;
    }
    
    public Class534 method585() {
	if (anInt67 * -830469435 > 0
	    && aClass534_65 != aClass534Array63[anInt67 * -830469435 - 1]) {
	    Class534 class534 = aClass534_65;
	    aClass534_65 = class534.aClass534_7159;
	    return class534;
	}
	while (-830469435 * anInt67 < anInt64 * -393701507) {
	    Class534 class534
		= (aClass534Array63[(anInt67 += -792140787) * -830469435 - 1]
		   .aClass534_7159);
	    if (aClass534Array63[anInt67 * -830469435 - 1] != class534) {
		aClass534_65 = class534.aClass534_7159;
		return class534;
	    }
	}
	return null;
    }
    
    public Iterator method586() {
	return new Class18(this);
    }
    
    public Iterator method587() {
	return new Class18(this);
    }
    
    public Class534 method588(long l) {
	aLong62 = -8092187468332480431L * l;
	Class534 class534
	    = aClass534Array63[(int) (l & (long) (anInt64 * -393701507 - 1))];
	for (aClass534_66 = class534.aClass534_7159; aClass534_66 != class534;
	     aClass534_66 = aClass534_66.aClass534_7159) {
	    if (aClass534_66.aLong7158 * 8258869577519436579L == l) {
		Class534 class534_10_ = aClass534_66;
		aClass534_66 = aClass534_66.aClass534_7159;
		return class534_10_;
	    }
	}
	aClass534_66 = null;
	return null;
    }
    
    public Class534 method589(long l) {
	aLong62 = -8092187468332480431L * l;
	Class534 class534
	    = aClass534Array63[(int) (l & (long) (anInt64 * -393701507 - 1))];
	for (aClass534_66 = class534.aClass534_7159; aClass534_66 != class534;
	     aClass534_66 = aClass534_66.aClass534_7159) {
	    if (aClass534_66.aLong7158 * 8258869577519436579L == l) {
		Class534 class534_11_ = aClass534_66;
		aClass534_66 = aClass534_66.aClass534_7159;
		return class534_11_;
	    }
	}
	aClass534_66 = null;
	return null;
    }
    
    public Iterator iterator() {
	return new Class18(this);
    }
    
    public Class534 method590() {
	if (aClass534_66 == null)
	    return null;
	for (Class534 class534
		 = aClass534Array63[(int) (aLong62 * 3173543863542448305L
					   & (long) (anInt64 * -393701507
						     - 1))];
	     aClass534_66 != class534;
	     aClass534_66 = aClass534_66.aClass534_7159) {
	    if (aLong62 * 3173543863542448305L
		== aClass534_66.aLong7158 * 8258869577519436579L) {
		Class534 class534_12_ = aClass534_66;
		aClass534_66 = aClass534_66.aClass534_7159;
		return class534_12_;
	    }
	}
	aClass534_66 = null;
	return null;
    }
    
    public Class534 method591() {
	if (aClass534_66 == null)
	    return null;
	for (Class534 class534
		 = aClass534Array63[(int) (aLong62 * 3173543863542448305L
					   & (long) (anInt64 * -393701507
						     - 1))];
	     aClass534_66 != class534;
	     aClass534_66 = aClass534_66.aClass534_7159) {
	    if (aLong62 * 3173543863542448305L
		== aClass534_66.aLong7158 * 8258869577519436579L) {
		Class534 class534_13_ = aClass534_66;
		aClass534_66 = aClass534_66.aClass534_7159;
		return class534_13_;
	    }
	}
	aClass534_66 = null;
	return null;
    }
    
    public int method592(Class534[] class534s) {
	int i = 0;
	for (int i_14_ = 0; i_14_ < anInt64 * -393701507; i_14_++) {
	    Class534 class534 = aClass534Array63[i_14_];
	    for (Class534 class534_15_ = class534.aClass534_7159;
		 class534_15_ != class534;
		 class534_15_ = class534_15_.aClass534_7159)
		class534s[i++] = class534_15_;
	}
	return i;
    }
    
    public int method593() {
	int i = 0;
	for (int i_16_ = 0; i_16_ < -393701507 * anInt64; i_16_++) {
	    Class534 class534 = aClass534Array63[i_16_];
	    for (Class534 class534_17_ = class534.aClass534_7159;
		 class534_17_ != class534;
		 class534_17_ = class534_17_.aClass534_7159)
		i++;
	}
	return i;
    }
    
    public void method594(Class534 class534, long l) {
	if (null != class534.aClass534_7157)
	    class534.method8892((byte) 1);
	Class534 class534_18_
	    = aClass534Array63[(int) (l & (long) (anInt64 * -393701507 - 1))];
	class534.aClass534_7157 = class534_18_.aClass534_7157;
	class534.aClass534_7159 = class534_18_;
	class534.aClass534_7157.aClass534_7159 = class534;
	class534.aClass534_7159.aClass534_7157 = class534;
	class534.aLong7158 = l * 936217890172187787L;
    }
    
    public void method595(Class534 class534, long l) {
	if (null != class534.aClass534_7157)
	    class534.method8892((byte) 1);
	Class534 class534_19_
	    = aClass534Array63[(int) (l & (long) (anInt64 * -393701507 - 1))];
	class534.aClass534_7157 = class534_19_.aClass534_7157;
	class534.aClass534_7159 = class534_19_;
	class534.aClass534_7157.aClass534_7159 = class534;
	class534.aClass534_7159.aClass534_7157 = class534;
	class534.aLong7158 = l * 936217890172187787L;
    }
    
    public Class534 method596() {
	if (anInt67 * -830469435 > 0
	    && aClass534_65 != aClass534Array63[anInt67 * -830469435 - 1]) {
	    Class534 class534 = aClass534_65;
	    aClass534_65 = class534.aClass534_7159;
	    return class534;
	}
	while (-830469435 * anInt67 < anInt64 * -393701507) {
	    Class534 class534
		= (aClass534Array63[(anInt67 += -792140787) * -830469435 - 1]
		   .aClass534_7159);
	    if (aClass534Array63[anInt67 * -830469435 - 1] != class534) {
		aClass534_65 = class534.aClass534_7159;
		return class534;
	    }
	}
	return null;
    }
    
    public void method597() {
	for (int i = 0; i < -393701507 * anInt64; i++) {
	    Class534 class534 = aClass534Array63[i];
	    for (;;) {
		Class534 class534_20_ = class534.aClass534_7159;
		if (class534_20_ == class534)
		    break;
		class534_20_.method8892((byte) 1);
	    }
	}
	aClass534_66 = null;
	aClass534_65 = null;
    }
    
    public Class534 method598() {
	anInt67 = 0;
	return method584((byte) -66);
    }
    
    public Class534 method599() {
	if (aClass534_66 == null)
	    return null;
	for (Class534 class534
		 = aClass534Array63[(int) (aLong62 * 3173543863542448305L
					   & (long) (anInt64 * -393701507
						     - 1))];
	     aClass534_66 != class534;
	     aClass534_66 = aClass534_66.aClass534_7159) {
	    if (aLong62 * 3173543863542448305L
		== aClass534_66.aLong7158 * 8258869577519436579L) {
		Class534 class534_21_ = aClass534_66;
		aClass534_66 = aClass534_66.aClass534_7159;
		return class534_21_;
	    }
	}
	aClass534_66 = null;
	return null;
    }
    
    public int method600(int i) {
	int i_22_ = 0;
	for (int i_23_ = 0; i_23_ < -393701507 * anInt64; i_23_++) {
	    Class534 class534 = aClass534Array63[i_23_];
	    for (Class534 class534_24_ = class534.aClass534_7159;
		 class534_24_ != class534;
		 class534_24_ = class534_24_.aClass534_7159)
		i_22_++;
	}
	return i_22_;
    }
    
    public Class534 method601() {
	if (anInt67 * -830469435 > 0
	    && aClass534_65 != aClass534Array63[anInt67 * -830469435 - 1]) {
	    Class534 class534 = aClass534_65;
	    aClass534_65 = class534.aClass534_7159;
	    return class534;
	}
	while (-830469435 * anInt67 < anInt64 * -393701507) {
	    Class534 class534
		= (aClass534Array63[(anInt67 += -792140787) * -830469435 - 1]
		   .aClass534_7159);
	    if (aClass534Array63[anInt67 * -830469435 - 1] != class534) {
		aClass534_65 = class534.aClass534_7159;
		return class534;
	    }
	}
	return null;
    }
    
    static void method602(int i, int i_25_, int i_26_, boolean bool, int i_27_,
			  boolean bool_28_, byte i_29_) {
	if (i < i_25_) {
	    int i_30_ = (i_25_ + i) / 2;
	    int i_31_ = i;
	    Class606_Sub1 class606_sub1 = Class5.aClass606_Sub1Array42[i_30_];
	    Class5.aClass606_Sub1Array42[i_30_]
		= Class5.aClass606_Sub1Array42[i_25_];
	    Class5.aClass606_Sub1Array42[i_25_] = class606_sub1;
	    for (int i_32_ = i; i_32_ < i_25_; i_32_++) {
		if (Class12.method637(Class5.aClass606_Sub1Array42[i_32_],
				      class606_sub1, i_26_, bool, i_27_,
				      bool_28_, (byte) 63)
		    <= 0) {
		    Class606_Sub1 class606_sub1_33_
			= Class5.aClass606_Sub1Array42[i_32_];
		    Class5.aClass606_Sub1Array42[i_32_]
			= Class5.aClass606_Sub1Array42[i_31_];
		    Class5.aClass606_Sub1Array42[i_31_++] = class606_sub1_33_;
		}
	    }
	    Class5.aClass606_Sub1Array42[i_25_]
		= Class5.aClass606_Sub1Array42[i_31_];
	    Class5.aClass606_Sub1Array42[i_31_] = class606_sub1;
	    method602(i, i_31_ - 1, i_26_, bool, i_27_, bool_28_, (byte) 34);
	    method602(i_31_ + 1, i_25_, i_26_, bool, i_27_, bool_28_,
		      (byte) 44);
	}
    }
}
