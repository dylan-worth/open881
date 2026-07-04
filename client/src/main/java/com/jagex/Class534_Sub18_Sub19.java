/* Class534_Sub18_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class534_Sub18_Sub19 extends Class534_Sub18
{
    public int[] anIntArray11890;
    public String aString11891;
    public char[] aCharArray11892;
    public int[] anIntArray11893;
    public char[] aCharArray11894;
    
    void method18467(Class534_Sub40 class534_sub40, int i) {
	do {
	    if (1 == i)
		aString11891 = class534_sub40.method16541((byte) -12);
	    else if (i == 2) {
		int i_0_ = class534_sub40.method16527(-1990803500);
		anIntArray11890 = new int[i_0_];
		aCharArray11892 = new char[i_0_];
		for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
		    anIntArray11890[i_1_]
			= class534_sub40.method16529((byte) 1);
		    byte i_2_ = class534_sub40.method16586((byte) 1);
		    aCharArray11892[i_1_]
			= (0 == i_2_ ? '\0'
			   : Class502_Sub2.method15983(i_2_, 2040160497));
		}
	    } else if (i == 3) {
		int i_3_ = class534_sub40.method16527(1320173250);
		anIntArray11893 = new int[i_3_];
		aCharArray11894 = new char[i_3_];
		for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
		    anIntArray11893[i_4_]
			= class534_sub40.method16529((byte) 1);
		    byte i_5_ = class534_sub40.method16586((byte) 1);
		    aCharArray11894[i_4_]
			= (0 == i_5_ ? '\0'
			   : Class502_Sub2.method15983(i_5_, 1967799411));
		}
	    } else if (i == 4)
		break;
	} while (false);
    }
    
    void method18468(Class534_Sub40 class534_sub40, byte i) {
	for (;;) {
	    int i_6_ = class534_sub40.method16527(-1356151282);
	    if (0 == i_6_)
		break;
	    method18469(class534_sub40, i_6_, (byte) -23);
	}
    }
    
    void method18469(Class534_Sub40 class534_sub40, int i, byte i_7_) {
	do {
	    if (1 == i)
		aString11891 = class534_sub40.method16541((byte) -72);
	    else if (i == 2) {
		int i_8_ = class534_sub40.method16527(-1808008451);
		anIntArray11890 = new int[i_8_];
		aCharArray11892 = new char[i_8_];
		for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
		    anIntArray11890[i_9_]
			= class534_sub40.method16529((byte) 1);
		    byte i_10_ = class534_sub40.method16586((byte) 1);
		    aCharArray11892[i_9_]
			= (0 == i_10_ ? '\0'
			   : Class502_Sub2.method15983(i_10_, 2141359487));
		}
	    } else if (i == 3) {
		int i_11_ = class534_sub40.method16527(-1390741784);
		anIntArray11893 = new int[i_11_];
		aCharArray11894 = new char[i_11_];
		for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
		    anIntArray11893[i_12_]
			= class534_sub40.method16529((byte) 1);
		    byte i_13_ = class534_sub40.method16586((byte) 1);
		    aCharArray11894[i_12_]
			= (0 == i_13_ ? '\0'
			   : Class502_Sub2.method15983(i_13_, 2080280766));
		}
	    } else if (i == 4)
		break;
	} while (false);
    }
    
    public int method18470(char c, short i) {
	if (null == anIntArray11890)
	    return -1;
	for (int i_14_ = 0; i_14_ < anIntArray11890.length; i_14_++) {
	    if (aCharArray11892[i_14_] == c)
		return anIntArray11890[i_14_];
	}
	return -1;
    }
    
    public int method18471(char c, int i) {
	if (anIntArray11893 == null)
	    return -1;
	for (int i_15_ = 0; i_15_ < anIntArray11893.length; i_15_++) {
	    if (aCharArray11894[i_15_] == c)
		return anIntArray11893[i_15_];
	}
	return -1;
    }
    
    void method18472(byte i) {
	if (anIntArray11893 != null) {
	    for (int i_16_ = 0; i_16_ < anIntArray11893.length; i_16_++)
		anIntArray11893[i_16_] |= 0x8000;
	}
	if (null != anIntArray11890) {
	    for (int i_17_ = 0; i_17_ < anIntArray11890.length; i_17_++)
		anIntArray11890[i_17_] |= 0x8000;
	}
    }
    
    public int method18473(char c) {
	if (null == anIntArray11890)
	    return -1;
	for (int i = 0; i < anIntArray11890.length; i++) {
	    if (aCharArray11892[i] == c)
		return anIntArray11890[i];
	}
	return -1;
    }
    
    void method18474() {
	if (anIntArray11893 != null) {
	    for (int i = 0; i < anIntArray11893.length; i++)
		anIntArray11893[i] |= 0x8000;
	}
	if (null != anIntArray11890) {
	    for (int i = 0; i < anIntArray11890.length; i++)
		anIntArray11890[i] |= 0x8000;
	}
    }
    
    void method18475(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(-1305009471);
	    if (0 == i)
		break;
	    method18469(class534_sub40, i, (byte) -33);
	}
    }
    
    public int method18476(char c) {
	if (null == anIntArray11890)
	    return -1;
	for (int i = 0; i < anIntArray11890.length; i++) {
	    if (aCharArray11892[i] == c)
		return anIntArray11890[i];
	}
	return -1;
    }
    
    public int method18477(char c) {
	if (null == anIntArray11890)
	    return -1;
	for (int i = 0; i < anIntArray11890.length; i++) {
	    if (aCharArray11892[i] == c)
		return anIntArray11890[i];
	}
	return -1;
    }
    
    public int method18478(char c) {
	if (anIntArray11893 == null)
	    return -1;
	for (int i = 0; i < anIntArray11893.length; i++) {
	    if (aCharArray11894[i] == c)
		return anIntArray11893[i];
	}
	return -1;
    }
    
    public int method18479(char c) {
	if (anIntArray11893 == null)
	    return -1;
	for (int i = 0; i < anIntArray11893.length; i++) {
	    if (aCharArray11894[i] == c)
		return anIntArray11893[i];
	}
	return -1;
    }
    
    void method18480() {
	if (anIntArray11893 != null) {
	    for (int i = 0; i < anIntArray11893.length; i++)
		anIntArray11893[i] |= 0x8000;
	}
	if (null != anIntArray11890) {
	    for (int i = 0; i < anIntArray11890.length; i++)
		anIntArray11890[i] |= 0x8000;
	}
    }
    
    void method18481() {
	if (anIntArray11893 != null) {
	    for (int i = 0; i < anIntArray11893.length; i++)
		anIntArray11893[i] |= 0x8000;
	}
	if (null != anIntArray11890) {
	    for (int i = 0; i < anIntArray11890.length; i++)
		anIntArray11890[i] |= 0x8000;
	}
    }
    
    Class534_Sub18_Sub19() {
	/* empty */
    }
}
