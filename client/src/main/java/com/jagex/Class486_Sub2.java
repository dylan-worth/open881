/* Class486_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class486_Sub2 extends Class486 implements Interface41
{
    static final int anInt10174 = 34069;
    
    Class486_Sub2(Class185_Sub1_Sub2 class185_sub1_sub2, int i, boolean bool,
		  int[][] is) {
	super(class185_sub1_sub2, 34067, Class181.aClass181_1952,
	      Class173.aClass173_1830, i * i * 6, bool);
	for (int i_0_ = 0; i_0_ < 6; i_0_++) {
	    for (int i_1_ = 0; i_1_ < is[i_0_].length; i_1_++) {
		int i_2_ = is[i_0_][i_1_];
		is[i_0_][i_1_] = (~0xff00ff & i_2_ | (i_2_ & 0xff) << 16
				  | i_2_ >> 16 & 0xff);
	    }
	}
	aClass185_Sub1_Sub2_5295.method14669(this);
	if (bool) {
	    for (int i_3_ = 0; i_3_ < 6; i_3_++)
		method7964(34069 + i_3_, i, i, is[i_3_]);
	} else {
	    for (int i_4_ = 0; i_4_ < 6; i_4_++)
		OpenGL.glTexImage2Di
		    (34069 + i_4_, 0,
		     Class185_Sub1_Sub2.method18075(aClass181_5292,
						    aClass173_5291),
		     i, i, 0, Class185_Sub1_Sub2.method18097(aClass181_5292),
		     aClass185_Sub1_Sub2_5295.anInt11590, is[i_4_], 0);
	}
    }
    
    public void method333() {
	super.method333();
    }
    
    public void method338(Class372 class372) {
	super.method339(class372);
    }
    
    public void method142() {
	super.method142();
    }
    
    public void method143() {
	super.method142();
    }
    
    public void method141() {
	super.method142();
    }
    
    public void method144() {
	super.method142();
    }
    
    public void method335() {
	super.method333();
    }
    
    public void method332() {
	super.method333();
    }
    
    public void method339(Class372 class372) {
	super.method339(class372);
    }
    
    public void method334() {
	super.method333();
    }
    
    public void method336() {
	super.method333();
    }
    
    public void method337(Class372 class372) {
	super.method339(class372);
    }
}
