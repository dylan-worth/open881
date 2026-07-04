/* Class693 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class693
{
    Class534_Sub18_Sub17 aClass534_Sub18_Sub17_8764;
    int anInt8765;
    int anInt8766;
    Class534_Sub18_Sub17 aClass534_Sub18_Sub17_8767;
    boolean aBool8768 = false;
    int anInt8769;
    public static Class472 aClass472_8770;
    
    final boolean method14047(Class44_Sub1 class44_sub1, Class205 class205,
			      int i, int i_0_, int[] is, int i_1_) {
	if (!aBool8768) {
	    if (i >= is.length)
		return false;
	    anInt8769 = -571486521 * is[i];
	    aClass534_Sub18_Sub17_8767
		= class44_sub1.method17241(1321112311 * anInt8769 >> 16,
					   -1433390337);
	    anInt8769 = -571486521 * (1321112311 * anInt8769 & 0xffff);
	    if (null != aClass534_Sub18_Sub17_8767) {
		if (class205.aBool2225 && i_0_ != -1 && i_0_ < is.length) {
		    anInt8766 = 754364263 * is[i_0_];
		    aClass534_Sub18_Sub17_8764
			= class44_sub1.method17241((anInt8766 * 1289223255
						    >> 16),
						   -1433390337);
		    anInt8766 = 754364263 * (1289223255 * anInt8766 & 0xffff);
		}
		if (class205.aBool2214)
		    anInt8765 = (anInt8765 * 1996767869 | 0x200) * -56047915;
		if (aClass534_Sub18_Sub17_8767
			.method18438(1321112311 * anInt8769, (byte) 83))
		    anInt8765 = (1996767869 * anInt8765 | 0x80) * -56047915;
		if (aClass534_Sub18_Sub17_8767
			.method18437(1321112311 * anInt8769, 1144198987))
		    anInt8765 = (anInt8765 * 1996767869 | 0x100) * -56047915;
		if (aClass534_Sub18_Sub17_8767
			.method18439(1321112311 * anInt8769, -731173137))
		    anInt8765 = -56047915 * (anInt8765 * 1996767869 | 0x400);
		if (aClass534_Sub18_Sub17_8764 != null) {
		    if (aClass534_Sub18_Sub17_8764
			    .method18438(anInt8766 * 1289223255, (byte) -73))
			anInt8765
			    = -56047915 * (anInt8765 * 1996767869 | 0x80);
		    if (aClass534_Sub18_Sub17_8764
			    .method18437(anInt8766 * 1289223255, -1329167011))
			anInt8765
			    = (anInt8765 * 1996767869 | 0x100) * -56047915;
		    if (aClass534_Sub18_Sub17_8764
			    .method18439(anInt8766 * 1289223255, 29440295))
			anInt8765
			    = (anInt8765 * 1996767869 | 0x400) * -56047915;
		}
		anInt8765 = -56047915 * (anInt8765 * 1996767869 | 0x20);
		aBool8768 = true;
		return true;
	    }
	    return false;
	}
	return true;
    }
    
    final void method14048() {
	aBool8768 = false;
	anInt8765 = 0;
	aClass534_Sub18_Sub17_8764 = null;
	aClass534_Sub18_Sub17_8767 = null;
    }
    
    final void method14049(byte i) {
	aBool8768 = false;
	anInt8765 = 0;
	aClass534_Sub18_Sub17_8764 = null;
	aClass534_Sub18_Sub17_8767 = null;
    }
    
    Class693() {
	/* empty */
    }
    
    final void method14050() {
	aBool8768 = false;
	anInt8765 = 0;
	aClass534_Sub18_Sub17_8764 = null;
	aClass534_Sub18_Sub17_8767 = null;
    }
    
    final void method14051() {
	aBool8768 = false;
	anInt8765 = 0;
	aClass534_Sub18_Sub17_8764 = null;
	aClass534_Sub18_Sub17_8767 = null;
    }
    
    final void method14052() {
	aBool8768 = false;
	anInt8765 = 0;
	aClass534_Sub18_Sub17_8764 = null;
	aClass534_Sub18_Sub17_8767 = null;
    }
    
    final boolean method14053(Class44_Sub1 class44_sub1, Class205 class205,
			      int i, int i_2_, int[] is) {
	if (!aBool8768) {
	    if (i >= is.length)
		return false;
	    anInt8769 = -571486521 * is[i];
	    aClass534_Sub18_Sub17_8767
		= class44_sub1.method17241(1321112311 * anInt8769 >> 16,
					   -1433390337);
	    anInt8769 = -571486521 * (1321112311 * anInt8769 & 0xffff);
	    if (null != aClass534_Sub18_Sub17_8767) {
		if (class205.aBool2225 && i_2_ != -1 && i_2_ < is.length) {
		    anInt8766 = 754364263 * is[i_2_];
		    aClass534_Sub18_Sub17_8764
			= class44_sub1.method17241((anInt8766 * 1289223255
						    >> 16),
						   -1433390337);
		    anInt8766 = 754364263 * (1289223255 * anInt8766 & 0xffff);
		}
		if (class205.aBool2214)
		    anInt8765 = (anInt8765 * 1996767869 | 0x200) * -56047915;
		if (aClass534_Sub18_Sub17_8767
			.method18438(1321112311 * anInt8769, (byte) 76))
		    anInt8765 = (1996767869 * anInt8765 | 0x80) * -56047915;
		if (aClass534_Sub18_Sub17_8767
			.method18437(1321112311 * anInt8769, 943831030))
		    anInt8765 = (anInt8765 * 1996767869 | 0x100) * -56047915;
		if (aClass534_Sub18_Sub17_8767
			.method18439(1321112311 * anInt8769, -294720589))
		    anInt8765 = -56047915 * (anInt8765 * 1996767869 | 0x400);
		if (aClass534_Sub18_Sub17_8764 != null) {
		    if (aClass534_Sub18_Sub17_8764
			    .method18438(anInt8766 * 1289223255, (byte) -32))
			anInt8765
			    = -56047915 * (anInt8765 * 1996767869 | 0x80);
		    if (aClass534_Sub18_Sub17_8764
			    .method18437(anInt8766 * 1289223255, 1067439437))
			anInt8765
			    = (anInt8765 * 1996767869 | 0x100) * -56047915;
		    if (aClass534_Sub18_Sub17_8764
			    .method18439(anInt8766 * 1289223255, -2038930465))
			anInt8765
			    = (anInt8765 * 1996767869 | 0x400) * -56047915;
		}
		anInt8765 = -56047915 * (anInt8765 * 1996767869 | 0x20);
		aBool8768 = true;
		return true;
	    }
	    return false;
	}
	return true;
    }
    
    static final void method14054(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class324_Sub2.method15701(1141883541);
    }
}
