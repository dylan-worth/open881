/* Class355 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;
import java.util.Vector;

public class Class355
{
    Interface21 anInterface21_3660;
    boolean aBool3661;
    Class175_Sub1 aClass175_Sub1_3662;
    Class175_Sub1 aClass175_Sub1_3663;
    Interface44 anInterface44_3664;
    Interface44 anInterface44_3665;
    Interface22 anInterface22_3666;
    Interface21 anInterface21_3667;
    Interface22 anInterface22_3668;
    Interface22 anInterface22_3669;
    Interface22 anInterface22_3670;
    int anInt3671 = 0;
    int anInt3672;
    int anInt3673;
    int anInt3674;
    Vector aVector3675 = new Vector();
    Class173 aClass173_3676;
    Class185_Sub1 aClass185_Sub1_3677;
    Interface44 anInterface44_3678;
    Interface37 anInterface37_3679;
    Class349 aClass349_3680;
    int anInt3681 = 0;
    int anInt3682 = 0;
    
    boolean method6277() {
	int i = aVector3675.size();
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    if (!((Class343) aVector3675.elementAt(i_0_)).method6072())
		return false;
	}
	return true;
    }
    
    void method6278(int i, int i_1_) {
	if (aBool3661) {
	    if (aClass175_Sub1_3663 != null) {
		aClass185_Sub1_3677.method3261(aClass175_Sub1_3663, -11578496);
		aClass185_Sub1_3677.method3260(aClass175_Sub1_3662, -8923992);
		aClass175_Sub1_3663.method15077(0, 0, anInt3672, anInt3673, 0,
						0, true,
						anInterface21_3667 != null);
	    }
	    method6288(i, i_1_);
	    aBool3661 = false;
	}
    }
    
    void method6279(int i, int i_2_) {
	aClass185_Sub1_3677.method3237(true);
	aClass185_Sub1_3677.method14711();
	aClass185_Sub1_3677.method14687(0);
	aClass185_Sub1_3677.method14671(1);
	aClass185_Sub1_3677.method3537();
	aClass175_Sub1_3662.method15074(null);
	aClass185_Sub1_3677.method14618(0, 0);
	int i_3_ = aVector3675.size();
	Vector vector = aVector3675;
	for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
	    if (((Class343) aVector3675.elementAt(i_4_)).method6072()) {
		vector = new Vector();
		for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
		    if (!((Class343) aVector3675.elementAt(i_5_)).method6072())
			vector.addElement(aVector3675.elementAt(i_5_));
		}
		i_3_ = vector.size();
		break;
	    }
	}
	anInterface44_3665.method270();
	for (int i_6_ = 0; i_6_ < i_3_; i_6_++) {
	    Class343 class343 = (Class343) vector.elementAt(i_6_);
	    int i_7_ = class343.method6082();
	    boolean bool = i_6_ == i_3_ - 1;
	    boolean bool_8_ = false;
	    for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
		if (i_9_ == i_7_ - 1) {
		    if (bool) {
			aClass185_Sub1_3677.method3261(aClass175_Sub1_3662,
						       -11578496);
			aClass185_Sub1_3677.method3373(anInt3674, anInt3671,
						       anInt3674 + i,
						       anInt3671 + i_2_);
		    } else {
			bool_8_ = true;
			aClass175_Sub1_3662.method15075(0, anInterface22_3668);
		    }
		} else
		    aClass175_Sub1_3662.method15075(0, anInterface22_3669);
		Interface44 interface44 = anInterface44_3678;
		if (i_9_ == 0)
		    interface44 = anInterface44_3665;
		class343.method6065(i_9_, aClass175_Sub1_3662, interface44,
				    anInterface21_3667, anInterface44_3665,
				    bool && i_9_ == i_7_ - 1);
		method6280();
		class343.method6066(i_9_);
		if (bool_8_)
		    anInterface44_3665.method270();
		Interface44 interface44_10_ = anInterface44_3678;
		anInterface44_3678 = anInterface44_3664;
		anInterface44_3664 = interface44_10_;
		Interface22 interface22 = anInterface22_3666;
		anInterface22_3666 = anInterface22_3669;
		anInterface22_3669 = interface22;
	    }
	}
	aClass185_Sub1_3677.method14687(1);
	aClass185_Sub1_3677.method14671(0);
	aClass185_Sub1_3677.method3237(false);
	aClass185_Sub1_3677.method3537();
	Object object = null;
    }
    
    void method6280() {
	aClass185_Sub1_3677.method14733(0, anInterface37_3679);
	aClass185_Sub1_3677.method14700(aClass349_3680);
	aClass185_Sub1_3677.method14708(Class374.aClass374_3898, 0, 1);
    }
    
    Class343 method6281(int i) {
	return (Class343) aVector3675.elementAt(i);
    }
    
    boolean method6282(Vector vector, int i, Class343 class343) {
	if (class343.method6084() || class343.method6061()) {
	    vector.insertElementAt(class343, i);
	    class343.method6064(anInt3672, anInt3673);
	    int i_11_ = class343.method6069();
	    if (i_11_ > anInt3681)
		anInt3681 = i_11_;
	    class343.aBool3555 = true;
	    return true;
	}
	return false;
    }
    
    boolean method6283(Class343 class343) {
	Vector vector = new Vector();
	boolean bool = false;
	for (int i = 0; i < aVector3675.size(); i++) {
	    if (!bool && class343.method6068() < method6304(i).method6068()) {
		bool = true;
		if (!method6282(vector, vector.size(), class343))
		    return false;
	    }
	    vector.addElement(method6304(i));
	}
	if (!bool && !method6282(vector, vector.size(), class343))
	    return false;
	aVector3675 = vector;
	return true;
    }
    
    void method6284() {
	if (anInterface37_3679 == null) {
	    anInterface37_3679 = aClass185_Sub1_3677.method14698(false);
	    anInterface37_3679.method236(12, 4);
	    ByteBuffer bytebuffer = aClass185_Sub1_3677.aByteBuffer9266;
	    bytebuffer.clear();
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(1.0F);
	    bytebuffer.putFloat(2.0F);
	    anInterface37_3679.method235(0, bytebuffer.position(),
					 aClass185_Sub1_3677.aLong9139);
	    aClass349_3680
		= (aClass185_Sub1_3677.method14699
		   (new Class381[] { new Class381(Class350.aClass350_3596) }));
	}
    }
    
    boolean method6285(Class343 class343) {
	Vector vector = new Vector();
	boolean bool = false;
	for (int i = 0; i < aVector3675.size(); i++) {
	    if (!bool && class343.method6068() < method6304(i).method6068()) {
		bool = true;
		if (!method6282(vector, vector.size(), class343))
		    return false;
	    }
	    vector.addElement(method6304(i));
	}
	if (!bool && !method6282(vector, vector.size(), class343))
	    return false;
	aVector3675 = vector;
	return true;
    }
    
    boolean method6286(int i, int i_12_, int i_13_, int i_14_) {
	if (aVector3675.isEmpty() || method6277())
	    return true;
	if (anInt3672 != i_13_ || anInt3673 != i_14_
	    || aClass185_Sub1_3677.anInt9263 != anInt3682) {
	    anInt3682 = aClass185_Sub1_3677.anInt9263;
	    anInt3672 = i_13_;
	    anInt3673 = i_14_;
	    method6289();
	    method6294();
	}
	aClass175_Sub1_3662.method15075(0, anInterface22_3668);
	if (anInterface21_3667 != null)
	    aClass175_Sub1_3662.method15074(anInterface21_3667);
	if (aClass175_Sub1_3663 != null) {
	    aClass175_Sub1_3663.method15075(0, anInterface22_3670);
	    aClass175_Sub1_3663.method15074(anInterface21_3660);
	    aClass185_Sub1_3677.method3260(aClass175_Sub1_3663, 1621497099);
	} else
	    aClass185_Sub1_3677.method3260(aClass175_Sub1_3662, -728871749);
	if (!aClass175_Sub1_3662.method15076()) {
	    aClass185_Sub1_3677.method3261((aClass175_Sub1_3663 != null
					    ? aClass175_Sub1_3663
					    : aClass175_Sub1_3662),
					   -11578496);
	    return false;
	}
	anInt3674 = i;
	anInt3671 = i_12_;
	aClass185_Sub1_3677.method3340(3, -16777216);
	aClass185_Sub1_3677.method14650(15);
	aClass185_Sub1_3677.method14688(0);
	aBool3661 = true;
	return true;
    }
    
    void method6287(Class343 class343) {
	class343.method6106();
	class343.aBool3555 = false;
	aVector3675.removeElement(class343);
    }
    
    void method6288(int i, int i_15_) {
	aClass185_Sub1_3677.method3237(true);
	aClass185_Sub1_3677.method14711();
	aClass185_Sub1_3677.method14687(0);
	aClass185_Sub1_3677.method14671(1);
	aClass185_Sub1_3677.method3537();
	aClass175_Sub1_3662.method15074(null);
	aClass185_Sub1_3677.method14618(0, 0);
	int i_16_ = aVector3675.size();
	Vector vector = aVector3675;
	for (int i_17_ = 0; i_17_ < i_16_; i_17_++) {
	    if (((Class343) aVector3675.elementAt(i_17_)).method6072()) {
		vector = new Vector();
		for (int i_18_ = 0; i_18_ < i_16_; i_18_++) {
		    if (!((Class343) aVector3675.elementAt(i_18_))
			     .method6072())
			vector.addElement(aVector3675.elementAt(i_18_));
		}
		i_16_ = vector.size();
		break;
	    }
	}
	anInterface44_3665.method270();
	for (int i_19_ = 0; i_19_ < i_16_; i_19_++) {
	    Class343 class343 = (Class343) vector.elementAt(i_19_);
	    int i_20_ = class343.method6082();
	    boolean bool = i_19_ == i_16_ - 1;
	    boolean bool_21_ = false;
	    for (int i_22_ = 0; i_22_ < i_20_; i_22_++) {
		if (i_22_ == i_20_ - 1) {
		    if (bool) {
			aClass185_Sub1_3677.method3261(aClass175_Sub1_3662,
						       -11578496);
			aClass185_Sub1_3677.method3373(anInt3674, anInt3671,
						       anInt3674 + i,
						       anInt3671 + i_15_);
		    } else {
			bool_21_ = true;
			aClass175_Sub1_3662.method15075(0, anInterface22_3668);
		    }
		} else
		    aClass175_Sub1_3662.method15075(0, anInterface22_3669);
		Interface44 interface44 = anInterface44_3678;
		if (i_22_ == 0)
		    interface44 = anInterface44_3665;
		class343.method6065(i_22_, aClass175_Sub1_3662, interface44,
				    anInterface21_3667, anInterface44_3665,
				    bool && i_22_ == i_20_ - 1);
		method6280();
		class343.method6066(i_22_);
		if (bool_21_)
		    anInterface44_3665.method270();
		Interface44 interface44_23_ = anInterface44_3678;
		anInterface44_3678 = anInterface44_3664;
		anInterface44_3664 = interface44_23_;
		Interface22 interface22 = anInterface22_3666;
		anInterface22_3666 = anInterface22_3669;
		anInterface22_3669 = interface22;
	    }
	}
	aClass185_Sub1_3677.method14687(1);
	aClass185_Sub1_3677.method14671(0);
	aClass185_Sub1_3677.method3237(false);
	aClass185_Sub1_3677.method3537();
	Object object = null;
    }
    
    void method6289() {
	if (aClass175_Sub1_3663 != null) {
	    aClass175_Sub1_3663.method142();
	    aClass175_Sub1_3663 = null;
	}
	if (anInterface22_3670 != null) {
	    anInterface22_3670.method142();
	    anInterface22_3670 = null;
	}
	if (anInterface21_3660 != null) {
	    anInterface21_3660.method142();
	    anInterface21_3660 = null;
	}
	if (aClass175_Sub1_3662 != null)
	    aClass175_Sub1_3662.method142();
	if (anInterface22_3666 != null)
	    anInterface22_3666.method142();
	if (anInterface22_3669 != null)
	    anInterface22_3669.method142();
	if (anInterface22_3668 != null)
	    anInterface22_3668.method142();
	if (anInterface44_3678 != null)
	    anInterface44_3678.method142();
	if (anInterface44_3664 != null)
	    anInterface44_3664.method142();
	if (anInterface44_3665 != null)
	    anInterface44_3665.method142();
	if (anInterface21_3667 != null)
	    anInterface21_3667.method142();
	int i = aVector3675.size();
	for (int i_24_ = 0; i_24_ < i; i_24_++) {
	    Class343 class343 = (Class343) aVector3675.elementAt(i_24_);
	    class343.method6106();
	}
    }
    
    void method6290() {
	if (anInterface37_3679 == null) {
	    anInterface37_3679 = aClass185_Sub1_3677.method14698(false);
	    anInterface37_3679.method236(12, 4);
	    ByteBuffer bytebuffer = aClass185_Sub1_3677.aByteBuffer9266;
	    bytebuffer.clear();
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(1.0F);
	    bytebuffer.putFloat(2.0F);
	    anInterface37_3679.method235(0, bytebuffer.position(),
					 aClass185_Sub1_3677.aLong9139);
	    aClass349_3680
		= (aClass185_Sub1_3677.method14699
		   (new Class381[] { new Class381(Class350.aClass350_3596) }));
	}
    }
    
    void method6291() {
	if (anInterface37_3679 == null) {
	    anInterface37_3679 = aClass185_Sub1_3677.method14698(false);
	    anInterface37_3679.method236(12, 4);
	    ByteBuffer bytebuffer = aClass185_Sub1_3677.aByteBuffer9266;
	    bytebuffer.clear();
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(1.0F);
	    bytebuffer.putFloat(2.0F);
	    anInterface37_3679.method235(0, bytebuffer.position(),
					 aClass185_Sub1_3677.aLong9139);
	    aClass349_3680
		= (aClass185_Sub1_3677.method14699
		   (new Class381[] { new Class381(Class350.aClass350_3596) }));
	}
    }
    
    void method6292() {
	aClass185_Sub1_3677.method14733(0, anInterface37_3679);
	aClass185_Sub1_3677.method14700(aClass349_3680);
	aClass185_Sub1_3677.method14708(Class374.aClass374_3898, 0, 1);
    }
    
    void method6293() {
	if (anInterface37_3679 == null) {
	    anInterface37_3679 = aClass185_Sub1_3677.method14698(false);
	    anInterface37_3679.method236(12, 4);
	    ByteBuffer bytebuffer = aClass185_Sub1_3677.aByteBuffer9266;
	    bytebuffer.clear();
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(1.0F);
	    bytebuffer.putFloat(2.0F);
	    anInterface37_3679.method235(0, bytebuffer.position(),
					 aClass185_Sub1_3677.aLong9139);
	    aClass349_3680
		= (aClass185_Sub1_3677.method14699
		   (new Class381[] { new Class381(Class350.aClass350_3596) }));
	}
    }
    
    void method6294() {
	method6305();
	switch (anInt3681) {
	case 0:
	    aClass173_3676 = Class173.aClass173_1830;
	    break;
	case 2:
	    aClass173_3676 = Class173.aClass173_1826;
	    break;
	default:
	    throw new RuntimeException();
	case 1:
	    aClass173_3676 = Class173.aClass173_1832;
	}
	aClass175_Sub1_3662 = aClass185_Sub1_3677.method3263();
	if (aClass185_Sub1_3677.anInt9263 > 1 && aClass185_Sub1_3677.aBool9272
	    && aClass185_Sub1_3677.aBool9273) {
	    aClass175_Sub1_3663 = aClass185_Sub1_3677.method3263();
	    anInterface22_3670
		= aClass185_Sub1_3677.method3678(anInt3672, anInt3673,
						 Class181.aClass181_1952,
						 aClass173_3676,
						 (aClass185_Sub1_3677
						  .anInt9263));
	    anInterface21_3660
		= aClass185_Sub1_3677.method3266(anInt3672, anInt3673,
						 (aClass185_Sub1_3677
						  .anInt9263));
	}
	anInterface44_3678
	    = aClass185_Sub1_3677.method14666(Class181.aClass181_1952,
					      aClass173_3676, anInt3672,
					      anInt3673);
	anInterface22_3666 = anInterface44_3678.method342(0);
	anInterface44_3664
	    = aClass185_Sub1_3677.method14666(Class181.aClass181_1952,
					      aClass173_3676, anInt3672,
					      anInt3673);
	anInterface22_3669 = anInterface44_3664.method342(0);
	anInterface44_3665
	    = aClass185_Sub1_3677.method14666(Class181.aClass181_1952,
					      aClass173_3676, anInt3672,
					      anInt3673);
	anInterface22_3668 = anInterface44_3665.method342(0);
	anInterface21_3667
	    = aClass185_Sub1_3677.method3265(anInterface44_3665.method1(),
					     anInterface44_3665.method93());
	int i = aVector3675.size();
	for (int i_25_ = 0; i_25_ < i; i_25_++) {
	    Class343 class343 = (Class343) aVector3675.elementAt(i_25_);
	    class343.method6064(anInt3672, anInt3673);
	}
    }
    
    void method6295() {
	method6305();
	switch (anInt3681) {
	case 0:
	    aClass173_3676 = Class173.aClass173_1830;
	    break;
	case 2:
	    aClass173_3676 = Class173.aClass173_1826;
	    break;
	default:
	    throw new RuntimeException();
	case 1:
	    aClass173_3676 = Class173.aClass173_1832;
	}
	aClass175_Sub1_3662 = aClass185_Sub1_3677.method3263();
	if (aClass185_Sub1_3677.anInt9263 > 1 && aClass185_Sub1_3677.aBool9272
	    && aClass185_Sub1_3677.aBool9273) {
	    aClass175_Sub1_3663 = aClass185_Sub1_3677.method3263();
	    anInterface22_3670
		= aClass185_Sub1_3677.method3678(anInt3672, anInt3673,
						 Class181.aClass181_1952,
						 aClass173_3676,
						 (aClass185_Sub1_3677
						  .anInt9263));
	    anInterface21_3660
		= aClass185_Sub1_3677.method3266(anInt3672, anInt3673,
						 (aClass185_Sub1_3677
						  .anInt9263));
	}
	anInterface44_3678
	    = aClass185_Sub1_3677.method14666(Class181.aClass181_1952,
					      aClass173_3676, anInt3672,
					      anInt3673);
	anInterface22_3666 = anInterface44_3678.method342(0);
	anInterface44_3664
	    = aClass185_Sub1_3677.method14666(Class181.aClass181_1952,
					      aClass173_3676, anInt3672,
					      anInt3673);
	anInterface22_3669 = anInterface44_3664.method342(0);
	anInterface44_3665
	    = aClass185_Sub1_3677.method14666(Class181.aClass181_1952,
					      aClass173_3676, anInt3672,
					      anInt3673);
	anInterface22_3668 = anInterface44_3665.method342(0);
	anInterface21_3667
	    = aClass185_Sub1_3677.method3265(anInterface44_3665.method1(),
					     anInterface44_3665.method93());
	int i = aVector3675.size();
	for (int i_26_ = 0; i_26_ < i; i_26_++) {
	    Class343 class343 = (Class343) aVector3675.elementAt(i_26_);
	    class343.method6064(anInt3672, anInt3673);
	}
    }
    
    void method6296() {
	method6305();
	switch (anInt3681) {
	case 0:
	    aClass173_3676 = Class173.aClass173_1830;
	    break;
	case 2:
	    aClass173_3676 = Class173.aClass173_1826;
	    break;
	default:
	    throw new RuntimeException();
	case 1:
	    aClass173_3676 = Class173.aClass173_1832;
	}
	aClass175_Sub1_3662 = aClass185_Sub1_3677.method3263();
	if (aClass185_Sub1_3677.anInt9263 > 1 && aClass185_Sub1_3677.aBool9272
	    && aClass185_Sub1_3677.aBool9273) {
	    aClass175_Sub1_3663 = aClass185_Sub1_3677.method3263();
	    anInterface22_3670
		= aClass185_Sub1_3677.method3678(anInt3672, anInt3673,
						 Class181.aClass181_1952,
						 aClass173_3676,
						 (aClass185_Sub1_3677
						  .anInt9263));
	    anInterface21_3660
		= aClass185_Sub1_3677.method3266(anInt3672, anInt3673,
						 (aClass185_Sub1_3677
						  .anInt9263));
	}
	anInterface44_3678
	    = aClass185_Sub1_3677.method14666(Class181.aClass181_1952,
					      aClass173_3676, anInt3672,
					      anInt3673);
	anInterface22_3666 = anInterface44_3678.method342(0);
	anInterface44_3664
	    = aClass185_Sub1_3677.method14666(Class181.aClass181_1952,
					      aClass173_3676, anInt3672,
					      anInt3673);
	anInterface22_3669 = anInterface44_3664.method342(0);
	anInterface44_3665
	    = aClass185_Sub1_3677.method14666(Class181.aClass181_1952,
					      aClass173_3676, anInt3672,
					      anInt3673);
	anInterface22_3668 = anInterface44_3665.method342(0);
	anInterface21_3667
	    = aClass185_Sub1_3677.method3265(anInterface44_3665.method1(),
					     anInterface44_3665.method93());
	int i = aVector3675.size();
	for (int i_27_ = 0; i_27_ < i; i_27_++) {
	    Class343 class343 = (Class343) aVector3675.elementAt(i_27_);
	    class343.method6064(anInt3672, anInt3673);
	}
    }
    
    void method6297() {
	method6305();
	switch (anInt3681) {
	case 0:
	    aClass173_3676 = Class173.aClass173_1830;
	    break;
	case 2:
	    aClass173_3676 = Class173.aClass173_1826;
	    break;
	default:
	    throw new RuntimeException();
	case 1:
	    aClass173_3676 = Class173.aClass173_1832;
	}
	aClass175_Sub1_3662 = aClass185_Sub1_3677.method3263();
	if (aClass185_Sub1_3677.anInt9263 > 1 && aClass185_Sub1_3677.aBool9272
	    && aClass185_Sub1_3677.aBool9273) {
	    aClass175_Sub1_3663 = aClass185_Sub1_3677.method3263();
	    anInterface22_3670
		= aClass185_Sub1_3677.method3678(anInt3672, anInt3673,
						 Class181.aClass181_1952,
						 aClass173_3676,
						 (aClass185_Sub1_3677
						  .anInt9263));
	    anInterface21_3660
		= aClass185_Sub1_3677.method3266(anInt3672, anInt3673,
						 (aClass185_Sub1_3677
						  .anInt9263));
	}
	anInterface44_3678
	    = aClass185_Sub1_3677.method14666(Class181.aClass181_1952,
					      aClass173_3676, anInt3672,
					      anInt3673);
	anInterface22_3666 = anInterface44_3678.method342(0);
	anInterface44_3664
	    = aClass185_Sub1_3677.method14666(Class181.aClass181_1952,
					      aClass173_3676, anInt3672,
					      anInt3673);
	anInterface22_3669 = anInterface44_3664.method342(0);
	anInterface44_3665
	    = aClass185_Sub1_3677.method14666(Class181.aClass181_1952,
					      aClass173_3676, anInt3672,
					      anInt3673);
	anInterface22_3668 = anInterface44_3665.method342(0);
	anInterface21_3667
	    = aClass185_Sub1_3677.method3265(anInterface44_3665.method1(),
					     anInterface44_3665.method93());
	int i = aVector3675.size();
	for (int i_28_ = 0; i_28_ < i; i_28_++) {
	    Class343 class343 = (Class343) aVector3675.elementAt(i_28_);
	    class343.method6064(anInt3672, anInt3673);
	}
    }
    
    void method6298() {
	method6305();
	switch (anInt3681) {
	case 0:
	    aClass173_3676 = Class173.aClass173_1830;
	    break;
	case 2:
	    aClass173_3676 = Class173.aClass173_1826;
	    break;
	default:
	    throw new RuntimeException();
	case 1:
	    aClass173_3676 = Class173.aClass173_1832;
	}
	aClass175_Sub1_3662 = aClass185_Sub1_3677.method3263();
	if (aClass185_Sub1_3677.anInt9263 > 1 && aClass185_Sub1_3677.aBool9272
	    && aClass185_Sub1_3677.aBool9273) {
	    aClass175_Sub1_3663 = aClass185_Sub1_3677.method3263();
	    anInterface22_3670
		= aClass185_Sub1_3677.method3678(anInt3672, anInt3673,
						 Class181.aClass181_1952,
						 aClass173_3676,
						 (aClass185_Sub1_3677
						  .anInt9263));
	    anInterface21_3660
		= aClass185_Sub1_3677.method3266(anInt3672, anInt3673,
						 (aClass185_Sub1_3677
						  .anInt9263));
	}
	anInterface44_3678
	    = aClass185_Sub1_3677.method14666(Class181.aClass181_1952,
					      aClass173_3676, anInt3672,
					      anInt3673);
	anInterface22_3666 = anInterface44_3678.method342(0);
	anInterface44_3664
	    = aClass185_Sub1_3677.method14666(Class181.aClass181_1952,
					      aClass173_3676, anInt3672,
					      anInt3673);
	anInterface22_3669 = anInterface44_3664.method342(0);
	anInterface44_3665
	    = aClass185_Sub1_3677.method14666(Class181.aClass181_1952,
					      aClass173_3676, anInt3672,
					      anInt3673);
	anInterface22_3668 = anInterface44_3665.method342(0);
	anInterface21_3667
	    = aClass185_Sub1_3677.method3265(anInterface44_3665.method1(),
					     anInterface44_3665.method93());
	int i = aVector3675.size();
	for (int i_29_ = 0; i_29_ < i; i_29_++) {
	    Class343 class343 = (Class343) aVector3675.elementAt(i_29_);
	    class343.method6064(anInt3672, anInt3673);
	}
    }
    
    boolean method6299(Class343 class343) {
	Vector vector = new Vector();
	boolean bool = false;
	for (int i = 0; i < aVector3675.size(); i++) {
	    if (!bool && class343.method6068() < method6304(i).method6068()) {
		bool = true;
		if (!method6282(vector, vector.size(), class343))
		    return false;
	    }
	    vector.addElement(method6304(i));
	}
	if (!bool && !method6282(vector, vector.size(), class343))
	    return false;
	aVector3675 = vector;
	return true;
    }
    
    void method6300(int i, int i_30_) {
	if (aBool3661) {
	    if (aClass175_Sub1_3663 != null) {
		aClass185_Sub1_3677.method3261(aClass175_Sub1_3663, -11578496);
		aClass185_Sub1_3677.method3260(aClass175_Sub1_3662,
					       -1030295030);
		aClass175_Sub1_3663.method15077(0, 0, anInt3672, anInt3673, 0,
						0, true,
						anInterface21_3667 != null);
	    }
	    method6288(i, i_30_);
	    aBool3661 = false;
	}
    }
    
    boolean method6301(Class343 class343) {
	Vector vector = new Vector();
	boolean bool = false;
	for (int i = 0; i < aVector3675.size(); i++) {
	    if (!bool && class343.method6068() < method6304(i).method6068()) {
		bool = true;
		if (!method6282(vector, vector.size(), class343))
		    return false;
	    }
	    vector.addElement(method6304(i));
	}
	if (!bool && !method6282(vector, vector.size(), class343))
	    return false;
	aVector3675 = vector;
	return true;
    }
    
    boolean method6302(Class343 class343) {
	Vector vector = new Vector();
	boolean bool = false;
	for (int i = 0; i < aVector3675.size(); i++) {
	    if (!bool && class343.method6068() < method6304(i).method6068()) {
		bool = true;
		if (!method6282(vector, vector.size(), class343))
		    return false;
	    }
	    vector.addElement(method6304(i));
	}
	if (!bool && !method6282(vector, vector.size(), class343))
	    return false;
	aVector3675 = vector;
	return true;
    }
    
    Class355(Class185_Sub1 class185_sub1, int i, int i_31_) {
	aClass185_Sub1_3677 = class185_sub1;
	aClass173_3676 = Class173.aClass173_1830;
	anInt3672 = i;
	anInt3673 = i_31_;
    }
    
    boolean method6303() {
	int i = aVector3675.size();
	for (int i_32_ = 0; i_32_ < i; i_32_++) {
	    if (!((Class343) aVector3675.elementAt(i_32_)).method6072())
		return false;
	}
	return true;
    }
    
    Class343 method6304(int i) {
	return (Class343) aVector3675.elementAt(i);
    }
    
    void method6305() {
	if (anInterface37_3679 == null) {
	    anInterface37_3679 = aClass185_Sub1_3677.method14698(false);
	    anInterface37_3679.method236(12, 4);
	    ByteBuffer bytebuffer = aClass185_Sub1_3677.aByteBuffer9266;
	    bytebuffer.clear();
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(1.0F);
	    bytebuffer.putFloat(2.0F);
	    anInterface37_3679.method235(0, bytebuffer.position(),
					 aClass185_Sub1_3677.aLong9139);
	    aClass349_3680
		= (aClass185_Sub1_3677.method14699
		   (new Class381[] { new Class381(Class350.aClass350_3596) }));
	}
    }
    
    void method6306(int i, int i_33_) {
	aClass185_Sub1_3677.method3237(true);
	aClass185_Sub1_3677.method14711();
	aClass185_Sub1_3677.method14687(0);
	aClass185_Sub1_3677.method14671(1);
	aClass185_Sub1_3677.method3537();
	aClass175_Sub1_3662.method15074(null);
	aClass185_Sub1_3677.method14618(0, 0);
	int i_34_ = aVector3675.size();
	Vector vector = aVector3675;
	for (int i_35_ = 0; i_35_ < i_34_; i_35_++) {
	    if (((Class343) aVector3675.elementAt(i_35_)).method6072()) {
		vector = new Vector();
		for (int i_36_ = 0; i_36_ < i_34_; i_36_++) {
		    if (!((Class343) aVector3675.elementAt(i_36_))
			     .method6072())
			vector.addElement(aVector3675.elementAt(i_36_));
		}
		i_34_ = vector.size();
		break;
	    }
	}
	anInterface44_3665.method270();
	for (int i_37_ = 0; i_37_ < i_34_; i_37_++) {
	    Class343 class343 = (Class343) vector.elementAt(i_37_);
	    int i_38_ = class343.method6082();
	    boolean bool = i_37_ == i_34_ - 1;
	    boolean bool_39_ = false;
	    for (int i_40_ = 0; i_40_ < i_38_; i_40_++) {
		if (i_40_ == i_38_ - 1) {
		    if (bool) {
			aClass185_Sub1_3677.method3261(aClass175_Sub1_3662,
						       -11578496);
			aClass185_Sub1_3677.method3373(anInt3674, anInt3671,
						       anInt3674 + i,
						       anInt3671 + i_33_);
		    } else {
			bool_39_ = true;
			aClass175_Sub1_3662.method15075(0, anInterface22_3668);
		    }
		} else
		    aClass175_Sub1_3662.method15075(0, anInterface22_3669);
		Interface44 interface44 = anInterface44_3678;
		if (i_40_ == 0)
		    interface44 = anInterface44_3665;
		class343.method6065(i_40_, aClass175_Sub1_3662, interface44,
				    anInterface21_3667, anInterface44_3665,
				    bool && i_40_ == i_38_ - 1);
		method6280();
		class343.method6066(i_40_);
		if (bool_39_)
		    anInterface44_3665.method270();
		Interface44 interface44_41_ = anInterface44_3678;
		anInterface44_3678 = anInterface44_3664;
		anInterface44_3664 = interface44_41_;
		Interface22 interface22 = anInterface22_3666;
		anInterface22_3666 = anInterface22_3669;
		anInterface22_3669 = interface22;
	    }
	}
	aClass185_Sub1_3677.method14687(1);
	aClass185_Sub1_3677.method14671(0);
	aClass185_Sub1_3677.method3237(false);
	aClass185_Sub1_3677.method3537();
	Object object = null;
    }
    
    void method6307() {
	if (aClass175_Sub1_3663 != null) {
	    aClass175_Sub1_3663.method142();
	    aClass175_Sub1_3663 = null;
	}
	if (anInterface22_3670 != null) {
	    anInterface22_3670.method142();
	    anInterface22_3670 = null;
	}
	if (anInterface21_3660 != null) {
	    anInterface21_3660.method142();
	    anInterface21_3660 = null;
	}
	if (aClass175_Sub1_3662 != null)
	    aClass175_Sub1_3662.method142();
	if (anInterface22_3666 != null)
	    anInterface22_3666.method142();
	if (anInterface22_3669 != null)
	    anInterface22_3669.method142();
	if (anInterface22_3668 != null)
	    anInterface22_3668.method142();
	if (anInterface44_3678 != null)
	    anInterface44_3678.method142();
	if (anInterface44_3664 != null)
	    anInterface44_3664.method142();
	if (anInterface44_3665 != null)
	    anInterface44_3665.method142();
	if (anInterface21_3667 != null)
	    anInterface21_3667.method142();
	int i = aVector3675.size();
	for (int i_42_ = 0; i_42_ < i; i_42_++) {
	    Class343 class343 = (Class343) aVector3675.elementAt(i_42_);
	    class343.method6106();
	}
    }
    
    void method6308() {
	if (aClass175_Sub1_3663 != null) {
	    aClass175_Sub1_3663.method142();
	    aClass175_Sub1_3663 = null;
	}
	if (anInterface22_3670 != null) {
	    anInterface22_3670.method142();
	    anInterface22_3670 = null;
	}
	if (anInterface21_3660 != null) {
	    anInterface21_3660.method142();
	    anInterface21_3660 = null;
	}
	if (aClass175_Sub1_3662 != null)
	    aClass175_Sub1_3662.method142();
	if (anInterface22_3666 != null)
	    anInterface22_3666.method142();
	if (anInterface22_3669 != null)
	    anInterface22_3669.method142();
	if (anInterface22_3668 != null)
	    anInterface22_3668.method142();
	if (anInterface44_3678 != null)
	    anInterface44_3678.method142();
	if (anInterface44_3664 != null)
	    anInterface44_3664.method142();
	if (anInterface44_3665 != null)
	    anInterface44_3665.method142();
	if (anInterface21_3667 != null)
	    anInterface21_3667.method142();
	int i = aVector3675.size();
	for (int i_43_ = 0; i_43_ < i; i_43_++) {
	    Class343 class343 = (Class343) aVector3675.elementAt(i_43_);
	    class343.method6106();
	}
    }
}
