/* Class534_Sub18_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class534_Sub18_Sub1 extends Class534_Sub18 implements Interface17
{
    int anInt11360;
    Class185_Sub3 aClass185_Sub3_11361;
    int anInt11362;
    int anInt11363;
    Class173 aClass173_11364;
    Class181 aClass181_11365;
    static int[] anIntArray11366 = new int[1];
    int anInt11367;
    
    Class534_Sub18_Sub1(Class185_Sub3 class185_sub3, Class181 class181,
			Class173 class173, int i, int i_0_, int i_1_) {
	aClass185_Sub3_11361 = class185_sub3;
	anInt11362 = i;
	anInt11363 = i_0_;
	aClass181_11365 = class181;
	aClass173_11364 = class173;
	OpenGL.glGenRenderbuffersEXT(1, anIntArray11366, 0);
	anInt11367 = anIntArray11366[0];
	OpenGL.glBindRenderbufferEXT(36161, anInt11367);
	OpenGL.glRenderbufferStorageMultisampleEXT
	    (36161, i_1_,
	     Class185_Sub3.method15257(aClass181_11365, aClass173_11364),
	     anInt11362, anInt11363);
	anInt11360 = (anInt11362 * anInt11363
		      * (aClass181_11365.anInt1962 * 1676120375)
		      * (aClass173_11364.anInt1825 * 1899960707));
    }
    
    public void method144() {
	if (anInt11367 != 0) {
	    int[] is = new int[1];
	    is[0] = anInt11367;
	    OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
	    anInt11367 = 0;
	}
    }
    
    public void method143() {
	if (anInt11367 != 0) {
	    int[] is = new int[1];
	    is[0] = anInt11367;
	    OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
	    anInt11367 = 0;
	}
    }
    
    public int method93() {
	return anInt11363;
    }
    
    public void method65(int i) {
	OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt11367);
    }
    
    public void method142() {
	if (anInt11367 != 0) {
	    int[] is = new int[1];
	    is[0] = anInt11367;
	    OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
	    anInt11367 = 0;
	}
    }
    
    void method17838() {
	if (anInt11367 != 0) {
	    aClass185_Sub3_11361.method15406(anInt11367, anInt11360);
	    anInt11367 = 0;
	}
    }
    
    public void finalize() throws Throwable {
	method17838();
	super.finalize();
    }
    
    Class534_Sub18_Sub1(Class185_Sub3 class185_sub3, Class181 class181,
			Class173 class173, int i, int i_2_) {
	aClass185_Sub3_11361 = class185_sub3;
	anInt11362 = i;
	anInt11363 = i_2_;
	aClass181_11365 = class181;
	aClass173_11364 = class173;
	OpenGL.glGenRenderbuffersEXT(1, anIntArray11366, 0);
	anInt11367 = anIntArray11366[0];
	OpenGL.glBindRenderbufferEXT(36161, anInt11367);
	OpenGL.glRenderbufferStorageEXT
	    (36161,
	     Class185_Sub3.method15257(aClass181_11365, aClass173_11364),
	     anInt11362, anInt11363);
	anInt11360 = (anInt11362 * anInt11363
		      * (aClass181_11365.anInt1962 * 1676120375)
		      * (aClass173_11364.anInt1825 * 1899960707));
    }
    
    public int method22() {
	return anInt11362;
    }
    
    public int method85() {
	return anInt11363;
    }
    
    public int method88() {
	return anInt11363;
    }
    
    public int method8() {
	return anInt11363;
    }
    
    public int method9() {
	return anInt11363;
    }
    
    public int method145() {
	return anInt11363;
    }
    
    public int method1() {
	return anInt11362;
    }
    
    public void method141() {
	if (anInt11367 != 0) {
	    int[] is = new int[1];
	    is[0] = anInt11367;
	    OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
	    anInt11367 = 0;
	}
    }
    
    public int method53() {
	return anInt11362;
    }
    
    void method17839() throws Throwable {
	method17838();
	super.finalize();
    }
    
    void method17840() throws Throwable {
	method17838();
	super.finalize();
    }
    
    void method17841() throws Throwable {
	method17838();
	super.finalize();
    }
    
    public void method106(int i) {
	OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt11367);
    }
    
    void method17842() {
	if (anInt11367 != 0) {
	    aClass185_Sub3_11361.method15406(anInt11367, anInt11360);
	    anInt11367 = 0;
	}
    }
}
