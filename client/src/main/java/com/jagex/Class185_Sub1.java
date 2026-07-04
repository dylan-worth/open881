/* Class185_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;

import jaclib.memory.DirectBufferHelper;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;

import sun.misc.Unsafe;

public abstract class Class185_Sub1 extends Class185
{
    protected int anInt9113;
    Class77 aClass77_9114 = new Class77();
    static final int anInt9115 = 128;
    static final int anInt9116 = 1;
    protected Class378[] aClass378Array9117;
    Class433 aClass433_9118;
    static final int anInt9119 = 8;
    static final int anInt9120 = 16;
    static final int anInt9121 = 55;
    static final int anInt9122 = 7;
    protected static final int anInt9123 = 100663296;
    Class472 aClass472_9124;
    protected boolean aBool9125;
    int[] anIntArray9126;
    protected Unsafe anUnsafe9127;
    Class183_Sub3[] aClass183_Sub3Array9128;
    protected int anInt9129;
    static final int anInt9130 = 4194304;
    protected boolean aBool9131;
    Class340 aClass340_9132;
    NativeHeap aNativeHeap9133;
    static final int anInt9134 = 1;
    public int anInt9135;
    public int anInt9136;
    protected int anInt9137;
    Class446 aClass446_9138;
    public long aLong9139;
    Class446 aClass446_9140;
    Class446 aClass446_9141;
    public Class433 aClass433_9142;
    Class349 aClass349_9143;
    Class433 aClass433_9144;
    Class433 aClass433_9145;
    protected boolean aBool9146;
    Class371 aClass371_9147;
    float aFloat9148;
    Interface39 anInterface39_9149;
    Class433 aClass433_9150;
    Class438 aClass438_9151;
    protected float aFloat9152;
    boolean aBool9153;
    Class336 aClass336_9154;
    Class700 aClass700_9155;
    float[] aFloatArray9156;
    protected float aFloat9157;
    Class324 aClass324_9158;
    public float aFloat9159;
    Class433 aClass433_9160;
    protected boolean aBool9161;
    boolean aBool9162;
    public float aFloat9163;
    public Class433 aClass433_9164;
    float[][] aFloatArrayArray9165;
    Class446 aClass446_9166;
    float aFloat9167;
    float aFloat9168;
    float aFloat9169;
    Class433 aClass433_9170;
    Class355 aClass355_9171;
    static final int anInt9172 = 4;
    float aFloat9173;
    protected float aFloat9174;
    protected float aFloat9175;
    protected int anInt9176;
    protected int anInt9177;
    protected int anInt9178;
    protected int anInt9179;
    int anInt9180;
    static final int anInt9181 = 2;
    Class433 aClass433_9182;
    int anInt9183;
    protected int anInt9184;
    protected int anInt9185;
    protected int anInt9186;
    int anInt9187;
    protected int anInt9188;
    protected int anInt9189;
    protected boolean aBool9190;
    protected boolean aBool9191;
    Class359 aClass359_9192;
    protected boolean aBool9193;
    protected Class433 aClass433_9194;
    protected boolean aBool9195;
    protected boolean aBool9196;
    public float[] aFloatArray9197;
    protected float[] aFloatArray9198;
    float[] aFloatArray9199;
    float[] aFloatArray9200;
    int anInt9201;
    public Class433 aClass433_9202;
    Class433 aClass433_9203;
    public Interface38 anInterface38_9204;
    protected float aFloat9205;
    public float aFloat9206;
    int anInt9207;
    protected Class534_Sub21[] aClass534_Sub21Array9208;
    protected int anInt9209;
    protected int anInt9210;
    Class354 aClass354_9211;
    int anInt9212;
    int anInt9213;
    Class446 aClass446_9214;
    protected int anInt9215;
    Class349 aClass349_9216;
    protected Class433[] aClass433Array9217;
    protected Class364[] aClass364Array9218;
    protected Class378[] aClass378Array9219;
    Interface43[] anInterface43Array9220;
    protected int anInt9221;
    boolean aBool9222;
    boolean aBool9223;
    Interface38 anInterface38_9224;
    Class163_Sub2 aClass163_Sub2_9225;
    Interface37 anInterface37_9226;
    static Class433 aClass433_9227;
    Class433 aClass433_9228;
    Class348 aClass348_9229;
    Class348[] aClass348Array9230;
    boolean aBool9231;
    Class320 aClass320_9232;
    Class314 aClass314_9233;
    Class323 aClass323_9234;
    Class348_Sub1_Sub2 aClass348_Sub1_Sub2_9235;
    Class348_Sub1_Sub2 aClass348_Sub1_Sub2_9236;
    Class348_Sub1_Sub1 aClass348_Sub1_Sub1_9237;
    protected int anInt9238;
    Class380 aClass380_9239;
    static final int anInt9240 = 2;
    static final int anInt9241 = 3;
    static final int anInt9242 = 4;
    int anInt9243 = 0;
    Class165_Sub2 aClass165_Sub2_9244;
    Class446 aClass446_9245;
    boolean aBool9246;
    int anInt9247;
    protected boolean aBool9248;
    protected boolean aBool9249;
    protected boolean aBool9250;
    protected int anInt9251;
    protected int anInt9252;
    Class343[] aClass343Array9253;
    protected float aFloat9254;
    protected float aFloat9255;
    int anInt9256;
    float aFloat9257;
    protected Class370 aClass370_9258;
    protected boolean aBool9259;
    protected boolean aBool9260;
    protected byte aByte9261;
    protected int anInt9262;
    public int anInt9263;
    public int anInt9264;
    int anInt9265;
    public ByteBuffer aByteBuffer9266;
    protected float aFloat9267;
    int anInt9268;
    public int anInt9269;
    protected int anInt9270;
    public boolean aBool9271;
    protected boolean aBool9272;
    protected boolean aBool9273;
    Class433 aClass433_9274;
    protected boolean aBool9275;
    public boolean aBool9276;
    protected boolean aBool9277;
    Class163_Sub2 aClass163_Sub2_9278;
    Interface37 anInterface37_9279;
    Class166 aClass166_9280;
    Interface37 anInterface37_9281;
    Class349 aClass349_9282;
    int anInt9283;
    Class433 aClass433_9284;
    Class349 aClass349_9285;
    Class349 aClass349_9286;
    int anInt9287;
    Class433 aClass433_9288;
    boolean aBool9289;
    Class183_Sub3[] aClass183_Sub3Array9290;
    static Object anObject9291 = new Object();
    public float aFloat9292;
    Class349 aClass349_9293;
    protected boolean aBool9294;
    
    final void method14581() {
	method14839();
    }
    
    public void method14582(Interface36 interface36) {
	aClass77_9114.method1599(interface36, (byte) 5);
    }
    
    void method14583() {
	ArrayList arraylist = aClass77_9114.method1595(798620100);
	Iterator iterator = arraylist.iterator();
	while (iterator.hasNext()) {
	    Interface36 interface36 = (Interface36) iterator.next();
	    interface36.method142();
	}
    }
    
    public final void method3349(Class165 class165) {
	aClass165_Sub2_9244 = (Class165_Sub2) class165;
    }
    
    public final void method3466(int[] is) {
	is[0] = anInt9178;
	is[1] = anInt9176;
	is[2] = anInt9179;
	is[3] = anInt9177;
    }
    
    public abstract boolean method14584(boolean bool);
    
    final boolean method14585() {
	return aBool9125;
    }
    
    public void method14586(int i) {
	if (i > anInt9243) {
	    anInt9243 = i;
	    aByteBuffer9266 = ByteBuffer.allocateDirect(anInt9243);
	    aByteBuffer9266.order(ByteOrder.nativeOrder());
	    aLong9139
		= DirectBufferHelper.getDirectBufferAddress(aByteBuffer9266);
	}
    }
    
    ByteBuffer method14587(int i) {
	ByteBuffer bytebuffer = ByteBuffer.allocateDirect(i);
	bytebuffer.order(ByteOrder.nativeOrder());
	return bytebuffer;
    }
    
    long method14588(ByteBuffer bytebuffer) {
	return DirectBufferHelper.getDirectBufferAddress(bytebuffer);
    }
    
    public abstract Class269 method14589(String string);
    
    public abstract boolean method14590(boolean bool);
    
    Class261 method14591(byte[] is) {
	if (is == null)
	    return null;
	Class261 class261;
	try {
	    class261 = new Class261(is);
	} catch (Exception exception) {
	    return null;
	}
	return class261;
    }
    
    public final void method3506(Class446 class446) {
	aClass446_9140 = class446;
	aClass433_9142.method6916(aClass446_9140);
	aClass433_9144.method6842(aClass433_9142);
	aClass433_9144.method6867();
	aClass446_9141.method7236(class446);
	aClass446_9141.method7243();
	aClass433_9118.method6916(aClass446_9141);
	method14656();
	if (aClass336_9154 == Class336.aClass336_3518)
	    method14627();
    }
    
    boolean method14592() {
	if (aClass343Array9253[1] != null
	    && !aClass343Array9253[1].method6070()) {
	    boolean bool = aClass355_9171.method6283(aClass343Array9253[1]);
	    if (bool)
		aClass354_9211.method6274();
	    return bool;
	}
	return false;
    }
    
    final void method14593() {
	if (aClass336_9154 != Class336.aClass336_3519) {
	    Class336 class336 = aClass336_9154;
	    aClass336_9154 = Class336.aClass336_3519;
	    if (class336 == Class336.aClass336_3518)
		method14627();
	    method14602();
	    aClass433_9228 = aClass433_9170;
	    method14640();
	    method14955();
	    anInt9265 &= ~0x18;
	}
    }
    
    public final void method14594() {
	anInterface43Array9220 = new Interface43[anInt9269];
	aClass433Array9217 = new Class433[anInt9269];
	aClass364Array9218 = new Class364[anInt9269];
	aClass378Array9219 = new Class378[anInt9269];
	aClass378Array9117 = new Class378[anInt9269];
	for (int i = 0; i < anInt9269; i++) {
	    aClass378Array9117[i] = Class378.aClass378_3916;
	    aClass378Array9219[i] = Class378.aClass378_3916;
	    aClass364Array9218[i] = Class364.aClass364_3725;
	    aClass433Array9217[i] = new Class433();
	}
	aClass534_Sub21Array9208 = new Class534_Sub21[anInt9270 - 2];
	int[] is = { -1 };
	anInterface38_9204 = method14772(1, 1, false, is, 0, 0);
	is[0] = -16777216;
	anInterface38_9224 = method14772(1, 1, false, is, 0, 0);
	method3538(new Class534_Sub2_Sub1(262144));
	aClass349_9286
	    = method14699(new Class381[]
			  { new Class381(new Class350[]
					 { Class350.aClass350_3610,
					   Class350.aClass350_3597 }) });
	aClass349_9293
	    = method14699(new Class381[]
			  { new Class381(new Class350[]
					 { Class350.aClass350_3610,
					   Class350.aClass350_3595 }) });
	aClass349_9285
	    = method14699(new Class381[]
			  { new Class381(Class350.aClass350_3610),
			    new Class381(Class350.aClass350_3595),
			    new Class381(Class350.aClass350_3597),
			    new Class381(Class350.aClass350_3594) });
	aClass349_9216
	    = method14699(new Class381[]
			  { new Class381(Class350.aClass350_3610),
			    new Class381(Class350.aClass350_3595),
			    new Class381(Class350.aClass350_3597) });
	for (int i = 0; i < 8; i++) {
	    aClass183_Sub3Array9128[i]
		= new Class183_Sub3(this, 0, 0, false, false);
	    aClass183_Sub3Array9290[i]
		= new Class183_Sub3(this, 0, 0, true, true);
	}
	method14776();
	anInterface39_9149 = method14971(true);
	method14718();
	method3537();
	method3268();
	aClass163_Sub2_9225 = new Class163_Sub2(this, anInterface38_9204);
	aClass163_Sub2_9278 = new Class163_Sub2(this, anInterface38_9224);
	method3340(3, 0);
    }
    
    public void method3479(Class446 class446, Class194 class194,
			   Class432 class432) {
	Class433 class433 = aClass433_9194;
	class433.method6916(class446);
	class433.method6839(aClass433_9284);
	class194.method3800(class432, aClass433_9203, class433, aFloat9257,
			    aFloat9168, aFloat9167, aFloat9169);
    }
    
    public final Class433 method3591() {
	return aClass433_9145;
    }
    
    final void method14595() {
	method14724();
	method14654();
	method14652();
	method14605();
	method14763();
	method14783();
	method14655();
	method14643();
	method14644();
	method14722();
	method14752();
	method14693();
	method14692();
	method14691();
	for (int i = anInt9269 - 1; i >= 0; i--) {
	    method14668(i);
	    method14683();
	    method14684();
	    method14680();
	}
	method14681();
	method14620();
    }
    
    void method14596() {
	if (aClass355_9171 != null)
	    aClass355_9171.method6289();
	if (anInterface37_9226 != null)
	    anInterface37_9226.method142();
	if (anInterface37_9279 != null)
	    anInterface37_9279.method142();
	if (anInterface37_9281 != null)
	    anInterface37_9281.method142();
	if (aClass380_9239 != null)
	    aClass380_9239.method6431();
	for (int i = 0; i < 8; i++) {
	    if (aClass183_Sub3Array9290[i] != null)
		aClass183_Sub3Array9290[i].method15518();
	}
	if (aClass359_9192 != null)
	    aClass359_9192.method6317();
	if (anInterface39_9149 != null)
	    anInterface39_9149.method142();
	if (aClass371_9147 != null) {
	    aClass371_9147.method6382();
	    aClass371_9147 = null;
	}
    }
    
    void method14597() {
	if (aClass355_9171 != null)
	    aClass355_9171.method6294();
	if (aClass343Array9253 != null) {
	    for (int i = 0; i < aClass343Array9253.length; i++) {
		if (aClass343Array9253[i] != null
		    && aClass343Array9253[i].method6070())
		    aClass343Array9253[i].method6062();
	    }
	}
	aClass359_9192 = new Class359(this);
	method14598();
	method14606();
	method14600();
	aClass380_9239 = new Class380(this, 1024);
	aClass359_9192.method6318(this);
	if (aBool9271)
	    aClass371_9147 = new Class371(this, 1024);
    }
    
    final void method14598() {
	anInterface37_9226 = method14698(false);
	int i = 160;
	anInterface37_9226.method236(i, 32);
	aByteBuffer9266.clear();
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putInt(-1);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putInt(-1);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putInt(-1);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putInt(-1);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putInt(-1);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	anInterface37_9226.method235(0, aByteBuffer9266.position(), aLong9139);
	aClass349_9143
	    = method14699(new Class381[]
			  { new Class381(new Class350[]
					 { Class350.aClass350_3610,
					   Class350.aClass350_3595,
					   Class350.aClass350_3597,
					   Class350.aClass350_3597 }) });
    }
    
    public final void method14599(int i, Class373 class373) {
	method14801(i, class373, false);
    }
    
    final void method14600() {
	anInterface37_9281 = method14698(false);
	anInterface37_9281.method236(3096, 12);
	aByteBuffer9266.clear();
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	for (int i = 0; i <= 256; i++) {
	    double d = (double) (i * 2) * 3.141592653589793 / 256.0;
	    float f = (float) Math.cos(d);
	    float f_0_ = (float) Math.sin(d);
	    aByteBuffer9266.putFloat(f_0_);
	    aByteBuffer9266.putFloat(f);
	    aByteBuffer9266.putFloat(0.0F);
	}
	anInterface37_9281.method235(0, aByteBuffer9266.position(), aLong9139);
    }
    
    boolean method14601(float f, float f_1_, float f_2_, float f_3_,
			float f_4_, float f_5_) {
	method14586(24);
	aByteBuffer9266.clear();
	aByteBuffer9266.putFloat(f);
	aByteBuffer9266.putFloat(f_1_);
	aByteBuffer9266.putFloat(f_2_);
	aByteBuffer9266.putFloat(f_3_);
	aByteBuffer9266.putFloat(f_4_);
	aByteBuffer9266.putFloat(f_5_);
	return anInterface37_9279.method235(0, aByteBuffer9266.position(),
					    aLong9139);
    }
    
    void method3327() {
	if (!aBool9162) {
	    method14596();
	    aClass354_9211.method6274();
	    for (Class534 class534 = aClass700_9155.method14135((byte) -1);
		 class534 != null;
		 class534 = aClass700_9155.method14139(1765498002))
		((Class534_Sub2_Sub1) class534).method18118();
	    Class54.method1212(false, true, -1459366739);
	    for (int i = 0; i < aClass348Array9230.length; i++) {
		if (aClass348Array9230[i] != null) {
		    aClass348Array9230[i].method6160();
		    aClass348Array9230[i] = null;
		}
	    }
	    for (int i = 0; i < aClass343Array9253.length; i++) {
		if (aClass343Array9253[i] != null) {
		    aClass343Array9253[i].method6071();
		    aClass343Array9253[i] = null;
		}
	    }
	    method14583();
	    method3661(0);
	    aBool9162 = true;
	}
    }
    
    final void method14602() {
	if (!aBool9223) {
	    int i;
	    int i_6_;
	    if (aClass175_1989 != null) {
		i_6_ = aClass175_1989.method2910();
		i = aClass175_1989.method2911();
	    } else {
		i = 0;
		i_6_ = 0;
	    }
	    Class433 class433 = aClass433_9170;
	    if (i_6_ != 0 && i != 0)
		class433.method6853(0.0F, (float) i_6_, 0.0F, (float) i, -1.0F,
				    1.0F);
	    else
		class433.method6840();
	    aClass433_9274.method6842(class433);
	    method14739(aClass433_9274);
	    aBool9223 = true;
	}
    }
    
    public final boolean method3241() {
	return true;
    }
    
    public final boolean method3242() {
	return true;
    }
    
    public final boolean method3534() {
	return aClass343Array9253[3] != null;
    }
    
    public final boolean method3404() {
	return true;
    }
    
    public final Class145 method3480(int i, int i_7_, int[] is, int[] is_8_) {
	return Class145_Sub1.method15072(this, i, i_7_, is, is_8_);
    }
    
    final void method14603(boolean bool) {
	if (bool != aBool9191) {
	    aBool9191 = bool;
	    method14644();
	    anInt9265 &= ~0x1f;
	}
    }
    
    public final boolean method3333() {
	return true;
    }
    
    public final boolean method3249() {
	return false;
    }
    
    public final boolean method3246() {
	return aBool9260;
    }
    
    final void method14604() {
	if (method14585())
	    method14686();
	anInt9209 = anInt9129;
    }
    
    public abstract String method3250();
    
    final void method14605() {
	if (method14585())
	    method14686();
	anInt9209 = anInt9129;
    }
    
    public void method3661(int i) {
	if (aClass354_9211 != null)
	    aClass354_9211.method6266();
	anInt9264 = i & 0x7fffffff;
    }
    
    final void method14606() {
	anInterface37_9279 = method14698(true);
	int i = 24;
	anInterface37_9279.method236(i, 12);
	aClass349_9282
	    = method14699(new Class381[]
			  { new Class381(Class350.aClass350_3610) });
    }
    
    public void method3581() {
	if (aClass371_9147 != null)
	    aClass371_9147.method6383();
    }
    
    public void method3559() {
	if (aClass371_9147 != null)
	    aClass371_9147.method6387();
    }
    
    public final Class433 method3339() {
	return aClass433_9203;
    }
    
    void method14607() {
	method14913();
    }
    
    public final void method14608(Class378 class378, Class378 class378_9_) {
	boolean bool = false;
	if (aClass378Array9219[anInt9215] != class378) {
	    aClass378Array9219[anInt9215] = class378;
	    method14683();
	    bool = true;
	}
	if (aClass378Array9117[anInt9215] != class378_9_) {
	    aClass378Array9117[anInt9215] = class378_9_;
	    method14684();
	    bool = true;
	}
	if (bool)
	    anInt9265 &= ~0x1d;
    }
    
    public final Class163 method3319(int i, int i_10_, int i_11_, int i_12_,
				     boolean bool) {
	Class163_Sub2 class163_sub2
	    = new Class163_Sub2(this, i_11_, i_12_, bool, false);
	class163_sub2.method2717(0, 0, i_11_, i_12_, i, i_10_);
	return class163_sub2;
    }
    
    public final void method3492(int i) {
	/* empty */
    }
    
    public final boolean method3352() {
	return aClass355_9171 != null && aClass355_9171.aBool3661;
    }
    
    abstract void method14609();
    
    public final boolean method3608() {
	return false;
    }
    
    final void method14610() {
	method14733(0, anInterface37_9279);
	method14700(aClass349_9282);
	method14708(Class374.aClass374_3901, 0, 1);
    }
    
    public final void method3507(Class446 class446) {
	aClass446_9140 = class446;
	aClass433_9142.method6916(aClass446_9140);
	aClass433_9144.method6842(aClass433_9142);
	aClass433_9144.method6867();
	aClass446_9141.method7236(class446);
	aClass446_9141.method7243();
	aClass433_9118.method6916(aClass446_9141);
	method14656();
	if (aClass336_9154 == Class336.aClass336_3518)
	    method14627();
    }
    
    boolean method14611() {
	if (aClass343Array9253[2] != null
	    && !aClass343Array9253[2].method6070()) {
	    boolean bool = aClass355_9171.method6283(aClass343Array9253[2]);
	    if (bool)
		aClass354_9211.method6274();
	    return bool;
	}
	return false;
    }
    
    public final void method3363(int i, Class166 class166) {
	anInt9247 = i;
	aClass166_9280 = class166;
	aBool9231 = true;
    }
    
    public void method3357(Class170 class170, float f, Class170 class170_13_,
			   float f_14_, Class170 class170_15_, float f_16_) {
	int i = 0;
	if (class170_15_ == null && f_16_ > 0.0F)
	    f_16_ = 0.0F;
	if (class170_13_ == null && f_14_ > 0.0F) {
	    class170_13_ = class170_15_;
	    class170_15_ = null;
	    f_14_ = f_16_;
	    f_16_ = 0.0F;
	}
	if (class170 == null && f > 0.0F) {
	    class170 = class170_13_;
	    class170_13_ = class170_15_;
	    class170_15_ = null;
	    f = f_14_;
	    f_14_ = f_16_;
	    f_16_ = 0.0F;
	}
	Class343_Sub3.aClass170_Sub1Array10274[0] = (Class170_Sub1) class170;
	Class343_Sub3.aFloatArray10266[0] = f;
	if (f > 0.0F)
	    i++;
	Class343_Sub3.aClass170_Sub1Array10274[1]
	    = (Class170_Sub1) class170_13_;
	Class343_Sub3.aFloatArray10266[1] = f_14_;
	if (f_14_ > 0.0F)
	    i++;
	Class343_Sub3.aClass170_Sub1Array10274[2]
	    = (Class170_Sub1) class170_15_;
	Class343_Sub3.aFloatArray10266[2] = f_16_;
	if (f_16_ > 0.0F)
	    i++;
	Class343_Sub3.anInt10272 = i;
	Class343_Sub3.aFloat10268 = 1.0F - (f + f_14_ + f_16_);
    }
    
    public final boolean method3358() {
	if (aClass343Array9253[3] != null
	    && !aClass343Array9253[3].method6070()) {
	    boolean bool = aClass355_9171.method6283(aClass343Array9253[3]);
	    if (bool)
		aClass354_9211.method6274();
	    return bool;
	}
	return false;
    }
    
    public void method14612(int i) {
	if (i != anInt9221) {
	    anInt9221 = i;
	    method14681();
	}
    }
    
    public final void method3359() {
	if (aClass343Array9253[3] != null
	    && aClass343Array9253[3].method6070()) {
	    aClass355_9171.method6287(aClass343Array9253[3]);
	    aClass354_9211.method6274();
	}
    }
    
    final void method3362(float f, float f_17_, float f_18_, float f_19_,
			  float f_20_, float f_21_) {
	Class343_Sub1.aFloat10178 = f;
	Class343_Sub1.aFloat10177 = f_17_;
	Class343_Sub1.aFloat10179 = f_18_;
	Class343_Sub1.aFloat10191 = f_21_;
    }
    
    public final boolean method3585() {
	return true;
    }
    
    public final void method3538(Class534_Sub2 class534_sub2) {
	aNativeHeap9133
	    = ((Class534_Sub2_Sub1) class534_sub2).aNativeHeap11652;
    }
    
    final void method14613() {
	if (aClass336_9154 != Class336.aClass336_3518) {
	    aClass336_9154 = Class336.aClass336_3518;
	    method14627();
	    method14639();
	    aClass433_9228 = aClass433_9203;
	    method14640();
	    method14955();
	    anInt9265 &= ~0x7;
	}
    }
    
    public final void method3588(int i, Class145 class145, int i_22_,
				 int i_23_) {
	method3461(false);
	aClass163_Sub2_9278.method2673
	    (0.0F, 0.0F, (float) method3253(-1216261370).method2910(), 0.0F,
	     0.0F, (float) method3253(-1285433103).method2911(), 0, class145,
	     i_22_, i_23_);
	method3461(true);
    }
    
    public final void method3291(int i, int i_24_, int i_25_, int i_26_,
				 int i_27_, int i_28_) {
	i_25_--;
	i_26_--;
	int i_29_ = 0;
	if (this instanceof Class185_Sub1_Sub2)
	    i_29_ = -1;
	if (aBool9260 && anInt9263 != 0)
	    method14697(false);
	method3303(i, i_24_ + i_29_, i + i_25_, i_24_ + i_29_, i_27_, i_28_);
	method3303(i, i_24_ + i_26_ + i_29_, i + i_25_, i_24_ + i_26_ + i_29_,
		   i_27_, i_28_);
	method3303(i, i_24_, i, i_24_ + i_26_, i_27_, i_28_);
	method3303(i + i_25_, i_24_, i + i_25_, i_24_ + i_26_, i_27_, i_28_);
	if (aBool9260 && anInt9263 != 0)
	    method14697(true);
    }
    
    public final Class163 method3315(int i, int i_30_, boolean bool,
				     boolean bool_31_) {
	return new Class163_Sub2(this, i, i_30_, bool, bool_31_);
    }
    
    public final Class163 method3279(Class169 class169, boolean bool) {
	Class163 class163;
	if (class169.method2762() != 0 && class169.method2763() != 0) {
	    int[] is = class169.method2766(false);
	    class163 = method3317(is, 0, class169.method2762(),
				  class169.method2762(), class169.method2763(),
				  (byte) -75);
	} else
	    class163 = method3317(new int[] { 0 }, 0, 1, 1, 1, (byte) -1);
	class163.method2645(class169.method2764(), class169.method2781(),
			    class169.method2765(), class169.method2767());
	return class163;
    }
    
    public final Class163 method3316(int[] is, int i, int i_32_, int i_33_,
				     int i_34_, boolean bool) {
	return new Class163_Sub2(this, i_33_, i_34_, is, i, i_32_);
    }
    
    final Class433 method14614() {
	if (aClass336_9154 == Class336.aClass336_3518)
	    return aClass433_9118;
	return aClass433_9227;
    }
    
    final void method14615() {
	method14724();
	method14654();
	method14652();
	method14605();
	method14763();
	method14783();
	method14655();
	method14643();
	method14644();
	method14722();
	method14752();
	method14693();
	method14692();
	method14691();
	for (int i = anInt9269 - 1; i >= 0; i--) {
	    method14668(i);
	    method14683();
	    method14684();
	    method14680();
	}
	method14681();
	method14620();
    }
    
    public final Class145 method3643(int i, int i_35_, int[] is,
				     int[] is_36_) {
	return Class145_Sub1.method15072(this, i, i_35_, is, is_36_);
    }
    
    public final void method3328(int i) {
	/* empty */
    }
    
    public final Class183 method3329(Class187 class187, int i, int i_37_,
				     int i_38_, int i_39_) {
	return new Class183_Sub3(this, class187, i, i_38_, i_39_, i_37_);
    }
    
    public final int method3330(int i, int i_40_) {
	return i & i_40_ ^ i_40_;
    }
    
    public final int method3331(int i, int i_41_) {
	return i | i_41_;
    }
    
    public final Class151 method3332(int i, int i_42_, int[][] is,
				     int[][] is_43_, int i_44_, int i_45_,
				     int i_46_) {
	return new Class151_Sub2(this, i_45_, i_46_, i, i_42_, is, is_43_,
				 i_44_);
    }
    
    public final Class433 method3518() {
	return aClass433_9145;
    }
    
    public final Class446 method3665() {
	return aClass446_9245;
    }
    
    public final Class165 method3485(int i) {
	return new Class165_Sub2_Sub1(this, i);
    }
    
    public void method3446() {
	if (aClass371_9147 != null)
	    aClass371_9147.method6390();
    }
    
    public final Interface41 method14616() {
	return (aClass165_Sub2_9244 != null ? aClass165_Sub2_9244.method15565()
		: null);
    }
    
    public void method3281() {
	anInt9180 = 0;
	anInt9256 = 0;
	anInt9207 = aClass175_1989.method2910();
	anInt9183 = aClass175_1989.method2911();
	method14955();
    }
    
    public final boolean method3240() {
	return true;
    }
    
    public void method3283(int[] is) {
	is[0] = anInt9180;
	is[1] = anInt9256;
	is[2] = anInt9207;
	is[3] = anInt9183;
    }
    
    public void method3590(float f, float f_47_, float f_48_, float f_49_,
			   float f_50_) {
	Class343_Sub2.aFloat10232 = f;
	Class343_Sub2.aFloat10233 = f_47_;
	Class343_Sub2.aFloat10227 = f_48_;
	Class343_Sub2.aFloat10235 = f_49_;
	Class343_Sub2.aFloat10236 = f_50_;
    }
    
    public void method14617(Interface36 interface36) {
	aClass77_9114.method1593(interface36, anObject9291, (byte) -22);
    }
    
    public final void method3360(int[] is) {
	is[0] = anInt9178;
	is[1] = anInt9176;
	is[2] = anInt9179;
	is[3] = anInt9177;
    }
    
    public final void method3537() {
	if (aClass175_1989 != null) {
	    anInt9176 = 0;
	    anInt9178 = 0;
	    anInt9179 = aClass175_1989.method2910();
	    anInt9177 = aClass175_1989.method2911();
	} else {
	    anInt9177 = 0;
	    anInt9179 = 0;
	    anInt9176 = 0;
	    anInt9178 = 0;
	}
	if (aBool9294) {
	    aBool9294 = false;
	    method14622();
	}
    }
    
    public final void method3373(int i, int i_51_, int i_52_, int i_53_) {
	int i_54_;
	int i_55_;
	if (aClass175_1989 != null) {
	    i_55_ = aClass175_1989.method2910();
	    i_54_ = aClass175_1989.method2911();
	} else {
	    i_54_ = 0;
	    i_55_ = 0;
	}
	if (i <= 0 && i_52_ >= i_55_ - 1 && i_51_ <= 0 && i_53_ >= i_54_ - 1)
	    method3537();
	else {
	    anInt9178 = i >= 0 ? i : 0;
	    anInt9179 = i_52_ <= i_55_ ? i_52_ : i_55_;
	    anInt9176 = i_51_ >= 0 ? i_51_ : 0;
	    anInt9177 = i_53_ <= i_54_ ? i_53_ : i_54_;
	    if (!aBool9294
		&& (aBool9289 || method14703() == Class353.aClass353_3655)) {
		aBool9294 = true;
		method14622();
	    }
	    if (aBool9294)
		method14621();
	}
    }
    
    public final void method3282(int i, int i_56_, int i_57_, int i_58_) {
	int i_59_;
	int i_60_;
	if (aClass175_1989 != null) {
	    i_60_ = aClass175_1989.method2910();
	    i_59_ = aClass175_1989.method2911();
	} else {
	    i_59_ = 0;
	    i_60_ = 0;
	}
	i = i >= 0 ? i : 0;
	i_57_ = i_57_ <= i_60_ ? i_57_ : i_60_;
	i_56_ = i_56_ >= 0 ? i_56_ : 0;
	i_58_ = i_58_ <= i_59_ ? i_58_ : i_59_;
	boolean bool = false;
	if (anInt9178 < i) {
	    anInt9178 = i;
	    bool = true;
	}
	if (anInt9179 > i_57_) {
	    anInt9179 = i_57_;
	    bool = true;
	}
	if (anInt9176 < i_56_) {
	    anInt9176 = i_56_;
	    bool = true;
	}
	if (anInt9177 > i_58_) {
	    anInt9177 = i_58_;
	    bool = true;
	}
	if (bool) {
	    if (!aBool9294
		&& (aBool9289 || method14703() == Class353.aClass353_3655)) {
		aBool9294 = true;
		method14622();
	    }
	    if (aBool9294)
		method14621();
	}
    }
    
    final void method14618(int i, int i_61_) {
	anInt9113 = i;
	anInt9189 = i_61_;
	method14620();
	if (!aBool9294
	    && (aBool9289 || method14703() == Class353.aClass353_3655)) {
	    aBool9294 = true;
	    method14622();
	}
	if (aBool9294)
	    method14621();
    }
    
    abstract Interface35 method14619(Class181 class181, int i, int i_62_,
				     int i_63_, boolean bool, byte[] is);
    
    abstract void method14620();
    
    abstract void method14621();
    
    abstract void method14622();
    
    final Class433 method14623() {
	if (aClass336_9154 == Class336.aClass336_3518)
	    return aClass433_9142;
	return aClass433_9227;
    }
    
    final Class433 method14624() {
	if (aClass336_9154 == Class336.aClass336_3518)
	    return aClass433_9118;
	return aClass433_9227;
    }
    
    public final void method3335(Class446 class446) {
	aClass446_9140 = class446;
	aClass433_9142.method6916(aClass446_9140);
	aClass433_9144.method6842(aClass433_9142);
	aClass433_9144.method6867();
	aClass446_9141.method7236(class446);
	aClass446_9141.method7243();
	aClass433_9118.method6916(aClass446_9141);
	method14656();
	if (aClass336_9154 == Class336.aClass336_3518)
	    method14627();
    }
    
    public Class446 method3532() {
	return aClass446_9140;
    }
    
    final Interface38 method14625(Class181 class181, int i, int i_64_,
				  boolean bool, float[] fs) {
	return method14663(class181, i, i_64_, bool, fs, 0, 0);
    }
    
    public final void method3307(int i, int i_65_, int i_66_, int i_67_,
				 int i_68_, int i_69_, int i_70_) {
	i += 1.0F;
	i_65_ += 1.0F;
	i_66_ += 1.0F;
	i_67_ += 1.0F;
	float f = (float) (i_66_ - i);
	float f_71_ = (float) (i_67_ - i_65_);
	float f_72_
	    = 1.0F / (float) Math.sqrt((double) (f * f + f_71_ * f_71_));
	f *= f_72_;
	f_71_ *= f_72_;
	i -= f;
	i_65_ -= f_71_;
	float f_73_ = -f_71_;
	float f_74_ = f;
	f_73_ *= 0.5F * (float) i_69_;
	f_74_ *= 0.5F * (float) i_69_;
	aClass163_Sub2_9225.method2703((float) i - f_73_,
				       (float) i_65_ - f_74_,
				       (float) i_66_ - f_73_,
				       (float) i_67_ - f_74_,
				       (float) i + f_73_,
				       (float) i_65_ + f_74_, 0, i_68_, i_70_);
    }
    
    public abstract boolean method14626();
    
    final void method14627() {
	aBool9153 = false;
    }
    
    Class433 method14628() {
	return aClass433_9182;
    }
    
    Class446 method14629() {
	if (aClass336_9154 == Class336.aClass336_3518) {
	    if (!aBool9153) {
		aClass446_9214.method7236(aClass446_9138);
		aClass446_9214.method7253(aClass446_9140);
		aClass433_9288.method6916(aClass446_9214);
		aBool9153 = true;
	    }
	    return aClass446_9214;
	}
	return aClass446_9138;
    }
    
    Class433 method14630() {
	if (aClass336_9154 == Class336.aClass336_3518) {
	    if (!aBool9153)
		method14629();
	    return aClass433_9288;
	}
	return aClass433_9182;
    }
    
    final Class433 method14631() {
	return aClass433_9164;
    }
    
    final Class433 method14632() {
	return aClass433_9202;
    }
    
    final void method14633() {
	if (aClass336_9154 != Class336.aClass336_3518) {
	    aClass336_9154 = Class336.aClass336_3518;
	    method14627();
	    method14639();
	    aClass433_9228 = aClass433_9203;
	    method14640();
	    method14955();
	    anInt9265 &= ~0x7;
	}
    }
    
    final void method14634() {
	if (aClass336_9154 != Class336.aClass336_3520) {
	    Class336 class336 = aClass336_9154;
	    aClass336_9154 = Class336.aClass336_3520;
	    if (class336 == Class336.aClass336_3518)
		method14627();
	    aClass433_9228 = aClass433_9160;
	    method14640();
	    method14955();
	    anInt9265 &= ~0x1f;
	}
    }
    
    public final void method3384(int i, int i_75_, int i_76_, int i_77_,
				 int i_78_, int i_79_, Class145 class145,
				 int i_80_, int i_81_) {
	/* empty */
    }
    
    final void method14635() {
	aBool9223 = false;
	if (aClass336_9154 == Class336.aClass336_3519) {
	    method14602();
	    method14640();
	}
    }
    
    abstract void method14636();
    
    final void method14637() {
	aBool9222 = false;
	method14639();
	if (aClass336_9154 == Class336.aClass336_3518)
	    method14640();
    }
    
    public void method14638(int i) {
	if (i > anInt9243) {
	    anInt9243 = i;
	    aByteBuffer9266 = ByteBuffer.allocateDirect(anInt9243);
	    aByteBuffer9266.order(ByteOrder.nativeOrder());
	    aLong9139
		= DirectBufferHelper.getDirectBufferAddress(aByteBuffer9266);
	}
    }
    
    final void method14639() {
	if (!aBool9222)
	    aBool9222 = true;
    }
    
    final void method14640() {
	aClass433_9202.method6842(aClass433_9228);
	method14739(aClass433_9202);
	aFloat9175 = ((aClass433_9202.aFloatArray4853[14]
		       - aClass433_9202.aFloatArray4853[15])
		      / (aClass433_9202.aFloatArray4853[11]
			 - aClass433_9202.aFloatArray4853[10]));
	aFloat9174 = (-aClass433_9202.aFloatArray4853[14]
		      / aClass433_9202.aFloatArray4853[10]);
	method14754();
    }
    
    void method14641() {
	if (aClass355_9171 != null)
	    aClass355_9171.method6294();
	if (aClass343Array9253 != null) {
	    for (int i = 0; i < aClass343Array9253.length; i++) {
		if (aClass343Array9253[i] != null
		    && aClass343Array9253[i].method6070())
		    aClass343Array9253[i].method6062();
	    }
	}
	aClass359_9192 = new Class359(this);
	method14598();
	method14606();
	method14600();
	aClass380_9239 = new Class380(this, 1024);
	aClass359_9192.method6318(this);
	if (aBool9271)
	    aClass371_9147 = new Class371(this, 1024);
    }
    
    public final void method3290(int i, int i_82_, int i_83_, int i_84_) {
	int i_85_;
	int i_86_;
	if (aClass175_1989 != null) {
	    i_86_ = aClass175_1989.method2910();
	    i_85_ = aClass175_1989.method2911();
	} else {
	    i_85_ = 0;
	    i_86_ = 0;
	}
	i = i >= 0 ? i : 0;
	i_83_ = i_83_ <= i_86_ ? i_83_ : i_86_;
	i_82_ = i_82_ >= 0 ? i_82_ : 0;
	i_84_ = i_84_ <= i_85_ ? i_84_ : i_85_;
	boolean bool = false;
	if (anInt9178 < i) {
	    anInt9178 = i;
	    bool = true;
	}
	if (anInt9179 > i_83_) {
	    anInt9179 = i_83_;
	    bool = true;
	}
	if (anInt9176 < i_82_) {
	    anInt9176 = i_82_;
	    bool = true;
	}
	if (anInt9177 > i_84_) {
	    anInt9177 = i_84_;
	    bool = true;
	}
	if (bool) {
	    if (!aBool9294
		&& (aBool9289 || method14703() == Class353.aClass353_3655)) {
		aBool9294 = true;
		method14622();
	    }
	    if (aBool9294)
		method14621();
	}
    }
    
    abstract void method14642(int i);
    
    abstract void method14643();
    
    abstract void method14644();
    
    public final void method14645(Class378 class378, Class378 class378_87_) {
	boolean bool = false;
	if (aClass378Array9219[anInt9215] != class378) {
	    aClass378Array9219[anInt9215] = class378;
	    method14683();
	    bool = true;
	}
	if (aClass378Array9117[anInt9215] != class378_87_) {
	    aClass378Array9117[anInt9215] = class378_87_;
	    method14684();
	    bool = true;
	}
	if (bool)
	    anInt9265 &= ~0x1d;
    }
    
    public void method3366(float f, float f_88_, float f_89_, float[] fs) {
	float f_90_ = (aClass433_9284.aFloatArray4853[14]
		       + aClass433_9284.aFloatArray4853[2] * f
		       + aClass433_9284.aFloatArray4853[6] * f_88_
		       + aClass433_9284.aFloatArray4853[10] * f_89_);
	float f_91_ = (aClass433_9284.aFloatArray4853[15]
		       + aClass433_9284.aFloatArray4853[3] * f
		       + aClass433_9284.aFloatArray4853[7] * f_88_
		       + aClass433_9284.aFloatArray4853[11] * f_89_);
	if (f_90_ < -f_91_ || f_90_ > f_91_) {
	    float[] fs_92_ = fs;
	    float[] fs_93_ = fs;
	    fs[2] = Float.NaN;
	    fs_93_[1] = Float.NaN;
	    fs_92_[0] = Float.NaN;
	} else {
	    float f_94_ = (aClass433_9284.aFloatArray4853[12]
			   + aClass433_9284.aFloatArray4853[0] * f
			   + aClass433_9284.aFloatArray4853[4] * f_88_
			   + aClass433_9284.aFloatArray4853[8] * f_89_);
	    if (f_94_ < -f_91_ || f_94_ > f_91_) {
		float[] fs_95_ = fs;
		float[] fs_96_ = fs;
		fs[2] = Float.NaN;
		fs_96_[1] = Float.NaN;
		fs_95_[0] = Float.NaN;
	    } else {
		float f_97_ = (aClass433_9284.aFloatArray4853[13]
			       + aClass433_9284.aFloatArray4853[1] * f
			       + aClass433_9284.aFloatArray4853[5] * f_88_
			       + aClass433_9284.aFloatArray4853[9] * f_89_);
		if (f_97_ < -f_91_ || f_97_ > f_91_) {
		    float[] fs_98_ = fs;
		    float[] fs_99_ = fs;
		    fs[2] = Float.NaN;
		    fs_99_[1] = Float.NaN;
		    fs_98_[0] = Float.NaN;
		} else {
		    float f_100_
			= (aClass433_9142.aFloatArray4853[14]
			   + aClass433_9142.aFloatArray4853[2] * f
			   + aClass433_9142.aFloatArray4853[6] * f_88_
			   + aClass433_9142.aFloatArray4853[10] * f_89_);
		    fs[0] = aFloat9257 + aFloat9167 * f_94_ / f_91_;
		    fs[1] = aFloat9168 + aFloat9169 * f_97_ / f_91_;
		    fs[2] = f_100_;
		}
	    }
	}
    }
    
    abstract void method14646();
    
    abstract void method14647(boolean bool);
    
    public void method3311(Class446 class446, Class194 class194,
			   Class432 class432) {
	Class433 class433 = aClass433_9194;
	class433.method6916(class446);
	class433.method6839(aClass433_9284);
	class194.method3800(class432, aClass433_9203, class433, aFloat9257,
			    aFloat9168, aFloat9167, aFloat9169);
    }
    
    public final int method3344() {
	return anInt9270 - 2;
    }
    
    final void method14648(boolean bool) {
	if (bool != aBool9146) {
	    aBool9146 = bool;
	    method14652();
	    anInt9265 &= ~0x7;
	}
    }
    
    abstract Interface38 method14649(Class181 class181, Class173 class173,
				     int i, int i_101_);
    
    public final void method3489(float f) {
	if (aFloat9205 != f) {
	    aFloat9205 = f;
	    method14724();
	    method14783();
	}
    }
    
    abstract void method14650(int i);
    
    final Class433 method14651() {
	return aClass433_9202;
    }
    
    abstract void method14652();
    
    public abstract boolean method14653();
    
    abstract void method14654();
    
    public final void method3350(int i, int i_102_, int i_103_, int i_104_) {
	if (aClass355_9171 != null) {
	    for (int i_105_ = 0; i_105_ < aClass343Array9253.length;
		 i_105_++) {
		if (aClass343Array9253[i_105_] != null
		    && aClass343Array9253[i_105_].method6070()
		    && !aClass343Array9253[i_105_].method6072()) {
		    if (!aClass355_9171.method6286(i, i_102_, i_103_,
						   i_104_)) {
			aClass355_9171.method6289();
			aClass355_9171 = null;
		    }
		    break;
		}
	    }
	}
    }
    
    public int method3308(int i, int i_106_, int i_107_, int i_108_,
			  int i_109_, int i_110_) {
	int i_111_ = 0;
	float f = (aClass433_9284.aFloatArray4853[14]
		   + aClass433_9284.aFloatArray4853[2] * (float) i
		   + aClass433_9284.aFloatArray4853[6] * (float) i_106_
		   + aClass433_9284.aFloatArray4853[10] * (float) i_107_);
	float f_112_ = (aClass433_9284.aFloatArray4853[14]
			+ aClass433_9284.aFloatArray4853[2] * (float) i_108_
			+ aClass433_9284.aFloatArray4853[6] * (float) i_109_
			+ aClass433_9284.aFloatArray4853[10] * (float) i_110_);
	float f_113_ = (aClass433_9284.aFloatArray4853[15]
			+ aClass433_9284.aFloatArray4853[3] * (float) i
			+ aClass433_9284.aFloatArray4853[7] * (float) i_106_
			+ aClass433_9284.aFloatArray4853[11] * (float) i_107_);
	float f_114_ = (aClass433_9284.aFloatArray4853[15]
			+ aClass433_9284.aFloatArray4853[3] * (float) i_108_
			+ aClass433_9284.aFloatArray4853[7] * (float) i_109_
			+ aClass433_9284.aFloatArray4853[11] * (float) i_110_);
	if (f < -f_113_ && f_112_ < -f_114_)
	    i_111_ |= 0x10;
	else if (f > f_113_ && f_112_ > f_114_)
	    i_111_ |= 0x20;
	float f_115_ = (aClass433_9284.aFloatArray4853[12]
			+ aClass433_9284.aFloatArray4853[0] * (float) i
			+ aClass433_9284.aFloatArray4853[4] * (float) i_106_
			+ aClass433_9284.aFloatArray4853[8] * (float) i_107_);
	float f_116_ = (aClass433_9284.aFloatArray4853[12]
			+ aClass433_9284.aFloatArray4853[0] * (float) i_108_
			+ aClass433_9284.aFloatArray4853[4] * (float) i_109_
			+ aClass433_9284.aFloatArray4853[8] * (float) i_110_);
	if (f_115_ < -f_113_ && f_116_ < -f_114_)
	    i_111_ |= 0x1;
	if (f_115_ > f_113_ && f_116_ > f_114_)
	    i_111_ |= 0x2;
	float f_117_ = (aClass433_9284.aFloatArray4853[13]
			+ aClass433_9284.aFloatArray4853[1] * (float) i
			+ aClass433_9284.aFloatArray4853[5] * (float) i_106_
			+ aClass433_9284.aFloatArray4853[9] * (float) i_107_);
	float f_118_ = (aClass433_9284.aFloatArray4853[13]
			+ aClass433_9284.aFloatArray4853[1] * (float) i_108_
			+ aClass433_9284.aFloatArray4853[5] * (float) i_109_
			+ aClass433_9284.aFloatArray4853[9] * (float) i_110_);
	if (f_117_ < -f_113_ && f_118_ < -f_114_)
	    i_111_ |= 0x4;
	if (f_117_ > f_113_ && f_118_ > f_114_)
	    i_111_ |= 0x8;
	return i_111_;
    }
    
    abstract void method14655();
    
    final void method14656() {
	aClass433_9284.method6842(aClass433_9142);
	aClass433_9284.method6839(aClass433_9203);
	aClass433_9284.method6862(aFloatArrayArray9165[0]);
	aClass433_9284.method6858(aFloatArrayArray9165[1]);
	aClass433_9284.method6861(aFloatArrayArray9165[2]);
	aClass433_9284.method6949(aFloatArrayArray9165[3]);
	aClass433_9284.method6879(aFloatArrayArray9165[4]);
	aClass433_9284.method6945(aFloatArrayArray9165[5]);
	aClass433_9164.method6842(aClass433_9284);
	method14739(aClass433_9164);
    }
    
    public final boolean method3474() {
	return true;
    }
    
    abstract void method14657();
    
    public final Class433 method3336() {
	return aClass433_9145;
    }
    
    final Interface38 method14658(int i, int i_119_, boolean bool, int[] is) {
	return method14772(i, i_119_, bool, is, 0, 0);
    }
    
    final Interface38 method14659(Class181 class181, int i, int i_120_,
				  boolean bool, byte[] is) {
	return method14662(class181, i, i_120_, bool, is, 0, 0);
    }
    
    final void method14660() {
	if (aClass364Array9218[anInt9215] != Class364.aClass364_3725) {
	    aClass364Array9218[anInt9215] = Class364.aClass364_3725;
	    aClass433Array9217[anInt9215].method6840();
	    method14581();
	}
    }
    
    abstract Interface38 method14661(Class181 class181, Class173 class173,
				     int i, int i_121_);
    
    abstract Interface38 method14662(Class181 class181, int i, int i_122_,
				     boolean bool, byte[] is, int i_123_,
				     int i_124_);
    
    abstract Interface38 method14663(Class181 class181, int i, int i_125_,
				     boolean bool, float[] fs, int i_126_,
				     int i_127_);
    
    abstract boolean method14664(Class181 class181, Class173 class173);
    
    abstract Interface41 method14665(int i, boolean bool, int[][] is);
    
    public void method3305(int i, int i_128_, int i_129_, int i_130_,
			   int i_131_, int i_132_, int i_133_, int i_134_,
			   int i_135_) {
	float f = (float) i_129_ - (float) i;
	float f_136_ = (float) i_130_ - (float) i_128_;
	if (f == 0.0F && f_136_ == 0.0F)
	    f = 1.0F;
	else {
	    float f_137_
		= (float) (1.0
			   / Math.sqrt((double) (f * f + f_136_ * f_136_)));
	    f *= f_137_;
	    f_136_ *= f_137_;
	}
	method14593();
	Class348 class348 = aClass348Array9230[13];
	class348.method6162();
	class348.method6171(i_131_);
	method14687(i_132_);
	class348.method6164();
	method14697(false);
	i_135_ %= i_134_ + i_133_;
	float f_138_ = f * (float) i_133_;
	float f_139_ = f_136_ * (float) i_133_;
	float f_140_ = 0.0F;
	float f_141_ = 0.0F;
	float f_142_ = f_138_;
	float f_143_ = f_139_;
	if (i_135_ > i_133_) {
	    f_140_ = f * (float) (i_133_ + i_134_ - i_135_);
	    f_141_ = f_136_ * (float) (i_133_ + i_134_ - i_135_);
	} else {
	    f_142_ = f * (float) (i_133_ - i_135_);
	    f_143_ = f_136_ * (float) (i_133_ - i_135_);
	}
	float f_144_ = (float) i + f_140_;
	float f_145_ = (float) i_128_ + f_141_;
	float f_146_ = f * (float) i_134_;
	float f_147_ = f_136_ * (float) i_134_;
	for (;;) {
	    if (i_129_ > i) {
		if (f_144_ > (float) i_129_)
		    break;
		if (f_144_ + f_142_ > (float) i_129_)
		    f_142_ = (float) i_129_ - f_144_;
	    } else {
		if (f_144_ < (float) i_129_)
		    break;
		if (f_144_ + f_142_ < (float) i_129_)
		    f_142_ = (float) i_129_ - f_144_;
	    }
	    if (i_130_ > i_128_) {
		if (f_145_ > (float) i_130_)
		    break;
		if (f_145_ + f_143_ > (float) i_130_)
		    f_143_ = (float) i_130_ - f_145_;
	    } else {
		if (f_145_ < (float) i_130_)
		    break;
		if (f_145_ + f_143_ < (float) i_130_)
		    f_143_ = (float) i_130_ - f_145_;
	    }
	    if (!method14601(f_144_, f_145_, 0.0F, f_144_ + f_142_,
			     f_145_ + f_143_, 0.0F))
		return;
	    method14705();
	    f_144_ += f_146_ + f_142_;
	    f_145_ += f_147_ + f_143_;
	    f_142_ = f_138_;
	    f_143_ = f_139_;
	}
	method14697(true);
	class348.method6159();
    }
    
    abstract Interface44 method14666(Class181 class181, Class173 class173,
				     int i, int i_148_);
    
    abstract void method14667();
    
    public final void method14668(int i) {
	if (anInt9215 != i) {
	    anInt9215 = i;
	    method14682();
	}
    }
    
    public final void method14669(Interface43 interface43) {
	if (anInterface43Array9220[anInt9215] != interface43) {
	    anInterface43Array9220[anInt9215] = interface43;
	    if (interface43 != null)
		interface43.method333();
	    else
		anInterface38_9204.method333();
	    anInt9265 &= ~0x11;
	}
    }
    
    public abstract void method14670();
    
    public final void method14671(int i) {
	switch (i) {
	case 0:
	    method14672(Class378.aClass378_3916, Class378.aClass378_3916);
	    break;
	case 1:
	    method14672(Class378.aClass378_3920, Class378.aClass378_3920);
	    break;
	case 2:
	    method14672(Class378.aClass378_3919, Class378.aClass378_3920);
	    break;
	case 4:
	    method14672(Class378.aClass378_3915, Class378.aClass378_3915);
	    break;
	case 3:
	    method14672(Class378.aClass378_3917, Class378.aClass378_3916);
	    break;
	}
    }
    
    public final void method14672(Class378 class378, Class378 class378_149_) {
	boolean bool = false;
	if (aClass378Array9219[anInt9215] != class378) {
	    aClass378Array9219[anInt9215] = class378;
	    method14683();
	    bool = true;
	}
	if (aClass378Array9117[anInt9215] != class378_149_) {
	    aClass378Array9117[anInt9215] = class378_149_;
	    method14684();
	    bool = true;
	}
	if (bool)
	    anInt9265 &= ~0x1d;
    }
    
    public final void method14673(int i, Class373 class373) {
	method14674(i, class373, false, false);
    }
    
    abstract void method14674(int i, Class373 class373, boolean bool,
			      boolean bool_150_);
    
    void method14675() {
	method14650(7);
	method14595();
    }
    
    static int method14676(char c, char c_151_, char c_152_, char c_153_) {
	return ((c & 0xff) << 0 | (c_151_ & 0xff) << 8 | (c_152_ & 0xff) << 16
		| (c_153_ & 0xff) << 24);
    }
    
    public void method14677(int i) {
	if (i != anInt9221) {
	    anInt9221 = i;
	    method14681();
	}
    }
    
    final Class433 method14678() {
	return aClass433Array9217[anInt9215];
    }
    
    public final Class433 method14679() {
	return aClass433Array9217[anInt9215];
    }
    
    public final boolean method3397() {
	return true;
    }
    
    final void method14680() {
	if (aClass364Array9218[anInt9215] != Class364.aClass364_3725) {
	    aClass364Array9218[anInt9215] = Class364.aClass364_3725;
	    aClass433Array9217[anInt9215].method6840();
	    method14581();
	}
    }
    
    public final boolean method3554() {
	return (aClass343Array9253[3] != null
		&& aClass343Array9253[3].method6070());
    }
    
    abstract void method14681();
    
    public Class170 method3548(int[] is) {
	return new Class170_Sub1(this, is);
    }
    
    abstract void method14682();
    
    abstract void method14683();
    
    abstract void method14684();
    
    Class166 method14685() {
	return aClass166_9280;
    }
    
    abstract void method14686();
    
    public final void method3364(int i, Class166 class166) {
	if (!aBool9231)
	    throw new RuntimeException("");
	anInt9247 = i;
	aClass166_9280 = class166;
	if (aBool9246) {
	    aClass348Array9230[3].method6161();
	    aClass348Array9230[3].method6170();
	}
    }
    
    public final void method3529() {
	aBool9231 = false;
    }
    
    final void method14687(int i) {
	if (anInt9283 != i) {
	    Class370 class370;
	    boolean bool;
	    boolean bool_154_;
	    if (i == 1) {
		class370 = Class370.aClass370_3873;
		bool = true;
		bool_154_ = true;
	    } else if (i == 2) {
		class370 = Class370.aClass370_3870;
		bool = false;
		bool_154_ = true;
	    } else if (i == 128) {
		class370 = Class370.aClass370_3872;
		bool = true;
		bool_154_ = true;
	    } else if (i == 3) {
		class370 = Class370.aClass370_3871;
		bool = true;
		bool_154_ = false;
	    } else {
		class370 = Class370.aClass370_3871;
		bool = false;
		bool_154_ = false;
	    }
	    if (bool != aBool9131) {
		aBool9131 = bool;
		method14691();
	    }
	    if (bool_154_ != aBool9259) {
		aBool9259 = bool_154_;
		method14693();
	    }
	    if (class370 != aClass370_9258) {
		aClass370_9258 = class370;
		method14692();
	    }
	    anInt9283 = i;
	    anInt9265 &= ~0x1c;
	}
    }
    
    final void method14688(int i) {
	if (anInt9238 != i) {
	    anInt9238 = i;
	    method14692();
	}
    }
    
    abstract void method14689(int i, Class373 class373, boolean bool);
    
    abstract void method14690();
    
    abstract void method14691();
    
    abstract void method14692();
    
    abstract void method14693();
    
    final void method14694(boolean bool) {
	if (bool != aBool9249) {
	    aBool9249 = bool;
	    method14722();
	    anInt9265 &= ~0x1f;
	}
    }
    
    abstract void method14695();
    
    public void method3568(float f, float f_155_, float f_156_, float[] fs) {
	float f_157_ = (aClass433_9284.aFloatArray4853[14]
			+ aClass433_9284.aFloatArray4853[2] * f
			+ aClass433_9284.aFloatArray4853[6] * f_155_
			+ aClass433_9284.aFloatArray4853[10] * f_156_);
	float f_158_ = (aClass433_9284.aFloatArray4853[15]
			+ aClass433_9284.aFloatArray4853[3] * f
			+ aClass433_9284.aFloatArray4853[7] * f_155_
			+ aClass433_9284.aFloatArray4853[11] * f_156_);
	if (f_157_ < -f_158_ || f_157_ > f_158_) {
	    float[] fs_159_ = fs;
	    float[] fs_160_ = fs;
	    fs[2] = Float.NaN;
	    fs_160_[1] = Float.NaN;
	    fs_159_[0] = Float.NaN;
	} else {
	    float f_161_ = (aClass433_9284.aFloatArray4853[12]
			    + aClass433_9284.aFloatArray4853[0] * f
			    + aClass433_9284.aFloatArray4853[4] * f_155_
			    + aClass433_9284.aFloatArray4853[8] * f_156_);
	    if (f_161_ < -f_158_ || f_161_ > f_158_) {
		float[] fs_162_ = fs;
		float[] fs_163_ = fs;
		fs[2] = Float.NaN;
		fs_163_[1] = Float.NaN;
		fs_162_[0] = Float.NaN;
	    } else {
		float f_164_ = (aClass433_9284.aFloatArray4853[13]
				+ aClass433_9284.aFloatArray4853[1] * f
				+ aClass433_9284.aFloatArray4853[5] * f_155_
				+ aClass433_9284.aFloatArray4853[9] * f_156_);
		if (f_164_ < -f_158_ || f_164_ > f_158_) {
		    float[] fs_165_ = fs;
		    float[] fs_166_ = fs;
		    fs[2] = Float.NaN;
		    fs_166_[1] = Float.NaN;
		    fs_165_[0] = Float.NaN;
		} else {
		    float f_167_
			= (aClass433_9142.aFloatArray4853[14]
			   + aClass433_9142.aFloatArray4853[2] * f
			   + aClass433_9142.aFloatArray4853[6] * f_155_
			   + aClass433_9142.aFloatArray4853[10] * f_156_);
		    fs[0] = aFloat9257 + aFloat9167 * f_161_ / f_158_;
		    fs[1] = aFloat9168 + aFloat9169 * f_164_ / f_158_;
		    fs[2] = f_167_;
		}
	    }
	}
    }
    
    public final void method3508(Class446 class446) {
	aClass446_9140 = class446;
	aClass433_9142.method6916(aClass446_9140);
	aClass433_9144.method6842(aClass433_9142);
	aClass433_9144.method6867();
	aClass446_9141.method7236(class446);
	aClass446_9141.method7243();
	aClass433_9118.method6916(aClass446_9141);
	method14656();
	if (aClass336_9154 == Class336.aClass336_3518)
	    method14627();
    }
    
    abstract void method14696();
    
    abstract void method14697(boolean bool);
    
    public void method3653() {
	if (aClass371_9147 != null)
	    aClass371_9147.method6390();
    }
    
    abstract Interface37 method14698(boolean bool);
    
    abstract Class349 method14699(Class381[] class381s);
    
    public abstract void method14700(Class349 class349);
    
    public Class446 method3257() {
	return aClass446_9140;
    }
    
    abstract void method14701(Interface39 interface39);
    
    abstract void method14702();
    
    public final void method3298(int i, int i_168_, int i_169_, int i_170_,
				 int i_171_, int i_172_) {
	if (aBool9260 && anInt9263 != 0)
	    method14697(false);
	if (aBool9190) {
	    method3461(false);
	    aClass163_Sub2_9225.method2660(i, i_168_, i_169_, i_170_, 0,
					   i_171_, i_172_);
	    method3461(true);
	} else
	    aClass163_Sub2_9225.method2660(i, i_168_, i_169_, i_170_, 0,
					   i_171_, i_172_);
	if (aBool9260 && anInt9263 != 0)
	    method14697(true);
    }
    
    public final void method3297(int i, int i_173_, int i_174_, int i_175_,
				 int i_176_, int i_177_) {
	i_174_--;
	i_175_--;
	int i_178_ = 0;
	if (this instanceof Class185_Sub1_Sub2)
	    i_178_ = -1;
	if (aBool9260 && anInt9263 != 0)
	    method14697(false);
	method3303(i, i_173_ + i_178_, i + i_174_, i_173_ + i_178_, i_176_,
		   i_177_);
	method3303(i, i_173_ + i_175_ + i_178_, i + i_174_,
		   i_173_ + i_175_ + i_178_, i_176_, i_177_);
	method3303(i, i_173_, i, i_173_ + i_175_, i_176_, i_177_);
	method3303(i + i_174_, i_173_, i + i_174_, i_173_ + i_175_, i_176_,
		   i_177_);
	if (aBool9260 && anInt9263 != 0)
	    method14697(true);
    }
    
    Class353 method14703() {
	if (aClass371_9147 == null)
	    return Class353.aClass353_3655;
	return aClass371_9147.method6399();
    }
    
    final void method3300(int i, int i_179_, int i_180_, int i_181_,
			  int i_182_) {
	/* empty */
    }
    
    final void method3248(int i, int i_183_, int i_184_, int i_185_,
			  int i_186_) {
	method3303(i, i_183_, i + i_184_, i_183_, i_185_, i_186_);
    }
    
    final void method3680(int i, int i_187_, int i_188_, int i_189_,
			  int i_190_) {
	method3303(i, i_187_, i, i_187_ + i_188_, i_189_, i_190_);
    }
    
    public final void method3303(int i, int i_191_, int i_192_, int i_193_,
				 int i_194_, int i_195_) {
	method3307(i, i_191_, i_192_, i_193_, i_194_, 1, i_195_);
    }
    
    public final void method3681(float f) {
	if (aFloat9205 != f) {
	    aFloat9205 = f;
	    method14724();
	    method14783();
	}
    }
    
    public void method3306(int i, int i_196_, int i_197_, int i_198_,
			   int i_199_, int i_200_, Class145 class145,
			   int i_201_, int i_202_, int i_203_, int i_204_,
			   int i_205_) {
	/* empty */
    }
    
    public static void method14704() throws Exception_Sub3 {
	Class112.method2018(-1327590673).method400("jaclib", -914726447);
    }
    
    public final Class163 method3602(int i, int i_206_, boolean bool,
				     boolean bool_207_) {
	return new Class163_Sub2(this, i, i_206_, bool, bool_207_);
    }
    
    public final void method3334(Class174 class174) {
	aClass359_9192.method6316(this, class174);
    }
    
    final void method14705() {
	method14733(0, anInterface37_9279);
	method14700(aClass349_9282);
	method14708(Class374.aClass374_3901, 0, 1);
    }
    
    public final void method14706() {
	method14707(Class374.aClass374_3895, 2);
    }
    
    final void method14707(Class374 class374, int i) {
	method14733(0, anInterface37_9226);
	method14700(aClass349_9143);
	method14708(class374, 0, i);
    }
    
    public abstract void method14708(Class374 class374, int i, int i_208_);
    
    abstract void method14709(Interface39 interface39, Class374 class374,
			      int i, int i_209_, int i_210_, int i_211_);
    
    public abstract void method14710(Class374 class374, int i, int i_212_,
				     int i_213_, int i_214_);
    
    public final void method14711() {
	if (anInt9265 != 2) {
	    method14593();
	    method14694(false);
	    method14648(false);
	    method14803(false);
	    method14603(false);
	    method14687(1);
	    method14959((byte) 0);
	    anInt9265 = 2;
	}
    }
    
    final void method14712() {
	if (anInt9265 != 8) {
	    method14728();
	    method14694(true);
	    method14803(true);
	    method14603(true);
	    method14687(1);
	    method14959((byte) 0);
	    anInt9265 = 8;
	}
    }
    
    public final void method3299(int i, int i_215_, float f, int i_216_,
				 int i_217_, float f_218_, int i_219_,
				 int i_220_, float f_221_, int i_222_,
				 int i_223_, int i_224_, int i_225_) {
	/* empty */
    }
    
    static int method14713(char c, char c_226_, char c_227_, char c_228_) {
	return ((c & 0xff) << 0 | (c_226_ & 0xff) << 8 | (c_227_ & 0xff) << 16
		| (c_228_ & 0xff) << 24);
    }
    
    public final void method3522() {
	if (aClass175_1989 != null) {
	    anInt9176 = 0;
	    anInt9178 = 0;
	    anInt9179 = aClass175_1989.method2910();
	    anInt9177 = aClass175_1989.method2911();
	} else {
	    anInt9177 = 0;
	    anInt9179 = 0;
	    anInt9176 = 0;
	    anInt9178 = 0;
	}
	if (aBool9294) {
	    aBool9294 = false;
	    method14622();
	}
    }
    
    public void method3322(int i) {
	if (aClass354_9211 != null)
	    aClass354_9211.method6266();
	anInt9264 = i & 0x7fffffff;
    }
    
    public void method3686(int i) {
	if (aClass354_9211 != null)
	    aClass354_9211.method6266();
	anInt9264 = i & 0x7fffffff;
    }
    
    public void method3389(int i) {
	if (aClass354_9211 != null)
	    aClass354_9211.method6266();
	anInt9264 = i & 0x7fffffff;
    }
    
    public void method3381(int i) {
	if (aClass354_9211 != null)
	    aClass354_9211.method6266();
	anInt9264 = i & 0x7fffffff;
    }
    
    public final int method3411() {
	return anInt9136 + anInt9135 + anInt9137;
    }
    
    public final int method3323() {
	return anInt9136 + anInt9135 + anInt9137;
    }
    
    public final int method3671() {
	return anInt9136 + anInt9135 + anInt9137;
    }
    
    final void method14714(boolean bool) {
	if (bool != aBool9146) {
	    aBool9146 = bool;
	    method14652();
	    anInt9265 &= ~0x7;
	}
    }
    
    public final boolean method3386() {
	return aClass343Array9253[3] != null;
    }
    
    public final boolean method3592() {
	return true;
    }
    
    public final boolean method3388() {
	return true;
    }
    
    public final void method3550() {
	if (aClass343Array9253[3] != null
	    && aClass343Array9253[3].method6070()) {
	    aClass355_9171.method6287(aClass343Array9253[3]);
	    aClass354_9211.method6274();
	}
    }
    
    public final boolean method3390() {
	return true;
    }
    
    public final boolean method3391() {
	return true;
    }
    
    public final boolean method3392() {
	return aBool9260;
    }
    
    public abstract float method14715();
    
    public final boolean method3394() {
	return aBool9260;
    }
    
    boolean method3310(int i, int i_229_, int i_230_, int i_231_,
		       Class446 class446, Class432 class432) {
	Class433 class433 = aClass433_9194;
	class433.method6916(class446);
	class433.method6839(aClass433_9284);
	return class432.method6838(i, i_229_, i_230_, i_231_, class433,
				   aFloat9257, aFloat9168, aFloat9167,
				   aFloat9169);
    }
    
    public final boolean method3326() {
	return true;
    }
    
    public final void method3338(Class433 class433) {
	aClass433_9203.method6842(class433);
	method14656();
	if (aClass336_9154 == Class336.aClass336_3518)
	    method14640();
    }
    
    public final boolean method3398() {
	return true;
    }
    
    abstract void method14716();
    
    final void method14717(boolean bool) {
	if (bool != aBool9249) {
	    aBool9249 = bool;
	    method14722();
	    anInt9265 &= ~0x1f;
	}
    }
    
    public abstract String method3401();
    
    public abstract String method3402();
    
    public final int[] method3663() {
	return null;
    }
    
    void method14718() {
	method14650(7);
	method14595();
    }
    
    public final int[] method3405() {
	return null;
    }
    
    public final void method3351(int i, int i_232_) {
	if (aClass355_9171 != null)
	    aClass355_9171.method6300(i, i_232_);
    }
    
    public final void method3563() {
	aBool9231 = false;
    }
    
    public void method3439() {
	anInt9180 = 0;
	anInt9256 = 0;
	anInt9207 = aClass175_1989.method2910();
	anInt9183 = aClass175_1989.method2911();
	method14955();
    }
    
    public void method3440(int i, int i_233_, int i_234_, int i_235_) {
	anInt9180 = i;
	anInt9256 = i_233_;
	anInt9207 = i_234_;
	anInt9183 = i_235_;
	method14955();
    }
    
    public void method3441(float f, float f_236_) {
	aFloat9148 = f;
	aFloat9173 = f_236_;
	method14955();
    }
    
    public final void method3442() {
	if (aClass175_1989 != null) {
	    anInt9176 = 0;
	    anInt9178 = 0;
	    anInt9179 = aClass175_1989.method2910();
	    anInt9177 = aClass175_1989.method2911();
	} else {
	    anInt9177 = 0;
	    anInt9179 = 0;
	    anInt9176 = 0;
	    anInt9178 = 0;
	}
	if (aBool9294) {
	    aBool9294 = false;
	    method14622();
	}
    }
    
    final void method14719() {
	if (!aBool9223) {
	    int i;
	    int i_237_;
	    if (aClass175_1989 != null) {
		i_237_ = aClass175_1989.method2910();
		i = aClass175_1989.method2911();
	    } else {
		i = 0;
		i_237_ = 0;
	    }
	    Class433 class433 = aClass433_9170;
	    if (i_237_ != 0 && i != 0)
		class433.method6853(0.0F, (float) i_237_, 0.0F, (float) i,
				    -1.0F, 1.0F);
	    else
		class433.method6840();
	    aClass433_9274.method6842(class433);
	    method14739(aClass433_9274);
	    aBool9223 = true;
	}
    }
    
    public final void method3444() {
	if (aClass175_1989 != null) {
	    anInt9176 = 0;
	    anInt9178 = 0;
	    anInt9179 = aClass175_1989.method2910();
	    anInt9177 = aClass175_1989.method2911();
	} else {
	    anInt9177 = 0;
	    anInt9179 = 0;
	    anInt9176 = 0;
	    anInt9178 = 0;
	}
	if (aBool9294) {
	    aBool9294 = false;
	    method14622();
	}
    }
    
    public final void method3445(int i, int i_238_, int i_239_, int i_240_) {
	int i_241_;
	int i_242_;
	if (aClass175_1989 != null) {
	    i_242_ = aClass175_1989.method2910();
	    i_241_ = aClass175_1989.method2911();
	} else {
	    i_241_ = 0;
	    i_242_ = 0;
	}
	if (i <= 0 && i_239_ >= i_242_ - 1 && i_238_ <= 0
	    && i_240_ >= i_241_ - 1)
	    method3537();
	else {
	    anInt9178 = i >= 0 ? i : 0;
	    anInt9179 = i_239_ <= i_242_ ? i_239_ : i_242_;
	    anInt9176 = i_238_ >= 0 ? i_238_ : 0;
	    anInt9177 = i_240_ <= i_241_ ? i_240_ : i_241_;
	    if (!aBool9294
		&& (aBool9289 || method14703() == Class353.aClass353_3655)) {
		aBool9294 = true;
		method14622();
	    }
	    if (aBool9294)
		method14621();
	}
    }
    
    public final void method3416(int i, int i_243_, int i_244_, int i_245_) {
	int i_246_;
	int i_247_;
	if (aClass175_1989 != null) {
	    i_247_ = aClass175_1989.method2910();
	    i_246_ = aClass175_1989.method2911();
	} else {
	    i_246_ = 0;
	    i_247_ = 0;
	}
	if (i <= 0 && i_244_ >= i_247_ - 1 && i_243_ <= 0
	    && i_245_ >= i_246_ - 1)
	    method3537();
	else {
	    anInt9178 = i >= 0 ? i : 0;
	    anInt9179 = i_244_ <= i_247_ ? i_244_ : i_247_;
	    anInt9176 = i_243_ >= 0 ? i_243_ : 0;
	    anInt9177 = i_245_ <= i_246_ ? i_245_ : i_246_;
	    if (!aBool9294
		&& (aBool9289 || method14703() == Class353.aClass353_3655)) {
		aBool9294 = true;
		method14622();
	    }
	    if (aBool9294)
		method14621();
	}
    }
    
    public final void method3468(int i, int i_248_, int i_249_, int i_250_,
				 int i_251_, int i_252_) {
	method3307(i, i_248_, i_249_, i_250_, i_251_, 1, i_252_);
    }
    
    public final void method3448(int i, int i_253_, int i_254_, int i_255_) {
	int i_256_;
	int i_257_;
	if (aClass175_1989 != null) {
	    i_257_ = aClass175_1989.method2910();
	    i_256_ = aClass175_1989.method2911();
	} else {
	    i_256_ = 0;
	    i_257_ = 0;
	}
	i = i >= 0 ? i : 0;
	i_254_ = i_254_ <= i_257_ ? i_254_ : i_257_;
	i_253_ = i_253_ >= 0 ? i_253_ : 0;
	i_255_ = i_255_ <= i_256_ ? i_255_ : i_256_;
	boolean bool = false;
	if (anInt9178 < i) {
	    anInt9178 = i;
	    bool = true;
	}
	if (anInt9179 > i_254_) {
	    anInt9179 = i_254_;
	    bool = true;
	}
	if (anInt9176 < i_253_) {
	    anInt9176 = i_253_;
	    bool = true;
	}
	if (anInt9177 > i_255_) {
	    anInt9177 = i_255_;
	    bool = true;
	}
	if (bool) {
	    if (!aBool9294
		&& (aBool9289 || method14703() == Class353.aClass353_3655)) {
		aBool9294 = true;
		method14622();
	    }
	    if (aBool9294)
		method14621();
	}
    }
    
    public final void method3435(int i, int i_258_, int i_259_, int i_260_,
				 int i_261_, int i_262_, Class145 class145,
				 int i_263_, int i_264_) {
	/* empty */
    }
    
    public final void method3450(int i, int i_265_, int i_266_, int i_267_) {
	int i_268_;
	int i_269_;
	if (aClass175_1989 != null) {
	    i_269_ = aClass175_1989.method2910();
	    i_268_ = aClass175_1989.method2911();
	} else {
	    i_268_ = 0;
	    i_269_ = 0;
	}
	i = i >= 0 ? i : 0;
	i_266_ = i_266_ <= i_269_ ? i_266_ : i_269_;
	i_265_ = i_265_ >= 0 ? i_265_ : 0;
	i_267_ = i_267_ <= i_268_ ? i_267_ : i_268_;
	boolean bool = false;
	if (anInt9178 < i) {
	    anInt9178 = i;
	    bool = true;
	}
	if (anInt9179 > i_266_) {
	    anInt9179 = i_266_;
	    bool = true;
	}
	if (anInt9176 < i_265_) {
	    anInt9176 = i_265_;
	    bool = true;
	}
	if (anInt9177 > i_267_) {
	    anInt9177 = i_267_;
	    bool = true;
	}
	if (bool) {
	    if (!aBool9294
		&& (aBool9289 || method14703() == Class353.aClass353_3655)) {
		aBool9294 = true;
		method14622();
	    }
	    if (aBool9294)
		method14621();
	}
    }
    
    public final int method3499() {
	return anInt9270 - 2;
    }
    
    public final void method3562(int[] is) {
	is[0] = anInt9178;
	is[1] = anInt9176;
	is[2] = anInt9179;
	is[3] = anInt9177;
    }
    
    public final void method3453(int[] is) {
	is[0] = anInt9178;
	is[1] = anInt9176;
	is[2] = anInt9179;
	is[3] = anInt9177;
    }
    
    abstract void method14720();
    
    public final int method3467(int i, int i_270_) {
	return i & i_270_ ^ i_270_;
    }
    
    public final void method3382(int[] is) {
	is[0] = anInt9178;
	is[1] = anInt9176;
	is[2] = anInt9179;
	is[3] = anInt9177;
    }
    
    public final void method14721() {
	anInterface43Array9220 = new Interface43[anInt9269];
	aClass433Array9217 = new Class433[anInt9269];
	aClass364Array9218 = new Class364[anInt9269];
	aClass378Array9219 = new Class378[anInt9269];
	aClass378Array9117 = new Class378[anInt9269];
	for (int i = 0; i < anInt9269; i++) {
	    aClass378Array9117[i] = Class378.aClass378_3916;
	    aClass378Array9219[i] = Class378.aClass378_3916;
	    aClass364Array9218[i] = Class364.aClass364_3725;
	    aClass433Array9217[i] = new Class433();
	}
	aClass534_Sub21Array9208 = new Class534_Sub21[anInt9270 - 2];
	int[] is = { -1 };
	anInterface38_9204 = method14772(1, 1, false, is, 0, 0);
	is[0] = -16777216;
	anInterface38_9224 = method14772(1, 1, false, is, 0, 0);
	method3538(new Class534_Sub2_Sub1(262144));
	aClass349_9286
	    = method14699(new Class381[]
			  { new Class381(new Class350[]
					 { Class350.aClass350_3610,
					   Class350.aClass350_3597 }) });
	aClass349_9293
	    = method14699(new Class381[]
			  { new Class381(new Class350[]
					 { Class350.aClass350_3610,
					   Class350.aClass350_3595 }) });
	aClass349_9285
	    = method14699(new Class381[]
			  { new Class381(Class350.aClass350_3610),
			    new Class381(Class350.aClass350_3595),
			    new Class381(Class350.aClass350_3597),
			    new Class381(Class350.aClass350_3594) });
	aClass349_9216
	    = method14699(new Class381[]
			  { new Class381(Class350.aClass350_3610),
			    new Class381(Class350.aClass350_3595),
			    new Class381(Class350.aClass350_3597) });
	for (int i = 0; i < 8; i++) {
	    aClass183_Sub3Array9128[i]
		= new Class183_Sub3(this, 0, 0, false, false);
	    aClass183_Sub3Array9290[i]
		= new Class183_Sub3(this, 0, 0, true, true);
	}
	method14776();
	anInterface39_9149 = method14971(true);
	method14718();
	method3537();
	method3268();
	aClass163_Sub2_9225 = new Class163_Sub2(this, anInterface38_9204);
	aClass163_Sub2_9278 = new Class163_Sub2(this, anInterface38_9224);
	method3340(3, 0);
    }
    
    public final void method3460(int i, int i_271_, int i_272_, int i_273_,
				 int i_274_, int i_275_) {
	i_272_--;
	i_273_--;
	int i_276_ = 0;
	if (this instanceof Class185_Sub1_Sub2)
	    i_276_ = -1;
	if (aBool9260 && anInt9263 != 0)
	    method14697(false);
	method3303(i, i_271_ + i_276_, i + i_272_, i_271_ + i_276_, i_274_,
		   i_275_);
	method3303(i, i_271_ + i_273_ + i_276_, i + i_272_,
		   i_271_ + i_273_ + i_276_, i_274_, i_275_);
	method3303(i, i_271_, i, i_271_ + i_273_, i_274_, i_275_);
	method3303(i + i_272_, i_271_, i + i_272_, i_271_ + i_273_, i_274_,
		   i_275_);
	if (aBool9260 && anInt9263 != 0)
	    method14697(true);
    }
    
    abstract void method14722();
    
    public final void method3462(int i, int i_277_, int i_278_, int i_279_,
				 int i_280_, int i_281_) {
	if (aBool9260 && anInt9263 != 0)
	    method14697(false);
	if (aBool9190) {
	    method3461(false);
	    aClass163_Sub2_9225.method2660(i, i_277_, i_278_, i_279_, 0,
					   i_280_, i_281_);
	    method3461(true);
	} else
	    aClass163_Sub2_9225.method2660(i, i_277_, i_278_, i_279_, 0,
					   i_280_, i_281_);
	if (aBool9260 && anInt9263 != 0)
	    method14697(true);
    }
    
    public final void method3632(int i, int i_282_, int i_283_, int i_284_,
				 int i_285_, int i_286_) {
	if (aBool9260 && anInt9263 != 0)
	    method14697(false);
	if (aBool9190) {
	    method3461(false);
	    aClass163_Sub2_9225.method2660(i, i_282_, i_283_, i_284_, 0,
					   i_285_, i_286_);
	    method3461(true);
	} else
	    aClass163_Sub2_9225.method2660(i, i_282_, i_283_, i_284_, 0,
					   i_285_, i_286_);
	if (aBool9260 && anInt9263 != 0)
	    method14697(true);
    }
    
    final void method3634(int i, int i_287_, int i_288_, int i_289_,
			  int i_290_) {
	/* empty */
    }
    
    public final int[] method3484() {
	return null;
    }
    
    final void method3595(int i, int i_291_, int i_292_, int i_293_,
			  int i_294_) {
	method3303(i, i_291_, i + i_292_, i_291_, i_293_, i_294_);
    }
    
    final void method3378(int i, int i_295_, int i_296_, int i_297_,
			  int i_298_) {
	method3303(i, i_295_, i, i_295_ + i_296_, i_297_, i_298_);
    }
    
    public final void method3482(Class534_Sub2 class534_sub2) {
	aNativeHeap9133
	    = ((Class534_Sub2_Sub1) class534_sub2).aNativeHeap11652;
    }
    
    public void method3469(int i, int i_299_, int i_300_, int i_301_,
			   int i_302_, int i_303_, int i_304_, int i_305_,
			   int i_306_) {
	float f = (float) i_300_ - (float) i;
	float f_307_ = (float) i_301_ - (float) i_299_;
	if (f == 0.0F && f_307_ == 0.0F)
	    f = 1.0F;
	else {
	    float f_308_
		= (float) (1.0
			   / Math.sqrt((double) (f * f + f_307_ * f_307_)));
	    f *= f_308_;
	    f_307_ *= f_308_;
	}
	method14593();
	Class348 class348 = aClass348Array9230[13];
	class348.method6162();
	class348.method6171(i_302_);
	method14687(i_303_);
	class348.method6164();
	method14697(false);
	i_306_ %= i_305_ + i_304_;
	float f_309_ = f * (float) i_304_;
	float f_310_ = f_307_ * (float) i_304_;
	float f_311_ = 0.0F;
	float f_312_ = 0.0F;
	float f_313_ = f_309_;
	float f_314_ = f_310_;
	if (i_306_ > i_304_) {
	    f_311_ = f * (float) (i_304_ + i_305_ - i_306_);
	    f_312_ = f_307_ * (float) (i_304_ + i_305_ - i_306_);
	} else {
	    f_313_ = f * (float) (i_304_ - i_306_);
	    f_314_ = f_307_ * (float) (i_304_ - i_306_);
	}
	float f_315_ = (float) i + f_311_;
	float f_316_ = (float) i_299_ + f_312_;
	float f_317_ = f * (float) i_305_;
	float f_318_ = f_307_ * (float) i_305_;
	for (;;) {
	    if (i_300_ > i) {
		if (f_315_ > (float) i_300_)
		    break;
		if (f_315_ + f_313_ > (float) i_300_)
		    f_313_ = (float) i_300_ - f_315_;
	    } else {
		if (f_315_ < (float) i_300_)
		    break;
		if (f_315_ + f_313_ < (float) i_300_)
		    f_313_ = (float) i_300_ - f_315_;
	    }
	    if (i_301_ > i_299_) {
		if (f_316_ > (float) i_301_)
		    break;
		if (f_316_ + f_314_ > (float) i_301_)
		    f_314_ = (float) i_301_ - f_316_;
	    } else {
		if (f_316_ < (float) i_301_)
		    break;
		if (f_316_ + f_314_ < (float) i_301_)
		    f_314_ = (float) i_301_ - f_316_;
	    }
	    if (!method14601(f_315_, f_316_, 0.0F, f_315_ + f_313_,
			     f_316_ + f_314_, 0.0F))
		return;
	    method14705();
	    f_315_ += f_317_ + f_313_;
	    f_316_ += f_318_ + f_314_;
	    f_313_ = f_309_;
	    f_314_ = f_310_;
	}
	method14697(true);
	class348.method6159();
    }
    
    public final NativeHeapBuffer method14723(int i, boolean bool) {
	return aNativeHeap9133.method1975(i, bool);
    }
    
    abstract void method14724();
    
    public final void method3472(int i, int i_319_, int i_320_, int i_321_,
				 int i_322_, int i_323_, int i_324_) {
	i += 1.0F;
	i_319_ += 1.0F;
	i_320_ += 1.0F;
	i_321_ += 1.0F;
	float f = (float) (i_320_ - i);
	float f_325_ = (float) (i_321_ - i_319_);
	float f_326_
	    = 1.0F / (float) Math.sqrt((double) (f * f + f_325_ * f_325_));
	f *= f_326_;
	f_325_ *= f_326_;
	i -= f;
	i_319_ -= f_325_;
	float f_327_ = -f_325_;
	float f_328_ = f;
	f_327_ *= 0.5F * (float) i_323_;
	f_328_ *= 0.5F * (float) i_323_;
	aClass163_Sub2_9225.method2703((float) i - f_327_,
				       (float) i_319_ - f_328_,
				       (float) i_320_ - f_327_,
				       (float) i_321_ - f_328_,
				       (float) i + f_327_,
				       (float) i_319_ + f_328_, 0, i_322_,
				       i_324_);
    }
    
    public final void method3598(int i, int i_329_, int i_330_, int i_331_,
				 int i_332_, int i_333_, int i_334_) {
	i += 1.0F;
	i_329_ += 1.0F;
	i_330_ += 1.0F;
	i_331_ += 1.0F;
	float f = (float) (i_330_ - i);
	float f_335_ = (float) (i_331_ - i_329_);
	float f_336_
	    = 1.0F / (float) Math.sqrt((double) (f * f + f_335_ * f_335_));
	f *= f_336_;
	f_335_ *= f_336_;
	i -= f;
	i_329_ -= f_335_;
	float f_337_ = -f_335_;
	float f_338_ = f;
	f_337_ *= 0.5F * (float) i_333_;
	f_338_ *= 0.5F * (float) i_333_;
	aClass163_Sub2_9225.method2703((float) i - f_337_,
				       (float) i_329_ - f_338_,
				       (float) i_330_ - f_337_,
				       (float) i_331_ - f_338_,
				       (float) i + f_337_,
				       (float) i_329_ + f_338_, 0, i_332_,
				       i_334_);
    }
    
    final Interface39 method14725(int i) {
	if (anInterface39_9149.method53() < i * 2)
	    anInterface39_9149.method277(i);
	return anInterface39_9149;
    }
    
    public int method3475(int i, int i_339_, int i_340_, int i_341_,
			  int i_342_, int i_343_) {
	int i_344_ = 0;
	float f = (aClass433_9284.aFloatArray4853[14]
		   + aClass433_9284.aFloatArray4853[2] * (float) i
		   + aClass433_9284.aFloatArray4853[6] * (float) i_339_
		   + aClass433_9284.aFloatArray4853[10] * (float) i_340_);
	float f_345_ = (aClass433_9284.aFloatArray4853[14]
			+ aClass433_9284.aFloatArray4853[2] * (float) i_341_
			+ aClass433_9284.aFloatArray4853[6] * (float) i_342_
			+ aClass433_9284.aFloatArray4853[10] * (float) i_343_);
	float f_346_ = (aClass433_9284.aFloatArray4853[15]
			+ aClass433_9284.aFloatArray4853[3] * (float) i
			+ aClass433_9284.aFloatArray4853[7] * (float) i_339_
			+ aClass433_9284.aFloatArray4853[11] * (float) i_340_);
	float f_347_ = (aClass433_9284.aFloatArray4853[15]
			+ aClass433_9284.aFloatArray4853[3] * (float) i_341_
			+ aClass433_9284.aFloatArray4853[7] * (float) i_342_
			+ aClass433_9284.aFloatArray4853[11] * (float) i_343_);
	if (f < -f_346_ && f_345_ < -f_347_)
	    i_344_ |= 0x10;
	else if (f > f_346_ && f_345_ > f_347_)
	    i_344_ |= 0x20;
	float f_348_ = (aClass433_9284.aFloatArray4853[12]
			+ aClass433_9284.aFloatArray4853[0] * (float) i
			+ aClass433_9284.aFloatArray4853[4] * (float) i_339_
			+ aClass433_9284.aFloatArray4853[8] * (float) i_340_);
	float f_349_ = (aClass433_9284.aFloatArray4853[12]
			+ aClass433_9284.aFloatArray4853[0] * (float) i_341_
			+ aClass433_9284.aFloatArray4853[4] * (float) i_342_
			+ aClass433_9284.aFloatArray4853[8] * (float) i_343_);
	if (f_348_ < -f_346_ && f_349_ < -f_347_)
	    i_344_ |= 0x1;
	if (f_348_ > f_346_ && f_349_ > f_347_)
	    i_344_ |= 0x2;
	float f_350_ = (aClass433_9284.aFloatArray4853[13]
			+ aClass433_9284.aFloatArray4853[1] * (float) i
			+ aClass433_9284.aFloatArray4853[5] * (float) i_339_
			+ aClass433_9284.aFloatArray4853[9] * (float) i_340_);
	float f_351_ = (aClass433_9284.aFloatArray4853[13]
			+ aClass433_9284.aFloatArray4853[1] * (float) i_341_
			+ aClass433_9284.aFloatArray4853[5] * (float) i_342_
			+ aClass433_9284.aFloatArray4853[9] * (float) i_343_);
	if (f_350_ < -f_346_ && f_351_ < -f_347_)
	    i_344_ |= 0x4;
	if (f_350_ > f_346_ && f_351_ > f_347_)
	    i_344_ |= 0x8;
	return i_344_;
    }
    
    boolean method3420(int i, int i_352_, int i_353_, int i_354_,
		       Class446 class446, Class432 class432) {
	Class433 class433 = aClass433_9194;
	class433.method6916(class446);
	class433.method6839(aClass433_9284);
	return class432.method6838(i, i_352_, i_353_, i_354_, class433,
				   aFloat9257, aFloat9168, aFloat9167,
				   aFloat9169);
    }
    
    boolean method3477(int i, int i_355_, int i_356_, int i_357_,
		       Class446 class446, Class432 class432) {
	Class433 class433 = aClass433_9194;
	class433.method6916(class446);
	class433.method6839(aClass433_9284);
	return class432.method6838(i, i_355_, i_356_, i_357_, class433,
				   aFloat9257, aFloat9168, aFloat9167,
				   aFloat9169);
    }
    
    boolean method3478(int i, int i_358_, int i_359_, int i_360_,
		       Class446 class446, Class432 class432) {
	Class433 class433 = aClass433_9194;
	class433.method6916(class446);
	class433.method6839(aClass433_9284);
	return class432.method6838(i, i_358_, i_359_, i_360_, class433,
				   aFloat9257, aFloat9168, aFloat9167,
				   aFloat9169);
    }
    
    public final boolean method3455() {
	return aClass355_9171 != null && aClass355_9171.aBool3661;
    }
    
    abstract Interface38 method14726(int i, int i_361_, boolean bool, int[] is,
				     int i_362_, int i_363_);
    
    public final Class534_Sub2 method3481(int i) {
	Class534_Sub2_Sub1 class534_sub2_sub1 = new Class534_Sub2_Sub1(i);
	aClass700_9155.method14131(class534_sub2_sub1, (short) 789);
	return class534_sub2_sub1;
    }
    
    boolean method14727(float f, float f_364_, float f_365_, float f_366_,
			float f_367_, float f_368_) {
	method14586(24);
	aByteBuffer9266.clear();
	aByteBuffer9266.putFloat(f);
	aByteBuffer9266.putFloat(f_364_);
	aByteBuffer9266.putFloat(f_365_);
	aByteBuffer9266.putFloat(f_366_);
	aByteBuffer9266.putFloat(f_367_);
	aByteBuffer9266.putFloat(f_368_);
	return anInterface37_9279.method235(0, aByteBuffer9266.position(),
					    aLong9139);
    }
    
    final void method14728() {
	if (aClass336_9154 != Class336.aClass336_3518) {
	    aClass336_9154 = Class336.aClass336_3518;
	    method14627();
	    method14639();
	    aClass433_9228 = aClass433_9203;
	    method14640();
	    method14955();
	    anInt9265 &= ~0x7;
	}
    }
    
    public final void method14729() {
	if (anInt9265 != 2) {
	    method14593();
	    method14694(false);
	    method14648(false);
	    method14803(false);
	    method14603(false);
	    method14687(1);
	    method14959((byte) 0);
	    anInt9265 = 2;
	}
    }
    
    public final Class163 method3407(int i, int i_369_, boolean bool,
				     boolean bool_370_) {
	return new Class163_Sub2(this, i, i_369_, bool, bool_370_);
    }
    
    public final Class163 method3343(int[] is, int i, int i_371_, int i_372_,
				     int i_373_, boolean bool) {
	return new Class163_Sub2(this, i_372_, i_373_, is, i, i_371_);
    }
    
    public final Class163 method3487(int i, int i_374_, int i_375_, int i_376_,
				     boolean bool) {
	Class163_Sub2 class163_sub2
	    = new Class163_Sub2(this, i_375_, i_376_, bool, false);
	class163_sub2.method2717(0, 0, i_375_, i_376_, i, i_374_);
	return class163_sub2;
    }
    
    public final Class163 method3488(int i, int i_377_, int i_378_, int i_379_,
				     boolean bool) {
	Class163_Sub2 class163_sub2
	    = new Class163_Sub2(this, i_378_, i_379_, bool, false);
	class163_sub2.method2717(0, 0, i_378_, i_379_, i, i_377_);
	return class163_sub2;
    }
    
    public final NativeHeapBuffer method14730(int i, boolean bool) {
	return aNativeHeap9133.method1975(i, bool);
    }
    
    public final Class171 method3503(Class16 class16, Class169[] class169s,
				     boolean bool) {
	return new Class171_Sub2(this, class16, class169s, bool);
    }
    
    public final Class171 method3491(Class16 class16, Class169[] class169s,
				     boolean bool) {
	return new Class171_Sub2(this, class16, class169s, bool);
    }
    
    final Interface38 method14731(Class181 class181, int i, int i_380_,
				  boolean bool, float[] fs) {
	return method14663(class181, i, i_380_, bool, fs, 0, 0);
    }
    
    public final Class183 method3493(Class187 class187, int i, int i_381_,
				     int i_382_, int i_383_) {
	return new Class183_Sub3(this, class187, i, i_382_, i_383_, i_381_);
    }
    
    public final void method3231(int i, Class166 class166) {
	anInt9247 = i;
	aClass166_9280 = class166;
	aBool9231 = true;
    }
    
    public final int method3495(int i, int i_384_) {
	return i & i_384_ ^ i_384_;
    }
    
    public void method14732(Interface36 interface36) {
	aClass77_9114.method1593(interface36, anObject9291, (byte) 73);
    }
    
    public final Class446 method3497() {
	return aClass446_9245;
    }
    
    public final boolean method3395() {
	return aBool9260;
    }
    
    public abstract void method14733(int i, Interface37 interface37);
    
    public final int method3500() {
	return anInt9270 - 2;
    }
    
    public Class170 method3605(int[] is) {
	return new Class170_Sub1(this, is);
    }
    
    public final int method3502() {
	return anInt9270 - 2;
    }
    
    public final void method3659(int i, Class534_Sub21[] class534_sub21s) {
	for (int i_385_ = 0; i_385_ < i; i_385_++)
	    aClass534_Sub21Array9208[i_385_] = class534_sub21s[i_385_];
	anInt9129 = i;
    }
    
    public final void method3504(int i, Class534_Sub21[] class534_sub21s) {
	for (int i_386_ = 0; i_386_ < i; i_386_++)
	    aClass534_Sub21Array9208[i_386_] = class534_sub21s[i_386_];
	anInt9129 = i;
    }
    
    public final void method3449(int i, int i_387_, int i_388_, int i_389_) {
	int i_390_;
	int i_391_;
	if (aClass175_1989 != null) {
	    i_391_ = aClass175_1989.method2910();
	    i_390_ = aClass175_1989.method2911();
	} else {
	    i_390_ = 0;
	    i_391_ = 0;
	}
	i = i >= 0 ? i : 0;
	i_388_ = i_388_ <= i_391_ ? i_388_ : i_391_;
	i_387_ = i_387_ >= 0 ? i_387_ : 0;
	i_389_ = i_389_ <= i_390_ ? i_389_ : i_390_;
	boolean bool = false;
	if (anInt9178 < i) {
	    anInt9178 = i;
	    bool = true;
	}
	if (anInt9179 > i_388_) {
	    anInt9179 = i_388_;
	    bool = true;
	}
	if (anInt9176 < i_387_) {
	    anInt9176 = i_387_;
	    bool = true;
	}
	if (anInt9177 > i_389_) {
	    anInt9177 = i_389_;
	    bool = true;
	}
	if (bool) {
	    if (!aBool9294
		&& (aBool9289 || method14703() == Class353.aClass353_3655)) {
		aBool9294 = true;
		method14622();
	    }
	    if (aBool9294)
		method14621();
	}
    }
    
    final void method14734() {
	if (aClass348_9229 != null)
	    aClass348_9229.method6170();
	method14752();
    }
    
    abstract Interface38 method14735(int i, int i_392_, boolean bool, int[] is,
				     int i_393_, int i_394_);
    
    abstract void method14736();
    
    public final void method3387(Class433 class433) {
	aClass433_9203.method6842(class433);
	method14656();
	if (aClass336_9154 == Class336.aClass336_3518)
	    method14640();
    }
    
    public final void method3510(Class433 class433) {
	aClass433_9203.method6842(class433);
	method14656();
	if (aClass336_9154 == Class336.aClass336_3518)
	    method14640();
    }
    
    public abstract Class269 method14737(String string);
    
    public final Class433 method3512() {
	return aClass433_9203;
    }
    
    abstract Interface41 method14738(int i, boolean bool, int[][] is);
    
    public final Class433 method3514() {
	return aClass433_9203;
    }
    
    public final Class433 method3515() {
	return aClass433_9203;
    }
    
    public final void method3516(float f) {
	if (aFloat9205 != f) {
	    aFloat9205 = f;
	    method14724();
	    method14783();
	}
    }
    
    public final void method3517(float f) {
	if (aFloat9205 != f) {
	    aFloat9205 = f;
	    method14724();
	    method14783();
	}
    }
    
    public void method3437() {
	anInt9180 = 0;
	anInt9256 = 0;
	anInt9207 = aClass175_1989.method2910();
	anInt9183 = aClass175_1989.method2911();
	method14955();
    }
    
    public final void method3519(int i) {
	anInt9212 = 0;
	for (/**/; i > 1; i >>= 1)
	    anInt9212++;
	anInt9187 = 1 << anInt9212;
    }
    
    public final void method3520(int i) {
	anInt9212 = 0;
	for (/**/; i > 1; i >>= 1)
	    anInt9212++;
	anInt9187 = 1 << anInt9212;
    }
    
    public final void method3521(int i, int i_395_, int i_396_) {
	if (anInt9251 != i || anInt9252 != i_395_ || anInt9188 != i_396_) {
	    anInt9251 = i;
	    anInt9252 = i_395_;
	    anInt9188 = i_396_;
	    method14754();
	    method14722();
	}
    }
    
    public final void method3607(int i, int i_397_, int i_398_) {
	if (anInt9251 != i || anInt9252 != i_397_ || anInt9188 != i_398_) {
	    anInt9251 = i;
	    anInt9252 = i_397_;
	    anInt9188 = i_398_;
	    method14754();
	    method14722();
	}
    }
    
    public final void method3654(int i, Class534_Sub21[] class534_sub21s) {
	for (int i_399_ = 0; i_399_ < i; i_399_++)
	    aClass534_Sub21Array9208[i_399_] = class534_sub21s[i_399_];
	anInt9129 = i;
    }
    
    public final void method3301(int i, int i_400_, int i_401_) {
	if (anInt9251 != i || anInt9252 != i_400_ || anInt9188 != i_401_) {
	    anInt9251 = i;
	    anInt9252 = i_400_;
	    anInt9188 = i_401_;
	    method14754();
	    method14722();
	}
    }
    
    public final void method3565(int i, int i_402_, float f, int i_403_,
				 int i_404_, float f_405_, int i_406_,
				 int i_407_, float f_408_, int i_409_,
				 int i_410_, int i_411_, int i_412_) {
	/* empty */
    }
    
    public final void method3527(Class165 class165) {
	aClass165_Sub2_9244 = (Class165_Sub2) class165;
    }
    
    public final void method3528(int i, int i_413_, int i_414_, int i_415_) {
	if (aClass355_9171 != null) {
	    for (int i_416_ = 0; i_416_ < aClass343Array9253.length;
		 i_416_++) {
		if (aClass343Array9253[i_416_] != null
		    && aClass343Array9253[i_416_].method6070()
		    && !aClass343Array9253[i_416_].method6072()) {
		    if (!aClass355_9171.method6286(i, i_413_, i_414_,
						   i_415_)) {
			aClass355_9171.method6289();
			aClass355_9171 = null;
		    }
		    break;
		}
	    }
	}
    }
    
    public final void method3320(int i, int i_417_, int i_418_, int i_419_) {
	if (aClass355_9171 != null) {
	    for (int i_420_ = 0; i_420_ < aClass343Array9253.length;
		 i_420_++) {
		if (aClass343Array9253[i_420_] != null
		    && aClass343Array9253[i_420_].method6070()
		    && !aClass343Array9253[i_420_].method6072()) {
		    if (!aClass355_9171.method6286(i, i_417_, i_418_,
						   i_419_)) {
			aClass355_9171.method6289();
			aClass355_9171 = null;
		    }
		    break;
		}
	    }
	}
    }
    
    public final void method3530(int i, int i_421_, int i_422_, int i_423_) {
	if (aClass355_9171 != null) {
	    for (int i_424_ = 0; i_424_ < aClass343Array9253.length;
		 i_424_++) {
		if (aClass343Array9253[i_424_] != null
		    && aClass343Array9253[i_424_].method6070()
		    && !aClass343Array9253[i_424_].method6072()) {
		    if (!aClass355_9171.method6286(i, i_421_, i_422_,
						   i_423_)) {
			aClass355_9171.method6289();
			aClass355_9171 = null;
		    }
		    break;
		}
	    }
	}
    }
    
    public abstract void method14739(Class433 class433);
    
    final void method14740() {
	if (!aBool9222)
	    aBool9222 = true;
    }
    
    public final void method3533(int i, int i_425_) {
	if (aClass355_9171 != null)
	    aClass355_9171.method6300(i, i_425_);
    }
    
    public final void method3342(int i) {
	anInt9212 = 0;
	for (/**/; i > 1; i >>= 1)
	    anInt9212++;
	anInt9187 = 1 << anInt9212;
    }
    
    public final void method3285(int i, int i_426_) {
	if (aClass355_9171 != null)
	    aClass355_9171.method6300(i, i_426_);
    }
    
    public final boolean method3536() {
	return aClass355_9171 != null && aClass355_9171.aBool3661;
    }
    
    abstract boolean method14741(Class181 class181, Class173 class173);
    
    public final boolean method3630() {
	return aClass355_9171 != null && aClass355_9171.aBool3661;
    }
    
    public final boolean method3473() {
	return aClass355_9171 != null && aClass355_9171.aBool3661;
    }
    
    public boolean method3540() {
	return (aClass343Array9253[1] != null
		&& aClass343Array9253[1].method6070());
    }
    
    public boolean method3541() {
	return (aClass343Array9253[1] != null
		&& aClass343Array9253[1].method6070());
    }
    
    public void method3321(float f, float f_427_, float f_428_, float f_429_,
			   float f_430_) {
	Class343_Sub2.aFloat10232 = f;
	Class343_Sub2.aFloat10233 = f_427_;
	Class343_Sub2.aFloat10227 = f_428_;
	Class343_Sub2.aFloat10235 = f_429_;
	Class343_Sub2.aFloat10236 = f_430_;
    }
    
    public void method3543(float f, float f_431_, float f_432_, float f_433_,
			   float f_434_) {
	Class343_Sub2.aFloat10232 = f;
	Class343_Sub2.aFloat10233 = f_431_;
	Class343_Sub2.aFloat10227 = f_432_;
	Class343_Sub2.aFloat10235 = f_433_;
	Class343_Sub2.aFloat10236 = f_434_;
    }
    
    abstract void method14742();
    
    public void method3545(float f, float f_435_, float f_436_, float f_437_,
			   float f_438_) {
	Class343_Sub2.aFloat10232 = f;
	Class343_Sub2.aFloat10233 = f_435_;
	Class343_Sub2.aFloat10227 = f_436_;
	Class343_Sub2.aFloat10235 = f_437_;
	Class343_Sub2.aFloat10236 = f_438_;
    }
    
    public Class170 method3546(int[] is) {
	return new Class170_Sub1(this, is);
    }
    
    public Class170 method3422(int[] is) {
	return new Class170_Sub1(this, is);
    }
    
    public abstract void method14743(Class433 class433, Class433 class433_439_,
				     Class433 class433_440_);
    
    public void method3549(Class170 class170, float f, Class170 class170_441_,
			   float f_442_, Class170 class170_443_,
			   float f_444_) {
	int i = 0;
	if (class170_443_ == null && f_444_ > 0.0F)
	    f_444_ = 0.0F;
	if (class170_441_ == null && f_442_ > 0.0F) {
	    class170_441_ = class170_443_;
	    class170_443_ = null;
	    f_442_ = f_444_;
	    f_444_ = 0.0F;
	}
	if (class170 == null && f > 0.0F) {
	    class170 = class170_441_;
	    class170_441_ = class170_443_;
	    class170_443_ = null;
	    f = f_442_;
	    f_442_ = f_444_;
	    f_444_ = 0.0F;
	}
	Class343_Sub3.aClass170_Sub1Array10274[0] = (Class170_Sub1) class170;
	Class343_Sub3.aFloatArray10266[0] = f;
	if (f > 0.0F)
	    i++;
	Class343_Sub3.aClass170_Sub1Array10274[1]
	    = (Class170_Sub1) class170_441_;
	Class343_Sub3.aFloatArray10266[1] = f_442_;
	if (f_442_ > 0.0F)
	    i++;
	Class343_Sub3.aClass170_Sub1Array10274[2]
	    = (Class170_Sub1) class170_443_;
	Class343_Sub3.aFloatArray10266[2] = f_444_;
	if (f_444_ > 0.0F)
	    i++;
	Class343_Sub3.anInt10272 = i;
	Class343_Sub3.aFloat10268 = 1.0F - (f + f_442_ + f_444_);
    }
    
    public final void method3313(int[] is) {
	is[0] = anInt9178;
	is[1] = anInt9176;
	is[2] = anInt9179;
	is[3] = anInt9177;
    }
    
    public final void method3648() {
	if (aClass343Array9253[3] != null
	    && aClass343Array9253[3].method6070()) {
	    aClass355_9171.method6287(aClass343Array9253[3]);
	    aClass354_9211.method6274();
	}
    }
    
    public final void method3552() {
	if (aClass343Array9253[3] != null
	    && aClass343Array9253[3].method6070()) {
	    aClass355_9171.method6287(aClass343Array9253[3]);
	    aClass354_9211.method6274();
	}
    }
    
    public abstract float method14744();
    
    public abstract boolean method14745(boolean bool);
    
    final void method3555(float f, float f_445_, float f_446_, float f_447_,
			  float f_448_, float f_449_) {
	Class343_Sub1.aFloat10178 = f;
	Class343_Sub1.aFloat10177 = f_445_;
	Class343_Sub1.aFloat10179 = f_446_;
	Class343_Sub1.aFloat10191 = f_449_;
    }
    
    public final void method3556(int i, Class166 class166) {
	anInt9247 = i;
	aClass166_9280 = class166;
	aBool9231 = true;
    }
    
    void method14746() {
	if (aClass355_9171 != null)
	    aClass355_9171.method6289();
	if (anInterface37_9226 != null)
	    anInterface37_9226.method142();
	if (anInterface37_9279 != null)
	    anInterface37_9279.method142();
	if (anInterface37_9281 != null)
	    anInterface37_9281.method142();
	if (aClass380_9239 != null)
	    aClass380_9239.method6431();
	for (int i = 0; i < 8; i++) {
	    if (aClass183_Sub3Array9290[i] != null)
		aClass183_Sub3Array9290[i].method15518();
	}
	if (aClass359_9192 != null)
	    aClass359_9192.method6317();
	if (anInterface39_9149 != null)
	    anInterface39_9149.method142();
	if (aClass371_9147 != null) {
	    aClass371_9147.method6382();
	    aClass371_9147 = null;
	}
    }
    
    public final void method3558(int i, Class166 class166) {
	if (!aBool9231)
	    throw new RuntimeException("");
	anInt9247 = i;
	aClass166_9280 = class166;
	if (aBool9246) {
	    aClass348Array9230[3].method6161();
	    aClass348Array9230[3].method6170();
	}
    }
    
    public final void method3456(int i, Class166 class166) {
	if (!aBool9231)
	    throw new RuntimeException("");
	anInt9247 = i;
	aClass166_9280 = class166;
	if (aBool9246) {
	    aClass348Array9230[3].method6161();
	    aClass348Array9230[3].method6170();
	}
    }
    
    public final void method3560(int i, Class166 class166) {
	if (!aBool9231)
	    throw new RuntimeException("");
	anInt9247 = i;
	aClass166_9280 = class166;
	if (aBool9246) {
	    aClass348Array9230[3].method6161();
	    aClass348Array9230[3].method6170();
	}
    }
    
    public final void method3561(int i, Class166 class166) {
	if (!aBool9231)
	    throw new RuntimeException("");
	anInt9247 = i;
	aClass166_9280 = class166;
	if (aBool9246) {
	    aClass348Array9230[3].method6161();
	    aClass348Array9230[3].method6170();
	}
    }
    
    public final void method3584(int i, Class166 class166) {
	if (!aBool9231)
	    throw new RuntimeException("");
	anInt9247 = i;
	aClass166_9280 = class166;
	if (aBool9246) {
	    aClass348Array9230[3].method6161();
	    aClass348Array9230[3].method6170();
	}
    }
    
    static {
	aClass433_9227 = new Class433();
    }
    
    public final void method3564() {
	aBool9231 = false;
    }
    
    public boolean method3443() {
	return (aClass343Array9253[1] != null
		&& aClass343Array9253[1].method6070());
    }
    
    public void method3566(float f, float f_450_, float f_451_, float[] fs) {
	float f_452_ = (aClass433_9284.aFloatArray4853[15]
			+ aClass433_9284.aFloatArray4853[3] * f
			+ aClass433_9284.aFloatArray4853[7] * f_450_
			+ aClass433_9284.aFloatArray4853[11] * f_451_);
	float f_453_ = (aClass433_9284.aFloatArray4853[12]
			+ aClass433_9284.aFloatArray4853[0] * f
			+ aClass433_9284.aFloatArray4853[4] * f_450_
			+ aClass433_9284.aFloatArray4853[8] * f_451_);
	float f_454_ = (aClass433_9284.aFloatArray4853[13]
			+ aClass433_9284.aFloatArray4853[1] * f
			+ aClass433_9284.aFloatArray4853[5] * f_450_
			+ aClass433_9284.aFloatArray4853[9] * f_451_);
	float f_455_ = (aClass433_9142.aFloatArray4853[14]
			+ aClass433_9142.aFloatArray4853[2] * f
			+ aClass433_9142.aFloatArray4853[6] * f_450_
			+ aClass433_9142.aFloatArray4853[10] * f_451_);
	fs[0] = aFloat9257 + aFloat9167 * f_453_ / f_452_;
	fs[1] = aFloat9168 + aFloat9169 * f_454_ / f_452_;
	fs[2] = f_455_;
    }
    
    public void method3361(float f, float f_456_, float f_457_, float[] fs) {
	float f_458_ = (aClass433_9284.aFloatArray4853[14]
			+ aClass433_9284.aFloatArray4853[2] * f
			+ aClass433_9284.aFloatArray4853[6] * f_456_
			+ aClass433_9284.aFloatArray4853[10] * f_457_);
	float f_459_ = (aClass433_9284.aFloatArray4853[15]
			+ aClass433_9284.aFloatArray4853[3] * f
			+ aClass433_9284.aFloatArray4853[7] * f_456_
			+ aClass433_9284.aFloatArray4853[11] * f_457_);
	if (f_458_ < -f_459_ || f_458_ > f_459_) {
	    float[] fs_460_ = fs;
	    float[] fs_461_ = fs;
	    fs[2] = Float.NaN;
	    fs_461_[1] = Float.NaN;
	    fs_460_[0] = Float.NaN;
	} else {
	    float f_462_ = (aClass433_9284.aFloatArray4853[12]
			    + aClass433_9284.aFloatArray4853[0] * f
			    + aClass433_9284.aFloatArray4853[4] * f_456_
			    + aClass433_9284.aFloatArray4853[8] * f_457_);
	    if (f_462_ < -f_459_ || f_462_ > f_459_) {
		float[] fs_463_ = fs;
		float[] fs_464_ = fs;
		fs[2] = Float.NaN;
		fs_464_[1] = Float.NaN;
		fs_463_[0] = Float.NaN;
	    } else {
		float f_465_ = (aClass433_9284.aFloatArray4853[13]
				+ aClass433_9284.aFloatArray4853[1] * f
				+ aClass433_9284.aFloatArray4853[5] * f_456_
				+ aClass433_9284.aFloatArray4853[9] * f_457_);
		if (f_465_ < -f_459_ || f_465_ > f_459_) {
		    float[] fs_466_ = fs;
		    float[] fs_467_ = fs;
		    fs[2] = Float.NaN;
		    fs_467_[1] = Float.NaN;
		    fs_466_[0] = Float.NaN;
		} else {
		    float f_468_
			= (aClass433_9142.aFloatArray4853[14]
			   + aClass433_9142.aFloatArray4853[2] * f
			   + aClass433_9142.aFloatArray4853[6] * f_456_
			   + aClass433_9142.aFloatArray4853[10] * f_457_);
		    fs[0] = aFloat9257 + aFloat9167 * f_462_ / f_459_;
		    fs[1] = aFloat9168 + aFloat9169 * f_465_ / f_459_;
		    fs[2] = f_468_;
		}
	    }
	}
    }
    
    public abstract boolean method14747();
    
    void method3580() {
	if (!aBool9162) {
	    method14596();
	    aClass354_9211.method6274();
	    for (Class534 class534 = aClass700_9155.method14135((byte) -1);
		 class534 != null;
		 class534 = aClass700_9155.method14139(738405386))
		((Class534_Sub2_Sub1) class534).method18118();
	    Class54.method1212(false, true, -1522363632);
	    for (int i = 0; i < aClass348Array9230.length; i++) {
		if (aClass348Array9230[i] != null) {
		    aClass348Array9230[i].method6160();
		    aClass348Array9230[i] = null;
		}
	    }
	    for (int i = 0; i < aClass343Array9253.length; i++) {
		if (aClass343Array9253[i] != null) {
		    aClass343Array9253[i].method6071();
		    aClass343Array9253[i] = null;
		}
	    }
	    method14583();
	    method3661(0);
	    aBool9162 = true;
	}
    }
    
    public abstract void method14748(Class349 class349);
    
    void method3582() {
	if (!aBool9162) {
	    method14596();
	    aClass354_9211.method6274();
	    for (Class534 class534 = aClass700_9155.method14135((byte) -1);
		 class534 != null;
		 class534 = aClass700_9155.method14139(1623131149))
		((Class534_Sub2_Sub1) class534).method18118();
	    Class54.method1212(false, true, -1269515646);
	    for (int i = 0; i < aClass348Array9230.length; i++) {
		if (aClass348Array9230[i] != null) {
		    aClass348Array9230[i].method6160();
		    aClass348Array9230[i] = null;
		}
	    }
	    for (int i = 0; i < aClass343Array9253.length; i++) {
		if (aClass343Array9253[i] != null) {
		    aClass343Array9253[i].method6071();
		    aClass343Array9253[i] = null;
		}
	    }
	    method14583();
	    method3661(0);
	    aBool9162 = true;
	}
    }
    
    public final Class165 method3535(int i) {
	return new Class165_Sub2_Sub1(this, i);
    }
    
    public final boolean method3496() {
	return true;
    }
    
    public final int method3501() {
	return anInt9270 - 2;
    }
    
    public final Class163 method3274(Class169 class169, boolean bool) {
	Class163 class163;
	if (class169.method2762() != 0 && class169.method2763() != 0) {
	    int[] is = class169.method2766(false);
	    class163 = method3317(is, 0, class169.method2762(),
				  class169.method2762(), class169.method2763(),
				  (byte) 104);
	} else
	    class163 = method3317(new int[] { 0 }, 0, 1, 1, 1, (byte) -73);
	class163.method2645(class169.method2764(), class169.method2781(),
			    class169.method2765(), class169.method2767());
	return class163;
    }
    
    public final boolean method3385() {
	return true;
    }
    
    public final void method3589(int i, Class145 class145, int i_469_,
				 int i_470_) {
	method3461(false);
	aClass163_Sub2_9278.method2673
	    (0.0F, 0.0F, (float) method3253(-1638511832).method2910(), 0.0F,
	     0.0F, (float) method3253(-1777512602).method2911(), 0, class145,
	     i_469_, i_470_);
	method3461(true);
    }
    
    public final int method3379(int i, int i_471_) {
	return i | i_471_;
    }
    
    public final int method14749() {
	return anInt9215;
    }
    
    byte[] method14750(String string, String string_472_) {
	return aClass472_9124.method7687(string, string_472_, -230968438);
    }
    
    public void method3593(int[] is) {
	is[0] = anInt9180;
	is[1] = anInt9256;
	is[2] = anInt9207;
	is[3] = anInt9183;
    }
    
    public void method3594(int[] is) {
	is[0] = anInt9180;
	is[1] = anInt9256;
	is[2] = anInt9207;
	is[3] = anInt9183;
    }
    
    public final void method3235(boolean bool) {
	aBool9190 = bool;
	method14644();
    }
    
    abstract Interface38 method14751(Class181 class181, int i, int i_473_,
				     boolean bool, float[] fs, int i_474_,
				     int i_475_);
    
    public final void method3574(int i, float f, float f_476_, float f_477_,
				 float f_478_, float f_479_) {
	boolean bool = anInt9201 != i;
	f *= 0.5F;
	f_476_ *= 0.5F;
	if (bool || aFloat9206 != f || aFloat9267 != f_476_) {
	    anInt9201 = i;
	    aFloat9206 = f;
	    aFloat9267 = f_476_;
	    if (bool) {
		aFloat9159 = (float) (anInt9201 & 0xff0000) / 1.671168E7F;
		aFloat9292 = (float) (anInt9201 & 0xff00) / 65280.0F;
		aFloat9163 = (float) (anInt9201 & 0xff) / 255.0F;
		method14724();
	    }
	    method14654();
	}
	if (aFloatArray9199[0] != f_477_ || aFloatArray9199[1] != f_478_
	    || aFloatArray9199[2] != f_479_) {
	    aFloatArray9199[0] = f_477_;
	    aFloatArray9199[1] = f_478_;
	    aFloatArray9199[2] = f_479_;
	    aFloatArray9200[0] = -f_477_;
	    aFloatArray9200[1] = -f_478_;
	    aFloatArray9200[2] = -f_479_;
	    float f_480_
		= (float) (1.0 / Math.sqrt((double) (f_477_ * f_477_
						     + f_478_ * f_478_
						     + f_479_ * f_479_)));
	    aFloatArray9197[0] = f_477_ * f_480_;
	    aFloatArray9197[1] = f_478_ * f_480_;
	    aFloatArray9197[2] = f_479_ * f_480_;
	    aFloatArray9198[0] = -aFloatArray9197[0];
	    aFloatArray9198[1] = -aFloatArray9197[1];
	    aFloatArray9198[2] = -aFloatArray9197[2];
	    method14763();
	    anInt9213 = (int) (f_477_ * 256.0F / f_478_);
	    anInt9287 = (int) (f_479_ * 256.0F / f_478_);
	}
	method14783();
    }
    
    abstract void method14752();
    
    public final boolean method3599() {
	if (aClass343Array9253[3] != null
	    && !aClass343Array9253[3].method6070()) {
	    boolean bool = aClass355_9171.method6283(aClass343Array9253[3]);
	    if (bool)
		aClass354_9211.method6274();
	    return bool;
	}
	return false;
    }
    
    public final boolean method3611() {
	return true;
    }
    
    public void method3644(boolean bool) {
	aBool9289 = bool;
    }
    
    public void method3667() {
	if (aClass371_9147 != null)
	    aClass371_9147.method6383();
    }
    
    public void method3668() {
	if (aClass371_9147 != null)
	    aClass371_9147.method6387();
    }
    
    void method14753() {
	if (aClass355_9171 != null)
	    aClass355_9171.method6289();
	if (anInterface37_9226 != null)
	    anInterface37_9226.method142();
	if (anInterface37_9279 != null)
	    anInterface37_9279.method142();
	if (anInterface37_9281 != null)
	    anInterface37_9281.method142();
	if (aClass380_9239 != null)
	    aClass380_9239.method6431();
	for (int i = 0; i < 8; i++) {
	    if (aClass183_Sub3Array9290[i] != null)
		aClass183_Sub3Array9290[i].method15518();
	}
	if (aClass359_9192 != null)
	    aClass359_9192.method6317();
	if (anInterface39_9149 != null)
	    anInterface39_9149.method142();
	if (aClass371_9147 != null) {
	    aClass371_9147.method6382();
	    aClass371_9147 = null;
	}
    }
    
    public void method3429() {
	if (aClass371_9147 != null)
	    aClass371_9147.method6390();
    }
    
    public void method3604() {
	if (aClass371_9147 != null)
	    aClass371_9147.method6390();
    }
    
    final void method14754() {
	if (aClass348_9229 != null)
	    aClass348_9229.method6170();
	method14752();
    }
    
    public final boolean method3400() {
	return false;
    }
    
    public boolean method3286() {
	return (aClass343Array9253[2] != null
		&& aClass343Array9253[2].method6070());
    }
    
    public boolean method3682() {
	return (aClass343Array9253[2] != null
		&& aClass343Array9253[2].method6070());
    }
    
    public void method14755(Interface36 interface36) {
	aClass77_9114.method1593(interface36, anObject9291, (byte) 79);
    }
    
    public final Class534_Sub2 method3614(int i) {
	Class534_Sub2_Sub1 class534_sub2_sub1 = new Class534_Sub2_Sub1(i);
	aClass700_9155.method14131(class534_sub2_sub1, (short) 789);
	return class534_sub2_sub1;
    }
    
    public void method14756(Interface36 interface36) {
	aClass77_9114.method1599(interface36, (byte) 21);
    }
    
    void method14757() {
	ArrayList arraylist = aClass77_9114.method1595(-1107070690);
	Iterator iterator = arraylist.iterator();
	while (iterator.hasNext()) {
	    Interface36 interface36 = (Interface36) iterator.next();
	    interface36.method142();
	}
    }
    
    void method14758() {
	ArrayList arraylist = aClass77_9114.method1595(-38681181);
	Iterator iterator = arraylist.iterator();
	while (iterator.hasNext()) {
	    Interface36 interface36 = (Interface36) iterator.next();
	    interface36.method142();
	}
    }
    
    public abstract boolean method14759();
    
    public abstract boolean method14760();
    
    public abstract boolean method14761();
    
    public abstract boolean method14762();
    
    public final Class433 method3513() {
	return aClass433_9203;
    }
    
    abstract void method14763();
    
    public abstract boolean method14764(boolean bool);
    
    public final void method3461(boolean bool) {
	aBool9190 = bool;
	method14644();
    }
    
    public final void method3505(Class174 class174) {
	aClass359_9192.method6316(this, class174);
    }
    
    static int method14765(char c, char c_481_, char c_482_, char c_483_) {
	return ((c & 0xff) << 0 | (c_481_ & 0xff) << 8 | (c_482_ & 0xff) << 16
		| (c_483_ & 0xff) << 24);
    }
    
    public Class446 method3676() {
	return aClass446_9140;
    }
    
    final boolean method14766() {
	return aBool9125;
    }
    
    void method3557() {
	if (!aBool9162) {
	    method14596();
	    aClass354_9211.method6274();
	    for (Class534 class534 = aClass700_9155.method14135((byte) -1);
		 class534 != null;
		 class534 = aClass700_9155.method14139(1329399075))
		((Class534_Sub2_Sub1) class534).method18118();
	    Class54.method1212(false, true, -2016622501);
	    for (int i = 0; i < aClass348Array9230.length; i++) {
		if (aClass348Array9230[i] != null) {
		    aClass348Array9230[i].method6160();
		    aClass348Array9230[i] = null;
		}
	    }
	    for (int i = 0; i < aClass343Array9253.length; i++) {
		if (aClass343Array9253[i] != null) {
		    aClass343Array9253[i].method6071();
		    aClass343Array9253[i] = null;
		}
	    }
	    method14583();
	    method3661(0);
	    aBool9162 = true;
	}
    }
    
    public final void method14767(Interface43 interface43) {
	if (anInterface43Array9220[anInt9215] != interface43) {
	    anInterface43Array9220[anInt9215] = interface43;
	    if (interface43 != null)
		interface43.method333();
	    else
		anInterface38_9204.method333();
	    anInt9265 &= ~0x11;
	}
    }
    
    public void method14768(int i) {
	if (i > anInt9243) {
	    anInt9243 = i;
	    aByteBuffer9266 = ByteBuffer.allocateDirect(anInt9243);
	    aByteBuffer9266.order(ByteOrder.nativeOrder());
	    aLong9139
		= DirectBufferHelper.getDirectBufferAddress(aByteBuffer9266);
	}
    }
    
    public void method14769(int i) {
	if (i > anInt9243) {
	    anInt9243 = i;
	    aByteBuffer9266 = ByteBuffer.allocateDirect(anInt9243);
	    aByteBuffer9266.order(ByteOrder.nativeOrder());
	    aLong9139
		= DirectBufferHelper.getDirectBufferAddress(aByteBuffer9266);
	}
    }
    
    abstract boolean method14770(Class181 class181, Class173 class173);
    
    public abstract Class269 method14771(String string);
    
    abstract Interface38 method14772(int i, int i_484_, boolean bool, int[] is,
				     int i_485_, int i_486_);
    
    public abstract Class269 method14773(String string);
    
    abstract void method14774();
    
    byte[] method14775(String string, String string_487_) {
	return aClass472_9124.method7687(string, string_487_, -815346680);
    }
    
    final void method14776() {
	aClass340_9132 = new Class340(this);
	aBool9125 = false;
	try {
	    aClass324_9158 = new Class324_Sub2(this);
	    aClass320_9232 = new Class320_Sub1(this);
	    aClass314_9233 = new Class314_Sub1(this);
	    aClass323_9234 = new Class323_Sub2(this);
	    aClass348_Sub1_Sub2_9235
		= new Class348_Sub1_Sub2(this, aClass340_9132, false);
	    aClass348_Sub1_Sub2_9236
		= new Class348_Sub1_Sub2(this, aClass340_9132, true);
	    aClass348_Sub1_Sub1_9237
		= new Class348_Sub1_Sub1(this, aClass340_9132);
	} catch (Exception exception) {
	    exception.printStackTrace();
	    aClass324_9158 = new Class324_Sub1(this);
	    aClass320_9232 = new Class320_Sub2(this);
	    aClass314_9233 = new Class314_Sub2(this);
	    aClass323_9234 = new Class323_Sub1(this);
	    aClass348_Sub1_Sub2_9235 = null;
	    aClass348_Sub1_Sub2_9236 = null;
	    aClass348_Sub1_Sub1_9237 = null;
	    aBool9125 = true;
	}
	if (!aBool9125) {
	    int i;
	    int i_488_;
	    if (aClass175_1989 != null) {
		i_488_ = aClass175_1989.method2910();
		i = aClass175_1989.method2911();
	    } else {
		i = 0;
		i_488_ = 0;
	    }
	    aClass355_9171 = new Class355(this, i_488_, i);
	    aClass343Array9253[3] = new Class343_Sub1(this);
	    aClass343Array9253[1] = new Class343_Sub2(this);
	    aClass343Array9253[2] = new Class343_Sub3(this);
	    if (aClass343Array9253[3].method6073())
		aClass355_9171.method6283(aClass343Array9253[3]);
	    aClass355_9171.method6283(aClass343Array9253[1]);
	    aClass355_9171.method6283(aClass343Array9253[2]);
	    method14592();
	    method14611();
	}
	if (aClass348_9229 != null) {
	    aClass348_9229.method6159();
	    aClass348_9229 = null;
	}
	method14597();
    }
    
    final Interface39 method14777(int i) {
	if (anInterface39_9149.method53() < i * 2)
	    anInterface39_9149.method277(i);
	return anInterface39_9149;
    }
    
    Class261 method14778(byte[] is) {
	if (is == null)
	    return null;
	Class261 class261;
	try {
	    class261 = new Class261(is);
	} catch (Exception exception) {
	    return null;
	}
	return class261;
    }
    
    Class261 method14779(byte[] is) {
	if (is == null)
	    return null;
	Class261 class261;
	try {
	    class261 = new Class261(is);
	} catch (Exception exception) {
	    return null;
	}
	return class261;
    }
    
    Class261 method14780(byte[] is) {
	if (is == null)
	    return null;
	Class261 class261;
	try {
	    class261 = new Class261(is);
	} catch (Exception exception) {
	    return null;
	}
	return class261;
    }
    
    abstract void method14781();
    
    public final void method3380(int i, int i_489_) {
	if (aClass355_9171 != null)
	    aClass355_9171.method6300(i, i_489_);
    }
    
    abstract Interface39 method14782(boolean bool);
    
    abstract void method14783();
    
    final void method14784() {
	aClass340_9132 = new Class340(this);
	aBool9125 = false;
	try {
	    aClass324_9158 = new Class324_Sub2(this);
	    aClass320_9232 = new Class320_Sub1(this);
	    aClass314_9233 = new Class314_Sub1(this);
	    aClass323_9234 = new Class323_Sub2(this);
	    aClass348_Sub1_Sub2_9235
		= new Class348_Sub1_Sub2(this, aClass340_9132, false);
	    aClass348_Sub1_Sub2_9236
		= new Class348_Sub1_Sub2(this, aClass340_9132, true);
	    aClass348_Sub1_Sub1_9237
		= new Class348_Sub1_Sub1(this, aClass340_9132);
	} catch (Exception exception) {
	    exception.printStackTrace();
	    aClass324_9158 = new Class324_Sub1(this);
	    aClass320_9232 = new Class320_Sub2(this);
	    aClass314_9233 = new Class314_Sub2(this);
	    aClass323_9234 = new Class323_Sub1(this);
	    aClass348_Sub1_Sub2_9235 = null;
	    aClass348_Sub1_Sub2_9236 = null;
	    aClass348_Sub1_Sub1_9237 = null;
	    aBool9125 = true;
	}
	if (!aBool9125) {
	    int i;
	    int i_490_;
	    if (aClass175_1989 != null) {
		i_490_ = aClass175_1989.method2910();
		i = aClass175_1989.method2911();
	    } else {
		i = 0;
		i_490_ = 0;
	    }
	    aClass355_9171 = new Class355(this, i_490_, i);
	    aClass343Array9253[3] = new Class343_Sub1(this);
	    aClass343Array9253[1] = new Class343_Sub2(this);
	    aClass343Array9253[2] = new Class343_Sub3(this);
	    if (aClass343Array9253[3].method6073())
		aClass355_9171.method6283(aClass343Array9253[3]);
	    aClass355_9171.method6283(aClass343Array9253[1]);
	    aClass355_9171.method6283(aClass343Array9253[2]);
	    method14592();
	    method14611();
	}
	if (aClass348_9229 != null) {
	    aClass348_9229.method6159();
	    aClass348_9229 = null;
	}
	method14597();
    }
    
    void method14785() {
	method14650(7);
	method14595();
    }
    
    Class185_Sub1(Class177 class177, Interface25 interface25,
		  Interface45 interface45, Interface48 interface48,
		  Interface46 interface46, Class472 class472, int i,
		  int i_491_) {
	super(class177, interface25, interface45, interface48, interface46);
	aClass700_9155 = new Class700();
	aClass446_9138 = new Class446();
	aClass433_9182 = new Class433();
	aClass446_9140 = new Class446();
	aClass446_9141 = new Class446();
	aClass433_9142 = new Class433();
	aClass433_9118 = new Class433();
	aClass433_9144 = new Class433();
	aClass446_9214 = new Class446();
	aClass433_9288 = new Class433();
	aClass446_9166 = new Class446();
	aClass433_9194 = new Class433();
	aClass433_9150 = new Class433();
	aClass438_9151 = new Class438();
	aFloatArray9156 = new float[4];
	aBool9153 = false;
	aClass336_9154 = Class336.aClass336_3520;
	aBool9223 = false;
	aClass433_9170 = new Class433();
	aClass433_9274 = new Class433();
	aBool9222 = false;
	aClass433_9203 = new Class433();
	aClass433_9160 = new Class433();
	aClass433_9228 = aClass433_9160;
	aClass433_9202 = new Class433();
	aClass433_9284 = new Class433();
	aClass433_9164 = new Class433();
	aFloatArrayArray9165 = new float[6][4];
	aFloat9152 = 0.0F;
	aFloat9157 = 1.0F;
	aFloat9148 = 0.0F;
	aFloat9173 = 1.0F;
	aFloat9174 = 50.0F;
	aFloat9175 = 3584.0F;
	anInt9176 = 0;
	anInt9177 = 0;
	anInt9178 = 0;
	anInt9179 = 0;
	anInt9180 = 0;
	anInt9256 = 0;
	anInt9207 = 0;
	anInt9183 = 0;
	anInt9184 = 0;
	anInt9185 = 0;
	anInt9186 = 0;
	anInt9210 = 0;
	anInt9113 = 0;
	anInt9189 = 0;
	aBool9190 = true;
	aBool9191 = false;
	aBool9248 = true;
	aBool9193 = false;
	aBool9146 = false;
	aBool9195 = true;
	aBool9196 = false;
	aFloatArray9197 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
	aFloatArray9198 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };
	aFloatArray9199 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
	aFloatArray9200 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
	anInt9201 = 16777215;
	aFloat9159 = 1.0F;
	aFloat9292 = 1.0F;
	aFloat9163 = 1.0F;
	aFloat9205 = 1.0F;
	aFloat9206 = -1.0F;
	aFloat9267 = -1.0F;
	anInt9187 = 8;
	anInt9212 = 3;
	anInt9215 = 0;
	aBool9289 = false;
	aClass348Array9230 = new Class348[16];
	aClass343Array9253 = new Class343[4];
	aBool9246 = false;
	aBool9250 = true;
	anInt9251 = -1;
	anInt9252 = -1;
	anInt9188 = 0;
	anInt9283 = 1;
	anInt9238 = -1;
	aClass370_9258 = Class370.aClass370_3873;
	aBool9259 = true;
	aBool9131 = true;
	aByte9261 = (byte) 0;
	anInt9262 = 2;
	aBool9162 = false;
	new Stream();
	aClass183_Sub3Array9128 = new Class183_Sub3[8];
	aClass183_Sub3Array9290 = new Class183_Sub3[8];
	aClass433_9145 = new Class433();
	aClass446_9245 = new Class446();
	try {
	    aClass472_9124 = class472;
	    anInt9263 = i;
	    anInt9268 = i_491_;
	    Class456.method7426(false, true, 1739452007);
	    if (anInterface25_1997 != null)
		aClass354_9211 = new Class354(this, anInterface25_1997);
	    else
		aClass354_9211 = null;
	    if (anInt9268 == 0)
		anIntArray9126 = Class661.anIntArray8549;
	    else
		anIntArray9126 = Class661.anIntArray8548;
	    try {
		Field field
		    = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
		field.setAccessible(true);
		anUnsafe9127 = (Unsafe) field.get(null);
	    } catch (Exception exception) {
		/* empty */
	    }
	    method14586(4194304);
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    method3236(-568376843);
	    if (throwable instanceof OutOfMemoryError)
		throw (OutOfMemoryError) throwable;
	    throw new RuntimeException("");
	}
	method3538(method3312(131072));
    }
    
    public void method3284(float f, float f_492_) {
	aFloat9148 = f;
	aFloat9173 = f_492_;
	method14955();
    }
    
    public static void method14786() throws Exception_Sub3 {
	Class112.method2018(-1327590673).method400("jaclib", -968958470);
    }
    
    public final Class433 method3511() {
	return aClass433_9203;
    }
    
    public final void method3324(int i, Class145 class145, int i_493_,
				 int i_494_) {
	method3461(false);
	aClass163_Sub2_9278.method2673
	    (0.0F, 0.0F, (float) method3253(-1521917930).method2910(), 0.0F,
	     0.0F, (float) method3253(-664941820).method2911(), 0, class145,
	     i_493_, i_494_);
	method3461(true);
    }
    
    void method14787() {
	if (aClass355_9171 != null)
	    aClass355_9171.method6294();
	if (aClass343Array9253 != null) {
	    for (int i = 0; i < aClass343Array9253.length; i++) {
		if (aClass343Array9253[i] != null
		    && aClass343Array9253[i].method6070())
		    aClass343Array9253[i].method6062();
	    }
	}
	aClass359_9192 = new Class359(this);
	method14598();
	method14606();
	method14600();
	aClass380_9239 = new Class380(this, 1024);
	aClass359_9192.method6318(this);
	if (aBool9271)
	    aClass371_9147 = new Class371(this, 1024);
    }
    
    public final int method3498() {
	return anInt9270 - 2;
    }
    
    void method14788() {
	if (aClass355_9171 != null)
	    aClass355_9171.method6294();
	if (aClass343Array9253 != null) {
	    for (int i = 0; i < aClass343Array9253.length; i++) {
		if (aClass343Array9253[i] != null
		    && aClass343Array9253[i].method6070())
		    aClass343Array9253[i].method6062();
	    }
	}
	aClass359_9192 = new Class359(this);
	method14598();
	method14606();
	method14600();
	aClass380_9239 = new Class380(this, 1024);
	aClass359_9192.method6318(this);
	if (aBool9271)
	    aClass371_9147 = new Class371(this, 1024);
    }
    
    final void method14789() {
	anInterface37_9226 = method14698(false);
	int i = 160;
	anInterface37_9226.method236(i, 32);
	aByteBuffer9266.clear();
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putInt(-1);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putInt(-1);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putInt(-1);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putInt(-1);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putInt(-1);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	anInterface37_9226.method235(0, aByteBuffer9266.position(), aLong9139);
	aClass349_9143
	    = method14699(new Class381[]
			  { new Class381(new Class350[]
					 { Class350.aClass350_3610,
					   Class350.aClass350_3595,
					   Class350.aClass350_3597,
					   Class350.aClass350_3597 }) });
    }
    
    final void method14790() {
	anInterface37_9226 = method14698(false);
	int i = 160;
	anInterface37_9226.method236(i, 32);
	aByteBuffer9266.clear();
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putInt(-1);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putInt(-1);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putInt(-1);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putInt(-1);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(1.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putInt(-1);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	anInterface37_9226.method235(0, aByteBuffer9266.position(), aLong9139);
	aClass349_9143
	    = method14699(new Class381[]
			  { new Class381(new Class350[]
					 { Class350.aClass350_3610,
					   Class350.aClass350_3595,
					   Class350.aClass350_3597,
					   Class350.aClass350_3597 }) });
    }
    
    public void method3237(boolean bool) {
	aBool9289 = bool;
    }
    
    boolean method14791(float f, float f_495_, float f_496_, float f_497_,
			float f_498_, float f_499_) {
	method14586(24);
	aByteBuffer9266.clear();
	aByteBuffer9266.putFloat(f);
	aByteBuffer9266.putFloat(f_495_);
	aByteBuffer9266.putFloat(f_496_);
	aByteBuffer9266.putFloat(f_497_);
	aByteBuffer9266.putFloat(f_498_);
	aByteBuffer9266.putFloat(f_499_);
	return anInterface37_9279.method235(0, aByteBuffer9266.position(),
					    aLong9139);
    }
    
    abstract void method14792();
    
    public abstract boolean method14793();
    
    public abstract void method14794(Class349 class349);
    
    Class353 method14795() {
	if (aClass371_9147 == null)
	    return Class353.aClass353_3655;
	return aClass371_9147.method6399();
    }
    
    void method14796() {
	method14913();
    }
    
    final void method3465(int i, int i_500_, int i_501_, int i_502_,
			  int i_503_) {
	/* empty */
    }
    
    boolean method14797() {
	if (aClass343Array9253[1] != null
	    && !aClass343Array9253[1].method6070()) {
	    boolean bool = aClass355_9171.method6283(aClass343Array9253[1]);
	    if (bool)
		aClass354_9211.method6274();
	    return bool;
	}
	return false;
    }
    
    boolean method14798() {
	if (aClass343Array9253[2] != null
	    && !aClass343Array9253[2].method6070()) {
	    boolean bool = aClass355_9171.method6283(aClass343Array9253[2]);
	    if (bool)
		aClass354_9211.method6274();
	    return bool;
	}
	return false;
    }
    
    boolean method14799() {
	if (aClass343Array9253[2] != null
	    && !aClass343Array9253[2].method6070()) {
	    boolean bool = aClass355_9171.method6283(aClass343Array9253[2]);
	    if (bool)
		aClass354_9211.method6274();
	    return bool;
	}
	return false;
    }
    
    boolean method14800() {
	if (aClass343Array9253[2] != null
	    && !aClass343Array9253[2].method6070()) {
	    boolean bool = aClass355_9171.method6283(aClass343Array9253[2]);
	    if (bool)
		aClass354_9211.method6274();
	    return bool;
	}
	return false;
    }
    
    abstract void method14801(int i, Class373 class373, boolean bool);
    
    abstract boolean method14802(Class181 class181, Class173 class173);
    
    final void method14803(boolean bool) {
	if (bool != aBool9193) {
	    aBool9193 = bool;
	    method14643();
	    anInt9265 &= ~0x1f;
	}
    }
    
    final Interface39 method14804(int i) {
	if (anInterface39_9149.method53() < i * 2)
	    anInterface39_9149.method277(i);
	return anInterface39_9149;
    }
    
    final Interface39 method14805(int i) {
	if (anInterface39_9149.method53() < i * 2)
	    anInterface39_9149.method277(i);
	return anInterface39_9149;
    }
    
    public final Interface41 method14806() {
	return (aClass165_Sub2_9244 != null ? aClass165_Sub2_9244.method15565()
		: null);
    }
    
    public final Interface41 method14807() {
	return (aClass165_Sub2_9244 != null ? aClass165_Sub2_9244.method15565()
		: null);
    }
    
    final void method14808() {
	if (aClass336_9154 == Class336.aClass336_3518) {
	    anInt9184 = anInt9180;
	    anInt9185 = anInt9256;
	    anInt9186 = anInt9207;
	    anInt9210 = anInt9183;
	    aFloat9152 = aFloat9148;
	    aFloat9157 = aFloat9173;
	} else {
	    anInt9184 = 0;
	    anInt9185 = 0;
	    anInt9186 = aClass175_1989.method2910();
	    anInt9210 = aClass175_1989.method2911();
	    aFloat9152 = 0.0F;
	    aFloat9157 = 1.0F;
	}
	method14620();
	aFloat9167 = (float) anInt9207 / 2.0F;
	aFloat9169 = (float) anInt9183 / 2.0F;
	aFloat9257 = (float) anInt9180 + aFloat9167;
	aFloat9168 = (float) anInt9256 + aFloat9169;
    }
    
    final void method14809() {
	if (aClass336_9154 == Class336.aClass336_3518) {
	    anInt9184 = anInt9180;
	    anInt9185 = anInt9256;
	    anInt9186 = anInt9207;
	    anInt9210 = anInt9183;
	    aFloat9152 = aFloat9148;
	    aFloat9157 = aFloat9173;
	} else {
	    anInt9184 = 0;
	    anInt9185 = 0;
	    anInt9186 = aClass175_1989.method2910();
	    anInt9210 = aClass175_1989.method2911();
	    aFloat9152 = 0.0F;
	    aFloat9157 = 1.0F;
	}
	method14620();
	aFloat9167 = (float) anInt9207 / 2.0F;
	aFloat9169 = (float) anInt9183 / 2.0F;
	aFloat9257 = (float) anInt9180 + aFloat9167;
	aFloat9168 = (float) anInt9256 + aFloat9169;
    }
    
    final void method14810() {
	if (aClass336_9154 == Class336.aClass336_3518) {
	    anInt9184 = anInt9180;
	    anInt9185 = anInt9256;
	    anInt9186 = anInt9207;
	    anInt9210 = anInt9183;
	    aFloat9152 = aFloat9148;
	    aFloat9157 = aFloat9173;
	} else {
	    anInt9184 = 0;
	    anInt9185 = 0;
	    anInt9186 = aClass175_1989.method2910();
	    anInt9210 = aClass175_1989.method2911();
	    aFloat9152 = 0.0F;
	    aFloat9157 = 1.0F;
	}
	method14620();
	aFloat9167 = (float) anInt9207 / 2.0F;
	aFloat9169 = (float) anInt9183 / 2.0F;
	aFloat9257 = (float) anInt9180 + aFloat9167;
	aFloat9168 = (float) anInt9256 + aFloat9169;
    }
    
    final void method14811(int i, int i_504_) {
	anInt9113 = i;
	anInt9189 = i_504_;
	method14620();
	if (!aBool9294
	    && (aBool9289 || method14703() == Class353.aClass353_3655)) {
	    aBool9294 = true;
	    method14622();
	}
	if (aBool9294)
	    method14621();
    }
    
    abstract void method14812();
    
    public void method3544(float f, float f_505_, float f_506_, float f_507_,
			   float f_508_) {
	Class343_Sub2.aFloat10232 = f;
	Class343_Sub2.aFloat10233 = f_505_;
	Class343_Sub2.aFloat10227 = f_506_;
	Class343_Sub2.aFloat10235 = f_507_;
	Class343_Sub2.aFloat10236 = f_508_;
    }
    
    abstract void method14813();
    
    public final void method3353(int i, int i_509_, int i_510_) {
	if (anInt9251 != i || anInt9252 != i_509_ || anInt9188 != i_510_) {
	    anInt9251 = i;
	    anInt9252 = i_509_;
	    anInt9188 = i_510_;
	    method14754();
	    method14722();
	}
    }
    
    final Interface38 method14814(Class181 class181, int i, int i_511_,
				  boolean bool, float[] fs) {
	return method14663(class181, i, i_511_, bool, fs, 0, 0);
    }
    
    abstract void method14815();
    
    abstract void method14816();
    
    abstract void method14817();
    
    final Class433 method14818() {
	if (aClass336_9154 == Class336.aClass336_3518)
	    return aClass433_9142;
	return aClass433_9227;
    }
    
    final Class433 method14819() {
	if (aClass336_9154 == Class336.aClass336_3518)
	    return aClass433_9142;
	return aClass433_9227;
    }
    
    final Class433 method14820() {
	if (aClass336_9154 == Class336.aClass336_3518)
	    return aClass433_9142;
	return aClass433_9227;
    }
    
    abstract void method14821(int i);
    
    final Class433 method14822() {
	if (aClass336_9154 == Class336.aClass336_3518)
	    return aClass433_9118;
	return aClass433_9227;
    }
    
    Class433 method14823() {
	return aClass433_9182;
    }
    
    Class433 method14824() {
	return aClass433_9182;
    }
    
    Class433 method14825() {
	if (aClass336_9154 == Class336.aClass336_3518) {
	    if (!aBool9153)
		method14629();
	    return aClass433_9288;
	}
	return aClass433_9182;
    }
    
    final Class433 method14826() {
	return aClass433_9164;
    }
    
    final Class433 method14827() {
	return aClass433_9202;
    }
    
    abstract Interface38 method14828(int i, int i_512_, boolean bool, int[] is,
				     int i_513_, int i_514_);
    
    final void method14829() {
	if (aClass336_9154 != Class336.aClass336_3520) {
	    Class336 class336 = aClass336_9154;
	    aClass336_9154 = Class336.aClass336_3520;
	    if (class336 == Class336.aClass336_3518)
		method14627();
	    aClass433_9228 = aClass433_9160;
	    method14640();
	    method14955();
	    anInt9265 &= ~0x1f;
	}
    }
    
    final void method14830() {
	if (aClass336_9154 != Class336.aClass336_3519) {
	    Class336 class336 = aClass336_9154;
	    aClass336_9154 = Class336.aClass336_3519;
	    if (class336 == Class336.aClass336_3518)
		method14627();
	    method14602();
	    aClass433_9228 = aClass433_9170;
	    method14640();
	    method14955();
	    anInt9265 &= ~0x18;
	}
    }
    
    final void method14831() {
	aBool9223 = false;
	if (aClass336_9154 == Class336.aClass336_3519) {
	    method14602();
	    method14640();
	}
    }
    
    public final void method3531(int i, int i_515_, int i_516_, int i_517_) {
	if (aClass355_9171 != null) {
	    for (int i_518_ = 0; i_518_ < aClass343Array9253.length;
		 i_518_++) {
		if (aClass343Array9253[i_518_] != null
		    && aClass343Array9253[i_518_].method6070()
		    && !aClass343Array9253[i_518_].method6072()) {
		    if (!aClass355_9171.method6286(i, i_515_, i_516_,
						   i_517_)) {
			aClass355_9171.method6289();
			aClass355_9171 = null;
		    }
		    break;
		}
	    }
	}
    }
    
    public void method14832(int i) {
	if (i > anInt9243) {
	    anInt9243 = i;
	    aByteBuffer9266 = ByteBuffer.allocateDirect(anInt9243);
	    aByteBuffer9266.order(ByteOrder.nativeOrder());
	    aLong9139
		= DirectBufferHelper.getDirectBufferAddress(aByteBuffer9266);
	}
    }
    
    final void method14833() {
	if (aClass336_9154 != Class336.aClass336_3518) {
	    aClass336_9154 = Class336.aClass336_3518;
	    method14627();
	    method14639();
	    aClass433_9228 = aClass433_9203;
	    method14640();
	    method14955();
	    anInt9265 &= ~0x7;
	}
    }
    
    final void method14834() {
	aBool9222 = false;
	method14639();
	if (aClass336_9154 == Class336.aClass336_3518)
	    method14640();
    }
    
    final void method14835() {
	aBool9222 = false;
	method14639();
	if (aClass336_9154 == Class336.aClass336_3518)
	    method14640();
    }
    
    final void method14836() {
	aBool9222 = false;
	method14639();
	if (aClass336_9154 == Class336.aClass336_3518)
	    method14640();
    }
    
    final void method14837() {
	if (!aBool9223) {
	    int i;
	    int i_519_;
	    if (aClass175_1989 != null) {
		i_519_ = aClass175_1989.method2910();
		i = aClass175_1989.method2911();
	    } else {
		i = 0;
		i_519_ = 0;
	    }
	    Class433 class433 = aClass433_9170;
	    if (i_519_ != 0 && i != 0)
		class433.method6853(0.0F, (float) i_519_, 0.0F, (float) i,
				    -1.0F, 1.0F);
	    else
		class433.method6840();
	    aClass433_9274.method6842(class433);
	    method14739(aClass433_9274);
	    aBool9223 = true;
	}
    }
    
    public boolean method3304() {
	return (aClass343Array9253[2] != null
		&& aClass343Array9253[2].method6070());
    }
    
    final void method14838() {
	if (!aBool9223) {
	    int i;
	    int i_520_;
	    if (aClass175_1989 != null) {
		i_520_ = aClass175_1989.method2910();
		i = aClass175_1989.method2911();
	    } else {
		i = 0;
		i_520_ = 0;
	    }
	    Class433 class433 = aClass433_9170;
	    if (i_520_ != 0 && i != 0)
		class433.method6853(0.0F, (float) i_520_, 0.0F, (float) i,
				    -1.0F, 1.0F);
	    else
		class433.method6840();
	    aClass433_9274.method6842(class433);
	    method14739(aClass433_9274);
	    aBool9223 = true;
	}
    }
    
    abstract void method14839();
    
    byte[] method14840(String string, String string_521_) {
	return aClass472_9124.method7687(string, string_521_, 424249269);
    }
    
    final void method14841() {
	if (!aBool9222)
	    aBool9222 = true;
    }
    
    final void method14842() {
	aClass433_9202.method6842(aClass433_9228);
	method14739(aClass433_9202);
	aFloat9175 = ((aClass433_9202.aFloatArray4853[14]
		       - aClass433_9202.aFloatArray4853[15])
		      / (aClass433_9202.aFloatArray4853[11]
			 - aClass433_9202.aFloatArray4853[10]));
	aFloat9174 = (-aClass433_9202.aFloatArray4853[14]
		      / aClass433_9202.aFloatArray4853[10]);
	method14754();
    }
    
    final void method14843() {
	aClass433_9202.method6842(aClass433_9228);
	method14739(aClass433_9202);
	aFloat9175 = ((aClass433_9202.aFloatArray4853[14]
		       - aClass433_9202.aFloatArray4853[15])
		      / (aClass433_9202.aFloatArray4853[11]
			 - aClass433_9202.aFloatArray4853[10]));
	aFloat9174 = (-aClass433_9202.aFloatArray4853[14]
		      / aClass433_9202.aFloatArray4853[10]);
	method14754();
    }
    
    final void method14844() {
	aClass433_9202.method6842(aClass433_9228);
	method14739(aClass433_9202);
	aFloat9175 = ((aClass433_9202.aFloatArray4853[14]
		       - aClass433_9202.aFloatArray4853[15])
		      / (aClass433_9202.aFloatArray4853[11]
			 - aClass433_9202.aFloatArray4853[10]));
	aFloat9174 = (-aClass433_9202.aFloatArray4853[14]
		      / aClass433_9202.aFloatArray4853[10]);
	method14754();
    }
    
    static int method14845(char c, char c_522_, char c_523_, char c_524_) {
	return ((c & 0xff) << 0 | (c_522_ & 0xff) << 8 | (c_523_ & 0xff) << 16
		| (c_524_ & 0xff) << 24);
    }
    
    final void method14846() {
	aClass433_9202.method6842(aClass433_9228);
	method14739(aClass433_9202);
	aFloat9175 = ((aClass433_9202.aFloatArray4853[14]
		       - aClass433_9202.aFloatArray4853[15])
		      / (aClass433_9202.aFloatArray4853[11]
			 - aClass433_9202.aFloatArray4853[10]));
	aFloat9174 = (-aClass433_9202.aFloatArray4853[14]
		      / aClass433_9202.aFloatArray4853[10]);
	method14754();
    }
    
    final void method14847(boolean bool) {
	if (bool != aBool9193) {
	    aBool9193 = bool;
	    method14643();
	    anInt9265 &= ~0x1f;
	}
    }
    
    final void method14848(boolean bool) {
	if (bool != aBool9193) {
	    aBool9193 = bool;
	    method14643();
	    anInt9265 &= ~0x1f;
	}
    }
    
    final void method14849(boolean bool) {
	if (bool != aBool9193) {
	    aBool9193 = bool;
	    method14643();
	    anInt9265 &= ~0x1f;
	}
    }
    
    final void method14850(boolean bool) {
	if (bool != aBool9191) {
	    aBool9191 = bool;
	    method14644();
	    anInt9265 &= ~0x1f;
	}
    }
    
    final void method14851(boolean bool) {
	if (bool != aBool9191) {
	    aBool9191 = bool;
	    method14644();
	    anInt9265 &= ~0x1f;
	}
    }
    
    abstract void method14852();
    
    abstract void method14853();
    
    abstract void method14854();
    
    final void method14855(boolean bool) {
	if (bool != aBool9146) {
	    aBool9146 = bool;
	    method14652();
	    anInt9265 &= ~0x7;
	}
    }
    
    public final void method3596(boolean bool) {
	aBool9190 = bool;
	method14644();
    }
    
    final void method14856(boolean bool) {
	if (bool != aBool9146) {
	    aBool9146 = bool;
	    method14652();
	    anInt9265 &= ~0x7;
	}
    }
    
    abstract void method14857();
    
    public void method3438() {
	anInt9180 = 0;
	anInt9256 = 0;
	anInt9207 = aClass175_1989.method2910();
	anInt9183 = aClass175_1989.method2911();
	method14955();
    }
    
    abstract void method14858();
    
    abstract void method14859();
    
    long method14860(ByteBuffer bytebuffer) {
	return DirectBufferHelper.getDirectBufferAddress(bytebuffer);
    }
    
    abstract void method14861();
    
    public final void method3452(int[] is) {
	is[0] = anInt9178;
	is[1] = anInt9176;
	is[2] = anInt9179;
	is[3] = anInt9177;
    }
    
    public final boolean method3436() {
	return true;
    }
    
    abstract void method14862();
    
    abstract void method14863();
    
    Class353 method14864() {
	if (aClass371_9147 == null)
	    return Class353.aClass353_3655;
	return aClass371_9147.method6399();
    }
    
    final void method14865() {
	if (method14585())
	    method14686();
	anInt9209 = anInt9129;
    }
    
    final void method14866() {
	if (method14585())
	    method14686();
	anInt9209 = anInt9129;
    }
    
    public void method3367(float f, float f_525_, float f_526_, float[] fs) {
	float f_527_ = (aClass433_9284.aFloatArray4853[15]
			+ aClass433_9284.aFloatArray4853[3] * f
			+ aClass433_9284.aFloatArray4853[7] * f_525_
			+ aClass433_9284.aFloatArray4853[11] * f_526_);
	float f_528_ = (aClass433_9284.aFloatArray4853[12]
			+ aClass433_9284.aFloatArray4853[0] * f
			+ aClass433_9284.aFloatArray4853[4] * f_525_
			+ aClass433_9284.aFloatArray4853[8] * f_526_);
	float f_529_ = (aClass433_9284.aFloatArray4853[13]
			+ aClass433_9284.aFloatArray4853[1] * f
			+ aClass433_9284.aFloatArray4853[5] * f_525_
			+ aClass433_9284.aFloatArray4853[9] * f_526_);
	float f_530_ = (aClass433_9142.aFloatArray4853[14]
			+ aClass433_9142.aFloatArray4853[2] * f
			+ aClass433_9142.aFloatArray4853[6] * f_525_
			+ aClass433_9142.aFloatArray4853[10] * f_526_);
	fs[0] = aFloat9257 + aFloat9167 * f_528_ / f_527_;
	fs[1] = aFloat9168 + aFloat9169 * f_529_ / f_527_;
	fs[2] = f_530_;
    }
    
    abstract void method14867();
    
    abstract void method14868();
    
    abstract boolean method14869(Class181 class181, Class173 class173);
    
    public abstract void method14870(Class374 class374, int i, int i_531_,
				     int i_532_, int i_533_);
    
    public final void method14871(Class364 class364) {
	aClass364Array9218[anInt9215] = class364;
	method14581();
    }
    
    public final NativeHeapBuffer method14872(int i, boolean bool) {
	return aNativeHeap9133.method1975(i, bool);
    }
    
    final Interface38 method14873(int i, int i_534_, boolean bool, int[] is) {
	return method14772(i, i_534_, bool, is, 0, 0);
    }
    
    final Interface38 method14874(Class181 class181, int i, int i_535_,
				  boolean bool, byte[] is) {
	return method14662(class181, i, i_535_, bool, is, 0, 0);
    }
    
    final Interface38 method14875(Class181 class181, int i, int i_536_,
				  boolean bool, float[] fs) {
	return method14663(class181, i, i_536_, bool, fs, 0, 0);
    }
    
    final void method14876() {
	aClass433_9202.method6842(aClass433_9228);
	method14739(aClass433_9202);
	aFloat9175 = ((aClass433_9202.aFloatArray4853[14]
		       - aClass433_9202.aFloatArray4853[15])
		      / (aClass433_9202.aFloatArray4853[11]
			 - aClass433_9202.aFloatArray4853[10]));
	aFloat9174 = (-aClass433_9202.aFloatArray4853[14]
		      / aClass433_9202.aFloatArray4853[10]);
	method14754();
    }
    
    public abstract Class269 method14877(String string);
    
    public final Class534_Sub2 method3312(int i) {
	Class534_Sub2_Sub1 class534_sub2_sub1 = new Class534_Sub2_Sub1(i);
	aClass700_9155.method14131(class534_sub2_sub1, (short) 789);
	return class534_sub2_sub1;
    }
    
    abstract Interface38 method14878(Class181 class181, Class173 class173,
				     int i, int i_537_);
    
    abstract Interface38 method14879(Class181 class181, int i, int i_538_,
				     boolean bool, byte[] is, int i_539_,
				     int i_540_);
    
    abstract Interface38 method14880(Class181 class181, int i, int i_541_,
				     boolean bool, float[] fs, int i_542_,
				     int i_543_);
    
    void method14881() {
	if (aClass355_9171 != null)
	    aClass355_9171.method6289();
	if (anInterface37_9226 != null)
	    anInterface37_9226.method142();
	if (anInterface37_9279 != null)
	    anInterface37_9279.method142();
	if (anInterface37_9281 != null)
	    anInterface37_9281.method142();
	if (aClass380_9239 != null)
	    aClass380_9239.method6431();
	for (int i = 0; i < 8; i++) {
	    if (aClass183_Sub3Array9290[i] != null)
		aClass183_Sub3Array9290[i].method15518();
	}
	if (aClass359_9192 != null)
	    aClass359_9192.method6317();
	if (anInterface39_9149 != null)
	    anInterface39_9149.method142();
	if (aClass371_9147 != null) {
	    aClass371_9147.method6382();
	    aClass371_9147 = null;
	}
    }
    
    public final boolean method3247() {
	return true;
    }
    
    abstract void method14882(int i);
    
    abstract void method14883();
    
    abstract Interface35 method14884(Class181 class181, int i, int i_544_,
				     int i_545_, boolean bool, byte[] is);
    
    abstract Interface41 method14885(int i, boolean bool, int[][] is);
    
    abstract Interface41 method14886(int i, boolean bool, int[][] is);
    
    final void method14887() {
	if (anInt9265 != 8) {
	    method14728();
	    method14694(true);
	    method14803(true);
	    method14603(true);
	    method14687(1);
	    method14959((byte) 0);
	    anInt9265 = 8;
	}
    }
    
    abstract Interface35 method14888(Class181 class181, int i, int i_546_,
				     int i_547_, boolean bool, byte[] is);
    
    public void method3471(int i, int i_548_, int i_549_, int i_550_,
			   int i_551_, int i_552_, Class145 class145,
			   int i_553_, int i_554_, int i_555_, int i_556_,
			   int i_557_) {
	/* empty */
    }
    
    public final void method14889(int i) {
	if (anInt9215 != i) {
	    anInt9215 = i;
	    method14682();
	}
    }
    
    public final void method3463(int i, int i_558_, int i_559_) {
	if (anInt9251 != i || anInt9252 != i_558_ || anInt9188 != i_559_) {
	    anInt9251 = i;
	    anInt9252 = i_558_;
	    anInt9188 = i_559_;
	    method14754();
	    method14722();
	}
    }
    
    public final void method14890(Interface43 interface43) {
	if (anInterface43Array9220[anInt9215] != interface43) {
	    anInterface43Array9220[anInt9215] = interface43;
	    if (interface43 != null)
		interface43.method333();
	    else
		anInterface38_9204.method333();
	    anInt9265 &= ~0x11;
	}
    }
    
    public abstract void method14891();
    
    public final void method14892(int i) {
	switch (i) {
	case 0:
	    method14672(Class378.aClass378_3916, Class378.aClass378_3916);
	    break;
	case 1:
	    method14672(Class378.aClass378_3920, Class378.aClass378_3920);
	    break;
	case 2:
	    method14672(Class378.aClass378_3919, Class378.aClass378_3920);
	    break;
	case 4:
	    method14672(Class378.aClass378_3915, Class378.aClass378_3915);
	    break;
	case 3:
	    method14672(Class378.aClass378_3917, Class378.aClass378_3916);
	    break;
	}
    }
    
    public final void method14893(int i) {
	switch (i) {
	case 0:
	    method14672(Class378.aClass378_3916, Class378.aClass378_3916);
	    break;
	case 1:
	    method14672(Class378.aClass378_3920, Class378.aClass378_3920);
	    break;
	case 2:
	    method14672(Class378.aClass378_3919, Class378.aClass378_3920);
	    break;
	case 4:
	    method14672(Class378.aClass378_3915, Class378.aClass378_3915);
	    break;
	case 3:
	    method14672(Class378.aClass378_3917, Class378.aClass378_3916);
	    break;
	}
    }
    
    public final int[] method3251() {
	return null;
    }
    
    public abstract void method14894(Class433 class433, Class433 class433_560_,
				     Class433 class433_561_);
    
    public final void method14895(int i, Class373 class373) {
	method14674(i, class373, false, false);
    }
    
    public final void method14896(int i, Class373 class373) {
	method14674(i, class373, false, false);
    }
    
    abstract void method14897(int i, Class373 class373, boolean bool,
			      boolean bool_562_);
    
    abstract void method14898(int i, Class373 class373, boolean bool,
			      boolean bool_563_);
    
    abstract void method14899(int i, Class373 class373, boolean bool,
			      boolean bool_564_);
    
    public final void method14900(int i, Class373 class373) {
	method14801(i, class373, false);
    }
    
    public final void method14901(int i, Class373 class373) {
	method14801(i, class373, false);
    }
    
    public void method14902(int i) {
	if (i != anInt9221) {
	    anInt9221 = i;
	    method14681();
	}
    }
    
    public abstract boolean method14903(boolean bool);
    
    public void method14904(int i) {
	if (i != anInt9221) {
	    anInt9221 = i;
	    method14681();
	}
    }
    
    final Class433 method14905() {
	return aClass433Array9217[anInt9215];
    }
    
    public static void method14906() throws Exception_Sub3 {
	Class112.method2018(-1327590673).method400("jaclib", -796608150);
    }
    
    public final Class433 method14907() {
	return aClass433Array9217[anInt9215];
    }
    
    public final void method14908(Class364 class364) {
	aClass364Array9218[anInt9215] = class364;
	method14581();
    }
    
    final void method14909() {
	if (aClass364Array9218[anInt9215] != Class364.aClass364_3725) {
	    aClass364Array9218[anInt9215] = Class364.aClass364_3725;
	    aClass433Array9217[anInt9215].method6840();
	    method14581();
	}
    }
    
    final void method14910() {
	if (aClass364Array9218[anInt9215] != Class364.aClass364_3725) {
	    aClass364Array9218[anInt9215] = Class364.aClass364_3725;
	    aClass433Array9217[anInt9215].method6840();
	    method14581();
	}
    }
    
    public final Class151 method3509(int i, int i_565_, int[][] is,
				     int[][] is_566_, int i_567_, int i_568_,
				     int i_569_) {
	return new Class151_Sub2(this, i_568_, i_569_, i, i_565_, is, is_566_,
				 i_567_);
    }
    
    final void method14911() {
	method14839();
    }
    
    final void method14912() {
	method14839();
    }
    
    public final void method3447(int i, int i_570_, int i_571_, int i_572_) {
	int i_573_;
	int i_574_;
	if (aClass175_1989 != null) {
	    i_574_ = aClass175_1989.method2910();
	    i_573_ = aClass175_1989.method2911();
	} else {
	    i_573_ = 0;
	    i_574_ = 0;
	}
	if (i <= 0 && i_571_ >= i_574_ - 1 && i_570_ <= 0
	    && i_572_ >= i_573_ - 1)
	    method3537();
	else {
	    anInt9178 = i >= 0 ? i : 0;
	    anInt9179 = i_571_ <= i_574_ ? i_571_ : i_574_;
	    anInt9176 = i_570_ >= 0 ? i_570_ : 0;
	    anInt9177 = i_572_ <= i_573_ ? i_572_ : i_573_;
	    if (!aBool9294
		&& (aBool9289 || method14703() == Class353.aClass353_3655)) {
		aBool9294 = true;
		method14622();
	    }
	    if (aBool9294)
		method14621();
	}
    }
    
    void method14913() {
	method14635();
	method14637();
	method14634();
	method3281();
	method3537();
    }
    
    abstract void method14914();
    
    final Class433 method14915() {
	return aClass433Array9217[anInt9215];
    }
    
    final Interface38 method14916(int i, int i_575_, boolean bool, int[] is) {
	return method14772(i, i_575_, bool, is, 0, 0);
    }
    
    abstract void method14917();
    
    abstract void method14918();
    
    public final void method3483(Class534_Sub2 class534_sub2) {
	aNativeHeap9133
	    = ((Class534_Sub2_Sub1) class534_sub2).aNativeHeap11652;
    }
    
    abstract void method14919();
    
    abstract void method14920();
    
    Class261 method14921(byte[] is) {
	if (is == null)
	    return null;
	Class261 class261;
	try {
	    class261 = new Class261(is);
	} catch (Exception exception) {
	    return null;
	}
	return class261;
    }
    
    Class166 method14922() {
	return aClass166_9280;
    }
    
    Class166 method14923() {
	return aClass166_9280;
    }
    
    Class166 method14924() {
	return aClass166_9280;
    }
    
    final void method14925(int i) {
	if (anInt9238 != i) {
	    anInt9238 = i;
	    method14692();
	}
    }
    
    final boolean method14926() {
	return aBool9125;
    }
    
    final void method14927(byte i) {
	if (aByte9261 != i) {
	    aByte9261 = i;
	    if (i == 0) {
		method14688(0);
		method14687(1);
	    } else {
		method14688(3);
		method14687(3);
	    }
	    method14691();
	}
    }
    
    abstract void method14928();
    
    abstract void method14929();
    
    abstract void method14930();
    
    public void method3318(int i, int i_576_, int i_577_, int i_578_) {
	anInt9180 = i;
	anInt9256 = i_576_;
	anInt9207 = i_577_;
	anInt9183 = i_578_;
	method14955();
    }
    
    public final boolean method3409() {
	return (aClass343Array9253[3] != null
		&& aClass343Array9253[3].method6070());
    }
    
    abstract void method14931();
    
    abstract void method14932();
    
    public final boolean method3393() {
	return aBool9260;
    }
    
    abstract void method14933();
    
    abstract void method14934();
    
    final void method14935() {
	if (!aBool9223) {
	    int i;
	    int i_579_;
	    if (aClass175_1989 != null) {
		i_579_ = aClass175_1989.method2910();
		i = aClass175_1989.method2911();
	    } else {
		i = 0;
		i_579_ = 0;
	    }
	    Class433 class433 = aClass433_9170;
	    if (i_579_ != 0 && i != 0)
		class433.method6853(0.0F, (float) i_579_, 0.0F, (float) i,
				    -1.0F, 1.0F);
	    else
		class433.method6840();
	    aClass433_9274.method6842(class433);
	    method14739(aClass433_9274);
	    aBool9223 = true;
	}
    }
    
    final void method14936() {
	anInterface37_9281 = method14698(false);
	anInterface37_9281.method236(3096, 12);
	aByteBuffer9266.clear();
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	aByteBuffer9266.putFloat(0.0F);
	for (int i = 0; i <= 256; i++) {
	    double d = (double) (i * 2) * 3.141592653589793 / 256.0;
	    float f = (float) Math.cos(d);
	    float f_580_ = (float) Math.sin(d);
	    aByteBuffer9266.putFloat(f_580_);
	    aByteBuffer9266.putFloat(f);
	    aByteBuffer9266.putFloat(0.0F);
	}
	anInterface37_9281.method235(0, aByteBuffer9266.position(), aLong9139);
    }
    
    abstract Interface37 method14937(boolean bool);
    
    abstract Interface37 method14938(boolean bool);
    
    abstract Class349 method14939(Class381[] class381s);
    
    abstract Class349 method14940(Class381[] class381s);
    
    abstract Class349 method14941(Class381[] class381s);
    
    public abstract void method14942(Class349 class349);
    
    public final void method3348(int i, int i_581_, int i_582_, int i_583_,
				 int i_584_, int i_585_, int i_586_) {
	i += 1.0F;
	i_581_ += 1.0F;
	i_582_ += 1.0F;
	i_583_ += 1.0F;
	float f = (float) (i_582_ - i);
	float f_587_ = (float) (i_583_ - i_581_);
	float f_588_
	    = 1.0F / (float) Math.sqrt((double) (f * f + f_587_ * f_587_));
	f *= f_588_;
	f_587_ *= f_588_;
	i -= f;
	i_581_ -= f_587_;
	float f_589_ = -f_587_;
	float f_590_ = f;
	f_589_ *= 0.5F * (float) i_585_;
	f_590_ *= 0.5F * (float) i_585_;
	aClass163_Sub2_9225.method2703((float) i - f_589_,
				       (float) i_581_ - f_590_,
				       (float) i_582_ - f_589_,
				       (float) i_583_ - f_590_,
				       (float) i + f_589_,
				       (float) i_581_ + f_590_, 0, i_584_,
				       i_586_);
    }
    
    void method14943() {
	method14635();
	method14637();
	method14634();
	method3281();
	method3537();
    }
    
    public abstract void method14944(int i, Interface37 interface37);
    
    public abstract void method14945(int i, Interface37 interface37);
    
    abstract void method14946(Interface39 interface39);
    
    final void method14947() {
	method14733(0, anInterface37_9279);
	method14700(aClass349_9282);
	method14708(Class374.aClass374_3901, 0, 1);
    }
    
    public final boolean method3583() {
	return true;
    }
    
    public final void method14948() {
	method14707(Class374.aClass374_3895, 2);
    }
    
    public final void method14949() {
	method14707(Class374.aClass374_3895, 2);
    }
    
    public final void method14950() {
	method14707(Class374.aClass374_3895, 2);
    }
    
    public final void method14951() {
	method14707(Class374.aClass374_3895, 2);
    }
    
    abstract void method14952(Interface39 interface39, Class374 class374,
			      int i, int i_591_, int i_592_, int i_593_);
    
    abstract void method14953(Interface39 interface39, Class374 class374,
			      int i, int i_594_, int i_595_, int i_596_);
    
    public final void method3542() {
	if (aClass343Array9253[3] != null
	    && aClass343Array9253[3].method6070()) {
	    aClass355_9171.method6287(aClass343Array9253[3]);
	    aClass354_9211.method6274();
	}
    }
    
    public final void method14954() {
	if (anInt9265 != 2) {
	    method14593();
	    method14694(false);
	    method14648(false);
	    method14803(false);
	    method14603(false);
	    method14687(1);
	    method14959((byte) 0);
	    anInt9265 = 2;
	}
    }
    
    final void method14955() {
	if (aClass336_9154 == Class336.aClass336_3518) {
	    anInt9184 = anInt9180;
	    anInt9185 = anInt9256;
	    anInt9186 = anInt9207;
	    anInt9210 = anInt9183;
	    aFloat9152 = aFloat9148;
	    aFloat9157 = aFloat9173;
	} else {
	    anInt9184 = 0;
	    anInt9185 = 0;
	    anInt9186 = aClass175_1989.method2910();
	    anInt9210 = aClass175_1989.method2911();
	    aFloat9152 = 0.0F;
	    aFloat9157 = 1.0F;
	}
	method14620();
	aFloat9167 = (float) anInt9207 / 2.0F;
	aFloat9169 = (float) anInt9183 / 2.0F;
	aFloat9257 = (float) anInt9180 + aFloat9167;
	aFloat9168 = (float) anInt9256 + aFloat9169;
    }
    
    final void method14956() {
	if (anInt9265 != 8) {
	    method14728();
	    method14694(true);
	    method14803(true);
	    method14603(true);
	    method14687(1);
	    method14959((byte) 0);
	    anInt9265 = 8;
	}
    }
    
    final void method14957() {
	if (anInt9265 != 8) {
	    method14728();
	    method14694(true);
	    method14803(true);
	    method14603(true);
	    method14687(1);
	    method14959((byte) 0);
	    anInt9265 = 8;
	}
    }
    
    final void method14958() {
	if (anInt9265 != 8) {
	    method14728();
	    method14694(true);
	    method14803(true);
	    method14603(true);
	    method14687(1);
	    method14959((byte) 0);
	    anInt9265 = 8;
	}
    }
    
    final void method14959(byte i) {
	if (aByte9261 != i) {
	    aByte9261 = i;
	    if (i == 0) {
		method14688(0);
		method14687(1);
	    } else {
		method14688(3);
		method14687(3);
	    }
	    method14691();
	}
    }
    
    abstract void method14960(int i);
    
    abstract void method14961(int i);
    
    static int method14962(char c, char c_597_, char c_598_, char c_599_) {
	return ((c & 0xff) << 0 | (c_597_ & 0xff) << 8 | (c_598_ & 0xff) << 16
		| (c_599_ & 0xff) << 24);
    }
    
    abstract Interface35 method14963(Class181 class181, int i, int i_600_,
				     int i_601_, boolean bool, byte[] is);
    
    public final int method3239() {
	return anInt9136 + anInt9135 + anInt9137;
    }
    
    static int method14964(char c, char c_602_, char c_603_, char c_604_) {
	return ((c & 0xff) << 0 | (c_602_ & 0xff) << 8 | (c_603_ & 0xff) << 16
		| (c_604_ & 0xff) << 24);
    }
    
    public final void method3347(int i, float f, float f_605_, float f_606_,
				 float f_607_, float f_608_) {
	boolean bool = anInt9201 != i;
	f *= 0.5F;
	f_605_ *= 0.5F;
	if (bool || aFloat9206 != f || aFloat9267 != f_605_) {
	    anInt9201 = i;
	    aFloat9206 = f;
	    aFloat9267 = f_605_;
	    if (bool) {
		aFloat9159 = (float) (anInt9201 & 0xff0000) / 1.671168E7F;
		aFloat9292 = (float) (anInt9201 & 0xff00) / 65280.0F;
		aFloat9163 = (float) (anInt9201 & 0xff) / 255.0F;
		method14724();
	    }
	    method14654();
	}
	if (aFloatArray9199[0] != f_606_ || aFloatArray9199[1] != f_607_
	    || aFloatArray9199[2] != f_608_) {
	    aFloatArray9199[0] = f_606_;
	    aFloatArray9199[1] = f_607_;
	    aFloatArray9199[2] = f_608_;
	    aFloatArray9200[0] = -f_606_;
	    aFloatArray9200[1] = -f_607_;
	    aFloatArray9200[2] = -f_608_;
	    float f_609_
		= (float) (1.0 / Math.sqrt((double) (f_606_ * f_606_
						     + f_607_ * f_607_
						     + f_608_ * f_608_)));
	    aFloatArray9197[0] = f_606_ * f_609_;
	    aFloatArray9197[1] = f_607_ * f_609_;
	    aFloatArray9197[2] = f_608_ * f_609_;
	    aFloatArray9198[0] = -aFloatArray9197[0];
	    aFloatArray9198[1] = -aFloatArray9197[1];
	    aFloatArray9198[2] = -aFloatArray9197[2];
	    method14763();
	    anInt9213 = (int) (f_606_ * 256.0F / f_607_);
	    anInt9287 = (int) (f_608_ * 256.0F / f_607_);
	}
	method14783();
    }
    
    static int method14965(char c, char c_610_, char c_611_, char c_612_) {
	return ((c & 0xff) << 0 | (c_610_ & 0xff) << 8 | (c_611_ & 0xff) << 16
		| (c_612_ & 0xff) << 24);
    }
    
    abstract void method14966();
    
    abstract Interface44 method14967(Class181 class181, Class173 class173,
				     int i, int i_613_);
    
    abstract Interface44 method14968(Class181 class181, Class173 class173,
				     int i, int i_614_);
    
    abstract void method14969();
    
    abstract void method14970();
    
    public final Class171 method3325(Class16 class16, Class169[] class169s,
				     boolean bool) {
	return new Class171_Sub2(this, class16, class169s, bool);
    }
    
    abstract Interface39 method14971(boolean bool);
    
    public abstract void method14972(Class374 class374, int i, int i_615_);
    
    public final void method3341(int i, float f, float f_616_, float f_617_,
				 float f_618_, float f_619_) {
	boolean bool = anInt9201 != i;
	f *= 0.5F;
	f_616_ *= 0.5F;
	if (bool || aFloat9206 != f || aFloat9267 != f_616_) {
	    anInt9201 = i;
	    aFloat9206 = f;
	    aFloat9267 = f_616_;
	    if (bool) {
		aFloat9159 = (float) (anInt9201 & 0xff0000) / 1.671168E7F;
		aFloat9292 = (float) (anInt9201 & 0xff00) / 65280.0F;
		aFloat9163 = (float) (anInt9201 & 0xff) / 255.0F;
		method14724();
	    }
	    method14654();
	}
	if (aFloatArray9199[0] != f_617_ || aFloatArray9199[1] != f_618_
	    || aFloatArray9199[2] != f_619_) {
	    aFloatArray9199[0] = f_617_;
	    aFloatArray9199[1] = f_618_;
	    aFloatArray9199[2] = f_619_;
	    aFloatArray9200[0] = -f_617_;
	    aFloatArray9200[1] = -f_618_;
	    aFloatArray9200[2] = -f_619_;
	    float f_620_
		= (float) (1.0 / Math.sqrt((double) (f_617_ * f_617_
						     + f_618_ * f_618_
						     + f_619_ * f_619_)));
	    aFloatArray9197[0] = f_617_ * f_620_;
	    aFloatArray9197[1] = f_618_ * f_620_;
	    aFloatArray9197[2] = f_619_ * f_620_;
	    aFloatArray9198[0] = -aFloatArray9197[0];
	    aFloatArray9198[1] = -aFloatArray9197[1];
	    aFloatArray9198[2] = -aFloatArray9197[2];
	    method14763();
	    anInt9213 = (int) (f_617_ * 256.0F / f_618_);
	    anInt9287 = (int) (f_619_ * 256.0F / f_618_);
	}
	method14783();
    }
    
    public abstract void method14973(Class433 class433);
    
    abstract void method14974(int i, Class373 class373, boolean bool);
    
    public final void method3674(int i, int i_621_) {
	if (aClass355_9171 != null)
	    aClass355_9171.method6300(i, i_621_);
    }
}
