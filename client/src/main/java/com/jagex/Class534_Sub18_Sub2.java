/* Class534_Sub18_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class534_Sub18_Sub2 extends Class534_Sub18
    implements Interface13, Interface7
{
    public int[] anIntArray11368;
    public int anInt11369 = 0;
    public int[] anIntArray11370;
    public int anInt11371 = 0;
    
    public void method79(Class534_Sub40 class534_sub40, byte i) {
	for (;;) {
	    int i_0_ = class534_sub40.method16527(1729959038);
	    if (i_0_ == 0)
		break;
	    method17843(class534_sub40, i_0_, (short) 5000);
	}
    }
    
    void method17843(Class534_Sub40 class534_sub40, int i, short i_1_) {
	if (i == 2)
	    anInt11371 = class534_sub40.method16529((byte) 1) * 742803125;
	else if (i == 4) {
	    anInt11369 = class534_sub40.method16527(632869052) * 1380573889;
	    anIntArray11370 = new int[anInt11369 * 440511809];
	    anIntArray11368 = new int[anInt11369 * 440511809];
	    for (int i_2_ = 0; i_2_ < anInt11369 * 440511809; i_2_++) {
		anIntArray11370[i_2_] = class534_sub40.method16529((byte) 1);
		anIntArray11368[i_2_] = class534_sub40.method16529((byte) 1);
	    }
	}
    }
    
    public void method65(int i) {
	/* empty */
    }
    
    public void method66(int i) {
	/* empty */
    }
    
    public void method67(int i, int i_3_) {
	/* empty */
    }
    
    public void method80(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(215565782);
	    if (i == 0)
		break;
	    method17843(class534_sub40, i, (short) 5000);
	}
    }
    
    public void method78(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(1899879800);
	    if (i == 0)
		break;
	    method17843(class534_sub40, i, (short) 5000);
	}
    }
    
    public void method81(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(-67346073);
	    if (i == 0)
		break;
	    method17843(class534_sub40, i, (short) 5000);
	}
    }
    
    public void method83() {
	/* empty */
    }
    
    public void method84() {
	/* empty */
    }
    
    public void method82(int i) {
	/* empty */
    }
    
    Class534_Sub18_Sub2() {
	/* empty */
    }
    
    void method17844(Class534_Sub40 class534_sub40, int i) {
	if (i == 2)
	    anInt11371 = class534_sub40.method16529((byte) 1) * 742803125;
	else if (i == 4) {
	    anInt11369 = class534_sub40.method16527(-680063661) * 1380573889;
	    anIntArray11370 = new int[anInt11369 * 440511809];
	    anIntArray11368 = new int[anInt11369 * 440511809];
	    for (int i_4_ = 0; i_4_ < anInt11369 * 440511809; i_4_++) {
		anIntArray11370[i_4_] = class534_sub40.method16529((byte) 1);
		anIntArray11368[i_4_] = class534_sub40.method16529((byte) 1);
	    }
	}
    }
    
    void method17845(Class534_Sub40 class534_sub40, int i) {
	if (i == 2)
	    anInt11371 = class534_sub40.method16529((byte) 1) * 742803125;
	else if (i == 4) {
	    anInt11369 = class534_sub40.method16527(86770270) * 1380573889;
	    anIntArray11370 = new int[anInt11369 * 440511809];
	    anIntArray11368 = new int[anInt11369 * 440511809];
	    for (int i_5_ = 0; i_5_ < anInt11369 * 440511809; i_5_++) {
		anIntArray11370[i_5_] = class534_sub40.method16529((byte) 1);
		anIntArray11368[i_5_] = class534_sub40.method16529((byte) 1);
	    }
	}
    }
    
    void method17846(Class534_Sub40 class534_sub40, int i) {
	if (i == 2)
	    anInt11371 = class534_sub40.method16529((byte) 1) * 742803125;
	else if (i == 4) {
	    anInt11369 = class534_sub40.method16527(637457773) * 1380573889;
	    anIntArray11370 = new int[anInt11369 * 440511809];
	    anIntArray11368 = new int[anInt11369 * 440511809];
	    for (int i_6_ = 0; i_6_ < anInt11369 * 440511809; i_6_++) {
		anIntArray11370[i_6_] = class534_sub40.method16529((byte) 1);
		anIntArray11368[i_6_] = class534_sub40.method16529((byte) 1);
	    }
	}
    }
    
    static final void method17847(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class669.aClass654_Sub1_Sub4_Sub1_8609.method16897(-1527522767);
    }
    
    static boolean method17848(int i, int i_7_) {
	return i == 8 || i == 11 || 4 == i;
    }
    
    static final void method17849(int i, int i_8_, int i_9_, int i_10_) {
	String string = new StringBuilder().append("tele ").append(i).append
			    (Class29.aString260).append
			    (i_8_ >> 6).append
			    (Class29.aString260).append
			    (i_9_ >> 6).append
			    (Class29.aString260).append
			    (i_8_ & 0x3f).append
			    (Class29.aString260).append
			    (i_9_ & 0x3f).toString();
	System.out.println(string);
	Class504.method8327(string, true, false, 1897632545);
    }
    
    static final void method17850(Class669 class669, byte i) {
	int i_11_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_11_, 314148927);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_11_ >> 16];
	Class323_Sub2.method15693(class247, class243, class669, 16711935);
    }
}
