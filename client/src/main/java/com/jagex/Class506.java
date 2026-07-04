/* Class506 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class506 implements Interface22, Interface21, Interface57
{
    int anInt5658;
    int anInt5659;
    Class173 aClass173_5660;
    Class181 aClass181_5661;
    Class185_Sub1_Sub2 aClass185_Sub1_Sub2_5662;
    int anInt5663;
    
    public int method8() {
	return anInt5658;
    }
    
    public void method142() {
	if (anInt5659 != 0) {
	    int[] is = new int[1];
	    is[0] = anInt5659;
	    OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
	    anInt5659 = 0;
	}
    }
    
    public int method88() {
	return anInt5658;
    }
    
    public int method93() {
	return anInt5658;
    }
    
    public void method65(int i) {
	OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt5659);
    }
    
    void method8359() {
	if (anInt5659 != 0) {
	    aClass185_Sub1_Sub2_5662.method18067(anInt5659,
						 (anInt5663 * anInt5658
						  * (aClass173_5660.anInt1825
						     * 1899960707)
						  * (aClass181_5661.anInt1962
						     * 1676120375)));
	    anInt5659 = 0;
	}
    }
    
    void method8360() {
	if (anInt5659 != 0) {
	    aClass185_Sub1_Sub2_5662.method18067(anInt5659,
						 (anInt5663 * anInt5658
						  * (aClass173_5660.anInt1825
						     * 1899960707)
						  * (aClass181_5661.anInt1962
						     * 1676120375)));
	    anInt5659 = 0;
	}
    }
    
    public void finalize() throws Throwable {
	method8360();
	super.finalize();
    }
    
    public int method85() {
	return anInt5658;
    }
    
    public int method53() {
	return anInt5663;
    }
    
    public int method1() {
	return anInt5663;
    }
    
    public int method9() {
	return anInt5658;
    }
    
    void method8361() throws Throwable {
	method8360();
	super.finalize();
    }
    
    public int method145() {
	return anInt5658;
    }
    
    public int method22() {
	return anInt5663;
    }
    
    public void method143() {
	if (anInt5659 != 0) {
	    int[] is = new int[1];
	    is[0] = anInt5659;
	    OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
	    anInt5659 = 0;
	}
    }
    
    public void method141() {
	if (anInt5659 != 0) {
	    int[] is = new int[1];
	    is[0] = anInt5659;
	    OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
	    anInt5659 = 0;
	}
    }
    
    public void method144() {
	if (anInt5659 != 0) {
	    int[] is = new int[1];
	    is[0] = anInt5659;
	    OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
	    anInt5659 = 0;
	}
    }
    
    Class506(Class185_Sub1_Sub2 class185_sub1_sub2, Class181 class181,
	     Class173 class173, int i, int i_0_) {
	aClass181_5661 = class181;
	aClass173_5660 = class173;
	anInt5663 = i;
	anInt5658 = i_0_;
	aClass185_Sub1_Sub2_5662 = class185_sub1_sub2;
	int[] is = new int[1];
	OpenGL.glGenRenderbuffersEXT(1, is, 0);
	anInt5659 = is[0];
	OpenGL.glBindRenderbufferEXT(36161, anInt5659);
	OpenGL.glRenderbufferStorageEXT
	    (36161,
	     Class185_Sub1_Sub2.method18075(aClass181_5661, aClass173_5660), i,
	     i_0_);
    }
    
    void method8362() throws Throwable {
	method8360();
	super.finalize();
    }
    
    void method8363() throws Throwable {
	method8360();
	super.finalize();
    }
    
    public void method106(int i) {
	OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt5659);
    }
    
    Class506(Class185_Sub1_Sub2 class185_sub1_sub2, Class181 class181,
	     Class173 class173, int i, int i_1_, int i_2_) {
	aClass181_5661 = class181;
	aClass173_5660 = class173;
	anInt5663 = i;
	anInt5658 = i_1_;
	aClass185_Sub1_Sub2_5662 = class185_sub1_sub2;
	int[] is = new int[1];
	OpenGL.glGenRenderbuffersEXT(1, is, 0);
	anInt5659 = is[0];
	OpenGL.glBindRenderbufferEXT(36161, anInt5659);
	OpenGL.glRenderbufferStorageMultisampleEXT
	    (36161, i_2_,
	     Class185_Sub1_Sub2.method18075(aClass181_5661, aClass173_5660), i,
	     i_1_);
    }
    
    void method8364() {
	if (anInt5659 != 0) {
	    aClass185_Sub1_Sub2_5662.method18067(anInt5659,
						 (anInt5663 * anInt5658
						  * (aClass173_5660.anInt1825
						     * 1899960707)
						  * (aClass181_5661.anInt1962
						     * 1676120375)));
	    anInt5659 = 0;
	}
    }
}
