/* Class534_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class534_Sub36 extends Class534 implements Interface8
{
    static Class534_Sub36[] aClass534_Sub36Array10794 = new Class534_Sub36[0];
    static int anInt10795;
    public int anInt10796;
    public int anInt10797;
    public int anInt10798;
    public int anInt10799;
    public static boolean aBool10800;
    
    Class534_Sub36(Class534_Sub36 class534_sub36_0_) {
	anInt10796 = class534_sub36_0_.anInt10796 * 1;
	anInt10797 = class534_sub36_0_.anInt10797 * 1;
	anInt10798 = 1 * class534_sub36_0_.anInt10798;
	anInt10799 = class534_sub36_0_.anInt10799 * 1;
    }
    
    public Class534_Sub36(int i, int i_1_, int i_2_, int i_3_) {
	anInt10796 = i * 1166548959;
	anInt10797 = -1224142395 * i_1_;
	anInt10798 = -1544617399 * i_2_;
	anInt10799 = 646265707 * i_3_;
    }
    
    void method16463(Class534_Sub40 class534_sub40) {
	class534_sub40.method16506(955276319 * anInt10796, 934096174);
	class534_sub40.method16510(anInt10797 * 599803149, -1338186330);
	class534_sub40.method16510(-1203728391 * anInt10798, -316792055);
	class534_sub40.method16510(anInt10799 * 33298755, -40740934);
    }
    
    public Class534_Sub36(Class534_Sub40 class534_sub40) {
	method72(class534_sub40, -2071743079);
    }
    
    void method16464(int i, int i_4_, int i_5_, int i_6_) {
	anInt10796 = 1166548959 * i;
	anInt10797 = -1224142395 * i_4_;
	anInt10798 = i_5_ * -1544617399;
	anInt10799 = 646265707 * i_6_;
    }
    
    void method16465(int i, int i_7_, int i_8_, int i_9_, byte i_10_) {
	anInt10796 = 1166548959 * i;
	anInt10797 = -1224142395 * i_7_;
	anInt10798 = i_8_ * -1544617399;
	anInt10799 = 646265707 * i_9_;
    }
    
    void method16466(Class534_Sub36 class534_sub36_11_, byte i) {
	anInt10796 = class534_sub36_11_.anInt10796 * 1;
	anInt10797 = class534_sub36_11_.anInt10797 * 1;
	anInt10798 = class534_sub36_11_.anInt10798 * 1;
	anInt10799 = class534_sub36_11_.anInt10799 * 1;
    }
    
    void method16467(int i, boolean bool, short i_12_) {
	if (-1 == i)
	    anInt10796 = -1166548959;
	else {
	    anInt10796 = (i >> 28 & 0x3) * 1166548959;
	    anInt10797 = -1224142395 * ((i >> 14 & 0x3fff) << 9);
	    anInt10798 = 0;
	    anInt10799 = 646265707 * ((i & 0x3fff) << 9);
	    if (bool) {
		anInt10797 += 152159488;
		anInt10799 += -2059703552;
	    }
	}
    }
    
    public int method53() {
	return Class521.method8692(-1018868631);
    }
    
    public static Class534_Sub36 method16468(Class534_Sub36 class534_sub36) {
	synchronized (aClass534_Sub36Array10794) {
	    if (0 == anInt10795 * 2450901) {
		Class534_Sub36 class534_sub36_13_
		    = new Class534_Sub36(class534_sub36);
		return class534_sub36_13_;
	    }
	    aClass534_Sub36Array10794[(anInt10795 -= 1809361789) * 2450901]
		.method16466(class534_sub36, (byte) 1);
	    Class534_Sub36 class534_sub36_14_
		= aClass534_Sub36Array10794[anInt10795 * 2450901];
	    return class534_sub36_14_;
	}
    }
    
    public String toString() {
	return new StringBuilder().append("Level: ").append
		   (955276319 * anInt10796).append
		   (" Coord: ").append
		   (anInt10797 * 599803149).append
		   (",").append
		   (-1203728391 * anInt10798).append
		   (",").append
		   (anInt10799 * 33298755).append
		   (" Coord Split: ").append
		   (599803149 * anInt10797 >> 15).append
		   (",").append
		   (33298755 * anInt10799 >> 15).append
		   (",").append
		   (anInt10797 * 599803149 >> 9 & 0x3f).append
		   (",").append
		   (33298755 * anInt10799 >> 9 & 0x3f).append
		   (",").append
		   (599803149 * anInt10797 & 0x1ff).append
		   (",").append
		   (anInt10799 * 33298755 & 0x1ff).toString();
    }
    
    public int method56(int i) {
	return Class521.method8692(-2051490386);
    }
    
    public void method69(Class534_Sub40 class534_sub40, int i) {
	method16487(class534_sub40, -2060867635);
    }
    
    public void method72(Class534_Sub40 class534_sub40, int i) {
	anInt10796 = class534_sub40.method16527(-1888308069) * 1166548959;
	anInt10797 = class534_sub40.method16533(-258848859) * -1224142395;
	anInt10798 = class534_sub40.method16533(-258848859) * -1544617399;
	anInt10799 = class534_sub40.method16533(-258848859) * 646265707;
    }
    
    public Class438 method16469() {
	return new Class438((float) (anInt10797 * 599803149),
			    (float) (anInt10798 * -1203728391),
			    (float) (33298755 * anInt10799));
    }
    
    public String method16470() {
	return new StringBuilder().append("Level: ").append
		   (955276319 * anInt10796).append
		   (" Coord: ").append
		   (anInt10797 * 599803149).append
		   (",").append
		   (-1203728391 * anInt10798).append
		   (",").append
		   (anInt10799 * 33298755).append
		   (" Coord Split: ").append
		   (599803149 * anInt10797 >> 15).append
		   (",").append
		   (33298755 * anInt10799 >> 15).append
		   (",").append
		   (anInt10797 * 599803149 >> 9 & 0x3f).append
		   (",").append
		   (33298755 * anInt10799 >> 9 & 0x3f).append
		   (",").append
		   (599803149 * anInt10797 & 0x1ff).append
		   (",").append
		   (anInt10799 * 33298755 & 0x1ff).toString();
    }
    
    public static Class534_Sub36 method16471(int i, int i_15_, int i_16_,
					     int i_17_) {
	synchronized (aClass534_Sub36Array10794) {
	    if (0 == 2450901 * anInt10795) {
		Class534_Sub36 class534_sub36
		    = new Class534_Sub36(i, i_15_, i_16_, i_17_);
		return class534_sub36;
	    }
	    aClass534_Sub36Array10794[(anInt10795 -= 1809361789) * 2450901]
		.method16465(i, i_15_, i_16_, i_17_, (byte) 54);
	    Class534_Sub36 class534_sub36
		= aClass534_Sub36Array10794[2450901 * anInt10795];
	    return class534_sub36;
	}
    }
    
    public static Class534_Sub36 method16472(int i, int i_18_, int i_19_,
					     int i_20_) {
	synchronized (aClass534_Sub36Array10794) {
	    if (0 == 2450901 * anInt10795) {
		Class534_Sub36 class534_sub36
		    = new Class534_Sub36(i, i_18_, i_19_, i_20_);
		return class534_sub36;
	    }
	    aClass534_Sub36Array10794[(anInt10795 -= 1809361789) * 2450901]
		.method16465(i, i_18_, i_19_, i_20_, (byte) -26);
	    Class534_Sub36 class534_sub36
		= aClass534_Sub36Array10794[2450901 * anInt10795];
	    return class534_sub36;
	}
    }
    
    void method16473(int i, boolean bool) {
	if (-1 == i)
	    anInt10796 = -1166548959;
	else {
	    anInt10796 = (i >> 28 & 0x3) * 1166548959;
	    anInt10797 = -1224142395 * ((i >> 14 & 0x3fff) << 9);
	    anInt10798 = 0;
	    anInt10799 = 646265707 * ((i & 0x3fff) << 9);
	    if (bool) {
		anInt10797 += 152159488;
		anInt10799 += -2059703552;
	    }
	}
    }
    
    public static Class534_Sub36 method16474(Class534_Sub36 class534_sub36) {
	synchronized (aClass534_Sub36Array10794) {
	    if (0 == anInt10795 * 2450901) {
		Class534_Sub36 class534_sub36_21_
		    = new Class534_Sub36(class534_sub36);
		return class534_sub36_21_;
	    }
	    aClass534_Sub36Array10794[(anInt10795 -= 1809361789) * 2450901]
		.method16466(class534_sub36, (byte) 1);
	    Class534_Sub36 class534_sub36_22_
		= aClass534_Sub36Array10794[anInt10795 * 2450901];
	    return class534_sub36_22_;
	}
    }
    
    public static Class534_Sub36 method16475(Class534_Sub36 class534_sub36) {
	synchronized (aClass534_Sub36Array10794) {
	    if (0 == anInt10795 * 2450901) {
		Class534_Sub36 class534_sub36_23_
		    = new Class534_Sub36(class534_sub36);
		return class534_sub36_23_;
	    }
	    aClass534_Sub36Array10794[(anInt10795 -= 1809361789) * 2450901]
		.method16466(class534_sub36, (byte) 1);
	    Class534_Sub36 class534_sub36_24_
		= aClass534_Sub36Array10794[anInt10795 * 2450901];
	    return class534_sub36_24_;
	}
    }
    
    public static Class534_Sub36 method16476(int i, boolean bool) {
	synchronized (aClass534_Sub36Array10794) {
	    if (anInt10795 * 2450901 == 0) {
		Class534_Sub36 class534_sub36 = new Class534_Sub36(i, bool);
		return class534_sub36;
	    }
	    aClass534_Sub36Array10794[(anInt10795 -= 1809361789) * 2450901]
		.method16467(i, bool, (short) -25917);
	    Class534_Sub36 class534_sub36
		= aClass534_Sub36Array10794[2450901 * anInt10795];
	    return class534_sub36;
	}
    }
    
    public void method70(Class534_Sub40 class534_sub40) {
	method16487(class534_sub40, -2122238220);
    }
    
    public Class534_Sub36() {
	anInt10796 = -1166548959;
    }
    
    void method16477(Class534_Sub36 class534_sub36_25_) {
	anInt10796 = class534_sub36_25_.anInt10796 * 1;
	anInt10797 = class534_sub36_25_.anInt10797 * 1;
	anInt10798 = class534_sub36_25_.anInt10798 * 1;
	anInt10799 = class534_sub36_25_.anInt10799 * 1;
    }
    
    void method16478(Class534_Sub36 class534_sub36_26_) {
	anInt10796 = class534_sub36_26_.anInt10796 * 1;
	anInt10797 = class534_sub36_26_.anInt10797 * 1;
	anInt10798 = class534_sub36_26_.anInt10798 * 1;
	anInt10799 = class534_sub36_26_.anInt10799 * 1;
    }
    
    void method16479(Class534_Sub36 class534_sub36_27_) {
	anInt10796 = class534_sub36_27_.anInt10796 * 1;
	anInt10797 = class534_sub36_27_.anInt10797 * 1;
	anInt10798 = class534_sub36_27_.anInt10798 * 1;
	anInt10799 = class534_sub36_27_.anInt10799 * 1;
    }
    
    void method16480(int i, boolean bool) {
	if (-1 == i)
	    anInt10796 = -1166548959;
	else {
	    anInt10796 = (i >> 28 & 0x3) * 1166548959;
	    anInt10797 = -1224142395 * ((i >> 14 & 0x3fff) << 9);
	    anInt10798 = 0;
	    anInt10799 = 646265707 * ((i & 0x3fff) << 9);
	    if (bool) {
		anInt10797 += 152159488;
		anInt10799 += -2059703552;
	    }
	}
    }
    
    void method16481(int i, boolean bool) {
	if (-1 == i)
	    anInt10796 = -1166548959;
	else {
	    anInt10796 = (i >> 28 & 0x3) * 1166548959;
	    anInt10797 = -1224142395 * ((i >> 14 & 0x3fff) << 9);
	    anInt10798 = 0;
	    anInt10799 = 646265707 * ((i & 0x3fff) << 9);
	    if (bool) {
		anInt10797 += 152159488;
		anInt10799 += -2059703552;
	    }
	}
    }
    
    Class534_Sub36(int i, boolean bool) {
	if (-1 == i)
	    anInt10796 = -1166548959;
	else {
	    anInt10796 = 1166548959 * (i >> 28 & 0x3);
	    anInt10797 = ((i >> 14 & 0x3fff) << 9) * -1224142395;
	    anInt10798 = 0;
	    anInt10799 = ((i & 0x3fff) << 9) * 646265707;
	    if (bool) {
		anInt10797 += 152159488;
		anInt10799 += -2059703552;
	    }
	}
    }
    
    void method16482(int i, boolean bool) {
	if (-1 == i)
	    anInt10796 = -1166548959;
	else {
	    anInt10796 = (i >> 28 & 0x3) * 1166548959;
	    anInt10797 = -1224142395 * ((i >> 14 & 0x3fff) << 9);
	    anInt10798 = 0;
	    anInt10799 = 646265707 * ((i & 0x3fff) << 9);
	    if (bool) {
		anInt10797 += 152159488;
		anInt10799 += -2059703552;
	    }
	}
    }
    
    public Class438 method16483(int i) {
	return new Class438((float) (anInt10797 * 599803149),
			    (float) (anInt10798 * -1203728391),
			    (float) (33298755 * anInt10799));
    }
    
    void method16484(int i, int i_28_, int i_29_, int i_30_) {
	anInt10796 = 1166548959 * i;
	anInt10797 = -1224142395 * i_28_;
	anInt10798 = i_29_ * -1544617399;
	anInt10799 = 646265707 * i_30_;
    }
    
    public Class438 method16485() {
	return new Class438((float) (anInt10797 * 599803149),
			    (float) (anInt10798 * -1203728391),
			    (float) (33298755 * anInt10799));
    }
    
    void method16486(Class534_Sub40 class534_sub40) {
	class534_sub40.method16506(955276319 * anInt10796, 1104365608);
	class534_sub40.method16510(anInt10797 * 599803149, -1714282910);
	class534_sub40.method16510(-1203728391 * anInt10798, -470489073);
	class534_sub40.method16510(anInt10799 * 33298755, -817420269);
    }
    
    void method16487(Class534_Sub40 class534_sub40, int i) {
	class534_sub40.method16506(955276319 * anInt10796, 1005401170);
	class534_sub40.method16510(anInt10797 * 599803149, -1205945762);
	class534_sub40.method16510(-1203728391 * anInt10798, -1896236269);
	class534_sub40.method16510(anInt10799 * 33298755, -1829069414);
    }
    
    public int method22() {
	return Class521.method8692(-1570629683);
    }
    
    public String method16488() {
	return new StringBuilder().append("Level: ").append
		   (955276319 * anInt10796).append
		   (" Coord: ").append
		   (anInt10797 * 599803149).append
		   (",").append
		   (-1203728391 * anInt10798).append
		   (",").append
		   (anInt10799 * 33298755).append
		   (" Coord Split: ").append
		   (599803149 * anInt10797 >> 15).append
		   (",").append
		   (33298755 * anInt10799 >> 15).append
		   (",").append
		   (anInt10797 * 599803149 >> 9 & 0x3f).append
		   (",").append
		   (33298755 * anInt10799 >> 9 & 0x3f).append
		   (",").append
		   (599803149 * anInt10797 & 0x1ff).append
		   (",").append
		   (anInt10799 * 33298755 & 0x1ff).toString();
    }
    
    void method16489(int i, boolean bool) {
	if (-1 == i)
	    anInt10796 = -1166548959;
	else {
	    anInt10796 = (i >> 28 & 0x3) * 1166548959;
	    anInt10797 = -1224142395 * ((i >> 14 & 0x3fff) << 9);
	    anInt10798 = 0;
	    anInt10799 = 646265707 * ((i & 0x3fff) << 9);
	    if (bool) {
		anInt10797 += 152159488;
		anInt10799 += -2059703552;
	    }
	}
    }
    
    public void method68(Class534_Sub40 class534_sub40) {
	method16487(class534_sub40, -633145020);
    }
    
    public void method73(Class534_Sub40 class534_sub40) {
	method16487(class534_sub40, -1073085949);
    }
    
    public void method71(Class534_Sub40 class534_sub40) {
	anInt10796 = class534_sub40.method16527(892956492) * 1166548959;
	anInt10797 = class534_sub40.method16533(-258848859) * -1224142395;
	anInt10798 = class534_sub40.method16533(-258848859) * -1544617399;
	anInt10799 = class534_sub40.method16533(-258848859) * 646265707;
    }
    
    static final void method16490(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class637.method10559((byte) 119);
    }
}
