/* Class489 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class489 implements Interface11
{
    public static Class534_Sub26 aClass534_Sub26_5312;
    public static Class163 aClass163_5313;
    
    public Object method74(Class534_Sub40 class534_sub40) {
	return Long.valueOf(class534_sub40.method16537(1359621443));
    }
    
    public Object method75(Class534_Sub40 class534_sub40, int i) {
	return Long.valueOf(class534_sub40.method16537(1359621443));
    }
    
    public Object method76(Class534_Sub40 class534_sub40) {
	return Long.valueOf(class534_sub40.method16537(1359621443));
    }
    
    public Object method77(Class534_Sub40 class534_sub40) {
	return Long.valueOf(class534_sub40.method16537(1359621443));
    }
    
    static final void method8001(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_0_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_1_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (-1308130767
	       * client.aClass492ArrayArray11027[i_1_][i_0_].anInt5340);
    }
    
    static final void method8002(Class669 class669, short i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	Class641.method10601(string, false, 662898023);
    }
    
    static void method8003(Class534_Sub40_Sub1 class534_sub40_sub1, byte i) {
	boolean bool = class534_sub40_sub1.method16527(298491773) == 1;
	if (bool) {
	    boolean bool_2_ = false;
	    int i_3_ = class534_sub40_sub1.method18290(1870383455) << 24;
	    i_3_ |= class534_sub40_sub1.method18290(297824481) << 16;
	    i_3_ |= class534_sub40_sub1.method18290(1894532061) << 8;
	    i_3_ |= class534_sub40_sub1.method18290(124089717);
	    Class640.aClass34_8337.method908((-5998193912056988893L
					      * Class690_Sub1.aLong10845),
					     i_3_, (byte) -77);
	}
    }
    
    static final void method8004(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class321.method5776(class247, class669, 1721472723);
    }
    
    public static void method8005(int i) {
	for (Class534_Sub18_Sub11 class534_sub18_sub11
		 = ((Class534_Sub18_Sub11)
		    Class72.aClass696_772.method14078(1221951837));
	     class534_sub18_sub11 != null;
	     class534_sub18_sub11
		 = ((Class534_Sub18_Sub11)
		    Class72.aClass696_772.method14080((byte) 74))) {
	    if (class534_sub18_sub11.anInt11795 * -475442105 > 1) {
		class534_sub18_sub11.anInt11795 = 0;
		Class72.aClass203_794.method3893(class534_sub18_sub11,
						 ((((Class534_Sub18_Sub7)
						    (class534_sub18_sub11
						     .aClass696_11794
						     .aClass534_Sub18_8785
						     .aClass534_Sub18_10510))
						   .aLong11709)
						  * -6387465159951953483L));
		class534_sub18_sub11.aClass696_11794.method14075(958896847);
	    }
	}
	Class72.anInt789 = 0;
	Class72.anInt765 = 0;
	Class72.aClass700_771.method14152(-1055072336);
	Class72.aClass9_768.method578((byte) -49);
	Class72.aClass696_772.method14075(958896847);
	Class72.aBool758 = false;
    }
    
    static final void method8006(Class669 class669, int i) {
	int i_4_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_4_, 1774959484);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_4_ >> 16];
	Class686.method13970(class247, class243, class669, 16474966);
    }
    
    static final void method8007(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (Class546.method8989(string, class669, -219410121) != null)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2461
	    = Class99.method1859(string, class669, 543916213);
	class247.aBool2561 = true;
    }
}
