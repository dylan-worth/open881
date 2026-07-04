/* Class77 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

public final class Class77
{
    int anInt815;
    WeakReference_Sub1[] aWeakReference_Sub1Array816;
    ReferenceQueue aReferenceQueue817 = new ReferenceQueue();
    static int anInt818;
    public static Class155_Sub1 aClass155_Sub1_819;
    static int anInt820;
    
    public void method1592(Object object) {
	if (object == null)
	    throw new NullPointerException();
	method1597(-1217527062);
	int i = System.identityHashCode(object);
	int i_0_ = i & aWeakReference_Sub1Array816.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = aWeakReference_Sub1Array816[i_0_];
	if (weakreference_sub1 != null) {
	    if (weakreference_sub1.get() == object) {
		aWeakReference_Sub1Array816[i_0_]
		    = weakreference_sub1.aWeakReference_Sub1_11916;
		anInt815 -= 346731323;
	    } else {
		for (;;) {
		    WeakReference_Sub1 weakreference_sub1_1_
			= weakreference_sub1.aWeakReference_Sub1_11916;
		    if (weakreference_sub1_1_ == null)
			break;
		    if (weakreference_sub1_1_.get() == object) {
			weakreference_sub1.aWeakReference_Sub1_11916
			    = weakreference_sub1_1_.aWeakReference_Sub1_11916;
			anInt815 -= 346731323;
			break;
		    }
		    weakreference_sub1 = weakreference_sub1_1_;
		}
	    }
	}
    }
    
    public void method1593(Object object, Object object_2_, byte i) {
	if (object == null)
	    throw new NullPointerException();
	method1597(1332584296);
	int i_3_ = System.identityHashCode(object);
	int i_4_ = i_3_ & aWeakReference_Sub1Array816.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = aWeakReference_Sub1Array816[i_4_];
	if (weakreference_sub1 == null) {
	    aWeakReference_Sub1Array816[i_4_]
		= new WeakReference_Sub1(object, aReferenceQueue817, i_3_,
					 object_2_);
	    anInt815 += 346731323;
	    if (anInt815 * 620473843 >= aWeakReference_Sub1Array816.length)
		method1605((byte) 35);
	} else {
	    for (/**/; weakreference_sub1.get() != object;
		 weakreference_sub1
		     = weakreference_sub1.aWeakReference_Sub1_11916) {
		if (weakreference_sub1.aWeakReference_Sub1_11916 == null) {
		    weakreference_sub1.aWeakReference_Sub1_11916
			= new WeakReference_Sub1(object, aReferenceQueue817,
						 i_3_, object_2_);
		    anInt815 += 346731323;
		    if (anInt815 * 620473843
			>= aWeakReference_Sub1Array816.length)
			method1605((byte) -10);
		    break;
		}
	    }
	}
    }
    
    public void method1594(Object object, Object object_5_) {
	if (object == null)
	    throw new NullPointerException();
	method1597(143351624);
	int i = System.identityHashCode(object);
	int i_6_ = i & aWeakReference_Sub1Array816.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = aWeakReference_Sub1Array816[i_6_];
	if (weakreference_sub1 == null) {
	    aWeakReference_Sub1Array816[i_6_]
		= new WeakReference_Sub1(object, aReferenceQueue817, i,
					 object_5_);
	    anInt815 += 346731323;
	    if (anInt815 * 620473843 >= aWeakReference_Sub1Array816.length)
		method1605((byte) 20);
	} else {
	    for (/**/; weakreference_sub1.get() != object;
		 weakreference_sub1
		     = weakreference_sub1.aWeakReference_Sub1_11916) {
		if (weakreference_sub1.aWeakReference_Sub1_11916 == null) {
		    weakreference_sub1.aWeakReference_Sub1_11916
			= new WeakReference_Sub1(object, aReferenceQueue817, i,
						 object_5_);
		    anInt815 += 346731323;
		    if (anInt815 * 620473843
			>= aWeakReference_Sub1Array816.length)
			method1605((byte) -10);
		    break;
		}
	    }
	}
    }
    
    public ArrayList method1595(int i) {
	method1597(-1225717413);
	ArrayList arraylist = new ArrayList(anInt815 * 620473843);
	WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array816;
	for (int i_7_ = 0; i_7_ < weakreference_sub1s.length; i_7_++) {
	    for (WeakReference_Sub1 weakreference_sub1
		     = weakreference_sub1s[i_7_];
		 null != weakreference_sub1;
		 weakreference_sub1
		     = weakreference_sub1.aWeakReference_Sub1_11916) {
		Object object = weakreference_sub1.get();
		if (null != object)
		    arraylist.add(object);
	    }
	}
	return arraylist;
    }
    
    public void method1596(Object object) {
	if (object == null)
	    throw new NullPointerException();
	method1597(150817401);
	int i = System.identityHashCode(object);
	int i_8_ = i & aWeakReference_Sub1Array816.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = aWeakReference_Sub1Array816[i_8_];
	if (weakreference_sub1 != null) {
	    if (weakreference_sub1.get() == object) {
		aWeakReference_Sub1Array816[i_8_]
		    = weakreference_sub1.aWeakReference_Sub1_11916;
		anInt815 -= 346731323;
	    } else {
		for (;;) {
		    WeakReference_Sub1 weakreference_sub1_9_
			= weakreference_sub1.aWeakReference_Sub1_11916;
		    if (weakreference_sub1_9_ == null)
			break;
		    if (weakreference_sub1_9_.get() == object) {
			weakreference_sub1.aWeakReference_Sub1_11916
			    = weakreference_sub1_9_.aWeakReference_Sub1_11916;
			anInt815 -= 346731323;
			break;
		    }
		    weakreference_sub1 = weakreference_sub1_9_;
		}
	    }
	}
    }
    
    void method1597(int i) {
	for (;;) {
	    WeakReference_Sub1 weakreference_sub1
		= (WeakReference_Sub1) aReferenceQueue817.poll();
	    if (weakreference_sub1 == null)
		break;
	    int i_10_ = (weakreference_sub1.anInt11917 * -1436277177
			 & aWeakReference_Sub1Array816.length - 1);
	    WeakReference_Sub1 weakreference_sub1_11_
		= aWeakReference_Sub1Array816[i_10_];
	    if (weakreference_sub1_11_ == weakreference_sub1) {
		aWeakReference_Sub1Array816[i_10_]
		    = weakreference_sub1.aWeakReference_Sub1_11916;
		anInt815 -= 346731323;
	    } else {
		for (/**/;
		     (null != weakreference_sub1_11_
		      && weakreference_sub1 != (weakreference_sub1_11_
						.aWeakReference_Sub1_11916));
		     weakreference_sub1_11_
			 = weakreference_sub1_11_.aWeakReference_Sub1_11916) {
		    /* empty */
		}
		if (weakreference_sub1_11_ != null) {
		    weakreference_sub1_11_.aWeakReference_Sub1_11916
			= weakreference_sub1.aWeakReference_Sub1_11916;
		    anInt815 -= 346731323;
		}
	    }
	}
    }
    
    public void method1598(Object object, Object object_12_) {
	if (object == null)
	    throw new NullPointerException();
	method1597(1264786881);
	int i = System.identityHashCode(object);
	int i_13_ = i & aWeakReference_Sub1Array816.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = aWeakReference_Sub1Array816[i_13_];
	if (weakreference_sub1 == null) {
	    aWeakReference_Sub1Array816[i_13_]
		= new WeakReference_Sub1(object, aReferenceQueue817, i,
					 object_12_);
	    anInt815 += 346731323;
	    if (anInt815 * 620473843 >= aWeakReference_Sub1Array816.length)
		method1605((byte) 100);
	} else {
	    for (/**/; weakreference_sub1.get() != object;
		 weakreference_sub1
		     = weakreference_sub1.aWeakReference_Sub1_11916) {
		if (weakreference_sub1.aWeakReference_Sub1_11916 == null) {
		    weakreference_sub1.aWeakReference_Sub1_11916
			= new WeakReference_Sub1(object, aReferenceQueue817, i,
						 object_12_);
		    anInt815 += 346731323;
		    if (anInt815 * 620473843
			>= aWeakReference_Sub1Array816.length)
			method1605((byte) 60);
		    break;
		}
	    }
	}
    }
    
    public void method1599(Object object, byte i) {
	if (object == null)
	    throw new NullPointerException();
	method1597(-924443551);
	int i_14_ = System.identityHashCode(object);
	int i_15_ = i_14_ & aWeakReference_Sub1Array816.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = aWeakReference_Sub1Array816[i_15_];
	if (weakreference_sub1 != null) {
	    if (weakreference_sub1.get() == object) {
		aWeakReference_Sub1Array816[i_15_]
		    = weakreference_sub1.aWeakReference_Sub1_11916;
		anInt815 -= 346731323;
	    } else {
		for (;;) {
		    WeakReference_Sub1 weakreference_sub1_16_
			= weakreference_sub1.aWeakReference_Sub1_11916;
		    if (weakreference_sub1_16_ == null)
			break;
		    if (weakreference_sub1_16_.get() == object) {
			weakreference_sub1.aWeakReference_Sub1_11916
			    = weakreference_sub1_16_.aWeakReference_Sub1_11916;
			anInt815 -= 346731323;
			break;
		    }
		    weakreference_sub1 = weakreference_sub1_16_;
		}
	    }
	}
    }
    
    public void method1600(Object object, Object object_17_) {
	if (object == null)
	    throw new NullPointerException();
	method1597(-1009020586);
	int i = System.identityHashCode(object);
	int i_18_ = i & aWeakReference_Sub1Array816.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = aWeakReference_Sub1Array816[i_18_];
	if (weakreference_sub1 == null) {
	    aWeakReference_Sub1Array816[i_18_]
		= new WeakReference_Sub1(object, aReferenceQueue817, i,
					 object_17_);
	    anInt815 += 346731323;
	    if (anInt815 * 620473843 >= aWeakReference_Sub1Array816.length)
		method1605((byte) 69);
	} else {
	    for (/**/; weakreference_sub1.get() != object;
		 weakreference_sub1
		     = weakreference_sub1.aWeakReference_Sub1_11916) {
		if (weakreference_sub1.aWeakReference_Sub1_11916 == null) {
		    weakreference_sub1.aWeakReference_Sub1_11916
			= new WeakReference_Sub1(object, aReferenceQueue817, i,
						 object_17_);
		    anInt815 += 346731323;
		    if (anInt815 * 620473843
			>= aWeakReference_Sub1Array816.length)
			method1605((byte) -19);
		    break;
		}
	    }
	}
    }
    
    public void method1601(Object object, Object object_19_) {
	if (object == null)
	    throw new NullPointerException();
	method1597(-2108051567);
	int i = System.identityHashCode(object);
	int i_20_ = i & aWeakReference_Sub1Array816.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = aWeakReference_Sub1Array816[i_20_];
	if (weakreference_sub1 == null) {
	    aWeakReference_Sub1Array816[i_20_]
		= new WeakReference_Sub1(object, aReferenceQueue817, i,
					 object_19_);
	    anInt815 += 346731323;
	    if (anInt815 * 620473843 >= aWeakReference_Sub1Array816.length)
		method1605((byte) -84);
	} else {
	    for (/**/; weakreference_sub1.get() != object;
		 weakreference_sub1
		     = weakreference_sub1.aWeakReference_Sub1_11916) {
		if (weakreference_sub1.aWeakReference_Sub1_11916 == null) {
		    weakreference_sub1.aWeakReference_Sub1_11916
			= new WeakReference_Sub1(object, aReferenceQueue817, i,
						 object_19_);
		    anInt815 += 346731323;
		    if (anInt815 * 620473843
			>= aWeakReference_Sub1Array816.length)
			method1605((byte) -16);
		    break;
		}
	    }
	}
    }
    
    public void method1602(Object object) {
	if (object == null)
	    throw new NullPointerException();
	method1597(733824298);
	int i = System.identityHashCode(object);
	int i_21_ = i & aWeakReference_Sub1Array816.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = aWeakReference_Sub1Array816[i_21_];
	if (weakreference_sub1 != null) {
	    if (weakreference_sub1.get() == object) {
		aWeakReference_Sub1Array816[i_21_]
		    = weakreference_sub1.aWeakReference_Sub1_11916;
		anInt815 -= 346731323;
	    } else {
		for (;;) {
		    WeakReference_Sub1 weakreference_sub1_22_
			= weakreference_sub1.aWeakReference_Sub1_11916;
		    if (weakreference_sub1_22_ == null)
			break;
		    if (weakreference_sub1_22_.get() == object) {
			weakreference_sub1.aWeakReference_Sub1_11916
			    = weakreference_sub1_22_.aWeakReference_Sub1_11916;
			anInt815 -= 346731323;
			break;
		    }
		    weakreference_sub1 = weakreference_sub1_22_;
		}
	    }
	}
    }
    
    public void method1603(Object object) {
	if (object == null)
	    throw new NullPointerException();
	method1597(-1439804842);
	int i = System.identityHashCode(object);
	int i_23_ = i & aWeakReference_Sub1Array816.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = aWeakReference_Sub1Array816[i_23_];
	if (weakreference_sub1 != null) {
	    if (weakreference_sub1.get() == object) {
		aWeakReference_Sub1Array816[i_23_]
		    = weakreference_sub1.aWeakReference_Sub1_11916;
		anInt815 -= 346731323;
	    } else {
		for (;;) {
		    WeakReference_Sub1 weakreference_sub1_24_
			= weakreference_sub1.aWeakReference_Sub1_11916;
		    if (weakreference_sub1_24_ == null)
			break;
		    if (weakreference_sub1_24_.get() == object) {
			weakreference_sub1.aWeakReference_Sub1_11916
			    = weakreference_sub1_24_.aWeakReference_Sub1_11916;
			anInt815 -= 346731323;
			break;
		    }
		    weakreference_sub1 = weakreference_sub1_24_;
		}
	    }
	}
    }
    
    void method1604() {
	WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array816;
	aWeakReference_Sub1Array816
	    = new WeakReference_Sub1[2 * weakreference_sub1s.length];
	WeakReference_Sub1[] weakreference_sub1s_25_ = weakreference_sub1s;
	for (int i = 0; i < weakreference_sub1s_25_.length; i++) {
	    WeakReference_Sub1 weakreference_sub1_26_;
	    for (WeakReference_Sub1 weakreference_sub1
		     = weakreference_sub1s_25_[i];
		 weakreference_sub1 != null;
		 weakreference_sub1 = weakreference_sub1_26_) {
		weakreference_sub1_26_
		    = weakreference_sub1.aWeakReference_Sub1_11916;
		int i_27_ = (-1436277177 * weakreference_sub1.anInt11917
			     & aWeakReference_Sub1Array816.length - 1);
		weakreference_sub1.aWeakReference_Sub1_11916
		    = aWeakReference_Sub1Array816[i_27_];
		aWeakReference_Sub1Array816[i_27_] = weakreference_sub1;
	    }
	}
    }
    
    void method1605(byte i) {
	WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array816;
	aWeakReference_Sub1Array816
	    = new WeakReference_Sub1[2 * weakreference_sub1s.length];
	WeakReference_Sub1[] weakreference_sub1s_28_ = weakreference_sub1s;
	for (int i_29_ = 0; i_29_ < weakreference_sub1s_28_.length; i_29_++) {
	    WeakReference_Sub1 weakreference_sub1_30_;
	    for (WeakReference_Sub1 weakreference_sub1
		     = weakreference_sub1s_28_[i_29_];
		 weakreference_sub1 != null;
		 weakreference_sub1 = weakreference_sub1_30_) {
		weakreference_sub1_30_
		    = weakreference_sub1.aWeakReference_Sub1_11916;
		int i_31_ = (-1436277177 * weakreference_sub1.anInt11917
			     & aWeakReference_Sub1Array816.length - 1);
		weakreference_sub1.aWeakReference_Sub1_11916
		    = aWeakReference_Sub1Array816[i_31_];
		aWeakReference_Sub1Array816[i_31_] = weakreference_sub1;
	    }
	}
    }
    
    public Class77() {
	aWeakReference_Sub1Array816 = new WeakReference_Sub1[16];
    }
    
    public void method1606(Object object) {
	if (object == null)
	    throw new NullPointerException();
	method1597(-407101769);
	int i = System.identityHashCode(object);
	int i_32_ = i & aWeakReference_Sub1Array816.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = aWeakReference_Sub1Array816[i_32_];
	if (weakreference_sub1 != null) {
	    if (weakreference_sub1.get() == object) {
		aWeakReference_Sub1Array816[i_32_]
		    = weakreference_sub1.aWeakReference_Sub1_11916;
		anInt815 -= 346731323;
	    } else {
		for (;;) {
		    WeakReference_Sub1 weakreference_sub1_33_
			= weakreference_sub1.aWeakReference_Sub1_11916;
		    if (weakreference_sub1_33_ == null)
			break;
		    if (weakreference_sub1_33_.get() == object) {
			weakreference_sub1.aWeakReference_Sub1_11916
			    = weakreference_sub1_33_.aWeakReference_Sub1_11916;
			anInt815 -= 346731323;
			break;
		    }
		    weakreference_sub1 = weakreference_sub1_33_;
		}
	    }
	}
    }
    
    public void method1607(Object object, Object object_34_) {
	if (object == null)
	    throw new NullPointerException();
	method1597(1388976507);
	int i = System.identityHashCode(object);
	int i_35_ = i & aWeakReference_Sub1Array816.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = aWeakReference_Sub1Array816[i_35_];
	if (weakreference_sub1 == null) {
	    aWeakReference_Sub1Array816[i_35_]
		= new WeakReference_Sub1(object, aReferenceQueue817, i,
					 object_34_);
	    anInt815 += 346731323;
	    if (anInt815 * 620473843 >= aWeakReference_Sub1Array816.length)
		method1605((byte) -2);
	} else {
	    for (/**/; weakreference_sub1.get() != object;
		 weakreference_sub1
		     = weakreference_sub1.aWeakReference_Sub1_11916) {
		if (weakreference_sub1.aWeakReference_Sub1_11916 == null) {
		    weakreference_sub1.aWeakReference_Sub1_11916
			= new WeakReference_Sub1(object, aReferenceQueue817, i,
						 object_34_);
		    anInt815 += 346731323;
		    if (anInt815 * 620473843
			>= aWeakReference_Sub1Array816.length)
			method1605((byte) 18);
		    break;
		}
	    }
	}
    }
    
    public ArrayList method1608() {
	method1597(1367304588);
	ArrayList arraylist = new ArrayList(anInt815 * 620473843);
	WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array816;
	for (int i = 0; i < weakreference_sub1s.length; i++) {
	    for (WeakReference_Sub1 weakreference_sub1
		     = weakreference_sub1s[i];
		 null != weakreference_sub1;
		 weakreference_sub1
		     = weakreference_sub1.aWeakReference_Sub1_11916) {
		Object object = weakreference_sub1.get();
		if (null != object)
		    arraylist.add(object);
	    }
	}
	return arraylist;
    }
    
    public ArrayList method1609() {
	method1597(-733030168);
	ArrayList arraylist = new ArrayList(anInt815 * 620473843);
	WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array816;
	for (int i = 0; i < weakreference_sub1s.length; i++) {
	    for (WeakReference_Sub1 weakreference_sub1
		     = weakreference_sub1s[i];
		 null != weakreference_sub1;
		 weakreference_sub1
		     = weakreference_sub1.aWeakReference_Sub1_11916) {
		Object object = weakreference_sub1.get();
		if (null != object)
		    arraylist.add(object);
	    }
	}
	return arraylist;
    }
    
    public void method1610(Object object) {
	if (object == null)
	    throw new NullPointerException();
	method1597(-1687168388);
	int i = System.identityHashCode(object);
	int i_36_ = i & aWeakReference_Sub1Array816.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = aWeakReference_Sub1Array816[i_36_];
	if (weakreference_sub1 != null) {
	    if (weakreference_sub1.get() == object) {
		aWeakReference_Sub1Array816[i_36_]
		    = weakreference_sub1.aWeakReference_Sub1_11916;
		anInt815 -= 346731323;
	    } else {
		for (;;) {
		    WeakReference_Sub1 weakreference_sub1_37_
			= weakreference_sub1.aWeakReference_Sub1_11916;
		    if (weakreference_sub1_37_ == null)
			break;
		    if (weakreference_sub1_37_.get() == object) {
			weakreference_sub1.aWeakReference_Sub1_11916
			    = weakreference_sub1_37_.aWeakReference_Sub1_11916;
			anInt815 -= 346731323;
			break;
		    }
		    weakreference_sub1 = weakreference_sub1_37_;
		}
	    }
	}
    }
    
    void method1611() {
	WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array816;
	aWeakReference_Sub1Array816
	    = new WeakReference_Sub1[2 * weakreference_sub1s.length];
	WeakReference_Sub1[] weakreference_sub1s_38_ = weakreference_sub1s;
	for (int i = 0; i < weakreference_sub1s_38_.length; i++) {
	    WeakReference_Sub1 weakreference_sub1_39_;
	    for (WeakReference_Sub1 weakreference_sub1
		     = weakreference_sub1s_38_[i];
		 weakreference_sub1 != null;
		 weakreference_sub1 = weakreference_sub1_39_) {
		weakreference_sub1_39_
		    = weakreference_sub1.aWeakReference_Sub1_11916;
		int i_40_ = (-1436277177 * weakreference_sub1.anInt11917
			     & aWeakReference_Sub1Array816.length - 1);
		weakreference_sub1.aWeakReference_Sub1_11916
		    = aWeakReference_Sub1Array816[i_40_];
		aWeakReference_Sub1Array816[i_40_] = weakreference_sub1;
	    }
	}
    }
    
    public ArrayList method1612() {
	method1597(315601143);
	ArrayList arraylist = new ArrayList(anInt815 * 620473843);
	WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array816;
	for (int i = 0; i < weakreference_sub1s.length; i++) {
	    for (WeakReference_Sub1 weakreference_sub1
		     = weakreference_sub1s[i];
		 null != weakreference_sub1;
		 weakreference_sub1
		     = weakreference_sub1.aWeakReference_Sub1_11916) {
		Object object = weakreference_sub1.get();
		if (null != object)
		    arraylist.add(object);
	    }
	}
	return arraylist;
    }
    
    void method1613() {
	WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array816;
	aWeakReference_Sub1Array816
	    = new WeakReference_Sub1[2 * weakreference_sub1s.length];
	WeakReference_Sub1[] weakreference_sub1s_41_ = weakreference_sub1s;
	for (int i = 0; i < weakreference_sub1s_41_.length; i++) {
	    WeakReference_Sub1 weakreference_sub1_42_;
	    for (WeakReference_Sub1 weakreference_sub1
		     = weakreference_sub1s_41_[i];
		 weakreference_sub1 != null;
		 weakreference_sub1 = weakreference_sub1_42_) {
		weakreference_sub1_42_
		    = weakreference_sub1.aWeakReference_Sub1_11916;
		int i_43_ = (-1436277177 * weakreference_sub1.anInt11917
			     & aWeakReference_Sub1Array816.length - 1);
		weakreference_sub1.aWeakReference_Sub1_11916
		    = aWeakReference_Sub1Array816[i_43_];
		aWeakReference_Sub1Array816[i_43_] = weakreference_sub1;
	    }
	}
    }
    
    void method1614() {
	for (;;) {
	    WeakReference_Sub1 weakreference_sub1
		= (WeakReference_Sub1) aReferenceQueue817.poll();
	    if (weakreference_sub1 == null)
		break;
	    int i = (weakreference_sub1.anInt11917 * -1436277177
		     & aWeakReference_Sub1Array816.length - 1);
	    WeakReference_Sub1 weakreference_sub1_44_
		= aWeakReference_Sub1Array816[i];
	    if (weakreference_sub1_44_ == weakreference_sub1) {
		aWeakReference_Sub1Array816[i]
		    = weakreference_sub1.aWeakReference_Sub1_11916;
		anInt815 -= 346731323;
	    } else {
		for (/**/;
		     (null != weakreference_sub1_44_
		      && weakreference_sub1 != (weakreference_sub1_44_
						.aWeakReference_Sub1_11916));
		     weakreference_sub1_44_
			 = weakreference_sub1_44_.aWeakReference_Sub1_11916) {
		    /* empty */
		}
		if (weakreference_sub1_44_ != null) {
		    weakreference_sub1_44_.aWeakReference_Sub1_11916
			= weakreference_sub1.aWeakReference_Sub1_11916;
		    anInt815 -= 346731323;
		}
	    }
	}
    }
}
