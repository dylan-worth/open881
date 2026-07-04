/* Class184 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;

public class Class184
{
    public static final int anInt1974 = 0;
    public static int[] anIntArray1975;
    public static final int anInt1976 = 16;
    public static final int anInt1977 = 32;
    public static final int anInt1978 = 16;
    public static final int anInt1979 = 8191;
    public static final int anInt1980 = 64;
    public static final int anInt1981 = 2;
    public static int[] anIntArray1982 = { 3, 7, 15 };
    public static final int anInt1983 = 1;
    public static final int anInt1984 = 0;
    public static final int anInt1985 = 2;
    public static final int anInt1986 = 8;
    public static final int anInt1987 = 1023;
    public static Class44_Sub6 aClass44_Sub6_1988;
    
    Class184() throws Throwable {
	throw new Error();
    }
    
    static {
	anIntArray1975 = new int[] { 2047, 16383, 65535 };
    }
    
    public static void method3220(boolean bool, byte i) {
	Class171_Sub4.aClass232_9944.method4270((byte) -1);
	if (Class44_Sub22.method17372(-1850530127 * client.anInt11039,
				      1243106688)) {
	    Class100[] class100s = client.aClass100Array11096;
	    for (int i_0_ = 0; i_0_ < class100s.length; i_0_++) {
		Class100 class100 = class100s[i_0_];
		class100.anInt1187 += -286235183;
		if (-351399119 * class100.anInt1187 < 50 && !bool)
		    return;
		class100.anInt1187 = 0;
		if (!class100.aBool1198
		    && class100.method1867(1457848335) != null) {
		    Class534_Sub19 class534_sub19
			= Class346.method6128(Class404.aClass404_4275,
					      class100.aClass13_1183,
					      1341391005);
		    class100.method1863(class534_sub19, (byte) 103);
		    try {
			class100.method1868(1805858475);
		    } catch (IOException ioexception) {
			class100.aBool1198 = true;
		    }
		}
	    }
	    Class171_Sub4.aClass232_9944.method4270((byte) -1);
	}
    }
    
    static final void method3221(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_1_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_2_
	    = class669.anIntArray8595[1 + 2088438307 * class669.anInt8600];
	if (null
	    != Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aClass631_12226)
	    Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aClass631_12226
		.method10441(i_1_, i_2_, 750823527);
    }
    
    static final void method3222(Class669 class669, byte i) {
	int i_3_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class534_Sub18_Sub9 class534_sub18_sub9 = Class554.method9114(i_3_);
	if (null == class534_sub18_sub9) {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	} else {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= class534_sub18_sub9.anInt11763 * -192382841;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= class534_sub18_sub9.anInt11771 * -1004159431;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 36458189 * class534_sub18_sub9.anInt11770;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= class534_sub18_sub9.anInt11772 * 189160645;
	}
    }
    
    static final void method3223(Class669 class669, byte i) {
	int i_4_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	int i_5_ = i_4_ >> 16;
	if (Class44_Sub11.aClass243Array11006[i_5_] == null)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -324599085 * (Class44_Sub11.aClass243Array11006[i_5_]
				.aClass247Array2412[i_4_].anInt2453);
    }
    
    static final void method3224(Class669 class669, int i) {
	Exception_Sub3.method17943((byte) 1);
    }
    
    static final void method3225(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class503.aString5626.startsWith("mac") ? 1 : 0;
    }
    
    static final void method3226(Class669 class669, byte i) {
	Class458.method7438(class669.aClass654_Sub1_Sub5_Sub1_8604,
			    (class669.anIntArray8595
			     [(class669.anInt8600 -= 308999563) * 2088438307]),
			    true, -656090575);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (int) client.aFloatArray11167[0];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (int) client.aFloatArray11167[1];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (int) client.aFloatArray11167[2];
    }
    
    public static void method3227(byte i) {
	if (Class5.aBool51) {
	    if (Class5.anInt40 * 2045011039 < 206492647 * Class619.anInt8108)
		Class5.anInt40 = Class619.anInt8108 * 1816624505;
	    while (2045011039 * Class5.anInt40
		   < -1664594981 * Class619.anInt8109) {
		Class606_Sub1 class606_sub1
		    = Class521.method8688(Class5.anInt40 * 2045011039,
					  -1576375142);
		if (null == class606_sub1
		    || -1 != class606_sub1.anInt10856 * -663639827)
		    Class5.anInt40 += 1148385183;
		else {
		    if (null == Class5.aClass641_44)
			Class5.aClass641_44
			    = (client.aClass648_11259.method10695
			       (class606_sub1.aString10857, -1465198730));
		    int i_6_ = -685874327 * Class5.aClass641_44.anInt8338;
		    if (-1 == i_6_)
			break;
		    class606_sub1.anInt10856 = i_6_ * 307950821;
		    Class5.anInt40 += 1148385183;
		    Class5.aClass641_44 = null;
		}
	    }
	}
    }
    
    public static void method3228
	(Class583 class583, int i, int i_7_,
	 Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1, int i_8_, int i_9_) {
	Class669 class669 = Class567.method9559((byte) -54);
	class669.aClass654_Sub1_Sub5_Sub1_8604 = class654_sub1_sub5_sub1;
	class669.anInt8610 = 436555041 * i_8_;
	Class244.method4484(class583, i, i_7_, class669, -136906685);
	class669.aClass654_Sub1_Sub5_Sub1_8604 = null;
	class669.anInt8610 = -436555041;
    }
    
    static final void method3229(Class669 class669, int i) {
	if (null != client.aString11038)
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= client.aString11038;
	else
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
    }
}
