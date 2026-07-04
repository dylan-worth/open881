/* Class175_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;
import java.awt.Dimension;

import jaggl.OpenGL;

public class Class175_Sub2_Sub2 extends Class175_Sub2
{
    boolean aBool11416;
    Class185_Sub3 aClass185_Sub3_11417;
    OpenGL anOpenGL11418;
    long aLong11419;
    int anInt11420;
    int anInt11421;
    Canvas aCanvas11422;
    boolean aBool11423 = false;
    
    Class175_Sub2_Sub2(Class185_Sub3 class185_sub3, Canvas canvas) {
	this(class185_sub3, canvas,
	     class185_sub3.anOpenGL9559.prepareSurface(canvas));
    }
    
    Class175_Sub2_Sub2(Class185_Sub3 class185_sub3, Canvas canvas, long l) {
	aBool11416 = false;
	aClass185_Sub3_11417 = class185_sub3;
	aCanvas11422 = canvas;
	anOpenGL11418 = class185_sub3.anOpenGL9559;
	aLong11419 = l;
	method17956();
    }
    
    public int method2910() {
	return anInt11420;
    }
    
    void method15477(int i, int i_0_) {
	if (aBool11423)
	    throw new IllegalStateException();
	anOpenGL11418.surfaceResized(aLong11419);
	method17956();
	if (this == aClass185_Sub3_11417.method3253(-1477260291))
	    aClass185_Sub3_11417.method15422();
    }
    
    public void method142() {
	if (aBool11423)
	    throw new IllegalStateException();
	anOpenGL11418.releaseSurface(aCanvas11422, aLong11419);
	aBool11423 = true;
	aBool11416 = false;
    }
    
    void method17956() {
	Dimension dimension = aCanvas11422.getSize();
	anInt11421 = dimension.height;
	anInt11420 = dimension.width;
    }
    
    public int method15475() {
	if (aBool11423)
	    throw new IllegalStateException();
	anOpenGL11418.swapBuffers(aLong11419);
	return 0;
    }
    
    boolean method358() {
	if (aBool11423)
	    throw new IllegalStateException();
	if (!aBool11416) {
	    anOpenGL11418.setSurface(aLong11419);
	    aBool11416 = true;
	}
	aClass185_Sub3_11417.method15209();
	return true;
    }
    
    public int method15476(int i, int i_1_) {
	return 0;
    }
    
    boolean method2912() {
	return true;
    }
    
    public void method361() {
	if (aBool11423)
	    throw new IllegalStateException();
	anOpenGL11418.releaseSurface(aCanvas11422, aLong11419);
	aBool11423 = true;
	aBool11416 = false;
    }
    
    boolean method207() {
	if (aBool11423)
	    throw new IllegalStateException();
	if (!aBool11416) {
	    anOpenGL11418.setSurface(aLong11419);
	    aBool11416 = true;
	}
	aClass185_Sub3_11417.method15209();
	return true;
    }
    
    public int method2914() {
	return anInt11421;
    }
    
    public int method2915() {
	return anInt11421;
    }
    
    public int method2913() {
	return anInt11420;
    }
    
    public int method15481() {
	if (aBool11423)
	    throw new IllegalStateException();
	anOpenGL11418.swapBuffers(aLong11419);
	return 0;
    }
    
    boolean method360() {
	if (aBool11423)
	    throw new IllegalStateException();
	if (!aBool11416) {
	    anOpenGL11418.setSurface(aLong11419);
	    aBool11416 = true;
	}
	aClass185_Sub3_11417.method15209();
	return true;
    }
    
    boolean method357() {
	if (aBool11423)
	    throw new IllegalStateException();
	if (!aBool11416) {
	    anOpenGL11418.setSurface(aLong11419);
	    aBool11416 = true;
	}
	aClass185_Sub3_11417.method15209();
	return true;
    }
    
    public int method15482() {
	if (aBool11423)
	    throw new IllegalStateException();
	anOpenGL11418.swapBuffers(aLong11419);
	return 0;
    }
    
    boolean method2917() {
	return true;
    }
    
    boolean method2918() {
	return true;
    }
    
    public int method2911() {
	return anInt11421;
    }
    
    public void method362() {
	if (aBool11423)
	    throw new IllegalStateException();
	anOpenGL11418.releaseSurface(aCanvas11422, aLong11419);
	aBool11423 = true;
	aBool11416 = false;
    }
    
    public void method364() {
	if (aBool11423)
	    throw new IllegalStateException();
	anOpenGL11418.releaseSurface(aCanvas11422, aLong11419);
	aBool11423 = true;
	aBool11416 = false;
    }
    
    void method15478(int i, int i_2_) {
	if (aBool11423)
	    throw new IllegalStateException();
	anOpenGL11418.surfaceResized(aLong11419);
	method17956();
	if (this == aClass185_Sub3_11417.method3253(-87287962))
	    aClass185_Sub3_11417.method15422();
    }
    
    public int method15479() {
	if (aBool11423)
	    throw new IllegalStateException();
	anOpenGL11418.swapBuffers(aLong11419);
	return 0;
    }
    
    public int method15474() {
	if (aBool11423)
	    throw new IllegalStateException();
	anOpenGL11418.swapBuffers(aLong11419);
	return 0;
    }
    
    boolean method2916() {
	return true;
    }
    
    boolean method206() {
	if (aBool11423)
	    throw new IllegalStateException();
	if (!aBool11416) {
	    anOpenGL11418.setSurface(aLong11419);
	    aBool11416 = true;
	}
	aClass185_Sub3_11417.method15209();
	return true;
    }
    
    public int method15480(int i, int i_3_) {
	return 0;
    }
    
    void method17957() {
	Dimension dimension = aCanvas11422.getSize();
	anInt11421 = dimension.height;
	anInt11420 = dimension.width;
    }
    
    void method17958() {
	Dimension dimension = aCanvas11422.getSize();
	anInt11421 = dimension.height;
	anInt11420 = dimension.width;
    }
    
    void method17959() {
	Dimension dimension = aCanvas11422.getSize();
	anInt11421 = dimension.height;
	anInt11420 = dimension.width;
    }
}
