/* Class416 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jagdx.Class356;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;

public class Class416 implements Interface37
{
    byte aByte4667;
    int anInt4668;
    Class185_Sub1_Sub1 aClass185_Sub1_Sub1_4669;
    int anInt4670;
    boolean aBool4671;
    long aLong4672 = 0L;
    
    public void method142() {
	if (aLong4672 != 0L) {
	    IUnknown.Release(aLong4672);
	    aLong4672 = 0L;
	}
	anInt4668 = 0;
	anInt4670 = 0;
	aClass185_Sub1_Sub1_4669.method14582(this);
    }
    
    public void finalize() {
	method6747();
    }
    
    public int method53() {
	return anInt4670;
    }
    
    public boolean method236(int i, int i_0_) {
	anInt4670 = i;
	aByte4667 = (byte) i_0_;
	if (anInt4670 > anInt4668) {
	    int i_1_ = 8;
	    int i_2_;
	    if (aBool4671) {
		i_2_ = 0;
		i_1_ |= 0x200;
	    } else
		i_2_ = 1;
	    if (aLong4672 != 0L)
		IUnknown.Release(aLong4672);
	    aLong4672
		= IDirect3DDevice.CreateVertexBuffer((aClass185_Sub1_Sub1_4669
						      .aLong11541),
						     anInt4670, i_1_, 0, i_2_);
	    anInt4668 = anInt4670;
	}
	return aLong4672 != 0L;
    }
    
    public boolean method233(int i, int i_3_, long l) {
	return Class356.method6310(IDirect3DVertexBuffer.Upload(aLong4672, i,
								i_3_,
								(aBool4671
								 ? 8192 : 0),
								l));
    }
    
    public void method228() {
	IDirect3DVertexBuffer.Unlock(aLong4672);
    }
    
    public boolean method235(int i, int i_4_, long l) {
	return Class356.method6310(IDirect3DVertexBuffer.Upload(aLong4672, i,
								i_4_,
								(aBool4671
								 ? 8192 : 0),
								l));
    }
    
    int method6746() {
	return aByte4667;
    }
    
    void method6747() {
	if (aLong4672 != 0L) {
	    aClass185_Sub1_Sub1_4669.method18018(aLong4672);
	    aLong4672 = 0L;
	    anInt4668 = 0;
	    anInt4670 = 0;
	}
    }
    
    void method6748() {
	method6747();
    }
    
    public int method145() {
	return anInt4670;
    }
    
    public void method141() {
	if (aLong4672 != 0L) {
	    IUnknown.Release(aLong4672);
	    aLong4672 = 0L;
	}
	anInt4668 = 0;
	anInt4670 = 0;
	aClass185_Sub1_Sub1_4669.method14582(this);
    }
    
    public boolean method238(int i, int i_5_) {
	anInt4670 = i;
	aByte4667 = (byte) i_5_;
	if (anInt4670 > anInt4668) {
	    int i_6_ = 8;
	    int i_7_;
	    if (aBool4671) {
		i_7_ = 0;
		i_6_ |= 0x200;
	    } else
		i_7_ = 1;
	    if (aLong4672 != 0L)
		IUnknown.Release(aLong4672);
	    aLong4672
		= IDirect3DDevice.CreateVertexBuffer((aClass185_Sub1_Sub1_4669
						      .aLong11541),
						     anInt4670, i_6_, 0, i_7_);
	    anInt4668 = anInt4670;
	}
	return aLong4672 != 0L;
    }
    
    void method6749() {
	method6747();
    }
    
    Class416(Class185_Sub1_Sub1 class185_sub1_sub1, boolean bool) {
	aClass185_Sub1_Sub1_4669 = class185_sub1_sub1;
	aBool4671 = bool;
	aClass185_Sub1_Sub1_4669.method14617(this);
    }
    
    public int method9() {
	return anInt4670;
    }
    
    public boolean method237(int i, int i_8_) {
	anInt4670 = i;
	aByte4667 = (byte) i_8_;
	if (anInt4670 > anInt4668) {
	    int i_9_ = 8;
	    int i_10_;
	    if (aBool4671) {
		i_10_ = 0;
		i_9_ |= 0x200;
	    } else
		i_10_ = 1;
	    if (aLong4672 != 0L)
		IUnknown.Release(aLong4672);
	    aLong4672
		= IDirect3DDevice.CreateVertexBuffer((aClass185_Sub1_Sub1_4669
						      .aLong11541),
						     anInt4670, i_9_, 0,
						     i_10_);
	    anInt4668 = anInt4670;
	}
	return aLong4672 != 0L;
    }
    
    public void method143() {
	if (aLong4672 != 0L) {
	    IUnknown.Release(aLong4672);
	    aLong4672 = 0L;
	}
	anInt4668 = 0;
	anInt4670 = 0;
	aClass185_Sub1_Sub1_4669.method14582(this);
    }
    
    public long method227(int i, int i_11_) {
	return IDirect3DVertexBuffer.Lock(aLong4672, i, i_11_,
					  aBool4671 ? 8192 : 0);
    }
    
    void method6750() {
	method6747();
    }
    
    public int method234() {
	return anInt4670;
    }
    
    public boolean method231(int i, int i_12_, long l) {
	return Class356.method6310(IDirect3DVertexBuffer.Upload(aLong4672, i,
								i_12_,
								(aBool4671
								 ? 8192 : 0),
								l));
    }
    
    public boolean method232(int i, int i_13_, long l) {
	return Class356.method6310(IDirect3DVertexBuffer.Upload(aLong4672, i,
								i_13_,
								(aBool4671
								 ? 8192 : 0),
								l));
    }
    
    public void method226() {
	IDirect3DVertexBuffer.Unlock(aLong4672);
    }
    
    public long method230(int i, int i_14_) {
	return IDirect3DVertexBuffer.Lock(aLong4672, i, i_14_,
					  aBool4671 ? 8192 : 0);
    }
    
    public void method229() {
	IDirect3DVertexBuffer.Unlock(aLong4672);
    }
    
    public void method144() {
	if (aLong4672 != 0L) {
	    IUnknown.Release(aLong4672);
	    aLong4672 = 0L;
	}
	anInt4668 = 0;
	anInt4670 = 0;
	aClass185_Sub1_Sub1_4669.method14582(this);
    }
    
    int method6751() {
	return aByte4667;
    }
    
    void method6752() {
	if (aLong4672 != 0L) {
	    aClass185_Sub1_Sub1_4669.method18018(aLong4672);
	    aLong4672 = 0L;
	    anInt4668 = 0;
	    anInt4670 = 0;
	}
    }
}
