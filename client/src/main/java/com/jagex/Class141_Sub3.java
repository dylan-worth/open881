/* Class141_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class141_Sub3 extends Class141
{
    int anInt8950;
    
    void method14483(boolean bool) {
	aClass185_Sub3_1626.method15231(this);
	OpenGL.glTexParameteri(anInt1628, 10242, bool ? 10497 : 33071);
    }
    
    Class141_Sub3(Class185_Sub3 class185_sub3, Class181 class181,
		  Class173 class173, int i, byte[] is, Class181 class181_0_) {
	super(class185_sub3, 3552, class181, class173, i, false);
	anInt8950 = i;
	aClass185_Sub3_1626.method15231(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glTexImage1Dub(anInt1628, 0,
			      Class185_Sub3.method15257(aClass181_1629,
							aClass173_1630),
			      anInt8950, 0,
			      Class185_Sub3.method15256(class181_0_), 5121, is,
			      0);
	OpenGL.glPixelStorei(3317, 4);
	method2382(true);
    }
}
