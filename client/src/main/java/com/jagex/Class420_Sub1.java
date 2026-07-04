/* Class420_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;

public class Class420_Sub1 extends Class420 implements Interface35
{
    int anInt10242;
    int anInt10243;
    int anInt10244;
    
    public void method336() {
	aClass185_Sub1_Sub1_4709.method18008(this);
    }
    
    long method6771() {
	return aLong4705;
    }
    
    public void method143() {
	super.method142();
    }
    
    public void method339(Class372 class372) {
	super.method339(class372);
    }
    
    public void method142() {
	super.method142();
    }
    
    public void method333() {
	aClass185_Sub1_Sub1_4709.method18008(this);
    }
    
    public void method141() {
	super.method142();
    }
    
    public void method144() {
	super.method142();
    }
    
    public void method335() {
	aClass185_Sub1_Sub1_4709.method18008(this);
    }
    
    public void method332() {
	aClass185_Sub1_Sub1_4709.method18008(this);
    }
    
    Class420_Sub1(Class185_Sub1_Sub1 class185_sub1_sub1, Class181 class181,
		  int i, int i_0_, int i_1_, boolean bool, byte[] is) {
	super(class185_sub1_sub1, class181, Class173.aClass173_1830, false,
	      i * i_0_ * i_1_);
	anInt10243 = i;
	anInt10242 = i_0_;
	anInt10244 = i_1_;
	aLong4705
	    = (IDirect3DDevice.CreateVolumeTexture
	       (aClass185_Sub1_Sub1_4709.aLong11541, i, i_0_, i_1_, 1, 0,
		Class185_Sub1_Sub1.method18014(class181, aClass173_4707), 1));
	aClass185_Sub1_Sub1_4709.method14586(anInt10243 * anInt10242
					     * (class181.anInt1962
						* 1676120375));
	ByteBuffer bytebuffer = aClass185_Sub1_Sub1_4709.aByteBuffer9266;
	bytebuffer.clear();
	bytebuffer.put(is);
	IDirect3DVolumeTexture.Upload(aLong4705, 0, 0, 0, 0, anInt10243,
				      anInt10242, anInt10244,
				      anInt10243 * (class181.anInt1962
						    * 1676120375),
				      0, aClass185_Sub1_Sub1_4709.aLong9139);
    }
    
    public void method334() {
	aClass185_Sub1_Sub1_4709.method18008(this);
    }
    
    public void method337(Class372 class372) {
	super.method339(class372);
    }
    
    public void method338(Class372 class372) {
	super.method339(class372);
    }
    
    long method6773() {
	return aLong4705;
    }
}
