/* Class420_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jagdx.Class356;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class420_Sub2_Sub1 extends Class420_Sub2 implements Interface44
{
    public void method244(int i, int i_0_, int i_1_, int i_2_, byte[] is,
			  Class181 class181, int i_3_, int i_4_) {
	super.method244(i, i_0_, i_1_, i_2_, is, class181, i_3_, i_4_);
    }
    
    public void method143() {
	super.method142();
    }
    
    public void method246(int i, int i_5_, int i_6_, int i_7_, int[] is,
			  int i_8_) {
	long l = IDirect3DTexture.GetSurfaceLevel(aLong4705, 0);
	long l_9_
	    = IDirect3DDevice.CreateRenderTarget((aClass185_Sub1_Sub1_4709
						  .aLong11541),
						 i_6_, i_7_, 21, 0, 0, true);
	aClass185_Sub1_Sub1_4709.method14586(i_7_ * i_6_ * 4);
	if (Class356.method6310
	    (IDirect3DDevice.StretchRect(aClass185_Sub1_Sub1_4709.aLong11541,
					 l, i, i_5_, i_6_, i_7_, l_9_, 0, 0,
					 i_6_, i_7_, 1))) {
	    IDirect3DSurface.Download(l_9_, 0, 0, i_6_, i_7_, i_6_ * 4, 16,
				      aClass185_Sub1_Sub1_4709.aLong9139);
	    aClass185_Sub1_Sub1_4709.aByteBuffer9266.clear();
	    aClass185_Sub1_Sub1_4709.aByteBuffer9266.asIntBuffer().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_9_);
    }
    
    public boolean method273() {
	return super.method270();
    }
    
    public void method267(int i, int i_10_, int i_11_, int i_12_, int[] is,
			  int i_13_) {
	long l = IDirect3DTexture.GetSurfaceLevel(aLong4705, 0);
	long l_14_
	    = IDirect3DDevice.CreateRenderTarget((aClass185_Sub1_Sub1_4709
						  .aLong11541),
						 i_11_, i_12_, 21, 0, 0, true);
	aClass185_Sub1_Sub1_4709.method14586(i_12_ * i_11_ * 4);
	if (Class356.method6310
	    (IDirect3DDevice.StretchRect(aClass185_Sub1_Sub1_4709.aLong11541,
					 l, i, i_10_, i_11_, i_12_, l_14_, 0,
					 0, i_11_, i_12_, 1))) {
	    IDirect3DSurface.Download(l_14_, 0, 0, i_11_, i_12_, i_11_ * 4, 16,
				      aClass185_Sub1_Sub1_4709.aLong9139);
	    aClass185_Sub1_Sub1_4709.aByteBuffer9266.clear();
	    aClass185_Sub1_Sub1_4709.aByteBuffer9266.asIntBuffer().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_14_);
    }
    
    public int method93() {
	return super.method93();
    }
    
    public float method241(float f) {
	return super.method241(f);
    }
    
    public float method245(float f) {
	return super.method245(f);
    }
    
    public void method261(int i, int i_15_, int i_16_, int i_17_, byte[] is,
			  Class181 class181, int i_18_, int i_19_) {
	super.method244(i, i_15_, i_16_, i_17_, is, class181, i_18_, i_19_);
    }
    
    public void method257(boolean bool, boolean bool_20_) {
	super.method257(bool, bool_20_);
    }
    
    public void method240(int i, int i_21_, int i_22_, int i_23_, int i_24_,
			  int i_25_) {
	super.method247(i, i_21_, i_22_, i_23_, i_24_, i_25_);
    }
    
    public boolean method270() {
	return super.method270();
    }
    
    public void method262(int i, int i_26_, int i_27_, int i_28_, int[] is,
			  int[] is_29_, int i_30_) {
	super.method262(i, i_26_, i_27_, i_28_, is, is_29_, i_30_);
    }
    
    public boolean method204() {
	return super.method204();
    }
    
    public float method250() {
	return super.method250();
    }
    
    public int method1() {
	return super.method1();
    }
    
    public Interface22 method341(int i) {
	return new Class424(this, i);
    }
    
    public void method333() {
	super.method333();
    }
    
    public void method339(Class372 class372) {
	super.method339(class372);
    }
    
    public Interface22 method340(int i) {
	return new Class424(this, i);
    }
    
    public void method141() {
	super.method142();
    }
    
    public boolean method271() {
	return super.method270();
    }
    
    public Interface22 method342(int i) {
	return new Class424(this, i);
    }
    
    public boolean method275() {
	return super.method270();
    }
    
    public int method253() {
	return super.method93();
    }
    
    public int method254() {
	return super.method93();
    }
    
    public float method255(float f) {
	return super.method241(f);
    }
    
    public float method256(float f) {
	return super.method245(f);
    }
    
    public boolean method260() {
	return super.method204();
    }
    
    public void method142() {
	super.method142();
    }
    
    public void method259(int i, int i_31_, int i_32_, int i_33_, int[] is,
			  int i_34_, int i_35_) {
	super.method269(i, i_31_, i_32_, i_33_, is, i_34_, i_35_);
    }
    
    public void method265(int i, int i_36_, int i_37_, int i_38_, byte[] is,
			  Class181 class181, int i_39_, int i_40_) {
	super.method244(i, i_36_, i_37_, i_38_, is, class181, i_39_, i_40_);
    }
    
    public float method249() {
	return super.method249();
    }
    
    public void method258(int i, int i_41_, int i_42_, int i_43_, byte[] is,
			  Class181 class181, int i_44_, int i_45_) {
	super.method244(i, i_41_, i_42_, i_43_, is, class181, i_44_, i_45_);
    }
    
    public void method263(int i, int i_46_, int i_47_, int i_48_, byte[] is,
			  Class181 class181, int i_49_, int i_50_) {
	super.method244(i, i_46_, i_47_, i_48_, is, class181, i_49_, i_50_);
    }
    
    public void method264(int i, int i_51_, int i_52_, int i_53_, byte[] is,
			  Class181 class181, int i_54_, int i_55_) {
	super.method244(i, i_51_, i_52_, i_53_, is, class181, i_54_, i_55_);
    }
    
    public void method243(int i, int i_56_, int i_57_, int i_58_, int[] is,
			  int i_59_) {
	long l = IDirect3DTexture.GetSurfaceLevel(aLong4705, 0);
	long l_60_
	    = IDirect3DDevice.CreateRenderTarget((aClass185_Sub1_Sub1_4709
						  .aLong11541),
						 i_57_, i_58_, 21, 0, 0, true);
	aClass185_Sub1_Sub1_4709.method14586(i_58_ * i_57_ * 4);
	if (Class356.method6310
	    (IDirect3DDevice.StretchRect(aClass185_Sub1_Sub1_4709.aLong11541,
					 l, i, i_56_, i_57_, i_58_, l_60_, 0,
					 0, i_57_, i_58_, 1))) {
	    IDirect3DSurface.Download(l_60_, 0, 0, i_57_, i_58_, i_57_ * 4, 16,
				      aClass185_Sub1_Sub1_4709.aLong9139);
	    aClass185_Sub1_Sub1_4709.aByteBuffer9266.clear();
	    aClass185_Sub1_Sub1_4709.aByteBuffer9266.asIntBuffer().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_60_);
    }
    
    public void method266(int i, int i_61_, int i_62_, int i_63_, int[] is,
			  int i_64_) {
	long l = IDirect3DTexture.GetSurfaceLevel(aLong4705, 0);
	long l_65_
	    = IDirect3DDevice.CreateRenderTarget((aClass185_Sub1_Sub1_4709
						  .aLong11541),
						 i_62_, i_63_, 21, 0, 0, true);
	aClass185_Sub1_Sub1_4709.method14586(i_63_ * i_62_ * 4);
	if (Class356.method6310
	    (IDirect3DDevice.StretchRect(aClass185_Sub1_Sub1_4709.aLong11541,
					 l, i, i_61_, i_62_, i_63_, l_65_, 0,
					 0, i_62_, i_63_, 1))) {
	    IDirect3DSurface.Download(l_65_, 0, 0, i_62_, i_63_, i_62_ * 4, 16,
				      aClass185_Sub1_Sub1_4709.aLong9139);
	    aClass185_Sub1_Sub1_4709.aByteBuffer9266.clear();
	    aClass185_Sub1_Sub1_4709.aByteBuffer9266.asIntBuffer().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_65_);
    }
    
    Class420_Sub2_Sub1(Class185_Sub1_Sub1 class185_sub1_sub1,
		       Class181 class181, Class173 class173, int i,
		       int i_66_) {
	super(class185_sub1_sub1, class181, class173, i, i_66_, 1025, 0);
    }
    
    public void method268(int i, int i_67_, int i_68_, int i_69_, int[] is,
			  int[] is_70_, int i_71_) {
	super.method262(i, i_67_, i_68_, i_69_, is, is_70_, i_71_);
    }
    
    public void method274(int i, int i_72_, int i_73_, int i_74_, int i_75_,
			  int i_76_) {
	super.method247(i, i_72_, i_73_, i_74_, i_75_, i_76_);
    }
    
    public void method144() {
	super.method142();
    }
    
    public float method248() {
	return super.method250();
    }
    
    public float method239() {
	return super.method249();
    }
    
    public float method272() {
	return super.method249();
    }
    
    public int method251() {
	return super.method1();
    }
    
    public void method247(int i, int i_77_, int i_78_, int i_79_, int i_80_,
			  int i_81_) {
	super.method247(i, i_77_, i_78_, i_79_, i_80_, i_81_);
    }
    
    public void method242(boolean bool, boolean bool_82_) {
	super.method257(bool, bool_82_);
    }
    
    public void method335() {
	super.method333();
    }
    
    public void method332() {
	super.method333();
    }
    
    public void method336() {
	super.method333();
    }
    
    public void method334() {
	super.method333();
    }
    
    public void method338(Class372 class372) {
	super.method339(class372);
    }
    
    public void method337(Class372 class372) {
	super.method339(class372);
    }
    
    public void method269(int i, int i_83_, int i_84_, int i_85_, int[] is,
			  int i_86_, int i_87_) {
	super.method269(i, i_83_, i_84_, i_85_, is, i_86_, i_87_);
    }
    
    public int method252() {
	return super.method1();
    }
}
