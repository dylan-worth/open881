/* Class175_Sub1_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jagdx.Class356;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class175_Sub1_Sub1_Sub1 extends Class175_Sub1_Sub1
{
    Interface51 anInterface51_12091 = null;
    static final int anInt12092 = 16;
    Interface53[] anInterface53Array12093 = new Interface53[4];
    Class185_Sub1_Sub1 aClass185_Sub1_Sub1_12094;
    int anInt12095;
    boolean aBool12096;
    int anInt12097;
    int anInt12098;
    
    public void method15086(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			    int i_4_, boolean bool, boolean bool_5_) {
	if (bool) {
	    long l = IDirect3DDevice.GetRenderTarget((aClass185_Sub1_Sub1_12094
						      .aLong11541),
						     0);
	    IDirect3DDevice.StretchRect(aClass185_Sub1_Sub1_12094.aLong11541,
					anInterface53Array12093[0].method365(),
					i, i_0_, i_1_, i_2_, l, i_3_, i_4_,
					i_1_, i_2_, 0);
	    IUnknown.Release(l);
	}
    }
    
    public int method2910() {
	return anInt12097;
    }
    
    public int method2911() {
	return anInt12098;
    }
    
    public void method15074(Interface21 interface21) {
	Interface51 interface51 = (Interface51) interface21;
	if (interface21 != null) {
	    if (anInt12095 != 0) {
		if (anInt12097 != interface51.method1()
		    || anInt12098 != interface51.method93())
		    throw new RuntimeException();
	    } else {
		anInt12098 = interface51.method93();
		anInt12097 = interface51.method1();
		method17909();
	    }
	    anInt12095 |= 0x10;
	    anInterface51_12091 = interface51;
	    if (aBool12096)
		method18716(interface51.method365());
	} else {
	    anInt12095 &= ~0x10;
	    anInterface51_12091 = null;
	    if (aBool12096)
		method18716(0L);
	    if (anInt12095 == 0) {
		anInt12098 = 0;
		anInt12097 = 0;
	    }
	}
    }
    
    public void method15075(int i, Interface22 interface22) {
	int i_6_ = 1 << i;
	Interface53 interface53 = (Interface53) interface22;
	if (interface22 != null) {
	    if (anInt12095 != 0) {
		if (anInt12097 != interface53.method1()
		    || anInt12098 != interface53.method93())
		    throw new RuntimeException();
	    } else {
		anInt12098 = interface53.method93();
		anInt12097 = interface53.method1();
		method17909();
	    }
	    anInt12095 |= i_6_;
	    anInterface53Array12093[i] = interface53;
	    if (aBool12096)
		method18715(i, interface53.method365());
	} else {
	    anInt12095 &= i_6_ ^ 0xffffffff;
	    anInterface53Array12093[i] = null;
	    if (aBool12096)
		method18715(i, 0L);
	    if (anInt12095 == 0) {
		anInt12098 = 0;
		anInt12097 = 0;
	    }
	}
    }
    
    boolean method18715(int i, long l) {
	return Class356.method6310(IDirect3DDevice.SetRenderTarget
				   (aClass185_Sub1_Sub1_12094.aLong11541, i,
				    l));
    }
    
    boolean method18716(long l) {
	return Class356.method6310(IDirect3DDevice.SetDepthStencilSurface
				   (aClass185_Sub1_Sub1_12094.aLong11541, l));
    }
    
    void method18717() {
	if (anInterface51_12091 != null)
	    anInterface51_12091.method366();
	for (int i = 0; i < anInterface53Array12093.length; i++) {
	    if (anInterface53Array12093[i] != null)
		anInterface53Array12093[i].method366();
	}
    }
    
    boolean method358() {
	for (int i = 0; i < 4; i++) {
	    Interface53 interface53 = anInterface53Array12093[i];
	    if (interface53 != null) {
		long l = interface53.method365();
		method18715(i, l);
	    }
	}
	if (anInterface51_12091 != null)
	    method18716(anInterface51_12091.method365());
	aBool12096 = true;
	return super.method358();
    }
    
    boolean method2912() {
	for (int i = 1; i < 4; i++) {
	    Interface53 interface53 = anInterface53Array12093[i];
	    if (interface53 != null)
		method18715(i, 0L);
	}
	if (anInterface51_12091 != null)
	    method18716(0L);
	aBool12096 = false;
	return true;
    }
    
    public void method15082(Interface21 interface21) {
	Interface51 interface51 = (Interface51) interface21;
	if (interface21 != null) {
	    if (anInt12095 != 0) {
		if (anInt12097 != interface51.method1()
		    || anInt12098 != interface51.method93())
		    throw new RuntimeException();
	    } else {
		anInt12098 = interface51.method93();
		anInt12097 = interface51.method1();
		method17909();
	    }
	    anInt12095 |= 0x10;
	    anInterface51_12091 = interface51;
	    if (aBool12096)
		method18716(interface51.method365());
	} else {
	    anInt12095 &= ~0x10;
	    anInterface51_12091 = null;
	    if (aBool12096)
		method18716(0L);
	    if (anInt12095 == 0) {
		anInt12098 = 0;
		anInt12097 = 0;
	    }
	}
    }
    
    public void method15073(Interface21 interface21) {
	Interface51 interface51 = (Interface51) interface21;
	if (interface21 != null) {
	    if (anInt12095 != 0) {
		if (anInt12097 != interface51.method1()
		    || anInt12098 != interface51.method93())
		    throw new RuntimeException();
	    } else {
		anInt12098 = interface51.method93();
		anInt12097 = interface51.method1();
		method17909();
	    }
	    anInt12095 |= 0x10;
	    anInterface51_12091 = interface51;
	    if (aBool12096)
		method18716(interface51.method365());
	} else {
	    anInt12095 &= ~0x10;
	    anInterface51_12091 = null;
	    if (aBool12096)
		method18716(0L);
	    if (anInt12095 == 0) {
		anInt12098 = 0;
		anInt12097 = 0;
	    }
	}
    }
    
    void method18718() {
	if (anInterface51_12091 != null)
	    anInterface51_12091.method366();
	for (int i = 0; i < anInterface53Array12093.length; i++) {
	    if (anInterface53Array12093[i] != null)
		anInterface53Array12093[i].method366();
	}
    }
    
    public void finalize() throws Throwable {
	method18718();
	super.finalize();
    }
    
    public int method2913() {
	return anInt12097;
    }
    
    public int method2914() {
	return anInt12098;
    }
    
    public void method15083(Interface21 interface21) {
	Interface51 interface51 = (Interface51) interface21;
	if (interface21 != null) {
	    if (anInt12095 != 0) {
		if (anInt12097 != interface51.method1()
		    || anInt12098 != interface51.method93())
		    throw new RuntimeException();
	    } else {
		anInt12098 = interface51.method93();
		anInt12097 = interface51.method1();
		method17909();
	    }
	    anInt12095 |= 0x10;
	    anInterface51_12091 = interface51;
	    if (aBool12096)
		method18716(interface51.method365());
	} else {
	    anInt12095 &= ~0x10;
	    anInterface51_12091 = null;
	    if (aBool12096)
		method18716(0L);
	    if (anInt12095 == 0) {
		anInt12098 = 0;
		anInt12097 = 0;
	    }
	}
    }
    
    public void method15078(int i, Interface22 interface22) {
	int i_7_ = 1 << i;
	Interface53 interface53 = (Interface53) interface22;
	if (interface22 != null) {
	    if (anInt12095 != 0) {
		if (anInt12097 != interface53.method1()
		    || anInt12098 != interface53.method93())
		    throw new RuntimeException();
	    } else {
		anInt12098 = interface53.method93();
		anInt12097 = interface53.method1();
		method17909();
	    }
	    anInt12095 |= i_7_;
	    anInterface53Array12093[i] = interface53;
	    if (aBool12096)
		method18715(i, interface53.method365());
	} else {
	    anInt12095 &= i_7_ ^ 0xffffffff;
	    anInterface53Array12093[i] = null;
	    if (aBool12096)
		method18715(i, 0L);
	    if (anInt12095 == 0) {
		anInt12098 = 0;
		anInt12097 = 0;
	    }
	}
    }
    
    public void method361() {
	if (anInterface51_12091 != null)
	    anInterface51_12091.method142();
	for (int i = 0; i < anInterface53Array12093.length; i++) {
	    if (anInterface53Array12093[i] != null)
		anInterface53Array12093[i].method142();
	}
    }
    
    public void method15080(int i, Interface22 interface22) {
	int i_8_ = 1 << i;
	Interface53 interface53 = (Interface53) interface22;
	if (interface22 != null) {
	    if (anInt12095 != 0) {
		if (anInt12097 != interface53.method1()
		    || anInt12098 != interface53.method93())
		    throw new RuntimeException();
	    } else {
		anInt12098 = interface53.method93();
		anInt12097 = interface53.method1();
		method17909();
	    }
	    anInt12095 |= i_8_;
	    anInterface53Array12093[i] = interface53;
	    if (aBool12096)
		method18715(i, interface53.method365());
	} else {
	    anInt12095 &= i_8_ ^ 0xffffffff;
	    anInterface53Array12093[i] = null;
	    if (aBool12096)
		method18715(i, 0L);
	    if (anInt12095 == 0) {
		anInt12098 = 0;
		anInt12097 = 0;
	    }
	}
    }
    
    public void method15081(Interface21 interface21) {
	Interface51 interface51 = (Interface51) interface21;
	if (interface21 != null) {
	    if (anInt12095 != 0) {
		if (anInt12097 != interface51.method1()
		    || anInt12098 != interface51.method93())
		    throw new RuntimeException();
	    } else {
		anInt12098 = interface51.method93();
		anInt12097 = interface51.method1();
		method17909();
	    }
	    anInt12095 |= 0x10;
	    anInterface51_12091 = interface51;
	    if (aBool12096)
		method18716(interface51.method365());
	} else {
	    anInt12095 &= ~0x10;
	    anInterface51_12091 = null;
	    if (aBool12096)
		method18716(0L);
	    if (anInt12095 == 0) {
		anInt12098 = 0;
		anInt12097 = 0;
	    }
	}
    }
    
    boolean method357() {
	for (int i = 0; i < 4; i++) {
	    Interface53 interface53 = anInterface53Array12093[i];
	    if (interface53 != null) {
		long l = interface53.method365();
		method18715(i, l);
	    }
	}
	if (anInterface51_12091 != null)
	    method18716(anInterface51_12091.method365());
	aBool12096 = true;
	return super.method358();
    }
    
    public void method142() {
	if (anInterface51_12091 != null)
	    anInterface51_12091.method142();
	for (int i = 0; i < anInterface53Array12093.length; i++) {
	    if (anInterface53Array12093[i] != null)
		anInterface53Array12093[i].method142();
	}
    }
    
    public void method15079(int i, Interface22 interface22) {
	int i_9_ = 1 << i;
	Interface53 interface53 = (Interface53) interface22;
	if (interface22 != null) {
	    if (anInt12095 != 0) {
		if (anInt12097 != interface53.method1()
		    || anInt12098 != interface53.method93())
		    throw new RuntimeException();
	    } else {
		anInt12098 = interface53.method93();
		anInt12097 = interface53.method1();
		method17909();
	    }
	    anInt12095 |= i_9_;
	    anInterface53Array12093[i] = interface53;
	    if (aBool12096)
		method18715(i, interface53.method365());
	} else {
	    anInt12095 &= i_9_ ^ 0xffffffff;
	    anInterface53Array12093[i] = null;
	    if (aBool12096)
		method18715(i, 0L);
	    if (anInt12095 == 0) {
		anInt12098 = 0;
		anInt12097 = 0;
	    }
	}
    }
    
    public boolean method15084() {
	return anInterface53Array12093[0] != null;
    }
    
    public boolean method15085() {
	return anInterface53Array12093[0] != null;
    }
    
    boolean method207() {
	for (int i = 0; i < 4; i++) {
	    Interface53 interface53 = anInterface53Array12093[i];
	    if (interface53 != null) {
		long l = interface53.method365();
		method18715(i, l);
	    }
	}
	if (anInterface51_12091 != null)
	    method18716(anInterface51_12091.method365());
	aBool12096 = true;
	return super.method358();
    }
    
    boolean method206() {
	for (int i = 0; i < 4; i++) {
	    Interface53 interface53 = anInterface53Array12093[i];
	    if (interface53 != null) {
		long l = interface53.method365();
		method18715(i, l);
	    }
	}
	if (anInterface51_12091 != null)
	    method18716(anInterface51_12091.method365());
	aBool12096 = true;
	return super.method358();
    }
    
    boolean method360() {
	for (int i = 0; i < 4; i++) {
	    Interface53 interface53 = anInterface53Array12093[i];
	    if (interface53 != null) {
		long l = interface53.method365();
		method18715(i, l);
	    }
	}
	if (anInterface51_12091 != null)
	    method18716(anInterface51_12091.method365());
	aBool12096 = true;
	return super.method358();
    }
    
    public int method2915() {
	return anInt12098;
    }
    
    boolean method2916() {
	for (int i = 1; i < 4; i++) {
	    Interface53 interface53 = anInterface53Array12093[i];
	    if (interface53 != null)
		method18715(i, 0L);
	}
	if (anInterface51_12091 != null)
	    method18716(0L);
	aBool12096 = false;
	return true;
    }
    
    void method18719() throws Throwable {
	method18718();
	super.finalize();
    }
    
    boolean method2918() {
	for (int i = 1; i < 4; i++) {
	    Interface53 interface53 = anInterface53Array12093[i];
	    if (interface53 != null)
		method18715(i, 0L);
	}
	if (anInterface51_12091 != null)
	    method18716(0L);
	aBool12096 = false;
	return true;
    }
    
    public void method15087(int i, int i_10_, int i_11_, int i_12_, int i_13_,
			    int i_14_, boolean bool, boolean bool_15_) {
	if (bool) {
	    long l = IDirect3DDevice.GetRenderTarget((aClass185_Sub1_Sub1_12094
						      .aLong11541),
						     0);
	    IDirect3DDevice.StretchRect(aClass185_Sub1_Sub1_12094.aLong11541,
					anInterface53Array12093[0].method365(),
					i, i_10_, i_11_, i_12_, l, i_13_,
					i_14_, i_11_, i_12_, 0);
	    IUnknown.Release(l);
	}
    }
    
    public void method362() {
	if (anInterface51_12091 != null)
	    anInterface51_12091.method142();
	for (int i = 0; i < anInterface53Array12093.length; i++) {
	    if (anInterface53Array12093[i] != null)
		anInterface53Array12093[i].method142();
	}
    }
    
    public void method364() {
	if (anInterface51_12091 != null)
	    anInterface51_12091.method142();
	for (int i = 0; i < anInterface53Array12093.length; i++) {
	    if (anInterface53Array12093[i] != null)
		anInterface53Array12093[i].method142();
	}
    }
    
    void method18720() throws Throwable {
	method18718();
	super.finalize();
    }
    
    public boolean method15076() {
	return anInterface53Array12093[0] != null;
    }
    
    void method18721() {
	if (anInterface51_12091 != null)
	    anInterface51_12091.method366();
	for (int i = 0; i < anInterface53Array12093.length; i++) {
	    if (anInterface53Array12093[i] != null)
		anInterface53Array12093[i].method366();
	}
    }
    
    void method18722() throws Throwable {
	method18718();
	super.finalize();
    }
    
    public void method15077(int i, int i_16_, int i_17_, int i_18_, int i_19_,
			    int i_20_, boolean bool, boolean bool_21_) {
	if (bool) {
	    long l = IDirect3DDevice.GetRenderTarget((aClass185_Sub1_Sub1_12094
						      .aLong11541),
						     0);
	    IDirect3DDevice.StretchRect(aClass185_Sub1_Sub1_12094.aLong11541,
					anInterface53Array12093[0].method365(),
					i, i_16_, i_17_, i_18_, l, i_19_,
					i_20_, i_17_, i_18_, 0);
	    IUnknown.Release(l);
	}
    }
    
    boolean method18723(int i, long l) {
	return Class356.method6310(IDirect3DDevice.SetRenderTarget
				   (aClass185_Sub1_Sub1_12094.aLong11541, i,
				    l));
    }
    
    boolean method18724(int i, long l) {
	return Class356.method6310(IDirect3DDevice.SetRenderTarget
				   (aClass185_Sub1_Sub1_12094.aLong11541, i,
				    l));
    }
    
    boolean method18725(int i, long l) {
	return Class356.method6310(IDirect3DDevice.SetRenderTarget
				   (aClass185_Sub1_Sub1_12094.aLong11541, i,
				    l));
    }
    
    boolean method18726(int i, long l) {
	return Class356.method6310(IDirect3DDevice.SetRenderTarget
				   (aClass185_Sub1_Sub1_12094.aLong11541, i,
				    l));
    }
    
    boolean method2917() {
	for (int i = 1; i < 4; i++) {
	    Interface53 interface53 = anInterface53Array12093[i];
	    if (interface53 != null)
		method18715(i, 0L);
	}
	if (anInterface51_12091 != null)
	    method18716(0L);
	aBool12096 = false;
	return true;
    }
    
    Class175_Sub1_Sub1_Sub1(Class185_Sub1_Sub1 class185_sub1_sub1) {
	super((Class185_Sub1) class185_sub1_sub1);
	aClass185_Sub1_Sub1_12094 = class185_sub1_sub1;
    }
}
