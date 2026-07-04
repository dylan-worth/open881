/* Class414 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jagdx.Class356;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DIndexBuffer;
import jagdx.IUnknown;

public class Class414 implements Interface39
{
    long aLong4658 = 0L;
    Class185_Sub1_Sub1 aClass185_Sub1_Sub1_4659;
    int anInt4660;
    int anInt4661;
    Class173 aClass173_4662;
    boolean aBool4663;
    
    void method6734() {
	method6735();
    }
    
    public Class173 method278() {
	return aClass173_4662;
    }
    
    public Class173 method276() {
	return aClass173_4662;
    }
    
    public void method277(int i) {
	anInt4661 = aClass173_4662.anInt1825 * 1899960707 * i;
	if (anInt4661 > anInt4660) {
	    if (aLong4658 != 0L)
		IUnknown.Release(aLong4658);
	    int i_0_ = 8;
	    int i_1_;
	    if (aBool4663) {
		i_1_ = 0;
		i_0_ |= 0x200;
	    } else
		i_1_ = 1;
	    aLong4658
		= (IDirect3DDevice.CreateIndexBuffer
		   (aClass185_Sub1_Sub1_4659.aLong11541, anInt4661, i_0_,
		    aClass173_4662 == Class173.aClass173_1829 ? 101 : 102,
		    i_1_));
	    anInt4660 = anInt4661;
	}
    }
    
    public long method227(int i, int i_2_) {
	return IDirect3DIndexBuffer.Lock(aLong4658, i, i_2_,
					 aBool4663 ? 8192 : 0);
    }
    
    public void method142() {
	if (aLong4658 != 0L) {
	    IUnknown.Release(aLong4658);
	    aLong4658 = 0L;
	}
	anInt4660 = 0;
	anInt4661 = 0;
	aClass185_Sub1_Sub1_4659.method14582(this);
    }
    
    public void method229() {
	IDirect3DIndexBuffer.Unlock(aLong4658);
    }
    
    public void method279(int i) {
	anInt4661 = aClass173_4662.anInt1825 * 1899960707 * i;
	if (anInt4661 > anInt4660) {
	    if (aLong4658 != 0L)
		IUnknown.Release(aLong4658);
	    int i_3_ = 8;
	    int i_4_;
	    if (aBool4663) {
		i_4_ = 0;
		i_3_ |= 0x200;
	    } else
		i_4_ = 1;
	    aLong4658
		= (IDirect3DDevice.CreateIndexBuffer
		   (aClass185_Sub1_Sub1_4659.aLong11541, anInt4661, i_3_,
		    aClass173_4662 == Class173.aClass173_1829 ? 101 : 102,
		    i_4_));
	    anInt4660 = anInt4661;
	}
    }
    
    void method6735() {
	if (aLong4658 != 0L) {
	    aClass185_Sub1_Sub1_4659.method18018(aLong4658);
	    aLong4658 = 0L;
	}
	anInt4660 = 0;
	anInt4661 = 0;
    }
    
    public void finalize() {
	method6735();
    }
    
    public void method143() {
	if (aLong4658 != 0L) {
	    IUnknown.Release(aLong4658);
	    aLong4658 = 0L;
	}
	anInt4660 = 0;
	anInt4661 = 0;
	aClass185_Sub1_Sub1_4659.method14582(this);
    }
    
    void method6736() {
	method6735();
    }
    
    public void method144() {
	if (aLong4658 != 0L) {
	    IUnknown.Release(aLong4658);
	    aLong4658 = 0L;
	}
	anInt4660 = 0;
	anInt4661 = 0;
	aClass185_Sub1_Sub1_4659.method14582(this);
    }
    
    public void method228() {
	IDirect3DIndexBuffer.Unlock(aLong4658);
    }
    
    Class414(Class185_Sub1_Sub1 class185_sub1_sub1, Class173 class173,
	     boolean bool) {
	aClass185_Sub1_Sub1_4659 = class185_sub1_sub1;
	aClass173_4662 = class173;
	aBool4663 = bool;
	aClass185_Sub1_Sub1_4659.method14617(this);
    }
    
    void method6737() {
	method6735();
    }
    
    public boolean method235(int i, int i_5_, long l) {
	return Class356.method6310(IDirect3DIndexBuffer.Upload(aLong4658, i,
							       i_5_,
							       (aBool4663
								? 8192 : 0),
							       l));
    }
    
    public int method145() {
	return anInt4661;
    }
    
    public int method9() {
	return anInt4661;
    }
    
    public boolean method231(int i, int i_6_, long l) {
	return Class356.method6310(IDirect3DIndexBuffer.Upload(aLong4658, i,
							       i_6_,
							       (aBool4663
								? 8192 : 0),
							       l));
    }
    
    public boolean method232(int i, int i_7_, long l) {
	return Class356.method6310(IDirect3DIndexBuffer.Upload(aLong4658, i,
							       i_7_,
							       (aBool4663
								? 8192 : 0),
							       l));
    }
    
    public boolean method233(int i, int i_8_, long l) {
	return Class356.method6310(IDirect3DIndexBuffer.Upload(aLong4658, i,
							       i_8_,
							       (aBool4663
								? 8192 : 0),
							       l));
    }
    
    public long method230(int i, int i_9_) {
	return IDirect3DIndexBuffer.Lock(aLong4658, i, i_9_,
					 aBool4663 ? 8192 : 0);
    }
    
    public void method141() {
	if (aLong4658 != 0L) {
	    IUnknown.Release(aLong4658);
	    aLong4658 = 0L;
	}
	anInt4660 = 0;
	anInt4661 = 0;
	aClass185_Sub1_Sub1_4659.method14582(this);
    }
    
    public void method226() {
	IDirect3DIndexBuffer.Unlock(aLong4658);
    }
    
    void method6738() {
	if (aLong4658 != 0L) {
	    aClass185_Sub1_Sub1_4659.method18018(aLong4658);
	    aLong4658 = 0L;
	}
	anInt4660 = 0;
	anInt4661 = 0;
    }
    
    public int method234() {
	return anInt4661;
    }
    
    public int method53() {
	return anInt4661;
    }
    
    void method6739() {
	if (aLong4658 != 0L) {
	    aClass185_Sub1_Sub1_4659.method18018(aLong4658);
	    aLong4658 = 0L;
	}
	anInt4660 = 0;
	anInt4661 = 0;
    }
}
