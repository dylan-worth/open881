/* Class137 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class137
{
    static final int anInt1601 = 34336;
    int anInt1602;
    Class185_Sub3 aClass185_Sub3_1603;
    static int[] anIntArray1604 = new int[1];
    
    void method2349() throws Throwable {
	aClass185_Sub3_1603.method15254(anInt1602);
	super.finalize();
    }
    
    void method2350() throws Throwable {
	aClass185_Sub3_1603.method15254(anInt1602);
	super.finalize();
    }
    
    Class137(Class185_Sub3 class185_sub3, int i, int i_0_) {
	aClass185_Sub3_1603 = class185_sub3;
	anInt1602 = i_0_;
    }
    
    static Class137 method2351(Class185_Sub3 class185_sub3, int i,
			       String string) {
	int i_1_ = OpenGL.glGenProgramARB();
	OpenGL.glBindProgramARB(i, i_1_);
	OpenGL.glProgramStringARB(i, 34933, string);
	OpenGL.glGetIntegerv(34379, anIntArray1604, 0);
	if (anIntArray1604[0] != -1) {
	    OpenGL.glBindProgramARB(i, 0);
	    return null;
	}
	OpenGL.glBindProgramARB(i, 0);
	return new Class137(class185_sub3, i, i_1_);
    }
    
    public void finalize() throws Throwable {
	aClass185_Sub3_1603.method15254(anInt1602);
	super.finalize();
    }
    
    void method2352() throws Throwable {
	aClass185_Sub3_1603.method15254(anInt1602);
	super.finalize();
    }
    
    static Class137 method2353(Class185_Sub3 class185_sub3, int i,
			       String string) {
	int i_2_ = OpenGL.glGenProgramARB();
	OpenGL.glBindProgramARB(i, i_2_);
	OpenGL.glProgramStringARB(i, 34933, string);
	OpenGL.glGetIntegerv(34379, anIntArray1604, 0);
	if (anIntArray1604[0] != -1) {
	    OpenGL.glBindProgramARB(i, 0);
	    return null;
	}
	OpenGL.glBindProgramARB(i, 0);
	return new Class137(class185_sub3, i, i_2_);
    }
    
    static Class137 method2354(Class185_Sub3 class185_sub3, int i,
			       String string) {
	int i_3_ = OpenGL.glGenProgramARB();
	OpenGL.glBindProgramARB(i, i_3_);
	OpenGL.glProgramStringARB(i, 34933, string);
	OpenGL.glGetIntegerv(34379, anIntArray1604, 0);
	if (anIntArray1604[0] != -1) {
	    OpenGL.glBindProgramARB(i, 0);
	    return null;
	}
	OpenGL.glBindProgramARB(i, 0);
	return new Class137(class185_sub3, i, i_3_);
    }
    
    static Class137 method2355(Class185_Sub3 class185_sub3, int i,
			       String string) {
	int i_4_ = OpenGL.glGenProgramARB();
	OpenGL.glBindProgramARB(i, i_4_);
	OpenGL.glProgramStringARB(i, 34933, string);
	OpenGL.glGetIntegerv(34379, anIntArray1604, 0);
	if (anIntArray1604[0] != -1) {
	    OpenGL.glBindProgramARB(i, 0);
	    return null;
	}
	OpenGL.glBindProgramARB(i, 0);
	return new Class137(class185_sub3, i, i_4_);
    }
}
