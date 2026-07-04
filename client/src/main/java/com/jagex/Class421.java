/* Class421 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class421
{
    public static final int anInt4710 = 881;
    public static final int anInt4711 = 1;
    
    Class421() throws Throwable {
	throw new Error();
    }
    
    static final void method6780(Class669 class669, int i) {
	Class534_Sub36 class534_sub36
	    = ((Class534_Sub36)
	       (class669.anObjectArray8593
		[(class669.anInt8594 -= 1460193483) * 1485266147]));
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = -1203728391 * class534_sub36.anInt10798;
    }
    
    static final void method6781(Class669 class669, byte i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (-1050164879 * client.anInt11171 != 0
	    && i_0_ < 2103713403 * client.anInt11329) {
	    Class33 class33 = client.aClass33Array11299[i_0_];
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= class33.aString273;
	    if (null != class33.aString275)
		class669.anObjectArray8593
		    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		    = class33.aString275;
	    else
		class669.anObjectArray8593
		    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		    = "";
	} else {
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	}
    }
    
    static final void method6782(Class669 class669, int i) {
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub20_10742,
	     (class669.anIntArray8595
	      [(class669.anInt8600 -= 308999563) * 2088438307]),
	     1186901291);
	Class672.method11096((byte) 1);
	client.aBool11059 = true;
    }
    
    static boolean method6783(int i, byte i_1_) {
	if (i == 3 || i == 4 || 5 == i || 6 == i || i == 1001 || i == 1002)
	    return true;
	if (i == 2)
	    return true;
	return false;
    }
}
