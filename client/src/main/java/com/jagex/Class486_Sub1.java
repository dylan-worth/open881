/* Class486_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class486_Sub1 extends Class486 implements Interface35
{
    int anInt10127;
    int anInt10128;
    int anInt10129;
    
    public void method141() {
	super.method142();
    }
    
    public void method333() {
	super.method333();
    }
    
    public void method142() {
	super.method142();
    }
    
    Class486_Sub1(Class185_Sub1_Sub2 class185_sub1_sub2, Class181 class181,
		  int i, int i_0_, int i_1_, boolean bool, byte[] is) {
	super(class185_sub1_sub2, 32879, class181, Class173.aClass173_1830,
	      i * i_0_ * i_1_, bool);
	anInt10129 = i;
	anInt10128 = i_0_;
	anInt10127 = i_1_;
	aClass185_Sub1_Sub2_5295.method14669(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glTexImage3Dub(anInt5303, 0,
			      Class185_Sub1_Sub2.method18075(aClass181_5292,
							     aClass173_5291),
			      anInt10129, anInt10128, anInt10127, 0,
			      Class185_Sub1_Sub2.method18097(aClass181_5292),
			      5121, is, 0);
	OpenGL.glPixelStorei(3317, 4);
	if (bool)
	    method270();
    }
    
    public void method335() {
	super.method333();
    }
    
    public void method339(Class372 class372) {
	super.method339(class372);
    }
    
    public void method144() {
	super.method142();
    }
    
    public void method334() {
	super.method333();
    }
    
    public void method332() {
	super.method333();
    }
    
    public void method336() {
	super.method333();
    }
    
    public void method143() {
	super.method142();
    }
    
    public void method338(Class372 class372) {
	super.method339(class372);
    }
    
    public void method337(Class372 class372) {
	super.method339(class372);
    }
}
