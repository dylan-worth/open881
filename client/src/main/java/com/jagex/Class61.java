/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class61 implements Interface6
{
    Class aClass647;
    
    public Interface13 method60(int i, Interface14 interface14) {
	Interface13 interface13;
	try {
	    Interface13 interface13_0_ = (Interface13) aClass647.newInstance();
	    ((Interface7) interface13_0_).method67(i, 493883276);
	    interface13 = interface13_0_;
	} catch (Exception exception) {
	    exception.printStackTrace();
	    return null;
	}
	return interface13;
    }
    
    public Interface13 method58(int i, Interface14 interface14, byte i_1_) {
	Interface13 interface13;
	try {
	    Interface13 interface13_2_ = (Interface13) aClass647.newInstance();
	    ((Interface7) interface13_2_).method67(i, -1250265953);
	    interface13 = interface13_2_;
	} catch (Exception exception) {
	    exception.printStackTrace();
	    return null;
	}
	return interface13;
    }
    
    public Interface13 method64(int i, Interface14 interface14) {
	Interface13 interface13;
	try {
	    Interface13 interface13_3_ = (Interface13) aClass647.newInstance();
	    ((Interface7) interface13_3_).method67(i, 721840183);
	    interface13 = interface13_3_;
	} catch (Exception exception) {
	    exception.printStackTrace();
	    return null;
	}
	return interface13;
    }
    
    public Interface13 method63(int i, Interface14 interface14) {
	Interface13 interface13;
	try {
	    Interface13 interface13_4_ = (Interface13) aClass647.newInstance();
	    ((Interface7) interface13_4_).method67(i, -66947267);
	    interface13 = interface13_4_;
	} catch (Exception exception) {
	    exception.printStackTrace();
	    return null;
	}
	return interface13;
    }
    
    public Class method61() {
	return aClass647;
    }
    
    public Interface13 method62(int i, Interface14 interface14) {
	Interface13 interface13;
	try {
	    Interface13 interface13_5_ = (Interface13) aClass647.newInstance();
	    ((Interface7) interface13_5_).method67(i, 1466429003);
	    interface13 = interface13_5_;
	} catch (Exception exception) {
	    exception.printStackTrace();
	    return null;
	}
	return interface13;
    }
    
    public Class61(Class var_class) {
	aClass647 = var_class;
    }
    
    public Class method59(short i) {
	return aClass647;
    }
    
    static final void method1260(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class319.method5759(class247, class243, class669, 2001565081);
    }
    
    static final void method1261(int i, int i_6_, int i_7_, int i_8_, int i_9_,
				 int i_10_, byte i_11_) {
	Class99[] class99s = client.aClass99Array11053;
	for (int i_12_ = 0; i_12_ < class99s.length; i_12_++) {
	    Class99 class99 = class99s[i_12_];
	    if (null != class99 && 2 == class99.anInt1176 * 652406965) {
		Class159.method2612(1440315947 * class99.anInt1170,
				    class99.anInt1171 * 487170425,
				    631467137 * class99.anInt1172, 0,
				    440583934 * class99.anInt1173, false,
				    false, 762441224);
		if (client.aFloatArray11167[0] > -1.0F
		    && client.anInt11101 % 20 < 10) {
		    Class163 class163 = (Class510.aClass163Array5678
					 [class99.anInt1177 * -1562758755]);
		    int i_13_ = (int) (client.aFloatArray11167[0] + (float) i
				       - 12.0F);
		    int i_14_ = (int) (client.aFloatArray11167[1]
				       + (float) i_6_ - 28.0F);
		    class163.method2656(i_13_, i_14_);
		}
	    }
	}
    }
}
