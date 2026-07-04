/* Class455 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class455 implements Interface76
{
    public static Class455 aClass455_4959;
    public static Class455 aClass455_4960;
    public static Class455 aClass455_4961 = new Class455(0);
    int anInt4962;
    public static int anInt4963;
    
    public int method22() {
	return anInt4962 * -116544775;
    }
    
    public int method93() {
	return anInt4962 * -116544775;
    }
    
    Class455(int i) {
	anInt4962 = -1455098039 * i;
    }
    
    static {
	aClass455_4959 = new Class455(1);
	aClass455_4960 = new Class455(2);
    }
    
    public int method53() {
	return anInt4962 * -116544775;
    }
    
    public static Class455[] method7417() {
	return (new Class455[]
		{ aClass455_4961, aClass455_4960, aClass455_4959 });
    }
    
    public static Class455[] method7418() {
	return (new Class455[]
		{ aClass455_4961, aClass455_4960, aClass455_4959 });
    }
    
    static final void method7419(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	class247.anInt2496 = -1284996546;
	class247.aClass301_2635 = null;
	class247.anInt2497
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) * 931070365;
	if (-1 == class247.anInt2580 * 1365669833 && !class243.aBool2413)
	    Class626.method10366(-1278450723 * class247.anInt2454, 1584300797);
    }
    
    static final void method7420(Class669 class669, int i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class534_Sub18_Sub9 class534_sub18_sub9 = Class554.method9114(i_0_);
	if (null == class534_sub18_sub9) {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	} else {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= (36458189 * class534_sub18_sub9.anInt11770
		   - -192382841 * class534_sub18_sub9.anInt11763);
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= (class534_sub18_sub9.anInt11772 * 189160645
		   - class534_sub18_sub9.anInt11771 * -1004159431);
	}
    }
    
    static void method7421(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class288.method5272(480124286);
    }
    
    public static int method7422(int i, int i_1_) {
	int i_2_ = i >>> 1;
	i_2_ |= i_2_ >>> 1;
	i_2_ |= i_2_ >>> 2;
	i_2_ |= i_2_ >>> 4;
	i_2_ |= i_2_ >>> 8;
	i_2_ |= i_2_ >>> 16;
	return i & (i_2_ ^ 0xffffffff);
    }
    
    public static float method7423(float f, float f_3_, byte i) {
	double d = Math.atan2((double) f, (double) f_3_);
	if (d < 0.0)
	    d = 3.141592653589793 + d + 3.141592653589793;
	return (float) d;
    }
    
    static final void method7424(Class669 class669, int i) {
	int i_4_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = ((Class225)
	       client.aClass214_11359.method4074(729982004).get(i_4_))
		  .method4169(1106048132);
    }
}
