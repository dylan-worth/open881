/* Class270 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class270
{
    static final int anInt2957 = 100;
    Class534_Sub18_Sub14[] aClass534_Sub18_Sub14Array2958
	= new Class534_Sub18_Sub14[100];
    int anInt2959;
    
    Class534_Sub18_Sub14 method5024(int i) {
	if (i < 0 || i >= anInt2959 * 1024413145)
	    return null;
	return aClass534_Sub18_Sub14Array2958[i];
    }
    
    Class534_Sub18_Sub14 method5025(int i, int i_0_, String string,
				    String string_1_, String string_2_,
				    String string_3_, String string_4_,
				    int i_5_, Class407 class407, byte i_6_) {
	Class534_Sub18_Sub14 class534_sub18_sub14
	    = aClass534_Sub18_Sub14Array2958[99];
	for (int i_7_ = 1024413145 * anInt2959; i_7_ > 0; i_7_--) {
	    if (i_7_ != 100)
		aClass534_Sub18_Sub14Array2958[i_7_]
		    = aClass534_Sub18_Sub14Array2958[i_7_ - 1];
	}
	if (class534_sub18_sub14 == null)
	    class534_sub18_sub14
		= new Class534_Sub18_Sub14(i, i_0_, string, string_1_,
					   string_2_, string_4_, i_5_,
					   string_3_, class407);
	else {
	    class534_sub18_sub14.method8892((byte) 1);
	    class534_sub18_sub14.method16180(-421776830);
	    class534_sub18_sub14.method18393(i, i_0_, string, string_1_,
					     string_2_, string_4_, i_5_,
					     string_3_, class407, -1204799922);
	}
	aClass534_Sub18_Sub14Array2958[0] = class534_sub18_sub14;
	if (anInt2959 * 1024413145 < 100)
	    anInt2959 += -1865653655;
	return class534_sub18_sub14;
    }
    
    Class270() {
	/* empty */
    }
    
    int method5026(int i) {
	return anInt2959 * 1024413145;
    }
    
    Class534_Sub18_Sub14 method5027
	(int i, int i_8_, String string, String string_9_, String string_10_,
	 String string_11_, String string_12_, int i_13_, Class407 class407) {
	Class534_Sub18_Sub14 class534_sub18_sub14
	    = aClass534_Sub18_Sub14Array2958[99];
	for (int i_14_ = 1024413145 * anInt2959; i_14_ > 0; i_14_--) {
	    if (i_14_ != 100)
		aClass534_Sub18_Sub14Array2958[i_14_]
		    = aClass534_Sub18_Sub14Array2958[i_14_ - 1];
	}
	if (class534_sub18_sub14 == null)
	    class534_sub18_sub14
		= new Class534_Sub18_Sub14(i, i_8_, string, string_9_,
					   string_10_, string_12_, i_13_,
					   string_11_, class407);
	else {
	    class534_sub18_sub14.method8892((byte) 1);
	    class534_sub18_sub14.method16180(-421776830);
	    class534_sub18_sub14.method18393(i, i_8_, string, string_9_,
					     string_10_, string_12_, i_13_,
					     string_11_, class407,
					     -2101422031);
	}
	aClass534_Sub18_Sub14Array2958[0] = class534_sub18_sub14;
	if (anInt2959 * 1024413145 < 100)
	    anInt2959 += -1865653655;
	return class534_sub18_sub14;
    }
    
    Class534_Sub18_Sub14 method5028
	(int i, int i_15_, String string, String string_16_, String string_17_,
	 String string_18_, String string_19_, int i_20_, Class407 class407) {
	Class534_Sub18_Sub14 class534_sub18_sub14
	    = aClass534_Sub18_Sub14Array2958[99];
	for (int i_21_ = 1024413145 * anInt2959; i_21_ > 0; i_21_--) {
	    if (i_21_ != 100)
		aClass534_Sub18_Sub14Array2958[i_21_]
		    = aClass534_Sub18_Sub14Array2958[i_21_ - 1];
	}
	if (class534_sub18_sub14 == null)
	    class534_sub18_sub14
		= new Class534_Sub18_Sub14(i, i_15_, string, string_16_,
					   string_17_, string_19_, i_20_,
					   string_18_, class407);
	else {
	    class534_sub18_sub14.method8892((byte) 1);
	    class534_sub18_sub14.method16180(-421776830);
	    class534_sub18_sub14.method18393(i, i_15_, string, string_16_,
					     string_17_, string_19_, i_20_,
					     string_18_, class407, -219920248);
	}
	aClass534_Sub18_Sub14Array2958[0] = class534_sub18_sub14;
	if (anInt2959 * 1024413145 < 100)
	    anInt2959 += -1865653655;
	return class534_sub18_sub14;
    }
    
    Class534_Sub18_Sub14 method5029(int i, int i_22_) {
	if (i < 0 || i >= anInt2959 * 1024413145)
	    return null;
	return aClass534_Sub18_Sub14Array2958[i];
    }
    
    Class534_Sub18_Sub14 method5030(int i) {
	if (i < 0 || i >= anInt2959 * 1024413145)
	    return null;
	return aClass534_Sub18_Sub14Array2958[i];
    }
    
    Class534_Sub18_Sub14 method5031(int i) {
	if (i < 0 || i >= anInt2959 * 1024413145)
	    return null;
	return aClass534_Sub18_Sub14Array2958[i];
    }
    
    int method5032() {
	return anInt2959 * 1024413145;
    }
    
    int method5033() {
	return anInt2959 * 1024413145;
    }
    
    static final void method5034(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class690_Sub25.method17111(class247, class243, class669, -511384021);
    }
    
    static int method5035(Class606_Sub1 class606_sub1,
			  Class606_Sub1 class606_sub1_23_, int i, boolean bool,
			  int i_24_) {
	if (i == 1) {
	    int i_25_ = class606_sub1.anInt7981 * 2098404975;
	    int i_26_ = 2098404975 * class606_sub1_23_.anInt7981;
	    if (!bool) {
		if (-1 == i_25_)
		    i_25_ = 2001;
		if (i_26_ == -1)
		    i_26_ = 2001;
	    }
	    return i_25_ - i_26_;
	}
	if (2 == i)
	    return Class310.method5664(class606_sub1.method16906(1424660300),
				       class606_sub1_23_
					   .method16906(-229735086),
				       Class539.aClass672_7171, -1142340484);
	if (3 == i) {
	    if (class606_sub1.aString10858.equals("-")) {
		if (class606_sub1_23_.aString10858.equals("-"))
		    return 0;
		return bool ? -1 : 1;
	    }
	    if (class606_sub1_23_.aString10858.equals("-"))
		return bool ? 1 : -1;
	    return Class310.method5664(class606_sub1.aString10858,
				       class606_sub1_23_.aString10858,
				       Class539.aClass672_7171, 434523817);
	}
	if (4 == i)
	    return (class606_sub1.method10039((byte) 0)
		    ? class606_sub1_23_.method10039((byte) 0) ? 0 : 1
		    : class606_sub1_23_.method10039((byte) 0) ? -1 : 0);
	if (5 == i)
	    return (class606_sub1.method10043(-1119530237)
		    ? class606_sub1_23_.method10043(-406029778) ? 0 : 1
		    : class606_sub1_23_.method10043(188347338) ? -1 : 0);
	if (6 == i)
	    return (class606_sub1.method10040(-1625445775)
		    ? class606_sub1_23_.method10040(446653353) ? 0 : 1
		    : class606_sub1_23_.method10040(322785755) ? -1 : 0);
	if (i == 7)
	    return (class606_sub1.method10042(1978266010)
		    ? class606_sub1_23_.method10042(1792976999) ? 0 : 1
		    : class606_sub1_23_.method10042(1215989833) ? -1 : 0);
	if (8 == i) {
	    int i_27_ = -663639827 * class606_sub1.anInt10856;
	    int i_28_ = -663639827 * class606_sub1_23_.anInt10856;
	    if (bool) {
		if (1000 == i_27_)
		    i_27_ = -1;
		if (1000 == i_28_)
		    i_28_ = -1;
	    } else {
		if (i_27_ == -1)
		    i_27_ = 1000;
		if (-1 == i_28_)
		    i_28_ = 1000;
	    }
	    return i_27_ - i_28_;
	}
	return (class606_sub1.anInt10861 * 539448607
		- 539448607 * class606_sub1_23_.anInt10861);
    }
    
    static final void method5036(Class669 class669, int i) {
	throw new RuntimeException("");
    }
}
