/* Class21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class21 implements Interface13, Interface7
{
    Object[][] anObjectArrayArray216;
    Class493[][] aClass493ArrayArray217;
    
    public Object[] method805(int i) {
	if (anObjectArrayArray216 == null)
	    return null;
	return anObjectArrayArray216[i];
    }
    
    public void method79(Class534_Sub40 class534_sub40, byte i) {
	for (;;) {
	    int i_0_ = class534_sub40.method16527(-773768360);
	    if (i_0_ == 0)
		break;
	    method807(class534_sub40, i_0_, -495586675);
	}
    }
    
    public Object[] method806(int i, int i_1_) {
	if (anObjectArrayArray216 == null)
	    return null;
	return anObjectArrayArray216[i];
    }
    
    void method807(Class534_Sub40 class534_sub40, int i, int i_2_) {
	if (3 == i) {
	    int i_3_ = class534_sub40.method16527(-1900318412);
	    if (null == anObjectArrayArray216) {
		anObjectArrayArray216 = new Object[i_3_][];
		aClass493ArrayArray217 = new Class493[i_3_][];
	    }
	    for (int i_4_ = class534_sub40.method16527(-1070264980);
		 255 != i_4_; i_4_ = class534_sub40.method16527(1282054539)) {
		int i_5_ = class534_sub40.method16527(-1194544763);
		Class493[] class493s = new Class493[i_5_];
		for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
		    class493s[i_6_]
			= ((Class493)
			   Class448.method7319(Class493.method8108((byte) 29),
					       class534_sub40
						   .method16546(-1706829710),
					       2088438307));
		anObjectArrayArray216[i_4_]
		    = Class244.method4486(class534_sub40, class493s,
					  -437685671);
		aClass493ArrayArray217[i_4_] = class493s;
	    }
	}
    }
    
    public void method82(int i) {
	/* empty */
    }
    
    Class21() {
	/* empty */
    }
    
    public void method66(int i) {
	/* empty */
    }
    
    public void method78(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(-1177111569);
	    if (i == 0)
		break;
	    method807(class534_sub40, i, -124447471);
	}
    }
    
    public void method81(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(1611945590);
	    if (i == 0)
		break;
	    method807(class534_sub40, i, -1935412886);
	}
    }
    
    void method808(Class534_Sub40 class534_sub40, int i) {
	if (3 == i) {
	    int i_7_ = class534_sub40.method16527(-833599092);
	    if (null == anObjectArrayArray216) {
		anObjectArrayArray216 = new Object[i_7_][];
		aClass493ArrayArray217 = new Class493[i_7_][];
	    }
	    for (int i_8_ = class534_sub40.method16527(-1882928778);
		 255 != i_8_; i_8_ = class534_sub40.method16527(450433256)) {
		int i_9_ = class534_sub40.method16527(1560022758);
		Class493[] class493s = new Class493[i_9_];
		for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
		    class493s[i_10_]
			= ((Class493)
			   Class448.method7319(Class493.method8108((byte) 20),
					       class534_sub40
						   .method16546(-1706829710),
					       2088438307));
		anObjectArrayArray216[i_8_]
		    = Class244.method4486(class534_sub40, class493s,
					  -1808455359);
		aClass493ArrayArray217[i_8_] = class493s;
	    }
	}
    }
    
    public void method84() {
	/* empty */
    }
    
    public void method80(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(-681668062);
	    if (i == 0)
		break;
	    method807(class534_sub40, i, -1408583831);
	}
    }
    
    public void method83() {
	/* empty */
    }
    
    public Object[] method809(int i) {
	if (anObjectArrayArray216 == null)
	    return null;
	return anObjectArrayArray216[i];
    }
    
    public Object[] method810(int i) {
	if (anObjectArrayArray216 == null)
	    return null;
	return anObjectArrayArray216[i];
    }
    
    public Object[] method811(int i) {
	if (anObjectArrayArray216 == null)
	    return null;
	return anObjectArrayArray216[i];
    }
    
    public void method67(int i, int i_11_) {
	/* empty */
    }
    
    public void method65(int i) {
	/* empty */
    }
    
    public static void method812(float f, Class438 class438, Class443 class443,
				 Class438 class438_12_, Class438 class438_13_,
				 Class438 class438_14_, float f_15_,
				 float f_16_, float f_17_, int i) {
	if (!class438_12_.method7056(class438)) {
	    Class438 class438_18_ = Class438.method6996(0.0F, 0.0F, 0.0F);
	    Class438 class438_19_
		= Class438.method6994(Class438.method7055(class438_12_,
							  class438));
	    class438_19_.method7021(class443);
	    Class438 class438_20_
		= Class438.method7055(class438_19_, class438_18_);
	    float f_21_ = class438_20_.method7012();
	    if (class438_14_.aFloat4864 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class438.aFloat4864) || f_21_ > f_16_
		|| f_21_ < f_17_) {
		class438.method6992(class438_12_);
		class438_13_.method6999();
	    } else {
		class443.method7182();
		Class438 class438_22_ = Class438.method6996(1.0F, 0.0F, 0.0F);
		Class438 class438_23_ = Class438.method6996(0.0F, 1.0F, 0.0F);
		Class438 class438_24_ = Class438.method6996(0.0F, 0.0F, 1.0F);
		class438_22_.method7021(class443);
		class438_23_.method7021(class443);
		class438_24_.method7021(class443);
		Class438 class438_25_
		    = Class438.method6996(Class438.method7027(class438_22_,
							      class438_13_),
					  Class438.method7027(class438_23_,
							      class438_13_),
					  Class438.method7027(class438_24_,
							      class438_13_));
		Class438 class438_26_ = Class438.method6994(class438_25_);
		Class438 class438_27_
		    = (Class438.method6996
		       (class438_14_.aFloat4864 * class438_20_.aFloat4864,
			class438_14_.aFloat4863 * class438_20_.aFloat4863,
			class438_14_.aFloat4865 * class438_20_.aFloat4865));
		class438_26_.method7086(class438_27_, f);
		class438_26_.method7042(f_15_);
		Class438 class438_28_
		    = Class438.method7020(class438_22_,
					  class438_26_.aFloat4864);
		class438_28_.method7086(class438_23_, class438_26_.aFloat4863);
		class438_28_.method7086(class438_24_, class438_26_.aFloat4865);
		class438_13_.method6992(class438_28_);
		class438.method7026(Class438.method7020(class438_13_, f));
	    }
	}
    }
    
    static String method813(Class534_Sub18_Sub7 class534_sub18_sub7, byte i) {
	if (class534_sub18_sub7.aString11710 == null
	    || class534_sub18_sub7.aString11710.length() == 0) {
	    if (class534_sub18_sub7.aString11708 != null
		&& class534_sub18_sub7.aString11708.length() > 0)
		return new StringBuilder().append
			   (class534_sub18_sub7.aString11699).append
			   (Class58.aClass58_461.method1245((Class539
							     .aClass672_7171),
							    (byte) -26))
			   .append
			   (class534_sub18_sub7.aString11708).toString();
	    return class534_sub18_sub7.aString11699;
	}
	if (null != class534_sub18_sub7.aString11708
	    && class534_sub18_sub7.aString11708.length() > 0)
	    return new StringBuilder().append
		       (class534_sub18_sub7.aString11699).append
		       (Class58.aClass58_461
			    .method1245(Class539.aClass672_7171, (byte) -20))
		       .append
		       (class534_sub18_sub7.aString11708).append
		       (Class58.aClass58_461
			    .method1245(Class539.aClass672_7171, (byte) -39))
		       .append
		       (class534_sub18_sub7.aString11710).toString();
	return new StringBuilder().append(class534_sub18_sub7.aString11699)
		   .append
		   (Class58.aClass58_461.method1245(Class539.aClass672_7171,
						    (byte) -118))
		   .append
		   (class534_sub18_sub7.aString11710).toString();
    }
}
