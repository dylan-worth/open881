/* Class490 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class490 implements Interface57
{
    int anInt5314;
    Class486_Sub3 aClass486_Sub3_5315;
    
    public void method143() {
	/* empty */
    }
    
    public int method1() {
	return aClass486_Sub3_5315.method1();
    }
    
    Class490(Class486_Sub3 class486_sub3, int i) {
	anInt5314 = i;
	aClass486_Sub3_5315 = class486_sub3;
    }
    
    public void method65(int i) {
	OpenGL.glFramebufferTexture2DEXT(36160, i,
					 aClass486_Sub3_5315.anInt5303,
					 aClass486_Sub3_5315.anInt5296,
					 anInt5314);
    }
    
    public int method8() {
	return aClass486_Sub3_5315.method93();
    }
    
    public int method22() {
	return aClass486_Sub3_5315.method1();
    }
    
    public int method53() {
	return aClass486_Sub3_5315.method1();
    }
    
    public int method85() {
	return aClass486_Sub3_5315.method93();
    }
    
    public int method88() {
	return aClass486_Sub3_5315.method93();
    }
    
    public void method142() {
	/* empty */
    }
    
    public int method9() {
	return aClass486_Sub3_5315.method93();
    }
    
    public int method145() {
	return aClass486_Sub3_5315.method93();
    }
    
    public void method141() {
	/* empty */
    }
    
    public int method93() {
	return aClass486_Sub3_5315.method93();
    }
    
    public void method144() {
	/* empty */
    }
    
    public void method106(int i) {
	OpenGL.glFramebufferTexture2DEXT(36160, i,
					 aClass486_Sub3_5315.anInt5303,
					 aClass486_Sub3_5315.anInt5296,
					 anInt5314);
    }
}
