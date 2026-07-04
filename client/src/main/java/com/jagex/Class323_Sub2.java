/* Class323_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class323_Sub2 extends Class323
{
    Class278 aClass278_10065;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10066;
    Class433 aClass433_10067 = new Class433();
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10068;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10069;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10070;
    Class269 aClass269_10071;
    Class278 aClass278_10072;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10073;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10074;
    Class278 aClass278_10075;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10076;
    
    void method15686(boolean bool, boolean bool_0_) {
	aClass269_10071.method4933(aClass534_Sub12_Sub1_10076, 0,
				   anInterface38_3426, 900540491);
	aClass269_10071.method4932(aClass534_Sub12_Sub1_10068, aClass433_10067,
				   -659554346);
	aClass269_10071.method4931(aClass534_Sub12_Sub1_10069, aClass433_3423,
				   500360383);
	aClass269_10071.method4930(aClass534_Sub12_Sub1_10073, anInt3427,
				   2051899264);
	if (bool) {
	    if (bool_0_)
		aClass269_10071.method4926(aClass534_Sub12_Sub1_10074,
					   aClass441_3425.aFloat4873,
					   aClass441_3425.aFloat4874,
					   aClass441_3425.aFloat4876,
					   aClass441_3425.aFloat4875,
					   10991776);
	    else
		aClass269_10071.method4923(aClass534_Sub12_Sub1_10070,
					   Math.min(Math.max(aFloat3421, 0.0F),
						    1.0F),
					   (byte) -63);
	    aClass269_10071.method4925(aClass534_Sub12_Sub1_10066,
				       aClass438_3424.aFloat4864,
				       aClass438_3424.aFloat4863,
				       aClass438_3424.aFloat4865, 417479047);
	}
    }
    
    boolean method15687(int i) throws Exception_Sub4 {
	aClass269_10071 = aClass185_Sub1_3422.method14589("Particle");
	aClass534_Sub12_Sub1_10068
	    = aClass269_10071.method4909("WVPMatrix", 1937957066);
	aClass534_Sub12_Sub1_10076
	    = aClass269_10071.method4909("DiffuseSampler", 1124837482);
	aClass534_Sub12_Sub1_10069
	    = aClass269_10071.method4909("TexCoordMatrix", -52611813);
	aClass534_Sub12_Sub1_10074
	    = aClass269_10071.method4909("DistanceFogPlane", 343335510);
	aClass534_Sub12_Sub1_10066
	    = aClass269_10071.method4909("DistanceFogColour", 388881319);
	aClass534_Sub12_Sub1_10070
	    = aClass269_10071.method4909("DistanceFogAmount", 1779929457);
	aClass534_Sub12_Sub1_10073
	    = aClass269_10071.method4909("DiffuseColour", 1610000032);
	aClass278_10072 = aClass269_10071.method4914("NoFog", -1732086266);
	aClass278_10075
	    = aClass269_10071.method4914("ParticleFog", -1711846016);
	aClass278_10065
	    = aClass269_10071.method4914("BillboardFog", -1439565453);
	if (!aClass278_10072.method5182())
	    return false;
	if (!aClass278_10075.method5182())
	    return false;
	if (!aClass278_10065.method5182())
	    return false;
	return true;
    }
    
    public void method5784(Class433 class433) {
	aClass433_10067.method6842(class433);
	aClass433_10067.method6839(aClass185_Sub1_3422.aClass433_9164);
    }
    
    public void method5786(int i, boolean bool) {
	aClass269_10071.method4919(bool ? aClass278_10075 : aClass278_10072);
	aClass269_10071.method4913();
	method15688(bool, true, 1087971693);
	aClass185_Sub1_3422.method14710(Class374.aClass374_3898, 0, 4 * i, 0,
					i * 2);
    }
    
    public void method5785(boolean bool) {
	aClass269_10071.method4919(bool ? aClass278_10065 : aClass278_10072);
	aClass269_10071.method4913();
	method15688(bool, false, 1087971693);
	aClass185_Sub1_3422.method14706();
    }
    
    void method15688(boolean bool, boolean bool_1_, int i) {
	aClass269_10071.method4933(aClass534_Sub12_Sub1_10076, 0,
				   anInterface38_3426, 704884767);
	aClass269_10071.method4932(aClass534_Sub12_Sub1_10068, aClass433_10067,
				   -1292307598);
	aClass269_10071.method4931(aClass534_Sub12_Sub1_10069, aClass433_3423,
				   -629618098);
	aClass269_10071.method4930(aClass534_Sub12_Sub1_10073, anInt3427,
				   1650767037);
	if (bool) {
	    if (bool_1_)
		aClass269_10071.method4926(aClass534_Sub12_Sub1_10074,
					   aClass441_3425.aFloat4873,
					   aClass441_3425.aFloat4874,
					   aClass441_3425.aFloat4876,
					   aClass441_3425.aFloat4875,
					   -920165060);
	    else
		aClass269_10071.method4923(aClass534_Sub12_Sub1_10070,
					   Math.min(Math.max(aFloat3421, 0.0F),
						    1.0F),
					   (byte) 3);
	    aClass269_10071.method4925(aClass534_Sub12_Sub1_10066,
				       aClass438_3424.aFloat4864,
				       aClass438_3424.aFloat4863,
				       aClass438_3424.aFloat4865, 417479047);
	}
    }
    
    public Class323_Sub2(Class185_Sub1 class185_sub1) throws Exception_Sub4 {
	super(class185_sub1);
	method15687(2112691047);
    }
    
    public void method5782(Class433 class433) {
	aClass433_10067.method6842(class433);
	aClass433_10067.method6839(aClass185_Sub1_3422.aClass433_9164);
    }
    
    public void method5788(Class433 class433) {
	aClass433_10067.method6842(class433);
	aClass433_10067.method6839(aClass185_Sub1_3422.aClass433_9164);
    }
    
    public void method5789(int i, boolean bool) {
	aClass269_10071.method4919(bool ? aClass278_10075 : aClass278_10072);
	aClass269_10071.method4913();
	method15688(bool, true, 1087971693);
	aClass185_Sub1_3422.method14710(Class374.aClass374_3898, 0, 4 * i, 0,
					i * 2);
    }
    
    public void method5787(Class433 class433) {
	aClass433_10067.method6842(class433);
	aClass433_10067.method6839(aClass185_Sub1_3422.aClass433_9164);
    }
    
    boolean method15689() throws Exception_Sub4 {
	aClass269_10071 = aClass185_Sub1_3422.method14589("Particle");
	aClass534_Sub12_Sub1_10068
	    = aClass269_10071.method4909("WVPMatrix", 1251246666);
	aClass534_Sub12_Sub1_10076
	    = aClass269_10071.method4909("DiffuseSampler", 944521270);
	aClass534_Sub12_Sub1_10069
	    = aClass269_10071.method4909("TexCoordMatrix", 425585418);
	aClass534_Sub12_Sub1_10074
	    = aClass269_10071.method4909("DistanceFogPlane", 939879932);
	aClass534_Sub12_Sub1_10066
	    = aClass269_10071.method4909("DistanceFogColour", 1407005803);
	aClass534_Sub12_Sub1_10070
	    = aClass269_10071.method4909("DistanceFogAmount", 994005316);
	aClass534_Sub12_Sub1_10073
	    = aClass269_10071.method4909("DiffuseColour", 924902060);
	aClass278_10072 = aClass269_10071.method4914("NoFog", -1996094382);
	aClass278_10075
	    = aClass269_10071.method4914("ParticleFog", -2095195141);
	aClass278_10065
	    = aClass269_10071.method4914("BillboardFog", -1568061736);
	if (!aClass278_10072.method5182())
	    return false;
	if (!aClass278_10075.method5182())
	    return false;
	if (!aClass278_10065.method5182())
	    return false;
	return true;
    }
    
    public void method5791(boolean bool) {
	aClass269_10071.method4919(bool ? aClass278_10065 : aClass278_10072);
	aClass269_10071.method4913();
	method15688(bool, false, 1087971693);
	aClass185_Sub1_3422.method14706();
    }
    
    void method15690(boolean bool, boolean bool_2_) {
	aClass269_10071.method4933(aClass534_Sub12_Sub1_10076, 0,
				   anInterface38_3426, -385407131);
	aClass269_10071.method4932(aClass534_Sub12_Sub1_10068, aClass433_10067,
				   -725440122);
	aClass269_10071.method4931(aClass534_Sub12_Sub1_10069, aClass433_3423,
				   451599553);
	aClass269_10071.method4930(aClass534_Sub12_Sub1_10073, anInt3427,
				   -5391121);
	if (bool) {
	    if (bool_2_)
		aClass269_10071.method4926(aClass534_Sub12_Sub1_10074,
					   aClass441_3425.aFloat4873,
					   aClass441_3425.aFloat4874,
					   aClass441_3425.aFloat4876,
					   aClass441_3425.aFloat4875,
					   -1297576181);
	    else
		aClass269_10071.method4923(aClass534_Sub12_Sub1_10070,
					   Math.min(Math.max(aFloat3421, 0.0F),
						    1.0F),
					   (byte) -87);
	    aClass269_10071.method4925(aClass534_Sub12_Sub1_10066,
				       aClass438_3424.aFloat4864,
				       aClass438_3424.aFloat4863,
				       aClass438_3424.aFloat4865, 417479047);
	}
    }
    
    boolean method15691() throws Exception_Sub4 {
	aClass269_10071 = aClass185_Sub1_3422.method14589("Particle");
	aClass534_Sub12_Sub1_10068
	    = aClass269_10071.method4909("WVPMatrix", 131090959);
	aClass534_Sub12_Sub1_10076
	    = aClass269_10071.method4909("DiffuseSampler", 735807915);
	aClass534_Sub12_Sub1_10069
	    = aClass269_10071.method4909("TexCoordMatrix", 452034684);
	aClass534_Sub12_Sub1_10074
	    = aClass269_10071.method4909("DistanceFogPlane", 1162203789);
	aClass534_Sub12_Sub1_10066
	    = aClass269_10071.method4909("DistanceFogColour", 134846571);
	aClass534_Sub12_Sub1_10070
	    = aClass269_10071.method4909("DistanceFogAmount", 2113276582);
	aClass534_Sub12_Sub1_10073
	    = aClass269_10071.method4909("DiffuseColour", 955181228);
	aClass278_10072 = aClass269_10071.method4914("NoFog", -1778231174);
	aClass278_10075
	    = aClass269_10071.method4914("ParticleFog", -1722879648);
	aClass278_10065
	    = aClass269_10071.method4914("BillboardFog", -1371362962);
	if (!aClass278_10072.method5182())
	    return false;
	if (!aClass278_10075.method5182())
	    return false;
	if (!aClass278_10065.method5182())
	    return false;
	return true;
    }
    
    public void method5790(int i, boolean bool) {
	aClass269_10071.method4919(bool ? aClass278_10075 : aClass278_10072);
	aClass269_10071.method4913();
	method15688(bool, true, 1087971693);
	aClass185_Sub1_3422.method14710(Class374.aClass374_3898, 0, 4 * i, 0,
					i * 2);
    }
    
    void method15692(boolean bool, boolean bool_3_) {
	aClass269_10071.method4933(aClass534_Sub12_Sub1_10076, 0,
				   anInterface38_3426, 486783831);
	aClass269_10071.method4932(aClass534_Sub12_Sub1_10068, aClass433_10067,
				   1260346586);
	aClass269_10071.method4931(aClass534_Sub12_Sub1_10069, aClass433_3423,
				   1638371242);
	aClass269_10071.method4930(aClass534_Sub12_Sub1_10073, anInt3427,
				   494277971);
	if (bool) {
	    if (bool_3_)
		aClass269_10071.method4926(aClass534_Sub12_Sub1_10074,
					   aClass441_3425.aFloat4873,
					   aClass441_3425.aFloat4874,
					   aClass441_3425.aFloat4876,
					   aClass441_3425.aFloat4875,
					   -303921141);
	    else
		aClass269_10071.method4923(aClass534_Sub12_Sub1_10070,
					   Math.min(Math.max(aFloat3421, 0.0F),
						    1.0F),
					   (byte) -7);
	    aClass269_10071.method4925(aClass534_Sub12_Sub1_10066,
				       aClass438_3424.aFloat4864,
				       aClass438_3424.aFloat4863,
				       aClass438_3424.aFloat4865, 417479047);
	}
    }
    
    public void method5783(int i, boolean bool) {
	aClass269_10071.method4919(bool ? aClass278_10075 : aClass278_10072);
	aClass269_10071.method4913();
	method15688(bool, true, 1087971693);
	aClass185_Sub1_3422.method14710(Class374.aClass374_3898, 0, 4 * i, 0,
					i * 2);
    }
    
    static final void method15693(Class247 class247, Class243 class243,
				  Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (Class546.method8989(string, class669, -219410121) != null)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2591
	    = Class99.method1859(string, class669, -459340492);
	class247.aBool2561 = true;
    }
    
    static final void method15694(Class669 class669, int i)
	throws Exception_Sub2 {
	class669.anInt8600 -= 617999126;
	int i_4_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_5_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	Class599.aClass298_Sub1_7871.method5369((float) i_4_, (float) i_5_,
						1325557133);
    }
}
