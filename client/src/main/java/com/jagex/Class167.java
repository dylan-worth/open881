/* Class167 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class167
{
    static short[] aShortArray1768;
    static short[] aShortArray1769;
    static final int anInt1770 = 2;
    static short[] aShortArray1771;
    int anInt1772;
    static byte[] aByteArray1773;
    Class534_Sub24 aClass534_Sub24_1774 = null;
    boolean aBool1775;
    short[] aShortArray1776;
    short[] aShortArray1777;
    short[] aShortArray1778;
    short[] aShortArray1779;
    short[] aShortArray1780;
    static short[] aShortArray1781 = new short[500];
    boolean aBool1782;
    boolean aBool1783;
    static short[] aShortArray1784;
    static final int anInt1785 = 1;
    static final int anInt1786 = 2;
    byte[] aByteArray1787;
    
    Class167(byte[] is, Class534_Sub24 class534_sub24) {
	anInt1772 = 0;
	aBool1782 = false;
	aBool1783 = false;
	aBool1775 = false;
	aClass534_Sub24_1774 = class534_sub24;
	try {
	    Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	    Class534_Sub40 class534_sub40_0_ = new Class534_Sub40(is);
	    int i = class534_sub40.method16527(-693996785);
	    class534_sub40.anInt10811 += 1520029430;
	    int i_1_ = class534_sub40.method16529((byte) 1);
	    int i_2_ = 0;
	    int i_3_ = -1;
	    int i_4_ = -1;
	    class534_sub40_0_.anInt10811
		= (class534_sub40.anInt10811 * 31645619 + i_1_) * -1387468933;
	    for (int i_5_ = 0; i_5_ < i_1_; i_5_++) {
		int i_6_ = aClass534_Sub24_1774.anIntArray10561[i_5_];
		if (i_6_ == 0)
		    i_3_ = i_5_;
		int i_7_ = class534_sub40.method16527(-1484133692);
		if (i_7_ > 0) {
		    if (i_6_ == 0)
			i_4_ = i_5_;
		    aShortArray1781[i_2_] = (short) i_5_;
		    short i_8_ = 0;
		    if (i_6_ == 3 || i_6_ == 10)
			i_8_ = (short) 128;
		    if (i >= 2 && i_6_ == 7) {
			if ((i_7_ & 0x1) != 0) {
			    aShortArray1769[i_2_]
				= (short) class534_sub40_0_
					      .method16545((byte) -108);
			    class534_sub40_0_.method16545((byte) -54);
			} else
			    aShortArray1769[i_2_] = i_8_;
			if ((i_7_ & 0x2) != 0) {
			    aShortArray1768[i_2_]
				= (short) class534_sub40_0_
					      .method16545((byte) -37);
			    class534_sub40_0_.method16545((byte) -30);
			} else
			    aShortArray1768[i_2_] = i_8_;
			if ((i_7_ & 0x4) != 0) {
			    aShortArray1771[i_2_]
				= (short) class534_sub40_0_
					      .method16545((byte) -96);
			    class534_sub40_0_.method16545((byte) -18);
			} else
			    aShortArray1771[i_2_] = i_8_;
		    } else {
			if ((i_7_ & 0x1) != 0)
			    aShortArray1769[i_2_]
				= (short) class534_sub40_0_
					      .method16545((byte) -19);
			else
			    aShortArray1769[i_2_] = i_8_;
			if ((i_7_ & 0x2) != 0)
			    aShortArray1768[i_2_]
				= (short) class534_sub40_0_
					      .method16545((byte) -35);
			else
			    aShortArray1768[i_2_] = i_8_;
			if ((i_7_ & 0x4) != 0)
			    aShortArray1771[i_2_]
				= (short) class534_sub40_0_
					      .method16545((byte) -57);
			else
			    aShortArray1771[i_2_] = i_8_;
		    }
		    aByteArray1773[i_2_] = (byte) (i_7_ >>> 3 & 0x3);
		    if (i_6_ == 2 || i_6_ == 9) {
			aShortArray1769[i_2_]
			    = (short) (aShortArray1769[i_2_] << 2 & 0x3fff);
			aShortArray1768[i_2_]
			    = (short) (aShortArray1768[i_2_] << 2 & 0x3fff);
			aShortArray1771[i_2_]
			    = (short) (aShortArray1771[i_2_] << 2 & 0x3fff);
		    }
		    aShortArray1784[i_2_] = (short) -1;
		    if (i_6_ == 1 || i_6_ == 2 || i_6_ == 3) {
			if (i_3_ > i_4_) {
			    aShortArray1784[i_2_] = (short) i_3_;
			    i_4_ = i_3_;
			}
		    } else if (i_6_ == 5)
			aBool1782 = true;
		    else if (i_6_ == 7)
			aBool1783 = true;
		    else if (i_6_ == 9 || i_6_ == 10 || i_6_ == 8)
			aBool1775 = true;
		    i_2_++;
		}
	    }
	    if (class534_sub40_0_.anInt10811 * 31645619 != is.length)
		throw new RuntimeException();
	    anInt1772 = i_2_;
	    aShortArray1776 = new short[i_2_];
	    aShortArray1777 = new short[i_2_];
	    aShortArray1778 = new short[i_2_];
	    aShortArray1779 = new short[i_2_];
	    aShortArray1780 = new short[i_2_];
	    aByteArray1787 = new byte[i_2_];
	    for (int i_9_ = 0; i_9_ < i_2_; i_9_++) {
		aShortArray1776[i_9_] = aShortArray1781[i_9_];
		aShortArray1777[i_9_] = aShortArray1769[i_9_];
		aShortArray1778[i_9_] = aShortArray1768[i_9_];
		aShortArray1779[i_9_] = aShortArray1771[i_9_];
		aShortArray1780[i_9_] = aShortArray1784[i_9_];
		aByteArray1787[i_9_] = aByteArray1773[i_9_];
	    }
	} catch (Exception exception) {
	    anInt1772 = 0;
	    aBool1782 = false;
	    aBool1783 = false;
	}
    }
    
    static {
	aShortArray1769 = new short[500];
	aShortArray1768 = new short[500];
	aShortArray1771 = new short[500];
	aShortArray1784 = new short[500];
	aByteArray1773 = new byte[500];
    }
}
