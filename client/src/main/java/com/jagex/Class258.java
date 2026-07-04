/* Class258 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Class258 implements Interface40
{
    int[] anIntArray2712;
    Class386 aClass386_2713;
    int anInt2714;
    int anInt2715;
    int anInt2716;
    Interface49 anInterface49_2717;
    List aList2718 = new ArrayList();
    int anInt2719;
    Class534_Sub40 aClass534_Sub40_2720;
    Class239 aClass239_2721;
    int anInt2722;
    Class239 aClass239_2723;
    int anInt2724;
    int anInt2725;
    Class256[] aClass256Array2726;
    int anInt2727;
    int anInt2728;
    int[] anIntArray2729;
    Class240[] aClass240Array2730;
    Class248[] aClass248Array2731;
    boolean[] aBoolArray2732;
    int anInt2733;
    Class239[] aClass239Array2734;
    int anInt2735;
    int anInt2736;
    Class375 aClass375_2737 = Class375.aClass375_3908;
    int anInt2738;
    Class239 aClass239_2739;
    int anInt2740;
    Class239 aClass239_2741;
    Class239 aClass239_2742;
    Class239 aClass239_2743;
    boolean aBool2744;
    int anInt2745;
    int[] anIntArray2746;
    boolean aBool2747;
    List aList2748 = new ArrayList();
    int anInt2749;
    int anInt2750;
    boolean[] aBoolArray2751;
    List aList2752;
    byte[] aByteArray2753;
    boolean aBool2754;
    boolean aBool2755;
    int anInt2756;
    int anInt2757;
    int anInt2758;
    boolean[] aBoolArray2759;
    boolean aBool2760;
    int anInt2761;
    boolean[] aBoolArray2762;
    Class382 aClass382_2763;
    Class239[] aClass239Array2764;
    int anInt2765;
    List aList2766;
    List aList2767;
    AtomicReference anAtomicReference2768;
    int anInt2769;
    int anInt2770;
    int anInt2771;
    boolean aBool2772;
    int anInt2773;
    static List aList2774 = new ArrayList();
    static Class203 aClass203_2775 = new Class203(524288, 1024);
    Class239[] aClass239Array2776;
    float aFloat2777;
    int anInt2778;
    int anInt2779;
    boolean[] aBoolArray2780;
    Class241[] aClass241Array2781;
    
    public void method295(int i, Class382 class382, Class386 class386,
			  int i_0_) {
	anInt2722 = i_0_;
	if (method4683(i, class382, class386)) {
	    aClass382_2763 = class382;
	    aClass386_2713 = class386;
	} else
	    throw new RuntimeException("");
    }
    
    public void method288(boolean bool) {
	if (!bool)
	    method286();
	else if (method307() == Class375.aClass375_3907) {
	    method4681(true);
	    method4677(Class375.aClass375_3905);
	}
    }
    
    public void method286() {
	if (method307() != Class375.aClass375_3904) {
	    method4681(false);
	    method4677(Class375.aClass375_3908);
	} else {
	    method4681(false);
	    method4677(Class375.aClass375_3903);
	}
    }
    
    public void method291(Class534_Sub40 class534_sub40) {
	if (method307() == Class375.aClass375_3902
	    || method307() == Class375.aClass375_3907) {
	    if (class534_sub40 != null)
		class534_sub40.method16538((byte) 22);
	} else if (class534_sub40 == null) {
	    boolean bool = aBool2772 && (anInt2738 > 0 && anInt2765 < anInt2738
					 || anInt2738 < 0);
	    if (aList2752.isEmpty()) {
		if (!bool) {
		    method4701();
		    method4677(Class375.aClass375_3907);
		}
	    } else if (!bool) {
		method4701();
		method4677(Class375.aClass375_3902);
	    }
	    if (bool)
		method4681(true);
	} else
	    method4756(class534_sub40);
    }
    
    void method4677(Class375 class375) {
	aClass375_2737 = class375;
    }
    
    public void method282(Interface49 interface49) {
	anInterface49_2717 = interface49;
    }
    
    synchronized void method4678(boolean bool) {
	if (!bool) {
	    anInt2771 = 0;
	    anInt2727 = 0;
	    aBoolArray2732 = null;
	    anIntArray2729 = null;
	    method4690(aClass239Array2776);
	    aClass239Array2776 = null;
	    method4690(aClass239Array2734);
	    aClass239Array2734 = null;
	    anInt2735 = 0;
	    anInt2736 = 0;
	    aBoolArray2751 = null;
	    method4690(aClass239Array2764);
	    aClass239Array2764 = null;
	    method4776(aClass239_2739);
	    method4776(aClass239_2721);
	    method4776(aClass239_2723);
	    method4776(aClass239_2742);
	    method4776(aClass239_2743);
	    method4776(aClass239_2741);
	    aClass239_2739 = null;
	    aClass239_2721 = null;
	    aClass239_2723 = null;
	    aClass239_2742 = null;
	    aClass239_2743 = null;
	    aClass239_2741 = null;
	    anIntArray2712 = null;
	    anIntArray2746 = null;
	}
	anInt2769 = 0;
	Iterator iterator = aList2748.iterator();
	while (iterator.hasNext()) {
	    Class534_Sub40 class534_sub40 = (Class534_Sub40) iterator.next();
	    class534_sub40.method16538((byte) 3);
	}
	aList2748.clear();
	aBool2747 = false;
	if (aClass534_Sub40_2720 != null) {
	    synchronized (aClass534_Sub40_2720) {
		aClass534_Sub40_2720.method16538((byte) 114);
		aClass534_Sub40_2720 = null;
	    }
	}
	anInt2733 = 0;
	anInt2750 = 0;
	if (!bool) {
	    synchronized (aList2752) {
		Iterator iterator_1_ = aList2752.iterator();
		while (iterator_1_.hasNext()) {
		    Class534_Sub40 class534_sub40
			= (Class534_Sub40) iterator_1_.next();
		    class534_sub40.method16538((byte) 99);
		}
		aList2752.clear();
	    }
	    anInt2773 = 0;
	}
	synchronized (aList2718) {
	    Iterator iterator_2_ = aList2718.iterator();
	    while (iterator_2_.hasNext()) {
		Class534_Sub40 class534_sub40
		    = (Class534_Sub40) iterator_2_.next();
		class534_sub40.method16538((byte) 27);
	    }
	    aList2718.clear();
	}
	aBool2744 = false;
	anInt2756 = 0;
	anInt2745 = -1;
	anInt2779 = -1;
	if (!bool) {
	    method4682(false);
	    aBool2754 = false;
	    anInt2719 = -1;
	    anInt2724 = -1;
	    anInt2738 = 0;
	    anInt2765 = 0;
	    anInt2757 = -1;
	    anInt2758 = -1;
	    anInt2761 = -1;
	    anInt2778 = -1;
	    aBool2760 = false;
	    aBool2772 = false;
	} else {
	    anInt2765++;
	    aBool2760 = true;
	}
    }
    
    int method4679(float f) {
	int i = (int) (f * 127.0F);
	if (i > 127)
	    return 127;
	if (i < -128)
	    return -128;
	return i;
    }
    
    Class534_Sub40 method4680(int i) {
	return new Class534_Sub40(i, true);
    }
    
    public int method9() {
	return method4713();
    }
    
    public void method287(int i, Class382 class382, Class386 class386,
			  int i_3_) {
	anInt2722 = i_3_;
	if (method4683(i, class382, class386)) {
	    aClass382_2763 = class382;
	    aClass386_2713 = class386;
	} else
	    throw new RuntimeException("");
    }
    
    public int method289(int i) {
	return i * (method283().anInt3929 * -1204190425 / 8);
    }
    
    public synchronized boolean method290() {
	return aBool2755;
    }
    
    synchronized void method4681(boolean bool) {
	if (!bool) {
	    anInt2771 = 0;
	    anInt2727 = 0;
	    aBoolArray2732 = null;
	    anIntArray2729 = null;
	    method4690(aClass239Array2776);
	    aClass239Array2776 = null;
	    method4690(aClass239Array2734);
	    aClass239Array2734 = null;
	    anInt2735 = 0;
	    anInt2736 = 0;
	    aBoolArray2751 = null;
	    method4690(aClass239Array2764);
	    aClass239Array2764 = null;
	    method4776(aClass239_2739);
	    method4776(aClass239_2721);
	    method4776(aClass239_2723);
	    method4776(aClass239_2742);
	    method4776(aClass239_2743);
	    method4776(aClass239_2741);
	    aClass239_2739 = null;
	    aClass239_2721 = null;
	    aClass239_2723 = null;
	    aClass239_2742 = null;
	    aClass239_2743 = null;
	    aClass239_2741 = null;
	    anIntArray2712 = null;
	    anIntArray2746 = null;
	}
	anInt2769 = 0;
	Iterator iterator = aList2748.iterator();
	while (iterator.hasNext()) {
	    Class534_Sub40 class534_sub40 = (Class534_Sub40) iterator.next();
	    class534_sub40.method16538((byte) 80);
	}
	aList2748.clear();
	aBool2747 = false;
	if (aClass534_Sub40_2720 != null) {
	    synchronized (aClass534_Sub40_2720) {
		aClass534_Sub40_2720.method16538((byte) 46);
		aClass534_Sub40_2720 = null;
	    }
	}
	anInt2733 = 0;
	anInt2750 = 0;
	if (!bool) {
	    synchronized (aList2752) {
		Iterator iterator_4_ = aList2752.iterator();
		while (iterator_4_.hasNext()) {
		    Class534_Sub40 class534_sub40
			= (Class534_Sub40) iterator_4_.next();
		    class534_sub40.method16538((byte) 28);
		}
		aList2752.clear();
	    }
	    anInt2773 = 0;
	}
	synchronized (aList2718) {
	    Iterator iterator_5_ = aList2718.iterator();
	    while (iterator_5_.hasNext()) {
		Class534_Sub40 class534_sub40
		    = (Class534_Sub40) iterator_5_.next();
		class534_sub40.method16538((byte) 10);
	    }
	    aList2718.clear();
	}
	aBool2744 = false;
	anInt2756 = 0;
	anInt2745 = -1;
	anInt2779 = -1;
	if (!bool) {
	    method4682(false);
	    aBool2754 = false;
	    anInt2719 = -1;
	    anInt2724 = -1;
	    anInt2738 = 0;
	    anInt2765 = 0;
	    anInt2757 = -1;
	    anInt2758 = -1;
	    anInt2761 = -1;
	    anInt2778 = -1;
	    aBool2760 = false;
	    aBool2772 = false;
	} else {
	    anInt2765++;
	    aBool2760 = true;
	}
    }
    
    synchronized void method4682(boolean bool) {
	aBool2755 = bool;
    }
    
    public void method309() {
	if (method307() == Class375.aClass375_3903
	    || method307() == Class375.aClass375_3908
	    || method307() == Class375.aClass375_3905) {
	    method4677(Class375.aClass375_3904);
	    method4762();
	}
    }
    
    boolean method4683(int i, Class382 class382, Class386 class386) {
	if (class382 == Class382.aClass382_3932)
	    return true;
	if (class382 == Class382.aClass382_3933)
	    return true;
	if (class382 == Class382.aClass382_3930)
	    return true;
	if (class382 == Class382.aClass382_3931)
	    return true;
	return false;
    }
    
    void method4684() {
	aByteArray2753 = null;
    }
    
    public int method280() {
	if (aBool2754)
	    return method4691() < anInt2722 ? anInt2722 : method4691();
	throw new RuntimeException("");
    }
    
    void method4685() {
	aByteArray2753 = null;
    }
    
    boolean method4686(Class534_Sub40 class534_sub40) {
	if (class534_sub40.method16527(1193284955) != 79
	    || class534_sub40.method16527(1690008873) != 103
	    || class534_sub40.method16527(-676356216) != 103
	    || class534_sub40.method16527(-387634564) != 83)
	    return false;
	return true;
    }
    
    Class239[] method4687(int i, int i_6_) {
	Class239[] class239s = new Class239[i];
	for (int i_7_ = 0; i_7_ < class239s.length; i_7_++)
	    class239s[i_7_] = method4696(i_6_);
	return class239s;
    }
    
    void method4688(byte[] is, int i) {
	aByteArray2753 = is;
	anInt2740 = i;
	anInt2749 = 0;
    }
    
    int method4689(int i) {
	int i_8_ = 0;
	for (/**/; i > 0; i >>= 1)
	    i_8_++;
	return i_8_;
    }
    
    void method4690(Class239[] class239s) {
	if (class239s != null) {
	    for (int i = 0; i < class239s.length; i++)
		method4776(class239s[i]);
	}
    }
    
    public int method315() {
	return method4713();
    }
    
    int method4691() {
	if (aBool2754)
	    return anInt2725;
	throw new RuntimeException("");
    }
    
    public void method303(Interface49 interface49) {
	anInterface49_2717 = interface49;
    }
    
    boolean method4692() {
	return aBool2747;
    }
    
    boolean method4693(Class534_Sub40 class534_sub40) {
	if (class534_sub40.method16527(-1179686519) != 79
	    || class534_sub40.method16527(1530473177) != 103
	    || class534_sub40.method16527(755525461) != 103
	    || class534_sub40.method16527(863365632) != 83)
	    return false;
	return true;
    }
    
    boolean method4694(byte[] is, int i, int i_9_) {
	if (is[i] != i_9_)
	    return false;
	if (is[i + 1] != 118 || is[i + 2] != 111 || is[i + 3] != 114
	    || is[i + 4] != 98 || is[i + 5] != 105 || is[i + 6] != 115)
	    return false;
	return true;
    }
    
    float method4695(int i) {
	int i_10_ = i & 0x1fffff;
	int i_11_ = i & ~0x7fffffff;
	int i_12_ = (i & 0x7fe00000) >> 21;
	if (i_11_ != 0)
	    i_10_ = -i_10_;
	return (float) ((double) i_10_
			* Math.pow(2.0, (double) (i_12_ - 788)));
    }
    
    Class239 method4696(int i) {
	synchronized (aClass203_2775) {
	    Object object = null;
	    Class239 class239
		= (Class239) aClass203_2775.method3892(-2086003740);
	    Class239 class239_13_ = null;
	    int i_14_ = i;
	    for (/**/; class239 != null;
		 class239 = (Class239) aClass203_2775.method3883((byte) -12)) {
		if (class239.aFloatArray2384.length > i && !class239.aBool2383
		    && (class239_13_ == null
			|| class239.aFloatArray2384.length < i_14_)) {
		    class239_13_ = class239;
		    i_14_ = class239_13_.aFloatArray2384.length;
		}
		if (class239.aFloatArray2384.length == i
		    && !class239.aBool2383)
		    break;
	    }
	    if (class239 == null)
		class239 = class239_13_;
	    if (class239 == null) {
		class239 = new Class239(this);
		int i_15_ = 0;
		boolean bool = false;
		while (!bool && i_15_ < 1000) {
		    if (aClass203_2775.method3871((long) i_15_) != null)
			i_15_++;
		    else
			bool = true;
		}
		class239.anInt2381 = i_15_;
		float[] fs = new float[i];
		class239.aFloatArray2384 = fs;
		class239.aBool2383 = true;
		class239.anInt2382 = i;
		if (aClass203_2775.method3879(890973990) >= i * 4) {
		    /* empty */
		}
		aClass203_2775.method3881(class239, (long) class239.anInt2381,
					  fs.length * 4, 1443307987);
	    } else {
		for (int i_16_ = 0; i_16_ < class239.aFloatArray2384.length;
		     i_16_++)
		    class239.aFloatArray2384[i_16_] = 0.0F;
		class239.anInt2382 = i;
	    }
	    class239.aBool2383 = true;
	    Class239 class239_17_ = class239;
	    return class239_17_;
	}
    }
    
    int method4697() {
	return anInt2749;
    }
    
    void method4698() {
	int i = method4699(8) + 1;
	Iterator iterator = aList2774.iterator();
	while (iterator.hasNext()) {
	    Class249 class249 = (Class249) iterator.next();
	    if (class249.anInt2646 == 0 && class249.anInt2647 == 0) {
		if (class249.aClass256Array2645.length == i
		    && class249.anInt2649 == anInt2725
		    && class249.anInt2644 == anInt2728
		    && class249.anInt2648 == anInt2715) {
		    aClass256Array2726 = class249.aClass256Array2645;
		    for (int i_18_ = 0; i_18_ < aClass256Array2726.length;
			 i_18_++)
			aClass256Array2726[i_18_].method4667(this);
		    return;
		}
	    }
	}
	aClass256Array2726 = new Class256[i];
	for (int i_19_ = 0; i_19_ < i; i_19_++) {
	    if (aClass256Array2726[i_19_] == null)
		aClass256Array2726[i_19_] = new Class256();
	    aClass256Array2726[i_19_].method4656(this);
	}
	Class249 class249
	    = new Class249(anInt2725, anInt2728, anInt2714, anInt2716,
			   anInt2715, aClass256Array2726);
	aList2774.add(class249);
    }
    
    int method4699(int i) {
	int i_20_ = 0;
	int i_21_ = 0;
	int i_22_;
	for (/**/; i >= 8 - anInt2749; i -= i_22_) {
	    i_22_ = 8 - anInt2749;
	    int i_23_ = (1 << i_22_) - 1;
	    i_20_ += (aByteArray2753[anInt2740] >> anInt2749 & i_23_) << i_21_;
	    anInt2749 = 0;
	    anInt2740++;
	    i_21_ += i_22_;
	}
	if (i > 0) {
	    i_22_ = (1 << i) - 1;
	    i_20_ += (aByteArray2753[anInt2740] >> anInt2749 & i_22_) << i_21_;
	    anInt2749 += i;
	}
	return i_20_;
    }
    
    float method4700(int i) {
	int i_24_ = i & 0x1fffff;
	int i_25_ = i & ~0x7fffffff;
	int i_26_ = (i & 0x7fe00000) >> 21;
	if (i_25_ != 0)
	    i_24_ = -i_24_;
	return (float) ((double) i_24_
			* Math.pow(2.0, (double) (i_26_ - 788)));
    }
    
    void method4701() {
	aByteArray2753 = null;
    }
    
    public void method84() {
	if (method307() == Class375.aClass375_3903
	    || method307() == Class375.aClass375_3908
	    || method307() == Class375.aClass375_3905) {
	    method4677(Class375.aClass375_3904);
	    method4762();
	}
    }
    
    void method4702(byte[] is, int i) {
	anInt2769 = 0;
	if (!method290()) {
	    if (is == null)
		throw new RuntimeException("");
	    int i_27_ = 0;
	    if (method4694(is, i, 1))
		i_27_ = 1;
	    else if (method4694(is, i, 3))
		i_27_ = 3;
	    else if (method4694(is, i, 5))
		i_27_ = 5;
	    else
		throw new RuntimeException(new StringBuilder().append("")
					       .append
					       (i_27_).toString());
	    if (i_27_ == 1) {
		method4792(is, i + 7);
		int i_28_ = method4699(32);
		anInt2725 = method4699(8);
		anInt2728 = method4699(32);
		anInt2714 = method4699(32);
		anInt2715 = method4699(32);
		anInt2716 = method4699(32);
		anInt2771 = 1 << method4699(4);
		anInt2727 = 1 << method4699(4);
		int i_29_ = 1 << method4699(1);
		if (i_28_ != 0 || i_29_ == 0)
		    throw new RuntimeException("");
		aBool2754 = true;
		anInt2745++;
	    } else if (i_27_ != 3 && i_27_ == 5) {
		if (!method4694(is, i, 5))
		    throw new RuntimeException("");
		method4792(is, i + 7);
		if (aClass239Array2764 != null) {
		    method4690(aClass239Array2764);
		    aClass239Array2764 = null;
		}
		aClass239Array2764 = method4687(anInt2725, anInt2727);
		for (int i_30_ = 0; i_30_ < 2; i_30_++) {
		    int i_31_ = i_30_ != 0 ? anInt2727 : anInt2771;
		    int i_32_ = i_31_ >> 1;
		    int i_33_ = i_31_ >> 2;
		    int i_34_ = i_31_ >> 3;
		    Class239 class239 = method4696(i_32_);
		    for (int i_35_ = 0; i_35_ < i_33_; i_35_++) {
			class239.aFloatArray2384[2 * i_35_]
			    = (float) Math.cos((double) (4 * i_35_)
					       * 3.141592653589793
					       / (double) i_31_);
			class239.aFloatArray2384[2 * i_35_ + 1]
			    = -(float) Math.sin((double) (4 * i_35_)
						* 3.141592653589793
						/ (double) i_31_);
		    }
		    Class239 class239_36_ = method4696(i_32_);
		    for (int i_37_ = 0; i_37_ < i_33_; i_37_++) {
			class239_36_.aFloatArray2384[2 * i_37_]
			    = (float) Math.cos((double) (2 * i_37_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_31_));
			class239_36_.aFloatArray2384[2 * i_37_ + 1]
			    = (float) Math.sin((double) (2 * i_37_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_31_));
		    }
		    Class239 class239_38_ = method4696(i_33_);
		    for (int i_39_ = 0; i_39_ < i_34_; i_39_++) {
			class239_38_.aFloatArray2384[2 * i_39_]
			    = (float) Math.cos((double) (4 * i_39_ + 2)
					       * 3.141592653589793
					       / (double) i_31_);
			class239_38_.aFloatArray2384[2 * i_39_ + 1]
			    = -(float) Math.sin((double) (4 * i_39_ + 2)
						* 3.141592653589793
						/ (double) i_31_);
		    }
		    int[] is_40_ = new int[i_34_];
		    int i_41_ = Class695.method14072(i_34_ - 1, (byte) 16);
		    for (int i_42_ = 0; i_42_ < i_34_; i_42_++)
			is_40_[i_42_]
			    = Class654_Sub1_Sub3_Sub1.method18642(i_42_, i_41_,
								  (byte) 34);
		    if (i_30_ != 0) {
			aClass239_2742 = class239;
			aClass239_2743 = class239_36_;
			aClass239_2741 = class239_38_;
			anIntArray2746 = is_40_;
		    } else {
			aClass239_2739 = class239;
			aClass239_2721 = class239_36_;
			aClass239_2723 = class239_38_;
			anIntArray2712 = is_40_;
		    }
		}
		method4698();
		int i_43_ = method4699(6) + 1;
		for (int i_44_ = 0; i_44_ < i_43_; i_44_++)
		    method4699(16);
		i_43_ = method4699(6) + 1;
		if (aClass241Array2781 == null
		    || aClass241Array2781.length != i_43_)
		    aClass241Array2781 = new Class241[i_43_];
		for (int i_45_ = 0; i_45_ < i_43_; i_45_++) {
		    if (aClass241Array2781[i_45_] == null)
			aClass241Array2781[i_45_] = new Class241();
		    aClass241Array2781[i_45_].method4438(this, anInt2725);
		}
		int i_46_ = method4699(6) + 1;
		if (aClass240Array2730 == null
		    || aClass240Array2730.length != i_46_)
		    aClass240Array2730 = new Class240[i_46_];
		for (int i_47_ = 0; i_47_ < i_46_; i_47_++) {
		    if (aClass240Array2730[i_47_] == null)
			aClass240Array2730[i_47_] = new Class240();
		    aClass240Array2730[i_47_].method4431(this);
		}
		int i_48_ = method4699(6) + 1;
		if (aClass248Array2731 == null
		    || aClass248Array2731.length != i_48_)
		    aClass248Array2731 = new Class248[i_48_];
		for (int i_49_ = 0; i_49_ < i_48_; i_49_++) {
		    if (aClass248Array2731[i_49_] == null)
			aClass248Array2731[i_49_] = new Class248();
		    aClass248Array2731[i_49_].method4598(this);
		}
		int i_50_ = method4699(6) + 1;
		aBoolArray2732 = new boolean[i_50_];
		anIntArray2729 = new int[i_50_];
		for (int i_51_ = 0; i_51_ < i_50_; i_51_++) {
		    aBoolArray2732[i_51_] = method4714() != 0;
		    method4699(16);
		    method4699(16);
		    anIntArray2729[i_51_] = method4699(8);
		}
		method4682(true);
	    }
	}
    }
    
    int method4703() {
	if (method290())
	    return anInt2728;
	throw new RuntimeException("");
    }
    
    boolean method4704(byte[] is, int i, int i_52_,
		       AtomicReference atomicreference) {
	if (is == null)
	    throw new RuntimeException("");
	if (i + i_52_ > is.length)
	    return false;
	method4792(is, i);
	int i_53_ = method4714();
	if (i_53_ != 0) {
	    method4702(is, i);
	    return false;
	}
	if (!method290())
	    throw new RuntimeException();
	int i_54_ = method4699(method4689(anIntArray2729.length - 1));
	boolean bool = aBoolArray2732[i_54_];
	int i_55_ = bool ? anInt2727 : anInt2771;
	boolean bool_56_ = false;
	boolean bool_57_ = false;
	if (bool) {
	    bool_56_ = method4714() != 0;
	    bool_57_ = method4714() != 0;
	}
	int i_58_ = i_55_ >> 1;
	int i_59_;
	int i_60_;
	int i_61_;
	if (bool && !bool_56_) {
	    i_59_ = (i_55_ >> 2) - (anInt2771 >> 2);
	    i_60_ = (i_55_ >> 2) + (anInt2771 >> 2);
	    i_61_ = anInt2771 >> 1;
	} else {
	    i_59_ = 0;
	    i_60_ = i_58_;
	    i_61_ = i_55_ >> 1;
	}
	int i_62_;
	int i_63_;
	int i_64_;
	if (bool && !bool_57_) {
	    i_62_ = i_55_ - (i_55_ >> 2) - (anInt2771 >> 2);
	    i_63_ = i_55_ - (i_55_ >> 2) + (anInt2771 >> 2);
	    i_64_ = anInt2771 >> 1;
	} else {
	    i_62_ = i_58_;
	    i_63_ = i_55_;
	    i_64_ = i_55_ >> 1;
	}
	Class248 class248 = aClass248Array2731[anIntArray2729[i_54_]];
	if (aBoolArray2759 == null || aBoolArray2759.length != anInt2725) {
	    aBoolArray2759 = new boolean[anInt2725];
	    aBoolArray2780 = new boolean[anInt2725];
	}
	for (int i_65_ = 0; i_65_ < anInt2725; i_65_++) {
	    int i_66_ = (class248.anIntArray2638 != null
			 ? class248.anIntArray2638[i_65_] : 0);
	    int i_67_ = i_66_;
	    int i_68_ = class248.anIntArray2639[i_67_];
	    aBoolArray2759[i_65_]
		= !aClass241Array2781[i_68_].method4445(i_65_);
	    aBoolArray2780[i_65_] = aBoolArray2759[i_65_];
	}
	for (int i_69_ = 0; i_69_ < class248.anInt2636; i_69_++) {
	    if (!aBoolArray2759[class248.anIntArray2642[i_69_]]
		|| !aBoolArray2759[class248.anIntArray2643[i_69_]]) {
		aBoolArray2759[class248.anIntArray2642[i_69_]] = false;
		aBoolArray2759[class248.anIntArray2643[i_69_]] = false;
	    }
	}
	if (aBoolArray2762 == null || aBoolArray2762.length != anInt2725)
	    aBoolArray2762 = new boolean[anInt2725];
	for (int i_70_ = 0; i_70_ < class248.anInt2641; i_70_++) {
	    int i_71_ = 0;
	    for (int i_72_ = 0; i_72_ < anInt2725; i_72_++) {
		int i_73_ = (class248.anIntArray2638 != null
			     ? class248.anIntArray2638[i_72_] : i_70_);
		if (i_73_ == i_70_)
		    aBoolArray2762[i_71_++] = aBoolArray2759[i_72_];
	    }
	    Class240 class240
		= aClass240Array2730[class248.anIntArray2637[i_70_]];
	    Object object = null;
	    Class239[] class239s;
	    if (class240.anInt2393 == 2) {
		Class239[] class239s_74_ = method4687(1, anInt2725 * i_55_);
		for (int i_75_ = 0; i_75_ < i_55_; i_75_++) {
		    for (int i_76_ = 0; i_76_ < anInt2725; i_76_++) {
			try {
			    class239s_74_[0].aFloatArray2384[(i_75_ * anInt2725
							      + i_76_)]
				= (aClass239Array2764[i_76_].aFloatArray2384
				   [i_75_]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		class239s_74_ = class240.method4433(class239s_74_, i_55_ >> 1,
						    aBoolArray2762);
		class239s = aClass239Array2764;
		for (int i_77_ = 0; i_77_ < i_55_; i_77_++) {
		    for (int i_78_ = 0; i_78_ < anInt2725; i_78_++) {
			try {
			    class239s[i_78_].aFloatArray2384[i_77_]
				= (class239s_74_[0].aFloatArray2384
				   [anInt2725 * i_77_ + i_78_]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		method4690(class239s_74_);
		Object object_79_ = null;
	    } else
		class239s = class240.method4433(aClass239Array2764, i_55_ >> 1,
						aBoolArray2762);
	    if (class248.anIntArray2638 != null) {
		i_71_ = 0;
		for (int i_80_ = 0; i_80_ < anInt2725; i_80_++) {
		    int i_81_ = class248.anIntArray2638[i_80_];
		    if (i_81_ == i_70_)
			aClass239Array2764[i_80_] = class239s[i_71_++];
		}
	    } else {
		if (aClass239Array2764 != class239s)
		    method4690(aClass239Array2764);
		aClass239Array2764 = class239s;
	    }
	}
	for (int i_82_ = class248.anInt2636 - 1; i_82_ >= 0; i_82_--) {
	    Class239 class239
		= aClass239Array2764[class248.anIntArray2642[i_82_]];
	    Class239 class239_83_
		= aClass239Array2764[class248.anIntArray2643[i_82_]];
	    for (int i_84_ = 0; i_84_ < class239.anInt2382; i_84_++) {
		float f = class239.aFloatArray2384[i_84_];
		float f_85_ = class239_83_.aFloatArray2384[i_84_];
		float f_86_ = f;
		float f_87_ = f_85_;
		if (f > 0.0F) {
		    if (f_85_ > 0.0F) {
			f_86_ = f;
			f_87_ = f - f_85_;
		    } else {
			f_87_ = f;
			f_86_ = f + f_85_;
		    }
		} else if (f_85_ > 0.0F) {
		    f_86_ = f;
		    f_87_ = f + f_85_;
		} else {
		    f_87_ = f;
		    f_86_ = f - f_85_;
		}
		class239.aFloatArray2384[i_84_] = f_86_;
		class239_83_.aFloatArray2384[i_84_] = f_87_;
	    }
	}
	for (int i_88_ = 0; i_88_ < aBoolArray2759.length; i_88_++)
	    aBoolArray2759[i_88_] = aBoolArray2780[i_88_];
	for (int i_89_ = 0; i_89_ < anInt2725; i_89_++) {
	    if (!aBoolArray2759[i_89_]) {
		int i_90_ = (class248.anIntArray2638 != null
			     ? class248.anIntArray2638[i_89_] : 0);
		int i_91_ = i_90_;
		int i_92_ = class248.anIntArray2639[i_91_];
		aClass241Array2781[i_92_].method4446(i_89_);
		aClass241Array2781[i_92_].method4447(aClass239Array2764[i_89_],
						     i_55_ >> 1, i_89_);
	    }
	}
	for (int i_93_ = 0; i_93_ < anInt2725; i_93_++) {
	    if (aBoolArray2759[i_93_]) {
		for (int i_94_ = i_55_ >> 1; i_94_ < i_55_; i_94_++)
		    aClass239Array2764[i_93_].aFloatArray2384[i_94_] = 0.0F;
	    } else {
		int i_95_ = i_55_ >> 1;
		int i_96_ = i_55_ >> 2;
		int i_97_ = i_55_ >> 3;
		Class239 class239 = aClass239Array2764[i_93_];
		for (int i_98_ = 0; i_98_ < i_95_; i_98_++)
		    class239.aFloatArray2384[i_98_] *= 0.5F;
		for (int i_99_ = i_95_; i_99_ < i_55_; i_99_++)
		    class239.aFloatArray2384[i_99_]
			= -class239.aFloatArray2384[i_55_ - i_99_ - 1];
		Class239 class239_100_
		    = bool ? aClass239_2742 : aClass239_2739;
		Class239 class239_101_
		    = bool ? aClass239_2743 : aClass239_2721;
		Class239 class239_102_
		    = bool ? aClass239_2741 : aClass239_2723;
		int[] is_103_ = bool ? anIntArray2746 : anIntArray2712;
		for (int i_104_ = 0; i_104_ < i_96_; i_104_++) {
		    float f
			= (class239.aFloatArray2384[4 * i_104_]
			   - class239.aFloatArray2384[i_55_ - 4 * i_104_ - 1]);
		    float f_105_
			= (class239.aFloatArray2384[4 * i_104_ + 2]
			   - class239.aFloatArray2384[i_55_ - 4 * i_104_ - 3]);
		    float f_106_ = class239_100_.aFloatArray2384[2 * i_104_];
		    float f_107_
			= class239_100_.aFloatArray2384[2 * i_104_ + 1];
		    class239.aFloatArray2384[i_55_ - 4 * i_104_ - 1]
			= f * f_106_ - f_105_ * f_107_;
		    class239.aFloatArray2384[i_55_ - 4 * i_104_ - 3]
			= f * f_107_ + f_105_ * f_106_;
		}
		for (int i_108_ = 0; i_108_ < i_97_; i_108_++) {
		    float f = class239.aFloatArray2384[i_95_ + 3 + 4 * i_108_];
		    float f_109_
			= class239.aFloatArray2384[i_95_ + 1 + 4 * i_108_];
		    float f_110_ = class239.aFloatArray2384[4 * i_108_ + 3];
		    float f_111_ = class239.aFloatArray2384[4 * i_108_ + 1];
		    class239.aFloatArray2384[i_95_ + 3 + 4 * i_108_]
			= f + f_110_;
		    class239.aFloatArray2384[i_95_ + 1 + 4 * i_108_]
			= f_109_ + f_111_;
		    float f_112_ = (class239_100_.aFloatArray2384
				    [i_95_ - 4 - 4 * i_108_]);
		    float f_113_ = (class239_100_.aFloatArray2384
				    [i_95_ - 3 - 4 * i_108_]);
		    class239.aFloatArray2384[4 * i_108_ + 3]
			= (f - f_110_) * f_112_ - (f_109_ - f_111_) * f_113_;
		    class239.aFloatArray2384[4 * i_108_ + 1]
			= (f_109_ - f_111_) * f_112_ + (f - f_110_) * f_113_;
		}
		int i_114_ = Class695.method14072(i_55_ - 1, (byte) -37);
		for (int i_115_ = 0; i_115_ < i_114_ - 3; i_115_++) {
		    int i_116_ = i_55_ >> i_115_ + 2;
		    int i_117_ = 8 << i_115_;
		    for (int i_118_ = 0; i_118_ < 2 << i_115_; i_118_++) {
			int i_119_ = i_55_ - i_116_ * 2 * i_118_;
			int i_120_ = i_55_ - i_116_ * (2 * i_118_ + 1);
			for (int i_121_ = 0; i_121_ < i_55_ >> i_115_ + 4;
			     i_121_++) {
			    int i_122_ = 4 * i_121_;
			    float f = (class239.aFloatArray2384
				       [i_119_ - 1 - i_122_]);
			    float f_123_ = (class239.aFloatArray2384
					    [i_119_ - 3 - i_122_]);
			    float f_124_ = (class239.aFloatArray2384
					    [i_120_ - 1 - i_122_]);
			    float f_125_ = (class239.aFloatArray2384
					    [i_120_ - 3 - i_122_]);
			    class239.aFloatArray2384[i_119_ - 1 - i_122_]
				= f + f_124_;
			    class239.aFloatArray2384[i_119_ - 3 - i_122_]
				= f_123_ + f_125_;
			    float f_126_ = (class239_100_.aFloatArray2384
					    [i_121_ * i_117_]);
			    float f_127_ = (class239_100_.aFloatArray2384
					    [i_121_ * i_117_ + 1]);
			    class239.aFloatArray2384[i_120_ - 1 - i_122_]
				= ((f - f_124_) * f_126_
				   - (f_123_ - f_125_) * f_127_);
			    class239.aFloatArray2384[i_120_ - 3 - i_122_]
				= ((f_123_ - f_125_) * f_126_
				   + (f - f_124_) * f_127_);
			}
		    }
		}
		for (int i_128_ = 1; i_128_ < i_97_ - 1; i_128_++) {
		    int i_129_ = is_103_[i_128_];
		    if (i_128_ < i_129_) {
			int i_130_ = 8 * i_128_;
			int i_131_ = 8 * i_129_;
			float f = class239.aFloatArray2384[i_130_ + 1];
			class239.aFloatArray2384[i_130_ + 1]
			    = class239.aFloatArray2384[i_131_ + 1];
			class239.aFloatArray2384[i_131_ + 1] = f;
			f = class239.aFloatArray2384[i_130_ + 3];
			class239.aFloatArray2384[i_130_ + 3]
			    = class239.aFloatArray2384[i_131_ + 3];
			class239.aFloatArray2384[i_131_ + 3] = f;
			f = class239.aFloatArray2384[i_130_ + 5];
			class239.aFloatArray2384[i_130_ + 5]
			    = class239.aFloatArray2384[i_131_ + 5];
			class239.aFloatArray2384[i_131_ + 5] = f;
			f = class239.aFloatArray2384[i_130_ + 7];
			class239.aFloatArray2384[i_130_ + 7]
			    = class239.aFloatArray2384[i_131_ + 7];
			class239.aFloatArray2384[i_131_ + 7] = f;
		    }
		}
		for (int i_132_ = 0; i_132_ < i_95_; i_132_++)
		    class239.aFloatArray2384[i_132_]
			= class239.aFloatArray2384[2 * i_132_ + 1];
		for (int i_133_ = 0; i_133_ < i_97_; i_133_++) {
		    class239.aFloatArray2384[i_55_ - 1 - 2 * i_133_]
			= class239.aFloatArray2384[4 * i_133_];
		    class239.aFloatArray2384[i_55_ - 2 - 2 * i_133_]
			= class239.aFloatArray2384[4 * i_133_ + 1];
		    class239.aFloatArray2384[i_55_ - i_96_ - 1 - 2 * i_133_]
			= class239.aFloatArray2384[4 * i_133_ + 2];
		    class239.aFloatArray2384[i_55_ - i_96_ - 2 - 2 * i_133_]
			= class239.aFloatArray2384[4 * i_133_ + 3];
		}
		for (int i_134_ = 0; i_134_ < i_97_; i_134_++) {
		    float f = class239_102_.aFloatArray2384[2 * i_134_];
		    float f_135_
			= class239_102_.aFloatArray2384[2 * i_134_ + 1];
		    float f_136_
			= class239.aFloatArray2384[i_95_ + 2 * i_134_];
		    float f_137_
			= class239.aFloatArray2384[i_95_ + 2 * i_134_ + 1];
		    float f_138_
			= class239.aFloatArray2384[i_55_ - 2 - 2 * i_134_];
		    float f_139_
			= class239.aFloatArray2384[i_55_ - 1 - 2 * i_134_];
		    float f_140_
			= f_135_ * (f_136_ - f_138_) + f * (f_137_ + f_139_);
		    class239.aFloatArray2384[i_95_ + 2 * i_134_]
			= (f_136_ + f_138_ + f_140_) * 0.5F;
		    class239.aFloatArray2384[i_55_ - 2 - 2 * i_134_]
			= (f_136_ + f_138_ - f_140_) * 0.5F;
		    f_140_
			= f_135_ * (f_137_ + f_139_) - f * (f_136_ - f_138_);
		    class239.aFloatArray2384[i_95_ + 2 * i_134_ + 1]
			= (f_137_ - f_139_ + f_140_) * 0.5F;
		    class239.aFloatArray2384[i_55_ - 1 - 2 * i_134_]
			= (-f_137_ + f_139_ + f_140_) * 0.5F;
		}
		for (int i_141_ = 0; i_141_ < i_96_; i_141_++) {
		    class239.aFloatArray2384[i_141_]
			= ((class239.aFloatArray2384[2 * i_141_ + i_95_]
			    * class239_101_.aFloatArray2384[2 * i_141_])
			   + (class239.aFloatArray2384[2 * i_141_ + 1 + i_95_]
			      * (class239_101_.aFloatArray2384
				 [2 * i_141_ + 1])));
		    class239.aFloatArray2384[i_95_ - 1 - i_141_]
			= ((class239.aFloatArray2384[2 * i_141_ + i_95_]
			    * class239_101_.aFloatArray2384[2 * i_141_ + 1])
			   - (class239.aFloatArray2384[2 * i_141_ + 1 + i_95_]
			      * class239_101_.aFloatArray2384[2 * i_141_]));
		}
		for (int i_142_ = 0; i_142_ < i_96_; i_142_++)
		    class239.aFloatArray2384[i_55_ - i_96_ + i_142_]
			= -class239.aFloatArray2384[i_142_];
		for (int i_143_ = 0; i_143_ < i_96_; i_143_++)
		    class239.aFloatArray2384[i_143_]
			= class239.aFloatArray2384[i_96_ + i_143_];
		for (int i_144_ = 0; i_144_ < i_96_; i_144_++)
		    class239.aFloatArray2384[i_96_ + i_144_]
			= -class239.aFloatArray2384[i_96_ - i_144_ - 1];
		for (int i_145_ = 0; i_145_ < i_96_; i_145_++)
		    class239.aFloatArray2384[i_95_ + i_145_]
			= class239.aFloatArray2384[i_55_ - i_145_ - 1];
		for (int i_146_ = i_59_; i_146_ < i_60_; i_146_++) {
		    float f
			= (float) Math.sin(((double) (i_146_ - i_59_) + 0.5)
					   / (double) i_61_ * 0.5
					   * 3.141592653589793);
		    aClass239Array2764[i_93_].aFloatArray2384[i_146_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
		for (int i_147_ = i_62_; i_147_ < i_63_; i_147_++) {
		    float f
			= (float) Math.sin((((double) (i_147_ - i_62_) + 0.5)
					    / (double) i_64_ * 0.5
					    * 3.141592653589793)
					   + 1.5707963267948966);
		    aClass239Array2764[i_93_].aFloatArray2384[i_147_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
	    }
	}
	Class239[] class239s = null;
	if (anInt2735 > 0) {
	    int i_148_ = anInt2735 + i_55_ >> 2;
	    class239s = method4687(anInt2725, i_148_);
	    for (int i_149_ = 0; i_149_ < anInt2725; i_149_++) {
		if (!aBoolArray2751[i_149_]) {
		    for (int i_150_ = 0; i_150_ < anInt2736; i_150_++) {
			int i_151_ = (anInt2735 >> 1) + i_150_;
			class239s[i_149_].aFloatArray2384[i_150_]
			    += (aClass239Array2734[i_149_].aFloatArray2384
				[i_151_]);
		    }
		}
		if (!aBoolArray2759[i_149_]) {
		    for (int i_152_ = i_59_; i_152_ < i_55_ >> 1; i_152_++) {
			int i_153_ = (class239s[i_149_].anInt2382
				      - (i_55_ >> 1) + i_152_);
			class239s[i_149_].aFloatArray2384[i_153_]
			    += (aClass239Array2764[i_149_].aFloatArray2384
				[i_152_]);
		    }
		}
	    }
	}
	Class239[] class239s_154_ = aClass239Array2734;
	aClass239Array2734 = aClass239Array2764;
	aClass239Array2764 = class239s_154_;
	anInt2735 = i_55_;
	anInt2736 = i_63_ - (i_55_ >> 1);
	aBoolArray2751 = aBoolArray2759;
	atomicreference.set(class239s);
	return true;
    }
    
    void method4705() {
	if (method307() != Class375.aClass375_3903
	    && method307() != Class375.aClass375_3906
	    && (!aBool2755
		|| !((float) (anInt2773 / method4703()) > aFloat2777))) {
	    if (!method4692()) {
		Class534_Sub40 class534_sub40
		    = ((Class534_Sub40)
		       (aList2718 != null && !aList2718.isEmpty()
			? aList2718.get(0) : null));
		if (class534_sub40 == null) {
		    if (!aBool2744) {
			method4677(Class375.aClass375_3906);
			anInterface49_2717.method356(-1647859274);
			aBool2744 = true;
		    }
		    return;
		}
		aBool2744 = false;
		aBool2747 = true;
		aList2718.remove(0);
		method4783(class534_sub40);
	    }
	    method4706();
	}
    }
    
    public int method321() {
	if (aBool2754)
	    return method4691() < anInt2722 ? anInt2722 : method4691();
	throw new RuntimeException("");
    }
    
    synchronized void method4706() {
	int i = (aClass534_Sub40_2720 != null
		 ? aClass534_Sub40_2720.anInt10811 * 31645619 : 0);
	int i_155_ = 0;
	Iterator iterator = aList2748.iterator();
	while (iterator.hasNext()) {
	    Class534_Sub40 class534_sub40 = (Class534_Sub40) iterator.next();
	    i_155_ += class534_sub40.anInt10811 * 31645619;
	}
	if (aClass534_Sub40_2720 != null) {
	    if ((aClass534_Sub40_2720.aByteArray10810.length
		 - aClass534_Sub40_2720.anInt10811 * 31645619)
		< i_155_) {
		Class534_Sub40 class534_sub40 = method4680(i_155_ + anInt2733);
		class534_sub40.method16519((aClass534_Sub40_2720
					    .aByteArray10810),
					   (aClass534_Sub40_2720.anInt10811
					    * 31645619) - anInt2750,
					   anInt2733, 1478979129);
		aClass534_Sub40_2720.method16538((byte) 60);
		aClass534_Sub40_2720 = class534_sub40;
		i = anInt2750;
	    }
	} else {
	    aClass534_Sub40_2720 = method4680(i_155_);
	    anInt2733 = 0;
	    i = 0;
	}
	iterator = aList2748.iterator();
	while (iterator.hasNext()) {
	    Class534_Sub40 class534_sub40 = (Class534_Sub40) iterator.next();
	    aClass534_Sub40_2720.method16519(class534_sub40.aByteArray10810, 0,
					     (class534_sub40.anInt10811
					      * 31645619),
					     26910111);
	    anInt2733 += class534_sub40.anInt10811 * 31645619;
	    class534_sub40.method16538((byte) 76);
	}
	aClass534_Sub40_2720.anInt10811 = (i - anInt2750) * -1387468933;
	anInt2750 = 0;
	aList2748.clear();
	while (aBool2747) {
	    if (aClass534_Sub40_2720.anInt10811 * 31645619
		>= aClass534_Sub40_2720.aByteArray10810.length) {
		aBool2747 = false;
		break;
	    }
	    if (aBool2755 && (float) (anInt2773 / method4703()) > aFloat2777)
		break;
	    if (aClass534_Sub40_2720 == null || anInt2733 < 27) {
		if (aClass534_Sub40_2720 != null) {
		    anInt2750 = anInt2733;
		    aClass534_Sub40_2720.anInt10811 += anInt2733 * -1387468933;
		}
		aBool2747 = false;
		break;
	    }
	    int i_156_ = aClass534_Sub40_2720.anInt10811 * 31645619;
	    int i_157_ = 0;
	    int i_158_ = 0;
	    if (!method4693(aClass534_Sub40_2720))
		break;
	    anInt2779++;
	    if (anInt2778 < 0)
		anInt2761++;
	    aList2766.clear();
	    aList2767.clear();
	    aClass534_Sub40_2720.method16527(-861949436);
	    int i_159_ = aClass534_Sub40_2720.method16527(-1543639172);
	    int i_160_
		= (aClass534_Sub40_2720.method16527(-1123153480) & 0xff
		   | (aClass534_Sub40_2720.method16527(2045205324) & 0xff) << 8
		   | ((aClass534_Sub40_2720.method16527(-918258464) & 0xff)
		      << 16)
		   | aClass534_Sub40_2720.method16527(-1334874878) << 24);
	    i_157_ = i_160_ - i_157_;
	    aClass534_Sub40_2720.anInt10811 += -724666448;
	    int i_161_ = aClass534_Sub40_2720.method16527(-849616890);
	    int i_162_ = aClass534_Sub40_2720.anInt10811 * 31645619;
	    int i_163_ = i_162_ + i_161_;
	    if (i_163_ > i_156_ + anInt2733) {
		aClass534_Sub40_2720.anInt10811
		    = (i_156_ + anInt2733) * -1387468933;
		anInt2750
		    = aClass534_Sub40_2720.anInt10811 * 31645619 - i_156_;
		aBool2747 = false;
	    }
	    int i_164_ = i_163_;
	    int i_165_ = 0;
	    if (aBool2747) {
		for (int i_166_ = 0; i_166_ < i_161_; i_166_++) {
		    int i_167_
			= (aClass534_Sub40_2720.aByteArray10810[i_162_++]
			   & 0xff);
		    i_163_ += i_167_;
		    i_165_ += i_167_;
		    if (i_163_ > i_156_ + anInt2733) {
			aClass534_Sub40_2720.anInt10811
			    = (i_156_ + anInt2733) * -1387468933;
			anInt2750 = (aClass534_Sub40_2720.anInt10811 * 31645619
				     - i_156_);
			aBool2747 = false;
			break;
		    }
		    if (i_167_ < 255) {
			aList2766.add(Integer.valueOf(i_164_));
			aList2767.add(Integer.valueOf(i_165_));
			i_164_ = i_163_;
			i_165_ = 0;
		    }
		}
	    }
	    if (aBool2747) {
		int i_168_ = i_163_;
		int i_169_ = -1;
		Iterator iterator_170_ = aList2766.iterator();
		Iterator iterator_171_ = aList2767.iterator();
		boolean bool = false;
		anInt2770 = 0;
		while (iterator_170_.hasNext()) {
		    Integer integer = (Integer) iterator_170_.next();
		    Integer integer_172_ = (Integer) iterator_171_.next();
		    i_169_++;
		    if (method290() && aBool2760 == true
			&& anInt2779 < anInt2761 && i_169_ < anInt2778) {
			Class258 class258_173_ = this;
			class258_173_.anInt2756
			    = class258_173_.anInt2756 + (bool ? 0 : i_157_);
			bool = true;
		    } else {
			anAtomicReference2768.set(null);
			boolean bool_174_
			    = method4704(aClass534_Sub40_2720.aByteArray10810,
					 integer.intValue(),
					 integer_172_.intValue(),
					 anAtomicReference2768);
			Class239[] class239s
			    = (Class239[]) anAtomicReference2768.get();
			if (bool_174_
			    && (aBool2760 != true || anInt2779 >= anInt2761
				|| i_169_ >= anInt2778)) {
			    if (class239s != null) {
				int i_175_ = class239s[0].anInt2382;
				anInt2769 += i_175_;
				if (anInt2769 > i_160_ && i_159_ == 4) {
				    anInt2770 = anInt2769 - i_160_ - anInt2770;
				    i_175_ -= anInt2770;
				    if (anInt2770 > class239s[0].anInt2382)
					anInt2770 = class239s[0].anInt2382;
				    if (i_175_ < 0)
					i_175_ = 0;
				}
				int i_176_ = 0;
				int i_177_
				    = method289(i_175_) * class239s.length;
				if (aBool2760 == true
				    && anInt2756 < anInt2719) {
				    int i_178_ = i_177_;
				    i_177_ -= method289(anInt2719 - anInt2756);
				    if (i_177_ <= 0) {
					anInt2756 += method24(i_178_);
					method4690(class239s);
					Object object = null;
					continue;
				    }
				    i_176_ += anInt2719 - anInt2756;
				}
				if (anInt2756 + i_175_ > anInt2724
				    && (anInt2765 < anInt2738 || anInt2738 < 0)
				    && aBool2772) {
				    i_177_ -= method289(anInt2756 + i_175_
							- anInt2724 - 1);
				    if (i_177_ <= 0) {
					method4690(class239s);
					Object object = null;
					continue;
				    }
				}
				int i_179_ = method280();
				if (method4691() < method280()) {
				    int i_180_ = method280() - method4691();
				    i_177_ += i_177_ / method4691() * i_180_;
				}
				Class534_Sub40 class534_sub40
				    = method4680(i_177_);
				for (int i_181_ = i_176_; i_181_ < i_175_;
				     i_181_++) {
				    boolean bool_182_ = aBool2760;
				    if (anInt2738 != 0) {
					if (anInt2756 == anInt2719) {
					    if (anInt2757 < 0) {
						anInt2757 = anInt2745;
						anInt2778 = i_169_;
					    }
					    aBool2760 = false;
					}
					if (anInt2756 == anInt2724
					    && anInt2758 < 0)
					    anInt2758 = anInt2745;
					if (anInt2756 > anInt2724
					    && (anInt2765 < anInt2738
						|| anInt2738 < 0)
					    && aBool2772)
					    bool_182_ = true;
				    }
				    if (bool_182_
					&& (anInt2756 < anInt2719
					    || anInt2756 > anInt2724)) {
					anInt2756++;
					if (++i_158_ > i_157_)
					    throw new RuntimeException();
				    } else {
					for (int i_183_ = 0; i_183_ < i_179_;
					     i_183_++) {
					    float f;
					    if (i_183_ < class239s.length)
						f = (class239s[i_183_]
						     .aFloatArray2384[i_181_]);
					    else
						f = (class239s
						     [i_183_ % method4691()]
						     .aFloatArray2384[i_181_]);
					    if (aClass382_2763
						== Class382.aClass382_3932) {
						int i_184_ = method4707(f);
						if (aClass386_2713
						    == Class386.aClass386_4047)
						    class534_sub40.method16721
							(i_184_, 1203548667);
						else
						    class534_sub40.method16507
							(i_184_, 1007653593);
					    } else if (aClass382_2763
						       == (Class382
							   .aClass382_3930)) {
						int i_185_ = method4708(f);
						if (aClass386_2713
						    == Class386.aClass386_4047)
						    class534_sub40.method16721
							(i_185_, 1203548667);
						else
						    class534_sub40.method16507
							(i_185_, 1510614704);
					    } else if (aClass382_2763
						       == (Class382
							   .aClass382_3933)) {
						int i_186_ = method4709(f);
						class534_sub40.method16506
						    (i_186_, 1046499188);
					    } else if (aClass382_2763
						       == (Class382
							   .aClass382_3931)) {
						int i_187_ = method4717(f);
						class534_sub40.method16506
						    (i_187_, 1589517335);
					    }
					}
					anInt2756++;
					i_158_++;
				    }
				}
				synchronized (aList2752) {
				    anInt2773
					+= method24(class534_sub40.anInt10811
						    * 31645619) / method280();
				    aList2752.add(class534_sub40);
				}
			    }
			} else if (method290()) {
			    anInt2735 = 0;
			    if (aClass239Array2734 == null
				|| (aClass239Array2734 != null
				    && (aClass239Array2734.length != anInt2725
					|| (aClass239Array2734[0].anInt2382
					    != anInt2727)))) {
				if (aClass239Array2734 != null)
				    method4690(aClass239Array2734);
				aClass239Array2734
				    = method4687(anInt2725, anInt2727);
			    }
			}
			method4690(class239s);
			Object object = null;
		    }
		}
		aClass534_Sub40_2720.anInt10811 = i_168_ * -1387468933;
		anInt2733 -= i_168_ - i_156_;
	    }
	}
    }
    
    int method4707(float f) {
	int i = (int) (f * 32767.0F);
	if (i > 32767)
	    return 32767;
	if (i < -32768)
	    return -32768;
	return i;
    }
    
    int method4708(float f) {
	int i = (int) (f * 32767.0F + 32768.0F);
	if (i > 65535)
	    return 65535;
	if (i < 0)
	    return 0;
	return i;
    }
    
    int method4709(float f) {
	int i = (int) (f * 127.0F);
	if (i > 127)
	    return 127;
	if (i < -128)
	    return -128;
	return i;
    }
    
    synchronized void method4710() {
	int i = (aClass534_Sub40_2720 != null
		 ? aClass534_Sub40_2720.anInt10811 * 31645619 : 0);
	int i_188_ = 0;
	Iterator iterator = aList2748.iterator();
	while (iterator.hasNext()) {
	    Class534_Sub40 class534_sub40 = (Class534_Sub40) iterator.next();
	    i_188_ += class534_sub40.anInt10811 * 31645619;
	}
	if (aClass534_Sub40_2720 != null) {
	    if ((aClass534_Sub40_2720.aByteArray10810.length
		 - aClass534_Sub40_2720.anInt10811 * 31645619)
		< i_188_) {
		Class534_Sub40 class534_sub40 = method4680(i_188_ + anInt2733);
		class534_sub40.method16519((aClass534_Sub40_2720
					    .aByteArray10810),
					   (aClass534_Sub40_2720.anInt10811
					    * 31645619) - anInt2750,
					   anInt2733, -1062049701);
		aClass534_Sub40_2720.method16538((byte) 58);
		aClass534_Sub40_2720 = class534_sub40;
		i = anInt2750;
	    }
	} else {
	    aClass534_Sub40_2720 = method4680(i_188_);
	    anInt2733 = 0;
	    i = 0;
	}
	iterator = aList2748.iterator();
	while (iterator.hasNext()) {
	    Class534_Sub40 class534_sub40 = (Class534_Sub40) iterator.next();
	    aClass534_Sub40_2720.method16519(class534_sub40.aByteArray10810, 0,
					     (class534_sub40.anInt10811
					      * 31645619),
					     -386086800);
	    anInt2733 += class534_sub40.anInt10811 * 31645619;
	    class534_sub40.method16538((byte) 63);
	}
	aClass534_Sub40_2720.anInt10811 = (i - anInt2750) * -1387468933;
	anInt2750 = 0;
	aList2748.clear();
	while (aBool2747) {
	    if (aClass534_Sub40_2720.anInt10811 * 31645619
		>= aClass534_Sub40_2720.aByteArray10810.length) {
		aBool2747 = false;
		break;
	    }
	    if (aBool2755 && (float) (anInt2773 / method4703()) > aFloat2777)
		break;
	    if (aClass534_Sub40_2720 == null || anInt2733 < 27) {
		if (aClass534_Sub40_2720 != null) {
		    anInt2750 = anInt2733;
		    aClass534_Sub40_2720.anInt10811 += anInt2733 * -1387468933;
		}
		aBool2747 = false;
		break;
	    }
	    int i_189_ = aClass534_Sub40_2720.anInt10811 * 31645619;
	    int i_190_ = 0;
	    int i_191_ = 0;
	    if (!method4693(aClass534_Sub40_2720))
		break;
	    anInt2779++;
	    if (anInt2778 < 0)
		anInt2761++;
	    aList2766.clear();
	    aList2767.clear();
	    aClass534_Sub40_2720.method16527(1812397099);
	    int i_192_ = aClass534_Sub40_2720.method16527(1561374973);
	    int i_193_
		= (aClass534_Sub40_2720.method16527(317274892) & 0xff
		   | (aClass534_Sub40_2720.method16527(1693652436) & 0xff) << 8
		   | ((aClass534_Sub40_2720.method16527(-383878639) & 0xff)
		      << 16)
		   | aClass534_Sub40_2720.method16527(1903216692) << 24);
	    i_190_ = i_193_ - i_190_;
	    aClass534_Sub40_2720.anInt10811 += -724666448;
	    int i_194_ = aClass534_Sub40_2720.method16527(-1469595859);
	    int i_195_ = aClass534_Sub40_2720.anInt10811 * 31645619;
	    int i_196_ = i_195_ + i_194_;
	    if (i_196_ > i_189_ + anInt2733) {
		aClass534_Sub40_2720.anInt10811
		    = (i_189_ + anInt2733) * -1387468933;
		anInt2750
		    = aClass534_Sub40_2720.anInt10811 * 31645619 - i_189_;
		aBool2747 = false;
	    }
	    int i_197_ = i_196_;
	    int i_198_ = 0;
	    if (aBool2747) {
		for (int i_199_ = 0; i_199_ < i_194_; i_199_++) {
		    int i_200_
			= (aClass534_Sub40_2720.aByteArray10810[i_195_++]
			   & 0xff);
		    i_196_ += i_200_;
		    i_198_ += i_200_;
		    if (i_196_ > i_189_ + anInt2733) {
			aClass534_Sub40_2720.anInt10811
			    = (i_189_ + anInt2733) * -1387468933;
			anInt2750 = (aClass534_Sub40_2720.anInt10811 * 31645619
				     - i_189_);
			aBool2747 = false;
			break;
		    }
		    if (i_200_ < 255) {
			aList2766.add(Integer.valueOf(i_197_));
			aList2767.add(Integer.valueOf(i_198_));
			i_197_ = i_196_;
			i_198_ = 0;
		    }
		}
	    }
	    if (aBool2747) {
		int i_201_ = i_196_;
		int i_202_ = -1;
		Iterator iterator_203_ = aList2766.iterator();
		Iterator iterator_204_ = aList2767.iterator();
		boolean bool = false;
		anInt2770 = 0;
		while (iterator_203_.hasNext()) {
		    Integer integer = (Integer) iterator_203_.next();
		    Integer integer_205_ = (Integer) iterator_204_.next();
		    i_202_++;
		    if (method290() && aBool2760 == true
			&& anInt2779 < anInt2761 && i_202_ < anInt2778) {
			Class258 class258_206_ = this;
			class258_206_.anInt2756
			    = class258_206_.anInt2756 + (bool ? 0 : i_190_);
			bool = true;
		    } else {
			anAtomicReference2768.set(null);
			boolean bool_207_
			    = method4704(aClass534_Sub40_2720.aByteArray10810,
					 integer.intValue(),
					 integer_205_.intValue(),
					 anAtomicReference2768);
			Class239[] class239s
			    = (Class239[]) anAtomicReference2768.get();
			if (bool_207_
			    && (aBool2760 != true || anInt2779 >= anInt2761
				|| i_202_ >= anInt2778)) {
			    if (class239s != null) {
				int i_208_ = class239s[0].anInt2382;
				anInt2769 += i_208_;
				if (anInt2769 > i_193_ && i_192_ == 4) {
				    anInt2770 = anInt2769 - i_193_ - anInt2770;
				    i_208_ -= anInt2770;
				    if (anInt2770 > class239s[0].anInt2382)
					anInt2770 = class239s[0].anInt2382;
				    if (i_208_ < 0)
					i_208_ = 0;
				}
				int i_209_ = 0;
				int i_210_
				    = method289(i_208_) * class239s.length;
				if (aBool2760 == true
				    && anInt2756 < anInt2719) {
				    int i_211_ = i_210_;
				    i_210_ -= method289(anInt2719 - anInt2756);
				    if (i_210_ <= 0) {
					anInt2756 += method24(i_211_);
					method4690(class239s);
					Object object = null;
					continue;
				    }
				    i_209_ += anInt2719 - anInt2756;
				}
				if (anInt2756 + i_208_ > anInt2724
				    && (anInt2765 < anInt2738 || anInt2738 < 0)
				    && aBool2772) {
				    i_210_ -= method289(anInt2756 + i_208_
							- anInt2724 - 1);
				    if (i_210_ <= 0) {
					method4690(class239s);
					Object object = null;
					continue;
				    }
				}
				int i_212_ = method280();
				if (method4691() < method280()) {
				    int i_213_ = method280() - method4691();
				    i_210_ += i_210_ / method4691() * i_213_;
				}
				Class534_Sub40 class534_sub40
				    = method4680(i_210_);
				for (int i_214_ = i_209_; i_214_ < i_208_;
				     i_214_++) {
				    boolean bool_215_ = aBool2760;
				    if (anInt2738 != 0) {
					if (anInt2756 == anInt2719) {
					    if (anInt2757 < 0) {
						anInt2757 = anInt2745;
						anInt2778 = i_202_;
					    }
					    aBool2760 = false;
					}
					if (anInt2756 == anInt2724
					    && anInt2758 < 0)
					    anInt2758 = anInt2745;
					if (anInt2756 > anInt2724
					    && (anInt2765 < anInt2738
						|| anInt2738 < 0)
					    && aBool2772)
					    bool_215_ = true;
				    }
				    if (bool_215_
					&& (anInt2756 < anInt2719
					    || anInt2756 > anInt2724)) {
					anInt2756++;
					if (++i_191_ > i_190_)
					    throw new RuntimeException();
				    } else {
					for (int i_216_ = 0; i_216_ < i_212_;
					     i_216_++) {
					    float f;
					    if (i_216_ < class239s.length)
						f = (class239s[i_216_]
						     .aFloatArray2384[i_214_]);
					    else
						f = (class239s
						     [i_216_ % method4691()]
						     .aFloatArray2384[i_214_]);
					    if (aClass382_2763
						== Class382.aClass382_3932) {
						int i_217_ = method4707(f);
						if (aClass386_2713
						    == Class386.aClass386_4047)
						    class534_sub40.method16721
							(i_217_, 1203548667);
						else
						    class534_sub40.method16507
							(i_217_, 1502923284);
					    } else if (aClass382_2763
						       == (Class382
							   .aClass382_3930)) {
						int i_218_ = method4708(f);
						if (aClass386_2713
						    == Class386.aClass386_4047)
						    class534_sub40.method16721
							(i_218_, 1203548667);
						else
						    class534_sub40.method16507
							(i_218_, 1820592237);
					    } else if (aClass382_2763
						       == (Class382
							   .aClass382_3933)) {
						int i_219_ = method4709(f);
						class534_sub40.method16506
						    (i_219_, 1229040176);
					    } else if (aClass382_2763
						       == (Class382
							   .aClass382_3931)) {
						int i_220_ = method4717(f);
						class534_sub40.method16506
						    (i_220_, 2002567801);
					    }
					}
					anInt2756++;
					i_191_++;
				    }
				}
				synchronized (aList2752) {
				    anInt2773
					+= method24(class534_sub40.anInt10811
						    * 31645619) / method280();
				    aList2752.add(class534_sub40);
				}
			    }
			} else if (method290()) {
			    anInt2735 = 0;
			    if (aClass239Array2734 == null
				|| (aClass239Array2734 != null
				    && (aClass239Array2734.length != anInt2725
					|| (aClass239Array2734[0].anInt2382
					    != anInt2727)))) {
				if (aClass239Array2734 != null)
				    method4690(aClass239Array2734);
				aClass239Array2734
				    = method4687(anInt2725, anInt2727);
			    }
			}
			method4690(class239s);
			Object object = null;
		    }
		}
		aClass534_Sub40_2720.anInt10811 = i_201_ * -1387468933;
		anInt2733 -= i_201_ - i_189_;
	    }
	}
    }
    
    Class534_Sub40 method4711(int i) {
	Class534_Sub40 class534_sub40 = method4680(method289(i));
	int i_221_ = i;
	synchronized (aList2752) {
	    while (!aList2752.isEmpty()) {
		Class534_Sub40 class534_sub40_222_
		    = (Class534_Sub40) aList2752.remove(0);
		anInt2773
		    -= (method24(class534_sub40_222_.anInt10811 * 31645619)
			/ method280());
		int i_223_ = method289(i_221_);
		int i_224_
		    = (class534_sub40_222_.anInt10811 * 31645619 < i_223_
		       ? class534_sub40_222_.anInt10811 * 31645619 : i_223_);
		class534_sub40.method16519(class534_sub40_222_.aByteArray10810,
					   0, i_224_, -1265704854);
		i_221_ -= method24(i_224_);
		int i_225_
		    = class534_sub40_222_.anInt10811 * 31645619 - i_224_;
		if (i_225_ != 0) {
		    System.arraycopy(class534_sub40_222_.aByteArray10810,
				     i_224_,
				     class534_sub40_222_.aByteArray10810, 0,
				     i_225_);
		    class534_sub40_222_.anInt10811 = i_225_ * -1387468933;
		    anInt2773 += method24(i_225_) / method280();
		    aList2752.add(0, class534_sub40_222_);
		} else
		    class534_sub40_222_.method16538((byte) 5);
		if (i_221_ <= 0)
		    break;
	    }
	    if (aList2752.isEmpty() && method307() == Class375.aClass375_3902)
		method4677(Class375.aClass375_3907);
	}
	return class534_sub40;
    }
    
    void method4712(byte[] is, int i) {
	anInt2769 = 0;
	if (!method290()) {
	    if (is == null)
		throw new RuntimeException("");
	    int i_226_ = 0;
	    if (method4694(is, i, 1))
		i_226_ = 1;
	    else if (method4694(is, i, 3))
		i_226_ = 3;
	    else if (method4694(is, i, 5))
		i_226_ = 5;
	    else
		throw new RuntimeException(new StringBuilder().append("")
					       .append
					       (i_226_).toString());
	    if (i_226_ == 1) {
		method4792(is, i + 7);
		int i_227_ = method4699(32);
		anInt2725 = method4699(8);
		anInt2728 = method4699(32);
		anInt2714 = method4699(32);
		anInt2715 = method4699(32);
		anInt2716 = method4699(32);
		anInt2771 = 1 << method4699(4);
		anInt2727 = 1 << method4699(4);
		int i_228_ = 1 << method4699(1);
		if (i_227_ != 0 || i_228_ == 0)
		    throw new RuntimeException("");
		aBool2754 = true;
		anInt2745++;
	    } else if (i_226_ != 3 && i_226_ == 5) {
		if (!method4694(is, i, 5))
		    throw new RuntimeException("");
		method4792(is, i + 7);
		if (aClass239Array2764 != null) {
		    method4690(aClass239Array2764);
		    aClass239Array2764 = null;
		}
		aClass239Array2764 = method4687(anInt2725, anInt2727);
		for (int i_229_ = 0; i_229_ < 2; i_229_++) {
		    int i_230_ = i_229_ != 0 ? anInt2727 : anInt2771;
		    int i_231_ = i_230_ >> 1;
		    int i_232_ = i_230_ >> 2;
		    int i_233_ = i_230_ >> 3;
		    Class239 class239 = method4696(i_231_);
		    for (int i_234_ = 0; i_234_ < i_232_; i_234_++) {
			class239.aFloatArray2384[2 * i_234_]
			    = (float) Math.cos((double) (4 * i_234_)
					       * 3.141592653589793
					       / (double) i_230_);
			class239.aFloatArray2384[2 * i_234_ + 1]
			    = -(float) Math.sin((double) (4 * i_234_)
						* 3.141592653589793
						/ (double) i_230_);
		    }
		    Class239 class239_235_ = method4696(i_231_);
		    for (int i_236_ = 0; i_236_ < i_232_; i_236_++) {
			class239_235_.aFloatArray2384[2 * i_236_]
			    = (float) Math.cos((double) (2 * i_236_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_230_));
			class239_235_.aFloatArray2384[2 * i_236_ + 1]
			    = (float) Math.sin((double) (2 * i_236_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_230_));
		    }
		    Class239 class239_237_ = method4696(i_232_);
		    for (int i_238_ = 0; i_238_ < i_233_; i_238_++) {
			class239_237_.aFloatArray2384[2 * i_238_]
			    = (float) Math.cos((double) (4 * i_238_ + 2)
					       * 3.141592653589793
					       / (double) i_230_);
			class239_237_.aFloatArray2384[2 * i_238_ + 1]
			    = -(float) Math.sin((double) (4 * i_238_ + 2)
						* 3.141592653589793
						/ (double) i_230_);
		    }
		    int[] is_239_ = new int[i_233_];
		    int i_240_ = Class695.method14072(i_233_ - 1, (byte) 57);
		    for (int i_241_ = 0; i_241_ < i_233_; i_241_++)
			is_239_[i_241_]
			    = Class654_Sub1_Sub3_Sub1
				  .method18642(i_241_, i_240_, (byte) 83);
		    if (i_229_ != 0) {
			aClass239_2742 = class239;
			aClass239_2743 = class239_235_;
			aClass239_2741 = class239_237_;
			anIntArray2746 = is_239_;
		    } else {
			aClass239_2739 = class239;
			aClass239_2721 = class239_235_;
			aClass239_2723 = class239_237_;
			anIntArray2712 = is_239_;
		    }
		}
		method4698();
		int i_242_ = method4699(6) + 1;
		for (int i_243_ = 0; i_243_ < i_242_; i_243_++)
		    method4699(16);
		i_242_ = method4699(6) + 1;
		if (aClass241Array2781 == null
		    || aClass241Array2781.length != i_242_)
		    aClass241Array2781 = new Class241[i_242_];
		for (int i_244_ = 0; i_244_ < i_242_; i_244_++) {
		    if (aClass241Array2781[i_244_] == null)
			aClass241Array2781[i_244_] = new Class241();
		    aClass241Array2781[i_244_].method4438(this, anInt2725);
		}
		int i_245_ = method4699(6) + 1;
		if (aClass240Array2730 == null
		    || aClass240Array2730.length != i_245_)
		    aClass240Array2730 = new Class240[i_245_];
		for (int i_246_ = 0; i_246_ < i_245_; i_246_++) {
		    if (aClass240Array2730[i_246_] == null)
			aClass240Array2730[i_246_] = new Class240();
		    aClass240Array2730[i_246_].method4431(this);
		}
		int i_247_ = method4699(6) + 1;
		if (aClass248Array2731 == null
		    || aClass248Array2731.length != i_247_)
		    aClass248Array2731 = new Class248[i_247_];
		for (int i_248_ = 0; i_248_ < i_247_; i_248_++) {
		    if (aClass248Array2731[i_248_] == null)
			aClass248Array2731[i_248_] = new Class248();
		    aClass248Array2731[i_248_].method4598(this);
		}
		int i_249_ = method4699(6) + 1;
		aBoolArray2732 = new boolean[i_249_];
		anIntArray2729 = new int[i_249_];
		for (int i_250_ = 0; i_250_ < i_249_; i_250_++) {
		    aBoolArray2732[i_250_] = method4714() != 0;
		    method4699(16);
		    method4699(16);
		    anIntArray2729[i_250_] = method4699(8);
		}
		method4682(true);
	    }
	}
    }
    
    int method4713() {
	return anInt2773;
    }
    
    public void method292(boolean bool, int i, int i_251_, int i_252_) {
	aBool2772 = bool;
	anInt2738 = i;
	anInt2719 = i_251_;
	anInt2724 = i_252_;
    }
    
    public void method308(boolean bool) {
	if (!bool)
	    method286();
	else if (method307() == Class375.aClass375_3907) {
	    method4681(true);
	    method4677(Class375.aClass375_3905);
	}
    }
    
    public void method294(boolean bool) {
	if (!bool)
	    method286();
	else if (method307() == Class375.aClass375_3907) {
	    method4681(true);
	    method4677(Class375.aClass375_3905);
	}
    }
    
    public void method326(boolean bool) {
	if (!bool)
	    method286();
	else if (method307() == Class375.aClass375_3907) {
	    method4681(true);
	    method4677(Class375.aClass375_3905);
	}
    }
    
    public void method301(boolean bool) {
	if (!bool)
	    method286();
	else if (method307() == Class375.aClass375_3907) {
	    method4681(true);
	    method4677(Class375.aClass375_3905);
	}
    }
    
    public void method306() {
	if (method307() != Class375.aClass375_3904) {
	    method4681(false);
	    method4677(Class375.aClass375_3908);
	} else {
	    method4681(false);
	    method4677(Class375.aClass375_3903);
	}
    }
    
    int method4714() {
	int i = aByteArray2753[anInt2740] >> anInt2749 & 0x1;
	anInt2749++;
	anInt2740 += anInt2749 >> 3;
	anInt2749 &= 0x7;
	return i;
    }
    
    public void method299() {
	if (method307() != Class375.aClass375_3904) {
	    method4681(false);
	    method4677(Class375.aClass375_3908);
	} else {
	    method4681(false);
	    method4677(Class375.aClass375_3903);
	}
    }
    
    public void method300() {
	if (method307() != Class375.aClass375_3904) {
	    method4681(false);
	    method4677(Class375.aClass375_3908);
	} else {
	    method4681(false);
	    method4677(Class375.aClass375_3903);
	}
    }
    
    public Class375 method302() {
	return aClass375_2737;
    }
    
    public Class375 method284() {
	return aClass375_2737;
    }
    
    int method4715() {
	int i = aByteArray2753[anInt2740] >> anInt2749 & 0x1;
	anInt2749++;
	anInt2740 += anInt2749 >> 3;
	anInt2749 &= 0x7;
	return i;
    }
    
    public void method304(Interface49 interface49) {
	anInterface49_2717 = interface49;
    }
    
    public void method305(Interface49 interface49) {
	anInterface49_2717 = interface49;
    }
    
    public int method24(int i) {
	return i / (method283().anInt3929 * -1204190425 / 8);
    }
    
    public void method323(Class534_Sub40 class534_sub40) {
	if (method307() == Class375.aClass375_3902
	    || method307() == Class375.aClass375_3907) {
	    if (class534_sub40 != null)
		class534_sub40.method16538((byte) 51);
	} else if (class534_sub40 == null) {
	    boolean bool = aBool2772 && (anInt2738 > 0 && anInt2765 < anInt2738
					 || anInt2738 < 0);
	    if (aList2752.isEmpty()) {
		if (!bool) {
		    method4701();
		    method4677(Class375.aClass375_3907);
		}
	    } else if (!bool) {
		method4701();
		method4677(Class375.aClass375_3902);
	    }
	    if (bool)
		method4681(true);
	} else
	    method4756(class534_sub40);
    }
    
    public void method296() {
	if (method307() == Class375.aClass375_3903
	    || method307() == Class375.aClass375_3908
	    || method307() == Class375.aClass375_3905) {
	    method4677(Class375.aClass375_3904);
	    method4762();
	}
    }
    
    synchronized void method4716() {
	int i = (aClass534_Sub40_2720 != null
		 ? aClass534_Sub40_2720.anInt10811 * 31645619 : 0);
	int i_253_ = 0;
	Iterator iterator = aList2748.iterator();
	while (iterator.hasNext()) {
	    Class534_Sub40 class534_sub40 = (Class534_Sub40) iterator.next();
	    i_253_ += class534_sub40.anInt10811 * 31645619;
	}
	if (aClass534_Sub40_2720 != null) {
	    if ((aClass534_Sub40_2720.aByteArray10810.length
		 - aClass534_Sub40_2720.anInt10811 * 31645619)
		< i_253_) {
		Class534_Sub40 class534_sub40 = method4680(i_253_ + anInt2733);
		class534_sub40.method16519((aClass534_Sub40_2720
					    .aByteArray10810),
					   (aClass534_Sub40_2720.anInt10811
					    * 31645619) - anInt2750,
					   anInt2733, 1831308222);
		aClass534_Sub40_2720.method16538((byte) 65);
		aClass534_Sub40_2720 = class534_sub40;
		i = anInt2750;
	    }
	} else {
	    aClass534_Sub40_2720 = method4680(i_253_);
	    anInt2733 = 0;
	    i = 0;
	}
	iterator = aList2748.iterator();
	while (iterator.hasNext()) {
	    Class534_Sub40 class534_sub40 = (Class534_Sub40) iterator.next();
	    aClass534_Sub40_2720.method16519(class534_sub40.aByteArray10810, 0,
					     (class534_sub40.anInt10811
					      * 31645619),
					     -1294691698);
	    anInt2733 += class534_sub40.anInt10811 * 31645619;
	    class534_sub40.method16538((byte) 103);
	}
	aClass534_Sub40_2720.anInt10811 = (i - anInt2750) * -1387468933;
	anInt2750 = 0;
	aList2748.clear();
	while (aBool2747) {
	    if (aClass534_Sub40_2720.anInt10811 * 31645619
		>= aClass534_Sub40_2720.aByteArray10810.length) {
		aBool2747 = false;
		break;
	    }
	    if (aBool2755 && (float) (anInt2773 / method4703()) > aFloat2777)
		break;
	    if (aClass534_Sub40_2720 == null || anInt2733 < 27) {
		if (aClass534_Sub40_2720 != null) {
		    anInt2750 = anInt2733;
		    aClass534_Sub40_2720.anInt10811 += anInt2733 * -1387468933;
		}
		aBool2747 = false;
		break;
	    }
	    int i_254_ = aClass534_Sub40_2720.anInt10811 * 31645619;
	    int i_255_ = 0;
	    int i_256_ = 0;
	    if (!method4693(aClass534_Sub40_2720))
		break;
	    anInt2779++;
	    if (anInt2778 < 0)
		anInt2761++;
	    aList2766.clear();
	    aList2767.clear();
	    aClass534_Sub40_2720.method16527(-1701420753);
	    int i_257_ = aClass534_Sub40_2720.method16527(-1270530803);
	    int i_258_
		= (aClass534_Sub40_2720.method16527(-349571636) & 0xff
		   | ((aClass534_Sub40_2720.method16527(-1752609904) & 0xff)
		      << 8)
		   | (aClass534_Sub40_2720.method16527(439235389) & 0xff) << 16
		   | aClass534_Sub40_2720.method16527(1170002469) << 24);
	    i_255_ = i_258_ - i_255_;
	    aClass534_Sub40_2720.anInt10811 += -724666448;
	    int i_259_ = aClass534_Sub40_2720.method16527(-1463792869);
	    int i_260_ = aClass534_Sub40_2720.anInt10811 * 31645619;
	    int i_261_ = i_260_ + i_259_;
	    if (i_261_ > i_254_ + anInt2733) {
		aClass534_Sub40_2720.anInt10811
		    = (i_254_ + anInt2733) * -1387468933;
		anInt2750
		    = aClass534_Sub40_2720.anInt10811 * 31645619 - i_254_;
		aBool2747 = false;
	    }
	    int i_262_ = i_261_;
	    int i_263_ = 0;
	    if (aBool2747) {
		for (int i_264_ = 0; i_264_ < i_259_; i_264_++) {
		    int i_265_
			= (aClass534_Sub40_2720.aByteArray10810[i_260_++]
			   & 0xff);
		    i_261_ += i_265_;
		    i_263_ += i_265_;
		    if (i_261_ > i_254_ + anInt2733) {
			aClass534_Sub40_2720.anInt10811
			    = (i_254_ + anInt2733) * -1387468933;
			anInt2750 = (aClass534_Sub40_2720.anInt10811 * 31645619
				     - i_254_);
			aBool2747 = false;
			break;
		    }
		    if (i_265_ < 255) {
			aList2766.add(Integer.valueOf(i_262_));
			aList2767.add(Integer.valueOf(i_263_));
			i_262_ = i_261_;
			i_263_ = 0;
		    }
		}
	    }
	    if (aBool2747) {
		int i_266_ = i_261_;
		int i_267_ = -1;
		Iterator iterator_268_ = aList2766.iterator();
		Iterator iterator_269_ = aList2767.iterator();
		boolean bool = false;
		anInt2770 = 0;
		while (iterator_268_.hasNext()) {
		    Integer integer = (Integer) iterator_268_.next();
		    Integer integer_270_ = (Integer) iterator_269_.next();
		    i_267_++;
		    if (method290() && aBool2760 == true
			&& anInt2779 < anInt2761 && i_267_ < anInt2778) {
			Class258 class258_271_ = this;
			class258_271_.anInt2756
			    = class258_271_.anInt2756 + (bool ? 0 : i_255_);
			bool = true;
		    } else {
			anAtomicReference2768.set(null);
			boolean bool_272_
			    = method4704(aClass534_Sub40_2720.aByteArray10810,
					 integer.intValue(),
					 integer_270_.intValue(),
					 anAtomicReference2768);
			Class239[] class239s
			    = (Class239[]) anAtomicReference2768.get();
			if (bool_272_
			    && (aBool2760 != true || anInt2779 >= anInt2761
				|| i_267_ >= anInt2778)) {
			    if (class239s != null) {
				int i_273_ = class239s[0].anInt2382;
				anInt2769 += i_273_;
				if (anInt2769 > i_258_ && i_257_ == 4) {
				    anInt2770 = anInt2769 - i_258_ - anInt2770;
				    i_273_ -= anInt2770;
				    if (anInt2770 > class239s[0].anInt2382)
					anInt2770 = class239s[0].anInt2382;
				    if (i_273_ < 0)
					i_273_ = 0;
				}
				int i_274_ = 0;
				int i_275_
				    = method289(i_273_) * class239s.length;
				if (aBool2760 == true
				    && anInt2756 < anInt2719) {
				    int i_276_ = i_275_;
				    i_275_ -= method289(anInt2719 - anInt2756);
				    if (i_275_ <= 0) {
					anInt2756 += method24(i_276_);
					method4690(class239s);
					Object object = null;
					continue;
				    }
				    i_274_ += anInt2719 - anInt2756;
				}
				if (anInt2756 + i_273_ > anInt2724
				    && (anInt2765 < anInt2738 || anInt2738 < 0)
				    && aBool2772) {
				    i_275_ -= method289(anInt2756 + i_273_
							- anInt2724 - 1);
				    if (i_275_ <= 0) {
					method4690(class239s);
					Object object = null;
					continue;
				    }
				}
				int i_277_ = method280();
				if (method4691() < method280()) {
				    int i_278_ = method280() - method4691();
				    i_275_ += i_275_ / method4691() * i_278_;
				}
				Class534_Sub40 class534_sub40
				    = method4680(i_275_);
				for (int i_279_ = i_274_; i_279_ < i_273_;
				     i_279_++) {
				    boolean bool_280_ = aBool2760;
				    if (anInt2738 != 0) {
					if (anInt2756 == anInt2719) {
					    if (anInt2757 < 0) {
						anInt2757 = anInt2745;
						anInt2778 = i_267_;
					    }
					    aBool2760 = false;
					}
					if (anInt2756 == anInt2724
					    && anInt2758 < 0)
					    anInt2758 = anInt2745;
					if (anInt2756 > anInt2724
					    && (anInt2765 < anInt2738
						|| anInt2738 < 0)
					    && aBool2772)
					    bool_280_ = true;
				    }
				    if (bool_280_
					&& (anInt2756 < anInt2719
					    || anInt2756 > anInt2724)) {
					anInt2756++;
					if (++i_256_ > i_255_)
					    throw new RuntimeException();
				    } else {
					for (int i_281_ = 0; i_281_ < i_277_;
					     i_281_++) {
					    float f;
					    if (i_281_ < class239s.length)
						f = (class239s[i_281_]
						     .aFloatArray2384[i_279_]);
					    else
						f = (class239s
						     [i_281_ % method4691()]
						     .aFloatArray2384[i_279_]);
					    if (aClass382_2763
						== Class382.aClass382_3932) {
						int i_282_ = method4707(f);
						if (aClass386_2713
						    == Class386.aClass386_4047)
						    class534_sub40.method16721
							(i_282_, 1203548667);
						else
						    class534_sub40.method16507
							(i_282_, 1581778825);
					    } else if (aClass382_2763
						       == (Class382
							   .aClass382_3930)) {
						int i_283_ = method4708(f);
						if (aClass386_2713
						    == Class386.aClass386_4047)
						    class534_sub40.method16721
							(i_283_, 1203548667);
						else
						    class534_sub40.method16507
							(i_283_, 2120733981);
					    } else if (aClass382_2763
						       == (Class382
							   .aClass382_3933)) {
						int i_284_ = method4709(f);
						class534_sub40.method16506
						    (i_284_, 916062276);
					    } else if (aClass382_2763
						       == (Class382
							   .aClass382_3931)) {
						int i_285_ = method4717(f);
						class534_sub40.method16506
						    (i_285_, 1535374145);
					    }
					}
					anInt2756++;
					i_256_++;
				    }
				}
				synchronized (aList2752) {
				    anInt2773
					+= method24(class534_sub40.anInt10811
						    * 31645619) / method280();
				    aList2752.add(class534_sub40);
				}
			    }
			} else if (method290()) {
			    anInt2735 = 0;
			    if (aClass239Array2734 == null
				|| (aClass239Array2734 != null
				    && (aClass239Array2734.length != anInt2725
					|| (aClass239Array2734[0].anInt2382
					    != anInt2727)))) {
				if (aClass239Array2734 != null)
				    method4690(aClass239Array2734);
				aClass239Array2734
				    = method4687(anInt2725, anInt2727);
			    }
			}
			method4690(class239s);
			Object object = null;
		    }
		}
		aClass534_Sub40_2720.anInt10811 = i_266_ * -1387468933;
		anInt2733 -= i_266_ - i_254_;
	    }
	}
    }
    
    public Class534_Sub40 method310(int i) {
	Class534_Sub40 class534_sub40 = method4711(i);
	return class534_sub40;
    }
    
    int method4717(float f) {
	int i = (int) (f * 127.0F + 128.0F);
	if (i > 255)
	    return 255;
	if (i < 0)
	    return 0;
	return i;
    }
    
    public Class534_Sub40 method311(int i) {
	Class534_Sub40 class534_sub40 = method4711(i);
	return class534_sub40;
    }
    
    public Class534_Sub40 method312(int i) {
	Class534_Sub40 class534_sub40 = method4711(i);
	return class534_sub40;
    }
    
    public Class534_Sub40 method313(int i) {
	Class534_Sub40 class534_sub40 = method4711(i);
	return class534_sub40;
    }
    
    public int method314() {
	return method4713();
    }
    
    float method4718(int i) {
	int i_286_ = i & 0x1fffff;
	int i_287_ = i & ~0x7fffffff;
	int i_288_ = (i & 0x7fe00000) >> 21;
	if (i_287_ != 0)
	    i_286_ = -i_286_;
	return (float) ((double) i_286_
			* Math.pow(2.0, (double) (i_288_ - 788)));
    }
    
    public int method316() {
	return method4713();
    }
    
    public int method317(int i) {
	return i / (method283().anInt3929 * -1204190425 / 8);
    }
    
    public int method327(int i) {
	return i * (method283().anInt3929 * -1204190425 / 8);
    }
    
    public int method319(int i) {
	return i * (method283().anInt3929 * -1204190425 / 8);
    }
    
    int method4719() {
	if (method290())
	    return anInt2728;
	throw new RuntimeException("");
    }
    
    int method4720() {
	if (method290())
	    return anInt2728;
	throw new RuntimeException("");
    }
    
    int method4721() {
	if (method290())
	    return anInt2728;
	throw new RuntimeException("");
    }
    
    public Class382 method320() {
	return aClass382_2763;
    }
    
    int method4722() {
	if (aBool2754)
	    return anInt2725;
	throw new RuntimeException("");
    }
    
    int method4723() {
	if (aBool2754)
	    return anInt2725;
	throw new RuntimeException("");
    }
    
    int method4724() {
	if (aBool2754)
	    return anInt2725;
	throw new RuntimeException("");
    }
    
    public Class258(float f) {
	aClass534_Sub40_2720 = null;
	anInt2733 = 0;
	anInt2750 = 0;
	aList2752 = new ArrayList();
	aList2766 = new ArrayList();
	aList2767 = new ArrayList();
	anAtomicReference2768 = new AtomicReference(null);
	anInt2770 = 0;
	aBool2772 = false;
	anInt2773 = 0;
	aBoolArray2759 = null;
	aBoolArray2780 = null;
	aBoolArray2762 = null;
	aFloat2777 = f;
	aClass382_2763 = Class382.aClass382_3932;
	aClass386_2713 = Class386.aClass386_4047;
	method4681(false);
    }
    
    public synchronized boolean method322() {
	return aBool2755;
    }
    
    public synchronized boolean method293() {
	return aBool2755;
    }
    
    synchronized void method4725(boolean bool) {
	aBool2755 = bool;
    }
    
    Class239 method4726(int i) {
	synchronized (aClass203_2775) {
	    Object object = null;
	    Class239 class239
		= (Class239) aClass203_2775.method3892(-2080978337);
	    Class239 class239_289_ = null;
	    int i_290_ = i;
	    for (/**/; class239 != null;
		 class239 = (Class239) aClass203_2775.method3883((byte) 11)) {
		if (class239.aFloatArray2384.length > i && !class239.aBool2383
		    && (class239_289_ == null
			|| class239.aFloatArray2384.length < i_290_)) {
		    class239_289_ = class239;
		    i_290_ = class239_289_.aFloatArray2384.length;
		}
		if (class239.aFloatArray2384.length == i
		    && !class239.aBool2383)
		    break;
	    }
	    if (class239 == null)
		class239 = class239_289_;
	    if (class239 == null) {
		class239 = new Class239(this);
		int i_291_ = 0;
		boolean bool = false;
		while (!bool && i_291_ < 1000) {
		    if (aClass203_2775.method3871((long) i_291_) != null)
			i_291_++;
		    else
			bool = true;
		}
		class239.anInt2381 = i_291_;
		float[] fs = new float[i];
		class239.aFloatArray2384 = fs;
		class239.aBool2383 = true;
		class239.anInt2382 = i;
		if (aClass203_2775.method3879(502287416) >= i * 4) {
		    /* empty */
		}
		aClass203_2775.method3881(class239, (long) class239.anInt2381,
					  fs.length * 4, 1073212857);
	    } else {
		for (int i_292_ = 0; i_292_ < class239.aFloatArray2384.length;
		     i_292_++)
		    class239.aFloatArray2384[i_292_] = 0.0F;
		class239.anInt2382 = i;
	    }
	    class239.aBool2383 = true;
	    Class239 class239_293_ = class239;
	    return class239_293_;
	}
    }
    
    synchronized void method4727(boolean bool) {
	if (!bool) {
	    anInt2771 = 0;
	    anInt2727 = 0;
	    aBoolArray2732 = null;
	    anIntArray2729 = null;
	    method4690(aClass239Array2776);
	    aClass239Array2776 = null;
	    method4690(aClass239Array2734);
	    aClass239Array2734 = null;
	    anInt2735 = 0;
	    anInt2736 = 0;
	    aBoolArray2751 = null;
	    method4690(aClass239Array2764);
	    aClass239Array2764 = null;
	    method4776(aClass239_2739);
	    method4776(aClass239_2721);
	    method4776(aClass239_2723);
	    method4776(aClass239_2742);
	    method4776(aClass239_2743);
	    method4776(aClass239_2741);
	    aClass239_2739 = null;
	    aClass239_2721 = null;
	    aClass239_2723 = null;
	    aClass239_2742 = null;
	    aClass239_2743 = null;
	    aClass239_2741 = null;
	    anIntArray2712 = null;
	    anIntArray2746 = null;
	}
	anInt2769 = 0;
	Iterator iterator = aList2748.iterator();
	while (iterator.hasNext()) {
	    Class534_Sub40 class534_sub40 = (Class534_Sub40) iterator.next();
	    class534_sub40.method16538((byte) 8);
	}
	aList2748.clear();
	aBool2747 = false;
	if (aClass534_Sub40_2720 != null) {
	    synchronized (aClass534_Sub40_2720) {
		aClass534_Sub40_2720.method16538((byte) 106);
		aClass534_Sub40_2720 = null;
	    }
	}
	anInt2733 = 0;
	anInt2750 = 0;
	if (!bool) {
	    synchronized (aList2752) {
		Iterator iterator_294_ = aList2752.iterator();
		while (iterator_294_.hasNext()) {
		    Class534_Sub40 class534_sub40
			= (Class534_Sub40) iterator_294_.next();
		    class534_sub40.method16538((byte) 31);
		}
		aList2752.clear();
	    }
	    anInt2773 = 0;
	}
	synchronized (aList2718) {
	    Iterator iterator_295_ = aList2718.iterator();
	    while (iterator_295_.hasNext()) {
		Class534_Sub40 class534_sub40
		    = (Class534_Sub40) iterator_295_.next();
		class534_sub40.method16538((byte) 48);
	    }
	    aList2718.clear();
	}
	aBool2744 = false;
	anInt2756 = 0;
	anInt2745 = -1;
	anInt2779 = -1;
	if (!bool) {
	    method4682(false);
	    aBool2754 = false;
	    anInt2719 = -1;
	    anInt2724 = -1;
	    anInt2738 = 0;
	    anInt2765 = 0;
	    anInt2757 = -1;
	    anInt2758 = -1;
	    anInt2761 = -1;
	    anInt2778 = -1;
	    aBool2760 = false;
	    aBool2772 = false;
	} else {
	    anInt2765++;
	    aBool2760 = true;
	}
    }
    
    int method4728() {
	return anInt2773;
    }
    
    Class239 method4729(int i) {
	synchronized (aClass203_2775) {
	    Object object = null;
	    Class239 class239
		= (Class239) aClass203_2775.method3892(-2119508547);
	    Class239 class239_296_ = null;
	    int i_297_ = i;
	    for (/**/; class239 != null;
		 class239 = (Class239) aClass203_2775.method3883((byte) 90)) {
		if (class239.aFloatArray2384.length > i && !class239.aBool2383
		    && (class239_296_ == null
			|| class239.aFloatArray2384.length < i_297_)) {
		    class239_296_ = class239;
		    i_297_ = class239_296_.aFloatArray2384.length;
		}
		if (class239.aFloatArray2384.length == i
		    && !class239.aBool2383)
		    break;
	    }
	    if (class239 == null)
		class239 = class239_296_;
	    if (class239 == null) {
		class239 = new Class239(this);
		int i_298_ = 0;
		boolean bool = false;
		while (!bool && i_298_ < 1000) {
		    if (aClass203_2775.method3871((long) i_298_) != null)
			i_298_++;
		    else
			bool = true;
		}
		class239.anInt2381 = i_298_;
		float[] fs = new float[i];
		class239.aFloatArray2384 = fs;
		class239.aBool2383 = true;
		class239.anInt2382 = i;
		if (aClass203_2775.method3879(-2025832929) >= i * 4) {
		    /* empty */
		}
		aClass203_2775.method3881(class239, (long) class239.anInt2381,
					  fs.length * 4, 1875122894);
	    } else {
		for (int i_299_ = 0; i_299_ < class239.aFloatArray2384.length;
		     i_299_++)
		    class239.aFloatArray2384[i_299_] = 0.0F;
		class239.anInt2382 = i;
	    }
	    class239.aBool2383 = true;
	    Class239 class239_300_ = class239;
	    return class239_300_;
	}
    }
    
    void method4730(Class239 class239) {
	if (class239 != null) {
	    synchronized (aClass203_2775) {
		class239.aBool2383 = false;
	    }
	}
    }
    
    void method4731(Class239 class239) {
	if (class239 != null) {
	    synchronized (aClass203_2775) {
		class239.aBool2383 = false;
	    }
	}
    }
    
    Class534_Sub40 method4732(int i) {
	return new Class534_Sub40(i, true);
    }
    
    void method4733(Class239 class239) {
	if (class239 != null) {
	    synchronized (aClass203_2775) {
		class239.aBool2383 = false;
	    }
	}
    }
    
    synchronized void method4734(boolean bool) {
	if (!bool) {
	    anInt2771 = 0;
	    anInt2727 = 0;
	    aBoolArray2732 = null;
	    anIntArray2729 = null;
	    method4690(aClass239Array2776);
	    aClass239Array2776 = null;
	    method4690(aClass239Array2734);
	    aClass239Array2734 = null;
	    anInt2735 = 0;
	    anInt2736 = 0;
	    aBoolArray2751 = null;
	    method4690(aClass239Array2764);
	    aClass239Array2764 = null;
	    method4776(aClass239_2739);
	    method4776(aClass239_2721);
	    method4776(aClass239_2723);
	    method4776(aClass239_2742);
	    method4776(aClass239_2743);
	    method4776(aClass239_2741);
	    aClass239_2739 = null;
	    aClass239_2721 = null;
	    aClass239_2723 = null;
	    aClass239_2742 = null;
	    aClass239_2743 = null;
	    aClass239_2741 = null;
	    anIntArray2712 = null;
	    anIntArray2746 = null;
	}
	anInt2769 = 0;
	Iterator iterator = aList2748.iterator();
	while (iterator.hasNext()) {
	    Class534_Sub40 class534_sub40 = (Class534_Sub40) iterator.next();
	    class534_sub40.method16538((byte) 36);
	}
	aList2748.clear();
	aBool2747 = false;
	if (aClass534_Sub40_2720 != null) {
	    synchronized (aClass534_Sub40_2720) {
		aClass534_Sub40_2720.method16538((byte) 93);
		aClass534_Sub40_2720 = null;
	    }
	}
	anInt2733 = 0;
	anInt2750 = 0;
	if (!bool) {
	    synchronized (aList2752) {
		Iterator iterator_301_ = aList2752.iterator();
		while (iterator_301_.hasNext()) {
		    Class534_Sub40 class534_sub40
			= (Class534_Sub40) iterator_301_.next();
		    class534_sub40.method16538((byte) 24);
		}
		aList2752.clear();
	    }
	    anInt2773 = 0;
	}
	synchronized (aList2718) {
	    Iterator iterator_302_ = aList2718.iterator();
	    while (iterator_302_.hasNext()) {
		Class534_Sub40 class534_sub40
		    = (Class534_Sub40) iterator_302_.next();
		class534_sub40.method16538((byte) 124);
	    }
	    aList2718.clear();
	}
	aBool2744 = false;
	anInt2756 = 0;
	anInt2745 = -1;
	anInt2779 = -1;
	if (!bool) {
	    method4682(false);
	    aBool2754 = false;
	    anInt2719 = -1;
	    anInt2724 = -1;
	    anInt2738 = 0;
	    anInt2765 = 0;
	    anInt2757 = -1;
	    anInt2758 = -1;
	    anInt2761 = -1;
	    anInt2778 = -1;
	    aBool2760 = false;
	    aBool2772 = false;
	} else {
	    anInt2765++;
	    aBool2760 = true;
	}
    }
    
    public Class534_Sub40 method297(int i) {
	Class534_Sub40 class534_sub40 = method4711(i);
	return class534_sub40;
    }
    
    synchronized void method4735(boolean bool) {
	if (!bool) {
	    anInt2771 = 0;
	    anInt2727 = 0;
	    aBoolArray2732 = null;
	    anIntArray2729 = null;
	    method4690(aClass239Array2776);
	    aClass239Array2776 = null;
	    method4690(aClass239Array2734);
	    aClass239Array2734 = null;
	    anInt2735 = 0;
	    anInt2736 = 0;
	    aBoolArray2751 = null;
	    method4690(aClass239Array2764);
	    aClass239Array2764 = null;
	    method4776(aClass239_2739);
	    method4776(aClass239_2721);
	    method4776(aClass239_2723);
	    method4776(aClass239_2742);
	    method4776(aClass239_2743);
	    method4776(aClass239_2741);
	    aClass239_2739 = null;
	    aClass239_2721 = null;
	    aClass239_2723 = null;
	    aClass239_2742 = null;
	    aClass239_2743 = null;
	    aClass239_2741 = null;
	    anIntArray2712 = null;
	    anIntArray2746 = null;
	}
	anInt2769 = 0;
	Iterator iterator = aList2748.iterator();
	while (iterator.hasNext()) {
	    Class534_Sub40 class534_sub40 = (Class534_Sub40) iterator.next();
	    class534_sub40.method16538((byte) 61);
	}
	aList2748.clear();
	aBool2747 = false;
	if (aClass534_Sub40_2720 != null) {
	    synchronized (aClass534_Sub40_2720) {
		aClass534_Sub40_2720.method16538((byte) 19);
		aClass534_Sub40_2720 = null;
	    }
	}
	anInt2733 = 0;
	anInt2750 = 0;
	if (!bool) {
	    synchronized (aList2752) {
		Iterator iterator_303_ = aList2752.iterator();
		while (iterator_303_.hasNext()) {
		    Class534_Sub40 class534_sub40
			= (Class534_Sub40) iterator_303_.next();
		    class534_sub40.method16538((byte) 97);
		}
		aList2752.clear();
	    }
	    anInt2773 = 0;
	}
	synchronized (aList2718) {
	    Iterator iterator_304_ = aList2718.iterator();
	    while (iterator_304_.hasNext()) {
		Class534_Sub40 class534_sub40
		    = (Class534_Sub40) iterator_304_.next();
		class534_sub40.method16538((byte) 105);
	    }
	    aList2718.clear();
	}
	aBool2744 = false;
	anInt2756 = 0;
	anInt2745 = -1;
	anInt2779 = -1;
	if (!bool) {
	    method4682(false);
	    aBool2754 = false;
	    anInt2719 = -1;
	    anInt2724 = -1;
	    anInt2738 = 0;
	    anInt2765 = 0;
	    anInt2757 = -1;
	    anInt2758 = -1;
	    anInt2761 = -1;
	    anInt2778 = -1;
	    aBool2760 = false;
	    aBool2772 = false;
	} else {
	    anInt2765++;
	    aBool2760 = true;
	}
    }
    
    int method4736(float f) {
	int i = (int) (f * 127.0F);
	if (i > 127)
	    return 127;
	if (i < -128)
	    return -128;
	return i;
    }
    
    synchronized void method4737() {
	int i = (aClass534_Sub40_2720 != null
		 ? aClass534_Sub40_2720.anInt10811 * 31645619 : 0);
	int i_305_ = 0;
	Iterator iterator = aList2748.iterator();
	while (iterator.hasNext()) {
	    Class534_Sub40 class534_sub40 = (Class534_Sub40) iterator.next();
	    i_305_ += class534_sub40.anInt10811 * 31645619;
	}
	if (aClass534_Sub40_2720 != null) {
	    if ((aClass534_Sub40_2720.aByteArray10810.length
		 - aClass534_Sub40_2720.anInt10811 * 31645619)
		< i_305_) {
		Class534_Sub40 class534_sub40 = method4680(i_305_ + anInt2733);
		class534_sub40.method16519((aClass534_Sub40_2720
					    .aByteArray10810),
					   (aClass534_Sub40_2720.anInt10811
					    * 31645619) - anInt2750,
					   anInt2733, -1905622916);
		aClass534_Sub40_2720.method16538((byte) 88);
		aClass534_Sub40_2720 = class534_sub40;
		i = anInt2750;
	    }
	} else {
	    aClass534_Sub40_2720 = method4680(i_305_);
	    anInt2733 = 0;
	    i = 0;
	}
	iterator = aList2748.iterator();
	while (iterator.hasNext()) {
	    Class534_Sub40 class534_sub40 = (Class534_Sub40) iterator.next();
	    aClass534_Sub40_2720.method16519(class534_sub40.aByteArray10810, 0,
					     (class534_sub40.anInt10811
					      * 31645619),
					     -1063218093);
	    anInt2733 += class534_sub40.anInt10811 * 31645619;
	    class534_sub40.method16538((byte) 106);
	}
	aClass534_Sub40_2720.anInt10811 = (i - anInt2750) * -1387468933;
	anInt2750 = 0;
	aList2748.clear();
	while (aBool2747) {
	    if (aClass534_Sub40_2720.anInt10811 * 31645619
		>= aClass534_Sub40_2720.aByteArray10810.length) {
		aBool2747 = false;
		break;
	    }
	    if (aBool2755 && (float) (anInt2773 / method4703()) > aFloat2777)
		break;
	    if (aClass534_Sub40_2720 == null || anInt2733 < 27) {
		if (aClass534_Sub40_2720 != null) {
		    anInt2750 = anInt2733;
		    aClass534_Sub40_2720.anInt10811 += anInt2733 * -1387468933;
		}
		aBool2747 = false;
		break;
	    }
	    int i_306_ = aClass534_Sub40_2720.anInt10811 * 31645619;
	    int i_307_ = 0;
	    int i_308_ = 0;
	    if (!method4693(aClass534_Sub40_2720))
		break;
	    anInt2779++;
	    if (anInt2778 < 0)
		anInt2761++;
	    aList2766.clear();
	    aList2767.clear();
	    aClass534_Sub40_2720.method16527(-1694578266);
	    int i_309_ = aClass534_Sub40_2720.method16527(177211602);
	    int i_310_
		= (aClass534_Sub40_2720.method16527(1958603000) & 0xff
		   | (aClass534_Sub40_2720.method16527(1304312001) & 0xff) << 8
		   | ((aClass534_Sub40_2720.method16527(-750767729) & 0xff)
		      << 16)
		   | aClass534_Sub40_2720.method16527(1875434452) << 24);
	    i_307_ = i_310_ - i_307_;
	    aClass534_Sub40_2720.anInt10811 += -724666448;
	    int i_311_ = aClass534_Sub40_2720.method16527(-1783365711);
	    int i_312_ = aClass534_Sub40_2720.anInt10811 * 31645619;
	    int i_313_ = i_312_ + i_311_;
	    if (i_313_ > i_306_ + anInt2733) {
		aClass534_Sub40_2720.anInt10811
		    = (i_306_ + anInt2733) * -1387468933;
		anInt2750
		    = aClass534_Sub40_2720.anInt10811 * 31645619 - i_306_;
		aBool2747 = false;
	    }
	    int i_314_ = i_313_;
	    int i_315_ = 0;
	    if (aBool2747) {
		for (int i_316_ = 0; i_316_ < i_311_; i_316_++) {
		    int i_317_
			= (aClass534_Sub40_2720.aByteArray10810[i_312_++]
			   & 0xff);
		    i_313_ += i_317_;
		    i_315_ += i_317_;
		    if (i_313_ > i_306_ + anInt2733) {
			aClass534_Sub40_2720.anInt10811
			    = (i_306_ + anInt2733) * -1387468933;
			anInt2750 = (aClass534_Sub40_2720.anInt10811 * 31645619
				     - i_306_);
			aBool2747 = false;
			break;
		    }
		    if (i_317_ < 255) {
			aList2766.add(Integer.valueOf(i_314_));
			aList2767.add(Integer.valueOf(i_315_));
			i_314_ = i_313_;
			i_315_ = 0;
		    }
		}
	    }
	    if (aBool2747) {
		int i_318_ = i_313_;
		int i_319_ = -1;
		Iterator iterator_320_ = aList2766.iterator();
		Iterator iterator_321_ = aList2767.iterator();
		boolean bool = false;
		anInt2770 = 0;
		while (iterator_320_.hasNext()) {
		    Integer integer = (Integer) iterator_320_.next();
		    Integer integer_322_ = (Integer) iterator_321_.next();
		    i_319_++;
		    if (method290() && aBool2760 == true
			&& anInt2779 < anInt2761 && i_319_ < anInt2778) {
			Class258 class258_323_ = this;
			class258_323_.anInt2756
			    = class258_323_.anInt2756 + (bool ? 0 : i_307_);
			bool = true;
		    } else {
			anAtomicReference2768.set(null);
			boolean bool_324_
			    = method4704(aClass534_Sub40_2720.aByteArray10810,
					 integer.intValue(),
					 integer_322_.intValue(),
					 anAtomicReference2768);
			Class239[] class239s
			    = (Class239[]) anAtomicReference2768.get();
			if (bool_324_
			    && (aBool2760 != true || anInt2779 >= anInt2761
				|| i_319_ >= anInt2778)) {
			    if (class239s != null) {
				int i_325_ = class239s[0].anInt2382;
				anInt2769 += i_325_;
				if (anInt2769 > i_310_ && i_309_ == 4) {
				    anInt2770 = anInt2769 - i_310_ - anInt2770;
				    i_325_ -= anInt2770;
				    if (anInt2770 > class239s[0].anInt2382)
					anInt2770 = class239s[0].anInt2382;
				    if (i_325_ < 0)
					i_325_ = 0;
				}
				int i_326_ = 0;
				int i_327_
				    = method289(i_325_) * class239s.length;
				if (aBool2760 == true
				    && anInt2756 < anInt2719) {
				    int i_328_ = i_327_;
				    i_327_ -= method289(anInt2719 - anInt2756);
				    if (i_327_ <= 0) {
					anInt2756 += method24(i_328_);
					method4690(class239s);
					Object object = null;
					continue;
				    }
				    i_326_ += anInt2719 - anInt2756;
				}
				if (anInt2756 + i_325_ > anInt2724
				    && (anInt2765 < anInt2738 || anInt2738 < 0)
				    && aBool2772) {
				    i_327_ -= method289(anInt2756 + i_325_
							- anInt2724 - 1);
				    if (i_327_ <= 0) {
					method4690(class239s);
					Object object = null;
					continue;
				    }
				}
				int i_329_ = method280();
				if (method4691() < method280()) {
				    int i_330_ = method280() - method4691();
				    i_327_ += i_327_ / method4691() * i_330_;
				}
				Class534_Sub40 class534_sub40
				    = method4680(i_327_);
				for (int i_331_ = i_326_; i_331_ < i_325_;
				     i_331_++) {
				    boolean bool_332_ = aBool2760;
				    if (anInt2738 != 0) {
					if (anInt2756 == anInt2719) {
					    if (anInt2757 < 0) {
						anInt2757 = anInt2745;
						anInt2778 = i_319_;
					    }
					    aBool2760 = false;
					}
					if (anInt2756 == anInt2724
					    && anInt2758 < 0)
					    anInt2758 = anInt2745;
					if (anInt2756 > anInt2724
					    && (anInt2765 < anInt2738
						|| anInt2738 < 0)
					    && aBool2772)
					    bool_332_ = true;
				    }
				    if (bool_332_
					&& (anInt2756 < anInt2719
					    || anInt2756 > anInt2724)) {
					anInt2756++;
					if (++i_308_ > i_307_)
					    throw new RuntimeException();
				    } else {
					for (int i_333_ = 0; i_333_ < i_329_;
					     i_333_++) {
					    float f;
					    if (i_333_ < class239s.length)
						f = (class239s[i_333_]
						     .aFloatArray2384[i_331_]);
					    else
						f = (class239s
						     [i_333_ % method4691()]
						     .aFloatArray2384[i_331_]);
					    if (aClass382_2763
						== Class382.aClass382_3932) {
						int i_334_ = method4707(f);
						if (aClass386_2713
						    == Class386.aClass386_4047)
						    class534_sub40.method16721
							(i_334_, 1203548667);
						else
						    class534_sub40.method16507
							(i_334_, 752182142);
					    } else if (aClass382_2763
						       == (Class382
							   .aClass382_3930)) {
						int i_335_ = method4708(f);
						if (aClass386_2713
						    == Class386.aClass386_4047)
						    class534_sub40.method16721
							(i_335_, 1203548667);
						else
						    class534_sub40.method16507
							(i_335_, 1259340743);
					    } else if (aClass382_2763
						       == (Class382
							   .aClass382_3933)) {
						int i_336_ = method4709(f);
						class534_sub40.method16506
						    (i_336_, 1712761838);
					    } else if (aClass382_2763
						       == (Class382
							   .aClass382_3931)) {
						int i_337_ = method4717(f);
						class534_sub40.method16506
						    (i_337_, 678077016);
					    }
					}
					anInt2756++;
					i_308_++;
				    }
				}
				synchronized (aList2752) {
				    anInt2773
					+= method24(class534_sub40.anInt10811
						    * 31645619) / method280();
				    aList2752.add(class534_sub40);
				}
			    }
			} else if (method290()) {
			    anInt2735 = 0;
			    if (aClass239Array2734 == null
				|| (aClass239Array2734 != null
				    && (aClass239Array2734.length != anInt2725
					|| (aClass239Array2734[0].anInt2382
					    != anInt2727)))) {
				if (aClass239Array2734 != null)
				    method4690(aClass239Array2734);
				aClass239Array2734
				    = method4687(anInt2725, anInt2727);
			    }
			}
			method4690(class239s);
			Object object = null;
		    }
		}
		aClass534_Sub40_2720.anInt10811 = i_318_ * -1387468933;
		anInt2733 -= i_318_ - i_306_;
	    }
	}
    }
    
    void method4738() {
	if (method307() != Class375.aClass375_3902) {
	    method4705();
	    if (method307() == Class375.aClass375_3904)
		method4677(Class375.aClass375_3905);
	}
    }
    
    void method4739(Class534_Sub40 class534_sub40) {
	aList2748.add(class534_sub40);
    }
    
    boolean method4740() {
	return aBool2747;
    }
    
    boolean method4741(Class534_Sub40 class534_sub40) {
	if (class534_sub40.method16527(-2000631784) != 79
	    || class534_sub40.method16527(328331941) != 103
	    || class534_sub40.method16527(-1623741126) != 103
	    || class534_sub40.method16527(1971454194) != 83)
	    return false;
	return true;
    }
    
    boolean method4742(Class534_Sub40 class534_sub40) {
	if (class534_sub40.method16527(-1343326053) != 79
	    || class534_sub40.method16527(347329200) != 103
	    || class534_sub40.method16527(-1397639870) != 103
	    || class534_sub40.method16527(1652078334) != 83)
	    return false;
	return true;
    }
    
    void method4743(Class239 class239) {
	if (class239 != null) {
	    synchronized (aClass203_2775) {
		class239.aBool2383 = false;
	    }
	}
    }
    
    boolean method4744(byte[] is, int i, int i_338_) {
	if (is[i] != i_338_)
	    return false;
	if (is[i + 1] != 118 || is[i + 2] != 111 || is[i + 3] != 114
	    || is[i + 4] != 98 || is[i + 5] != 105 || is[i + 6] != 115)
	    return false;
	return true;
    }
    
    boolean method4745(byte[] is, int i, int i_339_) {
	if (is[i] != i_339_)
	    return false;
	if (is[i + 1] != 118 || is[i + 2] != 111 || is[i + 3] != 114
	    || is[i + 4] != 98 || is[i + 5] != 105 || is[i + 6] != 115)
	    return false;
	return true;
    }
    
    boolean method4746(byte[] is, int i, int i_340_) {
	if (is[i] != i_340_)
	    return false;
	if (is[i + 1] != 118 || is[i + 2] != 111 || is[i + 3] != 114
	    || is[i + 4] != 98 || is[i + 5] != 105 || is[i + 6] != 115)
	    return false;
	return true;
    }
    
    float method4747(int i) {
	int i_341_ = i & 0x1fffff;
	int i_342_ = i & ~0x7fffffff;
	int i_343_ = (i & 0x7fe00000) >> 21;
	if (i_342_ != 0)
	    i_341_ = -i_341_;
	return (float) ((double) i_341_
			* Math.pow(2.0, (double) (i_343_ - 788)));
    }
    
    float method4748(int i) {
	int i_344_ = i & 0x1fffff;
	int i_345_ = i & ~0x7fffffff;
	int i_346_ = (i & 0x7fe00000) >> 21;
	if (i_345_ != 0)
	    i_344_ = -i_344_;
	return (float) ((double) i_344_
			* Math.pow(2.0, (double) (i_346_ - 788)));
    }
    
    float method4749(int i) {
	int i_347_ = i & 0x1fffff;
	int i_348_ = i & ~0x7fffffff;
	int i_349_ = (i & 0x7fe00000) >> 21;
	if (i_348_ != 0)
	    i_347_ = -i_347_;
	return (float) ((double) i_347_
			* Math.pow(2.0, (double) (i_349_ - 788)));
    }
    
    int method4750(int i) {
	int i_350_ = 0;
	int i_351_ = 0;
	int i_352_;
	for (/**/; i >= 8 - anInt2749; i -= i_352_) {
	    i_352_ = 8 - anInt2749;
	    int i_353_ = (1 << i_352_) - 1;
	    i_350_
		+= (aByteArray2753[anInt2740] >> anInt2749 & i_353_) << i_351_;
	    anInt2749 = 0;
	    anInt2740++;
	    i_351_ += i_352_;
	}
	if (i > 0) {
	    i_352_ = (1 << i) - 1;
	    i_350_
		+= (aByteArray2753[anInt2740] >> anInt2749 & i_352_) << i_351_;
	    anInt2749 += i;
	}
	return i_350_;
    }
    
    public Class382 method283() {
	return aClass382_2763;
    }
    
    int method4751() {
	return anInt2740;
    }
    
    int method4752() {
	return anInt2740;
    }
    
    int method4753() {
	return anInt2749;
    }
    
    void method4754(byte[] is, int i) {
	aByteArray2753 = is;
	anInt2740 = i;
	anInt2749 = 0;
    }
    
    void method4755(byte[] is, int i) {
	aByteArray2753 = is;
	anInt2740 = i;
	anInt2749 = 0;
    }
    
    synchronized void method4756(Class534_Sub40 class534_sub40) {
	aList2718.add(class534_sub40);
	method4677(Class375.aClass375_3905);
    }
    
    int method4757() {
	int i = aByteArray2753[anInt2740] >> anInt2749 & 0x1;
	anInt2749++;
	anInt2740 += anInt2749 >> 3;
	anInt2749 &= 0x7;
	return i;
    }
    
    synchronized void method4758() {
	int i = (aClass534_Sub40_2720 != null
		 ? aClass534_Sub40_2720.anInt10811 * 31645619 : 0);
	int i_354_ = 0;
	Iterator iterator = aList2748.iterator();
	while (iterator.hasNext()) {
	    Class534_Sub40 class534_sub40 = (Class534_Sub40) iterator.next();
	    i_354_ += class534_sub40.anInt10811 * 31645619;
	}
	if (aClass534_Sub40_2720 != null) {
	    if ((aClass534_Sub40_2720.aByteArray10810.length
		 - aClass534_Sub40_2720.anInt10811 * 31645619)
		< i_354_) {
		Class534_Sub40 class534_sub40 = method4680(i_354_ + anInt2733);
		class534_sub40.method16519((aClass534_Sub40_2720
					    .aByteArray10810),
					   (aClass534_Sub40_2720.anInt10811
					    * 31645619) - anInt2750,
					   anInt2733, 1524790317);
		aClass534_Sub40_2720.method16538((byte) 4);
		aClass534_Sub40_2720 = class534_sub40;
		i = anInt2750;
	    }
	} else {
	    aClass534_Sub40_2720 = method4680(i_354_);
	    anInt2733 = 0;
	    i = 0;
	}
	iterator = aList2748.iterator();
	while (iterator.hasNext()) {
	    Class534_Sub40 class534_sub40 = (Class534_Sub40) iterator.next();
	    aClass534_Sub40_2720.method16519(class534_sub40.aByteArray10810, 0,
					     (class534_sub40.anInt10811
					      * 31645619),
					     -646944251);
	    anInt2733 += class534_sub40.anInt10811 * 31645619;
	    class534_sub40.method16538((byte) 35);
	}
	aClass534_Sub40_2720.anInt10811 = (i - anInt2750) * -1387468933;
	anInt2750 = 0;
	aList2748.clear();
	while (aBool2747) {
	    if (aClass534_Sub40_2720.anInt10811 * 31645619
		>= aClass534_Sub40_2720.aByteArray10810.length) {
		aBool2747 = false;
		break;
	    }
	    if (aBool2755 && (float) (anInt2773 / method4703()) > aFloat2777)
		break;
	    if (aClass534_Sub40_2720 == null || anInt2733 < 27) {
		if (aClass534_Sub40_2720 != null) {
		    anInt2750 = anInt2733;
		    aClass534_Sub40_2720.anInt10811 += anInt2733 * -1387468933;
		}
		aBool2747 = false;
		break;
	    }
	    int i_355_ = aClass534_Sub40_2720.anInt10811 * 31645619;
	    int i_356_ = 0;
	    int i_357_ = 0;
	    if (!method4693(aClass534_Sub40_2720))
		break;
	    anInt2779++;
	    if (anInt2778 < 0)
		anInt2761++;
	    aList2766.clear();
	    aList2767.clear();
	    aClass534_Sub40_2720.method16527(1034723028);
	    int i_358_ = aClass534_Sub40_2720.method16527(-1408628259);
	    int i_359_
		= (aClass534_Sub40_2720.method16527(327368776) & 0xff
		   | (aClass534_Sub40_2720.method16527(1722855188) & 0xff) << 8
		   | ((aClass534_Sub40_2720.method16527(2137378625) & 0xff)
		      << 16)
		   | aClass534_Sub40_2720.method16527(-371992017) << 24);
	    i_356_ = i_359_ - i_356_;
	    aClass534_Sub40_2720.anInt10811 += -724666448;
	    int i_360_ = aClass534_Sub40_2720.method16527(-2088630481);
	    int i_361_ = aClass534_Sub40_2720.anInt10811 * 31645619;
	    int i_362_ = i_361_ + i_360_;
	    if (i_362_ > i_355_ + anInt2733) {
		aClass534_Sub40_2720.anInt10811
		    = (i_355_ + anInt2733) * -1387468933;
		anInt2750
		    = aClass534_Sub40_2720.anInt10811 * 31645619 - i_355_;
		aBool2747 = false;
	    }
	    int i_363_ = i_362_;
	    int i_364_ = 0;
	    if (aBool2747) {
		for (int i_365_ = 0; i_365_ < i_360_; i_365_++) {
		    int i_366_
			= (aClass534_Sub40_2720.aByteArray10810[i_361_++]
			   & 0xff);
		    i_362_ += i_366_;
		    i_364_ += i_366_;
		    if (i_362_ > i_355_ + anInt2733) {
			aClass534_Sub40_2720.anInt10811
			    = (i_355_ + anInt2733) * -1387468933;
			anInt2750 = (aClass534_Sub40_2720.anInt10811 * 31645619
				     - i_355_);
			aBool2747 = false;
			break;
		    }
		    if (i_366_ < 255) {
			aList2766.add(Integer.valueOf(i_363_));
			aList2767.add(Integer.valueOf(i_364_));
			i_363_ = i_362_;
			i_364_ = 0;
		    }
		}
	    }
	    if (aBool2747) {
		int i_367_ = i_362_;
		int i_368_ = -1;
		Iterator iterator_369_ = aList2766.iterator();
		Iterator iterator_370_ = aList2767.iterator();
		boolean bool = false;
		anInt2770 = 0;
		while (iterator_369_.hasNext()) {
		    Integer integer = (Integer) iterator_369_.next();
		    Integer integer_371_ = (Integer) iterator_370_.next();
		    i_368_++;
		    if (method290() && aBool2760 == true
			&& anInt2779 < anInt2761 && i_368_ < anInt2778) {
			Class258 class258_372_ = this;
			class258_372_.anInt2756
			    = class258_372_.anInt2756 + (bool ? 0 : i_356_);
			bool = true;
		    } else {
			anAtomicReference2768.set(null);
			boolean bool_373_
			    = method4704(aClass534_Sub40_2720.aByteArray10810,
					 integer.intValue(),
					 integer_371_.intValue(),
					 anAtomicReference2768);
			Class239[] class239s
			    = (Class239[]) anAtomicReference2768.get();
			if (bool_373_
			    && (aBool2760 != true || anInt2779 >= anInt2761
				|| i_368_ >= anInt2778)) {
			    if (class239s != null) {
				int i_374_ = class239s[0].anInt2382;
				anInt2769 += i_374_;
				if (anInt2769 > i_359_ && i_358_ == 4) {
				    anInt2770 = anInt2769 - i_359_ - anInt2770;
				    i_374_ -= anInt2770;
				    if (anInt2770 > class239s[0].anInt2382)
					anInt2770 = class239s[0].anInt2382;
				    if (i_374_ < 0)
					i_374_ = 0;
				}
				int i_375_ = 0;
				int i_376_
				    = method289(i_374_) * class239s.length;
				if (aBool2760 == true
				    && anInt2756 < anInt2719) {
				    int i_377_ = i_376_;
				    i_376_ -= method289(anInt2719 - anInt2756);
				    if (i_376_ <= 0) {
					anInt2756 += method24(i_377_);
					method4690(class239s);
					Object object = null;
					continue;
				    }
				    i_375_ += anInt2719 - anInt2756;
				}
				if (anInt2756 + i_374_ > anInt2724
				    && (anInt2765 < anInt2738 || anInt2738 < 0)
				    && aBool2772) {
				    i_376_ -= method289(anInt2756 + i_374_
							- anInt2724 - 1);
				    if (i_376_ <= 0) {
					method4690(class239s);
					Object object = null;
					continue;
				    }
				}
				int i_378_ = method280();
				if (method4691() < method280()) {
				    int i_379_ = method280() - method4691();
				    i_376_ += i_376_ / method4691() * i_379_;
				}
				Class534_Sub40 class534_sub40
				    = method4680(i_376_);
				for (int i_380_ = i_375_; i_380_ < i_374_;
				     i_380_++) {
				    boolean bool_381_ = aBool2760;
				    if (anInt2738 != 0) {
					if (anInt2756 == anInt2719) {
					    if (anInt2757 < 0) {
						anInt2757 = anInt2745;
						anInt2778 = i_368_;
					    }
					    aBool2760 = false;
					}
					if (anInt2756 == anInt2724
					    && anInt2758 < 0)
					    anInt2758 = anInt2745;
					if (anInt2756 > anInt2724
					    && (anInt2765 < anInt2738
						|| anInt2738 < 0)
					    && aBool2772)
					    bool_381_ = true;
				    }
				    if (bool_381_
					&& (anInt2756 < anInt2719
					    || anInt2756 > anInt2724)) {
					anInt2756++;
					if (++i_357_ > i_356_)
					    throw new RuntimeException();
				    } else {
					for (int i_382_ = 0; i_382_ < i_378_;
					     i_382_++) {
					    float f;
					    if (i_382_ < class239s.length)
						f = (class239s[i_382_]
						     .aFloatArray2384[i_380_]);
					    else
						f = (class239s
						     [i_382_ % method4691()]
						     .aFloatArray2384[i_380_]);
					    if (aClass382_2763
						== Class382.aClass382_3932) {
						int i_383_ = method4707(f);
						if (aClass386_2713
						    == Class386.aClass386_4047)
						    class534_sub40.method16721
							(i_383_, 1203548667);
						else
						    class534_sub40.method16507
							(i_383_, 1970678552);
					    } else if (aClass382_2763
						       == (Class382
							   .aClass382_3930)) {
						int i_384_ = method4708(f);
						if (aClass386_2713
						    == Class386.aClass386_4047)
						    class534_sub40.method16721
							(i_384_, 1203548667);
						else
						    class534_sub40.method16507
							(i_384_, 966634622);
					    } else if (aClass382_2763
						       == (Class382
							   .aClass382_3933)) {
						int i_385_ = method4709(f);
						class534_sub40.method16506
						    (i_385_, 899324198);
					    } else if (aClass382_2763
						       == (Class382
							   .aClass382_3931)) {
						int i_386_ = method4717(f);
						class534_sub40.method16506
						    (i_386_, 398172581);
					    }
					}
					anInt2756++;
					i_357_++;
				    }
				}
				synchronized (aList2752) {
				    anInt2773
					+= method24(class534_sub40.anInt10811
						    * 31645619) / method280();
				    aList2752.add(class534_sub40);
				}
			    }
			} else if (method290()) {
			    anInt2735 = 0;
			    if (aClass239Array2734 == null
				|| (aClass239Array2734 != null
				    && (aClass239Array2734.length != anInt2725
					|| (aClass239Array2734[0].anInt2382
					    != anInt2727)))) {
				if (aClass239Array2734 != null)
				    method4690(aClass239Array2734);
				aClass239Array2734
				    = method4687(anInt2725, anInt2727);
			    }
			}
			method4690(class239s);
			Object object = null;
		    }
		}
		aClass534_Sub40_2720.anInt10811 = i_367_ * -1387468933;
		anInt2733 -= i_367_ - i_355_;
	    }
	}
    }
    
    int method4759(float f) {
	int i = (int) (f * 127.0F);
	if (i > 127)
	    return 127;
	if (i < -128)
	    return -128;
	return i;
    }
    
    int method4760(int i) {
	int i_387_ = 0;
	int i_388_ = 0;
	int i_389_;
	for (/**/; i >= 8 - anInt2749; i -= i_389_) {
	    i_389_ = 8 - anInt2749;
	    int i_390_ = (1 << i_389_) - 1;
	    i_387_
		+= (aByteArray2753[anInt2740] >> anInt2749 & i_390_) << i_388_;
	    anInt2749 = 0;
	    anInt2740++;
	    i_388_ += i_389_;
	}
	if (i > 0) {
	    i_389_ = (1 << i) - 1;
	    i_387_
		+= (aByteArray2753[anInt2740] >> anInt2749 & i_389_) << i_388_;
	    anInt2749 += i;
	}
	return i_387_;
    }
    
    int method4761(int i) {
	int i_391_ = 0;
	int i_392_ = 0;
	int i_393_;
	for (/**/; i >= 8 - anInt2749; i -= i_393_) {
	    i_393_ = 8 - anInt2749;
	    int i_394_ = (1 << i_393_) - 1;
	    i_391_
		+= (aByteArray2753[anInt2740] >> anInt2749 & i_394_) << i_392_;
	    anInt2749 = 0;
	    anInt2740++;
	    i_392_ += i_393_;
	}
	if (i > 0) {
	    i_393_ = (1 << i) - 1;
	    i_391_
		+= (aByteArray2753[anInt2740] >> anInt2749 & i_393_) << i_392_;
	    anInt2749 += i;
	}
	return i_391_;
    }
    
    void method4762() {
	if (method307() != Class375.aClass375_3902) {
	    method4705();
	    if (method307() == Class375.aClass375_3904)
		method4677(Class375.aClass375_3905);
	}
    }
    
    public void method298() {
	if (method307() != Class375.aClass375_3904) {
	    method4681(false);
	    method4677(Class375.aClass375_3908);
	} else {
	    method4681(false);
	    method4677(Class375.aClass375_3903);
	}
    }
    
    public Class534_Sub40 method318(int i) {
	Class534_Sub40 class534_sub40 = method4711(i);
	return class534_sub40;
    }
    
    void method4763() {
	aByteArray2753 = null;
    }
    
    int method4764() {
	int i = aByteArray2753[anInt2740] >> anInt2749 & 0x1;
	anInt2749++;
	anInt2740 += anInt2749 >> 3;
	anInt2749 &= 0x7;
	return i;
    }
    
    void method4765() {
	int i = method4699(8) + 1;
	Iterator iterator = aList2774.iterator();
	while (iterator.hasNext()) {
	    Class249 class249 = (Class249) iterator.next();
	    if (class249.anInt2646 == 0 && class249.anInt2647 == 0) {
		if (class249.aClass256Array2645.length == i
		    && class249.anInt2649 == anInt2725
		    && class249.anInt2644 == anInt2728
		    && class249.anInt2648 == anInt2715) {
		    aClass256Array2726 = class249.aClass256Array2645;
		    for (int i_395_ = 0; i_395_ < aClass256Array2726.length;
			 i_395_++)
			aClass256Array2726[i_395_].method4667(this);
		    return;
		}
	    }
	}
	aClass256Array2726 = new Class256[i];
	for (int i_396_ = 0; i_396_ < i; i_396_++) {
	    if (aClass256Array2726[i_396_] == null)
		aClass256Array2726[i_396_] = new Class256();
	    aClass256Array2726[i_396_].method4656(this);
	}
	Class249 class249
	    = new Class249(anInt2725, anInt2728, anInt2714, anInt2716,
			   anInt2715, aClass256Array2726);
	aList2774.add(class249);
    }
    
    void method4766(byte[] is, int i) {
	anInt2769 = 0;
	if (!method290()) {
	    if (is == null)
		throw new RuntimeException("");
	    int i_397_ = 0;
	    if (method4694(is, i, 1))
		i_397_ = 1;
	    else if (method4694(is, i, 3))
		i_397_ = 3;
	    else if (method4694(is, i, 5))
		i_397_ = 5;
	    else
		throw new RuntimeException(new StringBuilder().append("")
					       .append
					       (i_397_).toString());
	    if (i_397_ == 1) {
		method4792(is, i + 7);
		int i_398_ = method4699(32);
		anInt2725 = method4699(8);
		anInt2728 = method4699(32);
		anInt2714 = method4699(32);
		anInt2715 = method4699(32);
		anInt2716 = method4699(32);
		anInt2771 = 1 << method4699(4);
		anInt2727 = 1 << method4699(4);
		int i_399_ = 1 << method4699(1);
		if (i_398_ != 0 || i_399_ == 0)
		    throw new RuntimeException("");
		aBool2754 = true;
		anInt2745++;
	    } else if (i_397_ != 3 && i_397_ == 5) {
		if (!method4694(is, i, 5))
		    throw new RuntimeException("");
		method4792(is, i + 7);
		if (aClass239Array2764 != null) {
		    method4690(aClass239Array2764);
		    aClass239Array2764 = null;
		}
		aClass239Array2764 = method4687(anInt2725, anInt2727);
		for (int i_400_ = 0; i_400_ < 2; i_400_++) {
		    int i_401_ = i_400_ != 0 ? anInt2727 : anInt2771;
		    int i_402_ = i_401_ >> 1;
		    int i_403_ = i_401_ >> 2;
		    int i_404_ = i_401_ >> 3;
		    Class239 class239 = method4696(i_402_);
		    for (int i_405_ = 0; i_405_ < i_403_; i_405_++) {
			class239.aFloatArray2384[2 * i_405_]
			    = (float) Math.cos((double) (4 * i_405_)
					       * 3.141592653589793
					       / (double) i_401_);
			class239.aFloatArray2384[2 * i_405_ + 1]
			    = -(float) Math.sin((double) (4 * i_405_)
						* 3.141592653589793
						/ (double) i_401_);
		    }
		    Class239 class239_406_ = method4696(i_402_);
		    for (int i_407_ = 0; i_407_ < i_403_; i_407_++) {
			class239_406_.aFloatArray2384[2 * i_407_]
			    = (float) Math.cos((double) (2 * i_407_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_401_));
			class239_406_.aFloatArray2384[2 * i_407_ + 1]
			    = (float) Math.sin((double) (2 * i_407_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_401_));
		    }
		    Class239 class239_408_ = method4696(i_403_);
		    for (int i_409_ = 0; i_409_ < i_404_; i_409_++) {
			class239_408_.aFloatArray2384[2 * i_409_]
			    = (float) Math.cos((double) (4 * i_409_ + 2)
					       * 3.141592653589793
					       / (double) i_401_);
			class239_408_.aFloatArray2384[2 * i_409_ + 1]
			    = -(float) Math.sin((double) (4 * i_409_ + 2)
						* 3.141592653589793
						/ (double) i_401_);
		    }
		    int[] is_410_ = new int[i_404_];
		    int i_411_ = Class695.method14072(i_404_ - 1, (byte) 70);
		    for (int i_412_ = 0; i_412_ < i_404_; i_412_++)
			is_410_[i_412_]
			    = Class654_Sub1_Sub3_Sub1
				  .method18642(i_412_, i_411_, (byte) 51);
		    if (i_400_ != 0) {
			aClass239_2742 = class239;
			aClass239_2743 = class239_406_;
			aClass239_2741 = class239_408_;
			anIntArray2746 = is_410_;
		    } else {
			aClass239_2739 = class239;
			aClass239_2721 = class239_406_;
			aClass239_2723 = class239_408_;
			anIntArray2712 = is_410_;
		    }
		}
		method4698();
		int i_413_ = method4699(6) + 1;
		for (int i_414_ = 0; i_414_ < i_413_; i_414_++)
		    method4699(16);
		i_413_ = method4699(6) + 1;
		if (aClass241Array2781 == null
		    || aClass241Array2781.length != i_413_)
		    aClass241Array2781 = new Class241[i_413_];
		for (int i_415_ = 0; i_415_ < i_413_; i_415_++) {
		    if (aClass241Array2781[i_415_] == null)
			aClass241Array2781[i_415_] = new Class241();
		    aClass241Array2781[i_415_].method4438(this, anInt2725);
		}
		int i_416_ = method4699(6) + 1;
		if (aClass240Array2730 == null
		    || aClass240Array2730.length != i_416_)
		    aClass240Array2730 = new Class240[i_416_];
		for (int i_417_ = 0; i_417_ < i_416_; i_417_++) {
		    if (aClass240Array2730[i_417_] == null)
			aClass240Array2730[i_417_] = new Class240();
		    aClass240Array2730[i_417_].method4431(this);
		}
		int i_418_ = method4699(6) + 1;
		if (aClass248Array2731 == null
		    || aClass248Array2731.length != i_418_)
		    aClass248Array2731 = new Class248[i_418_];
		for (int i_419_ = 0; i_419_ < i_418_; i_419_++) {
		    if (aClass248Array2731[i_419_] == null)
			aClass248Array2731[i_419_] = new Class248();
		    aClass248Array2731[i_419_].method4598(this);
		}
		int i_420_ = method4699(6) + 1;
		aBoolArray2732 = new boolean[i_420_];
		anIntArray2729 = new int[i_420_];
		for (int i_421_ = 0; i_421_ < i_420_; i_421_++) {
		    aBoolArray2732[i_421_] = method4714() != 0;
		    method4699(16);
		    method4699(16);
		    anIntArray2729[i_421_] = method4699(8);
		}
		method4682(true);
	    }
	}
    }
    
    void method4767(byte[] is, int i) {
	anInt2769 = 0;
	if (!method290()) {
	    if (is == null)
		throw new RuntimeException("");
	    int i_422_ = 0;
	    if (method4694(is, i, 1))
		i_422_ = 1;
	    else if (method4694(is, i, 3))
		i_422_ = 3;
	    else if (method4694(is, i, 5))
		i_422_ = 5;
	    else
		throw new RuntimeException(new StringBuilder().append("")
					       .append
					       (i_422_).toString());
	    if (i_422_ == 1) {
		method4792(is, i + 7);
		int i_423_ = method4699(32);
		anInt2725 = method4699(8);
		anInt2728 = method4699(32);
		anInt2714 = method4699(32);
		anInt2715 = method4699(32);
		anInt2716 = method4699(32);
		anInt2771 = 1 << method4699(4);
		anInt2727 = 1 << method4699(4);
		int i_424_ = 1 << method4699(1);
		if (i_423_ != 0 || i_424_ == 0)
		    throw new RuntimeException("");
		aBool2754 = true;
		anInt2745++;
	    } else if (i_422_ != 3 && i_422_ == 5) {
		if (!method4694(is, i, 5))
		    throw new RuntimeException("");
		method4792(is, i + 7);
		if (aClass239Array2764 != null) {
		    method4690(aClass239Array2764);
		    aClass239Array2764 = null;
		}
		aClass239Array2764 = method4687(anInt2725, anInt2727);
		for (int i_425_ = 0; i_425_ < 2; i_425_++) {
		    int i_426_ = i_425_ != 0 ? anInt2727 : anInt2771;
		    int i_427_ = i_426_ >> 1;
		    int i_428_ = i_426_ >> 2;
		    int i_429_ = i_426_ >> 3;
		    Class239 class239 = method4696(i_427_);
		    for (int i_430_ = 0; i_430_ < i_428_; i_430_++) {
			class239.aFloatArray2384[2 * i_430_]
			    = (float) Math.cos((double) (4 * i_430_)
					       * 3.141592653589793
					       / (double) i_426_);
			class239.aFloatArray2384[2 * i_430_ + 1]
			    = -(float) Math.sin((double) (4 * i_430_)
						* 3.141592653589793
						/ (double) i_426_);
		    }
		    Class239 class239_431_ = method4696(i_427_);
		    for (int i_432_ = 0; i_432_ < i_428_; i_432_++) {
			class239_431_.aFloatArray2384[2 * i_432_]
			    = (float) Math.cos((double) (2 * i_432_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_426_));
			class239_431_.aFloatArray2384[2 * i_432_ + 1]
			    = (float) Math.sin((double) (2 * i_432_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_426_));
		    }
		    Class239 class239_433_ = method4696(i_428_);
		    for (int i_434_ = 0; i_434_ < i_429_; i_434_++) {
			class239_433_.aFloatArray2384[2 * i_434_]
			    = (float) Math.cos((double) (4 * i_434_ + 2)
					       * 3.141592653589793
					       / (double) i_426_);
			class239_433_.aFloatArray2384[2 * i_434_ + 1]
			    = -(float) Math.sin((double) (4 * i_434_ + 2)
						* 3.141592653589793
						/ (double) i_426_);
		    }
		    int[] is_435_ = new int[i_429_];
		    int i_436_ = Class695.method14072(i_429_ - 1, (byte) 26);
		    for (int i_437_ = 0; i_437_ < i_429_; i_437_++)
			is_435_[i_437_]
			    = Class654_Sub1_Sub3_Sub1
				  .method18642(i_437_, i_436_, (byte) 15);
		    if (i_425_ != 0) {
			aClass239_2742 = class239;
			aClass239_2743 = class239_431_;
			aClass239_2741 = class239_433_;
			anIntArray2746 = is_435_;
		    } else {
			aClass239_2739 = class239;
			aClass239_2721 = class239_431_;
			aClass239_2723 = class239_433_;
			anIntArray2712 = is_435_;
		    }
		}
		method4698();
		int i_438_ = method4699(6) + 1;
		for (int i_439_ = 0; i_439_ < i_438_; i_439_++)
		    method4699(16);
		i_438_ = method4699(6) + 1;
		if (aClass241Array2781 == null
		    || aClass241Array2781.length != i_438_)
		    aClass241Array2781 = new Class241[i_438_];
		for (int i_440_ = 0; i_440_ < i_438_; i_440_++) {
		    if (aClass241Array2781[i_440_] == null)
			aClass241Array2781[i_440_] = new Class241();
		    aClass241Array2781[i_440_].method4438(this, anInt2725);
		}
		int i_441_ = method4699(6) + 1;
		if (aClass240Array2730 == null
		    || aClass240Array2730.length != i_441_)
		    aClass240Array2730 = new Class240[i_441_];
		for (int i_442_ = 0; i_442_ < i_441_; i_442_++) {
		    if (aClass240Array2730[i_442_] == null)
			aClass240Array2730[i_442_] = new Class240();
		    aClass240Array2730[i_442_].method4431(this);
		}
		int i_443_ = method4699(6) + 1;
		if (aClass248Array2731 == null
		    || aClass248Array2731.length != i_443_)
		    aClass248Array2731 = new Class248[i_443_];
		for (int i_444_ = 0; i_444_ < i_443_; i_444_++) {
		    if (aClass248Array2731[i_444_] == null)
			aClass248Array2731[i_444_] = new Class248();
		    aClass248Array2731[i_444_].method4598(this);
		}
		int i_445_ = method4699(6) + 1;
		aBoolArray2732 = new boolean[i_445_];
		anIntArray2729 = new int[i_445_];
		for (int i_446_ = 0; i_446_ < i_445_; i_446_++) {
		    aBoolArray2732[i_446_] = method4714() != 0;
		    method4699(16);
		    method4699(16);
		    anIntArray2729[i_446_] = method4699(8);
		}
		method4682(true);
	    }
	}
    }
    
    public Class386 method281() {
	return aClass386_2713;
    }
    
    int method4768(int i) {
	int i_447_ = 0;
	for (/**/; i > 0; i >>= 1)
	    i_447_++;
	return i_447_;
    }
    
    int method4769(int i) {
	int i_448_ = 0;
	for (/**/; i > 0; i >>= 1)
	    i_448_++;
	return i_448_;
    }
    
    boolean method4770(byte[] is, int i, int i_449_,
		       AtomicReference atomicreference) {
	if (is == null)
	    throw new RuntimeException("");
	if (i + i_449_ > is.length)
	    return false;
	method4792(is, i);
	int i_450_ = method4714();
	if (i_450_ != 0) {
	    method4702(is, i);
	    return false;
	}
	if (!method290())
	    throw new RuntimeException();
	int i_451_ = method4699(method4689(anIntArray2729.length - 1));
	boolean bool = aBoolArray2732[i_451_];
	int i_452_ = bool ? anInt2727 : anInt2771;
	boolean bool_453_ = false;
	boolean bool_454_ = false;
	if (bool) {
	    bool_453_ = method4714() != 0;
	    bool_454_ = method4714() != 0;
	}
	int i_455_ = i_452_ >> 1;
	int i_456_;
	int i_457_;
	int i_458_;
	if (bool && !bool_453_) {
	    i_456_ = (i_452_ >> 2) - (anInt2771 >> 2);
	    i_457_ = (i_452_ >> 2) + (anInt2771 >> 2);
	    i_458_ = anInt2771 >> 1;
	} else {
	    i_456_ = 0;
	    i_457_ = i_455_;
	    i_458_ = i_452_ >> 1;
	}
	int i_459_;
	int i_460_;
	int i_461_;
	if (bool && !bool_454_) {
	    i_459_ = i_452_ - (i_452_ >> 2) - (anInt2771 >> 2);
	    i_460_ = i_452_ - (i_452_ >> 2) + (anInt2771 >> 2);
	    i_461_ = anInt2771 >> 1;
	} else {
	    i_459_ = i_455_;
	    i_460_ = i_452_;
	    i_461_ = i_452_ >> 1;
	}
	Class248 class248 = aClass248Array2731[anIntArray2729[i_451_]];
	if (aBoolArray2759 == null || aBoolArray2759.length != anInt2725) {
	    aBoolArray2759 = new boolean[anInt2725];
	    aBoolArray2780 = new boolean[anInt2725];
	}
	for (int i_462_ = 0; i_462_ < anInt2725; i_462_++) {
	    int i_463_ = (class248.anIntArray2638 != null
			  ? class248.anIntArray2638[i_462_] : 0);
	    int i_464_ = i_463_;
	    int i_465_ = class248.anIntArray2639[i_464_];
	    aBoolArray2759[i_462_]
		= !aClass241Array2781[i_465_].method4445(i_462_);
	    aBoolArray2780[i_462_] = aBoolArray2759[i_462_];
	}
	for (int i_466_ = 0; i_466_ < class248.anInt2636; i_466_++) {
	    if (!aBoolArray2759[class248.anIntArray2642[i_466_]]
		|| !aBoolArray2759[class248.anIntArray2643[i_466_]]) {
		aBoolArray2759[class248.anIntArray2642[i_466_]] = false;
		aBoolArray2759[class248.anIntArray2643[i_466_]] = false;
	    }
	}
	if (aBoolArray2762 == null || aBoolArray2762.length != anInt2725)
	    aBoolArray2762 = new boolean[anInt2725];
	for (int i_467_ = 0; i_467_ < class248.anInt2641; i_467_++) {
	    int i_468_ = 0;
	    for (int i_469_ = 0; i_469_ < anInt2725; i_469_++) {
		int i_470_ = (class248.anIntArray2638 != null
			      ? class248.anIntArray2638[i_469_] : i_467_);
		if (i_470_ == i_467_)
		    aBoolArray2762[i_468_++] = aBoolArray2759[i_469_];
	    }
	    Class240 class240
		= aClass240Array2730[class248.anIntArray2637[i_467_]];
	    Object object = null;
	    Class239[] class239s;
	    if (class240.anInt2393 == 2) {
		Class239[] class239s_471_ = method4687(1, anInt2725 * i_452_);
		for (int i_472_ = 0; i_472_ < i_452_; i_472_++) {
		    for (int i_473_ = 0; i_473_ < anInt2725; i_473_++) {
			try {
			    class239s_471_[0].aFloatArray2384
				[i_472_ * anInt2725 + i_473_]
				= (aClass239Array2764[i_473_].aFloatArray2384
				   [i_472_]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		class239s_471_
		    = class240.method4433(class239s_471_, i_452_ >> 1,
					  aBoolArray2762);
		class239s = aClass239Array2764;
		for (int i_474_ = 0; i_474_ < i_452_; i_474_++) {
		    for (int i_475_ = 0; i_475_ < anInt2725; i_475_++) {
			try {
			    class239s[i_475_].aFloatArray2384[i_474_]
				= (class239s_471_[0].aFloatArray2384
				   [anInt2725 * i_474_ + i_475_]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		method4690(class239s_471_);
		Object object_476_ = null;
	    } else
		class239s = class240.method4433(aClass239Array2764,
						i_452_ >> 1, aBoolArray2762);
	    if (class248.anIntArray2638 != null) {
		i_468_ = 0;
		for (int i_477_ = 0; i_477_ < anInt2725; i_477_++) {
		    int i_478_ = class248.anIntArray2638[i_477_];
		    if (i_478_ == i_467_)
			aClass239Array2764[i_477_] = class239s[i_468_++];
		}
	    } else {
		if (aClass239Array2764 != class239s)
		    method4690(aClass239Array2764);
		aClass239Array2764 = class239s;
	    }
	}
	for (int i_479_ = class248.anInt2636 - 1; i_479_ >= 0; i_479_--) {
	    Class239 class239
		= aClass239Array2764[class248.anIntArray2642[i_479_]];
	    Class239 class239_480_
		= aClass239Array2764[class248.anIntArray2643[i_479_]];
	    for (int i_481_ = 0; i_481_ < class239.anInt2382; i_481_++) {
		float f = class239.aFloatArray2384[i_481_];
		float f_482_ = class239_480_.aFloatArray2384[i_481_];
		float f_483_ = f;
		float f_484_ = f_482_;
		if (f > 0.0F) {
		    if (f_482_ > 0.0F) {
			f_483_ = f;
			f_484_ = f - f_482_;
		    } else {
			f_484_ = f;
			f_483_ = f + f_482_;
		    }
		} else if (f_482_ > 0.0F) {
		    f_483_ = f;
		    f_484_ = f + f_482_;
		} else {
		    f_484_ = f;
		    f_483_ = f - f_482_;
		}
		class239.aFloatArray2384[i_481_] = f_483_;
		class239_480_.aFloatArray2384[i_481_] = f_484_;
	    }
	}
	for (int i_485_ = 0; i_485_ < aBoolArray2759.length; i_485_++)
	    aBoolArray2759[i_485_] = aBoolArray2780[i_485_];
	for (int i_486_ = 0; i_486_ < anInt2725; i_486_++) {
	    if (!aBoolArray2759[i_486_]) {
		int i_487_ = (class248.anIntArray2638 != null
			      ? class248.anIntArray2638[i_486_] : 0);
		int i_488_ = i_487_;
		int i_489_ = class248.anIntArray2639[i_488_];
		aClass241Array2781[i_489_].method4446(i_486_);
		aClass241Array2781[i_489_].method4447((aClass239Array2764
						       [i_486_]),
						      i_452_ >> 1, i_486_);
	    }
	}
	for (int i_490_ = 0; i_490_ < anInt2725; i_490_++) {
	    if (aBoolArray2759[i_490_]) {
		for (int i_491_ = i_452_ >> 1; i_491_ < i_452_; i_491_++)
		    aClass239Array2764[i_490_].aFloatArray2384[i_491_] = 0.0F;
	    } else {
		int i_492_ = i_452_ >> 1;
		int i_493_ = i_452_ >> 2;
		int i_494_ = i_452_ >> 3;
		Class239 class239 = aClass239Array2764[i_490_];
		for (int i_495_ = 0; i_495_ < i_492_; i_495_++)
		    class239.aFloatArray2384[i_495_] *= 0.5F;
		for (int i_496_ = i_492_; i_496_ < i_452_; i_496_++)
		    class239.aFloatArray2384[i_496_]
			= -class239.aFloatArray2384[i_452_ - i_496_ - 1];
		Class239 class239_497_
		    = bool ? aClass239_2742 : aClass239_2739;
		Class239 class239_498_
		    = bool ? aClass239_2743 : aClass239_2721;
		Class239 class239_499_
		    = bool ? aClass239_2741 : aClass239_2723;
		int[] is_500_ = bool ? anIntArray2746 : anIntArray2712;
		for (int i_501_ = 0; i_501_ < i_493_; i_501_++) {
		    float f = (class239.aFloatArray2384[4 * i_501_]
			       - (class239.aFloatArray2384
				  [i_452_ - 4 * i_501_ - 1]));
		    float f_502_ = (class239.aFloatArray2384[4 * i_501_ + 2]
				    - (class239.aFloatArray2384
				       [i_452_ - 4 * i_501_ - 3]));
		    float f_503_ = class239_497_.aFloatArray2384[2 * i_501_];
		    float f_504_
			= class239_497_.aFloatArray2384[2 * i_501_ + 1];
		    class239.aFloatArray2384[i_452_ - 4 * i_501_ - 1]
			= f * f_503_ - f_502_ * f_504_;
		    class239.aFloatArray2384[i_452_ - 4 * i_501_ - 3]
			= f * f_504_ + f_502_ * f_503_;
		}
		for (int i_505_ = 0; i_505_ < i_494_; i_505_++) {
		    float f
			= class239.aFloatArray2384[i_492_ + 3 + 4 * i_505_];
		    float f_506_
			= class239.aFloatArray2384[i_492_ + 1 + 4 * i_505_];
		    float f_507_ = class239.aFloatArray2384[4 * i_505_ + 3];
		    float f_508_ = class239.aFloatArray2384[4 * i_505_ + 1];
		    class239.aFloatArray2384[i_492_ + 3 + 4 * i_505_]
			= f + f_507_;
		    class239.aFloatArray2384[i_492_ + 1 + 4 * i_505_]
			= f_506_ + f_508_;
		    float f_509_ = (class239_497_.aFloatArray2384
				    [i_492_ - 4 - 4 * i_505_]);
		    float f_510_ = (class239_497_.aFloatArray2384
				    [i_492_ - 3 - 4 * i_505_]);
		    class239.aFloatArray2384[4 * i_505_ + 3]
			= (f - f_507_) * f_509_ - (f_506_ - f_508_) * f_510_;
		    class239.aFloatArray2384[4 * i_505_ + 1]
			= (f_506_ - f_508_) * f_509_ + (f - f_507_) * f_510_;
		}
		int i_511_ = Class695.method14072(i_452_ - 1, (byte) 43);
		for (int i_512_ = 0; i_512_ < i_511_ - 3; i_512_++) {
		    int i_513_ = i_452_ >> i_512_ + 2;
		    int i_514_ = 8 << i_512_;
		    for (int i_515_ = 0; i_515_ < 2 << i_512_; i_515_++) {
			int i_516_ = i_452_ - i_513_ * 2 * i_515_;
			int i_517_ = i_452_ - i_513_ * (2 * i_515_ + 1);
			for (int i_518_ = 0; i_518_ < i_452_ >> i_512_ + 4;
			     i_518_++) {
			    int i_519_ = 4 * i_518_;
			    float f = (class239.aFloatArray2384
				       [i_516_ - 1 - i_519_]);
			    float f_520_ = (class239.aFloatArray2384
					    [i_516_ - 3 - i_519_]);
			    float f_521_ = (class239.aFloatArray2384
					    [i_517_ - 1 - i_519_]);
			    float f_522_ = (class239.aFloatArray2384
					    [i_517_ - 3 - i_519_]);
			    class239.aFloatArray2384[i_516_ - 1 - i_519_]
				= f + f_521_;
			    class239.aFloatArray2384[i_516_ - 3 - i_519_]
				= f_520_ + f_522_;
			    float f_523_ = (class239_497_.aFloatArray2384
					    [i_518_ * i_514_]);
			    float f_524_ = (class239_497_.aFloatArray2384
					    [i_518_ * i_514_ + 1]);
			    class239.aFloatArray2384[i_517_ - 1 - i_519_]
				= ((f - f_521_) * f_523_
				   - (f_520_ - f_522_) * f_524_);
			    class239.aFloatArray2384[i_517_ - 3 - i_519_]
				= ((f_520_ - f_522_) * f_523_
				   + (f - f_521_) * f_524_);
			}
		    }
		}
		for (int i_525_ = 1; i_525_ < i_494_ - 1; i_525_++) {
		    int i_526_ = is_500_[i_525_];
		    if (i_525_ < i_526_) {
			int i_527_ = 8 * i_525_;
			int i_528_ = 8 * i_526_;
			float f = class239.aFloatArray2384[i_527_ + 1];
			class239.aFloatArray2384[i_527_ + 1]
			    = class239.aFloatArray2384[i_528_ + 1];
			class239.aFloatArray2384[i_528_ + 1] = f;
			f = class239.aFloatArray2384[i_527_ + 3];
			class239.aFloatArray2384[i_527_ + 3]
			    = class239.aFloatArray2384[i_528_ + 3];
			class239.aFloatArray2384[i_528_ + 3] = f;
			f = class239.aFloatArray2384[i_527_ + 5];
			class239.aFloatArray2384[i_527_ + 5]
			    = class239.aFloatArray2384[i_528_ + 5];
			class239.aFloatArray2384[i_528_ + 5] = f;
			f = class239.aFloatArray2384[i_527_ + 7];
			class239.aFloatArray2384[i_527_ + 7]
			    = class239.aFloatArray2384[i_528_ + 7];
			class239.aFloatArray2384[i_528_ + 7] = f;
		    }
		}
		for (int i_529_ = 0; i_529_ < i_492_; i_529_++)
		    class239.aFloatArray2384[i_529_]
			= class239.aFloatArray2384[2 * i_529_ + 1];
		for (int i_530_ = 0; i_530_ < i_494_; i_530_++) {
		    class239.aFloatArray2384[i_452_ - 1 - 2 * i_530_]
			= class239.aFloatArray2384[4 * i_530_];
		    class239.aFloatArray2384[i_452_ - 2 - 2 * i_530_]
			= class239.aFloatArray2384[4 * i_530_ + 1];
		    class239.aFloatArray2384[i_452_ - i_493_ - 1 - 2 * i_530_]
			= class239.aFloatArray2384[4 * i_530_ + 2];
		    class239.aFloatArray2384[i_452_ - i_493_ - 2 - 2 * i_530_]
			= class239.aFloatArray2384[4 * i_530_ + 3];
		}
		for (int i_531_ = 0; i_531_ < i_494_; i_531_++) {
		    float f = class239_499_.aFloatArray2384[2 * i_531_];
		    float f_532_
			= class239_499_.aFloatArray2384[2 * i_531_ + 1];
		    float f_533_
			= class239.aFloatArray2384[i_492_ + 2 * i_531_];
		    float f_534_
			= class239.aFloatArray2384[i_492_ + 2 * i_531_ + 1];
		    float f_535_
			= class239.aFloatArray2384[i_452_ - 2 - 2 * i_531_];
		    float f_536_
			= class239.aFloatArray2384[i_452_ - 1 - 2 * i_531_];
		    float f_537_
			= f_532_ * (f_533_ - f_535_) + f * (f_534_ + f_536_);
		    class239.aFloatArray2384[i_492_ + 2 * i_531_]
			= (f_533_ + f_535_ + f_537_) * 0.5F;
		    class239.aFloatArray2384[i_452_ - 2 - 2 * i_531_]
			= (f_533_ + f_535_ - f_537_) * 0.5F;
		    f_537_
			= f_532_ * (f_534_ + f_536_) - f * (f_533_ - f_535_);
		    class239.aFloatArray2384[i_492_ + 2 * i_531_ + 1]
			= (f_534_ - f_536_ + f_537_) * 0.5F;
		    class239.aFloatArray2384[i_452_ - 1 - 2 * i_531_]
			= (-f_534_ + f_536_ + f_537_) * 0.5F;
		}
		for (int i_538_ = 0; i_538_ < i_493_; i_538_++) {
		    class239.aFloatArray2384[i_538_]
			= ((class239.aFloatArray2384[2 * i_538_ + i_492_]
			    * class239_498_.aFloatArray2384[2 * i_538_])
			   + (class239.aFloatArray2384[2 * i_538_ + 1 + i_492_]
			      * (class239_498_.aFloatArray2384
				 [2 * i_538_ + 1])));
		    class239.aFloatArray2384[i_492_ - 1 - i_538_]
			= ((class239.aFloatArray2384[2 * i_538_ + i_492_]
			    * class239_498_.aFloatArray2384[2 * i_538_ + 1])
			   - (class239.aFloatArray2384[2 * i_538_ + 1 + i_492_]
			      * class239_498_.aFloatArray2384[2 * i_538_]));
		}
		for (int i_539_ = 0; i_539_ < i_493_; i_539_++)
		    class239.aFloatArray2384[i_452_ - i_493_ + i_539_]
			= -class239.aFloatArray2384[i_539_];
		for (int i_540_ = 0; i_540_ < i_493_; i_540_++)
		    class239.aFloatArray2384[i_540_]
			= class239.aFloatArray2384[i_493_ + i_540_];
		for (int i_541_ = 0; i_541_ < i_493_; i_541_++)
		    class239.aFloatArray2384[i_493_ + i_541_]
			= -class239.aFloatArray2384[i_493_ - i_541_ - 1];
		for (int i_542_ = 0; i_542_ < i_493_; i_542_++)
		    class239.aFloatArray2384[i_492_ + i_542_]
			= class239.aFloatArray2384[i_452_ - i_542_ - 1];
		for (int i_543_ = i_456_; i_543_ < i_457_; i_543_++) {
		    float f
			= (float) Math.sin(((double) (i_543_ - i_456_) + 0.5)
					   / (double) i_458_ * 0.5
					   * 3.141592653589793);
		    aClass239Array2764[i_490_].aFloatArray2384[i_543_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
		for (int i_544_ = i_459_; i_544_ < i_460_; i_544_++) {
		    float f
			= (float) Math.sin((((double) (i_544_ - i_459_) + 0.5)
					    / (double) i_461_ * 0.5
					    * 3.141592653589793)
					   + 1.5707963267948966);
		    aClass239Array2764[i_490_].aFloatArray2384[i_544_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
	    }
	}
	Class239[] class239s = null;
	if (anInt2735 > 0) {
	    int i_545_ = anInt2735 + i_452_ >> 2;
	    class239s = method4687(anInt2725, i_545_);
	    for (int i_546_ = 0; i_546_ < anInt2725; i_546_++) {
		if (!aBoolArray2751[i_546_]) {
		    for (int i_547_ = 0; i_547_ < anInt2736; i_547_++) {
			int i_548_ = (anInt2735 >> 1) + i_547_;
			class239s[i_546_].aFloatArray2384[i_547_]
			    += (aClass239Array2734[i_546_].aFloatArray2384
				[i_548_]);
		    }
		}
		if (!aBoolArray2759[i_546_]) {
		    for (int i_549_ = i_456_; i_549_ < i_452_ >> 1; i_549_++) {
			int i_550_ = (class239s[i_546_].anInt2382
				      - (i_452_ >> 1) + i_549_);
			class239s[i_546_].aFloatArray2384[i_550_]
			    += (aClass239Array2764[i_546_].aFloatArray2384
				[i_549_]);
		    }
		}
	    }
	}
	Class239[] class239s_551_ = aClass239Array2734;
	aClass239Array2734 = aClass239Array2764;
	aClass239Array2764 = class239s_551_;
	anInt2735 = i_452_;
	anInt2736 = i_460_ - (i_452_ >> 1);
	aBoolArray2751 = aBoolArray2759;
	atomicreference.set(class239s);
	return true;
    }
    
    boolean method4771(byte[] is, int i, int i_552_,
		       AtomicReference atomicreference) {
	if (is == null)
	    throw new RuntimeException("");
	if (i + i_552_ > is.length)
	    return false;
	method4792(is, i);
	int i_553_ = method4714();
	if (i_553_ != 0) {
	    method4702(is, i);
	    return false;
	}
	if (!method290())
	    throw new RuntimeException();
	int i_554_ = method4699(method4689(anIntArray2729.length - 1));
	boolean bool = aBoolArray2732[i_554_];
	int i_555_ = bool ? anInt2727 : anInt2771;
	boolean bool_556_ = false;
	boolean bool_557_ = false;
	if (bool) {
	    bool_556_ = method4714() != 0;
	    bool_557_ = method4714() != 0;
	}
	int i_558_ = i_555_ >> 1;
	int i_559_;
	int i_560_;
	int i_561_;
	if (bool && !bool_556_) {
	    i_559_ = (i_555_ >> 2) - (anInt2771 >> 2);
	    i_560_ = (i_555_ >> 2) + (anInt2771 >> 2);
	    i_561_ = anInt2771 >> 1;
	} else {
	    i_559_ = 0;
	    i_560_ = i_558_;
	    i_561_ = i_555_ >> 1;
	}
	int i_562_;
	int i_563_;
	int i_564_;
	if (bool && !bool_557_) {
	    i_562_ = i_555_ - (i_555_ >> 2) - (anInt2771 >> 2);
	    i_563_ = i_555_ - (i_555_ >> 2) + (anInt2771 >> 2);
	    i_564_ = anInt2771 >> 1;
	} else {
	    i_562_ = i_558_;
	    i_563_ = i_555_;
	    i_564_ = i_555_ >> 1;
	}
	Class248 class248 = aClass248Array2731[anIntArray2729[i_554_]];
	if (aBoolArray2759 == null || aBoolArray2759.length != anInt2725) {
	    aBoolArray2759 = new boolean[anInt2725];
	    aBoolArray2780 = new boolean[anInt2725];
	}
	for (int i_565_ = 0; i_565_ < anInt2725; i_565_++) {
	    int i_566_ = (class248.anIntArray2638 != null
			  ? class248.anIntArray2638[i_565_] : 0);
	    int i_567_ = i_566_;
	    int i_568_ = class248.anIntArray2639[i_567_];
	    aBoolArray2759[i_565_]
		= !aClass241Array2781[i_568_].method4445(i_565_);
	    aBoolArray2780[i_565_] = aBoolArray2759[i_565_];
	}
	for (int i_569_ = 0; i_569_ < class248.anInt2636; i_569_++) {
	    if (!aBoolArray2759[class248.anIntArray2642[i_569_]]
		|| !aBoolArray2759[class248.anIntArray2643[i_569_]]) {
		aBoolArray2759[class248.anIntArray2642[i_569_]] = false;
		aBoolArray2759[class248.anIntArray2643[i_569_]] = false;
	    }
	}
	if (aBoolArray2762 == null || aBoolArray2762.length != anInt2725)
	    aBoolArray2762 = new boolean[anInt2725];
	for (int i_570_ = 0; i_570_ < class248.anInt2641; i_570_++) {
	    int i_571_ = 0;
	    for (int i_572_ = 0; i_572_ < anInt2725; i_572_++) {
		int i_573_ = (class248.anIntArray2638 != null
			      ? class248.anIntArray2638[i_572_] : i_570_);
		if (i_573_ == i_570_)
		    aBoolArray2762[i_571_++] = aBoolArray2759[i_572_];
	    }
	    Class240 class240
		= aClass240Array2730[class248.anIntArray2637[i_570_]];
	    Object object = null;
	    Class239[] class239s;
	    if (class240.anInt2393 == 2) {
		Class239[] class239s_574_ = method4687(1, anInt2725 * i_555_);
		for (int i_575_ = 0; i_575_ < i_555_; i_575_++) {
		    for (int i_576_ = 0; i_576_ < anInt2725; i_576_++) {
			try {
			    class239s_574_[0].aFloatArray2384
				[i_575_ * anInt2725 + i_576_]
				= (aClass239Array2764[i_576_].aFloatArray2384
				   [i_575_]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		class239s_574_
		    = class240.method4433(class239s_574_, i_555_ >> 1,
					  aBoolArray2762);
		class239s = aClass239Array2764;
		for (int i_577_ = 0; i_577_ < i_555_; i_577_++) {
		    for (int i_578_ = 0; i_578_ < anInt2725; i_578_++) {
			try {
			    class239s[i_578_].aFloatArray2384[i_577_]
				= (class239s_574_[0].aFloatArray2384
				   [anInt2725 * i_577_ + i_578_]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		method4690(class239s_574_);
		Object object_579_ = null;
	    } else
		class239s = class240.method4433(aClass239Array2764,
						i_555_ >> 1, aBoolArray2762);
	    if (class248.anIntArray2638 != null) {
		i_571_ = 0;
		for (int i_580_ = 0; i_580_ < anInt2725; i_580_++) {
		    int i_581_ = class248.anIntArray2638[i_580_];
		    if (i_581_ == i_570_)
			aClass239Array2764[i_580_] = class239s[i_571_++];
		}
	    } else {
		if (aClass239Array2764 != class239s)
		    method4690(aClass239Array2764);
		aClass239Array2764 = class239s;
	    }
	}
	for (int i_582_ = class248.anInt2636 - 1; i_582_ >= 0; i_582_--) {
	    Class239 class239
		= aClass239Array2764[class248.anIntArray2642[i_582_]];
	    Class239 class239_583_
		= aClass239Array2764[class248.anIntArray2643[i_582_]];
	    for (int i_584_ = 0; i_584_ < class239.anInt2382; i_584_++) {
		float f = class239.aFloatArray2384[i_584_];
		float f_585_ = class239_583_.aFloatArray2384[i_584_];
		float f_586_ = f;
		float f_587_ = f_585_;
		if (f > 0.0F) {
		    if (f_585_ > 0.0F) {
			f_586_ = f;
			f_587_ = f - f_585_;
		    } else {
			f_587_ = f;
			f_586_ = f + f_585_;
		    }
		} else if (f_585_ > 0.0F) {
		    f_586_ = f;
		    f_587_ = f + f_585_;
		} else {
		    f_587_ = f;
		    f_586_ = f - f_585_;
		}
		class239.aFloatArray2384[i_584_] = f_586_;
		class239_583_.aFloatArray2384[i_584_] = f_587_;
	    }
	}
	for (int i_588_ = 0; i_588_ < aBoolArray2759.length; i_588_++)
	    aBoolArray2759[i_588_] = aBoolArray2780[i_588_];
	for (int i_589_ = 0; i_589_ < anInt2725; i_589_++) {
	    if (!aBoolArray2759[i_589_]) {
		int i_590_ = (class248.anIntArray2638 != null
			      ? class248.anIntArray2638[i_589_] : 0);
		int i_591_ = i_590_;
		int i_592_ = class248.anIntArray2639[i_591_];
		aClass241Array2781[i_592_].method4446(i_589_);
		aClass241Array2781[i_592_].method4447((aClass239Array2764
						       [i_589_]),
						      i_555_ >> 1, i_589_);
	    }
	}
	for (int i_593_ = 0; i_593_ < anInt2725; i_593_++) {
	    if (aBoolArray2759[i_593_]) {
		for (int i_594_ = i_555_ >> 1; i_594_ < i_555_; i_594_++)
		    aClass239Array2764[i_593_].aFloatArray2384[i_594_] = 0.0F;
	    } else {
		int i_595_ = i_555_ >> 1;
		int i_596_ = i_555_ >> 2;
		int i_597_ = i_555_ >> 3;
		Class239 class239 = aClass239Array2764[i_593_];
		for (int i_598_ = 0; i_598_ < i_595_; i_598_++)
		    class239.aFloatArray2384[i_598_] *= 0.5F;
		for (int i_599_ = i_595_; i_599_ < i_555_; i_599_++)
		    class239.aFloatArray2384[i_599_]
			= -class239.aFloatArray2384[i_555_ - i_599_ - 1];
		Class239 class239_600_
		    = bool ? aClass239_2742 : aClass239_2739;
		Class239 class239_601_
		    = bool ? aClass239_2743 : aClass239_2721;
		Class239 class239_602_
		    = bool ? aClass239_2741 : aClass239_2723;
		int[] is_603_ = bool ? anIntArray2746 : anIntArray2712;
		for (int i_604_ = 0; i_604_ < i_596_; i_604_++) {
		    float f = (class239.aFloatArray2384[4 * i_604_]
			       - (class239.aFloatArray2384
				  [i_555_ - 4 * i_604_ - 1]));
		    float f_605_ = (class239.aFloatArray2384[4 * i_604_ + 2]
				    - (class239.aFloatArray2384
				       [i_555_ - 4 * i_604_ - 3]));
		    float f_606_ = class239_600_.aFloatArray2384[2 * i_604_];
		    float f_607_
			= class239_600_.aFloatArray2384[2 * i_604_ + 1];
		    class239.aFloatArray2384[i_555_ - 4 * i_604_ - 1]
			= f * f_606_ - f_605_ * f_607_;
		    class239.aFloatArray2384[i_555_ - 4 * i_604_ - 3]
			= f * f_607_ + f_605_ * f_606_;
		}
		for (int i_608_ = 0; i_608_ < i_597_; i_608_++) {
		    float f
			= class239.aFloatArray2384[i_595_ + 3 + 4 * i_608_];
		    float f_609_
			= class239.aFloatArray2384[i_595_ + 1 + 4 * i_608_];
		    float f_610_ = class239.aFloatArray2384[4 * i_608_ + 3];
		    float f_611_ = class239.aFloatArray2384[4 * i_608_ + 1];
		    class239.aFloatArray2384[i_595_ + 3 + 4 * i_608_]
			= f + f_610_;
		    class239.aFloatArray2384[i_595_ + 1 + 4 * i_608_]
			= f_609_ + f_611_;
		    float f_612_ = (class239_600_.aFloatArray2384
				    [i_595_ - 4 - 4 * i_608_]);
		    float f_613_ = (class239_600_.aFloatArray2384
				    [i_595_ - 3 - 4 * i_608_]);
		    class239.aFloatArray2384[4 * i_608_ + 3]
			= (f - f_610_) * f_612_ - (f_609_ - f_611_) * f_613_;
		    class239.aFloatArray2384[4 * i_608_ + 1]
			= (f_609_ - f_611_) * f_612_ + (f - f_610_) * f_613_;
		}
		int i_614_ = Class695.method14072(i_555_ - 1, (byte) -69);
		for (int i_615_ = 0; i_615_ < i_614_ - 3; i_615_++) {
		    int i_616_ = i_555_ >> i_615_ + 2;
		    int i_617_ = 8 << i_615_;
		    for (int i_618_ = 0; i_618_ < 2 << i_615_; i_618_++) {
			int i_619_ = i_555_ - i_616_ * 2 * i_618_;
			int i_620_ = i_555_ - i_616_ * (2 * i_618_ + 1);
			for (int i_621_ = 0; i_621_ < i_555_ >> i_615_ + 4;
			     i_621_++) {
			    int i_622_ = 4 * i_621_;
			    float f = (class239.aFloatArray2384
				       [i_619_ - 1 - i_622_]);
			    float f_623_ = (class239.aFloatArray2384
					    [i_619_ - 3 - i_622_]);
			    float f_624_ = (class239.aFloatArray2384
					    [i_620_ - 1 - i_622_]);
			    float f_625_ = (class239.aFloatArray2384
					    [i_620_ - 3 - i_622_]);
			    class239.aFloatArray2384[i_619_ - 1 - i_622_]
				= f + f_624_;
			    class239.aFloatArray2384[i_619_ - 3 - i_622_]
				= f_623_ + f_625_;
			    float f_626_ = (class239_600_.aFloatArray2384
					    [i_621_ * i_617_]);
			    float f_627_ = (class239_600_.aFloatArray2384
					    [i_621_ * i_617_ + 1]);
			    class239.aFloatArray2384[i_620_ - 1 - i_622_]
				= ((f - f_624_) * f_626_
				   - (f_623_ - f_625_) * f_627_);
			    class239.aFloatArray2384[i_620_ - 3 - i_622_]
				= ((f_623_ - f_625_) * f_626_
				   + (f - f_624_) * f_627_);
			}
		    }
		}
		for (int i_628_ = 1; i_628_ < i_597_ - 1; i_628_++) {
		    int i_629_ = is_603_[i_628_];
		    if (i_628_ < i_629_) {
			int i_630_ = 8 * i_628_;
			int i_631_ = 8 * i_629_;
			float f = class239.aFloatArray2384[i_630_ + 1];
			class239.aFloatArray2384[i_630_ + 1]
			    = class239.aFloatArray2384[i_631_ + 1];
			class239.aFloatArray2384[i_631_ + 1] = f;
			f = class239.aFloatArray2384[i_630_ + 3];
			class239.aFloatArray2384[i_630_ + 3]
			    = class239.aFloatArray2384[i_631_ + 3];
			class239.aFloatArray2384[i_631_ + 3] = f;
			f = class239.aFloatArray2384[i_630_ + 5];
			class239.aFloatArray2384[i_630_ + 5]
			    = class239.aFloatArray2384[i_631_ + 5];
			class239.aFloatArray2384[i_631_ + 5] = f;
			f = class239.aFloatArray2384[i_630_ + 7];
			class239.aFloatArray2384[i_630_ + 7]
			    = class239.aFloatArray2384[i_631_ + 7];
			class239.aFloatArray2384[i_631_ + 7] = f;
		    }
		}
		for (int i_632_ = 0; i_632_ < i_595_; i_632_++)
		    class239.aFloatArray2384[i_632_]
			= class239.aFloatArray2384[2 * i_632_ + 1];
		for (int i_633_ = 0; i_633_ < i_597_; i_633_++) {
		    class239.aFloatArray2384[i_555_ - 1 - 2 * i_633_]
			= class239.aFloatArray2384[4 * i_633_];
		    class239.aFloatArray2384[i_555_ - 2 - 2 * i_633_]
			= class239.aFloatArray2384[4 * i_633_ + 1];
		    class239.aFloatArray2384[i_555_ - i_596_ - 1 - 2 * i_633_]
			= class239.aFloatArray2384[4 * i_633_ + 2];
		    class239.aFloatArray2384[i_555_ - i_596_ - 2 - 2 * i_633_]
			= class239.aFloatArray2384[4 * i_633_ + 3];
		}
		for (int i_634_ = 0; i_634_ < i_597_; i_634_++) {
		    float f = class239_602_.aFloatArray2384[2 * i_634_];
		    float f_635_
			= class239_602_.aFloatArray2384[2 * i_634_ + 1];
		    float f_636_
			= class239.aFloatArray2384[i_595_ + 2 * i_634_];
		    float f_637_
			= class239.aFloatArray2384[i_595_ + 2 * i_634_ + 1];
		    float f_638_
			= class239.aFloatArray2384[i_555_ - 2 - 2 * i_634_];
		    float f_639_
			= class239.aFloatArray2384[i_555_ - 1 - 2 * i_634_];
		    float f_640_
			= f_635_ * (f_636_ - f_638_) + f * (f_637_ + f_639_);
		    class239.aFloatArray2384[i_595_ + 2 * i_634_]
			= (f_636_ + f_638_ + f_640_) * 0.5F;
		    class239.aFloatArray2384[i_555_ - 2 - 2 * i_634_]
			= (f_636_ + f_638_ - f_640_) * 0.5F;
		    f_640_
			= f_635_ * (f_637_ + f_639_) - f * (f_636_ - f_638_);
		    class239.aFloatArray2384[i_595_ + 2 * i_634_ + 1]
			= (f_637_ - f_639_ + f_640_) * 0.5F;
		    class239.aFloatArray2384[i_555_ - 1 - 2 * i_634_]
			= (-f_637_ + f_639_ + f_640_) * 0.5F;
		}
		for (int i_641_ = 0; i_641_ < i_596_; i_641_++) {
		    class239.aFloatArray2384[i_641_]
			= ((class239.aFloatArray2384[2 * i_641_ + i_595_]
			    * class239_601_.aFloatArray2384[2 * i_641_])
			   + (class239.aFloatArray2384[2 * i_641_ + 1 + i_595_]
			      * (class239_601_.aFloatArray2384
				 [2 * i_641_ + 1])));
		    class239.aFloatArray2384[i_595_ - 1 - i_641_]
			= ((class239.aFloatArray2384[2 * i_641_ + i_595_]
			    * class239_601_.aFloatArray2384[2 * i_641_ + 1])
			   - (class239.aFloatArray2384[2 * i_641_ + 1 + i_595_]
			      * class239_601_.aFloatArray2384[2 * i_641_]));
		}
		for (int i_642_ = 0; i_642_ < i_596_; i_642_++)
		    class239.aFloatArray2384[i_555_ - i_596_ + i_642_]
			= -class239.aFloatArray2384[i_642_];
		for (int i_643_ = 0; i_643_ < i_596_; i_643_++)
		    class239.aFloatArray2384[i_643_]
			= class239.aFloatArray2384[i_596_ + i_643_];
		for (int i_644_ = 0; i_644_ < i_596_; i_644_++)
		    class239.aFloatArray2384[i_596_ + i_644_]
			= -class239.aFloatArray2384[i_596_ - i_644_ - 1];
		for (int i_645_ = 0; i_645_ < i_596_; i_645_++)
		    class239.aFloatArray2384[i_595_ + i_645_]
			= class239.aFloatArray2384[i_555_ - i_645_ - 1];
		for (int i_646_ = i_559_; i_646_ < i_560_; i_646_++) {
		    float f
			= (float) Math.sin(((double) (i_646_ - i_559_) + 0.5)
					   / (double) i_561_ * 0.5
					   * 3.141592653589793);
		    aClass239Array2764[i_593_].aFloatArray2384[i_646_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
		for (int i_647_ = i_562_; i_647_ < i_563_; i_647_++) {
		    float f
			= (float) Math.sin((((double) (i_647_ - i_562_) + 0.5)
					    / (double) i_564_ * 0.5
					    * 3.141592653589793)
					   + 1.5707963267948966);
		    aClass239Array2764[i_593_].aFloatArray2384[i_647_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
	    }
	}
	Class239[] class239s = null;
	if (anInt2735 > 0) {
	    int i_648_ = anInt2735 + i_555_ >> 2;
	    class239s = method4687(anInt2725, i_648_);
	    for (int i_649_ = 0; i_649_ < anInt2725; i_649_++) {
		if (!aBoolArray2751[i_649_]) {
		    for (int i_650_ = 0; i_650_ < anInt2736; i_650_++) {
			int i_651_ = (anInt2735 >> 1) + i_650_;
			class239s[i_649_].aFloatArray2384[i_650_]
			    += (aClass239Array2734[i_649_].aFloatArray2384
				[i_651_]);
		    }
		}
		if (!aBoolArray2759[i_649_]) {
		    for (int i_652_ = i_559_; i_652_ < i_555_ >> 1; i_652_++) {
			int i_653_ = (class239s[i_649_].anInt2382
				      - (i_555_ >> 1) + i_652_);
			class239s[i_649_].aFloatArray2384[i_653_]
			    += (aClass239Array2764[i_649_].aFloatArray2384
				[i_652_]);
		    }
		}
	    }
	}
	Class239[] class239s_654_ = aClass239Array2734;
	aClass239Array2734 = aClass239Array2764;
	aClass239Array2764 = class239s_654_;
	anInt2735 = i_555_;
	anInt2736 = i_563_ - (i_555_ >> 1);
	aBoolArray2751 = aBoolArray2759;
	atomicreference.set(class239s);
	return true;
    }
    
    boolean method4772(byte[] is, int i, int i_655_,
		       AtomicReference atomicreference) {
	if (is == null)
	    throw new RuntimeException("");
	if (i + i_655_ > is.length)
	    return false;
	method4792(is, i);
	int i_656_ = method4714();
	if (i_656_ != 0) {
	    method4702(is, i);
	    return false;
	}
	if (!method290())
	    throw new RuntimeException();
	int i_657_ = method4699(method4689(anIntArray2729.length - 1));
	boolean bool = aBoolArray2732[i_657_];
	int i_658_ = bool ? anInt2727 : anInt2771;
	boolean bool_659_ = false;
	boolean bool_660_ = false;
	if (bool) {
	    bool_659_ = method4714() != 0;
	    bool_660_ = method4714() != 0;
	}
	int i_661_ = i_658_ >> 1;
	int i_662_;
	int i_663_;
	int i_664_;
	if (bool && !bool_659_) {
	    i_662_ = (i_658_ >> 2) - (anInt2771 >> 2);
	    i_663_ = (i_658_ >> 2) + (anInt2771 >> 2);
	    i_664_ = anInt2771 >> 1;
	} else {
	    i_662_ = 0;
	    i_663_ = i_661_;
	    i_664_ = i_658_ >> 1;
	}
	int i_665_;
	int i_666_;
	int i_667_;
	if (bool && !bool_660_) {
	    i_665_ = i_658_ - (i_658_ >> 2) - (anInt2771 >> 2);
	    i_666_ = i_658_ - (i_658_ >> 2) + (anInt2771 >> 2);
	    i_667_ = anInt2771 >> 1;
	} else {
	    i_665_ = i_661_;
	    i_666_ = i_658_;
	    i_667_ = i_658_ >> 1;
	}
	Class248 class248 = aClass248Array2731[anIntArray2729[i_657_]];
	if (aBoolArray2759 == null || aBoolArray2759.length != anInt2725) {
	    aBoolArray2759 = new boolean[anInt2725];
	    aBoolArray2780 = new boolean[anInt2725];
	}
	for (int i_668_ = 0; i_668_ < anInt2725; i_668_++) {
	    int i_669_ = (class248.anIntArray2638 != null
			  ? class248.anIntArray2638[i_668_] : 0);
	    int i_670_ = i_669_;
	    int i_671_ = class248.anIntArray2639[i_670_];
	    aBoolArray2759[i_668_]
		= !aClass241Array2781[i_671_].method4445(i_668_);
	    aBoolArray2780[i_668_] = aBoolArray2759[i_668_];
	}
	for (int i_672_ = 0; i_672_ < class248.anInt2636; i_672_++) {
	    if (!aBoolArray2759[class248.anIntArray2642[i_672_]]
		|| !aBoolArray2759[class248.anIntArray2643[i_672_]]) {
		aBoolArray2759[class248.anIntArray2642[i_672_]] = false;
		aBoolArray2759[class248.anIntArray2643[i_672_]] = false;
	    }
	}
	if (aBoolArray2762 == null || aBoolArray2762.length != anInt2725)
	    aBoolArray2762 = new boolean[anInt2725];
	for (int i_673_ = 0; i_673_ < class248.anInt2641; i_673_++) {
	    int i_674_ = 0;
	    for (int i_675_ = 0; i_675_ < anInt2725; i_675_++) {
		int i_676_ = (class248.anIntArray2638 != null
			      ? class248.anIntArray2638[i_675_] : i_673_);
		if (i_676_ == i_673_)
		    aBoolArray2762[i_674_++] = aBoolArray2759[i_675_];
	    }
	    Class240 class240
		= aClass240Array2730[class248.anIntArray2637[i_673_]];
	    Object object = null;
	    Class239[] class239s;
	    if (class240.anInt2393 == 2) {
		Class239[] class239s_677_ = method4687(1, anInt2725 * i_658_);
		for (int i_678_ = 0; i_678_ < i_658_; i_678_++) {
		    for (int i_679_ = 0; i_679_ < anInt2725; i_679_++) {
			try {
			    class239s_677_[0].aFloatArray2384
				[i_678_ * anInt2725 + i_679_]
				= (aClass239Array2764[i_679_].aFloatArray2384
				   [i_678_]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		class239s_677_
		    = class240.method4433(class239s_677_, i_658_ >> 1,
					  aBoolArray2762);
		class239s = aClass239Array2764;
		for (int i_680_ = 0; i_680_ < i_658_; i_680_++) {
		    for (int i_681_ = 0; i_681_ < anInt2725; i_681_++) {
			try {
			    class239s[i_681_].aFloatArray2384[i_680_]
				= (class239s_677_[0].aFloatArray2384
				   [anInt2725 * i_680_ + i_681_]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		method4690(class239s_677_);
		Object object_682_ = null;
	    } else
		class239s = class240.method4433(aClass239Array2764,
						i_658_ >> 1, aBoolArray2762);
	    if (class248.anIntArray2638 != null) {
		i_674_ = 0;
		for (int i_683_ = 0; i_683_ < anInt2725; i_683_++) {
		    int i_684_ = class248.anIntArray2638[i_683_];
		    if (i_684_ == i_673_)
			aClass239Array2764[i_683_] = class239s[i_674_++];
		}
	    } else {
		if (aClass239Array2764 != class239s)
		    method4690(aClass239Array2764);
		aClass239Array2764 = class239s;
	    }
	}
	for (int i_685_ = class248.anInt2636 - 1; i_685_ >= 0; i_685_--) {
	    Class239 class239
		= aClass239Array2764[class248.anIntArray2642[i_685_]];
	    Class239 class239_686_
		= aClass239Array2764[class248.anIntArray2643[i_685_]];
	    for (int i_687_ = 0; i_687_ < class239.anInt2382; i_687_++) {
		float f = class239.aFloatArray2384[i_687_];
		float f_688_ = class239_686_.aFloatArray2384[i_687_];
		float f_689_ = f;
		float f_690_ = f_688_;
		if (f > 0.0F) {
		    if (f_688_ > 0.0F) {
			f_689_ = f;
			f_690_ = f - f_688_;
		    } else {
			f_690_ = f;
			f_689_ = f + f_688_;
		    }
		} else if (f_688_ > 0.0F) {
		    f_689_ = f;
		    f_690_ = f + f_688_;
		} else {
		    f_690_ = f;
		    f_689_ = f - f_688_;
		}
		class239.aFloatArray2384[i_687_] = f_689_;
		class239_686_.aFloatArray2384[i_687_] = f_690_;
	    }
	}
	for (int i_691_ = 0; i_691_ < aBoolArray2759.length; i_691_++)
	    aBoolArray2759[i_691_] = aBoolArray2780[i_691_];
	for (int i_692_ = 0; i_692_ < anInt2725; i_692_++) {
	    if (!aBoolArray2759[i_692_]) {
		int i_693_ = (class248.anIntArray2638 != null
			      ? class248.anIntArray2638[i_692_] : 0);
		int i_694_ = i_693_;
		int i_695_ = class248.anIntArray2639[i_694_];
		aClass241Array2781[i_695_].method4446(i_692_);
		aClass241Array2781[i_695_].method4447((aClass239Array2764
						       [i_692_]),
						      i_658_ >> 1, i_692_);
	    }
	}
	for (int i_696_ = 0; i_696_ < anInt2725; i_696_++) {
	    if (aBoolArray2759[i_696_]) {
		for (int i_697_ = i_658_ >> 1; i_697_ < i_658_; i_697_++)
		    aClass239Array2764[i_696_].aFloatArray2384[i_697_] = 0.0F;
	    } else {
		int i_698_ = i_658_ >> 1;
		int i_699_ = i_658_ >> 2;
		int i_700_ = i_658_ >> 3;
		Class239 class239 = aClass239Array2764[i_696_];
		for (int i_701_ = 0; i_701_ < i_698_; i_701_++)
		    class239.aFloatArray2384[i_701_] *= 0.5F;
		for (int i_702_ = i_698_; i_702_ < i_658_; i_702_++)
		    class239.aFloatArray2384[i_702_]
			= -class239.aFloatArray2384[i_658_ - i_702_ - 1];
		Class239 class239_703_
		    = bool ? aClass239_2742 : aClass239_2739;
		Class239 class239_704_
		    = bool ? aClass239_2743 : aClass239_2721;
		Class239 class239_705_
		    = bool ? aClass239_2741 : aClass239_2723;
		int[] is_706_ = bool ? anIntArray2746 : anIntArray2712;
		for (int i_707_ = 0; i_707_ < i_699_; i_707_++) {
		    float f = (class239.aFloatArray2384[4 * i_707_]
			       - (class239.aFloatArray2384
				  [i_658_ - 4 * i_707_ - 1]));
		    float f_708_ = (class239.aFloatArray2384[4 * i_707_ + 2]
				    - (class239.aFloatArray2384
				       [i_658_ - 4 * i_707_ - 3]));
		    float f_709_ = class239_703_.aFloatArray2384[2 * i_707_];
		    float f_710_
			= class239_703_.aFloatArray2384[2 * i_707_ + 1];
		    class239.aFloatArray2384[i_658_ - 4 * i_707_ - 1]
			= f * f_709_ - f_708_ * f_710_;
		    class239.aFloatArray2384[i_658_ - 4 * i_707_ - 3]
			= f * f_710_ + f_708_ * f_709_;
		}
		for (int i_711_ = 0; i_711_ < i_700_; i_711_++) {
		    float f
			= class239.aFloatArray2384[i_698_ + 3 + 4 * i_711_];
		    float f_712_
			= class239.aFloatArray2384[i_698_ + 1 + 4 * i_711_];
		    float f_713_ = class239.aFloatArray2384[4 * i_711_ + 3];
		    float f_714_ = class239.aFloatArray2384[4 * i_711_ + 1];
		    class239.aFloatArray2384[i_698_ + 3 + 4 * i_711_]
			= f + f_713_;
		    class239.aFloatArray2384[i_698_ + 1 + 4 * i_711_]
			= f_712_ + f_714_;
		    float f_715_ = (class239_703_.aFloatArray2384
				    [i_698_ - 4 - 4 * i_711_]);
		    float f_716_ = (class239_703_.aFloatArray2384
				    [i_698_ - 3 - 4 * i_711_]);
		    class239.aFloatArray2384[4 * i_711_ + 3]
			= (f - f_713_) * f_715_ - (f_712_ - f_714_) * f_716_;
		    class239.aFloatArray2384[4 * i_711_ + 1]
			= (f_712_ - f_714_) * f_715_ + (f - f_713_) * f_716_;
		}
		int i_717_ = Class695.method14072(i_658_ - 1, (byte) -20);
		for (int i_718_ = 0; i_718_ < i_717_ - 3; i_718_++) {
		    int i_719_ = i_658_ >> i_718_ + 2;
		    int i_720_ = 8 << i_718_;
		    for (int i_721_ = 0; i_721_ < 2 << i_718_; i_721_++) {
			int i_722_ = i_658_ - i_719_ * 2 * i_721_;
			int i_723_ = i_658_ - i_719_ * (2 * i_721_ + 1);
			for (int i_724_ = 0; i_724_ < i_658_ >> i_718_ + 4;
			     i_724_++) {
			    int i_725_ = 4 * i_724_;
			    float f = (class239.aFloatArray2384
				       [i_722_ - 1 - i_725_]);
			    float f_726_ = (class239.aFloatArray2384
					    [i_722_ - 3 - i_725_]);
			    float f_727_ = (class239.aFloatArray2384
					    [i_723_ - 1 - i_725_]);
			    float f_728_ = (class239.aFloatArray2384
					    [i_723_ - 3 - i_725_]);
			    class239.aFloatArray2384[i_722_ - 1 - i_725_]
				= f + f_727_;
			    class239.aFloatArray2384[i_722_ - 3 - i_725_]
				= f_726_ + f_728_;
			    float f_729_ = (class239_703_.aFloatArray2384
					    [i_724_ * i_720_]);
			    float f_730_ = (class239_703_.aFloatArray2384
					    [i_724_ * i_720_ + 1]);
			    class239.aFloatArray2384[i_723_ - 1 - i_725_]
				= ((f - f_727_) * f_729_
				   - (f_726_ - f_728_) * f_730_);
			    class239.aFloatArray2384[i_723_ - 3 - i_725_]
				= ((f_726_ - f_728_) * f_729_
				   + (f - f_727_) * f_730_);
			}
		    }
		}
		for (int i_731_ = 1; i_731_ < i_700_ - 1; i_731_++) {
		    int i_732_ = is_706_[i_731_];
		    if (i_731_ < i_732_) {
			int i_733_ = 8 * i_731_;
			int i_734_ = 8 * i_732_;
			float f = class239.aFloatArray2384[i_733_ + 1];
			class239.aFloatArray2384[i_733_ + 1]
			    = class239.aFloatArray2384[i_734_ + 1];
			class239.aFloatArray2384[i_734_ + 1] = f;
			f = class239.aFloatArray2384[i_733_ + 3];
			class239.aFloatArray2384[i_733_ + 3]
			    = class239.aFloatArray2384[i_734_ + 3];
			class239.aFloatArray2384[i_734_ + 3] = f;
			f = class239.aFloatArray2384[i_733_ + 5];
			class239.aFloatArray2384[i_733_ + 5]
			    = class239.aFloatArray2384[i_734_ + 5];
			class239.aFloatArray2384[i_734_ + 5] = f;
			f = class239.aFloatArray2384[i_733_ + 7];
			class239.aFloatArray2384[i_733_ + 7]
			    = class239.aFloatArray2384[i_734_ + 7];
			class239.aFloatArray2384[i_734_ + 7] = f;
		    }
		}
		for (int i_735_ = 0; i_735_ < i_698_; i_735_++)
		    class239.aFloatArray2384[i_735_]
			= class239.aFloatArray2384[2 * i_735_ + 1];
		for (int i_736_ = 0; i_736_ < i_700_; i_736_++) {
		    class239.aFloatArray2384[i_658_ - 1 - 2 * i_736_]
			= class239.aFloatArray2384[4 * i_736_];
		    class239.aFloatArray2384[i_658_ - 2 - 2 * i_736_]
			= class239.aFloatArray2384[4 * i_736_ + 1];
		    class239.aFloatArray2384[i_658_ - i_699_ - 1 - 2 * i_736_]
			= class239.aFloatArray2384[4 * i_736_ + 2];
		    class239.aFloatArray2384[i_658_ - i_699_ - 2 - 2 * i_736_]
			= class239.aFloatArray2384[4 * i_736_ + 3];
		}
		for (int i_737_ = 0; i_737_ < i_700_; i_737_++) {
		    float f = class239_705_.aFloatArray2384[2 * i_737_];
		    float f_738_
			= class239_705_.aFloatArray2384[2 * i_737_ + 1];
		    float f_739_
			= class239.aFloatArray2384[i_698_ + 2 * i_737_];
		    float f_740_
			= class239.aFloatArray2384[i_698_ + 2 * i_737_ + 1];
		    float f_741_
			= class239.aFloatArray2384[i_658_ - 2 - 2 * i_737_];
		    float f_742_
			= class239.aFloatArray2384[i_658_ - 1 - 2 * i_737_];
		    float f_743_
			= f_738_ * (f_739_ - f_741_) + f * (f_740_ + f_742_);
		    class239.aFloatArray2384[i_698_ + 2 * i_737_]
			= (f_739_ + f_741_ + f_743_) * 0.5F;
		    class239.aFloatArray2384[i_658_ - 2 - 2 * i_737_]
			= (f_739_ + f_741_ - f_743_) * 0.5F;
		    f_743_
			= f_738_ * (f_740_ + f_742_) - f * (f_739_ - f_741_);
		    class239.aFloatArray2384[i_698_ + 2 * i_737_ + 1]
			= (f_740_ - f_742_ + f_743_) * 0.5F;
		    class239.aFloatArray2384[i_658_ - 1 - 2 * i_737_]
			= (-f_740_ + f_742_ + f_743_) * 0.5F;
		}
		for (int i_744_ = 0; i_744_ < i_699_; i_744_++) {
		    class239.aFloatArray2384[i_744_]
			= ((class239.aFloatArray2384[2 * i_744_ + i_698_]
			    * class239_704_.aFloatArray2384[2 * i_744_])
			   + (class239.aFloatArray2384[2 * i_744_ + 1 + i_698_]
			      * (class239_704_.aFloatArray2384
				 [2 * i_744_ + 1])));
		    class239.aFloatArray2384[i_698_ - 1 - i_744_]
			= ((class239.aFloatArray2384[2 * i_744_ + i_698_]
			    * class239_704_.aFloatArray2384[2 * i_744_ + 1])
			   - (class239.aFloatArray2384[2 * i_744_ + 1 + i_698_]
			      * class239_704_.aFloatArray2384[2 * i_744_]));
		}
		for (int i_745_ = 0; i_745_ < i_699_; i_745_++)
		    class239.aFloatArray2384[i_658_ - i_699_ + i_745_]
			= -class239.aFloatArray2384[i_745_];
		for (int i_746_ = 0; i_746_ < i_699_; i_746_++)
		    class239.aFloatArray2384[i_746_]
			= class239.aFloatArray2384[i_699_ + i_746_];
		for (int i_747_ = 0; i_747_ < i_699_; i_747_++)
		    class239.aFloatArray2384[i_699_ + i_747_]
			= -class239.aFloatArray2384[i_699_ - i_747_ - 1];
		for (int i_748_ = 0; i_748_ < i_699_; i_748_++)
		    class239.aFloatArray2384[i_698_ + i_748_]
			= class239.aFloatArray2384[i_658_ - i_748_ - 1];
		for (int i_749_ = i_662_; i_749_ < i_663_; i_749_++) {
		    float f
			= (float) Math.sin(((double) (i_749_ - i_662_) + 0.5)
					   / (double) i_664_ * 0.5
					   * 3.141592653589793);
		    aClass239Array2764[i_696_].aFloatArray2384[i_749_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
		for (int i_750_ = i_665_; i_750_ < i_666_; i_750_++) {
		    float f
			= (float) Math.sin((((double) (i_750_ - i_665_) + 0.5)
					    / (double) i_667_ * 0.5
					    * 3.141592653589793)
					   + 1.5707963267948966);
		    aClass239Array2764[i_696_].aFloatArray2384[i_750_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
	    }
	}
	Class239[] class239s = null;
	if (anInt2735 > 0) {
	    int i_751_ = anInt2735 + i_658_ >> 2;
	    class239s = method4687(anInt2725, i_751_);
	    for (int i_752_ = 0; i_752_ < anInt2725; i_752_++) {
		if (!aBoolArray2751[i_752_]) {
		    for (int i_753_ = 0; i_753_ < anInt2736; i_753_++) {
			int i_754_ = (anInt2735 >> 1) + i_753_;
			class239s[i_752_].aFloatArray2384[i_753_]
			    += (aClass239Array2734[i_752_].aFloatArray2384
				[i_754_]);
		    }
		}
		if (!aBoolArray2759[i_752_]) {
		    for (int i_755_ = i_662_; i_755_ < i_658_ >> 1; i_755_++) {
			int i_756_ = (class239s[i_752_].anInt2382
				      - (i_658_ >> 1) + i_755_);
			class239s[i_752_].aFloatArray2384[i_756_]
			    += (aClass239Array2764[i_752_].aFloatArray2384
				[i_755_]);
		    }
		}
	    }
	}
	Class239[] class239s_757_ = aClass239Array2734;
	aClass239Array2734 = aClass239Array2764;
	aClass239Array2764 = class239s_757_;
	anInt2735 = i_658_;
	anInt2736 = i_666_ - (i_658_ >> 1);
	aBoolArray2751 = aBoolArray2759;
	atomicreference.set(class239s);
	return true;
    }
    
    boolean method4773(byte[] is, int i, int i_758_,
		       AtomicReference atomicreference) {
	if (is == null)
	    throw new RuntimeException("");
	if (i + i_758_ > is.length)
	    return false;
	method4792(is, i);
	int i_759_ = method4714();
	if (i_759_ != 0) {
	    method4702(is, i);
	    return false;
	}
	if (!method290())
	    throw new RuntimeException();
	int i_760_ = method4699(method4689(anIntArray2729.length - 1));
	boolean bool = aBoolArray2732[i_760_];
	int i_761_ = bool ? anInt2727 : anInt2771;
	boolean bool_762_ = false;
	boolean bool_763_ = false;
	if (bool) {
	    bool_762_ = method4714() != 0;
	    bool_763_ = method4714() != 0;
	}
	int i_764_ = i_761_ >> 1;
	int i_765_;
	int i_766_;
	int i_767_;
	if (bool && !bool_762_) {
	    i_765_ = (i_761_ >> 2) - (anInt2771 >> 2);
	    i_766_ = (i_761_ >> 2) + (anInt2771 >> 2);
	    i_767_ = anInt2771 >> 1;
	} else {
	    i_765_ = 0;
	    i_766_ = i_764_;
	    i_767_ = i_761_ >> 1;
	}
	int i_768_;
	int i_769_;
	int i_770_;
	if (bool && !bool_763_) {
	    i_768_ = i_761_ - (i_761_ >> 2) - (anInt2771 >> 2);
	    i_769_ = i_761_ - (i_761_ >> 2) + (anInt2771 >> 2);
	    i_770_ = anInt2771 >> 1;
	} else {
	    i_768_ = i_764_;
	    i_769_ = i_761_;
	    i_770_ = i_761_ >> 1;
	}
	Class248 class248 = aClass248Array2731[anIntArray2729[i_760_]];
	if (aBoolArray2759 == null || aBoolArray2759.length != anInt2725) {
	    aBoolArray2759 = new boolean[anInt2725];
	    aBoolArray2780 = new boolean[anInt2725];
	}
	for (int i_771_ = 0; i_771_ < anInt2725; i_771_++) {
	    int i_772_ = (class248.anIntArray2638 != null
			  ? class248.anIntArray2638[i_771_] : 0);
	    int i_773_ = i_772_;
	    int i_774_ = class248.anIntArray2639[i_773_];
	    aBoolArray2759[i_771_]
		= !aClass241Array2781[i_774_].method4445(i_771_);
	    aBoolArray2780[i_771_] = aBoolArray2759[i_771_];
	}
	for (int i_775_ = 0; i_775_ < class248.anInt2636; i_775_++) {
	    if (!aBoolArray2759[class248.anIntArray2642[i_775_]]
		|| !aBoolArray2759[class248.anIntArray2643[i_775_]]) {
		aBoolArray2759[class248.anIntArray2642[i_775_]] = false;
		aBoolArray2759[class248.anIntArray2643[i_775_]] = false;
	    }
	}
	if (aBoolArray2762 == null || aBoolArray2762.length != anInt2725)
	    aBoolArray2762 = new boolean[anInt2725];
	for (int i_776_ = 0; i_776_ < class248.anInt2641; i_776_++) {
	    int i_777_ = 0;
	    for (int i_778_ = 0; i_778_ < anInt2725; i_778_++) {
		int i_779_ = (class248.anIntArray2638 != null
			      ? class248.anIntArray2638[i_778_] : i_776_);
		if (i_779_ == i_776_)
		    aBoolArray2762[i_777_++] = aBoolArray2759[i_778_];
	    }
	    Class240 class240
		= aClass240Array2730[class248.anIntArray2637[i_776_]];
	    Object object = null;
	    Class239[] class239s;
	    if (class240.anInt2393 == 2) {
		Class239[] class239s_780_ = method4687(1, anInt2725 * i_761_);
		for (int i_781_ = 0; i_781_ < i_761_; i_781_++) {
		    for (int i_782_ = 0; i_782_ < anInt2725; i_782_++) {
			try {
			    class239s_780_[0].aFloatArray2384
				[i_781_ * anInt2725 + i_782_]
				= (aClass239Array2764[i_782_].aFloatArray2384
				   [i_781_]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		class239s_780_
		    = class240.method4433(class239s_780_, i_761_ >> 1,
					  aBoolArray2762);
		class239s = aClass239Array2764;
		for (int i_783_ = 0; i_783_ < i_761_; i_783_++) {
		    for (int i_784_ = 0; i_784_ < anInt2725; i_784_++) {
			try {
			    class239s[i_784_].aFloatArray2384[i_783_]
				= (class239s_780_[0].aFloatArray2384
				   [anInt2725 * i_783_ + i_784_]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		method4690(class239s_780_);
		Object object_785_ = null;
	    } else
		class239s = class240.method4433(aClass239Array2764,
						i_761_ >> 1, aBoolArray2762);
	    if (class248.anIntArray2638 != null) {
		i_777_ = 0;
		for (int i_786_ = 0; i_786_ < anInt2725; i_786_++) {
		    int i_787_ = class248.anIntArray2638[i_786_];
		    if (i_787_ == i_776_)
			aClass239Array2764[i_786_] = class239s[i_777_++];
		}
	    } else {
		if (aClass239Array2764 != class239s)
		    method4690(aClass239Array2764);
		aClass239Array2764 = class239s;
	    }
	}
	for (int i_788_ = class248.anInt2636 - 1; i_788_ >= 0; i_788_--) {
	    Class239 class239
		= aClass239Array2764[class248.anIntArray2642[i_788_]];
	    Class239 class239_789_
		= aClass239Array2764[class248.anIntArray2643[i_788_]];
	    for (int i_790_ = 0; i_790_ < class239.anInt2382; i_790_++) {
		float f = class239.aFloatArray2384[i_790_];
		float f_791_ = class239_789_.aFloatArray2384[i_790_];
		float f_792_ = f;
		float f_793_ = f_791_;
		if (f > 0.0F) {
		    if (f_791_ > 0.0F) {
			f_792_ = f;
			f_793_ = f - f_791_;
		    } else {
			f_793_ = f;
			f_792_ = f + f_791_;
		    }
		} else if (f_791_ > 0.0F) {
		    f_792_ = f;
		    f_793_ = f + f_791_;
		} else {
		    f_793_ = f;
		    f_792_ = f - f_791_;
		}
		class239.aFloatArray2384[i_790_] = f_792_;
		class239_789_.aFloatArray2384[i_790_] = f_793_;
	    }
	}
	for (int i_794_ = 0; i_794_ < aBoolArray2759.length; i_794_++)
	    aBoolArray2759[i_794_] = aBoolArray2780[i_794_];
	for (int i_795_ = 0; i_795_ < anInt2725; i_795_++) {
	    if (!aBoolArray2759[i_795_]) {
		int i_796_ = (class248.anIntArray2638 != null
			      ? class248.anIntArray2638[i_795_] : 0);
		int i_797_ = i_796_;
		int i_798_ = class248.anIntArray2639[i_797_];
		aClass241Array2781[i_798_].method4446(i_795_);
		aClass241Array2781[i_798_].method4447((aClass239Array2764
						       [i_795_]),
						      i_761_ >> 1, i_795_);
	    }
	}
	for (int i_799_ = 0; i_799_ < anInt2725; i_799_++) {
	    if (aBoolArray2759[i_799_]) {
		for (int i_800_ = i_761_ >> 1; i_800_ < i_761_; i_800_++)
		    aClass239Array2764[i_799_].aFloatArray2384[i_800_] = 0.0F;
	    } else {
		int i_801_ = i_761_ >> 1;
		int i_802_ = i_761_ >> 2;
		int i_803_ = i_761_ >> 3;
		Class239 class239 = aClass239Array2764[i_799_];
		for (int i_804_ = 0; i_804_ < i_801_; i_804_++)
		    class239.aFloatArray2384[i_804_] *= 0.5F;
		for (int i_805_ = i_801_; i_805_ < i_761_; i_805_++)
		    class239.aFloatArray2384[i_805_]
			= -class239.aFloatArray2384[i_761_ - i_805_ - 1];
		Class239 class239_806_
		    = bool ? aClass239_2742 : aClass239_2739;
		Class239 class239_807_
		    = bool ? aClass239_2743 : aClass239_2721;
		Class239 class239_808_
		    = bool ? aClass239_2741 : aClass239_2723;
		int[] is_809_ = bool ? anIntArray2746 : anIntArray2712;
		for (int i_810_ = 0; i_810_ < i_802_; i_810_++) {
		    float f = (class239.aFloatArray2384[4 * i_810_]
			       - (class239.aFloatArray2384
				  [i_761_ - 4 * i_810_ - 1]));
		    float f_811_ = (class239.aFloatArray2384[4 * i_810_ + 2]
				    - (class239.aFloatArray2384
				       [i_761_ - 4 * i_810_ - 3]));
		    float f_812_ = class239_806_.aFloatArray2384[2 * i_810_];
		    float f_813_
			= class239_806_.aFloatArray2384[2 * i_810_ + 1];
		    class239.aFloatArray2384[i_761_ - 4 * i_810_ - 1]
			= f * f_812_ - f_811_ * f_813_;
		    class239.aFloatArray2384[i_761_ - 4 * i_810_ - 3]
			= f * f_813_ + f_811_ * f_812_;
		}
		for (int i_814_ = 0; i_814_ < i_803_; i_814_++) {
		    float f
			= class239.aFloatArray2384[i_801_ + 3 + 4 * i_814_];
		    float f_815_
			= class239.aFloatArray2384[i_801_ + 1 + 4 * i_814_];
		    float f_816_ = class239.aFloatArray2384[4 * i_814_ + 3];
		    float f_817_ = class239.aFloatArray2384[4 * i_814_ + 1];
		    class239.aFloatArray2384[i_801_ + 3 + 4 * i_814_]
			= f + f_816_;
		    class239.aFloatArray2384[i_801_ + 1 + 4 * i_814_]
			= f_815_ + f_817_;
		    float f_818_ = (class239_806_.aFloatArray2384
				    [i_801_ - 4 - 4 * i_814_]);
		    float f_819_ = (class239_806_.aFloatArray2384
				    [i_801_ - 3 - 4 * i_814_]);
		    class239.aFloatArray2384[4 * i_814_ + 3]
			= (f - f_816_) * f_818_ - (f_815_ - f_817_) * f_819_;
		    class239.aFloatArray2384[4 * i_814_ + 1]
			= (f_815_ - f_817_) * f_818_ + (f - f_816_) * f_819_;
		}
		int i_820_ = Class695.method14072(i_761_ - 1, (byte) 48);
		for (int i_821_ = 0; i_821_ < i_820_ - 3; i_821_++) {
		    int i_822_ = i_761_ >> i_821_ + 2;
		    int i_823_ = 8 << i_821_;
		    for (int i_824_ = 0; i_824_ < 2 << i_821_; i_824_++) {
			int i_825_ = i_761_ - i_822_ * 2 * i_824_;
			int i_826_ = i_761_ - i_822_ * (2 * i_824_ + 1);
			for (int i_827_ = 0; i_827_ < i_761_ >> i_821_ + 4;
			     i_827_++) {
			    int i_828_ = 4 * i_827_;
			    float f = (class239.aFloatArray2384
				       [i_825_ - 1 - i_828_]);
			    float f_829_ = (class239.aFloatArray2384
					    [i_825_ - 3 - i_828_]);
			    float f_830_ = (class239.aFloatArray2384
					    [i_826_ - 1 - i_828_]);
			    float f_831_ = (class239.aFloatArray2384
					    [i_826_ - 3 - i_828_]);
			    class239.aFloatArray2384[i_825_ - 1 - i_828_]
				= f + f_830_;
			    class239.aFloatArray2384[i_825_ - 3 - i_828_]
				= f_829_ + f_831_;
			    float f_832_ = (class239_806_.aFloatArray2384
					    [i_827_ * i_823_]);
			    float f_833_ = (class239_806_.aFloatArray2384
					    [i_827_ * i_823_ + 1]);
			    class239.aFloatArray2384[i_826_ - 1 - i_828_]
				= ((f - f_830_) * f_832_
				   - (f_829_ - f_831_) * f_833_);
			    class239.aFloatArray2384[i_826_ - 3 - i_828_]
				= ((f_829_ - f_831_) * f_832_
				   + (f - f_830_) * f_833_);
			}
		    }
		}
		for (int i_834_ = 1; i_834_ < i_803_ - 1; i_834_++) {
		    int i_835_ = is_809_[i_834_];
		    if (i_834_ < i_835_) {
			int i_836_ = 8 * i_834_;
			int i_837_ = 8 * i_835_;
			float f = class239.aFloatArray2384[i_836_ + 1];
			class239.aFloatArray2384[i_836_ + 1]
			    = class239.aFloatArray2384[i_837_ + 1];
			class239.aFloatArray2384[i_837_ + 1] = f;
			f = class239.aFloatArray2384[i_836_ + 3];
			class239.aFloatArray2384[i_836_ + 3]
			    = class239.aFloatArray2384[i_837_ + 3];
			class239.aFloatArray2384[i_837_ + 3] = f;
			f = class239.aFloatArray2384[i_836_ + 5];
			class239.aFloatArray2384[i_836_ + 5]
			    = class239.aFloatArray2384[i_837_ + 5];
			class239.aFloatArray2384[i_837_ + 5] = f;
			f = class239.aFloatArray2384[i_836_ + 7];
			class239.aFloatArray2384[i_836_ + 7]
			    = class239.aFloatArray2384[i_837_ + 7];
			class239.aFloatArray2384[i_837_ + 7] = f;
		    }
		}
		for (int i_838_ = 0; i_838_ < i_801_; i_838_++)
		    class239.aFloatArray2384[i_838_]
			= class239.aFloatArray2384[2 * i_838_ + 1];
		for (int i_839_ = 0; i_839_ < i_803_; i_839_++) {
		    class239.aFloatArray2384[i_761_ - 1 - 2 * i_839_]
			= class239.aFloatArray2384[4 * i_839_];
		    class239.aFloatArray2384[i_761_ - 2 - 2 * i_839_]
			= class239.aFloatArray2384[4 * i_839_ + 1];
		    class239.aFloatArray2384[i_761_ - i_802_ - 1 - 2 * i_839_]
			= class239.aFloatArray2384[4 * i_839_ + 2];
		    class239.aFloatArray2384[i_761_ - i_802_ - 2 - 2 * i_839_]
			= class239.aFloatArray2384[4 * i_839_ + 3];
		}
		for (int i_840_ = 0; i_840_ < i_803_; i_840_++) {
		    float f = class239_808_.aFloatArray2384[2 * i_840_];
		    float f_841_
			= class239_808_.aFloatArray2384[2 * i_840_ + 1];
		    float f_842_
			= class239.aFloatArray2384[i_801_ + 2 * i_840_];
		    float f_843_
			= class239.aFloatArray2384[i_801_ + 2 * i_840_ + 1];
		    float f_844_
			= class239.aFloatArray2384[i_761_ - 2 - 2 * i_840_];
		    float f_845_
			= class239.aFloatArray2384[i_761_ - 1 - 2 * i_840_];
		    float f_846_
			= f_841_ * (f_842_ - f_844_) + f * (f_843_ + f_845_);
		    class239.aFloatArray2384[i_801_ + 2 * i_840_]
			= (f_842_ + f_844_ + f_846_) * 0.5F;
		    class239.aFloatArray2384[i_761_ - 2 - 2 * i_840_]
			= (f_842_ + f_844_ - f_846_) * 0.5F;
		    f_846_
			= f_841_ * (f_843_ + f_845_) - f * (f_842_ - f_844_);
		    class239.aFloatArray2384[i_801_ + 2 * i_840_ + 1]
			= (f_843_ - f_845_ + f_846_) * 0.5F;
		    class239.aFloatArray2384[i_761_ - 1 - 2 * i_840_]
			= (-f_843_ + f_845_ + f_846_) * 0.5F;
		}
		for (int i_847_ = 0; i_847_ < i_802_; i_847_++) {
		    class239.aFloatArray2384[i_847_]
			= ((class239.aFloatArray2384[2 * i_847_ + i_801_]
			    * class239_807_.aFloatArray2384[2 * i_847_])
			   + (class239.aFloatArray2384[2 * i_847_ + 1 + i_801_]
			      * (class239_807_.aFloatArray2384
				 [2 * i_847_ + 1])));
		    class239.aFloatArray2384[i_801_ - 1 - i_847_]
			= ((class239.aFloatArray2384[2 * i_847_ + i_801_]
			    * class239_807_.aFloatArray2384[2 * i_847_ + 1])
			   - (class239.aFloatArray2384[2 * i_847_ + 1 + i_801_]
			      * class239_807_.aFloatArray2384[2 * i_847_]));
		}
		for (int i_848_ = 0; i_848_ < i_802_; i_848_++)
		    class239.aFloatArray2384[i_761_ - i_802_ + i_848_]
			= -class239.aFloatArray2384[i_848_];
		for (int i_849_ = 0; i_849_ < i_802_; i_849_++)
		    class239.aFloatArray2384[i_849_]
			= class239.aFloatArray2384[i_802_ + i_849_];
		for (int i_850_ = 0; i_850_ < i_802_; i_850_++)
		    class239.aFloatArray2384[i_802_ + i_850_]
			= -class239.aFloatArray2384[i_802_ - i_850_ - 1];
		for (int i_851_ = 0; i_851_ < i_802_; i_851_++)
		    class239.aFloatArray2384[i_801_ + i_851_]
			= class239.aFloatArray2384[i_761_ - i_851_ - 1];
		for (int i_852_ = i_765_; i_852_ < i_766_; i_852_++) {
		    float f
			= (float) Math.sin(((double) (i_852_ - i_765_) + 0.5)
					   / (double) i_767_ * 0.5
					   * 3.141592653589793);
		    aClass239Array2764[i_799_].aFloatArray2384[i_852_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
		for (int i_853_ = i_768_; i_853_ < i_769_; i_853_++) {
		    float f
			= (float) Math.sin((((double) (i_853_ - i_768_) + 0.5)
					    / (double) i_770_ * 0.5
					    * 3.141592653589793)
					   + 1.5707963267948966);
		    aClass239Array2764[i_799_].aFloatArray2384[i_853_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
	    }
	}
	Class239[] class239s = null;
	if (anInt2735 > 0) {
	    int i_854_ = anInt2735 + i_761_ >> 2;
	    class239s = method4687(anInt2725, i_854_);
	    for (int i_855_ = 0; i_855_ < anInt2725; i_855_++) {
		if (!aBoolArray2751[i_855_]) {
		    for (int i_856_ = 0; i_856_ < anInt2736; i_856_++) {
			int i_857_ = (anInt2735 >> 1) + i_856_;
			class239s[i_855_].aFloatArray2384[i_856_]
			    += (aClass239Array2734[i_855_].aFloatArray2384
				[i_857_]);
		    }
		}
		if (!aBoolArray2759[i_855_]) {
		    for (int i_858_ = i_765_; i_858_ < i_761_ >> 1; i_858_++) {
			int i_859_ = (class239s[i_855_].anInt2382
				      - (i_761_ >> 1) + i_858_);
			class239s[i_855_].aFloatArray2384[i_859_]
			    += (aClass239Array2764[i_855_].aFloatArray2384
				[i_858_]);
		    }
		}
	    }
	}
	Class239[] class239s_860_ = aClass239Array2734;
	aClass239Array2734 = aClass239Array2764;
	aClass239Array2764 = class239s_860_;
	anInt2735 = i_761_;
	anInt2736 = i_769_ - (i_761_ >> 1);
	aBoolArray2751 = aBoolArray2759;
	atomicreference.set(class239s);
	return true;
    }
    
    int method4774(float f) {
	int i = (int) (f * 127.0F);
	if (i > 127)
	    return 127;
	if (i < -128)
	    return -128;
	return i;
    }
    
    synchronized void method4775(Class534_Sub40 class534_sub40) {
	aList2718.add(class534_sub40);
	method4677(Class375.aClass375_3905);
    }
    
    void method4776(Class239 class239) {
	if (class239 != null) {
	    synchronized (aClass203_2775) {
		class239.aBool2383 = false;
	    }
	}
    }
    
    void method4777() {
	int i = method4699(8) + 1;
	Iterator iterator = aList2774.iterator();
	while (iterator.hasNext()) {
	    Class249 class249 = (Class249) iterator.next();
	    if (class249.anInt2646 == 0 && class249.anInt2647 == 0) {
		if (class249.aClass256Array2645.length == i
		    && class249.anInt2649 == anInt2725
		    && class249.anInt2644 == anInt2728
		    && class249.anInt2648 == anInt2715) {
		    aClass256Array2726 = class249.aClass256Array2645;
		    for (int i_861_ = 0; i_861_ < aClass256Array2726.length;
			 i_861_++)
			aClass256Array2726[i_861_].method4667(this);
		    return;
		}
	    }
	}
	aClass256Array2726 = new Class256[i];
	for (int i_862_ = 0; i_862_ < i; i_862_++) {
	    if (aClass256Array2726[i_862_] == null)
		aClass256Array2726[i_862_] = new Class256();
	    aClass256Array2726[i_862_].method4656(this);
	}
	Class249 class249
	    = new Class249(anInt2725, anInt2728, anInt2714, anInt2716,
			   anInt2715, aClass256Array2726);
	aList2774.add(class249);
    }
    
    void method4778() {
	if (method307() != Class375.aClass375_3903
	    && method307() != Class375.aClass375_3906
	    && (!aBool2755
		|| !((float) (anInt2773 / method4703()) > aFloat2777))) {
	    if (!method4692()) {
		Class534_Sub40 class534_sub40
		    = ((Class534_Sub40)
		       (aList2718 != null && !aList2718.isEmpty()
			? aList2718.get(0) : null));
		if (class534_sub40 == null) {
		    if (!aBool2744) {
			method4677(Class375.aClass375_3906);
			anInterface49_2717.method356(-100744705);
			aBool2744 = true;
		    }
		    return;
		}
		aBool2744 = false;
		aBool2747 = true;
		aList2718.remove(0);
		method4783(class534_sub40);
	    }
	    method4706();
	}
    }
    
    Class239 method4779(int i) {
	synchronized (aClass203_2775) {
	    Object object = null;
	    Class239 class239
		= (Class239) aClass203_2775.method3892(-2087807061);
	    Class239 class239_863_ = null;
	    int i_864_ = i;
	    for (/**/; class239 != null;
		 class239 = (Class239) aClass203_2775.method3883((byte) 70)) {
		if (class239.aFloatArray2384.length > i && !class239.aBool2383
		    && (class239_863_ == null
			|| class239.aFloatArray2384.length < i_864_)) {
		    class239_863_ = class239;
		    i_864_ = class239_863_.aFloatArray2384.length;
		}
		if (class239.aFloatArray2384.length == i
		    && !class239.aBool2383)
		    break;
	    }
	    if (class239 == null)
		class239 = class239_863_;
	    if (class239 == null) {
		class239 = new Class239(this);
		int i_865_ = 0;
		boolean bool = false;
		while (!bool && i_865_ < 1000) {
		    if (aClass203_2775.method3871((long) i_865_) != null)
			i_865_++;
		    else
			bool = true;
		}
		class239.anInt2381 = i_865_;
		float[] fs = new float[i];
		class239.aFloatArray2384 = fs;
		class239.aBool2383 = true;
		class239.anInt2382 = i;
		if (aClass203_2775.method3879(-419795499) >= i * 4) {
		    /* empty */
		}
		aClass203_2775.method3881(class239, (long) class239.anInt2381,
					  fs.length * 4, -1192041433);
	    } else {
		for (int i_866_ = 0; i_866_ < class239.aFloatArray2384.length;
		     i_866_++)
		    class239.aFloatArray2384[i_866_] = 0.0F;
		class239.anInt2382 = i;
	    }
	    class239.aBool2383 = true;
	    Class239 class239_867_ = class239;
	    return class239_867_;
	}
    }
    
    void method4780() {
	if (method307() != Class375.aClass375_3902) {
	    method4705();
	    if (method307() == Class375.aClass375_3904)
		method4677(Class375.aClass375_3905);
	}
    }
    
    int method4781(float f) {
	int i = (int) (f * 32767.0F + 32768.0F);
	if (i > 65535)
	    return 65535;
	if (i < 0)
	    return 0;
	return i;
    }
    
    int method4782() {
	return anInt2740;
    }
    
    public Class375 method307() {
	return aClass375_2737;
    }
    
    void method4783(Class534_Sub40 class534_sub40) {
	aList2748.add(class534_sub40);
    }
    
    int method4784(float f) {
	int i = (int) (f * 127.0F);
	if (i > 127)
	    return 127;
	if (i < -128)
	    return -128;
	return i;
    }
    
    Class534_Sub40 method4785(int i) {
	return new Class534_Sub40(i, true);
    }
    
    int method4786(float f) {
	int i = (int) (f * 127.0F + 128.0F);
	if (i > 255)
	    return 255;
	if (i < 0)
	    return 0;
	return i;
    }
    
    int method4787(float f) {
	int i = (int) (f * 127.0F + 128.0F);
	if (i > 255)
	    return 255;
	if (i < 0)
	    return 0;
	return i;
    }
    
    Class534_Sub40 method4788(int i) {
	Class534_Sub40 class534_sub40 = method4680(method289(i));
	int i_868_ = i;
	synchronized (aList2752) {
	    while (!aList2752.isEmpty()) {
		Class534_Sub40 class534_sub40_869_
		    = (Class534_Sub40) aList2752.remove(0);
		anInt2773
		    -= (method24(class534_sub40_869_.anInt10811 * 31645619)
			/ method280());
		int i_870_ = method289(i_868_);
		int i_871_
		    = (class534_sub40_869_.anInt10811 * 31645619 < i_870_
		       ? class534_sub40_869_.anInt10811 * 31645619 : i_870_);
		class534_sub40.method16519(class534_sub40_869_.aByteArray10810,
					   0, i_871_, 1237139096);
		i_868_ -= method24(i_871_);
		int i_872_
		    = class534_sub40_869_.anInt10811 * 31645619 - i_871_;
		if (i_872_ != 0) {
		    System.arraycopy(class534_sub40_869_.aByteArray10810,
				     i_871_,
				     class534_sub40_869_.aByteArray10810, 0,
				     i_872_);
		    class534_sub40_869_.anInt10811 = i_872_ * -1387468933;
		    anInt2773 += method24(i_872_) / method280();
		    aList2752.add(0, class534_sub40_869_);
		} else
		    class534_sub40_869_.method16538((byte) 8);
		if (i_868_ <= 0)
		    break;
	    }
	    if (aList2752.isEmpty() && method307() == Class375.aClass375_3902)
		method4677(Class375.aClass375_3907);
	}
	return class534_sub40;
    }
    
    Class534_Sub40 method4789(int i) {
	return new Class534_Sub40(i, true);
    }
    
    Class239 method4790(int i) {
	synchronized (aClass203_2775) {
	    Object object = null;
	    Class239 class239
		= (Class239) aClass203_2775.method3892(-2075698752);
	    Class239 class239_873_ = null;
	    int i_874_ = i;
	    for (/**/; class239 != null;
		 class239 = (Class239) aClass203_2775.method3883((byte) 16)) {
		if (class239.aFloatArray2384.length > i && !class239.aBool2383
		    && (class239_873_ == null
			|| class239.aFloatArray2384.length < i_874_)) {
		    class239_873_ = class239;
		    i_874_ = class239_873_.aFloatArray2384.length;
		}
		if (class239.aFloatArray2384.length == i
		    && !class239.aBool2383)
		    break;
	    }
	    if (class239 == null)
		class239 = class239_873_;
	    if (class239 == null) {
		class239 = new Class239(this);
		int i_875_ = 0;
		boolean bool = false;
		while (!bool && i_875_ < 1000) {
		    if (aClass203_2775.method3871((long) i_875_) != null)
			i_875_++;
		    else
			bool = true;
		}
		class239.anInt2381 = i_875_;
		float[] fs = new float[i];
		class239.aFloatArray2384 = fs;
		class239.aBool2383 = true;
		class239.anInt2382 = i;
		if (aClass203_2775.method3879(-322478286) >= i * 4) {
		    /* empty */
		}
		aClass203_2775.method3881(class239, (long) class239.anInt2381,
					  fs.length * 4, -441680756);
	    } else {
		for (int i_876_ = 0; i_876_ < class239.aFloatArray2384.length;
		     i_876_++)
		    class239.aFloatArray2384[i_876_] = 0.0F;
		class239.anInt2382 = i;
	    }
	    class239.aBool2383 = true;
	    Class239 class239_877_ = class239;
	    return class239_877_;
	}
    }
    
    public void method70(Class534_Sub40 class534_sub40) {
	if (method307() == Class375.aClass375_3902
	    || method307() == Class375.aClass375_3907) {
	    if (class534_sub40 != null)
		class534_sub40.method16538((byte) 33);
	} else if (class534_sub40 == null) {
	    boolean bool = aBool2772 && (anInt2738 > 0 && anInt2765 < anInt2738
					 || anInt2738 < 0);
	    if (aList2752.isEmpty()) {
		if (!bool) {
		    method4701();
		    method4677(Class375.aClass375_3907);
		}
	    } else if (!bool) {
		method4701();
		method4677(Class375.aClass375_3902);
	    }
	    if (bool)
		method4681(true);
	} else
	    method4756(class534_sub40);
    }
    
    int method4791() {
	return anInt2773;
    }
    
    void method4792(byte[] is, int i) {
	aByteArray2753 = is;
	anInt2740 = i;
	anInt2749 = 0;
    }
    
    public void method324(boolean bool, int i, int i_878_, int i_879_) {
	aBool2772 = bool;
	anInt2738 = i;
	anInt2719 = i_878_;
	anInt2724 = i_879_;
    }
    
    public void method325(boolean bool, int i, int i_880_, int i_881_) {
	aBool2772 = bool;
	anInt2738 = i;
	anInt2719 = i_880_;
	anInt2724 = i_881_;
    }
    
    public void method285(boolean bool, int i, int i_882_, int i_883_) {
	aBool2772 = bool;
	anInt2738 = i;
	anInt2719 = i_882_;
	anInt2724 = i_883_;
    }
    
    synchronized void method4793(Class534_Sub40 class534_sub40) {
	aList2718.add(class534_sub40);
	method4677(Class375.aClass375_3905);
    }
    
    public Class386 method328() {
	return aClass386_2713;
    }
    
    public Class386 method329() {
	return aClass386_2713;
    }
}
