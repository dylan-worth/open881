/* Class269_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class269_Sub1 extends Class269
{
    Class278_Sub1 aClass278_Sub1_10109;
    int anInt10110;
    Class185_Sub1_Sub2 aClass185_Sub1_Sub2_10111;
    
    public void method4972() {
	/* empty */
    }
    
    Class278 method4959(Class185_Sub1 class185_sub1, Class277 class277) {
	return new Class278_Sub1((Class185_Sub1_Sub2) class185_sub1, this,
				 class277);
    }
    
    Class278 method5012(Class185_Sub1 class185_sub1, Class277 class277) {
	return new Class278_Sub1((Class185_Sub1_Sub2) class185_sub1, this,
				 class277);
    }
    
    public boolean method4968(Class278 class278) {
	if (aClass278_Sub1_10109 == class278)
	    return true;
	if (!class278.method5182())
	    return false;
	boolean bool = method4911();
	aClass278_Sub1_10109 = (Class278_Sub1) class278;
	anInt2953 = method4917(class278, (byte) 17) * -1164303385;
	if (anInt2953 * 567951319 == -1)
	    throw new IllegalArgumentException();
	anInt10110 = aClass278_Sub1_10109.anInt10047;
	if (bool) {
	    OpenGL.glUseProgram(anInt10110);
	    aClass185_Sub1_Sub2_10111.aClass278_Sub1_11583
		= aClass278_Sub1_10109;
	}
	return true;
    }
    
    public void method4913() {
	if (aClass185_Sub1_Sub2_10111.aClass278_Sub1_11583
	    != aClass278_Sub1_10109) {
	    if (aClass278_Sub1_10109 == null)
		throw new RuntimeException_Sub3();
	    OpenGL.glUseProgram(anInt10110);
	    aClass185_Sub1_Sub2_10111.aClass278_Sub1_11583
		= aClass278_Sub1_10109;
	}
    }
    
    public void method4910() {
	/* empty */
    }
    
    public boolean method4911() {
	return (aClass185_Sub1_Sub2_10111.aClass278_Sub1_11583
		== aClass278_Sub1_10109);
    }
    
    Class278 method4960(Class185_Sub1 class185_sub1, Class277 class277) {
	return new Class278_Sub1((Class185_Sub1_Sub2) class185_sub1, this,
				 class277);
    }
    
    public void finalize() throws Throwable {
	method4948();
	super.finalize();
    }
    
    void method4948() {
	for (int i = 0; i < method4984((byte) 97); i++)
	    ((Class278_Sub1) method4916(i, 56453164)).method142();
	super.method4948();
    }
    
    void method15718() throws Throwable {
	method4948();
	super.finalize();
    }
    
    void method15719() throws Throwable {
	method4948();
	super.finalize();
    }
    
    public void method4950() {
	/* empty */
    }
    
    public void method4962() {
	/* empty */
    }
    
    Class269_Sub1(Class185_Sub1_Sub2 class185_sub1_sub2, Class261 class261) {
	super((Class185_Sub1) class185_sub1_sub2, class261);
	aClass185_Sub1_Sub2_10111 = class185_sub1_sub2;
    }
    
    public boolean method5004() {
	return (aClass185_Sub1_Sub2_10111.aClass278_Sub1_11583
		== aClass278_Sub1_10109);
    }
    
    Class534_Sub12_Sub1 method4922(Class266 class266) {
	return new Class534_Sub12_Sub1_Sub1(this, class266);
    }
    
    Class278 method4956(Class185_Sub1 class185_sub1, Class277 class277) {
	return new Class278_Sub1((Class185_Sub1_Sub2) class185_sub1, this,
				 class277);
    }
    
    Class278 method4957(Class185_Sub1 class185_sub1, Class277 class277) {
	return new Class278_Sub1((Class185_Sub1_Sub2) class185_sub1, this,
				 class277);
    }
    
    Class278 method4958(Class185_Sub1 class185_sub1, Class277 class277) {
	return new Class278_Sub1((Class185_Sub1_Sub2) class185_sub1, this,
				 class277);
    }
    
    public boolean method4953() {
	return (aClass185_Sub1_Sub2_10111.aClass278_Sub1_11583
		== aClass278_Sub1_10109);
    }
    
    public void method5017() {
	if (aClass185_Sub1_Sub2_10111.aClass278_Sub1_11583
	    != aClass278_Sub1_10109) {
	    if (aClass278_Sub1_10109 == null)
		throw new RuntimeException_Sub3();
	    OpenGL.glUseProgram(anInt10110);
	    aClass185_Sub1_Sub2_10111.aClass278_Sub1_11583
		= aClass278_Sub1_10109;
	}
    }
    
    public boolean method4967(Class278 class278) {
	if (aClass278_Sub1_10109 == class278)
	    return true;
	if (!class278.method5182())
	    return false;
	boolean bool = method4911();
	aClass278_Sub1_10109 = (Class278_Sub1) class278;
	anInt2953 = method4917(class278, (byte) 12) * -1164303385;
	if (anInt2953 * 567951319 == -1)
	    throw new IllegalArgumentException();
	anInt10110 = aClass278_Sub1_10109.anInt10047;
	if (bool) {
	    OpenGL.glUseProgram(anInt10110);
	    aClass185_Sub1_Sub2_10111.aClass278_Sub1_11583
		= aClass278_Sub1_10109;
	}
	return true;
    }
    
    void method15720() throws Throwable {
	method4948();
	super.finalize();
    }
    
    public boolean method4969(Class278 class278) {
	if (aClass278_Sub1_10109 == class278)
	    return true;
	if (!class278.method5182())
	    return false;
	boolean bool = method4911();
	aClass278_Sub1_10109 = (Class278_Sub1) class278;
	anInt2953 = method4917(class278, (byte) -19) * -1164303385;
	if (anInt2953 * 567951319 == -1)
	    throw new IllegalArgumentException();
	anInt10110 = aClass278_Sub1_10109.anInt10047;
	if (bool) {
	    OpenGL.glUseProgram(anInt10110);
	    aClass185_Sub1_Sub2_10111.aClass278_Sub1_11583
		= aClass278_Sub1_10109;
	}
	return true;
    }
    
    void method5013() {
	for (int i = 0; i < method4984((byte) 111); i++)
	    ((Class278_Sub1) method4916(i, 56453164)).method142();
	super.method4948();
    }
    
    Class534_Sub12_Sub1 method4915(Class266 class266) {
	return new Class534_Sub12_Sub1_Sub1(this, class266);
    }
    
    public boolean method4919(Class278 class278) {
	if (aClass278_Sub1_10109 == class278)
	    return true;
	if (!class278.method5182())
	    return false;
	boolean bool = method4911();
	aClass278_Sub1_10109 = (Class278_Sub1) class278;
	anInt2953 = method4917(class278, (byte) -30) * -1164303385;
	if (anInt2953 * 567951319 == -1)
	    throw new IllegalArgumentException();
	anInt10110 = aClass278_Sub1_10109.anInt10047;
	if (bool) {
	    OpenGL.glUseProgram(anInt10110);
	    aClass185_Sub1_Sub2_10111.aClass278_Sub1_11583
		= aClass278_Sub1_10109;
	}
	return true;
    }
    
    public void method5001() {
	if (aClass185_Sub1_Sub2_10111.aClass278_Sub1_11583
	    != aClass278_Sub1_10109) {
	    if (aClass278_Sub1_10109 == null)
		throw new RuntimeException_Sub3();
	    OpenGL.glUseProgram(anInt10110);
	    aClass185_Sub1_Sub2_10111.aClass278_Sub1_11583
		= aClass278_Sub1_10109;
	}
    }
    
    public void method5015() {
	if (aClass185_Sub1_Sub2_10111.aClass278_Sub1_11583
	    != aClass278_Sub1_10109) {
	    if (aClass278_Sub1_10109 == null)
		throw new RuntimeException_Sub3();
	    OpenGL.glUseProgram(anInt10110);
	    aClass185_Sub1_Sub2_10111.aClass278_Sub1_11583
		= aClass278_Sub1_10109;
	}
    }
    
    public void method5016() {
	if (aClass185_Sub1_Sub2_10111.aClass278_Sub1_11583
	    != aClass278_Sub1_10109) {
	    if (aClass278_Sub1_10109 == null)
		throw new RuntimeException_Sub3();
	    OpenGL.glUseProgram(anInt10110);
	    aClass185_Sub1_Sub2_10111.aClass278_Sub1_11583
		= aClass278_Sub1_10109;
	}
    }
    
    public boolean method4970(Class278 class278) {
	if (aClass278_Sub1_10109 == class278)
	    return true;
	if (!class278.method5182())
	    return false;
	boolean bool = method4911();
	aClass278_Sub1_10109 = (Class278_Sub1) class278;
	anInt2953 = method4917(class278, (byte) 1) * -1164303385;
	if (anInt2953 * 567951319 == -1)
	    throw new IllegalArgumentException();
	anInt10110 = aClass278_Sub1_10109.anInt10047;
	if (bool) {
	    OpenGL.glUseProgram(anInt10110);
	    aClass185_Sub1_Sub2_10111.aClass278_Sub1_11583
		= aClass278_Sub1_10109;
	}
	return true;
    }
    
    public void method5018() {
	if (aClass185_Sub1_Sub2_10111.aClass278_Sub1_11583
	    != aClass278_Sub1_10109) {
	    if (aClass278_Sub1_10109 == null)
		throw new RuntimeException_Sub3();
	    OpenGL.glUseProgram(anInt10110);
	    aClass185_Sub1_Sub2_10111.aClass278_Sub1_11583
		= aClass278_Sub1_10109;
	}
    }
    
    public void method4955() {
	if (aClass185_Sub1_Sub2_10111.aClass278_Sub1_11583
	    != aClass278_Sub1_10109) {
	    if (aClass278_Sub1_10109 == null)
		throw new RuntimeException_Sub3();
	    OpenGL.glUseProgram(anInt10110);
	    aClass185_Sub1_Sub2_10111.aClass278_Sub1_11583
		= aClass278_Sub1_10109;
	}
    }
}
