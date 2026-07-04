/* Class607 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class607 implements Interface76
{
    static Class607 aClass607_7989;
    static Class607 aClass607_7990;
    static Class607 aClass607_7991 = new Class607(0);
    static Class607 aClass607_7992;
    static Class607 aClass607_7993;
    static Class607 aClass607_7994;
    int anInt7995;
    
    public int method93() {
	return -368362051 * anInt7995;
    }
    
    public static Class607[] method10055() {
	return (new Class607[]
		{ aClass607_7993, aClass607_7992, aClass607_7990,
		  aClass607_7989, aClass607_7991, aClass607_7994 });
    }
    
    Class607(int i) {
	anInt7995 = -1772624491 * i;
    }
    
    public int method22() {
	return -368362051 * anInt7995;
    }
    
    static {
	aClass607_7989 = new Class607(1);
	aClass607_7990 = new Class607(2);
	aClass607_7992 = new Class607(3);
	aClass607_7993 = new Class607(4);
	aClass607_7994 = new Class607(5);
    }
    
    public static Class607[] method10056() {
	return (new Class607[]
		{ aClass607_7993, aClass607_7992, aClass607_7990,
		  aClass607_7989, aClass607_7991, aClass607_7994 });
    }
    
    public static Class607[] method10057() {
	return (new Class607[]
		{ aClass607_7993, aClass607_7992, aClass607_7990,
		  aClass607_7989, aClass607_7991, aClass607_7994 });
    }
    
    public int method53() {
	return -368362051 * anInt7995;
    }
    
    public static Class607[] method10058() {
	return (new Class607[]
		{ aClass607_7993, aClass607_7992, aClass607_7990,
		  aClass607_7989, aClass607_7991, aClass607_7994 });
    }
    
    static final void method10059(Class669 class669, int i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_0_, 867840810);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_0_ >> 16];
	Class255.method4653(class247, class243, class669, (byte) 44);
    }
    
    static final void method10060(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.anInt11101;
    }
    
    public static void method10061(int i) {
	if (Class277.aClass300_3049 != null)
	    Class277.aClass300_3049.method5530((byte) 0);
	if (null != Class334.aThread3512) {
	    for (;;) {
		try {
		    Class334.aThread3512.join();
		    break;
		} catch (InterruptedException interruptedexception) {
		    /* empty */
		}
	    }
	}
    }
    
    static final void method10062(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub19_10741
		   .method17051(-2075633262)
	       && Class254.aClass185_2683.method3534()) ? 1 : 0;
    }
    
    static final void method10063(Class669 class669, int i) {
	int i_1_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_1_, -289800401);
	Class519.method8647(class247, class669, 27167510);
    }
}
