/* Class341 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Date;
import java.util.Map;

public abstract class Class341 implements Interface6
{
    Map aMap3553;
    static int anInt3554;
    
    Class341(Map map) {
	aMap3553 = map;
    }
    
    static final void method5944(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	int i_0_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_1_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aClass631_12226
	    != null)
	    Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aClass631_12226
		.method10446
		(i_0_, i_1_, Class531.aClass44_Sub7_7135, 1247929541);
    }
    
    static final void method5945(Class669 class669, int i) {
	int i_2_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_2_, 261246928);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_2_ >> 16];
	Class637.method10557(class247, class243, class669, (byte) 32);
    }
    
    static final void method5946(Class669 class669, int i) {
	int i_3_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class534_Sub18_Sub19 class534_sub18_sub19
	    = Class618.aClass458_8101.method7433(i_3_, -1203343574);
	if (class534_sub18_sub19.anIntArray11893 == null)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= class534_sub18_sub19.anIntArray11893.length;
    }
    
    static final void method5947(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	int i_4_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	boolean bool
	    = (class669.anIntArray8595[2088438307 * class669.anInt8600 + 1]
	       == 1);
	Class41.method1060(i_4_, string, bool, -147276697);
    }
    
    public static void method5948(int[] is, int[] is_5_, int i) {
	if (null == is || is_5_ == null) {
	    Class331.anIntArray3497 = null;
	    Class174.anIntArray1838 = null;
	    Class452.aByteArrayArrayArray4944 = null;
	} else {
	    Class331.anIntArray3497 = is;
	    Class174.anIntArray1838 = new int[is.length];
	    Class452.aByteArrayArrayArray4944 = new byte[is.length][][];
	    for (int i_6_ = 0; i_6_ < Class331.anIntArray3497.length; i_6_++)
		Class452.aByteArrayArrayArray4944[i_6_]
		    = new byte[is_5_[i_6_]][];
	}
    }
    
    static final void method5949(Class247[] class247s, int i, int i_7_) {
	for (int i_8_ = 0; i_8_ < class247s.length; i_8_++) {
	    Class247 class247 = class247s[i_8_];
	    if (null != class247 && i == class247.anInt2472 * -742015869
		&& !client.method17394(class247)) {
		if (-1960530827 * class247.anInt2438 == 0) {
		    method5949(class247s, class247.anInt2454 * -1278450723,
			       -2029959959);
		    if (class247.aClass247Array2621 != null)
			method5949(class247.aClass247Array2621,
				   class247.anInt2454 * -1278450723,
				   -2132222911);
		    Class534_Sub37 class534_sub37
			= ((Class534_Sub37)
			   (client.aClass9_11224.method579
			    ((long) (-1278450723 * class247.anInt2454))));
		    if (class534_sub37 != null)
			Class210.method3956((1225863589
					     * class534_sub37.anInt10803),
					    1242948374);
		}
		if (class247.anInt2438 * -1960530827 == 6
		    && 1565138829 * class247.anInt2524 != -1) {
		    if (class247.aClass711_2442 == null) {
			class247.aClass711_2442 = new Class711_Sub2();
			class247.aClass711_2442.method14330((class247.anInt2524
							     * 1565138829),
							    1175120774);
		    }
		    if (class247.aClass711_2442.method14393((client.anInt11111
							     * -636695479),
							    (byte) 1)
			&& class247.aClass711_2442.method14343((byte) 1))
			class247.aClass711_2442.method14374(-1991837344);
		}
	    }
	}
    }
    
    static String method5950(long l) {
	return Class245.method4494(new Date(l), "EEE dd-MMM-yyyy HH:mm:ss zzz",
				   (byte) 90);
    }
}
