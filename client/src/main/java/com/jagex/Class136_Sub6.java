/* Class136_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class136_Sub6 extends Class136
{
    Class141_Sub1[] aClass141_Sub1Array8956;
    static final int anInt8957 = 128;
    static final int anInt8958 = 128;
    static final int anInt8959 = 24;
    static final int anInt8960 = 5;
    static final char aChar8961 = '\001';
    static final float aFloat8962 = 0.0F;
    static final char aChar8963 = '\0';
    static final float aFloat8964 = 26.0F;
    Class125 aClass125_8965;
    static final float aFloat8966 = -12.0F;
    boolean aBool8967 = false;
    boolean aBool8968;
    
    void method2328(boolean bool) {
	if (aClass125_8965 != null && bool) {
	    if (!aBool8968) {
		aClass185_Sub3_1600.method15230(2);
		aClass185_Sub3_1600
		    .method15231(aClass185_Sub3_1600.aClass141_Sub2_9528);
		aClass185_Sub3_1600.method15230(0);
	    }
	    aClass125_8965.method2184('\0');
	    aBool8967 = true;
	} else
	    aClass185_Sub3_1600.method15239(0, 34168, 770);
    }
    
    Class136_Sub6(Class185_Sub3 class185_sub3) {
	super(class185_sub3);
	if (class185_sub3.aBool9694) {
	    byte[][] is = new byte[6][16384];
	    byte[][] is_0_ = new byte[6][16384];
	    byte[][] is_1_ = new byte[6][16384];
	    int i = 0;
	    Class438 class438 = new Class438(0.0F, -1.0F, 0.0F);
	    for (int i_2_ = 0; i_2_ < 128; i_2_++) {
		for (int i_3_ = 0; i_3_ < 128; i_3_++) {
		    float f = 2.0F * (float) i_3_ / 128.0F - 1.0F;
		    float f_4_ = 2.0F * (float) i_2_ / 128.0F - 1.0F;
		    float f_5_
			= (float) (1.0 / Math.sqrt((double) (f * f + 1.0F
							     + f_4_ * f_4_)));
		    f *= f_5_;
		    f_4_ *= f_5_;
		    for (int i_6_ = 0; i_6_ < 6; i_6_++) {
			Class438 class438_7_;
			if (i_6_ == 0)
			    class438_7_ = new Class438(-f_5_, -f, f_4_);
			else if (i_6_ == 1)
			    class438_7_ = new Class438(f_5_, f, f_4_);
			else if (i_6_ == 2)
			    class438_7_ = new Class438(-f, f_4_, -f_5_);
			else if (i_6_ == 3)
			    class438_7_ = new Class438(-f, -f_4_, f_5_);
			else if (i_6_ == 4)
			    class438_7_ = new Class438(f, f_5_, -f_4_);
			else
			    class438_7_ = new Class438(f, -f_5_, f_4_);
			float f_8_ = class438_7_.method7008(class438);
			f_8_ = Math.max(0.0F, Math.min(1.0F, f_8_));
			int i_9_;
			int i_10_;
			int i_11_;
			if (f_8_ > 0.0F) {
			    i_11_
				= Math.min(255, (int) (Math.pow((double) f_8_,
								128.0)
						       * 400.0));
			    i_10_
				= Math.min(255,
					   (int) (Math.pow((double) f_8_, 24.0)
						  * 400.0));
			    i_9_ = Math.min(255,
					    (int) (Math.pow((double) f_8_, 5.0)
						   * 400.0));
			} else {
			    i_9_ = 0;
			    i_10_ = 0;
			    i_11_ = 0;
			}
			is_0_[i_6_][i] = (byte) i_11_;
			is_1_[i_6_][i] = (byte) i_10_;
			is[i_6_][i] = (byte) i_9_;
		    }
		    i++;
		}
	    }
	    aClass141_Sub1Array8956 = new Class141_Sub1[3];
	    aClass141_Sub1Array8956[0]
		= new Class141_Sub1(aClass185_Sub3_1600,
				    Class181.aClass181_1951,
				    Class173.aClass173_1830, 128, false, is_0_,
				    Class181.aClass181_1951);
	    aClass141_Sub1Array8956[1]
		= new Class141_Sub1(aClass185_Sub3_1600,
				    Class181.aClass181_1951,
				    Class173.aClass173_1830, 128, false, is_1_,
				    Class181.aClass181_1951);
	    aClass141_Sub1Array8956[2]
		= new Class141_Sub1(aClass185_Sub3_1600,
				    Class181.aClass181_1951,
				    Class173.aClass173_1830, 128, false, is,
				    Class181.aClass181_1951);
	    method14484();
	}
    }
    
    void method14484() {
	aClass125_8965 = new Class125(aClass185_Sub3_1600, 2);
	aClass125_8965.method2185(0);
	aClass185_Sub3_1600.method15230(1);
	OpenGL.glTexGeni(8192, 9472, 34065);
	OpenGL.glTexGeni(8193, 9472, 34065);
	OpenGL.glTexGeni(8194, 9472, 34065);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	OpenGL.glEnable(3170);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glRotatef(26.0F, 1.0F, 0.0F, 0.0F);
	OpenGL.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
	OpenGL.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
	OpenGL.glMatrixMode(5888);
	if (!aBool8968) {
	    aClass185_Sub3_1600.method15232(7681, 8448);
	    aClass185_Sub3_1600.method15325(0, 34168, 768);
	    aClass185_Sub3_1600.method15230(2);
	    aClass185_Sub3_1600.method15232(260, 7681);
	    aClass185_Sub3_1600.method15325(0, 34168, 768);
	    aClass185_Sub3_1600.method15325(1, 34168, 770);
	    aClass185_Sub3_1600.method15239(0, 34167, 770);
	} else {
	    aClass185_Sub3_1600.method15232(260, 7681);
	    aClass185_Sub3_1600.method15325(0, 5890, 770);
	    aClass185_Sub3_1600.method15239(0, 34167, 770);
	}
	aClass185_Sub3_1600.method15230(0);
	aClass125_8965.method2186();
	aClass125_8965.method2185(1);
	aClass185_Sub3_1600.method15230(1);
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	OpenGL.glDisable(3170);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
	if (!aBool8968) {
	    aClass185_Sub3_1600.method15232(8448, 8448);
	    aClass185_Sub3_1600.method15325(0, 5890, 768);
	    aClass185_Sub3_1600.method15230(2);
	    aClass185_Sub3_1600.method15232(8448, 8448);
	    aClass185_Sub3_1600.method15325(0, 5890, 768);
	    aClass185_Sub3_1600.method15325(1, 34168, 768);
	    aClass185_Sub3_1600.method15239(0, 5890, 770);
	} else {
	    aClass185_Sub3_1600.method15232(8448, 8448);
	    aClass185_Sub3_1600.method15325(0, 5890, 768);
	    aClass185_Sub3_1600.method15239(0, 5890, 770);
	}
	aClass185_Sub3_1600.method15230(0);
	aClass125_8965.method2186();
    }
    
    void method2346(int i, int i_12_) {
	if (aBool8967) {
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(aClass141_Sub1Array8956[i - 1]);
	    aClass185_Sub3_1600.method15230(0);
	}
    }
    
    void method2329(boolean bool) {
	aClass185_Sub3_1600.method15232(8448, 7681);
    }
    
    void method2327() {
	if (aBool8967) {
	    if (!aBool8968) {
		aClass185_Sub3_1600.method15230(2);
		aClass185_Sub3_1600.method15231(null);
	    }
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(null);
	    aClass185_Sub3_1600.method15230(0);
	    aClass125_8965.method2184('\001');
	    aBool8967 = false;
	} else
	    aClass185_Sub3_1600.method15239(0, 5890, 770);
	aClass185_Sub3_1600.method15232(8448, 8448);
    }
    
    boolean method2347() {
	return true;
    }
    
    void method2343(Class141 class141, int i) {
	aClass185_Sub3_1600.method15231(class141);
	aClass185_Sub3_1600.method15214(i);
    }
    
    boolean method2342() {
	return true;
    }
    
    boolean method2333() {
	return true;
    }
    
    boolean method2334() {
	return true;
    }
    
    void method2337(boolean bool) {
	if (aClass125_8965 != null && bool) {
	    if (!aBool8968) {
		aClass185_Sub3_1600.method15230(2);
		aClass185_Sub3_1600
		    .method15231(aClass185_Sub3_1600.aClass141_Sub2_9528);
		aClass185_Sub3_1600.method15230(0);
	    }
	    aClass125_8965.method2184('\0');
	    aBool8967 = true;
	} else
	    aClass185_Sub3_1600.method15239(0, 34168, 770);
    }
    
    void method2344(boolean bool) {
	if (aClass125_8965 != null && bool) {
	    if (!aBool8968) {
		aClass185_Sub3_1600.method15230(2);
		aClass185_Sub3_1600
		    .method15231(aClass185_Sub3_1600.aClass141_Sub2_9528);
		aClass185_Sub3_1600.method15230(0);
	    }
	    aClass125_8965.method2184('\0');
	    aBool8967 = true;
	} else
	    aClass185_Sub3_1600.method15239(0, 34168, 770);
    }
    
    void method2335(boolean bool) {
	if (aClass125_8965 != null && bool) {
	    if (!aBool8968) {
		aClass185_Sub3_1600.method15230(2);
		aClass185_Sub3_1600
		    .method15231(aClass185_Sub3_1600.aClass141_Sub2_9528);
		aClass185_Sub3_1600.method15230(0);
	    }
	    aClass125_8965.method2184('\0');
	    aBool8967 = true;
	} else
	    aClass185_Sub3_1600.method15239(0, 34168, 770);
    }
    
    void method2338(boolean bool) {
	if (aClass125_8965 != null && bool) {
	    if (!aBool8968) {
		aClass185_Sub3_1600.method15230(2);
		aClass185_Sub3_1600
		    .method15231(aClass185_Sub3_1600.aClass141_Sub2_9528);
		aClass185_Sub3_1600.method15230(0);
	    }
	    aClass125_8965.method2184('\0');
	    aBool8967 = true;
	} else
	    aClass185_Sub3_1600.method15239(0, 34168, 770);
    }
    
    void method14485() {
	aClass125_8965 = new Class125(aClass185_Sub3_1600, 2);
	aClass125_8965.method2185(0);
	aClass185_Sub3_1600.method15230(1);
	OpenGL.glTexGeni(8192, 9472, 34065);
	OpenGL.glTexGeni(8193, 9472, 34065);
	OpenGL.glTexGeni(8194, 9472, 34065);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	OpenGL.glEnable(3170);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glRotatef(26.0F, 1.0F, 0.0F, 0.0F);
	OpenGL.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
	OpenGL.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
	OpenGL.glMatrixMode(5888);
	if (!aBool8968) {
	    aClass185_Sub3_1600.method15232(7681, 8448);
	    aClass185_Sub3_1600.method15325(0, 34168, 768);
	    aClass185_Sub3_1600.method15230(2);
	    aClass185_Sub3_1600.method15232(260, 7681);
	    aClass185_Sub3_1600.method15325(0, 34168, 768);
	    aClass185_Sub3_1600.method15325(1, 34168, 770);
	    aClass185_Sub3_1600.method15239(0, 34167, 770);
	} else {
	    aClass185_Sub3_1600.method15232(260, 7681);
	    aClass185_Sub3_1600.method15325(0, 5890, 770);
	    aClass185_Sub3_1600.method15239(0, 34167, 770);
	}
	aClass185_Sub3_1600.method15230(0);
	aClass125_8965.method2186();
	aClass125_8965.method2185(1);
	aClass185_Sub3_1600.method15230(1);
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	OpenGL.glDisable(3170);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
	if (!aBool8968) {
	    aClass185_Sub3_1600.method15232(8448, 8448);
	    aClass185_Sub3_1600.method15325(0, 5890, 768);
	    aClass185_Sub3_1600.method15230(2);
	    aClass185_Sub3_1600.method15232(8448, 8448);
	    aClass185_Sub3_1600.method15325(0, 5890, 768);
	    aClass185_Sub3_1600.method15325(1, 34168, 768);
	    aClass185_Sub3_1600.method15239(0, 5890, 770);
	} else {
	    aClass185_Sub3_1600.method15232(8448, 8448);
	    aClass185_Sub3_1600.method15325(0, 5890, 768);
	    aClass185_Sub3_1600.method15239(0, 5890, 770);
	}
	aClass185_Sub3_1600.method15230(0);
	aClass125_8965.method2186();
    }
    
    void method2340(boolean bool) {
	aClass185_Sub3_1600.method15232(8448, 7681);
    }
    
    void method2336(boolean bool) {
	aClass185_Sub3_1600.method15232(8448, 7681);
    }
    
    void method2332(boolean bool) {
	aClass185_Sub3_1600.method15232(8448, 7681);
    }
    
    void method2345() {
	if (aBool8967) {
	    if (!aBool8968) {
		aClass185_Sub3_1600.method15230(2);
		aClass185_Sub3_1600.method15231(null);
	    }
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(null);
	    aClass185_Sub3_1600.method15230(0);
	    aClass125_8965.method2184('\001');
	    aBool8967 = false;
	} else
	    aClass185_Sub3_1600.method15239(0, 5890, 770);
	aClass185_Sub3_1600.method15232(8448, 8448);
    }
    
    void method2326() {
	if (aBool8967) {
	    if (!aBool8968) {
		aClass185_Sub3_1600.method15230(2);
		aClass185_Sub3_1600.method15231(null);
	    }
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(null);
	    aClass185_Sub3_1600.method15230(0);
	    aClass125_8965.method2184('\001');
	    aBool8967 = false;
	} else
	    aClass185_Sub3_1600.method15239(0, 5890, 770);
	aClass185_Sub3_1600.method15232(8448, 8448);
    }
    
    void method2339(boolean bool) {
	aClass185_Sub3_1600.method15232(8448, 7681);
    }
    
    void method2331(int i, int i_13_) {
	if (aBool8967) {
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(aClass141_Sub1Array8956[i - 1]);
	    aClass185_Sub3_1600.method15230(0);
	}
    }
    
    void method2330(int i, int i_14_) {
	if (aBool8967) {
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(aClass141_Sub1Array8956[i - 1]);
	    aClass185_Sub3_1600.method15230(0);
	}
    }
    
    void method2348(Class141 class141, int i) {
	aClass185_Sub3_1600.method15231(class141);
	aClass185_Sub3_1600.method15214(i);
    }
    
    void method2341() {
	if (aBool8967) {
	    if (!aBool8968) {
		aClass185_Sub3_1600.method15230(2);
		aClass185_Sub3_1600.method15231(null);
	    }
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(null);
	    aClass185_Sub3_1600.method15230(0);
	    aClass125_8965.method2184('\001');
	    aBool8967 = false;
	} else
	    aClass185_Sub3_1600.method15239(0, 5890, 770);
	aClass185_Sub3_1600.method15232(8448, 8448);
    }
}
