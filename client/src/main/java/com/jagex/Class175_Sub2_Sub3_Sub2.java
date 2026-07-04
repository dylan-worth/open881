/* Class175_Sub2_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;
import java.awt.Dimension;

import jaggl.OpenGL;

public class Class175_Sub2_Sub3_Sub2 extends Class175_Sub2_Sub3
{
    boolean aBool12100 = false;
    OpenGL anOpenGL12101;
    long aLong12102;
    int anInt12103;
    int anInt12104;
    Canvas aCanvas12105;
    
    boolean method2917() {
	return true;
    }
    
    boolean method2912() {
	return true;
    }
    
    public int method2910() {
	return anInt12103;
    }
    
    public int method2911() {
	return anInt12104;
    }
    
    void method15477(int i, int i_0_) {
	if (aLong12102 == 0L)
	    throw new IllegalStateException("");
	anOpenGL12101.surfaceResized(aLong12102);
	method18727();
	super.method15477(i, i_0_);
    }
    
    void method18727() {
	Dimension dimension = aCanvas12105.getSize();
	anInt12104 = dimension.height;
	anInt12103 = dimension.width;
    }
    
    public int method15475() {
	if (aLong12102 == 0L)
	    throw new IllegalStateException("");
	anOpenGL12101.swapBuffers(aLong12102);
	return 0;
    }
    
    boolean method207() {
	if (aLong12102 == 0L)
	    throw new IllegalStateException("");
	boolean bool = true;
	if (!aBool12100) {
	    bool = anOpenGL12101.setSurface(aLong12102);
	    aBool12100 = true;
	}
	return bool && super.method358();
    }
    
    boolean method358() {
	if (aLong12102 == 0L)
	    throw new IllegalStateException("");
	boolean bool = true;
	if (!aBool12100) {
	    bool = anOpenGL12101.setSurface(aLong12102);
	    aBool12100 = true;
	}
	return bool && super.method358();
    }
    
    public int method2913() {
	return anInt12103;
    }
    
    public void method142() {
	if (aLong12102 != 0L) {
	    anOpenGL12101.releaseSurface(aCanvas12105, aLong12102);
	    aLong12102 = 0L;
	}
    }
    
    boolean method206() {
	if (aLong12102 == 0L)
	    throw new IllegalStateException("");
	boolean bool = true;
	if (!aBool12100) {
	    bool = anOpenGL12101.setSurface(aLong12102);
	    aBool12100 = true;
	}
	return bool && super.method358();
    }
    
    public int method2914() {
	return anInt12104;
    }
    
    boolean method357() {
	if (aLong12102 == 0L)
	    throw new IllegalStateException("");
	boolean bool = true;
	if (!aBool12100) {
	    bool = anOpenGL12101.setSurface(aLong12102);
	    aBool12100 = true;
	}
	return bool && super.method358();
    }
    
    void method18728() {
	Dimension dimension = aCanvas12105.getSize();
	anInt12104 = dimension.height;
	anInt12103 = dimension.width;
    }
    
    public int method2915() {
	return anInt12104;
    }
    
    boolean method360() {
	if (aLong12102 == 0L)
	    throw new IllegalStateException("");
	boolean bool = true;
	if (!aBool12100) {
	    bool = anOpenGL12101.setSurface(aLong12102);
	    aBool12100 = true;
	}
	return bool && super.method358();
    }
    
    public int method15479() {
	if (aLong12102 == 0L)
	    throw new IllegalStateException("");
	anOpenGL12101.swapBuffers(aLong12102);
	return 0;
    }
    
    boolean method2916() {
	return true;
    }
    
    public void method362() {
	if (aLong12102 != 0L) {
	    anOpenGL12101.releaseSurface(aCanvas12105, aLong12102);
	    aLong12102 = 0L;
	}
    }
    
    boolean method2918() {
	return true;
    }
    
    public void method361() {
	if (aLong12102 != 0L) {
	    anOpenGL12101.releaseSurface(aCanvas12105, aLong12102);
	    aLong12102 = 0L;
	}
    }
    
    public int method15474() {
	if (aLong12102 == 0L)
	    throw new IllegalStateException("");
	anOpenGL12101.swapBuffers(aLong12102);
	return 0;
    }
    
    public void method364() {
	if (aLong12102 != 0L) {
	    anOpenGL12101.releaseSurface(aCanvas12105, aLong12102);
	    aLong12102 = 0L;
	}
    }
    
    public int method15480(int i, int i_1_) {
	return 0;
    }
    
    Class175_Sub2_Sub3_Sub2(Class185_Sub1_Sub2 class185_sub1_sub2,
			    Canvas canvas) {
	this(class185_sub1_sub2, canvas,
	     class185_sub1_sub2.anOpenGL11608.prepareSurface(canvas));
    }
    
    Class175_Sub2_Sub3_Sub2(Class185_Sub1_Sub2 class185_sub1_sub2,
			    Canvas canvas, long l) {
	super(class185_sub1_sub2);
	aCanvas12105 = canvas;
	anOpenGL12101 = class185_sub1_sub2.anOpenGL11608;
	aLong12102 = l;
	method18727();
    }
    
    public int method15482() {
	if (aLong12102 == 0L)
	    throw new IllegalStateException("");
	anOpenGL12101.swapBuffers(aLong12102);
	return 0;
    }
    
    public int method15481() {
	if (aLong12102 == 0L)
	    throw new IllegalStateException("");
	anOpenGL12101.swapBuffers(aLong12102);
	return 0;
    }
    
    public int method15476(int i, int i_2_) {
	return 0;
    }
    
    void method18729() {
	Dimension dimension = aCanvas12105.getSize();
	anInt12104 = dimension.height;
	anInt12103 = dimension.width;
    }
    
    void method18730() {
	Dimension dimension = aCanvas12105.getSize();
	anInt12104 = dimension.height;
	anInt12103 = dimension.width;
    }
    
    void method15478(int i, int i_3_) {
	if (aLong12102 == 0L)
	    throw new IllegalStateException("");
	anOpenGL12101.surfaceResized(aLong12102);
	method18727();
	super.method15477(i, i_3_);
    }
}
