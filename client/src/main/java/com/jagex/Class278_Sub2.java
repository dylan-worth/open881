/* Class278_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public final class Class278_Sub2 extends Class278
{
    boolean[] aBoolArray10115;
    boolean aBool10116 = false;
    Class269_Sub2 aClass269_Sub2_10117;
    long aLong10118;
    long aLong10119;
    static float[] aFloatArray10120 = new float[16];
    static final int anInt10121 = 1;
    static final int anInt10122 = 0;
    Class185_Sub1_Sub1 aClass185_Sub1_Sub1_10123;
    byte[] aByteArray10124;
    float[][] aFloatArrayArray10125 = new float[2][];
    byte[] aByteArray10126;
    
    void method5223(int i, float f, float f_0_, float f_1_) {
	int i_2_ = i >> 16;
	int i_3_ = (i & 0xffff) * 4;
	aFloatArrayArray10125[i_2_][i_3_] = f;
	aFloatArrayArray10125[i_2_][i_3_ + 1] = f_0_;
	aFloatArrayArray10125[i_2_][i_3_ + 2] = f_1_;
	aBoolArray10115[i_2_] = true;
    }
    
    Class278_Sub2(Class185_Sub1_Sub1 class185_sub1_sub1, Class277 class277) {
	aBoolArray10115 = new boolean[2];
	aString3052 = class277.aString3044;
	if (class277.aString3048 != null) {
	    aString3051 = class277.aString3048;
	    aByteArray10124 = class185_sub1_sub1.method18013(aString3051);
	}
	if (class277.aString3046 != null) {
	    aString3050 = class277.aString3046;
	    aByteArray10126 = class185_sub1_sub1.method18013(aString3050);
	}
	class185_sub1_sub1.method14617(this);
    }
    
    public void finalize() {
	method15723();
    }
    
    void method5169(Class534_Sub12_Sub1 class534_sub12_sub1, float f) {
	int i = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18738();
	int i_4_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18734();
	if ((class534_sub12_sub1.method18237(-1576040878)
	     != Class264.aClass264_2926)
	    && (class534_sub12_sub1.method18237(375211018)
		!= Class264.aClass264_2874))
	    throw new IllegalArgumentException_Sub1(class534_sub12_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10125[0][i] = f;
	    aBoolArray10115[0] = true;
	}
	if (i_4_ >= 0) {
	    i_4_ *= 4;
	    aFloatArrayArray10125[1][i_4_] = f;
	    aBoolArray10115[1] = true;
	}
    }
    
    void method5212(Class534_Sub12_Sub1 class534_sub12_sub1, float f,
		    float f_5_) {
	int i = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18738();
	int i_6_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18734();
	if (class534_sub12_sub1.method18237(1964053369)
	    != Class264.aClass264_2829)
	    throw new IllegalArgumentException_Sub1(class534_sub12_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10125[0][i + 0] = f;
	    aFloatArrayArray10125[0][i + 1] = f_5_;
	    aBoolArray10115[0] = true;
	}
	if (i_6_ >= 0) {
	    i_6_ *= 4;
	    aFloatArrayArray10125[1][i_6_ + 0] = f;
	    aFloatArrayArray10125[1][i_6_ + 1] = f_5_;
	    aBoolArray10115[1] = true;
	}
    }
    
    void method15721() {
	if (aBoolArray10115[0]) {
	    aClass185_Sub1_Sub1_10123.aByteBuffer9266.clear();
	    aClass185_Sub1_Sub1_10123.aByteBuffer9266.asFloatBuffer()
		.put(aFloatArrayArray10125[0]);
	    IDirect3DDevice.SetVertexShaderConstantF
		(aClass185_Sub1_Sub1_10123.aLong11541, 0,
		 aClass185_Sub1_Sub1_10123.aLong9139,
		 aFloatArrayArray10125[0].length / 4);
	    aBoolArray10115[0] = false;
	}
	if (aBoolArray10115[1]) {
	    aClass185_Sub1_Sub1_10123.aByteBuffer9266.clear();
	    aClass185_Sub1_Sub1_10123.aByteBuffer9266.asFloatBuffer()
		.put(aFloatArrayArray10125[1]);
	    IDirect3DDevice.SetPixelShaderConstantF
		(aClass185_Sub1_Sub1_10123.aLong11541, 0,
		 aClass185_Sub1_Sub1_10123.aLong9139,
		 aFloatArrayArray10125[1].length / 4);
	    aBoolArray10115[1] = false;
	}
    }
    
    void method5172(Class534_Sub12_Sub1 class534_sub12_sub1, float f,
		    float f_7_, float f_8_, float f_9_) {
	int i = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18738();
	int i_10_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18734();
	if (class534_sub12_sub1.method18237(-1093185261)
	    != Class264.aClass264_2831)
	    throw new IllegalArgumentException_Sub1(class534_sub12_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10125[0][i + 0] = f;
	    aFloatArrayArray10125[0][i + 1] = f_7_;
	    aFloatArrayArray10125[0][i + 2] = f_8_;
	    aFloatArrayArray10125[0][i + 3] = f_9_;
	    aBoolArray10115[0] = true;
	}
	if (i_10_ >= 0) {
	    i_10_ *= 4;
	    aFloatArrayArray10125[1][i_10_ + 0] = f;
	    aFloatArrayArray10125[1][i_10_ + 1] = f_7_;
	    aFloatArrayArray10125[1][i_10_ + 2] = f_8_;
	    aFloatArrayArray10125[1][i_10_ + 3] = f_9_;
	    aBoolArray10115[1] = true;
	}
    }
    
    void method5174(Class534_Sub12_Sub1 class534_sub12_sub1,
		    Class433 class433) {
	int i = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18738();
	int i_11_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18734();
	if (class534_sub12_sub1.method18237(-1006385651)
	    != Class264.aClass264_2845)
	    throw new IllegalArgumentException_Sub1(class534_sub12_sub1, "");
	if (i >= 0)
	    method15722(i, class433.method6873(aFloatArray10120), 8);
	if (i_11_ >= 0)
	    method15731(i_11_, class433.method6873(aFloatArray10120), 8);
    }
    
    void method5175(Class534_Sub12_Sub1 class534_sub12_sub1,
		    Class433 class433) {
	int i = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18738();
	int i_12_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18734();
	if (class534_sub12_sub1.method18237(-758894380)
	    != Class264.aClass264_2838)
	    throw new IllegalArgumentException_Sub1(class534_sub12_sub1, "");
	if (i >= 0)
	    method15722(i, class433.method6866(aFloatArray10120), 16);
	if (i_12_ >= 0)
	    method15731(i_12_, class433.method6866(aFloatArray10120), 16);
    }
    
    void method5166(int i, float f, float f_13_, float f_14_, float f_15_) {
	int i_16_ = i >> 16;
	int i_17_ = (i & 0xffff) * 4;
	aFloatArrayArray10125[i_16_][i_17_] = f;
	aFloatArrayArray10125[i_16_][i_17_ + 1] = f_13_;
	aFloatArrayArray10125[i_16_][i_17_ + 2] = f_14_;
	aFloatArrayArray10125[i_16_][i_17_ + 3] = f_15_;
	aBoolArray10115[i_16_] = true;
    }
    
    void method5176(Class534_Sub12_Sub1 class534_sub12_sub1, int i,
		    Interface43 interface43) {
	aClass185_Sub1_Sub1_10123.method14668(i);
	aClass185_Sub1_Sub1_10123.method14669(interface43);
    }
    
    void method5187(int i, Class433 class433) {
	int i_18_ = i >> 16;
	int i_19_ = (i & 0xffff) * 4;
	System.arraycopy(class433.method6866(aFloatArray10120), 0,
			 aFloatArrayArray10125[i_18_], i_19_, 12);
	aBoolArray10115[i_18_] = true;
    }
    
    void method5178(int i, float f, float f_20_, float f_21_, float f_22_) {
	int i_23_ = i >> 16;
	int i_24_ = (i & 0xffff) * 4;
	aFloatArrayArray10125[i_23_][i_24_] = f;
	aFloatArrayArray10125[i_23_][i_24_ + 1] = f_20_;
	aFloatArrayArray10125[i_23_][i_24_ + 2] = f_21_;
	aFloatArrayArray10125[i_23_][i_24_ + 3] = f_22_;
	aBoolArray10115[i_23_] = true;
    }
    
    void method5184(int i, Class433 class433) {
	int i_25_ = i >> 16;
	int i_26_ = (i & 0xffff) * 4;
	System.arraycopy(class433.method6866(aFloatArray10120), 0,
			 aFloatArrayArray10125[i_25_], i_26_, 16);
	aBoolArray10115[i_25_] = true;
    }
    
    void method5181(int i, Class433 class433) {
	int i_27_ = i >> 16;
	int i_28_ = (i & 0xffff) * 4;
	System.arraycopy(class433.method6873(aFloatArray10120), 0,
			 aFloatArrayArray10125[i_27_], i_28_, 8);
	aBoolArray10115[i_27_] = true;
    }
    
    void method5192(Class534_Sub12_Sub1 class534_sub12_sub1, float f,
		    float f_29_, float f_30_, float f_31_) {
	int i = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18738();
	int i_32_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18734();
	if (class534_sub12_sub1.method18237(1316492806)
	    != Class264.aClass264_2831)
	    throw new IllegalArgumentException_Sub1(class534_sub12_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10125[0][i + 0] = f;
	    aFloatArrayArray10125[0][i + 1] = f_29_;
	    aFloatArrayArray10125[0][i + 2] = f_30_;
	    aFloatArrayArray10125[0][i + 3] = f_31_;
	    aBoolArray10115[0] = true;
	}
	if (i_32_ >= 0) {
	    i_32_ *= 4;
	    aFloatArrayArray10125[1][i_32_ + 0] = f;
	    aFloatArrayArray10125[1][i_32_ + 1] = f_29_;
	    aFloatArrayArray10125[1][i_32_ + 2] = f_30_;
	    aFloatArrayArray10125[1][i_32_ + 3] = f_31_;
	    aBoolArray10115[1] = true;
	}
    }
    
    void method5203(int i, Class433 class433) {
	int i_33_ = i >> 16;
	int i_34_ = (i & 0xffff) * 4;
	System.arraycopy(class433.method6873(aFloatArray10120), 0,
			 aFloatArrayArray10125[i_33_], i_34_, 8);
	aBoolArray10115[i_33_] = true;
    }
    
    final void method15722(int i, float[] fs, int i_35_) {
	Class688.method13986(fs, 0, aFloatArrayArray10125[0], i * 4, i_35_);
	aBoolArray10115[0] = true;
    }
    
    void method5205(int i, Class433 class433) {
	int i_36_ = i >> 16;
	int i_37_ = (i & 0xffff) * 4;
	System.arraycopy(class433.method6866(aFloatArray10120), 0,
			 aFloatArrayArray10125[i_36_], i_37_, 12);
	aBoolArray10115[i_36_] = true;
    }
    
    void method5183(int i, int i_38_, Interface43 interface43) {
	aClass185_Sub1_Sub1_10123.method14668(i_38_);
	aClass185_Sub1_Sub1_10123.method14669(interface43);
    }
    
    Class278_Sub2(Class185_Sub1_Sub1 class185_sub1_sub1,
		  Class269_Sub2 class269_sub2, Class277 class277) {
	this(class185_sub1_sub1, class277);
	aClass185_Sub1_Sub1_10123 = class185_sub1_sub1;
	aClass269_Sub2_10117 = class269_sub2;
    }
    
    void method5180(int i, Class433 class433) {
	int i_39_ = i >> 16;
	int i_40_ = (i & 0xffff) * 4;
	System.arraycopy(class433.method6866(aFloatArray10120), 0,
			 aFloatArrayArray10125[i_39_], i_40_, 12);
	aBoolArray10115[i_39_] = true;
    }
    
    void method15723() {
	if (aLong10118 != 0L) {
	    aClass185_Sub1_Sub1_10123.method18018(aLong10118);
	    aLong10118 = 0L;
	}
	if (aLong10119 != 0L) {
	    aClass185_Sub1_Sub1_10123.method18018(aLong10119);
	    aLong10119 = 0L;
	}
    }
    
    void method5201(Class534_Sub12_Sub1 class534_sub12_sub1, float[] fs,
		    int i) {
	int i_41_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18738();
	int i_42_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18734();
	if (class534_sub12_sub1.method18237(1681625373)
	    != Class264.aClass264_2806)
	    throw new IllegalArgumentException_Sub1(class534_sub12_sub1, "");
	if (i_41_ >= 0)
	    method15722(i_41_, fs, i);
	if (i_42_ >= 0)
	    method15731(i_42_, fs, i);
    }
    
    public void method143() {
	if (aLong10118 != 0L) {
	    IUnknown.Release(aLong10118);
	    aLong10118 = 0L;
	}
	if (aLong10119 != 0L) {
	    IUnknown.Release(aLong10119);
	    aLong10119 = 0L;
	}
	aClass185_Sub1_Sub1_10123.method14582(this);
    }
    
    public void method141() {
	if (aLong10118 != 0L) {
	    IUnknown.Release(aLong10118);
	    aLong10118 = 0L;
	}
	if (aLong10119 != 0L) {
	    IUnknown.Release(aLong10119);
	    aLong10119 = 0L;
	}
	aClass185_Sub1_Sub1_10123.method14582(this);
    }
    
    public void method144() {
	if (aLong10118 != 0L) {
	    IUnknown.Release(aLong10118);
	    aLong10118 = 0L;
	}
	if (aLong10119 != 0L) {
	    IUnknown.Release(aLong10119);
	    aLong10119 = 0L;
	}
	aClass185_Sub1_Sub1_10123.method14582(this);
    }
    
    void method15724() {
	method15723();
    }
    
    void method15725() {
	method15723();
    }
    
    final void method15726(int i, float[] fs, int i_43_) {
	Class688.method13986(fs, 0, aFloatArrayArray10125[0], i * 4, i_43_);
	aBoolArray10115[0] = true;
    }
    
    public boolean method5185() {
	if (aBool10116)
	    return true;
	aLong10118
	    = (aByteArray10124 == null ? 0L
	       : IDirect3DDevice.CreateVertexShader((aClass185_Sub1_Sub1_10123
						     .aLong11541),
						    aByteArray10124));
	aLong10119
	    = (aByteArray10126 == null ? 0L
	       : IDirect3DDevice.CreatePixelShader((aClass185_Sub1_Sub1_10123
						    .aLong11541),
						   aByteArray10126));
	if (aLong10118 == 0L && aLong10119 == 0L)
	    return false;
	int i = -1;
	for (int i_44_ = 0; i_44_ < aClass269_Sub2_10117.method4984((byte) 11);
	     i_44_++) {
	    if (aClass269_Sub2_10117.method4916(i_44_, 56453164) == this) {
		i = i_44_;
		break;
	    }
	}
	int i_45_ = aClass269_Sub2_10117.method4946((byte) 14);
	int i_46_ = aClass269_Sub2_10117.method4943((byte) 4);
	for (int i_47_ = 0; i_47_ < i_45_; i_47_++) {
	    Class534_Sub12_Sub1 class534_sub12_sub1
		= aClass269_Sub2_10117.method4947(i_47_, 1950577978);
	    class534_sub12_sub1.method18235(i);
	}
	for (int i_48_ = 0; i_48_ < i_46_; i_48_++) {
	    Class534_Sub12_Sub1 class534_sub12_sub1
		= aClass269_Sub2_10117.method4944(i_48_, 399381201);
	    class534_sub12_sub1.method18235(i);
	}
	int i_49_ = 0;
	int i_50_ = 0;
	int i_51_ = aClass269_Sub2_10117.method4917(this, (byte) -51);
	for (int i_52_ = 0; i_52_ < i_45_ + i_46_; i_52_++) {
	    Class534_Sub12_Sub1_Sub2 class534_sub12_sub1_sub2
		= ((Class534_Sub12_Sub1_Sub2)
		   (i_52_ < i_45_
		    ? aClass269_Sub2_10117.method4947(i_52_, -500780098)
		    : aClass269_Sub2_10117.method4944(i_52_ - i_45_,
						      772147318)));
	    Class264 class264
		= class534_sub12_sub1_sub2.method18237(1023639851);
	    int i_53_ = 1;
	    if (class264 == Class264.aClass264_2806) {
		class264 = class534_sub12_sub1_sub2.method18247(-1950942305);
		i_53_ = class534_sub12_sub1_sub2.method18241(97185202);
	    }
	    switch (class264.anInt2929 * 2142101689) {
	    default:
		i_53_ = 0;
		break;
	    case 0:
	    case 17:
	    case 33:
	    case 76:
		i_53_ *= 4;
		break;
	    case 35:
	    case 52:
	    case 60:
	    case 74:
	    case 92:
		break;
	    case 37:
	    case 55:
	    case 73:
	    case 106:
		i_53_ *= 2;
		break;
	    case 21:
	    case 91:
	    case 93:
	    case 104:
		i_53_ *= 3;
	    }
	    if (class534_sub12_sub1_sub2.anIntArray12109[i_51_] >= 0) {
		int i_54_
		    = class534_sub12_sub1_sub2.anIntArray12109[i_51_] + i_53_;
		if (i_49_ < i_54_)
		    i_49_ = i_54_;
	    }
	    if (class534_sub12_sub1_sub2.anIntArray12108[i_51_] >= 0) {
		int i_55_
		    = class534_sub12_sub1_sub2.anIntArray12108[i_51_] + i_53_;
		if (i_50_ < i_55_)
		    i_50_ = i_55_;
	    }
	}
	aFloatArrayArray10125[0] = new float[i_49_ * 4];
	aFloatArrayArray10125[1] = new float[i_50_ * 4];
	aBool10116 = true;
	return true;
    }
    
    public void method142() {
	if (aLong10118 != 0L) {
	    IUnknown.Release(aLong10118);
	    aLong10118 = 0L;
	}
	if (aLong10119 != 0L) {
	    IUnknown.Release(aLong10119);
	    aLong10119 = 0L;
	}
	aClass185_Sub1_Sub1_10123.method14582(this);
    }
    
    void method5221(Class534_Sub12_Sub1 class534_sub12_sub1, float f) {
	int i = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18738();
	int i_56_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18734();
	if ((class534_sub12_sub1.method18237(652042188)
	     != Class264.aClass264_2926)
	    && (class534_sub12_sub1.method18237(194286906)
		!= Class264.aClass264_2874))
	    throw new IllegalArgumentException_Sub1(class534_sub12_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10125[0][i] = f;
	    aBoolArray10115[0] = true;
	}
	if (i_56_ >= 0) {
	    i_56_ *= 4;
	    aFloatArrayArray10125[1][i_56_] = f;
	    aBoolArray10115[1] = true;
	}
    }
    
    void method5170(Class534_Sub12_Sub1 class534_sub12_sub1, float f) {
	int i = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18738();
	int i_57_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18734();
	if ((class534_sub12_sub1.method18237(963855690)
	     != Class264.aClass264_2926)
	    && (class534_sub12_sub1.method18237(682569291)
		!= Class264.aClass264_2874))
	    throw new IllegalArgumentException_Sub1(class534_sub12_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10125[0][i] = f;
	    aBoolArray10115[0] = true;
	}
	if (i_57_ >= 0) {
	    i_57_ *= 4;
	    aFloatArrayArray10125[1][i_57_] = f;
	    aBoolArray10115[1] = true;
	}
    }
    
    void method15727() {
	if (aBoolArray10115[0]) {
	    aClass185_Sub1_Sub1_10123.aByteBuffer9266.clear();
	    aClass185_Sub1_Sub1_10123.aByteBuffer9266.asFloatBuffer()
		.put(aFloatArrayArray10125[0]);
	    IDirect3DDevice.SetVertexShaderConstantF
		(aClass185_Sub1_Sub1_10123.aLong11541, 0,
		 aClass185_Sub1_Sub1_10123.aLong9139,
		 aFloatArrayArray10125[0].length / 4);
	    aBoolArray10115[0] = false;
	}
	if (aBoolArray10115[1]) {
	    aClass185_Sub1_Sub1_10123.aByteBuffer9266.clear();
	    aClass185_Sub1_Sub1_10123.aByteBuffer9266.asFloatBuffer()
		.put(aFloatArrayArray10125[1]);
	    IDirect3DDevice.SetPixelShaderConstantF
		(aClass185_Sub1_Sub1_10123.aLong11541, 0,
		 aClass185_Sub1_Sub1_10123.aLong9139,
		 aFloatArrayArray10125[1].length / 4);
	    aBoolArray10115[1] = false;
	}
    }
    
    void method5190(Class534_Sub12_Sub1 class534_sub12_sub1, float f,
		    float f_58_) {
	int i = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18738();
	int i_59_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18734();
	if (class534_sub12_sub1.method18237(1777189296)
	    != Class264.aClass264_2829)
	    throw new IllegalArgumentException_Sub1(class534_sub12_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10125[0][i + 0] = f;
	    aFloatArrayArray10125[0][i + 1] = f_58_;
	    aBoolArray10115[0] = true;
	}
	if (i_59_ >= 0) {
	    i_59_ *= 4;
	    aFloatArrayArray10125[1][i_59_ + 0] = f;
	    aFloatArrayArray10125[1][i_59_ + 1] = f_58_;
	    aBoolArray10115[1] = true;
	}
    }
    
    void method5191(Class534_Sub12_Sub1 class534_sub12_sub1, float f,
		    float f_60_) {
	int i = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18738();
	int i_61_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18734();
	if (class534_sub12_sub1.method18237(1401520992)
	    != Class264.aClass264_2829)
	    throw new IllegalArgumentException_Sub1(class534_sub12_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10125[0][i + 0] = f;
	    aFloatArrayArray10125[0][i + 1] = f_60_;
	    aBoolArray10115[0] = true;
	}
	if (i_61_ >= 0) {
	    i_61_ *= 4;
	    aFloatArrayArray10125[1][i_61_ + 0] = f;
	    aFloatArrayArray10125[1][i_61_ + 1] = f_60_;
	    aBoolArray10115[1] = true;
	}
    }
    
    void method5189(Class534_Sub12_Sub1 class534_sub12_sub1, float f) {
	int i = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18738();
	int i_62_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18734();
	if ((class534_sub12_sub1.method18237(-1067959909)
	     != Class264.aClass264_2926)
	    && (class534_sub12_sub1.method18237(-1828814650)
		!= Class264.aClass264_2874))
	    throw new IllegalArgumentException_Sub1(class534_sub12_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10125[0][i] = f;
	    aBoolArray10115[0] = true;
	}
	if (i_62_ >= 0) {
	    i_62_ *= 4;
	    aFloatArrayArray10125[1][i_62_] = f;
	    aBoolArray10115[1] = true;
	}
    }
    
    void method5193(Class534_Sub12_Sub1 class534_sub12_sub1,
		    Class433 class433) {
	int i = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18738();
	int i_63_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18734();
	if (class534_sub12_sub1.method18237(1672882684)
	    != Class264.aClass264_2838)
	    throw new IllegalArgumentException_Sub1(class534_sub12_sub1, "");
	if (i >= 0)
	    method15722(i, class433.method6866(aFloatArray10120), 16);
	if (i_63_ >= 0)
	    method15731(i_63_, class433.method6866(aFloatArray10120), 16);
    }
    
    void method5220(Class534_Sub12_Sub1 class534_sub12_sub1,
		    Class433 class433) {
	int i = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18738();
	int i_64_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18734();
	if (class534_sub12_sub1.method18237(963981872)
	    != Class264.aClass264_2838)
	    throw new IllegalArgumentException_Sub1(class534_sub12_sub1, "");
	if (i >= 0)
	    method15722(i, class433.method6866(aFloatArray10120), 16);
	if (i_64_ >= 0)
	    method15731(i_64_, class433.method6866(aFloatArray10120), 16);
    }
    
    void method5173(int i, int i_65_, Interface43 interface43) {
	aClass185_Sub1_Sub1_10123.method14668(i_65_);
	aClass185_Sub1_Sub1_10123.method14669(interface43);
    }
    
    void method5196(int i, float f, float f_66_, float f_67_, float f_68_) {
	int i_69_ = i >> 16;
	int i_70_ = (i & 0xffff) * 4;
	aFloatArrayArray10125[i_69_][i_70_] = f;
	aFloatArrayArray10125[i_69_][i_70_ + 1] = f_66_;
	aFloatArrayArray10125[i_69_][i_70_ + 2] = f_67_;
	aFloatArrayArray10125[i_69_][i_70_ + 3] = f_68_;
	aBoolArray10115[i_69_] = true;
    }
    
    void method5197(int i, float f, float f_71_, float f_72_, float f_73_) {
	int i_74_ = i >> 16;
	int i_75_ = (i & 0xffff) * 4;
	aFloatArrayArray10125[i_74_][i_75_] = f;
	aFloatArrayArray10125[i_74_][i_75_ + 1] = f_71_;
	aFloatArrayArray10125[i_74_][i_75_ + 2] = f_72_;
	aFloatArrayArray10125[i_74_][i_75_ + 3] = f_73_;
	aBoolArray10115[i_74_] = true;
    }
    
    void method5198(int i, float f, float f_76_, float f_77_, float f_78_) {
	int i_79_ = i >> 16;
	int i_80_ = (i & 0xffff) * 4;
	aFloatArrayArray10125[i_79_][i_80_] = f;
	aFloatArrayArray10125[i_79_][i_80_ + 1] = f_76_;
	aFloatArrayArray10125[i_79_][i_80_ + 2] = f_77_;
	aFloatArrayArray10125[i_79_][i_80_ + 3] = f_78_;
	aBoolArray10115[i_79_] = true;
    }
    
    void method5199(int i, float[] fs, int i_81_) {
	int i_82_ = i >> 16;
	int i_83_ = (i & 0xffff) * 4;
	System.arraycopy(fs, 0, aFloatArrayArray10125[i_82_], i_83_, i_81_);
	aBoolArray10115[i_82_] = true;
    }
    
    void method5200(int i, float[] fs, int i_84_) {
	int i_85_ = i >> 16;
	int i_86_ = (i & 0xffff) * 4;
	System.arraycopy(fs, 0, aFloatArrayArray10125[i_85_], i_86_, i_84_);
	aBoolArray10115[i_85_] = true;
    }
    
    void method5202(int i, Class433 class433) {
	int i_87_ = i >> 16;
	int i_88_ = (i & 0xffff) * 4;
	System.arraycopy(class433.method6866(aFloatArray10120), 0,
			 aFloatArrayArray10125[i_87_], i_88_, 12);
	aBoolArray10115[i_87_] = true;
    }
    
    void method5222(int i, float f, float f_89_, float f_90_) {
	int i_91_ = i >> 16;
	int i_92_ = (i & 0xffff) * 4;
	aFloatArrayArray10125[i_91_][i_92_] = f;
	aFloatArrayArray10125[i_91_][i_92_ + 1] = f_89_;
	aFloatArrayArray10125[i_91_][i_92_ + 2] = f_90_;
	aBoolArray10115[i_91_] = true;
    }
    
    void method5204(int i, Class433 class433) {
	int i_93_ = i >> 16;
	int i_94_ = (i & 0xffff) * 4;
	System.arraycopy(class433.method6866(aFloatArray10120), 0,
			 aFloatArrayArray10125[i_93_], i_94_, 12);
	aBoolArray10115[i_93_] = true;
    }
    
    void method5207(int i, Class433 class433) {
	int i_95_ = i >> 16;
	int i_96_ = (i & 0xffff) * 4;
	System.arraycopy(class433.method6866(aFloatArray10120), 0,
			 aFloatArrayArray10125[i_95_], i_96_, 16);
	aBoolArray10115[i_95_] = true;
    }
    
    void method15728() {
	method15723();
    }
    
    void method5214(Class534_Sub12_Sub1 class534_sub12_sub1,
		    Class433 class433) {
	int i = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18738();
	int i_97_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18734();
	if (class534_sub12_sub1.method18237(1642152490)
	    != Class264.aClass264_2845)
	    throw new IllegalArgumentException_Sub1(class534_sub12_sub1, "");
	if (i >= 0)
	    method15722(i, class433.method6873(aFloatArray10120), 8);
	if (i_97_ >= 0)
	    method15731(i_97_, class433.method6873(aFloatArray10120), 8);
    }
    
    void method5194(int i, float[] fs, int i_98_) {
	int i_99_ = i >> 16;
	int i_100_ = (i & 0xffff) * 4;
	System.arraycopy(fs, 0, aFloatArrayArray10125[i_99_], i_100_, i_98_);
	aBoolArray10115[i_99_] = true;
    }
    
    public boolean method5186() {
	if (aBool10116)
	    return true;
	aLong10118
	    = (aByteArray10124 == null ? 0L
	       : IDirect3DDevice.CreateVertexShader((aClass185_Sub1_Sub1_10123
						     .aLong11541),
						    aByteArray10124));
	aLong10119
	    = (aByteArray10126 == null ? 0L
	       : IDirect3DDevice.CreatePixelShader((aClass185_Sub1_Sub1_10123
						    .aLong11541),
						   aByteArray10126));
	if (aLong10118 == 0L && aLong10119 == 0L)
	    return false;
	int i = -1;
	for (int i_101_ = 0;
	     i_101_ < aClass269_Sub2_10117.method4984((byte) 103); i_101_++) {
	    if (aClass269_Sub2_10117.method4916(i_101_, 56453164) == this) {
		i = i_101_;
		break;
	    }
	}
	int i_102_ = aClass269_Sub2_10117.method4946((byte) 14);
	int i_103_ = aClass269_Sub2_10117.method4943((byte) 4);
	for (int i_104_ = 0; i_104_ < i_102_; i_104_++) {
	    Class534_Sub12_Sub1 class534_sub12_sub1
		= aClass269_Sub2_10117.method4947(i_104_, -1741570026);
	    class534_sub12_sub1.method18235(i);
	}
	for (int i_105_ = 0; i_105_ < i_103_; i_105_++) {
	    Class534_Sub12_Sub1 class534_sub12_sub1
		= aClass269_Sub2_10117.method4944(i_105_, -543491061);
	    class534_sub12_sub1.method18235(i);
	}
	int i_106_ = 0;
	int i_107_ = 0;
	int i_108_ = aClass269_Sub2_10117.method4917(this, (byte) 68);
	for (int i_109_ = 0; i_109_ < i_102_ + i_103_; i_109_++) {
	    Class534_Sub12_Sub1_Sub2 class534_sub12_sub1_sub2
		= ((Class534_Sub12_Sub1_Sub2)
		   (i_109_ < i_102_
		    ? aClass269_Sub2_10117.method4947(i_109_, 1781669565)
		    : aClass269_Sub2_10117.method4944(i_109_ - i_102_,
						      -1978826737)));
	    Class264 class264
		= class534_sub12_sub1_sub2.method18237(-1147487487);
	    int i_110_ = 1;
	    if (class264 == Class264.aClass264_2806) {
		class264 = class534_sub12_sub1_sub2.method18247(-1950942305);
		i_110_ = class534_sub12_sub1_sub2.method18241(97185202);
	    }
	    switch (class264.anInt2929 * 2142101689) {
	    default:
		i_110_ = 0;
		break;
	    case 0:
	    case 17:
	    case 33:
	    case 76:
		i_110_ *= 4;
		break;
	    case 35:
	    case 52:
	    case 60:
	    case 74:
	    case 92:
		break;
	    case 37:
	    case 55:
	    case 73:
	    case 106:
		i_110_ *= 2;
		break;
	    case 21:
	    case 91:
	    case 93:
	    case 104:
		i_110_ *= 3;
	    }
	    if (class534_sub12_sub1_sub2.anIntArray12109[i_108_] >= 0) {
		int i_111_ = (class534_sub12_sub1_sub2.anIntArray12109[i_108_]
			      + i_110_);
		if (i_106_ < i_111_)
		    i_106_ = i_111_;
	    }
	    if (class534_sub12_sub1_sub2.anIntArray12108[i_108_] >= 0) {
		int i_112_ = (class534_sub12_sub1_sub2.anIntArray12108[i_108_]
			      + i_110_);
		if (i_107_ < i_112_)
		    i_107_ = i_112_;
	    }
	}
	aFloatArrayArray10125[0] = new float[i_106_ * 4];
	aFloatArrayArray10125[1] = new float[i_107_ * 4];
	aBool10116 = true;
	return true;
    }
    
    public boolean method5182() {
	if (aBool10116)
	    return true;
	aLong10118
	    = (aByteArray10124 == null ? 0L
	       : IDirect3DDevice.CreateVertexShader((aClass185_Sub1_Sub1_10123
						     .aLong11541),
						    aByteArray10124));
	aLong10119
	    = (aByteArray10126 == null ? 0L
	       : IDirect3DDevice.CreatePixelShader((aClass185_Sub1_Sub1_10123
						    .aLong11541),
						   aByteArray10126));
	if (aLong10118 == 0L && aLong10119 == 0L)
	    return false;
	int i = -1;
	for (int i_113_ = 0;
	     i_113_ < aClass269_Sub2_10117.method4984((byte) 46); i_113_++) {
	    if (aClass269_Sub2_10117.method4916(i_113_, 56453164) == this) {
		i = i_113_;
		break;
	    }
	}
	int i_114_ = aClass269_Sub2_10117.method4946((byte) 14);
	int i_115_ = aClass269_Sub2_10117.method4943((byte) 4);
	for (int i_116_ = 0; i_116_ < i_114_; i_116_++) {
	    Class534_Sub12_Sub1 class534_sub12_sub1
		= aClass269_Sub2_10117.method4947(i_116_, -612380180);
	    class534_sub12_sub1.method18235(i);
	}
	for (int i_117_ = 0; i_117_ < i_115_; i_117_++) {
	    Class534_Sub12_Sub1 class534_sub12_sub1
		= aClass269_Sub2_10117.method4944(i_117_, -1828994788);
	    class534_sub12_sub1.method18235(i);
	}
	int i_118_ = 0;
	int i_119_ = 0;
	int i_120_ = aClass269_Sub2_10117.method4917(this, (byte) 120);
	for (int i_121_ = 0; i_121_ < i_114_ + i_115_; i_121_++) {
	    Class534_Sub12_Sub1_Sub2 class534_sub12_sub1_sub2
		= ((Class534_Sub12_Sub1_Sub2)
		   (i_121_ < i_114_
		    ? aClass269_Sub2_10117.method4947(i_121_, -646251517)
		    : aClass269_Sub2_10117.method4944(i_121_ - i_114_,
						      784346868)));
	    Class264 class264 = class534_sub12_sub1_sub2.method18237(46203274);
	    int i_122_ = 1;
	    if (class264 == Class264.aClass264_2806) {
		class264 = class534_sub12_sub1_sub2.method18247(-1950942305);
		i_122_ = class534_sub12_sub1_sub2.method18241(97185202);
	    }
	    switch (class264.anInt2929 * 2142101689) {
	    default:
		i_122_ = 0;
		break;
	    case 0:
	    case 17:
	    case 33:
	    case 76:
		i_122_ *= 4;
		break;
	    case 35:
	    case 52:
	    case 60:
	    case 74:
	    case 92:
		break;
	    case 37:
	    case 55:
	    case 73:
	    case 106:
		i_122_ *= 2;
		break;
	    case 21:
	    case 91:
	    case 93:
	    case 104:
		i_122_ *= 3;
	    }
	    if (class534_sub12_sub1_sub2.anIntArray12109[i_120_] >= 0) {
		int i_123_ = (class534_sub12_sub1_sub2.anIntArray12109[i_120_]
			      + i_122_);
		if (i_118_ < i_123_)
		    i_118_ = i_123_;
	    }
	    if (class534_sub12_sub1_sub2.anIntArray12108[i_120_] >= 0) {
		int i_124_ = (class534_sub12_sub1_sub2.anIntArray12108[i_120_]
			      + i_122_);
		if (i_119_ < i_124_)
		    i_119_ = i_124_;
	    }
	}
	aFloatArrayArray10125[0] = new float[i_118_ * 4];
	aFloatArrayArray10125[1] = new float[i_119_ * 4];
	aBool10116 = true;
	return true;
    }
    
    void method5210(Class534_Sub12_Sub1 class534_sub12_sub1, float f,
		    float f_125_, float f_126_) {
	int i = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18738();
	int i_127_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18734();
	if (class534_sub12_sub1.method18237(1050306499)
	    != Class264.aClass264_2815)
	    throw new IllegalArgumentException_Sub1(class534_sub12_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10125[0][i + 0] = f;
	    aFloatArrayArray10125[0][i + 1] = f_125_;
	    aFloatArrayArray10125[0][i + 2] = f_126_;
	    aBoolArray10115[0] = true;
	}
	if (i_127_ >= 0) {
	    i_127_ *= 4;
	    aFloatArrayArray10125[1][i_127_ + 0] = f;
	    aFloatArrayArray10125[1][i_127_ + 1] = f_125_;
	    aFloatArrayArray10125[1][i_127_ + 2] = f_126_;
	    aBoolArray10115[1] = true;
	}
    }
    
    void method5211(Class534_Sub12_Sub1 class534_sub12_sub1, float f,
		    float f_128_, float f_129_) {
	int i = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18738();
	int i_130_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18734();
	if (class534_sub12_sub1.method18237(1944800616)
	    != Class264.aClass264_2815)
	    throw new IllegalArgumentException_Sub1(class534_sub12_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10125[0][i + 0] = f;
	    aFloatArrayArray10125[0][i + 1] = f_128_;
	    aFloatArrayArray10125[0][i + 2] = f_129_;
	    aBoolArray10115[0] = true;
	}
	if (i_130_ >= 0) {
	    i_130_ *= 4;
	    aFloatArrayArray10125[1][i_130_ + 0] = f;
	    aFloatArrayArray10125[1][i_130_ + 1] = f_128_;
	    aFloatArrayArray10125[1][i_130_ + 2] = f_129_;
	    aBoolArray10115[1] = true;
	}
    }
    
    void method5215(Class534_Sub12_Sub1 class534_sub12_sub1, float[] fs,
		    int i) {
	int i_131_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18738();
	int i_132_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18734();
	if (class534_sub12_sub1.method18237(777304745)
	    != Class264.aClass264_2806)
	    throw new IllegalArgumentException_Sub1(class534_sub12_sub1, "");
	if (i_131_ >= 0)
	    method15722(i_131_, fs, i);
	if (i_132_ >= 0)
	    method15731(i_132_, fs, i);
    }
    
    void method5213(Class534_Sub12_Sub1 class534_sub12_sub1,
		    Class433 class433) {
	int i = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18738();
	int i_133_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18734();
	if (class534_sub12_sub1.method18237(-82031577)
	    != Class264.aClass264_2845)
	    throw new IllegalArgumentException_Sub1(class534_sub12_sub1, "");
	if (i >= 0)
	    method15722(i, class433.method6873(aFloatArray10120), 8);
	if (i_133_ >= 0)
	    method15731(i_133_, class433.method6873(aFloatArray10120), 8);
    }
    
    void method5206(Class534_Sub12_Sub1 class534_sub12_sub1,
		    Class433 class433) {
	int i = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18738();
	int i_134_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18734();
	if (class534_sub12_sub1.method18237(-1781267192)
	    != Class264.aClass264_2845)
	    throw new IllegalArgumentException_Sub1(class534_sub12_sub1, "");
	if (i >= 0)
	    method15722(i, class433.method6873(aFloatArray10120), 8);
	if (i_134_ >= 0)
	    method15731(i_134_, class433.method6873(aFloatArray10120), 8);
    }
    
    void method5208(int i, int i_135_, Interface43 interface43) {
	aClass185_Sub1_Sub1_10123.method14668(i_135_);
	aClass185_Sub1_Sub1_10123.method14669(interface43);
    }
    
    void method5219(Class534_Sub12_Sub1 class534_sub12_sub1, int i,
		    Interface43 interface43) {
	aClass185_Sub1_Sub1_10123.method14668(i);
	aClass185_Sub1_Sub1_10123.method14669(interface43);
    }
    
    void method5195(Class534_Sub12_Sub1 class534_sub12_sub1, float[] fs,
		    int i) {
	int i_136_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18738();
	int i_137_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18734();
	if (class534_sub12_sub1.method18237(694542472)
	    != Class264.aClass264_2806)
	    throw new IllegalArgumentException_Sub1(class534_sub12_sub1, "");
	if (i_136_ >= 0)
	    method15722(i_136_, fs, i);
	if (i_137_ >= 0)
	    method15731(i_137_, fs, i);
    }
    
    void method5188(Class534_Sub12_Sub1 class534_sub12_sub1, int i,
		    Interface43 interface43) {
	aClass185_Sub1_Sub1_10123.method14668(i);
	aClass185_Sub1_Sub1_10123.method14669(interface43);
    }
    
    void method5218(Class534_Sub12_Sub1 class534_sub12_sub1, int i,
		    Interface43 interface43) {
	aClass185_Sub1_Sub1_10123.method14668(i);
	aClass185_Sub1_Sub1_10123.method14669(interface43);
    }
    
    void method5171(Class534_Sub12_Sub1 class534_sub12_sub1, float f,
		    float f_138_, float f_139_) {
	int i = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18738();
	int i_140_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18734();
	if (class534_sub12_sub1.method18237(882206529)
	    != Class264.aClass264_2815)
	    throw new IllegalArgumentException_Sub1(class534_sub12_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10125[0][i + 0] = f;
	    aFloatArrayArray10125[0][i + 1] = f_138_;
	    aFloatArrayArray10125[0][i + 2] = f_139_;
	    aBoolArray10115[0] = true;
	}
	if (i_140_ >= 0) {
	    i_140_ *= 4;
	    aFloatArrayArray10125[1][i_140_ + 0] = f;
	    aFloatArrayArray10125[1][i_140_ + 1] = f_138_;
	    aFloatArrayArray10125[1][i_140_ + 2] = f_139_;
	    aBoolArray10115[1] = true;
	}
    }
    
    void method5209(int i, float f, float f_141_, float f_142_) {
	int i_143_ = i >> 16;
	int i_144_ = (i & 0xffff) * 4;
	aFloatArrayArray10125[i_143_][i_144_] = f;
	aFloatArrayArray10125[i_143_][i_144_ + 1] = f_141_;
	aFloatArrayArray10125[i_143_][i_144_ + 2] = f_142_;
	aBoolArray10115[i_143_] = true;
    }
    
    void method5168(int i, float f, float f_145_, float f_146_) {
	int i_147_ = i >> 16;
	int i_148_ = (i & 0xffff) * 4;
	aFloatArrayArray10125[i_147_][i_148_] = f;
	aFloatArrayArray10125[i_147_][i_148_ + 1] = f_145_;
	aFloatArrayArray10125[i_147_][i_148_ + 2] = f_146_;
	aBoolArray10115[i_147_] = true;
    }
    
    void method5177(int i, float f, float f_149_, float f_150_) {
	int i_151_ = i >> 16;
	int i_152_ = (i & 0xffff) * 4;
	aFloatArrayArray10125[i_151_][i_152_] = f;
	aFloatArrayArray10125[i_151_][i_152_ + 1] = f_149_;
	aFloatArrayArray10125[i_151_][i_152_ + 2] = f_150_;
	aBoolArray10115[i_151_] = true;
    }
    
    void method5216(int i, float[] fs, int i_153_) {
	int i_154_ = i >> 16;
	int i_155_ = (i & 0xffff) * 4;
	System.arraycopy(fs, 0, aFloatArrayArray10125[i_154_], i_155_, i_153_);
	aBoolArray10115[i_154_] = true;
    }
    
    void method5217(Class534_Sub12_Sub1 class534_sub12_sub1, float[] fs,
		    int i) {
	int i_156_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18738();
	int i_157_
	    = ((Class534_Sub12_Sub1_Sub2) class534_sub12_sub1).method18734();
	if (class534_sub12_sub1.method18237(-2096584790)
	    != Class264.aClass264_2806)
	    throw new IllegalArgumentException_Sub1(class534_sub12_sub1, "");
	if (i_156_ >= 0)
	    method15722(i_156_, fs, i);
	if (i_157_ >= 0)
	    method15731(i_157_, fs, i);
    }
    
    final void method15729(int i, float[] fs, int i_158_) {
	Class688.method13986(fs, 0, aFloatArrayArray10125[1], i * 4, i_158_);
	aBoolArray10115[1] = true;
    }
    
    void method15730() {
	if (aBoolArray10115[0]) {
	    aClass185_Sub1_Sub1_10123.aByteBuffer9266.clear();
	    aClass185_Sub1_Sub1_10123.aByteBuffer9266.asFloatBuffer()
		.put(aFloatArrayArray10125[0]);
	    IDirect3DDevice.SetVertexShaderConstantF
		(aClass185_Sub1_Sub1_10123.aLong11541, 0,
		 aClass185_Sub1_Sub1_10123.aLong9139,
		 aFloatArrayArray10125[0].length / 4);
	    aBoolArray10115[0] = false;
	}
	if (aBoolArray10115[1]) {
	    aClass185_Sub1_Sub1_10123.aByteBuffer9266.clear();
	    aClass185_Sub1_Sub1_10123.aByteBuffer9266.asFloatBuffer()
		.put(aFloatArrayArray10125[1]);
	    IDirect3DDevice.SetPixelShaderConstantF
		(aClass185_Sub1_Sub1_10123.aLong11541, 0,
		 aClass185_Sub1_Sub1_10123.aLong9139,
		 aFloatArrayArray10125[1].length / 4);
	    aBoolArray10115[1] = false;
	}
    }
    
    final void method15731(int i, float[] fs, int i_159_) {
	Class688.method13986(fs, 0, aFloatArrayArray10125[1], i * 4, i_159_);
	aBoolArray10115[1] = true;
    }
    
    void method15732() {
	if (aLong10118 != 0L) {
	    aClass185_Sub1_Sub1_10123.method18018(aLong10118);
	    aLong10118 = 0L;
	}
	if (aLong10119 != 0L) {
	    aClass185_Sub1_Sub1_10123.method18018(aLong10119);
	    aLong10119 = 0L;
	}
    }
    
    void method15733() {
	if (aLong10118 != 0L) {
	    aClass185_Sub1_Sub1_10123.method18018(aLong10118);
	    aLong10118 = 0L;
	}
	if (aLong10119 != 0L) {
	    aClass185_Sub1_Sub1_10123.method18018(aLong10119);
	    aLong10119 = 0L;
	}
    }
    
    void method15734() {
	if (aLong10118 != 0L) {
	    aClass185_Sub1_Sub1_10123.method18018(aLong10118);
	    aLong10118 = 0L;
	}
	if (aLong10119 != 0L) {
	    aClass185_Sub1_Sub1_10123.method18018(aLong10119);
	    aLong10119 = 0L;
	}
    }
}
