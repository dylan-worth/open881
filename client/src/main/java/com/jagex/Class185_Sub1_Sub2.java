/* Class185_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;

import jaclib.memory.Stream;

import jaggl.MapBuffer;
import jaggl.OpenGL;

public final class Class185_Sub1_Sub2 extends Class185_Sub1
{
    int anInt11566;
    Class700 aClass700_11567 = new Class700();
    int[] anIntArray11568;
    Class700 aClass700_11569;
    boolean aBool11570;
    Class163 aClass163_11571;
    Class700 aClass700_11572;
    Class700 aClass700_11573;
    long aLong11574;
    boolean aBool11575;
    int[] anIntArray11576;
    boolean aBool11577;
    Class700 aClass700_11578 = new Class700();
    int anInt11579;
    Class476_Sub2[] aClass476_Sub2Array11580;
    Class163 aClass163_11581;
    Class700 aClass700_11582;
    Class278_Sub1 aClass278_Sub1_11583;
    boolean aBool11584;
    String aString11585;
    String aString11586;
    Class476_Sub1 aClass476_Sub1_11587;
    boolean aBool11588;
    boolean aBool11589;
    int anInt11590;
    boolean aBool11591;
    boolean aBool11592;
    boolean aBool11593;
    boolean aBool11594;
    boolean aBool11595;
    boolean aBool11596;
    boolean aBool11597;
    float[] aFloatArray11598;
    float[] aFloatArray11599;
    static final int anInt11600 = 3;
    int[] anIntArray11601;
    Class700 aClass700_11602;
    Class175_Sub1 aClass175_Sub1_11603;
    int[] anIntArray11604;
    long[] aLongArray11605;
    int anInt11606;
    int anInt11607;
    OpenGL anOpenGL11608;
    
    final Interface37 method14938(boolean bool) {
	return new Class476_Sub2(this, bool);
    }
    
    public Class269 method14589(String string) {
	byte[] is = method18084(string);
	if (is == null)
	    return null;
	Class261 class261 = method14591(is);
	return new Class269_Sub1(this, class261);
    }
    
    public boolean method14653() {
	return aBool11591;
    }
    
    final void method14689(int i, Class373 class373, boolean bool) {
	OpenGL.glTexEnvi(8960, 34184 + i, method18066(class373));
	OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
    }
    
    byte[] method18062(String string) {
	return method14840("gl", string);
    }
    
    public void method3268() {
	if (aClass175_1989 != null) {
	    int i = aClass175_1989.method2910();
	    int i_0_ = aClass175_1989.method2911();
	    if (i > 0 || i_0_ > 0) {
		int i_1_ = anInt9184;
		int i_2_ = anInt9185;
		int i_3_ = anInt9186;
		int i_4_ = anInt9210;
		method3281();
		int i_5_ = anInt9178;
		int i_6_ = anInt9179;
		int i_7_ = anInt9176;
		int i_8_ = anInt9177;
		method3537();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		method14634();
		method14694(false);
		method14648(false);
		method14803(false);
		method14603(false);
		method14669(null);
		method14671(1);
		method14687(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, i, i_0_, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		method3373(i_5_, i_7_, i_6_, i_8_);
		method3318(i_1_, i_2_, i_3_, i_4_);
	    }
	}
    }
    
    void method14650(int i) {
	OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0,
			   (i & 0x8) != 0);
    }
    
    public Class176 method3232() {
	int i = -1;
	if (aString11585.indexOf("nvidia") != -1)
	    i = 4318;
	else if (aString11585.indexOf("intel") != -1)
	    i = 32902;
	else if (aString11585.indexOf("ati") != -1)
	    i = 4098;
	return new Class176(i, method14585() ? "OpenGL FF" : "OpenGL",
			    anInt11606, aString11586, 0L, method14585());
    }
    
    void method3234(int i, int i_9_) throws Exception_Sub7 {
	aClass175_Sub2_2013.method15475();
	if (anInterface25_1997 != null)
	    anInterface25_1997.method33(-1174186051);
    }
    
    public void method3575() {
	OpenGL.glFinish();
    }
    
    public void method14794(Class349 class349) {
	Class381[] class381s = class349.aClass381Array3592;
	int i = 0;
	boolean bool = false;
	boolean bool_10_ = false;
	boolean bool_11_ = false;
	for (int i_12_ = 0; i_12_ < class381s.length; i_12_++) {
	    Class381 class381 = class381s[i_12_];
	    Class476_Sub2 class476_sub2 = aClass476_Sub2Array11580[i_12_];
	    int i_13_ = 0;
	    int i_14_ = class476_sub2.method15876();
	    long l = class476_sub2.method7776();
	    class476_sub2.method7768();
	    for (int i_15_ = 0; i_15_ < class381.method6434(); i_15_++) {
		Class350 class350 = class381.method6441(i_15_);
		switch (class350.anInt3605) {
		case 0:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(1, 5126, i_14_, l + (long) i_13_);
		    break;
		case 8:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(2, 5126, i_14_, l + (long) i_13_);
		    break;
		default:
		    break;
		case 2:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(3, 5126, i_14_, l + (long) i_13_);
		    break;
		case 3:
		    OpenGL.glColorPointer(4, 5121, i_14_, l + (long) i_13_);
		    bool = true;
		    break;
		case 6:
		    OpenGL.glVertexPointer(3, 5126, i_14_, l + (long) i_13_);
		    bool_11_ = true;
		    break;
		case 11:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(4, 5126, i_14_, l + (long) i_13_);
		    break;
		case 1:
		    OpenGL.glNormalPointer(5126, i_14_, l + (long) i_13_);
		    bool_10_ = true;
		}
		i_13_ += class350.anInt3608;
	    }
	}
	if (aBool11595 != bool_11_) {
	    if (bool_11_)
		OpenGL.glEnableClientState(32884);
	    else
		OpenGL.glDisableClientState(32884);
	    aBool11595 = bool_11_;
	}
	if (aBool11575 != bool_10_) {
	    if (bool_10_)
		OpenGL.glEnableClientState(32885);
	    else
		OpenGL.glDisableClientState(32885);
	    aBool11575 = bool_10_;
	}
	if (aBool11577 != bool) {
	    if (bool)
		OpenGL.glEnableClientState(32886);
	    else
		OpenGL.glDisableClientState(32886);
	    aBool11577 = bool;
	}
	if (anInt11566 < i) {
	    for (int i_16_ = anInt11566; i_16_ < i; i_16_++) {
		OpenGL.glClientActiveTexture(33984 + i_16_);
		OpenGL.glEnableClientState(32888);
	    }
	    anInt11566 = i;
	} else if (anInt11566 > i) {
	    for (int i_17_ = i; i_17_ < anInt11566; i_17_++) {
		OpenGL.glClientActiveTexture(33984 + i_17_);
		OpenGL.glDisableClientState(32888);
	    }
	    anInt11566 = i;
	}
    }
    
    public float method14715() {
	return 0.0F;
    }
    
    Class175_Sub2 method3262(Canvas canvas, int i, int i_18_) {
	return new Class175_Sub2_Sub3_Sub2(this, canvas);
    }
    
    public Class175_Sub1 method3263() {
	return new Class175_Sub1_Sub1_Sub2(this);
    }
    
    public Interface22 method3678(int i, int i_19_, Class181 class181,
				  Class173 class173, int i_20_) {
	return new Class506(this, class181, class173, i, i_19_, i_20_);
    }
    
    final Interface39 method14971(boolean bool) {
	return new Class476_Sub1(this, Class173.aClass173_1829, bool);
    }
    
    public Interface21 method3266(int i, int i_21_, int i_22_) {
	return new Class506(this, Class181.aClass181_1956,
			    Class173.aClass173_1828, i, i_21_, i_22_);
    }
    
    public int[] method3267(int i, int i_23_, int i_24_, int i_25_) {
	int[] is = new int[i_24_ * i_25_];
	int i_26_ = aClass175_1989.method2911();
	for (int i_27_ = 0; i_27_ < i_25_; i_27_++)
	    OpenGL.glReadPixelsi(i, i_26_ - i_23_ - i_27_ - 1, i_24_, 1, 32993,
				 anInt11590, is, i_27_ * i_24_);
	return is;
    }
    
    void method14929() {
	if (aBool9131)
	    OpenGL.glEnable(3008);
	else
	    OpenGL.glDisable(3008);
	OpenGL.glAlphaFunc(516, (float) (aByte9261 & 0xff) / 255.0F);
	if (anInt9263 > 1) {
	    if (aByte9261 != 0)
		OpenGL.glEnable(32926);
	    else
		OpenGL.glDisable(32926);
	}
    }
    
    final void method14709(Interface39 interface39, Class374 class374, int i,
			   int i_28_, int i_29_, int i_30_) {
	int i_31_;
	int i_32_;
	if (class374 == Class374.aClass374_3901) {
	    i_31_ = 1;
	    i_32_ = i_30_ * 2;
	} else if (class374 == Class374.aClass374_3896) {
	    i_31_ = 3;
	    i_32_ = i_30_ + 1;
	} else if (class374 == Class374.aClass374_3898) {
	    i_31_ = 4;
	    i_32_ = i_30_ * 3;
	} else if (class374 == Class374.aClass374_3895) {
	    i_31_ = 6;
	    i_32_ = i_30_ + 2;
	} else if (class374 == Class374.aClass374_3900) {
	    i_31_ = 5;
	    i_32_ = i_30_ + 2;
	} else {
	    i_31_ = 0;
	    i_32_ = i_30_;
	}
	Class173 class173 = interface39.method276();
	Class476_Sub1 class476_sub1 = (Class476_Sub1) interface39;
	class476_sub1.method7768();
	OpenGL.glDrawElements(i_31_, i_32_, method18074(class173),
			      (class476_sub1.method7776()
			       + (long) (i_29_ * (class173.anInt1825
						  * 1899960707))));
    }
    
    Interface38 method14726(int i, int i_33_, boolean bool, int[] is,
			    int i_34_, int i_35_) {
	return new Class486_Sub3(this, i, i_33_, bool, is, i_34_, i_35_);
    }
    
    public final synchronized void method3661(int i) {
	try {
	    method18076();
	} catch (Exception exception) {
	    return;
	}
	int i_36_ = 0;
	i &= 0x7fffffff;
	while (!aClass700_11578.method14142(-884975272)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11578.method14132((byte) -80);
	    anIntArray11568[i_36_++]
		= (int) (class534_sub39.aLong7158 * 8258869577519436579L);
	    anInt9136 -= class534_sub39.anInt10807 * -705967177;
	    if (i_36_ == 1000) {
		OpenGL.glDeleteBuffersARB(i_36_, anIntArray11568, 0);
		i_36_ = 0;
	    }
	}
	if (i_36_ > 0) {
	    OpenGL.glDeleteBuffersARB(i_36_, anIntArray11568, 0);
	    i_36_ = 0;
	}
	while (!aClass700_11569.method14142(-852210020)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11569.method14132((byte) -30);
	    anIntArray11568[i_36_++]
		= (int) (class534_sub39.aLong7158 * 8258869577519436579L);
	    anInt9135 -= class534_sub39.anInt10807 * -705967177;
	    if (i_36_ == 1000) {
		OpenGL.glDeleteTextures(i_36_, anIntArray11568, 0);
		i_36_ = 0;
	    }
	}
	if (i_36_ > 0) {
	    OpenGL.glDeleteTextures(i_36_, anIntArray11568, 0);
	    i_36_ = 0;
	}
	while (!aClass700_11602.method14142(-903597539)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11602.method14132((byte) -61);
	    anIntArray11568[i_36_++] = class534_sub39.anInt10807 * -705967177;
	    if (i_36_ == 1000) {
		OpenGL.glDeleteFramebuffersEXT(i_36_, anIntArray11568, 0);
		i_36_ = 0;
	    }
	}
	if (i_36_ > 0) {
	    OpenGL.glDeleteFramebuffersEXT(i_36_, anIntArray11568, 0);
	    i_36_ = 0;
	}
	while (!aClass700_11582.method14142(-682933533)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11582.method14132((byte) -39);
	    anIntArray11568[i_36_++]
		= (int) (class534_sub39.aLong7158 * 8258869577519436579L);
	    anInt9137 -= class534_sub39.anInt10807 * -705967177;
	    if (i_36_ == 1000) {
		OpenGL.glDeleteRenderbuffersEXT(i_36_, anIntArray11568, 0);
		i_36_ = 0;
	    }
	}
	if (i_36_ > 0) {
	    OpenGL.glDeleteRenderbuffersEXT(i_36_, anIntArray11568, 0);
	    boolean bool = false;
	}
	while (!aClass700_11567.method14142(81469462)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11567.method14132((byte) -67);
	    OpenGL.glDeleteLists((int) (class534_sub39.aLong7158
					* 8258869577519436579L),
				 class534_sub39.anInt10807 * -705967177);
	}
	while (!aClass700_11572.method14142(1748972515)) {
	    Class534 class534 = aClass700_11572.method14132((byte) -8);
	    OpenGL.glDeleteProgram((int) (class534.aLong7158
					  * 8258869577519436579L));
	}
	while (!aClass700_11573.method14142(802361764)) {
	    Class534 class534 = aClass700_11573.method14132((byte) -93);
	    OpenGL.glDeleteShader((int) (class534.aLong7158
					 * 8258869577519436579L));
	}
	while (!aClass700_11567.method14142(-1940878665)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11567.method14132((byte) -88);
	    OpenGL.glDeleteLists((int) (class534_sub39.aLong7158
					* 8258869577519436579L),
				 class534_sub39.anInt10807 * -705967177);
	}
	if (method3239() > 100663296
	    && Class250.method4604((byte) -3) > aLong11574 + 60000L) {
	    System.gc();
	    aLong11574 = Class250.method4604((byte) -17);
	}
	super.method3661(i);
    }
    
    Class349 method14939(Class381[] class381s) {
	return new Class349_Sub2(class381s);
    }
    
    public int method3273() {
	if (aBool11596) {
	    if (aLongArray11605[anInt11607] == 0L)
		return -1;
	    int i = OpenGL.glClientWaitSync(aLongArray11605[anInt11607], 0, 0);
	    if (i == 37149) {
		method3656();
		return -1;
	    }
	    return i != 37147 ? anIntArray11604[anInt11607] : -1;
	}
	return -1;
    }
    
    public void method3275(int i, int i_37_, int i_38_) {
	method3559();
	if (aClass175_Sub1_11603 == null)
	    method18064(i_37_, i_38_);
	if (aClass163_11581 == null)
	    aClass163_11581 = method3319(0, 0, aClass175_1989.method2910(),
					 aClass175_1989.method2911(), false);
	else
	    aClass163_11581.method2717(0, 0, aClass175_1989.method2910(),
				       aClass175_1989.method2911(), 0, 0);
	method3260(aClass175_Sub1_11603, -314428864);
	method3340(1, -16777216);
	aClass163_11581.method2659(anInt2018 * -1555714981,
				   anInt2019 * -385311879,
				   anInt2020 * 1769547157,
				   anInt2021 * -740019615);
	OpenGL.glBindBufferARB(35051, anIntArray11576[anInt11579]);
	OpenGL.glReadPixelsub(0, 0, anInt2016 * 1104963955,
			      anInt2017 * 1827315157, 32993, 5121, null, 0);
	OpenGL.glBindBufferARB(35051, 0);
	method3261(aClass175_Sub1_11603, -11578496);
	aLongArray11605[anInt11579] = OpenGL.glFenceSync(37143, 0);
	anIntArray11604[anInt11579] = i;
	if (++anInt11579 >= 3)
	    anInt11579 = 0;
	method3446();
    }
    
    public void method3656() {
	for (int i = 0; i < 3; i++) {
	    if (aLongArray11605[i] != 0L) {
		OpenGL.glDeleteSync(aLongArray11605[i]);
		aLongArray11605[i] = 0L;
	    }
	}
	anInt11579 = 0;
	anInt11607 = 0;
    }
    
    public long method3355(int i, int i_39_) {
	return method18063(i, i_39_, null, null);
    }
    
    public void method3278(int i, int i_40_, int[] is, int[] is_41_) {
	method18063(i, i_40_, is, is_41_);
    }
    
    long method18063(int i, int i_42_, int[] is, int[] is_43_) {
	if (aBool11596) {
	    if (aLongArray11605[anInt11607] != 0L) {
		OpenGL.glDeleteSync(aLongArray11605[anInt11607]);
		aLongArray11605[anInt11607] = 0L;
	    }
	    OpenGL.glBindBufferARB(35051, anIntArray11576[anInt11607]);
	    long l = OpenGL.glMapBufferARB(35051, 35000);
	    if (is != null) {
		for (int i_44_ = 0; i_44_ < i * i_42_; i_44_++)
		    is[i_44_] = anUnsafe9127.getInt(l + (long) (i_44_ * 4));
		if (OpenGL.glUnmapBufferARB(35051)) {
		    /* empty */
		}
		OpenGL.glBindBufferARB(35051, 0);
		l = 0L;
	    }
	    if (++anInt11607 >= 3)
		anInt11607 = 0;
	    return l;
	}
	if (aClass163_11571 == null)
	    method18064(i, i_42_);
	if (aClass163_11581 == null)
	    aClass163_11581 = method3319(0, 0, aClass175_1989.method2910(),
					 aClass175_1989.method2911(), false);
	else
	    aClass163_11581.method2717(0, 0, aClass175_1989.method2910(),
				       aClass175_1989.method2911(), 0, 0);
	method3260(aClass175_Sub1_11603, -476229871);
	method3340(1, -16777216);
	aClass163_11581.method2659(anInt2018 * -1555714981,
				   anInt2019 * -385311879,
				   anInt2020 * 1769547157,
				   anInt2021 * -740019615);
	aClass163_11571.method2653(0, 0, i, i_42_, is, is_43_, 0, i);
	method3261(aClass175_Sub1_11603, -11578496);
	return 0L;
    }
    
    void method14928() {
	if (aBool9131)
	    OpenGL.glEnable(3008);
	else
	    OpenGL.glDisable(3008);
	OpenGL.glAlphaFunc(516, (float) (aByte9261 & 0xff) / 255.0F);
	if (anInt9263 > 1) {
	    if (aByte9261 != 0)
		OpenGL.glEnable(32926);
	    else
		OpenGL.glDisable(32926);
	}
    }
    
    public void method3280() {
	if (aBool11596) {
	    aClass163_11581 = null;
	    if (aClass175_Sub1_11603 != null) {
		aClass175_Sub1_11603.method142();
		aClass175_Sub1_11603 = null;
	    }
	    OpenGL.glDeleteBuffersARB(3, anIntArray11576, 0);
	    for (int i = 0; i < 3; i++) {
		anIntArray11576[i] = 0;
		if (aLongArray11605[i] != 0L) {
		    OpenGL.glDeleteSync(aLongArray11605[i]);
		    aLongArray11605[i] = 0L;
		}
	    }
	} else {
	    aClass175_Sub1_11603 = null;
	    aClass163_11571 = null;
	    aClass163_11581 = null;
	}
	anInt11579 = 0;
	anInt11607 = 0;
    }
    
    void method18064(int i, int i_45_) {
	method3280();
	method3616(i, i_45_, -878518628);
	if (aBool11596) {
	    aClass163_11571 = method3315(i, i_45_, false, true);
	    aClass175_Sub1_11603 = method3263();
	    aClass175_Sub1_11603.method15075(0, aClass163_11571.method2651());
	    OpenGL.glGenBuffersARB(3, anIntArray11576, 0);
	    for (int i_46_ = 0; i_46_ < 3; i_46_++) {
		OpenGL.glBindBufferARB(35051, anIntArray11576[i_46_]);
		OpenGL.glBufferDataARBa(35051, i * i_45_ * 4, 0L, 35041);
		OpenGL.glBindBufferARB(35051, 0);
	    }
	} else {
	    aClass163_11571 = method3315(i, i_45_, false, true);
	    aClass175_Sub1_11603 = method3263();
	    aClass175_Sub1_11603.method15075(0, aClass163_11571.method2651());
	}
    }
    
    void method14883() {
	OpenGL.glTexEnvi(8960, 34162,
			 method18065(aClass378Array9117[anInt9215]));
    }
    
    public void method3340(int i, int i_47_) {
	int i_48_ = 0;
	if ((i & 0x1) != 0) {
	    OpenGL.glClearColor((float) (i_47_ & 0xff0000) / 1.671168E7F,
				(float) (i_47_ & 0xff00) / 65280.0F,
				(float) (i_47_ & 0xff) / 255.0F,
				(float) (i_47_ >>> 24) / 255.0F);
	    i_48_ = 16384;
	}
	if ((i & 0x2) != 0) {
	    method14603(true);
	    i_48_ |= 0x100;
	}
	if ((i & 0x4) != 0)
	    i_48_ |= 0x400;
	OpenGL.glClear(i_48_);
    }
    
    void method14620() {
	if (aClass175_1989 != null)
	    OpenGL.glViewport(anInt9113 + anInt9184,
			      (anInt9189 + aClass175_1989.method2911()
			       - anInt9185 - anInt9210),
			      anInt9186, anInt9210);
	OpenGL.glDepthRange(aFloat9152, aFloat9157);
    }
    
    void method14621() {
	if (aClass175_1989 != null) {
	    int i = anInt9113 + anInt9178;
	    int i_49_ = anInt9189 + aClass175_1989.method2911() - anInt9177;
	    int i_50_ = anInt9179 - anInt9178;
	    int i_51_ = anInt9177 - anInt9176;
	    if (i_50_ < 0)
		i_50_ = 0;
	    if (i_51_ < 0)
		i_51_ = 0;
	    OpenGL.glScissor(i, i_49_, i_50_, i_51_);
	}
    }
    
    void method14622() {
	if (aBool9294)
	    OpenGL.glEnable(3089);
	else
	    OpenGL.glDisable(3089);
    }
    
    Class349 method14941(Class381[] class381s) {
	return new Class349_Sub2(class381s);
    }
    
    void method14930() {
	if (aBool9161) {
	    int i = 0;
	    int i_52_ = 0;
	    if (anInt9238 == 0) {
		i = 0;
		i_52_ = 0;
	    } else if (anInt9238 == 1) {
		i = 1;
		i_52_ = 0;
	    } else if (anInt9238 == 2) {
		i = 1;
		i_52_ = 1;
	    } else if (anInt9238 == 3) {
		i = 0;
		i_52_ = 1;
	    }
	    if (aClass370_9258 == Class370.aClass370_3873)
		OpenGL.glBlendFuncSeparate(770, 771, i, i_52_);
	    else if (aClass370_9258 == Class370.aClass370_3870)
		OpenGL.glBlendFuncSeparate(1, 1, i, i_52_);
	    else if (aClass370_9258 == Class370.aClass370_3872)
		OpenGL.glBlendFuncSeparate(774, 1, i, i_52_);
	    else if (aClass370_9258 == Class370.aClass370_3871)
		OpenGL.glBlendFuncSeparate(1, 0, i, i_52_);
	} else if (aClass370_9258 == Class370.aClass370_3873) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(770, 771);
	} else if (aClass370_9258 == Class370.aClass370_3870) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(1, 1);
	} else if (aClass370_9258 == Class370.aClass370_3872) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(774, 1);
	} else
	    OpenGL.glDisable(3042);
    }
    
    void method14643() {
	if (aBool9248 && aBool9193)
	    OpenGL.glEnable(2929);
	else
	    OpenGL.glDisable(2929);
    }
    
    Interface35 method14963(Class181 class181, int i, int i_53_, int i_54_,
			    boolean bool, byte[] is) {
	return new Class486_Sub1(this, class181, i, i_53_, i_54_, bool, is);
    }
    
    void method14716() {
	OpenGL.glMatrixMode(5890);
	if (aClass364Array9218[anInt9215] != Class364.aClass364_3725)
	    OpenGL.glLoadMatrixf(aClass433Array9217[anInt9215]
				     .method6938(aFloatArray11599),
				 0);
	else
	    OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    void method14724() {
	aFloatArray11598[0] = aFloat9205 * aFloat9159;
	aFloatArray11598[1] = aFloat9205 * aFloat9292;
	aFloatArray11598[2] = aFloat9205 * aFloat9163;
	aFloatArray11598[3] = 1.0F;
	OpenGL.glLightModelfv(2899, aFloatArray11598, 0);
    }
    
    void method14654() {
	aFloatArray11598[0] = aFloat9206 * aFloat9159;
	aFloatArray11598[1] = aFloat9206 * aFloat9292;
	aFloatArray11598[2] = aFloat9206 * aFloat9163;
	aFloatArray11598[3] = 1.0F;
	OpenGL.glLightfv(16384, 4609, aFloatArray11598, 0);
	aFloatArray11598[0] = -aFloat9267 * aFloat9159;
	aFloatArray11598[1] = -aFloat9267 * aFloat9292;
	aFloatArray11598[2] = -aFloat9267 * aFloat9163;
	aFloatArray11598[3] = 1.0F;
	OpenGL.glLightfv(16385, 4609, aFloatArray11598, 0);
    }
    
    public void method14894(Class433 class433, Class433 class433_55_,
			    Class433 class433_56_) {
	OpenGL.glMatrixMode(5888);
	aClass433_9194.method6844(class433, class433_55_);
	OpenGL.glLoadMatrixf(aClass433_9194.aFloatArray4853, 0);
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadMatrixf(class433_56_.aFloatArray4853, 0);
    }
    
    void method14655() {
	if (aBool9195) {
	    OpenGL.glEnable(16384);
	    OpenGL.glEnable(16385);
	} else {
	    OpenGL.glDisable(16384);
	    OpenGL.glDisable(16385);
	}
    }
    
    void method14783() {
	/* empty */
    }
    
    public Interface21 method3624(int i, int i_57_) {
	return new Class506(this, Class181.aClass181_1956,
			    Class173.aClass173_1828, i, i_57_);
    }
    
    public boolean method3270() {
	if (aBool11596 && aLongArray11605[anInt11579] != 0L)
	    return false;
	return true;
    }
    
    boolean method14770(Class181 class181, Class173 class173) {
	return aBool9276;
    }
    
    Class185_Sub1_Sub2(OpenGL opengl, Canvas canvas, long l, Class177 class177,
		       Interface25 interface25, Interface45 interface45,
		       Interface48 interface48, Interface46 interface46,
		       Class472 class472, int i) {
	super(class177, interface25, interface45, interface48, interface46,
	      class472, i, 1);
	aClass700_11569 = new Class700();
	aClass700_11602 = new Class700();
	aClass700_11582 = new Class700();
	aClass700_11572 = new Class700();
	aClass700_11573 = new Class700();
	anIntArray11568 = new int[1000];
	aClass476_Sub2Array11580 = new Class476_Sub2[16];
	new MapBuffer();
	new MapBuffer();
	aFloatArray11598 = new float[4];
	aFloatArray11599 = new float[16];
	aClass163_11581 = null;
	aClass163_11571 = null;
	aClass175_Sub1_11603 = null;
	anIntArray11576 = new int[3];
	aLongArray11605 = new long[3];
	anIntArray11604 = new int[3];
	anInt11607 = 0;
	anInt11579 = 0;
	int[] is = new int[1];
	try {
	    anOpenGL11608 = opengl;
	    anOpenGL11608.method1767();
	    aString11585 = OpenGL.glGetString(7936).toLowerCase();
	    aString11586 = OpenGL.glGetString(7937).toLowerCase();
	    if (aString11585.indexOf("microsoft") != -1
		|| aString11585.indexOf("brian paul") != -1
		|| aString11585.indexOf("mesa") != -1)
		throw new RuntimeException("");
	    String string = OpenGL.glGetString(7938);
	    String[] strings = Class387.method6504(string.replace('.', ' '),
						   ' ', -672943393);
	    if (strings.length >= 2) {
		try {
		    int i_58_ = Class684.method13949(strings[0], (byte) 20);
		    int i_59_ = Class684.method13949(strings[1], (byte) 122);
		    anInt11606 = i_58_ * 10 + i_59_;
		} catch (NumberFormatException numberformatexception) {
		    throw new RuntimeException("");
		}
	    } else
		throw new RuntimeException("");
	    if (anInt11606 < 12)
		throw new RuntimeException("");
	    OpenGL.glGetIntegerv(34018, is, 0);
	    anInt9269 = is[0];
	    if (anInt9269 < 2)
		throw new RuntimeException("");
	    anInt9270 = 8;
	    aBool11592
		= anOpenGL11608.method1766("GL_ARB_vertex_buffer_object");
	    aBool9260 = anOpenGL11608.method1766("GL_ARB_multisample");
	    aBool9161 = anOpenGL11608.method1766("GL_EXT_blend_func_separate");
	    aBool11589 = anOpenGL11608.method1766("GL_ARB_texture_rectangle");
	    aBool9275 = anOpenGL11608.method1766("GL_ARB_texture_cube_map");
	    aBool11588
		= anOpenGL11608.method1766("GL_ARB_texture_non_power_of_two");
	    aBool9276 = true;
	    aBool11591 = anOpenGL11608.method1766("GL_ARB_vertex_shader");
	    aBool11570 = anOpenGL11608.method1766("GL_ARB_vertex_program");
	    aBool11593 = anOpenGL11608.method1766("GL_ARB_fragment_shader");
	    aBool11594 = anOpenGL11608.method1766("GL_ARB_fragment_program");
	    aBool9271 = anOpenGL11608.method1766("GL_EXT_framebuffer_object");
	    aBool9277 = aBool9271;
	    aBool9272 = anOpenGL11608.method1766("GL_EXT_framebuffer_blit");
	    aBool9273
		= anOpenGL11608.method1766("GL_EXT_framebuffer_multisample");
	    aBool11596 = (anUnsafe9127 != null
			  && (anInt11606 >= 32
			      || anOpenGL11608.method1766("GL_ARB_sync")));
	    anIntArray11601 = new int[anInt9269];
	    if (!method14653() || !method14747()) {
		if (!anOpenGL11608.method1766("GL_ARB_multitexture"))
		    throw new RuntimeException("");
		if (!anOpenGL11608.method1766("GL_ARB_texture_env_combine"))
		    throw new RuntimeException("");
	    }
	    Class503.aString5626.startsWith("mac");
	    anInt11590 = Stream.method1807() ? 33639 : 5121;
	    if (aString11586.indexOf("radeon") != -1
		|| aString11585.indexOf("intel") != -1) {
		int i_60_ = 0;
		boolean bool = aString11585.indexOf("intel") != -1;
		boolean bool_61_ = false;
		boolean bool_62_ = false;
		String[] strings_63_
		    = Class387.method6504(aString11586.replace('/', ' '), ' ',
					  -2112708707);
		for (int i_64_ = 0; i_64_ < strings_63_.length; i_64_++) {
		    String string_65_ = strings_63_[i_64_];
		    try {
			if (string_65_.length() <= 0)
			    continue;
			if (string_65_.charAt(0) == 'x'
			    && string_65_.length() >= 3
			    && Class545.method8965(string_65_.substring(1, 3),
						   -1436099607)) {
			    string_65_ = string_65_.substring(1);
			    bool_62_ = true;
			}
			if (string_65_.equals("hd")) {
			    bool_61_ = true;
			    continue;
			}
			if (string_65_.startsWith("hd")) {
			    string_65_ = string_65_.substring(2);
			    bool_61_ = true;
			}
			if (string_65_.length() < 4
			    || !Class545.method8965(string_65_.substring(0, 4),
						    675439884))
			    continue;
			i_60_
			    = Class684.method13949(string_65_.substring(0, 4),
						   (byte) 16);
		    } catch (Exception exception) {
			continue;
		    }
		    break;
		}
		if (bool) {
		    if (!bool_61_)
			aBool9271 = false;
		} else {
		    if (!bool_62_ && !bool_61_) {
			if (i_60_ >= 7000 && i_60_ <= 7999)
			    aBool11592 = false;
			if (i_60_ >= 7000 && i_60_ <= 9250)
			    aBool9276 = false;
		    }
		    aBool11589
			&= anOpenGL11608.method1766("GL_ARB_half_float_pixel");
		    aBool11584 = true;
		}
	    }
	    if (aBool11592) {
		try {
		    int[] is_66_ = new int[1];
		    OpenGL.glGenBuffersARB(1, is_66_, 0);
		} catch (Throwable throwable) {
		    throw new RuntimeException("");
		}
	    } else
		throw new RuntimeException("");
	    method3256(canvas, new Class175_Sub2_Sub3_Sub2(this, canvas, l),
		       (byte) 4);
	    method3258(canvas, -1194855201);
	    method14872(32768, false);
	    method14872(32768, false);
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    method3236(-568376843);
	    if (throwable instanceof OutOfMemoryError)
		throw (OutOfMemoryError) throwable;
	    throw new RuntimeException("");
	}
    }
    
    Interface38 method14772(int i, int i_67_, boolean bool, int[] is,
			    int i_68_, int i_69_) {
	return new Class486_Sub3(this, i, i_67_, bool, is, i_68_, i_69_);
    }
    
    Interface38 method14662(Class181 class181, int i, int i_70_, boolean bool,
			    byte[] is, int i_71_, int i_72_) {
	return new Class486_Sub3(this, class181, i, i_70_, bool, is, i_71_,
				 i_72_);
    }
    
    Interface38 method14663(Class181 class181, int i, int i_73_, boolean bool,
			    float[] fs, int i_74_, int i_75_) {
	return new Class486_Sub3(this, class181, i, i_73_, bool, fs, i_74_,
				 i_75_);
    }
    
    Interface44 method14666(Class181 class181, Class173 class173, int i,
			    int i_76_) {
	return new Class486_Sub3(this, class181, class173, i, i_76_);
    }
    
    Interface41 method14665(int i, boolean bool, int[][] is) {
	return new Class486_Sub2(this, i, bool, is);
    }
    
    void method14853() {
	OpenGL.glDepthMask(aBool9190 && aBool9191);
    }
    
    public void method14670() {
	int i = anIntArray11601[anInt9215];
	if (i != 0) {
	    anIntArray11601[anInt9215] = 0;
	    OpenGL.glBindTexture(i, 0);
	    OpenGL.glDisable(i);
	}
    }
    
    void method14839() {
	OpenGL.glMatrixMode(5890);
	if (aClass364Array9218[anInt9215] != Class364.aClass364_3725)
	    OpenGL.glLoadMatrixf(aClass433Array9217[anInt9215]
				     .method6938(aFloatArray11599),
				 0);
	else
	    OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    void method14682() {
	OpenGL.glActiveTexture(33984 + anInt9215);
    }
    
    public String method3401() {
	String string = "Caps: 4:";
	String string_77_ = ":";
	string = new StringBuilder().append(string).append(anInt9263).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append(anInt11590).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append(anInt9269).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append(anInt9270).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11592 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9260 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11570 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11594 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11591 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11593 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9276 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11589 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9275 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11588 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9271 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9272 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9273 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9161 ? 1 : 0).append
		     (string_77_).toString();
	string = new StringBuilder().append(string).append
		     (OpenGL.glGetString(35724).toLowerCase()).toString();
	return string;
    }
    
    void method14644() {
	OpenGL.glDepthMask(aBool9190 && aBool9191);
    }
    
    public Interface21 method3627(int i, int i_78_, int i_79_) {
	return new Class506(this, Class181.aClass181_1956,
			    Class173.aClass173_1828, i, i_78_, i_79_);
    }
    
    final void method14801(int i, Class373 class373, boolean bool) {
	OpenGL.glTexEnvi(8960, 34184 + i, method18066(class373));
	OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
    }
    
    final void method14681() {
	aFloatArray11598[0] = (float) (anInt9221 & 0xff0000) / 1.671168E7F;
	aFloatArray11598[1] = (float) (anInt9221 & 0xff00) / 65280.0F;
	aFloatArray11598[2] = (float) (anInt9221 & 0xff) / 255.0F;
	aFloatArray11598[3] = (float) (anInt9221 >>> 24) / 255.0F;
	OpenGL.glTexEnvfv(8960, 8705, aFloatArray11598, 0);
    }
    
    static final int method18065(Class378 class378) {
	if (class378 == Class378.aClass378_3920)
	    return 7681;
	if (class378 == Class378.aClass378_3916)
	    return 8448;
	if (class378 == Class378.aClass378_3919)
	    return 34165;
	if (class378 == Class378.aClass378_3917)
	    return 260;
	if (class378 == Class378.aClass378_3915)
	    return 34023;
	throw new IllegalArgumentException();
    }
    
    static final int method18066(Class373 class373) {
	if (class373 == Class373.aClass373_3891)
	    return 5890;
	if (class373 == Class373.aClass373_3890)
	    return 34167;
	if (class373 == Class373.aClass373_3893)
	    return 34168;
	if (class373 == Class373.aClass373_3892)
	    return 34166;
	throw new IllegalArgumentException();
    }
    
    Interface41 method14885(int i, boolean bool, int[][] is) {
	return new Class486_Sub2(this, i, bool, is);
    }
    
    void method14691() {
	if (aBool9131)
	    OpenGL.glEnable(3008);
	else
	    OpenGL.glDisable(3008);
	OpenGL.glAlphaFunc(516, (float) (aByte9261 & 0xff) / 255.0F);
	if (anInt9263 > 1) {
	    if (aByte9261 != 0)
		OpenGL.glEnable(32926);
	    else
		OpenGL.glDisable(32926);
	}
    }
    
    void method14692() {
	if (aBool9161) {
	    int i = 0;
	    int i_80_ = 0;
	    if (anInt9238 == 0) {
		i = 0;
		i_80_ = 0;
	    } else if (anInt9238 == 1) {
		i = 1;
		i_80_ = 0;
	    } else if (anInt9238 == 2) {
		i = 1;
		i_80_ = 1;
	    } else if (anInt9238 == 3) {
		i = 0;
		i_80_ = 1;
	    }
	    if (aClass370_9258 == Class370.aClass370_3873)
		OpenGL.glBlendFuncSeparate(770, 771, i, i_80_);
	    else if (aClass370_9258 == Class370.aClass370_3870)
		OpenGL.glBlendFuncSeparate(1, 1, i, i_80_);
	    else if (aClass370_9258 == Class370.aClass370_3872)
		OpenGL.glBlendFuncSeparate(774, 1, i, i_80_);
	    else if (aClass370_9258 == Class370.aClass370_3871)
		OpenGL.glBlendFuncSeparate(1, 0, i, i_80_);
	} else if (aClass370_9258 == Class370.aClass370_3873) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(770, 771);
	} else if (aClass370_9258 == Class370.aClass370_3870) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(1, 1);
	} else if (aClass370_9258 == Class370.aClass370_3872) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(774, 1);
	} else
	    OpenGL.glDisable(3042);
    }
    
    final Interface37 method14698(boolean bool) {
	return new Class476_Sub2(this, bool);
    }
    
    void method14933() {
	if (aBool9250 && aBool9249 && anInt9252 >= 0)
	    OpenGL.glEnable(2912);
	else
	    OpenGL.glDisable(2912);
    }
    
    void method14722() {
	if (aBool9250 && aBool9249 && anInt9252 >= 0)
	    OpenGL.glEnable(2912);
	else
	    OpenGL.glDisable(2912);
    }
    
    void method14752() {
	aFloat9255 = aFloat9175 - (float) anInt9188;
	aFloat9254 = aFloat9255 - (float) anInt9252;
	if (aFloat9254 < aFloat9174)
	    aFloat9254 = aFloat9174;
	if (aBool9125) {
	    OpenGL.glFogf(2915, aFloat9254);
	    OpenGL.glFogf(2916, aFloat9255);
	    aFloatArray11598[0] = (float) (anInt9251 & 0xff0000) / 1.671168E7F;
	    aFloatArray11598[1] = (float) (anInt9251 & 0xff00) / 65280.0F;
	    aFloatArray11598[2] = (float) (anInt9251 & 0xff) / 255.0F;
	    OpenGL.glFogfv(2918, aFloatArray11598, 0);
	}
    }
    
    public boolean method14747() {
	return aBool11593;
    }
    
    public void method3245() {
	for (int i = 0; i < 3; i++) {
	    if (aLongArray11605[i] != 0L) {
		OpenGL.glDeleteSync(aLongArray11605[i]);
		aLongArray11605[i] = 0L;
	    }
	}
	anInt11579 = 0;
	anInt11607 = 0;
    }
    
    public boolean method14584(boolean bool) {
	return true;
    }
    
    Class349 method14699(Class381[] class381s) {
	return new Class349_Sub2(class381s);
    }
    
    public void method14733(int i, Interface37 interface37) {
	aClass476_Sub2Array11580[i] = (Class476_Sub2) interface37;
    }
    
    public void method3377() {
	OpenGL.glFinish();
    }
    
    public void method14700(Class349 class349) {
	Class381[] class381s = class349.aClass381Array3592;
	int i = 0;
	boolean bool = false;
	boolean bool_81_ = false;
	boolean bool_82_ = false;
	for (int i_83_ = 0; i_83_ < class381s.length; i_83_++) {
	    Class381 class381 = class381s[i_83_];
	    Class476_Sub2 class476_sub2 = aClass476_Sub2Array11580[i_83_];
	    int i_84_ = 0;
	    int i_85_ = class476_sub2.method15876();
	    long l = class476_sub2.method7776();
	    class476_sub2.method7768();
	    for (int i_86_ = 0; i_86_ < class381.method6434(); i_86_++) {
		Class350 class350 = class381.method6441(i_86_);
		switch (class350.anInt3605) {
		case 0:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(1, 5126, i_85_, l + (long) i_84_);
		    break;
		case 8:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(2, 5126, i_85_, l + (long) i_84_);
		    break;
		default:
		    break;
		case 2:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(3, 5126, i_85_, l + (long) i_84_);
		    break;
		case 3:
		    OpenGL.glColorPointer(4, 5121, i_85_, l + (long) i_84_);
		    bool = true;
		    break;
		case 6:
		    OpenGL.glVertexPointer(3, 5126, i_85_, l + (long) i_84_);
		    bool_82_ = true;
		    break;
		case 11:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(4, 5126, i_85_, l + (long) i_84_);
		    break;
		case 1:
		    OpenGL.glNormalPointer(5126, i_85_, l + (long) i_84_);
		    bool_81_ = true;
		}
		i_84_ += class350.anInt3608;
	    }
	}
	if (aBool11595 != bool_82_) {
	    if (bool_82_)
		OpenGL.glEnableClientState(32884);
	    else
		OpenGL.glDisableClientState(32884);
	    aBool11595 = bool_82_;
	}
	if (aBool11575 != bool_81_) {
	    if (bool_81_)
		OpenGL.glEnableClientState(32885);
	    else
		OpenGL.glDisableClientState(32885);
	    aBool11575 = bool_81_;
	}
	if (aBool11577 != bool) {
	    if (bool)
		OpenGL.glEnableClientState(32886);
	    else
		OpenGL.glDisableClientState(32886);
	    aBool11577 = bool;
	}
	if (anInt11566 < i) {
	    for (int i_87_ = anInt11566; i_87_ < i; i_87_++) {
		OpenGL.glClientActiveTexture(33984 + i_87_);
		OpenGL.glEnableClientState(32888);
	    }
	    anInt11566 = i;
	} else if (anInt11566 > i) {
	    for (int i_88_ = i; i_88_ < anInt11566; i_88_++) {
		OpenGL.glClientActiveTexture(33984 + i_88_);
		OpenGL.glDisableClientState(32888);
	    }
	    anInt11566 = i;
	}
    }
    
    public final void method14708(Class374 class374, int i, int i_89_) {
	int i_90_;
	int i_91_;
	if (class374 == Class374.aClass374_3901) {
	    i_90_ = 1;
	    i_91_ = i_89_ * 2;
	} else if (class374 == Class374.aClass374_3896) {
	    i_90_ = 3;
	    i_91_ = i_89_ + 1;
	} else if (class374 == Class374.aClass374_3898) {
	    i_90_ = 4;
	    i_91_ = i_89_ * 3;
	} else if (class374 == Class374.aClass374_3895) {
	    i_90_ = 6;
	    i_91_ = i_89_ + 2;
	} else if (class374 == Class374.aClass374_3900) {
	    i_90_ = 5;
	    i_91_ = i_89_ + 2;
	} else {
	    i_90_ = 0;
	    i_91_ = i_89_;
	}
	OpenGL.glDrawArrays(i_90_, i, i_91_);
    }
    
    final synchronized void method18067(int i, int i_92_) {
	Class534_Sub39 class534_sub39 = new Class534_Sub39(i_92_);
	class534_sub39.aLong7158 = (long) i * 936217890172187787L;
	aClass700_11582.method14131(class534_sub39, (short) 789);
    }
    
    void method14917() {
	OpenGL.glActiveTexture(33984 + anInt9215);
    }
    
    final synchronized void method18068(long l) {
	Class534 class534 = new Class534();
	class534.aLong7158 = l * 936217890172187787L;
	aClass700_11573.method14131(class534, (short) 789);
    }
    
    final synchronized void method18069(int i, int i_93_) {
	Class534_Sub39 class534_sub39 = new Class534_Sub39(i_93_);
	class534_sub39.aLong7158 = (long) i * 936217890172187787L;
	aClass700_11578.method14131(class534_sub39, (short) 789);
    }
    
    final synchronized void method18070(int i, int i_94_) {
	Class534_Sub39 class534_sub39 = new Class534_Sub39(i_94_);
	class534_sub39.aLong7158 = (long) i * 936217890172187787L;
	aClass700_11569.method14131(class534_sub39, (short) 789);
    }
    
    final synchronized void method18071(int i) {
	Class534_Sub39 class534_sub39 = new Class534_Sub39(i);
	aClass700_11602.method14131(class534_sub39, (short) 789);
    }
    
    byte[] method18072(String string) {
	return method14840("gl", string);
    }
    
    Interface38 method14828(int i, int i_95_, boolean bool, int[] is,
			    int i_96_, int i_97_) {
	return new Class486_Sub3(this, i, i_95_, bool, is, i_96_, i_97_);
    }
    
    final synchronized void method18073(int i) {
	Class534 class534 = new Class534();
	class534.aLong7158 = (long) i * 936217890172187787L;
	aClass700_11572.method14131(class534, (short) 789);
    }
    
    static final int method18074(Class173 class173) {
	switch (class173.anInt1834 * -1414205941) {
	case 3:
	    return 5125;
	case 0:
	    return 5131;
	case 4:
	    return 5121;
	case 2:
	    return 5126;
	case 1:
	    return 5120;
	default:
	    return 5121;
	case 6:
	    return 5124;
	case 8:
	    return 5122;
	case 5:
	    return 5123;
	}
    }
    
    Interface38 method14880(Class181 class181, int i, int i_98_, boolean bool,
			    float[] fs, int i_99_, int i_100_) {
	return new Class486_Sub3(this, class181, i, i_98_, bool, fs, i_99_,
				 i_100_);
    }
    
    static int method18075(Class181 class181, Class173 class173) {
	if (class173 == Class173.aClass173_1830) {
	    switch (class181.anInt1953 * -939549997) {
	    default:
		throw new IllegalArgumentException();
	    case 6:
		return 6409;
	    case 7:
		return 33777;
	    case 0:
		return 6408;
	    case 2:
		return 33779;
	    case 1:
		return 6410;
	    case 8:
		return 6406;
	    case 4:
		return 6407;
	    }
	}
	if (class173 == Class173.aClass173_1829) {
	    switch (class181.anInt1953 * -939549997) {
	    case 1:
		return 36219;
	    case 6:
		return 32834;
	    case 0:
		return 32859;
	    default:
		throw new IllegalArgumentException();
	    case 4:
		return 32852;
	    case 3:
		return 33189;
	    case 8:
		return 32830;
	    }
	}
	if (class173 == Class173.aClass173_1828) {
	    switch (class181.anInt1953 * -939549997) {
	    default:
		throw new IllegalArgumentException();
	    case 3:
		return 33190;
	    }
	}
	if (class173 == Class173.aClass173_1831) {
	    switch (class181.anInt1953 * -939549997) {
	    default:
		throw new IllegalArgumentException();
	    case 3:
		return 33191;
	    }
	}
	if (class173 == Class173.aClass173_1832) {
	    switch (class181.anInt1953 * -939549997) {
	    case 4:
		return 34843;
	    case 6:
		return 34846;
	    case 8:
		return 34844;
	    case 0:
		return 34842;
	    default:
		throw new IllegalArgumentException();
	    case 1:
		return 34847;
	    }
	}
	if (class173 == Class173.aClass173_1826) {
	    switch (class181.anInt1953 * -939549997) {
	    case 6:
		return 34840;
	    case 4:
		return 34837;
	    case 1:
		return 34841;
	    case 0:
		return 34836;
	    default:
		throw new IllegalArgumentException();
	    case 8:
		return 34838;
	    }
	}
	throw new IllegalArgumentException();
    }
    
    public void method3371(boolean bool) {
	/* empty */
    }
    
    void method18076() {
	int i = 0;
	while (!anOpenGL11608.method1767()) {
	    if (i++ > 5)
		throw new RuntimeException("");
	    Class251.method4622(1000L);
	}
    }
    
    void method14642(int i) {
	if (!aBool11597)
	    OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
    }
    
    void method14686() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass433_9142.aFloatArray4853, 0);
	int i;
	for (i = 0; i < anInt9129; i++) {
	    Class534_Sub21 class534_sub21 = aClass534_Sub21Array9208[i];
	    int i_101_ = class534_sub21.method16201((byte) -43);
	    int i_102_ = 16386 + i;
	    float f = class534_sub21.method16202(-693604944) / 255.0F;
	    aFloatArray11598[0]
		= (float) class534_sub21.method16197(-352789879);
	    aFloatArray11598[1]
		= (float) class534_sub21.method16226(-2062287651);
	    aFloatArray11598[2]
		= (float) class534_sub21.method16199((byte) -118);
	    aFloatArray11598[3] = 1.0F;
	    OpenGL.glLightfv(i_102_, 4611, aFloatArray11598, 0);
	    aFloatArray11598[0] = (float) (i_101_ >> 16 & 0xff) * f;
	    aFloatArray11598[1] = (float) (i_101_ >> 8 & 0xff) * f;
	    aFloatArray11598[2] = (float) (i_101_ & 0xff) * f;
	    aFloatArray11598[3] = 1.0F;
	    OpenGL.glLightfv(i_102_, 4609, aFloatArray11598, 0);
	    OpenGL.glLightf(i_102_, 4617,
			    (1.0F
			     / (float) (class534_sub21.method16233(-820926424)
					* class534_sub21
					      .method16233(156269428))));
	    OpenGL.glEnable(i_102_);
	}
	for (/**/; i < anInt9209; i++)
	    OpenGL.glDisable(16386 + i);
    }
    
    Interface35 method14884(Class181 class181, int i, int i_103_, int i_104_,
			    boolean bool, byte[] is) {
	return new Class486_Sub1(this, class181, i, i_103_, i_104_, bool, is);
    }
    
    public Class176 method3670() {
	int i = -1;
	if (aString11585.indexOf("nvidia") != -1)
	    i = 4318;
	else if (aString11585.indexOf("intel") != -1)
	    i = 32902;
	else if (aString11585.indexOf("ati") != -1)
	    i = 4098;
	return new Class176(i, method14585() ? "OpenGL FF" : "OpenGL",
			    anInt11606, aString11586, 0L, method14585());
    }
    
    void method3375(int i, int i_105_) throws Exception_Sub7 {
	aClass175_Sub2_2013.method15475();
	if (anInterface25_1997 != null)
	    anInterface25_1997.method33(-1439505023);
    }
    
    void method3376(int i, int i_106_) throws Exception_Sub7 {
	aClass175_Sub2_2013.method15475();
	if (anInterface25_1997 != null)
	    anInterface25_1997.method33(-806695272);
    }
    
    void method14609() {
	if (aClass175_1989 != null) {
	    int i = anInt9113 + anInt9178;
	    int i_107_ = anInt9189 + aClass175_1989.method2911() - anInt9177;
	    int i_108_ = anInt9179 - anInt9178;
	    int i_109_ = anInt9177 - anInt9176;
	    if (i_108_ < 0)
		i_108_ = 0;
	    if (i_109_ < 0)
		i_109_ = 0;
	    OpenGL.glScissor(i, i_107_, i_108_, i_109_);
	}
    }
    
    public final synchronized void method3322(int i) {
	try {
	    method18076();
	} catch (Exception exception) {
	    return;
	}
	int i_110_ = 0;
	i &= 0x7fffffff;
	while (!aClass700_11578.method14142(-1470375219)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11578.method14132((byte) -1);
	    anIntArray11568[i_110_++]
		= (int) (class534_sub39.aLong7158 * 8258869577519436579L);
	    anInt9136 -= class534_sub39.anInt10807 * -705967177;
	    if (i_110_ == 1000) {
		OpenGL.glDeleteBuffersARB(i_110_, anIntArray11568, 0);
		i_110_ = 0;
	    }
	}
	if (i_110_ > 0) {
	    OpenGL.glDeleteBuffersARB(i_110_, anIntArray11568, 0);
	    i_110_ = 0;
	}
	while (!aClass700_11569.method14142(-1902893763)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11569.method14132((byte) -109);
	    anIntArray11568[i_110_++]
		= (int) (class534_sub39.aLong7158 * 8258869577519436579L);
	    anInt9135 -= class534_sub39.anInt10807 * -705967177;
	    if (i_110_ == 1000) {
		OpenGL.glDeleteTextures(i_110_, anIntArray11568, 0);
		i_110_ = 0;
	    }
	}
	if (i_110_ > 0) {
	    OpenGL.glDeleteTextures(i_110_, anIntArray11568, 0);
	    i_110_ = 0;
	}
	while (!aClass700_11602.method14142(34519507)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11602.method14132((byte) -92);
	    anIntArray11568[i_110_++] = class534_sub39.anInt10807 * -705967177;
	    if (i_110_ == 1000) {
		OpenGL.glDeleteFramebuffersEXT(i_110_, anIntArray11568, 0);
		i_110_ = 0;
	    }
	}
	if (i_110_ > 0) {
	    OpenGL.glDeleteFramebuffersEXT(i_110_, anIntArray11568, 0);
	    i_110_ = 0;
	}
	while (!aClass700_11582.method14142(283626969)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11582.method14132((byte) -19);
	    anIntArray11568[i_110_++]
		= (int) (class534_sub39.aLong7158 * 8258869577519436579L);
	    anInt9137 -= class534_sub39.anInt10807 * -705967177;
	    if (i_110_ == 1000) {
		OpenGL.glDeleteRenderbuffersEXT(i_110_, anIntArray11568, 0);
		i_110_ = 0;
	    }
	}
	if (i_110_ > 0) {
	    OpenGL.glDeleteRenderbuffersEXT(i_110_, anIntArray11568, 0);
	    boolean bool = false;
	}
	while (!aClass700_11567.method14142(-2043366980)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11567.method14132((byte) -24);
	    OpenGL.glDeleteLists((int) (class534_sub39.aLong7158
					* 8258869577519436579L),
				 class534_sub39.anInt10807 * -705967177);
	}
	while (!aClass700_11572.method14142(1502701679)) {
	    Class534 class534 = aClass700_11572.method14132((byte) -15);
	    OpenGL.glDeleteProgram((int) (class534.aLong7158
					  * 8258869577519436579L));
	}
	while (!aClass700_11573.method14142(-1181598712)) {
	    Class534 class534 = aClass700_11573.method14132((byte) -3);
	    OpenGL.glDeleteShader((int) (class534.aLong7158
					 * 8258869577519436579L));
	}
	while (!aClass700_11567.method14142(-1650192900)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11567.method14132((byte) -30);
	    OpenGL.glDeleteLists((int) (class534_sub39.aLong7158
					* 8258869577519436579L),
				 class534_sub39.anInt10807 * -705967177);
	}
	if (method3239() > 100663296
	    && Class250.method4604((byte) -90) > aLong11574 + 60000L) {
	    System.gc();
	    aLong11574 = Class250.method4604((byte) -82);
	}
	super.method3661(i);
    }
    
    public final synchronized void method3686(int i) {
	try {
	    method18076();
	} catch (Exception exception) {
	    return;
	}
	int i_111_ = 0;
	i &= 0x7fffffff;
	while (!aClass700_11578.method14142(-1739656604)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11578.method14132((byte) -57);
	    anIntArray11568[i_111_++]
		= (int) (class534_sub39.aLong7158 * 8258869577519436579L);
	    anInt9136 -= class534_sub39.anInt10807 * -705967177;
	    if (i_111_ == 1000) {
		OpenGL.glDeleteBuffersARB(i_111_, anIntArray11568, 0);
		i_111_ = 0;
	    }
	}
	if (i_111_ > 0) {
	    OpenGL.glDeleteBuffersARB(i_111_, anIntArray11568, 0);
	    i_111_ = 0;
	}
	while (!aClass700_11569.method14142(-2094544959)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11569.method14132((byte) -20);
	    anIntArray11568[i_111_++]
		= (int) (class534_sub39.aLong7158 * 8258869577519436579L);
	    anInt9135 -= class534_sub39.anInt10807 * -705967177;
	    if (i_111_ == 1000) {
		OpenGL.glDeleteTextures(i_111_, anIntArray11568, 0);
		i_111_ = 0;
	    }
	}
	if (i_111_ > 0) {
	    OpenGL.glDeleteTextures(i_111_, anIntArray11568, 0);
	    i_111_ = 0;
	}
	while (!aClass700_11602.method14142(1113584288)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11602.method14132((byte) -122);
	    anIntArray11568[i_111_++] = class534_sub39.anInt10807 * -705967177;
	    if (i_111_ == 1000) {
		OpenGL.glDeleteFramebuffersEXT(i_111_, anIntArray11568, 0);
		i_111_ = 0;
	    }
	}
	if (i_111_ > 0) {
	    OpenGL.glDeleteFramebuffersEXT(i_111_, anIntArray11568, 0);
	    i_111_ = 0;
	}
	while (!aClass700_11582.method14142(-597292618)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11582.method14132((byte) -116);
	    anIntArray11568[i_111_++]
		= (int) (class534_sub39.aLong7158 * 8258869577519436579L);
	    anInt9137 -= class534_sub39.anInt10807 * -705967177;
	    if (i_111_ == 1000) {
		OpenGL.glDeleteRenderbuffersEXT(i_111_, anIntArray11568, 0);
		i_111_ = 0;
	    }
	}
	if (i_111_ > 0) {
	    OpenGL.glDeleteRenderbuffersEXT(i_111_, anIntArray11568, 0);
	    boolean bool = false;
	}
	while (!aClass700_11567.method14142(-264903199)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11567.method14132((byte) -123);
	    OpenGL.glDeleteLists((int) (class534_sub39.aLong7158
					* 8258869577519436579L),
				 class534_sub39.anInt10807 * -705967177);
	}
	while (!aClass700_11572.method14142(1261574895)) {
	    Class534 class534 = aClass700_11572.method14132((byte) -20);
	    OpenGL.glDeleteProgram((int) (class534.aLong7158
					  * 8258869577519436579L));
	}
	while (!aClass700_11573.method14142(-1124079885)) {
	    Class534 class534 = aClass700_11573.method14132((byte) -104);
	    OpenGL.glDeleteShader((int) (class534.aLong7158
					 * 8258869577519436579L));
	}
	while (!aClass700_11567.method14142(-1436359786)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11567.method14132((byte) -24);
	    OpenGL.glDeleteLists((int) (class534_sub39.aLong7158
					* 8258869577519436579L),
				 class534_sub39.anInt10807 * -705967177);
	}
	if (method3239() > 100663296
	    && Class250.method4604((byte) -37) > aLong11574 + 60000L) {
	    System.gc();
	    aLong11574 = Class250.method4604((byte) -64);
	}
	super.method3661(i);
    }
    
    public void method14944(int i, Interface37 interface37) {
	aClass476_Sub2Array11580[i] = (Class476_Sub2) interface37;
    }
    
    public final synchronized void method3381(int i) {
	try {
	    method18076();
	} catch (Exception exception) {
	    return;
	}
	int i_112_ = 0;
	i &= 0x7fffffff;
	while (!aClass700_11578.method14142(251503411)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11578.method14132((byte) -116);
	    anIntArray11568[i_112_++]
		= (int) (class534_sub39.aLong7158 * 8258869577519436579L);
	    anInt9136 -= class534_sub39.anInt10807 * -705967177;
	    if (i_112_ == 1000) {
		OpenGL.glDeleteBuffersARB(i_112_, anIntArray11568, 0);
		i_112_ = 0;
	    }
	}
	if (i_112_ > 0) {
	    OpenGL.glDeleteBuffersARB(i_112_, anIntArray11568, 0);
	    i_112_ = 0;
	}
	while (!aClass700_11569.method14142(1242289062)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11569.method14132((byte) -47);
	    anIntArray11568[i_112_++]
		= (int) (class534_sub39.aLong7158 * 8258869577519436579L);
	    anInt9135 -= class534_sub39.anInt10807 * -705967177;
	    if (i_112_ == 1000) {
		OpenGL.glDeleteTextures(i_112_, anIntArray11568, 0);
		i_112_ = 0;
	    }
	}
	if (i_112_ > 0) {
	    OpenGL.glDeleteTextures(i_112_, anIntArray11568, 0);
	    i_112_ = 0;
	}
	while (!aClass700_11602.method14142(201452401)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11602.method14132((byte) -18);
	    anIntArray11568[i_112_++] = class534_sub39.anInt10807 * -705967177;
	    if (i_112_ == 1000) {
		OpenGL.glDeleteFramebuffersEXT(i_112_, anIntArray11568, 0);
		i_112_ = 0;
	    }
	}
	if (i_112_ > 0) {
	    OpenGL.glDeleteFramebuffersEXT(i_112_, anIntArray11568, 0);
	    i_112_ = 0;
	}
	while (!aClass700_11582.method14142(-120038256)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11582.method14132((byte) -112);
	    anIntArray11568[i_112_++]
		= (int) (class534_sub39.aLong7158 * 8258869577519436579L);
	    anInt9137 -= class534_sub39.anInt10807 * -705967177;
	    if (i_112_ == 1000) {
		OpenGL.glDeleteRenderbuffersEXT(i_112_, anIntArray11568, 0);
		i_112_ = 0;
	    }
	}
	if (i_112_ > 0) {
	    OpenGL.glDeleteRenderbuffersEXT(i_112_, anIntArray11568, 0);
	    boolean bool = false;
	}
	while (!aClass700_11567.method14142(-1404028210)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11567.method14132((byte) -106);
	    OpenGL.glDeleteLists((int) (class534_sub39.aLong7158
					* 8258869577519436579L),
				 class534_sub39.anInt10807 * -705967177);
	}
	while (!aClass700_11572.method14142(-1344167346)) {
	    Class534 class534 = aClass700_11572.method14132((byte) -19);
	    OpenGL.glDeleteProgram((int) (class534.aLong7158
					  * 8258869577519436579L));
	}
	while (!aClass700_11573.method14142(96567134)) {
	    Class534 class534 = aClass700_11573.method14132((byte) -84);
	    OpenGL.glDeleteShader((int) (class534.aLong7158
					 * 8258869577519436579L));
	}
	while (!aClass700_11567.method14142(-247666969)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11567.method14132((byte) -96);
	    OpenGL.glDeleteLists((int) (class534_sub39.aLong7158
					* 8258869577519436579L),
				 class534_sub39.anInt10807 * -705967177);
	}
	if (method3239() > 100663296
	    && Class250.method4604((byte) -57) > aLong11574 + 60000L) {
	    System.gc();
	    aLong11574 = Class250.method4604((byte) -73);
	}
	super.method3661(i);
    }
    
    public long method3586(int i, int i_113_) {
	return method18063(i, i_113_, null, null);
    }
    
    public String method3402() {
	String string = "Caps: 4:";
	String string_114_ = ":";
	string = new StringBuilder().append(string).append(anInt9263).append
		     (string_114_).toString();
	string = new StringBuilder().append(string).append(anInt11590).append
		     (string_114_).toString();
	string = new StringBuilder().append(string).append(anInt9269).append
		     (string_114_).toString();
	string = new StringBuilder().append(string).append(anInt9270).append
		     (string_114_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11592 ? 1 : 0).append
		     (string_114_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9260 ? 1 : 0).append
		     (string_114_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11570 ? 1 : 0).append
		     (string_114_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11594 ? 1 : 0).append
		     (string_114_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11591 ? 1 : 0).append
		     (string_114_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11593 ? 1 : 0).append
		     (string_114_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9276 ? 1 : 0).append
		     (string_114_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11589 ? 1 : 0).append
		     (string_114_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9275 ? 1 : 0).append
		     (string_114_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11588 ? 1 : 0).append
		     (string_114_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9271 ? 1 : 0).append
		     (string_114_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9272 ? 1 : 0).append
		     (string_114_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9273 ? 1 : 0).append
		     (string_114_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9161 ? 1 : 0).append
		     (string_114_).toString();
	string = new StringBuilder().append(string).append
		     (OpenGL.glGetString(35724).toLowerCase()).toString();
	return string;
    }
    
    public void method3406(boolean bool) {
	/* empty */
    }
    
    Class175_Sub2 method3244(Canvas canvas, int i, int i_115_) {
	return new Class175_Sub2_Sub3_Sub2(this, canvas);
    }
    
    Class175_Sub2 method3408(Canvas canvas, int i, int i_116_) {
	return new Class175_Sub2_Sub3_Sub2(this, canvas);
    }
    
    public int[] method3597(int i, int i_117_, int i_118_, int i_119_) {
	int[] is = new int[i_118_ * i_119_];
	int i_120_ = aClass175_1989.method2911();
	for (int i_121_ = 0; i_121_ < i_119_; i_121_++)
	    OpenGL.glReadPixelsi(i, i_120_ - i_117_ - i_121_ - 1, i_118_, 1,
				 32993, anInt11590, is, i_121_ * i_118_);
	return is;
    }
    
    static int method18077(Class181 class181) {
	switch (class181.anInt1953 * -939549997) {
	case 0:
	    return 6408;
	case 4:
	    return 6407;
	default:
	    throw new IllegalStateException();
	case 1:
	    return 6410;
	case 3:
	    return 6402;
	case 8:
	    return 6406;
	case 6:
	    return 6409;
	}
    }
    
    public void method3454() {
	if (aClass175_1989 != null) {
	    int i = aClass175_1989.method2910();
	    int i_122_ = aClass175_1989.method2911();
	    if (i > 0 || i_122_ > 0) {
		int i_123_ = anInt9184;
		int i_124_ = anInt9185;
		int i_125_ = anInt9186;
		int i_126_ = anInt9210;
		method3281();
		int i_127_ = anInt9178;
		int i_128_ = anInt9179;
		int i_129_ = anInt9176;
		int i_130_ = anInt9177;
		method3537();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		method14634();
		method14694(false);
		method14648(false);
		method14803(false);
		method14603(false);
		method14669(null);
		method14671(1);
		method14687(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, i, i_122_, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		method3373(i_127_, i_129_, i_128_, i_130_);
		method3318(i_123_, i_124_, i_125_, i_126_);
	    }
	}
    }
    
    public void method3412() {
	if (aClass175_1989 != null) {
	    int i = aClass175_1989.method2910();
	    int i_131_ = aClass175_1989.method2911();
	    if (i > 0 || i_131_ > 0) {
		int i_132_ = anInt9184;
		int i_133_ = anInt9185;
		int i_134_ = anInt9186;
		int i_135_ = anInt9210;
		method3281();
		int i_136_ = anInt9178;
		int i_137_ = anInt9179;
		int i_138_ = anInt9176;
		int i_139_ = anInt9177;
		method3537();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		method14634();
		method14694(false);
		method14648(false);
		method14803(false);
		method14603(false);
		method14669(null);
		method14671(1);
		method14687(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, i, i_131_, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		method3373(i_136_, i_138_, i_137_, i_139_);
		method3318(i_132_, i_133_, i_134_, i_135_);
	    }
	}
    }
    
    public void method3413() {
	if (aClass175_1989 != null) {
	    int i = aClass175_1989.method2910();
	    int i_140_ = aClass175_1989.method2911();
	    if (i > 0 || i_140_ > 0) {
		int i_141_ = anInt9184;
		int i_142_ = anInt9185;
		int i_143_ = anInt9186;
		int i_144_ = anInt9210;
		method3281();
		int i_145_ = anInt9178;
		int i_146_ = anInt9179;
		int i_147_ = anInt9176;
		int i_148_ = anInt9177;
		method3537();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		method14634();
		method14694(false);
		method14648(false);
		method14803(false);
		method14603(false);
		method14669(null);
		method14671(1);
		method14687(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, i, i_140_, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		method3373(i_145_, i_147_, i_146_, i_148_);
		method3318(i_141_, i_142_, i_143_, i_144_);
	    }
	}
    }
    
    public void method3414() {
	if (aClass175_1989 != null) {
	    int i = aClass175_1989.method2910();
	    int i_149_ = aClass175_1989.method2911();
	    if (i > 0 || i_149_ > 0) {
		int i_150_ = anInt9184;
		int i_151_ = anInt9185;
		int i_152_ = anInt9186;
		int i_153_ = anInt9210;
		method3281();
		int i_154_ = anInt9178;
		int i_155_ = anInt9179;
		int i_156_ = anInt9176;
		int i_157_ = anInt9177;
		method3537();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		method14634();
		method14694(false);
		method14648(false);
		method14803(false);
		method14603(false);
		method14669(null);
		method14671(1);
		method14687(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, i, i_149_, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		method3373(i_154_, i_156_, i_155_, i_157_);
		method3318(i_150_, i_151_, i_152_, i_153_);
	    }
	}
    }
    
    public void method3415() {
	if (aClass175_1989 != null) {
	    int i = aClass175_1989.method2910();
	    int i_158_ = aClass175_1989.method2911();
	    if (i > 0 || i_158_ > 0) {
		int i_159_ = anInt9184;
		int i_160_ = anInt9185;
		int i_161_ = anInt9186;
		int i_162_ = anInt9210;
		method3281();
		int i_163_ = anInt9178;
		int i_164_ = anInt9179;
		int i_165_ = anInt9176;
		int i_166_ = anInt9177;
		method3537();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		method14634();
		method14694(false);
		method14648(false);
		method14803(false);
		method14603(false);
		method14669(null);
		method14671(1);
		method14687(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, i, i_158_, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		method3373(i_163_, i_165_, i_164_, i_166_);
		method3318(i_159_, i_160_, i_161_, i_162_);
	    }
	}
    }
    
    public boolean method3417() {
	return aBool11596;
    }
    
    public boolean method3418() {
	if (aBool11596 && aLongArray11605[anInt11579] != 0L)
	    return false;
	return true;
    }
    
    public boolean method3419() {
	return true;
    }
    
    public boolean method3628() {
	return false;
    }
    
    public void method3277(long l) {
	if (l != 0L) {
	    if (OpenGL.glUnmapBufferARB(35051)) {
		/* empty */
	    }
	    OpenGL.glBindBufferARB(35051, 0);
	}
    }
    
    public int method3684() {
	if (aBool11596) {
	    if (aLongArray11605[anInt11607] == 0L)
		return -1;
	    int i = OpenGL.glClientWaitSync(aLongArray11605[anInt11607], 0, 0);
	    if (i == 37149) {
		method3656();
		return -1;
	    }
	    return i != 37147 ? anIntArray11604[anInt11607] : -1;
	}
	return -1;
    }
    
    Interface38 method14661(Class181 class181, Class173 class173, int i,
			    int i_167_) {
	return method14666(class181, class173, i, i_167_);
    }
    
    byte[] method18078(String string) {
	return method14840("gl", string);
    }
    
    void method14763() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass433_9142.aFloatArray4853, 0);
	OpenGL.glLightfv(16384, 4611, aFloatArray9197, 0);
	OpenGL.glLightfv(16385, 4611, aFloatArray9198, 0);
    }
    
    public void method3426() {
	for (int i = 0; i < 3; i++) {
	    if (aLongArray11605[i] != 0L) {
		OpenGL.glDeleteSync(aLongArray11605[i]);
		aLongArray11605[i] = 0L;
	    }
	}
	anInt11579 = 0;
	anInt11607 = 0;
    }
    
    public void method3427() {
	for (int i = 0; i < 3; i++) {
	    if (aLongArray11605[i] != 0L) {
		OpenGL.glDeleteSync(aLongArray11605[i]);
		aLongArray11605[i] = 0L;
	    }
	}
	anInt11579 = 0;
	anInt11607 = 0;
    }
    
    public void method3428() {
	for (int i = 0; i < 3; i++) {
	    if (aLongArray11605[i] != 0L) {
		OpenGL.glDeleteSync(aLongArray11605[i]);
		aLongArray11605[i] = 0L;
	    }
	}
	anInt11579 = 0;
	anInt11607 = 0;
    }
    
    public void method3230() {
	for (int i = 0; i < 3; i++) {
	    if (aLongArray11605[i] != 0L) {
		OpenGL.glDeleteSync(aLongArray11605[i]);
		aLongArray11605[i] = 0L;
	    }
	}
	anInt11579 = 0;
	anInt11607 = 0;
    }
    
    public void method3430(long l) {
	if (l != 0L) {
	    if (OpenGL.glUnmapBufferARB(35051)) {
		/* empty */
	    }
	    OpenGL.glBindBufferARB(35051, 0);
	}
    }
    
    public void method3431(int i, int i_168_, int[] is, int[] is_169_) {
	method18063(i, i_168_, is, is_169_);
    }
    
    public void method3432(int i, int i_170_, int[] is, int[] is_171_) {
	method18063(i, i_170_, is, is_171_);
    }
    
    public void method3433(int i, int i_172_, int[] is, int[] is_173_) {
	method18063(i, i_172_, is, is_173_);
    }
    
    public boolean method14759() {
	return aBool11591;
    }
    
    public void method3346() {
	if (aBool11596) {
	    aClass163_11581 = null;
	    if (aClass175_Sub1_11603 != null) {
		aClass175_Sub1_11603.method142();
		aClass175_Sub1_11603 = null;
	    }
	    OpenGL.glDeleteBuffersARB(3, anIntArray11576, 0);
	    for (int i = 0; i < 3; i++) {
		anIntArray11576[i] = 0;
		if (aLongArray11605[i] != 0L) {
		    OpenGL.glDeleteSync(aLongArray11605[i]);
		    aLongArray11605[i] = 0L;
		}
	    }
	} else {
	    aClass175_Sub1_11603 = null;
	    aClass163_11571 = null;
	    aClass163_11581 = null;
	}
	anInt11579 = 0;
	anInt11607 = 0;
    }
    
    public void method3523() {
	if (aBool11596) {
	    aClass163_11581 = null;
	    if (aClass175_Sub1_11603 != null) {
		aClass175_Sub1_11603.method142();
		aClass175_Sub1_11603 = null;
	    }
	    OpenGL.glDeleteBuffersARB(3, anIntArray11576, 0);
	    for (int i = 0; i < 3; i++) {
		anIntArray11576[i] = 0;
		if (aLongArray11605[i] != 0L) {
		    OpenGL.glDeleteSync(aLongArray11605[i]);
		    aLongArray11605[i] = 0L;
		}
	    }
	} else {
	    aClass175_Sub1_11603 = null;
	    aClass163_11571 = null;
	    aClass163_11581 = null;
	}
	anInt11579 = 0;
	anInt11607 = 0;
    }
    
    public boolean method14764(boolean bool) {
	return true;
    }
    
    public void method3458(int i, int i_174_) {
	int i_175_ = 0;
	if ((i & 0x1) != 0) {
	    OpenGL.glClearColor((float) (i_174_ & 0xff0000) / 1.671168E7F,
				(float) (i_174_ & 0xff00) / 65280.0F,
				(float) (i_174_ & 0xff) / 255.0F,
				(float) (i_174_ >>> 24) / 255.0F);
	    i_175_ = 16384;
	}
	if ((i & 0x2) != 0) {
	    method14603(true);
	    i_175_ |= 0x100;
	}
	if ((i & 0x4) != 0)
	    i_175_ |= 0x400;
	OpenGL.glClear(i_175_);
    }
    
    void method14701(Interface39 interface39) {
	aClass476_Sub1_11587 = (Class476_Sub1) interface39;
	aClass476_Sub1_11587.method7768();
    }
    
    public Class165 method3486(Class165 class165, Class165 class165_176_,
			       float f, Class165 class165_177_) {
	return f < 0.5F ? class165 : class165_176_;
    }
    
    void method14718() {
	OpenGL.glDepthFunc(515);
	method18087();
	OpenGL.glClearDepth(1.0F);
	OpenGL.glAlphaFunc(516, 0.0F);
	OpenGL.glPolygonMode(1028, 6914);
	if (aBool9260) {
	    method14697(anInt9263 > 1);
	    OpenGL.glDisable(32926);
	}
	for (int i = anInt9269 - 1; i >= 0; i--) {
	    OpenGL.glActiveTexture(33984 + i);
	    OpenGL.glTexEnvi(8960, 8704, 34160);
	    OpenGL.glTexEnvi(8960, 34161, 8448);
	    OpenGL.glTexEnvi(8960, 34178, 34166);
	    OpenGL.glTexEnvi(8960, 34162, 8448);
	    OpenGL.glTexEnvi(8960, 34186, 34166);
	}
	OpenGL.glTexEnvi(8960, 34186, 34168);
	OpenGL.glShadeModel(7425);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glColorMaterial(1028, 5634);
	OpenGL.glEnable(2903);
	float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
	for (int i = 0; i < 8; i++) {
	    int i_178_ = 16384 + i;
	    OpenGL.glLightfv(i_178_, 4608, fs, 0);
	    OpenGL.glLightf(i_178_, 4615, 0.0F);
	    OpenGL.glLightf(i_178_, 4616, 0.0F);
	}
	OpenGL.glFogf(2914, 0.95F);
	OpenGL.glFogi(2917, 9729);
	OpenGL.glHint(3156, 4353);
	anOpenGL11608.setSwapInterval(0);
	super.method14718();
    }
    
    public Class269 method14771(String string) {
	byte[] is = method18084(string);
	if (is == null)
	    return null;
	Class261 class261 = method14591(is);
	return new Class269_Sub1(this, class261);
    }
    
    public Interface22 method3571(int i, int i_179_, Class181 class181,
				  Class173 class173, int i_180_) {
	return new Class506(this, class181, class173, i, i_179_, i_180_);
    }
    
    public Interface22 method3276(int i, int i_181_, Class181 class181,
				  Class173 class173, int i_182_) {
	return new Class506(this, class181, class173, i, i_181_, i_182_);
    }
    
    public String method3250() {
	String string = "Caps: 4:";
	String string_183_ = ":";
	string = new StringBuilder().append(string).append(anInt9263).append
		     (string_183_).toString();
	string = new StringBuilder().append(string).append(anInt11590).append
		     (string_183_).toString();
	string = new StringBuilder().append(string).append(anInt9269).append
		     (string_183_).toString();
	string = new StringBuilder().append(string).append(anInt9270).append
		     (string_183_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11592 ? 1 : 0).append
		     (string_183_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9260 ? 1 : 0).append
		     (string_183_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11570 ? 1 : 0).append
		     (string_183_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11594 ? 1 : 0).append
		     (string_183_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11591 ? 1 : 0).append
		     (string_183_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11593 ? 1 : 0).append
		     (string_183_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9276 ? 1 : 0).append
		     (string_183_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11589 ? 1 : 0).append
		     (string_183_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9275 ? 1 : 0).append
		     (string_183_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11588 ? 1 : 0).append
		     (string_183_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9271 ? 1 : 0).append
		     (string_183_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9272 ? 1 : 0).append
		     (string_183_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9273 ? 1 : 0).append
		     (string_183_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9161 ? 1 : 0).append
		     (string_183_).toString();
	string = new StringBuilder().append(string).append
		     (OpenGL.glGetString(35724).toLowerCase()).toString();
	return string;
    }
    
    public Interface21 method3573(int i, int i_184_) {
	return new Class506(this, Class181.aClass181_1956,
			    Class173.aClass173_1828, i, i_184_);
    }
    
    boolean method14802(Class181 class181, Class173 class173) {
	return aBool9276;
    }
    
    public void method3424(int i, int i_185_, int i_186_) {
	method3559();
	if (aClass175_Sub1_11603 == null)
	    method18064(i_185_, i_186_);
	if (aClass163_11581 == null)
	    aClass163_11581 = method3319(0, 0, aClass175_1989.method2910(),
					 aClass175_1989.method2911(), false);
	else
	    aClass163_11581.method2717(0, 0, aClass175_1989.method2910(),
				       aClass175_1989.method2911(), 0, 0);
	method3260(aClass175_Sub1_11603, -679299940);
	method3340(1, -16777216);
	aClass163_11581.method2659(anInt2018 * -1555714981,
				   anInt2019 * -385311879,
				   anInt2020 * 1769547157,
				   anInt2021 * -740019615);
	OpenGL.glBindBufferARB(35051, anIntArray11576[anInt11579]);
	OpenGL.glReadPixelsub(0, 0, anInt2016 * 1104963955,
			      anInt2017 * 1827315157, 32993, 5121, null, 0);
	OpenGL.glBindBufferARB(35051, 0);
	method3261(aClass175_Sub1_11603, -11578496);
	aLongArray11605[anInt11579] = OpenGL.glFenceSync(37143, 0);
	anIntArray11604[anInt11579] = i;
	if (++anInt11579 >= 3)
	    anInt11579 = 0;
	method3446();
    }
    
    public Interface21 method3645(int i, int i_187_, int i_188_) {
	return new Class506(this, Class181.aClass181_1956,
			    Class173.aClass173_1828, i, i_187_, i_188_);
    }
    
    void method3580() {
	super.method3327();
	if (anOpenGL11608 != null) {
	    anOpenGL11608.method1768();
	    anOpenGL11608.release();
	    anOpenGL11608 = null;
	}
    }
    
    void method3557() {
	super.method3327();
	if (anOpenGL11608 != null) {
	    anOpenGL11608.method1768();
	    anOpenGL11608.release();
	    anOpenGL11608 = null;
	}
    }
    
    void method18079() {
	int i = 0;
	while (!anOpenGL11608.method1767()) {
	    if (i++ > 5)
		throw new RuntimeException("");
	    Class251.method4622(1000L);
	}
    }
    
    public boolean method3666() {
	return false;
    }
    
    final synchronized void method18080(long l) {
	Class534 class534 = new Class534();
	class534.aLong7158 = l * 936217890172187787L;
	aClass700_11573.method14131(class534, (short) 789);
    }
    
    void method14684() {
	OpenGL.glTexEnvi(8960, 34162,
			 method18065(aClass378Array9117[anInt9215]));
    }
    
    public boolean method14761() {
	return aBool11591;
    }
    
    public boolean method14762() {
	return aBool11591;
    }
    
    public boolean method14793() {
	return aBool11593;
    }
    
    public boolean method14626() {
	return aBool11593;
    }
    
    public boolean method3396() {
	return true;
    }
    
    public boolean method14745(boolean bool) {
	return true;
    }
    
    public boolean method14903(boolean bool) {
	return true;
    }
    
    public boolean method14590(boolean bool) {
	return true;
    }
    
    void method14696() {
	if (aBool9195) {
	    OpenGL.glEnable(16384);
	    OpenGL.glEnable(16385);
	} else {
	    OpenGL.glDisable(16384);
	    OpenGL.glDisable(16385);
	}
    }
    
    public Class269 method14737(String string) {
	byte[] is = method18084(string);
	if (is == null)
	    return null;
	Class261 class261 = method14591(is);
	return new Class269_Sub1(this, class261);
    }
    
    public Class269 method14773(String string) {
	byte[] is = method18084(string);
	if (is == null)
	    return null;
	Class261 class261 = method14591(is);
	return new Class269_Sub1(this, class261);
    }
    
    public Class269 method14877(String string) {
	byte[] is = method18084(string);
	if (is == null)
	    return null;
	Class261 class261 = method14591(is);
	return new Class269_Sub1(this, class261);
    }
    
    public void method14743(Class433 class433, Class433 class433_189_,
			    Class433 class433_190_) {
	OpenGL.glMatrixMode(5888);
	aClass433_9194.method6844(class433, class433_189_);
	OpenGL.glLoadMatrixf(aClass433_9194.aFloatArray4853, 0);
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadMatrixf(class433_190_.aFloatArray4853, 0);
    }
    
    void method14785() {
	OpenGL.glDepthFunc(515);
	method18087();
	OpenGL.glClearDepth(1.0F);
	OpenGL.glAlphaFunc(516, 0.0F);
	OpenGL.glPolygonMode(1028, 6914);
	if (aBool9260) {
	    method14697(anInt9263 > 1);
	    OpenGL.glDisable(32926);
	}
	for (int i = anInt9269 - 1; i >= 0; i--) {
	    OpenGL.glActiveTexture(33984 + i);
	    OpenGL.glTexEnvi(8960, 8704, 34160);
	    OpenGL.glTexEnvi(8960, 34161, 8448);
	    OpenGL.glTexEnvi(8960, 34178, 34166);
	    OpenGL.glTexEnvi(8960, 34162, 8448);
	    OpenGL.glTexEnvi(8960, 34186, 34166);
	}
	OpenGL.glTexEnvi(8960, 34186, 34168);
	OpenGL.glShadeModel(7425);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glColorMaterial(1028, 5634);
	OpenGL.glEnable(2903);
	float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
	for (int i = 0; i < 8; i++) {
	    int i_191_ = 16384 + i;
	    OpenGL.glLightfv(i_191_, 4608, fs, 0);
	    OpenGL.glLightf(i_191_, 4615, 0.0F);
	    OpenGL.glLightf(i_191_, 4616, 0.0F);
	}
	OpenGL.glFogf(2914, 0.95F);
	OpenGL.glFogi(2917, 9729);
	OpenGL.glHint(3156, 4353);
	anOpenGL11608.setSwapInterval(0);
	super.method14718();
    }
    
    final void method14742() {
	aFloatArray11598[0] = (float) (anInt9221 & 0xff0000) / 1.671168E7F;
	aFloatArray11598[1] = (float) (anInt9221 & 0xff00) / 65280.0F;
	aFloatArray11598[2] = (float) (anInt9221 & 0xff) / 255.0F;
	aFloatArray11598[3] = (float) (anInt9221 >>> 24) / 255.0F;
	OpenGL.glTexEnvfv(8960, 8705, aFloatArray11598, 0);
    }
    
    public float method14744() {
	return 0.0F;
    }
    
    void method14812() {
	if (aClass175_1989 != null)
	    OpenGL.glViewport(anInt9113 + anInt9184,
			      (anInt9189 + aClass175_1989.method2911()
			       - anInt9185 - anInt9210),
			      anInt9186, anInt9210);
	OpenGL.glDepthRange(aFloat9152, aFloat9157);
    }
    
    void method14690() {
	if (aClass175_1989 != null)
	    OpenGL.glViewport(anInt9113 + anInt9184,
			      (anInt9189 + aClass175_1989.method2911()
			       - anInt9185 - anInt9210),
			      anInt9186, anInt9210);
	OpenGL.glDepthRange(aFloat9152, aFloat9157);
    }
    
    void method14813() {
	if (aClass175_1989 != null)
	    OpenGL.glViewport(anInt9113 + anInt9184,
			      (anInt9189 + aClass175_1989.method2911()
			       - anInt9185 - anInt9210),
			      anInt9186, anInt9210);
	OpenGL.glDepthRange(aFloat9152, aFloat9157);
    }
    
    void method14657() {
	if (aClass175_1989 != null)
	    OpenGL.glViewport(anInt9113 + anInt9184,
			      (anInt9189 + aClass175_1989.method2911()
			       - anInt9185 - anInt9210),
			      anInt9186, anInt9210);
	OpenGL.glDepthRange(aFloat9152, aFloat9157);
    }
    
    public void method3459(int i, int i_192_) {
	int i_193_ = 0;
	if ((i & 0x1) != 0) {
	    OpenGL.glClearColor((float) (i_192_ & 0xff0000) / 1.671168E7F,
				(float) (i_192_ & 0xff00) / 65280.0F,
				(float) (i_192_ & 0xff) / 255.0F,
				(float) (i_192_ >>> 24) / 255.0F);
	    i_193_ = 16384;
	}
	if ((i & 0x2) != 0) {
	    method14603(true);
	    i_193_ |= 0x100;
	}
	if ((i & 0x4) != 0)
	    i_193_ |= 0x400;
	OpenGL.glClear(i_193_);
    }
    
    public final void method14710(Class374 class374, int i, int i_194_,
				  int i_195_, int i_196_) {
	int i_197_;
	int i_198_;
	if (class374 == Class374.aClass374_3901) {
	    i_197_ = 1;
	    i_198_ = i_196_ * 2;
	} else if (class374 == Class374.aClass374_3896) {
	    i_197_ = 3;
	    i_198_ = i_196_ + 1;
	} else if (class374 == Class374.aClass374_3898) {
	    i_197_ = 4;
	    i_198_ = i_196_ * 3;
	} else if (class374 == Class374.aClass374_3895) {
	    i_197_ = 6;
	    i_198_ = i_196_ + 2;
	} else if (class374 == Class374.aClass374_3900) {
	    i_197_ = 5;
	    i_198_ = i_196_ + 2;
	} else {
	    i_197_ = 0;
	    i_198_ = i_196_;
	}
	Class173 class173 = aClass476_Sub1_11587.method276();
	OpenGL.glDrawElements(i_197_, i_198_, method18074(class173),
			      (aClass476_Sub1_11587.method7776()
			       + (long) (i_195_ * (class173.anInt1825
						   * 1899960707))));
    }
    
    void method14816() {
	if (aBool9294)
	    OpenGL.glEnable(3089);
	else
	    OpenGL.glDisable(3089);
    }
    
    void method14817() {
	if (aBool9294)
	    OpenGL.glEnable(3089);
	else
	    OpenGL.glDisable(3089);
    }
    
    void method14852() {
	if (aBool9248 && aBool9193)
	    OpenGL.glEnable(2929);
	else
	    OpenGL.glDisable(2929);
    }
    
    public void method14891() {
	int i = anIntArray11601[anInt9215];
	if (i != 0) {
	    anIntArray11601[anInt9215] = 0;
	    OpenGL.glBindTexture(i, 0);
	    OpenGL.glDisable(i);
	}
    }
    
    void method14854() {
	OpenGL.glDepthMask(aBool9190 && aBool9191);
    }
    
    void method14857() {
	if (aBool9146 && !aBool9196)
	    OpenGL.glEnable(2896);
	else
	    OpenGL.glDisable(2896);
    }
    
    void method3582() {
	super.method3327();
	if (anOpenGL11608 != null) {
	    anOpenGL11608.method1768();
	    anOpenGL11608.release();
	    anOpenGL11608 = null;
	}
    }
    
    final synchronized void method18081(int i, int i_199_) {
	Class534_Sub39 class534_sub39 = new Class534_Sub39(i_199_);
	class534_sub39.aLong7158 = (long) i * 936217890172187787L;
	aClass700_11569.method14131(class534_sub39, (short) 789);
    }
    
    void method14867() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass433_9142.aFloatArray4853, 0);
	int i;
	for (i = 0; i < anInt9129; i++) {
	    Class534_Sub21 class534_sub21 = aClass534_Sub21Array9208[i];
	    int i_200_ = class534_sub21.method16201((byte) 2);
	    int i_201_ = 16386 + i;
	    float f = class534_sub21.method16202(-693604944) / 255.0F;
	    aFloatArray11598[0]
		= (float) class534_sub21.method16197(-281305072);
	    aFloatArray11598[1]
		= (float) class534_sub21.method16226(1284980983);
	    aFloatArray11598[2]
		= (float) class534_sub21.method16199((byte) -12);
	    aFloatArray11598[3] = 1.0F;
	    OpenGL.glLightfv(i_201_, 4611, aFloatArray11598, 0);
	    aFloatArray11598[0] = (float) (i_200_ >> 16 & 0xff) * f;
	    aFloatArray11598[1] = (float) (i_200_ >> 8 & 0xff) * f;
	    aFloatArray11598[2] = (float) (i_200_ & 0xff) * f;
	    aFloatArray11598[3] = 1.0F;
	    OpenGL.glLightfv(i_201_, 4609, aFloatArray11598, 0);
	    OpenGL.glLightf(i_201_, 4617,
			    (1.0F
			     / (float) (class534_sub21.method16233(-1161697897)
					* class534_sub21
					      .method16233(-1186742251))));
	    OpenGL.glEnable(i_201_);
	}
	for (/**/; i < anInt9209; i++)
	    OpenGL.glDisable(16386 + i);
    }
    
    void method14792() {
	aFloatArray11598[0] = aFloat9206 * aFloat9159;
	aFloatArray11598[1] = aFloat9206 * aFloat9292;
	aFloatArray11598[2] = aFloat9206 * aFloat9163;
	aFloatArray11598[3] = 1.0F;
	OpenGL.glLightfv(16384, 4609, aFloatArray11598, 0);
	aFloatArray11598[0] = -aFloat9267 * aFloat9159;
	aFloatArray11598[1] = -aFloat9267 * aFloat9292;
	aFloatArray11598[2] = -aFloat9267 * aFloat9163;
	aFloatArray11598[3] = 1.0F;
	OpenGL.glLightfv(16385, 4609, aFloatArray11598, 0);
    }
    
    void method14861() {
	/* empty */
    }
    
    void method14720() {
	/* empty */
    }
    
    void method14667() {
	/* empty */
    }
    
    void method14862() {
	if (aBool9195) {
	    OpenGL.glEnable(16384);
	    OpenGL.glEnable(16385);
	} else {
	    OpenGL.glDisable(16384);
	    OpenGL.glDisable(16385);
	}
    }
    
    void method14863() {
	if (aBool9195) {
	    OpenGL.glEnable(16384);
	    OpenGL.glEnable(16385);
	} else {
	    OpenGL.glDisable(16384);
	    OpenGL.glDisable(16385);
	}
    }
    
    final void method14974(int i, Class373 class373, boolean bool) {
	OpenGL.glTexEnvi(8960, 34184 + i, method18066(class373));
	OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
    }
    
    final void method14674(int i, Class373 class373, boolean bool,
			   boolean bool_202_) {
	OpenGL.glTexEnvi(8960, 34176 + i, method18066(class373));
	if (bool)
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_202_ ? 771 : 770);
	else
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_202_ ? 769 : 768);
    }
    
    final void method14899(int i, Class373 class373, boolean bool,
			   boolean bool_203_) {
	OpenGL.glTexEnvi(8960, 34176 + i, method18066(class373));
	if (bool)
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_203_ ? 771 : 770);
	else
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_203_ ? 769 : 768);
    }
    
    boolean method14869(Class181 class181, Class173 class173) {
	return true;
    }
    
    long method18082(int i, int i_204_, int[] is, int[] is_205_) {
	if (aBool11596) {
	    if (aLongArray11605[anInt11607] != 0L) {
		OpenGL.glDeleteSync(aLongArray11605[anInt11607]);
		aLongArray11605[anInt11607] = 0L;
	    }
	    OpenGL.glBindBufferARB(35051, anIntArray11576[anInt11607]);
	    long l = OpenGL.glMapBufferARB(35051, 35000);
	    if (is != null) {
		for (int i_206_ = 0; i_206_ < i * i_204_; i_206_++)
		    is[i_206_] = anUnsafe9127.getInt(l + (long) (i_206_ * 4));
		if (OpenGL.glUnmapBufferARB(35051)) {
		    /* empty */
		}
		OpenGL.glBindBufferARB(35051, 0);
		l = 0L;
	    }
	    if (++anInt11607 >= 3)
		anInt11607 = 0;
	    return l;
	}
	if (aClass163_11571 == null)
	    method18064(i, i_204_);
	if (aClass163_11581 == null)
	    aClass163_11581 = method3319(0, 0, aClass175_1989.method2910(),
					 aClass175_1989.method2911(), false);
	else
	    aClass163_11581.method2717(0, 0, aClass175_1989.method2910(),
				       aClass175_1989.method2911(), 0, 0);
	method3260(aClass175_Sub1_11603, 1580430156);
	method3340(1, -16777216);
	aClass163_11581.method2659(anInt2018 * -1555714981,
				   anInt2019 * -385311879,
				   anInt2020 * 1769547157,
				   anInt2021 * -740019615);
	aClass163_11571.method2653(0, 0, i, i_204_, is, is_205_, 0, i);
	method3261(aClass175_Sub1_11603, -11578496);
	return 0L;
    }
    
    boolean method14664(Class181 class181, Class173 class173) {
	return aBool9276;
    }
    
    Interface38 method14649(Class181 class181, Class173 class173, int i,
			    int i_207_) {
	return method14666(class181, class173, i, i_207_);
    }
    
    void method18083() {
	if (anInt9262 == 1)
	    OpenGL.glDisable(2884);
	else {
	    OpenGL.glEnable(2884);
	    if (anInt9262 == 2)
		OpenGL.glCullFace(1029);
	    else if (anInt9262 == 3)
		OpenGL.glCullFace(1028);
	}
    }
    
    Interface38 method14879(Class181 class181, int i, int i_208_, boolean bool,
			    byte[] is, int i_209_, int i_210_) {
	return new Class486_Sub3(this, class181, i, i_208_, bool, is, i_209_,
				 i_210_);
    }
    
    void method14736() {
	if (aBool9146 && !aBool9196)
	    OpenGL.glEnable(2896);
	else
	    OpenGL.glDisable(2896);
    }
    
    Interface38 method14751(Class181 class181, int i, int i_211_, boolean bool,
			    float[] fs, int i_212_, int i_213_) {
	return new Class486_Sub3(this, class181, i, i_211_, bool, fs, i_212_,
				 i_213_);
    }
    
    void method14868() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass433_9142.aFloatArray4853, 0);
	int i;
	for (i = 0; i < anInt9129; i++) {
	    Class534_Sub21 class534_sub21 = aClass534_Sub21Array9208[i];
	    int i_214_ = class534_sub21.method16201((byte) 34);
	    int i_215_ = 16386 + i;
	    float f = class534_sub21.method16202(-693604944) / 255.0F;
	    aFloatArray11598[0]
		= (float) class534_sub21.method16197(-1785935411);
	    aFloatArray11598[1]
		= (float) class534_sub21.method16226(-716324008);
	    aFloatArray11598[2]
		= (float) class534_sub21.method16199((byte) -112);
	    aFloatArray11598[3] = 1.0F;
	    OpenGL.glLightfv(i_215_, 4611, aFloatArray11598, 0);
	    aFloatArray11598[0] = (float) (i_214_ >> 16 & 0xff) * f;
	    aFloatArray11598[1] = (float) (i_214_ >> 8 & 0xff) * f;
	    aFloatArray11598[2] = (float) (i_214_ & 0xff) * f;
	    aFloatArray11598[3] = 1.0F;
	    OpenGL.glLightfv(i_215_, 4609, aFloatArray11598, 0);
	    OpenGL.glLightf(i_215_, 4617,
			    (1.0F
			     / (float) (class534_sub21.method16233(-1928707824)
					* class534_sub21
					      .method16233(-1083183681))));
	    OpenGL.glEnable(i_215_);
	}
	for (/**/; i < anInt9209; i++)
	    OpenGL.glDisable(16386 + i);
    }
    
    public Class175_Sub1 method3570() {
	return new Class175_Sub1_Sub1_Sub2(this);
    }
    
    Interface38 method14735(int i, int i_216_, boolean bool, int[] is,
			    int i_217_, int i_218_) {
	return new Class486_Sub3(this, i, i_216_, bool, is, i_217_, i_218_);
    }
    
    Interface41 method14738(int i, boolean bool, int[][] is) {
	return new Class486_Sub2(this, i, bool, is);
    }
    
    final void method14953(Interface39 interface39, Class374 class374, int i,
			   int i_219_, int i_220_, int i_221_) {
	int i_222_;
	int i_223_;
	if (class374 == Class374.aClass374_3901) {
	    i_222_ = 1;
	    i_223_ = i_221_ * 2;
	} else if (class374 == Class374.aClass374_3896) {
	    i_222_ = 3;
	    i_223_ = i_221_ + 1;
	} else if (class374 == Class374.aClass374_3898) {
	    i_222_ = 4;
	    i_223_ = i_221_ * 3;
	} else if (class374 == Class374.aClass374_3895) {
	    i_222_ = 6;
	    i_223_ = i_221_ + 2;
	} else if (class374 == Class374.aClass374_3900) {
	    i_222_ = 5;
	    i_223_ = i_221_ + 2;
	} else {
	    i_222_ = 0;
	    i_223_ = i_221_;
	}
	Class173 class173 = interface39.method276();
	Class476_Sub1 class476_sub1 = (Class476_Sub1) interface39;
	class476_sub1.method7768();
	OpenGL.glDrawElements(i_222_, i_223_, method18074(class173),
			      (class476_sub1.method7776()
			       + (long) (i_220_ * (class173.anInt1825
						   * 1899960707))));
    }
    
    byte[] method18084(String string) {
	return method14840("gl", string);
    }
    
    void method3327() {
	super.method3327();
	if (anOpenGL11608 != null) {
	    anOpenGL11608.method1768();
	    anOpenGL11608.release();
	    anOpenGL11608 = null;
	}
    }
    
    Interface35 method14888(Class181 class181, int i, int i_224_, int i_225_,
			    boolean bool, byte[] is) {
	return new Class486_Sub1(this, class181, i, i_224_, i_225_, bool, is);
    }
    
    Interface35 method14619(Class181 class181, int i, int i_226_, int i_227_,
			    boolean bool, byte[] is) {
	return new Class486_Sub1(this, class181, i, i_226_, i_227_, bool, is);
    }
    
    public Class165 method3451(Class165 class165, Class165 class165_228_,
			       float f, Class165 class165_229_) {
	return f < 0.5F ? class165 : class165_228_;
    }
    
    final void method14897(int i, Class373 class373, boolean bool,
			   boolean bool_230_) {
	OpenGL.glTexEnvi(8960, 34176 + i, method18066(class373));
	if (bool)
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_230_ ? 771 : 770);
	else
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_230_ ? 769 : 768);
    }
    
    final void method14898(int i, Class373 class373, boolean bool,
			   boolean bool_231_) {
	OpenGL.glTexEnvi(8960, 34176 + i, method18066(class373));
	if (bool)
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_231_ ? 771 : 770);
	else
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_231_ ? 769 : 768);
    }
    
    void method14920() {
	OpenGL.glTexEnvi(8960, 34162,
			 method18065(aClass378Array9117[anInt9215]));
    }
    
    final void method14646() {
	aFloatArray11598[0] = (float) (anInt9221 & 0xff0000) / 1.671168E7F;
	aFloatArray11598[1] = (float) (anInt9221 & 0xff00) / 65280.0F;
	aFloatArray11598[2] = (float) (anInt9221 & 0xff) / 255.0F;
	aFloatArray11598[3] = (float) (anInt9221 >>> 24) / 255.0F;
	OpenGL.glTexEnvfv(8960, 8705, aFloatArray11598, 0);
    }
    
    void method18085(int i, int i_232_) {
	method3280();
	method3616(i, i_232_, -374155919);
	if (aBool11596) {
	    aClass163_11571 = method3315(i, i_232_, false, true);
	    aClass175_Sub1_11603 = method3263();
	    aClass175_Sub1_11603.method15075(0, aClass163_11571.method2651());
	    OpenGL.glGenBuffersARB(3, anIntArray11576, 0);
	    for (int i_233_ = 0; i_233_ < 3; i_233_++) {
		OpenGL.glBindBufferARB(35051, anIntArray11576[i_233_]);
		OpenGL.glBufferDataARBa(35051, i * i_232_ * 4, 0L, 35041);
		OpenGL.glBindBufferARB(35051, 0);
	    }
	} else {
	    aClass163_11571 = method3315(i, i_232_, false, true);
	    aClass175_Sub1_11603 = method3263();
	    aClass175_Sub1_11603.method15075(0, aClass163_11571.method2651());
	}
    }
    
    final void method14914() {
	aFloatArray11598[0] = (float) (anInt9221 & 0xff0000) / 1.671168E7F;
	aFloatArray11598[1] = (float) (anInt9221 & 0xff00) / 65280.0F;
	aFloatArray11598[2] = (float) (anInt9221 & 0xff) / 255.0F;
	aFloatArray11598[3] = (float) (anInt9221 >>> 24) / 255.0F;
	OpenGL.glTexEnvfv(8960, 8705, aFloatArray11598, 0);
    }
    
    void method14774() {
	OpenGL.glMatrixMode(5890);
	if (aClass364Array9218[anInt9215] != Class364.aClass364_3725)
	    OpenGL.glLoadMatrixf(aClass433Array9217[anInt9215]
				     .method6938(aFloatArray11599),
				 0);
	else
	    OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    final synchronized void method18086(int i) {
	Class534 class534 = new Class534();
	class534.aLong7158 = (long) i * 936217890172187787L;
	aClass700_11572.method14131(class534, (short) 789);
    }
    
    void method14683() {
	OpenGL.glTexEnvi(8960, 34161,
			 method18065(aClass378Array9219[anInt9215]));
    }
    
    void method14918() {
	OpenGL.glTexEnvi(8960, 34161,
			 method18065(aClass378Array9219[anInt9215]));
    }
    
    void method18087() {
	if (anInt9262 == 1)
	    OpenGL.glDisable(2884);
	else {
	    OpenGL.glEnable(2884);
	    if (anInt9262 == 2)
		OpenGL.glCullFace(1029);
	    else if (anInt9262 == 3)
		OpenGL.glCullFace(1028);
	}
    }
    
    void method14919() {
	OpenGL.glTexEnvi(8960, 34162,
			 method18065(aClass378Array9117[anInt9215]));
    }
    
    void method14693() {
	if (aBool9259)
	    OpenGL.glEnable(3042);
	else
	    OpenGL.glDisable(3042);
    }
    
    void method14702() {
	OpenGL.glTexEnvi(8960, 34162,
			 method18065(aClass378Array9117[anInt9215]));
    }
    
    void method14882(int i) {
	OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0,
			   (i & 0x8) != 0);
    }
    
    public Class176 method3288() {
	int i = -1;
	if (aString11585.indexOf("nvidia") != -1)
	    i = 4318;
	else if (aString11585.indexOf("intel") != -1)
	    i = 32902;
	else if (aString11585.indexOf("ati") != -1)
	    i = 4098;
	return new Class176(i, method14585() ? "OpenGL FF" : "OpenGL",
			    anInt11606, aString11586, 0L, method14585());
    }
    
    final synchronized void method18088(int i) {
	Class534_Sub39 class534_sub39 = new Class534_Sub39(i);
	aClass700_11602.method14131(class534_sub39, (short) 789);
    }
    
    public boolean method14760() {
	return aBool11591;
    }
    
    void method14695() {
	aFloat9255 = aFloat9175 - (float) anInt9188;
	aFloat9254 = aFloat9255 - (float) anInt9252;
	if (aFloat9254 < aFloat9174)
	    aFloat9254 = aFloat9174;
	if (aBool9125) {
	    OpenGL.glFogf(2915, aFloat9254);
	    OpenGL.glFogf(2916, aFloat9255);
	    aFloatArray11598[0] = (float) (anInt9251 & 0xff0000) / 1.671168E7F;
	    aFloatArray11598[1] = (float) (anInt9251 & 0xff00) / 65280.0F;
	    aFloatArray11598[2] = (float) (anInt9251 & 0xff) / 255.0F;
	    OpenGL.glFogfv(2918, aFloatArray11598, 0);
	}
    }
    
    void method14932() {
	if (aBool9250 && aBool9249 && anInt9252 >= 0)
	    OpenGL.glEnable(2912);
	else
	    OpenGL.glDisable(2912);
    }
    
    void method14636() {
	if (aBool9250 && aBool9249 && anInt9252 >= 0)
	    OpenGL.glEnable(2912);
	else
	    OpenGL.glDisable(2912);
    }
    
    public Interface21 method3572(int i, int i_234_) {
	return new Class506(this, Class181.aClass181_1956,
			    Class173.aClass173_1828, i, i_234_);
    }
    
    void method14934() {
	if (aBool9250 && aBool9249 && anInt9252 >= 0)
	    OpenGL.glEnable(2912);
	else
	    OpenGL.glDisable(2912);
    }
    
    void method14647(boolean bool) {
	if (bool)
	    OpenGL.glEnable(32925);
	else
	    OpenGL.glDisable(32925);
    }
    
    final Interface39 method14782(boolean bool) {
	return new Class476_Sub1(this, Class173.aClass173_1829, bool);
    }
    
    final Interface37 method14937(boolean bool) {
	return new Class476_Sub2(this, bool);
    }
    
    public void method14739(Class433 class433) {
	float[] fs = class433.aFloatArray4853;
	fs[1] = -fs[1];
	fs[5] = -fs[5];
	fs[9] = -fs[9];
	fs[13] = -fs[13];
    }
    
    public int method3524() {
	if (aBool11596) {
	    if (aLongArray11605[anInt11607] == 0L)
		return -1;
	    int i = OpenGL.glClientWaitSync(aLongArray11605[anInt11607], 0, 0);
	    if (i == 37149) {
		method3656();
		return -1;
	    }
	    return i != 37147 ? anIntArray11604[anInt11607] : -1;
	}
	return -1;
    }
    
    Class349 method14940(Class381[] class381s) {
	return new Class349_Sub2(class381s);
    }
    
    public final synchronized void method3389(int i) {
	try {
	    method18076();
	} catch (Exception exception) {
	    return;
	}
	int i_235_ = 0;
	i &= 0x7fffffff;
	while (!aClass700_11578.method14142(960420296)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11578.method14132((byte) -99);
	    anIntArray11568[i_235_++]
		= (int) (class534_sub39.aLong7158 * 8258869577519436579L);
	    anInt9136 -= class534_sub39.anInt10807 * -705967177;
	    if (i_235_ == 1000) {
		OpenGL.glDeleteBuffersARB(i_235_, anIntArray11568, 0);
		i_235_ = 0;
	    }
	}
	if (i_235_ > 0) {
	    OpenGL.glDeleteBuffersARB(i_235_, anIntArray11568, 0);
	    i_235_ = 0;
	}
	while (!aClass700_11569.method14142(1024305582)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11569.method14132((byte) -34);
	    anIntArray11568[i_235_++]
		= (int) (class534_sub39.aLong7158 * 8258869577519436579L);
	    anInt9135 -= class534_sub39.anInt10807 * -705967177;
	    if (i_235_ == 1000) {
		OpenGL.glDeleteTextures(i_235_, anIntArray11568, 0);
		i_235_ = 0;
	    }
	}
	if (i_235_ > 0) {
	    OpenGL.glDeleteTextures(i_235_, anIntArray11568, 0);
	    i_235_ = 0;
	}
	while (!aClass700_11602.method14142(-768467634)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11602.method14132((byte) -31);
	    anIntArray11568[i_235_++] = class534_sub39.anInt10807 * -705967177;
	    if (i_235_ == 1000) {
		OpenGL.glDeleteFramebuffersEXT(i_235_, anIntArray11568, 0);
		i_235_ = 0;
	    }
	}
	if (i_235_ > 0) {
	    OpenGL.glDeleteFramebuffersEXT(i_235_, anIntArray11568, 0);
	    i_235_ = 0;
	}
	while (!aClass700_11582.method14142(-620910448)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11582.method14132((byte) -22);
	    anIntArray11568[i_235_++]
		= (int) (class534_sub39.aLong7158 * 8258869577519436579L);
	    anInt9137 -= class534_sub39.anInt10807 * -705967177;
	    if (i_235_ == 1000) {
		OpenGL.glDeleteRenderbuffersEXT(i_235_, anIntArray11568, 0);
		i_235_ = 0;
	    }
	}
	if (i_235_ > 0) {
	    OpenGL.glDeleteRenderbuffersEXT(i_235_, anIntArray11568, 0);
	    boolean bool = false;
	}
	while (!aClass700_11567.method14142(-1304797730)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11567.method14132((byte) -107);
	    OpenGL.glDeleteLists((int) (class534_sub39.aLong7158
					* 8258869577519436579L),
				 class534_sub39.anInt10807 * -705967177);
	}
	while (!aClass700_11572.method14142(-1674447718)) {
	    Class534 class534 = aClass700_11572.method14132((byte) -45);
	    OpenGL.glDeleteProgram((int) (class534.aLong7158
					  * 8258869577519436579L));
	}
	while (!aClass700_11573.method14142(-1088332137)) {
	    Class534 class534 = aClass700_11573.method14132((byte) -60);
	    OpenGL.glDeleteShader((int) (class534.aLong7158
					 * 8258869577519436579L));
	}
	while (!aClass700_11567.method14142(-1470841236)) {
	    Class534_Sub39 class534_sub39
		= (Class534_Sub39) aClass700_11567.method14132((byte) -127);
	    OpenGL.glDeleteLists((int) (class534_sub39.aLong7158
					* 8258869577519436579L),
				 class534_sub39.anInt10807 * -705967177);
	}
	if (method3239() > 100663296
	    && Class250.method4604((byte) -120) > aLong11574 + 60000L) {
	    System.gc();
	    aLong11574 = Class250.method4604((byte) -56);
	}
	super.method3661(i);
    }
    
    public void method14942(Class349 class349) {
	Class381[] class381s = class349.aClass381Array3592;
	int i = 0;
	boolean bool = false;
	boolean bool_236_ = false;
	boolean bool_237_ = false;
	for (int i_238_ = 0; i_238_ < class381s.length; i_238_++) {
	    Class381 class381 = class381s[i_238_];
	    Class476_Sub2 class476_sub2 = aClass476_Sub2Array11580[i_238_];
	    int i_239_ = 0;
	    int i_240_ = class476_sub2.method15876();
	    long l = class476_sub2.method7776();
	    class476_sub2.method7768();
	    for (int i_241_ = 0; i_241_ < class381.method6434(); i_241_++) {
		Class350 class350 = class381.method6441(i_241_);
		switch (class350.anInt3605) {
		case 0:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(1, 5126, i_240_,
					     l + (long) i_239_);
		    break;
		case 8:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(2, 5126, i_240_,
					     l + (long) i_239_);
		    break;
		default:
		    break;
		case 2:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(3, 5126, i_240_,
					     l + (long) i_239_);
		    break;
		case 3:
		    OpenGL.glColorPointer(4, 5121, i_240_, l + (long) i_239_);
		    bool = true;
		    break;
		case 6:
		    OpenGL.glVertexPointer(3, 5126, i_240_, l + (long) i_239_);
		    bool_237_ = true;
		    break;
		case 11:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(4, 5126, i_240_,
					     l + (long) i_239_);
		    break;
		case 1:
		    OpenGL.glNormalPointer(5126, i_240_, l + (long) i_239_);
		    bool_236_ = true;
		}
		i_239_ += class350.anInt3608;
	    }
	}
	if (aBool11595 != bool_237_) {
	    if (bool_237_)
		OpenGL.glEnableClientState(32884);
	    else
		OpenGL.glDisableClientState(32884);
	    aBool11595 = bool_237_;
	}
	if (aBool11575 != bool_236_) {
	    if (bool_236_)
		OpenGL.glEnableClientState(32885);
	    else
		OpenGL.glDisableClientState(32885);
	    aBool11575 = bool_236_;
	}
	if (aBool11577 != bool) {
	    if (bool)
		OpenGL.glEnableClientState(32886);
	    else
		OpenGL.glDisableClientState(32886);
	    aBool11577 = bool;
	}
	if (anInt11566 < i) {
	    for (int i_242_ = anInt11566; i_242_ < i; i_242_++) {
		OpenGL.glClientActiveTexture(33984 + i_242_);
		OpenGL.glEnableClientState(32888);
	    }
	    anInt11566 = i;
	} else if (anInt11566 > i) {
	    for (int i_243_ = i; i_243_ < anInt11566; i_243_++) {
		OpenGL.glClientActiveTexture(33984 + i_243_);
		OpenGL.glDisableClientState(32888);
	    }
	    anInt11566 = i;
	}
    }
    
    public void method14748(Class349 class349) {
	Class381[] class381s = class349.aClass381Array3592;
	int i = 0;
	boolean bool = false;
	boolean bool_244_ = false;
	boolean bool_245_ = false;
	for (int i_246_ = 0; i_246_ < class381s.length; i_246_++) {
	    Class381 class381 = class381s[i_246_];
	    Class476_Sub2 class476_sub2 = aClass476_Sub2Array11580[i_246_];
	    int i_247_ = 0;
	    int i_248_ = class476_sub2.method15876();
	    long l = class476_sub2.method7776();
	    class476_sub2.method7768();
	    for (int i_249_ = 0; i_249_ < class381.method6434(); i_249_++) {
		Class350 class350 = class381.method6441(i_249_);
		switch (class350.anInt3605) {
		case 0:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(1, 5126, i_248_,
					     l + (long) i_247_);
		    break;
		case 8:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(2, 5126, i_248_,
					     l + (long) i_247_);
		    break;
		default:
		    break;
		case 2:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(3, 5126, i_248_,
					     l + (long) i_247_);
		    break;
		case 3:
		    OpenGL.glColorPointer(4, 5121, i_248_, l + (long) i_247_);
		    bool = true;
		    break;
		case 6:
		    OpenGL.glVertexPointer(3, 5126, i_248_, l + (long) i_247_);
		    bool_245_ = true;
		    break;
		case 11:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(4, 5126, i_248_,
					     l + (long) i_247_);
		    break;
		case 1:
		    OpenGL.glNormalPointer(5126, i_248_, l + (long) i_247_);
		    bool_244_ = true;
		}
		i_247_ += class350.anInt3608;
	    }
	}
	if (aBool11595 != bool_245_) {
	    if (bool_245_)
		OpenGL.glEnableClientState(32884);
	    else
		OpenGL.glDisableClientState(32884);
	    aBool11595 = bool_245_;
	}
	if (aBool11575 != bool_244_) {
	    if (bool_244_)
		OpenGL.glEnableClientState(32885);
	    else
		OpenGL.glDisableClientState(32885);
	    aBool11575 = bool_244_;
	}
	if (aBool11577 != bool) {
	    if (bool)
		OpenGL.glEnableClientState(32886);
	    else
		OpenGL.glDisableClientState(32886);
	    aBool11577 = bool;
	}
	if (anInt11566 < i) {
	    for (int i_250_ = anInt11566; i_250_ < i; i_250_++) {
		OpenGL.glClientActiveTexture(33984 + i_250_);
		OpenGL.glEnableClientState(32888);
	    }
	    anInt11566 = i;
	} else if (anInt11566 > i) {
	    for (int i_251_ = i; i_251_ < anInt11566; i_251_++) {
		OpenGL.glClientActiveTexture(33984 + i_251_);
		OpenGL.glDisableClientState(32888);
	    }
	    anInt11566 = i;
	}
    }
    
    Interface44 method14968(Class181 class181, Class173 class173, int i,
			    int i_252_) {
	return new Class486_Sub3(this, class181, class173, i, i_252_);
    }
    
    public Class175_Sub1 method3569() {
	return new Class175_Sub1_Sub1_Sub2(this);
    }
    
    public void method14945(int i, Interface37 interface37) {
	aClass476_Sub2Array11580[i] = (Class476_Sub2) interface37;
    }
    
    void method14946(Interface39 interface39) {
	aClass476_Sub1_11587 = (Class476_Sub1) interface39;
	aClass476_Sub1_11587.method7768();
    }
    
    final void method14952(Interface39 interface39, Class374 class374, int i,
			   int i_253_, int i_254_, int i_255_) {
	int i_256_;
	int i_257_;
	if (class374 == Class374.aClass374_3901) {
	    i_256_ = 1;
	    i_257_ = i_255_ * 2;
	} else if (class374 == Class374.aClass374_3896) {
	    i_256_ = 3;
	    i_257_ = i_255_ + 1;
	} else if (class374 == Class374.aClass374_3898) {
	    i_256_ = 4;
	    i_257_ = i_255_ * 3;
	} else if (class374 == Class374.aClass374_3895) {
	    i_256_ = 6;
	    i_257_ = i_255_ + 2;
	} else if (class374 == Class374.aClass374_3900) {
	    i_256_ = 5;
	    i_257_ = i_255_ + 2;
	} else {
	    i_256_ = 0;
	    i_257_ = i_255_;
	}
	Class173 class173 = interface39.method276();
	Class476_Sub1 class476_sub1 = (Class476_Sub1) interface39;
	class476_sub1.method7768();
	OpenGL.glDrawElements(i_256_, i_257_, method18074(class173),
			      (class476_sub1.method7776()
			       + (long) (i_254_ * (class173.anInt1825
						   * 1899960707))));
    }
    
    boolean method14741(Class181 class181, Class173 class173) {
	return true;
    }
    
    void method14821(int i) {
	if (!aBool11597)
	    OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
    }
    
    void method14960(int i) {
	if (!aBool11597)
	    OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
    }
    
    void method14961(int i) {
	if (!aBool11597)
	    OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
    }
    
    void method14966() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass433_9142.aFloatArray4853, 0);
	OpenGL.glLightfv(16384, 4611, aFloatArray9197, 0);
	OpenGL.glLightfv(16385, 4611, aFloatArray9198, 0);
    }
    
    Interface44 method14967(Class181 class181, Class173 class173, int i,
			    int i_258_) {
	return new Class486_Sub3(this, class181, class173, i, i_258_);
    }
    
    public Interface21 method3265(int i, int i_259_) {
	return new Class506(this, Class181.aClass181_1956,
			    Class173.aClass173_1828, i, i_259_);
    }
    
    void method14969() {
	if (aBool9259)
	    OpenGL.glEnable(3042);
	else
	    OpenGL.glDisable(3042);
    }
    
    void method14970() {
	if (aBool9259)
	    OpenGL.glEnable(3042);
	else
	    OpenGL.glDisable(3042);
    }
    
    Interface41 method14886(int i, boolean bool, int[][] is) {
	return new Class486_Sub2(this, i, bool, is);
    }
    
    void method14781() {
	if (aBool9259)
	    OpenGL.glEnable(3042);
	else
	    OpenGL.glDisable(3042);
    }
    
    public final void method14972(Class374 class374, int i, int i_260_) {
	int i_261_;
	int i_262_;
	if (class374 == Class374.aClass374_3901) {
	    i_261_ = 1;
	    i_262_ = i_260_ * 2;
	} else if (class374 == Class374.aClass374_3896) {
	    i_261_ = 3;
	    i_262_ = i_260_ + 1;
	} else if (class374 == Class374.aClass374_3898) {
	    i_261_ = 4;
	    i_262_ = i_260_ * 3;
	} else if (class374 == Class374.aClass374_3895) {
	    i_261_ = 6;
	    i_262_ = i_260_ + 2;
	} else if (class374 == Class374.aClass374_3900) {
	    i_261_ = 5;
	    i_262_ = i_260_ + 2;
	} else {
	    i_261_ = 0;
	    i_262_ = i_260_;
	}
	OpenGL.glDrawArrays(i_261_, i, i_262_);
    }
    
    public final void method14870(Class374 class374, int i, int i_263_,
				  int i_264_, int i_265_) {
	int i_266_;
	int i_267_;
	if (class374 == Class374.aClass374_3901) {
	    i_266_ = 1;
	    i_267_ = i_265_ * 2;
	} else if (class374 == Class374.aClass374_3896) {
	    i_266_ = 3;
	    i_267_ = i_265_ + 1;
	} else if (class374 == Class374.aClass374_3898) {
	    i_266_ = 4;
	    i_267_ = i_265_ * 3;
	} else if (class374 == Class374.aClass374_3895) {
	    i_266_ = 6;
	    i_267_ = i_265_ + 2;
	} else if (class374 == Class374.aClass374_3900) {
	    i_266_ = 5;
	    i_267_ = i_265_ + 2;
	} else {
	    i_266_ = 0;
	    i_267_ = i_265_;
	}
	Class173 class173 = aClass476_Sub1_11587.method276();
	OpenGL.glDrawElements(i_266_, i_267_, method18074(class173),
			      (aClass476_Sub1_11587.method7776()
			       + (long) (i_264_ * (class173.anInt1825
						   * 1899960707))));
    }
    
    void method14931() {
	if (aBool9259)
	    OpenGL.glEnable(3042);
	else
	    OpenGL.glDisable(3042);
    }
    
    void method14858() {
	aFloatArray11598[0] = aFloat9205 * aFloat9159;
	aFloatArray11598[1] = aFloat9205 * aFloat9292;
	aFloatArray11598[2] = aFloat9205 * aFloat9163;
	aFloatArray11598[3] = 1.0F;
	OpenGL.glLightModelfv(2899, aFloatArray11598, 0);
    }
    
    byte[] method18089(String string) {
	return method14840("gl", string);
    }
    
    void method14697(boolean bool) {
	if (bool)
	    OpenGL.glEnable(32925);
	else
	    OpenGL.glDisable(32925);
    }
    
    Interface38 method14878(Class181 class181, Class173 class173, int i,
			    int i_268_) {
	return method14666(class181, class173, i, i_268_);
    }
    
    public void method3372(int i, int i_269_, int[] is, int[] is_270_) {
	method18063(i, i_269_, is, is_270_);
    }
    
    void method18090(int i, int i_271_) {
	method3280();
	method3616(i, i_271_, -14363336);
	if (aBool11596) {
	    aClass163_11571 = method3315(i, i_271_, false, true);
	    aClass175_Sub1_11603 = method3263();
	    aClass175_Sub1_11603.method15075(0, aClass163_11571.method2651());
	    OpenGL.glGenBuffersARB(3, anIntArray11576, 0);
	    for (int i_272_ = 0; i_272_ < 3; i_272_++) {
		OpenGL.glBindBufferARB(35051, anIntArray11576[i_272_]);
		OpenGL.glBufferDataARBa(35051, i * i_271_ * 4, 0L, 35041);
		OpenGL.glBindBufferARB(35051, 0);
	    }
	} else {
	    aClass163_11571 = method3315(i, i_271_, false, true);
	    aClass175_Sub1_11603 = method3263();
	    aClass175_Sub1_11603.method15075(0, aClass163_11571.method2651());
	}
    }
    
    public void method14973(Class433 class433) {
	float[] fs = class433.aFloatArray4853;
	fs[1] = -fs[1];
	fs[5] = -fs[5];
	fs[9] = -fs[9];
	fs[13] = -fs[13];
    }
    
    public void method3457(int i, int i_273_) {
	int i_274_ = 0;
	if ((i & 0x1) != 0) {
	    OpenGL.glClearColor((float) (i_273_ & 0xff0000) / 1.671168E7F,
				(float) (i_273_ & 0xff00) / 65280.0F,
				(float) (i_273_ & 0xff) / 255.0F,
				(float) (i_273_ >>> 24) / 255.0F);
	    i_274_ = 16384;
	}
	if ((i & 0x2) != 0) {
	    method14603(true);
	    i_274_ |= 0x100;
	}
	if ((i & 0x4) != 0)
	    i_274_ |= 0x400;
	OpenGL.glClear(i_274_);
    }
    
    void method14859() {
	aFloatArray11598[0] = aFloat9206 * aFloat9159;
	aFloatArray11598[1] = aFloat9206 * aFloat9292;
	aFloatArray11598[2] = aFloat9206 * aFloat9163;
	aFloatArray11598[3] = 1.0F;
	OpenGL.glLightfv(16384, 4609, aFloatArray11598, 0);
	aFloatArray11598[0] = -aFloat9267 * aFloat9159;
	aFloatArray11598[1] = -aFloat9267 * aFloat9292;
	aFloatArray11598[2] = -aFloat9267 * aFloat9163;
	aFloatArray11598[3] = 1.0F;
	OpenGL.glLightfv(16385, 4609, aFloatArray11598, 0);
    }
    
    static final int method18091(Class378 class378) {
	if (class378 == Class378.aClass378_3920)
	    return 7681;
	if (class378 == Class378.aClass378_3916)
	    return 8448;
	if (class378 == Class378.aClass378_3919)
	    return 34165;
	if (class378 == Class378.aClass378_3917)
	    return 260;
	if (class378 == Class378.aClass378_3915)
	    return 34023;
	throw new IllegalArgumentException();
    }
    
    public int[] method3410(int i, int i_275_, int i_276_, int i_277_) {
	int[] is = new int[i_276_ * i_277_];
	int i_278_ = aClass175_1989.method2911();
	for (int i_279_ = 0; i_279_ < i_277_; i_279_++)
	    OpenGL.glReadPixelsi(i, i_278_ - i_275_ - i_279_ - 1, i_276_, 1,
				 32993, anInt11590, is, i_279_ * i_276_);
	return is;
    }
    
    void method18092() {
	if (anInt9262 == 1)
	    OpenGL.glDisable(2884);
	else {
	    OpenGL.glEnable(2884);
	    if (anInt9262 == 2)
		OpenGL.glCullFace(1029);
	    else if (anInt9262 == 3)
		OpenGL.glCullFace(1028);
	}
    }
    
    final synchronized void method18093(int i, int i_280_) {
	Class534_Sub39 class534_sub39 = new Class534_Sub39(i_280_);
	class534_sub39.aLong7158 = (long) i * 936217890172187787L;
	aClass700_11578.method14131(class534_sub39, (short) 789);
    }
    
    final synchronized void method18094(int i, int i_281_) {
	Class534_Sub39 class534_sub39 = new Class534_Sub39(i_281_);
	class534_sub39.aLong7158 = (long) i * 936217890172187787L;
	aClass700_11569.method14131(class534_sub39, (short) 789);
    }
    
    void method14652() {
	if (aBool9146 && !aBool9196)
	    OpenGL.glEnable(2896);
	else
	    OpenGL.glDisable(2896);
    }
    
    final synchronized void method18095(int i) {
	Class534_Sub39 class534_sub39 = new Class534_Sub39(i);
	aClass700_11602.method14131(class534_sub39, (short) 789);
    }
    
    void method14815() {
	if (aClass175_1989 != null) {
	    int i = anInt9113 + anInt9178;
	    int i_282_ = anInt9189 + aClass175_1989.method2911() - anInt9177;
	    int i_283_ = anInt9179 - anInt9178;
	    int i_284_ = anInt9177 - anInt9176;
	    if (i_283_ < 0)
		i_283_ = 0;
	    if (i_284_ < 0)
		i_284_ = 0;
	    OpenGL.glScissor(i, i_282_, i_283_, i_284_);
	}
    }
    
    final synchronized void method18096(long l) {
	Class534 class534 = new Class534();
	class534.aLong7158 = l * 936217890172187787L;
	aClass700_11573.method14131(class534, (short) 789);
    }
    
    static int method18097(Class181 class181) {
	switch (class181.anInt1953 * -939549997) {
	case 0:
	    return 6408;
	case 4:
	    return 6407;
	default:
	    throw new IllegalStateException();
	case 1:
	    return 6410;
	case 3:
	    return 6402;
	case 8:
	    return 6406;
	case 6:
	    return 6409;
	}
    }
    
    public boolean method3269() {
	return aBool11596;
    }
    
    final synchronized void method18098(int i) {
	Class534 class534 = new Class534();
	class534.aLong7158 = (long) i * 936217890172187787L;
	aClass700_11572.method14131(class534, (short) 789);
    }
    
    static final int method18099(Class173 class173) {
	switch (class173.anInt1834 * -1414205941) {
	case 3:
	    return 5125;
	case 0:
	    return 5131;
	case 4:
	    return 5121;
	case 2:
	    return 5126;
	case 1:
	    return 5120;
	default:
	    return 5121;
	case 6:
	    return 5124;
	case 8:
	    return 5122;
	case 5:
	    return 5123;
	}
    }
    
    static int method18100(Class181 class181) {
	switch (class181.anInt1953 * -939549997) {
	case 0:
	    return 6408;
	case 4:
	    return 6407;
	default:
	    throw new IllegalStateException();
	case 1:
	    return 6410;
	case 3:
	    return 6402;
	case 8:
	    return 6406;
	case 6:
	    return 6409;
	}
    }
    
    void method14675() {
	OpenGL.glDepthFunc(515);
	method18087();
	OpenGL.glClearDepth(1.0F);
	OpenGL.glAlphaFunc(516, 0.0F);
	OpenGL.glPolygonMode(1028, 6914);
	if (aBool9260) {
	    method14697(anInt9263 > 1);
	    OpenGL.glDisable(32926);
	}
	for (int i = anInt9269 - 1; i >= 0; i--) {
	    OpenGL.glActiveTexture(33984 + i);
	    OpenGL.glTexEnvi(8960, 8704, 34160);
	    OpenGL.glTexEnvi(8960, 34161, 8448);
	    OpenGL.glTexEnvi(8960, 34178, 34166);
	    OpenGL.glTexEnvi(8960, 34162, 8448);
	    OpenGL.glTexEnvi(8960, 34186, 34166);
	}
	OpenGL.glTexEnvi(8960, 34186, 34168);
	OpenGL.glShadeModel(7425);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glColorMaterial(1028, 5634);
	OpenGL.glEnable(2903);
	float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
	for (int i = 0; i < 8; i++) {
	    int i_285_ = 16384 + i;
	    OpenGL.glLightfv(i_285_, 4608, fs, 0);
	    OpenGL.glLightf(i_285_, 4615, 0.0F);
	    OpenGL.glLightf(i_285_, 4616, 0.0F);
	}
	OpenGL.glFogf(2914, 0.95F);
	OpenGL.glFogi(2917, 9729);
	OpenGL.glHint(3156, 4353);
	anOpenGL11608.setSwapInterval(0);
	super.method14718();
    }
    
    public boolean method3421() {
	return false;
    }
    
    void method18101() {
	int i = 0;
	while (!anOpenGL11608.method1767()) {
	    if (i++ > 5)
		throw new RuntimeException("");
	    Class251.method4622(1000L);
	}
    }
}
