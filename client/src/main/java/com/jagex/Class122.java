/* Class122 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class122
{
    static int[] anIntArray1483 = new int[2];
    Class185_Sub3 aClass185_Sub3_1484;
    int anInt1485;
    
    static Class122 method2173(Class185_Sub3 class185_sub3,
			       Class140[] class140s) {
	for (int i = 0; i < class140s.length; i++) {
	    if (class140s[i] == null || class140s[i].anInt1616 <= 0)
		return null;
	}
	int i = OpenGL.glCreateProgram();
	for (int i_0_ = 0; i_0_ < class140s.length; i_0_++)
	    OpenGL.glAttachShader(i, class140s[i_0_].anInt1616);
	OpenGL.glLinkProgram(i);
	OpenGL.glGetProgramiv(i, 35714, anIntArray1483, 0);
	if (anIntArray1483[0] == 0) {
	    OpenGL.glGetProgramiv(i, 35716, anIntArray1483, 1);
	    if (anIntArray1483[1] > 1) {
		byte[] is = new byte[anIntArray1483[1]];
		OpenGL.glGetProgramInfoLog(i, anIntArray1483[1],
					   anIntArray1483, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (anIntArray1483[0] == 0) {
		for (int i_1_ = 0; i_1_ < class140s.length; i_1_++)
		    OpenGL.glDetachShader(i, class140s[i_1_].anInt1616);
		OpenGL.glDeleteProgram(i);
		return null;
	    }
	}
	return new Class122(class185_sub3, i, class140s);
    }
    
    public void finalize() throws Throwable {
	aClass185_Sub3_1484.method15265((long) anInt1485);
	super.finalize();
    }
    
    Class122(Class185_Sub3 class185_sub3, int i, Class140[] class140s) {
	aClass185_Sub3_1484 = class185_sub3;
	anInt1485 = i;
    }
    
    static Class122 method2174(Class185_Sub3 class185_sub3,
			       Class140[] class140s) {
	for (int i = 0; i < class140s.length; i++) {
	    if (class140s[i] == null || class140s[i].anInt1616 <= 0)
		return null;
	}
	int i = OpenGL.glCreateProgram();
	for (int i_2_ = 0; i_2_ < class140s.length; i_2_++)
	    OpenGL.glAttachShader(i, class140s[i_2_].anInt1616);
	OpenGL.glLinkProgram(i);
	OpenGL.glGetProgramiv(i, 35714, anIntArray1483, 0);
	if (anIntArray1483[0] == 0) {
	    OpenGL.glGetProgramiv(i, 35716, anIntArray1483, 1);
	    if (anIntArray1483[1] > 1) {
		byte[] is = new byte[anIntArray1483[1]];
		OpenGL.glGetProgramInfoLog(i, anIntArray1483[1],
					   anIntArray1483, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (anIntArray1483[0] == 0) {
		for (int i_3_ = 0; i_3_ < class140s.length; i_3_++)
		    OpenGL.glDetachShader(i, class140s[i_3_].anInt1616);
		OpenGL.glDeleteProgram(i);
		return null;
	    }
	}
	return new Class122(class185_sub3, i, class140s);
    }
    
    static Class122 method2175(Class185_Sub3 class185_sub3,
			       Class140[] class140s) {
	for (int i = 0; i < class140s.length; i++) {
	    if (class140s[i] == null || class140s[i].anInt1616 <= 0)
		return null;
	}
	int i = OpenGL.glCreateProgram();
	for (int i_4_ = 0; i_4_ < class140s.length; i_4_++)
	    OpenGL.glAttachShader(i, class140s[i_4_].anInt1616);
	OpenGL.glLinkProgram(i);
	OpenGL.glGetProgramiv(i, 35714, anIntArray1483, 0);
	if (anIntArray1483[0] == 0) {
	    OpenGL.glGetProgramiv(i, 35716, anIntArray1483, 1);
	    if (anIntArray1483[1] > 1) {
		byte[] is = new byte[anIntArray1483[1]];
		OpenGL.glGetProgramInfoLog(i, anIntArray1483[1],
					   anIntArray1483, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (anIntArray1483[0] == 0) {
		for (int i_5_ = 0; i_5_ < class140s.length; i_5_++)
		    OpenGL.glDetachShader(i, class140s[i_5_].anInt1616);
		OpenGL.glDeleteProgram(i);
		return null;
	    }
	}
	return new Class122(class185_sub3, i, class140s);
    }
    
    void method2176() throws Throwable {
	aClass185_Sub3_1484.method15265((long) anInt1485);
	super.finalize();
    }
    
    void method2177() throws Throwable {
	aClass185_Sub3_1484.method15265((long) anInt1485);
	super.finalize();
    }
    
    void method2178() throws Throwable {
	aClass185_Sub3_1484.method15265((long) anInt1485);
	super.finalize();
    }
}
