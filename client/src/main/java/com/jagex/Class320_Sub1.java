/* Class320_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class320_Sub1 extends Class320
{
    Class269 aClass269_10007;
    static final int anInt10008 = 0;
    static final int anInt10009 = 1;
    int[][] anIntArrayArray10010;
    static final int anInt10011 = 3;
    static final int anInt10012 = 4;
    static final int anInt10013 = 7;
    static final int anInt10014 = 6;
    static final int anInt10015 = 5;
    static final int anInt10016 = 2;
    static final int anInt10017 = 1;
    static final int anInt10018 = 2;
    static final int anInt10019 = 3;
    Class278[] aClass278Array10020 = new Class278[3];
    static final int anInt10021 = 0;
    int[] anIntArray10022;
    Class441 aClass441_10023;
    Class441 aClass441_10024;
    
    boolean method15649() throws Exception_Sub4 {
	aClass269_10007 = aClass185_Sub1_3407.method14589("Sprite");
	Class534_Sub12_Sub1 class534_sub12_sub1
	    = aClass269_10007.method4909("WVPMatrix", -116954783);
	Class534_Sub12_Sub1 class534_sub12_sub1_0_
	    = aClass269_10007.method4909("SpriteSampler", 1800613850);
	Class534_Sub12_Sub1 class534_sub12_sub1_1_
	    = aClass269_10007.method4909("MaskSampler", -121373600);
	Class534_Sub12_Sub1 class534_sub12_sub1_2_
	    = aClass269_10007.method4909("MulColour", 1419114200);
	Class534_Sub12_Sub1 class534_sub12_sub1_3_
	    = aClass269_10007.method4909("AddColour", 1978324995);
	Class534_Sub12_Sub1 class534_sub12_sub1_4_
	    = aClass269_10007.method4909("SpriteTexCoordMatrix", -34451624);
	Class534_Sub12_Sub1 class534_sub12_sub1_5_
	    = aClass269_10007.method4909("MaskTexCoordMatrix", 754308061);
	aClass278Array10020[0]
	    = aClass269_10007.method4914("Normal", -1910115999);
	aClass278Array10020[1]
	    = aClass269_10007.method4914("Masked", -1424899623);
	aClass278Array10020[2]
	    = aClass269_10007.method4914("AlphaTex", -1407943972);
	for (int i = 0; i < 3; i++) {
	    int i_6_ = aClass269_10007.method4917(aClass278Array10020[i],
						  (byte) -27);
	    anIntArrayArray10010[i][0] = class534_sub12_sub1.method18240(i_6_);
	    anIntArrayArray10010[i][1]
		= class534_sub12_sub1_0_.method18240(i_6_);
	    anIntArrayArray10010[i][2]
		= class534_sub12_sub1_1_.method18240(i_6_);
	    anIntArrayArray10010[i][5]
		= class534_sub12_sub1_2_.method18240(i_6_);
	    anIntArrayArray10010[i][6]
		= class534_sub12_sub1_3_.method18240(i_6_);
	    anIntArrayArray10010[i][3]
		= class534_sub12_sub1_4_.method18240(i_6_);
	    anIntArrayArray10010[i][4]
		= class534_sub12_sub1_5_.method18240(i_6_);
	}
	aClass269_10007.method4919(aClass278Array10020[0]);
	return true;
    }
    
    boolean method15650(int i) throws Exception_Sub4 {
	aClass269_10007 = aClass185_Sub1_3407.method14589("Sprite");
	Class534_Sub12_Sub1 class534_sub12_sub1
	    = aClass269_10007.method4909("WVPMatrix", 798981531);
	Class534_Sub12_Sub1 class534_sub12_sub1_7_
	    = aClass269_10007.method4909("SpriteSampler", 542004467);
	Class534_Sub12_Sub1 class534_sub12_sub1_8_
	    = aClass269_10007.method4909("MaskSampler", 766602147);
	Class534_Sub12_Sub1 class534_sub12_sub1_9_
	    = aClass269_10007.method4909("MulColour", 773185990);
	Class534_Sub12_Sub1 class534_sub12_sub1_10_
	    = aClass269_10007.method4909("AddColour", 910065883);
	Class534_Sub12_Sub1 class534_sub12_sub1_11_
	    = aClass269_10007.method4909("SpriteTexCoordMatrix", -158307619);
	Class534_Sub12_Sub1 class534_sub12_sub1_12_
	    = aClass269_10007.method4909("MaskTexCoordMatrix", 1172833519);
	aClass278Array10020[0]
	    = aClass269_10007.method4914("Normal", -1306846132);
	aClass278Array10020[1]
	    = aClass269_10007.method4914("Masked", -1791085551);
	aClass278Array10020[2]
	    = aClass269_10007.method4914("AlphaTex", -1414495045);
	for (int i_13_ = 0; i_13_ < 3; i_13_++) {
	    int i_14_ = aClass269_10007.method4917(aClass278Array10020[i_13_],
						   (byte) 75);
	    anIntArrayArray10010[i_13_][0]
		= class534_sub12_sub1.method18240(i_14_);
	    anIntArrayArray10010[i_13_][1]
		= class534_sub12_sub1_7_.method18240(i_14_);
	    anIntArrayArray10010[i_13_][2]
		= class534_sub12_sub1_8_.method18240(i_14_);
	    anIntArrayArray10010[i_13_][5]
		= class534_sub12_sub1_9_.method18240(i_14_);
	    anIntArrayArray10010[i_13_][6]
		= class534_sub12_sub1_10_.method18240(i_14_);
	    anIntArrayArray10010[i_13_][3]
		= class534_sub12_sub1_11_.method18240(i_14_);
	    anIntArrayArray10010[i_13_][4]
		= class534_sub12_sub1_12_.method18240(i_14_);
	}
	aClass269_10007.method4919(aClass278Array10020[0]);
	return true;
    }
    
    public void method5765(int i, int i_15_) {
	switch (i) {
	case 1:
	    aClass441_10023.method7129(-1);
	    aClass441_10024.method7129(0);
	    break;
	case 0:
	    aClass441_10023.method7129(i_15_);
	    aClass441_10024.method7129(0);
	    break;
	case 2:
	    aClass441_10023.method7129(i_15_);
	    aClass441_10024.method7129(0);
	    break;
	case 4:
	    aClass441_10023.method7129(-1);
	    aClass441_10024.method7129(i_15_);
	    aClass441_10024.method7109();
	    break;
	case 3:
	    aClass441_10023.method7129(0xffffff | i_15_ & ~0xffffff);
	    aClass441_10024.method7129(i_15_ & 0xffffff);
	    break;
	}
    }
    
    void method15651(byte i) {
	aClass269_10007.method4928(anIntArray10022[1], 0, anInterface38_3403,
				   905636829);
	aClass185_Sub1_3407.method14739(aClass433_3409);
	aClass269_10007.method4940(anIntArray10022[0], aClass433_3409,
				   (byte) 36);
	aClass269_10007.method4939(anIntArray10022[3], aClass433_3406,
				   2089716649);
	aClass269_10007.method5002(anIntArray10022[5],
				   aClass441_10023.aFloat4873,
				   aClass441_10023.aFloat4874,
				   aClass441_10023.aFloat4876,
				   aClass441_10023.aFloat4875, (short) -31281);
	aClass269_10007.method5002(anIntArray10022[6],
				   aClass441_10024.aFloat4873,
				   aClass441_10024.aFloat4874,
				   aClass441_10024.aFloat4876,
				   aClass441_10024.aFloat4875, (short) -17500);
	aClass185_Sub1_3407.method14733(0, anInterface37_3410);
	aClass185_Sub1_3407.method14700(aClass349_3411);
	aClass185_Sub1_3407.method14708(Class374.aClass374_3895, anInt3404, 2);
    }
    
    public void method5767() {
	aClass269_10007.method4919(aClass278Array10020[0]);
	aClass269_10007.method4913();
	anIntArray10022
	    = anIntArrayArray10010[aClass269_10007.method4921(1187966396)];
	method15651((byte) 3);
    }
    
    public void method5770() {
	aClass269_10007.method4919(aClass278Array10020[1]);
	aClass269_10007.method4913();
	anIntArray10022
	    = anIntArrayArray10010[aClass269_10007.method4921(-44173926)];
	aClass269_10007.method4928(anIntArray10022[2], 1, anInterface38_3405,
				   1493754162);
	aClass269_10007.method4939(anIntArray10022[4], aClass433_3408,
				   1716268226);
	method15651((byte) 3);
    }
    
    public void method5768() {
	aClass269_10007.method4919(aClass278Array10020[0]);
	aClass269_10007.method4913();
	anIntArray10022
	    = anIntArrayArray10010[aClass269_10007.method4921(16970276)];
	method15651((byte) 3);
    }
    
    public void method5769() {
	aClass269_10007.method4919(aClass278Array10020[1]);
	aClass269_10007.method4913();
	anIntArray10022
	    = anIntArrayArray10010[aClass269_10007.method4921(1903392685)];
	aClass269_10007.method4928(anIntArray10022[2], 1, anInterface38_3405,
				   2026053129);
	aClass269_10007.method4939(anIntArray10022[4], aClass433_3408,
				   1797360596);
	method15651((byte) 3);
    }
    
    public void method5764() {
	aClass269_10007.method4919(aClass278Array10020[1]);
	aClass269_10007.method4913();
	anIntArray10022
	    = anIntArrayArray10010[aClass269_10007.method4921(108942571)];
	aClass269_10007.method4928(anIntArray10022[2], 1, anInterface38_3405,
				   1410678512);
	aClass269_10007.method4939(anIntArray10022[4], aClass433_3408,
				   1862132578);
	method15651((byte) 3);
    }
    
    public void method5771(int i, int i_16_) {
	switch (i) {
	case 1:
	    aClass441_10023.method7129(-1);
	    aClass441_10024.method7129(0);
	    break;
	case 0:
	    aClass441_10023.method7129(i_16_);
	    aClass441_10024.method7129(0);
	    break;
	case 2:
	    aClass441_10023.method7129(i_16_);
	    aClass441_10024.method7129(0);
	    break;
	case 4:
	    aClass441_10023.method7129(-1);
	    aClass441_10024.method7129(i_16_);
	    aClass441_10024.method7109();
	    break;
	case 3:
	    aClass441_10023.method7129(0xffffff | i_16_ & ~0xffffff);
	    aClass441_10024.method7129(i_16_ & 0xffffff);
	    break;
	}
    }
    
    public void method5766(int i, int i_17_) {
	switch (i) {
	case 1:
	    aClass441_10023.method7129(-1);
	    aClass441_10024.method7129(0);
	    break;
	case 0:
	    aClass441_10023.method7129(i_17_);
	    aClass441_10024.method7129(0);
	    break;
	case 2:
	    aClass441_10023.method7129(i_17_);
	    aClass441_10024.method7129(0);
	    break;
	case 4:
	    aClass441_10023.method7129(-1);
	    aClass441_10024.method7129(i_17_);
	    aClass441_10024.method7109();
	    break;
	case 3:
	    aClass441_10023.method7129(0xffffff | i_17_ & ~0xffffff);
	    aClass441_10024.method7129(i_17_ & 0xffffff);
	    break;
	}
    }
    
    boolean method15652() throws Exception_Sub4 {
	aClass269_10007 = aClass185_Sub1_3407.method14589("Sprite");
	Class534_Sub12_Sub1 class534_sub12_sub1
	    = aClass269_10007.method4909("WVPMatrix", 767870751);
	Class534_Sub12_Sub1 class534_sub12_sub1_18_
	    = aClass269_10007.method4909("SpriteSampler", 434991298);
	Class534_Sub12_Sub1 class534_sub12_sub1_19_
	    = aClass269_10007.method4909("MaskSampler", 340734599);
	Class534_Sub12_Sub1 class534_sub12_sub1_20_
	    = aClass269_10007.method4909("MulColour", 1320892441);
	Class534_Sub12_Sub1 class534_sub12_sub1_21_
	    = aClass269_10007.method4909("AddColour", 2091753453);
	Class534_Sub12_Sub1 class534_sub12_sub1_22_
	    = aClass269_10007.method4909("SpriteTexCoordMatrix", 1075547909);
	Class534_Sub12_Sub1 class534_sub12_sub1_23_
	    = aClass269_10007.method4909("MaskTexCoordMatrix", 1841240231);
	aClass278Array10020[0]
	    = aClass269_10007.method4914("Normal", -1778108949);
	aClass278Array10020[1]
	    = aClass269_10007.method4914("Masked", -1605292790);
	aClass278Array10020[2]
	    = aClass269_10007.method4914("AlphaTex", -1556913464);
	for (int i = 0; i < 3; i++) {
	    int i_24_ = aClass269_10007.method4917(aClass278Array10020[i],
						   (byte) -83);
	    anIntArrayArray10010[i][0]
		= class534_sub12_sub1.method18240(i_24_);
	    anIntArrayArray10010[i][1]
		= class534_sub12_sub1_18_.method18240(i_24_);
	    anIntArrayArray10010[i][2]
		= class534_sub12_sub1_19_.method18240(i_24_);
	    anIntArrayArray10010[i][5]
		= class534_sub12_sub1_20_.method18240(i_24_);
	    anIntArrayArray10010[i][6]
		= class534_sub12_sub1_21_.method18240(i_24_);
	    anIntArrayArray10010[i][3]
		= class534_sub12_sub1_22_.method18240(i_24_);
	    anIntArrayArray10010[i][4]
		= class534_sub12_sub1_23_.method18240(i_24_);
	}
	aClass269_10007.method4919(aClass278Array10020[0]);
	return true;
    }
    
    public Class320_Sub1(Class185_Sub1 class185_sub1) throws Exception_Sub4 {
	super(class185_sub1);
	anIntArrayArray10010 = new int[3][7];
	aClass441_10023 = new Class441(1.0F, 1.0F, 1.0F, 1.0F);
	aClass441_10024 = new Class441(0.0F, 0.0F, 0.0F, 0.0F);
	method15650(-1339882469);
    }
    
    boolean method15653() throws Exception_Sub4 {
	aClass269_10007 = aClass185_Sub1_3407.method14589("Sprite");
	Class534_Sub12_Sub1 class534_sub12_sub1
	    = aClass269_10007.method4909("WVPMatrix", 165442868);
	Class534_Sub12_Sub1 class534_sub12_sub1_25_
	    = aClass269_10007.method4909("SpriteSampler", 739478002);
	Class534_Sub12_Sub1 class534_sub12_sub1_26_
	    = aClass269_10007.method4909("MaskSampler", 803894282);
	Class534_Sub12_Sub1 class534_sub12_sub1_27_
	    = aClass269_10007.method4909("MulColour", 1609024501);
	Class534_Sub12_Sub1 class534_sub12_sub1_28_
	    = aClass269_10007.method4909("AddColour", 1040461177);
	Class534_Sub12_Sub1 class534_sub12_sub1_29_
	    = aClass269_10007.method4909("SpriteTexCoordMatrix", 1326915345);
	Class534_Sub12_Sub1 class534_sub12_sub1_30_
	    = aClass269_10007.method4909("MaskTexCoordMatrix", 1146688628);
	aClass278Array10020[0]
	    = aClass269_10007.method4914("Normal", -2131644343);
	aClass278Array10020[1]
	    = aClass269_10007.method4914("Masked", -1757091365);
	aClass278Array10020[2]
	    = aClass269_10007.method4914("AlphaTex", -1560069658);
	for (int i = 0; i < 3; i++) {
	    int i_31_ = aClass269_10007.method4917(aClass278Array10020[i],
						   (byte) -61);
	    anIntArrayArray10010[i][0]
		= class534_sub12_sub1.method18240(i_31_);
	    anIntArrayArray10010[i][1]
		= class534_sub12_sub1_25_.method18240(i_31_);
	    anIntArrayArray10010[i][2]
		= class534_sub12_sub1_26_.method18240(i_31_);
	    anIntArrayArray10010[i][5]
		= class534_sub12_sub1_27_.method18240(i_31_);
	    anIntArrayArray10010[i][6]
		= class534_sub12_sub1_28_.method18240(i_31_);
	    anIntArrayArray10010[i][3]
		= class534_sub12_sub1_29_.method18240(i_31_);
	    anIntArrayArray10010[i][4]
		= class534_sub12_sub1_30_.method18240(i_31_);
	}
	aClass269_10007.method4919(aClass278Array10020[0]);
	return true;
    }
    
    void method15654() {
	aClass269_10007.method4928(anIntArray10022[1], 0, anInterface38_3403,
				   1770797786);
	aClass185_Sub1_3407.method14739(aClass433_3409);
	aClass269_10007.method4940(anIntArray10022[0], aClass433_3409,
				   (byte) 80);
	aClass269_10007.method4939(anIntArray10022[3], aClass433_3406,
				   346567544);
	aClass269_10007.method5002(anIntArray10022[5],
				   aClass441_10023.aFloat4873,
				   aClass441_10023.aFloat4874,
				   aClass441_10023.aFloat4876,
				   aClass441_10023.aFloat4875, (short) -16963);
	aClass269_10007.method5002(anIntArray10022[6],
				   aClass441_10024.aFloat4873,
				   aClass441_10024.aFloat4874,
				   aClass441_10024.aFloat4876,
				   aClass441_10024.aFloat4875, (short) -32107);
	aClass185_Sub1_3407.method14733(0, anInterface37_3410);
	aClass185_Sub1_3407.method14700(aClass349_3411);
	aClass185_Sub1_3407.method14708(Class374.aClass374_3895, anInt3404, 2);
    }
}
