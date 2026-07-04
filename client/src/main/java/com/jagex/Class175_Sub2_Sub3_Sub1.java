/* Class175_Sub2_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;

import jagdx.Class356;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSwapChain;
import jagdx.IUnknown;

public class Class175_Sub2_Sub3_Sub1 extends Class175_Sub2_Sub3
    implements Interface50
{
    int anInt12042;
    Canvas aCanvas12043;
    long aLong12044;
    long aLong12045;
    boolean aBool12046 = false;
    int anInt12047;
    D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS12048;
    long aLong12049;
    Class185_Sub1_Sub1 aClass185_Sub1_Sub1_12050;
    boolean aBool12051 = false;
    
    void method18653() {
	if (aLong12049 != 0L) {
	    IUnknown.Release(aLong12049);
	    aLong12049 = 0L;
	}
	if (aLong12045 != 0L) {
	    IUnknown.Release(aLong12045);
	    aLong12045 = 0L;
	}
	if (aLong12044 != 0L) {
	    IUnknown.Release(aLong12044);
	    aLong12044 = 0L;
	}
	aClass185_Sub1_Sub1_12050.method18020(this);
    }
    
    void method18654() throws Throwable {
	method18655();
	super.finalize();
    }
    
    public void method362() {
	if (aLong12049 != 0L) {
	    IUnknown.Release(aLong12049);
	    aLong12049 = 0L;
	}
	if (aLong12045 != 0L) {
	    IUnknown.Release(aLong12045);
	    aLong12045 = 0L;
	}
	if (aLong12044 != 0L) {
	    IUnknown.Release(aLong12044);
	    aLong12044 = 0L;
	}
	aClass185_Sub1_Sub1_12050.method18020(this);
    }
    
    public int method2911() {
	return anInt12042;
    }
    
    public boolean method358() {
	aBool12046 = true;
	if (aLong12044 == 0L) {
	    if (aClass185_Sub1_Sub1_12050.aBool11511)
		return false;
	    method229();
	}
	if (Class356.method6309(IDirect3DDevice.SetRenderTarget
				(aClass185_Sub1_Sub1_12050.aLong11541, 0,
				 aLong12049)))
	    return false;
	if (Class356.method6309(IDirect3DDevice.SetDepthStencilSurface
				(aClass185_Sub1_Sub1_12050.aLong11541,
				 aLong12045)))
	    return false;
	return super.method358();
    }
    
    boolean method2912() {
	aBool12046 = false;
	return Class356.method6310(IDirect3DDevice.SetDepthStencilSurface
				   (aClass185_Sub1_Sub1_12050.aLong11541, 0L));
    }
    
    Class175_Sub2_Sub3_Sub1(Class185_Sub1_Sub1 class185_sub1_sub1,
			    Canvas canvas, int i, int i_0_, boolean bool) {
	super(class185_sub1_sub1);
	aCanvas12043 = canvas;
	aClass185_Sub1_Sub1_12050 = class185_sub1_sub1;
	anInt12047 = i;
	anInt12042 = i_0_;
	aBool12051 = bool;
	method229();
    }
    
    public int method15476(int i, int i_1_) {
	return IDirect3DSwapChain.Present(aLong12044, 0);
    }
    
    public int method2910() {
	return anInt12047;
    }
    
    public void method142() {
	if (aLong12049 != 0L) {
	    IUnknown.Release(aLong12049);
	    aLong12049 = 0L;
	}
	if (aLong12045 != 0L) {
	    IUnknown.Release(aLong12045);
	    aLong12045 = 0L;
	}
	if (aLong12044 != 0L) {
	    IUnknown.Release(aLong12044);
	    aLong12044 = 0L;
	}
	aClass185_Sub1_Sub1_12050.method18020(this);
    }
    
    void method18655() {
	if (aLong12049 != 0L) {
	    IUnknown.Release(aLong12049);
	    aLong12049 = 0L;
	}
	if (aLong12045 != 0L) {
	    IUnknown.Release(aLong12045);
	    aLong12045 = 0L;
	}
	if (aLong12044 != 0L) {
	    IUnknown.Release(aLong12044);
	    aLong12044 = 0L;
	}
	aClass185_Sub1_Sub1_12050.method18020(this);
    }
    
    public void finalize() throws Throwable {
	method18655();
	super.finalize();
    }
    
    public int method2913() {
	return anInt12047;
    }
    
    public int method2914() {
	return anInt12042;
    }
    
    public int method15475() {
	return IDirect3DSwapChain.Present(aLong12044, 0);
    }
    
    public void method359() {
	if (aLong12044 == 0L) {
	    aD3DPRESENT_PARAMETERS12048
		= new D3DPRESENT_PARAMETERS(aCanvas12043);
	    aD3DPRESENT_PARAMETERS12048.Windowed = true;
	    aD3DPRESENT_PARAMETERS12048.BackBufferCount = 1;
	    aD3DPRESENT_PARAMETERS12048.PresentationInterval = -2147483648;
	    aD3DPRESENT_PARAMETERS12048.BackBufferWidth = anInt12047;
	    aD3DPRESENT_PARAMETERS12048.BackBufferHeight = anInt12042;
	    if (aBool12051) {
		aLong12044
		    = IDirect3DDevice.GetSwapChain((aClass185_Sub1_Sub1_12050
						    .aLong11541),
						   0);
		aLong12049
		    = IDirect3DSwapChain.GetBackBuffer(aLong12044, 0, 0);
		aLong12045 = (IDirect3DDevice.GetDepthStencilSurface
			      (aClass185_Sub1_Sub1_12050.aLong11541));
	    } else {
		if (!Class185_Sub1_Sub1.method18017
		     (aClass185_Sub1_Sub1_12050.anInt11542,
		      aClass185_Sub1_Sub1_12050.anInt11504,
		      aClass185_Sub1_Sub1_12050.aLong11506,
		      aClass185_Sub1_Sub1_12050.anInt9263,
		      aClass185_Sub1_Sub1_12050.aD3DDISPLAYMODE11509,
		      aD3DPRESENT_PARAMETERS12048))
		    throw new RuntimeException();
		int i = aD3DPRESENT_PARAMETERS12048.AutoDepthStencilFormat;
		aLong12044 = (IDirect3DDevice.CreateAdditionalSwapChain
			      (aClass185_Sub1_Sub1_12050.aLong11541,
			       aD3DPRESENT_PARAMETERS12048));
		aLong12049
		    = IDirect3DSwapChain.GetBackBuffer(aLong12044, 0, 0);
		aLong12045 = (IDirect3DDevice.CreateDepthStencilSurface
			      (aClass185_Sub1_Sub1_12050.aLong11541,
			       anInt12047, anInt12042, i,
			       aD3DPRESENT_PARAMETERS12048.MultiSampleType,
			       aD3DPRESENT_PARAMETERS12048.MultiSampleQuality,
			       false));
	    }
	    aClass185_Sub1_Sub1_12050.method18000(this);
	}
	if (aBool12046)
	    method358();
    }
    
    public boolean method206() {
	aBool12046 = true;
	if (aLong12044 == 0L) {
	    if (aClass185_Sub1_Sub1_12050.aBool11511)
		return false;
	    method229();
	}
	if (Class356.method6309(IDirect3DDevice.SetRenderTarget
				(aClass185_Sub1_Sub1_12050.aLong11541, 0,
				 aLong12049)))
	    return false;
	if (Class356.method6309(IDirect3DDevice.SetDepthStencilSurface
				(aClass185_Sub1_Sub1_12050.aLong11541,
				 aLong12045)))
	    return false;
	return super.method358();
    }
    
    public void method229() {
	if (aLong12044 == 0L) {
	    aD3DPRESENT_PARAMETERS12048
		= new D3DPRESENT_PARAMETERS(aCanvas12043);
	    aD3DPRESENT_PARAMETERS12048.Windowed = true;
	    aD3DPRESENT_PARAMETERS12048.BackBufferCount = 1;
	    aD3DPRESENT_PARAMETERS12048.PresentationInterval = -2147483648;
	    aD3DPRESENT_PARAMETERS12048.BackBufferWidth = anInt12047;
	    aD3DPRESENT_PARAMETERS12048.BackBufferHeight = anInt12042;
	    if (aBool12051) {
		aLong12044
		    = IDirect3DDevice.GetSwapChain((aClass185_Sub1_Sub1_12050
						    .aLong11541),
						   0);
		aLong12049
		    = IDirect3DSwapChain.GetBackBuffer(aLong12044, 0, 0);
		aLong12045 = (IDirect3DDevice.GetDepthStencilSurface
			      (aClass185_Sub1_Sub1_12050.aLong11541));
	    } else {
		if (!Class185_Sub1_Sub1.method18017
		     (aClass185_Sub1_Sub1_12050.anInt11542,
		      aClass185_Sub1_Sub1_12050.anInt11504,
		      aClass185_Sub1_Sub1_12050.aLong11506,
		      aClass185_Sub1_Sub1_12050.anInt9263,
		      aClass185_Sub1_Sub1_12050.aD3DDISPLAYMODE11509,
		      aD3DPRESENT_PARAMETERS12048))
		    throw new RuntimeException();
		int i = aD3DPRESENT_PARAMETERS12048.AutoDepthStencilFormat;
		aLong12044 = (IDirect3DDevice.CreateAdditionalSwapChain
			      (aClass185_Sub1_Sub1_12050.aLong11541,
			       aD3DPRESENT_PARAMETERS12048));
		aLong12049
		    = IDirect3DSwapChain.GetBackBuffer(aLong12044, 0, 0);
		aLong12045 = (IDirect3DDevice.CreateDepthStencilSurface
			      (aClass185_Sub1_Sub1_12050.aLong11541,
			       anInt12047, anInt12042, i,
			       aD3DPRESENT_PARAMETERS12048.MultiSampleType,
			       aD3DPRESENT_PARAMETERS12048.MultiSampleQuality,
			       false));
	    }
	    aClass185_Sub1_Sub1_12050.method18000(this);
	}
	if (aBool12046)
	    method358();
    }
    
    public boolean method357() {
	aBool12046 = true;
	if (aLong12044 == 0L) {
	    if (aClass185_Sub1_Sub1_12050.aBool11511)
		return false;
	    method229();
	}
	if (Class356.method6309(IDirect3DDevice.SetRenderTarget
				(aClass185_Sub1_Sub1_12050.aLong11541, 0,
				 aLong12049)))
	    return false;
	if (Class356.method6309(IDirect3DDevice.SetDepthStencilSurface
				(aClass185_Sub1_Sub1_12050.aLong11541,
				 aLong12045)))
	    return false;
	return super.method358();
    }
    
    public int method2915() {
	return anInt12042;
    }
    
    boolean method2917() {
	aBool12046 = false;
	return Class356.method6310(IDirect3DDevice.SetDepthStencilSurface
				   (aClass185_Sub1_Sub1_12050.aLong11541, 0L));
    }
    
    boolean method2918() {
	aBool12046 = false;
	return Class356.method6310(IDirect3DDevice.SetDepthStencilSurface
				   (aClass185_Sub1_Sub1_12050.aLong11541, 0L));
    }
    
    public void method361() {
	if (aLong12049 != 0L) {
	    IUnknown.Release(aLong12049);
	    aLong12049 = 0L;
	}
	if (aLong12045 != 0L) {
	    IUnknown.Release(aLong12045);
	    aLong12045 = 0L;
	}
	if (aLong12044 != 0L) {
	    IUnknown.Release(aLong12044);
	    aLong12044 = 0L;
	}
	aClass185_Sub1_Sub1_12050.method18020(this);
    }
    
    void method18656() {
	if (aLong12049 != 0L) {
	    IUnknown.Release(aLong12049);
	    aLong12049 = 0L;
	}
	if (aLong12045 != 0L) {
	    IUnknown.Release(aLong12045);
	    aLong12045 = 0L;
	}
	if (aLong12044 != 0L) {
	    IUnknown.Release(aLong12044);
	    aLong12044 = 0L;
	}
	aClass185_Sub1_Sub1_12050.method18020(this);
    }
    
    public void method364() {
	if (aLong12049 != 0L) {
	    IUnknown.Release(aLong12049);
	    aLong12049 = 0L;
	}
	if (aLong12045 != 0L) {
	    IUnknown.Release(aLong12045);
	    aLong12045 = 0L;
	}
	if (aLong12044 != 0L) {
	    IUnknown.Release(aLong12044);
	    aLong12044 = 0L;
	}
	aClass185_Sub1_Sub1_12050.method18020(this);
    }
    
    void method15478(int i, int i_2_) {
	method142();
	anInt12047 = i;
	anInt12042 = i_2_;
	if (aBool12051)
	    aClass185_Sub1_Sub1_12050.method17997(anInt12047, anInt12042);
	method229();
	super.method15477(i, i_2_);
    }
    
    public int method15479() {
	return IDirect3DSwapChain.Present(aLong12044, 0);
    }
    
    public boolean method207() {
	aBool12046 = true;
	if (aLong12044 == 0L) {
	    if (aClass185_Sub1_Sub1_12050.aBool11511)
		return false;
	    method229();
	}
	if (Class356.method6309(IDirect3DDevice.SetRenderTarget
				(aClass185_Sub1_Sub1_12050.aLong11541, 0,
				 aLong12049)))
	    return false;
	if (Class356.method6309(IDirect3DDevice.SetDepthStencilSurface
				(aClass185_Sub1_Sub1_12050.aLong11541,
				 aLong12045)))
	    return false;
	return super.method358();
    }
    
    public int method15482() {
	return IDirect3DSwapChain.Present(aLong12044, 0);
    }
    
    public int method15481() {
	return IDirect3DSwapChain.Present(aLong12044, 0);
    }
    
    public int method15474() {
	return IDirect3DSwapChain.Present(aLong12044, 0);
    }
    
    void method15477(int i, int i_3_) {
	method142();
	anInt12047 = i;
	anInt12042 = i_3_;
	if (aBool12051)
	    aClass185_Sub1_Sub1_12050.method17997(anInt12047, anInt12042);
	method229();
	super.method15477(i, i_3_);
    }
    
    void method18657() throws Throwable {
	method18655();
	super.finalize();
    }
    
    void method18658() throws Throwable {
	method18655();
	super.finalize();
    }
    
    public int method15480(int i, int i_4_) {
	return IDirect3DSwapChain.Present(aLong12044, 0);
    }
    
    boolean method2916() {
	aBool12046 = false;
	return Class356.method6310(IDirect3DDevice.SetDepthStencilSurface
				   (aClass185_Sub1_Sub1_12050.aLong11541, 0L));
    }
    
    public void method363() {
	if (aLong12044 == 0L) {
	    aD3DPRESENT_PARAMETERS12048
		= new D3DPRESENT_PARAMETERS(aCanvas12043);
	    aD3DPRESENT_PARAMETERS12048.Windowed = true;
	    aD3DPRESENT_PARAMETERS12048.BackBufferCount = 1;
	    aD3DPRESENT_PARAMETERS12048.PresentationInterval = -2147483648;
	    aD3DPRESENT_PARAMETERS12048.BackBufferWidth = anInt12047;
	    aD3DPRESENT_PARAMETERS12048.BackBufferHeight = anInt12042;
	    if (aBool12051) {
		aLong12044
		    = IDirect3DDevice.GetSwapChain((aClass185_Sub1_Sub1_12050
						    .aLong11541),
						   0);
		aLong12049
		    = IDirect3DSwapChain.GetBackBuffer(aLong12044, 0, 0);
		aLong12045 = (IDirect3DDevice.GetDepthStencilSurface
			      (aClass185_Sub1_Sub1_12050.aLong11541));
	    } else {
		if (!Class185_Sub1_Sub1.method18017
		     (aClass185_Sub1_Sub1_12050.anInt11542,
		      aClass185_Sub1_Sub1_12050.anInt11504,
		      aClass185_Sub1_Sub1_12050.aLong11506,
		      aClass185_Sub1_Sub1_12050.anInt9263,
		      aClass185_Sub1_Sub1_12050.aD3DDISPLAYMODE11509,
		      aD3DPRESENT_PARAMETERS12048))
		    throw new RuntimeException();
		int i = aD3DPRESENT_PARAMETERS12048.AutoDepthStencilFormat;
		aLong12044 = (IDirect3DDevice.CreateAdditionalSwapChain
			      (aClass185_Sub1_Sub1_12050.aLong11541,
			       aD3DPRESENT_PARAMETERS12048));
		aLong12049
		    = IDirect3DSwapChain.GetBackBuffer(aLong12044, 0, 0);
		aLong12045 = (IDirect3DDevice.CreateDepthStencilSurface
			      (aClass185_Sub1_Sub1_12050.aLong11541,
			       anInt12047, anInt12042, i,
			       aD3DPRESENT_PARAMETERS12048.MultiSampleType,
			       aD3DPRESENT_PARAMETERS12048.MultiSampleQuality,
			       false));
	    }
	    aClass185_Sub1_Sub1_12050.method18000(this);
	}
	if (aBool12046)
	    method358();
    }
    
    void method18659() {
	if (aLong12049 != 0L) {
	    IUnknown.Release(aLong12049);
	    aLong12049 = 0L;
	}
	if (aLong12045 != 0L) {
	    IUnknown.Release(aLong12045);
	    aLong12045 = 0L;
	}
	if (aLong12044 != 0L) {
	    IUnknown.Release(aLong12044);
	    aLong12044 = 0L;
	}
	aClass185_Sub1_Sub1_12050.method18020(this);
    }
    
    public void method226() {
	if (aLong12044 == 0L) {
	    aD3DPRESENT_PARAMETERS12048
		= new D3DPRESENT_PARAMETERS(aCanvas12043);
	    aD3DPRESENT_PARAMETERS12048.Windowed = true;
	    aD3DPRESENT_PARAMETERS12048.BackBufferCount = 1;
	    aD3DPRESENT_PARAMETERS12048.PresentationInterval = -2147483648;
	    aD3DPRESENT_PARAMETERS12048.BackBufferWidth = anInt12047;
	    aD3DPRESENT_PARAMETERS12048.BackBufferHeight = anInt12042;
	    if (aBool12051) {
		aLong12044
		    = IDirect3DDevice.GetSwapChain((aClass185_Sub1_Sub1_12050
						    .aLong11541),
						   0);
		aLong12049
		    = IDirect3DSwapChain.GetBackBuffer(aLong12044, 0, 0);
		aLong12045 = (IDirect3DDevice.GetDepthStencilSurface
			      (aClass185_Sub1_Sub1_12050.aLong11541));
	    } else {
		if (!Class185_Sub1_Sub1.method18017
		     (aClass185_Sub1_Sub1_12050.anInt11542,
		      aClass185_Sub1_Sub1_12050.anInt11504,
		      aClass185_Sub1_Sub1_12050.aLong11506,
		      aClass185_Sub1_Sub1_12050.anInt9263,
		      aClass185_Sub1_Sub1_12050.aD3DDISPLAYMODE11509,
		      aD3DPRESENT_PARAMETERS12048))
		    throw new RuntimeException();
		int i = aD3DPRESENT_PARAMETERS12048.AutoDepthStencilFormat;
		aLong12044 = (IDirect3DDevice.CreateAdditionalSwapChain
			      (aClass185_Sub1_Sub1_12050.aLong11541,
			       aD3DPRESENT_PARAMETERS12048));
		aLong12049
		    = IDirect3DSwapChain.GetBackBuffer(aLong12044, 0, 0);
		aLong12045 = (IDirect3DDevice.CreateDepthStencilSurface
			      (aClass185_Sub1_Sub1_12050.aLong11541,
			       anInt12047, anInt12042, i,
			       aD3DPRESENT_PARAMETERS12048.MultiSampleType,
			       aD3DPRESENT_PARAMETERS12048.MultiSampleQuality,
			       false));
	    }
	    aClass185_Sub1_Sub1_12050.method18000(this);
	}
	if (aBool12046)
	    method358();
    }
    
    public boolean method360() {
	aBool12046 = true;
	if (aLong12044 == 0L) {
	    if (aClass185_Sub1_Sub1_12050.aBool11511)
		return false;
	    method229();
	}
	if (Class356.method6309(IDirect3DDevice.SetRenderTarget
				(aClass185_Sub1_Sub1_12050.aLong11541, 0,
				 aLong12049)))
	    return false;
	if (Class356.method6309(IDirect3DDevice.SetDepthStencilSurface
				(aClass185_Sub1_Sub1_12050.aLong11541,
				 aLong12045)))
	    return false;
	return super.method358();
    }
}
