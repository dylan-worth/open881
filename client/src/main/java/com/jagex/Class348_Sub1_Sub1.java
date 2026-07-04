/* Class348_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class348_Sub1_Sub1 extends Class348_Sub1
{
    public Class433 aClass433_11437 = new Class433();
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_11438;
    Class278 aClass278_11439;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_11440;
    Class278 aClass278_11441;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_11442;
    public int anInt11443;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_11444;
    Class340 aClass340_11445;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_11446;
    float[] aFloatArray11447;
    public Class433 aClass433_11448 = new Class433();
    float[] aFloatArray11449;
    float aFloat11450;
    public int anInt11451;
    public int anInt11452;
    public int anInt11453;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_11454;
    
    public Class348_Sub1_Sub1
	(Class185_Sub1 class185_sub1, Class340 class340)
	throws Exception_Sub4 {
	super(class185_sub1);
	aFloatArray11447 = new float[4];
	aFloatArray11449 = new float[4];
	aClass340_11445 = class340;
	if (aClass340_11445.method5938() && class185_sub1.method14653())
	    method15825("Waterfall");
    }
    
    boolean method15815() throws Exception_Sub4 {
	aClass534_Sub12_Sub1_11444
	    = aClass269_10205.method4909("WorldMatrix", 1036979033);
	aClass534_Sub12_Sub1_11442
	    = aClass269_10205.method4909("WVPMatrix", 894192799);
	aClass534_Sub12_Sub1_11446
	    = aClass269_10205.method4909("UGenerationPlane", 370965522);
	aClass534_Sub12_Sub1_11438
	    = aClass269_10205.method4909("VGenerationPlane", 1882788110);
	aClass534_Sub12_Sub1_11454
	    = aClass269_10205.method4909("Time", 1762184281);
	aClass534_Sub12_Sub1_11440
	    = aClass269_10205.method4909("billowSampler3D", 1711697472);
	if (aClass340_11445.aBool3544) {
	    aClass278_11439
		= aClass269_10205.method4914("Waterfall3D", -1383203897);
	    aClass269_10205.method4919(aClass278_11439);
	} else {
	    aClass278_11441
		= aClass269_10205.method4914("Waterfall2D", -1715539068);
	    aClass269_10205.method4919(aClass278_11441);
	}
	return true;
    }
    
    public void method17974() {
	if (aClass340_11445.aBool3544)
	    aClass269_10205.method4919(aClass278_11439);
	else
	    aClass269_10205.method4919(aClass278_11441);
	aClass269_10205.method4913();
	if (aClass340_11445.aBool3544)
	    aClass269_10205.method4933(aClass534_Sub12_Sub1_11440, 0,
				       aClass340_11445.anInterface35_3540,
				       -1476171790);
	aClass269_10205.method4932(aClass534_Sub12_Sub1_11444, aClass433_11448,
				   1693988741);
	aClass269_10205.method4932(aClass534_Sub12_Sub1_11442, aClass433_11437,
				   -29652132);
	aClass269_10205.method4937(aClass534_Sub12_Sub1_11446,
				   new Class441(aFloatArray11447[0],
						aFloatArray11447[1],
						aFloatArray11447[2],
						aFloatArray11447[3]),
				   -1324505255);
	aClass269_10205.method4937(aClass534_Sub12_Sub1_11438,
				   new Class441(aFloatArray11449[0],
						aFloatArray11449[1],
						aFloatArray11449[2],
						aFloatArray11449[3]),
				   -876236762);
	aClass269_10205.method4937(aClass534_Sub12_Sub1_11454,
				   new Class441(aFloat11450, 0.0F, 0.0F, 0.0F),
				   371044228);
	aClass185_Sub1_3591.method14710(Class374.aClass374_3898,
					anInt11451 * 990343747,
					anInt11452 * -1475260219,
					-1838424893 * anInt11453,
					anInt11443 * -481580789);
    }
    
    public void method17975(int i, int i_0_, byte i_1_) {
	float f = (float) ((i & 0x3) + 1) * -5.0E-4F;
	float f_2_ = 5.0E-4F * (float) (1 + (i >> 3 & 0x3));
	float f_3_ = 0 == (i & 0x40) ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = (i & 0x80) != 0;
	if (bool) {
	    aFloatArray11447[0] = f_3_;
	    aFloatArray11447[1] = 0.0F;
	    aFloatArray11447[2] = 0.0F;
	    aFloatArray11447[3] = 0.0F;
	} else {
	    aFloatArray11447[0] = 0.0F;
	    aFloatArray11447[1] = 0.0F;
	    aFloatArray11447[2] = f_3_;
	    aFloatArray11447[3] = 0.0F;
	}
	aFloatArray11449[0] = 0.0F;
	aFloatArray11449[1] = f_3_;
	aFloatArray11449[2] = 0.0F;
	aFloatArray11449[3] = (float) aClass185_Sub1_3591.anInt9264 * f % 1.0F;
	if (!aClass340_11445.aBool3544) {
	    int i_4_
		= (int) (16.0F
			 * (f_2_ * (float) aClass185_Sub1_3591.anInt9264));
	    aClass185_Sub1_3591.method14669(aClass340_11445
					    .anInterface38Array3549
					    [i_4_ % 16]);
	} else
	    aFloat11450
		= (float) ((double) f_2_
			   * (double) aClass185_Sub1_3591.anInt9264 % 1.0);
    }
    
    public void method17976(int i) {
	if (aClass340_11445.aBool3544)
	    aClass269_10205.method4919(aClass278_11439);
	else
	    aClass269_10205.method4919(aClass278_11441);
	aClass269_10205.method4913();
	if (aClass340_11445.aBool3544)
	    aClass269_10205.method4933(aClass534_Sub12_Sub1_11440, 0,
				       aClass340_11445.anInterface35_3540,
				       1912553293);
	aClass269_10205.method4932(aClass534_Sub12_Sub1_11444, aClass433_11448,
				   -1153529655);
	aClass269_10205.method4932(aClass534_Sub12_Sub1_11442, aClass433_11437,
				   1415790096);
	aClass269_10205.method4937(aClass534_Sub12_Sub1_11446,
				   new Class441(aFloatArray11447[0],
						aFloatArray11447[1],
						aFloatArray11447[2],
						aFloatArray11447[3]),
				   188326047);
	aClass269_10205.method4937(aClass534_Sub12_Sub1_11438,
				   new Class441(aFloatArray11449[0],
						aFloatArray11449[1],
						aFloatArray11449[2],
						aFloatArray11449[3]),
				   -869645637);
	aClass269_10205.method4937(aClass534_Sub12_Sub1_11454,
				   new Class441(aFloat11450, 0.0F, 0.0F, 0.0F),
				   -785650391);
	aClass185_Sub1_3591.method14710(Class374.aClass374_3898,
					anInt11451 * 990343747,
					anInt11452 * -1475260219,
					-1838424893 * anInt11453,
					anInt11443 * -481580789);
    }
    
    public void method17977(int i, int i_5_) {
	float f = (float) ((i & 0x3) + 1) * -5.0E-4F;
	float f_6_ = 5.0E-4F * (float) (1 + (i >> 3 & 0x3));
	float f_7_ = 0 == (i & 0x40) ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = (i & 0x80) != 0;
	if (bool) {
	    aFloatArray11447[0] = f_7_;
	    aFloatArray11447[1] = 0.0F;
	    aFloatArray11447[2] = 0.0F;
	    aFloatArray11447[3] = 0.0F;
	} else {
	    aFloatArray11447[0] = 0.0F;
	    aFloatArray11447[1] = 0.0F;
	    aFloatArray11447[2] = f_7_;
	    aFloatArray11447[3] = 0.0F;
	}
	aFloatArray11449[0] = 0.0F;
	aFloatArray11449[1] = f_7_;
	aFloatArray11449[2] = 0.0F;
	aFloatArray11449[3] = (float) aClass185_Sub1_3591.anInt9264 * f % 1.0F;
	if (!aClass340_11445.aBool3544) {
	    int i_8_
		= (int) (16.0F
			 * (f_6_ * (float) aClass185_Sub1_3591.anInt9264));
	    aClass185_Sub1_3591.method14669(aClass340_11445
					    .anInterface38Array3549
					    [i_8_ % 16]);
	} else
	    aFloat11450
		= (float) ((double) f_6_
			   * (double) aClass185_Sub1_3591.anInt9264 % 1.0);
    }
    
    public void method17978(int i, int i_9_) {
	float f = (float) ((i & 0x3) + 1) * -5.0E-4F;
	float f_10_ = 5.0E-4F * (float) (1 + (i >> 3 & 0x3));
	float f_11_ = 0 == (i & 0x40) ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = (i & 0x80) != 0;
	if (bool) {
	    aFloatArray11447[0] = f_11_;
	    aFloatArray11447[1] = 0.0F;
	    aFloatArray11447[2] = 0.0F;
	    aFloatArray11447[3] = 0.0F;
	} else {
	    aFloatArray11447[0] = 0.0F;
	    aFloatArray11447[1] = 0.0F;
	    aFloatArray11447[2] = f_11_;
	    aFloatArray11447[3] = 0.0F;
	}
	aFloatArray11449[0] = 0.0F;
	aFloatArray11449[1] = f_11_;
	aFloatArray11449[2] = 0.0F;
	aFloatArray11449[3] = (float) aClass185_Sub1_3591.anInt9264 * f % 1.0F;
	if (!aClass340_11445.aBool3544) {
	    int i_12_
		= (int) (16.0F
			 * (f_10_ * (float) aClass185_Sub1_3591.anInt9264));
	    aClass185_Sub1_3591.method14669(aClass340_11445
					    .anInterface38Array3549
					    [i_12_ % 16]);
	} else
	    aFloat11450
		= (float) ((double) f_10_
			   * (double) aClass185_Sub1_3591.anInt9264 % 1.0);
    }
    
    boolean method15818() throws Exception_Sub4 {
	aClass534_Sub12_Sub1_11444
	    = aClass269_10205.method4909("WorldMatrix", 794598435);
	aClass534_Sub12_Sub1_11442
	    = aClass269_10205.method4909("WVPMatrix", 1880891524);
	aClass534_Sub12_Sub1_11446
	    = aClass269_10205.method4909("UGenerationPlane", 2012901652);
	aClass534_Sub12_Sub1_11438
	    = aClass269_10205.method4909("VGenerationPlane", 1308912385);
	aClass534_Sub12_Sub1_11454
	    = aClass269_10205.method4909("Time", 128646485);
	aClass534_Sub12_Sub1_11440
	    = aClass269_10205.method4909("billowSampler3D", 1516930762);
	if (aClass340_11445.aBool3544) {
	    aClass278_11439
		= aClass269_10205.method4914("Waterfall3D", -2081005330);
	    aClass269_10205.method4919(aClass278_11439);
	} else {
	    aClass278_11441
		= aClass269_10205.method4914("Waterfall2D", -1707514852);
	    aClass269_10205.method4919(aClass278_11441);
	}
	return true;
    }
    
    public void method17979() {
	if (aClass340_11445.aBool3544)
	    aClass269_10205.method4919(aClass278_11439);
	else
	    aClass269_10205.method4919(aClass278_11441);
	aClass269_10205.method4913();
	if (aClass340_11445.aBool3544)
	    aClass269_10205.method4933(aClass534_Sub12_Sub1_11440, 0,
				       aClass340_11445.anInterface35_3540,
				       -73407316);
	aClass269_10205.method4932(aClass534_Sub12_Sub1_11444, aClass433_11448,
				   -93311258);
	aClass269_10205.method4932(aClass534_Sub12_Sub1_11442, aClass433_11437,
				   296059830);
	aClass269_10205.method4937(aClass534_Sub12_Sub1_11446,
				   new Class441(aFloatArray11447[0],
						aFloatArray11447[1],
						aFloatArray11447[2],
						aFloatArray11447[3]),
				   -1261769423);
	aClass269_10205.method4937(aClass534_Sub12_Sub1_11438,
				   new Class441(aFloatArray11449[0],
						aFloatArray11449[1],
						aFloatArray11449[2],
						aFloatArray11449[3]),
				   -2146366562);
	aClass269_10205.method4937(aClass534_Sub12_Sub1_11454,
				   new Class441(aFloat11450, 0.0F, 0.0F, 0.0F),
				   -1161757258);
	aClass185_Sub1_3591.method14710(Class374.aClass374_3898,
					anInt11451 * 990343747,
					anInt11452 * -1475260219,
					-1838424893 * anInt11453,
					anInt11443 * -481580789);
    }
    
    static final void method17980(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	class669.anInt8600 -= -1204971666;
	byte[] is = null;
	byte[] is_13_ = null;
	int i_14_;
	for (i_14_ = 0;
	     i_14_ < 10 && (class669.anIntArray8595
			    [2088438307 * class669.anInt8600 + i_14_]) >= 0;
	     i_14_ += 2) {
	    /* empty */
	}
	if (i_14_ > 0) {
	    is = new byte[i_14_ / 2];
	    is_13_ = new byte[i_14_ / 2];
	    for (i_14_ -= 2; i_14_ >= 0; i_14_ -= 2) {
		is[i_14_ / 2]
		    = (byte) (class669.anIntArray8595
			      [class669.anInt8600 * 2088438307 + i_14_]);
		is_13_[i_14_ / 2]
		    = (byte) (class669.anIntArray8595
			      [class669.anInt8600 * 2088438307 + i_14_ + 1]);
	    }
	}
	Class634.method10531(class247, is, is_13_, class669, (byte) -29);
    }
}
