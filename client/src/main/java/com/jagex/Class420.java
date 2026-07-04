/* Class420 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jagdx.IUnknown;

public abstract class Class420 implements Interface36
{
    long aLong4705 = 0L;
    Class181 aClass181_4706;
    Class173 aClass173_4707;
    boolean aBool4708;
    Class185_Sub1_Sub1 aClass185_Sub1_Sub1_4709;
    
    public void finalize() {
	method6778();
    }
    
    long method6771() {
	return aLong4705;
    }
    
    void method6772() {
	if (aLong4705 != 0L) {
	    aClass185_Sub1_Sub1_4709.method18018(aLong4705);
	    aLong4705 = 0L;
	}
    }
    
    public void method142() {
	if (aLong4705 != 0L) {
	    IUnknown.Release(aLong4705);
	    aLong4705 = 0L;
	}
	aClass185_Sub1_Sub1_4709.method14582(this);
    }
    
    long method6773() {
	return aLong4705;
    }
    
    Class420(Class185_Sub1_Sub1 class185_sub1_sub1, Class181 class181,
	     Class173 class173, boolean bool, int i) {
	aClass185_Sub1_Sub1_4709 = class185_sub1_sub1;
	aClass181_4706 = class181;
	aClass173_4707 = class173;
	aBool4708 = bool;
	aClass185_Sub1_Sub1_4709.method14617(this);
    }
    
    public void method143() {
	if (aLong4705 != 0L) {
	    IUnknown.Release(aLong4705);
	    aLong4705 = 0L;
	}
	aClass185_Sub1_Sub1_4709.method14582(this);
    }
    
    public void method141() {
	if (aLong4705 != 0L) {
	    IUnknown.Release(aLong4705);
	    aLong4705 = 0L;
	}
	aClass185_Sub1_Sub1_4709.method14582(this);
    }
    
    public void method144() {
	if (aLong4705 != 0L) {
	    IUnknown.Release(aLong4705);
	    aLong4705 = 0L;
	}
	aClass185_Sub1_Sub1_4709.method14582(this);
    }
    
    void method6774() {
	method6778();
    }
    
    void method6775() {
	if (aLong4705 != 0L) {
	    aClass185_Sub1_Sub1_4709.method18018(aLong4705);
	    aLong4705 = 0L;
	}
    }
    
    void method6776() {
	method6778();
    }
    
    public void method338(Class372 class372) {
	/* empty */
    }
    
    public void method337(Class372 class372) {
	/* empty */
    }
    
    public void method339(Class372 class372) {
	/* empty */
    }
    
    void method6777() {
	method6778();
    }
    
    void method6778() {
	if (aLong4705 != 0L) {
	    aClass185_Sub1_Sub1_4709.method18018(aLong4705);
	    aLong4705 = 0L;
	}
    }
    
    void method6779() {
	if (aLong4705 != 0L) {
	    aClass185_Sub1_Sub1_4709.method18018(aLong4705);
	    aLong4705 = 0L;
	}
    }
}
