/* Class140 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class140
{
    static final int anInt1615 = 35633;
    int anInt1616;
    static int[] anIntArray1617 = new int[2];
    Class185_Sub3 aClass185_Sub3_1618;
    static final int anInt1619 = 35632;
    
    void method2356() throws Throwable {
	aClass185_Sub3_1618.method15265((long) anInt1616);
	super.finalize();
    }
    
    Class140(Class185_Sub3 class185_sub3, int i, int i_0_) {
	aClass185_Sub3_1618 = class185_sub3;
	anInt1616 = i;
    }
    
    public void finalize() throws Throwable {
	aClass185_Sub3_1618.method15265((long) anInt1616);
	super.finalize();
    }
    
    static Class140 method2357(Class185_Sub3 class185_sub3, int i,
			       String string) {
	int i_1_ = OpenGL.glCreateShader(i);
	OpenGL.glShaderSource(i_1_, string);
	OpenGL.glCompileShader(i_1_);
	OpenGL.glGetShaderiv(i_1_, 35713, anIntArray1617, 0);
	if (anIntArray1617[0] == 0) {
	    boolean bool = false;
	    if (anIntArray1617[0] == 0) {
		bool = true;
		System.out.println("");
	    }
	    OpenGL.glGetShaderiv(i_1_, 35716, anIntArray1617, 1);
	    if (anIntArray1617[1] > 1) {
		byte[] is = new byte[anIntArray1617[1]];
		OpenGL.glGetShaderInfoLog(i_1_, anIntArray1617[1],
					  anIntArray1617, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (bool) {
		OpenGL.glDeleteShader(i_1_);
		return null;
	    }
	}
	return new Class140(class185_sub3, i_1_, i);
    }
    
    void method2358() throws Throwable {
	aClass185_Sub3_1618.method15265((long) anInt1616);
	super.finalize();
    }
    
    void method2359() throws Throwable {
	aClass185_Sub3_1618.method15265((long) anInt1616);
	super.finalize();
    }
    
    static Class140 method2360(Class185_Sub3 class185_sub3, int i,
			       String string) {
	int i_2_ = OpenGL.glCreateShader(i);
	OpenGL.glShaderSource(i_2_, string);
	OpenGL.glCompileShader(i_2_);
	OpenGL.glGetShaderiv(i_2_, 35713, anIntArray1617, 0);
	if (anIntArray1617[0] == 0) {
	    boolean bool = false;
	    if (anIntArray1617[0] == 0) {
		bool = true;
		System.out.println("");
	    }
	    OpenGL.glGetShaderiv(i_2_, 35716, anIntArray1617, 1);
	    if (anIntArray1617[1] > 1) {
		byte[] is = new byte[anIntArray1617[1]];
		OpenGL.glGetShaderInfoLog(i_2_, anIntArray1617[1],
					  anIntArray1617, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (bool) {
		OpenGL.glDeleteShader(i_2_);
		return null;
	    }
	}
	return new Class140(class185_sub3, i_2_, i);
    }
    
    static Class140 method2361(Class185_Sub3 class185_sub3, int i,
			       String string) {
	int i_3_ = OpenGL.glCreateShader(i);
	OpenGL.glShaderSource(i_3_, string);
	OpenGL.glCompileShader(i_3_);
	OpenGL.glGetShaderiv(i_3_, 35713, anIntArray1617, 0);
	if (anIntArray1617[0] == 0) {
	    boolean bool = false;
	    if (anIntArray1617[0] == 0) {
		bool = true;
		System.out.println("");
	    }
	    OpenGL.glGetShaderiv(i_3_, 35716, anIntArray1617, 1);
	    if (anIntArray1617[1] > 1) {
		byte[] is = new byte[anIntArray1617[1]];
		OpenGL.glGetShaderInfoLog(i_3_, anIntArray1617[1],
					  anIntArray1617, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (bool) {
		OpenGL.glDeleteShader(i_3_);
		return null;
	    }
	}
	return new Class140(class185_sub3, i_3_, i);
    }
    
    static Class140 method2362(Class185_Sub3 class185_sub3, int i,
			       String string) {
	int i_4_ = OpenGL.glCreateShader(i);
	OpenGL.glShaderSource(i_4_, string);
	OpenGL.glCompileShader(i_4_);
	OpenGL.glGetShaderiv(i_4_, 35713, anIntArray1617, 0);
	if (anIntArray1617[0] == 0) {
	    boolean bool = false;
	    if (anIntArray1617[0] == 0) {
		bool = true;
		System.out.println("");
	    }
	    OpenGL.glGetShaderiv(i_4_, 35716, anIntArray1617, 1);
	    if (anIntArray1617[1] > 1) {
		byte[] is = new byte[anIntArray1617[1]];
		OpenGL.glGetShaderInfoLog(i_4_, anIntArray1617[1],
					  anIntArray1617, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (bool) {
		OpenGL.glDeleteShader(i_4_);
		return null;
	    }
	}
	return new Class140(class185_sub3, i_4_, i);
    }
    
    static Class140 method2363(Class185_Sub3 class185_sub3, int i,
			       String string) {
	int i_5_ = OpenGL.glCreateShader(i);
	OpenGL.glShaderSource(i_5_, string);
	OpenGL.glCompileShader(i_5_);
	OpenGL.glGetShaderiv(i_5_, 35713, anIntArray1617, 0);
	if (anIntArray1617[0] == 0) {
	    boolean bool = false;
	    if (anIntArray1617[0] == 0) {
		bool = true;
		System.out.println("");
	    }
	    OpenGL.glGetShaderiv(i_5_, 35716, anIntArray1617, 1);
	    if (anIntArray1617[1] > 1) {
		byte[] is = new byte[anIntArray1617[1]];
		OpenGL.glGetShaderInfoLog(i_5_, anIntArray1617[1],
					  anIntArray1617, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (bool) {
		OpenGL.glDeleteShader(i_5_);
		return null;
	    }
	}
	return new Class140(class185_sub3, i_5_, i);
    }
}
