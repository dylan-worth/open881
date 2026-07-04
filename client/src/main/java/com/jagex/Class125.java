/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class125
{
    int anInt1502;
    
    void method2184(char c) {
	OpenGL.glCallList(anInt1502 + c);
    }
    
    void method2185(int i) {
	OpenGL.glNewList(anInt1502 + i, 4864);
    }
    
    void method2186() {
	OpenGL.glEndList();
    }
    
    void method2187(char c) {
	OpenGL.glCallList(anInt1502 + c);
    }
    
    Class125(Class185_Sub3 class185_sub3, int i) {
	anInt1502 = OpenGL.glGenLists(i);
    }
    
    void method2188() {
	OpenGL.glEndList();
    }
    
    void method2189(char c) {
	OpenGL.glCallList(anInt1502 + c);
    }
    
    void method2190(int i) {
	OpenGL.glNewList(anInt1502 + i, 4864);
    }
}
