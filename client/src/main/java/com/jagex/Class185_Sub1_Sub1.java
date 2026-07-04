/* Class185_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;

import jagdx.Class356;
import jagdx.Class366;
import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DLIGHT;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DSurface;
import jagdx.IUnknown;
import jagdx.RuntimeException_Sub5;

public class Class185_Sub1_Sub1 extends Class185_Sub1
{
    int anInt11504;
    int anInt11505;
    long aLong11506 = 0L;
    long aLong11507;
    D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS11508;
    D3DDISPLAYMODE aD3DDISPLAYMODE11509;
    boolean aBool11510;
    boolean aBool11511;
    long aLong11512;
    long aLong11513;
    long aLong11514;
    boolean aBool11515;
    int anInt11516;
    boolean[] aBoolArray11517;
    boolean[] aBoolArray11518;
    boolean[] aBoolArray11519;
    Class372[] aClass372Array11520;
    int[] anIntArray11521;
    Class433 aClass433_11522;
    Class278_Sub2 aClass278_Sub2_11523;
    long aLong11524;
    D3DCAPS aD3DCAPS11525;
    boolean aBool11526;
    boolean aBool11527;
    boolean aBool11528;
    int anInt11529;
    boolean[] aBoolArray11530;
    boolean aBool11531;
    boolean aBool11532;
    boolean aBool11533;
    boolean aBool11534;
    boolean aBool11535;
    float[] aFloatArray11536;
    int[] anIntArray11537;
    boolean aBool11538;
    long[] aLongArray11539;
    Class700 aClass700_11540;
    long aLong11541 = 0L;
    int anInt11542;
    long[] aLongArray11543;
    int anInt11544;
    static final int anInt11545 = 3;
    long[] aLongArray11546;
    static int[] anIntArray11547 = { 77, 80 };
    static int[] anIntArray11548 = { 22, 23 };
    
    public final void method14972(Class374 class374, int i, int i_0_) {
	if (aClass278_Sub2_11523 != null)
	    aClass278_Sub2_11523.method15721();
	IDirect3DDevice.DrawPrimitive(aLong11541, method18016(class374), i,
				      i_0_);
    }
    
    public boolean method14747() {
	return (aD3DCAPS11525.PixelShaderVersion & 0xffff) >= 257;
    }
    
    void method14966() {
	if (aBool9125) {
	    D3DLIGHT.SetDirection(aLong11512, -aFloatArray9197[0],
				  -aFloatArray9197[1], -aFloatArray9197[2]);
	    D3DLIGHT.SetDirection(aLong11513, -aFloatArray9198[0],
				  -aFloatArray9198[1], -aFloatArray9198[2]);
	    aBool11515 = false;
	}
    }
    
    static Class185 method17996
	(Canvas canvas, Class177 class177, Interface25 interface25,
	 Interface45 interface45, Interface48 interface48,
	 Interface46 interface46, Class472 class472, Integer integer) {
	Class185_Sub1_Sub1 class185_sub1_sub1 = null;
	Class185_Sub1_Sub1 class185_sub1_sub1_1_;
	try {
	    int i = 0;
	    int i_2_ = 1;
	    long l = IDirect3D.Direct3DCreate();
	    D3DCAPS d3dcaps = new D3DCAPS();
	    IDirect3D.GetDeviceCaps(l, i, i_2_, d3dcaps);
	    if ((d3dcaps.RasterCaps & 0x1000000) == 0)
		throw new RuntimeException("");
	    if (d3dcaps.MaxSimultaneousTextures < 2)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x2) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x8) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x40) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x200) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x2000000) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x10) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x2) == 0)
		throw new RuntimeException("");
	    if (d3dcaps.MaxActiveLights > 0 && d3dcaps.MaxActiveLights < 2)
		throw new RuntimeException("");
	    if (d3dcaps.MaxStreams < 5)
		throw new RuntimeException("");
	    D3DPRESENT_PARAMETERS d3dpresent_parameters
		= new D3DPRESENT_PARAMETERS(canvas);
	    d3dpresent_parameters.Windowed = true;
	    d3dpresent_parameters.EnableAutoDepthStencil = true;
	    d3dpresent_parameters.BackBufferWidth = canvas.getWidth();
	    d3dpresent_parameters.BackBufferHeight = canvas.getHeight();
	    d3dpresent_parameters.BackBufferCount = 1;
	    d3dpresent_parameters.PresentationInterval = -2147483648;
	    D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	    if (!method18017(i, i_2_, l, integer.intValue(), d3ddisplaymode,
			     d3dpresent_parameters))
		throw new RuntimeException("");
	    int i_3_ = 0;
	    if ((d3dcaps.DevCaps & 0x100000) != 0)
		i_3_ |= 0x10;
	    long l_4_ = 0L;
	    try {
		l_4_ = IDirect3D.CreateDeviceContext(l, i, i_2_, canvas,
						     i_3_ | 0x40,
						     d3dpresent_parameters);
	    } catch (RuntimeException_Sub5 runtimeexception_sub5) {
		l_4_ = IDirect3D.CreateDeviceContext(l, i, i_2_, canvas,
						     i_3_ & ~0x100000 | 0x20,
						     d3dpresent_parameters);
	    }
	    class185_sub1_sub1
		= new Class185_Sub1_Sub1(i, i_2_, l, l_4_, d3ddisplaymode,
					 d3dpresent_parameters, d3dcaps,
					 class177, interface25, interface45,
					 interface48, interface46, class472,
					 integer.intValue());
	    if (!class185_sub1_sub1.aHashtable2014.containsKey(canvas)) {
		Class481.method7927(canvas, -1974570869);
		class185_sub1_sub1.method3256
		    (canvas,
		     new Class175_Sub2_Sub3_Sub1(class185_sub1_sub1, canvas,
						 canvas.getWidth(),
						 canvas.getHeight(), true),
		     (byte) 4);
	    }
	    class185_sub1_sub1.method3258(canvas, -228099710);
	    class185_sub1_sub1.method14594();
	    class185_sub1_sub1_1_ = class185_sub1_sub1;
	} catch (RuntimeException runtimeexception) {
	    if (class185_sub1_sub1 != null)
		class185_sub1_sub1.method3327();
	    throw runtimeexception;
	}
	return class185_sub1_sub1_1_;
    }
    
    Interface38 method14878(Class181 class181, Class173 class173, int i,
			    int i_5_) {
	return new Class420_Sub2(this, class181, class173, i, i_5_);
    }
    
    void method14597() {
	for (Class534_Sub6 class534_sub6
		 = (Class534_Sub6) aClass700_11540.method14135((byte) -1);
	     class534_sub6 != null;
	     class534_sub6
		 = (Class534_Sub6) aClass700_11540.method14139(740409494)) {
	    Interface50 interface50
		= (Interface50) class534_sub6.anObject10417;
	    interface50.method229();
	    if (interface50 == aClass175_1989)
		interface50.method358();
	}
	super.method14597();
    }
    
    void method14596() {
	method3280();
	for (Class534_Sub6 class534_sub6
		 = (Class534_Sub6) aClass700_11540.method14135((byte) -1);
	     class534_sub6 != null;
	     class534_sub6
		 = (Class534_Sub6) aClass700_11540.method14139(1312343435)) {
	    Interface50 interface50
		= (Interface50) class534_sub6.anObject10417;
	    interface50.method142();
	}
	super.method14596();
    }
    
    boolean method17997(int i, int i_6_) {
	int i_7_ = IDirect3DDevice.TestCooperativeLevel(aLong11541);
	if (i_7_ == 0 || i_7_ == -2005530519) {
	    IDirect3DDevice.SetDepthStencilSurface(aLong11541, 0L);
	    for (int i_8_ = 1; i_8_ < 4; i_8_++)
		IDirect3DDevice.SetRenderTarget(aLong11541, i_8_, 0L);
	    for (int i_9_ = 0; i_9_ < 4; i_9_++)
		IDirect3DDevice.SetStreamSource(aLong11541, i_9_, 0L, 0, 0);
	    for (int i_10_ = 0; i_10_ < 4; i_10_++)
		IDirect3DDevice.SetTexture(aLong11541, i_10_, 0L);
	    IDirect3DDevice.SetIndices(aLong11541, 0L);
	    method14596();
	    aD3DPRESENT_PARAMETERS11508.BackBufferWidth = i;
	    aD3DPRESENT_PARAMETERS11508.BackBufferHeight = i_6_;
	    aD3DPRESENT_PARAMETERS11508.BackBufferCount = 1;
	    if (method18017(anInt11542, anInt11504, aLong11506, anInt9263,
			    aD3DDISPLAYMODE11509,
			    aD3DPRESENT_PARAMETERS11508)) {
		int i_11_ = IDirect3DDevice.Reset(aLong11541,
						  aD3DPRESENT_PARAMETERS11508);
		if (Class356.method6310(i_11_)) {
		    aBool11511 = false;
		    method14597();
		    method14718();
		    return true;
		}
	    }
	}
	return false;
    }
    
    void method14718() {
	for (int i = 0; i < anInt9269; i++) {
	    IDirect3DDevice.SetSamplerState(aLong11541, i, 7, 2);
	    IDirect3DDevice.SetSamplerState(aLong11541, i, 6, 2);
	    IDirect3DDevice.SetSamplerState(aLong11541, i, 5, 2);
	    IDirect3DDevice.SetSamplerState(aLong11541, i, 1, 1);
	    IDirect3DDevice.SetSamplerState(aLong11541, i, 2, 1);
	    aClass372Array11520[i] = Class372.aClass372_3888;
	    boolean[] bools = aBoolArray11530;
	    int i_12_ = i;
	    aBoolArray11517[i] = true;
	    bools[i_12_] = true;
	    aBoolArray11519[i] = false;
	    anIntArray11521[i] = 0;
	}
	IDirect3DDevice.SetTextureStageState(aLong11541, 0, 6, 1);
	IDirect3DDevice.SetRenderState(aLong11541, 9, 2);
	IDirect3DDevice.SetRenderState(aLong11541, 23, 4);
	IDirect3DDevice.SetRenderState(aLong11541, 25, 5);
	IDirect3DDevice.SetRenderState(aLong11541, 24, 0);
	IDirect3DDevice.method15839(aLong11541, 206, aBool9161);
	IDirect3DDevice.SetRenderState(aLong11541, 181, 0);
	method18011();
	IDirect3DDevice.SetRenderState(aLong11541, 147, 1);
	IDirect3DDevice.SetRenderState(aLong11541, 145, 1);
	IDirect3DDevice.method15838(aLong11541, 38, 0.95F);
	IDirect3DDevice.SetRenderState(aLong11541, 35, 3);
	IDirect3DDevice.method15838(aLong11541, 154, 1.0F);
	D3DLIGHT.SetType(aLong11512, 3);
	D3DLIGHT.SetType(aLong11513, 3);
	D3DLIGHT.SetType(aLong11514, 1);
	aBool11515 = false;
	super.method14718();
    }
    
    final void method17998(long l) {
	IDirect3DDevice.SetPixelShader(aLong11541, l);
    }
    
    public void method3406(boolean bool) {
	/* empty */
    }
    
    public Interface22 method3276(int i, int i_13_, Class181 class181,
				  Class173 class173, int i_14_) {
	return new Class445(this, class181, class173, i, i_13_, i_14_);
    }
    
    void method3327() {
	super.method3327();
	if (aLong11512 != 0L) {
	    D3DLIGHT.Destroy(aLong11512);
	    aLong11512 = 0L;
	}
	if (aLong11513 != 0L) {
	    D3DLIGHT.Destroy(aLong11513);
	    aLong11513 = 0L;
	}
	if (aLong11514 != 0L) {
	    D3DLIGHT.Destroy(aLong11514);
	    aLong11514 = 0L;
	}
	if (aLong11541 != 0L) {
	    IDirect3DDevice.Destroy(aLong11541);
	    aLong11541 = 0L;
	}
	if (aLong11506 != 0L) {
	    IUnknown.Release(aLong11506);
	    aLong11506 = 0L;
	}
    }
    
    void method14867() {
	int i;
	for (i = 0; i < anInt9129; i++) {
	    Class534_Sub21 class534_sub21 = aClass534_Sub21Array9208[i];
	    int i_15_ = i + 2;
	    int i_16_ = class534_sub21.method16201((byte) 91);
	    float f = class534_sub21.method16202(-693604944) / 255.0F;
	    D3DLIGHT.SetPosition
		(aLong11514, (float) class534_sub21.method16197(1422618519),
		 (float) class534_sub21.method16226(1067845726),
		 (float) class534_sub21.method16199((byte) -105));
	    D3DLIGHT.SetDiffuse(aLong11514, (float) (i_16_ >> 16 & 0xff) * f,
				(float) (i_16_ >> 8 & 0xff) * f,
				(float) (i_16_ & 0xff) * f, 0.0F);
	    D3DLIGHT.SetAttenuation
		(aLong11514, 0.0F, 0.0F,
		 1.0F / (float) (class534_sub21.method16233(-2024362035)
				 * class534_sub21.method16233(-989562296)));
	    D3DLIGHT.SetRange(aLong11514,
			      (float) class534_sub21.method16233(-1080726453));
	    IDirect3DDevice.SetLight(aLong11541, i_15_, aLong11514);
	    IDirect3DDevice.LightEnable(aLong11541, i_15_, true);
	}
	for (/**/; i < anInt9209; i++)
	    IDirect3DDevice.LightEnable(aLong11541, i + 2, false);
    }
    
    public float method14715() {
	return -0.5F;
    }
    
    void method17999(Interface50 interface50) {
	Class534_Sub6 class534_sub6 = method18028(interface50);
	if (class534_sub6 != null)
	    class534_sub6.method8892((byte) 1);
    }
    
    Class175_Sub2 method3262(Canvas canvas, int i, int i_17_) {
	return new Class175_Sub2_Sub3_Sub1(this, canvas, i, i_17_, false);
    }
    
    boolean method14770(Class181 class181, Class173 class173) {
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class356.method6310(IDirect3D.GetAdapterDisplayMode
				    (aLong11506, anInt11542, d3ddisplaymode))
		&& Class356.method6310(IDirect3D.CheckDeviceFormat
				       (aLong11506, anInt11542, anInt11504,
					d3ddisplaymode.Format, 0, 4,
					method18014(class181, class173))));
    }
    
    public Interface21 method3265(int i, int i_18_) {
	return new Class426(this, Class173.aClass173_1828, i, i_18_, 0);
    }
    
    public Interface21 method3266(int i, int i_19_, int i_20_) {
	return new Class426(this, Class173.aClass173_1828, i, i_19_, i_20_);
    }
    
    Interface41 method14886(int i, boolean bool, int[][] is) {
	return new Class420_Sub3(this, i, bool, is);
    }
    
    void method18000(Interface50 interface50) {
	if (method18028(interface50) == null)
	    aClass700_11540.method14131(new Class534_Sub6(interface50),
					(short) 789);
    }
    
    public void method3433(int i, int i_21_, int[] is, int[] is_22_) {
	method18004(i, i_21_, is, is_22_);
    }
    
    public int[] method3267(int i, int i_23_, int i_24_, int i_25_) {
	method3581();
	int[] is = null;
	long l = IDirect3DDevice.GetRenderTarget(aLong11541, 0);
	long l_26_ = IDirect3DDevice.CreateRenderTarget(aLong11541, i_24_,
							i_25_, 21, 0, 0, true);
	int i_27_
	    = IDirect3DDevice.StretchRect(aLong11541, l, i, i_23_, i_24_,
					  i_25_, l_26_, 0, 0, i_24_, i_25_, 1);
	method14586(i_24_ * i_25_ * 4);
	if (Class356.method6310(i_27_)) {
	    is = new int[i_24_ * i_25_];
	    IDirect3DSurface.Download(l_26_, 0, 0, i_24_, i_25_, i_24_ * 4, 16,
				      aLong9139);
	    aByteBuffer9266.clear();
	    aByteBuffer9266.asIntBuffer().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_26_);
	return is;
    }
    
    public void method3268() {
	/* empty */
    }
    
    public boolean method3269() {
	return true;
    }
    
    final void method18001(long l) {
	IDirect3DDevice.SetPixelShader(aLong11541, l);
    }
    
    public boolean method3270() {
	if (aBool11511)
	    return false;
	if (aLongArray11546[anInt11516] != 0L)
	    return false;
	return true;
    }
    
    static final int method18002(Class173 class173) {
	if (class173 == Class173.aClass173_1829)
	    return 80;
	if (class173 == Class173.aClass173_1828)
	    return 77;
	throw new IllegalArgumentException("");
    }
    
    public boolean method3666() {
	return false;
    }
    
    public void method3275(int i, int i_28_, int i_29_) {
	if (aLong11507 == 0L)
	    method18035(i_28_, i_29_);
	long l = IDirect3DDevice.GetRenderTarget(aLong11541, 0);
	if (!Class356.method6309
	     (IDirect3DDevice.StretchRect(aLong11541, l, 0, 0,
					  aClass175_1989.method2910(),
					  aClass175_1989.method2911(),
					  aLong11507, anInt2018 * -1555714981,
					  anInt2019 * -385311879,
					  anInt2020 * 1769547157,
					  anInt2021 * -740019615, 2))) {
	    /* empty */
	}
	IUnknown.Release(l);
	IDirect3DDevice.GetRenderTargetData(aLong11541, aLong11507,
					    aLongArray11543[anInt11516]);
	long l_30_ = IDirect3DDevice.CreateEventQuery(aLong11541);
	if (Class356.method6310(IDirect3DEventQuery.Issue(l_30_)))
	    aLongArray11546[anInt11516] = l_30_;
	anIntArray11537[anInt11516] = i;
	if (++anInt11516 >= 3)
	    anInt11516 = 0;
    }
    
    public int method3273() {
	if (aLongArray11546[anInt11544] == 0L)
	    return -1;
	return ((Class356.method6310
		 (IDirect3DEventQuery.IsSignaled(aLongArray11546[anInt11544])))
		? anIntArray11537[anInt11544] : -1);
    }
    
    public void method3656() {
	for (int i = 0; i < 3; i++) {
	    if (aLongArray11546[i] != 0L) {
		IUnknown.Release(aLongArray11546[i]);
		aLongArray11546[i] = 0L;
	    }
	}
	anInt11516 = 0;
	anInt11544 = 0;
    }
    
    public long method3355(int i, int i_31_) {
	return method18004(i, i_31_, null, null);
    }
    
    static final int method18003(Class373 class373) {
	switch (class373.anInt3894) {
	case 3:
	    return 3;
	default:
	    throw new IllegalArgumentException();
	case 0:
	    return 2;
	case 2:
	    return 1;
	case 1:
	    return 0;
	}
    }
    
    long method18004(int i, int i_32_, int[] is, int[] is_33_) {
	if (aLongArray11546[anInt11544] != 0L) {
	    IUnknown.Release(aLongArray11546[anInt11544]);
	    aLongArray11546[anInt11544] = 0L;
	}
	aByteBuffer9266.clear();
	IDirect3DSurface.Download(aLongArray11543[anInt11544], 0, 0, i, i_32_,
				  i * 4, 0, aLong9139);
	if (++anInt11544 >= 3)
	    anInt11544 = 0;
	if (is != null) {
	    aByteBuffer9266.asIntBuffer().get(is);
	    return 0L;
	}
	return aLong9139;
    }
    
    public void method3277(long l) {
	/* empty */
    }
    
    public void method3280() {
	if (aLong11507 != 0L) {
	    IUnknown.Release(aLong11507);
	    aLong11507 = 0L;
	}
	for (int i = 0; i < 3; i++) {
	    if (aLongArray11546[i] != 0L) {
		IUnknown.Release(aLongArray11546[i]);
		aLongArray11546[i] = 0L;
	    }
	    if (aLongArray11543[i] != 0L) {
		IUnknown.Release(aLongArray11543[i]);
		aLongArray11543[i] = 0L;
	    }
	}
	anInt11516 = 0;
	anInt11544 = 0;
    }
    
    public Class165 method3451(Class165 class165, Class165 class165_34_,
			       float f, Class165 class165_35_) {
	return f < 0.5F ? class165 : class165_34_;
    }
    
    void method14763() {
	if (aBool9125) {
	    D3DLIGHT.SetDirection(aLong11512, -aFloatArray9197[0],
				  -aFloatArray9197[1], -aFloatArray9197[2]);
	    D3DLIGHT.SetDirection(aLong11513, -aFloatArray9198[0],
				  -aFloatArray9198[1], -aFloatArray9198[2]);
	    aBool11515 = false;
	}
    }
    
    Interface38 method14880(Class181 class181, int i, int i_36_, boolean bool,
			    float[] fs, int i_37_, int i_38_) {
	return new Class420_Sub2(this, class181, i, i_36_, bool, fs, i_37_,
				 i_38_);
    }
    
    void method14621() {
	IDirect3DDevice.SetScissorRect(aLong11541, anInt9113 + anInt9178,
				       anInt9189 + anInt9176, anInt9179,
				       anInt9177);
    }
    
    void method14622() {
	IDirect3DDevice.method15839(aLong11541, 174, aBool9294);
    }
    
    public void method3575() {
	long l = IDirect3DDevice.CreateEventQuery(aLong11541);
	if (Class356.method6310(IDirect3DEventQuery.Issue(l))) {
	    for (;;) {
		int i = IDirect3DEventQuery.IsSignaled(l);
		if (i != 1)
		    break;
		Thread.yield();
	    }
	}
	IUnknown.Release(l);
    }
    
    long method18005(int i, int i_39_, int[] is, int[] is_40_) {
	if (aLongArray11546[anInt11544] != 0L) {
	    IUnknown.Release(aLongArray11546[anInt11544]);
	    aLongArray11546[anInt11544] = 0L;
	}
	aByteBuffer9266.clear();
	IDirect3DSurface.Download(aLongArray11543[anInt11544], 0, 0, i, i_39_,
				  i * 4, 0, aLong9139);
	if (++anInt11544 >= 3)
	    anInt11544 = 0;
	if (is != null) {
	    aByteBuffer9266.asIntBuffer().get(is);
	    return 0L;
	}
	return aLong9139;
    }
    
    void method14853() {
	IDirect3DDevice.method15839(aLong11541, 14, aBool9190 && aBool9191);
    }
    
    public void method14739(Class433 class433) {
	class433.method6839(aClass433_11522);
    }
    
    void method14643() {
	IDirect3DDevice.method15839(aLong11541, 7, aBool9248 && aBool9193);
    }
    
    void method14644() {
	IDirect3DDevice.method15839(aLong11541, 14, aBool9190 && aBool9191);
    }
    
    public boolean method3419() {
	return true;
    }
    
    Class175_Sub2 method3244(Canvas canvas, int i, int i_41_) {
	return new Class175_Sub2_Sub3_Sub1(this, canvas, i, i_41_, false);
    }
    
    void method14654() {
	if (aBool9125) {
	    float f = aBool9195 ? aFloat9206 : 0.0F;
	    float f_42_ = aBool9195 ? -aFloat9267 : 0.0F;
	    D3DLIGHT.SetDiffuse(aLong11512, f * aFloat9159, f * aFloat9292,
				f * aFloat9163, 0.0F);
	    D3DLIGHT.SetDiffuse(aLong11513, f_42_ * aFloat9159,
				f_42_ * aFloat9292, f_42_ * aFloat9163, 0.0F);
	    aBool11515 = false;
	}
    }
    
    Class349 method14939(Class381[] class381s) {
	return new Class349_Sub1(this, class381s);
    }
    
    void method14655() {
	method14654();
	method14783();
    }
    
    void method14783() {
	if (aBool9125 && !aBool11515) {
	    IDirect3DDevice.LightEnable(aLong11541, 0, false);
	    IDirect3DDevice.LightEnable(aLong11541, 1, false);
	    IDirect3DDevice.SetLight(aLong11541, 0, aLong11512);
	    IDirect3DDevice.SetLight(aLong11541, 1, aLong11513);
	    IDirect3DDevice.LightEnable(aLong11541, 0, true);
	    IDirect3DDevice.LightEnable(aLong11541, 1, true);
	    aBool11515 = true;
	}
    }
    
    void method14686() {
	int i;
	for (i = 0; i < anInt9129; i++) {
	    Class534_Sub21 class534_sub21 = aClass534_Sub21Array9208[i];
	    int i_43_ = i + 2;
	    int i_44_ = class534_sub21.method16201((byte) -12);
	    float f = class534_sub21.method16202(-693604944) / 255.0F;
	    D3DLIGHT.SetPosition(aLong11514,
				 (float) class534_sub21.method16197(62852861),
				 (float) class534_sub21
					     .method16226(-1617426709),
				 (float) class534_sub21
					     .method16199((byte) -126));
	    D3DLIGHT.SetDiffuse(aLong11514, (float) (i_44_ >> 16 & 0xff) * f,
				(float) (i_44_ >> 8 & 0xff) * f,
				(float) (i_44_ & 0xff) * f, 0.0F);
	    D3DLIGHT.SetAttenuation
		(aLong11514, 0.0F, 0.0F,
		 1.0F / (float) (class534_sub21.method16233(-1258189491)
				 * class534_sub21.method16233(-415682287)));
	    D3DLIGHT.SetRange(aLong11514,
			      (float) class534_sub21.method16233(-1952512885));
	    IDirect3DDevice.SetLight(aLong11541, i_43_, aLong11514);
	    IDirect3DDevice.LightEnable(aLong11541, i_43_, true);
	}
	for (/**/; i < anInt9209; i++)
	    IDirect3DDevice.LightEnable(aLong11541, i + 2, false);
    }
    
    boolean method14741(Class181 class181, Class173 class173) {
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class356.method6310(IDirect3D.GetAdapterDisplayMode
				    (aLong11506, anInt11542, d3ddisplaymode))
		&& Class356.method6310(IDirect3D.CheckDeviceFormat
				       (aLong11506, anInt11542, anInt11504,
					d3ddisplaymode.Format, 0, 3,
					method18014(class181, class173))));
    }
    
    Interface38 method14735(int i, int i_45_, boolean bool, int[] is,
			    int i_46_, int i_47_) {
	return new Class420_Sub2(this, i, i_45_, bool, is, i_46_, i_47_);
    }
    
    static final int method18006(Class378 class378) {
	switch (class378.anInt3918) {
	default:
	    throw new IllegalArgumentException();
	case 1:
	    return 7;
	case 3:
	    return 4;
	case 4:
	    return 10;
	case 0:
	    return 2;
	case 2:
	    return 26;
	}
    }
    
    Interface38 method14772(int i, int i_48_, boolean bool, int[] is,
			    int i_49_, int i_50_) {
	return new Class420_Sub2(this, i, i_48_, bool, is, i_49_, i_50_);
    }
    
    public float method14744() {
	return -0.5F;
    }
    
    Interface38 method14663(Class181 class181, int i, int i_51_, boolean bool,
			    float[] fs, int i_52_, int i_53_) {
	return new Class420_Sub2(this, class181, i, i_51_, bool, fs, i_52_,
				 i_53_);
    }
    
    public void method3428() {
	for (int i = 0; i < 3; i++) {
	    if (aLongArray11546[i] != 0L) {
		IUnknown.Release(aLongArray11546[i]);
		aLongArray11546[i] = 0L;
	    }
	}
	anInt11516 = 0;
	anInt11544 = 0;
    }
    
    Class185_Sub1_Sub1
	(int i, int i_54_, long l, long l_55_, D3DDISPLAYMODE d3ddisplaymode,
	 D3DPRESENT_PARAMETERS d3dpresent_parameters, D3DCAPS d3dcaps,
	 Class177 class177, Interface25 interface25, Interface45 interface45,
	 Interface48 interface48, Interface46 interface46, Class472 class472,
	 int i_56_) {
	super(class177, interface25, interface45, interface48, interface46,
	      class472, i_56_, 0);
	aClass700_11540 = new Class700();
	aBool11511 = false;
	aLong11512 = 0L;
	aLong11513 = 0L;
	aLong11514 = 0L;
	aBool11515 = false;
	aFloatArray11536 = new float[16];
	anInt11529 = 128;
	anInt11505 = 0;
	aLongArray11539 = new long[anInt11529];
	aLong11507 = 0L;
	aLongArray11546 = new long[3];
	aLongArray11543 = new long[3];
	anIntArray11537 = new int[3];
	anInt11544 = 0;
	anInt11516 = 0;
	try {
	    anInt11542 = i;
	    anInt11504 = i_54_;
	    aLong11506 = l;
	    aLong11541 = l_55_;
	    aD3DDISPLAYMODE11509 = d3ddisplaymode;
	    aD3DPRESENT_PARAMETERS11508 = d3dpresent_parameters;
	    aD3DCAPS11525 = d3dcaps;
	    aLong11512 = D3DLIGHT.Create();
	    aLong11513 = D3DLIGHT.Create();
	    aLong11514 = D3DLIGHT.Create();
	    anInt9269 = aD3DCAPS11525.MaxSimultaneousTextures;
	    anInt9270 = (aD3DCAPS11525.MaxActiveLights > 0
			 ? aD3DCAPS11525.MaxActiveLights : 8);
	    aBool11526 = (aD3DCAPS11525.TextureCaps & 0x2) == 0;
	    aBool9275 = (aD3DCAPS11525.TextureCaps & 0x800) != 0;
	    aBool9276 = (aD3DCAPS11525.TextureCaps & 0x2000) != 0;
	    aBool11538 = (aD3DCAPS11525.TextureCaps & 0x8000) != 0;
	    aBool11528 = (aD3DCAPS11525.TextureCaps & 0x10000) != 0;
	    aBool11527 = (aD3DCAPS11525.TextureCaps & 0x4000) != 0;
	    aBool9271 = aD3DCAPS11525.NumSimultaneousRTs > 0;
	    aBool9277 = aBool9271;
	    aBool9272 = aD3DCAPS11525.NumSimultaneousRTs > 0;
	    aBool9260 = (anInt9263 > 0
			 || (IDirect3D.CheckDeviceMultiSampleType
			     (aLong11506, anInt11542, anInt11504,
			      aD3DPRESENT_PARAMETERS11508.BackBufferFormat,
			      true, 2)) == 0);
	    aBool9273
		= (aD3DCAPS11525.NumSimultaneousRTs > 0 && anInt9263 > 0
		   || IDirect3D.CheckDeviceMultiSampleType(aLong11506,
							   anInt11542,
							   anInt11504, 113,
							   true, 2) == 0);
	    aBool11510
		= (IDirect3D.CheckDeviceFormat(aLong11506, anInt11542,
					       anInt11504,
					       (aD3DPRESENT_PARAMETERS11508
						.BackBufferFormat),
					       0, 1,
					       method14713('A', 'T', 'O', 'C'))
		   == 0);
	    aBool11531
		= (IDirect3D.CheckDeviceFormat(aLong11506, anInt11542,
					       anInt11504,
					       (aD3DPRESENT_PARAMETERS11508
						.BackBufferFormat),
					       0, 1,
					       method14713('A', '2', 'M', '1'))
		   == 0);
	    aBool11532
		= (IDirect3D.CheckDeviceFormat(aLong11506, anInt11542,
					       anInt11504,
					       (aD3DPRESENT_PARAMETERS11508
						.BackBufferFormat),
					       0, 1,
					       method14713('S', 'S', 'A', 'A'))
		   == 0);
	    aBool9161 = (aD3DCAPS11525.PrimitiveMiscCaps & 0x20000) != 0;
	    aBool11533
		= IDirect3D.CheckDeviceFormat(aLong11506, anInt11542,
					      anInt11504,
					      aD3DDISPLAYMODE11509.Format,
					      524288, 3, 113) == 0;
	    aBool11534
		= IDirect3D.CheckDeviceFormat(aLong11506, anInt11542,
					      anInt11504,
					      aD3DDISPLAYMODE11509.Format,
					      524288, 3, 116) == 0;
	    aBoolArray11530 = new boolean[anInt9269];
	    aBoolArray11517 = new boolean[anInt9269];
	    aBoolArray11518 = new boolean[anInt9269];
	    aClass372Array11520 = new Class372[anInt9269];
	    aBoolArray11519 = new boolean[anInt9269];
	    anIntArray11521 = new int[anInt9269];
	    Class446 class446 = new Class446();
	    class446.method7248(1.0F, -1.0F, 0.5F);
	    class446.method7287(0.0F, 0.0F, 0.5F);
	    aClass433_11522 = new Class433();
	    aClass433_11522.method6916(class446);
	    IDirect3DDevice.BeginScene(aLong11541);
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    method3236(-568376843);
	    throw new RuntimeException("");
	}
    }
    
    Interface35 method14963(Class181 class181, int i, int i_57_, int i_58_,
			    boolean bool, byte[] is) {
	return new Class420_Sub1(this, class181, i, i_57_, i_58_, bool, is);
    }
    
    final void method18007(Class420 class420) {
	IDirect3DDevice.SetTexture(aLong11541, anInt9215,
				   class420.method6771());
	if (aBool9125 && !aBoolArray11518[anInt9215]) {
	    aBoolArray11518[anInt9215] = true;
	    method14684();
	    method14683();
	}
    }
    
    void method14839() {
	if (aLong11524 == 0L
	    && aClass364Array9218[anInt9215] != Class364.aClass364_3725) {
	    if (aClass364Array9218[anInt9215] == Class364.aClass364_3724)
		IDirect3DDevice.SetTransform
		    (aLong11541, 16 + anInt9215,
		     aClass433Array9217[anInt9215]
			 .method6874(aFloatArray11536));
	    else
		IDirect3DDevice.SetTransform
		    (aLong11541, 16 + anInt9215,
		     aClass433Array9217[anInt9215]
			 .method6938(aFloatArray11536));
	    int i = method18024(aClass364Array9218[anInt9215]);
	    if (i != anIntArray11521[anInt9215]) {
		IDirect3DDevice.SetTextureStageState(aLong11541, anInt9215, 24,
						     i);
		anIntArray11521[anInt9215] = i;
	    }
	} else {
	    IDirect3DDevice.SetTextureStageState(aLong11541, anInt9215, 24, 0);
	    anIntArray11521[anInt9215] = 0;
	}
    }
    
    final void method18008(Class420_Sub1 class420_sub1) {
	method18007(class420_sub1);
	if (!aBoolArray11530[anInt9215]) {
	    IDirect3DDevice.SetSamplerState(aLong11541, anInt9215, 1, 1);
	    aBoolArray11530[anInt9215] = true;
	}
	if (!aBoolArray11517[anInt9215]) {
	    IDirect3DDevice.SetSamplerState(aLong11541, anInt9215, 2, 1);
	    aBoolArray11517[anInt9215] = true;
	}
    }
    
    void method14683() {
	if (aBool9125) {
	    int i = (aBoolArray11518[anInt9215]
		     ? method18012(aClass378Array9219[anInt9215]) : 1);
	    IDirect3DDevice.SetTextureStageState(aLong11541, anInt9215, 1, i);
	}
    }
    
    final void method14952(Interface39 interface39, Class374 class374, int i,
			   int i_59_, int i_60_, int i_61_) {
	if (aClass278_Sub2_11523 != null)
	    aClass278_Sub2_11523.method15721();
	IDirect3DDevice.DrawIndexedPrimitiveIB(aLong11541,
					       (((Class414) interface39)
						.aLong4658),
					       4, 0, i, i_59_, i_60_, i_61_);
    }
    
    final void method14801(int i, Class373 class373, boolean bool) {
	if (aBool9125) {
	    int i_62_ = 0;
	    int i_63_;
	    switch (i) {
	    case 2:
		i_63_ = 27;
		break;
	    default:
		i_63_ = 5;
		break;
	    case 1:
		i_63_ = 6;
	    }
	    if (bool)
		i_62_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState(aLong11541, anInt9215, i_63_,
						 (method18010(class373)
						  | i_62_));
	}
    }
    
    public boolean method14745(boolean bool) {
	if (bool)
	    return aBool11533;
	return aBool11533 && aBool11534;
    }
    
    void method14684() {
	if (aBool9125) {
	    int i = (aBoolArray11518[anInt9215]
		     ? method18012(aClass378Array9117[anInt9215]) : 1);
	    IDirect3DDevice.SetTextureStageState(aLong11541, anInt9215, 4, i);
	}
    }
    
    final void method14674(int i, Class373 class373, boolean bool,
			   boolean bool_64_) {
	if (aBool9125) {
	    int i_65_ = 0;
	    int i_66_;
	    switch (i) {
	    default:
		i_66_ = 2;
		break;
	    case 2:
		i_66_ = 26;
		break;
	    case 1:
		i_66_ = 3;
	    }
	    if (bool)
		i_65_ |= 0x20;
	    if (bool_64_)
		i_65_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState(aLong11541, anInt9215, i_66_,
						 (method18010(class373)
						  | i_65_));
	}
    }
    
    final void method18009(long l) {
	aLong11524 = l;
	IDirect3DDevice.SetVertexShader(aLong11541, l);
    }
    
    final void method14681() {
	if (aBool9125)
	    IDirect3DDevice.SetRenderState(aLong11541, 60, anInt9221);
    }
    
    Interface38 method14662(Class181 class181, int i, int i_67_, boolean bool,
			    byte[] is, int i_68_, int i_69_) {
	return new Class420_Sub2(this, class181, i, i_67_, bool, is, i_68_,
				 i_69_);
    }
    
    static final int method18010(Class373 class373) {
	switch (class373.anInt3894) {
	case 3:
	    return 3;
	default:
	    throw new IllegalArgumentException();
	case 0:
	    return 2;
	case 2:
	    return 1;
	case 1:
	    return 0;
	}
    }
    
    void method14724() {
	if (aBool9125) {
	    D3DLIGHT.SetAmbient(aLong11512, aFloat9159 * aFloat9205,
				aFloat9292 * aFloat9205,
				aFloat9163 * aFloat9205, 0.0F);
	    aBool11515 = false;
	}
    }
    
    void method14650(int i) {
	IDirect3DDevice.SetRenderState(aLong11541, 168, i);
    }
    
    void method14691() {
	IDirect3DDevice.method15839(aLong11541, 15, aBool9131);
	IDirect3DDevice.SetRenderState(aLong11541, 24, aByte9261 & 0xff);
	if (aD3DPRESENT_PARAMETERS11508.MultiSampleType > 0) {
	    if (!aBool9131 || aByte9261 == 0) {
		if (aBool11532 || aBool11510)
		    IDirect3DDevice.SetRenderState(aLong11541, 181, 0);
		else if (aBool11531)
		    IDirect3DDevice.method15838(aLong11541, 154, 1.0F);
	    } else if (aBool11532)
		IDirect3DDevice.SetRenderState(aLong11541, 181,
					       method14713('S', 'S', 'A',
							   'A'));
	    else if (aBool11510)
		IDirect3DDevice.SetRenderState(aLong11541, 181,
					       method14713('A', 'T', 'O',
							   'C'));
	    else if (aBool11531)
		IDirect3DDevice.SetRenderState(aLong11541, 154,
					       method14713('A', '2', 'M',
							   '1'));
	}
    }
    
    void method14692() {
	switch (aClass370_9258.anInt3874) {
	case 2:
	    IDirect3DDevice.SetRenderState(aLong11541, 19, 2);
	    IDirect3DDevice.SetRenderState(aLong11541, 20, 1);
	    break;
	case 1:
	    IDirect3DDevice.SetRenderState(aLong11541, 19, 9);
	    IDirect3DDevice.SetRenderState(aLong11541, 20, 2);
	    break;
	case 3:
	    IDirect3DDevice.SetRenderState(aLong11541, 19, 5);
	    IDirect3DDevice.SetRenderState(aLong11541, 20, 6);
	    break;
	case 0:
	    IDirect3DDevice.SetRenderState(aLong11541, 19, 2);
	    IDirect3DDevice.SetRenderState(aLong11541, 20, 2);
	    break;
	}
	switch (anInt9238) {
	case 2:
	    IDirect3DDevice.SetRenderState(aLong11541, 207, 2);
	    IDirect3DDevice.SetRenderState(aLong11541, 208, 2);
	    break;
	case 3:
	    IDirect3DDevice.SetRenderState(aLong11541, 207, 1);
	    IDirect3DDevice.SetRenderState(aLong11541, 208, 2);
	    break;
	case 1:
	    IDirect3DDevice.SetRenderState(aLong11541, 207, 2);
	    IDirect3DDevice.SetRenderState(aLong11541, 208, 1);
	    break;
	case 0:
	    IDirect3DDevice.SetRenderState(aLong11541, 207, 1);
	    IDirect3DDevice.SetRenderState(aLong11541, 208, 1);
	    break;
	}
    }
    
    void method14693() {
	IDirect3DDevice.method15839(aLong11541, 27, aBool9259);
    }
    
    void method18011() {
	IDirect3DDevice.SetRenderState(aLong11541, 22, anInt9262);
    }
    
    void method14722() {
	if (aBool9125)
	    IDirect3DDevice.method15839(aLong11541, 28, (aBool9250 && aBool9249
							 && anInt9252 >= 0));
    }
    
    static final int method18012(Class378 class378) {
	switch (class378.anInt3918) {
	default:
	    throw new IllegalArgumentException();
	case 1:
	    return 7;
	case 3:
	    return 4;
	case 4:
	    return 10;
	case 0:
	    return 2;
	case 2:
	    return 26;
	}
    }
    
    void method14697(boolean bool) {
	IDirect3DDevice.method15839(aLong11541, 161, bool);
    }
    
    final Interface39 method14971(boolean bool) {
	return new Class414(this, Class173.aClass173_1829, bool);
    }
    
    final Interface37 method14698(boolean bool) {
	return new Class416(this, bool);
    }
    
    Class349 method14699(Class381[] class381s) {
	return new Class349_Sub1(this, class381s);
    }
    
    public void method14700(Class349 class349) {
	Class349_Sub1 class349_sub1 = (Class349_Sub1) class349;
	IDirect3DDevice.SetVertexDeclaration(aLong11541,
					     class349_sub1.aLong10131);
    }
    
    public void method14733(int i, Interface37 interface37) {
	Class416 class416 = (Class416) interface37;
	IDirect3DDevice.SetStreamSource(aLong11541, i, class416.aLong4672, 0,
					class416.method6746());
    }
    
    void method14701(Interface39 interface39) {
	IDirect3DDevice.SetIndices(aLong11541,
				   ((Class414) interface39).aLong4658);
    }
    
    void method14816() {
	IDirect3DDevice.method15839(aLong11541, 174, aBool9294);
    }
    
    final void method14709(Interface39 interface39, Class374 class374, int i,
			   int i_70_, int i_71_, int i_72_) {
	if (aClass278_Sub2_11523 != null)
	    aClass278_Sub2_11523.method15721();
	IDirect3DDevice.DrawIndexedPrimitiveIB(aLong11541,
					       (((Class414) interface39)
						.aLong4658),
					       4, 0, i, i_70_, i_71_, i_72_);
    }
    
    public final void method14710(Class374 class374, int i, int i_73_,
				  int i_74_, int i_75_) {
	if (aClass278_Sub2_11523 != null)
	    aClass278_Sub2_11523.method15721();
	IDirect3DDevice.DrawIndexedPrimitive(aLong11541, method18016(class374),
					     0, i, i_73_, i_74_, i_75_);
    }
    
    byte[] method18013(String string) {
	return method14840("dx", string);
    }
    
    public Class269 method14589(String string) {
	byte[] is = method18013(string);
	if (is == null)
	    return null;
	Class261 class261 = method14591(is);
	return new Class269_Sub2(this, class261);
    }
    
    public final synchronized void method3661(int i) {
	for (int i_76_ = 0; i_76_ < anInt11505; i_76_++)
	    IUnknown.Release(aLongArray11539[i_76_]);
	anInt11505 = 0;
	super.method3661(i);
    }
    
    static final int method18014(Class181 class181, Class173 class173) {
	switch (class173.anInt1834 * -1414205941) {
	default:
	    break;
	case 4:
	    switch (class181.anInt1953 * -939549997) {
	    case 8:
		return 28;
	    case 3:
		return 77;
	    case 4:
		return 22;
	    case 6:
		return 50;
	    case 2:
		return Class366.anInt3855 * -822548177;
	    case 1:
		return 51;
	    default:
		break;
	    case 7:
		return Class366.anInt3854 * 612563925;
	    case 0:
		return 21;
	    }
	    break;
	case 2:
	    if (class181 == Class181.aClass181_1952)
		return 116;
	    break;
	case 0:
	    if (class181 == Class181.aClass181_1952)
		return 113;
	}
	throw new IllegalArgumentException("");
    }
    
    static final int method18015(Class173 class173) {
	if (class173 == Class173.aClass173_1829)
	    return 80;
	if (class173 == Class173.aClass173_1828)
	    return 77;
	throw new IllegalArgumentException("");
    }
    
    static final int method18016(Class374 class374) {
	switch (class374.anInt3899) {
	case 5:
	    return 3;
	case 4:
	    return 5;
	case 0:
	    return 1;
	case 1:
	    return 6;
	case 2:
	    return 2;
	case 3:
	    return 4;
	default:
	    throw new IllegalArgumentException("");
	}
    }
    
    public String method3250() {
	String string = "Caps: 4:";
	String string_77_ = ":";
	string = new StringBuilder().append(string).append(anInt9263).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append(anInt9269).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append(anInt9270).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9260 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (method14653() ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (method14747() ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9276 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9275 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11526 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11538 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11528 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11527 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9271 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9272 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9273 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11510 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11531 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11532 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9161 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11533 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11534 ? 1 : 0).toString();
	return string;
    }
    
    static boolean method18017(int i, int i_78_, long l, int i_79_,
			       D3DDISPLAYMODE d3ddisplaymode,
			       D3DPRESENT_PARAMETERS d3dpresent_parameters) {
	int i_80_ = 0;
	int i_81_ = 0;
	int i_82_ = 0;
	boolean bool;
	try {
	    if (Class356.method6309
		(IDirect3D.GetAdapterDisplayMode(l, i, d3ddisplaymode)))
		return false;
	while_40_:
	    for (/**/; i_79_ >= 0; i_79_--) {
		if (i_79_ != 1) {
		    i_82_ = 0 + i_79_;
		    for (int i_83_ = 0; i_83_ < anIntArray11548.length;
			 i_83_++) {
			if (IDirect3D.CheckDeviceType(l, i, i_78_,
						      d3ddisplaymode.Format,
						      anIntArray11548[i_83_],
						      true) == 0
			    && IDirect3D.CheckDeviceFormat(l, i, i_78_,
							   (d3ddisplaymode
							    .Format),
							   1, 1,
							   (anIntArray11548
							    [i_83_])) == 0
			    && (i_79_ == 0
				|| (IDirect3D.CheckDeviceMultiSampleType
				    (l, i, i_78_, anIntArray11548[i_83_], true,
				     i_82_)) == 0)) {
			    for (int i_84_ = 0; i_84_ < anIntArray11547.length;
				 i_84_++) {
				if ((IDirect3D.CheckDeviceFormat
				     (l, i, i_78_, d3ddisplaymode.Format, 2, 1,
				      anIntArray11547[i_84_])) == 0
				    && (IDirect3D.CheckDepthStencilMatch
					(l, i, i_78_, d3ddisplaymode.Format,
					 anIntArray11548[i_83_],
					 anIntArray11547[i_84_])) == 0
				    && (i_79_ == 0
					|| (IDirect3D
						.CheckDeviceMultiSampleType
					    (l, i, i_78_,
					     anIntArray11547[i_83_], true,
					     i_82_)) == 0)) {
				    i_81_ = anIntArray11548[i_83_];
				    i_80_ = anIntArray11547[i_84_];
				    break while_40_;
				}
			    }
			}
		    }
		}
	    }
	    if (i_79_ < 0 || i_81_ == 0 || i_80_ == 0)
		return false;
	    d3dpresent_parameters.BackBufferFormat = i_81_;
	    d3dpresent_parameters.AutoDepthStencilFormat = i_80_;
	    d3dpresent_parameters.MultiSampleType = i_82_;
	    d3dpresent_parameters.MultiSampleQuality = 0;
	    bool = true;
	} catch (Throwable throwable) {
	    return false;
	}
	return bool;
    }
    
    synchronized void method18018(long l) {
	if (anInt11505 == anInt11529) {
	    anInt11529 *= 2;
	    long[] ls = new long[anInt11529];
	    System.arraycopy(aLongArray11539, 0, ls, 0, anInt11505);
	    aLongArray11539 = ls;
	}
	aLongArray11539[anInt11505] = l;
	anInt11505++;
    }
    
    void method14642(int i) {
	if (!aBool11535) {
	    int i_85_ = (i & 0x2) != 0 ? 2 : 3;
	    IDirect3DDevice.SetRenderState(aLong11541, 8, i_85_);
	}
    }
    
    void method14641() {
	for (Class534_Sub6 class534_sub6
		 = (Class534_Sub6) aClass700_11540.method14135((byte) -1);
	     class534_sub6 != null;
	     class534_sub6
		 = (Class534_Sub6) aClass700_11540.method14139(1837234484)) {
	    Interface50 interface50
		= (Interface50) class534_sub6.anObject10417;
	    interface50.method229();
	    if (interface50 == aClass175_1989)
		interface50.method358();
	}
	super.method14597();
    }
    
    public boolean method14584(boolean bool) {
	if (bool)
	    return aBool11533;
	return aBool11533 && aBool11534;
    }
    
    public Class176 method3288() {
	D3DADAPTER_IDENTIFIER d3dadapter_identifier
	    = new D3DADAPTER_IDENTIFIER();
	IDirect3D.GetAdapterIdentifier(aLong11506, anInt11542, 0,
				       d3dadapter_identifier);
	return new Class176(d3dadapter_identifier.VendorID,
			    method14585() ? "Direct3D FF" : "Direct3D", 9,
			    d3dadapter_identifier.Description,
			    d3dadapter_identifier.DriverVersion,
			    method14585());
    }
    
    public Class176 method3670() {
	D3DADAPTER_IDENTIFIER d3dadapter_identifier
	    = new D3DADAPTER_IDENTIFIER();
	IDirect3D.GetAdapterIdentifier(aLong11506, anInt11542, 0,
				       d3dadapter_identifier);
	return new Class176(d3dadapter_identifier.VendorID,
			    method14585() ? "Direct3D FF" : "Direct3D", 9,
			    d3dadapter_identifier.Description,
			    d3dadapter_identifier.DriverVersion,
			    method14585());
    }
    
    void method3375(int i, int i_86_) throws Exception_Sub7 {
	if (aBool11511) {
	    if (!method17997(aClass175_Sub2_2013.method2910(),
			     aClass175_Sub2_2013.method2911()))
		return;
	    ((Class175_Sub2_Sub3_Sub1) aClass175_Sub2_2013).method229();
	} else
	    IDirect3DDevice.EndScene(aLong11541);
	int i_87_ = aClass175_Sub2_2013.method15475();
	if (Class356.method6309(i_87_)) {
	    aBool11511 = true;
	    aClass175_Sub2_2013.method142();
	} else {
	    IDirect3DDevice.BeginScene(aLong11541);
	    if (anInterface25_1997 != null)
		anInterface25_1997.method33(-823530746);
	}
    }
    
    void method3376(int i, int i_88_) throws Exception_Sub7 {
	if (aBool11511) {
	    if (!method17997(aClass175_Sub2_2013.method2910(),
			     aClass175_Sub2_2013.method2911()))
		return;
	    ((Class175_Sub2_Sub3_Sub1) aClass175_Sub2_2013).method229();
	} else
	    IDirect3DDevice.EndScene(aLong11541);
	int i_89_ = aClass175_Sub2_2013.method15475();
	if (Class356.method6309(i_89_)) {
	    aBool11511 = true;
	    aClass175_Sub2_2013.method142();
	} else {
	    IDirect3DDevice.BeginScene(aLong11541);
	    if (anInterface25_1997 != null)
		anInterface25_1997.method33(1895946586);
	}
    }
    
    public void method3377() {
	long l = IDirect3DDevice.CreateEventQuery(aLong11541);
	if (Class356.method6310(IDirect3DEventQuery.Issue(l))) {
	    for (;;) {
		int i = IDirect3DEventQuery.IsSignaled(l);
		if (i != 1)
		    break;
		Thread.yield();
	    }
	}
	IUnknown.Release(l);
    }
    
    public Class269 method14773(String string) {
	byte[] is = method18013(string);
	if (is == null)
	    return null;
	Class261 class261 = method14591(is);
	return new Class269_Sub2(this, class261);
    }
    
    public final synchronized void method3686(int i) {
	for (int i_90_ = 0; i_90_ < anInt11505; i_90_++)
	    IUnknown.Release(aLongArray11539[i_90_]);
	anInt11505 = 0;
	super.method3661(i);
    }
    
    Interface44 method14968(Class181 class181, Class173 class173, int i,
			    int i_91_) {
	return new Class420_Sub2_Sub1(this, class181, class173, i, i_91_);
    }
    
    public Interface22 method3571(int i, int i_92_, Class181 class181,
				  Class173 class173, int i_93_) {
	return new Class445(this, class181, class173, i, i_92_, i_93_);
    }
    
    public String method3401() {
	String string = "Caps: 4:";
	String string_94_ = ":";
	string = new StringBuilder().append(string).append(anInt9263).append
		     (string_94_).toString();
	string = new StringBuilder().append(string).append(anInt9269).append
		     (string_94_).toString();
	string = new StringBuilder().append(string).append(anInt9270).append
		     (string_94_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9260 ? 1 : 0).append
		     (string_94_).toString();
	string = new StringBuilder().append(string).append
		     (method14653() ? 1 : 0).append
		     (string_94_).toString();
	string = new StringBuilder().append(string).append
		     (method14747() ? 1 : 0).append
		     (string_94_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9276 ? 1 : 0).append
		     (string_94_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9275 ? 1 : 0).append
		     (string_94_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11526 ? 1 : 0).append
		     (string_94_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11538 ? 1 : 0).append
		     (string_94_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11528 ? 1 : 0).append
		     (string_94_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11527 ? 1 : 0).append
		     (string_94_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9271 ? 1 : 0).append
		     (string_94_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9272 ? 1 : 0).append
		     (string_94_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9273 ? 1 : 0).append
		     (string_94_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11510 ? 1 : 0).append
		     (string_94_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11531 ? 1 : 0).append
		     (string_94_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11532 ? 1 : 0).append
		     (string_94_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9161 ? 1 : 0).append
		     (string_94_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11533 ? 1 : 0).append
		     (string_94_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11534 ? 1 : 0).toString();
	return string;
    }
    
    public String method3402() {
	String string = "Caps: 4:";
	String string_95_ = ":";
	string = new StringBuilder().append(string).append(anInt9263).append
		     (string_95_).toString();
	string = new StringBuilder().append(string).append(anInt9269).append
		     (string_95_).toString();
	string = new StringBuilder().append(string).append(anInt9270).append
		     (string_95_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9260 ? 1 : 0).append
		     (string_95_).toString();
	string = new StringBuilder().append(string).append
		     (method14653() ? 1 : 0).append
		     (string_95_).toString();
	string = new StringBuilder().append(string).append
		     (method14747() ? 1 : 0).append
		     (string_95_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9276 ? 1 : 0).append
		     (string_95_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9275 ? 1 : 0).append
		     (string_95_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11526 ? 1 : 0).append
		     (string_95_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11538 ? 1 : 0).append
		     (string_95_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11528 ? 1 : 0).append
		     (string_95_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11527 ? 1 : 0).append
		     (string_95_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9271 ? 1 : 0).append
		     (string_95_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9272 ? 1 : 0).append
		     (string_95_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9273 ? 1 : 0).append
		     (string_95_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11510 ? 1 : 0).append
		     (string_95_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11531 ? 1 : 0).append
		     (string_95_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11532 ? 1 : 0).append
		     (string_95_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9161 ? 1 : 0).append
		     (string_95_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11533 ? 1 : 0).append
		     (string_95_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11534 ? 1 : 0).toString();
	return string;
    }
    
    void method14752() {
	aFloat9255 = aFloat9175 - (float) anInt9188;
	aFloat9254 = aFloat9255 - (float) anInt9252;
	if (aFloat9254 < aFloat9174)
	    aFloat9254 = aFloat9174;
	if (aBool9125) {
	    IDirect3DDevice.method15838(aLong11541, 36, aFloat9254);
	    IDirect3DDevice.method15838(aLong11541, 37, aFloat9255);
	    IDirect3DDevice.SetRenderState(aLong11541, 34, anInt9251);
	}
    }
    
    final void method18019(Class420_Sub1 class420_sub1) {
	method18007(class420_sub1);
	if (!aBoolArray11530[anInt9215]) {
	    IDirect3DDevice.SetSamplerState(aLong11541, anInt9215, 1, 1);
	    aBoolArray11530[anInt9215] = true;
	}
	if (!aBoolArray11517[anInt9215]) {
	    IDirect3DDevice.SetSamplerState(aLong11541, anInt9215, 2, 1);
	    aBoolArray11517[anInt9215] = true;
	}
    }
    
    Class175_Sub2 method3408(Canvas canvas, int i, int i_96_) {
	return new Class175_Sub2_Sub3_Sub1(this, canvas, i, i_96_, false);
    }
    
    public int[] method3597(int i, int i_97_, int i_98_, int i_99_) {
	method3581();
	int[] is = null;
	long l = IDirect3DDevice.GetRenderTarget(aLong11541, 0);
	long l_100_
	    = IDirect3DDevice.CreateRenderTarget(aLong11541, i_98_, i_99_, 21,
						 0, 0, true);
	int i_101_ = IDirect3DDevice.StretchRect(aLong11541, l, i, i_97_,
						 i_98_, i_99_, l_100_, 0, 0,
						 i_98_, i_99_, 1);
	method14586(i_98_ * i_99_ * 4);
	if (Class356.method6310(i_101_)) {
	    is = new int[i_98_ * i_99_];
	    IDirect3DSurface.Download(l_100_, 0, 0, i_98_, i_99_, i_98_ * 4,
				      16, aLong9139);
	    aByteBuffer9266.clear();
	    aByteBuffer9266.asIntBuffer().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_100_);
	return is;
    }
    
    public int[] method3410(int i, int i_102_, int i_103_, int i_104_) {
	method3581();
	int[] is = null;
	long l = IDirect3DDevice.GetRenderTarget(aLong11541, 0);
	long l_105_
	    = IDirect3DDevice.CreateRenderTarget(aLong11541, i_103_, i_104_,
						 21, 0, 0, true);
	int i_106_ = IDirect3DDevice.StretchRect(aLong11541, l, i, i_102_,
						 i_103_, i_104_, l_105_, 0, 0,
						 i_103_, i_104_, 1);
	method14586(i_103_ * i_104_ * 4);
	if (Class356.method6310(i_106_)) {
	    is = new int[i_103_ * i_104_];
	    IDirect3DSurface.Download(l_105_, 0, 0, i_103_, i_104_, i_103_ * 4,
				      16, aLong9139);
	    aByteBuffer9266.clear();
	    aByteBuffer9266.asIntBuffer().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_105_);
	return is;
    }
    
    void method3234(int i, int i_107_) throws Exception_Sub7 {
	if (aBool11511) {
	    if (!method17997(aClass175_Sub2_2013.method2910(),
			     aClass175_Sub2_2013.method2911()))
		return;
	    ((Class175_Sub2_Sub3_Sub1) aClass175_Sub2_2013).method229();
	} else
	    IDirect3DDevice.EndScene(aLong11541);
	int i_108_ = aClass175_Sub2_2013.method15475();
	if (Class356.method6309(i_108_)) {
	    aBool11511 = true;
	    aClass175_Sub2_2013.method142();
	} else {
	    IDirect3DDevice.BeginScene(aLong11541);
	    if (anInterface25_1997 != null)
		anInterface25_1997.method33(-1174206364);
	}
    }
    
    public void method3412() {
	/* empty */
    }
    
    public void method3278(int i, int i_109_, int[] is, int[] is_110_) {
	method18004(i, i_109_, is, is_110_);
    }
    
    public void method3414() {
	/* empty */
    }
    
    public void method3415() {
	/* empty */
    }
    
    void method14788() {
	for (Class534_Sub6 class534_sub6
		 = (Class534_Sub6) aClass700_11540.method14135((byte) -1);
	     class534_sub6 != null;
	     class534_sub6
		 = (Class534_Sub6) aClass700_11540.method14139(1515445225)) {
	    Interface50 interface50
		= (Interface50) class534_sub6.anObject10417;
	    interface50.method229();
	    if (interface50 == aClass175_1989)
		interface50.method358();
	}
	super.method14597();
    }
    
    public boolean method3418() {
	if (aBool11511)
	    return false;
	if (aLongArray11546[anInt11516] != 0L)
	    return false;
	return true;
    }
    
    boolean method14802(Class181 class181, Class173 class173) {
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class356.method6310(IDirect3D.GetAdapterDisplayMode
				    (aLong11506, anInt11542, d3ddisplaymode))
		&& Class356.method6310(IDirect3D.CheckDeviceFormat
				       (aLong11506, anInt11542, anInt11504,
					d3ddisplaymode.Format, 0, 4,
					method18014(class181, class173))));
    }
    
    public boolean method3628() {
	return false;
    }
    
    public boolean method3421() {
	return false;
    }
    
    public int method3684() {
	if (aLongArray11546[anInt11544] == 0L)
	    return -1;
	return ((Class356.method6310
		 (IDirect3DEventQuery.IsSignaled(aLongArray11546[anInt11544])))
		? anIntArray11537[anInt11544] : -1);
    }
    
    public int method3524() {
	if (aLongArray11546[anInt11544] == 0L)
	    return -1;
	return ((Class356.method6310
		 (IDirect3DEventQuery.IsSignaled(aLongArray11546[anInt11544])))
		? anIntArray11537[anInt11544] : -1);
    }
    
    public void method3424(int i, int i_111_, int i_112_) {
	if (aLong11507 == 0L)
	    method18035(i_111_, i_112_);
	long l = IDirect3DDevice.GetRenderTarget(aLong11541, 0);
	if (!Class356.method6309
	     (IDirect3DDevice.StretchRect(aLong11541, l, 0, 0,
					  aClass175_1989.method2910(),
					  aClass175_1989.method2911(),
					  aLong11507, anInt2018 * -1555714981,
					  anInt2019 * -385311879,
					  anInt2020 * 1769547157,
					  anInt2021 * -740019615, 2))) {
	    /* empty */
	}
	IUnknown.Release(l);
	IDirect3DDevice.GetRenderTargetData(aLong11541, aLong11507,
					    aLongArray11543[anInt11516]);
	long l_113_ = IDirect3DDevice.CreateEventQuery(aLong11541);
	if (Class356.method6310(IDirect3DEventQuery.Issue(l_113_)))
	    aLongArray11546[anInt11516] = l_113_;
	anIntArray11537[anInt11516] = i;
	if (++anInt11516 >= 3)
	    anInt11516 = 0;
    }
    
    public void method3245() {
	for (int i = 0; i < 3; i++) {
	    if (aLongArray11546[i] != 0L) {
		IUnknown.Release(aLongArray11546[i]);
		aLongArray11546[i] = 0L;
	    }
	}
	anInt11516 = 0;
	anInt11544 = 0;
    }
    
    public void method3426() {
	for (int i = 0; i < 3; i++) {
	    if (aLongArray11546[i] != 0L) {
		IUnknown.Release(aLongArray11546[i]);
		aLongArray11546[i] = 0L;
	    }
	}
	anInt11516 = 0;
	anInt11544 = 0;
    }
    
    public void method3427() {
	for (int i = 0; i < 3; i++) {
	    if (aLongArray11546[i] != 0L) {
		IUnknown.Release(aLongArray11546[i]);
		aLongArray11546[i] = 0L;
	    }
	}
	anInt11516 = 0;
	anInt11544 = 0;
    }
    
    void method14785() {
	for (int i = 0; i < anInt9269; i++) {
	    IDirect3DDevice.SetSamplerState(aLong11541, i, 7, 2);
	    IDirect3DDevice.SetSamplerState(aLong11541, i, 6, 2);
	    IDirect3DDevice.SetSamplerState(aLong11541, i, 5, 2);
	    IDirect3DDevice.SetSamplerState(aLong11541, i, 1, 1);
	    IDirect3DDevice.SetSamplerState(aLong11541, i, 2, 1);
	    aClass372Array11520[i] = Class372.aClass372_3888;
	    boolean[] bools = aBoolArray11530;
	    int i_114_ = i;
	    aBoolArray11517[i] = true;
	    bools[i_114_] = true;
	    aBoolArray11519[i] = false;
	    anIntArray11521[i] = 0;
	}
	IDirect3DDevice.SetTextureStageState(aLong11541, 0, 6, 1);
	IDirect3DDevice.SetRenderState(aLong11541, 9, 2);
	IDirect3DDevice.SetRenderState(aLong11541, 23, 4);
	IDirect3DDevice.SetRenderState(aLong11541, 25, 5);
	IDirect3DDevice.SetRenderState(aLong11541, 24, 0);
	IDirect3DDevice.method15839(aLong11541, 206, aBool9161);
	IDirect3DDevice.SetRenderState(aLong11541, 181, 0);
	method18011();
	IDirect3DDevice.SetRenderState(aLong11541, 147, 1);
	IDirect3DDevice.SetRenderState(aLong11541, 145, 1);
	IDirect3DDevice.method15838(aLong11541, 38, 0.95F);
	IDirect3DDevice.SetRenderState(aLong11541, 35, 3);
	IDirect3DDevice.method15838(aLong11541, 154, 1.0F);
	D3DLIGHT.SetType(aLong11512, 3);
	D3DLIGHT.SetType(aLong11513, 3);
	D3DLIGHT.SetType(aLong11514, 1);
	aBool11515 = false;
	super.method14718();
    }
    
    public void method3230() {
	for (int i = 0; i < 3; i++) {
	    if (aLongArray11546[i] != 0L) {
		IUnknown.Release(aLongArray11546[i]);
		aLongArray11546[i] = 0L;
	    }
	}
	anInt11516 = 0;
	anInt11544 = 0;
    }
    
    public void method3430(long l) {
	/* empty */
    }
    
    public void method3431(int i, int i_115_, int[] is, int[] is_116_) {
	method18004(i, i_115_, is, is_116_);
    }
    
    public void method3432(int i, int i_117_, int[] is, int[] is_118_) {
	method18004(i, i_117_, is, is_118_);
    }
    
    public void method3340(int i, int i_119_) {
	IDirect3DDevice.Clear(aLong11541, i, i_119_, 1.0F, 0);
    }
    
    public void method3372(int i, int i_120_, int[] is, int[] is_121_) {
	method18004(i, i_120_, is, is_121_);
    }
    
    public void method3346() {
	if (aLong11507 != 0L) {
	    IUnknown.Release(aLong11507);
	    aLong11507 = 0L;
	}
	for (int i = 0; i < 3; i++) {
	    if (aLongArray11546[i] != 0L) {
		IUnknown.Release(aLongArray11546[i]);
		aLongArray11546[i] = 0L;
	    }
	    if (aLongArray11543[i] != 0L) {
		IUnknown.Release(aLongArray11543[i]);
		aLongArray11543[i] = 0L;
	    }
	}
	anInt11516 = 0;
	anInt11544 = 0;
    }
    
    public void method3523() {
	if (aLong11507 != 0L) {
	    IUnknown.Release(aLong11507);
	    aLong11507 = 0L;
	}
	for (int i = 0; i < 3; i++) {
	    if (aLongArray11546[i] != 0L) {
		IUnknown.Release(aLongArray11546[i]);
		aLongArray11546[i] = 0L;
	    }
	    if (aLongArray11543[i] != 0L) {
		IUnknown.Release(aLongArray11543[i]);
		aLongArray11543[i] = 0L;
	    }
	}
	anInt11516 = 0;
	anInt11544 = 0;
    }
    
    public void method3457(int i, int i_122_) {
	IDirect3DDevice.Clear(aLong11541, i, i_122_, 1.0F, 0);
    }
    
    public void method3458(int i, int i_123_) {
	IDirect3DDevice.Clear(aLong11541, i, i_123_, 1.0F, 0);
    }
    
    void method3557() {
	super.method3327();
	if (aLong11512 != 0L) {
	    D3DLIGHT.Destroy(aLong11512);
	    aLong11512 = 0L;
	}
	if (aLong11513 != 0L) {
	    D3DLIGHT.Destroy(aLong11513);
	    aLong11513 = 0L;
	}
	if (aLong11514 != 0L) {
	    D3DLIGHT.Destroy(aLong11514);
	    aLong11514 = 0L;
	}
	if (aLong11541 != 0L) {
	    IDirect3DDevice.Destroy(aLong11541);
	    aLong11541 = 0L;
	}
	if (aLong11506 != 0L) {
	    IUnknown.Release(aLong11506);
	    aLong11506 = 0L;
	}
    }
    
    public Class165 method3486(Class165 class165, Class165 class165_124_,
			       float f, Class165 class165_125_) {
	return f < 0.5F ? class165 : class165_124_;
    }
    
    public Class175_Sub1 method3569() {
	return new Class175_Sub1_Sub1_Sub1(this);
    }
    
    public void method3413() {
	/* empty */
    }
    
    void method14969() {
	IDirect3DDevice.method15839(aLong11541, 27, aBool9259);
    }
    
    void method18020(Interface50 interface50) {
	Class534_Sub6 class534_sub6 = method18028(interface50);
	if (class534_sub6 != null)
	    class534_sub6.method8892((byte) 1);
    }
    
    public Interface21 method3572(int i, int i_126_) {
	return new Class426(this, Class173.aClass173_1828, i, i_126_, 0);
    }
    
    public Interface21 method3573(int i, int i_127_) {
	return new Class426(this, Class173.aClass173_1828, i, i_127_, 0);
    }
    
    public Interface21 method3624(int i, int i_128_) {
	return new Class426(this, Class173.aClass173_1828, i, i_128_, 0);
    }
    
    public Interface21 method3627(int i, int i_129_, int i_130_) {
	return new Class426(this, Class173.aClass173_1828, i, i_129_, i_130_);
    }
    
    public Interface21 method3645(int i, int i_131_, int i_132_) {
	return new Class426(this, Class173.aClass173_1828, i, i_131_, i_132_);
    }
    
    void method3577() {
	super.finalize();
    }
    
    void method3578() {
	super.finalize();
    }
    
    void method3579() {
	super.finalize();
    }
    
    void method3580() {
	super.method3327();
	if (aLong11512 != 0L) {
	    D3DLIGHT.Destroy(aLong11512);
	    aLong11512 = 0L;
	}
	if (aLong11513 != 0L) {
	    D3DLIGHT.Destroy(aLong11513);
	    aLong11513 = 0L;
	}
	if (aLong11514 != 0L) {
	    D3DLIGHT.Destroy(aLong11514);
	    aLong11514 = 0L;
	}
	if (aLong11541 != 0L) {
	    IDirect3DDevice.Destroy(aLong11541);
	    aLong11541 = 0L;
	}
	if (aLong11506 != 0L) {
	    IUnknown.Release(aLong11506);
	    aLong11506 = 0L;
	}
    }
    
    static Class185 method18021
	(Canvas canvas, Class177 class177, Interface25 interface25,
	 Interface45 interface45, Interface48 interface48,
	 Interface46 interface46, Class472 class472, Integer integer) {
	Class185_Sub1_Sub1 class185_sub1_sub1 = null;
	Class185_Sub1_Sub1 class185_sub1_sub1_133_;
	try {
	    int i = 0;
	    int i_134_ = 1;
	    long l = IDirect3D.Direct3DCreate();
	    D3DCAPS d3dcaps = new D3DCAPS();
	    IDirect3D.GetDeviceCaps(l, i, i_134_, d3dcaps);
	    if ((d3dcaps.RasterCaps & 0x1000000) == 0)
		throw new RuntimeException("");
	    if (d3dcaps.MaxSimultaneousTextures < 2)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x2) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x8) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x40) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x200) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x2000000) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x10) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x2) == 0)
		throw new RuntimeException("");
	    if (d3dcaps.MaxActiveLights > 0 && d3dcaps.MaxActiveLights < 2)
		throw new RuntimeException("");
	    if (d3dcaps.MaxStreams < 5)
		throw new RuntimeException("");
	    D3DPRESENT_PARAMETERS d3dpresent_parameters
		= new D3DPRESENT_PARAMETERS(canvas);
	    d3dpresent_parameters.Windowed = true;
	    d3dpresent_parameters.EnableAutoDepthStencil = true;
	    d3dpresent_parameters.BackBufferWidth = canvas.getWidth();
	    d3dpresent_parameters.BackBufferHeight = canvas.getHeight();
	    d3dpresent_parameters.BackBufferCount = 1;
	    d3dpresent_parameters.PresentationInterval = -2147483648;
	    D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	    if (!method18017(i, i_134_, l, integer.intValue(), d3ddisplaymode,
			     d3dpresent_parameters))
		throw new RuntimeException("");
	    int i_135_ = 0;
	    if ((d3dcaps.DevCaps & 0x100000) != 0)
		i_135_ |= 0x10;
	    long l_136_ = 0L;
	    try {
		l_136_ = IDirect3D.CreateDeviceContext(l, i, i_134_, canvas,
						       i_135_ | 0x40,
						       d3dpresent_parameters);
	    } catch (RuntimeException_Sub5 runtimeexception_sub5) {
		l_136_
		    = IDirect3D.CreateDeviceContext(l, i, i_134_, canvas,
						    i_135_ & ~0x100000 | 0x20,
						    d3dpresent_parameters);
	    }
	    class185_sub1_sub1
		= new Class185_Sub1_Sub1(i, i_134_, l, l_136_, d3ddisplaymode,
					 d3dpresent_parameters, d3dcaps,
					 class177, interface25, interface45,
					 interface48, interface46, class472,
					 integer.intValue());
	    if (!class185_sub1_sub1.aHashtable2014.containsKey(canvas)) {
		Class481.method7927(canvas, -1158700036);
		class185_sub1_sub1.method3256
		    (canvas,
		     new Class175_Sub2_Sub3_Sub1(class185_sub1_sub1, canvas,
						 canvas.getWidth(),
						 canvas.getHeight(), true),
		     (byte) 4);
	    }
	    class185_sub1_sub1.method3258(canvas, -1488303591);
	    class185_sub1_sub1.method14594();
	    class185_sub1_sub1_133_ = class185_sub1_sub1;
	} catch (RuntimeException runtimeexception) {
	    if (class185_sub1_sub1 != null)
		class185_sub1_sub1.method3327();
	    throw runtimeexception;
	}
	return class185_sub1_sub1_133_;
    }
    
    Interface38 method14828(int i, int i_137_, boolean bool, int[] is,
			    int i_138_, int i_139_) {
	return new Class420_Sub2(this, i, i_137_, bool, is, i_138_, i_139_);
    }
    
    public long method3586(int i, int i_140_) {
	return method18004(i, i_140_, null, null);
    }
    
    Interface38 method14661(Class181 class181, Class173 class173, int i,
			    int i_141_) {
	return new Class420_Sub2(this, class181, class173, i, i_141_);
    }
    
    final void method18022(long l) {
	aLong11524 = l;
	IDirect3DDevice.SetVertexShader(aLong11541, l);
    }
    
    public void method14894(Class433 class433, Class433 class433_142_,
			    Class433 class433_143_) {
	IDirect3DDevice.SetTransform(aLong11541, 256,
				     class433.aFloatArray4853);
	IDirect3DDevice.SetTransform(aLong11541, 2,
				     class433_142_.aFloatArray4853);
	IDirect3DDevice.SetTransform(aLong11541, 3,
				     class433_143_.aFloatArray4853);
    }
    
    public boolean method14762() {
	return (aD3DCAPS11525.VertexShaderVersion & 0xffff) >= 257;
    }
    
    public boolean method14793() {
	return (aD3DCAPS11525.PixelShaderVersion & 0xffff) >= 257;
    }
    
    public boolean method14626() {
	return (aD3DCAPS11525.PixelShaderVersion & 0xffff) >= 257;
    }
    
    public boolean method14764(boolean bool) {
	if (bool)
	    return aBool11533;
	return aBool11533 && aBool11534;
    }
    
    public void method3371(boolean bool) {
	/* empty */
    }
    
    public boolean method14903(boolean bool) {
	if (bool)
	    return aBool11533;
	return aBool11533 && aBool11534;
    }
    
    public boolean method14590(boolean bool) {
	if (bool)
	    return aBool11533;
	return aBool11533 && aBool11534;
    }
    
    public void finalize() {
	super.finalize();
    }
    
    public void method3454() {
	/* empty */
    }
    
    void method14716() {
	if (aLong11524 == 0L
	    && aClass364Array9218[anInt9215] != Class364.aClass364_3725) {
	    if (aClass364Array9218[anInt9215] == Class364.aClass364_3724)
		IDirect3DDevice.SetTransform
		    (aLong11541, 16 + anInt9215,
		     aClass433Array9217[anInt9215]
			 .method6874(aFloatArray11536));
	    else
		IDirect3DDevice.SetTransform
		    (aLong11541, 16 + anInt9215,
		     aClass433Array9217[anInt9215]
			 .method6938(aFloatArray11536));
	    int i = method18024(aClass364Array9218[anInt9215]);
	    if (i != anIntArray11521[anInt9215]) {
		IDirect3DDevice.SetTextureStageState(aLong11541, anInt9215, 24,
						     i);
		anIntArray11521[anInt9215] = i;
	    }
	} else {
	    IDirect3DDevice.SetTextureStageState(aLong11541, anInt9215, 24, 0);
	    anIntArray11521[anInt9215] = 0;
	}
    }
    
    public Class269 method14877(String string) {
	byte[] is = method18013(string);
	if (is == null)
	    return null;
	Class261 class261 = method14591(is);
	return new Class269_Sub2(this, class261);
    }
    
    public void method14743(Class433 class433, Class433 class433_144_,
			    Class433 class433_145_) {
	IDirect3DDevice.SetTransform(aLong11541, 256,
				     class433.aFloatArray4853);
	IDirect3DDevice.SetTransform(aLong11541, 2,
				     class433_144_.aFloatArray4853);
	IDirect3DDevice.SetTransform(aLong11541, 3,
				     class433_145_.aFloatArray4853);
    }
    
    public boolean method3396() {
	return true;
    }
    
    void method14675() {
	for (int i = 0; i < anInt9269; i++) {
	    IDirect3DDevice.SetSamplerState(aLong11541, i, 7, 2);
	    IDirect3DDevice.SetSamplerState(aLong11541, i, 6, 2);
	    IDirect3DDevice.SetSamplerState(aLong11541, i, 5, 2);
	    IDirect3DDevice.SetSamplerState(aLong11541, i, 1, 1);
	    IDirect3DDevice.SetSamplerState(aLong11541, i, 2, 1);
	    aClass372Array11520[i] = Class372.aClass372_3888;
	    boolean[] bools = aBoolArray11530;
	    int i_146_ = i;
	    aBoolArray11517[i] = true;
	    bools[i_146_] = true;
	    aBoolArray11519[i] = false;
	    anIntArray11521[i] = 0;
	}
	IDirect3DDevice.SetTextureStageState(aLong11541, 0, 6, 1);
	IDirect3DDevice.SetRenderState(aLong11541, 9, 2);
	IDirect3DDevice.SetRenderState(aLong11541, 23, 4);
	IDirect3DDevice.SetRenderState(aLong11541, 25, 5);
	IDirect3DDevice.SetRenderState(aLong11541, 24, 0);
	IDirect3DDevice.method15839(aLong11541, 206, aBool9161);
	IDirect3DDevice.SetRenderState(aLong11541, 181, 0);
	method18011();
	IDirect3DDevice.SetRenderState(aLong11541, 147, 1);
	IDirect3DDevice.SetRenderState(aLong11541, 145, 1);
	IDirect3DDevice.method15838(aLong11541, 38, 0.95F);
	IDirect3DDevice.SetRenderState(aLong11541, 35, 3);
	IDirect3DDevice.method15838(aLong11541, 154, 1.0F);
	D3DLIGHT.SetType(aLong11512, 3);
	D3DLIGHT.SetType(aLong11513, 3);
	D3DLIGHT.SetType(aLong11514, 1);
	aBool11515 = false;
	super.method14718();
    }
    
    void method14746() {
	method3280();
	for (Class534_Sub6 class534_sub6
		 = (Class534_Sub6) aClass700_11540.method14135((byte) -1);
	     class534_sub6 != null;
	     class534_sub6
		 = (Class534_Sub6) aClass700_11540.method14139(669927750)) {
	    Interface50 interface50
		= (Interface50) class534_sub6.anObject10417;
	    interface50.method142();
	}
	super.method14596();
    }
    
    Interface44 method14666(Class181 class181, Class173 class173, int i,
			    int i_147_) {
	return new Class420_Sub2_Sub1(this, class181, class173, i, i_147_);
    }
    
    static final int method18023(Class378 class378) {
	switch (class378.anInt3918) {
	default:
	    throw new IllegalArgumentException();
	case 1:
	    return 7;
	case 3:
	    return 4;
	case 4:
	    return 10;
	case 0:
	    return 2;
	case 2:
	    return 26;
	}
    }
    
    void method14787() {
	for (Class534_Sub6 class534_sub6
		 = (Class534_Sub6) aClass700_11540.method14135((byte) -1);
	     class534_sub6 != null;
	     class534_sub6
		 = (Class534_Sub6) aClass700_11540.method14139(835301326)) {
	    Interface50 interface50
		= (Interface50) class534_sub6.anObject10417;
	    interface50.method229();
	    if (interface50 == aClass175_1989)
		interface50.method358();
	}
	super.method14597();
    }
    
    final void method14742() {
	if (aBool9125)
	    IDirect3DDevice.SetRenderState(aLong11541, 60, anInt9221);
    }
    
    void method14652() {
	if (aBool9125)
	    IDirect3DDevice.method15839(aLong11541, 137,
					aBool9146 && !aBool9196);
    }
    
    public final synchronized void method3389(int i) {
	for (int i_148_ = 0; i_148_ < anInt11505; i_148_++)
	    IUnknown.Release(aLongArray11539[i_148_]);
	anInt11505 = 0;
	super.method3661(i);
    }
    
    void method14812() {
	if (aClass175_1989 != null)
	    IDirect3DDevice.SetViewport(aLong11541, anInt9113 + anInt9184,
					anInt9189 + anInt9185, anInt9186,
					anInt9210, aFloat9152, aFloat9157);
    }
    
    void method14690() {
	if (aClass175_1989 != null)
	    IDirect3DDevice.SetViewport(aLong11541, anInt9113 + anInt9184,
					anInt9189 + anInt9185, anInt9186,
					anInt9210, aFloat9152, aFloat9157);
    }
    
    void method14813() {
	if (aClass175_1989 != null)
	    IDirect3DDevice.SetViewport(aLong11541, anInt9113 + anInt9184,
					anInt9189 + anInt9185, anInt9186,
					anInt9210, aFloat9152, aFloat9157);
    }
    
    void method14657() {
	if (aClass175_1989 != null)
	    IDirect3DDevice.SetViewport(aLong11541, anInt9113 + anInt9184,
					anInt9189 + anInt9185, anInt9186,
					anInt9210, aFloat9152, aFloat9157);
    }
    
    void method14609() {
	IDirect3DDevice.SetScissorRect(aLong11541, anInt9113 + anInt9178,
				       anInt9189 + anInt9176, anInt9179,
				       anInt9177);
    }
    
    void method14815() {
	IDirect3DDevice.SetScissorRect(aLong11541, anInt9113 + anInt9178,
				       anInt9189 + anInt9176, anInt9179,
				       anInt9177);
    }
    
    public Class269 method14737(String string) {
	byte[] is = method18013(string);
	if (is == null)
	    return null;
	Class261 class261 = method14591(is);
	return new Class269_Sub2(this, class261);
    }
    
    void method14817() {
	IDirect3DDevice.method15839(aLong11541, 174, aBool9294);
    }
    
    void method14852() {
	IDirect3DDevice.method15839(aLong11541, 7, aBool9248 && aBool9193);
    }
    
    static final int method18024(Class364 class364) {
	switch (class364.anInt3730) {
	case 2:
	    return 1;
	default:
	    return 0;
	case 1:
	    return 256;
	case 4:
	    return 2;
	case 5:
	    return 3;
	case 0:
	    return 4;
	}
    }
    
    void method14854() {
	IDirect3DDevice.method15839(aLong11541, 14, aBool9190 && aBool9191);
    }
    
    void method14857() {
	if (aBool9125)
	    IDirect3DDevice.method15839(aLong11541, 137,
					aBool9146 && !aBool9196);
    }
    
    void method14620() {
	if (aClass175_1989 != null)
	    IDirect3DDevice.SetViewport(aLong11541, anInt9113 + anInt9184,
					anInt9189 + anInt9185, anInt9186,
					anInt9210, aFloat9152, aFloat9157);
    }
    
    void method14918() {
	if (aBool9125) {
	    int i = (aBoolArray11518[anInt9215]
		     ? method18012(aClass378Array9219[anInt9215]) : 1);
	    IDirect3DDevice.SetTextureStageState(aLong11541, anInt9215, 1, i);
	}
    }
    
    void method14859() {
	if (aBool9125) {
	    float f = aBool9195 ? aFloat9206 : 0.0F;
	    float f_149_ = aBool9195 ? -aFloat9267 : 0.0F;
	    D3DLIGHT.SetDiffuse(aLong11512, f * aFloat9159, f * aFloat9292,
				f * aFloat9163, 0.0F);
	    D3DLIGHT.SetDiffuse(aLong11513, f_149_ * aFloat9159,
				f_149_ * aFloat9292, f_149_ * aFloat9163,
				0.0F);
	    aBool11515 = false;
	}
    }
    
    void method14792() {
	if (aBool9125) {
	    float f = aBool9195 ? aFloat9206 : 0.0F;
	    float f_150_ = aBool9195 ? -aFloat9267 : 0.0F;
	    D3DLIGHT.SetDiffuse(aLong11512, f * aFloat9159, f * aFloat9292,
				f * aFloat9163, 0.0F);
	    D3DLIGHT.SetDiffuse(aLong11513, f_150_ * aFloat9159,
				f_150_ * aFloat9292, f_150_ * aFloat9163,
				0.0F);
	    aBool11515 = false;
	}
    }
    
    void method14861() {
	if (aBool9125 && !aBool11515) {
	    IDirect3DDevice.LightEnable(aLong11541, 0, false);
	    IDirect3DDevice.LightEnable(aLong11541, 1, false);
	    IDirect3DDevice.SetLight(aLong11541, 0, aLong11512);
	    IDirect3DDevice.SetLight(aLong11541, 1, aLong11513);
	    IDirect3DDevice.LightEnable(aLong11541, 0, true);
	    IDirect3DDevice.LightEnable(aLong11541, 1, true);
	    aBool11515 = true;
	}
    }
    
    void method14720() {
	if (aBool9125 && !aBool11515) {
	    IDirect3DDevice.LightEnable(aLong11541, 0, false);
	    IDirect3DDevice.LightEnable(aLong11541, 1, false);
	    IDirect3DDevice.SetLight(aLong11541, 0, aLong11512);
	    IDirect3DDevice.SetLight(aLong11541, 1, aLong11513);
	    IDirect3DDevice.LightEnable(aLong11541, 0, true);
	    IDirect3DDevice.LightEnable(aLong11541, 1, true);
	    aBool11515 = true;
	}
    }
    
    void method14667() {
	if (aBool9125 && !aBool11515) {
	    IDirect3DDevice.LightEnable(aLong11541, 0, false);
	    IDirect3DDevice.LightEnable(aLong11541, 1, false);
	    IDirect3DDevice.SetLight(aLong11541, 0, aLong11512);
	    IDirect3DDevice.SetLight(aLong11541, 1, aLong11513);
	    IDirect3DDevice.LightEnable(aLong11541, 0, true);
	    IDirect3DDevice.LightEnable(aLong11541, 1, true);
	    aBool11515 = true;
	}
    }
    
    void method14862() {
	method14654();
	method14783();
    }
    
    void method3582() {
	super.method3327();
	if (aLong11512 != 0L) {
	    D3DLIGHT.Destroy(aLong11512);
	    aLong11512 = 0L;
	}
	if (aLong11513 != 0L) {
	    D3DLIGHT.Destroy(aLong11513);
	    aLong11513 = 0L;
	}
	if (aLong11514 != 0L) {
	    D3DLIGHT.Destroy(aLong11514);
	    aLong11514 = 0L;
	}
	if (aLong11541 != 0L) {
	    IDirect3DDevice.Destroy(aLong11541);
	    aLong11541 = 0L;
	}
	if (aLong11506 != 0L) {
	    IUnknown.Release(aLong11506);
	    aLong11506 = 0L;
	}
    }
    
    void method14696() {
	method14654();
	method14783();
    }
    
    public boolean method14759() {
	return (aD3DCAPS11525.VertexShaderVersion & 0xffff) >= 257;
    }
    
    void method14868() {
	int i;
	for (i = 0; i < anInt9129; i++) {
	    Class534_Sub21 class534_sub21 = aClass534_Sub21Array9208[i];
	    int i_151_ = i + 2;
	    int i_152_ = class534_sub21.method16201((byte) -95);
	    float f = class534_sub21.method16202(-693604944) / 255.0F;
	    D3DLIGHT.SetPosition(aLong11514,
				 (float) class534_sub21
					     .method16197(1844936589),
				 (float) class534_sub21.method16226(-49614706),
				 (float) class534_sub21
					     .method16199((byte) -118));
	    D3DLIGHT.SetDiffuse(aLong11514, (float) (i_152_ >> 16 & 0xff) * f,
				(float) (i_152_ >> 8 & 0xff) * f,
				(float) (i_152_ & 0xff) * f, 0.0F);
	    D3DLIGHT.SetAttenuation
		(aLong11514, 0.0F, 0.0F,
		 1.0F / (float) (class534_sub21.method16233(-758558449)
				 * class534_sub21.method16233(116015315)));
	    D3DLIGHT.SetRange(aLong11514,
			      (float) class534_sub21.method16233(-768348355));
	    IDirect3DDevice.SetLight(aLong11541, i_151_, aLong11514);
	    IDirect3DDevice.LightEnable(aLong11541, i_151_, true);
	}
	for (/**/; i < anInt9209; i++)
	    IDirect3DDevice.LightEnable(aLong11541, i + 2, false);
    }
    
    boolean method14869(Class181 class181, Class173 class173) {
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class356.method6310(IDirect3D.GetAdapterDisplayMode
				    (aLong11506, anInt11542, d3ddisplaymode))
		&& Class356.method6310(IDirect3D.CheckDeviceFormat
				       (aLong11506, anInt11542, anInt11504,
					d3ddisplaymode.Format, 0, 3,
					method18014(class181, class173))));
    }
    
    final void method18025(long l) {
	IDirect3DDevice.SetPixelShader(aLong11541, l);
    }
    
    boolean method14664(Class181 class181, Class173 class173) {
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class356.method6310(IDirect3D.GetAdapterDisplayMode
				    (aLong11506, anInt11542, d3ddisplaymode))
		&& Class356.method6310(IDirect3D.CheckDeviceFormat
				       (aLong11506, anInt11542, anInt11504,
					d3ddisplaymode.Format, 0, 4,
					method18014(class181, class173))));
    }
    
    Interface38 method14649(Class181 class181, Class173 class173, int i,
			    int i_153_) {
	return new Class420_Sub2(this, class181, class173, i, i_153_);
    }
    
    static final int method18026(Class378 class378) {
	switch (class378.anInt3918) {
	default:
	    throw new IllegalArgumentException();
	case 1:
	    return 7;
	case 3:
	    return 4;
	case 4:
	    return 10;
	case 0:
	    return 2;
	case 2:
	    return 26;
	}
    }
    
    Interface38 method14879(Class181 class181, int i, int i_154_, boolean bool,
			    byte[] is, int i_155_, int i_156_) {
	return new Class420_Sub2(this, class181, i, i_154_, bool, is, i_155_,
				 i_156_);
    }
    
    void method14753() {
	method3280();
	for (Class534_Sub6 class534_sub6
		 = (Class534_Sub6) aClass700_11540.method14135((byte) -1);
	     class534_sub6 != null;
	     class534_sub6
		 = (Class534_Sub6) aClass700_11540.method14139(1720158426)) {
	    Interface50 interface50
		= (Interface50) class534_sub6.anObject10417;
	    interface50.method142();
	}
	super.method14596();
    }
    
    Interface38 method14751(Class181 class181, int i, int i_157_, boolean bool,
			    float[] fs, int i_158_, int i_159_) {
	return new Class420_Sub2(this, class181, i, i_157_, bool, fs, i_158_,
				 i_159_);
    }
    
    public final void method14708(Class374 class374, int i, int i_160_) {
	if (aClass278_Sub2_11523 != null)
	    aClass278_Sub2_11523.method15721();
	IDirect3DDevice.DrawPrimitive(aLong11541, method18016(class374), i,
				      i_160_);
    }
    
    byte[] method18027(String string) {
	return method14840("dx", string);
    }
    
    void method14636() {
	if (aBool9125)
	    IDirect3DDevice.method15839(aLong11541, 28, (aBool9250 && aBool9249
							 && anInt9252 >= 0));
    }
    
    Interface41 method14738(int i, boolean bool, int[][] is) {
	return new Class420_Sub3(this, i, bool, is);
    }
    
    Interface41 method14885(int i, boolean bool, int[][] is) {
	return new Class420_Sub3(this, i, bool, is);
    }
    
    public void method14945(int i, Interface37 interface37) {
	Class416 class416 = (Class416) interface37;
	IDirect3DDevice.SetStreamSource(aLong11541, i, class416.aLong4672, 0,
					class416.method6746());
    }
    
    Interface35 method14884(Class181 class181, int i, int i_161_, int i_162_,
			    boolean bool, byte[] is) {
	return new Class420_Sub1(this, class181, i, i_161_, i_162_, bool, is);
    }
    
    Interface35 method14888(Class181 class181, int i, int i_163_, int i_164_,
			    boolean bool, byte[] is) {
	return new Class420_Sub1(this, class181, i, i_163_, i_164_, bool, is);
    }
    
    Interface35 method14619(Class181 class181, int i, int i_165_, int i_166_,
			    boolean bool, byte[] is) {
	return new Class420_Sub1(this, class181, i, i_165_, i_166_, bool, is);
    }
    
    public void method14891() {
	if (aBoolArray11518[anInt9215]) {
	    aBoolArray11518[anInt9215] = false;
	    IDirect3DDevice.SetTexture(aLong11541, anInt9215, 0L);
	    method14684();
	    method14683();
	}
    }
    
    final void method14897(int i, Class373 class373, boolean bool,
			   boolean bool_167_) {
	if (aBool9125) {
	    int i_168_ = 0;
	    int i_169_;
	    switch (i) {
	    default:
		i_169_ = 2;
		break;
	    case 2:
		i_169_ = 26;
		break;
	    case 1:
		i_169_ = 3;
	    }
	    if (bool)
		i_168_ |= 0x20;
	    if (bool_167_)
		i_168_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState(aLong11541, anInt9215, i_169_,
						 (method18010(class373)
						  | i_168_));
	}
    }
    
    final void method14898(int i, Class373 class373, boolean bool,
			   boolean bool_170_) {
	if (aBool9125) {
	    int i_171_ = 0;
	    int i_172_;
	    switch (i) {
	    default:
		i_172_ = 2;
		break;
	    case 2:
		i_172_ = 26;
		break;
	    case 1:
		i_172_ = 3;
	    }
	    if (bool)
		i_171_ |= 0x20;
	    if (bool_170_)
		i_171_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState(aLong11541, anInt9215, i_172_,
						 (method18010(class373)
						  | i_171_));
	}
    }
    
    final void method14899(int i, Class373 class373, boolean bool,
			   boolean bool_173_) {
	if (aBool9125) {
	    int i_174_ = 0;
	    int i_175_;
	    switch (i) {
	    default:
		i_175_ = 2;
		break;
	    case 2:
		i_175_ = 26;
		break;
	    case 1:
		i_175_ = 3;
	    }
	    if (bool)
		i_174_ |= 0x20;
	    if (bool_173_)
		i_174_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState(aLong11541, anInt9215, i_175_,
						 (method18010(class373)
						  | i_174_));
	}
    }
    
    final void method14646() {
	if (aBool9125)
	    IDirect3DDevice.SetRenderState(aLong11541, 60, anInt9221);
    }
    
    Class534_Sub6 method18028(Interface50 interface50) {
	for (Class534_Sub6 class534_sub6
		 = (Class534_Sub6) aClass700_11540.method14135((byte) -1);
	     class534_sub6 != null;
	     class534_sub6
		 = (Class534_Sub6) aClass700_11540.method14139(1412239726)) {
	    if (class534_sub6.anObject10417 == interface50)
		return class534_sub6;
	}
	return null;
    }
    
    final void method14914() {
	if (aBool9125)
	    IDirect3DDevice.SetRenderState(aLong11541, 60, anInt9221);
    }
    
    void method14774() {
	if (aLong11524 == 0L
	    && aClass364Array9218[anInt9215] != Class364.aClass364_3725) {
	    if (aClass364Array9218[anInt9215] == Class364.aClass364_3724)
		IDirect3DDevice.SetTransform
		    (aLong11541, 16 + anInt9215,
		     aClass433Array9217[anInt9215]
			 .method6874(aFloatArray11536));
	    else
		IDirect3DDevice.SetTransform
		    (aLong11541, 16 + anInt9215,
		     aClass433Array9217[anInt9215]
			 .method6938(aFloatArray11536));
	    int i = method18024(aClass364Array9218[anInt9215]);
	    if (i != anIntArray11521[anInt9215]) {
		IDirect3DDevice.SetTextureStageState(aLong11541, anInt9215, 24,
						     i);
		anIntArray11521[anInt9215] = i;
	    }
	} else {
	    IDirect3DDevice.SetTextureStageState(aLong11541, anInt9215, 24, 0);
	    anIntArray11521[anInt9215] = 0;
	}
    }
    
    void method14682() {
	/* empty */
    }
    
    void method14917() {
	/* empty */
    }
    
    public final synchronized void method3381(int i) {
	for (int i_176_ = 0; i_176_ < anInt11505; i_176_++)
	    IUnknown.Release(aLongArray11539[i_176_]);
	anInt11505 = 0;
	super.method3661(i);
    }
    
    void method14883() {
	if (aBool9125) {
	    int i = (aBoolArray11518[anInt9215]
		     ? method18012(aClass378Array9117[anInt9215]) : 1);
	    IDirect3DDevice.SetTextureStageState(aLong11541, anInt9215, 4, i);
	}
    }
    
    final void method18029(Class420_Sub1 class420_sub1) {
	method18007(class420_sub1);
	if (!aBoolArray11530[anInt9215]) {
	    IDirect3DDevice.SetSamplerState(aLong11541, anInt9215, 1, 1);
	    aBoolArray11530[anInt9215] = true;
	}
	if (!aBoolArray11517[anInt9215]) {
	    IDirect3DDevice.SetSamplerState(aLong11541, anInt9215, 2, 1);
	    aBoolArray11517[anInt9215] = true;
	}
    }
    
    void method14920() {
	if (aBool9125) {
	    int i = (aBoolArray11518[anInt9215]
		     ? method18012(aClass378Array9117[anInt9215]) : 1);
	    IDirect3DDevice.SetTextureStageState(aLong11541, anInt9215, 4, i);
	}
    }
    
    void method14702() {
	if (aBool9125) {
	    int i = (aBoolArray11518[anInt9215]
		     ? method18012(aClass378Array9117[anInt9215]) : 1);
	    IDirect3DDevice.SetTextureStageState(aLong11541, anInt9215, 4, i);
	}
    }
    
    public boolean method14761() {
	return (aD3DCAPS11525.VertexShaderVersion & 0xffff) >= 257;
    }
    
    public Class269 method14771(String string) {
	byte[] is = method18013(string);
	if (is == null)
	    return null;
	Class261 class261 = method14591(is);
	return new Class269_Sub2(this, class261);
    }
    
    synchronized void method18030(long l) {
	if (anInt11505 == anInt11529) {
	    anInt11529 *= 2;
	    long[] ls = new long[anInt11529];
	    System.arraycopy(aLongArray11539, 0, ls, 0, anInt11505);
	    aLongArray11539 = ls;
	}
	aLongArray11539[anInt11505] = l;
	anInt11505++;
    }
    
    void method14882(int i) {
	IDirect3DDevice.SetRenderState(aLong11541, 168, i);
    }
    
    void method14695() {
	aFloat9255 = aFloat9175 - (float) anInt9188;
	aFloat9254 = aFloat9255 - (float) anInt9252;
	if (aFloat9254 < aFloat9174)
	    aFloat9254 = aFloat9174;
	if (aBool9125) {
	    IDirect3DDevice.method15838(aLong11541, 36, aFloat9254);
	    IDirect3DDevice.method15838(aLong11541, 37, aFloat9255);
	    IDirect3DDevice.SetRenderState(aLong11541, 34, anInt9251);
	}
    }
    
    void method14932() {
	if (aBool9125)
	    IDirect3DDevice.method15839(aLong11541, 28, (aBool9250 && aBool9249
							 && anInt9252 >= 0));
    }
    
    void method14933() {
	if (aBool9125)
	    IDirect3DDevice.method15839(aLong11541, 28, (aBool9250 && aBool9249
							 && anInt9252 >= 0));
    }
    
    void method14934() {
	if (aBool9125)
	    IDirect3DDevice.method15839(aLong11541, 28, (aBool9250 && aBool9249
							 && anInt9252 >= 0));
    }
    
    public final synchronized void method3322(int i) {
	for (int i_177_ = 0; i_177_ < anInt11505; i_177_++)
	    IUnknown.Release(aLongArray11539[i_177_]);
	anInt11505 = 0;
	super.method3661(i);
    }
    
    final Interface39 method14782(boolean bool) {
	return new Class414(this, Class173.aClass173_1829, bool);
    }
    
    final Interface37 method14937(boolean bool) {
	return new Class416(this, bool);
    }
    
    final Interface37 method14938(boolean bool) {
	return new Class416(this, bool);
    }
    
    void method14930() {
	switch (aClass370_9258.anInt3874) {
	case 2:
	    IDirect3DDevice.SetRenderState(aLong11541, 19, 2);
	    IDirect3DDevice.SetRenderState(aLong11541, 20, 1);
	    break;
	case 1:
	    IDirect3DDevice.SetRenderState(aLong11541, 19, 9);
	    IDirect3DDevice.SetRenderState(aLong11541, 20, 2);
	    break;
	case 3:
	    IDirect3DDevice.SetRenderState(aLong11541, 19, 5);
	    IDirect3DDevice.SetRenderState(aLong11541, 20, 6);
	    break;
	case 0:
	    IDirect3DDevice.SetRenderState(aLong11541, 19, 2);
	    IDirect3DDevice.SetRenderState(aLong11541, 20, 2);
	    break;
	}
	switch (anInt9238) {
	case 2:
	    IDirect3DDevice.SetRenderState(aLong11541, 207, 2);
	    IDirect3DDevice.SetRenderState(aLong11541, 208, 2);
	    break;
	case 3:
	    IDirect3DDevice.SetRenderState(aLong11541, 207, 1);
	    IDirect3DDevice.SetRenderState(aLong11541, 208, 2);
	    break;
	case 1:
	    IDirect3DDevice.SetRenderState(aLong11541, 207, 2);
	    IDirect3DDevice.SetRenderState(aLong11541, 208, 1);
	    break;
	case 0:
	    IDirect3DDevice.SetRenderState(aLong11541, 207, 1);
	    IDirect3DDevice.SetRenderState(aLong11541, 208, 1);
	    break;
	}
    }
    
    Interface38 method14726(int i, int i_178_, boolean bool, int[] is,
			    int i_179_, int i_180_) {
	return new Class420_Sub2(this, i, i_178_, bool, is, i_179_, i_180_);
    }
    
    Class349 method14941(Class381[] class381s) {
	return new Class349_Sub1(this, class381s);
    }
    
    public void method14794(Class349 class349) {
	Class349_Sub1 class349_sub1 = (Class349_Sub1) class349;
	IDirect3DDevice.SetVertexDeclaration(aLong11541,
					     class349_sub1.aLong10131);
    }
    
    void method18031(Interface50 interface50) {
	if (method18028(interface50) == null)
	    aClass700_11540.method14131(new Class534_Sub6(interface50),
					(short) 789);
    }
    
    void method14647(boolean bool) {
	IDirect3DDevice.method15839(aLong11541, 161, bool);
    }
    
    public void method14944(int i, Interface37 interface37) {
	Class416 class416 = (Class416) interface37;
	IDirect3DDevice.SetStreamSource(aLong11541, i, class416.aLong4672, 0,
					class416.method6746());
    }
    
    void method14881() {
	method3280();
	for (Class534_Sub6 class534_sub6
		 = (Class534_Sub6) aClass700_11540.method14135((byte) -1);
	     class534_sub6 != null;
	     class534_sub6
		 = (Class534_Sub6) aClass700_11540.method14139(1162465420)) {
	    Interface50 interface50
		= (Interface50) class534_sub6.anObject10417;
	    interface50.method142();
	}
	super.method14596();
    }
    
    final void method18032(Class420_Sub2 class420_sub2) {
	method18007(class420_sub2);
	if (aBoolArray11530[anInt9215] != class420_sub2.aBool10255) {
	    IDirect3DDevice.SetSamplerState(aLong11541, anInt9215, 1,
					    class420_sub2.aBool10255 ? 1 : 3);
	    aBoolArray11530[anInt9215] = class420_sub2.aBool10255;
	}
	if (aBoolArray11517[anInt9215] != class420_sub2.aBool10260) {
	    IDirect3DDevice.SetSamplerState(aLong11541, anInt9215, 2,
					    class420_sub2.aBool10260 ? 1 : 3);
	    aBoolArray11517[anInt9215] = class420_sub2.aBool10260;
	}
    }
    
    public Class176 method3232() {
	D3DADAPTER_IDENTIFIER d3dadapter_identifier
	    = new D3DADAPTER_IDENTIFIER();
	IDirect3D.GetAdapterIdentifier(aLong11506, anInt11542, 0,
				       d3dadapter_identifier);
	return new Class176(d3dadapter_identifier.VendorID,
			    method14585() ? "Direct3D FF" : "Direct3D", 9,
			    d3dadapter_identifier.Description,
			    d3dadapter_identifier.DriverVersion,
			    method14585());
    }
    
    final void method14953(Interface39 interface39, Class374 class374, int i,
			   int i_181_, int i_182_, int i_183_) {
	if (aClass278_Sub2_11523 != null)
	    aClass278_Sub2_11523.method15721();
	IDirect3DDevice.DrawIndexedPrimitiveIB(aLong11541,
					       (((Class414) interface39)
						.aLong4658),
					       4, 0, i, i_181_, i_182_,
					       i_183_);
    }
    
    void method14821(int i) {
	if (!aBool11535) {
	    int i_184_ = (i & 0x2) != 0 ? 2 : 3;
	    IDirect3DDevice.SetRenderState(aLong11541, 8, i_184_);
	}
    }
    
    void method14960(int i) {
	if (!aBool11535) {
	    int i_185_ = (i & 0x2) != 0 ? 2 : 3;
	    IDirect3DDevice.SetRenderState(aLong11541, 8, i_185_);
	}
    }
    
    void method14961(int i) {
	if (!aBool11535) {
	    int i_186_ = (i & 0x2) != 0 ? 2 : 3;
	    IDirect3DDevice.SetRenderState(aLong11541, 8, i_186_);
	}
    }
    
    static Class185 method18033
	(Canvas canvas, Class177 class177, Interface25 interface25,
	 Interface45 interface45, Interface48 interface48,
	 Interface46 interface46, Class472 class472, Integer integer) {
	Class185_Sub1_Sub1 class185_sub1_sub1 = null;
	Class185_Sub1_Sub1 class185_sub1_sub1_187_;
	try {
	    int i = 0;
	    int i_188_ = 1;
	    long l = IDirect3D.Direct3DCreate();
	    D3DCAPS d3dcaps = new D3DCAPS();
	    IDirect3D.GetDeviceCaps(l, i, i_188_, d3dcaps);
	    if ((d3dcaps.RasterCaps & 0x1000000) == 0)
		throw new RuntimeException("");
	    if (d3dcaps.MaxSimultaneousTextures < 2)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x2) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x8) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x40) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x200) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x2000000) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x10) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x2) == 0)
		throw new RuntimeException("");
	    if (d3dcaps.MaxActiveLights > 0 && d3dcaps.MaxActiveLights < 2)
		throw new RuntimeException("");
	    if (d3dcaps.MaxStreams < 5)
		throw new RuntimeException("");
	    D3DPRESENT_PARAMETERS d3dpresent_parameters
		= new D3DPRESENT_PARAMETERS(canvas);
	    d3dpresent_parameters.Windowed = true;
	    d3dpresent_parameters.EnableAutoDepthStencil = true;
	    d3dpresent_parameters.BackBufferWidth = canvas.getWidth();
	    d3dpresent_parameters.BackBufferHeight = canvas.getHeight();
	    d3dpresent_parameters.BackBufferCount = 1;
	    d3dpresent_parameters.PresentationInterval = -2147483648;
	    D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	    if (!method18017(i, i_188_, l, integer.intValue(), d3ddisplaymode,
			     d3dpresent_parameters))
		throw new RuntimeException("");
	    int i_189_ = 0;
	    if ((d3dcaps.DevCaps & 0x100000) != 0)
		i_189_ |= 0x10;
	    long l_190_ = 0L;
	    try {
		l_190_ = IDirect3D.CreateDeviceContext(l, i, i_188_, canvas,
						       i_189_ | 0x40,
						       d3dpresent_parameters);
	    } catch (RuntimeException_Sub5 runtimeexception_sub5) {
		l_190_
		    = IDirect3D.CreateDeviceContext(l, i, i_188_, canvas,
						    i_189_ & ~0x100000 | 0x20,
						    d3dpresent_parameters);
	    }
	    class185_sub1_sub1
		= new Class185_Sub1_Sub1(i, i_188_, l, l_190_, d3ddisplaymode,
					 d3dpresent_parameters, d3dcaps,
					 class177, interface25, interface45,
					 interface48, interface46, class472,
					 integer.intValue());
	    if (!class185_sub1_sub1.aHashtable2014.containsKey(canvas)) {
		Class481.method7927(canvas, -1287463980);
		class185_sub1_sub1.method3256
		    (canvas,
		     new Class175_Sub2_Sub3_Sub1(class185_sub1_sub1, canvas,
						 canvas.getWidth(),
						 canvas.getHeight(), true),
		     (byte) 4);
	    }
	    class185_sub1_sub1.method3258(canvas, 16439079);
	    class185_sub1_sub1.method14594();
	    class185_sub1_sub1_187_ = class185_sub1_sub1;
	} catch (RuntimeException runtimeexception) {
	    if (class185_sub1_sub1 != null)
		class185_sub1_sub1.method3327();
	    throw runtimeexception;
	}
	return class185_sub1_sub1_187_;
    }
    
    public boolean method14760() {
	return (aD3DCAPS11525.VertexShaderVersion & 0xffff) >= 257;
    }
    
    boolean method18034(int i, int i_191_) {
	int i_192_ = IDirect3DDevice.TestCooperativeLevel(aLong11541);
	if (i_192_ == 0 || i_192_ == -2005530519) {
	    IDirect3DDevice.SetDepthStencilSurface(aLong11541, 0L);
	    for (int i_193_ = 1; i_193_ < 4; i_193_++)
		IDirect3DDevice.SetRenderTarget(aLong11541, i_193_, 0L);
	    for (int i_194_ = 0; i_194_ < 4; i_194_++)
		IDirect3DDevice.SetStreamSource(aLong11541, i_194_, 0L, 0, 0);
	    for (int i_195_ = 0; i_195_ < 4; i_195_++)
		IDirect3DDevice.SetTexture(aLong11541, i_195_, 0L);
	    IDirect3DDevice.SetIndices(aLong11541, 0L);
	    method14596();
	    aD3DPRESENT_PARAMETERS11508.BackBufferWidth = i;
	    aD3DPRESENT_PARAMETERS11508.BackBufferHeight = i_191_;
	    aD3DPRESENT_PARAMETERS11508.BackBufferCount = 1;
	    if (method18017(anInt11542, anInt11504, aLong11506, anInt9263,
			    aD3DDISPLAYMODE11509,
			    aD3DPRESENT_PARAMETERS11508)) {
		int i_196_
		    = IDirect3DDevice.Reset(aLong11541,
					    aD3DPRESENT_PARAMETERS11508);
		if (Class356.method6310(i_196_)) {
		    aBool11511 = false;
		    method14597();
		    method14718();
		    return true;
		}
	    }
	}
	return false;
    }
    
    void method18035(int i, int i_197_) {
	method3280();
	method3616(i, i_197_, 1717979905);
	aLong11507
	    = (IDirect3DDevice.CreateRenderTarget
	       (aLong11541, i, i_197_,
		method18014(Class181.aClass181_1952, Class173.aClass173_1830),
		0, 0, false));
	for (int i_198_ = 0; i_198_ < 3; i_198_++)
	    aLongArray11543[i_198_]
		= (IDirect3DDevice.CreateOffscreenPlainSurface
		   (aLong11541, i, i_197_,
		    method18014(Class181.aClass181_1952,
				Class173.aClass173_1830),
		    2));
	method14586(i * i_197_ * 4);
    }
    
    Class534_Sub6 method18036(Interface50 interface50) {
	for (Class534_Sub6 class534_sub6
		 = (Class534_Sub6) aClass700_11540.method14135((byte) -1);
	     class534_sub6 != null;
	     class534_sub6
		 = (Class534_Sub6) aClass700_11540.method14139(894863402)) {
	    if (class534_sub6.anObject10417 == interface50)
		return class534_sub6;
	}
	return null;
    }
    
    Class534_Sub6 method18037(Interface50 interface50) {
	for (Class534_Sub6 class534_sub6
		 = (Class534_Sub6) aClass700_11540.method14135((byte) -1);
	     class534_sub6 != null;
	     class534_sub6
		 = (Class534_Sub6) aClass700_11540.method14139(1314840020)) {
	    if (class534_sub6.anObject10417 == interface50)
		return class534_sub6;
	}
	return null;
    }
    
    Class534_Sub6 method18038(Interface50 interface50) {
	for (Class534_Sub6 class534_sub6
		 = (Class534_Sub6) aClass700_11540.method14135((byte) -1);
	     class534_sub6 != null;
	     class534_sub6
		 = (Class534_Sub6) aClass700_11540.method14139(1585301660)) {
	    if (class534_sub6.anObject10417 == interface50)
		return class534_sub6;
	}
	return null;
    }
    
    void method18039(Interface50 interface50) {
	if (method18028(interface50) == null)
	    aClass700_11540.method14131(new Class534_Sub6(interface50),
					(short) 789);
    }
    
    public void method3459(int i, int i_199_) {
	IDirect3DDevice.Clear(aLong11541, i, i_199_, 1.0F, 0);
    }
    
    public Class175_Sub1 method3570() {
	return new Class175_Sub1_Sub1_Sub1(this);
    }
    
    void method18040(int i, int i_200_) {
	method3280();
	method3616(i, i_200_, 960735368);
	aLong11507
	    = (IDirect3DDevice.CreateRenderTarget
	       (aLong11541, i, i_200_,
		method18014(Class181.aClass181_1952, Class173.aClass173_1830),
		0, 0, false));
	for (int i_201_ = 0; i_201_ < 3; i_201_++)
	    aLongArray11543[i_201_]
		= (IDirect3DDevice.CreateOffscreenPlainSurface
		   (aLong11541, i, i_200_,
		    method18014(Class181.aClass181_1952,
				Class173.aClass173_1830),
		    2));
	method14586(i * i_200_ * 4);
    }
    
    public boolean method3417() {
	return true;
    }
    
    public boolean method14653() {
	return (aD3DCAPS11525.VertexShaderVersion & 0xffff) >= 257;
    }
    
    void method14929() {
	IDirect3DDevice.method15839(aLong11541, 15, aBool9131);
	IDirect3DDevice.SetRenderState(aLong11541, 24, aByte9261 & 0xff);
	if (aD3DPRESENT_PARAMETERS11508.MultiSampleType > 0) {
	    if (!aBool9131 || aByte9261 == 0) {
		if (aBool11532 || aBool11510)
		    IDirect3DDevice.SetRenderState(aLong11541, 181, 0);
		else if (aBool11531)
		    IDirect3DDevice.method15838(aLong11541, 154, 1.0F);
	    } else if (aBool11532)
		IDirect3DDevice.SetRenderState(aLong11541, 181,
					       method14713('S', 'S', 'A',
							   'A'));
	    else if (aBool11510)
		IDirect3DDevice.SetRenderState(aLong11541, 181,
					       method14713('A', 'T', 'O',
							   'C'));
	    else if (aBool11531)
		IDirect3DDevice.SetRenderState(aLong11541, 154,
					       method14713('A', '2', 'M',
							   '1'));
	}
    }
    
    public void method14748(Class349 class349) {
	Class349_Sub1 class349_sub1 = (Class349_Sub1) class349;
	IDirect3DDevice.SetVertexDeclaration(aLong11541,
					     class349_sub1.aLong10131);
    }
    
    public void method14670() {
	if (aBoolArray11518[anInt9215]) {
	    aBoolArray11518[anInt9215] = false;
	    IDirect3DDevice.SetTexture(aLong11541, anInt9215, 0L);
	    method14684();
	    method14683();
	}
    }
    
    void method18041(int i, int i_202_) {
	method3280();
	method3616(i, i_202_, 1267936007);
	aLong11507
	    = (IDirect3DDevice.CreateRenderTarget
	       (aLong11541, i, i_202_,
		method18014(Class181.aClass181_1952, Class173.aClass173_1830),
		0, 0, false));
	for (int i_203_ = 0; i_203_ < 3; i_203_++)
	    aLongArray11543[i_203_]
		= (IDirect3DDevice.CreateOffscreenPlainSurface
		   (aLong11541, i, i_202_,
		    method18014(Class181.aClass181_1952,
				Class173.aClass173_1830),
		    2));
	method14586(i * i_202_ * 4);
    }
    
    Interface44 method14967(Class181 class181, Class173 class173, int i,
			    int i_204_) {
	return new Class420_Sub2_Sub1(this, class181, class173, i, i_204_);
    }
    
    byte[] method18042(String string) {
	return method14840("dx", string);
    }
    
    final void method18043(Class420_Sub2 class420_sub2) {
	method18007(class420_sub2);
	if (aBoolArray11530[anInt9215] != class420_sub2.aBool10255) {
	    IDirect3DDevice.SetSamplerState(aLong11541, anInt9215, 1,
					    class420_sub2.aBool10255 ? 1 : 3);
	    aBoolArray11530[anInt9215] = class420_sub2.aBool10255;
	}
	if (aBoolArray11517[anInt9215] != class420_sub2.aBool10260) {
	    IDirect3DDevice.SetSamplerState(aLong11541, anInt9215, 2,
					    class420_sub2.aBool10260 ? 1 : 3);
	    aBoolArray11517[anInt9215] = class420_sub2.aBool10260;
	}
    }
    
    Interface41 method14665(int i, boolean bool, int[][] is) {
	return new Class420_Sub3(this, i, bool, is);
    }
    
    public Interface22 method3678(int i, int i_205_, Class181 class181,
				  Class173 class173, int i_206_) {
	return new Class445(this, class181, class173, i, i_205_, i_206_);
    }
    
    public void method14942(Class349 class349) {
	Class349_Sub1 class349_sub1 = (Class349_Sub1) class349;
	IDirect3DDevice.SetVertexDeclaration(aLong11541,
					     class349_sub1.aLong10131);
    }
    
    final void method18044(Class420_Sub1 class420_sub1) {
	method18007(class420_sub1);
	if (!aBoolArray11530[anInt9215]) {
	    IDirect3DDevice.SetSamplerState(aLong11541, anInt9215, 1, 1);
	    aBoolArray11530[anInt9215] = true;
	}
	if (!aBoolArray11517[anInt9215]) {
	    IDirect3DDevice.SetSamplerState(aLong11541, anInt9215, 2, 1);
	    aBoolArray11517[anInt9215] = true;
	}
    }
    
    Class349 method14940(Class381[] class381s) {
	return new Class349_Sub1(this, class381s);
    }
    
    void method14946(Interface39 interface39) {
	IDirect3DDevice.SetIndices(aLong11541,
				   ((Class414) interface39).aLong4658);
    }
    
    static final int method18045(Class378 class378) {
	switch (class378.anInt3918) {
	default:
	    throw new IllegalArgumentException();
	case 1:
	    return 7;
	case 3:
	    return 4;
	case 4:
	    return 10;
	case 0:
	    return 2;
	case 2:
	    return 26;
	}
    }
    
    void method14928() {
	IDirect3DDevice.method15839(aLong11541, 15, aBool9131);
	IDirect3DDevice.SetRenderState(aLong11541, 24, aByte9261 & 0xff);
	if (aD3DPRESENT_PARAMETERS11508.MultiSampleType > 0) {
	    if (!aBool9131 || aByte9261 == 0) {
		if (aBool11532 || aBool11510)
		    IDirect3DDevice.SetRenderState(aLong11541, 181, 0);
		else if (aBool11531)
		    IDirect3DDevice.method15838(aLong11541, 154, 1.0F);
	    } else if (aBool11532)
		IDirect3DDevice.SetRenderState(aLong11541, 181,
					       method14713('S', 'S', 'A',
							   'A'));
	    else if (aBool11510)
		IDirect3DDevice.SetRenderState(aLong11541, 181,
					       method14713('A', 'T', 'O',
							   'C'));
	    else if (aBool11531)
		IDirect3DDevice.SetRenderState(aLong11541, 154,
					       method14713('A', '2', 'M',
							   '1'));
	}
    }
    
    static final int method18046(Class378 class378) {
	switch (class378.anInt3918) {
	default:
	    throw new IllegalArgumentException();
	case 1:
	    return 7;
	case 3:
	    return 4;
	case 4:
	    return 10;
	case 0:
	    return 2;
	case 2:
	    return 26;
	}
    }
    
    boolean method18047(int i, int i_207_) {
	int i_208_ = IDirect3DDevice.TestCooperativeLevel(aLong11541);
	if (i_208_ == 0 || i_208_ == -2005530519) {
	    IDirect3DDevice.SetDepthStencilSurface(aLong11541, 0L);
	    for (int i_209_ = 1; i_209_ < 4; i_209_++)
		IDirect3DDevice.SetRenderTarget(aLong11541, i_209_, 0L);
	    for (int i_210_ = 0; i_210_ < 4; i_210_++)
		IDirect3DDevice.SetStreamSource(aLong11541, i_210_, 0L, 0, 0);
	    for (int i_211_ = 0; i_211_ < 4; i_211_++)
		IDirect3DDevice.SetTexture(aLong11541, i_211_, 0L);
	    IDirect3DDevice.SetIndices(aLong11541, 0L);
	    method14596();
	    aD3DPRESENT_PARAMETERS11508.BackBufferWidth = i;
	    aD3DPRESENT_PARAMETERS11508.BackBufferHeight = i_207_;
	    aD3DPRESENT_PARAMETERS11508.BackBufferCount = 1;
	    if (method18017(anInt11542, anInt11504, aLong11506, anInt9263,
			    aD3DDISPLAYMODE11509,
			    aD3DPRESENT_PARAMETERS11508)) {
		int i_212_
		    = IDirect3DDevice.Reset(aLong11541,
					    aD3DPRESENT_PARAMETERS11508);
		if (Class356.method6310(i_212_)) {
		    aBool11511 = false;
		    method14597();
		    method14718();
		    return true;
		}
	    }
	}
	return false;
    }
    
    static final int method18048(Class364 class364) {
	switch (class364.anInt3730) {
	case 2:
	    return 1;
	default:
	    return 0;
	case 1:
	    return 256;
	case 4:
	    return 2;
	case 5:
	    return 3;
	case 0:
	    return 4;
	}
    }
    
    void method14736() {
	if (aBool9125)
	    IDirect3DDevice.method15839(aLong11541, 137,
					aBool9146 && !aBool9196);
    }
    
    static final int method18049(Class364 class364) {
	switch (class364.anInt3730) {
	case 2:
	    return 1;
	default:
	    return 0;
	case 1:
	    return 256;
	case 4:
	    return 2;
	case 5:
	    return 3;
	case 0:
	    return 4;
	}
    }
    
    void method14919() {
	if (aBool9125) {
	    int i = (aBoolArray11518[anInt9215]
		     ? method18012(aClass378Array9117[anInt9215]) : 1);
	    IDirect3DDevice.SetTextureStageState(aLong11541, anInt9215, 4, i);
	}
    }
    
    void method14970() {
	IDirect3DDevice.method15839(aLong11541, 27, aBool9259);
    }
    
    void method14931() {
	IDirect3DDevice.method15839(aLong11541, 27, aBool9259);
    }
    
    void method14781() {
	IDirect3DDevice.method15839(aLong11541, 27, aBool9259);
    }
    
    final void method18050(Class420_Sub2 class420_sub2) {
	method18007(class420_sub2);
	if (aBoolArray11530[anInt9215] != class420_sub2.aBool10255) {
	    IDirect3DDevice.SetSamplerState(aLong11541, anInt9215, 1,
					    class420_sub2.aBool10255 ? 1 : 3);
	    aBoolArray11530[anInt9215] = class420_sub2.aBool10255;
	}
	if (aBoolArray11517[anInt9215] != class420_sub2.aBool10260) {
	    IDirect3DDevice.SetSamplerState(aLong11541, anInt9215, 2,
					    class420_sub2.aBool10260 ? 1 : 3);
	    aBoolArray11517[anInt9215] = class420_sub2.aBool10260;
	}
    }
    
    public final void method14870(Class374 class374, int i, int i_213_,
				  int i_214_, int i_215_) {
	if (aClass278_Sub2_11523 != null)
	    aClass278_Sub2_11523.method15721();
	IDirect3DDevice.DrawIndexedPrimitive(aLong11541, method18016(class374),
					     0, i, i_213_, i_214_, i_215_);
    }
    
    final void method18051(Class420_Sub1 class420_sub1) {
	method18007(class420_sub1);
	if (!aBoolArray11530[anInt9215]) {
	    IDirect3DDevice.SetSamplerState(aLong11541, anInt9215, 1, 1);
	    aBoolArray11530[anInt9215] = true;
	}
	if (!aBoolArray11517[anInt9215]) {
	    IDirect3DDevice.SetSamplerState(aLong11541, anInt9215, 2, 1);
	    aBoolArray11517[anInt9215] = true;
	}
    }
    
    void method14858() {
	if (aBool9125) {
	    D3DLIGHT.SetAmbient(aLong11512, aFloat9159 * aFloat9205,
				aFloat9292 * aFloat9205,
				aFloat9163 * aFloat9205, 0.0F);
	    aBool11515 = false;
	}
    }
    
    static final int method18052(Class181 class181, Class173 class173) {
	switch (class173.anInt1834 * -1414205941) {
	default:
	    break;
	case 4:
	    switch (class181.anInt1953 * -939549997) {
	    case 8:
		return 28;
	    case 3:
		return 77;
	    case 4:
		return 22;
	    case 6:
		return 50;
	    case 2:
		return Class366.anInt3855 * -822548177;
	    case 1:
		return 51;
	    default:
		break;
	    case 7:
		return Class366.anInt3854 * 612563925;
	    case 0:
		return 21;
	    }
	    break;
	case 2:
	    if (class181 == Class181.aClass181_1952)
		return 116;
	    break;
	case 0:
	    if (class181 == Class181.aClass181_1952)
		return 113;
	}
	throw new IllegalArgumentException("");
    }
    
    static final int method18053(Class181 class181, Class173 class173) {
	switch (class173.anInt1834 * -1414205941) {
	default:
	    break;
	case 4:
	    switch (class181.anInt1953 * -939549997) {
	    case 8:
		return 28;
	    case 3:
		return 77;
	    case 4:
		return 22;
	    case 6:
		return 50;
	    case 2:
		return Class366.anInt3855 * -822548177;
	    case 1:
		return 51;
	    default:
		break;
	    case 7:
		return Class366.anInt3854 * 612563925;
	    case 0:
		return 21;
	    }
	    break;
	case 2:
	    if (class181 == Class181.aClass181_1952)
		return 116;
	    break;
	case 0:
	    if (class181 == Class181.aClass181_1952)
		return 113;
	}
	throw new IllegalArgumentException("");
    }
    
    static final int method18054(Class173 class173) {
	if (class173 == Class173.aClass173_1829)
	    return 80;
	if (class173 == Class173.aClass173_1828)
	    return 77;
	throw new IllegalArgumentException("");
    }
    
    static final int method18055(Class173 class173) {
	if (class173 == Class173.aClass173_1829)
	    return 80;
	if (class173 == Class173.aClass173_1828)
	    return 77;
	throw new IllegalArgumentException("");
    }
    
    static final int method18056(Class173 class173) {
	if (class173 == Class173.aClass173_1829)
	    return 80;
	if (class173 == Class173.aClass173_1828)
	    return 77;
	throw new IllegalArgumentException("");
    }
    
    static final int method18057(Class173 class173) {
	if (class173 == Class173.aClass173_1829)
	    return 80;
	if (class173 == Class173.aClass173_1828)
	    return 77;
	throw new IllegalArgumentException("");
    }
    
    public Class175_Sub1 method3263() {
	return new Class175_Sub1_Sub1_Sub1(this);
    }
    
    static boolean method18058(int i, int i_216_, long l, int i_217_,
			       D3DDISPLAYMODE d3ddisplaymode,
			       D3DPRESENT_PARAMETERS d3dpresent_parameters) {
	int i_218_ = 0;
	int i_219_ = 0;
	int i_220_ = 0;
	boolean bool;
	try {
	    if (Class356.method6309
		(IDirect3D.GetAdapterDisplayMode(l, i, d3ddisplaymode)))
		return false;
	while_41_:
	    for (/**/; i_217_ >= 0; i_217_--) {
		if (i_217_ != 1) {
		    i_220_ = 0 + i_217_;
		    for (int i_221_ = 0; i_221_ < anIntArray11548.length;
			 i_221_++) {
			if (IDirect3D.CheckDeviceType(l, i, i_216_,
						      d3ddisplaymode.Format,
						      anIntArray11548[i_221_],
						      true) == 0
			    && IDirect3D.CheckDeviceFormat(l, i, i_216_,
							   (d3ddisplaymode
							    .Format),
							   1, 1,
							   (anIntArray11548
							    [i_221_])) == 0
			    && (i_217_ == 0
				|| (IDirect3D.CheckDeviceMultiSampleType
				    (l, i, i_216_, anIntArray11548[i_221_],
				     true, i_220_)) == 0)) {
			    for (int i_222_ = 0;
				 i_222_ < anIntArray11547.length; i_222_++) {
				if ((IDirect3D.CheckDeviceFormat
				     (l, i, i_216_, d3ddisplaymode.Format, 2,
				      1, anIntArray11547[i_222_])) == 0
				    && (IDirect3D.CheckDepthStencilMatch
					(l, i, i_216_, d3ddisplaymode.Format,
					 anIntArray11548[i_221_],
					 anIntArray11547[i_222_])) == 0
				    && (i_217_ == 0
					|| (IDirect3D
						.CheckDeviceMultiSampleType
					    (l, i, i_216_,
					     anIntArray11547[i_221_], true,
					     i_220_)) == 0)) {
				    i_219_ = anIntArray11548[i_221_];
				    i_218_ = anIntArray11547[i_222_];
				    break while_41_;
				}
			    }
			}
		    }
		}
	    }
	    if (i_217_ < 0 || i_219_ == 0 || i_218_ == 0)
		return false;
	    d3dpresent_parameters.BackBufferFormat = i_219_;
	    d3dpresent_parameters.AutoDepthStencilFormat = i_218_;
	    d3dpresent_parameters.MultiSampleType = i_220_;
	    d3dpresent_parameters.MultiSampleQuality = 0;
	    bool = true;
	} catch (Throwable throwable) {
	    return false;
	}
	return bool;
    }
    
    synchronized void method18059(long l) {
	if (anInt11505 == anInt11529) {
	    anInt11529 *= 2;
	    long[] ls = new long[anInt11529];
	    System.arraycopy(aLongArray11539, 0, ls, 0, anInt11505);
	    aLongArray11539 = ls;
	}
	aLongArray11539[anInt11505] = l;
	anInt11505++;
    }
    
    void method14863() {
	method14654();
	method14783();
    }
    
    synchronized void method18060(long l) {
	if (anInt11505 == anInt11529) {
	    anInt11529 *= 2;
	    long[] ls = new long[anInt11529];
	    System.arraycopy(aLongArray11539, 0, ls, 0, anInt11505);
	    aLongArray11539 = ls;
	}
	aLongArray11539[anInt11505] = l;
	anInt11505++;
    }
    
    public void method14973(Class433 class433) {
	class433.method6839(aClass433_11522);
    }
    
    final void method14974(int i, Class373 class373, boolean bool) {
	if (aBool9125) {
	    int i_223_ = 0;
	    int i_224_;
	    switch (i) {
	    case 2:
		i_224_ = 27;
		break;
	    default:
		i_224_ = 5;
		break;
	    case 1:
		i_224_ = 6;
	    }
	    if (bool)
		i_223_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState(aLong11541, anInt9215, i_224_,
						 (method18010(class373)
						  | i_223_));
	}
    }
    
    final void method14689(int i, Class373 class373, boolean bool) {
	if (aBool9125) {
	    int i_225_ = 0;
	    int i_226_;
	    switch (i) {
	    case 2:
		i_226_ = 27;
		break;
	    default:
		i_226_ = 5;
		break;
	    case 1:
		i_226_ = 6;
	    }
	    if (bool)
		i_225_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState(aLong11541, anInt9215, i_226_,
						 (method18010(class373)
						  | i_225_));
	}
    }
}
