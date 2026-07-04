/* Class153 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class153
{
    int anInt1710;
    Class175_Sub1_Sub2 aClass175_Sub1_Sub2_1711;
    Class175_Sub1_Sub2 aClass175_Sub1_Sub2_1712;
    Class175_Sub1_Sub2 aClass175_Sub1_Sub2_1713;
    int anInt1714 = 0;
    int anInt1715;
    int anInt1716;
    boolean aBool1717;
    int anInt1718;
    Class700 aClass700_1719;
    boolean aBool1720;
    boolean aBool1721;
    Class534_Sub18_Sub1 aClass534_Sub18_Sub1_1722;
    boolean aBool1723;
    Class141_Sub2[] aClass141_Sub2Array1724;
    boolean aBool1725;
    Class141_Sub2 aClass141_Sub2_1726;
    Class534_Sub18_Sub1 aClass534_Sub18_Sub1_1727;
    boolean aBool1728;
    Class185_Sub3 aClass185_Sub3_1729;
    Class173 aClass173_1730;
    
    void method2546(Class534_Sub9 class534_sub9) {
	class534_sub9.aBool10426 = false;
	class534_sub9.method16104();
	class534_sub9.method8892((byte) 1);
	method2556();
    }
    
    void method2547() {
	aClass175_Sub1_Sub2_1711 = null;
	aClass175_Sub1_Sub2_1712 = null;
	aClass175_Sub1_Sub2_1713 = null;
	aClass534_Sub18_Sub1_1727 = null;
	aClass141_Sub2_1726 = null;
	aClass141_Sub2Array1724 = null;
	aClass534_Sub18_Sub1_1722 = null;
	if (!aClass700_1719.method14142(-1073645894)) {
	    for (Class534 class534 = aClass700_1719.method14135((byte) -1);
		 class534 != aClass700_1719.aClass534_8803;
		 class534 = class534.aClass534_7159)
		((Class534_Sub9) class534).method16104();
	}
	anInt1718 = 1;
	anInt1716 = 1;
    }
    
    boolean method2548() {
	return aClass175_Sub1_Sub2_1713 != null;
    }
    
    boolean method2549() {
	for (Class534_Sub9 class534_sub9
		 = (Class534_Sub9) aClass700_1719.method14135((byte) -1);
	     class534_sub9 != null;
	     class534_sub9
		 = (Class534_Sub9) aClass700_1719.method14139(892392250)) {
	    if (!class534_sub9.method16081())
		return false;
	}
	return true;
    }
    
    boolean method2550() {
	if (aBool1721) {
	    if (aClass534_Sub18_Sub1_1727 != null) {
		aClass534_Sub18_Sub1_1727.method142();
		aClass534_Sub18_Sub1_1727 = null;
	    }
	    if (aClass141_Sub2_1726 != null) {
		aClass141_Sub2_1726.method2368();
		aClass141_Sub2_1726 = null;
	    }
	}
	if (aBool1720) {
	    if (aClass534_Sub18_Sub1_1722 != null) {
		aClass534_Sub18_Sub1_1722.method142();
		aClass534_Sub18_Sub1_1722 = null;
	    }
	    if (aClass141_Sub2Array1724[0] != null) {
		aClass141_Sub2Array1724[0].method2368();
		aClass141_Sub2Array1724[0] = null;
	    }
	    if (aClass141_Sub2Array1724[1] != null) {
		aClass141_Sub2Array1724[1].method2368();
		aClass141_Sub2Array1724[1] = null;
	    }
	}
	if (aBool1721) {
	    if (aClass175_Sub1_Sub2_1712 != null)
		aClass534_Sub18_Sub1_1727
		    = new Class534_Sub18_Sub1(aClass185_Sub3_1729,
					      Class181.aClass181_1956,
					      Class173.aClass173_1828,
					      anInt1716, anInt1718,
					      aClass185_Sub3_1729.anInt9668);
	    if (aBool1728)
		aClass141_Sub2_1726
		    = new Class141_Sub2(aClass185_Sub3_1729, 34037,
					Class181.aClass181_1956,
					Class173.aClass173_1828, anInt1716,
					anInt1718);
	    else if (aClass534_Sub18_Sub1_1727 == null)
		aClass534_Sub18_Sub1_1727
		    = new Class534_Sub18_Sub1(aClass185_Sub3_1729,
					      Class181.aClass181_1956,
					      Class173.aClass173_1828,
					      anInt1716, anInt1718);
	    aBool1721 = false;
	    aBool1725 = true;
	    aBool1723 = true;
	}
	if (aBool1720) {
	    if (aClass175_Sub1_Sub2_1712 != null)
		aClass534_Sub18_Sub1_1722
		    = new Class534_Sub18_Sub1(aClass185_Sub3_1729,
					      Class181.aClass181_1952,
					      aClass173_1730, anInt1716,
					      anInt1718,
					      aClass185_Sub3_1729.anInt9668);
	    aClass141_Sub2Array1724[0]
		= new Class141_Sub2(aClass185_Sub3_1729, 34037,
				    Class181.aClass181_1952, aClass173_1730,
				    anInt1716, anInt1718);
	    aClass141_Sub2Array1724[1]
		= anInt1715 > 1 ? new Class141_Sub2(aClass185_Sub3_1729, 34037,
						    Class181.aClass181_1952,
						    aClass173_1730, anInt1716,
						    anInt1718) : null;
	    aBool1720 = false;
	    aBool1725 = true;
	    aBool1723 = true;
	}
	if (aBool1725) {
	    if (aClass175_Sub1_Sub2_1712 != null) {
		aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1711,
					       -1251547541);
		aClass175_Sub1_Sub2_1711.method15074(null);
		aClass175_Sub1_Sub2_1711.method15075(0, null);
		aClass175_Sub1_Sub2_1711.method15075(1, null);
		aClass175_Sub1_Sub2_1711
		    .method15075(0, aClass141_Sub2Array1724[0].method14451(0));
		aClass175_Sub1_Sub2_1711.method15075(1,
						     (anInt1715 > 1
						      ? aClass141_Sub2Array1724
							    [1].method14451(0)
						      : null));
		if (aBool1728)
		    aClass175_Sub1_Sub2_1711
			.method15074(aClass141_Sub2_1726.method14447(0));
		aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1711,
					       -11578496);
		aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1712,
					       331972922);
		aClass175_Sub1_Sub2_1712.method15074(null);
		aClass175_Sub1_Sub2_1712.method15075(0, null);
		aClass175_Sub1_Sub2_1712
		    .method15075(0, aClass534_Sub18_Sub1_1722);
		aClass175_Sub1_Sub2_1712
		    .method15074(aClass534_Sub18_Sub1_1727);
		aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1712,
					       -11578496);
	    } else {
		aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1711,
					       1493046548);
		aClass175_Sub1_Sub2_1711.method15074(null);
		aClass175_Sub1_Sub2_1711.method15075(0, null);
		aClass175_Sub1_Sub2_1711.method15075(1, null);
		aClass175_Sub1_Sub2_1711
		    .method15075(0, aClass141_Sub2Array1724[0].method14451(0));
		aClass175_Sub1_Sub2_1711.method15075(1,
						     (anInt1715 > 1
						      ? aClass141_Sub2Array1724
							    [1].method14451(0)
						      : null));
		if (aBool1728)
		    aClass175_Sub1_Sub2_1711
			.method15074(aClass141_Sub2_1726.method14447(0));
		else
		    aClass175_Sub1_Sub2_1711
			.method15074(aClass534_Sub18_Sub1_1727);
		aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1711,
					       -11578496);
	    }
	    aBool1725 = false;
	    aBool1723 = true;
	}
	if (aBool1723) {
	    aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1713,
					   -975837112);
	    aBool1723 = !aClass175_Sub1_Sub2_1713.method15076();
	    aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1713,
					   -11578496);
	}
	return !aBool1723;
    }
    
    boolean method2551() {
	if (aBool1721) {
	    if (aClass534_Sub18_Sub1_1727 != null) {
		aClass534_Sub18_Sub1_1727.method142();
		aClass534_Sub18_Sub1_1727 = null;
	    }
	    if (aClass141_Sub2_1726 != null) {
		aClass141_Sub2_1726.method2368();
		aClass141_Sub2_1726 = null;
	    }
	}
	if (aBool1720) {
	    if (aClass534_Sub18_Sub1_1722 != null) {
		aClass534_Sub18_Sub1_1722.method142();
		aClass534_Sub18_Sub1_1722 = null;
	    }
	    if (aClass141_Sub2Array1724[0] != null) {
		aClass141_Sub2Array1724[0].method2368();
		aClass141_Sub2Array1724[0] = null;
	    }
	    if (aClass141_Sub2Array1724[1] != null) {
		aClass141_Sub2Array1724[1].method2368();
		aClass141_Sub2Array1724[1] = null;
	    }
	}
	if (aBool1721) {
	    if (aClass175_Sub1_Sub2_1712 != null)
		aClass534_Sub18_Sub1_1727
		    = new Class534_Sub18_Sub1(aClass185_Sub3_1729,
					      Class181.aClass181_1956,
					      Class173.aClass173_1828,
					      anInt1716, anInt1718,
					      aClass185_Sub3_1729.anInt9668);
	    if (aBool1728)
		aClass141_Sub2_1726
		    = new Class141_Sub2(aClass185_Sub3_1729, 34037,
					Class181.aClass181_1956,
					Class173.aClass173_1828, anInt1716,
					anInt1718);
	    else if (aClass534_Sub18_Sub1_1727 == null)
		aClass534_Sub18_Sub1_1727
		    = new Class534_Sub18_Sub1(aClass185_Sub3_1729,
					      Class181.aClass181_1956,
					      Class173.aClass173_1828,
					      anInt1716, anInt1718);
	    aBool1721 = false;
	    aBool1725 = true;
	    aBool1723 = true;
	}
	if (aBool1720) {
	    if (aClass175_Sub1_Sub2_1712 != null)
		aClass534_Sub18_Sub1_1722
		    = new Class534_Sub18_Sub1(aClass185_Sub3_1729,
					      Class181.aClass181_1952,
					      aClass173_1730, anInt1716,
					      anInt1718,
					      aClass185_Sub3_1729.anInt9668);
	    aClass141_Sub2Array1724[0]
		= new Class141_Sub2(aClass185_Sub3_1729, 34037,
				    Class181.aClass181_1952, aClass173_1730,
				    anInt1716, anInt1718);
	    aClass141_Sub2Array1724[1]
		= anInt1715 > 1 ? new Class141_Sub2(aClass185_Sub3_1729, 34037,
						    Class181.aClass181_1952,
						    aClass173_1730, anInt1716,
						    anInt1718) : null;
	    aBool1720 = false;
	    aBool1725 = true;
	    aBool1723 = true;
	}
	if (aBool1725) {
	    if (aClass175_Sub1_Sub2_1712 != null) {
		aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1711,
					       -1244528391);
		aClass175_Sub1_Sub2_1711.method15074(null);
		aClass175_Sub1_Sub2_1711.method15075(0, null);
		aClass175_Sub1_Sub2_1711.method15075(1, null);
		aClass175_Sub1_Sub2_1711
		    .method15075(0, aClass141_Sub2Array1724[0].method14451(0));
		aClass175_Sub1_Sub2_1711.method15075(1,
						     (anInt1715 > 1
						      ? aClass141_Sub2Array1724
							    [1].method14451(0)
						      : null));
		if (aBool1728)
		    aClass175_Sub1_Sub2_1711
			.method15074(aClass141_Sub2_1726.method14447(0));
		aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1711,
					       -11578496);
		aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1712,
					       2079252894);
		aClass175_Sub1_Sub2_1712.method15074(null);
		aClass175_Sub1_Sub2_1712.method15075(0, null);
		aClass175_Sub1_Sub2_1712
		    .method15075(0, aClass534_Sub18_Sub1_1722);
		aClass175_Sub1_Sub2_1712
		    .method15074(aClass534_Sub18_Sub1_1727);
		aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1712,
					       -11578496);
	    } else {
		aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1711,
					       818573332);
		aClass175_Sub1_Sub2_1711.method15074(null);
		aClass175_Sub1_Sub2_1711.method15075(0, null);
		aClass175_Sub1_Sub2_1711.method15075(1, null);
		aClass175_Sub1_Sub2_1711
		    .method15075(0, aClass141_Sub2Array1724[0].method14451(0));
		aClass175_Sub1_Sub2_1711.method15075(1,
						     (anInt1715 > 1
						      ? aClass141_Sub2Array1724
							    [1].method14451(0)
						      : null));
		if (aBool1728)
		    aClass175_Sub1_Sub2_1711
			.method15074(aClass141_Sub2_1726.method14447(0));
		else
		    aClass175_Sub1_Sub2_1711
			.method15074(aClass534_Sub18_Sub1_1727);
		aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1711,
					       -11578496);
	    }
	    aBool1725 = false;
	    aBool1723 = true;
	}
	if (aBool1723) {
	    aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1713,
					   632506072);
	    aBool1723 = !aClass175_Sub1_Sub2_1713.method15076();
	    aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1713,
					   -11578496);
	}
	return !aBool1723;
    }
    
    boolean method2552(int i, int i_0_, int i_1_, int i_2_) {
	if (aClass175_Sub1_Sub2_1713 == null
	    || aClass700_1719.method14142(597988722) || method2557())
	    return false;
	if (anInt1716 != i_1_ || anInt1718 != i_2_) {
	    anInt1716 = i_1_;
	    anInt1718 = i_2_;
	    for (Class534 class534 = aClass700_1719.method14135((byte) -1);
		 class534 != aClass700_1719.aClass534_8803;
		 class534 = class534.aClass534_7159)
		((Class534_Sub9) class534).method16072(anInt1716, anInt1718);
	    aBool1720 = true;
	    aBool1721 = true;
	    aBool1725 = true;
	}
	if (method2551()) {
	    anInt1714 = i;
	    anInt1710 = i_0_;
	    aBool1717 = true;
	    aClass185_Sub3_1729.method15196(-anInt1714,
					    (anInt1718 + anInt1710
					     - aClass185_Sub3_1729.method3253
						   (-2016316375)
						   .method2911()));
	    aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1713,
					   658230148);
	    aClass175_Sub1_Sub2_1713.method17914(0);
	    aClass185_Sub3_1729.method3340(3, 0);
	    return true;
	}
	return false;
    }
    
    void method2553(int i, int i_3_) {
	if (aBool1717) {
	    if (aClass175_Sub1_Sub2_1712 != null) {
		aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1712,
					       -11578496);
		aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1711,
					       619119551);
		aClass175_Sub1_Sub2_1711.method17914(0);
		aClass175_Sub1_Sub2_1712.method15077(0, 0, anInt1716,
						     anInt1718, 0, 0, true,
						     aBool1728);
	    }
	    aClass185_Sub3_1729.method15224();
	    aClass185_Sub3_1729.method15246(0);
	    aClass185_Sub3_1729.method15214(1);
	    aClass185_Sub3_1729.method3537();
	    int i_4_ = 0;
	    int i_5_ = 1;
	    int i_6_ = 0;
	    int i_7_ = 0;
	    int i_8_ = 0;
	    Object object = null;
	    for (Class534_Sub9 class534_sub9
		     = (Class534_Sub9) aClass700_1719.method14135((byte) -1);
		 class534_sub9 != null;
		 class534_sub9 = ((Class534_Sub9)
				  aClass700_1719.method14139(2116949534))) {
		if (!class534_sub9.method16081())
		    i_7_++;
	    }
	    Class534_Sub9[] class534_sub9s = new Class534_Sub9[i_7_];
	    i_7_ = 0;
	    for (Class534_Sub9 class534_sub9
		     = (Class534_Sub9) aClass700_1719.method14135((byte) -1);
		 class534_sub9 != null;
		 class534_sub9
		     = (Class534_Sub9) aClass700_1719.method14139(982839626)) {
		if (!class534_sub9.method16081())
		    class534_sub9s[i_7_++] = class534_sub9;
	    }
	    while (i_6_ < i_7_) {
		for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
		    Class534_Sub9 class534_sub9 = class534_sub9s[i_9_];
		    if (class534_sub9.method16077() == i_8_) {
			int i_10_ = class534_sub9.method16076();
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
			    aClass185_Sub3_1729.method15196(0, 0);
			    class534_sub9.method16105(i_11_,
						      (aClass141_Sub2Array1724
						       [i_4_]),
						      aClass141_Sub2_1726,
						      i_3_, i);
			    if (i_11_ == i_10_ - 1 && i_6_ == i_7_ - 1) {
				aClass185_Sub3_1729.method3261
				    (aClass175_Sub1_Sub2_1711, -11578496);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F,
						    (float) (0 + anInt1718));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
				OpenGL.glVertex2i(anInt1714, anInt1710);
				OpenGL.glTexCoord2f(0.0F, (float) (anInt1718
								   - i_3_));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glVertex2i(anInt1714, anInt1710 + i_3_);
				OpenGL.glTexCoord2f((float) (0 + i),
						    (float) (anInt1718
							     - i_3_));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
				OpenGL.glVertex2i(anInt1714 + i,
						  anInt1710 + i_3_);
				OpenGL.glTexCoord2f((float) (0 + i),
						    (float) (0 + anInt1718));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
				OpenGL.glVertex2i(anInt1714 + i, anInt1710);
				OpenGL.glEnd();
			    } else {
				aClass175_Sub1_Sub2_1711.method17914(i_5_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, (float) anInt1718);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
				OpenGL.glVertex2i(0, 0);
				OpenGL.glTexCoord2f(0.0F, (float) (anInt1718
								   - i_3_));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glVertex2i(0, i_3_);
				OpenGL.glTexCoord2f((float) i,
						    (float) (anInt1718
							     - i_3_));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
				OpenGL.glVertex2i(i, i_3_);
				OpenGL.glTexCoord2f((float) i,
						    (float) anInt1718);
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
				OpenGL.glVertex2i(i, 0);
				OpenGL.glEnd();
			    }
			    class534_sub9.method16073(i_11_);
			    i_5_ = i_5_ + 1 & 0x1;
			    i_4_ = i_4_ + 1 & 0x1;
			}
			i_6_++;
		    }
		}
		i_8_++;
	    }
	    aBool1717 = false;
	    object = null;
	}
    }
    
    boolean method2554(Class534_Sub9 class534_sub9) {
	if (aClass175_Sub1_Sub2_1713 != null) {
	    if (class534_sub9.method16070() || class534_sub9.method16069()) {
		aClass700_1719.method14131(class534_sub9, (short) 789);
		method2556();
		if (class534_sub9.method16077() >= 0 && method2551()) {
		    if (anInt1716 != -1 && anInt1718 != -1)
			class534_sub9.method16072(anInt1716, anInt1718);
		    class534_sub9.aBool10426 = true;
		    return true;
		}
	    }
	    method2555(class534_sub9);
	}
	return false;
    }
    
    void method2555(Class534_Sub9 class534_sub9) {
	class534_sub9.aBool10426 = false;
	class534_sub9.method16104();
	class534_sub9.method8892((byte) 1);
	method2556();
    }
    
    void method2556() {
	int i = 0;
	boolean bool = false;
	Class173 class173 = Class173.aClass173_1830;
	for (Class534_Sub9 class534_sub9
		 = (Class534_Sub9) aClass700_1719.method14135((byte) -1);
	     class534_sub9 != null;
	     class534_sub9
		 = (Class534_Sub9) aClass700_1719.method14139(1071592727)) {
	    Class173 class173_12_ = class534_sub9.method16079();
	    if (class173_12_.anInt1825 * 1899960707
		> class173.anInt1825 * 1899960707)
		class173 = class173_12_;
	    bool |= class534_sub9.method16078();
	    i += class534_sub9.method16076();
	}
	if (class173 != aClass173_1730) {
	    aClass173_1730 = class173;
	    aBool1720 = true;
	}
	int i_13_ = anInt1715 > 2 ? 2 : anInt1715;
	int i_14_ = i > 2 ? 2 : i;
	if (i_13_ != i_14_) {
	    aBool1720 = true;
	    aBool1725 = true;
	}
	if (bool != aBool1728) {
	    aBool1728 = bool;
	    aBool1721 = true;
	}
	anInt1715 = i;
    }
    
    boolean method2557() {
	for (Class534_Sub9 class534_sub9
		 = (Class534_Sub9) aClass700_1719.method14135((byte) -1);
	     class534_sub9 != null;
	     class534_sub9
		 = (Class534_Sub9) aClass700_1719.method14139(817265374)) {
	    if (!class534_sub9.method16081())
		return false;
	}
	return true;
    }
    
    boolean method2558() {
	return aBool1717;
    }
    
    void method2559(Class534_Sub9 class534_sub9) {
	class534_sub9.aBool10426 = false;
	class534_sub9.method16104();
	class534_sub9.method8892((byte) 1);
	method2556();
    }
    
    boolean method2560() {
	for (Class534_Sub9 class534_sub9
		 = (Class534_Sub9) aClass700_1719.method14135((byte) -1);
	     class534_sub9 != null;
	     class534_sub9
		 = (Class534_Sub9) aClass700_1719.method14139(1092467870)) {
	    if (!class534_sub9.method16081())
		return false;
	}
	return true;
    }
    
    boolean method2561() {
	return aBool1717;
    }
    
    boolean method2562() {
	if (aBool1721) {
	    if (aClass534_Sub18_Sub1_1727 != null) {
		aClass534_Sub18_Sub1_1727.method142();
		aClass534_Sub18_Sub1_1727 = null;
	    }
	    if (aClass141_Sub2_1726 != null) {
		aClass141_Sub2_1726.method2368();
		aClass141_Sub2_1726 = null;
	    }
	}
	if (aBool1720) {
	    if (aClass534_Sub18_Sub1_1722 != null) {
		aClass534_Sub18_Sub1_1722.method142();
		aClass534_Sub18_Sub1_1722 = null;
	    }
	    if (aClass141_Sub2Array1724[0] != null) {
		aClass141_Sub2Array1724[0].method2368();
		aClass141_Sub2Array1724[0] = null;
	    }
	    if (aClass141_Sub2Array1724[1] != null) {
		aClass141_Sub2Array1724[1].method2368();
		aClass141_Sub2Array1724[1] = null;
	    }
	}
	if (aBool1721) {
	    if (aClass175_Sub1_Sub2_1712 != null)
		aClass534_Sub18_Sub1_1727
		    = new Class534_Sub18_Sub1(aClass185_Sub3_1729,
					      Class181.aClass181_1956,
					      Class173.aClass173_1828,
					      anInt1716, anInt1718,
					      aClass185_Sub3_1729.anInt9668);
	    if (aBool1728)
		aClass141_Sub2_1726
		    = new Class141_Sub2(aClass185_Sub3_1729, 34037,
					Class181.aClass181_1956,
					Class173.aClass173_1828, anInt1716,
					anInt1718);
	    else if (aClass534_Sub18_Sub1_1727 == null)
		aClass534_Sub18_Sub1_1727
		    = new Class534_Sub18_Sub1(aClass185_Sub3_1729,
					      Class181.aClass181_1956,
					      Class173.aClass173_1828,
					      anInt1716, anInt1718);
	    aBool1721 = false;
	    aBool1725 = true;
	    aBool1723 = true;
	}
	if (aBool1720) {
	    if (aClass175_Sub1_Sub2_1712 != null)
		aClass534_Sub18_Sub1_1722
		    = new Class534_Sub18_Sub1(aClass185_Sub3_1729,
					      Class181.aClass181_1952,
					      aClass173_1730, anInt1716,
					      anInt1718,
					      aClass185_Sub3_1729.anInt9668);
	    aClass141_Sub2Array1724[0]
		= new Class141_Sub2(aClass185_Sub3_1729, 34037,
				    Class181.aClass181_1952, aClass173_1730,
				    anInt1716, anInt1718);
	    aClass141_Sub2Array1724[1]
		= anInt1715 > 1 ? new Class141_Sub2(aClass185_Sub3_1729, 34037,
						    Class181.aClass181_1952,
						    aClass173_1730, anInt1716,
						    anInt1718) : null;
	    aBool1720 = false;
	    aBool1725 = true;
	    aBool1723 = true;
	}
	if (aBool1725) {
	    if (aClass175_Sub1_Sub2_1712 != null) {
		aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1711,
					       1645730987);
		aClass175_Sub1_Sub2_1711.method15074(null);
		aClass175_Sub1_Sub2_1711.method15075(0, null);
		aClass175_Sub1_Sub2_1711.method15075(1, null);
		aClass175_Sub1_Sub2_1711
		    .method15075(0, aClass141_Sub2Array1724[0].method14451(0));
		aClass175_Sub1_Sub2_1711.method15075(1,
						     (anInt1715 > 1
						      ? aClass141_Sub2Array1724
							    [1].method14451(0)
						      : null));
		if (aBool1728)
		    aClass175_Sub1_Sub2_1711
			.method15074(aClass141_Sub2_1726.method14447(0));
		aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1711,
					       -11578496);
		aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1712,
					       -11457949);
		aClass175_Sub1_Sub2_1712.method15074(null);
		aClass175_Sub1_Sub2_1712.method15075(0, null);
		aClass175_Sub1_Sub2_1712
		    .method15075(0, aClass534_Sub18_Sub1_1722);
		aClass175_Sub1_Sub2_1712
		    .method15074(aClass534_Sub18_Sub1_1727);
		aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1712,
					       -11578496);
	    } else {
		aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1711,
					       238113482);
		aClass175_Sub1_Sub2_1711.method15074(null);
		aClass175_Sub1_Sub2_1711.method15075(0, null);
		aClass175_Sub1_Sub2_1711.method15075(1, null);
		aClass175_Sub1_Sub2_1711
		    .method15075(0, aClass141_Sub2Array1724[0].method14451(0));
		aClass175_Sub1_Sub2_1711.method15075(1,
						     (anInt1715 > 1
						      ? aClass141_Sub2Array1724
							    [1].method14451(0)
						      : null));
		if (aBool1728)
		    aClass175_Sub1_Sub2_1711
			.method15074(aClass141_Sub2_1726.method14447(0));
		else
		    aClass175_Sub1_Sub2_1711
			.method15074(aClass534_Sub18_Sub1_1727);
		aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1711,
					       -11578496);
	    }
	    aBool1725 = false;
	    aBool1723 = true;
	}
	if (aBool1723) {
	    aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1713,
					   -1307966771);
	    aBool1723 = !aClass175_Sub1_Sub2_1713.method15076();
	    aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1713,
					   -11578496);
	}
	return !aBool1723;
    }
    
    boolean method2563() {
	if (aBool1721) {
	    if (aClass534_Sub18_Sub1_1727 != null) {
		aClass534_Sub18_Sub1_1727.method142();
		aClass534_Sub18_Sub1_1727 = null;
	    }
	    if (aClass141_Sub2_1726 != null) {
		aClass141_Sub2_1726.method2368();
		aClass141_Sub2_1726 = null;
	    }
	}
	if (aBool1720) {
	    if (aClass534_Sub18_Sub1_1722 != null) {
		aClass534_Sub18_Sub1_1722.method142();
		aClass534_Sub18_Sub1_1722 = null;
	    }
	    if (aClass141_Sub2Array1724[0] != null) {
		aClass141_Sub2Array1724[0].method2368();
		aClass141_Sub2Array1724[0] = null;
	    }
	    if (aClass141_Sub2Array1724[1] != null) {
		aClass141_Sub2Array1724[1].method2368();
		aClass141_Sub2Array1724[1] = null;
	    }
	}
	if (aBool1721) {
	    if (aClass175_Sub1_Sub2_1712 != null)
		aClass534_Sub18_Sub1_1727
		    = new Class534_Sub18_Sub1(aClass185_Sub3_1729,
					      Class181.aClass181_1956,
					      Class173.aClass173_1828,
					      anInt1716, anInt1718,
					      aClass185_Sub3_1729.anInt9668);
	    if (aBool1728)
		aClass141_Sub2_1726
		    = new Class141_Sub2(aClass185_Sub3_1729, 34037,
					Class181.aClass181_1956,
					Class173.aClass173_1828, anInt1716,
					anInt1718);
	    else if (aClass534_Sub18_Sub1_1727 == null)
		aClass534_Sub18_Sub1_1727
		    = new Class534_Sub18_Sub1(aClass185_Sub3_1729,
					      Class181.aClass181_1956,
					      Class173.aClass173_1828,
					      anInt1716, anInt1718);
	    aBool1721 = false;
	    aBool1725 = true;
	    aBool1723 = true;
	}
	if (aBool1720) {
	    if (aClass175_Sub1_Sub2_1712 != null)
		aClass534_Sub18_Sub1_1722
		    = new Class534_Sub18_Sub1(aClass185_Sub3_1729,
					      Class181.aClass181_1952,
					      aClass173_1730, anInt1716,
					      anInt1718,
					      aClass185_Sub3_1729.anInt9668);
	    aClass141_Sub2Array1724[0]
		= new Class141_Sub2(aClass185_Sub3_1729, 34037,
				    Class181.aClass181_1952, aClass173_1730,
				    anInt1716, anInt1718);
	    aClass141_Sub2Array1724[1]
		= anInt1715 > 1 ? new Class141_Sub2(aClass185_Sub3_1729, 34037,
						    Class181.aClass181_1952,
						    aClass173_1730, anInt1716,
						    anInt1718) : null;
	    aBool1720 = false;
	    aBool1725 = true;
	    aBool1723 = true;
	}
	if (aBool1725) {
	    if (aClass175_Sub1_Sub2_1712 != null) {
		aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1711,
					       -1531838308);
		aClass175_Sub1_Sub2_1711.method15074(null);
		aClass175_Sub1_Sub2_1711.method15075(0, null);
		aClass175_Sub1_Sub2_1711.method15075(1, null);
		aClass175_Sub1_Sub2_1711
		    .method15075(0, aClass141_Sub2Array1724[0].method14451(0));
		aClass175_Sub1_Sub2_1711.method15075(1,
						     (anInt1715 > 1
						      ? aClass141_Sub2Array1724
							    [1].method14451(0)
						      : null));
		if (aBool1728)
		    aClass175_Sub1_Sub2_1711
			.method15074(aClass141_Sub2_1726.method14447(0));
		aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1711,
					       -11578496);
		aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1712,
					       1319031662);
		aClass175_Sub1_Sub2_1712.method15074(null);
		aClass175_Sub1_Sub2_1712.method15075(0, null);
		aClass175_Sub1_Sub2_1712
		    .method15075(0, aClass534_Sub18_Sub1_1722);
		aClass175_Sub1_Sub2_1712
		    .method15074(aClass534_Sub18_Sub1_1727);
		aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1712,
					       -11578496);
	    } else {
		aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1711,
					       -1007583200);
		aClass175_Sub1_Sub2_1711.method15074(null);
		aClass175_Sub1_Sub2_1711.method15075(0, null);
		aClass175_Sub1_Sub2_1711.method15075(1, null);
		aClass175_Sub1_Sub2_1711
		    .method15075(0, aClass141_Sub2Array1724[0].method14451(0));
		aClass175_Sub1_Sub2_1711.method15075(1,
						     (anInt1715 > 1
						      ? aClass141_Sub2Array1724
							    [1].method14451(0)
						      : null));
		if (aBool1728)
		    aClass175_Sub1_Sub2_1711
			.method15074(aClass141_Sub2_1726.method14447(0));
		else
		    aClass175_Sub1_Sub2_1711
			.method15074(aClass534_Sub18_Sub1_1727);
		aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1711,
					       -11578496);
	    }
	    aBool1725 = false;
	    aBool1723 = true;
	}
	if (aBool1723) {
	    aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1713,
					   538009496);
	    aBool1723 = !aClass175_Sub1_Sub2_1713.method15076();
	    aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1713,
					   -11578496);
	}
	return !aBool1723;
    }
    
    boolean method2564() {
	return aBool1717;
    }
    
    boolean method2565() {
	if (aBool1721) {
	    if (aClass534_Sub18_Sub1_1727 != null) {
		aClass534_Sub18_Sub1_1727.method142();
		aClass534_Sub18_Sub1_1727 = null;
	    }
	    if (aClass141_Sub2_1726 != null) {
		aClass141_Sub2_1726.method2368();
		aClass141_Sub2_1726 = null;
	    }
	}
	if (aBool1720) {
	    if (aClass534_Sub18_Sub1_1722 != null) {
		aClass534_Sub18_Sub1_1722.method142();
		aClass534_Sub18_Sub1_1722 = null;
	    }
	    if (aClass141_Sub2Array1724[0] != null) {
		aClass141_Sub2Array1724[0].method2368();
		aClass141_Sub2Array1724[0] = null;
	    }
	    if (aClass141_Sub2Array1724[1] != null) {
		aClass141_Sub2Array1724[1].method2368();
		aClass141_Sub2Array1724[1] = null;
	    }
	}
	if (aBool1721) {
	    if (aClass175_Sub1_Sub2_1712 != null)
		aClass534_Sub18_Sub1_1727
		    = new Class534_Sub18_Sub1(aClass185_Sub3_1729,
					      Class181.aClass181_1956,
					      Class173.aClass173_1828,
					      anInt1716, anInt1718,
					      aClass185_Sub3_1729.anInt9668);
	    if (aBool1728)
		aClass141_Sub2_1726
		    = new Class141_Sub2(aClass185_Sub3_1729, 34037,
					Class181.aClass181_1956,
					Class173.aClass173_1828, anInt1716,
					anInt1718);
	    else if (aClass534_Sub18_Sub1_1727 == null)
		aClass534_Sub18_Sub1_1727
		    = new Class534_Sub18_Sub1(aClass185_Sub3_1729,
					      Class181.aClass181_1956,
					      Class173.aClass173_1828,
					      anInt1716, anInt1718);
	    aBool1721 = false;
	    aBool1725 = true;
	    aBool1723 = true;
	}
	if (aBool1720) {
	    if (aClass175_Sub1_Sub2_1712 != null)
		aClass534_Sub18_Sub1_1722
		    = new Class534_Sub18_Sub1(aClass185_Sub3_1729,
					      Class181.aClass181_1952,
					      aClass173_1730, anInt1716,
					      anInt1718,
					      aClass185_Sub3_1729.anInt9668);
	    aClass141_Sub2Array1724[0]
		= new Class141_Sub2(aClass185_Sub3_1729, 34037,
				    Class181.aClass181_1952, aClass173_1730,
				    anInt1716, anInt1718);
	    aClass141_Sub2Array1724[1]
		= anInt1715 > 1 ? new Class141_Sub2(aClass185_Sub3_1729, 34037,
						    Class181.aClass181_1952,
						    aClass173_1730, anInt1716,
						    anInt1718) : null;
	    aBool1720 = false;
	    aBool1725 = true;
	    aBool1723 = true;
	}
	if (aBool1725) {
	    if (aClass175_Sub1_Sub2_1712 != null) {
		aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1711,
					       229238913);
		aClass175_Sub1_Sub2_1711.method15074(null);
		aClass175_Sub1_Sub2_1711.method15075(0, null);
		aClass175_Sub1_Sub2_1711.method15075(1, null);
		aClass175_Sub1_Sub2_1711
		    .method15075(0, aClass141_Sub2Array1724[0].method14451(0));
		aClass175_Sub1_Sub2_1711.method15075(1,
						     (anInt1715 > 1
						      ? aClass141_Sub2Array1724
							    [1].method14451(0)
						      : null));
		if (aBool1728)
		    aClass175_Sub1_Sub2_1711
			.method15074(aClass141_Sub2_1726.method14447(0));
		aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1711,
					       -11578496);
		aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1712,
					       1320316718);
		aClass175_Sub1_Sub2_1712.method15074(null);
		aClass175_Sub1_Sub2_1712.method15075(0, null);
		aClass175_Sub1_Sub2_1712
		    .method15075(0, aClass534_Sub18_Sub1_1722);
		aClass175_Sub1_Sub2_1712
		    .method15074(aClass534_Sub18_Sub1_1727);
		aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1712,
					       -11578496);
	    } else {
		aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1711,
					       1411218640);
		aClass175_Sub1_Sub2_1711.method15074(null);
		aClass175_Sub1_Sub2_1711.method15075(0, null);
		aClass175_Sub1_Sub2_1711.method15075(1, null);
		aClass175_Sub1_Sub2_1711
		    .method15075(0, aClass141_Sub2Array1724[0].method14451(0));
		aClass175_Sub1_Sub2_1711.method15075(1,
						     (anInt1715 > 1
						      ? aClass141_Sub2Array1724
							    [1].method14451(0)
						      : null));
		if (aBool1728)
		    aClass175_Sub1_Sub2_1711
			.method15074(aClass141_Sub2_1726.method14447(0));
		else
		    aClass175_Sub1_Sub2_1711
			.method15074(aClass534_Sub18_Sub1_1727);
		aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1711,
					       -11578496);
	    }
	    aBool1725 = false;
	    aBool1723 = true;
	}
	if (aBool1723) {
	    aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1713,
					   363089390);
	    aBool1723 = !aClass175_Sub1_Sub2_1713.method15076();
	    aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1713,
					   -11578496);
	}
	return !aBool1723;
    }
    
    boolean method2566(int i, int i_15_, int i_16_, int i_17_) {
	if (aClass175_Sub1_Sub2_1713 == null
	    || aClass700_1719.method14142(338376876) || method2557())
	    return false;
	if (anInt1716 != i_16_ || anInt1718 != i_17_) {
	    anInt1716 = i_16_;
	    anInt1718 = i_17_;
	    for (Class534 class534 = aClass700_1719.method14135((byte) -1);
		 class534 != aClass700_1719.aClass534_8803;
		 class534 = class534.aClass534_7159)
		((Class534_Sub9) class534).method16072(anInt1716, anInt1718);
	    aBool1720 = true;
	    aBool1721 = true;
	    aBool1725 = true;
	}
	if (method2551()) {
	    anInt1714 = i;
	    anInt1710 = i_15_;
	    aBool1717 = true;
	    aClass185_Sub3_1729.method15196(-anInt1714,
					    (anInt1718 + anInt1710
					     - aClass185_Sub3_1729.method3253
						   (-1417572386)
						   .method2911()));
	    aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1713,
					   839749178);
	    aClass175_Sub1_Sub2_1713.method17914(0);
	    aClass185_Sub3_1729.method3340(3, 0);
	    return true;
	}
	return false;
    }
    
    boolean method2567(int i, int i_18_, int i_19_, int i_20_) {
	if (aClass175_Sub1_Sub2_1713 == null
	    || aClass700_1719.method14142(-9042486) || method2557())
	    return false;
	if (anInt1716 != i_19_ || anInt1718 != i_20_) {
	    anInt1716 = i_19_;
	    anInt1718 = i_20_;
	    for (Class534 class534 = aClass700_1719.method14135((byte) -1);
		 class534 != aClass700_1719.aClass534_8803;
		 class534 = class534.aClass534_7159)
		((Class534_Sub9) class534).method16072(anInt1716, anInt1718);
	    aBool1720 = true;
	    aBool1721 = true;
	    aBool1725 = true;
	}
	if (method2551()) {
	    anInt1714 = i;
	    anInt1710 = i_18_;
	    aBool1717 = true;
	    aClass185_Sub3_1729.method15196(-anInt1714,
					    (anInt1718 + anInt1710
					     - aClass185_Sub3_1729.method3253
						   (-750891092).method2911()));
	    aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1713, 88732778);
	    aClass175_Sub1_Sub2_1713.method17914(0);
	    aClass185_Sub3_1729.method3340(3, 0);
	    return true;
	}
	return false;
    }
    
    void method2568(Class534_Sub9 class534_sub9) {
	class534_sub9.aBool10426 = false;
	class534_sub9.method16104();
	class534_sub9.method8892((byte) 1);
	method2556();
    }
    
    boolean method2569(Class534_Sub9 class534_sub9) {
	if (aClass175_Sub1_Sub2_1713 != null) {
	    if (class534_sub9.method16070() || class534_sub9.method16069()) {
		aClass700_1719.method14131(class534_sub9, (short) 789);
		method2556();
		if (class534_sub9.method16077() >= 0 && method2551()) {
		    if (anInt1716 != -1 && anInt1718 != -1)
			class534_sub9.method16072(anInt1716, anInt1718);
		    class534_sub9.aBool10426 = true;
		    return true;
		}
	    }
	    method2555(class534_sub9);
	}
	return false;
    }
    
    boolean method2570() {
	if (aBool1721) {
	    if (aClass534_Sub18_Sub1_1727 != null) {
		aClass534_Sub18_Sub1_1727.method142();
		aClass534_Sub18_Sub1_1727 = null;
	    }
	    if (aClass141_Sub2_1726 != null) {
		aClass141_Sub2_1726.method2368();
		aClass141_Sub2_1726 = null;
	    }
	}
	if (aBool1720) {
	    if (aClass534_Sub18_Sub1_1722 != null) {
		aClass534_Sub18_Sub1_1722.method142();
		aClass534_Sub18_Sub1_1722 = null;
	    }
	    if (aClass141_Sub2Array1724[0] != null) {
		aClass141_Sub2Array1724[0].method2368();
		aClass141_Sub2Array1724[0] = null;
	    }
	    if (aClass141_Sub2Array1724[1] != null) {
		aClass141_Sub2Array1724[1].method2368();
		aClass141_Sub2Array1724[1] = null;
	    }
	}
	if (aBool1721) {
	    if (aClass175_Sub1_Sub2_1712 != null)
		aClass534_Sub18_Sub1_1727
		    = new Class534_Sub18_Sub1(aClass185_Sub3_1729,
					      Class181.aClass181_1956,
					      Class173.aClass173_1828,
					      anInt1716, anInt1718,
					      aClass185_Sub3_1729.anInt9668);
	    if (aBool1728)
		aClass141_Sub2_1726
		    = new Class141_Sub2(aClass185_Sub3_1729, 34037,
					Class181.aClass181_1956,
					Class173.aClass173_1828, anInt1716,
					anInt1718);
	    else if (aClass534_Sub18_Sub1_1727 == null)
		aClass534_Sub18_Sub1_1727
		    = new Class534_Sub18_Sub1(aClass185_Sub3_1729,
					      Class181.aClass181_1956,
					      Class173.aClass173_1828,
					      anInt1716, anInt1718);
	    aBool1721 = false;
	    aBool1725 = true;
	    aBool1723 = true;
	}
	if (aBool1720) {
	    if (aClass175_Sub1_Sub2_1712 != null)
		aClass534_Sub18_Sub1_1722
		    = new Class534_Sub18_Sub1(aClass185_Sub3_1729,
					      Class181.aClass181_1952,
					      aClass173_1730, anInt1716,
					      anInt1718,
					      aClass185_Sub3_1729.anInt9668);
	    aClass141_Sub2Array1724[0]
		= new Class141_Sub2(aClass185_Sub3_1729, 34037,
				    Class181.aClass181_1952, aClass173_1730,
				    anInt1716, anInt1718);
	    aClass141_Sub2Array1724[1]
		= anInt1715 > 1 ? new Class141_Sub2(aClass185_Sub3_1729, 34037,
						    Class181.aClass181_1952,
						    aClass173_1730, anInt1716,
						    anInt1718) : null;
	    aBool1720 = false;
	    aBool1725 = true;
	    aBool1723 = true;
	}
	if (aBool1725) {
	    if (aClass175_Sub1_Sub2_1712 != null) {
		aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1711,
					       -796984905);
		aClass175_Sub1_Sub2_1711.method15074(null);
		aClass175_Sub1_Sub2_1711.method15075(0, null);
		aClass175_Sub1_Sub2_1711.method15075(1, null);
		aClass175_Sub1_Sub2_1711
		    .method15075(0, aClass141_Sub2Array1724[0].method14451(0));
		aClass175_Sub1_Sub2_1711.method15075(1,
						     (anInt1715 > 1
						      ? aClass141_Sub2Array1724
							    [1].method14451(0)
						      : null));
		if (aBool1728)
		    aClass175_Sub1_Sub2_1711
			.method15074(aClass141_Sub2_1726.method14447(0));
		aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1711,
					       -11578496);
		aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1712,
					       554913942);
		aClass175_Sub1_Sub2_1712.method15074(null);
		aClass175_Sub1_Sub2_1712.method15075(0, null);
		aClass175_Sub1_Sub2_1712
		    .method15075(0, aClass534_Sub18_Sub1_1722);
		aClass175_Sub1_Sub2_1712
		    .method15074(aClass534_Sub18_Sub1_1727);
		aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1712,
					       -11578496);
	    } else {
		aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1711,
					       -550319267);
		aClass175_Sub1_Sub2_1711.method15074(null);
		aClass175_Sub1_Sub2_1711.method15075(0, null);
		aClass175_Sub1_Sub2_1711.method15075(1, null);
		aClass175_Sub1_Sub2_1711
		    .method15075(0, aClass141_Sub2Array1724[0].method14451(0));
		aClass175_Sub1_Sub2_1711.method15075(1,
						     (anInt1715 > 1
						      ? aClass141_Sub2Array1724
							    [1].method14451(0)
						      : null));
		if (aBool1728)
		    aClass175_Sub1_Sub2_1711
			.method15074(aClass141_Sub2_1726.method14447(0));
		else
		    aClass175_Sub1_Sub2_1711
			.method15074(aClass534_Sub18_Sub1_1727);
		aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1711,
					       -11578496);
	    }
	    aBool1725 = false;
	    aBool1723 = true;
	}
	if (aBool1723) {
	    aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1713,
					   2010367485);
	    aBool1723 = !aClass175_Sub1_Sub2_1713.method15076();
	    aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1713,
					   -11578496);
	}
	return !aBool1723;
    }
    
    void method2571(int i, int i_21_) {
	if (aBool1717) {
	    if (aClass175_Sub1_Sub2_1712 != null) {
		aClass185_Sub3_1729.method3261(aClass175_Sub1_Sub2_1712,
					       -11578496);
		aClass185_Sub3_1729.method3260(aClass175_Sub1_Sub2_1711,
					       -1106752150);
		aClass175_Sub1_Sub2_1711.method17914(0);
		aClass175_Sub1_Sub2_1712.method15077(0, 0, anInt1716,
						     anInt1718, 0, 0, true,
						     aBool1728);
	    }
	    aClass185_Sub3_1729.method15224();
	    aClass185_Sub3_1729.method15246(0);
	    aClass185_Sub3_1729.method15214(1);
	    aClass185_Sub3_1729.method3537();
	    int i_22_ = 0;
	    int i_23_ = 1;
	    int i_24_ = 0;
	    int i_25_ = 0;
	    int i_26_ = 0;
	    Object object = null;
	    for (Class534_Sub9 class534_sub9
		     = (Class534_Sub9) aClass700_1719.method14135((byte) -1);
		 class534_sub9 != null;
		 class534_sub9 = ((Class534_Sub9)
				  aClass700_1719.method14139(1867513606))) {
		if (!class534_sub9.method16081())
		    i_25_++;
	    }
	    Class534_Sub9[] class534_sub9s = new Class534_Sub9[i_25_];
	    i_25_ = 0;
	    for (Class534_Sub9 class534_sub9
		     = (Class534_Sub9) aClass700_1719.method14135((byte) -1);
		 class534_sub9 != null;
		 class534_sub9 = ((Class534_Sub9)
				  aClass700_1719.method14139(1936874061))) {
		if (!class534_sub9.method16081())
		    class534_sub9s[i_25_++] = class534_sub9;
	    }
	    while (i_24_ < i_25_) {
		for (int i_27_ = 0; i_27_ < i_25_; i_27_++) {
		    Class534_Sub9 class534_sub9 = class534_sub9s[i_27_];
		    if (class534_sub9.method16077() == i_26_) {
			int i_28_ = class534_sub9.method16076();
			for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
			    aClass185_Sub3_1729.method15196(0, 0);
			    class534_sub9.method16105(i_29_,
						      (aClass141_Sub2Array1724
						       [i_22_]),
						      aClass141_Sub2_1726,
						      i_21_, i);
			    if (i_29_ == i_28_ - 1 && i_24_ == i_25_ - 1) {
				aClass185_Sub3_1729.method3261
				    (aClass175_Sub1_Sub2_1711, -11578496);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F,
						    (float) (0 + anInt1718));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
				OpenGL.glVertex2i(anInt1714, anInt1710);
				OpenGL.glTexCoord2f(0.0F, (float) (anInt1718
								   - i_21_));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glVertex2i(anInt1714,
						  anInt1710 + i_21_);
				OpenGL.glTexCoord2f((float) (0 + i),
						    (float) (anInt1718
							     - i_21_));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
				OpenGL.glVertex2i(anInt1714 + i,
						  anInt1710 + i_21_);
				OpenGL.glTexCoord2f((float) (0 + i),
						    (float) (0 + anInt1718));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
				OpenGL.glVertex2i(anInt1714 + i, anInt1710);
				OpenGL.glEnd();
			    } else {
				aClass175_Sub1_Sub2_1711.method17914(i_23_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, (float) anInt1718);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
				OpenGL.glVertex2i(0, 0);
				OpenGL.glTexCoord2f(0.0F, (float) (anInt1718
								   - i_21_));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glVertex2i(0, i_21_);
				OpenGL.glTexCoord2f((float) i,
						    (float) (anInt1718
							     - i_21_));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
				OpenGL.glVertex2i(i, i_21_);
				OpenGL.glTexCoord2f((float) i,
						    (float) anInt1718);
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
				OpenGL.glVertex2i(i, 0);
				OpenGL.glEnd();
			    }
			    class534_sub9.method16073(i_29_);
			    i_23_ = i_23_ + 1 & 0x1;
			    i_22_ = i_22_ + 1 & 0x1;
			}
			i_24_++;
		    }
		}
		i_26_++;
	    }
	    aBool1717 = false;
	    object = null;
	}
    }
    
    void method2572(Class534_Sub9 class534_sub9) {
	class534_sub9.aBool10426 = false;
	class534_sub9.method16104();
	class534_sub9.method8892((byte) 1);
	method2556();
    }
    
    Class153(Class185_Sub3 class185_sub3) {
	anInt1710 = 0;
	anInt1716 = 1;
	anInt1718 = 1;
	aClass700_1719 = new Class700();
	aBool1720 = true;
	aBool1721 = true;
	aBool1725 = true;
	aBool1723 = true;
	aClass141_Sub2Array1724 = new Class141_Sub2[2];
	aBool1728 = false;
	anInt1715 = 0;
	aClass173_1730 = Class173.aClass173_1830;
	aClass185_Sub3_1729 = class185_sub3;
	if (aClass185_Sub3_1729.aBool9685 && aClass185_Sub3_1729.aBool9624) {
	    aClass175_Sub1_Sub2_1713 = aClass175_Sub1_Sub2_1711
		= new Class175_Sub1_Sub2(aClass185_Sub3_1729);
	    if (aClass185_Sub3_1729.anInt9668 > 1
		&& aClass185_Sub3_1729.aBool9603
		&& aClass185_Sub3_1729.aBool9572)
		aClass175_Sub1_Sub2_1713 = aClass175_Sub1_Sub2_1712
		    = new Class175_Sub1_Sub2(aClass185_Sub3_1729);
	}
    }
}
