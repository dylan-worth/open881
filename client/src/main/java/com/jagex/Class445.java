/* Class445 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class445 implements Interface53
{
    int anInt4887;
    Class173 aClass173_4888;
    Class181 aClass181_4889;
    Class185_Sub1_Sub1 aClass185_Sub1_Sub1_4890;
    int anInt4891;
    long aLong4892;
    
    public int method88() {
	return anInt4887;
    }
    
    public int method1() {
	return anInt4891;
    }
    
    public void method359() {
	if (aLong4892 != 0L) {
	    aClass185_Sub1_Sub1_4890.method18018(aLong4892);
	    aLong4892 = 0L;
	}
    }
    
    public long method365() {
	return aLong4892;
    }
    
    public void method142() {
	if (aLong4892 != 0L) {
	    IUnknown.Release(aLong4892);
	    aLong4892 = 0L;
	}
	aClass185_Sub1_Sub1_4890.method14582(this);
    }
    
    public void method366() {
	if (aLong4892 != 0L) {
	    aClass185_Sub1_Sub1_4890.method18018(aLong4892);
	    aLong4892 = 0L;
	}
    }
    
    public void finalize() {
	method366();
    }
    
    public int method22() {
	return anInt4891;
    }
    
    public int method53() {
	return anInt4891;
    }
    
    public int method85() {
	return anInt4887;
    }
    
    void method7232() {
	method366();
    }
    
    public int method8() {
	return anInt4887;
    }
    
    public void method141() {
	if (aLong4892 != 0L) {
	    IUnknown.Release(aLong4892);
	    aLong4892 = 0L;
	}
	aClass185_Sub1_Sub1_4890.method14582(this);
    }
    
    public int method145() {
	return anInt4887;
    }
    
    public void method143() {
	if (aLong4892 != 0L) {
	    IUnknown.Release(aLong4892);
	    aLong4892 = 0L;
	}
	aClass185_Sub1_Sub1_4890.method14582(this);
    }
    
    public long method367() {
	return aLong4892;
    }
    
    public void method144() {
	if (aLong4892 != 0L) {
	    IUnknown.Release(aLong4892);
	    aLong4892 = 0L;
	}
	aClass185_Sub1_Sub1_4890.method14582(this);
    }
    
    void method7233() {
	method366();
    }
    
    void method7234() {
	method366();
    }
    
    Class445(Class185_Sub1_Sub1 class185_sub1_sub1, Class181 class181,
	     Class173 class173, int i, int i_0_, int i_1_) {
	aClass185_Sub1_Sub1_4890 = class185_sub1_sub1;
	anInt4891 = i;
	anInt4887 = i_0_;
	aClass181_4889 = class181;
	aClass173_4888 = class173;
	aLong4892
	    = (IDirect3DDevice.CreateRenderTarget
	       (aClass185_Sub1_Sub1_4890.aLong11541, i, i_0_,
		Class185_Sub1_Sub1.method18014(aClass181_4889, aClass173_4888),
		0 + i_1_, 0, false));
	aClass185_Sub1_Sub1_4890.method14617(this);
    }
    
    public int method9() {
	return anInt4887;
    }
    
    public long method368() {
	return aLong4892;
    }
    
    public int method93() {
	return anInt4887;
    }
    
    public void method229() {
	if (aLong4892 != 0L) {
	    aClass185_Sub1_Sub1_4890.method18018(aLong4892);
	    aLong4892 = 0L;
	}
    }
    
    public long method369() {
	return aLong4892;
    }
    
    public void method226() {
	if (aLong4892 != 0L) {
	    aClass185_Sub1_Sub1_4890.method18018(aLong4892);
	    aLong4892 = 0L;
	}
    }
    
    public void method363() {
	if (aLong4892 != 0L) {
	    aClass185_Sub1_Sub1_4890.method18018(aLong4892);
	    aLong4892 = 0L;
	}
    }
}
