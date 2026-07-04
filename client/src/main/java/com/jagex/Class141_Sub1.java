/* Class141_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class141_Sub1 extends Class141
{
    static final int anInt8911 = 34072;
    static final int anInt8912 = 34070;
    static final int anInt8913 = 34074;
    static final int anInt8914 = 34069;
    static final int anInt8915 = 34073;
    static final int anInt8916 = 34071;
    int anInt8917;
    
    Class141_Sub1(Class185_Sub3 class185_sub3, Class181 class181,
		  Class173 class173, int i, boolean bool, int[][] is) {
	super(class185_sub3, 34067, class181, class173, i * i * 6, bool);
	anInt8917 = i;
	aClass185_Sub3_1626.method15231(this);
	if (bool) {
	    for (int i_0_ = 0; i_0_ < 6; i_0_++)
		method2372(34069 + i_0_,
			   Class185_Sub3.method15257(aClass181_1629,
						     aClass173_1630),
			   i, i, 32993, aClass185_Sub3_1626.anInt9620,
			   is[i_0_]);
	} else {
	    for (int i_1_ = 0; i_1_ < 6; i_1_++)
		OpenGL.glTexImage2Di(34069 + i_1_, 0,
				     Class185_Sub3.method15257(aClass181_1629,
							       aClass173_1630),
				     i, i, 0, 32993,
				     aClass185_Sub3_1626.anInt9620, is[i_1_],
				     0);
	}
	method2382(true);
    }
    
    Class141_Sub1(Class185_Sub3 class185_sub3, Class181 class181,
		  Class173 class173, int i, boolean bool, byte[][] is,
		  Class181 class181_2_) {
	super(class185_sub3, 34067, class181, class173, i * i * 6, bool);
	anInt8917 = i;
	aClass185_Sub3_1626.method15231(this);
	for (int i_3_ = 0; i_3_ < 6; i_3_++)
	    OpenGL.glTexImage2Dub(34069 + i_3_, 0,
				  Class185_Sub3.method15257(aClass181_1629,
							    aClass173_1630),
				  i, i, 0,
				  Class185_Sub3.method15256(class181_2_), 5121,
				  is[i_3_], 0);
	method2382(true);
    }
    
    Class141_Sub1(Class185_Sub3 class185_sub3, Class181 class181,
		  Class173 class173, int i) {
	super(class185_sub3, 34067, class181, class173, i * i * 6, false);
	anInt8917 = i;
	aClass185_Sub3_1626.method15231(this);
	for (int i_4_ = 0; i_4_ < 6; i_4_++)
	    OpenGL.glTexImage2Dub(34069 + i_4_, 0,
				  Class185_Sub3.method15257(aClass181_1629,
							    aClass173_1630),
				  i, i, 0,
				  Class185_Sub3.method15256(aClass181_1629),
				  5121, null, 0);
	method2382(true);
    }
    
    Interface22 method14444(int i, int i_5_) {
	return new Class123(this, i, i_5_);
    }
    
    Interface22 method14445(int i, int i_6_) {
	return new Class123(this, i, i_6_);
    }
}
