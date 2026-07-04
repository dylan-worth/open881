/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class55 implements Interface30
{
    public static Class44_Sub4 aClass44_Sub4_447;
    
    public Interface31 method179(Class296 class296, int i) {
	if (class296 == Class296.aClass296_3163)
	    return client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i];
	if (class296 == Class296.aClass296_3164) {
	    Class534_Sub6 class534_sub6
		= (Class534_Sub6) client.aClass9_11331.method579((long) i);
	    if (class534_sub6 != null)
		return (Interface31) class534_sub6.anObject10417;
	}
	return null;
    }
    
    public Interface31 method180(Class296 class296, int i, byte i_0_) {
	if (class296 == Class296.aClass296_3163)
	    return client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i];
	if (class296 == Class296.aClass296_3164) {
	    Class534_Sub6 class534_sub6
		= (Class534_Sub6) client.aClass9_11331.method579((long) i);
	    if (class534_sub6 != null)
		return (Interface31) class534_sub6.anObject10417;
	}
	return null;
    }
    
    Class55() {
	/* empty */
    }
    
    static void method1213(int i) {
	if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub39_10782
		.method17209((short) -685)
	    == 1)
	    Class159.aClass509_1754.method8388(new Class511((Class499
							     .aClass499_5600),
							    null),
					       -450495055);
	else {
	    client.aClass512_11100.method8441(-145033045);
	    Class561.method9444((byte) -119);
	}
    }
    
    static final void method1214(Class669 class669, int i) {
	int i_1_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (client.aString11300 != null
	    && i_1_ < -217094943 * Class455.anInt4963)
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= Class168.aClass98Array1792[i_1_].aString1162;
	else
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
    }
    
    static final void method1215(Class669 class669, byte i) {
	if (Class599.aClass298_Sub1_7871.method5388((byte) 36)
	    != Class305.aClass305_3265)
	    throw new RuntimeException();
	Class347_Sub1 class347_sub1
	    = ((Class347_Sub1)
	       Class599.aClass298_Sub1_7871.method5380((byte) -18));
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (int) ((double) class347_sub1.method15752(1096882797)
		     * 2607.5945876176133) & 0x3fff;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (int) ((double) class347_sub1.method15754(-714783691)
		     * 2607.5945876176133) & 0x3fff;
    }
    
    static final void method1216(Class669 class669, int i) {
	Class536_Sub1.method15934(class669.anIntArray8595[((class669.anInt8600
							    -= 308999563)
							   * 2088438307)],
				  -1, -1, false, 1909499025);
    }
}
