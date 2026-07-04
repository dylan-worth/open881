/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class74 implements Interface13, Interface7
{
    public Class493[][] aClass493ArrayArray798;
    public Object[][] anObjectArrayArray799;
    public static Class472 aClass472_800;
    
    public void method67(int i, int i_0_) {
	/* empty */
    }
    
    void method1570(Class534_Sub40 class534_sub40, int i) {
	if (1 == i) {
	    int i_1_ = class534_sub40.method16527(-1479616070);
	    if (aClass493ArrayArray798 == null)
		aClass493ArrayArray798 = new Class493[i_1_][];
	    for (int i_2_ = class534_sub40.method16527(902499052); 255 != i_2_;
		 i_2_ = class534_sub40.method16527(570610982)) {
		int i_3_ = i_2_ & 0x7f;
		boolean bool = (i_2_ & 0x80) != 0;
		Class493[] class493s
		    = new Class493[class534_sub40.method16527(1319480745)];
		for (int i_4_ = 0; i_4_ < class493s.length; i_4_++)
		    class493s[i_4_]
			= ((Class493)
			   Class448.method7319(Class493.method8108((byte) -62),
					       class534_sub40
						   .method16546(-1706829710),
					       2088438307));
		aClass493ArrayArray798[i_3_] = class493s;
		if (bool) {
		    if (null == anObjectArrayArray799)
			anObjectArrayArray799
			    = new Object[aClass493ArrayArray798.length][];
		    anObjectArrayArray799[i_3_]
			= Class244.method4486(class534_sub40, class493s,
					      -831632114);
		}
	    }
	}
    }
    
    void method1571(Class534_Sub40 class534_sub40, int i, byte i_5_) {
	if (1 == i) {
	    int i_6_ = class534_sub40.method16527(-719241650);
	    if (aClass493ArrayArray798 == null)
		aClass493ArrayArray798 = new Class493[i_6_][];
	    for (int i_7_ = class534_sub40.method16527(-597665249);
		 255 != i_7_; i_7_ = class534_sub40.method16527(-1664616924)) {
		int i_8_ = i_7_ & 0x7f;
		boolean bool = (i_7_ & 0x80) != 0;
		Class493[] class493s
		    = new Class493[class534_sub40.method16527(-1147718481)];
		for (int i_9_ = 0; i_9_ < class493s.length; i_9_++)
		    class493s[i_9_]
			= ((Class493)
			   Class448.method7319(Class493.method8108((byte) 45),
					       class534_sub40
						   .method16546(-1706829710),
					       2088438307));
		aClass493ArrayArray798[i_8_] = class493s;
		if (bool) {
		    if (null == anObjectArrayArray799)
			anObjectArrayArray799
			    = new Object[aClass493ArrayArray798.length][];
		    anObjectArrayArray799[i_8_]
			= Class244.method4486(class534_sub40, class493s,
					      -82381808);
		}
	    }
	}
    }
    
    public void method82(int i) {
	/* empty */
    }
    
    public void method79(Class534_Sub40 class534_sub40, byte i) {
	for (;;) {
	    int i_10_ = class534_sub40.method16527(-816403365);
	    if (0 == i_10_)
		break;
	    method1571(class534_sub40, i_10_, (byte) 8);
	}
    }
    
    public void method80(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(-480947505);
	    if (0 == i)
		break;
	    method1571(class534_sub40, i, (byte) 8);
	}
    }
    
    public void method78(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(1160981989);
	    if (0 == i)
		break;
	    method1571(class534_sub40, i, (byte) 8);
	}
    }
    
    public void method81(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(-983266259);
	    if (0 == i)
		break;
	    method1571(class534_sub40, i, (byte) 8);
	}
    }
    
    Class74() {
	/* empty */
    }
    
    public void method84() {
	/* empty */
    }
    
    public void method66(int i) {
	/* empty */
    }
    
    public void method65(int i) {
	/* empty */
    }
    
    public void method83() {
	/* empty */
    }
    
    static final void method1572(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class321.method5775(class247, class243, class669, 652212518);
    }
    
    static final void method1573(Class669 class669, int i) {
	int i_11_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (!Class254.aClass185_2683.method3246())
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 3;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub27_10781
		      .method14026(i_11_, -2024064741);
    }
}
