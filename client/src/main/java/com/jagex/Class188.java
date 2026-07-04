/* Class188 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

class Class188 implements Interface24
{
    Class232 this$0;
    
    public void method147(Object object) {
	method3751((Interface70) object, (byte) 68);
    }
    
    void method3751(Interface70 interface70, byte i) {
	Iterator iterator = this$0.method4283((byte) -1).iterator();
	while (iterator.hasNext()) {
	    Class491 class491 = (Class491) iterator.next();
	    if (class491.method8040((byte) 47) == interface70) {
		class491.method8030((byte) -34);
		iterator.remove();
	    }
	}
    }
    
    Class188(Class232 class232) {
	this$0 = class232;
    }
    
    public void method146(Object object, int i) {
	method3751((Interface70) object, (byte) -28);
    }
    
    void method3752(Interface70 interface70) {
	Iterator iterator = this$0.method4283((byte) -1).iterator();
	while (iterator.hasNext()) {
	    Class491 class491 = (Class491) iterator.next();
	    if (class491.method8040((byte) 94) == interface70) {
		class491.method8030((byte) -23);
		iterator.remove();
	    }
	}
    }
    
    public static int method3753(Class534_Sub40 class534_sub40, String string,
				 byte i) {
	int i_0_ = class534_sub40.anInt10811 * 31645619;
	byte[] is = Class387.method6503(string, -2125277611);
	class534_sub40.method16542(is.length, -512461177);
	class534_sub40.anInt10811
	    += Class283.aClass267_3067.method4862(is, 0, is.length,
						  (class534_sub40
						   .aByteArray10810),
						  (class534_sub40.anInt10811
						   * 31645619),
						  1483296955) * -1387468933;
	return 31645619 * class534_sub40.anInt10811 - i_0_;
    }
    
    static final void method3754(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 1033849275 * class247.anInt2502;
    }
    
    public static Class695 method3755(byte i) {
	if (Class40.aClass695_308 == null)
	    return Class695.aClass695_8775;
	return Class40.aClass695_308;
    }
    
    static final void method3756(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class690_Sub1.method16830(class247, class243, class669, -555127875);
    }
    
    static final void method3757(Class669 class669, int i) {
	int i_1_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_1_, 1401338036);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_1_ >> 16];
	Class597.method9936(class247, class243, class669, 1795903867);
    }
}
