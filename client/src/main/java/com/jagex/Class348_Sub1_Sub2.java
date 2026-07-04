/* Class348_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class348_Sub1_Sub2 extends Class348_Sub1
{
    public Class438 aClass438_11459;
    Class340 aClass340_11460;
    public int anInt11461;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_11462;
    boolean aBool11463;
    public Class433 aClass433_11464 = new Class433();
    public Class438 aClass438_11465;
    public Class433 aClass433_11466 = new Class433();
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_11467;
    public Class438 aClass438_11468 = new Class438();
    Class441 aClass441_11469;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_11470;
    Class441 aClass441_11471 = new Class441();
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_11472;
    public int anInt11473;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_11474;
    Class441 aClass441_11475;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_11476;
    public Class441 aClass441_11477;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_11478;
    boolean aBool11479;
    public Class441 aClass441_11480;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_11481;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_11482;
    public int anInt11483;
    public int anInt11484;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_11485;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_11486;
    public int anInt11487;
    float aFloat11488;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_11489;
    Class278 aClass278_11490;
    
    void method15810(boolean bool) {
	float f
	    = 1.0F + ((1.0F - Math.abs(aClass185_Sub1_3591.aFloatArray9197[1]))
		      * 2.0F);
	float f_0_ = aClass185_Sub1_3591.aFloat9206;
	aClass185_Sub1_3591.aFloat9206 *= f;
	super.method15810(bool);
	aClass185_Sub1_3591.aFloat9206 = f_0_;
    }
    
    boolean method15815() throws Exception_Sub4 {
	if (!aClass340_11460.method5937())
	    return false;
	aClass534_Sub12_Sub1_11470
	    = aClass269_10205.method4909("NormalSampler", 407827163);
	aClass534_Sub12_Sub1_11462
	    = aClass269_10205.method4909("EnvMapSampler", 954377131);
	aClass534_Sub12_Sub1_11476
	    = aClass269_10205.method4909("WVPMatrix", 565625046);
	aClass534_Sub12_Sub1_11489
	    = aClass269_10205.method4909("TexCoordMatrix", 332372995);
	aClass534_Sub12_Sub1_11486
	    = aClass269_10205.method4909("EyePosAndTime", 615035406);
	aClass534_Sub12_Sub1_11467
	    = aClass269_10205.method4909("SunDirectionAndExponent", 235118434);
	aClass534_Sub12_Sub1_11472
	    = aClass269_10205.method4909("SunColourAndWaveExponent",
					 1975754861);
	aClass534_Sub12_Sub1_11485
	    = (aClass269_10205.method4909
	       ("WaveIntensityAndBreakWaterDepthAndOffset", 861470600));
	aClass534_Sub12_Sub1_11481
	    = aClass269_10205.method4909("HeightFogPlane", 1904054658);
	aClass534_Sub12_Sub1_11478
	    = aClass269_10205.method4909("HeightFogColour", 611776047);
	aClass534_Sub12_Sub1_11474
	    = aClass269_10205.method4909("DistanceFogPlane", 1858620455);
	aClass534_Sub12_Sub1_11482
	    = aClass269_10205.method4909("DistanceFogColour", 1187093775);
	aClass278_11490
	    = aClass269_10205.method4914((aBool11479 ? "EnvMappedSea"
					  : "EnvMappedWater"),
					 -1588888127);
	aClass269_10205.method4919(aClass278_11490);
	return true;
    }
    
    void method17983() {
	aFloat11488 = 2.4414062E-4F;
	int i = 256;
	float f = 0.3F;
	float f_1_ = 0.4F;
	float f_2_ = 0.1F;
	int i_3_ = 5;
	aClass433_11466.method6952(aFloat11488, aFloat11488, aFloat11488,
				   aFloat11488);
	aClass441_11471.method7105(-aClass185_Sub1_3591.aFloatArray9197[0],
				   -aClass185_Sub1_3591.aFloatArray9197[1],
				   -aClass185_Sub1_3591.aFloatArray9197[2],
				   32.0F);
	aClass441_11469.method7105(aClass185_Sub1_3591.aFloat9159,
				   aClass185_Sub1_3591.aFloat9292,
				   aClass185_Sub1_3591.aFloat9163,
				   (float) i_3_);
	aClass441_11475.method7105(f_2_, f_1_, (float) i, f);
    }
    
    void method15806(Class433 class433) {
	Class433 class433_4_ = new Class433();
	class433_4_.method6952(aFloat11488, aFloat11488, 1.0F, 1.0F);
	class433_4_.method6844(class433, class433_4_);
	super.method15806(class433_4_);
    }
    
    boolean method15818() throws Exception_Sub4 {
	if (!aClass340_11460.method5937())
	    return false;
	aClass534_Sub12_Sub1_11470
	    = aClass269_10205.method4909("NormalSampler", 1150785583);
	aClass534_Sub12_Sub1_11462
	    = aClass269_10205.method4909("EnvMapSampler", 1478091642);
	aClass534_Sub12_Sub1_11476
	    = aClass269_10205.method4909("WVPMatrix", 785934052);
	aClass534_Sub12_Sub1_11489
	    = aClass269_10205.method4909("TexCoordMatrix", 1649772678);
	aClass534_Sub12_Sub1_11486
	    = aClass269_10205.method4909("EyePosAndTime", 870540478);
	aClass534_Sub12_Sub1_11467
	    = aClass269_10205.method4909("SunDirectionAndExponent",
					 2084186475);
	aClass534_Sub12_Sub1_11472
	    = aClass269_10205.method4909("SunColourAndWaveExponent",
					 241863797);
	aClass534_Sub12_Sub1_11485
	    = (aClass269_10205.method4909
	       ("WaveIntensityAndBreakWaterDepthAndOffset", 396435401));
	aClass534_Sub12_Sub1_11481
	    = aClass269_10205.method4909("HeightFogPlane", 460400628);
	aClass534_Sub12_Sub1_11478
	    = aClass269_10205.method4909("HeightFogColour", 2120938839);
	aClass534_Sub12_Sub1_11474
	    = aClass269_10205.method4909("DistanceFogPlane", 1241929650);
	aClass534_Sub12_Sub1_11482
	    = aClass269_10205.method4909("DistanceFogColour", 700684593);
	aClass278_11490
	    = aClass269_10205.method4914((aBool11479 ? "EnvMappedSea"
					  : "EnvMappedWater"),
					 -1410105330);
	aClass269_10205.method4919(aClass278_11490);
	return true;
    }
    
    public void method17984(int i) {
	method17993(-1541570688);
	aClass269_10205.method4919(aClass278_11490);
	aClass269_10205.method4913();
	aClass269_10205.method4933(aClass534_Sub12_Sub1_11470, 0,
				   aClass340_11460.anInterface35_3541,
				   611383295);
	aClass269_10205.method4933(aClass534_Sub12_Sub1_11462, 1,
				   aClass185_Sub1_3591.method14616(),
				   1470295167);
	aClass269_10205.method4932(aClass534_Sub12_Sub1_11476, aClass433_11464,
				   -1610335640);
	aClass269_10205.method4931(aClass534_Sub12_Sub1_11489, aClass433_11466,
				   1273230178);
	int i_5_ = 1 << (-1710853321 * anInt11461 & 0x3);
	aClass269_10205.method4926(aClass534_Sub12_Sub1_11486,
				   aClass438_11468.aFloat4864,
				   aClass438_11468.aFloat4863,
				   aClass438_11468.aFloat4865,
				   (float) (i_5_
					    * aClass185_Sub1_3591.anInt9264
					    % 40000) / 40000.0F,
				   -1341792006);
	aClass269_10205.method4937(aClass534_Sub12_Sub1_11467, aClass441_11471,
				   -693997788);
	aClass269_10205.method4937(aClass534_Sub12_Sub1_11472, aClass441_11469,
				   -1222609730);
	aClass269_10205.method4937(aClass534_Sub12_Sub1_11485, aClass441_11475,
				   -1556109913);
	aClass269_10205.method4937(aClass534_Sub12_Sub1_11481, aClass441_11477,
				   729669589);
	aClass269_10205.method4927(aClass534_Sub12_Sub1_11478, aClass438_11459,
				   226957979);
	aClass269_10205.method4937(aClass534_Sub12_Sub1_11474, aClass441_11480,
				   -326815939);
	aClass269_10205.method4927(aClass534_Sub12_Sub1_11482, aClass438_11465,
				   226957979);
	aClass185_Sub1_3591.method14710(Class374.aClass374_3898,
					anInt11484 * 214398075,
					-1784638669 * anInt11483,
					-1562947369 * anInt11473,
					660205177 * anInt11487);
    }
    
    public Class348_Sub1_Sub2(Class185_Sub1 class185_sub1, Class340 class340,
			      boolean bool) throws Exception_Sub4 {
	super(class185_sub1);
	aClass441_11469 = new Class441();
	aClass441_11475 = new Class441();
	aClass441_11477 = new Class441();
	aClass438_11459 = new Class438();
	aClass441_11480 = new Class441();
	aClass438_11465 = new Class438();
	aFloat11488 = 0.0F;
	new Class433();
	aClass340_11460 = class340;
	aBool11479 = bool;
	if (class185_sub1.method14653() && class185_sub1.method14747())
	    aBool11463 = method15825("EnvMappedWater");
	else
	    aBool11463 = false;
    }
    
    void method17985() {
	aFloat11488 = 2.4414062E-4F;
	int i = 256;
	float f = 0.3F;
	float f_6_ = 0.4F;
	float f_7_ = 0.1F;
	int i_8_ = 5;
	aClass433_11466.method6952(aFloat11488, aFloat11488, aFloat11488,
				   aFloat11488);
	aClass441_11471.method7105(-aClass185_Sub1_3591.aFloatArray9197[0],
				   -aClass185_Sub1_3591.aFloatArray9197[1],
				   -aClass185_Sub1_3591.aFloatArray9197[2],
				   32.0F);
	aClass441_11469.method7105(aClass185_Sub1_3591.aFloat9159,
				   aClass185_Sub1_3591.aFloat9292,
				   aClass185_Sub1_3591.aFloat9163,
				   (float) i_8_);
	aClass441_11475.method7105(f_7_, f_6_, (float) i, f);
    }
    
    void method15821(Class433 class433) {
	Class433 class433_9_ = new Class433();
	class433_9_.method6952(aFloat11488, aFloat11488, 1.0F, 1.0F);
	class433_9_.method6844(class433, class433_9_);
	super.method15806(class433_9_);
    }
    
    public boolean method17986(byte i) {
	return aBool11463;
    }
    
    void method15823(Class433 class433) {
	Class433 class433_10_ = new Class433();
	class433_10_.method6952(aFloat11488, aFloat11488, 1.0F, 1.0F);
	class433_10_.method6844(class433, class433_10_);
	super.method15806(class433_10_);
    }
    
    void method15832(boolean bool) {
	float f
	    = 1.0F + ((1.0F - Math.abs(aClass185_Sub1_3591.aFloatArray9197[1]))
		      * 2.0F);
	float f_11_ = aClass185_Sub1_3591.aFloat9206;
	aClass185_Sub1_3591.aFloat9206 *= f;
	super.method15810(bool);
	aClass185_Sub1_3591.aFloat9206 = f_11_;
    }
    
    public boolean method17987() {
	return aBool11463;
    }
    
    public boolean method17988() {
	return aBool11463;
    }
    
    public boolean method17989() {
	return aBool11463;
    }
    
    public void method17990() {
	method17993(-2008719464);
	aClass269_10205.method4919(aClass278_11490);
	aClass269_10205.method4913();
	aClass269_10205.method4933(aClass534_Sub12_Sub1_11470, 0,
				   aClass340_11460.anInterface35_3541,
				   1787548241);
	aClass269_10205.method4933(aClass534_Sub12_Sub1_11462, 1,
				   aClass185_Sub1_3591.method14616(),
				   -1450083242);
	aClass269_10205.method4932(aClass534_Sub12_Sub1_11476, aClass433_11464,
				   1386377325);
	aClass269_10205.method4931(aClass534_Sub12_Sub1_11489, aClass433_11466,
				   1500458190);
	int i = 1 << (-1710853321 * anInt11461 & 0x3);
	aClass269_10205.method4926(aClass534_Sub12_Sub1_11486,
				   aClass438_11468.aFloat4864,
				   aClass438_11468.aFloat4863,
				   aClass438_11468.aFloat4865,
				   (float) (i * aClass185_Sub1_3591.anInt9264
					    % 40000) / 40000.0F,
				   -678539240);
	aClass269_10205.method4937(aClass534_Sub12_Sub1_11467, aClass441_11471,
				   -656006082);
	aClass269_10205.method4937(aClass534_Sub12_Sub1_11472, aClass441_11469,
				   -1102673490);
	aClass269_10205.method4937(aClass534_Sub12_Sub1_11485, aClass441_11475,
				   -1521451123);
	aClass269_10205.method4937(aClass534_Sub12_Sub1_11481, aClass441_11477,
				   -1909401975);
	aClass269_10205.method4927(aClass534_Sub12_Sub1_11478, aClass438_11459,
				   226957979);
	aClass269_10205.method4937(aClass534_Sub12_Sub1_11474, aClass441_11480,
				   387125290);
	aClass269_10205.method4927(aClass534_Sub12_Sub1_11482, aClass438_11465,
				   226957979);
	aClass185_Sub1_3591.method14710(Class374.aClass374_3898,
					anInt11484 * 214398075,
					-1784638669 * anInt11483,
					-1562947369 * anInt11473,
					660205177 * anInt11487);
    }
    
    void method17991() {
	aFloat11488 = 2.4414062E-4F;
	int i = 256;
	float f = 0.3F;
	float f_12_ = 0.4F;
	float f_13_ = 0.1F;
	int i_14_ = 5;
	aClass433_11466.method6952(aFloat11488, aFloat11488, aFloat11488,
				   aFloat11488);
	aClass441_11471.method7105(-aClass185_Sub1_3591.aFloatArray9197[0],
				   -aClass185_Sub1_3591.aFloatArray9197[1],
				   -aClass185_Sub1_3591.aFloatArray9197[2],
				   32.0F);
	aClass441_11469.method7105(aClass185_Sub1_3591.aFloat9159,
				   aClass185_Sub1_3591.aFloat9292,
				   aClass185_Sub1_3591.aFloat9163,
				   (float) i_14_);
	aClass441_11475.method7105(f_13_, f_12_, (float) i, f);
    }
    
    void method15830(Class433 class433) {
	Class433 class433_15_ = new Class433();
	class433_15_.method6952(aFloat11488, aFloat11488, 1.0F, 1.0F);
	class433_15_.method6844(class433, class433_15_);
	super.method15806(class433_15_);
    }
    
    void method17992() {
	aFloat11488 = 2.4414062E-4F;
	int i = 256;
	float f = 0.3F;
	float f_16_ = 0.4F;
	float f_17_ = 0.1F;
	int i_18_ = 5;
	aClass433_11466.method6952(aFloat11488, aFloat11488, aFloat11488,
				   aFloat11488);
	aClass441_11471.method7105(-aClass185_Sub1_3591.aFloatArray9197[0],
				   -aClass185_Sub1_3591.aFloatArray9197[1],
				   -aClass185_Sub1_3591.aFloatArray9197[2],
				   32.0F);
	aClass441_11469.method7105(aClass185_Sub1_3591.aFloat9159,
				   aClass185_Sub1_3591.aFloat9292,
				   aClass185_Sub1_3591.aFloat9163,
				   (float) i_18_);
	aClass441_11475.method7105(f_17_, f_16_, (float) i, f);
    }
    
    void method17993(int i) {
	aFloat11488 = 2.4414062E-4F;
	int i_19_ = 256;
	float f = 0.3F;
	float f_20_ = 0.4F;
	float f_21_ = 0.1F;
	int i_22_ = 5;
	aClass433_11466.method6952(aFloat11488, aFloat11488, aFloat11488,
				   aFloat11488);
	aClass441_11471.method7105(-aClass185_Sub1_3591.aFloatArray9197[0],
				   -aClass185_Sub1_3591.aFloatArray9197[1],
				   -aClass185_Sub1_3591.aFloatArray9197[2],
				   32.0F);
	aClass441_11469.method7105(aClass185_Sub1_3591.aFloat9159,
				   aClass185_Sub1_3591.aFloat9292,
				   aClass185_Sub1_3591.aFloat9163,
				   (float) i_22_);
	aClass441_11475.method7105(f_21_, f_20_, (float) i_19_, f);
    }
    
    void method17994() {
	aFloat11488 = 2.4414062E-4F;
	int i = 256;
	float f = 0.3F;
	float f_23_ = 0.4F;
	float f_24_ = 0.1F;
	int i_25_ = 5;
	aClass433_11466.method6952(aFloat11488, aFloat11488, aFloat11488,
				   aFloat11488);
	aClass441_11471.method7105(-aClass185_Sub1_3591.aFloatArray9197[0],
				   -aClass185_Sub1_3591.aFloatArray9197[1],
				   -aClass185_Sub1_3591.aFloatArray9197[2],
				   32.0F);
	aClass441_11469.method7105(aClass185_Sub1_3591.aFloat9159,
				   aClass185_Sub1_3591.aFloat9292,
				   aClass185_Sub1_3591.aFloat9163,
				   (float) i_25_);
	aClass441_11475.method7105(f_24_, f_23_, (float) i, f);
    }
    
    public static Class502 method17995(int i) {
	Class502_Sub1 class502_sub1;
	try {
	    class502_sub1 = new Class502_Sub1();
	} catch (Throwable throwable) {
	    return new Class502_Sub2();
	}
	return class502_sub1;
    }
}
