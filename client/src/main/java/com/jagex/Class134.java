/* Class134 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaclib.memory.Buffer;

import jaggl.OpenGL;

public abstract class Class134
{
    Class185_Sub3 aClass185_Sub3_1587;
    boolean aBool1588;
    static final int anInt1589 = 34962;
    int anInt1590;
    int anInt1591;
    static final int anInt1592 = 34963;
    int anInt1593;
    boolean aBool1594 = false;
    static int[] anIntArray1595 = new int[1];
    
    void method2316(byte[] is, int i) {
	method2320();
	if (i > anInt1593) {
	    OpenGL.glBufferDataARBub(anInt1590, i, is, 0,
				     aBool1588 ? 35040 : 35044);
	    aClass185_Sub3_1587.anInt9580 += i - anInt1593;
	    anInt1593 = i;
	} else
	    OpenGL.glBufferSubDataARBub(anInt1590, 0, i, is, 0);
    }
    
    Class134(Class185_Sub3 class185_sub3, int i, Buffer buffer, int i_0_,
	     boolean bool) {
	aClass185_Sub3_1587 = class185_sub3;
	anInt1590 = i;
	anInt1593 = i_0_;
	aBool1588 = bool;
	OpenGL.glGenBuffersARB(1, anIntArray1595, 0);
	anInt1591 = anIntArray1595[0];
	method2320();
	OpenGL.glBufferDataARBa(i, anInt1593, buffer.method2(),
				aBool1588 ? 35040 : 35044);
	aClass185_Sub3_1587.anInt9580 += anInt1593;
    }
    
    void method2317() throws Throwable {
	if (!aBool1594) {
	    aClass185_Sub3_1587.method15252(anInt1591, anInt1593);
	    aBool1594 = true;
	}
	super.finalize();
    }
    
    void method2318(byte[] is, int i) {
	method2320();
	if (i > anInt1593) {
	    OpenGL.glBufferDataARBub(anInt1590, i, is, 0,
				     aBool1588 ? 35040 : 35044);
	    aClass185_Sub3_1587.anInt9580 += i - anInt1593;
	    anInt1593 = i;
	} else
	    OpenGL.glBufferSubDataARBub(anInt1590, 0, i, is, 0);
    }
    
    public void finalize() throws Throwable {
	if (!aBool1594) {
	    aClass185_Sub3_1587.method15252(anInt1591, anInt1593);
	    aBool1594 = true;
	}
	super.finalize();
    }
    
    void method2319() throws Throwable {
	if (!aBool1594) {
	    aClass185_Sub3_1587.method15252(anInt1591, anInt1593);
	    aBool1594 = true;
	}
	super.finalize();
    }
    
    abstract void method2320();
    
    void method2321() throws Throwable {
	if (!aBool1594) {
	    aClass185_Sub3_1587.method15252(anInt1591, anInt1593);
	    aBool1594 = true;
	}
	super.finalize();
    }
    
    abstract void method2322();
    
    void method2323(byte[] is, int i) {
	method2320();
	if (i > anInt1593) {
	    OpenGL.glBufferDataARBub(anInt1590, i, is, 0,
				     aBool1588 ? 35040 : 35044);
	    aClass185_Sub3_1587.anInt9580 += i - anInt1593;
	    anInt1593 = i;
	} else
	    OpenGL.glBufferSubDataARBub(anInt1590, 0, i, is, 0);
    }
    
    Class134(Class185_Sub3 class185_sub3, int i, byte[] is, int i_1_,
	     boolean bool) {
	aClass185_Sub3_1587 = class185_sub3;
	anInt1590 = i;
	anInt1593 = i_1_;
	aBool1588 = bool;
	OpenGL.glGenBuffersARB(1, anIntArray1595, 0);
	anInt1591 = anIntArray1595[0];
	method2320();
	OpenGL.glBufferDataARBub(i, anInt1593, is, 0,
				 aBool1588 ? 35040 : 35044);
	aClass185_Sub3_1587.anInt9580 += anInt1593;
    }
    
    void method2324(byte[] is, int i) {
	method2320();
	if (i > anInt1593) {
	    OpenGL.glBufferDataARBub(anInt1590, i, is, 0,
				     aBool1588 ? 35040 : 35044);
	    aClass185_Sub3_1587.anInt9580 += i - anInt1593;
	    anInt1593 = i;
	} else
	    OpenGL.glBufferSubDataARBub(anInt1590, 0, i, is, 0);
    }
    
    void method2325(byte[] is, int i) {
	method2320();
	if (i > anInt1593) {
	    OpenGL.glBufferDataARBub(anInt1590, i, is, 0,
				     aBool1588 ? 35040 : 35044);
	    aClass185_Sub3_1587.anInt9580 += i - anInt1593;
	    anInt1593 = i;
	} else
	    OpenGL.glBufferSubDataARBub(anInt1590, 0, i, is, 0);
    }
}
