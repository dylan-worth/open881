/* Class141_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class141_Sub4 extends Class141
{
    int anInt8975;
    int anInt8976;
    int anInt8977;
    
    void method14489(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_,
		     int i_5_) {
	aClass185_Sub3_1626.method15231(this);
	OpenGL.glCopyTexSubImage3D(anInt1628, 0, i, i_0_, i_1_, i_4_, i_5_,
				   i_2_, i_3_);
	OpenGL.glFlush();
    }
    
    Class141_Sub4(Class185_Sub3 class185_sub3, Class181 class181,
		  Class173 class173, int i, int i_6_, int i_7_, byte[] is,
		  Class181 class181_8_) {
	super(class185_sub3, 32879, class181, class173, i * i_6_ * i_7_,
	      false);
	anInt8975 = i;
	anInt8976 = i_6_;
	anInt8977 = i_7_;
	aClass185_Sub3_1626.method15231(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glTexImage3Dub(anInt1628, 0,
			      Class185_Sub3.method15257(aClass181_1629,
							aClass173_1630),
			      anInt8975, anInt8976, anInt8977, 0,
			      Class185_Sub3.method15256(class181_8_), 5121, is,
			      0);
	OpenGL.glPixelStorei(3317, 4);
	method2382(true);
    }
    
    void method14490(int i, int i_9_, int i_10_, int i_11_, int i_12_,
		     int i_13_, int i_14_) {
	aClass185_Sub3_1626.method15231(this);
	OpenGL.glCopyTexSubImage3D(anInt1628, 0, i, i_9_, i_10_, i_13_, i_14_,
				   i_11_, i_12_);
	OpenGL.glFlush();
    }
    
    void method14491(int i, int i_15_, int i_16_, int i_17_, int i_18_,
		     int i_19_, int i_20_) {
	aClass185_Sub3_1626.method15231(this);
	OpenGL.glCopyTexSubImage3D(anInt1628, 0, i, i_15_, i_16_, i_19_, i_20_,
				   i_17_, i_18_);
	OpenGL.glFlush();
    }
    
    Class141_Sub4(Class185_Sub3 class185_sub3, Class181 class181,
		  Class173 class173, int i, int i_21_, int i_22_) {
	super(class185_sub3, 32879, class181, class173, i * i_21_ * i_22_,
	      false);
	anInt8975 = i;
	anInt8976 = i_21_;
	anInt8977 = i_22_;
	aClass185_Sub3_1626.method15231(this);
	OpenGL.glTexImage3Dub(anInt1628, 0,
			      Class185_Sub3.method15257(aClass181_1629,
							aClass173_1630),
			      anInt8975, anInt8976, anInt8977, 0,
			      Class185_Sub3.method15256(aClass181_1629), 5121,
			      null, 0);
	method2382(true);
    }
}
