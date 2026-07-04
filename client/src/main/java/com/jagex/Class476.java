/* Class476 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public abstract class Class476 implements Interface34
{
    NativeHeapBuffer aNativeHeapBuffer5180;
    static final int anInt5181 = 34962;
    Class185_Sub1_Sub2 aClass185_Sub1_Sub2_5182;
    int anInt5183;
    boolean aBool5184;
    int anInt5185 = -1;
    int anInt5186;
    int anInt5187;
    static final int anInt5188 = 34963;
    static int[] anIntArray5189 = new int[1];
    
    void method7768() {
	if (aClass185_Sub1_Sub2_5182.aBool11592)
	    OpenGL.glBindBufferARB(anInt5183, anInt5185);
    }
    
    void method7769() {
	if (anInt5185 < 0) {
	    if (aClass185_Sub1_Sub2_5182.aBool11592) {
		OpenGL.glGenBuffersARB(1, anIntArray5189, 0);
		anInt5185 = anIntArray5189[0];
		OpenGL.glBindBufferARB(anInt5183, anInt5185);
	    } else
		anInt5185 = 0;
	}
    }
    
    public int method53() {
	return anInt5186;
    }
    
    long method7770() {
	return anInt5185 == 0 ? aNativeHeapBuffer5180.method2() : 0L;
    }
    
    public int method234() {
	return anInt5186;
    }
    
    void method277(int i) {
	if (i > anInt5187) {
	    method7769();
	    if (anInt5185 > 0) {
		OpenGL.glBindBufferARB(anInt5183, anInt5185);
		OpenGL.glBufferDataARBub(anInt5183, i, null, 0,
					 aBool5184 ? 35040 : 35044);
		aClass185_Sub1_Sub2_5182.anInt9136 += i - anInt5187;
	    } else
		aNativeHeapBuffer5180
		    = aClass185_Sub1_Sub2_5182.method14872(i, false);
	    anInt5187 = i;
	}
	anInt5186 = i;
    }
    
    public long method227(int i, int i_0_) {
	OpenGL.glBindBufferARB(anInt5183, anInt5185);
	return OpenGL.glMapBufferARB(anInt5183, 35001) + (long) i;
    }
    
    void method7771() {
	if (aClass185_Sub1_Sub2_5182.aBool11592)
	    OpenGL.glBindBufferARB(anInt5183, anInt5185);
    }
    
    public boolean method235(int i, int i_1_, long l) {
	method7769();
	if (anInt5185 > 0) {
	    OpenGL.glBindBufferARB(anInt5183, anInt5185);
	    OpenGL.glBufferSubDataARBa(anInt5183, i, i_1_, l);
	} else
	    aNativeHeapBuffer5180.aNativeHeap1119
		.copy(aNativeHeapBuffer5180.method2() + (long) i, l, i_1_);
	return true;
    }
    
    void method279(int i) {
	if (i > anInt5187) {
	    method7769();
	    if (anInt5185 > 0) {
		OpenGL.glBindBufferARB(anInt5183, anInt5185);
		OpenGL.glBufferDataARBub(anInt5183, i, null, 0,
					 aBool5184 ? 35040 : 35044);
		aClass185_Sub1_Sub2_5182.anInt9136 += i - anInt5187;
	    } else
		aNativeHeapBuffer5180
		    = aClass185_Sub1_Sub2_5182.method14872(i, false);
	    anInt5187 = i;
	}
	anInt5186 = i;
    }
    
    public void finalize() throws Throwable {
	method142();
	super.finalize();
    }
    
    public void method228() {
	OpenGL.glUnmapBufferARB(anInt5183);
    }
    
    public int method9() {
	return anInt5186;
    }
    
    void method144() {
	if (anInt5185 > 0) {
	    aClass185_Sub1_Sub2_5182.method18069(anInt5185, anInt5186);
	    anInt5185 = -1;
	}
    }
    
    void method7772() throws Throwable {
	method142();
	super.finalize();
    }
    
    void method7773() throws Throwable {
	method142();
	super.finalize();
    }
    
    public int method145() {
	return anInt5186;
    }
    
    Class476(Class185_Sub1_Sub2 class185_sub1_sub2, int i, boolean bool) {
	aClass185_Sub1_Sub2_5182 = class185_sub1_sub2;
	anInt5183 = i;
	aBool5184 = bool;
    }
    
    void method141() {
	if (anInt5185 > 0) {
	    aClass185_Sub1_Sub2_5182.method18069(anInt5185, anInt5186);
	    anInt5185 = -1;
	}
    }
    
    void method7774() {
	if (aClass185_Sub1_Sub2_5182.aBool11592)
	    OpenGL.glBindBufferARB(anInt5183, anInt5185);
    }
    
    public boolean method231(int i, int i_2_, long l) {
	method7769();
	if (anInt5185 > 0) {
	    OpenGL.glBindBufferARB(anInt5183, anInt5185);
	    OpenGL.glBufferSubDataARBa(anInt5183, i, i_2_, l);
	} else
	    aNativeHeapBuffer5180.aNativeHeap1119
		.copy(aNativeHeapBuffer5180.method2() + (long) i, l, i_2_);
	return true;
    }
    
    public boolean method232(int i, int i_3_, long l) {
	method7769();
	if (anInt5185 > 0) {
	    OpenGL.glBindBufferARB(anInt5183, anInt5185);
	    OpenGL.glBufferSubDataARBa(anInt5183, i, i_3_, l);
	} else
	    aNativeHeapBuffer5180.aNativeHeap1119
		.copy(aNativeHeapBuffer5180.method2() + (long) i, l, i_3_);
	return true;
    }
    
    void method7775() throws Throwable {
	method142();
	super.finalize();
    }
    
    public long method230(int i, int i_4_) {
	OpenGL.glBindBufferARB(anInt5183, anInt5185);
	return OpenGL.glMapBufferARB(anInt5183, 35001) + (long) i;
    }
    
    public void method229() {
	OpenGL.glUnmapBufferARB(anInt5183);
    }
    
    public void method226() {
	OpenGL.glUnmapBufferARB(anInt5183);
    }
    
    void method143() {
	if (anInt5185 > 0) {
	    aClass185_Sub1_Sub2_5182.method18069(anInt5185, anInt5186);
	    anInt5185 = -1;
	}
    }
    
    public boolean method233(int i, int i_5_, long l) {
	method7769();
	if (anInt5185 > 0) {
	    OpenGL.glBindBufferARB(anInt5183, anInt5185);
	    OpenGL.glBufferSubDataARBa(anInt5183, i, i_5_, l);
	} else
	    aNativeHeapBuffer5180.aNativeHeap1119
		.copy(aNativeHeapBuffer5180.method2() + (long) i, l, i_5_);
	return true;
    }
    
    void method142() {
	if (anInt5185 > 0) {
	    aClass185_Sub1_Sub2_5182.method18069(anInt5185, anInt5186);
	    anInt5185 = -1;
	}
    }
    
    long method7776() {
	return anInt5185 == 0 ? aNativeHeapBuffer5180.method2() : 0L;
    }
    
    void method7777() {
	if (aClass185_Sub1_Sub2_5182.aBool11592)
	    OpenGL.glBindBufferARB(anInt5183, anInt5185);
    }
    
    long method7778() {
	return anInt5185 == 0 ? aNativeHeapBuffer5180.method2() : 0L;
    }
    
    void method7779() {
	if (aClass185_Sub1_Sub2_5182.aBool11592)
	    OpenGL.glBindBufferARB(anInt5183, anInt5185);
    }
}
