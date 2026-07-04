/* Class343_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class343_Sub3 extends Class343
{
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10265;
    public static float[] aFloatArray10266 = { 0.0F, 0.0F, 0.0F };
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10267;
    public static float aFloat10268 = 1.0F;
    Class269 aClass269_10269;
    Class534_Sub12_Sub1[] aClass534_Sub12_Sub1Array10270;
    Class278[] aClass278Array10271 = null;
    public static int anInt10272 = 1;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10273;
    public static Class170_Sub1[] aClass170_Sub1Array10274
	= { null, null, null };
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10275;
    boolean aBool10276;
    
    boolean method6098() {
	return aBool10276;
    }
    
    boolean method6073() {
	return (aClass185_Sub1_3556.aBool9271
		&& aClass185_Sub1_3556.method14747());
    }
    
    boolean method6084() {
	return aBool10276;
    }
    
    boolean method6063() {
	return aBool10276;
    }
    
    void method6065(int i, Class175_Sub1 class175_sub1,
		    Interface38 interface38, Interface21 interface21,
		    Interface38 interface38_0_, boolean bool) {
	float f = aClass185_Sub1_3556.method14715();
	float f_1_ = (float) class175_sub1.method2910();
	float f_2_ = (float) class175_sub1.method2911();
	Interface38 interface38_3_ = interface38;
	float f_4_ = f * 2.0F / f_1_;
	float f_5_ = -f * 2.0F / f_2_;
	float[] fs = { -1.0F + f_4_, 1.0F + f_5_, 0.0F, 0.0F, -1.0F + f_4_,
		       -3.0F + f_5_, 0.0F, 2.0F, 3.0F + f_4_, 1.0F + f_5_,
		       2.0F, 0.0F };
	int i_6_ = (int) f_1_;
	int i_7_ = (int) f_2_;
	int i_8_
	    = (bool ? aClass185_Sub1_3556.method3254(-1239030125).method2910()
	       : i_6_);
	int i_9_
	    = (bool ? aClass185_Sub1_3556.method3254(-291837030).method2911()
	       : i_7_);
	Class278 class278 = aClass278Array10271[anInt10272 - 1];
	aClass269_10269.method4919(class278);
	aClass269_10269.method4913();
	aClass269_10269.method4926(aClass534_Sub12_Sub1_10273, aFloat10268,
				   aFloatArray10266[0], aFloatArray10266[1],
				   aFloatArray10266[2], 139070608);
	Object object = null;
	Object object_10_ = null;
	for (int i_11_ = 0; i_11_ < anInt10272; i_11_++) {
	    if (aClass170_Sub1Array10274[i_11_] != null) {
		Class534_Sub12_Sub1 class534_sub12_sub1
		    = aClass534_Sub12_Sub1Array10270[i_11_];
		Interface43 interface43
		    = aClass170_Sub1Array10274[i_11_].method14520();
		aClass269_10269.method4933(class534_sub12_sub1, i_11_ + 1,
					   interface43, -1416520053);
	    }
	}
	float f_12_ = (float) i_6_ / f_1_;
	float f_13_ = (float) i_7_ / f_2_;
	float f_14_ = (float) i_8_ / f_1_;
	float f_15_ = (float) i_9_ / f_2_;
	fs[8] = (fs[8] + 1.0F) * f_12_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_13_ + 1.0F;
	fs[10] *= f_14_;
	fs[7] *= f_15_;
	aClass269_10269.method4929(aClass534_Sub12_Sub1_10275, fs, 2026446155);
	aClass269_10269.method4933(aClass534_Sub12_Sub1_10267, 0,
				   interface38_3_, 149196890);
	aClass269_10269.method4926(aClass534_Sub12_Sub1_10265, 0.0F, 0.0F,
				   0.0F, 0.0F, -978835996);
	aClass185_Sub1_3556.method3318(0, 0, i_6_, i_7_);
    }
    
    void method6106() {
	/* empty */
    }
    
    int method6082() {
	return 1;
    }
    
    public Class343_Sub3(Class185_Sub1 class185_sub1) {
	super(class185_sub1);
	aClass534_Sub12_Sub1Array10270 = null;
    }
    
    void method6066(int i) {
	aClass269_10269.method4910();
    }
    
    int method6069() {
	return 0;
    }
    
    int method6068() {
	return 2;
    }
    
    boolean method6072() {
	return (anInt10272 == 0 || aFloat10268 == 1.0F
		|| (aFloatArray10266[0] + aFloatArray10266[1]
		    + aFloatArray10266[2]) == 0.0F
		|| (aClass170_Sub1Array10274[0] == null
		    && aClass170_Sub1Array10274[1] == null
		    && aClass170_Sub1Array10274[2] == null));
    }
    
    boolean method6061() {
	if (method6073()) {
	    aClass269_10269
		= aClass185_Sub1_3556.method14589("FilterColourRemapping");
	    if (aClass269_10269 == null)
		return false;
	    try {
		aClass534_Sub12_Sub1_10267
		    = aClass269_10269.method4909("sceneTex", -145316036);
		aClass278Array10271 = new Class278[3];
		aClass534_Sub12_Sub1Array10270 = new Class534_Sub12_Sub1[3];
		if (aClass185_Sub1_3556.aBool9276) {
		    aClass278Array10271[0]
			= aClass269_10269.method4914("techRemap3D_1",
						     -2076426919);
		    aClass278Array10271[1]
			= aClass269_10269.method4914("techRemap3D_2",
						     -1872029845);
		    aClass278Array10271[2]
			= aClass269_10269.method4914("techRemap3D_3",
						     -1668464265);
		    aClass534_Sub12_Sub1Array10270[0]
			= aClass269_10269.method4909("remapTex3D_1",
						     384800887);
		    aClass534_Sub12_Sub1Array10270[1]
			= aClass269_10269.method4909("remapTex3D_2", 7705979);
		    aClass534_Sub12_Sub1Array10270[2]
			= aClass269_10269.method4909("remapTex3D_3",
						     1989150366);
		} else {
		    aClass278Array10271[0]
			= aClass269_10269.method4914("techRemap2D_1",
						     -1541824141);
		    aClass278Array10271[1]
			= aClass269_10269.method4914("techRemap2D_2",
						     -1453533204);
		    aClass278Array10271[2]
			= aClass269_10269.method4914("techRemap2D_3",
						     -1351718536);
		    aClass534_Sub12_Sub1Array10270[0]
			= aClass269_10269.method4909("remapTex2D_1",
						     1207840692);
		    aClass534_Sub12_Sub1Array10270[1]
			= aClass269_10269.method4909("remapTex2D_2",
						     422968035);
		    aClass534_Sub12_Sub1Array10270[2]
			= aClass269_10269.method4909("remapTex2D_3",
						     169889248);
		}
		aClass534_Sub12_Sub1_10273
		    = aClass269_10269.method4909("paramsWeightings",
						 1000167100);
		aClass534_Sub12_Sub1_10265
		    = aClass269_10269.method4909("pixelOffset", 1326685733);
		aClass534_Sub12_Sub1_10275
		    = aClass269_10269.method4909("PosAndTexCoords",
						 -219680397);
	    } catch (Exception_Sub4_Sub1 exception_sub4_sub1) {
		return false;
	    } catch (Exception_Sub4_Sub2 exception_sub4_sub2) {
		return false;
	    }
	    if (!aClass278Array10271[0].method5182()
		|| !aClass278Array10271[1].method5182()
		|| !aClass278Array10271[2].method5182())
		return false;
	    aBool10276 = true;
	    return true;
	}
	return false;
    }
    
    void method6064(int i, int i_16_) {
	/* empty */
    }
    
    boolean method6097() {
	if (method6073()) {
	    aClass269_10269
		= aClass185_Sub1_3556.method14589("FilterColourRemapping");
	    if (aClass269_10269 == null)
		return false;
	    try {
		aClass534_Sub12_Sub1_10267
		    = aClass269_10269.method4909("sceneTex", 1737655386);
		aClass278Array10271 = new Class278[3];
		aClass534_Sub12_Sub1Array10270 = new Class534_Sub12_Sub1[3];
		if (aClass185_Sub1_3556.aBool9276) {
		    aClass278Array10271[0]
			= aClass269_10269.method4914("techRemap3D_1",
						     -1899480648);
		    aClass278Array10271[1]
			= aClass269_10269.method4914("techRemap3D_2",
						     -1925565011);
		    aClass278Array10271[2]
			= aClass269_10269.method4914("techRemap3D_3",
						     -1368425147);
		    aClass534_Sub12_Sub1Array10270[0]
			= aClass269_10269.method4909("remapTex3D_1",
						     1179566727);
		    aClass534_Sub12_Sub1Array10270[1]
			= aClass269_10269.method4909("remapTex3D_2",
						     -144119379);
		    aClass534_Sub12_Sub1Array10270[2]
			= aClass269_10269.method4909("remapTex3D_3",
						     1941150392);
		} else {
		    aClass278Array10271[0]
			= aClass269_10269.method4914("techRemap2D_1",
						     -1408312446);
		    aClass278Array10271[1]
			= aClass269_10269.method4914("techRemap2D_2",
						     -1737913241);
		    aClass278Array10271[2]
			= aClass269_10269.method4914("techRemap2D_3",
						     -1694535554);
		    aClass534_Sub12_Sub1Array10270[0]
			= aClass269_10269.method4909("remapTex2D_1",
						     1074268245);
		    aClass534_Sub12_Sub1Array10270[1]
			= aClass269_10269.method4909("remapTex2D_2",
						     1569708744);
		    aClass534_Sub12_Sub1Array10270[2]
			= aClass269_10269.method4909("remapTex2D_3",
						     1649570797);
		}
		aClass534_Sub12_Sub1_10273
		    = aClass269_10269.method4909("paramsWeightings",
						 1202022303);
		aClass534_Sub12_Sub1_10265
		    = aClass269_10269.method4909("pixelOffset", 706271524);
		aClass534_Sub12_Sub1_10275
		    = aClass269_10269.method4909("PosAndTexCoords", 871876860);
	    } catch (Exception_Sub4_Sub1 exception_sub4_sub1) {
		return false;
	    } catch (Exception_Sub4_Sub2 exception_sub4_sub2) {
		return false;
	    }
	    if (!aClass278Array10271[0].method5182()
		|| !aClass278Array10271[1].method5182()
		|| !aClass278Array10271[2].method5182())
		return false;
	    aBool10276 = true;
	    return true;
	}
	return false;
    }
    
    boolean method6093() {
	if (method6073()) {
	    aClass269_10269
		= aClass185_Sub1_3556.method14589("FilterColourRemapping");
	    if (aClass269_10269 == null)
		return false;
	    try {
		aClass534_Sub12_Sub1_10267
		    = aClass269_10269.method4909("sceneTex", 107319613);
		aClass278Array10271 = new Class278[3];
		aClass534_Sub12_Sub1Array10270 = new Class534_Sub12_Sub1[3];
		if (aClass185_Sub1_3556.aBool9276) {
		    aClass278Array10271[0]
			= aClass269_10269.method4914("techRemap3D_1",
						     -1908623550);
		    aClass278Array10271[1]
			= aClass269_10269.method4914("techRemap3D_2",
						     -1958708933);
		    aClass278Array10271[2]
			= aClass269_10269.method4914("techRemap3D_3",
						     -1618205845);
		    aClass534_Sub12_Sub1Array10270[0]
			= aClass269_10269.method4909("remapTex3D_1",
						     1441390066);
		    aClass534_Sub12_Sub1Array10270[1]
			= aClass269_10269.method4909("remapTex3D_2",
						     342245861);
		    aClass534_Sub12_Sub1Array10270[2]
			= aClass269_10269.method4909("remapTex3D_3",
						     2098060533);
		} else {
		    aClass278Array10271[0]
			= aClass269_10269.method4914("techRemap2D_1",
						     -2072356981);
		    aClass278Array10271[1]
			= aClass269_10269.method4914("techRemap2D_2",
						     -1359701042);
		    aClass278Array10271[2]
			= aClass269_10269.method4914("techRemap2D_3",
						     -1458305432);
		    aClass534_Sub12_Sub1Array10270[0]
			= aClass269_10269.method4909("remapTex2D_1",
						     1869852523);
		    aClass534_Sub12_Sub1Array10270[1]
			= aClass269_10269.method4909("remapTex2D_2",
						     832612896);
		    aClass534_Sub12_Sub1Array10270[2]
			= aClass269_10269.method4909("remapTex2D_3",
						     1594511912);
		}
		aClass534_Sub12_Sub1_10273
		    = aClass269_10269.method4909("paramsWeightings",
						 1882568741);
		aClass534_Sub12_Sub1_10265
		    = aClass269_10269.method4909("pixelOffset", 624225710);
		aClass534_Sub12_Sub1_10275
		    = aClass269_10269.method4909("PosAndTexCoords",
						 1637633971);
	    } catch (Exception_Sub4_Sub1 exception_sub4_sub1) {
		return false;
	    } catch (Exception_Sub4_Sub2 exception_sub4_sub2) {
		return false;
	    }
	    if (!aClass278Array10271[0].method5182()
		|| !aClass278Array10271[1].method5182()
		|| !aClass278Array10271[2].method5182())
		return false;
	    aBool10276 = true;
	    return true;
	}
	return false;
    }
    
    boolean method6076() {
	if (method6073()) {
	    aClass269_10269
		= aClass185_Sub1_3556.method14589("FilterColourRemapping");
	    if (aClass269_10269 == null)
		return false;
	    try {
		aClass534_Sub12_Sub1_10267
		    = aClass269_10269.method4909("sceneTex", 720314817);
		aClass278Array10271 = new Class278[3];
		aClass534_Sub12_Sub1Array10270 = new Class534_Sub12_Sub1[3];
		if (aClass185_Sub1_3556.aBool9276) {
		    aClass278Array10271[0]
			= aClass269_10269.method4914("techRemap3D_1",
						     -1885407423);
		    aClass278Array10271[1]
			= aClass269_10269.method4914("techRemap3D_2",
						     -1525637083);
		    aClass278Array10271[2]
			= aClass269_10269.method4914("techRemap3D_3",
						     -1903560346);
		    aClass534_Sub12_Sub1Array10270[0]
			= aClass269_10269.method4909("remapTex3D_1",
						     1499048171);
		    aClass534_Sub12_Sub1Array10270[1]
			= aClass269_10269.method4909("remapTex3D_2",
						     205245542);
		    aClass534_Sub12_Sub1Array10270[2]
			= aClass269_10269.method4909("remapTex3D_3",
						     324238304);
		} else {
		    aClass278Array10271[0]
			= aClass269_10269.method4914("techRemap2D_1",
						     -1471568929);
		    aClass278Array10271[1]
			= aClass269_10269.method4914("techRemap2D_2",
						     -1930359129);
		    aClass278Array10271[2]
			= aClass269_10269.method4914("techRemap2D_3",
						     -1531963503);
		    aClass534_Sub12_Sub1Array10270[0]
			= aClass269_10269.method4909("remapTex2D_1",
						     1300271679);
		    aClass534_Sub12_Sub1Array10270[1]
			= aClass269_10269.method4909("remapTex2D_2",
						     635037324);
		    aClass534_Sub12_Sub1Array10270[2]
			= aClass269_10269.method4909("remapTex2D_3",
						     1453981610);
		}
		aClass534_Sub12_Sub1_10273
		    = aClass269_10269.method4909("paramsWeightings",
						 919577547);
		aClass534_Sub12_Sub1_10265
		    = aClass269_10269.method4909("pixelOffset", 1277772735);
		aClass534_Sub12_Sub1_10275
		    = aClass269_10269.method4909("PosAndTexCoords",
						 1933321494);
	    } catch (Exception_Sub4_Sub1 exception_sub4_sub1) {
		return false;
	    } catch (Exception_Sub4_Sub2 exception_sub4_sub2) {
		return false;
	    }
	    if (!aClass278Array10271[0].method5182()
		|| !aClass278Array10271[1].method5182()
		|| !aClass278Array10271[2].method5182())
		return false;
	    aBool10276 = true;
	    return true;
	}
	return false;
    }
    
    boolean method6077() {
	if (method6073()) {
	    aClass269_10269
		= aClass185_Sub1_3556.method14589("FilterColourRemapping");
	    if (aClass269_10269 == null)
		return false;
	    try {
		aClass534_Sub12_Sub1_10267
		    = aClass269_10269.method4909("sceneTex", 594798451);
		aClass278Array10271 = new Class278[3];
		aClass534_Sub12_Sub1Array10270 = new Class534_Sub12_Sub1[3];
		if (aClass185_Sub1_3556.aBool9276) {
		    aClass278Array10271[0]
			= aClass269_10269.method4914("techRemap3D_1",
						     -1555196876);
		    aClass278Array10271[1]
			= aClass269_10269.method4914("techRemap3D_2",
						     -2063025581);
		    aClass278Array10271[2]
			= aClass269_10269.method4914("techRemap3D_3",
						     -1637228812);
		    aClass534_Sub12_Sub1Array10270[0]
			= aClass269_10269.method4909("remapTex3D_1",
						     1437761138);
		    aClass534_Sub12_Sub1Array10270[1]
			= aClass269_10269.method4909("remapTex3D_2",
						     2103391933);
		    aClass534_Sub12_Sub1Array10270[2]
			= aClass269_10269.method4909("remapTex3D_3",
						     992365590);
		} else {
		    aClass278Array10271[0]
			= aClass269_10269.method4914("techRemap2D_1",
						     -1369777770);
		    aClass278Array10271[1]
			= aClass269_10269.method4914("techRemap2D_2",
						     -1961720050);
		    aClass278Array10271[2]
			= aClass269_10269.method4914("techRemap2D_3",
						     -1878241126);
		    aClass534_Sub12_Sub1Array10270[0]
			= aClass269_10269.method4909("remapTex2D_1",
						     1226789681);
		    aClass534_Sub12_Sub1Array10270[1]
			= aClass269_10269.method4909("remapTex2D_2",
						     1708576888);
		    aClass534_Sub12_Sub1Array10270[2]
			= aClass269_10269.method4909("remapTex2D_3",
						     896910079);
		}
		aClass534_Sub12_Sub1_10273
		    = aClass269_10269.method4909("paramsWeightings", 66357073);
		aClass534_Sub12_Sub1_10265
		    = aClass269_10269.method4909("pixelOffset", -8844679);
		aClass534_Sub12_Sub1_10275
		    = aClass269_10269.method4909("PosAndTexCoords",
						 1050390899);
	    } catch (Exception_Sub4_Sub1 exception_sub4_sub1) {
		return false;
	    } catch (Exception_Sub4_Sub2 exception_sub4_sub2) {
		return false;
	    }
	    if (!aClass278Array10271[0].method5182()
		|| !aClass278Array10271[1].method5182()
		|| !aClass278Array10271[2].method5182())
		return false;
	    aBool10276 = true;
	    return true;
	}
	return false;
    }
    
    void method6079(int i, Class175_Sub1 class175_sub1,
		    Interface38 interface38, Interface21 interface21,
		    Interface38 interface38_17_, boolean bool) {
	float f = aClass185_Sub1_3556.method14715();
	float f_18_ = (float) class175_sub1.method2910();
	float f_19_ = (float) class175_sub1.method2911();
	Interface38 interface38_20_ = interface38;
	float f_21_ = f * 2.0F / f_18_;
	float f_22_ = -f * 2.0F / f_19_;
	float[] fs = { -1.0F + f_21_, 1.0F + f_22_, 0.0F, 0.0F, -1.0F + f_21_,
		       -3.0F + f_22_, 0.0F, 2.0F, 3.0F + f_21_, 1.0F + f_22_,
		       2.0F, 0.0F };
	int i_23_ = (int) f_18_;
	int i_24_ = (int) f_19_;
	int i_25_
	    = (bool ? aClass185_Sub1_3556.method3254(-939827096).method2910()
	       : i_23_);
	int i_26_
	    = (bool ? aClass185_Sub1_3556.method3254(658942682).method2911()
	       : i_24_);
	Class278 class278 = aClass278Array10271[anInt10272 - 1];
	aClass269_10269.method4919(class278);
	aClass269_10269.method4913();
	aClass269_10269.method4926(aClass534_Sub12_Sub1_10273, aFloat10268,
				   aFloatArray10266[0], aFloatArray10266[1],
				   aFloatArray10266[2], -310806547);
	Object object = null;
	Object object_27_ = null;
	for (int i_28_ = 0; i_28_ < anInt10272; i_28_++) {
	    if (aClass170_Sub1Array10274[i_28_] != null) {
		Class534_Sub12_Sub1 class534_sub12_sub1
		    = aClass534_Sub12_Sub1Array10270[i_28_];
		Interface43 interface43
		    = aClass170_Sub1Array10274[i_28_].method14520();
		aClass269_10269.method4933(class534_sub12_sub1, i_28_ + 1,
					   interface43, -1189516522);
	    }
	}
	float f_29_ = (float) i_23_ / f_18_;
	float f_30_ = (float) i_24_ / f_19_;
	float f_31_ = (float) i_25_ / f_18_;
	float f_32_ = (float) i_26_ / f_19_;
	fs[8] = (fs[8] + 1.0F) * f_29_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_30_ + 1.0F;
	fs[10] *= f_31_;
	fs[7] *= f_32_;
	aClass269_10269.method4929(aClass534_Sub12_Sub1_10275, fs,
				   -1910118938);
	aClass269_10269.method4933(aClass534_Sub12_Sub1_10267, 0,
				   interface38_20_, 133918001);
	aClass269_10269.method4926(aClass534_Sub12_Sub1_10265, 0.0F, 0.0F,
				   0.0F, 0.0F, -215312992);
	aClass185_Sub1_3556.method3318(0, 0, i_23_, i_24_);
    }
    
    void method6080(int i, Class175_Sub1 class175_sub1,
		    Interface38 interface38, Interface21 interface21,
		    Interface38 interface38_33_, boolean bool) {
	float f = aClass185_Sub1_3556.method14715();
	float f_34_ = (float) class175_sub1.method2910();
	float f_35_ = (float) class175_sub1.method2911();
	Interface38 interface38_36_ = interface38;
	float f_37_ = f * 2.0F / f_34_;
	float f_38_ = -f * 2.0F / f_35_;
	float[] fs = { -1.0F + f_37_, 1.0F + f_38_, 0.0F, 0.0F, -1.0F + f_37_,
		       -3.0F + f_38_, 0.0F, 2.0F, 3.0F + f_37_, 1.0F + f_38_,
		       2.0F, 0.0F };
	int i_39_ = (int) f_34_;
	int i_40_ = (int) f_35_;
	int i_41_
	    = (bool ? aClass185_Sub1_3556.method3254(-408573995).method2910()
	       : i_39_);
	int i_42_
	    = (bool ? aClass185_Sub1_3556.method3254(-683879090).method2911()
	       : i_40_);
	Class278 class278 = aClass278Array10271[anInt10272 - 1];
	aClass269_10269.method4919(class278);
	aClass269_10269.method4913();
	aClass269_10269.method4926(aClass534_Sub12_Sub1_10273, aFloat10268,
				   aFloatArray10266[0], aFloatArray10266[1],
				   aFloatArray10266[2], -660520347);
	Object object = null;
	Object object_43_ = null;
	for (int i_44_ = 0; i_44_ < anInt10272; i_44_++) {
	    if (aClass170_Sub1Array10274[i_44_] != null) {
		Class534_Sub12_Sub1 class534_sub12_sub1
		    = aClass534_Sub12_Sub1Array10270[i_44_];
		Interface43 interface43
		    = aClass170_Sub1Array10274[i_44_].method14520();
		aClass269_10269.method4933(class534_sub12_sub1, i_44_ + 1,
					   interface43, 1835225856);
	    }
	}
	float f_45_ = (float) i_39_ / f_34_;
	float f_46_ = (float) i_40_ / f_35_;
	float f_47_ = (float) i_41_ / f_34_;
	float f_48_ = (float) i_42_ / f_35_;
	fs[8] = (fs[8] + 1.0F) * f_45_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_46_ + 1.0F;
	fs[10] *= f_47_;
	fs[7] *= f_48_;
	aClass269_10269.method4929(aClass534_Sub12_Sub1_10275, fs, 839363596);
	aClass269_10269.method4933(aClass534_Sub12_Sub1_10267, 0,
				   interface38_36_, 1541639596);
	aClass269_10269.method4926(aClass534_Sub12_Sub1_10265, 0.0F, 0.0F,
				   0.0F, 0.0F, -270209359);
	aClass185_Sub1_3556.method3318(0, 0, i_39_, i_40_);
    }
    
    int method6058() {
	return 0;
    }
    
    int method6074() {
	return 1;
    }
    
    int method6083() {
	return 1;
    }
    
    int method6059() {
	return 1;
    }
    
    void method6075(int i, int i_49_) {
	/* empty */
    }
    
    int method6086() {
	return 2;
    }
    
    boolean method6096() {
	return (anInt10272 == 0 || aFloat10268 == 1.0F
		|| (aFloatArray10266[0] + aFloatArray10266[1]
		    + aFloatArray10266[2]) == 0.0F
		|| (aClass170_Sub1Array10274[0] == null
		    && aClass170_Sub1Array10274[1] == null
		    && aClass170_Sub1Array10274[2] == null));
    }
    
    void method6102(int i, int i_50_) {
	/* empty */
    }
    
    boolean method6095() {
	return (anInt10272 == 0 || aFloat10268 == 1.0F
		|| (aFloatArray10266[0] + aFloatArray10266[1]
		    + aFloatArray10266[2]) == 0.0F
		|| (aClass170_Sub1Array10274[0] == null
		    && aClass170_Sub1Array10274[1] == null
		    && aClass170_Sub1Array10274[2] == null));
    }
    
    int method6085() {
	return 1;
    }
    
    void method6081(int i, Class175_Sub1 class175_sub1,
		    Interface38 interface38, Interface21 interface21,
		    Interface38 interface38_51_, boolean bool) {
	float f = aClass185_Sub1_3556.method14715();
	float f_52_ = (float) class175_sub1.method2910();
	float f_53_ = (float) class175_sub1.method2911();
	Interface38 interface38_54_ = interface38;
	float f_55_ = f * 2.0F / f_52_;
	float f_56_ = -f * 2.0F / f_53_;
	float[] fs = { -1.0F + f_55_, 1.0F + f_56_, 0.0F, 0.0F, -1.0F + f_55_,
		       -3.0F + f_56_, 0.0F, 2.0F, 3.0F + f_55_, 1.0F + f_56_,
		       2.0F, 0.0F };
	int i_57_ = (int) f_52_;
	int i_58_ = (int) f_53_;
	int i_59_
	    = (bool ? aClass185_Sub1_3556.method3254(760292487).method2910()
	       : i_57_);
	int i_60_
	    = (bool ? aClass185_Sub1_3556.method3254(-556300417).method2911()
	       : i_58_);
	Class278 class278 = aClass278Array10271[anInt10272 - 1];
	aClass269_10269.method4919(class278);
	aClass269_10269.method4913();
	aClass269_10269.method4926(aClass534_Sub12_Sub1_10273, aFloat10268,
				   aFloatArray10266[0], aFloatArray10266[1],
				   aFloatArray10266[2], -1928948770);
	Object object = null;
	Object object_61_ = null;
	for (int i_62_ = 0; i_62_ < anInt10272; i_62_++) {
	    if (aClass170_Sub1Array10274[i_62_] != null) {
		Class534_Sub12_Sub1 class534_sub12_sub1
		    = aClass534_Sub12_Sub1Array10270[i_62_];
		Interface43 interface43
		    = aClass170_Sub1Array10274[i_62_].method14520();
		aClass269_10269.method4933(class534_sub12_sub1, i_62_ + 1,
					   interface43, 1744816307);
	    }
	}
	float f_63_ = (float) i_57_ / f_52_;
	float f_64_ = (float) i_58_ / f_53_;
	float f_65_ = (float) i_59_ / f_52_;
	float f_66_ = (float) i_60_ / f_53_;
	fs[8] = (fs[8] + 1.0F) * f_63_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_64_ + 1.0F;
	fs[10] *= f_65_;
	fs[7] *= f_66_;
	aClass269_10269.method4929(aClass534_Sub12_Sub1_10275, fs, 1767155875);
	aClass269_10269.method4933(aClass534_Sub12_Sub1_10267, 0,
				   interface38_54_, -15066946);
	aClass269_10269.method4926(aClass534_Sub12_Sub1_10265, 0.0F, 0.0F,
				   0.0F, 0.0F, -1732981154);
	aClass185_Sub1_3556.method3318(0, 0, i_57_, i_58_);
    }
    
    void method6104() {
	/* empty */
    }
    
    void method6067(int i, int i_67_) {
	/* empty */
    }
    
    boolean method6099() {
	return (aClass185_Sub1_3556.aBool9271
		&& aClass185_Sub1_3556.method14747());
    }
    
    boolean method6060() {
	return (anInt10272 == 0 || aFloat10268 == 1.0F
		|| (aFloatArray10266[0] + aFloatArray10266[1]
		    + aFloatArray10266[2]) == 0.0F
		|| (aClass170_Sub1Array10274[0] == null
		    && aClass170_Sub1Array10274[1] == null
		    && aClass170_Sub1Array10274[2] == null));
    }
    
    void method6100(int i, int i_68_) {
	/* empty */
    }
    
    void method6103() {
	/* empty */
    }
    
    boolean method6094() {
	return (anInt10272 == 0 || aFloat10268 == 1.0F
		|| (aFloatArray10266[0] + aFloatArray10266[1]
		    + aFloatArray10266[2]) == 0.0F
		|| (aClass170_Sub1Array10274[0] == null
		    && aClass170_Sub1Array10274[1] == null
		    && aClass170_Sub1Array10274[2] == null));
    }
    
    void method6105() {
	/* empty */
    }
    
    void method6092(int i) {
	aClass269_10269.method4910();
    }
    
    void method6087(int i) {
	aClass269_10269.method4910();
    }
    
    void method6107(int i) {
	aClass269_10269.method4910();
    }
    
    void method6108(int i) {
	aClass269_10269.method4910();
    }
}
