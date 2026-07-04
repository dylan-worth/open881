/* Class136_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class136_Sub9 extends Class136
{
    static float[] aFloatArray8979 = new float[4];
    static final char aChar8980 = '\001';
    Class125 aClass125_8981;
    Class124 aClass124_8982;
    static final char aChar8983 = '\0';
    
    boolean method2333() {
	return true;
    }
    
    boolean method2347() {
	return true;
    }
    
    void method2328(boolean bool) {
	aClass125_8981.method2184('\0');
	if (aClass124_8982.aBool1496) {
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600
		.method15231(aClass124_8982.aClass141_Sub4_1493);
	    aClass185_Sub3_1600.method15230(0);
	}
    }
    
    void method2343(Class141 class141, int i) {
	aClass185_Sub3_1600.method15231(class141);
	aClass185_Sub3_1600.method15214(i);
    }
    
    void method2327() {
	aClass125_8981.method2184('\001');
	aClass185_Sub3_1600.method15230(1);
	aClass185_Sub3_1600.method15231(null);
	aClass185_Sub3_1600.method15230(0);
    }
    
    void method2332(boolean bool) {
	/* empty */
    }
    
    void method2335(boolean bool) {
	aClass125_8981.method2184('\0');
	if (aClass124_8982.aBool1496) {
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600
		.method15231(aClass124_8982.aClass141_Sub4_1493);
	    aClass185_Sub3_1600.method15230(0);
	}
    }
    
    void method2330(int i, int i_0_) {
	float f = -5.0E-4F * (float) ((i & 0x3) + 1);
	float f_1_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
	float f_2_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = (i & 0x80) != 0;
	aClass185_Sub3_1600.method15230(1);
	if (bool) {
	    aFloatArray8979[0] = f_2_;
	    aFloatArray8979[1] = 0.0F;
	    aFloatArray8979[2] = 0.0F;
	    aFloatArray8979[3] = 0.0F;
	} else {
	    aFloatArray8979[0] = 0.0F;
	    aFloatArray8979[1] = 0.0F;
	    aFloatArray8979[2] = f_2_;
	    aFloatArray8979[3] = 0.0F;
	}
	OpenGL.glTexGenfv(8192, 9474, aFloatArray8979, 0);
	aFloatArray8979[0] = 0.0F;
	aFloatArray8979[1] = f_2_;
	aFloatArray8979[2] = 0.0F;
	aFloatArray8979[3] = (float) aClass185_Sub3_1600.anInt9696 * f % 1.0F;
	OpenGL.glTexGenfv(8193, 9474, aFloatArray8979, 0);
	if (!aClass124_8982.aBool1496) {
	    int i_3_
		= (int) (f_1_ * (float) aClass185_Sub3_1600.anInt9696 * 16.0F);
	    aClass185_Sub3_1600.method15231(aClass124_8982
					    .aClass141_Sub2Array1497
					    [i_3_ % 16]);
	} else {
	    aFloatArray8979[0] = 0.0F;
	    aFloatArray8979[1] = 0.0F;
	    aFloatArray8979[2] = 0.0F;
	    aFloatArray8979[3]
		= (float) aClass185_Sub3_1600.anInt9696 * f_1_ % 1.0F;
	    OpenGL.glTexGenfv(8194, 9473, aFloatArray8979, 0);
	}
	aClass185_Sub3_1600.method15230(0);
    }
    
    boolean method2342() {
	return true;
    }
    
    void method2339(boolean bool) {
	/* empty */
    }
    
    boolean method2334() {
	return true;
    }
    
    void method2326() {
	aClass125_8981.method2184('\001');
	aClass185_Sub3_1600.method15230(1);
	aClass185_Sub3_1600.method15231(null);
	aClass185_Sub3_1600.method15230(0);
    }
    
    void method2344(boolean bool) {
	aClass125_8981.method2184('\0');
	if (aClass124_8982.aBool1496) {
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600
		.method15231(aClass124_8982.aClass141_Sub4_1493);
	    aClass185_Sub3_1600.method15230(0);
	}
    }
    
    void method2337(boolean bool) {
	aClass125_8981.method2184('\0');
	if (aClass124_8982.aBool1496) {
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600
		.method15231(aClass124_8982.aClass141_Sub4_1493);
	    aClass185_Sub3_1600.method15230(0);
	}
    }
    
    void method2338(boolean bool) {
	aClass125_8981.method2184('\0');
	if (aClass124_8982.aBool1496) {
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600
		.method15231(aClass124_8982.aClass141_Sub4_1493);
	    aClass185_Sub3_1600.method15230(0);
	}
    }
    
    void method2340(boolean bool) {
	/* empty */
    }
    
    void method2336(boolean bool) {
	/* empty */
    }
    
    Class136_Sub9(Class185_Sub3 class185_sub3, Class124 class124) {
	super(class185_sub3);
	aClass124_8982 = class124;
	aClass125_8981 = new Class125(class185_sub3, 2);
	aClass125_8981.method2185(0);
	aClass185_Sub3_1600.method15230(1);
	if (aClass124_8982.aBool1496) {
	    OpenGL.glTexGeni(8194, 9472, 9217);
	    OpenGL.glEnable(3170);
	}
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glTexGeni(8193, 9472, 9216);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	aClass185_Sub3_1600.method15230(0);
	aClass125_8981.method2186();
	aClass125_8981.method2185(1);
	aClass185_Sub3_1600.method15230(1);
	if (aClass124_8982.aBool1496)
	    OpenGL.glDisable(3170);
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	aClass185_Sub3_1600.method15230(0);
	aClass125_8981.method2186();
    }
    
    void method2341() {
	aClass125_8981.method2184('\001');
	aClass185_Sub3_1600.method15230(1);
	aClass185_Sub3_1600.method15231(null);
	aClass185_Sub3_1600.method15230(0);
    }
    
    void method2329(boolean bool) {
	/* empty */
    }
    
    void method2345() {
	aClass125_8981.method2184('\001');
	aClass185_Sub3_1600.method15230(1);
	aClass185_Sub3_1600.method15231(null);
	aClass185_Sub3_1600.method15230(0);
    }
    
    void method2346(int i, int i_4_) {
	float f = -5.0E-4F * (float) ((i & 0x3) + 1);
	float f_5_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
	float f_6_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = (i & 0x80) != 0;
	aClass185_Sub3_1600.method15230(1);
	if (bool) {
	    aFloatArray8979[0] = f_6_;
	    aFloatArray8979[1] = 0.0F;
	    aFloatArray8979[2] = 0.0F;
	    aFloatArray8979[3] = 0.0F;
	} else {
	    aFloatArray8979[0] = 0.0F;
	    aFloatArray8979[1] = 0.0F;
	    aFloatArray8979[2] = f_6_;
	    aFloatArray8979[3] = 0.0F;
	}
	OpenGL.glTexGenfv(8192, 9474, aFloatArray8979, 0);
	aFloatArray8979[0] = 0.0F;
	aFloatArray8979[1] = f_6_;
	aFloatArray8979[2] = 0.0F;
	aFloatArray8979[3] = (float) aClass185_Sub3_1600.anInt9696 * f % 1.0F;
	OpenGL.glTexGenfv(8193, 9474, aFloatArray8979, 0);
	if (!aClass124_8982.aBool1496) {
	    int i_7_
		= (int) (f_5_ * (float) aClass185_Sub3_1600.anInt9696 * 16.0F);
	    aClass185_Sub3_1600.method15231(aClass124_8982
					    .aClass141_Sub2Array1497
					    [i_7_ % 16]);
	} else {
	    aFloatArray8979[0] = 0.0F;
	    aFloatArray8979[1] = 0.0F;
	    aFloatArray8979[2] = 0.0F;
	    aFloatArray8979[3]
		= (float) aClass185_Sub3_1600.anInt9696 * f_5_ % 1.0F;
	    OpenGL.glTexGenfv(8194, 9473, aFloatArray8979, 0);
	}
	aClass185_Sub3_1600.method15230(0);
    }
    
    void method2331(int i, int i_8_) {
	float f = -5.0E-4F * (float) ((i & 0x3) + 1);
	float f_9_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
	float f_10_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = (i & 0x80) != 0;
	aClass185_Sub3_1600.method15230(1);
	if (bool) {
	    aFloatArray8979[0] = f_10_;
	    aFloatArray8979[1] = 0.0F;
	    aFloatArray8979[2] = 0.0F;
	    aFloatArray8979[3] = 0.0F;
	} else {
	    aFloatArray8979[0] = 0.0F;
	    aFloatArray8979[1] = 0.0F;
	    aFloatArray8979[2] = f_10_;
	    aFloatArray8979[3] = 0.0F;
	}
	OpenGL.glTexGenfv(8192, 9474, aFloatArray8979, 0);
	aFloatArray8979[0] = 0.0F;
	aFloatArray8979[1] = f_10_;
	aFloatArray8979[2] = 0.0F;
	aFloatArray8979[3] = (float) aClass185_Sub3_1600.anInt9696 * f % 1.0F;
	OpenGL.glTexGenfv(8193, 9474, aFloatArray8979, 0);
	if (!aClass124_8982.aBool1496) {
	    int i_11_
		= (int) (f_9_ * (float) aClass185_Sub3_1600.anInt9696 * 16.0F);
	    aClass185_Sub3_1600.method15231(aClass124_8982
					    .aClass141_Sub2Array1497
					    [i_11_ % 16]);
	} else {
	    aFloatArray8979[0] = 0.0F;
	    aFloatArray8979[1] = 0.0F;
	    aFloatArray8979[2] = 0.0F;
	    aFloatArray8979[3]
		= (float) aClass185_Sub3_1600.anInt9696 * f_9_ % 1.0F;
	    OpenGL.glTexGenfv(8194, 9473, aFloatArray8979, 0);
	}
	aClass185_Sub3_1600.method15230(0);
    }
    
    void method2348(Class141 class141, int i) {
	aClass185_Sub3_1600.method15231(class141);
	aClass185_Sub3_1600.method15214(i);
    }
}
