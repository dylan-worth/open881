/* Class420_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;

import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;

public class Class420_Sub3 extends Class420 implements Interface41
{
    int anInt10286;
    
    public void method332() {
	aClass185_Sub1_Sub1_4709.method18007(this);
    }
    
    public void method144() {
	super.method142();
    }
    
    public void method141() {
	super.method142();
    }
    
    public void method339(Class372 class372) {
	super.method339(class372);
    }
    
    public void method143() {
	super.method142();
    }
    
    Class420_Sub3(Class185_Sub1_Sub1 class185_sub1_sub1, int i, boolean bool,
		  int[][] is) {
	super(class185_sub1_sub1, Class181.aClass181_1952,
	      Class173.aClass173_1830, bool && class185_sub1_sub1.aBool11528,
	      i * i * 6);
	anInt10286 = i;
	if (aBool4708)
	    aLong4705
		= IDirect3DDevice.CreateCubeTexture((aClass185_Sub1_Sub1_4709
						     .aLong11541),
						    anInt10286, 0, 1024, 21,
						    1);
	else
	    aLong4705
		= IDirect3DDevice.CreateCubeTexture((aClass185_Sub1_Sub1_4709
						     .aLong11541),
						    anInt10286, 1, 0, 21, 1);
	ByteBuffer bytebuffer = aClass185_Sub1_Sub1_4709.aByteBuffer9266;
	aClass185_Sub1_Sub1_4709.method14586(anInt10286 * anInt10286 * 4);
	for (int i_0_ = 0; i_0_ < 6; i_0_++) {
	    bytebuffer.clear();
	    bytebuffer.asIntBuffer().put(is[i_0_]);
	    IDirect3DCubeTexture.Upload(aLong4705, i_0_, 0, 0, 0, anInt10286,
					anInt10286, anInt10286 * 4, 0,
					aClass185_Sub1_Sub1_4709.aLong9139);
	}
    }
    
    public void method333() {
	aClass185_Sub1_Sub1_4709.method18007(this);
    }
    
    public void method335() {
	aClass185_Sub1_Sub1_4709.method18007(this);
    }
    
    public void method337(Class372 class372) {
	super.method339(class372);
    }
    
    public void method336() {
	aClass185_Sub1_Sub1_4709.method18007(this);
    }
    
    public void method334() {
	aClass185_Sub1_Sub1_4709.method18007(this);
    }
    
    public void method338(Class372 class372) {
	super.method339(class372);
    }
    
    public void method142() {
	super.method142();
    }
}
