/* Class343_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class343_Sub1 extends Class343
{
    Class278 aClass278_10175;
    static final int anInt10176 = 256;
    public static float aFloat10177;
    public static float aFloat10178;
    public static float aFloat10179 = 0.25F;
    Class269 aClass269_10180;
    Class278 aClass278_10181;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10182;
    Class278 aClass278_10183;
    boolean aBool10184;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10185;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10186;
    Class278 aClass278_10187;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10188;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10189;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10190;
    public static float aFloat10191;
    Class278 aClass278_10192;
    
    void method6066(int i) {
	aClass269_10180.method4910();
    }
    
    boolean method6073() {
	return (aClass185_Sub1_3556.aBool9271
		&& aClass185_Sub1_3556.method14747()
		&& aClass185_Sub1_3556.method14584(true));
    }
    
    void method6100(int i, int i_0_) {
	/* empty */
    }
    
    boolean method6061() {
	if (method6073()) {
	    aClass269_10180 = aClass185_Sub1_3556.method14589("FilterBloom");
	    if (aClass269_10180 == null)
		return false;
	    try {
		aClass534_Sub12_Sub1_10186
		    = aClass269_10180.method4909("sceneTex", 62516064);
		aClass534_Sub12_Sub1_10182
		    = aClass269_10180.method4909("bloomTex1", 2103387109);
		aClass534_Sub12_Sub1_10188
		    = aClass269_10180.method4909("params", 2112067592);
		aClass534_Sub12_Sub1_10189
		    = aClass269_10180.method4909("sampleSize", 1383434023);
		aClass534_Sub12_Sub1_10190
		    = aClass269_10180.method4909("pixelOffsetAndBloomScale",
						 181082517);
		aClass534_Sub12_Sub1_10185
		    = aClass269_10180.method4909("PosAndTexCoords",
						 2001386439);
		aClass269_10180.method4914("test", -1691724818);
		aClass278_10181
		    = aClass269_10180.method4914("techFullscreenTri",
						 -2032776841);
		aClass278_10175
		    = aClass269_10180.method4914("brightpass", -1918971379);
		aClass278_10183
		    = aClass269_10180.method4914("blur", -1282800524);
		aClass278_10192
		    = aClass269_10180.method4914("composite", -1934384441);
		aClass278_10187
		    = aClass269_10180.method4914("techDefault", -1689952049);
	    } catch (Exception_Sub4_Sub1 exception_sub4_sub1) {
		return false;
	    } catch (Exception_Sub4_Sub2 exception_sub4_sub2) {
		return false;
	    }
	    if (!aClass278_10181.method5182())
		return false;
	    if (!aClass278_10175.method5182())
		return false;
	    if (!aClass278_10183.method5182())
		return false;
	    if (!aClass278_10192.method5182())
		return false;
	    if (!aClass278_10187.method5182())
		return false;
	    aBool10184 = true;
	    return true;
	}
	return false;
    }
    
    void method6064(int i, int i_1_) {
	/* empty */
    }
    
    void method6106() {
	/* empty */
    }
    
    int method6082() {
	return 4;
    }
    
    void method6102(int i, int i_2_) {
	/* empty */
    }
    
    boolean method6084() {
	return aBool10184;
    }
    
    int method6069() {
	return 1;
    }
    
    int method6068() {
	return 0;
    }
    
    boolean method6072() {
	return false;
    }
    
    static {
	aFloat10177 = 1.0F;
	aFloat10178 = 1.0F;
	aFloat10191 = 1.0F;
    }
    
    boolean method6094() {
	return false;
    }
    
    boolean method6097() {
	if (method6073()) {
	    aClass269_10180 = aClass185_Sub1_3556.method14589("FilterBloom");
	    if (aClass269_10180 == null)
		return false;
	    try {
		aClass534_Sub12_Sub1_10186
		    = aClass269_10180.method4909("sceneTex", 552943750);
		aClass534_Sub12_Sub1_10182
		    = aClass269_10180.method4909("bloomTex1", 189880284);
		aClass534_Sub12_Sub1_10188
		    = aClass269_10180.method4909("params", 536405821);
		aClass534_Sub12_Sub1_10189
		    = aClass269_10180.method4909("sampleSize", 501367967);
		aClass534_Sub12_Sub1_10190
		    = aClass269_10180.method4909("pixelOffsetAndBloomScale",
						 914571078);
		aClass534_Sub12_Sub1_10185
		    = aClass269_10180.method4909("PosAndTexCoords",
						 1651821065);
		aClass269_10180.method4914("test", -1550498354);
		aClass278_10181
		    = aClass269_10180.method4914("techFullscreenTri",
						 -1478568811);
		aClass278_10175
		    = aClass269_10180.method4914("brightpass", -1642496727);
		aClass278_10183
		    = aClass269_10180.method4914("blur", -2128300917);
		aClass278_10192
		    = aClass269_10180.method4914("composite", -1376255966);
		aClass278_10187
		    = aClass269_10180.method4914("techDefault", -1720335153);
	    } catch (Exception_Sub4_Sub1 exception_sub4_sub1) {
		return false;
	    } catch (Exception_Sub4_Sub2 exception_sub4_sub2) {
		return false;
	    }
	    if (!aClass278_10181.method5182())
		return false;
	    if (!aClass278_10175.method5182())
		return false;
	    if (!aClass278_10183.method5182())
		return false;
	    if (!aClass278_10192.method5182())
		return false;
	    if (!aClass278_10187.method5182())
		return false;
	    aBool10184 = true;
	    return true;
	}
	return false;
    }
    
    void method6067(int i, int i_3_) {
	/* empty */
    }
    
    boolean method6076() {
	if (method6073()) {
	    aClass269_10180 = aClass185_Sub1_3556.method14589("FilterBloom");
	    if (aClass269_10180 == null)
		return false;
	    try {
		aClass534_Sub12_Sub1_10186
		    = aClass269_10180.method4909("sceneTex", 447146241);
		aClass534_Sub12_Sub1_10182
		    = aClass269_10180.method4909("bloomTex1", 1283896027);
		aClass534_Sub12_Sub1_10188
		    = aClass269_10180.method4909("params", 1765686473);
		aClass534_Sub12_Sub1_10189
		    = aClass269_10180.method4909("sampleSize", 375688836);
		aClass534_Sub12_Sub1_10190
		    = aClass269_10180.method4909("pixelOffsetAndBloomScale",
						 271052713);
		aClass534_Sub12_Sub1_10185
		    = aClass269_10180.method4909("PosAndTexCoords", 957415578);
		aClass269_10180.method4914("test", -1398440955);
		aClass278_10181
		    = aClass269_10180.method4914("techFullscreenTri",
						 -1956255401);
		aClass278_10175
		    = aClass269_10180.method4914("brightpass", -1570468927);
		aClass278_10183
		    = aClass269_10180.method4914("blur", -1740342909);
		aClass278_10192
		    = aClass269_10180.method4914("composite", -1306544447);
		aClass278_10187
		    = aClass269_10180.method4914("techDefault", -1982402261);
	    } catch (Exception_Sub4_Sub1 exception_sub4_sub1) {
		return false;
	    } catch (Exception_Sub4_Sub2 exception_sub4_sub2) {
		return false;
	    }
	    if (!aClass278_10181.method5182())
		return false;
	    if (!aClass278_10175.method5182())
		return false;
	    if (!aClass278_10183.method5182())
		return false;
	    if (!aClass278_10192.method5182())
		return false;
	    if (!aClass278_10187.method5182())
		return false;
	    aBool10184 = true;
	    return true;
	}
	return false;
    }
    
    boolean method6077() {
	if (method6073()) {
	    aClass269_10180 = aClass185_Sub1_3556.method14589("FilterBloom");
	    if (aClass269_10180 == null)
		return false;
	    try {
		aClass534_Sub12_Sub1_10186
		    = aClass269_10180.method4909("sceneTex", 1938567001);
		aClass534_Sub12_Sub1_10182
		    = aClass269_10180.method4909("bloomTex1", 373165218);
		aClass534_Sub12_Sub1_10188
		    = aClass269_10180.method4909("params", 1668216680);
		aClass534_Sub12_Sub1_10189
		    = aClass269_10180.method4909("sampleSize", -222220537);
		aClass534_Sub12_Sub1_10190
		    = aClass269_10180.method4909("pixelOffsetAndBloomScale",
						 2084264717);
		aClass534_Sub12_Sub1_10185
		    = aClass269_10180.method4909("PosAndTexCoords",
						 1267877113);
		aClass269_10180.method4914("test", -1292350285);
		aClass278_10181
		    = aClass269_10180.method4914("techFullscreenTri",
						 -1983126211);
		aClass278_10175
		    = aClass269_10180.method4914("brightpass", -1326584390);
		aClass278_10183
		    = aClass269_10180.method4914("blur", -1795820564);
		aClass278_10192
		    = aClass269_10180.method4914("composite", -1293866533);
		aClass278_10187
		    = aClass269_10180.method4914("techDefault", -1911867946);
	    } catch (Exception_Sub4_Sub1 exception_sub4_sub1) {
		return false;
	    } catch (Exception_Sub4_Sub2 exception_sub4_sub2) {
		return false;
	    }
	    if (!aClass278_10181.method5182())
		return false;
	    if (!aClass278_10175.method5182())
		return false;
	    if (!aClass278_10183.method5182())
		return false;
	    if (!aClass278_10192.method5182())
		return false;
	    if (!aClass278_10187.method5182())
		return false;
	    aBool10184 = true;
	    return true;
	}
	return false;
    }
    
    void method6079(int i, Class175_Sub1 class175_sub1,
		    Interface38 interface38, Interface21 interface21,
		    Interface38 interface38_4_, boolean bool) {
	float f = aClass185_Sub1_3556.method14715();
	float f_5_ = (float) class175_sub1.method2910();
	float f_6_ = (float) class175_sub1.method2911();
	Interface38 interface38_7_ = interface38;
	float f_8_ = f * 2.0F / f_5_;
	float f_9_ = -f * 2.0F / f_6_;
	float[] fs = { -1.0F + f_8_, 1.0F + f_9_, 0.0F, 0.0F, -1.0F + f_8_,
		       -3.0F + f_9_, 0.0F, 2.0F, 3.0F + f_8_, 1.0F + f_9_,
		       2.0F, 0.0F };
	int i_10_ = (int) f_5_;
	int i_11_ = (int) f_6_;
	int i_12_
	    = (bool ? aClass185_Sub1_3556.method3254(-7069278).method2910()
	       : i_10_);
	int i_13_
	    = (bool ? aClass185_Sub1_3556.method3254(-819227152).method2911()
	       : i_11_);
	if (i == 0) {
	    i_10_ = 256;
	    i_11_ = 256;
	    aClass269_10180.method4919(aClass278_10175);
	    aClass269_10180.method4913();
	} else if (i == 1) {
	    i_10_ = 256;
	    i_11_ = 256;
	    i_12_ = i_10_;
	    i_13_ = i_11_;
	    aClass269_10180.method4919(aClass278_10183);
	    aClass269_10180.method4913();
	    aClass269_10180.method4974(aClass534_Sub12_Sub1_10189,
				       aFloat10191 / f_5_, 0.0F, 816576087);
	} else if (i == 2) {
	    i_10_ = 256;
	    i_11_ = 256;
	    i_12_ = i_10_;
	    i_13_ = i_11_;
	    aClass269_10180.method4919(aClass278_10183);
	    aClass269_10180.method4913();
	    aClass269_10180.method4974(aClass534_Sub12_Sub1_10189, 0.0F,
				       aFloat10191 / f_6_, 816576087);
	} else if (i == 3) {
	    aClass269_10180.method4919(aClass278_10192);
	    interface38_7_ = interface38_4_;
	    aClass269_10180.method4933(aClass534_Sub12_Sub1_10182, 1,
				       interface38, -244808686);
	    aClass269_10180.method4913();
	}
	float f_14_ = (float) i_10_ / f_5_;
	float f_15_ = (float) i_11_ / f_6_;
	float f_16_ = (float) i_12_ / f_5_;
	float f_17_ = (float) i_13_ / f_6_;
	fs[8] = (fs[8] + 1.0F) * f_14_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_15_ + 1.0F;
	fs[10] *= f_16_;
	fs[7] *= f_17_;
	aClass269_10180.method4929(aClass534_Sub12_Sub1_10185, fs, 1575350938);
	aClass269_10180.method4933(aClass534_Sub12_Sub1_10186, 0,
				   interface38_7_, 724628639);
	aClass269_10180.method4926(aClass534_Sub12_Sub1_10188, aFloat10178,
				   aFloat10179, aFloat10177, 0.0F,
				   -1690139349);
	aClass269_10180.method4926(aClass534_Sub12_Sub1_10190, 0.0F, 0.0F,
				   256.0F / f_5_, 256.0F / f_6_, -1232028942);
	aClass185_Sub1_3556.method3318(0, 0, i_10_, i_11_);
    }
    
    void method6107(int i) {
	aClass269_10180.method4910();
    }
    
    void method6081(int i, Class175_Sub1 class175_sub1,
		    Interface38 interface38, Interface21 interface21,
		    Interface38 interface38_18_, boolean bool) {
	float f = aClass185_Sub1_3556.method14715();
	float f_19_ = (float) class175_sub1.method2910();
	float f_20_ = (float) class175_sub1.method2911();
	Interface38 interface38_21_ = interface38;
	float f_22_ = f * 2.0F / f_19_;
	float f_23_ = -f * 2.0F / f_20_;
	float[] fs = { -1.0F + f_22_, 1.0F + f_23_, 0.0F, 0.0F, -1.0F + f_22_,
		       -3.0F + f_23_, 0.0F, 2.0F, 3.0F + f_22_, 1.0F + f_23_,
		       2.0F, 0.0F };
	int i_24_ = (int) f_19_;
	int i_25_ = (int) f_20_;
	int i_26_
	    = (bool ? aClass185_Sub1_3556.method3254(787972446).method2910()
	       : i_24_);
	int i_27_
	    = (bool ? aClass185_Sub1_3556.method3254(599716535).method2911()
	       : i_25_);
	if (i == 0) {
	    i_24_ = 256;
	    i_25_ = 256;
	    aClass269_10180.method4919(aClass278_10175);
	    aClass269_10180.method4913();
	} else if (i == 1) {
	    i_24_ = 256;
	    i_25_ = 256;
	    i_26_ = i_24_;
	    i_27_ = i_25_;
	    aClass269_10180.method4919(aClass278_10183);
	    aClass269_10180.method4913();
	    aClass269_10180.method4974(aClass534_Sub12_Sub1_10189,
				       aFloat10191 / f_19_, 0.0F, 816576087);
	} else if (i == 2) {
	    i_24_ = 256;
	    i_25_ = 256;
	    i_26_ = i_24_;
	    i_27_ = i_25_;
	    aClass269_10180.method4919(aClass278_10183);
	    aClass269_10180.method4913();
	    aClass269_10180.method4974(aClass534_Sub12_Sub1_10189, 0.0F,
				       aFloat10191 / f_20_, 816576087);
	} else if (i == 3) {
	    aClass269_10180.method4919(aClass278_10192);
	    interface38_21_ = interface38_18_;
	    aClass269_10180.method4933(aClass534_Sub12_Sub1_10182, 1,
				       interface38, -775895053);
	    aClass269_10180.method4913();
	}
	float f_28_ = (float) i_24_ / f_19_;
	float f_29_ = (float) i_25_ / f_20_;
	float f_30_ = (float) i_26_ / f_19_;
	float f_31_ = (float) i_27_ / f_20_;
	fs[8] = (fs[8] + 1.0F) * f_28_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_29_ + 1.0F;
	fs[10] *= f_30_;
	fs[7] *= f_31_;
	aClass269_10180.method4929(aClass534_Sub12_Sub1_10185, fs, 812359801);
	aClass269_10180.method4933(aClass534_Sub12_Sub1_10186, 0,
				   interface38_21_, 89735521);
	aClass269_10180.method4926(aClass534_Sub12_Sub1_10188, aFloat10178,
				   aFloat10179, aFloat10177, 0.0F,
				   -1799127445);
	aClass269_10180.method4926(aClass534_Sub12_Sub1_10190, 0.0F, 0.0F,
				   256.0F / f_19_, 256.0F / f_20_, -392527672);
	aClass185_Sub1_3556.method3318(0, 0, i_24_, i_25_);
    }
    
    int method6074() {
	return 4;
    }
    
    int method6083() {
	return 4;
    }
    
    int method6059() {
	return 4;
    }
    
    boolean method6093() {
	if (method6073()) {
	    aClass269_10180 = aClass185_Sub1_3556.method14589("FilterBloom");
	    if (aClass269_10180 == null)
		return false;
	    try {
		aClass534_Sub12_Sub1_10186
		    = aClass269_10180.method4909("sceneTex", 1371410439);
		aClass534_Sub12_Sub1_10182
		    = aClass269_10180.method4909("bloomTex1", 1473068661);
		aClass534_Sub12_Sub1_10188
		    = aClass269_10180.method4909("params", 1495975616);
		aClass534_Sub12_Sub1_10189
		    = aClass269_10180.method4909("sampleSize", 1555629232);
		aClass534_Sub12_Sub1_10190
		    = aClass269_10180.method4909("pixelOffsetAndBloomScale",
						 641043599);
		aClass534_Sub12_Sub1_10185
		    = aClass269_10180.method4909("PosAndTexCoords",
						 1672998249);
		aClass269_10180.method4914("test", -1361051005);
		aClass278_10181
		    = aClass269_10180.method4914("techFullscreenTri",
						 -1739868108);
		aClass278_10175
		    = aClass269_10180.method4914("brightpass", -2055993039);
		aClass278_10183
		    = aClass269_10180.method4914("blur", -1437645340);
		aClass278_10192
		    = aClass269_10180.method4914("composite", -2015607664);
		aClass278_10187
		    = aClass269_10180.method4914("techDefault", -1805018644);
	    } catch (Exception_Sub4_Sub1 exception_sub4_sub1) {
		return false;
	    } catch (Exception_Sub4_Sub2 exception_sub4_sub2) {
		return false;
	    }
	    if (!aClass278_10181.method5182())
		return false;
	    if (!aClass278_10175.method5182())
		return false;
	    if (!aClass278_10183.method5182())
		return false;
	    if (!aClass278_10192.method5182())
		return false;
	    if (!aClass278_10187.method5182())
		return false;
	    aBool10184 = true;
	    return true;
	}
	return false;
    }
    
    int method6086() {
	return 0;
    }
    
    boolean method6098() {
	return aBool10184;
    }
    
    public Class343_Sub1(Class185_Sub1 class185_sub1) {
	super(class185_sub1);
    }
    
    void method6104() {
	/* empty */
    }
    
    boolean method6095() {
	return false;
    }
    
    boolean method6096() {
	return false;
    }
    
    boolean method6063() {
	return aBool10184;
    }
    
    void method6103() {
	/* empty */
    }
    
    boolean method6060() {
	return false;
    }
    
    void method6065(int i, Class175_Sub1 class175_sub1,
		    Interface38 interface38, Interface21 interface21,
		    Interface38 interface38_32_, boolean bool) {
	float f = aClass185_Sub1_3556.method14715();
	float f_33_ = (float) class175_sub1.method2910();
	float f_34_ = (float) class175_sub1.method2911();
	Interface38 interface38_35_ = interface38;
	float f_36_ = f * 2.0F / f_33_;
	float f_37_ = -f * 2.0F / f_34_;
	float[] fs = { -1.0F + f_36_, 1.0F + f_37_, 0.0F, 0.0F, -1.0F + f_36_,
		       -3.0F + f_37_, 0.0F, 2.0F, 3.0F + f_36_, 1.0F + f_37_,
		       2.0F, 0.0F };
	int i_38_ = (int) f_33_;
	int i_39_ = (int) f_34_;
	int i_40_
	    = (bool ? aClass185_Sub1_3556.method3254(-1902763286).method2910()
	       : i_38_);
	int i_41_
	    = (bool ? aClass185_Sub1_3556.method3254(-1585805599).method2911()
	       : i_39_);
	if (i == 0) {
	    i_38_ = 256;
	    i_39_ = 256;
	    aClass269_10180.method4919(aClass278_10175);
	    aClass269_10180.method4913();
	} else if (i == 1) {
	    i_38_ = 256;
	    i_39_ = 256;
	    i_40_ = i_38_;
	    i_41_ = i_39_;
	    aClass269_10180.method4919(aClass278_10183);
	    aClass269_10180.method4913();
	    aClass269_10180.method4974(aClass534_Sub12_Sub1_10189,
				       aFloat10191 / f_33_, 0.0F, 816576087);
	} else if (i == 2) {
	    i_38_ = 256;
	    i_39_ = 256;
	    i_40_ = i_38_;
	    i_41_ = i_39_;
	    aClass269_10180.method4919(aClass278_10183);
	    aClass269_10180.method4913();
	    aClass269_10180.method4974(aClass534_Sub12_Sub1_10189, 0.0F,
				       aFloat10191 / f_34_, 816576087);
	} else if (i == 3) {
	    aClass269_10180.method4919(aClass278_10192);
	    interface38_35_ = interface38_32_;
	    aClass269_10180.method4933(aClass534_Sub12_Sub1_10182, 1,
				       interface38, -601856076);
	    aClass269_10180.method4913();
	}
	float f_42_ = (float) i_38_ / f_33_;
	float f_43_ = (float) i_39_ / f_34_;
	float f_44_ = (float) i_40_ / f_33_;
	float f_45_ = (float) i_41_ / f_34_;
	fs[8] = (fs[8] + 1.0F) * f_42_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_43_ + 1.0F;
	fs[10] *= f_44_;
	fs[7] *= f_45_;
	aClass269_10180.method4929(aClass534_Sub12_Sub1_10185, fs, 1302581457);
	aClass269_10180.method4933(aClass534_Sub12_Sub1_10186, 0,
				   interface38_35_, 1504404054);
	aClass269_10180.method4926(aClass534_Sub12_Sub1_10188, aFloat10178,
				   aFloat10179, aFloat10177, 0.0F, 234988432);
	aClass269_10180.method4926(aClass534_Sub12_Sub1_10190, 0.0F, 0.0F,
				   256.0F / f_33_, 256.0F / f_34_, -961202502);
	aClass185_Sub1_3556.method3318(0, 0, i_38_, i_39_);
    }
    
    void method6075(int i, int i_46_) {
	/* empty */
    }
    
    int method6058() {
	return 1;
    }
    
    void method6108(int i) {
	aClass269_10180.method4910();
    }
    
    int method6085() {
	return 4;
    }
    
    void method6105() {
	/* empty */
    }
    
    boolean method6099() {
	return (aClass185_Sub1_3556.aBool9271
		&& aClass185_Sub1_3556.method14747()
		&& aClass185_Sub1_3556.method14584(true));
    }
    
    void method6087(int i) {
	aClass269_10180.method4910();
    }
    
    void method6080(int i, Class175_Sub1 class175_sub1,
		    Interface38 interface38, Interface21 interface21,
		    Interface38 interface38_47_, boolean bool) {
	float f = aClass185_Sub1_3556.method14715();
	float f_48_ = (float) class175_sub1.method2910();
	float f_49_ = (float) class175_sub1.method2911();
	Interface38 interface38_50_ = interface38;
	float f_51_ = f * 2.0F / f_48_;
	float f_52_ = -f * 2.0F / f_49_;
	float[] fs = { -1.0F + f_51_, 1.0F + f_52_, 0.0F, 0.0F, -1.0F + f_51_,
		       -3.0F + f_52_, 0.0F, 2.0F, 3.0F + f_51_, 1.0F + f_52_,
		       2.0F, 0.0F };
	int i_53_ = (int) f_48_;
	int i_54_ = (int) f_49_;
	int i_55_
	    = (bool ? aClass185_Sub1_3556.method3254(-1403813234).method2910()
	       : i_53_);
	int i_56_
	    = (bool ? aClass185_Sub1_3556.method3254(-748100558).method2911()
	       : i_54_);
	if (i == 0) {
	    i_53_ = 256;
	    i_54_ = 256;
	    aClass269_10180.method4919(aClass278_10175);
	    aClass269_10180.method4913();
	} else if (i == 1) {
	    i_53_ = 256;
	    i_54_ = 256;
	    i_55_ = i_53_;
	    i_56_ = i_54_;
	    aClass269_10180.method4919(aClass278_10183);
	    aClass269_10180.method4913();
	    aClass269_10180.method4974(aClass534_Sub12_Sub1_10189,
				       aFloat10191 / f_48_, 0.0F, 816576087);
	} else if (i == 2) {
	    i_53_ = 256;
	    i_54_ = 256;
	    i_55_ = i_53_;
	    i_56_ = i_54_;
	    aClass269_10180.method4919(aClass278_10183);
	    aClass269_10180.method4913();
	    aClass269_10180.method4974(aClass534_Sub12_Sub1_10189, 0.0F,
				       aFloat10191 / f_49_, 816576087);
	} else if (i == 3) {
	    aClass269_10180.method4919(aClass278_10192);
	    interface38_50_ = interface38_47_;
	    aClass269_10180.method4933(aClass534_Sub12_Sub1_10182, 1,
				       interface38, 1552352841);
	    aClass269_10180.method4913();
	}
	float f_57_ = (float) i_53_ / f_48_;
	float f_58_ = (float) i_54_ / f_49_;
	float f_59_ = (float) i_55_ / f_48_;
	float f_60_ = (float) i_56_ / f_49_;
	fs[8] = (fs[8] + 1.0F) * f_57_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_58_ + 1.0F;
	fs[10] *= f_59_;
	fs[7] *= f_60_;
	aClass269_10180.method4929(aClass534_Sub12_Sub1_10185, fs,
				   -1768076161);
	aClass269_10180.method4933(aClass534_Sub12_Sub1_10186, 0,
				   interface38_50_, 2063545832);
	aClass269_10180.method4926(aClass534_Sub12_Sub1_10188, aFloat10178,
				   aFloat10179, aFloat10177, 0.0F,
				   -1674089124);
	aClass269_10180.method4926(aClass534_Sub12_Sub1_10190, 0.0F, 0.0F,
				   256.0F / f_48_, 256.0F / f_49_,
				   -1105756576);
	aClass185_Sub1_3556.method3318(0, 0, i_53_, i_54_);
    }
    
    void method6092(int i) {
	aClass269_10180.method4910();
    }
}
