/* Class426 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class426 implements Interface51
{
    int anInt4794;
    Class173 aClass173_4795;
    Class185_Sub1_Sub1 aClass185_Sub1_Sub1_4796;
    int anInt4797;
    long aLong4798;
    
    public int method1() {
	return anInt4794;
    }
    
    void method6796() {
	method366();
    }
    
    public int method22() {
	return anInt4794;
    }
    
    public long method365() {
	return aLong4798;
    }
    
    public void method142() {
	if (aLong4798 != 0L) {
	    IUnknown.Release(aLong4798);
	    aLong4798 = 0L;
	}
	aClass185_Sub1_Sub1_4796.method14582(this);
    }
    
    public void method366() {
	if (aLong4798 != 0L) {
	    aClass185_Sub1_Sub1_4796.method18018(aLong4798);
	    aLong4798 = 0L;
	}
    }
    
    public int method93() {
	return anInt4797;
    }
    
    public void method144() {
	if (aLong4798 != 0L) {
	    IUnknown.Release(aLong4798);
	    aLong4798 = 0L;
	}
	aClass185_Sub1_Sub1_4796.method14582(this);
    }
    
    public int method53() {
	return anInt4794;
    }
    
    public int method85() {
	return anInt4797;
    }
    
    public int method88() {
	return anInt4797;
    }
    
    public int method8() {
	return anInt4797;
    }
    
    public int method9() {
	return anInt4797;
    }
    
    public int method145() {
	return anInt4797;
    }
    
    public void method143() {
	if (aLong4798 != 0L) {
	    IUnknown.Release(aLong4798);
	    aLong4798 = 0L;
	}
	aClass185_Sub1_Sub1_4796.method14582(this);
    }
    
    public void method141() {
	if (aLong4798 != 0L) {
	    IUnknown.Release(aLong4798);
	    aLong4798 = 0L;
	}
	aClass185_Sub1_Sub1_4796.method14582(this);
    }
    
    public void method363() {
	if (aLong4798 != 0L) {
	    aClass185_Sub1_Sub1_4796.method18018(aLong4798);
	    aLong4798 = 0L;
	}
    }
    
    void method6797() {
	method366();
    }
    
    public long method369() {
	return aLong4798;
    }
    
    void method6798() {
	method366();
    }
    
    public long method368() {
	return aLong4798;
    }
    
    Class426(Class185_Sub1_Sub1 class185_sub1_sub1, Class173 class173, int i,
	     int i_0_, int i_1_) {
	aClass185_Sub1_Sub1_4796 = class185_sub1_sub1;
	anInt4794 = i;
	anInt4797 = i_0_;
	aClass173_4795 = class173;
	aLong4798 = (IDirect3DDevice.CreateDepthStencilSurface
		     (aClass185_Sub1_Sub1_4796.aLong11541, i, i_0_,
		      Class185_Sub1_Sub1.method18015(aClass173_4795), 0 + i_1_,
		      0, false));
	aClass185_Sub1_Sub1_4796.method14617(this);
    }
    
    public long method367() {
	return aLong4798;
    }
    
    public void method229() {
	if (aLong4798 != 0L) {
	    aClass185_Sub1_Sub1_4796.method18018(aLong4798);
	    aLong4798 = 0L;
	}
    }
    
    public void method226() {
	if (aLong4798 != 0L) {
	    aClass185_Sub1_Sub1_4796.method18018(aLong4798);
	    aLong4798 = 0L;
	}
    }
    
    public void method359() {
	if (aLong4798 != 0L) {
	    aClass185_Sub1_Sub1_4796.method18018(aLong4798);
	    aLong4798 = 0L;
	}
    }
    
    public void finalize() {
	method366();
    }
}
