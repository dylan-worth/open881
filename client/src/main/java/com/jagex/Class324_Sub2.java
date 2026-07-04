/* Class324_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class324_Sub2 extends Class324
{
    static final int anInt10077 = 18;
    static final int anInt10078 = 3;
    static final int anInt10079 = 1;
    static final int anInt10080 = 14;
    static final int anInt10081 = 17;
    static final int anInt10082 = 13;
    static final int anInt10083 = 5;
    static final int anInt10084 = 6;
    Class269 aClass269_10085;
    static final int anInt10086 = 8;
    static final int anInt10087 = 9;
    static final int anInt10088 = 10;
    static final int anInt10089 = 11;
    static final int anInt10090 = 12;
    static final int anInt10091 = 7;
    static final int anInt10092 = 0;
    static final int anInt10093 = 15;
    static final int anInt10094 = 16;
    static final int anInt10095 = 17;
    static final int anInt10096 = 0;
    static final int anInt10097 = 4;
    static final int anInt10098 = 2;
    static final int anInt10099 = 7;
    int[][] anIntArrayArray10100;
    static final int anInt10101 = 1;
    static final int anInt10102 = 12;
    static final int anInt10103 = 19;
    Class433 aClass433_10104 = new Class433();
    Class278[] aClass278Array10105 = new Class278[19];
    static final int anInt10106 = 2;
    int[] anIntArray10107;
    
    public void method5794(Class433 class433) {
	aClass433_10104.method6842(class433);
	aClass433_10104.method6839(aClass185_Sub1_3429.aClass433_9164);
    }
    
    boolean method15696(byte i) throws Exception_Sub4 {
	aClass269_10085 = aClass185_Sub1_3429.method14589("Model");
	Class534_Sub12_Sub1 class534_sub12_sub1
	    = aClass269_10085.method4909("DiffuseSampler", 17693592);
	Class534_Sub12_Sub1 class534_sub12_sub1_0_
	    = aClass269_10085.method4909("EnvironmentSampler", 1972324515);
	Class534_Sub12_Sub1 class534_sub12_sub1_1_
	    = aClass269_10085.method4909("PointLightsPosAndRadiusInv",
					 1111141221);
	Class534_Sub12_Sub1 class534_sub12_sub1_2_
	    = aClass269_10085.method4909("PointLightsDiffuseColour",
					 1484342188);
	Class534_Sub12_Sub1 class534_sub12_sub1_3_
	    = aClass269_10085.method4909("WVPMatrix", 649492664);
	Class534_Sub12_Sub1 class534_sub12_sub1_4_
	    = aClass269_10085.method4909("TexCoordMatrix", 1563392296);
	Class534_Sub12_Sub1 class534_sub12_sub1_5_
	    = aClass269_10085.method4909("HeightFogPlane", 1542304629);
	Class534_Sub12_Sub1 class534_sub12_sub1_6_
	    = aClass269_10085.method4909("HeightFogColour", 1836863581);
	Class534_Sub12_Sub1 class534_sub12_sub1_7_
	    = aClass269_10085.method4909("DistanceFogPlane", 869141768);
	Class534_Sub12_Sub1 class534_sub12_sub1_8_
	    = aClass269_10085.method4909("DistanceFogColour", 1921730709);
	Class534_Sub12_Sub1 class534_sub12_sub1_9_
	    = aClass269_10085.method4909("SunDir", 866826088);
	Class534_Sub12_Sub1 class534_sub12_sub1_10_
	    = aClass269_10085.method4909("SunColour", 118441177);
	Class534_Sub12_Sub1 class534_sub12_sub1_11_
	    = aClass269_10085.method4909("AntiSunColour", 353734549);
	Class534_Sub12_Sub1 class534_sub12_sub1_12_
	    = aClass269_10085.method4909("AmbientColour", 1636032812);
	Class534_Sub12_Sub1 class534_sub12_sub1_13_
	    = aClass269_10085.method4909("EyePos", 744708996);
	Class534_Sub12_Sub1 class534_sub12_sub1_14_
	    = aClass269_10085.method4909("SpecularExponent", 8216561);
	Class534_Sub12_Sub1 class534_sub12_sub1_15_
	    = aClass269_10085.method4909("WorldMatrix", 294454072);
	aClass278Array10105[0]
	    = aClass269_10085.method4914("Unlit", -1842439634);
	aClass278Array10105[1]
	    = aClass269_10085.method4914("Unlit_IgnoreAlpha", -2127265628);
	aClass278Array10105[17]
	    = aClass269_10085.method4914("UnderwaterGround", -2124130359);
	aClass278Array10105[18]
	    = aClass269_10085.method4914("UnderwaterGroundSpecular",
					 -1747941864);
	for (int i_16_ = 0; i_16_ <= 4; i_16_++) {
	    aClass278Array10105[2 + i_16_]
		= aClass269_10085.method4914(new StringBuilder().append
						 ("Standard_").append
						 (i_16_).append
						 ("PointLights").toString(),
					     -2116175309);
	    aClass278Array10105[7 + i_16_]
		= aClass269_10085.method4914(new StringBuilder().append
						 ("Specular_").append
						 (i_16_).append
						 ("PointLights").toString(),
					     -1759439211);
	    aClass278Array10105[12 + i_16_]
		= aClass269_10085.method4914(new StringBuilder().append
						 ("EnvironmentalMapping_")
						 .append
						 (i_16_).append
						 ("PointLights").toString(),
					     -2060935408);
	}
	for (int i_17_ = 0; i_17_ < 19; i_17_++) {
	    int i_18_ = aClass269_10085.method4917(aClass278Array10105[i_17_],
						   (byte) -62);
	    anIntArrayArray10100[i_17_][2]
		= class534_sub12_sub1.method18240(i_18_);
	    anIntArrayArray10100[i_17_][3]
		= class534_sub12_sub1_0_.method18240(i_18_);
	    anIntArrayArray10100[i_17_][1]
		= class534_sub12_sub1_1_.method18240(i_18_);
	    anIntArrayArray10100[i_17_][0]
		= class534_sub12_sub1_2_.method18240(i_18_);
	    anIntArrayArray10100[i_17_][4]
		= class534_sub12_sub1_3_.method18240(i_18_);
	    anIntArrayArray10100[i_17_][5]
		= class534_sub12_sub1_4_.method18240(i_18_);
	    anIntArrayArray10100[i_17_][7]
		= class534_sub12_sub1_5_.method18240(i_18_);
	    anIntArrayArray10100[i_17_][8]
		= class534_sub12_sub1_6_.method18240(i_18_);
	    anIntArrayArray10100[i_17_][9]
		= class534_sub12_sub1_7_.method18240(i_18_);
	    anIntArrayArray10100[i_17_][10]
		= class534_sub12_sub1_8_.method18240(i_18_);
	    anIntArrayArray10100[i_17_][11]
		= class534_sub12_sub1_9_.method18240(i_18_);
	    anIntArrayArray10100[i_17_][12]
		= class534_sub12_sub1_10_.method18240(i_18_);
	    anIntArrayArray10100[i_17_][13]
		= class534_sub12_sub1_11_.method18240(i_18_);
	    anIntArrayArray10100[i_17_][14]
		= class534_sub12_sub1_12_.method18240(i_18_);
	    anIntArrayArray10100[i_17_][6]
		= class534_sub12_sub1_13_.method18240(i_18_);
	    anIntArrayArray10100[i_17_][15]
		= class534_sub12_sub1_15_.method18240(i_18_);
	    anIntArrayArray10100[i_17_][16]
		= class534_sub12_sub1_14_.method18240(i_18_);
	}
	aClass269_10085.method4919(aClass278Array10105[2]);
	return true;
    }
    
    public void method5806(int i) {
	aClass269_10085.method4919(aClass278Array10105[i + 7]);
	anIntArray10107
	    = anIntArrayArray10100[aClass269_10085.method4921(1370604037)];
	aClass269_10085.method4913();
	aClass269_10085.method4934(anIntArray10107[6],
				   aClass438_3433.aFloat4864,
				   aClass438_3433.aFloat4863,
				   aClass438_3433.aFloat4865, (byte) 46);
	aClass269_10085.method5002(anIntArray10107[16], aFloat3436, aFloat3437,
				   0.0F, 0.0F, (short) -4998);
	method15697(i, -480127568);
    }
    
    public void method5812(boolean bool) {
	if (bool)
	    aClass269_10085.method4919(aClass278Array10105[1]);
	else
	    aClass269_10085.method4919(aClass278Array10105[0]);
	anIntArray10107
	    = anIntArrayArray10100[aClass269_10085.method4921(-10130205)];
	aClass269_10085.method4913();
	aClass269_10085.method4928(anIntArray10107[2], 0, anInterface38_3432,
				   -1102836501);
	aClass269_10085.method4940(anIntArray10107[4], aClass433_10104,
				   (byte) 111);
	aClass269_10085.method4939(anIntArray10107[5], aClass433_3430,
				   372594353);
	aClass269_10085.method5002(anIntArray10107[7],
				   aClass441_3438.aFloat4873,
				   aClass441_3438.aFloat4874,
				   aClass441_3438.aFloat4876,
				   aClass441_3438.aFloat4875, (short) -23893);
	aClass269_10085.method4934(anIntArray10107[8],
				   aClass438_3431.aFloat4864,
				   aClass438_3431.aFloat4863,
				   aClass438_3431.aFloat4865, (byte) 68);
	aClass269_10085.method5002(anIntArray10107[9],
				   aClass441_3440.aFloat4873,
				   aClass441_3440.aFloat4874,
				   aClass441_3440.aFloat4876,
				   aClass441_3440.aFloat4875, (short) -22057);
	aClass269_10085.method4934(anIntArray10107[10],
				   aClass438_3435.aFloat4864,
				   aClass438_3435.aFloat4863,
				   aClass438_3435.aFloat4865, (byte) 27);
	aClass185_Sub1_3429.method14710(Class374.aClass374_3898, anInt3447,
					anInt3428, anInt3449, anInt3450);
    }
    
    public void method5799() {
	aClass269_10085.method4919(aClass278Array10105[17]);
	anIntArray10107
	    = anIntArrayArray10100[aClass269_10085.method4921(2058879540)];
	aClass269_10085.method4913();
	method15697(0, -2144968578);
    }
    
    public void method5800() {
	aClass269_10085.method4919(aClass278Array10105[18]);
	anIntArray10107
	    = anIntArrayArray10100[aClass269_10085.method4921(262772670)];
	aClass269_10085.method4913();
	aClass269_10085.method4934(anIntArray10107[6],
				   aClass438_3433.aFloat4864,
				   aClass438_3433.aFloat4863,
				   aClass438_3433.aFloat4865, (byte) 127);
	aClass269_10085.method5002(anIntArray10107[16], aFloat3436, aFloat3437,
				   0.0F, 0.0F, (short) -6882);
	method15697(0, -513583654);
    }
    
    void method15697(int i, int i_19_) {
	aClass269_10085.method4928(anIntArray10107[2], 0, anInterface38_3432,
				   -691531425);
	aClass269_10085.method4940(anIntArray10107[4], aClass433_10104,
				   (byte) 46);
	aClass269_10085.method4939(anIntArray10107[5], aClass433_3430,
				   204893144);
	aClass269_10085.method5002(anIntArray10107[7],
				   aClass441_3438.aFloat4873,
				   aClass441_3438.aFloat4874,
				   aClass441_3438.aFloat4876,
				   aClass441_3438.aFloat4875, (short) -12442);
	aClass269_10085.method4934(anIntArray10107[8],
				   aClass438_3431.aFloat4864,
				   aClass438_3431.aFloat4863,
				   aClass438_3431.aFloat4865, (byte) 10);
	aClass269_10085.method5002(anIntArray10107[9],
				   aClass441_3440.aFloat4873,
				   aClass441_3440.aFloat4874,
				   aClass441_3440.aFloat4876,
				   aClass441_3440.aFloat4875, (short) 552);
	aClass269_10085.method4934(anIntArray10107[10],
				   aClass438_3435.aFloat4864,
				   aClass438_3435.aFloat4863,
				   aClass438_3435.aFloat4865, (byte) 104);
	aClass269_10085.method4981(anIntArray10107[11], aClass438_3442,
				   738539987);
	aClass269_10085.method4981(anIntArray10107[12], aClass438_3443,
				   1909682433);
	aClass269_10085.method4981(anIntArray10107[13], aClass438_3444,
				   941160758);
	aClass269_10085.method4981(anIntArray10107[14], aClass438_3445,
				   1897938375);
	if (i > 0) {
	    aClass269_10085.method4942(anIntArray10107[1], aFloatArray3448,
				       i * 4, -860183520);
	    aClass269_10085.method4942(anIntArray10107[0], aFloatArray3439,
				       i * 4, -860183520);
	}
	aClass185_Sub1_3429.method14710(Class374.aClass374_3898, anInt3447,
					anInt3428, anInt3449, anInt3450);
    }
    
    public void method5796(int i) {
	aClass269_10085.method4919(aClass278Array10105[2 + i]);
	anIntArray10107
	    = anIntArrayArray10100[aClass269_10085.method4921(392585834)];
	aClass269_10085.method4913();
	method15697(i, -1618019736);
    }
    
    public void method5810(int i) {
	aClass269_10085.method4919(aClass278Array10105[i + 7]);
	anIntArray10107
	    = anIntArrayArray10100[aClass269_10085.method4921(2115627898)];
	aClass269_10085.method4913();
	aClass269_10085.method4934(anIntArray10107[6],
				   aClass438_3433.aFloat4864,
				   aClass438_3433.aFloat4863,
				   aClass438_3433.aFloat4865, (byte) 31);
	aClass269_10085.method5002(anIntArray10107[16], aFloat3436, aFloat3437,
				   0.0F, 0.0F, (short) -3384);
	method15697(i, -1541197796);
    }
    
    public void method5803(boolean bool) {
	if (bool)
	    aClass269_10085.method4919(aClass278Array10105[1]);
	else
	    aClass269_10085.method4919(aClass278Array10105[0]);
	anIntArray10107
	    = anIntArrayArray10100[aClass269_10085.method4921(1553322717)];
	aClass269_10085.method4913();
	aClass269_10085.method4928(anIntArray10107[2], 0, anInterface38_3432,
				   1419955247);
	aClass269_10085.method4940(anIntArray10107[4], aClass433_10104,
				   (byte) 84);
	aClass269_10085.method4939(anIntArray10107[5], aClass433_3430,
				   638460779);
	aClass269_10085.method5002(anIntArray10107[7],
				   aClass441_3438.aFloat4873,
				   aClass441_3438.aFloat4874,
				   aClass441_3438.aFloat4876,
				   aClass441_3438.aFloat4875, (short) -25822);
	aClass269_10085.method4934(anIntArray10107[8],
				   aClass438_3431.aFloat4864,
				   aClass438_3431.aFloat4863,
				   aClass438_3431.aFloat4865, (byte) 23);
	aClass269_10085.method5002(anIntArray10107[9],
				   aClass441_3440.aFloat4873,
				   aClass441_3440.aFloat4874,
				   aClass441_3440.aFloat4876,
				   aClass441_3440.aFloat4875, (short) -24965);
	aClass269_10085.method4934(anIntArray10107[10],
				   aClass438_3435.aFloat4864,
				   aClass438_3435.aFloat4863,
				   aClass438_3435.aFloat4865, (byte) 77);
	aClass185_Sub1_3429.method14710(Class374.aClass374_3898, anInt3447,
					anInt3428, anInt3449, anInt3450);
    }
    
    public void method5813(int i) {
	aClass269_10085.method4919(aClass278Array10105[2 + i]);
	anIntArray10107
	    = anIntArrayArray10100[aClass269_10085.method4921(-27411006)];
	aClass269_10085.method4913();
	method15697(i, -1949438587);
    }
    
    public void method5802(Class433 class433) {
	aClass433_10104.method6842(class433);
	aClass433_10104.method6839(aClass185_Sub1_3429.aClass433_9164);
    }
    
    public void method5801(Class433 class433) {
	aClass433_10104.method6842(class433);
	aClass433_10104.method6839(aClass185_Sub1_3429.aClass433_9164);
    }
    
    public void method5815(int i) {
	aClass269_10085.method4919(aClass278Array10105[2 + i]);
	anIntArray10107
	    = anIntArrayArray10100[aClass269_10085.method4921(1769331269)];
	aClass269_10085.method4913();
	method15697(i, -1873717073);
    }
    
    public void method5797(int i) {
	aClass269_10085.method4919(aClass278Array10105[i + 7]);
	anIntArray10107
	    = anIntArrayArray10100[aClass269_10085.method4921(781067917)];
	aClass269_10085.method4913();
	aClass269_10085.method4934(anIntArray10107[6],
				   aClass438_3433.aFloat4864,
				   aClass438_3433.aFloat4863,
				   aClass438_3433.aFloat4865, (byte) 118);
	aClass269_10085.method5002(anIntArray10107[16], aFloat3436, aFloat3437,
				   0.0F, 0.0F, (short) -9348);
	method15697(i, -1649018093);
    }
    
    public void method5805(int i) {
	aClass269_10085.method4919(aClass278Array10105[i + 12]);
	anIntArray10107
	    = anIntArrayArray10100[aClass269_10085.method4921(1555658233)];
	aClass269_10085.method4913();
	aClass269_10085.method4938(anIntArray10107[15], aClass433_3446,
				   (short) -9715);
	aClass269_10085.method4934(anIntArray10107[6],
				   aClass438_3433.aFloat4864,
				   aClass438_3433.aFloat4863,
				   aClass438_3433.aFloat4865, (byte) 66);
	aClass269_10085.method4928(anIntArray10107[3], 1, anInterface41_3434,
				   1852303635);
	method15697(i, -2031281445);
    }
    
    public void method5807(int i) {
	aClass269_10085.method4919(aClass278Array10105[i + 12]);
	anIntArray10107
	    = anIntArrayArray10100[aClass269_10085.method4921(1862864110)];
	aClass269_10085.method4913();
	aClass269_10085.method4938(anIntArray10107[15], aClass433_3446,
				   (short) -23731);
	aClass269_10085.method4934(anIntArray10107[6],
				   aClass438_3433.aFloat4864,
				   aClass438_3433.aFloat4863,
				   aClass438_3433.aFloat4865, (byte) 105);
	aClass269_10085.method4928(anIntArray10107[3], 1, anInterface41_3434,
				   -1274017284);
	method15697(i, -507445238);
    }
    
    public void method5808(int i) {
	aClass269_10085.method4919(aClass278Array10105[i + 12]);
	anIntArray10107
	    = anIntArrayArray10100[aClass269_10085.method4921(-46573788)];
	aClass269_10085.method4913();
	aClass269_10085.method4938(anIntArray10107[15], aClass433_3446,
				   (short) -5907);
	aClass269_10085.method4934(anIntArray10107[6],
				   aClass438_3433.aFloat4864,
				   aClass438_3433.aFloat4863,
				   aClass438_3433.aFloat4865, (byte) 33);
	aClass269_10085.method4928(anIntArray10107[3], 1, anInterface41_3434,
				   433086033);
	method15697(i, -1302398560);
    }
    
    public void method5809() {
	aClass269_10085.method4919(aClass278Array10105[17]);
	anIntArray10107
	    = anIntArrayArray10100[aClass269_10085.method4921(518336335)];
	aClass269_10085.method4913();
	method15697(0, -1549392180);
    }
    
    public void method5795() {
	aClass269_10085.method4919(aClass278Array10105[17]);
	anIntArray10107
	    = anIntArrayArray10100[aClass269_10085.method4921(2088396993)];
	aClass269_10085.method4913();
	method15697(0, -574504575);
    }
    
    public void method5792() {
	aClass269_10085.method4919(aClass278Array10105[18]);
	anIntArray10107
	    = anIntArrayArray10100[aClass269_10085.method4921(160850719)];
	aClass269_10085.method4913();
	aClass269_10085.method4934(anIntArray10107[6],
				   aClass438_3433.aFloat4864,
				   aClass438_3433.aFloat4863,
				   aClass438_3433.aFloat4865, (byte) 45);
	aClass269_10085.method5002(anIntArray10107[16], aFloat3436, aFloat3437,
				   0.0F, 0.0F, (short) -15567);
	method15697(0, -2024990876);
    }
    
    public Class324_Sub2(Class185_Sub1 class185_sub1) throws Exception_Sub4 {
	super(class185_sub1);
	anIntArrayArray10100 = new int[19][17];
	method15696((byte) -32);
    }
    
    public void method5814(int i) {
	aClass269_10085.method4919(aClass278Array10105[2 + i]);
	anIntArray10107
	    = anIntArrayArray10100[aClass269_10085.method4921(938185564)];
	aClass269_10085.method4913();
	method15697(i, -1842188977);
    }
    
    boolean method15698() throws Exception_Sub4 {
	aClass269_10085 = aClass185_Sub1_3429.method14589("Model");
	Class534_Sub12_Sub1 class534_sub12_sub1
	    = aClass269_10085.method4909("DiffuseSampler", 1505291315);
	Class534_Sub12_Sub1 class534_sub12_sub1_20_
	    = aClass269_10085.method4909("EnvironmentSampler", 348303895);
	Class534_Sub12_Sub1 class534_sub12_sub1_21_
	    = aClass269_10085.method4909("PointLightsPosAndRadiusInv",
					 1204240580);
	Class534_Sub12_Sub1 class534_sub12_sub1_22_
	    = aClass269_10085.method4909("PointLightsDiffuseColour",
					 311769629);
	Class534_Sub12_Sub1 class534_sub12_sub1_23_
	    = aClass269_10085.method4909("WVPMatrix", 2048547752);
	Class534_Sub12_Sub1 class534_sub12_sub1_24_
	    = aClass269_10085.method4909("TexCoordMatrix", 190438140);
	Class534_Sub12_Sub1 class534_sub12_sub1_25_
	    = aClass269_10085.method4909("HeightFogPlane", 1283606875);
	Class534_Sub12_Sub1 class534_sub12_sub1_26_
	    = aClass269_10085.method4909("HeightFogColour", -56463224);
	Class534_Sub12_Sub1 class534_sub12_sub1_27_
	    = aClass269_10085.method4909("DistanceFogPlane", 1208864457);
	Class534_Sub12_Sub1 class534_sub12_sub1_28_
	    = aClass269_10085.method4909("DistanceFogColour", 1850444797);
	Class534_Sub12_Sub1 class534_sub12_sub1_29_
	    = aClass269_10085.method4909("SunDir", -39368062);
	Class534_Sub12_Sub1 class534_sub12_sub1_30_
	    = aClass269_10085.method4909("SunColour", 19444257);
	Class534_Sub12_Sub1 class534_sub12_sub1_31_
	    = aClass269_10085.method4909("AntiSunColour", -176853269);
	Class534_Sub12_Sub1 class534_sub12_sub1_32_
	    = aClass269_10085.method4909("AmbientColour", 1423034906);
	Class534_Sub12_Sub1 class534_sub12_sub1_33_
	    = aClass269_10085.method4909("EyePos", 162040431);
	Class534_Sub12_Sub1 class534_sub12_sub1_34_
	    = aClass269_10085.method4909("SpecularExponent", 1460747416);
	Class534_Sub12_Sub1 class534_sub12_sub1_35_
	    = aClass269_10085.method4909("WorldMatrix", 1181846242);
	aClass278Array10105[0]
	    = aClass269_10085.method4914("Unlit", -1528267949);
	aClass278Array10105[1]
	    = aClass269_10085.method4914("Unlit_IgnoreAlpha", -1410449583);
	aClass278Array10105[17]
	    = aClass269_10085.method4914("UnderwaterGround", -1864681901);
	aClass278Array10105[18]
	    = aClass269_10085.method4914("UnderwaterGroundSpecular",
					 -2055476170);
	for (int i = 0; i <= 4; i++) {
	    aClass278Array10105[2 + i]
		= aClass269_10085.method4914(new StringBuilder().append
						 ("Standard_").append
						 (i).append
						 ("PointLights").toString(),
					     -1790237683);
	    aClass278Array10105[7 + i]
		= aClass269_10085.method4914(new StringBuilder().append
						 ("Specular_").append
						 (i).append
						 ("PointLights").toString(),
					     -1861067174);
	    aClass278Array10105[12 + i]
		= aClass269_10085.method4914(new StringBuilder().append
						 ("EnvironmentalMapping_")
						 .append
						 (i).append
						 ("PointLights").toString(),
					     -1840504187);
	}
	for (int i = 0; i < 19; i++) {
	    int i_36_ = aClass269_10085.method4917(aClass278Array10105[i],
						   (byte) 32);
	    anIntArrayArray10100[i][2]
		= class534_sub12_sub1.method18240(i_36_);
	    anIntArrayArray10100[i][3]
		= class534_sub12_sub1_20_.method18240(i_36_);
	    anIntArrayArray10100[i][1]
		= class534_sub12_sub1_21_.method18240(i_36_);
	    anIntArrayArray10100[i][0]
		= class534_sub12_sub1_22_.method18240(i_36_);
	    anIntArrayArray10100[i][4]
		= class534_sub12_sub1_23_.method18240(i_36_);
	    anIntArrayArray10100[i][5]
		= class534_sub12_sub1_24_.method18240(i_36_);
	    anIntArrayArray10100[i][7]
		= class534_sub12_sub1_25_.method18240(i_36_);
	    anIntArrayArray10100[i][8]
		= class534_sub12_sub1_26_.method18240(i_36_);
	    anIntArrayArray10100[i][9]
		= class534_sub12_sub1_27_.method18240(i_36_);
	    anIntArrayArray10100[i][10]
		= class534_sub12_sub1_28_.method18240(i_36_);
	    anIntArrayArray10100[i][11]
		= class534_sub12_sub1_29_.method18240(i_36_);
	    anIntArrayArray10100[i][12]
		= class534_sub12_sub1_30_.method18240(i_36_);
	    anIntArrayArray10100[i][13]
		= class534_sub12_sub1_31_.method18240(i_36_);
	    anIntArrayArray10100[i][14]
		= class534_sub12_sub1_32_.method18240(i_36_);
	    anIntArrayArray10100[i][6]
		= class534_sub12_sub1_33_.method18240(i_36_);
	    anIntArrayArray10100[i][15]
		= class534_sub12_sub1_35_.method18240(i_36_);
	    anIntArrayArray10100[i][16]
		= class534_sub12_sub1_34_.method18240(i_36_);
	}
	aClass269_10085.method4919(aClass278Array10105[2]);
	return true;
    }
    
    public void method5804(boolean bool) {
	if (bool)
	    aClass269_10085.method4919(aClass278Array10105[1]);
	else
	    aClass269_10085.method4919(aClass278Array10105[0]);
	anIntArray10107
	    = anIntArrayArray10100[aClass269_10085.method4921(790954526)];
	aClass269_10085.method4913();
	aClass269_10085.method4928(anIntArray10107[2], 0, anInterface38_3432,
				   -118432467);
	aClass269_10085.method4940(anIntArray10107[4], aClass433_10104,
				   (byte) 22);
	aClass269_10085.method4939(anIntArray10107[5], aClass433_3430,
				   1467817415);
	aClass269_10085.method5002(anIntArray10107[7],
				   aClass441_3438.aFloat4873,
				   aClass441_3438.aFloat4874,
				   aClass441_3438.aFloat4876,
				   aClass441_3438.aFloat4875, (short) -692);
	aClass269_10085.method4934(anIntArray10107[8],
				   aClass438_3431.aFloat4864,
				   aClass438_3431.aFloat4863,
				   aClass438_3431.aFloat4865, (byte) 117);
	aClass269_10085.method5002(anIntArray10107[9],
				   aClass441_3440.aFloat4873,
				   aClass441_3440.aFloat4874,
				   aClass441_3440.aFloat4876,
				   aClass441_3440.aFloat4875, (short) -10279);
	aClass269_10085.method4934(anIntArray10107[10],
				   aClass438_3435.aFloat4864,
				   aClass438_3435.aFloat4863,
				   aClass438_3435.aFloat4865, (byte) 126);
	aClass185_Sub1_3429.method14710(Class374.aClass374_3898, anInt3447,
					anInt3428, anInt3449, anInt3450);
    }
    
    boolean method15699() throws Exception_Sub4 {
	aClass269_10085 = aClass185_Sub1_3429.method14589("Model");
	Class534_Sub12_Sub1 class534_sub12_sub1
	    = aClass269_10085.method4909("DiffuseSampler", -101404201);
	Class534_Sub12_Sub1 class534_sub12_sub1_37_
	    = aClass269_10085.method4909("EnvironmentSampler", 1359391728);
	Class534_Sub12_Sub1 class534_sub12_sub1_38_
	    = aClass269_10085.method4909("PointLightsPosAndRadiusInv",
					 750985325);
	Class534_Sub12_Sub1 class534_sub12_sub1_39_
	    = aClass269_10085.method4909("PointLightsDiffuseColour",
					 657207569);
	Class534_Sub12_Sub1 class534_sub12_sub1_40_
	    = aClass269_10085.method4909("WVPMatrix", 1478100068);
	Class534_Sub12_Sub1 class534_sub12_sub1_41_
	    = aClass269_10085.method4909("TexCoordMatrix", 1851207235);
	Class534_Sub12_Sub1 class534_sub12_sub1_42_
	    = aClass269_10085.method4909("HeightFogPlane", 1482539495);
	Class534_Sub12_Sub1 class534_sub12_sub1_43_
	    = aClass269_10085.method4909("HeightFogColour", 1935571776);
	Class534_Sub12_Sub1 class534_sub12_sub1_44_
	    = aClass269_10085.method4909("DistanceFogPlane", -85249219);
	Class534_Sub12_Sub1 class534_sub12_sub1_45_
	    = aClass269_10085.method4909("DistanceFogColour", 1771415494);
	Class534_Sub12_Sub1 class534_sub12_sub1_46_
	    = aClass269_10085.method4909("SunDir", 396925577);
	Class534_Sub12_Sub1 class534_sub12_sub1_47_
	    = aClass269_10085.method4909("SunColour", 1850770434);
	Class534_Sub12_Sub1 class534_sub12_sub1_48_
	    = aClass269_10085.method4909("AntiSunColour", 1701535097);
	Class534_Sub12_Sub1 class534_sub12_sub1_49_
	    = aClass269_10085.method4909("AmbientColour", 1030020261);
	Class534_Sub12_Sub1 class534_sub12_sub1_50_
	    = aClass269_10085.method4909("EyePos", 1342987708);
	Class534_Sub12_Sub1 class534_sub12_sub1_51_
	    = aClass269_10085.method4909("SpecularExponent", 33912837);
	Class534_Sub12_Sub1 class534_sub12_sub1_52_
	    = aClass269_10085.method4909("WorldMatrix", 1720543035);
	aClass278Array10105[0]
	    = aClass269_10085.method4914("Unlit", -1751029139);
	aClass278Array10105[1]
	    = aClass269_10085.method4914("Unlit_IgnoreAlpha", -1579816165);
	aClass278Array10105[17]
	    = aClass269_10085.method4914("UnderwaterGround", -1970660645);
	aClass278Array10105[18]
	    = aClass269_10085.method4914("UnderwaterGroundSpecular",
					 -1553705558);
	for (int i = 0; i <= 4; i++) {
	    aClass278Array10105[2 + i]
		= aClass269_10085.method4914(new StringBuilder().append
						 ("Standard_").append
						 (i).append
						 ("PointLights").toString(),
					     -1553765823);
	    aClass278Array10105[7 + i]
		= aClass269_10085.method4914(new StringBuilder().append
						 ("Specular_").append
						 (i).append
						 ("PointLights").toString(),
					     -1967251837);
	    aClass278Array10105[12 + i]
		= aClass269_10085.method4914(new StringBuilder().append
						 ("EnvironmentalMapping_")
						 .append
						 (i).append
						 ("PointLights").toString(),
					     -1956032432);
	}
	for (int i = 0; i < 19; i++) {
	    int i_53_ = aClass269_10085.method4917(aClass278Array10105[i],
						   (byte) -94);
	    anIntArrayArray10100[i][2]
		= class534_sub12_sub1.method18240(i_53_);
	    anIntArrayArray10100[i][3]
		= class534_sub12_sub1_37_.method18240(i_53_);
	    anIntArrayArray10100[i][1]
		= class534_sub12_sub1_38_.method18240(i_53_);
	    anIntArrayArray10100[i][0]
		= class534_sub12_sub1_39_.method18240(i_53_);
	    anIntArrayArray10100[i][4]
		= class534_sub12_sub1_40_.method18240(i_53_);
	    anIntArrayArray10100[i][5]
		= class534_sub12_sub1_41_.method18240(i_53_);
	    anIntArrayArray10100[i][7]
		= class534_sub12_sub1_42_.method18240(i_53_);
	    anIntArrayArray10100[i][8]
		= class534_sub12_sub1_43_.method18240(i_53_);
	    anIntArrayArray10100[i][9]
		= class534_sub12_sub1_44_.method18240(i_53_);
	    anIntArrayArray10100[i][10]
		= class534_sub12_sub1_45_.method18240(i_53_);
	    anIntArrayArray10100[i][11]
		= class534_sub12_sub1_46_.method18240(i_53_);
	    anIntArrayArray10100[i][12]
		= class534_sub12_sub1_47_.method18240(i_53_);
	    anIntArrayArray10100[i][13]
		= class534_sub12_sub1_48_.method18240(i_53_);
	    anIntArrayArray10100[i][14]
		= class534_sub12_sub1_49_.method18240(i_53_);
	    anIntArrayArray10100[i][6]
		= class534_sub12_sub1_50_.method18240(i_53_);
	    anIntArrayArray10100[i][15]
		= class534_sub12_sub1_52_.method18240(i_53_);
	    anIntArrayArray10100[i][16]
		= class534_sub12_sub1_51_.method18240(i_53_);
	}
	aClass269_10085.method4919(aClass278Array10105[2]);
	return true;
    }
    
    public static Class534_Sub29 method15700(int i) {
	if (Class554_Sub1.aClass700_7413 == null
	    || null == Class554_Sub1.aClass710_10688)
	    return null;
	for (Class534_Sub29 class534_sub29
		 = (Class534_Sub29) Class554_Sub1.aClass710_10688.next();
	     class534_sub29 != null;
	     class534_sub29
		 = (Class534_Sub29) Class554_Sub1.aClass710_10688.next()) {
	    Class272 class272
		= ((Class272)
		   Class554_Sub1.aClass44_Sub9_7349.method91(((class534_sub29
							       .anInt10652)
							      * 1592054281),
							     -1464069076));
	    if (class272 != null && class272.aBool2971
		&& class272.method5063(Class554_Sub1.anInterface18_7352,
				       Class554_Sub1.anInterface20_7351,
				       (short) 29667))
		return class534_sub29;
	}
	return null;
    }
    
    public static int method15701(int i) {
	return Class274.anInt3035 * 304107793 - 1;
    }
    
    static Class534_Sub40 method15702(byte i) {
	Class534_Sub40 class534_sub40 = new Class534_Sub40(518);
	Class65.anIntArray668 = new int[4];
	Class65.anIntArray668[0] = (int) (Math.random() * 9.9999999E7);
	Class65.anIntArray668[1] = (int) (Math.random() * 9.9999999E7);
	Class65.anIntArray668[2]
	    = (int) (-3197788566897510349L * Class437.aLong4860 >> 32);
	Class65.anIntArray668[3]
	    = (int) (Class437.aLong4860 * -3197788566897510349L
		     & 0xffffffffffffffffL);
	class534_sub40.method16506(10, 1843586277);
	class534_sub40.method16510(Class65.anIntArray668[0], -1491787754);
	class534_sub40.method16510(Class65.anIntArray668[1], -1724035587);
	class534_sub40.method16510(Class65.anIntArray668[2], -1552609164);
	class534_sub40.method16510(Class65.anIntArray668[3], -486839400);
	return class534_sub40;
    }
}
