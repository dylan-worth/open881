/* Class269 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import com.jagex.twitchtv.TwitchEvent;

public abstract class Class269
{
    Class265 aClass265_2948;
    Class278[] aClass278Array2949;
    int anInt2950;
    String aString2951;
    int anInt2952;
    protected int anInt2953 = 1164303385;
    Class265 aClass265_2954;
    static Interface29 anInterface29_2955 = new Class286();
    public static Class396 aClass396_2956;
    
    public final void method4908(Class534_Sub12_Sub1 class534_sub12_sub1,
				 float[] fs) {
	aClass278Array2949[anInt2953 * 567951319]
	    .method5201(class534_sub12_sub1, fs, fs.length);
    }
    
    public Class534_Sub12_Sub1 method4909(String string, int i)
	throws Exception_Sub4_Sub1 {
	Class534_Sub12_Sub1 class534_sub12_sub1
	    = ((Class534_Sub12_Sub1)
	       aClass265_2954.method4845(string, 1119137899));
	if (class534_sub12_sub1 == null)
	    throw new Exception_Sub4_Sub1(string);
	return class534_sub12_sub1;
    }
    
    public abstract void method4910();
    
    public abstract boolean method4911();
    
    public String method4912(byte i) {
	return aString2951;
    }
    
    public abstract void method4913();
    
    public Class278 method4914(String string, int i)
	throws Exception_Sub4_Sub2 {
	Class278[] class278s = aClass278Array2949;
	for (int i_0_ = 0; i_0_ < class278s.length; i_0_++) {
	    Class278 class278 = class278s[i_0_];
	    String string_1_ = class278.method5167((byte) 40);
	    if (null != string_1_ && string_1_.equals(string)) {
		if (!class278.method5182())
		    throw new Exception_Sub4_Sub2(string);
		return class278;
	    }
	}
	throw new Exception_Sub4_Sub2(string);
    }
    
    abstract Class534_Sub12_Sub1 method4915(Class266 class266);
    
    public final Class278 method4916(int i, int i_2_) {
	return aClass278Array2949[i];
    }
    
    public int method4917(Class278 class278, byte i) {
	for (int i_3_ = 0; i_3_ < aClass278Array2949.length; i_3_++) {
	    if (aClass278Array2949[i_3_] == class278)
		return i_3_;
	}
	return -1;
    }
    
    public Class278 method4918(int i) {
	Class278[] class278s = aClass278Array2949;
	for (int i_4_ = 0; i_4_ < class278s.length; i_4_++) {
	    Class278 class278 = class278s[i_4_];
	    if (class278.method5182())
		return class278;
	}
	return null;
    }
    
    public abstract boolean method4919(Class278 class278);
    
    public final Class278 method4920(int i) {
	return (567951319 * anInt2953 >= 0
		? aClass278Array2949[anInt2953 * 567951319] : null);
    }
    
    public final int method4921(int i) {
	return 567951319 * anInt2953;
    }
    
    abstract Class534_Sub12_Sub1 method4922(Class266 class266);
    
    public final void method4923(Class534_Sub12_Sub1 class534_sub12_sub1,
				 float f, byte i) {
	aClass278Array2949[anInt2953 * 567951319]
	    .method5169(class534_sub12_sub1, f);
    }
    
    public final void method4924(Class534_Sub12_Sub1 class534_sub12_sub1,
				 Class433 class433) {
	aClass278Array2949[anInt2953 * 567951319]
	    .method5174(class534_sub12_sub1, class433);
    }
    
    public final void method4925(Class534_Sub12_Sub1 class534_sub12_sub1,
				 float f, float f_5_, float f_6_, int i) {
	aClass278Array2949[anInt2953 * 567951319]
	    .method5171(class534_sub12_sub1, f, f_5_, f_6_);
    }
    
    public final void method4926(Class534_Sub12_Sub1 class534_sub12_sub1,
				 float f, float f_7_, float f_8_, float f_9_,
				 int i) {
	aClass278Array2949[anInt2953 * 567951319]
	    .method5172(class534_sub12_sub1, f, f_7_, f_8_, f_9_);
    }
    
    public final void method4927(Class534_Sub12_Sub1 class534_sub12_sub1,
				 Class438 class438, int i) {
	aClass278Array2949[567951319 * anInt2953].method5171
	    (class534_sub12_sub1, class438.aFloat4864, class438.aFloat4863,
	     class438.aFloat4865);
    }
    
    public final void method4928(int i, int i_10_, Interface43 interface43,
				 int i_11_) {
	aClass278Array2949[567951319 * anInt2953].method5183(i, i_10_,
							     interface43);
    }
    
    public final void method4929(Class534_Sub12_Sub1 class534_sub12_sub1,
				 float[] fs, int i) {
	aClass278Array2949[anInt2953 * 567951319]
	    .method5201(class534_sub12_sub1, fs, fs.length);
    }
    
    public final void method4930(Class534_Sub12_Sub1 class534_sub12_sub1,
				 int i, int i_12_) {
	float f = (float) (i >> 16 & 0xff) / 255.0F;
	float f_13_ = (float) (i >> 8 & 0xff) / 255.0F;
	float f_14_ = (float) (i & 0xff) / 255.0F;
	float f_15_ = (float) (i >> 24 & 0xff) / 255.0F;
	method4926(class534_sub12_sub1, f, f_13_, f_14_, f_15_, -353875420);
    }
    
    public final void method4931(Class534_Sub12_Sub1 class534_sub12_sub1,
				 Class433 class433, int i) {
	aClass278Array2949[anInt2953 * 567951319]
	    .method5174(class534_sub12_sub1, class433);
    }
    
    public final void method4932(Class534_Sub12_Sub1 class534_sub12_sub1,
				 Class433 class433, int i) {
	aClass278Array2949[567951319 * anInt2953]
	    .method5175(class534_sub12_sub1, class433);
    }
    
    public final void method4933(Class534_Sub12_Sub1 class534_sub12_sub1,
				 int i, Interface43 interface43, int i_16_) {
	aClass278Array2949[567951319 * anInt2953]
	    .method5176(class534_sub12_sub1, i, interface43);
    }
    
    public final void method4934(int i, float f, float f_17_, float f_18_,
				 byte i_19_) {
	aClass278Array2949[567951319 * anInt2953].method5177(i, f, f_17_,
							     f_18_);
    }
    
    public final void method4935(int i, Class433 class433) {
	aClass278Array2949[anInt2953 * 567951319].method5184(i, class433);
    }
    
    public final void method4936(Class534_Sub12_Sub1 class534_sub12_sub1,
				 float[] fs) {
	aClass278Array2949[anInt2953 * 567951319]
	    .method5201(class534_sub12_sub1, fs, fs.length);
    }
    
    public final void method4937(Class534_Sub12_Sub1 class534_sub12_sub1,
				 Class441 class441, int i) {
	aClass278Array2949[anInt2953 * 567951319].method5172
	    (class534_sub12_sub1, class441.aFloat4873, class441.aFloat4874,
	     class441.aFloat4876, class441.aFloat4875);
    }
    
    public final void method4938(int i, Class433 class433, short i_20_) {
	aClass278Array2949[anInt2953 * 567951319].method5180(i, class433);
    }
    
    public final void method4939(int i, Class433 class433, int i_21_) {
	aClass278Array2949[anInt2953 * 567951319].method5181(i, class433);
    }
    
    public final void method4940(int i, Class433 class433, byte i_22_) {
	aClass278Array2949[anInt2953 * 567951319].method5184(i, class433);
    }
    
    public final Class278 method4941(int i) {
	return aClass278Array2949[i];
    }
    
    public final void method4942(int i, float[] fs, int i_23_, int i_24_) {
	aClass278Array2949[anInt2953 * 567951319].method5194(i, fs, i_23_);
    }
    
    public int method4943(byte i) {
	return 1613592565 * anInt2950;
    }
    
    public Class534_Sub12_Sub1 method4944(int i, int i_25_) {
	return (Class534_Sub12_Sub1) aClass265_2948.method4844(i, -58337726);
    }
    
    public final void method4945(Class534_Sub12_Sub1 class534_sub12_sub1,
				 float f, float f_26_) {
	aClass278Array2949[567951319 * anInt2953]
	    .method5212(class534_sub12_sub1, f, f_26_);
    }
    
    public int method4946(byte i) {
	return -379370331 * anInt2952;
    }
    
    public Class534_Sub12_Sub1 method4947(int i, int i_27_) {
	return (Class534_Sub12_Sub1) aClass265_2954.method4844(i, -58337726);
    }
    
    void method4948() {
	/* empty */
    }
    
    public final void method4949(Class534_Sub12_Sub1 class534_sub12_sub1,
				 Class438 class438) {
	aClass278Array2949[567951319 * anInt2953].method5171
	    (class534_sub12_sub1, class438.aFloat4864, class438.aFloat4863,
	     class438.aFloat4865);
    }
    
    public abstract void method4950();
    
    public final int method4951() {
	return 567951319 * anInt2953;
    }
    
    public final void method4952(Class534_Sub12_Sub1 class534_sub12_sub1,
				 float f) {
	aClass278Array2949[anInt2953 * 567951319]
	    .method5169(class534_sub12_sub1, f);
    }
    
    public abstract boolean method4953();
    
    public String method4954() {
	return aString2951;
    }
    
    public abstract void method4955();
    
    abstract Class278 method4956(Class185_Sub1 class185_sub1,
				 Class277 class277);
    
    abstract Class278 method4957(Class185_Sub1 class185_sub1,
				 Class277 class277);
    
    abstract Class278 method4958(Class185_Sub1 class185_sub1,
				 Class277 class277);
    
    abstract Class278 method4959(Class185_Sub1 class185_sub1,
				 Class277 class277);
    
    abstract Class278 method4960(Class185_Sub1 class185_sub1,
				 Class277 class277);
    
    public Class278 method4961(String string) throws Exception_Sub4_Sub2 {
	Class278[] class278s = aClass278Array2949;
	for (int i = 0; i < class278s.length; i++) {
	    Class278 class278 = class278s[i];
	    String string_28_ = class278.method5167((byte) 40);
	    if (null != string_28_ && string_28_.equals(string)) {
		if (!class278.method5182())
		    throw new Exception_Sub4_Sub2(string);
		return class278;
	    }
	}
	throw new Exception_Sub4_Sub2(string);
    }
    
    public abstract void method4962();
    
    public final void method4963(Class534_Sub12_Sub1 class534_sub12_sub1,
				 Class441 class441) {
	aClass278Array2949[anInt2953 * 567951319].method5172
	    (class534_sub12_sub1, class441.aFloat4873, class441.aFloat4874,
	     class441.aFloat4876, class441.aFloat4875);
    }
    
    public Class278 method4964() {
	Class278[] class278s = aClass278Array2949;
	for (int i = 0; i < class278s.length; i++) {
	    Class278 class278 = class278s[i];
	    if (class278.method5182())
		return class278;
	}
	return null;
    }
    
    public Class278 method4965() {
	Class278[] class278s = aClass278Array2949;
	for (int i = 0; i < class278s.length; i++) {
	    Class278 class278 = class278s[i];
	    if (class278.method5182())
		return class278;
	}
	return null;
    }
    
    public Class278 method4966() {
	Class278[] class278s = aClass278Array2949;
	for (int i = 0; i < class278s.length; i++) {
	    Class278 class278 = class278s[i];
	    if (class278.method5182())
		return class278;
	}
	return null;
    }
    
    public abstract boolean method4967(Class278 class278);
    
    public abstract boolean method4968(Class278 class278);
    
    public abstract boolean method4969(Class278 class278);
    
    public abstract boolean method4970(Class278 class278);
    
    public final int method4971() {
	return 567951319 * anInt2953;
    }
    
    public abstract void method4972();
    
    public final void method4973(int i, Class433 class433) {
	aClass278Array2949[anInt2953 * 567951319].method5181(i, class433);
    }
    
    public final void method4974(Class534_Sub12_Sub1 class534_sub12_sub1,
				 float f, float f_29_, int i) {
	aClass278Array2949[567951319 * anInt2953]
	    .method5212(class534_sub12_sub1, f, f_29_);
    }
    
    public Class534_Sub12_Sub1 method4975(String string, int i) {
	return ((Class534_Sub12_Sub1)
		aClass265_2948.method4845(string, 1069494588));
    }
    
    public final void method4976(Class534_Sub12_Sub1 class534_sub12_sub1,
				 float f, float f_30_) {
	aClass278Array2949[567951319 * anInt2953]
	    .method5212(class534_sub12_sub1, f, f_30_);
    }
    
    Class269(Class185_Sub1 class185_sub1, Class261 class261) {
	aString2951 = class261.aString2790;
	anInt2952 = -1047330003 * class261.aClass266Array2793.length;
	aClass265_2954
	    = new Class265(-379370331 * anInt2952, anInterface29_2955);
	for (int i = 0; i < -379370331 * anInt2952; i++)
	    aClass265_2954.method4847
		(i, class261.aClass266Array2793[i].aString2939,
		 method4922(class261.aClass266Array2793[i]), -2105386331);
	anInt2950 = -1792656291 * class261.aClass266Array2794.length;
	aClass265_2948
	    = new Class265(1613592565 * anInt2950, anInterface29_2955);
	for (int i = 0; i < 1613592565 * anInt2950; i++)
	    aClass265_2948.method4847
		(i, class261.aClass266Array2794[i].aString2939,
		 method4922(class261.aClass266Array2794[i]), -2105386331);
	aClass278Array2949 = new Class278[class261.aClass277Array2795.length];
	for (int i = 0; i < class261.aClass277Array2795.length; i++)
	    aClass278Array2949[i]
		= method5012(class185_sub1, class261.aClass277Array2795[i]);
    }
    
    public final void method4977(Class534_Sub12_Sub1 class534_sub12_sub1,
				 float f, float f_31_, float f_32_) {
	aClass278Array2949[anInt2953 * 567951319]
	    .method5171(class534_sub12_sub1, f, f_31_, f_32_);
    }
    
    public final void method4978(Class534_Sub12_Sub1 class534_sub12_sub1,
				 float f, float f_33_, float f_34_) {
	aClass278Array2949[anInt2953 * 567951319]
	    .method5171(class534_sub12_sub1, f, f_33_, f_34_);
    }
    
    public final void method4979(Class534_Sub12_Sub1 class534_sub12_sub1,
				 float f, float f_35_, float f_36_,
				 float f_37_) {
	aClass278Array2949[anInt2953 * 567951319]
	    .method5172(class534_sub12_sub1, f, f_35_, f_36_, f_37_);
    }
    
    public Class534_Sub12_Sub1 method4980(int i) {
	return (Class534_Sub12_Sub1) aClass265_2954.method4844(i, -58337726);
    }
    
    public final void method4981(int i, Class438 class438, int i_38_) {
	aClass278Array2949[567951319 * anInt2953].method5177
	    (i, class438.aFloat4864, class438.aFloat4863, class438.aFloat4865);
    }
    
    public final void method4982(Class534_Sub12_Sub1 class534_sub12_sub1,
				 float[] fs) {
	aClass278Array2949[anInt2953 * 567951319]
	    .method5201(class534_sub12_sub1, fs, fs.length);
    }
    
    public final void method4983(Class534_Sub12_Sub1 class534_sub12_sub1,
				 float f) {
	aClass278Array2949[anInt2953 * 567951319]
	    .method5169(class534_sub12_sub1, f);
    }
    
    public final int method4984(byte i) {
	return aClass278Array2949.length;
    }
    
    public final void method4985(int i, Class438 class438) {
	aClass278Array2949[567951319 * anInt2953].method5177
	    (i, class438.aFloat4864, class438.aFloat4863, class438.aFloat4865);
    }
    
    public final void method4986(Class534_Sub12_Sub1 class534_sub12_sub1,
				 int i) {
	float f = (float) (i >> 16 & 0xff) / 255.0F;
	float f_39_ = (float) (i >> 8 & 0xff) / 255.0F;
	float f_40_ = (float) (i & 0xff) / 255.0F;
	float f_41_ = (float) (i >> 24 & 0xff) / 255.0F;
	method4926(class534_sub12_sub1, f, f_39_, f_40_, f_41_, 116162602);
    }
    
    public final void method4987(Class534_Sub12_Sub1 class534_sub12_sub1,
				 Class433 class433) {
	aClass278Array2949[567951319 * anInt2953]
	    .method5175(class534_sub12_sub1, class433);
    }
    
    public String method4988() {
	return aString2951;
    }
    
    public final void method4989(Class534_Sub12_Sub1 class534_sub12_sub1,
				 Class433 class433) {
	aClass278Array2949[anInt2953 * 567951319]
	    .method5174(class534_sub12_sub1, class433);
    }
    
    public final void method4990(int i, Class433 class433) {
	aClass278Array2949[anInt2953 * 567951319].method5184(i, class433);
    }
    
    public final void method4991(Class534_Sub12_Sub1 class534_sub12_sub1,
				 Class433 class433) {
	aClass278Array2949[567951319 * anInt2953]
	    .method5175(class534_sub12_sub1, class433);
    }
    
    public final void method4992(int i, float f, float f_42_, float f_43_) {
	aClass278Array2949[567951319 * anInt2953].method5177(i, f, f_42_,
							     f_43_);
    }
    
    public final void method4993(int i, float f, float f_44_, float f_45_) {
	aClass278Array2949[567951319 * anInt2953].method5177(i, f, f_44_,
							     f_45_);
    }
    
    public final void method4994(int i, Class433 class433) {
	aClass278Array2949[anInt2953 * 567951319].method5184(i, class433);
    }
    
    public final void method4995(int i, Class433 class433) {
	aClass278Array2949[anInt2953 * 567951319].method5180(i, class433);
    }
    
    public final void method4996(Class534_Sub12_Sub1 class534_sub12_sub1,
				 int i) {
	float f = (float) (i >> 16 & 0xff) / 255.0F;
	float f_46_ = (float) (i >> 8 & 0xff) / 255.0F;
	float f_47_ = (float) (i & 0xff) / 255.0F;
	float f_48_ = (float) (i >> 24 & 0xff) / 255.0F;
	method4926(class534_sub12_sub1, f, f_46_, f_47_, f_48_, -19953651);
    }
    
    public int method4997(Class278 class278) {
	for (int i = 0; i < aClass278Array2949.length; i++) {
	    if (aClass278Array2949[i] == class278)
		return i;
	}
	return -1;
    }
    
    public final void method4998(int i, Class433 class433) {
	aClass278Array2949[anInt2953 * 567951319].method5184(i, class433);
    }
    
    public final void method4999(int i, Class433 class433) {
	aClass278Array2949[anInt2953 * 567951319].method5184(i, class433);
    }
    
    public Class534_Sub12_Sub1 method5000(String string)
	throws Exception_Sub4_Sub1 {
	Class534_Sub12_Sub1 class534_sub12_sub1
	    = ((Class534_Sub12_Sub1)
	       aClass265_2954.method4845(string, 1429676392));
	if (class534_sub12_sub1 == null)
	    throw new Exception_Sub4_Sub1(string);
	return class534_sub12_sub1;
    }
    
    public abstract void method5001();
    
    public final void method5002(int i, float f, float f_49_, float f_50_,
				 float f_51_, short i_52_) {
	aClass278Array2949[anInt2953 * 567951319].method5178(i, f, f_49_,
							     f_50_, f_51_);
    }
    
    public final void method5003(int i, int i_53_, Interface43 interface43) {
	aClass278Array2949[567951319 * anInt2953].method5183(i, i_53_,
							     interface43);
    }
    
    public abstract boolean method5004();
    
    public int method5005() {
	return 1613592565 * anInt2950;
    }
    
    public Class534_Sub12_Sub1 method5006(int i) {
	return (Class534_Sub12_Sub1) aClass265_2948.method4844(i, -58337726);
    }
    
    public Class534_Sub12_Sub1 method5007(int i) {
	return (Class534_Sub12_Sub1) aClass265_2948.method4844(i, -58337726);
    }
    
    public Class534_Sub12_Sub1 method5008(String string) {
	return ((Class534_Sub12_Sub1)
		aClass265_2948.method4845(string, 1458918889));
    }
    
    public Class534_Sub12_Sub1 method5009(String string) {
	return ((Class534_Sub12_Sub1)
		aClass265_2948.method4845(string, 1029877238));
    }
    
    public int method5010() {
	return -379370331 * anInt2952;
    }
    
    public Class534_Sub12_Sub1 method5011(int i) {
	return (Class534_Sub12_Sub1) aClass265_2954.method4844(i, -58337726);
    }
    
    abstract Class278 method5012(Class185_Sub1 class185_sub1,
				 Class277 class277);
    
    void method5013() {
	/* empty */
    }
    
    public final void method5014(Class534_Sub12_Sub1 class534_sub12_sub1,
				 Class433 class433) {
	aClass278Array2949[anInt2953 * 567951319]
	    .method5174(class534_sub12_sub1, class433);
    }
    
    public abstract void method5015();
    
    public abstract void method5016();
    
    public abstract void method5017();
    
    public abstract void method5018();
    
    public final void method5019(int i, Class433 class433) {
	aClass278Array2949[anInt2953 * 567951319].method5180(i, class433);
    }
    
    static void method5020(int i) {
	Class51.aClass298_Sub1_412 = null;
	Class51.aBool414 = false;
    }
    
    static final void method5021(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = -506156481 * Class578.anInt7742 & 0x1;
    }
    
    public static void method5022(int i, TwitchEvent twitchevent, byte i_54_) {
	Class534_Sub18_Sub8 class534_sub18_sub8
	    = Class429.method6804(Class583.aClass583_7791, i, -1,
				  (short) -2389);
	if (class534_sub18_sub8 != null) {
	    Class669 class669 = Class567.method9559((byte) 25);
	    if (class534_sub18_sub8.anInt11757 * -2103375343 != 0)
		class669.aLongArray8586
		    = new long[-2103375343 * class534_sub18_sub8.anInt11757];
	    if (0 != -39710947 * class534_sub18_sub8.anInt11754)
		class669.anIntArray8605
		    = new int[-39710947 * class534_sub18_sub8.anInt11754];
	    if (class534_sub18_sub8.anInt11755 * 1127446605 != 0)
		class669.anObjectArray8611
		    = new String[1127446605 * class534_sub18_sub8.anInt11755];
	    twitchevent.method6699(class669.anIntArray8605,
				   class669.aLongArray8586,
				   class669.anObjectArray8611);
	    Class292.method5307(class534_sub18_sub8, 500000, class669,
				1519131456);
	}
    }
    
    static Class534_Sub5 method5023(int i, boolean bool, byte i_55_) {
	long l = (long) (i | (bool ? -2147483648 : 0));
	return (Class534_Sub5) Class534_Sub5.aClass9_10411.method579(l);
    }
}
